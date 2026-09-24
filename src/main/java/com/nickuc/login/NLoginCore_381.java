package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_381 implements NLoginInterface_039, NLoginInterface_044 {
   private static int b = (0 >>> 164 | 0 << -164) & -1;
   private static int d = Integer.reverse(0);
   private final NLoginCore_211 ak;
   private static int c = (0 >>> 51 | 0 << -51) & -1;
   private static int a = (0 >>> 183 | 0 << ~183 + 1) & -1;

   @Generated
   public NLoginCore_381(NLoginCore_211 var1) {
      this.ak = var1;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      var2.ad();
      return new GUIButtonContainer[a];
   }

   @Override
   public boolean at() {
      return (boolean)c;
   }

   @Override
   public boolean au() {
      return (boolean)d;
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (boolean)b;
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ak;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().an();
   }
}
