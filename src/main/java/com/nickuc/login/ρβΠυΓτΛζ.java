package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class ρβΠυΓτΛζ {
   private static long t = Long.reverse(-1152921504606846976L);
   private static long ak = Long.reverse(-5174925137606256836L);
   private static int ab = Integer.reverse(-1610612736);
   private static int as = (37748736 >>> 150 | 37748736 << -150) & -1;
   private static int f = Integer.reverse(-1);
   private static int a = (0 >>> 55 | 0 << -55) & -1;
   private static int ae = -1 >>> 253 | -1 << -253;
   private static long z = Long.reverse(5201368403855365948L);
   private static int o = 1024 >>> 202 | 1024 << -202;
   private static long ac = Long.reverse(5201368403855365948L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int k = 4194304 >>> 22 | 4194304 << -22;
   private static long w = Long.reverse(-1152921504606846976L);
   public static int p = ρβΠυΓτΛζ.au;
   private static int ap = (0 >>> 52 | 0 << ~52 + 1) & -1;
   private static int ag = 0 >>> 188 | 0 << ~188 + 1;
   private static int x = (8 >>> 65 | 8 << -65) & -1;
   private static int at = Integer.reverse(-1879048192);
   private static int ar = (98304 >>> 142 | 98304 << ~142 + 1) & -1;
   private static int an = Integer.reverse(-1);
   private static int au = Integer.reverse(-1);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long ao = Long.reverse(5201368403855365948L);
   private static int l = 0 >>> 127 | 0 << ~127 + 1;
   private static int i = -1 >>> 28 | -1 << ~28 + 1;
   private static String[] b = new String[at];
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int e = (-1 >>> 43 | -1 << -43) & -1;
   private static long d = Long.reverse(-1152921504606846976L);
   private static long al = Long.reverse(-1152921504606846976L);
   private static long c;
   private static int aj = Integer.reverse(-536870912);
   private static int g = (134217728 >>> 251 | 134217728 << -251) & -1;
   private static int am = (4096 >>> 9 | 4096 << -9) & -1;
   private static int n = Integer.reverse(0);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int y = Integer.reverse(-1);
   private static int r = (33554432 >>> 216 | 33554432 << -216) & -1;
   private static long p = Long.reverse(-5174925137606256836L);
   private static long af = Long.reverse(5201368403855365948L);
   private static String[] a = new String[as];
   private static long v = Long.reverse(-5174925137606256836L);
   private static long b = Long.reverse(-5174925137606256836L);
   private static int ah = -1073741821 >>> 253 | -1073741821 << ~253 + 1;
   private static int aq = Integer.reverse(2013265920);
   private static int u = Integer.reverse(-1073741824);
   private static long q = Long.reverse(-1152921504606846976L);
   private static int ad = (25165824 >>> 182 | 25165824 << -182) & -1;
   private static int ai = (1572864 >>> 178 | 1572864 << -178) & -1;
   private static long s = Long.reverse(-5174925137606256836L);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 15L;
      var1 ^= 6948599147676977374L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(57 + 11),
                     (byte)(66 + 3),
                     (byte)(25 + 58),
                     (byte)(24 + 23),
                     (byte)(26 + 41),
                     (byte)(41 + 25),
                     (byte)(43 + 24),
                     (byte)(41 + 6),
                     (byte)(17 + 63),
                     (byte)(41 + 34),
                     (byte)(60 + 7),
                     (byte)(30 + 53),
                     (byte)(48 + 5),
                     80,
                     97,
                     (byte)(70 + 30),
                     (byte)(99 + 1),
                     (byte)(17 + 88),
                     (byte)(58 + 52),
                     (byte)(39 + 64)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(49 + 34)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΦδφπθΩΩλζξ.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫ࠾࠰ࠟࡅࠔࡆࠞ࠺", (byte)61, 68));
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

   public static void a(ΨγημιδξΓτοθαζ var0, int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException(c<"㺀">(a, b ^ d));
      } else if (p != e) {
         p = f;
      } else {
         p = var1 + g;
         var0.b((boolean)h).a(var1x -> {
            if (!var0.N()) {
               var1x.Z();
            } else {
               Collection var2 = var0.b().c();
               if (p == i) {
                  var2.forEach(var0xx -> var0xx.a(c<"㺀">(aj, ak ^ al), c<"㺃">(am & an, ao), ap, aq, ar));
                  var1x.Z();
               } else {
                  if (p > 0) {
                     p = p - j;
                  }

                  int var3 = p == 0 ? k : l;
                  int var4 = var0.b().a() == κιββωσγχςΣβΠΣδ.b ? m : n;

                  for (ΨαχΨχΣλεΠψΦ var6 : var2) {
                     if (var3 != 0) {
                        if (var4 != 0) {
                           try {
                              var6.<Player>c().closeInventory();
                           } catch (Exception var8) {
                           }
                        }

                        var6.a(c<"㺀">(o, p ^ q));
                     } else {
                        var6.a(c<"㺃">(r, s ^ t), c<"㺆">(u, v ^ w) + p + c<"㺉">(x & y, z) + (p == aa ? c<"㺌">(ab, ac) : c<"㺏">(ad & ae, af)), ag, ah, ai);
                     }
                  }

                  if (var3 != 0) {
                     var0.b().c();
                     var1x.Z();
                  }
               }
            }
         }, 0L, 1L, TimeUnit.SECONDS);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ρβΠυΓτΛζ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χφπρψπφΦθμπ.D("ПсуУчѦўѴѠЯѭѣѱѫдљѻѺѲѸѲч", (byte)22, 68), ρβΠυΓτΛζ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(μζξτΩσσφυδεπλΨ.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѽѯў҄ѓ҅ѝѹþ", (byte)22, 65) + var1 + ξψθρΣΠΣς.F("Ԍ", (byte)22, 70) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = 4389529258106516509L;
      long var0 = c ^ 6948599147676977374L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(21 + 47),
               (byte)(26 + 43),
               (byte)(58 + 25),
               (byte)(36 + 11),
               (byte)(19 + 48),
               (byte)(17 + 49),
               (byte)(22 + 45),
               (byte)(38 + 9),
               80,
               (byte)(37 + 38),
               (byte)(3 + 64),
               (byte)(8 + 75),
               (byte)(33 + 20),
               (byte)(73 + 7),
               (byte)(93 + 4),
               100,
               (byte)(74 + 26),
               (byte)(10 + 95),
               (byte)(41 + 69),
               (byte)(89 + 14)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
               b[0] = ςπυηννναΣ.D("ԳԕՃՅՅԔԋՊԥԡԭԸՋՋՒԿՉԏԒՊԹՉՆԦԳԯԾԜԓԺ՝ԸՙԥԳՒՈԡ՚\u0557՝՚ՇԴ", (byte)93, 68);
               b[1] = φΨαξωυθανΣφυκη.F("ջ֑֎եՌյրՋ֚մշՓ֘Օյշ՝֍֣՝֖֦ց֚գոժ֤֦֤հրցր֩և֖֠յ֒ոճշց", (byte)93, 70);
               b[2] = βεξΠθρρςΔΦμ.F("ցհփՓծտֆ։֔ճֈ֕ձ֓ՠ֛֙քուդտլխ", (byte)93, 70);
               b[3] = μεςΩΔΣγν.F("հ֓֍Ռխ՟հ֗ոճպՕճ։\u0557֣֛֕֞ջփ֚֝քղփ֖ւ֍եպ֥", (byte)93, 70);
               b[4] = ΣδτΠνεγοΓορητ.C("ӽՀԳԿԨԣՉԣՀԀԫԔ", (byte)93, 67);
               b[5] = πηγμΣΔκκ.B("ƤƫƑƔƴƗŰŵƒƉƔƁ", (byte)93, 66);
               b[6] = φΨαξωυθανΣφυκη.B("ŤƥŬŰƕƋƉƑŰŷųƁ", (byte)93, 66);
               b[7] = δΛψπξκσβγςα.D("ԴԣԶԆԡԲԹԼՇԦԻՈԤՆԓՌՎԷԫԵԗԲԟԠ", (byte)93, 68);
               b[8] = δΛψπξκσβγςα.D("ԒԏԧԃԶԘՉԽՀՇԝԐԝԩԬՊԱԌԸԦԣԢԧՐԬ՛ԛԺԯՃՂՅ", (byte)93, 68);
               break;
            case 1:
               b[0] = μζξτΩσσφυδεπλΨ.F("րբ\u0590֒֒ա\u0558֗ղծպօ֘֘֟\u058c֖՜՟֗ֆ֖֓ճրռ\u058bթՠև֪օ֫֫֎֏ֱֲ֤֥֙նֵֺֻ֚֓֯մս֎׀ֵֻ\u058c֍", (byte)93, 70);
               b[1] = μεςΩΔΣγν.D("ԮՄՁԘӿԨԳӾՍԧԪԆՋԈԨԪԐՀՖԐՉՙԴՍԖԫԝ\u0557ՙ\u0557ԣԳՙԝՠըԵ՚ժՄԦկՂԪԣՠՔըՈԮՑՉ\u0530ոԿՀ", (byte)93, 68);
               b[2] = πχσδΦΦνθΔπ.F("ցհփՓծտֆ։֔ճև֞֔շ։ա֝ոջմդղյ֊֜նվջ֣ֆ֎֡", (byte)93, 70);
               b[3] = φδχεθοκψαλΛογλ.F("հ֓֍Ռխ՟հ֗ոճպՕճ։\u0557֣֛֕֞ջփ֞՞֖֖՝իգ֏֝֩կֆֆֆ֬խխ֏֤օֲ֙ց", (byte)93, 70);
               b[4] = λΣΩσμφγχ.A("ƅƍƪƨƕƍƩƮƇƇųƁ", (byte)93, 65);
               b[5] = ξψθρΣΠΣς.F("֓Ռըր֗ւզևւղզշժէ֓՟֍֗խ՛կ֕լխ", (byte)93, 70);
               b[6] = βθκςνθΩθυμςτκχ.D("ԣԝԚԖԲՇԂՊԙԹՅԪԿՁԒԥԱՒԪՐԋԲԟԠ", (byte)93, 68);
               b[7] = λΣΩσμφγχ.E("ցհփՓծտֆ։֔ճֆ\u0558֊և֑֑֞֙ռոօ֖էչօք֝֊֩֏֤֥", (byte)93, 69);
               b[8] = χΠξΦιζΨΣωΦσΨζ.D("ԒԏԧԃԶԘՉԽՀՇԝԐԝԩԬՊԱԌԸԦԣԦՈԭԮՔԯԸԩՃդ՝ԗՐՕբԠԶԢ՞ՆՎԿԴ", (byte)93, 68);
               break;
            case 2:
               b[0] = χΠξΦιζΨΣωΦσΨζ.A("ƱƟƃƫƳƍƭŶƌƱŲƴƆŹƖƶƛƤƢǃƧƝƼƽƜƝƺǌƜƸƞǑ", (byte)93, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςΦζσμτΓσ.F("Ց\u0590ձՔթճ֒։Օչ՜չ֙֍յ\u058c՞գ֓֔փ֝դ֤֖֕֘ֆ֗լֲ֨", (byte)93, 70);
         }
      }
   }
}
