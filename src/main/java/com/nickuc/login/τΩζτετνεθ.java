package com.nickuc.login;

import com.velocitypowered.api.proxy.InboundConnection;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class τΩζτετνεθ {
   private static long u = Long.reverse(7349874591868649472L);
   private static long ay = Long.reverse(4503462237418747692L);
   private static final Field k;
   private static int ag = (75497472 >>> 247 | 75497472 << -247) & -1;
   private static int o = Integer.reverse(536870912);
   private static long p = Long.reverse(6376959682404874028L);
   private static int al = -1 >>> 210 | -1 << ~210 + 1;
   private static int au = Integer.reverse(-1342177280);
   private static long bf = Long.reverse(4503462237418747692L);
   private static int af = 0 >>> 155 | 0 << -155;
   private static long t = Long.reverse(6376959682404874028L);
   private static int m = (-1 >>> 196 | -1 << ~196 + 1) & -1;
   private static long x = Long.reverse(7349874591868649472L);
   private static long b = Long.reverse(4503462237418747692L);
   private static long q = Long.reverse(7349874591868649472L);
   private static int z = Integer.reverse(-536870912);
   private static int ax = Integer.reverse(-1);
   private static final Field i;
   private static long as = Long.reverse(6376959682404874028L);
   private static int i = Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190;
   private static long c;
   private static int ac = (8388608 >>> 244 | 8388608 << -244) & -1;
   private static long ai = Long.reverse(7349874591868649472L);
   private static int bb = Integer.reverse(0);
   private static int y = Integer.reverse(0);
   private static int bc = Integer.reverse(-268435456);
   private static long ab = Long.reverse(7349874591868649472L);
   private static long w = Long.reverse(6376959682404874028L);
   private static long ao = Long.reverse(6376959682404874028L);
   private static int aw = (917504 >>> 144 | 917504 << -144) & -1;
   private static int ar = 384 >>> 37 | 384 << -37;
   private static long bd = Long.reverse(4503462237418747692L);
   private static long at = Long.reverse(7349874591868649472L);
   private static int s = Integer.reverse(-1610612736);
   private static int an = Integer.reverse(-805306368);
   private static long e = Long.reverse(7349874591868649472L);
   private static int l = 768 >>> 168 | 768 << -168;
   private static int v = Integer.reverse(1610612736);
   private static long ap = Long.reverse(7349874591868649472L);
   private static long ah = Long.reverse(6376959682404874028L);
   private static int aj = Integer.reverse(0);
   private static long av = Long.reverse(4503462237418747692L);
   private static int ak = Integer.reverse(1342177280);
   private static long k = Long.reverse(7349874591868649472L);
   private static int bg = Integer.reverse(0);
   private static long ad = Long.reverse(6376959682404874028L);
   private static int be = Integer.reverse(134217728);
   private static String[] b = new String[τΩζτετνεθ.h];
   private static final Field j;
   private static final Field l;
   private static long j = Long.reverse(6376959682404874028L);
   private static final Class<?> n;
   private static int a = Integer.reverse(0);
   private static final Class<?> m;
   private static long aa = Long.reverse(6376959682404874028L);
   private static int g = (-2147483640 >>> 223 | -2147483640 << -223) & -1;
   private static int ba = 524288 >>> 211 | 524288 << -211;
   private static long n = Long.reverse(4503462237418747692L);
   private static int f = 0 >>> 206 | 0 << -206;
   private static int az = 0 >>> 127 | 0 << -127;
   private static int aq = (0 >>> 142 | 0 << ~142 + 1) & -1;
   private static int h = Integer.reverse(-2013265920);
   private static long am = Long.reverse(4503462237418747692L);
   private static int r = 0 >>> 209 | 0 << -209;
   private static String[] a = new String[g];
   private static long d = Long.reverse(6376959682404874028L);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long ae = Long.reverse(7349874591868649472L);

   private static void b() {
      c = 3814369761979137562L;
      long var0 = c ^ -9047011086752211838L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(44 + 25),
               (byte)(16 + 67),
               (byte)(34 + 13),
               (byte)(40 + 27),
               (byte)(2 + 64),
               (byte)(46 + 21),
               (byte)(9 + 38),
               (byte)(35 + 45),
               (byte)(15 + 60),
               (byte)(54 + 13),
               83,
               53,
               (byte)(15 + 65),
               (byte)(35 + 62),
               (byte)(86 + 14),
               (byte)(99 + 1),
               (byte)(37 + 68),
               (byte)(12 + 98),
               (byte)(36 + 67)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
               b[0] = ΨΦνΨΦωυΩνβςμ.B("ŚŲŽŨŰūŲœƒƗŚƜųźƘťƢŨƗơźƭŧƂƜƁƬơƩƖƅŷŰƉƖƷƱƗŽƎƪưſƉ", (byte)81, 66);
               b[1] = ΨΦνΨΦωυΩνβςμ.B("ƎźŭƌŴŶśƗšůżũ", (byte)81, 66);
               b[2] = ςπυηννναΣ.E("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ\u0557ՙ\u058c֤՜յսդճեե֟յֈՠ֏\u058cյ", (byte)81, 69);
               b[3] = ΨφιωσρΓδΔθ.A("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųŸƬƴƩƔƙźƠƽǁƲƉ", (byte)81, 65);
               b[4] = βεξΠθρρςΔΦμ.E(
                  "յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ\u0557ՙ\u058c֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ\u058bַ֤֤֮֞֔֏մֲ\u058bֵռտ֣վ֦֢֧֓֝ׄ֬\u058bքּ֣\u058c׃ֲִ֩\u05cf׃ָׅ\u05cfּּ֕֯טּֿ֝יף֜׆",
                  (byte)81,
                  69
               );
               b[5] = φδχεθοκψαλΛογλ.E(
                  "Ն՞թՔ՜\u0557՞ԿվփՐ՚քիլՍ֏գն\u0558էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ֳֶ֩֊ֽ֊ձնֵָ֭֡֝֘֠ք׃ֵׇׅ֚ׄ֠\u05c8ׁֈ֣ב֨ה\u0590הֳׇָ֦֥\u05cdז\u05cb֮֘סְג",
                  (byte)81,
                  69
               );
               b[6] = βθκςνθΩθυμςτκχ.D("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԼՂՅԞՉՑԡԣԯԽԽԤԒԴՍԻ՚\u0558ԔՉՒԿ՝գաԾՅբԟԨ՜ԥԶբԸԪԽԭԯԫծԼըմԻԼ", (byte)81, 68);
               b[7] = μεςΩΔΣγν.D("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԏԖԷԭԸԉӵӼԕԺӺԽԐԬԿԁԆՀӺՇԟՇԃՅՃԹԏՈԱՐՄՆ\u0530ՉԡՊՂԦԴԝԔ\u0530ԜՎԚՋՠԣՔԻԼԥՠԦ\u0530", (byte)81, 68);
               b[8] = ξψθρΣΠΣς.F(
                  "յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ\u0557ՙ\u058c֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ\u058bַַֽ֤֛֥֚֮֞֔֜ռֲֳֳׇ֢֣֤֚֘֩֟\u05caֆֱַׁׅ֤גׁ\u05c8ז֧ח֯י֠֡", (byte)81, 70
               );
               b[9] = ζοηκορΦνΣθγΩ.E(
                  "Ն՞թՔ՜\u0557՞ԿվփՐ՚քիլՍ֏գն\u0558էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ְֳֵֶ֭ֆ֊չ֑֑֭֒րׂ֦֮֯֜־\u05cd֦֡ցׁ֚֭\u05caד\u0590זא֦טֳׄ֠֡", (byte)81, 69
               );
               b[10] = οΩνΩρωλΨηΛδωδ.F("Ն՞թՔ՜\u0557՞ԿվփՐ՚քիլՍ֏գն\u0558էօՖծը՜՝ՠ\u058cծ֍֏հօյ֥֟ֆ\u058c֫֊տ֮յ", (byte)81, 70);
               b[11] = δΛψπξκσβγςα.C("ԏԐԘԝԎԀԝԅԊӜԝӰ", (byte)81, 67);
               b[12] = φδχεθοκψαλΛογλ.C("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԠӱԉԃӷӸӻԧԉԨԪԋԠԐՀԺԡԧՆԥԚՉԐ", (byte)81, 67);
               b[13] = ζοηκορΦνΣθγΩ.A("ƈƉƑƖƇŹƖžƃŕƖũ", (byte)81, 65);
               b[14] = μεςΩΔΣγν.A("ƉƊƖžƗƑźŘƜŭŵŰƃŹƜƀƛƓŧƘŽƂƋŭƋťūŭƠƸŰƉưƄƱƈƾŶƍƔƕƁƳƥſǆƃƟƲǋƸƨǂƼƠǃƧƴƊƿǏƶƢƒƙǐƸưǎƧǠƻǞƫƞǗƽƟǔƼǣǔǬƵǀǦƹǬǲƫƱƲǊƵǹǈ", (byte)81, 65);
               b[15] = δΛψπξκσβγςα.F("քՂռպՊառֆՌՆ՜ֆՎցՋ֕՟ի\u0590֏\u0558֙ՠա", (byte)81, 70);
               b[16] = ΨΦνΨΦωυΩνβςμ.A("œżƅŬƐŞŖƀŵŽƕţůŠƇŠƫơŶƎƆƃƃƝƠŬƥſžƁƔƨƤƈƺƺƻƷƛƶưƚŻƐơƱƽǃƀƩƈơǏƈƩƚǏǁǀƧƾƐƢƢǒǛǏƬǚǜƞưǀƼǞƩ", (byte)81, 65);
               break;
            case 1:
               b[0] = οΩνΩρωλΨηΛδωδ.B("ŚŲŽŨŰūŲœƒƗŚƜųźƘťƢŨƗơźƭŧƂƜƁƬơƩƖƅŷƸƋƇƐƪƻƉƜƀƕƑǅƜžƛƸƣǃƚǁƧƗƔƕ", (byte)81, 66);
               b[1] = ΨΦνΨΦωυΩνβςμ.F("ՅՁֆօՀէՄՙ\u0557թ֏կՊ՜Ւսխ։իՐՔճՠա", (byte)81, 70);
               b[2] = ΦδφπθΩΩλζξ.C("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԮӹԙԀԎӽԛԾԂԣԣԐ", (byte)81, 67);
               b[3] = πηγμΣΔκκ.B("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųƇƔƗƵƸƬƽƟŸƺƮƉ", (byte)81, 66);
               b[4] = λΣΩσμφγχ.C(
                  "ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԺԬԆՍԊԦԹՒԿԯՉԿԪԏՍԦՐԗԚԾԙՁԮԽՂԸ՟ՇԦԟԾ\u0557ԧ՞ՍՄՏժ՞ՠՓժ\u0530\u0557ձհծինԴհՉԷա", (byte)81, 67
               );
               b[5] = ιΠοθΩΦξκ.E(
                  "Ն՞թՔ՜\u0557՞ԿվփՐ՚քիլՍ֏գն\u0558էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ֳֶ֩֊ֽ֊ձնֵָ֭֡֝֘֠ք׃ֵׇׅ֚ׄ֠\u05c8ׁֈ֣ב֨ה\u0590הֳׇ֨֒ז֘ובי׃׃֚ף", (byte)81, 69
               );
               b[6] = θεωψξβΛσσ.F(
                  "յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ\u0557ՙ\u058c֤՜յ֜հ֝մ֪բչրցխ֧֪֡փֶ֮ֆֈ֢֢֔։շֲֽֿ֙֠չַׂ֤֮\u05c8׆ׇ֣֪ք֍ׁ֊֙\u05ccֻ׀\u0590֬דֵ׃ט֤\u05c9֠֡", (byte)81, 70
               );
               b[7] = ντθΔζβΔζ.D("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԏԖԷԭԸԉӵӼԕԺӺԽԐԬԿԁԆՀӺՇԟՇԃՅՃԹԏՈԱՐՄՆ\u0530ՉԡՊՂԦԴԝԔ\u0530Ԝ՛Ճ՞Ե՛ԴՕՖԠՊԝՈՠՎԬձե՚ժՇՈդԻԼ", (byte)81, 68);
               b[8] = θεωψξβΛσσ.E(
                  "յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ\u0557ՙ\u058c֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ\u058bַַֽ֤֛֥֚֮֞֔֜ռֲֳֳׇ֢֣֤֚֘֩֟\u05caֆְַ֛\u05c9ֱׁ֏ֶ\u05cf֤ח֣֨֠֡", (byte)81, 69
               );
               b[9] = ζβησεθωυγτ.A("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųƶƉƥƸźſƹųǀƘƿƣŽǃƂƦƦǆơǊǇǄǉǁƚƞƍƦǁƥƥƔǂǃưƺǖǒǡƵƺƕǕǃǠƱƽƟƜǁƿǅǄƷƴƵ", (byte)81, 65);
               b[10] = οΩνΩρωλΨηΛδωδ.C("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԠӱԉԃӷӸӻԧԉԨԪԸԭӾԌԠԁ\u0530ՅԿԁՁԐ", (byte)81, 67);
               b[11] = πχσδΦΦνθΔπ.A("ŪŬůŹƘŪŚŞŹŢƒũ", (byte)81, 65);
               b[12] = ΨΦνΨΦωυΩνβςμ.E("Ն՞թՔ՜\u0557՞ԿվփՐ՚քիլՍ֏գն\u0558էօՖծը՜՝ՠ\u058cծ֍֏յ֣֝ղճջզփ֦֡֩յ", (byte)81, 69);
               b[13] = οοθδΨιοΦΠβδζ.A("ůƏƏƈŭƝŹƒƢŮƤŮƄŻŨƀƦƔŢŤƁƇŴŵ", (byte)81, 65);
               b[14] = χΠξΦιζΨΣωΦσΨζ.D("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԺԬԆՍԊԦԹՒԿԯՉՃԧՊԮԻԑՆՖԽԩԙԠ\u0557ԿԷՕԮէՂեԲԥ՞ՄԦ՛Ճժ՛ճԼՇծՄԷՅՓժռՐ՚՛Ր", (byte)81, 68);
               b[15] = χφπρψπφΦθμπ.A("ƘŖƐƎŞŵƐƚŠŚŰųƁſƖŤŻŨơƍƖƝŴŵ", (byte)81, 65);
               b[16] = βθκςνθΩθυμςτκχ.D("ӚԃԌӳԗӥӝԇӼԄԜӪӶӧԎӧԲԨӽԕԍԊԊԤԧӳԬԆԅԈԛԯԫԏՁՁՂԾԢԽԷԡԂԗԨԸՄՊԇ\u0530ԏԨՖԏ\u0530ԡՖՈՇԮՅԗԩԩ՛ԶԜՂՖդԠՠԿԢԻ\u0530", (byte)81, 68);
               break;
            case 2:
               b[0] = φΨαξωυθανΣφυκη.B("ŤŹŜŬƗŬƒźơƗŸũ", (byte)81, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = μεςΩΔΣγν.D("ԘӪӹԚԘӱԇԘԁԣԧӾԎӪӹԊԃԡԢӭԎԴӻӼ", (byte)81, 68);
         }
      }
   }

   static {
      b();
      String var0 = c<"㺀">(i, j ^ k);
      String var1 = c<"㺃">(l & m, n);
      Class var2;
      if ((var2 = ψΨπηηυυδΔη.a(c<"㺆">(o, p ^ q))) == null) {
         throw new IllegalArgumentException(c<"㺉">(s, t ^ u));
      } else if ((m = ψΨπηηυυδΔη.a(c<"㺌">(v, w ^ x))) == null) {
         throw new IllegalArgumentException(c<"㺏">(z, aa ^ ab));
      } else if ((n = ψΨπηηυυδΔη.a(c<"㺒">(ac, ad ^ ae))) == null) {
         throw new IllegalArgumentException(c<"㺕">(ag, ah ^ ai));
      } else if ((i = ΓΛθσφζςηκ.a(var2, m, aj)) == null) {
         throw new IllegalArgumentException(c<"㺘">(ak & al, am) + m + c<"㺛">(an, ao ^ ap) + var2);
      } else if ((j = ΓΛθσφζςηκ.a(n, m, aq)) == null) {
         throw new IllegalArgumentException(c<"㺞">(ar, as ^ at) + m + c<"㺡">(au, av) + n);
      } else {
         Class var3 = ψΨπηηυυδΔη.a(c<"㺤">(aw & ax, ay));
         if (var3 != null) {
            String[] var10001 = new String[ba];
            var10001[bb] = c<"㺧">(bc, bd);
            k = ΓΛθσφζςηκ.a(var3, var10001);
            if (k == null) {
               throw new NullPointerException(c<"㺪">(be, bf));
            }
         } else {
            k = null;
         }

         l = ΓΛθσφζςηκ.a(m, Channel.class, bg);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  τΩζτετνεθ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φΨαξωυθανΣφυκη.B("óĕė÷ěĺĲňĴăŁķŅĿĈĭŏŎņŌņě", (byte)38, 66), τΩζτετνεθ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ΣερμΔσατσκ.F("ՅՒՑԔՔՐՋՔ՟Վԛՙ՝Ֆՙ՟ԡࢷ࢝ࢫࢺࢬࢼࢶࢯࢳԶ", (byte)38, 70) + var1 + ζβησεθωυγτ.D("ѡ", (byte)38, 68) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 102L;
      var1 ^= -9047011086752211838L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(7 + 62),
                     (byte)(67 + 16),
                     (byte)(35 + 12),
                     (byte)(22 + 45),
                     (byte)(52 + 14),
                     (byte)(49 + 18),
                     (byte)(15 + 32),
                     80,
                     75,
                     (byte)(26 + 41),
                     (byte)(49 + 34),
                     (byte)(38 + 15),
                     (byte)(55 + 25),
                     (byte)(73 + 24),
                     (byte)(69 + 31),
                     (byte)(7 + 93),
                     (byte)(12 + 93),
                     (byte)(29 + 81),
                     (byte)(26 + 77)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣερμΔσατσκ.B("ƜƩƨūƫƧƢƫƶƥŲưƴƭưƶŸԎӴԂԑԃԓԍԆԊ", (byte)93, 66));
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

   @Nullable
   public static Channel a(Object var0, InboundConnection var1) {
      try {
         Object var2;
         if (var1.getClass().isAssignableFrom(n)) {
            var2 = j.get(var1);
         } else if (k != null) {
            var1 = (InboundConnection)k.get(var1);
            var2 = i.get(var1);
         } else {
            var2 = i.get(var1);
         }

         return (Channel)l.get(var2);
      } catch (Exception var3) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(a, b) + var0.getClass().getCanonicalName() + c<"㺃">(c, d ^ e), var3);
         return null;
      }
   }
}
