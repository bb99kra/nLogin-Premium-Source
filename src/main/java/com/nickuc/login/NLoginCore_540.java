package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;

public class NLoginCore_540 implements NLoginInterface_022 {
   private final NLoginCore_578 a = new NLoginCore_578();
   private final boolean K;
   private final BukkitLoader b;

   @Override
   public void Y() {
      NLoginCore_094.a(this.b);
   }

   @Override
   public NLoginInterface_048 a(Runnable var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b, var2, var4, var6);
   }

   @Generated
   public NLoginCore_540(BukkitLoader var1, boolean var2) {
      this.b = var1;
      this.K = var2;
   }

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b, var2, var4, var6);
   }

   @Override
   public NLoginCore_578 a() {
      return this.a;
   }

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b);
   }

   @Override
   public NLoginInterface_048 a(Runnable var1) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b);
   }

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, TimeUnit var4) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b, var2, var4);
   }

   @Override
   public NLoginInterface_048 a(Runnable var1, long var2, TimeUnit var4) {
      return new NLoginCore_094(this.K, this.a, var1).a(this.b, var2, var4);
   }
}
