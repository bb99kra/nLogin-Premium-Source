package com.nickuc.login;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import net.md_5.bungee.api.plugin.Plugin;

public class NLoginCore_061 implements NLoginInterface_022 {
   private final Plugin a;
   private final NLoginCore_578 c = new NLoginCore_578();

   public NLoginCore_403 a(Consumer<NLoginInterface_048> var1, long var2, TimeUnit var4) {
      return new NLoginCore_403(this.c, var1).a(this.a, var2, var4);
   }

   @Override
   public NLoginCore_578 a() {
      return this.c;
   }

   @Override
   public void Y() {
      this.a.getProxy().getScheduler().cancel(this.a);
   }

   public NLoginCore_403 a(Runnable var1, long var2, TimeUnit var4) {
      return new NLoginCore_403(this.c, var1).a(this.a, var2, var4);
   }

   public NLoginCore_403 a(Runnable var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_403(this.c, var1).a(this.a, var2, var4, var6);
   }

   public NLoginCore_403 a(Runnable var1) {
      return new NLoginCore_403(this.c, var1).a(this.a);
   }

   @Generated
   public NLoginCore_061(Plugin var1) {
      this.a = var1;
   }

   public NLoginCore_403 a(Consumer<NLoginInterface_048> var1) {
      return new NLoginCore_403(this.c, var1).a(this.a);
   }

   public NLoginCore_403 a(Consumer<NLoginInterface_048> var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_403(this.c, var1).a(this.a, var2, var4, var6);
   }
}
