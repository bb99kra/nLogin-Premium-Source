package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class ψΦςφχναψψ implements ΣΣπδβωΦδιςδςψΣς {
   private static int j = 262144 >>> 81 | 262144 << -81;
   private static int p = (1073741824 >>> 220 | 1073741824 << ~220 + 1) & -1;
   private static String[] b = new String[ψΦςφχναψψ.q];
   private static int o = Integer.reverse(0);
   private static int n = Integer.reverse(0);
   private static long b = Long.reverse(8745282070864782262L);
   private static int q = 4 >>> 96 | 4 << ~96 + 1;
   private static int a = 0 >>> 212 | 0 << -212;
   private static long h = Long.reverse(-5620492334958379008L);
   private static int r = Integer.reverse(-1073741824);
   private static long k = Long.reverse(8745282070864782262L);
   private static int e = Integer.reverse(-1);
   private static long s = Long.reverse(-3792739291734678602L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(-5620492334958379008L);
   private static long d = Long.reverse(-5620492334958379008L);
   private static int m = 134217728 >>> 155 | 134217728 << ~155 + 1;
   private static final String cv = c<"㺀">(r, s);
   private static long c;
   private static String[] a = new String[p];
   private final θιοτχπσΦΩ b;
   private static long g = Long.reverse(8745282070864782262L);
   private static int i = Integer.reverse(Integer.MIN_VALUE);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 77L;
      var1 ^= -1128357191963534984L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(30 + 38),
                     (byte)(33 + 36),
                     (byte)(59 + 24),
                     (byte)(34 + 13),
                     (byte)(25 + 42),
                     (byte)(23 + 43),
                     (byte)(18 + 49),
                     (byte)(7 + 40),
                     (byte)(28 + 52),
                     (byte)(23 + 52),
                     (byte)(12 + 55),
                     83,
                     53,
                     (byte)(78 + 2),
                     (byte)(96 + 1),
                     (byte)(49 + 51),
                     (byte)(70 + 30),
                     (byte)(21 + 84),
                     (byte)(89 + 21),
                     (byte)(87 + 16)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣδτΠνεγοΓορητ.B("âïî±ñíèñüë¸öúóöü¾јзєљћђчџѠ", (byte)0, 66));
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
   public boolean filter(String var1, String var2, Object... var3) {
      int var4 = var2.indexOf(c<"㺀">(a, b ^ d));
      if (var4 > e) {
         var4 += c<"㺃">(f, g ^ h).length();
         if (var2.length() - var4 > i) {
            String[] var5 = var2.substring(var4).split(c<"㺆">(j, k ^ l));
            if (var5.length > m) {
               String var6 = var5[n].toLowerCase(Locale.ENGLISH);
               return this.b.a().stream().anyMatch(var6::equals);
            }
         }
      }

      return (boolean)o;
   }

   @Generated
   private ψΦςφχναψψ(θιοτχπσΦΩ var1) {
      this.b = var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψΦςφχναψψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(λΣΩσμφγχ.F("ӦԈԊӪԎԭԥԻԧӶԴԪԸԲӻԠՂՁԹԿԹԎ", (byte)2, 70), ψΦςφχναψψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(χΠξΦιζΨΣωΦσΨζ.C("ОЫЪϭЭЩФЭиЧϴвжЯвиϺޔݳސޕޗގރޛޜЏ", (byte)2, 67) + var1 + μεςΩΔΣγν.E("Ӹ", (byte)2, 69) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = 7910359984303422110L;
      long var0 = c ^ -1128357191963534984L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(52 + 17),
               (byte)(67 + 16),
               47,
               (byte)(31 + 36),
               (byte)(61 + 5),
               (byte)(2 + 65),
               (byte)(37 + 10),
               (byte)(68 + 12),
               (byte)(9 + 66),
               (byte)(3 + 64),
               (byte)(79 + 4),
               (byte)(35 + 18),
               (byte)(29 + 51),
               97,
               (byte)(10 + 90),
               (byte)(63 + 37),
               (byte)(79 + 26),
               (byte)(58 + 52),
               (byte)(47 + 56)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
               b[0] = ςπυηννναΣ.F("ֱ֭֭֜ֆռ\u058bִ֎ְְֵլַֻ֕ռ֮֝֘֯ռְ֬֞֟׃ջ\u05caֽ֪֨", (byte)121, 70);
               b[1] = ΠΛΨοδΩσμνΛγΦφβς.E("ֱ֭֭֜ֆռ\u058bִ֎ְְֵլַֻ֕ռ֮֝֘֯ռְ֬֞֟׃ջ\u05caֽ֪֨", (byte)121, 69);
               b[2] = ΠΛΨοδΩσμνΛγΦφβς.A("ƶǔǉǀƿǙǫǩǋǠǐƹ", (byte)121, 65);
               b[3] = ΠΛΨοδΩσμνΛγΦφβς.C("֘և֜֘ձէն֟չ֛֛֠\u0557֢֦րէֈ֙փ֚է֛֗։֊֮զֵ֓֨֕", (byte)121, 67);
               break;
            case 1:
               b[0] = λΣΩσμφγχ.E("ֱ֭֭֜ֆռ\u058bִ֎ְְֵլַֻ֕ռָ֣֤֮֝֘֯ׄ֟\u05c9֖\u05c8֢\u05cbׅ֣֣֍אֱִֿׅ֑֯\u05ca֝", (byte)121, 69);
               b[1] = ζβησεθωυγτ.F("ֱ֭֭֜ֆռ\u058bִ֎ְְֵլַֻ֕ռ֮֝֘֯׃ջւָׁ֤֖׃փօ\u058c֫֝ֆ֎ְֳ֢֝֬֓ז֝", (byte)121, 70);
               b[2] = ξψθρΣΠΣς.F("ցծֳ֮֟֒֠իև֩ճս", (byte)121, 70);
               b[3] = ςΦζσμτΓσ.D("֘և֜֘ձէն֟չ֛֛֠\u0557֢֦րէֈ֙փ֚զխ֏֑֑֜֟֜ւճր֘֍օֲֳ֝֝֔\u058b֙֗ֈ", (byte)121, 68);
               break;
            case 2:
               b[0] = ςπυηννναΣ.B("ǘǀƺǦǂǈƮǊƾǮǥǔǮǥƵƵǻƳƳǐƼǵƿǝǞȄǱǄǿǅǣǇ", (byte)121, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.C("֒։֓֔\u0590՞լՖ\u058bՙ֍ը", (byte)121, 67);
         }
      }
   }
}
