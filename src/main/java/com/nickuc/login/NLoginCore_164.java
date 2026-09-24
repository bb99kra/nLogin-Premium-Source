package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

enum NLoginCore_164 {
   b(NLoginCore_164.r),
   c(NLoginCore_164.w),
   d(NLoginCore_164.ab);

   private final int aG;
   private static String[] a = new String[NLoginCore_164.l];
   private static String[] b = new String[NLoginCore_164.m];
   private static long c;
   private static int a = Integer.reverse(0);
   private static long b = Long.reverse(6835055217404236873L);
   private static long d = Long.reverse(-432345564227567616L);
   private static int e = Integer.reverse(0);
   private static int f = (4096 >>> 76 | 4096 << -76) & -1;
   private static int g = 0 >>> 118 | 0 << ~118 + 1;
   private static int h = (6291456 >>> 149 | 6291456 << ~149 + 1) & -1;
   private static int i = Integer.reverse(0);
   private static int j = 16384 >>> 142 | 16384 << ~142 + 1;
   private static int k = Integer.reverse(1073741824);
   private static int l = 262144 >>> 16 | 262144 << ~16 + 1;
   private static int m = Integer.reverse(536870912);
   private static int n = 16384 >>> 14 | 16384 << -14;
   private static int o = -1 >>> 193 | -1 << -193;
   private static long p = Long.reverse(-6567657273650359223L);
   private static int q = Integer.reverse(0);
   private static int r = 0 >>> 207 | 0 << -207;
   private static int s = 8 >>> 130 | 8 << ~130 + 1;
   private static int t = -1 >>> 45 | -1 << ~45 + 1;
   private static long u = Long.reverse(-6567657273650359223L);
   private static int v = (33554432 >>> 185 | 33554432 << ~185 + 1) & -1;
   private static int w = (4808704 >>> 13 | 4808704 << ~13 + 1) & -1;
   private static int x = Integer.reverse(-1073741824);
   private static long y = Long.reverse(6835055217404236873L);
   private static long z = Long.reverse(-432345564227567616L);
   private static int aa = Integer.reverse(1073741824);
   private static int ab = Integer.reverse(-1954545664);

   private static void b() {
      c = -7914247633286243462L;
      long var0 = c ^ -209698550970926348L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(24 + 45),
               83,
               (byte)(25 + 22),
               (byte)(12 + 55),
               (byte)(29 + 37),
               67,
               (byte)(32 + 15),
               (byte)(14 + 66),
               (byte)(19 + 56),
               (byte)(47 + 20),
               (byte)(11 + 72),
               (byte)(42 + 11),
               (byte)(60 + 20),
               (byte)(30 + 67),
               (byte)(20 + 80),
               (byte)(89 + 11),
               (byte)(14 + 91),
               (byte)(24 + 86),
               (byte)(26 + 77)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
      byte[] var4 = new byte[8];
      var4[0] = (byte)(var0 >>> 56);

      for (int var5 = 1; var5 < 8; var5++) {
         var4[var5] = (byte)(var0 << var5 * 8 >>> 56);
      }

      var2.init(2, var3.generateSecret(new DESKeySpec(var4)), new IvParameterSpec(new byte[8]));
      byte var7 = 1;

      for (int var6 = 0; var6 < var7; var6++) {
         switch (var6) {
            case 0:
               b[0] = NLoginCore_575.C("ԣԫՀԻդդ՜՝ՔճհԻ", (byte)106, 67);
               b[1] = NLoginCore_004.F("՚՝\u0558տ֢֒ռզ֖֥յծ", (byte)106, 70);
               b[2] = NLoginCore_427.F("թ֊֔փՙ՚֜\u0590կՠ֗ծ", (byte)106, 70);
               b[3] = NLoginCore_453.A("žƗƤƽƹƛƠƳƵǆƍƛ", (byte)106, 65);
               break;
            case 1:
               b[0] = NLoginCore_387.D("Ԩխ՛ԸԦ՜իԭեԲՖԻ", (byte)106, 68);
               b[1] = NLoginCore_004.F("՚ծՠ֣ռ֖֠յ֛բդծ", (byte)106, 70);
               b[2] = NLoginCore_397.E("էֈ֛մծ֢֛ր֝բ֓ծ", (byte)106, 69);
               b[3] = NLoginCore_141.A("ǇǆƟƭǇƍƑǃƲǒƑƛ", (byte)106, 65);
               break;
            case 2:
               b[0] = NLoginCore_427.B("ƕǇơƫǍƥƪǐƱǀƭƉƗǏǈƤǗǜƹƞǏǏƦƧ", (byte)106, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.F("մ֑՚ճ֣՛րռֆ֙զռ֘֘ֆ֮֜\u058bօֵֻּ֖֑֭֯֞֨֔֯־֚", (byte)106, 70);
         }
      }
   }

   private static NLoginCore_164 a(String var0, int var1) {
      boolean var2 = a(a, b ^ d).equalsIgnoreCase(var0);
      NLoginCore_164[] var3 = values();
      int var4 = var3.length;

      for (int var5 = e; var5 < var4; var5++) {
         NLoginCore_164 var6 = var3[var5];
         int var7 = var2 ? (var6.aG == var1 ? f : g) : var6.name().equalsIgnoreCase(var0);
         if (var7 != 0) {
            return var6;
         }
      }

      return b;
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 95L;
      var1 ^= -209698550970926348L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(49 + 20),
                     (byte)(5 + 78),
                     47,
                     (byte)(45 + 22),
                     (byte)(18 + 48),
                     (byte)(27 + 40),
                     (byte)(45 + 2),
                     (byte)(6 + 74),
                     (byte)(54 + 21),
                     (byte)(66 + 1),
                     (byte)(48 + 35),
                     (byte)(32 + 21),
                     (byte)(26 + 54),
                     (byte)(5 + 92),
                     (byte)(55 + 45),
                     (byte)(69 + 31),
                     105,
                     (byte)(62 + 48),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.A("ƺǇǆƉǉǅǀǉǔǃƐǎǒǋǎǔƖԮԞԩԋԱԈԫԘԹԶԻԼԮ", (byte)108, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         a[var0] = new String(var3.doFinal(Base64.getDecoder().decode(b[var0])), StandardCharsets.UTF_8);
      }

      return a[var0];
   }

   @Generated
   private NLoginCore_164(int var3) {
      this.aG = var3;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_164.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.A("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 65), NLoginCore_164.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.E("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձउࣹऄࣦऌࣣआࣳऔऑखगउ֊", (byte)118, 69) + var1 + NLoginCore_241.D("Ց", (byte)118, 68) + var2.toString(), var4
         );
      }
   }
}
