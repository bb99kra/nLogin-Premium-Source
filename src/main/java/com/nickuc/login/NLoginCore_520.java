package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_520 implements NLoginInterface_010, NLoginInterface_035 {
   private static int c = 0 >>> 207 | 0 << ~207 + 1;
   private static int b = 64 >>> 37 | 64 << -37;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(0);
   private final NLoginCore_211 U;

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.i);
      NLoginCore_445[] var10001 = new NLoginCore_445[b];
      var10001[c] = NLoginCore_445.b;
      var10001[d] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   public NLoginCore_520(NLoginCore_211 var1) {
      this.U = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_264.A[var5.ordinal()]) {
         case 1:
            this.a(var3).a(NLoginCore_175.b);
         case 2:
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.U;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().q();
   }
}
