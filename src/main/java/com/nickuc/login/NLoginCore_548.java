package com.nickuc.login;

public class NLoginCore_548 {
   private static final int aT = NLoginCore_425.values().length;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int g = (250 >>> 95 | 250 << -95) & -1;
   private static final long[][] a = new long[aT][g];
   private static int e = Integer.reverse(0);
   private static final long[] a = new long[aT];
   private static final int aS = NLoginCore_548.f;
   private static final boolean[] a = new boolean[aT];
   private static final int[] ai = new int[aT];
   private static int d = 0 >>> 235 | 0 << ~235 + 1;
   private static int b = Integer.reverse(-813694976);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int f = 4000 >>> 227 | 4000 << ~227 + 1;
   private static final Object[] d = a(aT);

   public static void a(NLoginCore_425 var0, long var1) {
      long var3 = System.nanoTime() - var1;
      int var5 = var0.ordinal();
      synchronized (d[var5]) {
         ai[var5] = ai[var5] + a;
         int var7 = ai[var5];
         a[var5][var7] = var3;
         a[var5] = var3;
         if (var7 == b) {
            a[var5] = (c != 0);
            ai[var5] = d;
         }
      }
   }

   private static Object[] a(int var0) {
      Object[] var1 = new Object[var0];

      for (int var2 = e; var2 < var1.length; var2++) {
         var1[var2] = new Object();
      }

      return var1;
   }
}
