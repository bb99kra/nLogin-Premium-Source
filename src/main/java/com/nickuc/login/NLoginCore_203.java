package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_203 {
   private static int bi = Integer.reverse(671088640);
   private static long eh = Long.reverse(-3815455186915535667L);
   private static long av = Long.reverse(-2374303306156976947L);
   private static long gi = Long.reverse(-2374303306156976947L);
   private static int ap = 832 >>> 230 | 832 << -230;
   private static long m = Long.reverse(1441151880758558720L);
   private static long ex = Long.reverse(-2374303306156976947L);
   private static int v = Integer.reverse(1610612736);
   private static int gj = 8126464 >>> 17 | 8126464 << ~17 + 1;
   private static int eg = 1507328 >>> 143 | 1507328 << ~143 + 1;
   private static long ef = Long.reverse(-2374303306156976947L);
   private static int ey = 26624 >>> 73 | 26624 << -73;
   private static int bo = -1 >>> 120 | -1 << -120;
   private static int bh = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = 4608 >>> 73 | 4608 << ~73 + 1;
   private static int k = Integer.reverse(-1073741824);
   private static long ck = Long.reverse(1441151880758558720L);
   private static int as = (29360128 >>> 149 | 29360128 << ~149 + 1) & -1;
   private static long dn = Long.reverse(1441151880758558720L);
   private static int fp = 1835008 >>> 175 | 1835008 << ~175 + 1;
   private static long al = Long.reverse(1441151880758558720L);
   private static int dp = Integer.reverse(-469762048);
   private static long fq = Long.reverse(-3815455186915535667L);
   private static long dm = Long.reverse(-3815455186915535667L);
   private static long cm = Long.reverse(-3815455186915535667L);
   private static long ff = Long.reverse(-3815455186915535667L);
   private static int gv = Integer.reverse(-2113929216);
   private static int be = Integer.reverse(-939524096);
   private static int h = Integer.reverse(1073741824);
   private static long d = Long.reverse(-2374303306156976947L);
   private static int dr = Integer.reverse(335544320);
   private static int bw = Integer.reverse(-1744830464);
   private static long ar = Long.reverse(1441151880758558720L);
   private static int du = 536870917 >>> 125 | 536870917 << -125;
   private static int bc = Integer.reverse(1207959552);
   private static int p = (2097152 >>> 243 | 2097152 << ~243 + 1) & -1;
   private long p;
   private static int er = 104857600 >>> 117 | 104857600 << ~117 + 1;
   private static int z = (-1 >>> 216 | -1 << ~216 + 1) & -1;
   private static long cz = Long.reverse(1441151880758558720L);
   private static long ac = Long.reverse(-2374303306156976947L);
   private static long ch = Long.reverse(1441151880758558720L);
   private static long cn = Long.reverse(1441151880758558720L);
   private static long cw = Long.reverse(1441151880758558720L);
   private static int gh = Integer.reverse(-1);
   private static long at = Long.reverse(-2374303306156976947L);
   private static int s = -1610612736 >>> 61 | -1610612736 << -61;
   private static int aj = (-1073741822 >>> 190 | -1073741822 << -190) & -1;
   private static int fz = Integer.reverse(-1);
   private static int var_do = Integer.reverse(0);
   private static int fk = Integer.reverse(880803840);
   private static int fs = 7471104 >>> 81 | 7471104 << -81;
   private static long ax = Long.reverse(-3815455186915535667L);
   private static int cx = Integer.reverse(1140850688);
   private static long fa = Long.reverse(-2374303306156976947L);
   private static long cs = Long.reverse(-3815455186915535667L);
   private static long bv = Long.reverse(1441151880758558720L);
   private static long ga = Long.reverse(-2374303306156976947L);
   private static int di = Integer.reverse(-1543503872);
   private static long ba = Long.reverse(-3815455186915535667L);
   private static long c;
   private static long gk = Long.reverse(-3815455186915535667L);
   private static long an = Long.reverse(-3815455186915535667L);
   private static int bz = 212992 >>> 77 | 212992 << ~77 + 1;
   private static int df = (37748736 >>> 244 | 37748736 << ~244 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_203.gu];
   private static int gt = 0 >>> 87 | 0 << -87;
   private static long bj = Long.reverse(-2374303306156976947L);
   private static long eq = Long.reverse(-2374303306156976947L);
   private static long bu = Long.reverse(-3815455186915535667L);
   private static long fu = Long.reverse(1441151880758558720L);
   private static long bs = Long.reverse(-2374303306156976947L);
   private static long ei = Long.reverse(1441151880758558720L);
   private static long dh = Long.reverse(-2374303306156976947L);
   private static int ds = (-1 >>> 78 | -1 << ~78 + 1) & -1;
   private static int ec = Integer.reverse(-1);
   private static long q = Long.reverse(-3815455186915535667L);
   private static long ft = Long.reverse(-3815455186915535667L);
   private static long bp = Long.reverse(-2374303306156976947L);
   private static long dz = Long.reverse(-3815455186915535667L);
   private static long bm = Long.reverse(1441151880758558720L);
   private static int cu = (132 >>> 2 | 132 << ~2 + 1) & -1;
   private static long by = Long.reverse(-2374303306156976947L);
   private static int az = Integer.reverse(-2013265920);
   private static long gl = Long.reverse(1441151880758558720L);
   private static int cl = (-536870911 >>> 60 | -536870911 << ~60 + 1) & -1;
   private static int cf = (14 >>> 127 | 14 << -127) & -1;
   private static long cb = Long.reverse(-2374303306156976947L);
   private static int cc = (108 >>> 162 | 108 << ~162 + 1) & -1;
   private static String[] ZKM_STR_B = new String[gv];
   private static long bl = Long.reverse(-3815455186915535667L);
   private static int gu = Integer.reverse(-2113929216);
   private final JSONObject a = new JSONObject();
   private static long ct = Long.reverse(1441151880758558720L);
   private static long gs = Long.reverse(-2374303306156976947L);
   private static int cr = Integer.reverse(67108864);
   private static long cy = Long.reverse(-3815455186915535667L);
   private static int ee = Integer.reverse(-1275068416);
   private static long w = Long.reverse(-3815455186915535667L);
   private static long gd = Long.reverse(-2374303306156976947L);
   private static int dl = (9728 >>> 168 | 9728 << -168) & -1;
   private static long cq = Long.reverse(1441151880758558720L);
   private static long fc = Long.reverse(-3815455186915535667L);
   private static int cd = (-1 >>> 157 | -1 << -157) & -1;
   private static long fr = Long.reverse(1441151880758558720L);
   private static long dv = Long.reverse(-2374303306156976947L);
   private static long cj = Long.reverse(-3815455186915535667L);
   private static int a = Integer.reverse(0);
   private static int bk = Integer.reverse(-1476395008);
   private static long fj = Long.reverse(1441151880758558720L);
   private static long ea = Long.reverse(1441151880758558720L);
   private static long bf = Long.reverse(-3815455186915535667L);
   private static int am = Integer.reverse(805306368);
   private static int fn = (314572800 >>> 84 | 314572800 << ~84 + 1) & -1;
   private static long fx = Long.reverse(-2374303306156976947L);
   private static int dg = (-1 >>> 94 | -1 << -94) & -1;
   private static long aa = Long.reverse(-2374303306156976947L);
   private static int j = (64 >>> 198 | 64 << -198) & -1;
   private static int da = Integer.reverse(-1006632960);
   private static long fo = Long.reverse(1711367858400788480L);
   private static long dq = Long.reverse(-2374303306156976947L);
   private static long ak = Long.reverse(-3815455186915535667L);
   private static int gg = Integer.reverse(-1140850688);
   private static long el = Long.reverse(1441151880758558720L);
   private static long aq = Long.reverse(-3815455186915535667L);
   private static long r = Long.reverse(1441151880758558720L);
   private static long bd = Long.reverse(-2374303306156976947L);
   private static int o = Integer.reverse(0);
   private static int gm = Integer.reverse(0);
   private static long fg = Long.reverse(1441151880758558720L);
   private static int fv = Integer.reverse(1543503872);
   private static int fw = Integer.reverse(-1);
   private static long ek = Long.reverse(-3815455186915535667L);
   private static int fb = 3392 >>> 70 | 3392 << -70;
   private static int ev = Integer.reverse(1048576);
   private static int e = (536870912 >>> 253 | 536870912 << -253) & -1;
   private static int en = Integer.reverse(201326592);
   private static int dj = Integer.reverse(-1);
   private static int gf = (6400 >>> 229 | 6400 << -229) & -1;
   private static int gq = 8 >>> 29 | 8 << -29;
   private static long t = Long.reverse(-3815455186915535667L);
   private static long ce = Long.reverse(-2374303306156976947L);
   private static long dk = Long.reverse(-2374303306156976947L);
   private static int ge = (524288 >>> 147 | 524288 << -147) & -1;
   private static long ay = Long.reverse(1441151880758558720L);
   private static long i = Long.reverse(-2374303306156976947L);
   private static long x = Long.reverse(1441151880758558720L);
   private static long go = Long.reverse(-3815455186915535667L);
   private static long g = Long.reverse(1441151880758558720L);
   private static int fy = 59 >>> 0 | 59 << -0;
   private static int dw = Integer.reverse(1409286144);
   private static long u = Long.reverse(1441151880758558720L);
   private static long bg = Long.reverse(1441151880758558720L);
   private static int bq = Integer.reverse(-402653184);
   private static int br = Integer.reverse(-1);
   private static int em = Integer.reverse(0);
   private static long cp = Long.reverse(-3815455186915535667L);
   private static int bx = (-1 >>> 132 | -1 << ~132 + 1) & -1;
   private static int dy = (1476395009 >>> 91 | 1476395009 << ~91 + 1) & -1;
   private static long ed = Long.reverse(-2374303306156976947L);
   private static int bt = Integer.reverse(402653184);
   private static long af = Long.reverse(1441151880758558720L);
   private static long ae = Long.reverse(-3815455186915535667L);
   private final NLoginCore_227 b;
   private static int ab = Integer.reverse(268435456);
   private static long ao = Long.reverse(1441151880758558720L);
   private static long f = Long.reverse(-3815455186915535667L);
   private static int ep = Integer.reverse(-1946157056);
   private static long cv = Long.reverse(-3815455186915535667L);
   private static int ag = 2621440 >>> 178 | 2621440 << -178;
   private static long ah = Long.reverse(-3815455186915535667L);
   private static int fl = Integer.reverse(-1610612736);
   private static int y = (-1073741823 >>> 94 | -1073741823 << ~94 + 1) & -1;
   private static int gb = Integer.reverse(1006632960);
   private static int gc = Integer.reverse(-1);
   private static long dx = Long.reverse(-2374303306156976947L);
   private static int gn = (1032192 >>> 206 | 1032192 << -206) & -1;
   private static long fd = Long.reverse(1441151880758558720L);
   private static long gp = Long.reverse(1441151880758558720L);
   private final NLoginInterface_011<?> d;
   private static long db = Long.reverse(-3815455186915535667L);
   private static long dc = Long.reverse(1441151880758558720L);
   private static int co = Integer.reverse(-134217728);
   private static int fe = (442368 >>> 77 | 442368 << -77) & -1;
   private static long ai = Long.reverse(1441151880758558720L);
   private static int aw = Integer.reverse(134217728);
   private static long fi = Long.reverse(-3815455186915535667L);
   private static int fm = Integer.reverse(141557760);
   private static int ej = Integer.reverse(-201326592);
   private static int ew = 53477376 >>> 52 | 53477376 << ~52 + 1;
   private static long bb = Long.reverse(1441151880758558720L);
   private static long l = Long.reverse(-3815455186915535667L);
   private static long dd = Long.reverse(-2L);
   private static long eo = Long.reverse(-2374303306156976947L);
   private static int gr = Integer.reverse(-1);
   private static int ez = (-1 >>> 134 | -1 << -134) & -1;
   private static int de = (-1 >>> 170 | -1 << ~170 + 1) & -1;
   private static int et = (1024 >>> 31 | 1024 << -31) & -1;
   private static int ci = Integer.reverse(-1207959552);
   private static long es = Long.reverse(-2374303306156976947L);
   private static int eb = -2147483643 >>> 253 | -2147483643 << ~253 + 1;
   private static int n = (4 >>> 98 | 4 << ~98 + 1) & -1;
   private static int b = -1 >>> 251 | -1 << -251;
   private static int fh = Integer.reverse(-335544320);
   private static int au = (7864320 >>> 19 | 7864320 << -19) & -1;
   private static int bn = (-2147483643 >>> 222 | -2147483643 << ~222 + 1) & -1;
   private static long dt = Long.reverse(-2374303306156976947L);
   private static int ca = Integer.reverse(-1);
   private static int eu = Integer.reverse(0);
   private static long cg = Long.reverse(-3815455186915535667L);

   public void ap() {
      this.d.b((j != 0)).a(() -> {
         try {
            if (this.b.a() == null) {
               return;
            }

            int var1 = this.b.a().b(a(fh, fi ^ fj), fk);
            if (var1 < fl || var1 > fm) {
               var1 = fn;
            }

            long var2 = System.currentTimeMillis();
            if (var2 - this.p < var1 * fo) {
               return;
            }

            this.p = var2;
            NLoginCore_305 var4 = NLoginCore_305.a();
            var4.k(a(fp, fq ^ fr), a(fs, ft ^ fu));
            var4.k(a(fv & fw, fx), a(fy & fz, ga));
            byte[] var5 = NLoginCore_488.a(var4, this.b());
            NLoginCore_151 var6 = this.b.a(var4, a(gb & gc, gd), (ge != 0), var5);
            int var7 = var6.p();
            if (var7 != gf && NLoginCore_525.as()) {
               NLoginCore_370.d(a(gg & gh, gi) + var7 + a(gj, gk ^ gl));
            }
         } catch (Throwable var8) {
            if (!(var8 instanceof IllegalStateException) || !a(gn, go ^ gp).equals(var8.getMessage())) {
               NLoginCore_370.c(a(gq & gr, gs), var8);
            }
         }
      }, 0L, 1L, TimeUnit.SECONDS);
   }

   private static String a(int var0, long var1) {
      var1 ^= 40L;
      var1 ^= -8726914811991625228L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(4 + 64),
                     (byte)(18 + 51),
                     (byte)(50 + 33),
                     (byte)(16 + 31),
                     (byte)(16 + 51),
                     66,
                     (byte)(19 + 48),
                     (byte)(5 + 42),
                     80,
                     (byte)(41 + 34),
                     (byte)(2 + 65),
                     (byte)(71 + 12),
                     (byte)(19 + 34),
                     (byte)(64 + 16),
                     (byte)(54 + 43),
                     (byte)(21 + 79),
                     (byte)(47 + 53),
                     (byte)(30 + 75),
                     (byte)(48 + 62),
                     (byte)(73 + 30)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(24 + 45), (byte)(26 + 57)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҳҨӄҴҖӇҬҿҽҺӈҬӈӃҧ", (byte)55, 65));
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

   private String R() {
      try {
         Path var1 = Paths.get(a(ej, ek ^ el));
         if (!var1.toFile().exists()) {
            return a(en, eo);
         } else {
            String var2;
            try {
               Stream var3 = Files.lines(var1);

               try {
                  var2 = var3.filter(var0 -> var0.startsWith(a(fe, ff ^ fg)))
                     .map(var0 -> var0.replaceAll(a(ey & ez, fa), a(fb, fc ^ fd)))
                     .findFirst()
                     .orElse(a(ep, eq));
               } catch (Throwable var7) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var3 != null) {
                  var3.close();
               }
            } catch (Throwable var8) {
               var2 = a(er, es) + var8.getMessage();
            }

            return var2.length() > et ? var2.substring(eu, ev) : var2;
         }
      } catch (Throwable var9) {
         return a(ew, ex) + var9.getMessage();
      }
   }

   public void a(JSONObject var1) {
      NLoginCore_142 var2 = this.b.a();
      NLoginCore_180 var3 = this.b.a();
      NLoginCore_109 var4 = this.b.a();
      JSONObject var5 = new JSONObject();
      var5.put(a(p, q ^ r), var4 != null ? var4.e() : a(s, t ^ u));
      var5.put(a(v, w ^ x), var3 != null ? var3.S() : a(y & z, aa));
      var5.put(a(ab, ac), var2.L());
      var5.put(a(ad, ae ^ af), this.d.toString());
      var5.put(a(ag, ah ^ ai), this.d.s());
      var5.put(a(aj, ak ^ al), this.b.a().getName());
      var5.put(a(am, an ^ ao), this.d.a().ai() ? a(ap, aq ^ ar) + this.d.a().W() : a(as, at));
      var5.put(a(au, av), this.b.I());
      var5.put(a(aw, ax ^ ay), this.b.H() + a(az, ba ^ bb) + this.d.a().f().getAbsolutePath());
      var5.put(a(bc, bd), NLoginCore_189.a(System.currentTimeMillis(), NLoginCore_388.n));
      int var6 = this.b.n();
      String var7 = this.b.J();
      if (var7 != null) {
         var5.put(a(be, bf ^ bg), var7);
      }

      if (var6 != bh) {
         var5.put(a(bi, bj), this.b.n());
      }

      long var8 = Runtime.getRuntime().maxMemory();
      JSONObject var10 = new JSONObject();
      var10.put(a(bk, bl ^ bm), System.getProperty(a(bn & bo, bp), a(bq & br, bs)));
      var10.put(a(bt, bu ^ bv), System.getProperty(a(bw & bx, by), a(bz & ca, cb)));
      var10.put(a(cc & cd, ce), System.getProperty(a(cf, cg ^ ch), a(ci, cj ^ ck)));
      var10.put(a(cl, cm ^ cn), System.getProperty(a(co, cp ^ cq), a(cr, cs ^ ct)));
      var10.put(a(cu, cv ^ cw), Runtime.getRuntime().availableProcessors());
      var10.put(a(cx, cy ^ cz), this.R());
      var10.put(a(da, db ^ dc), var8 == dd ? de : NLoginCore_449.c(var8));
      var10.put(a(df & dg, dh), NLoginCore_449.c(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
      JSONObject var11 = new JSONObject();
      var11.put(a(di & dj, dk), this.d.b().toString());
      PluginInfoModel[] var12 = this.d.b().a();
      var11.put(a(dl, dm ^ dn), var12.length);
      JSONArray var13 = new JSONArray(var12.length);

      for (int var14 = var_do; var14 < var12.length; var14++) {
         PluginInfoModel var15 = var12[var14];
         JSONObject var16 = new JSONObject();
         var16.put(a(dp, dq), var15.getName());
         var16.put(a(dr & ds, dt), var15.getVersion());
         var16.put(a(du, dv), var15.f());
         Path var17 = var15.a();
         if (var17 != null) {
            var16.put(a(dw, dx), var17.toString());
         }

         var13.put(var14, var16);
      }

      var11.put(a(dy, dz ^ ea), var13);
      var1.put(a(eb & ec, ed), var5);
      var1.put(a(ee, ef), var10);
      var1.put(a(eg, eh ^ ei), var11);
   }

   @Generated
   public NLoginCore_203(NLoginInterface_011<?> var1, NLoginCore_227 var2) {
      this.d = var1;
      this.b = var2;
   }

   public NLoginCore_203 a(String var1, Object var2) {
      JSONObject var3;
      if (!this.a.has(a(a & b, d))) {
         this.a.put(a(e, f ^ g), var3 = new JSONObject());
      } else {
         var3 = this.a.getJSONObject(a(h, i));
      }

      var3.put(var1, var2);
      return this;
   }

   public NLoginCore_203 a(String var1, String var2) {
      return this.a(var1, (Object)var2);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_203.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_397.B("ÉëíÍñĐĈĞĊÙėčěĕÞăĥĤĜĢĜñ", (byte)17, 66), NLoginCore_203.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.C("ыјїКњіёњѥєСџѣќџѥЧޮޣ\u07bfޯޑ߂ާ\u07ba\u07b8\u07b5߃ާ߃\u07beޢт", (byte)17, 67)
               + var1
               + NLoginCore_092.F("ԇ", (byte)17, 70)
               + var2.toString(),
            var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = -5536508342087503661L;
      long var0 = c ^ -8726914811991625228L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(24 + 44),
               (byte)(68 + 1),
               (byte)(33 + 50),
               (byte)(40 + 7),
               (byte)(52 + 15),
               (byte)(36 + 30),
               (byte)(18 + 49),
               (byte)(5 + 42),
               (byte)(7 + 73),
               (byte)(6 + 69),
               67,
               83,
               (byte)(52 + 1),
               (byte)(19 + 61),
               (byte)(28 + 69),
               (byte)(37 + 63),
               (byte)(53 + 47),
               (byte)(20 + 85),
               (byte)(30 + 80),
               (byte)(67 + 36)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_110.A("ǈǏƔǌƘǟƟƾƜǞǚƩ", (byte)113, 65);
               ZKM_STR_B[1] = NLoginCore_433.B("ǈǏƔǌƘǟƟƾƜǞǚƩ", (byte)113, 66);
               ZKM_STR_B[2] = NLoginCore_138.E("֛֔ՠ֘դ֫ի֊ը֪֦յ", (byte)113, 69);
               ZKM_STR_B[3] = NLoginCore_471.C("ւՌՖՏտեշԾբռ՚դՙվ֍թ֒Ւաէ֒ք՛՜", (byte)113, 67);
               ZKM_STR_B[4] = NLoginCore_076.B("ƩƱǝǈƙǇƴǞǡƕǞƴƳǕƶǚǞǄǩǮƷǇƴƵ", (byte)113, 66);
               ZKM_STR_B[5] = NLoginCore_433.C("յիչՕ՜Հ\u0557՞ՙցՓՐ", (byte)113, 67);
               ZKM_STR_B[6] = NLoginCore_183.C("չԿԼչջ՚ձյգիՔբըիՊխէ՞ձՊՒ՞՛՜", (byte)113, 67);
               ZKM_STR_B[7] = NLoginCore_232.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
               ZKM_STR_B[8] = NLoginCore_521.F("չֆ֙֜գ֟։֣ս֧֗֙հցճօֱրյչյ֩րց", (byte)113, 70);
               ZKM_STR_B[9] = NLoginCore_027.E("ն֡է։շ֚ռ֧֭֟իյ", (byte)113, 69);
               ZKM_STR_B[10] = NLoginCore_530.F("֓փյ֑֥֩տ֥֊֮֝յ", (byte)113, 70);
               ZKM_STR_B[11] = NLoginCore_110.D("ր\u0558՜շշ՝ւդ՜վզՅևա֊րՈտՍ֕ժ֔՛՜", (byte)113, 68);
               ZKM_STR_B[12] = NLoginCore_453.D("Հ՜ՐՒ՟փշգՒցլոՆ֊Ոժիա֊ՍՎք՛՜", (byte)113, 68);
               ZKM_STR_B[13] = NLoginCore_027.B("ƵǒǛǖǑƺƭǋƫǖǀƩ", (byte)113, 66);
               ZKM_STR_B[14] = NLoginCore_397.F("ցօէպ֞ժռօ֢֙քյ", (byte)113, 70);
               ZKM_STR_B[15] = NLoginCore_575.F("գբ։֥ցպֈ֥֗֫պ֡\u058bսխհ֑֤֠֡֯֩րց", (byte)113, 70);
               ZKM_STR_B[16] = NLoginCore_027.E("֗֡ջյե֞և֭֝ռքյ", (byte)113, 69);
               ZKM_STR_B[17] = NLoginCore_387.B("ǓƔƜƓƪƧƵǐǚǕǖƩ", (byte)113, 66);
               ZKM_STR_B[18] = NLoginCore_387.F("ձ֠։ղ֗ֈ֊֧֪֠֩յ", (byte)113, 70);
               ZKM_STR_B[19] = NLoginCore_575.D("ԳՙԾՕ\u0558դկ։ՈՖվվաՌք֎\u0590ցզօ֊՞՛՜", (byte)113, 68);
               ZKM_STR_B[20] = NLoginCore_091.D("յՀց՞եԸրբղՆՖդխ\u058cգՙ֊բջսէծ՛՜", (byte)113, 68);
               ZKM_STR_B[21] = NLoginCore_241.F("֞֏ճ֧ը֜֍֘ծ֢ոկվ֡վւֳծִ\u058bֵ֓րց", (byte)113, 70);
               ZKM_STR_B[22] = NLoginCore_387.F("ռր\u0590֪֊քփլ֛շ֮֠ձռ։փ֦֯֬֩֕֩րց", (byte)113, 70);
               ZKM_STR_B[23] = NLoginCore_201.E("֚\u0590֞պցեռփվ֦ոյ", (byte)113, 69);
               ZKM_STR_B[24] = NLoginCore_471.C("ՊՍխբջՎմՀՅօչՐ", (byte)113, 67);
               ZKM_STR_B[25] = NLoginCore_091.E("աճ֥֧֡֟ցվվ֣֢յ", (byte)113, 69);
               ZKM_STR_B[26] = NLoginCore_387.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
               ZKM_STR_B[27] = NLoginCore_183.A("ƺƕǊǎǙƙǟǡƛƽƼƩ", (byte)113, 65);
               ZKM_STR_B[28] = NLoginCore_004.A("ƧƵǎƽƹǑǠƚƼƚǄƩ", (byte)113, 65);
               ZKM_STR_B[29] = NLoginCore_446.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
               ZKM_STR_B[30] = NLoginCore_183.D("վՒԼՐֆՖֆ\u0557տՕաօքՈսՏժէ֏վևք՛՜", (byte)113, 68);
               ZKM_STR_B[31] = NLoginCore_141.E("֞֔՟օ֜տ֖֥֩։ի֣֞֜֊֤֓թֶ֮ֆֹրց", (byte)113, 69);
               ZKM_STR_B[32] = NLoginCore_141.B("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 66);
               ZKM_STR_B[33] = NLoginCore_110.E("֣ւ֣֤ռ\u058c֍չ։֢պֱ֧֓լ֣֪ծֹ֛֨֨րց", (byte)113, 69);
               ZKM_STR_B[34] = NLoginCore_453.A("ǘƶǈƾǘƨǟǌƵƴǒƩ", (byte)113, 65);
               ZKM_STR_B[35] = NLoginCore_559.B("ƤǕǎǕǆƯƞǑơƷǢƩ", (byte)113, 66);
               ZKM_STR_B[36] = NLoginCore_141.F("ց՟ղֆ։դ։վտվ֮յ", (byte)113, 70);
               ZKM_STR_B[37] = NLoginCore_223.B("ƘǊǖǑƝǌǚǢǂƚƺƻǥǑƹǣƵƤƤǆƧǭƴƵ", (byte)113, 66);
               ZKM_STR_B[38] = NLoginCore_110.C("ԸՂՒՀաՙՏվՔ\u0558ի֍Ո՟ֈկ֑ևլւ֏ք՛՜", (byte)113, 67);
               ZKM_STR_B[39] = NLoginCore_553.D("՝ԼՙՏճհՔվ՛օյՐ", (byte)113, 68);
               ZKM_STR_B[40] = NLoginCore_384.D("ծ՞Րլրք՚րեո։Ր", (byte)113, 68);
               ZKM_STR_B[41] = NLoginCore_433.A("ƴƳǜǖƛǎǍƿǝơǞƩ", (byte)113, 65);
               ZKM_STR_B[42] = NLoginCore_559.B("ƒǙƩƨƚƬƹƞǑƚǖƩ", (byte)113, 66);
               ZKM_STR_B[43] = NLoginCore_110.D("տհԾ՚ՒՒմ՜նՒՊ֊փՖ\u0590ոՐ֏֏՝Ս֔՛՜", (byte)113, 68);
               ZKM_STR_B[44] = NLoginCore_110.D("ՑռՂդՒյ\u0557պւֈՆՐ", (byte)113, 68);
               ZKM_STR_B[45] = NLoginCore_453.B("ƤƤǚƪƹǑƚǗǠǑǒƩ", (byte)113, 66);
               ZKM_STR_B[46] = NLoginCore_387.D("՜Ձ՝դՖճւբՙՖ\u0557Ր", (byte)113, 68);
               ZKM_STR_B[47] = NLoginCore_138.E("֜շյ֛մ֖֙ֈ֘ցք֤֨ձծ֥֮։ֶ֪֧փրց", (byte)113, 69);
               ZKM_STR_B[48] = NLoginCore_076.E("֓հէձ֓֗֬խ֙֫չ֑ժրսլ֊ֈծ֚ֈ֩րց", (byte)113, 69);
               ZKM_STR_B[49] = NLoginCore_559.B("ǛǍǄƮƯƞƼǔƵǛǄƩ", (byte)113, 66);
               ZKM_STR_B[50] = NLoginCore_091.C("պՕՋրծ՞պՖ՞ՇիՐ", (byte)113, 67);
               ZKM_STR_B[51] = NLoginCore_223.C("պՕՋրծ՞պՖ՞ՇիՐ", (byte)113, 67);
               ZKM_STR_B[52] = NLoginCore_427.A("ǔưƺƫǛƬǟǗǏƽƟƩ", (byte)113, 65);
               ZKM_STR_B[53] = NLoginCore_324.F("չՙ֘ֆֆս\u058bվ֚֏֦յ", (byte)113, 70);
               ZKM_STR_B[54] = NLoginCore_138.F("ջ֓֕֕՜֞ց֤֭քպ֤վ֎֦֩֕շշֹ֯֫րց", (byte)113, 70);
               ZKM_STR_B[55] = NLoginCore_384.E("ֆպ\u0590֨պ֠ոլզկ֡քփ֍ֳ֧֭֬֨։֢֓րց", (byte)113, 69);
               ZKM_STR_B[56] = NLoginCore_201.E("օ֤ք֛ֈ՝լֈ֬է\u0590յ", (byte)113, 69);
               ZKM_STR_B[57] = NLoginCore_183.E("վ֧ՠղւ֨֗գ֙վְ֤֒֞վղ֊ղ֊֙֊ּյ֩\u0590տִֿ֓տֱֳ", (byte)113, 69);
               ZKM_STR_B[58] = NLoginCore_127.F("֓ք֟ը֢֟բպ֏֏֟կ֮\u058cֱ֒ճօժ֘֩փրց", (byte)113, 70);
               ZKM_STR_B[59] = NLoginCore_110.A("ƲǛƔƦƶǜǋƗǍƲǤǆǘǒƲƦƾƦƾǍƾǰƩǝǄƳǳǇǨƳǥǧ", (byte)113, 65);
               ZKM_STR_B[60] = NLoginCore_453.A("ƌǖƪƪƾƴƖƲǐƲǡƟƿƯƨǛƤǌƽǪǀƽƻǨƤǛǪǏǔƵƴǅ", (byte)113, 65);
               ZKM_STR_B[61] = NLoginCore_004.B("ǆƑƩƴƛǖƛǍǖƕƸǂǕƙǂǚƸǈǗǬǌǐƫƭǐƯǅǈǏƳƵǩǔǰǋǞƷǎǺǌǬǐǜǤǖȁǗȀǝƽȄǟǾȍǔǕ", (byte)113, 66);
               ZKM_STR_B[62] = NLoginCore_521.E("եբ֕֗֫շէք֡֩ֈյ", (byte)113, 69);
               ZKM_STR_B[63] = NLoginCore_451.E("֒օշ՟տ֞֘թիօծսֈ֞֯ի֑֧ևփֵֹրց", (byte)113, 69);
               ZKM_STR_B[64] = NLoginCore_138.B("ƑƕƮǏƺƧǍǒƛǙƜǒǠƸǂƳƜƷǜǤǞǘǐǇƤǃƾǑƿǟƸǨǇǬƴƯǎǈǻƺȀǁǝǻǳǦǖȊǢȄǜȄǟǞȌȑǟǓȕǿȉǨǰȐȍǥǒȚȏǾȏǚǭȂǣǩ", (byte)113, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.E("ֆքչպդփֈְ֧֞ժռ֢ֆվֶ֎կօյִ֩րց", (byte)113, 69);
               ZKM_STR_B[1] = NLoginCore_092.C("ՔնՓԽբնՁչտօիբՃլդՇծ֍մՠժ՞՛՜", (byte)113, 67);
               ZKM_STR_B[2] = NLoginCore_553.D("ռփՁԶչՒՁՇղՓֈլԿ՟ֆ\u058cՇղ՝֊֊ք՛՜", (byte)113, 68);
               ZKM_STR_B[3] = NLoginCore_141.C("ւՌՖՏտեշԾբռ\u0557ՙ\u058bց\u0558ւ\u058cՄխդվ֔՛՜", (byte)113, 67);
               ZKM_STR_B[4] = NLoginCore_397.B("ƩƱǝǈƙǇƴǞǡƕǞơƽƾǐƦǔƫǞǃǫƷƴƵ", (byte)113, 66);
               ZKM_STR_B[5] = NLoginCore_453.E("՝քքբ֦֢֩ջ֢ի֞յ", (byte)113, 69);
               ZKM_STR_B[6] = NLoginCore_553.A("ǒƘƕǒǔƳǊǎƼǄƮƻƷƽƺƴǨǞǛƾǭƷƴƵ", (byte)113, 65);
               ZKM_STR_B[7] = NLoginCore_384.F("֡բ֦֭֠֞֔֍ջ֪֞յ", (byte)113, 70);
               ZKM_STR_B[8] = NLoginCore_183.F("չֆ֙֜գ֟։֣ս֦֣֣֗ֈմ֧֑ր֡֎֣֩րց", (byte)113, 70);
               ZKM_STR_B[9] = NLoginCore_433.D("ՖՙչջՙշՀջՕՄս\u058cՕՎտտ֊֎ւ֊֕ծ՛՜", (byte)113, 68);
               ZKM_STR_B[10] = NLoginCore_027.F("ձմ֢֚ճ֥ե֩֩֬իտ֍խսֶ֦օհֈևֹրց", (byte)113, 70);
               ZKM_STR_B[11] = NLoginCore_530.B("ǙƱƵǐǐƶǛƽƵǗƽƭƠƳǂƾǩǄƴƩƬǬǇǃǍƪǆǯǪƩƱƷ", (byte)113, 66);
               ZKM_STR_B[12] = NLoginCore_127.A("ƙƵƩƫƸǜǐƼƫǚǄǘƯƴƦƠǤƩǡƣǯǭƴƵ", (byte)113, 65);
               ZKM_STR_B[13] = NLoginCore_091.C("՞ԸլՃճէձղօոա\u058c\u0558ջՌՌաեՑմՑ՞՛՜", (byte)113, 67);
               ZKM_STR_B[14] = NLoginCore_201.E("պ\u0590եթւս֍տվվքյ", (byte)113, 69);
               ZKM_STR_B[15] = NLoginCore_575.A("ƗƖƽǙƵƮƼǋǟǙƮƾǧƱƠǪǪƝǢǨǂǭƴƵ", (byte)113, 65);
               ZKM_STR_B[16] = NLoginCore_575.A("ǏƘǙƓƝƬǡƼƱƚǒƩ", (byte)113, 65);
               ZKM_STR_B[17] = NLoginCore_232.E("ձՠջ՛֞֠թւի֜րյ", (byte)113, 69);
               ZKM_STR_B[18] = NLoginCore_397.F("մ֒՞պտ֥վթ\u058b֙քըִ֣֣֤տ֎֍ְ֒փրց", (byte)113, 70);
               ZKM_STR_B[19] = NLoginCore_553.A("ƌƲƗƮƱƽǈǢơƯǘǕǜǡǚǓǘǓǛǜǝǇƴƵ", (byte)113, 65);
               ZKM_STR_B[20] = NLoginCore_004.B("ǎƙǚƷƾƑǙƻǋƟƯƮǧǏưƶƣƸƹƾǘǉƧǢǑǊǁǐǍǷǸǁ", (byte)113, 66);
               ZKM_STR_B[21] = NLoginCore_427.C("չժՎւՃշըճՉսՕՈՃվ\u0558հծ՜ր՞\u058b՞՛՜", (byte)113, 67);
               ZKM_STR_B[22] = NLoginCore_397.E("ռր\u0590֪֊քփլ֛շ֑֭֠ջ֜խ֖հֲֈ֫֩րց", (byte)113, 69);
               ZKM_STR_B[23] = NLoginCore_387.E("֜սհեթ֗իշ֢֚֟յ", (byte)113, 69);
               ZKM_STR_B[24] = NLoginCore_433.E("֚\u0590ն֕֞֩֠յ֍ֱ֮֗֠֡֜ղ֫հְձ֬֩րց", (byte)113, 69);
               ZKM_STR_B[25] = NLoginCore_201.F("\u0558ց֞֡֊֚թ֕ֈ֎ըְ֩֞ֆծծֹ֖֫֙֓րց", (byte)113, 70);
               ZKM_STR_B[26] = NLoginCore_183.A("ƚǜƩƛǌƳǕǠǃƹǞƩ", (byte)113, 65);
               ZKM_STR_B[27] = NLoginCore_027.F("֕ւ֟նռգփ֗ծօծִ֪֤֢֨֨֍ն֨չ֩րց", (byte)113, 70);
               ZKM_STR_B[28] = NLoginCore_521.D("ՕԽԼռԼՎՏԾՀւըեՃ\u058cիֈդվՑՆիծ՛՜", (byte)113, 68);
               ZKM_STR_B[29] = NLoginCore_183.F("֣փ֥֨շյր\u058cժս\u0590յ", (byte)113, 70);
               ZKM_STR_B[30] = NLoginCore_076.C("վՒԼՐֆՖֆ\u0557տՕ՟Ծշածՠ՝\u0590՟հֆ՞՛՜", (byte)113, 67);
               ZKM_STR_B[31] = NLoginCore_183.D("չկԺՠշ՚քձրդՇեՇռՇ\u058b՜Ց֑֓ըք՛՜", (byte)113, 68);
               ZKM_STR_B[32] = NLoginCore_141.D("չվպ\u0557ՑՠջՐբգյՐ", (byte)113, 68);
               ZKM_STR_B[33] = NLoginCore_453.B("ǗƶǗǘưǀǁƭƽǖƮƵƾǡǣƵƸǜǞǬǯƷƴƵ", (byte)113, 66);
               ZKM_STR_B[34] = NLoginCore_559.C("իՁՋդՓ՚ՑՃոՠփՂ\u0557չռզՐճձժա՞՛՜", (byte)113, 67);
               ZKM_STR_B[35] = NLoginCore_453.D("ՐյնԶՁպօաձՈ՝ըգզՉբլե\u0590դխ՞՛՜", (byte)113, 68);
               ZKM_STR_B[36] = NLoginCore_559.B("ƚƘƽǋǎǕƝƭǚǙƵǕǟǏƞƸƠǈǫǩǃǝƴƵ", (byte)113, 66);
               ZKM_STR_B[37] = NLoginCore_384.E("դ֖֢֝թ֦֮֘֎զֆ֙֡խ\u0590֏ճַ֓իַ֥֥պևնֿׂ֚֗֙֞", (byte)113, 69);
               ZKM_STR_B[38] = NLoginCore_387.C("ԸՂՒՀաՙՏվՔ\u0558մըէցկզՍ\u058c֑տքք՛՜", (byte)113, 67);
               ZKM_STR_B[39] = NLoginCore_324.D("ճ\u0557խՕփն\u0557ՖըժՓՐ", (byte)113, 68);
               ZKM_STR_B[40] = NLoginCore_387.D("տիԹցրեեցՒշշՄ\u0558ն՟ռդՐևքփք՛՜", (byte)113, 68);
               ZKM_STR_B[41] = NLoginCore_201.C("ԺԿլւ՜Ցՙըսռոտոք\u0558օ\u058cՒձՆյ՞՛՜", (byte)113, 67);
               ZKM_STR_B[42] = NLoginCore_433.A("ƵƚƚƳƮǍǉƮƴǓƛƩ", (byte)113, 65);
               ZKM_STR_B[43] = NLoginCore_530.D("տհԾ՚ՒՒմ՜նՒՁ՚՚ւխՆֆգձդմք՛՜", (byte)113, 68);
               ZKM_STR_B[44] = NLoginCore_076.D("կգԻՖցղհ՞չՔիռն։։լՌ\u058bփգ\u0590՞՛՜", (byte)113, 68);
               ZKM_STR_B[45] = NLoginCore_223.C("ն՝ԻԼաևֆֈՙՁՔթի֊բՏՊՊօւՍք՛՜", (byte)113, 67);
               ZKM_STR_B[46] = NLoginCore_110.A("ƵƫǓƹƹƿǋǊƝƹǍƢƞƱǒƾƤǚǉǪƮǇƴƵ", (byte)113, 65);
               ZKM_STR_B[47] = NLoginCore_553.A("ǐƫƩǏƨǊǍƼǌƵƹǢƞǙƶƤǈǙǇƬƶǯǑƺǒưǠǊǠƩǊǩ", (byte)113, 65);
               ZKM_STR_B[48] = NLoginCore_241.D("ծՋՂՌծղևՈմֆՔսյՀ՛բդՍմ՞հծ՛՜", (byte)113, 68);
               ZKM_STR_B[49] = NLoginCore_004.C("ԾՖձլֆԽֈվ՞յցո՟Մտ՛\u0590ժխՐժծ՛՜", (byte)113, 67);
               ZKM_STR_B[50] = NLoginCore_241.C("ցչբճ՛ՖձՔք՟ՉՃաՅ՜ՠփ֍փՓժ֔՛՜", (byte)113, 67);
               ZKM_STR_B[51] = NLoginCore_387.A("ǌƖǏƬǑƚƬƓƺƽǥƤǚƻǜƠƪƵƦƭƻǝƴƵ", (byte)113, 65);
               ZKM_STR_B[52] = NLoginCore_027.D("ԷԺվՔՖււե֊Ւ\u0557Ր", (byte)113, 68);
               ZKM_STR_B[53] = NLoginCore_004.F("սֆ֟֝ր֠պ֖֫֏իյ", (byte)113, 70);
               ZKM_STR_B[54] = NLoginCore_092.B("ƯǇǉǉƐǒƵǘǡƸƯƲǀǄƱǚƠǚƽƭƾƷƴƵ", (byte)113, 66);
               ZKM_STR_B[55] = NLoginCore_453.C("աՕիփՕջՓՇՁՊռջցՈ\u0590լ֏ՒՉգՓք՛՜", (byte)113, 67);
               ZKM_STR_B[56] = NLoginCore_397.F("գՙ֥ճ֛դ֤֙֡֍֯տ֦֭֫փ֍ցձւ֤֓րց", (byte)113, 70);
               ZKM_STR_B[57] = NLoginCore_530.E("վ֧ՠղւ֨֗գ֙վְ֤֒֞վղ֊ղ֊֙֊ֶָֺ֩պ֢֬պֶַֽ", (byte)113, 69);
               ZKM_STR_B[58] = NLoginCore_138.E("֓ք֟ը֢֟բպ֏֏֟կ֭տմև֤օ\u0590֣ոփրց", (byte)113, 69);
               ZKM_STR_B[59] = NLoginCore_027.A("ƲǛƔƦƶǜǋƗǍƲǤǆǘǒƲƦƾƦƾǍƾǮǁǙǢǡǒǧǣƳǣƷ", (byte)113, 65);
               ZKM_STR_B[60] = NLoginCore_324.A("ƌǖƪƪƾƴƖƲǐƲǡƟƿƯƨǛƤǌƽǪǀƸǘǀƬǋǁǢǥǨǙǤ", (byte)113, 65);
               ZKM_STR_B[61] = NLoginCore_223.F("֒՝յրէ֢է֢֙աք֎֡ե֎֦քָ֣֔֘֜շչ֜ջ֑֛֔տցֵּ֪֠֗փ֚׆ָׇ֘֜֨\u05cbּׁ֞֯֡֓הזי֠֡", (byte)113, 70);
               ZKM_STR_B[62] = NLoginCore_027.D("Րվճւ՞վս՛եբգՐ", (byte)113, 68);
               ZKM_STR_B[63] = NLoginCore_223.E("֒օշ՟տ֞֘թիօիլֳ֟֊ծ֮֘ֈօֵֹֽ֑֚֚֩֗֔֜տ֤", (byte)113, 69);
               ZKM_STR_B[64] = NLoginCore_183.F("՝ապ֛ֆճ֙֞է֥ը֞֬ք֎տըփְ֪֤֨֜֓հ֏֊֝\u058b֫քִָ֓րջׇ֚֔ֆ\u05cc֍ֲׇֿ֢֩ז֮א֨א֪֫טם֫֟ס\u05cbוִּלָׇאֱשֻֿ֞חץֵ֫", (byte)113, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.F("֕ց֣֧֠֠ֈ֡֯սզֳ֦֟֓վճծ֠ևֻ֨և֫֝֩֟շ׃ָ׀֟", (byte)113, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_384.D("բռԵՐձԸչ՜բո\u058bՄՆե՞ցօռլօ֎֔՛՜", (byte)113, 68);
         }
      }
   }

   private byte[] b() {
      this.a(this.a);
      this.a(a(k, l ^ m), NLoginCore_525.a((n != 0)));
      return this.a.toString(o).getBytes(StandardCharsets.UTF_8);
   }
}
