package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
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

public abstract class οχωηΛλςξΩνψ implements ΨψμΛροςζ, βΣΣΓνθΩλννΩγυδς {
   private static int f = Integer.reverse(0);
   private static int s = 0 >>> 119 | 0 << -119;
   private static int v = Integer.reverse(1073741824);
   private static long c;
   private static String[] b = new String[v];
   private static int b = Integer.reverse(0);
   private final πωιψγηξΓρφυ a;
   private static int t = (256 >>> 8 | 256 << -8) & -1;
   private static int m = Integer.reverse(-1610612736);
   private static int e = 0 >>> 66 | 0 << ~66 + 1;
   private static int g = (2097152 >>> 149 | 2097152 << -149) & -1;
   private static int u = 512 >>> 40 | 512 << ~40 + 1;
   private static int i = Integer.reverse(-1073741824);
   private static int l = Integer.reverse(1073741824);
   private static long d = Long.reverse(-269685297102639533L);
   private final ιιιττκγβγβτωπ b;
   private static int h = Integer.reverse(0);
   private static int r = 0 >>> 20 | 0 << ~20 + 1;
   private static int o = 64 >>> 198 | 64 << -198;
   private static int a = (0 >>> 198 | 0 << ~198 + 1) & -1;
   private static int c = Integer.reverse(0);
   private static int n = 0 >>> 147 | 0 << ~147 + 1;
   private static long q = Long.reverse(-269685297102639533L);
   private static String[] a = new String[u];
   private final ΩγΛξιχγτ ap;
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int p = -1 >>> 97 | -1 << ~97 + 1;

   @Override
   public boolean c(ΨγημιδξΓτοθαζ var1) {
      return (boolean)s;
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
      return this.ap;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  οχωηΛλςξΩνψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.C("ӨԊԌӬԐԯԧԽԩӸԶԬԺԴӽԢՄՃԻՁԻԐ", (byte)89, 67), οχωηΛλςξΩνψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣδτΠνεγοΓορητ.E("ոօքՇևփվև֒ցՎ\u058c\u0590։\u058c֒Քࣱ࣮ࣥ࣠ࣅࣦ࣮࣫ࣗ࣬ࣸի", (byte)89, 69) + var1 + ντθΔζβΔζ.D("Ӻ", (byte)89, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      στΩξξχκι var5 = var3.a();
      ομλφεαναβδ var6 = this.b.a(var1);
      String var7 = this.b.b(var5);
      EventEnum var10001 = EventEnum.TWO_FACTOR_REQUEST;
      Object[] var10002 = new Object[i];
      var10002[j] = TwoFactorType.convert(this.b);
      var10002[k] = var2;
      var10002[l] = var7;
      var1.a(var10001, var10002);
      var3.a(πβκνλοΛκΠδΦτφλ.A, ΣλνΨουΩΔοθεβ.E.r() * m);
      var6.a(var5, var2);
      String var8 = εδδΠηδξΛΣχ.a(this.a, var2).replace(c<"㺀">(o & p, q), var2.ac());
      var4.a(var8);
      return new αΠαβσΠτΦ[r];
   }

   private static String a(int var0, long var1) {
      var1 ^= 72L;
      var1 ^= -7468930573081363444L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     69,
                     (byte)(65 + 18),
                     (byte)(3 + 44),
                     (byte)(31 + 36),
                     (byte)(20 + 46),
                     67,
                     (byte)(12 + 35),
                     (byte)(58 + 22),
                     (byte)(60 + 15),
                     (byte)(11 + 56),
                     (byte)(75 + 8),
                     (byte)(41 + 12),
                     (byte)(48 + 32),
                     (byte)(6 + 91),
                     (byte)(96 + 4),
                     (byte)(33 + 67),
                     (byte)(101 + 4),
                     (byte)(91 + 19),
                     (byte)(20 + 83)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(οοθδΨιοΦΠβδζ.E("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢴࢽࣀࢯ\u0894ࢵࢽࢺࢦࢻࣇ", (byte)40, 69));
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
   public boolean at() {
      return (boolean)t;
   }

   static {
      b();
   }

   @Generated
   οχωηΛλςξΩνψ(ΩγΛξιχγτ var1, ιιιττκγβγβτωπ var2, πωιψγηξΓρφυ var3) {
      this.ap = var1;
      this.b = var2;
      this.a = var3;
   }

   private static void b() {
      c = -3858264859413609865L;
      long var0 = c ^ -7468930573081363444L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(47 + 22),
               (byte)(50 + 33),
               (byte)(24 + 23),
               (byte)(40 + 27),
               (byte)(8 + 58),
               67,
               (byte)(19 + 28),
               (byte)(55 + 25),
               (byte)(58 + 17),
               (byte)(34 + 33),
               (byte)(29 + 54),
               (byte)(15 + 38),
               (byte)(16 + 64),
               (byte)(91 + 6),
               (byte)(14 + 86),
               (byte)(94 + 6),
               (byte)(104 + 1),
               (byte)(27 + 83),
               (byte)(51 + 52)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
               b[0] = χφπρψπφΦθμπ.A("ºéü¾ÿéÁÂºÎ¸ýüâĀÿûÕàáùÿÖ×", (byte)2, 65);
               b[1] = ντθΔζβΔζ.F("ԊԍԵԑԑ\u0530ԑӻԱԾԸԮԚԖԛԟԻ\u0530ԼԉՌՊԑԒ", (byte)2, 70);
               break;
            case 1:
               b[0] = ζβησεθωυγτ.E("ӵԤԷӹԺԤӼӽӵԉӳԒԼԙԹԹՅԔԻՋԴԔԢԯԍԜԨԊԾԆԽՈ", (byte)2, 69);
               b[1] = ζβησεθωυγτ.C("ЇЊвЎЎЭЎϸЮлеКШЁУϹсвЯмсзЎЏ", (byte)2, 67);
               break;
            case 2:
               b[0] = βθκςνθΩθυμςτκχ.E("ԢԸӶԚԖԋԧӷԾԞӸԆ", (byte)2, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = μεςΩΔΣγν.E("ԯԘԒԄԻԨԩԮԕԊԊԋԙԵԤӸԄԹԪՋՃԔԑԒ", (byte)2, 69);
         }
      }
   }

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      if (!this.b.d(var1)) {
         return (boolean)a;
      } else {
         ομλφεαναβδ var4 = this.b.a(var1);
         if (!var4.aF()) {
            return (boolean)b;
         } else {
            στΩξξχκι var5 = var3.a();
            if (!var2.i(c<"㺀">(c, d) + this.b.getName())) {
               String var6 = var5.k();
               if (var6 == null || var6.equals(var2.ac())) {
                  return (boolean)e;
               }
            }

            if (Boolean.TRUE.equals(var3.a(πβκνλοΛκΠδΦτφλ.D))) {
               return (boolean)f;
            } else {
               String var7 = this.b.b(var5);
               return (boolean)(var7 != null && this.b.e(var5) ? g : h);
            }
         }
      }
   }

   @Generated
   public ιιιττκγβγβτωπ a() {
      return this.b;
   }
}
