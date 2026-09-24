package com.nickuc.login;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_495 {
   private static long aq = Long.reverse(7061644215716937728L);
   private static long cr = Long.reverse(7061644215716937728L);
   private static int fn = Integer.reverse(0);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static long ku = Long.reverse(9145631871358744198L);
   private static long ih = Long.reverse(2083987655641806470L);
   private static int mi = Integer.reverse(2046820352);
   private static int hv = (1015808 >>> 14 | 1015808 << -14) & -1;
   private static int iz = Integer.reverse(-1);
   private static int gk = Integer.reverse(-1946157056);
   private static int md = (3014656 >>> 15 | 3014656 << ~15 + 1) & -1;
   private static long ht = Long.reverse(2083987655641806470L);
   private static long jc = Long.reverse(9145631871358744198L);
   private static long ji = Long.reverse(2083987655641806470L);
   private static int cy = (20971520 >>> 148 | 20971520 << -148) & -1;
   private static int gq = (417792 >>> 45 | 417792 << -45) & -1;
   private static int ez = -1 >>> 210 | -1 << ~210 + 1;
   private static long lq = Long.reverse(2083987655641806470L);
   private static int jo = (0 >>> 255 | 0 << ~255 + 1) & -1;
   private static long dw = Long.reverse(2083987655641806470L);
   private static int bs = Integer.reverse(1073741824);
   private static int eg = Integer.reverse(67108864);
   private static int m = Integer.reverse(-1073741824);
   private static long al = Long.reverse(2083987655641806470L);
   private static long ia = Long.reverse(7061644215716937728L);
   private static long bc = Long.reverse(9145631871358744198L);
   private static long am = Long.reverse(7061644215716937728L);
   private static int ml = Integer.reverse(-100663296);
   private static int hn = Integer.reverse(-1);
   private static long kh = Long.reverse(2083987655641806470L);
   private static long cz = Long.reverse(9145631871358744198L);
   private static int jp = 1073741843 >>> 158 | 1073741843 << ~158 + 1;
   private static long hf = Long.reverse(7061644215716937728L);
   private static long ho = Long.reverse(9145631871358744198L);
   private static int u = Integer.reverse(-1610612736);
   private static int ey = (9728 >>> 8 | 9728 << -8) & -1;
   private static int ma = Integer.reverse(-637534208);
   private static long jj = Long.reverse(7061644215716937728L);
   private static long hz = Long.reverse(2083987655641806470L);
   private static int ds = Integer.reverse(-671088640);
   private static int et = Integer.reverse(603979776);
   private static int dk = (-1 >>> 126 | -1 << ~126 + 1) & -1;
   private static int cc = 0 >>> 207 | 0 << ~207 + 1;
   private static int co = Integer.reverse(0);
   private static long dq = Long.reverse(2083987655641806470L);
   private static long gp = Long.reverse(9145631871358744198L);
   private static int na = Integer.reverse(-1);
   private static long eu = Long.reverse(9145631871358744198L);
   private static int es = Integer.reverse(0);
   private static long lm = Long.reverse(2083987655641806470L);
   private static int y = 3 >>> 95 | 3 << ~95 + 1;
   private static long hl = Long.reverse(9145631871358744198L);
   private static long ed = Long.reverse(7061644215716937728L);
   private static long fi = Long.reverse(2083987655641806470L);
   private static long f = Long.reverse(2083987655641806470L);
   private static int ij = Integer.reverse(0);
   private static int kr = Integer.reverse(0);
   private static int fk = Integer.reverse(1409286144);
   private static long ge = Long.reverse(9145631871358744198L);
   private static long dl = Long.reverse(9145631871358744198L);
   private static int ld = Integer.reverse(0);
   private static long il = Long.reverse(2083987655641806470L);
   private static int fu = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static long o = Long.reverse(7061644215716937728L);
   private static int hm = (1933312 >>> 79 | 1933312 << -79) & -1;
   private static int kz = 24 >>> 195 | 24 << -195;
   private static long db = Long.reverse(2083987655641806470L);
   private static int fy = 0 >>> 110 | 0 << ~110 + 1;
   private static long ap = Long.reverse(2083987655641806470L);
   private static long eq = Long.reverse(2083987655641806470L);
   private static long var_if = Long.reverse(7061644215716937728L);
   private static long hw = Long.reverse(2083987655641806470L);
   private static int fv = 1474560 >>> 207 | 1474560 << ~207 + 1;
   private static int bb = (-1 >>> 31 | -1 << ~31 + 1) & -1;
   private static long ms = Long.reverse(2083987655641806470L);
   private static long fm = Long.reverse(9145631871358744198L);
   private static int eb = Integer.reverse(2013265920);
   private static int dj = (6144 >>> 168 | 6144 << -168) & -1;
   private static int mr = (397312 >>> 108 | 397312 << -108) & -1;
   private static long mc = Long.reverse(7061644215716937728L);
   private static long hx = Long.reverse(7061644215716937728L);
   private static long w = Long.reverse(9145631871358744198L);
   private static long ne = Long.reverse(2083987655641806470L);
   private static long ix = Long.reverse(7061644215716937728L);
   private static long jm = Long.reverse(2083987655641806470L);
   private static int la = (0 >>> 228 | 0 << -228) & -1;
   private static int ak = Integer.reverse(-1879048192);
   private static int ga = Integer.reverse(-1);
   private static long jv = Long.reverse(7061644215716937728L);
   private static long jz = Long.reverse(2083987655641806470L);
   private static long jr = Long.reverse(7061644215716937728L);
   private static int dd = (46137344 >>> 21 | 46137344 << ~21 + 1) & -1;
   private static long ec = Long.reverse(2083987655641806470L);
   private static int bq = (-1 >>> 71 | -1 << ~71 + 1) & -1;
   private static long br = Long.reverse(9145631871358744198L);
   private static long lz = Long.reverse(7061644215716937728L);
   private static int bt = -536870912 >>> 188 | -536870912 << -188;
   private static int ca = (0 >>> 249 | 0 << -249) & -1;
   private final NLoginCore_459 b;
   private static int lb = (0 >>> 75 | 0 << ~75 + 1) & -1;
   private static int fq = Integer.reverse(0);
   private static int ax = Integer.reverse(0);
   private static int kt = -1 >>> 252 | -1 << -252;
   private static long hi = Long.reverse(7061644215716937728L);
   private static int ni = Integer.reverse(-1509949440);
   private static int ks = Integer.reverse(-905969664);
   private static long hu = Long.reverse(7061644215716937728L);
   private static int ad = 117440512 >>> 248 | 117440512 << ~248 + 1;
   private static int hg = (1073741838 >>> 30 | 1073741838 << -30) & -1;
   private static int lu = (2848 >>> 133 | 2848 << ~133 + 1) & -1;
   private static long nb = Long.reverse(9145631871358744198L);
   private static long n = Long.reverse(2083987655641806470L);
   private static long ly = Long.reverse(2083987655641806470L);
   private static int bh = (0 >>> 21 | 0 << ~21 + 1) & -1;
   private static long fp = Long.reverse(9145631871358744198L);
   private static long ke = Long.reverse(7061644215716937728L);
   private static int gc = Integer.reverse(0);
   private static long he = Long.reverse(2083987655641806470L);
   private static int dv = 117440512 >>> 118 | 117440512 << -118;
   private static long hc = Long.reverse(9145631871358744198L);
   private static int ej = (67584 >>> 75 | 67584 << -75) & -1;
   private static int bw = Integer.reverse(-1073741824);
   private static int hj = (-1610612733 >>> 124 | -1610612733 << ~124 + 1) & -1;
   private static long ah = Long.reverse(9145631871358744198L);
   private static int cs = (72 >>> 34 | 72 << -34) & -1;
   private static int fb = Integer.reverse(-469762048);
   private static long nc = Long.reverse(8646911284551352320L);
   private static int ik = 536 >>> 131 | 536 << -131;
   private static int bk = Integer.reverse(0);
   private static int ep = '谀' >>> 170 | 35840 << -170;
   private static long it = Long.reverse(9145631871358744198L);
   private static long er = Long.reverse(7061644215716937728L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long gb = Long.reverse(9145631871358744198L);
   private static int kq = 524288 >>> 51 | 524288 << ~51 + 1;
   private static int jd = (0 >>> 53 | 0 << -53) & -1;
   private static int da = 'ꠀ' >>> 'k' | 43008 << -107;
   private static int ck = Integer.reverse(0);
   private static long el = Long.reverse(9145631871358744198L);
   private static int ab = Integer.reverse(0);
   private static int lo = Integer.reverse(Integer.MIN_VALUE);
   private static long ju = Long.reverse(2083987655641806470L);
   private static int bu = (-1 >>> 83 | -1 << ~83 + 1) & -1;
   private static long af = Long.reverse(9145631871358744198L);
   private static int fd = (0 >>> 23 | 0 << -23) & -1;
   private static int fe = (41943040 >>> 52 | 41943040 << -52) & -1;
   private static long mt = Long.reverse(7061644215716937728L);
   private static long df = Long.reverse(7061644215716937728L);
   private static String[] a = new String[NLoginCore_495.nh];
   private static int iv = Integer.reverse(-503316480);
   private static int lx = Integer.reverse(1509949440);
   private static int lv = -1 >>> 31 | -1 << -31;
   private static int kp = (0 >>> 215 | 0 << -215) & -1;
   private static int ko = 1 >>> 191 | 1 << -191;
   private static int jt = Integer.reverse(1912602624);
   private static long dx = Long.reverse(7061644215716937728L);
   private static int av = Integer.reverse(0);
   private static int gy = 27 >>> 223 | 27 << ~223 + 1;
   private static int ll = 721420288 >>> 247 | 721420288 << ~247 + 1;
   private static int az = (0 >>> 7 | 0 << ~7 + 1) & -1;
   private static long j = Long.reverse(2083987655641806470L);
   private static int in = (285212672 >>> 150 | 285212672 << ~150 + 1) & -1;
   private static long jx = Long.reverse(9145631871358744198L);
   private static int ls = Integer.reverse(436207616);
   private static int cm = Integer.reverse(134217728);
   private static long fx = Long.reverse(9145631871358744198L);
   private static long iq = Long.reverse(2083987655641806470L);
   private static long g = Long.reverse(7061644215716937728L);
   private static int lk = Integer.reverse(1073741824);
   private static long mx = Long.reverse(9145631871358744198L);
   private static int is = Integer.reverse(1644167168);
   private static int fl = -1 >>> 0 | -1 << ~0 + 1;
   private static long ir = Long.reverse(7061644215716937728L);
   private static long fc = Long.reverse(9145631871358744198L);
   private static long jn = Long.reverse(7061644215716937728L);
   private static int dz = -1 >>> 236 | -1 << -236;
   private static long ft = Long.reverse(7061644215716937728L);
   private static int dy = -805306367 >>> 188 | -805306367 << -188;
   private static int a = Integer.reverse(0);
   private static int id = (68157440 >>> 180 | 68157440 << ~180 + 1) & -1;
   private static int hb = (-2147483621 >>> 223 | -2147483621 << -223) & -1;
   private static long bv = Long.reverse(9145631871358744198L);
   private static int mm = (-1 >>> 56 | -1 << -56) & -1;
   private static int kw = Integer.reverse(704643072);
   private static long aa = Long.reverse(7061644215716937728L);
   private static int jw = (-536870903 >>> 253 | -536870903 << -253) & -1;
   private static int kf = 0 >>> 197 | 0 << -197;
   private static int jl = Integer.reverse(838860800);
   private static int mf = 11904 >>> 7 | 11904 << -7;
   private static int cd = Integer.reverse(0);
   private static long gi = Long.reverse(7061644215716937728L);
   private static int js = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << ~31 + 1;
   private static int gf = Integer.reverse(Integer.MIN_VALUE);
   private static long iw = Long.reverse(2083987655641806470L);
   private static long dt = Long.reverse(2083987655641806470L);
   private static long ln = Long.reverse(7061644215716937728L);
   private static int fo = Integer.reverse(-738197504);
   private static long du = Long.reverse(7061644215716937728L);
   private static long jg = Long.reverse(7061644215716937728L);
   private static int ew = (-1 >>> 107 | -1 << ~107 + 1) & -1;
   private static long cq = Long.reverse(2083987655641806470L);
   private static int je = 18944 >>> 136 | 18944 << -136;
   private static int au = 1024 >>> 106 | 1024 << ~106 + 1;
   private static long mk = Long.reverse(9145631871358744198L);
   private static long ch = Long.reverse(2083987655641806470L);
   private static long ha = Long.reverse(9145631871358744198L);
   private static long ei = Long.reverse(9145631871358744198L);
   private static int bi = (0 >>> 88 | 0 << ~88 + 1) & -1;
   private static int kj = (-2147483647 >>> 31 | -2147483647 << -31) & -1;
   private static int gd = Integer.reverse(-201326592);
   private static long li = Long.reverse(2083987655641806470L);
   private static int kk = Integer.reverse(0);
   private static int mv = Integer.reverse(1174405120);
   private static int nd = Integer.reverse(637534208);
   private static long jq = Long.reverse(2083987655641806470L);
   private static long mp = Long.reverse(2083987655641806470L);
   private static int kg = 343932928 >>> 150 | 343932928 << -150;
   private static int gz = Integer.reverse(-1);
   private static int jk = Integer.reverse(0);
   private static long lj = Long.reverse(7061644215716937728L);
   private static long hq = Long.reverse(2083987655641806470L);
   private static int h = 0 >>> 136 | 0 << -136;
   private static int cl = Integer.reverse(0);
   private static int mw = Integer.reverse(-1);
   private static long lr = Long.reverse(7061644215716937728L);
   private static int ay = Integer.reverse(Integer.MIN_VALUE);
   private static int dg = Integer.reverse(-402653184);
   private static long hr = Long.reverse(7061644215716937728L);
   private static int gg = (24576 >>> 105 | 24576 << ~105 + 1) & -1;
   private static int jh = (1258291200 >>> 88 | 1258291200 << -88) & -1;
   private static int an = 0 >>> 232 | 0 << -232;
   private static long ct = Long.reverse(2083987655641806470L);
   private static long jf = Long.reverse(2083987655641806470L);
   private static long b = Long.reverse(9145631871358744198L);
   private static long k = Long.reverse(7061644215716937728L);
   private static long gu = Long.reverse(7061644215716937728L);
   private static int mz = 3168 >>> 197 | 3168 << ~197 + 1;
   private static long ii = Long.reverse(7061644215716937728L);
   private static int lf = 0 >>> 167 | 0 << ~167 + 1;
   private static long s = Long.reverse(9145631871358744198L);
   private static int dp = Integer.reverse(1476395008);
   private static int bd = Integer.reverse(Integer.MIN_VALUE);
   private static long ef = Long.reverse(9145631871358744198L);
   private static int fr = 92274688 >>> 21 | 92274688 << ~21 + 1;
   private static int d = Integer.reverse(0);
   private static int mo = 402653184 >>> 214 | 402653184 << -214;
   private static int bm = Integer.reverse(0);
   private static long ic = Long.reverse(9145631871358744198L);
   private static int en = (-1 >>> 36 | -1 << ~36 + 1) & -1;
   private static long mh = Long.reverse(7061644215716937728L);
   private static long fs = Long.reverse(2083987655641806470L);
   private static long kd = Long.reverse(2083987655641806470L);
   public static final int q = NLoginCore_495.nj;
   private static int hp = Integer.reverse(1006632960);
   private static long ki = Long.reverse(7061644215716937728L);
   private static int c = Integer.reverse(0);
   private static int lc = 64 >>> 166 | 64 << -166;
   private final NLoginType_008 k;
   private static int bl = Integer.reverse(1073741824);
   private static int gl = Integer.reverse(-1);
   private static int hs = Integer.reverse(-1140850688);
   private static long gr = Long.reverse(9145631871358744198L);
   private static int i = Integer.reverse(1073741824);
   private static long ci = Long.reverse(7061644215716937728L);
   private static int cv = 19456 >>> 10 | 19456 << -10;
   private static int mu = Integer.reverse(1342177280);
   private static int v = -1 >>> 151 | -1 << ~151 + 1;
   private static int gv = (848 >>> 4 | 848 << -4) & -1;
   private static int go = Integer.reverse(-1);
   private static long di = Long.reverse(7061644215716937728L);
   private static int kv = Integer.reverse(33554432);
   private static int ee = Integer.reverse(-134217728);
   private static int kl = Integer.reverse(0);
   private static int my = 320 >>> 197 | 320 << ~197 + 1;
   private static int l = Integer.reverse(0);
   private static int ev = Integer.reverse(-1543503872);
   private static int le = 128 >>> 166 | 128 << ~166 + 1;
   private static int ig = 268435458 >>> 59 | 268435458 << ~59 + 1;
   private static int bj = Integer.reverse(Integer.MIN_VALUE);
   private static int ao = Integer.reverse(1342177280);
   private static int ib = Integer.reverse(33554432);
   private static int lp = Integer.reverse(-369098752);
   private static int fh = 82 >>> 33 | 82 << ~33 + 1;
   private static long dc = Long.reverse(7061644215716937728L);
   private static long de = Long.reverse(2083987655641806470L);
   private static int by = Integer.reverse(0);
   private static long cu = Long.reverse(7061644215716937728L);
   private static int aw = Integer.reverse(1073741824);
   private static int r = Integer.reverse(536870912);
   private static long io = Long.reverse(9145631871358744198L);
   private static long ng = Long.reverse(-6917529027641081856L);
   private static int ae = Integer.reverse(-1);
   private static long ie = Long.reverse(2083987655641806470L);
   private static int bn = Integer.reverse(0);
   private static long lt = Long.reverse(9145631871358744198L);
   private static int dm = Integer.reverse(-1744830464);
   private static int bo = (33554432 >>> 57 | 33554432 << ~57 + 1) & -1;
   private static int be = 12288 >>> 74 | 12288 << -74;
   private static long ex = Long.reverse(9145631871358744198L);
   private static int as = (0 >>> 171 | 0 << ~171 + 1) & -1;
   private static int kb = 0 >>> 54 | 0 << ~54 + 1;
   private static long mg = Long.reverse(2083987655641806470L);
   private static long gm = Long.reverse(9145631871358744198L);
   private static int nh = -1811939327 >>> 186 | -1811939327 << ~186 + 1;
   private static int hy = (126 >>> 33 | 126 << ~33 + 1) & -1;
   private static long im = Long.reverse(7061644215716937728L);
   private static int ai = (0 >>> 190 | 0 << -190) & -1;
   private static long fj = Long.reverse(7061644215716937728L);
   private static long cw = Long.reverse(2083987655641806470L);
   private static String[] b = new String[ni];
   private static int kn = (0 >>> 75 | 0 << ~75 + 1) & -1;
   private static long eo = Long.reverse(9145631871358744198L);
   private static int at = Integer.reverse(0);
   private static int iy = Integer.reverse(301989888);
   private static int lh = Integer.reverse(-1442840576);
   private static int lg = (4096 >>> 204 | 4096 << ~204 + 1) & -1;
   private static long dh = Long.reverse(2083987655641806470L);
   private static long dn = Long.reverse(2083987655641806470L);
   private static long bf = Long.reverse(9145631871358744198L);
   private static int ac = Integer.reverse(0);
   private static long fa = Long.reverse(9145631871358744198L);
   private static int hd = -1073741823 >>> 187 | -1073741823 << ~187 + 1;
   private static int ek = Integer.reverse(-1);
   private static int jy = Integer.reverse(167772160);
   private static long ka = Long.reverse(7061644215716937728L);
   private static int aj = (16384 >>> 142 | 16384 << -142) & -1;
   private static long c;
   private static int jb = 19136512 >>> 18 | 19136512 << -18;
   private static int km = Integer.reverse(Integer.MIN_VALUE);
   private static long ja = Long.reverse(9145631871358744198L);
   private static long lw = Long.reverse(9145631871358744198L);
   private static long fg = Long.reverse(7061644215716937728L);
   private static int ba = 5632 >>> 41 | 5632 << -41;
   private static int ip = Integer.reverse(-1577058304);
   private static int gn = Integer.reverse(1275068416);
   private static long ea = Long.reverse(9145631871358744198L);
   private static int gj = Integer.reverse(0);
   private static int hk = Integer.reverse(-1);
   private static int x = 0 >>> 91 | 0 << -91;
   private static int bx = Integer.reverse(0);
   private static int p = Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1;
   private static long kx = Long.reverse(2083987655641806470L);
   private static int gw = -1 >>> 167 | -1 << -167;
   private static int mj = Integer.reverse(-1);
   private static int bg = (786432 >>> 210 | 786432 << ~210 + 1) & -1;
   private static long mq = Long.reverse(7061644215716937728L);
   private static long nf = Long.reverse(7061644215716937728L);
   private static long var_do = Long.reverse(7061644215716937728L);
   private static long me = Long.reverse(9145631871358744198L);
   private static long mn = Long.reverse(9145631871358744198L);
   private static long gx = Long.reverse(9145631871358744198L);
   private static int fw = Integer.reverse(-1);
   private static long cn = Long.reverse(9145631871358744198L);
   private static int ce = 4194304 >>> 86 | 4194304 << ~86 + 1;
   private static int gs = Integer.reverse(738197504);
   private static long mb = Long.reverse(2083987655641806470L);
   private static int fz = 736 >>> 132 | 736 << -132;
   private static int cp = (17 >>> 96 | 17 << ~96 + 1) & -1;
   private static int nj = Integer.reverse(Integer.MIN_VALUE);
   private static int ag = Integer.reverse(268435456);
   private static int bz = 1 >>> 96 | 1 << -96;
   private static int ar = Integer.reverse(-1073741824);
   private static long z = Long.reverse(2083987655641806470L);
   private static long ff = Long.reverse(2083987655641806470L);
   private static int em = Integer.reverse(1140850688);
   private static int cb = Integer.reverse(1073741824);
   private static int cf = Integer.reverse(1073741824);
   private static int iu = 0 >>> 173 | 0 << ~173 + 1;
   private static long ky = Long.reverse(7061644215716937728L);
   private static long hh = Long.reverse(2083987655641806470L);
   private static int kc = (339738624 >>> 150 | 339738624 << -150) & -1;
   private static int cj = Integer.reverse(Integer.MIN_VALUE);
   private static long cx = Long.reverse(7061644215716937728L);
   private static long gt = Long.reverse(2083987655641806470L);
   private static int eh = (-1 >>> 165 | -1 << ~165 + 1) & -1;
   private static int cg = 122880 >>> 45 | 122880 << ~45 + 1;
   private static int bp = (13631488 >>> 52 | 13631488 << ~52 + 1) & -1;
   private static long dr = Long.reverse(7061644215716937728L);
   private static long gh = Long.reverse(2083987655641806470L);

   public void w() {
      try {
         NLoginCore_300 var1 = NLoginCore_561.a(this.b);
         if (var1 != null) {
            BCryptHashProvider.a(var1.a());
         }
      } catch (Exception var2) {
         NLoginCore_370.c(a(kc, kd ^ ke), var2);
      }
   }

   public Integer a() {
      NLoginCore_459 var10000 = this.b;
      String var10001 = a(ao, ap ^ aq);
      Object[] var10002 = new Object[ar];
      var10002[as] = NLoginCore_477.u.a(new Object[at]);
      var10002[au] = NLoginCore_477.r.a(new Object[av]);
      var10002[aw] = NLoginCore_477.t.a(new Object[ax]);
      var10001 = String.format(var10001, var10002);
      var10002 = new Object[ay];
      var10002[az] = a(ba & bb, bc);
      NLoginCore_171 var1 = var10000.a(var10001, var10002);

      Object var8;
      label43: {
         Integer var5;
         try {
            ResultSet var2 = var1.d();
            if (!var2.next()) {
               var8 = null;
               break label43;
            }

            byte[] var3 = var2.getBytes(bd);
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));
            var5 = var4.readUnsignedShort();
         } catch (Throwable var7) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var1 != null) {
            var1.close();
         }

         return var5;
      }

      if (var1 != null) {
         var1.close();
      }

      return (Integer)var8;
   }

   private static String a(int var0, long var1) {
      var1 ^= 70L;
      var1 ^= 6442189113801633879L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(22 + 46),
                     (byte)(16 + 53),
                     (byte)(27 + 56),
                     (byte)(27 + 20),
                     (byte)(3 + 64),
                     (byte)(41 + 25),
                     (byte)(61 + 6),
                     (byte)(30 + 17),
                     (byte)(29 + 51),
                     (byte)(23 + 52),
                     (byte)(7 + 60),
                     (byte)(56 + 27),
                     53,
                     (byte)(55 + 25),
                     (byte)(92 + 5),
                     (byte)(87 + 13),
                     (byte)(13 + 87),
                     105,
                     (byte)(16 + 94),
                     (byte)(77 + 26)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.A("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲԇәԋӺԂԋԇӞԇԋ", (byte)90, 65));
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

   public long a() {
      String var1 = NLoginCore_477.e.a(new Object[ac]);

      try {
         NLoginCore_171 var2 = this.b.a(a(ad & ae, af) + var1 + a(ag, ah));

         long var4;
         label53: {
            try {
               ResultSet var3 = var2.d();
               if (var3.next()) {
                  var4 = var3.getLong(aj);
                  break label53;
               }
            } catch (Throwable var7) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var6) {
                     var7.addSuppressed(var6);
                  }
               }

               throw var7;
            }

            if (var2 != null) {
               var2.close();
            }

            return 0L;
         }

         if (var2 != null) {
            var2.close();
         }

         return var4;
      } catch (Exception var8) {
         NLoginCore_370.c(a(ak, al ^ am) + var1, var8);
         return 0L;
      }
   }

   public void a(int var1) {
      Integer var2 = this.a();
      if (var2 == null) {
         NLoginCore_459 var10000 = this.b;
         String var10001 = a(be, bf);
         Object[] var10002 = new Object[bg];
         var10002[bh] = NLoginCore_477.r.a(new Object[bi]);
         var10002[bj] = NLoginCore_477.t.a(new Object[bk]);
         var10002[bl] = NLoginCore_477.u.a(new Object[bm]);
         NLoginCore_288 var3 = var10000.a(String.format(var10001, var10002));

         try {
            byte[] var4 = NLoginCore_140.a(var1x -> var1x.f(var1));
            PreparedStatement var5 = var3.d();
            var5.setString(bo, a(bp & bq, br));
            var5.setBytes(bs, var4);
            var5.execute();
         } catch (Throwable var9) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var7) {
                  var9.addSuppressed(var7);
               }
            }

            throw var9;
         }

         if (var3 != null) {
            var3.close();
         }
      } else if (var2 != var1) {
         NLoginCore_459 var13 = this.b;
         String var14 = a(bt & bu, bv);
         Object[] var15 = new Object[bw];
         var15[bx] = NLoginCore_477.r.a(new Object[by]);
         var15[bz] = NLoginCore_477.t.a(new Object[ca]);
         var15[cb] = NLoginCore_477.u.a(new Object[cc]);
         NLoginCore_288 var10 = var13.a(String.format(var14, var15));

         try {
            byte[] var11 = NLoginCore_140.a(var1x -> var1x.f(var1));
            PreparedStatement var12 = var10.d();
            var12.setBytes(ce, var11);
            var12.setString(cf, a(cg, ch ^ ci));
            var12.execute();
         } catch (Throwable var8) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var6) {
                  var8.addSuppressed(var6);
               }
            }

            throw var8;
         }

         if (var10 != null) {
            var10.close();
         }
      }
   }

   static {
      b();
   }

   public void a(NLoginCore_199 var1) {
      byte[] var2;
      try {
         NLoginCore_459 var10000 = this.b;
         String var10001 = a(kg, kh ^ ki);
         Object[] var10002 = new Object[kj];
         var10002[kk] = NLoginCore_477.u.a(new Object[kl]);
         var10002[km] = NLoginCore_477.r.a(new Object[kn]);
         var10002[ko] = NLoginCore_477.t.a(new Object[kp]);
         var10001 = String.format(var10001, var10002);
         var10002 = new Object[kq];
         var10002[kr] = a(ks & kt, ku);
         NLoginCore_171 var3 = var10000.a(var10001, var10002);

         try {
            ResultSet var4 = var3.d();
            if (!var4.next()) {
               var2 = new byte[kv];
               new SecureRandom().nextBytes(var2);
               Connection var5 = this.b.a();

               try {
                  var10001 = a(kw, kx ^ ky);
                  var10002 = new Object[kz];
                  var10002[la] = NLoginCore_477.r.a(new Object[lb]);
                  var10002[lc] = NLoginCore_477.t.a(new Object[ld]);
                  var10002[le] = NLoginCore_477.u.a(new Object[lf]);
                  PreparedStatement var6 = var5.prepareStatement(String.format(var10001, var10002));

                  try {
                     var6.setString(lg, a(lh, li ^ lj));
                     var6.setBytes(lk, var2);
                     var6.execute();
                  } catch (Throwable var19) {
                     if (var6 != null) {
                        try {
                           var6.close();
                        } catch (Throwable var18) {
                           var19.addSuppressed(var18);
                        }
                     }

                     throw var19;
                  }

                  if (var6 != null) {
                     var6.close();
                  }
               } catch (Exception var20) {
                  throw new IllegalArgumentException(a(ll, lm ^ ln), var20);
               } finally {
                  this.b.a(var5);
               }
            } else {
               var2 = var4.getBytes(lo);
               if (var2 == null || var2.length == 0) {
                  throw new IllegalArgumentException(a(lp, lq ^ lr));
               }
            }
         } catch (Throwable var22) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var17) {
                  var22.addSuppressed(var17);
               }
            }

            throw var22;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Exception var23) {
         throw new IllegalArgumentException(a(ls, lt), var23);
      }

      var1.b(var2);
   }

   @Generated
   public NLoginCore_459 a() {
      return this.b;
   }

   @Generated
   public NLoginType_008 b() {
      return this.k;
   }

   private static void b() {
      c = 7020033597024491320L;
      long var0 = c ^ 6442189113801633879L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(23 + 46),
               (byte)(68 + 15),
               (byte)(24 + 23),
               (byte)(9 + 58),
               (byte)(6 + 60),
               67,
               47,
               (byte)(40 + 40),
               (byte)(33 + 42),
               (byte)(55 + 12),
               (byte)(58 + 25),
               (byte)(37 + 16),
               (byte)(50 + 30),
               (byte)(86 + 11),
               (byte)(19 + 81),
               (byte)(55 + 45),
               (byte)(73 + 32),
               (byte)(43 + 67),
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_173.B("ŲƕƒƂƚŸƢŹƑťƟƤƔżƬƚƉůŰůƢƢƱƉƣƔưƧƎƳŻƬ", (byte)84, 66);
               b[1] = NLoginCore_446.B("ƀƜƃƚŷƥƖţſƔŷƔƀŻŽƉƏƊƟƈƩƣźŻ", (byte)84, 66);
               b[2] = NLoginCore_092.C("ԖԞԛөӻԫԀөӺӳӰԦԣԎԗԲԑӹԏԴԔԗԄԅ", (byte)84, 67);
               b[3] = NLoginCore_553.C("ԊԦԍԤԁԯԠӭԉԞԁԞԊԅԇԓԙԔԩԒԳԭԄԅ", (byte)84, 67);
               b[4] = NLoginCore_241.E("յսպՈ՚֊՟ՈՙՒՏօւխն֑հ\u0558ծ֓ճնգդ", (byte)84, 69);
               b[5] = NLoginCore_530.F("ճՔյոտտվր֍ճՌէՓ֒խչՔՓֈ֍֙֘է֔ՠձ֡՚֑֘եճս֪ցշ֧֟֜\u0590֤ըջո", (byte)84, 70);
               b[6] = NLoginCore_004.B("ƊūƌƏƖƖƕƗƤƊţƠƩŵƉƫƇűźŽŬƇƠƴƃƅƂųƲƊƽƼƛŽƙƚƢƯƛƨƩƱƴƔƺƄƬƫƇǈƳƤƔƝƚƛ", (byte)84, 66);
               b[7] = NLoginCore_138.A("ŠŽƏŝŵŝơƗŵŲŶƪƖŧƦŨƢƅƏƔƯŵưƮƯƙƨųƫƬƓƔ", (byte)84, 65);
               b[8] = NLoginCore_384.E("աէշՙք\u0557քպթվ՟\u0558", (byte)84, 69);
               b[9] = NLoginCore_427.F("դյՈգ՛աքսբգՓ֎օշժց֕ճ֜ս֓ո֕ՙ֔փռնւպց֟֒ֈա֢֗լ֭\u058b֮օ֢քհ֖֨ֆ֏ִ֓նִֆ\u0590ֹֽ֬֞֗֡քּ֒", (byte)84, 70);
               b[10] = NLoginCore_241.A("ƎŮƔƚƖŵŻűŦŵƟƊżƪƨƉƄůƏŮƇŵƗƓƭƷƔŶŸƜƊƫǀƻƓƗƽſƀƐƒƵƦƽƵƹƢƥƨƉƍƯǑǈǃƉƥƕƥƖƤưƗƛ", (byte)84, 65);
               b[11] = NLoginCore_127.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơůƂƊƃƐŲŶƑƲƒư", (byte)84, 66);
               b[12] = NLoginCore_530.A("ŴŜƗřŵŻŰťŞƈŨŧƃƩƂƏŨƈžŮƆƱƷƌƵƋƋƺƴƞƷźƈǁƴǂǀƮƷƇǈǉƾƾƣƪƢƥƧǌƨƨƦǔƾƟƠƷƮƕǜƛƮƱ", (byte)84, 65);
               b[13] = NLoginCore_076.F("է՚էՆՠվ\u0557ՊօՌռէտժ֍եՋհ֚\u058c֊\u0558իճլչ՛՟պ֛ջ֙", (byte)84, 70);
               b[14] = NLoginCore_027.E("ֆպՉՄտէՋ֎կ֏Յւըֈՠօ֍փ֖պ֎ևն֑֔ծ՞ջ\u0590նջ֓յա֖֤֠֎տ֜֙֠֟տյֶ֘ք֍ֻ֨֩֙ֆփք", (byte)84, 69);
               b[15] = NLoginCore_091.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơůƂƊƃƐŲŶƑƲƒư", (byte)84, 66);
               b[16] = NLoginCore_451.C("ԙԇӪԞԜԫԝԠԑԪԞԮԢԔԹԃԯԨԎԔԯԭԄԅ", (byte)84, 67);
               b[17] = NLoginCore_559.A("ƐżƗƖŶŭƤŢŦŲƘů", (byte)84, 65);
               b[18] = NLoginCore_397.F("ՕրօՃՌՙտհդ՞֊էևկ֗ՠմ֊ռյՓղ֠֡ն֚իջ֍փ՞զո֪չև֧իոְռխֈ֮֯֎ք֣֫։ֽ֯մ֖փք", (byte)84, 70);
               b[19] = NLoginCore_451.B("ƜƏƢƟŠƁƟƞƃťƆžơƄŠƪƤƍƭūƥƔůŶƗŴƚŭƽŽƊƭƩƻƞưƼƅƧǁſƳƒƏ", (byte)84, 66);
               b[20] = NLoginCore_027.F("օո\u058bֈՉժֈևլՎղս֎ւաՖ֗֔ղ։սնգդ", (byte)84, 70);
               b[21] = NLoginCore_141.B("ƎƜŻūƜŶſƂƞšŲů", (byte)84, 66);
               b[22] = NLoginCore_324.F("րս\u0557ռՅ֎տօՌդ֑\u0558", (byte)84, 70);
               b[23] = NLoginCore_553.C("ӵӺԚԦԈӷӦӣԚԴӼӹ", (byte)84, 67);
               b[24] = NLoginCore_446.E("օո\u058bֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՐ֏֏կ֍փ֚֜ֆշ֕", (byte)84, 69);
               b[25] = NLoginCore_138.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁŧƦƦƆƤƚƱƳƝƎƬ", (byte)84, 65);
               b[26] = NLoginCore_138.F("օո\u058bֈՉժֈևլՎկևՑ֓ղմ\u0558մքխհ֑ս֖֝\u0590ք֢ռ\u0558գ֞", (byte)84, 70);
               b[27] = NLoginCore_091.C("ԦԙԬԩӪԋԩԨԍӯԓԂԪӲԊԶӸԏԋԎӷԲӽԭԟԱԌԶԤԣԼՃՂԊԵԋՇՇԾԥՌՀԳԤԿՐԖԵՂՉ՝Ե՞ԷԤԥ", (byte)84, 67);
               b[28] = NLoginCore_427.C("ӺԥԂӣӿԚԞԛԪԢԠԉԥԠԒԖԚԋԊԻԻӽԒԴԣԸԿԶԟԖԓԕԟԾՋԷԋԉԼԨԫԎՇՈՋԪԑ\u0557ԚՅՄԓՉՇԙՌբ\u0530գԭԜ\u0557Ղե՝՛՞ՌգՍՇԣՄհԼԹ", (byte)84, 67);
               b[29] = NLoginCore_201.C("ӺԥԂӣӿԚԞԛԪԢԠԉԥԠԒԖԚԋԊԻԻӽԒԴԣԸԿԶԟԖԓԕԟԾՋԷԋԉԼԨԫԎՇՈՋԪԑ\u0557ԚՅՄԓՉՇԙՌբ\u0530գԭԜ\u0557Ղե՝՛՞ՌգՍՇԣՄհԼԹ", (byte)84, 67);
               b[30] = NLoginCore_110.F("օո\u058bֈՉժֈևլՎկևՑ֓ղմ\u0558մքխհ֑ս֖֝\u0590ք֢ռ\u0558գ֞", (byte)84, 70);
               b[31] = NLoginCore_433.B("ƜƏƢƟŠƁƟƞƃťƆƞŨƪƉƋůƋƛƄƇƨƔƭƴƧƛƹƓůźƵ", (byte)84, 66);
               b[32] = NLoginCore_173.D("ԢԥԡԉԜӹӧӺԬ\u0530ԭԮԕԓԓԎӷԛԻԓԶԲԔԩԓԖԎӿԏԄԖԵԖԻՈԫԉԯԱԿԧԐԬԙ", (byte)84, 68);
               b[33] = NLoginCore_092.D("ԋӝԈԭԝӨөԄԞԅԜӾԓӲԔԉԨԒԐԭԞԌԉԊԴԫԟԡԅԴԽԹԛԚԗԋԘԾԢՇԻՒՆԙ", (byte)84, 68);
               b[34] = NLoginCore_138.E("օՇռՔցֈՉհ՛օգփբՕՏկզխՑշ֞֜գդ", (byte)84, 69);
               b[35] = NLoginCore_092.D("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 68);
               b[36] = NLoginCore_027.C("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 67);
               b[37] = NLoginCore_127.F("՝ըբօվ֏՜ՆՍկց\u0558", (byte)84, 70);
               b[38] = NLoginCore_530.C("ԦӨԝӵԢԩӪԑӼԦԄԤԃӶӰԐԇԎӲԘԿԽԄԅ", (byte)84, 67);
               b[39] = NLoginCore_027.C("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 67);
               b[40] = NLoginCore_324.E("ր՞ՖՔփծհլվ֑ց\u0558", (byte)84, 69);
               b[41] = NLoginCore_324.A("ŴſŹƜƕƦųŝŤƆƘů", (byte)84, 65);
               b[42] = NLoginCore_387.D("ԙԇӪԞԜԫԝԠԑԪԞԮԢԔԹԃԯԨԎԔԯԭԄԅ", (byte)84, 68);
               b[43] = NLoginCore_241.F("չերտ՟Ֆ֍ՋՏ՛ց\u0558", (byte)84, 70);
               b[44] = NLoginCore_183.D("ӶԡԦӤӭӺԠԑԅӿԫԈԨԐԸԁԕԫԝԖӴԓՁՂԗԻԌԜԮԤӿԇԙՋԚԨՈԌԙՑԝԎԩՐՏԯԥՄՌԪՐ՞ԕԷԤԥ", (byte)84, 68);
               b[45] = NLoginCore_138.A("ƜƏƢƟŠƁƟƞƃťƆžơƄŠƪƤƍƭūƥƠűŭƳƇƩƪƥŹƾƔŹƁưƠƄƴƲƞƆƆƅǆƙƘƌǂǀƨǏƑƿǓƚƛ", (byte)84, 65);
               b[46] = NLoginCore_384.D("ԢԥԡԉԜӹӧӺԬ\u0530ԬԊԌԦԵԈԫӴԭԚԒԲԖӳԐԬӼԱӿԡՁԲԀԪԈԾԯՌ\u0530ՄԛՒԫԩՉԭԊԦԤ՜ԎԼ\u0530ԧԤԥ", (byte)84, 68);
               b[47] = NLoginCore_223.B("ƁœžƣƓŞşźƔŻƒŴƉŨƊſƞƈƆƣƔƂſƀƪơƕƗŻƪƳƯƑƐƍƁƎƴƘƽƱǈƼƏ", (byte)84, 66);
               b[48] = NLoginCore_384.F("ոզՉսջ֊ռտհ։տ՝՞րֆ֙Րգ֗Քՙ\u058cգդ", (byte)84, 70);
               b[49] = NLoginCore_241.D("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 68);
               b[50] = NLoginCore_027.D("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԻԭԖԛԏԥӻԔԨԅԉ", (byte)84, 68);
               b[51] = NLoginCore_530.A("ƜƏƢƟŠƁƟƞƃťƇŷƠƇŦƋƞƟźƢƱƑƷƒŴưƸƺƌŷƖƾƠƛžǀưƒƺƚƟƛƚƏ", (byte)84, 65);
               b[52] = NLoginCore_004.F("օո\u058bֈՉժֈևլՎղս֎ւաՖ֗֔ղ։սնգդ", (byte)84, 70);
               b[53] = NLoginCore_530.A("ƎƜŻūƜŶſƂƞšŲů", (byte)84, 65);
               b[54] = NLoginCore_004.C("ԡԞӸԝӦԯԠԦӭԅԲӹ", (byte)84, 67);
               b[55] = NLoginCore_127.F("ՔՙչօէՖՅՂչ֓՛\u0558", (byte)84, 70);
               b[56] = NLoginCore_384.F("օո\u058bֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՐ֏֏կ֍փ֚֜ֆշ֕", (byte)84, 70);
               b[57] = NLoginCore_427.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁŧƦƦƆƤƚƱƳƝƎƬ", (byte)84, 65);
               b[58] = NLoginCore_387.D("ԦԙԬԩӪԋԩԨԍӯԒԉԖԱԯԋӺԤӹԽԶӿԜԘԯԺԃӻԶԃԩԠ", (byte)84, 68);
               b[59] = NLoginCore_232.E("օո\u058bֈՉժֈևլՎղա։Ցթ֕\u0557ծժխՖ֑՜\u058cվ\u0590ի֕փւ֛֢֡թ֔ժ֦֦֝ք֫֟֒փ֞֯յּֽ֖֔֡֨֔փք", (byte)84, 69);
               b[60] = NLoginCore_451.F("ՙքաՂ՞չսպ։ցր։ց֖է։\u058b\u058cծթՏզգդ", (byte)84, 70);
               b[61] = NLoginCore_201.C("ӺԥԂӣӿԚԞԛԪԢԡԪԢԷԈԪԬԭԏԊӰԇԄԅ", (byte)84, 67);
               b[62] = NLoginCore_241.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŵƒƎƥưŹűƬŹƟƖ", (byte)84, 65);
               b[63] = NLoginCore_201.F("օո\u058bֈՉժֈևլՎձըյ\u0590֎ժՙփ\u0558֜֕՞ջշ֎֙բ՚֕բֈտ", (byte)84, 70);
               b[64] = NLoginCore_451.B("ƕƚƜƢžŸŴƏŻƞƆů", (byte)84, 66);
               b[65] = NLoginCore_183.E("օՇռՔցֈՉհ՛օգփբՕՏկզխՑշ֞֜գդ", (byte)84, 69);
               b[66] = NLoginCore_453.A("şƜƟźųƐŞŷƝƞƋžƃƪƧŭƁůƣƏƇƣźŻ", (byte)84, 65);
               b[67] = NLoginCore_324.E("ր՞ՖՔփծհլվ֑ց\u0558", (byte)84, 69);
               b[68] = NLoginCore_241.C("ӾԉԃԦԟ\u0530ӽӧӮԐԢӹ", (byte)84, 67);
               b[69] = NLoginCore_004.D("ԦӨԝӵԢԩӪԑӼԦԄԤԃӶӰԐԇԎӲԘԿԽԄԅ", (byte)84, 68);
               b[70] = NLoginCore_453.D("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 68);
               b[71] = NLoginCore_183.C("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 67);
               b[72] = NLoginCore_241.D("ӾԉԃԦԟ\u0530ӽӧӮԐԢӹ", (byte)84, 68);
               b[73] = NLoginCore_092.C("ԙԇӪԞԜԫԝԠԑԪԠӾӿԡԧԺӱԄԸӵӺԭԄԅ", (byte)84, 67);
               b[74] = NLoginCore_076.B("ƗŵŭūƚƅƇƃƕƨƘů", (byte)84, 66);
               b[75] = NLoginCore_092.F("ձՅՔրոէլր՝Ւօքբթն֒\u058bչփկՕ֚\u058cյպծք՚ճևդը", (byte)84, 70);
               b[76] = NLoginCore_091.D("ԦԙԬԩӪԋԩԨԍӯԑԁԪԑӰԕԨԩԄԬԻԙԯՂԂԫԮӷ\u0530ԃՇԓԗԦՉԄՉԿԆԧԢԛԠԦԣՋԲ՚ՕՒԙԜԛԷԤԥ", (byte)84, 68);
               b[77] = NLoginCore_004.E("շՒըՇզ։։վգ՛֓ՠտխՎոմ։֖\u058c֒ռ֖ձծփ֜ա֚֙զ֡", (byte)84, 69);
               b[78] = NLoginCore_387.C("ԆӥԬԩԢԠԥӺԑԩӽԂԞԟԸԅӲԙԓԽӼӾԺԍӿԂԒӾՁԙԞԖ", (byte)84, 67);
               b[79] = NLoginCore_183.B("ƊūƌƏƖƖƕƗƤƊŤƕŪũźƩƁƬƤƧųƦƶŭƴƍƛƕưƙƋƲƲƔƔƒǄƦƶƹǅƁƜƕƶǍƝƛǆƈƈƦƯƩƈƏơǏƩǐƎǍǆƗ", (byte)84, 66);
               b[80] = NLoginCore_183.C("ӾԉԃԦԟ\u0530ӽӧӮԐԢӹ", (byte)84, 67);
               b[81] = NLoginCore_324.F("ճՔյոտտվր֍ճՋվկզհ\u0557ճնհ\u058c֊յտմճ\u058c՜ձ֙ա֥֒ձ֡֜ը֬֬։֧֤լև\u058bְִֶ֖֑֪֬֗֝֍ַָּ֛֣ռ֤֡־֠քֵַ\u05ca֨׃ׅ֨\u05cb׃ׅ֘", (byte)84, 70);
               b[82] = NLoginCore_427.A("ƎŮƔƚƖŵŻűŦŵƟƊżƪƨƉƄůƏŮƇŵƗƓƭƷƔŶŸƜƊƫǀƻƓƗƽſƀƐƒƵƦƽƵƹƢƥƨƉƍƯǑǈǃƉƥƕƥƖƤưƗƛ", (byte)84, 65);
               b[83] = NLoginCore_127.C("ӣӻӣԧԧӻԥԟԯӥӰԵӭԌӶԤԨԐԤԛԧԗԄԅ", (byte)84, 67);
               b[84] = NLoginCore_451.B("ŴŜƗřŵŻŰťŞƈŨŧƃƩƂƏŨƈžŮƆƱƷƌƵƋƋƺƴƞƷźƈǁƴǂǀƮƷƇǈǉƾƾƣƪƢƥƧǌƨƨƦǔƾƟƠƷƮƕǜƛƮƱ", (byte)84, 66);
               b[85] = NLoginCore_092.D("ӣӻӣԧԧӻԥԟԯӥӰԵӭԌӶԤԨԐԤԛԧԗԄԅ", (byte)84, 68);
               b[86] = NLoginCore_232.D("ԔӵԖԙԠԠԟԡԮԔӬӯԷԩӵԍԈԏԆ\u0530ԟӽԈԀԻԸԯԣԝԥԠԱՄՄԸԼԍՉԮԨԝՅՑՏԐԗԹԗԢԖՄ՞՞ԧԤԥ", (byte)84, 68);
               b[87] = NLoginCore_183.B("żśƢƟƘƖƛŰƇƟŴƜƠƍƅƃƏƠŬƉƁƎƄƤƀŲƴƲƽƹŵƫƷƓƗƍƴƀƛƽƇƲƪƏ", (byte)84, 66);
               b[88] = NLoginCore_076.A("ƊūƌƏƖƖƕƗƤƊţƅŤƜƆŪƚƦŻſƌƴƕƭƙŹƢƳƴƶƔƝƩƸƯƤƚƀƷƱƔƙƲƕƩƭǆƙǊƨƤƟǕƭƚƛ", (byte)84, 65);
               b[89] = NLoginCore_530.B("ƉşśūŲůŰƠŽƓƘƨťƬƁƤůƅŲƢưƳźŻ", (byte)84, 66);
               b[90] = NLoginCore_521.B("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 66);
               b[91] = NLoginCore_446.D("ԝԊԘԕӧӮԜԄԯӳ\u0530ԑԵԠԆӳӲԛԏԗԻԽԄԅ", (byte)84, 68);
               b[92] = NLoginCore_092.A("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 65);
               b[93] = NLoginCore_183.E("՛յ֊ըՇնրՊւէՏՍֆխօ\u058bՖըֈմո֜գդ", (byte)84, 69);
               b[94] = NLoginCore_433.A("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 65);
               b[95] = NLoginCore_092.C("ӨԊӻԎԉԢԌԱԥԴԆӿԵӵԴԷԪԈԔԨӰԗԄԅ", (byte)84, 67);
               b[96] = NLoginCore_530.F("եՄ\u058bֈցտքՙհֈ՜ասվ֗դՑող֜՛՝֙լ՞աձ՝֠ոսյ", (byte)84, 70);
               b[97] = NLoginCore_241.C("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ\u0530ԝԝԽԼԷՃԠՃԽԿԾՅԵԞԫՄԡԆԩՏՒԄՄԞՐԎԭԴԷԳԹԨԷՐՋԜՓԿ\u0530ԭԹՐդՇՈ", (byte)84, 67);
               b[98] = NLoginCore_241.C("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ\u0530ԝԝӺԕԝԀӿԳՄԕԁԧԪԂԴԚԟԠԜԾՎԣԜԱԦԯԣԑԷԴՌՓԘԼԧԤԥ", (byte)84, 67);
               b[99] = NLoginCore_004.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƹżƫƿƑžƎƆƅǈƒǃƢǆǊƍƽǊƐǂƿǍǌǖƗƖƚƯǄƷƾƳ", (byte)84, 66);
               b[100] = NLoginCore_471.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƗƲƊžƠƑƀƲưƩƁƷǊƺƠǆƻǅƋƎǆƎƠƷǏƥƸǛƔưǚǠ", (byte)84, 66);
               break;
            case 1:
               b[0] = NLoginCore_223.A("ŲƕƒƂƚŸƢŹƑťƟƤƔżƬƚƉůŰůƢƞƤƎŪƄƅƏƮƝƫƯ", (byte)84, 65);
               b[1] = NLoginCore_076.C("ԊԦԍԤԁԯԠӭԉԞԂԎԎԍԔԏԨԏԬӵԜԇԄԅ", (byte)84, 67);
               b[2] = NLoginCore_141.F("յսպՈ՚֊՟ՈՙՒՏմ֍֎շՖ֕֎Ց\u058cՔ\u058cգդ", (byte)84, 70);
               b[3] = NLoginCore_241.A("ƀƜƃƚŷƥƖţſƔŶƣƆƂƝƅźżūƄųƳźŻ", (byte)84, 65);
               b[4] = NLoginCore_027.F("յսպՈ՚֊՟ՈՙՒՏիֈնդֈ֘խքճֆ֖֕՝֜ց֟լֆ\u0590֚ղ", (byte)84, 70);
               b[5] = NLoginCore_201.C("ԔӵԖԙԠԠԟԡԮԔӭԈӴԳԎԚӵӴԩԮԺԹԈԵԁԒՂӻԹԲԆԔԖԨԿԋԍՁՃԃԯՔԬՈՈԱՎԦԻԶՇ\u0558ՐԧԤԥ", (byte)84, 67);
               b[6] = NLoginCore_324.A("ƊūƌƏƖƖƕƗƤƊţƠƩŵƉƫƇűźŽŬƇƠƴƃƅƂųƲƊƽƼƛŽƙƚƢƯƛƨƩƱƴƪƽƵƶƫơƫƽƦǃƭƚƛ", (byte)84, 65);
               b[7] = NLoginCore_387.C("ӪԇԙӧӿӧԫԡӿӼԀԴԠӱ\u0530ӲԬԏԙԞԹӷӿԵԕӻԣԔԲԀԙԝՆԅԚԄԾՆԍՏԐԌԜԙ", (byte)84, 67);
               b[8] = NLoginCore_127.F("ւՙՙժխ\u058bՙֈՋփ՟\u0558", (byte)84, 70);
               b[9] = NLoginCore_530.F("դյՈգ՛աքսբգՓ֎օշժց֕ճ֜ս֓ո֕ՙ֔փռնւպց֟֒ֈա֢֗լ֭\u058b֮օ֢քհ֖֨ֆ֏ִ֓նִֻ֖֕֘֫տֵֹֹֽֿ֑֢֢֝֕֡։֬֙֬֊֘", (byte)84, 70);
               b[10] = NLoginCore_471.D("ԘӸԞԤԠӿԅӻӰӿԩԔԆԴԲԓԎӹԙӸԑӿԡԝԷՁԞԀԂԦԔԵՊՅԝԡՇԉԊԚԜԿ\u0530ՇԿՃԬԯԲԓԗԹ՛ՒԜԯՊՌ՝ԷԜԿՅթՕԤ՜՚ՂՂՃբբՋ՞Թ", (byte)84, 68);
               b[11] = NLoginCore_076.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơŭŲƧƴƄƲŴƵƙưƛ", (byte)84, 66);
               b[12] = NLoginCore_004.F("՝ՅրՂ՞դՙՎՇձՑՐլ֒իոՑձէ\u0557կ֚֠յ֞մմ֣֝և֠գձ֪֝֫֩֗֠հֱֲ֧֧\u058c֓\u058b֎\u0590ֵ֑֑֏ֽֿ֭֙֍ռ\u058cֶ֢֗֗", (byte)84, 70);
               b[13] = NLoginCore_453.C("ԈӻԈӧԁԟӸӫԦӭԝԈԠԋԮԆӬԑԻԭԫՀԉԐԸԶӽӻԿԃԩԜ", (byte)84, 67);
               b[14] = NLoginCore_092.E("ֆպՉՄտէՋ֎կ֏Յւըֈՠօ֍փ֖պ֎ևն֑֔ծ՞ջ\u0590նջ֓յա֖֤֠֎տ֖֜֙֠֝֯֕֒ն֧֬ք֨\u0590ֆֺղֺֿֿջ֏ׇֽ֦", (byte)84, 69);
               b[15] = NLoginCore_127.F("է՚էՆՠվ\u0557ՊօՌռէտժ֍եՋհ֚\u058c֊֚֜չ\u0558լա\u0590հօ֚պ", (byte)84, 70);
               b[16] = NLoginCore_076.B("ƏŽŠƔƒơƓƖƇƠƕŽƛƗƫŽŧŪƪơƄƊƋƄƶƗŹŲƭƾƛƠ", (byte)84, 66);
               b[17] = NLoginCore_559.A("ŝşřűšŵűƄƩŦťů", (byte)84, 65);
               b[18] = NLoginCore_110.B("ŬƗƜŚţŰƖƇŻŵơžƞƆƮŷƋơƓƌŪƉƷƸƍƱƂƒƤƚŵŽƏǁƐƞƾƂƏǇƓƄơƹƛƕƢƚƝǑǐơƠƭƚƛ", (byte)84, 66);
               b[19] = NLoginCore_427.F("օո\u058bֈՉժֈևլՎկէ֊խՉ֓֍ն֖Ք֎ս\u0558՟ր՝փՖ֦զճ֖ա֣ֆ֕֊ց֛խ֚֊֡ո", (byte)84, 70);
               b[20] = NLoginCore_173.D("ԦԙԬԩӪԋԩԨԍӯԐԀԌԔԙӱӬԺӻӻԎԧԻԷԕՁԽԳԼӹԆԻ", (byte)84, 68);
               b[21] = NLoginCore_138.F("թտՄՙբՊՎև՚ՐՉ\u058cՍ֏ՠ֊։֙ք֏֜նգդ", (byte)84, 70);
               b[22] = NLoginCore_324.A("űŻśſƚŰţŶƨƘŶů", (byte)84, 65);
               b[23] = NLoginCore_453.B("ƋƏŵƕƞşƘƚƣƖƨů", (byte)84, 66);
               b[24] = NLoginCore_453.F("օո\u058bֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՕկծծ֑֎ք֥֥֤֜յ֦ը֨֍֊֢լ֪\u058b֥ո", (byte)84, 70);
               b[25] = NLoginCore_559.E("օո\u058bֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՖ֘\u058c֍՛յ՞կ՟֧հ֔ըզլ֣֍ֈ֍տխ֝ո", (byte)84, 69);
               b[26] = NLoginCore_223.A("ƜƏƢƟŠƁƟƞƃťƆƞŨƪƉƋůƋƛƄƇƬůƎƥƁƎƜźƽŸƐ", (byte)84, 65);
               b[27] = NLoginCore_201.D("ԦԙԬԩӪԋԩԨԍӯԓԂԪӲԊԶӸԏԋԎӷԲӽԭԟԱԌԶԤԣԼՃՂԊԵԋՇՇԾԥՌՀԲԐԲԍԡԺՏԷԻԚՕԧԤԥ", (byte)84, 68);
               b[28] = NLoginCore_397.F("ՙքաՂ՞չսպ։ցտըքտձյչժթ֚֚՜ձ֓ւ֗֞֕վյղմվ֪֖֝ժը֛և֊խ֦֧֪։հֶչ֤֣ղ֦֨ոׁ֫֏ׂ\u058cջֶׇֻׁ֡ׄ֩տֽ֪֤֠֠֜֘", (byte)84, 70);
               b[29] = NLoginCore_521.F("ՙքաՂ՞չսպ։ցտըքտձյչժթ֚֚՜ձ֓ւ֗֞֕վյղմվ֪֖֝ժը֛և֊խ֦֧֪։հֶչ֤֣ղ֦֨ոׁ֫֏ׂ\u058cջֶ֡ׄւ֥֥֨\u05cc\u05caֈ֏ׄ֯֫֘", (byte)84, 70);
               b[30] = NLoginCore_433.E("օո\u058bֈՉժֈևլՎկևՑ֓ղմ\u0558մքխհ֓ծնռփ՛֠՜եոս", (byte)84, 69);
               b[31] = NLoginCore_471.E("օո\u058bֈՉժֈևլՎկևՑ֓ղմ\u0558մքխհ֍֛֏֝ծ֍֒յռ֛փ", (byte)84, 69);
               b[32] = NLoginCore_173.A("ƘƛƗſƒůŝŰƢƦƣƤƋƉƉƄŭƑƱƉƬƨƊƟƉƌƄŵƅźƌƫǀŻŻǃǂǅǆƱǆǃƞƏ", (byte)84, 65);
               b[33] = NLoginCore_076.D("ԋӝԈԭԝӨөԄԞԅԜӾԓӲԔԉԨԒԐԭԞԌԉԊԴԫԟԡԅԴԽԹԤՃԅՋՄԏԨԤՍՁԏԙ", (byte)84, 68);
               b[34] = NLoginCore_575.D("ԦӨԝӵԢԩӪԑӼԦԆԬԄԟԠԳԒԒӵԦԬӺԞԋӽԁӺՄԄԛԔԷ", (byte)84, 68);
               b[35] = NLoginCore_559.F("Ոօֈգ՜չՇՠֆևմՆ՝֑կ֘֎֘Ֆ֔Ք֜գդ", (byte)84, 70);
               b[36] = NLoginCore_092.A("ƗŮƂƒƠƟŻƅŶƦƂů", (byte)84, 65);
               b[37] = NLoginCore_027.B("ƟŹŰƌƣƎŲŹƦƈťů", (byte)84, 66);
               b[38] = NLoginCore_433.C("ԦӨԝӵԢԩӪԑӼԦԄӲԗԵԉԌԦӺԻԍ\u0530ԽԄԅ", (byte)84, 67);
               b[39] = NLoginCore_004.C("өԦԩԄӽԚӨԁԧԨԔԭӭԏԀӳӰԺӲԅԵԗԄԅ", (byte)84, 67);
               b[40] = NLoginCore_141.F("՜Ձֈփն֊չ՚րրէ\u0558", (byte)84, 70);
               b[41] = NLoginCore_141.B("ſƕƂŚŰƣŽƏƟƙŲů", (byte)84, 66);
               b[42] = NLoginCore_141.E("ոզՉսջ֊ռտհ։վճբ֑֏կ֚\u0557ձֈսյվպղ՞՚֝օոշ֚", (byte)84, 69);
               b[43] = NLoginCore_324.F("եՃւՃլՅպւրբս\u0558", (byte)84, 70);
               b[44] = NLoginCore_427.E("ՕրօՃՌՙտհդ՞֊էևկ֗ՠմ֊ռյՓղ֠֡ն֚իջ֍փ՞զո֪չև֧իոְռխ֊փ֣ձձ\u058bֈւֻ֊\u058cּփք", (byte)84, 69);
               b[45] = NLoginCore_138.E("օո\u058bֈՉժֈևլՎկէ֊խՉ֓֍ն֖Ք֎։՚Ֆ֜հ֒֓֎բ֧սբժ֙։խ֛֝ևկկձֱֶ֧֓ն֍նքּּ֙փք", (byte)84, 69);
               b[46] = NLoginCore_201.C("ԢԥԡԉԜӹӧӺԬ\u0530ԬԊԌԦԵԈԫӴԭԚԒԲԖӳԐԬӼԱӿԡՁԲԀԪԈԾԯՌ\u0530ՄԛՒԩՈԮԵ\u0558ԥՃԍԤԩԼԵԩ՜ԵՏԴԷՄՓբԦ", (byte)84, 67);
               b[47] = NLoginCore_521.A("ƁœžƣƓŞşźƔŻƒŴƉŨƊſƞƈƆƣƔƂſƀƪơƕƗŻƪƳƯƗƩƶƙƏƯƣƕƓƷƀƸǈǎƤƗǂǉƒƧƮǓƚƛ", (byte)84, 65);
               b[48] = NLoginCore_433.B("ƏŽŠƔƒơƓƖƇƠƔƤƫţžŧƭƒƈƥžƤƞŵŲƇŰŴƄƺƽƒ", (byte)84, 66);
               b[49] = NLoginCore_384.A("ƠŶšŻŬƝźŤƐŧũů", (byte)84, 65);
               b[50] = NLoginCore_575.C("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԷԛӳԪӺԁԐԠԠӺՀԟԔՃԹԹԍԐՆԉԧՒԙ", (byte)84, 67);
               b[51] = NLoginCore_183.C("ԦԙԬԩӪԋԩԨԍӯԑԁԪԑӰԕԨԩԄԬԻԛՁԜӾԺՂՄԖԁԠՈԩԜՃӿԛՄՆՅՁԿԬԙ", (byte)84, 67);
               b[52] = NLoginCore_127.B("ƜƏƢƟŠƁƟƞƃťƈƓƝŹƚƚƄŰūƳŽƌƋƢƤƳƛƗƱƾƍƩ", (byte)84, 66);
               b[53] = NLoginCore_471.F("մՆՕ՛ա֎Ձ\u058cՍղֈՠբլկ\u058c֙հ\u0590֛ե֜գդ", (byte)84, 70);
               b[54] = NLoginCore_127.F("։ՕէՊ֍Չ֏ձ՜Ջ՟\u0558", (byte)84, 70);
               b[55] = NLoginCore_004.E("շ\u0557ճւրՅՍՇ֒Ցճ\u0558", (byte)84, 69);
               b[56] = NLoginCore_559.B("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁųƢŰƬƢƕƍưƾƓƐƻƁƝƕƐƍƚƶưƗƒƏ", (byte)84, 66);
               b[57] = NLoginCore_451.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁůƪƄƒƊƕƧƇƔƩŶƟƋƺƽƌƷƿƼžƑƦƏ", (byte)84, 65);
               b[58] = NLoginCore_201.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŲŶƍƌŸƹŻƹƜƝƠ", (byte)84, 65);
               b[59] = NLoginCore_201.A("ƜƏƢƟŠƁƟƞƃťƉŸƠŨƀƬŮƅƁƄŭƨųƣƕƧƂƬƚƙƲƹƸƀƫƁƽƽƴƛǂƶƦƁƠǌƢƆǂƢƍƞǊƝƚƛ", (byte)84, 65);
               b[60] = NLoginCore_575.C("ӺԥԂӣӿԚԞԛԪԢԡԤԳ\u0530ԅԴԷԔԧԴԼԵӹӷԯՀӿՃԔԙԴԾ", (byte)84, 67);
               b[61] = NLoginCore_575.E("ՙքաՂ՞չսպ։ցվցյօձօՙ֏\u0590Փ֞է֜Ֆպ՚֏՜ոս֝ն", (byte)84, 69);
               b[62] = NLoginCore_091.F("օո\u058bֈՉժֈևլՎձըյ\u0590֎ժՙփ\u0558֜֕Օհկ֢֓մ֍՝֣վզ", (byte)84, 70);
               b[63] = NLoginCore_183.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŬƋƕƢŷŵƄƩƛƍƨ", (byte)84, 65);
               b[64] = NLoginCore_553.F("Փ՛ջբխժՊէպ՞։ցՐմաՕֆ֏֖զլ֜գդ", (byte)84, 70);
               b[65] = NLoginCore_451.E("օՇռՔցֈՉհ՛օգվփՌՒ\u0557֔ՙպպշ֙ՙ֓շշ֛֞շո֙֝", (byte)84, 69);
               b[66] = NLoginCore_559.F("Ոօֈգ՜չՇՠֆևռփՒւր֍Ջՙ֛եշնգդ", (byte)84, 70);
               b[67] = NLoginCore_530.F("՛վօպՅֆ՟՟խ֒ի\u0558", (byte)84, 70);
               b[68] = NLoginCore_027.A("ƚŘƃƞƝżƥƟƞƙťů", (byte)84, 65);
               b[69] = NLoginCore_387.C("ԦӨԝӵԢԩӪԑӼԦԆԃԤԈԷԖԬԦԌԍԵԇԄԅ", (byte)84, 67);
               b[70] = NLoginCore_427.E("Ոօֈգ՜չՇՠֆևջՌօլՔըթմՖը֝\u058cգդ", (byte)84, 69);
               b[71] = NLoginCore_027.F("Հ՞դ։ի֊ըօ՛֍֍\u0558", (byte)84, 70);
               b[72] = NLoginCore_521.D("ӵӫӦԇөԄԄԚԧԁԔӹ", (byte)84, 68);
               b[73] = NLoginCore_232.C("ԙԇӪԞԜԫԝԠԑԪԠӴӵԣӳԮԬԴԄԏԙԗԄԅ", (byte)84, 67);
               b[74] = NLoginCore_138.B("ŨƖŸƍƁżơƀƆŤƆů", (byte)84, 66);
               b[75] = NLoginCore_397.C("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԸӼӳԏՃԌԙԲԡՆԡԉԡԊԺԬԯԂԯԫՑՊԙ", (byte)84, 67);
               b[76] = NLoginCore_223.A("ƜƏƢƟŠƁƟƞƃťƇŷƠƇŦƋƞƟźƢƱƏƥƸŸơƤŭƦŹƽƉƍƜƿźƿƵżƝƘƑƘƹƺƾƌƢǆǇƽǇƍǓƚƛ", (byte)84, 65);
               b[77] = NLoginCore_530.F("շՒըՇզ։։վգ՛֓ՠտխՎոմ։֖\u058c֒ոոո֑֙֜֘֞֟օբ", (byte)84, 70);
               b[78] = NLoginCore_141.F("եՄ\u058bֈցտքՙհֈ՜ասվ֗դՑող֜՛\u0558՜֑֚\u0590ռ\u0590՟֚ֈ֣ը֞\u058cս֨֊֚ծ։ֈ֭ո", (byte)84, 70);
               b[79] = NLoginCore_427.D("ԔӵԖԙԠԠԟԡԮԔӮԟӴӳԄԳԋԶԮԱӽ\u0530ՀӷԾԗԥԟԺԣԕԼԼԞԞԜՎ\u0530ՀՃՏԋԦԟՀ\u0557ԧԥՐԒԒ\u0530ԹԵՉԜԢԳԵԗդԾ՝Փ", (byte)84, 68);
               b[80] = NLoginCore_183.A("ŲſƃŹƑŷŝťƠżƤů", (byte)84, 65);
               b[81] = NLoginCore_387.E("ճՔյոտտվր֍ճՋվկզհ\u0557ճնհ\u058c֊յտմճ\u058c՜ձ֙ա֥֒ձ֡֜ը֬֬։֧֤լև\u058bְִֶ֖֑֪֬֗֝֍ַָּ֛֣ռ֤֡־֠֕֔ք֟֍֝\u05cd֣ׅׄ֝֘", (byte)84, 69);
               b[82] = NLoginCore_076.E("շ\u0557սփտ՞դ՚Տ՞ֈճե֑֓ղխ\u0558ո\u0557հ՞րռ֖֠ս՟աօճ֤֔֩ռր֦ըթչջ֞֏֦֢֞\u058b֎֑ղնֶֺֿ֘֏ֹվ֢׀֏ִֹֆ", (byte)84, 69);
               b[83] = NLoginCore_387.F("Ղ՚Ղֆֆ՚քվ֎ՄՏձևյւգմՖ֗հն֞֏ի֟լ֖չ֣֥֧ք", (byte)84, 70);
               b[84] = NLoginCore_559.F("՝ՅրՂ՞դՙՎՇձՑՐլ֒իոՑձէ\u0557կ֚֠յ֞մմ֣֝և֠գձ֪֝֫֩֗֠հֱֲ֧֧\u058c֓\u058b֎\u0590ֵ֑֑֏չևִ֨֔ր֕օֵ֧֨", (byte)84, 70);
               b[85] = NLoginCore_559.E("Ղ՚Ղֆֆ՚քվ֎ՄՑՎրժհմձ֕ջ֒ե֘֠֟֜\u058cշք֏֎֥մ", (byte)84, 69);
               b[86] = NLoginCore_092.C("ԔӵԖԙԠԠԟԡԮԔӬӯԷԩӵԍԈԏԆ\u0530ԟӽԈԀԻԸԯԣԝԥԠԱՄՄԸԼԍՉԮԨԝՅՐԍԢՈԏԏԨՏԛԫԺԷԤԥ", (byte)84, 67);
               b[87] = NLoginCore_387.C("ԆӥԬԩԢԠԥӺԑԩӾԦԪԗԏԍԙԪӶԓԋԘԎԮԊӼԾԼՇՃӿԵԔԞԹՃԦԙԐՀՈՄԨԙ", (byte)84, 67);
               b[88] = NLoginCore_324.F("ճՔյոտտվր֍ճՌծՍօկՓփ֏դըյ֝վ֖ւբ\u058b֜֝֟սֆ֒֡֘֍փթ֚֠սւ֛֭ց֊ֵ֯֩֩չֻ\u0590֬փք", (byte)84, 70);
               b[89] = NLoginCore_530.B("ƉşśūŲůŰƠŽƓƛƟŻƌŭƜƯūƎƭƧƣźŻ", (byte)84, 66);
               b[90] = NLoginCore_397.F("ՠք՞՚Չչքհս։փՏփի՟\u058bն֑յլեզգդ", (byte)84, 70);
               b[91] = NLoginCore_223.D("ԝԊԘԕӧӮԜԄԯӳԮԤԁԟԎӹԉԘԑӹӷӼԩԠԷԤԘԤԔԿ\u0530Ի", (byte)84, 68);
               b[92] = NLoginCore_553.C("ӪԨԩӹԣӼԋԲӮԛԍԦԢԂԈԤԣԯԤԾԔԗԄԅ", (byte)84, 67);
               b[93] = NLoginCore_076.C("ӼԖԫԉӨԗԡӫԣԈӲԱԧԸӱԔԍԗԴԫԨԗԄԅ", (byte)84, 67);
               b[94] = NLoginCore_110.A("ŷźŪƄŠŵųűşƜŠƙƟƌƁƨžƊƛūƍŽźŻ", (byte)84, 65);
               b[95] = NLoginCore_141.B("ŞƀűƄſƘƂƧƛƪŽŧƢƪƁƀƀƙƬŬƌƍźŻ", (byte)84, 66);
               b[96] = NLoginCore_232.F("եՄ\u058bֈցտքՙհֈ՜ասվ֗դՑող֜՛֞շց֗պ֚֚ցօօ֙֞֞֙ր֎օջ\u0590֡։֥ո", (byte)84, 70);
               b[97] = NLoginCore_076.A("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓƳƲƭƹƖƹƳƵƴƻƫƔơƺƗżƟǅǈźƺƔǆƄƣƪƭƩƯƞƭǆƱǍƸǑƸǊƫƗƴƽǞ", (byte)84, 65);
               b[98] = NLoginCore_241.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠŸƪƐƕƖƒƴǄƙƒƩƅƇƉƖƋƟǉƑƠƼƝƚƛ", (byte)84, 66);
               b[99] = NLoginCore_183.D("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ\u0530ԝԝӺԕԝԀӿԳՄԕԁԧԪՃԆԵՉԛԈԘԐԏՒԜՍԬՐՔԗՇՔԚՌՉՎՓ՞՝ՓԮՕՄզՑթ", (byte)84, 68);
               b[100] = NLoginCore_446.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƗƲƊžƠƑƀƲưƩƁƷǊƺƠǆƻǅƋƎǆƌƭǌƬǇƪǛƜǅƐƘ", (byte)84, 66);
               break;
            case 2:
               b[0] = NLoginCore_553.B("ƓƗŵŵƒƖƚŠƚƖŪƦƧŤƢƌŪƛƱűƧƀƱųƸƐƵƒƛƏŹƷ", (byte)84, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.C("ӶԧӿԈԫӪӪԞԢԧԇԃӲԤԇӸԛԄԋԨӶԽԄԅ", (byte)84, 67);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   public static NLoginCore_459 a(NLoginType_008 var0, NLoginCore_036 var1, boolean var2) {
      switch (NLoginCore_468.g[var1.ordinal()]) {
         case 1:
         case 2:
            NLoginCore_219 var5 = var0.a();
            NLoginCore_147 var4 = NLoginCore_323.a(var5, var1);
            if (var2) {
               var4.a().put(a(lu & lv, lw), a(lx, ly ^ lz));
               var4.a().put(a(ma, mb ^ mc), a(md, me));
               var4.a().put(a(mf, mg ^ mh), a(mi & mj, mk));
            }

            return NLoginCore_323.a(var0, var1, var4, var1x -> {
               var1x.setMaximumPoolSize(var5.a(a(mr, ms ^ mt), mu));
               var1x.setMinimumIdle(var5.a(a(mv & mw, mx), my));
               var1x.setMaxLifetime(var5.a(a(mz & na, nb), (int)TimeUnit.MINUTES.toMillis(nc)));
               var1x.setConnectionTimeout(var5.a(a(nd, ne ^ nf), (int)TimeUnit.SECONDS.toMillis(ng)));
            });
         case 3:
            File var3 = new File(var0.c(), a(ml & mm, mn));
            return NLoginCore_586.a(var0, var3, new Properties());
         default:
            throw new IllegalArgumentException(a(mo, mp ^ mq) + var1);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_495.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.D("ЖикКоѝѕѫїЦѤњѨѢЫѐѲѱѩѯѩо", (byte)19, 68), NLoginCore_495.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѹыѽѬѴѽѹѐѹѽú", (byte)19, 66) + var1 + NLoginCore_433.B("ß", (byte)19, 66) + var2.toString(), var4
         );
      }
   }

   public boolean q() {
      return this.k.a().a().a(a(r, s), (boolean)t);
   }

   public void c() {
      try {
         NLoginCore_374.J();
      } catch (Exception var3) {
         NLoginCore_370.c(a(u & v, w), var3);
      }

      try {
         this.b.c();
      } catch (SQLException var2) {
         NLoginCore_370.c(a(y, z ^ aa), var2);
      }
   }

   public void u() {
      this.k.a().a().a(a(i, j ^ k), (boolean)l).ag();
   }

   public void v() {
      this.a((boolean)cj);
   }

   public void t() {
      this.k.a().a().a(a(e, f ^ g), (boolean)h).ag();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   public void a(boolean var1) {
      NLoginCore_036 var2 = this.b.a();

      try {
         Connection var3 = this.b.a();

         try {
            Statement var4 = var3.createStatement();

            try {
               boolean var5 = NLoginCore_323.a(this.b, NLoginCore_477.e.a(new Object[ck]));
               boolean var6 = NLoginCore_323.a(this.b, NLoginCore_477.r.a(new Object[cl]));
               switch (NLoginCore_468.g[var2.ordinal()]) {
                  case 1:
                  case 2:
                     if (!var5) {
                        var4.execute(
                           a(cm, cn)
                              + NLoginCore_477.e.a(new Object[co])
                              + a(cp, cq ^ cr)
                              + NLoginCore_436.a.getName()
                              + a(cs, ct ^ cu)
                              + NLoginCore_436.b.getName()
                              + a(cv, cw ^ cx)
                              + NLoginCore_436.c.getName()
                              + a(cy, cz)
                              + (var1 ? a(da, db ^ dc) : a(dd, de ^ df))
                              + a(dg, dh ^ di)
                              + NLoginCore_436.d.getName()
                              + a(dj & dk, dl)
                              + NLoginCore_436.e.getName()
                              + a(dm, dn ^ var_do)
                              + NLoginCore_436.f.getName()
                              + a(dp, dq ^ dr)
                              + NLoginCore_436.g.getName()
                              + a(ds, dt ^ du)
                              + NLoginCore_436.h.getName()
                              + a(dv, dw ^ dx)
                              + NLoginCore_436.i.getName()
                              + a(dy & dz, ea)
                              + NLoginCore_436.j.getName()
                              + a(eb, ec ^ ed)
                              + NLoginCore_436.k.getName()
                              + a(ee, ef)
                              + NLoginCore_436.l.getName()
                              + a(eg & eh, ei)
                              + NLoginCore_436.a.getName()
                              + a(ej & ek, el)
                        );
                        var4.execute(
                           a(em & en, eo)
                              + NLoginCore_436.b.getName()
                              + a(ep, eq ^ er)
                              + NLoginCore_477.e.a(new Object[es])
                              + a(et, eu)
                              + NLoginCore_436.b.getName()
                              + a(ev & ew, ex)
                        );
                        var4.execute(
                           a(ey & ez, fa)
                              + NLoginCore_436.g.getName()
                              + a(fb, fc)
                              + NLoginCore_477.e.a(new Object[fd])
                              + a(fe, ff ^ fg)
                              + NLoginCore_436.g.getName()
                              + a(fh, fi ^ fj)
                        );
                     }

                     if (!var6) {
                        var4.execute(
                           a(fk & fl, fm)
                              + NLoginCore_477.r.a(new Object[fn])
                              + a(fo, fp)
                              + NLoginCore_477.s.a(new Object[fq])
                              + a(fr, fs ^ ft)
                              + NLoginCore_477.t.a(new Object[fu])
                              + a(fv & fw, fx)
                              + NLoginCore_477.u.a(new Object[fy])
                              + a(fz & ga, gb)
                              + NLoginCore_477.s.a(new Object[gc])
                              + a(gd, ge)
                        );
                        this.a(gf);
                     }
                     break;
                  case 3:
                     if (!var5) {
                        var4.execute(
                           a(gg, gh ^ gi)
                              + NLoginCore_477.e.a(new Object[gj])
                              + a(gk & gl, gm)
                              + NLoginCore_436.a.getName()
                              + a(gn & go, gp)
                              + NLoginCore_436.b.getName()
                              + a(gq, gr)
                              + NLoginCore_436.c.getName()
                              + a(gs, gt ^ gu)
                              + (var1 ? a(gv & gw, gx) : a(gy & gz, ha))
                              + a(hb, hc)
                              + NLoginCore_436.d.getName()
                              + a(hd, he ^ hf)
                              + NLoginCore_436.e.getName()
                              + a(hg, hh ^ hi)
                              + NLoginCore_436.f.getName()
                              + a(hj & hk, hl)
                              + NLoginCore_436.g.getName()
                              + a(hm & hn, ho)
                              + NLoginCore_436.h.getName()
                              + a(hp, hq ^ hr)
                              + NLoginCore_436.i.getName()
                              + a(hs, ht ^ hu)
                              + NLoginCore_436.j.getName()
                              + a(hv, hw ^ hx)
                              + NLoginCore_436.k.getName()
                              + a(hy, hz ^ ia)
                              + NLoginCore_436.l.getName()
                              + a(ib, ic)
                        );
                        var4.execute(
                           a(id, ie ^ var_if)
                              + NLoginCore_436.b.getName()
                              + a(ig, ih ^ ii)
                              + NLoginCore_477.e.a(new Object[ij])
                              + a(ik, il ^ im)
                              + NLoginCore_436.b.getName()
                              + a(in, io)
                        );
                        var4.execute(
                           a(ip, iq ^ ir)
                              + NLoginCore_436.g.getName()
                              + a(is, it)
                              + NLoginCore_477.e.a(new Object[iu])
                              + a(iv, iw ^ ix)
                              + NLoginCore_436.g.getName()
                              + a(iy & iz, ja)
                        );
                     }

                     if (!var6) {
                        var4.execute(
                           a(jb, jc)
                              + NLoginCore_477.r.a(new Object[jd])
                              + a(je, jf ^ jg)
                              + NLoginCore_436.a.getName()
                              + a(jh, ji ^ jj)
                              + NLoginCore_477.t.a(new Object[jk])
                              + a(jl, jm ^ jn)
                              + NLoginCore_477.u.a(new Object[jo])
                              + a(jp, jq ^ jr)
                        );
                        this.a(js);
                     }
                     break;
                  default:
                     throw new IllegalArgumentException(a(jt, ju ^ jv) + var2);
               }
            } catch (Throwable var9) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }
               }

               throw var9;
            }

            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var10) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var7) {
                  var10.addSuppressed(var7);
               }
            }

            throw var10;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Exception var11) {
         NLoginCore_370.c(a(jw, jx) + var2.name() + a(jy, jz ^ ka), var11);
      }
   }

   public NLoginCore_495(NLoginType_008 var1, NLoginCore_036 var2) {
      this.k = var1;
      NLoginCore_370.b(a(a, b));
      this.b = a(var1, var2, (boolean)d);
   }

   public boolean p() {
      return this.k.a().a().a(a(m, n ^ o), (boolean)p);
   }
}
