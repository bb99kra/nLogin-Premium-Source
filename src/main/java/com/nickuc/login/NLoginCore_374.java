package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_374 {
   private static int ei = 0 >>> 203 | 0 << -203;
   private static int gu = (15 >>> 94 | 15 << -94) & -1;
   private static long dn = Long.reverse(-3167127905720696155L);
   private static long ie = Long.reverse(-3167127905720696155L);
   private static int au = Integer.reverse(0);
   private static int gp = (1900544 >>> 143 | 1900544 << ~143 + 1) & -1;
   private static long ij = Long.reverse(3170534137668829184L);
   private static int ee = Integer.reverse(Integer.MIN_VALUE);
   private static int jh = 2368 >>> 165 | 2368 << ~165 + 1;
   private static long cc = Long.reverse(3170534137668829184L);
   private static int eh = Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << -159;
   private static long hk = Long.reverse(3170534137668829184L);
   private static int jz = (-1 >>> 225 | -1 << ~225 + 1) & -1;
   private static long du = Long.reverse(3170534137668829184L);
   private static int k = Integer.reverse(1073741824);
   private static long ce = Long.reverse(-573054520355290459L);
   protected long l;
   private static int gf = Integer.reverse(-335544320);
   private static long y = Long.reverse(-3167127905720696155L);
   private static int fi = Integer.reverse(0);
   private static long t = Long.reverse(3170534137668829184L);
   private static long gd = Long.reverse(3170534137668829184L);
   private static long bi = Long.reverse(-3167127905720696155L);
   private static int dc = (4096 >>> 71 | 4096 << ~71 + 1) & -1;
   private static long dt = Long.reverse(-3167127905720696155L);
   private static long bn = Long.reverse(-573054520355290459L);
   private static int ih = Integer.reverse(-1040187392);
   private static long jp = Long.reverse(3170534137668829184L);
   private static long fa = Long.reverse(-3167127905720696155L);
   private static int fj = Integer.reverse(33554432);
   private static int jk = (-1 >>> 79 | -1 << -79) & -1;
   private static long cr = Long.reverse(-3167127905720696155L);
   protected NLoginCore_459 d;
   private static int js = -1 >>> 189 | -1 << -189;
   private static int aa = 786432 >>> 82 | 786432 << ~82 + 1;
   private static final Set<NLoginCore_374> e = new HashSet<>();
   private static long cy = Long.reverse(-573054520355290459L);
   private static volatile Thread a;
   protected static final String B = a(NLoginCore_374.jy & jz, NLoginCore_374.ka);
   private static long ec = Long.reverse(-3167127905720696155L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(-3167127905720696155L);
   private final boolean A;
   private static long ak = Long.reverse(-3167127905720696155L);
   private static int hf = Integer.reverse(-1140850688);
   private static int be = (1792 >>> 135 | 1792 << -135) & -1;
   private static int jn = 1610612738 >>> 187 | 1610612738 << ~187 + 1;
   private static int g = Integer.reverse(-1);
   private static long ix = Long.reverse(-3167127905720696155L);
   private static long bl = Long.reverse(-573054520355290459L);
   private static int el = Integer.reverse(1409286144);
   private static int cu = Integer.reverse(-1);
   private static long z = Long.reverse(3170534137668829184L);
   private static long dz = Long.reverse(-3167127905720696155L);
   private static int q = (Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << -158) & -1;
   private static int ga = 0 >>> 192 | 0 << ~192 + 1;
   private static int id = Integer.reverse(1107296256);
   private static long co = Long.reverse(-573054520355290459L);
   private static int jj = Integer.reverse(-771751936);
   private static long az = Long.reverse(-573054520355290459L);
   private static int fk = Integer.reverse(-1946157056);
   private static long al = Long.reverse(3170534137668829184L);
   private static long bw = Long.reverse(-3167127905720696155L);
   private static int ck = Integer.reverse(1476395008);
   private static int ba = (0 >>> 155 | 0 << ~155 + 1) & -1;
   private static int jy = 1308622848 >>> 248 | 1308622848 << ~248 + 1;
   private static long iq = Long.reverse(-3167127905720696155L);
   private static long gm = Long.reverse(-3167127905720696155L);
   private static long ji = Long.reverse(-573054520355290459L);
   private static long iu = Long.reverse(3170534137668829184L);
   private static int ej = 343932928 >>> 247 | 343932928 << -247;
   private static int cz = Integer.reverse(-134217728);
   private static long dd = Long.reverse(-3167127905720696155L);
   private static long cv = Long.reverse(-573054520355290459L);
   private static int es = 720896 >>> 142 | 720896 << -142;
   private static int ab = (0 >>> 228 | 0 << -228) & -1;
   private static long gq = Long.reverse(-573054520355290459L);
   private static int hr = Integer.reverse(Integer.MIN_VALUE);
   private static int dv = (311296 >>> 13 | 311296 << -13) & -1;
   private static long jt = Long.reverse(-573054520355290459L);
   private static long fw = Long.reverse(3170534137668829184L);
   private static int bs = 622592 >>> 207 | 622592 << -207;
   private static int l = Integer.reverse(-1);
   private static long eq = Long.reverse(-3167127905720696155L);
   private static int r = 96 >>> 69 | 96 << ~69 + 1;
   private static int jx = (10112 >>> 135 | 10112 << ~135 + 1) & -1;
   private static long dh = Long.reverse(-573054520355290459L);
   private static int gr = Integer.reverse(-603979776);
   private static long s = Long.reverse(-3167127905720696155L);
   private static long ah = Long.reverse(-3167127905720696155L);
   private static int ib = Integer.reverse(-1);
   private static long cm = Long.reverse(-573054520355290459L);
   private static int ha = 0 >>> 159 | 0 << -159;
   private static int cp = Integer.reverse(0);
   private static long bp = Long.reverse(-3167127905720696155L);
   private static int bm = Integer.reverse(-2013265920);
   private static int dj = Integer.reverse(1140850688);
   private static int ct = (121634816 >>> 86 | 121634816 << -86) & -1;
   private static long dl = Long.reverse(3170534137668829184L);
   private static long gc = Long.reverse(-3167127905720696155L);
   private static long bc = Long.reverse(-3167127905720696155L);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static long ir = Long.reverse(3170534137668829184L);
   private static String[] ZKM_STR_A = new String[NLoginCore_374.jw];
   private static int hu = -2147483630 >>> 255 | -2147483630 << -255;
   private static long aq = Long.reverse(-3167127905720696155L);
   private static long hy = Long.reverse(-573054520355290459L);
   private static long bz = Long.reverse(-573054520355290459L);
   private static int am = Integer.reverse(-1879048192);
   private static long gh = Long.reverse(3170534137668829184L);
   private static long dx = Long.reverse(3170534137668829184L);
   private static long ao = Long.reverse(3170534137668829184L);
   private static int jv = (0 >>> 150 | 0 << -150) & -1;
   private static int hi = (248 >>> 34 | 248 << -34) & -1;
   private static int n = Integer.reverse(536870912);
   private static long fm = Long.reverse(3170534137668829184L);
   private static int il = (1073741828 >>> 28 | 1073741828 << ~28 + 1) & -1;
   private static int dm = Integer.reverse(-1006632960);
   private static int eg = Integer.reverse(0);
   private static long bx = Long.reverse(3170534137668829184L);
   private static int bv = Integer.reverse(671088640);
   private static long e = Long.reverse(3170534137668829184L);
   private static long af = Long.reverse(3170534137668829184L);
   private static int ds = (620756992 >>> 24 | 620756992 << ~24 + 1) & -1;
   private static int eo = (0 >>> 188 | 0 << ~188 + 1) & -1;
   private static long gs = Long.reverse(-3167127905720696155L);
   private static int cw = Integer.reverse(2013265920);
   private static long fd = Long.reverse(-3167127905720696155L);
   private static long hj = Long.reverse(-3167127905720696155L);
   private static long ex = Long.reverse(-3167127905720696155L);
   private static int hl = (0 >>> 35 | 0 << -35) & -1;
   private static int df = 2112 >>> 102 | 2112 << -102;
   private static int gx = 134217728 >>> 91 | 134217728 << ~91 + 1;
   private static int o = 0 >>> 198 | 0 << ~198 + 1;
   private static long bf = Long.reverse(-3167127905720696155L);
   private static int hd = Integer.reverse(Integer.MIN_VALUE);
   private static int hq = 0 >>> 123 | 0 << ~123 + 1;
   private static long da = Long.reverse(-3167127905720696155L);
   private static int jw = 331350016 >>> 214 | 331350016 << -214;
   private static long ai = Long.reverse(3170534137668829184L);
   private static int hz = 4194304 >>> 180 | 4194304 << ~180 + 1;
   private static int ht = 256 >>> 71 | 256 << -71;
   private static long fl = Long.reverse(-3167127905720696155L);
   private static int hp = 671088640 >>> 59 | 671088640 << -59;
   private static int he = (0 >>> 29 | 0 << ~29 + 1) & -1;
   private static int hs = Integer.reverse(1073741824);
   private static long gy = Long.reverse(1711367858400788480L);
   private static long in = Long.reverse(3170534137668829184L);
   private static int fc = (-268435454 >>> 124 | -268435454 << -124) & -1;
   private static long db = Long.reverse(3170534137668829184L);
   private static long je = Long.reverse(-3167127905720696155L);
   private static long fb = Long.reverse(3170534137668829184L);
   private static int jd = (1073741842 >>> 30 | 1073741842 << ~30 + 1) & -1;
   private static int br = 0 >>> 14 | 0 << ~14 + 1;
   private static long fs = Long.reverse(3170534137668829184L);
   private static long ii = Long.reverse(-3167127905720696155L);
   private static int bb = (26 >>> 1 | 26 << ~1 + 1) & -1;
   private static int ag = 1835008 >>> 178 | 1835008 << ~178 + 1;
   private static long var_if = Long.reverse(3170534137668829184L);
   private static int gi = (117440512 >>> 21 | 117440512 << ~21 + 1) & -1;
   private static long gt = Long.reverse(3170534137668829184L);
   private static int x = -2147483646 >>> 31 | -2147483646 << -31;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int ff = (1572864 >>> 15 | 1572864 << ~15 + 1) & -1;
   private static long an = Long.reverse(-3167127905720696155L);
   private static int ef = 0 >>> 15 | 0 << ~15 + 1;
   private static long bg = Long.reverse(3170534137668829184L);
   private static int ju = Integer.reverse(Integer.MIN_VALUE);
   private static long cj = Long.reverse(-573054520355290459L);
   protected final NLoginCore_479 a;
   private static int ip = (70656 >>> 138 | 70656 << ~138 + 1) & -1;
   private static int av = -1342177280 >>> 220 | -1342177280 << ~220 + 1;
   private static long fp = Long.reverse(-573054520355290459L);
   private static int ci = Integer.reverse(-1744830464);
   private NLoginInterface_048 b;
   private static int hv = (12288 >>> 108 | 12288 << ~108 + 1) & -1;
   private static int fy = Integer.reverse(-1);
   private static long fe = Long.reverse(3170534137668829184L);
   private static long ja = Long.reverse(-3167127905720696155L);
   private static int gb = 27 >>> 127 | 27 << -127;
   private static int hw = (25 >>> 224 | 25 << -224) & -1;
   private static long jf = Long.reverse(3170534137668829184L);
   private static int cq = Integer.reverse(939524096);
   protected long j;
   private static long ea = Long.reverse(3170534137668829184L);
   private static long bq = Long.reverse(3170534137668829184L);
   private static int jg = Integer.reverse(0);
   private static int b = Integer.reverse(0);
   private static long w = Long.reverse(-573054520355290459L);
   private static int ft = 0 >>> 111 | 0 << ~111 + 1;
   private static int ax = Integer.reverse(805306368);
   protected long k;
   private static int iv = Integer.reverse(0);
   private static long bj = Long.reverse(3170534137668829184L);
   private static long jo = Long.reverse(-3167127905720696155L);
   private static long var_do = Long.reverse(3170534137668829184L);
   private static long m = Long.reverse(-573054520355290459L);
   private static int i = 0 >>> 71 | 0 << ~71 + 1;
   private static long ae = Long.reverse(-3167127905720696155L);
   private static long de = Long.reverse(3170534137668829184L);
   private static int bh = Integer.reverse(-268435456);
   private static long hg = Long.reverse(-3167127905720696155L);
   private static long iy = Long.reverse(3170534137668829184L);
   private static long ic = Long.reverse(-573054520355290459L);
   private static int aj = Integer.reverse(268435456);
   private static int p = 4 >>> 130 | 4 << ~130 + 1;
   protected final NLoginType_008 m;
   private static int fn = (0 >>> 149 | 0 << ~149 + 1) & -1;
   private static int dp = Integer.reverse(603979776);
   private static int ep = Integer.reverse(-738197504);
   private static int eb = (20971520 >>> 243 | 20971520 << -243) & -1;
   protected NLoginCore_221 a;
   private static int ad = Integer.reverse(1610612736);
   private static int fu = Integer.reverse(738197504);
   private static long fz = Long.reverse(-573054520355290459L);
   private static long c;
   private static int ev = 0 >>> 19 | 0 << -19;
   private static long gw = Long.reverse(3170534137668829184L);
   private static int jr = Integer.reverse(-1308622848);
   private static long cb = Long.reverse(-3167127905720696155L);
   private static int hn = 1056964608 >>> 56 | 1056964608 << -56;
   private static int at = 0 >>> 39 | 0 << -39;
   private static int ca = Integer.reverse(1744830464);
   private static int jc = Integer.reverse(0);
   private static long it = Long.reverse(-3167127905720696155L);
   private NLoginCore_270 a;
   private static long fr = Long.reverse(-3167127905720696155L);
   private static long er = Long.reverse(3170534137668829184L);
   private static int cf = (786432 >>> 47 | 786432 << -47) & -1;
   private static int v = Integer.reverse(-1);
   private static long em = Long.reverse(-3167127905720696155L);
   private static long ey = Long.reverse(3170534137668829184L);
   private static int fo = (25600 >>> 9 | 25600 << ~9 + 1) & -1;
   private static long ho = Long.reverse(-573054520355290459L);
   private static int fx = (848 >>> 196 | 848 << ~196 + 1) & -1;
   private static int is = Integer.reverse(1644167168);
   private static long ka = Long.reverse(-573054520355290459L);
   private static int iz = (37748736 >>> 83 | 37748736 << -83) & -1;
   private static long bu = Long.reverse(-573054520355290459L);
   private static int ap = Integer.reverse(1342177280);
   private static int ia = Integer.reverse(-2113929216);
   private static long ed = Long.reverse(3170534137668829184L);
   private static long ch = Long.reverse(3170534137668829184L);
   private static int ig = Integer.reverse(0);
   private static int go = Integer.reverse(0);
   private static int by = Integer.reverse(-1476395008);
   private static long h = Long.reverse(-573054520355290459L);
   private static int ge = Integer.reverse(0);
   private static int ik = 0 >>> 110 | 0 << ~110 + 1;
   private static long gn = Long.reverse(3170534137668829184L);
   private static long dw = Long.reverse(-3167127905720696155L);
   private static int cn = (14155776 >>> 51 | 14155776 << ~51 + 1) & -1;
   private static long ar = Long.reverse(3170534137668829184L);
   private static int jm = Integer.reverse(0);
   private static long ek = Long.reverse(-573054520355290459L);
   private static int ew = Integer.reverse(-1275068416);
   private static int dy = 1248 >>> 197 | 1248 << ~197 + 1;
   private static int bo = 75497472 >>> 246 | 75497472 << -246;
   private static int ay = (-1 >>> 35 | -1 << ~35 + 1) & -1;
   private static int hb = (4 >>> 226 | 4 << -226) & -1;
   private static int bt = Integer.reverse(-1);
   private static long dk = Long.reverse(-3167127905720696155L);
   private static int fg = Integer.reverse(-1);
   private static int bk = Integer.reverse(134217728);
   private static long gz = Long.reverse(2738188573441261568L);
   private static long gj = Long.reverse(-573054520355290459L);
   private static long hh = Long.reverse(3170534137668829184L);
   private static long gv = Long.reverse(-3167127905720696155L);
   private static int hc = Integer.reverse(0);
   private static long bd = Long.reverse(3170534137668829184L);
   private static long fh = Long.reverse(-573054520355290459L);
   private static int f = '耀' >>> 'O' | 32768 << ~79 + 1;
   private static String[] ZKM_STR_B = new String[jx];
   private static int cl = Integer.reverse(-1);
   private static int cd = Integer.reverse(-402653184);
   private static long gg = Long.reverse(-3167127905720696155L);
   private static int u = Integer.reverse(536870912);
   private static long aw = Long.reverse(-573054520355290459L);
   private static int jq = (0 >>> 187 | 0 << -187) & -1;
   private static long jl = Long.reverse(-573054520355290459L);
   private static int dg = Integer.reverse(-1);
   private static long cs = Long.reverse(3170534137668829184L);
   private static int hx = 16 >>> 190 | 16 << ~190 + 1;
   private static double hm = Double.longBitsToDouble(Long.reverse(39426L));
   private static int ez = (23 >>> 191 | 23 << ~191 + 1) & -1;
   private static long fv = Long.reverse(-3167127905720696155L);
   private static long cg = Long.reverse(-3167127905720696155L);
   private static long eu = Long.reverse(-573054520355290459L);
   private static int gl = 29184 >>> 233 | 29184 << -233;
   private static int iw = 290816 >>> 12 | 290816 << ~12 + 1;
   private static int gk = Integer.reverse(0);
   private static int di = 0 >>> 37 | 0 << -37;
   private static int et = (-1 >>> 78 | -1 << ~78 + 1) & -1;
   private static long dq = Long.reverse(-3167127905720696155L);
   private static int io = (0 >>> 121 | 0 << -121) & -1;
   private static int ac = (8 >>> 99 | 8 << -99) & -1;
   private static int cx = -1 >>> 179 | -1 << -179;
   private static long dr = Long.reverse(3170534137668829184L);
   private static long jb = Long.reverse(3170534137668829184L);
   private static long en = Long.reverse(3170534137668829184L);
   private static long im = Long.reverse(-3167127905720696155L);
   private static int fq = Integer.reverse(-872415232);

   protected void e(String var1, String var2, String var3) {
      String var10000 = a(k & l, m);
      Object[] var10001 = new Object[n];
      var10001[o] = this.a.getName();
      var10001[p] = var2;
      var10001[q] = var3 != null ? a(r, s ^ t) + var3 + a(u & v, w) : a(x, y ^ z);
      var10001[aa] = var1;
      NLoginCore_370.c(var10000, var10001);
   }

   @Generated
   public boolean G() {
      return this.A;
   }

   static {
      b();
   }

   public static void b(NLoginType_008 var0) {
      NLoginCore_479[] var1 = NLoginCore_479.values();
      int var2 = var1.length;

      for (int var3 = ha; var3 < var2; var3++) {
         NLoginCore_479 var4 = var1[var3];

         try {
            Class var10000 = NLoginCore_479.a(var4);
            Class[] var10001 = new Class[hb];
            var10001[hc] = NLoginType_008.class;
            Constructor var5 = var10000.getConstructor(var10001);
            Object[] var7 = new Object[hd];
            var7[he] = var0;
            var5.newInstance(var7);
         } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException var6) {
            NLoginCore_370.c(a(hf, hg ^ hh) + var4.getName() + a(hi, hj ^ hk), var6);
         }
      }
   }

   protected void a(String var1, String var2, @Nullable String var3, @Nullable UUID var4, @Nullable UUID var5) {
      this.a(var1, var2, var3, var4, var5, null);
   }

   private static String a(int var0, long var1) {
      var1 ^= 52L;
      var1 ^= -6374108228471401042L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(51 + 18),
                     (byte)(79 + 4),
                     (byte)(14 + 33),
                     (byte)(2 + 65),
                     (byte)(30 + 36),
                     (byte)(9 + 58),
                     (byte)(24 + 23),
                     (byte)(63 + 17),
                     (byte)(48 + 27),
                     (byte)(66 + 1),
                     83,
                     (byte)(18 + 35),
                     (byte)(11 + 69),
                     (byte)(72 + 25),
                     (byte)(26 + 74),
                     (byte)(51 + 49),
                     (byte)(80 + 25),
                     (byte)(23 + 87),
                     (byte)(74 + 29)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࢍ࢙ࢌࢪࢱࢩࢡࢪࢡࢯࢠࢮࢶࢌࢶ", (byte)23, 70));
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

   public NLoginCore_374(NLoginType_008 var1, NLoginCore_479 var2, boolean var3) {
      this.m = var1;
      this.a = var2;
      this.A = var3;
      e.add(this);
   }

   protected void f(String var1) {
      NLoginCore_171 var2 = this.d.a(a(b, d ^ e) + var1 + a(f & g, h));

      try {
         ResultSet var3 = var2.d();
         if (var3.next()) {
            this.j = var3.getInt(j);
         }
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   protected File b() {
      if (this.m.b().a() == NLoginCore_419.d) {
         File var1 = new File(this.m.c().getParentFile(), NLoginCore_479.a(this.a).toLowerCase(Locale.ENGLISH));
         if (var1.exists()) {
            return var1;
         }
      }

      return new File(this.m.c().getParentFile(), NLoginCore_479.a(this.a));
   }

   public void a(NLoginInterface_042 var1, boolean var2) {
      NLoginCore_055 var3 = var1 instanceof NLoginCore_277 ? this.m.a().b((NLoginCore_277)var1).a() : NLoginCore_150.c();
      int var4 = var3 != NLoginCore_055.c && var3 != NLoginCore_055.s ? ei : eh;
      if (a != null) {
         if (var1 != null) {
            NLoginCore_150.a(var1, var4 != 0 ? a(ej, ek) : a(el, em ^ en));
         }
      } else if (!this.isAvailable()) {
         if (var1 != null) {
            NLoginCore_150.a(var1, var4 != 0 ? a(ep, eq ^ er) : a(es & et, eu));
         }
      } else if (NLoginCore_479.a(this.a) != null && this.a != NLoginCore_479.f && this.m.b().j(NLoginCore_479.a(this.a))) {
         if (var1 != null) {
            NLoginCore_150.a(
               var1,
               var4 != 0 ? a(ew, ex ^ ey) + NLoginCore_479.a(this.a) + a(ez, fa ^ fb) : a(fc, fd ^ fe) + NLoginCore_479.a(this.a) + a(ff & fg, fh)
            );
         }
      } else {
         try {
            NLoginCore_459 var5 = this.m.a().a();
            this.a = new NLoginCore_221(var5, fj);
         } catch (SQLException var8) {
            NLoginCore_370.c(a(fk, fl ^ fm), var8);
            if (var1 != null) {
               NLoginCore_150.a(var1, var4 != 0 ? a(fo, fp) : a(fq, fr ^ fs));
            }

            return;
         }

         this.a = new NLoginCore_270();
         if (var4 != 0) {
            NLoginCore_370.c(a(fu, fv ^ fw) + this.a.getName() + a(fx & fy, fz));
            NLoginCore_370.c(a(gb, gc ^ gd));
         } else {
            NLoginCore_370.c(a(gf, gg ^ gh) + this.a.getName() + a(gi, gj));
            NLoginCore_370.c(a(gl, gm ^ gn));
         }

         a = new Thread(() -> {
            boolean var14 = false /* VF: Semaphore variable */;

            label132: {
               try {
                  var14 = true;
                  NLoginCore_519.a(this.m, null, var4);
                  this.b(var1);
                  var14 = false;
                  break label132;
               } catch (Exception var21) {
                  NLoginCore_370.c(a(il, im ^ in) + this.a.getName(), var21);
                  if (var1 != null) {
                     NLoginCore_150.a(var1, var4 ? a(ip, iq ^ ir) : a(is, it ^ iu));
                     var14 = false;
                  } else {
                     var14 = false;
                  }
               } finally {
                  if (var14) {
                     if (this.d != null) {
                        try {
                           this.d.c();
                        } catch (SQLException var16) {
                           NLoginCore_370.c(a(jh, ji) + this.a.getName() + a(jj & jk, jl), var16);
                        }
                     }

                     if (this.a != null) {
                        try {
                           this.a.c();
                        } catch (SQLException var15) {
                           NLoginCore_370.c(a(jn, jo ^ jp), var15);
                        }
                     }

                     a = null;
                     this.b.Z();
                  }
               }

               if (this.d != null) {
                  try {
                     this.d.c();
                  } catch (SQLException var18) {
                     NLoginCore_370.c(a(iw, ix ^ iy) + this.a.getName() + a(iz, ja ^ jb), var18);
                  }
               }

               if (this.a != null) {
                  try {
                     this.a.c();
                  } catch (SQLException var17) {
                     NLoginCore_370.c(a(jd, je ^ jf), var17);
                  }
               }

               a = null;
               this.b.Z();
               return;
            }

            if (this.d != null) {
               try {
                  this.d.c();
               } catch (SQLException var20) {
                  NLoginCore_370.c(a(ia & ib, ic) + this.a.getName() + a(id, ie ^ var_if), var20);
               }
            }

            if (this.a != null) {
               try {
                  this.a.c();
               } catch (SQLException var19) {
                  NLoginCore_370.c(a(ih, ii ^ ij), var19);
               }
            }

            a = null;
            this.b.Z();
         }, a(gp, gq) + this.a.getName() + a(gr, gs ^ gt));
         a.start();
         String var9 = a(gu, gv ^ gw);
         this.b = this.m.b((gx != 0)).a(() -> {
            if (a != null && !a.isInterrupted() && this.j != 0L) {
               double var1x = this.l * hm / this.j;
               String var10001 = a(hn, ho);
               Object[] var10002 = new Object[hp];
               var10002[hq] = NLoginCore_479.b(this.a);
               var10002[hr] = NLoginCore_479.c(this.a);
               var10002[hs] = NLoginCore_112.a(var1x, ht) + hu;
               var10002[hv] = NLoginCore_112.a(this.l, this.j, hw, a(hx, hy));
               var10002[hz] = NLoginCore_112.d(this.l);
               this.g(String.format(var10001, var10002));
            }
         }, gy, gz);
         if (var2) {
            try {
               a.join();
            } catch (InterruptedException var7) {
               NLoginCore_370.a(var7);
            }
         }
      }
   }

   public static void J() {
      if (a != null) {
         a.interrupt();
      }
   }

   protected void a(String var1, String var2, @Nullable String var3, @Nullable UUID var4, @Nullable UUID var5, @Nullable Consumer<ForceRegisterConfig> var6) {
      this.a(var1, var2, var3, var4, var5, (ac != 0), var6);
   }

   protected void a(String var1, String var2, @Nullable String var3, @Nullable UUID var4) {
      this.a(var1, var2, var3, var4, null);
   }

   private static void b() {
      c = -6538854247434801109L;
      long var0 = c ^ -6374108228471401042L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(65 + 3),
               (byte)(60 + 9),
               (byte)(65 + 18),
               (byte)(26 + 21),
               67,
               (byte)(3 + 63),
               (byte)(66 + 1),
               (byte)(24 + 23),
               (byte)(43 + 37),
               (byte)(36 + 39),
               (byte)(43 + 24),
               (byte)(8 + 75),
               (byte)(13 + 40),
               (byte)(4 + 76),
               (byte)(16 + 81),
               (byte)(77 + 23),
               100,
               (byte)(80 + 25),
               (byte)(106 + 4),
               (byte)(50 + 53)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_559.D("ѩҁҥҙ҈ҐҪҰҍҟҧҲҊѰҭҬҩҺ҇ҲқұѸҔҰҎҹѹҰӂғҟ", (byte)42, 68);
               ZKM_STR_B[1] = NLoginCore_183.C("Җ҅ҤѮѾѫҞҐҞ҈Ҭѻ", (byte)42, 67);
               ZKM_STR_B[2] = NLoginCore_241.B("ĚėŀĩĸĢěċĭēĥġłĢĘĸĒřİİėŝŕţĳŝŏĦšŖŖĥŠľũşŤŲŬūŴņľĩįķŲŤĹĽŸŻŬŎľźœřƆĽŀŷſŹƄŸŶśžşƈŉŵƑŰƐŊŹƉŪƓŬƖƌƈŵřƄŴŻŦűƂŧơƢ", (byte)42, 66);
               ZKM_STR_B[3] = NLoginCore_451.E("ԜՀՓՁգՑԣԞ\u0557գԽԮ", (byte)42, 69);
               ZKM_STR_B[4] = NLoginCore_110.D("ҭѼҚҝѽҦҥҫѰҁҬѻ", (byte)42, 68);
               ZKM_STR_B[5] = NLoginCore_004.A("ċĿķħŅōŉČĳĵĲě", (byte)42, 65);
               ZKM_STR_B[6] = NLoginCore_530.B("ĤćĮĦĪĞľĐīģłĔőĤŋīŔĔĲŖŞļřıĝĳŗŁşňľŖĶŗŨĪŅśļųŪşŒĻ", (byte)42, 66);
               ZKM_STR_B[7] = NLoginCore_141.F("ԷԚՁԹԽԱՑԣԾԶՕԧդԷ՞ԾէԧՅթձՌմԮԴՀճչմընԽԼացՒՑլծւՄօ՝Վ", (byte)42, 70);
               ZKM_STR_B[8] = NLoginCore_471.E("ՒԱԛՓԜԱԱՃԞՇԨդըՊԸՖՃՎԽԩԳՄՌլԶԵՅԴԸմյջՙցշՒԼՓՄդՑֈցպքօ\u0558զ\u058cվՎևբւՙ՚", (byte)42, 69);
               ZKM_STR_B[9] = NLoginCore_530.D("ѺҧҟҰґѾ҆ҞҦґҲѵґҍҖҗҺ҆ҴүҊҩҺҰҡҘҕҞҙ҈Ҁҁ", (byte)42, 68);
               ZKM_STR_B[10] = NLoginCore_027.F("ԸԬԫԹՙԱՠՕդՄ՜ՅՅԶԭ\u0557ՊՄ\u0530ՈՆղԹԺ", (byte)42, 70);
               ZKM_STR_B[11] = NLoginCore_092.F("ԮԽՙԳՓԸՀԹԿԠէԵՃՇզԿհԽէԨ՜ՌՊՍիԶՉ՚ԴԳչՕիատՍ՞ղՕՁէՕշՎ", (byte)42, 70);
               ZKM_STR_B[12] = NLoginCore_451.A("ĬĻċĦċŃŇĿŃĭŃēĲŔėĺŒĕŗŏŖľĞğŜļŃĻŧŀĵšŪŬĦťţŉŞţŭŬľĻ", (byte)42, 65);
               ZKM_STR_B[13] = NLoginCore_127.D("ҞҀѼқҁѺѼҒҝҧ҉ҢҷҁѴңһѴҧҲѻҭҜѾ҄ѻҀӀ҂ӃӇҞҽҭҗҹҠҤҬӌҢҳҢӕӈҢҐӒҺӉқҿҩӏҦҧ", (byte)42, 68);
               ZKM_STR_B[14] = NLoginCore_138.B("ĵńŋĎŇĺŏČŌĥĎŏŋŊĺĶŘĘħŝĵŏŜĿĮōıĝşŧĺńŨŖŧōŧŁŤŴŪœŠĻ", (byte)42, 66);
               ZKM_STR_B[15] = NLoginCore_324.A("īĨġĘŌĲčđħŖĶě", (byte)42, 65);
               ZKM_STR_B[16] = NLoginCore_453.B("ĝŁŎŀįĤłŒġōŒŎĊĵĸŇŅĶŗŞīōīšĻřĲĻŢĤĹţŅņŮťŰšĨĩĴŪŤĻ", (byte)42, 66);
               ZKM_STR_B[17] = NLoginCore_453.A("ĝĚĊĽļīĉŔĴŖĞě", (byte)42, 65);
               ZKM_STR_B[18] = NLoginCore_384.E("Ԛԯ՜ԘԶԼԽԴՔըԠԮ", (byte)42, 69);
               ZKM_STR_B[19] = NLoginCore_387.C("Ѻ҂ҊҞҝҀҩҮү҃Ҥѻ", (byte)42, 67);
               ZKM_STR_B[20] = NLoginCore_433.E("ՑԴՐԜԚՠԲԥԵՀԵԣզ\u0558Թ՟Ղ\u0530ՋՒճբԹԺ", (byte)42, 69);
               ZKM_STR_B[21] = NLoginCore_241.D("ҡҤҀҫҫѹҪҮѮҧҰңҶҏүүҗұґҭѾҰҕѽӃҜҺҝҷҖҔҙҺҜҼҙӆҠҋҮҞҞӂҫҳҨҐҖҪҪҸҽҺҿӍӋҲҭӜӟҟӧҶӀ", (byte)42, 68);
               ZKM_STR_B[22] = NLoginCore_076.F("ԼԛՓ՜ԚՌԹԴՀԤՁԮ", (byte)42, 70);
               ZKM_STR_B[23] = NLoginCore_223.C("ҚҨҊѭѽҒҋҋҰҏҶѳ҃ҲҙҵҪғѸѶҐҫҖҝҤѾҲҖӄӅҫҜ", (byte)42, 67);
               ZKM_STR_B[24] = NLoginCore_223.B("ĺňĪčĝĲīīŐįŕĔŗĐėĳĥĬņŉŚŏŏŘŏŢŢňŦŗũĝŖśŞŬłĮŪűıŪıĻ", (byte)42, 66);
               ZKM_STR_B[25] = NLoginCore_127.F("ԟԝԵ՛ՀԼՄՏԤէ\u0557Ԯ", (byte)42, 70);
               ZKM_STR_B[26] = NLoginCore_223.C("ҟ҆ѾҁҎҜѱҮѼѰҴѻ", (byte)42, 67);
               ZKM_STR_B[27] = NLoginCore_223.E("ԚԾԺ\u0557ԹԾԼԿ\u0558Ո՛բԡԿխԻԺԫթ՝ըՏՃ՞ձըԲԵՙՅձ\u0530՝խմժղճՄյ\u0558ռՈօն՚տաչոի\u0590է՜ՙ՚", (byte)42, 69);
               ZKM_STR_B[28] = NLoginCore_575.A("ĿęģďĝĥŁąĭŃŇŒŃĴŗŅįĔĕĽķĠţīĸŤļřĚŝřŨŇŁŤŠņīūĪĬŌĵĻ", (byte)42, 65);
               ZKM_STR_B[29] = NLoginCore_530.D("ҌѺҮҝҨҞҩҥҴѫҵѳҔҢҍҒҹҥ҇җӀҹҒҖҴ҄҃ҳҹѿҺӄҿӋҼӇҙӒ҈ҏӕҡӀқ", (byte)42, 68);
               ZKM_STR_B[30] = NLoginCore_521.D("ҋ҈ҁѸҬҒѭѱ҇ҶҖѻ", (byte)42, 68);
               ZKM_STR_B[31] = NLoginCore_397.A("ěŋĆļłĉőŏĨĳĖĶŐĺŖŖĤśŊĿğĩţŢťĥŦşţľġĺŅĶĸŬŘĨŞłŨİŤĻ", (byte)42, 65);
               ZKM_STR_B[32] = NLoginCore_453.B("ĝĚĊĽļīĉŔĴŖĞě", (byte)42, 66);
               ZKM_STR_B[33] = NLoginCore_427.D("ѧѼҩѥ҃҉Ҋҁҡҵѭѻ", (byte)42, 68);
               ZKM_STR_B[34] = NLoginCore_387.A("ĚĢĪľĽĠŉŎŏģńě", (byte)42, 65);
               ZKM_STR_B[35] = NLoginCore_433.B("ľġĽĉćōğĒĢĭĢĐœŅĦŌįĝĸĿŠŏĦħ", (byte)42, 66);
               ZKM_STR_B[36] = NLoginCore_397.D("ҡҤҀҫҫѹҪҮѮҧҲҁѯҬѸҳҝѽҌҟҰҚҜҢҝҜҶҶҞҦҡҟҤҼҭҾҠӂ҄ҦҨӋҴғҮҖҴӊҔҘҵӒӞӏӍқҟҵҿӢӄҵҦҡ", (byte)42, 68);
               ZKM_STR_B[37] = NLoginCore_201.F("ԼԛՓ՜ԚՌԹԴՀԤՁԮ", (byte)42, 70);
               ZKM_STR_B[38] = NLoginCore_446.E("ԶԘՀա՞Է\u0557ԶԦ՝գՖՉՁՖիԽ՛ձՠՄԼԹԺ", (byte)42, 69);
               ZKM_STR_B[39] = NLoginCore_110.C("җѹҖҊ҇҄үҳҠұүҥѲҦҫҐѮҭҶҐғ҉҆҇", (byte)42, 67);
               ZKM_STR_B[40] = NLoginCore_471.D("ѣқҭ҅ҍҠҩҁѼґҬҘ҆ҫҋҲѶѽҌѿҩҿ҆҇", (byte)42, 68);
               ZKM_STR_B[41] = NLoginCore_384.E(
                  "ՀՍԜԫԟԲ\u0530՞ԹԠԥԵՄ՟ԭՏՄգՀՐՇՔէ\u0530ձՁկյԶ՜ժՊԱՌչԽՌճֆՑռՈցևք\u0557ԿշտՌռ՛կճՐփ֍\u058bոՌռզ֓ռծ֛֘ոռ՛ւպ֏֕դ֡յդե֍֧բ֠ֆ։֊ձ։ղֲֵֹ֖֭֮ո", (byte)42, 69
               );
               ZKM_STR_B[42] = NLoginCore_091.D("҉ѽ҂Ҭ҃ұүҎѯҬҏҏѲҸҶҋҍҷ҈ҮҊҎҏқҷҚҔҴңҖҚҿҭҤҙҸҪҽҺӈҵҢӄӒӉҭӖҪӍӆҵӉҵӠӖӖәӑҝӧҦҹөҵҦҧӚӅҫӃӁӂӃӄӰӠӦӄҳӲӷӺҼӇӭӺӷӝҾӯӃӠӨԇӖӣ", (byte)42, 68);
               ZKM_STR_B[43] = NLoginCore_521.C("ѴҘҏ҉ѮңҒҩҫңѰѩҙҌқҪҪ҈ѼҫҵҊѼҼҽұҸҞӂҜҗҤҥҢҡӈҩҾҪҦӋӈӀӅҠҨӊґҎӝҹұӋӚҫҫҾҷӒһҤӑҽӟҤӍҮӗӥӱұҿӓҭӉҭӮӱӯӺӜӯӕӬӐӯӆӇ", (byte)42, 67);
               ZKM_STR_B[44] = NLoginCore_241.B("ĔĹņĺġĊĭıŋďķŐģĨĬŊĸŌĕĵĴŘĭĭġĹŞņňłķŕŧĶĤńşĹŮĪŝįŰŒĲůĵŶźŜŚƀũšŐřĿĻśœŀņŸƅšƊŗſŠŦňƐťőƌś", (byte)42, 66);
               ZKM_STR_B[45] = NLoginCore_387.A("łĶĿĻĨĻċčĒŎĦĕĶĦōĳĘĕīĵĜŢŃĶĤĵġħňŃĺūŝŌĸŁňŞŏţĲŲĵĻ", (byte)42, 65);
               ZKM_STR_B[46] = NLoginCore_110.B("ĘŃĻōŋĝĤŏģŐĤėĥĪŖœĨľňđĞŋĵĕŏłķńŨňŅŖĴŖĹňŞŐĺĬŀŪĵĻ", (byte)42, 66);
               ZKM_STR_B[47] = NLoginCore_324.D("ѶҁҨҋѮҧ҅қҤ҄ҁҬҁҗ҅ҨґқҫҽҔҽҍҘҎҟӇҏҼҡҸӁ", (byte)42, 68);
               ZKM_STR_B[48] = NLoginCore_091.F("ԕԘՏԼՎԬԸԤԳԨՃՀԹՍ՝ՠթԽ՜բ\u0530ըՏձ\u0558\u0558ՍՔղԹՍհ՞ՊԿԽվՑՃճՅևզՙ՝ֈՈ՜հցր֍ցւՙ՚", (byte)42, 70);
               ZKM_STR_B[49] = NLoginCore_091.F("ԭ՚ՒգՄԱԹՑՙՄեՆԷԷ՛Նըբ\u0530ՈմիՔԬէՙՙթջծսԺԺԸԺ՟՛ԼչՎՀՁսզ՝ջդսխհՋ֊ւլՙ՚", (byte)42, 70);
               ZKM_STR_B[50] = NLoginCore_324.C("҃ѧѼҦѮѨѤѭѳҤҥҭ҂ҘҒҜҔҖѹҠѻѺҔҴҬ҃һ҅ҙӃҞҠӊҢҬһҝҬӅҍӄҾҦӗҳҴҪҘҸӎӋҷӀҵұҷҲӔүӧӒҦҶҵӫҶӞӫӠұӚҪӥӄӧӗӦҲӑӴҵӉӫӹӞӯӆӇ", (byte)42, 67);
               ZKM_STR_B[51] = NLoginCore_076.F("՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ\u0557ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։\u0558՚ն՝ո֙֒ձսդջ։֢֙֡ըտփ֪֭֩\u058b֔ռչպ", (byte)42, 70);
               ZKM_STR_B[52] = NLoginCore_446.C("ҬҟѼѬѺҭѺҮҜҳҥҮұ҅Қ҆ҴҪүҽѶѼҡѺҞҮҢҟҩҚҀңҗҷһӐҡҋҰӀӂӔґқ", (byte)42, 67);
               ZKM_STR_B[53] = NLoginCore_173.E("ՋԴԺԙՏՍՃ\u0558ԢԨՓԮ", (byte)42, 69);
               ZKM_STR_B[54] = NLoginCore_451.F("ԧՒՔՂԼՁԾԯԶԳգԳ՛ՁԣՇիՏիժՋՒմաՑՙՙղՔՌԼԾշԻԸնչՠՍհԿՖշՂրեծֆգՂՊՍՐ֒ՙ՚", (byte)42, 70);
               ZKM_STR_B[55] = NLoginCore_397.D("ҡѶҧѭҙңҢҟѫҲѨҔѵҎѰҨҪҥѵҷ҉ҢҾҺҖҕҎҦҀ҆҉Ҧ", (byte)42, 68);
               ZKM_STR_B[56] = NLoginCore_453.D("ҭ҅ҙѾ҄ҭңҎүѲҬҧҗ҇үҭҖѹҜҐҺ҉҆҇", (byte)42, 68);
               ZKM_STR_B[57] = NLoginCore_091.E("ԼԞ\u0530ՊԟԽՂԷՃՙԡԪԾխԦԺՋխթՎմլԯՍմ\u0558ե՚ՖՒ՛յԸղԸՎՌդՂբՃՇյՔբՌշ՛ւ՞ք՞։լՙ՚", (byte)42, 69);
               ZKM_STR_B[58] = NLoginCore_530.A("ĚŇĠŀĩċĲĝĿįĲě", (byte)42, 65);
               ZKM_STR_B[59] = NLoginCore_427.B("ŅĺĉŎİŀĻŐľĮőōŏıœĲĭŎĐķĴĹĦħ", (byte)42, 66);
               ZKM_STR_B[60] = NLoginCore_453.E("՝Ց՜ՋԮԽՄ՜ՀԷԸՔ՟եիՏՈՁ՚դՊԯԱմՈ\u0557Ձղը՛ՒձԹպԹ՜ԻԽՑփւճՓժ՚նոռգֆցսՌղ֊լւ\u0557\u0557՚ը֖ժ֙յ֙ՠվ֞յ՞֥ֈոֈ֦֙֨֡֏ְֲ֢֪֫֜չպ", (byte)42, 69);
               ZKM_STR_B[61] = NLoginCore_324.B("ċĚģĺıĈĨďĠŐđġŁņřĚĤķĻĬīŌĬŢŕŞĥĽĦŇťŚĵūħŐűńųũŜŮũŐűŚŶŜŒŞŏŨŒſņŇ", (byte)42, 66);
               ZKM_STR_B[62] = NLoginCore_027.F("ԖՎՠԸՀՓ՜ԴԯՄՠՉԤ՞խՁԩլԫԻՓղԹԺ", (byte)42, 70);
               ZKM_STR_B[63] = NLoginCore_446.C("ҪҞҩҘѻҊґҩҍ҄҅ҡҬҲҸҜҕҎҧұҗѼѾӁҕҤҎҿҵҨҟҾ҆Ӈ҆ҩ҈ҊҞӐӏӀҠҷҧӃӅӉҰӓӎӊҙҿӗҹӏҤҤҧҵӣҷӦӂӦҭӋӫӂҫӲӕӅӕӳӦӵӮӜӽӯӸӷөӿӆӇ", (byte)42, 67);
               ZKM_STR_B[64] = NLoginCore_223.B("łČĽĆċĹŐĬĒĩĦě", (byte)42, 66);
               ZKM_STR_B[65] = NLoginCore_433.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 69);
               ZKM_STR_B[66] = NLoginCore_446.B("ČŉĺĆņĐĤĩļŕŔĠŀŇŇňŌįĞĮňŞļŞıŗĸĶŃŠŝŕĤŨňŚļņŬűŐŬŬĻ", (byte)42, 66);
               ZKM_STR_B[67] = NLoginCore_575.A("ĚŇĿŐıĞĦľņıŒčŎĐŐĚŖļŋıřěĬļġśŇŧŁŧĜĶŊģşĩŚńőĳľīŔĴŪĹĳŭŔŅŪĸŰļœŖŐşŖźųźŖŪŘŶŀŽƄƄƒŝŞƉőś", (byte)42, 65);
               ZKM_STR_B[68] = NLoginCore_530.A("ĔĬĶĊĈĭĺŇĎĤŃĿķİħĲŐœřěĸĜŔĻŜšŇťľĦŋŀģĿŠŋŰĺŉļţİţůŨŃŷŷĺŦœŷŉſņŇ", (byte)42, 65);
               ZKM_STR_B[69] = NLoginCore_004.A("ģćĜņĎĈĄčēńŅōĢĸĲļĴĶęŀěĚĴŔŌģśĥĹţľŀŪłŌśĽŌťĭŤŞņŷœŔŊĸŘŮūŗŠŕőŗŒŴŏƇŲņŖŕƋŖžƋƀőźŊƅŤƇŷƆŒűƔŕũƋƙžƏŦŧ", (byte)42, 65);
               ZKM_STR_B[70] = NLoginCore_173.E("՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ\u0557ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։\u0558՚ն՝ո֙֒ձսդջ։֢֙֡ըտփ֪֭֩\u058b֔ռչպ", (byte)42, 69);
               ZKM_STR_B[71] = NLoginCore_173.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 70);
               ZKM_STR_B[72] = NLoginCore_241.C("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵ҄ӈҨҺҜҦӌӑҰӌӌқ", (byte)42, 67);
               ZKM_STR_B[73] = NLoginCore_471.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ\u0557դՆՑԾէՇսՌՆրէ\u0558սՋփՏզթգղթ֍ֆ֍թսի։Փ\u0590֥֗֗հձ֜դծ", (byte)42, 70);
               ZKM_STR_B[74] = NLoginCore_027.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 70);
               ZKM_STR_B[75] = NLoginCore_446.F("ԟ՜ՍԙՙԣԷԼՏըէԳՓ՚՚՛՟ՂԱՁ՛ձՏձՄժՋՉՖճհըԷջ՛խՏՙտքգտտՎ", (byte)42, 70);
               ZKM_STR_B[76] = NLoginCore_201.C("ѺҧҟҰґѾ҆ҞҦґҲѭҮѰҰѺҶҜҫґҹѻҌҜҁһҧӇҡӇѼҖҪ҃ҿ҉ҺҤұғҞҋҴҔӊҙғӍҴҥӊҘӐҜҳҶҰҿҶӚӓӚҶӊҸӖҠӝӤӤӲҽҾөұһ", (byte)42, 67);
               ZKM_STR_B[77] = NLoginCore_453.F("ԼԝԝՊՙՁԟԲԯ\u0558Ց՞ԢԿլաՊծբ\u0530դղԹԺ", (byte)42, 70);
               ZKM_STR_B[78] = NLoginCore_201.D("ҪѪҌҞ҇ѹѺ҅ҵ҈ү҂Ҥҡ҂ҰҖҖҳҭҪү҆҇", (byte)42, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.F("ԜԴ\u0558ՌԻՃ՝գՀՒ՚եԽԣՠ՟՜խԺեՎբճԳզը\u0530ԸջոխԷԼռպՌշծղ\u0557՜՝թՎ", (byte)42, 70);
               ZKM_STR_B[1] = NLoginCore_232.C("ѫҕѦ҃ѽҫ҉ҴҞ҈Ҩѻ", (byte)42, 67);
               ZKM_STR_B[2] = NLoginCore_110.F(
                  "ԭԪՓԼՋԵԮԞՀԦԸԴՕԵԫՋԥլՃՃԪհընՆհբԹմթթԸճՑռղշօտվևՙՑԼՂՊօշՌՐ\u058b֎տաՑ֍զլ֙ՐՓ֊֒\u058c֗\u058b։ծ֑ղ֛՜ֈ֤փ֣՝\u058c֜ս֦տ֛֩֟ֆսֳֵ֧֮ֆ֙ռֶ֫", (byte)42, 70
               );
               ZKM_STR_B[3] = NLoginCore_575.A("ęĭĀĜŌĊļĎĵŏĳŀŏŃņĤŖŘļıĖŏĦħ", (byte)42, 65);
               ZKM_STR_B[4] = NLoginCore_201.F("Տԫԓ՝՝Դ՛ԢԥթՓԮ", (byte)42, 70);
               ZKM_STR_B[5] = NLoginCore_201.E("՝ՕՖԼԵՅՆԝԞ՛ԤԮ", (byte)42, 69);
               ZKM_STR_B[6] = NLoginCore_324.F("ԷԚՁԹԽԱՑԣԾԶՕԧդԷ՞ԾէԧՅթձՏլՄ\u0530ՆժՔղ՛ՑթէկՍՙմՠցֆջչթՎ", (byte)42, 70);
               ZKM_STR_B[7] = NLoginCore_453.A("ĤćĮĦĪĞľĐīģłĔőĤŋīŔĔĲŖŞĹšěġĭŠŦšŕţĪļŦħťŘĻňİīŀľĻ", (byte)42, 65);
               ZKM_STR_B[8] = NLoginCore_110.C("ҟѾѨҠѩѾѾҐѫҔѵұҵҗ҅ңҐқҊѶҀґҙҹ҃҂Ғҁ҅ӁӂӈҦӎӄҟ҉ҠґұҞӕӌүҫҸңӔӎҷҹӉӏҩҦҧ", (byte)42, 67);
               ZKM_STR_B[9] = NLoginCore_138.E("ԭ՚ՒգՄԱԹՑՙՄեԨՄՀՉՊխԹէբԽՒՏՆհՙ՚ՍԵՅԷո", (byte)42, 69);
               ZKM_STR_B[10] = NLoginCore_241.F("ԸԬԫԹՙԱՠՕդՄ՜ԼՂԴԽՉՍԼՋ\u0530կղԹԺ", (byte)42, 70);
               ZKM_STR_B[11] = NLoginCore_173.D("ѻҊҦҀҠ҅ҍ҆ҌѭҴ҂ҐҔҳҌҽҊҴѵҩҙҗҚҸ҃ҖҧҁҀӆҢҾ҆ӅӅҿӇҩһӃӀҢқ", (byte)42, 68);
               ZKM_STR_B[12] = NLoginCore_027.C("Ҍқѫ҆ѫңҧҟңҍңѳҒҴѷҚҲѵҷүҶҞѾѿҼҜңқӇҠҕӁ҅ҹҬӏҺүӄӍҬҲӀҒҴӐҭҙҗҧҨӎҳӟҦҧ", (byte)42, 67);
               ZKM_STR_B[13] = NLoginCore_453.D("ҞҀѼқҁѺѼҒҝҧ҉ҢҷҁѴңһѴҧҲѻҭҜѾ҄ѻҀӀ҂ӃӇҞҽҭҗҹҠҤҬӌҢҳҤҡҭӆӕҪӉӝӈҪҲӟҦҧ", (byte)42, 68);
               ZKM_STR_B[14] = NLoginCore_141.B("ĵńŋĎŇĺŏČŌĥĎŏŋŊĺĶŘĘħŝĵŏŜĿĮōıĝşŧĺńřņŭŉİťňľţŤŰķŔźŒŜŜŬņŭşŉņŇ", (byte)42, 66);
               ZKM_STR_B[15] = NLoginCore_530.E("ԯԙԠՎԱԭԛԯ\u0558\u0530ԨԮ", (byte)42, 69);
               ZKM_STR_B[16] = NLoginCore_324.F("\u0530ՔաՓՂԷՕեԴՠեաԝՈՋ՚\u0558ՉժձԾՠԾմՎլՅՎյԷՌնս՞ՀտՋՃՁՓ՞պշՎ", (byte)42, 70);
               ZKM_STR_B[17] = NLoginCore_092.C("ѺҁҏҧҐүҍҦѫ҃ѱѻ", (byte)42, 67);
               ZKM_STR_B[18] = NLoginCore_232.B("ĂĭĊŃĬııđŒōňě", (byte)42, 66);
               ZKM_STR_B[19] = NLoginCore_446.B("ŁĹĦĢŇĐĻĩĭŎňě", (byte)42, 66);
               ZKM_STR_B[20] = NLoginCore_141.B("ľġĽĉćōğĒĢĭĤčďńőŅĪĚĮŕĶşĦħ", (byte)42, 66);
               ZKM_STR_B[21] = NLoginCore_530.D("ҡҤҀҫҫѹҪҮѮҧҰңҶҏүүҗұґҭѾҰҕѽӃҜҺҝҷҖҔҙҺҜҼҙӆҠҋҮҞҞӂҫҳҨҐҖҪҪҸҽҺӁӣҚҲҞҹӧӒҺҷҧ", (byte)42, 68);
               ZKM_STR_B[22] = NLoginCore_451.D("ѪҡѭҤ҄ҎѨґҀѾѱҎѷ҃ҬҌґҬҐҞҊү҆҇", (byte)42, 68);
               ZKM_STR_B[23] = NLoginCore_446.A("ĺňĪčĝĲīīŐįŖēģŒĹŕŊĳĘĖİľĿĳĢŅĜŏłũĶŀŌľŁŮŉŞļũįĬĭĻ", (byte)42, 65);
               ZKM_STR_B[24] = NLoginCore_575.F("Ս՛ԽԠ\u0530ՅԾԾգՂըԧժԣԪՆԸԿՙ՜խբբիբյյ՛չժռ\u0530՛ժԿ՛նՔ՜՜չթջՎ", (byte)42, 70);
               ZKM_STR_B[25] = NLoginCore_004.D("ѦѷѫҰҭ҄ҦѳҴҌҎѻ", (byte)42, 68);
               ZKM_STR_B[26] = NLoginCore_076.B("ĝķĭċčĦċľňĳĶě", (byte)42, 66);
               ZKM_STR_B[27] = NLoginCore_530.F("ԚԾԺ\u0557ԹԾԼԿ\u0558Ո՛բԡԿխԻԺԫթ՝ըՏՃ՞ձըԲԵՙՅձ\u0530՝խմժղճՄյ\u0558ռՉյՂզեօ՜ջժ֑և՜֒ւճց֕֔ոշ֘ջ", (byte)42, 70);
               ZKM_STR_B[28] = NLoginCore_471.A("ĿęģďĝĥŁąĭŃŇŒŃĴŗŅįĔĕĽķĠţīĸŤļřĚŝřŨĴŦħĮššůţņŢŁĲŮťůŴŚŅňũźſņŇ", (byte)42, 65);
               ZKM_STR_B[29] = NLoginCore_387.C("ҌѺҮҝҨҞҩҥҴѫҵѳҔҢҍҒҹҥ҇җӀҹҒҖҴ҄҃ҳҹѿҺӄҸ҆҆һ҆҉ҟҝҔӈҞқ", (byte)42, 67);
               ZKM_STR_B[30] = NLoginCore_091.F("՟ԽՔգԚբԷՓգՠԨԮ", (byte)42, 70);
               ZKM_STR_B[31] = NLoginCore_241.C("ѻҫѦҜҢѩұү҈ғѶҖҰҚҶҶ҄һҪҟѿ҉ӃӂӅ҅ӆҿӃҞҁҚ҂ҦҎӎӎҌҿӏӈҴҍқ", (byte)42, 67);
               ZKM_STR_B[32] = NLoginCore_091.D("ҠѣѦѩѻҧ҅ҪѰҴҤѻ", (byte)42, 68);
               ZKM_STR_B[33] = NLoginCore_138.C("҇ҀѮѷҀҭҚғҭҌѾѻ", (byte)42, 67);
               ZKM_STR_B[34] = NLoginCore_451.A("ġńĖĭĩĦŇĭĎċňě", (byte)42, 65);
               ZKM_STR_B[35] = NLoginCore_559.E("ՑԴՐԜԚՠԲԥԵՀԷՆՊաԧՍՐԬՒբծբԹԺ", (byte)42, 69);
               ZKM_STR_B[36] = NLoginCore_004.E("Ք\u0557Գ՞՞Ԭ՝աԡ՚եԴԢ՟ԫզՐ\u0530ԿՒգՍՏՕՐՏթթՑՙՔՒ\u0557կՠձՓյԷՙ՛վէՆաՉէսՇՋըօ֑ֆ՝Ոըբ։։\u058bչ֑֚", (byte)42, 69);
               ZKM_STR_B[37] = NLoginCore_521.C("ҊѾҩҘҡҞ҈ҁ҂ѫҬѻ", (byte)42, 67);
               ZKM_STR_B[38] = NLoginCore_559.E("ԶԘՀա՞Է\u0557ԶԦ՝ե՞ԾԬծ՞ալխԮԲՀեզնախԹՃՔՈժ", (byte)42, 69);
               ZKM_STR_B[39] = NLoginCore_575.E("ՊԬՉԽԺԷբզՓդբՋԼ\u0557թՋբԢձՈՑՁՅՌԲծԲշ՚զթՖ", (byte)42, 69);
               ZKM_STR_B[40] = NLoginCore_076.A("ăĻōĥĭŀŉġĜıŎĠŕĮĺĔĨĹŖőŐŏĦħ", (byte)42, 65);
               ZKM_STR_B[41] = NLoginCore_027.B("ĭĺĉĘČğĝŋĦčĒĢıŌĚļıŐĭĽĴŁŔĝŞĮŜŢģŉŗķĞĹŦĪĹŠųľũĵŮŴűńĬŤŬĹũňŜŠĽŰźŸťĹũœƀũśƅƈťũňůŧżƂőƎŢőŒźƔŏƍųŶųƁšƄƆƞƗƨſƟƆ", (byte)42, 66);
               ZKM_STR_B[42] = NLoginCore_384.A("ĩĝĢŌģőŏĮďŌįįĒŘŖīĭŗĨŎĪĮįĻŗĺĴŔŃĶĺşōńĹŘŊŝŚŨŕłŤŲũōŶŊŭŦŕũŕƀŶŶŹűĽƇņřƉŕņŇźťŋţšŢţŤƐƀƆŤœƒƗƚŜŧƍƛƙƑŤžƒţŨŢƩƕ", (byte)42, 65);
               ZKM_STR_B[43] = NLoginCore_471.C("ѴҘҏ҉ѮңҒҩҫңѰѩҙҌқҪҪ҈ѼҫҵҊѼҼҽұҸҞӂҜҗҤҥҢҡӈҩҾҪҦӋӈӀӅҠҨӊґҎӝҹұӋӚҫҫҾҷӒһҤӑҽӟҤӍҮӗӥӱұҿӓҭӈӐӉӄӑӫӵӨӷөӾӉӆӇ", (byte)42, 67);
               ZKM_STR_B[44] = NLoginCore_004.E("ԧՌՙՍԴԝՀՄ՞ԢՊգԶԻԿ՝Ջ՟ԨՈՇիՀՀԴՌձՙ՛ՕՊըպՉԷ\u0557ղՌցԽհՂփեՅւՈ։֍կխ֓ռմգլՒՎծզՓՙ\u058b֘և֏֠ն֔ց֣ճ֒ջդծ", (byte)42, 69);
               ZKM_STR_B[45] = NLoginCore_427.F("ՕՉՒՎԻՎԞԠԥաԹԨՉԹՠՆԫԨԾՈԯյՖՉԷՈԴԺ՛ՖՍվռսԹւԵօրԸՔՔեչեչէլՇաի՝֔՜ՙ՚", (byte)42, 70);
               ZKM_STR_B[46] = NLoginCore_471.B("ĘŃĻōŋĝĤŏģŐĤėĥĪŖœĨľňđĞŋĵĕŏłķńŨňŅŖľŠŘįħŰŧűŅŭŃıůŌŷňŇŅŉũĺřņŇ", (byte)42, 66);
               ZKM_STR_B[47] = NLoginCore_091.A("ĖġňīĎŇĥĻńĤġŌġķĥňıĻŋŝĴŐİŐĸŝĥŨĨţņš", (byte)42, 65);
               ZKM_STR_B[48] = NLoginCore_387.F("ԕԘՏԼՎԬԸԤԳԨՃՀԹՍ՝ՠթԽ՜բ\u0530ըՏձ\u0558\u0558ՍՔղԹՍհ՞ՊԿԽվՑՃճՅևեա\u058b֊ց։Վե։տՉՔՑկՎ֔հօՍՕսի", (byte)42, 70);
               ZKM_STR_B[49] = NLoginCore_183.A("ĚŇĿŐıĞĦľņıŒĳĤĤňĳŕŏĝĵšŘŁęŔņņŖŨśŪħħĥħŌňĩŦĻĭĮūŔŕŮŪńŕőőůžſņŇ", (byte)42, 65);
               ZKM_STR_B[50] = NLoginCore_471.C("҃ѧѼҦѮѨѤѭѳҤҥҭ҂ҘҒҜҔҖѹҠѻѺҔҴҬ҃һ҅ҙӃҞҠӊҢҬһҝҬӅҍӄҾҦӗҳҴҪҘҸӎӋҷӀҵұҷҲӔүӧӒҦҶҵӫҶӞӫӠұӚҪӥӄӤҩәӐҳҶӻһӪҸҿӿӆӇ", (byte)42, 67);
               ZKM_STR_B[51] = NLoginCore_004.E(
                  "՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ\u0557ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։\u0558՚ն՝ո֙֒ձսդջ։֚յս\u058b֟զպ֚֊ծ֍֒յ֤ձփ\u058cպֲִ֛֗", (byte)42, 69
               );
               ZKM_STR_B[52] = NLoginCore_183.E("՟ՒԯԟԭՠԭաՏզ\u0558ադԸՍԹէ՝բհԩԯՔԭՑաՕՒ՜ՍԳՖի՝Ի՟՞ՄՏՀ\u0558ո\u0558՞ՠջ՝նՇՂֆէցւՙ՚", (byte)42, 69);
               ZKM_STR_B[53] = NLoginCore_232.B("ĜĪęğČńĈōņĔĢě", (byte)42, 66);
               ZKM_STR_B[54] = NLoginCore_559.B("ĔĿŁįĩĮīĜģĠŐĠňĮĐĴŘļŘŗĸĿšŎľņņşŁĹĩīŤĨĥţŦōĺŝĬŃŦĳŭŌĺŴŅŊŎĿĸĸžŌŘŽŖųŖŉŇŁ", (byte)42, 66);
               ZKM_STR_B[55] = NLoginCore_127.C("ҡѶҧѭҙңҢҟѫҲѨҔѵҎѰҨҪҥѵҷ҉ҟҗҢҖѽҲҷқ҉қҖ", (byte)42, 67);
               ZKM_STR_B[56] = NLoginCore_384.C("ҭ҅ҙѾ҄ҭңҎүѲҬҘҁҎғ҃҈Ҝҭҽҋҿ҆҇", (byte)42, 67);
               ZKM_STR_B[57] = NLoginCore_530.C("҉ѫѽҗѬҊҏ҄ҐҦѮѷҋҺѳ҇ҘҺҶқӁҹѼҚӁҥҲҧңҟҨӂ҅ҿ҅қҙұҏүҐҔӀӖӋҩҹҘӖӊӘӏӊҠӔӘҿҹҤӕҾӧӟӖ", (byte)42, 67);
               ZKM_STR_B[58] = NLoginCore_446.E("ԜԻՔԾԯԝաԳէԳԴթՋ՞ՙ՚ԥթբՎճՌԹԺ", (byte)42, 69);
               ZKM_STR_B[59] = NLoginCore_091.A("ŅĺĉŎİŀĻŐľĮŒİĐłĩŇĺŗėĿŊĩĦħ", (byte)42, 65);
               ZKM_STR_B[60] = NLoginCore_575.B("ŊľŉĸěĪıŉĭĤĥŁŌŒŘļĵĮŇőķĜĞšĵńĮşŕňĿŞĦŧĦŉĨĪľŰůŠŀŗŇţťũŐųŮŪĹşŷřůńńŇŕƃŗƆŢƆōūƋŢŋƒŵťųŸŪŨƛƐƓŹŽųųŷŭŞŭťůƕƤŴƔƬ", (byte)42, 66);
               ZKM_STR_B[61] = NLoginCore_471.F("ԞԭԶՍՄԛԻԢԳգԤԴՔՙլԭԷՊՎԿԾ՟ԿյըձԸՐԹ՚ոխՈվԺգք\u0557ֆռկցջՆտ\u058bրՉՠ֎ւրֆլՙ՚", (byte)42, 70);
               ZKM_STR_B[62] = NLoginCore_397.D("ѣқҭ҅ҍҠҩҁѼґҭҲѴѰҚѳҤҍ҉ѷѷ҉҆҇", (byte)42, 68);
               ZKM_STR_B[63] = NLoginCore_127.B("ŊľŉĸěĪıŉĭĤĥŁŌŒŘļĵĮŇőķĜĞšĵńĮşŕňĿŞĦŧĦŉĨĪľŰůŠŀŗŇţťũŐųŮŪĹşŷřůńńŇŕƃŗƆŢƆōūƋŢŋƒŵťŵŖŗřƔŭƔŜŨŻśŽƐƀŮƎŻƈŵƉƆƉ", (byte)42, 66);
               ZKM_STR_B[64] = NLoginCore_397.F("ՌԨԻՍԮաԵԮգ\u0530ՓԮ", (byte)42, 70);
               ZKM_STR_B[65] = NLoginCore_559.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլյԿՑշհՖբՕձՕԷ", (byte)42, 70);
               ZKM_STR_B[66] = NLoginCore_446.D("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵӀ҄҇Ӑ҆ҹҫӀҝӔӀқ", (byte)42, 68);
               ZKM_STR_B[67] = NLoginCore_471.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ\u0557դՆՑԾէՇսՌՆրէ\u0558սՋփՏզթգղթ֍ֆ֍թսՕսհ՝մ֝ձք֛֟֟ծ", (byte)42, 69);
               ZKM_STR_B[68] = NLoginCore_183.D("ѴҌҖѪѨҍҚҧѮ҄ңҟҗҐ҇ҒҰҳҹѻҘѼҴқҼӁҧӅҞ҆ҫҠ҃ҟӀҫӐҚҩҜӃҐӁӑӊәҬҷӏҗӞҶҒӑӊӏһӦӔҟӚӈөӘ", (byte)42, 68);
               ZKM_STR_B[69] = NLoginCore_232.F("ԶԚԯՙԡԛԗԠԦ\u0557\u0558ՠԵՋՅՏՇՉԬՓԮԭՇէ՟ԶծԸՌնՑՓսՕ՟ծՐ՟ոՀշձՙ֊զէ՝Ջիցվժճըդժեևբ֚օՙթը֞թ֑֞֓դ֍՝֘շ֗ժ֪ս\u058b֚֮֨հժֲ֜չպ", (byte)42, 70);
               ZKM_STR_B[70] = NLoginCore_110.D("ҨѦҧѧ҇ѫҐқҲҮ҂ѵҧҘҦҗѵҾҍұҘҿ҂҃ҤҘҒҷӅҼҔҦҞҕҠӉүҙҚҴҜҝҫӅҸӕҖҔұӏӐӉҳҵұҶӡӞӥҷӀӖҥҧӃҪӅӦӟҾӊұӈӖӥӴӓӄӃӯҴӴӫӕӏӶӷԄӶӭҾәӶӶԂӬ", (byte)42, 68);
               ZKM_STR_B[71] = NLoginCore_453.B("ĚŇĿŐıĞĦľņıŒčŎĐŐĚŖļŋıřġŎœķĳĮŤĲņġœ", (byte)42, 66);
               ZKM_STR_B[72] = NLoginCore_004.E("ԟ՜ՍԙՙԣԷԼՏըէԳՓ՚՚՛՟ՂԱՁ՛ձՏձՄժՋՉՖճհը՛Ջ\u0558\u0557ԵղՕՀջմՑՎ", (byte)42, 69);
               ZKM_STR_B[73] = NLoginCore_553.C("ѺҧҟҰґѾ҆ҞҦґҲѭҮѰҰѺҶҜҫґҹѻҌҜҁһҧӇҡӇѼҖҪ҃ҿ҉ҺҤұғҞҋҴҔӊҙғӍҴҥӊҘӐҜҳҶҰҿҶӚӓӚҶӊӤӂӯүүӌӜӌӄӔӎһ", (byte)42, 67);
               ZKM_STR_B[74] = NLoginCore_471.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԭՊգԵթՅզՈՍՒԺ", (byte)42, 69);
               ZKM_STR_B[75] = NLoginCore_451.D("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵ҇ӅӅҝӄңҚҒҨҔҞқ", (byte)42, 68);
               ZKM_STR_B[76] = NLoginCore_138.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ\u0557դՆՑԾէՇսՌՆրէ\u0558սՋփՏզթգղթ֍ֆ֍թսէնց֘կւ՞֦֔ն֛ծ", (byte)42, 70);
               ZKM_STR_B[77] = NLoginCore_559.D("҉ѪѪҗҦҎѬѿѼҥҖѱҙҗѸҵҌѷҍ҉Ҹ҉҆҇", (byte)42, 68);
               ZKM_STR_B[78] = NLoginCore_173.E("՝ԝԿՑԺԬԭԸըԻՠԸԿԤ՟Ռԫ՝՟ԩէբԹԺ", (byte)42, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.A("ħģġĹŊĽĢīōŃŐě", (byte)42, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.E("Ք\u0558ՑԫԜԴԢԳԦգՂ\u0558՛ՕԸՇԩԢՋ՝զԼԹԺ", (byte)42, 69);
         }
      }
   }

   public NLoginCore_374(NLoginType_008 var1, NLoginCore_479 var2) {
      this(var1, var2, (a != 0));
   }

   private void a(String var1, String var2, @Nullable String var3, @Nullable UUID var4, @Nullable UUID var5, boolean var6, @Nullable Consumer<ForceRegisterConfig> var7) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(ad, ae ^ af));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(a(ag, ah ^ ai));
      } else if (var6 || var7 != null || var2 != null && !var2.isEmpty()) {
         NLoginCore_291 var8 = this.m.a();
         ForceRegisterConfig var9 = var8.a(var1, var5, null, var6);
         if (var9 == null) {
            throw new RuntimeException(a(am, an ^ ao) + var1 + a(ap, aq ^ ar));
         } else {
            if (!var9.h()) {
               if (var9.a() == null) {
                  if (var4 == null) {
                     var4 = NLoginCore_432.d(var1);
                  }

                  var9.a(var4);
               }

               var9.a(var1, var2, null, var3, ((var2 != null && !NLoginCore_479.a(this.a) != 0) ? as : at));
               if (var5 != null) {
                  var9.b(var5);
               } else if (var6) {
                  var9.z();
               } else {
                  var9.x();
               }

               if (var7 != null) {
                  var7.accept(var9);
               }

               if (var8.a(this.a, var9)) {
                  this.k++;
               }
            }
         }
      } else {
         throw new IllegalArgumentException(a(aj, ak ^ al));
      }
   }

   private void g(String var1) {
      if (NLoginCore_477.aj.ar()) {
         NLoginCore_187 var2 = this.m.a();
         this.m.b().c().stream().filter(var1x -> ((var2.b(var1x) != 0) && var1x.i(a(jr & js, jt)) ? ju : jv)).forEach(var1x -> var1x.o(var1));
      }
   }

   protected abstract void b(NLoginInterface_042 var1);

   protected void c(NLoginInterface_042 var1) {
      String var2 = NLoginCore_112.d(this.k);
      String var3 = this.a.aq();
      if (NLoginCore_150.j()) {
         NLoginCore_370.e(a(av, aw) + this.a.getName() + a(ax & ay, az));
         NLoginCore_370.e(
            (this.k == 0L ? a(bb, bc ^ bd) : (this.k == 1L ? a(be, bf ^ bg) : a(bh, bi ^ bj) + var2 + a(bk, bl)))
               + a(bm, bn)
               + var3
               + a(bo, bp ^ bq)
         );
         this.g(
            a(bs & bt, bu)
               + NLoginCore_479.b(this.a)
               + a(bv, bw ^ bx)
               + NLoginCore_479.c(this.a)
               + a(by, bz)
               + var2
               + a(ca, cb ^ cc)
               + (this.k == 1L ? a(cd, ce) : a(cf, cg ^ ch))
               + a(ci, cj)
         );
      } else {
         NLoginCore_370.e(a(ck & cl, cm) + this.a.getName() + a(cn, co));
         NLoginCore_370.e(
            (this.k == 0L ? a(cq, cr ^ cs) : (this.k == 1L ? a(ct & cu, cv) : a(cw & cx, cy) + var2 + a(cz, da ^ db)))
               + a(dc, dd ^ de)
               + var3
               + a(df & dg, dh)
         );
         this.g(
            a(dj, dk ^ dl)
               + NLoginCore_479.b(this.a)
               + a(dm, dn ^ var_do)
               + NLoginCore_479.c(this.a)
               + a(dp, dq ^ dr)
               + var2
               + a(ds, dt ^ du)
               + (this.k == 1L ? a(dv, dw ^ dx) : a(dy, dz ^ ea))
               + a(eb, ec ^ ed)
         );
      }
   }

   protected void a(String var1, String var2, @Nullable String var3, @Nullable UUID var4, @Nullable Consumer<ForceRegisterConfig> var5) {
      this.a(var1, var2, var3, var4, null, (ab != 0), var5);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_374.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.D("ҋҭүҏҳӒӊӠӌқәӏӝӗҠӅӧӦӞӤӞҳ", (byte)58, 68), NLoginCore_374.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.A("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲҭҹҬӊӑӉӁӊӁӏӀӎӖҬӖō", (byte)58, 65) + var1 + NLoginCore_553.E("\u0530", (byte)58, 69) + var2.toString(), var4
         );
      }
   }

   public void d(NLoginInterface_042 var1) {
      this.a(var1, (eg != 0));
   }

   public boolean isAvailable() {
      return ((!this.a.H() != 0) && !this.b().exists() ? ef : ee);
   }
}
