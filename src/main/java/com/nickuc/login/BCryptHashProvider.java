package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.configuration.file.YamlConfiguration;

public class BCryptHashProvider {
   private static int eo = Integer.reverse(872415232);
   private static int gi = Integer.reverse(0);
   private static long op = Long.reverse(6936874581968537203L);
   private static int u = Integer.reverse(-1610612736);
   private static int am = Integer.reverse(-805306368);
   private static long ck = Long.reverse(7513335334271960691L);
   private static int c = 268435456 >>> 92 | 268435456 << ~92 + 1;
   private static int aw = (240 >>> 36 | 240 << -36) & -1;
   private static List<Pattern> r;
   private static long av = Long.reverse(576460752303423488L);
   private static String[] ZKM_STR_B = new String[BCryptHashProvider.pa];
   private static int pa = 536870919 >>> 220 | 536870919 << ~220 + 1;
   private static int nv = (434176 >>> 172 | 434176 << ~172 + 1) & -1;
   private static long kv = Long.reverse(576460752303423488L);
   private static long bm = Long.reverse(576460752303423488L);
   private static long io = Long.reverse(7513335334271960691L);
   private static int ex = Integer.reverse(-201326592);
   private static int var_do = 1241513984 >>> 57 | 1241513984 << ~57 + 1;
   private static int es = (0 >>> 72 | 0 << ~72 + 1) & -1;
   private static int cy = Integer.reverse(67108864);
   private static long ez = Long.reverse(576460752303423488L);
   private static int bd = Integer.reverse(-2013265920);
   private static int ko = (0 >>> 253 | 0 << ~253 + 1) & -1;
   private static int x = Integer.reverse(0);
   private static long dx = Long.reverse(7513335334271960691L);
   private static long cd = Long.reverse(6936874581968537203L);
   private static long c;
   private static int kh = Integer.reverse(536870912);
   private static int lh = -1879048187 >>> 124 | -1879048187 << -124;
   private static int lm = Integer.reverse(1509949440);
   private static long gh = Long.reverse(7513335334271960691L);
   private static boolean aO;
   private static long br = Long.reverse(7513335334271960691L);
   private static long dk = Long.reverse(576460752303423488L);
   private static long jh = Long.reverse(6936874581968537203L);
   private static int lf = Integer.reverse(436207616);
   private static int fy = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static int nn = Integer.reverse(-436207616);
   private static int bh = 0 >>> 50 | 0 << ~50 + 1;
   private static long id = Long.reverse(6936874581968537203L);
   private static int jk = 131072 >>> 81 | 131072 << ~81 + 1;
   private static long fl = Long.reverse(576460752303423488L);
   private static long fw = Long.reverse(7513335334271960691L);
   private static int du = (0 >>> 152 | 0 << -152) & -1;
   private static int kx = Integer.reverse(1048576);
   private static long aa = Long.reverse(576460752303423488L);
   private static KeyPair b;
   private static int kq = Integer.reverse(704643072);
   private static int ff = Integer.reverse(-1946157056);
   private static long fn = Long.reverse(6936874581968537203L);
   private static long kk = Long.reverse(576460752303423488L);
   private static int mw = Integer.reverse(0);
   private static long gb = Long.reverse(6936874581968537203L);
   private static int mm = 0 >>> 151 | 0 << -151;
   private static int iv = Integer.reverse(-503316480);
   private static int p = Integer.reverse(0);
   private static long eq = Long.reverse(7513335334271960691L);
   private static int b = Integer.reverse(0);
   private static int nt = 420 >>> 162 | 420 << ~162 + 1;
   private static int mq = 0 >>> 33 | 0 << -33;
   private static int go = (64 >>> 98 | 64 << ~98 + 1) & -1;
   private static int lu = 67108864 >>> 250 | 67108864 << -250;
   private static int ls = (524288 >>> 242 | 524288 << ~242 + 1) & -1;
   private static long jn = Long.reverse(7513335334271960691L);
   private static long jc = Long.reverse(6936874581968537203L);
   private static boolean aL = (BCryptHashProvider != 0).pb;
   private static long ed = Long.reverse(576460752303423488L);
   private static int ei = Integer.reverse(0);
   private static int jo = (20185088 >>> 178 | 20185088 << ~178 + 1) & -1;
   private static int ne = 105906176 >>> 84 | 105906176 << -84;
   private static long ct = Long.reverse(6936874581968537203L);
   private static int nl = 0 >>> 31 | 0 << ~31 + 1;
   private static int n = (-1 >>> 54 | -1 << ~54 + 1) & -1;
   private static int g = (144 >>> 100 | 144 << ~100 + 1) & -1;
   private static long au = Long.reverse(6936874581968537203L);
   private static long nx = Long.reverse(576460752303423488L);
   private static long eu = Long.reverse(7513335334271960691L);
   private static long eg = Long.reverse(576460752303423488L);
   private static int w = (0 >>> 74 | 0 << -74) & -1;
   private static NLoginCore_566 a;
   private static long ml = Long.reverse(576460752303423488L);
   private static int ee = 352321536 >>> 215 | 352321536 << ~215 + 1;
   private static long il = Long.reverse(6936874581968537203L);
   private static long kc = Long.reverse(576460752303423488L);
   private static int ma = 12189696 >>> 49 | 12189696 << ~49 + 1;
   private static int dr = Integer.reverse(1677721600);
   private static int gx = -2147483634 >>> 30 | -2147483634 << ~30 + 1;
   private static int mz = 0 >>> 33 | 0 << -33;
   private static long by = Long.reverse(576460752303423488L);
   private static long dm = Long.reverse(6936874581968537203L);
   private static int oy = (0 >>> 158 | 0 << ~158 + 1) & -1;
   private static long bb = Long.reverse(7513335334271960691L);
   private static int cm = Integer.reverse(939524096);
   private static long lq = Long.reverse(7513335334271960691L);
   private static int jt = Integer.reverse(1912602624);
   private static long ac = Long.reverse(6936874581968537203L);
   private static int lx = Integer.reverse(973078528);
   private static long ag = Long.reverse(576460752303423488L);
   private static long ai = Long.reverse(7513335334271960691L);
   private static int kl = 332 >>> 2 | 332 << ~2 + 1;
   private static int dd = Integer.reverse(1140850688);
   private static int od = (4096 >>> 236 | 4096 << ~236 + 1) & -1;
   private static Pattern h;
   private static int os = Integer.reverse(234881024);
   private static int li = Integer.reverse(-1);
   private static int nq = (872415232 >>> 23 | 872415232 << -23) & -1;
   private static long ju = Long.reverse(7513335334271960691L);
   private static int iq = (67108864 >>> 25 | 67108864 << ~25 + 1) & -1;
   private static int ns = Integer.reverse(0);
   private static int lk = (0 >>> 133 | 0 << -133) & -1;
   private static int hx = Integer.reverse(0);
   private static long iw = Long.reverse(6936874581968537203L);
   private static int em = Integer.reverse(-1);
   private static long lj = Long.reverse(7513335334271960691L);
   private static long be = Long.reverse(6936874581968537203L);
   private static long kj = Long.reverse(6936874581968537203L);
   private static int r = (32 >>> 35 | 32 << -35) & -1;
   private static int fq = 0 >>> 93 | 0 << -93;
   private static int ij = (253952 >>> 13 | 253952 << ~13 + 1) & -1;
   private static int h = (512 >>> 9 | 512 << ~9 + 1) & -1;
   private static int la = (174 >>> 33 | 174 << ~33 + 1) & -1;
   private static long de = Long.reverse(6936874581968537203L);
   private static int iu = Integer.reverse(0);
   private static int eb = (1312 >>> 197 | 1312 << ~197 + 1) & -1;
   private static long i = Long.reverse(7513335334271960691L);
   private static int ir = 0 >>> 172 | 0 << ~172 + 1;
   private static int lv = Integer.reverse(Integer.MIN_VALUE);
   private static long ks = Long.reverse(576460752303423488L);
   private static long hh = Long.reverse(576460752303423488L);
   private static int ob = Integer.reverse(0);
   private static long kn = Long.reverse(576460752303423488L);
   private static long nr = Long.reverse(7513335334271960691L);
   private static long ci = Long.reverse(7513335334271960691L);
   private static int kw = 0 >>> 218 | 0 << -218;
   private static int oa = Integer.reverse(536870912);
   private static int kg = Integer.reverse(0);
   private static long mv = Long.reverse(7513335334271960691L);
   private static long cz = Long.reverse(6936874581968537203L);
   private static int kp = Integer.reverse(536870912);
   private static int ah = Integer.reverse(-1879048192);
   private static long bp = Long.reverse(576460752303423488L);
   private static long kz = Long.reverse(7513335334271960691L);
   private static int fe = Integer.reverse(0);
   private static int ha = Integer.reverse(0);
   private static long cb = Long.reverse(576460752303423488L);
   private static int ic = (2195456 >>> 143 | 2195456 << ~143 + 1) & -1;
   private static int y = (402653184 >>> 58 | 402653184 << -58) & -1;
   private static long on = Long.reverse(7513335334271960691L);
   private static long im = Long.reverse(576460752303423488L);
   private static int bt = (2816 >>> 167 | 2816 << -167) & -1;
   private static long ef = Long.reverse(6936874581968537203L);
   private static long ey = Long.reverse(6936874581968537203L);
   private static int et = Integer.reverse(-1275068416);
   private static long nf = Long.reverse(6936874581968537203L);
   private static int hk = Integer.reverse(2080374784);
   private static int aj = Integer.reverse(1342177280);
   private static long ak = Long.reverse(6936874581968537203L);
   private static int dl = Integer.reverse(603979776);
   private static int gd = Integer.reverse(-335544320);
   private static int hi = (976 >>> 68 | 976 << ~68 + 1) & -1;
   private static boolean aM = (BCryptHashProvider != 0).pc;
   private static long ay = Long.reverse(7513335334271960691L);
   private static long me = Long.reverse(6936874581968537203L);
   private static int fb = 402653184 >>> 119 | 402653184 << ~119 + 1;
   private static int el = Integer.reverse(-738197504);
   private static int pb = (131072 >>> 145 | 131072 << -145) & -1;
   private static long en = Long.reverse(7513335334271960691L);
   private static long nb = Long.reverse(7513335334271960691L);
   private static Pattern i;
   private static long ar = Long.reverse(6936874581968537203L);
   private static long bj = Long.reverse(7513335334271960691L);
   private static int ld = Integer.reverse(0);
   private static long bv = Long.reverse(576460752303423488L);
   private static int fz = Integer.reverse(Integer.MIN_VALUE);
   private static int mu = -1 >>> 195 | -1 << -195;
   private static long np = Long.reverse(7513335334271960691L);
   private static long gf = Long.reverse(576460752303423488L);
   private static long cn = Long.reverse(6936874581968537203L);
   private static long hr = Long.reverse(6936874581968537203L);
   private static long oj = Long.reverse(6936874581968537203L);
   private static NLoginCore_175 a;
   private static int nm = Integer.reverse(0);
   private static int of = Integer.reverse(-1073741824);
   private static int bq = 1342177281 >>> 156 | 1342177281 << ~156 + 1;
   private static int og = (27 >>> 30 | 27 << -30) & -1;
   private static long fd = Long.reverse(576460752303423488L);
   private static int bi = Integer.reverse(1207959552);
   private static int in = Integer.reverse(1644167168);
   private static long df = Long.reverse(576460752303423488L);
   private static int jv = Integer.reverse(-234881024);
   private static int mg = Integer.reverse(-100663296);
   private static int cv = 0 >>> 49 | 0 << ~49 + 1;
   private static int ov = (118489088 >>> 244 | 118489088 << -244) & -1;
   private static int gm = Integer.reverse(Integer.MIN_VALUE);
   private static int mo = 194 >>> 129 | 194 << -129;
   private static int mt = (401408 >>> 140 | 401408 << ~140 + 1) & -1;
   private static String[] ZKM_STR_A = new String[BCryptHashProvider.oz];
   private static long kf = Long.reverse(576460752303423488L);
   private static int ep = -1 >>> 214 | -1 << ~214 + 1;
   private static int kt = Integer.reverse(-1442840576);
   private static long ja = Long.reverse(7513335334271960691L);
   private static int ll = Integer.reverse(268435456);
   private static int ol = (14417920 >>> 113 | 14417920 << -113) & -1;
   private static long mb = Long.reverse(6936874581968537203L);
   private static long mk = Long.reverse(6936874581968537203L);
   private static int dy = (-1610612736 >>> 250 | -1610612736 << ~250 + 1) & -1;
   private static long gw = Long.reverse(576460752303423488L);
   private static int hb = Integer.reverse(0);
   private static int ax = Integer.reverse(-1);
   private static long bl = Long.reverse(6936874581968537203L);
   private static long dt = Long.reverse(7513335334271960691L);
   private static int hq = (Integer.MIN_VALUE >>> 153 | Integer.MIN_VALUE << ~153 + 1) & -1;
   private static long ke = Long.reverse(6936874581968537203L);
   private static int mn = Integer.reverse(Integer.MIN_VALUE);
   private static int jj = Integer.reverse(0);
   private static long ft = Long.reverse(7513335334271960691L);
   private static int nc = (52428800 >>> 19 | 52428800 << ~19 + 1) & -1;
   private static NLoginCore_254 a;
   private static int gu = Integer.reverse(-1677721600);
   private static int le = Integer.reverse(Integer.MIN_VALUE);
   private static long bx = Long.reverse(6936874581968537203L);
   private static long mc = Long.reverse(576460752303423488L);
   private static long ku = Long.reverse(6936874581968537203L);
   private static long fo = Long.reverse(576460752303423488L);
   private static long kb = Long.reverse(6936874581968537203L);
   private static int cw = '\uf800' >>> 'K' | 63488 << -75;
   private static long v = Long.reverse(7513335334271960691L);
   private static int gk = Integer.reverse(0);
   private static long dc = Long.reverse(7513335334271960691L);
   private static long ou = Long.reverse(576460752303423488L);
   private static int gy = (-1 >>> 42 | -1 << ~42 + 1) & -1;
   private static int cl = (0 >>> 202 | 0 << ~202 + 1) & -1;
   private static int fh = Integer.reverse(Integer.MIN_VALUE);
   private static int bw = Integer.reverse(-402653184);
   private static long o = Long.reverse(7513335334271960691L);
   private static int ki = Integer.reverse(1241513984);
   private static int hz = Integer.reverse(1275068416);
   private static long z = Long.reverse(6936874581968537203L);
   private static int ab = Integer.reverse(-536870912);
   private static long ap = Long.reverse(7513335334271960691L);
   private static int e = (0 >>> 27 | 0 << ~27 + 1) & -1;
   private static int jm = -1 >>> 196 | -1 << -196;
   private static long jf = Long.reverse(7513335334271960691L);
   private static int oz = -469762048 >>> 217 | -469762048 << ~217 + 1;
   private static int dz = Integer.reverse(-1);
   private static int oc = Integer.reverse(0);
   private static int nk = 0 >>> 122 | 0 << ~122 + 1;
   private static int bn = (10240 >>> 73 | 10240 << -73) & -1;
   private static long ad = Long.reverse(576460752303423488L);
   private static int jz = Integer.reverse(33554432);
   private static int je = Integer.reverse(1375731712);
   private static List<Pattern> s;
   private static int na = Integer.reverse(-973078528);
   private static int gr = Integer.reverse(0);
   private static int var_if = (278528 >>> 12 | 278528 << ~12 + 1) & -1;
   private static long lg = Long.reverse(7513335334271960691L);
   private static long ie = Long.reverse(576460752303423488L);
   private static int gq = 0 >>> 234 | 0 << ~234 + 1;
   private static int q = Integer.reverse(0);
   private static int iz = Integer.reverse(-1);
   private static int jl = Integer.reverse(838860800);
   private static int ht = 532480 >>> 205 | 532480 << -205;
   private static long ok = Long.reverse(576460752303423488L);
   private static long hp = Long.reverse(576460752303423488L);
   private static long km = Long.reverse(6936874581968537203L);
   private static NLoginCore_555 b;
   private static long gc = Long.reverse(576460752303423488L);
   private static int aq = (832 >>> 102 | 832 << ~102 + 1) & -1;
   private static long bo = Long.reverse(6936874581968537203L);
   private static long jx = Long.reverse(576460752303423488L);
   private static long ca = Long.reverse(6936874581968537203L);
   private static int md = 788529152 >>> 87 | 788529152 << -87;
   private static long mi = Long.reverse(576460752303423488L);
   private static int hc = (30932992 >>> 211 | 30932992 << -211) & -1;
   private static long kr = Long.reverse(6936874581968537203L);
   private static int jb = Integer.reverse(-1845493760);
   private static int ib = 4096 >>> 73 | 4096 << ~73 + 1;
   private static long hs = Long.reverse(576460752303423488L);
   private static long hd = Long.reverse(6936874581968537203L);
   private static int ch = Integer.reverse(1476395008);
   private static long oh = Long.reverse(7513335334271960691L);
   private static long cu = Long.reverse(576460752303423488L);
   private static int fu = (0 >>> 31 | 0 << -31) & -1;
   private static long ce = Long.reverse(576460752303423488L);
   private static int j = Integer.reverse(1073741824);
   private static int jg = Integer.reverse(-771751936);
   private static int fs = Integer.reverse(738197504);
   private static int cg = (0 >>> 141 | 0 << -141) & -1;
   private static int dg = (0 >>> 141 | 0 << ~141 + 1) & -1;
   private static long lz = Long.reverse(576460752303423488L);
   private static long t = Long.reverse(576460752303423488L);
   private static long al = Long.reverse(576460752303423488L);
   private static int ik = (8832 >>> 7 | 8832 << ~7 + 1) & -1;
   private static int cj = Integer.reverse(-671088640);
   private static int hf = Integer.reverse(1006632960);
   private static int lb = Integer.reverse(-1);
   private static int fv = Integer.reverse(-1409286144);
   private static int hy = Integer.reverse(-1073741824);
   private static long dq = Long.reverse(576460752303423488L);
   private static int ms = 0 >>> 84 | 0 << ~84 + 1;
   private static long ng = Long.reverse(576460752303423488L);
   private static long an = Long.reverse(7513335334271960691L);
   private static long hw = Long.reverse(7513335334271960691L);
   private static long k = Long.reverse(6936874581968537203L);
   private static int ae = 2097152 >>> 178 | 2097152 << -178;
   private static int db = Integer.reverse(-2080374784);
   private static String cL;
   private static int dw = (2496 >>> 102 | 2496 << -102) & -1;
   private static int bg = (0 >>> 212 | 0 << -212) & -1;
   private static long dj = Long.reverse(6936874581968537203L);
   private static long ln = Long.reverse(6936874581968537203L);
   private static int nh = (3264 >>> 133 | 3264 << -133) & -1;
   private static long ea = Long.reverse(7513335334271960691L);
   private static int gj = Integer.reverse(Integer.MIN_VALUE);
   private static int ka = 671088640 >>> 215 | 671088640 << ~215 + 1;
   private static int ba = Integer.reverse(-1);
   private static long oq = Long.reverse(576460752303423488L);
   private static int mx = 0 >>> 216 | 0 << ~216 + 1;
   private static int fx = (8 >>> 99 | 8 << -99) & -1;
   private static int gg = (1792 >>> 37 | 1792 << -37) & -1;
   private static long lo = Long.reverse(576460752303423488L);
   private static long ow = Long.reverse(6936874581968537203L);
   private static long nd = Long.reverse(7513335334271960691L);
   private static int bz = (786432 >>> 207 | 786432 << ~207 + 1) & -1;
   private static int is = 16777216 >>> 152 | 16777216 << -152;
   private static int kd = Integer.reverse(-1979711488);
   private static long hu = Long.reverse(7513335334271960691L);
   private static int fp = 0 >>> 68 | 0 << ~68 + 1;
   private static int my = Integer.reverse(0);
   private static long jp = Long.reverse(6936874581968537203L);
   private static long jd = Long.reverse(576460752303423488L);
   private static int fm = Integer.reverse(-872415232);
   private static long dn = Long.reverse(576460752303423488L);
   private static long af = Long.reverse(6936874581968537203L);
   private static long ig = Long.reverse(6936874581968537203L);
   private static long fc = Long.reverse(6936874581968537203L);
   private static int bk = '頀' >>> 'k' | 38912 << -107;
   private static long ih = Long.reverse(576460752303423488L);
   private static long ec = Long.reverse(6936874581968537203L);
   private static int fj = Integer.reverse(1275068416);
   private static int bs = Integer.reverse(0);
   private static long jw = Long.reverse(6936874581968537203L);
   private static long ix = Long.reverse(576460752303423488L);
   private static int oe = Integer.reverse(1073741824);
   private static long ew = Long.reverse(7513335334271960691L);
   private static int lw = (0 >>> 254 | 0 << ~254 + 1) & -1;
   private static int ky = Integer.reverse(1778384896);
   private static int lr = 0 >>> 46 | 0 << -46;
   private static long nw = Long.reverse(6936874581968537203L);
   private static long co = Long.reverse(576460752303423488L);
   private static int hm = Integer.reverse(0);
   private static int lt = Integer.reverse(0);
   private static boolean aN;
   private static int ds = -1 >>> 199 | -1 << -199;
   private static int gt = Integer.reverse(0);
   private static long bf = Long.reverse(576460752303423488L);
   private static long hl = Long.reverse(7513335334271960691L);
   private static int iy = 2304 >>> 37 | 2304 << -37;
   private static int ev = Integer.reverse(1946157056);
   private static int oo = (931135488 >>> 215 | 931135488 << ~215 + 1) & -1;
   private static int oi = 28573696 >>> 18 | 28573696 << ~18 + 1;
   private static int om = (-1 >>> 102 | -1 << ~102 + 1) & -1;
   private static int ej = Integer.reverse(0);
   private static long mh = Long.reverse(6936874581968537203L);
   private static int gl = Integer.reverse(0);
   private static long fk = Long.reverse(6936874581968537203L);
   private static int pc = ('耀' >>> 'O' | 32768 << ~79 + 1) & -1;
   private static int it = 1048576 >>> 84 | 1048576 << -84;
   private static int cs = Integer.reverse(2013265920);
   private static int or = 0 >>> 0 | 0 << -0;
   private static int di = Integer.reverse(-1006632960);
   private static long lc = Long.reverse(7513335334271960691L);
   private static int ga = 113246208 >>> 181 | 113246208 << -181;
   private static int d = (0 >>> 205 | 0 << ~205 + 1) & -1;
   private static int hn = Integer.reverse(-67108864);
   private static int hv = (138412032 >>> 245 | 138412032 << -245) & -1;
   private static int ni = Integer.reverse(-1);
   private static long mf = Long.reverse(576460752303423488L);
   private static NLoginCore_036 j;
   private static long nu = Long.reverse(7513335334271960691L);
   private static long dp = Long.reverse(6936874581968537203L);
   private static long jq = Long.reverse(576460752303423488L);
   private static int jr = Integer.reverse(0);
   private static long ox = Long.reverse(576460752303423488L);
   private static int fr = -1 >>> 18 | -1 << ~18 + 1;
   private static byte[] j;
   private static int cp = (118784 >>> 172 | 118784 << ~172 + 1) & -1;
   private static long ly = Long.reverse(6936874581968537203L);
   private static long cq = Long.reverse(6936874581968537203L);
   private static int az = 1 >>> 92 | 1 << -92;
   private static long ge = Long.reverse(6936874581968537203L);
   private static int no = (-1 >>> 182 | -1 << ~182 + 1) & -1;
   private static long as = Long.reverse(576460752303423488L);
   private static int jy = (0 >>> 125 | 0 << -125) & -1;
   private static int ii = Integer.reverse(0);
   private static int eh = 0 >>> 121 | 0 << -121;
   private static NLoginCore_555 c;
   private static int mj = Integer.reverse(100663296);
   private static long fg = Long.reverse(7513335334271960691L);
   private static long cx = Long.reverse(7513335334271960691L);
   private static int bc = Integer.reverse(0);
   private static long ho = Long.reverse(6936874581968537203L);
   private static long s = Long.reverse(6936874581968537203L);
   private static long bu = Long.reverse(6936874581968537203L);
   private static long he = Long.reverse(576460752303423488L);
   private static long hg = Long.reverse(6936874581968537203L);
   private static long l = Long.reverse(576460752303423488L);
   private static int m = Integer.reverse(-1073741824);
   private static int mr = Integer.reverse(Integer.MIN_VALUE);
   private static int fa = Integer.reverse(0);
   private static long hj = Long.reverse(7513335334271960691L);
   private static long nj = Long.reverse(7513335334271960691L);
   private static long da = Long.reverse(576460752303423488L);
   private static int at = Integer.reverse(1879048192);
   private static int cc = Integer.reverse(-1744830464);
   private static int ip = 0 >>> 43 | 0 << ~43 + 1;
   private static int fi = Integer.reverse(0);
   private static int dh = Integer.reverse(0);
   private static long nz = Long.reverse(7513335334271960691L);
   private static int cf = (0 >>> 50 | 0 << ~50 + 1) & -1;
   private static int js = Integer.reverse(-1073741824);
   private static long ot = Long.reverse(6936874581968537203L);
   private static long ji = Long.reverse(576460752303423488L);
   private static int lp = Integer.reverse(-637534208);
   private static int gn = 33554432 >>> 185 | 33554432 << ~185 + 1;
   private static long gv = Long.reverse(6936874581968537203L);
   private static long mp = Long.reverse(7513335334271960691L);
   private static int dv = 0 >>> 186 | 0 << ~186 + 1;
   private static int gs = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(7513335334271960691L);
   private static int ek = 0 >>> 81 | 0 << ~81 + 1;
   private static long gz = Long.reverse(7513335334271960691L);
   private static int er = Integer.reverse(0);
   private static int ao = Integer.reverse(805306368);
   private static int ia = 0 >>> 227 | 0 << ~227 + 1;
   private static int ny = (107 >>> 192 | 107 << -192) & -1;
   private static long cr = Long.reverse(576460752303423488L);
   private static int gp = 0 >>> 131 | 0 << -131;
   private static int a = 0 >>> 204 | 0 << ~204 + 1;

