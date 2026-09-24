package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_449 {
   private static int n = Integer.reverse(-805306368);
   private static long t = Long.reverse(1069735823603486946L);
   private static long r = Long.reverse(-3830180570975612702L);
   private static long b = Long.reverse(1069735823603486946L);
   private static int g = Integer.reverse(0);
   private static int o = (1476395008 >>> 187 | 1476395008 << ~187 + 1) & -1;
   private static long x = Long.reverse(-3830180570975612702L);
   private static int al = (9 >>> 96 | 9 << -96) & -1;
   private static int ah = 524288 >>> 112 | 524288 << ~112 + 1;
   private static long k = Long.reverse(-3830180570975612702L);
   private static final String[] e;
   private static int at = (0 >>> 65 | 0 << -65) & -1;
   private static int ap = Integer.reverse(1342177280);
   private static int v = (10 >>> 161 | 10 << -161) & -1;
   private static long ab = Long.reverse(1069735823603486946L);
   private static int i = (131072 >>> 177 | 131072 << ~177 + 1) & -1;
   private static long d = Long.reverse(-4323455642275676160L);
   private static double au = Double.longBitsToDouble(Long.reverse(2306L));
   private static double as = Double.longBitsToDouble(Long.reverse(2306L));
   private static int ae = (28672 >>> 140 | 28672 << -140) & -1;
   private static int y = Integer.reverse(-1610612736);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static long ar = Long.reverse(-4323455642275676160L);
   private static int w = (-1 >>> 22 | -1 << ~22 + 1) & -1;
   private static int am = -1 >>> 187 | -1 << ~187 + 1;
   private static int l = ('耀' >>> 206 | 32768 << ~206 + 1) & -1;
   private static long u = Long.reverse(-4323455642275676160L);
   private static int ak = (768 >>> 232 | 768 << ~232 + 1) & -1;
   private static final DecimalFormat a = new DecimalFormat(a(v & w, x));
   private static long an = Long.reverse(-3830180570975612702L);
   private static long aq = Long.reverse(1069735823603486946L);
   private static int ao = (1048576 >>> 146 | 1048576 << ~146 + 1) & -1;
   private static final double g = Math.log10(as);
   private static long af = Long.reverse(-3830180570975612702L);
   private static int j = -1 >>> 75 | -1 << ~75 + 1;
   private static int q = -1 >>> 38 | -1 << -38;
   private static int a = Integer.reverse(0);
   private static int f = (16384 >>> 238 | 16384 << ~238 + 1) & -1;
   private static int p = 12582912 >>> 86 | 12582912 << ~86 + 1;
   private static int ag = Integer.reverse(1073741824);
   private static final double[] a;
   private static long c;
   private static String[] b = new String[o];
   private static String[] a = new String[n];
   private static int e = Integer.reverse(-1);
   private static int aa = Integer.reverse(1610612736);
   private static double h = Double.longBitsToDouble(Long.reverse(39426L));
   private static long aj = Long.reverse(-3830180570975612702L);
   private static long ac = Long.reverse(-4323455642275676160L);
   private static final String bQ = a(p & q, r);
   private static long m = Long.reverse(-3830180570975612702L);
   private static int ai = (-1 >>> 244 | -1 << -244) & -1;
   private static final String bR = a(NLoginCore_449.s, t ^ u);
   private static int s = 8 >>> 33 | 8 << -33;
   private static int z = 0 >>> 97 | 0 << -97;

   public static String c(long var0) {
      if (var0 <= 0L) {
         return a(i & j, k);
      } else {
         int var2 = (int)(Math.log10(var0) / g);
         double var3 = var0 / a[var2];
         return a.format(var3) + a(l, m) + e[var2];
      }
   }

   private static void b() {
      c = 5119087106964986736L;
      long var0 = c ^ 1749239444975988453L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(43 + 26),
               83,
               (byte)(43 + 4),
               (byte)(18 + 49),
               (byte)(44 + 22),
               (byte)(3 + 64),
               (byte)(27 + 20),
               (byte)(48 + 32),
               (byte)(72 + 3),
               (byte)(17 + 50),
               (byte)(39 + 44),
               (byte)(40 + 13),
               (byte)(14 + 66),
               (byte)(52 + 45),
               (byte)(58 + 42),
               100,
               (byte)(15 + 90),
               (byte)(64 + 46),
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_183.D("պՌռֈՐ՞Փ֏֕ճաազՐ֙զ֖պ՛լ՚\u0590էը", (byte)117, 68);
               b[1] = NLoginCore_004.B("ƬǘƴǜǅǨƢƛǅǔƣƱ", (byte)117, 66);
               b[2] = NLoginCore_076.C("ՃիՏՠխ՝՜խՠ֑Ւ՜", (byte)117, 67);
               b[3] = NLoginCore_110.C("պՌռֈՐ՞Փ֏֕ճաազՐ֙զ֖պ՛լ՚\u0590էը", (byte)117, 67);
               b[4] = NLoginCore_387.C("\u0557փ՟ևհ֓ՍՆհտՎ՜", (byte)117, 67);
               b[5] = NLoginCore_127.D("\u058bՄՎջբ֒էեմձ։՜", (byte)117, 68);
               b[6] = NLoginCore_091.E("գր֦և֥\u058b֑֯ձ։֞չ", (byte)117, 69);
               b[7] = NLoginCore_092.B("ƹƺǍǦǔƞǃǝǪǫƧƱ", (byte)117, 66);
               b[8] = NLoginCore_575.D("տՎՎՉլճփՋժևց՜", (byte)117, 68);
               b[9] = NLoginCore_004.B("ǢƼǢǎǞǦƠǘǈǦǚƱ", (byte)117, 66);
               b[10] = NLoginCore_530.B("ǣǐǞƜǣǞƶƵǛǌƼƱ", (byte)117, 66);
               break;
            case 1:
               b[0] = NLoginCore_397.B("ǏơǑǝƥƳƨǤǪǈƷƼƸƷǐǌƯǲǦǟǪƿƼƽ", (byte)117, 66);
               b[1] = NLoginCore_553.F("֨վեգ֨֏֭֯֓ջ\u058cչ", (byte)117, 70);
               b[2] = NLoginCore_451.E("ոք֨թ֥֨֡\u058bփճռչ", (byte)117, 69);
               b[3] = NLoginCore_183.C("պՌռֈՐ՞Փ֏֕ճ՟ճ֖֑ոջՏժ֠\u058b֙֠էը", (byte)117, 67);
               b[4] = NLoginCore_223.D("վ՜խՊ՜։\u058bժւմ֍՜", (byte)117, 68);
               b[5] = NLoginCore_141.B("ǏǤƺƿƴƷƢƠǛƥǭƩƼǡƫǟƪǇǲǰƲǵƼƽ", (byte)117, 66);
               b[6] = NLoginCore_183.D("ԿֆհխկՠըֈՔՠՎ՜", (byte)117, 68);
               b[7] = NLoginCore_004.B("ƼǞƛǜǀơǡǤƼǂǌƱ", (byte)117, 66);
               b[8] = NLoginCore_446.B("ƫǡǎǝƥǖƨǗǧǤǦƱ", (byte)117, 66);
               b[9] = NLoginCore_453.A("ǏǛƿƟƤǂǆǑƪǩǦƱ", (byte)117, 65);
               b[10] = NLoginCore_451.E("֒֊֕չծ֣֠֫տ֟\u0590չ", (byte)117, 69);
               break;
            case 2:
               b[0] = NLoginCore_521.D("պՌՉխՈ֍ՠՊ։ւ\u0590հխ\u058b֚֍նլխջ\u0557մ\u0590ջ֔֓ո֡ւֆգլ", (byte)117, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_521.D("բթ\u0558ՆՉ֑մՎժՒ։՜", (byte)117, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 35L;
      var1 ^= 1749239444975988453L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(48 + 21),
                     83,
                     (byte)(28 + 19),
                     (byte)(43 + 24),
                     (byte)(34 + 32),
                     (byte)(23 + 44),
                     47,
                     (byte)(63 + 17),
                     (byte)(25 + 50),
                     (byte)(16 + 51),
                     (byte)(53 + 30),
                     (byte)(47 + 6),
                     (byte)(79 + 1),
                     (byte)(18 + 79),
                     (byte)(86 + 14),
                     (byte)(44 + 56),
                     (byte)(40 + 65),
                     (byte)(46 + 64),
                     (byte)(97 + 6)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.E("ց֎֍Ր\u0590\u058cև\u0590֛֊\u0557֛֕֙֒֕՝ࣲࣩ࣮ࣺࣦࣩࣤ࣫࣬࣊", (byte)98, 69));
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

   public static boolean a(char var0) {
      return (boolean)(a(a, b ^ d).indexOf(var0) > e ? f : g);
   }

   public static double a(long var0, long var2) {
      return var0 * h / var2;
   }

   @Nullable
   public static Short a(String var0) {
      return a(var0, null);
   }

   public static Integer a(String var0, Integer var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            return Integer.valueOf(var0);
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   public static Long a(String var0, Long var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            return Long.valueOf(var0);
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   @Nullable
   public static Long a(String var0) {
      return a(var0, null);
   }

   @Nullable
   public static Double a(String var0) {
      return a(var0, null);
   }

   public static Double a(String var0, Double var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            return Double.valueOf(var0);
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   public static Short a(String var0, Short var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            return Short.valueOf(var0);
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_449.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.E("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 69), NLoginCore_449.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.E("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣺࣳࣻࣸࣽउࣵࣙँࣸւ", (byte)113, 69) + var1 + NLoginCore_471.B("ƛ", (byte)113, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      String[] var10000 = new String[y];
      var10000[z] = a(aa, ab ^ ac);
      var10000[ad] = a(ae, af);
      var10000[ag] = a(ah & ai, aj);
      var10000[ak] = a(al & am, an);
      var10000[ao] = a(ap, aq ^ ar);
      e = var10000;
      a = new double[e.length];

      for (int var0 = at; var0 < a.length; var0++) {
         a[var0] = Math.pow(au, var0);
      }
   }

   @Nullable
   public static Integer a(String var0) {
      return a(var0, null);
   }
}
