package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_395 implements NLoginInterface_010, NLoginInterface_035 {
   private static int a = Integer.reverse(-1879048192);
   private static int b = 1048576 >>> 20 | 1048576 << -20;
   private static int g = 4096 >>> 236 | 4096 << ~236 + 1;
   private static int f = 0 >>> 80 | 0 << ~80 + 1;
   private static int c = Integer.reverse(0);
   private final NLoginCore_211 ae;
   private static int d = (0 >>> 95 | 0 << ~95 + 1) & -1;
   private static int e = 64 >>> 197 | 64 << ~197 + 1;
   private static int i = (0 >>> 66 | 0 << ~66 + 1) & -1;
   private static int h = (64 >>> 102 | 64 << -102) & -1;

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().n() == a && var1.a().q() ? b : c);
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.q);
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.b;
      var10001[g] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   public NLoginCore_395(NLoginCore_211 var1) {
      this.ae = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_499.E[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).j((boolean)(var5 == NLoginCore_445.b ? h : i));
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ae;
   }
}