   private static void aP() {
      String var0 = NLoginCore_477.G.a(new Object[nm]);

      try {
         h = Pattern.compile(var0);
      } catch (PatternSyntaxException var2) {
         NLoginCore_370.c(a(nn & no, np) + var0 + a(nq, nr), var2);
         h = Pattern.compile((String)NLoginCore_477.G.a());
      }
   }

   static {
      b();
   }

   public static void e(NLoginType_008 var0, boolean var1) {
      var0.a().a().a(a(nt, nu), NLoginCore_150.aC());
      if (!var1) {
         var0.a()
            .a()
            .a(a(nv, nw ^ nx), Optional.ofNullable(var0.a()).map(NLoginCore_495::a).orElse(0L))
            .a(a(ny, nz), b().name().toLowerCase(Locale.ENGLISH));
      }
   }

   @Generated
   public static Pattern a() {
      return h;
   }

   private static String a(int var0, long var1) {
      var1 ^= 16L;
      var1 ^= 6167394558419234481L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(7 + 61),
                     (byte)(57 + 12),
                     (byte)(9 + 74),
                     (byte)(14 + 33),
                     (byte)(40 + 27),
                     (byte)(27 + 39),
                     (byte)(8 + 59),
                     (byte)(39 + 8),
                     (byte)(22 + 58),
                     (byte)(70 + 5),
                     (byte)(8 + 59),
                     (byte)(53 + 30),
                     53,
                     (byte)(34 + 46),
                     (byte)(58 + 39),
                     (byte)(29 + 71),
                     100,
                     (byte)(81 + 24),
                     (byte)(51 + 59),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҰҳҔӇҾӃҼҽҹ", (byte)55, 66));
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

   private static void aK() {
      String var0 = Optional.ofNullable(BedrockFloodgateHook.cH).orElse(NLoginCore_254.c.name()).toUpperCase(Locale.ENGLISH);

      try {
         a = NLoginCore_254.valueOf(var0);
      } catch (IllegalArgumentException var6) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(cw, cx) + var0 + a(cy, cz ^ da) : a(db, dc) + var0 + a(dd, de ^ df));
         a = NLoginCore_254.c;
      }

      String var1 = NLoginCore_329.a.a(new Object[dh]).toUpperCase(Locale.ENGLISH);

