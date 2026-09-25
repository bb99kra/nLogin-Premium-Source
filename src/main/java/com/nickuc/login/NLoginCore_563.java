package com.nickuc.login;

import github.scarsz.discordsrv.DiscordSRV;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_563 {
   private static long d = Long.reverse(7638104968020361216L);
   private static String[] ZKM_STR_A = new String[NLoginCore_563.f];
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int g = (33554432 >>> 185 | 33554432 << ~185 + 1) & -1;
   private static int a = (0 >>> 201 | 0 << ~201 + 1) & -1;
   private static String[] ZKM_STR_B = new String[g];
   private static int e = (0 >>> 65 | 0 << ~65 + 1) & -1;
   private static long b = Long.reverse(1307960233154158583L);

   private static void b() {
      c = -1154682168879651768L;
      long var0 = c ^ -4532748932127876143L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(20 + 48),
               (byte)(48 + 21),
               (byte)(58 + 25),
               47,
               (byte)(6 + 61),
               (byte)(42 + 24),
               (byte)(7 + 60),
               (byte)(9 + 38),
               (byte)(18 + 62),
               75,
               (byte)(24 + 43),
               (byte)(57 + 26),
               (byte)(31 + 22),
               (byte)(36 + 44),
               (byte)(47 + 50),
               (byte)(60 + 40),
               (byte)(98 + 2),
               (byte)(51 + 54),
               (byte)(92 + 18),
               (byte)(54 + 49)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_559.F("ծմՆԸոէՇԴՌլԻկԸԹշւԼ\u0557մՖռՁ\u058bՇևա֎Պՠցր֎Վ֏ի\u0590֖ն՛ը֑ճկ֍՚ղ՜֝ռ֖֠։եզ֭֡֨խցպֲ֜րվ֞։֥֭օ֣֖֒ս֟\u058bք", (byte)64, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.C("ӧӭҿұӱӠӀҭӅӥҴӨұҲӰӻҵӐӭӏӵҺԄӀԀӚԇӃәӺӹԇӇԈӤԉԏӯӔӡԊӬӨԆӓӫӕԖӵԙԏԂӞӟԚԡԦӦӺӳԕԫӹӷԞӺԌӫԛԲӼӭԯӿԮӽ", (byte)64, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_183.C("ӞҿӟӪӭҲӥӀӒӱӊӋӆҺӤөӚҶҺӲӾӛӈӉ", (byte)64, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.A("ĶŕŰŹŧňŬňśŵŎŠŻśŲſŕƈŁƌňŕŒœ", (byte)64, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 86L;
      var1 ^= -4532748932127876143L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(7 + 61),
                     (byte)(67 + 2),
                     (byte)(20 + 63),
                     (byte)(36 + 11),
                     (byte)(29 + 38),
                     (byte)(36 + 30),
                     (byte)(33 + 34),
                     (byte)(21 + 26),
                     (byte)(66 + 14),
                     (byte)(61 + 14),
                     67,
                     (byte)(6 + 77),
                     (byte)(27 + 26),
                     (byte)(42 + 38),
                     (byte)(85 + 12),
                     100,
                     (byte)(42 + 58),
                     (byte)(50 + 55),
                     (byte)(108 + 2),
                     (byte)(86 + 17)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.D("եղձԴմհիմտծԻչսնչտՁࣔࣅࣆࢾ࣏ࣕࣞࣔࣙࣜࣥࣝࣈ", (byte)111, 68));
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

   @Nullable
   public String a(UUID var1) {
      try {
         return DiscordSRV.getPlugin().getAccountLinkManager().getDiscordId(var1);
      } catch (Throwable var3) {
         NLoginCore_370.c(a(a, b ^ d), var3);
         return null;
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_563.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.E("ӧԉԋӫԏԮԦԼԨӷԵԫԹԳӼԡՃՂԺՀԺԏ", (byte)3, 69), NLoginCore_563.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾ\u0891ࢂࢃࡻ\u0892࢛ࢌ\u0891\u0896࢙ࢢ࢚ࢅԗ", (byte)3, 70) + var1 + NLoginCore_575.F("ӹ", (byte)3, 70) + var2.toString(), var4
         );
      }
   }
}
