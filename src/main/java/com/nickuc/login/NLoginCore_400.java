package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_400 implements NLoginInterface_010, NLoginInterface_035 {
   private static int e = Integer.reverse(0);
   private static int f = (262144 >>> 50 | 262144 << -50) & -1;
   private final NLoginCore_211 R;
   private static int c = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static int a = (64 >>> 198 | 64 << ~198 + 1) & -1;
   private static int d = (64 >>> 229 | 64 << -229) & -1;
   private static int b = 0 >>> 129 | 0 << -129;

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return ((var1.a() != 0).q() && this.a(var3).a() != NLoginCore_175.b ? a : b);
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.j);
      NLoginCore_445[] var10001 = new NLoginCore_445[d];
      var10001[e] = NLoginCore_445.m;
      var10001[f] = NLoginCore_445.n;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.R;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_050.x[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).a(var5 == NLoginCore_445.m ? NLoginCore_175.c : NLoginCore_175.d);
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Generated
   public NLoginCore_400(NLoginCore_211 var1) {
      this.R = var1;
   }
}
