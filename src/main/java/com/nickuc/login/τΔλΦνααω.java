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

public class τΔλΦνααω implements ωΩΩαομοΣψΩ {
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
   private static long if = Long.reverse(-8193380304166494787L);
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
   private static long do = Long.reverse(-8337495492242350659L);
   private static String[] a = new String[jq];
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
   private static String[] b = new String[jr];
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
   private final ΨγημιδξΓτοθαζ G;
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
   public static final AttributeKey<FloodgatePlayer> g = σιβεθκιπΓνΣΔουρ.a(c<"㺀">(τΔλΦνααω.js, jt));
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
   public τΔλΦνααω(nLoginVelocity var1, ΨγημιδξΓτοθαζ var2) {
      this.f = var1;
      this.G = var2;
   }

   @Subscribe
   public void a(LoginEvent var1) {
      if (var1.getResult().isAllowed()) {
         Player var2 = var1.getPlayer();

         try {
            ΨαχΨχΣλεΠψΦ var3 = this.f.b().a(var2);
            if (var3.S()) {
               return;
            }

            Channel var4 = this.G.b().a(var1, var2);
            String var5 = ((Ψογξκθθτ)this.G.b()).a(var3, var1, var4, var2.isOnlineMode());
            if (var5 != null) {
               var1.setResult(ComponentResult.denied(ΩτωνοφχεΠ.a(var5)));
            }
         } catch (Throwable var6) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(ai, aj) + var1.getClass().getSimpleName() + c<"㺃">(ak, al ^ am) + var2.getUsername() + c<"㺆">(an, ao), var6);
            var2.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(aq, ar ^ as)));
         }
      }
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(GameProfileRequestEvent var1) {
      Consumer var2 = var1x -> δςΩγΣβκΨΦη.a(var1.getConnection(), ΩτωνοφχεΠ.a(var1x));

      try {
         this.a(var1, var2);
      } catch (Throwable var4) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(y, z) + var1.getClass().getSimpleName() + c<"㺃">(aa, ab) + var1.getUsername() + c<"㺆">(ac, ad ^ ae), var4);
         var2.accept(c<"㺉">(ag, ah));
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
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(l, m ^ n) + var1.getClass().getSimpleName() + c<"㺃">(o, p ^ q) + var1.getUsername() + c<"㺆">(r, s ^ t), var4);
            var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(c<"㺉">(v, w ^ x))));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -538911383291221790L;
      if (a[var0] == null) {
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
            throw new RuntimeException(θεωψξβΛσσ.D("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣩࢺ\u08e2ࣦ࣎ࣛࣜࣵ", (byte)117, 68));
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

   @Subscribe
   public void b(DisconnectEvent var1) {
      Player var2 = var1.getPlayer();

      try {
         ΨαχΨχΣλεΠψΦ var3 = this.f.b().a(var2);
         ((Ψογξκθθτ)this.G.b()).d(var3);
      } catch (Throwable var4) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(at, au) + var1.getClass().getSimpleName() + c<"㺃">(av, aw ^ ax) + var2.getUsername() + c<"㺆">(ay, az ^ ba), var4);
         var2.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(bc, bd ^ be)));
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
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(a, b) + var1.getClass().getSimpleName() + c<"㺃">(c, d ^ e) + var1.getUsername() + c<"㺆">(f, g ^ h), var3);
            var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(c<"㺉">(j, k))));
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void b(PreLoginEvent var1, Continuation var2) {
      InboundConnection var3 = var1.getConnection();
      Channel var4 = τΩζτετνεθ.a(var1, var3);
      if (var4 == null) {
         var1.setResult(PreLoginComponentResult.denied(Component.text(c<"㺀">(bn & bo, bp) + var1.getClass().getCanonicalName() + c<"㺃">(bq & br, bs))));
         var2.resume();
      } else if (!this.G.b().e(var4)) {
         νμηαΣεφη var5 = null;
         String var6 = null;
         UUID var7 = null;
         if (this.G.b().a() instanceof ωΓΛΨΠωΦπΨχφβ && var4.hasAttr(g)) {
            FloodgatePlayer var8 = (FloodgatePlayer)var4.attr(g).get();
            if (var8 != null) {
               var6 = var8.getCorrectUsername();
               var7 = var8.getJavaUniqueId();
               var5 = new νμηαΣεφη(var8);
            }
         }

         String var17 = var6 != null ? var6 : var1.getUsername();
         InetAddress var9 = var3.getRemoteAddress().getAddress();
         τΠαΛκαωωμκνλΨα var10;
         if (βδΔφμπθθγ.c() != γΠζΣΣΩμΛ.f && var3.getProtocolVersion().compareTo(ProtocolVersion.MINECRAFT_1_19_1) >= 0) {
            var10 = new τΠαΛκαωωμκνλΨα(var1.getUniqueId());
         } else {
            var10 = null;
         }

         if (κδΔΦφγμδξΨωψο.d.ar()) {
            if (var5 != null) {
               var4.attr(ωΦΛΩμυνθφςςκαα.f).set(new ωΦΛΩμυνθφςςκαα(null, null, var5, ηεΓβΦχΩψςηδΠ.b));
               var2.resume();
               return;
            }

            Optional var11 = var3.getVirtualHost();
            if (!var11.isPresent()) {
               var2.resumeWithException(new IllegalStateException(c<"㺆">(bt, bu ^ bv) + var17));
               return;
            }

            String var12 = ((InetSocketAddress)var11.get()).getHostName();
            ηεΓβΦχΩψςηδΠ var13 = ηεΓβΦχΩψςηδΠ.a(var12);
            if (!var13.aQ() && var10 != null) {
               var13 = var10.b() != null && var10.a(this.f) ? ηεΓβΦχΩψςηδΠ.b : ηεΓβΦχΩψςηδΠ.c;
               if (var13 == ηεΓβΦχΩψςηδΠ.b) {
                  στΩξξχκι var14 = this.G.a().a(var17, var10.b(), (boolean)bw);
                  if (var14 == null) {
                     String var24 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                     var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var24)));
                     var2.resume();
                     return;
                  }

                  String var15 = var14.d(var17);
                  τσΦζχβμθναζμθω var16 = νκσΩννοψξ.a(var15, var9);
                  if (var16 != τσΦζχβμθναζμθω.c && var14.r() && !var14.t()) {
                     νκσΩννοψξ.a(this.G, var15, var9, τσΦζχβμθναζμθω.b);
                     if (var16 != τσΦζχβμθναζμθω.e) {
                        var13 = ηεΓβΦχΩψςηδΠ.c;
                     }
                  }
               }
            }

            if (!var13.aQ() && this.G.a().p()) {
               var13 = ηεΓβΦχΩψςηδΠ.c;
            }

            var4.attr(ωΦΛΩμυνθφςςκαα.f).set(new ωΦΛΩμυνθφςςκαα(null, null, null, var13));
            switch (λζφΨμτδΠοπΓΔτ.W[var13.ordinal()]) {
               case 1:
                  var1.setResult(PreLoginComponentResult.forceOnlineMode());
                  break;
               case 2:
                  var1.setResult(PreLoginComponentResult.forceOfflineMode());
                  break;
               case 3:
                  πωιψγηξΓρφυ var26 = πωιψγηξΓρφυ.Z;
                  Object[] var10001 = new Object[by];
                  var10001[bz] = var12;
                  String var23 = εδδΠηδξΛΣχ.a(var26, var10001);
                  var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var23)));
                  var2.resume();
                  return;
               case 4:
                  String var22;
                  if (εδδΠηδξΛΣχ.j()) {
                     String[] var10000 = new String[ca];
                     var10000[cb] = c<"㺉">(cc, cd ^ ce) + var12 + c<"㺌">(cf, cg ^ ch);
                     var10000[ci] = c<"㺏">(cj, ck);
                     var10000[cl] = c<"㺒">(cm, cn);
                     var10000[co] = c<"㺕">(cp, cq ^ cr);
                     var10000[cs] = c<"㺘">(ct, cu ^ cv);
                     var10000[cw] = c<"㺛">(cx & cy, cz);
                     var22 = βιχγΓλχΠσπ.a(var10000);
                  } else {
                     String[] var25 = new String[da];
                     var25[db] = c<"㺞">(dc, dd ^ de) + var12 + c<"㺡">(df, dg ^ dh);
                     var25[di] = c<"㺤">(dj, dk ^ dl);
                     var25[dm] = c<"㺧">(dn, do ^ dp);
                     var25[dq] = c<"㺪">(dr, ds);
                     var25[dt] = c<"㺭">(du, dv ^ dw);
                     var25[dx] = c<"㺰">(dy, dz);
                     var22 = βιχγΓλχΠσπ.a(var25);
                  }

                  var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var22)));
                  var2.resume();
                  return;
               default:
                  throw new IllegalArgumentException(c<"㺳">(ea, eb) + var13);
            }

            var2.resume();
         } else {
            στΩξξχκι var18 = this.G.a().a(var17, null, var7, (boolean)ec);
            if (var18 == null) {
               String var21 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
               var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var21)));
               var2.resume();
               return;
            }

            if (!this.G.a().b(var18, var17)) {
               String var20 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
               var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var20)));
               var2.resume();
               return;
            }

            String var19 = var18.d(var17);
            var4.attr(ωΦΛΩμυνθφςςκαα.f).set(new ωΦΛΩμυνθφςςκαα(var18, var19, var5, null));
            if (var5 == null) {
               this.f.a((boolean)ef).a(() -> {
                  try {
                     θκρδβκΓηζβδΛ var7x = this.G.a().a(var18, var19, var9, var10);
                     switch (λζφΨμτδΠοπΓΔτ.X[var7x.ordinal()]) {
                        case 1:
                           πωιψγηξΓρφυ var11x = πωιψγηξΓρφυ.aa;
                           Object[] var12x = new Object[jj];
                           var12x[jk] = var19;
                           String var10x = εδδΠηδξΛΣχ.a(var11x, var12x);
                           var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var10x)));
                           break;
                        case 2:
                           πωιψγηξΓρφυ var10000x = πωιψγηξΓρφυ.ab;
                           Object[] var10001x = new Object[jl];
                           var10001x[jm] = var19;
                           String var8x = εδδΠηδξΛΣχ.a(var10000x, var10001x);
                           var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var8x)));
                           break;
                        case 3:
                           var1.setResult(PreLoginComponentResult.forceOnlineMode());
                        case 4:
                           break;
                        default:
                           throw new UnsupportedOperationException(c<"㺀">(jn, jo ^ jp) + var7x);
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
                  τΔλΦνααω.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(μζξτΩσσφυδεπλΨ.A("ŗŹŻśſƞƖƬƘŧƥƛƩƣŬƑƳƲƪưƪſ", (byte)88, 65), τΔλΦνααω.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΨφιωσρΓδΔθ.E("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣩࢺ\u08e2ࣦ࣎ࣛࣜࣵէ", (byte)88, 69) + var1 + δΛψπξκσβγςα.A("ũ", (byte)88, 65) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(GameProfileRequestEvent var1, Consumer<String> var2) {
      InboundConnection var3 = var1.getConnection();
      InetSocketAddress var4 = var3.getRemoteAddress();
      Channel var5 = τΩζτετνεθ.a(var1, var3);
      if (var5 == null) {
         var2.accept(c<"㺀">(eg & eh, ei) + var1.getClass().getCanonicalName() + c<"㺃">(ej, ek));
      } else if (!this.G.b().e(var5)) {
         ωΦΛΩμυνθφςςκαα var6 = (ωΦΛΩμυνθφςςκαα)var5.attr(ωΦΛΩμυνθφςςκαα.f).get();
         if (var6 == null) {
            String var25 = c<"㺆">(el & em, en) + var1.getUsername() + c<"㺉">(eo & ep, eq) + var1.getClass().getSimpleName() + c<"㺌">(er, es ^ et);
            ψΓωτιμωκχψΛΨ.c(var25);
            String[] var44 = new String[ev];
            var44[ew] = c<"㺏">(ex, ey ^ ez);
            var44[fa] = c<"㺒">(fb, fc);
            var44[fd] = c<"㺕">(fe, ff ^ fg) + var25;
            var44[fh] = c<"㺘">(fi, fj ^ fk);
            var44[fl] = c<"㺛">(fm, fn ^ fo);
            var2.accept(βιχγΓλχΠσπ.a(var44));
         } else {
            GameProfile var7 = var1.getGameProfile();
            GameProfile var8 = var1.getOriginalProfile();
            String var9 = var7.getName();
            UUID var10 = var1.isOnlineMode() ? var8.getId() : null;
            UUID var11 = var6.a != null ? var6.a.a.getJavaUniqueId() : null;
            String var12 = var8.getName();
            if (var10 != null && var6.a != null) {
               throw new IllegalStateException(c<"㺞">(fp, fq));
            } else {
               ςθΓωΩπγΩΩΔβΨω var13 = this.G.a();
               στΩξξχκι var14 = var6.f;
               int var15 = fr;
               if (var10 != null) {
                  if (var14 != null && var14.getMojangId() != null && !var10.equals(var14.getMojangId())) {
                     String var10000 = c<"㺡">(fs, ft ^ fu);
                     Object[] var10001 = new Object[fv];
                     var10001[fw] = var14.getMojangId();
                     var10001[fx] = var10;
                     var10001[fy] = var14.i();
                     var10001[fz] = var12;
                     ψΓωτιμωκχψΛΨ.b(var10000, var10001);
                     var14 = null;
                     var15 = ga;
                  }

                  στΩξξχκι var16 = var13.a(var12, var10, null, (boolean)gb);
                  if (var16 == null) {
                     var2.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                     return;
                  }

                  if (var14 == null || var16.r()) {
                     var14 = var16;
                  }
               }

               if (var14 == null || var6.ci == null) {
                  var14 = var13.a(var9, var10, var11, (boolean)gd);
                  if (var14 == null) {
                     String var27 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                     var2.accept(var27);
                     return;
                  }
               }

               byte var26 = κδΔΦφγμδξΨωψο.d.ar();
               if (var26 == (var6.a == null ? gf : gg)) {
                  String var28 = c<"㺤">(gh, gi);
                  var2.accept(var28);
               } else {
                  String var17;
                  String var18;
                  if (var6.a == null && var26 != 0) {
                     Optional var29 = var3.getVirtualHost();
                     if (!var29.isPresent()) {
                        throw new IllegalStateException(c<"㺧">(gj, gk) + var9);
                     }

                     String var20 = ((InetSocketAddress)var29.get()).getHostName();
                     switch (λζφΨμτδΠοπΓΔτ.W[var6.a.ordinal()]) {
                        case 1:
                           var17 = var9;
                           var18 = βδΔφμπθθγ.g(var9, (boolean)gl);
                           break;
                        case 2:
                           if (!this.G.a().b(var14, var9)) {
                              String var33 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                              var2.accept(var33);
                              return;
                           }

                           var17 = var14.d(var9);
                           var18 = βδΔφμπθθγ.g(var17, (boolean)gn);
                           break;
                        case 3:
                           πωιψγηξΓρφυ var42 = πωιψγηξΓρφυ.Z;
                           Object[] var43 = new Object[go];
                           var43[gp] = var20;
                           String var32 = εδδΠηδξΛΣχ.a(var42, var43);
                           var2.accept(var32);
                           return;
                        case 4:
                           String var21;
                           if (εδδΠηδξΛΣχ.j()) {
                              String[] var40 = new String[gq];
                              var40[gr] = c<"㺪">(gs, gt ^ gu) + var20 + c<"㺭">(gv & gw, gx);
                              var40[gy] = c<"㺰">(gz, ha ^ hb);
                              var40[hc] = c<"㺳">(hd, he ^ hf);
                              var40[hg] = c<"㺶">(hh, hi);
                              var40[hj] = c<"㺹">(hk, hl ^ hm);
                              var40[hn] = c<"㺼">(ho, hp ^ hq);
                              var21 = βιχγΓλχΠσπ.a(var40);
                           } else {
                              String[] var41 = new String[hr];
                              var41[hs] = c<"㺿">(ht, hu) + var20 + c<"㻂">(hv, hw ^ hx);
                              var41[hy] = c<"㻅">(hz & ia, ib);
                              var41[ic] = c<"㻈">(id & ie, if);
                              var41[ig] = c<"㻋">(ih, ii ^ ij);
                              var41[ik] = c<"㻎">(il & im, in);
                              var41[io] = c<"㻑">(ip, iq ^ ir);
                              var21 = βιχγΓλχΠσπ.a(var41);
                           }

                           var2.accept(var21);
                           return;
                        default:
                           throw new IllegalArgumentException(c<"㻔">(is, it ^ iu) + var6.a);
                     }
                  } else if (var10 == null && var6.a == null) {
                     if (!this.G.a().b(var14, var9)) {
                        String var19 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        var2.accept(var19);
                        return;
                     }

                     var17 = var18 = var14.d(var9);
                  } else {
                     var18 = var9;
                     var17 = var9;
                  }

                  var5.attr(ωΦΛΩμυνθφςςκαα.f).set(var6.a(var14, var17));
                  InetAddress var30 = var4.getAddress();
                  String var31 = var30.getHostAddress();
                  ΨαχΨχΣλεΠψΦ var34 = this.f.b().a(var18);
                  if (var34 != null && var34.R()) {
                     ιηοψσγξςΩγδ var22 = this.G.a().a(var34);
                     int var23 = var22 != null && System.currentTimeMillis() - var22.a(πβκνλοΛκΠδΦτφλ.h, 0L) > iw ? ix : iy;
                     String var24 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.Y);
                     if (var23 == 0 || var6.a == null && (!ΣλνΨουΩΔοθεβ.L.ar() || !var30.equals(var34.b().getAddress()) && !var31.equals(var14.k()))) {
                        var2.accept(var24);
                        return;
                     }

                     var34.a(var24);
                  }

                  GameProfile var35;
                  if (var6.a != null) {
                     if (this.G.a().b(var2, var14, var31, ΣλνΨουΩΔοθεβ.J)) {
                        return;
                     }

                     if (this.G.a().a(var2, var14, var31, ΣλνΨουΩΔοθεβ.R)) {
                        return;
                     }

                     if (!var13.a(var14, var6.a.a.getJavaUniqueId(), var17, var31)) {
                        var2.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                        return;
                     }

                     if (!this.G.b().a().J() && !var14.u()) {
                        if (!this.G.a().b(var14, var17)) {
                           String var37 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                           var2.accept(var37);
                           return;
                        }

                        var18 = var14.d(var17);
                        if (κδΔΦφγμδξΨωψο.d.ar()) {
                           var18 = βδΔφμπθθγ.g(var18, var14.t());
                        }
                     }

                     UUID var36 = var14.a();
                     var35 = new GameProfile(var36 != null && κδΔΦφγμδξΨωψο.m.ar() ? var36 : var7.getId(), var18, var7.getProperties());
                  } else if (var10 != null) {
                     if (this.G.a().b(var2, var14, var31, ΣλνΨουΩΔοθεβ.I)) {
                        return;
                     }

                     if (this.G.a().a(var2, var14, var31, ΣλνΨουΩΔοθεβ.Q)) {
                        return;
                     }

                     if (!var13.a(var14, var10, var17, var31, (boolean)var15)) {
                        var2.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
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

                     UUID var38 = λΣσΣκΓβΠΨ.d(var17);
                     UUID var39 = var14.a();
                     if (var39 == null && (var14.h() || βδΔφμπθθγ.a() == νκθνεεηδδ.b)) {
                        var14.a(var39 = λΣσΣκΓβΠΨ.a(var17, var38));
                        if (!var13.a(var14)) {
                           var2.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                           return;
                        }
                     }

                     var35 = new GameProfile(var39 != null ? var39 : var38, var18, var7.getProperties());
                  }

                  if (var35.getName().length() > jf) {
                     throw new IllegalArgumentException(c<"㻗">(jg, jh ^ ji) + var35.getName());
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
               b[0] = μεςΩΔΣγν.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 67);
               b[1] = φδχεθοκψαλΛογλ.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
               b[2] = φδχεθοκψαλΛογλ.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               b[3] = ΠΛΨοδΩσμνΛγΦφβς.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 68);
               b[4] = δΛψπξκσβγςα.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
               b[5] = πχσδΦΦνθΔπ.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
               b[6] = χφπρψπφΦθμπ.C("ѰѠіѠѥяѴїѡѦ҆ё", (byte)28, 67);
               b[7] = ζβησεθωυγτ.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
               b[8] = θεωψξβΛσσ.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 65);
               b[9] = πηγμΣΔκκ.B("ěÿäćāĒĉĶĂčöĮĭļðćĕĻĠŀĿŃĊċ", (byte)28, 66);
               b[10] = ντθΔζβΔζ.A("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 65);
               b[11] = οοθδΨιοΦΠβδζ.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
               b[12] = ςΦζσμτΓσ.B("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 66);
               b[13] = θεωψξβΛσσ.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
               b[14] = μζξτΩσσφυδεπλΨ.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               b[15] = ΠΛΨοδΩσμνΛγΦφβς.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
               b[16] = βθκςνθΩθυμςτκχ.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
               b[17] = δΛψπξκσβγςα.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
               b[18] = λΣΩσμφγχ.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
               b[19] = ΣδτΠνεγοΓορητ.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
               b[20] = ςπυηννναΣ.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦԿեՊծԵԳԶկԵԷՓՀ", (byte)28, 70);
               b[21] = ζοηκορΦνΣθγΩ.F("ՌԣՃԪԧԷՈԩՂԙԯԠ", (byte)28, 70);
               b[22] = ΣφδσΔζιΠρα.D("ёѴѓѥѰнњѧѨѤҌҁрҋѭщўё҃ѵҗѵ҄Ґ҃эѲҎҘіҎїѰҖѻҟѦѤѧҠѦѨ҄ѱ", (byte)28, 68);
               b[23] = ΣφδσΔζιΠρα.A("īĂĢĉĆĖħĈġøĎÿ", (byte)28, 65);
               b[24] = θεωψξβΛσσ.A("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 65);
               b[25] = ΣδτΠνεγοΓορητ.B("ùīñąîĩėčąġĪĳėĐčĵĽĺčďġĖĿĆĿĻğėňĻŉğĢěđįĆŀĐĥŅĖŅńĺŏĹĶķŝĻīğĽĪī", (byte)28, 66);
               b[26] = οοθδΨιοΦΠβδζ.C("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫҟұӍҲҹҫҹҧӀӒӗ", (byte)28, 67);
               b[27] = οΩνΩρωλΨηΛδωδ.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               b[28] = ΨΦνΨΦωυΩνβςμ.E(
                  "ԡՑԞԔԽՈԪԣԕՑ\u0558ՌԗՏՈՠԙԜՀբԵԠՠ\u0558ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚\u0557յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ\u0590զժհ֘՚՜֒՞ղպ\u058bխջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊\u058b֬և֦֭֮֕֏ր",
                  (byte)28,
                  69
               );
               b[29] = βθκςνθΩθυμςτκχ.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
               b[30] = βεξΠθρρςΔΦμ.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŲļŕƁœŗŤžƈńũ", (byte)28, 66);
               b[31] = λΣΩσμφγχ.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
               b[32] = ςπυηννναΣ.B("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįŔĤňţŜķĨŬŚŠĸ", (byte)28, 66);
               b[33] = ΣερμΔσατσκ.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
               b[34] = χΠξΦιζΨΣωΦσΨζ.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               b[35] = οΩνΩρωλΨηΛδωδ.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
               b[36] = χφπρψπφΦθμπ.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
               b[37] = ςΦζσμτΓσ.C("јѯіуѻєтѱс҈ѪѼѼ҇҉чѱѯѵҊѥѰѱѨѷѷѵќњѰѸѲѡҖґҀҟўѴѵҪѪҬҨѫҍҚѯѱ҄ҮҭҨѰҥғҫҌѼҕҒѻҮҘҚӂҶҺҸѹҞҹҘҤҽҭҸӍҰҹҮҴҡӀҎҨґӆӉҫӈҶӞұҹғ", (byte)28, 67);
               b[38] = βεξΠθρρςΔΦμ.E("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ\u0590՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 69);
               b[39] = πχσδΦΦνθΔπ.F("ՒՈՋԞԪՈԯՔՎ՚Թ՚ՇԧԛԶԿՊ՟՝ՅԾԫԬ", (byte)28, 70);
               b[40] = ΣδτΠνεγοΓορητ.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĞńĩōĔĒĕŎĔĖĲğ", (byte)28, 66);
               b[41] = θεωψξβΛσσ.D("ѽєѴћјѨѹњѳъѠё", (byte)28, 68);
               b[42] = βθκςνθΩθυμςτκχ.E("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ\u0558՚ԧգՅ՚ՏՀՃԮկ\u0530ՠնԯիԴնյվչոց՞ԿՂՕզճցոՙժՙ։ւգ֑", (byte)28, 69);
               b[43] = χΠξΦιζΨΣωΦσΨζ.A("ĎąČđæīįĲĆďõÿ", (byte)28, 65);
               b[44] = βθκςνθΩθυμςτκχ.C("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҞҘѦҏҬҡғѫҰѲѶҥѼѽ", (byte)28, 67);
               b[45] = ΣερμΔσατσκ.A("ùīñąîĩėčąġīĭĹĜčõòĪĮıľŃĊċ", (byte)28, 65);
               b[46] = ζβησεθωυγτ.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
               b[47] = ΣφδσΔζιΠρα.C("й҃јѿѿѶ҃ѵѹѾ҆ё", (byte)28, 67);
               b[48] = μεςΩΔΣγν.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
               b[49] = ςπυηννναΣ.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ\u0558ԩՑխՐՑէղՏլգՓմԷԷզ՝էԶծՕՏԻՎ՞ՋՌ", (byte)28, 70);
               b[50] = λΣΩσμφγχ.A("ĂāĢýĕîĲĬñħİûċĦĎñĐĿÿġāþŀĖĘńŉĽĝĺńĽıĤĜōňįĵĿėŖđĪĨņĺĭŠŀłĺŗĻŔįŕŦĦĿĪŪŉĸĨšĮšŀĭůůĴŚŃŦųŲķžňŹŰŖŒōŊŋ", (byte)28, 65);
               b[51] = ΠΛΨοδΩσμνΛγΦφβς.D(
                  "йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԲԲԂӻԷԼԼԟԠՉՂԑ",
                  (byte)28,
                  68
               );
               b[52] = φδχεθοκψαλΛογλ.B("ıħĪýĉħĎĳĭĹėćùĪĮùįÿģĹęĠĤĺćĜňĈĵŁĺĮĂŇŃňŅŀĈńĩĔĦİŜĚŗīĜĠŚŠĺŗģęņĢĺœŦĶŠŁŬģĭňŦŭĿłŏũŎĿ", (byte)28, 66);
               b[53] = φδχεθοκψαλΛογλ.B("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 66);
               b[54] = φδχεθοκψαλΛογλ.F("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ\u0530ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզե՛հ՚\u0557\u0558վ՜ՌՀ՞ՋՌ", (byte)28, 70);
               b[55] = ΨΦνΨΦωυΩνβςμ.A("ìīĠĉčĕįāĴģĩíĪĽĮęĵĺĝĲĜĺąþłąĨąŉŊĿŊŋĺŎŇĪēŔĨŌŐĸļŌŜĔėĝİŁęĜŔĠİŢŠšŕļŪŘŏŪŋņŇšŅŦŠŕĹœŬŔŐĴŕůūūłřōşŻŠŧřŧŕŮƀƅ", (byte)28, 65);
               b[56] = πχσδΦΦνθΔπ.A("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 65);
               b[57] = πηγμΣΔκκ.E(
                  "ԡՑԞԔԽՈԪԣԕՑ\u0558ՌԗՏՈՠԙԜՀբԵԠՠ\u0558ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚\u0557յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ\u0590զժհ֘՚՜֒՞ղպ\u058bխջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊\u058b֬և֦֭֮֕֏ր",
                  (byte)28,
                  69
               );
               b[58] = ΣδτΠνεγοΓορητ.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
               b[59] = μεςΩΔΣγν.F(
                  "ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ\u0557ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ\u0557ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛\u058cըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓՝ն֢մոօ֟֩ե֊", (byte)28, 70
               );
               b[60] = ΦδφπθΩΩλζξ.F("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ\u0590՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 70);
               b[61] = πχσδΦΦνθΔπ.C("ыѽуїрѻѩџїѳѻфѪѬҁљ҂Ҁ҆Ѯэ҆ҋ҉ѓѷѺҊѬғјҀҗңҝҔѵҔ҃҂ѵҌѬѼҚҋѬҨ҃ҳѾҦҁҦѶҚҵҮ҉ѺҾҬҲҊ", (byte)28, 67);
               b[62] = ςπυηννναΣ.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
               b[63] = μζξτΩσσφυδεπλΨ.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
               b[64] = ιΠοθΩΦξκ.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
               b[65] = βθκςνθΩθυμςτκχ.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
               b[66] = πηγμΣΔκκ.A("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŖĿŴŷřŶŤƌşŧŁ", (byte)28, 65);
               b[67] = ιΠοθΩΦξκ.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
               b[68] = ΣφδσΔζιΠρα.D("҃ѹѼяћѹѠ҅ѿҋѪҋѸјьѧѰѻҐҎѶѯќѝ", (byte)28, 68);
               b[69] = ΣφδσΔζιΠρα.B("ýĪÿĜĤĝĲĆĐćČõĴöĲľĺĉĳĬĞĂŁăŁĆĹģŌĮČņĦłĬĜńłŖŐĸĥđėĹŔĘĬŊęīĴĴĭĪī", (byte)28, 66);
               b[70] = ΣερμΔσατσκ.A("ġĈĲąĮíĈħôģđįĚċććĭġĻŁČęıħĄĕĖĦğģĉĿĞĻĽĨŒĕŇĉĢĒęğ", (byte)28, 65);
               b[71] = βεξΠθρρςΔΦμ.E("ԐԑՂԎԭԍԧԤԋԪՋՉԗՕԽԼԚՐԠՐԯՅԥթԴԿԣգծՎԻԢ", (byte)28, 69);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.E("ԤԠԒԆ\u0530ԑՊՉԮՆՊՙԼԖ\u0557ՁԼԽՋԽԥՑԯՕԧԷՉըԟԬկԬՀխգՓէՄկթԹՆ՛Հ", (byte)28, 69);
               b[1] = ςπυηννναΣ.F("ԼԠԅԨԢԳԪ\u0557ԣԮԗԶԲԔՈԗ\u0558ՒԣԢ՞ԾԫԬ", (byte)28, 70);
               b[2] = ΨφιωσρΓδΔθ.E("ԟԪԬՇՉՇԤՖՓԯԫԠ", (byte)28, 69);
               b[3] = πψυκΠΨμΛΩβΣφμφσ.E(
                  "ԚՌԒԦԏՊԸԮԦՂՌԸԼԚՒ\u0530Պ՚ԹԡԯԷՁՕԱԳզԪԨԺա՞Ԫ՟զզ՟ԮՆ\u0557էհՒՇծԹԷհԷրՂ՛գՂՐվէ֊՟ՖՕբխզց\u058bբբ֕Ք֕ոՓդ֜\u0557մ֎\u0557՟֤֜֕֘փա֖֔֠ֈ֚րս֣ա֮ր֏֏ի֞\u058bֆ\u058b֍֙֏ր",
                  (byte)28,
                  69
               );
               b[4] = δΛψπξκσβγςα.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĲĲĀĚĂĶŉĜĖČĩ", (byte)28, 65);
               b[5] = ΦδφπθΩΩλζξ.C("ѭёжљѓѤћ҈єџчҊрѭъѹѪѫээ҃ҕќѝ", (byte)28, 67);
               b[6] = βεξΠθρρςΔΦμ.E("ՇԑԿԆԡԖՔԱԣՏԯԠ", (byte)28, 69);
               b[7] = φδχεθοκψαλΛογλ.C(
                  "ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҔҵҢҺҼҬҕӝәҨҜҡӡӃҗӀҤҦӕҸӫӢұ", (byte)28, 67
               );
               b[8] = ζβησεθωυγτ.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѸђј҅҆ҘѼ҇ѽѰҒҋѾѽѭҖѷҞѺҫѻҀѱ", (byte)28, 67);
               b[9] = φδχεθοκψαλΛογλ.A("ěÿäćāĒĉĶĂčøĊĸĥĊĊčĚüīęĳĊċ", (byte)28, 65);
               b[10] = πψυκΠΨμΛΩβΣφμφσ.E("ՊԚՆՀԎԞԷՇԣՅԣԠ", (byte)28, 69);
               b[11] = μεςΩΔΣγν.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҍҷҳӚӌҕҺҙҰӎұҡҠҮҢӟӝӨҢӖҺңұ", (byte)28, 68);
               b[12] = πψυκΠΨμΛΩβΣφμφσ.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĦēńĳĲĄĄŊķĠļōĬļŀħēĴĭēēĲğ", (byte)28, 65);
               b[13] = ςπυηννναΣ.E("ԼԠԅԨԢԳԪ\u0557ԣԮԙ՛ԵԼՒԘԮՌՁՃԮԮԫԬ", (byte)28, 69);
               b[14] = ντθΔζβΔζ.A("ąñāđĜĔĨēĦčùÿ", (byte)28, 65);
               b[15] = βεξΠθρρςΔΦμ.B(
                  "ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢŀŁšřŤşŵňŖƏŪŋŤŦŌŵƅƊƗƆŬŶş", (byte)28, 66
               );
               b[16] = φδχεθοκψαλΛογλ.E("ԤԠԒԆ\u0530ԑՊՉԮՆՊՙԼԖ\u0557ՁԼԽՋԽԥՓ՞ՈեԨԫՀԨԩՐԧը՛ՑԾդ՟ՠիլեեՀ", (byte)28, 69);
               b[17] = ΨφιωσρΓδΔθ.B("ěÿäćāĒĉĶĂčøČĄôõþò÷ĮĴĝŃĊċ", (byte)28, 66);
               b[18] = ΣερμΔσατσκ.F("ԍԨԤԞՔ\u0530\u0557\u0530ԭՔԷԠ", (byte)28, 70);
               b[19] = ΣφδσΔζιΠρα.A(
                  "ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢļƀƂżŉŊžŵƅťƅźŢŻŠƌƄœƎŤœƄş", (byte)28, 65
               );
               b[20] = βεξΠθρρςΔΦμ.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĆăįČĎŇŌĮėĲĦŉńŞĦřŎőİŏĴœĪī", (byte)28, 66);
               b[21] = θεωψξβΛσσ.A("ıãýíĥĵĕđĦðčđûħýĝĻġĲĂėčĊċ", (byte)28, 65);
               b[22] = φΨαξωυθανΣφυκη.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦաՓՃզԽկլՄկՎյՒՐ՚լՠԽՊղՠտքՋՌ", (byte)28, 70);
               b[23] = ζοηκορΦνΣθγΩ.E("ԑԛԩՀՒԓԉԎԲՙԒ՛ԗԼՠԵԬԢԿԜՏդԫԬ", (byte)28, 69);
               b[24] = ΠΛΨοδΩσμνΛγΦφβς.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮҠҖ҄ѭҜҧҚҝѠѢ҅ѵѭҝҋѱҥѼҎѯҭѿѼѽ", (byte)28, 67);
               b[25] = ξψθρΣΠΣς.E("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ\u0530ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզԵոզԻՏՙշյփ՚ՆԹՄէՀՄվՕ֍վզ", (byte)28, 69);
               b[26] = ξψθρΣΠΣς.F(
                  "ԍՌՁԪԮԶՐԢՕՄՊԎՋ՞ՏԺՖ՛ԾՓԽ՛ԦԟգԦՉԦժիՠիլ՛կըՋԴյՉխձՙ՝խսԵԸԾՑբԺԽյՁՑփցւն՝\u058bչհ\u058bլէըւզևցն՚մ֍յձՕն\u0590\u058c\u058cգպմն֞ձճմ։դ֪֡֠", (byte)28, 70
               );
               b[27] = βθκςνθΩθυμςτκχ.E("ԼՋՔՇՈԒՌՔԪԮԻԠ", (byte)28, 69);
               b[28] = ΠΛΨοδΩσμνΛγΦφβς.A(
                  "ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰƈŮŉůƊőŲŏƅšŴƎŶƘƛŮŚŷơŭŚƣŪū", (byte)28, 65
               );
               b[29] = ΦδφπθΩΩλζξ.A("ĊĆıîăĶĂĘ÷ıĖÿ", (byte)28, 65);
               b[30] = ΠΛΨοδΩσμνΛγΦφβς.E(
                  "ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ\u0557ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ\u0557ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛\u058cըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓զ֢դ֩թչ֦֬վ֡", (byte)28, 69
               );
               b[31] = χΠξΦιζΨΣωΦσΨζ.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŀőĮŢųŢűŔŸŸŰĿ", (byte)28, 65);
               b[32] = φΨαξωυθανΣφυκη.A("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįśŜŜňĻŧŔŦŇĻš", (byte)28, 65);
               b[33] = ιΠοθΩΦξκ.C("ѕ҃ҁѢфѕпѸѨчъіф҂ѮўѦғ҃ѮѤѭѬѴ҅Җѫҏѭ҈ѰқҏѡѾҏҥ҄қ҉҆ѴҝѭѥѩҧҦҳѮҴ҉ҢѿҦҸҕҨҥҖѵҨҒѹҍҡҜҸҡҁ҆Ҡ҂҇ҦҾӈ҅ӀӋӒҲҊҎҏҵҫӆӔӌӗҵҹӌҲӖ", (byte)28, 67);
               b[34] = οοθδΨιοΦΠβδζ.F("ՇԚՌԧՑԨՔՈԥ\u0530ՉԠ", (byte)28, 70);
               b[35] = ΣερμΔσατσκ.B(
                  "ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁťĸŘŅŸƉłŌƀŦŜŘƐńŧŵƆşƕŢŦŪş", (byte)28, 66
               );
               b[36] = ΦδφπθΩΩλζξ.D("ѰѿєяпѤр҆ћчѶё", (byte)28, 68);
               b[37] = φδχεθοκψαλΛογλ.B("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŐŹĽţŻƂŃŠŽŪť", (byte)28, 66);
               b[38] = χΠξΦιζΨΣωΦσΨζ.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŤŠŊĳœŦşůĸŁņĿ", (byte)28, 65);
               b[39] = οΩνΩρωλΨηΛδωδ.C("҃ѹѼяћѹѠ҅ѿҋѪѮ҂ѹѠьыѯэѳѷҔя҄ҘѣѫѰҒҟњҚ", (byte)28, 67);
               b[40] = λΣΩσμφγχ.A("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąŁħĤġĤĨĮĿłİČĸİŋĳŚŋōĽıĖĽĪī", (byte)28, 65);
               b[41] = θεωψξβΛσσ.A("ĥĲîíëĴòċČėĉĥîýĭľĔĝđėįĝĊċ", (byte)28, 65);
               b[42] = βεξΠθρρςΔΦμ.F("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ\u0558՚ԧգՅ՚ՏՀՃԮկ\u0530ՠնԯիԴնյվչոց՞ԿՂՕղբՄ՞Մփմդ՚֏֊", (byte)28, 70);
               b[43] = πηγμΣΔκκ.C("҂ѸкѠљхєјѽѽ҃ќ҉ј҃ҒѣѝќчѬџќѝ", (byte)28, 67);
               b[44] = ςΦζσμτΓσ.D("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҟҥүѿңҰѤѭ҆҅ҮҮҀҤҮҮҊҵҧҺґҹ", (byte)28, 68);
               b[45] = ΨΦνΨΦωυΩνβςμ.A("ùīñąîĩėčąġĨĲøıļľĞĝøùıĳĊċ", (byte)28, 65);
               b[46] = βεξΠθρρςΔΦμ.F("ՑՏԳԽ\u0530ԕԑՀՐԲՅԠ", (byte)28, 70);
               b[47] = χφπρψπφΦθμπ.D("ѢѾљяїцтхѻҌјё", (byte)28, 68);
               b[48] = μζξτΩσσφυδεπλΨ.A("ĤĦĦĉĤóďĆĉķĤÿ", (byte)28, 65);
               b[49] = δΛψπξκσβγςα.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ\u0558ԩՑխՐՑէղՏլգՓմԹԲԷ\u0558ՒՕ՜ծՑՁ՝քՋՌ", (byte)28, 70);
               b[50] = ΣφδσΔζιΠρα.F(
                  "ԣԢՃԞԶԏՓՍԒՈՑԜԬՇԯԒԱՠԠՂԢԟաԷԹեժ՞Ծ՛ե՞ՒՅԽծթՐՖՠԸշԲՋՉէ՛Վցագ՛ո՜յՐնևՇՠՋ\u058bժՙՉւՏւաՎ\u0590\u0590Օջգջկջ՟\u0558֊֡ջ՚ց֔իլ", (byte)28, 70
               );
               b[51] = ξψθρΣΠΣς.D(
                  "йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԀԒԔӻԒԽՃԳԠՀԇԍՃՋԢԜԐԥԫՔՔԯԜԝ",
                  (byte)28,
                  68
               );
               b[52] = πχσδΦΦνθΔπ.E("ՒՈՋԞԪՈԯՔՎ՚ԸԨԚՋՏԚՐԠՄ՚ԺՁՅ՛ԨԽթԩՖբ՛ՏԣըդթզաԩեՊԵՇՑսԻոՌԽՁջց՛ոՄԺէՃ՛մև\u0557ցբՃֆ՞֏փծ\u058cձիճիՠ", (byte)28, 69);
               b[53] = ΠΛΨοδΩσμνΛγΦφβς.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮ҃ғҗѱѳғѨҚ҆҂ѻҥ҄ѡ҃ҥѱҞҵҦҗҥѼѽ", (byte)28, 67);
               b[54] = ιΠοθΩΦξκ.C("ыѽуїрѻѩџїѳѼ҅ѩѢџ҇ҏҌџѡѳѨґјґҍѱѩҚҍқѱѴѭѣҁјҒѢѷҗѨҙңҜѾѻѧҜѳҵҔҪѲҩҨҏҋҸҲҏѱҏү", (byte)28, 67);
               b[55] = φδχεθοκψαλΛογλ.D("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫңҢҏҪӉҧҳҔҨҲҿ", (byte)28, 68);
               b[56] = ΨΦνΨΦωυΩνβςμ.C("ъѢжіуєпѢѴѧуё", (byte)28, 67);
               b[57] = ΨΦνΨΦωυΩνβςμ.B(
                  "ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰŸƅşƒůŪƗƄƋƌőƒƚżŪƗŗƂŶƝƓŭŪū", (byte)28, 66
               );
               b[58] = μεςΩΔΣγν.A("ČúêìģìēđĄĵĸÿ", (byte)28, 65);
               b[59] = ΣερμΔσατσκ.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŭƄŦŽƆūƂŇŞŚš", (byte)28, 66);
               b[60] = ΨφιωσρΓδΔθ.C("ѲѻсџѶѵѼѝѳѹ҈ѬҊѺѨҊѯҒѾҏғѿҌ҄ѢћѥҞѱѪҟїѫҤѱїҤҞҦѴҒҀҌѭ҆ҪҫҞҚҭҎҪҀѴѱҤғҬҏҏҸҟѶҗҋҙҖҵӀӄұҴғҡҾґ", (byte)28, 67);
               b[61] = ΣερμΔσατσκ.E("ԚՌԒԦԏՊԸԮԦՂՊԓԹԻՐԨՑՏՕԽԜՕ՚\u0558ԢՆՉՙԻբԧՏզղլգՄգՒՑՄ՛ԻՋթ՚ԻշՒւՍյՐմբՕ՜ՄքՔխխ\u0558֎", (byte)28, 69);
               b[62] = οοθδΨιοΦΠβδζ.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵœŕŸűŧĽŝŹŞŰƃŰƂŤŝżśňńŖŮƅ", (byte)28, 66);
               b[63] = ΣερμΔσατσκ.E("ՋՉԑՍԏՀՒԬԵՇԚԠ", (byte)28, 69);
               b[64] = ΠΛΨοδΩσμνΛγΦφβς.F(
                  "ՁԬԿԴԦՖԟ\u0530ԘԐՔԛԮԷԞԶ՝բԺԳ՚ԯգԽԽԾԥԥՁՆ\u0557իիԭիեԫ՞ՅՔնՑեՒՎլմ՝՟ԽԵՏՕդևֈՂժվփշչթՊսճ՝թՕ֖տցՔ֔շ֖ծզ՞֟պ\u0558կ֞բքֈ֦֞րշ֗օ֣֫ռձ֍֒խձ֟ծ֨չ֫֩ր", (byte)28, 70
               );
               b[65] = ΣφδσΔζιΠρα.D("Ѭёѳѱѐ҆тҁрхыё", (byte)28, 68);
               b[66] = βθκςνθΩθυμςτκχ.E(
                  "ԧԾԥԒՊԣԑՀԐ\u0557ԹՋՋՖ\u0558ԖՀԾՄՙԴԿՀԷՆՆՄԫԩԿՇՁ\u0530եՠՏծԭՃՄչԹջշԺ՜թԾՀՓսռշԿմբպ՛ՋդաՊսէթ֑օ։ևՈխֈէճ\u058cռև֜տֈսփհ֏՝յ֓՟ր֫֘ջխցք\u058c", (byte)28, 69
               );
               b[67] = πψυκΠΨμΛΩβΣφμφσ.E("ՁՊԐԮՅՄՋԬՂՈ\u0557ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզ֑օթ֎մՌ֑\u0558լ\u058cէՠ", (byte)28, 69);
               b[68] = ςΦζσμτΓσ.B("ıħĪýĉħĎĳĭĹęıĐļĭĺÿĳÿþŀÿēąłĄĉĿĺĭĥľ", (byte)28, 66);
               b[69] = ΣερμΔσατσκ.C("яѼёѮѶѯ҄јѢљўч҆ш҄ҐҌћ҅ѾѰєғѕғјҋѵҞҀўҘѸҔѾѮҖҔҨҢҊѷѣҙҝҎ҂ҮҚҬҋ҄ҷҏѼѽ", (byte)28, 67);
               b[70] = ξψθρΣΠΣς.E("ՂԩՓԦՏԎԩՈԕՄԲՐԻԬԨԨՎՂ՜բԭԺՒՈԥԶԷՇՀՄԪՠԿհՍԳղըԿմՔՆԲՀ", (byte)28, 69);
               b[71] = χΠξΦιζΨΣωΦσΨζ.B("ïðġíČìĆăêĉĪĨöĴĜěùįÿįĎİĴĚķŇĄāňğņĝ", (byte)28, 66);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.D("ѷєѶѕѧѿјтѳѡќҌѺьѫуш҃ёѡѢѯќѝ", (byte)28, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = χΠξΦιζΨΣωΦσΨζ.B("ĆĭĈıčĆĩĕĖāĭęĺĴēõěĢďĎĳčĊċ", (byte)28, 66);
         }
      }
   }

   private void b(PreLoginEvent var1) {
      InboundConnection var2 = var1.getConnection();
      String var3 = var1.getUsername();
      InetAddress var4 = var2.getRemoteAddress().getAddress();
      Channel var5 = τΩζτετνεθ.a(var1, var2);
      if (var5 == null) {
         var1.setResult(PreLoginComponentResult.denied(Component.text(c<"㺀">(bf, bg ^ bh) + var1.getClass().getCanonicalName() + c<"㺃">(bi & bj, bk))));
      } else if (!this.G.b().e(var5)) {
         int var6 = bl;
         if (this.G.b().a() instanceof ωΓΛΨΠωΦπΨχφβ && var5.hasAttr(g)) {
            FloodgatePlayer var7 = (FloodgatePlayer)var5.attr(g).get();
            if (var7 != null) {
               var3 = var7.getCorrectUsername();
               var6 = bm;
            }
         }

         String var8 = this.G.b().a(var3, var4, Boolean.valueOf((boolean)var6));
         if (var8 != null) {
            var1.setResult(PreLoginComponentResult.denied(ΩτωνοφχεΠ.a(var8)));
         }
      }
   }
}
