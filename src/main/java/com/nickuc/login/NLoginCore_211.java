package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_211 {
   a(NLoginCore_226.class),
   b(NLoginCore_304.class),
   c(NLoginCore_321.class),
   d(NLoginCore_088.class),
   e(NLoginCore_493.class),
   f(NLoginCore_116.class),
   g(NLoginCore_257.class),
   h(NLoginCore_464.class),
   i(NLoginCore_538.class),
   j(NLoginCore_143.class),
   k(NLoginCore_580.class),
   l(NLoginCore_072.class),
   m(UpdateCommand.class),
   n(NLoginCore_377.class),
   o(NLoginCore_440.class),
   p(NLoginCore_520.class),
   q(NLoginCore_400.class),
   r(BungeeGuardHook.class),
   s(NLoginCore_560.class),
   t(NLoginCore_279.class),
   u(NLoginCore_038.class),
   v(NLoginCore_421.class),
   w(NLoginCore_292.class),
   x(NLoginCore_395.class),
   y(NLoginCore_070.class),
   z(NLoginCore_119.class),
   A(NLoginCore_579.class),
   B(ChatHookManager.class),
   C(NLoginCore_330.class),
   D(NLoginCore_256.class),
   E(NLoginCore_381.class),
   F(NLoginCore_124.class),
   G(ContactCommand.class),
   H(NLoginCore_494.class),
   I(NLoginCore_192.class),
   J(NLoginCore_001.class),
   K(NLoginCore_053.class);

   private final NLoginInterface_012 a;
   private static String[] ZKM_STR_A = new String[NLoginCore_211.av];
   private static String[] ZKM_STR_B = new String[NLoginCore_211.aw];
   private static long c;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = (0 >>> 31 | 0 << -31) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);
   private static int e = 0 >>> 60 | 0 << -60;
   private static int f = Integer.reverse(0);
   private static int g = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static long i = Long.reverse(-8598151967311855558L);
   private static int j = Integer.reverse(-1543503872);
   private static int k = (0 >>> 215 | 0 << ~215 + 1) & -1;
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int m = 16384 >>> 13 | 16384 << -13;
   private static int n = Integer.reverse(-1073741824);
   private static int o = 256 >>> 38 | 256 << ~38 + 1;
   private static int p = 335544320 >>> 218 | 335544320 << ~218 + 1;
   private static int q = Integer.reverse(1610612736);
   private static int r = (-1073741823 >>> 222 | -1073741823 << -222) & -1;
   private static int s = Integer.reverse(268435456);
   private static int t = (144 >>> 4 | 144 << -4) & -1;
   private static int u = 10 >>> 128 | 10 << ~128 + 1;
   private static int v = (-2147483643 >>> 255 | -2147483643 << ~255 + 1) & -1;
   private static int w = Integer.reverse(805306368);
   private static int x = '퀀' >>> 172 | 53248 << -172;
   private static int y = (14680064 >>> 20 | 14680064 << ~20 + 1) & -1;
   private static int z = 960 >>> 6 | 960 << -6;
   private static int aa = (2 >>> 253 | 2 << ~253 + 1) & -1;
   private static int ab = Integer.reverse(-2013265920);
   private static int ac = (2359296 >>> 17 | 2359296 << ~17 + 1) & -1;
   private static int ad = (1610612738 >>> 29 | 1610612738 << ~29 + 1) & -1;
   private static int ae = -1610612736 >>> 27 | -1610612736 << ~27 + 1;
   private static int af = (84 >>> 194 | 84 << -194) & -1;
   private static int ag = Integer.reverse(1744830464);
   private static int ah = (1543503872 >>> 90 | 1543503872 << ~90 + 1) & -1;
   private static int ai = Integer.reverse(402653184);
   private static int aj = 209715200 >>> 215 | 209715200 << -215;
   private static int ak = (6815744 >>> 114 | 6815744 << -114) & -1;
   private static int al = 884736 >>> 175 | 884736 << -175;
   private static int am = (114688 >>> 236 | 114688 << -236) & -1;
   private static int an = Integer.reverse(-1207959552);
   private static int ao = (15 >>> 63 | 15 << ~63 + 1) & -1;
   private static int ap = (1984 >>> 6 | 1984 << ~6 + 1) & -1;
   private static int aq = 524288 >>> 14 | 524288 << ~14 + 1;
   private static int ar = Integer.reverse(-2080374784);
   private static int as = Integer.reverse(1140850688);
   private static int at = Integer.reverse(-1006632960);
   private static int au = Integer.reverse(603979776);
   private static int av = (19922944 >>> 83 | 19922944 << ~83 + 1) & -1;
   private static int aw = Integer.reverse(1677721600);
   private static int ax = Integer.reverse(Integer.MIN_VALUE);
   private static long ay = Long.reverse(-527701435063926726L);
   private static long az = Long.reverse(8070450532247928832L);
   private static int ba = Integer.reverse(0);
   private static int bb = 1024 >>> 105 | 1024 << ~105 + 1;
   private static long bc = Long.reverse(-527701435063926726L);
   private static long bd = Long.reverse(8070450532247928832L);
   private static int be = 33554432 >>> 249 | 33554432 << -249;
   private static int bf = (12288 >>> 172 | 12288 << ~172 + 1) & -1;
   private static long bg = Long.reverse(-527701435063926726L);
   private static long bh = Long.reverse(8070450532247928832L);
   private static int bi = (8388608 >>> 214 | 8388608 << -214) & -1;
   private static int bj = (1024 >>> 72 | 1024 << ~72 + 1) & -1;
   private static long bk = Long.reverse(-8598151967311855558L);
   private static int bl = Integer.reverse(-1073741824);
   private static int bm = Integer.reverse(-1610612736);
   private static long bn = Long.reverse(-527701435063926726L);
   private static long bo = Long.reverse(8070450532247928832L);
   private static int bp = Integer.reverse(536870912);
   private static int bq = Integer.reverse(1610612736);
   private static long br = Long.reverse(-527701435063926726L);
   private static long bs = Long.reverse(8070450532247928832L);
   private static int bt = (20480 >>> 236 | 20480 << ~236 + 1) & -1;
   private static int bu = Integer.reverse(-536870912);
   private static int bv = (-1 >>> 61 | -1 << -61) & -1;
   private static long bw = Long.reverse(-8598151967311855558L);
   private static int bx = Integer.reverse(1610612736);
   private static int by = Integer.reverse(268435456);
   private static long bz = Long.reverse(-527701435063926726L);
   private static long ca = Long.reverse(8070450532247928832L);
   private static int cb = (-536870912 >>> 157 | -536870912 << ~157 + 1) & -1;
   private static int cc = Integer.reverse(-1879048192);
   private static long cd = Long.reverse(-527701435063926726L);
   private static long ce = Long.reverse(8070450532247928832L);
   private static int cf = Integer.reverse(268435456);
   private static int cg = Integer.reverse(1342177280);
   private static long ch = Long.reverse(-8598151967311855558L);
   private static int ci = Integer.reverse(-1879048192);
   private static int cj = (704 >>> 134 | 704 << -134) & -1;
   private static long ck = Long.reverse(-8598151967311855558L);
   private static int cl = (5242880 >>> 83 | 5242880 << ~83 + 1) & -1;
   private static int cm = Integer.reverse(805306368);
   private static long cn = Long.reverse(-527701435063926726L);
   private static long co = Long.reverse(8070450532247928832L);
   private static int cp = 22528 >>> 11 | 22528 << -11;
   private static int cq = Integer.reverse(-1342177280);
   private static int cr = (-1 >>> 152 | -1 << ~152 + 1) & -1;
   private static long cs = Long.reverse(-8598151967311855558L);
   private static int ct = 402653184 >>> 217 | 402653184 << ~217 + 1;
   private static int cu = Integer.reverse(1879048192);
   private static long cv = Long.reverse(-8598151967311855558L);
   private static int cw = Integer.reverse(-1342177280);
   private static int cx = Integer.reverse(-268435456);
   private static long cy = Long.reverse(-527701435063926726L);
   private static long cz = Long.reverse(8070450532247928832L);
   private static int da = 1835008 >>> 17 | 1835008 << -17;
   private static int db = Integer.reverse(134217728);
   private static long dc = Long.reverse(-527701435063926726L);
   private static long dd = Long.reverse(8070450532247928832L);
   private static int de = (240 >>> 36 | 240 << -36) & -1;
   private static int df = (285212672 >>> 24 | 285212672 << -24) & -1;
   private static long dg = Long.reverse(-527701435063926726L);
   private static long dh = Long.reverse(8070450532247928832L);
   private static int di = (8 >>> 191 | 8 << -191) & -1;
   private static int dj = Integer.reverse(1207959552);
   private static long dk = Long.reverse(-8598151967311855558L);
   private static int dl = (35651584 >>> 21 | 35651584 << -21) & -1;
   private static int dm = 155648 >>> 45 | 155648 << ~45 + 1;
   private static long dn = Long.reverse(-8598151967311855558L);
   private static int var_do = (4718592 >>> 210 | 4718592 << -210) & -1;
   private static int dp = Integer.reverse(671088640);
   private static int dq = -1 >>> 210 | -1 << -210;
   private static long dr = Long.reverse(-8598151967311855558L);
   private static int ds = Integer.reverse(-939524096);
   private static int dt = Integer.reverse(-1476395008);
   private static long du = Long.reverse(-8598151967311855558L);
   private static int dv = Integer.reverse(671088640);
   private static int dw = Integer.reverse(1744830464);
   private static int dx = -1 >>> 41 | -1 << ~41 + 1;
   private static long dy = Long.reverse(-8598151967311855558L);
   private static int dz = 1073741829 >>> 126 | 1073741829 << ~126 + 1;
   private static int ea = 23552 >>> 106 | 23552 << -106;
   private static long eb = Long.reverse(-8598151967311855558L);
   private static int ec = (720896 >>> 47 | 720896 << -47) & -1;
   private static int ed = (24576 >>> 106 | 24576 << -106) & -1;
   private static long ee = Long.reverse(-8598151967311855558L);
   private static int ef = 1507328 >>> 208 | 1507328 << ~208 + 1;
   private static int eg = Integer.reverse(-1744830464);
   private static long eh = Long.reverse(-527701435063926726L);
   private static long ei = Long.reverse(8070450532247928832L);
   private static int ej = (12 >>> 159 | 12 << -159) & -1;
   private static int ek = Integer.reverse(1476395008);
   private static int el = -1 >>> 6 | -1 << -6;
   private static long em = Long.reverse(-8598151967311855558L);
   private static int en = (1638400 >>> 208 | 1638400 << -208) & -1;
   private static int eo = -671088640 >>> 219 | -671088640 << -219;
   private static long ep = Long.reverse(-527701435063926726L);
   private static long eq = Long.reverse(8070450532247928832L);
   private static int er = 872415232 >>> 89 | 872415232 << ~89 + 1;
   private static int es = Integer.reverse(939524096);
   private static long et = Long.reverse(-527701435063926726L);
   private static long eu = Long.reverse(8070450532247928832L);
   private static int ev = (108 >>> 162 | 108 << -162) & -1;
   private static int ew = (58 >>> 1 | 58 << ~1 + 1) & -1;
   private static long ex = Long.reverse(-8598151967311855558L);
   private static int ey = Integer.reverse(939524096);
   private static int ez = Integer.reverse(2013265920);
   private static long fa = Long.reverse(-527701435063926726L);
   private static long fb = Long.reverse(8070450532247928832L);
   private static int fc = Integer.reverse(-1207959552);
   private static int fd = Integer.reverse(-134217728);
   private static int fe = Integer.reverse(-1);
   private static long ff = Long.reverse(-8598151967311855558L);
   private static int fg = Integer.reverse(2013265920);
   private static int fh = (65536 >>> 235 | 65536 << ~235 + 1) & -1;
   private static int fi = (-1 >>> 73 | -1 << -73) & -1;
   private static long fj = Long.reverse(-8598151967311855558L);
   private static int fk = Integer.reverse(-134217728);
   private static int fl = Integer.reverse(-2080374784);
   private static int fm = -1 >>> 27 | -1 << ~27 + 1;
   private static long fn = Long.reverse(-8598151967311855558L);
   private static int fo = Integer.reverse(67108864);
   private static int fp = 17408 >>> 169 | 17408 << ~169 + 1;
   private static long fq = Long.reverse(-527701435063926726L);
   private static long fr = Long.reverse(8070450532247928832L);
   private static int fs = Integer.reverse(-2080374784);
   private static int ft = -1073741816 >>> 158 | -1073741816 << ~158 + 1;
   private static int fu = -1 >>> 104 | -1 << ~104 + 1;
   private static long fv = Long.reverse(-8598151967311855558L);
   private static int fw = Integer.reverse(1140850688);
   private static int fx = Integer.reverse(603979776);
   private static long fy = Long.reverse(-527701435063926726L);
   private static long fz = Long.reverse(8070450532247928832L);
   private static int ga = Integer.reverse(-1006632960);
   private static int gb = Integer.reverse(-1543503872);
   private static long gc = Long.reverse(-8598151967311855558L);
   private static int gd = 72 >>> 225 | 72 << -225;

   private static NLoginCore_211[] a(boolean var0) {
      if (var0) {
         NLoginCore_211[] var1 = values();
         NLoginCore_211[] var2 = new NLoginCore_211[var1.length];
         int var3 = e;
         NLoginCore_211[] var4 = var1;
         int var5 = var1.length;

         for (int var6 = f; var6 < var5; var6++) {
            NLoginCore_211 var7 = var4[var6];
            if (var7.a instanceof NLoginInterface_010) {
               var2[var3++] = var7;
            }
         }

         var4 = var1;
         var5 = var1.length;

         for (int var10 = g; var10 < var5; var10++) {
            NLoginCore_211 var11 = var4[var10];
            if (!(var11.a instanceof NLoginInterface_010)) {
               var2[var3++] = var11;
            }
         }

         return var2;
      } else {
         return values();
      }
   }

   private NLoginCore_211(Class<? extends NLoginInterface_012> var3) {
      try {
         Class[] var10002 = new Class[a];
         var10002[b] = NLoginCore_211.class;
         Constructor var10001 = var3.getConstructor(var10002);
         Object[] var6 = new Object[c];
         var6[d] = this;
         this.a = (NLoginInterface_012)var10001.newInstance(var6);
      } catch (ReflectiveOperationException var5) {
         throw new RuntimeException(var5);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_211.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_211.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.F("ըյմԷշճծշւձԾռրչռւՄࢿ࣊ࢳ࣓ࣗ\u08e2࣏࣡\u0558", (byte)73, 70) + var1 + NLoginCore_433.B("ŋ", (byte)73, 66) + var2.toString(), var4
         );
      }
   }

   public NLoginInterface_012 a() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 14L;
      var1 ^= -2601058630964876980L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(11 + 57),
                     (byte)(43 + 26),
                     (byte)(26 + 57),
                     (byte)(36 + 11),
                     67,
                     (byte)(65 + 1),
                     (byte)(61 + 6),
                     47,
                     (byte)(30 + 50),
                     (byte)(72 + 3),
                     (byte)(48 + 19),
                     (byte)(64 + 19),
                     (byte)(34 + 19),
                     (byte)(23 + 57),
                     (byte)(28 + 69),
                     (byte)(32 + 68),
                     (byte)(4 + 96),
                     (byte)(28 + 77),
                     (byte)(8 + 102),
                     (byte)(51 + 52)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.C("мщшЋычтыіхВѐєэѐіИޓޞއޫާ\u07b6ޣ\u07b5", (byte)12, 67));
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

   public int v() {
      return this.ordinal();
   }

   static {
      b();
   }

   private static void b() {
      c = 6629494282591712543L;
      long var0 = c ^ -2601058630964876980L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(10 + 59),
               (byte)(23 + 60),
               (byte)(19 + 28),
               (byte)(50 + 17),
               (byte)(11 + 55),
               67,
               (byte)(27 + 20),
               (byte)(40 + 40),
               (byte)(29 + 46),
               (byte)(29 + 38),
               (byte)(31 + 52),
               (byte)(29 + 24),
               (byte)(3 + 77),
               (byte)(32 + 65),
               100,
               (byte)(34 + 66),
               (byte)(20 + 85),
               (byte)(106 + 4),
               (byte)(24 + 79)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.F("֗՚֎ս֗ո՞՞֘ք֛֢՞յդճոբչ\u058b֮չխգ֊ի֔մ֧֭փ֍և֑֭օ֨\u058cָրտ֛ջ։", (byte)101, 70);
               ZKM_STR_B[1] = NLoginCore_110.C("Ծ՞ԲՍՖԚՃՓ՞ՃՑ՟Օաթգ՞\u0557հլՇԫՐՠՈԵկՉէձպջպխշ՜ԾմԼվչՕԾՌ", (byte)101, 67);
               ZKM_STR_B[2] = NLoginCore_091.A("ƣǃƗƲƻſƨƸǃƨƹƾƉơƌƋǆƯǃƍǄǐƘǏǖƥǝǑƵǏǒǘ", (byte)101, 65);
               ZKM_STR_B[3] = NLoginCore_575.A("ƖŻƤƞƵƤƧǉƉƣƞƣǋƋƇƦƤưǁƒƠƯƜƝ", (byte)101, 65);
               ZKM_STR_B[4] = NLoginCore_575.B("ƖŻƤƞƵƤƧǉƉƣƞƘƤƊǈǁƎƪǕƮƥǅƜƝ", (byte)101, 66);
               ZKM_STR_B[5] = NLoginCore_004.C("ԵՓԫՁՊԞ\u0557Ձ՞զէգՙզ՜ԶժԷՄՆԭ՞գԬՠշ\u0530բԱՐԶ՚", (byte)101, 67);
               ZKM_STR_B[6] = NLoginCore_027.B("ƚƸƐƦƯƃƼƦǃǋǌƕƌƜǂǋƮǓƔǅƫǅƜƝ", (byte)101, 66);
               ZKM_STR_B[7] = NLoginCore_201.B("ƪǄƣƓƧǆƵƑƵƕƊǃǉƮǆǐƑƒƎǂƓƟƜƝ", (byte)101, 66);
               ZKM_STR_B[8] = NLoginCore_201.B("ƣǃƗƲƻſƨƸǃƨƶǄƺǆǎǈǃƼǕǑƬƕǕƩǃƦƽƔƺƛƪǋƴǝƞƠƲǤǡƳƾǜǖƱ", (byte)101, 66);
               ZKM_STR_B[9] = NLoginCore_324.A("ƀǄƷǂƚƾƜơƨƃǇƜƌƘƮơǒǉǊƪƱǊƧƲǆƺƗƬǝƻƩǋƱǋǁǐǠƙƠƿǖƩƫƱ", (byte)101, 65);
               ZKM_STR_B[10] = NLoginCore_451.B("ƮƎƀǅƞƏƣƅƻƫƘƦǃƥǊƥƩǐƋƪƤǎǋƸƗƓƗƲƽƛƱƱ", (byte)101, 66);
               ZKM_STR_B[11] = NLoginCore_223.A("ƀƎƮƾƜƾſƞƁƹžǆǌƮƹƱƫƿƌƒǗǅƜƝ", (byte)101, 65);
               ZKM_STR_B[12] = NLoginCore_471.B("ƴƷżƢƄǂƹƦƒƇƻƢƅƯƧƠǈǈƲƬǔƟƜƝ", (byte)101, 66);
               ZKM_STR_B[13] = NLoginCore_397.A("ƠǂǀƁƱƷƙƗƔƈƸƧƶƨƨưǇƍǂƍǀƿƏƦƭǄƶƜǊǞƵǌǓǎƚǂǁƷǅǆƹơǪƱ", (byte)101, 65);
               ZKM_STR_B[14] = NLoginCore_223.B("ƠǂǀƁƱƷƙƗƔƈƶǍƿƷǇƛƫƲƓƣƢǍƎǕǙǋǏǏưƳǋƾƹƞǎƾƝǈǕǓƼǩƼƺǙƪǀǭǯƪǪǈǫƿƼƽ", (byte)101, 66);
               ZKM_STR_B[15] = NLoginCore_553.C("Ի՝՛ԜՌՒԴԲԯԣՔԴՔՔԪ՟Իՠՠթզ՝\u0530ժՆՊԴգծԷձէՆտՎԷյփԺւնրՓՌ", (byte)101, 67);
               ZKM_STR_B[16] = NLoginCore_241.B("ƴǀƘƤǁƔƇƝƁƆƛƫƞƙƜƤǈƛƵƨǖƯƜƝ", (byte)101, 66);
               ZKM_STR_B[17] = NLoginCore_453.B("ƠǂǀƁƱƷƙƗƔƈƷǆƈǅƍƦƨƽƩƝǖǆǈƘǂƼǇǙǟƙƚƯ", (byte)101, 66);
               ZKM_STR_B[18] = NLoginCore_559.D("Ի՝՛ԜՌՒԴԲԯԣՓգՈՖ՞\u0557ԩՈՎգԪէՎՋՁՉԲմՄՔոշ", (byte)101, 68);
               ZKM_STR_B[19] = NLoginCore_453.F("Ռք\u0558Ք֘մ՜ղծ֠լ֢զնմ֕֨ֈը֩֎ֆվ֍ս։֢֩փճ֠ձ\u058cնչ֞֍֎ֶַֹ֔֘։", (byte)101, 70);
               ZKM_STR_B[20] = NLoginCore_092.E("ո֚֘ՙ։֏ձկլՠ֏ջ֛ս֚զ֜պ\u058b֢ց֜սժդ։ֈս֗ճֲ֏յֱ֫֊֯յַ\u058b֡֕տ։", (byte)101, 69);
               ZKM_STR_B[21] = NLoginCore_530.A("ƠǂǀƁƱƷƙƗƔƈƷƣǃƥǂƎǄƢƳǊƩǄƥƒƌƱưƥƿƛǚƷǞƬƛƱƵƷǣǪơǃǫǎǧǰǁǛƿǛǢǰǟǴƷǑǆǬƶǋǛǴǏǐ", (byte)101, 65);
               ZKM_STR_B[22] = NLoginCore_004.B("ƾƒƒƒƳƅƹƵƅƚǆǆǋǄǃƯƼơǒƶƓƪƸǖǊǎǇǛƦǋƸƙƲǡǖƳưƦǧǑƢǘǀǦǀǬǬǥǃǢƯǕǁǵƼƽ", (byte)101, 66);
               ZKM_STR_B[23] = NLoginCore_127.E("֓պ֒֔Ֆֈ֒ւռւ\u0590օդ֒ֆփ\u058bենտխ֑֮֝֊հժ\u058b֖֨֯հյևֆְ\u0590\u058cֽ֖֮֨֗֗սֳ֜օ֫\u05c9ֶ֣ևֽ֔֕", (byte)101, 69);
               ZKM_STR_B[24] = NLoginCore_446.A("ƮǃƹǀſƚǅƃƆƥƽƇǉǋƺƎƒƭƓƠƫƴƒƶƥǍƓƪƲƜǜǟ", (byte)101, 65);
               ZKM_STR_B[25] = NLoginCore_384.E("ջֈ։լ֚յ֊\u058c֚֒շհֆ֓փ֡֊չլթ֥֯ժ֢֑րհրֵ\u058bִַ", (byte)101, 69);
               ZKM_STR_B[26] = NLoginCore_451.A("ƳƳƒƮƲƺƕƇżǄƺƪƢǃưƯƐƭǋƍǗǍƪǁƘƨƛưƯǉƴƽ", (byte)101, 65);
               ZKM_STR_B[27] = NLoginCore_173.B("ƳƏưƿſǃƣǅǇƥƞƸƠƟƸƏƉƾƤƪƐƓƕƏƧǔǒƾǉǟƞǔ", (byte)101, 66);
               ZKM_STR_B[28] = NLoginCore_384.F("֛Սն֎տ֖֘ւ֙ի֑֜֝բւմ֣֜֘֠շռտւ֧ծ֯\u058bւָ֪֣", (byte)101, 70);
               ZKM_STR_B[29] = NLoginCore_451.F("նո՚Ք՝՝֞\u058c֙ս՟ա֕ք֛֥զւ֞փցռ֪֧\u058b֣֯կְյֱհ", (byte)101, 70);
               ZKM_STR_B[30] = NLoginCore_110.A("ƘƎǁǄƤƺƦƞƼƳƊƪƼǋƻǑƒǑǌƲưƯƏǈƚǅǒǌƴǘƛƽ", (byte)101, 65);
               ZKM_STR_B[31] = NLoginCore_201.C("ԛ՟Ւ՝ԵՙԷԼՃԞաԧՖՙԥխՀՀ՞ՠԯ՜՜ՂիժիՏհԲՖշ", (byte)101, 67);
               ZKM_STR_B[32] = NLoginCore_092.A("ƠƲƵƔƂƼƾƙƼƈǀƈƚƯƜƐǌƿƜƋǊƶǕǙƖƹǜƦƨƹƯƮ", (byte)101, 65);
               ZKM_STR_B[33] = NLoginCore_553.E("ջ֛կ֊֓\u0557ր\u0590֛ր\u0590խ֕բ՚պ֖ֈզ֡։֭մյ", (byte)101, 69);
               ZKM_STR_B[34] = NLoginCore_076.D("ԾՍԧԪԪԙԝԚԲԯԳ՛ՠՔՅԩԾ՝աեԹՍԫՀՀԾհգՔԷԶՍ", (byte)101, 68);
               ZKM_STR_B[35] = NLoginCore_201.E("զՍո֙֊֑ո՚ռ֣բճգդո֠ստ֝փ֮֗ս֙րժ֊֖ւֲ֖֠", (byte)101, 69);
               ZKM_STR_B[36] = NLoginCore_453.E("ջ֛կ֊֓\u0557ր\u0590֛ր֏֎քճբ֖֔\u058bշ֬։եְֱֶ֛֓֜֜֟֘\u058c", (byte)101, 69);
               ZKM_STR_B[37] = NLoginCore_530.C("ԹՎՙԜՔԙգ՛ՐԣՅԱՁԪԢՌ՛ՌԬԻզհԷԸ", (byte)101, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_138.D("՚ԝՑՀ՚Իԡԡ՛Շ՞եԡԸԧԶԻԥԼՎձԼ\u0530ԦՍԮ\u0557ԷհժՆՐՓԵծԽնԿՁՖռմ՟Ռ", (byte)101, 68);
               ZKM_STR_B[1] = NLoginCore_110.F("ջ֛կ֊֓\u0557ր\u0590֛ր֎֦֛֭֜֒֞֠֔֩քը֍֝օղ֬ֆַָ֤֮ևշչ֯֍֬\u0590֛ջׂ֔։", (byte)101, 70);
               ZKM_STR_B[2] = NLoginCore_141.A("ƣǃƗƲƻſƨƸǃƨƹƾƉơƌƋǆƯǃƍǄǈǏǉƶƗƨƱƫƧǐǐ", (byte)101, 65);
               ZKM_STR_B[3] = NLoginCore_141.C("ԱԖԿԹՐԿՂդԤԾԺԳԹԥզԶՌթՆԫ՟ՎՐՓիԨՇՁՉՖթո", (byte)101, 67);
               ZKM_STR_B[4] = NLoginCore_553.F("ծՓռն֍ռտ֡աջն՟ւո֥֨֒ըշ֜ոս֜ց\u058bւմ\u0590քտ։֓", (byte)101, 70);
               ZKM_STR_B[5] = NLoginCore_004.C("ԵՓԫՁՊԞ\u0557Ձ՞զէգՙզ՜ԶժԷՄՆԭ՛Ԫ՞ՈգիՐՊՒՙե", (byte)101, 67);
               ZKM_STR_B[6] = NLoginCore_110.B("ƚƸƐƦƯƃƼƦǃǋǍƵǀǍƠǒƍǆƭƢƣǗǂǆƳǓƨǋƳƛƹƳ", (byte)101, 66);
               ZKM_STR_B[7] = NLoginCore_530.E("ւ֜ջիտ֞֍թ֍խայ֛ջ֚֚֙֗\u058bըְ֫ևօְֱ֪֕փն֍֑", (byte)101, 69);
               ZKM_STR_B[8] = NLoginCore_453.B("ƣǃƗƲƻſƨƸǃƨƶǄƺǆǎǈǃƼǕǑƬƕǕƩǃƦƽƔƺƛƪǋǕǁƝơǗǓǉǖƳǁǈƱ", (byte)101, 66);
               ZKM_STR_B[9] = NLoginCore_091.A("ƀǄƷǂƚƾƜơƨƃǇƜƌƘƮơǒǉǊƪƱǊƧƲǆƺƗƬǝƻƩǋƹƚǗǜơƠǟƶǓǛǈƱ", (byte)101, 65);
               ZKM_STR_B[10] = NLoginCore_141.E("ֆզ\u0558֝նէջ՝֓փհվ֛ս֢սց֨գւռ֥վլֆִ֪֮\u058cֱֲշ", (byte)101, 69);
               ZKM_STR_B[11] = NLoginCore_183.E("\u0558զֆ֖մ֖\u0557նՙ֑դն֣֚օ֚բւ֊֠շ֧֊֏փ\u0590ցֆ\u058b֦ճկ", (byte)101, 69);
               ZKM_STR_B[12] = NLoginCore_559.F("\u058c֏Քպ՜֑֚վժ՟֕՝գ֢ց֊֥֙և֣դ֜։֥֩֊֦֮֗֯֡\u058c", (byte)101, 70);
               ZKM_STR_B[13] = NLoginCore_427.F("ո֚֘ՙ։֏ձկլՠ\u0590տ֎րրֈ֟ե֚ե֘֗էվօ֜֎մֶ֢֍֤֧֧ֆַּ֛պׂ֯յ֤։", (byte)101, 70);
               ZKM_STR_B[14] = NLoginCore_173.E("ո֚֘ՙ։֏ձկլՠ֎֥֗֏֟ճփ֊իջպ֥զֱ֣֧֧֭ֈ\u058b֣֖֑ն֦֖յׁ֭֠֫֔֕վ־ְֻׂ֧֥֚֠\u058bֽ֔֕", (byte)101, 69);
               ZKM_STR_B[15] = NLoginCore_241.D("Ի՝՛ԜՌՒԴԲԯԣՔԴՔՔԪ՟Իՠՠթզ՝\u0530ժՆՊԴգծԷձէխտՔց\u0557շ՟ՀՁևՏՌ", (byte)101, 68);
               ZKM_STR_B[16] = NLoginCore_027.F("\u058c֘հռ֙լ՟յՙ՞ղ֝֏յ֒եֆըգյւ֏լ֢։ձְַ֦ղ֙֊", (byte)101, 70);
               ZKM_STR_B[17] = NLoginCore_446.D("Ի՝՛ԜՌՒԴԲԯԣՒաԣՠԨՁՃ\u0558ՄԸձիելՔՇԳըգչհղ", (byte)101, 68);
               ZKM_STR_B[18] = NLoginCore_521.B("ƠǂǀƁƱƷƙƗƔƈƸǈƭƻǃƼƎƭƳǈƏǉƭƺƪƴƧƖǒƝǀƵƽƛƸƛǗǃƵƠǊǢǄƱ", (byte)101, 66);
               ZKM_STR_B[19] = NLoginCore_232.F("Ռք\u0558Ք֘մ՜ղծ֠լ֢զնմ֕֨ֈը֩֎ֆվ֍ս։֢֩փճ֠ձ֊֣ֈ֒֞յֲ\u058b׃֑֘։", (byte)101, 70);
               ZKM_STR_B[20] = NLoginCore_092.D("Ի՝՛ԜՌՒԴԲԯԣՒԾ՞Հ՝ԩ՟ԽՎեՄ՟ՀԭԧՌՋՀ՚ԶյՒ՛ձիսՠտ՞՝\u0557դչՌ", (byte)101, 68);
               ZKM_STR_B[21] = NLoginCore_433.B("ƠǂǀƁƱƷƙƗƔƈƷƣǃƥǂƎǄƢƳǊƩǄƥƒƌƱưƥƿƛǚƷǞƬƛƱƵƷǣǪơǃǫǎǧǰǁǛƿǛǢǰǟǫǋƸǖǇǭǱǏƱǊǊ", (byte)101, 66);
               ZKM_STR_B[22] = NLoginCore_232.F("֖ժժժ\u058b՝֑֍՝ղ֣֛֞֞֜և֔չ֪֎իւ\u0590ֳ֢֦֮֟վ֣\u0590ձ֊ֹ֮\u058bֈվֿ֩պְׂ֘սֵֽ֤֟־֊\u05cd׀ֽ֔֕", (byte)101, 70);
               ZKM_STR_B[23] = NLoginCore_223.F("֓պ֒֔Ֆֈ֒ւռւ\u0590օդ֒ֆփ\u058bենտխ֑֮֝֊հժ\u058b֖֨֯հյևֆְ\u0590\u058cֽ֖֮֨֕֒֟ք\u05c8֖֔ս֝և֚֗֔֕", (byte)101, 70);
               ZKM_STR_B[24] = NLoginCore_559.A("ƮǃƹǀſƚǅƃƆƥƽƇǉǋƺƎƒƭƓƠƫǄƶǒǄƪǈǝƕƲǟƝǚǍƽƸƴƳǃƣƠǛǞƱ", (byte)101, 65);
               ZKM_STR_B[25] = NLoginCore_521.E("ջֈ։լ֚յ֊\u058c֚֒շհֆ֓փ֡֊չլթ֯֞իև֍֦֭֕֏ֶ֥ղ", (byte)101, 69);
               ZKM_STR_B[26] = NLoginCore_559.B("ƳƳƒƮƲƺƕƇżǄƺƪƢǃưƯƐƭǋƍǗǆƎƪƒǑƤǚƐƖǒǔ", (byte)101, 66);
               ZKM_STR_B[27] = NLoginCore_232.B("ƳƏưƿſǃƣǅǇƥƞƸƠƟƸƏƉƾƤƪƐƓƦƮƥƦƗǋƖƧǀǖǃƷǒƠưƺƺǅǁƺƫƱ", (byte)101, 66);
               ZKM_STR_B[28] = NLoginCore_127.F("֛Սն֎տ֖֘ւ֙ի֑֜֝բւմ֣֜֘֠շջ֏֤֭֡֝փխֵևւ", (byte)101, 70);
               ZKM_STR_B[29] = NLoginCore_471.F("նո՚Ք՝՝֞\u058c֙ս՟ա֕ք֛֥զւ֞փցփ֧֭ջְ֛յ֊ָֹ֯", (byte)101, 70);
               ZKM_STR_B[30] = NLoginCore_004.F("հզ֙֜ռ֒վն֔\u058bբւ֣֔֓֩ժ֤֩֊ֈ։ջ։ֳ֣օէղ֪֒ց", (byte)101, 70);
               ZKM_STR_B[31] = NLoginCore_027.C("ԛ՟Ւ՝ԵՙԷԼՃԞաԧՖՙԥխՀՀ՞ՠԯ՝ՌՎԵ\u0557ՑԮՐԸճԹ", (byte)101, 67);
               ZKM_STR_B[32] = NLoginCore_127.D("ԻՍՐԯԝ\u0557ՙԴ\u0557ԣ՛ԣԵՊԷԫէ՚ԷԦեՌԿՠթՇխԳ՚ջՈ՝", (byte)101, 68);
               ZKM_STR_B[33] = NLoginCore_027.F("ջ֛կ֊֓\u0557ր\u0590֛ր֑֢֕շ֢֧գ֡֍օջ֭մյ", (byte)101, 70);
               ZKM_STR_B[34] = NLoginCore_433.E("ջ֊դէէՖ՚\u0557կլհ֑֘֝ւզջ֢֚֞ն։֍֑֒ժվ֢֞֎֒֏", (byte)101, 69);
               ZKM_STR_B[35] = NLoginCore_324.C("ԩԐԻ՜ՍՔԻԝԿզԥԶԦԧԻգՀՂՠՆ՚ԤՀՉՑՄճըՈ\u0530մս", (byte)101, 67);
               ZKM_STR_B[36] = NLoginCore_223.D("Ծ՞ԲՍՖԚՃՓ՞ՃՒՑՇԶԥՙ\u0557ՎԺկՌԪիԦԵժՠՍ\u0557ՔծՄ", (byte)101, 68);
               ZKM_STR_B[37] = NLoginCore_223.E("ն\u058b֖ՙ֑Ֆ֠֘֍ՠփմդ֔֓֓֨բվֈլռ֣հ֜֊֮֞ք֪֙֒", (byte)101, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_471.C("\u0558ԙՍԜ՝\u0558ԹԯԟԻԢԬ", (byte)101, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.B("ƸǁŶƎǄǀƥƵơƃƺƑ", (byte)101, 66);
         }
      }
   }

   public static int size() {
      return values().length;
   }

   public static NLoginCore_211 a(int var0, boolean var1) {
      NLoginCore_211[] var2 = a(var1);
      if (var0 >= 0 && var0 < var2.length) {
         return var2[var0];
      } else {
         throw new IllegalArgumentException(a(h, i) + var0);
      }
   }
}
