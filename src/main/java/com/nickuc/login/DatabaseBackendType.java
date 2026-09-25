package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DatabaseBackendType extends NLoginCore_098 {
   private static long gr = Long.reverse(6537120622797924026L);
   private static int cy = -1073741824 >>> 60 | -1073741824 << -60;
   private static long fi = Long.reverse(6537120622797924026L);
   private static int in = (-1 >>> 58 | -1 << -58) & -1;
   private static int dw = Integer.reverse(1462763520);
   private static long ge = Long.reverse(-5424439987498113350L);
   private static int ce = Integer.reverse(268435456);
   private static String[] ZKM_STR_A = new String[DatabaseBackendType.iu];
   private static int ir = Integer.reverse(0);
   private static int em = Integer.reverse(1744830464);
   private static long gx = Long.reverse(-5424439987498113350L);
   private static long df = Long.reverse(-5424439987498113350L);
   private static long au = Long.reverse(-1297036692682702848L);
   private static long cz = Long.reverse(-5424439987498113350L);
   private static int hm = Integer.reverse(603979776);
   private static long by = Long.reverse(-1297036692682702848L);
   private static final String Q = a(DatabaseBackendType.iy, DatabaseBackendType.iz ^ DatabaseBackendType.jc);
   private static int iy = 171966464 >>> 150 | 171966464 << ~150 + 1;
   private static long fc = Long.reverse(6537120622797924026L);
   private static long bk = Long.reverse(-5424439987498113350L);
   private static long ha = Long.reverse(-1297036692682702848L);
   private static int ij = Integer.reverse(-1);
   private static int bi = (1048576 >>> 82 | 1048576 << -82) & -1;
   private static long be = Long.reverse(-5424439987498113350L);
   private static int ie = Integer.reverse(-1);
   private static int fv = Integer.reverse(0);
   private static int ed = Integer.reverse(-1);
   private static long eo = Long.reverse(6537120622797924026L);
   private static long bs = Long.reverse(-1297036692682702848L);
   private static long at = Long.reverse(-5424439987498113350L);
   private static long cl = Long.reverse(-1297036692682702848L);
   private static int gv = (2 >>> 64 | 2 << ~64 + 1) & -1;
   private static int cv = Integer.reverse(Integer.MIN_VALUE);
   private static int gs = Integer.reverse(-2080374784);
   private static long ee = Long.reverse(6537120622797924026L);
   private static int hh = Integer.reverse(-1006632960);
   private static long gk = Long.reverse(6537120622797924026L);
   private static long bh = Long.reverse(-1297036692682702848L);
   private static int bn = (167772160 >>> 217 | 167772160 << ~217 + 1) & -1;
   private static int fa = (3328 >>> 199 | 3328 << -199) & -1;
   private static int dz = (318767104 >>> 184 | 318767104 << ~184 + 1) & -1;
   private static int cc = (0 >>> 115 | 0 << ~115 + 1) & -1;
   private static int dl = Integer.reverse(-1);
   private static int al = (524288 >>> 178 | 524288 << -178) & -1;
   private static long di = Long.reverse(6537120622797924026L);
   private static int iu = 2688 >>> 230 | 2688 << ~230 + 1;
   private static long ig = Long.reverse(6537120622797924026L);
   private static long ik = Long.reverse(6537120622797924026L);
   private static int im = 80 >>> 129 | 80 << -129;
   private static int de = (851968 >>> 16 | 851968 << ~16 + 1) & -1;
   private static long ab = Long.reverse(6537120622797924026L);
   private static int it = Integer.reverse(Integer.MIN_VALUE);
   private static int gd = 245760 >>> 141 | 245760 << ~141 + 1;
   private static long cq = Long.reverse(-1297036692682702848L);
   private static long dg = Long.reverse(-1297036692682702848L);
   private static long io = Long.reverse(6537120622797924026L);
   private static long dv = Long.reverse(-1297036692682702848L);
   private static int cb = Integer.reverse(0);
   private static int ea = (-1 >>> 63 | -1 << ~63 + 1) & -1;
   private static int ec = (160 >>> 99 | 160 << ~99 + 1) & -1;
   private static long eb = Long.reverse(6537120622797924026L);
   private static long ct = Long.reverse(-5424439987498113350L);
   private static int dx = 4608 >>> 232 | 4608 << -232;
   private static int fm = Integer.reverse(536870912);
   private static long dm = Long.reverse(6537120622797924026L);
   private static int fl = 3 >>> 192 | 3 << ~192 + 1;
   private static int dk = Integer.reverse(-268435456);
   private static int gw = (557056 >>> 238 | 557056 << ~238 + 1) & -1;
   private static long ez = Long.reverse(6537120622797924026L);
   private static int fz = Integer.reverse(-1207959552);
   private static int gm = 8 >>> 194 | 8 << ~194 + 1;
   private static int fw = (-1 >>> 7 | -1 << ~7 + 1) & -1;
   private static long hl = Long.reverse(6537120622797924026L);
   private static int gh = (126976 >>> 12 | 126976 << ~12 + 1) & -1;
   private static int fs = 67108864 >>> 122 | 67108864 << -122;
   private static int fd = 3538944 >>> 241 | 3538944 << -241;
   private static long ew = Long.reverse(-1297036692682702848L);
   private static int ho = Integer.reverse(-1);
   private static int gq = Integer.reverse(-1);
   private static int gj = -1 >>> 109 | -1 << -109;
   private static int ey = Integer.reverse(-1);
   private static long iz = Long.reverse(-5424439987498113350L);
   private static int iq = Integer.reverse(1073741824);
   private static String[] ZKM_STR_B = new String[DatabaseBackendType.ix];
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int hg = (1024 >>> 106 | 1024 << ~106 + 1) & -1;
   private static int dn = Integer.reverse(134217728);
   private static int z = (-1 >>> 226 | -1 << -226) & -1;
   private static int dd = 1073741824 >>> 157 | 1073741824 << -157;
   private static long bo = Long.reverse(6537120622797924026L);
   private static long ck = Long.reverse(-5424439987498113350L);
   private static long dp = Long.reverse(6537120622797924026L);
   private static long o;
   private static long hz = Long.reverse(6537120622797924026L);
   private static long dy = Long.reverse(6537120622797924026L);
   private static int hj = Integer.reverse(-1);
   private static long ga = Long.reverse(6537120622797924026L);
   private static int bz = Integer.reverse(Integer.MIN_VALUE);
   private static long el = Long.reverse(6537120622797924026L);
   private static long bm = Long.reverse(-1297036692682702848L);
   private static int gc = 0 >>> 87 | 0 << -87;
   private static int cj = Integer.reverse(-1879048192);
   private static long gu = Long.reverse(6537120622797924026L);
   private static long es = Long.reverse(-5424439987498113350L);
   private static int cs = Integer.reverse(-805306368);
   private static long ff = Long.reverse(6537120622797924026L);
   private static int gg = Integer.reverse(Integer.MIN_VALUE);
   private static long hp = Long.reverse(6537120622797924026L);
   private static int ex = Integer.reverse(-1744830464);
   private static int cg = Integer.reverse(-1);
   private static long gf = Long.reverse(-1297036692682702848L);
   private static long p = Long.reverse(-5424439987498113350L);
   private static long ev = Long.reverse(-5424439987498113350L);
   private static long q = Long.reverse(-1297036692682702848L);
   private static int bp = Integer.reverse(1610612736);
   private static int bu = Integer.reverse(-536870912);
   private static int dq = (142606336 >>> 87 | 142606336 << ~87 + 1) & -1;
   private static long ci = Long.reverse(6537120622797924026L);
   private static int fh = (28672 >>> 106 | 28672 << -106) & -1;
   private static int e = Integer.reverse(0);
   private static long cp = Long.reverse(-5424439987498113350L);
   private static int dh = 1879048192 >>> 219 | 1879048192 << -219;
   private static long ds = Long.reverse(-5424439987498113350L);
   private static int eu = Integer.reverse(402653184);
   private static int fr = 150994944 >>> 86 | 150994944 << ~86 + 1;
   private static int fp = (0 >>> 215 | 0 << ~215 + 1) & -1;
   private static int ic = 19 >>> 223 | 19 << ~223 + 1;
   private static int cr = 0 >>> 199 | 0 << ~199 + 1;
   private static long bv = Long.reverse(-5424439987498113350L);
   private static long br = Long.reverse(-5424439987498113350L);
   private static int bd = Integer.reverse(-1073741824);
   private static int ix = Integer.reverse(1409286144);
   private static long dc = Long.reverse(-1297036692682702848L);
   private static int ii = Integer.reverse(-469762048);
   private static long cu = Long.reverse(-1297036692682702848L);
   private static int var_do = Integer.reverse(-1);
   private static int co = 83886080 >>> 23 | 83886080 << -23;
   private static long et = Long.reverse(-1297036692682702848L);
   private static int ek = Integer.reverse(-1476395008);
   private static int eq = -2147483637 >>> 95 | -2147483637 << ~95 + 1;
   private static long jc = Long.reverse(-1297036692682702848L);
   private static int cm = -1 >>> 152 | -1 << ~152 + 1;
   private static int gn = Integer.reverse(67108864);
   private static int hy = (9472 >>> 136 | 9472 << ~136 + 1) & -1;

   private static void b() {
      o = 6729508125291912493L;
      long var0 = o ^ 2608193047232942673L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(66 + 3),
               83,
               (byte)(28 + 19),
               (byte)(10 + 57),
               (byte)(36 + 30),
               67,
               (byte)(12 + 35),
               (byte)(10 + 70),
               (byte)(20 + 55),
               (byte)(21 + 46),
               (byte)(72 + 11),
               (byte)(39 + 14),
               (byte)(25 + 55),
               (byte)(50 + 47),
               (byte)(3 + 97),
               (byte)(84 + 16),
               (byte)(61 + 44),
               (byte)(48 + 62),
               (byte)(96 + 7)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_138.A("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħŭĹŋļĩĺĪŪīŒŏ", (byte)48, 65);
               ZKM_STR_B[1] = NLoginCore_553.E("ԯԲՙԹՠժէՆԿիխՋՈՈհթՄՎբՖՏըԿՀ", (byte)48, 69);
               ZKM_STR_B[2] = NLoginCore_451.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħŭĹŋļĩĺĪŪīŒŏ", (byte)48, 66);
               ZKM_STR_B[3] = NLoginCore_433.B("ĘģŔĭēĻħıĜŋœĺťŀĶĿŜŀŗŧņūĲĳ", (byte)48, 66);
               ZKM_STR_B[4] = NLoginCore_530.A("ĤŅŊŉŒŞĝŇęŠĪĸĢģŜġĶłŇŃņŅĲĳ", (byte)48, 65);
               ZKM_STR_B[5] = NLoginCore_110.C("ҜҨҼҙӂҁӃӀӇҀҥҨҺҊ҇ӆҺӐҜҢҟӑҘҙ", (byte)48, 67);
               ZKM_STR_B[6] = NLoginCore_387.E("ԛԯդթԹԴԫՠժԫԺԢզղՅ՜՝\u0557էկՊըԿՀ", (byte)48, 69);
               ZKM_STR_B[7] = NLoginCore_223.D("ҊҫҰүҸӄ҃ҭѿӆґҨ҈Ҷҕӆӂҝ҂ҺӄқҘҙ", (byte)48, 68);
               ZKM_STR_B[8] = NLoginCore_127.B("ņĳŎēķĬōŝėĵŊłřĶĵŗĿĸĠĢśūĲĳ", (byte)48, 66);
               ZKM_STR_B[9] = NLoginCore_559.D("ғҊҝӀғӁҰӅҕҳҜҍ", (byte)48, 68);
               ZKM_STR_B[10] = NLoginCore_076.E("ՒԯԹԣթԳըա\u0558ԿԮԴ", (byte)48, 69);
               ZKM_STR_B[11] = NLoginCore_092.F("ԺԱՄէԺը\u0557լԼ՚ՃԴ", (byte)48, 70);
               ZKM_STR_B[12] = NLoginCore_183.D("ҩҩҾҊѹҕӁҼҿҾӂҍ", (byte)48, 68);
               ZKM_STR_B[13] = NLoginCore_553.F("ԹԮԷՄ\u0557ՋԪ՞ժաՂզԨԮըՕճՁԯՏԯՂԿՀ", (byte)48, 70);
               ZKM_STR_B[14] = NLoginCore_004.E("ՃՏգՀթԨժէծԧՌՏաԱԮխաշՃՉՆոԿՀ", (byte)48, 69);
               ZKM_STR_B[15] = NLoginCore_387.A("ĦĤħĬŋŝŒħğĜŘħ", (byte)48, 65);
               ZKM_STR_B[16] = NLoginCore_433.C("ҫҞӁҾҔүҰҼҲ҇ҕ҃ҒӂҦҜӈӉӈӒҌҩҞүӀҍӋӗӎӏҲӚӛӐҹӔӃҚҟӚӃӈӦҭ", (byte)48, 67);
               ZKM_STR_B[17] = NLoginCore_397.A("ĤŅŊŉŒŞĝŇęŠĪĸĢģŜġĶłŇŃņŅĲĳ", (byte)48, 65);
               ZKM_STR_B[18] = NLoginCore_223.C("Ѿ҉Һғѹҡҍҗ҂ұҹҠӋҦҜҥӂҦҽӍҬӑҘҙ", (byte)48, 67);
               ZKM_STR_B[19] = NLoginCore_127.F("ԛԯդթԹԴԫՠժԫԺԢզղՅ՜՝\u0557էկՊըԿՀ", (byte)48, 70);
               ZKM_STR_B[20] = NLoginCore_092.E("ԱՒ\u0557Ֆ՟իԪՔԦխԸՏԯ՝ԼխթՄԩաիՂԿՀ", (byte)48, 69);
               ZKM_STR_B[21] = NLoginCore_384.E("ԱՒ\u0557Ֆ՟իԪՔԦխԷՙՉԬԽ՜՟մՍԴԸՌծԸՌՓ՞կՀւնմ", (byte)48, 69);
               ZKM_STR_B[22] = NLoginCore_223.E("ՐՐեԱԠԼըգզեթԴ", (byte)48, 69);
               ZKM_STR_B[23] = NLoginCore_232.A("ĵŇŔńēĲĕėęĲōķġěĦįĚŒŚŢŕŉŪŜĽŎőŅŭůįķņŹŐĸťōŷşřŻŬŇ", (byte)48, 65);
               ZKM_STR_B[24] = NLoginCore_427.B("ŕŃśŒŅĸĶœīŀīŕŗİŏŦŃğŕĤĥśĲĳ", (byte)48, 66);
               ZKM_STR_B[25] = NLoginCore_324.F("ՖԦՏ\u0530Դ՛ՆՕԪծբհԾՐՆ՝՝լՁՀչՒԿՀ", (byte)48, 70);
               ZKM_STR_B[26] = NLoginCore_241.D("ҽѱҜҴүҾӃӀ҅ѽҸӇӁҊӃӃӂқӋӊһқҘҙ", (byte)48, 68);
               ZKM_STR_B[27] = NLoginCore_553.A("ĕĢĢĴŝŉŋĻŘŋŗřŎŃŝřĴĽťŜĹĵĲĳ", (byte)48, 65);
               ZKM_STR_B[28] = NLoginCore_027.D("ҔҵҐҐѿҝӀ҂ӅҰҔҍ", (byte)48, 68);
               ZKM_STR_B[29] = NLoginCore_387.E("ԝՂԽ\u0558ՅեՉՀԷԻԻԴ", (byte)48, 69);
               ZKM_STR_B[30] = NLoginCore_232.A("ŃŏĲŔĶŒōŀŒĸŘħ", (byte)48, 65);
               ZKM_STR_B[31] = NLoginCore_446.E("ՎզէԵՉ՚՞ԫ՝՛ԮԴ", (byte)48, 69);
               ZKM_STR_B[32] = NLoginCore_138.F("ԯԷՂԥԧ՚ԩՌԦ\u0558ԪԴ", (byte)48, 70);
               ZKM_STR_B[33] = NLoginCore_397.E("ԯԷՂԥԧ՚ԩՌԦ\u0558ԪԴ", (byte)48, 69);
               ZKM_STR_B[34] = NLoginCore_183.C("҈ҐқѾҀҳ҂ҥѿұ҃ҍ", (byte)48, 67);
               ZKM_STR_B[35] = NLoginCore_141.F("ԝԥՃթ՛՜ԩՃԧՃՃԴ", (byte)48, 70);
               ZKM_STR_B[36] = NLoginCore_453.D("ҬҊѷґҠҼҌҒҲӂӃҩҨ҅ҜҝӆҗҞӋҞӁҘҙ", (byte)48, 68);
               ZKM_STR_B[37] = NLoginCore_092.F("զԼ՞ըԧՆԩիՖ\u0557թՃՐԫ՜ԼյյԭՇԴՒԿՀ", (byte)48, 70);
               ZKM_STR_B[38] = NLoginCore_092.D("ҰҭҾҹѾҒҙғҮүҝҿңҵҝ҉ҡҽӉҠҋӁҘҙ", (byte)48, 68);
               ZKM_STR_B[39] = NLoginCore_127.A("ėĖĤēĜĲĐŎļŌęŐŏįņĽĺġĹĩŦŅĲĳ", (byte)48, 65);
               ZKM_STR_B[40] = NLoginCore_183.A("ňĖŏŃŏŝŕŎŘĸŠħ", (byte)48, 65);
               ZKM_STR_B[41] = NLoginCore_027.F("ԗԳՏԿՔԶՀՠԪԩԻ՞ԣկ՞Ճ՝ՈՈՉԴպՆ\u0558ՉԶՇԷշԸ՟՜", (byte)48, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħĥŇĩĺĽŚńĬŋŃŒ", (byte)48, 66);
               ZKM_STR_B[1] = NLoginCore_446.C("҈ҋҲҒҹӃӀҟҘӄӇӃҘҡҙ҈ҠӌҬӌҚӁҘҙ", (byte)48, 67);
               ZKM_STR_B[2] = NLoginCore_521.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħĤķĮĪħŤĥŎŊņň", (byte)48, 66);
               ZKM_STR_B[3] = NLoginCore_397.D("Ѿ҉Һғѹҡҍҗ҂ұҹӊҒӇҥӀҜңҘӄӒқҘҙ", (byte)48, 68);
               ZKM_STR_B[4] = NLoginCore_559.C("ҊҫҰүҸӄ҃ҭѿӆґҀҊҶҞҽҟӉҥҌҫӁҘҙ", (byte)48, 67);
               ZKM_STR_B[5] = NLoginCore_027.F("ՃՏգՀթԨժէծԧՎ՜ԣՠՆթԴՋՠՓՈԷՓըՊԶրլ՜Ֆ՝՞", (byte)48, 70);
               ZKM_STR_B[6] = NLoginCore_232.E("ԛԯդթԹԴԫՠժԫԸ\u0530զՑԩհէՊՆՈեըԿՀ", (byte)48, 69);
               ZKM_STR_B[7] = NLoginCore_027.E("ԱՒ\u0557Ֆ՟իԪՔԦխԷԨ\u0530ՂՌյՊճձՏՐՈըՍԸզէըաիհԾ", (byte)48, 69);
               ZKM_STR_B[8] = NLoginCore_183.E("ՓՀ՛ԠՄԹ՚ժԤՂ\u0558Կե՞ՄԦԬՑ\u0558հԳՂԿՀ", (byte)48, 69);
               ZKM_STR_B[9] = NLoginCore_183.B("ıĮđńŕĩŝŚŉŔŊĞťšİĸňŁŞŬłĵĲĳ", (byte)48, 66);
               ZKM_STR_B[10] = NLoginCore_575.B("ŔĲŎĶŎŜıśĮğŕőĴĝŀŁŢŊŋĽşĵĲĳ", (byte)48, 66);
               ZKM_STR_B[11] = NLoginCore_471.C("һҗѶҚҕҴҽӄӀґӆҀҜ҂ӌӊҬҘҊҊҜӑҘҙ", (byte)48, 67);
               ZKM_STR_B[12] = NLoginCore_076.C("Ѹ҇ѻѷҗ҂ѺҎӃҕұҡқҧҪҫҌҚұӑӌӑҘҙ", (byte)48, 67);
               ZKM_STR_B[13] = NLoginCore_232.A("ĬġĪķŊľĝőŝŔĲĝıŝľŗĞļūšľūĲĳ", (byte)48, 65);
               ZKM_STR_B[14] = NLoginCore_183.B("ĶłŖĳŜěŝŚšĚĿŔŤĽğŇħşţĵņŨŏşĨŏūŪťűįũ", (byte)48, 66);
               ZKM_STR_B[15] = NLoginCore_232.D("ҬѾҵѻҁҍҝѻ҅Җӆҍ", (byte)48, 68);
               ZKM_STR_B[16] = NLoginCore_553.B("ŅĸśŘĮŉŊŖŌġįĝĬŜŀĶŢţŢŬĦŃĸŉŚħťűŨũŌŴŪŢśıŒőŒıŻŶżŇ", (byte)48, 66);
               ZKM_STR_B[17] = NLoginCore_446.B("ĤŅŊŉŒŞĝŇęŠīĿĺŎţĺğŉšŇĹŅĲĳ", (byte)48, 66);
               ZKM_STR_B[18] = NLoginCore_446.B("ĘģŔĭēĻħıĜŋŒŁĲŁįğħŔūşļŅĲĳ", (byte)48, 66);
               ZKM_STR_B[19] = NLoginCore_575.D("Ѵ҈ҽӂҒҍ҄ҹӃ҄ғӈқҽҧһҡӂҰӐҳҫҘҙ", (byte)48, 68);
               ZKM_STR_B[20] = NLoginCore_201.E("ԱՒ\u0557Ֆ՟իԪՔԦխԹ՛ՠխԩՑգ՞ՊԴոՇժԺ՞խՋԺՠժՏԼ", (byte)48, 69);
               ZKM_STR_B[21] = NLoginCore_091.E("ԱՒ\u0557Ֆ՟իԪՔԦխԷՙՉԬԽ՜՟մՍԴԸՅՌնՙժՎԽյճԿո", (byte)48, 69);
               ZKM_STR_B[22] = NLoginCore_433.C("ҽѹҔӀҏҸҡ҄҅ҞѺӈҳҜӃҬҎҦҍҽӃӑҘҙ", (byte)48, 67);
               ZKM_STR_B[23] = NLoginCore_241.C("қҭҺҪѹҘѻѽѿҘҳҝ҇ҁҌҕҀҸӀӈһүӐӂңҴҷҫӓӕҕҝәҝӍӂҘӌӚӍҽӁҼҭ", (byte)48, 67);
               ZKM_STR_B[24] = NLoginCore_241.F("բՐը՟ՒՅՃՠԸՍԹԧԺխհՎ\u0530ՅյԷՄՂԿՀ", (byte)48, 70);
               ZKM_STR_B[25] = NLoginCore_232.C("үѿҨ҉ҍҴҟҮ҃ӇһҹҠҽ҄ҵҿӈӏҢҏҫҘҙ", (byte)48, 67);
               ZKM_STR_B[26] = NLoginCore_324.A("ŗċĶŎŉŘŝŚğėŒĽşŝľłŅğŤŕŖĵĲĳ", (byte)48, 65);
               ZKM_STR_B[27] = NLoginCore_553.B("ĕĢĢĴŝŉŋĻŘŋŔĕŠĴőļġĽĠŤŬŊŝŜũŞŌĥŴīŭŷ", (byte)48, 66);
               ZKM_STR_B[28] = NLoginCore_183.A("ĦĶĸĵıĩĹķŒŌġħ", (byte)48, 65);
               ZKM_STR_B[29] = NLoginCore_324.B("ŖĳōňĖĳėŉŞġōīŠĶţťĺœńľŘŅĲĳ", (byte)48, 66);
               ZKM_STR_B[30] = NLoginCore_575.F("ՀՇԹԟԳԺՄԬ\u0558ՖծխԩԽճՉՌԵՍձԵոԿՀ", (byte)48, 70);
               ZKM_STR_B[31] = NLoginCore_446.B("łőİđĵĺįŋĖŉŌŎŤĿŇŀĻńŘŝťĵĲĳ", (byte)48, 66);
               ZKM_STR_B[32] = NLoginCore_387.E("ՂԘՖ՞ՕԽՆբԶըԮԴ", (byte)48, 69);
               ZKM_STR_B[33] = NLoginCore_530.D("ѶҴҴҷӀӄӀҎҡҔҶҍ", (byte)48, 68);
               ZKM_STR_B[34] = NLoginCore_451.D("ѶҭѶҫҶҍҗҡӁҠҨҍ", (byte)48, 68);
               ZKM_STR_B[35] = NLoginCore_127.C("ҪѶҺҖҽұҹҥұҜҨҍ", (byte)48, 67);
               ZKM_STR_B[36] = NLoginCore_223.A("ņĤđīĺŖĦĬŌŜŝĽŝĠļĸŉĠřŖĬŅĲĳ", (byte)48, 65);
               ZKM_STR_B[37] = NLoginCore_173.E("զԼ՞ըԧՆԩիՖ\u0557թ՝ԯՠՑղԽՠհծաՒԿՀ", (byte)48, 69);
               ZKM_STR_B[38] = NLoginCore_471.C("ҰҭҾҹѾҒҙғҮүҞҪҒҹҭҗӀҧҙӊҍҫҘҙ", (byte)48, 67);
               ZKM_STR_B[39] = NLoginCore_575.D("ѽѼҊѹ҂ҘѶҴҢҲҀӊҨӁҨӋҚ҉ҞҽҩҫҘҙ", (byte)48, 68);
               ZKM_STR_B[40] = NLoginCore_397.F("դԮ՝ԞԵՈՇ\u0558ԺՠԷԴ", (byte)48, 70);
               ZKM_STR_B[41] = NLoginCore_446.C("ѰҌҨҘҭҏҙҹ҃҂ҔҷѼӈҷҜҶҡҡҢҍ҉ҳӄҩҧҠӃҩҼӅӞ", (byte)48, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.D("ҪґҬѳҜҁҁүӄқґҧҔҝҥҾҘҧҮӑӁқҘҙ", (byte)48, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.B("ĠŒŕĹİĴĝħĖŐŘěşŐťşĵňļŨšĨũĭĨľņİŏľņĲ", (byte)48, 66);
         }
      }
   }

   static {
      b();
   }

   public DatabaseBackendType(NLoginType_008 var1) {
      super(var1, NLoginCore_479.i, a(e, p ^ q), a(y & z, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(eu, ev ^ ew));
      if (this.r != null) {
         UUID var2 = NLoginCore_432.c(var1.getString(a(ex & ey, ez)));
         UUID var3 = NLoginCore_432.c(var1.getString(a(fa, fc)));
         String var4 = var1.getString(a(fd, ff));
         if (var4 != null) {
            String[] var5 = var4.split(a(fh, fi));
            if (var5.length != fl && var5.length != fm) {
               this.e(this.r, var4, null);
               return;
            }

            int var6 = var4.charAt(fp) == fr ? fs : fv;
            String var7 = var5[var6].toUpperCase(Locale.ENGLISH);
            int var9 = fw;
            switch (var7.hashCode()) {
               case -1850268089:
                  if (var7.equals(a(fz, ga))) {
                     var9 = gc;
                  }
                  break;
               case -1850265334:
                  if (var7.equals(a(gd, ge ^ gf))) {
                     var9 = gg;
                  }
                  break;
               case 1953930828:
                  if (var7.equals(a(gh & gj, gk))) {
                     var9 = gm;
                  }
            }

            switch (var9) {
               case 0:
               case 1:
                  var4 = a(gn & gq, gr) + var7 + a(gs, gu) + var5[var6 + gv] + a(gw, gx ^ ha) + var5[var6 + hg];
                  break;
               case 2:
                  var4 = a(hh & hj, hl) + var4.substring(var7.length() + var6);
                  break;
               default:
                  this.e(this.r, var4, var7);
                  return;
            }
         }

         String var13 = var1.getString(a(hm & ho, hp));
         String var14 = var1.getString(a(hy, hz));
         Timestamp var15 = null;
         Timestamp var8 = null;

         try {
            var15 = var1.getTimestamp(a(ic & ie, ig));
            var8 = var1.getTimestamp(a(ii & ij, ik));
         } catch (Exception var12) {
         }

         Timestamp var16 = var8;
         Timestamp var10 = var15;
         Consumer var11 = var3x -> {
            if (var14 != null) {
               var3x.a().b(var14);
            }

            var3x.a(var16 != null ? var16.getTime() : null, var10 != null ? var10.getTime() : null);
         };
         if (var3 != null) {
            this.a(this.r, var4, var13, var2, var3, var11);
         } else {
            this.a(this.r, var4, var13, var2, var11);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  DatabaseBackendType.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.D("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 68), DatabaseBackendType.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_521.B("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲӹԁӼӚԂԋԄӾӬƇ", (byte)90, 66) + var1 + NLoginCore_076.A("ŭ", (byte)90, 65) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 119L;
      var1 ^= 2608193047232942673L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(61 + 7),
                     (byte)(12 + 57),
                     83,
                     (byte)(24 + 23),
                     (byte)(21 + 46),
                     (byte)(2 + 64),
                     (byte)(21 + 46),
                     (byte)(6 + 41),
                     (byte)(77 + 3),
                     (byte)(27 + 48),
                     (byte)(60 + 7),
                     (byte)(77 + 6),
                     (byte)(24 + 29),
                     (byte)(8 + 72),
                     (byte)(89 + 8),
                     100,
                     (byte)(95 + 5),
                     (byte)(65 + 40),
                     (byte)(108 + 2),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.F("֎֛֚՝֝֙֔֝֨֗դ֢֦֢֟֨ժࣱࣹ࣒ࣺࣴःࣶࣼࣤ", (byte)111, 70));
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

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(ce & cg, ci), a(cj, ck ^ cl)).toUpperCase(Locale.ENGLISH);
      int var4 = cm;
      switch (var2.hashCode()) {
         case -1841605620:
            if (var2.equals(a(co, cp ^ cq))) {
               var4 = cr;
            }
            break;
         case 73844866:
            if (var2.equals(a(cs, ct ^ cu))) {
               var4 = cv;
            }
            break;
         case 1557169620:
            if (var2.equals(a(cy, cz ^ dc))) {
               var4 = dd;
            }
      }

      switch (var4) {
         case 0:
            File var12 = new File(this.b(), a(de, df ^ dg));
            this.d = NLoginCore_586.a(this.m, var12, new Properties());
            break;
         case 1:
         case 2:
            String var5 = var1.a(a(dh, di), a(dk & dl, dm));
            if (var5.isEmpty()) {
               throw new IllegalArgumentException(a(dn & var_do, dp));
            }

            int var6 = var1.a(a(dq, ds ^ dv), dw);
            String var7 = var1.b(a(dx, dy));
            String var8 = var1.b(a(dz & ea, eb));
            String var9 = var1.b(a(ec & ed, ee));
            List var10 = var1.k(a(ek, el));
            Properties var11 = new Properties();
            var10.forEach(var1x -> {
               String[] var2x = var1x.split(a(im & in, io));
               if (var2x.length == iq) {
                  var11.setProperty(var2x[ir], var2x[it]);
               }
            });
            if (a(em, eo).equals(var2)) {
               this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var7, var6, var5, var8, var9, var11));
            } else {
               this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var7, var6, var5, var8, var9, var11));
            }
            break;
         default:
            throw new IllegalArgumentException(a(eq, es ^ et) + var2);
      }
   }

   @Override
   public boolean isAvailable() {
      if (!super.isAvailable()) {
         return (cc != 0);
      } else {
         NLoginCore_219 var1 = this.a(a(al, at ^ au));
         return ((var1.p(a(bd, be ^ bh) != 0))
               && var1.p(a(bi, bk ^ bm))
               && var1.p(a(bn, bo))
               && var1.p(a(bp, br ^ bs))
               && var1.p(a(bu, bv ^ by))
            ? bz
            : cb);
      }
   }
}
