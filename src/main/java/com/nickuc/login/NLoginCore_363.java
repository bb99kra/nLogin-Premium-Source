package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_363 implements NLoginInterface_005 {
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
   l,
   m,
   n,
   o,
   p,
   q,
   r,
   s,
   t;

   private static final NLoginCore_208 j = new NLoginCore_208(a(NLoginCore_363.ky & NLoginCore_363.kz, NLoginCore_363.la), values().length);
   private final NLoginCore_474 j;
   private final Object r;
   private static String[] a = new String[NLoginCore_363.ar];
   private static String[] b = new String[NLoginCore_363.as];
   private static long c;
   private static int a = Integer.reverse(-1879048192);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int c = 0 >>> 16 | 0 << -16;
   private static int d = (0 >>> 30 | 0 << -30) & -1;
   private static long e = Long.reverse(1072649912062527245L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-2818460165985581299L);
   private static long h = Long.reverse(-3026418949592973312L);
   private static int i = Integer.reverse(1073741824);
   private static int j = Integer.reverse(-1);
   private static long k = Long.reverse(1072649912062527245L);
   private static int l = (0 >>> 139 | 0 << -139) & -1;
   private static int m = (786432 >>> 18 | 786432 << ~18 + 1) & -1;
   private static int n = (-1 >>> 173 | -1 << -173) & -1;
   private static long o = Long.reverse(1072649912062527245L);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int q = (0 >>> 179 | 0 << -179) & -1;
   private static int r = (0 >>> 210 | 0 << -210) & -1;
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = 0 >>> 144 | 0 << -144;
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int v = 0 >>> 133 | 0 << ~133 + 1;
   private static int w = (40 >>> 129 | 40 << ~129 + 1) & -1;
   private static int x = 0 >>> 30 | 0 << ~30 + 1;
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int z = 4 >>> 97 | 4 << -97;
   private static int aa = (6144 >>> 107 | 6144 << -107) & -1;
   private static int ab = (524288 >>> 49 | 524288 << ~49 + 1) & -1;
   private static int ac = (671088640 >>> 27 | 671088640 << ~27 + 1) & -1;
   private static int ad = ('쀀' >>> 237 | 49152 << -237) & -1;
   private static int ae = Integer.reverse(-536870912);
   private static int af = Integer.reverse(268435456);
   private static int ag = (144 >>> 100 | 144 << -100) & -1;
   private static int ah = Integer.reverse(1342177280);
   private static int ai = Integer.reverse(-805306368);
   private static int aj = (1610612736 >>> 91 | 1610612736 << -91) & -1;
   private static int ak = Integer.reverse(-1342177280);
   private static int al = (28 >>> 1 | 28 << ~1 + 1) & -1;
   private static int am = (503316480 >>> 153 | 503316480 << ~153 + 1) & -1;
   private static int an = Integer.reverse(134217728);
   private static int ao = -2147483640 >>> 255 | -2147483640 << -255;
   private static int ap = (4718592 >>> 178 | 4718592 << ~178 + 1) & -1;
   private static int aq = 152 >>> 99 | 152 << -99;
   private static int ar = 65 >>> 32 | 65 << -32;
   private static int as = Integer.reverse(-2113929216);
   private static int at = Integer.reverse(536870912);
   private static long au = Long.reverse(-2818460165985581299L);
   private static long av = Long.reverse(-3026418949592973312L);
   private static int aw = 0 >>> 129 | 0 << ~129 + 1;
   private static int ax = (134217728 >>> 154 | 134217728 << -154) & -1;
   private static int ay = Integer.reverse(0);
   private static int az = 2560 >>> 73 | 2560 << -73;
   private static long ba = Long.reverse(-2818460165985581299L);
   private static long bb = Long.reverse(-3026418949592973312L);
   private static int bc = Integer.reverse(Integer.MIN_VALUE);
   private static int bd = (3072 >>> 73 | 3072 << -73) & -1;
   private static long be = Long.reverse(-2818460165985581299L);
   private static long bf = Long.reverse(-3026418949592973312L);
   private static int bg = (0 >>> 230 | 0 << -230) & -1;
   private static int bh = (448 >>> 230 | 448 << ~230 + 1) & -1;
   private static long bi = Long.reverse(-2818460165985581299L);
   private static long bj = Long.reverse(-3026418949592973312L);
   private static int bk = (512 >>> 137 | 512 << -137) & -1;
   private static int bl = (4096 >>> 107 | 4096 << ~107 + 1) & -1;
   private static int bm = (0 >>> 175 | 0 << ~175 + 1) & -1;
   private static int bn = Integer.reverse(268435456);
   private static int bo = Integer.reverse(-1);
   private static long bp = Long.reverse(1072649912062527245L);
   private static int bq = 2097152 >>> 117 | 2097152 << ~117 + 1;
   private static int br = Integer.reverse(-1879048192);
   private static int bs = Integer.reverse(-1);
   private static long bt = Long.reverse(1072649912062527245L);
   private static int bu = (81920 >>> 205 | 81920 << -205) & -1;
   private static int bv = Integer.reverse(-1);
   private static long bw = Long.reverse(1072649912062527245L);
   private static int bx = Integer.reverse(-805306368);
   private static int by = Integer.reverse(-1);
   private static long bz = Long.reverse(1072649912062527245L);
   private static int ca = Integer.reverse(1073741824);
   private static int cb = Integer.reverse(1073741824);
   private static int cc = (0 >>> 243 | 0 << ~243 + 1) & -1;
   private static int cd = Integer.reverse(805306368);
   private static int ce = -1 >>> 250 | -1 << -250;
   private static long cf = Long.reverse(1072649912062527245L);
   private static int cg = Integer.reverse(Integer.MIN_VALUE);
   private static int ch = Integer.reverse(-1342177280);
   private static int ci = -1 >>> 43 | -1 << ~43 + 1;
   private static long cj = Long.reverse(1072649912062527245L);
   private static int ck = 16777216 >>> 248 | 16777216 << ~248 + 1;
   private static int cl = Integer.reverse(1879048192);
   private static long cm = Long.reverse(1072649912062527245L);
   private static int cn = Integer.reverse(-1073741824);
   private static int co = (4194304 >>> 214 | 4194304 << -214) & -1;
   private static int cp = (0 >>> 163 | 0 << ~163 + 1) & -1;
   private static int cq = (983040 >>> 48 | 983040 << ~48 + 1) & -1;
   private static long cr = Long.reverse(-2818460165985581299L);
   private static long cs = Long.reverse(-3026418949592973312L);
   private static int ct = 8388608 >>> 215 | 8388608 << -215;
   private static int cu = 128 >>> 35 | 128 << -35;
   private static long cv = Long.reverse(-2818460165985581299L);
   private static long cw = Long.reverse(-3026418949592973312L);
   private static int cx = Integer.reverse(536870912);
   private static int cy = (384 >>> 71 | 384 << -71) & -1;
   private static int cz = Integer.reverse(0);
   private static int da = Integer.reverse(-2013265920);
   private static int db = (-1 >>> 48 | -1 << -48) & -1;
   private static long dc = Long.reverse(1072649912062527245L);
   private static int dd = (16384 >>> 238 | 16384 << -238) & -1;
   private static int de = (75497472 >>> 214 | 75497472 << -214) & -1;
   private static long df = Long.reverse(1072649912062527245L);
   private static int dg = (4096 >>> 107 | 4096 << -107) & -1;
   private static int dh = Integer.reverse(-939524096);
   private static long di = Long.reverse(1072649912062527245L);
   private static int dj = (0 >>> 152 | 0 << ~152 + 1) & -1;
   private static int dk = (167772160 >>> 23 | 167772160 << ~23 + 1) & -1;
   private static long dl = Long.reverse(1072649912062527245L);
   private static int dm = 10485760 >>> 181 | 10485760 << ~181 + 1;
   private static int dn = Integer.reverse(1073741824);
   private static int var_do = Integer.reverse(0);
   private static int dp = Integer.reverse(-1476395008);
   private static long dq = Long.reverse(-2818460165985581299L);
   private static long dr = Long.reverse(-3026418949592973312L);
   private static int ds = 32 >>> 5 | 32 << ~5 + 1;
   private static int dt = (1441792 >>> 80 | 1441792 << ~80 + 1) & -1;
   private static int du = Integer.reverse(-1);
   private static long dv = Long.reverse(1072649912062527245L);
   private static int dw = Integer.reverse(0);
   private static int dx = 1879048193 >>> 252 | 1879048193 << ~252 + 1;
   private static long dy = Long.reverse(-2818460165985581299L);
   private static long dz = Long.reverse(-3026418949592973312L);
   private static int ea = 3072 >>> 169 | 3072 << -169;
   private static int eb = (1 >>> 32 | 1 << -32) & -1;
   private static int ec = 0 >>> 181 | 0 << ~181 + 1;
   private static int ed = (24 >>> 64 | 24 << ~64 + 1) & -1;
   private static long ee = Long.reverse(1072649912062527245L);
   private static int ef = 0 >>> 142 | 0 << -142;
   private static int eg = 800 >>> 37 | 800 << ~37 + 1;
   private static long eh = Long.reverse(-2818460165985581299L);
   private static long ei = Long.reverse(-3026418949592973312L);
   private static int ej = Integer.reverse(-536870912);
   private static int ek = Integer.reverse(-1073741824);
   private static int el = Integer.reverse(0);
   private static int em = 212992 >>> 109 | 212992 << -109;
   private static long en = Long.reverse(-2818460165985581299L);
   private static long eo = Long.reverse(-3026418949592973312L);
   private static int ep = (Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << -159) & -1;
   private static int eq = '\ud800' >>> 'K' | 55296 << ~75 + 1;
   private static long er = Long.reverse(1072649912062527245L);
   private static int es = 512 >>> 200 | 512 << -200;
   private static int et = (469762048 >>> 152 | 469762048 << ~152 + 1) & -1;
   private static int eu = -1 >>> 103 | -1 << ~103 + 1;
   private static long ev = Long.reverse(1072649912062527245L);
   private static int ew = Integer.reverse(Integer.MIN_VALUE);
   private static int ex = Integer.reverse(-1207959552);
   private static long ey = Long.reverse(-2818460165985581299L);
   private static long ez = Long.reverse(-3026418949592973312L);
   private static int fa = Integer.reverse(268435456);
   private static int fb = (67108864 >>> 57 | 67108864 << ~57 + 1) & -1;
   private static int fc = (0 >>> 144 | 0 << -144) & -1;
   private static int fd = Integer.reverse(2013265920);
   private static long fe = Long.reverse(-2818460165985581299L);
   private static long ff = Long.reverse(-3026418949592973312L);
   private static int fg = 2048 >>> 43 | 2048 << ~43 + 1;
   private static int fh = Integer.reverse(-134217728);
   private static int fi = Integer.reverse(-1);
   private static long fj = Long.reverse(1072649912062527245L);
   private static int fk = Integer.reverse(-1);
   private static int fl = Integer.reverse(67108864);
   private static long fm = Long.reverse(-2818460165985581299L);
   private static long fn = Long.reverse(-3026418949592973312L);
   private static int fo = 288 >>> 133 | 288 << ~133 + 1;
   private static int fp = 536870912 >>> 60 | 536870912 << ~60 + 1;
   private static int fq = Integer.reverse(0);
   private static int fr = 1056 >>> 69 | 1056 << -69;
   private static long fs = Long.reverse(1072649912062527245L);
   private static int ft = (33554432 >>> 185 | 33554432 << -185) & -1;
   private static int fu = Integer.reverse(1140850688);
   private static int fv = (-1 >>> 225 | -1 << ~225 + 1) & -1;
   private static long fw = Long.reverse(1072649912062527245L);
   private static int fx = Integer.reverse(0);
   private static int fy = Integer.reverse(-1006632960);
   private static long fz = Long.reverse(-2818460165985581299L);
   private static long ga = Long.reverse(-3026418949592973312L);
   private static int gb = 80 >>> 99 | 80 << ~99 + 1;
   private static int gc = Integer.reverse(1073741824);
   private static int gd = 0 >>> 224 | 0 << ~224 + 1;
   private static int ge = Integer.reverse(603979776);
   private static long gf = Long.reverse(-2818460165985581299L);
   private static long gg = Long.reverse(-3026418949592973312L);
   private static int gh = Integer.reverse(Integer.MIN_VALUE);
   private static int gi = 9472 >>> 200 | 9472 << ~200 + 1;
   private static long gj = Long.reverse(1072649912062527245L);
   private static int gk = 0 >>> 255 | 0 << ~255 + 1;
   private static int gl = Integer.reverse(1677721600);
   private static long gm = Long.reverse(-2818460165985581299L);
   private static long gn = Long.reverse(-3026418949592973312L);
   private static int go = Integer.reverse(-805306368);
   private static int gp = (4194304 >>> 213 | 4194304 << ~213 + 1) & -1;
   private static int gq = Integer.reverse(0);
   private static int gr = -1677721600 >>> 90 | -1677721600 << -90;
   private static long gs = Long.reverse(-2818460165985581299L);
   private static long gt = Long.reverse(-3026418949592973312L);
   private static int gu = (32 >>> 101 | 32 << -101) & -1;
   private static int gv = Integer.reverse(335544320);
   private static long gw = Long.reverse(1072649912062527245L);
   private static int gx = Integer.reverse(Integer.MIN_VALUE);
   private static int gy = Integer.reverse(-1811939328);
   private static long gz = Long.reverse(-2818460165985581299L);
   private static long ha = Long.reverse(-3026418949592973312L);
   private static int hb = Integer.reverse(805306368);
   private static int hc = 65536 >>> 144 | 65536 << -144;
   private static int hd = 0 >>> 229 | 0 << -229;
   private static int he = 'ꠀ' >>> 202 | 43008 << -202;
   private static long hf = Long.reverse(-2818460165985581299L);
   private static long hg = Long.reverse(-3026418949592973312L);
   private static int hh = (2 >>> 193 | 2 << ~193 + 1) & -1;
   private static int hi = 352256 >>> 77 | 352256 << ~77 + 1;
   private static long hj = Long.reverse(-2818460165985581299L);
   private static long hk = Long.reverse(-3026418949592973312L);
   private static int hl = Integer.reverse(-1342177280);
   private static int hm = Integer.reverse(-1073741824);
   private static int hn = Integer.reverse(0);
   private static int ho = 1476395008 >>> 89 | 1476395008 << ~89 + 1;
   private static long hp = Long.reverse(-2818460165985581299L);
   private static long hq = Long.reverse(-3026418949592973312L);
   private static int hr = Integer.reverse(Integer.MIN_VALUE);
   private static int hs = Integer.reverse(-1275068416);
   private static int ht = Integer.reverse(-1);
   private static long hu = Long.reverse(1072649912062527245L);
   private static int hv = Integer.reverse(1073741824);
   private static int hw = Integer.reverse(1946157056);
   private static int hx = Integer.reverse(-1);
   private static long hy = Long.reverse(1072649912062527245L);
   private static int hz = 0 >>> 238 | 0 << ~238 + 1;
   private static int ia = Integer.reverse(-201326592);
   private static long ib = Long.reverse(-2818460165985581299L);
   private static long ic = Long.reverse(-3026418949592973312L);
   private static int id = (917504 >>> 208 | 917504 << -208) & -1;
   private static int ie = (256 >>> 135 | 256 << -135) & -1;
   private static int var_if = Integer.reverse(0);
   private static int ig = Integer.reverse(201326592);
   private static int ih = Integer.reverse(-1);
   private static long ii = Long.reverse(1072649912062527245L);
   private static int ij = 2048 >>> 75 | 2048 << -75;
   private static int ik = Integer.reverse(-1946157056);
   private static long il = Long.reverse(-2818460165985581299L);
   private static long im = Long.reverse(-3026418949592973312L);
   private static int in = Integer.reverse(0);
   private static int io = Integer.reverse(1275068416);
   private static long ip = Long.reverse(1072649912062527245L);
   private static int iq = Integer.reverse(-268435456);
   private static int ir = Integer.reverse(Integer.MIN_VALUE);
   private static int is = Integer.reverse(0);
   private static int it = (417792 >>> 141 | 417792 << ~141 + 1) & -1;
   private static int iu = -1 >>> 149 | -1 << ~149 + 1;
   private static long iv = Long.reverse(1072649912062527245L);
   private static int iw = Integer.reverse(0);
   private static int ix = 851968 >>> 46 | 851968 << ~46 + 1;
   private static long iy = Long.reverse(-2818460165985581299L);
   private static long iz = Long.reverse(-3026418949592973312L);
   private static int ja = Integer.MIN_VALUE >>> 251 | Integer.MIN_VALUE << -251;
   private static int jb = Integer.reverse(1073741824);
   private static int jc = (0 >>> 16 | 0 << ~16 + 1) & -1;
   private static int jd = Integer.reverse(-1409286144);
   private static long je = Long.reverse(-2818460165985581299L);
   private static long jf = Long.reverse(-3026418949592973312L);
   private static int jg = Integer.reverse(Integer.MIN_VALUE);
   private static int jh = Integer.reverse(1811939328);
   private static long ji = Long.reverse(1072649912062527245L);
   private static int jj = Integer.reverse(Integer.MIN_VALUE);
   private static int jk = (-2147483621 >>> 255 | -2147483621 << -255) & -1;
   private static int jl = Integer.reverse(-1);
   private static long jm = Long.reverse(1072649912062527245L);
   private static int jn = Integer.reverse(-2013265920);
   private static int jo = Integer.reverse(1073741824);
   private static int jp = Integer.reverse(0);
   private static int jq = 7340032 >>> 49 | 7340032 << -49;
   private static int jr = Integer.reverse(-1);
   private static long js = Long.reverse(1072649912062527245L);
   private static int jt = Integer.reverse(Integer.MIN_VALUE);
   private static int ju = 116736 >>> 107 | 116736 << -107;
   private static long jv = Long.reverse(-2818460165985581299L);
   private static long jw = Long.reverse(-3026418949592973312L);
   private static int jx = Integer.reverse(0);
   private static int jy = Integer.reverse(1543503872);
   private static int jz = -1 >>> 117 | -1 << -117;
   private static long ka = Long.reverse(1072649912062527245L);
   private static int kb = (1179648 >>> 176 | 1179648 << -176) & -1;
   private static int kc = (4194304 >>> 149 | 4194304 << ~149 + 1) & -1;
   private static int kd = 0 >>> 3 | 0 << -3;
   private static int ke = Integer.reverse(-603979776);
   private static int kf = Integer.reverse(-1);
   private static long kg = Long.reverse(1072649912062527245L);
   private static int kh = '耀' >>> 239 | 32768 << ~239 + 1;
   private static int ki = -268435456 >>> 26 | -268435456 << -26;
   private static int kj = -1 >>> 120 | -1 << -120;
   private static long kk = Long.reverse(1072649912062527245L);
   private static int kl = Integer.reverse(-1140850688);
   private static long km = Long.reverse(-2818460165985581299L);
   private static long kn = Long.reverse(-3026418949592973312L);
   private static int ko = 76 >>> 2 | 76 << -2;
   private static int kp = Integer.reverse(1073741824);
   private static int kq = Integer.reverse(0);
   private static int kr = Integer.reverse(2080374784);
   private static long ks = Long.reverse(-2818460165985581299L);
   private static long kt = Long.reverse(-3026418949592973312L);
   private static int ku = Integer.reverse(Integer.MIN_VALUE);
   private static int kv = -67108864 >>> 26 | -67108864 << ~26 + 1;
   private static long kw = Long.reverse(-2818460165985581299L);
   private static long kx = Long.reverse(-3026418949592973312L);
   private static int ky = Integer.reverse(33554432);
   private static int kz = (-1 >>> 134 | -1 << ~134 + 1) & -1;
   private static long la = Long.reverse(1072649912062527245L);

   @Override
   public int a() {
      return this.ordinal();
   }

   @Override
   public Object a() {
      return this.r;
   }

   @Override
   public NLoginCore_474 a() {
      return this.j;
   }

   @Override
   public boolean ar() {
      return (boolean)(NLoginInterface_005.super.ar() && NLoginType_008.c().a().n() == a ? b : c);
   }

   private NLoginCore_363(NLoginCore_474 var3, Object var4) {
      this.j = var3;
      this.r = var4;
   }

   public static void o(NLoginType_008 var0) {
      NLoginCore_363[] var1 = values();
      int var2 = var1.length;

      for (int var3 = l; var3 < var2; var3++) {
         NLoginCore_363 var4 = var1[var3];
         NLoginCore_311 var5 = a(var4);
         NLoginCore_219 var6 = var5.a(var0);
         if (var6 == null) {
            throw new IllegalStateException(var5 + a(m & n, o));
         }

         NLoginCore_525.a(var4, var4.a(), var6, (boolean)p);
      }

      List var7 = s.b(new Object[q]);
      var7.removeIf(var0x -> (boolean)(var0x != null && !var0x.trim().isEmpty() ? v : u));
      var7.replaceAll(var0x -> var0x.trim().toLowerCase(Locale.ENGLISH));
      NLoginCore_525.a(s, var7);
      List var8 = t.b(new Object[r]);
      var8.removeIf(var0x -> (boolean)(var0x != null && !var0x.trim().isEmpty() ? t : s));
      var8.replaceAll(var0x -> var0x.trim().toLowerCase(Locale.ENGLISH));
      NLoginCore_525.a(t, var8);
   }

   private static void b() {
      c = -5700735730409847013L;
      long var0 = c ^ -1331780202632314311L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(12 + 57),
               (byte)(77 + 6),
               (byte)(38 + 9),
               (byte)(45 + 22),
               (byte)(43 + 23),
               (byte)(40 + 27),
               (byte)(15 + 32),
               (byte)(65 + 15),
               (byte)(71 + 4),
               (byte)(57 + 10),
               (byte)(55 + 28),
               53,
               (byte)(11 + 69),
               (byte)(3 + 94),
               (byte)(65 + 35),
               (byte)(10 + 90),
               (byte)(7 + 98),
               (byte)(57 + 53),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(33 + 36), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_433.B("ðÏĈçþäíĆàĖêß", (byte)12, 66);
               b[1] = NLoginCore_530.E("ԵԋԿԤԮԔ\u0530ԣԠԲԧԐ", (byte)12, 69);
               b[2] = NLoginCore_324.E("\u0530ӽԛՂԺՂԽՇԨԠԹԆԛԷԇԤԮԐԎՅԤՈՍԪԡԨԨԖԱՈՋԗԹԷԕԬԗՁԤթՃզՅԸլթլլՠէըՄճՌնժՎՓՖ՜ԹթՉՉ", (byte)12, 69);
               b[3] = NLoginCore_433.E("ԖԕԣԞԽԚԼԙԲԜԸՆՇՁԝԘԦՏՄՁՋՈՒՓԭԌԓԳԺԴԑԨ", (byte)12, 69);
               b[4] = NLoginCore_446.D("ЭчаєОЦЗТГзчНкьдЩмЬдлуѥЬЭ", (byte)12, 68);
               b[5] = NLoginCore_387.A("èýçĎÌÌõôõìæß", (byte)12, 65);
               b[6] = NLoginCore_453.D("щшЩѓОюфдЫюъС", (byte)12, 68);
               b[7] = NLoginCore_397.B("ëąîĒÜäÕàÑõąçññÖïóĉěðáęėôĤãĕĕĭėĩąîğĄĐĩĳĆĸĕĪĬÿ", (byte)12, 66);
               b[8] = NLoginCore_397.C("КЭНяђэАФБЫИЕЛўЬЭѓгѝѓфяСдзгФћѩыъѡ", (byte)12, 67);
               b[9] = NLoginCore_427.D("шєХрЕщЖвѕдвшЮНїўЯуСснќтѕѠжєѝјѫџл", (byte)12, 68);
               b[10] = NLoginCore_092.A("ćÚċčĄÑáĒĕĘĕěćëÚñċ÷úàĎĕÝĤĉĩ÷ĂĨăČ÷įñěīÿĖðąĤøıĩēļčĳĠĊġėăŃĊċ", (byte)12, 65);
               b[11] = NLoginCore_521.A("ëąîĒÜäÕàÑõąçññÖïóĉěðáēØàöěęĬçčħĠùĭĂéıĦĥĊðčĊÿ", (byte)12, 65);
               b[12] = NLoginCore_091.D("КЭНяђэАФБЫКНШбйыНјлѥіхоѥкѓїПоыѝй", (byte)12, 68);
               b[13] = NLoginCore_446.C("шєХрЕщЖвѕдбНьжюдѠѠвтѧљђѡјиѨЫРюёфѫэшфѮсёѢђзѶс", (byte)12, 67);
               b[14] = NLoginCore_471.C("ЭчаєОЦЗТГзчЩггИбеыѝвУѤЧѕЪжтЧнјяѫѣѨєнѠёяѣѳззс", (byte)12, 67);
               b[15] = NLoginCore_076.C("КЭНяђэАФБЫЙЩѕшОМСсСпцѦјЩѝѡдџкЬћѥ", (byte)12, 67);
               b[16] = NLoginCore_559.E("ԜԶԟՃԍԕԆԑԂԦԶԘԢԢԇԠԤԺՌԡԒՋԴԬ\u0530ՈԭԜ՝ԵՐՐԳԸ՜ԞԮՠ՞զԶԽ՝\u0530", (byte)12, 69);
               b[17] = NLoginCore_004.D("КЭНяђэАФБЫИжИржЪѐоЬљкецедТЬѨщѫшб", (byte)12, 68);
               b[18] = NLoginCore_387.D("шєХрЕщЖвѕдбомяЙюСнќѤпєдѢнѤЫзоѭѢяѰаѩєѧѐѣуићѶс", (byte)12, 68);
               b[19] = NLoginCore_324.F("ԷՃԔԯԄԸԅԡՄԣԠԭԫԾԈԽԐԬՋՓԮՃԣՑԬՓԚԦԭ՜ՑԾՊ՛ԫԝՅՄԹԳթիՇ\u0530", (byte)12, 70);
               b[20] = NLoginCore_451.E("ԜԶԟՃԍԕԆԑԂԦԶԘԢԢԇԠԤԺՌԡԒՋԴԬ\u0530ՈԭԜ՝ԵՐՐՓ\u0558\u0557\u0530ԶԿ\u0557եՔ՝\u0557ՆԶթԹԦՇԿ՞ՁՋդԻԼ", (byte)12, 69);
               b[21] = NLoginCore_471.F("ԉԜԌԾՁԼӿԓԀԚԇԥԇԯԥԙԿԭԛՈԩԨԸԶ\u0530՛ԣ՚ՕԦՐԷԳԫՓԢԾԦԡՇԛաԤՆԪ\u0557ԧեՃՁԯՁթԾԻԼ", (byte)12, 70);
               b[22] = NLoginCore_138.E("ԷՃԔԯԄԸԅԡՄԣԠԭԫԾԈԽԐԬՋՓԮԶՆԵՔԬՖԕՅԶՙՎՊԽՌԭՀԳ՜ԻԼՉԾԩեՊՋՎծԼՀՀՖՏՃժՖՙՇմռԷ՛Բ", (byte)12, 69);
               b[23] = NLoginCore_427.A("ëąîĒÜäÕàÑõąçññÖïóĉěðáĚăûÿėüëĬĄğğĄěĚĪĔĬĄďóĤðĥĊĜĖøöĽŁĿĀŃĊċ", (byte)12, 65);
               b[24] = NLoginCore_241.D("КЭНяђэАФБЫИжИржЪѐоЬљкйщчсѬдѫѦзѡшыѨЮюёсѤсфћѵѷьѠлѮѪўѼѳѲяьэ", (byte)12, 68);
               b[25] = NLoginCore_092.F("ԜԶԟՃԍԕԆԑԂԦԵԴԇԠԸԭԞԺԦՔԡՁՑԴԕՇԳՌՙՉՇԞ", (byte)12, 70);
               b[26] = NLoginCore_027.C("ЪамЎубжУэеќЫЧёїгъзѓѥгѕЬЭ", (byte)12, 67);
               b[27] = NLoginCore_091.C("шєХрЕщЖвѕдбђічрсџѡлфјѕѡдцѫржюѬкё", (byte)12, 67);
               b[28] = NLoginCore_241.F("ԷՃԔԯԄԸԅԡՄԣԢՉԟԌԋԜԋՇԎԿԔԩՄՐՙԭԍ՛ԮՈՑԹ", (byte)12, 70);
               b[29] = NLoginCore_433.F("ԜԶԟՃԍԕԆԑԂԦԵԴԇԠԸԭԞԺԦՔԡՃԿՃՑԷԦԎԬ՝ԚՠԘՖՐՒՙՇ՟Բ\u0557ՒԷ\u0530", (byte)12, 70);
               b[30] = NLoginCore_092.D("ЪамЎубжУэењвЩпШЭюыђзмѝЧЧпѡєПѭфѪл", (byte)12, 68);
               b[31] = NLoginCore_559.D("шєХрЕщЖвѕдбђічрсџѡлфјћѣѪкїўЫѮрьѯыэѴуѷѢщєЬйќс", (byte)12, 68);
               b[32] = NLoginCore_433.A("ëąîĒÜäÕàÑõĄăÖïćüíĉõģðčîôãçĊĠýĥùĚĪīêĝòąîðăġĕóĐúõĴīúģċĺĝĊċ", (byte)12, 65);
               b[33] = NLoginCore_110.A("èîúÌāïôáċóěØĝ×ÖîêċĐ÷ÜĠðĄÚĦĤĆĢĀāåĪħċòąăòĨòĚñÿ", (byte)12, 65);
               b[34] = NLoginCore_387.A("ĆĒãþÓćÔðēòïćæûÕìďĞĞěâďĔðĠþĦġāĥėāĘñįðĨôĶóĳčĸÿ", (byte)12, 65);
               b[35] = NLoginCore_241.B("ìĀêĒüĒòĆàòăēĕïüčïĂêÛĥģêë", (byte)12, 66);
               b[36] = NLoginCore_384.A("èýçĎÌÌõôõìæß", (byte)12, 65);
               b[37] = NLoginCore_559.D("щшЩѓОюфдЫюъС", (byte)12, 68);
               b[38] = NLoginCore_575.E("ԮԏԼԼԂԐԶԁԣԳԣԕԩԀԬԂԱՑԓԜԵԣԤ\u0558ՋԵՊԹԵԦՀ\u0530", (byte)12, 69);
               b[39] = NLoginCore_324.A("ØëÛčĐċÎâÏéØÛæï÷ĉÛĖùģĔăüģøđĕÝüĉě÷", (byte)12, 65);
               b[40] = NLoginCore_446.D("шєХрЕщЖвѕдбНьжюдѠѠвтѧљђѡјиѨЫРюёфѫэшфѮсёѢђзѶс", (byte)12, 68);
               b[41] = NLoginCore_427.C("пРээГСчВдфжЏаяЮЪѝѐббўіѥзтѥљщѬюлбѯяѱьѲіѫуюглс", (byte)12, 67);
               b[42] = NLoginCore_076.C("КЭНяђэАФБЫЙЩѕшОМСсСпцѦјЩѝѡдџкЬћѥ", (byte)12, 67);
               b[43] = NLoginCore_521.B("ýÞċċÑßąÐòĂòäøÏûÑĀĠâëĄðěòąçĄùČíĘį", (byte)12, 66);
               b[44] = NLoginCore_027.F("ԉԜԌԾՁԼӿԓԀԚԇԥԇԯԥԙԿԭԛՈԩԤԵԤԣԑԛ\u0557Ը՚ԷԠ", (byte)12, 70);
               b[45] = NLoginCore_397.E("ԷՃԔԯԄԸԅԡՄԣԠԭԫԾԈԽԐԬՋՓԮՃԣՑԬՓԚԦԭ՜ՑԾ՟ԟ\u0558ՃՖԿՒԲԧՊե\u0530", (byte)12, 69);
               b[46] = NLoginCore_076.E("ԷՃԔԯԄԸԅԡՄԣԠԭԫԾԈԽԐԬՋՓԮՃԣՑԬՓԚԦԭ՜ՑԾՊ՛ԫԝՅՄԹԳթիՇ\u0530", (byte)12, 69);
               b[47] = NLoginCore_471.A("ýÞċċÑßąÐòĂòäøÏûÑĀĠâëĄðþĘöóúöêĚģéçíĎĮñýĔĩĶùĊćĨóĻĶĜĎēĵĀĝĊċ", (byte)12, 65);
               b[48] = NLoginCore_453.F("ԉԜԌԾՁԼӿԓԀԚԇԥԇԯԥԙԿԭԛՈԩԨԸԶ\u0530՛ԣ՚ՕԦՐԷԳԫՓԢԾԦԡՇԛաԤՆԪ\u0557ԧեՃՁԯՁթԾԻԼ", (byte)12, 70);
               b[49] = NLoginCore_183.A("ĆĒãþÓćÔðēòïüúč×ČßûĚĢýąĕĄģûĥäĔąĨĝęČěüďĂīĊċĘčøĴęĚĝĽċďďĥĞĒĹĥĨĖŃŋĆĪā", (byte)12, 65);
               b[50] = NLoginCore_076.A("ýÞċċÑßąÐòĂòäøÏûÑĀĠâëĄðþĘöóúöêĚģéçĨĲăóıĶĄģęĆĭħĝđĽįĲłĽŀčĊċ", (byte)12, 65);
               b[51] = NLoginCore_553.C("КЭНяђэАФБЫИжИржЪѐоЬљкйщчсѬдѫѦзѡшыѨЮюёсѤсфћѵѷьѠлѮѪўѼѳѲяьэ", (byte)12, 67);
               b[52] = NLoginCore_027.F("ԹԌՃԒԎԥԿԒՇՀՊԩԷԎԎԦՋԭԫ\u0530ԯՕԎՔԯԻՍՇՈ՚ԘԜ", (byte)12, 70);
               b[53] = NLoginCore_092.A("èîúÌāïôáċóĚéåďĕñĈõđģñēêë", (byte)12, 65);
               b[54] = NLoginCore_387.B("ĆĒãþÓćÔðēòñĘîÛÚëÚĖÝĎãøēğĨüÜĪýėĠĈ", (byte)12, 66);
               b[55] = NLoginCore_521.A("ĈÛĒáÝôĎáĖďĚÍöØíëÙĞĒüôúĝďôĨĕīêĖåþĠğĄĈòĆĤĸČĉĳĖĄĝöćĚýĝēĝĳĊċ", (byte)12, 65);
               b[56] = NLoginCore_324.D("ЪамЎубжУэеѝКџЙИаЬэђйОѢвцМѨѦшѤтуЧѬѩэдчхдѪдќгс", (byte)12, 68);
               b[57] = NLoginCore_027.B("ĆĒãþÓćÔðēòïćæûÕìďĞĞěâďĔðĠþĦġāĥėāĘñįðĨôĶóĳčĸÿ", (byte)12, 66);
               b[58] = NLoginCore_384.C("ъНєУПжѐУјёћЬЗЯюсрУЖдѣѨуѝМѥѡзоџћњѐѝяѯфѣѠыѦьѺс", (byte)12, 67);
               b[59] = NLoginCore_232.E("ԙԟԫӽԲԠԥԒԼԤՉՍԫԟԌԇՏԎԋԩԐԞՊԴԬՋԫՍՑԻՈԖ", (byte)12, 69);
               b[60] = NLoginCore_201.E("ԷՃԔԯԄԸԅԡՄԣԢԾԷԷԥԽԟԍ\u0530ԑՃԌԩՙԸՖՉՅԺԹՌՋ", (byte)12, 69);
               b[61] = NLoginCore_076.A("ĈÛĒáÝôĎáĖďęČĎÝÛñëñûÕĜøąĕòğĚĚâýġĉûëĥċüđĆıîĳĂÿ", (byte)12, 65);
               b[62] = NLoginCore_091.F("ԙԟԫӽԲԠԥԒԼԤՌԶՂԄԫԹ\u0530ԻԳՉԣԈՉԓԯՏԳԥԝԫԱԭ", (byte)12, 70);
               b[63] = NLoginCore_471.D("шєХрЕщЖвѕдббЖНѝЯНѕрлцѣџѣѥфџјоѡѨѱ", (byte)12, 68);
               b[64] = NLoginCore_027.C("ХНБНцьъЮлцъС", (byte)12, 67);
               break;
            case 1:
               b[0] = NLoginCore_397.C("ЛђЧШёвгаЗќцС", (byte)12, 67);
               b[1] = NLoginCore_232.B("ÉăĐòçÿßÍďèăĕÖďðğĖêðėġģêë", (byte)12, 66);
               b[2] = NLoginCore_553.A("ÿÌêđĉđČĖ÷ïĈÕêĆÖóýßÝĔóėĜùð÷÷åĀėĚæĈĆäûæĐóĸĒĵĔćĻĸĻĻįĶķēłĘýāĝĞğĵĖņĆŐ", (byte)12, 65);
               b[3] = NLoginCore_092.E("ԖԕԣԞԽԚԼԙԲԜԸՆՇՁԝԘԦՏՄՁՋՓՄԤՈՌՙՑԾԘՑԚԫԔԹՁԠՏՀԸՕզԿ\u0530", (byte)12, 69);
               b[4] = NLoginCore_241.D("ЭчаєОЦЗТГзццгЭєюаџџЮжѧПеќФсѫЧѠих", (byte)12, 68);
               b[5] = NLoginCore_091.A("àĆćÝîîçêĄÑçĘĉÚöÑğĔâğÝýêë", (byte)12, 65);
               b[6] = NLoginCore_110.D("АѓѕаЎПЏБИЖќгшнєЮЪёКѤеѕЬЭ", (byte)12, 68);
               b[7] = NLoginCore_451.E("ԜԶԟՃԍԕԆԑԂԦԶԘԢԢԇԠԤԺՌԡԒՊՈԥՕԔՆՆ՞Ո՚Զԙ՞ԴԛԱ\u0557Ա\u0530ԷԷԳ\u0530", (byte)12, 69);
               b[8] = NLoginCore_446.A("ØëÛčĐċÎâÏéÖÓÙĜêëđñěđĂďûóøßĥĂĊĜäĮ", (byte)12, 65);
               b[9] = NLoginCore_446.D("шєХрЕщЖвѕдвшЮНїўЯуСснџїўјыѦПХѥлў", (byte)12, 68);
               b[10] = NLoginCore_223.B("ćÚċčĄÑáĒĕĘĕěćëÚñċ÷úàĎĕÝĤĉĩ÷ĂĨăČ÷įñěīÿĖðąĤøİħďĒĞķĶþčğĺčĊċ", (byte)12, 66);
               b[11] = NLoginCore_324.B("ëąîĒÜäÕàÑõąçññÖïóĉěðáēØàöěęĬçčħĠĘđĥăĉĆăďıąĖÿ", (byte)12, 66);
               b[12] = NLoginCore_183.A("ØëÛčĐċÎâÏéØÛæï÷ĉÛĖùģĔĒÜāĄÛĪĞâĢĪġ", (byte)12, 65);
               b[13] = NLoginCore_091.E("ԷՃԔԯԄԸԅԡՄԣԠԌԻԥԽԣՏՏԡԱՖՈՁՐՇԧ\u0557ԚԏԽՀԳԳՎԽՂԿԮԤԻՃԦՕ\u0530", (byte)12, 69);
               b[14] = NLoginCore_553.E("ԜԶԟՃԍԕԆԑԂԦԶԘԢԢԇԠԤԺՌԡԒՓԖՄԙԥԱԖԬՇԾ՚ԬԽԬ՛ԗզՐԨԠԵՋ\u0530", (byte)12, 69);
               b[15] = NLoginCore_183.D("КЭНяђэАФБЫЙЩѕшОМСсСпцѨїўѣѠѨѩѩзцч", (byte)12, 68);
               b[16] = NLoginCore_138.F("ԜԶԟՃԍԕԆԑԂԦԶԘԢԢԇԠԤԺՌԡԒՋԴԬ\u0530ՈԭԜ՝ԵՐՐՊԜՑԻԭԠՆՃԧՀՃ\u0530", (byte)12, 70);
               b[17] = NLoginCore_387.C("КЭНяђэАФБЫИжИржЪѐоЬљкмєичпўѣѮЭхѬњЩѯгфѣљёьйјс", (byte)12, 67);
               b[18] = NLoginCore_521.C("шєХрЕщЖвѕдбомяЙюСнќѤпєдѢнѤЫзоѭѢяўяџЭєѓеЯеѮѪс", (byte)12, 67);
               b[19] = NLoginCore_433.E("ԷՃԔԯԄԸԅԡՄԣԠԭԫԾԈԽԐԬՋՓԮՃԣՑԬՓԚԦԭ՜ՑԾԯԪգաԶԠԶզԩՋԻ\u0530", (byte)12, 69);
               b[20] = NLoginCore_521.D("ЭчаєОЦЗТГзчЩггИбеыѝвУќхнсљоЭѮцѡѡѤѩѨсчѐѨѶѥѮѧѬмћѝіѯтуѥѯѵьэ", (byte)12, 68);
               b[21] = NLoginCore_575.D("КЭНяђэАФБЫИжИржЪѐоЬљкйщчсѬдѫѦзѡшфмѤгязвјЬѲжхѝьюѹмлѺљѾѵьэ", (byte)12, 68);
               b[22] = NLoginCore_091.D("шєХрЕщЖвѕдбомяЙюСнќѤпчїцѥнѧЦічѪџћюѝоёфѭьэњякѶћќџѿэёёѧѥѶщуҁѦщѺџыѢ", (byte)12, 68);
               b[23] = NLoginCore_232.C("ЭчаєОЦЗТГзчЩггИбеыѝвУќхнсљоЭѮцѡѡцѝќѬіѮцёеѦмѴёѿѲѓнѸѹѺѽњ҈ѕҀўѵуцѽѭҌ", (byte)12, 67);
               b[24] = NLoginCore_091.D("КЭНяђэАФБЫИжИржЪѐоЬљкйщчсѬдѫѦзѡшыѨЮюёсѤсфћѴѭѬѐкѪњѹѠпѸ҅ьэ", (byte)12, 68);
               b[25] = NLoginCore_427.E("ԜԶԟՃԍԕԆԑԂԦԵԴԇԠԸԭԞԺԦՔԡԮՌԐՒԻԵԲՒ՛ԫԖԻՒՓՄ՚ԯդԴՊՄԻ\u0530", (byte)12, 69);
               b[26] = NLoginCore_384.E("ԙԟԫӽԲԠԥԒԼԤՉԤԨՎԛԭԛՁՄ\u0530ՃԞԛԜ", (byte)12, 69);
               b[27] = NLoginCore_232.B("ĆĒãþÓćÔðēòïĐĔąþÿĝğùĂĖēĐáĝĩāĀÿûĜěĠČģćČëĈČČïĚÿ", (byte)12, 66);
               b[28] = NLoginCore_397.F("ԷՃԔԯԄԸԅԡՄԣԢՉԟԌԋԜԋՇԎԿԔԞԔՙԖ\u0557ԦԗՉԱ\u0530ԸՉաԼՀԸգԟԱգԨՙ\u0530", (byte)12, 70);
               b[29] = NLoginCore_027.E("ԜԶԟՃԍԕԆԑԂԦԵԴԇԠԸԭԞԺԦՔԡՃԿՃՑԷԦԎԬ՝ԚՠԘ՝ԡԞԾՎ՚ՓՇԪՕ\u0530", (byte)12, 69);
               b[30] = NLoginCore_092.C("ЪамЎубжУэењвЩпШЭюыђзмћјнєјіѫћщЦяѲѩцѳщщѡѳжѯѲс", (byte)12, 67);
               b[31] = NLoginCore_387.F("ԷՃԔԯԄԸԅԡՄԣԠՁՅԶԯ\u0530ՎՐԪԳՇՊՒՙԩՆՍԚ՝ԯԻ՞Օ՜Օ\u0558ԣզՈՉԱ\u0557ՁԶթԹՙՑ՞ԭԼժ՝ՎԻԼ", (byte)12, 70);
               b[32] = NLoginCore_530.D("ЭчаєОЦЗТГзцхИбщоЯызѥвяажХЩьѢпѧлќѬѭЬџдчавхѣєђѳћђѭѼьклѱѢцћѝҀѺўџѮҌ҆", (byte)12, 68);
               b[33] = NLoginCore_433.F("ԙԟԫӽԲԠԥԒԼԤՌԉՎԈԇԟԛԼՁԨԍՑԡԵԋ\u0557ՕԷՓԱԲԖԟ՝Խ՝ԥԞԻ\u0557ՈԜՓՋԽՃածՏՓԬՀԭմԻԼ", (byte)12, 70);
               b[34] = NLoginCore_553.D("шєХрЕщЖвѕдбщШнЗЮёѠѠѝФёівѢрѨѣуѧљуЬвѵщпеѵзѦѭѰЯьѼџяпѸоіњ҅ьэ", (byte)12, 68);
               b[35] = NLoginCore_138.A("ìĀêĒüĒòĆàòûėæĚēêðĘöùùýêë", (byte)12, 65);
               b[36] = NLoginCore_521.E("ԢԯԣԿԏԒԢԐԶՉՆԕԚՊՐԾՇՃՄԽՌԞԛԜ", (byte)12, 69);
               b[37] = NLoginCore_553.E("ԭԞԴԘՂӿԣՆՊԞԋԕԿՇԙՆԭԛԥԬՂՄԛԜ", (byte)12, 69);
               b[38] = NLoginCore_223.F("ԮԏԼԼԂԐԶԁԣԳԣԕԩԀԬԂԱՑԓԜԵԤԔՎԭՕԨԤԫԶԜ\u0557ԴԱ\u0530ԭգԻը՟էՕԪ\u0530", (byte)12, 70);
               b[39] = NLoginCore_521.F("ԉԜԌԾՁԼӿԓԀԚԉԌԗԠԨԺԌՇԪՔՅԿՄՐՎԒԪԵ՚ԬԹՖ", (byte)12, 70);
               b[40] = NLoginCore_110.E("ԷՃԔԯԄԸԅԡՄԣԠԌԻԥԽԣՏՏԡԱՖՈՁՐՇԧ\u0557ԚԏԽՀԳՒ՜ԬԻգԴԷԽԩՇթ\u0530", (byte)12, 69);
               b[41] = NLoginCore_446.E("ԮԏԼԼԂԐԶԁԣԳԥӾԟԾԝԙՌԿԠԠՍՅՔԦԱՔՈԸ՛ԽԪԠԝ\u0558ԯԠԲՄՃՓՑԡ՝\u0530", (byte)12, 69);
               b[42] = NLoginCore_241.B("ØëÛčĐċÎâÏé×çēĆÜÚßÿßýĄßÞđúùĉĪâąĜý", (byte)12, 66);
               b[43] = NLoginCore_530.B("ýÞċċÑßąÐòĂòäøÏûÑĀĠâëĄõñĚĝėĂøĉãĪęğĚĂĢđíĭéĘĆİÿ", (byte)12, 66);
               b[44] = NLoginCore_451.C("КЭНяђэАФБЫИжИржЪѐоЬљкиѨжпѥіѝошќцѠѭђѮагѹькфѦс", (byte)12, 67);
               b[45] = NLoginCore_232.C("шєХрЕщЖвѕдбомяЙюСнќѤпєдѢнѤЫзоѭѢявѪѥђѰѠѷхћїлс", (byte)12, 67);
               b[46] = NLoginCore_173.D("шєХрЕщЖвѕдбомяЙюСнќѤпєдѢнѤЫзоѭѢяььгѪуѤјѮеиъѧђѕѪѭѪѷѣўѺяьэ", (byte)12, 68);
               b[47] = NLoginCore_004.B("ýÞċċÑßąÐòĂòäøÏûÑĀĠâëĄðþĘöóúöêĚģéçíĎĮñýĔĩĶùčĜċħùĸķóĕľĜčĊċ", (byte)12, 66);
               b[48] = NLoginCore_446.A("ØëÛčĐċÎâÏéÖôÖþôèĎüêėø÷ćąÿĪòĩĤõğĆĂúĢñčõðĖêİñĉ÷ĵċĭĞēĽĚėčĊċ", (byte)12, 65);
               b[49] = NLoginCore_091.C("шєХрЕщЖвѕдбомяЙюСнќѤпчїцѥнѧЦічѪџћюѝоёфѭьэњякѶћќџѿэёёѧѲхҀҁҀћѤќѤҊѝ", (byte)12, 67);
               b[50] = NLoginCore_433.F("ԮԏԼԼԂԐԶԁԣԳԣԕԩԀԬԂԱՑԓԜԵԡԯՉԧԤԫԧԛՋՔԚԘՙգԴԤբէԵՔՊԸԹ՛ԩՂձեՊճՃԾԾԻԼ", (byte)12, 70);
               b[51] = NLoginCore_397.B("ØëÛčĐċÎâÏéÖôÖþôèĎüêėø÷ćąÿĪòĩĤõğĆĉĦìČďÿĢÿĂęĲĵķėĽĕđÿĴęŀŃĊċ", (byte)12, 66);
               b[52] = NLoginCore_575.F("ԹԌՃԒԎԥԿԒՇՀՊԩԷԎԎԦՋԭԫ\u0530ԯԍԮԐՉՔԱՓՖԙԧԱ", (byte)12, 70);
               b[53] = NLoginCore_092.C("ЪамЎубжУэеѝцљёќЗжўаеОџћћрўоЫѤѯЬы", (byte)12, 67);
               b[54] = NLoginCore_138.C("шєХрЕщЖвѕдгњаНМЭМјПѐХжљЩќъѭжыїЭщўрафѕщѕѐѧхѪс", (byte)12, 67);
               b[55] = NLoginCore_453.B("ĈÛĒáÝôĎáĖďĚÍöØíëÙĞĒüôúĝďôĨĕīêĖåþĠğĄĈòĆĤĸČĉĲöĽęðùīĵĵùĝčĊċ", (byte)12, 66);
               b[56] = NLoginCore_433.A("èîúÌāïôáċóěØĝ×ÖîêċĐ÷ÜĠðĄÚĦĤĆĢĀāåýĤĢñčïĵĶĎñĤÿ", (byte)12, 65);
               b[57] = NLoginCore_553.D("шєХрЕщЖвѕдбщШнЗЮёѠѠѝФёівѢрѨѣуѧљуъѮёѠѤжђсѳќѐс", (byte)12, 68);
               b[58] = NLoginCore_324.F("ԹԌՃԒԎԥԿԒՇՀՊԛԆԞԽ\u0530ԯԒԅԣՒ\u0557ԲՌԋՔՐԦԭՎՊՉԯՕԛ՝ԣԻԴԦՂԦՄՍլզԫզԪԾԱճՂմԻԼ", (byte)12, 70);
               b[59] = NLoginCore_553.B("èîúÌāïôáċóĘĜúîÛÖĞÝÚøßíåĥöđĂĬğãāêêĚêēĴÿġĲąĪĂÿ", (byte)12, 66);
               b[60] = NLoginCore_530.C("шєХрЕщЖвѕдгяшшжюаОсТєПншѫшдѭЪэёѤЪћѢпсѕјбйѕѶс", (byte)12, 67);
               b[61] = NLoginCore_232.F("ԹԌՃԒԎԥԿԒՇՀՊԽԿԎԌԢԜԢԬԆՍԩԶՆԣՐՋՋԓԮՒԺԽՐԿ\u0557ԜՅ\u0557\u0557ԼՅՃիԤԨՄՋ՝կՔԿՍդԻԼ", (byte)12, 70);
               b[62] = NLoginCore_223.B("èîúÌāïôáċóěąđÓúĈÿĊĂĘòÝÝäėĜĞĞĭüèĪćĎĐóĂÿèĩĶòĎÿ", (byte)12, 66);
               b[63] = NLoginCore_553.A("ĆĒãþÓćÔðēòïïÔÛěíÛēþùĄĜåėĜæġĤõêĥįùûĳāĬĴóĎĈčĖÿ", (byte)12, 65);
               b[64] = NLoginCore_173.F("ԀԢԘԽՀՂԲԖԖԉԧԐ", (byte)12, 70);
               break;
            case 2:
               b[0] = NLoginCore_027.E("ԒӽԎӿԿԝԖԺԼԀԄԺԖԶԣԎՆԳՉԍԮԞԛԜ", (byte)12, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_397.B("ùËËđòāåĕîÑĚĖĔěěė×Ċùõûēêë", (byte)12, 66);
         }
      }
   }

   @Override
   public NLoginCore_208 a() {
      return j;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_363.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.A("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 65), NLoginCore_363.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.F("և֔֓Ֆ֖֒֍֖֡\u0590՝֛֛֟֘֡գࣱࣲ࣯ࣺ࣯ࣣࣧࣼࣳࣽࣴࣙࣛࣷ࣫վ", (byte)104, 70) + var1 + NLoginCore_183.F("՞", (byte)104, 70) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 107L;
      var1 ^= -1331780202632314311L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(19 + 50),
                     (byte)(39 + 44),
                     (byte)(3 + 44),
                     (byte)(30 + 37),
                     (byte)(19 + 47),
                     67,
                     (byte)(26 + 21),
                     (byte)(64 + 16),
                     (byte)(11 + 64),
                     67,
                     (byte)(74 + 9),
                     (byte)(6 + 47),
                     (byte)(58 + 22),
                     (byte)(55 + 42),
                     (byte)(33 + 67),
                     (byte)(50 + 50),
                     (byte)(60 + 45),
                     (byte)(14 + 96),
                     (byte)(63 + 40)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.A("İĽļÿĿĻĶĿŊĹĆńňŁńŊČҐҥҜҦҘҝҚңҘ҂қ҄ҠҔҌ", (byte)39, 65));
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

   public static NLoginCore_311 a(NLoginCore_363 var0) {
      String var1 = var0.name().toLowerCase(Locale.ENGLISH);
      if (var1.startsWith(a(d, e))) {
         return NLoginCore_311.f;
      } else if (var1.startsWith(a(f, g ^ h))) {
         return NLoginCore_311.e;
      } else {
         throw new IllegalStateException(a(i & j, k) + var1);
      }
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(at, au ^ av);
      int var10003 = aw;
      String[] var10004 = new String[ax];
      var10004[ay] = a(az, ba ^ bb);
      var10004[bc] = a(bd, be ^ bf);
      a = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)bg));
      var10002 = a(bh, bi ^ bj);
      var10003 = bk;
      var10004 = new String[bl];
      var10004[bm] = a(bn & bo, bp);
      var10004[bq] = a(br & bs, bt);
      b = new NLoginCore_363(NLoginCore_474.a(var10004), a(bu & bv, bw));
      var10002 = a(bx & by, bz);
      var10003 = ca;
      var10004 = new String[cb];
      var10004[cc] = a(cd & ce, cf);
      var10004[cg] = a(ch & ci, cj);
      c = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)ck));
      var10002 = a(cl, cm);
      var10003 = cn;
      var10004 = new String[co];
      var10004[cp] = a(cq, cr ^ cs);
      d = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)ct));
      var10002 = a(cu, cv ^ cw);
      var10003 = cx;
      var10004 = new String[cy];
      var10004[cz] = a(da & db, dc);
      var10004[dd] = a(de, df);
      var10004[dg] = a(dh, di);
      e = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)dj));
      var10002 = a(dk, dl);
      var10003 = dm;
      var10004 = new String[dn];
      var10004[var_do] = a(dp, dq ^ dr);
      var10004[ds] = a(dt & du, dv);
      f = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)dw));
      var10002 = a(dx, dy ^ dz);
      var10003 = ea;
      var10004 = new String[eb];
      var10004[ec] = a(ed, ee);
      g = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)ef));
      var10002 = a(eg, eh ^ ei);
      var10003 = ej;
      var10004 = new String[ek];
      var10004[el] = a(em, en ^ eo);
      var10004[ep] = a(eq, er);
      var10004[es] = a(et & eu, ev);
      h = new NLoginCore_363(NLoginCore_474.a(var10004), ew);
      var10002 = a(ex, ey ^ ez);
      var10003 = fa;
      var10004 = new String[fb];
      var10004[fc] = a(fd, fe ^ ff);
      var10004[fg] = a(fh & fi, fj);
      i = new NLoginCore_363(NLoginCore_474.a(var10004), fk);
      var10002 = a(fl, fm ^ fn);
      var10003 = fo;
      var10004 = new String[fp];
      var10004[fq] = a(fr, fs);
      var10004[ft] = a(fu & fv, fw);
      j = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)fx));
      var10002 = a(fy, fz ^ ga);
      var10003 = gb;
      var10004 = new String[gc];
      var10004[gd] = a(ge, gf ^ gg);
      var10004[gh] = a(gi, gj);
      k = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)gk));
      var10002 = a(gl, gm ^ gn);
      var10003 = go;
      var10004 = new String[gp];
      var10004[gq] = a(gr, gs ^ gt);
      var10004[gu] = a(gv, gw);
      l = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)gx));
      var10002 = a(gy, gz ^ ha);
      var10003 = hb;
      var10004 = new String[hc];
      var10004[hd] = a(he, hf ^ hg);
      m = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)hh));
      var10002 = a(hi, hj ^ hk);
      var10003 = hl;
      var10004 = new String[hm];
      var10004[hn] = a(ho, hp ^ hq);
      var10004[hr] = a(hs & ht, hu);
      var10004[hv] = a(hw & hx, hy);
      n = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)hz));
      var10002 = a(ia, ib ^ ic);
      var10003 = id;
      var10004 = new String[ie];
      var10004[var_if] = a(ig & ih, ii);
      var10004[ij] = a(ik, il ^ im);
      o = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)in));
      var10002 = a(io, ip);
      var10003 = iq;
      var10004 = new String[ir];
      var10004[is] = a(it & iu, iv);
      p = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)iw));
      var10002 = a(ix, iy ^ iz);
      var10003 = ja;
      var10004 = new String[jb];
      var10004[jc] = a(jd, je ^ jf);
      var10004[jg] = a(jh, ji);
      q = new NLoginCore_363(NLoginCore_474.a(var10004), jj);
      var10002 = a(jk & jl, jm);
      var10003 = jn;
      var10004 = new String[jo];
      var10004[jp] = a(jq & jr, js);
      var10004[jt] = a(ju, jv ^ jw);
      r = new NLoginCore_363(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)jx));
      var10002 = a(jy & jz, ka);
      var10003 = kb;
      var10004 = new String[kc];
      var10004[kd] = a(ke & kf, kg);
      var10004[kh] = a(ki & kj, kk);
      s = new NLoginCore_363(NLoginCore_474.a(var10004), Collections.emptyList());
      var10002 = a(kl, km ^ kn);
      var10003 = ko;
      var10004 = new String[kp];
      var10004[kq] = a(kr, ks ^ kt);
      var10004[ku] = a(kv, kw ^ kx);
      t = new NLoginCore_363(NLoginCore_474.a(var10004), Collections.emptyList());
   }
}
