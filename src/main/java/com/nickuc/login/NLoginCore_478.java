package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_478 {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h,
   i,
   j,
   k,
   l,
   m,
   n,
   o,
   p;

   private final Class<?> a;
   private final String l;
   private final boolean m;
   private final Class<?>[] a;
   private boolean n;
   private static String[] a = new String[NLoginCore_478.ci];
   private static String[] b = new String[NLoginCore_478.cj];
   private static long c;
   private static int a = (1048576 >>> 84 | 1048576 << -84) & -1;
   private static int b = (0 >>> 116 | 0 << -116) & -1;
   private static int c = (0 >>> 116 | 0 << ~116 + 1) & -1;
   private static long d = Long.reverse(140783839118296545L);
   private static long e = Long.reverse(1873497444986126336L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int g = (-1 >>> 13 | -1 << -13) & -1;
   private static long h = Long.reverse(2014281284104422881L);
   private static int i = 16384 >>> 45 | 16384 << ~45 + 1;
   private static int j = -1 >>> 113 | -1 << ~113 + 1;
   private static long k = Long.reverse(2014281284104422881L);
   private static int l = (1536 >>> 9 | 1536 << -9) & -1;
   private static long m = Long.reverse(140783839118296545L);
   private static long n = Long.reverse(1873497444986126336L);
   private static int o = Integer.reverse(536870912);
   private static int p = (-1 >>> 7 | -1 << -7) & -1;
   private static long q = Long.reverse(2014281284104422881L);
   private static int r = Integer.reverse(-1610612736);
   private static long s = Long.reverse(140783839118296545L);
   private static long t = Long.reverse(1873497444986126336L);
   private static int u = Integer.reverse(1610612736);
   private static int v = Integer.reverse(-1);
   private static long w = Long.reverse(2014281284104422881L);
   private static int x = Integer.reverse(0);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(0);
   private static int aa = (0 >>> 54 | 0 << -54) & -1;
   private static int ab = 3584 >>> 137 | 3584 << -137;
   private static long ac = Long.reverse(140783839118296545L);
   private static long ad = Long.reverse(1873497444986126336L);
   private static int ae = Integer.reverse(268435456);
   private static long af = Long.reverse(2014281284104422881L);
   private static int ag = (288 >>> 165 | 288 << -165) & -1;
   private static long ah = Long.reverse(140783839118296545L);
   private static long ai = Long.reverse(1873497444986126336L);
   private static int aj = (0 >>> 157 | 0 << -157) & -1;
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private static int al = (0 >>> 218 | 0 << ~218 + 1) & -1;
   private static int am = Integer.reverse(1342177280);
   private static long an = Long.reverse(140783839118296545L);
   private static long ao = Long.reverse(1873497444986126336L);
   private static int ap = Integer.reverse(0);
   private static int aq = (1048576 >>> 51 | 1048576 << -51) & -1;
   private static int ar = Integer.reverse(0);
   private static int as = (268435456 >>> 252 | 268435456 << ~252 + 1) & -1;
   private static int at = (5767168 >>> 211 | 5767168 << -211) & -1;
   private static long au = Long.reverse(140783839118296545L);
   private static long av = Long.reverse(1873497444986126336L);
   private static int aw = (0 >>> 1 | 0 << -1) & -1;
   private static int ax = Integer.reverse(1073741824);
   private static int ay = Integer.reverse(0);
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int ba = Integer.reverse(-1073741824);
   private static int bb = Integer.reverse(0);
   private static int bc = Integer.reverse(Integer.MIN_VALUE);
   private static int bd = Integer.reverse(1073741824);
   private static int be = Integer.reverse(536870912);
   private static int bf = 0 >>> 14 | 0 << ~14 + 1;
   private static int bg = ('耀' >>> '/' | 32768 << -47) & -1;
   private static int bh = Integer.reverse(1073741824);
   private static int bi = 6 >>> 65 | 6 << ~65 + 1;
   private static int bj = Integer.reverse(805306368);
   private static int bk = -1 >>> 165 | -1 << -165;
   private static long bl = Long.reverse(2014281284104422881L);
   private static int bm = 0 >>> 163 | 0 << -163;
   private static int bn = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = Integer.reverse(0);
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int bq = Integer.reverse(0);
   private static int br = Integer.reverse(134217728);
   private static int bs = (0 >>> 68 | 0 << -68) & -1;
   private static int bt = (4 >>> 66 | 4 << ~66 + 1) & -1;
   private static int bu = '耀' >>> 142 | 32768 << ~142 + 1;
   private static int bv = (12 >>> 130 | 12 << ~130 + 1) & -1;
   private static int bw = 128 >>> 37 | 128 << -37;
   private static int bx = Integer.reverse(-1610612736);
   private static int by = 196608 >>> 111 | 196608 << ~111 + 1;
   private static int bz = (-2147483645 >>> 127 | -2147483645 << -127) & -1;
   private static int ca = Integer.reverse(268435456);
   private static int cb = Integer.reverse(-1879048192);
   private static int cc = Integer.reverse(1342177280);
   private static int cd = 2816 >>> 136 | 2816 << -136;
   private static int ce = 12582912 >>> 244 | 12582912 << ~244 + 1;
   private static int cf = 436207616 >>> 217 | 436207616 << ~217 + 1;
   private static int cg = Integer.reverse(1879048192);
   private static int ch = Integer.reverse(-268435456);
   private static int ci = (136 >>> 34 | 136 << -34) & -1;
   private static int cj = 68 >>> 65 | 68 << -65;
   private static int ck = 13312 >>> 202 | 13312 << ~202 + 1;
   private static int cl = Integer.reverse(-1);
   private static long cm = Long.reverse(2014281284104422881L);
   private static int cn = (0 >>> 123 | 0 << -123) & -1;
   private static int co = Integer.reverse(Integer.MIN_VALUE);
   private static int cp = (2048 >>> 139 | 2048 << ~139 + 1) & -1;
   private static int cq = (0 >>> 106 | 0 << -106) & -1;
   private static int cr = Integer.reverse(1879048192);
   private static long cs = Long.reverse(140783839118296545L);
   private static long ct = Long.reverse(1873497444986126336L);
   private static int cu = (268435456 >>> 60 | 268435456 << ~60 + 1) & -1;
   private static int cv = Integer.reverse(Integer.MIN_VALUE);
   private static int cw = Integer.reverse(Integer.MIN_VALUE);
   private static int cx = (0 >>> 192 | 0 << ~192 + 1) & -1;
   private static int cy = 7680 >>> 169 | 7680 << -169;
   private static long cz = Long.reverse(140783839118296545L);
   private static long da = Long.reverse(1873497444986126336L);
   private static int db = Integer.reverse(1073741824);
   private static int dc = (0 >>> 254 | 0 << -254) & -1;
   private static int dd = Integer.reverse(536870912);
   private static int de = 0 >>> 65 | 0 << ~65 + 1;
   private static int df = 33554432 >>> 121 | 33554432 << -121;
   private static int dg = 1024 >>> 169 | 1024 << -169;
   private static int dh = Integer.reverse(-1073741824);
   private static int di = 16 >>> 160 | 16 << ~160 + 1;
   private static int dj = Integer.reverse(-1);
   private static long dk = Long.reverse(2014281284104422881L);
   private static int dl = Integer.reverse(-1073741824);
   private static int dm = (0 >>> 187 | 0 << -187) & -1;
   private static int dn = Integer.reverse(Integer.MIN_VALUE);
   private static int var_do = Integer.reverse(0);
   private static int dp = Integer.reverse(-2013265920);
   private static long dq = Long.reverse(2014281284104422881L);
   private static int dr = Integer.reverse(536870912);
   private static int ds = 0 >>> 213 | 0 << ~213 + 1;
   private static int dt = Integer.reverse(Integer.MIN_VALUE);
   private static int du = Integer.reverse(0);
   private static int dv = Integer.reverse(1207959552);
   private static long dw = Long.reverse(2014281284104422881L);
   private static int dx = 163840 >>> 207 | 163840 << -207;
   private static int dy = Integer.reverse(0);
   private static int dz = Integer.reverse(Integer.MIN_VALUE);
   private static int ea = Integer.reverse(0);
   private static int eb = Integer.reverse(-939524096);
   private static int ec = Integer.reverse(-1);
   private static long ed = Long.reverse(2014281284104422881L);
   private static int ee = Integer.reverse(1610612736);
   private static int ef = Integer.reverse(0);
   private static int eg = Integer.reverse(-1073741824);
   private static int eh = (0 >>> 211 | 0 << -211) & -1;
   private static int ei = Integer.reverse(Integer.MIN_VALUE);
   private static int ej = Integer.reverse(1073741824);
   private static int ek = (10 >>> 159 | 10 << -159) & -1;
   private static long el = Long.reverse(140783839118296545L);
   private static long em = Long.reverse(1873497444986126336L);
   private static int en = Integer.reverse(-536870912);
   private static int eo = Integer.reverse(-1476395008);
   private static long ep = Long.reverse(2014281284104422881L);
   private static int eq = Integer.reverse(Integer.MIN_VALUE);
   private static int er = Integer.reverse(0);
   private static int es = Integer.reverse(1744830464);
   private static long et = Long.reverse(140783839118296545L);
   private static long eu = Long.reverse(1873497444986126336L);
   private static int ev = (512 >>> 102 | 512 << -102) & -1;
   private static int ew = Integer.reverse(-402653184);
   private static long ex = Long.reverse(140783839118296545L);
   private static long ey = Long.reverse(1873497444986126336L);
   private static int ez = Integer.reverse(Integer.MIN_VALUE);
   private static int fa = Integer.reverse(0);
   private static int fb = Integer.reverse(402653184);
   private static long fc = Long.reverse(140783839118296545L);
   private static long fd = Long.reverse(1873497444986126336L);
   private static int fe = 2304 >>> 200 | 2304 << ~200 + 1;
   private static int ff = Integer.reverse(0);
   private static int fg = Integer.reverse(1073741824);
   private static int fh = 0 >>> 55 | 0 << -55;
   private static int fi = 4194304 >>> 86 | 4194304 << ~86 + 1;
   private static int fj = 419430400 >>> 56 | 419430400 << -56;
   private static long fk = Long.reverse(140783839118296545L);
   private static long fl = Long.reverse(1873497444986126336L);
   private static int fm = Integer.reverse(1342177280);
   private static int fn = Integer.reverse(0);
   private static int fo = (65536 >>> 47 | 65536 << ~47 + 1) & -1;
   private static int fp = 0 >>> 133 | 0 << -133;
   private static int fq = Integer.reverse(Integer.MIN_VALUE);
   private static int fr = 1703936 >>> 48 | 1703936 << ~48 + 1;
   private static long fs = Long.reverse(140783839118296545L);
   private static long ft = Long.reverse(1873497444986126336L);
   private static int fu = Integer.reverse(-805306368);
   private static int fv = Integer.reverse(-671088640);
   private static long fw = Long.reverse(140783839118296545L);
   private static long fx = Long.reverse(1873497444986126336L);
   private static int fy = Integer.reverse(Integer.MIN_VALUE);
   private static int fz = Integer.reverse(0);
   private static int ga = (224 >>> 35 | 224 << -35) & -1;
   private static long gb = Long.reverse(140783839118296545L);
   private static long gc = Long.reverse(1873497444986126336L);
   private static int gd = Integer.reverse(805306368);
   private static int ge = (1900544 >>> 48 | 1900544 << ~48 + 1) & -1;
   private static int gf = -1 >>> 122 | -1 << -122;
   private static long gg = Long.reverse(2014281284104422881L);
   private static int gh = Integer.reverse(Integer.MIN_VALUE);
   private static int gi = (0 >>> 7 | 0 << ~7 + 1) & -1;
   private static int gj = Integer.reverse(2013265920);
   private static long gk = Long.reverse(2014281284104422881L);
   private static int gl = Integer.reverse(-1342177280);
   private static int gm = Integer.reverse(-134217728);
   private static int gn = -1 >>> 178 | -1 << -178;
   private static long go = Long.reverse(2014281284104422881L);
   private static int gp = Integer.reverse(Integer.MIN_VALUE);
   private static int gq = Integer.reverse(0);
   private static int gr = Integer.reverse(67108864);
   private static long gs = Long.reverse(140783839118296545L);
   private static long gt = Long.reverse(1873497444986126336L);
   private static int gu = Integer.reverse(1879048192);
   private static int gv = Integer.reverse(0);
   private static int gw = 128 >>> 231 | 128 << -231;
   private static int gx = 0 >>> 114 | 0 << -114;
   private static int gy = 268435458 >>> 60 | 268435458 << ~60 + 1;
   private static long gz = Long.reverse(140783839118296545L);
   private static long ha = Long.reverse(1873497444986126336L);
   private static int hb = (31457280 >>> 21 | 31457280 << -21) & -1;
   private static int hc = Integer.reverse(0);
   private static int hd = Integer.reverse(Integer.MIN_VALUE);
   private static int he = Integer.reverse(0);

   public static void a(nLoginBukkit var0, boolean var1) {
      NLoginType_008 var2 = var0.a();
      NLoginCore_478[] var3 = values();
      int var4 = var3.length;

      for (int var5 = z; var5 < var4; var5++) {
         NLoginCore_478 var6 = var3[var5];
         if (var6.m) {
            Object[] var7 = new Object[var6.a.length];

            for (int var8 = aa; var8 < var7.length; var8++) {
               Class var9 = var6.a[var8];
               if (NLoginCore_187.class.isAssignableFrom(var9)) {
                  var7[var8] = var2.a();
               } else if (NLoginInterface_030.class.isAssignableFrom(var9)) {
                  var7[var8] = var2.b();
               } else if (NLoginType_005.class.isAssignableFrom(var9)) {
                  var7[var8] = var2.b();
               } else if (NLoginType_008.class.isAssignableFrom(var9)) {
                  var7[var8] = var2;
               } else if (nLoginBukkit.class.isAssignableFrom(var9)) {
                  var7[var8] = var0;
               } else {
                  if (!NLoginCore_209.class.isAssignableFrom(var9)) {
                     throw new UnsupportedOperationException(a(ab, ac ^ ad) + var6 + a(ae, af) + var9);
                  }

                  var7[var8] = var2.b();
               }
            }

            var6.a(var0, var7);
         }
      }

      NLoginCore_478 var10000 = NLoginCore_298.a(a(ag, ah ^ ai)) ? e : d;
      Object[] var10002 = new Object[ak];
      var10002[al] = var0;
      var10000.a(var0, var10002);
      if (NLoginCore_298.a(a(am, an ^ ao))) {
         var10000 = k;
         var10002 = new Object[aq];
         var10002[ar] = var2;
         var10002[as] = var2.b();
         var10000.a(var0, var10002);
      } else if (NLoginCore_298.a(a(at, au ^ av))) {
         var10000 = j;
         var10002 = new Object[ax];
         var10002[ay] = var0;
         var10002[az] = var2.b();
         var10000.a(var0, var10002);
      }

      if (!NLoginCore_157.p) {
         var10000 = g;
         var10002 = new Object[ba];
         var10002[bb] = var0;
         var10002[bc] = var2.b();
         var10002[bd] = var1;
         var10000.a(var0, var10002);
      }

      var10000 = c;
      var10002 = new Object[be];
      var10002[bf] = var0;
      var10002[bg] = var2.a();
      var10002[bh] = var2.b();
      var10002[bi] = var1;
      var10000.a(var0, var10002);
      if (!var1 && NLoginCore_298.a(a(bj & bk, bl))) {
         var10000 = f;
         var10002 = new Object[bn];
         var10002[bo] = var0.a();
         var10000.a(var0, var10002);
      }

      var10000 = NLoginCore_290.r ? p : o;
      var10002 = new Object[bp];
      var10002[bq] = var0;
      var10000.a(var0, var10002);
   }

   public void a(nLoginBukkit var1, Object... var2) {
      NLoginInterface_013 var3 = this.a(var2);
      if (var3 != null) {
         var1.a(var3, new NLoginInterface_013[x]);
         this.n = (boolean)y;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= -2352737288709086179L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(62 + 6),
                     (byte)(25 + 44),
                     83,
                     (byte)(36 + 11),
                     (byte)(49 + 18),
                     (byte)(7 + 59),
                     (byte)(65 + 2),
                     (byte)(27 + 20),
                     (byte)(3 + 77),
                     (byte)(25 + 50),
                     67,
                     (byte)(70 + 13),
                     (byte)(8 + 45),
                     (byte)(36 + 44),
                     (byte)(55 + 42),
                     (byte)(66 + 34),
                     (byte)(14 + 86),
                     (byte)(104 + 1),
                     (byte)(46 + 64),
                     (byte)(63 + 40)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡩ\u085dࡺࡱ\u086eࢃࡱࡰࢇࡨࢇࢊࡼࢇࢂ", (byte)80, 67));
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

   private static void b() {
      c = -8673718443652665472L;
      long var0 = c ^ -2352737288709086179L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(5 + 63),
               (byte)(51 + 18),
               (byte)(21 + 62),
               (byte)(22 + 25),
               (byte)(20 + 47),
               (byte)(60 + 6),
               (byte)(4 + 63),
               (byte)(6 + 41),
               (byte)(16 + 64),
               (byte)(24 + 51),
               67,
               (byte)(5 + 78),
               (byte)(7 + 46),
               (byte)(58 + 22),
               (byte)(67 + 30),
               (byte)(68 + 32),
               (byte)(99 + 1),
               (byte)(54 + 51),
               110,
               (byte)(12 + 91)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_427.D("ӸԁӟӵԄӵӱԄӷӵӕԂӌӦԏӨӻӃӈӧӠӠԒӭӖөӤԃԆӷԇԗӫӝӛӰӯӭԄӻӺԛԖӿӾԮԞԈԉԁԳӾԃӽӺӻ", (byte)70, 68);
               b[1] = NLoginCore_387.E("ջՎՅՍՈիՔճղտՑՊ", (byte)70, 69);
               b[2] = NLoginCore_183.D("ӿӬӢӚӟҿӎӀӨӄӚӏ", (byte)70, 68);
               b[3] = NLoginCore_173.E("էԶՔԻ՜ՍհժկոՄպՁ՟տ֊օչփշՏվՕՖ", (byte)70, 69);
               b[4] = NLoginCore_384.E("եՔէ\u0558մՕԻԽցլԼհԽջդաց֊ժՙ\u0557Նփբ։մտ֒բև֊֘֕֓՛֜՛֗մբ֒կ֤՝ռֆ֚ՠռե֭ծք֮յն", (byte)70, 69);
               b[5] = NLoginCore_433.B("ŎŀŏŴŜƃŊśŜƄŽņţŐŢŽƍŶƒŗŊűƗƉŘƍžƙƒűƣƏƄƠſƆŤŸƘſŨūŸƟƅƊưżŰƆŲƊƶƁžſ", (byte)70, 66);
               b[6] = NLoginCore_446.A("ŌŖŅŐŨųŶťŴśƈœ", (byte)70, 65);
               b[7] = NLoginCore_141.E("յԮՊԷ՜ԾԽցդՑդկ՛ֈըւսոՊեա֑\u0590թձ֒կւ֔հ\u0558ՙնՖ֞։\u058bլ֠֞լր՟֡պէե֫ս֟\u058b֯ոզկփկխ֞րֈַւ֭", (byte)70, 69);
               b[8] = NLoginCore_138.C("ԀӓӊӒӍӰәӸӷԄӖӏ", (byte)70, 67);
               b[9] = NLoginCore_201.E("եԹ՚ճՉՌՔվՑճՍնեճ՞վֆՕւռ՝քւ֓\u0590ՠ\u0590եՕոՔփզթ֍կ֝հր՚֠հ՝֠ֆ֚֞պտ֟\u058bչ\u058bպօ֓֠֯կձ\u0590ְֳ֤", (byte)70, 69);
               b[10] = NLoginCore_427.C("ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԉԇԘԕӥԕӪӚӽәԈӫӮԒӴԢӵԅӟԥӵӢԅӬӬӨԄӦԬӨԤԔӧԀԆԖӸӵԸԭԑԭԗԲӼӿԴԡԺԖԱԚԹԠԃՌՌԧՄԮԍՂՑԥՓԚԛ", (byte)70, 67);
               b[11] = NLoginCore_453.B("ŝŭŷƅņşƇŽžƉũŏũƃũŮţƐƃŷƌŸŸŔŎƔƑŕƛŮƟŮśŻŹƓşƢƧƌƦơƅťůƈūƍŮŮƖƵŷƇƙƬŮƭźŽƕƚƝƋſƥưƥǉƹƖƋǁǃƍƓ", (byte)70, 66);
               b[12] = NLoginCore_387.B(
                  "ŮłţżŒŕŝƇŚżŖſŮżŧƇƏŞƋƅŦƐƇŹƆƘŔŵƑŹƋůƢƢżƇşŤƣƅƀťƂŬƧƠƉƞƫƍƞŭƹŴƯƬƲƇƴƌƱưƿƖźƎƮƟơƘǆǋǆǈƊƹƪƾƨƴƩǕƐǓǇƪƮǋƫƷƜǘƛƽǞǖǣƭǣǧǉǆǀǌǣǚǨǬǏƼǱǁǓƳǮǑǂǑƾƿ", (byte)70, 66
               );
               b[13] = NLoginCore_559.B("ŖŁůżŸƇňŇƁŹźŹŢƋŉŨŽƋƗƔŲűŞş", (byte)70, 66);
               b[14] = NLoginCore_127.B("ƅŹŮƁŁŻŞżţƋŞşŬŃŎƂƅƏşŰƀƐŭƖƎŖƐűƈŠƁų", (byte)70, 66);
               b[15] = NLoginCore_092.E("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈՎ\u0590ռտֈՋւ֑֓ժշ", (byte)70, 69);
               b[16] = NLoginCore_223.C("ӑӗԁԀԅӮӳԀӢӔӅҽӖӵԌԐӫԊӍӪԍԂӠӓԒәӱԊԍԞӸԍ", (byte)70, 67);
               b[17] = NLoginCore_110.D("ӡҽӿӫԀӟҼӦӨӹӪӆӃӦӾӅӯԍӢԇԓӝӫԁӭԏӮӗӬӛӭԑԕӡԓԗԛԝԝԛӧԖӡӯ", (byte)70, 68);
               b[18] = NLoginCore_027.D("ӏӬҿӞӵӳӓӗӚԊҼӝӗԄӞӭԅԎӚԍӾӨӥӭԊӖӴӑӺԈӼԌԙԁԜӠԁӞԤәԗԃԤӯ", (byte)70, 68);
               b[19] = NLoginCore_173.B("żżűŇſƊŒũŦŬżżƆŧŚŅũƋƉţƈŖƐƘŗŜƆŰŜƏƏƐ", (byte)70, 66);
               b[20] = NLoginCore_127.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍԖԊԀӢԒԕԌԚӬӱӬ", (byte)70, 68);
               b[21] = NLoginCore_384.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞŰƛųŲƑƝťųſƗƍƢƯƐũƟƤūűƁƵƫƎƮƆŸŴƱƬƭƌźƲƳŸƒźƳƤƗƧǋƼƓ", (byte)70, 65);
               b[22] = NLoginCore_223.C("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӎӲӰӮԑӵԇӫԇԊӱ", (byte)70, 67);
               b[23] = NLoginCore_241.E("զհՍոՇԻծնն՞տպ՝բՄ\u0558վդՕ֎ՋՐ֑֒ՌՊօնգնֆՕռհ\u0557ֈ\u0558֚՟նգ՚֍֑ր֛֥֨ռ֧֊֬թ֣֍֊֤֞֝տֈյւ֧֒֗յֲ֛֭֓֬֏պֻ֊", (byte)70, 69);
               b[24] = NLoginCore_141.C("ӽӰӘӘӵӏӮӟӗӺԇӜԁӣӡӹӚӎӨԐԏӤӞӐӨԘӗԐԙԗԈԗӬԠӫԋԒԍӽԠԈԛԘӯ", (byte)70, 67);
               b[25] = NLoginCore_397.F("ոիՓՓհՊթ՚Ւյւ\u0557ռ՞՜մՕՉգ\u058b֊առրՓ։՝խ֎ծ\u058bի֎\u058bսթ֛մ՜՜ցկչժ", (byte)70, 70);
               b[26] = NLoginCore_397.B("żżűŇſƊŒũŦŬžƉŭśżƎƅťţſƑŋŌŔƗŕƏƐŘŘŲŲ", (byte)70, 66);
               b[27] = NLoginCore_138.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔƗƘƃƚŗŰƠūžžƣƃƦſƝƑƈŪūƟżƅŨƙơƨƍƉƦƌƈƈƤųŸųƴƑƶŽǂƲƱ", (byte)70, 65);
               b[28] = NLoginCore_553.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӋӪӕӥӒԈӍӨԐӽԖ", (byte)70, 68);
               b[29] = NLoginCore_091.B("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞźűŴƃſſŦƃƜƋƯŸſƭƂƌŮƳƑƆƑƸŵƕƌƹƹƇƊƹƬſ", (byte)70, 66);
               b[30] = NLoginCore_004.C("ӲӗӗһӍӣәӐӺӡӘԌӖԎӧӗӫӣӧӬӎӕӱԓӏԉӕԄӱӷӘӬӞԠԢӼԔԚӡԧԜӾӾӯ", (byte)70, 67);
               b[31] = NLoginCore_127.D("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕӫԁӒӓӢӒԙӱӳӺԋԏԐәӴӰԟԁԁӨԓԋӢӶԋԮӭԙԝԝԊӿԥӭ\u0530ԩԖԛԈԚԒԺ", (byte)70, 68);
               b[32] = NLoginCore_521.E("՜Ըպզջ՚Էագմծ՞նրն\u058bճխջռ։ծ֒՜վսկ֖էշ\u058c֎", (byte)70, 69);
               b[33] = NLoginCore_387.D("ӡҽӿӫԀӟҼӦӨӹӫӜԀӉԋԃӋӻԌԈӦӤӾӉӢӐӻӼӒԝӖӿԝӸԣԂӹԍӦӢԈԝԨӯ", (byte)70, 68);
               break;
            case 1:
               b[0] = NLoginCore_173.E("ճռ՚հտհլտղհՐսՇա֊գնԾՃբ՛՛֍ըՑդ՟վցղւ֒զ\u0558Ֆիժըտնյ֖֏աօ֡֙։ճբ֮փ֗ոյն", (byte)70, 69);
               b[1] = NLoginCore_091.B("ŔšŷƁųŜŔłƌŢƌœ", (byte)70, 66);
               b[2] = NLoginCore_004.A("řľŮřŻŸƇŚŦŻżœ", (byte)70, 65);
               b[3] = NLoginCore_173.B("ŰĿŝńťŖŹųŸƁńŗŭſŢşŽƇųūƉűŞş", (byte)70, 66);
               b[4] = NLoginCore_173.B("ŮŝŰšŽŞńņƊŵŅŹņƄŭŪƊƓųŢŠŏƌūƒŽƈƛūƐƓơƞƜŤƥŤƠŽūƛŸƭůżƪƂūƃƈƑƅųƨƊƤƖźƈƒǁƵƐƔ", (byte)70, 66);
               b[5] = NLoginCore_575.B("ŎŀŏŴŜƃŊśŜƄŽņţŐŢŽƍŶƒŗŊűƗƉŘƍžƙƒűƣƏƄƠſƆŤŸƘſŨūŸƦưƲƬƜſƒųƑƏƮƔƲżųƸƕƹƋƒƐ", (byte)70, 66);
               b[6] = NLoginCore_553.A("ŸƄŻşżŉŖŽƂŕƀœ", (byte)70, 65);
               b[7] = NLoginCore_433.A("žķœŀťŇņƊŭŚŭŸŤƑűƋƆƁœŮŪƚƙŲźƛŸƋƝŹšŢſşƧƒƔŵƩƧŵƉŨƪƃŰŮƴƆƨƔƸƁűƈźƝƐƎƇŹƕžǀ", (byte)70, 65);
               b[8] = NLoginCore_553.E("՜Ֆո՞ՎժՊշհ՛ՍՊ", (byte)70, 69);
               b[9] = NLoginCore_387.D("ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԉԇԘԕӥԕӪӚӽәԈӫӮԒӴԢӵԅӟԥӵӢԥԋԣԟӿԄԤԐӾԐԀԢԴԪԪԶԑԨԸӸԮԜԊӺԵԂՀԼӽԾԪՈԏ", (byte)70, 68);
               b[10] = NLoginCore_027.F(
                  "եԹ՚ճՉՌՔվՑճՍնեճ՞վֆՕւռ՝քւ֓\u0590ՠ\u0590եՕոՔփզթ֍կ֝հր՚֠հ՝րէէգտա֧գ֟֏բջց֑ճհֳ֨\u058c֭֨֒շպִִֵ֑֥֥֯֜֬֕֜֔փ֥ׄ\u05c8֖֘֬֨֕", (byte)70, 70
               );
               b[11] = NLoginCore_387.D("әөӳԁӂӛԃӹӺԅӥӋӥӿӥӪӟԌӿӳԈӴӴӐӊԐԍӑԗӪԛӪӗӷӵԏӛԞԣԈԢԝԁӡӫԄӧԉӪӪԒԱӳԃԕԨӪԩӶӹԑԖԙԇԗԲԡԃԀӽԸӹԳԠԉԏ", (byte)70, 68);
               b[12] = NLoginCore_521.D(
                  "ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԌԃӵԂԔӐӱԍӵԇӫԞԞӸԃӛӠԟԁӼӡӾӨԣԜԅԚԧԉԚөԵӰԫԨԮԃ\u0530ԈԭԬԻԒӶԊԪԛԝԔՂՇՂՄԆԵԦԺԤ\u0530ԥՑԌՏՃԦԪՇԧԳԘՔԗԹ՚Ւ՟ԩ՟գՅՂԼՈ՟ՖէԣՇՁդ՝Վ\u0530ԱՏՒճԺԻ",
                  (byte)70,
                  68
               );
               b[13] = NLoginCore_092.A("ŖŁůżŸƇňŇƁŹŸŹũźūœƇŝžŸŧŘũŶƇŏƙƈŭƜƂƞ", (byte)70, 65);
               b[14] = NLoginCore_138.A("ƅŹŮƁŁŻŞżţƋŞşŬŃŎƂƅƏşŰƀƒŶƏƕƑƙŹƚźŝƏ", (byte)70, 65);
               b[15] = NLoginCore_173.C("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӌӴӕԙӲӖӳԊԍӘԈ", (byte)70, 67);
               b[16] = NLoginCore_451.C("ӑӗԁԀԅӮӳԀӢӔӅҽӖӵԌԐӫԊӍӪԍӴԔӭӸԖԘӚӽԇӰӛ", (byte)70, 67);
               b[17] = NLoginCore_453.C("ӡҽӿӫԀӟҼӦӨӹӪӆӃӦӾӅӯԍӢԇԓӝӫԁӭԏӮӗӬӛӭԑԜԁӸӱԀӜӘӻԞԚӥӯ", (byte)70, 67);
               b[18] = NLoginCore_521.F("ՊէԺՙհծՎՒՕօԷ\u0558Ւտՙըր։ՕֈչգՠըօՑկՌյփշև֕֓ն֙թճի\u0558հ֙֍֒եֈ֢\u058b֩֬ևքի֮յն", (byte)70, 70);
               b[19] = NLoginCore_241.B("żżűŇſƊŒũŦŬżżƆŧŚŅũƋƉţƈŘƓŖƕŲůŝƀœƞŴƥƆŮřšžŽƀƈſƤų", (byte)70, 66);
               b[20] = NLoginCore_453.F("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈՆչ֊կցևՕրեՑթ", (byte)70, 70);
               b[21] = NLoginCore_076.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞŰƛųŲƑƝťųſƗƍƢƯƐũƟƤūűƁƵƫƎƮƆŸŴƱƬƭƌźǅƓǆƿƖƒǊƦƥƅƢƓ", (byte)70, 65);
               b[22] = NLoginCore_433.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӎԌԏӦӸӧԔӯӲӻӞ", (byte)70, 68);
               b[23] = NLoginCore_553.C("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕԖԗӑӏԊӻӨӻԋӚԁӵӜԍӝԟӤӻӨӟԒԖԅԠԪԭԁԬԏԱӮԨԒԏԣԩԢԄԍӺԇԗӺӺԖӺՁԟՄԿՉԁԅԏ", (byte)70, 67);
               b[24] = NLoginCore_521.C("ӽӰӘӘӵӏӮӟӗӺԇӜԁӣӡӹӚӎӨԐԏӤӞӐӨԘӗԐԙԗԈԗӘԑԚԏӟԞӻԧӵԛԨԜӫӷӹԠԩԯԠӫԔԳӺӻ", (byte)70, 67);
               b[25] = NLoginCore_530.B("ƁŴŜŜŹœŲţśžƋŠƅŧťŽŞŒŬƔƓŪƅƉŜƒŦŶƗŷƔŴźƂƗƓşƢƀŨƫƍŸŽƮƈŰƜŬƩƒƵƯƧžſ", (byte)70, 66);
               b[26] = NLoginCore_127.F("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈ\u0590ֆ՟ջփրևը֏գխ", (byte)70, 70);
               b[27] = NLoginCore_127.F("զհՍոՇԻծնն՞տպ՝բՄ\u0558վդՕ֎Ջ֎֏պ֑Վէ֗բյյ֚պ֝ն֔ֈտաբ֖ճռ՟\u0590֘֟քր֝փտտֈ֜ջ֊ְ֞֒ւկֺ֚", (byte)70, 70);
               b[28] = NLoginCore_223.B("żżűŇſƊŒũŦŬžƉŭśżƎƅťţſƑƗƐťűŶƕƍŒŮŵƛ", (byte)70, 66);
               b[29] = NLoginCore_183.E("զհՍոՇԻծնն՞տպ՝բՄ\u0558վդՕ֎ՋՐ֑֒ՌՊօնգնֆՕձըիպնն՝պ֓ւ֦կն֤չփե֪ֈսֈծ֮վք֥քօ֦֑֫։ֲִֶ֓ջչ\u058cֵ֑֥֕֊", (byte)70, 69);
               b[30] = NLoginCore_521.F("խՒՒԶՈ՞ՔՋյ՜ՓևՑ։բՒզ՞բէՉՐլ֎ՊքՐտլղՓէմխշ֍՛ճ\u0557խհսՠժ", (byte)70, 70);
               b[31] = NLoginCore_397.C("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕӫԁӒӓӢӒԙӱӳӺԋԏԐәӴӰԟԁԁӨԓԋӢӶԋԮӭԙԝԝԊԀԌԄԲԨԧԋԔӼԼԋ", (byte)70, 67);
               b[32] = NLoginCore_173.D("ӡҽӿӫԀӟҼӦӨӹӳӣӻԅӻԐӸӲԀԁԎӱӲӫӤөԌӪӽӔӺӨӯӚԁԃӻԦԃԒӰԝԜӯ", (byte)70, 68);
               b[33] = NLoginCore_004.D("ӡҽӿӫԀӟҼӦӨӹӫӜԀӉԋԃӋӻԌԈӦӤӾӉӢӐӻӼӒԝӖӿԜԝӰӴԟԤӸԥԓӵӨӣӪԥԝӥӼԡԜԳԢԣӺӻ", (byte)70, 68);
               break;
            case 2:
               b[0] = NLoginCore_110.F("ծՖՖլՒվչՋՙՏյջնւվՕՈոթՅՙՋ՜ՠՐճնքֆ\u0557Ց\u0558", (byte)70, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_183.C("әӿӘӎҺӒӠӅӅӣӟӜӄӮӼӌԃӤӄӢԆԓӚӛ", (byte)70, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_478.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.B("ÙûýÝāĠĘĮĚéħĝīĥîēĵĴĬĲĬā", (byte)25, 66), NLoginCore_478.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.D("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߄\u07b8ߕߌ߉ߞߌߋߢ߃ߢߥߗߢߝњ", (byte)25, 68) + var1 + NLoginCore_324.F("ԏ", (byte)25, 70) + var2.toString(), var4
         );
      }
   }

   @Nullable
   private NLoginInterface_013 a(Object... var1) {
      try {
         if (this.l != null && !NLoginCore_298.a(this.l)) {
            return null;
         } else if (var1.length != this.a.length) {
            throw new IllegalArgumentException(a(c, d ^ e) + this + a(f & g, h) + var1.length + a(i & j, k) + this.a.length);
         } else {
            Object var2 = this.a.getConstructor(this.a).newInstance(var1);
            if (!(var2 instanceof NLoginInterface_013)) {
               throw new UnsupportedOperationException(a(l, m ^ n) + this + a(o & p, q));
            } else {
               return (NLoginInterface_013)var2;
            }
         }
      } catch (Exception var3) {
         throw new RuntimeException(a(r, s ^ t) + this + a(u & v, w), var3);
      }
   }

   private NLoginCore_478(String var3, Class<?> var4, Class<?>... var5) {
      this.l = var3;
      this.m = (boolean)a;
      this.a = var4;
      this.a = var5;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(ck & cl, cm);
      int var10003 = cn;
      int var10004 = co;
      Class[] var10006 = new Class[cp];
      var10006[cq] = NLoginCore_209.class;
      a = new NLoginCore_478((boolean)var10004, NLoginCore_399.class, var10006);
      var10002 = a(cr, cs ^ ct);
      var10003 = cu;
      var10004 = cv;
      var10006 = new Class[cw];
      var10006[cx] = NLoginCore_209.class;
      b = new NLoginCore_478((boolean)var10004, NLoginCore_129.class, var10006);
      var10002 = a(cy, cz ^ da);
      var10003 = db;
      var10004 = dc;
      var10006 = new Class[dd];
      var10006[de] = nLoginBukkit.class;
      var10006[df] = NLoginCore_187.class;
      var10006[dg] = NLoginCore_209.class;
      var10006[dh] = boolean.class;
      c = new NLoginCore_478((boolean)var10004, NLoginCore_253.class, var10006);
      var10002 = a(di & dj, dk);
      var10003 = dl;
      var10004 = dm;
      var10006 = new Class[dn];
      var10006[var_do] = nLoginBukkit.class;
      d = new NLoginCore_478((boolean)var10004, NLoginCore_011.class, var10006);
      var10002 = a(dp, dq);
      var10003 = dr;
      var10004 = ds;
      var10006 = new Class[dt];
      var10006[du] = nLoginBukkit.class;
      e = new NLoginCore_478((boolean)var10004, NLoginCore_373.class, var10006);
      var10002 = a(dv, dw);
      var10003 = dx;
      var10004 = dy;
      var10006 = new Class[dz];
      var10006[ea] = NLoginType_008.class;
      f = new NLoginCore_478((boolean)var10004, NLoginCore_448.class, var10006);
      var10002 = a(eb & ec, ed);
      var10003 = ee;
      var10004 = ef;
      var10006 = new Class[eg];
      var10006[eh] = nLoginBukkit.class;
      var10006[ei] = NLoginCore_209.class;
      var10006[ej] = boolean.class;
      g = new NLoginCore_478((boolean)var10004, NLoginCore_157.class, var10006);
      var10002 = a(ek, el ^ em);
      var10003 = en;
      String var36 = a(eo, ep);
      var10006 = new Class[eq];
      var10006[er] = NLoginCore_209.class;
      h = new NLoginCore_478(var36, NLoginCore_046.class, var10006);
      var10002 = a(es, et ^ eu);
      var10003 = ev;
      String var37 = a(ew, ex ^ ey);
      var10006 = new Class[ez];
      var10006[fa] = NLoginCore_209.class;
      i = new NLoginCore_478(var37, NLoginCore_545.class, var10006);
      var10002 = a(fb, fc ^ fd);
      var10003 = fe;
      var10004 = ff;
      var10006 = new Class[fg];
      var10006[fh] = nLoginBukkit.class;
      var10006[fi] = NLoginCore_447.class;
      j = new NLoginCore_478((boolean)var10004, NLoginCore_341.class, var10006);
      var10002 = a(fj, fk ^ fl);
      var10003 = fm;
      var10004 = fn;
      var10006 = new Class[fo];
      var10006[fp] = NLoginType_008.class;
      var10006[fq] = NLoginCore_447.class;
      k = new NLoginCore_478((boolean)var10004, NLoginCore_417.class, var10006);
      var10002 = a(fr, fs ^ ft);
      var10003 = fu;
      String var40 = a(fv, fw ^ fx);
      var10006 = new Class[fy];
      var10006[fz] = NLoginCore_209.class;
      l = new NLoginCore_478(var40, NLoginCore_025.class, var10006);
      var10002 = a(ga, gb ^ gc);
      var10003 = gd;
      String var41 = a(ge & gf, gg);
      var10006 = new Class[gh];
      var10006[gi] = nLoginBukkit.class;
      m = new NLoginCore_478(var41, NLoginCore_160.class, var10006);
      var10002 = a(gj, gk);
      var10003 = gl;
      String var42 = a(gm & gn, go);
      var10006 = new Class[gp];
      var10006[gq] = NLoginType_008.class;
      n = new NLoginCore_478(var42, NLoginCore_260.class, var10006);
      var10002 = a(gr, gs ^ gt);
      var10003 = gu;
      var10004 = gv;
      var10006 = new Class[gw];
      var10006[gx] = nLoginBukkit.class;
      o = new NLoginCore_478((boolean)var10004, NLoginCore_554.class, var10006);
      var10002 = a(gy, gz ^ ha);
      var10003 = hb;
      var10004 = hc;
      var10006 = new Class[hd];
      var10006[he] = nLoginBukkit.class;
      p = new NLoginCore_478((boolean)var10004, NLoginCore_290.class, var10006);
   }

   public boolean h() {
      return this.n;
   }

   private NLoginCore_478(boolean var3, Class<?> var4, Class<?>... var5) {
      this.l = null;
      this.m = var3;
      this.a = var4;
      this.a = var5;
   }
}
