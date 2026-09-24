package com.nickuc.login;

import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.MemClassLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_227 {
   private static long gm = Long.reverse(4315524091695539534L);
   private static long hd = Long.reverse(-2017612633061982208L);
   private static int bq = Integer.reverse(1073741824);
   private static long fu = Long.reverse(-2313774559793830578L);
   private static long dw = Long.reverse(-2313774559793830578L);
   private static int he = 0 >>> 57 | 0 << -57;
   private static int y = (0 >>> 4 | 0 << -4) & -1;
   private static int cp = (376832 >>> 206 | 376832 << ~206 + 1) & -1;
   private static int c = 0 >>> 6 | 0 << -6;
   private static long be = Long.reverse(4315524091695539534L);
   private static int di = Integer.reverse(402653184);
   private static long ha = Long.reverse(-2017612633061982208L);
   private static int gr = 4194304 >>> 246 | 4194304 << ~246 + 1;
   private static long es = Long.reverse(4315524091695539534L);
   private static int db = Integer.reverse(-1);
   private static long dk = Long.reverse(4315524091695539534L);
   private static int dl = 104857600 >>> 246 | 104857600 << -246;
   private static long cj = Long.reverse(-2017612633061982208L);
   private static int a = Integer.reverse(1946157056);
   private static int ax = Integer.reverse(1476395008);
   private static int ht = (-201326592 >>> 250 | -201326592 << -250) & -1;
   private static long hu = Long.reverse(4315524091695539534L);
   private static long g = Long.reverse(4315524091695539534L);
   private long o;
   private static String[] b = new String[NLoginCore_227.ij];
   private static long cm = Long.reverse(-2313774559793830578L);
   private static int ag = Integer.reverse(1610612736);
   private static int ek = 1184 >>> 37 | 1184 << ~37 + 1;
   private static long w = Long.reverse(-2313774559793830578L);
   private static long eg = Long.reverse(4315524091695539534L);
   private final String aV;
   private static int dd = (5505024 >>> 242 | 5505024 << -242) & -1;
   private static long bi = Long.reverse(-2313774559793830578L);
   private static long du = Long.reverse(-2017612633061982208L);
   private static int hx = (235929600 >>> 176 | 235929600 << -176) & -1;
   private static int ap = Integer.reverse(805306368);
   private static int da = Integer.reverse(1476395008);
   private static long hk = Long.reverse(-2017612633061982208L);
   private static int fg = (5504 >>> 7 | 5504 << -7) & -1;
   private static int ab = Integer.reverse(0);
   private static int am = Integer.reverse(-805306368);
   private static int aa = Integer.reverse(0);
   private static int fw = Integer.reverse(0);
   private static long gb = Long.reverse(-2313774559793830578L);
   private static int gh = 3264 >>> 38 | 3264 << ~38 + 1;
   private static long t = Long.reverse(-2313774559793830578L);
   private static long al = Long.reverse(4315524091695539534L);
   private static long ea = Long.reverse(-2313774559793830578L);
   private static int b = Integer.reverse(-201326592);
   private static long gp = Long.reverse(4315524091695539534L);
   private static String[] a = new String[NLoginCore_227.ii];
   private static long aw = Long.reverse(4315524091695539534L);
   private static int bx = Integer.reverse(-939524096);
   private static int dq = (-2147483641 >>> 158 | -2147483641 << -158) & -1;
   private static long ce = Long.reverse(-2017612633061982208L);
   private static int gd = Integer.reverse(-1946157056);
   private static long ei = Long.reverse(-2313774559793830578L);
   private static int ih = 0 >>> 88 | 0 << ~88 + 1;
   private static int fq = (6029312 >>> 209 | 6029312 << ~209 + 1) & -1;
   private static int im = 16384 >>> 13 | 16384 << ~13 + 1;
   private static int bp = (114688 >>> 238 | 114688 << -238) & -1;
   private static int cl = (11534336 >>> 243 | 11534336 << ~243 + 1) & -1;
   private static int fx = 0 >>> 88 | 0 << -88;
   private static int ds = Integer.reverse(-134217728);
   private static long fo = Long.reverse(-2017612633061982208L);
   private static long gj = Long.reverse(4315524091695539534L);
   private static long c;
   private static int az = Integer.reverse(1879048192);
   private static long gu = Long.reverse(-2017612633061982208L);
   private static long fv = Long.reverse(-2017612633061982208L);
   private static int dh = (3014656 >>> 241 | 3014656 << -241) & -1;
   private static int ec = Integer.reverse(1140850688);
   private static int er = -1 >>> 215 | -1 << -215;
   private static int cv = Integer.reverse(-1744830464);
   private static long n = Long.reverse(-2017612633061982208L);
   private static int ez = (-1 >>> 143 | -1 << -143) & -1;
   private static int hp = Integer.reverse(Integer.MIN_VALUE);
   private static int eq = 624 >>> 228 | 624 << -228;
   private static long ej = Long.reverse(-2017612633061982208L);
   private static int fy = 0 >>> 246 | 0 << -246;
   private static int hr = Integer.reverse(1610612736);
   private static long ar = Long.reverse(-2017612633061982208L);
   private static long cq = Long.reverse(4315524091695539534L);
   private static long ip = Long.reverse(-2313774559793830578L);
   private static int gk = Integer.reverse(738197504);
   private static long gt = Long.reverse(-2313774559793830578L);
   private static long ci = Long.reverse(-2313774559793830578L);
   private static int co = Integer.reverse(134217728);
   private static long ig = Long.reverse(-2017612633061982208L);
   private static int io = Integer.reverse(33554432);
   private static int bs = 4608 >>> 168 | 4608 << -168;
   private static long ae = Long.reverse(-2017612633061982208L);
   private static long m = Long.reverse(-2313774559793830578L);
   private final NLoginCore_203 a;
   private static int ai = (-1 >>> 5 | -1 << ~5 + 1) & -1;
   private static int s = Integer.reverse(1610612736);
   private static int fc = Integer.reverse(-1);
   private static long bj = Long.reverse(-2017612633061982208L);
   private static long d = Long.reverse(-2313774559793830578L);
   private static int hy = 1920 >>> 132 | 1920 << -132;
   private static int ay = Integer.reverse(0);
   private static int cs = Integer.reverse(402653184);
   private static long hm = Long.reverse(4315524091695539534L);
   private static long fi = Long.reverse(4315524091695539534L);
   private static long u = Long.reverse(-2017612633061982208L);
   private static long ed = Long.reverse(-2313774559793830578L);
   private static long ao = Long.reverse(-2017612633061982208L);
   private static int ib = 1015808 >>> 78 | 1015808 << ~78 + 1;
   private static int gf = 1073741830 >>> 29 | 1073741830 << ~29 + 1;
   private static int ff = Integer.reverse(0);
   private final NLoginCore_142 a;
   private static long var_do = Long.reverse(-2017612633061982208L);
   private static long aq = Long.reverse(-2313774559793830578L);
   private static long gg = Long.reverse(4315524091695539534L);
   private static int dm = 928 >>> 165 | 928 << ~165 + 1;
   private static final List<String> j;
   private static long fs = Long.reverse(-2017612633061982208L);
   private static long ev = Long.reverse(-2017612633061982208L);
   private static int eo = -1 >>> 52 | -1 << -52;
   private static int bl = -2147483647 >>> 94 | -2147483647 << ~94 + 1;
   private static int dv = (128 >>> 130 | 128 << ~130 + 1) & -1;
   private static long ba = Long.reverse(4315524091695539534L);
   private static int hi = Integer.reverse(-603979776);
   private static int ey = Integer.reverse(-1811939328);
   private static long ge = Long.reverse(4315524091695539534L);
   private static int h = Integer.reverse(1073741824);
   private final String aU;
   private static long it = Long.reverse(4315524091695539534L);
   private static int cr = Integer.reverse(-2013265920);
   private static int hb = Integer.reverse(-1677721600);
   private static int is = (16640 >>> 200 | 16640 << ~200 + 1) & -1;
   private static int ew = 128 >>> 135 | 128 << ~135 + 1;
   private static long gz = Long.reverse(-2313774559793830578L);
   private static long hj = Long.reverse(-2313774559793830578L);
   private static int hs = (134217728 >>> 27 | 134217728 << ~27 + 1) & -1;
   private static int il = Integer.reverse(503316480);
   private static int cy = Integer.reverse(-939524096);
   static final int W = NLoginCore_227.ik;
   private static int ch = 176160768 >>> 183 | 176160768 << -183;
   private static long hg = Long.reverse(-2313774559793830578L);
   private static long dn = Long.reverse(-2313774559793830578L);
   private static long fa = Long.reverse(4315524091695539534L);
   private NLoginCore_204 a;
   private static int bv = (144 >>> 132 | 144 << ~132 + 1) & -1;
   private static int ia = Integer.reverse(Integer.MIN_VALUE);
   private static int bb = 1073741824 >>> 94 | 1073741824 << -94;
   private static int fe = Integer.reverse(0);
   private static int gq = 8388608 >>> 87 | 8388608 << ~87 + 1;
   private static long an = Long.reverse(-2313774559793830578L);
   private static long eu = Long.reverse(-2313774559793830578L);
   private static int bn = Integer.reverse(-2013265920);
   private static int bm = 786432 >>> 241 | 786432 << -241;
   private static int fb = Integer.reverse(1409286144);
   private static int ho = (0 >>> 216 | 0 << -216) & -1;
   private static int de = Integer.reverse(1744830464);
   private static int dz = Integer.reverse(-2080374784);
   private static long cw = Long.reverse(-2313774559793830578L);
   private static int hv = 125829120 >>> 244 | 125829120 << -244;
   private static int as = (33554432 >>> 185 | 33554432 << -185) & -1;
   private static int gs = (905969664 >>> 24 | 905969664 << -24) & -1;
   private static long gx = Long.reverse(-2017612633061982208L);
   private static int cc = Integer.reverse(671088640);
   private static long eb = Long.reverse(-2017612633061982208L);
   private static int bg = 33554432 >>> 87 | 33554432 << ~87 + 1;
   private static int et = Integer.reverse(335544320);
   private static long k = Long.reverse(4315524091695539534L);
   @Nullable
   private NLoginCore_151 a;
   private static int br = Integer.reverse(268435456);
   private static int df = Integer.reverse(-671088640);
   private static int ah = Integer.reverse(-1879048192);
   private static long gc = Long.reverse(-2017612633061982208L);
   private static long bz = Long.reverse(-2017612633061982208L);
   private static long dg = Long.reverse(4315524091695539534L);
   @Nullable
   private NLoginCore_109 a;
   private static long iq = Long.reverse(-2017612633061982208L);
   private static int gl = (-1 >>> 173 | -1 << ~173 + 1) & -1;
   private static long el = Long.reverse(-2313774559793830578L);
   private static int ic = -1 >>> 96 | -1 << -96;
   @Nullable
   private NLoginCore_180 a;
   @Nullable
   private String aW;
   private static long dc = Long.reverse(4315524091695539534L);
   private static long fl = Long.reverse(-2017612633061982208L);
   private static int o = Integer.reverse(0);
   private static int ie = Integer.reverse(-67108864);
   private static int gn = Integer.reverse(-1409286144);
   private static int q = Integer.reverse(-1610612736);
   private static int hq = Integer.reverse(0);
   private static int cz = Integer.reverse(671088640);
   private static int bw = 'ꀀ' >>> '\f' | 40960 << ~12 + 1;
   @Nullable
   private byte[] b;
   private static long dr = Long.reverse(4315524091695539534L);
   private static int cb = -1073741824 >>> 92 | -1073741824 << -92;
   private static long fn = Long.reverse(-2313774559793830578L);
   private static int hl = Integer.reverse(1006632960);
   private static int hn = Integer.reverse(Integer.MIN_VALUE);
   private static int fh = Integer.reverse(-1);
   static final int V = il;
   private static long ct = Long.reverse(4315524091695539534L);
   private static long bu = Long.reverse(-2017612633061982208L);
   private static long hc = Long.reverse(-2313774559793830578L);
   private static int ij = Integer.reverse(1107296256);
   private static int bh = 1 >>> 220 | 1 << ~220 + 1;
   private static int fz = Integer.reverse(536870912);
   private static int ck = Integer.reverse(-268435456);
   private static int l = Integer.reverse(536870912);
   private static long x = Long.reverse(-2017612633061982208L);
   private static int ir = ('耀' >>> 207 | 32768 << ~207 + 1) & -1;
   private static int bk = (167772160 >>> 25 | 167772160 << -25) & -1;
   private static int ft = 3080192 >>> 176 | 3080192 << ~176 + 1;
   private static long bt = Long.reverse(-2313774559793830578L);
   private static int gv = Integer.reverse(-335544320);
   private static int fm = (47185920 >>> 84 | 47185920 << ~84 + 1) & -1;
   private static int ex = Integer.reverse(0);
   private static int en = 19922944 >>> 211 | 19922944 << -211;
   private static int dy = 16384 >>> 78 | 16384 << ~78 + 1;
   private static int ak = 20480 >>> 171 | 20480 << -171;
   private static int fp = (0 >>> 118 | 0 << -118) & -1;
   private static long aj = Long.reverse(4315524091695539534L);
   private static int ef = Integer.reverse(-1006632960);
   private static long i = Long.reverse(4315524091695539534L);
   private static int fj = 180224 >>> 172 | 180224 << ~172 + 1;
   private static long cd = Long.reverse(-2313774559793830578L);
   private static int dp = (0 >>> 183 | 0 << ~183 + 1) & -1;
   private static int hf = Integer.reverse(1543503872);
   private static int go = Integer.reverse(-1);
   private static long hh = Long.reverse(-2017612633061982208L);
   private static int af = Integer.reverse(0);
   private static long fd = Long.reverse(4315524091695539534L);
   private static long e = Long.reverse(-2017612633061982208L);
   private static long by = Long.reverse(-2313774559793830578L);
   private static long fr = Long.reverse(-2313774559793830578L);
   private static long var_if = Long.reverse(-2313774559793830578L);
   private static int ik = 1476395010 >>> 89 | 1476395010 << -89;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int ga = (48 >>> 224 | 48 << -224) & -1;
   private static int au = (208 >>> 132 | 208 << -132) & -1;
   private static int eh = -1879048192 >>> 26 | -1879048192 << ~26 + 1;
   private static int hw = (320 >>> 38 | 320 << -38) & -1;
   private static long fk = Long.reverse(-2313774559793830578L);
   private static int av = Integer.reverse(-1);
   private static int at = Integer.reverse(0);
   private static int z = (0 >>> 10 | 0 << -10) & -1;
   private static long dt = Long.reverse(-2313774559793830578L);
   private static long ee = Long.reverse(-2017612633061982208L);
   private static long cn = Long.reverse(-2017612633061982208L);
   private static int v = Integer.reverse(-536870912);
   private static long r = Long.reverse(4315524091695539534L);
   private static int ac = Integer.reverse(268435456);
   private static long cx = Long.reverse(-2017612633061982208L);
   private static long ad = Long.reverse(-2313774559793830578L);
   private static int bd = (503316480 >>> 25 | 503316480 << -25) & -1;
   private static int cg = (29360128 >>> 213 | 29360128 << ~213 + 1) & -1;
   private static long ep = Long.reverse(4315524091695539534L);
   private static int p = (0 >>> 30 | 0 << ~30 + 1) & -1;
   private static long dx = Long.reverse(-2017612633061982208L);
   private static int in = (0 >>> 39 | 0 << ~39 + 1) & -1;
   private static long bo = Long.reverse(4315524091695539534L);
   private static int bf = Integer.reverse(-1073741824);
   private static int ca = Integer.reverse(-805306368);
   private static int gy = (-536870912 >>> 186 | -536870912 << ~186 + 1) & -1;
   private static int cf = Integer.reverse(-1342177280);
   private static int j = 196608 >>> 112 | 196608 << ~112 + 1;
   private static int bc = Integer.reverse(1073741824);
   private static long hz = Long.reverse(1711367858400788480L);
   private static int ii = Integer.reverse(1107296256);
   private static int cu = (4718592 >>> 146 | 4718592 << ~146 + 1) & -1;
   private static int gi = (-1 >>> 4 | -1 << -4) & -1;
   private static int dj = Integer.reverse(939524096);
   private static long em = Long.reverse(-2017612633061982208L);
   private static long gw = Long.reverse(-2313774559793830578L);
   private static long id = Long.reverse(4315524091695539534L);
   private final NLoginInterface_011<?> b;

   @Nullable
   @Generated
   byte[] a() {
      return this.b;
   }

   public synchronized void aj() {
      this.a = null;
   }

   private static String a(int var0, long var1) {
      var1 ^= 39L;
      var1 ^= -6872748581275307862L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(65 + 3),
                     (byte)(39 + 30),
                     (byte)(10 + 73),
                     (byte)(27 + 20),
                     67,
                     (byte)(36 + 30),
                     (byte)(19 + 48),
                     (byte)(11 + 36),
                     80,
                     (byte)(34 + 41),
                     (byte)(19 + 48),
                     (byte)(23 + 60),
                     (byte)(48 + 5),
                     (byte)(51 + 29),
                     (byte)(33 + 64),
                     (byte)(88 + 12),
                     (byte)(59 + 41),
                     (byte)(14 + 91),
                     (byte)(54 + 56),
                     (byte)(85 + 18)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.C("ӉӖӕҘӘӔӏӘӣӒҟӝӡӚӝӣҥ࠺ࠋ࠺࠶ࡂ࠽࠘࠱࠳ࠛࠧ࠼ࡊࡂ", (byte)59, 67));
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

   @Generated
   public NLoginCore_203 a() {
      return this.a;
   }

   public synchronized void am() {
      this.d((boolean)gr);
   }

   @Generated
   String I() {
      return this.aV;
   }

   public NLoginCore_151 a(NLoginCore_305 var1, String var2, boolean var3, byte[] var4) {
      return this.a(var1, var2, var3, (var1x, var2x) -> var1x.a(var2x, var4));
   }

   @Generated
   public NLoginCore_142 a() {
      return this.a;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (var_if you have the rights to distribute it!)
   public NLoginCore_227(NLoginInterface_011<?> var1, MemClassLoader var2) {
      ClassLoader var3 = var2.getParentLoader();
      InputStream var4 = var3.getResourceAsStream(LoaderBootstrap.class.getPackage().getName().replace((char)a, (char)b) + a(c, d ^ e));
      boolean var15 = false /* VF: Semaphore variable */;

      try {
         var15 = true;
         if (var4 == null) {
            throw new RuntimeException(a(f, g));
         }

         this.b = var1;
         this.aV = NLoginCore_342.d.a(var4);
         this.aU = NLoginCore_342.d.a(var1.a().f());
         this.a = new NLoginCore_203(var1, this);
         this.a = new NLoginCore_142(var1, this);
         NLoginCore_482 var5 = var1.a().a();
         NLoginCore_204 var6 = NLoginCore_204.a(var5.a(a(h, i), Byte.valueOf((byte)NLoginCore_204.b.ordinal())));
         this.a = var6 != null ? var6 : NLoginCore_204.b;
         InputStream var7 = var3.getResourceAsStream(a(j, k));
         boolean var19 = false /* VF: Semaphore variable */;

         try {
            var19 = true;
            if (var7 != null) {
               BufferedReader var8 = new BufferedReader(new InputStreamReader(var7, StandardCharsets.UTF_8));
               boolean var23 = false /* VF: Semaphore variable */;

               try {
                  var23 = true;
                  this.aW = var8.readLine();
                  var5.a(a(l, m ^ n), this.aW).ag();
                  var23 = false;
               } finally {
                  if (var23) {
                     if (Collections.singletonList(var8).get(p) != null) {
                        var8.close();
                     }
                  }
               }

               if (Collections.singletonList(var8).get(o) != null) {
                  var8.close();
               }
            } else {
               this.aW = var5.k(a(q, r));
            }

            String var27 = var5.k(a(s, t ^ u));
            String var9 = var5.k(a(v, w ^ x));
            if (var27 != null) {
               if (var9 != null) {
                  this.a = new NLoginCore_180(var27, var9);
                  var19 = false;
               } else {
                  var19 = false;
               }
            } else {
               var19 = false;
            }
         } finally {
            if (var19) {
               if (Collections.singletonList(var7).get(z) != null) {
                  var7.close();
               }
            }
         }

         if (Collections.singletonList(var7).get(y) != null) {
            var7.close();
            var15 = false;
         } else {
            var15 = false;
         }
      } finally {
         if (var15) {
            if (Collections.singletonList(var4).get(ab) != null) {
               var4.close();
            }
         }
      }

      if (Collections.singletonList(var4).get(aa) != null) {
         var4.close();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_227.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.D("ҔҶҸҘҼӛӓөӕҤӢӘӦӠҩӎӰӯӧӭӧҼ", (byte)61, 68), NLoginCore_227.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫࡀࠑࡀ࠼ࡈࡃࠞ࠷࠹ࠡ࠭ࡂࡐࡈӅ", (byte)61, 68) + var1 + NLoginCore_575.D("Ҧ", (byte)61, 68) + var2.toString(), var4
         );
      }
   }

   synchronized void ak() {
      this.a = null;
      NLoginCore_482 var1 = this.b.a().a();
      var1.a(a(ak, al));
      var1.a(a(am, an ^ ao));
      var1.ag();
   }

   @Generated
   String H() {
      return this.aU;
   }

   public String G() {
      return this.aV.substring(af, ag);
   }

   private NLoginCore_151 a(NLoginCore_305 var1, String var2, boolean var3, NLoginInterface_045 var4) {
      if (var3) {
         if (this.a == null) {
            throw new IllegalStateException(a(hf, hg ^ hh));
         }

         var1.b(a(hi, hj ^ hk), this.a.e());
         var1.k(a(hl, hm), this.a.U());
      }

      List var5 = this.a.a(j);
      int var6 = var5.size();
      String var7 = !var5.equals(j) && var6 > hn ? (String)var5.get((int)(Math.random() * var6)) : (String)var5.get(ho);
      Object[] var10001 = new Object[hp];
      var10001[hq] = hr;
      String var8 = String.format(var2, var10001);
      NLoginCore_123 var9 = var4.doRequest(var1, var7 + var8);
      if (var9.ag()) {
         return new NLoginCore_151(var9.c(), var9.p(), var7);
      } else {
         boolean var10 = j.contains(var7);
         if (var6 > hs) {
            for (String var12 : var5) {
               if (!var12.equals(var7)) {
                  if (!var10) {
                     var10 = j.contains(var12);
                  }

                  var9 = var4.doRequest(var1, var12 + var8);
                  if (var9.ag()) {
                     return new NLoginCore_151(var9.c(), var9.p(), var12);
                  }
               }
            }
         }

         if (!var10) {
            for (String var16 : j) {
               var9 = var4.doRequest(var1, var16 + var8);
               if (var9.ag()) {
                  return new NLoginCore_151(var9.c(), var9.p(), var16);
               }
            }
         }

         return NLoginCore_151.b();
      }
   }

   synchronized boolean ab() {
      this.a = null;
      int var1 = this.b.a().q();
      String var2 = this.aW != null && var1 != 0 ? this.aW : a(ap, aq ^ ar);
      String var3 = this.aW != null && this.b.b().a().L() && var1 == as ? (String)this.b.a(at) : a(au & av, aw);
      Object[] var10000 = new Object[ax];
      var10000[ay] = a(az, ba);
      var10000[bb] = this.b.q();
      var10000[bc] = a(bd, be);
      var10000[bf] = this.b.s();
      var10000[bg] = a(bh, bi ^ bj);
      var10000[bk] = bl;
      var10000[bm] = a(bn, bo);
      var10000[bp] = bq;
      var10000[br] = a(bs, bt ^ bu);
      var10000[bv] = this.a.o();
      var10000[bw] = a(bx, by ^ bz);
      var10000[ca] = this.aU;
      var10000[cb] = a(cc, cd ^ ce);
      var10000[cf] = this.aV;
      var10000[cg] = a(ch, ci ^ cj);
      var10000[ck] = this.a != null ? this.a.S() : a(cl, cm ^ cn);
      var10000[co] = a(cp, cq);
      var10000[cr] = this.a != null ? this.a.T() : a(cs, ct);
      var10000[cu] = a(cv, cw ^ cx);
      var10000[cy] = this.b.b().a().ordinal();
      var10000[cz] = a(da & db, dc);
      var10000[dd] = var2;
      var10000[de] = a(df, dg);
      var10000[dh] = var1;
      var10000[di] = a(dj, dk);
      var10000[dl] = var3;
      Object[] var4 = var10000;
      NLoginCore_151 var5 = this.a(NLoginCore_305.a(), a(dm, dn ^ var_do), (boolean)dp, NLoginCore_488.a(var4));
      int var6 = var5.p();

      try {
         switch (var6) {
            case 0:
            case 503:
               return (boolean)ex;
            case 200:
               JSONObject var17 = new JSONObject(var5.V());
               JSONObject var18 = var17.getJSONObject(a(dq, dr));
               long var19 = var18.getLong(a(ds, dt ^ du));
               String var20 = var18.getString(a(dv, dw ^ dx));
               this.a = new NLoginCore_109(var19, var20);
               return (boolean)dy;
            case 201:
               JSONObject var7 = new JSONObject(var5.V());
               JSONObject var8 = var7.getJSONObject(a(dz, ea ^ eb));
               String var9 = var8.getString(a(ec, ed ^ ee));
               String var10 = var8.getString(a(ef, eg));
               this.b.a().a().a(a(eh, ei ^ ej), var9).a(a(ek, el ^ em), var10).ag();
               this.a = new NLoginCore_180(var9, var10);
               JSONObject var11 = var7.getJSONObject(a(en & eo, ep));
               long var12 = var11.getLong(a(eq & er, es));
               String var14 = var11.getString(a(et, eu ^ ev));
               this.a = new NLoginCore_109(var12, var14);
               return (boolean)ew;
            default:
               NLoginCore_370.d(a(ey & ez, fa) + var6 + a(fb & fc, fd));
               return (boolean)ff;
         }
      } catch (JSONException var15) {
         NLoginCore_370.d(a(fg & fh, fi) + var6 + a(fj, fk ^ fl) + var15.getLocalizedMessage() + a(fm, fn ^ fo));
      } catch (Exception var16) {
         if (!(var16 instanceof IllegalStateException) || !a(fq, fr ^ fs).equals(var16.getMessage())) {
            NLoginCore_370.c(a(ft, fu ^ fv), var16);
         }
      }

      return (boolean)fx;
   }

   public synchronized void al() {
      if (this.a == null && !this.ab()) {
         this.a = NLoginCore_151.b();
      } else {
         byte[] var1 = new byte[fz];
         NLoginCore_354.a().nextBytes(var1);
         this.b = var1;
         NLoginCore_305 var2 = NLoginCore_305.a();
         var2.k(a(ga, gb ^ gc), a(gd, ge));
         var2.k(a(gf, gg), a(gh & gi, gj));
         var2.k(a(gk & gl, gm), NLoginCore_158.a(var1));
         this.a = this.a(var2, a(gn & go, gp) + this.a.ordinal(), (boolean)gq);
      }
   }

   private static void b() {
      c = 8260978991583447035L;
      long var0 = c ^ -6872748581275307862L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               (byte)(25 + 44),
               (byte)(60 + 23),
               (byte)(34 + 13),
               (byte)(31 + 36),
               (byte)(20 + 46),
               (byte)(40 + 27),
               (byte)(23 + 24),
               (byte)(61 + 19),
               (byte)(61 + 14),
               67,
               (byte)(59 + 24),
               (byte)(44 + 9),
               (byte)(64 + 16),
               97,
               (byte)(96 + 4),
               (byte)(2 + 98),
               (byte)(25 + 80),
               (byte)(81 + 29),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_387.A("ďÚáęîÙèñĘăĞĄĩÿùĦċĄİĕĪÿüý", (byte)21, 65);
               b[1] = NLoginCore_433.A("ïõĜĖßĒÿüēīĆĦďĭøċĐăįąĴÿüý", (byte)21, 65);
               b[2] = NLoginCore_241.B("ÿýîðĝĞñćĥûĠğÿëêĦīīīĞĂÿüý", (byte)21, 66);
               b[3] = NLoginCore_324.E("ԦԟՄԛՂԬԼԹՅԍԲԓԧՂՆՕԯԻԬ՝ԸՖՑԶԫԜԜ՛Բ՜ԨՁ", (byte)21, 69);
               b[4] = NLoginCore_232.B("ĂĚĘĐøæĥĦăĤĜĀćùğıíġĒĥĲĥüý", (byte)21, 66);
               b[5] = NLoginCore_397.B("ĂĚĘĐøæĥĦăĤĜĀćùğıíġĒĥĲĥüý", (byte)21, 66);
               b[6] = NLoginCore_223.D("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 68);
               b[7] = NLoginCore_530.D("ѪцСаЪѲѮѣѦщдђзѱѮкњѱѬоѳъчш", (byte)21, 68);
               b[8] = NLoginCore_453.F("ԧԥԖԘՅՆԙԯՍԣՈՇԧԓԒՎՓՓՓՆԪԧԤԥ", (byte)21, 70);
               b[9] = NLoginCore_110.F("ԪՂՀԸԠԎՍՎԫՌՄԨԯԡՇՙԕՉԺՍ՚ՍԤԥ", (byte)21, 70);
               b[10] = NLoginCore_110.C("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 67);
               b[11] = NLoginCore_387.D("ѪцСаЪѲѮѣѦщдђзѱѮкњѱѬоѳъчш", (byte)21, 68);
               b[12] = NLoginCore_427.F("ԹԾԽՀԞՃԍԎԢԧԠԙ", (byte)21, 70);
               b[13] = NLoginCore_141.E("ԹԾԽՀԞՃԍԎԢԧԠԙ", (byte)21, 69);
               b[14] = NLoginCore_173.C("ѫзљсфмпсѬюѭм", (byte)21, 67);
               b[15] = NLoginCore_575.F("ՊԁՍԖԼԿԤԬՇՑԋԙ", (byte)21, 70);
               b[16] = NLoginCore_110.A("đîĀïĎĒàđĩĠþĭĚġĆÿðêîĈĩďüý", (byte)21, 65);
               b[17] = NLoginCore_324.A("ğČĢüĂăĨĂĆÿĪèĬĘìĪıñāĎĲĥüý", (byte)21, 65);
               b[18] = NLoginCore_127.B("ĔėĀóßĄæçĪëČñ", (byte)21, 66);
               b[19] = NLoginCore_451.C("ѭчјяѱЬќЦгѲѕѤзѤѯгъмѻѡѭѰчш", (byte)21, 67);
               b[20] = NLoginCore_127.B("ĕÙõ÷óûòóáĤĪĥøÿĭëëòĔĊĄÿüý", (byte)21, 66);
               b[21] = NLoginCore_232.E("ԓԘԼԵՄԚԘԎՇԢԧԓՏԶԭՒԦ\u0530Ԧԗ՛՝Ԥԥ", (byte)21, 69);
               b[22] = NLoginCore_427.B("đĖĕĘöěåæúÿøñ", (byte)21, 66);
               b[23] = NLoginCore_183.F("ՇԣӾԍԇՏՋՀՃԦԑԯԔՎՋԗԷՎՉԛՐԧԤԥ", (byte)21, 70);
               b[24] = NLoginCore_232.C("ќѡѠѣсѦабхъум", (byte)21, 67);
               b[25] = NLoginCore_127.D("ѦћрлѡнхфаЭѐябєїєыѻѠѠїњчш", (byte)21, 68);
               b[26] = NLoginCore_433.A("ČĘĖăøäēûĞĝĆĢĀĩħçěìħİĈÿüý", (byte)21, 65);
               b[27] = NLoginCore_427.E("ԴՀԾԫԠԌԻԣՆՅԯԿԵԔԘԘՔԱՖԼՎԷԤԥ", (byte)21, 69);
               b[28] = NLoginCore_471.B("ČĘĖăøäēûĞĝĄģąĚĆĮĝýīĀħĦĎĖĻăöįĪĖŀľ", (byte)21, 66);
               b[29] = NLoginCore_110.E("ԿՁԚԥԦՂԭՂՎԳՏՎԲԶԩՓԑԶՙԩԵԴՏԼԟԠդբԺԠԱԡ", (byte)21, 69);
               b[30] = NLoginCore_384.C("њѬЦЬаѢѧѬѦоЮм", (byte)21, 67);
               b[31] = NLoginCore_521.E("ԸԂՀԸԻՇՐԝԏՐԓԙ", (byte)21, 69);
               b[32] = NLoginCore_471.D("жѮЫШэњѩмгїѭм", (byte)21, 68);
               b[33] = NLoginCore_183.B("ðđøĄĜ÷ĖĄīğøñ", (byte)21, 66);
               b[34] = NLoginCore_004.D("ћХѣћўѪѳрвѳжм", (byte)21, 68);
               b[35] = NLoginCore_092.D("іѧСѨѦѲцѯѰѱѱм", (byte)21, 68);
               b[36] = NLoginCore_201.C("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 67);
               b[37] = NLoginCore_232.A("ğûÖåßħģĘěþéćìĦģïďĦġóĨÿüý", (byte)21, 65);
               b[38] = NLoginCore_451.C("њѬЦЬаѢѧѬѦоЮм", (byte)21, 67);
               b[39] = NLoginCore_397.C("ћХѣћўѪѳрвѳжм", (byte)21, 67);
               b[40] = NLoginCore_427.C("жѮЫШэњѩмгїѭм", (byte)21, 67);
               b[41] = NLoginCore_397.D(
                  "ШтЪѥѰшаѧѡфџЪѴѥьѮѶѭнҀѠѱѓѾфњѿѽѨѽѨщ҆ҁѪюѠшѫъѫҌҍђѥѳѣ҇҇ѻўѼҒ҃ҝѬҝѽң҃ѿѾѴ҇҅ѿҚҊҌҩѱҫѱңҁғѶҒҦ҅ҰғҔқѿһѻұһѿӇҽҀҥғҥҌҡӅӍӐӄӏӀҋӎҶҔҙұҮҸҺӇҨӠӋӐҧҨ", (byte)21, 68
               );
               b[42] = NLoginCore_521.F("ԸԋԼԅԫԫԱՌԩՓԴԙ", (byte)21, 70);
               b[43] = NLoginCore_530.A("Ý÷ßĚĥýåĜĖùĔßĩĚāģīĢòĵĕĦĈĳùďĴĲĝĲĝþĻĶğăĕýĠÿĠŁłćĚĨĘļļİēıŇĸŒġŒĲŘĸĴĳĩļĺĴŏĿŁŞĦŠĦŘķŜŠŜşśōŲŊŊűŖŒĶŹŕĲŔŌŹŐřĸşžŗşůŞŅŃŷŠő", (byte)21, 65);
               b[44] = NLoginCore_397.C("УинјѥюЯмгрЩвѱѮѼщѓшѮї҂Ҁчш", (byte)21, 67);
               b[45] = NLoginCore_451.E("ԸԋԼԅԫԫԱՌԩՓԴԙ", (byte)21, 69);
               b[46] = NLoginCore_091.E("ԢԊԫԸԅՀՎՆՁՐԎԪԷՊԯՐՒԺՇ՜՞ԷԤԥ", (byte)21, 69);
               b[47] = NLoginCore_092.B("ĖüÿĝîğýèĤýĕġüīèïíðĄĳģĢģĩĩĺęïĘ÷ĮĻįÿėįĶĴĜńēěąėŇğĚĭđĢġđĒŊŀłłŘŋĮōĖĸĻľĞĹĽŔĸĽŘŧŗīı", (byte)21, 66);
               b[48] = NLoginCore_384.B("ĖøĂõĔßĆğĖâĖñ", (byte)21, 66);
               b[49] = NLoginCore_453.D("ьзѢкюЮнѧѬѪбѵезѭчмѶѠѮслєкўоѸѸѨѩно", (byte)21, 68);
               b[50] = NLoginCore_027.B("ðüýĂÝĠçòéüĕäĆúìĀġčĞċĭÿüý", (byte)21, 66);
               b[51] = NLoginCore_223.C("ьзѢкюЮнѧѬѪбѵезѭчмѶѠѮслєкўоѸѸѨѩно", (byte)21, 67);
               b[52] = NLoginCore_553.B("ìċđđĂäęáħûþČĪėđĚýðģĬħďüý", (byte)21, 66);
               b[53] = NLoginCore_141.E("ԿՁԚԥԦՂԭՂՎԳՎՅԵԢԶԤԧՅԪՅԨ՛ՁԟԺԷԢԽԺԶԤՙԠըԦՙծժՁթՁՄծԹ", (byte)21, 69);
               b[54] = NLoginCore_433.D("рэюнэѯмѕбЮѨѕиїкюјыѿќрьѝѭ҅ѳѻ҅є҃ѓфџўѿю҄Ѽѝџѳѷҍќ", (byte)21, 68);
               b[55] = NLoginCore_183.A("üăęåÿÙĄĄĝġĀñ", (byte)21, 65);
               b[56] = NLoginCore_559.F("ՆԔԩՄԫԮԞՆԈԲԤԙ", (byte)21, 70);
               b[57] = NLoginCore_387.D("ѪсСчќяѫсѓгЮѮѣљѩѱжёѷѯҀѶѻрнїљіџѿѹыуъѣц҉ѫѩѱ҄ҁ҅҂ҚҗѹѥҕњҕѻѫҞ҂ҀѢҠҟѤѻѩѿқѤҎѪҭҥҞҝґ҅ѾґҖѸ҈ҌҐ҅ҶҩѼҘҰ҇҈", (byte)21, 68);
               b[58] = NLoginCore_446.E("ԅԔԧԙԬԌԪԋԊՂԒԪՄԮՏԬՎԲԤ՚Օՠ՟ԓԻԠԽՎգՐՄԤ", (byte)21, 69);
               b[59] = NLoginCore_433.D("ѧШцѥщпЭЪўѩѡдѤѮѣѪѻаюѳћъчш", (byte)21, 68);
               b[60] = NLoginCore_138.D("ѧШцѥщпЭЪўѩѤѬишѫѶлѳћѯьњчш", (byte)21, 68);
               b[61] = NLoginCore_201.A("ĚÚĚąâýóĉĉħÞßĞýĐĤĮĬýćāĵüý", (byte)21, 65);
               b[62] = NLoginCore_453.F("ԢԊԫԸԅՀՎՆՁՐԎԪԷՊԯՐՒԺՇ՜՞ԷԤԥ", (byte)21, 70);
               b[63] = NLoginCore_127.D("ѡчъѨйѪшгѯшѠѬчѶгкиляѾѮѭѮѴѴ҅Ѥкѣтѹ҆ѺъѢѺҁѿѧҏўѦѐѢҒѪѥѸќѭѬќѝҕҋҍҍңҖѹҘѡ҃҆҉ѩ҄҈ҟ҃҈ңҲҢѶѼ", (byte)21, 68);
               b[64] = NLoginCore_183.C("ЦтьЦшЯђцюЭуѸйѥивгнѭѯѯтѺѺѳцѣђѴмҌѫѧѬя҄ѦѝџґѶѬѤ҆ѺҎѹѨҎўѷѾѿѺѧѨ", (byte)21, 67);
               b[65] = NLoginCore_471.A("Û÷āÛýäćûăâøĭîĚíçèòĢĤĤ÷įįĨûĘćĩñŁĠĂüēĶĜăĜņĆąĠĈĎāŏĢĥħŔĦĮğĜĝ", (byte)21, 65);
               break;
            case 1:
               b[0] = NLoginCore_027.F("ԷԂԉՁԖԁԐԙՀԫՈԭԏԖԕԤԵԵՌԮԦԷԤԥ", (byte)21, 70);
               b[1] = NLoginCore_127.B("ïõĜĖßĒÿüēīĄüĭĘíěİďĒĢñéĦĄĳûòóěďĮĚ", (byte)21, 66);
               b[2] = NLoginCore_201.B("ÿýîðĝĞñćĥûĠõøüüĉíēĄĭģħĆčģĬĄķğĐļā", (byte)21, 66);
               b[3] = NLoginCore_575.B("þ÷ĜóĚĄĔđĝåĊëÿĚĞĭćēĄĵĐĩïĢĭıĬĆøüŀ÷", (byte)21, 66);
               b[4] = NLoginCore_530.C("эѥѣћубѰѱюѯѦеѹуѣціѫњўѹҀчш", (byte)21, 67);
               b[5] = NLoginCore_110.B("ĂĚĘĐøæĥĦăĤěçíĈâùĞăĪõđĥüý", (byte)21, 66);
               b[6] = NLoginCore_110.D("жлџјѧнлбѪхъщѴѱѕЮўоєїїҀчш", (byte)21, 68);
               b[7] = NLoginCore_004.E("ՇԣӾԍԇՏՋՀՃԦԏԡՁԐԥ\u0530ԵՉՇԜՎԧԤԥ", (byte)21, 69);
               b[8] = NLoginCore_127.B("ÿýîðĝĞñćĥûġþìċĐëĐěġĂñĀĕıīĚĘĹĹĴĨĘ", (byte)21, 66);
               b[9] = NLoginCore_427.F("ԪՂՀԸԠԎՍՎԫՌՄԡԤԥՖԥ\u0558ԬՅ\u0557ՊԧԤԥ", (byte)21, 70);
               b[10] = NLoginCore_453.B("ëðĔčĜòðæğúüĜĆįĂûĄĠòýğÿüý", (byte)21, 66);
               b[11] = NLoginCore_138.D("ѪцСаЪѲѮѣѦщдЪщѦѩѕђџбѠйҁсѸнѐѠѼљћцҊ", (byte)21, 68);
               b[12] = NLoginCore_183.F("ՇՄԭԈՌԥԝԦԍԭԴԙ", (byte)21, 70);
               b[13] = NLoginCore_521.B("ċěĎčãěęâÜüĈñ", (byte)21, 66);
               b[14] = NLoginCore_324.E("ՆԔԵԽԡԦՃՇԾԞԧԶԯՕԬԖՂԕ\u0530ՈԖԧԤԥ", (byte)21, 69);
               b[15] = NLoginCore_553.B("ĊđĚčæĕĖæīĬĤěĘĝĥïıûċĴăĵüý", (byte)21, 66);
               b[16] = NLoginCore_138.E("ԹԖԨԗԶԺԈԹՑՈԧԓԒԔՓԏՔԭԧ\u0557Ռ՝Ԥԥ", (byte)21, 69);
               b[17] = NLoginCore_451.F("ՇԴՊԤԪԫՐԪԮԧՒՑՕՇՙՉԕԴԽԲՙՍԤԥ", (byte)21, 70);
               b[18] = NLoginCore_530.F("ԸՂԚԸԜԛԟԲԎԬԜԙ", (byte)21, 70);
               b[19] = NLoginCore_183.E("ՊԤԵԬՎԉԹԃԐՏ\u0530ԾԪՀԏԧՕԍԤԘ\u0530ՑԮՒԺԿ՚զՑզԧ՚", (byte)21, 69);
               b[20] = NLoginCore_324.E("ԽԁԝԟԛԣԚԛԉՌՓՊԖԮՇԓԓՉՍԺԲՍԤԥ", (byte)21, 69);
               b[21] = NLoginCore_521.F("ԓԘԼԵՄԚԘԎՇԢԤՆՊԒԕՃԷԻՔԼՇ՝Ԥԥ", (byte)21, 70);
               b[22] = NLoginCore_127.D("ЬщѡёёмџѰпѤчм", (byte)21, 68);
               b[23] = NLoginCore_433.A("ğûÖåßħģĘěþèëĠĩġĠĤıĆĊöĭėĩĈøûīğĔđł", (byte)21, 65);
               b[24] = NLoginCore_433.A("ðĂĀĐđěĦĆēĞôñ", (byte)21, 65);
               b[25] = NLoginCore_092.A("ěĐõðĖòúùåâĆģîĆčĝĉĝČġÿÿüý", (byte)21, 65);
               b[26] = NLoginCore_471.E("ԴՀԾԫԠԌԻԣՆՅԯԏԯԬԭՏԶԹԘԛԩ՝Ԥԥ", (byte)21, 69);
               b[27] = NLoginCore_446.D("їѣѡюуЯўцѩѨђфхйхЮљцѳѩѽѷѢѴљѳѲ҄ѢѣѨљ", (byte)21, 68);
               b[28] = NLoginCore_091.C("їѣѡюуЯўцѩѨяѮѐѥёѹѨшѶыѲѺѠѳѕо҃ўѷунф", (byte)21, 67);
               b[29] = NLoginCore_183.D("ѢѤншщѥѐѥѱіѲѱѕљьѶдљѼьјјьљѭѹўѴѵѓѽы", (byte)21, 68);
               b[30] = NLoginCore_521.D("ъРЧѐЭбѴќубѣѭѬућќнищёѸҀчш", (byte)21, 68);
               b[31] = NLoginCore_183.B("ģăĞĜÜĖĩěÿĉĪñ", (byte)21, 66);
               b[32] = NLoginCore_141.D("ѨРѧЮЬњѨрѧёёЯжгѧѓцќўҀыњчш", (byte)21, 68);
               b[33] = NLoginCore_471.C("ютњѝўќъЭѴыѤаѶѦЭѴдѯэўрњчш", (byte)21, 67);
               b[34] = NLoginCore_076.B("ĔċÛ×ēäĢĤè÷Čñ", (byte)21, 66);
               b[35] = NLoginCore_471.F("ՃԦԈՂԯԯԭՆՐՋԋԌՖՏԔ\u0530\u0530ԩԫՏԷԧԤԥ", (byte)21, 70);
               b[36] = NLoginCore_521.D("жлџјѧнлбѪхъѫѵѱѵзѳѺяўѵњчш", (byte)21, 68);
               b[37] = NLoginCore_324.C("ѪцСаЪѲѮѣѦщгаЫзьцзѕѰоѪътѮѭѢфѳ҂҄ћ҈", (byte)21, 67);
               b[38] = NLoginCore_530.C("сшЭпёвѢЯЬэѐѯѐабёїнѠѹѰњчш", (byte)21, 67);
               b[39] = NLoginCore_384.B("ïėġęãòâăáĞĚñ", (byte)21, 66);
               b[40] = NLoginCore_027.F("ԸԄՋӿԩՉԸԡԭԓ\u0530ԙ", (byte)21, 70);
               b[41] = NLoginCore_451.F(
                  "ԅԟԇՂՍԥԍՄԾԡԼԇՑՂԩՋՓՊԚ՝ԽՎ\u0530՛ԡԷ՜՚Յ՚ՅԦգ՞ՇԫԽԥՈԧՈթժԯՂՐՀդդ\u0558ԻՙկՠպՉպ՚րՠ՜՛Ցդբ՜շէթֆՎֈՎր՞հՓկփբ֍հձո՜֘\u0558֎֘՜֤֚՝ւհւթվ֢֪֭֡֬֝ը֫\u0590յ֥֦֯ոփִ֬֯հ֭քօ",
                  (byte)21,
                  70
               );
               b[42] = NLoginCore_241.C("љѥфџЪвЭѲєѨчм", (byte)21, 67);
               b[43] = NLoginCore_091.B(
                  "Ý÷ßĚĥýåĜĖùĔßĩĚāģīĢòĵĕĦĈĳùďĴĲĝĲĝþĻĶğăĕýĠÿĠŁłćĚĨĘļļİēıŇĸŒġŒĲŘĸĴĳĩļĺĴŏĿŁŞĦŠĦŘķŜŠŜşśōŲŊŊűŖŒĶŹŕĲŔŌŹŐřŪŵŽŤżŶœŢņşŋő", (byte)21, 66
               );
               b[44] = NLoginCore_553.E("ԀԕԚԵՂԫԌԙԐԝԆՔՏԒԲՆԑՏԹԷԙԧԤԥ", (byte)21, 69);
               b[45] = NLoginCore_530.F("ԫԛԶԛՀՄՄԺԑԱԓԙ", (byte)21, 70);
               b[46] = NLoginCore_241.C("хЭюћШѣѱѩѤѳаЪђіѤїѱіовсѱѓѱнѣҀѡѶ҇Ѵї", (byte)21, 67);
               b[47] = NLoginCore_027.D("ѡчъѨйѪшгѯшѠѬчѶгкиляѾѮѭѮѴѴ҅Ѥкѣтѹ҆ѺъѢѺҁѿѧҏўѦѐѢҒѪѥѸќѭѬќѝҕҋҍҍңҖѹҘѡ҃҆҉ҘҍҰҦғѯ҅ѾҦѲѼ", (byte)21, 68);
               b[48] = NLoginCore_138.F("ԣԢԪԇԮԡԘԙԠԽԮԎՓԉԧԹՔՐԤԭԩԷԤԥ", (byte)21, 70);
               b[49] = NLoginCore_076.F("ԩԔԿԗԫԋԚՄՉՇԎՒԒԔՊԤԙՓԽՋԞԕԜԷԮԳԶՐՖ\u0557գէ", (byte)21, 70);
               b[50] = NLoginCore_092.B("ðüýĂÝĠçòéüčĢĈĝĂĞêĬēĶĵČġĉċĮĚĽĲĐčĝ", (byte)21, 66);
               b[51] = NLoginCore_397.F("ԩԔԿԗԫԋԚՄՉՇԎՒԒԔՊԤԙՓԽՋԞԚՌ՛ԞԱԸԾդԧՇԩ", (byte)21, 70);
               b[52] = NLoginCore_223.C("зіќќэЯѤЬѲцчѤѣѵѴѧѺомѫїъчш", (byte)21, 67);
               b[53] = NLoginCore_138.A("ėęòýþĚąĚĦċĦĝčúĎüÿĝĂĝĀĳę÷ĒďúĕĒĎüıĕġĠĒĆĢġÿĞġĠđ", (byte)21, 65);
               b[54] = NLoginCore_324.B("õĂăòĂĤñĊæãĝĊíČïăčĀĴđõāĒĢĺĨİĺĉĸĈùğńčĔĸđăĸĈĂľčįĽğĭĤċĒġőğĜĝ", (byte)21, 66);
               b[55] = NLoginCore_223.A("ĘûòĖáúĤğĥāĄñ", (byte)21, 65);
               b[56] = NLoginCore_427.B("ÚčĕÝďĄăćôĠĈñ", (byte)21, 66);
               b[57] = NLoginCore_521.D("ѪсСчќяѫсѓгЮѮѣљѩѱжёѷѯҀѶѻрнїљіџѿѹыуъѣц҉ѫѩѱ҄ҁ҅҂ҚҗѹѥҕњҕѻѫҞ҂ҀѢҠҟѤѻѩѿқѤҎѪҭҥҞҝґ҅ѾҒҰүҥҍҦѳҚһҀҖӀ҇҈", (byte)21, 68);
               b[58] = NLoginCore_027.D("ШзъмяЯэЮЭѥеэѧёѲяѱѕчѽѸлясфѹѣєѹѝѡц", (byte)21, 68);
               b[59] = NLoginCore_387.C("ѧШцѥщпЭЪўѩѣцъюЭѺѝнььњњчш", (byte)21, 67);
               b[60] = NLoginCore_127.A("ĜÝûĚþôâßēĞėĂĈĉÿíĭĆĠëąĮĪĭĕććüįĝŀĺ", (byte)21, 65);
               b[61] = NLoginCore_397.D("ѥХѥѐЭшоєєѲЭъшдѵѨѽѹѭизњчш", (byte)21, 68);
               b[62] = NLoginCore_201.A("úâăĐÝĘĦĞęĨããäéąĩûħċēĎēîİĚįĻĐùĴġį", (byte)21, 65);
               b[63] = NLoginCore_110.F("ԾԤԧՅԖՇԥԐՌԥԽՉԤՓԐԗԕԘԬ՛ՋՊՋՑՑբՁԗՀԟՖգ\u0557ԧԿ\u0557՞՜ՄլԻՃԭԿկՇՂՕԹՊՉԹԺղըժժրճՖյԾՠգԼՋքփշզևհ՛փֆՙ", (byte)21, 70);
               b[64] = NLoginCore_427.B("Û÷āÛýäćûăâøĭîĚíçèòĢĤĤ÷įįĨûĘćĩñŁĠĜġĄĹěĒĔņīġĚŅĊĹěŐňĩČİďŅĜĝ", (byte)21, 66);
               b[65] = NLoginCore_397.F("ԃԟԩԃԥԌԯԣԫԊԠՕԖՂԕԏԐԚՊՌՌԟ\u0557\u0557ՐԣՀԯՑԙթՈԪԤԻ՞ՄԫՄծԮԭՉնԨՋխոԺԭՒԵԵխՄՅ", (byte)21, 70);
               break;
            case 2:
               b[0] = NLoginCore_453.D("ѫэхЭѪяѫсѯхЯѳбѧѸэйеївѢѷѿлуѺјѽуҊѸѽ", (byte)21, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.A("ØùĕÝüùöđâĤĜåĜĤĠāĬĝĢĄăĥüý", (byte)21, 65);
         }
      }
   }

   public int n() {
      return this.a.n();
   }

   @Generated
   public NLoginCore_204 a() {
      return this.a;
   }

   @Nullable
   @Generated
   public NLoginCore_151 a() {
      return this.a;
   }

   static {
      b();
      String[] var10000 = new String[im];
      var10000[in] = NLoginCore_158.u(a(io, ip ^ iq));
      var10000[ir] = NLoginCore_158.u(a(is, it));
      j = Arrays.asList(var10000);
   }

   private synchronized void d(boolean var1) {
      if (var1) {
         this.al();
      }

      if (this.a == null) {
         throw new IllegalStateException(a(gs, gt ^ gu));
      } else {
         this.a.a(this.a);
         if (this.a.ad()) {
            try {
               File var2 = new File(this.b.e() + File.separator + a(gv, gw ^ gx), this.b.q() + a(gy, gz ^ ha));
               String var3 = this.a.N();
               if (!var2.exists() || var3 != null && !NLoginCore_342.d.a(var2, var3)) {
                  this.b.a().a().aq();
               }
            } catch (Exception var4) {
               NLoginCore_370.c(a(hb, hc ^ hd));
            }
         }
      }
   }

   @Nullable
   @Generated
   public NLoginCore_109 a() {
      return this.a;
   }

   public synchronized void ai() {
      this.aW = null;
      this.aj();
      NLoginCore_482 var1 = this.b.a().a();
      var1.a(a(ah & ai, aj));
      var1.ag();
   }

   @Nullable
   @Generated
   String J() {
      return this.aW;
   }

   public NLoginCore_151 a(NLoginCore_305 var1, String var2, boolean var3) {
      return this.a(var1, var2, var3, NLoginCore_305::a);
   }

   public void a(NLoginInterface_022 var1) {
      this.o = System.currentTimeMillis();
      this.d((boolean)fy);
      var1.a(() -> {
         try {
            int var1x = this.a.b(a(ht, hu), hv);
            if (var1x < hw || var1x > hx) {
               var1x = hy;
            }

            long var2 = System.currentTimeMillis();
            if (var2 - this.o >= var1x * hz) {
               this.o = var2;
               this.d((boolean)ia);
            }
         } catch (Throwable var4) {
            if (!(var4 instanceof IllegalStateException) || !a(ib & ic, id).equals(var4.getMessage())) {
               NLoginCore_370.c(a(ie, var_if ^ ig), var4);
            }
         }
      }, 1L, 1L, TimeUnit.SECONDS);
   }

   public void a(NLoginCore_204 var1) {
      this.a = var1;
      this.b.a().a().a(a(ac, ad ^ ae), (byte)var1.ordinal()).ag();
   }

   @Nullable
   @Generated
   public NLoginCore_180 a() {
      return this.a;
   }
}
