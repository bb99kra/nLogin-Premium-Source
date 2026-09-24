package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_432 {
   private static String[] b = new String[NLoginCore_432.r];
   private static long o = Long.reverse(676363008676895768L);
   private static String[] a = new String[NLoginCore_432.q];
   private static final Pattern j = Pattern.compile(a(NLoginCore_432.s, NLoginCore_432.t));
   private static long t = Long.reverse(-2782401505143645160L);
   private static long d = Long.reverse(-3458764513820540928L);
   private static int a = 0 >>> 138 | 0 << -138;
   private static long m = Long.reverse(-2782401505143645160L);
   private static int h = Integer.reverse(1073741824);
   private static int r = Integer.reverse(1610612736);
   private static int q = Integer.reverse(1610612736);
   private static long b = Long.reverse(676363008676895768L);
   private static int s = Integer.reverse(-1610612736);
   private static long j = Long.reverse(-3458764513820540928L);
   private static int n = Integer.reverse(536870912);
   private static int k = '쀀' >>> 206 | 49152 << ~206 + 1;
   private static long i = Long.reverse(676363008676895768L);
   private static int f = Integer.reverse(-1);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-2782401505143645160L);
   private static long p = Long.reverse(-3458764513820540928L);
   private static long c;
   private static int l = (-1 >>> 146 | -1 << ~146 + 1) & -1;

   static {
      b();
   }

   public static UUID d(String var0) {
      return UUID.nameUUIDFromBytes((a(n, o ^ p) + var0).getBytes(StandardCharsets.UTF_8));
   }

   public static UUID c(@Nullable String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String var1;
         if (var0.contains(a(a, b ^ d))) {
            var1 = var0;
         } else {
            var1 = j.matcher(var0).replaceAll(a(e & f, g));
         }

         return UUID.fromString(var1);
      } else {
         return null;
      }
   }

   public static UUID a(String var0, UUID var1) {
      return BCryptHashProvider.a().a(var0, var1);
   }

   private static void b() {
      c = 1745539465544681104L;
      long var0 = c ^ -2821616638977443334L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(38 + 31),
               (byte)(38 + 45),
               (byte)(19 + 28),
               (byte)(59 + 8),
               (byte)(56 + 10),
               (byte)(19 + 48),
               (byte)(19 + 28),
               (byte)(35 + 45),
               (byte)(18 + 57),
               (byte)(12 + 55),
               (byte)(28 + 55),
               (byte)(52 + 1),
               (byte)(78 + 2),
               (byte)(14 + 83),
               (byte)(67 + 33),
               (byte)(48 + 52),
               (byte)(80 + 25),
               (byte)(50 + 60),
               (byte)(84 + 19)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.C("҆Ҷұ҇ҟѾҟҫҠҔҍҊ", (byte)47, 67);
               b[1] = NLoginCore_559.B("ĐŇĸĕęįĒĪįŔňŋŐşŗİŏśģĳŖŃİı", (byte)47, 66);
               b[2] = NLoginCore_091.F("ԯ՟՚\u0530ՈԧՈՔՉԽԶԳ", (byte)47, 70);
               b[3] = NLoginCore_446.A("ĦĩĖĘŋĘļĶřĲŞĥ", (byte)47, 65);
               b[4] = NLoginCore_384.D("ҦҒѷҭѵ҈қҵҌґһӂҵѿґҪӀҫҮҺҩҘҕҖ", (byte)47, 68);
               b[5] = NLoginCore_092.E("՟ԟԘբՁՕԜ՟Ջ\u0558թդՉՙԪձԯ՟ՐԶզիկՔՔճՈ՚ջծպԺեՍ՜՚՞ՕՀՈ֍ր՛֏Սսպՠ֊սբՏնա՞՟", (byte)47, 69);
               break;
            case 1:
               b[0] = NLoginCore_453.D("ҥҌҦѽҭүҸҡѿҐҀҊ", (byte)47, 68);
               b[1] = NLoginCore_076.A("ĐŇĸĕęįĒĪįŔňğŞńĞŗőĽĤŒņūĬŗĮįŀŀťĬŉĵ", (byte)47, 65);
               b[2] = NLoginCore_223.E("ՎՂՕբ՞բՅբԥՌԭԳ", (byte)47, 69);
               b[3] = NLoginCore_453.C("ҒҮҔҍҚҌҬүҫҙ҄Ҋ", (byte)47, 67);
               b[4] = NLoginCore_387.D("ҦҒѷҭѵ҈қҵҌґҼҽӁҴҞҪҫӇҺӈҟӉҹ҄ҭ҆ҥӒҮҗҪҧ", (byte)47, 68);
               b[5] = NLoginCore_183.A("őđĊŔĳŇĎőĽŊśŖĻŋĜţġőłĨŘŝšņņťĺŌŭŠŬĬŗĿŎŌŐŇĲĺſŲōšŭűŘŞŷşŚƉŁŤŸŤřŻƅőŨŮųƖ", (byte)47, 65);
               break;
            case 2:
               b[0] = NLoginCore_138.D("҅Ҙ҉ѻѶѶѿѽҗҰүҊ", (byte)47, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_521.D("ҼұҎҼҔ҉ҁҚҍҤҙҊ", (byte)47, 68);
         }
      }
   }

   public static String b(@Nullable UUID var0) {
      return var0 != null ? var0.toString().replace(a(h, i ^ j), a(k & l, m)) : null;
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= -2821616638977443334L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(22 + 47),
                     (byte)(8 + 75),
                     (byte)(2 + 45),
                     (byte)(10 + 57),
                     (byte)(62 + 4),
                     (byte)(41 + 26),
                     (byte)(38 + 9),
                     (byte)(2 + 78),
                     (byte)(62 + 13),
                     (byte)(61 + 6),
                     (byte)(24 + 59),
                     (byte)(13 + 40),
                     80,
                     (byte)(60 + 37),
                     100,
                     (byte)(54 + 46),
                     (byte)(14 + 91),
                     (byte)(66 + 44),
                     (byte)(68 + 35)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(60 + 23)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.B("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӣӌӭӎӦӀӠӏӘ", (byte)76, 66));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_432.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_432.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӝӆӧӈӠҺӚӉӒť", (byte)73, 66) + var1 + NLoginCore_397.E("Կ", (byte)73, 69) + var2.toString(), var4
         );
      }
   }
}
