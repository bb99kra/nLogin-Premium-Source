package com.nickuc.login;

import com.nickuc.login.loader.MemClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_583 {
   private static int fv = (0 >>> 9 | 0 << ~9 + 1) & -1;
   private static int iv = Integer.reverse(0);
   private static long go = Long.reverse(576460752303423488L);
   private static int eb = 8704 >>> 104 | 8704 << -104;
   private static int hn = Integer.reverse(0);
   private static int fr = Integer.reverse(335544320);
   private static long dj = Long.reverse(3319838577979013691L);
   private static int af = 134217728 >>> 56 | 134217728 << -56;
   private static int hc = Integer.reverse(-1946157056);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = Integer.reverse(-2013265920);
   private static long ba = Long.reverse(576460752303423488L);
   private static int ev = (0 >>> 141 | 0 << ~141 + 1) & -1;
   private static int br = Integer.reverse(1207959552);
   private static long ah = Long.reverse(3319838577979013691L);
   private static long ih = Long.reverse(2743377825675590203L);
   private static long ef = Long.reverse(576460752303423488L);
   private static int de = Integer.reverse(-1207959552);
   private static int da = Integer.reverse(939524096);
   private static int du = Integer.reverse(0);
   private static long hy = Long.reverse(2743377825675590203L);
   private static long gw = Long.reverse(576460752303423488L);
   private static int fj = Integer.reverse(Integer.MIN_VALUE);
   private static int cx = 13824 >>> 41 | 13824 << -41;
   private static long ii = Long.reverse(576460752303423488L);
   private static int ci = Integer.reverse(-402653184);
   private static int q = (33554432 >>> 55 | 33554432 << ~55 + 1) & -1;
   private static long ak = Long.reverse(2743377825675590203L);
   private static long be = Long.reverse(576460752303423488L);
   private static int id = (212 >>> 194 | 212 << ~194 + 1) & -1;
   private static int cu = Integer.reverse(-1);
   private static int hp = 16777216 >>> 88 | 16777216 << -88;
   private static long bm = Long.reverse(576460752303423488L);
   private static int bf = Integer.reverse(0);
   private static int bx = 0 >>> 127 | 0 << -127;
   private static int fx = 'ꐀ' >>> 234 | 41984 << ~234 + 1;
   private static int ex = 73728 >>> 107 | 73728 << ~107 + 1;
   private static int cm = Integer.reverse(402653184);
   private static long iy = Long.reverse(576460752303423488L);
   private static int bt = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static int eh = Integer.reverse(Integer.MIN_VALUE);
   private static long bl = Long.reverse(2743377825675590203L);
   private static long bw = Long.reverse(576460752303423488L);
   private static int ag = (-1 >>> 225 | -1 << -225) & -1;
   private static long gh = Long.reverse(2743377825675590203L);
   private static int em = Integer.reverse(0);
   private static int bq = Integer.reverse(0);
   private static int hg = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_583.jg];
   private static int at = (0 >>> 167 | 0 << ~167 + 1) & -1;
   private static int cs = (0 >>> 80 | 0 << ~80 + 1) & -1;
   private static int fg = (0 >>> 112 | 0 << -112) & -1;
   private static long r = Long.reverse(2743377825675590203L);
   private static int el = Integer.reverse(Integer.MIN_VALUE);
   private static int y = Integer.reverse(1610612736);
   private static long c;
   private final Map<NLoginInterface_034, Path> f = new HashMap<>();
   private static long gk = Long.reverse(2743377825675590203L);
   private static int ht = (0 >>> 188 | 0 << ~188 + 1) & -1;
   private static int dy = Integer.reverse(-1);
   private static int b = 0 >>> 44 | 0 << -44;
   private static int ed = Integer.reverse(-1006632960);
   private static long gv = Long.reverse(2743377825675590203L);
   private static int cz = (0 >>> 104 | 0 << ~104 + 1) & -1;
   private static int f = Integer.reverse(-1);
   private static int hs = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(-1610612736);
   private static int fk = Integer.reverse(0);
   private static int er = (512 >>> 233 | 512 << ~233 + 1) & -1;
   private static long as = Long.reverse(3319838577979013691L);
   private static int gu = Integer.reverse(-201326592);
   private static long cg = Long.reverse(3319838577979013691L);
   private static int aj = 2359296 >>> 50 | 2359296 << -50;
   private static int bk = 1024 >>> 102 | 1024 << -102;
   private static int in = Integer.reverse(-335544320);
   private static long hk = Long.reverse(2743377825675590203L);
   private static int ea = (0 >>> 196 | 0 << -196) & -1;
   private static int eu = (4194304 >>> 214 | 4194304 << -214) & -1;
   final File g;
   private static int dd = Integer.reverse(0);
   private static long ee = Long.reverse(2743377825675590203L);
   private static long ck = Long.reverse(576460752303423488L);
   private static int dl = -2147483633 >>> 95 | -2147483633 << ~95 + 1;
   private static int dx = Integer.reverse(-2080374784);
   private static long ir = Long.reverse(3319838577979013691L);
   private static long je = Long.reverse(3319838577979013691L);
   private static int co = 0 >>> 200 | 0 << -200;
   private static int jd = Integer.reverse(-1);
   private static long cj = Long.reverse(2743377825675590203L);
   private static int aa = Integer.reverse(0);
   private static int bg = Integer.reverse(-268435456);
   private static int bb = Integer.reverse(0);
   private static int cw = 0 >>> 138 | 0 << -138;
   private static int iw = (119537664 >>> 21 | 119537664 << -21) & -1;
   private static int il = Integer.reverse(Integer.MIN_VALUE);
   private static int fd = (0 >>> 143 | 0 << -143) & -1;
   private static int gd = Integer.reverse(0);
   private static long df = Long.reverse(3319838577979013691L);
   private static int gf = Integer.reverse(Integer.MIN_VALUE);
   private static int ds = 0 >>> 222 | 0 << -222;
   private static long k = Long.reverse(576460752303423488L);
   private static long ix = Long.reverse(2743377825675590203L);
   private static int fp = Integer.reverse(-469762048);
   private static int fu = (0 >>> 190 | 0 << ~190 + 1) & -1;
   private static long az = Long.reverse(2743377825675590203L);
   private static long bd = Long.reverse(2743377825675590203L);
   private static int es = 0 >>> 196 | 0 << -196;
   private static int fc = (0 >>> 91 | 0 << -91) & -1;
   private static long var_if = Long.reverse(576460752303423488L);
   private static long fa = Long.reverse(2743377825675590203L);
   private static int x = 0 >>> 132 | 0 << -132;
   private static int am = Integer.reverse(0);
   private static int p = Integer.reverse(0);
   private static int bz = Integer.reverse(671088640);
   private static int dq = Integer.reverse(-1);
   private static long o = Long.reverse(576460752303423488L);
   private static int gq = Integer.reverse(0);
   private static int dp = 512 >>> 100 | 512 << -100;
   private static long j = Long.reverse(2743377825675590203L);
   private static long ha = Long.reverse(2743377825675590203L);
   private static int hx = 106496 >>> 107 | 106496 << -107;
   private static long ce = Long.reverse(576460752303423488L);
   private static int jh = 30208 >>> 201 | 30208 << -201;
   private static long ip = Long.reverse(576460752303423488L);
   private static int ig = 905969664 >>> 88 | 905969664 << ~88 + 1;
   private static long hz = Long.reverse(576460752303423488L);
   private static int ar = -1073741822 >>> 158 | -1073741822 << -158;
   private static int iq = 112 >>> 193 | 112 << -193;
   private static int fi = 256 >>> 72 | 256 << -72;
   private static long bv = Long.reverse(2743377825675590203L);
   private static int ax = Integer.reverse(0);
   private static long gl = Long.reverse(576460752303423488L);
   private static int dm = -1 >>> 116 | -1 << -116;
   private static int ae = Integer.reverse(0);
   private static int ch = Integer.reverse(0);
   private static int bu = Integer.reverse(-939524096);
   private static long hl = Long.reverse(576460752303423488L);
   private static int var_do = 0 >>> 221 | 0 << -221;
   private static int cf = Integer.reverse(1744830464);
   private static int c = Integer.reverse(-1);
   private static long g = Long.reverse(3319838577979013691L);
   private static long cn = Long.reverse(3319838577979013691L);
   private static long gi = Long.reverse(576460752303423488L);
   private static long bs = Long.reverse(3319838577979013691L);
   private static long fb = Long.reverse(576460752303423488L);
   private static int fm = Integer.reverse(1677721600);
   private static int en = 0 >>> 48 | 0 << -48;
   private static long fz = Long.reverse(576460752303423488L);
   private static int di = -1 >>> 9 | -1 << -9;
   private static int gx = 0 >>> 140 | 0 << ~140 + 1;
   private static int ct = Integer.reverse(1476395008);
   private static int gy = Integer.reverse(0);
   private static int hr = 0 >>> 3 | 0 << -3;
   private static long gs = Long.reverse(2743377825675590203L);
   private static long n = Long.reverse(2743377825675590203L);
   private static long dt = Long.reverse(913667774402789376L);
   private static int dw = (0 >>> 163 | 0 << ~163 + 1) & -1;
   private static long w = Long.reverse(576460752303423488L);
   private static int fw = Integer.reverse(Integer.MIN_VALUE);
   private static int cl = (0 >>> 184 | 0 << ~184 + 1) & -1;
   private static long aw = Long.reverse(576460752303423488L);
   private static int gg = Integer.reverse(-738197504);
   private static long ey = Long.reverse(3319838577979013691L);
   private static int db = -1 >>> 125 | -1 << -125;
   private static int hu = (1 >>> 96 | 1 << ~96 + 1) & -1;
   private static long cd = Long.reverse(2743377825675590203L);
   private static int ay = Integer.reverse(-1342177280);
   private static long bp = Long.reverse(3319838577979013691L);
   private static int ib = Integer.reverse(1073741824);
   private static int t = (0 >>> 220 | 0 << ~220 + 1) & -1;
   private static long al = Long.reverse(576460752303423488L);
   private static long ft = Long.reverse(576460752303423488L);
   private static int dg = Integer.reverse(0);
   private static int gr = (-536870910 >>> 188 | -536870910 << -188) & -1;
   private static int ei = Integer.reverse(0);
   private static long cb = Long.reverse(576460752303423488L);
   private static long fq = Long.reverse(3319838577979013691L);
   NLoginCore_084 a;
   private static int dh = 15360 >>> 137 | 15360 << ~137 + 1;
   private static long bh = Long.reverse(2743377825675590203L);
   private static int ga = (21504 >>> 137 | 21504 << -137) & -1;
   private static int hd = (-1 >>> 41 | -1 << -41) & -1;
   private static int e = (134217728 >>> 251 | 134217728 << -251) & -1;
   private static long fs = Long.reverse(2743377825675590203L);
   private static int hi = Integer.reverse(-201326592);
   private static int ai = (0 >>> 76 | 0 << ~76 + 1) & -1;
   private static long gb = Long.reverse(3319838577979013691L);
   private static int bn = Integer.reverse(0);
   private static long d = Long.reverse(3319838577979013691L);
   private static long dz = Long.reverse(3319838577979013691L);
   private static int ab = Integer.reverse(-536870912);
   private static int ao = Integer.reverse(1342177280);
   private static int eq = Integer.reverse(Integer.MIN_VALUE);
   private static long v = Long.reverse(2743377825675590203L);
   private static int ik = 0 >>> 127 | 0 << ~127 + 1;
   private static int ho = Integer.reverse(0);
   private static long ec = Long.reverse(3319838577979013691L);
   private static long fo = Long.reverse(576460752303423488L);
   private static int et = Integer.reverse(0);
   private static long by = Long.reverse(913667774402789376L);
   private static int ij = (1048576 >>> 148 | 1048576 << -148) & -1;
   private static int gz = Integer.reverse(201326592);
   private static long cq = Long.reverse(2743377825675590203L);
   private static long ad = Long.reverse(576460752303423488L);
   private static int ez = (4849664 >>> 49 | 4849664 << -49) & -1;
   private static long fn = Long.reverse(2743377825675590203L);
   private static int bc = Integer.reverse(1879048192);
   private static int jc = Integer.reverse(1543503872);
   private static int ej = (0 >>> 142 | 0 << ~142 + 1) & -1;
   private static int cc = Integer.reverse(-1476395008);
   private static int hm = (536870912 >>> 61 | 536870912 << -61) & -1;
   private static long hw = Long.reverse(3319838577979013691L);
   private static int eo = Integer.reverse(Integer.MIN_VALUE);
   private static int cp = (50 >>> 225 | 50 << -225) & -1;
   private static int jg = Integer.reverse(-603979776);
   private static long bi = Long.reverse(576460752303423488L);
   private static long aq = Long.reverse(3319838577979013691L);
   private static int iz = Integer.reverse(1073741824);
   private static long av = Long.reverse(2743377825675590203L);
   private static int jf = (0 >>> 123 | 0 << ~123 + 1) & -1;
   private static int gc = (0 >>> 230 | 0 << -230) & -1;
   private final Map<NLoginCore_114<NLoginInterface_034>, NLoginCore_200> g = new HashMap<>();
   private static int is = 0 >>> 123 | 0 << ~123 + 1;
   private static int h = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[jh];
   private static int dv = (128 >>> 231 | 128 << -231) & -1;
   private final MemClassLoader a;
   private static int m = 3 >>> 96 | 3 << ~96 + 1;
   private static long z = Long.reverse(3319838577979013691L);
   private static int hj = Integer.reverse(1275068416);
   private static int au = Integer.reverse(805306368);
   private static long cv = Long.reverse(3319838577979013691L);
   private static int ic = (0 >>> 166 | 0 << -166) & -1;
   private static int gj = -1342177280 >>> 122 | -1342177280 << -122;
   private static int ap = Integer.reverse(-1);
   private static long an = Long.reverse(913667774402789376L);
   private static long he = Long.reverse(3319838577979013691L);
   private static int bj = Integer.reverse(0);
   private static int ff = (0 >>> 153 | 0 << -153) & -1;
   private static int fh = (0 >>> 206 | 0 << -206) & -1;
   private static long s = Long.reverse(576460752303423488L);
   private static int gp = (0 >>> 216 | 0 << -216) & -1;
   private static long fy = Long.reverse(2743377825675590203L);
   private static int ew = 16 >>> 4 | 16 << -4;
   private static int hf = Integer.reverse(0);
   private static long dc = Long.reverse(3319838577979013691L);
   private static int it = Integer.reverse(0);
   private static int ge = Integer.reverse(0);
   private static long ac = Long.reverse(2743377825675590203L);
   private static int iu = Integer.reverse(Integer.MIN_VALUE);
   private static long dr = Long.reverse(3319838577979013691L);
   private static long dn = Long.reverse(3319838577979013691L);
   private static long ca = Long.reverse(2743377825675590203L);
   private static int i = Integer.reverse(1073741824);
   private static long cr = Long.reverse(576460752303423488L);
   private static int dk = Integer.reverse(0);
   private static long gn = Long.reverse(2743377825675590203L);
   private static long gt = Long.reverse(576460752303423488L);
   private static long io = Long.reverse(2743377825675590203L);
   private static long ie = Long.reverse(2743377825675590203L);
   private static int hq = Integer.reverse(0);
   private static int ia = (0 >>> 149 | 0 << ~149 + 1) & -1;
   private static int ek = Integer.reverse(Integer.MIN_VALUE);
   private static int eg = Integer.reverse(0);
   private static int im = (0 >>> 138 | 0 << ~138 + 1) & -1;
   private static int ep = 65536 >>> 16 | 65536 << ~16 + 1;
   private static int fe = Integer.reverse(Integer.MIN_VALUE);
   private final String aH;
   private static int fl = (0 >>> 150 | 0 << ~150 + 1) & -1;
   private static long cy = Long.reverse(3319838577979013691L);
   private static int gm = Integer.reverse(-1275068416);
   private static int jb = 64 >>> 6 | 64 << -6;
   private static long hb = Long.reverse(576460752303423488L);
   private static int hv = (835584 >>> 174 | 835584 << ~174 + 1) & -1;
   private static int hh = 5888 >>> 103 | 5888 << -103;
   private static int ja = Integer.reverse(0);

   public boolean a(NLoginInterface_034... var1) {
      NLoginInterface_034[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = eg; var4 < var3; var4++) {
         NLoginInterface_034 var5 = var2[var4];
         if (!this.a(var5, (eh != 0), (ei != 0))) {
            return (ej != 0);
         }
      }

      return (ek != 0);
   }

   @Nullable
   Path a(NLoginInterface_034 var1) {
      File var2 = var1.a(this, (ge != 0));
      if (var2.exists()) {
         return var2.toPath();
      } else {
         File var3 = var1.a(this, (gf != 0));
         if (!var1.a().isEmpty()) {
            try {
               this.a.a(var3, var2, var1);
            } catch (Exception var5) {
               throw new RuntimeException(a(gg, gh ^ gi) + var1.A(), var5);
            }

            if (!var3.delete()) {
               var3.deleteOnExit();
            }
         } else {
            if (!var3.renameTo(var2)) {
               NLoginCore_370.d(a(gj, gk ^ gl) + var1.A() + a(gm, gn ^ go));
               return null;
            }

            if (!var3.delete()) {
               var3.deleteOnExit();
            }
         }

         return var2.toPath();
      }
   }

   public boolean b(NLoginInterface_034 var1) {
      return var1.a(this, (dw != 0)).exists();
   }

   public boolean a(NLoginInterface_011<?> var1, NLoginInterface_034[] var2) {
      try {
         return NLoginCore_315.a(var1, this, var2);
      } catch (Throwable var7) {
         boolean var4 = NLoginCore_305.a().a(a(cc, cd ^ ce)).ag();
         NLoginCore_370.a(var7);
         NLoginCore_370.d(a(cf, cg));
         NLoginCore_370.d(a(ci, cj ^ ck));
         NLoginCore_370.d(a(cm, cn));
         if (!var4) {
            NLoginCore_370.d(a(cp, cq ^ cr));
            NLoginCore_370.d(a(ct & cu, cv));
         } else {
            NLoginCore_370.d(a(cx, cy));
            NLoginCore_370.d(a(da & db, dc));
            NLoginCore_370.d(a(de, df));
         }

         NLoginCore_370.d(a(dh & di, dj));
         NLoginCore_370.d(a(dl & dm, dn));
         NLoginCore_370.d(a(dp & dq, dr));

         try {
            Thread.sleep(dt);
         } catch (InterruptedException var6) {
            NLoginCore_370.a(var6);
         }

         return (du != 0);
      }
   }

   static {
      b();
   }

   public boolean b(NLoginInterface_034 var1, boolean var2) {
      File var3 = var1.a(this, var2);
      if (var3.exists() && !var3.delete()) {
         var3.deleteOnExit();
         String var4 = var1.A();
         NLoginCore_370.d(a(in, io ^ ip) + var4 + a(iq, ir));
         return (it != 0);
      } else {
         return (iu != 0);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 16L;
      var1 ^= -6788105291830877174L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(22 + 46),
                     (byte)(21 + 48),
                     (byte)(44 + 39),
                     (byte)(23 + 24),
                     (byte)(54 + 13),
                     (byte)(44 + 22),
                     (byte)(60 + 7),
                     (byte)(2 + 45),
                     (byte)(33 + 47),
                     (byte)(74 + 1),
                     (byte)(52 + 15),
                     (byte)(33 + 50),
                     (byte)(10 + 43),
                     (byte)(17 + 63),
                     (byte)(95 + 2),
                     (byte)(4 + 96),
                     (byte)(76 + 24),
                     105,
                     110,
                     (byte)(69 + 34)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(66 + 17)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.C("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉ\u082fࡡ࠽ࡧࡗࡑࡩࡖࡆࡇࡖ࡚\u086fࡱ", (byte)71, 67));
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

   @Nullable
   private String a(NLoginInterface_034 var1) {
      String var2 = var1.c();
      if (var2 != null) {
         List var3 = var1.a();
         if (!var3.isEmpty()) {
            String var4 = ((NLoginCore_398)var3.get(iv)).F();
            String var10000 = a(iw, ix ^ iy);
            Object[] var10001 = new Object[iz];
            var10001[ja] = this.aH;
            var10001[jb] = var4 + a(jc & jd, je) + var2;
            var2 = String.format(var10000, var10001);
         }
      }

      return var2;
   }

   @Generated
   public String B() {
      return this.aH;
   }

   boolean a(NLoginInterface_034 var1, boolean var2, boolean var3) {
      if (this.f.containsKey(var1)) {
         return (ep != 0);
      } else if (!this.b(var1, (eq != 0), (er != 0))) {
         return (es != 0);
      } else {
         Path var4 = this.a(var1);
         if (var4 == null) {
            return (et != 0);
         } else {
            byte var5 = this.a(var1, ((!var2 ? eu : ev) != 0), var3);
            switch (var5) {
               case 0:
                  this.f.put(var1, var4);
                  return (ew != 0);
               case 1:
                  this.c(var1);
               default:
                  if (!var2) {
                     return (fg != 0);
                  } else {
                     String var6 = var1.A();
                     NLoginCore_370.c(a(ex, ey) + var6 + a(ez, fa ^ fb));
                     return ((this.c(var1) != 0) && this.a(var1, (fd != 0), var3) ? fe : ff);
                  }
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_583.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.B("ƅƧƩƉƭǌǄǚǆƕǓǉǗǑƚƿǡǠǘǞǘƭ", (byte)111, 66), NLoginCore_583.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.D("եղձԴմհիմտծԻչսնչտՁࢧࣙࢵ࣏ࣟࣉ࣡࣎ࢾࢿ࣒ࣩ࣎ࣧ՛", (byte)111, 68) + var1 + NLoginCore_201.E("ե", (byte)111, 69) + var2.toString(), var4
         );
      }
   }

   public boolean a(NLoginInterface_034 var1) {
      return var1.a(this, (dv != 0)).exists();
   }

   public NLoginCore_200 a(NLoginInterface_034... var1) {
      if (var1.length == 0) {
         throw new IllegalArgumentException(a(dx & dy, dz));
      } else {
         NLoginInterface_034[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = ea; var4 < var3; var4++) {
            NLoginInterface_034 var5 = var2[var4];
            if (!this.f.containsKey(var5)) {
               throw new IllegalStateException(a(eb, ec) + var5 + a(ed, ee ^ ef));
            }
         }

         NLoginCore_114 var8 = NLoginCore_114.a(var1);
         synchronized (this.g) {
            NLoginCore_200 var10 = this.g.get(var8);
            if (var10 != null) {
               return var10;
            } else {
               URL[] var12 = var8.stream().map(this.f::get).map(var0 -> {
                  try {
                     return var0.toUri().toURL();
                  } catch (MalformedURLException var2x) {
                     throw new RuntimeException(var2x);
                  }
               }).toArray(URL[]::new);
               var10 = new NLoginCore_200(var12);
               this.g.put(var8, var10);
               return var10;
            }
         }
      }
   }

   public boolean a(Set<NLoginInterface_034> var1) {
      for (NLoginInterface_034 var3 : var1) {
         if (!this.a(var3, (el != 0), (em != 0))) {
            return (en != 0);
         }
      }

      return (eo != 0);
   }

   public boolean c(NLoginInterface_034 var1) {
      return ((this.b(var1, (ij != 0) != 0)) && this.b(var1, (ik != 0)) ? il : im);
   }

   public NLoginCore_583(NLoginInterface_011<?> var1, MemClassLoader var2) {
      this.a = var2;
      this.aH = var1.q().substring(a).toLowerCase(Locale.ENGLISH);
      File var3 = new File(var1.e(), a(b & c, d));
      if (!var3.exists() && !var3.mkdirs()) {
         NLoginCore_370.d(a(e & f, g));
         NLoginCore_370.d(a(i, j ^ k));
         NLoginCore_370.d(a(m, n ^ o));
         NLoginCore_370.d(a(q, r ^ s));
         NLoginCore_370.d(a(u, v ^ w));
         NLoginCore_370.d(a(y, z));
         NLoginCore_370.d(a(ab, ac ^ ad));
         NLoginCore_370.d(a(af & ag, ah));
         NLoginCore_370.d(a(aj, ak ^ al));

         try {
            Thread.sleep(an);
         } catch (InterruptedException var6) {
            NLoginCore_370.a(var6);
         }

         throw new RuntimeException(a(ao & ap, aq));
      } else {
         String var4 = var1.q();
         this.g = new File(var3, var4.toLowerCase(Locale.ENGLISH));
         if (!this.g.exists() && !this.g.mkdirs()) {
            NLoginCore_370.d(a(ar, as));
            NLoginCore_370.d(a(au, av ^ aw));
            NLoginCore_370.d(a(ay, az ^ ba));
            NLoginCore_370.d(a(bc, bd ^ be));
            NLoginCore_370.d(a(bg, bh ^ bi));
            NLoginCore_370.d(a(bk, bl ^ bm));
            NLoginCore_370.d(a(bo, bp));
            NLoginCore_370.d(a(br, bs));
            NLoginCore_370.d(a(bu, bv ^ bw));

            try {
               Thread.sleep(by);
            } catch (InterruptedException var7) {
               NLoginCore_370.a(var7);
            }

            throw new RuntimeException(a(bz, ca ^ cb));
         }
      }
   }

   public boolean b(NLoginInterface_034 var1, boolean var2, boolean var3) {
      File var4 = var1.a(this, (fh != 0));
      if (var4.exists()) {
         return (fi != 0);
      } else {
         File var5 = var1.a(this, (fj != 0));
         NLoginCore_406[] var6 = NLoginCore_406.values();
         int var7 = var6.length;

         for (int var8 = fk; var8 < var7; var8++) {
            NLoginCore_406 var9 = var6[var8];
            if (var9.a(var1, var5)) {
               NLoginCore_342 var10 = var9.a();
               String var11 = var9.a(var1, var10);
               String var12 = var10.a(var5);
               if (!var12.equals(var11)) {
                  if (var3 && var5.delete()) {
                     return this.b(var1, var2, (fl != 0));
                  }

                  if (var2) {
                     String var13 = var1.A();
                     NLoginCore_370.d(a(fm, fn ^ fo) + var13 + a(fp, fq) + var12 + a(fr, fs ^ ft) + var11);
                  }

                  if (!var5.delete()) {
                     var5.deleteOnExit();
                  }

                  return (fv != 0);
               }

               return (fw != 0);
            }
         }

         if (var2) {
            String var14 = var1.A();
            NLoginCore_370.d(a(fx, fy ^ fz) + var14 + a(ga, gb));
         }

         return (gd != 0);
      }
   }

   private byte a(NLoginInterface_034 var1, boolean var2, boolean var3) {
      if (!this.a(var1, var2)) {
         return (byte)hp;
      } else {
         String var4 = this.a(var1);
         File var5 = var1.a(this, (hq != 0));

         try {
            if (var3 && !var1.b()) {
               return (byte)hr;
            } else {
               this.a.addJarToClasspath(var5.toURI().toURL());
               Throwable var6 = null;
               int var7 = var4 == null ? hs : ht;
               if (var7 == 0) {
                  try {
                     this.a.loadClass(var4);
                     var7 = hu;
                  } catch (Throwable var9) {
                     var6 = var9;
                  }
               }

               if (var7 == 0) {
                  String var8 = var1.A();
                  NLoginCore_370.c(a(hv, hw) + var8 + a(hx, hy ^ hz), var6);
                  return (byte)ib;
               } else {
                  return (byte)ic;
               }
            }
         } catch (MalformedURLException var10) {
            throw new RuntimeException(a(id, ie ^ var_if) + var1.A() + a(ig, ih ^ ii), var10);
         }
      }
   }

   boolean a(NLoginInterface_034 var1, boolean var2) {
      File var3 = var1.a(this, (gq != 0));
      if (!var3.exists()) {
         if (var2) {
            NLoginCore_370.d(a(gr, gs ^ gt) + var1.A() + a(gu, gv ^ gw));
         }

         return (gy != 0);
      } else if (var3.isDirectory()) {
         if (var2) {
            NLoginCore_370.d(a(gz, ha ^ hb) + var1.A() + a(hc & hd, he));
         }

         return (hg != 0);
      } else {
         try {
            ZipFile var4 = new ZipFile(var3);

            int var6;
            try {
               String var5 = this.a(var1);
               var6 = var5 != null && var4.getEntry(var5.replace((char)hh, (char)hi) + a(hj, hk ^ hl)) == null ? hn : hm;
            } catch (Throwable var8) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var4.close();
            return (var6 != 0);
         } catch (IOException var9) {
            return (ho != 0);
         }
      }
   }

   private static void b() {
      c = -2567676245345679260L;
      long var0 = c ^ -6788105291830877174L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(22 + 46),
               (byte)(16 + 53),
               (byte)(30 + 53),
               (byte)(25 + 22),
               (byte)(51 + 16),
               (byte)(6 + 60),
               (byte)(49 + 18),
               47,
               (byte)(23 + 57),
               75,
               (byte)(63 + 4),
               (byte)(45 + 38),
               (byte)(38 + 15),
               (byte)(27 + 53),
               (byte)(61 + 36),
               (byte)(34 + 66),
               (byte)(49 + 51),
               (byte)(10 + 95),
               (byte)(40 + 70),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.C("ЩыѡѡЬдѠСпРтспщЬћошџѩыѱий", (byte)16, 67);
               ZKM_STR_B[1] = NLoginCore_241.D("ЕеРжјѢЭЛтќУЭ", (byte)16, 68);
               ZKM_STR_B[2] = NLoginCore_397.E("ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭԔԍՅԴ՞ՎԿՊՓ\u0558՚ՁԟՆԶՑԨՈէՄԶ՚ժղԫՓճՉԯՋ\u0557կէԷՑՅՌՏՋՁՑլԾԽոմռՕտժնՆչՌՊ֏՝\u058b՞֖֖Վձցղ՟ՠ", (byte)16, 69);
               ZKM_STR_B[3] = NLoginCore_232.D("ЕеРжјѢЭЛтќУЭ", (byte)16, 68);
               ZKM_STR_B[4] = NLoginCore_559.E("ԢӽԟԜԛԒԃԗԄԖԤԭԛ\u0530ԩԪԵԳԕԘ՚ԘԗԸՍ\u0530ՏԛԶՊ\u0557ՁԻՒԞՒգԤԸ՝ԧԸ՝Դ", (byte)16, 69);
               ZKM_STR_B[5] = NLoginCore_451.A("ÎçêçòêėēěěØğđÛėĆąÛĩĢĠăüĮĢđìğüğèĄĳīħĐĭĚĪĔþđýĵğęĒņĕĶęĚħĻĒē", (byte)16, 65);
               ZKM_STR_B[6] = NLoginCore_575.C("ѝѝЯдкЮєіИосФССјѬЪцыЫѦэцЧѕЯиѨыњѯѮьњѳьѕђѵоѹѢѨэ", (byte)16, 67);
               ZKM_STR_B[7] = NLoginCore_433.F("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 70);
               ZKM_STR_B[8] = NLoginCore_451.F("ԿԛԁԤԲԻԋՃՍԷՅԙՏԜԟԿՆԦՋԊԒԩԍԕՈՔԬաԻԵԶՀ\u0557ա՞ԻՄդԤՊՍՌՉծ՜դՉճՍզհՃ\u0530ՒԿՀ", (byte)16, 70);
               ZKM_STR_B[9] = NLoginCore_384.E("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 69);
               ZKM_STR_B[10] = NLoginCore_521.E("ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭԔԍՅԴ՞ՎԿՊՓ\u0558՚ՁԟՆԶՑԨՈէՄԶՙըձԼՍԫՓՄՆէՖՒԿՀ", (byte)16, 69);
               ZKM_STR_B[11] = NLoginCore_201.C("ЕеРжјѢЭЛтќУЭ", (byte)16, 67);
               ZKM_STR_B[12] = NLoginCore_092.F(
                  "ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭ՛ԩԳԾԗԖ\u0558ԻՋԢՖՠԦՖԶՉ\u0558ԦԵՙՉՍ\u0558ՄԬՌաայԵՖԳԬՊԺԼԶՖշցաքմ\u0557ՆՏՒ\u0557պգ\u0558ՄՇռդձրռկփճքւչմփֆ՚֜֍ի֖֟տ֎",
                  (byte)16,
                  70
               );
               ZKM_STR_B[13] = NLoginCore_141.E("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 69);
               ZKM_STR_B[14] = NLoginCore_471.E("ԢӽԟԜԛԒԃԗԄԖԤԭԛ\u0530ԩԪԵԳԕԘ՚ԘԗԸՍ\u0530ՏԛԶՊ\u0557ՁԻՒԞՒգԤԸ՝ԧԸ՝Դ", (byte)16, 69);
               ZKM_STR_B[15] = NLoginCore_110.C("ДЭаЭиаѝљѡѡОѥїСѝьыСѯѨѦщтѴѨївѥтѥЮъѹѱѭіѳѠѰњфїуѻѥџјҌћѼџѠѭҁјљ", (byte)16, 67);
               ZKM_STR_B[16] = NLoginCore_451.F("ՄՄԖԛԡԕԻԽӿԥԨԋԈԈԿՓԑԭԲԒՍԴԭԎԼԖԟՏԲՁՖՕԳՁ՚ԳԼԹ՜ԥՠՉՏԴ", (byte)16, 70);
               ZKM_STR_B[17] = NLoginCore_530.B("ÏïÚðĒĜçÕüĖÝç", (byte)16, 66);
               ZKM_STR_B[18] = NLoginCore_223.C("јдКныєФќѦѐўвѨеијџпѤУЫтЦЮѡѭхѺєюяљѰѺѷєѝѽнѣѦѥѢ҇ѵѽѢҌѦѿ҉ќщѫјљ", (byte)16, 67);
               ZKM_STR_B[19] = NLoginCore_173.E("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 69);
               ZKM_STR_B[20] = NLoginCore_232.A("ćÙ÷ĚĆĚõÕÞğĝÚßēĞĘĆğĔåĀçàĘćıġĒĝĦīĭĔòęĉĤûěĺėĉĬĻńďĠþĦėęĺĩĥĒē", (byte)16, 65);
               ZKM_STR_B[21] = NLoginCore_575.B("čĚäčýĐèüĠÛÿìĄøôĘĄüēĂìėĢĄèİíĀĕđòĆ", (byte)16, 66);
               ZKM_STR_B[22] = NLoginCore_127.E("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 69);
               ZKM_STR_B[23] = NLoginCore_183.F("ՀԐԹՀԩԥԅԼՊՍԈԊԭՈՋԼԔԏԒՇԷԧԪԨԛՍԯՉԙՖԹՅԷԽՒՒԼԜՈԴԤԽՍիԪհՃճՀՁըեզՓչծյճ՛\u0557շՋլՀեքՕմբղ֊Ռ\u0558ո։Ք", (byte)16, 70);
               ZKM_STR_B[24] = NLoginCore_559.E("ӼԜԇԝԿՉԔԂԩՃԊԔ", (byte)16, 69);
               ZKM_STR_B[25] = NLoginCore_559.B(
                  "ė×çĘÕÏÜÞè×ßñòġĖĖÿĂĊôãéħİĎİĨåİõĤĆĮĄęùõĹĳùĽċĂĤĀĝāąđĒĂĴĜŋĎŅĭīĞłŔČđŕŒģĤĵĦĽĭśĘŚŐĢŃšġŃņļŠŕŅĪńĸńħśōĬňŎŢĴŖńŚŶůŨķŒŗŢŇ", (byte)16, 66
               );
               ZKM_STR_B[26] = NLoginCore_453.F("ԢӽԟԜԛԒԃԗԄԖԣԠԫԢՁՀԝԫԯԠԡԗՑՍԛ՚Ԗ՟ԶԵԛդԯԮԳբԸԢՁՌԥ\u0558ԺԮԺձՊՁՅԯ՟ՋՑՇԱժԼԼհյՌշ՞\u0557", (byte)16, 70);
               ZKM_STR_B[27] = NLoginCore_241.F("ԢӽԟԜԛԒԃԗԄԖԤԭԛ\u0530ԩԪԵԳԕԘ՚ԘԗԸՍ\u0530ՏԛԶՊ\u0557ՁԻՒԞՒգԤԸ՝ԧԸ՝Դ", (byte)16, 70);
               ZKM_STR_B[28] = NLoginCore_384.C("ДЭаЭиаѝљѡѡОѥїСѝьыСѯѨѦщтѴѨївѥтѥЮъѹѱѭіѳѠѰњфїуѻѥџјҌћѼџѠѭҁјљ", (byte)16, 67);
               ZKM_STR_B[29] = NLoginCore_138.F("ՄՄԖԛԡԕԻԽӿԥԨԋԈԈԿՓԑԭԲԒՍԴԭԎԼԖԟՏԲՁՖՕԳՁ՚ԳԼԹ՜ԥՠՉՏԴ", (byte)16, 70);
               ZKM_STR_B[30] = NLoginCore_110.D("ЕеРжјѢЭЛтќУЭ", (byte)16, 68);
               ZKM_STR_B[31] = NLoginCore_530.D("јдКныєФќѦѐўвѨеијџпѤУЫтЦЮѡѭхѺєюяљѰѺѷєѝѽнѣѦѥѢ҇ѵѽѢҌѦѿ҉ќщѫјљ", (byte)16, 68);
               ZKM_STR_B[32] = NLoginCore_397.C("ЕеРжјѢЭЛтќУЭ", (byte)16, 67);
               ZKM_STR_B[33] = NLoginCore_521.A("ēãČēüøØďĝĠÚċĔùħĄà÷æğëèýĨëîĊĜĆĳĦóċĔĳĶİĳļöĘğĎć", (byte)16, 65);
               ZKM_STR_B[34] = NLoginCore_241.E("ՀԐԹՀԩԥԅԼՊՍԇԊՈՊԜՕԪԈԸՓՐ\u0558ԟԠ", (byte)16, 69);
               ZKM_STR_B[35] = NLoginCore_433.D("ЭНђПТрэјѓТКкѕѪхуѢЮѦѭѱѡий", (byte)16, 68);
               ZKM_STR_B[36] = NLoginCore_553.A("ĄéĘ÷ìĆċĕÜôĔç", (byte)16, 65);
               ZKM_STR_B[37] = NLoginCore_110.D("щўъіюЙЯёѡѣѠсфѥѥПџѬѤѠэђѬдџѬъѥеѯѺнаѿъѯєѷюсёіѰѷ҈ѳїхҌҐњґѯҊґҊѧѐѹѴїљѮқ", (byte)16, 68);
               ZKM_STR_B[38] = NLoginCore_110.A("ćÙ÷ĚĆĚõÕÞğĞðîóåģĀĜĤĨĥėĂĥĎįûĉòıĩĉï÷ķĜěĞěñēĩĴć", (byte)16, 65);
               ZKM_STR_B[39] = NLoginCore_530.D("ѝдъЮгѐЖйклѡСмўџЭптѥчўгьтшѸђіѰјѪй", (byte)16, 68);
               ZKM_STR_B[40] = NLoginCore_127.F("ՂԅՆԺԢԟԙԃԘԋՁԔ", (byte)16, 70);
               ZKM_STR_B[41] = NLoginCore_173.D("эПнѠьѠлЛФѥѤждйЫѩцѢѪѮѫѝшѫєѵсяиѷѯяенѽѢѡѤѡзљѯѺэ", (byte)16, 68);
               ZKM_STR_B[42] = NLoginCore_241.F("ԣԤԆӺՆՋԬԭԠՈԫԔ", (byte)16, 70);
               ZKM_STR_B[43] = NLoginCore_232.B("ćÙ÷ĚĆĚõÕÞğĞùøĤĂĠþåéäĝæĀéëëĈĝčóĬąĹĖĭĦļïĝĶüđýĒĭĚĐĜĀĚļĘĽĕĒē", (byte)16, 66);
               ZKM_STR_B[44] = NLoginCore_004.B("ćÙ÷ĚĆĚõÕÞğğÝďāî÷ĄĥġĝöėĘġĈĆİĒđþďóĀĆčùĆķĹĒġĿļć", (byte)16, 66);
               ZKM_STR_B[45] = NLoginCore_553.D("јЕђЯеѐлТѥїОѡысжшнѡўђѠоѵаюѫѵѡкѲщњйіќъћѵѾѰѯёѐэ", (byte)16, 68);
               ZKM_STR_B[46] = NLoginCore_446.D("эПнѠьѠлЛФѥѥЦщѤШјїэЫѧќрьнѯхѲѶѢѦѤёљѭжгмѷмѕѧїѐ҃ѿщѫфѢѤџъѺѫҏѣѱєғѷҎҜѵѹҝѷѝўћѭѢҗѻ҇Ѹѭ", (byte)16, 68);
               ZKM_STR_B[47] = NLoginCore_324.D("жысРєђМљтёсѢыѬпїѬЬѮммЪєѠяьжѵжѴцѾ", (byte)16, 68);
               ZKM_STR_B[48] = NLoginCore_553.F("ԴԆԤՇԳՇԢԂԋՌՌԍ\u0530ՋԏԿԾԴԒՎՃԧԳԤՖԬՙ՝ՉՍՋԸՀՔԝԚԣ՞ԣԼՎԾԷժզ\u0530ՒԫՉՋՆԱաՒնՊ\u0558Իպ՞յփ՜ՠք՞ՄՅՂՔՉվբծ՟Ք", (byte)16, 70);
               ZKM_STR_B[49] = NLoginCore_110.B("ċâąĎêĜēÛčĀĘïĔûßĖñĩīČæõĈþąìéĞĆčīĈ", (byte)16, 66);
               ZKM_STR_B[50] = NLoginCore_027.B("×öôĜçÔďöĔÜêç", (byte)16, 66);
               ZKM_STR_B[51] = NLoginCore_453.D("эПнѠьѠлЛФѥѣвѓкуѠцѭрсѣЮэътѥљЯзѯѧнењкіѓѳѤѸфѿѩп҃ҌѤѭ҇ѰѰҎџґјљ", (byte)16, 68);
               ZKM_STR_B[52] = NLoginCore_232.D("мнПГџѤхцйѡфЭ", (byte)16, 68);
               ZKM_STR_B[53] = NLoginCore_384.B("ćÙ÷ĚĆĚõÕÞğĜÙÝĐûĞĝĒĈĖþæ÷÷ëěāďĭĆąĴčą÷ĲôčĵķĎĐľĭĲĻĀıĞĽĨĻĜĻĒē", (byte)16, 66);
               ZKM_STR_B[54] = NLoginCore_232.F("ԣԤԆӺՆՋԬԭԠՈԫԔ", (byte)16, 70);
               ZKM_STR_B[55] = NLoginCore_451.D("эПнѠьѠлЛФѥѤђдїХѦѠЧѫѩѨѲнѥсѸюѳѢњкѱѺѹїпѝѰї҅Ѵі҂э", (byte)16, 68);
               ZKM_STR_B[56] = NLoginCore_138.E("ԿӼԹԖԜԷԢԉՌԾԅՈԲԨԝԯԤՈՅԹՇԥ՜ԗԵՒ՜Ոԡՙ\u0530ՁԠԽՃԱՂ՜ե\u0557ՖԸԷԴ", (byte)16, 69);
               ZKM_STR_B[57] = NLoginCore_453.A("Ą×ïąČĖúěđĜģÕßõćòĠĄąćĝéăċèĆĭĎįýġï", (byte)16, 65);
               ZKM_STR_B[58] = NLoginCore_575.B("ö÷ÙÍęĞÿĀóěþç", (byte)16, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.B("ãąěěæîĚÛùÚûëòÛĎõñħĀóęěòó", (byte)16, 66);
               ZKM_STR_B[1] = NLoginCore_453.C("ыѕреОйзњуОѦЭ", (byte)16, 67);
               ZKM_STR_B[2] = NLoginCore_559.D("эПнѠьѠлЛФѥѣРХљѤўьѥњЫцЭЦўэѷѧјѣѬѱѳњиџяѪсѡҀѝяѳ҃ҋфѬҌѢшѤѰ҈ҀѐѪўѥѨѤњѪ҅їіґҍҕѮҘ҃ҏџҒѤҥҫҗҊҙҥѥѹҬҪҪѬҵ҅҆ҸҨ҅ѷҵҬ", (byte)16, 68);
               ZKM_STR_B[3] = NLoginCore_453.C("АЫіѢюљЭтиѕУЭ", (byte)16, 67);
               ZKM_STR_B[4] = NLoginCore_173.B("õÐòïîåÖê×é÷ĀîăüýĈĆèëĭëêċĠăĢîĉĝĪĔġ÷ēóúĈĦīĵđĬć", (byte)16, 66);
               ZKM_STR_B[5] = NLoginCore_076.C("ДЭаЭиаѝљѡѡОѥїСѝьыСѯѨѦщтѴѨївѥтѥЮъѹѱѭіѳѠѰњфїц҅фѬхџѹҀѤыҍҁјљ", (byte)16, 67);
               ZKM_STR_B[6] = NLoginCore_183.E("ՄՄԖԛԡԕԻԽӿԥԨԋԈԈԿՓԑԭԲԒՍԴԭԎԼԖԟՏԲՁՖՕ՜ԴԥգՄԠԺթՅ՛ԹծՒՍԼԾՔՒիԲբՒԿՀ", (byte)16, 69);
               ZKM_STR_B[7] = NLoginCore_433.A("ď×ù÷õđæďĊéòç", (byte)16, 65);
               ZKM_STR_B[8] = NLoginCore_453.F("ԿԛԁԤԲԻԋՃՍԷՅԙՏԜԟԿՆԦՋԊԒԩԍԕՈՔԬաԻԵԶՀ\u0557ա՞ԻՄդԤՊՍՌՊաիաժմԲՖաԯպՂԿՀ", (byte)16, 70);
               ZKM_STR_B[9] = NLoginCore_076.F("ӿԘӽԔԀԪԨԙԚԎԣԔ", (byte)16, 70);
               ZKM_STR_B[10] = NLoginCore_471.F("ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭԔԍՅԴ՞ՎԿՊՓ\u0558՚ՁԟՆԶՑԨՈէՄԶՙԨգՈՔժՄժԭԯգՂԿՀ", (byte)16, 70);
               ZKM_STR_B[11] = NLoginCore_530.A("ĄÔčùĖÙðěĒĂČç", (byte)16, 65);
               ZKM_STR_B[12] = NLoginCore_183.F(
                  "ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭ՛ԩԳԾԗԖ\u0558ԻՋԢՖՠԦՖԶՉ\u0558ԦԵՙՉՍ\u0558ՄԬՌաայԵՖԳԬՊԺԼԶՖշցաքմ\u0557ՆՏՒ\u0557պգ\u0558ՄՇռդձրռկփճքւչչըՕ֒ի՝՟֎ի֘պ",
                  (byte)16,
                  70
               );
               ZKM_STR_B[13] = NLoginCore_183.A("ùÙÕíêćÜěāĕĂç", (byte)16, 65);
               ZKM_STR_B[14] = NLoginCore_027.F("ԢӽԟԜԛԒԃԗԄԖԤԭԛ\u0530ԩԪԵԳԕԘ՚ԘԗԸՍ\u0530ՏԛԶՊ\u0557Ձ՝դՄէՙ՛ՔբԭԥԪԴ", (byte)16, 70);
               ZKM_STR_B[15] = NLoginCore_433.B("ÎçêçòêėēěěØğđÛėĆąÛĩĢĠăüĮĢđìğüğèĄĳīħĐĭĚĪĔþđÿĵĿĢĐćĈĜļĂħĻĒē", (byte)16, 66);
               ZKM_STR_B[16] = NLoginCore_446.A("ėėéîôèĎĐÒøûÞÛÛĒĦäĀąåĠćĀáďéòĢąĔĩĨĬĥċĜęöļĸļóĶďĔąĘĐġĠĂīĈŋĒē", (byte)16, 65);
               ZKM_STR_B[17] = NLoginCore_201.D("ьЯЙњЭгЯўбєњЭ", (byte)16, 68);
               ZKM_STR_B[18] = NLoginCore_091.E("ԿԛԁԤԲԻԋՃՍԷՅԙՏԜԟԿՆԦՋԊԒԩԍԕՈՔԬաԻԵԶՀ\u0557ա՞ԻՄդԤՊՍՌՈՏեՅլԫԯկաՑԲՒԿՀ", (byte)16, 69);
               ZKM_STR_B[19] = NLoginCore_530.B("āêø÷îĘüöÜĕêç", (byte)16, 66);
               ZKM_STR_B[20] = NLoginCore_092.E("ԴԆԤՇԳՇԢԂԋՌՊԇԌՀՋՅԳՌՁԒԭԔԍՅԴ՞ՎԿՊՓ\u0558՚ՁԟՆԶՑԨՈէՄԶ՜ՁԭիձզԫշՑճՇոԿՀ", (byte)16, 69);
               ZKM_STR_B[21] = NLoginCore_433.B("čĚäčýĐèüĠÛÿìĄøôĘĄüēĂìĎĬýĦđİþüìĢćĵĔČĭĊčĬĝĵČĢć", (byte)16, 66);
               ZKM_STR_B[22] = NLoginCore_141.C("иоЩЫюОЯгйѧиЭ", (byte)16, 67);
               ZKM_STR_B[23] = NLoginCore_471.D("љЩђљтоОѕѣѦСУцѡѤѕЭШЫѠѐрусдѦшѢвѯђўѐіѫѫѕеѡэніѦ҄у҉ќҌљњҁѾѿѬҒ҇ҎҌѴѰҐѤ҅љҗҗҊѸѫљѱѷҒѰҢѭ", (byte)16, 68);
               ZKM_STR_B[24] = NLoginCore_141.B("ąĈçÑĕĉčòĘùîç", (byte)16, 66);
               ZKM_STR_B[25] = NLoginCore_223.C(
                  "ѝНЭўЛЕТФЮНХзиѧќќхшѐкЩЯѭѶєѶѮЫѶлѪьѴъџплѿѹп҃ёшѪцѣчыїјшѺѢґєҋѳѱѤ҈ҚђїқҘѩѪѻѬ҃ѳҡўҠҖѨ҉ҧѧ҉Ҍ҂ҦқҋѰҊѾҊѭҡғѲҎҔҨҌѻѻѽҔѻӅ҂Ң҅҇ҍ", (byte)16, 67
               );
               ZKM_STR_B[26] = NLoginCore_553.B("õÐòïîåÖê×éöóþõĔēðþĂóôêĤĠîĭéĲĉĈîķĂāĆĵċõĔğøīčāčńĝĔĘĂĲĞĤĠĢŏĮŇĲğŃŋĲŅĲŊŕĕĤőĩĖŞŎĮħ", (byte)16, 66);
               ZKM_STR_B[27] = NLoginCore_530.A("õÐòïîåÖê×é÷ĀîăüýĈĆèëĭëêċĠăĢîĉĝĪĔĊĐĊĒĆċĎĻĨúļć", (byte)16, 65);
               ZKM_STR_B[28] = NLoginCore_521.B("ÎçêçòêėēěěØğđÛėĆąÛĩĢĠăüĮĢđìğüğèĄĳīħĐĭĚĪĔþđþıĎûĲĹŁĵāĔğĕĒē", (byte)16, 66);
               ZKM_STR_B[29] = NLoginCore_530.E("ՄՄԖԛԡԕԻԽӿԥԨԋԈԈԿՓԑԭԲԒՍԴԭԎԼԖԟՏԲՁՖՕՒՐԢԸժԨԸԨՋՈՀԬՎդՀԲթՊՐՋնՂԿՀ", (byte)16, 69);
               ZKM_STR_B[30] = NLoginCore_201.E("ԶԡԝԂՀՆԞԡԌՂՍԔ", (byte)16, 69);
               ZKM_STR_B[31] = NLoginCore_427.F("ԿԛԁԤԲԻԋՃՍԷՅԙՏԜԟԿՆԦՋԊԒԩԍԕՈՔԬաԻԵԶՀ\u0557ա՞ԻՄդԤՊՍՌՊեԯՇըԬԯէԱՙՂոԿՀ", (byte)16, 70);
               ZKM_STR_B[32] = NLoginCore_004.D("ѕшђєрєОјѢмдЭ", (byte)16, 68);
               ZKM_STR_B[33] = NLoginCore_553.B("ēãČēüøØďĝĠÚċĔùħĄà÷æğëèýĨëîĊĜĆĳĦóĎħĐĲĊĹĿŀĨđĒć", (byte)16, 66);
               ZKM_STR_B[34] = NLoginCore_324.E("ՀԐԹՀԩԥԅԼՊՍԉԏՑԯԾՄԠԔՋՉԹԲԟԠ", (byte)16, 69);
               ZKM_STR_B[35] = NLoginCore_471.C("ЭНђПТрэјѓТШѧѕцеЦпШюфкѐѭуѓяѵѴѨѰѳѨ", (byte)16, 67);
               ZKM_STR_B[36] = NLoginCore_223.B("ôøĈøĚëÐôéÓêĄąĠñäĘĢÿÿĪõòó", (byte)16, 66);
               ZKM_STR_B[37] = NLoginCore_387.C("щўъіюЙЯёѡѣѠсфѥѥПџѬѤѠэђѬдџѬъѥеѯѺнаѿъѯєѷюсёіѰѷ҈ѳїхҌҐњґѯҏыѓўѸѯѤѥҕ҄җҙёѺҢҌҌқҜҝҠ҈ѭ", (byte)16, 67);
               ZKM_STR_B[38] = NLoginCore_575.D("эПнѠьѠлЛФѥѤждйЫѩцѢѪѮѫѝшѫєѵсяиѷѯядѻьѭѢ҄҃ќўѳѿ҃ѡѽѧпїѿьѡѿћјљ", (byte)16, 68);
               ZKM_STR_B[39] = NLoginCore_110.A("ėîĄèíĊÐóôõěÛöĘęçùüğāĘêėĜĨèĜòĜČòą", (byte)16, 65);
               ZKM_STR_B[40] = NLoginCore_427.F("ӷԑԔԠԴԄԃԦԕՎԽԔ", (byte)16, 70);
               ZKM_STR_B[41] = NLoginCore_453.C("эПнѠьѠлЛФѥѤждйЫѩцѢѪѮѫѝшѫєѵсяиѷѯяїћџѕѻў҅҆ћѓ҃сѧѦѹѵљѥь҆ъћјљ", (byte)16, 67);
               ZKM_STR_B[42] = NLoginCore_553.B("ĉĐÓìÓÏĚçþĞáç", (byte)16, 66);
               ZKM_STR_B[43] = NLoginCore_575.A("ćÙ÷ĚĆĚõÕÞğĞùøĤĂĠþåéäĝæĀéëëĈĝčóĬąĹĖĭĦļïĝĶüđýĂþĄĘħģğüýĢŋĒē", (byte)16, 65);
               ZKM_STR_B[44] = NLoginCore_241.F("ԴԆԤՇԳՇԢԂԋՌՌԊԼԮԛԤԱՒՎՊԣՄՅՎԵԳ՝ԿԾԫԼԠՐՂ՟ՠ՜ԜԸԨԹկԿԴ", (byte)16, 70);
               ZKM_STR_B[45] = NLoginCore_433.D("јЕђЯеѐлТѥїОѡысжшнѡўђѠоѵаюѫѵѡкѲщњдѠѺнѰўѶѠѱѷ҆э", (byte)16, 68);
               ZKM_STR_B[46] = NLoginCore_223.E("ԴԆԤՇԳՇԢԂԋՌՌԍ\u0530ՋԏԿԾԴԒՎՃԧԳԤՖԬՙ՝ՉՍՋԸՀՔԝԚԣ՞ԣԼՎԾԷժզ\u0530ՒԫՉՋՆԱաՒնՊ\u0558Իպ՞յփ՜ՠջՐԽՂՈվ՜խ֊դՆՔ", (byte)16, 69);
               ZKM_STR_B[47] = NLoginCore_004.C("жысРєђМљтёсѢыѬпїѬЬѮммЩшѰюпѪњѬбѷѱѴќѨлѠѝпќѮѡпэ", (byte)16, 67);
               ZKM_STR_B[48] = NLoginCore_324.D("эПнѠьѠлЛФѥѥЦщѤШјїэЫѧќрьнѯхѲѶѢѦѤёљѭжгмѷмѕѧїѐ҃ѿщѫфѢѤџъѺѫҏѣѱєғѷҎҜѵѹҚҔѹҐѯѼѹѵѤљѧѭ", (byte)16, 68);
               ZKM_STR_B[49] = NLoginCore_091.A("ċâąĎêĜēÛčĀĘïĔûßĖñĩīČæāĈďüĐðĒóčĄôėĔīóĹĉĒĕėøļć", (byte)16, 65);
               ZKM_STR_B[50] = NLoginCore_110.F("ԘԎԤԧԸՄԪՌՅՀԏՈԡՊԌԤԶԾԧԑԙՈԟԠ", (byte)16, 70);
               ZKM_STR_B[51] = NLoginCore_232.E("ԴԆԤՇԳՇԢԂԋՌՊԙԺԡԪՇԭՔԧԨՊԕԴԱԩՌՀԖԞՖՎԤԜՁԡԽԺ՚Ջ՟ԫզ\u0557թ՟թ՟ՓՖԬԴՎաՒԿՀ", (byte)16, 69);
               ZKM_STR_B[52] = NLoginCore_433.D("шшскєкдумњђЭ", (byte)16, 68);
               ZKM_STR_B[53] = NLoginCore_324.B("ćÙ÷ĚĆĚõÕÞğĜÙÝĐûĞĝĒĈĖþæ÷÷ëěāďĭĆąĴčą÷ĲôčĵķĎĐĽđüĳıŀĤĨĳĨňĕĒē", (byte)16, 66);
               ZKM_STR_B[54] = NLoginCore_183.D("цЖгИТљУЮхНдЭ", (byte)16, 68);
               ZKM_STR_B[55] = NLoginCore_559.D("эПнѠьѠлЛФѥѤђдїХѦѠЧѫѩѨѲнѥсѸюѳѢњкѱєѹѓјыѹѱҁіѐљњ҄џ҈Ѭщјѱ҅ђѫјљ", (byte)16, 68);
               ZKM_STR_B[56] = NLoginCore_138.C("јЕђЯеѐлТѥїОѡысжшнѡўђѠоѵаюѫѵѡкѲщњѿмѕѩѹѬлќѕѻѺэ", (byte)16, 67);
               ZKM_STR_B[57] = NLoginCore_076.C("ъНеыђќрѡїѢѩЛХлэиѦъыэѣаѦраѮѴѺѬѬѻж", (byte)16, 67);
               ZKM_STR_B[58] = NLoginCore_223.D("ЛБбНвѢюіѢзрЭ", (byte)16, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.E("ԙՁԗԔԸԾՋԾԖՌԭՑԛԎ\u0530ԽԠԣԕՌԴՒԯՄԬՖՒՎԠԲբԲ", (byte)16, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_397.A("ë÷ĐòüďĐÖ×čñďĘøėĨĜĨĊõĨĈĘĞįĞďĄĢįĵĉ", (byte)16, 65);
         }
      }
   }

   public Collection<File> a(NLoginInterface_034[] var1) {
      File[] var2 = this.g.listFiles();
      if (var2 != null && var2.length != 0) {
         NLoginCore_315[] var3 = NLoginCore_315.values();
         HashSet var4 = new HashSet(var3.length + var1.length);
         var4.addAll(Arrays.asList(var3));
         var4.addAll(Arrays.asList(var1));
         HashSet var5 = new HashSet<>(Arrays.asList(var2));
         var5.removeAll(var4.stream().map(var1x -> var1x.a(this, (jf != 0))).collect(Collectors.toSet()));
         return NLoginCore_114.a(var5);
      } else {
         return Collections.emptySet();
      }
   }
}
