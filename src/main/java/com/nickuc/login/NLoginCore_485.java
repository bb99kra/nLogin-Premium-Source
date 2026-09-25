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

public class NLoginCore_485 extends NLoginCore_353 {
   private static String[] ZKM_STR_B = new String[NLoginCore_485.ai];
   private static int ad = 491520 >>> 109 | 491520 << -109;
   private static int j = 536870912 >>> 125 | 536870912 << ~125 + 1;
   private static long v = Long.reverse(8646911284551352320L);
   private static int i = Integer.reverse(0);
   private static long q = Long.reverse(8646911284551352320L);
   private static int z = (6291456 >>> 116 | 6291456 << -116) & -1;
   private static int w = 83886080 >>> 152 | 83886080 << ~152 + 1;
   private static long g = Long.reverse(-2904363839179635279L);
   private static int ah = (229376 >>> 15 | 229376 << -15) & -1;
   private static long d = Long.reverse(-2904363839179635279L);
   private static long e = Long.reverse(8646911284551352320L);
   private static int ag = Integer.reverse(1006632960);
   private static int ac = 0 >>> 52 | 0 << ~52 + 1;
   private static int t = (16777216 >>> 182 | 16777216 << ~182 + 1) & -1;
   private static int r = Integer.reverse(0);
   private static int c = Integer.reverse(0);
   private static long c;
   private static long y = Long.reverse(8646911284551352320L);
   private static long p = Long.reverse(-2904363839179635279L);
   private static long h = Long.reverse(8646911284551352320L);
   private static String[] ZKM_STR_A = new String[ah];
   private static int f = (8388608 >>> 247 | 8388608 << ~247 + 1) & -1;
   private static long aa = Long.reverse(-2904363839179635279L);
   private static int af = 524288 >>> 211 | 524288 << ~211 + 1;
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static long n = Long.reverse(-5786667600696752719L);
   private static long u = Long.reverse(-2904363839179635279L);
   private static int k = Integer.reverse(0);
   private static int m = (524288 >>> 146 | 524288 << ~146 + 1) & -1;
   private static long ab = Long.reverse(8646911284551352320L);
   private static int l = (-1 >>> 66 | -1 << ~66 + 1) & -1;
   private static int o = Integer.reverse(-1073741824);
   private static int ai = 234881024 >>> 89 | 234881024 << ~89 + 1;
   private static int s = -1 >>> 209 | -1 << ~209 + 1;
   private static long x = Long.reverse(-2904363839179635279L);

   private static String a(int var0, long var1) {
      var1 ^= 30L;
      var1 ^= 7297841123801944993L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(64 + 5),
                     (byte)(5 + 78),
                     47,
                     (byte)(66 + 1),
                     (byte)(47 + 19),
                     (byte)(46 + 21),
                     (byte)(2 + 45),
                     80,
                     (byte)(66 + 9),
                     (byte)(49 + 18),
                     (byte)(56 + 27),
                     (byte)(29 + 24),
                     (byte)(57 + 23),
                     (byte)(57 + 40),
                     (byte)(35 + 65),
                     (byte)(36 + 64),
                     (byte)(8 + 97),
                     (byte)(107 + 3),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴӺԐԑԀӽԉԏӡԑ", (byte)91, 66));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_485.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.A("ŃťŧŇūƊƂƘƄœƑƇƕƏŘŽƟƞƖƜƖū", (byte)78, 65), NLoginCore_485.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.B("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӠӶӷӦӣӯӵӇӷů", (byte)78, 66) + var1 + NLoginCore_027.B("ŕ", (byte)78, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      NLoginCore_150.a(var1, NLoginCore_524.p != l ? a(m, n) : a(o, p ^ q));
      NLoginCore_370.e(var1.getName() + (NLoginCore_524.p != s ? a(t, u ^ v) : a(w, x ^ y)) + a(z, aa ^ ab));
      int var3 = ad;
      if (var2.length > ae) {
         var3 = NLoginCore_449.a(var2[af], var3);
      }

      NLoginCore_524.a(this.a, var3 > 0 ? var3 : ag);
   }

