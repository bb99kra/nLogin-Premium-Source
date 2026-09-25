package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_237 implements NLoginInterface_014 {
   a(a(NLoginCore_237.ay, NLoginCore_237.az ^ NLoginCore_237.ba)),
   b(a(NLoginCore_237.bf, NLoginCore_237.bg ^ NLoginCore_237.bh)),
   c(a(NLoginCore_237.bm, NLoginCore_237.bn ^ NLoginCore_237.bo), (NLoginCore_237 != 0).bp),
   d(a(NLoginCore_237.bu, NLoginCore_237.bv), (NLoginCore_237 != 0).bw),
   e(a(NLoginCore_237.cb, NLoginCore_237.cc), (NLoginCore_237 != 0).cd),
   f(a(NLoginCore_237.ci, NLoginCore_237.cj), (NLoginCore_237 != 0).ck),
   g(a(NLoginCore_237.cp, NLoginCore_237.cq), (NLoginCore_237 != 0).cr),
   h(a(NLoginCore_237.cw, NLoginCore_237.cx ^ NLoginCore_237.cy), (NLoginCore_237 != 0).cz),
   i(a(NLoginCore_237.de, NLoginCore_237.df ^ NLoginCore_237.dg), (NLoginCore_237 != 0).dh),
   j(a(NLoginCore_237.dm, NLoginCore_237.dn ^ NLoginCore_237.var_do), (NLoginCore_237 != 0).dp),
   k(a(NLoginCore_237.dt & NLoginCore_237.du, NLoginCore_237.dv), (NLoginCore_237 != 0).dw),
   l(a(NLoginCore_237.ea, NLoginCore_237.eb), (NLoginCore_237 != 0).ec),
   m(a(NLoginCore_237.eg & NLoginCore_237.eh, NLoginCore_237.ei), (NLoginCore_237 != 0).ej),
   n(a(NLoginCore_237.eo, NLoginCore_237.ep ^ NLoginCore_237.eq), (NLoginCore_237 != 0).er),
   o(a(NLoginCore_237.ew & NLoginCore_237.ex, NLoginCore_237.ey), (NLoginCore_237 != 0).ez),
   p(a(NLoginCore_237.fe, NLoginCore_237.ff), (NLoginCore_237 != 0).fg),
   q(a(NLoginCore_237.fk & NLoginCore_237.fl, NLoginCore_237.fm), (NLoginCore_237 != 0).fn),
   r(a(NLoginCore_237.fr & NLoginCore_237.fs, NLoginCore_237.ft), (NLoginCore_237 != 0).fu),
   s(a(NLoginCore_237.fz, NLoginCore_237.ga), (NLoginCore_237 != 0).gb),
   t(a(NLoginCore_237.gg, NLoginCore_237.gh), (NLoginCore_237 != 0).gi),
   u(a(NLoginCore_237.gm, NLoginCore_237.gn ^ NLoginCore_237.go), (NLoginCore_237 != 0).gp),
   v(a(NLoginCore_237.gt, NLoginCore_237.gu ^ NLoginCore_237.gv), (NLoginCore_237 != 0).gw),
   w(a(NLoginCore_237.hb & NLoginCore_237.hc, NLoginCore_237.hd), (NLoginCore_237 != 0).he),
   x(a(NLoginCore_237.hi, NLoginCore_237.hj ^ NLoginCore_237.hk), (NLoginCore_237 != 0).hl),
   y(a(NLoginCore_237.hp, NLoginCore_237.hq ^ NLoginCore_237.hr), (NLoginCore_237 != 0).hs),
   z(a(NLoginCore_237.hx & NLoginCore_237.hy, NLoginCore_237.hz), (NLoginCore_237 != 0).ia),
   A(a(NLoginCore_237.var_if, NLoginCore_237.ig ^ NLoginCore_237.ih), (NLoginCore_237 != 0).ii),
   B(a(NLoginCore_237.in, NLoginCore_237.io ^ NLoginCore_237.ip), (NLoginCore_237 != 0).iq);

   final NLoginCore_474 e;
   final boolean aI;
   private static String[] ZKM_STR_A = new String[NLoginCore_237.at];
   private static String[] ZKM_STR_B = new String[NLoginCore_237.au];
   private static long c;
   private static int a = Integer.reverse(0);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int c = 0 >>> 10 | 0 << -10;
   private static int d = Integer.reverse(0);
   private static long e = Long.reverse(-6441350892108589533L);
   private static int f = Integer.reverse(0);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long h = Long.reverse(43832571304924707L);
   private static long i = Long.reverse(-6485183463413514240L);
   private static int j = 8192 >>> 108 | 8192 << ~108 + 1;
   private static long k = Long.reverse(43832571304924707L);
   private static long l = Long.reverse(-6485183463413514240L);
   private static int m = Integer.reverse(0);
   private static int n = Integer.reverse(-1073741824);
   private static long o = Long.reverse(43832571304924707L);
   private static long p = Long.reverse(-6485183463413514240L);
   private static int q = (117440512 >>> 214 | 117440512 << ~214 + 1) & -1;
   private static int r = Integer.reverse(0);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(1073741824);
   private static int u = Integer.reverse(-1073741824);
   private static int v = Integer.reverse(536870912);
   private static int w = 83886080 >>> 216 | 83886080 << ~216 + 1;
   private static int x = (100663296 >>> 248 | 100663296 << -248) & -1;
   private static int y = Integer.reverse(-536870912);
   private static int z = 2097152 >>> 178 | 2097152 << -178;
   private static int aa = -2147483644 >>> 223 | -2147483644 << -223;
   private static int ab = (20 >>> 129 | 20 << ~129 + 1) & -1;
   private static int ac = Integer.reverse(-805306368);
   private static int ad = (384 >>> 165 | 384 << ~165 + 1) & -1;
   private static int ae = Integer.reverse(-1342177280);
   private static int af = 114688 >>> 173 | 114688 << ~173 + 1;
   private static int ag = (15360 >>> 10 | 15360 << ~10 + 1) & -1;
   private static int ah = Integer.reverse(134217728);
   private static int ai = Integer.reverse(-2013265920);
   private static int aj = Integer.reverse(1207959552);
   private static int ak = 76 >>> 226 | 76 << -226;
   private static int al = Integer.reverse(671088640);
   private static int am = 168 >>> 99 | 168 << ~99 + 1;
   private static int an = Integer.reverse(1744830464);
   private static int ao = 23552 >>> 10 | 23552 << -10;
   private static int ap = 3072 >>> 39 | 3072 << -39;
   private static int aq = Integer.reverse(-1744830464);
   private static int ar = 104 >>> 66 | 104 << -66;
   private static int as = Integer.reverse(-671088640);
   private static int at = Integer.reverse(1006632960);
   private static int au = Integer.reverse(1006632960);
   private static int av = Integer.reverse(536870912);
   private static long aw = Long.reverse(-6441350892108589533L);
   private static int ax = Integer.reverse(0);
   private static int ay = Integer.reverse(-1610612736);
   private static long az = Long.reverse(43832571304924707L);
   private static long ba = Long.reverse(-6485183463413514240L);
   private static int bb = 196608 >>> 175 | 196608 << ~175 + 1;
   private static long bc = Long.reverse(43832571304924707L);
   private static long bd = Long.reverse(-6485183463413514240L);
   private static int be = Integer.reverse(Integer.MIN_VALUE);
   private static int bf = Integer.reverse(-536870912);
   private static long bg = Long.reverse(43832571304924707L);
   private static long bh = Long.reverse(-6485183463413514240L);
   private static int bi = (65536 >>> 205 | 65536 << -205) & -1;
   private static long bj = Long.reverse(43832571304924707L);
   private static long bk = Long.reverse(-6485183463413514240L);
   private static int bl = Integer.reverse(1073741824);
   private static int bm = ('退' >>> 236 | 36864 << -236) & -1;
   private static long bn = Long.reverse(43832571304924707L);
   private static long bo = Long.reverse(-6485183463413514240L);
   private static int bp = 64 >>> 230 | 64 << -230;
   private static int bq = Integer.reverse(1342177280);
   private static long br = Long.reverse(43832571304924707L);
   private static long bs = Long.reverse(-6485183463413514240L);
   private static int bt = Integer.reverse(-1073741824);
   private static int bu = (2883584 >>> 50 | 2883584 << -50) & -1;
   private static long bv = Long.reverse(-6441350892108589533L);
   private static int bw = (524288 >>> 211 | 524288 << -211) & -1;
   private static int bx = (402653184 >>> 249 | 402653184 << ~249 + 1) & -1;
   private static long by = Long.reverse(43832571304924707L);
   private static long bz = Long.reverse(-6485183463413514240L);
   private static int ca = Integer.reverse(536870912);
   private static int cb = Integer.reverse(-1342177280);
   private static long cc = Long.reverse(-6441350892108589533L);
   private static int cd = 16384 >>> 46 | 16384 << ~46 + 1;
   private static int ce = -1073741823 >>> 157 | -1073741823 << -157;
   private static long cf = Long.reverse(43832571304924707L);
   private static long cg = Long.reverse(-6485183463413514240L);
   private static int ch = (5120 >>> 10 | 5120 << ~10 + 1) & -1;
   private static int ci = -2147483641 >>> 31 | -2147483641 << ~31 + 1;
   private static long cj = Long.reverse(-6441350892108589533L);
   private static int ck = Integer.reverse(Integer.MIN_VALUE);
   private static int cl = Integer.reverse(134217728);
   private static long cm = Long.reverse(43832571304924707L);
   private static long cn = Long.reverse(-6485183463413514240L);
   private static int co = (12582912 >>> 245 | 12582912 << -245) & -1;
   private static int cp = Integer.reverse(-2013265920);
   private static long cq = Long.reverse(-6441350892108589533L);
   private static int cr = 16777216 >>> 184 | 16777216 << ~184 + 1;
   private static int cs = Integer.reverse(1207959552);
   private static long ct = Long.reverse(43832571304924707L);
   private static long cu = Long.reverse(-6485183463413514240L);
   private static int cv = Integer.reverse(-536870912);
   private static int cw = Integer.reverse(-939524096);
   private static long cx = Long.reverse(43832571304924707L);
   private static long cy = Long.reverse(-6485183463413514240L);
   private static int cz = Integer.reverse(Integer.MIN_VALUE);
   private static int da = 81920 >>> 12 | 81920 << -12;
   private static int db = -1 >>> 181 | -1 << ~181 + 1;
   private static long dc = Long.reverse(-6441350892108589533L);
   private static int dd = (8 >>> 32 | 8 << ~32 + 1) & -1;
   private static int de = 172032 >>> 237 | 172032 << ~237 + 1;
   private static long df = Long.reverse(43832571304924707L);
   private static long dg = Long.reverse(-6485183463413514240L);
   private static int dh = Integer.reverse(Integer.MIN_VALUE);
   private static int di = Integer.reverse(1744830464);
   private static long dj = Long.reverse(43832571304924707L);
   private static long dk = Long.reverse(-6485183463413514240L);
   private static int dl = Integer.reverse(-1879048192);
   private static int dm = 1543503872 >>> 58 | 1543503872 << ~58 + 1;
   private static long dn = Long.reverse(43832571304924707L);
   private static long var_do = Long.reverse(-6485183463413514240L);
   private static int dp = Integer.reverse(Integer.MIN_VALUE);
   private static int dq = 1536 >>> 6 | 1536 << ~6 + 1;
   private static long dr = Long.reverse(-6441350892108589533L);
   private static int ds = (40 >>> 130 | 40 << -130) & -1;
   private static int dt = Integer.reverse(-1744830464);
   private static int du = -1 >>> 184 | -1 << -184;
   private static long dv = Long.reverse(-6441350892108589533L);
   private static int dw = Integer.reverse(Integer.MIN_VALUE);
   private static int dx = Integer.reverse(1476395008);
   private static long dy = Long.reverse(-6441350892108589533L);
   private static int dz = 90112 >>> 109 | 90112 << ~109 + 1;
   private static int ea = Integer.reverse(-671088640);
   private static long eb = Long.reverse(-6441350892108589533L);
   private static int ec = Integer.reverse(Integer.MIN_VALUE);
   private static int ed = Integer.reverse(939524096);
   private static long ee = Long.reverse(-6441350892108589533L);
   private static int ef = 201326592 >>> 88 | 201326592 << -88;
   private static int eg = Integer.reverse(-1207959552);
   private static int eh = -1 >>> 211 | -1 << ~211 + 1;
   private static long ei = Long.reverse(-6441350892108589533L);
   private static int ej = (256 >>> 232 | 256 << ~232 + 1) & -1;
   private static int ek = 251658240 >>> 215 | 251658240 << ~215 + 1;
   private static long el = Long.reverse(43832571304924707L);
   private static long em = Long.reverse(-6485183463413514240L);
   private static int en = 212992 >>> 206 | 212992 << ~206 + 1;
   private static int eo = Integer.reverse(-134217728);
   private static long ep = Long.reverse(43832571304924707L);
   private static long eq = Long.reverse(-6485183463413514240L);
   private static int er = 1 >>> 192 | 1 << -192;
   private static int es = (32 >>> 96 | 32 << ~96 + 1) & -1;
   private static long et = Long.reverse(43832571304924707L);
   private static long eu = Long.reverse(-6485183463413514240L);
   private static int ev = (28 >>> 97 | 28 << -97) & -1;
   private static int ew = 132 >>> 66 | 132 << -66;
   private static int ex = (-1 >>> 48 | -1 << ~48 + 1) & -1;
   private static long ey = Long.reverse(-6441350892108589533L);
   private static int ez = 2 >>> 129 | 2 << -129;
   private static int fa = Integer.reverse(1140850688);
   private static long fb = Long.reverse(43832571304924707L);
   private static long fc = Long.reverse(-6485183463413514240L);
   private static int fd = -2147483641 >>> 127 | -2147483641 << -127;
   private static int fe = 2240 >>> 134 | 2240 << ~134 + 1;
   private static long ff = Long.reverse(-6441350892108589533L);
   private static int fg = (8 >>> 35 | 8 << -35) & -1;
   private static int fh = Integer.reverse(603979776);
   private static long fi = Long.reverse(-6441350892108589533L);
   private static int fj = (536870912 >>> 185 | 536870912 << -185) & -1;
   private static int fk = 19398656 >>> 115 | 19398656 << ~115 + 1;
   private static int fl = Integer.reverse(-1);
   private static long fm = Long.reverse(-6441350892108589533L);
   private static int fn = Integer.reverse(Integer.MIN_VALUE);
   private static int fo = 159383552 >>> 86 | 159383552 << -86;
   private static long fp = Long.reverse(-6441350892108589533L);
   private static int fq = Integer.reverse(-2013265920);
   private static int fr = Integer.reverse(-469762048);
   private static int fs = -1 >>> 33 | -1 << ~33 + 1;
   private static long ft = Long.reverse(-6441350892108589533L);
   private static int fu = Integer.reverse(Integer.MIN_VALUE);
   private static int fv = (81920 >>> 139 | 81920 << ~139 + 1) & -1;
   private static long fw = Long.reverse(43832571304924707L);
   private static long fx = Long.reverse(-6485183463413514240L);
   private static int fy = (-2147483644 >>> 190 | -2147483644 << -190) & -1;
   private static int fz = 164 >>> 162 | 164 << -162;
   private static long ga = Long.reverse(-6441350892108589533L);
   private static int gb = (16 >>> 36 | 16 << ~36 + 1) & -1;
   private static int gc = Integer.reverse(1409286144);
   private static int gd = (-1 >>> 100 | -1 << -100) & -1;
   private static long ge = Long.reverse(-6441350892108589533L);
   private static int gf = Integer.reverse(-939524096);
   private static int gg = Integer.reverse(-738197504);
   private static long gh = Long.reverse(-6441350892108589533L);
   private static int gi = Integer.reverse(Integer.MIN_VALUE);
   private static int gj = Integer.reverse(872415232);
   private static long gk = Long.reverse(-6441350892108589533L);
   private static int gl = Integer.reverse(671088640);
   private static int gm = 90 >>> 65 | 90 << ~65 + 1;
   private static long gn = Long.reverse(43832571304924707L);
   private static long go = Long.reverse(-6485183463413514240L);
   private static int gp = (512 >>> 201 | 512 << ~201 + 1) & -1;
   private static int gq = Integer.reverse(1946157056);
   private static long gr = Long.reverse(-6441350892108589533L);
   private static int gs = (11010048 >>> 179 | 11010048 << ~179 + 1) & -1;
   private static int gt = 47 >>> 96 | 47 << -96;
   private static long gu = Long.reverse(43832571304924707L);
   private static long gv = Long.reverse(-6485183463413514240L);
   private static int gw = Integer.reverse(Integer.MIN_VALUE);
   private static int gx = Integer.reverse(201326592);
   private static int gy = Integer.reverse(-1);
   private static long gz = Long.reverse(-6441350892108589533L);
   private static int ha = Integer.reverse(1744830464);
   private static int hb = Integer.reverse(-1946157056);
   private static int hc = (-1 >>> 60 | -1 << ~60 + 1) & -1;
   private static long hd = Long.reverse(-6441350892108589533L);
   private static int he = Integer.reverse(Integer.MIN_VALUE);
   private static int hf = (26214400 >>> 19 | 26214400 << ~19 + 1) & -1;
   private static long hg = Long.reverse(-6441350892108589533L);
   private static int hh = Integer.reverse(-402653184);
   private static int hi = 6528 >>> 39 | 6528 << -39;
   private static long hj = Long.reverse(43832571304924707L);
   private static long hk = Long.reverse(-6485183463413514240L);
   private static int hl = (8388608 >>> 119 | 8388608 << ~119 + 1) & -1;
   private static int hm = (3407872 >>> 112 | 3407872 << ~112 + 1) & -1;
   private static long hn = Long.reverse(-6441350892108589533L);
   private static int ho = Integer.reverse(402653184);
   private static int hp = Integer.reverse(-1409286144);
   private static long hq = Long.reverse(43832571304924707L);
   private static long hr = Long.reverse(-6485183463413514240L);
   private static int hs = Integer.reverse(Integer.MIN_VALUE);
   private static int ht = Integer.reverse(1811939328);
   private static int hu = -1 >>> 10 | -1 << ~10 + 1;
   private static long hv = Long.reverse(-6441350892108589533L);
   private static int hw = 409600 >>> 142 | 409600 << -142;
   private static int hx = (-1207959551 >>> 251 | -1207959551 << ~251 + 1) & -1;
   private static int hy = -1 >>> 12 | -1 << -12;
   private static long hz = Long.reverse(-6441350892108589533L);
   private static int ia = 1 >>> 128 | 1 << -128;
   private static int ib = -1073741823 >>> 219 | -1073741823 << ~219 + 1;
   private static int ic = Integer.reverse(-1);
   private static long id = Long.reverse(-6441350892108589533L);
   private static int ie = (3407872 >>> 177 | 3407872 << -177) & -1;
   private static int var_if = (1824 >>> 133 | 1824 << -133) & -1;
   private static long ig = Long.reverse(43832571304924707L);
   private static long ih = Long.reverse(-6485183463413514240L);
   private static int ii = Integer.reverse(Integer.MIN_VALUE);
   private static int ij = 243269632 >>> 118 | 243269632 << -118;
   private static long ik = Long.reverse(43832571304924707L);
   private static long il = Long.reverse(-6485183463413514240L);
   private static int im = '\ud800' >>> 'k' | 55296 << -107;
   private static int in = ('\uec00' >>> 'j' | 60416 << ~106 + 1) & -1;
   private static long io = Long.reverse(43832571304924707L);
   private static long ip = Long.reverse(-6485183463413514240L);
   private static int iq = Integer.reverse(Integer.MIN_VALUE);

   static {
      b();
   }

   private NLoginCore_237(String var3, boolean var4) {
      String[] var10001 = new String[b];
      var10001[c] = var3;
      this.e = NLoginCore_474.a(var10001);
      this.aI = var4;
   }

   @Override
   public NLoginCore_474 a() {
      return this.e;
   }

   private static String a(int var0, long var1) {
      var1 ^= 101L;
      var1 ^= 3086437069531566925L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(22 + 47),
                     (byte)(68 + 15),
                     47,
                     (byte)(14 + 53),
                     (byte)(8 + 58),
                     (byte)(49 + 18),
                     (byte)(8 + 39),
                     (byte)(56 + 24),
                     (byte)(15 + 60),
                     (byte)(53 + 14),
                     (byte)(22 + 61),
                     (byte)(9 + 44),
                     (byte)(33 + 47),
                     (byte)(64 + 33),
                     100,
                     (byte)(53 + 47),
                     (byte)(35 + 70),
                     (byte)(56 + 54),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), (byte)(78 + 5)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.A("ƾǋǊƍǍǉǄǍǘǇƔǒǖǏǒǘƚԡԲԲԡ\u0530ԢԺԼ", (byte)110, 65));
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
                  NLoginCore_237.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.B("ŃťŧŇūƊƂƘƄœƑƇƕƏŘŽƟƞƖƜƖū", (byte)78, 66), NLoginCore_237.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.B("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӡӲӲӡӰӢӺӼŮ", (byte)78, 66) + var1 + NLoginCore_091.A("ŕ", (byte)78, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   public int a() {
      return this.ordinal();
   }

   private NLoginCore_237(String var3) {
      this(var3, (a != 0));
   }

   @Override
   public Object a() {
      return this.aI ? Collections.singletonList(a(d, e) + this.e.a()[f] + a(g, h ^ i)) : a(j, k ^ l) + this.e.a()[m] + a(n, o ^ p);
   }

   private static void b() {
      c = -4293306673761756928L;
      long var0 = c ^ 3086437069531566925L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(25 + 44),
               (byte)(3 + 80),
               (byte)(35 + 12),
               (byte)(66 + 1),
               (byte)(25 + 41),
               (byte)(42 + 25),
               (byte)(15 + 32),
               (byte)(63 + 17),
               (byte)(32 + 43),
               67,
               83,
               (byte)(3 + 50),
               (byte)(32 + 48),
               (byte)(42 + 55),
               (byte)(2 + 98),
               (byte)(60 + 40),
               (byte)(16 + 89),
               (byte)(27 + 83),
               (byte)(23 + 80)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.F("ԭՙ՜ԿԵ՜ԙՔԦԻԪ՝ՅԥիԹըզըԭՓՔԵՅոԶՐ՚ՐՙԶՍյժչճՅցԾՀփՆըՂ՛՞լլ֎տ։Ւղք՛՜", (byte)44, 70);
               ZKM_STR_B[1] = NLoginCore_553.A("ńħĬœġĤŊŕĢňĐŚŏħķľĸŘĴĲţġŔţĳĳŧĦŭţŅŭ", (byte)44, 65);
               ZKM_STR_B[2] = NLoginCore_127.F("ԭՙ՜ԿԵ՜ԙՔԦԻԪ՝ՅԥիԹըզըԭՓՓՊշԳԺեեըԴԶԺչրս\u0557՚ջֈհտ՟օՐ", (byte)44, 70);
               ZKM_STR_B[3] = NLoginCore_446.F("ՕԸԽդԲԵ՛զԳՙԡիՠԸՈՏՉթՅՃմԲեմՄՄոԷվմՖվ", (byte)44, 70);
               ZKM_STR_B[4] = NLoginCore_433.C("Ҥѯѿҭңүҡ҄ҲұҶҥҺѺҀӀҽҸұӄҿҏҌҍ", (byte)44, 67);
               ZKM_STR_B[5] = NLoginCore_223.C("ѯҝ҃Ңҗ҂ѯҰѸҙҌғѸҰҍҍҭҼҙҍӁҏҌҍ", (byte)44, 67);
               ZKM_STR_B[6] = NLoginCore_076.E("Ֆԙ\u0530եԸԵՈԧգ՚ԧՉէԠԽ՚ՎձժԴՉդԻԼ", (byte)44, 69);
               ZKM_STR_B[7] = NLoginCore_427.C("ҨҀ҂ҧҟ҆ҥ҉ұҕҍѳҞҪҬҋҺґҜѼҞҟҌҍ", (byte)44, 67);
               ZKM_STR_B[8] = NLoginCore_232.B("įŃŒĐňŏğŖģňńĥŊħśŐŝœĬšĖřŢĲşĹŜľūŪĺŏįĮőĬţŲňţŰŉłĿ", (byte)44, 66);
               ZKM_STR_B[9] = NLoginCore_110.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃқҲң҆҆ӃҟҺҷҰҙӁҤӕҤҔңҦҋңҩҨҏҼҸҒӞҡӐҷҼӒҿҬҭ", (byte)44, 68);
               ZKM_STR_B[10] = NLoginCore_141.E("ՀՔգԡՙՠ\u0530էԴՙՕՆ\u0557դԭՂզ՚ՂղԯեԲՂՔչ՚ըչԽչմտգԾւՁ՜՜։ՕջդՋ՛փբևՌ՟Ր֔՝ք՛՜", (byte)44, 69);
               ZKM_STR_B[11] = NLoginCore_091.F("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՇէ\u0558ՕկԭԻՈյԵջԾՖ՜՜փՃՃՐձՀւՉծսթըւՊֆՎՏ֔՛՜", (byte)44, 70);
               ZKM_STR_B[12] = NLoginCore_091.D("ґҥҴѲҪұҁҸ҅ҪҩҊҸҬұҁҴѻґѻѸңҿғӃ҆ҶҨӋҜұҺҽҢүӇҭҐҢӏӂҹҰҡ", (byte)44, 68);
               ZKM_STR_B[13] = NLoginCore_427.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՈ\u0558ԪգՏԶպլ\u0557ճժՠԽ\u0558Փ՚ոօ՞՟գև\u0558պս՝կՙ\u0590բտյծ՛՜", (byte)44, 69);
               ZKM_STR_B[14] = NLoginCore_387.F("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁՅճԳՔԬնՄողԺԾԹԿՀՂջերՙթբնրՋտՇհՎռ՝ճղծ՛՜", (byte)44, 70);
               ZKM_STR_B[15] = NLoginCore_127.F("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղԾզլ\u0530ՊզձՋԹճպՁջփՙՃԾևՒզՓՕ՚ծթհՇ\u058bխ՟ղ֔խմղւ֒ծ֓֏֗՝ՙ", (byte)44, 70);
               ZKM_STR_B[16] = NLoginCore_453.E("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁՌՕզդ՚ՏՅ՝\u0557ՐռրՎ\u0557ՃՀհյՐ֊ՈռֈՋՍգՌբվ֑ֈ֔Վ\u0557֘յջշյօմէղ", (byte)44, 69);
               ZKM_STR_B[17] = NLoginCore_076.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҏҷҽҁқҷӂҜҊӄӋҚӌӋӁҲҢҴҨҕҘӕӋӟӌӖӗҫҝӍӣӤҸңҦӦҫҬӝӎӢӋӑӝӄӔӖӥӥӒӇҸӳӄӁ", (byte)44, 68);
               ZKM_STR_B[18] = NLoginCore_521.D("ґҥҴѲҪұҁҸ҅Ҫҩѽ҆ґҏҼ҂ҺҠҗҒҞӈҚҙҶӀҡӊҌқҌҌғҟӖүҏӘӄҖӏҶҰҿӖҨҹҷӎұҮӠҤӈұӞҾҵӣӟҹӝӢ", (byte)44, 68);
               ZKM_STR_B[19] = NLoginCore_110.A("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĭŕśğĹŕŠĺĨŢũĭŉĮĽųŶńĭšŌŚżőĽŕĿŹƀŻĹŞŏŜŲŞŒƁƂƅƊƆŁ", (byte)44, 65);
               ZKM_STR_B[20] = NLoginCore_521.C("ґҥҴѲҪұҁҸ҅ҪҩѺҾѽҹҒґҡңұҚҥҿҧңҿҖҬӍӋ҂ҿңҳҿҥҩӆҘҨӋӏҴҡ", (byte)44, 67);
               ZKM_STR_B[21] = NLoginCore_433.C("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҚӂӁҚҷҼҍҺӋ҉ҤҢҬҌҠӗӌӋғӌӃҰұҹҿҷҘӀҺҳҴҷӥҬҭ", (byte)44, 67);
               ZKM_STR_B[22] = NLoginCore_530.B("įŃŒĐňŏğŖģňŇěĤįĭŚĠŘľĵİĵŠġşħĪĶŜŬĬŮŇĻœĲŪşİŵŵŨŎĿ", (byte)44, 66);
               ZKM_STR_B[23] = NLoginCore_138.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղԾզլ\u0530ՊզձՋԹճպրւՙ՜Ց՟ձ՚ՃւևՉթՙոսցՏձղՌք՛՜", (byte)44, 69);
               ZKM_STR_B[24] = NLoginCore_521.F("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁԿՅԸմ՚՛\u0557ՒՎՈճրմՀճՒռք՝ՂՓըՌ\u058b\u0557ափՌեւդյծ՛՜", (byte)44, 70);
               ZKM_STR_B[25] = NLoginCore_173.C("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҏҷҽҁқҷӂҜҊӄӋҏӊҩҰғґӂәғӅһҦҕӑӈҭҽӏүҤӄұҚҶӄӠӄӫҩӤӄҧ", (byte)44, 67);
               ZKM_STR_B[26] = NLoginCore_427.C("ґҥҴѲҪұҁҸ҅ҪҨғҌґҵҗҴҼҜѷҾҼӆҝҁӊҊҢӂҞӁӁҤҩҊҫҶӋҏҵӛҮҦҼӓҿҘӍӟӒҢӑҢҝҦҧҽҶӝӭӘӨӡҪ", (byte)44, 67);
               ZKM_STR_B[27] = NLoginCore_004.C("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҐҟҲҶңҕҞӆӈӎҦӉҳӇӌҭҵҒӕӛғӒҕҶӀҬҩәҺӅӤҼӡӄӛҶӫӟҵӝӞӡӃ", (byte)44, 67);
               ZKM_STR_B[28] = NLoginCore_553.B("įŃŒĐňŏğŖģňŇěĤįĭŚĠŘľĵİĮĽĻļũĠłŕĶŁņŃŭŧĳŰşūŗŏĵŘŦŵůŖſōĳŚžĿőŧƂŚšŝŕƊŠƄŋ", (byte)44, 66);
               ZKM_STR_B[29] = NLoginCore_232.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĭŕśğĹŕŠĺĨŢũŎŭŢŝŁţŏŘŸŹŊŕŤŇœŝŨŢŽŤšĻŐłŒŹŸƀŭŃƄŸ", (byte)44, 66);
               ZKM_STR_B[30] = NLoginCore_141.F(
                  "ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁԿՎՌՍպԱՓզՇՒ\u0557ՔվոՄցհռըՠՆթշֆրէ\u0590՞Մի֏Ր՟ք\u058bօ֛հ՚֒ո֘֍֟տ\u058c՞շ֙֜մ֥֣։ը֢փզ֑ս֑լռհվջռ", (byte)44, 70
               );
               ZKM_STR_B[31] = NLoginCore_471.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĭŕśğĹŕŠĺĨŢũŎŭŢŝŁţŏŘŸŹŊŕŤŇœŝŨŢŽŤšķĿťƈőŁŷťƀŠŬŜƐŻſŨťƃŏŧƁŚŔƜƅſŵƖŬŹŹžŽŪū", (byte)44, 66);
               ZKM_STR_B[32] = NLoginCore_453.C("ґҥҴѲҪұҁҸ҅ҪҩѺҾѽҹҒґҡңұҚҡ҈ҟҫҪҶҺӋӅӊҞҡҝҼҮғ҉ҰүӗҹӄӍӎӒҒҡҘңӥҸҵӓӞӝӨҼӅӎҸҨӨӛ", (byte)44, 67);
               ZKM_STR_B[33] = NLoginCore_127.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՉձհՉզիԼթպԸՓՔրՠդֆէՖ\u0558ֈՅ\u0558ևՋօշզծ֒ֆՏ՝ն֍֏֎ՙ֑֛ևՐ֏՟ցՠիպ֝չ֪֡֓թևհ", (byte)44, 69);
               ZKM_STR_B[34] = NLoginCore_173.D("ґҥҴѲҪұҁҸ҅ҪҩѺҾѽҹҒґҡңұҚҦһӅӄҘ҃ҶҝүӋҺӁҿӌӇӓҖӃұҒҸӋҹӆҮҞҹӋӒӁӎҮӑҴҼӝһӚҪӀӞӣҿ", (byte)44, 68);
               ZKM_STR_B[35] = NLoginCore_232.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҚӂӁҚҷҼҍҺӋ҉ҤүҫҝҠҖӆҦҫғқӇӍӏҫһҷҽҠӥҜӒӥӣӞӡҹӆҼӃӧӠӬӅҮӑӤӭұӑӥӵӇӐӁ", (byte)44, 68);
               ZKM_STR_B[36] = NLoginCore_530.C("ґҥҴѲҪұҁҸ҅ҪҩѺҾѽҹҒґҡңұҚүҀқ҆Ҫ҈ӀҧҞ҂ҲӒҽҠҤґґӓҢҰҩҭӓҹҴҺҲӣҜӣӣӂӕҬҭ", (byte)44, 67);
               ZKM_STR_B[37] = NLoginCore_453.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՉձհՉզիԼթպԸՓ\u0557ԺՌպՏՏՆՇՕՒրՔսֆ֏ձրէՊՋՎՖշեաո֊շմ֛։պ", (byte)44, 69);
               ZKM_STR_B[38] = NLoginCore_004.F("ՀՔգԡՙՠ\u0530էԴՙ\u0557ԞԽե՟ՊԱՠ՝Ռ՝ՌժՖՅ՚Ւ՚Նղմ՝՞Ւչվ՝պդՈռՁ\u058c։\u0557՛՝ւՊց֒՜խծ՛՜", (byte)44, 70);
               ZKM_STR_B[39] = NLoginCore_433.F("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՂՋաՁխՉկՍչՍոՕւոգձՆՐռՓՀՊ\u0558ՕՄֈեՋևտւՕ֏զ֒֕պ\u0558֎զտյ՞", (byte)44, 70);
               ZKM_STR_B[40] = NLoginCore_553.C("ґҥҴѲҪұҁҸ҅ҪҨѯҎҶҰқ҂ұҮҝҮґҼӄҶӆҺҾҶӁҮ҈ҤӈҪҧӔңңҙҩүҗҚӕҕӈҫҸҾҸҷӃӕҬҭ", (byte)44, 67);
               ZKM_STR_B[41] = NLoginCore_575.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՂՋաՁխՉկՍչՍոբՎՐօ՛\u0558Ւէ՝՟՛շՕեՅդՍզՅւեծ\u058bք֙լչմ֖֒ղ֓", (byte)44, 69);
               ZKM_STR_B[42] = NLoginCore_092.B("įŃŒĐňŏğŖģňŇĥĕŋıęŒěİŀĶŒŖŚşĺġŞĵļŏĿŨįŒŌŜŌűłıŬŰıĸĺňŌĶŹšŠųųŊŋ", (byte)44, 66);
               ZKM_STR_B[43] = NLoginCore_241.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĻğńśğĽņŕļĥŅĹĪīŠŉĭŉĮűŷŶœĺŷŧĹœŢśŚŹļņŐſŻžŕŤśŖŅ", (byte)44, 66);
               ZKM_STR_B[44] = NLoginCore_451.E("ՀՔգԡՙՠ\u0530էԴՙՕՖԹՋ՜ՄՍԬՃղՄԾՒԳշՌյյիշԵՖԸՍԹչՖԿևրբ՚ո֊ծվ֏կՌֈկՓճ֔՛՜", (byte)44, 69);
               ZKM_STR_B[45] = NLoginCore_471.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՌՕՂէՙպՇՆԻԸՕՌ՞ւ\u0558ՑԸՑԺՅՒ՚։փՉֈ\u058cկ֎ժ՝Օ֔՛՜", (byte)44, 69);
               ZKM_STR_B[46] = NLoginCore_451.F("ՀՔգԡՙՠ\u0530էԴՙ\u0557ԪՆԾԯՙՂԼՅԱ՞ղՒճ\u0557հճԵջԾԵաՍՁհ՞ԿՑևՅգըֈԾզցք՛ֆւր֎֔ք՛՜", (byte)44, 70);
               ZKM_STR_B[47] = NLoginCore_575.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃґҒҶӀҗӅҷ҈ӈҋқҩҜҐҾӒӗӑҐҩӊҪӔҚӌҶҩҷҝӕӎӒӕҬҭ", (byte)44, 68);
               ZKM_STR_B[48] = NLoginCore_451.F("ՀՔգԡՙՠ\u0530էԴՙ\u0557եԬԥՁիդՄԼՂԭե՟ճըծթ՜ջԼմոհջվՐդգՆՂ։եփվՊՀ\u0590ՊՍաբդՠծ՛՜", (byte)44, 70);
               ZKM_STR_B[49] = NLoginCore_530.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĸťĽŨķţŀňĪĩŃŭŪŧńũŠŧųĸĳůńĮűŎĻśřūōŗƃŊŋ", (byte)44, 66);
               ZKM_STR_B[50] = NLoginCore_471.A("įŃŒĐňŏğŖģňŇļőŋňİĬŎĺţŝŘŢĿŦŝşĴŤŁŞŌįŊŮĽŕŌŷŔŲĹŊųĹŬŶŽňŘżšŎŅƁŽƃťƃƌšŌŧƅ", (byte)44, 65);
               ZKM_STR_B[51] = NLoginCore_004.B("ěŃĨŌňŒĵėřĩĴěŅŗļīĬĠķęĻŝĹŠņĽŋĹŁōřŞĭŏİĿŒūŅŗŪŚőŌĵũżŕňŒŖōŌŕőŗŲƇƉƇņřƄŅ", (byte)44, 66);
               ZKM_STR_B[52] = NLoginCore_521.E("ՀՔգԡՙՠ\u0530էԴՙ\u0558Սբ՜ՙՁԽ՟ՋմծթճՐշծհՅյՒկ՝ԺՂԺշշՃՅմփՕՂ\u0558ֈՄ՞ծևք\u058bքՋ՞՛՜", (byte)44, 69);
               ZKM_STR_B[53] = NLoginCore_232.F("ԬՔԹ՝ՙգՆԨժԺՅԬՖըՍԼԽԱՈԪՌծՊձ\u0557Վ՜ՊՒ՞ժկղյԻՄԷՅ՟դՃղչքեՌ՝հՙօէճ֏՞՛՜", (byte)44, 70);
               ZKM_STR_B[54] = NLoginCore_530.B("įŃŒĐňŏğŖģňŇŅőŘĘĳĸŘŌĺĢťŃİŀĽĢĴĨŇīŞĩįĬŊŲšŪŠŶšĹĿ", (byte)44, 66);
               ZKM_STR_B[55] = NLoginCore_397.F("ԬՔԹ՝ՙգՆԨժԺՅ՛բԩՐ՜ՅՃըժհՕԳՉղգհլ՞ս՚ՕռՒՒվՓգհնէՂիՐ", (byte)44, 70);
               ZKM_STR_B[56] = NLoginCore_110.A("įŃŒĐňŏğŖģňŇŅőŘĘĳĸŘŌĺĢėŜŧňħĽŘĢŇŚşŜűńŭŔŭĭŉŦŌıĿ", (byte)44, 65);
               ZKM_STR_B[57] = NLoginCore_521.C("ѽҥҊҮҪҴҗѹһҋҖҬҳѺҡҭҖҔҹһӁҟѿҳҖӄ҆ҘҠӈҜҭӄҰӋҕҮӎҴӒӈәӆҡ", (byte)44, 67);
               ZKM_STR_B[58] = NLoginCore_553.A("įŃŒĐňŏğŖģňŇŅőŘĘĳĸŘŌĺĢťšŨŗłŖĦŁŁŬŜľōŢŏŕŔűĭĳŤŖŵŷŗŜĵŔŕŠœŲƃŊŋ", (byte)44, 65);
               ZKM_STR_B[59] = NLoginCore_433.A("ěŃĨŌňŒĵėřĩĴŊőĘĿŋĴĲŗřşŏŖťĸŗĴūŜŤţŭŋńňĲĭşōŢųŦŨŉĶŗĴōŴŷĹſůƃŊŋ", (byte)44, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.A("ĜňŋĮĤŋĈŃĕĪęŌĴĔŚĨŗŕŗĜłŃĤĴŧĥĿŉĿňĥļŤřŨŢĴŰĭįŲĵřŦťřĽļőōĸŝřųŊŋ", (byte)44, 65);
               ZKM_STR_B[1] = NLoginCore_324.F("ՕԸԽդԲԵ՛զԳՙԡիՠԸՈՏՉթՅՃմշլիծհՆ\u0557ՌՔչՖ", (byte)44, 70);
               ZKM_STR_B[2] = NLoginCore_446.C("ѾҪҭҐ҆ҭѪҥѷҌѻҮҖѶҼҊҹҷҹѾҤҤқӈ҄ҋҶҶҹ҅҇ҋҤҰҾӉҍҨҢӊҗҷқҡ", (byte)44, 67);
               ZKM_STR_B[3] = NLoginCore_076.D("Ҧ҉Ҏҵ҃҆Ҭҷ҄ҪѲҼұ҉ҙҠҚҺҖҔӅ҇ҳҷӃҷңҊ҆ҏҧҮ", (byte)44, 68);
               ZKM_STR_B[4] = NLoginCore_384.E("ՓԞԮ՜Ւ՞ՐԳաՠէԬեթաՙգԯլԼՌՎԻԼ", (byte)44, 69);
               ZKM_STR_B[5] = NLoginCore_223.A("čĻġŀĵĠčŎĖķĬĤĦĕĘĸœŏĚřĲŕĠŤĵŅļľŠĶũŚ", (byte)44, 65);
               ZKM_STR_B[6] = NLoginCore_110.F("Ֆԙ\u0530եԸԵՈԧգ՚ԨՇԭ՜՛ծձա՟ժՂՁԳմԲ\u0530ՙՆԵջտկ", (byte)44, 70);
               ZKM_STR_B[7] = NLoginCore_324.C("ҨҀ҂ҧҟ҆ҥ҉ұҕҌҶҰҝҵҗҒҚҵҹҺѽҒңӋҘӉӋӄҰҜҦ", (byte)44, 67);
               ZKM_STR_B[8] = NLoginCore_183.B("įŃŒĐňŏğŖģňńĥŊħśŐŝœĬšĖřŢĲşĹŜľūŪĺŏĦŜņŞĽňňŘŦŸķŇűŔřľœĺœőţŝŊŋ", (byte)44, 66);
               ZKM_STR_B[9] = NLoginCore_559.C("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃқҲң҆҆ӃҟҺҷҰҙӁҤӕҤҔңҦҋңҩҩҺӑҖһӂӏӒӚңӔҿҬҭ", (byte)44, 67);
               ZKM_STR_B[10] = NLoginCore_004.F("ՀՔգԡՙՠ\u0530էԴՙՕՆ\u0557դԭՂզ՚ՂղԯեԲՂՔչ՚ըչԽչմտգԾւՁ՜՜։ՕջդվրքՊՊ՝եՅ֎՝֔՛՜", (byte)44, 70);
               ZKM_STR_B[11] = NLoginCore_183.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҘҸҩҦӀѾҌҙӆ҆ӌҏҧҭҭӔҔҔҡӂґӒӝӔқҭҠҸӓҝҜҝӧҾӤӪҺҺҩҽӯӋӲ", (byte)44, 68);
               ZKM_STR_B[12] = NLoginCore_324.F("ՀՔգԡՙՠ\u0530էԴՙ\u0558Թէ՛ՠ\u0530գԪՀԪԧՒծՂղԵե\u0557պՋՠթջՠԹԶ՛շֈԾրևԽՆ֍ևՁդ֊ճՓ՝Վ֔՛՜", (byte)44, 70);
               ZKM_STR_B[13] = NLoginCore_004.F("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՈ\u0558ԪգՏԶպլ\u0557ճժՠԽ\u0558Փ՚ոօ՞՟գֆյ՞ֈՠգ\u0590էխէֈծ՛՜", (byte)44, 70);
               ZKM_STR_B[14] = NLoginCore_433.A("įŃŒĐňŏğŖģňŇěĤįĭŚĠŘľĵİĴŢĢŃěťĳŧšĩĭĨĮįıŪŔůňŘőŧŗůŏŨļųŞŜŲĿŅŀőŨŖżƀŞƁŚƐ", (byte)44, 65);
               ZKM_STR_B[15] = NLoginCore_427.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҏҷҽҁқҷӂҜҊӄӋҒӌӔҪҔҏӘңҷҤҦҫҿҺӁҘӜҾҰӃӥҰӛҷҵҴӪӈӫӭӠӏ", (byte)44, 68);
               ZKM_STR_B[16] = NLoginCore_173.F("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁՌՕզդ՚ՏՅ՝\u0557ՐռրՎ\u0557ՃՀհյՐ֊ՈռֈՋՍգՌբվ֑ֈ֔֗շ\u0558հհ։իձ֜֎մ֢֚֓֕֔յգ֣֢ֆ֩հ", (byte)44, 70);
               ZKM_STR_B[17] = NLoginCore_324.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĭŕśğĹŕŠĺĨŢũĸŪũşŐŀŒņĳĶųũŽŪŴŵŉĻūƁƂŖŁńƄŉŊŻŬƀũůţōƏƆųŐƔſƋźƘş", (byte)44, 66);
               ZKM_STR_B[18] = NLoginCore_127.F("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁՍշՉՈեկՐչԻՊԻԻՂՎօ՞ԾևճՅվե՟ծօ\u0557ըզսՠ՝֏֕րՒծյֆ֝՚թ֖֞", (byte)44, 70);
               ZKM_STR_B[19] = NLoginCore_433.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҏҷҽҁқҷӂҜҊӄӋҏҫҐҟӕӘҦҏӃҮҼӞҳҟҷҡӛӢӝқӀһӚӣӊӬӔҸӗӇӣӢҽҮӌҲӪӋӘҸӬӻӐӁ", (byte)44, 68);
               ZKM_STR_B[20] = NLoginCore_183.A("įŃŒĐňŏğŖģňŇĘŜěŗİįĿŁŏĸŃŝŅŁŝĴŊūũĠŝŦśĲŪńťŇıŕĸŎĿ", (byte)44, 65);
               ZKM_STR_B[21] = NLoginCore_091.A("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĸŠşĸŕŚīŘũħłŀŊĪľŵŪũıŪšŎŚňŨŲŠļŮœőŰƃŊŋ", (byte)44, 65);
               ZKM_STR_B[22] = NLoginCore_453.C("ґҥҴѲҪұҁҸ҅Ҫҩѽ҆ґҏҼ҂ҺҠҗҒҗӂ҃Ӂ҉ҌҘҾӎҎӐҤӌӑӁҔӗҳҫӎҮӛӆҫҿұӜӛӒҹӕӎҿҬҭ", (byte)44, 67);
               ZKM_STR_B[23] = NLoginCore_521.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղԾզլ\u0530ՊզձՋԹճպրւՙ՜Ց՟ձ՚Ճւֆ։նեՆՙՊՐխճխ\u058b\u0590Տՙ\u0558չ\u0590ծմ֗֝", (byte)44, 69);
               ZKM_STR_B[24] = NLoginCore_141.B("įŃŒĐňŏğŖģňŇěĤįĭŚĠŘľĵİĮĴħţŉŊņŁĽķŢůţįŢŁūųŌıłŖŇĹļŎŵŋşƃƄŴƃŊŋ", (byte)44, 66);
               ZKM_STR_B[25] = NLoginCore_384.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղԾզլ\u0530ՊզձՋԹճպԾչ\u0558՟ՂՀձֈՂմժՕՄրշ՜լվ՞ՓճթՒշագդ֙՜Րյ՜", (byte)44, 69);
               ZKM_STR_B[26] = NLoginCore_127.F("ՀՔգԡՙՠ\u0530էԴՙ\u0557ՂԻՀդՆգիՋԦխիյՌ\u0530չԹՑձՍհհՓ\u0558Թ՚եպԾդ֊՝ՕիւծՇռ֎ցՑրՑՏ\u058cըՙՔ֔զ՛՞֜ց", (byte)44, 70);
               ZKM_STR_B[27] = NLoginCore_397.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĮĽŐŔŁĳļŤŦŬńŧőťŪŋœİųŹıŰĳŔŞŊŇŷŘţƂŚŻŃžřŢŪƇƃŧťŊŊƍŽŜƅƓŪůŧƒőş", (byte)44, 66);
               ZKM_STR_B[28] = NLoginCore_232.E("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԬԵՀԾիԱթՏՆՁԿՎՌՍպԱՓզՇՒ\u0557ՔվոՄցհռըՠՆթշֆրէ\u0590՞Մի֏ՐիֆՎ֕Ֆչ֑։հտ֜", (byte)44, 69);
               ZKM_STR_B[29] = NLoginCore_453.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҏҷҽҁқҷӂҜҊӄӋҰӏӄҿңӅұҺӚӛҬҷӆҩҵҿӊӄӟӆӃңӃӉӜӅҢӃӘӦӰӥӪӣӪҬӴӈӴӺӻӒӲӁ", (byte)44, 68);
               ZKM_STR_B[30] = NLoginCore_397.C("ґҥҴѲҪұҁҸ҅Ҫҩѽ҆ґҏҼ҂ҺҠҗҒҐҟҝҞӋ҂ҤҷҘңҨҥӏӉҕӒӁӍҹұҗҺӈӗӑҸӡүҕҼӠҡҰӕӜӖӬӁҫӣӉөӞӰӐӝүӈӪӭӅӶӴӚҽӳӸӕӢӸӰԁӯӏӟӌӍ", (byte)44, 67);
               ZKM_STR_B[31] = NLoginCore_521.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĭŕśğĹŕŠĺĨŢũŎŭŢŝŁţŏŘŸŹŊŕŤŇœŝŨŢŽŤšķĿťƈőŁŷťƀŠŬŜƐŻſŨťƃŏŧƁŌƈŔŷŵƉƞƓƠŬŽƃƔƛƘƗžŵƊƬƞƬ", (byte)44, 66);
               ZKM_STR_B[32] = NLoginCore_092.E("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԩխԬըՁՀՐՒՠՉՐԷՎ՚ՙեթպմչՍՐՌի՝ՂԸ՟՞ֆըճռսցՁՐՇՒ֔էդղեյն֘կՓզևֈ֑", (byte)44, 69);
               ZKM_STR_B[33] = NLoginCore_127.A("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĸŠşĸŕŚīŘũħłŃůŏœŵŖŅŇŷĴŇŶĺŴŦŕŝƁŵľŌťżžŽňƀƊŶĿžŎƌƅŧſƆƒƌŗƋŪŶş", (byte)44, 65);
               ZKM_STR_B[34] = NLoginCore_324.A("įŃŒĐňŏğŖģňŇĘŜěŗİįĿŁŏĸńřţŢĶġŔĻōũŘşŝŪťűĴšŏİŖũŗŤŌļŗũŰşŬŌšņŇŃŸŚžŅŌŦŋŚżůƈŪűŎƈƂƔƔş", (byte)44, 65);
               ZKM_STR_B[35] = NLoginCore_223.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҚӂӁҚҷҼҍҺӋ҉ҤүҫҝҠҖӆҦҫғқӇӍӏҫһҷҽҠӥҜӒӥӣӞӡҹӆҼӃӧӠӬӪӧҴҰұҮӂӅӤӏҵӥӮӮӜҺӱӰӾӰӗӟӌӍ", (byte)44, 68);
               ZKM_STR_B[36] = NLoginCore_092.B("įŃŒĐňŏğŖģňŇĘŜěŗİįĿŁŏĸōĞĹĤňĦŞŅļĠŐŰśľłįįűŀŎŇŋŎŰŌŉŴŌŘőŮłŹžƆŚƈƆŖƀŖŞƈ", (byte)44, 66);
               ZKM_STR_B[37] = NLoginCore_201.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšĸŠşĸŕŚīŘũħłņĩĻũľľĵĶńŁůŃŬŵžŠůŖĹĺĽłŏŰņŷŸŹƀŵŽſ", (byte)44, 66);
               ZKM_STR_B[38] = NLoginCore_324.A("įŃŒĐňŏğŖģňņčĬŔŎĹĠŏŌĻŌĻřŅĴŉŁŉĵšţŌōŁŨŭŌũœķūİźŔŇĻňşũĻŋśŒōŊŋ", (byte)44, 65);
               ZKM_STR_B[39] = NLoginCore_241.A("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšıĺŐİŜĸŞļŨļŧńűŧŒŠĵĿūłįĹŇńĳŷŔĺŶŮűńŸŁţƀƅƅţƃũƊź", (byte)44, 65);
               ZKM_STR_B[40] = NLoginCore_427.E("ՀՔգԡՙՠ\u0530էԴՙ\u0557ԞԽե՟ՊԱՠ՝Ռ՝Հիճեյթխեհ՝ԷՓշՙՖփՒՒՈ\u0558՞ՈջՠՄխՠ՜՜՞Պփ֔՛՜", (byte)44, 69);
               ZKM_STR_B[41] = NLoginCore_451.B("ěŃĨŌňŒĵėřĩĵŖŇīĩĻœįğĹšıĺŐİŜĸŞļŨļŧőĽĿŴŊŇŁŖŌŎŊŦńŔĴœļŕĴűŔŢůńĿƉƇňŕŢŹř", (byte)44, 66);
               ZKM_STR_B[42] = NLoginCore_110.E("ՀՔգԡՙՠ\u0530էԴՙ\u0558ԶԦ՜ՂԪգԬՁՑՇգէիհՋԲկՆՍՠՐչՀգ՝խ՝ւՓՂսց\u058b։֎ՊևՍէիձս֊ճգ֍ձը֒՝խ֟\u058c", (byte)44, 69);
               ZKM_STR_B[43] = NLoginCore_091.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՌ\u0530Օլ\u0530Վ\u0557զՍԶՖՊԻԼձ՚Ծ՚ԿւֈևդՋֈոՊդճլի֊Տզ֊\u058b֚դ֚֗ժ֏ձ", (byte)44, 69);
               ZKM_STR_B[44] = NLoginCore_451.D("ґҥҴѲҪұҁҸ҅ҪҦҧҊҜҭҕҞѽҔӃҕҏң҄ӈҝӆӆҼӈ҆ҧ҉ҞҊӊҧҐӘӑҳҫӇӇҞӓқӁӍҺӏҽӤүҬҭ", (byte)44, 68);
               ZKM_STR_B[45] = NLoginCore_141.D("ѽҥҊҮҪҴҗѹһҋҗҸҩҍҋҝҵґҁқӃҝҦғҸҪӋҘҗҌ҉ҦҝүӓҩҢ҉ҢҋҖңҨҖҘҝӋӀӕҜҭӢәҶӒӥҨөӟҬәӤҰӱ", (byte)44, 68);
               ZKM_STR_B[46] = NLoginCore_453.F("ՀՔգԡՙՠ\u0530էԴՙ\u0557ԪՆԾԯՙՂԼՅԱ՞ղՒճ\u0557հճԵջԾԵաՍՁհ՞ԿՑևՅգըօէևոըՠ֍՜իՆ֖ծ՛՜", (byte)44, 70);
               ZKM_STR_B[47] = NLoginCore_091.E("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՀՁեկՆմզԷշԺՊ\u0558ՋԿխցֆրԿ\u0558չ՚ՠշգզ՜ժՠբձկց՟չ\u058cխգծ֜ո֠֔", (byte)44, 69);
               ZKM_STR_B[48] = NLoginCore_324.D("ґҥҴѲҪұҁҸ҅ҪҨҶѽѶҒҼҵҕҍғѾҶҰӄҹҿҺҭӌҍӅӉӁӌӏҡҵҴҗғӚҶӓӜәҿҝҝӂӐҜҜӢӕҬҭ", (byte)44, 68);
               ZKM_STR_B[49] = NLoginCore_232.F("ԬՔԹ՝ՙգՆԨժԺՆէ\u0558ԼԺՌդՀ\u0530ՊղՉնՎչՈմՑՙԻԺՔվջոՕպձոքՉՄրգզ՜է֑֎ՈՑՒ֖ՠ֑֍Ր\u0557դ՚օպ՛ո", (byte)44, 70);
               ZKM_STR_B[50] = NLoginCore_241.D("ґҥҴѲҪұҁҸ҅ҪҩҞҳҭҪҒҎҰҜӅҿҺӄҡӈҿӁҖӆңӀҮґҬӐҟҷҮәҶӔқҬӕқӎӘӟҪҺӞӃҰҤӥӢӒӨӬӛҪҿҹө", (byte)44, 68);
               ZKM_STR_B[51] = NLoginCore_471.C("ѽҥҊҮҪҴҗѹһҋҖѽҧҹҞҍҎ҂ҙѻҝҿқӂҨҟҭқңүһӀҏұҒҡҴӍҧҹӌҼҳҮҗӋӞҷҪҴҸүҮҷӤҧӈҹӆӬҼӍӅӋ", (byte)44, 67);
               ZKM_STR_B[52] = NLoginCore_575.C("ґҥҴѲҪұҁҸ҅ҪҩҞҳҭҪҒҎҰҜӅҿҺӄҡӈҿӁҖӆңӀҮҋғҋӈӈҔҖӅӔҦҖҥҐәӊҘҾӍҹҜӛӅҳҿӁҽҿӆҦӥӬӌ", (byte)44, 67);
               ZKM_STR_B[53] = NLoginCore_427.E("ԬՔԹ՝ՙգՆԨժԺՅԬՖըՍԼԽԱՈԪՌծՊձ\u0557Վ՜ՊՒ՞ժկղյԻՄԷՅ՟դՃղչշՠն՛կՊՈՉքբշրճ֎զՓօ֔Ր֍Ւ", (byte)44, 69);
               ZKM_STR_B[54] = NLoginCore_076.D("ґҥҴѲҪұҁҸ҅ҪҩҧҳҺѺҕҚҺҮҜ҄ӇҥҒҢҟ҄ҖҊҩҍӀӂҾӈҫҍҿҒӃӒҔҼҡ", (byte)44, 68);
               ZKM_STR_B[55] = NLoginCore_141.B("ěŃĨŌňŒĵėřĩĴŊőĘĿŋĴĲŗřşńĢĸšŒşśōŬŉńĹńŋĬĪİĳŇųŔŴĿ", (byte)44, 66);
               ZKM_STR_B[56] = NLoginCore_138.C("ґҥҴѲҪұҁҸ҅ҪҩҧҳҺѺҕҚҺҮҜ҄ѹҾӉҪ҉ҟҺ҄ҩҼӁӆӅӓҩӗӃӍҮҸғҷҪӆҹӊҲҠҕҺӘҟүҬҭ", (byte)44, 67);
               ZKM_STR_B[57] = NLoginCore_138.B("ěŃĨŌňŒĵėřĩĴŊőĘĿŋĴĲŗřşĽĝőĴŢĤĶľŦĺŋĺŎŉĻœŦĵŘŉŒĵĿ", (byte)44, 66);
               ZKM_STR_B[58] = NLoginCore_397.D("ґҥҴѲҪұҁҸ҅ҪҩҧҳҺѺҕҚҺҮҜ҄ӇӃӊҹҤҸ҈ңңӎҾҠүӄұҷҶӓҏҕӆһӎӒӞӜӕҫҙҚӦҜӕҬҭ", (byte)44, 68);
               ZKM_STR_B[59] = NLoginCore_173.E("ԬՔԹ՝ՙգՆԨժԺՅ՛բԩՐ՜ՅՃըժհՠէնՉըՅռխյմվ՜ՕՙՃԾհ՞ճքշռմ՞ՅխՏՏթթձած՛՜", (byte)44, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.F("՜աԱՁԻԠԯՅԛՠԷ\u0530", (byte)44, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.E("ԽԾԳՄՎԳԯՉԾ՜Կ՛ԭծ՜ձ՝ՐԬհ՟դԻԼ", (byte)44, 69);
         }
      }
   }

   @Override
   public NLoginCore_208 a() {
      throw new UnsupportedOperationException();
   }
}
