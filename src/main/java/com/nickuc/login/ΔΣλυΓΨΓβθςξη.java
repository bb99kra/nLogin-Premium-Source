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
import lombok.Generated;

public class ΔΣλυΓΨΓβθςξη {
   private static int l = (-1 >>> 235 | -1 << -235) & -1;
   private final String aP;
   private static long m = Long.reverse(4433139059464543237L);
   private static long i = Long.reverse(-755007711266268155L);
   private static long c;
   private static int o = -1 >>> 230 | -1 << ~230 + 1;
   private static int r = 41943040 >>> 151 | 41943040 << ~151 + 1;
   private static long p = Long.reverse(4433139059464543237L);
   private static long j = Long.reverse(-4035225266123964416L);
   private static int k = 1572864 >>> 179 | 1572864 << ~179 + 1;
   private static long f = Long.reverse(-755007711266268155L);
   private static int h = Integer.reverse(1073741824);
   private static String[] b = new String[r];
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int q = (-1610612736 >>> 253 | -1610612736 << ~253 + 1) & -1;
   private static long g = Long.reverse(-4035225266123964416L);
   private static int n = Integer.reverse(536870912);
   private final String aO;
   private static long d = Long.reverse(-4035225266123964416L);
   private static long b = Long.reverse(-755007711266268155L);
   private static String[] a = new String[q];
   private static int a = (0 >>> 18 | 0 << -18) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΔΣλυΓΨΓβθςξη.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςπυηννναΣ.F("ԌԮ\u0530ԐԴՓՋաՍԜ՚Ր՞\u0558ԡՆըէ՟ե՟Դ", (byte)40, 70), ΔΣλυΓΨΓβθςξη.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΨΦνΨΦωυΩνβςμ.A("ĲĿľāŁĽĸŁŌĻĈņŊŃņŌĎѴ҄ҝҨѷҍѹҙҠҫҨҢĦ", (byte)40, 65) + var1 + βθκςνθΩθυμςτκχ.C("ѧ", (byte)40, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   public String E() {
      return this.aO;
   }

   private static String a(int var0, long var1) {
      var1 ^= 19L;
      var1 ^= 4244563824604125318L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(61 + 7),
                     (byte)(39 + 30),
                     (byte)(34 + 49),
                     (byte)(29 + 18),
                     (byte)(15 + 52),
                     66,
                     (byte)(46 + 21),
                     (byte)(19 + 28),
                     80,
                     (byte)(16 + 59),
                     (byte)(32 + 35),
                     (byte)(9 + 74),
                     (byte)(35 + 18),
                     (byte)(48 + 32),
                     (byte)(52 + 45),
                     (byte)(87 + 13),
                     (byte)(36 + 64),
                     (byte)(92 + 13),
                     (byte)(45 + 65),
                     (byte)(37 + 66)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨφιωσρΓδΔθ.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴжޜެ߅ߐޟ\u07b5ޡ߁߈ߓߐߊ", (byte)22, 68));
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

   static {
      b();
   }

   public static ΔΣλυΓΨΓβθςξη a(String var0, String var1) {
      return new ΔΣλυΓΨΓβθςξη(var1.replace(c<"㺀">(a, b ^ d), c<"㺃">(e, f ^ g)), var0);
   }

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(h, i ^ j) + this.E() + c<"㺃">(k & l, m) + this.F() + c<"㺆">(n & o, p);
   }

   @Generated
   public ΔΣλυΓΨΓβθςξη(String var1, String var2) {
      this.aO = var1;
      this.aP = var2;
   }

   private static void b() {
      c = -6901534461012893265L;
      long var0 = c ^ 4244563824604125318L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(58 + 11),
               83,
               (byte)(36 + 11),
               (byte)(11 + 56),
               (byte)(39 + 27),
               (byte)(49 + 18),
               47,
               (byte)(5 + 75),
               (byte)(13 + 62),
               (byte)(18 + 49),
               (byte)(53 + 30),
               (byte)(13 + 40),
               (byte)(74 + 6),
               (byte)(5 + 92),
               (byte)(61 + 39),
               (byte)(53 + 47),
               (byte)(72 + 33),
               (byte)(74 + 36),
               (byte)(81 + 22)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
               b[0] = οοθδΨιοΦΠβδζ.B("ŶŹŷƖűŖŽƒƓşżũ", (byte)81, 66);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.A("ƋŲƈƉƑŞƕơƐƜƚũ", (byte)81, 65);
               b[2] = πηγμΣΔκκ.B("ŻśƉžƚƕŷżƠšƖƖƇƚƧŷšƧżŬſƨŹƨƦƁƪƧƬƔűŴ", (byte)81, 66);
               b[3] = δΛψπξκσβγςα.A("ƚōƐůƋźŚƘƃŕƎƀŘŠŨƃƇƌƊŻƣƏŧźƌƛŴžƉƏŮƚ", (byte)81, 65);
               b[4] = ζβησεθωυγτ.E("օա\u0557ՉՈ\u0557ջՠնզՋՕ", (byte)81, 69);
               break;
            case 1:
               b[0] = φδχεθοκψαλΛογλ.E("ՖԾօՠՅՄՃշՙ՞լՕ", (byte)81, 69);
               b[1] = ΨΦνΨΦωυΩνβςμ.E("ՐՄճ\u0558յՃի՛\u058bրհՕ", (byte)81, 69);
               b[2] = ξψθρΣΠΣς.E("էՇյժֆցգը\u058cՍււճֆ֓գՍ֓ը\u0558ի։սսՐ֚սՙ֙՛֒ե", (byte)81, 69);
               b[3] = ΨφιωσρΓδΔθ.A("ƚōƐůƋźŚƘƃŕƎƀŘŠŨƃƇƌƊŻƣƍƙƅƬƜƢƃơŭƧƩ", (byte)81, 65);
               b[4] = δΛψπξκσβγςα.B("ƌźŽŨƞŭŲşƙƋƖũ", (byte)81, 66);
               break;
            case 2:
               b[0] = ΦδφπθΩΩλζξ.A("ŸŗƛŗƙųŨƀƌƣƜƣƗƤŴŲƟƪƭƌŭŷŴŵ", (byte)81, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = πχσδΦΦνθΔπ.A("ŶųŒƕŔśŨƍŪƏſƍƦųŸŧŢƘƄźƉƇŴŵ", (byte)81, 65);
         }
      }
   }

   @Generated
   public String F() {
      return this.aP;
   }
}
