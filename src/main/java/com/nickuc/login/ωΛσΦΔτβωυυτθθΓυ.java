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

public class ωΛσΦΔτβωυυτθθΓυ implements ψνρωκλαΓςσλζςΣ {
   private static long g = Long.reverse(5810409003405798547L);
   private static long d = Long.reverse(5810409003405798547L);
   private static int n = Integer.reverse(536870912);
   private static String[] b = new String[ωΛσΦΔτβωυυτθθΓυ.o];
   private static int k = Integer.reverse(-1073741824);
   private static int l = (-1 >>> 43 | -1 << ~43 + 1) & -1;
   private final String by;
   private static int h = Integer.reverse(1073741824);
   private final Object f;
   private static long c;
   private static long m = Long.reverse(5810409003405798547L);
   private static String[] a = new String[n];
   private static int e = (256 >>> 8 | 256 << ~8 + 1) & -1;
   private final String bx;
   private static int o = 4 >>> 64 | 4 << -64;
   private static int b = Integer.reverse(-1);
   private static int a = 0 >>> 221 | 0 << ~221 + 1;
   private static long j = Long.reverse(5810409003405798547L);
   private static int f = (-1 >>> 168 | -1 << -168) & -1;
   private static int i = -1 >>> 233 | -1 << ~233 + 1;

   @Generated
   public String s() {
      return this.by;
   }

   private static void b() {
      c = -3947442576304552636L;
      long var0 = c ^ 3442233256120161569L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(44 + 24),
               (byte)(34 + 35),
               (byte)(57 + 26),
               (byte)(11 + 36),
               (byte)(27 + 40),
               (byte)(35 + 31),
               (byte)(44 + 23),
               (byte)(15 + 32),
               (byte)(33 + 47),
               (byte)(19 + 56),
               (byte)(63 + 4),
               (byte)(62 + 21),
               (byte)(18 + 35),
               80,
               (byte)(83 + 14),
               (byte)(61 + 39),
               (byte)(93 + 7),
               (byte)(100 + 5),
               110,
               (byte)(93 + 10)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
               b[0] = οΩνΩρωλΨηΛδωδ.F("ավ֎ցՖձէն֘մ֜\u0558նճՒ\u058b֔իղբձւ՞֑օ֘զօ֊֥֛֚", (byte)93, 70);
               b[1] = λΣΩσμφγχ.C("ԅԝԵԙՆԲԩԭԠՌԥԍԍԌՑԓԟՈԓՇԣԲԟԠ", (byte)93, 67);
               b[2] = μζξτΩσσφυδεπλΨ.A("ƅƀƇƨƎųƒŲƪƈƘƲƶƏŹƐŴƳƷǃǂƏƌƍ", (byte)93, 65);
               b[3] = μζξτΩσσφυδεπλΨ.C("ӾԵԒԗՇՄԕԃԫԢԽԔ", (byte)93, 67);
               break;
            case 1:
               b[0] = χφπρψπφΦθμπ.E("ավ֎ցՖձէն֘մ֜\u0558նճՒ\u058b֔իղբձ֓էվՠ՝֍֪ցռւց", (byte)93, 69);
               b[1] = οοθδΨιοΦΠβδζ.D("ԅԝԵԙՆԲԩԭԠՌԥԿՊՑԓ\u0530ԿՄՆՉԫՈԟԠ", (byte)93, 68);
               b[2] = ιΠοθΩΦξκ.E("եՠէֈծՓղՒ֊ըջհխ֝խն֙֠֞շջկլխ", (byte)93, 69);
               b[3] = πηγμΣΔκκ.D("Ԗԓ\u0530ԣՊՈՁՉՂԊԟԔ", (byte)93, 68);
               break;
            case 2:
               b[0] = ΨΦνΨΦωυΩνβςμ.A("ƲƇƢŽƴŰƉŲŴƃŴŴƏƶƛƁƀƍǁƥưƵƌƍ", (byte)93, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = πχσδΦΦνθΔπ.B("ơƦƤƮƈſƕƂŲƣźųƴƘƉǂŹƀǂƶƢſƘǁƲƫƊƭƭƹƱƱ", (byte)93, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 78L;
      var1 ^= 3442233256120161569L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(29 + 40),
                     (byte)(37 + 46),
                     (byte)(30 + 17),
                     (byte)(44 + 23),
                     66,
                     (byte)(53 + 14),
                     (byte)(14 + 33),
                     (byte)(51 + 29),
                     (byte)(59 + 16),
                     (byte)(36 + 31),
                     (byte)(28 + 55),
                     (byte)(6 + 47),
                     (byte)(70 + 10),
                     (byte)(56 + 41),
                     (byte)(75 + 25),
                     (byte)(83 + 17),
                     (byte)(2 + 103),
                     (byte)(14 + 96),
                     (byte)(31 + 72)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣφδσΔζιΠρα.F("բկծԱձխըձռիԸնպճնռԾࣙࢬࣕࢹࢨࣙࣈ࣓࣠ࣝࣞࣞࣔࢰࣣ", (byte)67, 70));
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

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(a & b, d) + this.q() + c<"㺃">(e & f, g) + this.s() + c<"㺆">(h & i, j) + this.e() + c<"㺉">(k & l, m);
   }

   @Generated
   public Object e() {
      return this.f;
   }

   @Override
   public <T> T c() {
      return (T)this.f;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωΛσΦΔτβωυυτθθΓυ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.E("ՃեէՇի֊ւ֘քՓ֑և֕֏\u0558ս֖֖֟֞֜ի", (byte)95, 69), ωΛσΦΔτβωυυτθθΓυ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οΩνΩρωλΨηΛδωδ.B("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżԗӪԓӷӦԗԆԞԛԜԜԑԒӮԡƗ", (byte)95, 66) + var1 + χΠξΦιζΨΣωΦσΨζ.B("ŷ", (byte)95, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Generated
   public String q() {
      return this.bx;
   }

   @Generated
   public ωΛσΦΔτβωυυτθθΓυ(String var1, String var2, Object var3) {
      this.bx = var1;
      this.by = var2;
      this.f = var3;
   }
}
