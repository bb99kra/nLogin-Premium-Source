package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_316 {
   private static int m = 268435456 >>> 252 | 268435456 << -252;
   private static int ek = Integer.reverse(-2080374784);
   private static long gt = Long.reverse(1504747384912292768L);
   private static int br = 0 >>> 182 | 0 << ~182 + 1;
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static int t = (256 >>> 166 | 256 << -166) & -1;
   private static int as = (294912 >>> 111 | 294912 << ~111 + 1) & -1;
   private static long cf = Long.reverse(6981124531794815904L);
   private static int gf = (0 >>> 62 | 0 << -62) & -1;
   private static long gy = Long.reverse(8358680908399640576L);
   private static long ab = Long.reverse(1504747384912292768L);
   private static long ge = Long.reverse(8358680908399640576L);
   private final NLoginCore_208 f;
   private static int de = Integer.reverse(1476395008);
   private static long ca = Long.reverse(8358680908399640576L);
   private static long gx = Long.reverse(1504747384912292768L);
   private static int dg = 64 >>> 38 | 64 << -38;
   private static long ai = Long.reverse(8358680908399640576L);
   private static int eu = (1610612740 >>> 29 | 1610612740 << -29) & -1;
   private static int gg = (0 >>> 90 | 0 << -90) & -1;
   private static long ft = Long.reverse(6981124531794815904L);
   private static int fj = Integer.reverse(Integer.MIN_VALUE);
   private static int eg = 1073741824 >>> 25 | 1073741824 << -25;
   private static int ep = Integer.reverse(1140850688);
   private static int es = Integer.reverse(Integer.MIN_VALUE);
   private static int fu = 0 >>> 152 | 0 << -152;
   private static long bz = Long.reverse(1504747384912292768L);
   private static long v = Long.reverse(8358680908399640576L);
   private static int dz = Integer.reverse(0);
   private static long dc = Long.reverse(6981124531794815904L);
   private static int be = -2147483642 >>> 127 | -2147483642 << -127;
   private static int da = 0 >>> 158 | 0 << ~158 + 1;
   private static long l = Long.reverse(8358680908399640576L);
   private static long dm = Long.reverse(1504747384912292768L);
   private static int db = Integer.reverse(-1744830464);
   private static int bv = Integer.reverse(0);
   private static long fp = Long.reverse(8358680908399640576L);
   private static int ej = 16777216 >>> 120 | 16777216 << ~120 + 1;
   private static int ex = Integer.reverse(0);
   private static int eb = Integer.reverse(0);
   private static int by = (8 >>> 223 | 8 << ~223 + 1) & -1;
   private static int e = 512 >>> 41 | 512 << -41;
   private static int gp = (0 >>> 191 | 0 << ~191 + 1) & -1;
   private static long bd = Long.reverse(6981124531794815904L);
   private static int dx = (31 >>> 224 | 31 << -224) & -1;
   private static int hb = -1140850688 >>> 218 | -1140850688 << ~218 + 1;
   private static long dn = Long.reverse(8358680908399640576L);
   private static int et = Integer.reverse(0);
   private static long ao = Long.reverse(8358680908399640576L);
   private static int fs = Integer.reverse(-1);
   private static long dr = Long.reverse(8358680908399640576L);
   private static int bl = (0 >>> 107 | 0 << ~107 + 1) & -1;
   private static int ec = Integer.reverse(Integer.MIN_VALUE);
   private static long ba = Long.reverse(8358680908399640576L);
   private static int fv = Integer.reverse(0);
   private static int ee = Integer.reverse(Integer.MIN_VALUE);
   private static int s = 0 >>> 148 | 0 << ~148 + 1;
   private static int y = Integer.reverse(0);
   private static int eh = -1 >>> 195 | -1 << ~195 + 1;
   private static int dj = Integer.reverse(-1);
   private static int b = Integer.reverse(-1);
   private static int cj = Integer.reverse(0);
   private static int h = (4194304 >>> 150 | 4194304 << -150) & -1;
   private static int gn = Integer.reverse(-1);
   private static long g = Long.reverse(8358680908399640576L);
   private static long q = Long.reverse(8358680908399640576L);
   private static long cw = Long.reverse(8358680908399640576L);
   private static int gl = Integer.reverse(0);
   private static int el = (-1 >>> 59 | -1 << -59) & -1;
   private static long em = Long.reverse(6981124531794815904L);
   private static int aw = Integer.reverse(-1);
   private static int dl = (29360128 >>> 212 | 29360128 << ~212 + 1) & -1;
   private static int fr = Integer.reverse(335544320);
   private static int ds = (512 >>> 136 | 512 << ~136 + 1) & -1;
   private static long cq = Long.reverse(8358680908399640576L);
   private static long cd = Long.reverse(8358680908399640576L);
   private static int w = 2048 >>> 75 | 2048 << -75;
   private static long go = Long.reverse(6981124531794815904L);
   private static int gv = (0 >>> 104 | 0 << -104) & -1;
   private static long bq = Long.reverse(8358680908399640576L);
   private static int x = Integer.reverse(0);
   private static int dd = Integer.reverse(0);
   private static long cc = Long.reverse(1504747384912292768L);
   private final NLoginCore_208 d;
   private static int a = Integer.reverse(0);
   private static int ar = (524288 >>> 179 | 524288 << ~179 + 1) & -1;
   private static long ac = Long.reverse(8358680908399640576L);
   private static long au = Long.reverse(8358680908399640576L);
   private static int dt = Integer.reverse(0);
   private static long ct = Long.reverse(8358680908399640576L);
   private static int cy = Integer.reverse(-1);
   private final NLoginCore_219 e;
   private final NLoginCore_208 g;
   private static int bt = Integer.reverse(0);
   private static int en = (0 >>> 145 | 0 << -145) & -1;
   private static long fc = Long.reverse(1504747384912292768L);
   private static int fw = Integer.reverse(0);
   private static int gm = 352 >>> 131 | 352 << ~131 + 1;
   private static int dh = (0 >>> 242 | 0 << ~242 + 1) & -1;
   private static long dv = Long.reverse(1504747384912292768L);
   private static long p = Long.reverse(1504747384912292768L);
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static long u = Long.reverse(1504747384912292768L);
   private static int aq = Integer.reverse(0);
   private static int cn = Integer.reverse(0);
   private static long an = Long.reverse(1504747384912292768L);
   private static int gi = -1409286144 >>> 26 | -1409286144 << ~26 + 1;
   private static int ez = 0 >>> 13 | 0 << ~13 + 1;
   private static int ey = (0 >>> 69 | 0 << ~69 + 1) & -1;
   private static long bg = Long.reverse(8358680908399640576L);
   private static int r = 4194304 >>> 86 | 4194304 << -86;
   private static long cm = Long.reverse(8358680908399640576L);
   private static int ae = Integer.reverse(0);
   private static long al = Long.reverse(6981124531794815904L);
   private static int fk = Integer.reverse(0);
   private static long dk = Long.reverse(6981124531794815904L);
   private static int ak = -1 >>> 252 | -1 << ~252 + 1;
   private static int aj = (114688 >>> 206 | 114688 << ~206 + 1) & -1;
   private static int fm = (8 >>> 67 | 8 << -67) & -1;
   private static long gu = Long.reverse(8358680908399640576L);
   private static long at = Long.reverse(1504747384912292768L);
   private static String[] ZKM_STR_B = new String[hb];
   private static long fd = Long.reverse(8358680908399640576L);
   private static int gq = 0 >>> 127 | 0 << -127;
   private static long cp = Long.reverse(1504747384912292768L);
   private static long ci = Long.reverse(8358680908399640576L);
   private static long ew = Long.reverse(8358680908399640576L);
   private static long ev = Long.reverse(1504747384912292768L);
   private static int fa = Integer.reverse(0);
   private static long d = Long.reverse(6981124531794815904L);
   private static long ga = Long.reverse(8358680908399640576L);
   private static long gd = Long.reverse(1504747384912292768L);
   private static int av = (81920 >>> 173 | 81920 << ~173 + 1) & -1;
   private static int fg = 304 >>> 131 | 304 << -131;
   private static int bh = 7340032 >>> 179 | 7340032 << -179;
   private static long ah = Long.reverse(1504747384912292768L);
   private static long bj = Long.reverse(8358680908399640576L);
   private static long cv = Long.reverse(1504747384912292768L);
   private static int cr = 2816 >>> 199 | 2816 << ~199 + 1;
   private static int j = 256 >>> 167 | 256 << -167;
   private static int ef = (0 >>> 144 | 0 << -144) & -1;
   private static int gc = Integer.reverse(1409286144);
   private static int n = Integer.reverse(0);
   private static int eo = 1048576 >>> 84 | 1048576 << -84;
   private static int bu = (8 >>> 195 | 8 << -195) & -1;
   private static long ch = Long.reverse(1504747384912292768L);
   private static int fl = 0 >>> 25 | 0 << -25;
   private static long eq = Long.reverse(1504747384912292768L);
   private static int fe = 4736 >>> 7 | 4736 << ~7 + 1;
   private static long dw = Long.reverse(8358680908399640576L);
   private static long dy = Long.reverse(6981124531794815904L);
   private static int gz = Integer.reverse(0);
   private static int cg = 4864 >>> 232 | 4864 << -232;
   private static int du = (15728640 >>> 19 | 15728640 << ~19 + 1) & -1;
   private static int dp = Integer.reverse(-1207959552);
   private static int ck = 640 >>> 5 | 640 << -5;
   private static int gh = (0 >>> 71 | 0 << ~71 + 1) & -1;
   private static int bo = Integer.reverse(-268435456);
   private static long ei = Long.reverse(6981124531794815904L);
   private static long ax = Long.reverse(6981124531794815904L);
   private static long c;
   private static long az = Long.reverse(1504747384912292768L);
   private static int fq = (0 >>> 198 | 0 << -198) & -1;
   private static int var_do = Integer.reverse(Integer.MIN_VALUE);
   private static int gw = (23552 >>> 169 | 23552 << ~169 + 1) & -1;
   private static int fb = Integer.reverse(603979776);
   private static int bs = 32 >>> 197 | 32 << ~197 + 1;
   private static int o = 3 >>> 128 | 3 << ~128 + 1;
   private static long df = Long.reverse(6981124531794815904L);
   private static int ea = Integer.reverse(1073741824);
   private static long cs = Long.reverse(1504747384912292768L);
   private static int ad = 131072 >>> 208 | 131072 << -208;
   private static int fy = 2624 >>> 198 | 2624 << ~198 + 1;
   private static long fo = Long.reverse(1504747384912292768L);
   private static int bx = 0 >>> 107 | 0 << -107;
   private static long gk = Long.reverse(8358680908399640576L);
   private static int ed = (1073741824 >>> 94 | 1073741824 << ~94 + 1) & -1;
   private static int cb = Integer.reverse(-2013265920);
   private static int ag = Integer.reverse(1610612736);
   private static long cz = Long.reverse(6981124531794815904L);
   private final NLoginCore_208 e;
   private final NLoginCore_055 b;
   private static long fz = Long.reverse(1504747384912292768L);
   private static int ha = (3080192 >>> 144 | 3080192 << ~144 + 1) & -1;
   private static int co = (172032 >>> 173 | 172032 << ~173 + 1) & -1;
   private static long ff = Long.reverse(6981124531794815904L);
   private static int cx = Integer.reverse(402653184);
   private static int ap = (65536 >>> 15 | 65536 << -15) & -1;
   private static int bk = (0 >>> 7 | 0 << ~7 + 1) & -1;
   private static int z = ('耀' >>> 'o' | 32768 << ~111 + 1) & -1;
   private static int bc = Integer.reverse(-1);
   private static int bb = -1073741824 >>> 188 | -1073741824 << -188;
   private static int fx = (16 >>> 68 | 16 << -68) & -1;
   private static long f = Long.reverse(1504747384912292768L);
   private static long fh = Long.reverse(6981124531794815904L);
   private static long dq = Long.reverse(1504747384912292768L);
   private static int am = (256 >>> 229 | 256 << ~229 + 1) & -1;
   private static int cu = Integer.reverse(-402653184);
   private static int ce = (147456 >>> 77 | 147456 << ~77 + 1) & -1;
   private static int ay = Integer.reverse(-805306368);
   private static String[] ZKM_STR_A = new String[ha];
   private static int fn = Integer.reverse(-469762048);
   private static int fi = (0 >>> 232 | 0 << -232) & -1;
   private static int i = 0 >>> 209 | 0 << -209;
   private static int bw = (1073741824 >>> 30 | 1073741824 << ~30 + 1) & -1;
   private static long bi = Long.reverse(1504747384912292768L);
   private static int bn = Integer.reverse(0);
   private static int di = (-1342177279 >>> 124 | -1342177279 << ~124 + 1) & -1;
   private static long k = Long.reverse(1504747384912292768L);
   private static long gj = Long.reverse(1504747384912292768L);
   private static long cl = Long.reverse(1504747384912292768L);
   private static int gr = Integer.reverse(0);
   private static long bp = Long.reverse(1504747384912292768L);
   private static long er = Long.reverse(8358680908399640576L);
   private static int aa = 640 >>> 231 | 640 << ~231 + 1;
   private static long bf = Long.reverse(1504747384912292768L);
   private static int gs = (368640 >>> 109 | 368640 << -109) & -1;
   private static int gb = (0 >>> 78 | 0 << ~78 + 1) & -1;

   public List<String> a(NLoginCore_237 var1, Object... var2) {
      if (!var1.aI) {
         throw new IllegalStateException(var1 + a(be, bf ^ bg));
      } else {
         return var1.a(this.e, var2);
      }
   }

   static {
      b();
   }

   public String a(NLoginCore_237 var1, Object... var2) {
      if (var1.aI) {
         throw new IllegalStateException(var1 + a(bb & bc, bd));
      } else {
         return var1.a(this.e, var2);
      }
   }

   NLoginCore_316(NLoginType_008 var1, NLoginCore_055 var2, String var3) {
      this.b = var2;
      this.e = new NLoginCore_219(new File(var1.c() + File.separator + a(a & b, d), var3));
      String var10003 = a(e, f ^ g);
      Object[] var10004 = new Object[h];
      var10004[i] = var2.cN;
      this.d = new NLoginCore_208(String.format(var10003, var10004), NLoginCore_487.values().length);
      var10003 = a(j, k ^ l);
      var10004 = new Object[m];
      var10004[n] = var2.cN;
      this.e = new NLoginCore_208(String.format(var10003, var10004), NLoginCore_237.values().length);
      var10003 = a(o, p ^ q);
      var10004 = new Object[r];
      var10004[s] = var2.cN;
      this.f = new NLoginCore_208(String.format(var10003, var10004), NLoginCore_508.values().length);
      var10003 = a(t, u ^ v);
      var10004 = new Object[w];
      var10004[x] = var2.cN;
      this.g = new NLoginCore_208(String.format(var10003, var10004), NLoginCore_102.values().length);
      NLoginCore_219 var4 = NLoginCore_272.a(var2.cO, (y != 0));
      NLoginCore_219 var5 = NLoginCore_272.a(var2.cO, (z != 0));
      if (!this.e.r()) {
         if (!this.a(var4, var5)) {
            String var10000 = a(aa, ab ^ ac);
            Object[] var10001 = new Object[ad];
            var10001[ae] = var2.cO;
            var10001[af] = var2;
            NLoginCore_370.d(var10000, var10001);
         }
      } else if (!this.b(var4, var5)) {
         File var6 = NLoginCore_366.a(new File(this.e.d().getParentFile(), var3 + a(ag, ah ^ ai)), NLoginCore_366.c(this.e.d()) + a(aj & ak, al));
         if (!this.e.d().renameTo(var6)) {
            return;
         }

         if (!this.a(var4, var5)) {
            String var7 = a(am, an ^ ao);
            Object[] var8 = new Object[ap];
            var8[aq] = var2.cO;
            var8[ar] = var2;
            NLoginCore_370.d(var7, var8);
         }
      }

      var4.Y();
      var5.Y();
   }

   public String a(NLoginCore_487 var1, Object... var2) {
      if (var1.aJ) {
         throw new IllegalStateException(var1 + a(as, at ^ au));
      } else {
         return var1.a(this.d, var2);
      }
   }

   private boolean b(NLoginCore_219 var1, NLoginCore_219 var2) {
      File var3 = this.e.d();
      NLoginCore_370.b(a(fe, ff) + var3.getName() + a(fg, fh));
      int var4 = fj;
      NLoginCore_487[] var5 = NLoginCore_487.values();
      int var6 = var5.length;

      for (int var7 = fk; var7 < var6; var7++) {
         NLoginCore_487 var8 = var5[var7];

         try {
            this.a(var1, var8);
         } catch (Exception var13) {
            var4 = fl;
            NLoginCore_525.a(var8, this.d, var8.o, (fm != 0));
            NLoginCore_370.c(a(fn, fo ^ fp) + var8.f.a()[fq] + a(fr & fs, ft) + var3.getName(), var13);
         }
      }

      NLoginCore_237[] var14 = NLoginCore_237.values();
      var6 = var14.length;

      for (int var20 = fv; var20 < var6; var20++) {
         NLoginCore_237 var23 = var14[var20];

         try {
            this.a(var2, var23);
         } catch (Exception var12) {
            var4 = fw;
            NLoginCore_525.a(var23, this.e, var23.a(), (fx != 0));
            NLoginCore_370.c(a(fy, fz ^ ga) + var23.e.a()[gb] + a(gc, gd ^ ge) + var3.getName(), var12);
         }
      }

      NLoginCore_508[] var15 = NLoginCore_508.values();
      var6 = var15.length;

      for (int var21 = gg; var21 < var6; var21++) {
         NLoginCore_508 var24 = var15[var21];

         try {
            this.a(var1, var2, var24);
         } catch (Exception var11) {
            var4 = gh;
            NLoginCore_370.c(a(gi, gj ^ gk) + var24.g.a()[gl] + a(gm & gn, go) + var3.getName(), var11);
         }
      }

      NLoginCore_102[] var16 = NLoginCore_102.values();
      var6 = var16.length;

      for (int var22 = gq; var22 < var6; var22++) {
         NLoginCore_102 var25 = var16[var22];

         try {
            this.a(var1, var2, var25);
         } catch (Exception var10) {
            var4 = gr;
            NLoginCore_370.c(a(gs, gt ^ gu) + var25.d.a()[gv] + a(gw, gx ^ gy) + var3.getName(), var10);
         }
      }

      return (var4 != 0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 1144631305288738075L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(39 + 30),
                     (byte)(78 + 5),
                     (byte)(27 + 20),
                     67,
                     (byte)(48 + 18),
                     67,
                     (byte)(8 + 39),
                     (byte)(11 + 69),
                     (byte)(32 + 43),
                     (byte)(15 + 52),
                     (byte)(27 + 56),
                     (byte)(29 + 24),
                     (byte)(10 + 70),
                     (byte)(12 + 85),
                     (byte)(25 + 75),
                     (byte)(92 + 8),
                     (byte)(43 + 62),
                     (byte)(12 + 98),
                     (byte)(21 + 82)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԜԗԕԪԠԭԆԬԃ", (byte)104, 65));
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

   private void a(NLoginCore_219 var1, NLoginCore_237 var2) {
      if (var2.aI) {
         List var3 = null;
         String[] var4 = var2.e.a();
         int var5 = var4.length;

         for (int var6 = bt; var6 < var5; var6++) {
            String var7 = var4[var6];
            if ((var3 = var1.b(var7, null)) != null) {
               break;
            }
         }

         if (var3 == null || var3.isEmpty()) {
            var3 = (List)var2.a();
         }

         NLoginCore_525.a(var2, this.e, var3, (bu != 0));
      } else {
         String var8 = null;
         String[] var9 = var2.e.a();
         int var10 = var9.length;

         for (int var11 = bv; var11 < var10; var11++) {
            String var12 = var9[var11];
            if ((var8 = var1.b(var12)) != null) {
               break;
            }
         }

         if (var8 == null) {
            var8 = (String)var2.a();
         }

         NLoginCore_525.a(var2, this.e, var8, (bw != 0));
      }
   }

   public NLoginCore_190 a(NLoginCore_102 var1) {
      return var1.b(this.g);
   }

   private static void b() {
      c = 420143546636928808L;
      long var0 = c ^ 1144631305288738075L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(25 + 44),
               83,
               (byte)(12 + 35),
               (byte)(19 + 48),
               (byte)(51 + 15),
               (byte)(8 + 59),
               (byte)(20 + 27),
               (byte)(76 + 4),
               (byte)(68 + 7),
               (byte)(9 + 58),
               83,
               (byte)(25 + 28),
               (byte)(46 + 34),
               (byte)(47 + 50),
               (byte)(11 + 89),
               (byte)(8 + 92),
               (byte)(84 + 21),
               (byte)(102 + 8),
               (byte)(11 + 92)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.A("űĹşœƀŷŴŃŌƃŬŕ", (byte)71, 65);
               ZKM_STR_B[1] = NLoginCore_004.A("ńűŠŠńłƊŚŠŧťŏŲŦŏŴƓŢƕŮƚƉŠš", (byte)71, 65);
               ZKM_STR_B[2] = NLoginCore_110.D("ӁӮӝӝӁҿԇӗӝӤӣԍӷԂӧӱԆԍӴԓӐӶӤӧӵԝӵӰӳӬӼӫ", (byte)71, 68);
               ZKM_STR_B[3] = NLoginCore_453.D("ӁӮӝӝӁҿԇӗӝӤӤԃӤԐӤԄԏӏӶԇӮԖӝӞ", (byte)71, 68);
               ZKM_STR_B[4] = NLoginCore_232.E("ԺէՖՖԺԸրՐՖ՝՚Խ՜աՉՄռն\u0558ըևՙՖ\u0557", (byte)71, 69);
               ZKM_STR_B[5] = NLoginCore_521.F(
                  "էՍնժց՞խծդԷյՐևՁՔիՕԿՈ\u058cՋիՌղթՠ֒հՔ֕ւ֙օլՔ֑ղ֢ն֞ձսցև֢֧֪֝վդխվ֫֡֓ձ֒֔լտւִַֻ֤֯ռַվպִַּֽ֝\u0590֘\u05c8֙֕֩׀֠\u05c8ֽ׀֨\u05cd֝ב\u05c8֢֣\u058b\u05c9לך\u05cb\u05cdז֛\u05caֺֺ֡ו֥֫",
                  (byte)71,
                  70
               );
               ZKM_STR_B[6] = NLoginCore_446.F("ԷՋչ՚ՍբժԽԾՎՎՋ", (byte)71, 70);
               ZKM_STR_B[7] = NLoginCore_384.F("՜ԳՈրչՍմՃՍ\u0558ոՋ", (byte)71, 70);
               ZKM_STR_B[8] = NLoginCore_553.A("űŗƀŴƋŨŷŸŮŁſŚƑŋŞŵşŉŒƖŕŵŖżųŪƜźŞƟƌƣƏŶŞƛżƬƀƨŻƇƋƑƬƧƱƴƈŮŷƈƵƫƝŻƜƞŶƉƌƹƾƮǁǅƆǁƈƄƾƧǇǁǆƚƢǒƣƟƳǊƪǒǇǊƲǗƧǛǒƬƭƕǓǦǤǕǗǠƥǔƫǄǄǟƯƵ", (byte)71, 65);
               ZKM_STR_B[9] = NLoginCore_110.E("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈՑՏ֔տ՞֕֓֒ժՔե", (byte)71, 69);
               ZKM_STR_B[10] = NLoginCore_091.F("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈ֑ՍըՌ֕Ց։֕ծ\u0590ճ", (byte)71, 70);
               ZKM_STR_B[11] = NLoginCore_575.F("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈ֑ՍըՌ֕Ց։֕ծ\u0590ճ", (byte)71, 70);
               ZKM_STR_B[12] = NLoginCore_453.C("ҿҺӢӖӻӧӺӊԉӼӟӫӏӿӃӣԋԕӲԂӏӘӖԛԆӥԜԚԙӱӛӬ", (byte)71, 67);
               ZKM_STR_B[13] = NLoginCore_324.C("ҿҺӢӖӻӧӺӊԉӼӟӫӏӿӃӣԋԕӲԂӏԘӔӯӓԜӘԐԜӵԗӺ", (byte)71, 67);
               ZKM_STR_B[14] = NLoginCore_453.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒƛŗŲŖƟśƓƟŸƚŽ", (byte)71, 66);
               ZKM_STR_B[15] = NLoginCore_127.C("ҵҼӱӾӢԁӗӛӠӠӭӒ", (byte)71, 67);
               ZKM_STR_B[16] = NLoginCore_201.D("ӑӑӱӠӑӳӥӣӃӬӍԄәӟԉԄԀӌӌөԅӢԕӻԕԆӮӲԏԁӹԂԔӱӶԕԙԗөԠԠӫӬӲ", (byte)71, 68);
               ZKM_STR_B[17] = NLoginCore_027.B("ŕƅŨŧśŝŉŻŤžŠŕ", (byte)71, 66);
               ZKM_STR_B[18] = NLoginCore_092.F("լԺՏշժշոդՍՓմՋ", (byte)71, 70);
               ZKM_STR_B[19] = NLoginCore_559.F("՜Ժշՠը՝ոչկԽյԹՂքէգքթՠՙՇ\u058bՋՏՊօիզեՏ՚\u0557֍ն֜ծ֏ց֒ձտք֘ի", (byte)71, 70);
               ZKM_STR_B[20] = NLoginCore_173.D("ӚһӡӰӔӦӝӓӫӣӊԍԈӘӍӝԇӏөӑӰӬӹԔԉԊӛӪӬӸӼԗ", (byte)71, 68);
               ZKM_STR_B[21] = NLoginCore_076.D("ӳӕӱӸӽԄԂӉӵӆԁԊӯӏӾӺԊӴԎӕӬӦӲӧԉӱԒԓәӹԏӵ", (byte)71, 68);
               ZKM_STR_B[22] = NLoginCore_092.A("ŕƅŨŧśŝŉŻŤžŠŕ", (byte)71, 65);
               ZKM_STR_B[23] = NLoginCore_521.C("ӳӁӖӾӱӾӿӫӔӚӻӒ", (byte)71, 67);
               ZKM_STR_B[24] = NLoginCore_324.C("ӟԃӻӵӦӐӲӫӵӵӢӌӋӘԅӳԏӆӞӟԒԆӰӬӗԙӸӹӨӮԑӭ", (byte)71, 67);
               ZKM_STR_B[25] = NLoginCore_471.D("ԁӭӍҸӐӼӺӵӸӻӿӟԎԇӿӾԌԍӐԖӶӎӭԄӧԙԓӮԒԎԑӛ", (byte)71, 68);
               ZKM_STR_B[26] = NLoginCore_559.C("ҵҼӱӾӢԁӗӛӠӠӭӒ", (byte)71, 67);
               ZKM_STR_B[27] = NLoginCore_092.B("ŕŦŒŝļƌŹźƃƆžŕ", (byte)71, 66);
               ZKM_STR_B[28] = NLoginCore_241.B("ŽŹŅżƋŦƈƊƄşƂŕ", (byte)71, 66);
               ZKM_STR_B[29] = NLoginCore_427.A("ŠŃťŁňŞŤŸŉŦźŕ", (byte)71, 65);
               ZKM_STR_B[30] = NLoginCore_446.B("ŠŃťŁňŞŤŸŉŦźŕ", (byte)71, 66);
               ZKM_STR_B[31] = NLoginCore_027.F("ճկԻղց՜վրպՕոՋ", (byte)71, 70);
               ZKM_STR_B[32] = NLoginCore_232.E("ՈնԹյԶ՚բծոՃքՋ", (byte)71, 69);
               ZKM_STR_B[33] = NLoginCore_575.C("ԃӽӏӕәӞӄӄԌӭԇӒ", (byte)71, 67);
               ZKM_STR_B[34] = NLoginCore_453.F("ճկԻղց՜վրպՕոՋ", (byte)71, 70);
               ZKM_STR_B[35] = NLoginCore_027.E("Ջջ՞՝ՑՓԿձ՚մՖՋ", (byte)71, 69);
               ZKM_STR_B[36] = NLoginCore_530.A("ŧƂņśŠƃŽŠřŊŸŌƊűŽſſŶŗťœūœƛƛŞŬƙƏƞƠůƥűƢƕƗƄũơƤŹưưƫŰƊƫƴƍűƐƵƩƀƁ", (byte)71, 65);
               ZKM_STR_B[37] = NLoginCore_241.F("ՍՊպՠ՜՜Ծսծճա՟ձքթր՞ՇՊքՎՙՖ\u0557", (byte)71, 70);
               ZKM_STR_B[38] = NLoginCore_451.B("ųżƁƇŶŶţŤũŷşƎńŉƀŝũŉƆŗŰŻŖźƎƎơƒşŽŵŴ", (byte)71, 66);
               ZKM_STR_B[39] = NLoginCore_471.E("Ռ՝ԼԽոոՊԼօ՚ՃրըՒֆմֆՙգՌ֍Ջ֊լՏի։ֈՓ֒Ֆ֙", (byte)71, 69);
               ZKM_STR_B[40] = NLoginCore_427.D("ԄӺӓӧӟӛԊӠӁӞԅӺӛԑԑӣԌӧӪӒӲԆӝӞ", (byte)71, 68);
               ZKM_STR_B[41] = NLoginCore_446.A("ŖŧņŇƂƂŔņƏŤōƊŲŜƐžƐţŭŖƗŕƔŶřŵƓƒŝƜŠƣ", (byte)71, 65);
               ZKM_STR_B[42] = NLoginCore_451.E("սճՌՠ\u0558ՔփՙԺ\u0557վճՔ֊֊՜օՠգՋիտՖ\u0557", (byte)71, 69);
               ZKM_STR_B[43] = NLoginCore_387.D("ӓӤӃӄӿӿӑӃԌӡӋӪԁӊԅӈӣӬӮӣӭӗӦԑӣӴԚӰӕԁԡӜ", (byte)71, 68);
               ZKM_STR_B[44] = NLoginCore_201.B("ƇŽŖŪŢŞƍţńšƈŽŞƔƔŦƏŪŭŕŵƉŠš", (byte)71, 66);
               ZKM_STR_B[45] = NLoginCore_553.E("Ռ՝ԼԽոոՊԼօ՚ՂՅֆՁՇՇֆՉ՜\u0557Վսեհՠէևծկ֓֏֏", (byte)71, 69);
               ZKM_STR_B[46] = NLoginCore_127.F("սճՌՠ\u0558ՔփՙԺ\u0557վճՔ֊֊՜օՠգՋիտՖ\u0557", (byte)71, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.C("ӒӺԄӻӟӝӇӨӸӇԋӒ", (byte)71, 67);
               ZKM_STR_B[1] = NLoginCore_091.E("ԺէՖՖԺԸրՐՖ՝՜ՆեՑ\u0557ւՌժխփՐՙՖ\u0557", (byte)71, 69);
               ZKM_STR_B[2] = NLoginCore_201.A("ńűŠŠńłƊŚŠŧŦƐźƅŪŴƉƐŷƖœŻŨƝźƕūƠŝūşƂŮššŻźƁƞƇŬƝƌŵ", (byte)71, 65);
               ZKM_STR_B[3] = NLoginCore_138.B("ńűŠŠńłƊŚŠŧŦƏŽƓŊƍōƗƉŴŌŨųŶŞƍůƑůźſƖ", (byte)71, 66);
               ZKM_STR_B[4] = NLoginCore_521.A("ńűŠŠńłƊŚŠŧŤƀŚżŽƇōƐƌŕƑůƒƌƏƘżŽƖŻųƢ", (byte)71, 65);
               ZKM_STR_B[5] = NLoginCore_076.F(
                  "էՍնժց՞խծդԷյՐևՁՔիՕԿՈ\u058cՋիՌղթՠ֒հՔ֕ւ֙օլՔ֑ղ֢ն֞ձսցև֢֧֪֝վդխվ֫֡֓ձ֒֔լտւִַֻ֤֯ռַվպִַּֽ֝\u0590֘\u05c8֙֕֩׀֠\u05c8ֽ׀֨\u05cd֝ב\u05c8֢֣\u058b\u05c9לֳֽֿ֮֗׀ג\u05cbֺ֛ל׃ֶקףׇ\u05cd\u05ec־֭ׄןֶַ",
                  (byte)71,
                  70
               );
               ZKM_STR_B[6] = NLoginCore_201.D("ӿӻӅӜԁӁӪӾӝӿԁӶӏӻӦӲӐӞԕӎӪӰӝӞ", (byte)71, 68);
               ZKM_STR_B[7] = NLoginCore_027.C("ӬӿӦӮӚҿԃӼӵӢӕӾӎӺӛӫԅӿԄӏԆӰӝӞ", (byte)71, 67);
               ZKM_STR_B[8] = NLoginCore_127.A(
                  "űŗƀŴƋŨŷŸŮŁſŚƑŋŞŵşŉŒƖŕŵŖżųŪƜźŞƟƌƣƏŶŞƛżƬƀƨŻƇƋƑƬƧƱƴƈŮŷƈƵƫƝŻƜƞŶƉƌƹƾƮǁǅƆǁƈƄƾƧǇǁǆƚƢǒƣƟƳǊƪǒǇǊƲǗƧǛǒƬƭƕǓǦǜƠǥǂǨƢǋǕƺǫǰǱƽǉǵǱǣǡǤǮǢǹǀǁ", (byte)71, 65
               );
               ZKM_STR_B[9] = NLoginCore_451.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒőƇƑƉŷƈſŹűźŸ", (byte)71, 66);
               ZKM_STR_B[10] = NLoginCore_173.E("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈ֏Ջհր֕ֈՍ֎եեՔ֝ռվ֕ռսպյբխ\u0590ի", (byte)71, 69);
               ZKM_STR_B[11] = NLoginCore_387.F("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈ\u0590\u058bա֎զք֑֒և\u0558չիշմ֞Ւտւյ֡հ֠ի", (byte)71, 70);
               ZKM_STR_B[12] = NLoginCore_004.A("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒŗƊŻƕŶŒŘƔŷŲƖ", (byte)71, 65);
               ZKM_STR_B[13] = NLoginCore_530.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒƚƉŕśŻŻŜŹřŮƤŸŦźƘŧũƔƗŭƟƦŵ", (byte)71, 66);
               ZKM_STR_B[14] = NLoginCore_559.F("ԸԳ՛ՏմՠճՃւյ\u0558դՈոԼ՜ք֎իջՈՍ֏֒Վւ֕Տի֓֓խկ՝֚֞֗ի֟ա֔ապի", (byte)71, 70);
               ZKM_STR_B[15] = NLoginCore_446.A("śƆřŞŢŠńŢŌśƎƊŌűƎŰœŢŖŕŗƙŠš", (byte)71, 65);
               ZKM_STR_B[16] = NLoginCore_091.F("ՊՊժՙՊլ՞՜ԼեՆսՒ\u0558ւսչՅՅբվ՛֎մ֎տէիֈպղջ\u0590֝ֈ֙ցնն֤՝ՠ\u0590ի", (byte)71, 70);
               ZKM_STR_B[17] = NLoginCore_201.D("ӯӹӣӐӇӠӵӻԋӥәӒ", (byte)71, 68);
               ZKM_STR_B[18] = NLoginCore_553.A("ŶƃŃŲŀœžśƇƌŘŕ", (byte)71, 65);
               ZKM_STR_B[19] = NLoginCore_183.D("ӣӁӾӧӯӤӿԀӶӄӼӀӉԋӮӪԋӰӧӠӎԒӒӖӑԌӲӭӬӖӡӞӡӠԏԧӿԗԛԔԋԉӵӲ", (byte)71, 68);
               ZKM_STR_B[20] = NLoginCore_397.D("ӚһӡӰӔӦӝӓӫӣӊԍԈӘӍӝԇӏөӑӰӢԍԗԄӽӸӺӪӞӷӻ", (byte)71, 68);
               ZKM_STR_B[21] = NLoginCore_559.F("լՎժձնսջՂծԿպփըՈշճփխևՎե՛ՉհխրղճՎեոգկ֖֕ո֖֍ն՚ոօ֔ի", (byte)71, 70);
               ZKM_STR_B[22] = NLoginCore_575.E("ԼՖմրՊԿւվՓԷՅՋ", (byte)71, 69);
               ZKM_STR_B[23] = NLoginCore_173.C("ӮҿӎӎԄԁӪԆԉӈԋӒ", (byte)71, 67);
               ZKM_STR_B[24] = NLoginCore_397.F("\u0558ռմծ՟Չիդծծ՛ՅՄՑվլֈԿ\u0557\u0558\u058bփռՑգ՞տ֔֊֑֙ֈ\u058bվի\u0590րՓ֏ջ֑֟֔ի", (byte)71, 70);
               ZKM_STR_B[25] = NLoginCore_027.F("պզՆԱՉյճծձմո\u0558ևրոշօֆՉ֏կ֑֍ՋփՏի֏ծծջղ", (byte)71, 70);
               ZKM_STR_B[26] = NLoginCore_427.D("ӸԁӯӁԅӸӒӸҽԃӚәӮӿӦӌԁԑӦӈԅӰӝӞ", (byte)71, 68);
               ZKM_STR_B[27] = NLoginCore_433.D("ӴӓӜӃӢԆԂӇӻӨӡӒ", (byte)71, 68);
               ZKM_STR_B[28] = NLoginCore_027.E("դծՉԻցղճԾօՙրՋ", (byte)71, 69);
               ZKM_STR_B[29] = NLoginCore_471.C("ҽӻӓӧӥӀӟԇӅӬӥӒ", (byte)71, 67);
               ZKM_STR_B[30] = NLoginCore_471.B("ŜńľŻŇƉŴŮŌƃŏŕ", (byte)71, 66);
               ZKM_STR_B[31] = NLoginCore_027.F("Ը\u0557ՏԺԻ՝՛վյ\u0558ԽՋ", (byte)71, 70);
               ZKM_STR_B[32] = NLoginCore_183.D("ӶҺӻӒӤԀӺӴӓӈӭӒ", (byte)71, 68);
               ZKM_STR_B[33] = NLoginCore_232.C("ӰӽӿӦӚӃԁӼԆԄӈӒ", (byte)71, 67);
               ZKM_STR_B[34] = NLoginCore_241.D("ӬӲӔԀӜӠӑӃӇӬөӒ", (byte)71, 68);
               ZKM_STR_B[35] = NLoginCore_201.F("դնՔձՔՙԼբՕԼՎՋ", (byte)71, 70);
               ZKM_STR_B[36] = NLoginCore_451.F("՝ոԼՑՖչճՖՏՀծՂրէճյյլՍ՛ՉաՉ֑֑Քբ֏օ֖֔ե֛է֘\u058b֍պ՟֚֗կ֥֏֕ռ֖֧֚ց֦\u058bքչնշ", (byte)71, 70);
               ZKM_STR_B[37] = NLoginCore_433.D("ӔӑԁӧӣӣӅԄӵӺӨԂԌӢԒӒԁԌӥԊӧӫӮӔӔӼӽԚӴӰԓӽ", (byte)71, 68);
               ZKM_STR_B[38] = NLoginCore_091.E("թղշսլլՙ՚՟խՕքԺԿնՓ՟ԿռՍզջպցֆ\u058bգօկն֕շ", (byte)71, 69);
               ZKM_STR_B[39] = NLoginCore_427.E("Ռ՝ԼԽոոՊԼօ՚ՃրըՒֆմֆՙգՌ֍Վքռվղլ֏եքքօխշՙէ֓֘ղռ՝բնի", (byte)71, 69);
               ZKM_STR_B[40] = NLoginCore_173.C("ԄӺӓӧӟӛԊӠӁӞԅӆӼԄӈӥӛԄӴԎӧӠӝӞ", (byte)71, 67);
               ZKM_STR_B[41] = NLoginCore_324.B("ŖŧņŇƂƂŔņƏŤōƊŲŜƐžƐţŭŖƗƜŗŦƈƚŻŘƍżŬƛŰŤšƘųƊƆŦƖƏƐŵ", (byte)71, 66);
               ZKM_STR_B[42] = NLoginCore_173.A("ƇŽŖŪŢŞƍţńšƆŊőŪŴŠƃƘťŒƆƉŠš", (byte)71, 65);
               ZKM_STR_B[43] = NLoginCore_127.A("ŖŧņŇƂƂŔņƏŤŎŭƄōƈŋŦůűŦŰŒƙŦžƘƎƎšƞƞƃƓůƛƗơŨƟƄťƯƦŵ", (byte)71, 65);
               ZKM_STR_B[44] = NLoginCore_201.A("ƇŽŖŪŢŞƍţńšƈſšŢƒŭƅŵƍŶŒƉŠš", (byte)71, 65);
               ZKM_STR_B[45] = NLoginCore_451.F("Ռ՝ԼԽոոՊԼօ՚ՂՅֆՁՇՇֆՉ՜\u0557ՎհքխՠթՈմժ\u0590ե֙շ֕֗՜լ֠֝ճ֞չւի", (byte)71, 70);
               ZKM_STR_B[46] = NLoginCore_138.E("սճՌՠ\u0558ՔփՙԺ\u0557սհՆշճլշլսՁձթՖ\u0557", (byte)71, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_183.E("՜ըչՉՉ՝Րփք՞\u0558ց՟փ՚սՄ՟դֆՌտՖ\u0557", (byte)71, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_387.D("ԀӣӕӃӦӖӡӔԀӾӨӈӉԏөԅӢӆӿӎӬԆӝӞ", (byte)71, 68);
         }
      }
   }

   public List<String> b(NLoginCore_237 var1, Object... var2) {
      if (!var1.aI) {
         throw new IllegalStateException(var1 + a(bh, bi ^ bj));
      } else {
         return var1.b(this.e, var2);
      }
   }

   private void a(NLoginCore_219 var1, NLoginCore_219 var2, NLoginCore_102 var3) {
      String var4 = var3.d.a()[ez];
      NLoginCore_190 var5 = NLoginCore_102.a(var4, var3.aH ? var2 : this.e);
      if (!var3.aH && var5 == null) {
         var5 = NLoginCore_102.a(var4, var1);
      }

      if (var5 == null) {
         var5 = (NLoginCore_190)var3.a();
      }

      NLoginCore_525.a(var3, this.g, var5, (fa != 0));
   }

   private void a(NLoginCore_219 var1, NLoginCore_219 var2, NLoginCore_508 var3) {
      String var4 = var3.g.a()[ex];
      NLoginCore_075 var5 = NLoginCore_075.a(var4, var3.aK ? var2 : this.e);
      if (!var3.aK && !var5.Z()) {
         var5 = NLoginCore_075.a(var4, var1);
      }

      if (var5 == null) {
         var5 = (NLoginCore_075)var3.a();
      }

      NLoginCore_525.a(var3, this.f, var5, (ey != 0));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_316.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.F("Քնո\u0558ռ֛֓֩֕դ֢֦֘֠թ֎ְ֧֧֭֯ռ", (byte)112, 70), NLoginCore_316.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.B("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԬԧԥԺ\u0530ԽԖԼԓƳ", (byte)112, 66) + var1 + NLoginCore_138.F("զ", (byte)112, 70) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   private String a(NLoginCore_487 var1) {
      switch (NLoginCore_202.ag[var1.ordinal()]) {
         case 1:
         case 2:
            NLoginCore_487 var2 = var1 == NLoginCore_487.h ? NLoginCore_487.f : NLoginCore_487.g;
            if (this.e.p(var2.f.a()[bx])) {
               Object[] var10002 = new Object[dg];
               var10002[dh] = a(di & dj, dk);
               String var3 = this.a(var2, var10002);
               String[] var4 = var3.split(a(dl, dm ^ dn));
               if (var4.length == var_do) {
                  var4 = var3.split(a(dp, dq ^ dr));
                  if (var4.length == ds) {
                     NLoginCore_525.a(var2, this.d, var2.a(this.d, new Object[dt]).replace(a(du, dv ^ dw), a(dx, dy)), (dz != 0));
                  }
               }

               if (var4.length == ea && var4[eb].length() > ec && var4[ed].length() > ee) {
                  int var5 = var4[ef].lastIndexOf(a(eg & eh, ei));
                  int var6 = var4[ej].indexOf(a(ek & el, em));
                  if (var5 >= 0 && var6 > 0) {
                     return var4[en].substring(var5 + eo) + a(ep, eq ^ er) + var4[es].substring(et, var6);
                  }
               }

               return a(eu, ev ^ ew);
            }

            if (this.b != NLoginCore_055.c && this.b != NLoginCore_055.s) {
               NLoginCore_525.a(
                  var2, this.d, a(co, cp ^ cq) + (var1 == NLoginCore_487.h ? a(cr, cs ^ ct) : a(cu, cv ^ cw)) + a(cx & cy, cz), (da != 0)
               );
               NLoginCore_525.a(var1, this.d, a(db, dc), (dd != 0));
            } else {
               NLoginCore_525.a(
                  var2, this.d, a(by, bz ^ ca) + (var1 == NLoginCore_487.h ? a(cb, cc ^ cd) : a(ce, cf)) + a(cg, ch ^ ci), (cj != 0)
               );
               NLoginCore_525.a(var1, this.d, a(ck, cl ^ cm), (cn != 0));
            }

            return a(de, df);
         default:
            return null;
      }
   }

   public NLoginCore_075 a(NLoginCore_508 var1) {
      return var1.b(this.f);
   }

   private void a(NLoginCore_219 var1, NLoginCore_487 var2) {
      if (var2.aJ) {
         List var3 = null;
         String[] var4 = var2.f.a();
         int var5 = var4.length;

         for (int var6 = bk; var6 < var5; var6++) {
            String var7 = var4[var6];
            if ((var3 = this.e.b(var7, null)) != null) {
               break;
            }
         }

         if (var3 == null) {
            var4 = var2.f.a();
            var5 = var4.length;

            for (int var15 = bl; var15 < var5; var15++) {
               String var18 = var4[var15];
               if ((var3 = var1.b(var18, null)) != null) {
                  break;
               }
            }
         }

         if (var3 == null || var3.isEmpty()) {
            var3 = (List)var2.o;
         }

         NLoginCore_525.a(var2, this.d, var3, (bm != 0));
      } else {
         String var8 = null;
         String[] var10 = var2.f.a();
         int var13 = var10.length;

         for (int var16 = bn; var16 < var13; var16++) {
            String var19 = var10[var16];
            if ((var8 = this.e.b(var19)) != null) {
               break;
            }
         }

         if (var8 == null && a(bo, bp ^ bq).equals(var8 = this.a(var2))) {
            return;
         }

         if (var8 == null) {
            var10 = var2.f.a();
            var13 = var10.length;

            for (int var17 = br; var17 < var13; var17++) {
               String var20 = var10[var17];
               if ((var8 = var1.b(var20)) != null) {
                  break;
               }
            }
         }

         if (var8 == null) {
            var8 = (String)var2.o;
         }

         NLoginCore_525.a(var2, this.d, var8, (bs != 0));
      }
   }

   public List<String> b(NLoginCore_487 var1, Object... var2) {
      if (!var1.aJ) {
         throw new IllegalStateException(var1 + a(ay, az ^ ba));
      } else {
         return var1.b(this.d, var2);
      }
   }

   public List<String> a(NLoginCore_487 var1, Object... var2) {
      if (!var1.aJ) {
         throw new IllegalStateException(var1 + a(av & aw, ax));
      } else {
         return var1.a(this.d, var2);
      }
   }

   private boolean a(NLoginCore_219 var1, NLoginCore_219 var2) {
      this.e.o(a(fb, fc ^ fd) + this.b.cO);
      return this.b(var1, var2);
   }
}
