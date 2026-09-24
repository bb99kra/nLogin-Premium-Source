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

public enum θκρδβκΓηζβδΛ {
   a,
   b,
   c,
   d;

   private static String[] a = new String[θκρδβκΓηζβδΛ.f];
   private static String[] b = new String[θκρδβκΓηζβδΛ.g];
   private static long c;
   private static int a = 64 >>> 132 | 64 << -132;
   private static int b = 0 >>> 14 | 0 << ~14 + 1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 4194304 >>> 53 | 4194304 << -53;
   private static int e = Integer.reverse(-1073741824);
   private static int f = (1073741824 >>> 124 | 1073741824 << -124) & -1;
   private static int g = Integer.reverse(536870912);
   private static int h = 0 >>> 129 | 0 << ~129 + 1;
   private static int i = Integer.reverse(-1);
   private static long j = Long.reverse(7653931637321130392L);
   private static int k = 0 >>> 56 | 0 << -56;
   private static int l = (32 >>> 69 | 32 << -69) & -1;
   private static long m = Long.reverse(7653931637321130392L);
   private static int n = 8388608 >>> 215 | 8388608 << ~215 + 1;
   private static int o = Integer.reverse(1073741824);
   private static long p = Long.reverse(7653931637321130392L);
   private static int q = Integer.reverse(1073741824);
   private static int r = Integer.reverse(-1073741824);
   private static long s = Long.reverse(-4884089725278330472L);
   private static long t = Long.reverse(-3026418949592973312L);
   private static int u = (402653184 >>> 123 | 402653184 << -123) & -1;

   private static void b() {
      c = 1839269208355773501L;
      long var0 = c ^ -5207084886369698597L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(4 + 64),
               (byte)(3 + 66),
               (byte)(7 + 76),
               (byte)(22 + 25),
               (byte)(14 + 53),
               66,
               (byte)(3 + 64),
               (byte)(15 + 32),
               (byte)(30 + 50),
               (byte)(40 + 35),
               (byte)(28 + 39),
               (byte)(18 + 65),
               (byte)(5 + 48),
               (byte)(47 + 33),
               (byte)(31 + 66),
               (byte)(73 + 27),
               (byte)(53 + 47),
               (byte)(74 + 31),
               110,
               (byte)(58 + 45)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(65 + 18)}, StandardCharsets.UTF_8));
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
               b[0] = φΨαξωυθανΣφυκη.A("ÞĔćĀèçÕêäĄĚá", (byte)13, 65);
               b[1] = μζξτΩσσφυδεπλΨ.D("ѐяЭыУбеаёѐЩЛјїНхлѡѥічвЯа", (byte)13, 68);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.F("ӽՀԗԃԁԞԡӿՆՂԺԑ", (byte)13, 70);
               b[3] = οοθδΨιοΦΠβδζ.C("ФтАхеггббмщФ", (byte)13, 67);
               break;
            case 1:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.D("ЎѓЧъдљшМѝдѠшїѕмёѦЯклТтЯа", (byte)13, 68);
               b[1] = ζβησεθωυγτ.C("ѐяЭыУбеаёѐЩђљіњѓлНЦѧлѨЯа", (byte)13, 67);
               b[2] = ΣφδσΔζιΠρα.F("ԸԮԼԵԟԜԙӿԪԃԌԠԣԗԧԱԯԩԑԿԬԟԜԝ", (byte)13, 70);
               b[3] = ΦδφπθΩΩλζξ.D("жіЍїзЙафхозЭюяпКихихѕѨЯа", (byte)13, 68);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.C("іечРгхиЭкћЫшѕѠдѤМњОёѤтЯа", (byte)13, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = πηγμΣΔκκ.D("ааєаЪбЗьђмКМѢвѤЛѢџѡѥїѨЯа", (byte)13, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  θκρδβκΓηζβδΛ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣφδσΔζιΠρα.D("яѱѳѓѷҖҎҤҐџҝғҡқѤ҉ҫҪҢҨҢѷ", (byte)38, 68), θκρδβκΓηζβδΛ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οοθδΨιοΦΠβδζ.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߰߳\u07fb߯߮߷ߑ߶߶߳߶ߞѾ", (byte)38, 68) + var1 + φδχεθοκψαλΛογλ.B("ą", (byte)38, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 107L;
      var1 ^= -5207084886369698597L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(34 + 34),
                     (byte)(34 + 35),
                     (byte)(27 + 56),
                     (byte)(10 + 37),
                     (byte)(34 + 33),
                     (byte)(17 + 49),
                     (byte)(9 + 58),
                     (byte)(9 + 38),
                     (byte)(4 + 76),
                     (byte)(69 + 6),
                     67,
                     (byte)(46 + 37),
                     (byte)(48 + 5),
                     (byte)(31 + 49),
                     (byte)(90 + 7),
                     100,
                     (byte)(75 + 25),
                     (byte)(46 + 59),
                     (byte)(11 + 99),
                     (byte)(61 + 42)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.D("ս֊։Ռ\u058cֈփ\u058c֗ֆՓ֑֕֎֑֗ՙࣣࣦ࣮\u08e2࣡࣪ࣄࣩࣩࣦࣩ࣑", (byte)119, 68));
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
