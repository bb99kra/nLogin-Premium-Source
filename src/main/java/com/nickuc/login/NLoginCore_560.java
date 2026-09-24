package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_560 implements NLoginInterface_010, NLoginInterface_035 {
   private static int c = (0 >>> 71 | 0 << -71) & -1;
   private final NLoginCore_211 ai;
   private static int a = Integer.reverse(-1879048192);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);
   private static int f = 0 >>> 171 | 0 << ~171 + 1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.l);
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.f;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ai;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().n() == a && var1.a().q() ? b : c);
   }

   @Generated
   public NLoginCore_560(NLoginCore_211 var1) {
      this.ai = var1;
   }
}
