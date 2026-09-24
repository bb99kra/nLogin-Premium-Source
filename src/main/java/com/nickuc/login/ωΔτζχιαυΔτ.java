package com.nickuc.login;

import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;

public interface ωΔτζχιαυΔτ extends ψνρωκλαΓςσλζςΣ {
   ΨαχΨχΣλεΠψΦ a(String var1);

   ΨαχΨχΣλεΠψΦ a(Object var1);

   void c();

   default ΨαχΨχΣλεΠψΦ b(String var1) {
      ΨαχΨχΣλεΠψΦ var2 = this.a(var1);
      if (var2 == null) {
         int var3 = Integer.MAX_VALUE;
         String var4 = var1.toLowerCase(Locale.ENGLISH);

         for (ΨαχΨχΣλεΠψΦ var6 : this.c()) {
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

   Collection<ΨαχΨχΣλεΠψΦ> c();

   οηΔΦθκορ a(ιχρΨκεπυξ<?> var1);

   εςοεωζφπωΨ a();

   @Nullable
   ωΛσΦΔτβωυυτθθΓυ a(String var1);

   ΨαχΨχΣλεΠψΦ a(UUID var1);

   ΣθΦΓμοΛσββδ[] a();

   boolean j(String var1);
}
