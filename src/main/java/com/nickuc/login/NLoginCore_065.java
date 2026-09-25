package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_065 {
   private static long bq = Long.reverse(8681166663148114367L);
   private static long g = Long.reverse(6087093277782708671L);
   private static long ch = Long.reverse(8681166663148114367L);
   private static int ay = Integer.reverse(536870912);
   private static int am = Integer.reverse(-1610612736);
   private static String[] ZKM_STR_B = new String[NLoginCore_065.bt];
   private static int af = Integer.reverse(-452984832);
   private static int ad = Integer.reverse(-452984832);
   private static long av = Long.reverse(6087093277782708671L);
   private static int ck = 1572864 >>> 81 | 1572864 << ~81 + 1;
   private static long bx = Long.reverse(3170534137668829184L);
   private static int bo = Integer.reverse(1610612736);
   public static final char c;
   private static long ba = Long.reverse(8681166663148114367L);
   private static int be = Integer.reverse(Integer.MIN_VALUE);
   private static int ap = Integer.reverse(Integer.MIN_VALUE);
   private static int al = 342016 >>> 203 | 342016 << ~203 + 1;
   private static long cl = Long.reverse(8681166663148114367L);
   private static int cd = Integer.reverse(-1879048192);
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(1677721600);
   private static int bd = Integer.reverse(1073741824);
   private static int ca = 67108864 >>> 247 | 67108864 << ~247 + 1;
   private static int bf = 35 >>> 0 | 35 << -0;
   private static long bi = Long.reverse(8681166663148114367L);
   private static int i = Integer.reverse(-452984832);
   private static long bw = Long.reverse(6087093277782708671L);
   private static int bn = 16777216 >>> 248 | 16777216 << -248;
   private static final Pattern g = Pattern.compile(a(ck, cl));
   private static int b = Integer.reverse(0);
   private static final Pattern d = Pattern.compile(a(cd, NLoginCore_065.ce));
   private static int s = (4 >>> 98 | 4 << ~98 + 1) & -1;
   private static final Pattern e = Pattern.compile(a(NLoginCore_065.cf & NLoginCore_065.cg, ch));
   private static long cc = Long.reverse(8681166663148114367L);
   private static int au = (393216 >>> 81 | 393216 << ~81 + 1) & -1;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   public static final char d = (char)NLoginCore_065.bz;
   private static int j = Integer.reverse(1677721600);
   private static int as = 262144 >>> 241 | 262144 << ~241 + 1;
   private static int v = Integer.reverse(-452984832);
   public static final String bv;
   private static long aw = Long.reverse(3170534137668829184L);
   private static int ci = Integer.reverse(-805306368);
   private static int aj = 85504 >>> 41 | 85504 << -41;
   private static int bv = Integer.reverse(-536870912);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = 36700160 >>> 148 | 36700160 << ~148 + 1;
   private static int ar = Integer.reverse(-536870912);
   private static int w = Integer.reverse(0);
   private static int t = (0 >>> 147 | 0 << -147) & -1;
   private static long ce = Long.reverse(8681166663148114367L);
   private static int az = (-1 >>> 77 | -1 << -77) & -1;
   private static int bb = (-1 >>> 160 | -1 << ~160 + 1) & -1;
   private static int ax = -1 >>> 121 | -1 << ~121 + 1;
   private static int bc = Integer.reverse(0);
   private static int ai = Integer.reverse(-1073741824);
   private static int bp = Integer.reverse(-1);
   private static long ab = Long.reverse(8681166663148114367L);
   private static int z = (1 >>> 160 | 1 << ~160 + 1) & -1;
   private static int n = Integer.reverse(-452984832);
   private static int ac = 0 >>> 240 | 0 << -240;
   private static int bg = 655360 >>> 209 | 655360 << -209;
   private static int bt = Integer.reverse(-1342177280);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int o = (131072 >>> 145 | 131072 << ~145 + 1) & -1;
   private static int q = Integer.reverse(1677721600);
   private static int br = -1 >>> 186 | -1 << ~186 + 1;
   private static int aa = Integer.reverse(1073741824);
   private static int bl = 117440512 >>> 88 | 117440512 << -88;
   private static int ag = Integer.reverse(1073741824);
   public static final String bu = a(ca & NLoginCore_065.cb, cc);
   private static int bh = -1 >>> 163 | -1 << ~163 + 1;
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int cg = (-1 >>> 178 | -1 << ~178 + 1) & -1;
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(1677721600);
   private static int r = Integer.reverse(-452984832);
   private static int c = Integer.reverse(-1);
   private static int at = Integer.reverse(-536870912);
   private static long cj = Long.reverse(8681166663148114367L);
   private static int y = Integer.reverse(67108864);
   private static long c;
   private static int e = (0 >>> 190 | 0 << ~190 + 1) & -1;
   private static int an = Integer.reverse(0);
   private static int bz = (21889024 >>> 17 | 21889024 << -17) & -1;
   private static int by = 573440 >>> 14 | 573440 << -14;
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int bs = (13 >>> 128 | 13 << -128) & -1;
   private static int ah = '꜀' >>> 136 | 42752 << ~136 + 1;
   private static final Pattern f = Pattern.compile(a(ci, cj));
   private static long h = Long.reverse(3170534137668829184L);
   private static int bj = -1 >>> 69 | -1 << ~69 + 1;
   private static int ak = (4096 >>> 42 | 4096 << -42) & -1;
   private static int l = 1048576 >>> 84 | 1048576 << -84;
   private static long d = Long.reverse(8681166663148114367L);
   private static int cb = -1 >>> 134 | -1 << -134;
   private static int bu = Integer.reverse(1677721600);
   private static int cf = Integer.reverse(1342177280);
   private static int a = 0 >>> 132 | 0 << -132;
   public static final char b = (char)by;
   private static int bk = 2048 >>> 139 | 2048 << ~139 + 1;
   private static String[] ZKM_STR_A = new String[bs];

   public static String r(String var0) {
      return a(var0, (char)q, (char)r, (s != 0), (t != 0));
   }

   public static String o(String var0) {
      return e(var0, (e != 0));
   }

   public static String d(String var0, boolean var1) {
      return var0 != null && !var0.isEmpty() ? (var1 ? e : d).matcher(var0).replaceAll(a(b & c, d)) : var0;
   }

   public static String s(String var0) {
      return a(var0, (char)u, (char)v, (w != 0), (x != 0));
   }

   private static String a(String var0, char var1, char var2, boolean var3, boolean var4) {
      if (var0 != null && !var0.isEmpty()) {
         char[] var5 = var0.toCharArray();

         label42:
         for (int var6 = an; var6 < var5.length - ao; var6++) {
            if (var5[var6] == var1) {
               char var7 = var5[var6 + ap];
               if (var4 && var7 == aq && var5.length > var6 + ar) {
                  for (int var8 = var6 + as; var8 <= var6 + at; var8++) {
                     char var9 = var5[var8];
                     if (a(au, av ^ aw).indexOf(var9) == ax) {
                        continue label42;
                     }
                  }

                  var5[var6] = var2;
                  var6 += 7;
               } else if (var3 && a(ay & az, ba).indexOf(var7) > bb) {
                  var5[var6] = var2;
                  var5[++var6] = Character.toLowerCase(var5[var6]);
               }
            }
         }

         return new String(var5);
      } else {
         return var0;
      }
   }

   static {
      b();
      c = (char)bu;
      bv = a(bv, bw ^ bx);
   }

   public static String e(String var0, boolean var1) {
      return var0 != null && !var0.isEmpty() ? (var1 ? g : f).matcher(var0).replaceAll(a(f, g ^ h)) : var0;
   }

   public static String t(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         char[] var1 = var0.toCharArray();

         for (int var2 = bc; var2 < var1.length; var2++) {
            char var3 = var1[var2];
            switch (var3) {
               case ' ':
                  break;
               case '#':
                  int var5 = var2 + bl;
                  if (var1.length >= var5 + bm) {
                     for (int var6 = var2 + bn; var6 < var5; var6++) {
                        char var7 = var1[var6];
                        if (a(bo & bp, bq).indexOf(var7) == br) {
                           var1[var6] = Character.toUpperCase(var1[var6]);
                           return new String(var1);
                        }
                     }

                     var2 += 6;
                  }
                  break;
               case '&':
               case '§':
                  if (var1.length >= var2 + bd) {
                     char var4 = var1[var2 + be];
                     if (var4 != bf) {
                        if (a(bg & bh, bi).indexOf(var4) <= bj) {
                           var1[var2 + bk] = Character.toUpperCase(var4);
                           return new String(var1);
                        }

                        var2++;
                     }
                  }
                  break;
               default:
                  var1[var2] = Character.toUpperCase(var1[var2]);
                  return new String(var1);
            }
         }

         return new String(var1);
      } else {
         return var0;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_065.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.A("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 65), NLoginCore_065.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.F("ՆՓՒԕՕՑՌՕՠՏԜ՚՞\u0557՚ՠԢࢶࢧࢯࢱࢬࢹࣀࢯ࢟ࢷԸ", (byte)39, 70) + var1 + NLoginCore_241.F("ԝ", (byte)39, 70) + var2.toString(), var4
         );
      }
   }

   public static String q(String var0) {
      return a(var0, (char)m, (char)n, (o != 0), (p != 0));
   }

   public static String n(String var0) {
      return d(var0, (a != 0));
   }

   public static String m(String var0) {
      return o(n(var0));
   }

   public static String f(String var0, boolean var1) {
      if (var0 != null && !var0.isEmpty()) {
         Matcher var2 = (var1 ? g : f).matcher(var0);
         StringBuffer var3 = new StringBuffer(var0.length() + y);

         while (var2.find()) {
            String var4 = var2.group(z).toLowerCase(Locale.ROOT);
            var2.appendReplacement(
               var3,
               a(aa, ab)
                  + var4.charAt(ac)
                  + ad
                  + var4.charAt(ae)
                  + af
                  + var4.charAt(ag)
                  + ah
                  + var4.charAt(ai)
                  + aj
                  + var4.charAt(ak)
                  + al
                  + var4.charAt(am)
            );
         }

         return var2.appendTail(var3).toString();
      } else {
         return var0;
      }
   }

   public static String c(String var0, boolean var1) {
      return e(d(var0, var1), var1);
   }

   private static String a(int var0, long var1) {
      var1 ^= 52L;
      var1 ^= -3187743453635267598L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(32 + 36),
                     (byte)(55 + 14),
                     (byte)(82 + 1),
                     (byte)(43 + 4),
                     (byte)(62 + 5),
                     (byte)(41 + 25),
                     (byte)(20 + 47),
                     (byte)(21 + 26),
                     80,
                     (byte)(43 + 32),
                     (byte)(3 + 64),
                     83,
                     (byte)(31 + 22),
                     (byte)(12 + 68),
                     (byte)(35 + 62),
                     (byte)(56 + 44),
                     (byte)(54 + 46),
                     (byte)(28 + 77),
                     (byte)(41 + 69),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.E("֊֖֗ՙ֙֕\u0590֤֙֓ՠ֢֛֤֞֞զࣰࣺ࣫ࣳࣵࣽऄࣣࣳࣻ", (byte)107, 69));
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

   public static String p(String var0) {
      return a(var0, (char)i, (char)j, (k != 0), (l != 0));
   }

   private static void b() {
      c = -177866777717531094L;
      long var0 = c ^ -3187743453635267598L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(51 + 18),
               (byte)(29 + 54),
               (byte)(39 + 8),
               (byte)(65 + 2),
               66,
               (byte)(50 + 17),
               (byte)(23 + 24),
               (byte)(55 + 25),
               (byte)(27 + 48),
               (byte)(46 + 21),
               (byte)(45 + 38),
               (byte)(43 + 10),
               (byte)(19 + 61),
               (byte)(94 + 3),
               (byte)(35 + 65),
               (byte)(95 + 5),
               (byte)(20 + 85),
               (byte)(101 + 9),
               (byte)(46 + 57)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.E("էգ֏՛օ\u058bձՓազկ՜", (byte)88, 69);
               ZKM_STR_B[1] = NLoginCore_397.D("ԐԌԸԄԮԴԚӼԊԏԘԅ", (byte)88, 68);
               ZKM_STR_B[2] = NLoginCore_092.C("ԉԸԡԔԣԅԋԙԉԾԈԅ", (byte)88, 67);
               ZKM_STR_B[3] = NLoginCore_232.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƨƋƳƭƐǀƎƷƞǆƏ", (byte)88, 66);
               ZKM_STR_B[4] = NLoginCore_324.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƅǁƐǇǅǒƏƥǇǇƵƢƣ", (byte)88, 66);
               ZKM_STR_B[5] = NLoginCore_451.A("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƅǁƐǇǅǒƏƥǇǇƵƢƣ", (byte)88, 65);
               ZKM_STR_B[6] = NLoginCore_110.E("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվ֍հ֘֒յ֥ճ֜փ֫մ", (byte)88, 69);
               ZKM_STR_B[7] = NLoginCore_110.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƨƋƳƭƐǀƎƷƞǆƏ", (byte)88, 66);
               ZKM_STR_B[8] = NLoginCore_241.E("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվր֓\u058cյդյՠ֒յ֨֕թ֜ֈ֞ձ֒ջց֪խ֭ժ֦յַ֪֬մ֊֚֬֬ևֈ", (byte)88, 69);
               ZKM_STR_B[9] = NLoginCore_232.C("ԠԃԯԩԎԈԶԏԼԑԡԝԒԗӿԤԏԛԸԧӼԕՇԬՃԡԣՒԩԟԱԐԿԿԔԗԘԳԨԜՇԺԬԞՀՔԣՀԹԣՅեԩՙ\u0530Ա", (byte)88, 67);
               ZKM_STR_B[10] = NLoginCore_127.E("֍ի֏գ՝ժժճև֏֕կաժ\u0558ե֒\u058cՑլճ\u058b\u058cր֢օբ֑֒\u058bբօ֭֡կւ֭֮֝ծֳըտռ", (byte)88, 69);
               ZKM_STR_B[11] = NLoginCore_384.E("սֈֆջ՚գվՒկ՞ֆ֍\u0557ծմ֝\u0558պ\u0558֚\u058b֘խ֎ց\u0558֕՞էդ֡պ", (byte)88, 69);
               ZKM_STR_B[12] = NLoginCore_521.E("սՊՅ\u058bՠա֏֕Ւ՟ՕՐնքզզ֙և֝կ֚չ\u0590֢ճ֣֢֟֠ֈժֈ", (byte)88, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.F("ցիՠ֍ՇՄձծզՕ֍՜", (byte)88, 70);
               ZKM_STR_B[1] = NLoginCore_027.A("ƙŵƨƊƀƃŻƝƝůƒŷ", (byte)88, 65);
               ZKM_STR_B[2] = NLoginCore_384.A("ƢƑƠŧƨŽŪūƢƋƓżƯƲƁƵƌƎƩƫƬƻƂƃ", (byte)88, 65);
               ZKM_STR_B[3] = NLoginCore_446.E("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվփՙ֎բ֠\u0590֕֊ը֢ք֭լեփ֛֥֟֟֫֞ղռ", (byte)88, 69);
               ZKM_STR_B[4] = NLoginCore_138.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǊƾǎǌƑƲƏǒƬƷƙǛƢƣ", (byte)88, 66);
               ZKM_STR_B[5] = NLoginCore_530.F("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվր֓\u058cյդյՠ֒յ֨֕թ֜ֈ֞ձ֒ջց֪խְִַֹ֭֘ոָֺ֟ո׀ևֈ", (byte)88, 70);
               ZKM_STR_B[6] = NLoginCore_232.F("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվտ֚ոպ֟ռ֤ճ֛֤֩ք֍ֆւ֛\u058c֪֟ր֭֬ռ", (byte)88, 70);
               ZKM_STR_B[7] = NLoginCore_201.E("չՖՆ\u058bս֑֑տՠմգ֔֍բՙլձո֕հվ֎՚տ՟ֆ֢՞չ֣֔փ՟չկ֯ծ֓ռւր֫֗ռ", (byte)88, 69);
               ZKM_STR_B[8] = NLoginCore_427.A("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƊǃǎǅƫƫƴƭƔƮǋƢƣ", (byte)88, 65);
               ZKM_STR_B[9] = NLoginCore_324.C("ԠԃԯԩԎԈԶԏԼԑԡԝԒԗӿԤԏԛԸԧӼԕՇԬՃԡԣՒԩԟԱԐԿԿԔԗԘԳԨԜՇԺԮՁՍԷ՝ԮՐԠեժՆթ\u0530Ա", (byte)88, 67);
               ZKM_STR_B[10] = NLoginCore_232.E("֍ի֏գ՝ժժճև֏֕կաժ\u0558ե֒\u058cՑլճ\u058b\u058cր֢օբ֑֒\u058bբօ֨ն֢հգ\u058c֏֤֭֔֟֊֧ֆչ֙֜սյ֎֩׀ևֈ", (byte)88, 69);
               ZKM_STR_B[11] = NLoginCore_471.E("սֈֆջ՚գվՒկ՞ֆ֍\u0557ծմ֝\u0558պ\u0558֚\u058b֑֍֚֜յւե֪֦֚֓֔֎֏֏ֈֆ֪ղ֫տ֥ռ", (byte)88, 69);
               ZKM_STR_B[12] = NLoginCore_110.A("ƘťŠƦŻżƪưŭźŰūƑƟƁƁƴƢƸƊƵƓŶƶƯǀƕưſƳǀƔƆƈƥƔƝſƬƭƨǋƪƗ", (byte)88, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.A("źŵſŦŸŶƠƥƥŻƄƴƌůƯŭƊƳƧƔƷƅƂƃ", (byte)88, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_530.E("ՖՈ֊֏՝իքֈ֏օլ֎ՓզժյՖ֝ի՟֎\u0590էը", (byte)88, 69);
         }
      }
   }
}
