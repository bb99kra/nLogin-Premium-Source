package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

public class NLoginCore_573 implements NLoginInterface_037 {
   private static int ab = Integer.reverse(0);
   private static String[] a = new String[NLoginCore_573.ax];
   private static int at = 603979776 >>> 186 | 603979776 << -186;
   private static long av = Long.reverse(6485183463413514240L);
   private static int an = (128 >>> 228 | 128 << -228) & -1;
   private static int j = (33554432 >>> 120 | 33554432 << ~120 + 1) & -1;
   private static int bb = Integer.reverse(2097152);
   private static long k = Long.reverse(-4049707589585552514L);
   private static long e = Long.reverse(6485183463413514240L);
   private static int t = -1 >>> 8 | -1 << -8;
   private static long ai = Long.reverse(6485183463413514240L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long al = Long.reverse(-4049707589585552514L);
   private static long u = Long.reverse(-4049707589585552514L);
   private static int bd = Integer.reverse(-1);
   private static int ay = ('퀀' >>> 172 | 53248 << -172) & -1;
   private static int b = Integer.reverse(0);
   private static int af = Integer.reverse(2097152);
   private static int ag = Integer.reverse(1610612736);
   private static final char[] d = a(NLoginCore_573.bf, NLoginCore_573.bg).toCharArray();
   private static int am = Integer.reverse(0);
   private static int aa = (0 >>> 206 | 0 << ~206 + 1) & -1;
   public static final String cr = a(NLoginCore_573.bc & bd, NLoginCore_573.be);
   private static String[] b = new String[ay];
   private static int bc = 5632 >>> 41 | 5632 << ~41 + 1;
   private static final int aB = bb;
   private static int v = 0 >>> 157 | 0 << ~157 + 1;
   private static int aw = (64 >>> 6 | 64 << -6) & -1;
   private static int ar = Integer.reverse(Integer.MIN_VALUE);
   private static int l = (196608 >>> 176 | 196608 << ~176 + 1) & -1;
   private static int a = (0 >>> 213 | 0 << ~213 + 1) & -1;
   private static int as = Integer.reverse(-4194305);
   private static long ao = Long.reverse(-7076126539178525826L);
   private static int s = 1280 >>> 136 | 1280 << ~136 + 1;
   private static int az = Integer.reverse(1342177280);
   private static int bf = 6291456 >>> 19 | 6291456 << -19;
   private static long ba = Long.reverse(-4049707589585552514L);
   private static int ad = 536870912 >>> 125 | 536870912 << -125;
   private static long c;
   private static final String cs = a(az, ba);
   private static long n = Long.reverse(-4049707589585552514L);
   private static long ah = Long.reverse(-7076126539178525826L);
   private static int ak = Integer.reverse(-1);
   private static long be = Long.reverse(-4049707589585552514L);
   private static long q = Long.reverse(-7076126539178525826L);
   private static int ae = 0 >>> 87 | 0 << -87;
   private static long bg = Long.reverse(-4049707589585552514L);
   private static int p = Integer.reverse(536870912);
   private static int ac = Integer.reverse(0);
   private static long r = Long.reverse(6485183463413514240L);
   private static int y = (0 >>> 190 | 0 << ~190 + 1) & -1;
   private static long au = Long.reverse(-7076126539178525826L);
   private static int aq = 0 >>> 192 | 0 << -192;
   private static int m = Integer.reverse(-1);
   private static long ap = Long.reverse(6485183463413514240L);
   private static int o = (65536 >>> 208 | 65536 << ~208 + 1) & -1;
   private static long h = Long.reverse(6485183463413514240L);
   private static int z = Integer.reverse(8388608);
   private static long g = Long.reverse(-7076126539178525826L);
   private static int ax = 1744830464 >>> 27 | 1744830464 << -27;
   private static long d = Long.reverse(-7076126539178525826L);
   private static int w = 262144 >>> 146 | 262144 << -146;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int x = Integer.reverse(1073741824);
   private static int aj = Integer.reverse(-536870912);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_573.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), NLoginCore_573.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_141.C("ЭкйϼмигмчжЃсхосчЉޠޤޖޜއޡޥޘޔއП", (byte)7, 67) + var1 + NLoginCore_451.D("Є", (byte)7, 68) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   @Override
   public boolean i(String var1, String var2) {
      var2 = var2.substring(a, var2.length() - a(b, d ^ e).length());
      String[] var3 = var2.split(a(f, g ^ h));
      String var4 = var3[i];
      Pattern var5 = Pattern.compile(a(j, k) + var4 + a(l & m, n));
      if (var4.length() <= o) {
         var5 = Pattern.compile(a(p, q ^ r) + var4 + a(s & t, u));
      }

      Matcher var6 = var5.matcher(var2);
      if (!var6.matches()) {
         return (boolean)v;
      } else {
         int var7 = b(Integer.parseInt(var6.group(w)));
         byte[] var8 = Base64.getUrlDecoder().decode(var6.group(x));
         byte[] var9 = Arrays.copyOfRange(var8, y, z);
         char[] var10 = d;
         int var11 = var10.length;

         for (int var12 = aa; var12 < var11; var12++) {
            char var13 = var10[var12];
            String var14 = var1 + var13;
            byte[] var15 = a(var14.toCharArray(), var9, var7);
            int var16 = ab;

            for (int var17 = ac; var17 < var15.length; var17++) {
               var16 |= var8[var9.length + var17] ^ var15[var17];
            }

            if (var16 == 0) {
               return (boolean)ad;
            }
         }

         return (boolean)ae;
      }
   }

