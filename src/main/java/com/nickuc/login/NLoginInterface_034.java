package com.nickuc.login;

import java.io.File;
import java.util.List;
import javax.annotation.Nullable;

public interface NLoginInterface_034 {
   boolean b();

   String b();

   default String c(boolean var1) {
      String var2 = this.b() + NLoginCore_004.C("Ќ", (byte)14, 67) + this.getVersion() + NLoginCore_521.B("ÉĆþĐ", (byte)14, 66);
      if (var1) {
         var2 = var2 + NLoginCore_076.B("ÉĐĊĎ", (byte)14, 66);
      }

      return var2;
   }

   String getVersion();

   @Nullable
   String c();

   boolean c();

   default File a(NLoginCore_583 var1, boolean var2) {
      return new File(var1.g, this.c(var2));
   }

   default String A() {
      return this.b() + NLoginCore_530.B("şƶ", (byte)96, 66) + this.getVersion();
   }

   List<NLoginCore_398> a();

   String a();
}
