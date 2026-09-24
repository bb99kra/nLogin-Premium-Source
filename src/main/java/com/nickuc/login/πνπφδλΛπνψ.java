package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class πνπφδλΛπνψ implements ξετφΔοΩψνε {
   private static int j = Integer.reverse(1073741824);
   private static long g = Long.reverse(-6998059780965949113L);
   private static int m = (512 >>> 169 | 512 << -169) & -1;
   private static int q = (201326592 >>> 58 | 201326592 << ~58 + 1) & -1;
   private static int n = Integer.reverse(0);
   private static String[] b = new String[q];
   private static long c;
   private static long e = Long.reverse(4323455642275676160L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   protected final String cm;
   private static long d = Long.reverse(-6998059780965949113L);
   private static int i = (2097152 >>> 149 | 2097152 << -149) & -1;
   private static long h = Long.reverse(4323455642275676160L);
   private static int p = Integer.reverse(-1073741824);
   private static long l = Long.reverse(4323455642275676160L);
   private static String[] a = new String[p];
   private static int o = 16777216 >>> 88 | 16777216 << ~88 + 1;
   private static int b = Integer.reverse(0);
   private static int a = (0 >>> 133 | 0 << -133) & -1;
   private static long k = Long.reverse(-6998059780965949113L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  πνπφδλΛπνψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πψυκΠΨμΛΩβΣφμφσ.D("ѹқҝѽҡӀҸӎҺ҉ӇҽӋӅҎҳӕӔӌӒӌҡ", (byte)52, 68), πνπφδλΛπνψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣδτΠνεγοΓορητ.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҸҶҺӁҰҸҙҿҽӉļ", (byte)52, 65) + var1 + οΩνΩρωλΨηΛδωδ.B("ġ", (byte)52, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean v(String var1) {
      return var1.contains(c<"㺀">(b, d ^ e));
   }

   @Override
   public boolean i(String var1, String var2) {
      return (boolean)a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= 3548888452062924607L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(63 + 6),
                     (byte)(64 + 19),
                     (byte)(46 + 1),
                     67,
                     (byte)(19 + 47),
                     (byte)(58 + 9),
                     (byte)(37 + 10),
                     (byte)(35 + 45),
                     (byte)(71 + 4),
                     (byte)(19 + 48),
                     (byte)(34 + 49),
                     (byte)(32 + 21),
                     (byte)(10 + 70),
                     (byte)(2 + 95),
                     (byte)(58 + 42),
                     (byte)(34 + 66),
                     (byte)(15 + 90),
                     (byte)(48 + 62),
                     (byte)(85 + 18)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(25 + 58)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μζξτΩσσφυδεπλΨ.A("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҨҦҪұҠҨ҉үҭҹ", (byte)44, 65));
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
   protected πνπφδλΛπνψ(String var1) {
      this.cm = var1;
   }

   private static void b() {
      c = -2124070118351206535L;
      long var0 = c ^ 3548888452062924607L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(38 + 30),
               69,
               (byte)(82 + 1),
               (byte)(42 + 5),
               (byte)(52 + 15),
               (byte)(24 + 42),
               (byte)(47 + 20),
               (byte)(15 + 32),
               (byte)(50 + 30),
               (byte)(44 + 31),
               (byte)(30 + 37),
               (byte)(12 + 71),
               (byte)(4 + 49),
               (byte)(12 + 68),
               (byte)(92 + 5),
               (byte)(37 + 63),
               (byte)(66 + 34),
               (byte)(91 + 14),
               (byte)(14 + 96),
               (byte)(26 + 77)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
               b[0] = ΨφιωσρΓδΔθ.C("ԲԓՈԬԼԬԶ՜ԪԺԛԩ", (byte)100, 67);
               b[1] = βθκςνθΩθυμςτκχ.A("ƸƫƢƎƑǄƯƂƲƩƢƏ", (byte)100, 65);
               b[2] = δΛψπξκσβγςα.C("ԒԙԹԼԗՔՓԓԪԹ՞ԩ", (byte)100, 67);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.F("է։և֝֕\u0557֜ն֛֙տը", (byte)100, 70);
               b[1] = μζξτΩσσφυδεπλΨ.B("ƞƓƜƳƙƤƃƞǁƗƞƏ", (byte)100, 66);
               b[2] = ιΠοθΩΦξκ.D("ԲԸԳԏԗԯՌ\u0530ԸԼԸԩ", (byte)100, 68);
               break;
            case 2:
               b[0] = ςπυηννναΣ.D("ՖՊՐ՝ԙԳԞԩ՜ՠՏՅՐՀՆԻգՂԦ՟ՈխԴԵ", (byte)100, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = μζξτΩσσφυδεπλΨ.B("ŽƫƲƭƴƴƂƷƇƣƦƼƙƨǎǐƎƌǌƦƑǓƚƛ", (byte)100, 66);
         }
      }
   }

   static {
      b();
   }

   @Override
   public String w(String var1) {
      try {
         MessageDigest var2 = MessageDigest.getInstance(this.cm);
         var2.reset();
         var2.update(var1.getBytes());
         byte[] var3 = var2.digest();
         String var10000 = c<"㺀">(f, g ^ h) + (var3.length << i) + c<"㺃">(j, k ^ l);
         Object[] var10001 = new Object[m];
         var10001[n] = new BigInteger(o, var3);
         return String.format(var10000, var10001);
      } catch (NoSuchAlgorithmException var4) {
         throw new RuntimeException(var4);
      }
   }
}
