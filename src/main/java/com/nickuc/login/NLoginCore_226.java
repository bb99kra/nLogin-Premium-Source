package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_226 implements NLoginInterface_039 {
   private static int h = Integer.reverse(1073741824);
   private static int f = Integer.reverse(0);
   private static int b = (0 >>> 220 | 0 << ~220 + 1) & -1;
   private static int i = (0 >>> 126 | 0 << -126) & -1;
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int a = 0 >>> 90 | 0 << ~90 + 1;
   private static int k = (0 >>> 0 | 0 << -0) & -1;
   private static int c = (0 >>> 192 | 0 << -192) & -1;
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);
   private static int g = (0 >>> 62 | 0 << -62) & -1;
   private final NLoginCore_211 an;

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.an;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_052.J[var5.ordinal()]) {
         case 1:
            NLoginCore_073.a(var1, var3.d(), var2.b().getAddress(), NLoginCore_184.c);
            var3.a(NLoginCore_567.n);
            var2.a(NLoginCore_150.a(NLoginCore_487.s, var2));
            break;
         case 2:
            NLoginCore_073.a(var1, var3.d(), var2.b().getAddress(), NLoginCore_184.d);
            NLoginInterface_039.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean at() {
      return (boolean)m;
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (boolean)l;
   }

   @Generated
   public NLoginCore_226(NLoginCore_211 var1) {
      this.an = var1;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_487.ag);
      NLoginCore_445[] var10001 = new NLoginCore_445[h];
      var10001[i] = NLoginCore_445.d;
      var10001[j] = NLoginCore_445.e;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (!NLoginCore_329.c.ar()) {
         return (boolean)a;
      } else if (!NLoginCore_329.n.ar()) {
         return (boolean)b;
      } else if (!NLoginCore_329.d.ar()) {
         return (boolean)c;
      } else {
         ForceRegisterConfig var4 = var3.a();
         if (var4.h() && !var4.t()) {
            return (boolean)(NLoginCore_073.a(var3.d(), var2.b().getAddress()) == NLoginCore_184.b ? e : f);
         } else {
            return (boolean)d;
         }
      }
   }
}
