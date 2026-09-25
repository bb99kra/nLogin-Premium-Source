package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_119 implements NLoginInterface_010, NLoginInterface_035 {
   private static int h = (8 >>> 99 | 8 << ~99 + 1) & -1;
   private static int a = (36 >>> 226 | 36 << ~226 + 1) & -1;
   private static int d = (0 >>> 151 | 0 << -151) & -1;
   private final NLoginCore_211 ag;
   private static int f = 0 >>> 31 | 0 << -31;
   private static int i = (0 >>> 151 | 0 << -151) & -1;
   private static int e = 268435456 >>> 123 | 268435456 << -123;
   private static int c = 0 >>> 179 | 0 << -179;
   private static int b = (4 >>> 34 | 4 << ~34 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return ((var1.a() != 0).n() == a && var1.a().q() ? b : c);
   }

   @Generated
   public NLoginCore_119(NLoginCore_211 var1) {
      this.ag = var1;
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ag;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.s);
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.b;
      var10001[g] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_320.G[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).l(((var5 == NLoginCore_445.b ? h : i) != 0));
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }
}
