package com.nickuc.login;

import java.net.URL;
import java.net.URLClassLoader;

public class NLoginCore_200 extends URLClassLoader {
   public NLoginCore_200(URL[] var1) {
      super(var1, ClassLoader.getSystemClassLoader().getParent());
   }

   static {
      ClassLoader.registerAsParallelCapable();
   }
}
