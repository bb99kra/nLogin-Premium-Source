package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_167 implements NLoginInterface_007 {
   private static long ap = Long.reverse(490879470756821575L);
   private static long fu = Long.reverse(5246680677260065351L);
   private static int db = Integer.reverse(-402653184);
   private static int ek = 0 >>> 106 | 0 << -106;
   private static int ha = 0 >>> 105 | 0 << ~105 + 1;
   private static int ea = -1 >>> 122 | -1 << ~122 + 1;
   private static long gj = Long.reverse(5246680677260065351L);
   private static int fs = (0 >>> 82 | 0 << -82) & -1;
   private static int dp = (200 >>> 67 | 200 << -67) & -1;
   private static int hf = Integer.reverse(872415232);
   private static int gy = 1342177281 >>> 59 | 1342177281 << -59;
   private static int ck = Integer.reverse(0);
   private static int ec = (0 >>> 143 | 0 << ~143 + 1) & -1;
   private static int as = Integer.reverse(805306368);
   private static long m = Long.reverse(5620492334958379008L);
   private static long t = Long.reverse(5620492334958379008L);
   private static long ag = Long.reverse(5246680677260065351L);
   private static int ff = Integer.reverse(Integer.MIN_VALUE);
   private static int bn = (163840 >>> 14 | 163840 << -14) & -1;
   private static int dk = 8 >>> 194 | 8 << -194;
   private static int bz = 272 >>> 36 | 272 << ~36 + 1;
   private static long l = Long.reverse(5246680677260065351L);
   private static int bx = Integer.reverse(0);
   private static int k = Integer.reverse(-1073741824);
   private static int i = (8 >>> 194 | 8 << ~194 + 1) & -1;
   public static final NLoginCore_167 a = new NLoginCore_167();
   private static int gt = (0 >>> 146 | 0 << -146) & -1;
   private static int gh = 12288 >>> 76 | 12288 << -76;
   private static long dx = Long.reverse(5620492334958379008L);
   private static int aq = Integer.reverse(0);
   private static long ev = Long.reverse(490879470756821575L);
   private static int cr = 1 >>> 192 | 1 << -192;
   private static long bv = Long.reverse(5620492334958379008L);
   private static long ah = Long.reverse(5620492334958379008L);
   private static int av = (0 >>> 144 | 0 << ~144 + 1) & -1;
   private static long cz = Long.reverse(490879470756821575L);
   private static long f = Long.reverse(5246680677260065351L);
   private static int bi = Integer.reverse(-1610612736);
   private static long eb = Long.reverse(490879470756821575L);
   private static int ds = Integer.reverse(1476395008);
   private static int r = Integer.reverse(-1610612736);
   private static long fn = Long.reverse(5246680677260065351L);
   private static int gc = Integer.reverse(1073741824);
   private static int gi = (624 >>> 228 | 624 << ~228 + 1) & -1;
   private static long ce = Long.reverse(5620492334958379008L);
   private static int bq = Integer.reverse(-1);
   private static int eu = '耀' >>> 170 | 32768 << -170;
   private static int cy = (1441792 >>> 176 | 1441792 << -176) & -1;
   private static int fe = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << ~191 + 1) & -1;
   private static int gu = Integer.reverse(-1811939328);
   private static int ae = Integer.reverse(0);
   private static long gs = Long.reverse(490879470756821575L);
   private static int dv = -1342177279 >>> 156 | -1342177279 << ~156 + 1;
   private static int cp = 0 >>> 103 | 0 << ~103 + 1;
   private static int hb = (688 >>> 68 | 688 << ~68 + 1) & -1;
   private static int cv = ('ꠀ' >>> 'K' | 43008 << -75) & -1;
   private static int em = Integer.reverse(1073741824);
   private static long j = Long.reverse(490879470756821575L);
   private static int u = 0 >>> 229 | 0 << ~229 + 1;
   private static int ee = Integer.reverse(-1);
   private static long s = Long.reverse(5246680677260065351L);
   private static int ci = (-1 >>> 98 | -1 << ~98 + 1) & -1;
   private static int cc = 4608 >>> 136 | 4608 << ~136 + 1;
   private static int af = 36 >>> 226 | 36 << ~226 + 1;
   private static long d = Long.reverse(5620492334958379008L);
   private static long p = Long.reverse(490879470756821575L);
   private static long g = Long.reverse(5620492334958379008L);
   private static long ei = Long.reverse(5620492334958379008L);
   private static int en = (6291456 >>> 53 | 6291456 << ~53 + 1) & -1;
   private static int ao = (-1 >>> 192 | -1 << ~192 + 1) & -1;
   private static int dm = Integer.reverse(536870912);
   private static int cq = Integer.reverse(0);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = Integer.reverse(-805306368);
   private static int bk = Integer.reverse(-536870912);
   private static int gl = 0 >>> 202 | 0 << ~202 + 1;
   private static long ax = Long.reverse(5246680677260065351L);
   private static int gd = Integer.reverse(0);
   private static long dg = Long.reverse(490879470756821575L);
   private static long al = Long.reverse(5620492334958379008L);
   private static int ew = (2112 >>> 198 | 2112 << ~198 + 1) & -1;
   private static int fh = Integer.reverse(Integer.MIN_VALUE);
   private static long cw = Long.reverse(5246680677260065351L);
   private static long dt = Long.reverse(5246680677260065351L);
   private static long fr = Long.reverse(490879470756821575L);
   private static long er = Long.reverse(5246680677260065351L);
   private static int an = (44 >>> 66 | 44 << ~66 + 1) & -1;
   private static int fk = Integer.reverse(Integer.MIN_VALUE);
   private static int aw = (851968 >>> 208 | 851968 << -208) & -1;
   private static int gm = Integer.reverse(0);
   private static int bp = Integer.reverse(-268435456);
   private static long ac = Long.reverse(5246680677260065351L);
   private static int cl = (671088640 >>> 217 | 671088640 << -217) & -1;
   private static int gb = 134217728 >>> 251 | 134217728 << -251;
   private static int de = (1536 >>> 166 | 1536 << ~166 + 1) & -1;
   private static long hc = Long.reverse(490879470756821575L);
   private static int gx = 0 >>> 163 | 0 << -163;
   private static long gw = Long.reverse(5620492334958379008L);
   private static int bs = 0 >>> 123 | 0 << -123;
   private static int da = 0 >>> 161 | 0 << ~161 + 1;
   private static long b = Long.reverse(5246680677260065351L);
   private static long du = Long.reverse(5620492334958379008L);
   private static int bc = Integer.reverse(805306368);
   private static int go = Integer.reverse(0);
   private static int ct = (4 >>> 130 | 4 << -130) & -1;
   private static long cm = Long.reverse(5246680677260065351L);
   private static int gq = 320 >>> 227 | 320 << -227;
   private static int dy = (0 >>> 59 | 0 << ~59 + 1) & -1;
   private static long cx = Long.reverse(5620492334958379008L);
   private static int be = 16 >>> 196 | 16 << ~196 + 1;
   private static long gv = Long.reverse(5246680677260065351L);
   private static int bh = (64 >>> 228 | 64 << -228) & -1;
   private static int fa = Integer.reverse(0);
   private static int he = Integer.reverse(0);
   private static int dz = Integer.reverse(939524096);
   private static int fb = (262144 >>> 114 | 262144 << -114) & -1;
   private static int bl = 524288 >>> 80 | 524288 << ~80 + 1;
   private static int cf = Integer.reverse(-1073741824);
   private static int eo = 0 >>> 52 | 0 << -52;
   private static long ey = Long.reverse(5620492334958379008L);
   private static int ch = (76 >>> 162 | 76 << ~162 + 1) & -1;
   private static int et = Integer.reverse(0);
   private static long cn = Long.reverse(5620492334958379008L);
   private static long br = Long.reverse(490879470756821575L);
   private static int df = (-1 >>> 221 | -1 << ~221 + 1) & -1;
   private static long gk = Long.reverse(5620492334958379008L);
   private static int dh = Integer.reverse(-1610612736);
   private static int by = (67108864 >>> 90 | 67108864 << -90) & -1;
   private static long fx = Long.reverse(5246680677260065351L);
   private static long fo = Long.reverse(5620492334958379008L);
   private static int fp = (70 >>> 129 | 70 << ~129 + 1) & -1;
   private static int bd = 0 >>> 62 | 0 << -62;
   private static long ay = Long.reverse(5620492334958379008L);
   private static int eq = (1984 >>> 102 | 1984 << -102) & -1;
   private static int di = Integer.reverse(0);
   private static int bf = (134217728 >>> 90 | 134217728 << -90) & -1;
   private static int bm = (2359296 >>> 18 | 2359296 << -18) & -1;
   private static long hg = Long.reverse(5246680677260065351L);
   private static int fd = (100663296 >>> 249 | 100663296 << -249) & -1;
   private static int ep = 4194304 >>> 214 | 4194304 << -214;
   private static long ca = Long.reverse(490879470756821575L);
   private static int ge = Integer.reverse(Integer.MIN_VALUE);
   private static int ft = Integer.reverse(603979776);
   private static long bb = Long.reverse(5620492334958379008L);
   private static int dn = Integer.reverse(Integer.MIN_VALUE);
   private static int hd = 64 >>> 70 | 64 << -70;
   private static int ej = Integer.reverse(536870912);
   private static long fy = Long.reverse(5620492334958379008L);
   private static int v = (1572864 >>> 242 | 1572864 << ~242 + 1) & -1;
   private static int cu = 0 >>> 106 | 0 << ~106 + 1;
   private static int fq = -1 >>> 167 | -1 << ~167 + 1;
   private static long gg = Long.reverse(490879470756821575L);
   private static int fi = Integer.reverse(0);
   private static int q = Integer.reverse(0);
   private static int fm = Integer.reverse(1140850688);
   private static int var_do = Integer.reverse(0);
   private static long c;
   private static int o = 1 >>> 62 | 1 << ~62 + 1;
   private static int hj = 92160 >>> 171 | 92160 << -171;
   private static int h = 0 >>> 125 | 0 << ~125 + 1;
   private static int a = (0 >>> 94 | 0 << ~94 + 1) & -1;
   private static long ad = Long.reverse(5620492334958379008L);
   private static long ef = Long.reverse(490879470756821575L);
   private static int dl = 24576 >>> 13 | 24576 << ~13 + 1;
   private static int z = (896 >>> 39 | 896 << -39) & -1;
   private static long gz = Long.reverse(490879470756821575L);
   private static int cg = Integer.reverse(0);
   private static int el = Integer.reverse(Integer.MIN_VALUE);
   private static int cs = Integer.reverse(0);
   private static long bu = Long.reverse(5246680677260065351L);
   private static long cd = Long.reverse(5246680677260065351L);
   private static int bw = (2048 >>> 233 | 2048 << -233) & -1;
   private static int eg = Integer.reverse(2013265920);
   private static long ex = Long.reverse(5246680677260065351L);
   private static int ab = 128 >>> 132 | 128 << ~132 + 1;
   private static long dw = Long.reverse(5246680677260065351L);
   private static int y = Integer.reverse(0);
   private static long dq = Long.reverse(5246680677260065351L);
   private static int am = 0 >>> 76 | 0 << ~76 + 1;
   private static long aa = Long.reverse(490879470756821575L);
   private static long hh = Long.reverse(5620492334958379008L);
   private static long eh = Long.reverse(5246680677260065351L);
   private static int ai = 0 >>> 222 | 0 << -222;
   private static long dd = Long.reverse(5620492334958379008L);
   private static long x = Long.reverse(5620492334958379008L);
   private static long cj = Long.reverse(490879470756821575L);
   private static int ez = Integer.reverse(536870912);
   private static int fg = 1024 >>> 169 | 1024 << -169;
   private static int aj = Integer.reverse(1342177280);
   private static int bt = Integer.MIN_VALUE >>> 27 | Integer.MIN_VALUE << ~27 + 1;
   private static long fv = Long.reverse(5620492334958379008L);
   private static int bg = (100663296 >>> 25 | 100663296 << -25) & -1;
   private static long au = Long.reverse(5620492334958379008L);
   private static int co = Integer.reverse(1073741824);
   private static int fw = Integer.reverse(-1543503872);
   private static int cb = (262144 >>> 17 | 262144 << ~17 + 1) & -1;
   private static int ga = (0 >>> 223 | 0 << ~223 + 1) & -1;
   private static int gr = Integer.reverse(-1);
   private static long w = Long.reverse(5246680677260065351L);
   private static int n = Integer.reverse(0);
   private static String[] b = new String[hj];
   private static int fc = Integer.reverse(1073741824);
   private static int az = Integer.reverse(1879048192);
   private static int gf = Integer.reverse(1677721600);
   private static int fl = Integer.reverse(0);
   private static String[] a = new String[NLoginCore_167.hi];
   private static int ed = Integer.reverse(-1207959552);
   private static int hi = Integer.reverse(-1275068416);
   private static long at = Long.reverse(5246680677260065351L);
   private static int gn = (0 >>> 187 | 0 << -187) & -1;
   private static int dj = 512 >>> 233 | 512 << ~233 + 1;
   private static int gp = 0 >>> 36 | 0 << -36;
   private static int fj = Integer.reverse(-1073741824);
   private static int fz = Integer.reverse(1073741824);
   private static long es = Long.reverse(5620492334958379008L);
   private static int ar = (0 >>> 203 | 0 << ~203 + 1) & -1;
   private static long ak = Long.reverse(5246680677260065351L);
   private static long ba = Long.reverse(5246680677260065351L);
   private static long dc = Long.reverse(5246680677260065351L);
   private static long dr = Long.reverse(5620492334958379008L);
   private static int bj = (24 >>> 226 | 24 << ~226 + 1) & -1;

   @Override
   public void a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      NLoginCore_270 var4 = new NLoginCore_270();
      if (NLoginCore_150.j()) {
         NLoginCore_370.c(a(e, f ^ g));
         NLoginCore_370.c(a(i, j) + this.q() + a(k, l ^ m));
         NLoginCore_370.c(a(o, p));
         NLoginCore_370.c(a(r, s ^ t));
      } else {
         NLoginCore_370.c(a(v, w ^ x));
         NLoginCore_370.c(a(z, aa) + this.q() + a(ab, ac ^ ad));
         NLoginCore_370.c(a(af, ag ^ ah));
         NLoginCore_370.c(a(aj, ak ^ al));
      }

      NLoginCore_370.c(a(an & ao, ap));
      String var5 = NLoginCore_477.e.a(new Object[ar]);
      String var6 = var5 + a(as, at ^ au);
      this.a(var3, var5, var6);

      try {
         var2.a((boolean)av);
      } catch (Exception var24) {
         if (var24.getMessage().contains(a(aw, ax ^ ay)) && var24.getMessage().contains(a(az, ba ^ bb))) {
            return;
         }

         throw var24;
      }

      String[] var10000 = new String[bc];
      var10000[bd] = NLoginCore_436.a.getName();
      var10000[be] = NLoginCore_436.b.getName();
      var10000[bf] = NLoginCore_436.c.getName();
      var10000[bg] = NLoginCore_436.d.getName();
      var10000[bh] = NLoginCore_436.e.getName();
      var10000[bi] = NLoginCore_436.f.getName();
      var10000[bj] = NLoginCore_436.g.getName();
      var10000[bk] = NLoginCore_436.h.getName();
      var10000[bl] = NLoginCore_436.i.getName();
      var10000[bm] = NLoginCore_436.j.getName();
      var10000[bn] = NLoginCore_436.k.getName();
      var10000[bo] = NLoginCore_436.l.getName();
      String[] var7 = var10000;
      NLoginCore_370.c(a(bp & bq, br));
      String var10001 = a(bt, bu ^ bv);
      Object[] var10002 = new Object[bw];
      var10002[bx] = var5;
      var10002[by] = String.join(a(bz, ca), var7);
      var10002[cb] = String.join(a(cc, cd ^ ce), var7);
      var10002[cf] = var6;
      var3.a(String.format(var10001, var10002));
      NLoginCore_370.c(a(ch & ci, cj));
      var10001 = a(cl, cm ^ cn);
      var10002 = new Object[co];
      var10002[cp] = NLoginCore_477.r.a(new Object[cq]);
      var10002[cr] = NLoginCore_477.t.a(new Object[cs]);
      var10001 = String.format(var10001, var10002);
      var10002 = new Object[ct];
      var10002[cu] = a(cv, cw ^ cx);
      var3.a(var10001, var10002);
      NLoginCore_370.c(a(cy, cz));
      var10001 = a(db, dc ^ dd) + var5 + a(de & df, dg);
      var10002 = new Object[dh];
      var10002[di] = NLoginCore_436.f.getName();
      var10002[dj] = NLoginCore_436.c.getName();
      var10002[dk] = NLoginCore_436.d.getName();
      var10002[dl] = NLoginCore_436.e.getName();
      var10002[dm] = NLoginCore_436.f.getName();
      var10001 = String.format(var10001, var10002);
      var10002 = new Object[dn];
      var10002[var_do] = a(dp, dq ^ dr);
      Integer var8 = var3.b(var10001, var10002).d();
      NLoginCore_370.c(a(ds, dt ^ du) + NLoginCore_112.d(var8.intValue()) + a(dv, dw ^ dx));
      NLoginCore_370.c(a(dz & ea, eb));
      HashMap var9 = new HashMap();
      var10001 = a(ed & ee, ef) + var5 + a(eg, eh ^ ei);
      var10002 = new Object[ej];
      var10002[ek] = NLoginCore_436.c.getName();
      var10002[el] = NLoginCore_436.c.getName();
      var10002[em] = NLoginCore_436.c.getName();
      var10002[en] = NLoginCore_436.c.getName();
      NLoginCore_171 var10 = var3.a(String.format(var10001, var10002));

      try {
         ResultSet var11 = var10.d();

         while (var11.next()) {
            var9.computeIfAbsent(var11.getString(ep), var0 -> new ArrayList());
         }
      } catch (Throwable var27) {
         if (var10 != null) {
            try {
               var10.close();
            } catch (Throwable var23) {
               var27.addSuppressed(var23);
            }
         }

         throw var27;
      }

      if (var10 != null) {
         var10.close();
      }

      NLoginCore_370.c(a(eq, er ^ es));
      Connection var28 = var3.a();
      PreparedStatement var29 = null;

      try {
         for (String var14 : new HashSet(var9.keySet())) {
            var10001 = a(eu, ev) + var5 + a(ew, ex ^ ey);
            var10002 = new Object[ez];
            var10002[fa] = NLoginCore_436.a.getName();
            var10002[fb] = NLoginCore_436.d.getName();
            var10002[fc] = NLoginCore_436.e.getName();
            var10002[fd] = NLoginCore_436.c.getName();
            var29 = var28.prepareStatement(String.format(var10001, var10002));
            var29.setString(fe, var14);
            ResultSet var15 = var29.executeQuery();

            while (var15.next()) {
               List var16 = var9.computeIfAbsent(var14, var0 -> new ArrayList());
               var16.add(
                  new NLoginCore_062(var15.getLong(ff), (boolean)(var15.getString(fg) != null ? fh : fi), (boolean)(var15.getString(fj) != null ? fk : fl), null)
               );
            }

            var29.close();
            var29 = null;
         }
      } catch (SQLException var25) {
         throw var25;
      } finally {
         if (var29 != null) {
            var29.close();
         }

         var3.a(var28);
      }

      NLoginCore_370.c(a(fm, fn ^ fo) + NLoginCore_112.d(var9.size()) + a(fp & fq, fr));

      label178:
      for (List var31 : var9.values()) {
         Long var32 = null;

         for (NLoginCore_062 var34 : var31) {
            if (NLoginCore_062.a(var34)) {
               break label178;
            }

            if (!NLoginCore_062.b(var34)) {
               if (var32 != null) {
                  break label178;
               }

               var32 = NLoginCore_062.a(var34);
            }
         }

         if (var32 != null) {
            var10001 = a(ft, fu ^ fv) + var5 + a(fw, fx ^ fy);
            var10002 = new Object[fz];
            var10002[ga] = NLoginCore_436.c.getName();
            var10002[gb] = NLoginCore_436.a.getName();
            var10001 = String.format(var10001, var10002);
            var10002 = new Object[gc];
            var10002[gd] = null;
            var10002[ge] = var32;
            var3.a(var10001, var10002);
         }
      }

      NLoginCore_370.c(a(gf, gg) + var4.a(TimeUnit.SECONDS, gh) + a(gi, gj ^ gk));
   }

   private static void b() {
      c = -2134777120898944238L;
      long var0 = c ^ 4378229835485194645L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(7 + 62),
               (byte)(68 + 15),
               (byte)(5 + 42),
               (byte)(64 + 3),
               66,
               (byte)(49 + 18),
               (byte)(23 + 24),
               (byte)(71 + 9),
               (byte)(67 + 8),
               (byte)(66 + 1),
               (byte)(36 + 47),
               (byte)(48 + 5),
               (byte)(57 + 23),
               (byte)(3 + 94),
               (byte)(47 + 53),
               100,
               (byte)(33 + 72),
               (byte)(44 + 66),
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.B("ŀĿŠĦĳħŪĨŃķŌĬřīūĿŪţĨŊůłŗŸŹőŮŪŋŕƀő", (byte)54, 66);
               b[1] = NLoginCore_397.B("ğİĳĸŖňţŠńśŊĳ", (byte)54, 66);
               b[2] = NLoginCore_433.F("ՃԞ՚ՂՅթ՟եՌԪԲԬՋՎըՃՔՄջչմտլ\u0558ԵԻ\u0557ցհճդժժչՄչ֍՜֍ՒթժհՍր֓գՖ֓\u0590֗է֔Ւց֔՟֔կ֏֨֩յ՜մ֢օլ֍ւ֥֊րճ֣պ", (byte)54, 70);
               b[3] = NLoginCore_427.B("ĖļįťŘũŧĦħīĺĳ", (byte)54, 66);
               b[4] = NLoginCore_471.F(
                  "ԣԩՊ՛ԹէԽՂհՍՃշՃՕՌ՚եըջճջԹԹՁի\u0558կՐրՔՈՂՔբզՍօլռՋֈկտխբ֘ՑՓշըՖՔռմն֔ՙվջծճզֆզ\u058cչէ֜։\u0590֦֢֯֒֨ճ֤֭֗նֶֺշֺ֚֊\u058cְִֻ֔օ֣֤֠֟", (byte)54, 70
               );
               b[5] = NLoginCore_173.E("ԦԷԺԿ՝ՏժէՋբՑԺ", (byte)54, 69);
               b[6] = NLoginCore_446.B("ğİĳĸŖňţŠńśŊĳ", (byte)54, 66);
               b[7] = NLoginCore_004.C("ҞҤӈҰӁӎҟӍӀҐҲҵӒӐҐӏӛҽҾңӚүҷӟӇӚҡӘӚҟӫӘӅӮӏӲӄөҾӠүҴӤӼӌӜҸӬӴӿԃԁӾәӵӄӁӴӥԃӺӮӟԈ", (byte)54, 67);
               b[8] = NLoginCore_530.C("҂ҨқӑӄӕӓҒғҗҦҟ", (byte)54, 67);
               b[9] = NLoginCore_201.E(
                  "ԳՅ\u0557ԮՀգ\u0530ՌՁեթՃեՓԹծՑՆՍՊձժՑռՖՌխկւ՞Ք\u0558՝Չ՜ռփգփ՚՛ժ֖ՠխմճբև֏Փջ\u058cը֒ՙ՚Ֆր֦֝֠՛զֆբջ\u058b֛֘֟լֆտֹ֤֥֮շ֑ձ֪֬֯տֈօֆ", (byte)54, 69
               );
               b[10] = NLoginCore_521.A("ğİĳĸŖňţŠńśŊĳ", (byte)54, 65);
               b[11] = NLoginCore_027.F("ԴԢթգ՟Ո՟ՌԭԮՒՓոկԴշ՚Իետլսհ՛դԽնծԽհ՜է", (byte)54, 70);
               b[12] = NLoginCore_553.F("ԣՍ՞կՃձԱղՅկէԺ", (byte)54, 70);
               b[13] = NLoginCore_241.C("ҞҩӓҾҡҤҩӈғҕґҟ", (byte)54, 67);
               b[14] = NLoginCore_004.D("ҚӐӇ҉ҋӏґҗӆҲӍӜӈҬӝӘӟӕҪүҹӓҪҫ", (byte)54, 68);
               b[15] = NLoginCore_521.B("ťĮŝŗŃĠŜņŖūŌũŌŮĭŦŏĳŞœŒİķķŰĳŏŴĹŘŖŒ", (byte)54, 66);
               b[16] = NLoginCore_553.B("ŠŒŢĺĳĹĸīĸĿĦŦŭšŮĥŉĲŦūŰŭĶķŹŲŞōųŜŪōŌŽżŜŨŤŴƅśŕŇƊŎŤƈŎŏŔžŦƕŷŦœŤœƓŸƋƝŪų", (byte)54, 66);
               b[17] = NLoginCore_521.F("բԼՍ՛աԻԱՌղՄԽԺ", (byte)54, 70);
               b[18] = NLoginCore_559.C("ӇҡҲӀӆҠҖұӗҩҢҟ", (byte)54, 67);
               b[19] = NLoginCore_241.C("ҚӎӑұӒӑңҳҴҦӛӛһӈӉһӀҿӋӖҜүӕҙӒҥӤҪҾӍӋӪ", (byte)54, 67);
               b[20] = NLoginCore_004.D("ӍҿҩґҊҏҤҰӉӏҶӆӇҧӚҸӒӍӂӎҚӖӂӅҢӧӪҤҷӃӜӋӥӥӤӜӎҲӟұӬҰӂҿ", (byte)54, 68);
               b[21] = NLoginCore_559.F("ԻթդդԬՠՎՋՒըՐխՠճճՐՙՅկոԿվՅՆ", (byte)54, 70);
               b[22] = NLoginCore_183.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸŔŦńůŬſŶŽŌŪřƁŀƆŧŲńƊŔƅŉƀœ", (byte)54, 65);
               b[23] = NLoginCore_433.E("ը՚ՄԬԥԪԿՋդժՔՌՁոլՅՋՉձՕԵվՅՆ", (byte)54, 69);
               b[24] = NLoginCore_201.C(
                  "ӂҥӀҫӌӇӑҟҕҵҹӊӎҰәҳҰҭҪҴӜӚҹӚӒӉӆңөӮӦҦӯӍҩӫӝөҨүӣӫӺҺәӓӌӯӑӮӳӖӛԄԆӲӺӕӞӤӠҿӨӏԂӜԋӋԉӫԆӓԑӯӴԕԐӏԜӧԛӡӳӶԔӠԖӰӿӳԟӼԢӬӶԈԂԣӪӥԅԨԕԓԵӷԆԹԐԫԉԘԨԖԚԻԿԝԊԋ", (byte)54, 67
               );
               b[25] = NLoginCore_183.F("ԴԴՖԽ\u0558Կԩբ՞հԯմԵշՎՂՅՌյյկվՅՆ", (byte)54, 70);
               b[26] = NLoginCore_324.D("ӐҟҮҭӅҵӔӊҎүӆӔӍӜәҪӚҳӁҰӖҭҪҫ", (byte)54, 68);
               b[27] = NLoginCore_092.E("ԧԪբժԪԫըԻմՓՆՈյճչճԳՎկջՌԻշՙլչֆԾռՒֈի", (byte)54, 69);
               b[28] = NLoginCore_091.C("҆ӎҏӇӃӏҟӑӌӕӎӏҴҴҿқӏҶӠҚңӍҟҾӔӆҳӆҩӊӧӐҭҿһҽӍӝӭӍӳҴӸҿ", (byte)54, 67);
               b[29] = NLoginCore_027.D("ҊүқҥӕҵӋґґӖӍҒҮӜҗҸүӔҼӣҜҵӝҧҦҢӇӤҿҨҿӦӉҮӍӏӑӐӍӐӇҹұҿ", (byte)54, 68);
               b[30] = NLoginCore_451.E("եԽԭՊ՜՞Թԩ\u0530Ջԭ\u0557յՄձի՚կոՐէմջաԻՓԼՐՀտՇեթնօ՝֍՛իծ\u058cրիգդ֊֒֊֒։ՙվ֙ոեզ", (byte)54, 69);
               b[31] = NLoginCore_387.F("ԡթԪբ՞ժԺլէհթժՏՏ՚ԶժՑջԵԾըԺՙկաՎաՄեւի֊բքա՞է֑ՋՅ֍ճ֓\u058cժն֘ձէ֎ՙֈըեզ", (byte)54, 70);
               b[32] = NLoginCore_427.E("ԥՊԶՀհՐզԬԬձթՇնմՆՑԹ՚հՋՠՏՋՓՐճՀփջ՛ղոՄռնծչծկ։բցՌ՚", (byte)54, 69);
               b[33] = NLoginCore_138.E("ՅՙԭՇըձԧ՚ՎՄզԴՈՊՉՋճՙ\u0557՟Ռ\u0558ՅՆ", (byte)54, 69);
               b[34] = NLoginCore_530.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸřŗŏũĻũŘŌūźźŝŰŕŻśŦƃňƃŝŖœ", (byte)54, 65);
               b[35] = NLoginCore_427.B("ĖļįťŘũŧĦħīĺĳ", (byte)54, 66);
               b[36] = NLoginCore_183.B("ŤŜĥŒťķĶĵĤłĹŏŠūĲőŢŶŠŰĲŷľĿ", (byte)54, 66);
               b[37] = NLoginCore_453.B("ţĤţœŖĥĩŌļŠŤĽĪŉŁŤŔŏŇŭšŷŤķżņŸōŐƂŵųŗĻƅŁŧżŜƌŃƃŚœ", (byte)54, 66);
               b[38] = NLoginCore_397.C("ҺӃӆӎҍҿҿӊҷӇҕҸҷҔҗӈӉӌҵҮӝҹҲҹҤҿӔӁҤҧӜӚ", (byte)54, 67);
               b[39] = NLoginCore_575.B("ĳĿŁŦĽĴŘŗĴĦŘĳ", (byte)54, 66);
               b[40] = NLoginCore_559.A("ĜņŗŨļŪĪūľŨŠĳ", (byte)54, 65);
               b[41] = NLoginCore_471.E("զ՛Ԥ՛ԾձՏԱԽէՖՆԩՖԳՅղԴ՝խղ\u0558ՅՆ", (byte)54, 69);
               b[42] = NLoginCore_241.B("ŖĹŔĿŠśťĳĩŉŌįŢłŢŔőŭŕőŹŁľĿ", (byte)54, 66);
               b[43] = NLoginCore_027.A("ĻĺŔŝŉťťŢŀĸŨĳ", (byte)54, 65);
               b[44] = NLoginCore_027.A("ĴŢŝŝĥřŇńŋšŉŦřŬŬŉŒľŨűĸŷľĿ", (byte)54, 65);
               break;
            case 1:
               b[0] = NLoginCore_384.D("ҬҫӌҒҟғӖҔүңҸҘӅҗӗҫӖӏҔҶӛҵӓәӜҦӡӦӉҥӡӨ", (byte)54, 68);
               b[1] = NLoginCore_141.D("ӈүҰӊҎӏғҴӕәӄҟ", (byte)54, 68);
               b[2] = NLoginCore_201.E("ՃԞ՚ՂՅթ՟եՌԪԲԬՋՎըՃՔՄջչմտլ\u0558ԵԻ\u0557ցհճդժժչՄչ֍՜֍ՒթժհՍր֓գՖ֓\u0590֗է֔Ւց֔՟֔կ֏֨֩յ՜ր։֧֛ևֈրְְ֧սպ", (byte)54, 69);
               b[3] = NLoginCore_092.C("ҿҤҟңҤңҟӘӅҨҕҟ", (byte)54, 67);
               b[4] = NLoginCore_076.C("҈ҎүӀҞӌҢҧӕҲҨӜҨҺұҿӊӍӠӘӠҞҞҦӐҽӔҵӥҹҭҧҹӇӋҲӪӑӡҰӭӔӤӒӇӽҶҸӜӍһҹӡәӛӹҾӣӠӓӘӋӫӋӱӞӌԁӮӵԔԋӷԍԇӘԉԒӼӛԛԟӜӿԟӯԕԀԉӸԧԠԈԃԉԈ", (byte)54, 67);
               b[5] = NLoginCore_173.B("ıėĝķģŀťĢŇłľĳ", (byte)54, 66);
               b[6] = NLoginCore_397.D("ҊӃҽҤҋӊӍҕҪӌҕҟ", (byte)54, 68);
               b[7] = NLoginCore_091.D("ҞҤӈҰӁӎҟӍӀҐҲҵӒӐҐӏӛҽҾңӚүҷӟӇӚҡӘӚҟӫӘӅӮӏӲӄөҾӠүҴӤӼӌӜҸӬӴӿԃԁӾӐӼӞӧӡԇӝӌӖӼӥ", (byte)54, 68);
               b[8] = NLoginCore_530.C("ҡҤӈӍӄӈҲӐұәӐҟ", (byte)54, 67);
               b[9] = NLoginCore_173.F(
                  "ԳՅ\u0557ԮՀգ\u0530ՌՁեթՃեՓԹծՑՆՍՊձժՑռՖՌխկւ՞Ք\u0558՝Չ՜ռփգփ՚՛ժ֖ՠխմճբև֏Փջ\u058cը֒ՙ՚Ֆր֦֝֠՛զֆբջ\u058b֛֘֟լֆտ֤վֈֈճօջֱ֛֛֫ո֢֏׀ֵ֥֤֙׆ֿր", (byte)54, 70
               );
               b[10] = NLoginCore_127.B("ōĭťŜņŉŇĪŅŊŠĳ", (byte)54, 66);
               b[11] = NLoginCore_446.D("ҙ҇ӎӈӄҭӄұҒғҷҸӝӔҙӜҿҠӊӤӑӟҲұӢұӅҤӧӃӪӥ", (byte)54, 68);
               b[12] = NLoginCore_471.B("ťĢŚŅŞŧŨňļŘŗŉŬŊţŎŢŠūŎőŁľĿ", (byte)54, 66);
               b[13] = NLoginCore_110.E("ժՂԵթթԺՎԲժՆՀհէԲղՃԱծԯԽրՈՅՆ", (byte)54, 69);
               b[14] = NLoginCore_232.D("ҚӐӇ҉ҋӏґҗӆҲӎӚӍӜҰҩҮҜҮҷӘӦҹҧҴӘҡӊҿӡӬӗ", (byte)54, 68);
               b[15] = NLoginCore_173.F("լԵդ՞ՊԧգՍ՝ղՓհՓյԴխՖԺե՚ՙԼԿ\u0558Ճպ՛ձֈէցպ", (byte)54, 70);
               b[16] = NLoginCore_453.C("ӌҾӎҦҟҥҤҗҤҫҒӒәӍӚґҵҞӒӗӜәҢңӥӞӊҹӟӈӖҹҸөӨӈӔӐӠӱӇӁҳӶҺӐӴҺһӀӪӒԁӰԅԄӠӓԂӽӞӨӥԇ", (byte)54, 67);
               b[17] = NLoginCore_027.A("ğİĻŔšĴļĵģńŀţņŜļłŒĿŬŖŗŁľĿ", (byte)54, 65);
               b[18] = NLoginCore_091.B("ķĴœĥĲŤŧŠĢĵĭĳ", (byte)54, 66);
               b[19] = NLoginCore_471.E("ԵթլՌխլԾՎՏՁննՖգդՖ՛՚զձԷՊ՞ճվՐվնղդ՜ֆ", (byte)54, 69);
               b[20] = NLoginCore_232.E("ը՚ՄԬԥԪԿՋդժՑաբՂյՓխը՝թԵձ՝ՠԽւօԿՒ՞շզգզռ՜ՙաՊ\u058bդ՞կ֊Ցյլ֕Ք\u058c֖տտըեզ", (byte)54, 69);
               b[21] = NLoginCore_027.B("ĴŢŝŝĥřŇńŋšņķŐĽűŢũŠıńłŷľĿ", (byte)54, 66);
               b[22] = NLoginCore_127.F("ԵթլՌխլԾՎՏՁնՉԮղՇզԺՋՆպԿ՛խՋնճֆսքՓձՠքխգռծվ\u058b\u058b֔ի֏֔ՖճՕն֒֘֔իի֞եզ", (byte)54, 70);
               b[23] = NLoginCore_575.F("ը՚ՄԬԥԪԿՋդժՒԨԷձյՅթիսզծմժփՑղեչռՖբգ", (byte)54, 70);
               b[24] = NLoginCore_241.C(
                  "ӂҥӀҫӌӇӑҟҕҵҹӊӎҰәҳҰҭҪҴӜӚҹӚӒӉӆңөӮӦҦӯӍҩӫӝөҨүӣӫӺҺәӓӌӯӑӮӳӖӛԄԆӲӺӕӞӤӠҿӨӏԂӜԋӋԉӫԆӓԑӯӴԕԐӏԜӧԛӡӳӶԔӠԖӰӿӳԟӼԢӬӶԈԂԣӪӥԅԨԕԓԵӷԈԋԻӸԫԨԶԻՀԞԒԳԊԋ", (byte)54, 67
               );
               b[25] = NLoginCore_446.C("ҙҙһҢҽҤҎӇӃӕҔҪӛӓӊӎүҪӠӁӔӓҪҫ", (byte)54, 67);
               b[26] = NLoginCore_141.E("իԺՉՈՠՐկեԩՊբԵՄՏոձզ՝էԵՖ\u0558ՅՆ", (byte)54, 69);
               b[27] = NLoginCore_433.F("ԧԪբժԪԫըԻմՓՆՈյճչճԳՎկջՌտլռչւ՜՜վ։ամ", (byte)54, 70);
               b[28] = NLoginCore_241.F("ԡթԪբ՞ժԺլէհթժՏՏ՚ԶժՑջԵԾըԺՙկաՎաՄեւիլդևՌլռտտվ֏տ՚", (byte)54, 70);
               b[29] = NLoginCore_127.D("ҊүқҥӕҵӋґґӖӍҒҮӜҗҸүӔҼӣҜҵӝҧҦҢӇӤҿҨҿӦүӥүӒӌӲӳӘүҴӊӧҸӌӨӯӑӋӷӢӒӳӊӋ", (byte)54, 68);
               b[30] = NLoginCore_201.D("ӊҢҒүӁӃҞҎҕҰҒҼӚҩӖӐҿӔӝҵӌәӠӆҠҸҡҵҥӤҬӊӎӛӪӂӲӀӐӓӱӥӏӆӝӧӫӔӕӜӷҵӺәӅԄӥӟԀԁӪӞӝӾ", (byte)54, 68);
               b[31] = NLoginCore_324.D("҆ӎҏӇӃӏҟӑӌӕӎӏҴҴҿқӏҶӠҚңӍҟҾӔӆҳӆҩӊӧӐӯӇөӆӃӌӶҰҪӲӖӴӼӬӪөӰӱӖӬӢӦԀӛӽӖԋӜԅӬӊӉ", (byte)54, 68);
               b[32] = NLoginCore_110.E("ԥՊԶՀհՐզԬԬձթՇնմՆՑԹ՚հՋՠՏՋՓՐճՀփջ՛ղոՄսՍպիռՎՍ\u0590Փ։ց֔նՏխՙնլ֔ՙոեզ", (byte)54, 69);
               b[33] = NLoginCore_232.A("ľŒĦŀšŪĠœŇĽŞůľŨŪŭļŖűņŋŊŧŕŋŪŽĵňŎŠŶ", (byte)54, 65);
               b[34] = NLoginCore_241.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸřŗŏũĻũŘŌūźźŔűŷņƅšƂœŴƎŷŁŞŐżƓŲŶŖƄƒƇŞş", (byte)54, 65);
               b[35] = NLoginCore_127.F("ՓՕզզՅ՝կեԫՍգԺ", (byte)54, 70);
               b[36] = NLoginCore_530.B("ŤŜĥŒťķĶĵĤłĸīŤŃĤũĪłńŇłőľĿ", (byte)54, 66);
               b[37] = NLoginCore_530.A("ţĤţœŖĥĩŌļŠŤĽĪŉŁŤŔŏŇŭšŷŤķżņŸōŐƂŵųťſŁŃŽŚƋŧŠŷŜƂŝƊŜŨŦƏŭůŎűŞş", (byte)54, 65);
               b[38] = NLoginCore_559.E("Օ՞աթԨ՚՚եՒբ\u0530ՓՒԯԲգդէՐՉո\u0557ճՑԻՁրքզավՆֈ\u0557ծգօկ֍ՠը՟Ք՚", (byte)54, 69);
               b[39] = NLoginCore_397.D("ҭҮӏҝҍҢӒӑӍҥҶҟ", (byte)54, 68);
               b[40] = NLoginCore_530.E("ԶԸԹխՐզԱժձժՒՇԩՕՐԸջՄթխճ\u0558ՅՆ", (byte)54, 69);
               b[41] = NLoginCore_446.A("şŔĝŔķŪňĪĶŠŗŮŐŊĤůĽŦŢţŮšřůŶŸĺĵŀŐŒŶ", (byte)54, 65);
               b[42] = NLoginCore_223.A("ŖĹŔĿŠśťĳĩŉōŤŘĮŤıŢŌņłŢŁľĿ", (byte)54, 65);
               b[43] = NLoginCore_446.A("řĢŤœŁŗŧģħŕĩĳ", (byte)54, 65);
               b[44] = NLoginCore_092.A("ĴŢŝŝĥřŇńŋšŇšĩľŚŴůĵţİĳŁľĿ", (byte)54, 65);
               break;
            case 2:
               b[0] = NLoginCore_201.E("ժՇԟՊՊգկԲԥՁՋծի\u0530եԸշյՅՆԶճՁ\u0557ղեշՕօՂւվ", (byte)54, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_530.D("ҾҼӎҠӈӏҨҩҢӐӈҟ", (byte)54, 68);
         }
      }
   }

   @Override
   public String q() {
      return a(a, b ^ d);
   }

   static {
      b();
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      if (NLoginCore_323.a(var3, NLoginCore_477.e.a(new Object[gm])) && NLoginCore_323.a(var3, NLoginCore_477.r.a(new Object[gn]))) {
         if (NLoginCore_323.a(var3, NLoginCore_477.e.a(new Object[gp]) + a(gq & gr, gs))) {
            return (boolean)gt;
         } else {
            String var10001 = a(gu, gv ^ gw) + NLoginCore_477.r.a(new Object[gx]) + a(gy, gz) + NLoginCore_477.t.a(new Object[ha]) + a(hb, hc);
            Object[] var10002 = new Object[hd];
            var10002[he] = a(hf, hg ^ hh);
            NLoginCore_171 var4 = var3.a(var10001, var10002);

            boolean var6;
            try {
               ResultSet var5 = var4.d();
               var6 = var5.next();
            } catch (Throwable var8) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }
               }

               throw var8;
            }

            if (var4 != null) {
               var4.close();
            }

            return var6;
         }
      } else {
         return (boolean)go;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 114L;
      var1 ^= 4378229835485194645L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(54 + 15),
                     (byte)(4 + 79),
                     47,
                     (byte)(6 + 61),
                     (byte)(23 + 43),
                     (byte)(46 + 21),
                     (byte)(36 + 11),
                     (byte)(46 + 34),
                     75,
                     (byte)(41 + 26),
                     (byte)(75 + 8),
                     (byte)(15 + 38),
                     (byte)(3 + 77),
                     (byte)(57 + 40),
                     (byte)(4 + 96),
                     (byte)(22 + 78),
                     (byte)(50 + 55),
                     (byte)(49 + 61),
                     (byte)(42 + 61)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.B("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԷ\u0530ԚԧԲԨԫԚԸ", (byte)112, 66));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_167.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.D("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 68), NLoginCore_167.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.D("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯࠈࠁ߫߸ࠃ߹\u07fc߫ࠉ҄", (byte)41, 68) + var1 + NLoginCore_553.D("Ѫ", (byte)41, 68) + var2.toString(), var4);
      }
   }
}
