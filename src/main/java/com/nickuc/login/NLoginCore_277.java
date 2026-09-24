package com.nickuc.login;

import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public interface NLoginCore_277 extends NLoginInterface_042 {
   NLoginInterface_023 a();

   boolean R();

   default String ac() {
      return this.b().getAddress().getHostAddress();
   }

   void n(String var1);

   void a(String var1, String var2, int var3, int var4, int var5);

   @Nullable
   InetSocketAddress a();

   NLoginInterface_022 a();

   boolean S();

   @Override
   default void k(String var1) {
      this.d(var1);
   }

   default InetSocketAddress b() {
      InetSocketAddress var1 = this.a();
      if (var1 == null) {
         throw new IllegalArgumentException(NLoginCore_433.A("ĖĺĻŊľōŎüŒŌŀŖłŋŏŅŇŒŌĈŏřŝČ", (byte)43, 65) + this);
      } else {
         return var1;
      }
   }

   void p(String var1);

   UUID a();

   void d(Object var1);

   @Override
   <T> T c();

   Optional<String> a();

   int h();

   void l(String var1);

   void o(String var1);

   CompletableFuture<Void> a(String var1);

   String u();

   void a(NLoginInterface_011<?> var1, NLoginCore_337 var2, Object var3, byte[] var4);

   void ad();
}
