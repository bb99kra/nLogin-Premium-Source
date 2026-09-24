package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class μλωΨδΩΣΔα<T> implements ςνΛωΠθρπυΣμκΓΩο<T> {
   private final Class<?> b;
   public static μλωΨδΩΣΔα<Long> d = new μλωΨδΩΣΔα<>(long.class, Long.class);
   private static int n = (268435456 >>> 186 | 268435456 << ~186 + 1) & -1;
   private static int o = (8 >>> 97 | 8 << -97) & -1;
   public static μλωΨδΩΣΔα<String> a = new μλωΨδΩΣΔα<>(String.class, String.class);
   private static long c;
   private static long m = Long.reverse(-8420789556146627946L);
   private static long f = Long.reverse(658467292632291990L);
   private static long d = Long.reverse(-9079256848778919936L);
   private final Class<T> c;
   private static long j = Long.reverse(-9079256848778919936L);
   private static String[] a = new String[n];
   private static int h = 33554432 >>> 120 | 33554432 << -120;
   private static int k = Integer.reverse(-1073741824);
   private static String[] b = new String[o];
   public static μλωΨδΩΣΔα<Boolean> c = new μλωΨδΩΣΔα<>(boolean.class, Boolean.class);
   private static long b = Long.reverse(658467292632291990L);
   private static long g = Long.reverse(-9079256848778919936L);
   private static int l = Integer.reverse(-1);
   public static μλωΨδΩΣΔα<Integer> b = new μλωΨδΩΣΔα<>(int.class, Integer.class);
   private static int e = 134217728 >>> 187 | 134217728 << -187;
   private static long i = Long.reverse(658467292632291990L);
   private static int a = (0 >>> 193 | 0 << -193) & -1;

   @Generated
   public Class<T> b() {
      return this.c;
   }

   @Override
   public JSONObject a(@Nonnull Object var1) {
      JSONObject var2 = new JSONObject();
      var2.put(c<"㺀">(a, b ^ d), var1);
      return var2;
   }

   private static void b() {
      c = 7591364220862252176L;
      long var0 = c ^ -7773575626989166019L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(34 + 35),
               (byte)(35 + 48),
               (byte)(26 + 21),
               (byte)(57 + 10),
               (byte)(42 + 24),
               (byte)(22 + 45),
               (byte)(33 + 14),
               (byte)(74 + 6),
               (byte)(71 + 4),
               (byte)(15 + 52),
               (byte)(73 + 10),
               (byte)(36 + 17),
               (byte)(54 + 26),
               (byte)(31 + 66),
               100,
               (byte)(23 + 77),
               (byte)(44 + 61),
               (byte)(21 + 89),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
               b[0] = ΣφδσΔζιΠρα.E("ւօսր՝ՙՅՓ՞էխՒ", (byte)78, 69);
               b[1] = ΦδφπθΩΩλζξ.C("ԗԚԒԕӲӮӚӨӳӼԂӧ", (byte)78, 67);
               b[2] = χφπρψπφΦθμπ.C("ӑӮӬԖӤӝӗӛӨӗӽԒԓӗԇӝӠԣԗԂӧӣԤԠԝԒԆԎԁӭԑԭ", (byte)78, 67);
               b[3] = ΨΦνΨΦωυΩνβςμ.F("ջցՀյճֆՓյՠգփֈհխկՋ՞իևֆշհ՝՞", (byte)78, 70);
               break;
            case 1:
               b[0] = θεωψξβΛσσ.F("ՐԿսօվզն\u0557՚ը՞կՈ՝ՎՒօդՏզիՠ՝՞", (byte)78, 70);
               b[1] = ΠΛΨοδΩσμνΛγΦφβς.D("ԕӥӳӪӚӱӿԒӚӲԜӧ", (byte)78, 68);
               b[2] = ιΠοθΩΦξκ.A("ōŪŨƒŠřœŗŤœŹƎƏœƃřŜƟƓžţťŦƖŤƈƦƠŪƬźƎ", (byte)78, 65);
               b[3] = πηγμΣΔκκ.F("ջցՀյճֆՓյՠգօ՛֊՛՚եևաՍաՑ֖՝՞", (byte)78, 70);
               break;
            case 2:
               b[0] = ζβησεθωυγτ.A("ƀƐŢƅƀŧƔƑƕżƞŜƐƎſƞƑůŜŶƅƗŮů", (byte)78, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = πχσδΦΦνθΔπ.E("ձԻՙ\u0558ևՈ՟֊՟օարհ\u0590բիՐֆ֊մՑֆ՝՞", (byte)78, 69);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 65L;
      var1 ^= -7773575626989166019L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     69,
                     (byte)(36 + 47),
                     (byte)(22 + 25),
                     (byte)(27 + 40),
                     (byte)(28 + 38),
                     (byte)(40 + 27),
                     (byte)(25 + 22),
                     (byte)(41 + 39),
                     (byte)(62 + 13),
                     (byte)(22 + 45),
                     (byte)(11 + 72),
                     (byte)(51 + 2),
                     (byte)(54 + 26),
                     97,
                     (byte)(7 + 93),
                     (byte)(43 + 57),
                     (byte)(14 + 91),
                     (byte)(61 + 49),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨφιωσρΓδΔθ.D("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡗࡗࡦࡆࡓࡉࡄ࠶ࡔ", (byte)71, 68));
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
   public T a(@Nonnull JSONObject var1) {
      Object var2 = var1.get(c<"㺀">(e, f ^ g));
      if (this.c.isInstance(var2)) {
         return this.c.cast(var2);
      } else {
         throw new IllegalArgumentException(c<"㺃">(h, i ^ j) + var2.getClass() + c<"㺆">(k & l, m) + this.c);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  μλωΨδΩΣΔα.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.A("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 65), μλωΨδΩΣΔα.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οοθδΨιοΦΠβδζ.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԜԜԫԋԘԎԉӻԙƣ", (byte)104, 65) + var1 + ΣφδσΔζιΠρα.D("ԧ", (byte)104, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   public μλωΨδΩΣΔα(Class<?> var1, Class<T> var2) {
      this.b = var1;
      this.c = var2;
   }

   @Generated
   @Override
   public Class<?> a() {
      return this.b;
   }
}
