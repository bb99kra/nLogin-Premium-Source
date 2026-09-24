package com.nickuc.login;

import lombok.Generated;

abstract class NLoginCore_531 implements NLoginInterface_012 {
   private final NLoginCore_211 aq;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_311 c;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_487 b;
   private static int c = 0 >>> 234 | 0 << -234;
   private static int e = (0 >>> 169 | 0 << -169) & -1;
   private static int b = Integer.reverse(0);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, this.b);
      NLoginCore_445[] var10001 = new NLoginCore_445[d];
      var10001[e] = NLoginCore_445.a;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   NLoginCore_531(NLoginCore_211 var1, NLoginCore_311 var2, NLoginCore_487 var3) {
      this.aq = var1;
      this.c = var2;
      this.b = var3;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      String var4 = this.c.aA();
      return (boolean)(this.c.d(var1) && this.c.aG() && (var4 == null || var2.i(var4)) && this.c.b(var3.a()) == null ? a : b);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.aq;
   }
}
