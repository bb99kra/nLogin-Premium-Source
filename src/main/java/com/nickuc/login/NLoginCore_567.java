package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_567 {
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
   t,
   u,
   v,
   w,
   x,
   y,
   z,
   A,
   B,
   C,
   D,
   E,
   F,
   G,
   H,
   I,
   J,
   K,
   L,
   M,
   N,
   O;

   private static String[] a = new String[NLoginCore_567.aq];
   private static String[] b = new String[NLoginCore_567.ar];
   private static long c;
   private static int a = 1343488 >>> 143 | 1343488 << ~143 + 1;
   private static int b = (0 >>> 9 | 0 << ~9 + 1) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 1048576 >>> 243 | 1048576 << -243;
   private static int e = 201326592 >>> 26 | 201326592 << -26;
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(-1610612736);
   private static int h = Integer.reverse(1610612736);
   private static int i = Integer.reverse(-536870912);
   private static int j = Integer.reverse(268435456);
   private static int k = (75497472 >>> 87 | 75497472 << -87) & -1;
   private static int l = (20971520 >>> 85 | 20971520 << ~85 + 1) & -1;
   private static int m = Integer.reverse(-805306368);
   private static int n = (100663296 >>> 183 | 100663296 << ~183 + 1) & -1;
   private static int o = (416 >>> 69 | 416 << -69) & -1;
   private static int p = Integer.reverse(1879048192);
   private static int q = (125829120 >>> 119 | 125829120 << -119) & -1;
   private static int r = 1024 >>> 6 | 1024 << ~6 + 1;
   private static int s = Integer.reverse(-2013265920);
   private static int t = Integer.reverse(1207959552);
   private static int u = 76 >>> 66 | 76 << -66;
   private static int v = (2560 >>> 199 | 2560 << ~199 + 1) & -1;
   private static int w = Integer.reverse(-1476395008);
   private static int x = Integer.reverse(1744830464);
   private static int y = Integer.reverse(-402653184);
   private static int z = Integer.reverse(402653184);
   private static int aa = Integer.reverse(-1744830464);
   private static int ab = 851968 >>> 15 | 851968 << -15;
   private static int ac = Integer.reverse(-671088640);
   private static int ad = 114688 >>> 44 | 114688 << ~44 + 1;
   private static int ae = Integer.reverse(-1207959552);
   private static int af = Integer.reverse(2013265920);
   private static int ag = 2080374784 >>> 218 | 2080374784 << -218;
   private static int ah = Integer.reverse(67108864);
   private static int ai = Integer.reverse(-2080374784);
   private static int aj = (1088 >>> 197 | 1088 << ~197 + 1) & -1;
   private static int ak = Integer.reverse(-1006632960);
   private static int al = (288 >>> 67 | 288 << ~67 + 1) & -1;
   private static int am = Integer.reverse(-1543503872);
   private static int an = Integer.reverse(1677721600);
   private static int ao = -2147483629 >>> 223 | -2147483629 << -223;
   private static int ap = Integer.reverse(335544320);
   private static int aq = 1207959553 >>> 123 | 1207959553 << ~123 + 1;
   private static int ar = Integer.reverse(-1811939328);
   private static int as = (0 >>> 146 | 0 << -146) & -1;
   private static long at = Long.reverse(-3731441588276902495L);
   private static long au = Long.reverse(-7061644215716937728L);
   private static int av = Integer.reverse(0);
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static long ax = Long.reverse(-3731441588276902495L);
   private static long ay = Long.reverse(-7061644215716937728L);
   private static int az = (524288 >>> 179 | 524288 << -179) & -1;
   private static int ba = Integer.reverse(1073741824);
   private static long bb = Long.reverse(-3731441588276902495L);
   private static long bc = Long.reverse(-7061644215716937728L);
   private static int bd = Integer.reverse(1073741824);
   private static int be = 1610612736 >>> 93 | 1610612736 << ~93 + 1;
   private static long bf = Long.reverse(-3731441588276902495L);
   private static long bg = Long.reverse(-7061644215716937728L);
   private static int bh = Integer.reverse(-1073741824);
   private static int bi = ('耀' >>> 141 | 32768 << -141) & -1;
   private static long bj = Long.reverse(-3731441588276902495L);
   private static long bk = Long.reverse(-7061644215716937728L);
   private static int bl = 262144 >>> 176 | 262144 << -176;
   private static int bm = Integer.reverse(-1610612736);
   private static long bn = Long.reverse(5924276012805440929L);
   private static int bo = Integer.reverse(-1610612736);
   private static int bp = Integer.reverse(1610612736);
   private static long bq = Long.reverse(-3731441588276902495L);
   private static long br = Long.reverse(-7061644215716937728L);
   private static int bs = 12 >>> 65 | 12 << ~65 + 1;
   private static int bt = Integer.reverse(-536870912);
   private static int bu = Integer.reverse(-1);
   private static long bv = Long.reverse(5924276012805440929L);
   private static int bw = (58720256 >>> 23 | 58720256 << ~23 + 1) & -1;
   private static int bx = Integer.reverse(268435456);
   private static long by = Long.reverse(5924276012805440929L);
   private static int bz = (4 >>> 127 | 4 << ~127 + 1) & -1;
   private static int ca = Integer.reverse(-1879048192);
   private static long cb = Long.reverse(-3731441588276902495L);
   private static long cc = Long.reverse(-7061644215716937728L);
   private static int cd = (-2147483644 >>> 95 | -2147483644 << -95) & -1;
   private static int ce = Integer.reverse(1342177280);
   private static int cf = (-1 >>> 69 | -1 << ~69 + 1) & -1;
   private static long cg = Long.reverse(5924276012805440929L);
   private static int ch = 655360 >>> 176 | 655360 << -176;
   private static int ci = Integer.reverse(-805306368);
   private static long cj = Long.reverse(-3731441588276902495L);
   private static long ck = Long.reverse(-7061644215716937728L);
   private static int cl = Integer.reverse(-805306368);
   private static int cm = 3072 >>> 136 | 3072 << -136;
   private static long cn = Long.reverse(-3731441588276902495L);
   private static long co = Long.reverse(-7061644215716937728L);
   private static int cp = 12288 >>> 138 | 12288 << -138;
   private static int cq = Integer.reverse(-1342177280);
   private static long cr = Long.reverse(-3731441588276902495L);
   private static long cs = Long.reverse(-7061644215716937728L);
   private static int ct = (26 >>> 129 | 26 << -129) & -1;
   private static int cu = 229376 >>> 174 | 229376 << -174;
   private static long cv = Long.reverse(-3731441588276902495L);
   private static long cw = Long.reverse(-7061644215716937728L);
   private static int cx = Integer.reverse(1879048192);
   private static int cy = Integer.reverse(-268435456);
   private static long cz = Long.reverse(5924276012805440929L);
   private static int da = 7864320 >>> 147 | 7864320 << ~147 + 1;
   private static int db = Integer.reverse(134217728);
   private static long dc = Long.reverse(-3731441588276902495L);
   private static long dd = Long.reverse(-7061644215716937728L);
   private static int de = Integer.reverse(134217728);
   private static int df = (2176 >>> 103 | 2176 << -103) & -1;
   private static long dg = Long.reverse(5924276012805440929L);
   private static int dh = 268435457 >>> 124 | 268435457 << -124;
   private static int di = Integer.reverse(1207959552);
   private static long dj = Long.reverse(-3731441588276902495L);
   private static long dk = Long.reverse(-7061644215716937728L);
   private static int dl = Integer.reverse(1207959552);
   private static int dm = 1610612738 >>> 253 | 1610612738 << -253;
   private static long dn = Long.reverse(-3731441588276902495L);
   private static long var_do = Long.reverse(-7061644215716937728L);
   private static int dp = Integer.reverse(-939524096);
   private static int dq = (335544320 >>> 120 | 335544320 << ~120 + 1) & -1;
   private static int dr = (-1 >>> 151 | -1 << -151) & -1;
   private static long ds = Long.reverse(5924276012805440929L);
   private static int dt = Integer.reverse(671088640);
   private static int du = 688128 >>> 47 | 688128 << -47;
   private static long dv = Long.reverse(-3731441588276902495L);
   private static long dw = Long.reverse(-7061644215716937728L);
   private static int dx = 5505024 >>> 178 | 5505024 << -178;
   private static int dy = 369098752 >>> 216 | 369098752 << ~216 + 1;
   private static long dz = Long.reverse(-3731441588276902495L);
   private static long ea = Long.reverse(-7061644215716937728L);
   private static int eb = Integer.reverse(1744830464);
   private static int ec = Integer.reverse(-402653184);
   private static long ed = Long.reverse(-3731441588276902495L);
   private static long ee = Long.reverse(-7061644215716937728L);
   private static int ef = (192937984 >>> 215 | 192937984 << ~215 + 1) & -1;
   private static int eg = Integer.reverse(402653184);
   private static long eh = Long.reverse(-3731441588276902495L);
   private static long ei = Long.reverse(-7061644215716937728L);
   private static int ej = (24 >>> 224 | 24 << ~224 + 1) & -1;
   private static int ek = (204800 >>> 13 | 204800 << -13) & -1;
   private static int el = -1 >>> 200 | -1 << ~200 + 1;
   private static long em = Long.reverse(5924276012805440929L);
   private static int en = Integer.reverse(-1744830464);
   private static int eo = (26 >>> 96 | 26 << ~96 + 1) & -1;
   private static long ep = Long.reverse(-3731441588276902495L);
   private static long eq = Long.reverse(-7061644215716937728L);
   private static int er = -1610612735 >>> 220 | -1610612735 << -220;
   private static int es = Integer.reverse(-671088640);
   private static long et = Long.reverse(5924276012805440929L);
   private static int eu = Integer.reverse(-671088640);
   private static int ev = Integer.reverse(939524096);
   private static long ew = Long.reverse(5924276012805440929L);
   private static int ex = (28 >>> 32 | 28 << -32) & -1;
   private static int ey = Integer.reverse(-1207959552);
   private static int ez = Integer.reverse(-1);
   private static long fa = Long.reverse(5924276012805440929L);
   private static int fb = (-805306367 >>> 60 | -805306367 << ~60 + 1) & -1;
   private static int fc = Integer.reverse(2013265920);
   private static long fd = Long.reverse(-3731441588276902495L);
   private static long fe = Long.reverse(-7061644215716937728L);
   private static int ff = (251658240 >>> 183 | 251658240 << -183) & -1;
   private static int fg = (7936 >>> 40 | 7936 << ~40 + 1) & -1;
   private static long fh = Long.reverse(-3731441588276902495L);
   private static long fi = Long.reverse(-7061644215716937728L);
   private static int fj = (253952 >>> 237 | 253952 << -237) & -1;
   private static int fk = Integer.reverse(67108864);
   private static long fl = Long.reverse(-3731441588276902495L);
   private static long fm = Long.reverse(-7061644215716937728L);
   private static int fn = Integer.reverse(67108864);
   private static int fo = Integer.reverse(-2080374784);
   private static long fp = Long.reverse(-3731441588276902495L);
   private static long fq = Long.reverse(-7061644215716937728L);
   private static int fr = Integer.reverse(-2080374784);
   private static int fs = Integer.reverse(1140850688);
   private static int ft = Integer.reverse(-1);
   private static long fu = Long.reverse(5924276012805440929L);
   private static int fv = (2176 >>> 166 | 2176 << ~166 + 1) & -1;
   private static int fw = 140 >>> 162 | 140 << -162;
   private static int fx = Integer.reverse(-1);
   private static long fy = Long.reverse(5924276012805440929L);
   private static int fz = Integer.reverse(-1006632960);
   private static int ga = Integer.reverse(603979776);
   private static long gb = Long.reverse(-3731441588276902495L);
   private static long gc = Long.reverse(-7061644215716937728L);
   private static int gd = Integer.reverse(603979776);
   private static int ge = Integer.reverse(-1543503872);
   private static long gf = Long.reverse(5924276012805440929L);
   private static int gg = Integer.reverse(-1543503872);
   private static int gh = '頀' >>> 234 | 38912 << -234;
   private static long gi = Long.reverse(-3731441588276902495L);
   private static long gj = Long.reverse(-7061644215716937728L);
   private static int gk = Integer.reverse(1677721600);
   private static int gl = 81788928 >>> 245 | 81788928 << ~245 + 1;
   private static int gm = -1 >>> 61 | -1 << -61;
   private static long gn = Long.reverse(5924276012805440929L);
   private static int go = Integer.reverse(-469762048);
   private static int gp = Integer.reverse(335544320);
   private static long gq = Long.reverse(-3731441588276902495L);
   private static long gr = Long.reverse(-7061644215716937728L);
   private static int gs = Integer.reverse(335544320);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_567.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.E("ԳՕ\u0557Է՛պղֈմՃցշօտՈխ֏֎ֆ\u058cֆ՛", (byte)79, 69), NLoginCore_567.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.D("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡳࡦ\u086fࡳࡲࡷࡔࡴ࡛ࡰࡣࢂࢅࡻӻ", (byte)79, 68) + var1 + NLoginCore_141.F("Յ", (byte)79, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -8817127243806217165L;
      long var0 = c ^ -5004135535276055818L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(55 + 14),
               (byte)(15 + 68),
               (byte)(14 + 33),
               (byte)(33 + 34),
               (byte)(15 + 51),
               67,
               (byte)(17 + 30),
               (byte)(11 + 69),
               (byte)(61 + 14),
               (byte)(25 + 42),
               (byte)(33 + 50),
               (byte)(42 + 11),
               (byte)(50 + 30),
               (byte)(70 + 27),
               (byte)(72 + 28),
               (byte)(65 + 35),
               (byte)(31 + 74),
               (byte)(64 + 46),
               (byte)(6 + 97)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_553.F("ԘԪԳԙՊԩԻՓԸՂԤԪ", (byte)38, 70);
               b[1] = NLoginCore_241.A("ĹĲĘĔĔĲĖĂŉĊĆĢĹĲņĜĠĽŕĤńıĞğ", (byte)38, 65);
               b[2] = NLoginCore_324.E("ԨԳԩՙԖ՜ԛգՐաՕ\u0557ՠՑԣԜիԺըՇԸԸԵԶ", (byte)38, 69);
               b[3] = NLoginCore_076.A("ğĸńįŇħŃĕķĕĮē", (byte)38, 65);
               b[4] = NLoginCore_446.E("ԓԛԺԬՑԿԷԸԳԺԠԪ", (byte)38, 69);
               b[5] = NLoginCore_427.C("ґҘѾҏѾѼѵҤҢѨҒҫѥѻѷѽѰ҂ѺҴҏҳѺѻ", (byte)38, 67);
               b[6] = NLoginCore_521.F("\u0530ՇԭՊԙաԡԜՙԺՁՎՁԳՑԸԳԼՌԩԧծԵԶ", (byte)38, 70);
               b[7] = NLoginCore_559.E("ԛՊՖԫՕՒԝՋ\u0558ԣզէՖԣ՛ԷՖԢՕՄհՈԵԶ", (byte)38, 69);
               b[8] = NLoginCore_387.E("ՄԙԜ՜ԼՐԱԽԼՏզԲԿՄՄԹԼԨ՛ԷՋ՞ԵԶ", (byte)38, 69);
               b[9] = NLoginCore_559.E("ԤԱԸՊ՞Ը\u0530ՒԚգԞ՚ԟԥՊԴա՚՝ժաԹխբՇՄԿՐժՃպբ", (byte)38, 69);
               b[10] = NLoginCore_232.F("Ԧ\u0558ԭ\u0530ՔԖԩԿԛԭԢ՚ԻՂԺՃՄԾՖ\u0558խծԵԶ", (byte)38, 70);
               b[11] = NLoginCore_232.F("ՙԵԭ՞ԴՔԹ՜ԭԮՂ\u0558Ԟ՜\u0557ՁդՆՎՉԩ՞ԵԶ", (byte)38, 70);
               b[12] = NLoginCore_559.A("čĲğĘļėľķĿćąē", (byte)38, 65);
               b[13] = NLoginCore_433.E("ԗԨԓՖԲԒ՟ՏԾԯԺբՂըդեդզՃըԹաՌեծԽծէիձշՒ", (byte)38, 69);
               b[14] = NLoginCore_446.B("ĔęŀēĿěĴĵĔĿŋĭĆńďĞįĲĶĒńŇĞğ", (byte)38, 66);
               b[15] = NLoginCore_027.D("іҞҙҠҡҁҖ҈ҩҙѼҡ҉ѻѬѭҙѿѽѯѫңѺѻ", (byte)38, 68);
               b[16] = NLoginCore_110.F("ՎՈՖԖՏՒԾՌԶՍԜՓդՐժ՜ԹՇՈըԻՙղժղիզղՈՈՈզ", (byte)38, 70);
               b[17] = NLoginCore_004.D("ғҍқћҔҗ҃ґѻҒѡҘҩҕүҡѾҌҍҭҀҞѨҧҁңҲѷѸҪҬ҉ҟ҉ҊғҒѼҤҢҀҿҚҏ", (byte)38, 68);
               b[18] = NLoginCore_451.A("ĠĽįğđĈĚĬĕĠŌģīİĜĉĝŎĢėģġĞğ", (byte)38, 65);
               b[19] = NLoginCore_384.D("ҙѼҚҁҔѼ҄ѯѴѹ҄ѶѥҘҥѻ҉҃ҫҭ҇ѽѺѻ", (byte)38, 68);
               b[20] = NLoginCore_384.B("ĂġħĻĄĴĤŌĶŎĻİęĲĲőŔŃĞĉőıĞğ", (byte)38, 66);
               b[21] = NLoginCore_521.D("ѼѾҒҡѿҀѴҏҘҦҦѹ҅җҨѷѪѫҀұғ҄ҀҢҧҧңҵҏұҮҗ", (byte)38, 68);
               b[22] = NLoginCore_091.E("ԹԷՅ\u0557ՕԝԙՎԭ\u0530դ\u0557Օթ՚ՙԧԵէԨաՍԧԫԫԳԫգխգՋո", (byte)38, 69);
               b[23] = NLoginCore_446.B("ĠĢĶŅģĤĘĳļŊŊŌīŋģĮĒČčŅĦĪŚńėįőĵŞğşš", (byte)38, 66);
               b[24] = NLoginCore_451.D("҉ѼҞҍѾѵҜҥѨҥҙҞѥ҃ҞѻѼѧңѬѴңѺѻ", (byte)38, 68);
               b[25] = NLoginCore_138.D("ґѭҗҤѸѯҤҐҗѠѶѯ", (byte)38, 68);
               b[26] = NLoginCore_433.F("ՒՖԖԺԕՈ\u0558ՖՍԹԤԱԷԻեԢՆժըԪՅՈԵԶ", (byte)38, 70);
               b[27] = NLoginCore_183.C("ѽҏ҃ҋҖҏѲҕҘѢңѡҤѥ҇ҮѾѱҠҡ҆ҩѭҠҁ҉ҍ҇ҍѸѸҗ", (byte)38, 67);
               b[28] = NLoginCore_004.A("āĶĤįēĈĒĊĦģĨŁīļĦňĩćŎœłŗĞğ", (byte)38, 65);
               b[29] = NLoginCore_453.C("ѝҒҀҋѯѤѮѦ҂ѿ҅ѷ҂҂ҋѫѻҡѬҪѼҠҢҘҘ҈ҹѷ҆ҌҧҲ", (byte)38, 67);
               b[30] = NLoginCore_384.D("їҁѿҌѝҡҡҀѽѢ҃ѨҖѼѺҚҐҥҟҢѬѬ҂Ҩ҄ҪҬҮҐҕҝҏ", (byte)38, 68);
               b[31] = NLoginCore_091.A("ĽńņįĝŅńŉęğėĚħćďľőĠĿĢŏĲŋŇĒēĬœœłĠįţőŢŒŜŪşũŚĬŊĳ", (byte)38, 65);
               b[32] = NLoginCore_451.F("ՓԮԜԲԪ\u0558ԹԝՀՒԗՅԝՠ՟ԤԨԬժՉհաԱլղեՅՂՇՃխշՅոՓ՜ԵԻ՚ՎՓխեՊ", (byte)38, 70);
               b[33] = NLoginCore_559.A("ĖďĔŁĴĹĹŉŋěĩĿĜŌĠīŋŇŒėĸēČŜŗŒŚĿŒĪŀŝ", (byte)38, 65);
               b[34] = NLoginCore_451.A("ŃĿĖğğľěăČÿĈľĮĦĮĐĴŕŏŀĳıĞğ", (byte)38, 65);
               b[35] = NLoginCore_446.D("҉ѩҕѾҒѱғѢ҃ѼѤѽҍѨқҟѩҥҬѻҥҋҕүҌ҂ҨһғҧҘҚ", (byte)38, 68);
               b[36] = NLoginCore_076.A("ĔĜĤđęĿĈęĻĖċĈħňĻđĥĝŌŉŎĦĒŖĤśęœŊİŏő", (byte)38, 65);
               b[37] = NLoginCore_110.A("ĤŃľęĔđĢĜćīķĽĘġŅľŉĩĴģđĶńģŚĸŞŘŕİļŔ", (byte)38, 65);
               b[38] = NLoginCore_453.F("Ֆ\u0558Ք՛ՎԙԪԡԺԹՓԽդ՝Հ՟Ֆ՛ԧ՞ԥկՂկ՛Ո՞եՀԳԷծ", (byte)38, 70);
               b[39] = NLoginCore_433.C("ҙғћҕҔңҝҕғ҈ҢҀҩҘѸҍҩ҂ҢѥҧҀҢҟҹҚҧ҇ҎҗҸѹ", (byte)38, 67);
               b[40] = NLoginCore_223.D("ѠҒқѬ҂џҡўѴҘҟѝѸҥҬѷҁҨҮҫ҂ѽѺѻ", (byte)38, 68);
               break;
            case 1:
               b[0] = NLoginCore_446.E("Ոԧ՜՛ԘԹՓԠԜԚԭՅԻՑ՟ՂԶ\u0557թԶՄՈԵԶ", (byte)38, 69);
               b[1] = NLoginCore_324.D("ҕҎѴѰѰҎѲўҥѦѢҪѬѿѫҰҞҝҁҜҴңѺѻ", (byte)38, 68);
               b[2] = NLoginCore_397.F("ԨԳԩՙԖ՜ԛգՐաՕդԢՂԣՂթԷդկԼծԵԶ", (byte)38, 70);
               b[3] = NLoginCore_201.C("ѫѳҒћѤғѡѽѽѹѾѯ", (byte)38, 67);
               b[4] = NLoginCore_427.E("ԚՋ\u0530ԬԲԳՑԡ\u0557ՠԱԜՏՖՉՓ՚ԴժՉխՈԵԶ", (byte)38, 69);
               b[5] = NLoginCore_387.F("ՌՓԹՊԹԷ\u0530՟՝ԣՍդԣդ՚դՁԿծ՚ՈԿԪԿէդՔԮլճեԴ", (byte)38, 70);
               b[6] = NLoginCore_433.C("ѵҌѲҏўҦѦѡҞѿ҉҃ѦѬҖҗҙҬѾҦүҳѺѻ", (byte)38, 67);
               b[7] = NLoginCore_127.B("ĄĳĿĔľĻĆĴŁČŌłĨņļĽĠĬŗŌħıĞğ", (byte)38, 66);
               b[8] = NLoginCore_324.E("ՄԙԜ՜ԼՐԱԽԼՏգՃԷՓԡԤՃբԽծ՚ծԵԶ", (byte)38, 69);
               b[9] = NLoginCore_397.A("čĚġĳŇġęĻăŌćŃĈĎĳĝŊŃņœŊġŇĕĕīŝıĭŘļŒ", (byte)38, 65);
               b[10] = NLoginCore_004.B("ďŁĖęĽÿĒĨĄĖċīŎŋŀŏŕŊŗēřĮĲŜĪĬĖŇļĺŠŎ", (byte)38, 66);
               b[11] = NLoginCore_232.E("ՙԵԭ՞ԴՔԹ՜ԭԮՁբՄՁՓՈՋՙԫՋ՟՞ԵԶ", (byte)38, 69);
               b[12] = NLoginCore_201.C("ѭѬҚґҙҥѽҕҕңҨѯ", (byte)38, 67);
               b[13] = NLoginCore_004.C("ќѭјқѷїҤҔ҃Ѵѿҧ҇ҭҩҪҩҫ҈ҭѾүҏѵҥұѬҕҰҬҝҰ", (byte)38, 67);
               b[14] = NLoginCore_530.F("ԫ\u0530\u0557ԪՖԲՋՌԫՖՠԡՈԧ՞զիՀՖա՛խխՠԭՋեըԵՁԸե", (byte)38, 70);
               b[15] = NLoginCore_110.D("іҞҙҠҡҁҖ҈ҩҙѽҨҜ҉ѽҝҎѮѬҲ҂ҍѺѻ", (byte)38, 68);
               b[16] = NLoginCore_027.E("ՎՈՖԖՏՒԾՌԶՍԜՓդՐժ՜ԹՇՈըԻՋՃԿ՜ՄԬՓԳահԲնյՊՎչ՛ԾմբՐԼՊ", (byte)38, 69);
               b[17] = NLoginCore_241.C("ғҍқћҔҗ҃ґѻҒѡҘҩҕүҡѾҌҍҭҀҞѨҧҁңҲѷѸҪҬ҉ӁҀңҬҵҤ҄ғ҂ҹӈҏ", (byte)38, 67);
               b[18] = NLoginCore_183.E("ԷՔՆԶԨԟԱՃԬԷե՜ԠԴԿՓԼէեՂեԸԵԶ", (byte)38, 69);
               b[19] = NLoginCore_471.F("ՔԷՕԼՏԷԿԪԯԴԽԱՐ՛Ԩ\u0558ԴթթՌթծԵԶ", (byte)38, 70);
               b[20] = NLoginCore_553.D("ўѽ҃җѠҐҀҨҒҪҗѽҘ҂ҬҨҩѣѬҲҭѽѺѻ", (byte)38, 68);
               b[21] = NLoginCore_559.C("ѼѾҒҡѿҀѴҏҘҦҦѹ҅җҨѷѪѫҀұғ҇ҳҐҶҒ҅ҚҼҸҵҮ", (byte)38, 67);
               b[22] = NLoginCore_027.B("ĢĠĮŀľĆĂķĖęōŀľŒŃłĐĞŐđŊņĵĘĴĔřŐĶėŔōŝĶĿģŚĻœŜřśŎĳ", (byte)38, 66);
               b[23] = NLoginCore_092.E("ԷԹՍ՜ԺԻԯՊՓաագՂբԺՅԩԣԤ՜ԽՇՋՠԭՀզՂԴՓհՃեԴնյԷՓղծայճՊ", (byte)38, 69);
               b[24] = NLoginCore_076.D("҉ѼҞҍѾѵҜҥѨҥҙѵҁҖѪѫѰҫҀҨѽҕүґ҂ѲҦѺѲҲҿҍ", (byte)38, 68);
               b[25] = NLoginCore_397.C("ѬҚҊѷѴѯѵқҀѶѾ҈ҋѽѭҮҧѯҬҒѮҳѺѻ", (byte)38, 67);
               b[26] = NLoginCore_324.F("ՒՖԖԺԕՈ\u0558ՖՍԹԥՓՑԿ՛ՓԿՍԻ\u0557լ՞ԵԶ", (byte)38, 70);
               b[27] = NLoginCore_471.B("ġĳħįĺĳĖĹļĆŇąňĉīŒĢĕńŅĪŏŅĤōĽňŘŌġśŌ", (byte)38, 66);
               b[28] = NLoginCore_521.B("āĶĤįēĈĒĊĦģĦŎěŎěŐħŉŊŎŉġĞğ", (byte)38, 66);
               b[29] = NLoginCore_451.B("āĶĤįēĈĒĊĦģĩěĦĦįďğŅĐŎĠŁŕĬŘŗŖĴĲŚśş", (byte)38, 66);
               b[30] = NLoginCore_387.A("ûĥģİāŅŅĤġĆħČĺĠĞľĴŉŃņĐĖĬŅİĪĖşěĮŗġ", (byte)38, 65);
               b[31] = NLoginCore_559.A("ĽńņįĝŅńŉęğėĚħćďľőĠĿĢŏĲŋŇĒēĬœœłĠįŘĽķĢŤřĶŞŜĭŘĳ", (byte)38, 65);
               b[32] = NLoginCore_521.C("ҘѳѡѷѯҝѾѢ҅җќҊѢҥҤѩѭѱүҎҵҦѶұҷҪҊ҇Ҍ҈ҲҼѸѹһҞҰҵ҆ҡҞҽҚҏ", (byte)38, 67);
               b[33] = NLoginCore_110.D("ѲѫѰҝҐҕҕҥҧѷ҅қѸҨѼ҇ҧңҮѳҔѳҴҔѳҁѵҮұҧҍѱ", (byte)38, 68);
               b[34] = NLoginCore_201.C("ҟқѲѻѻҚѷџѨћѡҊѻѤҦҢѦ҆ѲҡѮңѺѻ", (byte)38, 67);
               b[35] = NLoginCore_004.E("ՄԤՐԹՍԬՎԝԾԷԟԸՈԣՖ՚ԤՠէԶՠՃԧԲԾԱՁծճհԯՂ", (byte)38, 69);
               b[36] = NLoginCore_559.B("ĔĜĤđęĿĈęĻĖċĈħňĻđĥĝŌŉŎĢĮģŗōĵňšŊĲœ", (byte)38, 66);
               b[37] = NLoginCore_076.C("ҀҟҚѵѰѭѾѸѣ҇ғҙѴѽҡҚҥ҅ҐѿѭҎҪғҳҨғҏҽҘһҸ", (byte)38, 67);
               b[38] = NLoginCore_553.F("Ֆ\u0558Ք՛ՎԙԪԡԺԹՓԽդ՝Հ՟Ֆ՛ԧ՞ԥԨՀՆ՛թՈգԶբՑՙ", (byte)38, 70);
               b[39] = NLoginCore_433.C("ҙғћҕҔңҝҕғ҈ҢҀҩҘѸҍҩ҂ҢѥҧѿҪҘҘҭѷѲҴҊҫҾ", (byte)38, 67);
               b[40] = NLoginCore_127.D("ѠҒқѬ҂џҡўѴҘҟҤҖѶѸҪҨҥ҉ҌҬ҃҂ҶҬҵѶҮҫҳҋҷ", (byte)38, 68);
               break;
            case 2:
               b[0] = NLoginCore_201.C("ѼҐѿѻ҃ҁҡ҈җҀҜѯ", (byte)38, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.E("ՍՈՓԙԩ՛՚ԘԵՌ՝Օ՟ԤգՒԪՇբգՌԮղ\u0530ղճՠՐՂԵծԶ", (byte)38, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 121L;
      var1 ^= -5004135535276055818L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(14 + 54),
                     (byte)(22 + 47),
                     (byte)(35 + 48),
                     (byte)(10 + 37),
                     (byte)(13 + 54),
                     (byte)(34 + 32),
                     (byte)(53 + 14),
                     (byte)(42 + 5),
                     (byte)(66 + 14),
                     (byte)(6 + 69),
                     (byte)(22 + 45),
                     (byte)(49 + 34),
                     (byte)(6 + 47),
                     (byte)(51 + 29),
                     97,
                     (byte)(71 + 29),
                     100,
                     (byte)(69 + 36),
                     (byte)(12 + 98),
                     (byte)(81 + 22)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.B("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӨӛӤӨӧӬӉөӐӥӘӷӺӰ", (byte)76, 66));
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

   public String aB() {
      return this.name();
   }

   static {
      b();
   }
}
