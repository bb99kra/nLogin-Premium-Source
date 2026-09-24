package com.nickuc.login;

public class NLoginCore_117 {
   private static NLoginInterface_033 a;

   static NLoginInterface_033 a() {
      return a;
   }

   static {
      try {
         a = new NLoginCore_512();
      } catch (ReflectiveOperationException var2) {
      }

      try {
         if (a == null) {
            a = new NLoginCore_032();
         }
      } catch (ReflectiveOperationException var1) {
      }

      if (a == null) {
         a = new NLoginCore_356();
      }
   }
}
