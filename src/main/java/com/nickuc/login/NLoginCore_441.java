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

public class NLoginCore_441 extends NLoginCore_353 {
   private static int dp = Integer.reverse(-1);
   private static int bm = Integer.reverse(0);
   private static int af = Integer.reverse(1610612736);
   private static long co = Long.reverse(4123670591895802620L);
   private static int ak = 7340032 >>> 52 | 7340032 << ~52 + 1;
   private static long ac = Long.reverse(-343900238455729412L);
   private static int cv = 192 >>> 166 | 192 << ~166 + 1;
   private static int cj = Integer.reverse(-1476395008);
   private static long ah = Long.reverse(-4467570830351532032L);
   private static int dy = Integer.reverse(0);
   private static int ed = (2 >>> 156 | 2 << ~156 + 1) & -1;
   private static long bh = Long.reverse(-343900238455729412L);
   private static int h = 0 >>> 27 | 0 << ~27 + 1;
   private static int ao = Integer.reverse(-1);
   private static int ar = 4 >>> 129 | 4 << -129;
   private static int cm = -2147483643 >>> 94 | -2147483643 << ~94 + 1;
   private static int du = Integer.reverse(0);
   private static int o = 2048 >>> 43 | 2048 << ~43 + 1;
   private static int cp = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[ed];
   private static long eb = Long.reverse(-4467570830351532032L);
   private static int cq = Integer.reverse(1073741824);
   private static int n = 0 >>> 198 | 0 << -198;
   private static int az = (-1 >>> 61 | -1 << ~61 + 1) & -1;
   private static int ch = Integer.reverse(0);
   private static long bp = Long.reverse(-343900238455729412L);
   private static int cw = 12582912 >>> 83 | 12582912 << -83;
   private static long bd = Long.reverse(-4467570830351532032L);
   private static int v = Integer.reverse(-1);
   private static long au = Long.reverse(4123670591895802620L);
   private static int dl = Integer.reverse(0);
   private static long cx = Long.reverse(-343900238455729412L);
   private static int ca = Integer.reverse(1207959552);
   private static long cs = Long.reverse(4123670591895802620L);
   private static int dr = Integer.reverse(-1207959552);
   private static int aq = Integer.reverse(0);
   private static int av = Integer.reverse(0);
   private static long df = Long.reverse(-343900238455729412L);
   private static int bx = Integer.reverse(-2013265920);
   private static int bj = Integer.reverse(1879048192);
   private static int k = (4096 >>> 44 | 4096 << -44) & -1;
   private static int at = -1 >>> 224 | -1 << ~224 + 1;
   private static int q = Integer.reverse(1073741824);
   private static long dx = Long.reverse(4123670591895802620L);
   private static int u = Integer.reverse(-1073741824);
   private static int ec = 0 >>> 109 | 0 << ~109 + 1;
   private static long bz = Long.reverse(4123670591895802620L);
   private static String[] ZKM_STR_B = new String[NLoginCore_441.ee];
   private static long cg = Long.reverse(4123670591895802620L);
   private static int dd = Integer.reverse(1073741824);
   private static int ab = 5242880 >>> 180 | 5242880 << -180;
   private static long cy = Long.reverse(-4467570830351532032L);
   private static long r = Long.reverse(-343900238455729412L);
   private static int dh = 0 >>> 110 | 0 << -110;
   private static int be = Integer.reverse(0);
   private static long dt = Long.reverse(4123670591895802620L);
   private static long ba = Long.reverse(4123670591895802620L);
   private static long s = Long.reverse(-4467570830351532032L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int ee = Integer.reverse(67108864);
   private static long dj = Long.reverse(-343900238455729412L);
   private static int cr = Integer.reverse(-402653184);
   private static long ag = Long.reverse(-343900238455729412L);
   private static int bg = '퀀' >>> '\f' | 53248 << -12;
   private static int t = (0 >>> 224 | 0 << -224) & -1;
   private static int cn = -1 >>> 247 | -1 << ~247 + 1;
   private static int di = Integer.reverse(-671088640);
   private static int y = Integer.reverse(536870912);
   private static long bt = Long.reverse(-343900238455729412L);
   private static int aa = Integer.reverse(1073741824);
   private static int bb = (1610612736 >>> 219 | 1610612736 << -219) & -1;
   private static int dm = (8388608 >>> 87 | 8388608 << -87) & -1;
   private static long d = Long.reverse(-343900238455729412L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static long ad = Long.reverse(-4467570830351532032L);
   private static int by = (-1 >>> 192 | -1 << ~192 + 1) & -1;
   private static int dv = Integer.reverse(2013265920);
   private static int cu = (0 >>> 105 | 0 << -105) & -1;
   private static long dk = Long.reverse(-4467570830351532032L);
   private static long bi = Long.reverse(-4467570830351532032L);
   private static long da = Long.reverse(-343900238455729412L);
   private static int dz = (1040187392 >>> 25 | 1040187392 << -25) & -1;
   private static int ds = -1 >>> 114 | -1 << -114;
   private static int dn = 0 >>> 231 | 0 << -231;
   private static long bu = Long.reverse(-4467570830351532032L);
   private static int ai = (16777216 >>> 246 | 16777216 << ~246 + 1) & -1;
   private static int dc = Integer.reverse(0);
   private static long al = Long.reverse(-343900238455729412L);
   private static long ap = Long.reverse(4123670591895802620L);
   private static long l = Long.reverse(-343900238455729412L);
   private static int c = 0 >>> 185 | 0 << ~185 + 1;
   private static long cb = Long.reverse(4123670591895802620L);
   private static int bw = (24 >>> 67 | 24 << ~67 + 1) & -1;
   private static int bk = Integer.reverse(-1);
   private static long ce = Long.reverse(4123670591895802620L);
   private static long ck = Long.reverse(-343900238455729412L);
   private static int bf = (524288 >>> 209 | 524288 << ~209 + 1) & -1;
   private static int bn = Integer.reverse(1073741824);
   private static int ay = Integer.reverse(-805306368);
   private static long dq = Long.reverse(4123670591895802620L);
   private static long ea = Long.reverse(-343900238455729412L);
   private static int g = (65536 >>> 80 | 65536 << -80) & -1;
   private static int as = 603979776 >>> 154 | 603979776 << -154;
   private static int x = (65536 >>> 16 | 65536 << -16) & -1;
   private static int cd = Integer.reverse(-1);
   private static int bo = Integer.reverse(-268435456);
   private static int cz = Integer.reverse(-1744830464);
   private static long w = Long.reverse(4123670591895802620L);
   private static int var_do = (7340032 >>> 242 | 7340032 << ~242 + 1) & -1;
   private static int bv = 0 >>> 238 | 0 << ~238 + 1;
   private static long bl = Long.reverse(4123670591895802620L);
   private static int de = 3328 >>> 135 | 3328 << ~135 + 1;
   private static long ax = Long.reverse(4123670591895802620L);
   private static long dg = Long.reverse(-4467570830351532032L);
   private static long e = Long.reverse(-4467570830351532032L);
   private static long z = Long.reverse(4123670591895802620L);
   private static int i = Integer.reverse(0);
   private static long cl = Long.reverse(-4467570830351532032L);
   private static int br = Integer.reverse(0);
   private static long c;
   private static int dw = (-1 >>> 103 | -1 << ~103 + 1) & -1;
   private static long bq = Long.reverse(-4467570830351532032L);
   private static int bs = (1073741824 >>> 186 | 1073741824 << -186) & -1;
   private static int ct = (0 >>> 88 | 0 << ~88 + 1) & -1;
   private static int cc = Integer.reverse(-939524096);
   private static long bc = Long.reverse(-343900238455729412L);
   private static int aj = (393216 >>> 113 | 393216 << -113) & -1;
   private static long db = Long.reverse(-4467570830351532032L);
   private static int p = Integer.reverse(-1);
   private static long am = Long.reverse(-4467570830351532032L);
   private static int ci = Integer.reverse(-1073741824);
   private static int an = 512 >>> 102 | 512 << -102;
   private static long m = Long.reverse(-4467570830351532032L);
   private static int aw = Integer.reverse(1342177280);
   private static int cf = 2560 >>> 135 | 2560 << ~135 + 1;
   private static int ae = (12582912 >>> 214 | 12582912 << ~214 + 1) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_441.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.C("ϾРТЂЦхнѓпЎьтѐъГињљёїёЦ", (byte)11, 67), NLoginCore_441.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("йцхЈшфпшѓтЏэёъэѓЕސޥޫިޠޞަމޫ\u07b8ީ\u07b3\u07b9ވވа", (byte)11, 67) + var1 + NLoginCore_384.E("ԁ", (byte)11, 69) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_441(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), null, (f != 0), (g != 0));
   }