   public NLoginCore_485(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), a(f, g ^ h), (i != 0), (j != 0));
   }

   private static void b() {
      c = -8240834326065476117L;
      long var0 = c ^ 7297841123801944993L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(13 + 55),
               (byte)(66 + 3),
               (byte)(15 + 68),
               (byte)(46 + 1),
               (byte)(60 + 7),
               66,
               (byte)(10 + 57),
               (byte)(17 + 30),
               (byte)(26 + 54),
               (byte)(45 + 30),
               (byte)(27 + 40),
               (byte)(52 + 31),
               (byte)(44 + 9),
               (byte)(43 + 37),
               (byte)(16 + 81),
               (byte)(79 + 21),
               (byte)(95 + 5),
               (byte)(92 + 13),
               (byte)(70 + 40),
               (byte)(27 + 76)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.A("ãĐÏĂðěïĒĉûÛå", (byte)15, 65);
               ZKM_STR_B[1] = NLoginCore_092.F("ԃԑԵ\u0530ԕԅԴԷՂԍԚԛԙՆՇՉԲՁԕՄԎ\u0557Ԟԟ", (byte)15, 70);
               ZKM_STR_B[2] = NLoginCore_138.A("êĐñëõĆĚøĞėÛďñğēóþĨģĪöăÞėĜåæĥĄĒħò", (byte)15, 65);
               ZKM_STR_B[3] = NLoginCore_521.F("ԳԜԃԄՁԉՇԶՃԧԗՐՉԱԋՓԭԱԖՔՑԵՒԯ\u0558ՕՇՖԯԾՎԙՕ՟Ծ\u0558գ՟ՋԢըԨՂԳ", (byte)15, 70);
               ZKM_STR_B[4] = NLoginCore_433.B("ÓÉÎčÙĕÜþėĔýĘñúîĦĦññæ÷ęðñ", (byte)15, 66);
               ZKM_STR_B[5] = NLoginCore_092.F("ԣԣӼԖՀԟԗԗԫԵԽՊՇԜԚԦԫԫՋՇՔ\u0557Ԟԟ", (byte)15, 70);
               ZKM_STR_B[6] = NLoginCore_384.F("ԹԙԷԚԹԾԊԵԫԸՆՇՃԙԠՅԵԨԨԩՐԮԻՕԩԜԚԲՓՙԶԠ", (byte)15, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.F("ՂԏԢԓԨԪՋԃԧԕԿԎԟԨԤԪՐՋԭԴԓԱԞԟ", (byte)15, 70);
               ZKM_STR_B[1] = NLoginCore_559.A("ÕãćĂç×ĆĉĔßíðđàÝěăğóĊøæÞëýíħħċāëĪ", (byte)15, 65);
               ZKM_STR_B[2] = NLoginCore_127.F("ԘԾԟԙԣԴՈԦՌՅԉԽԟՍՁԡԬՖՑ\u0558ԤՂՒԩԙՌԝՑՙՎԫԞ", (byte)15, 70);
               ZKM_STR_B[3] = NLoginCore_127.F("ԳԜԃԄՁԉՇԶՃԧԗՐՉԱԋՓԭԱԖՔՑԵՒԯ\u0558ՕՇՖԯԾՎԙԱԛ\u0558ԥ\u0530Ը՚ՃԸԩՆԳ", (byte)15, 70);
               ZKM_STR_B[4] = NLoginCore_110.F("ԁӷӼԻԇՃԊԬՅՂԭԷԌԇԦԩԵԝԮՒԨԡԞԟ", (byte)15, 70);
               ZKM_STR_B[5] = NLoginCore_521.C("ккГЭїжЮЮтьіЦкѠєкЦужкуўеж", (byte)15, 67);
               ZKM_STR_B[6] = NLoginCore_471.B("ċëĉìċĐÜćýĊĘęĕëòėćúúûĢĂĩĚĤĜęĜüýðď", (byte)15, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.D("ыЭўъыВОНљёѣЪ", (byte)15, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.C("ёЧШЙБкСТвпћЪ", (byte)15, 67);
         }
      }
   }
}
