package com.nickuc.login;

import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

public class SpawnCommand extends NLoginCore_353 {
   private static long pl = Long.reverse(830487700238116301L);
   private static int lb = Integer.reverse(1241513984);
   private static int y = 0 >>> 122 | 0 << -122;
   private static long c;
   private static long kt = Long.reverse(4865712966362080717L);
   private static long r = Long.reverse(5188146770730811392L);
   private static int gb = Integer.reverse(1073741824);
   private static long o = Long.reverse(4865712966362080717L);
   private static int ko = 6291456 >>> 213 | 6291456 << ~213 + 1;
   private static long km = Long.reverse(830487700238116301L);
   private static long fj = Long.reverse(4865712966362080717L);
   private static long ge = Long.reverse(4865712966362080717L);
   private static int lm = Integer.reverse(-1);
   private static int fw = 0 >>> 173 | 0 << -173;
   private static int kw = 10368 >>> 39 | 10368 << -39;
   private static int mz = 201326592 >>> 58 | 201326592 << ~58 + 1;
   private static long fq = Long.reverse(830487700238116301L);
   private static int ci = Integer.reverse(0);
   private static int bn = 608 >>> 69 | 608 << -69;
   private static int hp = 0 >>> 154 | 0 << ~154 + 1;
   private static int bk = Integer.reverse(1207959552);
   private static long fz = Long.reverse(4865712966362080717L);
   private static long w = Long.reverse(830487700238116301L);
   private static int dc = '\ue800' >>> 'K' | 59392 << -75;
   private static long ny = Long.reverse(830487700238116301L);
   private static long eh = Long.reverse(5188146770730811392L);
   private static long mm = Long.reverse(5188146770730811392L);
   private static long aw = Long.reverse(5188146770730811392L);
   private static long hd = Long.reverse(830487700238116301L);
   private static int ar = Integer.reverse(805306368);
   private static int cl = Integer.reverse(1476395008);
   private static long hv = Long.reverse(5188146770730811392L);
   private static int dr = (-2013265920 >>> 90 | -2013265920 << -90) & -1;
   private static long fg = Long.reverse(830487700238116301L);
   private static long gj = Long.reverse(4865712966362080717L);
   private static long mx = Long.reverse(830487700238116301L);
   private static int gp = (939524096 >>> 27 | 939524096 << -27) & -1;
   private static long he = Long.reverse(5188146770730811392L);
   private static long ay = Long.reverse(830487700238116301L);
   private static int iu = Integer.reverse(-1040187392);
   private static long kd = Long.reverse(830487700238116301L);
   private static int eu = (86016 >>> 107 | 86016 << ~107 + 1) & -1;
   private static int nc = Integer.reverse(1073741824);
   private static int gl = Integer.reverse(1610612736);
   private static long pi = Long.reverse(5188146770730811392L);
   private static int oz = Integer.reverse(1979711488);
   private static int ah = Integer.reverse(-1879048192);
   private static long ke = Long.reverse(5188146770730811392L);
   private static long jq = Long.reverse(5188146770730811392L);
   private static int au = Integer.reverse(-1342177280);
   private static int no = 0 >>> 17 | 0 << ~17 + 1;
   private static int kp = Integer.reverse(805306368);
   private static long ai = Long.reverse(830487700238116301L);
   private static int nr = Integer.reverse(637534208);
   private static int cf = 1600 >>> 102 | 1600 << ~102 + 1;
   private static long e = Long.reverse(5188146770730811392L);
   private static long al = Long.reverse(830487700238116301L);
   private static long u = Long.reverse(5188146770730811392L);
   private static int et = Integer.reverse(0);
   private static long jp = Long.reverse(830487700238116301L);
   private static int lq = Integer.reverse(-1);
   private static long hu = Long.reverse(830487700238116301L);
   private static int og = Integer.reverse(-1778384896);
   private static int cq = Integer.reverse(0);
   private static int z = Integer.reverse(1610612736);
   private static long fl = Long.reverse(4865712966362080717L);
   private static long im = Long.reverse(830487700238116301L);
   private static int ac = Integer.reverse(-536870912);
   private static String[] a = new String[SpawnCommand.ov];
   private static long jc = Long.reverse(830487700238116301L);
   private static int dx = 0 >>> 144 | 0 << -144;
   private static int ox = Integer.reverse(536870912);
   private static int ic = Integer.reverse(-67108864);
   private static int ht = (124928 >>> 203 | 124928 << -203) & -1;
   private static int mk = ('렀' >>> ')' | 47104 << ~41 + 1) & -1;
   private static int cp = 16 >>> 98 | 16 << ~98 + 1;
   private static int by = Integer.reverse(-402653184);
   private static long is = Long.reverse(5188146770730811392L);
   private static long kx = Long.reverse(4865712966362080717L);
   private static long fo = Long.reverse(5188146770730811392L);
   private static int jm = Integer.reverse(301989888);
   private static int hx = -1 >>> 92 | -1 << ~92 + 1;
   private static int bu = Integer.reverse(-1476395008);
   private static int p = Integer.reverse(-1073741824);
   private static int kb = (0 >>> 193 | 0 << ~193 + 1) & -1;
   private static int ey = -1 >>> 76 | -1 << -76;
   private static long av = Long.reverse(830487700238116301L);
   private static long nt = Long.reverse(5188146770730811392L);
   private static int fx = (-2147483636 >>> 190 | -2147483636 << -190) & -1;
   private static long bp = Long.reverse(5188146770730811392L);
   private static long as = Long.reverse(830487700238116301L);
   private static int nn = Integer.reverse(Integer.MIN_VALUE);
   private static long jx = Long.reverse(5188146770730811392L);
   private static long ot = Long.reverse(830487700238116301L);
   private static int iq = Integer.reverse(1107296256);
   private static int mq = (-2147483625 >>> 158 | -2147483625 << -158) & -1;
   private static long oh = Long.reverse(4865712966362080717L);
   private static long bj = Long.reverse(5188146770730811392L);
   private static long dt = Long.reverse(4865712966362080717L);
   private static long lh = Long.reverse(4865712966362080717L);
   private static long lj = Long.reverse(4865712966362080717L);
   private static int ip = 384 >>> 166 | 384 << ~166 + 1;
   private static long dw = Long.reverse(5188146770730811392L);
   private static int fs = (262144 >>> 210 | 262144 << -210) & -1;
   private static int ma = -1 >>> 165 | -1 << -165;
   private static int oe = (-1 >>> 132 | -1 << -132) & -1;
   private static long fd = Long.reverse(4865712966362080717L);
   private static long cs = Long.reverse(830487700238116301L);
   private static long at = Long.reverse(5188146770730811392L);
   private static long ez = Long.reverse(4865712966362080717L);
   private static long bx = Long.reverse(4865712966362080717L);
   private static long gv = Long.reverse(4865712966362080717L);
   private static int na = Integer.reverse(0);
   private static long ph = Long.reverse(830487700238116301L);
   private static int cj = Integer.reverse(Integer.MIN_VALUE);
   private static int ky = 393216 >>> 209 | 393216 << -209;
   private static long jz = Long.reverse(830487700238116301L);
   private static int cz = Integer.reverse(-1073741824);
   private static int ly = (18432 >>> 75 | 18432 << ~75 + 1) & -1;
   private static int oo = Integer.reverse(0);
   private static int nf = 776 >>> 131 | 776 << -131;
   private static int var_if = (8192 >>> 108 | 8192 << ~108 + 1) & -1;
   private static long oc = Long.reverse(5188146770730811392L);
   private static int j = (0 >>> 173 | 0 << -173) & -1;
   private static int hi = (536870912 >>> 93 | 536870912 << ~93 + 1) & -1;
   private static int gm = 53 >>> 32 | 53 << ~32 + 1;
   private static int fm = Integer.reverse(201326592);
   private static int mw = 25165824 >>> 50 | 25165824 << ~50 + 1;
   private static long hh = Long.reverse(4865712966362080717L);
   private static int hn = (-1 >>> 233 | -1 << -233) & -1;
   private static long t = Long.reverse(830487700238116301L);
   private static int hz = Integer.reverse(-1073741824);
   private static int jl = 0 >>> 195 | 0 << -195;
   private static int hf = 118784 >>> 75 | 118784 << -75;
   private static long aq = Long.reverse(4865712966362080717L);
   private static long bv = Long.reverse(4865712966362080717L);
   private static int md = (-1 >>> 77 | -1 << ~77 + 1) & -1;
   private static int oq = Integer.reverse(-1);
   private static long gn = Long.reverse(830487700238116301L);
   private static int cb = Integer.reverse(402653184);
   private static int je = Integer.reverse(-1879048192);
   private static long bs = Long.reverse(5188146770730811392L);
   private static int ia = Integer.reverse(1342177280);
   private static long ld = Long.reverse(5188146770730811392L);
   private static long ev = Long.reverse(4865712966362080717L);
   private static long kn = Long.reverse(5188146770730811392L);
   private static int fp = Integer.reverse(-1946157056);
   private static long jk = Long.reverse(5188146770730811392L);
   private static long mp = Long.reverse(4865712966362080717L);
   private static int ne = 0 >>> 241 | 0 << -241;
   private static String[] b = new String[SpawnCommand.ow];
   private static long mi = Long.reverse(5188146770730811392L);
   private static int du = (143360 >>> 140 | 143360 << -140) & -1;
   private static int ap = -1 >>> 172 | -1 << -172;
   private static int ce = (0 >>> 140 | 0 << -140) & -1;
   private static long cc = Long.reverse(830487700238116301L);
   private static long dd = Long.reverse(830487700238116301L);
   private static int gt = Integer.reverse(-335544320);
   private static int pg = Integer.reverse(234881024);
   private static int oj = Integer.reverse(-1);
   private static long id = Long.reverse(4865712966362080717L);
   private static int jo = '鈀' >>> 201 | 37376 << ~201 + 1;
   private static int nb = 4096 >>> 12 | 4096 << -12;
   private static int eo = 0 >>> 152 | 0 << -152;
   private static int ji = Integer.reverse(-503316480);
   private static long nq = Long.reverse(4865712966362080717L);
   private static int oy = Integer.reverse(0);
   private static long ct = Long.reverse(5188146770730811392L);
   private static float hr = Float.intBitsToFloat(Integer.reverse(514));
   private static int ol = -2147483595 >>> 191 | -2147483595 << -191;
   private static int ls = Integer.reverse(-369098752);
   private static long cd = Long.reverse(5188146770730811392L);
   private static long hy = Long.reverse(4865712966362080717L);
   private static int oi = (55574528 >>> 19 | 55574528 << -19) & -1;
   private static int gi = Integer.reverse(738197504);
   private static long ln = Long.reverse(4865712966362080717L);
   private static int il = Integer.reverse(-2113929216);
   private static long ca = Long.reverse(5188146770730811392L);
   private static long mb = Long.reverse(4865712966362080717L);
   private static long ob = Long.reverse(830487700238116301L);
   private static int v = Integer.reverse(-1610612736);
   private static int da = Integer.reverse(Integer.MIN_VALUE);
   private static int jr = 0 >>> 235 | 0 << ~235 + 1;
   private static int gc = (6684672 >>> 49 | 6684672 << -49) & -1;
   private static long en = Long.reverse(4865712966362080717L);
   private static long bz = Long.reverse(830487700238116301L);
   private static long me = Long.reverse(4865712966362080717L);
   private static int hc = Integer.reverse(-1677721600);
   private static int ad = Integer.reverse(-1);
   private static long nh = Long.reverse(5188146770730811392L);
   private static long jj = Long.reverse(830487700238116301L);
   private static long dv = Long.reverse(830487700238116301L);
   private static int nu = -2147483598 >>> 31 | -2147483598 << ~31 + 1;
   private static int ju = Integer.reverse(0);
   private static long bo = Long.reverse(830487700238116301L);
   private static int jy = Integer.reverse(-771751936);
   private static long in = Long.reverse(5188146770730811392L);
   private static int dz = 288 >>> 67 | 288 << -67;
   private static int be = Integer.reverse(134217728);
   private static long jh = Long.reverse(5188146770730811392L);
   private static int os = Integer.reverse(-1241513984);
   private static int kf = Integer.reverse(-1308622848);
   private static long jd = Long.reverse(5188146770730811392L);
   private static int mc = Integer.reverse(1509949440);
   private static int pf = Integer.reverse(1073741824);
   private static int ig = (256 >>> 162 | 256 << ~162 + 1) & -1;
   private static int nl = Integer.reverse(-1);
   private static long bm = Long.reverse(4865712966362080717L);
   private static long cg = Long.reverse(830487700238116301L);
   private static int ft = Integer.reverse(0);
   private static long my = Long.reverse(5188146770730811392L);
   private static int ha = (1073741826 >>> 30 | 1073741826 << -30) & -1;
   private static long bc = Long.reverse(4865712966362080717L);
   private static long jg = Long.reverse(830487700238116301L);
   private static long lw = Long.reverse(830487700238116301L);
   private static long eg = Long.reverse(830487700238116301L);
   private static int ix = Integer.reverse(570425344);
   private static int gf = 1572864 >>> 211 | 1572864 << ~211 + 1;
   private static int df = 120 >>> 66 | 120 << ~66 + 1;
   private static int pd = (909312 >>> 205 | 909312 << -205) & -1;
   private static int hj = Integer.reverse(0);
   private static int an = Integer.reverse(0);
   private static int cw = Integer.reverse(1073741824);
   private static int ao = (-2147483643 >>> 63 | -2147483643 << -63) & -1;
   private static long pa = Long.reverse(830487700238116301L);
   private static int ex = Integer.reverse(-738197504);
   private static int mo = Integer.reverse(-1);
   private static long lt = Long.reverse(4865712966362080717L);
   private static long iz = Long.reverse(5188146770730811392L);
   private static int fv = 327680 >>> 239 | 327680 << -239;
   private static int hk = Integer.reverse(-603979776);
   private static long gr = Long.reverse(830487700238116301L);
   private static long ns = Long.reverse(830487700238116301L);
   private static int ax = Integer.reverse(1879048192);
   private static int kr = Integer.reverse(167772160);
   private static long gy = Long.reverse(830487700238116301L);
   private static int eq = Integer.reverse(-1811939328);
   private static int ik = Integer.reverse(536870912);
   private static int ni = Integer.reverse(Integer.MIN_VALUE);
   private static long aj = Long.reverse(5188146770730811392L);
   private static long jn = Long.reverse(4865712966362080717L);
   private static int fy = Integer.reverse(-1);
   private static int mv = Integer.reverse(0);
   private static long dg = Long.reverse(830487700238116301L);
   private static long eb = Long.reverse(5188146770730811392L);
   private static long lx = Long.reverse(5188146770730811392L);
   private static long iy = Long.reverse(830487700238116301L);
   private static long kg = Long.reverse(830487700238116301L);
   private static int nd = (64 >>> 134 | 64 << -134) & -1;
   private static int op = 1811939328 >>> 248 | 1811939328 << -248;
   private static int ms = 194560 >>> 171 | 194560 << ~171 + 1;
   private static int dj = Integer.reverse(-1);
   private static long mu = Long.reverse(5188146770730811392L);
   private static long az = Long.reverse(5188146770730811392L);
   private static int jb = Integer.reverse(-1577058304);
   private static int gd = Integer.reverse(-1);
   private static int s = Integer.reverse(536870912);
   private static int mn = 1523712 >>> 110 | 1523712 << ~110 + 1;
   private static long g = Long.reverse(4865712966362080717L);
   private static long ae = Long.reverse(4865712966362080717L);
   private static int ku = (1024 >>> 138 | 1024 << -138) & -1;
   private static long ej = Long.reverse(830487700238116301L);
   private static int c = Integer.reverse(0);
   private static int ck = (262144 >>> 209 | 262144 << ~209 + 1) & -1;
   private static int ks = (-1 >>> 54 | -1 << ~54 + 1) & -1;
   private static int di = Integer.reverse(-134217728);
   private static int var_do = Integer.reverse(-2080374784);
   private static long nw = Long.reverse(5188146770730811392L);
   private static long mh = Long.reverse(830487700238116301L);
   private static long dh = Long.reverse(5188146770730811392L);
   private static long om = Long.reverse(830487700238116301L);
   private static long dp = Long.reverse(830487700238116301L);
   private static int lu = Integer.reverse(268435456);
   private static long fn = Long.reverse(830487700238116301L);
   private static int ll = 10880 >>> 39 | 10880 << -39;
   private static int jf = (805306370 >>> 27 | 805306370 << -27) & -1;
   private static long dq = Long.reverse(5188146770730811392L);
   private static int it = Integer.reverse(-536870912);
   private static long kj = Long.reverse(830487700238116301L);
   private static long ea = Long.reverse(830487700238116301L);
   private static long x = Long.reverse(5188146770730811392L);
   private static int kc = 9961472 >>> 145 | 9961472 << -145;
   private static int cr = Integer.reverse(-671088640);
   private static int gg = (0 >>> 242 | 0 << -242) & -1;
   private static long ho = Long.reverse(4865712966362080717L);
   private static int pj = 196608 >>> 16 | 196608 << ~16 + 1;
   private static float hq = Float.intBitsToFloat(268032 >>> 116 | 268032 << -116);
   private static long br = Long.reverse(830487700238116301L);
   private static int m = Integer.reverse(-1073741824);
   private static long am = Long.reverse(5188146770730811392L);
   private static long ir = Long.reverse(830487700238116301L);
   private static int ef = Integer.reverse(1677721600);
   private static long nm = Long.reverse(4865712966362080717L);
   private static long ml = Long.reverse(830487700238116301L);
   private static int cv = (4096 >>> 138 | 4096 << -138) & -1;
   private static int ow = 466944 >>> 76 | 466944 << ~76 + 1;
   private static int gk = Integer.reverse(-1610612736);
   private static int ii = Integer.reverse(-1073741824);
   private static int fe = 98304 >>> 79 | 98304 << -79;
   private static long mr = Long.reverse(4865712966362080717L);
   private static int kv = Integer.reverse(1073741824);
   private static int el = Integer.reverse(335544320);
   private static int jv = 1342177282 >>> 155 | 1342177282 << ~155 + 1;
   private static long ed = Long.reverse(830487700238116301L);
   private static long jw = Long.reverse(830487700238116301L);
   private static int kq = 0 >>> 30 | 0 << ~30 + 1;
   private static int gu = (-1 >>> 97 | -1 << ~97 + 1) & -1;
   private static long bg = Long.reverse(4865712966362080717L);
   private static long ou = Long.reverse(5188146770730811392L);
   private static int mj = (2816 >>> 40 | 2816 << -40) & -1;
   private static int hs = Integer.reverse(0);
   private static int pc = (8 >>> 163 | 8 << -163) & -1;
   private static int gx = (896 >>> 196 | 896 << -196) & -1;
   private static int ep = -1 >>> 211 | -1 << -211;
   private static long ag = Long.reverse(4865712966362080717L);
   private static long bi = Long.reverse(830487700238116301L);
   private static int bh = Integer.reverse(-2013265920);
   private static int lz = Integer.reverse(-1711276032);
   private static int gh = Integer.reverse(536870912);
   private static int ki = Integer.reverse(1912602624);
   private static final List<String> c;
   private static long on = Long.reverse(5188146770730811392L);
   private static int lg = -1 >>> 27 | -1 << ~27 + 1;
   private static long aa = Long.reverse(830487700238116301L);
   private static int od = Integer.reverse(369098752);
   private static int nx = (6528 >>> 38 | 6528 << -38) & -1;
   private static int ds = Integer.reverse(-1);
   private static long nv = Long.reverse(830487700238116301L);
   private static long gs = Long.reverse(5188146770730811392L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int bl = -1 >>> 207 | -1 << -207;
   private static int nj = Integer.reverse(0);
   private static long dn = Long.reverse(5188146770730811392L);
   private static int lv = Integer.reverse(436207616);
   private static long fh = Long.reverse(5188146770730811392L);
   private static int ga = 32 >>> 197 | 32 << ~197 + 1;
   private static int n = (64 >>> 165 | 64 << -165) & -1;
   private static long es = Long.reverse(4865712966362080717L);
   private static int cu = 4 >>> 34 | 4 << ~34 + 1;
   private static int fu = 100663296 >>> 153 | 100663296 << ~153 + 1;
   private static int gq = 27648 >>> 169 | 27648 << -169;
   private static long kh = Long.reverse(5188146770730811392L);
   private static float js = Float.intBitsToFloat(8577024 >>> 153 | 8577024 << -153);
   private static long fr = Long.reverse(5188146770730811392L);
   private static float jt = Float.intBitsToFloat(514 >>> 139 | 514 << -139);
   private static long go = Long.reverse(5188146770730811392L);
   private static int np = Integer.reverse(-973078528);
   private static int bw = ('뀀' >>> 11 | 45056 << -11) & -1;
   private static long ka = Long.reverse(5188146770730811392L);
   private static int db = (0 >>> 6 | 0 << ~6 + 1) & -1;
   private static int hg = -1 >>> 98 | -1 << ~98 + 1;
   private static int pk = Integer.reverse(-1912602624);
   private static int co = Integer.reverse(-1073741824);
   private static int cx = 1835008 >>> 112 | 1835008 << ~112 + 1;
   private static int ie = 32 >>> 101 | 32 << ~101 + 1;
   private static int gw = Integer.reverse(268435456);
   private static int ba = Integer.reverse(-268435456);
   private static long ee = Long.reverse(5188146770730811392L);
   private static int ib = (0 >>> 223 | 0 << -223) & -1;
   private static int ec = Integer.reverse(-1543503872);
   private static int ja = (64 >>> 227 | 64 << ~227 + 1) & -1;
   private static int dl = (8 >>> 222 | 8 << -222) & -1;
   private static int lf = Integer.reverse(-905969664);
   private static int lk = Integer.reverse(1610612736);
   private static int ei = 81788928 >>> 213 | 81788928 << -213;
   private static int em = Integer.reverse(-1);
   private static int le = Integer.reverse(-1610612736);
   private static int bd = Integer.reverse(0);
   private static int cm = Integer.reverse(-1);
   private static long ek = Long.reverse(5188146770730811392L);
   private static int oa = Integer.reverse(-436207616);
   private static int i = Integer.reverse(0);
   private static int bq = (320 >>> 36 | 320 << ~36 + 1) & -1;
   private static long nz = Long.reverse(5188146770730811392L);
   private static int la = Integer.reverse(536870912);
   private static int fc = Integer.reverse(-1);
   private static long iw = Long.reverse(5188146770730811392L);
   private static long lr = Long.reverse(4865712966362080717L);
   private static long gz = Long.reverse(5188146770730811392L);
   private static int fi = Integer.reverse(1946157056);
   private static int hw = Integer.reverse(2080374784);
   private static int mg = Integer.reverse(-637534208);
   private static int dy = Integer.reverse(1073741824);
   private static int h = (0 >>> 214 | 0 << -214) & -1;
   private static int bf = -1 >>> 194 | -1 << ~194 + 1;
   private static int ov = Integer.reverse(1308622848);
   private static int fb = Integer.reverse(872415232);
   private static int hm = 983040 >>> 142 | 983040 << ~142 + 1;
   private static int ew = 16777216 >>> 152 | 16777216 << ~152 + 1;
   private static int ij = 268435456 >>> 252 | 268435456 << -252;
   private static long ng = Long.reverse(830487700238116301L);
   private static long ok = Long.reverse(4865712966362080717L);
   private static long de = Long.reverse(5188146770730811392L);
   private static long ih = Long.reverse(4865712966362080717L);
   private static long mt = Long.reverse(830487700238116301L);
   private static long or = Long.reverse(4865712966362080717L);
   private static int bb = -1 >>> 238 | -1 << ~238 + 1;
   private static int ff = Integer.reverse(-1275068416);
   private static long dm = Long.reverse(830487700238116301L);
   private static long dk = Long.reverse(4865712966362080717L);
   private static int hb = Integer.reverse(Integer.MIN_VALUE);
   private static int k = 0 >>> 213 | 0 << -213;
   private static int ak = (1342177280 >>> 251 | 1342177280 << -251) & -1;
   private static int bt = Integer.reverse(0);
   private static int fa = Integer.reverse(1073741824);
   private static int mf = Integer.reverse(1342177280);
   private static long ch = Long.reverse(5188146770730811392L);
   private static long d = Long.reverse(830487700238116301L);
   private static int nk = Integer.reverse(1174405120);
   private static int io = 335544320 >>> 26 | 335544320 << ~26 + 1;
   private static long pe = Long.reverse(4865712966362080717L);
   private static long cn = Long.reverse(4865712966362080717L);
   private static int kl = (-1644167168 >>> 217 | -1644167168 << ~217 + 1) & -1;
   private static int l = 512 >>> 232 | 512 << ~232 + 1;
   private static long iv = Long.reverse(830487700238116301L);
   private static long lc = Long.reverse(830487700238116301L);
   private static int er = Integer.reverse(-1);
   private static long of = Long.reverse(4865712966362080717L);
   private static int af = 4194304 >>> 211 | 4194304 << ~211 + 1;
   private static long pm = Long.reverse(5188146770730811392L);
   private static long kk = Long.reverse(5188146770730811392L);
   private static int lp = 86 >>> 0 | 86 << ~0 + 1;
   private static long hl = Long.reverse(4865712966362080717L);
   private static long ab = Long.reverse(5188146770730811392L);
   private static int li = 5376 >>> 70 | 5376 << -70;
   private static int fk = Integer.reverse(-201326592);
   private static long cy = Long.reverse(4865712966362080717L);
   private static long q = Long.reverse(830487700238116301L);
   private static long pb = Long.reverse(5188146770730811392L);
   private static int lo = Integer.reverse(-536870912);
   private static int kz = (33554432 >>> 152 | 33554432 << -152) & -1;

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (!(var1 instanceof NLoginCore_277)) {
         NLoginCore_150.a(var1, NLoginCore_487.z);
      } else {
         NLoginCore_277 var3 = (NLoginCore_277)var1;
         NLoginCore_509 var4 = this.a.a().b(var3);
         NLoginInterface_024 var5 = var4.a();
         if (var2.length != l && var2.length != m) {
            String var13 = this.j() ? a(n, o) : a(p, q ^ r);
            String var15 = a(s, t ^ u);
            NLoginCore_150.a(var1, a(v, w ^ x));
            NLoginCore_150.a(
               var1, a(z, aa ^ ab) + var15 + a(ac & ad, ae) + var13 + a(af, ag) + (this.j() ? a(ah, ai ^ aj) : a(ak, al ^ am))
            );
            NLoginCore_150.a(
               var1, a(ao & ap, aq) + var15 + a(ar, as ^ at) + var13 + a(au, av ^ aw) + (this.j() ? a(ax, ay ^ az) : a(ba & bb, bc))
            );
            NLoginCore_150.a(
               var1, a(be & bf, bg) + var15 + a(bh, bi ^ bj) + var13 + a(bk & bl, bm) + (this.j() ? a(bn, bo ^ bp) : a(bq, br ^ bs))
            );
            NLoginCore_150.a(var1, a(bu, bv) + var15 + a(bw, bx) + (this.j() ? a(by, bz ^ ca) : a(cb, cc ^ cd)));
            NLoginCore_150.a(var1, a(cf, cg ^ ch));
         } else {
            String var6 = var2[cj].toLowerCase(Locale.ENGLISH);
            if (var2.length == ck) {
               if (var6.equals(a(cl & cm, cn))) {
                  if (this.a.L()) {
                     NLoginType_010 var14 = this.a.c();
                     NLoginCore_199 var26 = var14.a();
                     int var32 = co;
                     Object[] var36 = new Object[cp];
                     var36[cq] = a(cr, cs ^ ct);
                     var36[cu] = cv;
                     var36[cw] = a(cx, cy);
                     var36[cz] = this.a.cN;
                     var26.a(var3, var32, var36);
                  } else {
                     a(this.a, var5, this.a);
                  }
               } else if (c.contains(var6)) {
                  NLoginCore_487 var28 = NLoginCore_487.x;
                  Object[] var33 = new Object[da];
                  var33[db] = a(dc, dd ^ de) + var6 + a(df, dg ^ dh) + (this.j() ? a(di & dj, dk) : a(dl, dm ^ dn)) + a(var_do, dp ^ dq);
                  NLoginCore_150.a(var1, var28, var33);
               } else {
                  NLoginCore_150.a(var1, this.j() ? a(dr & ds, dt) : a(du, dv ^ dw));
               }
            } else {
               NLoginType_016 var7 = NLoginType_016.a(var2[dy].toLowerCase(Locale.ENGLISH));
               if (var7 == null) {
                  String var16 = String.join(a(dz, ea ^ eb), NLoginType_016.t);
                  NLoginCore_150.a(var1, this.j() ? a(ec, ed ^ ee) + var16 + a(ef, eg ^ eh) : a(ei, ej ^ ek) + var16 + a(el & em, en));
               } else {
                  NLoginCore_482 var8 = this.a.a().a();
                  int var10 = ep;
                  switch (var6.hashCode()) {
                     case -1360201941:
                        if (var6.equals(a(ex & ey, ez))) {
                           var10 = fa;
                        }
                        break;
                     case 3708:
                        if (var6.equals(a(fb & fc, fd))) {
                           var10 = fe;
                        }
                        break;
                     case 113762:
                        if (var6.equals(a(eq & er, es))) {
                           var10 = et;
                        }
                        break;
                     case 111442729:
                        if (var6.equals(a(eu, ev))) {
                           var10 = ew;
                        }
                  }

                  switch (var10) {
                     case 0:
                        if (this.a.L()) {
                           NLoginType_010 var19 = this.a.c();
                           if (!var19.b(var3, var4)) {
                              var5.a(this.j() ? a(ff, fg ^ fh) : a(fi, fj));
                              return;
                           }

                           String var23;
                           if (var7 != NLoginType_016.f) {
                              var23 = a(fk, fl);
                           } else {
                              var23 = this.j() ? a(fm, fn ^ fo) : a(fp, fq ^ fr);
                              Object[] var10001 = new Object[fs];
                              var10001[ft] = NLoginType_016.a.cS;
                              var23 = String.format(var23, var10001);
                           }

                           String var21 = var23;
                           NLoginCore_199 var25 = var19.a();
                           int var30 = fu;
                           Object[] var35 = new Object[fv];
                           var35[fw] = a(fx & fy, fz);
                           var35[ga] = var7.cR;
                           var35[gb] = a(gc & gd, ge);
                           var35[gf] = gg;
                           var35[gh] = a(gi, gj);
                           var35[gk] = this.a.cN;
                           var35[gl] = a(gm, gn ^ go);
                           var35[gp] = this.j() ? a(gq, gr ^ gs) : a(gt & gu, gv);
                           var35[gw] = a(gx, gy ^ gz);
                           var35[ha] = var21;
                           var25.a(var3, var30, var35);
                        } else {
                           if (var7 == NLoginType_016.f) {
                              var8.a(var7.aE(), (boolean)hb).ag();
                           } else {
                              var8.a(var7.aE(), NLoginCore_393.a(var1.<Player>c().getLocation())).ag();
                           }

                           a(this.a, var5, this.a);
                           if (var7 == NLoginType_016.f && !var8.c(NLoginType_016.a.aE())) {
                              String var27 = this.j() ? a(hc, hd ^ he) : a(hf & hg, hh);
                              Object[] var31 = new Object[hi];
                              var31[hj] = NLoginType_016.a.cS;
                              var5.a(String.format(var27, var31));
                              NLoginCore_150.a(var1, NLoginCore_194.F);
                           } else {
                              NLoginCore_150.a(var1, this.j() ? a(hk, hl) : a(hm & hn, ho));
                              NLoginCore_150.a(var1, NLoginCore_194.C, hq, hr);
                           }

                           NLoginCore_447 var20 = (NLoginCore_447)this.a.b();
                           var20.a().a(this.a, (boolean)hs);
                        }
                        break;
                     case 1:
                        if (this.a.L()) {
                           NLoginType_010 var17 = this.a.c();
                           if (!var17.b(var3, var4)) {
                              var5.a(this.j() ? a(ht, hu ^ hv) : a(hw & hx, hy));
                              return;
                           }

                           NLoginCore_199 var22 = var17.a();
                           int var29 = hz;
                           Object[] var34 = new Object[ia];
                           var34[ib] = a(ic, id);
                           var34[ie] = var7.cR;
                           var34[var_if] = a(ig, ih);
                           var34[ii] = ij;
                           var34[ik] = a(il, im ^ in);
                           var34[io] = this.a.cN;
                           var34[ip] = a(iq, ir ^ is);
                           var34[it] = this.j() ? a(iu, iv ^ iw) : a(ix, iy ^ iz);
                           var34[ja] = a(jb, jc ^ jd);
                           var34[je] = this.j() ? a(jf, jg ^ jh) : a(ji, jj ^ jk);
                           var22.a(var3, var29, var34);
                        } else {
                           String var18 = var8.k(var7.aE());
                           if (var18 != null) {
                              if (var7 == NLoginType_016.f) {
                                 var8.a(var7.aE(), (boolean)jl).ag();
                              } else {
                                 var8.a(var7.aE()).ag();
                              }

                              a(this.a, var5, this.a);
                              NLoginCore_150.a(var1, this.j() ? a(jm, jn) : a(jo, jp ^ jq));
                              NLoginCore_150.a(var1, NLoginCore_194.C, js, jt);
                              NLoginCore_447 var12 = (NLoginCore_447)this.a.b();
                              var12.a().a(this.a, (boolean)ju);
                           } else {
                              NLoginCore_150.a(var1, this.j() ? a(jv, jw ^ jx) : a(jy, jz ^ ka));
                              NLoginCore_150.a(var1, NLoginCore_194.F);
                           }
                        }
                        break;
                     case 2:
                     case 3:
                        if (var7 == NLoginType_016.f) {
                           var5.a(this.j() ? a(kc, kd ^ ke) : a(kf, kg ^ kh));
                           return;
                        }

                        if (this.a.L()) {
                           NLoginType_010 var11 = this.a.c();
                           if (!var11.b(var3, var4)) {
                              var5.a(this.j() ? a(ki, kj ^ kk) : a(kl, km ^ kn));
                              return;
                           }

                           NLoginCore_199 var10000 = var11.a();
                           int var10002 = ko;
                           Object[] var10003 = new Object[kp];
                           var10003[kq] = a(kr & ks, kt);
                           var10003[ku] = var7.cR;
                           var10003[kv] = a(kw, kx);
                           var10003[ky] = kz;
                           var10003[la] = a(lb, lc ^ ld);
                           var10003[le] = this.j() ? a(lf & lg, lh) : a(li, lj);
                           var10003[lk] = a(ll & lm, ln);
                           var10003[lo] = this.j() ? a(lp & lq, lr) : a(ls, lt);
                           var10003[lu] = a(lv, lw ^ lx);
                           var10003[ly] = this.j() ? a(lz & ma, mb) : a(mc & md, me);
                           var10003[mf] = a(mg, mh ^ mi);
                           var10003[mj] = this.j() ? a(mk, ml ^ mm) : a(mn & mo, mp);
                           var10000.a(var3, var10002, var10003);
                        } else {
                           this.a(var3, var5, var7);
                        }
                  }
               }
            }
         }
      }
   }

