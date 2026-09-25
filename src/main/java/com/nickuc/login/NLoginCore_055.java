package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_055 {
   c(
      a(NLoginCore_055.ba, NLoginCore_055.bb ^ NLoginCore_055.bc),
      a(NLoginCore_055.bd, NLoginCore_055.be ^ NLoginCore_055.bf),
      a(NLoginCore_055.bg, NLoginCore_055.bh),
      (NLoginCore_055 != 0).bi
   ),
   d(a(NLoginCore_055.bn, NLoginCore_055.bo), a(NLoginCore_055.bp, NLoginCore_055.bq ^ NLoginCore_055.br), (NLoginCore_055 != 0).bs),
   e(a(NLoginCore_055.bx & NLoginCore_055.by, NLoginCore_055.bz), a(NLoginCore_055.ca, NLoginCore_055.cb ^ NLoginCore_055.cc), (NLoginCore_055 != 0).cd),
   f(a(NLoginCore_055.ci, NLoginCore_055.cj ^ NLoginCore_055.ck), a(NLoginCore_055.cl, NLoginCore_055.cm)),
   g(a(NLoginCore_055.cr & NLoginCore_055.cs, NLoginCore_055.ct), a(NLoginCore_055.cu, NLoginCore_055.cv ^ NLoginCore_055.cw), (NLoginCore_055 != 0).cx),
   h(a(NLoginCore_055.dc & NLoginCore_055.dd, NLoginCore_055.de), a(NLoginCore_055.df, NLoginCore_055.dg)),
   i(a(NLoginCore_055.dl, NLoginCore_055.dm), a(NLoginCore_055.dn, NLoginCore_055.var_do ^ NLoginCore_055.dp)),
   j(a(NLoginCore_055.du, NLoginCore_055.dv ^ NLoginCore_055.dw), a(NLoginCore_055.dx, NLoginCore_055.dy ^ NLoginCore_055.dz)),
   k(a(NLoginCore_055.ee, NLoginCore_055.ef ^ NLoginCore_055.eg), a(NLoginCore_055.eh, NLoginCore_055.ei)),
   l(a(NLoginCore_055.en, NLoginCore_055.eo ^ NLoginCore_055.ep), a(NLoginCore_055.eq, NLoginCore_055.er)),
   m(a(NLoginCore_055.ew, NLoginCore_055.ex ^ NLoginCore_055.ey), a(NLoginCore_055.ez, NLoginCore_055.fa ^ NLoginCore_055.fb), (NLoginCore_055 != 0).fc),
   n(a(NLoginCore_055.fh, NLoginCore_055.fi ^ NLoginCore_055.fj), a(NLoginCore_055.fk, NLoginCore_055.fl ^ NLoginCore_055.fm)),
   o(a(NLoginCore_055.fq & NLoginCore_055.fr, NLoginCore_055.fs), a(NLoginCore_055.ft, NLoginCore_055.fu ^ NLoginCore_055.fv)),
   p(
      a(NLoginCore_055.fz, NLoginCore_055.ga ^ NLoginCore_055.gb),
      a(NLoginCore_055.gc, NLoginCore_055.gd ^ NLoginCore_055.ge),
      a(NLoginCore_055.gf, NLoginCore_055.gg ^ NLoginCore_055.gh),
      (NLoginCore_055 != 0).gi
   ),
   q(a(NLoginCore_055.gn, NLoginCore_055.go), a(NLoginCore_055.gp, NLoginCore_055.gq)),
   r(a(NLoginCore_055.gv, NLoginCore_055.gw ^ NLoginCore_055.gx), a(NLoginCore_055.gy, NLoginCore_055.gz ^ NLoginCore_055.ha)),
   s(a(NLoginCore_055.he, NLoginCore_055.hf), a(NLoginCore_055.hg, NLoginCore_055.hh)),
   t(a(NLoginCore_055.hl, NLoginCore_055.hm ^ NLoginCore_055.hn), a(NLoginCore_055.ho & NLoginCore_055.hp, NLoginCore_055.hq)),
   u(a(NLoginCore_055.hv, NLoginCore_055.hw), a(NLoginCore_055.hx, NLoginCore_055.hy ^ NLoginCore_055.hz)),
   v(a(NLoginCore_055.ie, NLoginCore_055.var_if ^ NLoginCore_055.ig), a(NLoginCore_055.ih, NLoginCore_055.ii ^ NLoginCore_055.ij)),
   w(
      a(NLoginCore_055.in, NLoginCore_055.io ^ NLoginCore_055.ip),
      a(NLoginCore_055.iq, NLoginCore_055.ir ^ NLoginCore_055.is),
      a(NLoginCore_055.it & NLoginCore_055.iu, NLoginCore_055.iv),
      (NLoginCore_055 != 0).iw
   ),
   x(null, a(NLoginCore_055.ja, NLoginCore_055.jb ^ NLoginCore_055.jc), null, (NLoginCore_055 != 0).jd);

   public final String cM;
   public final String cN;
   public final String cO;
   public final String cP;
   public final String cQ;
   public final int aO;
   private static String[] ZKM_STR_A = new String[NLoginCore_055.au];
   private static String[] ZKM_STR_B = new String[NLoginCore_055.av];
   private static long c;
   private static int a = (0 >>> 106 | 0 << ~106 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static long d = Long.reverse(-7196309479632204724L);
   private static long e = Long.reverse(7638104968020361216L);
   private static int f = 2048 >>> 75 | 2048 << -75;
   private static long g = Long.reverse(-711126016218690484L);
   private static int h = Integer.reverse(1073741824);
   private static int i = -1 >>> 93 | -1 << -93;
   private static long j = Long.reverse(-711126016218690484L);
   private static int k = Integer.reverse(-1073741824);
   private static long l = Long.reverse(-7196309479632204724L);
   private static long m = Long.reverse(7638104968020361216L);
   private static int n = (2097152 >>> 117 | 2097152 << -117) & -1;
   private static int o = -1 >>> 19 | -1 << -19;
   private static int p = Integer.reverse(0);
   private static int q = Integer.reverse(0);
   private static int r = Integer.reverse(0);
   private static int s = Integer.reverse(-1);
   private static int t = (128 >>> 38 | 128 << -38) & -1;
   private static int u = Integer.reverse(0);
   private static int v = (1024 >>> 9 | 1024 << ~9 + 1) & -1;
   private static int w = Integer.reverse(0);
   private static int x = Integer.reverse(1744830464);
   private static int y = 0 >>> 46 | 0 << ~46 + 1;
   private static int z = (1 >>> 96 | 1 << ~96 + 1) & -1;
   private static int aa = 1073741824 >>> 29 | 1073741824 << ~29 + 1;
   private static int ab = Integer.reverse(-1073741824);
   private static int ac = (33554432 >>> 23 | 33554432 << -23) & -1;
   private static int ad = 'ꀀ' >>> 205 | 40960 << -205;
   private static int ae = (196608 >>> 111 | 196608 << ~111 + 1) & -1;
   private static int af = Integer.reverse(-536870912);
   private static int ag = 8192 >>> 170 | 8192 << ~170 + 1;
   private static int ah = Integer.reverse(-1879048192);
   private static int ai = 335544320 >>> 185 | 335544320 << ~185 + 1;
   private static int aj = (738197504 >>> 218 | 738197504 << -218) & -1;
   private static int ak = Integer.reverse(805306368);
   private static int al = Integer.reverse(-1342177280);
   private static int am = 234881024 >>> 184 | 234881024 << ~184 + 1;
   private static int an = Integer.reverse(-268435456);
   private static int ao = 1024 >>> 166 | 1024 << ~166 + 1;
   private static int ap = 136 >>> 163 | 136 << -163;
   private static int aq = Integer.reverse(1207959552);
   private static int ar = Integer.reverse(-939524096);
   private static int as = Integer.reverse(671088640);
   private static int at = Integer.reverse(-1476395008);
   private static int au = Integer.reverse(301989888);
   private static int av = Integer.reverse(301989888);
   private static int aw = Integer.reverse(536870912);
   private static long ax = Long.reverse(-7196309479632204724L);
   private static long ay = Long.reverse(7638104968020361216L);
   private static int az = 0 >>> 186 | 0 << ~186 + 1;
   private static int ba = (320 >>> 6 | 320 << ~6 + 1) & -1;
   private static long bb = Long.reverse(-7196309479632204724L);
   private static long bc = Long.reverse(7638104968020361216L);
   private static int bd = Integer.reverse(1610612736);
   private static long be = Long.reverse(-7196309479632204724L);
   private static long bf = Long.reverse(7638104968020361216L);
   private static int bg = 3584 >>> 201 | 3584 << -201;
   private static long bh = Long.reverse(-711126016218690484L);
   private static int bi = Integer.reverse(Integer.MIN_VALUE);
   private static int bj = (32 >>> 98 | 32 << -98) & -1;
   private static int bk = (-1 >>> 118 | -1 << ~118 + 1) & -1;
   private static long bl = Long.reverse(-711126016218690484L);
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static int bn = (2359296 >>> 146 | 2359296 << ~146 + 1) & -1;
   private static long bo = Long.reverse(-711126016218690484L);
   private static int bp = Integer.reverse(1342177280);
   private static long bq = Long.reverse(-7196309479632204724L);
   private static long br = Long.reverse(7638104968020361216L);
   private static int bs = Integer.reverse(Integer.MIN_VALUE);
   private static int bt = Integer.reverse(-805306368);
   private static int bu = -1 >>> 167 | -1 << ~167 + 1;
   private static long bv = Long.reverse(-711126016218690484L);
   private static int bw = Integer.reverse(1073741824);
   private static int bx = (100663296 >>> 87 | 100663296 << ~87 + 1) & -1;
   private static int by = -1 >>> 204 | -1 << ~204 + 1;
   private static long bz = Long.reverse(-711126016218690484L);
   private static int ca = Integer.reverse(-1342177280);
   private static long cb = Long.reverse(-7196309479632204724L);
   private static long cc = Long.reverse(7638104968020361216L);
   private static int cd = Integer.reverse(Integer.MIN_VALUE);
   private static int ce = (14680064 >>> 20 | 14680064 << ~20 + 1) & -1;
   private static long cf = Long.reverse(-7196309479632204724L);
   private static long cg = Long.reverse(7638104968020361216L);
   private static int ch = (50331648 >>> 184 | 50331648 << -184) & -1;
   private static int ci = Integer.reverse(-268435456);
   private static long cj = Long.reverse(-7196309479632204724L);
   private static long ck = Long.reverse(7638104968020361216L);
   private static int cl = 1073741824 >>> 154 | 1073741824 << ~154 + 1;
   private static long cm = Long.reverse(-711126016218690484L);
   private static int cn = Integer.reverse(-2013265920);
   private static long co = Long.reverse(-7196309479632204724L);
   private static long cp = Long.reverse(7638104968020361216L);
   private static int cq = (536870912 >>> 59 | 536870912 << -59) & -1;
   private static int cr = (72 >>> 66 | 72 << ~66 + 1) & -1;
   private static int cs = (-1 >>> 34 | -1 << -34) & -1;
   private static long ct = Long.reverse(-711126016218690484L);
   private static int cu = (1216 >>> 6 | 1216 << ~6 + 1) & -1;
   private static long cv = Long.reverse(-7196309479632204724L);
   private static long cw = Long.reverse(7638104968020361216L);
   private static int cx = Integer.reverse(Integer.MIN_VALUE);
   private static int cy = 167772160 >>> 247 | 167772160 << -247;
   private static long cz = Long.reverse(-7196309479632204724L);
   private static long da = Long.reverse(7638104968020361216L);
   private static int db = Integer.reverse(-1610612736);
   private static int dc = (2688 >>> 71 | 2688 << ~71 + 1) & -1;
   private static int dd = (-1 >>> 56 | -1 << -56) & -1;
   private static long de = Long.reverse(-711126016218690484L);
   private static int df = ('뀀' >>> 11 | 45056 << ~11 + 1) & -1;
   private static long dg = Long.reverse(-711126016218690484L);
   private static int dh = Integer.reverse(-402653184);
   private static int di = (-1 >>> 82 | -1 << -82) & -1;
   private static long dj = Long.reverse(-711126016218690484L);
   private static int dk = 768 >>> 135 | 768 << ~135 + 1;
   private static int dl = 6291456 >>> 178 | 6291456 << -178;
   private static long dm = Long.reverse(-711126016218690484L);
   private static int dn = Integer.reverse(-1744830464);
   private static long var_do = Long.reverse(-7196309479632204724L);
   private static long dp = Long.reverse(7638104968020361216L);
   private static int dq = Integer.reverse(1476395008);
   private static long dr = Long.reverse(-7196309479632204724L);
   private static long ds = Long.reverse(7638104968020361216L);
   private static int dt = 28 >>> 130 | 28 << ~130 + 1;
   private static int du = 1610612739 >>> 29 | 1610612739 << -29;
   private static long dv = Long.reverse(-7196309479632204724L);
   private static long dw = Long.reverse(7638104968020361216L);
   private static int dx = (58720256 >>> 181 | 58720256 << -181) & -1;
   private static long dy = Long.reverse(-7196309479632204724L);
   private static long dz = Long.reverse(7638104968020361216L);
   private static int ea = '\ue800' >>> 203 | 59392 << ~203 + 1;
   private static long eb = Long.reverse(-7196309479632204724L);
   private static long ec = Long.reverse(7638104968020361216L);
   private static int ed = Integer.reverse(268435456);
   private static int ee = 125829120 >>> 246 | 125829120 << ~246 + 1;
   private static long ef = Long.reverse(-7196309479632204724L);
   private static long eg = Long.reverse(7638104968020361216L);
   private static int eh = Integer.reverse(-134217728);
   private static long ei = Long.reverse(-711126016218690484L);
   private static int ej = Integer.reverse(67108864);
   private static long ek = Long.reverse(-7196309479632204724L);
   private static long el = Long.reverse(7638104968020361216L);
   private static int em = (-1879048192 >>> 124 | -1879048192 << ~124 + 1) & -1;
   private static int en = Integer.reverse(-2080374784);
   private static long eo = Long.reverse(-7196309479632204724L);
   private static long ep = Long.reverse(7638104968020361216L);
   private static int eq = Integer.reverse(1140850688);
   private static long er = Long.reverse(-711126016218690484L);
   private static int es = Integer.reverse(-1006632960);
   private static long et = Long.reverse(-7196309479632204724L);
   private static long eu = Long.reverse(7638104968020361216L);
   private static int ev = (163840 >>> 110 | 163840 << -110) & -1;
   private static int ew = Integer.reverse(603979776);
   private static long ex = Long.reverse(-7196309479632204724L);
   private static long ey = Long.reverse(7638104968020361216L);
   private static int ez = -1811939328 >>> 122 | -1811939328 << -122;
   private static long fa = Long.reverse(-7196309479632204724L);
   private static long fb = Long.reverse(7638104968020361216L);
   private static int fc = (8 >>> 195 | 8 << -195) & -1;
   private static int fd = Integer.reverse(1677721600);
   private static long fe = Long.reverse(-7196309479632204724L);
   private static long ff = Long.reverse(7638104968020361216L);
   private static int fg = Integer.reverse(-805306368);
   private static int fh = Integer.reverse(-469762048);
   private static long fi = Long.reverse(-7196309479632204724L);
   private static long fj = Long.reverse(7638104968020361216L);
   private static int fk = (20 >>> 223 | 20 << ~223 + 1) & -1;
   private static long fl = Long.reverse(-7196309479632204724L);
   private static long fm = Long.reverse(7638104968020361216L);
   private static int fn = Integer.reverse(-1811939328);
   private static long fo = Long.reverse(-711126016218690484L);
   private static int fp = Integer.reverse(805306368);
   private static int fq = ('ꠀ' >>> '*' | 43008 << -42) & -1;
   private static int fr = Integer.reverse(-1);
   private static long fs = Long.reverse(-711126016218690484L);
   private static int ft = 43 >>> 160 | 43 << ~160 + 1;
   private static long fu = Long.reverse(-7196309479632204724L);
   private static long fv = Long.reverse(7638104968020361216L);
   private static int fw = 90112 >>> 11 | 90112 << -11;
   private static long fx = Long.reverse(-711126016218690484L);
   private static int fy = 1703936 >>> 177 | 1703936 << -177;
   private static int fz = 90 >>> 65 | 90 << -65;
   private static long ga = Long.reverse(-7196309479632204724L);
   private static long gb = Long.reverse(7638104968020361216L);
   private static int gc = Integer.reverse(1946157056);
   private static long gd = Long.reverse(-7196309479632204724L);
   private static long ge = Long.reverse(7638104968020361216L);
   private static int gf = (-268435454 >>> 156 | -268435454 << ~156 + 1) & -1;
   private static long gg = Long.reverse(-7196309479632204724L);
   private static long gh = Long.reverse(7638104968020361216L);
   private static int gi = Integer.reverse(0);
   private static int gj = Integer.reverse(201326592);
   private static long gk = Long.reverse(-7196309479632204724L);
   private static long gl = Long.reverse(7638104968020361216L);
   private static int gm = (7168 >>> 137 | 7168 << ~137 + 1) & -1;
   private static int gn = Integer.reverse(-1946157056);
   private static long go = Long.reverse(-711126016218690484L);
   private static int gp = Integer.reverse(1275068416);
   private static long gq = Long.reverse(-711126016218690484L);
   private static int gr = Integer.reverse(-872415232);
   private static int gs = (-1 >>> 248 | -1 << ~248 + 1) & -1;
   private static long gt = Long.reverse(-711126016218690484L);
   private static int gu = (120 >>> 163 | 120 << -163) & -1;
   private static int gv = 26 >>> 159 | 26 << -159;
   private static long gw = Long.reverse(-7196309479632204724L);
   private static long gx = Long.reverse(7638104968020361216L);
   private static int gy = 1778384896 >>> 217 | 1778384896 << -217;
   private static long gz = Long.reverse(-7196309479632204724L);
   private static long ha = Long.reverse(7638104968020361216L);
   private static int hb = Integer.reverse(1811939328);
   private static long hc = Long.reverse(-711126016218690484L);
   private static int hd = (536870912 >>> 249 | 536870912 << -249) & -1;
   private static int he = Integer.reverse(-335544320);
   private static long hf = Long.reverse(-711126016218690484L);
   private static int hg = Integer.reverse(469762048);
   private static long hh = Long.reverse(-711126016218690484L);
   private static int hi = 14592 >>> 136 | 14592 << ~136 + 1;
   private static long hj = Long.reverse(-711126016218690484L);
   private static int hk = 285212672 >>> 24 | 285212672 << -24;
   private static int hl = Integer.reverse(1543503872);
   private static long hm = Long.reverse(-7196309479632204724L);
   private static long hn = Long.reverse(7638104968020361216L);
   private static int ho = Integer.reverse(-603979776);
   private static int hp = -1 >>> 46 | -1 << -46;
   private static long hq = Long.reverse(-711126016218690484L);
   private static int hr = -536870911 >>> 219 | -536870911 << ~219 + 1;
   private static int hs = -1 >>> 156 | -1 << ~156 + 1;
   private static long ht = Long.reverse(-711126016218690484L);
   private static int hu = Integer.reverse(1207959552);
   private static int hv = Integer.reverse(-1140850688);
   private static long hw = Long.reverse(-711126016218690484L);
   private static int hx = Integer.reverse(2080374784);
   private static long hy = Long.reverse(-7196309479632204724L);
   private static long hz = Long.reverse(7638104968020361216L);
   private static int ia = (-2147483617 >>> 255 | -2147483617 << ~255 + 1) & -1;
   private static int ib = Integer.reverse(-1);
   private static long ic = Long.reverse(-711126016218690484L);
   private static int id = 2490368 >>> 209 | 2490368 << -209;
   private static int ie = Integer.reverse(33554432);
   private static long var_if = Long.reverse(-7196309479632204724L);
   private static long ig = Long.reverse(7638104968020361216L);
   private static int ih = 4160 >>> 38 | 4160 << -38;
   private static long ii = Long.reverse(-7196309479632204724L);
   private static long ij = Long.reverse(7638104968020361216L);
   private static int ik = (2162688 >>> 239 | 2162688 << ~239 + 1) & -1;
   private static long il = Long.reverse(-711126016218690484L);
   private static int im = (5120 >>> 200 | 5120 << ~200 + 1) & -1;
   private static int in = (4390912 >>> 112 | 4390912 << -112) & -1;
   private static long io = Long.reverse(-7196309479632204724L);
   private static long ip = Long.reverse(7638104968020361216L);
   private static int iq = Integer.reverse(570425344);
   private static long ir = Long.reverse(-7196309479632204724L);
   private static long is = Long.reverse(7638104968020361216L);
   private static int it = Integer.reverse(-1577058304);
   private static int iu = (-1 >>> 187 | -1 << -187) & -1;
   private static long iv = Long.reverse(-711126016218690484L);
   private static int iw = Integer.reverse(0);
   private static int ix = (140 >>> 33 | 140 << ~33 + 1) & -1;
   private static long iy = Long.reverse(-711126016218690484L);
   private static int iz = (1344 >>> 6 | 1344 << ~6 + 1) & -1;
   private static int ja = (297795584 >>> 118 | 297795584 << -118) & -1;
   private static long jb = Long.reverse(-7196309479632204724L);
   private static long jc = Long.reverse(7638104968020361216L);
   private static int jd = 0 >>> 78 | 0 << -78;

   private NLoginCore_055(String var3, String var4, String var5, boolean var6) {
      this.cN = var4;
      this.cO = var3 == null ? a(b, d ^ e) : a(f, g) + var4 + a(h & i, j);
      this.cM = var3;
      this.cP = var6 ? var4 : a(k, l ^ m);
      this.cQ = var5;
      this.aO = var6 ? this.ordinal() + n : o;
   }

   private static void b() {
      c = 3616668917290337337L;
      long var0 = c ^ 5401256631105068067L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(59 + 9),
               (byte)(14 + 55),
               (byte)(59 + 24),
               47,
               (byte)(56 + 11),
               (byte)(46 + 20),
               (byte)(10 + 57),
               (byte)(22 + 25),
               (byte)(33 + 47),
               (byte)(41 + 34),
               (byte)(58 + 9),
               (byte)(11 + 72),
               (byte)(41 + 12),
               (byte)(27 + 53),
               (byte)(69 + 28),
               100,
               (byte)(54 + 46),
               (byte)(27 + 78),
               (byte)(11 + 99),
               (byte)(7 + 96)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_387.D("ԆՋԭԺՂԞԣՇԈՆԯԓԶԒԛԜԫԲԙՂԪԻԨԩ", (byte)96, 68);
               ZKM_STR_B[1] = NLoginCore_092.B("ŰƵƗƤƬƈƍƱŲưƗƎƖƾƹưƛƚƥƜƆƥƒƓ", (byte)96, 66);
               ZKM_STR_B[2] = NLoginCore_183.D("ԍԤՐԲԻՓՍՉՖԕ\u0530ԝ", (byte)96, 68);
               ZKM_STR_B[3] = NLoginCore_183.C("ԹԠՐՈԎՋԌԮՑԗՊԝ", (byte)96, 67);
               ZKM_STR_B[4] = NLoginCore_141.B("ƳƒƩŸƛƇƺƗƸŽƛƵƯƢƣƒƓƙƚƚƨƕƒƓ", (byte)96, 66);
               ZKM_STR_B[5] = NLoginCore_004.F("ֆՈՕ։֖֔֊ևժՖկՙ֠֙բյվ\u0558ո֛֔յֆ֣֛ջ֎֙֙ւְִ", (byte)96, 70);
               ZKM_STR_B[6] = NLoginCore_530.F("փֈդ֍֏ծփՖ֜՚էդ", (byte)96, 70);
               ZKM_STR_B[7] = NLoginCore_138.E("ՏֆյՖշիՍ֍հծշդ", (byte)96, 69);
               ZKM_STR_B[8] = NLoginCore_127.B("ƘƷŶƊƈƚźƉƙƍƞƇ", (byte)96, 66);
               ZKM_STR_B[9] = NLoginCore_138.C("ՂԣՆԪԩԢՅԋԾՍԴԝ", (byte)96, 67);
               ZKM_STR_B[10] = NLoginCore_427.B("ƣƊƺƲŸƵŶƘƻƁƴƇ", (byte)96, 66);
               ZKM_STR_B[11] = NLoginCore_183.B("ƢƮƉƜƥŸŴƛƭƑƸƇ", (byte)96, 66);
               ZKM_STR_B[12] = NLoginCore_223.A("ƎƪƱƏŹƯźƉƖƳƎƼƖƸƲơƄƞǊƝƹƻƒƓ", (byte)96, 65);
               ZKM_STR_B[13] = NLoginCore_446.A("ƉƇƪƇƼƝŴƯƼƝǀƇ", (byte)96, 65);
               ZKM_STR_B[14] = NLoginCore_183.F("վծղֈ֑Ռհթչ֔ճդ", (byte)96, 70);
               ZKM_STR_B[15] = NLoginCore_076.A("ƬƪƎƃƵƴƦƽǁƶƁƇ", (byte)96, 65);
               ZKM_STR_B[16] = NLoginCore_427.D("ԨՈԝԫԍԪ\u0530ՖՅՒԸԝ", (byte)96, 68);
               ZKM_STR_B[17] = NLoginCore_027.F("֕ՠդթփղ֍ծ։յ֍դ", (byte)96, 70);
               ZKM_STR_B[18] = NLoginCore_241.E("թօ֒ր\u0558ըեծՓՙ՟ց֡֙քլոբ֤֒՛ւկհ", (byte)96, 69);
               ZKM_STR_B[19] = NLoginCore_027.A("ƓūųƸƧƆƷƳſƉƼƇ", (byte)96, 65);
               ZKM_STR_B[20] = NLoginCore_559.A("ƎưŬƥƅƻƮŷƊƱƊƇ", (byte)96, 65);
               ZKM_STR_B[21] = NLoginCore_530.B("ůƶƉƉƼƅƈƒǁƿơƷƏƠƓƞǅƘǅƧžǋƒƓ", (byte)96, 66);
               ZKM_STR_B[22] = NLoginCore_433.B("ƬƉƕŷƮųƙƋƳƓƎƇ", (byte)96, 66);
               ZKM_STR_B[23] = NLoginCore_451.F("ՍՒխ֓ճկ֙ճ֏՚՚\u058c\u0557\u058bո֥֍չ֕՞ս֨կհ", (byte)96, 70);
               ZKM_STR_B[24] = NLoginCore_127.E("֕Օ՟։֕Ց֊դ։֎ղ֑ճոկ֥֙֙֨շգւկհ", (byte)96, 69);
               ZKM_STR_B[25] = NLoginCore_433.B("ƲơƋŸƬƨƒƍƸƷƎƇ", (byte)96, 66);
               ZKM_STR_B[26] = NLoginCore_530.A("ƊƂƖƑƻƕƪƮƒƠƎƇ", (byte)96, 65);
               ZKM_STR_B[27] = NLoginCore_004.C("ԮԥԱՒԝՄԴԽԫՏԸԝ", (byte)96, 67);
               ZKM_STR_B[28] = NLoginCore_521.A("ƷŹƗƴźƶƉƗǁƓƊƇ", (byte)96, 65);
               ZKM_STR_B[29] = NLoginCore_223.D("ԙԈԫՀԉԏԪԵՉԱՆԝ", (byte)96, 68);
               ZKM_STR_B[30] = NLoginCore_241.F("սևՓ֙֎ժՔպՙ՛խռ֍ժ֔հւձմաջւկհ", (byte)96, 70);
               ZKM_STR_B[31] = NLoginCore_559.B("ŰƴƓƬƄƑŰƈƽƋǀƇ", (byte)96, 66);
               ZKM_STR_B[32] = NLoginCore_384.F("ֈվցՊխխղ֛֕ղ֍Ֆխ\u0590խորզ֛ըՠ֘կհ", (byte)96, 70);
               ZKM_STR_B[33] = NLoginCore_241.D("ԷԦԫԯԍՋԴՆՅԨՖԝ", (byte)96, 68);
               ZKM_STR_B[34] = NLoginCore_521.B("ŷƉƨƉųƞƲƳƨƌǀƇ", (byte)96, 66);
               ZKM_STR_B[35] = NLoginCore_092.A("ƍơƪƤƌƳƓƧƶųƴƇ", (byte)96, 65);
               ZKM_STR_B[36] = NLoginCore_173.A("ŰƂƦƭƥƋƝƓƴƿǀƘƵƮƿƤƤǁƲǅƇǋƩƾƇƐƦƝǑǒƷƉ", (byte)96, 65);
               ZKM_STR_B[37] = NLoginCore_173.C("ԘՋԧԭԝԠԣԐԏԲԏԝ", (byte)96, 67);
               ZKM_STR_B[38] = NLoginCore_559.C("ԥՊԌԲԪԅՀ\u0530ԓԳԠԝ", (byte)96, 67);
               ZKM_STR_B[39] = NLoginCore_076.B("ưƢƻƪƲƦƊƳƚƔƀŻƕƁƟƚƞƾƕƻƉƥƒƓ", (byte)96, 66);
               ZKM_STR_B[40] = NLoginCore_324.B("ƫƸƦŭƳƨƬűƉƩŽƇ", (byte)96, 66);
               ZKM_STR_B[41] = NLoginCore_232.C("ԶՁՌԬԿԓԨՇ\u0557ԷԎ\u0530ՓԬ՚ԥՙԝԪԓ\u0530աԨԩ", (byte)96, 67);
               ZKM_STR_B[42] = NLoginCore_521.B("ƂŰƅűƄźƺƉƌưƖƀƲǅƮǂƿǈƤƄơƥƒƓ", (byte)96, 66);
               ZKM_STR_B[43] = NLoginCore_241.E("Ր֎ֆւիիզՒ֖\u0558՞դ", (byte)96, 69);
               ZKM_STR_B[44] = NLoginCore_127.A("ƮƣƃƆŻƥƶƑƩƋƘƻƱŻŽƹƢǇƿƺƖƕƒƓ", (byte)96, 65);
               ZKM_STR_B[45] = NLoginCore_530.B("ưŰŸƳŻƱƌƚƞƴƓžſƤơƑǂƛƈƥǇǃƶƬǌƻƾƎƠǏǉƖ", (byte)96, 66);
               ZKM_STR_B[46] = NLoginCore_201.D("ԙԟՈԻՅԲԳԵԾԥՊԝ", (byte)96, 68);
               ZKM_STR_B[47] = NLoginCore_471.D("ՊԜԨԈԢՀԨԫԖՖԨԝ", (byte)96, 68);
               ZKM_STR_B[48] = NLoginCore_521.A("ŸƮźƸƓƋƳźƛƔƕƳƢƢƘƏƱſƼǀƫƻƒƓ", (byte)96, 65);
               ZKM_STR_B[49] = NLoginCore_387.C("ԹՄԤԍԯԮՅԞԫԖՍԷ՛ԕԻՕԺԹ՟ԙԟԫԨԩ", (byte)96, 67);
               ZKM_STR_B[50] = NLoginCore_027.E("Օևկ\u0557էշի֒֙վՖդ", (byte)96, 69);
               ZKM_STR_B[51] = NLoginCore_324.A("ŲƯŸƤƝżŷǀŹżƒƇ", (byte)96, 65);
               ZKM_STR_B[52] = NLoginCore_232.E("տճ֎օ֑֘ժ։Քռ\u0558՝ի՚ւ֖֙րվֆռւկհ", (byte)96, 69);
               ZKM_STR_B[53] = NLoginCore_076.D("ՀԜԜՐՒՈԡՖՇԓԴԝ", (byte)96, 68);
               ZKM_STR_B[54] = NLoginCore_110.E("֖դֆդդ֑փ֖֖֒֓ֈ֎ա֖֢վ՟օ\u0590վ֫է֦֘խչև֦֬֜ղ", (byte)96, 69);
               ZKM_STR_B[55] = NLoginCore_141.F("ֆՈՕ։֖֔֊ևժՖհշ\u0557ց\u058b֜֙փ֓բ՛ղկհ", (byte)96, 70);
               ZKM_STR_B[56] = NLoginCore_232.C("ԈԿԮԏ\u0530ԤԆՆԩԧ\u0530ԝ", (byte)96, 67);
               ZKM_STR_B[57] = NLoginCore_138.F("ձՌֆրյդՔ֗\u058c֙է֞պճ֟Ֆխբգհզ֨կհ", (byte)96, 70);
               ZKM_STR_B[58] = NLoginCore_138.C("ԇԡԠԩՆԌԮՕԔԏԣՃ\u0557ՋՕԸՒԽԭԓԝԫԨԩ", (byte)96, 67);
               ZKM_STR_B[59] = NLoginCore_232.B("ƤƍƴƗƵƷžƕƚżƁƇ", (byte)96, 66);
               ZKM_STR_B[60] = NLoginCore_471.B("ƓơƥűƷƸƘŶƹƌƴƇ", (byte)96, 66);
               ZKM_STR_B[61] = NLoginCore_446.F("քՠզֆ\u058b\u058bիք֕Ր֊ֈ\u0558֘ա֏յպբցշգգփդիխզտ֯սզյցծոյհ֏֑֘־ֵք", (byte)96, 70);
               ZKM_STR_B[62] = NLoginCore_138.F("֍ՑՍքՋշյ\u0558֞֙։դ", (byte)96, 70);
               ZKM_STR_B[63] = NLoginCore_092.E("֏Օ֕դօ\u0590լկՙշ՞նտ֚֗ՠ\u0557֒՞\u0590վ֨կհ", (byte)96, 69);
               ZKM_STR_B[64] = NLoginCore_427.D("ԪԆԎԪԡԎԵԌԕԑԥՃԔԪՇԮԐՌԲՐԱՒ՟ԯԼՆը՟Ե՝զԧ", (byte)96, 68);
               ZKM_STR_B[65] = NLoginCore_173.F("սնդխխՌնք֞ը֙դ", (byte)96, 70);
               ZKM_STR_B[66] = NLoginCore_521.E("ֈձ֏խյՐևռըռ՛թՙտճշր\u0558՝֕պ֨կհ", (byte)96, 69);
               ZKM_STR_B[67] = NLoginCore_397.C("ԮԘԂՍԏԐԩՑԣԓՙԣԻՎՌՍԵՈԹ՞ԴաԨԩ", (byte)96, 67);
               ZKM_STR_B[68] = NLoginCore_387.F("֎֔ցՑկ֖՛կպչէդ", (byte)96, 70);
               ZKM_STR_B[69] = NLoginCore_027.B("ƥƲųƳŵƌƞŻơƮŹƇ", (byte)96, 66);
               ZKM_STR_B[70] = NLoginCore_530.B("ƁƲƋŷƲƔƽƙƖơƎƇ", (byte)96, 66);
               ZKM_STR_B[71] = NLoginCore_110.A("ƢƕƉƘƆƾƞŷƘƍǀƇ", (byte)96, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_223.A("ŰƵƗƤƬƈƍƱŲưƙƔƼƃƓƅƽƴƔƚƣƌƜƿǎǁǌƩǒƞǀƷ", (byte)96, 65);
               ZKM_STR_B[1] = NLoginCore_387.F("Ս֒մց։եժ֎Տ֍ն՟ջ\u0558֞փ֔֟տ֑֠֘կհ", (byte)96, 70);
               ZKM_STR_B[2] = NLoginCore_471.D("ԊՊՋՌԜՈԋԩԍ\u0530Ըԝ", (byte)96, 68);
               ZKM_STR_B[3] = NLoginCore_138.B("ŶŵƣƤƊƚƓƾƒƖƼƇ", (byte)96, 66);
               ZKM_STR_B[4] = NLoginCore_575.C("ՉԨԿԎԱԝՐԭՎԓԲԵԸԸ\u0558ԽՆԨԭ\u0558ԺԫԨԩ", (byte)96, 67);
               ZKM_STR_B[5] = NLoginCore_559.B("ƩūŸƬƹƷƭƪƍŹƒżǃƼƅƘơŻƛƾƷƕƥƊƂǉƧǆƍǌǑǌƘƓǗƦǙǓƳƗƘƸƺƧ", (byte)96, 66);
               ZKM_STR_B[6] = NLoginCore_183.E("ք֊ոՎծՕ֕֎՛ոջդ", (byte)96, 69);
               ZKM_STR_B[7] = NLoginCore_384.D("ԊԘՆԊՍՓԾ\u0530ԪԓՒԝ", (byte)96, 68);
               ZKM_STR_B[8] = NLoginCore_201.B("ƐƷƈƺƘźƨƍżƼƂƲŶǅǅƦƨƾżƥƫƕƒƓ", (byte)96, 66);
               ZKM_STR_B[9] = NLoginCore_453.D("ԡԘԹՋԦԤԞՖՑԏԨԣՏԧՏՊՋՓՁԸՎՑԨԩ", (byte)96, 68);
               ZKM_STR_B[10] = NLoginCore_183.F("֏ՍղՎ\u0558Ֆ֑նզ֓կդ", (byte)96, 70);
               ZKM_STR_B[11] = NLoginCore_451.E("նֈՑխ\u0590մխՒ֒զհ֛ջկ՝֛՟մւհթ֨կհ", (byte)96, 69);
               ZKM_STR_B[12] = NLoginCore_427.A("ƎƪƱƏŹƯźƉƖƳƎơƎƥƁƐƇƪǆƞƈƕƒƓ", (byte)96, 65);
               ZKM_STR_B[13] = NLoginCore_471.D("ՄԇՌԎԉՅՕԶՄ\u0558Վԝ", (byte)96, 68);
               ZKM_STR_B[14] = NLoginCore_433.B("ƭƁƎƒƥŷƹƭƱƮǂƘƃƺƏƑſǈƔƢƚƕƒƓ", (byte)96, 66);
               ZKM_STR_B[15] = NLoginCore_559.A("ƴŰƷűƲƆƞƌƗƛƘƐƼƳƙǇƱƝƺƞƶƥƒƓ", (byte)96, 65);
               ZKM_STR_B[16] = NLoginCore_397.D("ՊԯԊԎՍԓԤԫԣՊԗԝ", (byte)96, 68);
               ZKM_STR_B[17] = NLoginCore_092.E("Ր֓ՠըժժհֈ՛ղ֖֓տկ֝֙փչպդււկհ", (byte)96, 69);
               ZKM_STR_B[18] = NLoginCore_141.D("ԢԾՋԹԑԡԞԧԌԒԗԳԣՒԚՉԭ՚ԖԬՏՑԨԩ", (byte)96, 68);
               ZKM_STR_B[19] = NLoginCore_559.F("֏ևրղՒւ՚եէոիդ", (byte)96, 70);
               ZKM_STR_B[20] = NLoginCore_387.A("ƓŷƬųƜƛƇƻƚƲƯǄżŻƖǇžƳƲƊơƻƒƓ", (byte)96, 65);
               ZKM_STR_B[21] = NLoginCore_471.E("Ռ֓զզ֙բեկ֞֜ռրՙ֖֘ցն֚֗ջւ֨կհ", (byte)96, 69);
               ZKM_STR_B[22] = NLoginCore_397.A("ƇŷƂƴƩƶƹƾƊƷưƇ", (byte)96, 65);
               ZKM_STR_B[23] = NLoginCore_173.B("ŰŵƐƶƖƒƼƖƲŽŽſƿżƮƶǆǁƼƘƘƻƒƓ", (byte)96, 66);
               ZKM_STR_B[24] = NLoginCore_138.F("֕Օ՟։֕Ց֊դ։֎կՠ՞շ֢՟ռօ֝մվ֘կհ", (byte)96, 70);
               ZKM_STR_B[25] = NLoginCore_530.A("ƶƙƮƺźƮƋſžƮưƇ", (byte)96, 65);
               ZKM_STR_B[26] = NLoginCore_530.E("դկ֑֗\u058bևճթհ\u058b\u058b֡շ֒ՠնռ֣֏փօւկհ", (byte)96, 69);
               ZKM_STR_B[27] = NLoginCore_173.F("\u058bծ֔րՖ֊֚կ\u0558Օ֖Ֆՠյձ֣՟վ֢օ֖֘կհ", (byte)96, 70);
               ZKM_STR_B[28] = NLoginCore_553.B("ƎűƖƪƧƦƈƺƝơƁƇ", (byte)96, 66);
               ZKM_STR_B[29] = NLoginCore_223.B("ƣƥƹƛƕƊŶƞơƺƎƕƀǆƗƟƂƨƅŽƃƻƒƓ", (byte)96, 66);
               ZKM_STR_B[30] = NLoginCore_433.F("սևՓ֙֎ժՔպՙ՛ծ\u0558֒՚պղչ֑արվւկհ", (byte)96, 70);
               ZKM_STR_B[31] = NLoginCore_232.F("փա֔ձ֓զճ֗ձչ՚դ", (byte)96, 70);
               ZKM_STR_B[32] = NLoginCore_433.C("ՁԷԺԃԦԦԫՎՔԫՉԕՋՈԗԫԩՍԯՁգԫԨԩ", (byte)96, 67);
               ZKM_STR_B[33] = NLoginCore_453.C("ԌԝԘԯՊԿԼԤԣԢԔԲԖՙ՜ԼՓԭԿԵՁաԨԩ", (byte)96, 67);
               ZKM_STR_B[34] = NLoginCore_553.C("ԭԬՍԏԪՂՋԎՆԯԴԝ", (byte)96, 67);
               ZKM_STR_B[35] = NLoginCore_384.A("ƫƥưưƄŴƛƳŽƲƯƁƤưưƚƧƧƸƸƝƻƒƓ", (byte)96, 65);
               ZKM_STR_B[36] = NLoginCore_138.F("Ս՟փ֊ւըպհ֑֜֝յ֒\u058b֜ցց֞֏֢դդ֛֡֜ջթչկպ֥֡", (byte)96, 70);
               ZKM_STR_B[37] = NLoginCore_553.E("֑դ֕֒֙֏ՙնէշ՞դ", (byte)96, 69);
               ZKM_STR_B[38] = NLoginCore_521.D("ԟՍՅՁԤԽԍԩՁԶԫԺԲՖՍՙԛ\u0530ԩՓԺԻԨԩ", (byte)96, 68);
               ZKM_STR_B[39] = NLoginCore_521.C("ՆԸՑՀՈԼԠՉ\u0530ԪԖՙԹԵԓԽԿԫ՟ՖԻաԨԩ", (byte)96, 67);
               ZKM_STR_B[40] = NLoginCore_110.F("ըմեՐՔղելպ\u0558ճդ", (byte)96, 70);
               ZKM_STR_B[41] = NLoginCore_004.B("ƠƫƶƖƩŽƒƱǁơŸƠƢƔƖƄſǁǄƼƠƕƒƓ", (byte)96, 66);
               ZKM_STR_B[42] = NLoginCore_433.D("ԘԆԛԇԚԐՐԟԢՆԭԗՎՒԺՒՓԷՎՑՒԫԨԩ", (byte)96, 68);
               ZKM_STR_B[43] = NLoginCore_004.D("ՌԿԫԍԫՌԌԩԯՂՎԝ", (byte)96, 68);
               ZKM_STR_B[44] = NLoginCore_092.D("ՄԹԙԜԑԻՌԧԿԡԬԳՉ՜ՈԭԨԼԮՑԲաԨԩ", (byte)96, 68);
               ZKM_STR_B[45] = NLoginCore_138.D("ՆԆԎՉԑՇԢ\u0530ԴՊԩԔԕԺԷԧ\u0558ԱԞԻ՝ՠԼԽԦԾԧժԪԦՙ\u0557", (byte)96, 68);
               ZKM_STR_B[46] = NLoginCore_433.A("ŷūƣƦƙƽƝƷƜųƊƇ", (byte)96, 65);
               ZKM_STR_B[47] = NLoginCore_433.C("ԮԞԱԢԬՄՁՊԪՋԬԝ", (byte)96, 67);
               ZKM_STR_B[48] = NLoginCore_530.D("ԎՄԐՎԩԡՉԐԱԪԫԪ\u0530ԷԦԜՇՌԳԛՓաԨԩ", (byte)96, 68);
               ZKM_STR_B[49] = NLoginCore_521.D("ԹՄԤԍԯԮՅԞԫԖՍԏՋՐԺԗԘԧԼՊՋԻԨԩ", (byte)96, 68);
               ZKM_STR_B[50] = NLoginCore_183.F("ցհնբք֑ն֎֙ևէդ", (byte)96, 70);
               ZKM_STR_B[51] = NLoginCore_138.D("ԝԼԨԮԿԏԲԢԢԮԑՙՙԪԕԮԦԪԷԭԳԫԨԩ", (byte)96, 68);
               ZKM_STR_B[52] = NLoginCore_384.F("տճ֎օ֑֘ժ։Քռՙ֡՝ջչ֣տջ֚֘֙֘կհ", (byte)96, 70);
               ZKM_STR_B[53] = NLoginCore_433.A("ƨūƃŹƯƲŵƠƩƐƎƇ", (byte)96, 65);
               ZKM_STR_B[54] = NLoginCore_397.F("֖դֆդդ֑փ֖֖֒֓ֈ֎ա֖֢վ՟օ\u0590վդ֤չւ֖խ֮սսֈ։", (byte)96, 70);
               ZKM_STR_B[55] = NLoginCore_201.E("ֆՈՕ։֖֔֊ևժՖղչմղ֥֠֔՝֖զ֗֨կհ", (byte)96, 69);
               ZKM_STR_B[56] = NLoginCore_241.C("ԎԙԇԢԪԭՓՖԎԎՊԝ", (byte)96, 67);
               ZKM_STR_B[57] = NLoginCore_241.E("ձՌֆրյդՔ֗\u058c֙ըՠյի\u0590կճյ֦֞֘ղկհ", (byte)96, 69);
               ZKM_STR_B[58] = NLoginCore_521.C("ԇԡԠԩՆԌԮՕԔԏԢ\u0530՛ԭԱԗԳՀՋԘԜԱԞՅԲՄՈՊՀԷխը", (byte)96, 67);
               ZKM_STR_B[59] = NLoginCore_433.F("յտդբ֏ծձշճյշդ", (byte)96, 70);
               ZKM_STR_B[60] = NLoginCore_471.D("ԿՃԡՎԺ\u0530ԽԐՍԶԶԓԥԷԹ\u0558ԘԞ՟ՁԝԫԨԩ", (byte)96, 68);
               ZKM_STR_B[61] = NLoginCore_232.A("ƧƃƉƩƮƮƎƧƸųƭƫŻƻƄƲƘƝƅƤƚƆƆƦƇƎƐƉƢǒƠƉƥƢǛǊǓƧǔǊƴƬƲƧ", (byte)96, 65);
               ZKM_STR_B[62] = NLoginCore_453.D("ԷՋԭԢԱՋԾՃՋԿՊԝ", (byte)96, 68);
               ZKM_STR_B[63] = NLoginCore_173.D("ՈԎՎԝԾՉԥԨԒ\u0530ԘԭԙՃՏՅԺԵԫ\u0530՜ԻԨԩ", (byte)96, 68);
               ZKM_STR_B[64] = NLoginCore_387.A("ƔŰŸƔƋŸƟŶſŻƏƭžƔƱƘźƶƜƺƛǆƽƛƸǌƠǑƽǇƤƲ", (byte)96, 65);
               ZKM_STR_B[65] = NLoginCore_397.C("ԗԅՑ\u0530ԡՍ\u0530Չԍԣ\u0530ԝ", (byte)96, 67);
               ZKM_STR_B[66] = NLoginCore_530.F("ֈձ֏խյՐևռըռ՚ը֕՛՚շ֜սն֒֗֘կհ", (byte)96, 70);
               ZKM_STR_B[67] = NLoginCore_446.A("ƘƂŬƷŹźƓƻƍŽǁƽƽƛƛǆƚǇǈƈƊƕƒƓ", (byte)96, 65);
               ZKM_STR_B[68] = NLoginCore_446.D("ՍԮԘԃՂՂԆԵԍ\u0557Նԝ", (byte)96, 68);
               ZKM_STR_B[69] = NLoginCore_427.A("ƊƭƶűƚƌƛƗƌǀƎƇ", (byte)96, 65);
               ZKM_STR_B[70] = NLoginCore_433.E("եելՑբ֖ճՕևթՖդ", (byte)96, 69);
               ZKM_STR_B[71] = NLoginCore_183.F("տ\u0590ղ\u0558ցյ\u058c֍էհտռջՠկղփ֕՟֡մ֘կհ", (byte)96, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.F("ՌղՠքիՌչճ֏֘վ֖֝ի՛կ֣վ՟ճվ֨կհ", (byte)96, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_241.A("ƆůƂƲƼƎƏƷƐƟƫǃƁǃƂƧƒƩƥǌơƥƒƓ", (byte)96, 65);
         }
      }
   }

   public static NLoginCore_055 a(String var0) {
      if (var0 != null) {
         NLoginCore_055[] var1 = values();
         int var2 = var1.length;

         for (int var3 = p; var3 < var2; var3++) {
            NLoginCore_055 var4 = var1[var3];
            if (var4 != x && var0.equalsIgnoreCase(var4.cN)) {
               return var4;
            }
         }
      }

      return x;
   }

   private NLoginCore_055(String var3, String var4, boolean var5) {
      this(var3, var4, var4, var5);
   }

   public static NLoginCore_055 b(String var0) {
      if (var0 != null) {
         NLoginCore_055[] var1 = values();
         int var2 = var1.length;

         for (int var3 = q; var3 < var2; var3++) {
            NLoginCore_055 var4 = var1[var3];
            if (var4 != x && var0.equalsIgnoreCase(var4.cO)) {
               return var4;
            }
         }
      }

      return x;
   }

   @Generated
   public String u() {
      return this.cM;
   }

   private NLoginCore_055(String var3, String var4) {
      this(var3, var4, var4, (a != 0));
   }

   @Nullable
   public static NLoginCore_055 c(@Nullable String var0) {
      if (var0 != null && var0.length() >= t) {
         String var1 = var0.substring(u, v);
         NLoginCore_055[] var2 = values();
         int var3 = var2.length;

         for (int var4 = w; var4 < var3; var4++) {
            NLoginCore_055 var5 = var2[var4];
            if (var5 != x && var1.equals(var5.cQ)) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static NLoginCore_055 a(int var0) {
      NLoginCore_055[] var1 = values();
      int var2 = var1.length;

      for (int var3 = r; var3 < var2; var3++) {
         NLoginCore_055 var4 = var1[var3];
         if (var4 != x && var4.aO != s && var0 == var4.aO) {
            return var4;
         }
      }

      return x;
   }

   private static String a(int var0, long var1) {
      var1 ^= 86L;
      var1 ^= 5401256631105068067L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(14 + 55),
                     (byte)(53 + 30),
                     (byte)(38 + 9),
                     (byte)(22 + 45),
                     (byte)(53 + 13),
                     (byte)(27 + 40),
                     (byte)(42 + 5),
                     (byte)(4 + 76),
                     (byte)(68 + 7),
                     67,
                     (byte)(5 + 78),
                     (byte)(14 + 39),
                     (byte)(25 + 55),
                     (byte)(82 + 15),
                     100,
                     (byte)(38 + 62),
                     (byte)(58 + 47),
                     (byte)(72 + 38),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.A("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐҗқҧңҤҫ҃ҚҤҫҏ", (byte)41, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_055.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.A("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 65), NLoginCore_055.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.A("İĽļÿĿĻĶĿŊĹĆńňŁńŊČғҗңҟҠҧѿҖҠҧҋģ", (byte)39, 65) + var1 + NLoginCore_183.C("Ѥ", (byte)39, 67) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
