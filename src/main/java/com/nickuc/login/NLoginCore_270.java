package com.nickuc.login;

import java.util.concurrent.TimeUnit;
import lombok.Generated;

public class NLoginCore_270 {
   private static double a = Double.longBitsToDouble(Long.reverse(192770L));
   private static double d = Double.longBitsToDouble(Long.reverse(57731437634L));
   private static double c = Double.longBitsToDouble(Long.reverse(2796794754L));
   private static double f = Double.longBitsToDouble(Long.reverse(4166733122370L));
   private static int g = Integer.reverse(1073741824);
   private static double e = Double.longBitsToDouble(Long.reverse(702789996866L));
   private final long x;
   private static double b = Double.longBitsToDouble(Long.reverse(18969730L));

   public String a(TimeUnit var1, long var2, int var4) {
      return NLoginCore_112.a(this.a(var1, var2), var4);
   }

   @Generated
   public long i() {
      return this.x;
   }

   public static NLoginCore_270 a(long var0) {
      return new NLoginCore_270(var0);
   }

   public String a(TimeUnit var1, int var2) {
      return NLoginCore_112.a(this.a(var1), var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public double a(TimeUnit var1, long var2) {
      long var4 = var2 - this.x;
      switch (NLoginCore_537.s[var1.ordinal()]) {
         case 1:
            return var4;
         case 2:
            return var4 / a;
         case 3:
            return var4 / b;
         case 4:
            return var4 / c;
         case 5:
            return var4 / d;
         case 6:
            return var4 / e;
         case 7:
            return var4 / f;
         default:
            return var4;
      }
   }

   public String aq() {
      return this.a(TimeUnit.SECONDS, g);
   }

   public long h() {
      return (long)this.a(TimeUnit.MILLISECONDS);
   }

   public double a(TimeUnit var1) {
      return this.a(var1, System.nanoTime());
   }

   public NLoginCore_270(long var1) {
      this.x = var1;
   }

   public NLoginCore_270() {
      this(System.nanoTime());
   }
}
