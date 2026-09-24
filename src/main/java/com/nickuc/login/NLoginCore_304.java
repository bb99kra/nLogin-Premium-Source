package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_304 implements NLoginInterface_039 {
   private static int j = Integer.reverse(0);
   private static int q = Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << -95;
   private static int g = Integer.reverse(1073741824);
   private static int l = 0 >>> 206 | 0 << -206;
   private static int h = (0 >>> 18 | 0 << ~18 + 1) & -1;
   private static int p = 32 >>> 37 | 32 << -37;
   private static int e = Integer.reverse(0);
   private static int f = 0 >>> 42 | 0 << -42;
   private static int i = 1048576 >>> 116 | 1048576 << -116;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int b = Integer.reverse(0);
   private static int a = (0 >>> 244 | 0 << ~244 + 1) & -1;
   private static int d = 131072 >>> 241 | 131072 << ~241 + 1;
   private final NLoginCore_211 al;
   private static int n = 536870912 >>> 221 | 536870912 << -221;
   private static int c = Integer.reverse(0);
   private static int m = Integer.reverse(0);
   private static int o = Integer.reverse(0);

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.al;
   }

   @Generated
   public NLoginCore_304(NLoginCore_211 var1) {
      this.al = var1;
   }

   @Override
   public boolean at() {
      return (boolean)q;
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (boolean)p;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_487.af);
      NLoginCore_445[] var10001 = new NLoginCore_445[g];
      var10001[h] = NLoginCore_445.b;
      var10001[i] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (!NLoginCore_329.c.ar()) {
         return (boolean)a;
      } else if (!NLoginCore_329.n.ar()) {
         return (boolean)b;
      } else if (NLoginCore_329.d.ar()) {
         return (boolean)c;
      } else {
         ForceRegisterConfig var4 = var3.a();
         return (boolean)(var4.h() && (var4.t() || !var4.y()) ? e : d);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_186.I[var5.ordinal()]) {
         case 1:
            ForceRegisterConfig var7 = var3.a();
            if (var7.t()) {
               NLoginCore_150.a(var2, NLoginCore_487.I);
               NLoginCore_150.a(var2, NLoginCore_194.F);
               return;
            }

            NLoginCore_073.a(var1, var3.d(), var2.b().getAddress(), NLoginCore_280.c);
            if (var7.y()) {
               var7.y();
               NLoginCore_291 var8 = var1.a();
               NLoginCore_436[] var9 = new NLoginCore_436[k];
               var9[l] = NLoginCore_436.l;
               var8.a(var7, var9);
            }

            var3.a(NLoginCore_567.n);
            var2.a(NLoginCore_150.a(NLoginCore_487.s, var2));
            break;
         case 2:
            ForceRegisterConfig var6 = var3.a();
            if (var6.y()) {
               var6.y();
               NLoginCore_291 var10000 = var1.a();
               NLoginCore_436[] var10002 = new NLoginCore_436[n];
               var10002[o] = NLoginCore_436.l;
               var10000.a(var6, var10002);
            }

            NLoginInterface_039.super.a(var1, var2, var3, var4, var5);
      }
   }
}
