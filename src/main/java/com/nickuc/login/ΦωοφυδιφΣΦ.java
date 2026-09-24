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

public class ΦωοφυδιφΣΦ {
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
   private final Cache<ΨαχΨχΣλεΠψΦ, Object> d;
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
   private static int do = 134217728 >>> 86 | 134217728 << -86;
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
   private final μφλκζΦθζχΔΩλτςΣ a = new μφλκζΦθζχΔΩλτςΣ(this);
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
   private final Cache<ΨαχΨχΣλεΠψΦ, Set<byte[]>> c;
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
   private static float if = Float.intBitsToFloat(Integer.reverse(3714));
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
   private static String[] a = new String[ΦωοφυδιφΣΦ.pq];
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

   public void a(ΨαχΨχΣλεΠψΦ var1, byte[] var2) {
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
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(s, t ^ u), var7);
      }
   }

   public void g(ΨαχΨχΣλεΠψΦ var1) {
      synchronized (this.d) {
         this.d.put(var1, this.a);
      }
   }

   private void a(ΨαχΨχΣλεΠψΦ var1, JSONObject var2) {
      String var3 = var1.getName();
      int var4 = var2.getInt(c<"㺀">(do, dp));
      ΨγημιδξΓτοθαζ var5 = this.o.a();
      εσλρΔμΔψχεθυνΔ var6 = var5.a();
      switch (var4) {
         case -1:
            String var27 = var2.getString(c<"㺃">(dq & dr, ds));
            boolean var34 = var2.getBoolean(c<"㺆">(dt, du ^ dv));
            if (!var34) {
               Player var41 = var1.c();
               ΓχυψπωΣςΠκγζΦ.a(var41, εδδΠηδξΛΣχ.j() ? c<"㺉">(dw & dx, dy) + var27 + c<"㺌">(dz, ea ^ eb) : c<"㺏">(ec, ed ^ ee) + var27 + c<"㺒">(ef, eg ^ eh));
            }
            break;
         case 0:
            int var26 = var2.getInt(c<"㺕">(ei & ej, ek));
            switch (var26) {
               case 0:
                  String var33 = var2.getString(c<"㺘">(el, em ^ en));
                  File var40 = new File(this.o.c(), c<"㺛">(eo & ep, eq));
                  long var46 = System.currentTimeMillis();
                  if (var46 - this.a.getAndSet(var46) <= er || var40.exists() && ΦνςαΦΣμΩΨΣΦπρ.d.a(var40, var33)) {
                     Object[] var67 = new Object[ez];
                     var67[fa] = c<"㺡">(fb & fc, fd);
                     var67[fe] = ff;
                     this.a(var1, var4, var67);
                  } else {
                     Object[] var66 = new Object[es];
                     var66[et] = c<"㺞">(eu, ev ^ ew);
                     var66[ex] = ey;
                     this.a(var1, var4, var66);
                  }

                  return;
               case 1:
                  File var32 = new File(this.o.c(), c<"㺤">(fg & fh, fi));

                  try {
                     if (!var32.exists() || !ΦνςαΦΣμΩΨΣΦπρ.d.a(var32, var2.getString(c<"㺧">(fj, fk ^ fl))) && var32.delete()) {
                        ByteArrayInputStream var39 = πελπφβυψεσαωοΦ.a(var2.getString(c<"㺪">(fm, fn ^ fo)));
                        πησοιΣζΩθΛδλζσ.a(var39, var32);
                        δψφΨσψελΓ.a(this.o, (boolean)fp);
                        return;
                     }
                  } catch (IOException var20) {
                     ψΓωτιμωκχψΛΨ.c(c<"㺭">(fq, fr ^ fs) + var32.getName() + c<"㺰">(ft, fu), var20);
                  }

                  return;
               default:
                  return;
            }
         case 1:
            ιηοψσγξςΩγδ var25 = var6.b(var1);
            λΓλχΩαοΨωθτοςΓ var31 = (λΓλχΩαοΨωθτοςΓ)var5.b();
            int var38 = var2.getInt(c<"㺳">(fw & fx, fy));
            switch (var38) {
               case 0:
                  if (!var6.b(var1)) {
                     int var45 = var2.has(c<"㺶">(fz, ga ^ gb)) ? var2.getBoolean(c<"㺹">(gc & gd, ge)) : (!var2.getBoolean(c<"㺼">(gf & gg, gh)) ? gi : gj);
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
               int var24 = var2.getInt(c<"㺿">(gk & gl, gm));
               int var30 = var2.has(c<"㻂">(gn, go)) && var2.getBoolean(c<"㻅">(gp, gq ^ gr)) ? gs : gt;
               int var37 = var2.has(c<"㻈">(gu, gv ^ gw)) && !var2.getBoolean(c<"㻋">(gx, gy)) ? ha : gz;
               ιηοψσγξςΩγδ var44 = var6.b(var1);
               if (var37 != 0) {
                  var1.a().a(new PlayerLimboRestoreTask(() -> var5.b().a(var1, var44)));
               } else {
                  var44.a(πβκνλοΛκΠδΦτφλ.y, Boolean.valueOf((boolean)hb));
               }

               var44.a(οωλθςδυΛβσΨδγπ.g, null);
               if (var30 != 0) {
                  Player var50 = var1.c();
                  this.o.b((boolean)hc).a(() -> var5.callEvent(new AuthenticateEvent(var50)));
               }

               ψΓωτιμωκχψΛΨ.b(var3 + c<"㻎">(hd & he, hf) + var24 + c<"㻑">(hg, hh ^ hi) + var30 + c<"㻔">(hj, hk ^ hl) + var37 + c<"㻗">(hm, hn ^ ho));
            }
            break;
         case 3:
            Player var23 = var1.c();
            μθκβΠυξωδΠΠγ var29 = this.o.a().a();
            ιηοψσγξςΩγδ var36 = ΨγημιδξΓτοθαζ.c().a().b(var1);
            πααΔΣνΨγνθυ var43 = var36.a();
            int var49 = var2.getInt(c<"㻚">(hq, hr));
            switch (var49) {
               case 0:
                  ραδκμΠΔαωεηεΛ var54 = ραδκμΠΔαωεηεΛ.a(var2.getString(c<"㻝">(hs, ht ^ hu)));
                  if (var54 != null) {
                     if (var54 == ραδκμΠΔαωεηεΛ.f) {
                        var29.a(var54.aE(), (boolean)hv).ag();
                     } else {
                        var29.a(var54.aE(), ξπχιβρμογιω.a(var23.getLocation())).ag();
                     }

                     String var58 = var2.getString(c<"㻠">(hw, hx ^ hy));
                     if (var58 != null) {
                        εθσξξτΛακπΣ var62 = εθσξξτΛακπΣ.a(var58);
                        ψΓφτδκφΨςχτ.a(var5, var43, var62);
                     }

                     if (var54 == ραδκμΠΔαωεηεΛ.f && !var29.c(ραδκμΠΔαωεηεΛ.a.aE())) {
                        var43.a(var2.getString(c<"㻣">(hz & ia, ib)));
                        εδδΠηδξΛΣχ.a(var1, εξνσΔχΣεθθζΔαΠζ.F);
                     } else {
                        var43.a(var2.getString(c<"㻦">(ic & id, ie)));
                        εδδΠηδξΛΣχ.a(var1, εξνσΔχΣεθθζΔαΠζ.C, if, ig);
                     }

                     λΓλχΩαοΨωθτοςΓ var63 = (λΓλχΩαοΨωθτοςΓ)var5.b();
                     var63.a().a(var5, (boolean)ih);
                  }

                  return;
               case 1:
                  ραδκμΠΔαωεηεΛ var53 = ραδκμΠΔαωεηεΛ.a(var2.getString(c<"㻩">(ii, ij ^ ik)));
                  if (var53 != null) {
                     String var57 = var29.k(var53.aE());
                     if (var57 == null) {
                        var43.a(var2.getString(c<"㻬">(il, im ^ in)));
                     } else {
                        if (var53 == ραδκμΠΔαωεηεΛ.f) {
                           var29.a(var53.aE(), (boolean)io).ag();
                        } else {
                           var29.a(var53.aE()).ag();
                        }

                        String var61 = var2.getString(c<"㻯">(ip, iq ^ ir));
                        if (var61 != null) {
                           εθσξξτΛακπΣ var64 = εθσξξτΛακπΣ.a(var61);
                           ψΓφτδκφΨςχτ.a(var5, var43, var64);
                        }

                        var43.a(var2.getString(c<"㻲">(is, it ^ iu)));
                        εδδΠηδξΛΣχ.a(var1, εξνσΔχΣεθθζΔαΠζ.C, iv, iw);
                        λΓλχΩαοΨωθτοςΓ var65 = (λΓλχΩαοΨωθτοςΓ)var5.b();
                        var65.a().a(var5, (boolean)ix);
                     }

                     return;
                  }

                  return;
               case 2:
                  ραδκμΠΔαωεηεΛ var52 = ραδκμΠΔαωεηεΛ.a(var2.getString(c<"㻵">(iy, iz)));
                  if (var52 != null && var52 != ραδκμΠΔαωεηεΛ.f) {
                     try {
                        String var56 = var29.k(var52.aE());
                        if (var56 == null) {
                           var43.a(var2.getString(c<"㻸">(ja, jb ^ jc)));
                           return;
                        } else {
                           Location var60 = ξπχιβρμογιω.a(var56);
                           if (var60 == null) {
                              var43.a(var2.getString(c<"㻻">(jd & je, jf)));
                           } else {
                              var1.a().a(new SynchronizeWithServerThreadTask(() -> {
                                 if (ΓχυψπωΣςΠκγζΦ.V()) {
                                    var23.teleportAsync(var60, TeleportCause.PLUGIN);
                                 } else {
                                    var23.teleport(var60, TeleportCause.PLUGIN);
                                 }
                              }));
                              var43.a(var2.getString(c<"㻾">(jg, jh ^ ji)));
                           }

                           return;
                        }
                     } catch (Exception var19) {
                        ψΓωτιμωκχψΛΨ.c(c<"㼁">(jj, jk ^ jl) + var19.getLocalizedMessage(), var19);
                        var43.a(var2.getString(c<"㼄">(jn, jo ^ jp)));
                        return;
                     }
                  }

                  return;
               case 3:
               default:
                  return;
               case 4:
                  String var51 = var2.getString(c<"㼇">(jq & jr, js));
                  if (var51 != null) {
                     εθσξξτΛακπΣ var55 = εθσξξτΛακπΣ.a(var51);
                     ψΓφτδκφΨςχτ.a(var5, var43, var55);
                  }

                  return;
            }
         case 4:
            Player var22 = var1.c();
            int var28 = var2.getInt(c<"㼊">(jt & ju, jv));
            var1.a().a(new SynchronizeWithServerThreadTask(() -> {
               switch (var28) {
                  case 0:
                     εξνσΔχΣεθθζΔαΠζ var9x = εξνσΔχΣεθθζΔαΠζ.valueOf(var2.getString(c<"㺀">(ow, ox ^ oy)));
                     float var10x = var2.getFloat(c<"㺃">(oz, pa));
                     float var7x = var2.getFloat(c<"㺆">(pb, pc ^ pd));
                     var9x.a(var3xx -> var22.playSound(var22.getLocation(), var3xx, var10x, var7x));
                     break;
                  case 1:
                     String var8x = var2.getString(c<"㺉">(pe & pf, pg));
                     boolean var6x = var2.getBoolean(c<"㺌">(ph & pi, pj));
                     if (var6x) {
                        this.o.b().a().l(var8x);
                     } else {
                        var1.p(var8x);
                     }
                     break;
                  case 2:
                     String var5x = var2.getString(c<"㺏">(pk, pl ^ pm));
                     if (c<"㺒">(pn, po ^ pp).equalsIgnoreCase(var5x)) {
                        this.o();
                     }
               }
            }));
         case 5:
         default:
            break;
         case 6:
            long var21 = var2.getLong(c<"㼍">(jw & jx, jy));
            synchronized (this.e) {
               CompletableFuture var42 = (CompletableFuture)this.e.getIfPresent(var21);
               if (var42 != null) {
                  this.e.invalidate(var21);
                  if (var2.has(c<"㼐">(jz, ka))) {
                     String var47 = var2.getString(c<"㼓">(kb, kc ^ kd));
                     var42.completeExceptionally(new RuntimeException(var47));
                  } else {
                     Object var48 = var2.get(c<"㼖">(ke & kf, kg));
                     var42.complete(var48 instanceof JSONObject ? (JSONObject)var48 : null);
                  }
               }
               break;
            }
         case 7:
            EventEnum var7 = EventEnum.valueOf(var2.getString(c<"㼙">(kh, ki)));
            if (!var7.isForwardEvent()) {
               throw new IllegalArgumentException(c<"㼜">(kj, kk) + var7 + c<"㼟">(kl & km, kn));
            }

            JSONArray var8 = var2.getJSONArray(c<"㼢">(ko, kp));
            Object[] var9 = new Object[var8.length()];
            Class[] var10 = var7.getRewrittenClasses();
            if (var9.length != var10.length) {
               throw new RuntimeException(c<"㼥">(kq, kr ^ ks) + var9.length + c<"㼨">(kt, ku ^ kv) + var10.length + c<"㼫">(kw, kx) + var7);
            }

            for (int var11 = ky; var11 < var9.length; var11++) {
               JSONObject var12 = var8.getJSONObject(var11);
               Class var13 = var10[var11];
               if (EventPlayer.class.isAssignableFrom(var13)) {
                  var9[var11] = var1.c();
               } else if (!String[].class.isAssignableFrom(var13)) {
                  if (UUID.class.isAssignableFrom(var13)) {
                     var9[var11] = var2.has(c<"㼴">(lh, li ^ lj)) ? λΣσΣκΓβΠΨ.c(var2.getString(c<"㼷">(lk, ll))) : null;
                  } else {
                     Object var59 = var12.has(c<"㼺">(lm, ln)) ? var12.get(c<"㼽">(lo, lp ^ lq)) : null;
                     if (Enum.class.isAssignableFrom(var13)) {
                        if (!(var59 instanceof String)) {
                           throw new RuntimeException(c<"㽀">(lr, ls ^ lt) + var11 + c<"㽃">(lu, lv));
                        }

                        try {
                           String var10003 = c<"㽆">(lw & lx, ly);
                           Class[] var10004 = new Class[lz];
                           var10004[ma] = String.class;
                           Method var10002 = var13.getMethod(var10003, var10004);
                           Object[] var68 = new Object[mb];
                           var68[mc] = (String)var59;
                           var9[var11] = var10002.invoke(null, var68);
                        } catch (ReflectiveOperationException var17) {
                           ψΓωτιμωκχψΛΨ.c(c<"㽉">(md, me ^ mf), var17);
                        }
                     } else {
                        var9[var11] = var59;
                     }
                  }
               } else if (!var2.has(c<"㼮">(kz, la ^ lb))) {
                  var9[var11] = new String[lg];
               } else {
                  JSONArray var14 = var2.getJSONArray(c<"㼱">(lc, ld ^ le));
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
               b[0] = οΩνΩρωλΨηΛδωδ.D("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈ҄ӍҩҝҞҖғӍӓҵҴҡ", (byte)44, 68);
               b[1] = θεωψξβΛσσ.E("ԩԸՀԾԿՑՂՈԸզժԩԭեՎԨՌՃԫէ\u0530մԻԼ", (byte)44, 69);
               b[2] = θεωψξβΛσσ.D("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝҽҜҳҠҧҤҗӒәҸҗҡ", (byte)44, 68);
               b[3] = ΣερμΔσατσκ.D("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 68);
               b[4] = ξψθρΣΠΣς.C("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 67);
               b[5] = βθκςνθΩθυμςτκχ.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӥҽҪӧӍӠӠӳӯӭӦӁ", (byte)44, 68);
               b[6] = ΣφδσΔζιΠρα.A("ćđĭĞĪħđĉĖęīčĳķŜļŌĸįļŎĠĘŔĞťūŘţĬłŪĮħłőŝŋĳũŪůĬŪųųĶőƀľŭśžŸŞřŤŞŁŇŠŕźſƃśňƅūžžƑƍƋƄş", (byte)44, 65);
               b[7] = βεξΠθρρςΔΦμ.B(
                  "ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧţŃŬŗœŇůšŵĵžķƅņŘŪŀŊņŃƆƄũťƓƀŝŒşŴŕƂƓōƓŦƏŖŰřŹƒŠƆƠƚŹƪƀžƢƧūƁƊƤũƌƧƍƖƭƫơƨŵƇƖƲƽƽƚƵžƿƕƯƣƀƾƽơǈƶƝǄ",
                  (byte)44,
                  66
               );
               b[8] = ΣδτΠνεγοΓορητ.D("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 68);
               b[9] = ντθΔζβΔζ.F("ԺԷԱեՃբԱԼՒժԻ\u0530", (byte)44, 70);
               b[10] = ςπυηννναΣ.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťŸūůƟşƙſƌſŽŽŪū", (byte)44, 66);
               b[11] = φΨαξωυθανΣφυκη.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲӇҨӗӅӉӀӡӮӢҿҧ", (byte)44, 67);
               b[12] = πηγμΣΔκκ.A("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 65);
               b[13] = πψυκΠΨμΛΩβΣφμφσ.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԪԫԦԹԻԩԱլիՐ՟յմԳԸԸէ\u0558էԹըԾռՔաՅՓր\u0557սոճւչգեծղ֎֓փէցՖհ\u058cէշլՏ֎ն֏կ՝յյ֍աՠ֗ա֞֕հ", (byte)44, 69);
               b[14] = ςπυηννναΣ.B("ĬĪőğĠďĐŒĩİĔīŉśĐĹĖśőŔĖŤĳĠĶĽŇŁŉĺķŅİŲĽŏŃŇŏűŗŖũźŶťŏŨƀřŲĺĽļŢżœƂźŧňƇţŪŉŽŰűťƍƑşŖťŘŭżƒŰƊŬơųşƗŢƁƚƛŽšƩţūƁż", (byte)44, 66);
               b[15] = δΛψπξκσβγςα.D("ѾҰҢҀҶҨҶѱҊҏ҄ҁ", (byte)44, 68);
               b[16] = ζοηκορΦνΣθγΩ.A(
                  "ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǀƱƴƧƾǟǕǨǛƬƪ",
                  (byte)44,
                  65
               );
               b[17] = μζξτΩσσφυδεπλΨ.A("ĞĩĠņĊĵŁĬĪŊŘğ", (byte)44, 65);
               b[18] = χΠξΦιζΨΣωΦσΨζ.D("Ҁҋ҂ҨѬҗңҎҌҬҺҁ", (byte)44, 68);
               b[19] = ΦδφπθΩΩλζξ.F("ՎաՙՅԲԟԧ\u0558ԹՕԤթՊծԡԺԺ՜ՓձՔՑնՊ\u0558ժճէԼհԻԽնՙԹփՀՙՒՆՈՒՆՐ", (byte)44, 70);
               b[20] = θεωψξβΛσσ.E("ԿԲԵԱԸԘ\u0557դ\u0557բԷ\u0530", (byte)44, 69);
               b[21] = ΦδφπθΩΩλζξ.C("ѰңҒҴѬҟҧ҅ҪҊҮҁ", (byte)44, 67);
               b[22] = μζξτΩσσφυδεπλΨ.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԮՔԪճզզ՝ըՈԷՓ", (byte)44, 69);
               b[23] = ΣερμΔσατσκ.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
               b[24] = ΣφδσΔζιΠρα.E("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 69);
               b[25] = οοθδΨιοΦΠβδζ.D("ҬҌ҄ҍѱҐґҍѸ҆Ҳҁ", (byte)44, 68);
               b[26] = ΠΛΨοδΩσμνΛγΦφβς.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
               b[27] = ΦδφπθΩΩλζξ.F("ԟՒՁգԛՎՖԴՙԹ՝\u0530", (byte)44, 70);
               b[28] = πψυκΠΨμΛΩβΣφμφσ.C("ҢҮҏҬҦҦҬҙѰѲҕѶҷѶҟѽҌѵҾҢҘҒҔҾ҃ҜҩҿҖӍ҆ӉҠҞҔӀҶӋӒҙґҧӎҡ", (byte)44, 67);
               b[29] = ΠΛΨοδΩσμνΛγΦφβς.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
               b[30] = φδχεθοκψαλΛογλ.F("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 70);
               b[31] = ΣδτΠνεγοΓορητ.B("ŊĪĢīďĮįīĖĤŐğ", (byte)44, 66);
               b[32] = ςΦζσμτΓσ.A("ĮġĤĠħćņœņőĦğ", (byte)44, 65);
               b[33] = ντθΔζβΔζ.F("ԼԛԛԟԾ\u0558ՏՈՉԵԣՃ\u0558ՇԨթՇ\u0530լՃՇդԻԼ", (byte)44, 70);
               b[34] = μζξτΩσσφυδεπλΨ.A("ŐĮĮąŎŔēĨĐŔĢŕĜīŗŔŜĠĜļŤţĪī", (byte)44, 65);
               b[35] = φδχεθοκψαλΛογλ.D(
                  "ҎҌҳҁ҂ѱѲҴҋҒѴҔҼҪҠѽѾҘѾӄӇӆӈӊ҂қҦӄҙҌҧҧҿӇҳӔӅҸҬӘҩҬҬҹҖӘӑӐҲҙӞҳҦӆӥҳҡӊӇӢӤәӝӍӨӒӌӡҬӉӲҷӴӲӄӹӶӨӯԀӂӳҾӒҼӾӹӵԈӠӼӥӋӇӞӥԇӎӦӳӧӔӏӯԋӕԋӥԓԋӿԍӿӱԟԔӦӥԩԕӡӤԡԤӸԪԟӮ",
                  (byte)44,
                  68
               );
               b[36] = πηγμΣΔκκ.A(
                  "őŊģĥĽĒĮőĘģőđęŔŉŞĭēŘĿŐģĥŠĹŦŗĥľņũŃŋŧŭšłłŀŖĲņůķĲŭĶŒĸƁŶśžĽļƃŚŷƉŉŞżŎŹƏŮżōōŠƓŴƉŒƙƜŖŽƗƇŖƍŭŠŤƜƂƀŧƗŦƗƀŦƆƤŨƩƲƢƎƂƇƃŰŸƏƇƲƶƛŻƊƫƯƲƽƁƣǈƥǈƖƦǅƕǇƥƥǍǆƜƓƽƭƦƶƮǇƷƮƛǒƕǚƠǣƲƞƽƽǟǒƛƢǈƽƧǢǁǬǀǩǏƾǋǬǸƮǫǐǭǻǛǱǬǏǵǪǓǳǹǰƽǑǻǤǻȆǦǜǋȑǿǻǿǪǧǬǒȂǩǴǶȜȌǻǭȗǿȝǵȏȓǹǸȒȟǴțȌȗȧȦșȫȂȟǪȈȏǩȧșǰȧǵȝȸȉȕɂǼȕȂȀȚȤȢȺșȢȨȣɎȧȧȊɓȾȤȿȟɁȭȱȔȯɊșɊȝɒȮȷȕɏȳȮɀȴȵȜȤȥɟȷɊɰȫȲɆȬɧɪɆɳɨɸɼɧȺɈəɨɐɊȻɓɺɦɁʈɨɇɫɜɻʈɊɐɹɍɛɌɪɮɫɑʏʓɍʜʔʊɗʊʂɾɟʜɾʗʂɡɵɷɥɬɾʊʛɦʈʠʫʦɯʒʌʳʥʒɿ",
                  (byte)44,
                  65
               );
               b[37] = πψυκΠΨμΛΩβΣφμφσ.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀\u058bս֖֜֞և׃֝֩\u058b\u05cc֝֏֪֣\u058c։׀֛֮֬֜",
                  (byte)44,
                  69
               );
               b[38] = βθκςνθΩθυμςτκχ.B(
                  "ĮĿĠŅŃŉņŁĎċķřĖŇĵĝĒŋĞļĳŏśťŗĨŇĩšňĠŮŮŁĪļŃĴŊňŗĲœŏŽŰŒŲŌŔŠŃşƃŘńŀŔŊĽŴŠŭŧŪňńšŴœƏŢƌŨƔƆśŪŮƞƉŲŬƝŸƦƀƕƂƇƙƧŻūƯŷƤŧƎƥųƇƌƁŮƖŸƊƉƼŻƳƸƔưƹƖƤǅƥƂƽƶƔǉǍǃƦǄƋƐƛƿƇƥƑƭǏƻǓƚƼǛǜǝǌƾǟƶǎƽƴƿǘǟǔƦǟƭǫƹƻƮǜƾǅǟƯǂǊƴǙǄǾǱǽǶǫǁǱƿǡǲǓǐǼǲǙȆǌǗǠǧǚǞǐǏǨǍǴǧȖǒǨȏǭȟțǝȁǳǛǹȥȂȠȨȘǳǹȭǵȣȉȰȍȓȑǯȧȢȤȁǶȏȇȔȈȭȬȚȑȳȁȹȠȻȷȕȱȥȢșȟȽȢɏșȫɅȜȨɁȖɒɁȹɃȷȚȷȿɍɉȰɕɔȥɤɐɗɤɟɈɃɨȼɭɦɌɑɟɅɶɡȩɌȹɚɧɼɕɗɌɴȺɺɣȿɸɔɀɁɣɒɬʇɈʋɥɤɽʁʂʒɝɐʎʏʘɮɟ",
                  (byte)44,
                  66
               );
               b[39] = ΦδφπθΩΩλζξ.B("ĐĲĤĽĪćĿĲĤŊĺğ", (byte)44, 66);
               b[40] = μεςΩΔΣγν.F("ԸԢՍԚԿԝՁդաՉԢ\u0530", (byte)44, 70);
               b[41] = ΠΛΨοδΩσμνΛγΦφβς.C("ѲҢҕҥѳҏѳѵҰѸҋҸҞҮ҉ҒӃҒҗҟӆӅҌҍ", (byte)44, 67);
               b[42] = ΠΛΨοδΩσμνΛγΦφβς.C("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 67);
               b[43] = οΩνΩρωλΨηΛδωδ.A("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 65);
               b[44] = μεςΩΔΣγν.A("ĐŀĳŃđĭđēŎĖĩŖļŌħİšİĵĽŤţĪī", (byte)44, 65);
               b[45] = ΨφιωσρΓδΔθ.F("ԸԢՍԚԿԝՁդաՉԢ\u0530", (byte)44, 70);
               b[46] = ΣερμΔσατσκ.E("ՒՐՓԚԲԻՙԠ՛Ֆա\u0530", (byte)44, 69);
               b[47] = ξψθρΣΠΣς.D("ҢҮҏҬҦҦҬҙѰѲҕѽҵҧҴҼҙҮӅұӅҞҧҽҞ҉҉ӊҬҦһҪ", (byte)44, 68);
               b[48] = ζοηκορΦνΣθγΩ.A("ďŊĚňċďĨģĶœĪğ", (byte)44, 65);
               b[49] = δΛψπξκσβγςα.B("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 66);
               b[50] = ζβησεθωυγτ.C("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 67);
               b[51] = ιΠοθΩΦξκ.D("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 68);
               b[52] = ςΦζσμτΓσ.D("ҍѪүҎү҃ҖҏҢҰѵѽҰҼѶҌҴҹӀҟҡҟҌҍ", (byte)44, 68);
               b[53] = ντθΔζβΔζ.A("İęĽĨīōŀġŇœĕğ", (byte)44, 65);
               b[54] = ντθΔζβΔζ.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձծՋՊյՐ\u0558ն\u0557Վռմ", (byte)44, 70);
               b[55] = φδχεθοκψαλΛογλ.C("ҝҫҡѴҖ҄Ҋҧһ҅Ҷ҅ҸҳѽҰҵҽ҃ҹӂҿҜқӆҡҩӇҨҟӍӅ", (byte)44, 67);
               b[56] = ςπυηννναΣ.D("ҫҞҠѮѶѰҫҷҭҜҶҔѺҮҜҼҪҰқҶґӅҌҍ", (byte)44, 68);
               b[57] = βεξΠθρρςΔΦμ.F("՚ՍՏԝԥԟ՚զ՜ՋեՃԩ՝Ջիՙ՟ՊեՀմԻԼ", (byte)44, 70);
               b[58] = φΨαξωυθανΣφυκη.E("ԸԢՕՕԵ՝՜՛բԺՕ\u0558՜ՄՐՀԨՅճաԳՃՒԮթԬլղՕՐռվձւԹտՔևցՙօռզ\u0558աՌֈժՠժէ՜Օզյմ֗քեխճ֜ջ֖֠ռ֍ռ֣֣֧֔թրզհ", (byte)44, 69);
               b[59] = ςπυηννναΣ.E("ԩԜԵՕՀԟՃզգԪդԞզԾԺ՛ԫեՂԭՈմզՖնԸԹե՚սշԶ", (byte)44, 69);
               b[60] = θεωψξβΛσσ.E("ԡԚԫՑՅԲԯԶՇԪՖԺՠԾԥԼժ՜դէ\u0530ԾԻԼ", (byte)44, 69);
               b[61] = ΣφδσΔζιΠρα.F("\u0558ԲԬ՜դԺԥԶԩՆԻ\u0530", (byte)44, 70);
               b[62] = οοθδΨιοΦΠβδζ.D("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 68);
               b[63] = φΨαξωυθανΣφυκη.B("İęĽĨīōŀġŇœĕğ", (byte)44, 66);
               b[64] = ςπυηννναΣ.F("ՍբԕՏԴԱ\u0558ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ\u0557ՍղիՏհաքՔզՑւէՐ", (byte)44, 70);
               b[65] = ζβησεθωυγτ.B("ļőĄľģĠŇĲœŚēŘŋĩŌļĬŖķŐĹţĪī", (byte)44, 66);
               b[66] = βεξΠθρρςΔΦμ.F("ՍբԕՏԴԱ\u0558ՃդիԣէՎդ՚ՏԽԨլծԿմԻԼ", (byte)44, 70);
               b[67] = μζξτΩσσφυδεπλΨ.E("ՁԪՎԹԼ՞ՑԲ\u0558դԦ\u0530", (byte)44, 69);
               b[68] = χΠξΦιζΨΣωΦσΨζ.A("ļőĄľģĠŇĲœŚĔŊēļřĭśŔľĶĚţĪī", (byte)44, 65);
               b[69] = μζξτΩσσφυδεπλΨ.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļšŚľşŐųŃŕŀűŖĿ", (byte)44, 65);
               b[70] = ΨφιωσρΓδΔθ.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
               b[71] = χΠξΦιζΨΣωΦσΨζ.D("ҒѻҟҊҍүҢ҃ҩҵѷҁ", (byte)44, 68);
               b[72] = πψυκΠΨμΛΩβΣφμφσ.F("ՍբԕՏԴԱ\u0558Ճդիԥ՛ԤՍժԾլեՏՇԫմԻԼ", (byte)44, 70);
               b[73] = οοθδΨιοΦΠβδζ.F("ՍբԕՏԴԱ\u0558ՃդիԢ՜եԻՈլձՃՈհՐխՃթՖծ\u0557հՒ՜Վ՚", (byte)44, 70);
               b[74] = ΨφιωσρΓδΔθ.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
               b[75] = πχσδΦΦνθΔπ.B("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŇĽīũİŰŮıšŏŨĿ", (byte)44, 66);
               b[76] = ζοηκορΦνΣθγΩ.E("ՍբԕՏԴԱ\u0558ՃդիԣՌՖԸԥ՚ձխ\u0530ՃՆեՍՌՂՏՃ՜ՔՉՔՍ", (byte)44, 69);
               b[77] = φΨαξωυθανΣφυκη.E("ՍբԕՏԴԱ\u0558ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ\u0557ՍղիՏհաքՔզՑւէՐ", (byte)44, 69);
               b[78] = ςπυηννναΣ.E("ՖԠԼ՛ՅԴԵ\u0558Ւթՙ\u0530", (byte)44, 69);
               b[79] = χφπρψπφΦθμπ.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
               b[80] = ΣφδσΔζιΠρα.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
               b[81] = ζοηκορΦνΣθγΩ.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
               b[82] = φδχεθοκψαλΛογλ.B("ňŌœĳĒİīĭĲİĺŚňĥķśŋĽłńőĽĪī", (byte)44, 66);
               b[83] = ντθΔζβΔζ.A("čĠńěŕĠŀŋĩĳđğ", (byte)44, 65);
               b[84] = ξψθρΣΠΣς.D("ҏ҄ҠҥҔҲҔҬҤҬғҏѸґҗѸҀҚҢҶҔҏҌҍ", (byte)44, 68);
               b[85] = οοθδΨιοΦΠβδζ.B("ĨŐŅňĒŊĴĴńœśŒōĥœŊİőŞŗšĴĴţĠťŝĦŃŚşŋšĽőĩĽıŕŷŴšŎĿ", (byte)44, 66);
               b[86] = ζβησεθωυγτ.C("ѺҁҫҏѲҸҪѵҲҎҔҴҿѽҽҳѼҬ҄ҁ҄ӅҌҍ", (byte)44, 67);
               b[87] = ΦδφπθΩΩλζξ.D("ҟѰ҇ѯҭҰҢҊ҅ҧҎѯѼҌҴғҋұҒҿҙҳҹһҷҩӄҿҊҹӋӍґҒӍӎҳҭӐҴҗҮҗҝӖӠҚӘӜҝәҲӦӨҠӓҢӇһӘҷӎҢӪ", (byte)44, 68);
               b[88] = λΣΩσμφγχ.E("ԙ՛ՐԟՕդբա՟եՕ\u0530", (byte)44, 69);
               b[89] = ζβησεθωυγτ.A("ĺęŏĭĳċŇĢĠŉĨĸĖŒŗľıĜĶŁŚĽĪī", (byte)44, 65);
               b[90] = πχσδΦΦνθΔπ.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
               b[91] = μζξτΩσσφυδεπλΨ.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
               b[92] = οοθδΨιοΦΠβδζ.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
               b[93] = ΠΛΨοδΩσμνΛγΦφβς.A("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 65);
               b[94] = βθκςνθΩθυμςτκχ.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
               b[95] = ζβησεθωυγτ.E("Զ՝՟ՔԠՀՒԠԳՁա\u0530", (byte)44, 69);
               b[96] = μεςΩΔΣγν.B("ĽĎĥčŋŎŀĨģŅĪĔŕĨĺŏşĮĝŁŎţĪī", (byte)44, 66);
               b[97] = ΣερμΔσατσκ.A("ġĹňĦēēĈĨŐĬŇķňŔŉŐŖİŁĶĵńőŁŧŃşĪĬĩŜĭŢĻŰųĲĿŒŸĸŏŒţŶŜſřŘŲŁœŠżťƄŴŵźƀŞŷŘŇ", (byte)44, 65);
               b[98] = ΣδτΠνεγοΓορητ.B("ĪĩİĥģņġĲķģńğ", (byte)44, 66);
               b[99] = ΨΦνΨΦωυΩνβςμ.B("ŀŌĭŊńńŊķĎĐĲňĔœŒŖĝľŐĢŁģťħũķřĤŧĬņĨťŰĩŃŅĲŐŐŧţĺŭĮœřŗŭŔŏŽźŢŢżŕųżšƂźšťňŏŻŪŤƐƉůŷƁƓźųƊƛőƍŵŵŹƏƎƎżųŸšŹƫƅŻƥ", (byte)44, 66);
               b[100] = ιΠοθΩΦξκ.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
               b[101] = ντθΔζβΔζ.D("ѱҩҀүүң҅Ңҫ҃ґҪ҇ҪҾҀҵҷҁҖңҵҌҍ", (byte)44, 68);
               b[102] = μζξτΩσσφυδεπλΨ.F("ԩ\u0530՚ԾԡէՙԤաԽՃգծԬլբԫ՛Գ\u0530ԳմԻԼ", (byte)44, 70);
               b[103] = ιΠοθΩΦξκ.D("ҞҴҋҮҗѩҒҋҢңҷҹҗҊҹҪҝҘңҽґҸҗӅҢ҇ҕң҆҇ӇҽґҬҫӃҥӈӄӅӃҕҤҡ", (byte)44, 68);
               b[104] = ζοηκορΦνΣθγΩ.B("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 66);
               b[105] = φδχεθοκψαλΛογλ.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
               b[106] = βθκςνθΩθυμςτκχ.E("ԟՒՁգԛՎՖԴՙԹ՝\u0530", (byte)44, 69);
               b[107] = ΦδφπθΩΩλζξ.B("ČĚďŎĵŊŒŀŀįőŔŚĵİŊŕĞĶĭŚŢĿįħķřūŅĶŪŚ", (byte)44, 66);
               b[108] = χφπρψπφΦθμπ.B("ĿŎŎĎįĭķīĠĴĴēĖĪįŌŀĴŚŜĳĽĪī", (byte)44, 66);
               b[109] = οοθδΨιοΦΠβδζ.C("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 67);
               b[110] = θεωψξβΛσσ.C("҇ҍґүѱѴғҰҤҍѲҶҍҟҘѼґһҁѾҹӅҌҍ", (byte)44, 67);
               b[111] = ΣφδσΔζιΠρα.E("ԹԪԽԣՔԺՂԚ\u0557ԸՅՠեԩՉԾձ՚բՊԯ\u0530կԮՕՏՖ՚ղպԵնՔՖսՄճեՙև\u0557օէՐ", (byte)44, 69);
               b[112] = λΣΩσμφγχ.C("҇ҍґүѱѴғҰҤҍѼҞҼҘӁҳҴҰѽүҸҟҌҍ", (byte)44, 67);
               b[113] = θεωψξβΛσσ.B("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĵŕİŃľŦŌīŤĺĪ", (byte)44, 66);
               b[114] = πψυκΠΨμΛΩβΣφμφσ.D("ѫҝѱ҂Ү҃ҥҩѺҨҲҁ", (byte)44, 68);
               b[115] = μεςΩΔΣγν.C("ѬҰҰҰҥѲҨ҅ҎҪґҨү҉ҙҖӃүҾѿӄҘұӁҁ҈ҽӆҍ҈ҋӏҳӍҍҎӊҫҤӍӋӓҘҜӎҾҷҙҼҺҠӚӕӛӑҲӇҴҶӠӦӗӢңӋҿӤӝӖӧҪӪӌӜӰӕӑҸӏһӴԃӬӯӕӠӴӹӥԂӌԌӨԀӌӢԊӅԃӮӴӧӲӹӤӷӤӡ", (byte)44, 67);
               b[116] = ΣφδσΔζιΠρα.B("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵųĮťŲŲũŕœŠſƃŊŋ", (byte)44, 66);
               b[117] = ΨΦνΨΦωυΩνβςμ.A("ŀŌĭŊńńŊķĎĐĵňŖĪĐŌĮŁŎİĵŚġşŒĸŅśŌŅŅňĩşĲūųıĿŉİŅŏŎœŧůŹŒŋžƀŸŖŕŦťŻźſŕƅƇƉ", (byte)44, 65);
               b[118] = οΩνΩρωλΨηΛδωδ.C("ѼҟѰҳѨ҇ҁҤұѲѳҁ", (byte)44, 67);
               b[119] = ΣφδσΔζιΠρα.E("ՍՍԻԮաԠՀԺԡՅԿ\u0530", (byte)44, 69);
               b[120] = πηγμΣΔκκ.A("ĐĽĝĊľčňĐĸńńğ", (byte)44, 65);
               b[121] = οΩνΩρωλΨηΛδωδ.F("ԟԳՒգՄԼԝեԵՇԪ\u0530", (byte)44, 70);
               b[122] = ΨΦνΨΦωυΩνβςμ.C("ҌҝҏұҭҡѷҢҹҸҰҾҒұҎҟҞҮҽ҃ҮҏҌҍ", (byte)44, 67);
               b[123] = μζξτΩσσφυδεπλΨ.B("ġĊĢĠņŃŐīıŘđğ", (byte)44, 66);
               b[124] = πχσδΦΦνθΔπ.E("ՠԙՕԛՓզԡ\u0530ԲԻ՝էխԠԪզՏԾԳԿՏմԻԼ", (byte)44, 69);
               break;
            case 1:
               b[0] = βθκςνθΩθυμςτκχ.C("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈӇҏӊӀҍӐҸӉұҒҤҡ", (byte)44, 67);
               b[1] = ΨφιωσρΓδΔθ.B("ĘħįĭĮŀıķħŕŚıŎŞĽįŕőĺĚŔĭĪī", (byte)44, 66);
               b[2] = μζξτΩσσφυδεπλΨ.C("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝӄҮұҵҥҏӒҥҮӐҗҡ", (byte)44, 67);
               b[3] = ΦδφπθΩΩλζξ.C("ҡҰҰѰґҏҙҍ҂ҖҗҲҍҕӀҏҞӀҷҒҙҏҌҍ", (byte)44, 67);
               b[4] = πψυκΠΨμΛΩβΣφμφσ.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՃՃԧԾէՂՋզՄԯկՇոՙկժ\u0557յչԵԿՀսԽ՚վ\u0557ՓհոՔՅւ֊ֆՊ։ՆլՌՌռՑժզթմշկ՛ՖՖ։֛", (byte)44, 70);
               b[5] = ΣφδσΔζιΠρα.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӒҾӃӄӠӵҪӘӪӷҷӁ", (byte)44, 68);
               b[6] = πχσδΦΦνθΔπ.E("ԘԢԾԯԻԸԢԚԧԪԼԞՄՈխՍ՝ՉՀՍ՟ԱԩեԯնռթմԽՓջԿԸՓբծ՜ՄպջրԽջքքՇբ֑Տվլ֏։կժյկՒ\u0558ձզ\u058b\u0590խմց֗ձ֙ՙ֑֗պջհ", (byte)44, 69);
               b[7] = δΛψπξκσβγςα.C(
                  "ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӅҥӎҹҵҩӑӃӗҗӠҙӧҨҺӌҢҬҨҥӨӦӋӇӵӢҿҴӁӖҷӤӵүӵӈӱҸӒһӛӴӂӨԂӼӛԌӢӠԄԉӍӣӬԆӋӮԉӯӸԏԍԃԊӗөӸԔԟԟӼԗӠԡӸӥԞԋӝӤӷԧԗӯԀԂԏԟԏԏԨԠԴԐԨԪԁ",
                  (byte)44,
                  67
               );
               b[8] = ΦδφπθΩΩλζξ.A("ŀŌĭŊńńŊķĎĐĲĲĖĭŖıĺŕĳĞŞĶŧňŞřņŤŨĤĮįŬĬŉŭņłşŧŃĴųŮůŇĽŰŝūűŌťŻšƆŝŧŢŽŗƀŅŹ", (byte)44, 65);
               b[9] = ζοηκορΦνΣθγΩ.F("ՉԭԞԵ\u0530դԠԥԻՈԨՄՃՌՀԿՃիզՑեԾԻԼ", (byte)44, 70);
               b[10] = βεξΠθρρςΔΦμ.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťƄůśśƏűŚŲƄŚŽŪū", (byte)44, 66);
               b[11] = πψυκΠΨμΛΩβΣφμφσ.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲҿҟөӒӉӡҫҿҺӆӃөӒӣӪӃұӷӕұӴӌӁ", (byte)44, 67);
               b[12] = βθκςνθΩθυμςτκχ.A("ġăŎŉĠċĦŎĵŏįŃēĝĔŎľļĳľńĭĪī", (byte)44, 65);
               b[13] = λΣΩσμφγχ.D("ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӄӓӊҴҶҿӃӟӤӔҸӒҧӁӝҸӈҽҠӟӇӠӊӡӤүӊӱӕҴӷӉӚөӶӱҸӺӘӒӀҾӥӵӌӍ", (byte)44, 68);
               b[14] = οοθδΨιοΦΠβδζ.C("ҎҌҳҁ҂ѱѲҴҋҒѶҍҫҽѲқѸҽҳҶѸӆҕ҂ҘҟҩңҫҜҙҧҒӔҟұҥҩұӓҹҸӋӜӘӇұӊӢһӔҜҟҞӄӞҵӤӜӉҪөӅӌҫӟӒӓӇӯӳӁҸӇҺӏӞӴӒӬӎԃӕӁӹҿӼӠӨӸӕӝӧӛӏԅ", (byte)44, 67);
               b[15] = ΣφδσΔζιΠρα.E("ՋԘԹԠՆԯՐԼԣԾԦ\u0530", (byte)44, 69);
               b[16] = βθκςνθΩθυμςτκχ.A(
                  "ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǅƶǚǂǧǒƽƦǙǉǉ",
                  (byte)44,
                  65
               );
               b[17] = ςπυηννναΣ.C("ҌѽҬѫұѴҸғҘҘҋѶұѽҒғӁһѻҟҙӅҌҍ", (byte)44, 67);
               b[18] = ξψθρΣΠΣς.D("҃ѪѪҌ҅҂ҋѷғҖ҈ҜҗҽҭҙѴѺҎҶҖҵҌҍ", (byte)44, 68);
               b[19] = φδχεθοκψαλΛογλ.B("ĽŐňĴġĎĖŇĨńēŘĹŝĐĩĩŋłŠŃŀťĹŇřŢŖīşĪĬŞĭĮšųŶŎňĴŊĺűŇŦōıĹŎƀĽŒųŊŋ", (byte)44, 66);
               b[20] = ΣερμΔσατσκ.C("ҤҩҜҖѭ҅ҌѹҮ҃Ґҁ", (byte)44, 67);
               b[21] = ντθΔζβΔζ.E("\u0558ԺԴգԽԢԷ\u0530Դ\u0558զՕԶբգժՀԨ՛ՐԴՎԻԼ", (byte)44, 69);
               b[22] = ΣφδσΔζιΠρα.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԲՄՕզՎգՔռԺԵ՚Պ՜խԾԻՓտՐ֊՝գՐ", (byte)44, 70);
               b[23] = ΣφδσΔζιΠρα.D("ңҦҠґґҸҶѸ҇ҫҤҙҒҙҐҶҗѾҕҤ҆ҵҌҍ", (byte)44, 68);
               b[24] = ςΦζσμτΓσ.C("҆Ҵ҂ѳҟҍ҈ҳҲҕҊҴҊҺѹҝҐҴҙҏѽҏҌҍ", (byte)44, 67);
               b[25] = ΨΦνΨΦωυΩνβςμ.A("ĥōľēħĞĭğīđĕğ", (byte)44, 65);
               b[26] = οΩνΩρωλΨηΛδωδ.E("ԪԿՔԷԭդԾ՞ՙՀԷ\u0530", (byte)44, 69);
               b[27] = πχσδΦΦνθΔπ.F("ԝԪՠԹեԿՇՄԢԵ՞ՀՅՍԽԫՐ\u0530ՒժՄդԻԼ", (byte)44, 70);
               b[28] = ΨφιωσρΓδΔθ.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՄԥզԥՎԬԻԤխՑՇՁՃխԲՋ\u0558ծՅռԵոժնՁծՍԽ՛՞եՊսՐ", (byte)44, 69);
               b[29] = χφπρψπφΦθμπ.A("ŁńľįįŖŔĖĥŉłőņķĻňĝŉśĶŞĽĪī", (byte)44, 65);
               b[30] = ξψθρΣΠΣς.C("҆Ҵ҂ѳҟҍ҈ҳҲҕ҈ҧҘҼҠҘ҂ҋҘҚҟҏҌҍ", (byte)44, 67);
               b[31] = μζξτΩσσφυδεπλΨ.F("Լ՜ՌԠ՚ԽէեԢԷԿ\u0530", (byte)44, 70);
               b[32] = ιΠοθΩΦξκ.A("ČęŇĊņĩŉőŐŎĺğ", (byte)44, 65);
               b[33] = πψυκΠΨμΛΩβΣφμφσ.F("ԼԛԛԟԾ\u0558ՏՈՉԵԤխլ՝ԸԩԼԨբՎՋդԻԼ", (byte)44, 70);
               b[34] = μεςΩΔΣγν.B("ŐĮĮąŎŔēĨĐŔĢİōĴŊŀĜĪŖĸŤţĪī", (byte)44, 66);
               b[35] = μζξτΩσσφυδεπλΨ.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնյշչԱՊՕճՈԻՖՖծնբփմէ՛և\u0558՛՛ըՅևրտաՈ֍բՕյ֔բՐչն֑֓ֈ\u058cռ֗ցջ\u0590՛ո֡զ֣֡ճ֥֨֗֞֯ձ֢խցիַ֤֭֨֏֫֔պն֍ֶ֔ս֢֖֕փվֺ֞քֺֺּׂ֮֮֔֠\u05ce׃֕\u058cְֵֶ֚֗֒֬זִ֯ז֢כ֖ו֦ףֺ֦ףיְ",
                  (byte)44,
                  69
               );
               b[36] = ςπυηννναΣ.D(
                  "ҳҬ҅҇ҟѴҐҳѺ҅ҳѳѻҶҫӀҏѵҺҡҲ҅҇ӂқӈҹ҇ҠҨӋҥҭӉӏӃҤҤҢҸҔҨӑҙҔӏҘҴҚӣӘҽӠҟҞӥҼәӫҫӀӞҰӛӱӐӞүүӂӵӖӫҴӻӾҸӟӹөҸӯӏӂӆӾӤӢӉӹӈӹӢӈӨԆӊԋԔԄӰӤөӥӒӚӱөԔԘӽӝӬԍԑԔԟӣԅԪԇԪӸԈԧӷԩԇԇԯԨӾӵԟԏԈԘԐԩԙԐӽԴӷԼԂՅԔԀԟԟՁԴӽԄԪԟԉՄԣՎԢՋԱԠԭՎ՚ԐՍԲՏ՝ԽՓՎԱ\u0557ՌԵՕ՛ՒԟԳ՝Ն՝ըՈԾԭճա՝աՌՉՎԴդՋՖ\u0558վծ՝Տչատ\u0557ձյ՛՚մցՖսծչ։ֈջ֍դցՌժձՋ։ջՒ։\u0557տ֚իշ֤՞շդբռֆք֜ջք֊օְ։։լֵ֠ֆ֡ց֣֏֓ն֑֬ջ֬տִ\u0590֙շֱ֕\u0590֢֖֗վֆևׁ֙֬ג֍֔֨֎\u05c9\u05cc֨ו\u05caךמ\u05c9ֻ֪֜\u05caֲֵ֬֝ל\u05c8֣ת\u05ca֩\u05cd־םתֲ֬כֽ֮֯\u05ccא\u05cdֳױ\u05f5֯\u05fe\u05f6\u05ecֹ\u05ecפנׁ\u05feנ\u05f9פ׃חיׇ\u05ceנ\u05ec\u05fd؆אעאו\u05ffףؚ؋ؑ\u05f5؈؏״\u05fe\u0600؝\u05fd\u05ecؖ؟\u05ff\u05ec\u05ed",
                  (byte)44,
                  68
               );
               b[37] = ιΠοθΩΦξκ.E(
                  "ԽԻբ\u0530ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀\u058bս֖֜֞և׃֧֝ֈ׀֞\u05ce֥։ְֳ֢\u05cc֛ׄ֜",
                  (byte)44,
                  69
               );
               b[38] = δΛψπξκσβγςα.F(
                  "ԿՐԱՖՔ՚\u0557ՒԟԜՈժԧ\u0558ՆԮԣ՜ԯՍՄՠլնըԹ\u0558ԺղՙԱտտՒԻՍՔՅ՛ՙըՃդՠ֎ցգփ՝եձՔհ֔թՕՑե՛ՎօձվոջՙՕղօդ֠ճ֝չ֥֗լջտ֚֯փս֮։ַָ֑֦֪֓֘\u058cռ׀ֈֵոֶ֟ք֘֝֒տ֧։֛֚\u05cd\u058cׄ\u05c9ׁ֥\u05caֵ֧זֶ֓\u05ceׇ֥ךמהַו֜֡֬אֶ֢֘־נ\u05ccפ֫\u05cd\u05ec\u05ed\u05eeם\u05cfװׇן\u05ceׅאשװץַװ־\u05fc\u05ca\u05ccֿ\u05ed\u05cfזװ׀דכׅתו؏\u0602؎؇\u05fcג\u0602אײ\u0603פס؍\u0603תؗםרױ\u05f8\u05ebׯסנ\u05f9מ\u0605\u05f8اף\u05f9ؠ\u05feذج\u05eeؒ\u0604\u05ec؊ضؓرعة\u0604؊ؾ؆شؚف؞ؤآ\u0600ظسصؒ؇ؠؘإؙؾؽثآلؒيرٌوئقضستذَس٠تؼٖحعْا٣ْئوثوِٞٚف٦٥ضٵ١٨ٵٰٙٔٹٍپٷٝ٢ٰٖڇٲغٝي٫ٸڍ٦٨ٝڅًڋٴِډ٥ّْٴ٣ٽژٙڜٶٙ٠٭ٞٷڥپڐ١٨ڬڕڄٿڈڪٰٱڄڝڳڴٻټ",
                  (byte)44,
                  70
               );
               b[39] = ΣφδσΔζιΠρα.E("ԱՏաԛԛՅՃ՜եԦԺՋՎԫՀԩթ՚ժԮԽմԻԼ", (byte)44, 69);
               b[40] = θεωψξβΛσσ.A("įĈĳľĬŉŒīĢŋńğ", (byte)44, 65);
               b[41] = δΛψπξκσβγςα.C("ѲҢҕҥѳҏѳѵҰѸ҉ѷҪҐҐһҕӁқһҥѹҚҽѼ҉Ҵ҄ҨҮҨӒ", (byte)44, 67);
               b[42] = ζοηκορΦνΣθγΩ.D("ґҥѽѲҀҶґҳ҆ҰҕҍҝѺҽѼҊҸҞҤҝҵҌҍ", (byte)44, 68);
               b[43] = ζβησεθωυγτ.F("ԿՊՁԱԢԺՓԤՀԴԵՀՅի՟ԺեՋծԿզմԻԼ", (byte)44, 70);
               b[44] = οοθδΨιοΦΠβδζ.A("ĐŀĳŃđĭđēŎĖĩōĮĭřŐıōĳĕĳĽĪī", (byte)44, 65);
               b[45] = φΨαξωυθανΣφυκη.B("ĬŃīŎŕĝŋĬĖŘĩőœŅĘĪśěŐĢŌœĪī", (byte)44, 66);
               b[46] = χΠξΦιζΨΣωΦσΨζ.A("ĥňČŅœōģĢŁĘŒŜĶŗřśĿŋŜĝŞœĪī", (byte)44, 65);
               b[47] = ςΦζσμτΓσ.A("ŀŌĭŊńńŊķĎĐĳěœŅŒŚķŌţŏţĳŘŕŉŀňŝŜŕŭĪ", (byte)44, 65);
               b[48] = βθκςνθΩθυμςτκχ.C("ґѰѯѴҎѵҸҢѵґѻҬҨҼҍҎҷѿұѽҳҏҌҍ", (byte)44, 67);
               b[49] = ΨφιωσρΓδΔθ.A("įŏŒĤĨħĵĳıīņŃėęīğŊŝŃĳĬĽĪī", (byte)44, 65);
               b[50] = χφπρψπφΦθμπ.F("ՒԚՍՓՍԟՏԲԨ\u0557զ՞եՂլՂՇՄխբՖՏՑՈՈժՓՉՓհթՍ", (byte)44, 70);
               b[51] = φΨαξωυθανΣφυκη.B("ŁĉļłļĎľġėņŕōŔıśıĶĳŜőŅŅťŇŤňŗĤŠŃŞŁ", (byte)44, 66);
               b[52] = χΠξΦιζΨΣωΦσΨζ.C("ҍѪүҎү҃ҖҏҢҰѵѵҦҙҕѼҔѹҎүӂҟҌҍ", (byte)44, 67);
               b[53] = ΣερμΔσατσκ.B("ĻĈŌąĨďŒĠīŎŐğ", (byte)44, 66);
               b[54] = ςΦζσμτΓσ.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձհԲՆժԵզզՓհ՞Փ", (byte)44, 70);
               b[55] = ςΦζσμτΓσ.A("ĻŉĿĒĴĢĨŅřģŔģŖőěŎœśġŗŠśŧŕİĶŅġĿĦśį", (byte)44, 65);
               b[56] = ξψθρΣΠΣς.C("ҫҞҠѮѶѰҫҷҭҜҶҥҶҜґқҊҸӀҶҜҸғҸҚҁ҈ҫ҅ҽң҈", (byte)44, 67);
               b[57] = ΠΛΨοδΩσμνΛγΦφβς.C("ҫҞҠѮѶѰҫҷҭҜҸҭҖҭҵѿҙҋҶҰҽҵҌҍ", (byte)44, 67);
               b[58] = πηγμΣΔκκ.D("҉ѳҦҦ҆ҮҭҬҳҋҦҩҭҕҡґѹҖӄҲ҄ҔңѿҺѽҽӃҦҡӍӏӂӓҊӐҥӘӒҪӖӍҷҩҲҝәһұһҸҭҦҷӆӅӨӕҶҾӄӭӌӧҤӠӱӌҰӊӹӚҸҭһӁ", (byte)44, 68);
               b[59] = ντθΔζβΔζ.B("ĘċĤńįĎĲŕŒęœčŕĭĩŊĚŔıĜķĝĶĠŠĠķŊŊŇŞř", (byte)44, 66);
               b[60] = ςΦζσμτΓσ.D("ѲѫѼҢҖ҃Ҁ҇ҘѻҧѼѺҾқҺҍӃҚҔӇҳҢҒҕҼҵҕҸӃ҇ҩ", (byte)44, 68);
               b[61] = οΩνΩρωλΨηΛδωδ.F("բ՞ԟՏԮԣՇԢէըԢ\u0530", (byte)44, 70);
               b[62] = βεξΠθρρςΔΦμ.A("ħŏŀŊŔĲŉĭŗŕĖĘœņĸňŁğŢİŔœĪī", (byte)44, 65);
               b[63] = ςπυηννναΣ.F("ԫԱՃՏ\u0530ԷԽԳՕԾԪ\u0530", (byte)44, 70);
               b[64] = ιΠοθΩΦξκ.B("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļřĹŜľĭŃŅšĵūŖĿ", (byte)44, 66);
               b[65] = πψυκΠΨμΛΩβΣφμφσ.B("ļőĄľģĠŇĲœŚđīŇīĶŎŜįĵĚŢńśŃťģķĝŭĵŎħ", (byte)44, 66);
               b[66] = πχσδΦΦνθΔπ.A("ļőĄľģĠŇĲœŚēŏĨŞňĽŘĞŗĽŘĹşŨĽŤĤļŅŬŖĮ", (byte)44, 65);
               b[67] = βεξΠθρρςΔΦμ.F("ԽԙԹ՛ԥՂԝՖԻՒթ\u0530", (byte)44, 70);
               b[68] = πηγμΣΔκκ.E("ՍբԕՏԴԱ\u0558ՃդիԢՌԵ\u0558թձԼբՍԪՃՁնՋԵլթսկ\u0557ՠո", (byte)44, 69);
               b[69] = ΨΦνΨΦωυΩνβςμ.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļţŋŰŧĪıĵĶŁŦŸĿ", (byte)44, 65);
               b[70] = λΣΩσμφγχ.F("ՍբԕՏԴԱ\u0558ՃդիԢԤՌը՛ՌԺՌճՈԽՐիաԯ\u0530թԸՋվՓ՛", (byte)44, 70);
               b[71] = ξψθρΣΠΣς.A("ČċĩļČĢıĢŒŕřœōŗřĲĭĭŔŋŠţĪī", (byte)44, 65);
               b[72] = χΠξΦιζΨΣωΦσΨζ.F("ՍբԕՏԴԱ\u0558ՃդիԢ՚ԻՉ\u0558՝ԩԼԿբՂՖԱՐ\u0557զԭՍՅ՟թշ", (byte)44, 70);
               b[73] = δΛψπξκσβγςα.B("ļőĄľģĠŇĲœŚđŋŔĪķśŠĲķşĿŘĿśńĶĶĽŋłŮġ", (byte)44, 66);
               b[74] = ντθΔζβΔζ.B("ļőĄľģĠŇĲœŚĒĔħļĺįļĵĚŢĜĲĝĿŖĳŃŦŗńšř", (byte)44, 66);
               b[75] = βεξΠθρρςΔΦμ.A("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŪũĩųĳŦŦŴņķŖŘĳŲĵŠůşŐľĶōŊŋ", (byte)44, 65);
               b[76] = ξψθρΣΠΣς.A("ļőĄľģĠŇĲœŚĒĻŅħĔŉŠŜğĲĵŝġĿŖłļŪŚĭĩĩŠĭīŒĪİŅĲŪŕŴĿ", (byte)44, 65);
               b[77] = χφπρψπφΦθμπ.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļľŉĺŉŤįĭįũšŒĿ", (byte)44, 65);
               b[78] = δΛψπξκσβγςα.F("\u0557՝ԟՓԵԹԹԿՑԷՀ՝ՇԻՎՐժժԲ\u0530ՓմԻԼ", (byte)44, 70);
               b[79] = πχσδΦΦνθΔπ.E("ՂՐ\u0557ԚԺՕԼՠԡիԨԸԬԶՈԹբՀձ՝եԾԻԼ", (byte)44, 69);
               b[80] = οΩνΩρωλΨηΛδωδ.B("ĮĞŌğİĩĒėŊœİŊśďĲıŀĚŎġıţĪī", (byte)44, 66);
               b[81] = ξψθρΣΠΣς.E("Կԯ՝\u0530ՁԺԣԨ՛դՂԴԼըԪԩԾՐԪՋՌմԻԼ", (byte)44, 69);
               b[82] = ξψθρΣΠΣς.C("ҪҮҵҕѴҒҍҏҔҒҥҝҴѹҬѹқңҶѼҜҟҌҍ", (byte)44, 67);
               b[83] = ΨΦνΨΦωυΩνβςμ.D("ҋѩ҉ҔүҋҒҶҖҦ҅ҕҟҴҳҲҮѹһ҄ҢҟҌҍ", (byte)44, 68);
               b[84] = θεωψξβΛσσ.C("ҏ҄ҠҥҔҲҔҬҤҬғҶҰҞҫҮҹһҷӀӁҵҌҍ", (byte)44, 67);
               b[85] = φΨαξωυθανΣφυκη.E("ԹաՖՙԣ՛ՅՅՕդլգ՞Զդ՛ՁբկըղՅՅմԱնծԷՔիհ՜մԻԼՔՔզՒք։\u0557՛Ր", (byte)44, 69);
               b[86] = μεςΩΔΣγν.E("ԩ\u0530՚ԾԡէՙԤաԽՄՈԤզգ՛ԧծԥՠ՞ԾԻԼ", (byte)44, 69);
               b[87] = θεωψξβΛσσ.B("ĽĎĥčŋŎŀĨģŅĬčĚĪŒıĩŏİŝķőŗřŕŇŢŝĨŗũūįİūŬőŋŮŒĵŌĵĻŴžĸŶźĻŷŐƄļŚƁœŝŪŗƇŗƁŞŉƑŢŏŒũƏşŔŵƘş", (byte)44, 66);
               b[88] = οΩνΩρωλΨηΛδωδ.D("Ҡ҆ңҨҦҌҸҐҊҖҹҗҨѼӀҔҒҞүҁҏҏҌҍ", (byte)44, 68);
               b[89] = ΣερμΔσατσκ.D("Ҝѻұҏҕѭҩ҄҂ҫҋҺҷѵҟҵҬҞґғҲҵҌҍ", (byte)44, 68);
               b[90] = φδχεθοκψαλΛογλ.B("ĤĪōĦĿĳĤĨŊĶōĒňŐħŌįŒġĜŎţĪī", (byte)44, 66);
               b[91] = βεξΠθρρςΔΦμ.B("ļŊĥőİğňňĹċĺğ", (byte)44, 66);
               b[92] = δΛψπξκσβγςα.C("҉҉ҴҲҥғѵҗҎѻѲһѽһѻѽңҞѼҭ҃ҟҌҍ", (byte)44, 67);
               b[93] = φδχεθοκψαλΛογλ.D("үҜ҇ѽ҂ҩҰҊ҂ҎҼѵҰҐүѷҟҌҽҥҎҏҌҍ", (byte)44, 68);
               b[94] = λΣΩσμφγχ.B("ĨĞĐńįġČĉĹŊńğ", (byte)44, 66);
               b[95] = φΨαξωυθανΣφυκη.B("ıīœěŉģōİĕłŔėŇĻŜĭėŉśţŎĭĪī", (byte)44, 66);
               b[96] = λΣΩσμφγχ.B("ĽĎĥčŋŎŀĨģŅĭŊĵėņœŜěĞĝĬœĪī", (byte)44, 66);
               b[97] = οοθδΨιοΦΠβδζ.F("ԲՊՙԷԤԤԙԹաԽ\u0558Ոՙե՚աէՁՒՇՆՕբՒոՔհԻԽԺխԾճՌցքՃՐգ։Չՠգմևխ\u0590ժթփՒդձ\u058cգնփդկճ֝ֈ֙ժ", (byte)44, 70);
               b[98] = ζοηκορΦνΣθγΩ.F("Ը՚Փ\u0530ՓԳ՛ՅՙԲԼՂԤ՟ՎՎլԫԽՁՅՎԻԼ", (byte)44, 70);
               b[99] = βεξΠθρρςΔΦμ.E(
                  "Ց՝Ծ՛ՕՕ՛ՈԟԡՃՙԥդգէԮՏաԳՒԴնԸպՈժԵոԽ\u0557ԹնցԺՔՖՃաաոմՋվԿդժըվեՠ֎\u058bճճ֍զք֍ղ֓\u058bղնՙՠ\u058cջյ֚֡րֈ֤֒\u058bք֛֬բ֞ֆֆ֊ַ֮֠֗ք֏նֹ֧֘ո֖", (byte)44, 69
               );
               b[100] = πχσδΦΦνθΔπ.C("ғҡҨѫҋҦҍұѲҼѸҕҏҺһҝҹҍҟҚҤҏҌҍ", (byte)44, 67);
               b[101] = οΩνΩρωλΨηΛδωδ.D("ѱҩҀүүң҅Ңҫ҃ґ҉Ҝ҇ѲҋҭѺҗҼҔӅҌҍ", (byte)44, 68);
               b[102] = ΨΦνΨΦωυΩνβςμ.B("ĘğŉĭĐŖňēŐĬĲŗĥŖİİŕľĪōĜœĪī", (byte)44, 66);
               b[103] = ΨΦνΨΦωυΩνβςμ.E("ՍգԺ՝ՆԘՁԺՑՒզըՆԹըՙՌՇՒլՀէՆմՑԶՄՒԵԶնլՕ՞քԼՀղւզՅՖիՐ", (byte)44, 69);
               b[104] = ζοηκορΦνΣθγΩ.A("ıħōĉġġőėįĳŃēŘŎŘĨĽĞĸĲĿţĪī", (byte)44, 65);
               b[105] = ντθΔζβΔζ.D("ұҭҦҮҟҤѵҐҺҴѳҁ", (byte)44, 68);
               b[106] = ΣφδσΔζιΠρα.F("աՓՓԲԽԟԢ՚ՄԺԩ՟զԠՌՀՄծժընՎԻԼ", (byte)44, 70);
               b[107] = ΨΦνΨΦωυΩνβςμ.D("ѮѼѱҰҗҬҴҢҢґҳҶҼҗҒҬҷҀҘҏҼҷҷҀҿӅҫҦ҉ҙҹӃӆҭҞӇҔӐҲҔӘҮҨҡ", (byte)44, 68);
               b[108] = μζξτΩσσφυδεπλΨ.A("ĿŎŎĎįĭķīĠĴĳōŖőĝīĝłĠŝĚĽĪī", (byte)44, 65);
               b[109] = ΣδτΠνεγοΓορητ.C("ҡҰҰѰґҏҙҍ҂ҖҔҽѷҘғҗҐҿҲҜҚҟҌҍ", (byte)44, 67);
               b[110] = χφπρψπφΦθμπ.F("ԶԼՀ՞ԠԣՂ՟ՓԼԪ՜թՌըՉՎծհԴՂԾԻԼ", (byte)44, 70);
               b[111] = ντθΔζβΔζ.D("ҊѻҎѴҥҋғѫҨ҉ҖұҶѺҚҏӂҫҳқҀҁӀѿҦҠҧҫӃӋ҆ӇӇңҤҽҐҬүӋҹҩҒҕҲӖҽҚҡӝӠҮұӕҬҭ", (byte)44, 68);
               b[112] = ντθΔζβΔζ.F("ԶԼՀ՞ԠԣՂ՟ՓԼԡլՅդՄԺիբԪէձյՓԪղՎիպոզ՝պ", (byte)44, 70);
               b[113] = ζβησεθωυγτ.A("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĶŞħğśŕĳťţťň", (byte)44, 65);
               b[114] = ΠΛΨοδΩσμνΛγΦφβς.E("ՂԿԿԻ\u0557\u0558ՐդԻԣժԣծբհձՉժհՏԫդԻԼ", (byte)44, 69);
               b[115] = πψυκΠΨμΛΩβΣφμφσ.B(
                  "ĊŎŎŎŃĐņģĬňįņōħķĴšōŜĝŢĶŏşğĦśŤīĦĩŭőūīĬŨŉłūũűĶĺŬŜŕķŚŘľŸųŹůŐťŒŔžƄŵƀŁũŝƂŻŴƅňƈŪźƎųůŖŭřƒơƊƍųžƒƗƃƠŪƪƆƞŪƀŪţƏƁƨƵưſƱƈƋƧŷƒƎŵƴŽƝžƭƳƊƋ", (byte)44, 66
               );
               b[116] = ΣφδσΔζιΠρα.A("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵŒűĶřŰĸőĴűƀŶťŞųŖŊƊţŗŷŉ", (byte)44, 65);
               b[117] = λΣΩσμφγχ.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆՙէԻԡ՝ԿՒ՟ՁՆիԲհգՉՖլ՝ՖՖՙԺհՃռքՂՐ՚ՁՖՠ՟դոր֊գ՜֏֑։ը֕զնՑյևռֆ՝ի", (byte)44, 70);
               b[118] = οοθδΨιοΦΠβδζ.C("Ѥҳҋѭ҄ҤҎҮҕҰҌҁ", (byte)44, 67);
               b[119] = φΨαξωυθανΣφυκη.A("ĪŋőĩŁŁŕĨĪĐőŌĩŘĳōŏŐřĿĽţĪī", (byte)44, 65);
               b[120] = ντθΔζβΔζ.B("ĨģĒĲĬČĬņėĹđğ", (byte)44, 66);
               b[121] = φδχεθοκψαλΛογλ.F("ՁԻՋ\u0558ԸէԞԞԛՃՊգԣզԾլ՚՝ՌգնԾԻԼ", (byte)44, 70);
               b[122] = χφπρψπφΦθμπ.E("ԻՌԾՠ՜ՐԦՑըէՠԾՃԽգԻՇ՞Ճգ՞դԻԼ", (byte)44, 69);
               b[123] = ΨΦνΨΦωυΩνβςμ.D("ѽҤѬѲҭҵҡғҳҬҲҒҩҼҜҏҊҷӃҕҝҵҌҍ", (byte)44, 68);
               b[124] = φδχεθοκψαλΛογλ.A("ŏĈńĊłŕĐğġĪōįĶďŉľŕšřĶŁĭĪī", (byte)44, 65);
               break;
            case 2:
               b[0] = μζξτΩσσφυδεπλΨ.D("ұѥ҄ҊѴѵҦҙҋѳґҊҹҽҰҝҵҒҍӆѽҵҌҍ", (byte)44, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = λΣΩσμφγχ.E("ԗԱԙԛԝՠՀԥ՛ՂԻԣ՟ՎՇԯՍ՟ԯԭղԾԻԼ", (byte)44, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΦωοφυδιφΣΦ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φΨαξωυθανΣφυκη.C("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 67), ΦωοφυδιφΣΦ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(λΣΩσμφγχ.E("՛ըէԪժզաժյդԱկճլկյԷࢯ࣓࣒࣒࣊ࣂࣈࣖࢴࢸՍ", (byte)60, 69) + var1 + ΨφιωσρΓδΔθ.D("ң", (byte)60, 68) + var2.toString(), var4);
      }
   }

   public void f(ΨαχΨχΣλεΠψΦ var1) {
      if (δψφΨσψελΓ.a.ar()) {
         this.a.schedule(new θσΩψΓμκπενψΩ(this, var1), o);
      }

      Set var2 = (Set)this.c.get(var1, var0 -> new HashSet());
      synchronized (var2) {
         var2.forEach(var2x -> this.b(var1, var2x));
         var2.clear();
      }
   }

   private void o() {
      PluginManager var1 = this.o.a().getPluginManager();
      if (var1.getPlugin(c<"㺀">(nu, nv)) == null && (!ΓχυψπωΣςΠκγζΦ.U() || ΓΔπλδγιΦζΓΛδν.a().c(ΓΔπλδγιΦζΓΛδν.o))) {
         ψΓωτιμωκχψΛΨ.e(c<"㺃">(nw, nx ^ ny));
         File var2 = this.o.c().getParentFile();
         File var3 = new File(var2, c<"㺆">(oa & ob, oc));
         if (var3.exists() && !var3.delete()) {
            var3.deleteOnExit();
            ψΓωτιμωκχψΛΨ.d(c<"㺉">(od & oe, of) + var3 + c<"㺌">(og, oh ^ oi));
            return;
         }

         βΠτπξπΛχηΦΦΛα var4 = ΓχοθψΦυψωζσσ.a().a(c<"㺏">(ok, ol ^ om), var3);
         if (var4.p() == on && var4.af()) {
            try {
               var1.loadPlugin(var3);
            } catch (Exception var6) {
               ψΓωτιμωκχψΛΨ.c(c<"㺕">(os & ot, ou), var6);
               if (!var3.delete()) {
                  var3.deleteOnExit();
               }
            }
         } else {
            ψΓωτιμωκχψΛΨ.d(c<"㺒">(oo, op ^ oq) + var4.p());
         }
      }
   }

   private void b(ΨαχΨχΣλεΠψΦ var1, String var2) {
      this.g(var1);
      JSONObject var3 = new JSONObject(var2);
      if (!var3.has(c<"㺀">(av, aw ^ ax))) {
         ψΓωτιμωκχψΛΨ.c(c<"㺃">(ay, az ^ ba));
         ψΓωτιμωκχψΛΨ.c(c<"㺆">(bc, bd));
      } else {
         byte[] var4 = ΩΓιΠωεαιυτωξΠ.a(var3.getString(c<"㺉">(bf & bg, bh)).getBytes(StandardCharsets.UTF_8));
         if (this.a == null) {
            πησοιΣζΩθΛδλζσ.a(new ByteArrayInputStream(var4), this.c);
            this.m();
         }

         if (!Arrays.equals(var4, this.a)) {
            ψΓωτιμωκχψΛΨ.c(c<"㺌">(bi & bj, bk));
            String[] var10000 = new String[bm];
            var10000[bn] = c<"㺏">(bo & bp, bq);
            var10000[br] = c<"㺒">(bs, bt);
            var10000[bu] = c<"㺕">(bv, bw ^ bx);
            String var13 = βιχγΓλχΠσπ.a(var10000);
            var1.a(var13);
         } else {
            if (var3.has(c<"㺘">(by, bz))) {
               JSONArray var5 = var3.getJSONArray(c<"㺛">(ca, cb ^ cc));
               if (var5.length() == 0) {
                  throw new IllegalArgumentException(c<"㺞">(cd, ce ^ cf));
               }

               for (int var6 = cg; var6 < var5.length(); var6++) {
                  JSONObject var7 = var5.getJSONObject(var6);

                  try {
                     this.a(var1, var7);
                  } catch (JSONException var11) {
                     int var14 = var7.getInt(c<"㺡">(ch, ci));
                     String var15 = var7.getString(c<"㺤">(cj, ck ^ cl));
                     ψΓωτιμωκχψΛΨ.c(c<"㺧">(cm, cn) + var14 + c<"㺪">(co & cp, cq) + var15 + c<"㺭">(cr, cs ^ ct) + var6 + c<"㺰">(cu, cv), var11);
                  } catch (Exception var12) {
                     int var9 = var7.getInt(c<"㺳">(cx, cy));
                     String var10 = var7.getString(c<"㺶">(cz, da ^ db));
                     ψΓωτιμωκχψΛΨ.c(c<"㺹">(dc, dd) + var9 + c<"㺼">(de, df ^ dg) + var10 + c<"㺿">(dh, di ^ dj) + var6 + c<"㻂">(dk, dl ^ dm), var12);
                  }
               }
            } else {
               this.a(var1, var3);
            }
         }
      }
   }

   public CompletableFuture<JSONObject> a(ΨαχΨχΣλεΠψΦ var1, λχγιΨκηζρ var2, Object... var3) {
      CompletableFuture var4 = new CompletableFuture();
      synchronized (this.e) {
         long var6 = this.b.incrementAndGet();
         this.e.put(var6, var4);
         int var10002 = mi;
         Object[] var10003 = new Object[mj];
         var10003[mk] = c<"㺀">(ml & mm, mn);
         var10003[mo] = var6;
         var10003[mp] = c<"㺃">(mq, mr);
         var10003[ms] = var2.b();
         var10003[mt] = c<"㺆">(mu & mv, mw);
         var10003[mx] = var2.a(var3);
         this.a(var1, var10002, var10003);
         return var4;
      }
   }

   private void m() {
      if (this.a != null) {
         throw new IllegalStateException(c<"㺀">(l & m, n));
      } else {
         if (this.c.exists()) {
            this.a = Files.readAllBytes(this.c.toPath());
         }
      }
   }

   public void n() {
      this.o.a().a(c<"㺀">(p, q ^ r), this.a);
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
            throw new RuntimeException(χφπρψπφΦθμπ.B("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲҪӎӅӍӍҽӃӑүҳ", (byte)58, 66));
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

   private void b(ΨαχΨχΣλεΠψΦ var1, byte[] var2) {
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

            String var8 = c<"㺀">(aa, ab ^ ac);
            Object[] var10001 = new Object[ad];
            var10001[ae] = var3;
            ψΓωτιμωκχψΛΨ.d(var8, var10001);
         } catch (JSONException var6) {
            String var10000 = c<"㺃">(af, ag ^ ah);
            Object[] var10002 = new Object[ai];
            var10002[aj] = var3;
            ψΓωτιμωκχψΛΨ.c(var10000, var6, var10002);
         }
      } catch (Exception var7) {
         if (var2[ak] != al) {
            long var4 = System.currentTimeMillis();
            if (var4 - this.d >= am) {
               this.d = var4;
               ψΓωτιμωκχψΛΨ.d(c<"㺆">(an & ao, ap));
            }
         } else {
            ψΓωτιμωκχψΛΨ.c(c<"㺉">(ar, as ^ at), var7);
         }
      }
   }

   public void a(ΨαχΨχΣλεΠψΦ var1, int var2, Object... var3) {
      if (var3.length % my != 0) {
         throw new IllegalArgumentException(c<"㺀">(mz, na ^ nb));
      } else {
         JSONObject var4 = new JSONObject();
         if (this.a != null) {
            var4.put(c<"㺃">(nc & nd, ne), ΩΓιΠωεαιυτωξΠ.a(this.a));
         }

         var4.put(c<"㺆">(nf, ng ^ nh), var2);
         var4.put(c<"㺉">(ni & nj, nk), var1.getName());

         for (int var5 = nl; var5 < var3.length; var5++) {
            Object var6 = var3[var5++];
            if (!(var6 instanceof String)) {
               throw new IllegalArgumentException(c<"㺌">(nm, nn ^ no) + var6);
            }

            Object var7 = var3[var5];
            var4.put((String)var6, var7 != null ? var7 : JSONObject.NULL);
         }

         byte[] var9 = var4.toString().getBytes(StandardCharsets.UTF_8);
         if (!this.o.a().b().a(var1, c<"㺏">(np, nq), var9)) {
            var1.a(this.o, γΦΠυρρρπη.b, c<"㺒">(nr & ns, nt), var9);
         }
      }
   }

   static {
      b();
   }

   public ΦωοφυδιφΣΦ(nLoginBukkit var1) {
      this.c = Caffeine.newBuilder().expireAfterAccess(a, TimeUnit.SECONDS).build();
      this.d = Caffeine.newBuilder().expireAfterWrite(b, TimeUnit.SECONDS).build();
      this.a = new Object();
      this.b = new AtomicLong();
      this.e = Caffeine.newBuilder().expireAfterWrite(f, TimeUnit.SECONDS).build();
      this.o = var1;
      this.a = new Timer(var1.q() + c<"㺀">(g, h ^ i));
      this.c = new File(var1.c(), c<"㺃">(j, k));
      this.m();
   }
}
