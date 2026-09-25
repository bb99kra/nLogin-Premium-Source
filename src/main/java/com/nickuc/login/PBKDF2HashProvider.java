package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

public abstract class PBKDF2HashProvider {
   private static int aa = Integer.reverse(1073741824);
   private static int y = 0 >>> 253 | 0 << ~253 + 1;
   private static long s = Long.reverse(6935205159037607889L);
   private static long p = Long.reverse(-1279360561286176815L);
   private static int o = 4096 >>> 234 | 4096 << -234;
   private static int t = 33554432 >>> 151 | 33554432 << ~151 + 1;
   private static final SecureRandom d = new SecureRandom();
   private static int j = Integer.reverse(1073741824);
   private static long f = Long.reverse(-1279360561286176815L);
   private static int ab = -1073741823 >>> 62 | -1073741823 << -62;
   private static int m = (-1 >>> 61 | -1 << -61) & -1;
   private static String[] ZKM_STR_B = new String[PBKDF2HashProvider.ac];
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int b = (16777216 >>> 152 | 16777216 << -152) & -1;
   private static long w = Long.reverse(-8214565720323784704L);
   private static int a = 0 >>> 220 | 0 << ~220 + 1;
   private static String[] ZKM_STR_A = new String[ab];
   private static int c = Integer.reverse(0);
   private static int l = 6144 >>> 43 | 6144 << -43;
   private static int e = (0 >>> 134 | 0 << ~134 + 1) & -1;
   private static long c;
   private static long n = Long.reverse(6935205159037607889L);
   private static int ac = Integer.reverse(-536870912);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(6935205159037607889L);
   private static int r = Integer.reverse(-1610612736);
   private static long v = Long.reverse(-1279360561286176815L);
   private static int d = Integer.reverse(134217728);
   private static long g = Long.reverse(-8214565720323784704L);
   private static int x = (-2147483647 >>> 63 | -2147483647 << -63) & -1;
   private static long q = Long.reverse(-8214565720323784704L);
   private static int u = Integer.reverse(1610612736);
   private static long k = Long.reverse(6935205159037607889L);

   protected static String c(String var0, int var1, String var2) {
      int var3 = b(var0);
      byte[] var4 = new byte[var3 / t];
      d.nextBytes(var4);
      byte[] var5 = a(var0, var2.toCharArray(), var4, var1, var3);
      String var10000 = a(u, v ^ w);
      Object[] var10001 = new Object[x];
      var10001[y] = var1;
      var10001[z] = Base64.getUrlEncoder().withoutPadding().encodeToString(var4);
      var10001[aa] = Base64.getUrlEncoder().withoutPadding().encodeToString(var5);
      return String.format(var10000, var10001);
   }

