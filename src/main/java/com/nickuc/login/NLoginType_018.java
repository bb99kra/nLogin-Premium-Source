package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.bukkit.auth.AuthenticateEvent;
import com.nickuc.login.api.event.internal.EventPlayer;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import com.nickuc.login.tasks.limbo.PlayerLimboProcessTask;
import com.nickuc.login.tasks.limbo.PlayerLimboRestoreTask;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.plugin.PluginManager;

public class NLoginType_018 {
   private static long fu = Long.reverse(6341847914664012992L);
   private static long it = Long.reverse(-7349094952542294848L);
   private static long cf = Long.reverse(-4467570830351532032L);
   private static long le = Long.reverse(-4467570830351532032L);
   private static int mb = (8 >>> 3 | 8 << ~3 + 1) & -1;
   private static int hb = 4194304 >>> 118 | 4194304 << -118;
   private static long jl = Long.reverse(-4467570830351532032L);
   private static long li = Long.reverse(-7349094952542294848L);
   private static long bd = Long.reverse(6341847914664012992L);
   private static long nv = Long.reverse(6341847914664012992L);
   private static int je = (-1 >>> 166 | -1 << -166) & -1;
   private static int ph = 15616 >>> 135 | 15616 << ~135 + 1;
   private static long cs = Long.reverse(-7349094952542294848L);
   private static int bu = (256 >>> 167 | 256 << ~167 + 1) & -1;
   private static long ek = Long.reverse(6341847914664012992L);
   private static int fe = 536870912 >>> 125 | 536870912 << -125;
   private static long mw = Long.reverse(6341847914664012992L);
   private static long mn = Long.reverse(6341847914664012992L);
   private static long oq = Long.reverse(-4467570830351532032L);
   private static long hf = Long.reverse(6341847914664012992L);
   private static long gq = Long.reverse(-7349094952542294848L);
   private static long fn = Long.reverse(-7349094952542294848L);
   private static int ft = (12 >>> 62 | 12 << -62) & -1;
   private static long ku = Long.reverse(-7349094952542294848L);
   private static int ex = (1024 >>> 202 | 1024 << -202) & -1;
   private static long ny = Long.reverse(-4467570830351532032L);
   private static long pp = Long.reverse(-4467570830351532032L);
   private static int aj = Integer.reverse(0);
   private static long ed = Long.reverse(-7349094952542294848L);
   private static int mt = Integer.reverse(536870912);
   private static long bk = Long.reverse(6341847914664012992L);
   private static int jw = 1006632961 >>> 122 | 1006632961 << ~122 + 1;
   private static long ld = Long.reverse(-7349094952542294848L);
   private static long fd = Long.reverse(6341847914664012992L);
   private static int dk = Integer.reverse(-134217728);
   private static int jt = (-2147483629 >>> 254 | -2147483629 << -254) & -1;
   private static int lg = 0 >>> 210 | 0 << ~210 + 1;
   private static int ad = (4096 >>> 204 | 4096 << -204) & -1;
   private static int bo = Integer.reverse(1879048192);
   private static long oh = Long.reverse(-7349094952542294848L);
   private static long az = Long.reverse(-7349094952542294848L);
   private static long nb = Long.reverse(-4467570830351532032L);
   private static long db = Long.reverse(-4467570830351532032L);
   private static long nh = Long.reverse(-4467570830351532032L);
   private static long dm = Long.reverse(-4467570830351532032L);
   private static int nm = (1712 >>> 164 | 1712 << ~164 + 1) & -1;
   private final Cache<NLoginCore_277, Object> d;
   private static long gb = Long.reverse(-4467570830351532032L);
   private static int lc = 47710208 >>> 147 | 47710208 << ~147 + 1;
   private static int mg = Integer.reverse(0);
   private static int be = 0 >>> 166 | 0 << -166;
   private static int my = Integer.reverse(1073741824);
   private static float iw = Float.intBitsToFloat(Integer.reverse(514));
   private static int gp = Integer.reverse(-335544320);
   private static int pn = Integer.reverse(1040187392);
   private static int by = (544 >>> 165 | 544 << -165) & -1;
   private static int pk = Integer.reverse(-570425344);
   private static int kb = Integer.reverse(-1979711488);
   private static int lr = Integer.reverse(100663296);
   private static int dc = Integer.reverse(939524096);
   private static long am = Long.reverse(1281274093986906112L);
   private static int gl = (-1 >>> 99 | -1 << ~99 + 1) & -1;
   private static long lb = Long.reverse(-4467570830351532032L);
   private static int oa = (58720256 >>> 83 | 58720256 << ~83 + 1) & -1;
   private static int jr = Integer.reverse(-1);
   private long d;
   private static int ja = Integer.reverse(301989888);
   private static long dd = Long.reverse(6341847914664012992L);
   private static long pd = Long.reverse(-4467570830351532032L);
   private static int nw = (2013265923 >>> 59 | 2013265923 << ~59 + 1) & -1;
   private static int co = Integer.reverse(-402653184);
   private static int jd = Integer.reverse(-1845493760);
   private static int bp = Integer.reverse(-1);
   private static long ll = Long.reverse(6341847914664012992L);
   private static int nl = (0 >>> 228 | 0 << ~228 + 1) & -1;
   private static int bs = Integer.reverse(-268435456);
   private static long lj = Long.reverse(-4467570830351532032L);
   private static long jf = Long.reverse(6341847914664012992L);
   private static int lf = Integer.reverse(0);
   private static int md = 202752 >>> 139 | 202752 << -139;
   private static long ib = Long.reverse(6341847914664012992L);
   private static int cm = -2147483643 >>> 254 | -2147483643 << -254;
   private static long gr = Long.reverse(-4467570830351532032L);
   private static int dn = (0 >>> 154 | 0 << ~154 + 1) & -1;
   private static int lw = Integer.reverse(1174405120);
   private static int dq = (528 >>> 228 | 528 << ~228 + 1) & -1;
   private static int ak = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static int br = 4194304 >>> 182 | 4194304 << -182;
   private static int v = 0 >>> 150 | 0 << -150;
   private static long gv = Long.reverse(-7349094952542294848L);
   private static int gk = (444596224 >>> 151 | 444596224 << ~151 + 1) & -1;
   private static int es = Integer.reverse(1073741824);
   private static int fj = (5898240 >>> 177 | 5898240 << ~177 + 1) & -1;
   private static int lk = -1174405120 >>> 121 | -1174405120 << ~121 + 1;
   private static int kl = 10880 >>> 199 | 10880 << -199;
   private static long u = Long.reverse(-4467570830351532032L);
   private static int s = Integer.reverse(536870912);
   private static int mp = 64 >>> 69 | 64 << -69;
   private static final long c = 15000L;
   private static int m = -1 >>> 157 | -1 << ~157 + 1;
   private static long fk = Long.reverse(-7349094952542294848L);
   private static long no = Long.reverse(-4467570830351532032L);
   private static long bh = Long.reverse(6341847914664012992L);
   private static int x = Integer.reverse(-570425344);
   private static int gd = Integer.reverse(-1);
   private static int oo = (58 >>> 255 | 58 << -255) & -1;
   private static long im = Long.reverse(-7349094952542294848L);
   private static long lq = Long.reverse(-4467570830351532032L);
   private static long ne = Long.reverse(6341847914664012992L);
   private static int gs = Integer.reverse(Integer.MIN_VALUE);
   private static long ng = Long.reverse(-7349094952542294848L);
   private static long nk = Long.reverse(6341847914664012992L);
   private static long go = Long.reverse(6341847914664012992L);
   private static int fh = -1 >>> 109 | -1 << -109;
   private static int oe = Integer.reverse(-1);
   private static int lz = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static long in = Long.reverse(-4467570830351532032L);
   private static int or = Integer.reverse(0);
   private static long ls = Long.reverse(-7349094952542294848L);
   private static long nt = Long.reverse(6341847914664012992L);
   private static int fv = (0 >>> 232 | 0 << ~232 + 1) & -1;
   private static int var_do = 134217728 >>> 86 | 134217728 << -86;
   private static int gj = 0 >>> 194 | 0 << -194;
   private static int fp = Integer.reverse(0);
   private static int z = 125 >>> 224 | 125 << -224;
   private static long iu = Long.reverse(-4467570830351532032L);
   private static int an = Integer.reverse(-536870912);
   private static long du = Long.reverse(-7349094952542294848L);
   private static long la = Long.reverse(-7349094952542294848L);
   private static long ev = Long.reverse(-7349094952542294848L);
   private static int kt = Integer.reverse(436207616);
   private static int ca = Integer.reverse(1207959552);
   private static long er = Long.reverse(1827335548805578752L);
   private final NLoginCore_504 a = new NLoginCore_504(this);
   private static int ef = Integer.reverse(1677721600);
   private byte[] a;
   private static long fo = Long.reverse(-4467570830351532032L);
   private static long jo = Long.reverse(-7349094952542294848L);
   private static long hk = Long.reverse(-7349094952542294848L);
   private static int au = Integer.reverse(0);
   private static int kf = Integer.reverse(-1);
   private static int ni = Integer.reverse(1442840576);
   private static int fx = -1 >>> 106 | -1 << -106;
   private static long ds = Long.reverse(6341847914664012992L);
   private static long oy = Long.reverse(-4467570830351532032L);
   private static int fb = Integer.reverse(-738197504);
   private static long at = Long.reverse(-4467570830351532032L);
   private static float iv = Float.intBitsToFloat(67008 >>> 18 | 67008 << ~18 + 1);
   private static long ht = Long.reverse(-7349094952542294848L);
   private static int aa = Integer.reverse(-1610612736);
   private static long oi = Long.reverse(-4467570830351532032L);
   private static int l = (536870912 >>> 220 | 536870912 << ~220 + 1) & -1;
   private static long as = Long.reverse(-7349094952542294848L);
   private static int ju = Integer.reverse(-1);
   private static long kv = Long.reverse(-4467570830351532032L);
   private static int ma = 0 >>> 198 | 0 << ~198 + 1;
   private static int gu = Integer.reverse(469762048);
   private static long jv = Long.reverse(6341847914664012992L);
   private static int hc = 131072 >>> 209 | 131072 << -209;
   private static long dl = Long.reverse(-7349094952542294848L);
   private static int mc = (0 >>> 160 | 0 << -160) & -1;
   private static int cr = Integer.reverse(402653184);
   private static int jj = (307200 >>> 172 | 307200 << -172) & -1;
   private static long ho = Long.reverse(-4467570830351532032L);
   private static long pj = Long.reverse(6341847914664012992L);
   private static long pm = Long.reverse(-4467570830351532032L);
   private static int on = Integer.reverse(318767104);
   private static int hp = (0 >>> 240 | 0 << -240) & -1;
   private static int hq = Integer.reverse(2080374784);
   private static int jg = Integer.reverse(1375731712);
   private static int aq = Integer.reverse(0);
   private static int hw = Integer.reverse(33554432);
   private static int el = Integer.reverse(335544320);
   private static int gt = (0 >>> 178 | 0 << ~178 + 1) & -1;
   private static long bx = Long.reverse(-4467570830351532032L);
   private static int jm = Integer.reverse(0);
   private static int pr = Integer.reverse(-1107296256);
   private static int ao = -1 >>> 74 | -1 << -74;
   private static int jq = 20185088 >>> 146 | 20185088 << ~146 + 1;
   private static long hu = Long.reverse(-4467570830351532032L);
   private static int cx = Integer.reverse(1476395008);
   private static long gw = Long.reverse(-4467570830351532032L);
   private static long cb = Long.reverse(-7349094952542294848L);
   private static int fw = (1644167168 >>> 249 | 1644167168 << ~249 + 1) & -1;
   private static int hz = Integer.reverse(-2113929216);
   private static int lx = (-1 >>> 55 | -1 << ~55 + 1) & -1;
   private final Timer a;
   private static int nj = -1 >>> 85 | -1 << ~85 + 1;
   private static long cv = Long.reverse(6341847914664012992L);
   private static long ce = Long.reverse(-7349094952542294848L);
   private static int ec = 151552 >>> 204 | 151552 << ~204 + 1;
   private static int ii = 134 >>> 1 | 134 << -1;
   private static long eb = Long.reverse(-4467570830351532032L);
   private static long bt = Long.reverse(6341847914664012992L);
   private static int nd = (-1 >>> 68 | -1 << -68) & -1;
   private static int ez = (1 >>> 31 | 1 << ~31 + 1) & -1;
   private static long kx = Long.reverse(6341847914664012992L);
   private static long r = Long.reverse(-4467570830351532032L);
   private static int mz = Integer.reverse(-436207616);
   private static long hr = Long.reverse(6341847914664012992L);
   private static long ks = Long.reverse(-4467570830351532032L);
   private final AtomicLong a = new AtomicLong();
   private final File c;
   private static long om = Long.reverse(-4467570830351532032L);
   private static int ms = (6 >>> 97 | 6 << ~97 + 1) & -1;
   private static int ov = (0 >>> 211 | 0 << ~211 + 1) & -1;
   private static int kh = (664 >>> 227 | 664 << ~227 + 1) & -1;
   private static int hv = (8388608 >>> 247 | 8388608 << -247) & -1;
   private static long ag = Long.reverse(-7349094952542294848L);
   private static long hl = Long.reverse(-4467570830351532032L);
   private static int lm = Integer.reverse(2046820352);
   private static long of = Long.reverse(6341847914664012992L);
   private static int dz = (294912 >>> 237 | 294912 << -237) & -1;
   private static int oz = 7798784 >>> 240 | 7798784 << -240;
   private static int bn = Integer.reverse(0);
   private static int og = Integer.reverse(1308622848);
   private static int fq = (-268435454 >>> 124 | -268435454 << ~124 + 1) & -1;
   private static int jn = Integer.reverse(838860800);
   private static long ol = Long.reverse(-7349094952542294848L);
   private static int eo = Integer.reverse(-1811939328);
   private static long ka = Long.reverse(6341847914664012992L);
   private static String[] b = new String[pr];
   private static int ok = (964689920 >>> 119 | 964689920 << -119) & -1;
   private static long jb = Long.reverse(-7349094952542294848L);
   private static long h = Long.reverse(-7349094952542294848L);
   private static int pe = 2030043136 >>> 184 | 2030043136 << -184;
   private static int nr = (-2147483594 >>> 63 | -2147483594 << -63) & -1;
   private static long kr = Long.reverse(-7349094952542294848L);
   private static long gy = Long.reverse(6341847914664012992L);
   private static int kj = 'ꠀ' >>> 137 | 43008 << ~137 + 1;
   private static int jz = (1342177280 >>> 152 | 1342177280 << ~152 + 1) & -1;
   private static long dy = Long.reverse(6341847914664012992L);
   private static long mf = Long.reverse(-4467570830351532032L);
   private static long ew = Long.reverse(-4467570830351532032L);
   private static long em = Long.reverse(-7349094952542294848L);
   private static long fi = Long.reverse(6341847914664012992L);
   private static long ly = Long.reverse(6341847914664012992L);
   private static long hy = Long.reverse(-4467570830351532032L);
   private static long hi = Long.reverse(-4467570830351532032L);
   private static int nc = Integer.reverse(369098752);
   private static int al = Integer.reverse(-570425344);
   private static int hj = Integer.reverse(1006632960);
   private static int ns = (-1 >>> 217 | -1 << ~217 + 1) & -1;
   private static long mr = Long.reverse(6341847914664012992L);
   private static long q = Long.reverse(-7349094952542294848L);
   private static long bq = Long.reverse(6341847914664012992L);
   private static int is = 8960 >>> 7 | 8960 << ~7 + 1;
   private final Cache<Long, CompletableFuture<JSONObject>> e;
   private static int ch = (163840 >>> 109 | 163840 << -109) & -1;
   private static long po = Long.reverse(-7349094952542294848L);
   private static int ix = (0 >>> 92 | 0 << -92) & -1;
   private final Cache<NLoginCore_277, Set<byte[]>> c;
   private static int fg = Integer.reverse(872415232);
   private static int bb = Integer.reverse(0);
   private static int ke = Integer.reverse(1241513984);
   private static long jc = Long.reverse(-4467570830351532032L);
   private static long df = Long.reverse(-7349094952542294848L);
   private static long gm = Long.reverse(6341847914664012992L);
   private static long jh = Long.reverse(-7349094952542294848L);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static long pa = Long.reverse(6341847914664012992L);
   private static int af = 3072 >>> 233 | 3072 << -233;
   private static float var_if = Float.intBitsToFloat(Integer.reverse(3714));
   private static long kd = Long.reverse(-4467570830351532032L);
   private static int gx = 29184 >>> 169 | 29184 << ~169 + 1;
   private static int ar = (256 >>> 197 | 256 << ~197 + 1) & -1;
   private static long jp = Long.reverse(-4467570830351532032L);
   private static int hg = 236 >>> 98 | 236 << -98;
   private static int bv = 64 >>> 226 | 64 << ~226 + 1;
   private static long eg = Long.reverse(-7349094952542294848L);
   private final nLoginBukkit o;
   private static long dp = Long.reverse(6341847914664012992L);
   private static int mv = Integer.reverse(-1);
   private static int ey = 0 >>> 220 | 0 << ~220 + 1;
   private static long iq = Long.reverse(-7349094952542294848L);
   private static float ig = Float.intBitsToFloat((263168 >>> 52 | 263168 << -52) & -1);
   private static int g = Integer.reverse(0);
   private static int ha = Integer.reverse(0);
   private static long ir = Long.reverse(-4467570830351532032L);
   private static int gc = 805306371 >>> 220 | 805306371 << -220;
   private static int pi = -1 >>> 205 | -1 << ~205 + 1;
   private static long me = Long.reverse(-7349094952542294848L);
   private static long dj = Long.reverse(-4467570830351532032L);
   private static long ga = Long.reverse(-7349094952542294848L);
   private static int mk = Integer.reverse(0);
   private static long en = Long.reverse(-4467570830351532032L);
   private static long jy = Long.reverse(6341847914664012992L);
   private static long kg = Long.reverse(6341847914664012992L);
   private static long cc = Long.reverse(-4467570830351532032L);
   private static long lt = Long.reverse(-4467570830351532032L);
   private static int av = (288 >>> 101 | 288 << ~101 + 1) & -1;
   private static long ee = Long.reverse(-4467570830351532032L);
   private static int ob = -1 >>> 35 | -1 << ~35 + 1;
   private static long hh = Long.reverse(-7349094952542294848L);
   private final AtomicLong b;
   private static int io = 0 >>> 47 | 0 << -47;
   private static int cd = 19922944 >>> 52 | 19922944 << ~52 + 1;
   private static int nz = 0 >>> 99 | 0 << -99;
   private static long cl = Long.reverse(-4467570830351532032L);
   private static String[] a = new String[NLoginType_018.pq];
   private static int id = Integer.reverse(-1);
   private static int mj = '쀀' >>> '-' | 49152 << -45;
   private static long bw = Long.reverse(-7349094952542294848L);
   private static long da = Long.reverse(-7349094952542294848L);
   private static long gh = Long.reverse(6341847914664012992L);
   private static long o = Long.reverse(640637046993453056L);
   private static int gn = Integer.reverse(1811939328);
   private static int cu = (819200 >>> 15 | 819200 << -15) & -1;
   private static int fm = Integer.reverse(1946157056);
   private static int bl = 0 >>> 65 | 0 << ~65 + 1;
   private static int kz = (368640 >>> 140 | 368640 << ~140 + 1) & -1;
   private static long fl = Long.reverse(-4467570830351532032L);
   private static long e;
   private static int pq = Integer.reverse(-1107296256);
   private static int dt = 1140850688 >>> 25 | 1140850688 << ~25 + 1;
   private static long ct = Long.reverse(-4467570830351532032L);
   private static long iz = Long.reverse(6341847914664012992L);
   private static int ot = Integer.reverse(-1);
   private static int nf = 105 >>> 192 | 105 << -192;
   private static int ko = 1610612741 >>> 188 | 1610612741 << ~188 + 1;
   private static long eh = Long.reverse(-4467570830351532032L);
   private static long ax = Long.reverse(-4467570830351532032L);
   private static long hx = Long.reverse(-7349094952542294848L);
   private static int ia = (-1 >>> 68 | -1 << -68) & -1;
   private static int gz = (16 >>> 228 | 16 << -228) & -1;
   private static int ae = (0 >>> 7 | 0 << -7) & -1;
   private static int dh = Integer.reverse(2013265920);
   private static int he = Integer.reverse(-1);
   private static long n = Long.reverse(6341847914664012992L);
   private static long ik = Long.reverse(-4467570830351532032L);
   private static int mh = Integer.reverse(Integer.MIN_VALUE);
   private static long bz = Long.reverse(6341847914664012992L);
   private static int dr = Integer.reverse(-1);
   private static int gg = Integer.reverse(-1);
   private static int np = 56623104 >>> 83 | 56623104 << -83;
   private static long kk = Long.reverse(6341847914664012992L);
   private static int fc = Integer.reverse(-1);
   private static int mi = Integer.reverse(1610612736);
   private static int hm = Integer.reverse(-1140850688);
   private static int hd = Integer.reverse(1543503872);
   private static int od = Integer.reverse(-1912602624);
   private static long lv = Long.reverse(6341847914664012992L);
   private static long fy = Long.reverse(6341847914664012992L);
   private static long pc = Long.reverse(-7349094952542294848L);
   private static int bf = (24576 >>> 203 | 24576 << -203) & -1;
   private static int bi = 3407872 >>> 210 | 3407872 << -210;
   private static int dw = (560 >>> 132 | 560 << -132) & -1;
   private static int ic = -2080374784 >>> 185 | -2080374784 << ~185 + 1;
   private static int cw = Integer.reverse(0);
   private static int gf = (3328 >>> 6 | 3328 << -6) & -1;
   private static long fs = Long.reverse(-4467570830351532032L);
   private static int cp = Integer.reverse(-1);
   private static long k = Long.reverse(6341847914664012992L);
   private static int ip = Integer.reverse(-1577058304);
   private static int bg = Integer.reverse(-1);
   private static long js = Long.reverse(6341847914664012992L);
   private static long ac = Long.reverse(-4467570830351532032L);
   private static long ci = Long.reverse(6341847914664012992L);
   private static long fr = Long.reverse(-7349094952542294848L);
   private static int fz = -939524096 >>> 122 | -939524096 << -122;
   private final Object a;
   private static int gi = 1048576 >>> 244 | 1048576 << -244;
   private static long pg = Long.reverse(6341847914664012992L);
   private static int mx = (5242880 >>> 20 | 5242880 << -20) & -1;
   private static long ge = Long.reverse(6341847914664012992L);
   private static int pf = -1 >>> 10 | -1 << ~10 + 1;
   private static int ei = Integer.reverse(-469762048);
   private static long ji = Long.reverse(-4467570830351532032L);
   private static long cy = Long.reverse(6341847914664012992L);
   private static int nu = 57671680 >>> 19 | 57671680 << ~19 + 1;
   private static int bj = Integer.reverse(-1);
   private static int cg = Integer.reverse(0);
   private static long op = Long.reverse(-7349094952542294848L);
   private static long ba = Long.reverse(-4467570830351532032L);
   private static int cz = 226492416 >>> 23 | 226492416 << ~23 + 1;
   private static int w = 0 >>> 0 | 0 << -0;
   private static int lh = (192937984 >>> 245 | 192937984 << ~245 + 1) & -1;
   private static int il = 2176 >>> 5 | 2176 << -5;
   private static long ck = Long.reverse(-7349094952542294848L);
   private static long kp = Long.reverse(6341847914664012992L);
   private static long kc = Long.reverse(-7349094952542294848L);
   private static long dg = Long.reverse(-4467570830351532032L);
   private static int eu = (88080384 >>> 181 | 88080384 << ~181 + 1) & -1;
   private static long ou = Long.reverse(6341847914664012992L);
   private static long ij = Long.reverse(-7349094952542294848L);
   private static long jk = Long.reverse(-7349094952542294848L);
   private static int bm = Integer.reverse(-1073741824);
   private static int kq = Integer.reverse(-369098752);
   private static long cn = Long.reverse(6341847914664012992L);
   private static int hs = Integer.reverse(-67108864);
   private static long ah = Long.reverse(-4467570830351532032L);
   private static int os = Integer.reverse(-1375731712);
   private static long ap = Long.reverse(6341847914664012992L);
   private static long ea = Long.reverse(-7349094952542294848L);
   private static long nx = Long.reverse(-7349094952542294848L);
   private static long kn = Long.reverse(6341847914664012992L);
   private static int dx = Integer.reverse(-1);
   private static long nn = Long.reverse(-7349094952542294848L);
   private static long ki = Long.reverse(6341847914664012992L);
   private static long i = Long.reverse(-4467570830351532032L);
   private static int lu = Integer.reverse(-2046820352);
   private static int ep = Integer.reverse(-1);
   private static long a = Long.reverse(-5476377146882523136L);
   private static long ox = Long.reverse(-7349094952542294848L);
   private static int jx = -1 >>> 211 | -1 << ~211 + 1;
   private static long pl = Long.reverse(-7349094952542294848L);
   private static long hn = Long.reverse(-7349094952542294848L);
   private static int ai = (Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << ~95 + 1) & -1;
   private static int mm = -1 >>> 38 | -1 << ~38 + 1;
   private static int et = Integer.reverse(0);
   private static int ff = Integer.reverse(Integer.MIN_VALUE);
   private static long na = Long.reverse(-7349094952542294848L);
   private static int pb = (2013265920 >>> 56 | 2013265920 << -56) & -1;
   private static int km = Integer.reverse(-1);
   private static long eq = Long.reverse(6341847914664012992L);
   private static long ln = Long.reverse(6341847914664012992L);
   private static int iy = Integer.reverse(-503316480);
   private static long cq = Long.reverse(6341847914664012992L);
   private static int mq = Integer.reverse(-1509949440);
   private static int mu = 835584 >>> 77 | 835584 << ~77 + 1;
   private static long lp = Long.reverse(-7349094952542294848L);
   private static int cj = Integer.reverse(-1476395008);
   private static int p = 24576 >>> 109 | 24576 << ~109 + 1;
   private static int fa = (0 >>> 126 | 0 << -126) & -1;
   private static int lo = (796917760 >>> 87 | 796917760 << ~87 + 1) & -1;
   private static int oj = 0 >>> 215 | 0 << -215;
   private static long di = Long.reverse(-7349094952542294848L);
   private static long t = Long.reverse(-7349094952542294848L);
   private static long oc = Long.reverse(6341847914664012992L);
   private static int ky = 0 >>> 210 | 0 << ~210 + 1;
   private static int kw = Integer.reverse(-1711276032);
   private static long dv = Long.reverse(-4467570830351532032L);
   private static long ab = Long.reverse(-7349094952542294848L);
   private static int bc = (1610612737 >>> 253 | 1610612737 << ~253 + 1) & -1;
   private static int de = 232 >>> 227 | 232 << ~227 + 1;
   private static int ih = Integer.reverse(0);
   private static int ow = Integer.reverse(1845493760);
   private static int ay = Integer.reverse(1342177280);
   private static long b = Long.reverse(8646911284551352320L);
   private static int mo = Integer.reverse(Integer.MIN_VALUE);
   private static int ml = 25 >>> 190 | 25 << -190;
   private static int ej = Integer.reverse(-1);
   private static long ie = Long.reverse(6341847914664012992L);
   private static long nq = Long.reverse(6341847914664012992L);
   private static long f = Long.reverse(8646911284551352320L);
   private static long aw = Long.reverse(-7349094952542294848L);

