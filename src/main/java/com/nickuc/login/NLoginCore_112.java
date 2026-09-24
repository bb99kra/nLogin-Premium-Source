package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_112 {
   private static int bi = -2147483646 >>> 220 | -2147483646 << ~220 + 1;
   private static int bg = (671088640 >>> 57 | 671088640 << ~57 + 1) & -1;
   private static long ai = Long.reverse(-488089946308883236L);
   private static long f = Long.reverse(-488089946308883236L);
   private static int bv = Integer.reverse(134217728);
   private static int au = (2097152 >>> 21 | 2097152 << ~21 + 1) & -1;
   private static long ay = Long.reverse(-6773413839565225984L);
   private static String[] a = new String[NLoginCore_112.bu];
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int aw = Integer.reverse(1342177280);
   private static int aq = Integer.reverse(Integer.MIN_VALUE);
   private static int v = 4096000 >>> 175 | 4096000 << -175;
   private static long m = Long.reverse(-488089946308883236L);
   private static final DecimalFormat[] a = a(NLoginCore_112.bw);
   private static int bo = -805306368 >>> 26 | -805306368 << ~26 + 1;
   private static int q = Integer.reverse(-1);
   private static int av = Integer.reverse(671088640);
   private static int by = -1 >>> 184 | -1 << ~184 + 1;
   private static long aj = Long.reverse(-6773413839565225984L);
   private static int o = 0 >>> 254 | 0 << -254;
   private static int x = (524288 >>> 147 | 524288 << ~147 + 1) & -1;
   private static int ae = Integer.reverse(1610612736);
   private static int j = 0 >>> 90 | 0 << ~90 + 1;
   private static long ad = Long.reverse(6573554269408054492L);
   private static int ak = (128 >>> 164 | 128 << -164) & -1;
   private static long as = Long.reverse(-488089946308883236L);
   private static long br = Long.reverse(6573554269408054492L);
   private static long c;
   private static int ac = Integer.reverse(-1);
   private static long bz = Long.reverse(6573554269408054492L);
   private static int bs = Integer.reverse(1879048192);
   private static int ap = Integer.reverse(0);
   private static long ax = Long.reverse(-488089946308883236L);
   private static long be = Long.reverse(-6773413839565225984L);
   private static int k = Integer.reverse(0);
   private static long g = Long.reverse(-6773413839565225984L);
   private static int p = Integer.reverse(-1073741824);
   private static int bc = (50331648 >>> 86 | 50331648 << -86) & -1;
   private static long aa = Long.reverse(-6773413839565225984L);
   private static int bj = Integer.reverse(1275068416);
   private static int ah = 896 >>> 7 | 896 << -7;
   private static int l = 256 >>> 103 | 256 << ~103 + 1;
   private static long z = Long.reverse(-488089946308883236L);
   private static int bx = (31457280 >>> 21 | 31457280 << -21) & -1;
   private static long at = Long.reverse(-6773413839565225984L);
   private static final DecimalFormat b = new DecimalFormat(a(bx & by, bz));
   private static String[] b = new String[bv];
   private static int t = 128974848 >>> 212 | 128974848 << -212;
   private static long al = Long.reverse(6573554269408054492L);
   private static int an = 0 >>> 94 | 0 << ~94 + 1;
   private static int ab = Integer.reverse(-1610612736);
   private static int w = 134217728 >>> 122 | 134217728 << ~122 + 1;
   private static int bq = -1 >>> 163 | -1 << -163;
   private static int y = Integer.reverse(536870912);
   private static long r = Long.reverse(6573554269408054492L);
   private static int h = (0 >>> 177 | 0 << -177) & -1;
   private static double bf = Double.longBitsToDouble(Long.reverse(39426L));
   private static int bm = (41943040 >>> 179 | 41943040 << ~179 + 1) & -1;
   private static int s = Integer.reverse(0);
   private static long ag = Long.reverse(-6773413839565225984L);
   private static int ar = 603979776 >>> 122 | 603979776 << -122;
   private static long n = Long.reverse(-6773413839565225984L);
   private static int bl = Integer.reverse(1811939328);
   private static long d = Long.reverse(-6773413839565225984L);
   private static int bk = (245760 >>> 76 | 245760 << -76) & -1;
   private static int am = Integer.reverse(0);
   private static long af = Long.reverse(-488089946308883236L);
   private static int bh = 268435462 >>> 28 | 268435462 << -28;
   private static long ba = Long.reverse(-488089946308883236L);
   private static int bn = Integer.reverse(-973078528);
   private static long bd = Long.reverse(-488089946308883236L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = Integer.reverse(134217728);
   private static long b = Long.reverse(-488089946308883236L);
   private static long bb = Long.reverse(-6773413839565225984L);
   private static int az = (11534336 >>> 212 | 11534336 << ~212 + 1) & -1;
   private static int bp = 109051904 >>> 119 | 109051904 << -119;
   private static int a = 0 >>> 72 | 0 << ~72 + 1;
   private static int bw = 655360 >>> 81 | 655360 << -81;
   private static long bt = Long.reverse(6573554269408054492L);
   private static int ao = Integer.reverse(-1);
   private static int u = 4096 >>> 140 | 4096 << -140;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_112.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.D("ϬЎАϰДгЫсЭϼкаоиЁЦшчпхпД", (byte)5, 68), NLoginCore_112.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_183.D("Чдг϶жвЭжсаϽлпилсЃއޏޞދݬޕޢݼޠޞЙ", (byte)5, 68) + var1 + NLoginCore_575.B("Ã", (byte)5, 66) + var2.toString(), var4);
      }
   }

   public static String a(double var0, double var2, int var4, String var5) {
      int var6 = (int)(var0 * var4 / var2);
      return a(az, ba ^ bb) + b(var5, var6) + a(bc, bd ^ be) + b(var5, var4 - var6);
   }

   private static String a(int var0, long var1) {
      var1 ^= 69L;
      var1 ^= 5817649229618998600L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(34 + 35),
                     (byte)(54 + 29),
                     (byte)(41 + 6),
                     (byte)(44 + 23),
                     (byte)(38 + 28),
                     (byte)(58 + 9),
                     47,
                     (byte)(55 + 25),
                     (byte)(58 + 17),
                     (byte)(47 + 20),
                     83,
                     (byte)(30 + 23),
                     (byte)(17 + 63),
                     (byte)(36 + 61),
                     (byte)(23 + 77),
                     (byte)(54 + 46),
                     (byte)(62 + 43),
                     (byte)(18 + 92),
                     (byte)(81 + 22)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.F("ճրտՂւվչւ֍ռՉև\u058bքև֍Տ࣓ࣛ࣪ࣗࢸ࣮࣡ࣈ࣬࣪", (byte)84, 70));
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

   public static String a(String var0, String var1, String var2) {
      String var3 = var0.toLowerCase();
      String var4 = var1.toLowerCase();
      int var5 = an;
      StringBuilder var6 = new StringBuilder(var0);

      while ((var5 = var3.indexOf(var4, var5)) != ao) {
         var6.replace(var5, var5 + var4.length(), var2);
         var5 += var2.length();
      }

      return var6.toString();
   }

   public static String d(long var0) {
      return b.format(var0);
   }

   public static String a(String... var0) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = ap; var2 < var0.length; var2++) {
         var1.append(var0[var2]);
         if (var2 != var0.length - aq) {
            var1.append(a(ar, as ^ at));
         }
      }

      return var1.toString();
   }

   public static String a(double var0) {
      return b.format(var0);
   }

   public static String y(String var0) {
      if (var0.isEmpty()) {
         return var0;
      } else {
         String[] var1 = var0.split(a(l, m ^ n));
         if (var1.length == 0) {
            return var0;
         } else {
            for (int var2 = o; var2 < var1.length; var2++) {
               var1[var2] = t(var1[var2]);
            }

            return String.join(a(p & q, r), var1);
         }
      }
   }

   private static DecimalFormat[] a(int var0) {
      DecimalFormat[] var1 = new DecimalFormat[var0];

      for (int var2 = h; var2 < var0; var2++) {
         DecimalFormat var3 = a(var2 + i);
         var1[var2] = var3;
      }

      return var1;
   }

   public static String a(String var0, Object... var1) {
      if (var1 != null && var1.length > 0) {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         label46:
         for (int var4 = s; var4 < var2; var4++) {
            char var5 = var0.charAt(var4);
            if (var5 == t) {
               int var6 = var4 + u;

               while (true) {
                  if (var6 >= var2) {
                     var3.append(var0.substring(var4));
                     return var3.toString();
                  }

                  char var7 = var0.charAt(var6);
                  if (var7 == v) {
                     if (var6 - var4 >= w) {
                        String var8 = var0.substring(var4 + x, var6);
                        Integer var9 = NLoginCore_449.a(var8);
                        if (var9 == null) {
                           throw new IllegalArgumentException(a(y, z ^ aa) + var8 + a(ab & ac, ad) + var0 + a(ae, af ^ ag) + var4);
                        }

                        if (var9 < var1.length) {
                           var3.append(var1[var9]);
                           var4 += var6 - var4;
                           continue label46;
                        }
                     }
                     break;
                  }

                  if (!NLoginCore_449.a(var7)) {
                     break;
                  }

                  var6++;
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } else {
         return var0;
      }
   }

   public static String b(String var0, int var1) {
      if (var1 <= 0) {
         return a(ak, al);
      } else {
         int var2 = var0.length();
         char[] var3 = new char[var2 * var1];
         char[] var4 = var0.toCharArray();

         for (int var5 = am; var5 < var3.length; var5++) {
            var3[var5] = var4[var5 % var2];
         }

         return new String(var3);
      }
   }

   public static String t(String var0) {
      if (var0.isEmpty()) {
         return var0;
      } else {
         char[] var1 = var0.toCharArray();
         var1[j] = Character.toUpperCase(var1[k]);
         return new String(var1);
      }
   }

   public static String a(double var0, double var2) {
      return a(var0, var2, av, a(aw, ax ^ ay));
   }

   public static String a(double var0, int var2) {
      DecimalFormat var3 = a.length <= var2 ? a(var2) : a[var2 - au];
      return var3.format(var0);
   }

   static {
      b();
   }

   private static void b() {
      c = 4265906954086358175L;
      long var0 = c ^ 5817649229618998600L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(60 + 8),
               (byte)(35 + 34),
               (byte)(79 + 4),
               47,
               (byte)(42 + 25),
               (byte)(24 + 42),
               (byte)(16 + 51),
               (byte)(17 + 30),
               (byte)(46 + 34),
               (byte)(32 + 43),
               (byte)(7 + 60),
               (byte)(43 + 40),
               (byte)(14 + 39),
               (byte)(43 + 37),
               (byte)(59 + 38),
               (byte)(64 + 36),
               (byte)(88 + 12),
               (byte)(23 + 82),
               (byte)(61 + 49),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.C("ГбдхОшϻЧшИлВ", (byte)7, 67);
               b[1] = NLoginCore_076.B("ÜåÃĉÂĄąß×ÚðÕ", (byte)7, 66);
               b[2] = NLoginCore_433.A("ûĆØØèÊăĊúÈÏÕ", (byte)7, 65);
               b[3] = NLoginCore_110.B("ûĆØØèÊăĊúÈÏÕ", (byte)7, 66);
               b[4] = NLoginCore_223.A("ÙÂé¿ÅÅùçíâďÚñĈåæāç××ÚòěÛĔìċáĀÞÞþÞġĔöĈĖø÷ĎĎêħąêĔĖĄĠĂïĘĔĩĬēğĝĳċāĶģ", (byte)7, 65);
               b[5] = NLoginCore_521.E("ӷԖӻӺԭՁԳԿԶԄԤԙԂԞԞԘԶԚԤՉԐԙԖԗ", (byte)7, 69);
               b[6] = NLoginCore_076.C("ЙЄрйфЧпЈьрНВ", (byte)7, 67);
               b[7] = NLoginCore_433.E("ԧԥԈԪԙӻԕԍԚԹԅԋ", (byte)7, 69);
               b[8] = NLoginCore_127.D("ЕЂЮЂдГфгоТзВ", (byte)7, 68);
               b[9] = NLoginCore_173.E("ԸԊӽԠӲԛԭԘԬՃԒԋ", (byte)7, 69);
               b[10] = NLoginCore_559.E("ԑԔԝԱԞԺԣӺԹՅՄԋ", (byte)7, 69);
               b[11] = NLoginCore_138.F("ԬԌԏԷԛԡԫԸԿԡԎԋ", (byte)7, 70);
               b[12] = NLoginCore_241.B("ÏáÈÚÄùãąöäÇÕ", (byte)7, 66);
               b[13] = NLoginCore_004.D("ЏЂфЛЀЄСЇУХлВ", (byte)7, 68);
               b[14] = NLoginCore_446.E("ԅԗӾԐӺԯԙԻԬԚӽԋ", (byte)7, 69);
               b[15] = NLoginCore_201.E("ԫԽӵԜԉӻԻԋԛԚԎԋ", (byte)7, 69);
               break;
            case 1:
               b[0] = NLoginCore_559.E("ԯԼԖԶԵԾԢԯԼՀԚԋ", (byte)7, 69);
               b[1] = NLoginCore_183.B("øöăÂĂàÝøčØäÕ", (byte)7, 66);
               b[2] = NLoginCore_427.C("лЙРвЂнЃыЪЖпВ", (byte)7, 67);
               b[3] = NLoginCore_387.B("ÛÃóĈãåąÜíìèÕ", (byte)7, 66);
               b[4] = NLoginCore_241.C("ЖϿЦϼЂЂжФЪПьЗЮхТУоФДДЗЯјИёЩшОнЛЛлЛўёгхѓедыыЧѤтЧёѓсѝпЬѕѤѳхѥклѬјіѬљёњѶјйѵ҉ћѩѕѭђ", (byte)7, 67);
               b[5] = NLoginCore_446.A("ÁàÅÄ÷ċýĉĀÎîÏäċÊĉêč×âåĉàá", (byte)7, 65);
               b[6] = NLoginCore_173.C("ДнцфЖКПГКтЧьзЉОЦэѕцЩЎцНО", (byte)7, 67);
               b[7] = NLoginCore_433.A("æåãäĆåÚÃÊäàÕ", (byte)7, 65);
               b[8] = NLoginCore_076.D("ЁЍиДоϺмъемХВ", (byte)7, 68);
               b[9] = NLoginCore_138.D("еуϿЁϾГпКЈЧцРяЉчЋХђЎѓааНО", (byte)7, 68);
               b[10] = NLoginCore_471.B("øăÑÞÁËČúąæĂÕ", (byte)7, 66);
               b[11] = NLoginCore_092.A("üÕúöø×ùøøÍäÕ", (byte)7, 65);
               b[12] = NLoginCore_521.D("УмхСРЄчЂонпВ", (byte)7, 68);
               b[13] = NLoginCore_471.E("ԦӴԩԌԬԕՂԬԏԴԼԋ", (byte)7, 69);
               b[14] = NLoginCore_223.F("ԷԳԱՀՁӾԘԟԿԦԴԋ", (byte)7, 70);
               b[15] = NLoginCore_553.E("ԐԧԴԚԋԭԮԏԭԶԚԋ", (byte)7, 69);
               break;
            case 2:
               b[0] = NLoginCore_553.D("ЭгоПГЖЃЀЊСЃяСОмкЛыжШѓРНО", (byte)7, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_183.E("Խԕ\u0530ӻӶԓԍԝӽԼԛԑՇՄԡԧԵՀԌԯԧԛԾՍԿԶՍԡԯՈԖՃ", (byte)7, 69);
         }
      }
   }

   public static String b(double var0, double var2, int var4, String var5) {
      int var6 = (int)(var0 * bf / var2);
      int var7;
      if (var6 <= bg) {
         var7 = bh;
      } else if (var6 <= bi) {
         var7 = bj;
      } else if (var6 <= bk) {
         var7 = bl;
      } else if (var6 <= bm) {
         var7 = bn;
      } else {
         var7 = bo;
      }

      int var8 = (int)(var0 * var4 / var2);
      return a(bp & bq, br) + var7 + b(var5, var8) + a(bs, bt) + b(var5, var4 - var8);
   }

   public static String a(int var0) {
      return a(ah, ai ^ aj) + Integer.toHexString(var0).toUpperCase(Locale.ENGLISH);
   }

   private static DecimalFormat a(int var0) {
      return new DecimalFormat(a(a, b ^ d) + b(a(e, f ^ g), var0), DecimalFormatSymbols.getInstance(Locale.ENGLISH));
   }
}
