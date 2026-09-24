package com.nickuc.login;

import java.util.concurrent.TimeUnit;

public interface NLoginInterface_012 {
   default void b(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      NLoginCore_501 var4 = var3.d(NLoginCore_567.n);
      if (var4 == null) {
         throw new IllegalStateException(NLoginCore_451.B("ĩŋőŇŅŉńŃŗōŔŔćśŎŝŞŕŜŜďŞŠŦēŠŤŗśŝŝĚšūůĞ", (byte)46, 66) + var2.getName() + NLoginCore_559.E("ԋ", (byte)46, 69));
      } else {
         NLoginInterface_012 var5 = var4.b(var2, var3);
         if (var5 == null) {
            var3.a(NLoginCore_567.n);
            if (!(this instanceof NLoginCore_053) && (!(this instanceof NLoginInterface_039) || !((NLoginInterface_039)this).c(var1))) {
               NLoginCore_150.a(var2, NLoginCore_487.ae);
            }
         }

         if (this instanceof NLoginInterface_039 && !(var5 instanceof NLoginInterface_039)) {
            NLoginInterface_039 var6 = (NLoginInterface_039)this;
            if (var6.at()) {
               var3.a(NLoginCore_567.z);
               var3.a(NLoginCore_567.A);
               var2.o("");
            }

            if (!var6.c(var1)) {
               var2.ad();
               if (var5 != null) {
                  var3.a(NLoginCore_567.H, var5);
               }

               var1.b().a().a(var3.a(), var2, var3, var3.d(NLoginCore_567.s), var3.d(NLoginCore_567.u));
               return;
            }

            var3.a(NLoginCore_077.d, NLoginCore_077.c);
            var1.b().a().b(var2, var3);
         }

         if (var5 != null) {
            var5.c(var1, var2, var3);
         }
      }
   }

   default void c(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      this.a(var1, var2, var3, false);
   }

   default void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, boolean var4) {
      NLoginInterface_024 var5 = var3.a();
      this.a(var1, var2, var3, var5);
      int var6 = this.a(var4);
      if (var6 > 0) {
         var1.b(true).a(() -> {
            if (var2.R()) {
               if (this.a(var3)) {
                  var5.a(this.a().v(), this.a(var1, var2, var3, var5));
               }
            }
         }, (long)var6, TimeUnit.MILLISECONDS);
      } else {
         var5.a(this.a().v(), this.a(var1, var2, var3, var5));
      }
   }

   boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3);

   NLoginCore_211 a();

   default boolean a(NLoginCore_509 var1) {
      NLoginCore_501 var2 = var1.d(NLoginCore_567.n);
      return var2 != null && var2.b().a() == this.a();
   }

   GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4);

   default void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
   }

   default void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      this.b(var1, var2, var3);
   }

   default int a(boolean var1) {
      return var1 ? 1500 : 0;
   }
}