   public void a(NLoginCore_277 var1, byte[] var2) {
      try {
         if (var2.length == 0) {
            return;
         }

         Set var3 = (Set)this.c.get(var1, var0 -> new HashSet());
         synchronized (var3) {
            if (this.o.a().a().a(var1) != null && var3.isEmpty()) {
               this.b(var1, var2);
            } else {
               var3.add(var2);
            }
         }
      } catch (Exception var7) {
         NLoginCore_370.c(a(s, t ^ u), var7);
      }
   }

   public void g(NLoginCore_277 var1) {
      synchronized (this.d) {
         this.d.put(var1, this.a);
      }
   }

   private void a(NLoginCore_277 var1, JSONObject var2) {
      String var3 = var1.getName();
      int var4 = var2.getInt(a(var_do, dp));
      NLoginType_008 var5 = this.o.a();
      NLoginCore_187 var6 = var5.a();
      switch (var4) {
         case -1:
            String var27 = var2.getString(a(dq & dr, ds));
            boolean var34 = var2.getBoolean(a(dt, du ^ dv));
            if (!var34) {
               Player var41 = var1.c();
               NLoginCore_012.a(var41, NLoginCore_150.j() ? a(dw & dx, dy) + var27 + a(dz, ea ^ eb) : a(ec, ed ^ ee) + var27 + a(ef, eg ^ eh));
            }
            break;
         case 0:
            int var26 = var2.getInt(a(ei & ej, ek));
            switch (var26) {
               case 0:
                  String var33 = var2.getString(a(el, em ^ en));
                  File var40 = new File(this.o.c(), a(eo & ep, eq));
                  long var46 = System.currentTimeMillis();
                  if (var46 - this.a.getAndSet(var46) <= er || var40.exists() && NLoginCore_342.d.a(var40, var33)) {
                     Object[] var67 = new Object[ez];
                     var67[fa] = a(fb & fc, fd);
                     var67[fe] = ff;
                     this.a(var1, var4, var67);
                  } else {
                     Object[] var66 = new Object[es];
                     var66[et] = a(eu, ev ^ ew);
                     var66[ex] = ey;
                     this.a(var1, var4, var66);
                  }

                  return;
               case 1:
                  File var32 = new File(this.o.c(), a(fg & fh, fi));

                  try {
                     if (!var32.exists() || !NLoginCore_342.d.a(var32, var2.getString(a(fj, fk ^ fl))) && var32.delete()) {
                        ByteArrayInputStream var39 = NLoginCore_140.a(var2.getString(a(fm, fn ^ fo)));
                        NLoginCore_366.a(var39, var32);
                        NLoginCore_134.a(this.o, (boolean)fp);
                        return;
                     }
                  } catch (IOException var20) {
                     NLoginCore_370.c(a(fq, fr ^ fs) + var32.getName() + a(ft, fu), var20);
                  }

                  return;
               default:
                  return;
            }
         case 1:
            NLoginCore_509 var25 = var6.b(var1);
            NLoginCore_447 var31 = (NLoginCore_447)var5.b();
            int var38 = var2.getInt(a(fw & fx, fy));
            switch (var38) {
               case 0:
                  if (!var6.b(var1)) {
                     int var45 = var2.has(a(fz, ga ^ gb)) ? var2.getBoolean(a(gc & gd, ge)) : (!var2.getBoolean(a(gf & gg, gh)) ? gi : gj);
                     var1.a().a(new PlayerLimboProcessTask(() -> var31.b(var1, var25, var45)));
                  }

                  return;
               case 1:
                  var1.a().a(new PlayerLimboRestoreTask(() -> var31.a(var1, var25)));
                  return;
               default:
                  return;
            }
         case 2:
            if (!var6.b(var1)) {
               int var24 = var2.getInt(a(gk & gl, gm));
               int var30 = var2.has(a(gn, go)) && var2.getBoolean(a(gp, gq ^ gr)) ? gs : gt;
               int var37 = var2.has(a(gu, gv ^ gw)) && !var2.getBoolean(a(gx, gy)) ? ha : gz;
               NLoginCore_509 var44 = var6.b(var1);
               if (var37 != 0) {
                  var1.a().a(new PlayerLimboRestoreTask(() -> var5.b().a(var1, var44)));
               } else {
                  var44.a(NLoginCore_567.y, Boolean.valueOf((boolean)hb));
               }

               var44.a(NLoginCore_077.g, null);
               if (var30 != 0) {
                  Player var50 = var1.c();
                  this.o.b((boolean)hc).a(() -> var5.callEvent(new AuthenticateEvent(var50)));
               }

               NLoginCore_370.b(var3 + a(hd & he, hf) + var24 + a(hg, hh ^ hi) + var30 + a(hj, hk ^ hl) + var37 + a(hm, hn ^ ho));
            }
            break;
         case 3:
            Player var23 = var1.c();
            NLoginCore_482 var29 = this.o.a().a();
            NLoginCore_509 var36 = NLoginType_008.c().a().b(var1);
            NLoginInterface_024 var43 = var36.a();
            int var49 = var2.getInt(a(hq, hr));
            switch (var49) {
               case 0:
                  NLoginType_016 var54 = NLoginType_016.a(var2.getString(a(hs, ht ^ hu)));
                  if (var54 != null) {
                     if (var54 == NLoginType_016.f) {
                        var29.a(var54.aE(), (boolean)hv).ag();
                     } else {
                        var29.a(var54.aE(), NLoginCore_393.a(var23.getLocation())).ag();
                     }

                     String var58 = var2.getString(a(hw, hx ^ hy));
                     if (var58 != null) {
                        NLoginCore_055 var62 = NLoginCore_055.a(var58);
                        SpawnCommand.a(var5, var43, var62);
                     }

                     if (var54 == NLoginType_016.f && !var29.c(NLoginType_016.a.aE())) {
                        var43.a(var2.getString(a(hz & ia, ib)));
                        NLoginCore_150.a(var1, NLoginCore_194.F);
                     } else {
                        var43.a(var2.getString(a(ic & id, ie)));
                        NLoginCore_150.a(var1, NLoginCore_194.C, var_if, ig);
                     }

                     NLoginCore_447 var63 = (NLoginCore_447)var5.b();
                     var63.a().a(var5, (boolean)ih);
                  }

                  return;
               case 1:
                  NLoginType_016 var53 = NLoginType_016.a(var2.getString(a(ii, ij ^ ik)));
                  if (var53 != null) {
                     String var57 = var29.k(var53.aE());
                     if (var57 == null) {
                        var43.a(var2.getString(a(il, im ^ in)));
                     } else {
                        if (var53 == NLoginType_016.f) {
                           var29.a(var53.aE(), (boolean)io).ag();
                        } else {
                           var29.a(var53.aE()).ag();
                        }

                        String var61 = var2.getString(a(ip, iq ^ ir));
                        if (var61 != null) {
                           NLoginCore_055 var64 = NLoginCore_055.a(var61);
                           SpawnCommand.a(var5, var43, var64);
                        }

                        var43.a(var2.getString(a(is, it ^ iu)));
                        NLoginCore_150.a(var1, NLoginCore_194.C, iv, iw);
                        NLoginCore_447 var65 = (NLoginCore_447)var5.b();
                        var65.a().a(var5, (boolean)ix);
                     }

                     return;
                  }

                  return;
               case 2:
                  NLoginType_016 var52 = NLoginType_016.a(var2.getString(a(iy, iz)));
                  if (var52 != null && var52 != NLoginType_016.f) {
                     try {
                        String var56 = var29.k(var52.aE());
                        if (var56 == null) {
                           var43.a(var2.getString(a(ja, jb ^ jc)));
                           return;
                        } else {
                           Location var60 = NLoginCore_393.a(var56);
                           if (var60 == null) {
                              var43.a(var2.getString(a(jd & je, jf)));
                           } else {
                              var1.a().a(new SynchronizeWithServerThreadTask(() -> {
                                 if (NLoginCore_012.V()) {
                                    var23.teleportAsync(var60, TeleportCause.PLUGIN);
                                 } else {
                                    var23.teleport(var60, TeleportCause.PLUGIN);
                                 }
                              }));
                              var43.a(var2.getString(a(jg, jh ^ ji)));
                           }

                           return;
                        }
                     } catch (Exception var19) {
                        NLoginCore_370.c(a(jj, jk ^ jl) + var19.getLocalizedMessage(), var19);
                        var43.a(var2.getString(a(jn, jo ^ jp)));
                        return;
                     }
                  }

                  return;
               case 3:
               default:
                  return;
               case 4:
                  String var51 = var2.getString(a(jq & jr, js));
                  if (var51 != null) {
                     NLoginCore_055 var55 = NLoginCore_055.a(var51);
                     SpawnCommand.a(var5, var43, var55);
                  }

                  return;
            }
         case 4:
            Player var22 = var1.c();
            int var28 = var2.getInt(a(jt & ju, jv));
            var1.a().a(new SynchronizeWithServerThreadTask(() -> {
               switch (var28) {
                  case 0:
                     NLoginCore_194 var9x = NLoginCore_194.valueOf(var2.getString(a(ow, ox ^ oy)));
                     float var10x = var2.getFloat(a(oz, pa));
                     float var7x = var2.getFloat(a(pb, pc ^ pd));
                     var9x.a(var3xx -> var22.playSound(var22.getLocation(), var3xx, var10x, var7x));
                     break;
                  case 1:
                     String var8x = var2.getString(a(pe & pf, pg));
                     boolean var6x = var2.getBoolean(a(ph & pi, pj));
                     if (var6x) {
                        this.o.b().a().l(var8x);
                     } else {
                        var1.p(var8x);
                     }
                     break;
                  case 2:
                     String var5x = var2.getString(a(pk, pl ^ pm));
                     if (a(pn, po ^ pp).equalsIgnoreCase(var5x)) {
                        this.o();
                     }
               }
            }));
         case 5:
         default:
            break;
         case 6:
            long var21 = var2.getLong(a(jw & jx, jy));
            synchronized (this.e) {
               CompletableFuture var42 = (CompletableFuture)this.e.getIfPresent(var21);
               if (var42 != null) {
                  this.e.invalidate(var21);
                  if (var2.has(a(jz, ka))) {
                     String var47 = var2.getString(a(kb, kc ^ kd));
                     var42.completeExceptionally(new RuntimeException(var47));
                  } else {
                     Object var48 = var2.get(a(ke & kf, kg));
                     var42.complete(var48 instanceof JSONObject ? (JSONObject)var48 : null);
                  }
               }
               break;
            }
         case 7:
            EventEnum var7 = EventEnum.valueOf(var2.getString(a(kh, ki)));
            if (!var7.isForwardEvent()) {
               throw new IllegalArgumentException(a(kj, kk) + var7 + a(kl & km, kn));
            }

            JSONArray var8 = var2.getJSONArray(a(ko, kp));
            Object[] var9 = new Object[var8.length()];
            Class[] var10 = var7.getRewrittenClasses();
            if (var9.length != var10.length) {
               throw new RuntimeException(a(kq, kr ^ ks) + var9.length + a(kt, ku ^ kv) + var10.length + a(kw, kx) + var7);
            }

            for (int var11 = ky; var11 < var9.length; var11++) {
               JSONObject var12 = var8.getJSONObject(var11);
               Class var13 = var10[var11];
               if (EventPlayer.class.isAssignableFrom(var13)) {
                  var9[var11] = var1.c();
               } else if (!String[].class.isAssignableFrom(var13)) {
                  if (UUID.class.isAssignableFrom(var13)) {
                     var9[var11] = var2.has(a(lh, li ^ lj)) ? NLoginCore_432.c(var2.getString(a(lk, ll))) : null;
                  } else {
                     Object var59 = var12.has(a(lm, ln)) ? var12.get(a(lo, lp ^ lq)) : null;
                     if (Enum.class.isAssignableFrom(var13)) {
                        if (!(var59 instanceof String)) {
                           throw new RuntimeException(a(lr, ls ^ lt) + var11 + a(lu, lv));
                        }

                        try {
                           String var10003 = a(lw & lx, ly);
                           Class[] var10004 = new Class[lz];
                           var10004[ma] = String.class;
                           Method var10002 = var13.getMethod(var10003, var10004);
                           Object[] var68 = new Object[mb];
                           var68[mc] = (String)var59;
                           var9[var11] = var10002.invoke(null, var68);
                        } catch (ReflectiveOperationException var17) {
                           NLoginCore_370.c(a(md, me ^ mf), var17);
                        }
                     } else {
                        var9[var11] = var59;
                     }
                  }
               } else if (!var2.has(a(kz, la ^ lb))) {
                  var9[var11] = new String[lg];
               } else {
                  JSONArray var14 = var2.getJSONArray(a(lc, ld ^ le));
                  String[] var15 = new String[var14.length()];

                  for (int var16 = lf; var16 < var15.length; var16++) {
                     var15[var16] = var14.getString(var16);
                  }

                  var9[var11] = var15;
               }
            }

            this.o.b((boolean)mh).a(() -> var5.a(var7, var9));
      }
   }

