package com.nickuc.login;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NLoginCore_039 {
   private static int a = Integer.reverse(Integer.MIN_VALUE);

   public static List<String> a(List<String> var0, String[] var1) {
      if (var1.length == 0) {
         return var0;
      } else {
         String var2 = var1[var1.length - a].toLowerCase(Locale.ENGLISH);
         return var2.isEmpty() ? var0 : var0.stream().filter(var1x -> var1x.toLowerCase(Locale.ENGLISH).startsWith(var2)).collect(Collectors.toList());
      }
   }
}
