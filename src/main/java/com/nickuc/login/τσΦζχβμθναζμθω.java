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

public enum τσΦζχβμθναζμθω {
   a,
   b,
   c,
   d,
   e;

   private static String[] a = new String[τσΦζχβμθναζμθω.g];
   private static String[] b = new String[τσΦζχβμθναζμθω.h];
   private static long c;
   private static int a = Integer.reverse(-1610612736);
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 67108864 >>> 185 | 67108864 << -185;
   private static int e = (-1073741824 >>> 158 | -1073741824 << ~158 + 1) & -1;
   private static int f = 1024 >>> 8 | 1024 << ~8 + 1;
   private static int g = Integer.reverse(-1610612736);
   private static int h = Integer.reverse(-1610612736);
   private static int i = Integer.reverse(0);
   private static int j = (-1 >>> 238 | -1 << ~238 + 1) & -1;
   private static long k = Long.reverse(2750724536644559562L);
   private static int l = Integer.reverse(0);
   private static int m = 256 >>> 200 | 256 << ~200 + 1;
   private static long n = Long.reverse(2750724536644559562L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int p = (128 >>> 166 | 128 << ~166 + 1) & -1;
   private static long q = Long.reverse(2750724536644559562L);
   private static int r = 8388608 >>> 246 | 8388608 << ~246 + 1;
   private static int s = Integer.reverse(-1073741824);
   private static long t = Long.reverse(2750724536644559562L);
   private static int u = 6 >>> 1 | 6 << ~1 + 1;
   private static int v = Integer.reverse(536870912);
   private static long w = Long.reverse(4768337169706541770L);
   private static long x = Long.reverse(7205759403792793600L);
   private static int y = 131072 >>> 207 | 131072 << ~207 + 1;

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= -4569337575860352668L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(16 + 53),
                     (byte)(24 + 59),
                     (byte)(4 + 43),
                     (byte)(29 + 38),
                     (byte)(25 + 41),
                     (byte)(61 + 6),
                     (byte)(5 + 42),
                     (byte)(61 + 19),
                     (byte)(47 + 28),
                     (byte)(29 + 38),
                     (byte)(12 + 71),
                     (byte)(6 + 47),
                     (byte)(26 + 54),
                     97,
                     (byte)(12 + 88),
                     100,
                     (byte)(44 + 61),
                     (byte)(9 + 101),
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(4 + 79)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ςπυηννναΣ.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ\u07fc\u07fcߠ߱ࠃ߯ߺ߷߽߲߸߿\u07fcࠎ", (byte)38, 68));
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
                  τσΦζχβμθναζμθω.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(βεξΠθρρςΔΦμ.A("çĉċëďĮĦļĨ÷ĵīĹĳüġŃłĺŀĺď", (byte)32, 65), τσΦζχβμθναζμθω.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φΨαξωυθανΣφυκη.E("ԿՌՋԎՎՊՅՎՙՈԕՓ\u0557ՐՓՙԛࢱࢱ\u0895ࢦࢸࢤࢯࢬࢲࢧࢭࢴࢱࣃԵ", (byte)32, 69) + var1 + ξψθρΣΠΣς.E("Ԗ", (byte)32, 69) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 6000595180364837954L;
      long var0 = c ^ -4569337575860352668L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(33 + 36),
               (byte)(41 + 42),
               (byte)(17 + 30),
               (byte)(51 + 16),
               (byte)(14 + 52),
               (byte)(24 + 43),
               47,
               (byte)(51 + 29),
               (byte)(10 + 65),
               (byte)(65 + 2),
               (byte)(15 + 68),
               (byte)(12 + 41),
               (byte)(18 + 62),
               (byte)(50 + 47),
               (byte)(78 + 22),
               (byte)(80 + 20),
               (byte)(15 + 90),
               (byte)(14 + 96),
               (byte)(83 + 20)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
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
               b[0] = ΦδφπθΩΩλζξ.F("խբ֦֧֠֩֔ֆէվ։ղ", (byte)110, 70);
               b[1] = βεξΠθρρςΔΦμ.F("ջ՚\u0590֜ցը֕՜֞֡չտְֳ֪֝֡ցրփ֤րսվ", (byte)110, 70);
               b[2] = φΨαξωυθανΣφυκη.A("ǈƲƔǌƨƳƘƥƓƻƝƧƶƗǊƕǔǣưƞƦǗƮƯ", (byte)110, 65);
               b[3] = δΛψπξκσβγςα.C("եՈ\u0530մռՙտ\u0558ճ\u0557՚ԽՃֆՙտյեՀււջՒՓ", (byte)110, 67);
               b[4] = οοθδΨιοΦΠβδζ.D("եՈ\u0530մռՙտ\u0558ճ\u0557՚ՙվԻղրտպռնՆեՒՓ", (byte)110, 68);
               break;
            case 1:
               b[0] = χφπρψπφΦθμπ.A("ƎươǉǁǂǛǛǝƼƯǘǜƓǚǗƚǣƦǝƱƱƮƯ", (byte)110, 65);
               b[1] = βεξΠθρρςΔΦμ.C("ՐԯեձՖԽժԱճնՑչԿճԸՠՁվւՁ՞ՕՒՓ", (byte)110, 67);
               b[2] = φδχεθοκψαλΛογλ.A("ǈƲƔǌƨƳƘƥƓƻƔǠǕǌƞǙƾƾƲưǞǗƮƯ", (byte)110, 65);
               b[3] = χφπρψπφΦθμπ.F("\u0590ճ՛֧֟ք֪փ֞ւև֙լջց֍ֱֳִ֞րֶսվ", (byte)110, 70);
               b[4] = μζξτΩσσφυδεπλΨ.B("ǁƤƌǐǘƵǛƴǏƳƷǐǡƗƙƯƣǂǚƱǄǡƷǘǖǙƭƦǱƧǊƫ", (byte)110, 66);
               break;
            case 2:
               b[0] = ζβησεθωυγτ.E("֢֝օ֠ֈ֢՛նդ֦֤֗թְ֊֏֟֎\u058c։֧\u0590ո֤֒ղևչֿ֑րպ", (byte)110, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.C("ոԶբ՛՜ՈժԹՋԸԺՎՐԾ՝ՀզնպէՙեՒՓ", (byte)110, 67);
         }
      }
   }

   static {
      b();
   }
}
