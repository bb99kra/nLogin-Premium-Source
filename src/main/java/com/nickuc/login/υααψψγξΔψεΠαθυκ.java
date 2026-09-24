package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class υααψψγξΔψεΠαθυκ implements ωυββακσδτιΠΣν {
   private static long r = Long.reverse(-6052837899185946624L);
   private static String[] a = new String[υααψψγξΔψεΠαθυκ.s];
   private static int f = Integer.reverse(1073741824);
   private static int c = 41943040 >>> 151 | 41943040 << ~151 + 1;
   private static int g = Integer.reverse(-1073741824);
   private static long c;
   private static int p = (3145728 >>> 52 | 3145728 << ~52 + 1) & -1;
   private static int h = Integer.reverse(536870912);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int m = (33554432 >>> 248 | 33554432 << -248) & -1;
   private static long b = Long.reverse(-4189046604037926446L);
   private static int i = 268435456 >>> 252 | 268435456 << ~252 + 1;
   private static int a = Integer.reverse(0);
   private static long k = Long.reverse(-4189046604037926446L);
   private static long o = Long.reverse(-6052837899185946624L);
   private static int t = 4096 >>> 202 | 4096 << -202;
   private static int d = (0 >>> 79 | 0 << -79) & -1;
   private static long q = Long.reverse(7628398818182255058L);
   private static int l = Integer.reverse(0);
   private static int s = Integer.reverse(536870912);
   private static int j = Integer.reverse(-1);
   private static String[] b = new String[t];
   private static long n = Long.reverse(7628398818182255058L);

   public υααψψγξΔψεΠαθυκ() {
      c<"㺀">(a, b);
      Class[] var10002 = new Class[c];
      var10002[d] = String.class;
      var10002[e] = String.class;
      var10002[f] = int.class;
      var10002[g] = int.class;
      var10002[h] = int.class;
      Objects.requireNonNull(Player.class.getMethod(c<"㺃">(i & j, k)));
   }

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= 5741056121084713081L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(58 + 10),
                     (byte)(28 + 41),
                     (byte)(21 + 62),
                     (byte)(37 + 10),
                     (byte)(27 + 40),
                     (byte)(17 + 49),
                     67,
                     (byte)(37 + 10),
                     (byte)(50 + 30),
                     (byte)(51 + 24),
                     67,
                     (byte)(70 + 13),
                     (byte)(50 + 3),
                     (byte)(63 + 17),
                     (byte)(6 + 91),
                     (byte)(56 + 44),
                     (byte)(47 + 53),
                     (byte)(36 + 69),
                     (byte)(62 + 48),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πψυκΠΨμΛΩβΣφμφσ.D("ӞӫӪҭӭөӤӭӸӧҴӲӶӯӲӸҺࡑ࠾\u083fࡗࡘࡄࡐࠧ\u085cࡊ࠶ࡈࡐ࡞ࡔ", (byte)66, 68));
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

   @Override
   public void a(Player var1, String var2, String var3, int var4, int var5, int var6) {
      if (var2.isEmpty() && var3.isEmpty()) {
         this.a(var1);
      } else {
         if (var2.isEmpty()) {
            var2 = c<"㺀">(m, n ^ o);
         }

         if (var3.isEmpty()) {
            var3 = c<"㺃">(p, q ^ r);
         }

         var1.sendTitle(var2, var3, var4, var5, var6);
      }
   }

   private static void b() {
      c = 5443377811255573398L;
      long var0 = c ^ 5741056121084713081L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(45 + 23),
               (byte)(12 + 57),
               (byte)(77 + 6),
               (byte)(31 + 16),
               (byte)(46 + 21),
               (byte)(54 + 12),
               (byte)(39 + 28),
               (byte)(28 + 19),
               (byte)(61 + 19),
               (byte)(57 + 18),
               (byte)(66 + 1),
               (byte)(82 + 1),
               53,
               (byte)(68 + 12),
               (byte)(91 + 6),
               (byte)(90 + 10),
               (byte)(81 + 19),
               (byte)(61 + 44),
               (byte)(94 + 16),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
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
               b[0] = λΣΩσμφγχ.F("ԹԿձէդաւպ\u058cՠա՜\u0557ֈ՛ջձֆՏցոֆ՝՞", (byte)78, 70);
               b[1] = ντθΔζβΔζ.D("ԅӔԚԒԆӵӧӜԘԔԗԘԙԒӯԗӱӱԤӿԩԛӲӳ", (byte)78, 68);
               b[2] = φΨαξωυθανΣφυκη.A("ŌƔţƅƊƗŢƌŸƏƜţ", (byte)78, 65);
               b[3] = ντθΔζβΔζ.A("ŌƔţƅƊƗŢƌŸƏƜţ", (byte)78, 65);
               break;
            case 1:
               b[0] = οοθδΨιοΦΠβδζ.F("ԹԿձէդաւպ\u058cՠառ\u058cրՍ՟օՒՓՍքֆ՝՞", (byte)78, 70);
               b[1] = φΨαξωυθανΣφυκη.C("ԅӔԚԒԆӵӧӜԘԔԔӢԟӤӴԦԔԙԄӳԛӵӲӳ", (byte)78, 67);
               b[2] = ςπυηννναΣ.D("ӨӋӣӗӮԕӿԈӹԛӡӧ", (byte)78, 68);
               b[3] = ζβησεθωυγτ.E("ՓՂդհւՂշդնՂխՒ", (byte)78, 69);
               break;
            case 2:
               b[0] = ξψθρΣΠΣς.D("ԐӪԒԄԄӓӻԇӸԁӢԗӢԦԘԛԒӾԫԧԉԫӲӳ", (byte)78, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.D("ӳӯӗӑӖӧԈԑԗӓԞԝԐԗԣәԂԜӳӴԗӧө\u0530ӪԜӻԐԪԣӲԓ", (byte)78, 68);
         }
      }
   }

   @Override
   public void a(Player var1) {
      var1.resetTitle();
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  υααψψγξΔψεΠαθυκ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣφδσΔζιΠρα.C("ӱԓԕӵԙԸ\u0530ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)92, 67), υααψψγξΔψεΠαθυκ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μζξτΩσσφυδεπλΨ.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶԍӺӻԓԔԀԌӣԘԆӲԄԌԚԐƑ", (byte)92, 66) + var1 + ΣφδσΔζιΠρα.E("Ւ", (byte)92, 69) + var2.toString(), var4
         );
      }
   }
}
