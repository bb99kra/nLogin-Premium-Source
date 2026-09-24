package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import lombok.Generated;

public class ΔΣωιψΩςΓΛνζ {
   private final Cache<String, Long> h;
   private static int a = (256 >>> 40 | 256 << -40) & -1;
   private static int b = (0 >>> 75 | 0 << -75) & -1;

   @Generated
   public ΔΣωιψΩςΓΛνζ(Cache<String, Long> var1) {
      this.h = var1;
   }

   public static boolean a(String var0, Cache<String, Long> var1) {
      long var2 = System.currentTimeMillis();
      long var4 = (Long)var1.get(var0, var2x -> var2);
      return (boolean)(var4 == var2 ? a : b);
   }

   public boolean s(String var1) {
      return a(var1, this.h);
   }
}
