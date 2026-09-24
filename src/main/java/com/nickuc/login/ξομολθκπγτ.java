package com.nickuc.login;

import java.util.Map;
import java.util.concurrent.Callable;

public class ξομολθκπγτ {
   public static <T, V> T a(Map<T, V> var0, Callable<T> var1) {
      Object var2;
      do {
         var2 = var1.call();
      } while (var0.containsKey(var2));

      return (T)var2;
   }
}
