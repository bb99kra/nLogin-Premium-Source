package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.PreLoginEvent;

public class ζβκψγαωηκΠΠ extends ΩδψψλοτωΨΣπμζΩΠ {
   private static int br = Integer.reverse(-1);
   private static long bg = Long.reverse(-5946861006846608734L);
   private static long i = Long.reverse(-5946861006846608734L);
   private static int ai = (2359296 >>> 146 | 2359296 << -146) & -1;
   private static int bf = Integer.reverse(-268435456);
   private static int q = 0 >>> 222 | 0 << -222;
   private static long au = Long.reverse(4573547722690869922L);
   private static long ck = Long.reverse(-5946861006846608734L);
   private static int cf = Integer.reverse(-402653184);
   private static long bo = Long.reverse(-5946861006846608734L);
   private static int bh = ('耀' >>> 11 | 32768 << ~11 + 1) & -1;
   private static int v = Integer.reverse(-1610612736);
   private static int bn = Integer.reverse(-1);
   private static long cg = Long.reverse(4573547722690869922L);
   private static int be = Integer.reverse(0);
   private static long av = Long.reverse(-7926335344172072960L);
   private static long af = Long.reverse(4573547722690869922L);
   private static int bp = Integer.reverse(0);
   private static long bz = Long.reverse(4573547722690869922L);
   private static int at = Integer.reverse(805306368);
   private static String[] d = new String[ζβκψγαωηκΠΠ.cu];
   private static long bs = Long.reverse(-5946861006846608734L);
   private static int al = Integer.reverse(0);
   private static int aw = (13312 >>> 202 | 13312 << ~202 + 1) & -1;
   private static long ac = Long.reverse(-7926335344172072960L);
   private static long bj = Long.reverse(-7926335344172072960L);
   private static int bk = Integer.reverse(-2013265920);
   private static int ah = Integer.reverse(0);
   private static int cb = Integer.reverse(0);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int cj = (-1 >>> 36 | -1 << ~36 + 1) & -1;
   private static int u = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static long ce = Long.reverse(-7926335344172072960L);
   private static long bb = Long.reverse(-7926335344172072960L);
   private static long ba = Long.reverse(4573547722690869922L);
   private static long cd = Long.reverse(4573547722690869922L);
   private final ωΛοχγφλπευςος a;
   private static String[] c = new String[ζβκψγαωηκΠΠ.ct];
   private static int ar = 88 >>> 195 | 88 << ~195 + 1;
   private static int l = Integer.reverse(1073741824);
   private static int bc = Integer.reverse(0);
   private static int bv = (83886080 >>> 22 | 83886080 << ~22 + 1) & -1;
   private static int cu = 218103808 >>> 151 | 218103808 << ~151 + 1;
   private static int bd = Integer.reverse(Integer.MIN_VALUE);
   private static long ay = Long.reverse(-7926335344172072960L);
   private static long aq = Long.reverse(-5946861006846608734L);
   private final nLoginBungee a;
   private static long cm = Long.reverse(4573547722690869922L);
   private static long bw = Long.reverse(4573547722690869922L);
   private static int ak = (0 >>> 236 | 0 << ~236 + 1) & -1;
   private static int bt = Integer.reverse(Integer.MIN_VALUE);
   private static long p = Long.reverse(-7926335344172072960L);
   private static long t = Long.reverse(-7926335344172072960L);
   private static int cq = (256 >>> 200 | 256 << ~200 + 1) & -1;
   private static int ap = Integer.reverse(-1);
   private static int cs = Integer.reverse(0);
   private static int an = Integer.reverse(0);
   private static int ao = 10 >>> 192 | 10 << ~192 + 1;
   private static long bi = Long.reverse(4573547722690869922L);
   private static long as = Long.reverse(-5946861006846608734L);
   private static long ag = Long.reverse(-7926335344172072960L);
   private static int cl = Integer.reverse(-1744830464);
   private static long y = Long.reverse(4573547722690869922L);
   private static long bl = Long.reverse(-5946861006846608734L);
   private static long cn = Long.reverse(-7926335344172072960L);
   private static int bm = (4608 >>> 232 | 4608 << -232) & -1;
   private static long e;
   private static long ab = Long.reverse(4573547722690869922L);
   private static long g = Long.reverse(-5946861006846608734L);
   private static long bx = Long.reverse(-7926335344172072960L);
   private static int by = Integer.reverse(-1476395008);
   private static int x = 1536 >>> 200 | 1536 << -200;
   private static long s = Long.reverse(4573547722690869922L);
   private static long ax = Long.reverse(4573547722690869922L);
   private static int az = Integer.reverse(1879048192);
   private static long aj = Long.reverse(-5946861006846608734L);
   private static long ch = Long.reverse(-7926335344172072960L);
   private static long w = Long.reverse(-5946861006846608734L);
   private static int n = Integer.reverse(-1073741824);
   private static int cp = (16 >>> 100 | 16 << -100) & -1;
   private static int ct = 6815744 >>> 178 | 6815744 << ~178 + 1;
   private static long z = Long.reverse(-7926335344172072960L);
   private static long o = Long.reverse(4573547722690869922L);
   private static int aa = (1835008 >>> 178 | 1835008 << -178) & -1;
   private static int bu = Integer.reverse(1073741824);
   private static int am = Integer.reverse(0);
   private static int ae = (2097152 >>> 242 | 2097152 << -242) & -1;
   private static int bq = Integer.reverse(-939524096);
   private static long m = Long.reverse(-5946861006846608734L);
   private static int c = 0 >>> 59 | 0 << ~59 + 1;
   private static int co = Integer.reverse(0);
   private static int cr = Integer.reverse(0);
   private static int ci = 3145728 >>> 241 | 3145728 << -241;
   private static int r = 33554432 >>> 119 | 33554432 << ~119 + 1;
   private static int ad = (0 >>> 179 | 0 << ~179 + 1) & -1;
   private static long ca = Long.reverse(-7926335344172072960L);
   private static int cc = (90112 >>> 12 | 90112 << -12) & -1;

