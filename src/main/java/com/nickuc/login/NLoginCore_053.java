package com.nickuc.login;

import java.util.List;
import lombok.Generated;

public class NLoginCore_053 implements NLoginInterface_012 {
   private final NLoginCore_211 ao;
   private static int a = Integer.reverse(0);

   @Generated
   public NLoginCore_053(NLoginCore_211 var1) {
      this.ao = var1;
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ao;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var3.a(NLoginCore_567.l);
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      List var5 = var3.a(NLoginCore_567.l);
      if (var5 != null) {
         var5.forEach(var2x -> var1.b().a(var2, var2x));
      }

      NLoginInterface_012.super.b(var1, var2, var3);
      return new GUIButtonContainer[a];
   }
}
