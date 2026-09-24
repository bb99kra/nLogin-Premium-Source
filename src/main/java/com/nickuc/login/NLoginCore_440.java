package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_440 implements NLoginInterface_010, NLoginInterface_035 {
   private static int b = (2097152 >>> 148 | 2097152 << ~148 + 1) & -1;
   private final NLoginCore_211 S;
   private static int d = (1024 >>> 74 | 1024 << -74) & -1;
   private static int c = Integer.reverse(0);
   private static int a = Integer.reverse(0);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.h);
      NLoginCore_445[] var10001 = new NLoginCore_445[b];
      var10001[c] = NLoginCore_445.k;
      var10001[d] = NLoginCore_445.l;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.S;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().q();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_013.y[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).a(var5 == NLoginCore_445.k ? NLoginCore_566.d : NLoginCore_566.f);
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Generated
   public NLoginCore_440(NLoginCore_211 var1) {
      this.S = var1;
   }
}
