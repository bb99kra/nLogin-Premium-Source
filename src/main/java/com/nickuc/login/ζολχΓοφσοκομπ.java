package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class ζολχΓοφσοκομπ implements θβορΛτηατθΨτΠτΦ {
   private static int cr = (10752 >>> 73 | 10752 << -73) & -1;
   private static int dt = (6553600 >>> 146 | 6553600 << -146) & -1;
   private static long bu = Long.reverse(8919061850319295922L);
   private static int bi = 851968 >>> 16 | 851968 << -16;
   private static String[] a = new String[ζολχΓοφσοκομπ.dx];
   private static int bm = Integer.reverse(1879048192);
   private static int u = Integer.reverse(0);
   private static long bk = Long.reverse(7493989779944505344L);
   private static int am = Integer.reverse(1073741824);
   private static int bo = 12 >>> 194 | 12 << ~194 + 1;
   private static int cd = (0 >>> 6 | 0 << -6) & -1;
   private static int dp = -1 >>> 198 | -1 << -198;
   private static int bv = Integer.reverse(-1610612736);
   private static int cc = 512 >>> 73 | 512 << ~73 + 1;
   private static long ct = Long.reverse(7493989779944505344L);
   private static long by = Long.reverse(7493989779944505344L);
   private static int r = (0 >>> 38 | 0 << ~38 + 1) & -1;
   private static long dv = Long.reverse(8919061850319295922L);
   private static int ad = 256 >>> 198 | 256 << ~198 + 1;
   private static int o = (2 >>> 1 | 2 << ~1 + 1) & -1;
   private static long ao = Long.reverse(1425072070374790578L);
   private static int db = 0 >>> 94 | 0 << ~94 + 1;
   private static int v = 0 >>> 209 | 0 << ~209 + 1;
   private static int cp = (-1 >>> 1 | -1 << -1) & -1;
   private static int ch = Integer.reverse(Integer.MIN_VALUE);
   private static int dh = Integer.reverse(0);
   private static int dy = Integer.reverse(1476395008);
   private static int a = (0 >>> 59 | 0 << ~59 + 1) & -1;
   private static int i = Integer.reverse(-1);
   private static int cv = (11264 >>> 73 | 11264 << ~73 + 1) & -1;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int dk = Integer.reverse(0);
   private static int p = Integer.reverse(0);
   private static long cx = Long.reverse(7493989779944505344L);
   private static int ar = Integer.reverse(268435456);
   private static long ds = Long.reverse(8919061850319295922L);
   private static long cs = Long.reverse(1425072070374790578L);
   private static long ap = Long.reverse(7493989779944505344L);
   private static int x = 0 >>> 144 | 0 << ~144 + 1;
   private static int ag = Integer.reverse(-1610612736);
   private static int dn = Integer.reverse(Integer.MIN_VALUE);
   private static int cy = Integer.reverse(0);
   private static String[] b = new String[dy];
   private static int cl = Integer.reverse(-939524096);
   private static long af = Long.reverse(8919061850319295922L);
   private static int cj = (536870912 >>> 253 | 536870912 << -253) & -1;
   private static int ca = Integer.reverse(-1);
   private static long cb = Long.reverse(8919061850319295922L);
   private static int ay = Integer.reverse(1342177280);
   private static int w = (0 >>> 130 | 0 << -130) & -1;
   private static long cm = Long.reverse(8919061850319295922L);
   private static int bf = Integer.reverse(805306368);
   private static int co = 320 >>> 36 | 320 << -36;
   private static long f = Long.reverse(1425072070374790578L);
   private static long cq = Long.reverse(8919061850319295922L);
   private static long as = Long.reverse(8919061850319295922L);
   private static int at = (131072 >>> 207 | 131072 << -207) & -1;
   private static int ce = (0 >>> 43 | 0 << -43) & -1;
   private static int dg = 4194304 >>> 150 | 4194304 << -150;
   private static int ae = Integer.reverse(-1);
   private static long az = Long.reverse(8919061850319295922L);
   private static int ck = Integer.reverse(0);
   private static long bg = Long.reverse(8919061850319295922L);
   private static int ab = Integer.reverse(1610612736);
   private static long av = Long.reverse(1425072070374790578L);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int cf = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << -223) & -1;
   private static int dr = (48 >>> 129 | 48 << ~129 + 1) & -1;
   private static long br = Long.reverse(7493989779944505344L);
   private static int dm = 0 >>> 0 | 0 << -0;
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int dw = Integer.reverse(0);
   private static long dq = Long.reverse(8919061850319295922L);
   private static int e = 16384 >>> 110 | 16384 << -110;
   private static int m = 16384 >>> 110 | 16384 << ~110 + 1;
   private static int do = 94208 >>> 236 | 94208 << ~236 + 1;
   private static int aq = 6 >>> 97 | 6 << -97;
   private static long bq = Long.reverse(1425072070374790578L);
   private static int ak = Integer.reverse(1610612736);
   private static int ax = Integer.reverse(-1610612736);
   private static int k = Integer.reverse(-1073741824);
   private static int an = (58720256 >>> 247 | 58720256 << -247) & -1;
   private static int y = 0 >>> 202 | 0 << ~202 + 1;
   private static long c;
   private static int aj = (16384 >>> 14 | 16384 << -14) & -1;
   private static int dj = Integer.reverse(Integer.MIN_VALUE);
   private static int ac = Integer.reverse(0);
   private static int bc = 360448 >>> 175 | 360448 << ~175 + 1;
   private static int bd = (-1 >>> 50 | -1 << ~50 + 1) & -1;
   private static long aw = Long.reverse(7493989779944505344L);
   private static int cz = Integer.reverse(0);
   private static int bb = Integer.reverse(0);
   private static int da = Integer.reverse(0);
   private static int bp = -2147483641 >>> 95 | -2147483641 << -95;
   private static long cw = Long.reverse(1425072070374790578L);
   private static int dx = Integer.reverse(1476395008);
   private static int dc = Integer.reverse(0);
   private static int cg = Integer.reverse(0);
   private static long bn = Long.reverse(8919061850319295922L);
   private static int dd = Integer.reverse(0);
   private static int dl = Integer.reverse(0);
   private static long b = Long.reverse(1425072070374790578L);
   private static int df = Integer.reverse(0);
   private static long l = Long.reverse(8919061850319295922L);
   private static int aa = Integer.reverse(0);
   private static long di = Long.reverse(1934296039955628032L);
   private static int bt = Integer.reverse(134217728);
   private static int h = (16777216 >>> 55 | 16777216 << ~55 + 1) & -1;
   private static int de = (0 >>> 2 | 0 << ~2 + 1) & -1;
   private static long ai = Long.reverse(7493989779944505344L);
   private static int du = -1 >>> 54 | -1 << ~54 + 1;
   private static long ah = Long.reverse(1425072070374790578L);
   private final SecureRandom c;
   private static int bs = 128 >>> 37 | 128 << -37;
   private static int bw = Integer.reverse(-2013265920);
   private static int au = (288 >>> 133 | 288 << ~133 + 1) & -1;
   private static int bz = Integer.reverse(1207959552);
   private static int bl = (1024 >>> 9 | 1024 << -9) & -1;
   private static int ba = 768 >>> 135 | 768 << ~135 + 1;
   private static long al = Long.reverse(8919061850319295922L);
   private static long j = Long.reverse(8919061850319295922L);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int cu = 33554432 >>> 247 | 33554432 << -247;
   private static long be = Long.reverse(8919061850319295922L);
   private static long bj = Long.reverse(1425072070374790578L);
   private static int cn = 32 >>> 37 | 32 << ~37 + 1;
   private static long g = Long.reverse(7493989779944505344L);
   private static int ci = 0 >>> 171 | 0 << ~171 + 1;
   private static int bh = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(7493989779944505344L);
   private static long bx = Long.reverse(1425072070374790578L);

   static {
      b();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(User var1, Channel var2, ΣπβςζρμθΔπφψοωφ var3, νμηαΣεφη var4, WrapperLoginClientLoginStart var5) {
      String var6 = var5.getUsername();
      τΠαΛκαωωμκνλΨα var7 = βδΔφμπθθγ.c() != γΠζΣΣΩμΛ.f && var1.getPacketVersion().isNewerThanOrEquals(ClientVersion.V_1_19_1)
         ? new τΠαΛκαωωμκνλΨα((UUID)var5.getPlayerUUID().orElse(null))
         : null;
      InetAddress var8 = var1.getAddress().getAddress();
      String var9 = αδοβτΣσΠμμχοΨ.a(this.b).b().a(var6, var8, Boolean.valueOf((boolean)(var4 != null ? o : p)));
      if (var9 != null) {
         αυμξτυζΩ.i(var1, var9);
      } else {
         Object var10 = var3.h();
         if (var4 != null) {
            this.a(var1, var5, var2, var10, var4, var6, var8);
         } else {
            boolean var11 = κδΔΦφγμδξΨωψο.d.ar();
            στΩξξχκι var12 = null;
            int var13;
            String var14;
            String var15;
            if (var11) {
               String var16 = var3.aw();
               ηεΓβΦχΩψςηδΠ var17 = ηεΓβΦχΩψςηδΠ.a(var16);
               if (!var17.aQ() && var7 != null) {
                  var17 = var7.b() != null && var7.a(αδοβτΣσΠμμχοΨ.a(this.b)) ? ηεΓβΦχΩψςηδΠ.b : ηεΓβΦχΩψςηδΠ.c;
                  if (var17 == ηεΓβΦχΩψςηδΠ.b) {
                     στΩξξχκι var18 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var6, var7.b(), (boolean)q);
                     if (var18 == null) {
                        String var29 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        αυμξτυζΩ.i(var1, var29);
                        return;
                     }

                     String var19 = var18.d(var6);
                     τσΦζχβμθναζμθω var20 = νκσΩννοψξ.a(var19, var8);
                     if (var20 != τσΦζχβμθναζμθω.c && var18.r() && !var18.t()) {
                        νκσΩννοψξ.a(αδοβτΣσΠμμχοΨ.a(this.b), var19, var8, τσΦζχβμθναζμθω.b);
                        var12 = var18;
                        if (var20 != τσΦζχβμθναζμθω.e) {
                           var17 = ηεΓβΦχΩψςηδΠ.c;
                        }
                     }
                  }
               }

               if (!var17.aQ() && αδοβτΣσΠμμχοΨ.a(this.b).a().p()) {
                  var17 = ηεΓβΦχΩψςηδΠ.c;
               }

               switch (ιΛοιψβαηκυΔα.N[var17.ordinal()]) {
                  case 1:
                     var14 = var6;
                     var15 = βδΔφμπθθγ.g(var6, (boolean)s);
                     var13 = t;
                     break;
                  case 2:
                     if (var12 == null) {
                        var12 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var6, null, null, (boolean)u);
                        if (var12 == null) {
                           String var28 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                           αυμξτυζΩ.i(var1, var28);
                           return;
                        }
                     }

                     if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var12, var6)) {
                        String var27 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        αυμξτυζΩ.i(var1, var27);
                        return;
                     }

                     var14 = var12.d(var6);
                     var15 = βδΔφμπθθγ.g(var14, (boolean)x);
                     var13 = y;
                     break;
                  case 3:
                     πωιψγηξΓρφυ var32 = πωιψγηξΓρφυ.Z;
                     Object[] var10001 = new Object[z];
                     var10001[aa] = var16;
                     String var26 = εδδΠηδξΛΣχ.a(var32, var10001);
                     αυμξτυζΩ.i(var1, var26);
                     return;
                  case 4:
                     String var30;
                     if (εδδΠηδξΛΣχ.j()) {
                        String[] var10000 = new String[ab];
                        var10000[ac] = c<"㺀">(ad & ae, af) + var16 + c<"㺃">(ag, ah ^ ai);
                        var10000[aj] = c<"㺆">(ak, al);
                        var10000[am] = c<"㺉">(an, ao ^ ap);
                        var10000[aq] = c<"㺌">(ar, as);
                        var10000[at] = c<"㺏">(au, av ^ aw);
                        var10000[ax] = c<"㺒">(ay, az);
                        var30 = βιχγΓλχΠσπ.a(var10000);
                     } else {
                        String[] var31 = new String[ba];
                        var31[bb] = c<"㺕">(bc & bd, be) + var16 + c<"㺘">(bf, bg);
                        var31[bh] = c<"㺛">(bi, bj ^ bk);
                        var31[bl] = c<"㺞">(bm, bn);
                        var31[bo] = c<"㺡">(bp, bq ^ br);
                        var31[bs] = c<"㺤">(bt, bu);
                        var31[bv] = c<"㺧">(bw, bx ^ by);
                        var30 = βιχγΓλχΠσπ.a(var31);
                     }

                     String var25 = var30;
                     αυμξτυζΩ.i(var1, var25);
                     return;
                  default:
                     throw new IllegalArgumentException(c<"㺪">(bz & ca, cb) + var17);
               }
            } else {
               var12 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var6, null, null, (boolean)cc);
               if (var12 == null) {
                  String var24 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                  αυμξτυζΩ.i(var1, var24);
                  return;
               }

               if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var12, var6)) {
                  String var23 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                  αυμξτυζΩ.i(var1, var23);
                  return;
               }

               var15 = var14 = var12.d(var6);
               θκρδβκΓηζβδΛ var21 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var12, var14, var8, var7);
               switch (ιΛοιψβαηκυΔα.O[var21.ordinal()]) {
                  case 1:
                     πωιψγηξΓρφυ var34 = πωιψγηξΓρφυ.aa;
                     Object[] var35 = new Object[cf];
                     var35[cg] = var14;
                     αυμξτυζΩ.i(var1, εδδΠηδξΛΣχ.a(var34, var35));
                     return;
                  case 2:
                     πωιψγηξΓρφυ var33 = πωιψγηξΓρφυ.ab;
                     Object[] var10002 = new Object[ch];
                     var10002[ci] = var14;
                     αυμξτυζΩ.i(var1, εδδΠηδξΛΣχ.a(var33, var10002));
                     return;
                  case 3:
                  case 4:
                     var13 = var21 == θκρδβκΓηζβδΛ.d ? cj : ck;
                     break;
                  default:
                     throw new UnsupportedOperationException(c<"㺭">(cl, cm) + var21);
               }
            }

            boolean var22 = αδοβτΣσΠμμχοΨ.a(this.b).a().getOnlineMode();
            if (var22) {
               var13 = cn;
            }

            if (var13 != 0) {
               this.a(var1, var5, var2, var10, var12, var14, var7, var6, var8, var22);
            } else {
               this.a(var1, var5, var2, var10, var12, var14, var15, var6, var8);
            }
         }
      }
   }

   private void a(User var1, WrapperLoginClientLoginStart var2, Channel var3, Object var4, νμηαΣεφη var5, String var6, InetAddress var7) {
      String var8 = var5.a.getCorrectUsername();
      UUID var9 = var5.a.getJavaUniqueId();
      στΩξξχκι var10 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var8, null, var9, (boolean)dc);
      if (var10 == null) {
         String var17 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
         αυμξτυζΩ.i(var1, var17);
      } else if (!this.a(var1, var8, var7, var10.u(), var10)) {
         if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var1x -> αυμξτυζΩ.i(var1, var1x), var10, var7.getHostAddress(), ΣλνΨουΩΔοθεβ.J)) {
            if (!αδοβτΣσΠμμχοΨ.a(this.b).a().a(var1x -> αυμξτυζΩ.i(var1, var1x), var10, var7.getHostAddress(), ΣλνΨουΩΔοθεβ.R)) {
               if (!αδοβτΣσΠμμχοΨ.a(this.b).a().a(var10, var9, var8, var7.getHostAddress())) {
                  αυμξτυζΩ.i(var1, εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
               } else {
                  if (!αδοβτΣσΠμμχοΨ.a(this.b).b().a().J() && !var10.u()) {
                     if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var10, var6)) {
                        String var16 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w);
                        αυμξτυζΩ.i(var1, var16);
                        return;
                     }

                     String var11 = var10.i();
                     var8 = var11 != null ? var11 : var6;
                     if (κδΔΦφγμδξΨωψο.d.ar()) {
                        var8 = βδΔφμπθθγ.g(var8, var10.t());
                     }
                  }

                  UUID var15 = var10.a();
                  UUID var12 = var15 != null && κδΔΦφγμδξΨωψο.m.ar() ? var15 : var5.a.getCorrectUniqueId();
                  Runnable var13 = μΔψωΠχΛξεκε.a(var4, var8, var12, null);
                  com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var14 = new com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ(var1, var10, var8, var12, (boolean)dg, var13, var3, null);
                  var3.attr(com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a).set(var14);
                  com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a(var8, var6, var7, var14);
                  var2.setPlayerUUID(var12);
                  var2.setUsername(var8);
                  αδοβτΣσΠμμχοΨ.b(var1, var2, var8);
               }
            }
         }
      }
   }

   private void a(
      User var1,
      WrapperLoginClientLoginStart var2,
      Channel var3,
      Object var4,
      @Nullable στΩξξχκι var5,
      String var6,
      @Nullable τΠαΛκαωωμκνλΨα var7,
      String var8,
      InetAddress var9,
      boolean var10
   ) {
      if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var1x -> αυμξτυζΩ.i(var1, var1x), var5, var9.getHostAddress(), ΣλνΨουΩΔοθεβ.I)) {
         if (!αδοβτΣσΠμμχοΨ.a(this.b).a().a(var1x -> αυμξτυζΩ.i(var1, var1x), var5, var9.getHostAddress(), ΣλνΨουΩΔοθεβ.Q)) {
            ψΓςλνΣΠπεοψγΩσπ var11 = null;
            SignatureData var12 = (SignatureData)var2.getSignatureData().orElse(null);
            if (var12 != null) {
               var11 = new ψΓςλνΣΠπεοψγΩσπ(var12, var7 != null ? var7.b() : null);
               if (var11.aA()) {
                  αυμξτυζΩ.j(var1, c<"㺀">(co & cp, cq));
                  return;
               }

               if (!var11.aB()) {
                  αυμξτυζΩ.j(var1, c<"㺃">(cr, cs ^ ct));
                  return;
               }
            }

            byte[] var13;
            if (var10) {
               var13 = null;
            } else {
               var13 = new byte[cu];
               this.c.nextBytes(var13);
               var1.sendPacketSilently(new WrapperLoginServerEncryptionRequest(c<"㺆">(cv, cw ^ cx), αδοβτΣσΠμμχοΨ.a(this.b).getPublic(), var13));
            }

            var3.attr(ΨΓνξςηπΨ.e).set(new ΨΓνξςηπΨ(var5, var6, var8, var4, var2, var11, var13));
            if (var10) {
               var1.receivePacketSilently(var2);
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ζολχΓοφσοκομπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φΨαξωυθανΣφυκη.A("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 65), ζολχΓοφσοκομπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΦδφπθΩΩλζξ.F("ԼՉՈԋՋՇՂՋՖՅԒՐՔՍՐՖԘࢠࢪࢧࢴࢁࢮࢶࢴࢱࢭࢳࢱࢶԱ", (byte)29, 70) + var1 + φΨαξωυθανΣφυκη.A("ó", (byte)29, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   private ζολχΓοφσοκομπ(αδοβτΣσΠμμχοΨ var1) {
      this.b = var1;
      this.c = new SecureRandom();
   }

   private boolean a(User var1, String var2, InetAddress var3, boolean var4, στΩξξχκι var5) {
      ΨαχΨχΣλεΠψΦ var6 = αδοβτΣσΠμμχοΨ.a(this.b).b().a(var2);
      if (var6 == null) {
         return (boolean)dh;
      } else {
         ιηοψσγξςΩγδ var7 = αδοβτΣσΠμμχοΨ.a(this.b).a().a(var6);
         int var8 = var7 != null && System.currentTimeMillis() - var7.a(πβκνλοΛκΠδΦτφλ.h, 0L) > di ? dj : dk;
         String var9 = var3.getHostAddress();
         String var10 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.Y);
         if (var8 == 0 || !var4 && (!ΣλνΨουΩΔοθεβ.L.ar() || !var3.equals(var6.b().getAddress()) && !var9.equals(var5.k()))) {
            αυμξτυζΩ.i(var1, var10);
            return (boolean)dn;
         } else {
            var6.a(var10);
            return (boolean)dm;
         }
      }
   }

   private static void b() {
      c = 5595898901232837576L;
      long var0 = c ^ 2437898435453971826L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(46 + 23),
               (byte)(32 + 51),
               (byte)(16 + 31),
               (byte)(51 + 16),
               (byte)(65 + 1),
               (byte)(17 + 50),
               (byte)(44 + 3),
               (byte)(44 + 36),
               (byte)(58 + 17),
               (byte)(8 + 59),
               (byte)(34 + 49),
               53,
               (byte)(48 + 32),
               (byte)(27 + 70),
               (byte)(55 + 45),
               (byte)(95 + 5),
               (byte)(66 + 39),
               (byte)(16 + 94),
               (byte)(81 + 22)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
               b[0] = μζξτΩσσφυδεπλΨ.D("ХрКЋЩЧЩујвіевхЙЧбэльКНллеѐќоѬфйѤѭйќмѓъсѢѵѤѣфвиѵѰыѯѬџєѲніуоѨѼтѾѾ҅", (byte)11, 68);
               b[1] = ζοηκορΦνΣθγΩ.D("ЇШбЪгДшБтеДО", (byte)11, 68);
               b[2] = οΩνΩρωλΨηΛδωδ.E("ԐӳՁԢӼԲԘӽԙԑՆԥԾՅՅՀԹԾԤՄԧԮՃԓԫՃԩՇԙԶԝԵ", (byte)11, 69);
               b[3] = βεξΠθρρςΔΦμ.D("шяёЍОргДРХйбШцгКЮкЪџряПмхћвѦыйѬѦѩѥѭѭѭѤчэѷѷѬѩњѪѰѓчѡѕъуѠѮцћѾѝҁҋѶ҇Ѻ", (byte)11, 68);
               b[4] = ΣερμΔσατσκ.B("ĆêßÐÄëïæÞÿùåČĒĔîěčēĒċñïġĄçĝĜėĪÿĦìåĐëčěüĦĪĐôıĔòěûõúĭĴûċĈĉ", (byte)11, 66);
               b[5] = ΠΛΨοδΩσμνΛγΦφβς.E(
                  "ԸԲӻӵӶԸՄԹԀԈՁԂԽԫՍԹԺԫԍՌԾԒՀԤԐՎՃ՚Ԝ՞ԿՌԖԓԔԯՁԹԺ՝ՐԨՈԢՠՋ՜ԥեՀՌՇԱԾէճհժէՑԲկՒԸմՒ՛ցձեՏՁՙՆթ՞Ն֍\u0558հեՃջձռ\u058c֖Ցե\u058bմև֍ը֓՞", (byte)11, 69
               );
               b[6] = πψυκΠΨμΛΩβΣφμφσ.F("ԬԋԎՀԠՃԆՅՆԺԅԏ", (byte)11, 70);
               b[7] = φΨαξωυθανΣφυκη.C(
                  "лЈКсВЬБЍабЭЌхгаЗћВОРїзУсзєУкгЧсјѧхѱѡѐѳыѷѡєѴуѫќяемкѓѝѼѸѶрѼцшхј҈ѧѣсҊѮѳ҃҇ѝѓ҇ї҅Ґ҄ѱѭ҆ҠҔҕңҋѰңѾ҆қѷ҇ҁҞқңҨѢҤҨѱѲѲҔѵҶҕѾ", (byte)11, 67
               );
               b[8] = χΠξΦιζΨΣωΦσΨζ.C("лКНяЯђЕєѕщДО", (byte)11, 67);
               b[9] = φΨαξωυθανΣφυκη.A("ăËÙýąÎêýßéíóéöïÖĚčîÝėĖñåĠÙĠû÷ęĞĥĝĩĥüĬĤĊĈòôĎķăúėĎĮĕüýĢŃģĒįćģňğĻăČĞĪęĹŊŃŒŋĒĿĹıłħĳħĘīŘĝĮģŃĤŖĠšŘŁŦŠŋ", (byte)11, 65);
               b[10] = ζοηκορΦνΣθγΩ.F("ӹԔӺԘԽԛԔՀԵԦՈԜԴԧԈԹԜԾԒԮԒԋՇՅԵԬՔԸԦՓԗՕՑՖՌԕՌԟՎԵԠըԡԺ՛ՆԪԩ՜ԾՃՔըբշլՉմոԭԲժ՜պՉՖճյոՠփբհժֈՏ", (byte)11, 70);
               b[11] = ΣερμΔσατσκ.E("ԸԜԑԂӶԝԡԘԐԱԳԖԜԌՇԜԪՐՉ\u0530ՕԮԖՑԐՐ\u0558Դ՚\u0530ՆՋԴԲԔԴՅ\u0557ԟա՜ԧԺՇ\u0558ԬՇԡԭՊԮլՁճԲեՃըխՎՐ՝մէ", (byte)11, 69);
               b[12] = χΠξΦιζΨΣωΦσΨζ.D("яявХЌшТвЧёеВИЩНќлМўзљфдлПѧкфѪѨѥѬѨџрамѴѲѳѦєѳѪхфѳљзњѡѸѰюѓфѤѲѴѝќҁѧѿ҆ѽў҇ѿҁҋѠҏѢѨѶҘѨ҇ҙѿ҉ҖѽѝҢѩѪ", (byte)11, 68);
               b[13] = ζοηκορΦνΣθγΩ.D("лКНяЯђЕєѕщДО", (byte)11, 68);
               b[14] = ΦδφπθΩΩλζξ.D("оИПЮоѐЩДЩУбьѐЭёЧйЙїькѡХдѝнщЪоѬчяЩъѩЩѦѩѕѭѦѲЫдлкєћюѩѱѯќљѥуѶѲѶшѻѾѕэҐѻь҅Ѯ҆чѤѬѧғ҅э҄҉ѾѵѶҎџѣҏїѠҨ҉ҖҤ҅҇ҋѸ", (byte)11, 68);
               b[15] = ζοηκορΦνΣθγΩ.D("лКНяЯђЕєѕщДО", (byte)11, 68);
               b[16] = ΣδτΠνεγοΓορητ.F(
                  "ԡԏӾԸԡԟԛԗԈԣԢԡԜԚՌԈՁԮՊԽՒԧԬԫԕՋՌՔԷԘՍԿՕԳբԝ\u0558ՀԴՕԞԠՊԣՁաԦծԫձ՛մՀմԶՀժԳոԻոԵԾ՛ԼՓվՋՍՐպղջզվՁլՅռՁ֊֎ՐզՍֈկՍ֖Ր\u058c\u0590\u0558֒ղՙ", (byte)11, 70
               );
               b[17] = ΨΦνΨΦωυΩνβςμ.A("ÇâÈæċéâĎăôĖêĂõÖćêČàüàÙĕēăúĢĆôġåģğĤĚãĚíĜăîĶïĈĩĔø÷ĪČđĢĶİŅĺėłņûĀĸĪňėĤŁŃņĮőİľĸŖĝ", (byte)11, 65);
               b[18] = οοθδΨιοΦΠβδζ.D("шяёЍОргДРХкѕИдЏплйљРрЬЩЪ", (byte)11, 68);
               b[19] = πχσδΦΦνθΔπ.A("âøăúòÍÏðÔÐÕõÌøÎěúÙğòíóÝğğóĖóĜģâģĦĞéĤğčēĴīĘĈý", (byte)11, 65);
               b[20] = δΛψπξκσβγςα.F("ԾԒӼԻԗԒԾԒԆԧԄԸԨԛԜ\u0530ԐՍՑԼԎԎՂՃՊԶԙԮՏԾՎԾԵՙԳԝՓԭՂԤեԻժ՜ՂՆՋէխՏղԾՈՕթթՒԷ\u0558ՈԷ՞ժՇսԳՐտԾսՔտ։չՁՏ", (byte)11, 70);
               b[21] = ΨΦνΨΦωυΩνβςμ.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѭ҅҃ѾѧуѺѹѬ҈҆", (byte)11, 67);
               b[22] = ΠΛΨοδΩσμνΛγΦφβς.E("ԬԋԎՀԠՃԆՅՆԺԅԏ", (byte)11, 69);
               b[23] = ΦδφπθΩΩλζξ.D(
                  "ЇЯФбпшоЧЖАЬЙЩЖьђѕсНЛбьѕѣтѢўтѢѠкуЧяѰѠчѩЯюрщїьєлешѽнџѷѼђўќѵѽѻ҆ньѺ҄Ѽ҃ҊѢҐ҉Ѡ҃ѱѰ҇ҏјҘ҇ѾѼљҍ҂ҝѳѝјҟѢ҅҃ҀѿѼѾҪѽ҃ҭҁҎѮҏҢ҃҅Ѿ", (byte)11, 68
               );
               b[24] = μζξτΩσσφυδεπλΨ.F("ԵӻԕԽՄԔԡԶԷԥՆՌԸԵԼԉՌԉԡԱՇՕՎՌԵԓՖՍԛԪԾԗԼՌՌՄԳՎԞԥԿ\u0558ԩ՞ՊԿՃՁզՐժէձըԱԷբՅԱկՔՕՏԸ", (byte)11, 70);
               b[25] = ΠΛΨοδΩσμνΛγΦφβς.E("Էԁ\u0530ԛՁԔԄԶԃӿԼԝԤԭԧՐԈԥՄԞԓԣ\u0557ՑՍ՚Ոԥԧԕ\u0530ԪՋԾ\u0530ԣՙՅ՞ԙՠ՛՜ԯ", (byte)11, 69);
               break;
            case 1:
               b[0] = οΩνΩρωλΨηΛδωδ.C("ХрКЋЩЧЩујвіевхЙЧбэльКНллеѐќоѬфйѤѭйќмѓъсѢѵѤѣфвиѵѰыѯѬџєѼѯџ҄ѦѧѣҀуѬѢ", (byte)11, 67);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.D("ЋщЋЯЦцРЪеїДО", (byte)11, 68);
               b[2] = ιΠοθΩΦξκ.D("ПЂѐбЋсЧЌШРѕдэєєяшэгѓжхиюХњчМпФўѫфяЯЭшфѪаЯасо", (byte)11, 68);
               b[3] = πχσδΦΦνθΔπ.A("ćĎĐÌÝÿòÓßäøðçąòÙíùéĞÿĎÞûĄĚñĥĊøīĥĨĤĬĬĬģĆČĶĶīĨęĩįĒĆĠĔĉĂĬěŀĢĔŉğĉŌĶĚ", (byte)11, 65);
               b[4] = οΩνΩρωλΨηΛδωδ.D("чЫРБЅЬаЧПркЦэѓѕЯќюєѓьваѢхШўѝјѫрѧЭЦёЬюќнѧѫёзцшѮѸяъљјѭ҄я҅ѷњ҈ѤѠ҉ъцњ", (byte)11, 68);
               b[5] = βθκςνθΩθυμςτκχ.F(
                  "ԸԲӻӵӶԸՄԹԀԈՁԂԽԫՍԹԺԫԍՌԾԒՀԤԐՎՃ՚Ԝ՞ԿՌԖԓԔԯՁԹԺ՝ՐԨՈԢՠՋ՜ԥեՀՌՇԱԾէճհժէՑԲկՒԸմՒ՛ցձեՏՁՙՆթ՞Ն֍\u0558հեՃջձռ֊Ր֖Րբ\u0557\u0557դշխ֖", (byte)11, 70
               );
               b[6] = ΦδφπθΩΩλζξ.D("юфКФТрсШиЦеО", (byte)11, 68);
               b[7] = βθκςνθΩθυμςτκχ.C(
                  "лЈКсВЬБЍабЭЌхгаЗћВОРїзУсзєУкгЧсјѧхѱѡѐѳыѷѡєѴуѫќяемкѓѝѼѸѶрѼцшхј҈ѧѣсҊѮѳ҃҇ѝѓ҇ї҅Ґ҄ѱѭ҆ҠҔҕңҋѰңѾ҆қѷ҇ҁҞқңҚѩҢѤґҥҖѳѵҹҘҰҗҍ҆ҐѽҾӀҀѹӂ҉Ҋ", (byte)11, 67
               );
               b[8] = ζβησεθωυγτ.E("ԷՂԱԞԥԏ\u0530ԄԷԃԁԏ", (byte)11, 69);
               b[9] = ΣφδσΔζιΠρα.C("фЌКоцЏЫоРЪЮдЪзаЗћюЯОјївЦѡКѡмињџѦўѪѦнѭѥыщгеяѸфлјяѯіноѣ҄ѤѓѰшѤ҉ѠѼфэџѫњѺҋ҄ғҌѓҀѺѲ҃ѨѴѨљѬҙўѯћҥҢў҈ћѤѺѦҙҗ", (byte)11, 67);
               b[10] = μζξτΩσσφυδεπλΨ.D("ЈУЉЧьЪУяфеїЫужЗшЫэСнСКієфлѣчеѢЦѤѠѥћФћЮѝфЯѷащѪѕйиѫэђѣѷѱ҆ѻј҃҇мсѹѫ҉ѽѐѨҒџюѰѢ҅Ґѭў", (byte)11, 68);
               b[11] = ΨφιωσρΓδΔθ.C("чЫРБЅЬаЧПртХЫЛіЫйџјпѤнХѠПџѧуѩпѕњусУуєѦЮѰѫжщіѧліамљнѻѐтѾј҃҂ѥѪҌјҍѥ", (byte)11, 67);
               b[12] = πηγμΣΔκκ.E(
                  "ՀՀԣԖӽԹԓԣԘՂԦԃԉԚԎՍԬԍՏԨՊԵԥԬԐ\u0558ԫԵ՛ՙՖ՝ՙՐԱԡԭեգդ\u0557Յդ՛ԶԵդՊԨՋՒթաԿՄԵՕգեՎՍղ\u0558հշծՏոհղռՑրՓ\u0558Չվ՟զրծևժՍ՜֒ֆդ\u0557Րիև\u0590օ֒վ",
                  (byte)11,
                  69
               );
               b[13] = ΠΛΨοδΩσμνΛγΦφβς.E("ԛԾӹԽԔӾԟԆՄԃԸԏ", (byte)11, 69);
               b[14] = ΣφδσΔζιΠρα.C(
                  "оИПЮоѐЩДЩУбьѐЭёЧйЙїькѡХдѝнщЪоѬчяЩъѩЩѦѩѕѭѦѲЫдлкєћюѩѱѯќљѥуѶѲѶшѻѾѕэҐѻь҅Ѯ҆чѤѬѧғ҅э҄҉ѾѵѶҎџѣҏҜҡ҃ҡ҆ѳҤѦѦѮҰѭҲ҄ңұҴѨҌҦҙѾ", (byte)11, 67
               );
               b[15] = πηγμΣΔκκ.B("ÉëÇëĐČÜÓĀăĎÝ", (byte)11, 66);
               b[16] = δΛψπξκσβγςα.D("аОЍчаЮЪЦЗвбаЫЩћЗѐнљьѡжлкФњћѣцЧќюѤтѱЬѧяуѤЭЯљвѐѰеѽкҀѪ҃я҃хяѹт҇ъ҇фэѪыѢҍњќџ҉ҁҊѵҍѐѻєҋѐҙҝџѵќҝѭѳ҄ѨѵҘҖ҆҂Ҋ", (byte)11, 68);
               b[17] = μζξτΩσσφυδεπλΨ.A("ÇâÈæċéâĎăôĖêĂõÖćêČàüàÙĕēăúĢĆôġåģğĤĚãĚíĜăîĶïĈĩĔø÷ĪČđĢĶİŅĺėłņûĀĸĪňĨŉďļĨďĿŊĐġĤĝ", (byte)11, 65);
               b[18] = ΨφιωσρΓδΔθ.E("ԹՀՂӾԏԱԤԅԑԖԪՄԇԋԛԞՈՉԎԦԜԋԓԢՒՔԢԤՔԬԱԿ", (byte)11, 69);
               b[19] = ΣφδσΔζιΠρα.A("âøăúòÍÏðÔÐÕõÌøÎěúÙğòíóÝğğóĖóĜģâģĜęāċëĤĒĢĎđñ÷ĆĎįĮĚĝøīĴěĈĉ", (byte)11, 65);
               b[20] = ΦδφπθΩΩλζξ.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѤѸѸѡцѧїцѭѹіѯҎҊѨ҈ќҀѰҋҊҗў", (byte)11, 67);
               b[21] = πηγμΣΔκκ.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѱрѠоѺѤђ҈҅ћѪ", (byte)11, 67);
               b[22] = ΦδφπθΩΩλζξ.F("ԖԚԸԟԻԿԵՁԐՁՀԏ", (byte)11, 70);
               b[23] = ΨφιωσρΓδΔθ.D(
                  "ЇЯФбпшоЧЖАЬЙЩЖьђѕсНЛбьѕѣтѢўтѢѠкуЧяѰѠчѩЯюрщїьєлешѽнџѷѼђўќѵѽѻ҆ньѺ҄Ѽ҃ҊѢҐ҉Ѡ҃ѱѰ҇ҏјҘ҇ѾѼљҍ҂ҝѳѝјҟѢ҅҃ҀѿѼѾ҃҂ҫҞѥҵ҉ҕ҄҄ҎҳѻҏҪҲҟҟҏҡҗҌ҉Ҋ", (byte)11, 68
               );
               b[24] = φδχεθοκψαλΛογλ.E("ԵӻԕԽՄԔԡԶԷԥՆՌԸԵԼԉՌԉԡԱՇՕՎՌԵԓՖՍԛԪԾԗԼՌՌՄԳՎԞԥԿ\u0558ԩ՞ՊԿՃՁզՐժէձծԶՆՙՈ\u0530ռմ՚ԴրՎ՟ՖՎԻվւ\u0557ռՠ՞Տ", (byte)11, 69);
               b[25] = πηγμΣΔκκ.B("ąÏþéďâÒĄÑÍĊëòûõĞÖóĒìáñĥğěĨĖóõãþøĊĮïĩĎįįðĩķ÷ý", (byte)11, 66);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.A("üÈÉÇûàììĎäâÖØõèþþđì×ēëèé", (byte)11, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = χφπρψπφΦθμπ.B("ØÇéÜáĊĉçÒàċČôÙĘĜöíĘýėđèé", (byte)11, 66);
         }
      }
   }

   private void a(
      User var1, WrapperLoginClientLoginStart var2, Channel var3, Object var4, στΩξξχκι var5, String var6, String var7, String var8, InetAddress var9
   ) {
      if (!this.a(var1, var7, var9, (boolean)cy, var5)) {
         if (!αδοβτΣσΠμμχοΨ.a(this.b).a().b(var1x -> αυμξτυζΩ.i(var1, var1x), var5, var9.getHostAddress(), null)) {
            if (!αδοβτΣσΠμμχοΨ.a(this.b).a().a(var1x -> αυμξτυζΩ.i(var1, var1x), var5, var9.getHostAddress(), null)) {
               UUID var10 = var5.a();
               if (var10 == null && (var5.h() || βδΔφμπθθγ.a() == νκθνεεηδδ.b)) {
                  var5.a(var10 = λΣσΣκΓβΠΨ.a(var6, null));
                  if (!αδοβτΣσΠμμχοΨ.a(this.b).a().a(var5)) {
                     αυμξτυζΩ.i(var1, εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w));
                     return;
                  }
               }

               Runnable var11 = var10 != null ? μΔψωΠχΛξεκε.a(var4, var7, var10, null) : null;
               com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var12 = new com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ(var1, var5, var6, var10, (boolean)db, var11, var3, null);
               var3.attr(com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a).set(var12);
               com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a(var7, var8, var9, var12);
               αδοβτΣσΠμμχοΨ.b(var1, var2, var7);
            }
         }
      }
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      WrapperLoginClientLoginStart var2 = new WrapperLoginClientLoginStart(var1);
      User var3 = var1.getUser();
      Channel var4 = (Channel)var1.getChannel();
      String var5 = var2.getUsername();
      ΣπβςζρμθΔπφψοωφ var6 = (ΣπβςζρμθΔπφψοωφ)var4.attr(ΣπβςζρμθΔπφψοωφ.d).getAndSet(null);
      if (var6 == null) {
         throw new IllegalStateException(c<"㺀">(a, b ^ d) + var5 + c<"㺃">(e, f ^ g));
      } else {
         αεθζδβΨξςρπΩζθδ var8 = αδοβτΣσΠμμχοΨ.a(this.b).b().a();
         νμηαΣεφη var7;
         if (var8 instanceof ωΓΛΨΠωΦπΨχφβ) {
            FloodgatePlayer var9 = (FloodgatePlayer)var4.attr(((ωΓΛΨΠωΦπΨχφβ)var8).a()).get();
            if (var9 == null && var4.pipeline().get(c<"㺆">(h & i, j)) != null) {
               αυμξτυζΩ.i(var3, c<"㺉">(k, l));
               return;
            }

            var7 = var9 != null ? new νμηαΣεφη(var9) : null;
         } else {
            var7 = null;
         }

         var1.setCancelled((boolean)m);
         αδοβτΣσΠμμχοΨ.a(this.b).b((boolean)n).a(() -> {
            try {
               if (!var4.isOpen() || !var4.isActive()) {
                  return;
               }

               this.a(var3, var4, var6, var7, var2);
            } catch (Throwable var8x) {
               αυμξτυζΩ.i(var3, c<"㺀">(do & dp, dq));
               ψΓωτιμωκχψΛΨ.c(c<"㺃">(dr, ds) + var5 + c<"㺆">(dt & du, dv), var8x);
            }
         });
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 22L;
      var1 ^= 2437898435453971826L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(23 + 46),
                     (byte)(29 + 54),
                     (byte)(7 + 40),
                     (byte)(6 + 61),
                     (byte)(35 + 31),
                     (byte)(49 + 18),
                     (byte)(20 + 27),
                     (byte)(40 + 40),
                     (byte)(34 + 41),
                     (byte)(24 + 43),
                     83,
                     (byte)(8 + 45),
                     (byte)(6 + 74),
                     (byte)(69 + 28),
                     (byte)(55 + 45),
                     (byte)(13 + 87),
                     (byte)(18 + 87),
                     (byte)(63 + 47),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(21 + 48), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χΠξΦιζΨΣωΦσΨζ.A("ĨĵĴ÷ķĳĮķłıþļŀĹļłĄҌҖғҠѭҚҢҠҝҙҟҝҢ", (byte)35, 65));
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