   private static String a(NLoginType_008 var0, NLoginType_016 var1) {
      int var2 = var1 == NLoginType_016.f ? (var0.a().a().c(NLoginType_016.a.aE()) && var0.a().a().m(var1.aE()) ? nn : no) : var0.a().a().c(var1.aE());
      return var2 != 0 ? a(np, nq) : a(nr, ns ^ nt);
   }

   public SpawnCommand(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), a(f, g), (boolean)h, (boolean)i);
   }

   private static String a(int var0, long var1) {
      var1 ^= 18L;
      var1 ^= -7720114554991557843L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(41 + 27),
                     69,
                     (byte)(2 + 81),
                     (byte)(25 + 22),
                     (byte)(28 + 39),
                     (byte)(22 + 44),
                     (byte)(2 + 65),
                     (byte)(39 + 8),
                     (byte)(5 + 75),
                     (byte)(60 + 15),
                     (byte)(52 + 15),
                     (byte)(45 + 38),
                     (byte)(30 + 23),
                     (byte)(49 + 31),
                     (byte)(88 + 9),
                     (byte)(7 + 93),
                     (byte)(72 + 28),
                     105,
                     (byte)(52 + 58),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.D("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࡎࠚࡎࡍ࠾ࡅࡒ࠵ࡐࡖࡔ", (byte)64, 68));
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

   private static void b() {
      c = -5502166382898421296L;
      long var0 = c ^ -7720114554991557843L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(41 + 28),
               (byte)(67 + 16),
               (byte)(17 + 30),
               (byte)(22 + 45),
               (byte)(63 + 3),
               67,
               (byte)(3 + 44),
               (byte)(64 + 16),
               (byte)(21 + 54),
               (byte)(8 + 59),
               (byte)(66 + 17),
               (byte)(51 + 2),
               (byte)(59 + 21),
               (byte)(5 + 92),
               (byte)(34 + 66),
               (byte)(68 + 32),
               (byte)(77 + 28),
               (byte)(16 + 94),
               (byte)(44 + 59)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_387.F("դՙՙ՜ՙՅԟբՆԶ\u0557Բ", (byte)46, 70);
               b[1] = NLoginCore_092.C("ѱҁҶҔ҆ѴҒғѺҿҪѾѶғҕқҰҠҘңһҕҒғ", (byte)46, 67);
               b[2] = NLoginCore_092.C("үҚҵҳѹұѽӀѼҶҒ҇", (byte)46, 67);
               b[3] = NLoginCore_575.C("Ҭҗѱһқ҆Ҋ҇ҫѽӀ҇", (byte)46, 67);
               b[4] = NLoginCore_433.F("դՙՙ՜ՙՅԟբՆԶ\u0557Բ", (byte)46, 70);
               b[5] = NLoginCore_232.E("Ԭ\u0557ՕԺզ՝ՈԪՁՇՅԲ", (byte)46, 69);
               b[6] = NLoginCore_027.C("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҵҺҜҾҠӋҳҿӖӐӐ", (byte)46, 67);
               b[7] = NLoginCore_427.A("ıłđİŘŃŅđĬįŔģ", (byte)46, 65);
               b[8] = NLoginCore_004.F("ՄԞԤԡԼԾԺՅԹ\u0557իԲ", (byte)46, 70);
               b[9] = NLoginCore_387.E("ՓԣԻԷ\u0530ԡԨ՜ԵՇՍԤԪՑ՞թէ՞կ՞թԱշկՍԷկ՛վԿհՍ", (byte)46, 69);
               b[10] = NLoginCore_027.F("դՠՙաԯՆէՂԣԷԫդիՉձՁ\u0530ՅեըԷզԽԾ", (byte)46, 70);
               b[11] = NLoginCore_091.D("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҵҺҜҾҠӋҳҿӖӐӐ", (byte)46, 68);
               b[12] = NLoginCore_004.E("ՏԣՖՁզՑԩՊԼՈՀՋՆէՅԬ՝ՊԯկԮնԽԾ", (byte)46, 69);
               b[13] = NLoginCore_241.C("ҙѳѹѶґғҏҚҎҬӀ҇", (byte)46, 67);
               b[14] = NLoginCore_559.B("đŊĳĿřĖōŖĲōŌİŕķĭĚőĺşķĞŅķŠŤĹŧŠšĪœŋ", (byte)46, 66);
               b[15] = NLoginCore_453.E("ՋՕգԹԢէ՝ԻԡՀըԮՃգՌԻԲԴԬճՅՐԽԾ", (byte)46, 69);
               b[16] = NLoginCore_521.D("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҵҺҜҾҠӋҳҿӖӐӐ", (byte)46, 68);
               b[17] = NLoginCore_446.B("čēģŃėŅīĩĪĹėĬĵőĹŖŌĞŔŖĞŗĮį", (byte)46, 66);
               b[18] = NLoginCore_553.A("ĵďĕĒĭįīĶĪňŜģ", (byte)46, 65);
               b[19] = NLoginCore_201.D("ҮҦҩѺѻѻѴѵҿҝҸѼҞҠҏҚҺӄҶ҃ӈҢҋҾӑҹӀҾӉҍҾӆ", (byte)46, 68);
               b[20] = NLoginCore_183.F("ՙՑՔԥԦԦԟԠժՈգլՆԫՊՁԪժեԶԭՓՎԵմեոհմ՚Ցգ", (byte)46, 70);
               b[21] = NLoginCore_004.C("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҵҺҜҾҠӋҳҿӖӐӐ", (byte)46, 67);
               b[22] = NLoginCore_575.F("ԸՠգԲեԶաԾ՛ՈծՂբզԾԤկՒՍԮ\u0530ՀԽԾ", (byte)46, 70);
               b[23] = NLoginCore_110.D("ҖѰұһҩҜѽѼѻҼҞҠҎҷҦӃҦҙҒҼҙҦҿҩҧҟҪҧӎҠҧӋҒҪӉҰӎӍҩҬӔҺӔҧ", (byte)46, 68);
               b[24] = NLoginCore_091.F("ԮԠԞդԱդԾՃ՞ՌԣՙԦԺՀ՛բՁՆկՈ\u0557ՉՖԵԮջ՞վղսշ", (byte)46, 70);
               b[25] = NLoginCore_559.A("ĝňņīŗŎĹěĲĸĶģ", (byte)46, 65);
               b[26] = NLoginCore_530.E("ԞԜ՛ՀՁթՈԿըԪԨԲ", (byte)46, 69);
               b[27] = NLoginCore_127.E("ՐՄՔԠէԴզՔ՚զէԲ", (byte)46, 69);
               b[28] = NLoginCore_223.C("ҳѴѸҷҩҬҵҰҞҟҊҼҵҔҗӂҲӆҁӁӀҞҊҜӌҿҭҩҔҢҬҕҭҬӓӆҩҪҝҾӀӛҶҧ", (byte)46, 67);
               b[29] = NLoginCore_453.A("őŇľĢŉėĒĬĮĲĕĩėōţřŏĢĿŠĺŁĮį", (byte)46, 65);
               b[30] = NLoginCore_241.F("ԫԢ\u0558էՏԷԩՉՄՇ՛Բ", (byte)46, 70);
               b[31] = NLoginCore_173.C("үҚҵҳѹұѽӀѼҶҒ҇", (byte)46, 67);
               b[32] = NLoginCore_397.D("Ҭҗѱһқ҆Ҋ҇ҫѽӀ҇", (byte)46, 68);
               b[33] = NLoginCore_387.B("ĆĽķėłŗĤŋĮőĕģ", (byte)46, 66);
               b[34] = NLoginCore_559.A("ŃįĳĴłċēŘŏįņŞĶėœōŚĺĲŝğŃŊģŅŗĠŌŇģĿĳŔŮűŬĲŧĺĳŅŮŴŃ", (byte)46, 65);
               b[35] = NLoginCore_201.F("՞ԯԶ՚ԷՠաԩըէԻՀԩլՀձՓՠ՝ՂՓճՏԵ\u0557յՎՐՐվձԽ", (byte)46, 70);
               b[36] = NLoginCore_127.B("ŃĕŌňĖĖĖśĪŜĲģ", (byte)46, 66);
               b[37] = NLoginCore_241.D("ҨҋҤҹҝѽґҼҾҮҠҫұӂҿ҂҃҆ҕҟҙҩҞҮңҹҐӓӏӑҪҡңҳғӅҪӓҺӒӡӖҔҚҷҢӡҶҚҿӜңӄӡӌҫӦӤҽӢӡӓӐӂӖӣӋӖҼәӯӖҲӗӊӇ", (byte)46, 68);
               b[38] = NLoginCore_471.A("ĆĽķėłŗĤŋĮőĕģ", (byte)46, 65);
               b[39] = NLoginCore_427.B("įŎŕĦŊġŋŕĎŅŖĬĚęŐřœĸįŞũľŨşŞŁŬŎĭšŐĥũńĨŪŰĳńŗżŐŪĻūŴŊřŚŁŃƂśŠŔŚŢƎŦŪŌƃſŐŊōŔœŬŋřūƋŷƜţ", (byte)46, 66);
               b[40] = NLoginCore_521.A("ĆĽķėłŗĤŋĮőĕģ", (byte)46, 65);
               b[41] = NLoginCore_553.F("Ժ՞զՑբՒ՜ԵաԬգԲ", (byte)46, 70);
               b[42] = NLoginCore_110.E("դՁԮբՖ՚Կ՟ժՙ\u0557Բ", (byte)46, 69);
               b[43] = NLoginCore_530.F("ԛԶՍԣԴԤԛաԢՕԭՉկՙՐաԲկբ՟\u0557ՀԽԾ", (byte)46, 70);
               b[44] = NLoginCore_433.D("ҷѫҚҥҰѶҚҙғҞҚ҇", (byte)46, 68);
               b[45] = NLoginCore_232.A(
                  "İġŖōĬįŊĸőŕŚŕĲĜġŘĢıķŘģĽŃĝŁŉňŉľůŅňşŤŞŌōĸĲŰŤĵĻŌĲůŵůŵśŞŚƄųũŉŅŊŽņśōŒƄŞƄƆōƄƍřƌƄƓŮŭŶƋųşŹšƠŻƜƘƃŧƗƂŸůżůſƠƮƉƓŭƉƶƩƪŹƺŵƃ", (byte)46, 65
               );
               b[46] = NLoginCore_232.C("ѵҤҴѹҖүҏҲҘӂұҬҳұҐҀқҘҒҕӌӄҤһӆ҇ҏҼӋҿҦҷӃҴӅұҙҚҦҚӏӜӚӀҤӆҿҿӤӨҿӕӆӜӍӭӬӡұӟҲҰӆҭӭӫҺӸӦӺӬӈөӹӔӫӥӚԂӒԃӚӚԆӤӻӒӓ", (byte)46, 67);
               b[47] = NLoginCore_559.F(
                  "ՑԞ՚ԣ՛ԨԲԢԥԫզՏԷլԭԬԮըիԾՠէՖիոՆձԺՍՓՠ՚պյջ՜ՂշՁսօևբ֏Յզչսս\u0590\u058cՖՓ\u058bՓֆ֑դ֖ճ֠ժլ֒֏֖֝տև֞ֈ֧յր֢֭ց֪ծխ֑֏\u058cְֱ֢֯ճ\u058b֥֭֜յּվ֘", (byte)46, 70
               );
               b[48] = NLoginCore_110.D(
                  "Ҕ҅ҺұҐғҮҜҵҹҾҙҰҼҺҾқҟҨҸҶҬӅҚӋҢңӃґҨҕ҉ӉӌҢҼҲҘҼҨҝғҔӃҢӁӝһӞӇӢҽӕӕӀҷӀәӤӝҲӤөӏӶҴӗӪҺӕӮӲӱҽӺӿӵӾӰԁӀӕӫԊԃӮӨӸөԀӳӦԆԐԀԐԋԋӕԇԘԊәӖӱӴәӠԝԍԂԔԅԢӸԁӪԂӿԫԙԌԲӬӽԑԕԅ",
                  (byte)46,
                  68
               );
               b[49] = NLoginCore_141.D("҇҇ѷҴҍҔґ҉ҲҊҊѻҔҗѾҘҸҩҾғҴҹҞҾҏӏӍӋҢӃңҬҹӉӐӒӑӎҙҮӖӝӠӣӂҰӄҢӚөӔҨӌӈӜҾӛҹӒӫӣӂӞӤӘӆӶӺӼҳҰӊӘӸӔԃӚӞӷԃӚӲӀӝӇӻӒӓ", (byte)46, 68);
               b[50] = NLoginCore_201.C("Ҭҗѱһқ҆Ҋ҇ҫѽӀ҇", (byte)46, 67);
               b[51] = NLoginCore_427.C("ҥҙҩѵҼ҉һҩүһҼ҇", (byte)46, 67);
               b[52] = NLoginCore_201.A("ŏĐĔœŅňőŌĺĻĦŘőİĳŞŎŢĝŝŜĺĦĸŨśŉŅİľňıŉňůŢŅņĹŚŜŷŒŃ", (byte)46, 65);
               b[53] = NLoginCore_387.E("՞ԟԣբՔ\u0557ՠ՛ՉՊԷԬկՊՋԬմեբՑՂՐԽԾ", (byte)46, 69);
               b[54] = NLoginCore_446.F("ԻԠՁՕ\u0558աՅՅՊԫԫ՜՟ՐԼՃկձիԾձՠ\u0530շ՚\u0558՚ՎվժՎւՃ՝մ՚նՠՄժգիՅշցք\u0590զՍՏ֎\u0590ՍքՔխջձֆըչշ՟ջ", (byte)46, 70);
               b[55] = NLoginCore_004.F("՝ԠԼՑաԾԨ՝ԾՅ՛զԯԮժԤիՀաՖԳզԫՖԵիԻճտռչ՜նՎշ\u0558ՖՑ։՝ՊպշֆՊ՝ևտ՛Պ֒իե֖՝՞", (byte)46, 70);
               b[56] = NLoginCore_173.D("ҳѴѸҷҩҬҵҰҞҟҌҐңҘҖӄңғҪҿҜҥҒғ", (byte)46, 68);
               b[57] = NLoginCore_521.A(
                  "İġŖōĬįŊĸőŕŚĵŌŘŖŚķĻńŔŒňšĶŧľĿşĭńıĥťŨľŘŎĴŘńĹįİşľŝŹŗźţžřűűŜœŜŵƀŹŎƀƅūƒŐųƆŖűƊƎƍřƖƛƑƚƌƝŜűƇƦƟƊƄƔƅƜƏƂƢƬƜƬƧƧűƣƴƦŵŲƍƐŵżƹƩƞươƾƔƝƆƞƛǇƵƨǎƈƙƭƱơ",
                  (byte)46,
                  65
               );
               b[58] = NLoginCore_553.E("ԲԲԢ՟ԸԿԼԴ՝ԵԵԦԿՂԩՃգՔթԾ՟դՉթԺպոնՍծՎ\u0557դմջսռչՄՙցֈ\u058b֎խ՛կՍօ֔տՓշճևթֆդս֖֎խ։֏փձ֥֧֡՞՛յփ֣տ֮օ։֢֮օ֝իֈղ֦սվ", (byte)46, 69);
               b[59] = NLoginCore_027.C("ҐѵҖҪҭҶҚҚҟҀҀұҴҥґҘӄӆӀғӆҵ҅ӌүҭүңӓҿңӗҘҲӉүӋҵҙҿҸӀҚӌӖәӥһҢҤӣӥҢәҩӂӐӆӛҽӎӌҴӐ", (byte)46, 67);
               b[60] = NLoginCore_553.A("ŎđĭłŒįęŎįĶŌŗĠğśĕŜıŒŇĤŗĜŇĦŜĬŤŰŭŪōŧĿŨŉŇłźŎĻūŨŷĻŎŸŰŌĻƃŜŖƇŎŏ", (byte)46, 65);
               b[61] = NLoginCore_530.C("Ҕ҅ҺұҐғҮҜҵҹҾҹҖҀ҅Ҽ҆ҕқҼ҇ҡҧҁҥҭҬҭҢӓҩҬӃӈӂҰұҜҖӔӈҙҟҰҖӓәӓәҿӂҾӨӗӍҭҩҮӡҪҿұҶӨӂӨӪұӨӱҽӰӨӷӒӑӚӯӗӃӝӅԄӟԀӼӧӋӻӦӜӓӠӓӣԄԒӭӷӑӭԚԍԎӝԞәӧ", (byte)46, 67);
               b[62] = NLoginCore_530.A("đŀŐĕĲŋīŎĴŞōňŏōĬĜķĴĮıŨŠŀŗŢģīŘŧśłœşŐšōĵĶłĶūŸŶŜŀŢśśƀƄśűŢŸũƉƈŽōŻŎŌŢŉƉƇŖƔƂƖƈŤƅƕŰƇƁŶƞŮƟŶŶƢƀƗŮů", (byte)46, 65);
               b[63] = NLoginCore_553.D("Ҭҗѱһқ҆Ҋ҇ҫѽӀ҇", (byte)46, 68);
               b[64] = NLoginCore_324.E("ՐՄՔԠէԴզՔ՚զէԲ", (byte)46, 69);
               b[65] = NLoginCore_110.C("ҳѴѸҷҩҬҵҰҞҟҊҼҵҔҗӂҲӆҁӁӀҞҊҜӌҿҭҩҔҢҬҕҭҬӓӆҩҪҝҾӀӛҶҧ", (byte)46, 67);
               b[66] = NLoginCore_183.F("՞ԟԣբՔ\u0557ՠ՛ՉՊԷԬկՊՋԬմեբՑՂՐԽԾ", (byte)46, 70);
               b[67] = NLoginCore_076.C("Ҕ҅ҺұҐғҮҜҵҹҾҖҳһѼҡӅҘӁҸҊ҄ҹҬӉҫҲҋүҤӃӃҐӏҮӎҼӛҾҕӘәӖӐҵӦҜҵҡӇӊҴҽҩҧһӨӨӮӑӑӒӡӍ", (byte)46, 67);
               b[68] = NLoginCore_397.D("҈ѳҔ҉ѺҫҐҰҼѾҭҷҍҢҦҔҜӁҵӂҺӃӇҷҺқҩ҉ғӑҎӂӆӚҴӋӚӜҭӜҪӌӂҝӐӦӚҲәӒңӪӉӅҲҳ", (byte)46, 68);
               b[69] = NLoginCore_530.B("ŏĐĔœŅňőŌĺĻĩěĖŖŢŔŖğŠŃĵıĮį", (byte)46, 66);
               b[70] = NLoginCore_427.E("Բ՝ՒզՀՀԸԷԪՁեԻաԻթՠխԬՋԳՉՔՖնԸճչԸՏՔձԴհդՏգկչՑմրլզզծ՛Ցճ՝՝փ\u058cբֆ՝՞", (byte)46, 69);
               b[71] = NLoginCore_076.F("Ծ՝դԵՙ\u0530՚դԝՔդՋզ՜Յ՞թՅճԳլըԸԵգջԷձԶժմՒԾՠ՝ԽկՙֈրռյՖֈֈ\u0590\u058bՈքվև֒դ֖՝՞", (byte)46, 70);
               b[72] = NLoginCore_091.C("Ҕ҅ҺұҐғҮҜҵҹҾҖҳһѼҡӅҘӁҸҊ҄ҹҬӉҫҲҋүҤӃӃҐӏҮӎҼӛҾҕӘәӖӐҵӦҜҵҡӇӊҴҽҩҧһӨӨӮӑӑӒӡӍ", (byte)46, 67);
               b[73] = NLoginCore_553.B("ĤďİĥĖŇĬŌŘĚŉœĩľłİĸŝőŞŖşţœŖķŅĥįŭĪŞŢŶŐŧŶŸŉŸņŨŞĹŬƂŶŎŵŮĿƆťšŎŏ", (byte)46, 66);
               b[74] = NLoginCore_453.F("Բ՝ՒզՀՀԸԷԪՁեԻաԻթՠխԬՋԳՉՔՖնԸճչԸՏՔձԴհդՏգկչՑմրլզզծ՛Ցճ՝՝փ\u058cբֆ՝՞", (byte)46, 70);
               b[75] = NLoginCore_433.D("ғҲҹҊҮ҅үҹѲҩҹҠһұҚҳҾҚӈ҈ӁҽҍҊҸӐҌӆҋҿӉҧғҵҲҒӄҮӝӕӑӊҫӝӝӥӠҝәӓӜӧҹӫҲҳ", (byte)46, 68);
               b[76] = NLoginCore_110.C("ҔҮҬ҄ҦҪұғҎҚѽүһӁұұѿҧҞҥҤҋӈҁҰҚҫқӈӄҎӆҎӏҷҰҧӏҭҳӡӘҞӐһӎҦӔҵҟӃҾӭҥӢӭӀҪӞӨӀӓөӀӐӏӏӯӕӉҶәӾҹӼӇ", (byte)46, 67);
               b[77] = NLoginCore_138.B("īœįėĦĺČėĩŎŎľĺŝĽīĜřĵĠőŠŃŗŊŊĠťŅĺĲšŬİŬŧŰŬűũņŌſŒžźŢůŃľņŻŕśžşƅŃŞŸŦźŻŻ", (byte)46, 66);
               b[78] = NLoginCore_575.B("İġŖōĬįŊĸőŕŚŕĲĜġŘĢıķŘģĽŃĝŁŉňŉľůŅňşŤŞŌōĸĲŰŤĵĻŌĲůŵůŵśŞŚƄųũŉŅŊŽņśōŒƄŞƄƆōƄƍřƌƄƓŮŭŶƋųşŹšƠŻƜƘƃŧƗƂŸůżůſƠƮƉƓŭƉƶƩƪŹƺŵƃ", (byte)46, 66);
               b[79] = NLoginCore_471.A("đŀŐĕĲŋīŎĴŞōňŏōĬĜķĴĮıŨŠŀŗŢģīŘŧśłœşŐšōĵĶłĶūŸŶŜŀŢśśƀƄśűŢŸũƉƈŽōŻŎŌŢŉƉƇŖƔƂƖƈŤƅƕŰƇƁŶƞŮƟŶŶƢƀƗŮů", (byte)46, 65);
               b[80] = NLoginCore_471.B("ňĳčŗķĢĦģŇęŜģ", (byte)46, 66);
               b[81] = NLoginCore_091.F("ՐՄՔԠէԴզՔ՚զէԲ", (byte)46, 70);
               b[82] = NLoginCore_427.B("ŏĐĔœŅňőŌĺĻĨĝŠĻļĝťŖœłĳŁĮį", (byte)46, 66);
               b[83] = NLoginCore_091.F("ԸՎՒԳԢըԺզԺԽԬԧծՇխՎ՜ՠզԭՆնեբՍդվէԻոՑ՚շԿ՟րՏՠՉէւզ\u0557Պ։ժզՎՑծթծևՠ՝՞", (byte)46, 70);
               b[84] = NLoginCore_387.B("ōĶĳŅėģŏŔĶŗŉŚīğŁİĮğĸĲśśķţŜļħūţŏŁťŔōĿŀŷĹźōĳűņűŎƂŏļťĽŀƂŕşƈŹƄšŤƊŝŢƉƐ", (byte)46, 66);
               b[85] = NLoginCore_201.C("ҳѴѸҷҩҬҵҰҞҟҍѿѺҺӆҸҺ҃ӄҧҙҕҒғ", (byte)46, 67);
               b[86] = NLoginCore_004.F("Բ՝ՒզՀՀԸԷԪՁեԻաԻթՠխԬՋԳՉՔՖնԸճչԸՏՔձԴհդՏգկչՑմրլզզծ՛Ցճ՝՝փ\u058cբֆ՝՞", (byte)46, 70);
               b[87] = NLoginCore_223.E("Ծ՝դԵՙ\u0530՚դԝՔդՋզ՜Յ՞թՅճԳլըԸԵգջԷձԶժմՒԾՠ՝ԽկՙֈրռյՖֈֈ\u0590\u058bՈքվև֒դ֖՝՞", (byte)46, 69);
               b[88] = NLoginCore_451.F("՞ԟԣբՔ\u0557ՠ՛ՉՊԸՖՅՊԧ՛ԽԪԬՉԿնՃղըԺԳ\u0558նղԸՊ", (byte)46, 70);
               b[89] = NLoginCore_232.B("ŐĔœńħłĚıĤĻľŐĶšļĢŅŀņťļŢŔŨŘĽşĦūłĽŪĳŨŎũŖņĬĲŒĳŹľšŮţŖŶŒƆŃűżśŠŊƄƊŅžƒƍŊ", (byte)46, 66);
               b[90] = NLoginCore_127.E("՜ԜԠ՜ըՇԷժ՜ՍԵԮՇԯՁԿ՞ՆժծԩՓՌջՒԳԽԸՔս՛իծչխօւապՉպօՆդթծկթկյՐշ\u0590հ՝՞", (byte)46, 69);
               b[91] = NLoginCore_387.C("ҳѴѸҷҩҬҵҰҞҟҍҭҢҚқҔѺҹӋѽҘҾӎҌҪҞҐҎҳӌұӁ", (byte)46, 67);
               b[92] = NLoginCore_471.B("ĬĭĔħĪĕŚęĥŗŊŎļšĬľĬıŠĠŨħĩŨŗģňŦŅľŢşİűĳŸĴĸıŌůũœķƀűŒŤŬƃŶůţƉŉŧƂŵƍƄšŧƅżŽŝŪŕŖƙƈųŕųŵƗŵŹƂƝƌţƝƏŦƧŮů", (byte)46, 66);
               b[93] = NLoginCore_004.A("ŁŊŎĴĖŚđŕęěĲľĬīġıŗėŘŅŚśŗśŠŘũŢĸŲŞŤŐŤńĩŇŗŔŃŪŖŝōļŷſĻųļŒŢťŕŖŽņŢƅƁŊƐŢŌũŧŰţŹŒŚōŻŕƜŽƛƟŞƎŰƂƐƞţƗŮů", (byte)46, 65);
               b[94] = NLoginCore_427.B("ĝňņīŗŎĹěĲĸĶģ", (byte)46, 66);
               b[95] = NLoginCore_387.C("ҵҫҢ҆ҭѻѶҐҒҖѺҙѽӀҿҙѾӂқғӊӀҿӄҌҦӑӋҲҶҡҷ", (byte)46, 67);
               b[96] = NLoginCore_397.F("ՎԾՔՅՈՔէԡՊՠՙՌզըԯԨՁՀՋՇՆԪդԺէԲծ՟՝ԹԿի", (byte)46, 70);
               b[97] = NLoginCore_004.C("ҵҫҢ҆ҭѻѶҐҒҖѺҙѽӀҿҙѾӂқғӊӀҿӄҌҦӑӋҲҶҡҷ", (byte)46, 67);
               b[98] = NLoginCore_223.E("Ԭ\u0557ՕԺզ՝ՈԪՁՇՅԲ", (byte)46, 69);
               b[99] = NLoginCore_201.B("ŔĨĪđĵĲĭňńŊĝģ", (byte)46, 66);
               b[100] = NLoginCore_427.D("ҢҴҐҼ҅ҪҷҪүҎҸ҇", (byte)46, 68);
               b[101] = NLoginCore_397.D("҇ҲҧһҕҕҍҌѿҖҺҐҶҐҾҵӂҁҠ҈ҞҩҫӋҍӈӎҍҤҩӆ҉ӅҹҤҸӄӎҦӉӕӁһһӃҰҦӈҲҲӘӡҷӛҲҳ", (byte)46, 68);
               b[102] = NLoginCore_110.D("ѰҧҮҴҭҕґѺѶҪӂҰҜҒҀґҢҨ҂ҼқӎҨӆҋҲӏҟҽҫґҤҩҬҶҳӒӏҜӑҚҩӀӍұұӟұҳӣӕҤӣҵҲҳ", (byte)46, 68);
               b[103] = NLoginCore_387.A("ŐĔœńħłĚıĤĻľŐĶšļĢŅŀņťļŢŔŨŘĽşĦūłĽŪĳŨŎũŖņĬĲŒĳŹľšŮţŖŶŒƆŃűżśŠŊƄƊŅžƒƍŊ", (byte)46, 65);
               b[104] = NLoginCore_387.B("ōčđōřĸĨśōľĦğĸĠĲİŏķśşĚńĽŬŃĤĮĩŅŮŌŜşŪŞŶųŒūĺūŶķŕŚşŠŚŠŦŁŨƁšŎŏ", (byte)46, 66);
               b[105] = NLoginCore_521.A("ĩĿŃĤēřīŗīĮĝĘşĸŞĿōőŗĞķŧŖœľŕůŘĬũłŋŨİŐűŀőĺŘųŗňĻźśŗĿłşŚşŸőŎŏ", (byte)46, 65);
               b[106] = NLoginCore_559.C("ұҚҗҩѻ҇ҳҸҚһҭҾҏ҃ҥҔҒ҃ҜҖҿҿқӇӀҠҋӏӇҳҥӉҸұңҤӛҝӞұҗӕҪӕҲӦҳҠӉҡҤӦҹӃӬӝӨӅӈӮӁӆӭӴ", (byte)46, 67);
               b[107] = NLoginCore_559.D("ҊҌҔқҳ҇ҎҋґҖӃҗҶҠ҃ҐӁҸӄҘҨҷҗӅҮӒ҄ҲҧҽҲӘӑҺҩӃҔҬҭҝӔҪӐҧ", (byte)46, 68);
               b[108] = NLoginCore_433.B("ĬĭĔħĪĕŚęĥŗŊŎļšĬľĬıŠĠŨħĩŨŗģňŦŅľŢşİűĳŸĴĸıŌůũœķƀűŒŤŬƃŶůţƉŉŧƂŵƍƄšŧƅżŽŝŪŕŖƙƈųŕųŵƗŵŹƂƝƌţƝƏŦƧŮů", (byte)46, 66);
               b[109] = NLoginCore_575.B("ŁŊŎĴĖŚđŕęěĲľĬīġıŗėŘŅŚśŗśŠŘũŢĸŲŞŤŐŤńĩŇŗŔŃŪŖŝōļŷſĻųļŒŢťŕŖŽņŢƅƁŊƐŢŌũŧŰţŹŒŚōŻŕƜŽƛƟŞƎŰƂƐƞţƗŮů", (byte)46, 66);
               b[110] = NLoginCore_559.E("Ժ՞զՑբՒ՜ԵաԬգԲ", (byte)46, 69);
               b[111] = NLoginCore_446.D("ҹҖ҃ҷҫүҔҴҿҮҬ҇", (byte)46, 68);
               b[112] = NLoginCore_110.E("ԛԶՍԣԴԤԛաԢՕԭՉկՙՐաԲկբ՟\u0557ՀԽԾ", (byte)46, 69);
               b[113] = NLoginCore_446.D("ѳѱҰҕҖҾҝҔҽѿѽ҇", (byte)46, 68);
               break;
            case 1:
               b[0] = NLoginCore_451.B("ńĵŃķĴĪĲĻŅŚŞĲĲŝļśţŏŞńŦŧĮį", (byte)46, 66);
               b[1] = NLoginCore_223.F("ԜԬաԿԱԟԽԾԥժՕԥթլՍՋԽՂգծԷնԽԾ", (byte)46, 70);
               b[2] = NLoginCore_324.D("ѲѸҰҬҗһҸѱҝҲҰ҇", (byte)46, 68);
               b[3] = NLoginCore_232.C("Ҁ҅҇ҴҔҔҮҩҬҮӀ҇", (byte)46, 67);
               b[4] = NLoginCore_110.D("ҋѴүѶҺ҈ҿѺҏѹҚ҇", (byte)46, 68);
               b[5] = NLoginCore_076.D("Ҙ҃ңүҵҦҹҖүґҊ҇", (byte)46, 68);
               b[6] = NLoginCore_138.D("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҹӏӍҫҨҰҊӍңӀӕ", (byte)46, 68);
               b[7] = NLoginCore_471.B("čĕďĨĨŒňĺķŒĩĚīĬĢłķŚřĳŒŧĮį", (byte)46, 66);
               b[8] = NLoginCore_004.F("\u0558ԾբԡեԻԡԿԷԽէԲ", (byte)46, 70);
               b[9] = NLoginCore_384.A("ńĔĬĨġĒęōĦĸľĕěłŏŚŘŏŠŏŚĨūĝĢľŨũņĭŞŭ", (byte)46, 65);
               b[10] = NLoginCore_451.B("ŕőŊŒĠķŘĳĔĨĚĩĘĜĚŠĠōőĢĨļĸĴīŞŗŧĻļįō", (byte)46, 66);
               b[11] = NLoginCore_004.C("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҶҨҪӇӅҡғӋҵҡҲ", (byte)46, 67);
               b[12] = NLoginCore_241.E("ՏԣՖՁզՑԩՊԼՈԾաԻբձԾՏըԫԲՏՐԽԾ", (byte)46, 69);
               b[13] = NLoginCore_141.A("ċŅďŗŕŁĚčŘĲŘģ", (byte)46, 65);
               b[14] = NLoginCore_324.B("đŊĳĿřĖōŖĲōŌİŕķĭĚőĺşķĞŁĹĻŕŉĿţĦļŮŃ", (byte)46, 66);
               b[15] = NLoginCore_553.D("ҠҪҸҎѷҼҲҐѶҕҾҳҀҽҧҕҰӇҫҟӀӊҤӏүҥӁӃҭҿӍҦ", (byte)46, 68);
               b[16] = NLoginCore_471.B("ĿįŅĶĹŅŘĒĻőňğŁŢŔśĳņŚĴťŖłťŊĨľĩŜıĻĪ", (byte)46, 66);
               b[17] = NLoginCore_471.F("ԜԢԲՒԦՔԺԸԹՈԧըԪաԪ\u0530աճՂՇ\u0558ՐԽԾ", (byte)46, 70);
               b[18] = NLoginCore_223.C("҇ҐѷҙҲҒҝҠҭҪҏҝҙңҧҼҦҝҫ҇ҋҥҒғ", (byte)46, 67);
               b[19] = NLoginCore_027.A("ŊłŅĖėėĐđśĹŔĘĺļīĶŖŠŒğŤľĨŘĿľŊŃťŤŒŝ", (byte)46, 65);
               b[20] = NLoginCore_559.C("ҮҦҩѺѻѻѴѵҿҝҸӁқҀҟҖѿҿҺҋ҂ҭҬӉҏӁҡӀҲҩүҧҪҮҢӚҎӗҦҳӈӕӠҧ", (byte)46, 67);
               b[21] = NLoginCore_138.D("ңғҩҚҝҩҼѶҟҵҬ҃ҥӆҸҿҗҪҾҘӉҸҗҭӆӄҾһҐҢӇҭ", (byte)46, 68);
               b[22] = NLoginCore_232.E("ԸՠգԲեԶաԾ՛ՈծՂ՛՟ԾխՓՕՀԿշՀԽԾ", (byte)46, 69);
               b[23] = NLoginCore_110.A("ĲČōŗŅĸęĘėŘĺļĪœłşłĵĮŘĵłśŅŃĻņŃŪļŃŧŲıŌĶŕŊĵŏĶŴĵŃ", (byte)46, 65);
               b[24] = NLoginCore_076.A("ğđďŕĢŕįĴŏĽĔŊėīıŌœĲķŠĹŊņũģŉĹĥĿŢŲĭıūĿŕŠŉŇŕķŬņŃ", (byte)46, 65);
               b[25] = NLoginCore_127.B("ĭńıĮķőŔňŖŊĮģ", (byte)46, 66);
               b[26] = NLoginCore_183.E("ՏԛԣՅՔ\u0530աՖդՋԨ՚ԭՌՙհԪՂթԿՑՐԽԾ", (byte)46, 69);
               b[27] = NLoginCore_091.F("ԳԠգԹԹԻԟԸՆլեզաՍեԺՔէՂԳՈՀԽԾ", (byte)46, 70);
               b[28] = NLoginCore_004.F("՞ԟԣբՔ\u0557ՠ՛ՉՊԵէՠԿՂխ՝ձԬլիՉԵՇշժ\u0558ՔԿՍ\u0557ՀԻԶյՖֆ՞փփ\u058cտտՒ", (byte)46, 70);
               b[29] = NLoginCore_004.D("ҵҫҢ҆ҭѻѶҐҒҖѻҠѼҼҵ҅ңӃ҄Ҡ҅ӎҽҘҏӂҒҍӍҡҐӎ", (byte)46, 68);
               b[30] = NLoginCore_110.E("ԲԜՕԯԡԞժԪՃՈԹԲ", (byte)46, 69);
               b[31] = NLoginCore_387.E("ԬԮՁՄԿՕՓԿԦԨխԠԩԩՂՊԩղէԱՇՀԽԾ", (byte)46, 69);
               b[32] = NLoginCore_324.B("īİĎĲĸĩĖĺńĳňģ", (byte)46, 66);
               b[33] = NLoginCore_427.E("ԢԖԴԘԼեզՃեԤԽԲ", (byte)46, 69);
               b[34] = NLoginCore_092.C("ҧғҗҘҦѯѷҼҳғҪӂҚѻҷұҾҞҖӁ҃ҧҮ҇ҩһ҄Ұҫ҇ңҗҡҩҔӐӍҭҧӗҷҿӘҧ", (byte)46, 67);
               b[35] = NLoginCore_173.F("՞ԯԶ՚ԷՠաԩըէԻՀԩլՀձՓՠ՝ՂՓխ\u0558դՌԵմպԵԾ\u0558\u0557ցԻԽհՑՂՒֆզՌշՒ", (byte)46, 70);
               b[36] = NLoginCore_433.A("ĪŃŃİŐřĮœĲĥęģ", (byte)46, 65);
               b[37] = NLoginCore_076.D("ҨҋҤҹҝѽґҼҾҮҠҫұӂҿ҂҃҆ҕҟҙҩҞҮңҹҐӓӏӑҪҡңҳғӅҪӓҺӒӡӖҔҚҷҢӡҶҚҿӜңӄӡӌҫӦӤҽӢӡӓӐӂҶӈҲӊҹөөӾӍӗӟӹӯӼӻӻӁӞҼӗӶӻӒӓ", (byte)46, 68);
               b[38] = NLoginCore_384.E("ՁԮ\u0557ԣԺԿԟաՔԦՉԲ", (byte)46, 69);
               b[39] = NLoginCore_453.E("Ծ՝դԵՙ\u0530՚դԝՔեԻԩԨ՟ըբՇԾխոՍշծխՐջ՝Լհ՟ԴոՓԷչտՂՓզ\u058b՟չՊպփՙըթՐՒ֑ժկգթձ֝յչ՛֒֎՟֤֚֒ևղեւը֚֫֟ղ", (byte)46, 69);
               b[40] = NLoginCore_223.F("ՍեՠՔ\u0557եԤզՕաէԲ", (byte)46, 70);
               b[41] = NLoginCore_092.B("ĭğġĔŊīŒļĮŞĝģ", (byte)46, 66);
               b[42] = NLoginCore_530.F("ԣՄՙՖՕԧԺբՇ՜ԤԲ", (byte)46, 70);
               b[43] = NLoginCore_384.B("ČħľĔĥĕČŒēņĐĝŚőŌĚŘŕŧĦŔŧĮį", (byte)46, 66);
               b[44] = NLoginCore_138.E("ՃԣԲԮՒզԻՆԳԺԹԲ", (byte)46, 69);
               b[45] = NLoginCore_521.D("Ҕ҅ҺұҐғҮҜҵҹҾҹҖҀ҅Ҽ҆ҕқҼ҇ҡҧҁҥҭҬҭҢӓҩҬӃӈӂҰұҜҖӔӈҙҟҰҖӓәӓәҿӂҾӨӗӍҭҩҮӡҪҿұҶӨӂӨӪұӨӱҽӰӨӷӒӑӚӯӗӃӝӅԄӟԀӼӧӋӻӦӜӓӠӓӣԄԗԇԕӚӫӱԍԉԕӿӾӧ", (byte)46, 68);
               b[46] = NLoginCore_232.E(
                  "ԠՏ՟ԤՁ՚Ժ՝Ճխ՜\u0557՞՜ԻԫՆՃԽՀշկՏզձԲԺէնժՑբծ՟հ՜ՄՅՑՅպևօիՏձժժ֏֓ժրձևո֘֗\u058c՜֊՝՛ձ\u0558֖֘ե֣֑֥֗ճ֤֔ս֪վ֏գ֝ի\u0590էֶ֣֫֓մձֺֹ\u058bֱַ֭֕", (byte)46, 69
               );
               b[47] = NLoginCore_091.F(
                  "ՑԞ՚ԣ՛ԨԲԢԥԫզՏԷլԭԬԮըիԾՠէՖիոՆձԺՍՓՠ՚պյջ՜ՂշՁսօևբ֏Յզչսս\u0590\u058cՖՓ\u058bՓֆ֑դ֖ճ֠ժլ֒֏֖֝տև֞ֈ֧յր֢֭ց֪ծխ֑֏\u058cְֱ֤ց֓շ֮ս֟ֈ\u058cֿպ֭\u058cֱֶַ׀֛ց\u05c8ֻ֘֒",
                  (byte)46,
                  70
               );
               b[48] = NLoginCore_201.F(
                  "Կ\u0530ե՜ԻԾՙՇՠդթՄ՛էեթՆՊՓգա\u0557հՅնՍՎծԼՓՀԴմշՍէ՝ՃէՓՈԾԿծՍլֈզ։ղ֍ըրրիբիք֏ֈ՝֏֔պ֡՟ւ֕եր֙֝֜ը֥֪֛֠֩֬իրֱֵֶֶֻֻ֖֣֑֮֙֓֔֫֞֫րֲ׃ֵքց֜֟ք\u058b\u05c8ְָֿ֭\u05cd֣֢֬֕דז\u05cfג\u05c8זה֙וה",
                  (byte)46,
                  70
               );
               b[49] = NLoginCore_127.A("ģģēŐĩİĭĥŎĦĦėİĳĚĴŔŅŚįŐŕĺŚīūũŧľşĿňŕťŬŮŭŪĵŊŲŹżſŞŌŠľŶƅŰńŨŤŸŚŷŕŮƇſŞźƀŴŢƒƖƘŏŌŦŴƔŮƀƁƔƐƛűƞŲŻŶşŴƬŢźŦťƆŪŪſ", (byte)46, 65);
               b[50] = NLoginCore_446.F("ԴՁՃՖՓԣԴթՀլԧ\u0557բԸՑղհՓՎգեՀԽԾ", (byte)46, 70);
               b[51] = NLoginCore_004.E("Կեԣ՜դՖԵԿԦԧԪՌ՟ժթՇճԦնղ՟ՐԽԾ", (byte)46, 69);
               b[52] = NLoginCore_451.C("ҳѴѸҷҩҬҵҰҞҟҊҼҵҔҗӂҲӆҁӁӀҞҊҜӌҿҭҩҔҢҬҕҐӇҹһҖҵҲҜҨҬҾҧ", (byte)46, 67);
               b[53] = NLoginCore_241.A("ŏĐĔœŅňőŌĺĻĩĘğŔĚĵĸĺĽĤňŢťġŊŉĭńĸŲŋł", (byte)46, 65);
               b[54] = NLoginCore_138.B("ĬđĲņŉŒĶĶĻĜĜōŐŁĭĴŠŢŜįŢőġŨŋŉŋĿůśĿųĴŎťŋŧőĵśŔŜĶŨŲŵƁŗľŀſƁľŵūŔŘŢƋũƄŠƇƍ", (byte)46, 66);
               b[55] = NLoginCore_110.E("՝ԠԼՑաԾԨ՝ԾՅ՛զԯԮժԤիՀաՖԳզԫՖԵիԻճտռչ՜նՎշ\u0558ՖՑ։՝Պպչռ\u058cդդՠ֒օ՝֎֘\u058c֓ն՛֙ռձ֖֒֟ր", (byte)46, 69);
               b[56] = NLoginCore_575.C("ҳѴѸҷҩҬҵҰҞҟҊҿ҂үҦҿҩ҉ҷӌ҇һҒғ", (byte)46, 67);
               b[57] = NLoginCore_324.C(
                  "Ҕ҅ҺұҐғҮҜҵҹҾҙҰҼҺҾқҟҨҸҶҬӅҚӋҢңӃґҨҕ҉ӉӌҢҼҲҘҼҨҝғҔӃҢӁӝһӞӇӢҽӕӕӀҷӀәӤӝҲӤөӏӶҴӗӪҺӕӮӲӱҽӺӿӵӾӰԁӀӕӫԊԃӮӨӸөԀӳӦԆԐԀԐԋԋӕԇԘԊәӖӱӴәӠԝԍԂԔԅԢӸԁӪӹԏԏԌԉӤԃӽԖԗԶ",
                  (byte)46,
                  67
               );
               b[58] = NLoginCore_004.B("ģģēŐĩİĭĥŎĦĦėİĳĚĴŔŅŚįŐŕĺŚīūũŧľşĿňŕťŬŮŭŪĵŊŲŹżſŞŌŠľŶƅŰńŨŤŸŚŷŕŮƇſŞźƀŴŢƒƖƘŏŌŦŴƔůűřƒŞŹűŰšƐţűƀũƧƀƊƩơƟŭƲ", (byte)46, 66);
               b[59] = NLoginCore_530.F("ԻԠՁՕ\u0558աՅՅՊԫԫ՜՟ՐԼՃկձիԾձՠ\u0530շ՚\u0558՚ՎվժՎւՃ՝մ՚նՠՄժգիՅշցք\u0590զՍՏ֎\u0590Սոզ֕դլ֚֜ձ\u0590֔֏", (byte)46, 70);
               b[60] = NLoginCore_324.C("ҲѵґҦҶғѽҲғҚҰһ҄҃ҿѹӀҕҶҫ҈һҀҫҊӀҐӈӔӑӎұӋңӌҭҫҦӞҲҟӏӍӟӛҸӁӕӀӒҢөӆҼҤҩӰәҩӡӴӡӟӊ", (byte)46, 67);
               b[61] = NLoginCore_559.F(
                  "Կ\u0530ե՜ԻԾՙՇՠդթդՁԫ\u0530էԱՀՆէԲՌՒԬՐ\u0558\u0557\u0558ՍվՔ\u0557ծճխ՛՜ՇՁտճՄՊ՛Ձվքվքժխթ֓ւո\u0558Քՙ\u058cՕժ՜ա֓խ֓֕՜֓֜ը֛֢֓սռօ֚ւծֈհ֯֊֧֫֒ն֦֑ևվ\u058bվ֎֯\u0590ֹֽ׃֛֗ׄ׃։\u05cb\u058bַ֎\u05cdׂ֝֜ה׀ְ֯֨֝֞",
                  (byte)46,
                  70
               );
               b[62] = NLoginCore_397.D("ѵҤҴѹҖүҏҲҘӂұҬҳұҐҀқҘҒҕӌӄҤһӆ҇ҏҼӋҿҦҷӃҴӅұҙҚҦҚӏӜӚӀҤӆҿҿӤӨҿӕӆӜӍӭӬӡұӟҲҰӆҭӭӫҺӸӦӺӬӈөӹӔԄӐӻӹӘӟӀӣԆӴԀӦӏԊӰԌӛӼԊԀԔ", (byte)46, 68);
               b[63] = NLoginCore_223.A("ĩĝČŅĶŔŃĶĔŔŌģ", (byte)46, 65);
               b[64] = NLoginCore_183.E("ԶԷՄ՝ԯՂզՂաԣՄՀՎՑՀՊՁմԵՉՇնԽԾ", (byte)46, 69);
               b[65] = NLoginCore_141.F("՞ԟԣբՔ\u0557ՠ՛ՉՊԵէՠԿՂխ՝ձԬլիՉԵՇշժ\u0558ՔԿՍ\u0557ՀրտԻ՛տՓՅնժՕեՒ", (byte)46, 70);
               b[66] = NLoginCore_138.A("ŏĐĔœŅňőŌĺĻĦįŊġŕĚŎšŃİśŇřŇŌŚŎĹřůŉĻ", (byte)46, 65);
               b[67] = NLoginCore_110.F("Կ\u0530ե՜ԻԾՙՇՠդթՁ՞զԧՌհՃլգԵԯդ\u0557մՖ՝Զ՚ՏծծԻպՙչէֆթՀփքցջՠ֑ՇՠՌղյ՟ըՒխպ֙Փՙո֗֗վլ", (byte)46, 70);
               b[68] = NLoginCore_138.D("҈ѳҔ҉ѺҫҐҰҼѾҭҷҍҢҦҔҜӁҵӂҺӃӇҷҺқҩ҉ғӑҎӂӆӚҴӋӚӜҭӜҪӌӋӁһӤӂӁӝҡҦҸөҭӖӃҧӮӢӆӰӐҵӁ", (byte)46, 68);
               b[69] = NLoginCore_451.D("ҳѴѸҷҩҬҵҰҞҟҊұѼҤҔҨҧҒҔҵҟҚҋӄҧҍұҲӅҦҒӏ", (byte)46, 68);
               b[70] = NLoginCore_110.F("Բ՝ՒզՀՀԸԷԪՁեԻաԻթՠխԬՋԳՉՔՖնԸճչԸՏՔձԴհդՏգկչՑմրլէՄծ՟ՍՏւղՑխ֖֒՝՞", (byte)46, 70);
               b[71] = NLoginCore_471.D("ғҲҹҊҮ҅үҹѲҩҹҠһұҚҳҾҚӈ҈ӁҽҍҊҸӐҌӆҋҿӉҧғҵҲҒӄҮӝӕӑӊҭӘӂӚҰҲӉӢҨӢҺӊҷӥүӥҿұӀӥӐҮ", (byte)46, 68);
               b[72] = NLoginCore_183.A("İġŖōĬįŊĸőŕŚĲŏŗĘĽšĴŝŔĦĠŕňťŇŎħŋŀşşĬūŊŪŘŷŚıŴŵŲŬőƂĸőĽţŦŐřŀśŪŪňņžƉŰŊś", (byte)46, 65);
               b[73] = NLoginCore_183.F("ԳԞԿԴԥՖԻ՛էԩ\u0558բԸՍՑԿՇլՠխեծղբեՆՔԴԾռԹխձօ՟նօև\u0558ևՕշյկֈգ՛քրՎժվզ֓Ց֍Ս֚պ֏՟Ւտղ", (byte)46, 70);
               b[74] = NLoginCore_027.D("҇ҲҧһҕҕҍҌѿҖҺҐҶҐҾҵӂҁҠ҈ҞҩҫӋҍӈӎҍҤҩӆ҉ӅҹҤҸӄӎҦӉӕӁҽҝӃһӁҹӑӡӝӠӈӛҲҳ", (byte)46, 68);
               b[75] = NLoginCore_451.F("Ծ՝դԵՙ\u0530՚դԝՔդՋզ՜Յ՞թՅճԳլըԸԵգջԷձԶժմՒԾՠ՝Խկՙֈրռյ\u0557՞ՙձՑևտհ֓֏շլթօ֊ի\u0558\u0590վ֒՚ւ", (byte)46, 70);
               b[76] = NLoginCore_530.C("ҔҮҬ҄ҦҪұғҎҚѽүһӁұұѿҧҞҥҤҋӈҁҰҚҫқӈӄҎӆҎӏҷҰҧӏҭҳӡӘҞӐһӎҦӔҵҟӃҾӭҥӢӭӀҪӞӨӀӓөӀӂӆҶӼӫӭӉӯӡһӰӇ", (byte)46, 67);
               b[77] = NLoginCore_004.C("ҏҷғѻҊҞѰѻҍҲҲҢҞӁҡҏҀҽҙ҄ҵӄҧһҮҮ҄ӉҩҞҖӅӐҔӐӋӔӐӕӍҪҰӣҶӢӞӆӓҧҢҪӟҹһӅҨҢӛӪӮӒҴӏӢ", (byte)46, 67);
               b[78] = NLoginCore_397.E(
                  "Կ\u0530ե՜ԻԾՙՇՠդթդՁԫ\u0530էԱՀՆէԲՌՒԬՐ\u0558\u0557\u0558ՍվՔ\u0557ծճխ՛՜ՇՁտճՄՊ՛Ձվքվքժխթ֓ւո\u0558Քՙ\u058cՕժ՜ա֓խ֓֕՜֓֜ը֛֢֓սռօ֚ւծֈհ֯֊֧֫֒ն֦֑ևվ\u058bվ֎֯֎ֲֶׇֿׁ֦֜֨֝\u05cb֒",
                  (byte)46,
                  69
               );
               b[79] = NLoginCore_433.D("ѵҤҴѹҖүҏҲҘӂұҬҳұҐҀқҘҒҕӌӄҤһӆ҇ҏҼӋҿҦҷӃҴӅұҙҚҦҚӏӜӚӀҤӆҿҿӤӨҿӕӆӜӍӭӬӡұӟҲҰӆҭӭӫҺӸӦӺӬӈөӹӔӖҽӤԂԆҾӥӺӷӢӄӶӟӽӜөԃԋԔԔӉ", (byte)46, 68);
               b[80] = NLoginCore_553.C("ҪҷѷҪ҅ҧ҇ѽѶҰҟҞѻҠӀҦӈҁӁҜӊҥҒғ", (byte)46, 67);
               b[81] = NLoginCore_092.E("ԟԿՠԡԽԧՑԠ՝ՄէթՋԼԪՄկ՟ԳԮՈՀԽԾ", (byte)46, 69);
               b[82] = NLoginCore_433.E("՞ԟԣբՔ\u0557ՠ՛ՉՊԵԺիԸԭԻԼՓէծոՀՋգժՒթԽէտՍՐ", (byte)46, 69);
               b[83] = NLoginCore_453.C("ҍңҧ҈ѷҽҏһҏҒҁѼӃҜӂңұҵһ҂қӋҺҷҢҹӓҼҐӍҦүӌҔҴӕҤҵҞҼӗһҪҿӃӝӧҙӔӉҩһӗҼҩҿҭӧӡҽҴӫҿҵ", (byte)46, 67);
               b[84] = NLoginCore_127.B("ōĶĳŅėģŏŔĶŗŉŚīğŁİĮğĸĲśśķţŜļħūţŏŁťŔōĿŀŷĹźōĳűņűŎƂŏļťĽŀƂŕŔƄŽľŊƀŹŜůƎŧ", (byte)46, 66);
               b[85] = NLoginCore_173.C("ҳѴѸҷҩҬҵҰҞҟҊҟӀҎҐҧҡҀһғҊӈҬҪҠҙӀӒӏӆҫҨ", (byte)46, 67);
               b[86] = NLoginCore_076.E("Բ՝ՒզՀՀԸԷԪՁեԻաԻթՠխԬՋԳՉՔՖնԸճչԸՏՔձԴհդՏգկչՑմրլը\u058c\u058bօֆ֓ցօ֎Տ֍ֆ՝՞", (byte)46, 69);
               b[87] = NLoginCore_433.E("Ծ՝դԵՙ\u0530՚դԝՔդՋզ՜Յ՞թՅճԳլըԸԵգջԷձԶժմՒԾՠ՝ԽկՙֈրռյՕֆ՞օ֍ի՞ՐըրեծՏնոիմ֏֚ր֜\u0558", (byte)46, 69);
               b[88] = NLoginCore_201.A("ŏĐĔœŅňőŌĺĻĩŇĶĻĘŌĮěĝĺİĨľĸšŢīļĭĬŒī", (byte)46, 65);
               b[89] = NLoginCore_241.A("ŐĔœńħłĚıĤĻľŐĶšļĢŅŀņťļŢŔŨŘĽşĦūłĽŪĳŨŎũŖņĬĲŒĳŹľšŮţŖŶŒƆŃűŽƃƊŴźņŷŘŭťō", (byte)46, 65);
               b[90] = NLoginCore_521.E("՜ԜԠ՜ըՇԷժ՜ՍԵԮՇԯՁԿ՞ՆժծԩՓՌջՒԳԽԸՔս՛իծչխօւապՉպօՅջիբֆՉՍՆՒհց֖՝՞", (byte)46, 69);
               b[91] = NLoginCore_201.B("ŏĐĔœŅňőŌĺĻĩŉľĶķİĖŕŧęĴŦľĥŠķŃŃőľĺŌ", (byte)46, 66);
               b[92] = NLoginCore_559.E(
                  "ԻԼԣԶԹԤթԨԴզՙ՝ՋհԻՍԻՀկԯշԶԸշզԲ\u0557յՔՍձծԿրՂևՃՇՀ՛վոբՆ֏րաճջ֒օվղ֘\u0558ն֑ք֜֓հն֔\u058b\u058cլչդե֨֗ւդւցք֎։ֲ֜\u058c֑֖ձօ֦սվ", (byte)46, 69
               );
               b[93] = NLoginCore_559.B("ŁŊŎĴĖŚđŕęěĲľĬīġıŗėŘŅŚśŗśŠŘũŢĸŲŞŤŐŤńĩŇŗŔŃŪŖŝōļŷſĻųļŒŢťŕŖŽņŢƅƁŊƐŢŌũŧŰţŹŒŚōŻŕƟśűŶŞƗśƅűŵűűŮů", (byte)46, 66);
               b[94] = NLoginCore_076.D("ҰҒҲҕғ҆ҲҞҀҀҎ҇", (byte)46, 68);
               b[95] = NLoginCore_110.B("őŇľĢŉėĒĬĮĲĖĵęŜśĵĚŞķįŦŝŞŤĥľĦĽŞŉōĿ", (byte)46, 66);
               b[96] = NLoginCore_141.C("ңғҩҚҝҩҼѶҟҵҮҡһҽ҄ѽҖҕҠҜқҍҭүӉҋһңҎҎҲӁҥҵҐһӘҮқӟҟҘҺҧ", (byte)46, 67);
               b[97] = NLoginCore_092.A("őŇľĢŉėĒĬĮĲĖĵęŜśĵĚŞķįŦšĥŨŝħŘĸŀŧŌĳ", (byte)46, 65);
               b[98] = NLoginCore_223.E("բԲբ\u0557ԤՆԢաՋԞՉԲ", (byte)46, 69);
               b[99] = NLoginCore_387.F("Ձ՟ՖՒ՛թՀՆՄՌ՛ԶԯՋբՈմԾդՇՅզԽԾ", (byte)46, 70);
               b[100] = NLoginCore_091.D("ҙҚүѹҰѸҏ҉ҚҪҋҳѽқҸӈҕҧҢҪ҈ҥҒғ", (byte)46, 68);
               b[101] = NLoginCore_324.C("҇ҲҧһҕҕҍҌѿҖҺҐҶҐҾҵӂҁҠ҈ҞҩҫӋҍӈӎҍҤҩӆ҉ӅҹҤҸӄӎҦӉӕӁҽӎҽҹңҺҳӟҿӪӜҵҲҳ", (byte)46, 67);
               b[102] = NLoginCore_091.C("ѰҧҮҴҭҕґѺѶҪӂҰҜҒҀґҢҨ҂ҼқӎҨӆҋҲӏҟҽҫґҤҩҬҶҳӒӏҜӑҚҩӀӝқӐӇӤҽңӘӁӃҵҲҳ", (byte)46, 67);
               b[103] = NLoginCore_076.B("ŐĔœńħłĚıĤĻľŐĶšļĢŅŀņťļŢŔŨŘĽşĦūłĽŪĳŨŎũŖņĬĲŒĳŹľšŮţŖŶŒƆŃűŹśŴŊŶťŢƌŜźƏ", (byte)46, 66);
               b[104] = NLoginCore_004.A("ōčđōřĸĨśōľĦğĸĠĲİŏķśşĚńĽŬŃĤĮĩŅŮŌŜşŪŞŶųŒūĺūŶĶŲŵŀľŽŽůľŲśŷŎŏ", (byte)46, 65);
               b[105] = NLoginCore_223.F("ԸՎՒԳԢըԺզԺԽԬԧծՇխՎ՜ՠզԭՆնեբՍդվէԻոՑ՚շԿ՟րՏՠՉէւզ\u0558Սշետտ\u0590ՌՒ\u058c՟ֆ֑Օպյվ֖֑\u0558֍֒", (byte)46, 70);
               b[106] = NLoginCore_141.D("ұҚҗҩѻ҇ҳҸҚһҭҾҏ҃ҥҔҒ҃ҜҖҿҿқӇӀҠҋӏӇҳҥӉҸұңҤӛҝӞұҗӕҪӕҲӦҳҠӉҡҤӦҹҿӆӏәӅӪӀӪӅҶӗ", (byte)46, 68);
               b[107] = NLoginCore_004.B("ĦĨİķŏģĪħĭĲşĳŒļğĬŝŔŠĴńœĳšŊŮĠŎŃřŎŴŒŇŶşŤŷőŊżōĽĻŞůŸĹŖńŖŹŵƇŎŏ", (byte)46, 66);
               b[108] = NLoginCore_141.F("ԻԼԣԶԹԤթԨԴզՙ՝ՋհԻՍԻՀկԯշԶԸշզԲ\u0557յՔՍձծԿրՂևՃՇՀ՛վոբՆ֏րաճջ֒օվղ֘\u0558ն֑ք֜֓հն֔\u058b\u058cլչդե֨֗ւդւփպտ֚֬֙֟ռ֑֢ֆրսվ", (byte)46, 70);
               b[109] = NLoginCore_141.D("ҥҮҲҘѺҾѵҹѽѿҖҢҐҏ҅ҕһѻҼҩҾҿһҿӄҼӍӆҜӖӂӈҴӈҨҍҫһҸҧӎҺӁұҠӛӣҟӗҠҶӆӉҹҺӡҪӆөӥҮӴӆҰӍӋӔӇӝҶҾұӟҹԃӔӏԅӅӚӇԃԆӖԊӕӒӓ", (byte)46, 68);
               b[110] = NLoginCore_183.D("ҨҬҬѵҎѳҮ҇ҞұҚ҇", (byte)46, 68);
               b[111] = NLoginCore_241.C("ҧҫҨҳѸҹҹҹҿѺҔҵҿқҝҲӂҡ҇ҫӁӋҒғ", (byte)46, 67);
               b[112] = NLoginCore_387.A("ČħľĔĥĕČŒēņĝĖĳŝŀġŏşŎĹŒŁĮį", (byte)46, 65);
               b[113] = NLoginCore_223.C("ѱҎҚҍҕҚҞ҇ҋѺӀ҇", (byte)46, 67);
               break;
            case 2:
               b[0] = NLoginCore_530.D("ҐҬҘҺѻҮ҇ҭҮҊҬҁӂҰҁҧҁѻҝҡҾҕҒғ", (byte)46, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_076.A("įĐĮĵőĥŊŖōŅőŇĴĴğŋŎĠŦĻŗŁŀķĨĭĤŁňŲįŁ", (byte)46, 65);
         }
      }
   }

   static {
      b();
      String[] var10000 = new String[ox];
      var10000[oy] = a(oz, pa ^ pb);
      var10000[pc] = a(pd, pe);
      var10000[pf] = a(pg, ph ^ pi);
      var10000[pj] = a(pk, pl ^ pm);
      c = Arrays.asList(var10000);
   }

   private void a(NLoginCore_277 var1, NLoginInterface_024 var2, NLoginType_016 var3) {
      var1.a().a(new SynchronizeWithServerThreadTask(() -> {
         try {
            String var4 = this.a.a().a().k(var3.aE());
            if (var4 == null) {
               var2.a(this.j() ? a(nu, nv ^ nw) : a(nx, ny ^ nz));
               return;
            }

            Location var5 = NLoginCore_393.a(var4);
            if (var5 == null) {
               var2.a(this.j() ? a(oa, ob ^ oc) : a(od & oe, of));
               return;
            }

            Player var6 = var1.c();
            if (NLoginCore_012.V()) {
               var6.teleportAsync(var5, TeleportCause.PLUGIN);
            } else {
               var6.teleport(var5, TeleportCause.PLUGIN);
            }

            var2.a(this.j() ? a(og, oh) : a(oi & oj, ok));
         } catch (Exception var7) {
            NLoginCore_370.c(a(ol, om ^ on) + var7.getLocalizedMessage(), var7);
            var2.a(this.j() ? a(op & oq, or) : a(os, ot ^ ou));
         }
      }));
   }

   @Override
   protected List<String> c(NLoginInterface_042 var1, String var2, String[] var3) {
      switch (var3.length) {
         case 1:
            return NLoginCore_039.a(c, var3);
         case 2:
         case 3:
            return NLoginCore_039.a(NLoginType_016.t, var3);
         default:
            return null;
      }
   }

   public static void a(NLoginType_008 var0, NLoginInterface_024 var1, NLoginCore_055 var2) {
      var1.a(a(mq, mr));
      String var3 = a(ms, mt ^ mu);
      NLoginType_016[] var4 = NLoginType_016.values();
      int var5 = var4.length;

      for (int var6 = mv; var6 < var5; var6++) {
         NLoginType_016 var7 = var4[var6];
         String var10001 = a(mw, mx ^ my);
         Object[] var10002 = new Object[mz];
         var10002[na] = a(var0, var7);
         var10002[nb] = var7.cS;
         var10002[nc] = var7.d((boolean)(var2 == NLoginCore_055.c ? nd : ne));
         var10001 = String.format(var10001, var10002);
         String var9 = a(nf, ng ^ nh);
         Object[] var10003 = new Object[ni];
         var10003[nj] = var7.cR;
         var1.e(var10001, String.format(var9, var10003));
      }

      var1.a(a(nk & nl, nm));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  SpawnCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.E("ӴԖԘӸԜԻԳՉԵԄՂԸՆՀԉԮՐՏՇՍՇԜ", (byte)16, 69), SpawnCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_451.B("ĂďĎÑđčĈđĜċØĖĚēĖĜÞѸфѸѷѨѯѼџѺҀѾõ", (byte)16, 66) + var1 + NLoginCore_575.D("П", (byte)16, 68) + var2.toString(), var4);
      }
   }
}
