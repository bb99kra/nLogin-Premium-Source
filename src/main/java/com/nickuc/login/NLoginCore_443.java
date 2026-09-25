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
import lombok.Generated;

public enum NLoginCore_443 {
   a((NLoginCore_443 != 0).l),
   b((NLoginCore_443 != 0).q),
   c((NLoginCore_443 != 0).v),
   d((NLoginCore_443 != 0).aa);

   private final boolean aA;
   private static String[] ZKM_STR_A = new String[NLoginCore_443.f];
   private static String[] ZKM_STR_B = new String[NLoginCore_443.g];
   private static long c;
   private static int a = Integer.reverse(536870912);
   private static int b = 0 >>> 77 | 0 << ~77 + 1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (2048 >>> 234 | 2048 << -234) & -1;
   private static int e = Integer.reverse(-1073741824);
   private static int f = Integer.MIN_VALUE >>> 157 | Integer.MIN_VALUE << ~157 + 1;
   private static int g = Integer.reverse(536870912);
   private static int h = Integer.reverse(0);
   private static long i = Long.reverse(-1120393984565815365L);
   private static long j = Long.reverse(-7782220156096217088L);
   private static int k = Integer.reverse(0);
   private static int l = 33554432 >>> 217 | 33554432 << ~217 + 1;
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int n = (-1 >>> 152 | -1 << ~152 + 1) & -1;
   private static long o = Long.reverse(7238286923833825211L);
   private static int p = 131072 >>> 241 | 131072 << -241;
   private static int q = Integer.reverse(0);
   private static int r = 32 >>> 100 | 32 << -100;
   private static int s = (-1 >>> 42 | -1 << -42) & -1;
   private static long t = Long.reverse(7238286923833825211L);
   private static int u = Integer.reverse(1073741824);
   private static int v = (0 >>> 193 | 0 << ~193 + 1) & -1;
   private static int w = Integer.reverse(-1073741824);
   private static int x = Integer.reverse(-1);
   private static long y = Long.reverse(7238286923833825211L);
   private static int z = Integer.reverse(-1073741824);
   private static int aa = (0 >>> 149 | 0 << ~149 + 1) & -1;

   private static String a(int var0, long var1) {
      var1 ^= 41L;
      var1 ^= 3484801004632549793L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(66 + 2),
                     (byte)(56 + 13),
                     (byte)(14 + 69),
                     (byte)(26 + 21),
                     (byte)(39 + 28),
                     (byte)(32 + 34),
                     (byte)(3 + 64),
                     (byte)(31 + 16),
                     (byte)(7 + 73),
                     (byte)(40 + 35),
                     (byte)(56 + 11),
                     (byte)(55 + 28),
                     (byte)(37 + 16),
                     80,
                     (byte)(41 + 56),
                     (byte)(98 + 2),
                     (byte)(95 + 5),
                     (byte)(66 + 39),
                     (byte)(103 + 7),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.E("։֖֕\u0558֘֔֏֣֘֒՟֣֚֝֡֝եࣰ࣮ࣶ࣪࣡ࣼࣵँ࣒ࣾ", (byte)106, 69));
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

   private static void b() {
      c = -2456116876087800305L;
      long var0 = c ^ 3484801004632549793L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(7 + 62),
               (byte)(57 + 26),
               (byte)(37 + 10),
               (byte)(12 + 55),
               (byte)(2 + 64),
               (byte)(32 + 35),
               (byte)(17 + 30),
               80,
               (byte)(27 + 48),
               (byte)(29 + 38),
               (byte)(13 + 70),
               53,
               (byte)(44 + 36),
               (byte)(63 + 34),
               (byte)(35 + 65),
               (byte)(52 + 48),
               (byte)(90 + 15),
               (byte)(82 + 28),
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_091.C("жϻкЕРϴсгЭГУЌ", (byte)5, 67);
               ZKM_STR_B[1] = NLoginCore_241.C("ЇϰЋϸЛЭϺТМϼИЖвыЇНЃмНМлѐЗИ", (byte)5, 67);
               ZKM_STR_B[2] = NLoginCore_521.A("Êú¼ĂąâèĊçāĂÑ", (byte)5, 65);
               ZKM_STR_B[3] = NLoginCore_241.A("íïą¿×úāßâ×ÔÑ", (byte)5, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_201.E("ӳԯԩԊӽԐԵԮԟԟӿԉ", (byte)5, 69);
               ZKM_STR_B[1] = NLoginCore_384.F("ԄӭԈӵԘԪӷԟԙӹԖԳԿԤԇԩՋԷԧԾՋԧԔԕ", (byte)5, 70);
               ZKM_STR_B[2] = NLoginCore_173.D("ЩЌзжнЏЏрцЏНЙЧПеЗϿиыЉУЪЗИ", (byte)5, 68);
               ZKM_STR_B[3] = NLoginCore_471.D("ϵϵвЙнϸЂпϼрСбЇЇУЉНчЉшНѐЗИ", (byte)5, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.E("ԚӭԻԾԸӱԎԾԠԓԮԉ", (byte)5, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_092.B("ÀăÜÿÓÂþÁø÷öÉâÞåÊäåĔÏÏĕÜÝ", (byte)5, 66);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_443.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.B("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 66), NLoginCore_443.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.C("ѯѼѻоѾѺѵѾ҉Ѹх҃҇Ҁ҃҉ыߔߐ߇ߢߜߖߛߧ\u07b8ߤѡ", (byte)29, 67) + var1 + NLoginCore_092.B("ó", (byte)29, 66) + var2.toString(), var4
         );
      }
   }

   @Generated
   private NLoginCore_443(boolean var3) {
      this.aA = var3;
   }
}
