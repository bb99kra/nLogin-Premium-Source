package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class φεηχςΩοΠωΓγεξ extends ζαξρυωβζπ implements λιμριγδβψ {
   private static long as = Long.reverse(51836685379508772L);
   private static int f = (0 >>> 193 | 0 << -193) & -1;
   private static int al = Integer.reverse(536870912);
   private static int ai = 0 >>> 34 | 0 << -34;
   private static int v = (2097152 >>> 205 | 2097152 << -205) & -1;
   private static int ag = Integer.reverse(2097152);
   private static int ak = Integer.reverse(0);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static final char[] e = c<"㺃">(φεηχςΩοΠωΓγεξ.ar, as ^ φεηχςΩοΠωΓγεξ.at).toCharArray();
   private static int p = (1 >>> 127 | 1 << -127) & -1;
   private static int ah = 0 >>> 126 | 0 << -126;
   private static int ao = Integer.reverse(1073741824);
   private static long at = Long.reverse(4035225266123964416L);
   private static int k = 0 >>> 95 | 0 << ~95 + 1;
   private static long h = Long.reverse(4087061951503473188L);
   private static int n = (8 >>> 227 | 8 << ~227 + 1) & -1;
   private static long ae = Long.reverse(51836685379508772L);
   private static long aq = Long.reverse(4035225266123964416L);
   private static String[] c = new String[al];
   private static String[] d = new String[φεηχςΩοΠωΓγεξ.am];
   private static int am = Integer.reverse(536870912);
   private static final int aC = φεηχςΩοΠωΓγεξ.an;
   private static int ar = Integer.reverse(-1073741824);
   private static int s = (0 >>> 210 | 0 << ~210 + 1) & -1;
   private static int w = (0 >>> 2 | 0 << -2) & -1;
   private static int aj = 2048 >>> 235 | 2048 << ~235 + 1;
   private static int an = Integer.reverse(2097152);
   private static int i = Integer.reverse(536870912);
   private static int q = Integer.reverse(-1073741824);
   private static final String ct = c<"㺀">(ao, φεηχςΩοΠωΓγεξ.ap ^ aq);
   private static long af = Long.reverse(4035225266123964416L);
   private static long ap = Long.reverse(51836685379508772L);
   private static int g = -1 >>> 155 | -1 << -155;
   private static long e;

   private static String a(int var0, long var1) {
      var1 ^= 28L;
      var1 ^= 9016704428008711820L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     (byte)(10 + 59),
                     83,
                     (byte)(15 + 32),
                     (byte)(18 + 49),
                     (byte)(64 + 2),
                     (byte)(11 + 56),
                     (byte)(20 + 27),
                     (byte)(54 + 26),
                     (byte)(26 + 49),
                     (byte)(43 + 24),
                     (byte)(11 + 72),
                     (byte)(28 + 25),
                     (byte)(59 + 21),
                     (byte)(76 + 21),
                     (byte)(97 + 3),
                     (byte)(28 + 72),
                     (byte)(70 + 35),
                     (byte)(19 + 91),
                     (byte)(86 + 17)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣδτΠνεγοΓορητ.F("օ֑֒Ք֔\u0590\u058b֔֟֎՛֖֙֝֙֟աࣹࣩࣹ࣬ࣽ࣡ࣸࣚऄࣰ࣏ࣳࣽ", (byte)102, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   static {
      b();
   }

   @Override
   public boolean i(String var1, String var2) {
      String[] var3 = var2.split(c<"㺀">(f & g, h));
      if (var3.length != i) {
         return (boolean)k;
      } else {
         int var4 = n << Integer.parseInt(var3[p]);
         byte[] var5 = Base64.getUrlDecoder().decode(var3[q]);
         byte[] var6 = Arrays.copyOfRange(var5, s, v);
         char[] var7 = e;
         int var8 = var7.length;

         for (int var9 = w; var9 < var8; var9++) {
            char var10 = var7[var9];
            byte[] var11 = a(c<"㺃">(ad, ae ^ af), (var1 + var10).toCharArray(), var6, var4, ag);
            int var12 = ah;

            for (int var13 = ai; var13 < var11.length; var13++) {
               var12 |= var5[var6.length + var13] ^ var11[var13];
            }

            if (var12 == 0) {
               return (boolean)aj;
            }
         }

         return (boolean)ak;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  φεηχςΩοΠωΓγεξ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.C("ѶҘҚѺҞҽҵӋҷ҆ӄҺӈӂҋҰӒӑӉӏӉҞ", (byte)51, 67), φεηχςΩοΠωΓγεξ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φδχεθοκψαλΛογλ.A("ňŕŔėŗœŎŗŢőĞŜŠřŜŢĤҼҬүӀҼҤһҝӇҒҳҶӀĽ", (byte)51, 65) + var1 + ΣφδσΔζιΠρα.F("ԩ", (byte)51, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      e = 2618990840207645952L;
      long var0 = e ^ 9016704428008711820L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(31 + 38),
               (byte)(59 + 24),
               47,
               (byte)(63 + 4),
               66,
               (byte)(5 + 62),
               (byte)(45 + 2),
               (byte)(58 + 22),
               (byte)(14 + 61),
               (byte)(2 + 65),
               (byte)(46 + 37),
               (byte)(35 + 18),
               (byte)(28 + 52),
               (byte)(83 + 14),
               (byte)(58 + 42),
               (byte)(65 + 35),
               (byte)(46 + 59),
               (byte)(94 + 16),
               (byte)(34 + 69)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
               d[0] = ιΠοθΩΦξκ.F("՜Նԗ\u0557ԼԼՋԹգ՜Նԫ", (byte)39, 70);
               d[1] = ζβησεθωυγτ.E("Էԯԗ\u0557Չ\u0557ՍԱԛ՚ՕԥԱԺԦՖԞՃԶհՌ՟ԶԷ", (byte)39, 69);
               d[2] = πχσδΦΦνθΔπ.A("ġęāŁĳŁķěąńĿďěĤĐŀĈĭĠŚĶŉĠġ", (byte)39, 65);
               d[3] = πχσδΦΦνθΔπ.F("՛ԓԨՉԗԙԴԺՒԯէՕ՛Լթ՝ՆծԭԹ՜ՍԨԲդԾՐՔՊձՑջմԻՌջռԻՕփպՖՙչգբրՓդպ֎ՠվցբջ֕ՔՍՉՕ֑ՔՒ֕֞շ֚֘\u0590ոլ֟ո֠օ֖֡գվև֚թւվչնշ", (byte)39, 70);
               break;
            case 1:
               d[0] = ντθΔζβΔζ.A("ĘēŇŅĻŅĊĶĪŀŊĕ", (byte)39, 65);
               d[1] = λΣΩσμφγχ.D("ѾѶўҞҐҞҔѸѢҡҝѨҋѩ҆ѯқѭѬҟғҐѽѾ", (byte)39, 68);
               d[2] = μζξτΩσσφυδεπλΨ.D("ѾѶўҞҐҞҔѸѢҡҞѶүҦҩҳұѲҌѮҲҐѽѾ", (byte)39, 68);
               d[3] = πηγμΣΔκκ.A("ŅýĒĳāăĞĤļęőĿŅĦœŇİŘėģņķĒĜŎĨĺľĴśĻťŞĥĶťŦĥĿŭŤŀŃţōŌŪĽŎŤŸŊŨūŌťſľķĳĿŻľļſƈšƄƂźŢŖƉŢƊŢşŞŽƃŠōƎœƉţŠš", (byte)39, 65);
               break;
            case 2:
               d[0] = ΣφδσΔζιΠρα.C("ѵҙѽҡғѳ҆ѴҤҫҕѼѪѼҢҢѯ҆ҋҤѵҀѽѾ", (byte)39, 67);
            case 3:
            default:
               break;
            case 4:
               d[0] = δΛψπξκσβγςα.D("ңѢҀ҆҇ҕҀҨҔѦҟѲ", (byte)39, 68);
         }
      }
   }
}
