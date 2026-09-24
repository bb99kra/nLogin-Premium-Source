package com.nickuc.login;

import com.nickuc.login.tasks.LoginMainQueueTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.geysermc.floodgate.util.LinkedPlayer;

public abstract class NLoginCore_056 {
   private static long z = Long.reverse(5505231373763910567L);
   private static int mf = Integer.reverse(1509949440);
   private static long mw = Long.reverse(5505231373763910567L);
   private static int fw = (8 >>> 192 | 8 << ~192 + 1) & -1;
   private static long cp = Long.reverse(5505231373763910567L);
   private static int dh = (12 >>> 34 | 12 << ~34 + 1) & -1;
   private static int bm = -2013265920 >>> 123 | -2013265920 << ~123 + 1;
   private static int jg = Integer.reverse(-1);
   private static long be = Long.reverse(-7897481117290685529L);
   private static int is = Integer.reverse(1107296256);
   private static long mu = Long.reverse(-2449958197289549824L);
   private static long cd = Long.reverse(-7897481117290685529L);
   private static int kq = Integer.reverse(0);
   private static long el = Long.reverse(5505231373763910567L);
   private static int kt = 1294336 >>> 142 | 1294336 << -142;
   private static int gi = '쀀' >>> 142 | 49152 << -142;
   private static long ne = Long.reverse(-7897481117290685529L);
   private static int lo = Integer.reverse(-1442840576);
   private static int fd = 1280 >>> 232 | 1280 << ~232 + 1;
   private static int jr = (18688 >>> 72 | 18688 << -72) & -1;
   private static long ba = Long.reverse(-7897481117290685529L);
   private static long dk = Long.reverse(-7897481117290685529L);
   private static int fp = 25165824 >>> 215 | 25165824 << -215;
   private static int d = -1 >>> 80 | -1 << ~80 + 1;
   private static int co = 204800 >>> 13 | 204800 << ~13 + 1;
   private static long bc = Long.reverse(-7897481117290685529L);
   private static long fg = Long.reverse(-7897481117290685529L);
   private static long bg = Long.reverse(5505231373763910567L);
   private static long mm = Long.reverse(-7897481117290685529L);
   private static int fq = 184320 >>> 12 | 184320 << -12;
   private static long am = Long.reverse(-2449958197289549824L);
   private static long fu = Long.reverse(5505231373763910567L);
   private static long ku = Long.reverse(-7897481117290685529L);
   private static int hu = Integer.reverse(1006632960);
   private static long jc = Long.reverse(5505231373763910567L);
   private static long h = Long.reverse(-2449958197289549824L);
   private static int io = Integer.reverse(-2113929216);
   private static int lu = 712704 >>> 45 | 712704 << -45;
   private static int ej = (256 >>> 135 | 256 << ~135 + 1) & -1;
   private static int ib = Integer.reverse(-536870912);
   private static long bh = Long.reverse(-2449958197289549824L);
   private static int kv = 10 >>> 29 | 10 << -29;
   private static int jk = 595591168 >>> 247 | 595591168 << ~247 + 1;
   private static int fa = (256 >>> 40 | 256 << -40) & -1;
   private static int eb = Integer.reverse(-1610612736);
   private static int ml = Integer.reverse(-1);
   private static long bk = Long.reverse(-2449958197289549824L);
   private static long lt = Long.reverse(-7897481117290685529L);
   private static long cq = Long.reverse(-2449958197289549824L);
   private static long mj = Long.reverse(-7897481117290685529L);
   private static int dj = (-1 >>> 93 | -1 << ~93 + 1) & -1;
   private static long gt = Long.reverse(-2449958197289549824L);
   private static int ni = Integer.reverse(1174405120);
   private static long gg = Long.reverse(5505231373763910567L);
   private static int jb = (276 >>> 66 | 276 << -66) & -1;
   private static long c;
   private static int he = 256 >>> 136 | 256 << ~136 + 1;
   private static long k = Long.reverse(-7897481117290685529L);
   private static int ae = Integer.reverse(-536870912);
   private static long gk = Long.reverse(5505231373763910567L);
   private static long ew = Long.reverse(5505231373763910567L);
   private static long fo = Long.reverse(-2449958197289549824L);
   private static long gz = Long.reverse(-7897481117290685529L);
   private static long ds = Long.reverse(5505231373763910567L);
   private static int cv = Integer.reverse(-1610612736);
   private static int mi = -1 >>> 97 | -1 << ~97 + 1;
   private static long hh = Long.reverse(-2449958197289549824L);
   private static int ih = Integer.reverse(-67108864);
   private static int lx = Integer.reverse(0);
   private static int cs = (-1 >>> 159 | -1 << -159) & -1;
   private static int ik = (1073741824 >>> 94 | 1073741824 << -94) & -1;
   private static long ho = Long.reverse(-2449958197289549824L);
   private static long gd = Long.reverse(-2449958197289549824L);
   private static int mv = Integer.reverse(-100663296);
   private static long eu = Long.reverse(-2449958197289549824L);
   private static int ek = 77824 >>> 235 | 77824 << ~235 + 1;
   private static int ms = -268435454 >>> 27 | -268435454 << -27;
   private static int bs = Integer.reverse(1207959552);
   private static int eo = Integer.reverse(-469762048);
   private static long dq = Long.reverse(-7897481117290685529L);
   private static int fs = Integer.reverse(536870912);
   private static long lq = Long.reverse(-2449958197289549824L);
   private static int es = Integer.reverse(335544320);
   private static int hb = Integer.reverse(0);
   private static long o = Long.reverse(-2449958197289549824L);
   private static long ma = Long.reverse(5505231373763910567L);
   private static int ky = 0 >>> 56 | 0 << -56;
   private static int var_do = (8 >>> 62 | 8 << -62) & -1;
   private static int mo = 0 >>> 219 | 0 << -219;
   private static int iu = Integer.reverse(536870912);
   private static long gp = Long.reverse(-2449958197289549824L);
   private static long jx = Long.reverse(-2449958197289549824L);
   private static long jt = Long.reverse(-2449958197289549824L);
   private static int en = Integer.reverse(-1073741824);
   private static long kk = Long.reverse(5505231373763910567L);
   private static long g = Long.reverse(5505231373763910567L);
   private static int jz = Integer.reverse(-771751936);
   private static int v = 8 >>> 131 | 8 << ~131 + 1;
   private static int dm = Integer.reverse(-134217728);
   private static int hl = Integer.reverse(-1073741824);
   private static long md = Long.reverse(5505231373763910567L);
   private static long jp = Long.reverse(-2449958197289549824L);
   private static long kx = Long.reverse(-7897481117290685529L);
   private static int gb = 24 >>> 31 | 24 << ~31 + 1;
   private static long dz = Long.reverse(-2449958197289549824L);
   private static int gn = Integer.reverse(-872415232);
   private static int mn = 0 >>> 80 | 0 << -80;
   private static int as = Integer.reverse(-1);
   private static int q = Integer.reverse(-1879048192);
   private static long jo = Long.reverse(5505231373763910567L);
   private static int ha = Integer.reverse(268435456);
   private static int jm = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = (65536 >>> 47 | 65536 << -47) & -1;
   private static int ji = Integer.reverse(268435456);
   private static int hc = Integer.reverse(-335544320);
   private static long kb = Long.reverse(-2449958197289549824L);
   private static int hq = 494927872 >>> 151 | 494927872 << -151;
   private static int fb = (0 >>> 221 | 0 << -221) & -1;
   private static int dl = (1024 >>> 136 | 1024 << ~136 + 1) & -1;
   private static long mb = Long.reverse(-2449958197289549824L);
   private static int kd = 9961472 >>> 81 | 9961472 << -81;
   private static int ff = (10752 >>> 200 | 10752 << -200) & -1;
   private static int aj = (0 >>> 165 | 0 << ~165 + 1) & -1;
   private static int iy = Integer.reverse(570425344);
   private static long et = Long.reverse(5505231373763910567L);
   private static int ck = Integer.reverse(536870912);
   private static int ju = Integer.reverse(-1073741824);
   private static int ja = (96 >>> 68 | 96 << -68) & -1;
   private static long cn = Long.reverse(-2449958197289549824L);
   private static long gl = Long.reverse(-2449958197289549824L);
   private static int kr = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = Integer.reverse(0);
   private static long dt = Long.reverse(-2449958197289549824L);
   private static int du = -2013265920 >>> 250 | -2013265920 << ~250 + 1;
   private static int bt = Integer.reverse(-1);
   private static int cr = 13312 >>> 9 | 13312 << -9;
   private static int ig = (0 >>> 98 | 0 << ~98 + 1) & -1;
   private static int gj = Integer.reverse(1275068416);
   private static long bx = Long.reverse(-7897481117290685529L);
   private static long mq = Long.reverse(-7897481117290685529L);
   private static long kh = Long.reverse(-7897481117290685529L);
   private static int az = -1 >>> 26 | -1 << -26;
   private static int gm = 268435456 >>> 90 | 268435456 << ~90 + 1;
   private static int nh = Integer.reverse(0);
   private static int jq = 16 >>> 131 | 16 << ~131 + 1;
   private static int dp = (-1 >>> 83 | -1 << ~83 + 1) & -1;
   private static int lj = 352321536 >>> 54 | 352321536 << ~54 + 1;
   private static long it = Long.reverse(-7897481117290685529L);
   private static int cu = Integer.reverse(0);
   private static long la = Long.reverse(-7897481117290685529L);
   private static long ag = Long.reverse(-7897481117290685529L);
   private static int kp = Integer.reverse(Integer.MIN_VALUE);
   private static long at = Long.reverse(-7897481117290685529L);
   private static long ll = Long.reverse(-2449958197289549824L);
   private static int dx = Integer.reverse(-1006632960);
   private static long ei = Long.reverse(-2449958197289549824L);
   private static int nd = -2147483600 >>> 159 | -2147483600 << -159;
   private static int hj = Integer.reverse(-1677721600);
   private static int cx = Integer.reverse(-671088640);
   private static int ay = Integer.reverse(805306368);
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int kf = ('쀀' >>> '-' | 49152 << ~45 + 1) & -1;
   private static int fc = Integer.reverse(0);
   private static int var_if = '耀' >>> 'L' | 32768 << -76;
   private static int bw = (9961472 >>> 115 | 9961472 << ~115 + 1) & -1;
   private static long ip = Long.reverse(5505231373763910567L);
   private static int bd = Integer.reverse(1879048192);
   private static long hv = Long.reverse(5505231373763910567L);
   private static int ng = Integer.reverse(0);
   private static int ir = Integer.reverse(-1073741824);
   private static int ed = 2304 >>> 134 | 2304 << ~134 + 1;
   private static long fv = Long.reverse(-2449958197289549824L);
   private static int gv = Integer.reverse(-1409286144);
   private static long iz = Long.reverse(-7897481117290685529L);
   private static int r = 134217728 >>> 219 | 134217728 << ~219 + 1;
   private static int nc = Integer.reverse(0);
   private static long hr = Long.reverse(5505231373763910567L);
   private static int kc = 80 >>> 68 | 80 << -68;
   private static long ep = Long.reverse(5505231373763910567L);
   private static long aw = Long.reverse(-7897481117290685529L);
   private static int lc = Integer.reverse(0);
   private static long iq = Long.reverse(-2449958197289549824L);
   private static long ca = Long.reverse(5505231373763910567L);
   private static int af = (-1 >>> 239 | -1 << -239) & -1;
   private static int dd = (1 >>> 127 | 1 << -127) & -1;
   private static int nf = (8388608 >>> 87 | 8388608 << ~87 + 1) & -1;
   private static int ln = (524288 >>> 19 | 524288 << -19) & -1;
   private static int bl = 0 >>> 237 | 0 << ~237 + 1;
   private static long dg = Long.reverse(-7897481117290685529L);
   private static int db = 7 >>> 190 | 7 << -190;
   private static long ia = Long.reverse(-2449958197289549824L);
   private static int di = (30 >>> 128 | 30 << ~128 + 1) & -1;
   private static int fi = Integer.reverse(-738197504);
   private static long gw = Long.reverse(-7897481117290685529L);
   private static int t = (0 >>> 26 | 0 << ~26 + 1) & -1;
   private static long cf = Long.reverse(-7897481117290685529L);
   private static int an = 256 >>> 200 | 256 << ~200 + 1;
   private static long im = Long.reverse(-7897481117290685529L);
   private static int mh = Integer.reverse(-637534208);
   private static int fx = Integer.reverse(0);
   private static long lh = Long.reverse(-2449958197289549824L);
   private static int cc = Integer.reverse(-1476395008);
   private static int j = Integer.reverse(-1);
   private static long cm = Long.reverse(5505231373763910567L);
   private static int lv = Integer.reverse(-1);
   private static long na = Long.reverse(5505231373763910567L);
   private static int fh = (16777216 >>> 24 | 16777216 << ~24 + 1) & -1;
   private static long eq = Long.reverse(-2449958197289549824L);
   private static int jy = (524288 >>> 17 | 524288 << ~17 + 1) & -1;
   private static int av = Integer.reverse(-805306368);
   private static int ls = Integer.reverse(1778384896);
   private static int gf = (1644167168 >>> 249 | 1644167168 << ~249 + 1) & -1;
   private static int nj = (1073741836 >>> 125 | 1073741836 << -125) & -1;
   private static long ci = Long.reverse(5505231373763910567L);
   private static String[] a = new String[ni];
   private static int ey = 64 >>> 134 | 64 << -134;
   private static long ct = Long.reverse(-7897481117290685529L);
   private static int br = Integer.reverse(0);
   private static int jn = Integer.reverse(301989888);
   private static long dy = Long.reverse(5505231373763910567L);
   private static long hd = Long.reverse(-7897481117290685529L);
   private static int ak = (256 >>> 165 | 256 << ~165 + 1) & -1;
   private static int ge = (8 >>> 162 | 8 << ~162 + 1) & -1;
   private static long jh = Long.reverse(-7897481117290685529L);
   private static long ap = Long.reverse(-7897481117290685529L);
   private static int kn = Integer.reverse(0);
   private static long lk = Long.reverse(5505231373763910567L);
   private static int ko = (0 >>> 19 | 0 << -19) & -1;
   private static long aa = Long.reverse(-2449958197289549824L);
   private static int lf = Integer.reverse(-905969664);
   private static int ga = 4 >>> 98 | 4 << -98;
   private static int mk = (96468992 >>> 244 | 96468992 << ~244 + 1) & -1;
   private static long mx = Long.reverse(-2449958197289549824L);
   private static int i = (48 >>> 100 | 48 << ~100 + 1) & -1;
   private static int lm = (0 >>> 202 | 0 << -202) & -1;
   private static long lw = Long.reverse(-7897481117290685529L);
   private static int cl = 6291456 >>> 242 | 6291456 << ~242 + 1;
   private static int jj = Integer.reverse(0);
   private static long hs = Long.reverse(-2449958197289549824L);
   private static int p = 262144 >>> 114 | 262144 << ~114 + 1;
   private static long ie = Long.reverse(-7897481117290685529L);
   private static int ld = (164 >>> 193 | 164 << -193) & -1;
   private static int cw = Integer.reverse(0);
   private static int hm = Integer.reverse(1543503872);
   private static int ht = Integer.reverse(-1610612736);
   private static int ch = Integer.reverse(-402653184);
   private static long fj = Long.reverse(5505231373763910567L);
   private static int ki = Integer.reverse(-536870912);
   private static int y = 640 >>> 39 | 640 << ~39 + 1;
   private static int kz = 2592 >>> 197 | 2592 << ~197 + 1;
   private static long hg = Long.reverse(5505231373763910567L);
   private static int ix = Integer.reverse(-1610612736);
   private static int ks = 0 >>> 76 | 0 << ~76 + 1;
   private static long nb = Long.reverse(-2449958197289549824L);
   private static int ai = 160 >>> 5 | 160 << -5;
   private static int dr = (553648128 >>> 152 | 553648128 << ~152 + 1) & -1;
   private static int ez = Integer.reverse(0);
   private static int bi = 2 >>> 125 | 2 << -125;
   private static long jl = Long.reverse(-7897481117290685529L);
   private static long n = Long.reverse(5505231373763910567L);
   private static long fz = Long.reverse(-7897481117290685529L);
   private static int bp = Integer.reverse(0);
   private static long ke = Long.reverse(-7897481117290685529L);
   private static long al = Long.reverse(5505231373763910567L);
   private static long em = Long.reverse(-2449958197289549824L);
   private static int bv = (1 >>> 64 | 1 << -64) & -1;
   private static int gq = (20971520 >>> 118 | 20971520 << -118) & -1;
   private static int fy = Integer.reverse(-201326592);
   private static int de = Integer.reverse(-1207959552);
   private static int ad = (0 >>> 188 | 0 << -188) & -1;
   private static int ly = Integer.reverse(0);
   private static int mc = (11392 >>> 231 | 11392 << -231) & -1;
   private static int ft = (23 >>> 255 | 23 << ~255 + 1) & -1;
   private static long hk = Long.reverse(-7897481117290685529L);
   private static long dv = Long.reverse(5505231373763910567L);
   private static long ex = Long.reverse(-2449958197289549824L);
   private static long gc = Long.reverse(5505231373763910567L);
   private static int kw = (-1 >>> 110 | -1 << -110) & -1;
   private static int ab = Integer.reverse(1610612736);
   private static long gs = Long.reverse(5505231373763910567L);
   private static int iv = (1097728 >>> 110 | 1097728 << ~110 + 1) & -1;
   private static int bf = Integer.reverse(-268435456);
   private static int a = Integer.reverse(0);
   private static long bj = Long.reverse(5505231373763910567L);
   private static int hf = 234881024 >>> 214 | 234881024 << ~214 + 1;
   private static int mz = Integer.reverse(100663296);
   private static int hi = Integer.reverse(1073741824);
   private static long dn = Long.reverse(-7897481117290685529L);
   private static long ac = Long.reverse(-7897481117290685529L);
   private static long cz = Long.reverse(-7897481117290685529L);
   private static long go = Long.reverse(5505231373763910567L);
   private static long jw = Long.reverse(5505231373763910567L);
   private static long e = Long.reverse(-7897481117290685529L);
   private static long fk = Long.reverse(-2449958197289549824L);
   private static int df = (-1 >>> 219 | -1 << ~219 + 1) & -1;
   private static int u = (262144 >>> 50 | 262144 << -50) & -1;
   private static int id = -1 >>> 145 | -1 << ~145 + 1;
   private static int eg = Integer.reverse(-1543503872);
   private static int by = Integer.reverse(1073741824);
   private static int ev = 5373952 >>> 177 | 5373952 << -177;
   private static int lz = Integer.reverse(436207616);
   private static int ar = (10485760 >>> 20 | 10485760 << ~20 + 1) & -1;
   private static long kl = Long.reverse(-2449958197289549824L);
   private static int mr = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255) & -1;
   private static int hy = (499712 >>> 173 | 499712 << ~173 + 1) & -1;
   private static int x = (0 >>> 222 | 0 << ~222 + 1) & -1;
   private static long fn = Long.reverse(5505231373763910567L);
   private static int gr = 1664 >>> 133 | 1664 << ~133 + 1;
   private static long iw = Long.reverse(-7897481117290685529L);
   private static long bo = Long.reverse(-7897481117290685529L);
   private static long mt = Long.reverse(5505231373763910567L);
   private static int lb = (536870912 >>> 157 | 536870912 << -157) & -1;
   private static int ef = Integer.reverse(Integer.MIN_VALUE);
   private static int kj = (1308622848 >>> 152 | 1308622848 << -152) & -1;
   private static long lp = Long.reverse(5505231373763910567L);
   private static int fe = 0 >>> 67 | 0 << ~67 + 1;
   private static int ea = 0 >>> 178 | 0 << -178;
   private static int cg = Integer.reverse(-1073741824);
   private static int er = (16384 >>> 172 | 16384 << ~172 + 1) & -1;
   private static int s = 12058624 >>> 83 | 12058624 << ~83 + 1;
   private static long me = Long.reverse(-2449958197289549824L);
   private static String[] b = new String[nj];
   protected final NLoginType_008 e;
   private static int fl = (1 >>> 255 | 1 << -255) & -1;
   private static long ee = Long.reverse(-7897481117290685529L);
   private static long dw = Long.reverse(-2449958197289549824L);
   private static int au = (768 >>> 168 | 768 << ~168 + 1) & -1;
   private static int ic = Integer.reverse(2080374784);
   private static int gx = (28672 >>> 140 | 28672 << -140) & -1;
   private static int bb = 52 >>> 130 | 52 << -130;
   private static int in = Integer.reverse(1073741824);
   private static long hn = Long.reverse(5505231373763910567L);
   private static int jf = Integer.reverse(1644167168);
   private static long ka = Long.reverse(5505231373763910567L);
   private static long cb = Long.reverse(-2449958197289549824L);
   private static int fm = Integer.reverse(872415232);
   private static int bz = Integer.reverse(671088640);
   private static int da = Integer.reverse(Integer.MIN_VALUE);
   private static int hx = (402653184 >>> 58 | 402653184 << ~58 + 1) & -1;
   private static int je = Integer.reverse(-536870912);
   private static long jd = Long.reverse(-2449958197289549824L);
   private static long lg = Long.reverse(5505231373763910567L);
   private static int ao = Integer.reverse(-1879048192);
   private static int jv = (4736 >>> 102 | 4736 << ~102 + 1) & -1;
   private static long eh = Long.reverse(5505231373763910567L);
   private static int hp = 8192 >>> 171 | 8192 << ~171 + 1;
   private static long dc = Long.reverse(-7897481117290685529L);
   private static int bq = Integer.reverse(-1610612736);
   private static int f = (33554432 >>> 24 | 33554432 << ~24 + 1) & -1;
   private static int cy = Integer.reverse(-1);
   private static int c = 67108864 >>> 122 | 67108864 << -122;
   private static long cj = Long.reverse(-2449958197289549824L);
   private static int m = Integer.reverse(536870912);
   private static int ax = Integer.reverse(536870912);
   private static int ii = Integer.reverse(-1);
   private static int my = Integer.reverse(0);
   private static long bu = Long.reverse(-7897481117290685529L);
   private static int lr = Integer.reverse(0);
   private static int mp = 6094848 >>> 16 | 6094848 << -16;
   private static int ce = 11534336 >>> 19 | 11534336 << ~19 + 1;
   private static long b = Long.reverse(-7897481117290685529L);
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static long ij = Long.reverse(-7897481117290685529L);
   private static long js = Long.reverse(5505231373763910567L);
   private static int gu = 3072 >>> 41 | 3072 << -41;
   private static int il = Integer.reverse(33554432);
   private static int kg = Integer.reverse(-1308622848);
   private static int km = Integer.reverse(Integer.MIN_VALUE);
   private static int ec = (0 >>> 96 | 0 << -96) & -1;
   private static int gy = 27 >>> 127 | 27 << -127;
   private static long le = Long.reverse(-7897481117290685529L);
   private static long fr = Long.reverse(-7897481117290685529L);
   private static long gh = Long.reverse(-2449958197289549824L);
   private static int li = Integer.reverse(0);
   private static int bn = Integer.reverse(-1);
   private static long hz = Long.reverse(5505231373763910567L);
   private static long mg = Long.reverse(-7897481117290685529L);
   private static long hw = Long.reverse(-2449958197289549824L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_056.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.E("ՋխկՏճ֒֊֠\u058c՛֙֏֝֗ՠօ֧֦֤֞֞ճ", (byte)103, 69), NLoginCore_056.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.D("Ս՚ՙԜ՜\u0558Փ՜էՖԣաե՞աէԩࢎ࢜ࢲࣆࣁࢼࢵࣄࢩࣉࣄࣇ࢚ࣉࣉՄ", (byte)103, 68) + var1 + NLoginCore_553.D("Ԥ", (byte)103, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_056(NLoginType_008 var1) {
      this.e = var1;
   }

   protected void d(NLoginCore_277 var1, NLoginCore_509 var2) {
      if (!var2.a(NLoginCore_567.i)) {
         String var3 = var1.a().orElse(null);
         ForceRegisterConfig var4 = var2.d(NLoginCore_567.a);
         if (var4 != null && (var3 == null || a(a, b).equalsIgnoreCase(var3))) {
            var3 = var4.a().a(a(c & d, e), var3);
         }

         if (var3 != null) {
            NLoginCore_055 var5 = NLoginCore_055.c(var3);
            if (var5 != null) {
               var2.a(NLoginCore_567.i, var5);
            }
         }
      }

      this.e.b().a().c(var1, var2);
   }

   private static void b() {
      c = -1884455263176399310L;
      long var0 = c ^ -4888340829425325143L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(28 + 41),
               (byte)(72 + 11),
               (byte)(30 + 17),
               (byte)(50 + 17),
               (byte)(10 + 56),
               67,
               (byte)(26 + 21),
               (byte)(52 + 28),
               75,
               (byte)(13 + 54),
               (byte)(25 + 58),
               (byte)(51 + 2),
               (byte)(44 + 36),
               (byte)(40 + 57),
               (byte)(49 + 51),
               (byte)(34 + 66),
               (byte)(11 + 94),
               (byte)(66 + 44),
               (byte)(36 + 67)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(4 + 79)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_027.C("һҶҞӉҙӊҳҎӕӇӍҜ", (byte)53, 67);
               b[1] = NLoginCore_471.D("ҺӃҁқҊӀҨҦҎҨҗңҤҪҰӇӒӉҖҞӋҪҧҨ", (byte)53, 68);
               b[2] = NLoginCore_559.E("դՓ\u0557ԼԿՌ՞Ծ՚ՂճղՍԵՐշոԹդ՜ՖսՄՅ", (byte)53, 69);
               b[3] = NLoginCore_091.F("ԣաԬ՜Ձթ՝ԮղէՕԮՂԯՓՋմԸշԽիՔտՑկփ\u0558Ր՞ոչև", (byte)53, 70);
               b[4] = NLoginCore_397.D("ҺӃҁқҊӀҨҦҎҨҗңҤҪҰӇӒӉҖҞӋҪҧҨ", (byte)53, 68);
               b[5] = NLoginCore_232.D("ҸҪҢҰҤӎӃҪӅӗҫәӖӂӃҲҙӝҖҵҡӞӐӞҲҽӃҤӈҾӦӧңҹӄҽӄӫӠӟӥӈөҼ", (byte)53, 68);
               b[6] = NLoginCore_530.E("ՠԥՈՊՋԫծՙԨեյԯՖԷՒշդՊ՛ի՞ԷԶ՛րՠՂոփ՜՟\u0557ռժՊէ֏՛րզթմ֍ձակյ֒֎փզջՙ֜յլց֎հբոց֥֣ժ֧ե֍ն֟քֲ֫֯կְֈָָֹ֔֘֫֯֘֒֙շ֮֠\u058cֲָׄ֨֝", (byte)53, 69);
               b[7] = NLoginCore_201.D(
                  "ҷҋӀӉӒӏҍҿӓӉҪәҢӉӃғӆӕґҴӚһӒӍӛҹҷӠҧҢҸӭӫӈөӉӉөҪӞӭӪӴӅӭӢҹӗӊӐҾӉӏӓӛӑӎԆԅӦӄӗӷӟәԍԋӤӪԇԈӎԊӲԘӠӷӒӻӫӲԌӱԞԋӚӞԝԡӣԑԂԕӥԛӸӪӾӻөԫԟӻԕԟԓ\u0530ԴԶԫԦԤԜԧԷԺԩՀԇԈ", (byte)53, 68
               );
               b[8] = NLoginCore_471.A("ŀĺťĸŒŐššĴŬŌŕţťťĨŐĳŇŀĵŖłŪŊĶĶőźŎŭźœƄſŹƅŘŚńŘŘƆŕŇƁśũŜŅƇŢŭŠűƓŮŸŻŶŘƏƗů", (byte)53, 65);
               b[9] = NLoginCore_141.C("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 67);
               b[10] = NLoginCore_397.A("ŊĕįŞťřũłĺšĵĭĨĨĮűłŐšũŴŇœŃřŻżśļŖūļƀŬĺřņľşſňŇŇŽŢŞŠƂţśƁƆƄŐŔŋŕƆƇūŻŰƋſŘƌƁţƜžƢƧƒƥƤƢƃƠƭƠſƟƜƓűŰƅƥƶƪƜƾŴƵƵƕ", (byte)53, 65);
               b[11] = NLoginCore_530.A("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 65);
               b[12] = NLoginCore_521.B(
                  "ŊķŞĶŅńĦıņŘśŮŤšĭľŒŊĴőŐıįįŗŅŴŇŗĸūŖŷśşżŵŏƆšņšłşŤŢŐżŋŨƒƏŔƏƌƆŤŨŬťŚūƜƓƗƓŚƓƙűşƩŪżƇƢơƋƜƪƚƫŬŰŰƨƁƸƸƌƳƛƦƺƩǀǁƲƎƏǃǆƅƴƟƠƔƠƹƥǆǌƳǄǍƾƣǔǑǆƵƯƳǓǚƞǔǍ",
                  (byte)53,
                  66
               );
               b[13] = NLoginCore_092.F("ՕՇԿՍՁիՠՇբմՊԵզաՒԸԷՖԷԽԷ\u0557ՔժմՁՏՓփևՕՠ", (byte)53, 70);
               b[14] = NLoginCore_004.D("Ӂ҆ҼӎҽҜҳӍӁӂӆҒҕҬҍҜҺӗҼӞӜәҬҖҡӜҲӑӚӚҼӍӠӅӦӘӋӫӰӢҮӴҿӖӌӹәӱҳӎӫӯһӍӶҾԀԅӴӿӃԋӛԂԂԄӛԋԒӾӥӱӕӎӶӪӱӴԙԝӮԕԓӲӜԠӧӨ", (byte)53, 68);
               b[15] = NLoginCore_092.B("ĘŀōłĹĤņşţťŞı", (byte)53, 66);
               b[16] = NLoginCore_446.A("ŘĳĝŃĠŒłřśŋŦı", (byte)53, 65);
               b[17] = NLoginCore_138.E(
                  "ՔԨ՝զկլԪ՜հզՇնԿզՠ\u0530գղԮՑշ\u0558կժոՖՔսՄԿՕ֊ֈեֆզզֆՇջ֊և֑բ֊տՖմէխ՛զլհոծի֣֢փամ֔ռն֪֨ցև֤֥ի֧֏ֵս֔կ֘ֈ֏֩֎ֻ֨շջֺ־րֲ֮֟ւָ֕և֛֘ֆ\u05c8ְֲּּ֘\u05cdבד\u05c8׃ֹׁׄהח׆ם֤֥",
                  (byte)53,
                  69
               );
               b[18] = NLoginCore_141.F("ՈՂխՀ՚\u0558թթԼմՔ՝իխխ\u0530\u0558ԻՏՈԽ՞ՊղՒԾԾՙւՖյւ՛\u058cևց֍ՠբՌՠՠ֎՝Տ։գձդՍ֏ժյըչ֛նրփվՠ֗֟շ", (byte)53, 70);
               b[19] = NLoginCore_384.B("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 66);
               b[20] = NLoginCore_471.C("ҚҧӏӑӑҬҊӉҋӎӏӀҹӌҵӄғӏӛҾҳҹӗӁӏҜҞӀҲӜӂҼӠӏӚҸӅӧӞӧӞӄӊӎӺӐӓӜҴӹӷӈӕӔӮӃӲӵӏԁӂӗԁԍӾԄӜөԉԍԀӟԑӌӢӰӦӒӯӤӭәԐәӬԠӧӨ", (byte)53, 67);
               b[21] = NLoginCore_138.D("҃ҫҸҭҤҏұӊӎӐӉҜ", (byte)53, 68);
               b[22] = NLoginCore_201.A("ŘĳĝŃĠŒłřśŋŦı", (byte)53, 65);
               b[23] = NLoginCore_446.D("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 68);
               b[24] = NLoginCore_397.D(
                  "ҵҢӉҡҰүґҜұӃӆәӏӌҘҩҽҵҟҼһҜҚҚӂҰӟҲӂңӖӁӢӆӊӧӠҺӱӌұӌҭӊӏӍһӧҶӓӽӺҿӺӷӱӏӓӗӐӅӖԇӾԂӾӅӾԄӜӊԔӕӧӲԍԌӶԇԕԅԖӗӛӛԓӬԣԣӷԞԆԑԥԔԫԬԝӹӺԮԱӰԟԊԋӿԋԤԐԱԷԞԯԸԩԎԿԼԱԠԚԞԾՅԉԿԸ",
                  (byte)53,
                  68
               );
               b[25] = NLoginCore_433.E("ՃԿԞՁՁ\u0558ԻիկՁԭճ\u0557հնՊկժկէպՈԲԳւհՑՠՅր՝վՄևո՜ՉՁՇզՋ֓փ֎Րէննո֗ծ֛֙֟֝Փ՟֢֗բչ֣մթ", (byte)53, 69);
               b[26] = NLoginCore_397.C("һ҉ӌҼҢһҝҤҋӇңҰҏҩҦӓҷҨӞҫҹһҺҴӟӘҳҲӄӢҦҧҹӢӃӪӫҺӯөӅӰӅӃӁҵӔӼӕҾӽӪӀԃәӟӱӑҽӴԆӲԊԋӝԆӷӊӾԎԅӍӧԃөԖӺԗԒӲӚӪԊӫӼԐӧӨ", (byte)53, 67);
               b[27] = NLoginCore_446.A("ŀĺťĸŒŐššĴŬŌśŊĿłŐŏŇįŒĴŏļĽ", (byte)53, 65);
               b[28] = NLoginCore_076.B("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 66);
               b[29] = NLoginCore_110.F("ԤԢՀԤ՟աՀԾխԳԫԹ", (byte)53, 70);
               b[30] = NLoginCore_387.D("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 68);
               b[31] = NLoginCore_241.A("ĠĵŜōšŤŘľŉģŀśńşŜůıŋōňĭŐĴūũŜśŌŧļżŪōřŘƅŔŢŒſŸŖŬƄƊŸŨŤŎƂƏƈşůŜŝ", (byte)53, 65);
               b[32] = NLoginCore_027.A("ĻķĖĹĹŐĳţŧĹĥūŏŨŮłŧŢŧşŲŀĪīźŨŉŘĽŸŕŶļſŰŔŁĹĿŞŃƋŻƆňşŮŮŰƏŦƓƑƗƕŋŗƏƚŚűƛŬš", (byte)53, 65);
               b[33] = NLoginCore_141.A("ğĽķğĵŀņŧŗŔŖŀīĺŨŉļŰŏťŬŢĶźŭĳŶŋŖşľŴųŠƁŚřŚőŉƊƇšŘƎŨřƌƏƓſŇŌƅƔƋƐƍŖƎũőƊŷƟŞŷźƥźŴƩƩŧƄƧſƐƑŭƝơƈƑŶƥżŽ", (byte)53, 65);
               b[34] = NLoginCore_433.E("ԠՈՕՊՁԬՎէիխզԹ", (byte)53, 69);
               b[35] = NLoginCore_471.A("ŘĳĝŃĠŒłřśŋŦı", (byte)53, 65);
               b[36] = NLoginCore_173.D("ҫҥӐңҽһӌӌҟӗҷӆҵҪҭһҺҲҚҽҟҺҧҨ", (byte)53, 68);
               b[37] = NLoginCore_433.C("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 67);
               b[38] = NLoginCore_138.F("ԤԢՀԤ՟աՀԾխԳԫԹ", (byte)53, 70);
               b[39] = NLoginCore_521.B("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 66);
               b[40] = NLoginCore_138.C("ҋҠӇҸӌӏӃҩҴҎҫӆүӊӇӚҜҶҸҳҘһҟӖӔӇӆҷӒҧӧӕҸӄӃӰҿӍҽӪӣӁӗӯӵӣӓӏҹӭӺӳӊӚӇӈ", (byte)53, 67);
               b[41] = NLoginCore_559.B("ŘŃĬĶŠňŝĺŪŨģı", (byte)53, 66);
               b[42] = NLoginCore_453.A("ŀĺťĸŒŐššĴŬŌśŊĿłŐŏŇįŒĴŏļĽ", (byte)53, 65);
               b[43] = NLoginCore_004.A("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 65);
               b[44] = NLoginCore_575.D("ӄҠҤұӈҎӆӀӆҔӁӇңӃҲҥӒҝҫӗҫӡҬҿӁһӏӨҥӀҽҤӡҹӍӁҩӭӅҬӐӭӥӑҸҸӈӯӰӭұӵӮӠӤӃӵԂԀӧӠӝԌӸ", (byte)53, 68);
               b[45] = NLoginCore_451.B("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 66);
               b[46] = NLoginCore_324.E("ԨԽդՕթլՠՆՑԫՊզՀխԴՎղգՋձ\u0558ՠյ՚ՍՙցպՖզֈշէօֈ՜օվբծ\u0590։֓ղբՒձցօՔ֊օֆէդե", (byte)53, 69);
               b[47] = NLoginCore_138.C("ҫҥӐңҽһӌӌҟӗҷӁҭӐӍӇҩҔқҝҫҝҾӝӞҼҾӧӁӘҢӫҽӏӫӡӑҬӠӜӶӁӍӎӯӉӒӷӥӐәӪӘӯӛӻҷԅӤӛӻәӠөӾӟԉӉӪԑԑԍӞӢӣӜ", (byte)53, 67);
               b[48] = NLoginCore_559.F("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 70);
               b[49] = NLoginCore_453.C(
                  "ҖӀҝ҆ґҋҦҴҍұӉӐӐӋһһҴҦӘҸһҝӠәӕӄӈұәҪҺӣӘҩӍӟӢӌӪӌӨӑӃҷӇӹӌҺӊӽӎӰҿӫӣҶӓҸҾӶӖӖӠәԁӗӉӡӼӱӅӿԇӨӑԀӸӷӨӷӖԆӺԡԒӳӞӜӶԗԨԑԚԈӡӿӣԢԪԡԩӱԐԢӽԢԣԗԮԭԔԮԔԜԱԷӺ\u0530ԇԈ", (byte)53, 67
               );
               b[50] = NLoginCore_521.C("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 67);
               b[51] = NLoginCore_173.B(
                  "ŃŌĬĴĿĥťĦśţĸĩļŚŁťŮĻŧįŗķŒŉŦŃźŏŭŪŶŕĹŕŤľŁŇŴŔŷƄřŨŋƅŞƅƃƂƃŶŰſŠůŘũƑƜŜƋſƐŽƐƚŶŘšƙŤƖƕƂŸƍūƞƠůƋŽƯƑƏƆƕƏŻƖŶƳźƌżƒƖƁƼǆƨƦƑƅƁƃƑ", (byte)53, 66
               );
               b[52] = NLoginCore_027.A("ŁřģŏŇĺňĦŦĸĽľĽħłřŚīœŢłŕŬůűŨŌĹŊŠřŉĽľŃŶƇĿŢŜŪųŕŻźšňƅũůşųűƅųųœƜƓŽųūſřŵơşŜţƤŞűŪţżű", (byte)53, 65);
               b[53] = NLoginCore_004.B("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 66);
               b[54] = NLoginCore_004.B(
                  "ŢęĝĞŤŤšřŤŪŔōļĺŪĻľņœŞŠĴĳŭűņŪŋžŝŰŮŐŭſŷĿŝżŜşŞƂŋŇƐŌŬŐŞŰŏűƊűťőŲƗŝŴƠƏƂŶŻŮơŸƧŸƔƕƆƜƣƄƋƍƢƏųƤƋƥƌƨůŴƔƖƜƕƩƮƊƚƵƱƦƾƑƀƅƓƊƥƋƟǎƎƾƞƑƳǋƶǐǁǔǚƬƹƖƧƵǑƝ",
                  (byte)53,
                  66
               );
               b[55] = NLoginCore_173.C("ҫҥӐңҽһӌӌҟӗҷӘҋӉҕҎӔҫҚҾӘӟҝҰӞӒӛҽҲӜҫӚӄҫҩӨҨӲӍӆҿӊӢәӳӧӹҮӈҶҿԁӸҹҺӐӖӃӞԄӢӃӬԃӖӮӦԅӦԀӪӌԋӭԍӜ", (byte)53, 67);
               b[56] = NLoginCore_397.A("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 65);
               b[57] = NLoginCore_091.D(
                  "ҚҧӏӑӑҬҊӉҋӎӍүҕҩҦӈӔҿӐҴҚӓӋӌӥӓүҠӁҧҴӥҨҨӁӦӨҨҲӑӞӬӵӂӱҷӖӝөӋӱӏӾӚӀӯӟӏӕԇԀӃҽӸӟӺԀӪӭӪԊԒӟԗԔӢәӪӭӸԆӳԎԏӪӚԢԓԅԐӢӷԥӦԚӥԩԁԁӻӺӤԥԁԃԌԲԨԘԌӸԦԫԌӿԈӻԚԇԈ", (byte)53, 68
               );
               b[58] = NLoginCore_559.F("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 70);
               b[59] = NLoginCore_091.E(
                  "Ո՞՟զզՍ՝ՆԺ՝իԴՉգաՕԴՆՒե՜ՎլոՍԼհռտՓՃջւ։փ֎՛Տոխ֍հեՒմ՟֓ագ֓պռպիղ՝\u058cաձ֡ծտՠ֚բ֛֨֔֬ւֱջ֦֮֫մ֎֡֕ֆֶ֧֛\u0590֭֟֩֓֔փտ֎־ֲֿ֣", (byte)53, 69
               );
               b[60] = NLoginCore_076.E(
                  "իՠՋբծ՝ԹեՁԪլկեէ\u0530\u0530ջէ՜ՉձԻՕհ\u0557ՖջՖ՛Րՙ\u0558ՙալլեք֎աէՓժէ՟հճ֊դֆ։ֈն՝ձ֔տհն֍կձ֖֟գ֧֜ֆ֯կզ֑֮֫֞֊֕֊կֆ֎֏ծֿ֭֭քօ", (byte)53, 69
               );
               b[61] = NLoginCore_451.E("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 69);
               b[62] = NLoginCore_091.D(
                  "ҬҋҮ҂ҺҎӈґҤҦӂҰҋӍҦүҵҵҹұӕҔӗӃүәҽһҾӈәӞӦӊӤӑӧӫӣӔҿӷӴӂӉӚӈӲӫӍҸӮӳӡӰәӀӑӷӶӧԉӁӡӢӷԅӞԄԐԐӮԒӟԋӓԏԃԃӬәӛӬԎԕӶӹӞԍԞԕӣӦԃԔԦӬԬԝԝԨ\u0530ԭԮӴԒԌԢӳӺԬԗӴӴԝԼԎԟԬԜӿԴԽӾԝԷՆՉԦԦԊԾԿՓԥՔԪԴԧԜ",
                  (byte)53,
                  68
               );
               b[63] = NLoginCore_004.B("ŀĺťĸŒŐššĴŬŌŖłťŢŜľĩİĲŀĲœŲųőœżŖŭķƀŒŤƀŶŦŁŵűƋŖŢţƄŞŧƌźťŮſŭƄŰƐŌƚŹŰƐŮŵžƓŴƞŞſƦƦƢųŷŸű", (byte)53, 66);
               b[64] = NLoginCore_427.C("ҊҀҦҠұҺҥҦҦҡҷҜ", (byte)53, 67);
               b[65] = NLoginCore_241.C("ҖӀҝ҆ґҋҦҴҍұӉӐӐӋһһҴҦӘҸһҢҟӕӒҟӦһӔӝӥӪӛһҥҩһҾӛӯӭӫӕӍӡөӊӓӓӊӇӭӎӿӱӷӴԃӢӝӪԅӂӉԆӝԏԀӥӭԔԎԅӳԉӜ", (byte)53, 67);
               b[66] = NLoginCore_173.A("ğĕĻĵņŏĺĻĻĶŌı", (byte)53, 65);
               b[67] = NLoginCore_530.D("ҮҷҗҟҪҐӐґӆӎңҔҧӅҬӐәҦӒҚӂҢҽҴӑҮӥҺӘӕӡӀҤӀӏҩҬҲӟҿӢӯӄӓҶӰӉӰӮӭӮӡӛӪӋӚӃӔӼԇӇӶӪӻӨӻԅӡӃӌԄӏԁԀӭӣӸӖԉԋӚӶӨԚӼӺӱԀӺӦԁӡԞӥӷӧӽԁӬԧԱԓԑӼӰӬӮӼ", (byte)53, 68);
               b[68] = NLoginCore_451.E("Չաԫ\u0557ՏՂՐԮծՀՅՆՅԯՊաբԳ՛ժՊ՝մշչհՔՁՒըաՑՅՆՋվ֏Շժդղջ՝փւթՐ֍ձշէջչ֍ջջ՛֤֛օջճևաս֩էդի֬զչղիքչ", (byte)53, 69);
               b[69] = NLoginCore_173.F("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 70);
               b[70] = NLoginCore_223.F(
                  "ժԡԥԦլլթալղ՜ՕՄՂղՃՆՎ՛զըԼԻյչՎղՓֆեոն\u0558յևտՇեքդէզ֊ՓՏ֘Քմ\u0558զո\u0557չ֒չխՙպ֟եռ֨֗֊վփն֩ր֯ր֜֝֎֤֫\u058c֪֓֕֗ջְ֭֬֓֔շռֱֶֹֽ֤֢֮֜֞֝֒׆֙ֈ֍֛֧֭֒֓ז֖׆ֻ֦֙ד־ט\u05c9לעִֽׁ֞֯י֥",
                  (byte)53,
                  70
               );
               b[71] = NLoginCore_027.F("ՈՂխՀ՚\u0558թթԼմՔյԨզԲԫձՈԷ՛յռԺՍջկո՚ՏչՈշաՈՆօՅ֏ժգ՜էտն\u0590ք֖ՋեՓ՜֞֕Ֆ\u0557խճՠջ֡տՠ։֠ճ\u058bփ֢փ֝ևթ֨֊֪չ", (byte)53, 70);
               b[72] = NLoginCore_530.E("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 69);
               b[73] = NLoginCore_027.A("įļŤŦŦŁğŞĠţŢńĪľĻŝũŔťŉįŧŧŷİĻŶŨŌũŻĹĽŎŌńƅƄŵŪƁŬŠŌƃƈřƏŨůūŎŶōœŭƏţŖżźƋŭŸŰżŵŝƕƞƙťžƁŧű", (byte)53, 65);
               b[74] = NLoginCore_559.F("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 70);
               b[75] = NLoginCore_110.F("Ո՞՟զզՍ՝ՆԺ՝իԴՉգաՕԴՆՒե՜ՎլոՍԼհռտՓՃջւ։փ֎՛Տոխ֍հեՒմ՟֓ագ֓պռպիղ՝\u058cաձ֡ծտՠ֚բ֛֨֔֬ւֱջ֦֮֫մ֎֡֕ֆֶ֧֛\u0590֭֟֩֓֔փտ֎־ֲֿ֣", (byte)53, 70);
               b[76] = NLoginCore_004.A("ţŘŃŚŦŕıŝĹĢŤŧŝşĨĨųşŔŁũĳōŨŏŎųŎœňőŐőřŤŤŝżƆřşŋŢşŗŨūƂŜžƁƀŮŕũƌŷŨŮƅŧũƎƗśƟƔžƧŧŞƦƣƉƖƂƍƂŧžƆƇŦƥƷƥżŽ", (byte)53, 65);
               b[77] = NLoginCore_173.F("ԧԝՃԽՎ\u0557ՂՃՃԾՔԹ", (byte)53, 70);
               b[78] = NLoginCore_110.E(
                  "ՉԨՋԟ\u0557ԫեԮՁՃ՟ՍԨժՃՌՒՒՖՎղԱմՠՌն՚\u0558՛ենջփէցծքֈրձ՜֑֔՟զշե֏ֈժՕ\u058b\u0590վ֍ն՝ծ֔֓ք֦՞վտ֢֔ջ֭֭֡\u058b֯ռ֨հ֬֠֠։նո։ֲ֖֫֓ջֲֻ֪րփֱ֠׃։\u05c9ֺֺׅ\u05cd\u05ca\u05cbֿ֑֯֩\u0590֗\u05c9ִֺ֑֑יּ֫\u05c9ֹ֜בךֺ֛הףצ׃׃֧כלװׂױׇבֹׄ",
                  (byte)53,
                  69
               );
               b[79] = NLoginCore_453.E("ՊԶՔբկԭՅդբէաՍՔՇծմխչջճպՌԻւ՝ոՍւՄոչՂջշմՈջըՐթձ\u058b֒ՒՖֈդ֚֒\u0590֓֗\u0558֝դե", (byte)53, 69);
               b[80] = NLoginCore_127.B("ŘĳĝŃĠŒłřśŋŦı", (byte)53, 66);
               b[81] = NLoginCore_027.E(
                  "ՈՂխՀ՚\u0558թթԼմ՜դբՊՀիպհՑխթԵ\u0557Օ՟դջյա՚փՒղօվ՚Պֆ՝՟փՎ\u058bտ՟նՖ֓֏֒՛։ճ֔սպ֡Օ֙բ՜֥֡ց֕ցև֠պ֧֞֠։֑֮ծ֧֤֊֑֏ְ֊ִֶ֕֟֜׀֙֞\u0590ׁֆ֣ց", (byte)53, 69
               );
               b[82] = NLoginCore_173.B("łĮŌŚŧĥĽŜŚşřŅŌĿŦŬťűųūŲŃŴŷŏĻŐŨŽŚŏžźŹœůŷƄŶŔŴƊƅŹŀƂŢŃńŦůŰūşŜŝ", (byte)53, 66);
               b[83] = NLoginCore_141.F("ՠԻԥՋԨ՚ՊագՓծԹ", (byte)53, 70);
               b[84] = NLoginCore_138.D("ҫҥӐңҽһӌӌҟӗҸҳҙӇӜҥӏҙҗҿҚҹҞӗӠҤҹӂӛҲӛҺҾҭҩҽҬҬӅӉӱӍҴӋӁҶӱҵӛөӷӜӛӶԄӺӢәӏӿӁәԅӣӌӊԐԃӫӨԔӴӫԆԀӕӒԚԜӯӚӼԒөԋԠԒԜӻԞӸӻԆԨԪӫ", (byte)53, 68);
               b[85] = NLoginCore_397.B("ĞĴķŕĽĸĠņĥļťľĥŜİŋīŒĿşŪţŭŨōňĳĻŘŪšųŁŽųŁŖńšłƊţƍŧƀžƇƈŐƉŜŕƈſƃŰŮŶƒŝƖƛƞş", (byte)53, 66);
               b[86] = NLoginCore_446.D("҅ҶӉӌ҈ӎҪӎҡҧҟҜ", (byte)53, 68);
               b[87] = NLoginCore_387.B("ĞĴķŕĽĸĠņĥļťľĥŜİŋīŒĿşŪţŭŨōňĳĻŘŪšųŁŽųŁŖńšłƊţƍŧƀžƇƈŐƉŜŕƈƀőƌƖŶƒŽƉƘūŝŸƌŖƟƁƥŚżŤƨťƗƊŷƂƫƨƮƏƋƕƔƣƊƚƪƊźƕƏŹƞ", (byte)53, 66);
               b[88] = NLoginCore_324.C("ҿҞҥҮҏҏӂӏҕӗҟӀҨҮҬҰҨӌҭӠҫҺҧҨ", (byte)53, 67);
               b[89] = NLoginCore_241.D("ң҅ӌӇӄӐӔӑӌҐӑҜ", (byte)53, 68);
               b[90] = NLoginCore_004.D("қӉҭӂӊҥҢӉӃӌҳҜ", (byte)53, 68);
               b[91] = NLoginCore_004.C("ҸҦӁҹҢҭқҤҎҧҎҜ", (byte)53, 67);
               b[92] = NLoginCore_530.E("ՒիԾԩՅԿթըբՒխխՠթիկգձեխկծ\u0558ՉշԻՂՠԾԹՓոշ\u058b՞ւվջտօդբղ\u058bճբրքխմե՝զ֗յչշ֠֎ք֡ք֓ռֈ֘փե֍֭ց֑֨իփ֑փցְֱֳַַ֣֏ևքօ", (byte)53, 69);
               b[93] = NLoginCore_027.F("՚ԩԸա\u0557ԭԼիՂՂՎԫՂԿՓՏՔՖոՔ՛սՄՅ", (byte)53, 70);
               b[94] = NLoginCore_076.E("ՊԶՔբկԭՅդբէաՍՔՇծմխչջճպՋռտ\u0557Ճ\u0558հօբ\u0557ֆնճյփֈՉՈհ՛ջ֕ե֊֕ՠ֊֑֔ծէ֓էըլց֚՜հ֟֔վգ", (byte)53, 69);
               b[95] = NLoginCore_384.C("ӃҞ҈ҮҋҽҭӄӆҶӑҜ", (byte)53, 67);
               b[96] = NLoginCore_173.A(
                  "ŀĺťĸŒŐššĴŬōňĮŜűĺŤĮĬŔįŊōźŤŊĴĸļŒŜřŋĺŢŕŢƅşŹŦţŷśŚŞņƈŉŎŦůŭƒŐƎŗƖŦŮŮƔŜƋřŞƝƛŘƙƩţżſſŨƊƄƮŨūƆƳŮűůƎŸƳƚŴŷưưſƋƛƖƁƶǇƦƲƦƼƻƶƑ", (byte)53, 65
               );
               b[97] = NLoginCore_384.E("ԻԾԨէկդԢ՝դծՔԹ", (byte)53, 69);
               break;
            case 1:
               b[0] = NLoginCore_127.D("ҕҾҾҭҿ҈ҐӉҢҎҫҜ", (byte)53, 68);
               b[1] = NLoginCore_092.E("\u0557ՠԞԸԧ՝ՅՃԫՅԳՅյՉՑկԶըԻՕՐ\u0557ՄՅ", (byte)53, 69);
               b[2] = NLoginCore_433.F("դՓ\u0557ԼԿՌ՞Ծ՚ՂմճՇ՟ՂգՈ\u0557\u0558նՎխՄՅ", (byte)53, 70);
               b[3] = NLoginCore_453.F("ԣաԬ՜Ձթ՝ԮղէՕԮՂԯՓՋմԸշԽիՇոՋՖպհՑ՞Ցֆ՜տևսցՈոՎՏՈ\u058b֊ՙ", (byte)53, 70);
               b[4] = NLoginCore_553.B("ŏŘĖİğŕĽĻģĽīŉřķĭŌİįŒŬŖŵļĽ", (byte)53, 66);
               b[5] = NLoginCore_110.D("ҸҪҢҰҤӎӃҪӅӗҫәӖӂӃҲҙӝҖҵҡӞӐӞҲҽӃҤӈҾӦӧӬӨӆӨӁӎӎӰӢӈӓҼ", (byte)53, 68);
               b[6] = NLoginCore_183.B("ŘĝŀłŃģŦőĠŝŭħŎįŊůŜłœţŖįĮœŸŘĺŰŻŔŗŏŴŢłşƇœŸŞšŬƅũřŧŭƊƆŻŞųőƔŭŤŹƆŨŚŰŹƝƛŢƟŝƅŮƗżƣƪƧŧƨƀưưƌƐƣƧƐƱƆƃƲƍƵƙƊƶżƋŷ", (byte)53, 66);
               b[7] = NLoginCore_004.F(
                  "ՔԨ՝զկլԪ՜հզՇնԿզՠ\u0530գղԮՑշ\u0558կժոՖՔսՄԿՕ֊ֈեֆզզֆՇջ֊և֑բ֊տՖմէխ՛զլհոծի֣֢փամ֔ռն֪֨ցև֤֥ի֧֏ֵս֔կ֘ֈ֏֩֎ֻ֨շջֺ־րֲ֮֟ւָ֕և֛֘ֆ\u05c8ְֲּּ֘\u05ccִ\u05cf֢׃֒יְ֖֧֭֗\u05c8ֲֻ֝֬־צררֽ",
                  (byte)53,
                  70
               );
               b[8] = NLoginCore_223.F("ՈՂխՀ՚\u0558թթԼմՔ՝իխխ\u0530\u0558ԻՏՈԽ՞ՊղՒԾԾՙւՖյւ՛\u058cևց֍ՠբՌՠՠ֎՝Տ։գձդՍ֏ժյիոլփ֛֜օշ֦֕֗", (byte)53, 70);
               b[9] = NLoginCore_201.E("ԼԵԻՆըզ՜ՆՐէՀԹ", (byte)53, 69);
               b[10] = NLoginCore_027.A(
                  "ŊĕįŞťřũłĺšĵĭĨĨĮűłŐšũŴŇœŃřŻżśļŖūļƀŬĺřņľşſňŇŇŽŢŞŠƂţśƁƆƄŐŔŋŕƆƇūŻŰƋſŘƌƁţƜžƢƧƒƥƤƢƃƠƭƠſƟƜƓűƷųƱŶƅƐƮƕŸƉƔơƓƳƻƛƄƶƶƝƄƺƑ", (byte)53, 65
               );
               b[11] = NLoginCore_004.B("īŋĤĽĦŤĹņŀģńı", (byte)53, 66);
               b[12] = NLoginCore_076.E(
                  "ՒԿզԾՍՌԮԹՎՠգնլթԵՆ՚ՒԼՙ\u0558ԹԷԷ՟ՍռՏ՟Հճ՞տգէքս\u0557֎թՎթՊէլժ\u0558քՓհ֚֗՜֗֔֎լհմխբճ֤֛֛֟բ֛֡չէֱղք֏ֲֳ֪֤֢֩֓մոոְ։׀׀ֱֻׂ֣֮֔\u05c8\u05c9ֺ֖֗\u05cb\u05ce֍ּׁ֧֭֨֜֨\u05ceהֻ\u05ccו׆֫ח֪֜֫פֹ֮֮֯ם֨",
                  (byte)53,
                  69
               );
               b[13] = NLoginCore_384.A("ōĿķŅĹţŘĿŚŬłĭŞřŊİįŎįĵįŢŒŰŪŬŲŞŋźšŰ", (byte)53, 65);
               b[14] = NLoginCore_232.D("Ӂ҆ҼӎҽҜҳӍӁӂӆҒҕҬҍҜҺӗҼӞӜәҬҖҡӜҲӑӚӚҼӍӠӅӦӘӋӫӰӢҮӴҿӖӌӹәӱҳӎӫӯһӍӶҾԀԅӴӿӃԋӛԂԂԄӛԋԒӾӥӱӕӎӴԖӋӯԛԄөӬԠӖԙԐӧӨ", (byte)53, 68);
               b[15] = NLoginCore_232.C("Ҫҩ҈ұӊҊӒғӖҲҵӂҲӗӍҜӉҫӉҙӋҪҧҨ", (byte)53, 67);
               b[16] = NLoginCore_138.F("ԵՀՆՆՈՄԫղժխԯԹ", (byte)53, 70);
               b[17] = NLoginCore_110.D(
                  "ҷҋӀӉӒӏҍҿӓӉҪәҢӉӃғӆӕґҴӚһӒӍӛҹҷӠҧҢҸӭӫӈөӉӉөҪӞӭӪӴӅӭӢҹӗӊӐҾӉӏӓӛӑӎԆԅӦӄӗӷӟәԍԋӤӪԇԈӎԊӲԘӠӷӒӻӫӲԌӱԞԋӚӞԝԡӣԑԂԕӥԛӸӪӾӻөԫԟӻԕԟԓԮԗӶԪӶԨԦӰԚӷԜԻԓՃԤԴԤԢՃԨԔԵ",
                  (byte)53,
                  68
               );
               b[18] = NLoginCore_453.E("ՈՂխՀ՚\u0558թթԼմՔ՝իխխ\u0530\u0558ԻՏՈԽ՞ՊղՒԾԾՙւՖյւ՛\u058cևց֍ՠբՌՠՠ֎՝Տ։գձդՍ֏ժյծ\u0557֕֜՚՜ճ֦֚էւ", (byte)53, 69);
               b[19] = NLoginCore_397.B("ķĕŞšĴĝĺġŒġŖı", (byte)53, 66);
               b[20] = NLoginCore_530.D("ҚҧӏӑӑҬҊӉҋӎӏӀҹӌҵӄғӏӛҾҳҹӗӁӏҜҞӀҲӜӂҼӠӏӚҸӅӧӞӧӞӄӊӎӺӐӓӜҴӹӷӈӕӔӮӃӲӵӏԁӂӗԁԍӾԄӜөԉԍԀӟԑӌӡөӘӺԓӮӗӧӾӯԎԁӴӞԂԅӱӸӿԪԅӦ", (byte)53, 68);
               b[21] = NLoginCore_241.C("Ӊ҄ҽ҇ҧҼғӈҪҕӉҜ", (byte)53, 67);
               b[22] = NLoginCore_324.B("ęŀţĸŏŧĿĸńŤŌı", (byte)53, 66);
               b[23] = NLoginCore_138.B("ŚŤŅŒĴřřŤŨŀĸı", (byte)53, 66);
               b[24] = NLoginCore_232.D(
                  "ҵҢӉҡҰүґҜұӃӆәӏӌҘҩҽҵҟҼһҜҚҚӂҰӟҲӂңӖӁӢӆӊӧӠҺӱӌұӌҭӊӏӍһӧҶӓӽӺҿӺӷӱӏӓӗӐӅӖԇӾԂӾӅӾԄӜӊԔӕӧӲԍԌӶԇԕԅԖӗӛӛԓӬԣԣӷԞԆԑԥԔԫԬԝӹӺԮԱӰԟԊԋӿԋԤԐԱԷԞԯԸԩԎԾ\u0530ԮԝԴԠԩԃԔՁԈ",
                  (byte)53,
                  68
               );
               b[25] = NLoginCore_553.F("ՃԿԞՁՁ\u0558ԻիկՁԭճ\u0557հնՊկժկէպՈԲԳւհՑՠՅր՝վՄևո՜ՉՁՇզՋ֓փ֎Րէննո֗ծ֛֙\u0557֘սլփ֕֎զբ֢֦֊շ֣֝֡է֣֡֫և\u058cչ", (byte)53, 70);
               b[26] = NLoginCore_397.A("ŐĞšőķŐĲĹĠŜĸŅĤľĻŨŌĽųŀŎŐŏŉŴŭňŇřŷĻļŎŷŘſƀŏƄžŚƅŚŘŖŊũƑŪœƒſŕƘŮŴƆŦŒƉƛƇƟƠŲƛƌşƓƣƚŢżƘžŵźťƬƊƁƍƇƌƀŵƣƍŷƺƦƭƮưƊƏ", (byte)53, 65);
               b[27] = NLoginCore_553.E("ՈՂխՀ՚\u0558թթԼմՔՒմԴՑլՈ՜կՍռՇՄՅ", (byte)53, 69);
               b[28] = NLoginCore_471.A("ĲĚĞĽŅŠĠĿŠĤģı", (byte)53, 65);
               b[29] = NLoginCore_183.E("ԹԶխԼՈՁՑՈձԬբԹ", (byte)53, 69);
               b[30] = NLoginCore_553.B("ıŠĽōŚĳśŗŋŚīı", (byte)53, 66);
               b[31] = NLoginCore_521.F("ԨԽդՕթլՠՆՑԫՈգՌէդշԹՓՕՐԵ\u0558ԼճձդգՔկՄքղՕաՠ֍՜ժ՚ևր՞ռը՟֏ևբե֛՚֛ճէդե", (byte)53, 70);
               b[32] = NLoginCore_027.F("ՃԿԞՁՁ\u0558ԻիկՁԭճ\u0557հնՊկժկէպՈԲԳւհՑՠՅր՝վՄևո՜ՉՁՇզՋ֓փ֎Րէննո֗ծ֛֙ՙշ\u0558ոք֣֖\u0590պ֢֝ՠբ֟փթֆիք֩ևկչ", (byte)53, 70);
               b[33] = NLoginCore_433.F("ԧՅԿԧԽՈՎկ՟՜՞ՈԳՂհՑՄո\u0557խմժԾւյԻվՓ՞էՆռջը։բաբՙՑ֒֏թՠ֖հա֛֔֗ևՏՔ֍֜֓֘֕՞֖ձՙ֒տ֧զտւ֭ւռֱֱկ֍ֳ֦֓֒֎յֈ֒ջ֭֘քօ", (byte)53, 70);
               b[34] = NLoginCore_397.E("Խԝա՚զիլԪՠՊՃԫԴԩՆԴհիծծԼՇՄՅ", (byte)53, 69);
               b[35] = NLoginCore_559.C("ҘҽһҹҹҋҦӕҢҕҧҜ", (byte)53, 67);
               b[36] = NLoginCore_530.C("ҫҥӐңҽһӌӌҟӗӀҴҤҳӃӐӓһӊӑӑӐҧҨ", (byte)53, 67);
               b[37] = NLoginCore_559.E("ՅԡԼՆխդզՍՇեԳԹ", (byte)53, 69);
               b[38] = NLoginCore_553.F("ԡԸԴԼԺ\u0558գՀԮԱԳԹ", (byte)53, 70);
               b[39] = NLoginCore_521.A("ĢļŞģŞĠŘĠĦŅĸı", (byte)53, 65);
               b[40] = NLoginCore_446.C("ҋҠӇҸӌӏӃҩҴҎҫӆүӊӇӚҜҶҸҳҘһҟӖӔӇӆҷӒҧӧӕҸӄӃӰҿӍҽӪӣӁӗӠӲӘӏҹӮӦӚӀӗӚӇӈ", (byte)53, 67);
               b[41] = NLoginCore_324.D("ҵҾҸҹҠҪӆҨҲҪӐҏӗҺӃӎӚҼҽүһҪҧҨ", (byte)53, 68);
               b[42] = NLoginCore_027.C("ҫҥӐңҽһӌӌҟӗҷӕӁӑҹӌӞҨҬұӗӐҧҨ", (byte)53, 67);
               b[43] = NLoginCore_004.C("Ү҉ққҤӊҳӑҎӑҷҜ", (byte)53, 67);
               b[44] = NLoginCore_397.B("řĵĹņŝģśŕśĩŖŜĸŘŇĺŧĲŀŬŀŶŁŔŖŐŤŽĺŕŒĹŶŎŢŖľƂŚŁťƂźŦōōŝƄƅƂņƊƃƂŶƎţũŒƑŗƏŪƔƖƁźƞŞŵƐƦƜƅƖű", (byte)53, 66);
               b[45] = NLoginCore_397.C("ӍҼӁҜӁһӒҴҤӄҷҜ", (byte)53, 67);
               b[46] = NLoginCore_530.A("ĠĵŜōšŤŘľŉģłŞĸťĬņŪśŃũŐŘŭŒŅőŹŲŎŞƀůşŽƀŔŽŶŚŦƈƁƌƂŎŧŚŎƌŞƆƊŏşŜŝ", (byte)53, 65);
               b[47] = NLoginCore_446.F(
                  "ՈՂխՀ՚\u0558թթԼմՔ՞ՊխժդՆԱԸԺՈԺ՛պջՙ՛ք՞յԿֈ՚լֈվծՉսչ֓՞ժի\u058cզկ֔ւխնևյ\u058cո֘Ք֢ցո֘նսֆժա֛ոը֘\u058cգ֎ְֱֲֵ֡\u058b֑պյ֩֓ֈ֗քօ", (byte)53, 70
               );
               b[48] = NLoginCore_575.C("Ӌ҄ҜҟҧӓһҰ҇ӓҖҜ", (byte)53, 67);
               b[49] = NLoginCore_521.F(
                  "Գ՝ԺԣԮԨՃՑԪՎզխխը\u0558\u0558ՑՃյՕ\u0558ԺսնղաեՎնՇ\u0557րյՆժռտթևթօծՠՔդ֖թ\u0557է֚ի֍՜ֈրՓհՕ՛֓ճճսն֞մզվ֙֎բ֤֜օծ֝֕֔օ֔ճ֣֗־֯\u0590ջչִַׅ֥֮֓վ֜րׇֿ־׆֎ֿֿׁ֭֚\u05cbִַ֪֑֫א֓ךֵ\u05cd֤֥",
                  (byte)53,
                  70
               );
               b[50] = NLoginCore_451.E("ԣՋՍթՍՂՈԿըՑժԹ", (byte)53, 69);
               b[51] = NLoginCore_471.E(
                  "ՋՔԴԼՇԭխԮգիՀԱՄբՉխնՃկԷ՟Կ՚ՑծՋւ\u0557յղվ՝Ձ՝լՆՉՏռ՜տ\u058cահՓ֍զ֍\u058b֊\u058bվոևըշՠձ֤֙դ֓և֘օ֢֘վՠթ֡լ֞֝֊ր֕ճ֦֨շ֓օַ֙֗֎֝֗փ֞վֻւ֔ք֪׆ּ֥֩֡֍֧֬֎֓֙",
                  (byte)53,
                  69
               );
               b[52] = NLoginCore_387.B("ŁřģŏŇĺňĦŦĸĽľĽħłřŚīœŢłŕŬůűŨŌĹŊŠřŉĽľŃŶƇĿŢŜŪųŕŻźšňƅũůşųűƅųųœƜƓŽųūſřƂŚŮŶŹƈƈƄŷƫŤŶŨūƦŹŻŻƝƲƦſżŽ", (byte)53, 66);
               b[53] = NLoginCore_553.B("ŝŀĚłĹŦħŉĲŪŚı", (byte)53, 66);
               b[54] = NLoginCore_110.F(
                  "ժԡԥԦլլթալղ՜ՕՄՂղՃՆՎ՛զըԼԻյչՎղՓֆեոն\u0558յևտՇեքդէզ֊ՓՏ֘Քմ\u0558զո\u0557չ֒չխՙպ֟եռ֨֗֊վփն֩ր֯ր֜֝֎֤֫\u058c֪֓֕֗ջְ֭֬֓֔շռֱֶֹֽ֤֢֮֜֞֝֒׆֙ֈ֍֛֧֭֒֓ז֖׆ֻ֦֙ד־זכס֫\u05cbמ\u05ce֯צַ֥",
                  (byte)53,
                  70
               );
               b[55] = NLoginCore_076.D("ҫҥӐңҽһӌӌҟӗҷӘҋӉҕҎӔҫҚҾӘӟҝҰӞӒӛҽҲӜҫӚӄҫҩӨҨӲӍӆҿӊӢәӳӧӹҮӈҶҿԁӸҹҺӐӖӃӞԄӢӃӬԃԁӤөӬӰӮԑԉӌӪԑӜ", (byte)53, 68);
               b[56] = NLoginCore_324.D("ӂҠ҇ҫҪҰғҒӁӓүҜ", (byte)53, 68);
               b[57] = NLoginCore_127.A(
                  "įļŤŦŦŁğŞĠţŢńĪľĻŝũŔťŉįŨŠšźŨńĵŖļŉźĽĽŖŻŽĽŇŦųƁƊŗƆŌūŲžŠƆŤƓůŕƄŴŤŪƜƕŘŒƍŴƏƕſƂſƟƧŴƬƩŷŮſƂƍƛƈƣƤſůƷƨƚƥŷƌƺŻƯźƾƖƖƐƏŹƺƖƘơǉƭƈƤưƭƠƥǀƦǆǕƜƝ", (byte)53, 65
               );
               b[58] = NLoginCore_521.A("ŊĮķĢŠŠĞĺŖĴģı", (byte)53, 65);
               b[59] = NLoginCore_091.B("ŀŖŗŞŞŅŕľĲŕţĬŁśřōĬľŊŝŔņŤŰŅĴŨŴŷŋĻųźƁŻƆœŇŰťƅŨŝŊŬŗƋřśƋŲŴŲţŪŕƄřũƙŦŷŘƒŚƠƌƓƤźƩųƞƦƣŬƆƙƍžƮƟƓƈƗưƩůŰƨƊƫƋƲŶƕ", (byte)53, 66);
               b[60] = NLoginCore_223.F(
                  "իՠՋբծ՝ԹեՁԪլկեէ\u0530\u0530ջէ՜ՉձԻՕհ\u0557ՖջՖ՛Րՙ\u0558ՙալլեք֎աէՓժէ՟հճ֊դֆ։ֈն՝ձ֔տհն֍կձ֖֟գ֧֜ֆ֯կզ֑֮֫֠֒֏օյ֭փֳ֥֗չֳ֕֠տּ֍ַָֽ֤֮", (byte)53, 70
               );
               b[61] = NLoginCore_324.C("ҞӇҞһҝҢҌҏҫҍҟҜ", (byte)53, 67);
               b[62] = NLoginCore_451.E(
                  "ՉԨՋԟ\u0557ԫեԮՁՃ՟ՍԨժՃՌՒՒՖՎղԱմՠՌն՚\u0558՛ենջփէցծքֈրձ՜֑֔՟զշե֏ֈժՕ\u058b\u0590վ֍ն՝ծ֔֓ք֦՞վտ֢֔ջ֭֭֡\u058b֯ռ֨հ֬֠֠։նո։ֲ֖֫֓ջֲֻ֪րփֱ֠׃։\u05c9ֺֺׅ\u05cd\u05ca\u05cbֿ֑֯֩\u0590֗\u05c9ִֺ֑֑יּ֫\u05c9ֹ֜בךֺ֛הףצׁ֤֞֫\u05ccןֻ\u05cfׇ֨\u05eeֹ",
                  (byte)53,
                  69
               );
               b[63] = NLoginCore_575.E("ՈՂխՀ՚\u0558թթԼմՔ՞ՊխժդՆԱԸԺՈԺ՛պջՙ՛ք՞յԿֈ՚լֈվծՉսչ֓՞ժի\u058cզկ֔ւխնևյ\u058cո֘Ք֢ցո֘նսֆգշ֩փ֝֟ժֆևֈծ\u0590ֳ֧֓կֱֲֲֽ֧֚քօ", (byte)53, 69);
               b[64] = NLoginCore_110.D("ӅҠқұґҦҼӇӊҰӕҜ", (byte)53, 68);
               b[65] = NLoginCore_451.B("īŕĲěĦĠĻŉĢņŞťťŠŐŐŉĻŭōŐķĴŪŧĴŻŐũŲźſŰŐĺľŐœŰƄƂƀŪŢŶžşŨŨşŜƂţƔƆƌƉƘŷŲſƚŗŞƠŞŚƤŻŽŷŲƝƚżű", (byte)53, 66);
               b[66] = NLoginCore_384.B("ĬĺŀĢřĳũťĥĩĴı", (byte)53, 66);
               b[67] = NLoginCore_427.C("ҮҷҗҟҪҐӐґӆӎңҔҧӅҬӐәҦӒҚӂҢҽҴӑҮӥҺӘӕӡӀҤӀӏҩҬҲӟҿӢӯӄӓҶӰӉӰӮӭӮӡӛӪӋӚӃӔӼԇӇӶӪӻӨӻԅӡӃӌԄӏԁԀӭӣӸӖԉԋӚӶӨԚӼӺӱԀӺӦԁӡԞӥӷӧӶӼӷԩӹӰԟԕԪԭӶӼ", (byte)53, 67);
               b[68] = NLoginCore_397.E("Չաԫ\u0557ՏՂՐԮծՀՅՆՅԯՊաբԳ՛ժՊ՝մշչհՔՁՒըաՑՅՆՋվ֏Շժդղջ՝փւթՐ֍ձշէջչ֍ջջ՛֤֛օջճևա֤֥֠֝իււִ֧֟ֈְָ֫֓֨֔յպֽ֦֬քօ", (byte)53, 69);
               b[69] = NLoginCore_397.A("ĬĿœšŕĻļŝĴīŦı", (byte)53, 65);
               b[70] = NLoginCore_387.B(
                  "ŢęĝĞŤŤšřŤŪŔōļĺŪĻľņœŞŠĴĳŭűņŪŋžŝŰŮŐŭſŷĿŝżŜşŞƂŋŇƐŌŬŐŞŰŏűƊűťőŲƗŝŴƠƏƂŶŻŮơŸƧŸƔƕƆƜƣƄƋƍƢƏųƤƋƥƌƨůŴƔƖƜƕƩƮƊƚƵƱƦƾƑƀƅƓƊƥƋƟǎƎƾƞƑƳǋƶǆƶƗǂǆƶǜƜǟƚƬ",
                  (byte)53,
                  66
               );
               b[71] = NLoginCore_076.D("ҫҥӐңҽһӌӌҟӗҷӘҋӉҕҎӔҫҚҾӘӟҝҰӞӒӛҽҲӜҫӚӄҫҩӨҨӲӍӆҿӊӢәӳӧӹҮӈҶҿԁӸҹҺӐӖӃӞԄӢӃӬԃԈӆӺԄӬӥӴԅӨӶԑӜ", (byte)53, 68);
               b[72] = NLoginCore_092.D("ҝӁҦҡҬҨғҒҵҔҧҜ", (byte)53, 68);
               b[73] = NLoginCore_521.F("ԷՄլծծՉԧզԨիժՌԲՆՃեձ՜խՑԷկկտԸՃվհՔձփՁՅՖՔՌ֍\u058cսղ։մըՔ\u058b\u0590ա֗հշճՖվՕ՛յ֗ի՞քւ֓յրջ։֙֗վը֢է֛ռְ֣֩շցկյ֖֩պ֭֩քօ", (byte)53, 70);
               b[74] = NLoginCore_427.A("ĲĜĞĶőŘśśħńĴı", (byte)53, 65);
               b[75] = NLoginCore_173.C("ҫӁӂӉӉҰӀҩҝӀӎҗҬӆӄҸҗҩҵӈҿұӏӛҰҟӓӟӢҶҦӞӥӬӦӱҾҲӛӐӰӓӈҵӗӂӶӄӆӶӝӟӝӎӕӀӯӄӔԄӑӢӃӽӅԋӷӾԏӥԔӞԉԑԎӗӱԄӸөԙԊӾӳԂԙԜԘӲԑԡԀӣԥԜӪ", (byte)53, 67);
               b[76] = NLoginCore_397.F(
                  "իՠՋբծ՝ԹեՁԪլկեէ\u0530\u0530ջէ՜ՉձԻՕհ\u0557ՖջՖ՛Րՙ\u0558ՙալլեք֎աէՓժէ՟հճ֊դֆ։ֈն՝ձ֔տհն֍կձ֖֟գ֧֜ֆ֯կզֲֲ֑֢֮֫֠֓ևփ֬֎֖֮ոְֹ֚֯տ֣֗տ֕ֈ", (byte)53, 70
               );
               b[77] = NLoginCore_575.F("ՊՔ՛բԪՁ՞ԫաԩժԹ", (byte)53, 70);
               b[78] = NLoginCore_201.E(
                  "ՉԨՋԟ\u0557ԫեԮՁՃ՟ՍԨժՃՌՒՒՖՎղԱմՠՌն՚\u0558՛ենջփէցծքֈրձ՜֑֔՟զշե֏ֈժՕ\u058b\u0590վ֍ն՝ծ֔֓ք֦՞վտ֢֔ջ֭֭֡\u058b֯ռ֨հ֬֠֠։նո։ֲ֖֫֓ջֲֻ֪րփֱ֠׃։\u05c9ֺֺׅ\u05cd\u05ca\u05cbֿ֑֯֩\u0590֗\u05c9ִֺ֑֑יּ֫\u05c9ֹ֜בךֺ֛הףצֵֻׂ֤נ֫\u05ccּ֮דֹ֫",
                  (byte)53,
                  69
               );
               b[79] = NLoginCore_141.D("ҭҙҷӅӒҐҨӇӅӊӄҰҷҪӑӗӐӜӞӖӝүҞӥӀӛҰӥҧӛӜҥӞӚӗҫӞӋҳӌӔӮӵӣӊӆҺӲӆӋҾһӌӻӭӐӿӄԇԀӵԊӞӆ", (byte)53, 68);
               b[80] = NLoginCore_173.F("թՆլբըզ\u0558ձ՛ճբԹ", (byte)53, 70);
               b[81] = NLoginCore_223.E(
                  "ՈՂխՀ՚\u0558թթԼմ՜դբՊՀիպհՑխթԵ\u0557Օ՟դջյա՚փՒղօվ՚Պֆ՝՟փՎ\u058bտ՟նՖ֓֏֒՛։ճ֔սպ֡Օ֙բ՜֥֡ց֕ցև֠պ֧֞֠։֑֮ծ֧֤֊֑֏ְ֊ֶ֕֝֝\u0590֜ւַքֲվ֛׃֥֩ւ֤֝\u05cfֱ֬ֈ֏֜֙",
                  (byte)53,
                  69
               );
               b[82] = NLoginCore_451.A("łĮŌŚŧĥĽŜŚşřŅŌĿŦŬťűųūŲŃŴŷŏĻŐŨŽŚŏžźŹœůŷƄŶŔŴƊƂƄŭũƅŻŊŰŐŝŌůŜŝ", (byte)53, 65);
               b[83] = NLoginCore_427.B("ĭŜłġĞŅŀśŤĹŖı", (byte)53, 66);
               b[84] = NLoginCore_471.D("ҫҥӐңҽһӌӌҟӗҸҳҙӇӜҥӏҙҗҿҚҹҞӗӠҤҹӂӛҲӛҺҾҭҩҽҬҬӅӉӱӍҴӋӁҶӱҵӛөӷӜӛӶԄӺӢәӏӿӁәԅӣӌӊԐԃӫӨԔӴӫԆԀӕӒԚԜӯӚӼԒөԋӘԖӖԗԝԕԀԚԅӨԀ", (byte)53, 68);
               b[85] = NLoginCore_027.E("ԦԼԿ՝ՅՀԨՎԭՄխՆԭդԸՓԳ՚ՇէղիյհՕՐԻՃՠղթջՉօջՉ՞ՌթՊ֒ի֕կֈֆ֏\u0590\u0558֑դ՝\u0590շՙՙռ֖դ֘՟ձև֘", (byte)53, 69);
               b[86] = NLoginCore_451.E("ի՛ԢբըՈԾ՝ՋԳԼԹ", (byte)53, 69);
               b[87] = NLoginCore_451.C("҉ҟҢӀҨңҋұҐҧӐҩҐӇқҶҖҽҪӊӕӎӘӓҸҳҞҦӃӕӌӞҬӨӞҬӁүӌҭӵӎӸӒӫөӲӳһӴӇӀӳӫҼӷԁӡӽӨӴԃӖӈӣӷӁԊӬԐӅӧӏԓӐԂӵӢӭԖԓԙӺӶԀԊԡԤԚӯԢӴԔӺӺԠ", (byte)53, 67);
               b[88] = NLoginCore_241.F("՜ԻՂՋԬԬ՟լԲմԿձՃՄԶՇ\u0558ոՔջ՟ՇՄՅ", (byte)53, 70);
               b[89] = NLoginCore_446.F("՚ՅլՀԸթգՉԪՔՎբՈՕՐՆիԶԻչՓսՄՅ", (byte)53, 70);
               b[90] = NLoginCore_387.D("ѿӉҊҰ҇ӏҏӉӓҦҟҜ", (byte)53, 68);
               b[91] = NLoginCore_530.C("ӂӌҜҩҢҮӏҩҟҠҡӖӓҚҙҖүӝӞҽҝҪҧҨ", (byte)53, 67);
               b[92] = NLoginCore_575.F("ՒիԾԩՅԿթըբՒխխՠթիկգձեխկծ\u0558ՉշԻՂՠԾԹՓոշ\u058b՞ւվջտօդբղ\u058bճբրքխմե՝զ֗յչշ֠֎ք֡ք֓ռֈ֘փե֍֭ց֑֨իփ֭փ\u058b֗ն֚֭֭֜֗֒քօ", (byte)53, 70);
               b[93] = NLoginCore_027.E("՚ԩԸա\u0557ԭԼիՂՂՌԫԨհոՌձէթժԷխՄՅ", (byte)53, 69);
               b[94] = NLoginCore_324.C("ҭҙҷӅӒҐҨӇӅӊӄҰҷҪӑӗӐӜӞӖӝҮӟӢҺҦһӓӨӅҺөәӖӘӦӫҬҫӓҾӞӸӈӭӸӃӭӷӴӑӊӶӑӘӣӭԃәӆԊӫԉԇ", (byte)53, 67);
               b[95] = NLoginCore_384.A("ĲĶĠķģőĢĺĻŧŌı", (byte)53, 65);
               b[96] = NLoginCore_451.D(
                  "ҫҥӐңҽһӌӌҟӗҸҳҙӇӜҥӏҙҗҿҚҵҸӥӏҵҟңҧҽӇӄҶҥӍӀӍӰӊӤӑӎӢӆӅӉұӳҴҹӑӚӘӽһӹӂԁӑәәӿӇӶӄӉԈԆӃԄԔӎӧӪӪӓӵӯԙӓӖӱԞәӜӚӹӣԞԅӟӢԛԛӪӶӦӭԊԁԐԛԲԋӮԟԱӼ", (byte)53, 68
               );
               b[97] = NLoginCore_110.B("ŘĵőĭĥŨŉŜŚķĸı", (byte)53, 66);
               break;
            case 2:
               b[0] = NLoginCore_530.D("҃ҼӍҝӂҋҤҡҎҮҶӂҶӄӇӖҸӟҨұӑҪҹӚӥҰҦӂҠҽӛӞ", (byte)53, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.A("ğœĢĝıġũŝŗŜģŇŭŰŧŌŠŰťĵŧōųŖūŘŭŴŞŬŲŴ", (byte)53, 65);
         }
      }
   }

   static {
      b();
   }

   @Nullable
   public String a(String var1, InetAddress var2, @Nullable Boolean var3) {
      long var4 = System.nanoTime();

      try {
         if (this.e.M()) {
            return NLoginCore_150.a(NLoginCore_487.R);
         } else if (this.e.a().b(var1, null)) {
            String[] var33 = new String[fd];
            var33[fe] = a(ff, fg);
            var33[fh] = a(fi, fj ^ fk);
            var33[fl] = a(fm, fn ^ fo);
            var33[fp] = a(fq, fr);
            var33[fs] = a(ft, fu ^ fv);
            return NLoginCore_112.a(var33);
         } else {
            if (NLoginCore_329.n.aP()) {
               NLoginCore_227 var6 = this.e.a();
               int var19 = var6.n();
               switch (var19) {
                  case 0:
                  case 1:
                  case 9:
                  case 23:
                     break;
                  case 8:
                  default:
                     String var29;
                     if (NLoginCore_150.j()) {
                        String[] var28 = new String[var_if];
                        var28[ig] = a(ih & ii, ij);
                        var28[ik] = a(il, im);
                        var28[in] = a(io, ip ^ iq);
                        var28[ir] = a(is, it);
                        var28[iu] = a(iv, iw);
                        var28[ix] = a(iy, iz);
                        var28[ja] = a(jb, jc ^ jd);
                        var28[je] = a(jf & jg, jh);
                        var29 = NLoginCore_112.a(var28);
                     } else {
                        String[] var30 = new String[ji];
                        var30[jj] = a(jk, jl);
                        var30[jm] = a(jn, jo ^ jp);
                        var30[jq] = a(jr, js ^ jt);
                        var30[ju] = a(jv, jw ^ jx);
                        var30[jy] = a(jz, ka ^ kb);
                        var30[kc] = a(kd, ke);
                        var30[kf] = a(kg, kh);
                        var30[ki] = a(kj, kk ^ kl);
                        var29 = NLoginCore_112.a(var30);
                     }

                     return var29;
                  case 15:
                     String var26;
                     if (NLoginCore_150.j()) {
                        String[] var10000 = new String[fw];
                        var10000[fx] = a(fy, fz);
                        var10000[ga] = a(gb, gc ^ gd);
                        var10000[ge] = a(gf, gg ^ gh);
                        var10000[gi] = a(gj, gk ^ gl);
                        var10000[gm] = a(gn, go ^ gp);
                        var10000[gq] = a(gr, gs ^ gt);
                        var10000[gu] = a(gv, gw);
                        var10000[gx] = a(gy, gz);
                        var26 = NLoginCore_112.a(var10000);
                     } else {
                        String[] var27 = new String[ha];
                        var27[hb] = a(hc, hd);
                        var27[he] = a(hf, hg ^ hh);
                        var27[hi] = a(hj, hk);
                        var27[hl] = a(hm, hn ^ ho);
                        var27[hp] = a(hq, hr ^ hs);
                        var27[ht] = a(hu, hv ^ hw);
                        var27[hx] = a(hy, hz ^ ia);
                        var27[ib] = a(ic & id, ie);
                        var26 = NLoginCore_112.a(var27);
                     }

                     return var26;
               }
            }

            NLoginInterface_031 var16 = this.e.b().a();
            NLoginCore_418 var20 = var16 instanceof NLoginCore_418 ? (NLoginCore_418)var16 : null;
            int var22 = var3 != null && var20 != null && var20.d() > 0 && var1.toLowerCase(Locale.ENGLISH).startsWith(var20.r().toLowerCase(Locale.ENGLISH))
               ? km
               : kn;
            if (!BCryptHashProvider.a().matcher(var1).matches() && (var22 == 0 || !var3 || !BCryptHashProvider.a().matcher(var1.substring(var20.d())).matches())) {
               return NLoginCore_150.a(NLoginCore_487.U);
            } else if (var22 != 0 && !var3) {
               NLoginCore_487 var32 = NLoginCore_487.V;
               Object[] var34 = new Object[kp];
               var34[kq] = var1;
               return NLoginCore_150.a(var32, var34);
            } else {
               NLoginCore_280 var23 = NLoginCore_073.a(var1, var2);
               if (var23 == NLoginCore_280.e) {
                  NLoginCore_073.a(this.e, var1, var2, NLoginCore_280.a);
                  NLoginCore_487 var31 = NLoginCore_487.aa;
                  Object[] var10001 = new Object[kr];
                  var10001[ks] = var1;
                  return NLoginCore_150.a(var31, var10001);
               } else {
                  return null;
               }
            }
         }
      } catch (Throwable var14) {
         NLoginCore_370.c(a(kt, ku) + var1 + a(kv & kw, kx), var14);
         return a(kz, la);
      } finally {
         NLoginCore_548.a(NLoginCore_425.b, var4);
      }
   }

   @Nullable
   protected String a(NLoginCore_277 var1, ForceRegisterConfig var2, String var3, InetSocketAddress var4, boolean var5, boolean var6, NLoginInterface_017 var7) {
      String var8 = var1.getName();
      if (var2.t() && var5 == 0) {
         NLoginCore_227 var9 = this.e.a();
         int var10 = var9.n();
         if (NLoginCore_329.n.ar() || !var2.s() && (var10 == q || var10 == r || var10 == s)) {
            int var11 = t;
            NLoginInterface_031 var12 = this.e.b().a();
            if (var12 instanceof NLoginCore_418) {
               NLoginCore_418 var13 = (NLoginCore_418)var12;
               FloodgatePlayer var14 = var13.a(var3, var4.getAddress().getHostAddress());
               if (var14 != null && var14.isLinked()) {
                  LinkedPlayer var15 = var14.getLinkedPlayer();
                  if (var15.getJavaUniqueId() != null && var15.getJavaUniqueId().equals(var2.getMojangId())) {
                     var5 = u;
                     var11 = v;
                  }
               }
            }

            if (var11 == 0) {
               if (var6) {
                  NLoginCore_487 var29 = NLoginCore_487.W;
                  Object[] var31 = new Object[w];
                  var31[x] = var3;
                  return NLoginCore_150.a(var29, var31);
               }

               NLoginCore_370.d(a(y, z ^ aa) + var8 + a(ab, ac));
               NLoginCore_370.d(a(ae & af, ag));
               String[] var28 = new String[ai];
               var28[aj] = a(ak, al ^ am);
               var28[an] = a(ao, ap);
               var28[aq] = a(ar & as, at);
               var28[au] = a(av, aw);
               var28[ax] = a(ay & az, ba);
               return NLoginCore_112.a(var28);
            }
         }
      }

      NLoginInterface_031 var16 = this.e.b().a();
      if (!var6 || !var16.J() && NLoginCore_329.m.ar()) {
         String var17 = var2.i();
         if (var17 != null && !var6 && !var3.equals(var17)) {
            NLoginCore_370.d(a(bb, bc) + var8 + a(bd, be) + var3 + a(bf, bg ^ bh) + var17 + a(bi, bj ^ bk));
            NLoginCore_370.d(a(bm & bn, bo));
            String[] var27 = new String[bq];
            var27[br] = a(bs & bt, bu);
            var27[bv] = a(bw, bx);
            var27[by] = a(bz, ca ^ cb) + var3 + a(cc, cd) + var17 + a(ce, cf);
            var27[cg] = a(ch, ci ^ cj);
            var27[ck] = a(cl, cm ^ cn);
            return NLoginCore_112.a(var27);
         }

         UUID var19 = var2.a();
         if (var2.h() && var19 == null) {
            String var22 = a(co, cp ^ cq) + var8 + a(cr & cs, ct);
            NLoginCore_370.d(var22);
            String[] var26 = new String[cv];
            var26[cw] = a(cx & cy, cz);
            var26[da] = a(db, dc);
            var26[dd] = a(de & df, dg) + var22;
            var26[dh] = a(di & dj, dk);
            var26[dl] = a(dm, dn);
            return NLoginCore_112.a(var26);
         }

         UUID var21 = var1.a();
         if (var19 != null && !var21.equals(var19)) {
            String var23 = a(var_do & dp, dq) + var8 + a(dr, ds ^ dt) + var21 + a(du, dv ^ dw) + var19 + a(dx, dy ^ dz);
            NLoginCore_370.d(var23);
            String[] var25 = new String[eb];
            var25[ec] = a(ed, ee);
            var25[ef] = a(eg, eh ^ ei);
            var25[ej] = a(ek, el ^ em) + var23;
            var25[en] = a(eo, ep ^ eq);
            var25[er] = a(es, et ^ eu);
            return NLoginCore_112.a(var25);
         }
      }

      String var18 = var4.getAddress().getHostAddress();
      Long var20 = var2.a().b(a(ev, ew ^ ex) + var18);
      if (var20 != null && System.currentTimeMillis() < var20) {
         NLoginCore_487 var24 = NLoginCore_487.S;
         Object[] var30 = new Object[ey];
         var30[ez] = NLoginCore_189.b(var20);
         return NLoginCore_150.a(var24, var30);
      } else if (!var2.u() || var16 != null && (var6 || !var16.J() && var2.s())) {
         this.e.a().a(var1, var2, var3, var4, (boolean)var5, var6, var7);
         return null;
      } else {
         NLoginCore_487 var10000 = NLoginCore_487.V;
         Object[] var10001 = new Object[fa];
         var10001[fb] = var8;
         return NLoginCore_150.a(var10000, var10001);
      }
   }

   public boolean a(NLoginCore_277 var1, @Nullable String var2) {
      try {
         return (boolean)(!this.e.a().b(var1) ? lb : lc);
      } catch (Throwable var4) {
         NLoginCore_370.c(a(ld, le) + var1.getName() + a(lf, lg ^ lh), var4);
         NLoginCore_150.a(var1, a(lj, lk ^ ll));
         return (boolean)ln;
      }
   }

   @Nullable
   public String a(NLoginCore_277 var1, String var2) {
      long var3 = System.nanoTime();

      try {
         if (var2.isEmpty()) {
            NLoginCore_150.a(var1, a(lo, lp ^ lq));
            return null;
         } else {
            String[] var5 = var2.split(a(ls, lt));
            if (var5.length == 0) {
               NLoginCore_150.a(var1, a(lu & lv, lw));
               return null;
            } else {
               String var16 = var5[ly].toLowerCase(Locale.ENGLISH);
               if (this.e.b().a() != NLoginCore_419.d
                  && (var16.equals(a(lz, ma ^ mb)) || var16.equals(a(mc, md ^ me)) || var2.contains(a(mf, mg)))
                  && var2.contains(a(mh & mi, mj))) {
                  NLoginCore_150.a(var1, a(mk & ml, mm));
                  return null;
               } else {
                  if (!this.e.a().b(var1)) {
                     boolean var7;
                     if (!this.e.i()) {
                        var7 = this.e.a().b(var16);
                     } else {
                        List var8 = NLoginCore_477.as.a(new Object[mo]);
                        var7 = var8.stream().noneMatch(var1x -> (boolean)(var1x.isEmpty() || !var1x.equals(a(nd, ne)) && !var16.equals(var1x) ? ng : nf));
                     }

                     if (var7) {
                        return null;
                     }
                  }

                  if (!this.e.i() && (var16.startsWith(a(mp, mq)) || this.e.a().a().stream().anyMatch(var16::equals)) && !var2.equals(var16)) {
                     var5 = Arrays.copyOfRange(var5, mr, var5.length);
                     this.e.a().b(var1).a(NLoginCore_567.j, var5);
                     return var16;
                  } else {
                     return var2;
                  }
               }
            }
         }
      } catch (Throwable var12) {
         NLoginCore_370.c(a(ms, mt ^ mu) + var1.getName() + a(mv, mw ^ mx), var12);
         NLoginCore_150.a(var1, a(mz, na ^ nb));
         return null;
      } finally {
         NLoginCore_548.a(NLoginCore_425.f, var3);
      }
   }

   protected void d(NLoginCore_277 var1) {
      LoginMainQueueTask.n(var1);
      NLoginCore_509 var2 = this.e.a().a(var1);
      if (var2 != null) {
         ForceRegisterConfig var3 = var2.a();
         if (var3.r()) {
            ArrayList var4 = new ArrayList();
            if (var2.a().b(NLoginCore_077.g)) {
               if (this.e.L()) {
                  NLoginType_010 var5 = this.e.c();
                  String var6 = var5.a(var1);
                  if (var6 != null) {
                     var3.a().a(a(f, g ^ h), var6);
                  }
               }

               var3.F();
               var4.add(NLoginCore_436.h);
            }

            if (var2.d(NLoginCore_567.B)) {
               var3.a().a(a(i & j, k), Boolean.valueOf((boolean)l));
            }

            NLoginCore_055 var7 = var2.a();
            if (var7 != null && var2.a().b(NLoginCore_077.f)) {
               var3.a().a(a(m, n ^ o), var7.cQ);
            }

            if (var3.a().E()) {
               var4.add(NLoginCore_436.l);
            }

            if (!var4.isEmpty()) {
               this.e.b((boolean)p).a(() -> this.e.a().a(var3, var4.toArray(new NLoginCore_436[nh])));
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 123L;
      var1 ^= -4888340829425325143L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(14 + 54),
                     (byte)(2 + 67),
                     (byte)(3 + 80),
                     (byte)(20 + 27),
                     (byte)(61 + 6),
                     (byte)(21 + 45),
                     (byte)(14 + 53),
                     (byte)(18 + 29),
                     (byte)(67 + 13),
                     (byte)(66 + 9),
                     (byte)(23 + 44),
                     (byte)(20 + 63),
                     (byte)(28 + 25),
                     (byte)(38 + 42),
                     (byte)(9 + 88),
                     (byte)(78 + 22),
                     (byte)(92 + 8),
                     105,
                     (byte)(53 + 57),
                     (byte)(6 + 97)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆЫйяѣўљђѡцѦѡѤзѦѦ", (byte)4, 65));
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
}
