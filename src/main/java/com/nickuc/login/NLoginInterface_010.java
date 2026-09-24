package com.nickuc.login;

public interface NLoginInterface_010 extends NLoginInterface_039 {
   @Override
   default boolean c(NLoginType_008 var1) {
      return var1.a().p();
   }

   @Override
   default boolean at() {
      return false;
   }

   default NLoginCore_283 a(NLoginCore_509 var1) {
      return var1.a(NLoginCore_567.o, var0 -> NLoginCore_283.a());
   }
}
