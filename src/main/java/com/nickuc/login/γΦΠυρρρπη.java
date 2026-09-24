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

public enum γΦΠυρρρπη {
   a,
   b;

   private static String[] a = new String[γΦΠυρρρπη.d];
   private static String[] b = new String[γΦΠυρρρπη.e];
   private static long c;
   private static int a = Integer.reverse(1073741824);
   private static int b = 0 >>> 16 | 0 << ~16 + 1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);
   private static int e = (4194304 >>> 213 | 4194304 << -213) & -1;
   private static int f = Integer.reverse(0);
   private static long g = Long.reverse(-4353171860664834615L);
   private static long h = Long.reverse(-3746994889972252672L);
   private static int i = (0 >>> 16 | 0 << ~16 + 1) & -1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int k = (-1 >>> 126 | -1 << ~126 + 1) & -1;
   private static long l = Long.reverse(1123205286217688521L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 51L;
      var1 ^= 2712027669446969637L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(49 + 20),
                     (byte)(23 + 60),
                     47,
                     (byte)(40 + 27),
                     (byte)(7 + 59),
                     (byte)(4 + 63),
                     (byte)(22 + 25),
                     (byte)(25 + 55),
                     (byte)(43 + 32),
                     (byte)(4 + 63),
                     (byte)(17 + 66),
                     (byte)(43 + 10),
                     80,
                     (byte)(20 + 77),
                     (byte)(74 + 26),
                     (byte)(70 + 30),
                     (byte)(10 + 95),
                     (byte)(23 + 87),
                     (byte)(20 + 83)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), (byte)(32 + 51)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣερμΔσατσκ.E("հսռԿտջնտ֊չՆքֈցք֊Ռ࣑ࣅࣀࣦࣣࣤࣥࣥࣝ", (byte)81, 69));
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
      c = -7807804153099032125L;
      long var0 = c ^ 2712027669446969637L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(59 + 10),
               (byte)(46 + 37),
               (byte)(17 + 30),
               (byte)(65 + 2),
               (byte)(64 + 2),
               (byte)(25 + 42),
               (byte)(38 + 9),
               (byte)(6 + 74),
               (byte)(16 + 59),
               (byte)(5 + 62),
               (byte)(74 + 9),
               (byte)(45 + 8),
               (byte)(53 + 27),
               (byte)(45 + 52),
               (byte)(3 + 97),
               (byte)(29 + 71),
               (byte)(7 + 98),
               (byte)(15 + 95),
               (byte)(61 + 42)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
               b[0] = βθκςνθΩθυμςτκχ.B("ïëĒČÐõĊÕöëďþĜĔĤĦęĖćĂêĩðñ", (byte)15, 66);
               b[1] = φΨαξωυθανΣφυκη.E("ӿԠԎ\u0530ՅԥԖԶԪԦՎՏԌԾԒԨԢՏԐԶԕ\u0557Ԟԟ", (byte)15, 69);
               break;
            case 1:
               b[0] = ζβησεθωυγτ.B("ïëĒČÐõĊÕöëđþ÷ĖÖüüüòğħăðñ", (byte)15, 66);
               b[1] = ΨφιωσρΓδΔθ.A("ÑòàĂė÷èĈüøġÛĊďġÿßöāħýăðñ", (byte)15, 65);
               break;
            case 2:
               b[0] = δΛψπξκσβγςα.E("ԮԓӸԑԑԲՆԿՉԽԹՂԐՃԽԾԼԮՑՇԔՑ՛ԣԔԫԝՔՍբԯԲ", (byte)15, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣφδσΔζιΠρα.F("ԄԀԼԁԴԳԈԛԢԟՀԊԉՎԟՎՆԑՃԲԢԱԞԟ", (byte)15, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  γΦΠυρρρπη.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πψυκΠΨμΛΩβΣφμφσ.F("ӯԑԓӳԗԶԮՄ\u0530ӿԽԳՁԻԄԩՋՊՂՈՂԗ", (byte)11, 70), γΦΠυρρρπη.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            λΣΩσμφγχ.F("ԪԷԶӹԹԵ\u0530ԹՄԳԀԾՂԻԾՄԆࢋࡿࡺࢠ࢝࢞࢟࢟\u0897ԛ", (byte)11, 70) + var1 + βθκςνθΩθυμςτκχ.D("А", (byte)11, 68) + var2.toString(), var4
         );
      }
   }
}
