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

public enum NLoginCore_231 {
   a,
   b;

   private static String[] ZKM_STR_A = new String[NLoginCore_231.d];
   private static String[] ZKM_STR_B = new String[NLoginCore_231.e];
   private static long c;
   private static int a = Integer.reverse(1073741824);
   private static int b = Integer.reverse(0);
   private static int c = (524288 >>> 179 | 524288 << -179) & -1;
   private static int d = 512 >>> 40 | 512 << -40;
   private static int e = 65536 >>> 143 | 65536 << ~143 + 1;
   private static int f = Integer.reverse(0);
   private static int g = -1 >>> 202 | -1 << ~202 + 1;
   private static long h = Long.reverse(330069857424812523L);
   private static int i = Integer.reverse(0);
   private static int j = 128 >>> 135 | 128 << -135;
   private static long k = Long.reverse(-4713961725230142997L);
   private static long l = Long.reverse(-5044031582654955520L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_231.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.F("՝տցաօֲ֤֜֞խ֫֡֯֩ղְְֶָֹ֗օ", (byte)121, 70), NLoginCore_231.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऊࣰएंࣼऊ࣬ऐࣷऑए\u058b", (byte)121, 69) + var1 + NLoginCore_324.B("ƫ", (byte)121, 66) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -2912285955079198339L;
      long var0 = c ^ 6411684145213426233L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(27 + 41),
               69,
               (byte)(17 + 66),
               (byte)(29 + 18),
               (byte)(25 + 42),
               (byte)(20 + 46),
               (byte)(46 + 21),
               (byte)(7 + 40),
               (byte)(78 + 2),
               (byte)(24 + 51),
               (byte)(59 + 8),
               (byte)(75 + 8),
               (byte)(45 + 8),
               (byte)(19 + 61),
               (byte)(7 + 90),
               100,
               (byte)(7 + 93),
               (byte)(51 + 54),
               (byte)(72 + 38),
               (byte)(60 + 43)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_141.E("ӱԌԳԐԄԨԌԒԵӿԔԅ", (byte)1, 69);
               ZKM_STR_B[1] = NLoginCore_241.D("БϮЮЊУЃЋиАЂ϶Ѐ", (byte)1, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.B("¬êÚæÇÐöÜÙóÙÍáăĈõÙØ÷ÕØçÔÕ", (byte)1, 66);
               ZKM_STR_B[1] = NLoginCore_110.C("ЅϬЌϳϽбФЅкϳЫϹϹЪкЮϷϻПЏддЋЌ", (byte)1, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.D("ϺЌϲϮТбЬТІЬеЀ", (byte)1, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_471.B("¬¸äæÇìòÞíÔÔÉ", (byte)1, 66);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 93L;
      var1 ^= 6411684145213426233L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(62 + 6),
                     (byte)(17 + 52),
                     (byte)(23 + 60),
                     (byte)(9 + 38),
                     (byte)(27 + 40),
                     (byte)(39 + 27),
                     (byte)(6 + 61),
                     (byte)(45 + 2),
                     80,
                     (byte)(9 + 66),
                     (byte)(65 + 2),
                     (byte)(29 + 54),
                     53,
                     (byte)(66 + 14),
                     (byte)(75 + 22),
                     (byte)(65 + 35),
                     (byte)(38 + 62),
                     (byte)(36 + 69),
                     (byte)(73 + 37),
                     (byte)(89 + 14)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.E("֤֣֗զֱ֦֢֦֝֠խֱ֫֯֨֫ճउ࣯ऎँࣻउ࣫एࣶऐऎ", (byte)120, 69));
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
