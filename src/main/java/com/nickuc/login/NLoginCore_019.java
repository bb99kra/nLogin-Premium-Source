package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_019 implements NLoginInterface_007 {
   private static long ca = Long.reverse(-648328185685566271L);
   private static int v = Integer.reverse(0);
   private static long bp = Long.reverse(8935141660703064064L);
   private static int ff = -1 >>> 217 | -1 << ~217 + 1;
   private static int t = 20 >>> 162 | 20 << -162;
   private static int di = 1179648 >>> 17 | 1179648 << -17;
   private static long dw = Long.reverse(-8430548341781783359L);
   private static int dh = Integer.reverse(268435456);
   private static long co = Long.reverse(-8430548341781783359L);
   private static int dc = -1 >>> 56 | -1 << ~56 + 1;
   private static int dn = Integer.reverse(939524096);
   private static int m = Integer.reverse(-1);
   private static int ed = Integer.reverse(67108864);
   private static int er = (36700160 >>> 180 | 36700160 << ~180 + 1) & -1;
   private static long ds = Long.reverse(-8430548341781783359L);
   private static int bz = Integer.reverse(-1);
   private static long n = Long.reverse(-648328185685566271L);
   private static int p = Integer.reverse(536870912);
   private static int aj = Integer.reverse(0);
   private static int db = (25600 >>> 106 | 25600 << ~106 + 1) & -1;
   private static int ay = (2 >>> 33 | 2 << ~33 + 1) & -1;
   private static int al = Integer.reverse(-1);
   private static int bf = Integer.reverse(268435456);
   private static int df = -1 >>> 71 | -1 << ~71 + 1;
   private static int az = 16384 >>> 205 | 16384 << ~205 + 1;
   private static int dk = Integer.reverse(-671088640);
   private static int ah = (-1 >>> 98 | -1 << -98) & -1;
   private static long fl = Long.reverse(-648328185685566271L);
   private static int cc = -1 >>> 145 | -1 << -145;
   private static int s = Integer.reverse(0);
   private static long d = Long.reverse(8935141660703064064L);
   private static int bn = 3670016 >>> 82 | 3670016 << ~82 + 1;
   private static long cr = Long.reverse(-8430548341781783359L);
   private static long r = Long.reverse(-648328185685566271L);
   private static int fa = (-2147483639 >>> 30 | -2147483639 << ~30 + 1) & -1;
   private static long c;
   private static long ai = Long.reverse(-648328185685566271L);
   private static int av = (0 >>> 167 | 0 << -167) & -1;
   private static long el = Long.reverse(-8430548341781783359L);
   private static long ad = Long.reverse(-8430548341781783359L);
   private static int fo = 10752 >>> 232 | 10752 << ~232 + 1;
   private static long ep = Long.reverse(-648328185685566271L);
   private static int br = (1006632960 >>> 218 | 1006632960 << -218) & -1;
   private static long eb = Long.reverse(8935141660703064064L);
   private static long cd = Long.reverse(-648328185685566271L);
   private static long cg = Long.reverse(-8430548341781783359L);
   private static int ci = 655360 >>> 15 | 655360 << ~15 + 1;
   private static int ey = '鐀' >>> 234 | 37888 << ~234 + 1;
   private static int cu = Integer.reverse(-402653184);
   private static int be = Integer.reverse(-536870912);
   private static long dd = Long.reverse(-648328185685566271L);
   private static long ae = Long.reverse(8935141660703064064L);
   private static int h = Integer.reverse(0);
   private static long ea = Long.reverse(-8430548341781783359L);
   private static int eo = Integer.reverse(-1);
   private static int dz = (15872 >>> 201 | 15872 << -201) & -1;
   private static long bo = Long.reverse(-8430548341781783359L);
   private static int ej = Integer.reverse(0);
   private static int cq = Integer.reverse(1744830464);
   private static long cz = Long.reverse(8935141660703064064L);
   private static int by = (68 >>> 34 | 68 << -34) & -1;
   private static long bw = Long.reverse(8935141660703064064L);
   private static int af = 0 >>> 233 | 0 << -233;
   private static int fk = Integer.reverse(-1811939328);
   private static String[] ZKM_STR_B = new String[fo];
   private static long g = Long.reverse(8935141660703064064L);
   private static int an = (0 >>> 55 | 0 << -55) & -1;
   private static long cp = Long.reverse(8935141660703064064L);
   private static long em = Long.reverse(8935141660703064064L);
   private static int bd = (100663296 >>> 152 | 100663296 << -152) & -1;
   private static long var_do = Long.reverse(-648328185685566271L);
   private static int ct = 3145728 >>> 179 | 3145728 << -179;
   private static int eh = Integer.reverse(0);
   private static int dr = (3712 >>> 135 | 3712 << ~135 + 1) & -1;
   private static int en = Integer.reverse(1140850688);
   private static int ag = 18432 >>> 203 | 18432 << ~203 + 1;
   private static int ei = Integer.reverse(0);
   private static int bb = Integer.reverse(536870912);
   private static long ef = Long.reverse(8935141660703064064L);
   private static int fh = Integer.reverse(335544320);
   private static long bs = Long.reverse(-8430548341781783359L);
   private static int cn = Integer.reverse(-1476395008);
   private static long fg = Long.reverse(-648328185685566271L);
   private static int l = (1572864 >>> 51 | 1572864 << ~51 + 1) & -1;
   private static long b = Long.reverse(-8430548341781783359L);
   private static int y = 0 >>> 93 | 0 << -93;
   private static int j = Integer.reverse(-1);
   private static long aa = Long.reverse(-8430548341781783359L);
   private static long bl = Long.reverse(-8430548341781783359L);
   private static int bx = 1 >>> 63 | 1 << -63;
   private static int a = 0 >>> 102 | 0 << -102;
   private static int cm = Integer.reverse(-1610612736);
   private static int du = 4 >>> 226 | 4 << -226;
   private static int eu = (1152 >>> 133 | 1152 << ~133 + 1) & -1;
   private static int dl = (-1 >>> 219 | -1 << -219) & -1;
   private static long aq = Long.reverse(-8430548341781783359L);
   private static int ba = Integer.reverse(-1073741824);
   private static int fd = (0 >>> 227 | 0 << ~227 + 1) & -1;
   private static long ab = Long.reverse(8935141660703064064L);
   private static int dy = Integer.reverse(0);
   private static int fe = Integer.reverse(-469762048);
   private static long cj = Long.reverse(-8430548341781783359L);
   private static int aw = Integer.reverse(-805306368);
   private static int z = Integer.reverse(-536870912);
   private static int e = (256 >>> 72 | 256 << -72) & -1;
   private static long dg = Long.reverse(-648328185685566271L);
   private static int ak = Integer.reverse(1342177280);
   private static int bc = 40 >>> 195 | 40 << ~195 + 1;
   private static long bv = Long.reverse(-8430548341781783359L);
   private static int eg = (0 >>> 181 | 0 << ~181 + 1) & -1;
   private static int ek = 553648128 >>> 248 | 553648128 << ~248 + 1;
   private static long fc = Long.reverse(8935141660703064064L);
   private static long ar = Long.reverse(8935141660703064064L);
   private static int cf = Integer.reverse(-939524096);
   private static long au = Long.reverse(8935141660703064064L);
   private static int ao = Integer.reverse(0);
   private static long dm = Long.reverse(-648328185685566271L);
   private static int ce = Integer.reverse(-1073741824);
   private static long dt = Long.reverse(8935141660703064064L);
   private static int bh = Integer.reverse(1342177280);
   private static long at = Long.reverse(-8430548341781783359L);
   private static long cw = Long.reverse(-648328185685566271L);
   private static long ez = Long.reverse(-648328185685566271L);
   private static int dv = 1966080 >>> 144 | 1966080 << -144;
   private static long et = Long.reverse(8935141660703064064L);
   private static int w = Integer.reverse(1610612736);
   private static int dq = (0 >>> 224 | 0 << -224) & -1;
   private static long fb = Long.reverse(-8430548341781783359L);
   private static long ch = Long.reverse(8935141660703064064L);
   private static int cv = Integer.reverse(-1);
   private static int bk = Integer.reverse(-1342177280);
   private static long bt = Long.reverse(8935141660703064064L);
   private static long am = Long.reverse(-648328185685566271L);
   private static int ap = 369098752 >>> 89 | 369098752 << ~89 + 1;
   private static long f = Long.reverse(-8430548341781783359L);
   private static long ee = Long.reverse(-8430548341781783359L);
   private static long bm = Long.reverse(8935141660703064064L);
   private static int fn = Integer.reverse(1409286144);
   private static long fi = Long.reverse(-648328185685566271L);
   private static int eq = 0 >>> 50 | 0 << -50;
   private static int as = (12 >>> 64 | 12 << ~64 + 1) & -1;
   private static long ck = Long.reverse(8935141660703064064L);
   private static int fm = 0 >>> 172 | 0 << -172;
   private static int bg = Integer.reverse(-1879048192);
   private static long ew = Long.reverse(8935141660703064064L);
   private static int bq = (33554432 >>> 89 | 33554432 << ~89 + 1) & -1;
   private static int bj = (0 >>> 78 | 0 << -78) & -1;
   private static int cb = Integer.reverse(1207959552);
   private static int ec = Integer.reverse(-1073741824);
   private static int cl = '耀' >>> 'M' | 32768 << ~77 + 1;
   private static int dj = Integer.reverse(1342177280);
   private static int bi = Integer.reverse(-805306368);
   private static int ax = 0 >>> 193 | 0 << -193;
   private static int q = -1 >>> 22 | -1 << -22;
   private static int de = (52 >>> 1 | 52 << -1) & -1;
   public static final NLoginCore_019 a = new NLoginCore_019();
   private static long cs = Long.reverse(8935141660703064064L);
   private static long cy = Long.reverse(-8430548341781783359L);
   private static int fj = Integer.reverse(Integer.MIN_VALUE);
   private static long x = Long.reverse(-648328185685566271L);
   private static long k = Long.reverse(-648328185685566271L);
   private static long ev = Long.reverse(-8430548341781783359L);
   private static int ac = (512 >>> 70 | 512 << ~70 + 1) & -1;
   private static int o = Integer.reverse(0);
   private static int bu = Integer.reverse(134217728);
   private static long dx = Long.reverse(8935141660703064064L);
   private static int dp = Integer.reverse(1073741824);
   private static int ex = Integer.reverse(Integer.MIN_VALUE);
   private static int da = Integer.reverse(-536870912);
   private static int i = Integer.reverse(1073741824);
   private static long u = Long.reverse(-648328185685566271L);
   private static String[] ZKM_STR_A = new String[fn];
   private static int cx = Integer.reverse(402653184);
   private static long es = Long.reverse(-8430548341781783359L);

   private static void b() {
      c = -8991038234222591791L;
      long var0 = c ^ -6066191187773137408L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(16 + 53),
               (byte)(13 + 70),
               (byte)(38 + 9),
               (byte)(54 + 13),
               (byte)(11 + 55),
               (byte)(54 + 13),
               (byte)(16 + 31),
               (byte)(15 + 65),
               (byte)(10 + 65),
               (byte)(46 + 21),
               83,
               (byte)(33 + 20),
               (byte)(26 + 54),
               (byte)(28 + 69),
               (byte)(53 + 47),
               (byte)(26 + 74),
               (byte)(18 + 87),
               (byte)(49 + 61),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.D("ѢэовѱѧжѕѤѝЯѾлѐѽьѭтпѐ҆уѷ҂҉ѫхѾўҍѤь", (byte)23, 68);
               ZKM_STR_B[1] = NLoginCore_451.B("đđãèõæúëîĊëõ", (byte)23, 66);
               ZKM_STR_B[2] = NLoginCore_241.D("ЫѯфѳЯѣєфѯѳиђҀѫѹэўѶѠпяшўѡ҄є҈ўҋљ҄ѧҊҋѪѲїѓѴѕҚюҎѳқѮҊҢѬқҎҒѸѰҪѢҠҬҬҌѮ҃҇ҨѪҧѰҰҥҢѫҬҴ҈ҫ҂", (byte)23, 68);
               ZKM_STR_B[3] = NLoginCore_201.E("ԚԍԬՊԦԠԺԡՎՁԲԛ", (byte)23, 69);
               ZKM_STR_B[4] = NLoginCore_092.D("лаЭііѢѢѩддѱѾѵёѺѷљёуиѽхѠѳѫ҅҆ѩҍѢѺ҅ѩѣѭѐ҂Ғҏ҈ѰѱѬјѽҡқҁҔѻѷѝҖѳѼҧҫѸҗҨѸқѼѫүҩҀҞѿѱ҆ҩѱүұҦѱҏѳҮӃҥѽҧұ҄ҙ҇ӉҨ҉ҌҹӀҥҞ", (byte)23, 68);
               ZKM_STR_B[5] = NLoginCore_427.E("ԷԷԉԎԛԌԠԑԔ\u0530ԑԛ", (byte)23, 69);
               ZKM_STR_B[6] = NLoginCore_521.B("đđãèõæúëîĊëõ", (byte)23, 66);
               ZKM_STR_B[7] = NLoginCore_530.A("ĐğĘĒĢēĨéĈøĄîĬđñĉķĆįôċĵĸđğĒęĊĭēöěĠŃĈŇŋĴŅğĄĥĮğĥģļďŎŖĭĖĬĮĲŇřŎŖĳŏŌœĸ", (byte)23, 65);
               ZKM_STR_B[8] = NLoginCore_384.F("ԚԍԬՊԦԠԺԡՎՁԲԛ", (byte)23, 70);
               ZKM_STR_B[9] = NLoginCore_387.D("тѯѦѱзѬцфѨхјѪпѵѲймѥќѣђќтѽѡѫѥіѪ҆ѢёѢҍғьѿ҄Ѵ҉ҋѮҏљўќѸҘѢ҅ѢѝѳѼѢҡѿҨѷҊ҇ҊҝҨѳѮѧҔҬҏҗҵҹғҘѷҚҽҫҽҀҾҏҦүӆҍҎ", (byte)23, 68);
               ZKM_STR_B[10] = NLoginCore_138.E("ԷԷԉԎԛԌԠԑԔ\u0530ԑԛ", (byte)23, 69);
               ZKM_STR_B[11] = NLoginCore_521.D("ѩѮѯЮѤѶсѤгкљт", (byte)23, 68);
               ZKM_STR_B[12] = NLoginCore_530.C("єщёѫїэљѰѸљмт", (byte)23, 67);
               ZKM_STR_B[13] = NLoginCore_076.B("øĀĨģûĊĢĚíĪĤïĦĄĊñòÿıĈĪóĴĆĨĊĪēþĿöăĖĵĿĴĉăġĄňŎĦđĻĝĽľŕđıĪĪģĠġ", (byte)23, 66);
               ZKM_STR_B[14] = NLoginCore_201.E("ՃԜԡԿԱԭԮ\u0530ԤԑՐԛ", (byte)23, 69);
               ZKM_STR_B[15] = NLoginCore_397.C("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐѻѾҌҖѯјѓ҃қѤҌҞғѼ҉ѵѰҔҠ҅ѳҟѲѣҧҝѬѾҧүѭҢ", (byte)23, 67);
               ZKM_STR_B[16] = NLoginCore_127.A("äçęģğöéĠğĂĀćĤåīăāăĶĳôăĀā", (byte)23, 65);
               ZKM_STR_B[17] = NLoginCore_553.B("øĀĨģûĊĢĚíĪĤïĦĄĊñòÿıĈĪóĴĆĨĊĪēþĿöăłĠăĄĲċķĢĬĿįŊŀĭőīĬīŋņśŒŜěŞėĘĘŋşğŏ", (byte)23, 66);
               ZKM_STR_B[18] = NLoginCore_575.A("ãáĝõċħċĆĜįħħééĂĭĩĆāĶĢĹĀā", (byte)23, 65);
               ZKM_STR_B[19] = NLoginCore_451.D("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐҐѬѣѩѵѱѮѐэѹҋѿѼѻѪҋҔѴҗҦғҢҒѾҨҊҕѾѥҍ҄Ѿ", (byte)23, 68);
               ZKM_STR_B[20] = NLoginCore_471.D("ЭѬпѩзшєфизїѲљѴюѿїјнђѧѠэю", (byte)23, 68);
               ZKM_STR_B[21] = NLoginCore_453.C("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐ҇џѾѮѱ҆ѮѯҏѵѶѮѧҒѹѭҜҀҡҘґҀѭѮ", (byte)23, 67);
               ZKM_STR_B[22] = NLoginCore_451.E("ՉԻՌԩԽԡԞՅՈՇՀԛ", (byte)23, 69);
               ZKM_STR_B[23] = NLoginCore_530.D("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐ҅҉Ѿѫ҃ѭѲѨѵѬѮ҆ѬҋѵѱҐҙѣѝѱҘѨҙҢҖҦҖѻҰҏҳ", (byte)23, 68);
               ZKM_STR_B[24] = NLoginCore_397.E("ՅԬԋԡԎԟԍԒՓԔԞԖՔՓԮԬԎՅՊ\u0557ԫԩԦԧ", (byte)23, 69);
               ZKM_STR_B[25] = NLoginCore_004.D("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐѻѾҌҖѯјѓ҃қѤҍ҇іѶѱѲҢңҏѹљҦѭѮ", (byte)23, 68);
               ZKM_STR_B[26] = NLoginCore_173.D("сѮѲбѴѷењвмѝт", (byte)23, 68);
               ZKM_STR_B[27] = NLoginCore_427.D("ѮфѳѕецхїцѐкќѸёїҁѸіќснѶэю", (byte)23, 68);
               ZKM_STR_B[28] = NLoginCore_471.A("ćĂôñėáúĩęČêúĬĮýëĵĎ÷ĦĹøďľùęėġċĸğė", (byte)23, 65);
               ZKM_STR_B[29] = NLoginCore_232.C("ЩѦЫгэЯѱєхэѧт", (byte)23, 67);
               ZKM_STR_B[30] = NLoginCore_091.F("ԂԿԄԌԦԈՊԭԞԦՀԛ", (byte)23, 70);
               ZKM_STR_B[31] = NLoginCore_397.E("ՊՌՁՋՊՉԡԝԊ\u0530ՖԲՅԖՇՍՓԵՆԪԹաաԢՏԵՓ՟ՀգԢը", (byte)23, 69);
               ZKM_STR_B[32] = NLoginCore_173.D("ўЫѩозвеѦгѬдт", (byte)23, 68);
               ZKM_STR_B[33] = NLoginCore_397.F("ԨԸԍԨԩՋԬՆԔՌԠԶՅԓՊԲԶ՜ԛՠՕՁ\u0530ՠԯՕՒԦՙ՚Ԡի", (byte)23, 70);
               ZKM_STR_B[34] = NLoginCore_575.A("ĦôĜãĂĞěęúĨëõ", (byte)23, 65);
               ZKM_STR_B[35] = NLoginCore_232.D("фѱѴаЩїјѐѤѵѻт", (byte)23, 68);
               ZKM_STR_B[36] = NLoginCore_138.C("ЭЫѩѮпѯѦѰѐѩѳт", (byte)23, 67);
               ZKM_STR_B[37] = NLoginCore_324.F("ԞԬԿԉԣԥԡԠԐՉՎԤՙԭԹ\u0557ՔՆԛՙԴՐՃ\u0557՜՟՟ԻՀզԡԷ", (byte)23, 70);
               ZKM_STR_B[38] = NLoginCore_027.C("сдѓѱэчѡшѵѨљт", (byte)23, 67);
               ZKM_STR_B[39] = NLoginCore_004.A("ÝýėàĆĚæĕĭĄĀõ", (byte)23, 65);
               ZKM_STR_B[40] = NLoginCore_027.A("àÞĜġòĢęģăĜĦõ", (byte)23, 65);
               ZKM_STR_B[41] = NLoginCore_451.A("ěĦáĤęĉøĥÿĠđĈèğīıēďïĆĶĵįĻĚķĐĖĘģķĒ", (byte)23, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.E("ԻԦԗԋՊՀԏԮԽԶԈ\u0557ԔԩՖԥՆԛԘԩ՟ԘԜԚՒՕԜՂԱ՝Քը", (byte)23, 69);
               ZKM_STR_B[1] = NLoginCore_232.A("ăĒĉĞāąçéàíĦõ", (byte)23, 65);
               ZKM_STR_B[2] = NLoginCore_559.F("ԄՈԝՌԈԼԭԝՈՌԑԫՙՄՒԦԷՏԹԘԨԡԷԺ՝ԭաԷդԲ՝ՀգդՃՋ\u0530ԬՍԮճԧէՌմՇգջՅմէիՑՉփԻչօօեՇ՜ՠցօՕփպիՙօզռֈծ՛", (byte)23, 70);
               ZKM_STR_B[3] = NLoginCore_241.C("Ѩьбѡежѵєњѝдт", (byte)23, 67);
               ZKM_STR_B[4] = NLoginCore_471.A("îãàĉĉĕĕĜççĤıĨĄĭĪČĄöëİøēĦĞĸĹĜŀĕĭĸĜĖĠăĵŅłĻģĤğċİŔŎĴŇĮĪĐŉĦįŚŞīŊśīŎįĞŢŜĳőĲĤĹŜĤŢŤřĤłĦšŶŘİŚŤĹŪŽżŴŖƁŋĺĻŹ", (byte)23, 65);
               ZKM_STR_B[5] = NLoginCore_173.E("ԧԌԎ\u0530ԱԝՈԱԒՀԞԛ", (byte)23, 69);
               ZKM_STR_B[6] = NLoginCore_004.A("ĢðûÛĉĚğğüûĪõ", (byte)23, 65);
               ZKM_STR_B[7] = NLoginCore_173.D("ѝѬѥџѯѠѵжѕхёлѹўоі҄ѓѼсј҂҅ўѬџѦїѺѠуѨѭҐѕҔҘҁҒѬёѲѻѬѲѰ҉ќқңѺѣѹѸџҚғҝѼҥҬҝ҆ҡ", (byte)23, 68);
               ZKM_STR_B[8] = NLoginCore_453.A("ö÷āģīóéêæęĮõ", (byte)23, 65);
               ZKM_STR_B[9] = NLoginCore_387.B("õĢęĤêğù÷ěøċĝòĨĥìïĘďĖąďõİĔĞĘĉĝĹĕĄĕŀņÿĲķħļľġłČđďīŋĕĸĕĐĦįĕŔĲśĪĽĺĽŐśĦġĚŇşłŊŨŬņŉŎŁĭŪųńŃőĸŚųńļŧĸŸŗşŴŻŕ", (byte)23, 66);
               ZKM_STR_B[10] = NLoginCore_173.C("ъэщШѭѤяѐзѳёт", (byte)23, 67);
               ZKM_STR_B[11] = NLoginCore_076.E("ԾԄՎԌԈԑԪՍՊԡԍԡԹԵԐԫԷՉՏ՛Ԯ՟Ԧԧ", (byte)23, 69);
               ZKM_STR_B[12] = NLoginCore_575.B("āĨÿãùöĢėģïČõ", (byte)23, 66);
               ZKM_STR_B[13] = NLoginCore_241.C("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐѣ҂ҌҁіѐѮёҕқѳ҈ҒҊ҉ѷҀѱѠ҄ѡѰѭѮ", (byte)23, 67);
               ZKM_STR_B[14] = NLoginCore_004.D("бэѰѰЯѰѥѕѕєљт", (byte)23, 68);
               ZKM_STR_B[15] = NLoginCore_223.D("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐѻѾҌҖѯјѓ҃қѤҌҞғѼ҉ѵѰҔҠ҅ѳҝѱҙѦ҆ѷңҞ҅Ѿҭ", (byte)23, 68);
               ZKM_STR_B[16] = NLoginCore_433.D("бдѦѰѬужѭѬяэоойѪѕѺѯёѱѼѠэю", (byte)23, 68);
               ZKM_STR_B[17] = NLoginCore_141.C("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐҏѭѐёѿј҄ѯѹҌѼҗҍѺҞѸѹѸҘғҨқѧ҅Ѹ҇ѻҍҢҢҲқ", (byte)23, 67);
               ZKM_STR_B[18] = NLoginCore_451.D("аЮѪтјѴјѓѩѼѶѰьѓњѮѺѓњѾѦѐэю", (byte)23, 68);
               ZKM_STR_B[19] = NLoginCore_241.D("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐҐѬѣѩѵѱѮѐэѹҋѿѼѻѪҋҔѴҗҦғңѴ҅҄ҥѶҝѪұҨң", (byte)23, 68);
               ZKM_STR_B[20] = NLoginCore_453.E("ԆՅԘՂԐԡԭԝԑԐ\u0530ՌԒԖԬՑՑԾԬՇԛ՟Ԧԧ", (byte)23, 69);
               ZKM_STR_B[21] = NLoginCore_173.F("ԞԦՎՉԡ\u0530ՈՀԓՐՊԕՌԪ\u0530ԗԘԥ\u0557ԮՐԙ՚ԬՎ\u0530ՐԹԤեԜԩՠԸ\u0557ՇՊ՟ՇՈըՎՏՂՈլզՕՐՆԻսրԻՏՔ՞՜ս՝վՔ\u0557դ", (byte)23, 70);
               ZKM_STR_B[22] = NLoginCore_183.D("ЩѥЧѧђѥѪЬлѝђѨџѻ҂ѫ҄тѼѓѲ҆эю", (byte)23, 68);
               ZKM_STR_B[23] = NLoginCore_387.C("хэѵѰшїѯѧкѷѱмѳёїопьѾѕѷрҁѓѵїѷѠыҌуѐ҅҉Ѿѫ҃ѭѲѨѵѬѮ҆ѬҋѵѱҐҙѣѝѱҗѸѽҪѷѥҝѮҎҍ҄", (byte)23, 67);
               ZKM_STR_B[24] = NLoginCore_451.D("ѬѓвшецдйѺлхѴѫѭҁѮѼоҀ҃т҆эю", (byte)23, 68);
               ZKM_STR_B[25] = NLoginCore_446.E("ԞԦՎՉԡ\u0530ՈՀԓՐՊԕՌԪ\u0530ԗԘԥ\u0557ԮՐԙ՚ԬՎ\u0530ՐԹԤեԜԩՔ\u0557եկՈԱԬ՜մԽզԲբԷՉլԴԹտԱպթձՙ՚ՁփյՓՙ՚\u058c", (byte)23, 69);
               ZKM_STR_B[26] = NLoginCore_433.C("ѢѝбѬѐѳѕёъфёџѲѝҀѕѻѾѴѵѰѶэю", (byte)23, 67);
               ZKM_STR_B[27] = NLoginCore_173.E("ՇԝՌԮԎԟԞ\u0530ԟԩԑՋԡԦԗՏ՝ԕ՟ԱԝՏԦԧ", (byte)23, 69);
               ZKM_STR_B[28] = NLoginCore_575.B("ćĂôñėáúĩęČêúĬĮýëĵĎ÷ĦĹòĳĥðİĴûĖĞČļ", (byte)23, 66);
               ZKM_STR_B[29] = NLoginCore_397.E("ԞԚԣԩԮԊԬՔԳՇՄԛ", (byte)23, 69);
               ZKM_STR_B[30] = NLoginCore_387.D("ѴѪуѪџЮддчѰёт", (byte)23, 68);
               ZKM_STR_B[31] = NLoginCore_446.E("ՊՌՁՋՊՉԡԝԊ\u0530ՖԲՅԖՇՍՓԵՆԪԹԡԵ՟ԼՁԣԻԦՙԩՌ՞ԪԪէՃԱդՈՇմմԻ", (byte)23, 69);
               ZKM_STR_B[32] = NLoginCore_397.C("ѪѓюѶпшјдѩгдт", (byte)23, 67);
               ZKM_STR_B[33] = NLoginCore_232.B("ĂĒçĂăĥĆĠîĦúĐğíĤČĐĶõĺįģĕùķĚİüįĤģĳ", (byte)23, 66);
               ZKM_STR_B[34] = NLoginCore_091.E("ԴԕՁԝՂԌՉՅՋՏՌԛ", (byte)23, 69);
               ZKM_STR_B[35] = NLoginCore_553.A("åąĂĨõáćīĮçġĮħĎĉðìĥČģóēĀā", (byte)23, 65);
               ZKM_STR_B[36] = NLoginCore_471.B("ÿĦñåĆāġùëďĄİĨĳĆĈĪħðęčĹĀā", (byte)23, 66);
               ZKM_STR_B[37] = NLoginCore_451.D("хѓѦаъьшчзѰѵыҀєѠѾѻѭтҀћѻѼшѝш҂ўўяѯѱ", (byte)23, 68);
               ZKM_STR_B[38] = NLoginCore_127.D("ѮчбѡсЪуїщыѻт", (byte)23, 68);
               ZKM_STR_B[39] = NLoginCore_446.A("ĖăĨóĜěĦĜĥİïõ", (byte)23, 65);
               ZKM_STR_B[40] = NLoginCore_091.A("ăòĈøąĂÞøĂĮġħĈĮēĬĈĦĤĘĢĩĀā", (byte)23, 65);
               ZKM_STR_B[41] = NLoginCore_387.F("ՁՌԇՊԿԯԞՋԥՆԷԮԎՅՑ\u0557ԹԵԕԬ՜ՐԘ\u0558ԖԢԻԳըԱՃԳ\u0558ԧՃկՇ\u0530ՌկանԵԻ", (byte)23, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_451.F("ԇԵԮԪԟԥԛՇԣԯԌՃՇԪՎ՛ԫԨԔԚԗ՟Ԧԧ", (byte)23, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.C("пюьѕясйвѴъђзьнѳѶєпѣѷѢуѨѠ҈щѵ҆ѡтћы", (byte)23, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -6066191187773137408L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(25 + 43),
                     (byte)(61 + 8),
                     (byte)(51 + 32),
                     (byte)(18 + 29),
                     67,
                     (byte)(32 + 34),
                     (byte)(18 + 49),
                     47,
                     (byte)(42 + 38),
                     (byte)(15 + 60),
                     (byte)(56 + 11),
                     (byte)(25 + 58),
                     (byte)(29 + 24),
                     (byte)(79 + 1),
                     (byte)(69 + 28),
                     (byte)(50 + 50),
                     (byte)(39 + 61),
                     (byte)(72 + 33),
                     (byte)(30 + 80),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(80 + 3)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.C("ѠѭѬЯѯѫѦѯѺѩжѴѸѱѴѺмߑ߄߈߇ߊ߉ߘߋ", (byte)24, 67));
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
   public String q() {
      return a(a, b ^ d);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      if (!NLoginCore_323.a(var3, NLoginCore_477.e.a(new Object[eh]))) {
         return (ei != 0);
      } else {
         String var4 = NLoginCore_477.e.a(new Object[ej]);
         switch (NLoginCore_104.l[var3.a().ordinal()]) {
            case 1:
            case 2:
               NLoginCore_171 var13 = var3.a(a(ek, el ^ em) + var4 + a(en & eo, ep));

               int var16;
               label89: {
                  try {
                     ResultSet var14 = var13.d();

                     while (var14.next()) {
                        String var15 = var14.getString(a(er, es ^ et));
                        if (var15.equals(a(eu, ev ^ ew))) {
                           var16 = ex;
                           break label89;
                        }
                     }
                  } catch (Throwable var12) {
                     if (var13 != null) {
                        try {
                           var13.close();
                        } catch (Throwable var10) {
                           var12.addSuppressed(var10);
                        }
                     }

                     throw var12;
                  }

                  if (var13 != null) {
                     var13.close();
                  }
                  break;
               }

               if (var13 != null) {
                  var13.close();
               }

               return (var16 != 0);
            case 3:
               NLoginCore_171 var5 = var3.a(a(ey, ez) + var4 + a(fa, fb ^ fc));

               int var8;
               label77: {
                  try {
                     ResultSet var6 = var5.d();

                     while (var6.next()) {
                        String var7 = var6.getString(a(fe & ff, fg));
                        if (a(fh, fi).equals(var7)) {
                           var8 = fj;
                           break label77;
                        }
                     }
                  } catch (Throwable var11) {
                     if (var5 != null) {
                        try {
                           var5.close();
                        } catch (Throwable var9) {
                           var11.addSuppressed(var9);
                        }
                     }

                     throw var11;
                  }

                  if (var5 != null) {
                     var5.close();
                  }
                  break;
               }

               if (var5 != null) {
                  var5.close();
               }

               return (var8 != 0);
            default:
               throw new IllegalArgumentException(a(fk, fl) + var3.a());
         }

         return (fm != 0);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_019.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.E("ԤՆՈԨՌիգչեԴղընհԹ՞րտշսշՌ", (byte)64, 69), NLoginCore_019.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࡉ࠼ࡀ\u083fࡂࡁࡐࡃӈ", (byte)64, 67) + var1 + NLoginCore_223.C("ү", (byte)64, 67) + var2.toString(), var4
         );
      }
   }

   @Override
   public void a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      NLoginCore_270 var4 = new NLoginCore_270();
      if (NLoginCore_150.j()) {
         NLoginCore_370.c(a(e, f ^ g));
         NLoginCore_370.c(a(i & j, k) + this.q() + a(l & m, n));
         NLoginCore_370.c(a(p & q, r));
         NLoginCore_370.c(a(t, u));
      } else {
         NLoginCore_370.c(a(w, x));
         NLoginCore_370.c(a(z, aa ^ ab) + this.q() + a(ac, ad ^ ae));
         NLoginCore_370.c(a(ag & ah, ai));
         NLoginCore_370.c(a(ak & al, am));
      }

      String var5 = NLoginCore_477.e.a(new Object[ao]);
      String var6 = var5 + a(ap, aq ^ ar);
      if (NLoginCore_323.a(var3, var6)) {
         this.a(var3, var5, var5 + a(as, at ^ au));
         this.a(var3, var6, var5);
      }

      this.a(var3, var5, var6);
      var2.a((av != 0));
      NLoginCore_219 var7 = var1.a();
      String[] var10000 = new String[aw];
      var10000[ax] = NLoginCore_436.a.getName();
      var10000[ay] = NLoginCore_436.b.getName();
      var10000[az] = NLoginCore_436.c.getName();
      var10000[ba] = NLoginCore_436.d.getName();
      var10000[bb] = NLoginCore_436.f.getName();
      var10000[bc] = NLoginCore_436.g.getName();
      var10000[bd] = NLoginCore_436.h.getName();
      var10000[be] = NLoginCore_436.i.getName();
      var10000[bf] = NLoginCore_436.j.getName();
      var10000[bg] = NLoginCore_436.k.getName();
      var10000[bh] = NLoginCore_436.l.getName();
      String[] var8 = var10000;
      var10000 = new String[bi];
      var10000[bj] = var7.a(a(bk, bl ^ bm), a(bn, bo ^ bp));
      var10000[bq] = var7.a(a(br, bs ^ bt), a(bu, bv ^ bw));
      var10000[bx] = var7.a(a(by & bz, ca), a(cb & cc, cd));
      var10000[ce] = var7.a(a(cf, cg ^ ch), a(ci, cj ^ ck));
      var10000[cl] = NLoginCore_436.f.getName();
      var10000[cm] = var7.a(a(cn, co ^ cp), a(cq, cr ^ cs));
      var10000[ct] = var7.a(a(cu & cv, cw), a(cx, cy ^ cz));
      var10000[da] = var7.a(a(db & dc, dd), a(de & df, dg));
      var10000[dh] = NLoginCore_436.j.getName();
      var10000[di] = NLoginCore_436.k.getName();
      var10000[dj] = NLoginCore_436.l.getName();
      String[] var9 = var10000;
      String var10001 = a(dk & dl, dm) + var5 + a(dn, var_do) + var6;
      Object[] var10002 = new Object[dp];
      var10002[dq] = String.join(a(dr, ds ^ dt), var8);
      var10002[du] = String.join(a(dv, dw ^ dx), var9);
      var3.a(String.format(var10001, var10002));
      NLoginCore_370.c(a(dz, ea ^ eb) + var4.a(TimeUnit.SECONDS, ec) + a(ed, ee ^ ef));
   }
}
