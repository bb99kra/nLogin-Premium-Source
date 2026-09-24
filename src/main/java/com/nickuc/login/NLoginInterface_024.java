package com.nickuc.login;

import javax.annotation.Nullable;

public interface NLoginInterface_024 {
   void a(int var1, GUIButtonContainer[] var2);

   default void a(String var1) {
      this.a(var1, null, null, null, null);
   }

   static NLoginInterface_024 a(NLoginType_008 var0, NLoginCore_277 var1, NLoginCore_509 var2) {
      return new NLoginCore_541(var1, var2, var0.b());
   }

   default void c(String var1, String var2, String var3) {
      this.a(var1, var2, null, var3, null);
   }

   void a(String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5);

   default void a(String var1, String var2, String var3) {
      if (!var3.isEmpty() && var3.charAt(0) != '/') {
         var3 = '/' + var3;
      }

      this.a(var1, var2, var3, null, null);
   }

   default void e(String var1, String var2) {
      this.a(var1, null, var2);
   }

   default void d(String var1, String var2) {
      this.a(var1, var2, null, null, null);
   }

   void c(String var1, String var2);

   default void g(String var1, String var2) {
      this.a(var1, null, null, var2, null);
   }

   NLoginCore_277 a();

   default void d(String var1, String var2, String var3) {
      this.a(var1, var2, null, null, var3);
   }

   default void f(String var1, String var2) {
      this.a(var1, null, var2, null, null);
   }

   default void b(String var1, String var2, String var3) {
      this.a(var1, var2, var3, null, null);
   }
}
