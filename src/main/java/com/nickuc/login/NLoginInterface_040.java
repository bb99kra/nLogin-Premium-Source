package com.nickuc.login;

import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;

public interface NLoginInterface_040 extends NLoginInterface_004 {
   NLoginCore_277 a(String var1);

   NLoginCore_277 a(Object var1);

   void c();

   default NLoginCore_277 b(String var1) {
      NLoginCore_277 var2 = this.a(var1);
      if (var2 == null) {
         int var3 = Integer.MAX_VALUE;
         String var4 = var1.toLowerCase(Locale.ENGLISH);

         for (NLoginCore_277 var6 : this.c()) {
            String var7 = var6.getName();
            if (var7.toLowerCase(Locale.ENGLISH).startsWith(var4)) {
               int var8 = Math.abs(var7.length() - var4.length());
               if (var8 < var3) {
                  var2 = var6;
                  var3 = var8;
               }

               if (var8 == 0) {
                  break;
               }
            }
         }
      }

      return var2;
   }

   Collection<NLoginCore_277> c();

   NLoginInterface_021 a(NLoginCore_168<?> var1);

   NLoginInterface_006 a();

   @Nullable
   NLoginCore_081 a(String var1);

   NLoginCore_277 a(UUID var1);

   PluginInfoModel[] a();

   boolean j(String var1);
}
