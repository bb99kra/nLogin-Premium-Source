package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.bukkit.nLoginBukkit;
import lombok.Generated;

public class δςμθγκΓγΨληνυΠ implements ΔοΓκωΠαλξφιΩθ {
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int c = (64 >>> 70 | 64 << -70) & -1;
   private final nLoginBukkit m;
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);

   public θορβπμοζ a() {
      return new θορβπμοζ(this.m);
   }

   @Override
   public void c() {
   }

   @Override
   public nLoginAPI a() {
      return new ωδπηξιΓΣφΨΔρΓΓ(this.m);
   }

   @Override
   public ΛΠπδσηδωαΠαΓκρ a() {
      return new τμδχΣλβΦκα(this.m);
   }

   @Generated
   public δςμθγκΓγΨληνυΠ(nLoginBukkit var1) {
      this.m = var1;
   }

   @Override
   public ΓΠεψςμδςΦυορΓρπ a() {
      return new αοΛσφψΦε(this.m.b(), this.m, (boolean)c);
   }

   @Override
   public boolean a() {
      return δψφΨσψελΓ.a(this.m, (boolean)b);
   }

   @Override
   public void b() {
      ΨγημιδξΓτοθαζ var1 = this.m.a();
      this.m.b().c().forEach(var0 -> var0.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.p, var0)));
      γΦςθδψεγωΩχωκτξ.a(this.m, (boolean)a);
      this.m.a().n();
   }
}
