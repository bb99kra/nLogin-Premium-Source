package com.nickuc.login;

public interface NLoginInterface_042 extends NLoginInterface_004 {
   default NLoginCore_231 a() {
      return this instanceof NLoginCore_277 ? NLoginCore_231.a : NLoginCore_231.b;
   }

   String getName();

   void k(String var1);

   default void g(String var1, Object... var2) {
      this.k(String.format(var1, var2));
   }

   boolean i(String var1);
}
