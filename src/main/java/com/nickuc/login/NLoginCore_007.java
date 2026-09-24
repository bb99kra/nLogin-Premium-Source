package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_007 {
   private static long g = Long.reverse(-7586898489911931106L);
   private static int ak = 402653184 >>> 25 | 402653184 << -25;
   private static String[] a = new String[NLoginCore_007.av];
   private static int as = Integer.reverse(-268435456);
   private static int a = (0 >>> 195 | 0 << ~195 + 1) & -1;
   private static long v = Long.reverse(-2161727821137838080L);
   private static String[] b = new String[NLoginCore_007.aw];
   private static int ac = -1 >>> 168 | -1 << ~168 + 1;
   private static long r = Long.reverse(8409887386508070686L);
   private static int av = 144 >>> 195 | 144 << -195;
   private static int k = Integer.reverse(-1073741824);
   private static int ap = 1879048192 >>> 27 | 1879048192 << -27;
   private static int t = (12288 >>> 43 | 12288 << ~43 + 1) & -1;
   private static long az = Long.reverse(-7586898489911931106L);
   private static long u = Long.reverse(8409887386508070686L);
   private static long j = Long.reverse(-7586898489911931106L);
   private static long m = Long.reverse(-2161727821137838080L);
   private static long b = Long.reverse(8409887386508070686L);
   private static long aq = Long.reverse(8409887386508070686L);
   private static long y = Long.reverse(-2161727821137838080L);
   private static int e = (65536 >>> 48 | 65536 << ~48 + 1) & -1;
   private static int ba = Integer.reverse(-2013265920);
   private static int w = (112 >>> 228 | 112 << -228) & -1;
   private static long c;
   private static int h = (64 >>> 133 | 64 << ~133 + 1) & -1;
   private static long an = Long.reverse(8409887386508070686L);
   private static int q = Integer.reverse(-1610612736);
   private static long l = Long.reverse(8409887386508070686L);
   private static int n = 33554432 >>> 23 | 33554432 << ~23 + 1;
   private static int ay = (-1 >>> 94 | -1 << -94) & -1;
   private static int ab = Integer.reverse(-1879048192);
   private static int f = Integer.reverse(-1);
   private static long aj = Long.reverse(-2161727821137838080L);
   private static int aw = Integer.reverse(1207959552);
   private static long ad = Long.reverse(-7586898489911931106L);
   private static int ae = (167772160 >>> 152 | 167772160 << -152) & -1;
   private static int i = -1 >>> 45 | -1 << -45;
   private static long ai = Long.reverse(8409887386508070686L);
   private static int af = Integer.reverse(-1);
   private static long p = Long.reverse(-2161727821137838080L);
   private static long bc = Long.reverse(-7586898489911931106L);
   private static long ar = Long.reverse(-2161727821137838080L);
   private static int at = (-1 >>> 12 | -1 << -12) & -1;
   private static int z = 524288 >>> 208 | 524288 << ~208 + 1;
   private static long o = Long.reverse(8409887386508070686L);
   private static long x = Long.reverse(8409887386508070686L);
   private static int ax = Integer.reverse(134217728);
   private static long s = Long.reverse(-2161727821137838080L);
   private static long d = Long.reverse(-2161727821137838080L);
   private static int ah = (352 >>> 165 | 352 << -165) & -1;
   private static final Locale b = new Locale(a(ax & ay, az), a(ba & NLoginCore_007.bb, bc));
   private static int am = 212992 >>> 14 | 212992 << ~14 + 1;
   private static int bb = (-1 >>> 137 | -1 << -137) & -1;
   private static long aa = Long.reverse(-7586898489911931106L);
   private static long al = Long.reverse(-7586898489911931106L);
   private static long au = Long.reverse(-7586898489911931106L);
   private static long ag = Long.reverse(-7586898489911931106L);
   private static long ao = Long.reverse(-2161727821137838080L);

   public static NLoginCore_189 a(long var0, boolean var2) {
      return new NLoginCore_189(var0, var2 ? b : Locale.getDefault());
   }

   private static String a(int var0, long var1) {
      var1 ^= 71L;
      var1 ^= 8684387187426103381L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(17 + 51),
                     (byte)(40 + 29),
                     (byte)(29 + 54),
                     (byte)(4 + 43),
                     (byte)(34 + 33),
                     (byte)(14 + 52),
                     (byte)(33 + 34),
                     47,
                     (byte)(33 + 47),
                     (byte)(45 + 30),
                     (byte)(11 + 56),
                     (byte)(35 + 48),
                     (byte)(15 + 38),
                     (byte)(49 + 31),
                     (byte)(33 + 64),
                     (byte)(36 + 64),
                     (byte)(59 + 41),
                     (byte)(20 + 85),
                     (byte)(45 + 65),
                     (byte)(34 + 69)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.B("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒҷӞӥӍӫӌӦӯөӢӠӷӡӴ", (byte)74, 66));
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

   public static String a(NLoginCore_189 var0, boolean var1) {
      return var1
         ? var0.al()
            + a(a, b ^ d)
            + var0.am()
            + a(e & f, g)
            + var0.an()
            + a(h & i, j)
            + var0.ak()
            + a(k, l ^ m)
            + var0.aj()
            + a(n, o ^ p)
            + var0.ai()
         : var0.am()
            + a(q, r ^ s)
            + var0.al()
            + a(t, u ^ v)
            + var0.an()
            + a(w, x ^ y)
            + var0.ak()
            + a(z, aa)
            + var0.aj()
            + a(ab & ac, ad)
            + var0.ai();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_007.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.C("ҸӚӜҼӠӿӷԍӹӈԆӼԊԄӍӲԔԓԋԑԋӠ", (byte)73, 67), NLoginCore_007.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐҵӜӣӋөӊӤӭӧӠӞӵӟӲŪ", (byte)73, 66) + var1 + NLoginCore_076.E("Կ", (byte)73, 69) + var2.toString(), var4
         );
      }
   }

   public static String a(NLoginCore_189 var0) {
      return var0.ak() + a(ap, aq ^ ar) + var0.aj() + a(as & at, au) + var0.ai();
   }

   public static String a(long var0, boolean var2) {
      return a(a(var0, var2), var2);
   }

   public static String b(NLoginCore_189 var0, boolean var1) {
      return var1
         ? var0.al() + a(ae & af, ag) + var0.am() + a(ah, ai ^ aj) + var0.an()
         : var0.am() + a(ak, al) + var0.al() + a(am, an ^ ao) + var0.an();
   }

   private static void b() {
      c = 8714565895553789230L;
      long var0 = c ^ 8684387187426103381L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(13 + 56),
               (byte)(41 + 42),
               (byte)(45 + 2),
               67,
               (byte)(19 + 47),
               (byte)(35 + 32),
               (byte)(12 + 35),
               (byte)(61 + 19),
               (byte)(27 + 48),
               (byte)(38 + 29),
               (byte)(66 + 17),
               53,
               (byte)(8 + 72),
               (byte)(29 + 68),
               (byte)(6 + 94),
               (byte)(69 + 31),
               (byte)(90 + 15),
               (byte)(82 + 28),
               (byte)(9 + 94)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(74 + 9)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_324.F("շ֎։ֱ֬սյ֒քֳֹվ", (byte)122, 70);
               b[1] = NLoginCore_223.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
               b[2] = NLoginCore_091.C("հ\u0590ջ\u0590ֈ֟֊Օ֗֔վի", (byte)122, 67);
               b[3] = NLoginCore_241.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
               b[4] = NLoginCore_453.D("֓Տը֍տրՙ՜֙՝եի", (byte)122, 68);
               b[5] = NLoginCore_433.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
               b[6] = NLoginCore_141.B("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 66);
               b[7] = NLoginCore_433.F("֨և֞\u058b֬֊֑վ֥֗֯վ", (byte)122, 70);
               b[8] = NLoginCore_453.E("֦բջ֠֒֓լկ֬հով", (byte)122, 69);
               b[9] = NLoginCore_183.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
               b[10] = NLoginCore_384.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
               b[11] = NLoginCore_324.C("դջն֙֞ժբտձ֦֠ի", (byte)122, 67);
               b[12] = NLoginCore_559.C("դջն֙֞ժբտձ֦֠ի", (byte)122, 67);
               b[13] = NLoginCore_384.F("շ֎։ֱ֬սյ֒քֳֹվ", (byte)122, 70);
               b[14] = NLoginCore_453.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
               b[15] = NLoginCore_183.A("ǣƟƸǝǏǐƩƬǩƭƵƻ", (byte)122, 65);
               b[16] = NLoginCore_446.B("ƢǞǠǬǐƫǧǬǕǐƭƻ", (byte)122, 66);
               b[17] = NLoginCore_091.C("֛մզէսռհպրբ֠ի", (byte)122, 67);
               break;
            case 1:
               b[0] = NLoginCore_138.E("ռ֫ք֮֨խ\u0590֣֑֗֠վ", (byte)122, 69);
               b[1] = NLoginCore_387.D("զ֙֝ջ֑֔֔֘\u058cֆ\u0590ի", (byte)122, 68);
               b[2] = NLoginCore_004.C("օ֏մջՒմչ֡֏֘՝ի", (byte)122, 67);
               b[3] = NLoginCore_397.E("ժչ֣կձ֑֑֣֠֩֯վ", (byte)122, 69);
               b[4] = NLoginCore_433.D("դ֑նը֛ձվՕյ֦պի", (byte)122, 68);
               b[5] = NLoginCore_241.F("֬բը\u058bֳֳլ\u058c֖֭֙վ", (byte)122, 70);
               b[6] = NLoginCore_004.E("իւ֛քռ֧֯տ֯ցַվ", (byte)122, 69);
               b[7] = NLoginCore_451.D("\u0558ըյ֖֛\u0590յ՚֕֞ւի", (byte)122, 68);
               b[8] = NLoginCore_471.A("ƾǙƩǤưǯǅǩƯǦǴƻ", (byte)122, 65);
               b[9] = NLoginCore_433.F("փ֮֠֟ճְַ֧֓փով", (byte)122, 70);
               b[10] = NLoginCore_173.A("ǃǡǣǍƦǉǲǀǑǪǬƻ", (byte)122, 65);
               b[11] = NLoginCore_183.F("ְ֘\u0590֦֎ֳձտց֥օվ", (byte)122, 70);
               b[12] = NLoginCore_451.E("֦֜֍լֲ֑ք֤֬֡մվ", (byte)122, 69);
               b[13] = NLoginCore_092.C("հ\u0558ձ՞֍֎շ֒՝ռվի", (byte)122, 67);
               b[14] = NLoginCore_092.E("֦ք֢\u058b֧֯֍ճ֟֓մվ", (byte)122, 69);
               b[15] = NLoginCore_521.C("Օ֓խծ֙նլյցճ՝ի", (byte)122, 67);
               b[16] = NLoginCore_471.B("ƹǈƪƾǪǉǥǎǤǱǆƻ", (byte)122, 66);
               b[17] = NLoginCore_397.F("ժ֏ռծִ֭֓֩֍ֵօվ", (byte)122, 70);
               break;
            case 2:
               b[0] = NLoginCore_451.F("պբְ֒լրִַ֢֢֟յ֪\u058b֮֒ռ֭֓׀ֹ֜։֊", (byte)122, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_471.B("ǨƟƺǅǏǃǭƩǀǄǍǁƴǺǂǐǈǇǚǒǀǯǆǇ", (byte)122, 66);
         }
      }
   }

   static {
      b();
   }
}
