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

public enum NLoginCore_244 {
   a,
   b,
   c,
   d;

   private static String[] a = new String[NLoginCore_244.f];
   private static String[] b = new String[NLoginCore_244.g];
   private static long c;
   private static int a = (128 >>> 101 | 128 << ~101 + 1) & -1;
   private static int b = 0 >>> 165 | 0 << ~165 + 1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);
   private static int e = (196608 >>> 240 | 196608 << -240) & -1;
   private static int f = Integer.reverse(536870912);
   private static int g = (524288 >>> 177 | 524288 << -177) & -1;
   private static int h = (0 >>> 175 | 0 << ~175 + 1) & -1;
   private static int i = -1 >>> 107 | -1 << ~107 + 1;
   private static long j = Long.reverse(-7593908345534808030L);
   private static int k = 0 >>> 253 | 0 << ~253 + 1;
   private static int l = (512 >>> 41 | 512 << -41) & -1;
   private static long m = Long.reverse(-5288065336321114078L);
   private static long n = Long.reverse(2305843009213693952L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(1073741824);
   private static long q = Long.reverse(-5288065336321114078L);
   private static long r = Long.reverse(2305843009213693952L);
   private static int s = Integer.reverse(1073741824);
   private static int t = (25165824 >>> 215 | 25165824 << -215) & -1;
   private static long u = Long.reverse(-7593908345534808030L);
   private static int v = Integer.reverse(-1073741824);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_244.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.A("¹ÛÝ½áĀøĎúÉćýċąÎóĕĔČĒČá", (byte)9, 65), NLoginCore_244.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_127.F("ԨԵԴӷԷԳԮԷՂԱӾԼՀԹԼՂԄ࢛ࡺࢉࡴࢠࡾࢡࢤࢁ࢘ࢠࢪ࢞ԝ", (byte)9, 70) + var1 + NLoginCore_092.C("Њ", (byte)9, 67) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 4900024078420719981L;
      long var0 = c ^ 954251832060673430L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(45 + 23),
               (byte)(47 + 22),
               83,
               (byte)(11 + 36),
               (byte)(9 + 58),
               (byte)(31 + 35),
               67,
               (byte)(8 + 39),
               (byte)(24 + 56),
               (byte)(28 + 47),
               (byte)(26 + 41),
               (byte)(20 + 63),
               (byte)(17 + 36),
               (byte)(64 + 16),
               (byte)(88 + 9),
               (byte)(66 + 34),
               (byte)(31 + 69),
               (byte)(60 + 45),
               (byte)(54 + 56),
               (byte)(16 + 87)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.A("ęøĚýüĄĖéĀĆüñ", (byte)21, 65);
               b[1] = NLoginCore_446.E("ԤԨԊՃՌՎԝԃՓԐՊՂԴԕԥՙԻԸԵԭԴՍԤԥ", (byte)21, 69);
               b[2] = NLoginCore_427.B("ëĎóğěġĒþĠĆãñ", (byte)21, 66);
               b[3] = NLoginCore_138.E("ԺԨԞՈԝԢԼՏ\u0530ԢԬԙ", (byte)21, 69);
               break;
            case 1:
               b[0] = NLoginCore_427.A("ýģěĚćïçğöęùúāçÿýĳĢìĭĔĵüý", (byte)21, 65);
               b[1] = NLoginCore_384.B("üĀâěĤĦõÛīèģßèČêĨĐēİĕóĵüý", (byte)21, 66);
               b[2] = NLoginCore_183.D("ѨќышцѧцѦЫђїЮїѮжќшѨќпѮҀчш", (byte)21, 68);
               b[3] = NLoginCore_173.F("ԓՅӾՇԢԨՂՆԒԬՓԨԳՋԘՈԺՃԯ\u0530ԯԧԤԥ", (byte)21, 70);
               break;
            case 2:
               b[0] = NLoginCore_387.E("ԥԾԈԙԝԆԂԟԫԑՌՆԣԠԗԗԙՕԴ՞ԻԷԤԥ", (byte)21, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.D("щэѪЪыяѳрыыѩм", (byte)21, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 4L;
      var1 ^= 954251832060673430L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(61 + 8),
                     (byte)(54 + 29),
                     (byte)(8 + 39),
                     (byte)(7 + 60),
                     (byte)(23 + 43),
                     (byte)(60 + 7),
                     (byte)(29 + 18),
                     (byte)(45 + 35),
                     (byte)(23 + 52),
                     67,
                     (byte)(3 + 80),
                     (byte)(21 + 32),
                     (byte)(73 + 7),
                     (byte)(43 + 54),
                     (byte)(13 + 87),
                     (byte)(99 + 1),
                     (byte)(34 + 71),
                     (byte)(63 + 47),
                     (byte)(9 + 94)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.F("ԤԱ\u0530ӳԳԯԪԳԾԭӺԸԼԵԸԾԀ\u0897ࡶࢅࡰ࢜ࡺ࢝ࢠࡽ\u0894࢜ࢦ࢚", (byte)5, 70));
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

   static {
      b();
   }
}
