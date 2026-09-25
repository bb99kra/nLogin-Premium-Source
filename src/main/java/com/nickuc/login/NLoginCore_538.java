package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_538 implements NLoginInterface_039, NLoginInterface_044 {
   private static int b = Integer.reverse(0);
   private static int a = (0 >>> 136 | 0 << ~136 + 1) & -1;
   private static int e = 0 >>> 141 | 0 << ~141 + 1;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.reverse(0);
   private static int f = Integer.reverse(0);
   private static int i = Integer.reverse(0);
   private static int c = (0 >>> 90 | 0 << -90) & -1;
   private final NLoginCore_211 aj;
   private static int g = (0 >>> 51 | 0 << ~51 + 1) & -1;

   @Generated
   public NLoginCore_538(NLoginCore_211 var1) {
      this.aj = var1;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      String var4 = var3.d(NLoginCore_567.u);
      if (var4 == null) {
         return (a != 0);
      } else if (NLoginCore_477.V.ar() && NLoginCore_477.W.ar()) {
         ForceRegisterConfig var5 = var3.a();
         if (!var5.s()) {
            return (c != 0);
         } else {
            return ((!var5.x() != 0) && BCryptHashProvider.b().matcher(var4).matches() ? e : d);
         }
      } else {
         return (b != 0);
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.aj;
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (h != 0);
   }

   @Override
   public boolean at() {
      return (i != 0);
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_487.ai);
      return new GUIButtonContainer[g];
   }

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
   }
}
