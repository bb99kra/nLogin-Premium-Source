package com.nickuc.login;

public class NLoginCore_426 {
   private static NLoginInterface_001 a;

   static NLoginInterface_001 a() {
      return a;
   }

   static {
      try {
         a = new NLoginCore_534();
      } catch (ReflectiveOperationException var1) {
      }

      if (a == null) {
         a = (var0, var1x) -> {};
      }
   }
}
