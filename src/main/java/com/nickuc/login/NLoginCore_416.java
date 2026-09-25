package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_416 {
   private static long ii = Long.reverse(-7235360880256692074L);
   private static int gr = 268435456 >>> 60 | 268435456 << ~60 + 1;
   private static long jc = Long.reverse(144115188075855872L);
   private static long dd = Long.reverse(-7235360880256692074L);
   private static int bm = 0 >>> 94 | 0 << ~94 + 1;
   private static long ez = Long.reverse(-7235360880256692074L);
   private static int gw = Integer.reverse(Integer.MIN_VALUE);
   private static int hs = 0 >>> 180 | 0 << -180;
   private static long dj = Long.reverse(-7379476068332547946L);
   private static int ev = Integer.reverse(-2080374784);
   private static int ix = Integer.reverse(-1107296256);
   private static long fa = Long.reverse(144115188075855872L);
   private static long ed = Long.reverse(-7379476068332547946L);
   private static long cr = Long.reverse(144115188075855872L);
   private static long iq = Long.reverse(-7379476068332547946L);
   private static long hf = Long.reverse(144115188075855872L);
   private static int iy = (4194304 >>> 54 | 4194304 << ~54 + 1) & -1;
   private static long ct = Long.reverse(-7235360880256692074L);
   private static int bx = (-1 >>> 138 | -1 << -138) & -1;
   private static int dz = Integer.reverse(-1744830464);
   private static int fj = 134217728 >>> 59 | 134217728 << ~59 + 1;
   private static long gn = Long.reverse(-7379476068332547946L);
   private static int au = (50331648 >>> 23 | 50331648 << -23) & -1;
   private static int jn = -1 >>> 37 | -1 << -37;
   private static long el = Long.reverse(-7379476068332547946L);
   private static int bc = Integer.reverse(1879048192);
   private static int hp = Integer.reverse(-872415232);
   private static int av = (112 >>> 132 | 112 << ~132 + 1) & -1;
   private static int s = Integer.reverse(-805306368);
   private static long ep = Long.reverse(144115188075855872L);
   private static int ih = 7340032 >>> 17 | 7340032 << ~17 + 1;
   private static int fp = Integer.reverse(Integer.MIN_VALUE);
   private static int gq = (8388608 >>> 151 | 8388608 << -151) & -1;
   private static long fv = Long.reverse(-7235360880256692074L);
   private static long eo = Long.reverse(-7235360880256692074L);
   private static int dc = Integer.reverse(-2013265920);
   private static long jb = Long.reverse(-7235360880256692074L);
   private static int bz = Integer.reverse(268435456);
   private static long ic = Long.reverse(144115188075855872L);
   private static int dv = (3072 >>> 167 | 3072 << -167) & -1;
   private static long dw = Long.reverse(-7235360880256692074L);
   private static int ap = (1073741824 >>> 94 | 1073741824 << ~94 + 1) & -1;
   private static long im = Long.reverse(-7235360880256692074L);
   private static int bn = Integer.reverse(0);
   private static int es = (524288 >>> 110 | 524288 << -110) & -1;
   private static int iv = '\uf600' >>> 201 | 62976 << ~201 + 1;
   private static int aq = Integer.reverse(1073741824);
   private static int gt = Integer.reverse(536870912);
   private static int gi = Integer.reverse(-738197504);
   private static int ht = Integer.reverse(0);
   private static long gg = Long.reverse(-7235360880256692074L);
   private static int ax = (294912 >>> 111 | 294912 << -111) & -1;
   private static int q = Integer.reverse(-1879048192);
   private static long co = Long.reverse(144115188075855872L);
   private static int ec = (54525952 >>> 213 | 54525952 << -213) & -1;
   private static int fq = Integer.reverse(-1543503872);
   private static int ao = 0 >>> 0 | 0 << ~0 + 1;
   private static int dy = 0 >>> 211 | 0 << -211;
   private static int jh = Integer.reverse(-1140850688);
   private static int t = 3072 >>> 40 | 3072 << ~40 + 1;
   private static long hw = Long.reverse(-7379476068332547946L);
   private static int eh = Integer.reverse(939524096);
   private static long he = Long.reverse(-7235360880256692074L);
   private static long eu = Long.reverse(144115188075855872L);
   private static int aw = 131072 >>> 142 | 131072 << ~142 + 1;
   private static int fb = 0 >>> 12 | 0 << ~12 + 1;
   private static int cz = Integer.reverse(134217728);
   private static long ha = Long.reverse(144115188075855872L);
   private static int cp = 104 >>> 3 | 104 << ~3 + 1;
   private static int fm = Integer.reverse(603979776);
   private static int iz = 0 >>> 159 | 0 << -159;
   private static int ck = (-1 >>> 165 | -1 << -165) & -1;
   private static int cd = 1179648 >>> 145 | 1179648 << ~145 + 1;
   private static long da = Long.reverse(-7235360880256692074L);
   private static int cv = (0 >>> 190 | 0 << -190) & -1;
   private static int gl = 92274688 >>> 85 | 92274688 << ~85 + 1;
   private static int al = Integer.reverse(0);
   private static int a = Integer.reverse(0);
   private static int iu = Integer.reverse(0);
   private static int dk = Integer.reverse(0);
   private static long aj = Long.reverse(-7235360880256692074L);
   private static long db = Long.reverse(144115188075855872L);
   private static long de = Long.reverse(144115188075855872L);
   private static int dp = 5767168 >>> 50 | 5767168 << -50;
   private static int i = 67108864 >>> 186 | 67108864 << ~186 + 1;
   private static int az = (2883584 >>> 210 | 2883584 << ~210 + 1) & -1;
   private static int bd = -268435456 >>> 188 | -268435456 << ~188 + 1;
   private static long ji = Long.reverse(-7235360880256692074L);
   private static long cn = Long.reverse(-7235360880256692074L);
   private static long ft = Long.reverse(-7379476068332547946L);
   private static int fc = Integer.reverse(0);
   private static int hx = Integer.reverse(0);
   private static int dt = (-1 >>> 64 | -1 << -64) & -1;
   private static long jo = Long.reverse(-7379476068332547946L);
   private static int gs = (0 >>> 251 | 0 << -251) & -1;
   private static int hu = Integer.reverse(1073741824);
   private static long gh = Long.reverse(144115188075855872L);
   private static int ac = Integer.reverse(-1476395008);
   private static int w = (480 >>> 197 | 480 << -197) & -1;
   private static long hc = Long.reverse(-7379476068332547946L);
   private static long bq = Long.reverse(-7235360880256692074L);
   private static int var_if = (-1 >>> 154 | -1 << -154) & -1;
   private static long ca = Long.reverse(-7235360880256692074L);
   private static long ei = Long.reverse(-7379476068332547946L);
   private static int ad = Integer.reverse(1744830464);
   private static int jk = Integer.reverse(2080374784);
   private static long jg = Long.reverse(144115188075855872L);
   private static int dl = 10240 >>> 9 | 10240 << ~9 + 1;
   private static long hq = Long.reverse(-7235360880256692074L);
   private static long dr = Long.reverse(144115188075855872L);
   private static int u = (218103808 >>> 120 | 218103808 << ~120 + 1) & -1;
   private static long ea = Long.reverse(-7235360880256692074L);
   private static long cx = Long.reverse(-7235360880256692074L);
   private static int gy = (5898240 >>> 209 | 5898240 << ~209 + 1) & -1;
   private static long du = Long.reverse(-7379476068332547946L);
   private static long dm = Long.reverse(-7379476068332547946L);
   private static int gd = Integer.reverse(-1811939328);
   private static long fo = Long.reverse(144115188075855872L);
   private static String[] ZKM_STR_B = new String[NLoginCore_416.jq];
   private static int ga = (262144 >>> 178 | 262144 << -178) & -1;
   private static int bh = Integer.reverse(-939524096);
   private static int af = (268435456 >>> 219 | 268435456 << ~219 + 1) & -1;
   private static int ef = (-1 >>> 194 | -1 << -194) & -1;
   private static int df = Integer.reverse(1207959552);
   private static long fw = Long.reverse(144115188075855872L);
   private static int fg = Integer.reverse(0);
   private static long hr = Long.reverse(144115188075855872L);
   private static long ib = Long.reverse(-7235360880256692074L);
   private static int hb = Integer.reverse(1946157056);
   private static int cw = (7680 >>> 233 | 7680 << -233) & -1;
   private static long dx = Long.reverse(144115188075855872L);
   private static long fy = Long.reverse(-7235360880256692074L);
   private static int jm = Integer.reverse(-67108864);
   private static int n = Integer.reverse(1610612736);
   private static long jj = Long.reverse(144115188075855872L);
   private static int gp = Integer.reverse(0);
   private static int fx = Integer.reverse(335544320);
   private static long jf = Long.reverse(-7235360880256692074L);
   private static int bi = 1342177280 >>> 26 | 1342177280 << ~26 + 1;
   private static int is = Integer.reverse(Integer.MIN_VALUE);
   private static int ie = Integer.reverse(-335544320);
   private static int as = Integer.reverse(536870912);
   private static long cy = Long.reverse(144115188075855872L);
   private static long fz = Long.reverse(144115188075855872L);
   private static int be = Integer.reverse(134217728);
   private static int ch = Integer.reverse(-1);
   private static int ik = Integer.reverse(0);
   private static int hj = 12544 >>> 136 | 12544 << ~136 + 1;
   private static String[] ZKM_STR_A = new String[NLoginCore_416.jp];
   private static long br = Long.reverse(144115188075855872L);
   private static int di = 1610612738 >>> 189 | 1610612738 << -189;
   private static int cs = -1073741823 >>> 253 | -1073741823 << -253;
   private static int ee = Integer.reverse(-671088640);
   private static int hm = Integer.reverse(0);
   private static int ai = Integer.reverse(-1073741824);
   private static int em = Integer.reverse(0);
   private static int fi = (0 >>> 73 | 0 << ~73 + 1) & -1;
   private static long dg = Long.reverse(-7235360880256692074L);
   private static int fk = (128 >>> 102 | 128 << ~102 + 1) & -1;
   private static int hv = Integer.reverse(738197504);
   private static long ff = Long.reverse(-7379476068332547946L);
   private static int d = Integer.reverse(-1);
   private static int jq = Integer.reverse(33554432);
   private static long hl = Long.reverse(-7379476068332547946L);
   private static int j = (33554432 >>> 248 | 33554432 << -248) & -1;
   private static long et = Long.reverse(-7235360880256692074L);
   private static int ar = 12 >>> 2 | 12 << ~2 + 1;
   private static int ds = 94208 >>> 44 | 94208 << ~44 + 1;
   private static int bb = 212992 >>> 174 | 212992 << ~174 + 1;
   private static int fs = 622592 >>> 14 | 622592 << -14;
   private static int bu = Integer.reverse(1610612736);
   private static int p = Integer.reverse(268435456);
   private static long ah = Long.reverse(-7379476068332547946L);
   private static int an = Integer.reverse(1744830464);
   private static int gv = 33554432 >>> 57 | 33554432 << ~57 + 1;
   private static int z = 147456 >>> 45 | 147456 << ~45 + 1;
   private static int il = 14592 >>> 40 | 14592 << ~40 + 1;
   private static int y = (1114112 >>> 240 | 1114112 << ~240 + 1) & -1;
   private static long hz = Long.reverse(-7379476068332547946L);
   private static long fn = Long.reverse(-7235360880256692074L);
   private static long ak = Long.reverse(144115188075855872L);
   private static long ci = Long.reverse(-7379476068332547946L);
   private static int cm = Integer.reverse(805306368);
   private static int gu = 1024 >>> 138 | 1024 << ~138 + 1;
   private static int ir = 0 >>> 60 | 0 << -60;
   private static int ej = 973078528 >>> 185 | 973078528 << ~185 + 1;
   private static int fe = (573440 >>> 14 | 573440 << -14) & -1;
   private static long e = Long.reverse(-7379476068332547946L);
   private static long cl = Long.reverse(-7379476068332547946L);
   private static long b = Long.reverse(-7379476068332547946L);
   private static int x = 16 >>> 192 | 16 << -192;
   private static int jp = Integer.reverse(33554432);
   private static long eg = Long.reverse(-7379476068332547946L);
   private static int ag = Integer.reverse(-1);
   private static int f = 0 >>> 167 | 0 << -167;
   private static int g = (24576 >>> 138 | 24576 << -138) & -1;
   private static int cc = Integer.reverse(0);
   private static int gm = Integer.reverse(-1);
   private static int bl = 1073741824 >>> 30 | 1073741824 << -30;
   private static int fu = (78 >>> 161 | 78 << ~161 + 1) & -1;
   private static long ho = Long.reverse(-7379476068332547946L);
   private static long cu = Long.reverse(144115188075855872L);
   private static int ab = 20480 >>> 42 | 20480 << ~42 + 1;
   private static long hi = Long.reverse(-7379476068332547946L);
   private static int ia = (905969664 >>> 184 | 905969664 << -184) & -1;
   private static int bw = ('\ue000' >>> 141 | 57344 << ~141 + 1) & -1;
   private static int id = Integer.reverse(Integer.MIN_VALUE);
   private static int ay = 335544320 >>> 89 | 335544320 << ~89 + 1;
   private static long bt = Long.reverse(-7379476068332547946L);
   private static int hk = Integer.reverse(-1);
   private static long bv = Long.reverse(-7379476068332547946L);
   private static int dn = 352321536 >>> 184 | 352321536 << -184;
   private static int o = Integer.reverse(-536870912);
   private static int gf = Integer.reverse(1409286144);
   private static int bf = Integer.reverse(-2013265920);
   private static int hd = Integer.reverse(-201326592);
   private static int fd = Integer.reverse(1073741824);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int ba = (6291456 >>> 243 | 6291456 << -243) & -1;
   private static int bk = Integer.reverse(0);
   private static int eq = (31 >>> 160 | 31 << -160) & -1;
   private static long eb = Long.reverse(144115188075855872L);
   private static int m = Integer.reverse(-1610612736);
   private static int bp = (4 >>> 96 | 4 << -96) & -1;
   private static int at = Integer.reverse(-1610612736);
   private static int gb = (0 >>> 235 | 0 << ~235 + 1) & -1;
   private static int gx = Integer.reverse(Integer.MIN_VALUE);
   private static int cj = Integer.reverse(-805306368);
   private static long by = Long.reverse(-7379476068332547946L);
   private static int hh = (-1 >>> 195 | -1 << ~195 + 1) & -1;
   private static int hg = Integer.reverse(201326592);
   private static long ex = Long.reverse(144115188075855872L);
   private static long gk = Long.reverse(144115188075855872L);
   private static int je = Integer.reverse(1006632960);
   private static int l = (536870912 >>> 123 | 536870912 << ~123 + 1) & -1;
   private static int iw = Integer.reverse(Integer.MIN_VALUE);
   private static long ig = Long.reverse(-7379476068332547946L);
   private static long er = Long.reverse(-7379476068332547946L);
   private static int aa = 1610612738 >>> 221 | 1610612738 << ~221 + 1;
   private static long cb = Long.reverse(144115188075855872L);
   private static int k = Integer.reverse(-1073741824);
   private static long jl = Long.reverse(-7379476068332547946L);
   private static int ce = -1 >>> 48 | -1 << -48;
   private static long cf = Long.reverse(-7379476068332547946L);
   private static int go = (0 >>> 115 | 0 << -115) & -1;
   private static long cq = Long.reverse(-7235360880256692074L);
   private static int bj = Integer.reverse(-1476395008);
   private static long ew = Long.reverse(-7235360880256692074L);
   private static int bo = Integer.reverse(Integer.MIN_VALUE);
   private static long ge = Long.reverse(-7379476068332547946L);
   private static long dq = Long.reverse(-7235360880256692074L);
   private static int cg = Integer.reverse(1342177280);
   private static long c;
   private static int h = Integer.reverse(0);
   private static int en = Integer.reverse(2013265920);
   private static int gc = 0 >>> 56 | 0 << -56;
   private static int it = Integer.reverse(1073741824);
   private static int io = Integer.reverse(1543503872);
   private static int ip = Integer.reverse(-1);
   private static int ae = 92 >>> 130 | 92 << -130;
   private static long dh = Long.reverse(144115188075855872L);
   private static int ja = Integer.reverse(-603979776);
   private static long ij = Long.reverse(144115188075855872L);
   private static long fr = Long.reverse(-7379476068332547946L);
   private static int ek = Integer.reverse(-1);
   private static int r = Integer.reverse(1342177280);
   private static int hy = 3473408 >>> 112 | 3473408 << -112;
   private static int bs = (167772160 >>> 121 | 167772160 << ~121 + 1) & -1;
   private static int ey = (557056 >>> 206 | 557056 << -206) & -1;
   private static int fh = Integer.reverse(Integer.MIN_VALUE);
   private static long in = Long.reverse(144115188075855872L);
   private static int hn = (204800 >>> 76 | 204800 << ~76 + 1) & -1;
   private static int bg = 1207959552 >>> 218 | 1207959552 << -218;
   private static int c = 33554432 >>> 57 | 33554432 << -57;
   private static int v = Integer.reverse(1879048192);
   private static long gj = Long.reverse(-7235360880256692074L);
   private static long var_do = Long.reverse(-7379476068332547946L);
   private static int fl = Integer.reverse(0);
   private static int jd = Integer.reverse(Integer.MIN_VALUE);
   private static long gz = Long.reverse(-7235360880256692074L);

   private Timestamp a(long var1) {
      return new Timestamp(var1 <= 0L ? System.currentTimeMillis() : var1);
   }

   private String a(String var1, boolean var2) {
      return var1 == null || var1.isEmpty() || var2 && var1.equalsIgnoreCase(a(ja, jb ^ jc)) ? null : var1;
   }

   ForceRegisterConfig a(ResultSet var1) {
      String var2 = null;

      try {
         long var3 = var1.getLong(NLoginCore_436.a.getName());
         var2 = this.a(var1.getString(NLoginCore_436.b.getName()), (gp != 0));
         String var5 = this.a(var1.getString(NLoginCore_436.f.getName()), (gq != 0));
         String var6 = this.a(var1.getString(NLoginCore_436.g.getName()), (gr != 0));
         UUID var7 = this.a(var1.getString(NLoginCore_436.c.getName()));
         UUID var8 = this.a(var1.getString(NLoginCore_436.d.getName()));
         UUID var9 = this.a(var1.getString(NLoginCore_436.e.getName()));
         int var10 = gs;
         if (var8 != null && var8.version() != gt) {
            var8 = null;
            var10 = gu;
         }

         long var11 = this.a(var1.getObject(NLoginCore_436.i.getName()));
         long var13 = this.a(var1.getObject(NLoginCore_436.h.getName()));
         ForceRegisterConfig var15 = new ForceRegisterConfig(var3, var2, var7, var8, var9, var5, var6, var13, var11);
         var15.a.u = this.a(var1.getString(NLoginCore_436.j.getName()), (gv != 0));
         var15.a.v = this.a(var1.getString(NLoginCore_436.k.getName()), (gw != 0));
         String var16 = this.a(var1.getString(NLoginCore_436.l.getName()), (gx != 0));
         var15.a.w = var16;
         if (var16 != null) {
            this.a(var15, var16);
         }

         if (var10 != 0) {
            var15.z();
         }

         return var15;
      } catch (SQLException var17) {
         NLoginCore_370.c(a(gy, gz ^ ha) + (var2 != null ? a(hb, hc) + var2 + a(hd, he ^ hf) : a(hg & hh, hi)) + a(hj & hk, hl), var17);
      } catch (Exception var18) {
         NLoginCore_370.c(a(hn, ho) + var2 + a(hp, hq ^ hr), var18);
      }

      return null;
   }

   private Object[] a(Object[] var1, NLoginCore_436... var2) {
      if (var1.length % fd != 0) {
         throw new IllegalArgumentException(a(fe, ff));
      } else {
         int var3 = fg;
         int var4 = var2.length > 0 ? fh : fi;
         HashSet var5 = var4 != 0 ? new HashSet<>(Arrays.asList(var2)) : null;
         Object[] var6 = var4 != 0 ? new Object[(var5.size() + fj) * fk] : (Object[])var1.clone();

         for (int var7 = fl; var7 < var1.length; var7 += 2) {
            Object var8 = var1[var7];
            if (!(var8 instanceof NLoginCore_436)) {
               throw new IllegalArgumentException(a(fm, fn ^ fo));
            }

            NLoginCore_436 var9 = (NLoginCore_436)var8;
            if (var4 == 0 || var5.contains(var9) || var9 == NLoginCore_436.a) {
               var6[var3++] = var9.getName();
               var6[var3++] = var1[var7 + fp];
            }
         }

         return var6;
      }
   }

   private void a(ForceRegisterConfig var1, String var2) {
      int var3 = ht;
      if (!var2.isEmpty()) {
         if (var2.length() >= hu && !this.d(var2)) {
            try {
               var2 = new String(Base64.getDecoder().decode(var2));
            } catch (Exception var11) {
            }
         }

         if (this.d(var2)) {
            try {
               JSONObject var4 = new JSONObject(var2);
               JSONArray var5 = var4.getJSONArray(a(hv, hw));
               NLoginCore_407 var6 = var1.a();

               for (int var7 = hx; var7 < var5.length(); var7++) {
                  JSONObject var8 = var5.getJSONObject(var7);
                  String var9 = var8.getString(a(hy, hz));
                  Object var10 = var8.get(a(ia, ib ^ ic));
                  var6.a.put(var9, var10);
               }

               var3 = id;
            } catch (JSONException var12) {
               NLoginCore_370.c(a(ie & var_if, ig) + var1.i() + a(ih, ii ^ ij));
            } catch (Exception var13) {
               NLoginCore_370.c(a(il, im ^ in) + var1.i() + a(io & ip, iq), var13);
            }
         }
      }

      if (var3 == 0) {
         var1.a.z = (is != 0);
      } else {
         var1.a.I();
      }
   }

   private UUID a(String var1) {
      var1 = this.a(var1, (jd != 0));
      return var1 != null && !var1.equals(a(je, jf ^ jg)) ? NLoginCore_432.c(var1.replace(a(jh, ji ^ jj), a(jk, jl))) : null;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   boolean a(NLoginCore_459 var1, ForceRegisterConfig var2, NLoginCore_436... var3) {
      synchronized (var2.c) {
         String var5 = var2.r;
         if (var5 == null) {
            throw new IllegalStateException(a(a, b));
         } else if (var1 == null) {
            throw new IllegalStateException(a(c & d, e));
         } else {
            long var6 = System.nanoTime();

            try {
               String var8 = var2.a.n();
               String var9 = null;
               boolean var26 = false /* VF: Semaphore variable */;

               int var33;
               label322: {
                  label323: {
                     try {
                        var26 = true;
                        int var10 = f;
                        if (var2.a != null) {
                           Object[] var10001 = new Object[g];
                           var10001[h] = NLoginCore_436.b;
                           var10001[i] = var5;
                           var10001[j] = NLoginCore_436.c;
                           var10001[k] = NLoginCore_432.b(var2.c);
                           var10001[l] = NLoginCore_436.d;
                           var10001[m] = NLoginCore_432.b(var2.a);
                           var10001[n] = NLoginCore_436.e;
                           var10001[o] = NLoginCore_432.b(var2.b);
                           var10001[p] = NLoginCore_436.f;
                           var10001[q] = var2.s;
                           var10001[r] = NLoginCore_436.g;
                           var10001[s] = var2.t;
                           var10001[t] = NLoginCore_436.i;
                           var10001[u] = this.a(var2.g);
                           var10001[v] = NLoginCore_436.h;
                           var10001[w] = this.a(var2.f);
                           var10001[x] = NLoginCore_436.j;
                           var10001[y] = var2.a.u;
                           var10001[z] = NLoginCore_436.k;
                           var10001[aa] = var2.a.v;
                           var10001[ab] = NLoginCore_436.l;
                           var10001[ac] = var8;
                           var10001[ad] = NLoginCore_436.a;
                           var10001[ae] = var2.a;
                           Object[] var11 = this.a(var10001, var3);
                           String var12 = var1.a() != NLoginCore_036.d && var1.a() != NLoginCore_036.c ? a(ai, aj ^ ak) : a(af & ag, ah);
                           var10 = NLoginCore_069.a(NLoginCore_477.e.a(new Object[al]), am, var12, var11).a(var1);
                        }

                        if (var10 == 0) {
                           Object[] var10000 = new Object[an];
                           var10000[ao] = NLoginCore_436.b.getName();
                           var10000[ap] = var5;
                           var10000[aq] = NLoginCore_436.c.getName();
                           var10000[ar] = NLoginCore_432.b(var2.c);
                           var10000[as] = NLoginCore_436.d.getName();
                           var10000[at] = NLoginCore_432.b(var2.a);
                           var10000[au] = NLoginCore_436.e.getName();
                           var10000[av] = NLoginCore_432.b(var2.b);
                           var10000[aw] = NLoginCore_436.f.getName();
                           var10000[ax] = var2.s;
                           var10000[ay] = NLoginCore_436.g.getName();
                           var10000[az] = var2.t;
                           var10000[ba] = NLoginCore_436.i.getName();
                           var10000[bb] = this.a(var2.g);
                           var10000[bc] = NLoginCore_436.h.getName();
                           var10000[bd] = this.a(var2.f);
                           var10000[be] = NLoginCore_436.j.getName();
                           var10000[bf] = var2.a.u;
                           var10000[bg] = NLoginCore_436.k.getName();
                           var10000[bh] = var2.a.v;
                           var10000[bi] = NLoginCore_436.l.getName();
                           var10000[bj] = var8;
                           Object[] var32 = var10000;
                           var2.a = NLoginCore_069.a(NLoginCore_477.e.a(new Object[bk]), var32).a(var1);
                        }

                        var9 = var2.a(((var10 > 0 ? bl : bm) != 0), var8);
                        var2.a.z = (bn != 0);
                        var33 = bo;
                        var26 = false;
                        break label322;
                     } catch (SQLException var27) {
                        NLoginCore_370.c(
                           a(cd & ce, cf)
                              + (var2.r() ? a(cg & ch, ci) : a(cj & ck, cl))
                              + a(cm, cn ^ co)
                              + var5
                              + a(cp, cq ^ cr)
                              + var2.hashCode()
                              + a(cs, ct ^ cu),
                           var27
                        );
                        var26 = false;
                     } catch (Exception var28) {
                        NLoginCore_370.c(
                           a(dl, dm) + (var2.r() ? a(dn, var_do) : a(dp, dq ^ dr)) + a(ds & dt, du) + var5 + a(dv, dw ^ dx), var28
                        );
                        var26 = false;
                        break label323;
                     } finally {
                        if (var26) {
                           if (var9 == null) {
                              var9 = var2.a(var2.r(), var8);
                           }

                           NLoginCore_370.b(
                              a(en, eo ^ ep)
                                 + var1.a().v()
                                 + a(eq, er)
                                 + var9
                                 + a(es, et ^ eu)
                                 + (var3.length == 0 ? a(ev, ew ^ ex) : Arrays.stream(var3).map(NLoginCore_436::getName).collect(Collectors.toList()))
                                 + a(ey, ez ^ fa)
                           );
                        }
                     }

                     if (var9 == null) {
                        var9 = var2.a(var2.r(), var8);
                     }

                     NLoginCore_370.b(
                        a(cw, cx ^ cy)
                           + var1.a().v()
                           + a(cz, da ^ db)
                           + var9
                           + a(dc, dd ^ de)
                           + (var3.length == 0 ? a(df, dg ^ dh) : Arrays.stream(var3).map(NLoginCore_436::getName).collect(Collectors.toList()))
                           + a(di, dj)
                     );
                     return (fc != 0);
                  }

                  if (var9 == null) {
                     var9 = var2.a(var2.r(), var8);
                  }

                  NLoginCore_370.b(
                     a(dz, ea ^ eb)
                        + var1.a().v()
                        + a(ec, ed)
                        + var9
                        + a(ee & ef, eg)
                        + (var3.length == 0 ? a(eh, ei) : Arrays.stream(var3).map(NLoginCore_436::getName).collect(Collectors.toList()))
                        + a(ej & ek, el)
                  );
                  return (fc != 0);
               }

               if (var9 == null) {
                  var9 = var2.a(var2.r(), var8);
               }

               NLoginCore_370.b(
                  a(bp, bq ^ br)
                     + var1.a().v()
                     + a(bs, bt)
                     + var9
                     + a(bu, bv)
                     + (var3.length == 0 ? a(bw & bx, by) : Arrays.stream(var3).map(NLoginCore_436::getName).collect(Collectors.toList()))
                     + a(bz, ca ^ cb)
               );
               return (var33 != 0);
            } finally {
               NLoginCore_548.a(NLoginCore_425.j, var6);
            }
         }
      }
   }

   private static void b() {
      c = 7569233160499325401L;
      long var0 = c ^ 2100530349534552917L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(60 + 8),
               (byte)(52 + 17),
               (byte)(57 + 26),
               (byte)(5 + 42),
               (byte)(31 + 36),
               66,
               (byte)(35 + 32),
               (byte)(3 + 44),
               (byte)(9 + 71),
               (byte)(11 + 64),
               (byte)(46 + 21),
               (byte)(81 + 2),
               (byte)(25 + 28),
               (byte)(72 + 8),
               97,
               (byte)(77 + 23),
               (byte)(31 + 69),
               (byte)(37 + 68),
               (byte)(43 + 67),
               (byte)(44 + 59)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_183.A("ŎŅŘŰūŊŨŞŬŕŠŲźſşŠŨņżşŨŭƉŎōňŧƔƀŲňƗŦƕťŷƚŪŖƍƌƞƋƑŶƎƚřťƄƢƉŹƉƧƭƊƭƣŽƱŧƴƘƒƫƩźƜƬŻƪƵƜƟƐƟŻƷƾơƦǆƻƶƥƒƓ", (byte)64, 65);
               ZKM_STR_B[1] = NLoginCore_110.D("ӅҩӘӛӪӂҦӲӀӎӀӒӇӶӦӽӇӌӮӖӘӿӔӚӸԃӖӦԀӆӛӥԁӏӝӈӟӴӴӿӿӢӐәԎӺӳԏԋԔӶԛӛӚӼӿӤԐӴӧԆӻԂԭԘӦӧӿԳԊԎԊԟԒԮӽ", (byte)64, 68);
               ZKM_STR_B[2] = NLoginCore_324.B("łŌŵŌųįśĶźŘĹŇ", (byte)64, 66);
               ZKM_STR_B[3] = NLoginCore_427.C("ӜөӎӍӬӤӄӝҮӡӈҽ", (byte)64, 67);
               ZKM_STR_B[4] = NLoginCore_004.E("խԨձԶաժնՕՕ\u0558ԾՄ", (byte)64, 69);
               ZKM_STR_B[5] = NLoginCore_384.C("ҨӡӊӒӅҲҫӍӞӖӍӹҲҳӼӍӮәӋӪӿӛӈӉ", (byte)64, 67);
               ZKM_STR_B[6] = NLoginCore_138.E("ԿշՐդԱլԭխժՋվ՝իպՍԻմՓբՁՆֈՏՐ", (byte)64, 69);
               ZKM_STR_B[7] = NLoginCore_110.A("ōŎŰŕŕŒŞŒŲƁŁŇ", (byte)64, 65);
               ZKM_STR_B[8] = NLoginCore_027.C("һӤӛӮӓӲҮӨӉҮӸӆӭһӅӸӭӜӟӘӘӱӈӉ", (byte)64, 67);
               ZKM_STR_B[9] = NLoginCore_092.C("ҹӢҸӞүӮҭӄӕӬӓӑӰҳӐӑӏӰӰҷӹӋӈӉ", (byte)64, 67);
               ZKM_STR_B[10] = NLoginCore_183.E("ՕՠԲգԫՔիՙՏՔԺՄ", (byte)64, 69);
               ZKM_STR_B[11] = NLoginCore_138.F("ԱմՓԳԳՙյԷզո՟Մ", (byte)64, 70);
               ZKM_STR_B[12] = NLoginCore_110.D("ӗӄӬҬӟӔӋӎӶӶӄҽ", (byte)64, 68);
               ZKM_STR_B[13] = NLoginCore_324.B("ŲšōŉŊťŶŵőŌŌŰĽƄŁųŅŶŊśŭŕŒœ", (byte)64, 66);
               ZKM_STR_B[14] = NLoginCore_241.E("ԯշԲՖհԵՙչԺՖՍյՎկխփՓշԿսՁֆՕեՖզ֊ջ֏ֆՒքզՕ\u0557֙ճՙ֕նծտ֝դ", (byte)64, 69);
               ZKM_STR_B[15] = NLoginCore_471.D("ӦҡӪүӚӣӯӎӎӑҷҽ", (byte)64, 68);
               ZKM_STR_B[16] = NLoginCore_183.F("ԯըՑՙՌԹԲՔե՝ՔրԹԺփՔյՠՒձֆբՏՐ", (byte)64, 70);
               ZKM_STR_B[17] = NLoginCore_201.A("łźœŧĴůİŰŭŎƁŠŮŽŐľŷŖťńŉƋŒœ", (byte)64, 65);
               ZKM_STR_B[18] = NLoginCore_324.A("ōŎŰŕŕŒŞŒŲƁŁŇ", (byte)64, 65);
               ZKM_STR_B[19] = NLoginCore_559.D("һӤӛӮӓӲҮӨӉҮӸӆӭһӅӸӭӜӟӘӘӱӈӉ", (byte)64, 68);
               ZKM_STR_B[20] = NLoginCore_397.B("ŃŬłŨĹŸķŎşŶŝśźĽŚśřźźŁƃŕŒœ", (byte)64, 66);
               ZKM_STR_B[21] = NLoginCore_384.D("ӎәҫӜҤӍӤӒӈӍҳҽ", (byte)64, 68);
               ZKM_STR_B[22] = NLoginCore_092.A("ĴŷŖĶĶŜŸĺũŻŢŇ", (byte)64, 65);
               ZKM_STR_B[23] = NLoginCore_453.D("ӗӄӬҬӟӔӋӎӶӶӄҽ", (byte)64, 68);
               ZKM_STR_B[24] = NLoginCore_091.B("ŲšōŉŊťŶŵőŌŋŐŏőŀłŷŞƋŬŻţūŊƇŽŽƍƒƃŵƎƇŦƋŤŔŵƒƝƑƠŶŧ", (byte)64, 66);
               ZKM_STR_B[25] = NLoginCore_201.B("ŰīŴĹŤŭŹŘŘśŁŇ", (byte)64, 66);
               ZKM_STR_B[26] = NLoginCore_397.D("ҨӡӊӒӅҲҫӍӞӖӍӹҲҳӼӍӮәӋӪӿӛӈӉ", (byte)64, 68);
               ZKM_STR_B[27] = NLoginCore_027.C("ҸӰӉӝҪӥҦӦӣӄӷӖӤӳӆҴӭӌӛҺҿԁӈӉ", (byte)64, 67);
               ZKM_STR_B[28] = NLoginCore_110.C("ӃӄӦӋӋӈӔӈӨӷҷҽ", (byte)64, 67);
               ZKM_STR_B[29] = NLoginCore_387.A("ŅŮťŸŝżĸŲœĸƂŐŷŅŏƂŷŦũŢŢŻŒœ", (byte)64, 65);
               ZKM_STR_B[30] = NLoginCore_183.C("ӦҡӪүӚӣӯӎӎӑҷҽ", (byte)64, 67);
               ZKM_STR_B[31] = NLoginCore_427.E("ԯըՑՙՌԹԲՔե՝ՔրԹԺփՔյՠՒձֆբՏՐ", (byte)64, 69);
               ZKM_STR_B[32] = NLoginCore_241.A("łźœŧĴůİŰŭŎƁŠŮŽŐľŷŖťńŉƋŒœ", (byte)64, 65);
               ZKM_STR_B[33] = NLoginCore_183.C("ӃӄӦӋӋӈӔӈӨӷҷҽ", (byte)64, 67);
               ZKM_STR_B[34] = NLoginCore_138.E("Ղիբյ՚չԵկՐԵտՍմՂՌտմգզ՟՟ոՏՐ", (byte)64, 69);
               ZKM_STR_B[35] = NLoginCore_201.A("šŃŖŔĮĻŉĸųŉšŞŠşŔşšŹŶūŞƇƍŋšŤƅŲœƄŷūťƔőŭŶœŧżŚŻŚŹŚƤťŲƜųƦƌƝƕŤſƟſƐƬƏƪŮŶ", (byte)64, 65);
               ZKM_STR_B[36] = NLoginCore_433.F("լժՆըՖդշԹհ\u0557ՈսԿՊոԾ\u0557պԾքզոշթժ֎Ձւ՛ադզ֎՞ժ֘աֈոմթ֙կդ", (byte)64, 70);
               ZKM_STR_B[37] = NLoginCore_232.F("՝ԾժնյԲյԻՕկՕտՎՎՎճՍչպ՝ձՕթցՕՖՇՌժՈօըձֈևգ֖Ւ֔ճն։֠տսծ՝քք֣ռորւկհ", (byte)64, 70);
               ZKM_STR_B[38] = NLoginCore_138.C("ӥҮӮӮӎӞӒӒӒӐӧӺӮӚӶӍӴӗӴӀӟӫҺӡӹӱӔӄӚӁӨӬ", (byte)64, 67);
               ZKM_STR_B[39] = NLoginCore_575.A("ŏĳŢťŴŌİżŊŘŊŜőƀŰƇőŖŸŠŢƉŞŤƂƍŠŰƊŐťůƋřŧŒũžžƉƉŬřƃƄŝŹƐŸŢƇŹƕŵƅżƫƩƨƝųūŲƋƙƔƔƈƉƛƲƯưǀƸƇ", (byte)64, 65);
               ZKM_STR_B[40] = NLoginCore_553.D("ӨӃӝӟҩӀҦӢӂҳҲӴӧӛӼӳӦӐҹӰӎӚӚҷӘӹӶԊӡӊӶԂ", (byte)64, 68);
               ZKM_STR_B[41] = NLoginCore_433.F("՞ՋճԳզ՛ՒՕսսՋՄ", (byte)64, 70);
               ZKM_STR_B[42] = NLoginCore_553.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔաՁԽ\u0558՜խկՍՉժճեբըօբիճդոՕ֗֟ՙ֡ցձ֍կ֝ՠ֩և֘կհ", (byte)64, 69);
               ZKM_STR_B[43] = NLoginCore_141.D("ӤҪӐҧӦӮөӐӨөҪӱӬӫӆӇөҽӪӡӞӱӈӉ", (byte)64, 68);
               ZKM_STR_B[44] = NLoginCore_387.F("Ք\u0530ՃՃ՚Գ՜ոԽպԺՄ", (byte)64, 70);
               ZKM_STR_B[45] = NLoginCore_232.B("ũŭńĹŸœľŒŽŀŰŞŶſŵƂŷőƆŗŤŃƌſţŨŲŠőƐƄŗ", (byte)64, 66);
               ZKM_STR_B[46] = NLoginCore_232.F("ՎգյյոՈ՚ԲԹ՟թՄ", (byte)64, 70);
               ZKM_STR_B[47] = NLoginCore_092.F("ՃԳյՑՅԬշՐԶպՇՄ", (byte)64, 70);
               ZKM_STR_B[48] = NLoginCore_471.E("գհՕՔճիՋդԵըՏՄ", (byte)64, 69);
               ZKM_STR_B[49] = NLoginCore_453.E("աՃՇՔՎչ\u0557ԴԴՙյՄ", (byte)64, 69);
               ZKM_STR_B[50] = NLoginCore_241.C("ӟӣҺүӮӉҴӈӳҶӦӔӬӵӫӸӭӇӼӍӚҽӘӲӰӗӐӃӀӟԅԋ", (byte)64, 67);
               ZKM_STR_B[51] = NLoginCore_559.F("ճՐԮլՐոյԻժշ\u0558՟ւՀբսՒզՠռա\u0558էլչՉ֍\u0558՜\u058cՠմյգե֔ՒՖիՎը֑֒դ", (byte)64, 70);
               ZKM_STR_B[52] = NLoginCore_223.A("ŎũŰŉśĵŷļŵŋŻŏşŭŔŏŧŻũŞňŻŒœ", (byte)64, 65);
               ZKM_STR_B[53] = NLoginCore_446.C("ӟӯҧӐӑүӬӔӬҴӲҽ", (byte)64, 67);
               ZKM_STR_B[54] = NLoginCore_575.C("ӎҬӜңӲӌҮӎӵӀӈҽ", (byte)64, 67);
               ZKM_STR_B[55] = NLoginCore_223.D("ӟӣҺүӮӉҴӈӳҶӧӉөӌҷӳӏӉӼӛӋӭӂӣӻԀӝӽӫӷӪӆӛөԋӢӐӼԈԄӶԊӭәӻԛԕӕԜӝӳԖӯԑӨө", (byte)64, 68);
               ZKM_STR_B[56] = NLoginCore_324.B("ųłŶķķűşźřŝĻĿŮƂŵŞżŕſƁťŵŮŮŐŉőőƐŰƓƑ", (byte)64, 66);
               ZKM_STR_B[57] = NLoginCore_451.A("ũŭńĹŸœľŒŽŀűœųŖŁŽřœƆťŕŷŌŭƅƊŧƇŵƁŴŐťųƕŬŚƆƒƎƀƔŷţƅƥƟşƦŧŽƠŹƛŲų", (byte)64, 65);
               ZKM_STR_B[58] = NLoginCore_183.F("ՎՂյՍմձհԼԼըՏՄ", (byte)64, 70);
               ZKM_STR_B[59] = NLoginCore_091.C("ӌӟӮңӧӏӫӯӉӗӐҽ", (byte)64, 67);
               ZKM_STR_B[60] = NLoginCore_092.A("ŬŗłķŐŝşŻŰŶĽŇ", (byte)64, 65);
               ZKM_STR_B[61] = NLoginCore_027.B("ĸńŮůņŗųĹľķĹŇ", (byte)64, 66);
               ZKM_STR_B[62] = NLoginCore_324.F("գհՕՔճիՋդԵըՏՄ", (byte)64, 70);
               ZKM_STR_B[63] = NLoginCore_092.A("ŖũŸĭűřŵŹœšŚŇ", (byte)64, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_433.A("ŎŅŘŰūŊŨŞŬŕŠŲźſşŠŨņżşŨŭƉŎōňŧƔƀŲňƗŦƕťŷƚŪŖƍƌƞƋƑŶƎƚřťƄƢƉŹƉƧƭƊƭƣŽƱŧƴƘƒƫƩźƜƬŻƪƵƜƠƺƝǀǅƝƾƵƓƓƉǋƒƓ", (byte)64, 65);
               ZKM_STR_B[1] = NLoginCore_530.F(
                  "Ռ\u0530՟բձՉԭչՇՕՇՙՎսխքՎՓյ՝՟ֆ՛ատ֊՝խևՍբլֈՖդՏզջջֆֆթ\u0557ՠ֕ցպ֖֛֒ս֢բափֆի֗ջծ֍ւ։ִօֱֲ֣ևյ֎ֆֳս\u0590։֙տְֵַׇ֤֓֗\u05c8֏\u0590", (byte)64, 70
               );
               ZKM_STR_B[2] = NLoginCore_384.F("ԿզՖՒՎԷԴՆԶ՞ՒնծՍքխմձ՟սՄՒՏՐ", (byte)64, 70);
               ZKM_STR_B[3] = NLoginCore_201.E("ՅըթԶՋՎՇմՈԵԾՄ", (byte)64, 69);
               ZKM_STR_B[4] = NLoginCore_076.D("ӀӯӈҨӏӧӄӣӋӅӢҽ", (byte)64, 68);
               ZKM_STR_B[5] = NLoginCore_183.B("ĲūŔŜŏļĵŗŨŠřĺĿŤŽŘœųŞƀŅūƇžŊŜŚƊŊŢžű", (byte)64, 66);
               ZKM_STR_B[6] = NLoginCore_521.E("ԿշՐդԱլԭխժՋտրԳիչցՅէո՝ՆՆՊԾՈբվ՜֎տս\u058c", (byte)64, 69);
               ZKM_STR_B[7] = NLoginCore_004.C("ҫӟөӒӃӊӥҮӃҷүҽ", (byte)64, 67);
               ZKM_STR_B[8] = NLoginCore_559.F("Ղիբյ՚չԵկՐԵտՎՁճծՓփւկՕՈՒՏՐ", (byte)64, 70);
               ZKM_STR_B[9] = NLoginCore_027.E("ՀթԿեԶյԴՋ՜ճՙՏՌցԹՒսբՏԺ֊բՏՐ", (byte)64, 69);
               ZKM_STR_B[10] = NLoginCore_530.F("ԱՕգծՆՈշՋե\u0558ՕՙւՀմՂԾ՜րյֈոՏՐ", (byte)64, 70);
               ZKM_STR_B[11] = NLoginCore_553.E("ՃԲՏՉՒԷՓ՛թձՑն՟գկԼֆջկձՂոՏՐ", (byte)64, 69);
               ZKM_STR_B[12] = NLoginCore_387.F("ԳՁՂըո\u0530ՋԼհԵսՄ", (byte)64, 70);
               ZKM_STR_B[13] = NLoginCore_076.E("կ՞ՊՆՇբճղՎՉՊ՚չՐԻ\u0558պ՝Թ\u0557֊ՒՏՐ", (byte)64, 69);
               ZKM_STR_B[14] = NLoginCore_232.E("ԯշԲՖհԵՙչԺՖՍյՎկխփՓշԿսՁֆՕեՖզ֊ջ֏ֆՒքֆզւՔո\u0558հ֛֓՚֎֙֍֗\u058c֍ծճռ֛յղկհ", (byte)64, 69);
               ZKM_STR_B[15] = NLoginCore_433.F("դծեիլԳթ\u0558Ց\u0530յՄ", (byte)64, 70);
               ZKM_STR_B[16] = NLoginCore_451.D("ҨӡӊӒӅҲҫӍӞӖӏҳӵҹӨӔӖӑӟӐҺӖԅӄӽԂӲӞԋӛԄӻ", (byte)64, 68);
               ZKM_STR_B[17] = NLoginCore_451.F("ԿշՐդԱլԭխժՋտըողՏխւհ՛՛ՅբՄգֈ\u0558՜Վվ֎ռև", (byte)64, 70);
               ZKM_STR_B[18] = NLoginCore_575.F("բդՔԵՄշ՜ՒԴՖխՄ", (byte)64, 70);
               ZKM_STR_B[19] = NLoginCore_183.D("һӤӛӮӓӲҮӨӉҮӸӄӐӷӨӆӿӠӱӿӲӋӈӉ", (byte)64, 68);
               ZKM_STR_B[20] = NLoginCore_127.A("ŃŬłŨĹŸķŎşŶśŞĻĿŗůŤŲũņŸƋŒœ", (byte)64, 65);
               ZKM_STR_B[21] = NLoginCore_091.C("ҺҾӌӎӒӏӧӋӮҶӊӴӘӬӺӒәӞӨӲӝӱӈӉ", (byte)64, 67);
               ZKM_STR_B[22] = NLoginCore_201.E("ղԵԭդՙմկԲն՞ՠՎ՞ծՑվհ՜ՅՠևֈՏՐ", (byte)64, 69);
               ZKM_STR_B[23] = NLoginCore_387.B("ūŎūĹĶĵİŹŲŗŒŇ", (byte)64, 66);
               ZKM_STR_B[24] = NLoginCore_091.B("ŲšōŉŊťŶŵőŌŋŐŏőŀłŷŞƋŬŻţūŊƇŽŽƍƒƃŵƎűŧŚƑŎūũžŘƗšŧ", (byte)64, 66);
               ZKM_STR_B[25] = NLoginCore_232.B("œřŌňĳŸĴŮŵŵƀŇ", (byte)64, 66);
               ZKM_STR_B[26] = NLoginCore_127.B("ĲūŔŜŏļĵŗŨŠŖĺŭŹżœƆŦƈƂńƁŜſŠƅũžŞŏŖƀ", (byte)64, 66);
               ZKM_STR_B[27] = NLoginCore_530.D("ҸӰӉӝҪӥҦӦӣӄӷӮұӅӻӈӾӠӘӟӂӛӟӕӝԅӑӑӲԋӨӧ", (byte)64, 68);
               ZKM_STR_B[28] = NLoginCore_433.E("ԭՍյճԱ՚ԵՖինԾՄ", (byte)64, 69);
               ZKM_STR_B[29] = NLoginCore_324.F("Ղիբյ՚չԵկՐԵվմՕՏՋՐձչ\u0557՛\u0557ոՏՐ", (byte)64, 70);
               ZKM_STR_B[30] = NLoginCore_397.E("ՠճԿԳմ\u0557իՕՓՊՏՄ", (byte)64, 69);
               ZKM_STR_B[31] = NLoginCore_427.B("ĲūŔŜŏļĵŗŨŠřţŭŅŜŚŷŴŝŨŊťśƍſŇŚŮŢŒƐƄ", (byte)64, 66);
               ZKM_STR_B[32] = NLoginCore_223.E("ԿշՐդԱլԭխժՋսհծԴՏ\u0557ՓՔպ։Ձ՚Ֆիՠժ\u0558ս֏Վւ՞", (byte)64, 69);
               ZKM_STR_B[33] = NLoginCore_324.E("ՈիյյԫԬԷԶՕՕչՄ", (byte)64, 69);
               ZKM_STR_B[34] = NLoginCore_471.B("ŅŮťŸŝżĸŲœĸƃĹŞŻšŐŦŅťƉŷŕŒœ", (byte)64, 66);
               ZKM_STR_B[35] = NLoginCore_553.A("šŃŖŔĮĻŉĸųŉšŞŠşŔşšŹŶūŞƇƍŋšŤƅŲœƄŷūťƔőŭŶœŧżŚŻŚŹŚƤťŲƜųƦƌƝƍūſŢƭƌƫƋƊƃƎƩƺƕƘƙƒŴƸƓƌƁƇ", (byte)64, 65);
               ZKM_STR_B[36] = NLoginCore_027.C("ӥӣҿӡӏӝӰҲөӐӁӶҸӃӱҷӐӳҷӽӟӱӰӢӣԇҺӻӔӚӝӟӥӮӰӞӳӋӞӥӑԗԂӝ", (byte)64, 67);
               ZKM_STR_B[37] = NLoginCore_471.C("ӖҷӣӯӮҫӮҴӎӨӎӸӇӇӇӬӆӲӳӖӪӎӢӺӎӏӀӅӣӁӾӡӪԁԀӜԏӋԍӬӯԂԘԌԘԜӛӴԔԏӚӶԃԑӨө", (byte)64, 67);
               ZKM_STR_B[38] = NLoginCore_471.E("լԵյյՕեՙՙՙ\u0557ծցյասՔջ՞ջՇզշՕտֈջւլց֑էՑՇց֊֎ոչդՓ֖յջդ", (byte)64, 69);
               ZKM_STR_B[39] = NLoginCore_521.A("ŏĳŢťŴŌİżŊŘŊŜőƀŰƇőŖŸŠŢƉŞŤƂƍŠŰƊŐťůƋřŧŒũžžƉƉŬřƃƄŝŹƐŸŢƇŹƕŵƅżƫƩƨƝųūŲƋƍƭƨƐżƺƻƿƎƸƁƇ", (byte)64, 65);
               ZKM_STR_B[40] = NLoginCore_076.C("ӨӃӝӟҩӀҦӢӂҳҲӴӧӛӼӳӦӐҹӰӎӓӵӻӤӻԀӼӼӉӚҿ", (byte)64, 67);
               ZKM_STR_B[41] = NLoginCore_397.C("ҠӆҼҰӱӮӄҬҲӑӮҽ", (byte)64, 67);
               ZKM_STR_B[42] = NLoginCore_110.C("ӟӣҺүӮӉҴӈӳҶӦӔӬӵӫӸӭӇӼӍӚҺҶӑӕӦӨӆӂӣӬӞӛӡӾӛӤӬӝӱӎԐԙӸӻӬӷԆӧԕӴӰԣԡӨө", (byte)64, 67);
               ZKM_STR_B[43] = NLoginCore_223.D("ӤҪӐҧӦӮөӐӨөҮӊҷҶӘӇӞҵҹҿӢӗӹӘӧӔӤӴӛӞӺӊ", (byte)64, 68);
               ZKM_STR_B[44] = NLoginCore_110.E("հՃՅՇ\u0558պհՋ՞շ՟Մ", (byte)64, 69);
               ZKM_STR_B[45] = NLoginCore_183.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔա։ոիՅՇդձ։ՐռՑ", (byte)64, 69);
               ZKM_STR_B[46] = NLoginCore_127.D("ӃҪӜӇӎҭӔӇӲӊҮӣӶӜҮӾӱӏӵӻӯӱӈӉ", (byte)64, 68);
               ZKM_STR_B[47] = NLoginCore_223.B("ŭİŪŉźŉķŠŋşŒŇ", (byte)64, 66);
               ZKM_STR_B[48] = NLoginCore_138.E("զՐ՟ԶժՂնթԷ՞թՄ", (byte)64, 69);
               ZKM_STR_B[49] = NLoginCore_027.D("ҾӏҺӞӦҭӲӉӦӭӕӃӳӶӝӺӷӌӹӴӁӱӈӉ", (byte)64, 68);
               ZKM_STR_B[50] = NLoginCore_201.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔաՀ՚ֆիՇ\u0558Պ\u058bՍխժ։վ\u0590միղ֒Վվ֚ջդ", (byte)64, 69);
               ZKM_STR_B[51] = NLoginCore_521.F("ճՐԮլՐոյԻժշ\u0558՟ւՀբսՒզՠռա\u0558էլչՉ֍\u0558՜\u058cՠմֈխււի֍ֆ֖֘֞կդ", (byte)64, 70);
               ZKM_STR_B[52] = NLoginCore_387.F("ՋզխՆ\u0558ԲմԹղՈշՓ՜գգհճքդՈօբՏՐ", (byte)64, 70);
               ZKM_STR_B[53] = NLoginCore_397.B("ũŘŷťūŮŕĻšŰŖŇ", (byte)64, 66);
               ZKM_STR_B[54] = NLoginCore_397.A("ķŔźœķŶŖűœŔŸĺťŘŞŀŹłźŖŜŻŒœ", (byte)64, 65);
               ZKM_STR_B[55] = NLoginCore_433.F("զժՁԶյՐԻՏպԽծՐհՓԾպՖՐփբՒմՉժւևդքղվձՍբհ֒թ\u0557փ֏\u058bս֑յրլր֔չաճղռձ֨կհ", (byte)64, 70);
               ZKM_STR_B[56] = NLoginCore_521.A("ųłŶķķűşźřŝĻĿŮƂŵŞżŕſƁťźƇťźŋƁƉŪƆƖť", (byte)64, 65);
               ZKM_STR_B[57] = NLoginCore_575.D("ӟӣҺүӮӉҴӈӳҶӧӉөӌҷӳӏӉӼӛӋӭӂӣӻԀӝӽӫӷӪӆӛөԋӢӐӼԈԄӶԊӭӵԇԏӲӬӶӫԔԟԀԡӨө", (byte)64, 68);
               ZKM_STR_B[58] = NLoginCore_553.F("կմՊՠՅ՛մկԽ՚ՇՄ", (byte)64, 70);
               ZKM_STR_B[59] = NLoginCore_559.B("ŪŋŏŅŗŗŋŔŠőĹŇ", (byte)64, 66);
               ZKM_STR_B[60] = NLoginCore_183.D("ӠҿӯӝӌҭӜӪӡҳүҽ", (byte)64, 68);
               ZKM_STR_B[61] = NLoginCore_530.D("ӍӃҽӡӬӝӄҧӆӣӀҽ", (byte)64, 68);
               ZKM_STR_B[62] = NLoginCore_173.A("įźŇĲŷŽźŞůşĽŇ", (byte)64, 65);
               ZKM_STR_B[63] = NLoginCore_453.A("ĴķŕňőŭĻūĻŻŞŐŏŹŐņƆŲŔŊřťŒœ", (byte)64, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.C("ӞӆҹҭӳұӔұӇӫӓҲӪӜӎӸӍӳӫӮӳԁӈӉ", (byte)64, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_427.C("ӞӥӇӁӠӃӤӡӱӠӑӅӷҷӤӔӚәӵӵӶӛӈӉ", (byte)64, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_416.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_433.F("Ե\u0557ՙԹ՝ռմ֊նՅփչևցՊկ֑\u0590ֈ֎ֈ՝", (byte)81, 70), NLoginCore_416.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.A("ƄƑƐœƓƏƊƓƞƍŚƘƜƕƘƞŠӺӴӰӴӼӼӵӺӺӎӼԀԇŹ", (byte)81, 65) + var1 + NLoginCore_397.A("ś", (byte)81, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private long a(Object var1) {
      if (var1 instanceof String) {
         String var2 = (String)var1;
         if (!var2.isEmpty() && !a(jm & jn, jo).equalsIgnoreCase(var2)) {
            try {
               return Long.parseLong(var2);
            } catch (NumberFormatException var4) {
               return System.currentTimeMillis();
            }
         } else {
            return System.currentTimeMillis();
         }
      } else if (var1 instanceof Number) {
         return ((Number)var1).longValue();
      } else {
         return var1 instanceof Timestamp ? ((Timestamp)var1).getTime() : System.currentTimeMillis();
      }
   }

   @Nullable
   NLoginCore_171 a(NLoginCore_459 var1, String var2, Object... var3) {
      if (var2 == null || var2.isEmpty()) {
         throw new IllegalArgumentException(a(fq, fr));
      } else if (var3.length == 0) {
         throw new IllegalArgumentException(a(fs, ft));
      } else if (var1 == null) {
         throw new IllegalStateException(a(fu, fv ^ fw));
      } else {
         long var4 = System.nanoTime();

         try {
            StringBuilder var10000 = new StringBuilder();
            String var10001 = a(fx, fy ^ fz);
            Object[] var10002 = new Object[ga];
            var10002[gb] = NLoginCore_477.e.a(new Object[gc]);
            String var6 = var10000.append(String.format(var10001, var10002)).append(a(gd, ge)).append(var2).toString();
            return var1.a(var6, var3);
         } catch (Exception var11) {
            NLoginCore_370.c(a(gf, gg ^ gh) + var2 + a(gi, gj ^ gk) + Arrays.toString(var3) + a(gl & gm, gn), var11);
         } finally {
            NLoginCore_548.a(NLoginCore_425.i, var4);
         }

         return null;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= 2100530349534552917L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(38 + 30),
                     (byte)(42 + 27),
                     (byte)(55 + 28),
                     (byte)(8 + 39),
                     (byte)(20 + 47),
                     (byte)(11 + 55),
                     (byte)(39 + 28),
                     (byte)(10 + 37),
                     (byte)(37 + 43),
                     (byte)(57 + 18),
                     (byte)(33 + 34),
                     (byte)(53 + 30),
                     (byte)(8 + 45),
                     (byte)(73 + 7),
                     (byte)(20 + 77),
                     (byte)(62 + 38),
                     (byte)(85 + 15),
                     105,
                     (byte)(12 + 98),
                     (byte)(32 + 71)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.D("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߨߢߞߢߪߪߣߨߨ\u07bcߪ߮ߵ", (byte)30, 68));
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

   @Generated
   NLoginCore_416() {
   }

   private boolean d(@Nonnull String var1) {
      return ((var1.length() != 0) >= it && var1.charAt(iu) == iv && var1.charAt(var1.length() - iw) == ix ? iy : iz);
   }
}
