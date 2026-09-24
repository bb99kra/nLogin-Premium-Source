package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class πφΨλτΣαοΛνΓΔΔυ extends ξΠτΣτγαψηρψΓΠτξ {
   private static int cc = (-1 >>> 57 | -1 << -57) & -1;
   private static int bu = Integer.reverse(1462763520);
   private static int bf = -1 >>> 27 | -1 << -27;
   private static long ci = Long.reverse(9209550432295673602L);
   private static int bi = 8388608 >>> 213 | 8388608 << -213;
   private static int cb = Integer.reverse(-536870912);
   private static long ct = Long.reverse(9209550432295673602L);
   private static int cy = 6144 >>> 73 | 6144 << -73;
   private static String[] e = new String[πφΨλτΣαοΛνΓΔΔυ.da];
   private static int cm = -1 >>> 10 | -1 << ~10 + 1;
   private static long q = Long.reverse(4611686018427387904L);
   private static int cg = Integer.reverse(-1);
   private static long bh = Long.reverse(9209550432295673602L);
   private static int cv = Integer.reverse(-805306368);
   private static long cn = Long.reverse(9209550432295673602L);
   private static long by = Long.reverse(4597864413868285698L);
   private static long cw = Long.reverse(9209550432295673602L);
   private static long at = Long.reverse(9209550432295673602L);
   private static int co = Integer.reverse(1342177280);
   private static long ca = Long.reverse(4611686018427387904L);
   private static int bw = Integer.reverse(1610612736);
   private static int bd = (50331648 >>> 120 | 50331648 << ~120 + 1) & -1;
   private static long o;
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int da = -805306368 >>> 252 | -805306368 << ~252 + 1;
   private static long cd = Long.reverse(9209550432295673602L);
   private static long p = Long.reverse(4597864413868285698L);
   private static long br = Long.reverse(4611686018427387904L);
   private static long cz = Long.reverse(9209550432295673602L);
   private static int e = 0 >>> 178 | 0 << ~178 + 1;
   private static long ab = Long.reverse(9209550432295673602L);
   private static int al = Integer.reverse(1073741824);
   private static int db = Integer.reverse(-1342177280);
   private static long bk = Long.reverse(4597864413868285698L);
   private static int cj = Integer.reverse(-1879048192);
   private static String[] f = new String[db];
   private static long bo = Long.reverse(4597864413868285698L);
   private static long bm = Long.reverse(4611686018427387904L);
   private static int bn = Integer.reverse(-1610612736);
   private static int ce = 268435456 >>> 121 | 268435456 << -121;
   private static int cr = (-1 >>> 86 | -1 << -86) & -1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= -5305873479334988795L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(45 + 24),
                     (byte)(60 + 23),
                     (byte)(14 + 33),
                     (byte)(57 + 10),
                     (byte)(7 + 59),
                     (byte)(44 + 23),
                     (byte)(13 + 34),
                     (byte)(73 + 7),
                     75,
                     (byte)(60 + 7),
                     (byte)(35 + 48),
                     53,
                     (byte)(28 + 52),
                     (byte)(32 + 65),
                     (byte)(82 + 18),
                     (byte)(25 + 75),
                     (byte)(80 + 25),
                     (byte)(57 + 53),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(43 + 40)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.F("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծऀइ࣪ࣾईࣨࣷआࣣआࣝࣟ࣠ऒ", (byte)115, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   public πφΨλτΣαοΛνΓΔΔυ(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.y, c<"㺀">(e, p ^ q), c<"㺃">(y, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(c<"㺀">(cv, cw));
      String var2 = ΩΓιΠωεαιυτωξΠ.u(var1.getString(c<"㺃">(cy, cz)));
      this.a(this.r, var2, null, null);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  πφΨλτΣαοΛνΓΔΔυ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.F("ՠւքդֈֵ֧֟֡հֲ֤֮֬յֳֳֹֻּ֚ֈ", (byte)124, 70), πφΨλτΣαοΛνΓΔΔυ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            λΣΩσμφγχ.C("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣺँࣤࣸं\u08e2ࣱऀࣝऀࣗࣙࣚऌւ", (byte)124, 67) + var1 + μεςΩΔΣγν.A("Ʊ", (byte)124, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      o = 4682301428124316668L;
      long var0 = o ^ -5305873479334988795L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(47 + 22),
               (byte)(79 + 4),
               (byte)(33 + 14),
               (byte)(9 + 58),
               (byte)(9 + 57),
               67,
               (byte)(2 + 45),
               (byte)(24 + 56),
               (byte)(20 + 55),
               (byte)(39 + 28),
               (byte)(32 + 51),
               (byte)(24 + 29),
               80,
               (byte)(43 + 54),
               (byte)(35 + 65),
               (byte)(17 + 83),
               (byte)(104 + 1),
               (byte)(62 + 48),
               (byte)(82 + 21)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
               f[0] = λΣΩσμφγχ.D("ԅԛӸԹӼԩԉӹԀԱԡԘԮԀԆՂԅԤԡԽԞԦԓԔ", (byte)89, 68);
               f[1] = ΣφδσΔζιΠρα.F("դդաՙ՛ռևՕւֈ֖՝", (byte)89, 70);
               f[2] = λΣΩσμφγχ.E("՜ՆՆբ\u0590ֈձ՟֎՟\u058cժժ\u058cզիՖ֏֕կժջըթ", (byte)89, 69);
               f[3] = βθκςνθΩθυμςτκχ.E("ա\u058cծ։ճօ՟ճ֖ո֎՝", (byte)89, 69);
               f[4] = πψυκΠΨμΛΩβΣφμφσ.B("ƉƚŬŹŬƫƌƝƅſƔŹ", (byte)89, 66);
               f[5] = πψυκΠΨμΛΩβΣφμφσ.A("ŸŢŢžƬƤƍŻƪŻƧƩůưƠŹŲƐżƥƲƇƄƅ", (byte)89, 65);
               f[6] = πχσδΦΦνθΔπ.F("՜ՆՆբ\u0590ֈձ՟֎՟֍խքշյսս\u058b֚\u0558ռ֑ըթ", (byte)89, 70);
               f[7] = χΠξΦιζΨΣωΦσΨζ.A("ŸŢŢžƬƤƍŻƪŻƨƋƱƸƩƒƌƲƓƉƋƫŸƝǁƢƵƏǀƜƞƗ", (byte)89, 65);
               f[8] = ΨΦνΨΦωυΩνβςμ.D("ԇӱӱԍԻԳԜԊԹԊԶԳԹӸԝԓԉԹԸԦԩՄԁԨԍԍԬՅԩԲԤ\u0530", (byte)89, 68);
               f[9] = χΠξΦιζΨΣωΦσΨζ.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՅԿԘՉԽԻԾԇԦԮԤ", (byte)89, 67);
               f[10] = ΠΛΨοδΩσμνΛγΦφβς.A("ƗšƛƈƘƌƭƲŽƮƩƳƬƨƄƆŹƛƭƸƾƇƄƅ", (byte)89, 65);
               f[11] = χφπρψπφΦθμπ.F("վռգձֈ֎֓ը֒\u0590Տ՝", (byte)89, 70);
               f[12] = φΨαξωυθανΣφυκη.E("փստՈՏի֔մվ֏յ\u058b\u0590զՔէկչ֚Փպիըթ", (byte)89, 69);
               break;
            case 1:
               f[0] = βθκςνθΩθυμςτκχ.D("ԅԛӸԹӼԩԉӹԀԱԟՁ\u0530ԄԆԂԝԪԶԻԸԖԓԔ", (byte)89, 68);
               f[1] = ζβησεθωυγτ.B("ƦƅŧƤżťŹƐƄƞƁŲƇƳŶƅƒƒƆƐƺƇƄƅ", (byte)89, 66);
               f[2] = ςΦζσμτΓσ.E("՜ՆՆբ\u0590ֈձ՟֎՟֊օհձ֑֛֙\u058c֏ա֛ց՚ա՜վ֖֘֟֨յզ", (byte)89, 69);
               f[3] = μεςΩΔΣγν.D("ӯԭԌԜӸԆԵԵԷԭӺӺԁ\u0530ԿԜՊԵԠԦԍՌԓԔ", (byte)89, 68);
               f[4] = ΣδτΠνεγοΓορητ.F("գդՏ։ֆ։֍ղ֓֗լ\u0557Քծը\u0558֊֔֊ւՠ֑ըթ", (byte)89, 70);
               f[5] = βεξΠθρρςΔΦμ.E("՜ՆՆբ\u0590ֈձ՟֎՟֊Ցկգ֑֒֊֓֔՞\u0558\u0590կվ՟֑տշբ՝֧֙", (byte)89, 69);
               f[6] = βεξΠθρρςΔΦμ.F("՜ՆՆբ\u0590ֈձ՟֎՟\u058cֈջ֊՚չ֑թ֢֓\u058c֔՝֏ճ֔ղ֜՜բֈի", (byte)89, 70);
               f[7] = μζξτΩσσφυδεπλΨ.D("ԇӱӱԍԻԳԜԊԹԊԷԚՀՇԸԡԛՁԢԘԚԬՂԿՃԋԓԯԯԍԏՉ", (byte)89, 68);
               f[8] = οΩνΩρωλΨηΛδωδ.F("՜ՆՆբ\u0590ֈձ՟֎՟\u058bֈ֎Սղը՞֎֍ջվ֓պ֓֠վ֩բր\u058cրք", (byte)89, 70);
               f[9] = ςπυηννναΣ.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՂՇԪԾՅՉԬՋԔՄՏ", (byte)89, 67);
               f[10] = ΨφιωσρΓδΔθ.A("ƗšƛƈƘƌƭƲŽƮƨƋƆƘŷƓƎƹƏƯŵƗƄƅ", (byte)89, 65);
               f[11] = δΛψπξκσβγςα.B("ŶƦƣƮƦƭžƥƦƪƈŹ", (byte)89, 66);
               f[12] = ντθΔζβΔζ.E("փստՈՏի֔մվ֏յբիթկիֆ՞\u0557ճց֡ըթ", (byte)89, 69);
               break;
            case 2:
               f[0] = ΦδφπθΩΩλζξ.F("իռձ՝ՒֆխայնւնՑժ֛\u0590ջ֠շ֝՚֡ըթ", (byte)89, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = ζβησεθωυγτ.D("ԊԤԉԻԮԺԙԉԾԍԬӿԱԁԟԜԄՂԅԷԺԸԬՈԧ\u0530ԮԩԿԞԲՕ", (byte)89, 68);
         }
      }
   }

   @Override
   protected void c(τφθχΔαΣγτφς var1) {
      boolean var2 = var1.a(c<"㺀">(al, at), c<"㺃">(bd & bf, bh)).equalsIgnoreCase(c<"㺆">(bi, bk ^ bm));
      if (var2) {
         int var3 = var1.a(c<"㺉">(bn, bo ^ br), bu);
         String var4 = var1.b(c<"㺌">(bw, by ^ ca));
         String var5 = var1.b(c<"㺏">(cb & cc, cd));
         String var6 = var1.b(c<"㺒">(ce & cg, ci));
         String var7 = var1.b(c<"㺕">(cj & cm, cn));
         this.d = ςιγρτΩλαγπβρ.b(this.m, ΔγΨνςχιδκτςες.a(var4, var3, var7, var5, var6, new Properties()));
      } else {
         File var8 = new File(this.b(), c<"㺘">(co & cr, ct));
         this.d = ΩαυΩξτκΛ.a(this.m, var8, new Properties());
      }
   }
}
