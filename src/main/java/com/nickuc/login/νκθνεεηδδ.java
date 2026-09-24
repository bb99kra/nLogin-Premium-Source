package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum νκθνεεηδδ {
   b,
   c,
   d;

   private static String[] a = new String[νκθνεεηδδ.i];
   private static String[] b = new String[νκθνεεηδδ.j];
   private static long c;
   private static int a = (0 >>> 151 | 0 << -151) & -1;
   private static long b = Long.reverse(-355975510576187558L);
   private static long d = Long.reverse(-6052837899185946624L);
   private static int e = (1572864 >>> 147 | 1572864 << ~147 + 1) & -1;
   private static int f = Integer.reverse(0);
   private static int g = 8 >>> 163 | 8 << ~163 + 1;
   private static int h = Integer.reverse(1073741824);
   private static int i = 16 >>> 194 | 16 << -194;
   private static int j = (131072 >>> 207 | 131072 << ~207 + 1) & -1;
   private static int k = (1024 >>> 106 | 1024 << -106) & -1;
   private static long l = Long.reverse(6273323140913182554L);
   private static int m = Integer.reverse(0);
   private static int n = (268435456 >>> 155 | 268435456 << -155) & -1;
   private static long o = Long.reverse(6273323140913182554L);
   private static int p = (64 >>> 134 | 64 << ~134 + 1) & -1;
   private static int q = Integer.reverse(-1073741824);
   private static long r = Long.reverse(6273323140913182554L);
   private static int s = '耀' >>> 174 | 32768 << ~174 + 1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  νκθνεεηδδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φδχεθοκψαλΛογλ.E("ԢՄՆԦՊթաշգԲհզմծԷ՜վսյջյՊ", (byte)62, 69), νκθνεεηδδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οΩνΩρωλΨηΛδωδ.B("ŞūŪĭŭũŤŭŸŧĴŲŶůŲŸĺӉӇӆӌӅӆӉӇӈŏ", (byte)62, 66) + var1 + ΣφδσΔζιΠρα.E("Դ", (byte)62, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 6551746785302999263L;
      long var0 = c ^ -6828774936855518200L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(28 + 41),
               (byte)(81 + 2),
               (byte)(7 + 40),
               (byte)(54 + 13),
               (byte)(49 + 17),
               67,
               (byte)(11 + 36),
               (byte)(25 + 55),
               (byte)(70 + 5),
               (byte)(21 + 46),
               (byte)(78 + 5),
               (byte)(38 + 15),
               (byte)(25 + 55),
               (byte)(93 + 4),
               (byte)(72 + 28),
               (byte)(66 + 34),
               (byte)(74 + 31),
               (byte)(85 + 25),
               (byte)(44 + 59)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(28 + 40), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = πχσδΦΦνθΔπ.A("ƒŨůŏťƁŢƔřťŹƠŞƕƏƔƠŢſƐƟƟƓŝơŶƮŻƙūžƳƮŬƄƫƤųƻƈƽƵƊƃ", (byte)78, 65);
               b[1] = ξψθρΣΠΣς.B("ŜűƒƎŴšƘƋƎƎƘţ", (byte)78, 66);
               b[2] = λΣΩσμφγχ.B("ƉşŖƔŷŘŤţƘŸƌţ", (byte)78, 66);
               b[3] = ΣδτΠνεγοΓορητ.C("өӐԎӵӭԑӴԠԠԋӪӧ", (byte)78, 67);
               break;
            case 1:
               b[0] = ΣερμΔσατσκ.A("ƒŨůŏťƁŢƔřťŹƠŞƕƏƔƠŢſƐƟƟƓŝơŶƮŻƙūžƳƔůƏƱƷƬƭŸƳƔƼƃ", (byte)78, 65);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.F("քծՓդպ՛՚բփժ՜ՙևրի՞՛հ֖թե֖՝՞", (byte)78, 70);
               b[2] = φδχεθοκψαλΛογλ.F("վհպԾփռֆՊիՌ\u058bՒ", (byte)78, 70);
               b[3] = οοθδΨιοΦΠβδζ.B("ƓƃţŴŲŐŧųƔŸƒŪŲřƖƙƒŤŴŤƐƗŮů", (byte)78, 66);
               break;
            case 2:
               b[0] = πχσδΦΦνθΔπ.C("ԊԚӵӺԐӽӜӟәӴԠӧ", (byte)78, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = δΛψπξκσβγςα.C("ӴӬԊԋԑԗӯԐӪԑӹԕӹԏԤԤԕӾԣӪԔԪԀԎԤԫԑӭԎԀԇԫ", (byte)78, 67);
         }
      }
   }

   public UUID a(String var1, UUID var2) {
      switch (this) {
         case b:
            return UUID.randomUUID();
         case c:
            return var2 != null ? var2 : λΣσΣκΓβΠΨ.d(var1);
         case d:
            return λΣσΣκΓβΠΨ.d(var1);
         default:
            throw new IllegalArgumentException(c<"㺀">(a, b ^ d) + this);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= -6828774936855518200L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     (byte)(15 + 54),
                     (byte)(65 + 18),
                     47,
                     (byte)(43 + 24),
                     (byte)(25 + 41),
                     (byte)(28 + 39),
                     (byte)(25 + 22),
                     (byte)(9 + 71),
                     (byte)(34 + 41),
                     (byte)(55 + 12),
                     (byte)(72 + 11),
                     (byte)(37 + 16),
                     (byte)(36 + 44),
                     (byte)(44 + 53),
                     (byte)(64 + 36),
                     (byte)(69 + 31),
                     (byte)(25 + 80),
                     (byte)(52 + 58),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μεςΩΔΣγν.D("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߈߆߅ߋ߄߅߈߆߇", (byte)23, 68));
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
}
