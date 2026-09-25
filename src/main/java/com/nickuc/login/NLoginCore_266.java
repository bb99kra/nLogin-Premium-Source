package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.velocitypowered.api.event.Continuation;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.ResultedEvent.ComponentResult;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.event.connection.PreLoginEvent;
import com.velocitypowered.api.event.connection.PreLoginEvent.PreLoginComponentResult;
import com.velocitypowered.api.event.player.GameProfileRequestEvent;
import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.InboundConnection;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.util.GameProfile;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_266 implements NLoginInterface_029 {
   private static int gz = 224 >>> 98 | 224 << -98;
   private static long z = Long.reverse(-8193380304166494787L);
   private static long fc = Long.reverse(-8193380304166494787L);
   private static int iz = Integer.reverse(0);
   private static long ah = Long.reverse(-8193380304166494787L);
   private static long cv = Long.reverse(144115188075855872L);
   private static long hm = Long.reverse(144115188075855872L);
   private static long al = Long.reverse(-8337495492242350659L);
   private static int fx = Integer.reverse(Integer.MIN_VALUE);
   private static int is = Integer.reverse(570425344);
   private static int jf = (524288 >>> 47 | 524288 << -47) & -1;
   private static int jn = 9175040 >>> 17 | 9175040 << -17;
   private static long cg = Long.reverse(-8337495492242350659L);
   private static long dg = Long.reverse(-8337495492242350659L);
   private static int hg = Integer.reverse(-1073741824);
   private static long in = Long.reverse(-8193380304166494787L);
   private static int cp = Integer.reverse(-1207959552);
   private static int ie = -1 >>> 61 | -1 << -61;
   private static int el = Integer.reverse(1409286144);
   private static int ge = 0 >>> 232 | 0 << ~232 + 1;
   private static long eq = Long.reverse(-8193380304166494787L);
   private static long bp = Long.reverse(-8193380304166494787L);
   private static long e = Long.reverse(144115188075855872L);
   private static int by = 2048 >>> 75 | 2048 << -75;
   private static long jp = Long.reverse(144115188075855872L);
   private static int go = (1 >>> 128 | 1 << ~128 + 1) & -1;
   private static long ey = Long.reverse(-8337495492242350659L);
   private static int ak = Integer.reverse(-1342177280);
   private static long cq = Long.reverse(-8337495492242350659L);
   private static int jd = Integer.reverse(0);
   private static long ax = Long.reverse(144115188075855872L);
   private static long h = Long.reverse(144115188075855872L);
   private static int y = (2 >>> 190 | 2 << -190) & -1;
   private static int bf = Integer.reverse(671088640);
   private static int fe = (385024 >>> 205 | 385024 << -205) & -1;
   private static int a = 0 >>> 108 | 0 << ~108 + 1;
   private static long ij = Long.reverse(144115188075855872L);
   private static int aa = Integer.reverse(-1879048192);
   private static int at = (1024 >>> 102 | 1024 << ~102 + 1) & -1;
   private static long ii = Long.reverse(-8337495492242350659L);
   private static int bn = (22528 >>> 10 | 22528 << ~10 + 1) & -1;
   private static int ay = Integer.reverse(1207959552);
   private static int ci = Integer.reverse(Integer.MIN_VALUE);
   private static int dt = Integer.reverse(536870912);
   private static int ga = (65536 >>> 80 | 65536 << -80) & -1;
   private static long var_if = Long.reverse(-8193380304166494787L);
   private static int ai = Integer.reverse(805306368);
   private static long hb = Long.reverse(144115188075855872L);
   private static int o = Integer.reverse(-1610612736);
   private static int fb = Integer.reverse(1946157056);
   private static long en = Long.reverse(-8193380304166494787L);
   private static long n = Long.reverse(144115188075855872L);
   private static int ew = Integer.reverse(0);
   private static int cw = Integer.reverse(-1610612736);
   private static long aw = Long.reverse(-8337495492242350659L);
   private static long ce = Long.reverse(144115188075855872L);
   private static int bc = Integer.reverse(-939524096);
   private static long hi = Long.reverse(-8193380304166494787L);
   private static int dy = Integer.reverse(1677721600);
   private static long jt = Long.reverse(-8193380304166494787L);
   private static int hy = 262144 >>> 18 | 262144 << ~18 + 1;
   private static int hv = Integer.reverse(2080374784);
   private static int jb = (0 >>> 31 | 0 << -31) & -1;
   private static long ds = Long.reverse(-8193380304166494787L);
   private static int l = Integer.reverse(536870912);
   private static long dz = Long.reverse(-8193380304166494787L);
   private static long gi = Long.reverse(-8193380304166494787L);
   private static long hl = Long.reverse(-8337495492242350659L);
   private static int ho = Integer.reverse(1006632960);
   private static int co = (1610612736 >>> 157 | 1610612736 << -157) & -1;
   private static int ev = 10 >>> 33 | 10 << -33;
   private static int er = Integer.reverse(872415232);
   private static int bb = (0 >>> 41 | 0 << -41) & -1;
   private static int jc = 0 >>> 254 | 0 << -254;
   private static long t = Long.reverse(144115188075855872L);
   private static int fr = (0 >>> 52 | 0 << ~52 + 1) & -1;
   private static long hx = Long.reverse(144115188075855872L);
   private static int du = (9699328 >>> 146 | 9699328 << ~146 + 1) & -1;
   private static int gq = Integer.reverse(1610612736);
   private static long fn = Long.reverse(-8337495492242350659L);
   private static long ek = Long.reverse(-8193380304166494787L);
   private static int jm = Integer.reverse(0);
   private static int ja = 0 >>> 183 | 0 << ~183 + 1;
   private static int eu = (0 >>> 91 | 0 << ~91 + 1) & -1;
   private static int gp = Integer.reverse(0);
   private static long jh = Long.reverse(-8337495492242350659L);
   private static int ec = Integer.reverse(Integer.MIN_VALUE);
   private static int bi = Integer.reverse(-1476395008);
   private static long hf = Long.reverse(144115188075855872L);
   private static int ap = (0 >>> 223 | 0 << -223) & -1;
   private static long ib = Long.reverse(-8193380304166494787L);
   private static int ed = Integer.reverse(0);
   private static int dx = 1342177280 >>> 188 | 1342177280 << ~188 + 1;
   private static int hd = 933888 >>> 238 | 933888 << ~238 + 1;
   private static int af = Integer.reverse(0);
   private static int ep = Integer.reverse(-1);
   private static int gy = Integer.reverse(Integer.MIN_VALUE);
   private static long q = Long.reverse(144115188075855872L);
   private static long au = Long.reverse(-8193380304166494787L);
   private static int jq = 18432 >>> 40 | 18432 << ~40 + 1;
   private static int fw = Integer.reverse(0);
   private static int hr = Integer.reverse(1610612736);
   private static int ht = -402653183 >>> 219 | -402653183 << ~219 + 1;
   private static long g = Long.reverse(-8337495492242350659L);
   private static int av = Integer.reverse(-2013265920);
   private static int bj = Integer.reverse(-1);
   private static long bd = Long.reverse(-8337495492242350659L);
   private static int gh = (416 >>> 35 | 416 << ~35 + 1) & -1;
   private static long gt = Long.reverse(-8337495492242350659L);
   private static int cm = Integer.reverse(939524096);
   private static int fa = 536870912 >>> 221 | 536870912 << ~221 + 1;
   private static long dw = Long.reverse(144115188075855872L);
   private static int fl = Integer.reverse(536870912);
   private static int da = Integer.reverse(1610612736);
   private static int f = Integer.reverse(1073741824);
   private static int u = (0 >>> 240 | 0 << ~240 + 1) & -1;
   private static int ik = Integer.reverse(536870912);
   private static int jr = 9 >>> 93 | 9 << -93;
   private static int ac = Integer.reverse(1342177280);
   private static int aq = Integer.reverse(-268435456);
   private static long cr = Long.reverse(144115188075855872L);
   private static long ez = Long.reverse(144115188075855872L);
   private static int gd = Integer.reverse(0);
   private static long es = Long.reverse(-8337495492242350659L);
   private static int fy = 8388608 >>> 118 | 8388608 << -118;
   private static int iv = Integer.reverse(0);
   private static long dh = Long.reverse(144115188075855872L);
   private static long ei = Long.reverse(-8193380304166494787L);
   private static int ef = Integer.reverse(Integer.MIN_VALUE);
   private static int gf = 2 >>> 161 | 2 << -161;
   private static int c = (33554432 >>> 89 | 33554432 << -89) & -1;
   private static int bz = (0 >>> 207 | 0 << -207) & -1;
   private static long hw = Long.reverse(-8337495492242350659L);
   private static int bq = Integer.reverse(-402653184);
   private static int gr = Integer.reverse(0);
   private static long dk = Long.reverse(-8337495492242350659L);
   private static int jk = (0 >>> 111 | 0 << ~111 + 1) & -1;
   private static long bh = Long.reverse(144115188075855872L);
   private static int dj = (278528 >>> 173 | 278528 << ~173 + 1) & -1;
   private static int gl = (64 >>> 166 | 64 << ~166 + 1) & -1;
   private static long c;
   private static long var_do = Long.reverse(-8337495492242350659L);
   private static String[] ZKM_STR_A = new String[jq];
   private static int bw = Integer.reverse(Integer.MIN_VALUE);
   private static long bg = Long.reverse(-8337495492242350659L);
   private static int cs = 1073741824 >>> 28 | 1073741824 << -28;
   private static long bk = Long.reverse(-8193380304166494787L);
   private final nLoginVelocity f;
   private static int ee = Integer.reverse(0);
   private static long x = Long.reverse(144115188075855872L);
   private static int iy = 0 >>> 101 | 0 << -101;
   private static long w = Long.reverse(-8337495492242350659L);
   private static int bo = (-1 >>> 236 | -1 << ~236 + 1) & -1;
   private static int gb = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[jr];
   private static long he = Long.reverse(-8337495492242350659L);
   private static long gx = Long.reverse(-8193380304166494787L);
   private static long ft = Long.reverse(-8337495492242350659L);
   private static long fj = Long.reverse(-8337495492242350659L);
   private static long as = Long.reverse(144115188075855872L);
   private static long be = Long.reverse(144115188075855872L);
   private static int ia = (-1 >>> 198 | -1 << -198) & -1;
   private static int id = (4194304 >>> 240 | 4194304 << -240) & -1;
   private static int ct = (3840 >>> 71 | 3840 << ~71 + 1) & -1;
   private static int fi = Integer.reverse(201326592);
   private static int an = Integer.reverse(1879048192);
   private static int jj = (524288 >>> 243 | 524288 << ~243 + 1) & -1;
   private static int ig = Integer.reverse(-1073741824);
   private static int ea = Integer.reverse(-469762048);
   private static long ar = Long.reverse(-8337495492242350659L);
   private static int hk = Integer.reverse(-603979776);
   private static int df = Integer.reverse(-2080374784);
   private static int eh = Integer.reverse(-1);
   private static int ip = 1072 >>> 132 | 1072 << -132;
   private static int ic = (134217728 >>> 154 | 134217728 << ~154 + 1) & -1;
   private static int ex = (1744830465 >>> 123 | 1744830465 << -123) & -1;
   private static long p = Long.reverse(-8337495492242350659L);
   private static int io = (1073741825 >>> 62 | 1073741825 << ~62 + 1) & -1;
   private static int hs = Integer.reverse(0);
   private static long jo = Long.reverse(-8337495492242350659L);
   private static int gm = Integer.reverse(0);
   private static int eg = (640 >>> 228 | 640 << ~228 + 1) & -1;
   private static int cb = (0 >>> 45 | 0 << -45) & -1;
   private static int fd = (2 >>> 96 | 2 << -96) & -1;
   private static int gw = Integer.reverse(-1);
   private static int cy = (-1 >>> 224 | -1 << ~224 + 1) & -1;
   private static long dl = Long.reverse(144115188075855872L);
   private static int dm = Integer.reverse(1073741824);
   private static long bs = Long.reverse(-8193380304166494787L);
   private static int bt = Integer.reverse(402653184);
   private static long gk = Long.reverse(-8193380304166494787L);
   private static int dr = (4718592 >>> 49 | 4718592 << ~49 + 1) & -1;
   private static long dp = Long.reverse(144115188075855872L);
   private static int il = Integer.reverse(1107296256);
   private static long k = Long.reverse(-8193380304166494787L);
   private static long fg = Long.reverse(144115188075855872L);
   private final NLoginType_008 G;
   private static long hu = Long.reverse(-8193380304166494787L);
   private static long fq = Long.reverse(-8193380304166494787L);
   private static int ag = 2883584 >>> 82 | 2883584 << ~82 + 1;
   private static int cc = (3276800 >>> 113 | 3276800 << -113) & -1;
   private static int bx = 0 >>> 45 | 0 << -45;
   private static int gg = 0 >>> 11 | 0 << ~11 + 1;
   private static long ch = Long.reverse(144115188075855872L);
   private static int dc = 8 >>> 222 | 8 << -222;
   private static int j = Integer.reverse(-1073741824);
   private static int hc = (65536 >>> 207 | 65536 << ~207 + 1) & -1;
   private static long cd = Long.reverse(-8337495492242350659L);
   private static long s = Long.reverse(-8337495492242350659L);
   private static long fu = Long.reverse(144115188075855872L);
   private static int cf = (1744830464 >>> 186 | 1744830464 << -186) & -1;
   private static int fv = (33554432 >>> 87 | 33554432 << -87) & -1;
   private static long az = Long.reverse(-8337495492242350659L);
   private static long cn = Long.reverse(-8193380304166494787L);
   private static long bu = Long.reverse(-8337495492242350659L);
   private static int cx = (31744 >>> 234 | 31744 << ~234 + 1) & -1;
   private static long ao = Long.reverse(-8193380304166494787L);
   private static int r = 50331648 >>> 183 | 50331648 << -183;
   private static int gc = 0 >>> 185 | 0 << ~185 + 1;
   private static int fs = (208896 >>> 140 | 208896 << -140) & -1;
   private static long dv = Long.reverse(-8337495492242350659L);
   private static int hj = Integer.reverse(536870912);
   private static int fm = 1644167168 >>> 121 | 1644167168 << -121;
   private static int v = (117440512 >>> 24 | 117440512 << ~24 + 1) & -1;
   private static int eo = (11272192 >>> 146 | 11272192 << -146) & -1;
   private static int i = Integer.reverse(0);
   private static int ih = Integer.reverse(-2113929216);
   private static int fp = Integer.reverse(1275068416);
   private static long ae = Long.reverse(144115188075855872L);
   private static int cl = Integer.reverse(1073741824);
   private static int bl = 0 >>> 244 | 0 << -244;
   private static long ji = Long.reverse(144115188075855872L);
   private static int hn = Integer.reverse(-1610612736);
   private static int hh = (475136 >>> 173 | 475136 << -173) & -1;
   private static long ad = Long.reverse(-8337495492242350659L);
   private static long iu = Long.reverse(144115188075855872L);
   private static long ha = Long.reverse(-8337495492242350659L);
   private static long iq = Long.reverse(-8337495492242350659L);
   private static long iw = Long.reverse(1934296039955628032L);
   private static int em = Integer.reverse(-1);
   private static int ix = Integer.reverse(Integer.MIN_VALUE);
   private static long ff = Long.reverse(-8337495492242350659L);
   private static long bv = Long.reverse(144115188075855872L);
   private static int hz = Integer.reverse(-67108864);
   private static int db = 0 >>> 203 | 0 << ~203 + 1;
   private static long dd = Long.reverse(-8337495492242350659L);
   private static long eb = Long.reverse(-8193380304166494787L);
   private static int dn = Integer.reverse(-1006632960);
   private static long cz = Long.reverse(-8193380304166494787L);
   private static long hq = Long.reverse(144115188075855872L);
   private static long et = Long.reverse(144115188075855872L);
   private static long ba = Long.reverse(144115188075855872L);
   private static long ck = Long.reverse(-8193380304166494787L);
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static long it = Long.reverse(-8337495492242350659L);
   private static long cu = Long.reverse(-8337495492242350659L);
   private static int gn = (0 >>> 83 | 0 << -83) & -1;
   private static int br = Integer.reverse(-1);
   private static int ca = Integer.reverse(1610612736);
   private static int fh = 805306368 >>> 188 | 805306368 << ~188 + 1;
   private static long fo = Long.reverse(144115188075855872L);
   private static int gv = Integer.reverse(-335544320);
   public static final AttributeKey<FloodgatePlayer> g = NLoginCore_389.a(a(NLoginCore_266.js, jt));
   private static long gu = Long.reverse(144115188075855872L);
   private static long aj = Long.reverse(-8193380304166494787L);
   private static int im = Integer.reverse(-1);
   private static int gj = Integer.reverse(-1409286144);
   private static int fz = Integer.reverse(-1073741824);
   private static long hp = Long.reverse(-8337495492242350659L);
   private static long am = Long.reverse(144115188075855872L);
   private static long ab = Long.reverse(-8193380304166494787L);
   private static long m = Long.reverse(-8337495492242350659L);
   private static long b = Long.reverse(-8193380304166494787L);
   private static int gs = Integer.reverse(1811939328);
   private static long ir = Long.reverse(144115188075855872L);
   private static int js = (-1073741807 >>> 62 | -1073741807 << -62) & -1;
   private static int jg = 335544321 >>> 218 | 335544321 << -218;
   private static long d = Long.reverse(-8337495492242350659L);
   private static int di = (16 >>> 100 | 16 << -100) & -1;
   private static int ej = Integer.reverse(-1811939328);
   private static int dq = Integer.reverse(-1073741824);
   private static int je = Integer.reverse(0);
   private static long de = Long.reverse(144115188075855872L);
   private static int jl = Integer.reverse(Integer.MIN_VALUE);
   private static long fk = Long.reverse(144115188075855872L);
   private static int cj = 28311552 >>> 212 | 28311552 << ~212 + 1;

   static {
      b();
   }

   @Generated
   public NLoginCore_266(nLoginVelocity var1, NLoginType_008 var2) {
      this.f = var1;
      this.G = var2;
   }

   @Subscribe
   public void a(LoginEvent var1) {
      if (var1.getResult().isAllowed()) {
         Player var2 = var1.getPlayer();

         try {
            NLoginCore_277 var3 = this.f.b().a(var2);
            if (var3.S()) {
               return;
            }

            Channel var4 = this.G.b().a(var1, var2);
            String var5 = ((NLoginType_031)this.G.b()).a(var3, var1, var4, var2.isOnlineMode());
            if (var5 != null) {
               var1.setResult(ComponentResult.denied(NLoginCore_529.a(var5)));
            }
         } catch (Throwable var6) {
            NLoginCore_370.c(a(ai, aj) + var1.getClass().getSimpleName() + a(ak, al ^ am) + var2.getUsername() + a(an, ao), var6);
            var2.disconnect(NLoginCore_529.a(a(aq, ar ^ as)));
         }
      }
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(GameProfileRequestEvent var1) {
      Consumer var2 = var1x -> NLoginCore_273.a(var1.getConnection(), NLoginCore_529.a(var1x));

      try {
         this.a(var1, var2);
      } catch (Throwable var4) {
         NLoginCore_370.c(a(y, z) + var1.getClass().getSimpleName() + a(aa, ab) + var1.getUsername() + a(ac, ad ^ ae), var4);
         var2.accept(a(ag, ah));
      }
   }

   @Subscribe(
      order = PostOrder.LATE
   )
   public void a(PreLoginEvent var1, Continuation var2) {
      if (!var1.getResult().isAllowed()) {
         var2.resume();
      } else {
         try {
            this.b(var1, var2);
         } catch (Throwable var4) {
            NLoginCore_370.c(a(l, m ^ n) + var1.getClass().getSimpleName() + a(o, p ^ q) + var1.getUsername() + a(r, s ^ t), var4);
            var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(a(v, w ^ x))));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -538911383291221790L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(2 + 66),
                     69,
                     (byte)(43 + 40),
                     (byte)(36 + 11),
                     67,
                     (byte)(44 + 22),
                     (byte)(65 + 2),
                     (byte)(18 + 29),
                     (byte)(69 + 11),
                     (byte)(21 + 54),
                     (byte)(28 + 39),
                     (byte)(71 + 12),
                     (byte)(50 + 3),
                     (byte)(30 + 50),
                     (byte)(12 + 85),
                     (byte)(68 + 32),
                     (byte)(45 + 55),
                     (byte)(47 + 58),
                     (byte)(73 + 37),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.D("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣩࢺ\u08e2ࣦ࣎ࣛࣜࣵ", (byte)117, 68));
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

   @Subscribe
   public void b(DisconnectEvent var1) {
      Player var2 = var1.getPlayer();

      try {
         NLoginCore_277 var3 = this.f.b().a(var2);
         ((NLoginType_031)this.G.b()).d(var3);
      } catch (Throwable var4) {
         NLoginCore_370.c(a(at, au) + var1.getClass().getSimpleName() + a(av, aw ^ ax) + var2.getUsername() + a(ay, az ^ ba), var4);
         var2.disconnect(NLoginCore_529.a(a(bc, bd ^ be)));
      }
   }

   @Subscribe(
      order = PostOrder.EARLY
   )
   public void a(PreLoginEvent var1) {
      if (var1.getResult().isAllowed()) {
         try {
            this.b(var1);
         } catch (Throwable var3) {
            NLoginCore_370.c(a(a, b) + var1.getClass().getSimpleName() + a(c, d ^ e) + var1.getUsername() + a(f, g ^ h), var3);
            var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(a(j, k))));
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   private void b(PreLoginEvent var1, Continuation var2) {
      InboundConnection var3 = var1.getConnection();
      Channel var4 = NLoginCore_063.a(var1, var3);
      if (var4 == null) {
         var1.setResult(PreLoginComponentResult.denied(Component.text(a(bn & bo, bp) + var1.getClass().getCanonicalName() + a(bq & br, bs))));
         var2.resume();
      } else if (!this.G.b().e(var4)) {
         NLoginCore_271 var5 = null;
         String var6 = null;
         UUID var7 = null;
         if (this.G.b().a() instanceof NLoginCore_418 && var4.hasAttr(g)) {
            FloodgatePlayer var8 = (FloodgatePlayer)var4.attr(g).get();
            if (var8 != null) {
               var6 = var8.getCorrectUsername();
               var7 = var8.getJavaUniqueId();
               var5 = new NLoginCore_271(var8);
            }
         }

         String var17 = var6 != null ? var6 : var1.getUsername();
         InetAddress var9 = var3.getRemoteAddress().getAddress();
         NLoginCore_047 var10;
         if (BCryptHashProvider.c() != NLoginCore_555.f && var3.getProtocolVersion().compareTo(ProtocolVersion.MINECRAFT_1_19_1) >= 0) {
            var10 = new NLoginCore_047(var1.getUniqueId());
         } else {
            var10 = null;
         }

         if (NLoginCore_329.d.ar()) {
            if (var5 != null) {
               var4.attr(NLoginCore_588.f).set(new NLoginCore_588(null, null, var5, NLoginCore_460.b));
               var2.resume();
               return;
            }

            Optional var11 = var3.getVirtualHost();
            if (!var11.isPresent()) {
               var2.resumeWithException(new IllegalStateException(a(bt, bu ^ bv) + var17));
               return;
            }

            String var12 = ((InetSocketAddress)var11.get()).getHostName();
            NLoginCore_460 var13 = NLoginCore_460.a(var12);
            if (!var13.aQ() && var10 != null) {
               var13 = var10.b() != null && var10.a(this.f) ? NLoginCore_460.b : NLoginCore_460.c;
               if (var13 == NLoginCore_460.b) {
                  ForceRegisterConfig var14 = this.G.a().a(var17, var10.b(), (bw != 0));
                  if (var14 == null) {
                     String var24 = NLoginCore_150.a(NLoginCore_487.w);
                     var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var24)));
                     var2.resume();
                     return;
                  }

                  String var15 = var14.d(var17);
                  NLoginCore_184 var16 = NLoginCore_073.a(var15, var9);
                  if (var16 != NLoginCore_184.c && var14.r() && !var14.t()) {
                     NLoginCore_073.a(this.G, var15, var9, NLoginCore_184.b);
                     if (var16 != NLoginCore_184.e) {
                        var13 = NLoginCore_460.c;
                     }
                  }
               }
            }

            if (!var13.aQ() && this.G.a().p()) {
               var13 = NLoginCore_460.c;
            }

            var4.attr(NLoginCore_588.f).set(new NLoginCore_588(null, null, null, var13));
            switch (NLoginCore_486.W[var13.ordinal()]) {
               case 1:
                  var1.setResult(PreLoginComponentResult.forceOnlineMode());
                  break;
               case 2:
                  var1.setResult(PreLoginComponentResult.forceOfflineMode());
                  break;
               case 3:
                  NLoginCore_487 var26 = NLoginCore_487.Z;
                  Object[] var10001 = new Object[by];
                  var10001[bz] = var12;
                  String var23 = NLoginCore_150.a(var26, var10001);
                  var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var23)));
                  var2.resume();
                  return;
               case 4:
                  String var22;
                  if (NLoginCore_150.j()) {
                     String[] var10000 = new String[ca];
                     var10000[cb] = a(cc, cd ^ ce) + var12 + a(cf, cg ^ ch);
                     var10000[ci] = a(cj, ck);
                     var10000[cl] = a(cm, cn);
                     var10000[co] = a(cp, cq ^ cr);
                     var10000[cs] = a(ct, cu ^ cv);
                     var10000[cw] = a(cx & cy, cz);
                     var22 = NLoginCore_112.a(var10000);
                  } else {
                     String[] var25 = new String[da];
                     var25[db] = a(dc, dd ^ de) + var12 + a(df, dg ^ dh);
                     var25[di] = a(dj, dk ^ dl);
                     var25[dm] = a(dn, var_do ^ dp);
                     var25[dq] = a(dr, ds);
                     var25[dt] = a(du, dv ^ dw);
                     var25[dx] = a(dy, dz);
                     var22 = NLoginCore_112.a(var25);
                  }

                  var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var22)));
                  var2.resume();
                  return;
               default:
                  throw new IllegalArgumentException(a(ea, eb) + var13);
            }

            var2.resume();
         } else {
            ForceRegisterConfig var18 = this.G.a().a(var17, null, var7, (ec != 0));
            if (var18 == null) {
               String var21 = NLoginCore_150.a(NLoginCore_487.w);
               var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var21)));
               var2.resume();
               return;
            }

            if (!this.G.a().b(var18, var17)) {
               String var20 = NLoginCore_150.a(NLoginCore_487.w);
               var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var20)));
               var2.resume();
               return;
            }

            String var19 = var18.d(var17);
            var4.attr(NLoginCore_588.f).set(new NLoginCore_588(var18, var19, var5, null));
            if (var5 == null) {
               this.f.a((ef != 0)).a(() -> {
                  try {
                     NLoginCore_009 var7x = this.G.a().a(var18, var19, var9, var10);
                     switch (NLoginCore_486.X[var7x.ordinal()]) {
                        case 1:
                           NLoginCore_487 var11x = NLoginCore_487.aa;
                           Object[] var12x = new Object[jj];
                           var12x[jk] = var19;
                           String var10x = NLoginCore_150.a(var11x, var12x);
                           var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var10x)));
                           break;
                        case 2:
                           NLoginCore_487 var10000x = NLoginCore_487.ab;
                           Object[] var10001x = new Object[jl];
                           var10001x[jm] = var19;
                           String var8x = NLoginCore_150.a(var10000x, var10001x);
                           var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var8x)));
                           break;
                        case 3:
                           var1.setResult(PreLoginComponentResult.forceOnlineMode());
                        case 4:
                           break;
                        default:
                           throw new UnsupportedOperationException(a(jn, jo ^ jp) + var7x);
                     }

                     var2.resume();
                  } catch (Throwable var9x) {
                     var2.resumeWithException(var9x);
                  }
               });
            } else {
               var2.resume();
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_266.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.A("ŗŹŻśſƞƖƬƘŧƥƛƩƣŬƑƳƲƪưƪſ", (byte)88, 65), NLoginCore_266.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.E("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣩࢺ\u08e2ࣦ࣎ࣛࣜࣵէ", (byte)88, 69) + var1 + NLoginCore_183.A("ũ", (byte)88, 65) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   private void a(GameProfileRequestEvent var1, Consumer<String> var2) {
      InboundConnection var3 = var1.getConnection();
      InetSocketAddress var4 = var3.getRemoteAddress();
      Channel var5 = NLoginCore_063.a(var1, var3);
      if (var5 == null) {
         var2.accept(a(eg & eh, ei) + var1.getClass().getCanonicalName() + a(ej, ek));
      } else if (!this.G.b().e(var5)) {
         NLoginCore_588 var6 = (NLoginCore_588)var5.attr(NLoginCore_588.f).get();
         if (var6 == null) {
            String var25 = a(el & em, en) + var1.getUsername() + a(eo & ep, eq) + var1.getClass().getSimpleName() + a(er, es ^ et);
            NLoginCore_370.c(var25);
            String[] var44 = new String[ev];
            var44[ew] = a(ex, ey ^ ez);
            var44[fa] = a(fb, fc);
            var44[fd] = a(fe, ff ^ fg) + var25;
            var44[fh] = a(fi, fj ^ fk);
            var44[fl] = a(fm, fn ^ fo);
            var2.accept(NLoginCore_112.a(var44));
         } else {
            GameProfile var7 = var1.getGameProfile();
            GameProfile var8 = var1.getOriginalProfile();
            String var9 = var7.getName();
            UUID var10 = var1.isOnlineMode() ? var8.getId() : null;
            UUID var11 = var6.a != null ? var6.a.a.getJavaUniqueId() : null;
            String var12 = var8.getName();
            if (var10 != null && var6.a != null) {
               throw new IllegalStateException(a(fp, fq));
            } else {
               NLoginCore_291 var13 = this.G.a();
               ForceRegisterConfig var14 = var6.f;
               int var15 = fr;
               if (var10 != null) {
                  if (var14 != null && var14.getMojangId() != null && !var10.equals(var14.getMojangId())) {
                     String var10000 = a(fs, ft ^ fu);
                     Object[] var10001 = new Object[fv];
                     var10001[fw] = var14.getMojangId();
                     var10001[fx] = var10;
                     var10001[fy] = var14.i();
                     var10001[fz] = var12;
                     NLoginCore_370.b(var10000, var10001);
                     var14 = null;
                     var15 = ga;
                  }

                  ForceRegisterConfig var16 = var13.a(var12, var10, null, (gb != 0));
                  if (var16 == null) {
                     var2.accept(NLoginCore_150.a(NLoginCore_487.w));
                     return;
                  }

                  if (var14 == null || var16.r()) {
                     var14 = var16;
                  }
               }

               if (var14 == null || var6.ci == null) {
                  var14 = var13.a(var9, var10, var11, (gd != 0));
                  if (var14 == null) {
                     String var27 = NLoginCore_150.a(NLoginCore_487.w);
                     var2.accept(var27);
                     return;
                  }
               }

               byte var26 = NLoginCore_329.d.ar();
               if (var26 == (var6.a == null ? gf : gg)) {
                  String var28 = a(gh, gi);
                  var2.accept(var28);
               } else {
                  String var17;
                  String var18;
                  if (var6.a == null && var26 != 0) {
                     Optional var29 = var3.getVirtualHost();
                     if (!var29.isPresent()) {
                        throw new IllegalStateException(a(gj, gk) + var9);
                     }

                     String var20 = ((InetSocketAddress)var29.get()).getHostName();
                     switch (NLoginCore_486.W[var6.a.ordinal()]) {
                        case 1:
                           var17 = var9;
                           var18 = BCryptHashProvider.g(var9, (gl != 0));
                           break;
                        case 2:
                           if (!this.G.a().b(var14, var9)) {
                              String var33 = NLoginCore_150.a(NLoginCore_487.w);
                              var2.accept(var33);
                              return;
                           }

                           var17 = var14.d(var9);
                           var18 = BCryptHashProvider.g(var17, (gn != 0));
                           break;
                        case 3:
                           NLoginCore_487 var42 = NLoginCore_487.Z;
                           Object[] var43 = new Object[go];
                           var43[gp] = var20;
                           String var32 = NLoginCore_150.a(var42, var43);
                           var2.accept(var32);
                           return;
                        case 4:
                           String var21;
                           if (NLoginCore_150.j()) {
                              String[] var40 = new String[gq];
                              var40[gr] = a(gs, gt ^ gu) + var20 + a(gv & gw, gx);
                              var40[gy] = a(gz, ha ^ hb);
                              var40[hc] = a(hd, he ^ hf);
                              var40[hg] = a(hh, hi);
                              var40[hj] = a(hk, hl ^ hm);
                              var40[hn] = a(ho, hp ^ hq);
                              var21 = NLoginCore_112.a(var40);
                           } else {
                              String[] var41 = new String[hr];
                              var41[hs] = a(ht, hu) + var20 + a(hv, hw ^ hx);
                              var41[hy] = a(hz & ia, ib);
                              var41[ic] = a(id & ie, var_if);
                              var41[ig] = a(ih, ii ^ ij);
                              var41[ik] = a(il & im, in);
                              var41[io] = a(ip, iq ^ ir);
                              var21 = NLoginCore_112.a(var41);
                           }

                           var2.accept(var21);
                           return;
                        default:
                           throw new IllegalArgumentException(a(is, it ^ iu) + var6.a);
                     }
                  } else if (var10 == null && var6.a == null) {
                     if (!this.G.a().b(var14, var9)) {
                        String var19 = NLoginCore_150.a(NLoginCore_487.w);
                        var2.accept(var19);
                        return;
                     }

                     var17 = var18 = var14.d(var9);
                  } else {
                     var18 = var9;
                     var17 = var9;
                  }

                  var5.attr(NLoginCore_588.f).set(var6.a(var14, var17));
                  InetAddress var30 = var4.getAddress();
                  String var31 = var30.getHostAddress();
                  NLoginCore_277 var34 = this.f.b().a(var18);
                  if (var34 != null && var34.R()) {
                     NLoginCore_509 var22 = this.G.a().a(var34);
                     int var23 = var22 != null && System.currentTimeMillis() - var22.a(NLoginCore_567.h, 0L) > iw ? ix : iy;
                     String var24 = NLoginCore_150.a(NLoginCore_487.Y);
                     if (var23 == 0 || var6.a == null && (!NLoginCore_477.L.ar() || !var30.equals(var34.b().getAddress()) && !var31.equals(var14.k()))) {
                        var2.accept(var24);
                        return;
                     }

                     var34.a(var24);
                  }

                  GameProfile var35;
                  if (var6.a != null) {
                     if (this.G.a().b(var2, var14, var31, NLoginCore_477.J)) {
                        return;
                     }

                     if (this.G.a().a(var2, var14, var31, NLoginCore_477.R)) {
                        return;
                     }

                     if (!var13.a(var14, var6.a.a.getJavaUniqueId(), var17, var31)) {
                        var2.accept(NLoginCore_150.a(NLoginCore_487.w));
                        return;
                     }

                     if (!this.G.b().a().J() && !var14.u()) {
                        if (!this.G.a().b(var14, var17)) {
                           String var37 = NLoginCore_150.a(NLoginCore_487.w);
                           var2.accept(var37);
                           return;
                        }

                        var18 = var14.d(var17);
                        if (NLoginCore_329.d.ar()) {
                           var18 = BCryptHashProvider.g(var18, var14.t());
                        }
                     }

                     UUID var36 = var14.a();
                     var35 = new GameProfile(var36 != null && NLoginCore_329.m.ar() ? var36 : var7.getId(), var18, var7.getProperties());
                  } else if (var10 != null) {
                     if (this.G.a().b(var2, var14, var31, NLoginCore_477.I)) {
                        return;
                     }

                     if (this.G.a().a(var2, var14, var31, NLoginCore_477.Q)) {
                        return;
                     }

                     if (!var13.a(var14, var10, var17, var31, (var15 != 0))) {
                        var2.accept(NLoginCore_150.a(NLoginCore_487.w));
                        return;
                     }

                     var35 = new GameProfile(var14.a(), var18, var7.getProperties());
                  } else {
                     if (this.G.a().b(var2, var14, var31, null)) {
                        return;
                     }

                     if (this.G.a().a(var2, var14, var31, null)) {
                        return;
                     }

                     UUID var38 = NLoginCore_432.d(var17);
                     UUID var39 = var14.a();
                     if (var39 == null && (var14.h() || BCryptHashProvider.a() == NLoginCore_254.b)) {
                        var14.a(var39 = NLoginCore_432.a(var17, var38));
                        if (!var13.a(var14)) {
                           var2.accept(NLoginCore_150.a(NLoginCore_487.w));
                           return;
                        }
                     }

                     var35 = new GameProfile(var39 != null ? var39 : var38, var18, var7.getProperties());
                  }

                  if (var35.getName().length() > jf) {
                     throw new IllegalArgumentException(a(jg, jh ^ ji) + var35.getName());
                  } else {
                     var1.setGameProfile(var35);
                  }
               }
            }
         }
      }
   }

   private static void b() {
      c = -4775330558624214479L;
      long var0 = c ^ -538911383291221790L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(24 + 45),
               (byte)(44 + 39),
               (byte)(30 + 17),
               67,
               (byte)(44 + 22),
               (byte)(48 + 19),
               (byte)(10 + 37),
               (byte)(4 + 76),
               (byte)(14 + 61),
               (byte)(43 + 24),
               83,
               (byte)(50 + 3),
               (byte)(17 + 63),
               (byte)(74 + 23),
               (byte)(36 + 64),
               (byte)(85 + 15),
               (byte)(5 + 100),
               (byte)(33 + 77),
               (byte)(54 + 49)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_521.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 67);
               ZKM_STR_B[1] = NLoginCore_433.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
               ZKM_STR_B[2] = NLoginCore_433.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               ZKM_STR_B[3] = NLoginCore_091.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 68);
               ZKM_STR_B[4] = NLoginCore_183.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
               ZKM_STR_B[5] = NLoginCore_384.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
               ZKM_STR_B[6] = NLoginCore_004.C("ѰѠіѠѥяѴїѡѦ҆ё", (byte)28, 67);
               ZKM_STR_B[7] = NLoginCore_027.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
               ZKM_STR_B[8] = NLoginCore_530.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 65);
               ZKM_STR_B[9] = NLoginCore_138.B("ěÿäćāĒĉĶĂčöĮĭļðćĕĻĠŀĿŃĊċ", (byte)28, 66);
               ZKM_STR_B[10] = NLoginCore_110.A("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 65);
               ZKM_STR_B[11] = NLoginCore_471.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
               ZKM_STR_B[12] = NLoginCore_324.B("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 66);
               ZKM_STR_B[13] = NLoginCore_530.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
               ZKM_STR_B[14] = NLoginCore_446.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               ZKM_STR_B[15] = NLoginCore_091.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
               ZKM_STR_B[16] = NLoginCore_173.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
               ZKM_STR_B[17] = NLoginCore_183.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
               ZKM_STR_B[18] = NLoginCore_553.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               ZKM_STR_B[19] = NLoginCore_076.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
               ZKM_STR_B[20] = NLoginCore_575.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦԿեՊծԵԳԶկԵԷՓՀ", (byte)28, 70);
               ZKM_STR_B[21] = NLoginCore_092.F("ՌԣՃԪԧԷՈԩՂԙԯԠ", (byte)28, 70);
               ZKM_STR_B[22] = NLoginCore_451.D("ёѴѓѥѰнњѧѨѤҌҁрҋѭщўё҃ѵҗѵ҄Ґ҃эѲҎҘіҎїѰҖѻҟѦѤѧҠѦѨ҄ѱ", (byte)28, 68);
               ZKM_STR_B[23] = NLoginCore_451.A("īĂĢĉĆĖħĈġøĎÿ", (byte)28, 65);
               ZKM_STR_B[24] = NLoginCore_530.A("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 65);
               ZKM_STR_B[25] = NLoginCore_076.B("ùīñąîĩėčąġĪĳėĐčĵĽĺčďġĖĿĆĿĻğėňĻŉğĢěđįĆŀĐĥŅĖŅńĺŏĹĶķŝĻīğĽĪī", (byte)28, 66);
               ZKM_STR_B[26] = NLoginCore_471.C("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫҟұӍҲҹҫҹҧӀӒӗ", (byte)28, 67);
               ZKM_STR_B[27] = NLoginCore_397.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               ZKM_STR_B[28] = NLoginCore_127.E(
                  "ԡՑԞԔԽՈԪԣԕՑ\u0558ՌԗՏՈՠԙԜՀբԵԠՠ\u0558ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚\u0557յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ\u0590զժհ֘՚՜֒՞ղպ\u058bխջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊\u058b֬և֦֭֮֕֏ր",
                  (byte)28,
                  69
               );
               ZKM_STR_B[29] = NLoginCore_173.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
               ZKM_STR_B[30] = NLoginCore_223.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŲļŕƁœŗŤžƈńũ", (byte)28, 66);
               ZKM_STR_B[31] = NLoginCore_553.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
               ZKM_STR_B[32] = NLoginCore_575.B("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįŔĤňţŜķĨŬŚŠĸ", (byte)28, 66);
               ZKM_STR_B[33] = NLoginCore_241.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
               ZKM_STR_B[34] = NLoginCore_387.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               ZKM_STR_B[35] = NLoginCore_397.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
               ZKM_STR_B[36] = NLoginCore_004.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
               ZKM_STR_B[37] = NLoginCore_324.C("јѯіуѻєтѱс҈ѪѼѼ҇҉чѱѯѵҊѥѰѱѨѷѷѵќњѰѸѲѡҖґҀҟўѴѵҪѪҬҨѫҍҚѯѱ҄ҮҭҨѰҥғҫҌѼҕҒѻҮҘҚӂҶҺҸѹҞҹҘҤҽҭҸӍҰҹҮҴҡӀҎҨґӆӉҫӈҶӞұҹғ", (byte)28, 67);
               ZKM_STR_B[38] = NLoginCore_223.E("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ\u0590՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 69);
               ZKM_STR_B[39] = NLoginCore_384.F("ՒՈՋԞԪՈԯՔՎ՚Թ՚ՇԧԛԶԿՊ՟՝ՅԾԫԬ", (byte)28, 70);
               ZKM_STR_B[40] = NLoginCore_076.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĞńĩōĔĒĕŎĔĖĲğ", (byte)28, 66);
               ZKM_STR_B[41] = NLoginCore_530.D("ѽєѴћјѨѹњѳъѠё", (byte)28, 68);
               ZKM_STR_B[42] = NLoginCore_173.E("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ\u0558՚ԧգՅ՚ՏՀՃԮկ\u0530ՠնԯիԴնյվչոց՞ԿՂՕզճցոՙժՙ։ւգ֑", (byte)28, 69);
               ZKM_STR_B[43] = NLoginCore_387.A("ĎąČđæīįĲĆďõÿ", (byte)28, 65);
               ZKM_STR_B[44] = NLoginCore_173.C("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҞҘѦҏҬҡғѫҰѲѶҥѼѽ", (byte)28, 67);
               ZKM_STR_B[45] = NLoginCore_241.A("ùīñąîĩėčąġīĭĹĜčõòĪĮıľŃĊċ", (byte)28, 65);
               ZKM_STR_B[46] = NLoginCore_027.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
               ZKM_STR_B[47] = NLoginCore_451.C("й҃јѿѿѶ҃ѵѹѾ҆ё", (byte)28, 67);
               ZKM_STR_B[48] = NLoginCore_521.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
               ZKM_STR_B[49] = NLoginCore_575.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ\u0558ԩՑխՐՑէղՏլգՓմԷԷզ՝էԶծՕՏԻՎ՞ՋՌ", (byte)28, 70);
               ZKM_STR_B[50] = NLoginCore_553.A("ĂāĢýĕîĲĬñħİûċĦĎñĐĿÿġāþŀĖĘńŉĽĝĺńĽıĤĜōňįĵĿėŖđĪĨņĺĭŠŀłĺŗĻŔįŕŦĦĿĪŪŉĸĨšĮšŀĭůůĴŚŃŦųŲķžňŹŰŖŒōŊŋ", (byte)28, 65);
               ZKM_STR_B[51] = NLoginCore_091.D(
                  "йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԲԲԂӻԷԼԼԟԠՉՂԑ",
                  (byte)28,
                  68
               );
               ZKM_STR_B[52] = NLoginCore_433.B("ıħĪýĉħĎĳĭĹėćùĪĮùįÿģĹęĠĤĺćĜňĈĵŁĺĮĂŇŃňŅŀĈńĩĔĦİŜĚŗīĜĠŚŠĺŗģęņĢĺœŦĶŠŁŬģĭňŦŭĿłŏũŎĿ", (byte)28, 66);
               ZKM_STR_B[53] = NLoginCore_433.B("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 66);
               ZKM_STR_B[54] = NLoginCore_433.F("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ\u0530ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզե՛հ՚\u0557\u0558վ՜ՌՀ՞ՋՌ", (byte)28, 70);
               ZKM_STR_B[55] = NLoginCore_127.A("ìīĠĉčĕįāĴģĩíĪĽĮęĵĺĝĲĜĺąþłąĨąŉŊĿŊŋĺŎŇĪēŔĨŌŐĸļŌŜĔėĝİŁęĜŔĠİŢŠšŕļŪŘŏŪŋņŇšŅŦŠŕĹœŬŔŐĴŕůūūłřōşŻŠŧřŧŕŮƀƅ", (byte)28, 65);
               ZKM_STR_B[56] = NLoginCore_384.A("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 65);
               ZKM_STR_B[57] = NLoginCore_138.E(
                  "ԡՑԞԔԽՈԪԣԕՑ\u0558ՌԗՏՈՠԙԜՀբԵԠՠ\u0558ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚\u0557յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ\u0590զժհ֘՚՜֒՞ղպ\u058bխջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊\u058b֬և֦֭֮֕֏ր",
                  (byte)28,
                  69
               );
               ZKM_STR_B[58] = NLoginCore_076.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
               ZKM_STR_B[59] = NLoginCore_521.F(
                  "ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ\u0557ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ\u0557ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛\u058cըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓՝ն֢մոօ֟֩ե֊", (byte)28, 70
               );
               ZKM_STR_B[60] = NLoginCore_232.F("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ\u0590՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 70);
               ZKM_STR_B[61] = NLoginCore_384.C("ыѽуїрѻѩџїѳѻфѪѬҁљ҂Ҁ҆Ѯэ҆ҋ҉ѓѷѺҊѬғјҀҗңҝҔѵҔ҃҂ѵҌѬѼҚҋѬҨ҃ҳѾҦҁҦѶҚҵҮ҉ѺҾҬҲҊ", (byte)28, 67);
               ZKM_STR_B[62] = NLoginCore_575.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
               ZKM_STR_B[63] = NLoginCore_446.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               ZKM_STR_B[64] = NLoginCore_427.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
               ZKM_STR_B[65] = NLoginCore_173.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
               ZKM_STR_B[66] = NLoginCore_138.A("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŖĿŴŷřŶŤƌşŧŁ", (byte)28, 65);
               ZKM_STR_B[67] = NLoginCore_427.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
               ZKM_STR_B[68] = NLoginCore_451.D("҃ѹѼяћѹѠ҅ѿҋѪҋѸјьѧѰѻҐҎѶѯќѝ", (byte)28, 68);
               ZKM_STR_B[69] = NLoginCore_451.B("ýĪÿĜĤĝĲĆĐćČõĴöĲľĺĉĳĬĞĂŁăŁĆĹģŌĮČņĦłĬĜńłŖŐĸĥđėĹŔĘĬŊęīĴĴĭĪī", (byte)28, 66);
               ZKM_STR_B[70] = NLoginCore_241.A("ġĈĲąĮíĈħôģđįĚċććĭġĻŁČęıħĄĕĖĦğģĉĿĞĻĽĨŒĕŇĉĢĒęğ", (byte)28, 65);
               ZKM_STR_B[71] = NLoginCore_223.E("ԐԑՂԎԭԍԧԤԋԪՋՉԗՕԽԼԚՐԠՐԯՅԥթԴԿԣգծՎԻԢ", (byte)28, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.E("ԤԠԒԆ\u0530ԑՊՉԮՆՊՙԼԖ\u0557ՁԼԽՋԽԥՑԯՕԧԷՉըԟԬկԬՀխգՓէՄկթԹՆ՛Հ", (byte)28, 69);
               ZKM_STR_B[1] = NLoginCore_575.F("ԼԠԅԨԢԳԪ\u0557ԣԮԗԶԲԔՈԗ\u0558ՒԣԢ՞ԾԫԬ", (byte)28, 70);
               ZKM_STR_B[2] = NLoginCore_559.E("ԟԪԬՇՉՇԤՖՓԯԫԠ", (byte)28, 69);
               ZKM_STR_B[3] = NLoginCore_201.E(
                  "ԚՌԒԦԏՊԸԮԦՂՌԸԼԚՒ\u0530Պ՚ԹԡԯԷՁՕԱԳզԪԨԺա՞Ԫ՟զզ՟ԮՆ\u0557էհՒՇծԹԷհԷրՂ՛գՂՐվէ֊՟ՖՕբխզց\u058bբբ֕Ք֕ոՓդ֜\u0557մ֎\u0557՟֤֜֕֘փա֖֔֠ֈ֚րս֣ա֮ր֏֏ի֞\u058bֆ\u058b֍֙֏ր",
                  (byte)28,
                  69
               );
               ZKM_STR_B[4] = NLoginCore_183.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĲĲĀĚĂĶŉĜĖČĩ", (byte)28, 65);
               ZKM_STR_B[5] = NLoginCore_232.C("ѭёжљѓѤћ҈єџчҊрѭъѹѪѫээ҃ҕќѝ", (byte)28, 67);
               ZKM_STR_B[6] = NLoginCore_223.E("ՇԑԿԆԡԖՔԱԣՏԯԠ", (byte)28, 69);
               ZKM_STR_B[7] = NLoginCore_433.C(
                  "ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҔҵҢҺҼҬҕӝәҨҜҡӡӃҗӀҤҦӕҸӫӢұ", (byte)28, 67
               );
               ZKM_STR_B[8] = NLoginCore_027.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѸђј҅҆ҘѼ҇ѽѰҒҋѾѽѭҖѷҞѺҫѻҀѱ", (byte)28, 67);
               ZKM_STR_B[9] = NLoginCore_433.A("ěÿäćāĒĉĶĂčøĊĸĥĊĊčĚüīęĳĊċ", (byte)28, 65);
               ZKM_STR_B[10] = NLoginCore_201.E("ՊԚՆՀԎԞԷՇԣՅԣԠ", (byte)28, 69);
               ZKM_STR_B[11] = NLoginCore_521.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҍҷҳӚӌҕҺҙҰӎұҡҠҮҢӟӝӨҢӖҺңұ", (byte)28, 68);
               ZKM_STR_B[12] = NLoginCore_201.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĦēńĳĲĄĄŊķĠļōĬļŀħēĴĭēēĲğ", (byte)28, 65);
               ZKM_STR_B[13] = NLoginCore_575.E("ԼԠԅԨԢԳԪ\u0557ԣԮԙ՛ԵԼՒԘԮՌՁՃԮԮԫԬ", (byte)28, 69);
               ZKM_STR_B[14] = NLoginCore_110.A("ąñāđĜĔĨēĦčùÿ", (byte)28, 65);
               ZKM_STR_B[15] = NLoginCore_223.B(
                  "ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢŀŁšřŤşŵňŖƏŪŋŤŦŌŵƅƊƗƆŬŶş", (byte)28, 66
               );
               ZKM_STR_B[16] = NLoginCore_433.E("ԤԠԒԆ\u0530ԑՊՉԮՆՊՙԼԖ\u0557ՁԼԽՋԽԥՓ՞ՈեԨԫՀԨԩՐԧը՛ՑԾդ՟ՠիլեեՀ", (byte)28, 69);
               ZKM_STR_B[17] = NLoginCore_559.B("ěÿäćāĒĉĶĂčøČĄôõþò÷ĮĴĝŃĊċ", (byte)28, 66);
               ZKM_STR_B[18] = NLoginCore_241.F("ԍԨԤԞՔ\u0530\u0557\u0530ԭՔԷԠ", (byte)28, 70);
               ZKM_STR_B[19] = NLoginCore_451.A(
                  "ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢļƀƂżŉŊžŵƅťƅźŢŻŠƌƄœƎŤœƄş", (byte)28, 65
               );
               ZKM_STR_B[20] = NLoginCore_223.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĆăįČĎŇŌĮėĲĦŉńŞĦřŎőİŏĴœĪī", (byte)28, 66);
               ZKM_STR_B[21] = NLoginCore_530.A("ıãýíĥĵĕđĦðčđûħýĝĻġĲĂėčĊċ", (byte)28, 65);
               ZKM_STR_B[22] = NLoginCore_453.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦաՓՃզԽկլՄկՎյՒՐ՚լՠԽՊղՠտքՋՌ", (byte)28, 70);
               ZKM_STR_B[23] = NLoginCore_092.E("ԑԛԩՀՒԓԉԎԲՙԒ՛ԗԼՠԵԬԢԿԜՏդԫԬ", (byte)28, 69);
               ZKM_STR_B[24] = NLoginCore_091.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮҠҖ҄ѭҜҧҚҝѠѢ҅ѵѭҝҋѱҥѼҎѯҭѿѼѽ", (byte)28, 67);
               ZKM_STR_B[25] = NLoginCore_141.E("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ\u0530ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզԵոզԻՏՙշյփ՚ՆԹՄէՀՄվՕ֍վզ", (byte)28, 69);
               ZKM_STR_B[26] = NLoginCore_141.F(
                  "ԍՌՁԪԮԶՐԢՕՄՊԎՋ՞ՏԺՖ՛ԾՓԽ՛ԦԟգԦՉԦժիՠիլ՛կըՋԴյՉխձՙ՝խսԵԸԾՑբԺԽյՁՑփցւն՝\u058bչհ\u058bլէըւզևցն՚մ֍յձՕն\u0590\u058c\u058cգպմն֞ձճմ։դ֪֡֠", (byte)28, 70
               );
               ZKM_STR_B[27] = NLoginCore_173.E("ԼՋՔՇՈԒՌՔԪԮԻԠ", (byte)28, 69);
               ZKM_STR_B[28] = NLoginCore_091.A(
                  "ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰƈŮŉůƊőŲŏƅšŴƎŶƘƛŮŚŷơŭŚƣŪū", (byte)28, 65
               );
               ZKM_STR_B[29] = NLoginCore_232.A("ĊĆıîăĶĂĘ÷ıĖÿ", (byte)28, 65);
               ZKM_STR_B[30] = NLoginCore_091.E(
                  "ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ\u0557ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ\u0557ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛\u058cըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓զ֢դ֩թչ֦֬վ֡", (byte)28, 69
               );
               ZKM_STR_B[31] = NLoginCore_387.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŀőĮŢųŢűŔŸŸŰĿ", (byte)28, 65);
               ZKM_STR_B[32] = NLoginCore_453.A("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįśŜŜňĻŧŔŦŇĻš", (byte)28, 65);
               ZKM_STR_B[33] = NLoginCore_427.C("ѕ҃ҁѢфѕпѸѨчъіф҂ѮўѦғ҃ѮѤѭѬѴ҅Җѫҏѭ҈ѰқҏѡѾҏҥ҄қ҉҆ѴҝѭѥѩҧҦҳѮҴ҉ҢѿҦҸҕҨҥҖѵҨҒѹҍҡҜҸҡҁ҆Ҡ҂҇ҦҾӈ҅ӀӋӒҲҊҎҏҵҫӆӔӌӗҵҹӌҲӖ", (byte)28, 67);
               ZKM_STR_B[34] = NLoginCore_471.F("ՇԚՌԧՑԨՔՈԥ\u0530ՉԠ", (byte)28, 70);
               ZKM_STR_B[35] = NLoginCore_241.B(
                  "ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁťĸŘŅŸƉłŌƀŦŜŘƐńŧŵƆşƕŢŦŪş", (byte)28, 66
               );
               ZKM_STR_B[36] = NLoginCore_232.D("ѰѿєяпѤр҆ћчѶё", (byte)28, 68);
               ZKM_STR_B[37] = NLoginCore_433.B("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŐŹĽţŻƂŃŠŽŪť", (byte)28, 66);
               ZKM_STR_B[38] = NLoginCore_387.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŤŠŊĳœŦşůĸŁņĿ", (byte)28, 65);
               ZKM_STR_B[39] = NLoginCore_397.C("҃ѹѼяћѹѠ҅ѿҋѪѮ҂ѹѠьыѯэѳѷҔя҄ҘѣѫѰҒҟњҚ", (byte)28, 67);
               ZKM_STR_B[40] = NLoginCore_553.A("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąŁħĤġĤĨĮĿłİČĸİŋĳŚŋōĽıĖĽĪī", (byte)28, 65);
               ZKM_STR_B[41] = NLoginCore_530.A("ĥĲîíëĴòċČėĉĥîýĭľĔĝđėįĝĊċ", (byte)28, 65);
               ZKM_STR_B[42] = NLoginCore_223.F("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ\u0558՚ԧգՅ՚ՏՀՃԮկ\u0530ՠնԯիԴնյվչոց՞ԿՂՕղբՄ՞Մփմդ՚֏֊", (byte)28, 70);
               ZKM_STR_B[43] = NLoginCore_138.C("҂ѸкѠљхєјѽѽ҃ќ҉ј҃ҒѣѝќчѬџќѝ", (byte)28, 67);
               ZKM_STR_B[44] = NLoginCore_324.D("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҟҥүѿңҰѤѭ҆҅ҮҮҀҤҮҮҊҵҧҺґҹ", (byte)28, 68);
               ZKM_STR_B[45] = NLoginCore_127.A("ùīñąîĩėčąġĨĲøıļľĞĝøùıĳĊċ", (byte)28, 65);
               ZKM_STR_B[46] = NLoginCore_223.F("ՑՏԳԽ\u0530ԕԑՀՐԲՅԠ", (byte)28, 70);
               ZKM_STR_B[47] = NLoginCore_004.D("ѢѾљяїцтхѻҌјё", (byte)28, 68);
               ZKM_STR_B[48] = NLoginCore_446.A("ĤĦĦĉĤóďĆĉķĤÿ", (byte)28, 65);
               ZKM_STR_B[49] = NLoginCore_183.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ\u0558ԩՑխՐՑէղՏլգՓմԹԲԷ\u0558ՒՕ՜ծՑՁ՝քՋՌ", (byte)28, 70);
               ZKM_STR_B[50] = NLoginCore_451.F(
                  "ԣԢՃԞԶԏՓՍԒՈՑԜԬՇԯԒԱՠԠՂԢԟաԷԹեժ՞Ծ՛ե՞ՒՅԽծթՐՖՠԸշԲՋՉէ՛Վցագ՛ո՜յՐնևՇՠՋ\u058bժՙՉւՏւաՎ\u0590\u0590Օջգջկջ՟\u0558֊֡ջ՚ց֔իլ", (byte)28, 70
               );
               ZKM_STR_B[51] = NLoginCore_141.D(
                  "йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԀԒԔӻԒԽՃԳԠՀԇԍՃՋԢԜԐԥԫՔՔԯԜԝ",
                  (byte)28,
                  68
               );
               ZKM_STR_B[52] = NLoginCore_384.E("ՒՈՋԞԪՈԯՔՎ՚ԸԨԚՋՏԚՐԠՄ՚ԺՁՅ՛ԨԽթԩՖբ՛ՏԣըդթզաԩեՊԵՇՑսԻոՌԽՁջց՛ոՄԺէՃ՛մև\u0557ցբՃֆ՞֏փծ\u058cձիճիՠ", (byte)28, 69);
               ZKM_STR_B[53] = NLoginCore_091.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮ҃ғҗѱѳғѨҚ҆҂ѻҥ҄ѡ҃ҥѱҞҵҦҗҥѼѽ", (byte)28, 67);
               ZKM_STR_B[54] = NLoginCore_427.C("ыѽуїрѻѩџїѳѼ҅ѩѢџ҇ҏҌџѡѳѨґјґҍѱѩҚҍқѱѴѭѣҁјҒѢѷҗѨҙңҜѾѻѧҜѳҵҔҪѲҩҨҏҋҸҲҏѱҏү", (byte)28, 67);
               ZKM_STR_B[55] = NLoginCore_433.D("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫңҢҏҪӉҧҳҔҨҲҿ", (byte)28, 68);
               ZKM_STR_B[56] = NLoginCore_127.C("ъѢжіуєпѢѴѧуё", (byte)28, 67);
               ZKM_STR_B[57] = NLoginCore_127.B(
                  "ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰŸƅşƒůŪƗƄƋƌőƒƚżŪƗŗƂŶƝƓŭŪū", (byte)28, 66
               );
               ZKM_STR_B[58] = NLoginCore_521.A("ČúêìģìēđĄĵĸÿ", (byte)28, 65);
               ZKM_STR_B[59] = NLoginCore_241.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŭƄŦŽƆūƂŇŞŚš", (byte)28, 66);
               ZKM_STR_B[60] = NLoginCore_559.C("ѲѻсџѶѵѼѝѳѹ҈ѬҊѺѨҊѯҒѾҏғѿҌ҄ѢћѥҞѱѪҟїѫҤѱїҤҞҦѴҒҀҌѭ҆ҪҫҞҚҭҎҪҀѴѱҤғҬҏҏҸҟѶҗҋҙҖҵӀӄұҴғҡҾґ", (byte)28, 67);
               ZKM_STR_B[61] = NLoginCore_241.E("ԚՌԒԦԏՊԸԮԦՂՊԓԹԻՐԨՑՏՕԽԜՕ՚\u0558ԢՆՉՙԻբԧՏզղլգՄգՒՑՄ՛ԻՋթ՚ԻշՒւՍյՐմբՕ՜ՄքՔխխ\u0558֎", (byte)28, 69);
               ZKM_STR_B[62] = NLoginCore_471.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵœŕŸűŧĽŝŹŞŰƃŰƂŤŝżśňńŖŮƅ", (byte)28, 66);
               ZKM_STR_B[63] = NLoginCore_241.E("ՋՉԑՍԏՀՒԬԵՇԚԠ", (byte)28, 69);
               ZKM_STR_B[64] = NLoginCore_091.F(
                  "ՁԬԿԴԦՖԟ\u0530ԘԐՔԛԮԷԞԶ՝բԺԳ՚ԯգԽԽԾԥԥՁՆ\u0557իիԭիեԫ՞ՅՔնՑեՒՎլմ՝՟ԽԵՏՕդևֈՂժվփշչթՊսճ՝թՕ֖տցՔ֔շ֖ծզ՞֟պ\u0558կ֞բքֈ֦֞րշ֗օ֣֫ռձ֍֒խձ֟ծ֨չ֫֩ր", (byte)28, 70
               );
               ZKM_STR_B[65] = NLoginCore_451.D("Ѭёѳѱѐ҆тҁрхыё", (byte)28, 68);
               ZKM_STR_B[66] = NLoginCore_173.E(
                  "ԧԾԥԒՊԣԑՀԐ\u0557ԹՋՋՖ\u0558ԖՀԾՄՙԴԿՀԷՆՆՄԫԩԿՇՁ\u0530եՠՏծԭՃՄչԹջշԺ՜թԾՀՓսռշԿմբպ՛ՋդաՊսէթ֑օ։ևՈխֈէճ\u058cռև֜տֈսփհ֏՝յ֓՟ր֫֘ջխցք\u058c", (byte)28, 69
               );
               ZKM_STR_B[67] = NLoginCore_201.E("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզ֑օթ֎մՌ֑\u0558լ\u058cէՠ", (byte)28, 69);
               ZKM_STR_B[68] = NLoginCore_324.B("ıħĪýĉħĎĳĭĹęıĐļĭĺÿĳÿþŀÿēąłĄĉĿĺĭĥľ", (byte)28, 66);
               ZKM_STR_B[69] = NLoginCore_241.C("яѼёѮѶѯ҄јѢљўч҆ш҄ҐҌћ҅ѾѰєғѕғјҋѵҞҀўҘѸҔѾѮҖҔҨҢҊѷѣҙҝҎ҂ҮҚҬҋ҄ҷҏѼѽ", (byte)28, 67);
               ZKM_STR_B[70] = NLoginCore_141.E("ՂԩՓԦՏԎԩՈԕՄԲՐԻԬԨԨՎՂ՜բԭԺՒՈԥԶԷՇՀՄԪՠԿհՍԳղըԿմՔՆԲՀ", (byte)28, 69);
               ZKM_STR_B[71] = NLoginCore_387.B("ïðġíČìĆăêĉĪĨöĴĜěùįÿįĎİĴĚķŇĄāňğņĝ", (byte)28, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.D("ѷєѶѕѧѿјтѳѡќҌѺьѫуш҃ёѡѢѯќѝ", (byte)28, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_387.B("ĆĭĈıčĆĩĕĖāĭęĺĴēõěĢďĎĳčĊċ", (byte)28, 66);
         }
      }
   }

   private void b(PreLoginEvent var1) {
      InboundConnection var2 = var1.getConnection();
      String var3 = var1.getUsername();
      InetAddress var4 = var2.getRemoteAddress().getAddress();
      Channel var5 = NLoginCore_063.a(var1, var2);
      if (var5 == null) {
         var1.setResult(PreLoginComponentResult.denied(Component.text(a(bf, bg ^ bh) + var1.getClass().getCanonicalName() + a(bi & bj, bk))));
      } else if (!this.G.b().e(var5)) {
         int var6 = bl;
         if (this.G.b().a() instanceof NLoginCore_418 && var5.hasAttr(g)) {
            FloodgatePlayer var7 = (FloodgatePlayer)var5.attr(g).get();
            if (var7 != null) {
               var3 = var7.getCorrectUsername();
               var6 = bm;
            }
         }

         String var8 = this.G.b().a(var3, var4, Boolean.valueOf((var6 != 0)));
         if (var8 != null) {
            var1.setResult(PreLoginComponentResult.denied(NLoginCore_529.a(var8)));
         }
      }
   }
}
