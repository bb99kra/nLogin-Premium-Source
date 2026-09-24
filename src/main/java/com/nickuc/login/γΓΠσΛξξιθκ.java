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

public class γΓΠσΛξξιθκ extends ζωΠοκνμψφΓυοβδπ {
   private static long ap = Long.reverse(5385987348604284138L);
   private static int af = Integer.reverse(-1);
   private static long p = Long.reverse(-6629298651489370112L);
   private static long e;
   private static String[] d = new String[γΓΠσΛξξιθκ.as];
   private static int q = (0 >>> 91 | 0 << ~91 + 1) & -1;
   private static long al = Long.reverse(-1243311302885085974L);
   private static int y = 0 >>> 249 | 0 << ~249 + 1;
   private static int ak = -1 >>> 194 | -1 << ~194 + 1;
   private static int ao = (10240 >>> 171 | 10240 << -171) & -1;
   private static int m = Integer.reverse(1073741824);
   private static long l = Long.reverse(-1243311302885085974L);
   private static int ar = 6291456 >>> 84 | 6291456 << ~84 + 1;
   private static long i = Long.reverse(-6629298651489370112L);
   private static int b = Integer.reverse(0);
   private static int ac = Integer.reverse(-1073741824);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = Integer.reverse(536870912);
   private static String[] c = new String[ar];
   private static long aq = Long.reverse(-6629298651489370112L);
   private static long g = Long.reverse(5385987348604284138L);
   private static long o = Long.reverse(5385987348604284138L);
   private static long ag = Long.reverse(-1243311302885085974L);
   private static int as = Integer.reverse(1610612736);

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= 6751322327978763650L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     69,
                     83,
                     (byte)(29 + 18),
                     (byte)(17 + 50),
                     (byte)(50 + 16),
                     (byte)(4 + 63),
                     (byte)(21 + 26),
                     (byte)(2 + 78),
                     (byte)(51 + 24),
                     (byte)(23 + 44),
                     (byte)(7 + 76),
                     (byte)(9 + 44),
                     (byte)(41 + 39),
                     (byte)(95 + 2),
                     (byte)(7 + 93),
                     (byte)(97 + 3),
                     (byte)(89 + 16),
                     (byte)(62 + 48),
                     (byte)(55 + 48)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(40 + 29), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣφδσΔζιΠρα.A("ŎśŚĝŝřŔŝŨŗĤŢŦşŢŨĪүҐҞӂқҿӀҼҼҿ", (byte)54, 65));
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

   @Override
   public void b(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      εδδΠηδξΛΣχ.a(var2, ευτβπαψω.t, var1x -> {
         if (var1x.contains(c<"㺀">(ac & af, ag))) {
            var4.d(var1x, c<"㺃">(ah & ak, al), c<"㺆">(ao, ap ^ aq));
         } else {
            var4.a(var1x);
         }
      });
   }

   public γΓΠσΛξξιθκ(ΩγΛξιχγτ var1) {
      super(var1, c<"㺀">(b, g ^ i));
   }

   static {
      b();
   }

   private static void b() {
      e = 6284336123988376914L;
      long var0 = e ^ 6751322327978763650L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(40 + 29),
               (byte)(65 + 18),
               (byte)(24 + 23),
               (byte)(14 + 53),
               (byte)(46 + 20),
               (byte)(11 + 56),
               (byte)(39 + 8),
               (byte)(47 + 33),
               (byte)(26 + 49),
               (byte)(66 + 1),
               (byte)(71 + 12),
               (byte)(50 + 3),
               (byte)(22 + 58),
               97,
               (byte)(89 + 11),
               (byte)(48 + 52),
               105,
               (byte)(62 + 48),
               (byte)(37 + 66)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = μζξτΩσσφυδεπλΨ.C("еЅЈйПиЗзЮкЃйИекнъмУоЇЧДЕ", (byte)4, 67);
               d[1] = φδχεθοκψαλΛογλ.A("ÍÀÿØ¼ïÏåþûÉāĂĂäÏÞăñĐóÝÚÛ", (byte)4, 65);
               d[2] = ΨφιωσρΓδΔθ.B("ûËÎÿåþÝýôĀÉÿÞûĀăĐĂéĄÍíÚÛ", (byte)4, 66);
               d[3] = χφπρψπφΦθμπ.A("òÿýðùĂÙÄçĀâÏ", (byte)4, 65);
               d[4] = ςΦζσμτΓσ.D("ЃЪвЎЈивϾЌЌϾЮлрЩЀлЙэьэНѐюшХГЋФЪТъХкИмѕШиеНРхќђћСШљчѥЪжзде", (byte)4, 68);
               d[5] = πψυκΠΨμΛΩβΣφμφσ.A("éîàâüÂåĀÑ÷ÀâÙùöíäāáýíëë×ėĔëëćÔÛĘîđßûõĎõğěğĨĉåêħīăĄħđĀĳúû", (byte)4, 65);
               break;
            case 1:
               d[0] = ςΦζσμτΓσ.F("ԴԄԇԸԞԷԖԶԭԹԂԂ\u0530ԣԠԀԚՉԼԪԄՌԓԔ", (byte)4, 70);
               d[1] = πηγμΣΔκκ.C("ЇϺйВ϶ЩЉПиеЃбБЖнуПЄзЄШЗДЕ", (byte)4, 67);
               d[2] = ντθΔζβΔζ.C("еЅЈйПиЗзЮкЄϿлтЀбЂЦхрснДЕ", (byte)4, 67);
               d[3] = ΦδφπθΩΩλζξ.C("ШЇаИЇдМрУгпдЅТЅДЊЈИУЦэДЕ", (byte)4, 67);
               d[4] = ζοηκορΦνΣθγΩ.D("ЃЪвЎЈивϾЌЌϾЮлрЩЀлЙэьэНѐюшХГЋФЪТъХкИмѕШиеНРэЗѠмйрУтОыѝЧхѫьцѥпаёѷд", (byte)4, 68);
               d[5] = ΣδτΠνεγοΓορητ.E("ԢԧԙԛԵӻԞԹԊ\u0530ӹԛԒԲԯԦԝԺԚԶԦԤԤԐՐՍԤԤՀԍԔՑԧՊԘԴԮՇԮ\u0558Ք\u0558դԞզՑԝգե՝ԶԿԺ՜ԳԴ", (byte)4, 69);
               break;
            case 2:
               d[0] = χφπρψπφΦθμπ.B("ÎÑûãìàüÞ×ÓÓøèĊÜØËĄñĆüÝÚÛ", (byte)4, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = ΨφιωσρΓδΔθ.F("ԎԫԪԽԫӹՀԩԱԔԴԚԗՀԘԽԹԡԘՂԣԖԓԔ", (byte)4, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  γΓΠσΛξξιθκ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣφδσΔζιΠρα.A("ŧƉƋūƏƮƦƼƨŷƵƫƹƳżơǃǂƺǀƺƏ", (byte)96, 65), γΓΠσΛξξιθκ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μζξτΩσσφυδεπλΨ.F("տ\u058c\u058bՎ֎֊օ֎֙ֈՕ֓֗\u0590֓֙՛࣠ࣁࣰࣰࣱ࣏࣭࣭ࣳ࣌ձ", (byte)96, 70) + var1 + ΨφιωσρΓδΔθ.B("Ź", (byte)96, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      String var4 = var1.b().a() == κιββωσγχςΣβΠΣδ.d ? c<"㺀">(j, l) : c<"㺃">(m, o ^ p);
      return (boolean)(var1.b().j(var4) ? q : var1.a().p());
   }
}
