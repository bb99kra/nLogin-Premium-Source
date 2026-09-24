package com.nickuc.login;

import java.net.URL;
import java.net.URLClassLoader;

public class ΔΦξΩΣαγλθεΓβχ extends URLClassLoader {
   public ΔΦξΩΣαγλθεΓβχ(URL[] var1) {
      super(var1, ClassLoader.getSystemClassLoader().getParent());
   }

   static {
      ClassLoader.registerAsParallelCapable();
   }
}
