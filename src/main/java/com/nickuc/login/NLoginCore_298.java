package com.nickuc.login;

import javax.annotation.Nullable;

public class NLoginCore_298 {
   private static int b = 0 >>> 174 | 0 << -174;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int e = (524288 >>> 83 | 524288 << -83) & -1;
   private static int f = 0 >>> 140 | 0 << -140;
   private static int d = 0 >>> 186 | 0 << ~186 + 1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int g = (0 >>> 163 | 0 << -163) & -1;

   public static boolean a(Class<?> var0, String var1, Class<?>... var2) {
      try {
         var0.getDeclaredMethod(var1, var2);
         return (c != 0);
      } catch (NoSuchMethodException var4) {
         return (d != 0);
      }
   }

   @Nullable
   public static Class<?> a(String var0, String... var1) {
      try {
         return Class.forName(var0);
      } catch (NoClassDefFoundError | ClassNotFoundException var9) {
         String[] var3 = var1;
         int var4 = var1.length;

         for (int var5 = g; var5 < var4; var5++) {
            String var6 = var3[var5];

            try {
               return Class.forName(var6);
            } catch (NoClassDefFoundError | ClassNotFoundException var8) {
            }
         }

         return null;
      }
   }

   public static boolean a(Class<?> var0, String var1) {
      try {
         var0.getDeclaredField(var1);
         return (e != 0);
      } catch (NoSuchFieldException var3) {
         return (f != 0);
      }
   }

   public static boolean a(String var0, String... var1) {
      return ((a(var0, var1) != 0) != null ? a : b);
   }
}
