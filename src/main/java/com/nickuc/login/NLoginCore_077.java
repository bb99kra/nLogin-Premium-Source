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

public enum NLoginCore_077 {
   a,
   b,
   c,
   d,
   e,
   f,
   g;

   private static String[] ZKM_STR_A = new String[NLoginCore_077.q];
   private static String[] ZKM_STR_B = new String[NLoginCore_077.r];
   private static long c;
   private static int a = (536870912 >>> 253 | 536870912 << ~253 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static int c = (Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << -63) & -1;
   private static int d = (0 >>> 159 | 0 << ~159 + 1) & -1;
   private static int e = 256 >>> 136 | 256 << -136;
   private static int f = Integer.reverse(0);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.reverse(0);
   private static int i = (458752 >>> 48 | 458752 << -48) & -1;
   private static int j = Integer.reverse(0);
   private static int k = (16777216 >>> 184 | 16777216 << ~184 + 1) & -1;
   private static int l = 8 >>> 194 | 8 << -194;
   private static int m = Integer.reverse(-1073741824);
   private static int n = Integer.reverse(536870912);
   private static int o = Integer.reverse(-1610612736);
   private static int p = Integer.reverse(1610612736);
   private static int q = (1879048192 >>> 92 | 1879048192 << ~92 + 1) & -1;
   private static int r = 234881024 >>> 89 | 234881024 << ~89 + 1;
   private static int s = Integer.reverse(0);
   private static int t = Integer.reverse(-1);
   private static long u = Long.reverse(-4075930353896669600L);
   private static int v = Integer.reverse(0);
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int x = Integer.reverse(-1);
   private static long y = Long.reverse(-4075930353896669600L);
   private static int z = 512 >>> 105 | 512 << ~105 + 1;
   private static int aa = 64 >>> 69 | 64 << -69;
   private static long ab = Long.reverse(-1049511404303696288L);
   private static long ac = Long.reverse(3891110078048108544L);
   private static int ad = Integer.reverse(1073741824);
   private static int ae = Integer.reverse(-1073741824);
   private static long af = Long.reverse(-1049511404303696288L);
   private static long ag = Long.reverse(3891110078048108544L);
   private static int ah = 402653184 >>> 27 | 402653184 << -27;
   private static int ai = (1073741824 >>> 28 | 1073741824 << -28) & -1;
   private static long aj = Long.reverse(-1049511404303696288L);
   private static long ak = Long.reverse(3891110078048108544L);
   private static int al = Integer.reverse(536870912);
   private static int am = Integer.reverse(-1610612736);
   private static long an = Long.reverse(-1049511404303696288L);
   private static long ao = Long.reverse(3891110078048108544L);
   private static int ap = 327680 >>> 240 | 327680 << -240;
   private static int aq = Integer.reverse(1610612736);
   private static long ar = Long.reverse(-1049511404303696288L);
   private static long as = Long.reverse(3891110078048108544L);
   private static int at = 25165824 >>> 214 | 25165824 << -214;

   public boolean a(NLoginCore_077 var1) {
      return ((this.ordinal() != 0) <= var1.ordinal() ? a : b);
   }

   public boolean c(NLoginCore_077 var1) {
      return ((this.ordinal() != 0) < var1.ordinal() ? e : f);
   }

   private static String a(int var0, long var1) {
      var1 ^= 108L;
      var1 ^= 1058734158105160944L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(13 + 56),
                     (byte)(71 + 12),
                     (byte)(36 + 11),
                     (byte)(62 + 5),
                     66,
                     (byte)(10 + 57),
                     47,
                     (byte)(57 + 23),
                     (byte)(2 + 73),
                     (byte)(7 + 60),
                     (byte)(57 + 26),
                     (byte)(49 + 4),
                     (byte)(10 + 70),
                     (byte)(77 + 20),
                     (byte)(91 + 9),
                     (byte)(95 + 5),
                     (byte)(17 + 88),
                     (byte)(66 + 44),
                     (byte)(2 + 101)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.B("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸӉӔӇӅӐӃӕҬӄӖҼӉӉӗ", (byte)61, 66));
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

   public boolean b(NLoginCore_077 var1) {
      return ((this.ordinal() != 0) >= var1.ordinal() ? c : d);
   }

   static {
      b();
   }

   private static void b() {
      c = 467674436452415119L;
      long var0 = c ^ 1058734158105160944L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(6 + 63),
               (byte)(53 + 30),
               (byte)(37 + 10),
               (byte)(16 + 51),
               66,
               (byte)(32 + 35),
               (byte)(44 + 3),
               (byte)(45 + 35),
               (byte)(63 + 12),
               (byte)(15 + 52),
               (byte)(54 + 29),
               (byte)(10 + 43),
               80,
               (byte)(95 + 2),
               (byte)(7 + 93),
               (byte)(47 + 53),
               (byte)(94 + 11),
               (byte)(102 + 8),
               (byte)(39 + 64)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_453.E("օվ֖֠ՠ֞֡֍֕պպի", (byte)103, 69);
               ZKM_STR_B[1] = NLoginCore_453.A("ǁƶƣƩƵǉƂƛƹƚƐƞƯƬƵǕǉƱƘǃǚǙƠơ", (byte)103, 65);
               ZKM_STR_B[2] = NLoginCore_173.D("ԿգՏՐԠԽդեզլԣԼ՞ՠԭՇղ՜ՓՕ՟ԮՅՐՒչ\u0557լղ՟Ւբ", (byte)103, 68);
               ZKM_STR_B[3] = NLoginCore_553.A("ƢǆƲƳƃƠǇǈǉǏƐƝƋǉǊǒǇƴǎƣǂǙƠơ", (byte)103, 65);
               ZKM_STR_B[4] = NLoginCore_141.F("քռ֑֒ս֑֎֛քատ֚֞֒բոփգ֮֘ռ֟նշ", (byte)103, 70);
               ZKM_STR_B[5] = NLoginCore_092.F("դժ֞ս֑֡պւ֝ծ\u0558֗տ֘\u058b֢֗֨֙ֈքֈֈղխփ֪\u0590կִղ֭֩\u058bչ֭նսָֺ֭֯ׄ\u058b", (byte)103, 70);
               ZKM_STR_B[6] = NLoginCore_387.A("ƮƦƻƼƧƻƸǅƮƋƫƍǂǎƼƒƓǗƶƋƬǉƠơ", (byte)103, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.E("֎ճպ֍խ֛՝ՠռ֥մ֢֓աՠչնֈֆփւչնշ", (byte)103, 69);
               ZKM_STR_B[1] = NLoginCore_471.D("՞ՓՀՆՒզԟԸՖԷԭեեԪԧՊԭԼեծՌՐԽԾ", (byte)103, 68);
               ZKM_STR_B[2] = NLoginCore_384.E("ո֜ֈ։ՙն֥֝֞֟՜յ֗֙զր֫֕\u058c֎֘խ֪֩կմճ֖֣֭֔ֆ֏֧֚֩֕ջׂ֖֚֟֯\u058b", (byte)103, 69);
               ZKM_STR_B[3] = NLoginCore_397.F("ո֜ֈ։ՙն֥֝֞֟զ֣֥յսջք֚֫շ֝։նշ", (byte)103, 70);
               ZKM_STR_B[4] = NLoginCore_173.D("ՋՃ\u0558ՙՄ\u0558ՕբՋԨՇԥԹԩԧդՑզխՌՃյըԺԱդմԹԱՐՑ\u0557", (byte)103, 68);
               ZKM_STR_B[5] = NLoginCore_076.B("ƎƔǈƧǋƻƤƬǇƘƂǁƩǂƵǁǌǒǃƲƮƲƲƜƗƭǔƺƙǞƜǓƥǥǅǜƷǕǛǫǍǪƸƵ", (byte)103, 66);
               ZKM_STR_B[6] = NLoginCore_453.D("ՋՃ\u0558ՙՄ\u0558ՕբՋԨՆԹՈկբՋԽ՟ԲդՌՅՁդԸՋՇՋխՐԾյ", (byte)103, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.A("ƝƛƿƪƲƺƕſƝƚƤƕ", (byte)103, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.C("ԜԣեԸՓԵՉՕ՚խգԲ", (byte)103, 67);
         }
      }
   }

   public boolean d(NLoginCore_077 var1) {
      return ((this.ordinal() != 0) > var1.ordinal() ? g : h);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_077.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.E("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 69), NLoginCore_077.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.B("ĚħĦéĩĥĠĩĴģðĮĲīĮĴö҇Ғ҅҃ҎҁғѪ҂ҔѺ҇҇ҕĐ", (byte)28, 66) + var1 + NLoginCore_559.C("у", (byte)28, 67) + var2.toString(), var4
         );
      }
   }
}
