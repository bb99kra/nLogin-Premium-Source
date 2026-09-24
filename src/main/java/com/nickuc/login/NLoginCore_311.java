package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_311 {
   e(a(NLoginCore_311.gm, NLoginCore_311.gn)),
   f(a(NLoginCore_311.gs & NLoginCore_311.gt, NLoginCore_311.gu));

   public static final int aD = NLoginCore_311.gg;
   public static final int aE = NLoginCore_311.gh;
   private final String cx;
   private static String[] a = new String[NLoginCore_311.ge];
   private static String[] b = new String[NLoginCore_311.gf];
   private static long c;
   private static int a = 0 >>> 108 | 0 << ~108 + 1;
   private static long b = Long.reverse(-8194804750778054018L);
   private static long d = Long.reverse(1441151880758558720L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(-1);
   private static long g = Long.reverse(-7330113622322918786L);
   private static int h = Integer.reverse(1073741824);
   private static long i = Long.reverse(-8194804750778054018L);
   private static long j = Long.reverse(1441151880758558720L);
   private static int k = Integer.reverse(-1073741824);
   private static long l = Long.reverse(-8194804750778054018L);
   private static long m = Long.reverse(1441151880758558720L);
   private static int n = (4194304 >>> 116 | 4194304 << -116) & -1;
   private static long o = Long.reverse(-7330113622322918786L);
   private static int p = 1310720 >>> 242 | 1310720 << ~242 + 1;
   private static long q = Long.reverse(-8194804750778054018L);
   private static long r = Long.reverse(1441151880758558720L);
   private static int s = Integer.reverse(1610612736);
   private static long t = Long.reverse(-8194804750778054018L);
   private static long u = Long.reverse(1441151880758558720L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int w = (64 >>> 198 | 64 << ~198 + 1) & -1;
   private static int x = (0 >>> 111 | 0 << ~111 + 1) & -1;
   private static int y = 7 >>> 192 | 7 << ~192 + 1;
   private static long z = Long.reverse(-8194804750778054018L);
   private static long aa = Long.reverse(1441151880758558720L);
   private static int ab = Integer.reverse(268435456);
   private static long ac = Long.reverse(-7330113622322918786L);
   private static long ad = Long.reverse(-1152921504606846976L);
   private static int ae = 4718592 >>> 147 | 4718592 << -147;
   private static int af = Integer.reverse(-1);
   private static long ag = Long.reverse(-7330113622322918786L);
   private static int ah = (20480 >>> 75 | 20480 << ~75 + 1) & -1;
   private static long ai = Long.reverse(-8194804750778054018L);
   private static long aj = Long.reverse(1441151880758558720L);
   private static int ak = 46137344 >>> 150 | 46137344 << -150;
   private static int al = -1 >>> 178 | -1 << -178;
   private static long am = Long.reverse(-7330113622322918786L);
   private static int an = Integer.reverse(805306368);
   private static long ao = Long.reverse(-8194804750778054018L);
   private static long ap = Long.reverse(1441151880758558720L);
   private static int aq = Integer.reverse(-1342177280);
   private static long ar = Long.reverse(-8194804750778054018L);
   private static long as = Long.reverse(1441151880758558720L);
   private static int at = Integer.reverse(1879048192);
   private static long au = Long.reverse(-8194804750778054018L);
   private static long av = Long.reverse(1441151880758558720L);
   private static long aw = Long.reverse(-1152921504606846976L);
   private static int ax = (2013265920 >>> 219 | 2013265920 << -219) & -1;
   private static int ay = Integer.reverse(-1);
   private static long az = Long.reverse(-7330113622322918786L);
   private static long ba = Long.reverse(-1152921504606846976L);
   private static int bb = Integer.reverse(134217728);
   private static long bc = Long.reverse(-8194804750778054018L);
   private static long bd = Long.reverse(1441151880758558720L);
   private static int be = (268435457 >>> 28 | 268435457 << -28) & -1;
   private static long bf = Long.reverse(-8194804750778054018L);
   private static long bg = Long.reverse(1441151880758558720L);
   private static int bh = (8 >>> 195 | 8 << -195) & -1;
   private static int bi = 0 >>> 87 | 0 << -87;
   private static int bj = Integer.reverse(Integer.MIN_VALUE);
   private static int bk = Integer.reverse(0);
   private static int bl = 1152 >>> 166 | 1152 << -166;
   private static long bm = Long.reverse(-7330113622322918786L);
   private static int bn = (304 >>> 68 | 304 << -68) & -1;
   private static long bo = Long.reverse(-8194804750778054018L);
   private static long bp = Long.reverse(1441151880758558720L);
   private static int bq = 192 >>> 38 | 192 << ~38 + 1;
   private static int br = (32 >>> 165 | 32 << -165) & -1;
   private static int bs = (0 >>> 55 | 0 << ~55 + 1) & -1;
   private static int bt = Integer.reverse(671088640);
   private static long bu = Long.reverse(-8194804750778054018L);
   private static long bv = Long.reverse(1441151880758558720L);
   private static int bw = Integer.reverse(-1476395008);
   private static long bx = Long.reverse(-7330113622322918786L);
   private static int by = Integer.reverse(0);
   private static int bz = (1 >>> 64 | 1 << -64) & -1;
   private static int ca = (369098752 >>> 152 | 369098752 << ~152 + 1) & -1;
   private static long cb = Long.reverse(-8194804750778054018L);
   private static long cc = Long.reverse(1441151880758558720L);
   private static int cd = Integer.reverse(-402653184);
   private static long ce = Long.reverse(-7330113622322918786L);
   private static long cf = Long.reverse(-1152921504606846976L);
   private static int cg = (1073741824 >>> 62 | 1073741824 << ~62 + 1) & -1;
   private static int ch = 0 >>> 157 | 0 << ~157 + 1;
   private static int ci = Integer.reverse(Integer.MIN_VALUE);
   private static int cj = (0 >>> 161 | 0 << ~161 + 1) & -1;
   private static int ck = Integer.reverse(402653184);
   private static int cl = Integer.reverse(-1);
   private static long cm = Long.reverse(-7330113622322918786L);
   private static int cn = Integer.reverse(-1744830464);
   private static long co = Long.reverse(-8194804750778054018L);
   private static long cp = Long.reverse(1441151880758558720L);
   private static int cq = Integer.reverse(1476395008);
   private static int cr = (-1 >>> 240 | -1 << ~240 + 1) & -1;
   private static long cs = Long.reverse(-7330113622322918786L);
   private static int ct = Integer.reverse(-671088640);
   private static int cu = -1 >>> 254 | -1 << -254;
   private static long cv = Long.reverse(-7330113622322918786L);
   private static int cw = (896 >>> 133 | 896 << -133) & -1;
   private static long cx = Long.reverse(-7330113622322918786L);
   private static int cy = Integer.reverse(-1207959552);
   private static int cz = (-1 >>> 176 | -1 << -176) & -1;
   private static long da = Long.reverse(-7330113622322918786L);
   private static int db = Integer.reverse(2013265920);
   private static long dc = Long.reverse(-7330113622322918786L);
   private static int dd = Integer.reverse(-134217728);
   private static long de = Long.reverse(-8194804750778054018L);
   private static long df = Long.reverse(1441151880758558720L);
   private static int dg = Integer.reverse(67108864);
   private static long dh = Long.reverse(-8194804750778054018L);
   private static long di = Long.reverse(1441151880758558720L);
   private static int dj = Integer.reverse(-2080374784);
   private static long dk = Long.reverse(-8194804750778054018L);
   private static long dl = Long.reverse(1441151880758558720L);
   private static int dm = Integer.reverse(1140850688);
   private static long dn = Long.reverse(-8194804750778054018L);
   private static long var_do = Long.reverse(1441151880758558720L);
   private static int dp = Integer.reverse(-1006632960);
   private static long dq = Long.reverse(-7330113622322918786L);
   private static int dr = Integer.reverse(603979776);
   private static long ds = Long.reverse(-8194804750778054018L);
   private static long dt = Long.reverse(1441151880758558720L);
   private static int du = (74 >>> 225 | 74 << -225) & -1;
   private static long dv = Long.reverse(-8194804750778054018L);
   private static long dw = Long.reverse(1441151880758558720L);
   private static int dx = (608 >>> 228 | 608 << ~228 + 1) & -1;
   private static long dy = Long.reverse(-7330113622322918786L);
   private static int dz = (939524097 >>> 251 | 939524097 << -251) & -1;
   private static long ea = Long.reverse(-8194804750778054018L);
   private static long eb = Long.reverse(1441151880758558720L);
   private static int ec = Integer.reverse(335544320);
   private static int ed = Integer.reverse(-1);
   private static long ee = Long.reverse(-7330113622322918786L);
   private static int ef = (10496 >>> 40 | 10496 << ~40 + 1) & -1;
   private static int eg = Integer.reverse(-1);
   private static long eh = Long.reverse(-7330113622322918786L);
   private static int ei = Integer.reverse(1409286144);
   private static int ej = (-1 >>> 239 | -1 << ~239 + 1) & -1;
   private static long ek = Long.reverse(-7330113622322918786L);
   private static int el = Integer.reverse(-738197504);
   private static int em = Integer.reverse(-1);
   private static long en = Long.reverse(-7330113622322918786L);
   private static int eo = Integer.reverse(872415232);
   private static int ep = (-1 >>> 185 | -1 << ~185 + 1) & -1;
   private static long eq = Long.reverse(-7330113622322918786L);
   private static int er = Integer.reverse(-1275068416);
   private static long es = Long.reverse(-8194804750778054018L);
   private static long et = Long.reverse(1441151880758558720L);
   private static int eu = Integer.reverse(1946157056);
   private static int ev = -1 >>> 1 | -1 << ~1 + 1;
   private static long ew = Long.reverse(-7330113622322918786L);
   private static int ex = (-1140850688 >>> 154 | -1140850688 << ~154 + 1) & -1;
   private static long ey = Long.reverse(-7330113622322918786L);
   private static int ez = 12582912 >>> 18 | 12582912 << ~18 + 1;
   private static long fa = Long.reverse(-8194804750778054018L);
   private static long fb = Long.reverse(1441151880758558720L);
   private static int fc = Integer.reverse(-1946157056);
   private static long fd = Long.reverse(-8194804750778054018L);
   private static long fe = Long.reverse(1441151880758558720L);
   private static int ff = 209715200 >>> 214 | 209715200 << ~214 + 1;
   private static int fg = (-1 >>> 19 | -1 << ~19 + 1) & -1;
   private static long fh = Long.reverse(-7330113622322918786L);
   private static int fi = Integer.reverse(-872415232);
   private static long fj = Long.reverse(-8194804750778054018L);
   private static long fk = Long.reverse(1441151880758558720L);
   private static int fl = Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << -222;
   private static int fm = (0 >>> 185 | 0 << -185) & -1;
   private static int fn = (0 >>> 101 | 0 << ~101 + 1) & -1;
   private static int fo = 1048576 >>> 180 | 1048576 << ~180 + 1;
   private static int fp = 4194304 >>> 54 | 4194304 << -54;
   private static int fq = Integer.reverse(0);
   private static int fr = (109051904 >>> 149 | 109051904 << ~149 + 1) & -1;
   private static int fs = Integer.reverse(-1);
   private static long ft = Long.reverse(-7330113622322918786L);
   private static int fu = (868352 >>> 206 | 868352 << -206) & -1;
   private static int fv = (-1 >>> 3 | -1 << ~3 + 1) & -1;
   private static long fw = Long.reverse(-7330113622322918786L);
   private static int fx = Integer.reverse(1811939328);
   private static long fy = Long.reverse(-7330113622322918786L);
   private static int fz = Integer.reverse(0);
   private static int ga = Integer.reverse(0);
   private static int gb = Integer.reverse(1073741824);
   private static int gc = 0 >>> 169 | 0 << -169;
   private static int gd = Integer.reverse(Integer.MIN_VALUE);
   private static int ge = Integer.reverse(-603979776);
   private static int gf = Integer.reverse(-603979776);
   private static int gg = 1966080 >>> 177 | 1966080 << ~177 + 1;
   private static int gh = 786432 >>> 146 | 786432 << ~146 + 1;
   private static int gi = Integer.reverse(-335544320);
   private static int gj = Integer.reverse(-1);
   private static long gk = Long.reverse(-7330113622322918786L);
   private static int gl = 0 >>> 37 | 0 << ~37 + 1;
   private static int gm = (1835008 >>> 207 | 1835008 << -207) & -1;
   private static long gn = Long.reverse(-7330113622322918786L);
   private static int go = Integer.reverse(-1677721600);
   private static long gp = Long.reverse(-8194804750778054018L);
   private static long gq = Long.reverse(1441151880758558720L);
   private static int gr = ('耀' >>> 239 | 32768 << -239) & -1;
   private static int gs = Integer.reverse(1543503872);
   private static int gt = -1 >>> 37 | -1 << -37;
   private static long gu = Long.reverse(-7330113622322918786L);

   public boolean aG() {
      switch (this) {
         case e:
            return NLoginCore_363.c.ar();
         case f:
            return NLoginCore_363.l.ar();
         default:
            throw new IllegalArgumentException(a(cq & cr, cs) + this + a(ct & cu, cv));
      }
   }

   public NLoginInterface_038 a(NLoginType_008 var1) {
      NLoginCore_308 var2 = var1.a();
      Object var3;
      switch (this) {
         case e:
            var3 = var2.a();
            break;
         case f:
            var3 = var2.a();
            break;
         default:
            throw new IllegalArgumentException(a(ei & ej, ek) + this + a(el & em, en));
      }

      if (var3 == null) {
         throw new IllegalStateException(this + a(eo & ep, eq));
      } else {
         return (NLoginInterface_038)var3;
      }
   }

   public boolean a(ForceRegisterConfig var1, @Nullable NLoginCore_137 var2, String var3) {
      return (boolean)(var3 != null && var3.equalsIgnoreCase(this.a(var1, var2)) ? bh : bi);
   }

   public boolean aJ() {
      switch (this) {
         case e:
            return NLoginCore_363.e.ar();
         case f:
            return NLoginCore_363.n.ar();
         default:
            throw new IllegalArgumentException(a(dr, ds ^ dt) + this + a(du, dv ^ dw));
      }
   }

   public String getName() {
      return this.cx;
   }

   public boolean a(ForceRegisterConfig var1, @Nullable NLoginCore_137 var2) {
      if (var2 == null) {
         return (boolean)v;
      } else {
         NLoginCore_137 var3 = this.a(var1);
         return (boolean)(var3 != null && var3 == var2 ? w : x);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 40L;
      var1 ^= -6423976584464703568L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(5 + 64),
                     (byte)(45 + 38),
                     (byte)(21 + 26),
                     (byte)(32 + 35),
                     (byte)(60 + 6),
                     67,
                     (byte)(33 + 14),
                     (byte)(3 + 77),
                     (byte)(24 + 51),
                     (byte)(45 + 22),
                     (byte)(75 + 8),
                     (byte)(6 + 47),
                     (byte)(75 + 5),
                     (byte)(79 + 18),
                     (byte)(89 + 11),
                     (byte)(69 + 31),
                     (byte)(77 + 28),
                     (byte)(101 + 9),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߲߱߳߿ࠀ߷߱߱߳߳ࠆࠌࠄ", (byte)38, 68));
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

   public String a(ForceRegisterConfig var1) {
      return var1.a().b(a(k, l ^ m) + this.cx + a(n, o));
   }

   public NLoginCore_137 a(ForceRegisterConfig var1) {
      String var2 = var1.a().b(a(s, t ^ u));
      return var2 != null ? NLoginCore_137.valueOf(var2) : null;
   }

   public String u() {
      return this == f && NLoginCore_150.j() ? a(a, b ^ d) : this.cx;
   }

   public boolean b(ForceRegisterConfig var1, @Nullable NLoginCore_137 var2) {
      return (boolean)(this.a(var1, var2) != null ? bj : bk);
   }

   public boolean aI() {
      switch (this) {
         case e:
            return NLoginCore_363.d.ar();
         case f:
            return NLoginCore_363.m.ar();
         default:
            throw new IllegalArgumentException(a(dm, dn ^ var_do) + this + a(dp, dq));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_311.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_433.C("ѰҒҔѴҘҷүӅұҀҾҴӂҼ҅ҪӌӋӃӉӃҘ", (byte)49, 67), NLoginCore_311.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.D("ҫҸҷѺҺҶұҺӅҴҁҿӃҼҿӅ҇ࠒࠓࠔࠠࠡ࠘ࠒࠒࠔࠔࠧ࠭ࠥҠ", (byte)49, 68) + var1 + NLoginCore_453.F("ԧ", (byte)49, 70) + var2.toString(), var4
         );
      }
   }

   @Nullable
   public String b(ForceRegisterConfig var1) {
      NLoginCore_335 var2 = var1.a();
      switch (this) {
         case e:
            return var2.m();
         case f:
            return var2.l();
         default:
            throw new IllegalArgumentException(a(db, dc) + this + a(dd, de ^ df));
      }
   }

   static {
      b();
   }

   public boolean e(ForceRegisterConfig var1) {
      NLoginCore_335 var2 = var1.a();
      switch (this) {
         case e:
            return var2.D();
         case f:
            return var2.C();
         default:
            throw new IllegalArgumentException(a(dg, dh ^ di) + this + a(dj, dk ^ dl));
      }
   }

   public void b(ForceRegisterConfig var1) {
      NLoginCore_407 var2 = var1.a();
      Integer var3 = var2.b(a(bt, bu ^ bv) + this.cx + a(bw, bx));
      if (var3 == null) {
         var3 = by;
      }

      var3 = var3 + bz;
      var2.a(a(ca, cb ^ cc) + this.cx + a(cd, ce), var3, cf, TimeUnit.MINUTES);
   }

   public boolean aH() {
      switch (this) {
         case e:
            return NLoginCore_363.j.ar();
         case f:
            return NLoginCore_363.r.ar();
         default:
            throw new IllegalArgumentException(a(cw, cx) + this + a(cy & cz, da));
      }
   }

   public boolean aL() {
      switch (this) {
         case e:
            return NLoginCore_363.g.ar();
         case f:
            return NLoginCore_363.p.ar();
         default:
            throw new IllegalArgumentException(a(ec & ed, ee) + this + a(ef & eg, eh));
      }
   }

   public boolean d(NLoginType_008 var1) {
      switch (this) {
         case e:
            return (boolean)(NLoginCore_363.a.ar() && var1.a().a() != null ? cg : ch);
         case f:
            return (boolean)(NLoginCore_363.k.ar() && var1.a().a() != null ? ci : cj);
         default:
            throw new IllegalArgumentException(a(ck & cl, cm) + this + a(cn, co ^ cp));
      }
   }

   private static void b() {
      c = 9102632753717600881L;
      long var0 = c ^ -6423976584464703568L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(11 + 57),
               (byte)(43 + 26),
               (byte)(61 + 22),
               (byte)(44 + 3),
               67,
               (byte)(22 + 44),
               (byte)(51 + 16),
               (byte)(13 + 34),
               (byte)(20 + 60),
               (byte)(20 + 55),
               (byte)(38 + 29),
               83,
               (byte)(9 + 44),
               (byte)(15 + 65),
               (byte)(45 + 52),
               (byte)(46 + 54),
               (byte)(5 + 95),
               (byte)(104 + 1),
               (byte)(69 + 41),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_110.E("ժ\u058b\u0590ձՏ֊Ւ\u0557է֎՚ՠ", (byte)92, 69);
               b[1] = NLoginCore_521.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
               b[2] = NLoginCore_201.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
               b[3] = NLoginCore_471.B("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 66);
               b[4] = NLoginCore_092.E("֒եմւլՎ֘֘֔֎յշ֕ֆղ֗՞֍\u0590֡գվիլ", (byte)92, 69);
               b[5] = NLoginCore_110.C("ԸԴԤԖՆԤԙӿԫԶԨԩԉԝԚՁԮԅԎՉՕԟԜԝ", (byte)92, 67);
               b[6] = NLoginCore_241.E("֑\u058bզ֊՟Ռձ\u058bյօ՛զկ՜խ\u0557խա֡ջ՟վիլ", (byte)92, 69);
               b[7] = NLoginCore_091.B("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 66);
               b[8] = NLoginCore_521.B("ƱƄƓơƋŭƷƷƳƭƔƖƴƥƑƶŽƬƯǀƂƝƊƋ", (byte)92, 66);
               b[9] = NLoginCore_027.C("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 67);
               b[10] = NLoginCore_324.C("ՃԖԥԳԝӿՉՉՅԿԦԨՆԷԣՈԏԾՁՒԔԯԜԝ", (byte)92, 67);
               b[11] = NLoginCore_232.C("ԘӾԭӷԀՈՆԩՃԟԇԬԠԆԪԞԛԐԍՎԢՉՙԹԹՌՈԓԷԩ\u0530՛ՔգդՆ՟գԵՓթԥՙԥԸՁեՐժՈՅԯժՏԼԽ", (byte)92, 67);
               b[12] = NLoginCore_141.A("ŨƑƭŻƢƕƆƫƹƤƉƕŲƱƊƖƊƬƿƭƓżƁƻƢƱƅƸƟƺƫƇ", (byte)92, 65);
               b[13] = NLoginCore_387.B("ƣƝƲƟƕƊƓƕƓŲŷƶƯŹƆƜƻƶƭƒƣǃƊƋ", (byte)92, 66);
               b[14] = NLoginCore_076.B("ƦƢƒƄƴƒƇŭƙƤƖƗŷƋƈƯƜųżƷǃƍƊƋ", (byte)92, 66);
               b[15] = NLoginCore_141.E("֑\u058bզ֊՟Ռձ\u058bյօ՛զկ՜խ\u0557խա֡ջ՟վիլ", (byte)92, 69);
               b[16] = NLoginCore_553.B("ƦƢƒƄƴƒƇŭƙƤƖƗŷƋƈƯƜųżƷǃƍƊƋ", (byte)92, 66);
               b[17] = NLoginCore_027.D("ՂԼԗԻԐӽԢԼԦԶԌԗԠԍԞԈԞԒՒԬԐԯԜԝ", (byte)92, 68);
               b[18] = NLoginCore_110.A("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 65);
               b[19] = NLoginCore_127.F("՟ՍՒյՐէՠՖՓհ֕՚շ՛֗ծ֟մ֛֒գռ֕ձտւ֣֭֓֨լ֤", (byte)92, 70);
               b[20] = NLoginCore_324.D("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 68);
               b[21] = NLoginCore_397.C("ԐӾԃԦԁԘԑԇԄԡՆԋԨԌՈԟՐԥՌՃԔԭՆԢ\u0530ԳՄՔ՞ՙԝՕ", (byte)92, 67);
               b[22] = NLoginCore_397.D("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 68);
               b[23] = NLoginCore_559.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƛƴƐƞơƲǂǌǇƋǃ", (byte)92, 66);
               b[24] = NLoginCore_076.C("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 67);
               b[25] = NLoginCore_076.F("թՎՅֈիե֓Վքւշՠ", (byte)92, 70);
               b[26] = NLoginCore_559.A("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 65);
               b[27] = NLoginCore_127.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
               b[28] = NLoginCore_091.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
               b[29] = NLoginCore_451.A("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 65);
               b[30] = NLoginCore_453.A("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 65);
               b[31] = NLoginCore_004.F("թՎՅֈիե֓Վքւշՠ", (byte)92, 70);
               b[32] = NLoginCore_553.B("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 66);
               b[33] = NLoginCore_530.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
               b[34] = NLoginCore_384.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
               b[35] = NLoginCore_530.C("ԚӿӶԹԜԖՄӿԵԳԨԑ", (byte)92, 67);
               b[36] = NLoginCore_201.B("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 66);
               b[37] = NLoginCore_553.D("ԚӿӶԹԜԖՄӿԵԳԨԑ", (byte)92, 68);
               b[38] = NLoginCore_110.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
               b[39] = NLoginCore_241.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
               b[40] = NLoginCore_004.C("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 67);
               b[41] = NLoginCore_110.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
               b[42] = NLoginCore_223.D("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 68);
               b[43] = NLoginCore_446.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
               b[44] = NLoginCore_173.A("ƮƜƐƆƝƴŵůơƐűƻƛƚƎƠƬƽǀƹƯƀƞǁƛƒƪƇƈƝƗǆǄƣǋưƑǊƿƫƎƤƲƟ", (byte)92, 65);
               b[45] = NLoginCore_110.E("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 69);
               b[46] = NLoginCore_433.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
               b[47] = NLoginCore_553.D("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 68);
               b[48] = NLoginCore_471.A("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 65);
               b[49] = NLoginCore_127.B("ŮŨƪƨƭƩƎƦƪūƙƧƴƵƲƊƛƀƪơƞǆżǇſơƣƵơƿƟƊƿǍǁǌƐơǐǃƭƧǆǇƲƻƬƯǚǔƾƸǢǓƪƫ", (byte)92, 66);
               b[50] = NLoginCore_183.A("ŦƭŤƉƳưƐűƵƓƯƯƄƧƫŵƸƵſƛǂƝƊƋ", (byte)92, 65);
               b[51] = NLoginCore_076.B("ƌƣƨƭŮƮſƗƣƑƖſ", (byte)92, 66);
               b[52] = NLoginCore_173.C("ՁԳՂӽӸԑՄԓԞՉԝԮԙԼԣԜԯԐԟԦԴՕԜԝ", (byte)92, 67);
               b[53] = NLoginCore_451.B("ƘŪūƟƨƕƓƧƯƧƳƒŴƳƔƒǀƔƋƺƻƓƯǃƳƜƣƼžƩƫƭǋǉƣƤǃƕƌƑƮǗƫƶƺǅǆǒƙǘƟǝǓǣƪƫ", (byte)92, 66);
               b[54] = NLoginCore_451.F("ժպ֓ձՔՖևխո\u0557ՙ՛Օ֚ղչչւ֡բճ֔իլ", (byte)92, 70);
               b[55] = NLoginCore_384.C("ԟԽӾԾԗԼԾԼԝԽԶԑ", (byte)92, 67);
               b[56] = NLoginCore_530.E("ՙ֎֎֊ղ\u058cըաՖ\u0557կՠ", (byte)92, 69);
               b[57] = NLoginCore_387.F("ՙծկֆֈ\u0590Չղ\u0590֎֍ՠ", (byte)92, 70);
               b[58] = NLoginCore_138.F("վՈծտՠդըցևջիՠ", (byte)92, 70);
               break;
            case 1:
               b[0] = NLoginCore_530.B("ŹƱƋƀƆŵƢƓƖƣƉƅƨƶƛżƩǂƟƴƏǃƊƋ", (byte)92, 66);
               b[1] = NLoginCore_553.B("ŧơŮƬžƝƐƕƘƔƩưųƷƦƎưƫƫƫƲƀƒǇƸƖǋƖƢƨƜǌ", (byte)92, 66);
               b[2] = NLoginCore_397.B("ūƨźƏƄơƦƟƉƃűſ", (byte)92, 66);
               b[3] = NLoginCore_397.A("ƙƣƦƳƒƵƳƇŶůƴƅƘƚƏƍƔƖƿźƯƝƊƋ", (byte)92, 65);
               b[4] = NLoginCore_241.E("֒եմւլՎ֘֘֔֎ն֎\u0590֑րծ\u0558իփջ֛ծիլ", (byte)92, 69);
               b[5] = NLoginCore_173.D("ԸԴԤԖՆԤԙӿԫԶԪԠԎԣԾԐՈԤԼԳՒԟԜԝ", (byte)92, 68);
               b[6] = NLoginCore_110.B("ưƪƅƩžūƐƪƔƤŰƑƮƩƟƨƊƩƳƵƼǃƊƋ", (byte)92, 66);
               b[7] = NLoginCore_183.C("ՀԣԗԝԕԞӺԧԹԋՆԑ", (byte)92, 67);
               b[8] = NLoginCore_092.A("ƱƄƓơƋŭƷƷƳƭƒƐƷƲƝŸǁƭƎǄƃƝƊƋ", (byte)92, 65);
               b[9] = NLoginCore_397.E("իՐլՔ֍֎Քշ֎փ։ՠ", (byte)92, 69);
               b[10] = NLoginCore_183.F("֒եմւլՎ֘֘֔֎մշձկխ\u058bղր\u0590ղ֑֤իլ", (byte)92, 70);
               b[11] = NLoginCore_201.E("էՍռՆՏ֗֕ո֒ծՖջկՕչխժ՟՜֝ձ֘֨ֈֈ֛֗բֆոտֲֲֳ֪֣֮֕քָ֢մ֥֒օպֺ֖֓֊չ\u0590ռׄ\u058b\u058c", (byte)92, 69);
               b[12] = NLoginCore_004.A("ŨƑƭŻƢƕƆƫƹƤƉƕŲƱƊƖƊƬƿƭƓƄƤǃƅƸƕƇƄſƽǋ", (byte)92, 65);
               b[13] = NLoginCore_092.B("ƣƝƲƟƕƊƓƕƓŲŵƍƭƨƨƙƱƩƓƑƽƳƊƋ", (byte)92, 66);
               b[14] = NLoginCore_384.A("ƦƢƒƄƴƒƇŭƙƤƘűƽƱƈƛƹſƕƞƬƝƊƋ", (byte)92, 65);
               b[15] = NLoginCore_127.A("ưƪƅƩžūƐƪƔƤŬŶŸƓƐƭŸƚǁưƘƳƊƋ", (byte)92, 65);
               b[16] = NLoginCore_110.E("ևփճե֕ճըՎպօչ։֒թտ։խ՝վքե֤իլ", (byte)92, 69);
               b[17] = NLoginCore_521.A("ưƪƅƩžūƐƪƔƤŹƤƪƸŽƕƘƹƫƢƔƝƊƋ", (byte)92, 65);
               b[18] = NLoginCore_183.C("ӺԠԒӽԳԱԀԒԾՊՆԑ", (byte)92, 67);
               b[19] = NLoginCore_201.C("ԐӾԃԦԁԘԑԇԄԡՆԋԨԌՈԟՐԥՌՃԔԢՈԕԓՏ՚ՑՇԱԶԡ", (byte)92, 67);
               b[20] = NLoginCore_183.A("ŽſƣŰžƉƀƪƆƴƬſ", (byte)92, 65);
               b[21] = NLoginCore_384.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƙƛƷƟƲƻƊƧƷƛƥ", (byte)92, 66);
               b[22] = NLoginCore_521.B("ƎƣƩƀƴůƋƁƲŷƆſ", (byte)92, 66);
               b[23] = NLoginCore_384.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƗǆƕƛƀƛƨǋƝƷƎ", (byte)92, 66);
               b[24] = NLoginCore_127.C("ӹԳԀԾԐԯԢԧԪԦԼՁՂԿԪԻԳՎԡԮԭԢԬԷԺԖԙՔ\u0557ԖԮբ", (byte)92, 67);
               b[25] = NLoginCore_451.F("՟խլ\u058bր։ըՊճպ֑ՠ", (byte)92, 70);
               b[26] = NLoginCore_173.A("ŧơŮƬžƝƐƕƘƔƫŻƄƇƸƚƨƏƐƓǅƺǅƥƵƝƘƘƃƹƦƧ", (byte)92, 65);
               b[27] = NLoginCore_559.F("ջզՏթբ\u058cՉ\u0557ՏՒ֙ՠ", (byte)92, 70);
               b[28] = NLoginCore_559.F("ՈւՏ֍՟վձնչյ։֘Տևխջ՛՞֓փշ֔իլ", (byte)92, 70);
               b[29] = NLoginCore_241.A("ƎƋƃƟŮƇžƱƏơƚſ", (byte)92, 65);
               b[30] = NLoginCore_559.A("ŧơŮƬžƝƐƕƘƔƫƚƏŻƱƔƖƒƸƵƟƳƊƋ", (byte)92, 65);
               b[31] = NLoginCore_223.C("ӾԾӻԮԧԄԲԈԣӽԋԑ", (byte)92, 67);
               b[32] = NLoginCore_076.E("ՈւՏ֍՟վձնչյ\u058bծ֓վթ֠֘ւ֣\u058cպ֤զ֗ՠ֦֕րսդ֗ը", (byte)92, 69);
               b[33] = NLoginCore_004.D("ԠԒԲԹԕԄӾՃӼԠԤԑ", (byte)92, 68);
               b[34] = NLoginCore_091.F("ՈւՏ֍՟վձնչյ։ժ֏֖մթո֜֓֡եվիլ", (byte)92, 70);
               b[35] = NLoginCore_433.B("ŮűƋƬůƔƦŮƙƹƸſ", (byte)92, 66);
               b[36] = NLoginCore_091.C("ӹԳԀԾԐԯԢԧԪԦԻՃԘԘԤԱԎՒԔԩԐԗ\u0530ԑՅԖ՜ԦԙԬ՜Ա", (byte)92, 67);
               b[37] = NLoginCore_397.E("զլֈՏՑժձց֚֓ճՠ", (byte)92, 69);
               b[38] = NLoginCore_575.F("ՈւՏ֍՟վձնչյ\u058cհ֍֛լֈ֖֝՜֢ա֞զջֆ֢֡ռքխւ֫", (byte)92, 70);
               b[39] = NLoginCore_076.D("ԍӾԣԓԻԴՅԚԴԷԠԑ", (byte)92, 68);
               b[40] = NLoginCore_201.D("ӹԳԀԾԐԯԢԧԪԦԼԝՈԦԠՎՈՌԢԣԬԟԜԝ", (byte)92, 68);
               b[41] = NLoginCore_223.B("žưżƉƠƐƢƎƢƖƬſ", (byte)92, 66);
               b[42] = NLoginCore_387.E("ՈւՏ֍՟վձնչյ\u058cյձՐձ\u0558վճմ֘չ\u0590֢ղփվ֖֍֗օկ֪", (byte)92, 69);
               b[43] = NLoginCore_004.F("ՌՍՌքքօմ։յՕէՠ", (byte)92, 70);
               b[44] = NLoginCore_138.C("ՀԮԢԘԯՆԇԁԳԢԃՍԭԬԠԲԾՏՒՋՁԒ\u0530ՓԭԤԼԙԚԯԩ\u0558\u0557ԚԮԸՎԼԞԱԥ՚ՀԱ", (byte)92, 67);
               b[45] = NLoginCore_092.B("ŧơŮƬžƝƐƕƘƔƫƕƸƞƎŸƔƐƒƕŽǆƱǂǃƸƾƦƨƾǊǃ", (byte)92, 66);
               b[46] = NLoginCore_427.C("ԢԬԎԮԗԸԖԝԂԓԇԑ", (byte)92, 67);
               b[47] = NLoginCore_530.E("ՈւՏ֍՟վձնչյ։ս\u0557պն֜լ֟նջշ֤իլ", (byte)92, 69);
               b[48] = NLoginCore_241.D("ӹӿӻԁԕԛԤԪԹԗԤԑ", (byte)92, 68);
               b[49] = NLoginCore_091.D("ԀӺԼԺԿԻԠԸԼӽԫԹՆՇՄԜԭԒԼԳ\u0530\u0558ԎՙԑԳԵՇԳՑԱԜՑ՟Փ՞ԢԳբՕԿԹ\u0557ԟԮԯԸՂԼՆդ՞\u0557Ռ\u0557ը\u0530ՅԼՉզՕՋԿ", (byte)92, 68);
               b[50] = NLoginCore_433.B("ŦƭŤƉƳưƐűƵƓƮźƥŶƩƵŽƋƿƑƠƕưƟƙǆƞƶƵǀǎƍ", (byte)92, 66);
               b[51] = NLoginCore_138.E("վկևՌ։ՖտՎզքկՠ", (byte)92, 69);
               b[52] = NLoginCore_553.D("ՁԳՂӽӸԑՄԓԞՉԜԟՈՆՌԹԎԬԳԕՔԟԜԝ", (byte)92, 68);
               b[53] = NLoginCore_553.E("չՋՌր։նմֈ\u0590ֈ֔ճՕ֔յճ֡յլ֛֜մ\u0590֤֔սք֝՟֊\u058c֎֪֬քօ֤նխղ֏ָ֍֍ֱռ֝պ\u0590ր־֝փִׇָׂׂׂ֞ֆׅ֦֊", (byte)92, 69);
               b[54] = NLoginCore_027.D("ԛԫՄԢԅԇԸԞԩԈԈԈԸՐՇԼՋԯՔՓԾՕԜԝ", (byte)92, 68);
               b[55] = NLoginCore_433.C("ӴԂԣԟԕԵԳԱՇՁԊՍԣՎՌՄԱԢՊԵՕՅԜԝ", (byte)92, 67);
               b[56] = NLoginCore_241.F("ատօխէօ֎ըչՔ֕ե՜֚ծ֖֞֞՚֓գ֤իլ", (byte)92, 70);
               b[57] = NLoginCore_138.D("ӸԙԌԓԛԜԩԇԟՁԄՍԸՍՂՅԒՁՍԣՄՅԜԝ", (byte)92, 68);
               b[58] = NLoginCore_223.C("ՃԓӻԵՄԅԂԑՁԟՊԑ", (byte)92, 67);
               break;
            case 2:
               b[0] = NLoginCore_553.C("ӸԬԛԖԱӹԻՀՅԪՆԜՍԟԽԯՇՈ\u0530ԒՍՔՂՙՑԩԨ\u0557ԯ՟ԶՁ", (byte)92, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.D("ԕԷՀՅԓՀԄԗԡԜԇԦԨԈՊՇՎԉԠԢԣԡԫԱԧԸՏԥԾՍՁԸ", (byte)92, 68);
         }
      }
   }

   public String a(ForceRegisterConfig var1, @Nullable NLoginCore_137 var2) {
      return this.a(var1, var2) ? var1.a().b(a(p, q ^ r)) : null;
   }

   @Generated
   private NLoginCore_311(String var3) {
      this.cx = var3;
   }

   @Nullable
   public String aA() {
      NLoginCore_466 var1;
      switch (this) {
         case e:
            var1 = NLoginCore_466.d;
            break;
         case f:
            var1 = NLoginCore_466.e;
            break;
         default:
            throw new IllegalArgumentException(a(e & f, g) + this + a(h, i ^ j));
      }

      return var1.a().d().stream().findFirst().orElse(null);
   }

   @Nullable
   public NLoginCore_219 a(NLoginType_008 var1) {
      NLoginCore_308 var2 = var1.a();
      switch (this) {
         case e:
            return var2.b();
         case f:
            return var2.c();
         default:
            throw new IllegalArgumentException(a(er, es ^ et) + this + a(eu & ev, ew));
      }
   }

   public void b(ForceRegisterConfig var1, String var2) {
      NLoginCore_407 var3 = var1.a();
      if (var2 != null) {
         var3.a(a(y, z ^ aa) + this.cx + a(ab, ac), var2, ad, TimeUnit.MINUTES);
      } else {
         var3.e(a(ae & af, ag) + this.cx + a(ah, ai ^ aj));
      }
   }

   public boolean aK() {
      switch (this) {
         case e:
            return NLoginCore_363.f.ar();
         case f:
            return NLoginCore_363.o.ar();
         default:
            throw new IllegalArgumentException(a(dx, dy) + this + a(dz, ea ^ eb));
      }
   }

   public int a(NLoginType_008 var1, String var2) {
      NLoginCore_436 var3;
      switch (this) {
         case e:
            var3 = NLoginCore_436.k;
            break;
         case f:
            var3 = NLoginCore_436.j;
            break;
         default:
            throw new IllegalArgumentException(a(ex, ey) + this + a(ez, fa ^ fb));
      }

      NLoginCore_459 var4 = var1.a().a();
      String var5 = a(fc, fd ^ fe) + (var4.a() == NLoginCore_036.f ? a(ff & fg, fh) : a(fi, fj ^ fk));

      try {
         Object[] var10002 = new Object[fl];
         var10002[fm] = NLoginCore_477.e.a(new Object[fn]);
         var10002[fo] = var3.getName();
         String var10001 = String.format(var5, var10002);
         var10002 = new Object[fp];
         var10002[fq] = var2;
         NLoginCore_171 var6 = var4.a(var10001, var10002);

         int var8;
         label65: {
            try {
               ResultSet var7 = var6.d();
               if (var7.next()) {
                  var8 = var7.getInt(a(fr & fs, ft));
                  break label65;
               }
            } catch (Throwable var10) {
               if (var6 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if (var6 != null) {
               var6.close();
            }

            return ga;
         }

         if (var6 != null) {
            var6.close();
         }

         return var8;
      } catch (Exception var11) {
         NLoginCore_370.d(a(fu & fv, fw) + var2 + a(fx, fy) + this);
         return ga;
      }
   }

   public void a(ForceRegisterConfig var1, String var2, NLoginCore_137 var3) {
      if (this == e && var3 == NLoginCore_137.a) {
         throw new IllegalStateException(a(ak & al, am) + this + a(an, ao ^ ap) + var3 + a(aq, ar ^ as));
      } else {
         NLoginCore_407 var4 = var1.a();
         if (var2 != null && var3 != null) {
            var4.a(a(at, au ^ av), var2, aw, TimeUnit.MINUTES);
            var4.a(a(ax & ay, az), var3.name(), ba, TimeUnit.MINUTES);
         } else {
            var4.e(a(bb, bc ^ bd));
            var4.e(a(be, bf ^ bg));
         }
      }
   }

   public boolean d(ForceRegisterConfig var1) {
      Integer var2 = var1.a().b(a(bl, bm) + this.cx + a(bn, bo ^ bp));
      return (boolean)(var2 != null && var2 >= bq ? br : bs);
   }
}
