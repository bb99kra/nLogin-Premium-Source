package com.nickuc.login;

import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_496 {
   private static String[] ZKM_STR_B = new String[NLoginCore_496.az];
   public static final GeneralSecurityException b = new GeneralSecurityException(a(NLoginCore_496.bv, NLoginCore_496.bw ^ NLoginCore_496.bx));
   private static int aa = 32 >>> 130 | 32 << -130;
   private static int k = Integer.reverse(-1073741824);
   private static int al = Integer.reverse(805306368);
   private static long u = Long.reverse(-5327812542977482321L);
   private static int ca = 3145728 >>> 17 | 3145728 << ~17 + 1;
   private static int ao = Integer.reverse(-1342177280);
   private static int c = Integer.reverse(0);
   private static long bc = Long.reverse(2882303761517117440L);
   private static long cc = Long.reverse(-5327812542977482321L);
   public static final byte[] g = new byte[NLoginCore_496.by];
   private static int bd = 278528 >>> 46 | 278528 << -46;
   private static long h = Long.reverse(-7057194799887752785L);
   private static int y = Integer.reverse(-536870912);
   private static int j = 0 >>> 18 | 0 << ~18 + 1;
   private static int bm = Integer.reverse(671088640);
   private static int au = Integer.reverse(1073741824);
   private static long e = Long.reverse(-7057194799887752785L);
   private static int o = (8 >>> 193 | 8 << ~193 + 1) & -1;
   private static int ay = 27648 >>> 106 | 27648 << -106;
   private static int cb = Integer.reverse(-1);
   private static int ag = Integer.reverse(1342177280);
   private static long bw = Long.reverse(-7057194799887752785L);
   private static long ce = Long.reverse(-5327812542977482321L);
   private static long w = Long.reverse(-7057194799887752785L);
   private static long bt = Long.reverse(-7057194799887752785L);
   private static int cf = (13 >>> 255 | 13 << -255) & -1;
   private static long cg = Long.reverse(-7057194799887752785L);
   private static long bh = Long.reverse(-7057194799887752785L);
   private static int d = (2097152 >>> 213 | 2097152 << -213) & -1;
   private static long bb = Long.reverse(-7057194799887752785L);
   private static long b = Long.reverse(-5327812542977482321L);
   public static final NLoginCore_414<String, String> b = NLoginCore_414.a(
      a(bm, NLoginCore_496.bn ^ NLoginCore_496.bo), a(NLoginCore_496.bp, NLoginCore_496.bq ^ NLoginCore_496.br)
   );
   public static final GeneralSecurityException a = new GeneralSecurityException(a(NLoginCore_496.bs, bt ^ NLoginCore_496.bu));
   private static int bj = Integer.reverse(-939524096);
   private static long af = Long.reverse(2882303761517117440L);
   private static long an = Long.reverse(2882303761517117440L);
   private static final KeyFactory a;
   private static long bl = Long.reverse(2882303761517117440L);
   private static int cd = Integer.reverse(-1744830464);
   private static long ap = Long.reverse(-7057194799887752785L);
   public static final String ch = a(bd, NLoginCore_496.be ^ NLoginCore_496.bf);
   private static int ba = 64 >>> 226 | 64 << -226;
   private static int aw = Integer.reverse(-1);
   private static int m = Integer.reverse(268435456);
   private static long l = Long.reverse(-5327812542977482321L);
   private static long ac = Long.reverse(2882303761517117440L);
   private static int bs = (180224 >>> 109 | 180224 << ~109 + 1) & -1;
   private static long bk = Long.reverse(-7057194799887752785L);
   private static final PublicKey a;
   private static long ak = Long.reverse(2882303761517117440L);
   private static int s = (5120 >>> 234 | 5120 << -234) & -1;
   private static int av = -2147483641 >>> 223 | -2147483641 << ~223 + 1;
   public static final String cg = a(ba, bb ^ bc);
   private static long ch = Long.reverse(2882303761517117440L);
   private static long i = Long.reverse(2882303761517117440L);
   private static long bn = Long.reverse(-7057194799887752785L);
   private static int bp = 352321536 >>> 56 | 352321536 << -56;
   private static int t = Integer.reverse(-1);
   private static int by = (0 >>> 199 | 0 << -199) & -1;
   private static long x = Long.reverse(2882303761517117440L);
   private static long am = Long.reverse(-7057194799887752785L);
   private static int v = Integer.reverse(1610612736);
   private static long bi = Long.reverse(2882303761517117440L);
   private static long p = Long.reverse(-7057194799887752785L);
   private static int ai = (5767168 >>> 211 | 5767168 << ~211 + 1) & -1;
   private static int a = 0 >>> 11 | 0 << ~11 + 1;
   private static long f = Long.reverse(2882303761517117440L);
   private static long ah = Long.reverse(-5327812542977482321L);
   private static String[] ZKM_STR_A = new String[ay];
   private static long bu = Long.reverse(2882303761517117440L);
   private static long be = Long.reverse(-7057194799887752785L);
   private static int r = (64 >>> 70 | 64 << -70) & -1;
   private static long z = Long.reverse(-5327812542977482321L);
   private static long bf = Long.reverse(2882303761517117440L);
   private static int az = Integer.reverse(-671088640);
   private static int ar = Integer.reverse(134217728);
   private static final Encoder a = Base64.getMimeEncoder(NLoginCore_496.bz, a(ca & cb, cc).getBytes(StandardCharsets.UTF_8));
   private static int bg = 72 >>> 130 | 72 << ~130 + 1;
   private static long ab = Long.reverse(-7057194799887752785L);
   private static long br = Long.reverse(2882303761517117440L);
   private static long ax = Long.reverse(-5327812542977482321L);
   private static long ae = Long.reverse(-7057194799887752785L);
   public static final NLoginCore_414<String, String> a = NLoginCore_414.a(a(bg, bh ^ bi), a(bj, bk ^ bl));
   private static int ad = 2359296 >>> 18 | 2359296 << -18;
   private static int n = 0 >>> 189 | 0 << ~189 + 1;
   private static long c;
   private static long aj = Long.reverse(-7057194799887752785L);
   private static int bz = Integer.reverse(838860800);
   private static long q = Long.reverse(2882303761517117440L);
   private static int bv = (376832 >>> 14 | 376832 << -14) & -1;
   private static int g = 512 >>> 200 | 512 << -200;
   private static long bo = Long.reverse(2882303761517117440L);
   private static long bq = Long.reverse(-7057194799887752785L);
   private static int as = 3584 >>> 232 | 3584 << -232;
   private static long at = Long.reverse(-5327812542977482321L);
   private static long bx = Long.reverse(2882303761517117440L);
   private static long aq = Long.reverse(2882303761517117440L);

   public static byte[] a(KeyPair var0, byte[] var1) {
      Cipher var2 = Cipher.getInstance(a(as, at));
      var2.init(au, var0.getPrivate());
      return var2.doFinal(var1);
   }

   public static String a(Key var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(a(v, w ^ x));
      } else {
         NLoginCore_414 var1;
         if (var0 instanceof PublicKey) {
            var1 = a;
         } else {
            if (!(var0 instanceof PrivateKey)) {
               throw new IllegalArgumentException(a(y, z));
            }

            var1 = b;
         }

         return (String)var1.i() + a(aa, ab ^ ac) + c(var0.getEncoded()) + a(ad, ae ^ af) + (String)var1.j() + a(ag, ah);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_496.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_471.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_496.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.B("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԻԥՊԧԱԝԽԱՍՁՏǉ", (byte)122, 66) + var1 + NLoginCore_201.A("ƭ", (byte)122, 65) + var2.toString(), var4
         );
      }
   }

   public static byte[] a(String var0, NLoginCore_414<String, String> var1) {
      int var2 = var0.indexOf((String)var1.i());
      if (var2 < 0) {
         throw new IllegalArgumentException(a(o, p ^ q));
      } else {
         int var3 = ((String)var1.i()).length();
         int var4 = var0.indexOf((String)var1.j(), var3 + var2) + r;
         if (var4 <= 0) {
            throw new IllegalArgumentException(a(s & t, u));
         } else {
            return b(var0.substring(var2 + var3, var4));
         }
      }
   }

   public static KeyPair a(int var0) {
      try {
         KeyPairGenerator var1 = KeyPairGenerator.getInstance(a(al, am ^ an));
         var1.initialize(var0);
         return var1.generateKeyPair();
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(a(ao, ap ^ aq), var2);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 20L;
      var1 ^= -7018894880240368512L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(19 + 50),
                     (byte)(70 + 13),
                     (byte)(18 + 29),
                     67,
                     (byte)(8 + 58),
                     (byte)(18 + 49),
                     (byte)(22 + 25),
                     (byte)(71 + 9),
                     (byte)(15 + 60),
                     (byte)(15 + 52),
                     (byte)(5 + 78),
                     (byte)(10 + 43),
                     (byte)(67 + 13),
                     (byte)(79 + 18),
                     (byte)(13 + 87),
                     (byte)(12 + 88),
                     (byte)(44 + 61),
                     (byte)(46 + 64),
                     (byte)(61 + 42)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.F("֔֡֠գ֣֣֚֮֟֝ժ֥֮֨֬֨հࣹࣣई࣯࣯ࣥࣛࣻऋࣿऍ", (byte)117, 70));
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

   public static PublicKey b(byte[] var0) {
      try {
         return a.generatePublic(new X509EncodedKeySpec(var0));
      } catch (InvalidKeySpecException var2) {
         throw new IllegalArgumentException(a(ai, aj ^ ak));
      }
   }

   public static PublicKey a() {
      return a;
   }

   public static String c(byte[] var0) {
      return a.encodeToString(var0);
   }

   static {
      b();

      try {
         a = KeyFactory.getInstance(a(cd, ce));
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(var2);
      }

      try {
         byte[] var0 = NLoginCore_140.a(NLoginCore_140.a(a(cf, cg ^ ch)));
         a = b(var0);
      } catch (NullPointerException | IOException var1) {
         throw new RuntimeException(var1);
      }
   }

   public static byte[] a(long... var0) {
      ByteBuffer var1 = ByteBuffer.allocate(m * var0.length).order(ByteOrder.BIG_ENDIAN);
      long[] var2 = var0;
      int var3 = var0.length;

      for (int var4 = n; var4 < var3; var4++) {
         long var5 = var2[var4];
         var1.putLong(var5);
      }

      return var1.array();
   }

   public static byte[] b(String var0) {
      return Base64.getMimeDecoder().decode(var0);
   }

   private static void b() {
      c = -754582073595662215L;
      long var0 = c ^ -7018894880240368512L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(27 + 41),
               (byte)(43 + 26),
               83,
               (byte)(30 + 17),
               (byte)(54 + 13),
               (byte)(10 + 56),
               (byte)(38 + 29),
               (byte)(4 + 43),
               80,
               (byte)(55 + 20),
               (byte)(18 + 49),
               (byte)(80 + 3),
               (byte)(30 + 23),
               (byte)(13 + 67),
               (byte)(5 + 92),
               (byte)(72 + 28),
               (byte)(28 + 72),
               (byte)(44 + 61),
               (byte)(57 + 53),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_183.A("ŝƒũœůƆŧƍƓśƊƠƟŸƑŝƘſźźƢŤƈųƚƁƢƦŭŪƛŭƀűſƥƥƩƄƺƜƾƴƃ", (byte)78, 65);
               ZKM_STR_B[1] = NLoginCore_530.E("ւվՔՃԹցմգ֊՛ՠոգՎՎժղՋՇ\u058bօ֙փ֑֓՜լտ֠֊՟֔բ\u0590ֆև՟֙֨֠թ֞֍ղ", (byte)78, 69);
               ZKM_STR_B[2] = NLoginCore_173.B("ŝƄƆųƁŔƋƏŔŜŽƟŮşƚŝŰśƔƏƈźƋƃƉƥŷƌơŨƩų", (byte)78, 66);
               ZKM_STR_B[3] = NLoginCore_223.F("ւվՔՃԹցմգ֊՛ՠոգՎՎժղՋՇ\u058bօ֙փ֑֓՜լտ֠֊՟֔բ\u0590ֆև՟֙֨֠թ֞֍ղ", (byte)78, 70);
               ZKM_STR_B[4] = NLoginCore_553.C("ԔӰӤԐԍӚӻӹӯӸӞӣӶԡԜԄӢԢӦӡӷӿԃԡԜԢԧԌԉӫԡӲӸԃԅԻӵԫԲԹԑӸՀԇ", (byte)78, 67);
               ZKM_STR_B[5] = NLoginCore_471.A("ƌţŴƆƆőźŧŜŲƏƞƁƢŷřƔŤŦƢƨšƥƦſƪƨŧƀŻƏƏƍƖƵƥƑƎƶƪƩƻƊƃ", (byte)78, 65);
               ZKM_STR_B[6] = NLoginCore_453.D("ӰԆԑԖԘԕӶӵӬӚӔӺӡӥԂӦԒԤԫӤԤӫԀԯԭԬԌԝӭӿӬԖ", (byte)78, 68);
               ZKM_STR_B[7] = NLoginCore_471.B("ƓƏťŔŊƒƅŴƛŬűžƕƔŴƀƂơƕſƈƦƚƈżţũŽƤŰƂž", (byte)78, 66);
               ZKM_STR_B[8] = NLoginCore_138.E("՚\u0558ջէԿՑՆռջռաՒ", (byte)78, 69);
               ZKM_STR_B[9] = NLoginCore_201.F("՚\u0558ջէԿՑՆռջռաՒ", (byte)78, 70);
               ZKM_STR_B[10] = NLoginCore_183.C("ӯӭԐӼӔӦӛԑԐԑӶӧ", (byte)78, 67);
               ZKM_STR_B[11] = NLoginCore_575.B("ƓƏťŔŊƒƅŴƛŬŰŶƕƗžƗŵţƓŢƤƆƫƬƔƮƅƚŦűƂƞ", (byte)78, 66);
               ZKM_STR_B[12] = NLoginCore_004.B("ƅžŧŴƔƁųůŗƏŮţ", (byte)78, 66);
               ZKM_STR_B[13] = NLoginCore_471.A("ƊŐƖŮŊƔƅũūŪųŮƛųŵŹźơƓƝŽŴžƢƔžƇƞƱƨƇƫƃƎƱƉŷƵƤƚƈƪưƃ", (byte)78, 65);
               ZKM_STR_B[14] = NLoginCore_027.E("մխՖգփհբ՞Նվ՝Ւ", (byte)78, 69);
               ZKM_STR_B[15] = NLoginCore_553.C("ԁӐӥԎԒԘԕӗӪԟԘӧ", (byte)78, 67);
               ZKM_STR_B[16] = NLoginCore_553.E("՛ՀՓՂ՛՜ՉՔփզՅթշՈՉռվՠֈբյՠ՝՞", (byte)78, 69);
               ZKM_STR_B[17] = NLoginCore_092.B("ƌūƋŒƌũƍŰŸƋųƏƘƐŲƖơŞůƓţƗŮů", (byte)78, 66);
               ZKM_STR_B[18] = NLoginCore_241.C("ӕӵӒӣӛԒӪԒԀӮԕԝԄԎԇӠӚӾԝӦԔԤԤԣԫԙԝԆԢӮԮԇԹԷԒԜӴԉԇԞԡԔ\u0530ԇ", (byte)78, 67);
               ZKM_STR_B[19] = NLoginCore_427.F("ԺցՔկԽմֆ՟նՈՅլտբՎ՜ՏգփՌըՔբգկըռխչ\u0557իո֔ց֝վֈ֚֙ժել֗ղ", (byte)78, 70);
               ZKM_STR_B[20] = NLoginCore_387.E("ՀՠԽՎՆսՕսիՙրֈկչղՋՅթֈՑտ֚֓ըզՙ֚֚թ՟ց\u058cողա֗ֈ։֜բ֝օչղ", (byte)78, 69);
               ZKM_STR_B[21] = NLoginCore_427.B("ŋƒťƀŎƅƗŰƇřŖŨųƌƀƓƅƓŷƐƠƟƤƜƪƎƆšƬƊƋƱƕƐƮƓơƳƛƙŴƸŽƃ", (byte)78, 66);
               ZKM_STR_B[22] = NLoginCore_530.F("բՁՐՒՠյսԼրԾւՋ՝լլֈՑբՕ֖\u0590Ւ֑հժք՝\u058b\u0558֒չ֖ի֡յճւ֒՟յմս֗ղ", (byte)78, 70);
               ZKM_STR_B[23] = NLoginCore_232.F("մԻագբՑՈևոՅ֊Նգ՞օ՜՞եժըզփէ֔չպ\u0590ռ֑Ֆ՜֣֡ցչ֧֝ՠմե֣֊֥ւռֈ֟֏֠լ֦֧֕֕ք֨օִ֫ֈտ\u0590վ֪", (byte)78, 70);
               ZKM_STR_B[24] = NLoginCore_324.A("ūũƌŸŐŢŗƍƌƍŲţ", (byte)78, 65);
               ZKM_STR_B[25] = NLoginCore_575.A("ƅžŧŴƔƁųůŗƏŮţ", (byte)78, 65);
               ZKM_STR_B[26] = NLoginCore_092.F("ւծՁՠաֈ՚դըՃ\u058bէփգ֑դՑյՒյքձ֏\u0558յ\u0558ձ֊֠ռ՜շ\u058b֢֦֓րչգ֙ռ֪֣ղ", (byte)78, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_091.E("Ռց\u0558Ղ՞յՖռւՊչ֏֎էրՌևծթթ֑Փշբ։հ֑֕՜ՙ֊՜ղդ֥֞֜֩և֗ֆ֪։ղ", (byte)78, 69);
               ZKM_STR_B[1] = NLoginCore_446.C("ԗԓөӘӎԖԉӸԟӰӵԍӸӣӣӿԇӠӜԠԚԮԘԨԦӱԁԔԵԟӴԩԙԎԣԏԧԔԘԻԘԠԞԇ", (byte)78, 67);
               ZKM_STR_B[2] = NLoginCore_553.A("ŝƄƆųƁŔƋƏŔŜŽƟŮşƚŝŰśƔƏƈŹƧƤƛźƁŨŬƪſƫƐŽƨƆƅƍƵƹƉƦưƃ", (byte)78, 65);
               ZKM_STR_B[3] = NLoginCore_183.D("ԗԓөӘӎԖԉӸԟӰӵԍӸӣӣӿԇӠӜԠԚԮԘԨԦӱԁԔԵԟӴԩӱӹԧԱԊԅԹԷԷՁӹԇ", (byte)78, 68);
               ZKM_STR_B[4] = NLoginCore_559.A("ƐŬŠƌƉŖŷŵūŴŚşŲƝƘƀŞƞŢŝųŻſƝƘƞƣƈƅŧƝŮƤƇƟƄƬƒƕưŲƥƒƓơźžƮƠŻƺŹǇƑƎƏ", (byte)78, 65);
               ZKM_STR_B[5] = NLoginCore_324.C("ԐӧӸԊԊӕӾӫӠӶԓԢԅԦӻӝԘӨӪԦԬӥԩԪԃԮԬӫԄӿԓԓӪӴԘԔӹԅӰԹԫԒԬԇ", (byte)78, 67);
               ZKM_STR_B[6] = NLoginCore_091.F("՛ձռցփրաՠ\u0557ՅԿեՌՐխՑս֏֖Տ֏֗ղ֊ղխ֖\u058bջ֚տ֒", (byte)78, 70);
               ZKM_STR_B[7] = NLoginCore_575.C("ԗԓөӘӎԖԉӸԟӰӵԂԙԘӸԄԆԥԙԃԌԢԏԧԃԀԝԎԂԇԀԠ", (byte)78, 67);
               ZKM_STR_B[8] = NLoginCore_387.F("սեՕզ՚յյք՝րՌՒ", (byte)78, 70);
               ZKM_STR_B[9] = NLoginCore_027.B("šŽŏƊŬŤŲųŽƅƌţ", (byte)78, 66);
               ZKM_STR_B[10] = NLoginCore_004.D("ӵӲӔӑԏԞԒӲԔӚԘӧ", (byte)78, 68);
               ZKM_STR_B[11] = NLoginCore_091.E("ւվՔՃԹցմգ֊՛՟եքֆխֆդՒւՑ֓քՐզ\u0558չո֜֝֎\u058c՜", (byte)78, 69);
               ZKM_STR_B[12] = NLoginCore_427.B("ƂœŮŴœƂŢŤŴŨŮţ", (byte)78, 66);
               ZKM_STR_B[13] = NLoginCore_241.F("չԿօ՝Թփմ\u0558՚ՙբ՝֊բդըթ\u0590ւ\u058cլգխ֑փխն֍֠֗ն֚չ֛֙֘ֈոօվըֈ֩շ֘հ֬պְ֒֠հւֶսվ", (byte)78, 70);
               ZKM_STR_B[14] = NLoginCore_201.D("ԎӏөӵӱӭӝӾӴԔԔӧ", (byte)78, 68);
               ZKM_STR_B[15] = NLoginCore_530.F("ւՎ՟ԼՔււՇֈշչՉփքձսթս\u058bմ֑ֆ՝՞", (byte)78, 70);
               ZKM_STR_B[16] = NLoginCore_521.C("ӰӕӨӗӰӱӞөԘӻӚԙӿӱӶӿԥӽӻԚԙӵӲӳ", (byte)78, 67);
               ZKM_STR_B[17] = NLoginCore_092.B("ƌūƋŒƌũƍŰŸƋŵŴźŭŹŵųůƖŵƄƁŶŢŶƪūƎƢŮƣƦ", (byte)78, 66);
               ZKM_STR_B[18] = NLoginCore_241.C("ӕӵӒӣӛԒӪԒԀӮԕԝԄԎԇӠӚӾԝӦԔԤԤԣԫԙԝԆԢӮԮԇӱԸԪԱԋӽ\u0530ԽԙӼԐՀԞԝԼ\u0530ԕԻԤՊԝԕԒԓ", (byte)78, 67);
               ZKM_STR_B[19] = NLoginCore_127.D("ӏԖөԄӒԉԛӴԋӝӚԁԔӷӣӱӤӸԘӡӽөӷӸԄӽԑԂԎӬԀԍԘԁԻԵӸԚԦԾԛӹԸԇ", (byte)78, 68);
               ZKM_STR_B[20] = NLoginCore_575.F("ՀՠԽՎՆսՕսիՙրֈկչղՋՅթֈՑտ֚֓ըզՙ֚֚թ՟ց\u058cր֔֠֒֘\u0590բ֛֩֫\u058bցսէ֧֮տցէմֶ֩սվ", (byte)78, 70);
               ZKM_STR_B[21] = NLoginCore_433.B("ŋƒťƀŎƅƗŰƇřŖŨųƌƀƓƅƓŷƐƠƟƤƜƪƎƆšƬƊƋƱŮƋƆŶưƢƵŵŴųźƇƹƟƬƗƙƚǀƹƃơƎƏ", (byte)78, 66);
               ZKM_STR_B[22] = NLoginCore_384.C("ӷӖӥӧӵԊԒӑԕӓԗӠӲԁԁԝӦӷӪԫԥӧԦԅӿԙӲԠӭԧԎԫԱԮԣԳԒԓԭԐԸӼӺԔԍՆԺՂՂԃԥԵԵԕԒԓ", (byte)78, 67);
               ZKM_STR_B[23] = NLoginCore_004.A("ƅŌŲŴųŢřƘƉŖƛŗŴůƖŭůŶŻŹŷƔŸƥƊƋơƍƢŧŭƴƲƒƊƸƮűƅŶƴƛƶƓƍƙưƠƱŽƦƷƸơƼƴƂƛǂƪǌƾƿǌƊƏƩƳǒǎǙƕƯǕǐƣ", (byte)78, 65);
               ZKM_STR_B[24] = NLoginCore_521.B("ŲţƌŴƀũƔƖƈŗƘţ", (byte)78, 66);
               ZKM_STR_B[25] = NLoginCore_241.D("ԖӘԕԄӳԋԌӝԚӵӮӧ", (byte)78, 68);
               ZKM_STR_B[26] = NLoginCore_451.C("ԗԃӖӵӶԝӯӹӽӘԠӼԘӸԦӹӦԊӧԊԙԆԤӭԊӭԆԟԵԑӱԌԫԎԢԩԧԘӴԚԊӹԶԯԽӼԡ\u0530ԆԇԠԫԈԻԒԓ", (byte)78, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_076.D("ԋӳԏԅөӏӫӚԛӝӿӸӲԔӸԔӣԆӪԟӹԅӲӳ", (byte)78, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.B("ťšŌƇŴƋŶŬŕƚŭřƈƊƐƞţŹžƈţƣƕƝŧƭƛƣźƩƱƃ", (byte)78, 66);
         }
      }
   }

   public static byte[] a(String var0, PrivateKey var1, byte[]... var2) {
      if (var2.length == 0) {
         throw new IllegalArgumentException(a(g, h ^ i));
      } else {
         try {
            Signature var3 = Signature.getInstance(var0);
            var3.initSign(var1);
            byte[][] var4 = var2;
            int var5 = var2.length;

            for (int var6 = j; var6 < var5; var6++) {
               byte[] var7 = var4[var6];
               var3.update(var7);
            }

            return var3.sign();
         } catch (GeneralSecurityException var8) {
            throw new IllegalArgumentException(a(k, l));
         }
      }
   }

   public static String d(byte[] var0) {
      return new BigInteger(var0).toString(ar);
   }

   public static boolean a(String var0, PublicKey var1, byte[] var2, byte[]... var3) {
      if (var3.length == 0) {
         throw new IllegalArgumentException(a(a, b));
      } else {
         try {
            Signature var4 = Signature.getInstance(var0);
            var4.initVerify(var1);
            byte[][] var5 = var3;
            int var6 = var3.length;

            for (int var7 = c; var7 < var6; var7++) {
               byte[] var8 = var5[var7];
               var4.update(var8);
            }

            return var4.verify(var2);
         } catch (GeneralSecurityException var9) {
            throw new IllegalArgumentException(a(d, e ^ f));
         }
      }
   }

   public static String a(String var0, byte[] var1, PublicKey var2) {
      try {
         MessageDigest var3 = MessageDigest.getInstance(a(av & aw, ax));
         var3.update(var0.getBytes(StandardCharsets.UTF_8));
         var3.update(var1);
         var3.update(var2.getEncoded());
         return d(var3.digest());
      } catch (NoSuchAlgorithmException var4) {
         throw new AssertionError(var4);
      }
   }
}