   protected static byte[] a(String var0, char[] var1, byte[] var2, int var3, int var4) {
      PBEKeySpec var5 = new PBEKeySpec(var1, var2, var3, var4);

      try {
         SecretKeyFactory var6 = SecretKeyFactory.getInstance(a(j, k) + var0);
         return var6.generateSecret(var5).getEncoded();
      } catch (InvalidKeySpecException var7) {
         throw new RuntimeException(a(l & m, n), var7);
      } catch (NoSuchAlgorithmException var8) {
         throw new RuntimeException(a(o, p ^ q) + var0 + a(r, s), var8);
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  PBKDF2HashProvider.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_110.E("\u0530ՒՔԴ\u0558շկօձՀվմւռՅժ\u058c\u058bփ։փ\u0558", (byte)76, 69), PBKDF2HashProvider.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_575.B("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӞӚӨӬӱӶӠӥӰū", (byte)76, 66) + var1 + NLoginCore_027.E("Ղ", (byte)76, 69) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = -8360608143537636233L;
      long var0 = c ^ -738723759852714307L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(21 + 47),
               (byte)(25 + 44),
               83,
               (byte)(36 + 11),
               (byte)(31 + 36),
               (byte)(44 + 22),
               (byte)(58 + 9),
               (byte)(7 + 40),
               (byte)(43 + 37),
               75,
               (byte)(40 + 27),
               (byte)(7 + 76),
               (byte)(25 + 28),
               (byte)(59 + 21),
               (byte)(44 + 53),
               (byte)(74 + 26),
               (byte)(94 + 6),
               (byte)(102 + 3),
               (byte)(45 + 65),
               (byte)(66 + 37)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(40 + 29), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.B("ġþěĀġĪôĎčİĔĘıòôĳċėĪĽŀĜûŀğþĳĖłňłąįĹňćĿďŏĩŕİŖĝ", (byte)27, 66);
               ZKM_STR_B[1] = NLoginCore_183.A("äĤëČĨÿĕíõĲĈý", (byte)27, 65);
               ZKM_STR_B[2] = NLoginCore_446.C("ѵѨҁѡѾњѭѾѱ҄ђїѸоѤҁѥѦ҉ѣѳќљњ", (byte)27, 67);
               ZKM_STR_B[3] = NLoginCore_241.A("ġþěĀġĪôĎčİĖĳõöēùıėĐŀþĖĹĕļĘĠŇĄīĴğħĉļĦńĩňĢŁŎīŐĮŔŒĨĩŐĭłľšĨĩ", (byte)27, 65);
               ZKM_STR_B[4] = NLoginCore_110.A("ġþěĀġĪôĎčİĔĘıòôĳċėĪĽŀĜûŀğþĳĖłňłąįĹňćĿďŏĩŕİŖĝ", (byte)27, 65);
               ZKM_STR_B[5] = NLoginCore_141.D("еѵмѝѹѐѦоц҃љю", (byte)27, 68);
               ZKM_STR_B[6] = NLoginCore_471.B("ĀîħďğĤďĒîĸĭĤõõĖęĘĖ÷ęľıĈĉ", (byte)27, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_091.E("ՃԠԽԢՃՌԖ\u0530ԯՒԶԺՓԔԖՕԭԹՌ՟բԾԝբՁԠՕԸդժդԧՀԺճծեՍ\u0530ԮՌըՇոեկ՚խ՛ճճքտ՝ՊՋ", (byte)27, 69);
               ZKM_STR_B[1] = NLoginCore_427.E("ՆԤԥՀԧԲԒԐԴՁՄԟ", (byte)27, 69);
               ZKM_STR_B[2] = NLoginCore_559.E("ՆԹՒԲՏԫԾՏՂՕԤՏ՜ԦԭՕ\u0557ԭՋԞԱԭԪԫ", (byte)27, 69);
               ZKM_STR_B[3] = NLoginCore_173.F("ՃԠԽԢՃՌԖ\u0530ԯՒԸՕԗԘԵԛՓԹԲբԠԸ՛Է՞ԺՂթԦՍՖՁՉԫ՞ՈզՋժՄգհՋռթչժՇՍՙՠվ՜ճՊՋ", (byte)27, 70);
               ZKM_STR_B[4] = NLoginCore_141.C("ѲяѬёѲѻхџўҁѥѩ҂ух҄ќѨѻҎґѭьґѰя҄ѧғҙғіљѼҙќҎѱҝҠҘ҉ѨѮ", (byte)27, 67);
               ZKM_STR_B[5] = NLoginCore_384.E("ԉԐԄԲԓՉԞԢԨՐԲԟ", (byte)27, 69);
               ZKM_STR_B[6] = NLoginCore_324.F("ԢԐՉԱՁՆԱԴԐ՚ՏՈՕԥՍԨԝԬՌՠԵԭԪԫ", (byte)27, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_453.F("ԯԡԈԍՆՄԎՁՖՉԪԴԖԦՑՉԾՠԢՄԤՂՎՈԦՈԻՊՅՎՉՅ", (byte)27, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.D("лѶѰяіѺн҂ѣҁѥю", (byte)27, 68);
         }
      }
   }

   protected static int b(String var0) {
      try {
         return Mac.getInstance(var0).getMacLength() * d;
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(a(e, f ^ g) + var0 + a(h, i), var2);
      }
   }

   protected static boolean a(byte[] var0, byte[] var1) {
      int var2 = var0.length ^ var1.length;

      for (int var3 = a; var3 < var0.length && var3 < var1.length; var3++) {
         var2 |= var0[var3] ^ var1[var3];
      }

      return ((var2 == 0 ? b : c) != 0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 113L;
      var1 ^= -738723759852714307L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(53 + 16),
                     (byte)(47 + 36),
                     47,
                     (byte)(56 + 11),
                     (byte)(47 + 19),
                     (byte)(35 + 32),
                     (byte)(18 + 29),
                     (byte)(62 + 18),
                     (byte)(13 + 62),
                     (byte)(9 + 58),
                     (byte)(82 + 1),
                     (byte)(47 + 6),
                     (byte)(64 + 16),
                     (byte)(93 + 4),
                     100,
                     (byte)(7 + 93),
                     (byte)(19 + 86),
                     (byte)(50 + 60),
                     (byte)(39 + 64)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.C("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣯ࣳࣽँआऋࣺࣵअ", (byte)125, 67));
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
