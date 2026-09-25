package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_102 implements NLoginInterface_014 {
   b,
   c,
   d,
   e,
   f,
   g(a(NLoginCore_102.ce, NLoginCore_102.cf ^ NLoginCore_102.cg), (NLoginCore_102 != 0).ch),
   h(a(NLoginCore_102.cm, NLoginCore_102.cn ^ NLoginCore_102.co), (NLoginCore_102 != 0).cp),
   i(a(NLoginCore_102.cu & NLoginCore_102.cv, NLoginCore_102.cw), (NLoginCore_102 != 0).cx),
   j(a(NLoginCore_102.dc, NLoginCore_102.dd), (NLoginCore_102 != 0).de),
   k(a(NLoginCore_102.di, NLoginCore_102.dj ^ NLoginCore_102.dk), (NLoginCore_102 != 0).dl),
   l(a(NLoginCore_102.dq & NLoginCore_102.dr, NLoginCore_102.ds), (NLoginCore_102 != 0).dt),
   m(a(NLoginCore_102.dy, NLoginCore_102.dz ^ NLoginCore_102.ea), (NLoginCore_102 != 0).eb),
   n(a(NLoginCore_102.eg, NLoginCore_102.eh ^ NLoginCore_102.ei), (NLoginCore_102 != 0).ej),
   o(a(NLoginCore_102.eo, NLoginCore_102.ep), (NLoginCore_102 != 0).eq),
   p(a(NLoginCore_102.ev & NLoginCore_102.ew, NLoginCore_102.ex), (NLoginCore_102 != 0).ey),
   q(a(NLoginCore_102.fd, NLoginCore_102.fe ^ NLoginCore_102.ff), (NLoginCore_102 != 0).fg);

   final NLoginCore_474 d;
   public final boolean aH;
   private static String[] ZKM_STR_A = new String[NLoginCore_102.ah];
   private static String[] ZKM_STR_B = new String[NLoginCore_102.ai];
   private static long c;
   private static int a = 0 >>> 124 | 0 << -124;
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   private static long e = Long.reverse(-1022169732842148990L);
   private static long f = Long.reverse(-6773413839565225984L);
   private static int g = 67108864 >>> 250 | 67108864 << ~250 + 1;
   private static long h = Long.reverse(6039474482874788738L);
   private static int i = Integer.reverse(1073741824);
   private static long j = Long.reverse(-1022169732842148990L);
   private static long k = Long.reverse(-6773413839565225984L);
   private static int l = 201326592 >>> 154 | 201326592 << ~154 + 1;
   private static long m = Long.reverse(6039474482874788738L);
   private static int n = (2 >>> 127 | 2 << ~127 + 1) & -1;
   private static int o = (-1 >>> 25 | -1 << ~25 + 1) & -1;
   private static long p = Long.reverse(6039474482874788738L);
   private static int q = Integer.reverse(134217728);
   private static int r = 0 >>> 141 | 0 << ~141 + 1;
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = 2048 >>> 202 | 2048 << -202;
   private static int u = 201326592 >>> 90 | 201326592 << -90;
   private static int v = 268435456 >>> 58 | 268435456 << ~58 + 1;
   private static int w = 1280 >>> 104 | 1280 << -104;
   private static int x = Integer.reverse(1610612736);
   private static int y = 1879048192 >>> 124 | 1879048192 << -124;
   private static int z = (64 >>> 3 | 64 << ~3 + 1) & -1;
   private static int aa = 1207959552 >>> 251 | 1207959552 << -251;
   private static int ab = 10485760 >>> 244 | 10485760 << -244;
   private static int ac = Integer.reverse(-805306368);
   private static int ad = 98304 >>> 141 | 98304 << -141;
   private static int ae = Integer.reverse(-1342177280);
   private static int af = 1835008 >>> 113 | 1835008 << -113;
   private static int ag = 62914560 >>> 182 | 62914560 << -182;
   private static int ah = Integer.reverse(-1543503872);
   private static int ai = (-1811939328 >>> 218 | -1811939328 << ~218 + 1) & -1;
   private static int aj = Integer.reverse(-1610612736);
   private static long ak = Long.reverse(6039474482874788738L);
   private static int al = Integer.reverse(0);
   private static int am = 262144 >>> 146 | 262144 << -146;
   private static int an = Integer.reverse(0);
   private static int ao = 25165824 >>> 54 | 25165824 << ~54 + 1;
   private static int ap = (-1 >>> 206 | -1 << -206) & -1;
   private static long aq = Long.reverse(6039474482874788738L);
   private static int ar = Integer.reverse(-536870912);
   private static long as = Long.reverse(6039474482874788738L);
   private static int at = Integer.reverse(Integer.MIN_VALUE);
   private static int au = '耀' >>> 'O' | 32768 << -79;
   private static int av = (0 >>> 248 | 0 << ~248 + 1) & -1;
   private static int aw = Integer.reverse(268435456);
   private static int ax = (-1 >>> 247 | -1 << ~247 + 1) & -1;
   private static long ay = Long.reverse(6039474482874788738L);
   private static int az = Integer.reverse(-1879048192);
   private static long ba = Long.reverse(-1022169732842148990L);
   private static long bb = Long.reverse(-6773413839565225984L);
   private static int bc = 4096 >>> 107 | 4096 << ~107 + 1;
   private static int bd = 65536 >>> 208 | 65536 << -208;
   private static int be = (0 >>> 0 | 0 << ~0 + 1) & -1;
   private static int bf = Integer.reverse(1342177280);
   private static long bg = Long.reverse(-1022169732842148990L);
   private static long bh = Long.reverse(-6773413839565225984L);
   private static int bi = 11534336 >>> 116 | 11534336 << ~116 + 1;
   private static long bj = Long.reverse(-1022169732842148990L);
   private static long bk = Long.reverse(-6773413839565225984L);
   private static int bl = Integer.reverse(-1073741824);
   private static int bm = 268435456 >>> 92 | 268435456 << ~92 + 1;
   private static int bn = Integer.reverse(0);
   private static int bo = (805306368 >>> 26 | 805306368 << ~26 + 1) & -1;
   private static int bp = -1 >>> 190 | -1 << ~190 + 1;
   private static long bq = Long.reverse(6039474482874788738L);
   private static int br = Integer.reverse(-1342177280);
   private static long bs = Long.reverse(-1022169732842148990L);
   private static long bt = Long.reverse(-6773413839565225984L);
   private static int bu = Integer.reverse(536870912);
   private static int bv = (1 >>> 32 | 1 << -32) & -1;
   private static int bw = Integer.reverse(0);
   private static int bx = Integer.reverse(1879048192);
   private static int by = Integer.reverse(-1);
   private static long bz = Long.reverse(6039474482874788738L);
   private static int ca = Integer.reverse(-268435456);
   private static long cb = Long.reverse(-1022169732842148990L);
   private static long cc = Long.reverse(-6773413839565225984L);
   private static int cd = 1310720 >>> 210 | 1310720 << ~210 + 1;
   private static int ce = Integer.reverse(134217728);
   private static long cf = Long.reverse(-1022169732842148990L);
   private static long cg = Long.reverse(-6773413839565225984L);
   private static int ch = 524288 >>> 51 | 524288 << ~51 + 1;
   private static int ci = ('蠀' >>> 11 | 34816 << ~11 + 1) & -1;
   private static int cj = Integer.reverse(-1);
   private static long ck = Long.reverse(6039474482874788738L);
   private static int cl = Integer.reverse(1610612736);
   private static int cm = 2304 >>> 167 | 2304 << -167;
   private static long cn = Long.reverse(-1022169732842148990L);
   private static long co = Long.reverse(-6773413839565225984L);
   private static int cp = ('耀' >>> 175 | 32768 << -175) & -1;
   private static int cq = Integer.reverse(-939524096);
   private static long cr = Long.reverse(-1022169732842148990L);
   private static long cs = Long.reverse(-6773413839565225984L);
   private static int ct = Integer.reverse(-536870912);
   private static int cu = 83886080 >>> 118 | 83886080 << -118;
   private static int cv = (-1 >>> 150 | -1 << -150) & -1;
   private static long cw = Long.reverse(6039474482874788738L);
   private static int cx = 16 >>> 132 | 16 << -132;
   private static int cy = 1073741829 >>> 30 | 1073741829 << ~30 + 1;
   private static long cz = Long.reverse(-1022169732842148990L);
   private static long da = Long.reverse(-6773413839565225984L);
   private static int db = 2048 >>> 72 | 2048 << ~72 + 1;
   private static int dc = -2147483643 >>> 254 | -2147483643 << -254;
   private static long dd = Long.reverse(6039474482874788738L);
   private static int de = (131072 >>> 241 | 131072 << ~241 + 1) & -1;
   private static int df = Integer.reverse(-402653184);
   private static long dg = Long.reverse(6039474482874788738L);
   private static int dh = Integer.reverse(-1879048192);
   private static int di = (1572864 >>> 144 | 1572864 << ~144 + 1) & -1;
   private static long dj = Long.reverse(-1022169732842148990L);
   private static long dk = Long.reverse(-6773413839565225984L);
   private static int dl = Integer.reverse(Integer.MIN_VALUE);
   private static int dm = (409600 >>> 238 | 409600 << -238) & -1;
   private static int dn = Integer.reverse(-1);
   private static long var_do = Long.reverse(6039474482874788738L);
   private static int dp = (1342177280 >>> 27 | 1342177280 << -27) & -1;
   private static int dq = Integer.reverse(1476395008);
   private static int dr = (-1 >>> 82 | -1 << -82) & -1;
   private static long ds = Long.reverse(6039474482874788738L);
   private static int dt = Integer.reverse(Integer.MIN_VALUE);
   private static int du = Integer.reverse(-671088640);
   private static long dv = Long.reverse(-1022169732842148990L);
   private static long dw = Long.reverse(-6773413839565225984L);
   private static int dx = '뀀' >>> '\f' | 45056 << ~12 + 1;
   private static int dy = (229376 >>> 13 | 229376 << ~13 + 1) & -1;
   private static long dz = Long.reverse(-1022169732842148990L);
   private static long ea = Long.reverse(-6773413839565225984L);
   private static int eb = Integer.reverse(Integer.MIN_VALUE);
   private static int ec = (1073741831 >>> 126 | 1073741831 << ~126 + 1) & -1;
   private static long ed = Long.reverse(-1022169732842148990L);
   private static long ee = Long.reverse(-6773413839565225984L);
   private static int ef = (24576 >>> 75 | 24576 << -75) & -1;
   private static int eg = 1920 >>> 166 | 1920 << -166;
   private static long eh = Long.reverse(-1022169732842148990L);
   private static long ei = Long.reverse(-6773413839565225984L);
   private static int ej = Integer.reverse(Integer.MIN_VALUE);
   private static int ek = 15872 >>> 41 | 15872 << ~41 + 1;
   private static long el = Long.reverse(-1022169732842148990L);
   private static long em = Long.reverse(-6773413839565225984L);
   private static int en = Integer.reverse(-1342177280);
   private static int eo = 536870912 >>> 56 | 536870912 << ~56 + 1;
   private static long ep = Long.reverse(6039474482874788738L);
   private static int eq = 65536 >>> 80 | 65536 << ~80 + 1;
   private static int er = (-2147483632 >>> 191 | -2147483632 << -191) & -1;
   private static long es = Long.reverse(-1022169732842148990L);
   private static long et = Long.reverse(-6773413839565225984L);
   private static int eu = 112 >>> 99 | 112 << -99;
   private static int ev = 1073741828 >>> 157 | 1073741828 << ~157 + 1;
   private static int ew = Integer.reverse(-1);
   private static long ex = Long.reverse(6039474482874788738L);
   private static int ey = Integer.reverse(Integer.MIN_VALUE);
   private static int ez = 8960 >>> 200 | 8960 << -200;
   private static long fa = Long.reverse(-1022169732842148990L);
   private static long fb = Long.reverse(-6773413839565225984L);
   private static int fc = Integer.reverse(-268435456);
   private static int fd = (9216 >>> 104 | 9216 << ~104 + 1) & -1;
   private static long fe = Long.reverse(-1022169732842148990L);
   private static long ff = Long.reverse(-6773413839565225984L);
   private static int fg = (16384 >>> 78 | 16384 << -78) & -1;

   private NLoginCore_102(String var3, boolean var4) {
      String[] var10001 = new String[b];
      var10001[c] = a(d, e ^ f) + var3;
      this.d = NLoginCore_474.a(var10001);
      this.aH = var4;
   }

   private NLoginCore_102(String... var3) {
      this.d = NLoginCore_474.a(Arrays.stream(var3).map(var0 -> a(n & o, p) + var0).toArray(String[]::new));
      this.aH = (a != 0);
   }

   @Override
   public Object a() {
      return new NLoginCore_190(a(g, h) + this.name(), null);
   }

   private static void b() {
      c = 4743860187304102799L;
      long var0 = c ^ 4629065021068597965L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(8 + 60),
               (byte)(51 + 18),
               (byte)(81 + 2),
               (byte)(25 + 22),
               (byte)(44 + 23),
               (byte)(53 + 13),
               (byte)(24 + 43),
               (byte)(4 + 43),
               80,
               (byte)(47 + 28),
               (byte)(53 + 14),
               (byte)(49 + 34),
               (byte)(4 + 49),
               (byte)(14 + 66),
               (byte)(39 + 58),
               100,
               (byte)(2 + 98),
               (byte)(24 + 81),
               (byte)(25 + 85),
               (byte)(57 + 46)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_427.E("ԪԌԆՎԏԽԥԞԌՎԵԪԐԘԨԥԫԵԞԝԽԔԼ՝ԲԳԼբՕԹՙՋ", (byte)24, 69);
               ZKM_STR_B[1] = NLoginCore_223.C("ыѨгѳѧѦєѾѿіѮх", (byte)24, 67);
               ZKM_STR_B[2] = NLoginCore_241.F("ԾԤՌԞԥԌԩՀՌԮՅԜ", (byte)24, 70);
               ZKM_STR_B[3] = NLoginCore_241.E("ՉԺԗԞՃԫՒՄՇԲԒԜ", (byte)24, 69);
               ZKM_STR_B[4] = NLoginCore_387.B("ąçáĩêĘĀùçĩĐąëóăĀĆĐùøĘïėĸčĎėĽİĔĴĦ", (byte)24, 66);
               ZKM_STR_B[5] = NLoginCore_471.B("ĨÿĠûâĭúĀþĪġČĜĔĒĤęīĺûĦąĂă", (byte)24, 66);
               ZKM_STR_B[6] = NLoginCore_127.E("ԌՆԚ\u0530ՋՐ\u0530ԨԏՓՔԡԸԨՔՓԼԦԫԷԽՐԧԨ", (byte)24, 69);
               ZKM_STR_B[7] = NLoginCore_384.E("ԌՇՐԯԡԡԜԑՆ\u0557ԒԜ", (byte)24, 69);
               ZKM_STR_B[8] = NLoginCore_384.D("ѦѰішэђєѩенѠх", (byte)24, 68);
               ZKM_STR_B[9] = NLoginCore_397.F("ԾԚԅԡԪՇՀԯՖՑԯԜ", (byte)24, 70);
               ZKM_STR_B[10] = NLoginCore_183.A("öçàĤëāĭęøëé÷", (byte)24, 65);
               ZKM_STR_B[11] = NLoginCore_324.E("ԢԈԽԂԫԐԍԒԣԾԎԮԏՑԥԱ՜ԮԮԗԽԪԧԨ", (byte)24, 69);
               ZKM_STR_B[12] = NLoginCore_201.F("ՃԽՇՃՌՉԟՕԭՇԍԦԘՈԣԘ՚ՑՖ՝ԸՠԧԨ", (byte)24, 70);
               ZKM_STR_B[13] = NLoginCore_201.B("Ĥěòüúăû÷îěĥČþģīĆĐāďôĔīĂă", (byte)24, 66);
               ZKM_STR_B[14] = NLoginCore_223.A("ăßĢĖĆĥîĝĝċĈĴīČîĨİĩĶúûąĂă", (byte)24, 65);
               ZKM_STR_B[15] = NLoginCore_173.E("ԪՁԫՆԞԺԧՅՉԔԡԗԒ\u0557ԗ՜ՓԸԗՏՖԪԧԨ", (byte)24, 69);
               ZKM_STR_B[16] = NLoginCore_138.E("ՍԙԡԚԇԛԎԐԠՊՏՅՓՖԷՕԺԭԶՖԯՠԧԨ", (byte)24, 69);
               ZKM_STR_B[17] = NLoginCore_004.D("шѰЪэѐхгѦѾзєх", (byte)24, 68);
               ZKM_STR_B[18] = NLoginCore_453.E("ԸԮՐԻՌԒԒՂԭԕՅԜ", (byte)24, 69);
               ZKM_STR_B[19] = NLoginCore_141.B("ĉèĨĉ÷ĊêąýêĨ÷", (byte)24, 66);
               ZKM_STR_B[20] = NLoginCore_553.A("ąĊēþěĚĖāıèĤ÷", (byte)24, 65);
               ZKM_STR_B[21] = NLoginCore_521.C("ўчэюѩњђжьёзёѻ҄кѡ҇҇ѣтѣѹѐё", (byte)24, 67);
               ZKM_STR_B[22] = NLoginCore_091.F("ՈԣԛԤՊԞԎԬԯԲՃԮԤ\u0530ԬԒՋ\u0530ԞՀ\u0558ԪԧԨ", (byte)24, 70);
               ZKM_STR_B[23] = NLoginCore_092.F("ԦԹԬՌԧԨԝԦՐԱՍԜ", (byte)24, 70);
               ZKM_STR_B[24] = NLoginCore_559.E("ՇԡԚՌՄԜՉՅԋԪԳԜ", (byte)24, 69);
               ZKM_STR_B[25] = NLoginCore_183.E("ԋԥՃ\u0530ԫԺԞԐԝԾԷԜ", (byte)24, 69);
               ZKM_STR_B[26] = NLoginCore_027.D("шдѶѓьиѪйѨѵлх", (byte)24, 68);
               ZKM_STR_B[27] = NLoginCore_446.D("пзЮињивѺѳёѠх", (byte)24, 68);
               ZKM_STR_B[28] = NLoginCore_173.C("ѷѶєѓѪѪѺѺёьѺх", (byte)24, 67);
               ZKM_STR_B[29] = NLoginCore_004.F("ԙԜԟՋՂՀՈԨՒԡՖԩԳ\u0558ՖԮՔԼՌԨԸՐԧԨ", (byte)24, 70);
               ZKM_STR_B[30] = NLoginCore_387.D("ЯьљвјщќѷѕѴѽѝѕѤтіѻѻѰђѠѹѐё", (byte)24, 68);
               ZKM_STR_B[31] = NLoginCore_232.E("ՂԽՐԇԥԎԼԮԬԿԭԕԖՍՐԖՕԛԾԵԱԪԧԨ", (byte)24, 69);
               ZKM_STR_B[32] = NLoginCore_559.F("ԃԝԩՈԙԌԩԎԱՓԟԐԯՙՕԛԳՉԕ՛ՁՠԧԨ", (byte)24, 70);
               ZKM_STR_B[33] = NLoginCore_397.E("ՍԝԆՍՍԎՍԍԳՊԧԜ", (byte)24, 69);
               ZKM_STR_B[34] = NLoginCore_027.D("гѧѓхыѬйѻаѬѾх", (byte)24, 68);
               ZKM_STR_B[35] = NLoginCore_232.B("Ĥę÷ĜĘĦìčĤĠí÷", (byte)24, 66);
               ZKM_STR_B[36] = NLoginCore_427.C("ѧѳѷёдзњђѴѩзх", (byte)24, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.D("ѓеЯѷиѦючеѷўѓйсёюєўчцѦ҉ѾѿѸ҈ѸѾѻѐ҆ўѫҖѲ҄ѤѓѮћѐғѬѥ", (byte)24, 68);
               ZKM_STR_B[1] = NLoginCore_387.F("ԠԧՍԠՏԝԠԽՕՍՕԜ", (byte)24, 70);
               ZKM_STR_B[2] = NLoginCore_183.C("ѥыѮхѳјыѳйђшх", (byte)24, 67);
               ZKM_STR_B[3] = NLoginCore_530.B("ðÿė÷ùāĈéìąąåĀĤčĲĊģćĆĤĻĂă", (byte)24, 66);
               ZKM_STR_B[4] = NLoginCore_471.E("ԪԌԆՎԏԽԥԞԌՎԵԪԐԘԨԥԫԵԞԝԽԘՃՙԷԢ\u0558՚ՄզԷը", (byte)24, 69);
               ZKM_STR_B[5] = NLoginCore_223.D("ѶэѮщаѻшюьѸѱҀҀѐѯѽѳцѠѓѫѵѣ҆ѻююяҐџѼч", (byte)24, 68);
               ZKM_STR_B[6] = NLoginCore_223.F("ԌՆԚ\u0530ՋՐ\u0530ԨԏՓՑՍՌԗՌ՛ԾՇԝՀՠՐԧԨ", (byte)24, 70);
               ZKM_STR_B[7] = NLoginCore_241.D("ѤѥрѩцлњѥѝђѲх", (byte)24, 68);
               ZKM_STR_B[8] = NLoginCore_241.D("ууиѩѲѷѼгѿѱѰѲьўѻѲѥяё҅щѣѐё", (byte)24, 68);
               ZKM_STR_B[9] = NLoginCore_110.B("òĘäĚğåĬąĝğĜ÷", (byte)24, 66);
               ZKM_STR_B[10] = NLoginCore_553.F("ՉՏՂԺԏՓԡՔԑՅԔՐՌՉԹ՛ՙ՚ՐԬՠՠԧԨ", (byte)24, 70);
               ZKM_STR_B[11] = NLoginCore_530.E("ԢԈԽԂԫԐԍԒԣԾԐՁԑԤԘՅԫԸՔԪ՟ԪԧԨ", (byte)24, 69);
               ZKM_STR_B[12] = NLoginCore_553.B("ĞĘĢĞħĤúİĈĢèīĞđăīĭĲĉĊčīĂă", (byte)24, 66);
               ZKM_STR_B[13] = NLoginCore_324.E("ՉՀԗԡԟԨԠԜԓՀՊՉԥՆԖԳԗՌՠ\u0530ԬՠԧԨ", (byte)24, 69);
               ZKM_STR_B[14] = NLoginCore_446.B("ăßĢĖĆĥîĝĝċĉÿñđġįïĥĸĵúĻĂă", (byte)24, 66);
               ZKM_STR_B[15] = NLoginCore_559.F("ԪՁԫՆԞԺԧՅՉԔԠԸԓԩԧԨ\u0530ԨՔՔՕՠԧԨ", (byte)24, 70);
               ZKM_STR_B[16] = NLoginCore_427.E("ՍԙԡԚԇԛԎԐԠՊՎՎՋԕՙԓԼԯԕՖԸԪԧԨ", (byte)24, 69);
               ZKM_STR_B[17] = NLoginCore_521.A("ĔúĩĚöëĀħĂĤĮýĔģĀėĸĲõĶùĻĂă", (byte)24, 65);
               ZKM_STR_B[18] = NLoginCore_232.B("ăĠĜóĔėčĝďĩĜĩĬģēđĒđĦĚĴąĂă", (byte)24, 66);
               ZKM_STR_B[19] = NLoginCore_559.C("дѕжиѯћњчѰўвѢћўѲнњѝѳѽћѣѐё", (byte)24, 67);
               ZKM_STR_B[20] = NLoginCore_324.C("ѰѱцьѤљѥяйҀшњѝѹҁѤўѨчфњѣѐё", (byte)24, 67);
               ZKM_STR_B[21] = NLoginCore_127.A("ĐùÿĀěČĄèþăìħêĩîĈĤĲ÷İļĻĂă", (byte)24, 65);
               ZKM_STR_B[22] = NLoginCore_232.E("ՈԣԛԤՊԞԎԬԯԲՁԪԳՊԛՌԮԛՇՀ\u0558ՠԧԨ", (byte)24, 69);
               ZKM_STR_B[23] = NLoginCore_575.D("бѫѳѤщгѧиѾжѻѿємїѴњіѾшмѣѐё", (byte)24, 68);
               ZKM_STR_B[24] = NLoginCore_076.A("åĀćĊâğąĄďġāĄĐîİîò÷ĶĻėĕĂă", (byte)24, 65);
               ZKM_STR_B[25] = NLoginCore_110.F("ԵԹԗԩՃԺԜԣԕԷՂԬԪԧԲԔ՛ԞԺՔՐՠԧԨ", (byte)24, 70);
               ZKM_STR_B[26] = NLoginCore_223.E("ԋՍԦԩՆԡԭՃԋՂՉԜ", (byte)24, 69);
               ZKM_STR_B[27] = NLoginCore_453.E("ԊԞԤԈԜԌԍԠԢՉԤՂԴՔԓԼԨԮՇԵԬՐԧԨ", (byte)24, 69);
               ZKM_STR_B[28] = NLoginCore_427.C("ѬтѦѕѻќьѩѱъѹѰяоѳѕтѶѩѡѿ҉ѐё", (byte)24, 67);
               ZKM_STR_B[29] = NLoginCore_076.C("тхшѴѫѩѱёѻъҀѾѺѾўѢс҆҃҃ѳ҉ѐё", (byte)24, 67);
               ZKM_STR_B[30] = NLoginCore_384.B("áþċäĊûĎĩćĦįĳĵĴčĂąĤĳĜĐĕĂă", (byte)24, 66);
               ZKM_STR_B[31] = NLoginCore_004.E("ՂԽՐԇԥԎԼԮԬԿԭԊԐՂՒԳՔԾ\u0558ՒԓՠԧԨ", (byte)24, 69);
               ZKM_STR_B[32] = NLoginCore_530.A("ÞøĄģôçĄéČĮüĊìĠĢĥėĨČñīąĂă", (byte)24, 65);
               ZKM_STR_B[33] = NLoginCore_110.A("ėñááéćČĊçĉĝĴíĆïïïĪñĉĒĕĂă", (byte)24, 65);
               ZKM_STR_B[34] = NLoginCore_241.B("ĞĖĩêĆèěĠîħčĆĨıčĈĤıóĴĲīĂă", (byte)24, 66);
               ZKM_STR_B[35] = NLoginCore_446.E("ԧԪԡԤՐՑԬՕԵՒԧԜ", (byte)24, 69);
               ZKM_STR_B[36] = NLoginCore_141.D("хѧцђѴѶѤљѫёѲх", (byte)24, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.D("ѱбсѰѓѮѷќѦёђѬіѱѾ҅њфѶп҄҉ѐё", (byte)24, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.A("āĤģċĦĮĠĚČĀĚīĭāİįïīĒĈĜĻĂă", (byte)24, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 69L;
      var1 ^= 4629065021068597965L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(44 + 25),
                     (byte)(9 + 74),
                     47,
                     (byte)(32 + 35),
                     (byte)(57 + 9),
                     67,
                     (byte)(2 + 45),
                     (byte)(69 + 11),
                     (byte)(2 + 73),
                     (byte)(7 + 60),
                     (byte)(45 + 38),
                     (byte)(15 + 38),
                     (byte)(8 + 72),
                     (byte)(90 + 7),
                     (byte)(94 + 6),
                     (byte)(49 + 51),
                     (byte)(66 + 39),
                     (byte)(82 + 28),
                     (byte)(50 + 53)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.B("ƞƫƪŭƭƩƤƭƸƧŴƲƶƯƲƸźӴӠӷԘӸӥԐԈԍ", (byte)94, 66));
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
   public NLoginCore_208 a() {
      throw new UnsupportedOperationException();
   }

   @Override
   public NLoginCore_474 a() {
      return this.d;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_102.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), NLoginCore_102.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_453.B("ðýü¿ÿûöÿĊùÆĄĈāĄĊÌцвщѪъзѢњџá", (byte)7, 66) + var1 + NLoginCore_521.F("ӽ", (byte)7, 70) + var2.toString(), var4);
      }
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(aj, ak);
      int var10003 = al;
      String[] var10004 = new String[am];
      var10004[an] = a(ao & ap, aq);
      b = new NLoginCore_102(var10004);
      var10002 = a(ar, as);
      var10003 = at;
      var10004 = new String[au];
      var10004[av] = a(aw & ax, ay);
      c = new NLoginCore_102(var10004);
      var10002 = a(az, ba ^ bb);
      var10003 = bc;
      var10004 = new String[bd];
      var10004[be] = a(bf, bg ^ bh);
      d = new NLoginCore_102(var10004);
      var10002 = a(bi, bj ^ bk);
      var10003 = bl;
      var10004 = new String[bm];
      var10004[bn] = a(bo & bp, bq);
      e = new NLoginCore_102(var10004);
      var10002 = a(br, bs ^ bt);
      var10003 = bu;
      var10004 = new String[bv];
      var10004[bw] = a(bx & by, bz);
      f = new NLoginCore_102(var10004);
   }

   @Override
   public int a() {
      return this.ordinal();
   }

   @Nullable
   public static NLoginCore_190 a(String var0, NLoginCore_219 var1) {
      String var2 = NLoginCore_065.q(var1.b(var0 + a(i, j ^ k)));
      if (var2 == null) {
         return null;
      } else {
         String var3 = NLoginCore_065.q(var1.b(var0 + a(l, m)));
         return new NLoginCore_190(var2, var3);
      }
   }
}
