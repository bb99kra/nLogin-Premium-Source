package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_070 implements NLoginInterface_010, NLoginInterface_035 {
   private static int c = 0 >>> 125 | 0 << -125;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int i = Integer.reverse(0);
   private static int d = (0 >>> 183 | 0 << -183) & -1;
   private static int h = (16 >>> 164 | 16 << ~164 + 1) & -1;
   private final NLoginCore_211 ah;
   private static int f = Integer.reverse(0);
   private static int a = (73728 >>> 141 | 73728 << -141) & -1;
   private static int e = ('耀' >>> 'n' | 32768 << ~110 + 1) & -1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ah;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.r);
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.b;
      var10001[g] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   public NLoginCore_070(NLoginCore_211 var1) {
      this.ah = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_287.H[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).k((boolean)(var5 == NLoginCore_445.b ? h : i));
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().n() == a && var1.a().q() ? b : c);
   }
}
