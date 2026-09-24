package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_421 implements NLoginInterface_010, NLoginInterface_035 {
   private static int c = (0 >>> 186 | 0 << ~186 + 1) & -1;
   private static int a = 576 >>> 6 | 576 << ~6 + 1;
   private static int f = Integer.reverse(0);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int g = 8388608 >>> 23 | 8388608 << -23;
   private final NLoginCore_211 af;
   private static int d = 0 >>> 128 | 0 << -128;
   private static int e = Integer.reverse(1073741824);

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.af;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().n() == a && var1.a().q() ? b : c);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_347.F[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).a(var5 == NLoginCore_445.b ? NLoginCore_555.e : NLoginCore_555.d);
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.o);
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.b;
      var10001[g] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   public NLoginCore_421(NLoginCore_211 var1) {
      this.af = var1;
   }
}
