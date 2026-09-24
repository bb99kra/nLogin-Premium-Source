package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_566 {
   b(NLoginCore_322.class),
   c(NLoginCore_351.class),
   d(NLoginCore_544.class),
   e(NLoginCore_375.class),
   f(NLoginCore_220.class),
   g(NLoginCore_382.class),
   h(NLoginCore_250.class),
   i(NLoginCore_369.class),
   j(MD5HashProvider.class),
   k((boolean)NLoginCore_566.fb, NLoginCore_030.class),
   l((boolean)NLoginCore_566.fg, NLoginCore_497.class),
   m((boolean)NLoginCore_566.fl, NLoginCore_573.class),
   n((boolean)NLoginCore_566.fp, NLoginCore_113.class),
   o((boolean)NLoginCore_566.ft, NLoginCore_461.class),
   p((boolean)NLoginCore_566.fx, SHA256HashProvider.class),
   q((boolean)NLoginCore_566.gc, NLoginCore_064.class);

   private final boolean aB;
   private final Class<? extends NLoginInterface_009> s;
   private NLoginInterface_009 a;
   private static String[] a = new String[NLoginCore_566.dm];
   private static String[] b = new String[NLoginCore_566.dn];
   private static long c;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = 0 >>> 173 | 0 << -173;
   private static long d = Long.reverse(7681834121758226849L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(7681834121758226849L);
   private static int g = (0 >>> 217 | 0 << -217) & -1;
   private static int h = 0 >>> 159 | 0 << ~159 + 1;
   private static int i = Integer.reverse(1073741824);
   private static long j = Long.reverse(-3703265736234387039L);
   private static long k = Long.reverse(-6485183463413514240L);
   private static int l = Integer.reverse(-1073741824);
   private static long m = Long.reverse(-3703265736234387039L);
   private static long n = Long.reverse(-6485183463413514240L);
   private static int o = 65536 >>> 142 | 65536 << -142;
   private static long p = Long.reverse(-3703265736234387039L);
   private static long q = Long.reverse(-6485183463413514240L);
   private static int r = Integer.reverse(-1610612736);
   private static long s = Long.reverse(7681834121758226849L);
   private static int t = Integer.reverse(1610612736);
   private static int u = (-1 >>> 237 | -1 << ~237 + 1) & -1;
   private static long v = Long.reverse(7681834121758226849L);
   private static int w = (28672 >>> 12 | 28672 << -12) & -1;
   private static long x = Long.reverse(-3703265736234387039L);
   private static long y = Long.reverse(-6485183463413514240L);
   private static int z = Integer.reverse(268435456);
   private static long aa = Long.reverse(7681834121758226849L);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = Integer.reverse(0);
   private static int ae = 294912 >>> 143 | 294912 << ~143 + 1;
   private static int af = (-1 >>> 160 | -1 << -160) & -1;
   private static long ag = Long.reverse(7681834121758226849L);
   private static int ah = -1 >>> 49 | -1 << ~49 + 1;
   private static int ai = Integer.reverse(1342177280);
   private static long aj = Long.reverse(7681834121758226849L);
   private static int ak = 0 >>> 8 | 0 << ~8 + 1;
   private static int al = -1073741822 >>> 62 | -1073741822 << -62;
   private static long am = Long.reverse(-3703265736234387039L);
   private static long an = Long.reverse(-6485183463413514240L);
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static int ap = (-1 >>> 216 | -1 << -216) & -1;
   private static int aq = Integer.reverse(805306368);
   private static long ar = Long.reverse(7681834121758226849L);
   private static int as = Integer.reverse(0);
   private static int at = 872415232 >>> 186 | 872415232 << ~186 + 1;
   private static long au = Long.reverse(-3703265736234387039L);
   private static long av = Long.reverse(-6485183463413514240L);
   private static int aw = ('耀' >>> 'O' | 32768 << ~79 + 1) & -1;
   private static int ax = Integer.reverse(1879048192);
   private static long ay = Long.reverse(-3703265736234387039L);
   private static long az = Long.reverse(-6485183463413514240L);
   private static int ba = (268435456 >>> 123 | 268435456 << -123) & -1;
   private static int bb = 503316480 >>> 185 | 503316480 << ~185 + 1;
   private static long bc = Long.reverse(-3703265736234387039L);
   private static long bd = Long.reverse(-6485183463413514240L);
   private static int be = (786432 >>> 146 | 786432 << -146) & -1;
   private static int bf = 536870912 >>> 153 | 536870912 << ~153 + 1;
   private static int bg = (-1 >>> 200 | -1 << -200) & -1;
   private static long bh = Long.reverse(7681834121758226849L);
   private static int bi = (2048 >>> 41 | 2048 << -41) & -1;
   private static int bj = 272 >>> 36 | 272 << ~36 + 1;
   private static long bk = Long.reverse(-3703265736234387039L);
   private static long bl = Long.reverse(-6485183463413514240L);
   private static int bm = (1310720 >>> 114 | 1310720 << ~114 + 1) & -1;
   private static int bn = (2304 >>> 167 | 2304 << -167) & -1;
   private static long bo = Long.reverse(-3703265736234387039L);
   private static long bp = Long.reverse(-6485183463413514240L);
   private static int bq = Integer.reverse(1610612736);
   private static int br = Integer.reverse(-939524096);
   private static long bs = Long.reverse(-3703265736234387039L);
   private static long bt = Long.reverse(-6485183463413514240L);
   private static int bu = 14336 >>> 235 | 14336 << ~235 + 1;
   private static int bv = Integer.reverse(671088640);
   private static long bw = Long.reverse(7681834121758226849L);
   private static int bx = Integer.reverse(268435456);
   private static int by = Integer.reverse(-1476395008);
   private static int bz = (-1 >>> 93 | -1 << -93) & -1;
   private static long ca = Long.reverse(7681834121758226849L);
   private static int cb = 72 >>> 35 | 72 << -35;
   private static int cc = Integer.reverse(1744830464);
   private static int cd = Integer.reverse(-1);
   private static long ce = Long.reverse(7681834121758226849L);
   private static int cf = 671088640 >>> 218 | 671088640 << ~218 + 1;
   private static int cg = 1507328 >>> 112 | 1507328 << -112;
   private static int ch = Integer.reverse(-1);
   private static long ci = Long.reverse(7681834121758226849L);
   private static int cj = Integer.reverse(-805306368);
   private static int ck = (6144 >>> 232 | 6144 << ~232 + 1) & -1;
   private static long cl = Long.reverse(7681834121758226849L);
   private static int cm = (98304 >>> 173 | 98304 << ~173 + 1) & -1;
   private static int cn = Integer.reverse(-1744830464);
   private static long co = Long.reverse(-3703265736234387039L);
   private static long cp = Long.reverse(-6485183463413514240L);
   private static int cq = Integer.reverse(-1342177280);
   private static int cr = (13312 >>> 73 | 13312 << ~73 + 1) & -1;
   private static long cs = Long.reverse(-3703265736234387039L);
   private static long ct = Long.reverse(-6485183463413514240L);
   private static int cu = Integer.reverse(1879048192);
   private static int cv = 4096 >>> 72 | 4096 << ~72 + 1;
   private static int cw = (0 >>> 146 | 0 << ~146 + 1) & -1;
   private static int cx = (16 >>> 228 | 16 << -228) & -1;
   private static int cy = Integer.reverse(1073741824);
   private static int cz = (6 >>> 193 | 6 << ~193 + 1) & -1;
   private static int da = Integer.reverse(536870912);
   private static int db = 1310720 >>> 50 | 1310720 << -50;
   private static int dc = (1572864 >>> 178 | 1572864 << -178) & -1;
   private static int dd = (117440512 >>> 24 | 117440512 << -24) & -1;
   private static int de = (2048 >>> 104 | 2048 << -104) & -1;
   private static int df = (1073741826 >>> 126 | 1073741826 << -126) & -1;
   private static int dg = 10485760 >>> 180 | 10485760 << -180;
   private static int dh = Integer.reverse(-805306368);
   private static int di = Integer.reverse(805306368);
   private static int dj = Integer.reverse(-1342177280);
   private static int dk = (234881024 >>> 152 | 234881024 << -152) & -1;
   private static int dl = Integer.reverse(-268435456);
   private static int dm = Integer.reverse(-738197504);
   private static int dn = Integer.reverse(-738197504);
   private static int var_do = Integer.reverse(-671088640);
   private static long dp = Long.reverse(-3703265736234387039L);
   private static long dq = Long.reverse(-6485183463413514240L);
   private static int dr = 0 >>> 249 | 0 << -249;
   private static int ds = 114688 >>> 140 | 114688 << ~140 + 1;
   private static int dt = -1 >>> 39 | -1 << -39;
   private static long du = Long.reverse(7681834121758226849L);
   private static int dv = 128 >>> 231 | 128 << -231;
   private static int dw = Integer.reverse(-1207959552);
   private static long dx = Long.reverse(-3703265736234387039L);
   private static long dy = Long.reverse(-6485183463413514240L);
   private static int dz = 8192 >>> 76 | 8192 << ~76 + 1;
   private static int ea = (3932160 >>> 241 | 3932160 << ~241 + 1) & -1;
   private static long eb = Long.reverse(-3703265736234387039L);
   private static long ec = Long.reverse(-6485183463413514240L);
   private static int ed = Integer.reverse(-1073741824);
   private static int ee = Integer.reverse(-134217728);
   private static long ef = Long.reverse(7681834121758226849L);
   private static int eg = (1073741824 >>> 156 | 1073741824 << -156) & -1;
   private static int eh = 1073741824 >>> 185 | 1073741824 << -185;
   private static int ei = Integer.reverse(-1);
   private static long ej = Long.reverse(7681834121758226849L);
   private static int ek = Integer.reverse(-1610612736);
   private static int el = Integer.reverse(-2080374784);
   private static int em = Integer.reverse(-1);
   private static long en = Long.reverse(7681834121758226849L);
   private static int eo = Integer.reverse(1610612736);
   private static int ep = 17408 >>> 201 | 17408 << -201;
   private static long eq = Long.reverse(-3703265736234387039L);
   private static long er = Long.reverse(-6485183463413514240L);
   private static int es = 14 >>> 193 | 14 << -193;
   private static int et = Integer.reverse(-1006632960);
   private static long eu = Long.reverse(-3703265736234387039L);
   private static long ev = Long.reverse(-6485183463413514240L);
   private static int ew = Integer.MIN_VALUE >>> 252 | Integer.MIN_VALUE << -252;
   private static int ex = 9437184 >>> 210 | 9437184 << -210;
   private static long ey = Long.reverse(-3703265736234387039L);
   private static long ez = Long.reverse(-6485183463413514240L);
   private static int fa = Integer.reverse(-1879048192);
   private static int fb = (0 >>> 184 | 0 << -184) & -1;
   private static int fc = '鐀' >>> 202 | 37888 << -202;
   private static long fd = Long.reverse(-3703265736234387039L);
   private static long fe = Long.reverse(-6485183463413514240L);
   private static int ff = Integer.reverse(1342177280);
   private static int fg = Integer.reverse(0);
   private static int fh = Integer.reverse(1677721600);
   private static int fi = (-1 >>> 194 | -1 << ~194 + 1) & -1;
   private static long fj = Long.reverse(7681834121758226849L);
   private static int fk = (46137344 >>> 86 | 46137344 << -86) & -1;
   private static int fl = 0 >>> 196 | 0 << -196;
   private static int fm = Integer.reverse(-469762048);
   private static long fn = Long.reverse(7681834121758226849L);
   private static int fo = ('쀀' >>> 204 | 49152 << -204) & -1;
   private static int fp = Integer.reverse(0);
   private static int fq = 167772160 >>> 86 | 167772160 << -86;
   private static long fr = Long.reverse(7681834121758226849L);
   private static int fs = Integer.reverse(-1342177280);
   private static int ft = (0 >>> 170 | 0 << -170) & -1;
   private static int fu = 10496 >>> 104 | 10496 << -104;
   private static long fv = Long.reverse(7681834121758226849L);
   private static int fw = Integer.reverse(1879048192);
   private static int fx = Integer.reverse(0);
   private static int fy = Integer.reverse(1409286144);
   private static int fz = (-1 >>> 107 | -1 << -107) & -1;
   private static long ga = Long.reverse(7681834121758226849L);
   private static int gb = Integer.reverse(-268435456);
   private static int gc = Integer.reverse(0);

   @Nullable
   public static NLoginCore_566 a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = var0.split(a(z, aa));
         NLoginCore_566 var2 = null;
         return var1.length > ab && (var2 = c(var1[ac])) == null && (var2 = c(var1[ad])) == null && var0.endsWith(a(ae & af, ag)) ? m : var2;
      }
   }

   public NLoginInterface_009 a() {
      switch (this) {
         case b:
         case c:
         case d:
            if (!BCryptHashProvider.aN()) {
               throw new UnsupportedOperationException(this + a(b, d));
            }
         case f:
            if (BCryptHashProvider.aO()) {
               return NLoginCore_355.a();
            }
         case g:
            if (BCryptHashProvider.aO()) {
               throw new UnsupportedOperationException(this + a(e, f));
            }
         case e:
         default:
            if (this.a != null) {
               return this.a;
            } else {
               try {
                  return this.a = this.s.getConstructor().newInstance();
               } catch (ReflectiveOperationException var2) {
                  throw new RuntimeException(a(i, j ^ k) + this + a(l, m ^ n), var2);
               }
            }
      }
   }

   @Nullable
   private static NLoginCore_566 c(String var0) {
      String var1 = var0.toUpperCase(Locale.ENGLISH);
      int var2 = ap;
      switch (var1.hashCode()) {
         case -1941380937:
            if (var1.equals(a(bf & bg, bh))) {
               var2 = bi;
            }
            break;
         case -1850268089:
            if (var1.equals(a(bv, bw))) {
               var2 = bx;
            }
            break;
         case -1850265334:
            if (var1.equals(a(by & bz, ca))) {
               var2 = cb;
            }
            break;
         case -957496557:
            if (var1.equals(a(cn, co ^ cp))) {
               var2 = cq;
            }
            break;
         case -812585448:
            if (var1.equals(a(br, bs ^ bt))) {
               var2 = bu;
            }
            break;
         case -26212441:
            if (var1.equals(a(bn, bo ^ bp))) {
               var2 = bq;
            }
            break;
         case -26212436:
            if (var1.equals(a(bj, bk ^ bl))) {
               var2 = bm;
            }
            break;
         case 50:
            if (var1.equals(a(at, au ^ av))) {
               var2 = aw;
            }
            break;
         case 71:
            if (var1.equals(a(bb, bc ^ bd))) {
               var2 = be;
            }
            break;
         case 1615:
            if (var1.equals(a(ax, ay ^ az))) {
               var2 = ba;
            }
            break;
         case 1639:
            if (var1.equals(a(aq, ar))) {
               var2 = as;
            }
            break;
         case 76158:
            if (var1.equals(a(cc & cd, ce))) {
               var2 = cf;
            }
            break;
         case 82060:
            if (var1.equals(a(cg & ch, ci))) {
               var2 = cj;
            }
            break;
         case 41199992:
            if (var1.equals(a(ck, cl))) {
               var2 = cm;
            }
            break;
         case 253318863:
            if (var1.equals(a(cr, cs ^ ct))) {
               var2 = cu;
            }
      }

      switch (var2) {
         case 0:
            return g;
         case 1:
         case 2:
            return f;
         case 3:
            return l;
         case 4:
            return e;
         case 5:
            return b;
         case 6:
            return c;
         case 7:
            return d;
         case 8:
            return i;
         case 9:
            return h;
         case 10:
            return j;
         case 11:
            return o;
         case 12:
            return q;
         case 13:
            return n;
         case 14:
            return p;
         default:
            return null;
      }
   }

   static {
      b();
   }

   @Generated
   private NLoginCore_566(boolean var3, Class<? extends NLoginInterface_009> var4) {
      this.aB = var3;
      this.s = var4;
   }

   public String w(String var1) {
      if (!this.aB) {
         throw new UnsupportedOperationException(a(o, p ^ q) + this + a(r, s));
      } else {
         switch (this) {
            case b:
            case c:
            case d:
            case e:
            case f:
            case g:
            case h:
            case i:
            case j:
               return this.a().w(var1);
            default:
               throw new UnsupportedOperationException(a(t & u, v) + this + a(w, x ^ y));
         }
      }
   }

   @Generated
   public Class<? extends NLoginInterface_009> e() {
      return this.s;
   }

   public static NLoginCore_566 b(String var0) {
      String var3;
      String var1 = var3 = var0.toUpperCase(Locale.ENGLISH);
      int var2 = ah;
      switch (var1.hashCode()) {
         case 1938817085:
            if (var1.equals(a(al, am ^ an))) {
               var2 = ao;
            }
            break;
         case 1953930828:
            if (var1.equals(a(ai, aj))) {
               var2 = ak;
            }
      }

      switch (var2) {
         case 0:
            return f;
         case 1:
            return b;
         default:
            return valueOf(var3);
      }
   }

   private NLoginCore_566(Class<? extends NLoginInterface_009> var3) {
      this((boolean)a, var3);
   }

   private static void b() {
      c = -8818616238883546829L;
      long var0 = c ^ 3312254705812168841L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(34 + 35),
               (byte)(39 + 44),
               (byte)(13 + 34),
               (byte)(45 + 22),
               (byte)(46 + 20),
               (byte)(12 + 55),
               (byte)(28 + 19),
               (byte)(70 + 10),
               (byte)(39 + 36),
               (byte)(45 + 22),
               (byte)(60 + 23),
               53,
               (byte)(8 + 72),
               (byte)(9 + 88),
               100,
               (byte)(55 + 45),
               (byte)(26 + 79),
               (byte)(100 + 10),
               (byte)(10 + 93)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_530.F("ԽԝԊԞԉՏ\u0530ԑՄԕԨԐԯՖԤՊՕՒԳԷՕՏԶԴԽՓՄՠՇթԧիՊԾԸԦՃԮՐՀԼԴՋՑղն\u0558Գ՝ՋՐՉոկՆՇ", (byte)23, 70);
               b[1] = NLoginCore_141.C("ѤфбхаѶїиѫмязіѽыѱѼѹњўѼѶѝћѤѺѫ҇ѮҐюҒѱѥџэѪѕѷѧѣћѲѸҙҝѿњ҄ѲѷѰҟҖѭѮ", (byte)23, 67);
               b[2] = NLoginCore_433.C("ЩѵѨвѕѫаѦќищюѯђѶпо҂ёѓўҀїѦѸҀ҂јшћѡѬ", (byte)23, 67);
               b[3] = NLoginCore_433.A("āĢĄûģĊĚåĘĈāñäĐįđċĲĪĂİēĀā", (byte)23, 65);
               b[4] = NLoginCore_223.F("ԺԤԙԯԡՏՁՇԓՋՄՊԢԗԢԒԩԘԔԵԵՏԦԧ", (byte)23, 70);
               b[5] = NLoginCore_575.D("аЭѫѓѠиуЬѰњѲѼѽпѹёѫѱфтѤ҉ѱћѡѦћшѢѝѧҊ", (byte)23, 68);
               b[6] = NLoginCore_141.D("ѡырішѶѨѮкѲѫѱщощйѐплќќѶэю", (byte)23, 68);
               b[7] = NLoginCore_091.C("аЭѫѓѠиуЬѰњѱюъвјѼѹѷўѵѯѺѪіҁ҄ѧѫќџѽѳ", (byte)23, 67);
               b[8] = NLoginCore_141.D("ѨѐаѧаѢђэѤищт", (byte)23, 68);
               b[9] = NLoginCore_091.B("ÿýÚßÿáĭüûęĩçīćþþĕĤĆĵđēĀā", (byte)23, 66);
               b[10] = NLoginCore_471.B("üõðĪåĢþĂèÿøõ", (byte)23, 66);
               b[11] = NLoginCore_183.C("ьђцсѵѩѬѩёѴмт", (byte)23, 67);
               b[12] = NLoginCore_324.D("ЫтЯѥгюѐбѯщѧт", (byte)23, 68);
               b[13] = NLoginCore_521.A("ēĖĤäÿûýĪĩîĀõ", (byte)23, 65);
               b[14] = NLoginCore_183.B("ĞďĠâĂèăãģĞĮõ", (byte)23, 66);
               b[15] = NLoginCore_110.F("ՌՃԖԏԍԾԊԡԯՑԑԛ", (byte)23, 70);
               b[16] = NLoginCore_553.E("ԂԻՅԡԝԐԉԡԓՄԞԛ", (byte)23, 69);
               b[17] = NLoginCore_076.C("эѐѯєѥѠѴіЭѪёт", (byte)23, 67);
               b[18] = NLoginCore_110.D("ѤтчѶзшѮѓѐѤхт", (byte)23, 68);
               b[19] = NLoginCore_183.B("åúòĔóóĭäĭĉîðČéğĈĖčĬëĨēĀā", (byte)23, 66);
               b[20] = NLoginCore_427.C("ЬѱтѠѵЯѧущцдт", (byte)23, 67);
               b[21] = NLoginCore_384.B("ÞăùĥĦæĠĚĝìĢõ", (byte)23, 66);
               b[22] = NLoginCore_559.C("юяьѩдзђггєѯт", (byte)23, 67);
               b[23] = NLoginCore_091.D("ђфѲѵеѵѕЬьзщт", (byte)23, 68);
               b[24] = NLoginCore_451.A("ĢøđĝĤČâęĄåİċëħıĬòñĔñīĹĀā", (byte)23, 65);
               b[25] = NLoginCore_451.B("ĐąħýĨĞĜøýčîģûîĒįİĈģĲĐăĀā", (byte)23, 66);
               b[26] = NLoginCore_453.F("ԬՄԶԤԤԟԜԝ\u0530ՄՋԲԔԴՑԣԙԪԬԲԖԹԦԧ", (byte)23, 70);
               b[27] = NLoginCore_453.C("эѐѯєѥѠѴіЭѪёт", (byte)23, 67);
               b[28] = NLoginCore_223.B("ėõúĩêûġĆăėøõ", (byte)23, 66);
               b[29] = NLoginCore_471.D("вчпѡррѺбѺілнљжѬѕѣњѹиѵѠэю", (byte)23, 68);
               b[30] = NLoginCore_387.E("ԂԻՅԡԝԐԉԡԓՄԞԛ", (byte)23, 69);
               b[31] = NLoginCore_530.E("ԪԛԡԊԻ\u0530ԤԽԲԣՋԎԘՒԸԼԙՍՈՏԶ՟Ԧԧ", (byte)23, 69);
               b[32] = NLoginCore_173.B("ėøâĂěģīĠåêíðČìĤëİôĘĺĘĩĀā", (byte)23, 66);
               b[33] = NLoginCore_141.F("ԄԩԟՋՌԌՆՀՃԒՈԛ", (byte)23, 70);
               b[34] = NLoginCore_384.E("ԅՊԛԹՎԈՀԜԢԟԍԛ", (byte)23, 69);
               b[35] = NLoginCore_027.F("ԧԨԥՂԍԐԫԌԌԭՈԛ", (byte)23, 70);
               b[36] = NLoginCore_384.D("птпжЮѕыкѨѩћѭѪэрѫѾ҅зѕфѠэю", (byte)23, 68);
               b[37] = NLoginCore_451.A("üĢüçĈĂãĊĎČāĢĎĳñĲćČóĤĈĻòóĎĲľþøğŁğ", (byte)23, 65);
               b[38] = NLoginCore_092.E("ԃԮՊԫԫՒԫԓԴՀՆՎԵԴԖԯԒԭԨ՜ՋԜՙՀԸՂՑԡԧՕթԻ", (byte)23, 69);
               b[39] = NLoginCore_433.E("ԶԫՍԣՎՄՂԞԣԳԒԪԘՂ\u0558ԫԯԖԲԪԹՏԦԧ", (byte)23, 69);
               b[40] = NLoginCore_027.A("ěĄĉĚćĨÿęĞęêĮĜĬÿĐĐāóđąēĀā", (byte)23, 65);
               b[41] = NLoginCore_530.F("ԣԸԇԏԠԏԣՍՕԨՌԵԨՉԹՋՐԯԺԕՕՌԔՏԴԶԟ՝Զԡ՝Ֆ", (byte)23, 70);
               b[42] = NLoginCore_521.D("ѯхўѪѱљЯѦёвѽѺѬѓњяй҂џѰўо҈Ѻш҉ҌѭѧѠѠъ", (byte)23, 68);
               break;
            case 1:
               b[0] = NLoginCore_004.A("ė÷äøãĩĊëĞïĂêĉİþĤįĬčđįĩĐĎėĭĞĺġŃāŅĤĘĒĀĝĈĪĚĖĎĤěİĐŃĮĈŒĎĥĲŌĘŒļħğŘęĲłĹ", (byte)23, 65);
               b[1] = NLoginCore_453.D("ѤфбхаѶїиѫмязіѽыѱѼѹњўѼѶѝћѤѺѫ҇ѮҐюҒѱѥџэѪѕѷѧѣћѱѷҖјҙѺҚўҗҡҀҝңѧ҃ҦѷҝҋҁҰҡ", (byte)23, 68);
               b[2] = NLoginCore_451.D("ЩѵѨвѕѫаѦќищюѯђѶпо҂ёѓўҀѱхѵшѼҀџѻѺҍѦѝ҆ёѦ҃ҚѓѪѕќѢ", (byte)23, 68);
               b[3] = NLoginCore_387.E("ԧՈԪԡՉ\u0530ՀԋԾԮԧԡԕԖԸՊԖԦԭՓՓՕԻԾԛԢԽԙԣԡԩՔ", (byte)23, 69);
               b[4] = NLoginCore_091.E("ԺԤԙԯԡՏՁՇԓՋՆԕՏԑԲՆԧԔԨ\u0558ԷՏԦԧ", (byte)23, 69);
               b[5] = NLoginCore_138.F("ԉԆՄԬԹԑԜԅՉԳՋՕՖԘՒԪՄՊԝԛԽՠԢՀ\u0530Նդ՛ՃԥԹԧ", (byte)23, 70);
               b[6] = NLoginCore_471.F("ԺԤԙԯԡՏՁՇԓՋՆՌԡՂԙՆԚՍԭՒ՞ՏԦԧ", (byte)23, 70);
               b[7] = NLoginCore_110.D("аЭѫѓѠиуЬѰњѱюъвјѼѹѷўѵѯѺѧѶ҅ыҊфѝыѯѤ", (byte)23, 68);
               b[8] = NLoginCore_110.B("ĖĚĂäýğ÷öćúĮõ", (byte)23, 66);
               b[9] = NLoginCore_004.B("ÿýÚßÿáĭüûęĩąİñįāįĬĊĺĻăĀā", (byte)23, 66);
               b[10] = NLoginCore_387.F("ԵԜԪԢԟԌԢԫԑԴՒԉՊԷՒԲՇԾՐԴԲԹԦԧ", (byte)23, 70);
               b[11] = NLoginCore_384.E("ԽԥԚԹԉԋԽԟՇԐՐԓԖԳՙԨԎՉԶԟԛԩԦԧ", (byte)23, 69);
               b[12] = NLoginCore_141.B("ĄāåßĊģħĈäìĈõ", (byte)23, 66);
               b[13] = NLoginCore_091.C("ѭЮЬѠфЮѴѓѴѪхт", (byte)23, 67);
               b[14] = NLoginCore_397.D("ЮхцвѩфѡѐѮвѳт", (byte)23, 68);
               b[15] = NLoginCore_453.C("Ѣббсжјщььймт", (byte)23, 67);
               b[16] = NLoginCore_127.F("ԋԾԗԽԫԻԾԊՃՊՓՊՎԥԳՌԴԓԳՒԛԹԦԧ", (byte)23, 70);
               b[17] = NLoginCore_575.A("ïòàđğĉĬìþúīñĳòĕĖöģēñĸēĀā", (byte)23, 65);
               b[18] = NLoginCore_433.A("æĢæĖæĞīĊøĤįùđċčðĩįĬðñăĀā", (byte)23, 65);
               b[19] = NLoginCore_091.C("вчпѡррѺбѺілцъљѐўѠҁхпсѶэю", (byte)23, 67);
               b[20] = NLoginCore_110.D("ёџвѯѬгѬёєєкањѩѶѯмоѷрє҆эю", (byte)23, 68);
               b[21] = NLoginCore_471.F("ԵՍՆՁԞԋՆՍԣԥՄԳՈԋԢԪԯԗ՚ԛՐԩԦԧ", (byte)23, 70);
               b[22] = NLoginCore_387.A("ßĕěþùéâõþĢĢõ", (byte)23, 65);
               b[23] = NLoginCore_223.E("ԣԸԋԸՋՌՎԎՀԠՔԛ", (byte)23, 69);
               b[24] = NLoginCore_127.B("ĢøđĝĤČâęĄåįęċĴīðąÿĲĶĹĹĀā", (byte)23, 66);
               b[25] = NLoginCore_241.E("ԶԫՍԣՎՄՂԞԣԳԓԥԑՍԭԦՋ\u0530ԪԧՏԩԦԧ", (byte)23, 69);
               b[26] = NLoginCore_427.A("ĆĞĐþþùö÷ĊĞĢĢêåđđĥíćāĶĩĀā", (byte)23, 65);
               b[27] = NLoginCore_397.F("ԿԿԝԨԤԡԦԽԑԽԪԬԸՏԯԪԪԽԱԖ՜՟Ԧԧ", (byte)23, 70);
               b[28] = NLoginCore_397.C("рѡнѦѸљЫѳњѓѮѿпкѶим҄ќљёѶэю", (byte)23, 67);
               b[29] = NLoginCore_004.B("åúòĔóóĭäĭĉëčġĬĆĂĥĴġĆúĩĀā", (byte)23, 66);
               b[30] = NLoginCore_183.E("ՃԿԘԝՐԤՍԛԣԪԒԧՆԱՎՋԦ\u0530\u0530ԫ՜ԩԦԧ", (byte)23, 69);
               b[31] = NLoginCore_453.B("ĄõûäĕĊþėČýĢĪúìďĂčġĶđįēĀā", (byte)23, 66);
               b[32] = NLoginCore_559.C("ѤхЯяѨѰѸѭвзишщђиљѴєїиёѐэю", (byte)23, 67);
               b[33] = NLoginCore_553.A("ÞĕĒĤĢĥġĠþĜĦêĳóĴćģÿčĕęĹĀā", (byte)23, 65);
               b[34] = NLoginCore_127.F("ԠՊԿԼԜՇԽԯԼԟԨԓԎՅԧԷՊՕԿՍԹԩԦԧ", (byte)23, 70);
               b[35] = NLoginCore_427.D("аёўѵЯѤњъѐээт", (byte)23, 68);
               b[36] = NLoginCore_324.D("птпжЮѕыкѨѩљѯляљѸѓѕмцћѐэю", (byte)23, 68);
               b[37] = NLoginCore_553.E("ԢՈԢԍԮԨԉ\u0530ԴԲԧՈԴՙԗ\u0558ԭԲԙՊԮբՁՀԖՕ՟ԙՙեԴԼԬՃեՆԢՠՉՑԭՒՒԻ", (byte)23, 69);
               b[38] = NLoginCore_127.F("ԃԮՊԫԫՒԫԓԴՀՆՎԵԴԖԯԒԭԨ՜Ջա՛ՐԳԡէՓՙԶԹՈ", (byte)23, 70);
               b[39] = NLoginCore_451.F("ԶԫՍԣՎՄՂԞԣԳԔՕԥՐԫՑՑԚԹ՟՟ՑԶբԣ՛Ղ՞ՂԵՇզ", (byte)23, 70);
               b[40] = NLoginCore_004.F("ՁԪԯՀԭՎԥԿՄԿԏԴՙԩԭԚԳԜ՟ԿԝԹԦԧ", (byte)23, 70);
               b[41] = NLoginCore_027.D("ъџЮжчжъѴѼяѳќяѰѠѲѷіѡмѼѩѦќ҃ѫѽўѷўѩѦ", (byte)23, 68);
               b[42] = NLoginCore_521.E("ՈԞԷՃՊԲԈԿԪԋՖՓՅԬԳԨԒ՛ԸՉԷՠԳՂեՑՆ՜թԛՀԡ", (byte)23, 69);
               break;
            case 2:
               b[0] = NLoginCore_384.C("пѨѬрѯЮѱѴђкьѕѐоѼѱѲуюѓѺѐэю", (byte)23, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_201.B("ĕðĉĄãĚüýęğĦõ", (byte)23, 66);
         }
      }
   }

   @Generated
   public boolean aD() {
      return this.aB;
   }

   private static String a(int var0, long var1) {
      var1 ^= 101L;
      var1 ^= 3312254705812168841L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(67 + 2),
                     (byte)(45 + 38),
                     (byte)(45 + 2),
                     (byte)(66 + 1),
                     (byte)(8 + 58),
                     (byte)(40 + 27),
                     (byte)(6 + 41),
                     (byte)(43 + 37),
                     (byte)(42 + 33),
                     (byte)(59 + 8),
                     (byte)(82 + 1),
                     (byte)(30 + 23),
                     (byte)(63 + 17),
                     (byte)(70 + 27),
                     (byte)(2 + 98),
                     100,
                     (byte)(12 + 93),
                     (byte)(82 + 28),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.D("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠒࠤߴࠠࠕࠠࠅࠉࠬ\u082f", (byte)51, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_566.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.A("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 65), NLoginCore_566.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.E("և֔֓Ֆ֖֒֍֖֡\u0590՝֛֛֟֘֡գࣺࣶࣶࣨ࣊࣫ࣛࣟंअչ", (byte)104, 69) + var1 + NLoginCore_553.B("Ɖ", (byte)104, 66) + var2.toString(), var4
         );
      }
   }
}
