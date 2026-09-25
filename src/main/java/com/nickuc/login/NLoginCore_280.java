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

public enum NLoginCore_280 {
   a,
   b,
   c,
   d,
   e,
   f;

   private static String[] ZKM_STR_A = new String[NLoginCore_280.h];
   private static String[] ZKM_STR_B = new String[NLoginCore_280.i];
   private static long c;
   private static int a = 98304 >>> 238 | 98304 << -238;
   private static int b = Integer.reverse(0);
   private static int c = (1 >>> 128 | 1 << ~128 + 1) & -1;
   private static int d = (65536 >>> 239 | 65536 << -239) & -1;
   private static int e = (96 >>> 101 | 96 << ~101 + 1) & -1;
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(-1610612736);
   private static int h = 6 >>> 0 | 6 << ~0 + 1;
   private static int i = Integer.reverse(1610612736);
   private static int j = Integer.reverse(0);
   private static long k = Long.reverse(-4642805189423201553L);
   private static long l = Long.reverse(-7638104968020361216L);
   private static int m = (0 >>> 104 | 0 << -104) & -1;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(-4642805189423201553L);
   private static long p = Long.reverse(-7638104968020361216L);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(1073741824);
   private static long s = Long.reverse(-4642805189423201553L);
   private static long t = Long.reverse(-7638104968020361216L);
   private static int u = 67108864 >>> 249 | 67108864 << -249;
   private static int v = (48 >>> 228 | 48 << ~228 + 1) & -1;
   private static long w = Long.reverse(-4642805189423201553L);
   private static long x = Long.reverse(-7638104968020361216L);
   private static int y = 402653184 >>> 59 | 402653184 << -59;
   private static int z = 4 >>> 0 | 4 << -0;
   private static long aa = Long.reverse(-4642805189423201553L);
   private static long ab = Long.reverse(-7638104968020361216L);
   private static int ac = Integer.reverse(536870912);
   private static int ad = Integer.reverse(-1610612736);
   private static long ae = Long.reverse(2995299778597159663L);
   private static int af = Integer.reverse(-1610612736);

   private static String a(int var0, long var1) {
      var1 ^= 105L;
      var1 ^= -2813209953589044924L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(32 + 36),
                     (byte)(55 + 14),
                     (byte)(21 + 62),
                     (byte)(29 + 18),
                     (byte)(51 + 16),
                     (byte)(31 + 35),
                     (byte)(50 + 17),
                     (byte)(14 + 33),
                     80,
                     (byte)(13 + 62),
                     (byte)(31 + 36),
                     (byte)(67 + 16),
                     (byte)(44 + 9),
                     80,
                     (byte)(87 + 10),
                     (byte)(53 + 47),
                     (byte)(81 + 19),
                     (byte)(85 + 20),
                     (byte)(12 + 98),
                     (byte)(85 + 18)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.D("ЭкйϼмигмчжЃсхосчЉݶބޅޑޓޣޛޟޫޡޚ", (byte)7, 68));
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
                  NLoginCore_280.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.E("ӻԝԟӿԣՂԺՐԼԋՉԿՍՇԐԵ\u0557ՖՎՔՎԣ", (byte)23, 69), NLoginCore_280.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࡿࢍࢎ࢚࢜ࢬࢤࢨࢴࢪࢣԩ", (byte)23, 70) + var1 + NLoginCore_027.B("ç", (byte)23, 66) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = -630248006929708547L;
      long var0 = c ^ -2813209953589044924L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(65 + 3),
               (byte)(29 + 40),
               (byte)(22 + 61),
               (byte)(19 + 28),
               (byte)(47 + 20),
               (byte)(55 + 11),
               (byte)(65 + 2),
               (byte)(37 + 10),
               (byte)(20 + 60),
               (byte)(58 + 17),
               67,
               (byte)(79 + 4),
               (byte)(12 + 41),
               (byte)(65 + 15),
               97,
               (byte)(61 + 39),
               (byte)(76 + 24),
               (byte)(54 + 51),
               (byte)(93 + 17),
               (byte)(88 + 15)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_471.B("ƂſŧſƃƐŤƦƍŴŵŻ", (byte)90, 66);
               ZKM_STR_B[1] = NLoginCore_173.B("ƀƨƂƝƧơƆƍƟŬƈƢůƘŬƃƦŸŴƻƩƿƆƇ", (byte)90, 66);
               ZKM_STR_B[2] = NLoginCore_183.D("ԈԝԓԒӼՁԵԯԻԥԄԙԠԃԚԙӾԦԌՀՉԿԖԗ", (byte)90, 68);
               ZKM_STR_B[3] = NLoginCore_241.E("Վբ։աՋեֈյ՟Ցմզթօ՚՞֜՟Փ՚֍֢թժ", (byte)90, 69);
               ZKM_STR_B[4] = NLoginCore_387.B("ŞƜƚƯƚŮƉūƕƵƤŻ", (byte)90, 66);
               ZKM_STR_B[5] = NLoginCore_553.A("ŪŶŷƫƮžůƣƃŲƊŻ", (byte)90, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.A("ƨƋſƀŭƒŪƤƔűƑƆƅƷƇƭƗƓƷźźƙƆƇ", (byte)90, 65);
               ZKM_STR_B[1] = NLoginCore_027.D("ԐԸԒԭԷԱԖԝԯӼԗӽԘԽՄՁԦՌՋՁԫԙԖԗ", (byte)90, 68);
               ZKM_STR_B[2] = NLoginCore_076.B("ŸƍƃƂŬƱƥƟƫƕŴƣƷŹƫƼƝƊƖżƑƿƆƇ", (byte)90, 66);
               ZKM_STR_B[3] = NLoginCore_453.A("ūſƦžŨƂƥƒżŮƎƧƬƥƦƸƇƬƊƊƯƙƆƇ", (byte)90, 65);
               ZKM_STR_B[4] = NLoginCore_553.C("ӷӸԸԽԸԭԛՀԹԯԦԋ", (byte)90, 67);
               ZKM_STR_B[5] = NLoginCore_575.A("ŷơơƂƪƀƧơƧƅưŻ", (byte)90, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.A("ƕƈƄƊūƏƍƏŰſƓƘƉƨƻƗŻƶƯƱƵƙƆƇ", (byte)90, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.D("ӻԔԋԪԱԫԷԶӿԘԴԋ", (byte)90, 68);
         }
      }
   }
}
