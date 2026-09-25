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

enum NLoginCore_506 {
   b,
   c,
   d,
   e;

   private static String[] ZKM_STR_A = new String[NLoginCore_506.f];
   private static String[] ZKM_STR_B = new String[NLoginCore_506.g];
   private static long c;
   private static int a = 524288 >>> 17 | 524288 << ~17 + 1;
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 1073741824 >>> 221 | 1073741824 << ~221 + 1;
   private static int e = Integer.reverse(-1073741824);
   private static int f = 8388608 >>> 53 | 8388608 << ~53 + 1;
   private static int g = Integer.reverse(536870912);
   private static int h = 0 >>> 169 | 0 << -169;
   private static long i = Long.reverse(-3892123069624882776L);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int l = -1 >>> 191 | -1 << -191;
   private static long m = Long.reverse(-3892123069624882776L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = (2 >>> 128 | 2 << -128) & -1;
   private static int p = (-1 >>> 237 | -1 << ~237 + 1) & -1;
   private static long q = Long.reverse(-3892123069624882776L);
   private static int r = (128 >>> 230 | 128 << -230) & -1;
   private static int s = 201326592 >>> 218 | 201326592 << -218;
   private static long t = Long.reverse(-3892123069624882776L);
   private static int u = (196608 >>> 80 | 196608 << -80) & -1;

   private static void b() {
      c = 1555966325424537525L;
      long var0 = c ^ 3283085313424280607L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(19 + 49),
               (byte)(53 + 16),
               (byte)(22 + 61),
               (byte)(4 + 43),
               (byte)(50 + 17),
               (byte)(21 + 45),
               (byte)(15 + 52),
               (byte)(7 + 40),
               (byte)(76 + 4),
               75,
               67,
               (byte)(38 + 45),
               (byte)(35 + 18),
               (byte)(70 + 10),
               (byte)(21 + 76),
               (byte)(57 + 43),
               (byte)(37 + 63),
               (byte)(62 + 43),
               (byte)(91 + 19),
               (byte)(55 + 48)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_453.E("ԀӿԏӾԣՉԹԬԡԈՀԓ", (byte)15, 69);
               ZKM_STR_B[1] = NLoginCore_530.D("ХюзѐєНаЛіПхЪ", (byte)15, 68);
               ZKM_STR_B[2] = NLoginCore_427.E("ԞԐԒԡԺՊԆԊԋՎԚԓ", (byte)15, 69);
               ZKM_STR_B[3] = NLoginCore_091.F("ԸԷԲԙԣՃՂԡԖԫԾԦԭԍԫԢԣԒՁ\u0558Ԙ\u0557Ԟԟ", (byte)15, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.C("фкЪиБвљљѡОнЪ", (byte)15, 67);
               ZKM_STR_B[1] = NLoginCore_110.C("алШвџЛНЛЯјѦяђојѦгїќњЫшеж", (byte)15, 67);
               ZKM_STR_B[2] = NLoginCore_232.D("юшьэђљпРіьѠчесгкТўеЬюиеж", (byte)15, 68);
               ZKM_STR_B[3] = NLoginCore_183.D("яющакњљиЭтєПФлШолрншѨўеж", (byte)15, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_076.A("ĔÔîđúóėìĉĝĔĂÝïĤĄĤúþĈęęðñ", (byte)15, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_427.E("ԂԅԸԸՀԩԕԅԪԶԜԌԧԽԝԾԳԵՄԬԴ\u0557Ԟԟ", (byte)15, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_506.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.C("ҎҰҲҒҶӕӍӣӏҞӜӒӠӚңӈӪөӡӧӡҶ", (byte)59, 67), NLoginCore_506.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.B("ŘťŤħŧţŞŧŲšĮŬŰũŬŲĴӃҸҼӉӍӁӍӈӂӗŊ", (byte)59, 66) + var1 + NLoginCore_092.F("Ա", (byte)59, 70) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= 3283085313424280607L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(43 + 25),
                     (byte)(15 + 54),
                     (byte)(79 + 4),
                     (byte)(33 + 14),
                     (byte)(18 + 49),
                     (byte)(4 + 62),
                     (byte)(64 + 3),
                     (byte)(43 + 4),
                     (byte)(61 + 19),
                     (byte)(57 + 18),
                     (byte)(63 + 4),
                     (byte)(32 + 51),
                     (byte)(34 + 19),
                     80,
                     (byte)(27 + 70),
                     (byte)(80 + 20),
                     (byte)(67 + 33),
                     (byte)(13 + 92),
                     (byte)(47 + 63),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.B("ŀōŌďŏŋņŏŚŉĖŔŘőŔŚĜҫҠҤұҵҩҵҰҪҿ", (byte)47, 66));
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
