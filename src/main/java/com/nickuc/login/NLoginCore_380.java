package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_380 implements NLoginInterface_022 {
   private final NLoginCore_578 b = new NLoginCore_578();
   private final BukkitLoader c;
   private static int a = 0 >>> 63 | 0 << ~63 + 1;
   @Nullable
   private final Player b;
   private final boolean N;

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, TimeUnit var4) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c, var2, var4);
   }

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c, var2, var4, var6);
   }

   @Generated
   private NLoginCore_380(BukkitLoader var1, @Nullable Player var2, boolean var3) {
      this.c = var1;
      this.b = var2;
      this.N = var3;
   }

   public NLoginCore_380(BukkitLoader var1, boolean var2) {
      this(var1, null, var2);
   }

   @Override
   public void Y() {
      NLoginCore_079.a(this.c);
   }

   public NLoginCore_380(BukkitLoader var1, @Nullable Player var2) {
      this(var1, var2, (boolean)a);
   }

   @Override
   public NLoginCore_578 a() {
      return this.b;
   }

   @Override
   public NLoginInterface_048 a(Runnable var1) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c);
   }

   @Override
   public NLoginInterface_048 a(Runnable var1, long var2, TimeUnit var4) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c, var2, var4);
   }

   @Override
   public NLoginInterface_048 a(Runnable var1, long var2, long var4, TimeUnit var6) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c, var2, var4, var6);
   }

   @Override
   public NLoginInterface_048 a(Consumer<NLoginInterface_048> var1) {
      return new NLoginCore_079(this.b, this.N, this.b, var1).a(this.c);
   }
}
