package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_108 implements NLoginInterface_007 {
   private static int s = Integer.reverse(-1610612736);
   private static long ch = Long.reverse(8155830634664311920L);
   private static int fy = Integer.reverse(0);
   private static int hl = 1605632 >>> 239 | 1605632 << -239;
   private static int fo = Integer.reverse(603979776);
   private static int er = Integer.reverse(67108864);
   private static int dn = 6656 >>> 232 | 6656 << ~232 + 1;
   private static int bm = Integer.reverse(268435456);
   private static long cr = Long.reverse(8155830634664311920L);
   private static int eh = (131072 >>> 16 | 131072 << -16) & -1;
   private static int ap = 360448 >>> 79 | 360448 << ~79 + 1;
   private static long dw = Long.reverse(1382416795099085936L);
   private static int fm = '耀' >>> 'O' | 32768 << -79;
   private static int dr = (67108864 >>> 248 | 67108864 << ~248 + 1) & -1;
   private static long hi = Long.reverse(1382416795099085936L);
   private static int k = Integer.reverse(-1073741824);
   private static int b = (-1 >>> 102 | -1 << -102) & -1;
   private static int fs = 9472 >>> 232 | 9472 << ~232 + 1;
   private static int fl = Integer.reverse(1610612736);
   private static int eb = Integer.reverse(-1207959552);
   private static int v = Integer.reverse(0);
   private static long et = Long.reverse(1382416795099085936L);
   private static long dl = Long.reverse(1382416795099085936L);
   private static int r = (0 >>> 239 | 0 << ~239 + 1) & -1;
   private static int eg = 1073741824 >>> 158 | 1073741824 << ~158 + 1;
   private static long en = Long.reverse(8155830634664311920L);
   private static long eq = Long.reverse(1382416795099085936L);
   private static int dh = 234881024 >>> 153 | 234881024 << ~153 + 1;
   private static int de = (402653184 >>> 184 | 402653184 << -184) & -1;
   private static long he = Long.reverse(1382416795099085936L);
   private static long cz = Long.reverse(7061644215716937728L);
   private static int hj = Integer.reverse(0);
   private static long co = Long.reverse(7061644215716937728L);
   private static long ea = Long.reverse(7061644215716937728L);
   private static int cq = (10240 >>> 169 | 10240 << ~169 + 1) & -1;
   private static int dx = (0 >>> 204 | 0 << -204) & -1;
   private static int ei = 384 >>> 71 | 384 << -71;
   private static long dp = Long.reverse(7061644215716937728L);
   private static int em = (480 >>> 132 | 480 << ~132 + 1) & -1;
   private static long bi = Long.reverse(1382416795099085936L);
   private static int ev = (1056 >>> 5 | 1056 << -5) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_108.ho];
   private static int ct = 0 >>> 34 | 0 << ~34 + 1;
   private static int a = 0 >>> 83 | 0 << ~83 + 1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int hk = (536870912 >>> 221 | 536870912 << ~221 + 1) & -1;
   private static int bz = Integer.reverse(268435456);
   private static int eu = 0 >>> 208 | 0 << -208;
   private static long cn = Long.reverse(8155830634664311920L);
   private static int ge = 0 >>> 111 | 0 << ~111 + 1;
   private static long bk = Long.reverse(1382416795099085936L);
   private static int ck = 144 >>> 195 | 144 << -195;
   private static int gp = Integer.reverse(-738197504);
   private static int cu = -1610612734 >>> 157 | -1610612734 << -157;
   private static int ey = Integer.reverse(-536870912);
   private static long dz = Long.reverse(8155830634664311920L);
   private static long ai = Long.reverse(1382416795099085936L);
   private static long dg = Long.reverse(7061644215716937728L);
   private static int fw = Integer.reverse(0);
   private static int aa = Integer.reverse(-536870912);
   private static long aw = Long.reverse(7061644215716937728L);
   private static long ec = Long.reverse(8155830634664311920L);
   private static int ca = (294912 >>> 79 | 294912 << ~79 + 1) & -1;
   private static long gu = Long.reverse(7061644215716937728L);
   private static int gc = Integer.reverse(-469762048);
   private static long y = Long.reverse(7061644215716937728L);
   private static int ag = 0 >>> 190 | 0 << -190;
   private static long c;
   private static int aq = Integer.reverse(-1);
   private static int bq = Integer.reverse(805306368);
   private static long ar = Long.reverse(1382416795099085936L);
   private static int dj = Integer.reverse(Integer.MIN_VALUE);
   private static int fg = Integer.reverse(-1);
   private static int ee = Integer.reverse(536870912);
   private static int bb = Integer.reverse(1073741824);
   private static int dq = (3145728 >>> 212 | 3145728 << -212) & -1;
   private static int fk = Integer.reverse(-1610612736);
   private static int dm = 4194304 >>> 53 | 4194304 << -53;
   private static long cw = Long.reverse(7061644215716937728L);
   private static long gd = Long.reverse(1382416795099085936L);
   private static int au = Integer.reverse(-1342177280);
   private static int cm = Integer.reverse(-939524096);
   private static int dt = Integer.reverse(1610612736);
   private static int gz = (24117248 >>> 179 | 24117248 << -179) & -1;
   private static long gt = Long.reverse(8155830634664311920L);
   private static long m = Long.reverse(1382416795099085936L);
   private static int cp = Integer.reverse(0);
   private static long af = Long.reverse(7061644215716937728L);
   private static long cl = Long.reverse(1382416795099085936L);
   private static long var_do = Long.reverse(8155830634664311920L);
   private static int z = Integer.reverse(0);
   private static int fv = (0 >>> 235 | 0 << ~235 + 1) & -1;
   private static int hf = (0 >>> 16 | 0 << ~16 + 1) & -1;
   private static long dc = Long.reverse(8155830634664311920L);
   private static int bh = Integer.reverse(-1);
   private static int fb = 285212672 >>> 23 | 285212672 << -23;
   private static int bo = 1342177280 >>> 59 | 1342177280 << -59;
   private static int bt = (4096 >>> 139 | 4096 << ~139 + 1) & -1;
   private static long cy = Long.reverse(8155830634664311920L);
   private static int bg = 7 >>> 223 | 7 << ~223 + 1;
   private static long f = Long.reverse(8155830634664311920L);
   private static long eo = Long.reverse(7061644215716937728L);
   private static long hn = Long.reverse(1382416795099085936L);
   private static long ex = Long.reverse(7061644215716937728L);
   private static int fa = (8192 >>> 141 | 8192 << -141) & -1;
   private static int ek = Integer.reverse(Integer.MIN_VALUE);
   private static int bv = Integer.reverse(536870912);
   private static int hh = Integer.reverse(-1);
   private static int cj = Integer.reverse(0);
   private static int ad = '耀' >>> 204 | 32768 << ~204 + 1;
   private static long ed = Long.reverse(7061644215716937728L);
   private static int hc = Integer.reverse(-201326592);
   private static int bf = Integer.reverse(1610612736);
   private static int bw = 83886080 >>> 216 | 83886080 << ~216 + 1;
   private static int go = Integer.reverse(0);
   private static int bx = Integer.reverse(1610612736);
   private static int aj = Integer.reverse(0);
   private static long p = Long.reverse(8155830634664311920L);
   private static int bn = (-2147483644 >>> 95 | -2147483644 << ~95 + 1) & -1;
   private static long ac = Long.reverse(1382416795099085936L);
   private static int bp = Integer.reverse(-805306368);
   private static int bl = Integer.reverse(-536870912);
   private static long ha = Long.reverse(8155830634664311920L);
   private static long q = Long.reverse(7061644215716937728L);
   private static int ep = (31744 >>> 202 | 31744 << ~202 + 1) & -1;
   private static long dd = Long.reverse(7061644215716937728L);
   private static int h = 0 >>> 186 | 0 << -186;
   private static int es = (-1 >>> 178 | -1 << ~178 + 1) & -1;
   private static int gv = 0 >>> 199 | 0 << -199;
   private static int gx = -1 >>> 40 | -1 << ~40 + 1;
   private static int fn = Integer.reverse(0);
   private static int i = Integer.reverse(1073741824);
   private static int az = Integer.reverse(0);
   private static int ds = Integer.reverse(-1610612736);
   private static int ah = 9216 >>> 170 | 9216 << -170;
   private static int el = 16777216 >>> 119 | 16777216 << ~119 + 1;
   private static long gb = Long.reverse(1382416795099085936L);
   private static int l = (-1 >>> 62 | -1 << ~62 + 1) & -1;
   private static int di = Integer.reverse(0);
   private static long df = Long.reverse(8155830634664311920L);
   private static int dy = Integer.reverse(939524096);
   private static int gq = -1 >>> 237 | -1 << ~237 + 1;
   private static int t = Integer.reverse(-1);
   private static int al = Integer.reverse(-1);
   private static int bj = (62914560 >>> 22 | 62914560 << -22) & -1;
   private static long gg = Long.reverse(8155830634664311920L);
   private static int hd = -1 >>> 247 | -1 << -247;
   private static int bu = ('쀀' >>> 174 | 49152 << ~174 + 1) & -1;
   private static int fe = 67108864 >>> 153 | 67108864 << ~153 + 1;
   private static int hm = Integer.reverse(-1);
   private static long ae = Long.reverse(8155830634664311920L);
   private static int bs = Integer.reverse(Integer.MIN_VALUE);
   private static long u = Long.reverse(1382416795099085936L);
   private static int by = Integer.reverse(-536870912);
   private static int db = Integer.reverse(-402653184);
   private static int ef = 0 >>> 121 | 0 << ~121 + 1;
   private static int gl = -1 >>> 215 | -1 << -215;
   private static int ga = (-1 >>> 103 | -1 << -103) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_108.hp];
   private static int fx = Integer.reverse(0);
   private static long fq = Long.reverse(1382416795099085936L);
   private static long gr = Long.reverse(1382416795099085936L);
   private static int dv = -1 >>> 137 | -1 << ~137 + 1;
   public static final NLoginCore_108 a = new NLoginCore_108();
   private static int o = (4096 >>> 42 | 4096 << -42) & -1;
   private static int ff = Integer.reverse(-1006632960);
   private static int dk = (419430400 >>> 216 | 419430400 << -216) & -1;
   private static long cv = Long.reverse(8155830634664311920L);
   private static long am = Long.reverse(1382416795099085936L);
   private static long ci = Long.reverse(7061644215716937728L);
   private static long hb = Long.reverse(7061644215716937728L);
   private static int ej = 0 >>> 240 | 0 << ~240 + 1;
   private static int cd = 4 >>> 190 | 4 << -190;
   private static int ba = 131072 >>> 81 | 131072 << ~81 + 1;
   private static int fp = Integer.reverse(-1);
   private static int w = (3 >>> 223 | 3 << ~223 + 1) & -1;
   private static long cf = Long.reverse(7061644215716937728L);
   private static int hp = 409600 >>> 13 | 409600 << -13;
   private static long ce = Long.reverse(8155830634664311920L);
   private static int cb = Integer.reverse(1342177280);
   private static long gj = Long.reverse(1382416795099085936L);
   private static int bc = 3072 >>> 138 | 3072 << ~138 + 1;
   private static int gk = 352321536 >>> 23 | 352321536 << ~23 + 1;
   private static int ak = (41943040 >>> 246 | 41943040 << -246) & -1;
   private static int cx = (46137344 >>> 117 | 46137344 << ~117 + 1) & -1;
   private static int ao = 0 >>> 15 | 0 << ~15 + 1;
   private static int be = Integer.reverse(-1610612736);
   private static long at = Long.reverse(1382416795099085936L);
   private static int da = Integer.reverse(0);
   private static int as = Integer.reverse(805306368);
   private static long cs = Long.reverse(7061644215716937728L);
   private static long fc = Long.reverse(8155830634664311920L);
   private static long d = Long.reverse(1382416795099085936L);
   private static int ax = Integer.reverse(0);
   private static long fd = Long.reverse(7061644215716937728L);
   private static int br = (0 >>> 254 | 0 << ~254 + 1) & -1;
   private static int gf = (1342177280 >>> 121 | 1342177280 << -121) & -1;
   private static int ay = (24 >>> 65 | 24 << -65) & -1;
   private static int du = Integer.reverse(-671088640);
   private static int fj = (8192 >>> 139 | 8192 << -139) & -1;
   private static int cg = (268435457 >>> 124 | 268435457 << -124) & -1;
   private static long gy = Long.reverse(1382416795099085936L);
   private static long gm = Long.reverse(1382416795099085936L);
   private static int an = (0 >>> 132 | 0 << -132) & -1;
   private static int cc = Integer.reverse(-805306368);
   private static long fu = Long.reverse(7061644215716937728L);
   private static long ew = Long.reverse(8155830634664311920L);
   private static int fi = Integer.reverse(-1073741824);
   private static long g = Long.reverse(7061644215716937728L);
   private static int fz = 4980736 >>> 145 | 4980736 << -145;
   private static long ft = Long.reverse(8155830634664311920L);
   private static int gs = 360448 >>> 173 | 360448 << ~173 + 1;
   private static int bd = Integer.reverse(536870912);
   private static int n = Integer.reverse(0);
   private static int ez = (0 >>> 206 | 0 << -206) & -1;
   private static int gw = 184320 >>> 12 | 184320 << ~12 + 1;
   private static long x = Long.reverse(8155830634664311920L);
   private static int hg = 48 >>> 96 | 48 << -96;
   private static int gn = Integer.reverse(Integer.MIN_VALUE);
   private static long av = Long.reverse(8155830634664311920L);
   private static int gi = Integer.reverse(-1811939328);
   private static long fh = Long.reverse(1382416795099085936L);
   private static int ho = Integer.reverse(1275068416);
   private static long gh = Long.reverse(7061644215716937728L);
   private static int ab = Integer.reverse(-1);
   private static int fr = (786432 >>> 82 | 786432 << -82) & -1;
   private static long j = Long.reverse(1382416795099085936L);

   @Override
   public void a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      NLoginCore_270 var4 = new NLoginCore_270();
      if (NLoginCore_150.j()) {
         NLoginCore_370.c(a(e, f ^ g));
         NLoginCore_370.c(a(i, j) + this.q() + a(k & l, m));
         NLoginCore_370.c(a(o, p ^ q));
         NLoginCore_370.c(a(s & t, u));
      } else {
         NLoginCore_370.c(a(w, x ^ y));
         NLoginCore_370.c(a(aa & ab, ac) + this.q() + a(ad, ae ^ af));
         NLoginCore_370.c(a(ah, ai));
         NLoginCore_370.c(a(ak & al, am));
      }

      String var5 = NLoginCore_477.e.a(new Object[ao]);
      String var6 = NLoginCore_323.a(var3, var5, a(ap & aq, ar)) ? a(as, at) : NLoginCore_436.h.getName();
      NLoginCore_370.c(a(au, av ^ aw));
      String[] var10000 = new String[ay];
      var10000[az] = NLoginCore_436.a.getName();
      var10000[ba] = NLoginCore_436.b.getName();
      var10000[bb] = NLoginCore_436.c.getName();
      var10000[bc] = NLoginCore_436.d.getName();
      var10000[bd] = NLoginCore_436.e.getName();
      var10000[be] = NLoginCore_436.f.getName();
      var10000[bf] = NLoginCore_323.a(var3, var5, a(bg & bh, bi)) ? a(bj, bk) : NLoginCore_436.g.getName();
      var10000[bl] = var6;
      var10000[bm] = NLoginCore_436.i.getName();
      var10000[bn] = NLoginCore_436.j.getName();
      var10000[bo] = NLoginCore_436.k.getName();
      var10000[bp] = NLoginCore_436.l.getName();
      String[] var7 = var10000;
      var10000 = new String[bq];
      var10000[br] = NLoginCore_436.a.getName();
      var10000[bs] = NLoginCore_436.b.getName();
      var10000[bt] = NLoginCore_436.c.getName();
      var10000[bu] = NLoginCore_436.d.getName();
      var10000[bv] = NLoginCore_436.e.getName();
      var10000[bw] = NLoginCore_436.f.getName();
      var10000[bx] = NLoginCore_436.g.getName();
      var10000[by] = NLoginCore_436.h.getName();
      var10000[bz] = NLoginCore_436.i.getName();
      var10000[ca] = NLoginCore_436.j.getName();
      var10000[cb] = NLoginCore_436.k.getName();
      var10000[cc] = NLoginCore_436.l.getName();
      String[] var8 = var10000;
      if (var3.a() == NLoginCore_036.f) {
         var3.a(a(cd, ce ^ cf) + NLoginCore_436.b.getName() + a(cg, ch ^ ci));
         var3.a(a(ck, cl) + NLoginCore_436.g.getName() + a(cm, cn ^ co));
      }

      NLoginCore_370.c(a(cq, cr ^ cs));
      String var9 = var5 + a(cu, cv ^ cw);
      this.a(var3, var5, var9);
      var2.v();
      NLoginCore_370.c(a(cx, cy ^ cz));
      Connection var10 = var3.a();

      try {
         Statement var11 = var10.createStatement();

         try {
            if (var3.a() == NLoginCore_036.d || var3.a() == NLoginCore_036.c) {
               var11.addBatch(a(db, dc ^ dd));
            }

            String var10001 = a(de, df ^ dg);
            Object[] var10002 = new Object[dh];
            var10002[di] = var5;
            var10002[dj] = String.join(a(dk, dl), var8);
            var10002[dm] = String.join(a(dn, var_do ^ dp), var7);
            var10002[dq] = var9;
            var10002[dr] = NLoginCore_436.c.getName();
            var10002[ds] = NLoginCore_436.c.getName();
            var10002[dt] = NLoginCore_436.c.getName();
            var11.addBatch(String.format(var10001, var10002));
            var11.executeBatch();
         } catch (Throwable var20) {
            if (var11 != null) {
               try {
                  var11.close();
               } catch (Throwable var18) {
                  var20.addSuppressed(var18);
               }
            }

            throw var20;
         }

         if (var11 != null) {
            var11.close();
         }
      } catch (Throwable var21) {
         if (var10 != null) {
            try {
               var10.close();
            } catch (Throwable var17) {
               var21.addSuppressed(var17);
            }
         }

         throw var21;
      }

      if (var10 != null) {
         var10.close();
      }

      NLoginCore_370.c(a(du & dv, dw));
      HashSet var22 = new HashSet();
      long var23 = 0L;
      String var27 = a(dy, dz ^ ea) + var9 + a(eb, ec ^ ed);
      Object[] var30 = new Object[ee];
      var30[ef] = NLoginCore_436.c.getName();
      var30[eg] = NLoginCore_436.c.getName();
      var30[eh] = NLoginCore_436.c.getName();
      var30[ei] = NLoginCore_436.c.getName();
      NLoginCore_171 var13 = var3.a(String.format(var27, var30));

      try {
         for (ResultSet var14 = var13.d(); var14.next(); var23 += var14.getInt(el)) {
            var22.add(var14.getString(ek));
         }
      } catch (Throwable var19) {
         if (var13 != null) {
            try {
               var13.close();
            } catch (Throwable var16) {
               var19.addSuppressed(var16);
            }
         }

         throw var19;
      }

      if (var13 != null) {
         var13.close();
      }

      NLoginCore_370.c(a(em, en ^ eo) + NLoginCore_112.d(var22.size()) + a(ep, eq) + NLoginCore_112.d(var23 - var22.size()) + a(er & es, et));

      for (String var25 : var22) {
         var27 = a(ev, ew ^ ex);
         var30 = new Object[ey];
         var30[ez] = var5;
         var30[fa] = String.join(a(fb, fc ^ fd), var8);
         var30[fe] = String.join(a(ff & fg, fh), var7);
         var30[fi] = var9;
         var30[fj] = NLoginCore_436.c.getName();
         var30[fk] = NLoginCore_436.d.getName();
         var30[fl] = var6;
         var27 = String.format(var27, var30);
         var30 = new Object[fm];
         var30[fn] = var25;
         var3.a(var27, var30);
      }

      NLoginCore_370.c(a(fo & fp, fq) + var4.a(TimeUnit.SECONDS, fr) + a(fs, ft ^ fu));
   }

   static {
      b();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      String var4 = NLoginCore_477.e.a(new Object[fw]);
      if (!NLoginCore_323.a(var3, var4)) {
         return (fx != 0);
      } else {
         String var5 = NLoginCore_436.c.getName();
         if (!NLoginCore_323.a(var3, var4, var5)) {
            return (fy != 0);
         } else {
            switch (NLoginCore_262.m[var3.a().ordinal()]) {
               case 1:
               case 2:
                  NLoginCore_171 var19 = var3.a(a(fz & ga, gb) + var4 + a(gc, gd));

                  int var23;
                  label136: {
                     try {
                        ResultSet var20 = var19.d();

                        while (var20.next()) {
                           String var21 = var20.getString(a(gf, gg ^ gh));
                           String var22 = var20.getString(a(gi, gj));
                           if (var21.equals(var5) && !a(gk & gl, gm).equals(var22)) {
                              var23 = gn;
                              break label136;
                           }
                        }
                     } catch (Throwable var18) {
                        if (var19 != null) {
                           try {
                              var19.close();
                           } catch (Throwable var15) {
                              var18.addSuppressed(var15);
                           }
                        }

                        throw var18;
                     }

                     if (var19 != null) {
                        var19.close();
                     }

                     return (go != 0);
                  }

                  if (var19 != null) {
                     var19.close();
                  }

                  return (var23 != 0);
               case 3:
                  NLoginCore_171 var6 = var3.a(a(gp & gq, gr) + var4 + a(gs, gt ^ gu));

                  int var12;
                  label131: {
                     try {
                        ResultSet var7 = var6.d();

                        while (var7.next()) {
                           String var8 = var7.getString(a(gw & gx, gy));
                           NLoginCore_171 var9 = var3.a(a(gz, ha ^ hb) + var8 + a(hc & hd, he));

                           label133: {
                              try {
                                 ResultSet var10 = var9.d();
                                 if (!var10.next()) {
                                    break label133;
                                 }

                                 String var11 = var10.getString(a(hg & hh, hi));
                                 if (!NLoginCore_436.c.getName().equals(var11)) {
                                    break label133;
                                 }

                                 var12 = hj;
                              } catch (Throwable var16) {
                                 if (var9 != null) {
                                    try {
                                       var9.close();
                                    } catch (Throwable var14) {
                                       var16.addSuppressed(var14);
                                    }
                                 }

                                 throw var16;
                              }

                              if (var9 != null) {
                                 var9.close();
                              }
                              break label131;
                           }

                           if (var9 != null) {
                              var9.close();
                           }
                        }
                     } catch (Throwable var17) {
                        if (var6 != null) {
                           try {
                              var6.close();
                           } catch (Throwable var13) {
                              var17.addSuppressed(var13);
                           }
                        }

                        throw var17;
                     }

                     if (var6 != null) {
                        var6.close();
                     }

                     return (hk != 0);
                  }

                  if (var6 != null) {
                     var6.close();
                  }

                  return (var12 != 0);
               default:
                  throw new IllegalArgumentException(a(hl & hm, hn) + var3.a());
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_108.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.B("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 66), NLoginCore_108.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢦࢭࢪࢲࢷ\u0895ࢿࣄࢻࢸࣃࢠࢽࢼࢻԾ", (byte)40, 70) + var1 + NLoginCore_183.D("ѧ", (byte)40, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public String q() {
      return a(a & b, d);
   }

   private static void b() {
      c = 1025790249360094350L;
      long var0 = c ^ -6894119519310434806L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               (byte)(28 + 41),
               (byte)(47 + 36),
               (byte)(32 + 15),
               (byte)(22 + 45),
               (byte)(32 + 34),
               (byte)(24 + 43),
               (byte)(46 + 1),
               (byte)(37 + 43),
               (byte)(47 + 28),
               (byte)(18 + 49),
               83,
               53,
               (byte)(15 + 65),
               (byte)(61 + 36),
               (byte)(67 + 33),
               (byte)(42 + 58),
               (byte)(81 + 24),
               (byte)(72 + 38),
               (byte)(46 + 57)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.A("ŦƇƐřƊŮŪŮŕŧŮƌŐƘƓřŬƘŴŷŹƌşƓƀƤšƖŢƄŸƩ", (byte)75, 65);
               ZKM_STR_B[1] = NLoginCore_141.B("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 66);
               ZKM_STR_B[2] = NLoginCore_091.C("ӞӠԇԐӅӳԈӓӢӮԁԈԎӻӪӚӷӗӻԔӸԜԠԏԖӱԇԨӝԀԪӮԘԎӣԛԥԣԁԢԨԍԨԖԍԻԥԍӹԗӽԀԻԘՀԅԾԸՅԓԩԆՊԡՆԇԦԒԉԝԋԳՁԬԩԞ", (byte)75, 67);
               ZKM_STR_B[3] = NLoginCore_138.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
               ZKM_STR_B[4] = NLoginCore_384.E(
                  "ծՙսկ\u0558ղՁեՃփՃչթւթտֈՑա։Ցցդ֏ըփւ\u058cժՕ֚֝\u0557ՠշ֕դձ֕֨քրանոևջէփ֒թ֎ֱַ֧֨֡ձ։֭֭֬֕ոֳֺֿ֥֯֓֒֗֟֠\u05cb֠\u05c8֩֠֞\u05ccֱׅ֣\u05cfև֎ְַ֡֒לטך\u05ceן",
                  (byte)75,
                  69
               );
               ZKM_STR_B[5] = NLoginCore_521.F("ՓՑյհ՛շՐցշՁոՏ", (byte)75, 70);
               ZKM_STR_B[6] = NLoginCore_076.B("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 66);
               ZKM_STR_B[7] = NLoginCore_027.B("ņƇŮżƅųņƌŨŤŷŔƐųŧŭŴƊŬŹƑſşƀŹŠŢŢŲťƢƀŸƐƍŧƨŽƬƥƋųƃƣŲƜƴƴŽƎƽƜƙźƑƻƢơơƻǀǉƻƟ", (byte)75, 66);
               ZKM_STR_B[8] = NLoginCore_004.E("ՍծԺՙՒԿհպ՜տՒՏ", (byte)75, 69);
               ZKM_STR_B[9] = NLoginCore_076.F("ՕՁՔպՔռՔզՈ՟\u058bտպզՉիոՇՏֆծ֕։֎ևֆ։ձթ֒ը՟֛֎ժ֙չջ֡՟մնըջւո֧ռբ֏ְ֊֠֒\u058cֱ֣֙֘֯֙\u058bַּּ֧֣֙׃տֻֿ֘ր֤ցַ֥֎ׅ֪ֈֳ֢֛֭֚֝", (byte)75, 70);
               ZKM_STR_B[10] = NLoginCore_138.A("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 65);
               ZKM_STR_B[11] = NLoginCore_559.E("կտԹպՙխն՝՜ՃփՂշ։ՊլՇջ֍մօ֓՚՛", (byte)75, 69);
               ZKM_STR_B[12] = NLoginCore_138.E("կտԹպՙխն՝՜ՃփՂշ։ՊլՇջ֍մօ֓՚՛", (byte)75, 69);
               ZKM_STR_B[13] = NLoginCore_201.B("ƏŌžſƐŭƌŎŢŏƊƘŪƙŶűūşřŲŪŸŮůŢơƄƀŪŶƛƖƍƨƭŰŭƅƆƇƠƇƲŽ", (byte)75, 66);
               ZKM_STR_B[14] = NLoginCore_397.E("ՒՌԺջՃՁՏչփեՅզտօՋէՉզպձթփ՚՛", (byte)75, 69);
               ZKM_STR_B[15] = NLoginCore_451.F("ՒՌԺջՃՁՏչփեՅզտօՋէՉզպձթփ՚՛", (byte)75, 70);
               ZKM_STR_B[16] = NLoginCore_076.E("ժճՏԼձԿՠգ՟ժ՟բևե՝ջՂջՌժ՞Տտ\u0557֎ւգ\u0558խ֜ո֚", (byte)75, 69);
               ZKM_STR_B[17] = NLoginCore_451.B("ŘƉŮōƅƄŮŧƏŗŴŝ", (byte)75, 66);
               ZKM_STR_B[18] = NLoginCore_223.E("ժճՏԼձԿՠգ՟ժ՟բևե՝ջՂջՌժ՞Տտ\u0557֎ւգ\u0558խ֜ո֚", (byte)75, 69);
               ZKM_STR_B[19] = NLoginCore_241.B("ŘƉŮōƅƄŮŧƏŗŴŝ", (byte)75, 66);
               ZKM_STR_B[20] = NLoginCore_384.D("ӋӇӢӻԁԅӕӓԊӑӸӮԑԝԖӵԐԏԎԏԞԒӺӺӵԖөԡӼӪӭӤ", (byte)75, 68);
               ZKM_STR_B[21] = NLoginCore_092.F("ՐտգՙՖզ՟նթՂքՏ", (byte)75, 70);
               ZKM_STR_B[22] = NLoginCore_451.C("ӈӬӫԃӾԆԃӦӬԎӧԕԑӗԖӐӰӴӸԒӞӻԞԑӱӣӲӷԡԡԡӠ", (byte)75, 67);
               ZKM_STR_B[23] = NLoginCore_173.A(
                  "ƂšƈźƓŏŰŒŶƌŸŧŰţƌŕƝſŰƎƓŶƝƗƅŰŹŠƟŶƚƝƝťŰūƯƁűƍƏŵƏƁƇƚƗƏŷŹƜƲƗŵƒƹƗƵǆƸƢƕƣƌǉǍƂƞǎǑǑƐǂƿǈƒǒƲƛƏƬƹǌƪƬƟƻǞƽǀǀƷƼƾƷǢƩƨǫƨǬǆǈǅǓƮǲƽ", (byte)75, 65
               );
               ZKM_STR_B[24] = NLoginCore_138.F(
                  "ՈԹւԼԽՔճՠԺշյ\u058c\u0558ցՅ\u0557ՊերՌժ։Ոդդ֙ՓՍջֈ֚֝խի՚ռ\u058cղե֦֟֠յտ֘֗ժֈթ֤\u058b֔քսւֳֵ֢֗֊֚֚֘\u0590֘ռ֓ցփֲִֵ֑֕׀֝׃ֻևֽ֛֧֫׀\u0590֏\u05cb׃֧הֱֱ֚֭֘נטע֞\u05cdֵגֻֻֻֿ֣נַףס\u05ca\u05ec׀ְם֦־\u05c8\u05c9גצ״ץָֺ\u05cb\u05cb׳ּי\u05ec\u0601\u0605ָ؆רכ׀\u0602\u05fe\u05faר؊צ\u05eeש\u0604؎םךכ",
                  (byte)75,
                  70
               );
               ZKM_STR_B[25] = NLoginCore_471.C("ԁӍӻӭԇӯԓӲԈԅԃӞ", (byte)75, 67);
               ZKM_STR_B[26] = NLoginCore_446.A("ƀŌźŬƆŮƒűƇƄƂŝ", (byte)75, 65);
               ZKM_STR_B[27] = NLoginCore_427.A("ƏŌžſƐŭƌŎŢŏƋœŰŒƓƍŨŜƋźűƋżƥſţƝťţƕťƮŶƟƋŪƏƩƁƉƊƨųŽ", (byte)75, 65);
               ZKM_STR_B[28] = NLoginCore_397.D("ӧӻԋӈԓӑԅӦӧԇӪӗԚԋӹԌԀԖӴӭӢԄӟӺӰԆԣԢԔӾԭԭԭԇԀԨԟԔԅԈԈԯԷӾ", (byte)75, 68);
               ZKM_STR_B[29] = NLoginCore_446.F("՟՜ԻնՔ՛\u0557ՙրՖմ՜ք֎չՉ֑\u0590էփֈՠճտՠդշ֔ջֆ֑֑֑֊փ֝՛վՠ֖֞֔ռ֔չք\u058bֈց֚պղ֊֍պջ", (byte)75, 70);
               ZKM_STR_B[30] = NLoginCore_453.C("ӅӬӿөԆԉӦӡӎԑӗԓԃӯӖәԎӵԔԑӟԙԦԠӴӥԚӲӧӽԌӭӸӫԣԊԬԡӾԬӮԆӷӳԔԩԞԇԍӾԍԜӻԍԅԼՃԙԝԚԘԖՇԀՃԜԤԍԬՀԽՉԟԨՂՊՕՋԬՏՍԶԸԭԺԟԾԺեԚե՞ժՄՎդ", (byte)75, 67);
               ZKM_STR_B[31] = NLoginCore_575.A("ŞƃşŝżşŏƆƆŧųŰƋŲƄŚŬƕŽŴƔŻŨũ", (byte)75, 65);
               ZKM_STR_B[32] = NLoginCore_232.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
               ZKM_STR_B[33] = NLoginCore_397.A(
                  "ŖŇƐŊŋŢƁŮňƅƃƚŦƏœťŘųƎŚŸƗŖŲŲƧšśƉƖƫƨŻŹŨƊƚƀųƴƭƮƃƍƦƥŸƖŷƲƙƢƒƋƐǃǁƥưƘƦƨƨƞƦƊơƏƑƣǃƟǀǂǑƙƚǗǏƪƪǛǟƸǎƳǓƻǐƥƦǚǈƸƦƭǫƬƹǅƱǪǧǨǳƲǎǨǉƴǍƶǊǉƲǶǒǟǮǾǚǸǠǜǛȅǼȋȋǝȀǛǛǱǴȎȗǬǬǝ",
                  (byte)75,
                  65
               );
               ZKM_STR_B[34] = NLoginCore_201.D("ԁӍӻӭԇӯԓӲԈԅԃӞ", (byte)75, 68);
               ZKM_STR_B[35] = NLoginCore_427.E("ղԾլ՞ոՠքգչնմՏ", (byte)75, 69);
               ZKM_STR_B[36] = NLoginCore_232.D("ӫԋӹӞԇԔӧӥԈԖԘԄӴӻԏӗӱԡӟԣԄԣӥӱԗӧӽӴӝԃԜԛ", (byte)75, 68);
               ZKM_STR_B[37] = NLoginCore_575.D("ӟӦԃӍӅӾӢӴԅӨӐӞ", (byte)75, 68);
               ZKM_STR_B[38] = NLoginCore_397.B("řŮŭƉƒţŪŕƃůƖŏŹũŻŕƓƚśŹƎƃſŹŶşŲƂƃƈŷƠ", (byte)75, 66);
               ZKM_STR_B[39] = NLoginCore_004.F("՚ՌապծբեևՆշմՏ", (byte)75, 70);
               ZKM_STR_B[40] = NLoginCore_138.A("ŢƐŤōńƊƎƌŌšƆŝ", (byte)75, 65);
               ZKM_STR_B[41] = NLoginCore_027.A("şƐŭƋžűŌƏƍŲœŝ", (byte)75, 65);
               ZKM_STR_B[42] = NLoginCore_575.E("տԺՕՀ\u0557նՐգցԿքՏ", (byte)75, 69);
               ZKM_STR_B[43] = NLoginCore_433.A("ŢŦŞŻƇƆŋŮųƆƇƈƃƋŴŔŵƖƟŴƃţŴŻŦƟơƊƓƖŻƕ", (byte)75, 65);
               ZKM_STR_B[44] = NLoginCore_183.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
               ZKM_STR_B[45] = NLoginCore_530.B("ŪżŮŊŐƅŴũşşƊŝ", (byte)75, 66);
               ZKM_STR_B[46] = NLoginCore_575.E("Ք\u0558ՐխչոԽՠեոո՜՛֎իպիՋփզՎլշՏ֏֓֍ՒՖ֎Օ\u058b", (byte)75, 69);
               ZKM_STR_B[47] = NLoginCore_387.E("ՍծԺՙՒԿհպ՜տՒՏ", (byte)75, 69);
               ZKM_STR_B[48] = NLoginCore_201.C("ӫӽӯӋӑԆӵӪӠӠԋӞ", (byte)75, 67);
               ZKM_STR_B[49] = NLoginCore_521.F("ոԽձշԺ՟րՀօԻրՔև\u0557ս֍քհՍՑ՞ՇՏ֒չյքզխթղ֞", (byte)75, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.F("\u0558չւՋռՠ՜ՠՇՙՠվՂ֊օՋ՞֊զթիճ֒և\u0557֘ֆֆՕՏխ֘", (byte)75, 70);
               ZKM_STR_B[1] = NLoginCore_141.A("ţŝƁƀƃŪŤſűūŏŝ", (byte)75, 65);
               ZKM_STR_B[2] = NLoginCore_004.C("ӞӠԇԐӅӳԈӓӢӮԁԈԎӻӪӚӷӗӻԔӸԜԠԏԖӱԇԨӝԀԪӮԘԎӣԛԥԣԁԢԨԍԨԖԍԻԥԍӹԗӽԀԻԘՀԅԾԸՅԓԩԆՊԡՐԻ\u0530ԱԨՎՉԠՂՀՈՖԺԫԖՈՈԺբԲ՛ԼԩԪ", (byte)75, 67);
               ZKM_STR_B[3] = NLoginCore_092.A("ƉšƐƇƃžŝƂƍœŸŝ", (byte)75, 65);
               ZKM_STR_B[4] = NLoginCore_453.A("żŧƋŽŦƀŏųőƑőƇŷƐŷƍƖşůƗşƏŲƝŶƑƐƚŸţƫƨťŮƅƣŲſƣƶƒƎůƄƆƕƉŵƑƠŷƜƵƿƶǅƯſƗƺƻƣƻƆƽǈơǍƳƠǁƥƭƮǙƮǖƷƮƬǚƿǓƱǝǤƲƿǏǃǉǂƹơǙǤ", (byte)75, 65);
               ZKM_STR_B[5] = NLoginCore_521.C("ԎԏԁӲӡӋӳӮԈӐԏӞ", (byte)75, 67);
               ZKM_STR_B[6] = NLoginCore_027.A("ƎřňƎůƊƁƍŐťƊŝ", (byte)75, 65);
               ZKM_STR_B[7] = NLoginCore_387.A("ņƇŮżƅųņƌŨŤŷŔƐųŧŭŴƊŬŹƑſşƀŹŠŢŢŲťƢƀŸƐƍŧƨŽƬƥƋųƃƣŲƜƴƴŽƎƽƜƙǃƙƗƾƘžƔǇƿǌƋ", (byte)75, 65);
               ZKM_STR_B[8] = NLoginCore_397.C("ӮӪԃԍԃӾԂӈԓԋӵӞ", (byte)75, 67);
               ZKM_STR_B[9] = NLoginCore_141.E(
                  "ՕՁՔպՔռՔզՈ՟\u058bտպզՉիոՇՏֆծ֕։֎ևֆ։ձթ֒ը՟֛֎ժ֙չջ֡՟մնըջւո֧ռբ֏ְ֊֠֒\u058cֱ֣֙֘֯֙\u058bַּּ֧֣֙׃տֻֿ֘ր֢֣׀ּք֮ׄ\u05c8֜\u058b\u05ceד֛֚", (byte)75, 69
               );
               ZKM_STR_B[10] = NLoginCore_241.C("ԁԐԅӭӲӢӓӭԕӥԇӞ", (byte)75, 67);
               ZKM_STR_B[11] = NLoginCore_201.D("ӾԎӈԉӨӼԅӬӫӒԑӗӖԋӳӐӺԍԠԡӚӬөӪ", (byte)75, 68);
               ZKM_STR_B[12] = NLoginCore_427.C("ӾԎӈԉӨӼԅӬӫӒԒӺӻӼӯԟԗԡԚԃӭӼөӪ", (byte)75, 67);
               ZKM_STR_B[13] = NLoginCore_530.C("ԐӍӿԀԑӮԍӏӣӐԋԙӫԚӷӲӬӠӚӳӫӹӯӰӣԢԅԁӫӷԜԗԘӿԑӰөԔӵӾԌԯԷӾ", (byte)75, 67);
               ZKM_STR_B[14] = NLoginCore_397.C("ӡӛӉԊӒӐӞԈԒӴӕӣөӸԞӴԌӾӮԊԖӼөӪ", (byte)75, 67);
               ZKM_STR_B[15] = NLoginCore_201.E("ՒՌԺջՃՁՏչփեՈ։\u058bփպց՞։խ֓ֆ֓՚՛", (byte)75, 69);
               ZKM_STR_B[16] = NLoginCore_397.C("ӹԂӞӋԀӎӯӲӮӹӮӱԖӴӬԊӑԊӛӹӭԥԛԦԕӤԤӵԙԅԜӷԪԄԠӨԢԋӾԶԈӷԑӾ", (byte)75, 67);
               ZKM_STR_B[17] = NLoginCore_241.B("ŽŹŊŤŭŉƓŇšſŨœŻőŗŚƋŹƗƞƚūŨũ", (byte)75, 66);
               ZKM_STR_B[18] = NLoginCore_110.D("ӹԂӞӋԀӎӯӲӮӹӮӱԖӴӬԊӑԊӛӹӭԣӰӶԇԥԞӨԙӞӫԬԟԜԬԈԡԯԡԎԶԊԯӾ", (byte)75, 68);
               ZKM_STR_B[19] = NLoginCore_141.A("ŽŠƅŐŌƀşƅƅƓƂŝ", (byte)75, 65);
               ZKM_STR_B[20] = NLoginCore_027.D("ӋӇӢӻԁԅӕӓԊӑӸӮԑԝԖӵԐԏԎԏԞԗԞӷӠԉӠԈԧӺԍԝ", (byte)75, 68);
               ZKM_STR_B[21] = NLoginCore_324.E("՝ձպկւջպՏդձՠդօրՅլո֎դ՝՜փ՚՛", (byte)75, 69);
               ZKM_STR_B[22] = NLoginCore_397.C("ӈӬӫԃӾԆԃӦӬԎӧԕԑӗԖӐӰӴӸԒӞӯӣӵԞԕԛԘԩӪԫԩ", (byte)75, 67);
               ZKM_STR_B[23] = NLoginCore_127.B(
                  "ƂšƈźƓŏŰŒŶƌŸŧŰţƌŕƝſŰƎƓŶƝƗƅŰŹŠƟŶƚƝƝťŰūƯƁűƍƏŵƏƁƇƚƗƏŷŹƜƲƗŵƒƹƗƵǆƸƢƕƣƌǉǍƂƞǎǑǑƐǂƿǈƒǒƲƛƏƬƹǌƪƬƟƻǞƽǀǀƷƼƾƷǢǁƻǩǢǑǐǝǓǣǟǌƽ", (byte)75, 66
               );
               ZKM_STR_B[24] = NLoginCore_446.E(
                  "ՈԹւԼԽՔճՠԺշյ\u058c\u0558ցՅ\u0557ՊերՌժ։Ոդդ֙ՓՍջֈ֚֝խի՚ռ\u058cղե֦֟֠յտ֘֗ժֈթ֤\u058b֔քսւֳֵ֢֗֊֚֚֘\u0590֘ռ֓ցփֲִֵ֑֕׀֝׃ֻևֽ֛֧֫׀\u0590֏\u05cb׃֧הֱֱ֚֭֘נטע֞\u05cdֵגֻֻֻֿ֣נַףס\u05ca\u05ec׀ְם֦־\u05c8\u05c9גצ״ץָֺ\u05cb\u05cb׳ּי\u05ec\u0601\u0605ָ؆רכּׁת\u05feצמ\u05f8ם\u05ce\u0604\u05ed\u0603ךכ",
                  (byte)75,
                  69
               );
               ZKM_STR_B[25] = NLoginCore_004.A("ƌŭłŚŌťƋŧňƇƘƖŦūœŔŝőƗūŮŻŨũ", (byte)75, 65);
               ZKM_STR_B[26] = NLoginCore_433.D("ӣԀӇӱӠԒөӴӳӘӘӞ", (byte)75, 68);
               ZKM_STR_B[27] = NLoginCore_141.E("ցԾհձւ՟վՀՔՁսՅբՄօտ՚Վսլգսծ֗ձՕ֏\u0557Օև\u0557֠պռո՞ոհ֕ֆ֡֘տչ֟է֚ռջց֨ղ\u058c֣պջ", (byte)75, 69);
               ZKM_STR_B[28] = NLoginCore_027.E("\u0558լռԹքՂն\u0557\u0558ո՛Ո\u058bռժսձևե՞ՓյՐիաշ֔֓օկ֞֞֕֝֠՟֒֘\u0558֡ըչբև֚֘֞ո֤֞րֳ֔֜պջ", (byte)75, 69);
               ZKM_STR_B[29] = NLoginCore_127.C("ӮӫӊԅӣӪӦӨԏӥԃӫԓԝԈӘԠԟӶԒԗӯԂԎӯӳԆԣԊԕԠԠԠԙԒԬӪԍӯԭԥԣԌӵԉԚԾԿԟԛԾՃԮԟ\u0530ԅ\u0530ԆԵԸՇԴԹԦ", (byte)75, 67);
               ZKM_STR_B[30] = NLoginCore_397.C("ӅӬӿөԆԉӦӡӎԑӗԓԃӯӖәԎӵԔԑӟԙԦԠӴӥԚӲӧӽԌӭӸӫԣԊԬԡӾԬӮԆӷӳԔԩԞԇԍӾԍԜӻԍԅԼՃԙԝԚԘԖՇԀՃԜԤԍԬՀԽՉԟԨՂՊՕՋԬՏՍԶԸԭԺԜբՠԻԣԩՆԥ\u0557էծ", (byte)75, 67);
               ZKM_STR_B[31] = NLoginCore_241.C("ӟԄӠӞӽӠӐԇԇӨӱӑӰӵӷӶԊԘԎӞԛӬөӪ", (byte)75, 67);
               ZKM_STR_B[32] = NLoginCore_141.E("կՖԾղԾեվբՑռֈՏ", (byte)75, 69);
               ZKM_STR_B[33] = NLoginCore_076.A(
                  "ŖŇƐŊŋŢƁŮňƅƃƚŦƏœťŘųƎŚŸƗŖŲŲƧšśƉƖƫƨŻŹŨƊƚƀųƴƭƮƃƍƦƥŸƖŷƲƙƢƒƋƐǃǁƥưƘƦƨƨƞƦƊơƏƑƣǃƟǀǂǑƙƚǗǏƪƪǛǟƸǎƳǓƻǐƥƦǚǈƸƦƭǫƬƹǅƱǪǧǨǳƲǎǨǉƴǍƶǊǉƲǶǒǟǮǾǚǸǠǜǛȅǼȋȆǌǾȃǑȍǨǑȃǨǬǝ",
                  (byte)75,
                  65
               );
               ZKM_STR_B[34] = NLoginCore_232.C("ԉӌӍԌӏӐӽԃӷӦԚԚӯӰԖӭӯӷӽӚӞԢөӪ", (byte)75, 67);
               ZKM_STR_B[35] = NLoginCore_138.F("ԻցԴ՟գվՕՀՆև՞Տ", (byte)75, 70);
               ZKM_STR_B[36] = NLoginCore_433.B("ŪƊŸŝƆƓŦŤƇƕƗƃųźƎŖŰƠŞƢƃơŵůƎƤƜšƩƢƀƢŭƏƁŨŭųƭƶƶƴųŽ", (byte)75, 66);
               ZKM_STR_B[37] = NLoginCore_471.E("Թ՛ի\u0557Օ՟նցգգՒՏ", (byte)75, 69);
               ZKM_STR_B[38] = NLoginCore_004.E("Ջՠ՟ջքՕ՜ՇյաֈՁի՛խՇօ\u058cՍիրնփը։զօ՛յ\u0558՝֖", (byte)75, 69);
               ZKM_STR_B[39] = NLoginCore_127.F("ՏջԼՍլ՜ՒֈչՄռՏ", (byte)75, 70);
               ZKM_STR_B[40] = NLoginCore_183.D("ӾӱԂӡԔԐӣӶԋӪԘԍӲӖӮӸԊӱӽԃӿӼөӪ", (byte)75, 68);
               ZKM_STR_B[41] = NLoginCore_091.D("ӜӤӏӟԔӝӤԒӟӳӵӞ", (byte)75, 68);
               ZKM_STR_B[42] = NLoginCore_451.A("ƌżŪőƋŉżƑŒƊƖŝ", (byte)75, 65);
               ZKM_STR_B[43] = NLoginCore_201.D("ӣӧӟӼԈԇӌӯӴԇԈԉԄԌӵӕӶԗԠӵԄԢӹӟӼӞӲԁӻԛӺԤ", (byte)75, 68);
               ZKM_STR_B[44] = NLoginCore_451.E("ջԿմոռեւմՔմՅՏ", (byte)75, 69);
               ZKM_STR_B[45] = NLoginCore_427.A("ƈƊŪŝńżŒŲƇŔŊŨŚƚƆƕŨŞŷƛƛƑŨũ", (byte)75, 65);
               ZKM_STR_B[46] = NLoginCore_397.F("Ք\u0558ՐխչոԽՠեոո՜՛֎իպիՋփզՎլՖֆ֙ըխֆ֛֙֏\u058b", (byte)75, 70);
               ZKM_STR_B[47] = NLoginCore_387.B("ƍſƊƃŧƒŧŴžƊŴŝ", (byte)75, 66);
               ZKM_STR_B[48] = NLoginCore_384.B("ƂŷżšŤƋţŏŵƂŬŝ", (byte)75, 66);
               ZKM_STR_B[49] = NLoginCore_446.A("ƆŋſƅňŭƎŎƓŉƎŢƕťƋƛƒžśşŬŚƔŢŷŝƒżŧƣŤŶƁƄƩƚƜƑƈƤųƟƦŽ", (byte)75, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.E("ՉիԺԾմՃՙ՜Շ՚ՉտէֆՅևՠտռ֊զ֓՚՛", (byte)75, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.F("ԸՐծյԻՄ\u0557յՠղՖէբթւթեֈձգվ՟ժՖքւ֖\u058c֛֝֎֊", (byte)75, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 70L;
      var1 ^= -6894119519310434806L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(4 + 64),
                     (byte)(63 + 6),
                     (byte)(45 + 38),
                     (byte)(43 + 4),
                     (byte)(64 + 3),
                     (byte)(35 + 31),
                     (byte)(38 + 29),
                     47,
                     (byte)(25 + 55),
                     (byte)(3 + 72),
                     (byte)(58 + 9),
                     (byte)(15 + 68),
                     (byte)(34 + 19),
                     (byte)(16 + 64),
                     97,
                     (byte)(53 + 47),
                     (byte)(29 + 71),
                     (byte)(102 + 3),
                     (byte)(80 + 30),
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(51 + 32)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.F("ԾՋՊԍՍՉՄՍ\u0558ՇԔՒՖՏՒ\u0558Ԛ࢝ࢤࢡࢩࢮࢌࢶࢻࢲࢯࢺ\u0897ࢴࢳࢲ", (byte)31, 70));
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
}
