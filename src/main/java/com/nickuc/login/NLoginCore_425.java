package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_425 {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h,
   i,
   j,
   k,
   l;

   private static final String[] f;
   public final String cT;
   private final boolean aS;
   private final int[] ak;
   private static String[] ZKM_STR_A = new String[NLoginCore_425.ai];
   private static String[] ZKM_STR_B = new String[NLoginCore_425.aj];
   private static long c;
   private static int a = Integer.reverse(0);
   private static int b = 80 >>> 132 | 80 << ~132 + 1;
   private static int c = Integer.reverse(-1610612736);
   private static int d = (0 >>> 48 | 0 << -48) & -1;
   private static long e = Long.reverse(3374050117563992540L);
   private static int f = (1024 >>> 10 | 1024 << -10) & -1;
   private static long g = Long.reverse(-4984630790835648036L);
   private static long h = Long.reverse(-7782220156096217088L);
   private static int i = (0 >>> 27 | 0 << ~27 + 1) & -1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static double k = Double.longBitsToDouble(Long.reverse(192770L));
   private static double l = Double.longBitsToDouble(Long.reverse(18969730L));
   private static double m = Double.longBitsToDouble(Long.reverse(2796794754L));
   private static double n = Double.longBitsToDouble(Long.reverse(57731437634L));
   private static double o = Double.longBitsToDouble(Long.reverse(702789996866L));
   private static double p = Double.longBitsToDouble(Long.reverse(4166733122370L));
   private static int q = 0 >>> 233 | 0 << -233;
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static int s = (0 >>> 107 | 0 << -107) & -1;
   private static int t = 131072 >>> 17 | 131072 << ~17 + 1;
   private static int u = Integer.reverse(0);
   private static int v = Integer.reverse(805306368);
   private static int w = Integer.reverse(0);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int y = 8 >>> 162 | 8 << ~162 + 1;
   private static int z = Integer.reverse(-1073741824);
   private static int aa = (16777216 >>> 86 | 16777216 << ~86 + 1) & -1;
   private static int ab = (655360 >>> 177 | 655360 << ~177 + 1) & -1;
   private static int ac = (393216 >>> 48 | 393216 << -48) & -1;
   private static int ad = Integer.reverse(-536870912);
   private static int ae = (33554432 >>> 118 | 33554432 << ~118 + 1) & -1;
   private static int af = Integer.reverse(-1879048192);
   private static int ag = Integer.reverse(1342177280);
   private static int ah = Integer.reverse(-805306368);
   private static int ai = (16252928 >>> 243 | 16252928 << ~243 + 1) & -1;
   private static int aj = -1073741817 >>> 254 | -1073741817 << ~254 + 1;
   private static int ak = 4096 >>> 43 | 4096 << ~43 + 1;
   private static long al = Long.reverse(-4984630790835648036L);
   private static long am = Long.reverse(-7782220156096217088L);
   private static int an = Integer.reverse(0);
   private static int ao = Integer.reverse(-1073741824);
   private static long ap = Long.reverse(3374050117563992540L);
   private static int aq = Integer.reverse(-1610612736);
   private static int ar = Integer.reverse(0);
   private static int as = (100663296 >>> 89 | 100663296 << -89) & -1;
   private static int at = (1048576 >>> 20 | 1048576 << ~20 + 1) & -1;
   private static int au = Integer.reverse(-1610612736);
   private static int av = Integer.reverse(1073741824);
   private static int aw = Integer.reverse(268435456);
   private static int ax = Integer.reverse(-1073741824);
   private static int ay = 251658240 >>> 56 | 251658240 << ~56 + 1;
   private static int az = Integer.reverse(536870912);
   private static int ba = 2621440 >>> 241 | 2621440 << ~241 + 1;
   private static int bb = Integer.reverse(536870912);
   private static long bc = Long.reverse(-4984630790835648036L);
   private static long bd = Long.reverse(-7782220156096217088L);
   private static int be = 4194304 >>> 54 | 4194304 << -54;
   private static int bf = Integer.reverse(-1610612736);
   private static long bg = Long.reverse(3374050117563992540L);
   private static int bh = Integer.reverse(-1610612736);
   private static int bi = Integer.reverse(0);
   private static int bj = 20971520 >>> 21 | 20971520 << ~21 + 1;
   private static int bk = 64 >>> 70 | 64 << -70;
   private static int bl = 10485760 >>> 211 | 10485760 << -211;
   private static int bm = (262144 >>> 209 | 262144 << -209) & -1;
   private static int bn = Integer.reverse(2013265920);
   private static int bo = (196608 >>> 240 | 196608 << -240) & -1;
   private static int bp = 536870915 >>> 28 | 536870915 << ~28 + 1;
   private static int bq = (256 >>> 230 | 256 << ~230 + 1) & -1;
   private static int br = (1073741825 >>> 122 | 1073741825 << -122) & -1;
   private static int bs = Integer.reverse(1610612736);
   private static long bt = Long.reverse(3374050117563992540L);
   private static int bu = Integer.reverse(1073741824);
   private static int bv = (56 >>> 163 | 56 << ~163 + 1) & -1;
   private static int bw = Integer.reverse(-1);
   private static long bx = Long.reverse(3374050117563992540L);
   private static int by = (163840 >>> 143 | 163840 << -143) & -1;
   private static int bz = Integer.reverse(0);
   private static int ca = (81920 >>> 237 | 81920 << ~237 + 1) & -1;
   private static int cb = Integer.reverse(Integer.MIN_VALUE);
   private static int cc = Integer.reverse(671088640);
   private static int cd = Integer.reverse(1073741824);
   private static int ce = -1073741821 >>> 29 | -1073741821 << ~29 + 1;
   private static int cf = Integer.reverse(-1073741824);
   private static int cg = 1638400 >>> 111 | 1638400 << ~111 + 1;
   private static int ch = Integer.reverse(536870912);
   private static int ci = (40 >>> 191 | 40 << ~191 + 1) & -1;
   private static int cj = (Integer.MIN_VALUE >>> 124 | Integer.MIN_VALUE << ~124 + 1) & -1;
   private static long ck = Long.reverse(-4984630790835648036L);
   private static long cl = Long.reverse(-7782220156096217088L);
   private static int cm = 1572864 >>> 179 | 1572864 << ~179 + 1;
   private static int cn = Integer.reverse(-1879048192);
   private static int co = Integer.reverse(-1);
   private static long cp = Long.reverse(3374050117563992540L);
   private static int cq = Integer.reverse(-1610612736);
   private static int cr = (0 >>> 34 | 0 << -34) & -1;
   private static int cs = Integer.reverse(1342177280);
   private static int ct = Integer.reverse(Integer.MIN_VALUE);
   private static int cu = 15 >>> 159 | 15 << -159;
   private static int cv = (1024 >>> 73 | 1024 << ~73 + 1) & -1;
   private static int cw = Integer.reverse(1275068416);
   private static int cx = (50331648 >>> 24 | 50331648 << ~24 + 1) & -1;
   private static int cy = -268435456 >>> 186 | -268435456 << -186;
   private static int cz = Integer.reverse(536870912);
   private static int da = Integer.reverse(167772160);
   private static int db = 1342177280 >>> 251 | 1342177280 << -251;
   private static long dc = Long.reverse(-4984630790835648036L);
   private static long dd = Long.reverse(-7782220156096217088L);
   private static int de = Integer.reverse(536870912);
   private static int df = (11264 >>> 74 | 11264 << -74) & -1;
   private static long dg = Long.reverse(3374050117563992540L);
   private static int dh = (1310720 >>> 114 | 1310720 << ~114 + 1) & -1;
   private static int di = Integer.reverse(0);
   private static int dj = (768 >>> 136 | 768 << -136) & -1;
   private static int dk = Integer.reverse(Integer.MIN_VALUE);
   private static int dl = Integer.reverse(-1610612736);
   private static int dm = Integer.reverse(1073741824);
   private static int dn = Integer.reverse(1342177280);
   private static int var_do = Integer.reverse(-1073741824);
   private static int dp = (3840 >>> 136 | 3840 << ~136 + 1) & -1;
   private static int dq = Integer.reverse(536870912);
   private static int dr = (41943040 >>> 213 | 41943040 << ~213 + 1) & -1;
   private static int ds = (3072 >>> 200 | 3072 << ~200 + 1) & -1;
   private static long dt = Long.reverse(-4984630790835648036L);
   private static long du = Long.reverse(-7782220156096217088L);
   private static int dv = (640 >>> 135 | 640 << -135) & -1;
   private static int dw = Integer.reverse(-1342177280);
   private static long dx = Long.reverse(-4984630790835648036L);
   private static long dy = Long.reverse(-7782220156096217088L);
   private static int dz = 2560 >>> 137 | 2560 << ~137 + 1;
   private static int ea = (0 >>> 168 | 0 << ~168 + 1) & -1;
   private static int eb = 12582912 >>> 118 | 12582912 << -118;
   private static int ec = ('耀' >>> 'o' | 32768 << -111) & -1;
   private static int ed = Integer.reverse(-1610612736);
   private static int ee = 524288 >>> 18 | 524288 << -18;
   private static int ef = (671088640 >>> 250 | 671088640 << ~250 + 1) & -1;
   private static int eg = 1610612736 >>> 253 | 1610612736 << -253;
   private static int eh = Integer.reverse(-268435456);
   private static int ei = Integer.reverse(536870912);
   private static int ej = (5242880 >>> 242 | 5242880 << ~242 + 1) & -1;
   private static int ek = 448 >>> 101 | 448 << ~101 + 1;
   private static long el = Long.reverse(3374050117563992540L);
   private static int em = Integer.reverse(1610612736);
   private static int en = (491520 >>> 15 | 491520 << ~15 + 1) & -1;
   private static long eo = Long.reverse(-4984630790835648036L);
   private static long ep = Long.reverse(-7782220156096217088L);
   private static int eq = (160 >>> 165 | 160 << -165) & -1;
   private static int er = 0 >>> 154 | 0 << -154;
   private static int es = Integer.reverse(-1744830464);
   private static int et = (1048576 >>> 180 | 1048576 << -180) & -1;
   private static int eu = 12800 >>> 104 | 12800 << ~104 + 1;
   private static int ev = Integer.reverse(1073741824);
   private static int ew = (1677721600 >>> 120 | 1677721600 << ~120 + 1) & -1;
   private static int ex = Integer.reverse(-1073741824);
   private static int ey = 204800 >>> 42 | 204800 << ~42 + 1;
   private static int ez = Integer.reverse(536870912);
   private static int fa = Integer.reverse(796917760);
   private static int fb = 128 >>> 35 | 128 << ~35 + 1;
   private static int fc = -1 >>> 129 | -1 << ~129 + 1;
   private static long fd = Long.reverse(3374050117563992540L);
   private static int fe = Integer.reverse(-536870912);
   private static int ff = Integer.reverse(-2013265920);
   private static long fg = Long.reverse(3374050117563992540L);
   private static int fh = Integer.reverse(-1610612736);
   private static int fi = (0 >>> 3 | 0 << -3) & -1;
   private static int fj = Integer.reverse(1593835520);
   private static int fk = 128 >>> 167 | 128 << ~167 + 1;
   private static int fl = (512000 >>> 74 | 512000 << -74) & -1;
   private static int fm = (8388608 >>> 182 | 8388608 << ~182 + 1) & -1;
   private static int fn = Integer.reverse(2000683008);
   private static int fo = Integer.reverse(-1073741824);
   private static int fp = -1149239296 >>> 53 | -1149239296 << -53;
   private static int fq = Integer.reverse(536870912);
   private static int fr = Integer.reverse(596639744);
   private static int fs = (589824 >>> 207 | 589824 << ~207 + 1) & -1;
   private static long ft = Long.reverse(-4984630790835648036L);
   private static long fu = Long.reverse(-7782220156096217088L);
   private static int fv = Integer.reverse(268435456);
   private static int fw = Integer.reverse(-939524096);
   private static long fx = Long.reverse(-4984630790835648036L);
   private static long fy = Long.reverse(-7782220156096217088L);
   private static int fz = 167772160 >>> 153 | 167772160 << ~153 + 1;
   private static int ga = Integer.reverse(0);
   private static int gb = Integer.reverse(-1610612736);
   private static int gc = 268435456 >>> 92 | 268435456 << -92;
   private static int gd = Integer.reverse(1342177280);
   private static int ge = (2 >>> 96 | 2 << ~96 + 1) & -1;
   private static int gf = Integer.reverse(671088640);
   private static int gg = Integer.reverse(-1073741824);
   private static int gh = -1879048191 >>> 123 | -1879048191 << -123;
   private static int gi = Integer.reverse(536870912);
   private static int gj = Integer.reverse(637534208);
   private static int gk = (20 >>> 128 | 20 << -128) & -1;
   private static long gl = Long.reverse(-4984630790835648036L);
   private static long gm = Long.reverse(-7782220156096217088L);
   private static int gn = 1152 >>> 39 | 1152 << ~39 + 1;
   private static int go = Integer.reverse(-1476395008);
   private static long gp = Long.reverse(-4984630790835648036L);
   private static long gq = Long.reverse(-7782220156096217088L);
   private static int gr = Integer.reverse(-1610612736);
   private static int gs = 0 >>> 197 | 0 << -197;
   private static int gt = 640 >>> 70 | 640 << ~70 + 1;
   private static int gu = (64 >>> 70 | 64 << ~70 + 1) & -1;
   private static int gv = Integer.reverse(671088640);
   private static int gw = 16777216 >>> 119 | 16777216 << -119;
   private static int gx = Integer.reverse(1275068416);
   private static int gy = (393216 >>> 49 | 393216 << ~49 + 1) & -1;
   private static int gz = (5120 >>> 198 | 5120 << ~198 + 1) & -1;
   private static int ha = Integer.reverse(536870912);
   private static int hb = 15360 >>> 135 | 15360 << -135;
   private static int hc = 92274688 >>> 150 | 92274688 << -150;
   private static int hd = Integer.reverse(-1);
   private static long he = Long.reverse(3374050117563992540L);
   private static int hf = (-1610612736 >>> 124 | -1610612736 << -124) & -1;
   private static int hg = Integer.reverse(-402653184);
   private static long hh = Long.reverse(-4984630790835648036L);
   private static long hi = Long.reverse(-7782220156096217088L);
   private static int hj = 4 >>> 66 | 4 << -66;
   private static int hk = (83886080 >>> 152 | 83886080 << -152) & -1;
   private static int hl = 0 >>> 84 | 0 << ~84 + 1;
   private static int hm = Integer.reverse(318767104);
   private static int hn = (536870912 >>> 29 | 536870912 << ~29 + 1) & -1;
   private static int ho = Integer.reverse(159383552);
   private static int hp = 8192 >>> 140 | 8192 << -140;
   private static int hq = -2147483611 >>> 124 | -2147483611 << -124;
   private static int hr = Integer.reverse(-1073741824);
   private static int hs = Integer.reverse(79691776);
   private static int ht = Integer.reverse(536870912);
   private static int hu = Integer.reverse(398458880);
   private static int hv = Integer.reverse(402653184);
   private static int hw = Integer.reverse(-1);
   private static long hx = Long.reverse(3374050117563992540L);
   private static int hy = Integer.reverse(-805306368);
   private static int hz = Integer.reverse(-1744830464);
   private static long ia = Long.reverse(-4984630790835648036L);
   private static long ib = Long.reverse(-7782220156096217088L);
   private static int ic = 1280 >>> 168 | 1280 << -168;
   private static int id = 0 >>> 90 | 0 << ~90 + 1;
   private static int ie = 536870915 >>> 91 | 536870915 << -91;
   private static int var_if = Integer.reverse(Integer.MIN_VALUE);
   private static int ig = Integer.reverse(1593835520);
   private static int ih = Integer.reverse(1073741824);
   private static int ii = (16384000 >>> 175 | 16384000 << -175) & -1;
   private static int ij = 98304 >>> 15 | 98304 << ~15 + 1;
   private static int ik = Integer.reverse(2000683008);
   private static int il = 2 >>> 31 | 2 << -31;
   private static int im = (24576000 >>> 78 | 24576000 << -78) & -1;
   private static int in = (2621440 >>> 179 | 2621440 << -179) & -1;
   private static int io = 0 >>> 118 | 0 << -118;
   private static int ip = (106496 >>> 236 | 106496 << -236) & -1;
   private static long iq = Long.reverse(-4984630790835648036L);
   private static long ir = Long.reverse(-7782220156096217088L);
   private static int is = Integer.reverse(Integer.MIN_VALUE);
   private static int it = Integer.reverse(-671088640);
   private static long iu = Long.reverse(3374050117563992540L);
   private static int iv = 8 >>> 226 | 8 << ~226 + 1;
   private static int iw = Integer.reverse(939524096);
   private static long ix = Long.reverse(-4984630790835648036L);
   private static long iy = Long.reverse(-7782220156096217088L);
   private static int iz = Integer.reverse(-1073741824);
   private static int ja = Integer.reverse(-1207959552);
   private static long jb = Long.reverse(-4984630790835648036L);
   private static long jc = Long.reverse(-7782220156096217088L);
   private static int jd = Integer.reverse(536870912);
   private static int je = Integer.reverse(2013265920);
   private static int jf = Integer.reverse(-1);
   private static long jg = Long.reverse(3374050117563992540L);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   private double b(TimeUnit var1, long var2) {
      switch (NLoginCore_550.aj[var1.ordinal()]) {
         case 1:
            return var2 / k;
         case 2:
            return var2 / l;
         case 3:
            return var2 / m;
         case 4:
            return var2 / n;
         case 5:
            return var2 / o;
         case 6:
            return var2 / p;
         default:
            return var2;
      }
   }

   public String b(TimeUnit var1, int var2) {
      double var3 = this.b(var1, this.j());
      return this.b(var3) + NLoginCore_112.a(var3, var2);
   }

   private NLoginCore_425(String var3, boolean var4, int... var5) {
      int var6 = b;
      if (var5.length != c) {
         throw new IllegalArgumentException(a(d, e));
      } else {
         this.cT = var3;
         this.aS = var4;
         this.ak = var5;
      }
   }

   public boolean aS() {
      return NLoginCore_548.a()[this.ordinal()];
   }

   private static void b() {
      c = 4292532879227931485L;
      long var0 = c ^ -978743404745506585L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(12 + 57),
               83,
               (byte)(11 + 36),
               (byte)(53 + 14),
               (byte)(50 + 16),
               (byte)(4 + 63),
               47,
               (byte)(60 + 20),
               (byte)(25 + 50),
               (byte)(63 + 4),
               (byte)(71 + 12),
               (byte)(8 + 45),
               (byte)(78 + 2),
               (byte)(27 + 70),
               (byte)(82 + 18),
               (byte)(77 + 23),
               (byte)(36 + 69),
               (byte)(80 + 30),
               (byte)(31 + 72)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_092.E("֔\u0590նեՋ։էմծո։ը֊՟֡վմ֕գ֙դզսչ֨նառպքֆֲ֕նծյֻ֒չֶ֦֕֟ք", (byte)96, 69);
               ZKM_STR_B[1] = NLoginCore_530.C("ԟԊԽՌԜԨՐԭՍԨՒԝ", (byte)96, 67);
               ZKM_STR_B[2] = NLoginCore_397.A("ưƋƋƮƇƊƍƋƘƬſƠƗƁƀưƠƝƊǈƥƷƥƯƝƽƿƪǂǎƿƪ", (byte)96, 65);
               ZKM_STR_B[3] = NLoginCore_559.F("ղնյ֕\u0557ֈձչ\u0558կնՠ\u0590֣ոողփբև֞ղկհ", (byte)96, 70);
               ZKM_STR_B[4] = NLoginCore_127.B("ƠƓƵƼƗƕƩƞƻƽŸƽƥƔƓƁƳƽƪǋƪǄƣƩƪƎơƤǋƞƨǓ", (byte)96, 66);
               ZKM_STR_B[5] = NLoginCore_397.F("լ՟մգօ֕թօևՙը֝֓\u0558յճհ֞բն֖֘կհ", (byte)96, 70);
               ZKM_STR_B[6] = NLoginCore_091.A("ƧơƴƮƩƝƾƾƜƓƮƾƲƑżƸƞƢƆŽƶƥƒƓ", (byte)96, 65);
               ZKM_STR_B[7] = NLoginCore_201.D("ԝԤԼԑԿԮԠԣՅԤԓԝ", (byte)96, 68);
               ZKM_STR_B[8] = NLoginCore_397.C("ԣԈԏՃԎՒՁԌԨՌԹԐՔՑԔ\u0558ԗՒՔԷԚԻԨԩ", (byte)96, 67);
               ZKM_STR_B[9] = NLoginCore_127.F("ղլՠՊ֘ք֖֖՛Քիդ", (byte)96, 70);
               ZKM_STR_B[10] = NLoginCore_433.A("ƦŶƔƩƎƧŽƳŹǁƎƞƻƗơƽǁƂƟƆǇƕƒƓ", (byte)96, 65);
               ZKM_STR_B[11] = NLoginCore_324.B("ƌŰŰŵŹƐƚƼưƸǀƇ", (byte)96, 66);
               ZKM_STR_B[12] = NLoginCore_076.C("ԷԢԫԩՌՍՎՔԵԍԷԬԬԍԼԾԳԷԮՊՎՑԨԩ", (byte)96, 67);
               ZKM_STR_B[13] = NLoginCore_091.F("֒֊ֆփՑ֖֓֏֑ն՚դ", (byte)96, 70);
               ZKM_STR_B[14] = NLoginCore_521.C("ԸԘՑԺԨԥՇՂԏԠԎՒԩԼՇԨԼԞԴԻԻՑԨԩ", (byte)96, 67);
               ZKM_STR_B[15] = NLoginCore_138.D("ԆՀԈՃՏԪԦԯՔԢ\u0530ԝ", (byte)96, 68);
               ZKM_STR_B[16] = NLoginCore_110.B("ƢƂƻƤƒƏƱƬŹƊƂưƮƾƯƲƃƀƲƸǃƘƌƨǄǊƊƲǔǖǂǑ", (byte)96, 66);
               ZKM_STR_B[17] = NLoginCore_110.C("ԺՆԉԈՉ\u0530ՎԽՂՕԠԙ՚Ԛԗ՜՛Դ՝ԡ՟ՑԨԩ", (byte)96, 67);
               ZKM_STR_B[18] = NLoginCore_092.F("դ֏֔ՕՒՔե֒կը֟ղ֍ջնչ֤֖֓֓՛ղկհ", (byte)96, 70);
               ZKM_STR_B[19] = NLoginCore_521.D("Ն\u0530ՇՇԻԤԢԢՍՂԏԝ", (byte)96, 68);
               ZKM_STR_B[20] = NLoginCore_530.D("ԝՈՍԎԋԍԞՋԨԡՙ\u0530ԨՎ՝ԕԭԪԜԼՑԫԨԩ", (byte)96, 68);
               ZKM_STR_B[21] = NLoginCore_384.F("օզցփՙ։գ֝ղղտդ", (byte)96, 70);
               ZKM_STR_B[22] = NLoginCore_138.F("ՓՈՠՠ֕ւ֏֛֙\u0590\u058b֚֒֟ՠդ֚ե֒֨ղ֘կհ", (byte)96, 70);
               ZKM_STR_B[23] = NLoginCore_384.A("ŶůƨƱƔŽƭƝƑƽŽƇ", (byte)96, 65);
               ZKM_STR_B[24] = NLoginCore_446.C("ԈԻԊՅԩԞՊԽՆՌԒՙՆԧԜՈԷԲԞԳ\u0557ԱՃՖՆԯՂժզԼԵխ", (byte)96, 67);
               ZKM_STR_B[25] = NLoginCore_324.E("ա՟։ըև։խ֗է֖֙դ", (byte)96, 69);
               ZKM_STR_B[26] = NLoginCore_324.A("ƆƱƑƤŶƒƩƠŽƎƚƇ", (byte)96, 65);
               ZKM_STR_B[27] = NLoginCore_446.B("ŲƱƃƎżƎƛƠƜƲƖƇ", (byte)96, 66);
               ZKM_STR_B[28] = NLoginCore_446.E("բլ֑ղլքզ\u058c՚՝֝դ", (byte)96, 69);
               ZKM_STR_B[29] = NLoginCore_433.B("ƂƕƧƨƖƝŵƭƙƷƚƇ", (byte)96, 66);
               ZKM_STR_B[30] = NLoginCore_433.A("ƸƊƙƑƈųƿƊƞƴƒƇ", (byte)96, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.F("֔\u0590նեՋ։էմծո։ը֊՟֡վմ֕գ֙դզսչ֨նառպքֆ֕ց֭֮֩ֆշֱ֎ֽչ\u058bք", (byte)96, 70);
               ZKM_STR_B[1] = NLoginCore_092.D("ԘՀԥԜՂՀԐՄԧԨԏԝ", (byte)96, 68);
               ZKM_STR_B[2] = NLoginCore_173.B("ưƋƋƮƇƊƍƋƘƬſƠƗƁƀưƠƝƊǈƥƪƣƢƏƲƟƽǑǌǐƳ", (byte)96, 66);
               ZKM_STR_B[3] = NLoginCore_223.E("ղնյ֕\u0557ֈձչ\u0558կնխ֕րպ֑խ՝ռդբղկհ", (byte)96, 69);
               ZKM_STR_B[4] = NLoginCore_092.A("ƠƓƵƼƗƕƩƞƻƽŸƽƥƔƓƁƳƽƪǋƪƻƝưƌƹƬƦơǇƕǘ", (byte)96, 65);
               ZKM_STR_B[5] = NLoginCore_173.D("ԥԘԭԜԾՎԢԾՀԒԠԧ՛ՅԼ՛ԨՋԾԗԚաԨԩ", (byte)96, 68);
               ZKM_STR_B[6] = NLoginCore_173.B("ƧơƴƮƩƝƾƾƜƓƬźƾƾƖƟſǄƄƹƋƻƒƓ", (byte)96, 66);
               ZKM_STR_B[7] = NLoginCore_241.A("ƘűƅƺƩƬƫƩƿŷƁƞƺưƒƂƕǃǇƤƔƻƒƓ", (byte)96, 65);
               ZKM_STR_B[8] = NLoginCore_092.E("ժՏՖ֊Օ֙ֈՓկ֓րտ։֍֍֗խւ֝ոքղկհ", (byte)96, 69);
               ZKM_STR_B[9] = NLoginCore_173.F("֊գտ֍֙մ֗՚հ֛֕\u0557ՠս֖֖ճ\u0558և՞յ֘կհ", (byte)96, 70);
               ZKM_STR_B[10] = NLoginCore_433.C("ԼԌԪԿԤԽԓՉԏ\u0557ԤՖՔԛՅԧՙԽԹԳԜԻԨԩ", (byte)96, 67);
               ZKM_STR_B[11] = NLoginCore_446.D("ԜԸԏԫՐԠՐՍԵԗՎԝ", (byte)96, 68);
               ZKM_STR_B[12] = NLoginCore_201.F("վթղհ֛֓֔֕ռՔվ֞֎իկ֔եքվ֦֢ղկհ", (byte)96, 70);
               ZKM_STR_B[13] = NLoginCore_241.E("փղ֎ՠչւ\u058cօ֎Քյչ֢ց֖֙ր֚֞֝֗֨կհ", (byte)96, 69);
               ZKM_STR_B[14] = NLoginCore_027.E("տ՟֘ցկլ֎։ՖէՑ֘ծխ֛֝ՠձ֨։զօշն֚֮֠ոխցֈ֝", (byte)96, 69);
               ZKM_STR_B[15] = NLoginCore_397.F("՝՞թ\u0590ՙճ֓ճվ֙֍դ", (byte)96, 70);
               ZKM_STR_B[16] = NLoginCore_384.F("տ՟֘ցկլ֎։Ֆէ՟֍\u058b֛\u058c֏ՠ՝֏֕֠յյք֣ւկ\u0590օխհժ", (byte)96, 70);
               ZKM_STR_B[17] = NLoginCore_384.B("ƤưųŲƳƚƸƧƬƿƊƝƐƂƺơƐƂƼƆƬƻƒƓ", (byte)96, 66);
               ZKM_STR_B[18] = NLoginCore_427.A("ƇƲƷŸŵŷƈƵƒƋǃƷƭƢƚǀƀƃǃƜƺƞƝǀǅƑƐƊƿƟǄƯ", (byte)96, 65);
               ZKM_STR_B[19] = NLoginCore_575.C("ԦՈՋԈԏԯԳԓԭԥՁԮԙԺՏ՜Լ՜ԽԽԺՑԨԩ", (byte)96, 67);
               ZKM_STR_B[20] = NLoginCore_471.F("դ֏֔ՕՒՔե֒կը֞ՙա֡\u0590֎֚֓մ֚֔֞փ֭ֈտսֱգժ֎֒", (byte)96, 70);
               ZKM_STR_B[21] = NLoginCore_183.E("ծր֒֕խ֊Ւ֎զսևվվ֢\u0590՟օղ֛֞֓ղկհ", (byte)96, 69);
               ZKM_STR_B[22] = NLoginCore_183.D("ԌԁԙԙՎԻՈՒՔՉՃԭՆԱԵԮՈԳԒԾՋաԨԩ", (byte)96, 68);
               ZKM_STR_B[23] = NLoginCore_553.D("ԼԍԥԯՐՐԲԢՋՐՂԝ", (byte)96, 68);
               ZKM_STR_B[24] = NLoginCore_397.F("ՏւՑ\u058cհե֑ք֍֓ՙ֠֍ծգ֏վչեպ֞ոնթ֍֫։ֱ֧լժձ", (byte)96, 70);
               ZKM_STR_B[25] = NLoginCore_027.F("Վրխ\u058c\u0590֔լժ\u058b՜ճպթռյճմհ՟ցՠւկհ", (byte)96, 70);
               ZKM_STR_B[26] = NLoginCore_092.C("ԎԠԪԛԧԋԨԎՀՀԨԝ", (byte)96, 67);
               ZKM_STR_B[27] = NLoginCore_138.A("űŶźƓƖŻƬƧƱƜƴƇ", (byte)96, 65);
               ZKM_STR_B[28] = NLoginCore_521.A("ƙƍŷƗƇƳƞŽƚƞƴƇ", (byte)96, 65);
               ZKM_STR_B[29] = NLoginCore_575.C("ԘԤԱԛԜՉԯԨՖԵԗԝ", (byte)96, 67);
               ZKM_STR_B[30] = NLoginCore_138.B("ƐƘƐƲƝƋƻƘƽƀƴƇ", (byte)96, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.C("ՏԬԞՀԨԣԦԨՍՔՇԶՙԣԷԕՑՓԜՁ՚ՑԨԩ", (byte)96, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.A("ŮŹƬƒƉƒƮƍƬƢƗŻƙżƹƢƘƺǄƃƶƭǀƈƉƌǍǈƲƐƨƪ", (byte)96, 65);
         }
      }
   }

   public long[] b() {
      return NLoginCore_548.a()[this.ordinal()];
   }

   public long j() {
      if (this.F()) {
         return 0L;
      } else {
         long var1 = 0L;
         long[] var3 = this.b();
         long[] var4 = var3;
         int var5 = var3.length;

         for (int var6 = q; var6 < var5; var6++) {
            long var7 = var4[var6];
            var1 += var7;
         }

         return var1 / (this.aS() ? var3.length : this.y());
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_425.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.F("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 70), NLoginCore_425.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_530.B("ƒƟƞšơƝƘơƬƛŨƦƪƣƦƬŮӨӜԇԀӷԋԋԄӼӱӾӾӯƇ", (byte)88, 66) + var1 + NLoginCore_110.B("ũ", (byte)88, 66) + var2.toString(), var4);
      }
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(ak, al ^ am);
      int var10003 = an;
      String var10004 = a(ao, ap);
      int[] var10005 = new int[aq];
      var10005[ar] = as;
      var10005[at] = au;
      var10005[av] = aw;
      var10005[ax] = ay;
      var10005[az] = ba;
      a = new NLoginCore_425(var10004, var10005);
      var10002 = a(bb, bc ^ bd);
      var10003 = be;
      var10004 = a(bf, bg);
      var10005 = new int[bh];
      var10005[bi] = bj;
      var10005[bk] = bl;
      var10005[bm] = bn;
      var10005[bo] = bp;
      var10005[bq] = br;
      b = new NLoginCore_425(var10004, var10005);
      var10002 = a(bs, bt);
      var10003 = bu;
      var10004 = a(bv & bw, bx);
      var10005 = new int[by];
      var10005[bz] = ca;
      var10005[cb] = cc;
      var10005[cd] = ce;
      var10005[cf] = cg;
      var10005[ch] = ci;
      c = new NLoginCore_425(var10004, var10005);
      var10002 = a(cj, ck ^ cl);
      var10003 = cm;
      var10004 = a(cn & co, cp);
      var10005 = new int[cq];
      var10005[cr] = cs;
      var10005[ct] = cu;
      var10005[cv] = cw;
      var10005[cx] = cy;
      var10005[cz] = da;
      d = new NLoginCore_425(var10004, var10005);
      var10002 = a(db, dc ^ dd);
      var10003 = de;
      var10004 = a(df, dg);
      var10005 = new int[dh];
      var10005[di] = dj;
      var10005[dk] = dl;
      var10005[dm] = dn;
      var10005[var_do] = dp;
      var10005[dq] = dr;
      e = new NLoginCore_425(var10004, var10005);
      var10002 = a(ds, dt ^ du);
      var10003 = dv;
      var10004 = a(dw, dx ^ dy);
      var10005 = new int[dz];
      var10005[ea] = eb;
      var10005[ec] = ed;
      var10005[ee] = ef;
      var10005[eg] = eh;
      var10005[ei] = ej;
      f = new NLoginCore_425(var10004, var10005);
      var10002 = a(ek, el);
      var10003 = em;
      var10004 = a(en, eo ^ ep);
      var10005 = new int[eq];
      var10005[er] = es;
      var10005[et] = eu;
      var10005[ev] = ew;
      var10005[ex] = ey;
      var10005[ez] = fa;
      g = new NLoginCore_425(var10004, var10005);
      var10002 = a(fb & fc, fd);
      var10003 = fe;
      var10004 = a(ff, fg);
      var10005 = new int[fh];
      var10005[fi] = fj;
      var10005[fk] = fl;
      var10005[fm] = fn;
      var10005[fo] = fp;
      var10005[fq] = fr;
      h = new NLoginCore_425(var10004, var10005);
      var10002 = a(fs, ft ^ fu);
      var10003 = fv;
      var10004 = a(fw, fx ^ fy);
      var10005 = new int[fz];
      var10005[ga] = gb;
      var10005[gc] = gd;
      var10005[ge] = gf;
      var10005[gg] = gh;
      var10005[gi] = gj;
      i = new NLoginCore_425(var10004, var10005);
      var10002 = a(gk, gl ^ gm);
      var10003 = gn;
      var10004 = a(go, gp ^ gq);
      var10005 = new int[gr];
      var10005[gs] = gt;
      var10005[gu] = gv;
      var10005[gw] = gx;
      var10005[gy] = gz;
      var10005[ha] = hb;
      j = new NLoginCore_425(var10004, var10005);
      var10002 = a(hc & hd, he);
      var10003 = hf;
      var10004 = a(hg, hh ^ hi);
      int[] var10006 = new int[hk];
      var10006[hl] = hm;
      var10006[hn] = ho;
      var10006[hp] = hq;
      var10006[hr] = hs;
      var10006[ht] = hu;
      k = new NLoginCore_425(var10004, (hj != 0), var10006);
      var10002 = a(hv & hw, hx);
      var10003 = hy;
      var10004 = a(hz, ia ^ ib);
      var10005 = new int[ic];
      var10005[id] = ie;
      var10005[var_if] = ig;
      var10005[ih] = ii;
      var10005[ij] = ik;
      var10005[il] = im;
      l = new NLoginCore_425(var10004, var10005);
      String[] var10000 = new String[in];
      var10000[io] = a(ip, iq ^ ir);
      var10000[is] = a(it, iu);
      var10000[iv] = a(iw, ix ^ iy);
      var10000[iz] = a(ja, jb ^ jc);
      var10000[jd] = a(je & jf, jg);
      f = var10000;
   }

   public boolean aT() {
      return ((this.aS && this.F() != 0) ? t : u);
   }

   public long k() {
      return NLoginCore_548.a()[this.ordinal()];
   }

   public String c(TimeUnit var1, int var2) {
      double var3 = this.b(var1, this.k());
      return this.b(var3) + NLoginCore_112.a(var3, var2);
   }

   public boolean F() {
      return ((!this.aS() != 0) && this.y() == 0 ? r : s);
   }

   private String b(double var1) {
      if (var1 <= 0.0) {
         return a(f, g ^ h);
      } else {
         for (int var3 = i; var3 < this.ak.length; var3++) {
            if (var1 <= this.ak[var3]) {
               return f[var3];
            }
         }

         return f[f.length - j];
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 41L;
      var1 ^= -978743404745506585L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(59 + 10),
                     (byte)(21 + 62),
                     (byte)(25 + 22),
                     (byte)(38 + 29),
                     66,
                     (byte)(3 + 64),
                     (byte)(21 + 26),
                     (byte)(26 + 54),
                     (byte)(67 + 8),
                     (byte)(2 + 65),
                     (byte)(17 + 66),
                     (byte)(7 + 46),
                     (byte)(2 + 78),
                     (byte)(4 + 93),
                     (byte)(74 + 26),
                     (byte)(5 + 95),
                     105,
                     (byte)(40 + 70),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.E("ԼՉՈԋՋՇՂՋՖՅԒՐՔՍՐՖԘ\u0892ࢆࢱࢪࢡࢵࢵࢮࢦ࢛ࢨࢨ࢙", (byte)29, 69));
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

   private NLoginCore_425(String var3, int... var4) {
      this(var3, (a != 0), var4);
   }

   public int y() {
      synchronized (NLoginCore_548.a()[this.ordinal()]) {
         return NLoginCore_548.a()[this.ordinal()];
      }
   }
}
