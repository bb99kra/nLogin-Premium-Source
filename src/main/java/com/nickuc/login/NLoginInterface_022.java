package com.nickuc.login;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public interface NLoginInterface_022 {
   NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, TimeUnit var4);

   NLoginInterface_048 a(Runnable var1, long var2, TimeUnit var4);

   default Collection<NLoginInterface_048> f() {
      return this.a().e();
   }

   NLoginInterface_048 a(Runnable var1, long var2, long var4, TimeUnit var6);

   NLoginInterface_048 a(Runnable var1);

   NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, long var4, TimeUnit var6);

   NLoginInterface_048 a(Consumer<NLoginInterface_048> var1);

   default NLoginInterface_048 a(Runnable var1, long var2, long var4) {
      return this.a(var1, var2, var4, TimeUnit.MILLISECONDS);
   }

   NLoginCore_578 a();

   default NLoginInterface_048 a(Runnable var1, long var2) {
      return this.a(var1, var2, TimeUnit.MILLISECONDS);
   }

   void Y();

   default boolean a(int var1, TimeUnit var2) {
      return this.a().a(var1, var2);
   }

   default NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, long var4) {
      return this.a(var1, var2, var4, TimeUnit.MILLISECONDS);
   }

   default NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2) {
      return this.a(var1, var2, TimeUnit.MILLISECONDS);
   }
}