   private static byte[] a(char[] var0, byte[] var1, int var2) {
      PBEKeySpec var3 = new PBEKeySpec(var0, var1, var2, af);

      try {
         SecretKeyFactory var4 = SecretKeyFactory.getInstance(a(ag, ah ^ ai));
         return var4.generateSecret(var3).getEncoded();
      } catch (InvalidKeySpecException var5) {
         NLoginCore_370.c(a(aj & ak, al), var5);
      } catch (NoSuchAlgorithmException var6) {
         NLoginCore_370.c(a(an, ao ^ ap), var6);
      }

      return new byte[ar];
   }

   private static String a(int var0, long var1) {
      var1 ^= 90L;
      var1 ^= -8540387507774715354L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(46 + 23),
                     (byte)(23 + 60),
                     (byte)(15 + 32),
                     67,
                     (byte)(53 + 13),
                     (byte)(43 + 24),
                     (byte)(10 + 37),
                     (byte)(58 + 22),
                     (byte)(54 + 21),
                     67,
                     (byte)(34 + 49),
                     (byte)(45 + 8),
                     (byte)(3 + 77),
                     (byte)(10 + 87),
                     (byte)(76 + 24),
                     (byte)(6 + 94),
                     (byte)(44 + 61),
                     (byte)(41 + 69),
                     (byte)(53 + 50)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.E("ֈ֕֔\u0557֗֓֎֢֑֗՞֢֜֠֙֜դࣱࣻࣿࣷ\u08e2ࣼऀ࣯ࣳ\u08e2", (byte)105, 69));
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

