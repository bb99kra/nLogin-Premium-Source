package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;

public class NLoginCore_386 implements NLoginInterface_022 {
   private final VelocityLoader b;
   private final NLoginCore_578 d = new NLoginCore_578();

   public NLoginCore_261 a(Runnable var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_261(this.d, var1).a(this.b, var2, var4, var6);
   }

   public NLoginCore_261 a(Consumer<NLoginInterface_048> var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_261(this.d, var1).a(this.b, var2, var4, var6);
   }

   @Override
   public void Y() {
      this.f().forEach(NLoginInterface_048::Z);
   }

   public NLoginCore_261 a(Consumer<NLoginInterface_048> var1, long var2, TimeUnit var4) {
      return new NLoginCore_261(this.d, var1).a(this.b, var2, var4);
   }

   @Generated
   public NLoginCore_386(VelocityLoader var1) {
      this.b = var1;
   }

   public NLoginCore_261 a(Consumer<NLoginInterface_048> var1) {
      return new NLoginCore_261(this.d, var1).a(this.b);
   }

   public NLoginCore_261 a(Runnable var1) {
      return new NLoginCore_261(this.d, var1).a(this.b);
   }

   @Override
   public NLoginCore_578 a() {
      return this.d;
   }

   public NLoginCore_261 a(Runnable var1, long var2, TimeUnit var4) {
      return new NLoginCore_261(this.d, var1).a(this.b, var2, var4);
   }
}
