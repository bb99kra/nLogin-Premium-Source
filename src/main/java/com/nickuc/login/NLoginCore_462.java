package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_462 extends NLoginType_032 {
   private static long dk = Long.reverse(1441151880758558720L);
   private static int es = 104 >>> 66 | 104 << ~66 + 1;
   private static long cu = Long.reverse(7580268422439428913L);
   private static long var_do = Long.reverse(1441151880758558720L);
   private static int fd = (0 >>> 30 | 0 << -30) & -1;
   private static long cg = Long.reverse(7580268422439428913L);
   private static int gf = (-1 >>> 197 | -1 << ~197 + 1) & -1;
   private static int bu = (-1 >>> 74 | -1 << ~74 + 1) & -1;
   private static int dg = (-1 >>> 158 | -1 << ~158 + 1) & -1;
   private static int hi = (637534208 >>> 56 | 637534208 << -56) & -1;
   private static int dt = 159383552 >>> 23 | 159383552 << -23;
   private static int ff = (-1 >>> 94 | -1 << -94) & -1;
   private static int dw = (0 >>> 238 | 0 << -238) & -1;
   private static int ee = Integer.reverse(0);
   private static long dr = Long.reverse(9021420303197987633L);
   private static int ft = -1 >>> 72 | -1 << ~72 + 1;
   private static long bv = Long.reverse(9021420303197987633L);
   private static int cs = 0 >>> 54 | 0 << ~54 + 1;
   private static int fo = 4096 >>> 139 | 4096 << -139;
   private static int ez = Integer.reverse(0);
   private static int ep = (-939524096 >>> 187 | -939524096 << ~187 + 1) & -1;
   private static int gk = 2293760 >>> 80 | 2293760 << -80;
   private static int da = 0 >>> 121 | 0 << -121;
   private static long dz = Long.reverse(1441151880758558720L);
   private static long bn = Long.reverse(7580268422439428913L);
   private static int db = (229376 >>> 142 | 229376 << ~142 + 1) & -1;
   private static int ct = Integer.reverse(805306368);
   private static long dc = Long.reverse(7580268422439428913L);
   private static int ei = Integer.reverse(-402653184);
   private static int cd = 131072 >>> 48 | 131072 << -48;
   private static int fk = 67108864 >>> 217 | 67108864 << -217;
   private static int fp = Integer.reverse(0);
   private static long ej = Long.reverse(9021420303197987633L);
   private static int ge = Integer.reverse(1140850688);
   private static long fu = Long.reverse(9021420303197987633L);
   private static int dp = Integer.reverse(0);
   private static long bz = Long.reverse(1441151880758558720L);
   private static int cw = 0 >>> 36 | 0 << ~36 + 1;
   private static int gy = (64 >>> 230 | 64 << ~230 + 1) & -1;
   private static long cj = Long.reverse(7580268422439428913L);
   private static int cp = Integer.reverse(-805306368);
   private static int dq = (294912 >>> 238 | 294912 << -238) & -1;
   private static int cb = Integer.reverse(0);
   private static long dy = Long.reverse(7580268422439428913L);
   private static int ds = 0 >>> 117 | 0 << ~117 + 1;
   private static long bk = Long.reverse(7580268422439428913L);
   private static int fn = 0 >>> 72 | 0 << ~72 + 1;
   private static int bm = Integer.reverse(536870912);
   private static long fc = Long.reverse(9021420303197987633L);
   private static int aw = Integer.reverse(0);
   private static long gv = Long.reverse(1441151880758558720L);
   private static long ck = Long.reverse(1441151880758558720L);
   private static int fl = 15360 >>> 137 | 15360 << -137;
   private static long ed = Long.reverse(1441151880758558720L);
   private static int di = Integer.reverse(134217728);
   private static int fs = 260046848 >>> 87 | 260046848 << ~87 + 1;
   private static long fg = Long.reverse(9021420303197987633L);
   private static int bw = Integer.reverse(0);
   private static long eu = Long.reverse(1441151880758558720L);
   private static int dl = Integer.reverse(0);
   private static long bo = Long.reverse(1441151880758558720L);
   private static int ef = 92274688 >>> 54 | 92274688 << ~54 + 1;
   private static long en = Long.reverse(1441151880758558720L);
   private static long gl = Long.reverse(9021420303197987633L);
   private static int hb = 0 >>> 222 | 0 << -222;
   private static long du = Long.reverse(7580268422439428913L);
   private static int eb = (21 >>> 128 | 21 << -128) & -1;
   private static long dd = Long.reverse(1441151880758558720L);
   private static int gt = Integer.reverse(-1543503872);
   private static int dx = Integer.reverse(671088640);
   private static int fr = Integer.reverse(0);
   private static int cc = 16777216 >>> 184 | 16777216 << ~184 + 1;
   private static long dj = Long.reverse(7580268422439428913L);
   private static long eq = Long.reverse(9021420303197987633L);
   private static int fa = (-1073741818 >>> 30 | -1073741818 << ~30 + 1) & -1;
   private static int hh = Integer.reverse(1677721600);
   private static int dm = (8704 >>> 233 | 8704 << -233) & -1;
   private static long cq = Long.reverse(7580268422439428913L);
   private static int bi = Integer.reverse(0);
   private static int fw = Integer.reverse(67108864);
   private static int fx = Integer.reverse(-1);
   private static int bd = (8388608 >>> 118 | 8388608 << -118) & -1;
   private static long bs = Long.reverse(9021420303197987633L);
   private static long em = Long.reverse(7580268422439428913L);
   private static int ax = Integer.reverse(0);
   private static int gi = (256 >>> 102 | 256 << ~102 + 1) & -1;
   private static int hf = (0 >>> 73 | 0 << -73) & -1;
   private static int bt = 192 >>> 69 | 192 << -69;
   private static long dv = Long.reverse(1441151880758558720L);
   private static int ca = Integer.reverse(0);
   private static int ga = (1107296256 >>> 121 | 1107296256 << ~121 + 1) & -1;
   private static int br = Integer.reverse(-1);
   private static int ey = (524288 >>> 211 | 524288 << ~211 + 1) & -1;
   private static int er = Integer.reverse(0);
   private static int gb = Integer.reverse(-1);
   private static long bl = Long.reverse(1441151880758558720L);
   private static long cy = Long.reverse(7580268422439428913L);
   private static int av = 33554432 >>> 217 | 33554432 << -217;
   private static int gn = (589824 >>> 238 | 589824 << ~238 + 1) & -1;
   private static int ha = 2 >>> 129 | 2 << ~129 + 1;
   private static long eg = Long.reverse(7580268422439428913L);
   private static int az = (524288 >>> 83 | 524288 << ~83 + 1) & -1;
   private static long gp = Long.reverse(1441151880758558720L);
   private static int ea = Integer.reverse(0);
   private static long go = Long.reverse(7580268422439428913L);
   private static int bj = (96 >>> 101 | 96 << ~101 + 1) & -1;
   private static long bf = Long.reverse(9021420303197987633L);
   private static int fe = Integer.reverse(939524096);
   private static long ec = Long.reverse(7580268422439428913L);
   private static int ev = 0 >>> 161 | 0 << -161;
   private static long et = Long.reverse(7580268422439428913L);
   private static long fj = Long.reverse(9021420303197987633L);
   private static int bb = Integer.reverse(0);
   private static int hd = (0 >>> 184 | 0 << ~184 + 1) & -1;
   private static int gd = (8388608 >>> 54 | 8388608 << -54) & -1;
   private static int gw = (2048 >>> 138 | 2048 << ~138 + 1) & -1;
   private static int fb = Integer.reverse(-1);
   private static long e;
   private static long ba = Long.reverse(9021420303197987633L);
   private static String[] ZKM_STR_B = new String[hi];
   private static int hg = (0 >>> 190 | 0 << -190) & -1;
   private static int de = 0 >>> 227 | 0 << -227;
   private static int gz = 0 >>> 80 | 0 << ~80 + 1;
   private static int ew = (4 >>> 161 | 4 << ~161 + 1) & -1;
   private static int gj = Integer.reverse(0);
   private static long cr = Long.reverse(1441151880758558720L);
   private static int ci = Integer.reverse(-1879048192);
   private static long cv = Long.reverse(1441151880758558720L);
   private static long gc = Long.reverse(9021420303197987633L);
   private static int bc = Integer.reverse(0);
   private static long gg = Long.reverse(9021420303197987633L);
   private static int df = (503316480 >>> 153 | 503316480 << -153) & -1;
   private static long cz = Long.reverse(1441151880758558720L);
   private static String[] ZKM_STR_A = new String[hh];
   private static int cm = Integer.reverse(1342177280);
   private static long ay = Long.reverse(9021420303197987633L);
   private static int gq = Integer.reverse(1073741824);
   private static int gh = (0 >>> 49 | 0 << -49) & -1;
   private static long gu = Long.reverse(7580268422439428913L);
   private static int gx = Integer.reverse(0);
   private static int fq = (2097152 >>> 21 | 2097152 << ~21 + 1) & -1;
   private static int ce = Integer.reverse(Integer.MIN_VALUE);
   private static long ch = Long.reverse(1441151880758558720L);
   private static int bx = Integer.reverse(-536870912);
   private static int el = Integer.reverse(402653184);
   private static int gm = 268435456 >>> 188 | 268435456 << -188;
   private static int ex = (0 >>> 91 | 0 << -91) & -1;
   private static long fy = Long.reverse(9021420303197987633L);
   private static int eo = 0 >>> 50 | 0 << ~50 + 1;
   private static int bg = Integer.reverse(0);
   private static int ek = Integer.reverse(0);
   private static long co = Long.reverse(9021420303197987633L);
   private static int be = -1 >>> 130 | -1 << ~130 + 1;
   private static int cx = 872415232 >>> 250 | 872415232 << ~250 + 1;
   private static int a = (4 >>> 130 | 4 << ~130 + 1) & -1;
   private static long by = Long.reverse(7580268422439428913L);
   private static int cn = Integer.reverse(-1);
   private static long dn = Long.reverse(7580268422439428913L);
   private static int gr = Integer.reverse(-1073741824);
   private static long dh = Long.reverse(9021420303197987633L);
   private static int gs = (524288 >>> 51 | 524288 << ~51 + 1) & -1;
   private static int cl = (0 >>> 145 | 0 << -145) & -1;
   private static int fz = Integer.reverse(0);
   private static int bp = Integer.reverse(0);
   private static int hc = Integer.reverse(0);
   private static int fv = 0 >>> 40 | 0 << ~40 + 1;
   private static int he = Integer.reverse(0);
   private static int bq = 5120 >>> 74 | 5120 << ~74 + 1;
   private static int fh = Integer.reverse(0);
   private static long fm = Long.reverse(9021420303197987633L);
   private static int fi = (3712 >>> 167 | 3712 << ~167 + 1) & -1;
   private static int bh = (0 >>> 208 | 0 << -208) & -1;
   private static long eh = Long.reverse(1441151880758558720L);
   private static int cf = Integer.reverse(268435456);

   private static String a(int var0, long var1) {
      var1 ^= 40L;
      var1 ^= 2077228097307707479L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(6 + 63),
                     (byte)(40 + 43),
                     (byte)(2 + 45),
                     (byte)(11 + 56),
                     (byte)(64 + 2),
                     (byte)(3 + 64),
                     (byte)(39 + 8),
                     (byte)(15 + 65),
                     (byte)(23 + 52),
                     (byte)(54 + 13),
                     (byte)(51 + 32),
                     53,
                     80,
                     (byte)(48 + 49),
                     (byte)(24 + 76),
                     (byte)(19 + 81),
                     (byte)(41 + 64),
                     (byte)(12 + 98),
                     (byte)(55 + 48)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.A("ĤıİóĳįĪĳľĭúĸļĵĸľĀҗҋҔҔѱҙѾҝ", (byte)33, 65));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_462.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.C("Юѐђвіѵѭ҃ѯоѼѲҀѺуѨҊ҉ҁ҇ҁі", (byte)27, 67), NLoginCore_462.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢭࢡࢪࢪࢇࢯ\u0894ࢳԪ", (byte)27, 69) + var1 + NLoginCore_446.F("ԑ", (byte)27, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (NLoginCore_329.n.ar()) {
         if (!NLoginCore_329.d.ar()) {
            if (!(var1 instanceof NLoginCore_277)) {
               if (var3.length < a) {
                  NLoginCore_487 var26 = NLoginCore_487.x;
                  Object[] var29 = new Object[av];
                  var29[aw] = a(ax, ay) + var2.toLowerCase(Locale.ENGLISH) + a(az, ba);
                  NLoginCore_150.a(var1, var26, var29);
               } else {
                  NLoginCore_270 var13 = new NLoginCore_270();
                  String var14 = var3[bb];
                  ForceRegisterConfig var17 = this.a.a().a(var1, super.a, var3, var14);
                  if (var17 != null) {
                     if (!var17.h()) {
                        NLoginCore_150.a(var1, NLoginCore_487.t);
                     } else if (var17.a() == NLoginCore_229.c) {
                        NLoginCore_150.a(var1, a(bd & be, bf));
                     } else if (!var17.t()) {
                        var17.b(null);
                        var17.A();
                        var17.z();
                        NLoginCore_291 var24 = this.a.a();
                        NLoginCore_436[] var28 = new NLoginCore_436[fo];
                        var28[fp] = NLoginCore_436.d;
                        var28[fq] = NLoginCore_436.l;
                        if (!var24.a(var17, var28)) {
                           NLoginCore_150.a(var1, NLoginCore_487.w);
                        } else {
                           NLoginCore_150.a(var1, a(fs & ft, fu));
                           NLoginCore_150.a(var1, a(fw & fx, fy));
                           NLoginCore_150.a(var1, a(ga & gb, gc) + var13.a(TimeUnit.SECONDS, gd) + a(ge & gf, gg));
                        }
                     } else {
                        ForceRegisterConfig var19 = this.a.a().a(var14, null, null, (bh != 0));
                        if (var19 == null) {
                           NLoginCore_150.a(var1, NLoginCore_487.w);
                        } else {
                           if (var19.r() && !Objects.equals(var17.a(), var19.a())) {
                              if (NLoginCore_150.j()) {
                                 NLoginCore_150.a(var1, a(bj, bk ^ bl) + var19.i() + a(bm, bn ^ bo));
                              } else {
                                 NLoginCore_150.a(var1, a(bq & br, bs) + var19.i() + a(bt & bu, bv));
                              }

                              NLoginCore_150.a(var1, a(bx, by ^ bz));
                              if (!this.a.a().b(var19)) {
                                 NLoginCore_150.a(var1, NLoginCore_487.w);
                                 return;
                              }
                           }

                           UUID var20 = var17.getMojangId();
                           UUID var21 = var17.a();
                           if (var20 == null || !var20.equals(var21) || var3.length != cc && (var3.length != cd || !var3[ce].equals(a(cf, cg ^ ch)))) {
                              var17.b(null);
                              var17.A();
                              NLoginCore_291 var23 = this.a.a();
                              NLoginCore_436[] var27 = new NLoginCore_436[ew];
                              var27[ex] = NLoginCore_436.d;
                              var27[ey] = NLoginCore_436.l;
                              if (!var23.a(var17, var27)) {
                                 NLoginCore_150.a(var1, NLoginCore_487.w);
                              } else {
                                 NLoginCore_150.a(var1, a(fa & fb, fc));
                                 NLoginCore_150.a(var1, a(fe & ff, fg));
                                 NLoginCore_150.a(var1, a(fi, fj) + var13.a(TimeUnit.SECONDS, fk) + a(fl, fm));
                              }
                           } else {
                              String var10 = var2 + a(ci, cj ^ ck) + var17.d(var3[cl]) + a(cm & cn, co);
                              NLoginCore_150.a(var1, a(cp, cq ^ cr));
                              if (NLoginCore_150.j()) {
                                 NLoginCore_150.a(var1, a(ct, cu ^ cv));
                                 NLoginCore_150.a(var1, a(cx, cy ^ cz));
                                 NLoginCore_150.a(var1, a(db, dc ^ dd));
                                 NLoginCore_150.a(var1, a(df & dg, dh) + var21 + a(di, dj ^ dk));
                                 NLoginCore_150.a(var1, a(dm, dn ^ var_do));
                                 NLoginCore_150.a(var1, a(dq, dr) + var10);
                              } else {
                                 NLoginCore_150.a(var1, a(dt, du ^ dv));
                                 NLoginCore_150.a(var1, a(dx, dy ^ dz));
                                 NLoginCore_150.a(var1, a(eb, ec ^ ed));
                                 NLoginCore_150.a(var1, a(ef, eg ^ eh) + var21 + a(ei, ej));
                                 NLoginCore_150.a(var1, a(el, em ^ en));
                                 NLoginCore_150.a(var1, a(ep, eq) + var10);
                              }

                              NLoginCore_150.a(var1, a(es, et ^ eu));
                           }
                        }
                     }
                  }
               }
            } else {
               NLoginCore_277 var4 = (NLoginCore_277)var1;
               NLoginCore_187 var5 = this.a.a();
               if (!var5.b(var4)) {
                  NLoginCore_509 var16 = var5.b(var4);
                  NLoginCore_501 var18 = var16.d(NLoginCore_567.n);
                  if (var18 != null && var18.a() == NLoginCore_211.b) {
                     NLoginCore_466 var22 = NLoginCore_466.b;
                     String[] var10003 = new String[gi];
                     var10003[gj] = a(gk, gl);
                     var10003[gm] = a(gn, go ^ gp);
                     var10003[gq] = Integer.toString(NLoginCore_211.b.v());
                     var10003[gr] = Integer.toString(NLoginCore_445.b.v());
                     var22.a(var4, var16, var10003);
                  }
               } else if (var3.length != gs) {
                  String var10000 = a(gt, gu ^ gv);
                  Object[] var10001 = new Object[gw];
                  var10001[gx] = var2;
                  var10001[gy] = NLoginCore_150.a(NLoginCore_487.D, var4);
                  String var15 = String.format(var10000, var10001);
                  NLoginCore_487 var25 = NLoginCore_487.x;
                  Object[] var10002 = new Object[ha];
                  var10002[hb] = var15;
                  NLoginCore_150.a(var1, var25, var10002);
               } else {
                  NLoginCore_509 var6 = var5.b(var4);
                  ForceRegisterConfig var7 = var6.a();
                  synchronized (var7.c) {
                     if (!var7.h()) {
                        NLoginCore_150.a(var1, NLoginCore_487.t);
                        NLoginCore_150.a(var4, NLoginCore_194.F);
                     } else if (var7.t()) {
                        NLoginCore_150.a(var1, NLoginCore_487.I);
                        NLoginCore_150.a(var4, NLoginCore_194.F);
                     } else {
                        String var9 = var3[he];
                        if (!this.a.a().a(var7, var9)) {
                           NLoginCore_150.a(var4, NLoginCore_487.P);
                           NLoginCore_150.a(var4, NLoginCore_194.F);
                        } else {
                           NLoginCore_073.a(this.a, var6.d(), var4.b().getAddress(), NLoginCore_280.c);
                           var4.a(NLoginCore_150.a(NLoginCore_487.s, var4));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void b() {
      e = -8302603908692226922L;
      long var0 = e ^ 2077228097307707479L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(16 + 52),
               (byte)(39 + 30),
               (byte)(4 + 79),
               (byte)(34 + 13),
               (byte)(54 + 13),
               (byte)(9 + 57),
               67,
               47,
               (byte)(17 + 63),
               (byte)(24 + 51),
               (byte)(18 + 49),
               (byte)(70 + 13),
               (byte)(41 + 12),
               (byte)(3 + 77),
               (byte)(87 + 10),
               (byte)(83 + 17),
               (byte)(17 + 83),
               (byte)(28 + 77),
               (byte)(35 + 75),
               (byte)(66 + 37)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.A("ÐàÝĈēõÿĈąÑÑß", (byte)12, 65);
               ZKM_STR_B[1] = NLoginCore_076.C("ШмнЕЈсѓвУмяИёдКюОСѡдѐмхѝчѓсќўцпџ", (byte)12, 67);
               ZKM_STR_B[2] = NLoginCore_453.E("ՁӹԒՁԎԅԙԜԈԿԖԻԆՉԈԠԊԠՆՆԿԵԬԧԙԳԗՙՎՑԲԯԻԹՀԿԵՃԻԴՆԼԪըԻ\u0557ըՏԫՈժձՆխժղիՅԭշՇԶԸկձվՌԿչԿՑՆՠՇմլ՛ՠփՍ՝Մմ֏ֈ՞՛՜", (byte)12, 69);
               ZKM_STR_B[3] = NLoginCore_173.E("ԢӻՂԱԯՆԤԿՀԉԉԂՍԥՐՋԇԞԞԫՄՅԸԔՌԔՄԹԹ՜ԻՈԩՍԷԽԼՠԤԤ՛Պ՝ՙԬԦ\u0558ԢԩեՠժՇաՀՉՑՙչթԹյի\u0558ՠժջգԼոՏ՜րւիՐ", (byte)12, 69);
               ZKM_STR_B[4] = NLoginCore_183.B("ÆîÐċĐôþĖÏòĊÓēĘôóĉęëāĖĆùćûĕþĆčýĤĨđĀĐĩëčĉĠąĢĂĩĎęðĔĚłĭĕČŃĊċ", (byte)12, 66);
               ZKM_STR_B[5] = NLoginCore_453.D("ЯхсхЧєЗТЌаиЛмюнџжЯКњосмбѪќЧѦѪѡэсѮђђѮэтЮэѴѷѪйѻѿѸюѶѕ҄ѲѥѯѰлѕѵьчѻ҂чѡѿ҃҃ҐҌяѬыҍ҈Ғѡ", (byte)12, 68);
               ZKM_STR_B[6] = NLoginCore_091.D("ЈаВэђжрјБдывѕаіЯџѕзрсзйгѓНѢпѡррЩммЦѵЯѴѕёњшѳмѭѰѡѡяяѬѭмџєҁўѽїѭѫѢѿю", (byte)12, 68);
               ZKM_STR_B[7] = NLoginCore_241.B("ÞÚÝÎăßÈÍÓåúß", (byte)12, 66);
               ZKM_STR_B[8] = NLoginCore_453.C("МєЫЎАуБѓцлћШЗаЗьиСэжѐїоХУѩШѧњСЪѝ", (byte)12, 67);
               ZKM_STR_B[9] = NLoginCore_433.C("ХлЬЬУЏхЯйумС", (byte)12, 67);
               ZKM_STR_B[10] = NLoginCore_453.A("ĀČĈçēÓĎÔĈèâóæêĆöĈàñþãģýåñúêģģêĩġ", (byte)12, 65);
               ZKM_STR_B[11] = NLoginCore_173.E("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 69);
               ZKM_STR_B[12] = NLoginCore_110.A("ÐëÒĀíąåôĐăñĎĝĎÚÝûċďíĂġôĦĚĕĀøĪĉíĭıĤêąĈýíĦĸČċĖļěûċĽĻĵĳĻüģĢĢĀŋĉěħŉİ", (byte)12, 65);
               ZKM_STR_B[13] = NLoginCore_091.D("РМПАхСЊЏЕЧмС", (byte)12, 68);
               ZKM_STR_B[14] = NLoginCore_553.A("ùðúÍĕĔþčćìēëĊĞøĊúýĂďĐñĠþĂüċăğąäëīĩĎĠĆĔõēĦēĬĒĸļćĸ÷øļčĚĎŁŇŁÿğĽþņŅĥŉĈĄĦōĶēŗİģĴěōĜĦĲĴŕĴŜŠłŎķŧŪħļŠŀĹŇ", (byte)12, 65);
               ZKM_STR_B[15] = NLoginCore_092.E("ԩԊԽԹԺԯՈԧԁԺՊԇԟԧԻԘԙԊՃԱԯՈԮՒԴԨԑՖՋԞ\u0530ՏԚԫԹ՚ԲՀԟ՟ԴՕՠԫՄՌՊխթխծԱՊՐեխձըպոՌշյժ", (byte)12, 69);
               ZKM_STR_B[16] = NLoginCore_384.D("яЛфдѕюйШТміС", (byte)12, 68);
               ZKM_STR_B[17] = NLoginCore_446.A(
                  "ùðúÍĕĔþčćìēċäúÙÞØþòĞĢûĆĆġħēĊĢçüøëĊïďčëíîĲĒĬøĄĪįıĿúĴěĂğĀýúĔĻėĺĨčŎľğĦĊīŇıŕĮēĶĬĸĻŔįĪĪŁōĸŚğŃłļŢĦũĦŢŚśŲŜőœūŶņŁĴųĳĴĽĽňŨĿŜųőŔņŞŻřūŃŢƆſƏżƐŏŽƍŦŭōŰťŬƎƉƐƏŘƁƓƒƑƠŭŪū",
                  (byte)12,
                  65
               );
               ZKM_STR_B[18] = NLoginCore_446.D("гНЯЎщдрЪифїйнЛНъѝћѕдћљѝщекЩсЩѢѯѬЬЯЯѯгѷѳйзыжыиюѺѹѶћѭмћяьэ", (byte)12, 68);
               ZKM_STR_B[19] = NLoginCore_110.D("оЍхЫдЎсіЖдєбъѝљъѝфѓСОѕѩѧфЩѢыХојќыѱќфШїяѦчѶвіджинҁѳѮџў҅ьэ", (byte)12, 68);
               ZKM_STR_B[20] = NLoginCore_530.C("РМПАхСЊЏЕЧмС", (byte)12, 67);
               ZKM_STR_B[21] = NLoginCore_521.C("лвмЏїірящЮђяыЬЭўдКвУХуКСпўјѝмћѨууѢѠшџЯѥѨхёѺѼђєѭѵѼѷћѯѤ҇҃пђџѾѬфчѬъѦѳ҈҅ѵҒҙѰқёѕҊѼѾѮѳҌѠѱѡҎљҦґѲҡҭҦѷѪѽҍ", (byte)12, 67);
               ZKM_STR_B[22] = NLoginCore_559.C("эыёеГёсЫИлцѐЗѝЗєзМолђѨТъєНХѤшкъьуХѯѨащсгыњюжѵѧѱҀѳјяўюѕѲѪѹ҇уѧҊцѨҋъѾ҄ѿѫѡҗѫѭѤѸѡ", (byte)12, 67);
               ZKM_STR_B[23] = NLoginCore_138.D("яЛфдѕюйШТміС", (byte)12, 68);
               ZKM_STR_B[24] = NLoginCore_427.B(
                  "ùðúÍĕĔþčćìēòĝçÜĒèĂĢċĢăÜñæèöüâĘĞĠîĮēāĤïíĈĤĕĪñąĶĿĪĊđĞęĞĔħĹŇĞĉŅĖġĤĭĻĈČĞĮőġŊĴĔŐńřĵĖĹŘşĽĭĲİĘŜŜĺūŦľĪňŃĽũŅłŏŕŒŏŨĹũŏőĳűĸŘŝŏƄľŞƁťŔŚŷŅņŜŧŜżƊƍſůŶşţƌőőş",
                  (byte)12,
                  66
               );
               ZKM_STR_B[25] = NLoginCore_453.A("ÂÏæĂčíÔìÊËđðĐĔĈØĔďĕñĥąýüĆąĒâùąĜĆģįĀëĔąîö÷āöĆěûīĹĖııĢęčĊċ", (byte)12, 65);
               ZKM_STR_B[26] = NLoginCore_453.D("РМПАхСЊЏЕЧмС", (byte)12, 68);
               ZKM_STR_B[27] = NLoginCore_553.D("ЬШТьЮуаЦбЬЯЮЙѓЗЙЬклЮѠчќцмхмїяѡѬЯѫѳтѤђзѧѴтѱѽцѨзьѬ҂ѠѭѮїі҂ѳѨ҈ѝѭѫ҇ҐҒѠѪцѕѠҕѐјѕѶѪѷғѶѲҙҍҗѹҘѺѿѬѭ", (byte)12, 68);
               ZKM_STR_B[28] = NLoginCore_433.E("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 69);
               ZKM_STR_B[29] = NLoginCore_091.D("БЉъгуЎхАЯййЕгѕыэѐѕѥѢћѢЧщТѦъіЧпчѤѡлѠѭпѓѵѐкюјс", (byte)12, 68);
               ZKM_STR_B[30] = NLoginCore_241.F("ԚԿԱԾԎԱԃԗԀՅԆԐ", (byte)12, 70);
               ZKM_STR_B[31] = NLoginCore_559.D("ЬШТьЮуаЦбЬЯЮЙѓЗЙЬклЮѠчќцмхмїяѡѬЯѫѳтѤђзѧѴтѱѽцѨзьѬ҂ѠѭѮїі҂ѳѨ҈ѝѭѫ҇ҐҒёѩѤѽҀѥѮ҂ѦҜѭѫҍѽѷҘҊҤћѹңҕѬѭ", (byte)12, 68);
               ZKM_STR_B[32] = NLoginCore_324.F("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 70);
               ZKM_STR_B[33] = NLoginCore_521.B("ÏÇĈñāÌăÎí÷÷ÓñēĉċĎēģĠęĠåćàĤĈĔåýąĢğùĞīýđĳĎøČĖÿ", (byte)12, 66);
               ZKM_STR_B[34] = NLoginCore_446.B("éĎĀčÝĀÒæÏĔÕß", (byte)12, 66);
               ZKM_STR_B[35] = NLoginCore_141.E("ԴӿԂԞԷԝԖԥԤԇԗԐ", (byte)12, 69);
               ZKM_STR_B[36] = NLoginCore_232.D("ЛАяСчЭАцтЖеёјоЮюъПарњпЬЭ", (byte)12, 68);
               ZKM_STR_B[37] = NLoginCore_559.D("урѐУЍУрЫшљХЮлЙпрыЭсЮљпЬЭ", (byte)12, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.D("щЯЧдшёєіЙЪцС", (byte)12, 68);
               ZKM_STR_B[1] = NLoginCore_141.B("æúûÓÆÿđðáúčÖďòØČÜßğòĎøùğàĦøĪćêġĂ", (byte)12, 66);
               ZKM_STR_B[2] = NLoginCore_127.B("ĐÈáĐÝÔèë×ĎåĊÕĘ×ïÙïĕĕĎĄûöèĂæĨĝĠāþĊĈďĎĄĒĊăĕċùķĊĦķĞúėĹŀĕļĹŁĺĔüņĖąćľŀōěĎňĎĠĕįĖłįņŅŋęŘĪŊĳŤĭĪī", (byte)12, 66);
               ZKM_STR_B[3] = NLoginCore_433.F("ԢӻՂԱԯՆԤԿՀԉԉԂՍԥՐՋԇԞԞԫՄՅԸԔՌԔՄԹԹ՜ԻՈԩՍԷԽԼՠԤԤ՛Պ՝ՙԬԦ\u0558ԢԩեՠժՇաՀՉՑՙչթԹյի\u0558ԺՂՁպՓչավՙՄ\u0557Ր", (byte)12, 70);
               ZKM_STR_B[4] = NLoginCore_232.E("ӷԟԁԼՁԥԯՇԀԣԻԄՄՉԥԤԺՊԜԲՇԷԪԸԬՆԯԷԾԮՕՙՂԱՁ՚ԜԾԺՑԶՓԵ՜բիէԭՌ՛՟էԾԿՕդնԶԭԴԸՌիՓ", (byte)12, 69);
               ZKM_STR_B[5] = NLoginCore_384.C("ЯхсхЧєЗТЌаиЛмюнџжЯКњосмбѪќЧѦѪѡэсѮђђѮэтЮэѴѷѪйѻѿѸюѶѕ҄ѲѥѯѰлѕѵьчѻ҂чѡѦяюѝєҎѭѤѕҖҝҔѸњҎѵҠѲѣѴґѯѬѭ", (byte)12, 67);
               ZKM_STR_B[6] = NLoginCore_091.B("ÆîÐċĐôþĖÏòĉðēîĔíĝēõþÿõ÷ñđÛĠýğþþçúúäĳíĲēďĘĆıúīĮğğččĪīúĮĝĥĔĠĘģŇčĤĝ", (byte)12, 66);
               ZKM_STR_B[7] = NLoginCore_553.F("ԷԪԎԜԯՇԼԘԂՈԵԐ", (byte)12, 70);
               ZKM_STR_B[8] = NLoginCore_127.D("МєЫЎАуБѓцлћШЗаЗьиСэжѐібгщХѫѢчѩШч", (byte)12, 68);
               ZKM_STR_B[9] = NLoginCore_446.D("ЊЅЦѕоЏЦИуЧЛС", (byte)12, 68);
               ZKM_STR_B[10] = NLoginCore_453.C("тюъЩѕЕѐЖъЪФеШЬшиъТгрХЦшѓиѠиъѮЭёѢ", (byte)12, 67);
               ZKM_STR_B[11] = NLoginCore_141.F("ԴԚՂԴԤԟԺԆԟԀԵԐ", (byte)12, 70);
               ZKM_STR_B[12] = NLoginCore_530.F("ԁԜԃԱԞԶԖԥՁԴԢԿՎԿԋԎԬԼՀԞԳՒԥ\u0557ՋՆԱԩ՛ԺԞ՞բՕԛԶԹԮԞ\u0557թԽԼՇխՌԬԼծլզդլմկըխըՍՔՑ\u0557ՌՠՑ՚ղփԿևգքՒե՛Ր", (byte)12, 70);
               ZKM_STR_B[13] = NLoginCore_427.C("ыядЎёЩйюЪфмС", (byte)12, 67);
               ZKM_STR_B[14] = NLoginCore_076.D("лвмЏїірящЮѕЭьѠкьмпфёђгѢрфоэхѡчЦЭѭѫѐѢшізѕѨѕѮєѺѾщѺйкѾяќѐ҃҉҃сѡѿр҈҇ѧҋъцѨҏѸѕҙѲѥѶѝҏўѨѴѶҗѶҞҢҒѹҗѹңҍ҉ѭҫҩҙ", (byte)12, 68);
               ZKM_STR_B[15] = NLoginCore_092.C("кЛюъырљиВыћИаиьЩЪЛєтрљпѣхйТѧќЯсѠЫмъѫуёаѰхѦѱмѕѝћѾѺѾѿтћѰћ҆ѽѦќу҅ѯ҅ґѰьѪяѶѐҀҏҎѸѸѡ", (byte)12, 67);
               ZKM_STR_B[16] = NLoginCore_453.E("ԊӺՀԬԒӽԺԇԖӼԫԣԮԤԨԪԾԒԬՋԭՔԛԜ", (byte)12, 69);
               ZKM_STR_B[17] = NLoginCore_223.C(
                  "лвмЏїірящЮѕэЦмЛРКрдѠѤншшѣѩѕьѤЩокЭьбёяЭЯаѴєѮкцѬѱѳҁмѶѝфѡтпміѽљѼѪяҐҀѡѨьѭ҉ѳҗѰѕѸѮѺѽҖѱѬѬ҃ҏѺҜѡ҅҄ѾҤѨҫѨҤҜҝҴҞғҕҭҸ҈҃ѶҵѵѶѿѿҊҪҁҞҵғҖ҈Ҡҽқҭ҅ҤӈӁӑҾӒґҿӏҨүҏҲҧҬҸӍҼҟҼҬҸӠҶҿӥҬҭ",
                  (byte)12,
                  67
               );
               ZKM_STR_B[18] = NLoginCore_110.B("ñÛíÌćòþèöĂĕ÷ûÙÛĈěęēòęėěćóøçÿçĠĭĪêííĭñĵı÷õĉñĕćıĸĘúĹĪĢĤčĤŁěĨŁŁĶĻīŎ", (byte)12, 66);
               ZKM_STR_B[19] = NLoginCore_530.B("üËăéòÌÿĔÔòĒïĈěėĈěĂđßÜēħĥĂçĠĉãüĖĚĉįĚĂæĕčĤąĴúČĊĆĲĮĻėûĝăāĳģŉĿľĞĕĄĻŃ", (byte)12, 66);
               ZKM_STR_B[20] = NLoginCore_201.E("ԾԓԁՄԃԸԹՈӻԀԆԐ", (byte)12, 69);
               ZKM_STR_B[21] = NLoginCore_451.D(
                  "лвмЏїірящЮђяыЬЭўдКвУХуКСпўјѝмћѨууѢѠшџЯѥѨхёѺѼђєѭѵѼѷћѯѤ҇҃пђџѾѬфчѬъѦѳ҈҅ѵҒҙѰқёѕҊѼѾѮѳҌѠѱѡҎҧқҒѺѪҊѥѪѪҥҌғҒѬҖҟѭѰҺѵ҆ѷҁ", (byte)12, 68
               );
               ZKM_STR_B[22] = NLoginCore_324.E("ԼԺՀԤԂՀ\u0530ԚԇԪԵԿԆՌԆՃԦԋԭԪՁ\u0557ԑԹՃԌԔՓԷԩԹԻԲԔ՞\u0557ԟԸ\u0530ԢԺՉԽԥդՖՠկբՇԾՍԽՄաՙընԲՖչԵ\u0557պԽՒատյՂեֈՒժ։Ր", (byte)12, 69);
               ZKM_STR_B[23] = NLoginCore_446.C("мЫтЫвШыЩћбаЪяэьџжѝгюжѥЬЭ", (byte)12, 67);
               ZKM_STR_B[24] = NLoginCore_138.D(
                  "лвмЏїірящЮѕдџЩОєЪфѤэѤхОгШЪиоФњѠѢаѰѕуѦбЯъѦїѬгчѸҁѬьѓѠћѠіѩѻ҉Ѡы҇јѣѦѯѽъюѠѰғѣҌѶіҒ҆қѷјѻҚҡѿѯѴѲњҞҞѼҭҨҀѬҊ҅ѿҫ҇҄ґҗҔґҪѻҫґғѵҳѺҚҟґӆҀҠӃҧҖҜҹ҇҈ҞҩҞҐ҅ҬӀӅҖҏҮҗҤҰҡ",
                  (byte)12,
                  68
               );
               ZKM_STR_B[25] = NLoginCore_553.A("ÂÏæĂčíÔìÊËđðĐĔĈØĔďĕñĥąýüĆąĒâùąĜĆģįĀëĔąîö÷āöēđĔúľĹıĳĺŃÿĆĔēŇāğĕĕĥĽ", (byte)12, 65);
               ZKM_STR_B[26] = NLoginCore_004.D("ЪэєаѕУчњбФъС", (byte)12, 68);
               ZKM_STR_B[27] = NLoginCore_471.A("êæàĊìāîäïêíì×đÕ×êøùìĞąĚĄúăúĕčğĪíĩıĀĢĐõĥĲĀįĻĄĦõĊĪŀĞīĬĕĔŀıĦņěīĩŅŎŐĞĨĄēĞœĎĖēĴħŒěņĖđĨŎŚńĴŐŁŔĹœŊĺņŞŁş", (byte)12, 65);
               ZKM_STR_B[28] = NLoginCore_076.D("МЎпЯрѓЯДѓгиС", (byte)12, 68);
               ZKM_STR_B[29] = NLoginCore_201.B("ÏÇĈñāÌăÎí÷÷ÓñēĉċĎēģĠęĠåćàĤĈĔåýąĢđĬİĠþĉĞđĪĩĤĻēĸĖĵĩŁľĔđĳĊċ", (byte)12, 66);
               ZKM_STR_B[30] = NLoginCore_027.F("ՀԖԌԖԗՄԢԂԡՉԾԡԭԖԇ\u0530ԤԭՋԔՆԮԛԜ", (byte)12, 70);
               ZKM_STR_B[31] = NLoginCore_127.A("êæàĊìāîäïêíì×đÕ×êøùìĞąĚĄúăúĕčğĪíĩıĀĢĐõĥĲĀįĻĄĦõĊĪŀĞīĬĕĔŀıĦņěīĩŅŎŐďħĢĻľģĬŀĤŚĬĻńŚĮŝĒőŁŞĢĭŜğĵŔĹœŝķīł", (byte)12, 65);
               ZKM_STR_B[32] = NLoginCore_446.A("åòëÌõýÕčÎÙÑß", (byte)12, 65);
               ZKM_STR_B[33] = NLoginCore_127.F("ԀӸԹԢԲӽԴӿԞԨԨԄԢՄԺԼԿՄՔՑՊՑԖԸԑՕԹՅԖԮԶՓ\u0530Խ՚ՌՂԾԦզ՚գԵԦՉՏ՜ՀՂԩԩՍզմԻԼ", (byte)12, 70);
               ZKM_STR_B[34] = NLoginCore_433.E("ӸԁԴԠԏԹԿԚՅՇԹԐ", (byte)12, 69);
               ZKM_STR_B[35] = NLoginCore_427.C("КЌВЋЈдхфцФшиѕПЮсѓѠѓлђпЬЭ", (byte)12, 67);
               ZKM_STR_B[36] = NLoginCore_397.B("ÙÎčßąëÎĄĀÔôąåĚïğòýăëĤĎÿĥü÷øÿôĕĥġ", (byte)12, 66);
               ZKM_STR_B[37] = NLoginCore_451.B("āþĎáËáþéĆėâîóØÿĠØÿċęÿģêë", (byte)12, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.A("ÈĈÞĔĕßò×ďÖĄąÒþýóÛāĕČēģêë", (byte)12, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_232.E("ԐԻԼԿԡӽ\u0530ӾՀԉԪՊՎՎԸԽԞՉԡՎԝՔԛԜ", (byte)12, 69);
         }
      }
   }

   public NLoginCore_462(NLoginCore_466 var1) {
      super(var1);
      this.b();
   }
}
