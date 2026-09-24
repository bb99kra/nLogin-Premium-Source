package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.lib.bcrypt.BCrypt.Hasher;
import com.nickuc.login.lib.bcrypt.BCrypt.Result;
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

public class ρφτηκξεηωεδξψρψ implements ξετφΔοΩψνε {
   private static int g = Integer.reverse(0);
   private final Hasher a;
   private static String[] a = new String[ρφτηκξεηωεδξψρψ.q];
   private static int a = 245760 >>> 108 | 245760 << ~108 + 1;
   private static int r = Integer.reverse(-1073741824);
   private static long j = Long.reverse(5499164058363125042L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static String[] b = new String[r];
   private static int c = (-1 >>> 254 | -1 << -254) & -1;
   private static int p = 0 >>> 39 | 0 << ~39 + 1;
   private static long c;
   private static int e = (32 >>> 165 | 32 << ~165 + 1) & -1;
   private static int n = Integer.reverse(0);
   private static long d = Long.reverse(5499164058363125042L);
   private static int i = Integer.reverse(-1);
   private static int q = Integer.reverse(-1073741824);
   private static long l = Long.reverse(8669698196031954226L);
   private static int h = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1) & -1;
   private static long m = Long.reverse(3746994889972252672L);
   private static int b = Integer.reverse(0);
   private static int f = (0 >>> 238 | 0 << ~238 + 1) & -1;
   private static int k = (Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << -62) & -1;

   @Override
   public boolean v(String var1) {
      return (boolean)(!w(var1) ? o : p);
   }

   private static String a(int var0, long var1) {
      var1 ^= 44L;
      var1 ^= 1151386622389837448L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(54 + 15),
                     (byte)(23 + 60),
                     (byte)(22 + 25),
                     67,
                     (byte)(2 + 64),
                     (byte)(54 + 13),
                     (byte)(6 + 41),
                     (byte)(23 + 57),
                     (byte)(11 + 64),
                     (byte)(9 + 58),
                     (byte)(82 + 1),
                     (byte)(10 + 43),
                     (byte)(26 + 54),
                     (byte)(49 + 48),
                     (byte)(25 + 75),
                     100,
                     (byte)(66 + 39),
                     (byte)(22 + 88),
                     (byte)(100 + 3)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣφδσΔζιΠρα.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҿӅӄҸҼӁҹҼӏҼҼӇӒӌӔ", (byte)55, 66));
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

   private static void b() {
      c = 5528777821443263006L;
      long var0 = c ^ 1151386622389837448L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(59 + 9),
               (byte)(17 + 52),
               (byte)(3 + 80),
               (byte)(38 + 9),
               (byte)(51 + 16),
               (byte)(64 + 2),
               (byte)(41 + 26),
               (byte)(2 + 45),
               (byte)(26 + 54),
               (byte)(33 + 42),
               (byte)(15 + 52),
               (byte)(64 + 19),
               (byte)(47 + 6),
               80,
               (byte)(5 + 92),
               100,
               (byte)(86 + 14),
               (byte)(59 + 46),
               (byte)(60 + 50),
               (byte)(86 + 17)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ΣερμΔσατσκ.F("թն֑ի֏կն֥֞հ֑լ", (byte)104, 70);
               b[1] = πηγμΣΔκκ.E("խչձՙ՜վ՞տցշկլ", (byte)104, 69);
               b[2] = ντθΔζβΔζ.B("ƘƤƜƄƇƩƉƪƬƢƚƗ", (byte)104, 66);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.A("ƈƺƖƁǆƌƀƘǈǆǄƗ", (byte)104, 65);
               b[1] = λΣΩσμφγχ.E("֕֏֙մ֑֔լռղ֢֙լ", (byte)104, 69);
               b[2] = ςΦζσμτΓσ.A("ƈƀǈƝǋƵǇƞƜƽǄƗ", (byte)104, 65);
               break;
            case 2:
               b[0] = μζξτΩσσφυδεπλΨ.D("ՐԵ՜ԴՄՕՂԷկԼԬԹԮՆՂԳՍՇճզՑչՀՁ", (byte)104, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.B("ǁƛƝǈƭƅƥƞǉƪƢƍƆƎǉƵƸƳƳǛƵǏǋǌƙǞǞǤƿƟƺǈ", (byte)104, 66);
         }
      }
   }

   static {
      b();
   }

   @Generated
   protected ρφτηκξεηωεδξψρψ(Hasher var1) {
      this.a = var1;
   }

   @Override
   public String w(String var1) {
      return this.a.hashToString(ΣλνΨουΩΔοθεβ.ac.r(), var1.toCharArray());
   }

   @Override
   public boolean i(String var1, String var2) {
      if (!w(var2)) {
         return (boolean)g;
      } else {
         String var3 = var2.contains(c<"㺀">(h & i, j)) ? var2.split(c<"㺃">(k, l ^ m))[n] : var2;
         Result var4 = BCrypt.verifyer().verify(var1.getBytes(StandardCharsets.UTF_8), var3.getBytes(StandardCharsets.UTF_8));
         return var4.verified;
      }
   }

   private static boolean w(String var0) {
      return (boolean)(var0.length() == a && var0.startsWith(c<"㺀">(b & c, d)) ? e : f);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ρφτηκξεηωεδξψρψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.C("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 67), ρφτηκξεηωεδξψρψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ζβησεθωυγτ.B("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԓԙԘԌԐԕԍԐԣԐԐԛԦԠԨƛ", (byte)97, 66) + var1 + πψυκΠΨμΛΩβΣφμφσ.D("Ԓ", (byte)97, 68) + var2.toString(), var4
         );
      }
   }
}