   private static void b() {
      c = 9141517188189991865L;
      long var0 = c ^ -8540387507774715354L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(50 + 19),
               83,
               (byte)(36 + 11),
               (byte)(29 + 38),
               (byte)(34 + 32),
               (byte)(60 + 7),
               (byte)(18 + 29),
               (byte)(16 + 64),
               (byte)(62 + 13),
               (byte)(36 + 31),
               83,
               (byte)(50 + 3),
               (byte)(78 + 2),
               (byte)(32 + 65),
               (byte)(94 + 6),
               (byte)(79 + 21),
               (byte)(52 + 53),
               (byte)(26 + 84),
               (byte)(51 + 52)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(52 + 31)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_575.A("ŲĻŎŲŌŜſŏůŝŃŧŝŔśŕŃņŠūƄřŖŗ", (byte)66, 65);
               b[1] = NLoginCore_446.E("յճ՚՚ԶԵՉ՚՞ՍճՆ", (byte)66, 69);
               b[2] = NLoginCore_384.F("յճ՚՚ԶԵՉ՚՞ՍճՆ", (byte)66, 70);
               b[3] = NLoginCore_427.E("ԵիՐՅհեԹՆՇ՝ՓիՓՏՖծշքՅբ՛֊֊խՅկ֒֊կզհշ", (byte)66, 69);
               b[4] = NLoginCore_232.B("źŸşşĻĺŎşţŒŸŋ", (byte)66, 66);
               b[5] = NLoginCore_201.B("ĺŰŕŊŵŪľŋŌŢŘŰŘŔśųżƉŊŧŠƏƏŲŊŴƗƏŴūŵż", (byte)66, 66);
               b[6] = NLoginCore_241.B("œŪſŵůůźżƄľŜŀŅųƇƈŠũťżƈƀƃţŌŋƏŠŗŲƚż", (byte)66, 66);
               b[7] = NLoginCore_384.E("եեԱՑ՛ԮԶ\u0558ԷՋն՜ԽՎ\u0557ծջձքՂդժգՉՁՂ֎իֈ՟ացօև֍Օ֏Փ՝ֈտ֝֙֍֤֟՝֤֑դ֛֙֟֞գնթխ֟լ֑֒֞\u0590", (byte)66, 69);
               b[8] = NLoginCore_553.B("ŪŪĶŖŠĳĻŝļŐŻšłœŜųƀŶƉŇũźƅōŊƃŠōƈƊŴűŔƎũƞƘźžŮƖŹƖŦƣſŤƜŧžƆƗƙƢƄƤƫƵƊƉƪƤƤƚźƒƬƏŽƻƿǁƵƾƐƴǅƹƖƤžƜƝǃƿǏƖƗ", (byte)66, 66);
               b[9] = NLoginCore_110.F("ճճՔ՛խԴշԹԸՋՀՆ", (byte)66, 70);
               b[10] = NLoginCore_183.B("œŪſŵůůźżƄľŜŀŅųƇƈŠũťżƈƀƃţŌŋƏŠŗŲƚż", (byte)66, 66);
               b[11] = NLoginCore_324.B("ŲĻŎŲŌŜſŏůŝŃŧŝŔśŕŃņŠūƄřŖŗ", (byte)66, 66);
               b[12] = NLoginCore_427.C("ӓӮҭӸӳӓӐӖәӬӷӸӵӔҾӔӝӥӤӾӜҿӡӫӇӻӊӨԈԆӒӉӔӡӯӢӭԚԇӪӤԐӾӰӾԗӔӽӠԦԦԜԣԣԃӢԝԮӺԗӫӪӾԓӮԵԈӷԮԳԵӲԱԈԸԮԯԑԟԋӿԎՆԥԣԑԎԏ", (byte)66, 67);
               break;
            case 1:
               b[0] = NLoginCore_521.B("ŲĻŎŲŌŜſŏůŝńƇľŢūłŪƃŞŸƈũŖŗ", (byte)66, 66);
               b[1] = NLoginCore_091.B("ŐĳŵŷŨųŽŹżĻƀŋ", (byte)66, 66);
               b[2] = NLoginCore_427.E("ՒչզՙՃժՏԹԻ\u0557ՕՆ", (byte)66, 69);
               b[3] = NLoginCore_127.D("ҲӨӍӂӭӢҶӃӄӚӐӨӐӌӓӫӴԁӂӟӘӂӊӿӴӹӗԎӜӼӭӒԎԔӭӦӵԌӦӶӪԔӲӣ", (byte)66, 68);
               b[4] = NLoginCore_553.B("ŐĳŵŷŨųŽŹżĻƀŋ", (byte)66, 66);
               b[5] = NLoginCore_530.D("ҲӨӍӂӭӢҶӃӄӚӐӨӐӌӓӫӴԁӂӟӘӃӇӆӢӷԇӬӌӝԄԀӰӐӶӨԂӦԃԙԆӷӦӣ", (byte)66, 68);
               b[6] = NLoginCore_183.F("ՎեպհժժյշտԹ\u0557ԻՀծւփ՛դՠշփև\u058c՜ջՏցքգ֎փդ", (byte)66, 70);
               b[7] = NLoginCore_451.D("ӢӢҮӎӘҫҳӕҴӈӳәҺӋӔӫӸӮԁҿӡӧӠӆҾҿԋӨԅӜӞӾԂԄԊӒԌӐӚԅӼԚԖԊԡԜӚԡԎӡԖԘԜԣԔӦӽԈԚԩԙԦԧԯԃԎԷӲԲӱԛӺӹԧ\u0530ԃ", (byte)66, 68);
               b[8] = NLoginCore_384.C("ӢӢҮӎӘҫҳӕҴӈӳәҺӋӔӫӸӮԁҿӡӲӽӅӂӻӘӅԀԂӬөӌԆӡԖԐӲӶӦԎӱԎӞԛӷӜԔӟӶӾԏԑԚӼԜԣԭԂԁԢԜԜԒӲԊԤԇӵԳԷԹԭԶԉԟՀԁԞԋԯԒՇԶԺՇԎԏ", (byte)66, 67);
               b[9] = NLoginCore_521.E("ՐԲժԹՆՙ՛ԺռցյԼյարՁւջ՜ֆքպՑՒ", (byte)66, 69);
               b[10] = NLoginCore_183.E("ՎեպհժժյշտԹ\u0557ԻՀծւփ՛դՠշփփդկրսֈիղֈմդ", (byte)66, 69);
               b[11] = NLoginCore_433.D("ӪҳӆӪӄӔӷӇӧӕһӠҺһһҺӥӐӦӿәӷӎӏ", (byte)66, 68);
               b[12] = NLoginCore_384.A("śŶĵƀŻśŘŞšŴſƀŽŜņŜťŭŬƆŤŇũųŏƃŒŰƐƎŚőŜũŷŪŵƢƏŲŬƘƆŸƆƟŜƅŨƮƮƤƫƫƋŪƥƶƂƟųŲƆƛŶƽƐſƶƻƽźƹƐǃƘƶƂƤǋƌƆǁƘƆǏƖƗ", (byte)66, 65);
               break;
            case 2:
               b[0] = NLoginCore_530.F("Կ\u0558ՙՖյղ՞ԺռվՕՆ", (byte)66, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.F("ՋՀպՉէՒս\u0558\u0558սԽՎւջԽՏՕՄժիՙս֊լևցձկժՠփտ", (byte)66, 70);
         }
      }
   }

   private static int b(int var0) {
      if ((var0 & as) != 0) {
         throw new IllegalArgumentException(a(at, au ^ av) + var0);
      } else {
         return aw << var0;
      }
   }
}
