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

public enum NLoginCore_198 {
   a(a(NLoginCore_198.m & NLoginCore_198.n, NLoginCore_198.o)),
   b(a(NLoginCore_198.t, NLoginCore_198.u ^ NLoginCore_198.v)),
   c(a(NLoginCore_198.aa, NLoginCore_198.ab ^ NLoginCore_198.ac)),
   d(a(NLoginCore_198.ah & NLoginCore_198.ai, NLoginCore_198.aj)),
   e(a(NLoginCore_198.ao & NLoginCore_198.ap, NLoginCore_198.aq)),
   f(a(NLoginCore_198.av & NLoginCore_198.aw, NLoginCore_198.ax));

   private final char[] a;
   private static String[] a = new String[NLoginCore_198.h];
   private static String[] b = new String[NLoginCore_198.i];
   private static long c;
   private static int a = Integer.reverse(1610612736);
   private static int b = Integer.reverse(0);
   private static int c = 1073741824 >>> 222 | 1073741824 << -222;
   private static int d = Integer.reverse(1073741824);
   private static int e = Integer.reverse(-1073741824);
   private static int f = (4194304 >>> 148 | 4194304 << ~148 + 1) & -1;
   private static int g = Integer.reverse(-1610612736);
   private static int h = 1536 >>> 7 | 1536 << ~7 + 1;
   private static int i = Integer.reverse(805306368);
   private static int j = Integer.reverse(0);
   private static long k = Long.reverse(-9097465967909737916L);
   private static int l = (0 >>> 128 | 0 << -128) & -1;
   private static int m = 4096 >>> 140 | 4096 << -140;
   private static int n = (-1 >>> 174 | -1 << ~174 + 1) & -1;
   private static long o = Long.reverse(-9097465967909737916L);
   private static int p = Integer.reverse(1073741824);
   private static int q = (-1 >>> 246 | -1 << ~246 + 1) & -1;
   private static long r = Long.reverse(-9097465967909737916L);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(-1073741824);
   private static long u = Long.reverse(3584670582765578820L);
   private static long v = Long.reverse(-5764607523034234880L);
   private static int w = Integer.reverse(536870912);
   private static long x = Long.reverse(3584670582765578820L);
   private static long y = Long.reverse(-5764607523034234880L);
   private static int z = Integer.reverse(1073741824);
   private static int aa = Integer.reverse(-1610612736);
   private static long ab = Long.reverse(3584670582765578820L);
   private static long ac = Long.reverse(-5764607523034234880L);
   private static int ad = Integer.reverse(1610612736);
   private static long ae = Long.reverse(3584670582765578820L);
   private static long af = Long.reverse(-5764607523034234880L);
   private static int ag = Integer.reverse(-1073741824);
   private static int ah = Integer.reverse(-536870912);
   private static int ai = Integer.reverse(-1);
   private static long aj = Long.reverse(-9097465967909737916L);
   private static int ak = 1 >>> 221 | 1 << -221;
   private static long al = Long.reverse(3584670582765578820L);
   private static long am = Long.reverse(-5764607523034234880L);
   private static int an = Integer.reverse(536870912);
   private static int ao = (9216 >>> 170 | 9216 << ~170 + 1) & -1;
   private static int ap = (-1 >>> 137 | -1 << -137) & -1;
   private static long aq = Long.reverse(-9097465967909737916L);
   private static int ar = Integer.reverse(1342177280);
   private static long as = Long.reverse(3584670582765578820L);
   private static long at = Long.reverse(-5764607523034234880L);
   private static int au = Integer.reverse(-1610612736);
   private static int av = (5767168 >>> 211 | 5767168 << ~211 + 1) & -1;
   private static int aw = Integer.reverse(-1);
   private static long ax = Long.reverse(-9097465967909737916L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_198.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.B("ŧƉƋūƏƮƦƼƨŷƵƫƹƳżơǃǂƺǀƺƏ", (byte)96, 66), NLoginCore_198.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.E("տ\u058c\u058bՎ֎֊օ֎֙ֈՕ֓֗\u0590֓֙՛ࣲࣩࣟࣴࣄࣹࣶࣷࣧ࣫࣠ࣛࣙ\u08e2ࣿն", (byte)96, 69) + var1 + NLoginCore_451.E("Ֆ", (byte)96, 69) + var2.toString(), var4
         );
      }
   }

   private NLoginCore_198(String var3) {
      this.a = var3.toCharArray();
   }

   private static void b() {
      c = 2474465525081767308L;
      long var0 = c ^ 426458418149769745L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(22 + 47),
               (byte)(49 + 34),
               (byte)(9 + 38),
               (byte)(47 + 20),
               (byte)(9 + 57),
               67,
               (byte)(44 + 3),
               (byte)(50 + 30),
               (byte)(10 + 65),
               (byte)(12 + 55),
               (byte)(67 + 16),
               (byte)(39 + 14),
               (byte)(37 + 43),
               (byte)(71 + 26),
               (byte)(60 + 40),
               100,
               (byte)(90 + 15),
               (byte)(8 + 102),
               (byte)(23 + 80)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.D("ք՚֒֔ծհ֖՛֏֊տը", (byte)121, 68);
               b[1] = NLoginCore_446.B("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǴǗǦǽǷȎǭǣǊȌǨǙ", (byte)121, 66);
               b[2] = NLoginCore_433.A("ƨǕǣƵǛǇƯƫƲǨǔƹ", (byte)121, 65);
               b[3] = NLoginCore_183.F("զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡\u05ccֽ\u05ccׂ֣֧֞֔\u05c9ָ֭֝", (byte)121, 70);
               b[4] = NLoginCore_521.A("ƳǀƞƷƹǤƿǟƩǰǦǂǡƮǆƳǨƶǼǅǿǗǄǅ", (byte)121, 65);
               b[5] = NLoginCore_183.F(
                  "֩֫֬տղ֝֏խ֩օկְְֲֶֽ֤֤֣֭֜պքָ֤֣֝ֈցָ֖֠֙אּ׆֏֨\u05ccֽדזדֹׄ׆֛\u05c8מ֨׀֜אִ֬׀ו־֧ס׆םַפ\u05ee\u05ecֿ\u05c9\u05c9ץפתה״\u05c8ֽ", (byte)121, 70
               );
               b[6] = NLoginCore_384.B("ǡǋƶƾǮƿǑǤƭƲƽǉǏǶǐǯƲǺǆǦǉǇǄǅ", (byte)121, 66);
               b[7] = NLoginCore_451.D("֖֔֗ժ՝ֈպ\u0558֔հ՚֏֏֛֨֝֡֘և֛֎եկ֏ֈ֣֎ճլ\u058b֣ցքփֶ֝ոָֹ֞ջֵֹׅ֧֚֜ցֿևփփև֦֓֔", (byte)121, 68);
               b[8] = NLoginCore_223.E("\u058b֎֤ևֱ֥֞֔ֈֶֶս", (byte)121, 69);
               b[9] = NLoginCore_427.A("ƩǢǠǫǮǋǝǪǨǥǵǐƳǈǍƱǙƺǏƼǾǇǄǅ", (byte)121, 65);
               b[10] = NLoginCore_559.E("շքբջս֨փ֣խִֵ֛֭֕մ֎ֹո֯֏պְ֚\u0590ֵָֺּׁ֚֡֞", (byte)121, 69);
               b[11] = NLoginCore_387.E(
                  "զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡ֈֈ׀ֳ֟ה֍ֶ֦\u05ce֤\u05c8חִ֔\u05ccֻ׀־֠אד׃֛֦י֧צִו־פֽ֠֫ׄלץדהנשץ֫׆\u05edֳָ\u05fc\u05f8ר\u05fe׳\u0601\u05c8\u05c9",
                  (byte)121,
                  69
               );
               break;
            case 1:
               b[0] = NLoginCore_027.E("֩օփ֒֏֞ևփքֱֵ֓֡֘֏օ\u0590\u0590־ֱֳ֩ֈ։", (byte)121, 69);
               b[1] = NLoginCore_127.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǵȂǆǆǙǦȇǪȄǢǜǙ", (byte)121, 65);
               b[2] = NLoginCore_092.C("պգ֏ջՙֈկ֏ձ֟ՠկ֚֡֗ււըմըռ֬ճմ", (byte)121, 67);
               b[3] = NLoginCore_138.E("զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡ր֍ֺ֎ג\u058b\u05caׅג֫֨֝", (byte)121, 69);
               b[4] = NLoginCore_232.C("բկՍզը֓ծ֎\u0558֢֟֘հրօ֥֦֪֨և֣֟վո֯ժ֢֮֊ֱ֥֒", (byte)121, 67);
               b[5] = NLoginCore_521.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǕȌǸȂǋǤȈǹȏȒȏǵȀȂǗȄȚǤǼǘȌǰǨǼȑǺǣȝȂșǳȠǜȘșȢȤȯȐǯǱǬǦȟȞȋȳȦȍȖǲȲȇȽȄȅ", (byte)121, 65);
               b[6] = NLoginCore_530.E("֥֏պւֲփ֕֨ձնր\u0590լ֦֍֥չ֚֗֕֊վռְׅ֕\u0590ֆֻ\u05cc֙\u05cb", (byte)121, 69);
               b[7] = NLoginCore_201.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǕǔȇǮǉȉǯȊǌǭȋǤȃȅȃȌȇǑǴǭǔȍǤǥ", (byte)121, 65);
               b[8] = NLoginCore_110.D("ե֛կթ՛կ֜մ֊ն֒ռ֖՞֦֒մ֔շն֤֬ճմ", (byte)121, 68);
               b[9] = NLoginCore_138.F("խֲ֦֤֯֏ַ֮֡֬֩յְָղ֛շձַ֮֟\u058bֈ։", (byte)121, 70);
               b[10] = NLoginCore_004.D("բկՍզը֓ծ֎\u0558֟֘֠ֆր՟չ֤գ֚պե\u058c֝֩ըռ֓կ։֥֫֏ֳճ֥\u0590ֆյվ֕\u0590ְ֣ֈ", (byte)121, 68);
               b[11] = NLoginCore_138.C(
                  "ՑհՕզ\u0558\u0557֛֑֔կ֝բ֢զմ֥՟֝տֈ֗էպխ֎թձֆ֎֭֔\u058cճճ֫֊ֿ֞ոֹ֑֡֏ֳׂտַ֦֟֫֩\u058bֻ־֮ֆ֑ׄ֒ב֟׀֩\u05cf\u058bׇ֖֨֯א־ֿ\u05cbה\u05cfֱ\u05cdְ֧הדנצ\u05c8ֵ֭ר\u05cb\u05ecעׇוׂ֫הש",
                  (byte)121,
                  67
               );
               break;
            case 2:
               b[0] = NLoginCore_091.F("և֨օ։֪֍֜փ֥֣֫\u0590ִ֤֛֖\u0590ռֳׁ֠֝ֈ։", (byte)121, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_521.D("Ջ\u058cճ՛֞ռ՟լ֊նռկկռ՞ռ֝ս֟րթնճմ", (byte)121, 68);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 13L;
      var1 ^= 426458418149769745L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(2 + 66),
                     (byte)(45 + 24),
                     (byte)(49 + 34),
                     (byte)(19 + 28),
                     (byte)(42 + 25),
                     (byte)(31 + 35),
                     (byte)(64 + 3),
                     (byte)(29 + 18),
                     (byte)(20 + 60),
                     (byte)(50 + 25),
                     (byte)(32 + 35),
                     (byte)(42 + 41),
                     (byte)(44 + 9),
                     (byte)(20 + 60),
                     (byte)(76 + 21),
                     (byte)(16 + 84),
                     (byte)(39 + 61),
                     (byte)(22 + 83),
                     110,
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.E("֓֠֟բ֢֢֭֞֙֜թ֧֤֧֭֫կࣳࣽईआࣘऋऍࣻࣿऊ࣯࣭ࣶࣴओ", (byte)116, 69));
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
}