   private static void b() {
      c = 4560234390883163359L;
      long var0 = c ^ 5223237960150959786L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(22 + 46),
               69,
               (byte)(25 + 58),
               (byte)(42 + 5),
               (byte)(24 + 43),
               (byte)(32 + 34),
               (byte)(57 + 10),
               47,
               (byte)(6 + 74),
               (byte)(12 + 63),
               (byte)(55 + 12),
               (byte)(28 + 55),
               (byte)(22 + 31),
               (byte)(51 + 29),
               (byte)(69 + 28),
               (byte)(78 + 22),
               (byte)(79 + 21),
               (byte)(27 + 78),
               (byte)(81 + 29),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(36 + 47)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_387.C("ӵӐӶӕӯәӛӗӛӔӃӉ", (byte)68, 67);
               ZKM_STR_B[1] = NLoginCore_575.F("խդՔյծԾճԶՍաՎՏԽզբւևՔւաֈՌ՛հեՒաա֏Փւ֏", (byte)68, 70);
               ZKM_STR_B[2] = NLoginCore_530.E("ՎչԱՆԷնՎծ՞ԽՐդեէն՚։ՕռԾվզՓՔ", (byte)68, 69);
               ZKM_STR_B[3] = NLoginCore_076.F("ՏԱթԴԶսվԶնԺՔՒ՟նջՇսՆՖևյռՓՔ", (byte)68, 70);
               ZKM_STR_B[4] = NLoginCore_324.D("ӧӚӻӅӽҺӉӟӭӢӚԅӐӴӓԃӗӛөӞӟӽӔӕ", (byte)68, 68);
               ZKM_STR_B[5] = NLoginCore_559.F("ՂՂծղ\u0558պրս՛տոՍՠեՐդե՚փ։ՋզՓՔ", (byte)68, 70);
               ZKM_STR_B[6] = NLoginCore_201.C("ӦӘҷӔӳӜӟӒԁӔӷӏӟӒԄԄӕӽӨӶӞӽӔӕ", (byte)68, 67);
               ZKM_STR_B[7] = NLoginCore_433.B("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 66);
               ZKM_STR_B[8] = NLoginCore_173.E("լլե\u0557էէԹՑՠԼջ՛Մ՛հՑբմյՖըռՓՔ", (byte)68, 69);
               ZKM_STR_B[9] = NLoginCore_324.E("ղ՚ԸՅձՖ\u0558՜ՐփԼՓ\u0557ռսևՄճ\u0558ՈՙդշՈռֈ՞րկ֗Վմ", (byte)68, 69);
               ZKM_STR_B[10] = NLoginCore_004.A("œŵůŕŕŅŢŀƆżƈŏ", (byte)68, 65);
               ZKM_STR_B[11] = NLoginCore_453.A("ĹŠœŻśőţſƇƊżŏ", (byte)68, 65);
               ZKM_STR_B[12] = NLoginCore_127.B("ŗĸūżŠŃŮŴƉſƀŏ", (byte)68, 66);
               ZKM_STR_B[13] = NLoginCore_446.B("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 66);
               ZKM_STR_B[14] = NLoginCore_183.F("լլե\u0557էէԹՑՠԼպհ՝ջՀԿմ։դչւդռփի֑֍՝ւՍՓճ", (byte)68, 70);
               ZKM_STR_B[15] = NLoginCore_530.C("ӳӛҹӆӲӗәӝӑԄҽӔӘӽӾԈӅӴәӉӚӥӸӉӽԉӟԁӰԘӏӵ", (byte)68, 67);
               ZKM_STR_B[16] = NLoginCore_387.E("ղ՚ԸՅձՖ\u0558՜ՐփԺԼ՝ՀՐՕօՁյյՃՙ՚է՚բլ՞ղնհապ֕֜ճ֖պ֠ջռի֣ջ֔֝֝փճֈ֞և֘նճմ", (byte)68, 69);
               ZKM_STR_B[17] = NLoginCore_446.F("ՁԵռՙ\u0557ԶՇ՚ԼփմՁ՜Ղտգթս՞ոլՀետռքծցձՕ֏ք", (byte)68, 70);
               ZKM_STR_B[18] = NLoginCore_004.E("ճԲկՐՉՉռՙԹՋՕՄ\u0557ՄՖՕ\u0558՟ըգ՛րոաՍղիռՕվձ\u0557ֈզղխ՚լՖ\u0557՜ւիը", (byte)68, 69);
               ZKM_STR_B[19] = NLoginCore_397.A("ňżżŝŴŀŶŧƅƈƃŹƍōƈƃŎžƍųœŭŚś", (byte)68, 65);
               ZKM_STR_B[20] = NLoginCore_446.F("ՃՂՊ՛ԴԹՎվՍղցՈ", (byte)68, 70);
               ZKM_STR_B[21] = NLoginCore_092.E("ՁՈոԻԹ\u0530տՍԹԹչՈ", (byte)68, 69);
               ZKM_STR_B[22] = NLoginCore_530.D("ӢӑӽӔӮӉӳӛӮӤӑӁӱӛӗԁԈӹӫԅӯӧӔӕ", (byte)68, 68);
               ZKM_STR_B[23] = NLoginCore_397.A("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŤŌŦŗƈŹŘŰŔƔŹ", (byte)68, 65);
               ZKM_STR_B[24] = NLoginCore_471.A("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 65);
               ZKM_STR_B[25] = NLoginCore_223.D("ӢӑӽӔӮӉӳӛӮӤӑӁӱӛӗԁԈӹӫԅӯӧӔӕ", (byte)68, 68);
               ZKM_STR_B[26] = NLoginCore_091.A("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŤŌŦŗƈŹŘŰŔƔŹ", (byte)68, 65);
               ZKM_STR_B[27] = NLoginCore_232.D("ӅӬӸӎӰӇӏӺӎӶӳӾӕӒӱӄԊӟӌԈԍӽӔӕ", (byte)68, 68);
               ZKM_STR_B[28] = NLoginCore_091.A("ŷŪŹŮŷŵƀłŐũƄŘŬƊƌŗŢŊŪűƋƓŚś", (byte)68, 65);
               ZKM_STR_B[29] = NLoginCore_559.E("ՖՈոՉԵնԿճմ\u0558լՔԼՄՏ\u0557ՂՆցտժ\u058cՓՔ", (byte)68, 69);
               ZKM_STR_B[30] = NLoginCore_092.A("ſſŸŷŐŁŵĽŽŷƅŸŽŊřůƂƀšŭƐƐŞƐƐŖƇŶŲŖŽžũŰƞŬſƦƎƘƧƢŢƨƩƟƁƛŧƭžƱƅƳźŻ", (byte)68, 65);
               ZKM_STR_B[31] = NLoginCore_241.A("ĹſźŵœųƄľũŤŦŢśƄňņŘŬŏŉƌƓŚś", (byte)68, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.C("ӚӥӗӚӈҵӺӝӁӳӤӉ", (byte)68, 67);
               ZKM_STR_B[1] = NLoginCore_446.A("ŴūśżŵŅźĽŔŨŕŖńŭũƉƎśƉŨƏƕƒƊŕšƖţƑŮŸƒƉƎƃŝűƜťťƑƑƊů", (byte)68, 65);
               ZKM_STR_B[2] = NLoginCore_173.C("ӏӺҲӇҸӷӏӯӟҾӑӚԀӯӜөԃӝӂӛԅӋԍӣӤԎӥӌөӴԘӹ", (byte)68, 67);
               ZKM_STR_B[3] = NLoginCore_138.D("ӐҲӪҵҷӾӿҷӷһӖӃԂӘӶӉӲԉԄӈӣӝӋӱӍӌӔԉөԐӥԕ", (byte)68, 68);
               ZKM_STR_B[4] = NLoginCore_092.F("զՙպՄռԹՈ՞լաՙՂմ՟ՖպցթէֈլզՓՔ", (byte)68, 70);
               ZKM_STR_B[5] = NLoginCore_453.B("ŉŉŵŹşƁƇƄŢƆżŦžƅŠƈŨŧƉŴŝƓŚś", (byte)68, 66);
               ZKM_STR_B[6] = NLoginCore_173.D("ӦӘҷӔӳӜӟӒԁӔӹӺӷӠӛԈөԁӹԋӹӻԇӭӞԑԋӾӭӗӧԃ", (byte)68, 68);
               ZKM_STR_B[7] = NLoginCore_183.F("ԯՒՇՓԳԾղ\u0558՟գՋՈ", (byte)68, 70);
               ZKM_STR_B[8] = NLoginCore_138.C("ӭӭӦӘӨӨҺӒӡҽӺӠӾҿԆԂӧԇԌӣӡӽӔӕ", (byte)68, 67);
               ZKM_STR_B[9] = NLoginCore_092.F("ղ՚ԸՅձՖ\u0558՜ՐփԼՓ\u0557ռսևՄճ\u0558Ոՙ՛շկՏըեՑձծօթց֕հ՚յ֔֔\u0557ո՚ջը", (byte)68, 70);
               ZKM_STR_B[10] = NLoginCore_453.E("ԲոՖԸԴո\u0558՚ԿԽԺՈ", (byte)68, 69);
               ZKM_STR_B[11] = NLoginCore_553.C("ӎӈӄӱӫӠӓӵӊҽӔӉ", (byte)68, 67);
               ZKM_STR_B[12] = NLoginCore_427.B("žŭşŶŰŵŲņƆĻŅŏ", (byte)68, 66);
               ZKM_STR_B[13] = NLoginCore_127.E("\u0530ԸՓԲՕՌըշբի\u0557Ո", (byte)68, 69);
               ZKM_STR_B[14] = NLoginCore_183.A("ųųŬŞŮŮŀŘŧŃƁŷŤƂŇņŻƐūƀƉšōşƈƖƎƏŧƆŖřƌŭơŽůƟƃŷƣƘũů", (byte)68, 65);
               ZKM_STR_B[15] = NLoginCore_427.B("ŹšĿŌŸŝşţŗƊŃŚŞƃƄƎŋźşŏŠťƉƉƙƓűƔƛŚŭƕűůƐƟśƘƜųŲƤƜů", (byte)68, 66);
               ZKM_STR_B[16] = NLoginCore_223.B("ŹšĿŌŸŝşţŗƊŁŃŤŇŗŜƌňżżŊŠšŮšũųťŹŽŷŨƁƜƣźƝƁƧƂƃŲƩƣūƠƟƮƫƲŮƔƲƍźŻ", (byte)68, 66);
               ZKM_STR_B[17] = NLoginCore_427.A("ňļƃŠŞĽŎšŃƊŻňţŉƆŪŰƄťſųŇŏōŸŦƄƆŕƊŖŬ", (byte)68, 65);
               ZKM_STR_B[18] = NLoginCore_183.F("ճԲկՐՉՉռՙԹՋՕՄ\u0557ՄՖՕ\u0558՟ըգ՛րոաՍղիռՕվձ\u0557\u058c֕։ղհ֘֓\u0557լ֔ջը", (byte)68, 70);
               ZKM_STR_B[19] = NLoginCore_575.B("ňżżŝŴŀŶŧƅƈƂłƊſŗŉũŐŢŰŞƓŚś", (byte)68, 66);
               ZKM_STR_B[20] = NLoginCore_397.B("ĹŔŎŚŏŎŰœœŸŅŏ", (byte)68, 66);
               ZKM_STR_B[21] = NLoginCore_173.E("ակձԼՇՔ\u0558Ֆթ\u0557ՂՈ", (byte)68, 69);
               ZKM_STR_B[22] = NLoginCore_521.A("ŨŗƃŚŴŏŹšŴŪŖŹŬƉŉŻŧŚƃŌƔŝŚś", (byte)68, 65);
               ZKM_STR_B[23] = NLoginCore_173.B("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŧŏŭŊƁƚŤŨƐŸƕŽœŞƏƚšŴƚžŨƂů", (byte)68, 66);
               ZKM_STR_B[24] = NLoginCore_553.B("ŵŋœļųŮœŐżƇŴŏ", (byte)68, 66);
               ZKM_STR_B[25] = NLoginCore_471.B("ŨŗƃŚŴŏŹšŴŪŖŷūřżšƑŊƊŐƃŭŚś", (byte)68, 66);
               ZKM_STR_B[26] = NLoginCore_223.E("՚գՍԳխԸ՛թ՝ՐխրՏՂ՜էՓրՇվպ\u0558ջ\u058cՊֆհփօդ֖֘ւ֛֚֓֞֘֏ո֡՝֡ը", (byte)68, 69);
               ZKM_STR_B[27] = NLoginCore_232.F("ՄիշՍկՆՎչՍյձդասՕփևՂպշցռՓՔ", (byte)68, 70);
               ZKM_STR_B[28] = NLoginCore_453.B("ŷŪŹŮŷŵƀłŐũƆŋŔũƃƋƀƉşŭŜƃŚś", (byte)68, 66);
               ZKM_STR_B[29] = NLoginCore_559.E("ՖՈոՉԵնԿճմ\u0558իԻջՙհւ՝\u058bցց\u0558ՖՓՔ", (byte)68, 69);
               ZKM_STR_B[30] = NLoginCore_173.E("ոոձհՉԺծԶնհվձնՃՒըջչ՚զ։։\u0557։։ՏրկիՏնշբթ֗եո֟և֑֛֠՚֦֓֗ւշյ֣ջ֡ց֜ճմ", (byte)68, 69);
               ZKM_STR_B[31] = NLoginCore_427.B("ĹſźŵœųƄľũŤŦŦņŠŉƉźŽūƌşƃŚś", (byte)68, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_324.D("ӂҵҸӆӮҽӿӐӼӽӯԁӱӚӠӚӠӾӢӜԊӚӹԅӿӑԓԎӞӗӷԄ", (byte)68, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.C("ӳөӌӝӐӷӗӡӛӣԄӝӰӑԃӽӛӳӻӪӿӷӏӰӥԊӬӣөӸԂӫ", (byte)68, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 67L;
      var1 ^= 5223237960150959786L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(17 + 52),
                     (byte)(25 + 58),
                     (byte)(14 + 33),
                     (byte)(41 + 26),
                     (byte)(49 + 17),
                     (byte)(61 + 6),
                     (byte)(41 + 6),
                     (byte)(60 + 20),
                     (byte)(61 + 14),
                     (byte)(32 + 35),
                     (byte)(6 + 77),
                     (byte)(39 + 14),
                     (byte)(68 + 12),
                     97,
                     (byte)(7 + 93),
                     (byte)(87 + 13),
                     105,
                     (byte)(45 + 65),
                     (byte)(7 + 96)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.B("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԋԠԦԣԛԙԡԄԦԳԤԮԴԃԃ", (byte)105, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   static {
      b();
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var1 instanceof NLoginCore_277) {
         NLoginCore_150.a(var1, NLoginCore_487.A);
      } else if (var2.length == j) {
         NLoginCore_150.a(var1, a(k, l ^ m));
      } else {
         try {
            String var3 = var2[o].toLowerCase(Locale.ENGLISH);
            int var5 = p;
            switch (var3.hashCode()) {
               case -804016428:
                  if (var3.equals(a(ab, ac ^ ad))) {
                     var5 = ae;
                  }
                  break;
               case -527659214:
                  if (var3.equals(a(q, r ^ s))) {
                     var5 = t;
                  }
                  break;
               case -284677234:
                  if (var3.equals(a(af, ag ^ ah))) {
                     var5 = ai;
                  }
                  break;
               case 138423663:
                  if (var3.equals(a(u & v, w))) {
                     var5 = x;
                  }
                  break;
               case 820330271:
                  if (var3.equals(a(y, z))) {
                     var5 = aa;
                  }
            }

            switch (var5) {
               case 0:
                  if (var2.length != aj) {
                     NLoginCore_150.a(var1, a(ak, al ^ am) + var3 + a(an & ao, ap));
                  } else {
                     ForceRegisterConfig var17 = this.a.a().a(var1, super.l, var2, var2[ar]);
                     if (var17 == null) {
                        return;
                     }

                     if (!var17.r()) {
                        NLoginCore_150.a(var1, a(as & at, au));
                     } else {
                        NLoginCore_150.a(var1, a(aw, ax) + var17.j() + a(ay & az, ba) + var17.a() + a(bb, bc ^ bd));
                     }
                  }
                  break;
               case 1:
                  if (var2.length != bf) {
                     NLoginCore_150.a(var1, a(bg, bh ^ bi) + var3 + a(bj & bk, bl));
                  } else {
                     ForceRegisterConfig var16 = this.a.a().a(var1, super.l, var2, var2[bn]);
                     if (var16 == null) {
                        return;
                     }

                     if (!var16.r()) {
                        NLoginCore_150.a(var1, a(bo, bp ^ bq));
                     } else if (!var16.s()) {
                        NLoginCore_150.a(var1, a(bs, bt ^ bu));
                     } else {
                        String var7 = var2[bw];
                        long var8 = System.currentTimeMillis();
                        boolean var10 = this.a.a().a(var16, var7);
                        long var11 = System.currentTimeMillis() - var8;
                        NLoginCore_150.a(var1, (var10 ? a(bx & by, bz) : a(ca, cb)) + a(cc & cd, ce) + NLoginCore_112.d(var11) + a(cf, cg));
                     }
                  }
                  break;
               case 2:
                  if (var2.length != ci) {
                     NLoginCore_150.a(var1, a(cj, ck ^ cl) + var3 + a(cm & cn, co));
                  } else {
                     NLoginCore_277 var15 = this.a.b().a(var2[cq]);
                     if (var15 == null) {
                        NLoginCore_150.a(var1, a(cr, cs));
                     } else {
                        NLoginCore_150.a(var1, this.a.a().b(var15).toString());
                     }
                  }
                  break;
               case 3:
                  if (var2.length != cv) {
                     NLoginCore_150.a(var1, a(cw, cx ^ cy) + var3 + a(cz, da ^ db));
                  } else {
                     NLoginCore_277 var14 = this.a.b().a(var2[dd]);
                     if (var14 == null) {
                        NLoginCore_150.a(var1, a(de, df ^ dg));
                     } else {
                        this.a.a().l(var14);
                        NLoginCore_150.a(var1, a(di, dj ^ dk));
                     }
                  }
                  break;
               case 4:
                  int var6 = BedrockFloodgateHook.aE = ((!BedrockFloodgateHook.aE ? dm : dn) != 0);
                  NLoginCore_150.a(var1, var6 != 0 ? a(var_do & dp, dq) : a(dr & ds, dt));
            }
         } catch (Exception var13) {
            NLoginCore_370.c(a(dv & dw, dx), var13);
            NLoginCore_150.a(var1, a(dz, ea ^ eb) + var13.getLocalizedMessage());
         }
      }
   }
}
