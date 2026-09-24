package com.nickuc.login;

public interface NLoginInterface_007 extends NLoginInterface_028 {
   @Override
   default boolean a(NLoginType_008 var1) {
      NLoginCore_495 var2 = var1.a();
      return this.a(var1, var2, var2.a());
   }

   boolean a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3);

   default boolean I() {
      return true;
   }

   @Override
   default void c(NLoginType_008 var1) {
      NLoginCore_495 var2 = var1.a();
      NLoginCore_459 var3 = var2.a();
      if (this.I()) {
         NLoginCore_459 var4 = NLoginCore_495.a(var1, var3.a(), true);

         try {
            this.a(var1, var2, var4);
         } finally {
            var4.c();
         }
      } else {
         this.a(var1, var2, var3);
      }
   }

   void a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3);
}