   static {
      d();
   }

   @Override
   public void b() {
      super.b();
      if (κδΔΦφγμδξΨωψο.n.ar() && BungeeCord.getInstance().getConfig().isPreventProxyConnections()) {
         String var1 = ProxyServer.getInstance().getName();
         String var2 = e<"㺀">(c, g);
         if (εδδΠηδξΛΣχ.j()) {
            ψΓωτιμωκχψΛΨ.c(e<"㺃">(h, i) + var2 + e<"㺆">(l, m) + var1 + e<"㺉">(n, o ^ p));
            ψΓωτιμωκχψΛΨ.c(e<"㺌">(r, s ^ t));
         } else {
            ψΓωτιμωκχψΛΨ.c(e<"㺏">(v, w) + var2 + e<"㺒">(x, y ^ z) + var1 + e<"㺕">(aa, ab ^ ac));
            ψΓωτιμωκχψΛΨ.c(e<"㺘">(ae, af ^ ag));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 73L;
      var1 ^= -2913206692698676650L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(68 + 1),
                     (byte)(29 + 54),
                     47,
                     (byte)(39 + 28),
                     (byte)(31 + 35),
                     (byte)(38 + 29),
                     (byte)(22 + 25),
                     (byte)(28 + 52),
                     (byte)(33 + 42),
                     (byte)(52 + 15),
                     (byte)(69 + 14),
                     (byte)(19 + 34),
                     (byte)(27 + 53),
                     (byte)(9 + 88),
                     (byte)(55 + 45),
                     (byte)(70 + 30),
                     (byte)(66 + 39),
                     (byte)(30 + 80),
                     (byte)(28 + 75)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(26 + 57)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ςΦζσμτΓσ.A("ǌǙǘƛǛǗǒǛǦǕƢǠǤǝǠǦƨ\u0530ԭԶՅԱ\u0530ՉԸԼԣԤ", (byte)117, 65));
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
   public nLoginAPI a() {
      return new αΨμχΛΩΠωιν(this.a.a());
   }

   public ζβκψγαωηκΠΠ(nLoginBungee var1) {
      super(var1);
      this.a = var1;
      this.a = new ωΛοχγφλπευςος(var1);
   }

   public ΩθΔφχδρκσλΓ a() {
      return new ΩθΔφχδρκσλΓ(this.a.a());
   }

   @Override
   public ΛΠπδσηδωαΠαΓκρ a() {
      return new δΩχωθμγβοτξγ(this.a, this.a);
   }

   @Override
   public void f() {
      this.a.a().c(e<"㺀">(ao & ap, aq));
   }

   private static void d() {
      e = 4998030697122832124L;
      long var0 = e ^ -2913206692698676650L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(64 + 4),
               (byte)(4 + 65),
               83,
               (byte)(36 + 11),
               (byte)(48 + 19),
               (byte)(62 + 4),
               (byte)(17 + 50),
               (byte)(25 + 22),
               (byte)(52 + 28),
               (byte)(52 + 23),
               (byte)(5 + 62),
               83,
               (byte)(52 + 1),
               (byte)(73 + 7),
               (byte)(18 + 79),
               (byte)(73 + 27),
               (byte)(87 + 13),
               (byte)(93 + 12),
               (byte)(59 + 51),
               (byte)(86 + 17)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), 83}, StandardCharsets.UTF_8));
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
               d[0] = χφπρψπφΦθμπ.C("ՀԱӹԸՊԤԋԞԿԽՄՊՁՆԱՊԱԦԑՅՃԩԺՎՅԭՈԱՔ՚ՔԮԡԵՄԚՙեՊըԵԿԻԴ", (byte)93, 67);
               d[1] = ΦδφπθΩΩλζξ.E("Ոաօտ֎֓Ւ֒ձ֔\u058b՚֝֔֞ր֕ք՝ւ֥֘լխ", (byte)93, 69);
               d[2] = ΠΛΨοδΩσμνΛγΦφβς.B("ƞƈƋžŬŴƵƵƧƗƛƐƩƫƾŷƱƤƜƳưƤǅǅƔǃƅƌƛƷǑƥƍƠƥƞƶǒƮƓƮǙǚơ", (byte)93, 66);
               d[3] = ΨφιωσρΓδΔθ.C("ՁԾԲԳԀԸՂԆԇԯԛԔ", (byte)93, 67);
               d[4] = ΣερμΔσατσκ.D(
                  "ԙԙԥԐԵԥՄԴԡԢԘԯԡԪԪԤԽՂԶՊԬՅՃԓԵԽՋԼԷՎՙՌՁԟԵՉՒՇբԨԼՈՉՉ՜ԲՄՊԳյհԵԲԴՖՔԵէՒս՜Ցմփտե՜ռՓՠռօԿևՋՆ֏Վ֏Ցը՟շֆ֓Քՙ֘նձ՛խւպց֗֔ձՠ։ա֧֚֡֙ջպ֘սև֏֦֏֞տշ֧ն\u058cֱֳֳֻֻֽ֦֑֜ջֆվ׀֥֕֠֘֞֞\u05ccׁׂ֧֟֟֔\u05c8ֲׇ֑֡׃֚֕׆֫נד\u05cfנן",
                  (byte)93,
                  68
               );
               d[5] = ςπυηννναΣ.E("աւզՍՎՉՎյ֔֎\u0558֝պև\u0590\u058c֝\u058cշ֙զկլխ", (byte)93, 69);
               d[6] = θεωψξβΛσσ.E("\u0590֒՜՝֖կ֑֒֎յ֓։սըճՓբ֚֔֔դ֖֦֒ժնդ֮֘շ֠տ", (byte)93, 69);
               d[7] = ζοηκορΦνΣθγΩ.C("ԖԵԢԓՄԂԩԨՂԙԿԜԫԜՒԋԓԷԎԦԗ\u0558ԟԠ", (byte)93, 67);
               d[8] = πηγμΣΔκκ.B(
                  "ƄƊůŴƌűƃƬƛƮƼƭŰƞǁƀƘƤƭƮǅƨƝƱƇƘƷƋƨơƯƟƩƎƒƤƓƑǒǙǚƦƛǎǑƺƱƚƛƸǘǗǀƻơƧƤǗƶƷƠǗǮƯǇǰǦǕưǦǰǭǬǫǝǆǝǜƻǮǟƾǲǘƸƹǣȊǙǿǋǠȅǟǩǻǰǪȏǠȂǬȂǋǬȆǤǛȗȎǛǼȡǬǺǢǘǷșȑȠȨȕǥǽțȚǫ",
                  (byte)93,
                  66
               );
               d[9] = δΛψπξκσβγςα.B("ƮƤƆƖƔƯƩƪƶƵƐŹƯƿƵƐƒƷƁưǃǅƌƍ", (byte)93, 66);
               d[10] = μζξτΩσσφυδεπλΨ.F("֎քզնմ֏։֊֖֕հՙ֏֟֕հղ֗ա\u0590֣֥լխ", (byte)93, 70);
               d[11] = ζοηκορΦνΣθγΩ.E("՜՛թ՝էՔղզ֕՚ևձ֕ը֚֎ղ֥֗\u0590տՠքթր֠֔տցը\u058b֞սվ֑֯֗֊։֤ոָֺ֜֒֠֫֏֢֣֙վׅ֝\u058c֍", (byte)93, 69);
               d[12] = ςΦζσμτΓσ.B("ƈơưƳƏƕƊƮƛưƄƁ", (byte)93, 66);
               d[13] = ΣφδσΔζιΠρα.B("ƞűƦƊƠƨƗŵƍƍŻƁ", (byte)93, 66);
               d[14] = φΨαξωυθανΣφυκη.C("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ\u0557ՊԔԢԟԠ", (byte)93, 67);
               d[15] = ζβησεθωυγτ.B("ƑƧūƍſƘƧƲƯƜŸƇƾƓƈƙưǀƑƴƒƴƛǂƆƨǊƼǄƩƥƾǂƩƦƴǆƐǍǕƥǌƘǘƘǎƵǒƻƝƵƱƤǙƲƧƷǃƪǉǎǈƺǀǣǃǔǪǓƲƸǓǅǑǲǁ", (byte)93, 66);
               d[16] = λΣΩσμφγχ.D("ԤԺӾԠԒԫԺՅՂԯԋԚՑԦԛԬՃՓԤՇԥՂՅԔ\u0530ՌԬՕՏՁդԶ", (byte)93, 68);
               d[17] = ΣδτΠνεγοΓορητ.D("ԱԄԹԝԳԻԪԈԠԠԎԔ", (byte)93, 68);
               d[18] = ΦδφπθΩΩλζξ.F("՛\u058cճր֑֑ևՒշ֑ղղէՙնպռ֗ւվօՠ֩օմ֟գեօ֛լֆ", (byte)93, 70);
               d[19] = οοθδΨιοΦΠβδζ.D("ՀԻՄԻԕԞԿՂԊԠԟԞԡԬԭՁԕԱՂԤՄԙԙ՝ՌՓԲՋՍՒԣՖ", (byte)93, 68);
               d[20] = ΦδφπθΩΩλζξ.B("ƮƒſƂƂũƏŸƴƕƜƩƹƋƨƺſƓƏƱŽƄƴƕƜƻƿƅƮƻǄƍƜǋƢǈƲǔƑưƺƓươ", (byte)93, 66);
               d[21] = φδχεθοκψαλΛογλ.D("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ\u0557ՊԔԢԟԠ", (byte)93, 68);
               d[22] = ΠΛΨοδΩσμνΛγΦφβς.B("ŰƔƜƢƔƠƧƶƙźƮŷƉưƒƔƶƭƑƄƓƀǃƀƃǈǋƙƉưƢǎ", (byte)93, 66);
               d[23] = πψυκΠΨμΛΩβΣφμφσ.D("ԞԐԐ\u0530ԓԤԉԻՌՍՍԔ", (byte)93, 68);
               d[24] = ςΦζσμτΓσ.B("ƎƳżƇűƭƁƲƣŶƔƁ", (byte)93, 66);
               d[25] = φΨαξωυθανΣφυκη.D("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ\u0557ՊԔԢԟԠ", (byte)93, 68);
               break;
            case 1:
               d[0] = ΣερμΔσατσκ.F("֍վՆօ֗ձ\u0558ի\u058c֊֑֗֎֓վ֗վճ՞֒\u0590նև֛֒պ֕վ֧֡֡ջծս֡֕ը֗ց։ֳո֪ց", (byte)93, 70);
               d[1] = πχσδΦΦνθΔπ.A("ŨƁƥƟƮƳŲƲƑƴƬƪƇƠƒƑŹƯſƁƒƏƌƍ", (byte)93, 65);
               d[2] = μεςΩΔΣγν.C("ԱԛԞԑӿԇՈՈԺԪԮԣԼԾՑԊՄԷԯՆՃԷ\u0558\u0558ԧՖԘԟԮՊդԸԷզԞՂՕԸԴՂՍդ՛՝ԾԮղդՠԮգէՕՂԿՀ", (byte)93, 67);
               d[3] = βθκςνθΩθυμςτκχ.F("ղգը֕֔իՓ֎֔ն՛ա", (byte)93, 70);
               d[4] = φΨαξωυθανΣφυκη.F(
                  "զզղ՝ւղ֑ցծկեռծշշձ֊֏փ֗չ֒\u0590ՠւ֊֘։ք֛֦֙֎լւ֖֟֔֯յ։֖֖֕֩տ֑֗րֽׂւտց֣֡ւִ֟\u05caׁ֩֞א\u05ccֲ֩\u05c9֭֠\u05c9ג\u058cה֘֓ל֛לֵ֞֬ׄדנ֦֡ץ׃־ֺ֨\u05cfׇ\u05ceפס־֭ז֮ק\u05eeצ״\u05c8ׇץ\u05caהל׳ל\u05eb\u05ccׄ״׃י؊ש׳\u0600מ\u05fe\u0600؈؈\u05c8ד\u05cb؍ע\u05edץ\u05eb\u05ebײؙ؎\u05ec\u05ec״؏סؕؔ\u05ee\u05ffצ؝ײإ\u05f5ئ؞\u05ff؆\u05ff\u05fe",
                  (byte)93,
                  70
               );
               d[5] = ΨφιωσρΓδΔθ.E("աւզՍՎՉՎյ֔֎\u0558ՙղ֊ժցմ֦֚֝֗չ֠ադ֝թ֧\u058b֧֭ւ", (byte)93, 69);
               d[6] = ςπυηννναΣ.F("\u0590֒՜՝֖կ֑֒֎յ֓։սըճՓբ֚֔֔դ֑֚֕ղ֦֢֠֗րֱք", (byte)93, 70);
               d[7] = ΣδτΠνεγοΓορητ.B("ƃƢƏƀƱůƖƕƯƆƪƭƻƈǁƿƫƠơƃƜƽƣƩƚƩƤƹƸƞǊƪ", (byte)93, 66);
               d[8] = φδχεθοκψαλΛογλ.F(
                  "դժՏՔլՑգ\u058cջ֎֜֍Րվ֡ՠոք֍֎֥ֈս֑էո֗իֈց֏տ։ծղքճձֲֹֺֆջֱ֑֚֮պջַָ֛֘֠ցևքַ֖֗րַ\u05ce֏֧א׆ֵ\u0590׆א\u05cd\u05cc\u05cbּֽֽ֦֛\u05ceֿ֞גָ֘֙׃תֹן֫׀ץֿ\u05c9כא\u05caׯ׀ע\u05ccע֫\u05ccצֻׄ\u05f7\u05eeֻל\u0601\u05ccךָׂמג״\u05c8הצ\u05f9\u0605\u05faױף\u0600\u05ffס\u05ec؋،א׳ؐ\u05fc؎ס",
                  (byte)93,
                  70
               );
               d[9] = ξψθρΣΠΣς.B("ƮƤƆƖƔƯƩƪƶƵƓƫƶſžǁƞƳƾƽƢƟƌƍ", (byte)93, 66);
               d[10] = ιΠοθΩΦξκ.C("ՁԷԙԩԧՂԼԽՉՈԦԣԪԋԐԥԪԎ\u0558ՖԩԲԟԠ", (byte)93, 67);
               d[11] = πχσδΦΦνθΔπ.E("՜՛թ՝էՔղզ֕՚ևձ֕ը֚֎ղ֥֗\u0590տՠքթր֠֔տցը\u058b֞սվ֑֯֗֊։֤ոָ֤֫շֱտִׂ֢֑֘֙֟\u058c֍", (byte)93, 69);
               d[12] = δΛψπξκσβγςα.B("ƤƢŲƤƪƗƦƩƏƑżŷŵƬƻƋƹƣƛƱƻƵƌƍ", (byte)93, 66);
               d[13] = ξψθρΣΠΣς.F("հեդցՏ\u0590ևՔղ՛\u0590թժ֙֕։֙֎֕ճձ֕լխ", (byte)93, 70);
               d[14] = ΨΦνΨΦωυΩνβςμ.A("ŻƬƓƠƱƱƧŲƗƱƐƆƭƜžƹƣƟƿƍǂƳƄƸƠǆƔơƄƷƬǇ", (byte)93, 65);
               d[15] = χΠξΦιζΨΣωΦσΨζ.C("ԤԺӾԠԒԫԺՅՂԯԋԚՑԦԛԬՃՓԤՇԥՇԮՕԙԻ՝Տ\u0557ԼԸՑՕԼԹՇՙԣՠըԸ՟ԫիԫաՈեՎ\u0530ՈՄԷլՅԺՊՖԽ՜ա՛ՍՓպԿ՝ՀշՈբ֊՛֍՚՜գծՋհզՒժ֎ճ֘՟ՠ", (byte)93, 67);
               d[16] = μζξτΩσσφυδεπλΨ.A("ƑƧūƍſƘƧƲƯƜŸƇƾƓƈƙưǀƑƴƒƳƓƀƲƷǉƌƾǋƥƿ", (byte)93, 65);
               d[17] = οοθδΨιοΦΠβδζ.D("ӿԅԹԖԨԇԊԃԜԋՇՐԲԺԿԟՃՋԯՔԸՈԟԠ", (byte)93, 68);
               d[18] = ζβησεθωυγτ.D("ԎԿԦԳՄՄԺԅԪՄԥԥԚԌԩԭԯՊԵԱԸԐԫԸՏԗԶՍԪԭԚՠ", (byte)93, 68);
               d[19] = φΨαξωυθανΣφυκη.B("ƭƨƱƨƂƋƬƯŷƍƌƋƎƙƚƮƂƞƯƑƱƂƐƷƇƵƬƞƷƛǊƢ", (byte)93, 66);
               d[20] = οοθδΨιοΦΠβδζ.A("ƮƒſƂƂũƏŸƴƕƜƩƹƋƨƺſƓƏƱŽƄƴƕƜƻƿƅƮƻǄƍǒƊƽǓƈưƯƴƤƹƼơ", (byte)93, 65);
               d[21] = ξψθρΣΠΣς.F("՛\u058cճր֑֑ևՒշ֑ղշչտժա՜ս֟մ՜ս՚շթջգդծշ\u0590֮", (byte)93, 70);
               d[22] = ζβησεθωυγτ.A("ŰƔƜƢƔƠƧƶƙźƮŷƉưƒƔƶƭƑƄƓǆƺƁƔƛƂƭƍǅǁƉ", (byte)93, 65);
               d[23] = ςπυηννναΣ.A("ŪƒſƏƳŷŸƒƏƧƌƁ", (byte)93, 65);
               d[24] = οοθδΨιοΦΠβδζ.A("ƂƑƬƟưŵųƙƊƖƶŻŻƪƩƓƣƓƞƮƕǅƌƍ", (byte)93, 65);
               d[25] = ςπυηννναΣ.C("ԎԿԦԳՄՄԺԅԪՄԦԘԐԾԉԳԿԴԳԣ\u0530ԷԵԖ\u0530ՉՕՀԭ\u0530ԙԷ", (byte)93, 67);
               break;
            case 2:
               d[0] = ΣφδσΔζιΠρα.C("ӽՆԞԒԕԧԶՋՃՁԾՊԻԟՋՆԿԭՂԠ\u0557ՈԟԠ", (byte)93, 67);
            case 3:
            default:
               break;
            case 4:
               d[0] = ΣφδσΔζιΠρα.C("ӼԳԼԶԵԹԡԙՅԣԺԱՒԬՔԳԓՀԓԖԪ\u0558ԟԠ", (byte)93, 67);
         }
      }
   }

   private static Object e(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ζβκψγαωηκΠΠ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςΦζσμτΓσ.A("ÅçéÉíČĄĚĆÕēĉėđÚÿġĠĘĞĘí", (byte)15, 65), ζβκψγαωηκΠΠ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣερμΔσατσκ.E("ԮԻԺӽԽԹԴԽՈԷԄՂՆԿՂՈԊ\u0892\u088f࢘ࢧ\u0893\u0892ࢫ࢚࢞ࢅࢆԡ", (byte)15, 69) + var1 + ΨΦνΨΦωυΩνβςμ.F("ԅ", (byte)15, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public void e() {
      this.a.a().a(e<"㺀">(ai, aj), this.a);
      this.a.a(new χιΣωβσνλδΩβξΓδ(this.a, this.a.a()), new μΓμρΨπζνιφφβΩΛΓ[ak]);
      this.a.a(new ψηβμοσςυγΛεπ(this.a, this.a.a()), new μΓμρΨπζνιφφβΩΛΓ[al]);
      this.a.a(new τφωδησδψψΛθβρ(this.a, this.a.a()), new μΓμρΨπζνιφφβΩΛΓ[am]);
      AtomicBoolean var1 = new AtomicBoolean();
      ψΓωτιμωκχψΛΨ.a(
         (var1x, var2, var3) -> {
            switch (var3.length) {
               case 2:
                  if (!var1.get()
                     || !var2.equals(e<"㺀">(ar, as))
                        && (!var2.startsWith(e<"㺃">(at, au ^ av)) || !var2.contains(e<"㺆">(aw, ax ^ ay)) || !var2.endsWith(e<"㺉">(az, ba ^ bb)))) {
                     break;
                  }

                  return (boolean)(var3[bc] instanceof PreLoginEvent && κδΔΦφγμδξΨωψο.n.ar() && !κδΔΦφγμδξΨωψο.d.ar() ? bd : be);
               case 3:
                  if (var2.equals(e<"㺌">(bf, bg))
                     || var2.startsWith(e<"㺏">(bh, bi ^ bj)) && var2.contains(e<"㺒">(bk, bl)) && var2.contains(e<"㺕">(bm & bn, bo))) {
                     String var4 = (String)var3[bp];
                     if (var4.startsWith(e<"㺘">(bq & br, bs))) {
                        Object var5 = var3[bt];
                        Object var6 = var3[bu];
                        if (var4.equals(χιΣωβσνλδΩβξΓδ.class.getCanonicalName()) && κδΔΦφγμδξΨωψο.n.ar() && !κδΔΦφγμδξΨωψο.d.ar()) {
                           ψΓωτιμωκχψΛΨ.b(e<"㺛">(bv, bw ^ bx) + var5 + e<"㺞">(by, bz ^ ca));
                        } else {
                           ψΓωτιμωκχψΛΨ.c(
                              e<"㺡">(cc, cd ^ ce)
                                 + var4
                                 + e<"㺤">(cf, cg ^ ch)
                                 + var6.getClass().getSimpleName()
                                 + e<"㺧">(ci & cj, ck)
                                 + var5
                                 + e<"㺪">(cl, cm ^ cn)
                           );
                        }

                        var1.set((boolean)cp);
                        return (boolean)cq;
                     }
                  }
                  break;
               default:
                  var1.set((boolean)cr);
            }

            return (boolean)cs;
         }
      );
   }
}