   private static void b() {
      e = 231258870992027737L;
      long var0 = e ^ 5784730766355040943L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(21 + 48),
               (byte)(56 + 27),
               (byte)(9 + 38),
               (byte)(63 + 4),
               (byte)(63 + 3),
               (byte)(66 + 1),
               (byte)(19 + 28),
               (byte)(36 + 44),
               (byte)(35 + 40),
               (byte)(13 + 54),
               (byte)(48 + 35),
               (byte)(21 + 32),
               (byte)(51 + 29),
               97,
               (byte)(39 + 61),
               100,
               (byte)(9 + 96),
               (byte)(86 + 24),
               (byte)(92 + 11)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(35 + 48)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_397.D("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈ҄ӍҩҝҞҖғӍӓҵҴҡ", (byte)44, 68);
               b[1] = NLoginCore_530.E("ԩԸՀԾԿՑՂՈԸզժԩԭեՎԨՌՃԫէ\u0530մԻԼ", (byte)44, 69);
               b[2] = NLoginCore_530.D("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝҽҜҳҠҧҤҗӒәҸҗҡ", (byte)44, 68);
               b[3] = NLoginCore_241.D("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 68);
               b[4] = NLoginCore_141.C("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 67);
               b[5] = NLoginCore_173.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӥҽҪӧӍӠӠӳӯӭӦӁ", (byte)44, 68);
               b[6] = NLoginCore_451.A("ćđĭĞĪħđĉĖęīčĳķŜļŌĸįļŎĠĘŔĞťūŘţĬłŪĮħłőŝŋĳũŪůĬŪųųĶőƀľŭśžŸŞřŤŞŁŇŠŕźſƃśňƅūžžƑƍƋƄş", (byte)44, 65);
               b[7] = NLoginCore_223.B(
                  "ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧţŃŬŗœŇůšŵĵžķƅņŘŪŀŊņŃƆƄũťƓƀŝŒşŴŕƂƓōƓŦƏŖŰřŹƒŠƆƠƚŹƪƀžƢƧūƁƊƤũƌƧƍƖƭƫơƨŵƇƖƲƽƽƚƵžƿƕƯƣƀƾƽơǈƶƝǄ",
                  (byte)44,
                  66
               );
               b[8] = NLoginCore_076.D("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 68);
               b[9] = NLoginCore_110.F("ԺԷԱեՃբԱԼՒժԻ\u0530", (byte)44, 70);
               b[10] = NLoginCore_575.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťŸūůƟşƙſƌſŽŽŪū", (byte)44, 66);
               b[11] = NLoginCore_453.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲӇҨӗӅӉӀӡӮӢҿҧ", (byte)44, 67);
               b[12] = NLoginCore_138.A("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 65);
               b[13] = NLoginCore_201.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԪԫԦԹԻԩԱլիՐ՟յմԳԸԸէ\u0558էԹըԾռՔաՅՓր\u0557սոճւչգեծղ֎֓փէցՖհ\u058cէշլՏ֎ն֏կ՝յյ֍աՠ֗ա֞֕հ", (byte)44, 69);
               b[14] = NLoginCore_575.B("ĬĪőğĠďĐŒĩİĔīŉśĐĹĖśőŔĖŤĳĠĶĽŇŁŉĺķŅİŲĽŏŃŇŏűŗŖũźŶťŏŨƀřŲĺĽļŢżœƂźŧňƇţŪŉŽŰűťƍƑşŖťŘŭżƒŰƊŬơųşƗŢƁƚƛŽšƩţūƁż", (byte)44, 66);
               b[15] = NLoginCore_183.D("ѾҰҢҀҶҨҶѱҊҏ҄ҁ", (byte)44, 68);
               b[16] = NLoginCore_092.A(
                  "ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǀƱƴƧƾǟǕǨǛƬƪ",
                  (byte)44,
                  65
               );
               b[17] = NLoginCore_446.A("ĞĩĠņĊĵŁĬĪŊŘğ", (byte)44, 65);
               b[18] = NLoginCore_387.D("Ҁҋ҂ҨѬҗңҎҌҬҺҁ", (byte)44, 68);
               b[19] = NLoginCore_232.F("ՎաՙՅԲԟԧ\u0558ԹՕԤթՊծԡԺԺ՜ՓձՔՑնՊ\u0558ժճէԼհԻԽնՙԹփՀՙՒՆՈՒՆՐ", (byte)44, 70);
               b[20] = NLoginCore_530.E("ԿԲԵԱԸԘ\u0557դ\u0557բԷ\u0530", (byte)44, 69);
               b[21] = NLoginCore_232.C("ѰңҒҴѬҟҧ҅ҪҊҮҁ", (byte)44, 67);
               b[22] = NLoginCore_446.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԮՔԪճզզ՝ըՈԷՓ", (byte)44, 69);
               b[23] = NLoginCore_241.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
               b[24] = NLoginCore_451.E("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 69);
               b[25] = NLoginCore_471.D("ҬҌ҄ҍѱҐґҍѸ҆Ҳҁ", (byte)44, 68);
               b[26] = NLoginCore_091.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
               b[27] = NLoginCore_232.F("ԟՒՁգԛՎՖԴՙԹ՝\u0530", (byte)44, 70);
               b[28] = NLoginCore_201.C("ҢҮҏҬҦҦҬҙѰѲҕѶҷѶҟѽҌѵҾҢҘҒҔҾ҃ҜҩҿҖӍ҆ӉҠҞҔӀҶӋӒҙґҧӎҡ", (byte)44, 67);
               b[29] = NLoginCore_091.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
               b[30] = NLoginCore_433.F("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 70);
               b[31] = NLoginCore_076.B("ŊĪĢīďĮįīĖĤŐğ", (byte)44, 66);
               b[32] = NLoginCore_324.A("ĮġĤĠħćņœņőĦğ", (byte)44, 65);
               b[33] = NLoginCore_110.F("ԼԛԛԟԾ\u0558ՏՈՉԵԣՃ\u0558ՇԨթՇ\u0530լՃՇդԻԼ", (byte)44, 70);
               b[34] = NLoginCore_446.A("ŐĮĮąŎŔēĨĐŔĢŕĜīŗŔŜĠĜļŤţĪī", (byte)44, 65);
               b[35] = NLoginCore_433.D(
                  "ҎҌҳҁ҂ѱѲҴҋҒѴҔҼҪҠѽѾҘѾӄӇӆӈӊ҂қҦӄҙҌҧҧҿӇҳӔӅҸҬӘҩҬҬҹҖӘӑӐҲҙӞҳҦӆӥҳҡӊӇӢӤәӝӍӨӒӌӡҬӉӲҷӴӲӄӹӶӨӯԀӂӳҾӒҼӾӹӵԈӠӼӥӋӇӞӥԇӎӦӳӧӔӏӯԋӕԋӥԓԋӿԍӿӱԟԔӦӥԩԕӡӤԡԤӸԪԟӮ",
                  (byte)44,
                  68
               );
               b[36] = NLoginCore_138.A(
                  "őŊģĥĽĒĮőĘģőđęŔŉŞĭēŘĿŐģĥŠĹŦŗĥľņũŃŋŧŭšłłŀŖĲņůķĲŭĶŒĸƁŶśžĽļƃŚŷƉŉŞżŎŹƏŮżōōŠƓŴƉŒƙƜŖŽƗƇŖƍŭŠŤƜƂƀŧƗŦƗƀŦƆƤŨƩƲƢƎƂƇƃŰŸƏƇƲƶƛŻƊƫƯƲƽƁƣǈƥǈƖƦǅƕǇƥƥǍǆƜƓƽƭƦƶƮǇƷƮƛǒƕǚƠǣƲƞƽƽǟǒƛƢǈƽƧǢǁǬǀǩǏƾǋǬǸƮǫǐǭǻǛǱǬǏǵǪǓǳǹǰƽǑǻǤǻȆǦǜǋȑǿǻǿǪǧǬǒȂǩǴǶȜȌǻǭȗǿȝǵȏȓǹǸȒȟǴțȌȗȧȦșȫȂȟǪȈȏǩȧșǰȧǵȝȸȉȕɂǼȕȂȀȚȤȢȺșȢȨȣɎȧȧȊɓȾȤȿȟɁȭȱȔȯɊșɊȝɒȮȷȕɏȳȮɀȴȵȜȤȥɟȷɊɰȫȲɆȬɧɪɆɳɨɸɼɧȺɈəɨɐɊȻɓɺɦɁʈɨɇɫɜɻʈɊɐɹɍɛɌɪɮɫɑʏʓɍʜʔʊɗʊʂɾɟʜɾʗʂɡɵɷɥɬɾʊʛɦʈʠʫʦɯʒʌʳʥʒɿ",
                  (byte)44,
                  65
               );
               b[37] = NLoginCore_201.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀\u058bս֖֜֞և׃֝֩\u058b\u05cc֝֏֪֣\u058c։׀֛֮֬֜",
                  (byte)44,
                  69
               );
               b[38] = NLoginCore_173.B(
                  "ĮĿĠŅŃŉņŁĎċķřĖŇĵĝĒŋĞļĳŏśťŗĨŇĩšňĠŮŮŁĪļŃĴŊňŗĲœŏŽŰŒŲŌŔŠŃşƃŘńŀŔŊĽŴŠŭŧŪňńšŴœƏŢƌŨƔƆśŪŮƞƉŲŬƝŸƦƀƕƂƇƙƧŻūƯŷƤŧƎƥųƇƌƁŮƖŸƊƉƼŻƳƸƔưƹƖƤǅƥƂƽƶƔǉǍǃƦǄƋƐƛƿƇƥƑƭǏƻǓƚƼǛǜǝǌƾǟƶǎƽƴƿǘǟǔƦǟƭǫƹƻƮǜƾǅǟƯǂǊƴǙǄǾǱǽǶǫǁǱƿǡǲǓǐǼǲǙȆǌǗǠǧǚǞǐǏǨǍǴǧȖǒǨȏǭȟțǝȁǳǛǹȥȂȠȨȘǳǹȭǵȣȉȰȍȓȑǯȧȢȤȁǶȏȇȔȈȭȬȚȑȳȁȹȠȻȷȕȱȥȢșȟȽȢɏșȫɅȜȨɁȖɒɁȹɃȷȚȷȿɍɉȰɕɔȥɤɐɗɤɟɈɃɨȼɭɦɌɑɟɅɶɡȩɌȹɚɧɼɕɗɌɴȺɺɣȿɸɔɀɁɣɒɬʇɈʋɥɤɽʁʂʒɝɐʎʏʘɮɟ",
                  (byte)44,
                  66
               );
               b[39] = NLoginCore_232.B("ĐĲĤĽĪćĿĲĤŊĺğ", (byte)44, 66);
               b[40] = NLoginCore_521.F("ԸԢՍԚԿԝՁդաՉԢ\u0530", (byte)44, 70);
               b[41] = NLoginCore_091.C("ѲҢҕҥѳҏѳѵҰѸҋҸҞҮ҉ҒӃҒҗҟӆӅҌҍ", (byte)44, 67);
               b[42] = NLoginCore_091.C("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 67);
               b[43] = NLoginCore_397.A("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 65);
               b[44] = NLoginCore_521.A("ĐŀĳŃđĭđēŎĖĩŖļŌħİšİĵĽŤţĪī", (byte)44, 65);
               b[45] = NLoginCore_559.F("ԸԢՍԚԿԝՁդաՉԢ\u0530", (byte)44, 70);
               b[46] = NLoginCore_241.E("ՒՐՓԚԲԻՙԠ՛Ֆա\u0530", (byte)44, 69);
               b[47] = NLoginCore_141.D("ҢҮҏҬҦҦҬҙѰѲҕѽҵҧҴҼҙҮӅұӅҞҧҽҞ҉҉ӊҬҦһҪ", (byte)44, 68);
               b[48] = NLoginCore_092.A("ďŊĚňċďĨģĶœĪğ", (byte)44, 65);
               b[49] = NLoginCore_183.B("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 66);
               b[50] = NLoginCore_027.C("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 67);
               b[51] = NLoginCore_427.D("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 68);
               b[52] = NLoginCore_324.D("ҍѪүҎү҃ҖҏҢҰѵѽҰҼѶҌҴҹӀҟҡҟҌҍ", (byte)44, 68);
               b[53] = NLoginCore_110.A("İęĽĨīōŀġŇœĕğ", (byte)44, 65);
               b[54] = NLoginCore_110.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձծՋՊյՐ\u0558ն\u0557Վռմ", (byte)44, 70);
               b[55] = NLoginCore_433.C("ҝҫҡѴҖ҄Ҋҧһ҅Ҷ҅ҸҳѽҰҵҽ҃ҹӂҿҜқӆҡҩӇҨҟӍӅ", (byte)44, 67);
               b[56] = NLoginCore_575.D("ҫҞҠѮѶѰҫҷҭҜҶҔѺҮҜҼҪҰқҶґӅҌҍ", (byte)44, 68);
               b[57] = NLoginCore_223.F("՚ՍՏԝԥԟ՚զ՜ՋեՃԩ՝Ջիՙ՟ՊեՀմԻԼ", (byte)44, 70);
               b[58] = NLoginCore_453.E("ԸԢՕՕԵ՝՜՛բԺՕ\u0558՜ՄՐՀԨՅճաԳՃՒԮթԬլղՕՐռվձւԹտՔևցՙօռզ\u0558աՌֈժՠժէ՜Օզյմ֗քեխճ֜ջ֖֠ռ֍ռ֣֣֧֔թրզհ", (byte)44, 69);
               b[59] = NLoginCore_575.E("ԩԜԵՕՀԟՃզգԪդԞզԾԺ՛ԫեՂԭՈմզՖնԸԹե՚սշԶ", (byte)44, 69);
               b[60] = NLoginCore_530.E("ԡԚԫՑՅԲԯԶՇԪՖԺՠԾԥԼժ՜դէ\u0530ԾԻԼ", (byte)44, 69);
               b[61] = NLoginCore_451.F("\u0558ԲԬ՜դԺԥԶԩՆԻ\u0530", (byte)44, 70);
               b[62] = NLoginCore_471.D("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 68);
               b[63] = NLoginCore_453.B("İęĽĨīōŀġŇœĕğ", (byte)44, 66);
               b[64] = NLoginCore_575.F("ՍբԕՏԴԱ\u0558ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ\u0557ՍղիՏհաքՔզՑւէՐ", (byte)44, 70);
               b[65] = NLoginCore_027.B("ļőĄľģĠŇĲœŚēŘŋĩŌļĬŖķŐĹţĪī", (byte)44, 66);
               b[66] = NLoginCore_223.F("ՍբԕՏԴԱ\u0558ՃդիԣէՎդ՚ՏԽԨլծԿմԻԼ", (byte)44, 70);
               b[67] = NLoginCore_446.E("ՁԪՎԹԼ՞ՑԲ\u0558դԦ\u0530", (byte)44, 69);
               b[68] = NLoginCore_387.A("ļőĄľģĠŇĲœŚĔŊēļřĭśŔľĶĚţĪī", (byte)44, 65);
               b[69] = NLoginCore_446.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļšŚľşŐųŃŕŀűŖĿ", (byte)44, 65);
               b[70] = NLoginCore_559.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
               b[71] = NLoginCore_387.D("ҒѻҟҊҍүҢ҃ҩҵѷҁ", (byte)44, 68);
               b[72] = NLoginCore_201.F("ՍբԕՏԴԱ\u0558Ճդիԥ՛ԤՍժԾլեՏՇԫմԻԼ", (byte)44, 70);
               b[73] = NLoginCore_471.F("ՍբԕՏԴԱ\u0558ՃդիԢ՜եԻՈլձՃՈհՐխՃթՖծ\u0557հՒ՜Վ՚", (byte)44, 70);
               b[74] = NLoginCore_559.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
               b[75] = NLoginCore_384.B("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŇĽīũİŰŮıšŏŨĿ", (byte)44, 66);
               b[76] = NLoginCore_092.E("ՍբԕՏԴԱ\u0558ՃդիԣՌՖԸԥ՚ձխ\u0530ՃՆեՍՌՂՏՃ՜ՔՉՔՍ", (byte)44, 69);
               b[77] = NLoginCore_453.E("ՍբԕՏԴԱ\u0558ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ\u0557ՍղիՏհաքՔզՑւէՐ", (byte)44, 69);
               b[78] = NLoginCore_575.E("ՖԠԼ՛ՅԴԵ\u0558Ւթՙ\u0530", (byte)44, 69);
               b[79] = NLoginCore_004.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
               b[80] = NLoginCore_451.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
               b[81] = NLoginCore_092.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
               b[82] = NLoginCore_433.B("ňŌœĳĒİīĭĲİĺŚňĥķśŋĽłńőĽĪī", (byte)44, 66);
               b[83] = NLoginCore_110.A("čĠńěŕĠŀŋĩĳđğ", (byte)44, 65);
               b[84] = NLoginCore_141.D("ҏ҄ҠҥҔҲҔҬҤҬғҏѸґҗѸҀҚҢҶҔҏҌҍ", (byte)44, 68);
               b[85] = NLoginCore_471.B("ĨŐŅňĒŊĴĴńœśŒōĥœŊİőŞŗšĴĴţĠťŝĦŃŚşŋšĽőĩĽıŕŷŴšŎĿ", (byte)44, 66);
               b[86] = NLoginCore_027.C("ѺҁҫҏѲҸҪѵҲҎҔҴҿѽҽҳѼҬ҄ҁ҄ӅҌҍ", (byte)44, 67);
               b[87] = NLoginCore_232.D("ҟѰ҇ѯҭҰҢҊ҅ҧҎѯѼҌҴғҋұҒҿҙҳҹһҷҩӄҿҊҹӋӍґҒӍӎҳҭӐҴҗҮҗҝӖӠҚӘӜҝәҲӦӨҠӓҢӇһӘҷӎҢӪ", (byte)44, 68);
               b[88] = NLoginCore_553.E("ԙ՛ՐԟՕդբա՟եՕ\u0530", (byte)44, 69);
               b[89] = NLoginCore_027.A("ĺęŏĭĳċŇĢĠŉĨĸĖŒŗľıĜĶŁŚĽĪī", (byte)44, 65);
               b[90] = NLoginCore_384.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
               b[91] = NLoginCore_446.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
               b[92] = NLoginCore_471.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
               b[93] = NLoginCore_091.A("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 65);
               b[94] = NLoginCore_173.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
               b[95] = NLoginCore_027.E("Զ՝՟ՔԠՀՒԠԳՁա\u0530", (byte)44, 69);
               b[96] = NLoginCore_521.B("ĽĎĥčŋŎŀĨģŅĪĔŕĨĺŏşĮĝŁŎţĪī", (byte)44, 66);
               b[97] = NLoginCore_241.A("ġĹňĦēēĈĨŐĬŇķňŔŉŐŖİŁĶĵńőŁŧŃşĪĬĩŜĭŢĻŰųĲĿŒŸĸŏŒţŶŜſřŘŲŁœŠżťƄŴŵźƀŞŷŘŇ", (byte)44, 65);
               b[98] = NLoginCore_076.B("ĪĩİĥģņġĲķģńğ", (byte)44, 66);
               b[99] = NLoginCore_127.B("ŀŌĭŊńńŊķĎĐĲňĔœŒŖĝľŐĢŁģťħũķřĤŧĬņĨťŰĩŃŅĲŐŐŧţĺŭĮœřŗŭŔŏŽźŢŢżŕųżšƂźšťňŏŻŪŤƐƉůŷƁƓźųƊƛőƍŵŵŹƏƎƎżųŸšŹƫƅŻƥ", (byte)44, 66);
               b[100] = NLoginCore_427.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
               b[101] = NLoginCore_110.D("ѱҩҀүүң҅Ңҫ҃ґҪ҇ҪҾҀҵҷҁҖңҵҌҍ", (byte)44, 68);
               b[102] = NLoginCore_446.F("ԩ\u0530՚ԾԡէՙԤաԽՃգծԬլբԫ՛Գ\u0530ԳմԻԼ", (byte)44, 70);
               b[103] = NLoginCore_427.D("ҞҴҋҮҗѩҒҋҢңҷҹҗҊҹҪҝҘңҽґҸҗӅҢ҇ҕң҆҇ӇҽґҬҫӃҥӈӄӅӃҕҤҡ", (byte)44, 68);
               b[104] = NLoginCore_092.B("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 66);
               b[105] = NLoginCore_433.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
               b[106] = NLoginCore_173.E("ԟՒՁգԛՎՖԴՙԹ՝\u0530", (byte)44, 69);
               b[107] = NLoginCore_232.B("ČĚďŎĵŊŒŀŀįőŔŚĵİŊŕĞĶĭŚŢĿįħķřūŅĶŪŚ", (byte)44, 66);
               b[108] = NLoginCore_004.B("ĿŎŎĎįĭķīĠĴĴēĖĪįŌŀĴŚŜĳĽĪī", (byte)44, 66);
               b[109] = NLoginCore_471.C("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 67);
               b[110] = NLoginCore_530.C("҇ҍґүѱѴғҰҤҍѲҶҍҟҘѼґһҁѾҹӅҌҍ", (byte)44, 67);
               b[111] = NLoginCore_451.E("ԹԪԽԣՔԺՂԚ\u0557ԸՅՠեԩՉԾձ՚բՊԯ\u0530կԮՕՏՖ՚ղպԵնՔՖսՄճեՙև\u0557օէՐ", (byte)44, 69);
               b[112] = NLoginCore_553.C("҇ҍґүѱѴғҰҤҍѼҞҼҘӁҳҴҰѽүҸҟҌҍ", (byte)44, 67);
               b[113] = NLoginCore_530.B("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĵŕİŃľŦŌīŤĺĪ", (byte)44, 66);
               b[114] = NLoginCore_201.D("ѫҝѱ҂Ү҃ҥҩѺҨҲҁ", (byte)44, 68);
               b[115] = NLoginCore_521.C("ѬҰҰҰҥѲҨ҅ҎҪґҨү҉ҙҖӃүҾѿӄҘұӁҁ҈ҽӆҍ҈ҋӏҳӍҍҎӊҫҤӍӋӓҘҜӎҾҷҙҼҺҠӚӕӛӑҲӇҴҶӠӦӗӢңӋҿӤӝӖӧҪӪӌӜӰӕӑҸӏһӴԃӬӯӕӠӴӹӥԂӌԌӨԀӌӢԊӅԃӮӴӧӲӹӤӷӤӡ", (byte)44, 67);
               b[116] = NLoginCore_451.B("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵųĮťŲŲũŕœŠſƃŊŋ", (byte)44, 66);
               b[117] = NLoginCore_127.A("ŀŌĭŊńńŊķĎĐĵňŖĪĐŌĮŁŎİĵŚġşŒĸŅśŌŅŅňĩşĲūųıĿŉİŅŏŎœŧůŹŒŋžƀŸŖŕŦťŻźſŕƅƇƉ", (byte)44, 65);
               b[118] = NLoginCore_397.C("ѼҟѰҳѨ҇ҁҤұѲѳҁ", (byte)44, 67);
               b[119] = NLoginCore_451.E("ՍՍԻԮաԠՀԺԡՅԿ\u0530", (byte)44, 69);
               b[120] = NLoginCore_138.A("ĐĽĝĊľčňĐĸńńğ", (byte)44, 65);
               b[121] = NLoginCore_397.F("ԟԳՒգՄԼԝեԵՇԪ\u0530", (byte)44, 70);
               b[122] = NLoginCore_127.C("ҌҝҏұҭҡѷҢҹҸҰҾҒұҎҟҞҮҽ҃ҮҏҌҍ", (byte)44, 67);
               b[123] = NLoginCore_446.B("ġĊĢĠņŃŐīıŘđğ", (byte)44, 66);
               b[124] = NLoginCore_384.E("ՠԙՕԛՓզԡ\u0530ԲԻ՝էխԠԪզՏԾԳԿՏմԻԼ", (byte)44, 69);
               break;
            case 1:
               b[0] = NLoginCore_173.C("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈӇҏӊӀҍӐҸӉұҒҤҡ", (byte)44, 67);
               b[1] = NLoginCore_559.B("ĘħįĭĮŀıķħŕŚıŎŞĽįŕőĺĚŔĭĪī", (byte)44, 66);
               b[2] = NLoginCore_446.C("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝӄҮұҵҥҏӒҥҮӐҗҡ", (byte)44, 67);
               b[3] = NLoginCore_232.C("ҡҰҰѰґҏҙҍ҂ҖҗҲҍҕӀҏҞӀҷҒҙҏҌҍ", (byte)44, 67);
               b[4] = NLoginCore_201.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՃՃԧԾէՂՋզՄԯկՇոՙկժ\u0557յչԵԿՀսԽ՚վ\u0557ՓհոՔՅւ֊ֆՊ։ՆլՌՌռՑժզթմշկ՛ՖՖ։֛", (byte)44, 70);
               b[5] = NLoginCore_451.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӒҾӃӄӠӵҪӘӪӷҷӁ", (byte)44, 68);
               b[6] = NLoginCore_384.E("ԘԢԾԯԻԸԢԚԧԪԼԞՄՈխՍ՝ՉՀՍ՟ԱԩեԯնռթմԽՓջԿԸՓբծ՜ՄպջրԽջքքՇբ֑Տվլ֏։կժյկՒ\u0558ձզ\u058b\u0590խմց֗ձ֙ՙ֑֗պջհ", (byte)44, 69);
               b[7] = NLoginCore_183.C(
                  "ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӅҥӎҹҵҩӑӃӗҗӠҙӧҨҺӌҢҬҨҥӨӦӋӇӵӢҿҴӁӖҷӤӵүӵӈӱҸӒһӛӴӂӨԂӼӛԌӢӠԄԉӍӣӬԆӋӮԉӯӸԏԍԃԊӗөӸԔԟԟӼԗӠԡӸӥԞԋӝӤӷԧԗӯԀԂԏԟԏԏԨԠԴԐԨԪԁ",
                  (byte)44,
                  67
               );
               b[8] = NLoginCore_232.A("ŀŌĭŊńńŊķĎĐĲĲĖĭŖıĺŕĳĞŞĶŧňŞřņŤŨĤĮįŬĬŉŭņłşŧŃĴųŮůŇĽŰŝūűŌťŻšƆŝŧŢŽŗƀŅŹ", (byte)44, 65);
               b[9] = NLoginCore_092.F("ՉԭԞԵ\u0530դԠԥԻՈԨՄՃՌՀԿՃիզՑեԾԻԼ", (byte)44, 70);
               b[10] = NLoginCore_223.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťƄůśśƏűŚŲƄŚŽŪū", (byte)44, 66);
               b[11] = NLoginCore_201.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲҿҟөӒӉӡҫҿҺӆӃөӒӣӪӃұӷӕұӴӌӁ", (byte)44, 67);
               b[12] = NLoginCore_173.A("ġăŎŉĠċĦŎĵŏįŃēĝĔŎľļĳľńĭĪī", (byte)44, 65);
               b[13] = NLoginCore_553.D("ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӄӓӊҴҶҿӃӟӤӔҸӒҧӁӝҸӈҽҠӟӇӠӊӡӤүӊӱӕҴӷӉӚөӶӱҸӺӘӒӀҾӥӵӌӍ", (byte)44, 68);
               b[14] = NLoginCore_471.C("ҎҌҳҁ҂ѱѲҴҋҒѶҍҫҽѲқѸҽҳҶѸӆҕ҂ҘҟҩңҫҜҙҧҒӔҟұҥҩұӓҹҸӋӜӘӇұӊӢһӔҜҟҞӄӞҵӤӜӉҪөӅӌҫӟӒӓӇӯӳӁҸӇҺӏӞӴӒӬӎԃӕӁӹҿӼӠӨӸӕӝӧӛӏԅ", (byte)44, 67);
               b[15] = NLoginCore_451.E("ՋԘԹԠՆԯՐԼԣԾԦ\u0530", (byte)44, 69);
               b[16] = NLoginCore_173.A(
                  "ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǅƶǚǂǧǒƽƦǙǉǉ",
                  (byte)44,
                  65
               );
               b[17] = NLoginCore_575.C("ҌѽҬѫұѴҸғҘҘҋѶұѽҒғӁһѻҟҙӅҌҍ", (byte)44, 67);
               b[18] = NLoginCore_141.D("҃ѪѪҌ҅҂ҋѷғҖ҈ҜҗҽҭҙѴѺҎҶҖҵҌҍ", (byte)44, 68);
               b[19] = NLoginCore_433.B("ĽŐňĴġĎĖŇĨńēŘĹŝĐĩĩŋłŠŃŀťĹŇřŢŖīşĪĬŞĭĮšųŶŎňĴŊĺűŇŦōıĹŎƀĽŒųŊŋ", (byte)44, 66);
               b[20] = NLoginCore_241.C("ҤҩҜҖѭ҅ҌѹҮ҃Ґҁ", (byte)44, 67);
               b[21] = NLoginCore_110.E("\u0558ԺԴգԽԢԷ\u0530Դ\u0558զՕԶբգժՀԨ՛ՐԴՎԻԼ", (byte)44, 69);
               b[22] = NLoginCore_451.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԲՄՕզՎգՔռԺԵ՚Պ՜խԾԻՓտՐ֊՝գՐ", (byte)44, 70);
               b[23] = NLoginCore_451.D("ңҦҠґґҸҶѸ҇ҫҤҙҒҙҐҶҗѾҕҤ҆ҵҌҍ", (byte)44, 68);
               b[24] = NLoginCore_324.C("҆Ҵ҂ѳҟҍ҈ҳҲҕҊҴҊҺѹҝҐҴҙҏѽҏҌҍ", (byte)44, 67);
               b[25] = NLoginCore_127.A("ĥōľēħĞĭğīđĕğ", (byte)44, 65);
               b[26] = NLoginCore_397.E("ԪԿՔԷԭդԾ՞ՙՀԷ\u0530", (byte)44, 69);
               b[27] = NLoginCore_384.F("ԝԪՠԹեԿՇՄԢԵ՞ՀՅՍԽԫՐ\u0530ՒժՄդԻԼ", (byte)44, 70);
               b[28] = NLoginCore_559.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՄԥզԥՎԬԻԤխՑՇՁՃխԲՋ\u0558ծՅռԵոժնՁծՍԽ՛՞եՊսՐ", (byte)44, 69);
               b[29] = NLoginCore_004.A("ŁńľįįŖŔĖĥŉłőņķĻňĝŉśĶŞĽĪī", (byte)44, 65);
               b[30] = NLoginCore_141.C("҆Ҵ҂ѳҟҍ҈ҳҲҕ҈ҧҘҼҠҘ҂ҋҘҚҟҏҌҍ", (byte)44, 67);
               b[31] = NLoginCore_446.F("Լ՜ՌԠ՚ԽէեԢԷԿ\u0530", (byte)44, 70);
               b[32] = NLoginCore_427.A("ČęŇĊņĩŉőŐŎĺğ", (byte)44, 65);
               b[33] = NLoginCore_201.F("ԼԛԛԟԾ\u0558ՏՈՉԵԤխլ՝ԸԩԼԨբՎՋդԻԼ", (byte)44, 70);
               b[34] = NLoginCore_521.B("ŐĮĮąŎŔēĨĐŔĢİōĴŊŀĜĪŖĸŤţĪī", (byte)44, 66);
               b[35] = NLoginCore_446.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնյշչԱՊՕճՈԻՖՖծնբփմէ՛և\u0558՛՛ըՅևրտաՈ֍բՕյ֔բՐչն֑֓ֈ\u058cռ֗ցջ\u0590՛ո֡զ֣֡ճ֥֨֗֞֯ձ֢խցիַ֤֭֨֏֫֔պն֍ֶ֔ս֢֖֕փվֺ֞քֺֺּׂ֮֮֔֠\u05ce׃֕\u058cְֵֶ֚֗֒֬זִ֯ז֢כ֖ו֦ףֺ֦ףיְ",
                  (byte)44,
                  69
               );
               b[36] = NLoginCore_575.D(
                  "ҳҬ҅҇ҟѴҐҳѺ҅ҳѳѻҶҫӀҏѵҺҡҲ҅҇ӂқӈҹ҇ҠҨӋҥҭӉӏӃҤҤҢҸҔҨӑҙҔӏҘҴҚӣӘҽӠҟҞӥҼәӫҫӀӞҰӛӱӐӞүүӂӵӖӫҴӻӾҸӟӹөҸӯӏӂӆӾӤӢӉӹӈӹӢӈӨԆӊԋԔԄӰӤөӥӒӚӱөԔԘӽӝӬԍԑԔԟӣԅԪԇԪӸԈԧӷԩԇԇԯԨӾӵԟԏԈԘԐԩԙԐӽԴӷԼԂՅԔԀԟԟՁԴӽԄԪԟԉՄԣՎԢՋԱԠԭՎ՚ԐՍԲՏ՝ԽՓՎԱ\u0557ՌԵՕ՛ՒԟԳ՝Ն՝ըՈԾԭճա՝աՌՉՎԴդՋՖ\u0558վծ՝Տչատ\u0557ձյ՛՚մցՖսծչ։ֈջ֍դցՌժձՋ։ջՒ։\u0557տ֚իշ֤՞շդբռֆք֜ջք֊օְ։։լֵ֠ֆ֡ց֣֏֓ն֑֬ջ֬տִ\u0590֙շֱ֕\u0590֢֖֗վֆևׁ֙֬ג֍֔֨֎\u05c9\u05cc֨ו\u05caךמ\u05c9ֻ֪֜\u05caֲֵ֬֝ל\u05c8֣ת\u05ca֩\u05cd־םתֲ֬כֽ֮֯\u05ccא\u05cdֳױ\u05f5֯\u05fe\u05f6\u05ecֹ\u05ecפנׁ\u05feנ\u05f9פ׃חיׇ\u05ceנ\u05ec\u05fd؆אעאו\u05ffףؚ؋ؑ\u05f5؈؏״\u05fe\u0600؝\u05fd\u05ecؖ؟\u05ff\u05ec\u05ed",
                  (byte)44,
                  68
               );
               b[37] = NLoginCore_427.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀\u058bս֖֜֞և׃֧֝ֈ׀֞\u05ce֥։ְֳ֢\u05cc֛ׄ֜",
                  (byte)44,
                  69
               );
               b[38] = NLoginCore_183.F(
                  "ԿՐԱՖՔ՚\u0557ՒԟԜՈժԧ\u0558ՆԮԣ՜ԯՍՄՠլնըԹ\u0558ԺղՙԱտտՒԻՍՔՅ՛ՙըՃդՠ֎ցգփ՝եձՔհ֔թՕՑե՛ՎօձվոջՙՕղօդ֠ճ֝չ֥֗լջտ֚֯փս֮։ַָ֑֦֪֓֘\u058cռ׀ֈֵոֶ֟ք֘֝֒տ֧։֛֚\u05cd\u058cׄ\u05c9ׁ֥\u05caֵ֧זֶ֓\u05ceׇ֥ךמהַו֜֡֬אֶ֢֘־נ\u05ccפ֫\u05cd\u05ec\u05ed\u05eeם\u05cfװׇן\u05ceׅאשװץַװ־\u05fc\u05ca\u05ccֿ\u05ed\u05cfזװ׀דכׅתו؏\u0602؎؇\u05fcג\u0602אײ\u0603פס؍\u0603תؗםרױ\u05f8\u05ebׯסנ\u05f9מ\u0605\u05f8اף\u05f9ؠ\u05feذج\u05eeؒ\u0604\u05ec؊ضؓرعة\u0604؊ؾ؆شؚف؞ؤآ\u0600ظسصؒ؇ؠؘإؙؾؽثآلؒيرٌوئقضستذَس٠تؼٖحعْا٣ْئوثوِٞٚف٦٥ضٵ١٨ٵٰٙٔٹٍپٷٝ٢ٰٖڇٲغٝي٫ٸڍ٦٨ٝڅًڋٴِډ٥ّْٴ٣ٽژٙڜٶٙ٠٭ٞٷڥپڐ١٨ڬڕڄٿڈڪٰٱڄڝڳڴٻټ",
                  (byte)44,
                  70
               );
               b[39] = NLoginCore_451.E("ԱՏաԛԛՅՃ՜եԦԺՋՎԫՀԩթ՚ժԮԽմԻԼ", (byte)44, 69);
               b[40] = NLoginCore_530.A("įĈĳľĬŉŒīĢŋńğ", (byte)44, 65);
               b[41] = NLoginCore_183.C("ѲҢҕҥѳҏѳѵҰѸ҉ѷҪҐҐһҕӁқһҥѹҚҽѼ҉Ҵ҄ҨҮҨӒ", (byte)44, 67);
               b[42] = NLoginCore_092.D("ґҥѽѲҀҶґҳ҆ҰҕҍҝѺҽѼҊҸҞҤҝҵҌҍ", (byte)44, 68);
               b[43] = NLoginCore_027.F("ԿՊՁԱԢԺՓԤՀԴԵՀՅի՟ԺեՋծԿզմԻԼ", (byte)44, 70);
               b[44] = NLoginCore_471.A("ĐŀĳŃđĭđēŎĖĩōĮĭřŐıōĳĕĳĽĪī", (byte)44, 65);
               b[45] = NLoginCore_453.B("ĬŃīŎŕĝŋĬĖŘĩőœŅĘĪśěŐĢŌœĪī", (byte)44, 66);
               b[46] = NLoginCore_387.A("ĥňČŅœōģĢŁĘŒŜĶŗřśĿŋŜĝŞœĪī", (byte)44, 65);
               b[47] = NLoginCore_324.A("ŀŌĭŊńńŊķĎĐĳěœŅŒŚķŌţŏţĳŘŕŉŀňŝŜŕŭĪ", (byte)44, 65);
               b[48] = NLoginCore_173.C("ґѰѯѴҎѵҸҢѵґѻҬҨҼҍҎҷѿұѽҳҏҌҍ", (byte)44, 67);
               b[49] = NLoginCore_559.A("įŏŒĤĨħĵĳıīņŃėęīğŊŝŃĳĬĽĪī", (byte)44, 65);
               b[50] = NLoginCore_004.F("ՒԚՍՓՍԟՏԲԨ\u0557զ՞եՂլՂՇՄխբՖՏՑՈՈժՓՉՓհթՍ", (byte)44, 70);
               b[51] = NLoginCore_453.B("ŁĉļłļĎľġėņŕōŔıśıĶĳŜőŅŅťŇŤňŗĤŠŃŞŁ", (byte)44, 66);
               b[52] = NLoginCore_387.C("ҍѪүҎү҃ҖҏҢҰѵѵҦҙҕѼҔѹҎүӂҟҌҍ", (byte)44, 67);
               b[53] = NLoginCore_241.B("ĻĈŌąĨďŒĠīŎŐğ", (byte)44, 66);
               b[54] = NLoginCore_324.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձհԲՆժԵզզՓհ՞Փ", (byte)44, 70);
               b[55] = NLoginCore_324.A("ĻŉĿĒĴĢĨŅřģŔģŖőěŎœśġŗŠśŧŕİĶŅġĿĦśį", (byte)44, 65);
               b[56] = NLoginCore_141.C("ҫҞҠѮѶѰҫҷҭҜҶҥҶҜґқҊҸӀҶҜҸғҸҚҁ҈ҫ҅ҽң҈", (byte)44, 67);
               b[57] = NLoginCore_091.C("ҫҞҠѮѶѰҫҷҭҜҸҭҖҭҵѿҙҋҶҰҽҵҌҍ", (byte)44, 67);
               b[58] = NLoginCore_138.D("҉ѳҦҦ҆ҮҭҬҳҋҦҩҭҕҡґѹҖӄҲ҄ҔңѿҺѽҽӃҦҡӍӏӂӓҊӐҥӘӒҪӖӍҷҩҲҝәһұһҸҭҦҷӆӅӨӕҶҾӄӭӌӧҤӠӱӌҰӊӹӚҸҭһӁ", (byte)44, 68);
               b[59] = NLoginCore_110.B("ĘċĤńįĎĲŕŒęœčŕĭĩŊĚŔıĜķĝĶĠŠĠķŊŊŇŞř", (byte)44, 66);
               b[60] = NLoginCore_324.D("ѲѫѼҢҖ҃Ҁ҇ҘѻҧѼѺҾқҺҍӃҚҔӇҳҢҒҕҼҵҕҸӃ҇ҩ", (byte)44, 68);
               b[61] = NLoginCore_397.F("բ՞ԟՏԮԣՇԢէըԢ\u0530", (byte)44, 70);
               b[62] = NLoginCore_223.A("ħŏŀŊŔĲŉĭŗŕĖĘœņĸňŁğŢİŔœĪī", (byte)44, 65);
               b[63] = NLoginCore_575.F("ԫԱՃՏ\u0530ԷԽԳՕԾԪ\u0530", (byte)44, 70);
               b[64] = NLoginCore_427.B("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļřĹŜľĭŃŅšĵūŖĿ", (byte)44, 66);
               b[65] = NLoginCore_201.B("ļőĄľģĠŇĲœŚđīŇīĶŎŜįĵĚŢńśŃťģķĝŭĵŎħ", (byte)44, 66);
               b[66] = NLoginCore_384.A("ļőĄľģĠŇĲœŚēŏĨŞňĽŘĞŗĽŘĹşŨĽŤĤļŅŬŖĮ", (byte)44, 65);
               b[67] = NLoginCore_223.F("ԽԙԹ՛ԥՂԝՖԻՒթ\u0530", (byte)44, 70);
               b[68] = NLoginCore_138.E("ՍբԕՏԴԱ\u0558ՃդիԢՌԵ\u0558թձԼբՍԪՃՁնՋԵլթսկ\u0557ՠո", (byte)44, 69);
               b[69] = NLoginCore_127.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļţŋŰŧĪıĵĶŁŦŸĿ", (byte)44, 65);
               b[70] = NLoginCore_553.F("ՍբԕՏԴԱ\u0558ՃդիԢԤՌը՛ՌԺՌճՈԽՐիաԯ\u0530թԸՋվՓ՛", (byte)44, 70);
               b[71] = NLoginCore_141.A("ČċĩļČĢıĢŒŕřœōŗřĲĭĭŔŋŠţĪī", (byte)44, 65);
               b[72] = NLoginCore_387.F("ՍբԕՏԴԱ\u0558ՃդիԢ՚ԻՉ\u0558՝ԩԼԿբՂՖԱՐ\u0557զԭՍՅ՟թշ", (byte)44, 70);
               b[73] = NLoginCore_183.B("ļőĄľģĠŇĲœŚđŋŔĪķśŠĲķşĿŘĿśńĶĶĽŋłŮġ", (byte)44, 66);
               b[74] = NLoginCore_110.B("ļőĄľģĠŇĲœŚĒĔħļĺįļĵĚŢĜĲĝĿŖĳŃŦŗńšř", (byte)44, 66);
               b[75] = NLoginCore_223.A("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŪũĩųĳŦŦŴņķŖŘĳŲĵŠůşŐľĶōŊŋ", (byte)44, 65);
               b[76] = NLoginCore_141.A("ļőĄľģĠŇĲœŚĒĻŅħĔŉŠŜğĲĵŝġĿŖłļŪŚĭĩĩŠĭīŒĪİŅĲŪŕŴĿ", (byte)44, 65);
               b[77] = NLoginCore_004.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļľŉĺŉŤįĭįũšŒĿ", (byte)44, 65);
               b[78] = NLoginCore_183.F("\u0557՝ԟՓԵԹԹԿՑԷՀ՝ՇԻՎՐժժԲ\u0530ՓմԻԼ", (byte)44, 70);
               b[79] = NLoginCore_384.E("ՂՐ\u0557ԚԺՕԼՠԡիԨԸԬԶՈԹբՀձ՝եԾԻԼ", (byte)44, 69);
               b[80] = NLoginCore_397.B("ĮĞŌğİĩĒėŊœİŊśďĲıŀĚŎġıţĪī", (byte)44, 66);
               b[81] = NLoginCore_141.E("Կԯ՝\u0530ՁԺԣԨ՛դՂԴԼըԪԩԾՐԪՋՌմԻԼ", (byte)44, 69);
               b[82] = NLoginCore_141.C("ҪҮҵҕѴҒҍҏҔҒҥҝҴѹҬѹқңҶѼҜҟҌҍ", (byte)44, 67);
               b[83] = NLoginCore_127.D("ҋѩ҉ҔүҋҒҶҖҦ҅ҕҟҴҳҲҮѹһ҄ҢҟҌҍ", (byte)44, 68);
               b[84] = NLoginCore_530.C("ҏ҄ҠҥҔҲҔҬҤҬғҶҰҞҫҮҹһҷӀӁҵҌҍ", (byte)44, 67);
               b[85] = NLoginCore_453.E("ԹաՖՙԣ՛ՅՅՕդլգ՞Զդ՛ՁբկըղՅՅմԱնծԷՔիհ՜մԻԼՔՔզՒք։\u0557՛Ր", (byte)44, 69);
               b[86] = NLoginCore_521.E("ԩ\u0530՚ԾԡէՙԤաԽՄՈԤզգ՛ԧծԥՠ՞ԾԻԼ", (byte)44, 69);
               b[87] = NLoginCore_530.B("ĽĎĥčŋŎŀĨģŅĬčĚĪŒıĩŏİŝķőŗřŕŇŢŝĨŗũūįİūŬőŋŮŒĵŌĵĻŴžĸŶźĻŷŐƄļŚƁœŝŪŗƇŗƁŞŉƑŢŏŒũƏşŔŵƘş", (byte)44, 66);
               b[88] = NLoginCore_397.D("Ҡ҆ңҨҦҌҸҐҊҖҹҗҨѼӀҔҒҞүҁҏҏҌҍ", (byte)44, 68);
               b[89] = NLoginCore_241.D("Ҝѻұҏҕѭҩ҄҂ҫҋҺҷѵҟҵҬҞґғҲҵҌҍ", (byte)44, 68);
               b[90] = NLoginCore_433.B("ĤĪōĦĿĳĤĨŊĶōĒňŐħŌįŒġĜŎţĪī", (byte)44, 66);
               b[91] = NLoginCore_223.B("ļŊĥőİğňňĹċĺğ", (byte)44, 66);
               b[92] = NLoginCore_183.C("҉҉ҴҲҥғѵҗҎѻѲһѽһѻѽңҞѼҭ҃ҟҌҍ", (byte)44, 67);
               b[93] = NLoginCore_433.D("үҜ҇ѽ҂ҩҰҊ҂ҎҼѵҰҐүѷҟҌҽҥҎҏҌҍ", (byte)44, 68);
               b[94] = NLoginCore_553.B("ĨĞĐńįġČĉĹŊńğ", (byte)44, 66);
               b[95] = NLoginCore_453.B("ıīœěŉģōİĕłŔėŇĻŜĭėŉśţŎĭĪī", (byte)44, 66);
               b[96] = NLoginCore_553.B("ĽĎĥčŋŎŀĨģŅĭŊĵėņœŜěĞĝĬœĪī", (byte)44, 66);
               b[97] = NLoginCore_471.F("ԲՊՙԷԤԤԙԹաԽ\u0558Ոՙե՚աէՁՒՇՆՕբՒոՔհԻԽԺխԾճՌցքՃՐգ։Չՠգմևխ\u0590ժթփՒդձ\u058cգնփդկճ֝ֈ֙ժ", (byte)44, 70);
               b[98] = NLoginCore_092.F("Ը՚Փ\u0530ՓԳ՛ՅՙԲԼՂԤ՟ՎՎլԫԽՁՅՎԻԼ", (byte)44, 70);
               b[99] = NLoginCore_223.E(
                  "Ց՝Ծ՛ՕՕ՛ՈԟԡՃՙԥդգէԮՏաԳՒԴնԸպՈժԵոԽ\u0557ԹնցԺՔՖՃաաոմՋվԿդժըվեՠ֎\u058bճճ֍զք֍ղ֓\u058bղնՙՠ\u058cջյ֚֡րֈ֤֒\u058bք֛֬բ֞ֆֆ֊ַ֮֠֗ք֏նֹ֧֘ո֖", (byte)44, 69
               );
               b[100] = NLoginCore_384.C("ғҡҨѫҋҦҍұѲҼѸҕҏҺһҝҹҍҟҚҤҏҌҍ", (byte)44, 67);
               b[101] = NLoginCore_397.D("ѱҩҀүүң҅Ңҫ҃ґ҉Ҝ҇ѲҋҭѺҗҼҔӅҌҍ", (byte)44, 68);
               b[102] = NLoginCore_127.B("ĘğŉĭĐŖňēŐĬĲŗĥŖİİŕľĪōĜœĪī", (byte)44, 66);
               b[103] = NLoginCore_127.E("ՍգԺ՝ՆԘՁԺՑՒզըՆԹըՙՌՇՒլՀէՆմՑԶՄՒԵԶնլՕ՞քԼՀղւզՅՖիՐ", (byte)44, 69);
               b[104] = NLoginCore_092.A("ıħōĉġġőėįĳŃēŘŎŘĨĽĞĸĲĿţĪī", (byte)44, 65);
               b[105] = NLoginCore_110.D("ұҭҦҮҟҤѵҐҺҴѳҁ", (byte)44, 68);
               b[106] = NLoginCore_451.F("աՓՓԲԽԟԢ՚ՄԺԩ՟զԠՌՀՄծժընՎԻԼ", (byte)44, 70);
               b[107] = NLoginCore_127.D("ѮѼѱҰҗҬҴҢҢґҳҶҼҗҒҬҷҀҘҏҼҷҷҀҿӅҫҦ҉ҙҹӃӆҭҞӇҔӐҲҔӘҮҨҡ", (byte)44, 68);
               b[108] = NLoginCore_446.A("ĿŎŎĎįĭķīĠĴĳōŖőĝīĝłĠŝĚĽĪī", (byte)44, 65);
               b[109] = NLoginCore_076.C("ҡҰҰѰґҏҙҍ҂ҖҔҽѷҘғҗҐҿҲҜҚҟҌҍ", (byte)44, 67);
               b[110] = NLoginCore_004.F("ԶԼՀ՞ԠԣՂ՟ՓԼԪ՜թՌըՉՎծհԴՂԾԻԼ", (byte)44, 70);
               b[111] = NLoginCore_110.D("ҊѻҎѴҥҋғѫҨ҉ҖұҶѺҚҏӂҫҳқҀҁӀѿҦҠҧҫӃӋ҆ӇӇңҤҽҐҬүӋҹҩҒҕҲӖҽҚҡӝӠҮұӕҬҭ", (byte)44, 68);
               b[112] = NLoginCore_110.F("ԶԼՀ՞ԠԣՂ՟ՓԼԡլՅդՄԺիբԪէձյՓԪղՎիպոզ՝պ", (byte)44, 70);
               b[113] = NLoginCore_027.A("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĶŞħğśŕĳťţťň", (byte)44, 65);
               b[114] = NLoginCore_091.E("ՂԿԿԻ\u0557\u0558ՐդԻԣժԣծբհձՉժհՏԫդԻԼ", (byte)44, 69);
               b[115] = NLoginCore_201.B(
                  "ĊŎŎŎŃĐņģĬňįņōħķĴšōŜĝŢĶŏşğĦśŤīĦĩŭőūīĬŨŉłūũűĶĺŬŜŕķŚŘľŸųŹůŐťŒŔžƄŵƀŁũŝƂŻŴƅňƈŪźƎųůŖŭřƒơƊƍųžƒƗƃƠŪƪƆƞŪƀŪţƏƁƨƵưſƱƈƋƧŷƒƎŵƴŽƝžƭƳƊƋ", (byte)44, 66
               );
               b[116] = NLoginCore_451.A("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵŒűĶřŰĸőĴűƀŶťŞųŖŊƊţŗŷŉ", (byte)44, 65);
               b[117] = NLoginCore_553.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆՙէԻԡ՝ԿՒ՟ՁՆիԲհգՉՖլ՝ՖՖՙԺհՃռքՂՐ՚ՁՖՠ՟դոր֊գ՜֏֑։ը֕զնՑյևռֆ՝ի", (byte)44, 70);
               b[118] = NLoginCore_471.C("Ѥҳҋѭ҄ҤҎҮҕҰҌҁ", (byte)44, 67);
               b[119] = NLoginCore_453.A("ĪŋőĩŁŁŕĨĪĐőŌĩŘĳōŏŐřĿĽţĪī", (byte)44, 65);
               b[120] = NLoginCore_110.B("ĨģĒĲĬČĬņėĹđğ", (byte)44, 66);
               b[121] = NLoginCore_433.F("ՁԻՋ\u0558ԸէԞԞԛՃՊգԣզԾլ՚՝ՌգնԾԻԼ", (byte)44, 70);
               b[122] = NLoginCore_004.E("ԻՌԾՠ՜ՐԦՑըէՠԾՃԽգԻՇ՞Ճգ՞դԻԼ", (byte)44, 69);
               b[123] = NLoginCore_127.D("ѽҤѬѲҭҵҡғҳҬҲҒҩҼҜҏҊҷӃҕҝҵҌҍ", (byte)44, 68);
               b[124] = NLoginCore_433.A("ŏĈńĊłŕĐğġĪōįĶďŉľŕšřĶŁĭĪī", (byte)44, 65);
               break;
            case 2:
               b[0] = NLoginCore_446.D("ұѥ҄ҊѴѵҦҙҋѳґҊҹҽҰҝҵҒҍӆѽҵҌҍ", (byte)44, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.E("ԗԱԙԛԝՠՀԥ՛ՂԻԣ՟ՎՇԯՍ՟ԯԭղԾԻԼ", (byte)44, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_018.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.C("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 67), NLoginType_018.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_553.E("՛ըէԪժզաժյդԱկճլկյԷࢯ࣓࣒࣒࣊ࣂࣈࣖࢴࢸՍ", (byte)60, 69) + var1 + NLoginCore_559.D("ң", (byte)60, 68) + var2.toString(), var4);
      }
   }

   public void f(NLoginCore_277 var1) {
      if (NLoginCore_134.a.ar()) {
         this.a.schedule(new NLoginCore_480(this, var1), o);
      }

      Set var2 = (Set)this.c.get(var1, var0 -> new HashSet());
      synchronized (var2) {
         var2.forEach(var2x -> this.b(var1, var2x));
         var2.clear();
      }
   }

   private void o() {
      PluginManager var1 = this.o.a().getPluginManager();
      if (var1.getPlugin(a(nu, nv)) == null && (!NLoginCore_012.U() || NLoginCore_409.a().c(NLoginCore_409.o))) {
         NLoginCore_370.e(a(nw, nx ^ ny));
         File var2 = this.o.c().getParentFile();
         File var3 = new File(var2, a(oa & ob, oc));
         if (var3.exists() && !var3.delete()) {
            var3.deleteOnExit();
            NLoginCore_370.d(a(od & oe, of) + var3 + a(og, oh ^ oi));
            return;
         }

         NLoginCore_285 var4 = NLoginCore_305.a().a(a(ok, ol ^ om), var3);
         if (var4.p() == on && var4.af()) {
            try {
               var1.loadPlugin(var3);
            } catch (Exception var6) {
               NLoginCore_370.c(a(os & ot, ou), var6);
               if (!var3.delete()) {
                  var3.deleteOnExit();
               }
            }
         } else {
            NLoginCore_370.d(a(oo, op ^ oq) + var4.p());
         }
      }
   }

   private void b(NLoginCore_277 var1, String var2) {
      this.g(var1);
      JSONObject var3 = new JSONObject(var2);
      if (!var3.has(a(av, aw ^ ax))) {
         NLoginCore_370.c(a(ay, az ^ ba));
         NLoginCore_370.c(a(bc, bd));
      } else {
         byte[] var4 = NLoginCore_158.a(var3.getString(a(bf & bg, bh)).getBytes(StandardCharsets.UTF_8));
         if (this.a == null) {
            NLoginCore_366.a(new ByteArrayInputStream(var4), this.c);
            this.m();
         }

         if (!Arrays.equals(var4, this.a)) {
            NLoginCore_370.c(a(bi & bj, bk));
            String[] var10000 = new String[bm];
            var10000[bn] = a(bo & bp, bq);
            var10000[br] = a(bs, bt);
            var10000[bu] = a(bv, bw ^ bx);
            String var13 = NLoginCore_112.a(var10000);
            var1.a(var13);
         } else {
            if (var3.has(a(by, bz))) {
               JSONArray var5 = var3.getJSONArray(a(ca, cb ^ cc));
               if (var5.length() == 0) {
                  throw new IllegalArgumentException(a(cd, ce ^ cf));
               }

               for (int var6 = cg; var6 < var5.length(); var6++) {
                  JSONObject var7 = var5.getJSONObject(var6);

                  try {
                     this.a(var1, var7);
                  } catch (JSONException var11) {
                     int var14 = var7.getInt(a(ch, ci));
                     String var15 = var7.getString(a(cj, ck ^ cl));
                     NLoginCore_370.c(a(cm, cn) + var14 + a(co & cp, cq) + var15 + a(cr, cs ^ ct) + var6 + a(cu, cv), var11);
                  } catch (Exception var12) {
                     int var9 = var7.getInt(a(cx, cy));
                     String var10 = var7.getString(a(cz, da ^ db));
                     NLoginCore_370.c(a(dc, dd) + var9 + a(de, df ^ dg) + var10 + a(dh, di ^ dj) + var6 + a(dk, dl ^ dm), var12);
                  }
               }
            } else {
               this.a(var1, var3);
            }
         }
      }
   }

   public CompletableFuture<JSONObject> a(NLoginCore_277 var1, NLoginCore_121 var2, Object... var3) {
      CompletableFuture var4 = new CompletableFuture();
      synchronized (this.e) {
         long var6 = this.b.incrementAndGet();
         this.e.put(var6, var4);
         int var10002 = mi;
         Object[] var10003 = new Object[mj];
         var10003[mk] = a(ml & mm, mn);
         var10003[mo] = var6;
         var10003[mp] = a(mq, mr);
         var10003[ms] = var2.b();
         var10003[mt] = a(mu & mv, mw);
         var10003[mx] = var2.a(var3);
         this.a(var1, var10002, var10003);
         return var4;
      }
   }

   private void m() {
      if (this.a != null) {
         throw new IllegalStateException(a(l & m, n));
      } else {
         if (this.c.exists()) {
            this.a = Files.readAllBytes(this.c.toPath());
         }
      }
   }

   public void n() {
      this.o.a().a(a(p, q ^ r), this.a);
   }

   private static String a(int var0, long var1) {
      var1 ^= 67L;
      var1 ^= 5784730766355040943L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(20 + 49),
                     (byte)(10 + 73),
                     (byte)(9 + 38),
                     (byte)(49 + 18),
                     66,
                     (byte)(47 + 20),
                     (byte)(40 + 7),
                     (byte)(11 + 69),
                     (byte)(73 + 2),
                     (byte)(43 + 24),
                     (byte)(50 + 33),
                     (byte)(28 + 25),
                     (byte)(44 + 36),
                     97,
                     (byte)(21 + 79),
                     (byte)(75 + 25),
                     (byte)(59 + 46),
                     (byte)(83 + 27),
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(12 + 56), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.B("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲҪӎӅӍӍҽӃӑүҳ", (byte)58, 66));
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

   private void b(NLoginCore_277 var1, byte[] var2) {
      try {
         if (var2.length == 0) {
            return;
         }

         String var3 = new String(var2, StandardCharsets.UTF_8);
         if (var3.isEmpty()) {
            return;
         }

         try {
            if (var3.charAt(w) == x && var3.charAt(var3.length() - y) == z) {
               this.b(var1, var3);
               return;
            }

            String var8 = a(aa, ab ^ ac);
            Object[] var10001 = new Object[ad];
            var10001[ae] = var3;
            NLoginCore_370.d(var8, var10001);
         } catch (JSONException var6) {
            String var10000 = a(af, ag ^ ah);
            Object[] var10002 = new Object[ai];
            var10002[aj] = var3;
            NLoginCore_370.c(var10000, var6, var10002);
         }
      } catch (Exception var7) {
         if (var2[ak] != al) {
            long var4 = System.currentTimeMillis();
            if (var4 - this.d >= am) {
               this.d = var4;
               NLoginCore_370.d(a(an & ao, ap));
            }
         } else {
            NLoginCore_370.c(a(ar, as ^ at), var7);
         }
      }
   }

   public void a(NLoginCore_277 var1, int var2, Object... var3) {
      if (var3.length % my != 0) {
         throw new IllegalArgumentException(a(mz, na ^ nb));
      } else {
         JSONObject var4 = new JSONObject();
         if (this.a != null) {
            var4.put(a(nc & nd, ne), NLoginCore_158.a(this.a));
         }

         var4.put(a(nf, ng ^ nh), var2);
         var4.put(a(ni & nj, nk), var1.getName());

         for (int var5 = nl; var5 < var3.length; var5++) {
            Object var6 = var3[var5++];
            if (!(var6 instanceof String)) {
               throw new IllegalArgumentException(a(nm, nn ^ no) + var6);
            }

            Object var7 = var3[var5];
            var4.put((String)var6, var7 != null ? var7 : JSONObject.NULL);
         }

         byte[] var9 = var4.toString().getBytes(StandardCharsets.UTF_8);
         if (!this.o.a().b().a(var1, a(np, nq), var9)) {
            var1.a(this.o, NLoginCore_337.b, a(nr & ns, nt), var9);
         }
      }
   }

   static {
      b();
   }

   public NLoginType_018(nLoginBukkit var1) {
      this.c = Caffeine.newBuilder().expireAfterAccess(a, TimeUnit.SECONDS).build();
      this.d = Caffeine.newBuilder().expireAfterWrite(b, TimeUnit.SECONDS).build();
      this.a = new Object();
      this.b = new AtomicLong();
      this.e = Caffeine.newBuilder().expireAfterWrite(f, TimeUnit.SECONDS).build();
      this.o = var1;
      this.a = new Timer(var1.q() + a(g, h ^ i));
      this.c = new File(var1.c(), a(j, k));
      this.m();
   }
}
