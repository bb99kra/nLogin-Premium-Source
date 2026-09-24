package com.nickuc.login;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import javax.annotation.CheckReturnValue;

public class NLoginCore_294 {
   private static int d = Integer.reverse(0);
   private static int e = (128 >>> 135 | 128 << ~135 + 1) & -1;
   private static int l = 0 >>> 194 | 0 << ~194 + 1;
   private static int c = (0 >>> 103 | 0 << ~103 + 1) & -1;
   private static int b = 0 >>> 195 | 0 << ~195 + 1;
   private static int k = Integer.reverse(0);
   private static int g = (0 >>> 172 | 0 << ~172 + 1) & -1;
   private static int a = (4 >>> 66 | 4 << -66) & -1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int i = Integer.reverse(0);
   private static int h = 1048576 >>> 244 | 1048576 << ~244 + 1;
   private static int f = Integer.reverse(0);

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(File var0, Charset var1, String... var2) {
      if (var2.length == 0) {
         return (boolean)f;
      } else if (!NLoginCore_366.b(var0)) {
         return (boolean)g;
      } else {
         PrintWriter var3 = a(var0, var1, (boolean)h);
         boolean var10 = false /* VF: Semaphore variable */;

         int var12;
         try {
            var10 = true;
            String[] var4 = var2;
            int var5 = var2.length;

            for (int var6 = i; var6 < var5; var6++) {
               String var7 = var4[var6];
               if (var7.isEmpty()) {
                  var3.println();
               } else {
                  var3.println(var7);
               }
            }

            var3.flush();
            var12 = j;
            var10 = false;
         } finally {
            if (var10) {
               if (Collections.singletonList(var3).get(l) != null) {
                  var3.close();
               }
            }
         }

         if (Collections.singletonList(var3).get(k) != null) {
            var3.close();
         }

         return (boolean)var12;
      }
   }

   @CheckReturnValue
   public static PrintWriter a(File var0, Charset var1, boolean var2) {
      return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(var0, (boolean)e), var1)), var2);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(File var0, byte[] var1) {
      if (NLoginCore_366.b(var0)) {
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         boolean var6 = false /* VF: Semaphore variable */;

         int var3;
         try {
            var6 = true;
            NLoginCore_366.a(var2, var0);
            var3 = a;
            var6 = false;
         } finally {
            if (var6) {
               if (Collections.singletonList(var2).get(c) != null) {
                  var2.close();
               }
            }
         }

         if (Collections.singletonList(var2).get(b) != null) {
            var2.close();
         }

         return (boolean)var3;
      } else {
         return (boolean)d;
      }
   }

   public static boolean a(File var0, String... var1) {
      return a(var0, StandardCharsets.UTF_8, var1);
   }
}
