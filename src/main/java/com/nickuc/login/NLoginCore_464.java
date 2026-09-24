package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_464 implements NLoginInterface_039 {
   private static int c = (0 >>> 82 | 0 << ~82 + 1) & -1;
   private static int j = Integer.reverse(0);
   private final NLoginCore_211 am;
   private static int g = 0 >>> 142 | 0 << -142;
   private static int f = 0 >>> 139 | 0 << -139;
   private static int b = Integer.reverse(0);
   private static int d = (0 >>> 38 | 0 << ~38 + 1) & -1;
   private static int i = Integer.reverse(0);
   private static int k = 0 >>> 221 | 0 << -221;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int e = 16 >>> 164 | 16 << -164;
   private static int l = (0 >>> 61 | 0 << -61) & -1;
   private static int a = Integer.reverse(0);

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      if (var5 == NLoginCore_445.a && var3.a().b(NLoginCore_077.f)) {
         NLoginCore_073.a(var1, var3.d(), var2.b().getAddress(), NLoginCore_184.e);
         var3.a(NLoginCore_567.n);
         var2.a(NLoginCore_150.a(NLoginCore_487.s, var2));
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.am;
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (boolean)k;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_487.ah);
      NLoginCore_445[] var10001 = new NLoginCore_445[h];
      var10001[i] = NLoginCore_445.a;
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
            return (boolean)(NLoginCore_073.a(var3.d(), var2.b().getAddress()) == NLoginCore_184.d ? e : f);
         } else {
            return (boolean)d;
         }
      }
   }

   @Override
   public boolean at() {
      return (boolean)l;
   }

   @Generated
   public NLoginCore_464(NLoginCore_211 var1) {
      this.am = var1;
   }
}
