package com.nickuc.login;

import com.nickuc.login.lib.argon2.Argon2;
import lombok.Generated;

abstract class NLoginCore_491 implements NLoginInterface_009 {
   private static int b = Integer.reverse(2097152);
   private final Argon2 a;
   private static int a = (4 >>> 216 | 4 << -216) & -1;

   @Override
   public boolean v(String var1) {
      return this.a.needsRehash(var1, NLoginCore_477.af.r(), NLoginCore_477.ag.r() * b, NLoginCore_477.ah.r());
   }

   @Generated
   protected NLoginCore_491(Argon2 var1) {
      this.a = var1;
   }

   @Override
   public boolean i(String var1, String var2) {
      return this.a.verify(var2, var1.toCharArray());
   }

   @Override
   public String w(String var1) {
      return this.a.hash(NLoginCore_477.af.r(), NLoginCore_477.ag.r() * a, NLoginCore_477.ah.r(), var1.toCharArray());
   }
}
