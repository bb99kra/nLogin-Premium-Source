package patcher;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

public final class NLoginDependencyBootstrap {
   private NLoginDependencyBootstrap() {
   }

   public static void install(Object var0) {
      try {
         File var1 = getLibDir(var0);
         if (!var1.isDirectory()) {
            var1.mkdirs();
         }
      } catch (Throwable var2) {
         throw new RuntimeException("Failed to prepare nLogin lib dir", var2);
      }
   }

   public static Object prepareLoader(Object var0, Object var1) {
      try {
         install(var0);
         Method var2 = var1.getClass().getMethod("addJarToClasspath", URL.class);
         File var3 = getLibDir(var0);
         File[] var4 = var3.listFiles((var0x, var1x) -> var1x.endsWith(".jar"));
         if (var4 != null) {
            for (File var8 : var4) {
               var2.invoke(var1, var8.toURI().toURL());
            }
         }

         return var1;
      } catch (Throwable var9) {
         throw new RuntimeException("Failed to attach nLogin dependencies from disk", var9);
      }
   }

   private static File invokeFile(Object var0, String var1) throws Exception {
      Method var2 = var0.getClass().getMethod(var1);
      return (File)var2.invoke(var0);
   }

   private static File getLibDir(Object var0) throws Exception {
      File var1 = invokeFile(var0, "getDataFolder").getParentFile();
      File var2 = new File(var1, "nCore/libraries/nlogin");
      if (!var2.exists() && !var2.mkdirs()) {
         throw new IOException("Failed to create " + var2);
      } else {
         return var2;
      }
   }
}
