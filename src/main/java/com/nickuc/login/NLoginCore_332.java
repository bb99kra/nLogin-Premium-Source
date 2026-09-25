package com.nickuc.login;

import com.nickuc.login.tasks.LoginMainQueueTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_332 implements Runnable {
   private static int q = Integer.reverse(536870912);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int o = Integer.reverse(-1);
   private static int ad = (5 >>> 61 | 5 << ~61 + 1) & -1;
   private static long c;
   private static int ae = Integer.reverse(671088640);
   private static int f = (0 >>> 58 | 0 << -58) & -1;
   private static int b = 0 >>> 100 | 0 << -100;
   private static int x = 939524096 >>> 155 | 939524096 << ~155 + 1;
   private static long t = Long.reverse(6544741290707125943L);
   private static int n = 48 >>> 36 | 48 << ~36 + 1;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginType_008 j;
   private static long z = Long.reverse(4323455642275676160L);
   private static int al = Integer.reverse(1342177280);
   private static int ah = 131072 >>> 80 | 131072 << ~80 + 1;
   private static long j = Long.reverse(6544741290707125943L);
   private static int af = 0 >>> 63 | 0 << ~63 + 1;
   private static long w = Long.reverse(6544741290707125943L);
   private static long aj = Long.reverse(6544741290707125943L);
   private static int aa = Integer.reverse(268435456);
   private static long r = Long.reverse(6544741290707125943L);
   private static int i = Integer.reverse(1073741824);
   private static long m = Long.reverse(5476377146882523136L);
   private static long p = Long.reverse(6544741290707125943L);
   private static int s = 655360 >>> 81 | 655360 << -81;
   private static int ak = (80 >>> 163 | 80 << ~163 + 1) & -1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long e = Long.reverse(4323455642275676160L);
   private final NLoginCore_277 c;
   private final String q;
   private static String[] ZKM_STR_B = new String[al];
   private final NLoginInterface_048 a;
   private static int ai = Integer.reverse(-1879048192);
   private static long ab = Long.reverse(6544741290707125943L);
   private static int c = Integer.reverse(0);
   private static int v = Integer.reverse(1610612736);
   private static long d = Long.reverse(7409432419162261175L);
   private static long y = Long.reverse(7409432419162261175L);
   private final NLoginInterface_040 a;
   private static int ag = 2097152 >>> 116 | 2097152 << ~116 + 1;
   private static long h = Long.reverse(6544741290707125943L);
   private final boolean y;
   private static long l = Long.reverse(1711367858400788480L);
   private static int u = (2 >>> 129 | 2 << -129) & -1;
   private static String[] ZKM_STR_A = new String[ak];
   private static int ac = (0 >>> 177 | 0 << -177) & -1;

   public NLoginCore_332(NLoginType_008 var1, NLoginCore_277 var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = a;
      NLoginCore_425[] var6 = NLoginCore_425.values();
      int var7 = var6.length;

      for (int var8 = b; var8 < var7; var8++) {
         NLoginCore_425 var9 = var6[var8];
         if (!var9.aT()) {
            if (var5 == 0) {
               var4.append(a(c, d ^ e));
            } else {
               var5 = f;
            }

            var4.append(a(g, h)).append(var9.cT).append(a(i, j));
         }
      }

      this.q = var4.toString();
      this.j = var1;
      this.c = var2;
      this.y = var3;
      this.a = var1.b();
      this.a = var1.b((k != 0)).a(this, l, m, TimeUnit.MILLISECONDS);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_332.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.A("ƉƫƭƍƱǐǈǞǊƙǗǍǛǕƞǃǥǤǜǢǜƱ", (byte)113, 65), NLoginCore_332.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_127.C("իոշԺպնձպօմՁտփռտօՇࣛ࣠ࢮ࣓ࣅࢱ࣓ࢻ࣓࣡ࣛ࣌ࣜՠ", (byte)113, 67) + var1 + NLoginCore_027.A("ƛ", (byte)113, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   public void run() {
      if (!this.j.N()) {
         this.a.Z();
      } else if (this.c.R() && NLoginCore_274.b().contains(this.c.getName())) {
         int var1 = LoginMainQueueTask.x();
         if (var1 > 0) {
            this.c.a(a(n & o, p), a(q, r) + var1 + a(s, t) + (var1 == u ? a(v, w) : a(x, y ^ z)) + a(aa, ab), ac, ad, ae);
         }

         NLoginCore_425[] var2 = NLoginCore_425.values();
         String[] var3 = new String[var2.length];

         for (int var4 = af; var4 < var2.length; var4++) {
            String var5 = this.y ? var2[var4].c(TimeUnit.MILLISECONDS, ag) : var2[var4].b(TimeUnit.MILLISECONDS, ah);
            var3[var4] = var5 + a(ai, aj);
         }

         this.c.o(String.format(this.q, var3));
      } else {
         NLoginCore_274.b().remove(this.c.getName());
         this.a.Z();
      }
   }

   static {
      b();
   }

   private static void b() {
      c = -1341942109570479258L;
      long var0 = c ^ 8250106123757403185L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(54 + 14),
               (byte)(30 + 39),
               (byte)(62 + 21),
               (byte)(14 + 33),
               (byte)(5 + 62),
               66,
               (byte)(26 + 41),
               (byte)(34 + 13),
               (byte)(48 + 32),
               (byte)(46 + 29),
               (byte)(26 + 41),
               (byte)(6 + 77),
               (byte)(4 + 49),
               (byte)(19 + 61),
               (byte)(84 + 13),
               100,
               (byte)(85 + 15),
               (byte)(102 + 3),
               (byte)(39 + 71),
               (byte)(51 + 52)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_324.A("ŠŮŔƃŃžŲŦĿſƈŏ", (byte)68, 65);
               ZKM_STR_B[1] = NLoginCore_324.A("ŷŖżƃŶŦŦŲņſżŏ", (byte)68, 65);
               ZKM_STR_B[2] = NLoginCore_183.F("Ւ՚ՖռՆ\u0558չճիՍչՈ", (byte)68, 70);
               ZKM_STR_B[3] = NLoginCore_521.A("ŮŗşŗŽŽŚőĿųżŏ", (byte)68, 65);
               ZKM_STR_B[4] = NLoginCore_076.B("ŰĿŵŹŻŹŽŜŨŞœƃşŨƌũŋſŜƀƃŕťşƐƄƃŮƜŵŽƘƞŶŞůƁƙƘűƔƘƘů", (byte)68, 66);
               ZKM_STR_B[5] = NLoginCore_530.D("ҹӫӰҵӵӲӜҹӶӶԂӉ", (byte)68, 68);
               ZKM_STR_B[6] = NLoginCore_521.E("ԷՉժՅժըմԻՔԼՓՈ", (byte)68, 69);
               ZKM_STR_B[7] = NLoginCore_453.D("ҴҵӫһӻҵӴӲӽӞһӉ", (byte)68, 68);
               ZKM_STR_B[8] = NLoginCore_575.E("ԫՙխը՛՝ԷՋափյՈ", (byte)68, 69);
               ZKM_STR_B[9] = NLoginCore_183.A("ŹĺŝŋŁƂŷŚňƉŦŏ", (byte)68, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.C("ӵҹӔӇӑӞӞӳӼҹӘӉ", (byte)68, 67);
               ZKM_STR_B[1] = NLoginCore_141.A("ƁſŮųŕƆŴŠňŦŁŏ", (byte)68, 65);
               ZKM_STR_B[2] = NLoginCore_173.D("ӉӓӛӾӵҾҼӘӾӯӘӉ", (byte)68, 68);
               ZKM_STR_B[3] = NLoginCore_397.E("հոԲկեծրկ՝ւսՈ", (byte)68, 69);
               ZKM_STR_B[4] = NLoginCore_397.B("ŰĿŵŹŻŹŽŜŨŞœƃşŨƌũŋſŜƀƃŕťşƐƄƃŮƜŵŽƘƊƖſůƢƀƐŶƅũŹŪƋƁƍŨƎƁŨƎŬƳźŻ", (byte)68, 66);
               ZKM_STR_B[5] = NLoginCore_397.B("ĽŎůŮļřŏŝƃŚŪŏ", (byte)68, 66);
               ZKM_STR_B[6] = NLoginCore_427.C("ұӊӘӷӞһӼӐӴӗҺӡӯӅӕӞӅӾԍӞԁӗӔӕ", (byte)68, 67);
               ZKM_STR_B[7] = NLoginCore_127.F("\u0558՚թՏՓԵթռ՛րշդ\u0558Վտ՞Իեպ՚պռՓՔ", (byte)68, 70);
               ZKM_STR_B[8] = NLoginCore_530.D("ӫӰӅӺӧӬҸӚӮӜһӉ", (byte)68, 68);
               ZKM_STR_B[9] = NLoginCore_076.C("ӧӰӶӜӓӸӸӝӠӽӘӉ", (byte)68, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_446.F("ԱՕիճԶՔ՝ՓԼձՍսբրԽթ՛ժՕՉՇՍՋչսռբՔբՑՓ֔", (byte)68, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_241.E("՚Ք\u0558ՍՋ՞խՓկՎՔգՀԸտևւմՓՃրզՓՔ", (byte)68, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= 8250106123757403185L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(27 + 42),
                     (byte)(50 + 33),
                     (byte)(24 + 23),
                     (byte)(50 + 17),
                     (byte)(12 + 54),
                     (byte)(41 + 26),
                     (byte)(14 + 33),
                     (byte)(14 + 66),
                     (byte)(72 + 3),
                     (byte)(55 + 12),
                     (byte)(48 + 35),
                     53,
                     (byte)(61 + 19),
                     (byte)(21 + 76),
                     (byte)(47 + 53),
                     (byte)(91 + 9),
                     (byte)(26 + 79),
                     (byte)(96 + 14),
                     (byte)(28 + 75)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡔ࡙ࠧࡌ࠾ࠪࡌ࠴࡚ࡌࡔࡅࡕ", (byte)68, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }
}