      try {
         b = NLoginCore_555.valueOf(var1);
      } catch (IllegalArgumentException var5) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(di, dj ^ dk) + var1 + a(dl, dm ^ dn) : a(var_do, dp ^ dq) + var1 + a(dr & ds, dt));
         b = NLoginCore_555.valueOf((String)NLoginCore_329.a(NLoginCore_329.a));
      }

      String var2 = NLoginCore_329.b.a(new Object[dv]).toUpperCase(Locale.ENGLISH);

      try {
         c = NLoginCore_555.valueOf(var2);
      } catch (IllegalArgumentException var4) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(dw, dx) + var2 + a(dy & dz, ea) : a(eb, ec ^ ed) + var2 + a(ee, ef ^ eg));
         c = NLoginCore_555.valueOf((String)NLoginCore_329.a(NLoginCore_329.b));
      }

      if (b == NLoginCore_555.e) {
         a(NLoginCore_329.c, Boolean.valueOf((ei != 0)));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  BCryptHashProvider.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.C("щѫѭэѱҐ҈ҞҊљҗҍқҕў҃ҥҤҜҢҜѱ", (byte)36, 67), BCryptHashProvider.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.B("ĪķĶùĹĵİĹńĳĀľłĻľńĆҊҍѮҡҘҝҖҗғě", (byte)36, 66) + var1 + NLoginCore_091.F("Ԛ", (byte)36, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public static Pattern b() {
      return i;
   }

   @Generated
   public static NLoginCore_036 b() {
      return j;
   }

   @Generated
   public static boolean aO() {
      return aO;
   }

   private static void aL() {
      NLoginCore_477 var0 = NLoginCore_477.E;
      int var1 = var0.r();
      if (var1 <= 0) {
         a(var0, NLoginCore_477.a(var0));
         NLoginCore_370.c(a(gu, gv ^ gw) + var1 + a(gx & gy, gz));
      }
   }

   private static void d(NLoginType_008 var0, boolean var1) {
   }

   private static void aO() {
      NLoginCore_477 var0 = NLoginCore_477.as;
      List var1 = var0.b(new Object[nl]);
      var1.replaceAll(var0x -> {
         var0x = var0x.toLowerCase(Locale.ENGLISH);
         if (!var0x.startsWith(a(og, oh))) {
            var0x = a(oi, oj ^ ok) + var0x;
         }

         return var0x;
      });
      a(var0, var1);
   }

   @Generated
   public static NLoginCore_555 c() {
      return c;
   }

   private static void aM() {
      a(NLoginCore_477.C, NLoginCore_477.C.b(new Object[mx]).stream().map(String::toLowerCase).collect(Collectors.toList()));
      a(NLoginCore_477.D, NLoginCore_477.D.b(new Object[my]).stream().map(NLoginCore_065::m).collect(Collectors.toList()));
   }

   @Generated
   public static NLoginCore_254 a() {
      return a;
   }

   @Generated
   public static NLoginCore_555 b() {
      return b;
   }

   private static void aN() {
      String var0 = NLoginCore_477.al.a(new Object[mz]).toUpperCase(Locale.ENGLISH);

      try {
         a = NLoginCore_175.valueOf(var0);
      } catch (IllegalArgumentException var2) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(na, nb) + var0 + a(nc, nd) : a(ne, nf ^ ng) + var0 + a(nh & ni, nj));
         a = NLoginCore_175.valueOf((String)NLoginCore_477.a(NLoginCore_477.al));
      }
   }

   private static void j(NLoginType_008 var0) {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      NLoginCore_329.g.a(new Object[ej]).forEach(var1x -> {
         try {
            var1.add(Pattern.compile(var1x));
         } catch (PatternSyntaxException var3x) {
            NLoginCore_370.c(a(os, ot ^ ou) + var1x + a(ov, ow ^ ox));
         }
      });
      NLoginCore_329.j.a(new Object[ek]).forEach(var1x -> {
         try {
            var2.add(Pattern.compile(var1x));
         } catch (PatternSyntaxException var3x) {
            NLoginCore_370.c(a(ol & om, on) + var1x + a(oo, op ^ oq));
         }
      });
      r = var1;
      s = var2;
      aL = a(a(el & em, en), NLoginCore_329.f);
      aM = a(a(eo & ep, eq), NLoginCore_329.i);
      String var3 = NLoginCore_329.e.a(new Object[er]).trim();
      String var4 = NLoginCore_329.h.a(new Object[es]).trim();
      a(NLoginCore_329.e, var3);
      a(NLoginCore_329.h, var4);
      if (aL == aM && var3.equals(var4) || var3.isEmpty() && var4.isEmpty()) {
         a(NLoginCore_329.e, NLoginCore_329.e.a());
         a(NLoginCore_329.f, NLoginCore_329.f.a());
         a(NLoginCore_329.h, NLoginCore_329.h.a());
         a(NLoginCore_329.i, NLoginCore_329.i.a());
         if (NLoginCore_329.d.ar()) {
            NLoginCore_370.c(a(et, eu) + var3 + a(ev, ew) + var4 + a(ex, ey ^ ez));
         }
      }

      if (var0.b().a() == NLoginCore_419.b) {
         YamlConfiguration var5 = NLoginCore_012.a();
         if (var5 != null && var5.getBoolean(a(fb, fc ^ fd), (fe != 0))) {
            String var10000 = a(ff, fg);
            Object[] var10001 = new Object[fh];
            var10001[fi] = a(fj, fk ^ fl);
            NLoginCore_370.c(var10000, var10001);
            NLoginCore_370.c(a(fm, fn ^ fo));
         }
      }
   }

   public static void a(KeyPair var0) {
      b = var0;
   }

   public static NLoginCore_515 b(NLoginType_008 var0) {
      return a(var0, (c != 0), (d != 0));
   }

   @Generated
   public static KeyPair b() {
      return b;
   }

   public static String g(String var0, boolean var1) {
      String var2 = (var1 ? NLoginCore_329.e : NLoginCore_329.h).a(new Object[gk]);
      boolean var3 = var1 ? aL : aM;
      String var5 = var0;

      String var4;
      do {
         var4 = var3 ? var5 + var2 : var2 + var5;
         var5 = var5.substring(gl, var5.length() - gm);
      } while (var5.length() > gn && var4.getBytes(StandardCharsets.UTF_8).length > go);

      return var4;
   }

   @Generated
   public static NLoginCore_175 a() {
      return a;
   }

   @Generated
   public static String aD() {
      return cL;
   }

   private static void k(NLoginType_008 var0) {
      NLoginCore_477 var1 = NLoginCore_477.ab;
      String var2 = var1.a(new Object[hb]).toUpperCase(Locale.ENGLISH);

      try {
         a = NLoginCore_566.b(var2);
         if (!a.aD()) {
            NLoginCore_370.c(NLoginCore_150.j() ? a(hc, hd ^ he) + var2 + a(hf, hg ^ hh) : a(hi, hj) + var2 + a(hk, hl));
            a = NLoginCore_566.valueOf((String)var1.a());
         }
      } catch (Exception var5) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(hn, ho ^ hp) + var2 + a(hq, hr ^ hs) : a(ht, hu) + var2 + a(hv, hw));
         a = NLoginCore_566.valueOf((String)var1.a());
      }

      l(var0);
      m(var0);
      n(var0);
      a(NLoginCore_477.T, Math.max(NLoginCore_477.T.r(), hy));
      a(NLoginCore_477.U, Math.min(NLoginCore_477.U.r(), hz));

      try {
         i = Pattern.compile(NLoginCore_477.X.a(new Object[ia]));
      } catch (PatternSyntaxException var4) {
         i = Pattern.compile((String)NLoginCore_477.X.a());
      }
   }

   public static NLoginCore_515 a(NLoginType_008 var0) {
      return a(var0, (a != 0), (b != 0));
   }

   public static boolean c(String var0, boolean var1) {
      String var2 = (var1 ? NLoginCore_329.e : NLoginCore_329.h).a(new Object[gr]);
      boolean var3 = var1 ? aL : aM;
      if (var2.isEmpty()) {
         return (gs != 0);
      } else if (var2.length() >= var0.length()) {
         return (gt != 0);
      } else {
         return var3 ? var0.endsWith(var2) : var0.startsWith(var2);
      }
   }

   public static void a(NLoginCore_329 var0, Object var1) {
      NLoginCore_525.a(var0, var0.a(), var1);
   }

   private static void h(NLoginType_008 var0) {
      NLoginCore_219 var1 = var0.a();
      String var2 = var1.a(a(ae, af ^ ag), var1.a(a(ah, ai), a(aj, ak ^ al)));
      if (!var2.endsWith(a(am, an))) {
         var2 = var2 + a(ao, ap);
      }

      File var3 = new File(var0.c(), a(aq, ar ^ as));
      if (var3.exists()) {
         File var4 = new File(var3, var2);
         File var5 = new File(var0.c(), a(at, au ^ av));
         if (!var5.exists() && var4.exists() && !var4.renameTo(var5)) {
            NLoginCore_370.d(a(aw & ax, ay) + var2 + a(az & ba, bb));
         }

         String[] var6 = var3.list();
         if (var6 != null && var6.length == 0 && !var3.delete()) {
            NLoginCore_370.d(a(bd, be ^ bf));
         }
      }
   }

   @Generated
   public static boolean aN() {
      return aN;
   }

   @Generated
   public static byte[] e() {
      return j;
   }

   @Nullable
   public static String h(String var0, boolean var1) {
      String var2 = (var1 ? NLoginCore_329.e : NLoginCore_329.h).a(new Object[gp]);
      boolean var3 = var1 ? aL : aM;
      if (var2.isEmpty()) {
         return null;
      } else if (var2.length() >= var0.length()) {
         return null;
      } else {
         boolean var4 = var3 ? var0.endsWith(var2) : var0.startsWith(var2);
         if (!var4) {
            return null;
         } else {
            int var5 = var3 ? gq : var2.length();
            int var6 = var3 ? var0.length() - var2.length() : var0.length();
            return var0.substring(var5, var6);
         }
      }
   }

   @Generated
   public static List<Pattern> l() {
      return s;
   }

   private static void m(NLoginType_008 var0) {
      NLoginCore_477 var1 = NLoginCore_477.ad;
      int var2 = var1.r();
      if (var2 < 0) {
         a(var1, NLoginCore_477.a(var1));
         NLoginCore_370.c(a(jl & jm, jn) + var2 + a(jo, jp ^ jq));
      }
   }

   static NLoginCore_515 a(NLoginType_008 var0, boolean var1, boolean var2) {
      NLoginCore_270 var3 = new NLoginCore_270();
      NLoginCore_219 var4 = var0.a();
      if (!var4.r()) {
         NLoginCore_515 var5 = NLoginCore_195.a(var0, var4, a(e, f), var1);
         if (!var5.aQ()) {
            return var5;
         }
      } else if (!var2 && !var4.X()) {
         return NLoginCore_515.b;
      }

      if (!var4.Z()) {
         return NLoginCore_515.b;
      } else {
         NLoginCore_525.a(NLoginCore_477.values(), NLoginCore_477.h, var4);
         if (NLoginType_008.c().a().n() == g) {
            NLoginCore_219 var7 = new NLoginCore_219(a(h, i), new File(var0.c(), a(j, k ^ l)));
            if (!var7.r()) {
               NLoginCore_515 var6 = NLoginCore_195.a(var0, var7, a(m & n, o), var1);
               if (!var6.aQ()) {
                  return var6;
               }
            } else if (!var2 && !var7.Z()) {
               return NLoginCore_515.b;
            }

            NLoginCore_525.a(NLoginCore_329.values(), NLoginCore_329.i, var7);
         }

         c(var0, (p != 0));
         h(var0);
         i(var0);
         aK();
         j(var0);
         aL();
         k(var0);
         aM();
         aN();
         aO();
         aP();
         d(var0, var2);
         e(var0, (q != 0));
         a(var0, var1, var2);
         f(var0, var1);
         NLoginCore_370.b(a(r, s ^ t) + var3.h() + a(u, v));
         return NLoginCore_515.a;
      }
   }

   public static void a(NLoginCore_477 var0, Object var1) {
      NLoginCore_525.a(var0, var0.a(), var1);
   }

   private static void b() {
      c = -3574778677023661562L;
      long var0 = c ^ 6167394558419234481L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(11 + 57),
               (byte)(54 + 15),
               (byte)(45 + 38),
               (byte)(21 + 26),
               (byte)(46 + 21),
               (byte)(65 + 1),
               (byte)(31 + 36),
               (byte)(18 + 29),
               (byte)(22 + 58),
               (byte)(68 + 7),
               (byte)(10 + 57),
               (byte)(29 + 54),
               (byte)(27 + 26),
               (byte)(40 + 40),
               (byte)(29 + 68),
               100,
               (byte)(57 + 43),
               (byte)(94 + 11),
               (byte)(100 + 10),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(29 + 40), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.C("ՀփՁՂշ֊չգտթծՎջցէ֑քժժֈՠձ՞՟", (byte)114, 67);
               ZKM_STR_B[1] = NLoginCore_384.B("ǚƶƔƙǉǠǘǀƺǗƟǙƳǇƽƨƞǖƩǍǏǟƶƷ", (byte)114, 66);
               ZKM_STR_B[2] = NLoginCore_201.E("֢֗բբ֤ժվ֭֠խհն", (byte)114, 69);
               ZKM_STR_B[3] = NLoginCore_092.A("ǑƛƳǖǠƴǣơƢƜƜƱƟǗƻǟǍǅǦƺƦǚǢǴǉǝǞǸǶǑǢǏ", (byte)114, 65);
               ZKM_STR_B[4] = NLoginCore_387.E("յ֧֙֊ա֩է֤կքհիֵ֝\u058cֳ֫֏֍ձ\u058b֎ֳ֮֠֏ֳտֻ֖֠տֽ֪֚\u05ca\u05ccִ֥֮֟֘׃֖", (byte)114, 69);
               ZKM_STR_B[5] = NLoginCore_138.C("ԺՐաեՙշ՚ն՞ջռՓ", (byte)114, 67);
               ZKM_STR_B[6] = NLoginCore_451.A("ǙƪƾƑǉƴƷǑǟƲƲƫ", (byte)114, 65);
               ZKM_STR_B[7] = NLoginCore_141.D("ցՒզԹձ՜՟չև՚՚Փ", (byte)114, 68);
               ZKM_STR_B[8] = NLoginCore_027.D("ՓենյցՖՊփ՝ր֏\u0557՟իպիյլ֒զխ\u0590ջհ֛Փֆ֗ռ՚ց֙֟ջ֖֚֓ՠ֦բ֔֜֡զ֡հ֭֞խ\u058c֠ֆ֪ցվտ", (byte)114, 68);
               ZKM_STR_B[9] = NLoginCore_521.C("խՂսԿտՁգբֆՆՇՊտքՑՒ՜ալ֔Պո֓֜ղՕղ֒՚ծտ֣֖֥՜ջ֨ոտշչ֞զ֎֩էֲ֦֢֟֞֨֎ցվտ", (byte)114, 67);
               ZKM_STR_B[10] = NLoginCore_138.A("ƵǓƛƛƬǘǌǋǘǎǜƻƱǪǆƺƽƾǃƧǬǟƶƷ", (byte)114, 65);
               ZKM_STR_B[11] = NLoginCore_110.E("֖֥օպ՝֖֕ը֥֠օն", (byte)114, 69);
               ZKM_STR_B[12] = NLoginCore_110.E("֖֥օպ՝֖֕ը֥֠օն", (byte)114, 69);
               ZKM_STR_B[13] = NLoginCore_241.B("ƫƽǎǍǙƮƢǛƵǘǥƺǈǒƿǃǢǋƨƿƼƹƶƷ", (byte)114, 66);
               ZKM_STR_B[14] = NLoginCore_110.F("պշ֛փճռ֩տսզ֞֠֍ֵ֪֍֔րճ֑֑֔ցւ", (byte)114, 70);
               ZKM_STR_B[15] = NLoginCore_384.C("բֆ՝զպմյ՜ւդէլՆցէգֈ֕լօՎՕ\u0558հ֒նղր\u058b՜՚\u0590", (byte)114, 67);
               ZKM_STR_B[16] = NLoginCore_397.A("ǊǝƦƛƹǠǠǠƯƻǢƤǆơƨƣǣǩƸǪƿƹƶƷ", (byte)114, 65);
               ZKM_STR_B[17] = NLoginCore_451.F("օ֩ր։֝֗֘տ֥և\u058c֢ե֥կ֍ָ֑֯֘֯ք֏պոֳչֿ֯\u0590֎֦֦ևׇ֩օָֿ֠׆֍\u058bֲֲֻ֣֝\u05cbׄ֯ך\u05cc֤֢֡", (byte)114, 70);
               ZKM_STR_B[18] = NLoginCore_384.F("֏չթՠ֡֗օ֚ֆ֤\u058c֪֬֨կ֭֔\u058c֣նյ֪֭չշոַֻׂ֏ִׅ", (byte)114, 70);
               ZKM_STR_B[19] = NLoginCore_559.E("֑ֈփ֗իմ\u058c֢֛֮֯֏ցձփ֖֒ծ֙֙֨քցւ", (byte)114, 69);
               ZKM_STR_B[20] = NLoginCore_127.D("Ցՠէտֆ\u0557՝ՈաՄֈՓ", (byte)114, 68);
               ZKM_STR_B[21] = NLoginCore_110.E("օքպյ֛֗ֆ֧ժ֘֬֎ցִ֦տִ֨\u0590ֹ֯\u058c։ֹ֎ֶ֑֪֑֥֩֒փ֒֠։ֶַּ֖אֆ\u05cf֖", (byte)114, 69);
               ZKM_STR_B[22] = NLoginCore_575.D("լՖՆԽվմբշգցթ։ևօՌ֊ձթրՓՒև֊ՖՔՕ֟֘֔լ֢֑", (byte)114, 68);
               ZKM_STR_B[23] = NLoginCore_324.B("ƔǍǎǎƴǌƠǖǙǒǀǡǞƺƣǉƬǡǛƸǏǨưǐƦǉǟƩǅǎǪǍǔǫƶƽǗǹƼƾǵȁǔǡǥǖǤǨȌǅǶȋǿȏǖǗ", (byte)114, 66);
               ZKM_STR_B[24] = NLoginCore_451.B("ƳưǕǉǙƽƽƷƖǡƹǕǝǂƶǧǪǧǨǡƹǯƽǏǃƿǈǖǲƲǗǫ", (byte)114, 66);
               ZKM_STR_B[25] = NLoginCore_324.C("կ\u0557կքվն։ւոՕՀհցփրՍռւզՍժ։֒֕պ֑\u058c֜ս֊պ֎Ֆճ֦վ֖֣֔վչ֦֩լտծ֠ծ\u058bծ֪֟փ֑վտ", (byte)114, 67);
               ZKM_STR_B[26] = NLoginCore_471.B("ǐƚƳǕǋǒǘƷǍǥǟơƹƤƴƼǠǫǊǰƭǉƶƷ", (byte)114, 66);
               ZKM_STR_B[27] = NLoginCore_241.D("ոՂ՛սճպր՟յ֍ևՉաՌ՜դֈ֓ղ֘Օձ՞՟", (byte)114, 68);
               ZKM_STR_B[28] = NLoginCore_183.E("ձվբրև֊֊ֈ֗կ֪֫ս֑օ֩նֵ֛֭֔քցւ", (byte)114, 69);
               ZKM_STR_B[29] = NLoginCore_446.A("ƦƳƗƵƼƿƿƽǌƤǠǟƲǆƺǞƫǉǪǐǢƹƶƷ", (byte)114, 65);
               ZKM_STR_B[30] = NLoginCore_453.D(
                  "՝ՁՀՄՄզ\u0557տ։ՙՊչՏ\u0590֓թՏդդ֒֏փ֘՚խ֖Ր֓ց֞֊ծցխպբք։ը֧֚֊֚֮֯ձւֳָ֑֢֟֠֡հֺ֖֮\u058bֳ֬֘־վ֬֏փ׆֥׃\u05cb֣ֆֹׂ֛֛֙ד׃\u058bדֱ\u05c9ֵ\u05cf֕י֫גַֺׁח֭\u05cc",
                  (byte)114,
                  68
               );
               ZKM_STR_B[31] = NLoginCore_446.F("֏չթՠ֡֗օ֚ֆ֤\u058cջղ֊֦ձ֑շ֩ֈְ֊֦սֻ֊ֶֹպ\u058cփ֏", (byte)114, 70);
               ZKM_STR_B[32] = NLoginCore_387.D("ծեՠմՈՑթ\u058cտո\u058bլ՞ՎՠկճՋննօա՞՟", (byte)114, 68);
               ZKM_STR_B[33] = NLoginCore_521.F("մփ֊֢֩պրիքէ֫ն", (byte)114, 70);
               ZKM_STR_B[34] = NLoginCore_004.B("ƷƩǐƑƾǡƔƷƺǤưƥǘǇǖǠƿǁǋƥƺƣǜǦǌǁǪǎǥǧǧǴǔǓǲǚǝǮǘƺǐǼǆǠǙǦȋǼȁȋǯǎȁǩǖǗ", (byte)114, 66);
               ZKM_STR_B[35] = NLoginCore_575.A("ƭƼǏƶƸƗƭƶƛǡƺǟƥǠǤǫǌƨǉǁǛǉƶƷ", (byte)114, 65);
               ZKM_STR_B[36] = NLoginCore_387.D("ծեՠմՈՑթ\u058cտո\u058bլ՞ՎՠկճՋննօա՞՟", (byte)114, 68);
               ZKM_STR_B[37] = NLoginCore_384.E("մփ֊֢֩պրիքէ֫ն", (byte)114, 69);
               ZKM_STR_B[38] = NLoginCore_575.C("խբանՐՠմՕ՜ՍՖֆ֊թ֍ՠցՇֈ֖ՠժ\u058b֑ծ֗֍՝վ՟ՙ֚\u058cչ֗զ֢֖֞֨գէնճ", (byte)114, 67);
               ZKM_STR_B[39] = NLoginCore_559.F("ոև֚ցփբոցզ֬օ֪հֶ֫֯֗ճ֔\u058c֦֔ցւ", (byte)114, 70);
               ZKM_STR_B[40] = NLoginCore_173.E("֑ֈփ֗իմ\u058c֢֛֮֯֏ցձփ֖֒ծ֙֙֨քցւ", (byte)114, 69);
               ZKM_STR_B[41] = NLoginCore_091.D("Ցՠէտֆ\u0557՝ՈաՄֈՓ", (byte)114, 68);
               ZKM_STR_B[42] = NLoginCore_451.D("խբանՐՠմՕ՜ՍՖֆ֊թ֍ՠցՇֈ֖ՠժ\u058b֑ծ֗֍՝վ՟ՙ֚\u058cչ֗զ֢֖֞֨գէնճ", (byte)114, 68);
               ZKM_STR_B[43] = NLoginCore_530.F("֢֗բբ֤ժվ֭֠խհն", (byte)114, 70);
               ZKM_STR_B[44] = NLoginCore_530.D("ռՠվ\u0557րցՈ՜լՊՉՓ", (byte)114, 68);
               ZKM_STR_B[45] = NLoginCore_092.B("ƥƬƹƮǊƴƪơǁǂƣǁǨƱǒǪƹǄƶǛǡƯǝǛǌǇǮǠǇǮƶǑǝǲǲƹǬǻǽǶȀǃǚǾǀǵǜǞǧǾǮǮǐǰȒǑǓȔǩȔǏȌǱȇǎȕǲȚǮȞȓȄȔǤȂǫ", (byte)114, 66);
               ZKM_STR_B[46] = NLoginCore_183.B("ƳǜǖƶƲǓƾƾƳǎǘƫ", (byte)114, 66);
               ZKM_STR_B[47] = NLoginCore_183.A("ƴƼƧǠǜǋƵƵƝǤƥƫ", (byte)114, 65);
               ZKM_STR_B[48] = NLoginCore_451.E(
                  "ս֦րտոետթտօ֎ձ֢ր֝ր։֏֨լ֭֜֩ոձּ\u0590֢֑֓֗ւ׆֥ր֕׀փ֪֥֮׆ֺׅ\u05cfג֍ֱׇ\u05cd֢\u0590ה֛\u05cfׇׇזםט֮\u05ce־֘ןֳּ֪֨\u05edע֧לְֶ֭", (byte)114, 69
               );
               ZKM_STR_B[49] = NLoginCore_575.E("ֆ֢֒ժ֟զ֥ր֧֘ծռեֹ֪֖֧֠չլ֜֗\u058c֖֏ׁտ֘ջտռտ֧օ֔ֈ\u05c9ַ֨֡֎֝\u05cd\u05cbְ֟\u058bְ֑֩֯֫ךֽ֛ם\u05caזִָֽׁ֢֥֧֚֜טָּֽׂק֬קֶ", (byte)114, 69);
               ZKM_STR_B[50] = NLoginCore_575.D("՚փ՝՜ՕՂ՜Ն՜բիՎտ՝պ՝զլօՉչ֊ֆՕՎ֙խտհծմ՟֣ւ՝ղ֝ՠև\u058bւ֣֢֗֬֯ժ֤֎֪տխֱոֳֵֺ֤֤֬\u058b֛֫յּօ\u0590֙և\u05caֿքֹ֊֍֓", (byte)114, 68);
               ZKM_STR_B[51] = NLoginCore_027.C(
                  "ճՓՎՇսվ՚\u0557էվ՟ՠՍ՞՞֍տլր\u0590֍Փզխ֚ղ՝\u0590֑աւլռ֥֕էպռր֖֚֬ժչ֛և֩֒խֈַ֮ժֲ֢֜օկְֹ֖֬֝֡֘ׄփֳִֺֽ֡֝օ֎ֽׁ֮֎։֮\u05ce\u05ccֶ\u05c9ׇ֖֛֗֯֯נחֱֶּלֳֿ֝׀׃ץץֵ\u05c9ֳֺ",
                  (byte)114,
                  67
               );
               ZKM_STR_B[52] = NLoginCore_559.A("ƘƜǉǛƚƗƱǀƝǞƾƫ", (byte)114, 65);
               ZKM_STR_B[53] = NLoginCore_427.A("ƜƳưǉǞƛǓǂƛǕǤƫ", (byte)114, 65);
               ZKM_STR_B[54] = NLoginCore_004.C("ւվփՂՙզՓ֊֍յտբց՚ւց֔ճճւչղդջ֗վպ֙՞֏Ք֞", (byte)114, 67);
               ZKM_STR_B[55] = NLoginCore_232.C("Հ՟՞ՖօշՖդ՛չ֏ցՂֈօ՛եզ֕հշ֗՞՟", (byte)114, 67);
               ZKM_STR_B[56] = NLoginCore_076.A("ƮǇǑƛƳǏǊǠƛǖǤǕǥƠǪƫǠǩƶǯǇưǭǩǁǭǓǂƴǥƷƴ", (byte)114, 65);
               ZKM_STR_B[57] = NLoginCore_427.D("՟Ճ՚դհֆՕՖքըՎՠըՍ՞ազճձ֑խցծ\u0590Ֆռ\u058b֒Ւ\u0590վ֤֓֞֝֔ևբն֩ժոէ\u0590֯րս֜րճ֗֫ն\u058bձְռֳֶָ֦־׃ַָ֥֠֟ֆ֥־ֺ֮֟֠֓", (byte)114, 68);
               ZKM_STR_B[58] = NLoginCore_110.B("ǐƯǉƬƿǗƴǁǞƿǐƫ", (byte)114, 66);
               ZKM_STR_B[59] = NLoginCore_223.B("ƯƜƽǒƗǠƹǀǝƥƞƦǑƴǒǥƧǤƬǡǙƯǜǐǎƮǦǶưǬƶǐǦǖǴǸƹǼǲȁǐǣǰǋ", (byte)114, 66);
               ZKM_STR_B[60] = NLoginCore_553.F("՟֘֙֙տ֗ի֤֡֝\u058b֬֩օծ֔շ֦֬փֶ֚֜։ֵֈַָּֿ֛֛֞֡֟֗׆֟\u058c\u05cbօ\u058c־\u05ce\u058c֜֯\u05c9חֵ\u05cf֤בך֢֡", (byte)114, 70);
               ZKM_STR_B[61] = NLoginCore_451.C("Ցՠէտֆ\u0557՝ՈաՄֈՓ", (byte)114, 67);
               ZKM_STR_B[62] = NLoginCore_521.E("չֆր֜֨յօ֪֟֘փ֒ֆսִլթ֪֑֯պֲ֩֨֫֩֘֫֓նշ֠\u0590ֹ֜ցׁ\u05ccַ׆\u05ca֥׃֡֜֎֭֮֡\u05c8יב֔טֵַֺֺ֜יכנאֳֳַי׆ץ\u05ccצ֮׃֩\u05c9ֶ", (byte)114, 69);
               ZKM_STR_B[63] = NLoginCore_004.C("\u0557ՄեպԿֈաըօՍՆՎչ՜պ֍Տ\u058cՔ։ց\u0557քոնՖ֎֞\u0558֔՞ո֎վ֜֠ա֤֚֩ո\u058b֘ճ", (byte)114, 67);
               ZKM_STR_B[64] = NLoginCore_004.A("ǆƽƸǌƠƩǁǤǗǐǣǄƶƦƸǇǋƣǎǎǝƹƶƷ", (byte)114, 65);
               ZKM_STR_B[65] = NLoginCore_092.A("ƩƸƿǗǞƯƵƠƹƜǠƫ", (byte)114, 65);
               ZKM_STR_B[66] = NLoginCore_091.C("Ֆգ՝չօՒբևռյՠկգ՚֑ՉՆև\u058cծ\u0557շնը֓ս֟֙պցՙ՛֡ձո֠ոևռ֥֟֞֘֘֟֞դևփֈկ֖֑֭վտ", (byte)114, 67);
               ZKM_STR_B[67] = NLoginCore_397.B(
                  "ƯǅƝǠƮǙǍǒƲƶƾǏǩƟǩƿǙǪǗƬǩǒǌǲưǩǁƩǒǴǌǧƻǲǘǠǚǏƸǹǑǶǓȃȅǹǦǄȈȌǧȏȋȍǻǽȓǥǬǮǭȄȓȕǕǨǹȒȈǼǝǜǮțǜǸșǟǴȝǸȫȆǾǫȤȝǿȫȡȦȭǵȎșȕȷȼȇȾȔșȿǻǿȸȁȋ", (byte)114, 66
               );
               ZKM_STR_B[68] = NLoginCore_223.F("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 70);
               ZKM_STR_B[69] = NLoginCore_471.B("ƯǅƝǠƮǙǍǒƲƶƾǏǩƟǩƿǙǪǗƬǩǒǌǲưǩǁƩǒǴǌǧƻǲǘǠǚǏƸǹǑǶǒȂǵǪǛǨǆǗǋǆǹȆȒǢǰǟǩǶǮȕǱǒǔǮȊȋȞȞȣǣȄȘȇȅȔǡǹȩȍǥǪȇȱǿȲȁȤȤȲȀȀȩșȃ", (byte)114, 66);
               ZKM_STR_B[70] = NLoginCore_397.B("ǐƯǉƬƿǗƴǁǞƿǐƫ", (byte)114, 66);
               ZKM_STR_B[71] = NLoginCore_138.D("բֆ՝զպմյ՜ւդզհՏգֆ՛ֆւՖղիպջ֛հֆչժ֚֜խն՝հ֠֏ձփբտ֛֢չֱ֡֩կ֟ժ֪֪ֈփ֒֎յ֧֕֕ջֳֵֹֿ", (byte)114, 68);
               ZKM_STR_B[72] = NLoginCore_004.C("ջ՟՝ֆւդճթ՛զքՓ", (byte)114, 67);
               ZKM_STR_B[73] = NLoginCore_575.E("֢֘վ֦րջո։֠կ֛ն", (byte)114, 69);
               ZKM_STR_B[74] = NLoginCore_173.A("ƦƺǐǉǋƶǚǒƛƝǐƙǜƩǥǢƻǬǈǬƹǎƪƥǆǔǢƳǭƸƶƸ", (byte)114, 65);
               ZKM_STR_B[75] = NLoginCore_433.E("՞\u0590֪֜֨և֡ջևռ։ն", (byte)114, 69);
               ZKM_STR_B[76] = NLoginCore_092.E("պ\u0590ը֫չ֤֘֝սց։֛֏ֆվְ֞֔նֲֲ֕֫ևִַռֵ֣֠֔օտֽ֗־ֻּֿׁ֜ֆ֬\u05cd־ד֢\u05c9ט\u05caֳ֭דּ֑֓֗\u05cfֳּ֬֙בֺא֣תַמט֟לֶֺֻֽ", (byte)114, 69);
               ZKM_STR_B[77] = NLoginCore_138.F("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 70);
               ZKM_STR_B[78] = NLoginCore_223.E(
                  "պ\u0590ը֫չ֤֘֝սց\u058cհւզ֥\u058cֲ֘օֈխծֲָ֯֊ׂ֠֟֜֙־֗ւֹּ֙օ׆\u05cd֙֊ג\u0590ֵ֦֮֫֟֔יֹ֙֒֜הֳ֕ב\u05ccְֱֺ֯ןֳָמחַׁי֫ץרק׆ׄבׁ\u05caב\u05caךׇ\u05f8ר\u05f6׳דָס\u05f9ׁ\u05ceןמׂ\u05ffור\u0603ֿׅךױיז",
                  (byte)114,
                  69
               );
               ZKM_STR_B[79] = NLoginCore_183.E("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 69);
               ZKM_STR_B[80] = NLoginCore_138.B("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƣǧǭǤƿǕǔǷǑǎǳǌƷǱǎǮƺǻȂǎƿȇǅǛǣǠǔǪǉȎǎǇǊȇȀȇȀǦǫȄȋǚǒǚȜțǛǱǬȞȚǰǱǿȦǢǳǹǫȅǾȜȐȢȪȨǲǲȶȦȱȵȳȐǲȥȞǸȨȘȖȒȃǺȦȅȋ", (byte)114, 66);
               ZKM_STR_B[81] = NLoginCore_397.E("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 69);
               ZKM_STR_B[82] = NLoginCore_427.A("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƩǁƥǬǏǷǠǲǯǚǥǏƳǽǳǪǚǫǶǑǛǺȀǖǠǵǗǣǨȈǏȂȊǤǓǋǟǢǣȍǕȏȏǻȝǪǽǜǗǴțȀǤȠǺǴǷȇȖȝȡȈǫȩȟǶǷ", (byte)114, 65);
               ZKM_STR_B[83] = NLoginCore_397.F("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 70);
               ZKM_STR_B[84] = NLoginCore_201.D(
                  "\u0557խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֡֗չ֍ի֫ց֎մ֥յքֳչ֊֏֊ְֿ֕֬֙֏֍׀ָ֓֞\u05cbֿ\u058c֦֫֜֜֟בׂׂ\u05cb֬֯\u05ce֪֙\u05ca\u05ccֱַֹּׁ֖֛֝מס\u05cfּ֥ט֝\u05ecֳֶ֭",
                  (byte)114,
                  68
               );
               ZKM_STR_B[85] = NLoginCore_223.E("ձ֙վւ֜֔֎֍֊֘֟ն", (byte)114, 69);
               ZKM_STR_B[86] = NLoginCore_575.B(
                  "ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƩǁƥǬǏǷǠǲǯǚǥǏƳǽǳǪǚǫǶǑǛǻƾƾǹǺȁǂǆȅǜǎǟǼǅǤǿǮǎǲǤǫǒȘǘǮǖǩǠǵȜǤǟȕǱȝȃȝȞǹǥȏǿǩǽȂȞȆȴȃȢȶǹȓǲȐȎȏȾǲǷȶɃǿȝȴȋ", (byte)114, 66
               );
               ZKM_STR_B[87] = NLoginCore_451.A("ƦǎƳƷǑǉǃǂƿǍǔƫ", (byte)114, 65);
               ZKM_STR_B[88] = NLoginCore_530.E(
                  "պ\u0590ը֫չ֤֘֝սց\u058cհւզ֥\u058cֲ֘օֈխնָպְ\u058c־ּ֡־րռ֚֡֗֡֗֞֡֕\u05cc֏ֲׅ־֪֮֯\u05cf֔֗׃ֹ֤׆ֺֽ\u05caע֚אל֟חי׀ֺסנ֧֧֬׀\u05c8\u05ccב׀שׇף֭זדצץׯֳ\u05c8\u05fc׳ן\u0600ױֿ־׃\u05f6א\u05fb\u05f9ם\u05ed\u05c9\u05cb؇\u05ceױז",
                  (byte)114,
                  69
               );
               ZKM_STR_B[89] = NLoginCore_397.D("ո\u0557ձՔէտ՜թֆէոՓ", (byte)114, 68);
               ZKM_STR_B[90] = NLoginCore_076.A(
                  "ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƫǭƯǥǁǳǱǖǳƵƱǖǌǖǌǓǖǊǏȁǄǺǧǳǣǤǟȄǉǌǸǮǢǜǍǥȄǬǵȋǸȔǶǨǺțǲǷȏȕȁȥȄȧȇǼǛȁțȕȆǪǺǻǱȤȲȅȂȒȓȳȬȨȤǮȹȪǱȉȭȝǺɀȗɀȋ", (byte)114, 65
               );
               ZKM_STR_B[91] = NLoginCore_553.F("֛պ֔շ֊֢տ\u058c֩֊֛ն", (byte)114, 70);
               ZKM_STR_B[92] = NLoginCore_091.A("ƺǞƵƾǒǌǍƴǚƼƾǈƧƻǞƳǞǚƮǊǃǐǧƽǐǪǇǪǪƷǆǙǑǉƶǷǯǖǀƾǺǚǦǳǚǣǈǆǼǄǬȎȐǼǤǞǜǨȈǴǤǮȇǳ", (byte)114, 65);
               ZKM_STR_B[93] = NLoginCore_559.A("ǓƷƵǞǚƼǋǁƳƾǜƫ", (byte)114, 65);
               ZKM_STR_B[94] = NLoginCore_433.B("ǍǗƳǛƵưƭƾǕƤǐƫ", (byte)114, 66);
               ZKM_STR_B[95] = NLoginCore_201.C("Լց\u0558ճ՜ՙՄգյչվևֆղժղվքըՏբք֚Ւ՛ձ֍֠ՠ֣֤֚", (byte)114, 67);
               ZKM_STR_B[96] = NLoginCore_324.C("Իխչևօդվ\u0558դՙզՓ", (byte)114, 67);
               ZKM_STR_B[97] = NLoginCore_223.A("ƻƨǞƙǈƪƪǝǠƠƣƣǣǦǫǡǫǣƺǯǈǄƭǇǀƯǊǎƸƹǯǸǈǏǞǇǏƺǍǚǳǟǖǆǿǵǵǼǾǇǙȂȄȈǨǾȌȆǨǗǠǯȈǧ", (byte)114, 65);
               ZKM_STR_B[98] = NLoginCore_201.A("ƒǝǆƳǔƶƛǒƺưǔǣƠƽǦơƪǤǀǞƾǒƩǭƱưǲƭǦǔǺƷǷƼǜǸȁǉƺǘȁǔǆǽǝǴǝȊƾȄǆȐǽǮǽȋȊǦȊȍǲșȒǩǦȖǔǴȋǵȚȢȔȐȝȞȩȄȊǪȉȧȜǡȚǨǾȏǪȪȥȆȹȑȩȦ", (byte)114, 65);
               ZKM_STR_B[99] = NLoginCore_446.E("֜֙՛րէփ֤֮շ֏\u058bթ֎֢տ\u058cִմַ֖֪֮ցւ", (byte)114, 69);
               ZKM_STR_B[100] = NLoginCore_453.A("ƲƮƱƝƨǙƪƢƳǡǆǀƶƢơǓƣǌǛƼǑǚǥǦƴǅǧǢǅǳǵǗǗǒưǗƶǢǲȀǶǥǼǋ", (byte)114, 65);
               ZKM_STR_B[101] = NLoginCore_138.B("ƩƸƿǗǞƯƵƠƹƜǠƫ", (byte)114, 66);
               ZKM_STR_B[102] = NLoginCore_453.F("֨ք֦մըմշր֬ֆթկտխց֩կ֕ղ֣֒֕օ\u058cձֲ֪֔֯֒\u0590ւִֹׂׂ֜փֶ֯֝׀\u0590֖", (byte)114, 70);
               ZKM_STR_B[103] = NLoginCore_241.D("ւվփՂՙզՓ֊֍յս՚կփաֈը֊էղ֙ՐօՓ֘֏վը֖վ֍ն՞օ֛֛դգճ֩֍֤֕ճ", (byte)114, 68);
               ZKM_STR_B[104] = NLoginCore_451.C("՟ՑռըզԿզՂգՍ֊ֈթքՉլխ֒հֈր։Փկկՙ֑չ֛֓նյ", (byte)114, 67);
               ZKM_STR_B[105] = NLoginCore_384.C("փոՖՏՁռՖՄն֍։ըտդ֓փց֑ւՠքև՞՟", (byte)114, 67);
               ZKM_STR_B[106] = NLoginCore_091.D("ՑՂզՓ՟ՇՒճորՀ\u0558քվ֑զժխհՍզձ՞՟", (byte)114, 68);
               ZKM_STR_B[107] = NLoginCore_471.A("ƫƽǎǍǙƮƢǛƵǘǥǒƱǢƣǠǙǥǣǡǍǉƶƷ", (byte)114, 65);
               ZKM_STR_B[108] = NLoginCore_173.E("ց֙վև֙֝֟լւ\u0590֣ն", (byte)114, 69);
               ZKM_STR_B[109] = NLoginCore_453.C("՞ն՛դնպռՉ՟խրՓ", (byte)114, 67);
               ZKM_STR_B[110] = NLoginCore_027.D("ւվփՂՙզՓ֊֍յտ\u0557իտօջփֈ֊փք֊էՙՖՏլշ՟խ֚ջ֚֚զ֝վյ֧֛֩ժթ֘կ֢ցֳ֕քտ֒\u058cցվտ", (byte)114, 68);
               ZKM_STR_B[111] = NLoginCore_241.A("ƩǓƭƷƫǖƠƱƼƱǀƷǨơǗǝǘƭƻǐǑǁƯƻǍƵǡǩǑǱǨǐǋǊǐǍǖǻǣǺǌǿȁǑȄǙǿǃȌǿȅǈǟǩǖǗ", (byte)114, 65);
               ZKM_STR_B[112] = NLoginCore_384.C("ւվփՂՙզՓ֊֍յտ\u0557իտօջփֈ֊փք\u058cչդ֚֝\u058c֘\u0590վփ֍֛՝՝ր֤֗֠փդ֛֬սրձ֤ծֳ֧֕֩֓֒վտ", (byte)114, 67);
               ZKM_STR_B[113] = NLoginCore_141.B("ƩǓƭƷƫǖƠƱƼƱǀƷǨơǗǝǘƭƻǐǑǁƯƻǍƵǡǩǑǱǨǐǋǊǐǍǖǻǣǺǌǿȁǑȄǙǿǃȌǿȅǈǟǩǖǗ", (byte)114, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.B("ƘǛƙƚǏǢǑƻǗǁǏǦƿƹƩǟƿǇƩƻƺƱǒǲǕǱǃǉǩǑǚƭ", (byte)114, 66);
               ZKM_STR_B[1] = NLoginCore_471.D("ւ՞ԼՁձֈրըբտՈ։։աՈգ֔ևՓհզձ՞՟", (byte)114, 68);
               ZKM_STR_B[2] = NLoginCore_575.F("֒ո֘֫ե֖է֜֯խռֆց֭֭վ֪֦֗֎ֵքցւ", (byte)114, 70);
               ZKM_STR_B[3] = NLoginCore_387.F("֜զվ֡֫տ֮լխէէռժ֢ֆ֪֘\u0590ֱօձַ֨ռև֩֏\u0590ֲ׀֞ս", (byte)114, 70);
               ZKM_STR_B[4] = NLoginCore_183.B("ƪǜǎƿƖǞƜǙƤƹƥƠǒǪǁǠǨǄǂƦǀǃǣǨǕǄǨƴǋǕǰƴƹǚǘǘƶǡǶǵǳȆǞǋ", (byte)114, 66);
               ZKM_STR_B[5] = NLoginCore_471.B("ǔƫƙƶƚǀǐǏƳƷƮǖƲǤƜƦƫǧǭǇǢǟƶƷ", (byte)114, 66);
               ZKM_STR_B[6] = NLoginCore_091.D("գՒՏ՛՝աՖշ՚ւոՓ", (byte)114, 68);
               ZKM_STR_B[7] = NLoginCore_004.C("օՒճէ՞րֆՈ՜պւֆւր՝թՑ֔իօբա՞՟", (byte)114, 67);
               ZKM_STR_B[8] = NLoginCore_384.A("ƫƽǎǍǙƮƢǛƵǘǧƯƷǃǒǃǍǄǪƾǅǨǓǈǳƫǞǯǔƲǙǱǷǓǮǫǲƸǾƺǬǴǺȃǑǙǜǝǭȆǜǦǂȏǖǗ", (byte)114, 65);
               ZKM_STR_B[9] = NLoginCore_110.C("խՂսԿտՁգբֆՆՇՊտքՑՒ՜ալ֔Պո֓֜ղՕղ֒՚ծտ֣֖֥՜ջ֨ոտշչ֞ը֥֩ը\u058bִք֫խ֥ղ֑վտ", (byte)114, 67);
               ZKM_STR_B[10] = NLoginCore_173.E("ր֞զզշ֣֖֣֗֙֨ւ֭ֈ֝վֳ֊֦ֆֳ֪ցւ", (byte)114, 69);
               ZKM_STR_B[11] = NLoginCore_141.D("ՀՒդկձՇո՚ռժՉՓ", (byte)114, 68);
               ZKM_STR_B[12] = NLoginCore_521.C("ԻդԸշմգՈՓ֍ևծՓ", (byte)114, 67);
               ZKM_STR_B[13] = NLoginCore_127.D("ՓենյցՖՊփ՝ր֏թրՎֈՅֆՎփֈց֗՞՟", (byte)114, 68);
               ZKM_STR_B[14] = NLoginCore_201.C("\u0557ՔոՠՐՙֆ՜՚Ճչ՟\u0590խ՜աօՑ\u058bլխա՞՟", (byte)114, 67);
               ZKM_STR_B[15] = NLoginCore_559.C("բֆ՝զպմյ՜ւդէլՆցէգֈ֕լօՎՙպժ֒՛ֆժ֒՝֣֠", (byte)114, 67);
               ZKM_STR_B[16] = NLoginCore_201.D("ղօՎՃաֈֈֈ\u0557գֈ՛հվետէգևՒ֊գեգսմմվֈկ֣՛", (byte)114, 68);
               ZKM_STR_B[17] = NLoginCore_553.D("բֆ՝զպմյ՜ւդթտՂւՌժ\u058cծ֕յ\u058cալ\u0557Օ\u0590Ֆ֜\u058cխիփփդ֤ֆբ֕֜ս֣ժզո֩ւկֲփծ\u058b֣փ֑վտ", (byte)114, 68);
               ZKM_STR_B[18] = NLoginCore_091.C("լՖՆԽվմբշգցթ։ևօՌ֊ձթրՓՒ֖\u0590ՔՖիՐ\u058c\u058b\u0590ձբ", (byte)114, 67);
               ZKM_STR_B[19] = NLoginCore_427.E("֑ֈփ֗իմ\u058c֢֛֣֯֫ս֢֖֠փ֥֓ֆֱֹ֪֮ձֿչְվֹֺ֔", (byte)114, 69);
               ZKM_STR_B[20] = NLoginCore_138.E("֔֔ջ֞ֈր֎չ֊֜վև֬ևօ֏խִֶ֑֏֪ցւ", (byte)114, 69);
               ZKM_STR_B[21] = NLoginCore_141.F("օքպյ֛֗ֆ֧ժ֘֬֎ցִ֦տִ֨\u0590ֹ֯\u058c։ֹ֎ֶ֑֪֑֥֩֒տֵֹֺֿ֢֨׀ֻ֘\u05ceֱׇֿ֥֞֔׆ד\u05c8֥ך֢֡", (byte)114, 70);
               ZKM_STR_B[22] = NLoginCore_232.E("֏չթՠ֡֗օ֚ֆ֤\u058c֪֬֨կ֭֔\u058c֣նյְֶּ֞֒֗׀յ׀օւ", (byte)114, 69);
               ZKM_STR_B[23] = NLoginCore_324.A("ƔǍǎǎƴǌƠǖǙǒǀǡǞƺƣǉƬǡǛƸǏǨưǐƦǉǟƩǅǎǪǍǔǫƶƽǗǹƼƾǵȁǓǄǠǆǩǤǅǮǨǣȄǿǖǗ", (byte)114, 65);
               ZKM_STR_B[24] = NLoginCore_141.E("վջ֤֠֔ֈֈւա֬ք֠֨֍ցֲֲֳֵ֬քֺ֦ևֳ֭֩չ֍ւջ֤", (byte)114, 69);
               ZKM_STR_B[25] = NLoginCore_127.D("կ\u0557կքվն։ւոՕՀհցփրՍռւզՍժ։֒֕պ֑\u058c֜ս֊պ֎Ֆճ֦վ֖֣֔վչ֧֚֩ը֪ը֟ծֳֵ֪֧֯վտ", (byte)114, 68);
               ZKM_STR_B[26] = NLoginCore_138.A("ǐƚƳǕǋǒǘƷǍǥǟǂǑǕǨƨǅǎǊƿǬǡƤǅǊƫǮǰǂƹǯǨ", (byte)114, 65);
               ZKM_STR_B[27] = NLoginCore_110.C("ոՂ՛սճպր՟յ֍ֆըլ՜դՍՑտֆՖ֖֗՞՟", (byte)114, 67);
               ZKM_STR_B[28] = NLoginCore_201.F("ձվբրև֊֊ֈ֗կ֬֝֒֡կ֓ց֎ք֗\u058c֔ցւ", (byte)114, 70);
               ZKM_STR_B[29] = NLoginCore_453.D("Վ՛Կ՝դէէեմՌ\u058bե֎\u058b՚վ֒Րլֆփձ՞՟", (byte)114, 68);
               ZKM_STR_B[30] = NLoginCore_453.E(
                  "րդգէէ։պ֢֬ռխ֜ղֳֶ\u058cղևևֲֵֻ֦ս\u0590ֹճֶׁ֤֑֤֭\u0590֝օ֧֬\u058bֽ\u05ca֭גֽבִׂ֥֔׃זׄכׅ֓בםֹ֮ז\u05cfֻס֡\u05cfֲ֦ש\u05c8צ\u05ee׆֩־־ץלּ\u05f6צ֮\u05f6ה\u05ecט׳חרָױֺװ\u05cdחך؆",
                  (byte)114,
                  69
               );
               ZKM_STR_B[31] = NLoginCore_521.B("ǄƮƞƕǖǌƺǏƻǙǁưƧƿǛƦǆƬǞƽǥƽǭǴǑƵǳƮǥƹǬǗ", (byte)114, 66);
               ZKM_STR_B[32] = NLoginCore_471.F("֑ֈփ֗իմ\u058c֢֛֯֫ւ֪ւօ֒ղ֚֯փֵּ֛֛ջֻ֚֙֝֓վֹ", (byte)114, 70);
               ZKM_STR_B[33] = NLoginCore_141.A("ǗƙƝǐƬƟǋƠǑưưƳǅǃƠƣƻǠǆǡƯƹƶƷ", (byte)114, 65);
               ZKM_STR_B[34] = NLoginCore_232.E("ւմ֛՜։֬՟ւօ֯ջհ֣֒֡֫֊\u058c֖հօծֱ֧֗\u058cְֲֲֵֹֽֿ֥֣֙֟֞֨օׇ֛֑׀֏\u05cb֟זזז\u05ca֢֤֢֕֡", (byte)114, 69);
               ZKM_STR_B[35] = NLoginCore_110.E("ոև֚ցփբոցզ֬օֆտև֧֥֔օևָ֗քցւ", (byte)114, 69);
               ZKM_STR_B[36] = NLoginCore_559.D("ծեՠմՈՑթ\u058cտոֈՇՇ։գճՔհկձգ֍մ֕և֞՛մՖՓճ֟", (byte)114, 68);
               ZKM_STR_B[37] = NLoginCore_110.B("ƥǞƼƵƝƸǑƱƚǠƳǛǑƿƿƶǈǁǍǰƾǯƶƷ", (byte)114, 66);
               ZKM_STR_B[38] = NLoginCore_575.F("\u0590օք֙ճփ֗ոտհչ֭֩\u058cְփ֤ժֹ֫փ֍ְִֺ֑֮ր֡ւռִֽ֥\u05caִׇ֝֙ֈֿ֖֯֙", (byte)114, 70);
               ZKM_STR_B[39] = NLoginCore_521.F("ոև֚ցփբոցզ֬ֈֳ֒ւ֎֫֏քֺ֛֪֕ցւ", (byte)114, 70);
               ZKM_STR_B[40] = NLoginCore_530.E("֑ֈփ֗իմ\u058c֢֛֮֯֏ւ֥֢֠֩ֆկւ֑֦֙֜յ֠ջִׁ֮֯֗", (byte)114, 69);
               ZKM_STR_B[41] = NLoginCore_433.F("օչշ֫֕եի֯չֆհթխմք֒ղմ֫֘ձ֪ցւ", (byte)114, 70);
               ZKM_STR_B[42] = NLoginCore_575.A("ǅƺƹǎƨƸǌƭƴƥƮǞǢǁǥƸǙƟǠǮƸǂǣǩǆǯǥƵǖƷƱǲƺǪǪǕƺǢǝǤǑǹǰǋ", (byte)114, 65);
               ZKM_STR_B[43] = NLoginCore_521.C("չՀՎպճ։՟Յ\u0557ից՜֏հ֒՞ՌզՒժի֗՞՟", (byte)114, 67);
               ZKM_STR_B[44] = NLoginCore_559.E("րսդէշըժ֪էխֱ֧֥֝֯յ֢֕քն\u058cֺցւ", (byte)114, 69);
               ZKM_STR_B[45] = NLoginCore_530.F(
                  "հշքչ֕տյլ\u058c֍ծ\u058cֳռֵ֝ք֏ց֦֬պֹֹ֦֨֗֒֫֒ցֽֽ֜֨քַ׆\u05c8ׁ\u05cb֎֥\u05c9\u058b׀ֲ֧֩\u05c9ֹֹֻ֛ם֜֞ןִן֚חּג\u05cfֲֺ֤ח֤יּּֽבֶ", (byte)114, 70
               );
               ZKM_STR_B[46] = NLoginCore_559.E("ս֔աէ֕ր֊֭կ։հն", (byte)114, 69);
               ZKM_STR_B[47] = NLoginCore_076.F("֦ս֣֥֦֕֜\u058c֦\u058cըն", (byte)114, 70);
               ZKM_STR_B[48] = NLoginCore_521.A("ƲǛƵƴƭƚƴƞƴƺǃƦǗƵǒƵƾǄǝơǑǢǞƭƦǱǅǗǈǆǌƷǻǚƵǊǵƸǟǣǚǻǺǯȄȇǂǼǦȂǗǅȉǐȄǼǼȋȒȍǣȃǳǍȚȈȎȀȔȊǠȡȣȁǾǫ", (byte)114, 65);
               ZKM_STR_B[49] = NLoginCore_387.A("ƻǇǗƟǔƛǚƵǜǍƣƱƚǟǕǋǜǮƮơǑǌǁǋǄǶƴǍưƴƱƴǜƺǉƽǾǝǖǬǃǒȂȀǔǥǀǞǤǠǥǆȏǲǐȒǿȋǩǲǏǑǗǭȔǫǱǮǵȓțȝȅȢǵǱǤȆȉȊǾȮȌǹȉȉǶǷ", (byte)114, 65);
               ZKM_STR_B[50] = NLoginCore_446.F(
                  "ս֦րտոետթտօ֎ձ֢ր֝ր։֏֨լ֭֜֩ոձּ\u0590֢֑֓֗ւ׆֥ր֕׀փ֪֥֮׆ֺׅ\u05cfג֍ֱׇ\u05cd֢\u0590ה֛\u05cfׇׇזםט֮\u05ce־֘\u05c8עללֹֻ֦ףֶ֩֬֬", (byte)114, 70
               );
               ZKM_STR_B[51] = NLoginCore_076.A(
                  "ǋƫƦƟǕǖƲƯƿǖƷƸƥƶƶǥǗǄǘǨǥƫƾǅǲǊƵǨǩƹǚǄǔǭǽƿǒǔǘǮȄǲǂǑǳǟȁǪǅǠȏȆǂǺȊǴǝǇȈȄǵǹǰȜǮȑǛǹȒȌȋǵȕǝǦșȕȆǦǡȆȦȤȎȡǯȟǮȇȇǳȸȯȔȉȎȩȷȆǶȸȴȹȀȵɁȁȡȴȗȥɌɍȸȞɍɉȿȖȗ", (byte)114, 65
               );
               ZKM_STR_B[52] = NLoginCore_471.D("պ՛Հ՚ՙֈ՟փՉզվև֏։\u058bրՆֈֆզյա՞՟", (byte)114, 68);
               ZKM_STR_B[53] = NLoginCore_173.A("ưǇǞƩƸƶƟǑƾƸǂǡǘƽƸǣǋǃƿǐƭǉƶƷ", (byte)114, 65);
               ZKM_STR_B[54] = NLoginCore_076.E("֥֦֡եռ։նְ֢֭֘օ֤սַ֥֤֖֖֥֜֔սֆׂ֪֑֝տ\u058c֑֓քֳ׃ׅս֚\u05cbּ֡֝\u058c֖", (byte)114, 69);
               ZKM_STR_B[55] = NLoginCore_433.B("ƘƷƶƮǝǏƮƼƳǑǧƸǒƨǟƫǖǥǞǠǚƧǀǬǔǫǎǫƸƸǓƻ", (byte)114, 66);
               ZKM_STR_B[56] = NLoginCore_433.C("ՖկչՃ՛շղֈՃվ\u058cս֍Ո֒Փֈ֑՞֗կ֑֚֘խըՔ֖ՙ֏֡֓ն֕֕ճձ֝֟֊փդ֤ճ", (byte)114, 67);
               ZKM_STR_B[57] = NLoginCore_201.D("՟Ճ՚դհֆՕՖքըՎՠըՍ՞ազճձ֑խցծ\u0590Ֆռ\u058b֒Ւ\u0590վ֤֓֞֝֔ևբն֩ժոէ\u0590֯րս֜րճ֗֫ն\u058bձְռֳֶָ֦־׃ַպִֿ֦֗օ֨փּׄօ֓", (byte)114, 68);
               ZKM_STR_B[58] = NLoginCore_575.D("՞կբ՛Մփև՟ջչռՓ", (byte)114, 68);
               ZKM_STR_B[59] = NLoginCore_397.F("պէֈ֝բ֫ք\u058b֨հթձ֜տְ֝ղ֯շ֤֬պ֧֛֙չֱׁջַցֻ֛֥֢֙փָֺ֮֨\u05cb\u05cbֿ֢֥֬֟֍ֵ֣֕\u05cfך֢֡", (byte)114, 70);
               ZKM_STR_B[60] = NLoginCore_384.C("Լյնն՜մՈվցպը։ֆբՋձՔ։փՠշ֓չզ֒ե֜֙֕ոջվ֔ռմո֣ռթ֨բթְְ֦֘֎ժ\u0590֖ևնքցվտ", (byte)114, 67);
               ZKM_STR_B[61] = NLoginCore_471.A("ǗƖǘƙǜƮƴǡƠǠǙǔǓǣƽǡǚǮƶǐǃǯƶƷ", (byte)114, 65);
               ZKM_STR_B[62] = NLoginCore_575.F(
                  "չֆր֜֨յօ֪֟֘փ֒ֆսִլթ֪֑֯պֲ֩֨֫֩֘֫֓նշ֠\u0590ֹ֜ցׁ\u05ccַ׆\u05ca֥׃֡֜֎֭֮֡\u05c8יב֔טֵַֺֺ֜יכנאְַט֟ןן\u05c9׆פט֨ף׳דרהֲ֨\u05f5וב\u05f8\u05faׁׂ",
                  (byte)114,
                  70
               );
               ZKM_STR_B[63] = NLoginCore_446.C("\u0557ՄեպԿֈաըօՍՆՎչ՜պ֍Տ\u058cՔ։ց\u0557քոնՖ֎֞\u0558֔՞ո՛կջ֓ֆւճւթ֥եճ", (byte)114, 67);
               ZKM_STR_B[64] = NLoginCore_453.D("ծեՠմՈՑթ\u058cտո\u058bշեդզսցհմեյծՔ\u0590ռՕյ֘\u0558՟\u0590լ", (byte)114, 68);
               ZKM_STR_B[65] = NLoginCore_091.B("ƜǖƼǋǑƳǕƝƳǠǛǡǝƤƴǝǜƨƪǟǀƹƶƷ", (byte)114, 66);
               ZKM_STR_B[66] = NLoginCore_076.B("ƮƻƵǑǝƪƺǟǔǍƸǇƻƲǩơƞǟǤǆƯǏǎǀǫǕǷǱǒǙƱƳǹǉǐǸǐǟǔǷǶǰǳǘǐǦǉǸǕǶǽȇǿǦǼǦȏǦǓǩǶȈȇǭ", (byte)114, 66);
               ZKM_STR_B[67] = NLoginCore_446.F(
                  "պ\u0590ը֫չ֤֘֝սց։ִ֚ժִ֊ֵ֤֢շִֽ֝֗ջִ\u058cմֲֿ֝֗ֆֽ֣֥֚֫փׁׄ֜֞\u05ceאֱׄ֏דחֲךזט׆\u05c8מְַָֹ\u05cfמנֳ֠ׄםדׇֹ֧֨צ֧׃פֿ֪ר׃\u05f6ב\u05c9ֶׯר\u05ca\u05f6\u05ecױ\u05f8׀יפנא\u05f6؊ה\u05eb\u05fc\u05cb\u05cd\u0605؈\u0603ז",
                  (byte)114,
                  70
               );
               ZKM_STR_B[68] = NLoginCore_530.C("տվչպ՝սՃՕ\u0557ՍռՓ", (byte)114, 67);
               ZKM_STR_B[69] = NLoginCore_141.D(
                  "\u0557խՅֈՖցյպ՚՞զշ֑Շ֑էց֒տՔ֑պմ֚\u0558֑թՑպ֜մ֏գ֚րֈւշՠ֡չ֞պ֪֝֒փ\u0590ծտճծֺ֮֡֊֘ևֽ֑֖֞֙պռֲֳ֖׆׆\u05cb\u058b֬׀ּ֭֯։֡בֵ֍֒֯י֣ה\u05cdֲ֫ךֱֹ֯֞֠עזכ֥נלֶֺׅ\u05cdֳ֭",
                  (byte)114,
                  68
               );
               ZKM_STR_B[70] = NLoginCore_183.D("փջղՅնՀեչ\u058b՝ոՓ", (byte)114, 68);
               ZKM_STR_B[71] = NLoginCore_384.E("օ֩ր։֝֗֘տ֥և։֓ղֆ֩վ֥֩չ֕֎֝֞־֓֩֜֍ֽֿ\u0590֙ր֓׃ֲ֦֔օ֢־ׅ֜ׄה\u05ccׂ֒֍\u05cd\u05cdֹֽ֦֭֫ךׂ֙וֶ֝נ\u05cf", (byte)114, 69);
               ZKM_STR_B[72] = NLoginCore_076.B("ƦƽƷǝƛƯƞǠƛǕƞǤƟǂƨǉǋƶǈƫƹǯƶƷ", (byte)114, 66);
               ZKM_STR_B[73] = NLoginCore_530.E("տ֕չդբ֡֍փ֍֭հն", (byte)114, 69);
               ZKM_STR_B[74] = NLoginCore_427.B("ƦƺǐǉǋƶǚǒƛƝǐƙǜƩǥǢƻǬǈǬƹǌǦǭǞǤǒǩǃǲǃǜǦǭǘƾǾǸȁȁȃǝǸǋ", (byte)114, 66);
               ZKM_STR_B[75] = NLoginCore_092.F("՟֢ռտէեո֣֣֘֍ն", (byte)114, 70);
               ZKM_STR_B[76] = NLoginCore_138.A("ƯǅƝǠƮǙǍǒƲƶƾǐǄƻƳǓǉǥƫǧǊǧǠƼǩǬƱǪǕǘǉƺƴǌǲǳǶǴǑǰǱƻǡȂǳȈǗǾȍǿǨǢȈǈǌǱǆȄǡǱǎǨȆǯȕȏȗǛǫȖȓȏǭǴǦǺǢȩȫȨǸȆȧȜǬȯǶǷ", (byte)114, 65);
               ZKM_STR_B[77] = NLoginCore_183.C("մՖՀՀճոՠզէցՍՓ", (byte)114, 67);
               ZKM_STR_B[78] = NLoginCore_201.C(
                  "\u0557խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՋ֏֕\u058cէսռ֟չն֛մ՟֙ն֖բ֣֪նէ֯խփ\u058bֈռ֒ձֶնկչֱ֖ղ\u0590֮֩֎֍֗\u058cּ֕\u0590ִֶֻ֔֞ֈַׂׅ֣֧֧֤֮֮ׄ֡֞וׅדאְ֕־זּ֣֞֫ך׃ֽףֳַ֥\u05ed־׆\u05cc\u05c8ֺ֫צׁשצ\u05f6\u05ecב־ֿ",
                  (byte)114,
                  67
               );
               ZKM_STR_B[79] = NLoginCore_091.B("ǒǕǚǚƲƸƯǝƟǤǔƫ", (byte)114, 66);
               ZKM_STR_B[80] = NLoginCore_427.B("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƣǧǭǤƿǕǔǷǑǎǳǌƷǱǎǮƺǻȂǎƿȇǅǛǣǠǔǪǉȎǎǇǊȇȀȇȀǦǫȄȋǚǒǚȜțǛǱǬȞȚǰǱǿȦǢǳǹǫȅǾȜȐȢȪȨǲǲȶȦȱȵȳȐǲȊȆȦǱȨȐȟɁɃȚȢȋ", (byte)114, 66);
               ZKM_STR_B[81] = NLoginCore_521.B("ǝǔǗƪƸƲǕƭǎƗƺƫ", (byte)114, 66);
               ZKM_STR_B[82] = NLoginCore_433.D(
                  "\u0557խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֢֨վֈ֝տ\u058b\u0590ְշֲ֪\u058cջճև֊\u058bֵսַַ֣ׅ֥֒քտ֜׃֨\u058c\u05c9֗֫ב֏ׁ֢֤\u05cbְֱׂ֞֟",
                  (byte)114,
                  68
               );
               ZKM_STR_B[83] = NLoginCore_324.C("Հ՟ճՙՑտ՟օ՚ծՅՓ", (byte)114, 67);
               ZKM_STR_B[84] = NLoginCore_183.C(
                  "\u0557խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֡֗չ֍ի֫ց֎մ֥յքֳչ֊֏֊ְֿ֕֬֙֏֍׀ָ֓֞\u05cbֿ\u058c֦֫֜֜֟בׂׂ\u05cb֬֯\u05ce֪֙\u05ca\u05ccֱַֹֺּ֖֛֢֝֠ףעידּֿ\u05ce\u05ecֳ",
                  (byte)114,
                  67
               );
               ZKM_STR_B[85] = NLoginCore_110.D("ՠ՟Խ՞Օյւ՛աֈքՓ", (byte)114, 68);
               ZKM_STR_B[86] = NLoginCore_004.E(
                  "պ\u0590ը֫չ֤֘֝սց\u058cհւզ֥\u058cֲ֘օֈխմ\u058cհְַֺֽׂ֥֚֚֫վ\u05c8־ֵֶׁ֥֦֜׆։։ׅׄ\u05cc֍֑אׇ֧֪֙\u0590֯\u05caֶֹֽ֙֯֝ףִֹ֣֡֫׀ק֪֯נּר\u05ceרשְׄך\u05caִ\u05c8\u05cdשב\u05ff\u05ce\u05ed\u0601ׄמֽ\u05feש\u0604؈הנ\u05fe\u05eb،ל\u05edז",
                  (byte)114,
                  69
               );
               ZKM_STR_B[87] = NLoginCore_453.B("ǇǜưǙƞƛǀƹǑǂǤƫ", (byte)114, 66);
               ZKM_STR_B[88] = NLoginCore_004.E(
                  "պ\u0590ը֫չ֤֘֝սց\u058cհւզ֥\u058cֲ֘օֈխնָպְ\u058c־ּ֡־րռ֚֡֗֡֗֞֡֕\u05cc֏ֲׅ־֪֮֯\u05cf֔֗׃ֹ֤׆ֺֽ\u05caע֚אל֟חי׀ֺסנ֧֧֬׀\u05c8\u05ccב׀שׇף֭זדצץׯֳ\u05c8\u05fc׳ן\u0600ױֿ־׃חרד\u05caזנ؍\u05ee؋מ\u05ca؏؈ןפמחؔؗץؚؗסע",
                  (byte)114,
                  69
               );
               ZKM_STR_B[89] = NLoginCore_141.A("ƤƾǍƭƸǎƳǋǜǝƝƫ", (byte)114, 65);
               ZKM_STR_B[90] = NLoginCore_183.C(
                  "\u0557խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՓ֕\u0557֍թ֛֙վ֛՝ՙվմվմջվղշ֩լ֢֏֛\u058b\u058cև֬ձմ֖֠֊քյ֍ֳּ֬֔֝֠֞\u0590֢׃ַֽ֚֟֩\u05cd֬\u05cf֤֯փ֩׃ֽ֢֣֮֒֙\u05ccךֺֻ֪֭כהא\u05ccטֱַ׀ֱׅ\u05c8ׅ֩\u05ebֳ֥",
                  (byte)114,
                  67
               );
               ZKM_STR_B[91] = NLoginCore_127.E("դ֛֝ա֪շ֦֦֭֮օն", (byte)114, 69);
               ZKM_STR_B[92] = NLoginCore_553.C("բֆ՝զպմյ՜ւդզհՏգֆ՛ֆւՖղիո֏եո֒կ֒֒՟ծցչձ՞֟֗վըզ֢ւ֎֛ւ\u058bհծ֤լֶָ֧֔֗շևֶ֗֎ַ֒֯֒", (byte)114, 67);
               ZKM_STR_B[93] = NLoginCore_110.C("ՑՑՆաԿՉՇըաևֈՓ", (byte)114, 67);
               ZKM_STR_B[94] = NLoginCore_427.E("֓փդղրւ֣֖֙ֈհն", (byte)114, 69);
               ZKM_STR_B[95] = NLoginCore_241.E("՟֤ջ֖տռէֆ֪֘֜֡֩֕֍֧֕֡\u058bղօֻ֗֯շ֏֢֯֏վ֖֡", (byte)114, 69);
               ZKM_STR_B[96] = NLoginCore_559.F("ն\u0590նս֖֧խռի։։ն", (byte)114, 70);
               ZKM_STR_B[97] = NLoginCore_387.B("ƻƨǞƙǈƪƪǝǠƠƣƣǣǦǫǡǫǣƺǯǈǄƭǇǀƯǊǎƸƹǯǸǈǏǞǇǏƺǍǚǳǟǖǆǿǵǵǼǾǇǙȂȄȎǐǬȆǑȒǡǸǑȏǳǽǘȉǙȟǶǡțȥǗǶǫ", (byte)114, 66);
               ZKM_STR_B[98] = NLoginCore_241.F(
                  "՝֑֨վ֟ցզ֝օջ֮֟իֈֱլյ֯\u058b֩։֝մָռջֽոֱׅ֟ւׂև֧׃\u05cc֔օ֣\u05cc֑֟\u05c8ֿ֨֨ו։\u05cf֑כ\u05c8ֹ\u05c8זוֱוטֽפםֱִסֿ֟ז׀ץ\u05edןכרש״\u05cfוֵהײק֬ץ֮ײלרװ\u05fc׀װ\u05f6פ\u05f6ײׁ\u05fdת\u0601׃\u05cc؏קׂסז",
                  (byte)114,
                  70
               );
               ZKM_STR_B[99] = NLoginCore_110.E("֜֙՛րէփ֤֮շ֏\u058b֎թ֣֦֪֚֨֔֓֩֔ցւ", (byte)114, 69);
               ZKM_STR_B[100] = NLoginCore_092.A("ƲƮƱƝƨǙƪƢƳǡǆǀƶƢơǓƣǌǛƼǑǚǥǦƴǅǧǢǅǳǵǗǱǲǵǩǻƷǶǴǗǙǢǋ", (byte)114, 65);
               ZKM_STR_B[101] = NLoginCore_553.D("ԺՐոԾՠոփֈյՊէ՜՜եգ֊հ֕իօբձ՞՟", (byte)114, 68);
               ZKM_STR_B[102] = NLoginCore_471.F("֨ք֦մըմշր֬ֆթկտխց֩կ֕ղ֣֒֕օ\u058cձֲ֪֔֯֒\u0590ւ֝ֈֳּ֧֩֠րֿ֡׀׆ֽ֎֒\u05c9֓ח\u05cfִ֑֧֢֡", (byte)114, 70);
               ZKM_STR_B[103] = NLoginCore_091.F("֥֦֡եռ։նְ֭֘֠ս֦֒ք֫\u058b֭֊ּ֕ճ֨նֲֻ֡\u058bְַֹׂ֚֡֙֟ֆ։ֵֹֹ\u058c\u058c֖", (byte)114, 70);
               ZKM_STR_B[104] = NLoginCore_427.A("ƷƩǔǀƾƗƾƚƻƥǢǠǁǜơǄǅǪǈǠǘǢǒǯǋǇǎǮǒǧǱǍ", (byte)114, 65);
               ZKM_STR_B[105] = NLoginCore_141.A("ǛǐƮƧƙǔƮƜǎǥǠƸǨǝǋǫƹǕǭǐǝǟƶƷ", (byte)114, 65);
               ZKM_STR_B[106] = NLoginCore_110.F("մե։նւժյ֖֛֣ձ֦֬ֆմ֥ք֢֣֔֙օָֺֿ֧֛֮֘ք֍֎", (byte)114, 70);
               ZKM_STR_B[107] = NLoginCore_453.C("ՓենյցՖՊփ՝ր֍ՠջդ\u058cՓւ֕բ՟ՠա՞՟", (byte)114, 67);
               ZKM_STR_B[108] = NLoginCore_092.A("ƶƨƲƴƚǝƔǁǄƣơƫ", (byte)114, 65);
               ZKM_STR_B[109] = NLoginCore_091.F("ղ֩֓զդ֧֙֠֘֜հն", (byte)114, 70);
               ZKM_STR_B[110] = NLoginCore_387.A("ǚǖǛƚƱƾƫǢǥǍǗƯǃǗǝǓǛǠǢǛǜǢƿƱƮƧǄǏƷǅǲǓǲǲƾǵǖǍǿǳȁǂǂǄȉǿǷǷǶƿǝǿǹǙǖǗ", (byte)114, 65);
               ZKM_STR_B[111] = NLoginCore_110.D("ՑջՕ՟ՓվՈՙդՙը՟\u0590ՉտօրՕգոչթ\u0557գյ՝։֑չ֙\u0590ոճղոյվ֣\u058b֢մ֧֥֩սֆքս\u0590ְձ֟կַվտ", (byte)114, 68);
               ZKM_STR_B[112] = NLoginCore_324.A("ǚǖǛƚƱƾƫǢǥǍǗƯǃǗǝǓǛǠǢǛǜǤǑƼǲǵǤǰǨǖǛǥǳƵƵǘǼǯǸǛƼȄǱǴǟǿǄȇȃǪǚȎǡǿǖǗ", (byte)114, 65);
               ZKM_STR_B[113] = NLoginCore_092.E("մ֞ուն֡իռևռ\u058bւֳլ֢֣֨ոֆ֛֜\u058cպֆ֘րֳִּ֛֖֛֬֜֕֘֡׆ׅ֮֗\u05ca\u05cd׆\u05cd֏֣֔֓֕\u058b׃ׇך֢֡", (byte)114, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_559.E("մա։֛ր֙գ֩ջ֭չֳ\u058cֲ֧֪֍ֹ֗֕ղֺցւ", (byte)114, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_004.F("բ֥ր֫ժ֪֝֩֠֨օ֦֥֨\u058cւ\u0590ձ֤֢֩֗֔֯־֬ց֚\u0590պ֍׆", (byte)114, 70);
         }
      }
   }

   private static void f(NLoginType_008 var0, boolean var1) {
      if (var0.L()) {
         NLoginCore_532.a(var0, var1);
         j = NLoginCore_140.a(var0x -> {
            Set var1x = Arrays.stream(NLoginCore_477.values()).filter(var0xx -> NLoginCore_477.b(var0xx)).collect(Collectors.toSet());
            var0x.f(oa);
            var0x.f(var1x.size());
            var1x.forEach(var1xx -> {
               Object var2 = var1xx.g();
               var0x.x(var1xx.h.a()[ob]);
               if (var2 instanceof String) {
                  var0x.e(oc);
                  var0x.x((String)var2);
               } else if (var2 instanceof Boolean) {
                  var0x.e(od);
                  var0x.h((Boolean)var2);
               } else if (var2 instanceof Integer) {
                  var0x.e(oe);
                  var0x.h((Integer)var2);
               } else if (var2 instanceof Collection) {
                  Collection var3 = (Collection)var2;
                  var0x.e(of);
                  var0x.h(var3.size());
                  var3.forEach(var0x::x);
               }
            });
         });
         cL = NLoginCore_342.d.b(j);
      }
   }

   private static void l(NLoginType_008 var0) {
      NLoginCore_477 var1 = NLoginCore_477.ac;
      int var2 = var1.r();
      if (var2 < ib) {
         a(var1, NLoginCore_477.a(var1));
         NLoginCore_370.c(a(ic, id ^ ie) + var2 + a(var_if, ig ^ ih));
      } else if (var2 > ij) {
         a(var1, NLoginCore_477.a(var1));
         NLoginCore_370.c(a(ik, il ^ im) + var2 + a(in, io));
      }

      NLoginCore_583 var10000 = var0.a();
      NLoginInterface_034[] var10001 = new NLoginInterface_034[iq];
      var10001[ir] = NLoginCore_379.a;
      var10001[is] = NLoginCore_379.b;
      if (!var10000.a(var10001)) {
         int var3 = a != NLoginCore_566.f && a != NLoginCore_566.g ? iu : it;
         NLoginCore_370.d(
            a(iv, iw ^ ix)
               + NLoginCore_379.b.A()
               + a(iy & iz, ja)
               + NLoginCore_379.a.A()
               + a(jb, jc ^ jd)
               + (var3 != 0 ? a(je, jf) : a(jg, jh ^ ji))
         );
         if (var3 != 0) {
            a = NLoginCore_566.f;
         }

         aO = (jk != 0);
      }
   }

   private static void i(NLoginType_008 var0) {
      NLoginCore_477 var1 = NLoginCore_477.c;
      String var2 = var1.a(new Object[bh]).toUpperCase(Locale.ENGLISH);

      try {
         j = NLoginCore_036.valueOf(var2);
      } catch (Throwable var6) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(bi, bj) + var2 + a(bk, bl ^ bm) : a(bn, bo ^ bp) + var2 + a(bq, br));
         j = NLoginCore_036.valueOf((String)var1.a());
      }

      if (j != NLoginCore_036.c && j != NLoginCore_036.d && j != NLoginCore_036.f) {
         NLoginCore_370.c(NLoginCore_150.j() ? a(bt, bu ^ bv) + var2 + a(bw, bx ^ by) : a(bz, ca ^ cb) + var2 + a(cc, cd ^ ce));
         j = NLoginCore_036.valueOf((String)var1.a());
      }

      NLoginCore_495 var3 = var0.a();

      try {
         if (var3 != null) {
            if (NLoginCore_323.a(var3.a(), NLoginCore_477.e.a(new Object[cg]), a(ch, ci))) {
               a(NLoginCore_477.l, a(cj, ck));
            }

            if (NLoginCore_323.a(var3.a(), NLoginCore_477.e.a(new Object[cl]), a(cm, cn ^ co))) {
               a(NLoginCore_477.m, a(cp, cq ^ cr));
            }
         }
      } catch (SQLException var5) {
         NLoginCore_370.c(a(cs, ct ^ cu), var5);
      }
   }

   private static void n(NLoginType_008 var0) {
      NLoginCore_477 var1 = NLoginCore_477.af;
      int var2 = var1.r();
      if (var2 < js) {
         a(var1, NLoginCore_477.a(var1));
         NLoginCore_370.c(a(jt, ju) + var2 + a(jv, jw ^ jx));
      } else if (var2 > jz) {
         a(var1, NLoginCore_477.a(var1));
         NLoginCore_370.c(a(ka, kb ^ kc) + var2 + a(kd, ke ^ kf));
      }

      NLoginCore_477 var3 = NLoginCore_477.ag;
      int var4 = var3.r();
      if (var4 % kh != 0) {
         a(var3, NLoginCore_477.a(var3));
         NLoginCore_370.c(a(ki, kj ^ kk) + var2 + a(kl, km ^ kn));
      } else if (var4 < kp) {
         a(var3, NLoginCore_477.a(var3));
         NLoginCore_370.c(a(kq, kr ^ ks) + var2 + a(kt, ku ^ kv));
      } else if (var4 > kx) {
         a(var3, NLoginCore_477.a(var3));
         NLoginCore_370.c(a(ky, kz) + var2 + a(la & lb, lc));
      }

      NLoginCore_477 var5 = NLoginCore_477.ah;
      int var6 = var5.r();
      if (var6 < le) {
         a(var5, NLoginCore_477.a(var5));
         NLoginCore_370.c(a(lf, lg) + var2 + a(lh & li, lj));
      } else if (var6 > ll) {
         a(var5, NLoginCore_477.a(var5));
         NLoginCore_370.c(a(lm, ln ^ lo) + var2 + a(lp, lq));
      }

      try {
         NLoginCore_583 var10000 = var0.a();
         NLoginInterface_034[] var10001 = new NLoginInterface_034[ls];
         var10001[lt] = NLoginCore_379.c;
         var10001[lu] = NLoginCore_379.d;
         if (!var10000.a(var10001)) {
            int var7 = a != NLoginCore_566.b && a != NLoginCore_566.c && a != NLoginCore_566.d ? lw : lv;
            NLoginCore_370.d(
               a(lx, ly ^ lz)
                  + NLoginCore_379.c.A()
                  + a(ma, mb ^ mc)
                  + NLoginCore_379.d.A()
                  + a(md, me ^ mf)
                  + (var7 != 0 ? a(mg, mh ^ mi) : a(mj, mk ^ ml))
            );
            if (var7 != 0) {
               a = NLoginCore_566.e;
            }
         } else {
            aN = (mn != 0);
         }
      } catch (Throwable var10) {
         boolean var8 = NLoginCore_370.aj();
         if (var8) {
            NLoginCore_370.c(a(mo, mp), var10);
         }

         int var9 = a != NLoginCore_566.b && a != NLoginCore_566.c && a != NLoginCore_566.d ? ms : mr;
         if (var9 != 0) {
            if (!var8) {
               NLoginCore_370.d(a(mt & mu, mv));
            }

            a = NLoginCore_566.e;
         }
      }
   }

   @Generated
   public static void a(NLoginCore_175 var0) {
      a = var0;
   }

   @Generated
   public static List<Pattern> k() {
      return r;
   }

   private static boolean a(String var0, NLoginCore_329 var1) {
      String var2 = var1.a(new Object[fq]);
      String var3 = var2.toLowerCase(Locale.ENGLISH);
      int var4 = fr;
      switch (var3.hashCode()) {
         case -980110702:
            if (var3.equals(a(fs, ft))) {
               var4 = fu;
            }
            break;
         case -891422895:
            if (var3.equals(a(fv, fw))) {
               var4 = fx;
            }
      }

      switch (var4) {
         case 0:
            return (fy != 0);
         case 1:
            return (fz != 0);
         default:
            NLoginCore_370.c(a(ga, gb ^ gc) + var0 + a(gd, ge ^ gf) + var2 + a(gg, gh));
            return (gj != 0);
      }
   }

   public static void c(NLoginType_008 var0, boolean var1) {
      String var2 = NLoginCore_477.b.a(new Object[x]);
      if (!var2.endsWith(a(y, z ^ aa))) {
         a(NLoginCore_477.b, var2 + a(ab, ac ^ ad));
      }

      NLoginCore_195.b(var0, var1);
   }

   private static void a(NLoginType_008 var0, boolean var1, boolean var2) {
      if (!var2) {
         var0.b().a(var0, var1);
         var0.a().a(var0, var1);
      }

      NLoginCore_308 var3 = var0.a();
      if (var3 != null) {
         var3.a(var0, var1);
      }
   }

   @Generated
   public static NLoginCore_566 b() {
      return a;
   }
}
