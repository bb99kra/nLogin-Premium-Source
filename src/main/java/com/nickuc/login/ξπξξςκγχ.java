package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;

public class ξπξξςκγχ implements οεΦρΓψωΓξγΔι {
   private final θυυΔΓΨνεπς a = new θυυΔΓΨνεπς();
   private final boolean K;
   private final BukkitLoader b;

   @Override
   public void Y() {
      ξξψγξπιω.a(this.b);
   }

   @Override
   public απνηβηψθσΣγοξ a(Runnable var1, long var2, long var4, TimeUnit var6) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b, var2, var4, var6);
   }

   @Generated
   public ξπξξςκγχ(BukkitLoader var1, boolean var2) {
      this.b = var1;
      this.K = var2;
   }

   @Override
   public απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2, long var4, TimeUnit var6) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b, var2, var4, var6);
   }

   @Override
   public θυυΔΓΨνεπς a() {
      return this.a;
   }

   @Override
   public απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b);
   }

   @Override
   public απνηβηψθσΣγοξ a(Runnable var1) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b);
   }

   @Override
   public απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2, TimeUnit var4) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b, var2, var4);
   }

   @Override
   public απνηβηψθσΣγοξ a(Runnable var1, long var2, TimeUnit var4) {
      return new ξξψγξπιω(this.K, this.a, var1).a(this.b, var2, var4);
   }
}
