package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_329 implements NLoginInterface_005 {
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
   p,
   q,
   r,
   s,
   t;

   public static final NLoginCore_208 i = new NLoginCore_208(a(NLoginCore_329.hp, NLoginCore_329.hq ^ NLoginCore_329.hr), values().length);
   public final NLoginCore_474 i;
   private final Object q;
   private static String[] ZKM_STR_A = new String[NLoginCore_329.y];
   private static String[] ZKM_STR_B = new String[NLoginCore_329.z];
   private static long c;
   private static int a = 4608 >>> 73 | 4608 << -73;
   private static int b = 262144 >>> 242 | 262144 << ~242 + 1;
   private static int c = 0 >>> 238 | 0 << -238;
   private static int d = (1280 >>> 134 | 1280 << -134) & -1;
   private static int e = Integer.reverse(0);
   private static int f = (16384 >>> 14 | 16384 << -14) & -1;
   private static int g = Integer.reverse(1073741824);
   private static int h = Integer.reverse(-1073741824);
   private static int i = (131072 >>> 111 | 131072 << -111) & -1;
   private static int j = Integer.reverse(-1610612736);
   private static int k = (6291456 >>> 148 | 6291456 << -148) & -1;
   private static int l = Integer.reverse(-536870912);
   private static int m = 1 >>> 157 | 1 << ~157 + 1;
   private static int n = (18 >>> 225 | 18 << ~225 + 1) & -1;
   private static int o = (80 >>> 227 | 80 << -227) & -1;
   private static int p = -1073741822 >>> 126 | -1073741822 << -126;
   private static int q = (24 >>> 129 | 24 << -129) & -1;
   private static int r = Integer.reverse(-1342177280);
   private static int s = 28 >>> 1 | 28 << -1;
   private static int t = -2147483641 >>> 127 | -2147483641 << -127;
   private static int u = (524288 >>> 47 | 524288 << -47) & -1;
   private static int v = (1088 >>> 102 | 1088 << -102) & -1;
   private static int w = Integer.reverse(1207959552);
   private static int x = Integer.reverse(-939524096);
   private static int y = Integer.reverse(-1275068416);
   private static int z = (90 >>> 1 | 90 << -1) & -1;
   private static int aa = 0 >>> 234 | 0 << -234;
   private static long ab = Long.reverse(-1581042181184392892L);
   private static long ac = Long.reverse(-1585267068834414592L);
   private static int ad = 0 >>> 238 | 0 << -238;
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int af = Integer.reverse(0);
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(-1581042181184392892L);
   private static long ai = Long.reverse(-1585267068834414592L);
   private static int aj = Integer.reverse(1073741824);
   private static long ak = Long.reverse(-1581042181184392892L);
   private static long al = Long.reverse(-1585267068834414592L);
   private static int am = (131072 >>> 241 | 131072 << -241) & -1;
   private static int an = (16 >>> 4 | 16 << ~4 + 1) & -1;
   private static int ao = Integer.reverse(0);
   private static int ap = Integer.reverse(-1073741824);
   private static long aq = Long.reverse(4224887650021700L);
   private static int ar = 1024 >>> 168 | 1024 << ~168 + 1;
   private static long as = Long.reverse(4224887650021700L);
   private static int at = Integer.reverse(1073741824);
   private static int au = 16384 >>> 142 | 16384 << -142;
   private static int av = Integer.reverse(0);
   private static int aw = Integer.reverse(-1610612736);
   private static long ax = Long.reverse(-1581042181184392892L);
   private static long ay = Long.reverse(-1585267068834414592L);
   private static int az = (2048 >>> 139 | 2048 << -139) & -1;
   private static int ba = (6 >>> 32 | 6 << -32) & -1;
   private static int bb = Integer.reverse(-1);
   private static long bc = Long.reverse(4224887650021700L);
   private static int bd = Integer.reverse(-1073741824);
   private static int be = Integer.reverse(Integer.MIN_VALUE);
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = Integer.reverse(0);
   private static int bh = Integer.reverse(-536870912);
   private static long bi = Long.reverse(4224887650021700L);
   private static int bj = (0 >>> 29 | 0 << -29) & -1;
   private static int bk = Integer.reverse(268435456);
   private static long bl = Long.reverse(-1581042181184392892L);
   private static long bm = Long.reverse(-1585267068834414592L);
   private static int bn = Integer.reverse(536870912);
   private static int bo = Integer.reverse(Integer.MIN_VALUE);
   private static int bp = (0 >>> 206 | 0 << ~206 + 1) & -1;
   private static int bq = Integer.reverse(-1879048192);
   private static long br = Long.reverse(4224887650021700L);
   private static int bs = Integer.reverse(1342177280);
   private static int bt = (-1 >>> 51 | -1 << ~51 + 1) & -1;
   private static long bu = Long.reverse(4224887650021700L);
   private static int bv = Integer.reverse(-805306368);
   private static long bw = Long.reverse(4224887650021700L);
   private static int bx = Integer.reverse(-1610612736);
   private static int by = Integer.reverse(Integer.MIN_VALUE);
   private static int bz = (0 >>> 236 | 0 << -236) & -1;
   private static int ca = Integer.reverse(805306368);
   private static int cb = (-1 >>> 94 | -1 << ~94 + 1) & -1;
   private static long cc = Long.reverse(4224887650021700L);
   private static int cd = Integer.reverse(-1342177280);
   private static int ce = -1 >>> 185 | -1 << ~185 + 1;
   private static long cf = Long.reverse(4224887650021700L);
   private static int cg = ('\ue000' >>> 172 | 57344 << ~172 + 1) & -1;
   private static long ch = Long.reverse(-1581042181184392892L);
   private static long ci = Long.reverse(-1585267068834414592L);
   private static int cj = (96 >>> 100 | 96 << ~100 + 1) & -1;
   private static int ck = Integer.reverse(Integer.MIN_VALUE);
   private static int cl = 0 >>> 251 | 0 << -251;
   private static int cm = Integer.reverse(-268435456);
   private static long cn = Long.reverse(-1581042181184392892L);
   private static long co = Long.reverse(-1585267068834414592L);
   private static int cp = 1 >>> 188 | 1 << ~188 + 1;
   private static long cq = Long.reverse(-1581042181184392892L);
   private static long cr = Long.reverse(-1585267068834414592L);
   private static int cs = Integer.reverse(-536870912);
   private static int ct = 131072 >>> 145 | 131072 << ~145 + 1;
   private static int cu = Integer.reverse(0);
   private static int cv = 69632 >>> 108 | 69632 << -108;
   private static long cw = Long.reverse(4224887650021700L);
   private static int cx = (2304 >>> 167 | 2304 << -167) & -1;
   private static long cy = Long.reverse(-1581042181184392892L);
   private static long cz = Long.reverse(-1585267068834414592L);
   private static int da = Integer.reverse(-939524096);
   private static long db = Long.reverse(-1581042181184392892L);
   private static long dc = Long.reverse(-1585267068834414592L);
   private static int dd = (33554432 >>> 150 | 33554432 << -150) & -1;
   private static int de = 128 >>> 231 | 128 << ~231 + 1;
   private static int df = 0 >>> 178 | 0 << -178;
   private static int dg = Integer.reverse(671088640);
   private static long dh = Long.reverse(-1581042181184392892L);
   private static long di = Long.reverse(-1585267068834414592L);
   private static int dj = Integer.reverse(-1476395008);
   private static int dk = Integer.reverse(-1);
   private static long dl = Long.reverse(4224887650021700L);
   private static int dm = (-2147483643 >>> 254 | -2147483643 << -254) & -1;
   private static long dn = Long.reverse(4224887650021700L);
   private static int var_do = Integer.reverse(-1879048192);
   private static int dp = 134217728 >>> 251 | 134217728 << -251;
   private static int dq = Integer.reverse(0);
   private static int dr = Integer.reverse(-402653184);
   private static long ds = Long.reverse(4224887650021700L);
   private static int dt = (393216 >>> 78 | 393216 << ~78 + 1) & -1;
   private static long du = Long.reverse(-1581042181184392892L);
   private static long dv = Long.reverse(-1585267068834414592L);
   private static int dw = 40 >>> 194 | 40 << -194;
   private static int dx = Integer.reverse(Integer.MIN_VALUE);
   private static int dy = 16777216 >>> 88 | 16777216 << ~88 + 1;
   private static int dz = (0 >>> 219 | 0 << -219) & -1;
   private static int ea = (-1879048191 >>> 156 | -1879048191 << ~156 + 1) & -1;
   private static int eb = Integer.reverse(-1);
   private static long ec = Long.reverse(4224887650021700L);
   private static int ed = '耀' >>> 175 | 32768 << -175;
   private static int ee = (6815744 >>> 242 | 6815744 << -242) & -1;
   private static long ef = Long.reverse(4224887650021700L);
   private static int eg = Integer.reverse(-805306368);
   private static int eh = Integer.reverse(Integer.MIN_VALUE);
   private static int ei = Integer.reverse(Integer.MIN_VALUE);
   private static int ej = 0 >>> 170 | 0 << ~170 + 1;
   private static int ek = 13824 >>> 169 | 13824 << -169;
   private static long el = Long.reverse(4224887650021700L);
   private static int em = 16 >>> 4 | 16 << ~4 + 1;
   private static int en = Integer.reverse(939524096);
   private static long eo = Long.reverse(-1581042181184392892L);
   private static long ep = Long.reverse(-1585267068834414592L);
   private static int eq = Integer.reverse(805306368);
   private static int er = Integer.reverse(Integer.MIN_VALUE);
   private static int es = Integer.reverse(0);
   private static int et = 116 >>> 2 | 116 << -2;
   private static long eu = Long.reverse(-1581042181184392892L);
   private static long ev = Long.reverse(-1585267068834414592L);
   private static int ew = 0 >>> 244 | 0 << ~244 + 1;
   private static int ex = Integer.reverse(2013265920);
   private static long ey = Long.reverse(-1581042181184392892L);
   private static long ez = Long.reverse(-1585267068834414592L);
   private static int fa = 54525952 >>> 54 | 54525952 << -54;
   private static int fb = Integer.reverse(Integer.MIN_VALUE);
   private static int fc = '耀' >>> 143 | 32768 << -143;
   private static int fd = (0 >>> 85 | 0 << ~85 + 1) & -1;
   private static int fe = (-2147483633 >>> 159 | -2147483633 << ~159 + 1) & -1;
   private static long ff = Long.reverse(-1581042181184392892L);
   private static long fg = Long.reverse(-1585267068834414592L);
   private static int fh = 4096 >>> 236 | 4096 << -236;
   private static int fi = 1024 >>> 197 | 1024 << ~197 + 1;
   private static long fj = Long.reverse(-1581042181184392892L);
   private static long fk = Long.reverse(-1585267068834414592L);
   private static int fl = Integer.reverse(1879048192);
   private static int fm = 524288 >>> 115 | 524288 << -115;
   private static int fn = Integer.reverse(0);
   private static int fo = (-2080374784 >>> 58 | -2080374784 << ~58 + 1) & -1;
   private static long fp = Long.reverse(-1581042181184392892L);
   private static long fq = Long.reverse(-1585267068834414592L);
   private static int fr = (0 >>> 231 | 0 << -231) & -1;
   private static int fs = 536870914 >>> 220 | 536870914 << ~220 + 1;
   private static long ft = Long.reverse(-1581042181184392892L);
   private static long fu = Long.reverse(-1585267068834414592L);
   private static int fv = Integer.reverse(-268435456);
   private static int fw = Integer.reverse(Integer.MIN_VALUE);
   private static int fx = Integer.reverse(0);
   private static int fy = Integer.reverse(-1006632960);
   private static long fz = Long.reverse(-1581042181184392892L);
   private static long ga = Long.reverse(-1585267068834414592L);
   private static int gb = 134217728 >>> 91 | 134217728 << ~91 + 1;
   private static int gc = Integer.reverse(603979776);
   private static long gd = Long.reverse(-1581042181184392892L);
   private static long ge = Long.reverse(-1585267068834414592L);
   private static int gf = 134217728 >>> 87 | 134217728 << ~87 + 1;
   private static int gg = Integer.reverse(Integer.MIN_VALUE);
   private static int gh = (4194304 >>> 150 | 4194304 << -150) & -1;
   private static int gi = Integer.reverse(0);
   private static int gj = 75776 >>> 235 | 75776 << -235;
   private static int gk = (-1 >>> 136 | -1 << -136) & -1;
   private static long gl = Long.reverse(4224887650021700L);
   private static int gm = Integer.reverse(Integer.MIN_VALUE);
   private static int gn = 1245184 >>> 207 | 1245184 << -207;
   private static long go = Long.reverse(-1581042181184392892L);
   private static long gp = Long.reverse(-1585267068834414592L);
   private static int gq = Integer.reverse(-2013265920);
   private static int gr = (262144 >>> 146 | 262144 << -146) & -1;
   private static int gs = 0 >>> 179 | 0 << -179;
   private static int gt = 4992 >>> 199 | 4992 << ~199 + 1;
   private static long gu = Long.reverse(-1581042181184392892L);
   private static long gv = Long.reverse(-1585267068834414592L);
   private static int gw = 512 >>> 169 | 512 << ~169 + 1;
   private static int gx = Integer.reverse(335544320);
   private static int gy = Integer.reverse(-1);
   private static long gz = Long.reverse(4224887650021700L);
   private static int ha = 1152 >>> 230 | 1152 << -230;
   private static int hb = Integer.reverse(Integer.MIN_VALUE);
   private static int hc = (0 >>> 110 | 0 << ~110 + 1) & -1;
   private static int hd = -2147483628 >>> 223 | -2147483628 << -223;
   private static long he = Long.reverse(-1581042181184392892L);
   private static long hf = Long.reverse(-1585267068834414592L);
   private static int hg = (22020096 >>> 51 | 22020096 << -51) & -1;
   private static int hh = Integer.reverse(-1);
   private static long hi = Long.reverse(4224887650021700L);
   private static int hj = (19 >>> 32 | 19 << -32) & -1;
   private static int hk = 4096 >>> 140 | 4096 << -140;
   private static int hl = Integer.reverse(0);
   private static int hm = Integer.reverse(-738197504);
   private static long hn = Long.reverse(-1581042181184392892L);
   private static long ho = Long.reverse(-1585267068834414592L);
   private static int hp = (5632 >>> 135 | 5632 << -135) & -1;
   private static long hq = Long.reverse(-1581042181184392892L);
   private static long hr = Long.reverse(-1585267068834414592L);

   public boolean aP() {
      return NLoginInterface_005.super.a(this.a());
   }

   @Override
   public boolean ar() {
      return (((!this.i.t() != 0) || NLoginType_008.c().a().n() == a) && this.aP() ? b : c);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_329.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.F("ӤԆԈӨԌԫԣԹԥӴԲԨԶ\u0530ӹԞՀԿԷԽԷԌ", (byte)0, 70), NLoginCore_329.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_559.D("ИХФϧЧУОЧвСϮЬаЩЬвϴހݻݜݯސݾވށތݷޙޙޑЍ", (byte)0, 68) + var1 + NLoginCore_138.E("Ӷ", (byte)0, 69) + var2.toString(), var4);
      }
   }

   @Override
   public Object a() {
      return this.q;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(aa, ab ^ ac);
      int var10003 = ad;
      String[] var10004 = new String[ae];
      var10004[af] = a(ag, ah ^ ai);
      a = new NLoginCore_329(NLoginCore_474.a(var10004), NLoginCore_555.d.name());
      var10002 = a(aj, ak ^ al);
      var10003 = am;
      var10004 = new String[an];
      var10004[ao] = a(ap, aq);
      b = new NLoginCore_329(NLoginCore_474.a(var10004), NLoginCore_555.d.name());
      var10002 = a(ar, as);
      var10003 = at;
      var10004 = new String[au];
      var10004[av] = a(aw, ax ^ ay);
      c = new NLoginCore_329(NLoginCore_474.a(var10004), Boolean.valueOf((az != 0)));
      var10002 = a(ba & bb, bc);
      var10003 = bd;
      int var40 = be;
      String[] var10005 = new String[bf];
      var10005[bg] = a(bh, bi);
      d = new NLoginCore_329(NLoginCore_474.a((var40 != 0), var10005), Boolean.valueOf((bj != 0)));
      var10002 = a(bk, bl ^ bm);
      var10003 = bn;
      var10004 = new String[bo];
      var10004[bp] = a(bq, br);
      e = new NLoginCore_329(NLoginCore_474.a(var10004), a(bs & bt, bu));
      var10002 = a(bv, bw);
      var10003 = bx;
      var10004 = new String[by];
      var10004[bz] = a(ca & cb, cc);
      f = new NLoginCore_329(NLoginCore_474.a(var10004), a(cd & ce, cf));
      var10002 = a(cg, ch ^ ci);
      var10003 = cj;
      var10004 = new String[ck];
      var10004[cl] = a(cm, cn ^ co);
      g = new NLoginCore_329(NLoginCore_474.a(var10004), Collections.emptyList());
      var10002 = a(cp, cq ^ cr);
      var10003 = cs;
      var10004 = new String[ct];
      var10004[cu] = a(cv, cw);
      h = new NLoginCore_329(NLoginCore_474.a(var10004), a(cx, cy ^ cz));
      var10002 = a(da, db ^ dc);
      var10003 = dd;
      var10004 = new String[de];
      var10004[df] = a(dg, dh ^ di);
      i = new NLoginCore_329(NLoginCore_474.a(var10004), a(dj & dk, dl));
      var10002 = a(dm, dn);
      var10003 = var_do;
      var10004 = new String[dp];
      var10004[dq] = a(dr, ds);
      j = new NLoginCore_329(NLoginCore_474.a(var10004), Collections.emptyList());
      var10002 = a(dt, du ^ dv);
      var10003 = dw;
      int var47 = dx;
      var10005 = new String[dy];
      var10005[dz] = a(ea & eb, ec);
      k = new NLoginCore_329(NLoginCore_474.a((var47 != 0), var10005), Boolean.valueOf((ed != 0)));
      var10002 = a(ee, ef);
      var10003 = eg;
      int var48 = eh;
      var10005 = new String[ei];
      var10005[ej] = a(ek, el);
      l = new NLoginCore_329(NLoginCore_474.a((var48 != 0), var10005), Boolean.valueOf((em != 0)));
      var10002 = a(en, eo ^ ep);
      var10003 = eq;
      var10004 = new String[er];
      var10004[es] = a(et, eu ^ ev);
      m = new NLoginCore_329(NLoginCore_474.a(var10004), Boolean.valueOf((ew != 0)));
      var10002 = a(ex, ey ^ ez);
      var10003 = fa;
      int var50 = fb;
      var10005 = new String[fc];
      var10005[fd] = a(fe, ff ^ fg);
      n = new NLoginCore_329(NLoginCore_474.a((var50 != 0), var10005), Boolean.valueOf((fh != 0)));
      var10002 = a(fi, fj ^ fk);
      var10003 = fl;
      var10004 = new String[fm];
      var10004[fn] = a(fo, fp ^ fq);
      o = new NLoginCore_329(NLoginCore_474.a(var10004), Boolean.valueOf((fr != 0)));
      var10002 = a(fs, ft ^ fu);
      var10003 = fv;
      var10004 = new String[fw];
      var10004[fx] = a(fy, fz ^ ga);
      p = new NLoginCore_329(NLoginCore_474.a(var10004), Boolean.valueOf((gb != 0)));
      var10002 = a(gc, gd ^ ge);
      var10003 = gf;
      int var53 = gg;
      var10005 = new String[gh];
      var10005[gi] = a(gj & gk, gl);
      q = new NLoginCore_329(NLoginCore_474.a((var53 != 0), var10005), Boolean.valueOf((gm != 0)));
      var10002 = a(gn, go ^ gp);
      var10003 = gq;
      var10004 = new String[gr];
      var10004[gs] = a(gt, gu ^ gv);
      r = new NLoginCore_329(NLoginCore_474.a(var10004), gw);
      var10002 = a(gx & gy, gz);
      var10003 = ha;
      var10004 = new String[hb];
      var10004[hc] = a(hd, he ^ hf);
      s = new NLoginCore_329(NLoginCore_474.a(var10004), Collections.emptyList());
      var10002 = a(hg & hh, hi);
      var10003 = hj;
      var10004 = new String[hk];
      var10004[hl] = a(hm, hn ^ ho);
      t = new NLoginCore_329(NLoginCore_474.a(var10004), Collections.emptyList());
   }

   @Override
   public NLoginCore_474 a() {
      return this.i;
   }

   private static void b() {
      c = 2489956174397501527L;
      long var0 = c ^ -8057216789137600696L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(12 + 56),
               (byte)(34 + 35),
               (byte)(29 + 54),
               (byte)(25 + 22),
               67,
               (byte)(57 + 9),
               (byte)(17 + 50),
               47,
               (byte)(44 + 36),
               (byte)(72 + 3),
               (byte)(16 + 51),
               (byte)(19 + 64),
               (byte)(18 + 35),
               (byte)(20 + 60),
               (byte)(95 + 2),
               (byte)(64 + 36),
               (byte)(73 + 27),
               (byte)(27 + 78),
               (byte)(56 + 54),
               (byte)(85 + 18)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.A("ƼƝǑǛƽƽǄǦƴǨǖƨǭƺǡǮǁƭǦǏǓǪǦǅǳƲƹƭƴǵǆǲ", (byte)116, 65);
               ZKM_STR_B[1] = NLoginCore_387.A("ƜƲƹǃƴƸƢǣǓǟƽǊǢǎƤƺǣƺǥǫƳƿƵǏǇǥǵǨǪǛǛǨ", (byte)116, 65);
               ZKM_STR_B[2] = NLoginCore_004.C("զՇջօէէծ\u0590՞֒տֈ՟ղւիյթ՛ը֖էդե", (byte)116, 67);
               ZKM_STR_B[3] = NLoginCore_110.A("ƜƲƹǃƴƸƢǣǓǟƼƷǅǧǎƪƮǭǋǰǓǣƺƻ", (byte)116, 65);
               ZKM_STR_B[4] = NLoginCore_004.D("զՇջօէէծ\u0590՞֒ցվ՞ՖղւձՑ֎յՕկր֑\u0590յ֖փւ֨֞թ", (byte)116, 68);
               ZKM_STR_B[5] = NLoginCore_575.C("Ն՜գխ՞բՌ֍ս։զՍթդՐժբհօֈվ֎յռծ֞պկ֗և֗֓", (byte)116, 67);
               ZKM_STR_B[6] = NLoginCore_451.E("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֒վ֖տ֑֓ք֠ռֆֲֳֿ֛֪ׄ\u05ca֜֨֝։֊֘", (byte)116, 69);
               ZKM_STR_B[7] = NLoginCore_091.F("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨վֶ֞֯֏֎ռ֮ոֿ֔\u05c9ְֳֺֺֽ֛֢֛֒֗֘", (byte)116, 70);
               ZKM_STR_B[8] = NLoginCore_453.A("ƴƩƔƸǐǏǜƳƸǓǁǤǭǘƬƿƽǦǋǅƱǉǔƱǱǴƲǴǸǕƺǨǵƽǑǋƿǓǏǸǳǆǃȋǭǙǦǜǬǟǒȎȎǒǲȋșǵǵǫǹȒǰǵ", (byte)116, 65);
               ZKM_STR_B[9] = NLoginCore_110.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨ռ־ִִֿ֛֚֡֓ֆֵ֥֤֙֒֟־\u05cc\u05ceּ׆\u05c8־֎֑\u05cd֎֩\u05c8\u05ca֚֕מֲ֚֟א־ֻֿז֥ם", (byte)116, 69);
               ZKM_STR_B[10] = NLoginCore_091.A("ǖǑǓƬƯƺƲǞƽƦǠƯ", (byte)116, 65);
               ZKM_STR_B[11] = NLoginCore_530.D("՞ՓԾբպչֆ՝բսի֎֗ւՖթէ\u0590յկ՛ճվ՛֛֞՜֢֞տդ֒֟էջյթսչ֢֝հխֵ֗փ\u0590ֆ֖։ռָָձַּֽ֖֠֔քֵֆ։ֲքֆք׆֥֦֮\u05c9\u0590ְ֙", (byte)116, 68);
               ZKM_STR_B[12] = NLoginCore_427.F("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨ռ־ִִֿ֛֚֡֓ֆֲׇֺ֙֫ք֎֢\u0590ֽ֥֥\u058b\u05ceֈׇׁׂ\u05cbֽׄ\u05cb֦֣֤", (byte)116, 70);
               ZKM_STR_B[13] = NLoginCore_453.B("ǈưǣǑƶǗǖƵƧƴǜƯ", (byte)116, 66);
               ZKM_STR_B[14] = NLoginCore_553.B("ƴƩƔƸǐǏǜƳƸǓǁǤǭǘƬƿƽǦǋǅƱǉǔƱǱǴƲǴǸǕƺǨǞǸǸǠǯȅǕȄǒǂǶȋǿȅǧǗǤǨȈǛȊǝǚǛ", (byte)116, 66);
               ZKM_STR_B[15] = NLoginCore_027.F("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨ռ־ִִֿ֛֚֡֓ֆ֙ֈֽ֜֨\u05caׅ־\u05ce֞\u05ca\u05ca֮֍\u05caׂ֨\u05ceֺ֛֚֙ל֣֤", (byte)116, 70);
               ZKM_STR_B[16] = NLoginCore_387.F("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֏ֽ֕\u058cֱֱպօսְִ֒ւַ֢֚ׄ֝֗֟\u05ce\u05ca־֣׃ֱֳּ֖֑בךֽ֩טזֲַלנֹׅא", (byte)116, 70);
               ZKM_STR_B[17] = NLoginCore_076.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨սֈ֭։ֵ֘ցջֻׂ֧ׄ֜\u05cb׃։ֹ֪֥֚֡\u05c8֢֤֬ח֏֬\u05cbְַֺ׆\u05ccזאאיֹֺ֖֜׃", (byte)116, 69);
               ZKM_STR_B[18] = NLoginCore_183.B("ƴƫƛǏǢƝǓƸǨǨƶƯ", (byte)116, 66);
               ZKM_STR_B[19] = NLoginCore_559.F("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֏ֽ֕\u058cֱֱպօսְִ֒ւַ֢֚ׄ֝֗֟\u05ce\u05ca־֣׃ֱֳּ֖֑בךֲּ֮֬ב־ךֺאכֶׂדסֻ֣טפצ֣֩סָ", (byte)116, 70);
               ZKM_STR_B[20] = NLoginCore_446.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨սֈ֭։ֵ֘ցջֻׂ֛ׄ֙֝ևֱׇ֘֞\u05cf֠\u05cf\u0590ֵֵ֟\u05ceִֶ֣֣֤֗֜֓", (byte)116, 69);
               ZKM_STR_B[21] = NLoginCore_387.D("ղ՚֍ջՠցր՟Ց՞ֆՙ", (byte)116, 68);
               ZKM_STR_B[22] = NLoginCore_223.E("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֏ֽ֕\u058cֱֱպօսְִ֛֝\u05c9\u058bֻ֯ևׁ֦֣֥֢֬ד\u05ce֒֫\u05cb֍ֺׅ\u05cc֣֤", (byte)116, 69);
               ZKM_STR_B[23] = NLoginCore_201.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨սֈ֭։ֵ֘ցջֻׂׄ׆ֲִֶּ׆֎ּ֪֭\u058cׅ\u05c8֪֑֕דח֍֎׆ֶ֣֤", (byte)116, 69);
               ZKM_STR_B[24] = NLoginCore_559.E("ֆղ֔ջ֞֊թթ֡֞ւ֍֢ր֍ֲչ֥\u058c\u0590־ְַַּ֘֝ջֳֳַֽ", (byte)116, 69);
               ZKM_STR_B[25] = NLoginCore_324.E("ռյյդսչ֢\u058c֚֠հֱ֖֠ր֏ֈմքֱִ֛֛֭֓֗֕\u0590ּ֚֜֘֨\u05cb֧օ֝\u058bַւׁ֛֧֘", (byte)116, 69);
               ZKM_STR_B[26] = NLoginCore_076.A("ƽƩǋƲǕǁƠƠǘǕƹǄǙƷǄǩưǜǃǇǵƱǋǓƮǙǹǫǖǳǇǏƹǡǞƹǲǴǮǘǺǔǡǙǻȇȃȃǚǥȁǟȁǭǚǛ", (byte)116, 65);
               ZKM_STR_B[27] = NLoginCore_141.D("՝ՖՖՅ՞՚փխցջՑց֒շահթՕեռ֕խ֊\u058cբլ֛\u0557\u0590֏օ֤ս֝շ֛֏ջցֲ֜֞ռչ", (byte)116, 68);
               ZKM_STR_B[28] = NLoginCore_324.E("ֆղ֔ջ֞֊թթ֡֞ւ֍֢ր֍ֲչ֥\u058c\u0590־չ։ղ։ָյնք׃֡պִַָֺ։օօ\u058b֤\u05cc\u05cd\u05cbֿ֍֎֔גׂ֬֗בל֣֤", (byte)116, 69);
               ZKM_STR_B[29] = NLoginCore_092.A("ƳƬƬƛƴưǙǃǗǑƧǗǨǍƷǆƿƫƻǒǫƾǦǘǵǅǰǜǳǊǚǩǘƼǎǶǮǣǼǓǸǷǡǊǩǨȉȌǙǚǼǳǓȃǚǛ", (byte)116, 65);
               ZKM_STR_B[30] = NLoginCore_451.D("էՓյ՜տիՊՊւտա֕կւզկթՓՓվյ֕ջձջ֝֏խ֠ճոպ", (byte)116, 68);
               ZKM_STR_B[31] = NLoginCore_521.B("ƳƬƬƛƴưǙǃǗǑƥƧǕǟƷƼǌƪƱǂǵǡƾǬǦƫǆǘǑǍǽǟǱǒǁǺǝǚǹǵǾǱǅǏ", (byte)116, 66);
               ZKM_STR_B[32] = NLoginCore_092.C("էՓյ՜տիՊՊւտա֕կւզկթՓՓվյ֑\u058cպջցյ֗ֆ֢բ֢֞֠ըօ֤֭և\u058c֚֩վյ\u058cկև\u058cօ֔ֈֿ֦֗քօ", (byte)116, 67);
               ZKM_STR_B[33] = NLoginCore_183.A("ƳƬƬƛƴưǙǃǗǑƥƧǕǟƷƼǌƪƱǂǵǑǏǗǬǒǆǩƮǬǎǪǉǪǡǕǒǍȀǓǶǖǀǟǊǾǽǬǜǦȉȀȇȃǚǛ", (byte)116, 65);
               ZKM_STR_B[34] = NLoginCore_141.C("էՓյ՜տիՊՊւտա֕կւզկթՓՓվյ֏֟ջպպ֥ջ՞ճ։֓ցջ֫ֈե֏պր֍֥֭֫֩ւփ\u0590ֺּ֩֓֯֗քօ", (byte)116, 67);
               ZKM_STR_B[35] = NLoginCore_091.F("ռյյդսչ֢\u058c֚֠ծհ֞֨րօ֕ճպ\u058b־֪չտս֫վ֥֗֙֓֔ׄ֩\u05cb֧֗\u058cցֻ֛־֟֘", (byte)116, 70);
               ZKM_STR_B[36] = NLoginCore_092.A("ƽƩǋƲǕǁƠƠǘǕƶǕƣǪƪƸǧƪƩƻǬǬƶƳƲǲǕǃǲƵǧǺ", (byte)116, 65);
               ZKM_STR_B[37] = NLoginCore_027.D("՝ՖՖՅ՞՚փխցջՑխ՟տժճ֍Ֆշպ։ղ֣֙֓փոչ֛գնռջ֧֜օև\u058cէխ֝ռ֪չ", (byte)116, 68);
               ZKM_STR_B[38] = NLoginCore_553.A("ƽƩǋƲǕǁƠƠǘǕƶǕƣǪƪƸǧƪƩƻǬǲǃǦǇǙǲǹǬǜǨǩǾǼǹǗǄǘǯǖǈǆǦǏ", (byte)116, 65);
               ZKM_STR_B[39] = NLoginCore_127.E("ռյյդսչ֢\u058c֚֠հ\u058cվ֞։֒֬յ֖֙֨\u058b֭֝֎ֽ֥֬֒֡֙׃\u05ca׆׀ָ֢֥֨֝֍։֊֘", (byte)116, 69);
               ZKM_STR_B[40] = NLoginCore_076.C("էՓյ՜տիՊՊւտՠտՍ֔Քբ֑ՔՓե֖֛\u0558՟փ֢֟սր՟ֈ֝ց֘ֆրզ\u058bւկր֢֮խִմ֫֍ֶַպկ֊֭քօ", (byte)116, 67);
               ZKM_STR_B[41] = NLoginCore_433.B("ƳƬƬƛƴưǙǃǗǑƧǃƵǕǀǉǣƬǍǐǟǂǣǖǴǘƳǃǒǔǘǑǒǴǬȄǳǣǅƹȆǄǿǋǪǨǅǞǧȇǲǊǣȓǚǛ", (byte)116, 66);
               ZKM_STR_B[42] = NLoginCore_471.E("ֆղ֔ջ֞֊թթ֡֞տ֞լֳճցְճղքֵֺշվ֢־ׁ֜֟վּ֧օֈքׅ֢ׅאׇ\u0590׃֫֘", (byte)116, 69);
               ZKM_STR_B[43] = NLoginCore_553.F("ռյյդսչ֢\u058c֚֠հ\u058cվ֞։֒֬յ֖֙֨\u058bֽ֬֟֡ռ\u058cֵ֛֥ׅ֚֝֡\u05c8֠֎׃֛֫ב֫֘", (byte)116, 70);
               ZKM_STR_B[44] = NLoginCore_138.E("եջւ\u058cսցի֬֜֨փ֮օ֍֗\u058cշհղ֖֮֘փք", (byte)116, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.E("օզ֤֚ֆֆ֍֯սֱ֟ձֶփַ֪֊նְִ֯֘֜֝\u0590ִջְּ֧֢֚", (byte)116, 69);
               ZKM_STR_B[1] = NLoginCore_575.D("Ն՜գխ՞բՌ֍ս։էմ\u058cոՎդ֍դ֏֕՝ն\u0590֚֗֡յ֍֑յ֚֨", (byte)116, 68);
               ZKM_STR_B[2] = NLoginCore_384.A("ƼƝǑǛƽƽǄǦƴǨǖƨǫǦǢǏǧǨǋƫƦƽƺƻ", (byte)116, 65);
               ZKM_STR_B[3] = NLoginCore_521.B("ƜƲƹǃƴƸƢǣǓǟƼǊƺǁǝǤǚǆǬƥƲǣƺƻ", (byte)116, 66);
               ZKM_STR_B[4] = NLoginCore_384.A("ƼƝǑǛƽƽǄǦƴǨǗǔƴƬǈǘǇƧǤǋƫǀǨǠǷǆǻǵǷǹǆǱ", (byte)116, 65);
               ZKM_STR_B[5] = NLoginCore_446.A("ƜƲƹǃƴƸƢǣǓǟƼƣƿƺƦǀƸǆǛǞǔǰǒǠƳǐǄǛǯǗǈǌ", (byte)116, 65);
               ZKM_STR_B[6] = NLoginCore_446.F("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֒վ֖տ֑֓ք֠ռֆֿ֗օ֧֕׆֦֮א\u05c8֧֮֘", (byte)116, 70);
               ZKM_STR_B[7] = NLoginCore_201.F("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨վֶ֞֯֏֎ռ֮ոִֿ֔։ֿֿ֫֠\u05c9ֈ׀׆ֽ֘", (byte)116, 70);
               ZKM_STR_B[8] = NLoginCore_575.A("ƴƩƔƸǐǏǜƳƸǓǁǤǭǘƬƿƽǦǋǅƱǉǔƱǱǴƲǴǸǕƺǨǵƽǑǋƿǓǏǸǳǆǃȋǭǙǦǜǬǟǒȎȎǕȍǨǤǱǱǛȔǯǘǷ", (byte)116, 65);
               ZKM_STR_B[9] = NLoginCore_575.F(
                  "֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨ռ־ִִֿ֛֚֡֓ֆֵ֥֤֙֒֟־\u05cc\u05ceּ׆\u05c8־֎֑\u05cd֎֩\u05c8\u05ca֚֕ןַל\u05cb\u05ca\u05cd֬מֱכׅ", (byte)116, 70
               );
               ZKM_STR_B[10] = NLoginCore_110.F("ս֖֛֨֡տ֞է֣ռֱո", (byte)116, 70);
               ZKM_STR_B[11] = NLoginCore_141.B("ƴƩƔƸǐǏǜƳƸǓǁǤǭǘƬƿƽǦǋǅƱǉǔƱǱǴƲǴǸǕƺǨǵƽǑǋƿǓǏǸǳǆǃȋǭǙǦǜǬǟǒȎȎǇȒǶȍȓǬǪǚȋǜǟȖȓǵȖǳǶǘȒǸȆȧȪȇǭȟȈǹǬǽȓȌȍǺǻ", (byte)116, 66);
               ZKM_STR_B[12] = NLoginCore_453.B("ǝǝǌƢƯǚǟǃǇƲǙǜǘƥƺƯƨƣǊƫǟƳǵǒǘǫǊǶǫǑƽǐǱǩǢǾƻǅǙǇǜǴǜǦȆǧǸȈǿǑȑǝǟǭǚǛ", (byte)116, 66);
               ZKM_STR_B[13] = NLoginCore_127.A("ƱǛƮƵƭǓƻƥǝƶǃǛƧǮǩǌǩƨƭƿƱǍƺƻ", (byte)116, 65);
               ZKM_STR_B[14] = NLoginCore_004.E("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֒֝պֺֽջֽׁ֞փֱָׁׁ֧֩\u05ce֞\u05cd֛\u058b׀֟֎ִֵ֢׃טבֺ֝\u05cc֣֤", (byte)116, 69);
               ZKM_STR_B[15] = NLoginCore_553.F("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨ռ־ִִֿ֛֚֡֓ֆ֙ֈֽ֜֨\u05caׅ־\u05ce֞\u05ca\u05c9֫\u05ce׀ֲ֟\u0590ָ׆ֲאל֣֤", (byte)116, 70);
               ZKM_STR_B[16] = NLoginCore_004.C("՞ՓԾբպչֆ՝բսի֎֗ւՖթէ\u0590յկ՛հ֞նխ֒֒՛զ՞֑֕ճգ֥վոջ֘փր֯֫֟ք֤֔շղֲֻ֒֝֍֍֑ւվׁ֚փ֦ׄ֟", (byte)116, 67);
               ZKM_STR_B[17] = NLoginCore_004.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨սֈ֭։ֵ֘ցջֻׂ֧ׄ֜\u05cb׃։ֹ֪֥֚֡\u05c8֢֤֬ח֏֬\u05cbְַֺ\u05c8מ֙זֿדֲֺצׁ֣", (byte)116, 69);
               ZKM_STR_B[18] = NLoginCore_076.A("ƚǔƪǞǛǘǔƶǡǓƩƯ", (byte)116, 65);
               ZKM_STR_B[19] = NLoginCore_183.B("ƴƩƔƸǐǏǜƳƸǓǁǤǭǘƬƿƽǦǋǅƱǆǴǌǃǨǨƱƼƴǫǧǉƹǻǔǎǑǮǙǖȅȁǵǚǺǪǍǈǨǳȈȑǣǩǳǥȈǵȑǱȇȒǭțȉǬȗǖǹȔǸȇȇȜǯ", (byte)116, 66);
               ZKM_STR_B[20] = NLoginCore_241.D("ևևնՌՙք։խձ՜փֆւՏդՙՒՍմՕ։՞թ֎ժչ֖բ՜֥֣֜պռվըչտְ֨֒ց֮ւ\u0590֨֗\u0590ְ֚֙֜շֽքօ", (byte)116, 68);
               ZKM_STR_B[21] = NLoginCore_110.E("֩֠ն֜ֈ֜խ֮֜֍֏զվվն֮ւհִֻպ֖փք", (byte)116, 69);
               ZKM_STR_B[22] = NLoginCore_223.E("սղ՝ց֥֙֘ռց֜֊ֶ֭֡յֈֆ֯֔֎պ֏ֽ֕\u058cֱֱպօսְִ֛֝\u05c9\u058bֻ֯ևׁ֦֣֫ג\u05ceְֲ֥֭֕֗֗֔\u05cc֣֤", (byte)116, 69);
               ZKM_STR_B[23] = NLoginCore_427.E("֦֦֕իո֣֨\u058c\u0590ջ֢֥֡ծփոձլ֓մ֨սֈ֭։ֵ֘ցջֻׂׄ׆ֲִֶּ׆֎ּ֪֭\u058b\u0590וׁגיׅ֣֦֙ל֦֣֤", (byte)116, 69);
               ZKM_STR_B[24] = NLoginCore_575.F("ֆղ֔ջ֞֊թթ֡֞ւ֍֢ր֍ֲչ֥\u058c\u0590־ջ֎ֱճ\u0590ջ֗֞֎ֻ֞", (byte)116, 70);
               ZKM_STR_B[25] = NLoginCore_183.C("՝ՖՖՅ՞՚փխցջՑց֒շահթՕեռ֕մոռն֎֒ձ֝սչ։տա֣ժֆտ֍կ\u0590ր֪չ", (byte)116, 67);
               ZKM_STR_B[26] = NLoginCore_451.D("էՓյ՜տիՊՊւտգծփած֓՚ֆխձ֟՛յս\u0558փ֣֕ր֝ձչգ\u058bֈգ֜֞֘ւ֤վ֊֎հֲָ֢շ\u058bָ֭֭֯քօ", (byte)116, 68);
               ZKM_STR_B[27] = NLoginCore_433.E("ռյյդսչ֢\u058c֚֠հֱ֖֠ր֏ֈմքִ֛\u058c֩֫ց\u058bֺն֤֮֯׃ֹ֗׆ּ֤֚֠֟\u05ce\u05ce֡׀ֳׂב֣֕זֶַׇ֦֣֤", (byte)116, 69);
               ZKM_STR_B[28] = NLoginCore_127.A("ƽƩǋƲǕǁƠƠǘǕƹǄǙƷǄǩưǜǃǇǵưǀƩǀǯƬƭƻǺǘƱǫǯǱǮǀƼƼǂǛȃȅǠǴȃǅǉǥǡȁǴȐȓǚǛ", (byte)116, 65);
               ZKM_STR_B[29] = NLoginCore_324.A("ƳƬƬƛƴưǙǃǗǑƧǗǨǍƷǆƿƫƻǒǫƾǦǘǵǅǰǜǳǊǚǩǘƼǎǶǮǣǼǓǸǷǞǳǟȃǼǩǝȒǭǋȐǝǚǛ", (byte)116, 65);
               ZKM_STR_B[30] = NLoginCore_521.D("էՓյ՜տիՊՊւտա֕կւզկթՓՓվյ֎֖֚֚֠մ֞րգ֟ֈ", (byte)116, 68);
               ZKM_STR_B[31] = NLoginCore_397.E("ռյյդսչ֢\u058c֚֠ծհ֞֨րօ֕ճպ\u058b־֪ևֵ֯մ֏֖֚֡׆֨׀ֺ֫փָֺ\u05c9ֆ\u05cd֡֫֘", (byte)116, 69);
               ZKM_STR_B[32] = NLoginCore_427.D("էՓյ՜տիՊՊւտա֕կւզկթՓՓվյ֑\u058cպջցյ֗ֆ֢բ֢֞֠ըօ֤֭և\u058c֚֩սֲ֑֯֯ֆֶ\u0590֏֭հ֗քօ", (byte)116, 68);
               ZKM_STR_B[33] = NLoginCore_433.F("ռյյդսչ֢\u058c֚֠ծհ֞֨րօ֕ճպ\u058b־ֵ֛֚֘֠֏ֲշֳֳֵ֪֛֖֗֒֞\u05c9ֿ֜֟։ֱֱֶׇֻ֧֪֥֣֤֟֠֜", (byte)116, 70);
               ZKM_STR_B[34] = NLoginCore_397.A("ƽƩǋƲǕǁƠƠǘǕƷǫǅǘƼǅƿƩƩǔǋǥǵǑǐǐǻǑƴǉǟǩǗǑȁǞƻǥǐǖǣȁǾǴǢǉǥǊȃǯǜȉȉǭǚǛ", (byte)116, 65);
               ZKM_STR_B[35] = NLoginCore_530.C("՝ՖՖՅ՞՚փխցջՏՑտ։ազնՔ՛լ֟\u058b՚ՠ՞\u058c՟ոպմյֆօօօյցծոպ֣ր։ֱ֣֤ղ֧ոֳ֭֭֫ևքօ", (byte)116, 67);
               ZKM_STR_B[36] = NLoginCore_453.A("ƽƩǋƲǕǁƠƠǘǕƶǕƣǪƪƸǧƪƩƻǬǫƴǌǷǩǱǯǱǷǨǴ", (byte)116, 65);
               ZKM_STR_B[37] = NLoginCore_387.B("ƳƬƬƛƴưǙǃǗǑƧǃƵǕǀǉǣƬǍǐǟǈǯǩǹǙǎǏǱƹǌǒǙǎƹǞǝǢǅǱȀǀȄǏ", (byte)116, 66);
               ZKM_STR_B[38] = NLoginCore_223.D("էՓյ՜տիՊՊւտՠտՍ֔Քբ֑ՔՓե֖֜խ\u0590ձփ֣֖֜ֆ֒֓քե֦֖֚ւ֘պքռկչ", (byte)116, 68);
               ZKM_STR_B[39] = NLoginCore_397.A("ƳƬƬƛƴưǙǃǗǑƧǃƵǕǀǉǣƬǍǐǟǂǤǔǅǣǉǘǜǴǐǺǜǢǲǛǍǐƿǢǁǀǞǏ", (byte)116, 65);
               ZKM_STR_B[40] = NLoginCore_471.C("էՓյ՜տիՊՊւտՠտՍ֔Քբ֑ՔՓե֖֛\u0558՟փ֢֟սր՟ֈ֝ց֘ֆրզ\u058bւկր֥֮ձլֶ֟ցֲ֪֯֙մ֭քօ", (byte)116, 67);
               ZKM_STR_B[41] = NLoginCore_530.C("՝ՖՖՅ՞՚փխցջՑխ՟տժճ֍Ֆշպ։լ֍ր֞ւ՝խռվւջռ֖֮֞֝֍կգְծָ֧֢֮֒֯ևֳֽ֤֜֔քօ", (byte)116, 67);
               ZKM_STR_B[42] = NLoginCore_384.C("էՓյ՜տիՊՊւտՠտՍ֔Քբ֑ՔՓե֖֛\u0558՟փ֢֟սր՟ֈ֝ս֪֠փպըբձֈվ֔չ", (byte)116, 67);
               ZKM_STR_B[43] = NLoginCore_384.B("ƳƬƬƛƴưǙǃǗǑƧǃƵǕǀǉǣƬǍǐǟǂǣǖǴǘƳǃǒǔǘǑǋǼƿǐƾǲǢǲǞǠǼǏ", (byte)116, 66);
               ZKM_STR_B[44] = NLoginCore_387.B("ƜƲƹǃƴƸƢǣǓǟƻǄǢǌǍǍƨǈǏǒǂƲƾǩǊǉǖƳǘƽǓǼ", (byte)116, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_453.B("ƿƪǀǄǕǏƳǝƽƶǤƯ", (byte)116, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_141.C("յց\u0557վՋթջ֑ևւմփՕՕժ֙դՒօղ֞֝դե", (byte)116, 67);
         }
      }
   }

   @Generated
   private NLoginCore_329(NLoginCore_474 var3, Object var4) {
      this.i = var3;
      this.q = var4;
   }

   @Override
   public NLoginCore_208 a() {
      return i;
   }

   private static String a(int var0, long var1) {
      var1 ^= 87L;
      var1 ^= -8057216789137600696L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(36 + 32),
                     (byte)(17 + 52),
                     (byte)(17 + 66),
                     (byte)(41 + 6),
                     (byte)(16 + 51),
                     (byte)(30 + 36),
                     (byte)(36 + 31),
                     47,
                     80,
                     (byte)(67 + 8),
                     (byte)(8 + 59),
                     (byte)(75 + 8),
                     (byte)(35 + 18),
                     (byte)(33 + 47),
                     (byte)(95 + 2),
                     (byte)(63 + 37),
                     (byte)(69 + 31),
                     (byte)(73 + 32),
                     (byte)(42 + 68),
                     (byte)(89 + 14)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(82 + 1)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.F("ծջպԽսչմսֈշՄւֆտւֈՊ࣑ࣖࢲࣅࣦࣔࣞࣗ\u08e2࣯࣯࣍ࣧ", (byte)79, 70));
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

   @Override
   public int a() {
      return this.ordinal();
   }
}
