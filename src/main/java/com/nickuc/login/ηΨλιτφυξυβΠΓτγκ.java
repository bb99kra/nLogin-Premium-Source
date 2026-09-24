package com.nickuc.login;

import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

class ηΨλιτφυξυβΠΓτγκ implements ΣΣπδβωΦδιςδςψΣς {
   private static int a = Integer.reverse(0);
   private static int b = 0 >>> 138 | 0 << ~138 + 1;
   private static int c = (0 >>> 106 | 0 << -106) & -1;
   private final Set<String> n;

   ηΨλιτφυξυβΠΓτγκ a(String var1, String... var2) {
      this.n.add(var1.toLowerCase(Locale.ENGLISH));
      if (var2.length > 0) {
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = b; var5 < var4; var5++) {
            String var6 = var3[var5];
            this.n.add(var6.toLowerCase(Locale.ENGLISH));
         }
      }

      return this;
   }

   @Override
   public boolean filter(String var1, String var2, Object... var3) {
      if (!this.n.isEmpty()) {
         String var4 = var2.toLowerCase(Locale.ENGLISH);
         return this.n.stream().anyMatch(var4::contains);
      } else {
         return (boolean)c;
      }
   }

   ηΨλιτφυξυβΠΓτγκ(Set<String> var1, String... var2) {
      if (!var1.isEmpty()) {
         var1 = var1.stream().map(String::toLowerCase).collect(Collectors.toSet());
      }

      this.n = var1;
      if (var2.length > 0) {
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = a; var5 < var4; var5++) {
            String var6 = var3[var5];
            this.n.add(var6.toLowerCase(Locale.ENGLISH));
         }
      }
   }
}
