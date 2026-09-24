package com.nickuc.login.loader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

public class MemClassLoader extends URLClassLoader {
   private final Map<String, byte[]> classMap = new ConcurrentHashMap<>();
   private final Map<String, byte[]> resourceMap = new ConcurrentHashMap<>();
   private final ClassLoader parent;
   private Collection<String> excludeIsolation;

   public MemClassLoader(ClassLoader parent) throws LoadingException {
      super(new URL[0], parent.getParent() != null ? parent.getParent() : ClassLoader.getSystemClassLoader());
      this.parent = parent;
      this.init();
   }

   public ClassLoader getParentLoader() {
      return this.parent;
   }

   public void configureFilter(Collection<String> excludeIsolation) {
      this.excludeIsolation = excludeIsolation;
   }

   public void addJarToClasspath(URL url) {
      this.addURL(url);
   }

   public void addClass(String classPath, byte[] content) {
      this.classMap.put(classPath, content);
   }

   @Override
   protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
      if (this.excludeIsolation != null && this.excludeIsolation.stream().anyMatch(name::startsWith)) {
         try {
            Class<?> clazz;
            if ((clazz = this.parent.loadClass(name)) != null) {
               return clazz;
            }
         } catch (ClassNotFoundException var6) {
         }
      }

      try {
         Class<?> clazz;
         if ((clazz = super.loadClass(name, resolve)) != null) {
            return clazz;
         }
      } catch (ClassNotFoundException var5) {
      }

      return this.parent.loadClass(name);
   }

   @Override
   protected Class<?> findClass(String className) throws ClassNotFoundException {
      byte[] classBytes = this.classMap.remove(className);
      return classBytes != null ? this.defineClass(className, classBytes, 0, classBytes.length) : super.findClass(className);
   }

   public InputStream getInJarResourceAsStream(String resourcePath) {
      if (resourcePath.isEmpty()) {
         throw new IllegalStateException("Resource path cannot be empty!");
      } else {
         byte[] resourceBytes = this.resourceMap.get(resourcePath);
         return (InputStream)(resourceBytes != null ? new ByteArrayInputStream(resourceBytes) : super.getResourceAsStream(resourcePath));
      }
   }

   @Override
   public InputStream getResourceAsStream(String resourcePath) {
      return this.getInJarResourceAsStream(resourcePath);
   }

   public <T> LoaderBootstrap createLoader(String bootstrapClass, Class<T> loaderPluginType, T loaderPlugin) throws LoadingException {
      Class<? extends LoaderBootstrap> plugin;
      try {
         plugin = this.loadClass(bootstrapClass).asSubclass(LoaderBootstrap.class);
      } catch (ReflectiveOperationException var9) {
         throw new LoadingException("Unable to load bootstrap class", var9);
      }

      Constructor<? extends LoaderBootstrap> constructor;
      try {
         constructor = plugin.getConstructor(loaderPluginType);
      } catch (ReflectiveOperationException var8) {
         throw new LoadingException("Unable to get bootstrap constructor", var8);
      }

      try {
         return constructor.newInstance(loaderPlugin);
      } catch (ReflectiveOperationException var7) {
         throw new LoadingException("Unable to create bootstrap plugin instance", var7);
      }
   }

   private void init() throws LoadingException {
      try {
         InputStream resource = this.parent.getResourceAsStream(this.getClass().getPackage().getName().replace('.', '/') + "/plugin.jar");

         try {
            if (resource == null) {
               throw new LoadingException("Corrupted jar!");
            }

            ZipInputStream zis = new ZipInputStream(resource);

            try {
               ByteArrayOutputStream out = new ByteArrayOutputStream();
               byte[] buf = new byte[8192];

               ZipEntry zipEntry;
               while ((zipEntry = zis.getNextEntry()) != null) {
                  if (!zipEntry.isDirectory()) {
                     int length;
                     while ((length = zis.read(buf)) > 0) {
                        out.write(buf, 0, length);
                     }

                     byte[] zipEntryBytes = out.toByteArray();
                     String entryName = zipEntry.getName();
                     boolean isClass = entryName.endsWith(".class");
                     if (isClass) {
                        String classPath = entryName.replace('/', '.').substring(0, entryName.length() - ".class".length());
                        this.addClass(classPath, zipEntryBytes);
                     } else {
                        this.resourceMap.put(entryName, zipEntryBytes);
                     }

                     out.reset();
                  }
               }
            } finally {
               if (Collections.singletonList(zis).get(0) != null) {
                  zis.close();
               }
            }
         } finally {
            if (Collections.singletonList(resource).get(0) != null) {
               resource.close();
            }
         }
      } catch (ZipException var23) {
         throw new LoadingException("ZIP exception", var23);
      } catch (IOException var24) {
         throw new LoadingException("IO exception", var24);
      }
   }

   static {
      ClassLoader.registerAsParallelCapable();
   }
}
