package com.nickuc.login;

import com.nickuc.login.loader.platform.BungeeLoader;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.event.EventHandler;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class χιΣωβσνλδΩβξΓδ implements χιςζΓθωφρο {
   private static int bv = -1610612734 >>> 61 | -1610612734 << ~61 + 1;
   private static long hq = Long.reverse(6341068275337658368L);
   private static int eq = -1 >>> 156 | -1 << ~156 + 1;
   private static long gi = Long.reverse(-2433164515615058875L);
   private static int hl = 225280 >>> 204 | 225280 << ~204 + 1;
   private static int dj = 0 >>> 132 | 0 << -132;
   private static long eu = Long.reverse(-2433164515615058875L);
   private static int dn = (-2147483645 >>> 189 | -2147483645 << -189) & -1;
   private static int iv = (0 >>> 51 | 0 << ~51 + 1) & -1;
   private static int ep = Integer.reverse(-1006632960);
   private static long bu = Long.reverse(6341068275337658368L);
   private static long ap = Long.reverse(-8774232790952717243L);
   private static long hb = Long.reverse(-2433164515615058875L);
   private static int ip = Integer.reverse(0);
   private static long hp = Long.reverse(-8774232790952717243L);
   private static long fy = Long.reverse(-2433164515615058875L);
   private static int w = Integer.reverse(0);
   private static int fc = (4992 >>> 135 | 4992 << ~135 + 1) & -1;
   private static long as = Long.reverse(-8774232790952717243L);
   private static long fa = Long.reverse(-2433164515615058875L);
   private static int ji = 4194304 >>> 118 | 4194304 << -118;
   private final ΨγημιδξΓτοθαζ D;
   private static int hz = Integer.reverse(-1073741824);
   private static long bx = Long.reverse(6341068275337658368L);
   private static long h = Long.reverse(-2433164515615058875L);
   private static long ac = Long.reverse(-2433164515615058875L);
   private static int cv = Integer.reverse(0);
   private static int dx = Integer.reverse(1073741824);
   private static long gn = Long.reverse(-2433164515615058875L);
   private static int ey = Integer.reverse(1073741824);
   private static int z = Integer.reverse(-1);
   private static int jg = Integer.reverse(0);
   private static long io = Long.reverse(6341068275337658368L);
   private static int fn = Integer.reverse(1409286144);
   private static long ca = Long.reverse(-2433164515615058875L);
   private static long db = Long.reverse(-2433164515615058875L);
   private static long bd = Long.reverse(6341068275337658368L);
   private static int eo = (0 >>> 224 | 0 << -224) & -1;
   private static int di = Integer.reverse(Integer.MIN_VALUE);
   private static int fs = 1024 >>> 106 | 1024 << ~106 + 1;
   private static long aw = Long.reverse(-2433164515615058875L);
   private static int hk = (262144 >>> 16 | 262144 << ~16 + 1) & -1;
   private static long ij = Long.reverse(-8774232790952717243L);
   private static long gs = Long.reverse(6341068275337658368L);
   private static long aq = Long.reverse(6341068275337658368L);
   private static long l = Long.reverse(-8774232790952717243L);
   private static int bo = 2048 >>> 43 | 2048 << ~43 + 1;
   private static int ix = Integer.reverse(0);
   private static int ab = 16 >>> 1 | 16 << -1;
   private static int df = Integer.reverse(Integer.MIN_VALUE);
   private static long fk = Long.reverse(-8774232790952717243L);
   private static int bm = (-1 >>> 223 | -1 << ~223 + 1) & -1;
   private static int jb = Integer.reverse(Integer.MIN_VALUE);
   private static int cb = (96468992 >>> 86 | 96468992 << -86) & -1;
   private static long az = Long.reverse(-8774232790952717243L);
   private static int c = (268435456 >>> 220 | 268435456 << ~220 + 1) & -1;
   private static int ht = (-1 >>> 131 | -1 << -131) & -1;
   private static int fw = 2048 >>> 43 | 2048 << ~43 + 1;
   private static int ce = (24320 >>> 5 | 24320 << ~5 + 1) & -1;
   private static long dv = Long.reverse(-8774232790952717243L);
   private static int fq = Integer.reverse(Integer.MIN_VALUE);
   private static long hf = Long.reverse(6341068275337658368L);
   private static int fx = Integer.reverse(-738197504);
   private static int gd = -1610612731 >>> 61 | -1610612731 << -61;
   private static int dt = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(-8774232790952717243L);
   private static long ik = Long.reverse(6341068275337658368L);
   private static int cf = (786432 >>> 239 | 786432 << -239) & -1;
   private static int iu = Integer.reverse(Integer.MIN_VALUE);
   private static long dw = Long.reverse(6341068275337658368L);
   private static int bf = Integer.reverse(-1);
   private static int hx = Integer.reverse(Integer.MIN_VALUE);
   private static int dq = (58 >>> 225 | 58 << ~225 + 1) & -1;
   private static int ao = -2147483647 >>> 125 | -2147483647 << ~125 + 1;
   private static int iz = Integer.reverse(Integer.MIN_VALUE);
   private static int il = Integer.reverse(0);
   private static long in = Long.reverse(-8774232790952717243L);
   private static long he = Long.reverse(-8774232790952717243L);
   private static long bc = Long.reverse(-8774232790952717243L);
   private static long dd = Long.reverse(-2433164515615058875L);
   private static int go = (3136 >>> 38 | 3136 << -38) & -1;
   private static int hs = Integer.reverse(-1677721600);
   private static int ii = 7552 >>> 103 | 7552 << ~103 + 1;
   private static long em = Long.reverse(6341068275337658368L);
   private static int ag = 1342177280 >>> 219 | 1342177280 << ~219 + 1;
   private static int bk = 0 >>> 26 | 0 << -26;
   private static long gy = Long.reverse(-2433164515615058875L);
   private static long gl = Long.reverse(-2433164515615058875L);
   private static long bj = Long.reverse(6341068275337658368L);
   private static long hm = Long.reverse(-8774232790952717243L);
   private static int bh = 9 >>> 255 | 9 << ~255 + 1;
   private static int hd = (1736704 >>> 79 | 1736704 << ~79 + 1) & -1;
   private static int q = Integer.reverse(-1610612736);
   private static long bw = Long.reverse(-8774232790952717243L);
   private static long m = Long.reverse(6341068275337658368L);
   private static int gk = -1 >>> 229 | -1 << ~229 + 1;
   private static int dc = (3328 >>> 167 | 3328 << ~167 + 1) & -1;
   private static int cj = Integer.reverse(0);
   private static int ic = (0 >>> 20 | 0 << ~20 + 1) & -1;
   private static int iy = (65536 >>> 80 | 65536 << ~80 + 1) & -1;
   private static int ar = Integer.reverse(-1342177280);
   private static int jd = (0 >>> 69 | 0 << ~69 + 1) & -1;
   private static int jh = 0 >>> 80 | 0 << -80;
   private static int ck = Integer.reverse(Integer.MIN_VALUE);
   private static long ed = Long.reverse(-8774232790952717243L);
   private static int gw = 3264 >>> 198 | 3264 << -198;
   private static int bp = Integer.reverse(0);
   private static String[] a = new String[χιΣωβσνλδΩβξΓδ.jm];
   private static int gt = (0 >>> 94 | 0 << ~94 + 1) & -1;
   private static int gj = (188 >>> 98 | 188 << ~98 + 1) & -1;
   private static int gb = Integer.reverse(0);
   private static int cw = Integer.reverse(Integer.MIN_VALUE);
   private static int gf = Integer.reverse(Integer.MIN_VALUE);
   private static long dz = Long.reverse(-8774232790952717243L);
   private static long bi = Long.reverse(-8774232790952717243L);
   private static int bs = (5 >>> 158 | 5 << -158) & -1;
   private static int fm = Integer.reverse(Integer.MIN_VALUE);
   private static int fb = (-2147483647 >>> 63 | -2147483647 << ~63 + 1) & -1;
   private static int cl = Integer.reverse(0);
   private static int jm = Integer.reverse(2080374784);
   private static long e = Long.reverse(6341068275337658368L);
   private static int gv = (0 >>> 40 | 0 << -40) & -1;
   private static int jj = Integer.reverse(-1140850688);
   private static int ak = (16777216 >>> 216 | 16777216 << -216) & -1;
   private static long ds = Long.reverse(6341068275337658368L);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static long r = Long.reverse(-8774232790952717243L);
   private static int iw = Integer.reverse(0);
   private static long fo = Long.reverse(-8774232790952717243L);
   private static int es = Integer.reverse(603979776);
   private static int hh = (110592 >>> 107 | 110592 << ~107 + 1) & -1;
   private static long bg = Long.reverse(-2433164515615058875L);
   private static int by = Integer.reverse(1744830464);
   private static int ct = Integer.reverse(0);
   private static int cp = (4194304 >>> 150 | 4194304 << -150) & -1;
   private static long bn = Long.reverse(-2433164515615058875L);
   private static long fl = Long.reverse(6341068275337658368L);
   private static int fr = (0 >>> 166 | 0 << ~166 + 1) & -1;
   private static int ft = Integer.reverse(0);
   private static int f = Integer.reverse(1073741824);
   private static int g = Integer.reverse(-1);
   private static int a = 0 >>> 165 | 0 << ~165 + 1;
   private static long dp = Long.reverse(6341068275337658368L);
   private static int al = Integer.reverse(-805306368);
   private static long aa = Long.reverse(-2433164515615058875L);
   private static int i = (0 >>> 253 | 0 << ~253 + 1) & -1;
   private static int fg = 167772160 >>> 246 | 167772160 << -246;
   private static long cc = Long.reverse(-8774232790952717243L);
   private static int ir = (0 >>> 93 | 0 << ~93 + 1) & -1;
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int dk = Integer.reverse(Integer.MIN_VALUE);
   private static int fd = Integer.reverse(-1);
   private static int gx = Integer.reverse(-1);
   private static int ia = 33554432 >>> 185 | 33554432 << -185;
   private static int dy = Integer.reverse(-134217728);
   private static int je = Integer.reverse(Integer.MIN_VALUE);
   private static int cr = (1024 >>> 170 | 1024 << -170) & -1;
   private static int u = Integer.reverse(-1);
   private static int jc = Integer.reverse(Integer.MIN_VALUE);
   private static long ex = Long.reverse(-2433164515615058875L);
   private static int t = Integer.reverse(1610612736);
   private static int ad = 150994944 >>> 24 | 150994944 << -24;
   private static int de = 0 >>> 49 | 0 << -49;
   private static int if = 58 >>> 0 | 58 << -0;
   private static int hy = Integer.reverse(1073741824);
   private static long ge = Long.reverse(-2433164515615058875L);
   private static int bq = Integer.reverse(Integer.MIN_VALUE);
   private static int ef = ('耀' >>> 'm' | 32768 << ~109 + 1) & -1;
   private static int be = ('蠀' >>> 171 | 34816 << ~171 + 1) & -1;
   private static int jn = Integer.reverse(2080374784);
   private static long b = Long.reverse(-2433164515615058875L);
   private static long o = Long.reverse(-8774232790952717243L);
   private static int dg = Integer.reverse(-671088640);
   private static long ae = Long.reverse(-8774232790952717243L);
   private static int fj = (343932928 >>> 183 | 343932928 << -183) & -1;
   private static long eh = Long.reverse(-8774232790952717243L);
   private static int gz = Integer.reverse(Integer.MIN_VALUE);
   private static int j = 33554432 >>> 25 | 33554432 << ~25 + 1;
   private static int gu = Integer.reverse(-1610612736);
   private static long dr = Long.reverse(-8774232790952717243L);
   private static long ai = Long.reverse(6341068275337658368L);
   private static int hr = 0 >>> 10 | 0 << ~10 + 1;
   private static long ba = Long.reverse(6341068275337658368L);
   private static int ib = (0 >>> 29 | 0 << -29) & -1;
   private static int gc = Integer.reverse(Integer.MIN_VALUE);
   private static long cg = Long.reverse(-2433164515615058875L);
   private static int im = Integer.reverse(1006632960);
   private static long fh = Long.reverse(-2433164515615058875L);
   private static int gm = 12 >>> 30 | 12 << -30;
   private static int dm = Integer.reverse(0);
   private static int ek = 8912896 >>> 18 | 8912896 << ~18 + 1;
   private static long hn = Long.reverse(6341068275337658368L);
   private static int jf = Integer.reverse(Integer.MIN_VALUE);
   private static int fu = 8192 >>> 45 | 8192 << -45;
   private static long fp = Long.reverse(6341068275337658368L);
   private static int hw = 0 >>> 128 | 0 << ~128 + 1;
   private static int ch = (0 >>> 76 | 0 << ~76 + 1) & -1;
   private static long p = Long.reverse(6341068275337658368L);
   private static int hc = Integer.MIN_VALUE >>> 30 | Integer.MIN_VALUE << -30;
   private static int ay = (-1073741821 >>> 254 | -1073741821 << -254) & -1;
   private static long ig = Long.reverse(-8774232790952717243L);
   private static long ih = Long.reverse(6341068275337658368L);
   private static int hg = Integer.reverse(-1073741824);
   private static long am = Long.reverse(-8774232790952717243L);
   private static long an = Long.reverse(6341068275337658368L);
   private static int ej = 640 >>> 231 | 640 << ~231 + 1;
   private static int iq = (0 >>> 179 | 0 << -179) & -1;
   private static int y = Integer.reverse(-536870912);
   private static int ev = 16384 >>> 46 | 16384 << -46;
   private static int co = Integer.reverse(0);
   private static long bt = Long.reverse(-8774232790952717243L);
   private static int ec = Integer.reverse(67108864);
   private static long af = Long.reverse(6341068275337658368L);
   private static int fi = Integer.reverse(-1610612736);
   private static long ee = Long.reverse(6341068275337658368L);
   private static int cs = Integer.reverse(0);
   private static long hu = Long.reverse(-2433164515615058875L);
   private static long ga = Long.reverse(-2433164515615058875L);
   private static int ew = Integer.reverse(-1543503872);
   private static long fe = Long.reverse(-2433164515615058875L);
   private static long v = Long.reverse(-2433164515615058875L);
   private static long gr = Long.reverse(-8774232790952717243L);
   private static long gp = Long.reverse(-2433164515615058875L);
   private static int ja = Integer.reverse(Integer.MIN_VALUE);
   private static int et = Integer.reverse(-1);
   private static int ez = Integer.reverse(1677721600);
   private static int br = (8388608 >>> 151 | 8388608 << -151) & -1;
   private static int hv = (16384 >>> 204 | 16384 << ~204 + 1) & -1;
   private static long jl = Long.reverse(6341068275337658368L);
   private static int av = (-1 >>> 58 | -1 << ~58 + 1) & -1;
   private static int bl = Integer.reverse(-939524096);
   private static int ff = Integer.reverse(536870912);
   private static int cu = (33554432 >>> 121 | 33554432 << -121) & -1;
   private static String[] b = new String[jn];
   private static int cy = 0 >>> 205 | 0 << -205;
   private static int is = Integer.reverse(0);
   private static long it = Long.reverse(1934296039955628032L);
   private static long hj = Long.reverse(6341068275337658368L);
   private static int cx = (0 >>> 83 | 0 << ~83 + 1) & -1;
   private static int eb = (1536 >>> 9 | 1536 << -9) & -1;
   private static int gq = Integer.reverse(1275068416);
   private static int cz = 52428800 >>> 245 | 52428800 << ~245 + 1;
   private static long dh = Long.reverse(-2433164515615058875L);
   private static int cm = 4096 >>> 76 | 4096 << -76;
   private static int fz = Integer.reverse(872415232);
   private static int en = Integer.reverse(1610612736);
   private static long s = Long.reverse(6341068275337658368L);
   private static int bz = (-1 >>> 89 | -1 << ~89 + 1) & -1;
   private static int aj = Integer.reverse(0);
   private static long hi = Long.reverse(-8774232790952717243L);
   private static int k = Integer.reverse(-1073741824);
   private static long ea = Long.reverse(6341068275337658368L);
   private static int gh = Integer.reverse(-1);
   private static int fv = Integer.reverse(0);
   private static int id = 0 >>> 126 | 0 << -126;
   private static int bb = (8192 >>> 9 | 8192 << -9) & -1;
   private static int dl = 48 >>> 131 | 48 << ~131 + 1;
   private static long el = Long.reverse(-8774232790952717243L);
   private static int ax = (0 >>> 20 | 0 << -20) & -1;
   private static int gg = (1543503872 >>> 153 | 1543503872 << -153) & -1;
   private static long er = Long.reverse(-2433164515615058875L);
   private static int n = Integer.reverse(536870912);
   private static int ha = (54525952 >>> 20 | 54525952 << ~20 + 1) & -1;
   private static long do = Long.reverse(-8774232790952717243L);
   private static int cq = (262144 >>> 210 | 262144 << -210) & -1;
   private static int ho = Integer.reverse(469762048);
   private static int eg = Integer.reverse(-2080374784);
   private static long d = Long.reverse(-8774232790952717243L);
   private static int ie = Integer.reverse(Integer.MIN_VALUE);
   private static long cd = Long.reverse(6341068275337658368L);
   private static int au = 1792 >>> 135 | 1792 << ~135 + 1;
   private static int du = Integer.reverse(2013265920);
   private static int ci = 0 >>> 21 | 0 << ~21 + 1;
   private final nLoginBungee f;
   private static int da = (-1 >>> 150 | -1 << ~150 + 1) & -1;
   private static long jk = Long.reverse(-8774232790952717243L);
   private static long ei = Long.reverse(6341068275337658368L);
   private static long at = Long.reverse(6341068275337658368L);

   private void b(LoginEvent var1) {
      PendingConnection var2 = var1.getConnection();
      String var3 = var2.getName();
      UUID var4 = var2.isOnlineMode() ? var2.getUniqueId() : null;
      Consumer var5 = var1x -> {
         var1.setCancelled((boolean)ja);
         var1.setCancelReason(TextComponent.fromLegacyText(var1x));
      };
      Channel var6 = οεπΛΩωξταψψωβς.a(var1, var2);
      if (var6 == null) {
         var5.accept(c<"㺀">(gg & gh, gi) + var1.getClass().getSimpleName() + c<"㺃">(gj & gk, gl));
      } else if (!this.D.b().e(var6)) {
         ωΦΛΩμυνθφςςκαα var7 = (ωΦΛΩμυνθφςςκαα)var6.attr(ωΦΛΩμυνθφςςκαα.f).get();
         if (var7 == null) {
            String var17 = c<"㺆">(gm, gn) + var3 + c<"㺉">(go, gp) + var1.getClass().getSimpleName() + c<"㺌">(gq, gr ^ gs);
            ψΓωτιμωκχψΛΨ.c(var17);
            String[] var20 = new String[gu];
            var20[gv] = c<"㺏">(gw & gx, gy);
            var20[gz] = c<"㺒">(ha, hb);
            var20[hc] = c<"㺕">(hd, he ^ hf) + var17;
            var20[hg] = c<"㺘">(hh, hi ^ hj);
            var20[hk] = c<"㺛">(hl, hm ^ hn);
            var5.accept(βιχγΓλχΠσπ.a(var20));
         } else if (var4 != null && var7.a != null) {
            throw new IllegalStateException(c<"㺞">(ho, hp ^ hq));
         } else {
            στΩξξχκι var8 = var7.f;
            int var9 = hr;
            ςθΓωΩπγΩΩΔβΨω var10 = this.D.a();
            if (var4 != null) {
               if (var8 != null && var8.getMojangId() != null && !var4.equals(var8.getMojangId())) {
                  String var10000 = c<"㺡">(hs & ht, hu);
                  Object[] var10001 = new Object[hv];
                  var10001[hw] = var8.getMojangId();
                  var10001[hx] = var4;
                  var10001[hy] = var8.i();
                  var10001[hz] = var3;
                  ψΓωτιμωκχψΛΨ.b(var10000, var10001);
                  var8 = null;
                  var9 = ia;
               }

               στΩξξχκι var11 = var10.a(var7.ci, var4, null, (boolean)ib);
               if (var11 == null) {
                  var5.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                  return;
               }

               if (var8 == null || var11.r()) {
                  var8 = var11;
               }
            }

            ωΦΛΩμυνθφςςκαα var16;
            var6.attr(ωΦΛΩμυνθφςςκαα.f).set(var16 = var7.a(var8, var4 == null && var7.ci != null ? var7.ci : var3));
            UUID var18 = var2.getUniqueId();
            String var12 = ((InetSocketAddress)var2.getSocketAddress()).getAddress().getHostAddress();
            if (var16.a != null) {
               if (this.D.a().b(var5, var8, var12, ΣλνΨουΩΔοθεβ.J)) {
                  return;
               }

               if (this.D.a().a(var5, var8, var12, ΣλνΨουΩΔοθεβ.R)) {
                  return;
               }

               if (!var10.a(var8, var16.a.a.getJavaUniqueId(), var3, var12)) {
                  var5.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                  return;
               }

               UUID var14 = var8.a();
               if (var14 != null && !var14.equals(var18) && κδΔΦφγμδξΨωψο.m.ar()) {
                  Σααεξξγς.a(var1, var14);
               }
            } else if (var4 != null) {
               if (this.D.a().b(var5, var8, var12, ΣλνΨουΩΔοθεβ.I)) {
                  return;
               }

               if (this.D.a().a(var5, var8, var12, ΣλνΨουΩΔοθεβ.Q)) {
                  return;
               }

               if (κδΔΦφγμδξΨωψο.d.ar()) {
                  String var13 = βδΔφμπθθγ.g(var3, (boolean)ie);

                  try {
                     Σααεξξγς.a(var2, var13);
                  } catch (IllegalAccessException var15) {
                     ψΓωτιμωκχψΛΨ.c(c<"㺤">(if, ig ^ ih) + var3 + c<"㺧">(ii, ij ^ ik), var15);
                     var5.accept(c<"㺪">(im, in ^ io));
                     return;
                  }
               }

               if (!var10.a(var8, var4, var3, var12, (boolean)var9)) {
                  var5.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                  return;
               }

               Σααεξξγς.a(var1, var8.a());
            } else {
               if (this.D.a().b(var5, var8, var12, null)) {
                  return;
               }

               if (this.D.a().a(var5, var8, var12, null)) {
                  return;
               }

               UUID var19 = var8.a();
               if (var19 == null && (var8.h() || βδΔφμπθθγ.a() == νκθνεεηδδ.b)) {
                  var8.a(var19 = λΣσΣκΓβΠΨ.a(var3, var18));
                  if (!var10.a(var8)) {
                     var5.accept(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                     return;
                  }
               }

               if (var19 != null && !var19.equals(var18)) {
                  Σααεξξγς.a(var1, var8.a());
               }
            }
         }
      }
   }

   @EventHandler(
      priority = 127
   )
   public void b(PreLoginEvent var1) {
      if (!var1.isCancelled()) {
         try {
            this.d(var1);
         } catch (Throwable var3) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(n, o ^ p) + var1.getClass().getSimpleName() + c<"㺃">(q, r ^ s) + var1.getConnection().getName() + c<"㺆">(t & u, v), var3);
            var1.setCancelled((boolean)x);
            var1.setCancelReason(TextComponent.fromLegacyText(c<"㺉">(y & z, aa)));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 26L;
      var1 ^= 5258687403709299204L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(11 + 57),
                     (byte)(7 + 62),
                     (byte)(46 + 37),
                     (byte)(5 + 42),
                     (byte)(58 + 9),
                     (byte)(7 + 59),
                     (byte)(6 + 61),
                     47,
                     (byte)(62 + 18),
                     75,
                     (byte)(58 + 9),
                     (byte)(5 + 78),
                     (byte)(50 + 3),
                     (byte)(73 + 7),
                     (byte)(73 + 24),
                     (byte)(56 + 44),
                     (byte)(52 + 48),
                     (byte)(17 + 88),
                     (byte)(94 + 16),
                     (byte)(57 + 46)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(24 + 45), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(φΨαξωυθανΣφυκη.C("ҴӁӀ҃ӃҿҺӃӎҽҊӈӌӅӈӎҐࠩࠜࠇ\u082e࠘ࠪࠥࠤࠞࠔࠞࠫࠁࠣ", (byte)52, 67));
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

   private void c(PreLoginEvent var1) {
      PendingConnection var2 = var1.getConnection();
      String var3 = var2.getName();
      InetAddress var4 = ((InetSocketAddress)var2.getSocketAddress()).getAddress();
      αεθζδβΨξςρπΩζθδ var5 = this.D.b().a();
      int var6 = var5 != null && var5.a(var2.getUniqueId()) ? bo : bp;
      String var7 = this.D.b().a(var3, var4, Boolean.valueOf((boolean)var6));
      if (var7 != null) {
         var1.setCancelled((boolean)bq);
         var1.setCancelReason(TextComponent.fromLegacyText(var7));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  χιΣωβσνλδΩβξΓδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςπυηννναΣ.E("ԠՂՄԤՈէ՟յա\u0530ծդղլԵ՚ռջճչճՈ", (byte)60, 69), χιΣωβσνλδΩβξΓδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βθκςνθΩθυμςτκχ.C("ӌәӘқӛӗӒӛӦӕҢӠӤӝӠӦҨࡁ࠴ࠟࡆ࠰ࡂ࠽࠼࠶ࠬ࠶ࡃ࠙࠻ӂ", (byte)60, 67) + var1 + οοθδΨιοΦΠβδζ.A("ı", (byte)60, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -6761110932529226655L;
      long var0 = c ^ 5258687403709299204L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(5 + 64),
               (byte)(48 + 35),
               (byte)(24 + 23),
               (byte)(39 + 28),
               (byte)(46 + 20),
               (byte)(42 + 25),
               47,
               (byte)(29 + 51),
               (byte)(69 + 6),
               (byte)(34 + 33),
               (byte)(40 + 43),
               (byte)(33 + 20),
               (byte)(62 + 18),
               (byte)(73 + 24),
               (byte)(60 + 40),
               (byte)(50 + 50),
               (byte)(77 + 28),
               (byte)(5 + 105),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
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
               b[0] = λΣΩσμφγχ.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 66);
               b[1] = ντθΔζβΔζ.D("ԈԘԚԏԼԖԜԕԓӺՂԤԐՀԂԢԔԾԷԖԟԦԓԔ", (byte)89, 68);
               b[2] = ζοηκορΦνΣθγΩ.C("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 67);
               b[3] = ΨφιωσρΓδΔθ.F(
                  "֎\u0590իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ\u0590֠ց\u0590ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג\u05ceֻ֧׆ֳֵֽ֪֙לד\u05ceֶֺֿ֛֞֞ף", (byte)89, 70
               );
               b[4] = βθκςνθΩθυμςτκχ.A("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 65);
               b[5] = βθκςνθΩθυμςτκχ.F("՝խկդ֑իձժըՏ֗չե֕\u0557շթ֓\u058cիմջըթ", (byte)89, 70);
               b[6] = ΣφδσΔζιΠρα.D("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 68);
               b[7] = ΨΦνΨΦωυΩνβςμ.A("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 65);
               b[8] = χφπρψπφΦθμπ.D("ԮԧԃӻԏԉԈӷԖԹӾԭԜԞӾԝԛԹӽԗԬԷԿԾԯԤՄՂԌԠՂԤ", (byte)89, 68);
               b[9] = ΠΛΨοδΩσμνΛγΦφβς.A("ŹƉƋƀƭƇƍƆƄūƳƕƁƱųƓƅƯƨƇƐƗƄƅ", (byte)89, 65);
               b[10] = βθκςνθΩθυμςτκχ.A("ƝżƕƝƞƗƟŨƊƨƢŹ", (byte)89, 65);
               b[11] = ξψθρΣΠΣς.A("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 65);
               b[12] = χΠξΦιζΨΣωΦσΨζ.E("փռ\u0558Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց\u058c֔֓քչ֙֗այ֗չ", (byte)89, 69);
               b[13] = λΣΩσμφγχ.E("՝խկդ֑իձժըՏ֗չե֕\u0557շթ֓\u058cիմջըթ", (byte)89, 69);
               b[14] = ΣερμΔσατσκ.D("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 68);
               b[15] = φΨαξωυθανΣφυκη.D("ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠըևվչՉեՆժաՉ֎", (byte)89, 68);
               b[16] = πχσδΦΦνθΔπ.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 66);
               b[17] = ΠΛΨοδΩσμνΛγΦφβς.D("ԈԘԚԏԼԖԜԕԓӺՂԤԐՀԂԢԔԾԷԖԟԦԓԔ", (byte)89, 68);
               b[18] = ξψθρΣΠΣς.A("ƝżƕƝƞƗƟŨƊƨƢŹ", (byte)89, 65);
               b[19] = χφπρψπφΦθμπ.B("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 66);
               b[20] = βθκςνθΩθυμςτκχ.E("զվ\u0590ՠՎ֏\u058bխծժ֙բ֗Ւ֏ջմՑ֕լր՚ռ֘\u0590֥բ֠֝֜ֆ֟դ֜ց֪֞֟֏ֱָ֧֪ս", (byte)89, 69);
               b[21] = ςπυηννναΣ.F("՚ժսիՋՑվ՟մնո՝", (byte)89, 70);
               b[22] = πηγμΣΔκκ.C("ԐԯԺԥԸԸԴԋԒӴӵԘԱՂԞՀՀԕԩՇԢԗ\u0530ՁԽՌԉԴՑԧԒԶԓԑԶԒԸԮԗՉԡգՀ՟՚ՆաԳՆԻՁԞԩՎՊբ՞աճդԱլՇԱ", (byte)89, 67);
               b[23] = ζοηκορΦνΣθγΩ.B("ťƆƣŬƂơƝƞŻƁƄŹ", (byte)89, 66);
               b[24] = μεςΩΔΣγν.C("ԤԘԳԫӻԙԶԡԒԀԁԼՂՂԜԓՇԪԖՀՆՉԻՉԦԐՁԧԿՇՖԩՂԱԼՎ\u0530ԭԙԸԓՙաԨ", (byte)89, 67);
               b[25] = μεςΩΔΣγν.F("զվ\u0590ՠՎ֏\u058bխծժ֖մթո\u058b՚ոկՖՙշ֕յմՠչշփըը֝խլ֫տփ\u0590տ֎վւձ\u058bճնո֥֝հֱָֹ֛֦֜֙քֵ֛֚֒֠֨֟", (byte)89, 70);
               b[26] = θεωψξβΛσσ.D("ԘӱԙԭԴӺӵԏԪՃԓԈ", (byte)89, 68);
               b[27] = ΣφδσΔζιΠρα.B("ŻƙƠƋŽůũźūƭƯƎŰƖƌŸƪƱźƾŰƯƵƗǀƌƌǀƾƠƴƤǆƂƕƅƜǈƘƫƚǒƟƫƠƕƠƵǓƱƤǕǜǇǞƷƜƟǃǢƳǇǛƷǒƻƣƦǪƬǥǀǎǱǳǈǱǨǆǴǛƵǽǯƷǗǄǅ", (byte)89, 66);
               b[28] = λΣΩσμφγχ.E("֎\u0590իւբ՞֏֒ֆՐֈը\u058cխ\u0557ֈևի\u0557ՠ՛֣՛՟֢֛֖մ֖֖֡ն֘\u0590֬֏֮վսվ֕֔֊մօּ֥֑֪֔֍֛֭֮ֈ։", (byte)89, 69);
               b[29] = ξψθρΣΠΣς.B("źƟŹŷƪƊŽƣƆƢŮūƆƌƕƉƨƯƚƹƊŽźơſƣƷǆƻƏƅƺżƩƇǈƧƺƸǂƒǐǂƱǊƍǂƲǚƣǆǌǊǀƒƸƫǟưƴƜǨƿƽǧƴǗǆƬǧǃƯƮǪǫưǕǭǌǧǔǨǙǺǹǖǮǉǳǚƽǦǞǓƾǞ", (byte)89, 66);
               b[30] = ζοηκορΦνΣθγΩ.A("ƆūťſżźƪźƥűůŹ", (byte)89, 65);
               b[31] = δΛψπξκσβγςα.A(
                  "ƠƠƥƉƨƐŢũŭƯƏƫƒƌƯƪƻƕưƩƐƍƾƺŴƂƷưǅǅƚǊǀƝƖƉƥƞǋǊǄǏƟƲƪƦǒƔƒǋǘƥƬƨǙǓƵǚƜǑƸƙƧƾƥǉǂƿƪǗƬƪǓǂǒƲǪǗƵǯǭƵǝǽǆǞǌǲǭǑǗȁǮǇȈǄǡǠȌǄǘǉȅǱǪǎȆǙ", (byte)89, 65
               );
               b[32] = πχσδΦΦνθΔπ.B("ƆūťſżźƪźƥűůŹ", (byte)89, 66);
               b[33] = οΩνΩρωλΨηΛδωδ.D(
                  "ӳԙԴԵԩԎԷԼӽԣԤԓԘԲԶԁԡԼԶԧԦԚՐՃԫՋԳԴՆԷ\u0557ՌԴՕԵ\u0558Է\u0530ԙԽԭ՞բԖԢԦԧՅԳՕԧխԦբԪՠՆզԲՅնըՒՊ\u0557ՓճՓՍՏՒԷկսծՒՁէդՀէբժՂքՇէսՏ֍օՓՇՏ֊֗", (byte)89, 68
               );
               b[34] = φδχεθοκψαλΛογλ.A("ƠƖƗƝƋƮŰƊƆżƴƟƇƖƸƋƅƲƹƧŵƮƼƽƙƷƃƐƲơƽƈƦƂƬƞƦƈƏǉƾơƱƝƳƦƠǒǛƣƥƦƼƹƟƬǗƯƚƗǢǃǀƲǛƦǆǖǦǧǈǁƮǓǄƹ", (byte)89, 65);
               b[35] = πψυκΠΨμΛΩβΣφμφσ.D("ԹԻԖԭԍԉԺԽԱӻԱԼԯԮԨԡԹԾԙԴԞԫԤՍԨՊԯԿՋՊՃԨԷԩԹԵՆԫՔՏԡԸՌԻԯՔ՜զԸԡՉդդԹդգԺեՊյիՉյԲ", (byte)89, 68);
               b[36] = ΠΛΨοδΩσμνΛγΦφβς.E(
                  "՛ոատՏդծխՔՕոնև֖֜ը֜ղռ֑լ\u0590֣֧֚֔զ֙֡՝տռ֦ըֱպ\u058c֔րհַցֵָֹ֨֡պ֛յվցֻֿռְֶսִָָֹ֛ֈֽ\u05cd\u058b\u05cbֶ֪֑֭֒։֏ֳ֚֯ו֭֨׀ג֯םס֨֩", (byte)89, 69
               );
               b[37] = ντθΔζβΔζ.E("ժՏՉգՠ՞֎՞։ՕՓ՝", (byte)89, 69);
               b[38] = ΠΛΨοδΩσμνΛγΦφβς.A("ƣƀƭƂƢũžƟƣťŬƞưƮƱŵƇƧŵƊźƳƍƁƐǂƣǅƱŹǇƖƔƕǈǊƍƎƪǌƮǇƣƔƶƑǌǌƚǋƬǋƵǑǞơƬƟǒǡƲǧƨǓƽǥǬǥǫǊǁǀǜƪƿǰǇǴǋǎǕǶǺǹǝǷǟǓǫǠǁǤǺǔȁȀ", (byte)89, 65);
               b[39] = πψυκΠΨμΛΩβΣφμφσ.E("ժՏՉգՠ՞֎՞։ՕՓ՝", (byte)89, 69);
               b[40] = ΦδφπθΩΩλζξ.E(
                  "գ֊սթ\u0590ք\u0590՝\u058cՔՖՏկո։ծ֚՚֟տ֎ւ֛աճ֨զ֚֨բ֢֖֖տ֎\u058b֝֟վ֮\u0590֥։ִչ֣֮ռ֊֑֘֓մֲֵ֗ւ֤֨րֺւָׂ֚\u05cfֺ\u05ce\u05cd֧֭ג׆ֵג\u05ceֲֿ֑֖֔וחך֢\u05ceךְֵ׃יַמ\u05c8\u05ebּ",
                  (byte)89,
                  69
               );
               b[41] = πχσδΦΦνθΔπ.D("ԯԥԦԬԚԽӿԙԕԋՃԮԖԥՇԚԔՁՈԶԄԽՋՌԨՆԒԟՁ\u0530ՌԗԵԑԻԭԵԗԞ\u0558Ս\u0530ՀԬՂԵԯաժԲԴԵՋՈԮԻզԾԩԦձՒՏՁժԵՕեյն\u0557ՐԽբՓՈ", (byte)89, 68);
               b[42] = λΣΩσμφγχ.B("ƤŴŦƉƜƙƀſƳŪƴƵƩƥŷƆƮƌƮƅƞƽƄƅ", (byte)89, 66);
               b[43] = ζοηκορΦνΣθγΩ.E("զվ\u0590ՠՎ֏\u058bխծժ֖մթո\u058b՚ոկՖՙշ֕յմՠչշփըը֝խ֢֨֨֏֣վֈ֎֭֭ղւ֑չ֏ֶ։ֳ֨֞չׁֈ։", (byte)89, 69);
               b[44] = ξψθρΣΠΣς.F("խՆծւ։ՏՊդտ֘ը՝", (byte)89, 70);
               b[45] = φδχεθοκψαλΛογλ.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫׃֝։֣֠׀א֯֕ה֏֝", (byte)89, 69);
               b[46] = πηγμΣΔκκ.C("ԑԩԻԋӹԺԶԘԙԕՄԍՂӽԺԦԟӼՀԗԫԅԧՃԻՐԍՋՈՇԱՊԏՇԬՕՉՊԺՒ՜գՕԨ", (byte)89, 67);
               b[47] = ςπυηννναΣ.E("՚ժսիՋՑվ՟մնո՝", (byte)89, 69);
               b[48] = μεςΩΔΣγν.E("զվ\u0590ՠՎ֏\u058bխծժ֙խՌ֕\u058c֏Ֆոֈւծմքռ֧֣յպ։տր՟վփ֤\u058cհ֧֡ծֱտ։֍ָ֕֝պֱռֱ֖׃պִստֵֶֻ։ׂքֿ", (byte)89, 69);
               b[49] = ντθΔζβΔζ.B("ŪƣƘŹƛưƚƢƯƭƮŹ", (byte)89, 66);
               b[50] = φδχεθοκψαλΛογλ.D("ԈԘԚԏԼԖԜԕԓӺՁԙԥՇՃԨԨԒԜԿՆԈԯԛԞԫԓԝԿԈԱԧԤՑ\u0558ՅԜԜԱԲԸՂ՝դԵ\u0557ԤԺՄդՈԩ՟ՆԳԴ", (byte)89, 68);
               b[51] = βεξΠθρρςΔΦμ.B("ƪƬƇƞžźƫƮƢŬƢƴƕƗƴƓƻƊƪƔƿƗƄƅ", (byte)89, 66);
               b[52] = ΦδφπθΩΩλζξ.C("ԕӺӴԎԋԉԹԉԴԀӾԈ", (byte)89, 67);
               b[53] = θεωψξβΛσσ.E("֏րֈ\u058cՏառփ\u058cփւ՝", (byte)89, 69);
               b[54] = ντθΔζβΔζ.D("ԕӺӴԎԋԉԹԉԴԀӾԈ", (byte)89, 68);
               b[55] = ντθΔζβΔζ.C("ԦԶԛԙԏԘԉՁՁԛԔԗԯӼԁԂԤԼԺԝԼՁԘՄՃԦՇՐ\u0530ԥ\u0557ՐՊԖՉԬՎ՝ԙ՛ԜԵՒՅԯԺԲՖԡիԤԸԥՆԳԴ", (byte)89, 67);
               b[56] = ΨφιωσρΓδΔθ.C("ԐԂԳԑӵԦՀӽԚԟԞԁԿՁԅԩԡԘԳԹՊԿԛԝԠԟԭԮԱԕՍԕՃԘԸՉՖՕԳՕՓԾՙԭՆԲՁ\u0558բԼՖՄծՎ՛ՐԽՀԱ՜ՇՇկԸշԴՇՇվՑյԲԹղԻՄծֆտհՈՖջէՕզՓՔ", (byte)89, 67);
               b[57] = ντθΔζβΔζ.D(
                  "ԹԆԃԵԇԬԺԏԘԠӵԳӷԚԡԁԚԥՊԘՈԊԣԠԧԚԓՒԧՏԖԐՋԻԪՉԺԹՠԖԙՊԭ՝ԥ՝ԙ\u0558՟ԪԾԧգԦ՝ՅՍԭ\u0530ԪՈՃՂԱՖՃ՛ԹԺԻՔչծաճՐդցֈշեմ\u0558ոի՝ւոց՚ծվ֏է֖Փե֍խխ՚\u058bՑց՜ծաօս֘վոպ֖ևգո\u058cա֪գִ֤֨֔ց֬\u058b֪ն֤ճֈַ֪֞֘վֳ֟֒־րֻջփׇׇֿ׆֯ׄ֯։֮֓֕\u058c\u05cd׃֥֛֮֯֯֔֬֜֡ב֛\u05cdא\u05ceופש\u05c9־\u05c9מ\u05cf\u05edצ\u05ce\u05ccֿ֬\u05ecעספַדַׇ\u05ecד׳\u05ca\u05f7\u05ec\u05cb\u05c8",
                  (byte)89,
                  68
               );
               b[58] = πχσδΦΦνθΔπ.D("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘՍՓՓԺՎԩԳԹ\u0558\u0558ԝԭԼԤԺաԴ՞ՓՉԤլԳԴ", (byte)89, 68);
               b[59] = βεξΠθρρςΔΦμ.B("ƉŢƊƞƥūŦƀƛƴƄŹ", (byte)89, 66);
               b[60] = ΨΦνΨΦωυΩνβςμ.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫׃֝։֣֠׀א֯֕ה֏֝", (byte)89, 69);
               b[61] = βθκςνθΩθυμςτκχ.F("օ՟\u058b֎֎փ՞՝թՖ֒Ք\u0590։զջև֟\u0590՚տս՝ղև֖\u0590֢֡ջ֪։֝֟թէ\u0590֢֩֡ձծ֘ս", (byte)89, 70);
               break;
            case 1:
               b[0] = ΨφιωσρΓδΔθ.A("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƝƶżƠƚƕſƵƑƷƆ", (byte)89, 65);
               b[1] = φδχεθοκψαλΛογλ.C("ԈԘԚԏԼԖԜԕԓӺՂԿ\u0530ԖԨՇՆԜՌՃԍԼԓԔ", (byte)89, 67);
               b[2] = ςΦζσμτΓσ.A("ŴƅƨƞƝƐƤůƞƅƪŹ", (byte)89, 65);
               b[3] = δΛψπξκσβγςα.F(
                  "֎\u0590իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ\u0590֠ց\u0590ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג\u05ceֻ֧׆ֳֵ֪֙׃ׅ\u05ce֣֦םׁת֢֬שֶֺֺׁׄ֬\u05ceץׂׅײֽ",
                  (byte)89,
                  70
               );
               b[4] = ντθΔζβΔζ.E("փռ\u0558Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց\u058bհծ֚՝֙֝֟ֆ֣֩", (byte)89, 69);
               b[5] = οοθδΨιοΦΠβδζ.A("ŹƉƋƀƭƇƍƆƄūƳƓƳƩƶƚƘƲƝƶƐƗƄƅ", (byte)89, 65);
               b[6] = ζβησεθωυγτ.F("կՏւՍբծ֔Ս֎֔ը՝", (byte)89, 70);
               b[7] = φΨαξωυθανΣφυκη.C(
                  "ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠչ\u0590\u0590ժ՞փՏՎի\u0590զՐկղջոսըճ\u058bձ՚ը",
                  (byte)89,
                  67
               );
               b[8] = βθκςνθΩθυμςτκχ.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƛƉƹƾƫƑǅƗƯǃŻ", (byte)89, 66);
               b[9] = φΨαξωυθανΣφυκη.D("ԈԘԚԏԼԖԜԕԓӺՃԞԁԔԾԿՀԫՅՊԺՌԓԔ", (byte)89, 68);
               b[10] = βθκςνθΩθυμςτκχ.A("ƀƫƧƉŸƊƫƪƫžƪŹ", (byte)89, 65);
               b[11] = θεωψξβΛσσ.D(
                  "ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠզՉ\u058bձ\u0590իա\u0590տֈթւ\u0557թշչ֝վ\u0590յչ՞ը",
                  (byte)89,
                  68
               );
               b[12] = βθκςνθΩθυμςτκχ.F("փռ\u0558Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց\u0590֣դ֦֛֦֡֓\u058cփչ", (byte)89, 70);
               b[13] = ζοηκορΦνΣθγΩ.C("ԈԘԚԏԼԖԜԕԓӺՁԬԓԤՀԽԠԥԓԸՃՌԓԔ", (byte)89, 67);
               b[14] = μεςΩΔΣγν.A("ƉƗťŭƩơŧƥſƓƲŹ", (byte)89, 65);
               b[15] = πχσδΦΦνθΔπ.F(
                  "֎\u0590իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ\u0590֠ց\u0590ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג\u05ceֻ֧׆ֳֵ֪֙׀ךֲסֿׁׂ֦וֶׅ֪֡ףתקױׂ\u05c9ד׳טֽ",
                  (byte)89,
                  70
               );
               b[16] = φδχεθοκψαλΛογλ.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƩƫƶźǄƙƮƯơƙƔƻǋǉƧƿƮƧƊƮƼǊƙ", (byte)89, 66);
               b[17] = ΣερμΔσατσκ.A("ŹƉƋƀƭƇƍƆƄūƴƍƋƬƶŴŷƜƼůƟƗƄƅ", (byte)89, 65);
               b[18] = λΣΩσμφγχ.D("ԏԅԻԦԱԘӿӷԕԸӾԈ", (byte)89, 68);
               b[19] = πηγμΣΔκκ.B("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǚƽǠǔȂƽȀǰǡȀǳȉȁǼǠȁǋǍǰȎǡǰǙ", (byte)89, 66);
               b[20] = φΨαξωυθανΣφυκη.A("ƂƚƬżŪƫƧƉƊƆƵžƳŮƫƗƐŭƱƈƜŶƘƴƬǁžƼƹƸƢƻǆƣƌƵƸƷƚǋƦƍǈƓǒƪǍƵǓƧǒƚǆǝƤƥ", (byte)89, 65);
               b[21] = ζοηκορΦνΣθγΩ.E("ՖտֆՙգթՔ\u058bֆ֎ւ֖֕օսչծ֟Ւց֞իըթ", (byte)89, 69);
               b[22] = ιΠοθΩΦξκ.F("եք֏պ֍֍։ՠէՉՊխֆ֗ճ֕֕ժվ֜շլօ֖֒֡՞։֦ռէ\u058bըզ\u058bէ֍փլ֞նִֶָ֛֕֯ֈ֛\u0590֖ճվ֫׃ցׇ֤֧֖֚֩։\u058c", (byte)89, 70);
               b[23] = φδχεθοκψαλΛογλ.F("թծՠ֎ևց֊րժ֑ը՝", (byte)89, 70);
               b[24] = δΛψπξκσβγςα.C("ԤԘԳԫӻԙԶԡԒԀԁԼՂՂԜԓՇԪԖՀՆՉԻՉԦԐՁԧԿՇՖԩՂԢՐՖՑԬՐՐԿ՟ԠՙՑՠԠԷԷՆ\u0557ՍՃ՜ԳԴ", (byte)89, 67);
               b[25] = βθκςνθΩθυμςτκχ.C("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘԗՖԪԮԻԪԹԩԭԜԶԞԡԣՈՐԛգ՜ՇՄՠդթԪՐՂՐխզՂՄ", (byte)89, 67);
               b[26] = ντθΔζβΔζ.B("ƒƃƉƣƌŸſƋƮƦƮŹ", (byte)89, 66);
               b[27] = φδχεθοκψαλΛογλ.F(
                  "՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֶֿ֛֗֫֟և֊\u05ce\u0590\u05c9ֲ֤וי׃\u05caֲט֏֧\u05cdדעְב֨֩", (byte)89, 70
               );
               b[28] = ΨφιωσρΓδΔθ.C("ԹԻԖԭԍԉԺԽԱӻԳԓԷԘԂԳԲԖԂԋԆՎԆԊՍՆՁԟՌՁՁԡՃԻ\u0557ԺՙԩԨԩՀԿԴԛ՞ԺՂՠՔՆ՝\u0558դՊիբՙԻգՑաՋՒն", (byte)89, 67);
               b[29] = οοθδΨιοΦΠβδζ.F(
                  "՞փ՝՛֎ծաևժֆՒՏժհչխ\u058c֓վ֝ծա՞օգև֛֪֟ճթ֞ՠ֍ի֬\u058b֦֞֜նִ֦֮֕ձ֦֖־ևְ֪֤֮ն֜֏׃֔֘ր\u05cc֣֡\u05cbֻ֪֘\u0590\u05cb֧֓֒\u05ce\u05cfֹ֔בְ\u05cbָ\u05ccֽמםֶ֯ז֞ןֿ֧ימ\u05c9ס",
                  (byte)89,
                  70
               );
               b[30] = βθκςνθΩθυμςτκχ.D("ԡԌԒӶԸԆԍԩԗ\u0530ԭԈ", (byte)89, 68);
               b[31] = ΨΦνΨΦωυΩνβςμ.B(
                  "ƠƠƥƉƨƐŢũŭƯƏƫƒƌƯƪƻƕưƩƐƍƾƺŴƂƷưǅǅƚǊǀƝƖƉƥƞǋǊǄǏƟƲƪƦǒƔƒǋǘƥƬƨǙǓƵǚƜǑƸƙƧƾƥǉǂƿƪǗƬƪǓǂǒƲǪǗƵǯǭƵǝǽǆǞǌǲǭǑǗȁǮǇȈǄǠǾǹǽǀǬǐǨȋȀǨǢǨǑȕǶǣȕȌǯǰǷǤǥ", (byte)89, 66
               );
               b[32] = χΠξΦιζΨΣωΦσΨζ.E("Ջիռծ֓ՠՆգՔձը՝", (byte)89, 69);
               b[33] = ΦδφπθΩΩλζξ.A("ŤƊƥƦƚſƨƭŮƔƕƄƉƣƧŲƒƭƧƘƗƋǁƴƜƼƤƥƷƨǈƽƥǆƦǉƨơƊƮƞǏǓƇƓƗƘƶƤǆƘǞƗǓƛǑƷǗƣƶǧǙǃƻǈǄǤǄƾǀǃƨǠǮǟǃƲǘǕƱǘǓǛƳǵƻǱǞǱǘǜǅǺǤǰǦ", (byte)89, 65);
               b[34] = ςπυηννναΣ.A("ƠƖƗƝƋƮŰƊƆżƴƟƇƖƸƋƅƲƹƧŵƮƼƽƙƷƃƐƲơƽƈƦƂƬƞƦƈƏǉƾơƱƝƳƦƠǒǛƣƥƦƼƹƟƬǗƯƚƗǢǃǀƲǡǜǌǫǡƸǎǟǱǒǈƹ", (byte)89, 65);
               b[35] = μζξτΩσσφυδεπλΨ.E("֎\u0590իւբ՞֏֒ֆՐֆ֑քփսն֎֓ծ։ճրչ֢ս֟ք֔֠֟֘ս\u058cվ֎֊֛ր֤֩ն֍֡\u0590քֱֻ֩֍նֹֹ֞֗֯֒ռּ֢֝׀ֿ֬֨", (byte)89, 69);
               b[36] = πηγμΣΔκκ.D("ԆԣԌԪӺԏԙԘӿԀԣԡԲՁՇԓՇԝԧԼԗԻԿՎՅՒԑՄՌԈԪԧՑԓ՜ԥԷԿԫԛբԬՓՌՠգդԥՆԠԩԬզժԧա՛ԨՆգ՟գդԳըոԶնԽ\u0558ՕաԼԴԽբշՓՃղֆթֆէէզՠթօօՏՊ֖վք\u058c", (byte)89, 68);
               b[37] = ςπυηννναΣ.E("ՎՠՆՑ՛Րևմ֔ֆ\u0557՝", (byte)89, 69);
               b[38] = ΣδτΠνεγοΓορητ.B(
                  "ƣƀƭƂƢũžƟƣťŬƞưƮƱŵƇƧŵƊźƳƍƁƐǂƣǅƱŹǇƖƔƕǈǊƍƎƪǌƮǇƣƔƶƑǌǌƚǋƬǋƵǑǞơƬƟǒǡƲǧƨǓƽǥǬǥǫǊǁǀǜƪƿǰǇǴǋǎǕǶǺǹǝǶǶƳǞǫǣǛǁǯǒǈȀǂȍǞǛǼǨǏȈǾǤǙ", (byte)89, 66
               );
               b[39] = ΨφιωσρΓδΔθ.C("ԹԣӸӶԙԒՀӲӺԏԗԈ", (byte)89, 67);
               b[40] = ΦδφπθΩΩλζξ.F(
                  "գ֊սթ\u0590ք\u0590՝\u058cՔՖՏկո։ծ֚՚֟տ֎ւ֛աճ֨զ֚֨բ֢֖֖տ֎\u058b֝֟վ֮\u0590֥։ִչ֣֮ռ֊֑֘֓մֲֵ֗ւ֤֨րֺւָׂ֚\u05cfֺ\u05ce\u05cd֧֭ג׆ֵג\u05ceֲֿ֑֖֔וחךּ֢\u05ccֳק֝ר֛׃֨נט",
                  (byte)89,
                  70
               );
               b[41] = ςΦζσμτΓσ.D("ԯԥԦԬԚԽӿԙԕԋՃԮԖԥՇԚԔՁՈԶԄԽՋՌԨՆԒԟՁ\u0530ՌԗԵԑԻԭԵԗԞ\u0558Ս\u0530ՀԬՂԵԯաժԲԴԵՋՈԮԻզԾԩԦձՒՏՁձմդ՛ջՕ՛Չց\u0557ՂՈ", (byte)89, 68);
               b[42] = βθκςνθΩθυμςτκχ.C("ԳԃӵԘԫԨԏԎՂӹՃԲԛӽՀԻԂՇԧԿԿԢՁԭ\u0530ՉԬԒՎԬՓՀ", (byte)89, 67);
               b[43] = ΣφδσΔζιΠρα.F("զվ\u0590ՠՎ֏\u058bխծժ֖մթո\u058b՚ոկՖՙշ֕յմՠչշփըը֝խ֢֨֨֏֣վֈ֎֭֭ձկ֤֧֒֘֏ֿ֭֞֬\u058bֈ։", (byte)89, 70);
               b[44] = ΣδτΠνεγοΓορητ.D("ԒӶԩԆӯԓՀԡԌԪՁԈ", (byte)89, 68);
               b[45] = βεξΠθρρςΔΦμ.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫\u05c9ׁ֛֧֨\u05cf֦בוִ֢֝", (byte)89, 69);
               b[46] = ΠΛΨοδΩσμνΛγΦφβς.B("ƂƚƬżŪƫƧƉƊƆƵžƳŮƫƗƐŭƱƈƜŶƘƴƬǁžƼƹƸƢƻƙǄƠƹƶƣƏǂƈƓƣƟƮƤƷƳǂƑƦǊƩǍƤƥ", (byte)89, 66);
               b[47] = ςπυηννναΣ.C("ԨԑӹӼԲԭӽԲԓԵԿԯԀԾԥԠԗԷՂՅՄՌԓԔ", (byte)89, 67);
               b[48] = ΠΛΨοδΩσμνΛγΦφβς.D("ԑԩԻԋӹԺԶԘԙԕՄԘӷՀԷԺԁԣԳԭԙԟԯԧՒՎԠԥԴԪԫԊԩԮՏԷԛՒՌԙ՜ԪԴԸգՀՈԥ՜ԧ՜ՁծԥՄեԻղհ\u0530բկԳԮ", (byte)89, 68);
               b[49] = φδχεθοκψαλΛογλ.B("ƃſƜƛŪƞƭƚƂŻƠƀƠƑŶƊƫƧƫƹƦƇƄƅ", (byte)89, 66);
               b[50] = ζβησεθωυγτ.B("ŹƉƋƀƭƇƍƆƄūƲƊƖƸƴƙƙƃƍưƷŹƠƌƏƜƄƎưŹƢƘƕǂǉƶƍƍƢƣƩƳǑƩǃǋǊǉǛƕƔǇǐǊƯǕƲƻƳưǦǙǦƧ", (byte)89, 66);
               b[51] = ζβησεθωυγτ.F("֎\u0590իւբ՞֏֒ֆՐֈի\u058cզ՚յ\u058c՝թ֙՚ջըթ", (byte)89, 70);
               b[52] = φΨαξωυθανΣφυκη.C("ԑԋԑԴԅԯԒԓԮԱԭԈ", (byte)89, 67);
               b[53] = λΣΩσμφγχ.F("\u058c֏խՐճցրՍ֑֑֎՝", (byte)89, 70);
               b[54] = ιΠοθΩΦξκ.C("ӴԘԌԼԇԝԼӼӹӾӺԈ", (byte)89, 67);
               b[55] = ΨφιωσρΓδΔθ.D("ԦԶԛԙԏԘԉՁՁԛԔԗԯӼԁԂԤԼԺԝԼՁԘՄՃԦՇՐ\u0530ԥ\u0557ՐՊԖՉԬՎ՝ԙ՛ԜԵՔ՞\u0558ՄԸ՜ՁԠԪԬԟ՜ԳԴ", (byte)89, 68);
               b[56] = χφπρψπφΦθμπ.B("ƁųƤƂŦƗƱŮƋƐƏŲưƲŶƚƒƉƤƪƻưƌƎƑƐƞƟƢƆƾƆƴƉƩƺǇǆƤǆǄƯǊƞƷƣƲǉǓƭǇƵǟƿǌǁƮƱƢǍƸƸǠƩǨƥƸƸǯǂǦƣƪǣƮǯƮƷǱưǯǕǱǹǔǽǄǅ", (byte)89, 66);
               b[57] = ζοηκορΦνΣθγΩ.E(
                  "֎՛\u0558֊՜ց֏դխյՊֈՌկնՖկպ֟խ֝՟ոյռկը֧ռ֤իե֠\u0590տ֞֏֎ֵիծ֟ւֲպֲծִ֭տ֓ռָջֲ֢֚ւօտ֝֘֗ֆְ֫֘֎֏\u0590֩\u05ce׃ֶ\u05c8ֹ֥זם\u05ccֺ\u05c9֭\u05cd׀ֲח\u05cdז֯׃דפּ\u05ebֺ֨עׂׂ֯נ֦זֱ׃ֶךג\u05edד\u05cd\u05cf\u05ebלָ\u05cdסֶ\u05ffָ\u05f9\u05fd؉שז\u0601נ\u05ff\u05cb\u05f9\u05c8ם\u05ff׳،\u05edד״؈קؓוؐאט\u061cؔ\u061c؛\u0604ؙ\u0604מר\u0603תסآؘ\u05fa\u0603\u0604װ\u0604ש\u0601ױ\u05f6ئװآإأتعؾ؞ؓ؞سؤقػأءؔ\u0601فطضعظؤ؏هَؓقٌٕؕجمضٜؔؾٞزِٖضػبة",
                  (byte)89,
                  69
               );
               b[58] = ςΦζσμτΓσ.C("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘՍՓՓԺՎԩԳԹ\u0558\u0558ԚՑԗԶ՛ԲԶԠՔԿԶԶԳԴ", (byte)89, 67);
               b[59] = ΨφιωσρΓδΔθ.A("ŧƟŨƆťŽƍƛƬƲƞŹ", (byte)89, 65);
               b[60] = λΣΩσμφγχ.D("ԊԨԯԚԌӾӸԉӺԼԾԝӿԥԛԇԹՀԉՍӿԾՄԦՏԛԛՏՍԯՃԳՕԑԤԔԫ\u0557ԧԺԩաԮԺԯԤԯՄբՀԳդիՖխՆԫԮՒձՂՖժՆղՊՑՕծ\u0558ՔսժճյՈ", (byte)89, 68);
               b[61] = ΣδτΠνεγοΓορητ.D("\u0530ԊԶԹԹԮԉԈԔԁԽӿԻԴԑԦԲՊԻԅԪԨԈԝԲՁԻՍՌԦՕԴԯԕԧԤԹԝՍԯԩ\u0530՚ՕԣԽեԠԺգԡԶ՜ԶԳԴ", (byte)89, 68);
               break;
            case 2:
               b[0] = λΣΩσμφγχ.A("žƩƋŹƮƠƃŬƑƲƵƤŮſƇƣŸŲŻƻƉŽƐƍƘƝżƙƘǀǀǄ", (byte)89, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςΦζσμτΓσ.D("ӫԌԺԚԖӷԜԀԼԫԽԈ", (byte)89, 68);
         }
      }
   }

   @EventHandler(
      priority = -63
   )
   public void a(PreLoginEvent var1) {
      if (!var1.isCancelled()) {
         try {
            this.c(var1);
         } catch (Throwable var3) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(a, b) + var1.getClass().getSimpleName() + c<"㺃">(c, d ^ e) + var1.getConnection().getName() + c<"㺆">(f & g, h), var3);
            var1.setCancelled((boolean)j);
            var1.setCancelReason(TextComponent.fromLegacyText(c<"㺉">(k, l ^ m)));
         }
      }
   }

   @EventHandler(
      priority = -128
   )
   public void a(LoginEvent var1) {
      try {
         this.b(var1);
      } catch (Throwable var3) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(ab, ac) + var1.getClass().getSimpleName() + c<"㺃">(ad, ae ^ af) + var1.getConnection().getName() + c<"㺆">(ag, ah ^ ai), var3);
         var1.setCancelled((boolean)ak);
         var1.setCancelReason(TextComponent.fromLegacyText(c<"㺉">(al, am ^ an)));
      }
   }

   private boolean a(PreLoginEvent var1, String var2, boolean var3, στΩξξχκι var4) {
      ΨαχΨχΣλεΠψΦ var5 = this.f.b().a(var2);
      if (var5 != null && var5.R()) {
         ιηοψσγξςΩγδ var6 = this.D.a().a(var5);
         int var7 = var6 != null && System.currentTimeMillis() - var6.a(πβκνλοΛκΠδΦτφλ.h, 0L) > it ? iu : iv;
         InetAddress var8 = ((InetSocketAddress)var1.getConnection().getSocketAddress()).getAddress();
         String var9 = var8.getHostAddress();
         String var10 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.Y);
         if (var7 == 0 || !var3 && (!ΣλνΨουΩΔοθεβ.L.ar() || !var8.equals(var5.b().getAddress()) && !var9.equals(var4.k()))) {
            var1.setCancelled((boolean)iy);
            var1.setCancelReason(TextComponent.fromLegacyText(var10));
            return (boolean)iz;
         } else {
            var5.a(var10);
            return (boolean)ix;
         }
      } else {
         return (boolean)is;
      }
   }

   @EventHandler
   public void b(PlayerDisconnectEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();

      try {
         ΨαχΨχΣλεΠψΦ var3 = this.f.b().a(var2);
         ((Ψογξκθθτ)this.D.b()).d(var3);
      } catch (Throwable var4) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(bb, bc ^ bd) + var1.getClass().getSimpleName() + c<"㺃">(be & bf, bg) + var2.getName() + c<"㺆">(bh, bi ^ bj), var4);
         var2.disconnect(TextComponent.fromLegacyText(c<"㺉">(bl & bm, bn)));
      }
   }

   @Generated
   public χιΣωβσνλδΩβξΓδ(nLoginBungee var1, ΨγημιδξΓτοθαζ var2) {
      this.f = var1;
      this.D = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void d(PreLoginEvent var1) {
      PendingConnection var2 = var1.getConnection();
      String var3 = var2.getName();
      InetAddress var4 = ((InetSocketAddress)var2.getSocketAddress()).getAddress();
      Channel var5 = οεπΛΩωξταψψωβς.a(var1, var2);
      if (var5 == null) {
         var1.setCancelled((boolean)br);
         var1.setCancelReason(TextComponent.fromLegacyText(c<"㺀">(bs, bt ^ bu) + var1.getClass().getSimpleName() + c<"㺃">(bv, bw ^ bx)));
      } else if (!this.D.b().e(var5)) {
         αεθζδβΨξςρπΩζθδ var6 = this.D.b().a();
         νμηαΣεφη var7 = null;
         UUID var8 = null;
         if (var6 instanceof ωΓΛΨΠωΦπΨχφβ) {
            ωΓΛΨΠωΦπΨχφβ var9 = (ωΓΛΨΠωΦπΨχφβ)var6;
            FloodgatePlayer var10 = var9.a(var2.getUniqueId());
            if (var10 != null) {
               String var11 = var10.getCorrectUsername();
               if (!var3.equals(var11)) {
                  throw new IllegalStateException(c<"㺆">(by & bz, ca) + var3 + c<"㺉">(cb, cc ^ cd) + var11);
               }

               var7 = new νμηαΣεφη(var10);
               var8 = var10.getJavaUniqueId();
            }
         }

         τΠαΛκαωωμκνλΨα var22 = null;
         if (βδΔφμπθθγ.c() != γΠζΣΣΩμΛ.f && Σααεξξγς.aC() && var2.getVersion() >= ce) {
            try {
               var22 = new τΠαΛκαωωμκνλΨα(Σααεξξγς.a(var2));
            } catch (IllegalAccessException var21) {
               ψΓωτιμωκχψΛΨ.d(c<"㺌">(cf, cg) + var21.getMessage());
            }
         }

         boolean var23 = κδΔΦφγμδξΨωψο.d.ar();
         if (var23) {
            στΩξξχκι var13 = null;
            String var12;
            ηεΓβΦχΩψςηδΠ var14;
            String var24;
            if (var7 != null) {
               var24 = var3;
               var12 = var3;
               var13 = this.D.a().a(var3, null, var8, (boolean)ci);
               if (var13 == null) {
                  String var33 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                  var1.setCancelled((boolean)ck);
                  var1.setCancelReason(TextComponent.fromLegacyText(var33));
                  return;
               }

               if (!this.D.b().a().J() && !var13.u()) {
                  if (!this.D.a().b(var13, var3)) {
                     String var32 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                     var1.setCancelled((boolean)cm);
                     var1.setCancelReason(TextComponent.fromLegacyText(var32));
                     return;
                  }

                  var12 = βδΔφμπθθγ.g(var13.d(var3), var13.t());
               }

               var14 = null;
            } else {
               String var15 = var2.getVirtualHost().getHostName();
               var14 = ηεΓβΦχΩψςηδΠ.a(var15);
               if (!var14.aQ() && var22 != null) {
                  var14 = var22.b() != null && var22.a(this.f) ? ηεΓβΦχΩψςηδΠ.b : ηεΓβΦχΩψςηδΠ.c;
                  if (var14 == ηεΓβΦχΩψςηδΠ.b) {
                     στΩξξχκι var16 = this.D.a().a(var3, var22.b(), (boolean)cn);
                     if (var16 == null) {
                        String var40 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        var1.setCancelled((boolean)cp);
                        var1.setCancelReason(TextComponent.fromLegacyText(var40));
                        return;
                     }

                     String var17 = var16.d(var3);
                     τσΦζχβμθναζμθω var18 = νκσΩννοψξ.a(var17, var4);
                     if (var18 != τσΦζχβμθναζμθω.c && var16.r() && !var16.t()) {
                        νκσΩννοψξ.a(this.D, var17, var4, τσΦζχβμθναζμθω.b);
                        var13 = var16;
                        if (var18 != τσΦζχβμθναζμθω.e) {
                           var14 = ηεΓβΦχΩψςηδΠ.c;
                        }
                     }
                  }
               }

               if (!var14.aQ() && this.D.a().p()) {
                  var14 = ηεΓβΦχΩψςηδΠ.c;
               }

               switch (ΦαΛΓσδφεηΦΣ.U[var14.ordinal()]) {
                  case 1:
                     var2.setOnlineMode((boolean)cq);
                     var24 = var3;
                     var12 = βδΔφμπθθγ.g(var3, (boolean)cr);
                     break;
                  case 2:
                     if (var13 == null) {
                        var13 = this.D.a().a(var3, null, null, (boolean)cs);
                        if (var13 == null) {
                           String var39 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                           var1.setCancelled((boolean)cu);
                           var1.setCancelReason(TextComponent.fromLegacyText(var39));
                           return;
                        }
                     }

                     if (!this.D.a().b(var13, var3)) {
                        String var38 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        var1.setCancelled((boolean)cw);
                        var1.setCancelReason(TextComponent.fromLegacyText(var38));
                        return;
                     }

                     var24 = var13.d(var3);
                     var12 = βδΔφμπθθγ.g(var24, (boolean)cx);
                     UUID var37 = λΣσΣκΓβΠΨ.d(var24);
                     if (var2.isOnlineMode()) {
                        var2.setOnlineMode((boolean)cy);
                     }

                     try {
                        Σααεξξγς.a(var2, var12);
                        Σααεξξγς.a(var2, var37);
                     } catch (IllegalAccessException var20) {
                        ψΓωτιμωκχψΛΨ.c(c<"㺏">(cz & da, db) + var24 + c<"㺒">(dc, dd), var20);
                        var1.setCancelled((boolean)df);
                        var1.setCancelReason(TextComponent.fromLegacyText(c<"㺕">(dg, dh)));
                     }
                     break;
                  case 3:
                     πωιψγηξΓρφυ var42 = πωιψγηξΓρφυ.Z;
                     Object[] var10001 = new Object[di];
                     var10001[dj] = var15;
                     String var36 = εδδΠηδξΛΣχ.a(var42, var10001);
                     var1.setCancelled((boolean)dk);
                     var1.setCancelReason(TextComponent.fromLegacyText(var36));
                     return;
                  case 4:
                     String var35;
                     if (εδδΠηδξΛΣχ.j()) {
                        String[] var10000 = new String[dl];
                        var10000[dm] = c<"㺘">(dn, do ^ dp) + var15 + c<"㺛">(dq, dr ^ ds);
                        var10000[dt] = c<"㺞">(du, dv ^ dw);
                        var10000[dx] = c<"㺡">(dy, dz ^ ea);
                        var10000[eb] = c<"㺤">(ec, ed ^ ee);
                        var10000[ef] = c<"㺧">(eg, eh ^ ei);
                        var10000[ej] = c<"㺪">(ek, el ^ em);
                        var35 = βιχγΓλχΠσπ.a(var10000);
                     } else {
                        String[] var41 = new String[en];
                        var41[eo] = c<"㺭">(ep & eq, er) + var15 + c<"㺰">(es & et, eu);
                        var41[ev] = c<"㺳">(ew, ex);
                        var41[ey] = c<"㺶">(ez, fa);
                        var41[fb] = c<"㺹">(fc & fd, fe);
                        var41[ff] = c<"㺼">(fg, fh);
                        var41[fi] = c<"㺿">(fj, fk ^ fl);
                        var35 = βιχγΓλχΠσπ.a(var41);
                     }

                     var1.setCancelled((boolean)fm);
                     var1.setCancelReason(TextComponent.fromLegacyText(var35));
                     return;
                  default:
                     throw new IllegalArgumentException(c<"㻂">(fn, fo ^ fp) + var14);
               }
            }

            if (this.a(var1, var12, (boolean)(var7 != null && var13.u() ? fq : fr), var13)) {
               return;
            }

            var5.attr(ωΦΛΩμυνθφςςκαα.f).set(new ωΦΛΩμυνθφςςκαα(var13, var24, var7, var14));
         } else {
            στΩξξχκι var25 = this.D.a().a(var3, null, var8, (boolean)fs);
            if (var25 == null) {
               String var27 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
               var1.setCancelled((boolean)fu);
               var1.setCancelReason(TextComponent.fromLegacyText(var27));
               return;
            }

            String var26 = var3;
            if (var7 == null || !this.D.b().a().J() && !var25.u()) {
               if (!this.D.a().b(var25, var3)) {
                  String var30 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                  var1.setCancelled((boolean)fw);
                  var1.setCancelReason(TextComponent.fromLegacyText(var30));
                  return;
               }

               String var28 = var25.d(var3);
               if (!var3.equals(var28)) {
                  try {
                     Σααεξξγς.a(var2, var28);
                  } catch (IllegalAccessException var19) {
                     ψΓωτιμωκχψΛΨ.c(c<"㻅">(fx, fy) + var3 + c<"㻈">(fz, ga), var19);
                     var1.setCancelled((boolean)gc);
                     var1.setCancelReason(TextComponent.fromLegacyText(c<"㻋">(gd, ge)));
                  }

                  var26 = var28;
               }
            }

            var5.attr(ωΦΛΩμυνθφςςκαα.f).set(new ωΦΛΩμυνθφςςκαα(var25, var26, var7, null));
            if (var7 == null) {
               BungeeLoader var29 = this.f.a();
               var1.registerIntent(var29);
               String var31 = var26;
               τΠαΛκαωωμκνλΨα var34 = var22;
               this.f.a((boolean)gf).a(() -> {
                  try {
                     if (var1.isCancelled()) {
                        return;
                     }

                     θκρδβκΓηζβδΛ var8x = this.D.a().a(var25, var31, var4, var34);
                     switch (ΦαΛΓσδφεηΦΣ.V[var8x.ordinal()]) {
                        case 1:
                           var1.setCancelled((boolean)jb);
                           πωιψγηξΓρφυ var12x = πωιψγηξΓρφυ.aa;
                           Object[] var13x = new Object[jc];
                           var13x[jd] = var31;
                           var1.setCancelReason(TextComponent.fromLegacyText(εδδΠηδξΛΣχ.a(var12x, var13x)));
                           return;
                        case 2:
                           var1.setCancelled((boolean)je);
                           πωιψγηξΓρφυ var10001x = πωιψγηξΓρφυ.ab;
                           Object[] var10002 = new Object[jf];
                           var10002[jg] = var31;
                           var1.setCancelReason(TextComponent.fromLegacyText(εδδΠηδξΛΣχ.a(var10001x, var10002)));
                           return;
                        case 3:
                           this.a(var1, var31, (boolean)jh, var25);
                           break;
                        case 4:
                           var2.setOnlineMode((boolean)ji);
                           break;
                        default:
                           throw new UnsupportedOperationException(c<"㺀">(jj, jk ^ jl) + var8x);
                     }
                  } finally {
                     var1.completeIntent(var29);
                  }
               });
            } else {
               this.a(var1, var26, var25.u(), var25);
            }
         }
      }
   }

   @EventHandler(
      priority = -64
   )
   public void b(PostLoginEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();

      try {
         ΨαχΨχΣλεΠψΦ var3 = this.f.b().a(var2);
         if (var3.S()) {
            return;
         }

         PendingConnection var4 = var2.getPendingConnection();
         Channel var5 = οεπΛΩωξταψψωβς.a(var1, var4);
         String var6 = ((Ψογξκθθτ)this.D.b()).a(var3, var1, var5, var4.isOnlineMode());
         if (var6 != null) {
            var2.disconnect(TextComponent.fromLegacyText(var6));
         }
      } catch (Throwable var7) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(ao, ap ^ aq) + var1.getClass().getSimpleName() + c<"㺃">(ar, as ^ at) + var2.getName() + c<"㺆">(au & av, aw), var7);
         var2.disconnect(TextComponent.fromLegacyText(c<"㺉">(ay, az ^ ba)));
      }
   }

   static {
      b();
   }
}
