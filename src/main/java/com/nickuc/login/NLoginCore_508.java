package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_508 implements NLoginInterface_014 {
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
   n(a(NLoginCore_508.er & NLoginCore_508.es, NLoginCore_508.et), (NLoginCore_508 != 0).eu),
   o(a(NLoginCore_508.ez & NLoginCore_508.fa, NLoginCore_508.fb), (NLoginCore_508 != 0).fc),
   p(a(NLoginCore_508.fh, NLoginCore_508.fi), (NLoginCore_508 != 0).fj),
   q(a(NLoginCore_508.fo, NLoginCore_508.fp), (NLoginCore_508 != 0).fq);

   private static final NLoginCore_075 a = new NLoginCore_075();
   final NLoginCore_474 g;
   public final boolean aK;
   private static String[] ZKM_STR_A = new String[NLoginCore_508.ab];
   private static String[] ZKM_STR_B = new String[NLoginCore_508.ac];
   private static long c;
   private static int a = Integer.reverse(0);
   private static int b = 1024 >>> 74 | 1024 << ~74 + 1;
   private static int c = (0 >>> 219 | 0 << ~219 + 1) & -1;
   private static int d = 0 >>> 102 | 0 << -102;
   private static long e = Long.reverse(-6427539086082203837L);
   private static long f = Long.reverse(-8646911284551352320L);
   private static int g = (8 >>> 131 | 8 << -131) & -1;
   private static long h = Long.reverse(-6427539086082203837L);
   private static long i = Long.reverse(-8646911284551352320L);
   private static int j = Integer.reverse(-2013265920);
   private static int k = (0 >>> 69 | 0 << ~69 + 1) & -1;
   private static int l = (256 >>> 200 | 256 << -200) & -1;
   private static int m = (1073741824 >>> 253 | 1073741824 << ~253 + 1) & -1;
   private static int n = 6144 >>> 75 | 6144 << -75;
   private static int o = 4 >>> 224 | 4 << ~224 + 1;
   private static int p = (10240 >>> 139 | 10240 << ~139 + 1) & -1;
   private static int q = (12 >>> 225 | 12 << -225) & -1;
   private static int r = 7168 >>> 170 | 7168 << -170;
   private static int s = Integer.reverse(268435456);
   private static int t = Integer.reverse(-1879048192);
   private static int u = Integer.reverse(1342177280);
   private static int v = 704 >>> 198 | 704 << ~198 + 1;
   private static int w = 12 >>> 32 | 12 << -32;
   private static int x = (52 >>> 130 | 52 << ~130 + 1) & -1;
   private static int y = Integer.reverse(1879048192);
   private static int z = (245760 >>> 78 | 245760 << -78) & -1;
   private static int aa = 1048576 >>> 208 | 1048576 << ~208 + 1;
   private static int ab = Integer.reverse(-1543503872);
   private static int ac = Integer.reverse(-1543503872);
   private static int ad = 64 >>> 5 | 64 << ~5 + 1;
   private static long ae = Long.reverse(3372293703075995459L);
   private static int af = Integer.reverse(0);
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = (0 >>> 188 | 0 << ~188 + 1) & -1;
   private static int ai = 196608 >>> 112 | 196608 << ~112 + 1;
   private static int aj = Integer.reverse(-1);
   private static long ak = Long.reverse(3372293703075995459L);
   private static int al = (268435456 >>> 218 | 268435456 << ~218 + 1) & -1;
   private static long am = Long.reverse(3372293703075995459L);
   private static int an = 32 >>> 165 | 32 << ~165 + 1;
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static int ap = Integer.reverse(0);
   private static int aq = Integer.reverse(-1610612736);
   private static int ar = -1 >>> 43 | -1 << -43;
   private static long as = Long.reverse(3372293703075995459L);
   private static int at = Integer.reverse(1610612736);
   private static long au = Long.reverse(-6427539086082203837L);
   private static long av = Long.reverse(-8646911284551352320L);
   private static int aw = Integer.reverse(1073741824);
   private static int ax = (131072 >>> 113 | 131072 << ~113 + 1) & -1;
   private static int ay = Integer.reverse(0);
   private static int az = (-536870912 >>> 221 | -536870912 << -221) & -1;
   private static long ba = Long.reverse(3372293703075995459L);
   private static int bb = 4194304 >>> 243 | 4194304 << ~243 + 1;
   private static int bc = -1 >>> 39 | -1 << -39;
   private static long bd = Long.reverse(3372293703075995459L);
   private static int be = (96 >>> 229 | 96 << ~229 + 1) & -1;
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = Integer.reverse(0);
   private static int bh = Integer.reverse(-1879048192);
   private static int bi = Integer.reverse(-1);
   private static long bj = Long.reverse(3372293703075995459L);
   private static int bk = 2560 >>> 40 | 2560 << -40;
   private static long bl = Long.reverse(3372293703075995459L);
   private static int bm = (16777216 >>> 118 | 16777216 << ~118 + 1) & -1;
   private static int bn = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
   private static int bo = 0 >>> 25 | 0 << ~25 + 1;
   private static int bp = 369098752 >>> 153 | 369098752 << -153;
   private static int bq = Integer.reverse(-1);
   private static long br = Long.reverse(3372293703075995459L);
   private static int bs = 384 >>> 37 | 384 << -37;
   private static int bt = -1 >>> 103 | -1 << ~103 + 1;
   private static long bu = Long.reverse(3372293703075995459L);
   private static int bv = Integer.reverse(-1610612736);
   private static int bw = (65536 >>> 240 | 65536 << ~240 + 1) & -1;
   private static int bx = Integer.reverse(0);
   private static int by = Integer.reverse(-1342177280);
   private static long bz = Long.reverse(-6427539086082203837L);
   private static long ca = Long.reverse(-8646911284551352320L);
   private static int cb = 14680064 >>> 116 | 14680064 << ~116 + 1;
   private static int cc = Integer.reverse(-1);
   private static long cd = Long.reverse(3372293703075995459L);
   private static int ce = (3 >>> 127 | 3 << -127) & -1;
   private static int cf = Integer.reverse(Integer.MIN_VALUE);
   private static int cg = (0 >>> 127 | 0 << -127) & -1;
   private static int ch = Integer.reverse(-268435456);
   private static long ci = Long.reverse(-6427539086082203837L);
   private static long cj = Long.reverse(-8646911284551352320L);
   private static int ck = Integer.reverse(134217728);
   private static long cl = Long.reverse(-6427539086082203837L);
   private static long cm = Long.reverse(-8646911284551352320L);
   private static int cn = Integer.reverse(-536870912);
   private static int co = 4 >>> 130 | 4 << -130;
   private static int cp = Integer.reverse(0);
   private static int cq = Integer.reverse(-2013265920);
   private static long cr = Long.reverse(-6427539086082203837L);
   private static long cs = Long.reverse(-8646911284551352320L);
   private static int ct = 4718592 >>> 178 | 4718592 << -178;
   private static long cu = Long.reverse(3372293703075995459L);
   private static int cv = 64 >>> 163 | 64 << -163;
   private static int cw = (524288 >>> 179 | 524288 << ~179 + 1) & -1;
   private static int cx = Integer.reverse(0);
   private static int cy = Integer.reverse(-939524096);
   private static long cz = Long.reverse(-6427539086082203837L);
   private static long da = Long.reverse(-8646911284551352320L);
   private static int db = Integer.reverse(671088640);
   private static int dc = Integer.reverse(-1);
   private static long dd = Long.reverse(3372293703075995459L);
   private static int de = Integer.reverse(-1879048192);
   private static int df = 2097152 >>> 181 | 2097152 << ~181 + 1;
   private static int dg = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static int dh = ('ꠀ' >>> 171 | 43008 << ~171 + 1) & -1;
   private static long di = Long.reverse(-6427539086082203837L);
   private static long dj = Long.reverse(-8646911284551352320L);
   private static int dk = Integer.reverse(1744830464);
   private static long dl = Long.reverse(-6427539086082203837L);
   private static long dm = Long.reverse(-8646911284551352320L);
   private static int dn = Integer.reverse(1342177280);
   private static int var_do = (8 >>> 99 | 8 << ~99 + 1) & -1;
   private static int dp = Integer.reverse(0);
   private static int dq = 184 >>> 3 | 184 << -3;
   private static long dr = Long.reverse(3372293703075995459L);
   private static int ds = Integer.reverse(402653184);
   private static int dt = (-1 >>> 77 | -1 << -77) & -1;
   private static long du = Long.reverse(3372293703075995459L);
   private static int dv = -1073741822 >>> 190 | -1073741822 << ~190 + 1;
   private static int dw = 16777216 >>> 152 | 16777216 << ~152 + 1;
   private static int dx = Integer.reverse(0);
   private static int dy = Integer.reverse(-1744830464);
   private static int dz = Integer.reverse(-1);
   private static long ea = Long.reverse(3372293703075995459L);
   private static int eb = Integer.reverse(1476395008);
   private static int ec = Integer.reverse(-1);
   private static long ed = Long.reverse(3372293703075995459L);
   private static int ee = 786432 >>> 80 | 786432 << -80;
   private static int ef = Integer.reverse(1073741824);
   private static int eg = (0 >>> 156 | 0 << ~156 + 1) & -1;
   private static int eh = Integer.reverse(-671088640);
   private static long ei = Long.reverse(3372293703075995459L);
   private static int ej = (4194304 >>> 182 | 4194304 << -182) & -1;
   private static int ek = 224 >>> 227 | 224 << ~227 + 1;
   private static int el = Integer.reverse(-1);
   private static long em = Long.reverse(3372293703075995459L);
   private static int en = Integer.reverse(-1207959552);
   private static int eo = -1 >>> 76 | -1 << -76;
   private static long ep = Long.reverse(3372293703075995459L);
   private static int eq = Integer.reverse(-1342177280);
   private static int er = ('\uf000' >>> 139 | 61440 << ~139 + 1) & -1;
   private static int es = Integer.reverse(-1);
   private static long et = Long.reverse(3372293703075995459L);
   private static int eu = (268435456 >>> 220 | 268435456 << -220) & -1;
   private static int ev = Integer.reverse(-134217728);
   private static int ew = Integer.reverse(-1);
   private static long ex = Long.reverse(3372293703075995459L);
   private static int ey = Integer.reverse(1879048192);
   private static int ez = (2048 >>> 70 | 2048 << ~70 + 1) & -1;
   private static int fa = Integer.reverse(-1);
   private static long fb = Long.reverse(3372293703075995459L);
   private static int fc = (4096 >>> 140 | 4096 << -140) & -1;
   private static int fd = Integer.reverse(-2080374784);
   private static int fe = Integer.reverse(-1);
   private static long ff = Long.reverse(3372293703075995459L);
   private static int fg = Integer.reverse(-268435456);
   private static int fh = Integer.reverse(1140850688);
   private static long fi = Long.reverse(3372293703075995459L);
   private static int fj = Integer.reverse(Integer.MIN_VALUE);
   private static int fk = Integer.reverse(-1006632960);
   private static long fl = Long.reverse(-6427539086082203837L);
   private static long fm = Long.reverse(-8646911284551352320L);
   private static int fn = 64 >>> 34 | 64 << -34;
   private static int fo = 4718592 >>> 17 | 4718592 << -17;
   private static long fp = Long.reverse(3372293703075995459L);
   private static int fq = Integer.reverse(Integer.MIN_VALUE);

   @Override
   public int a() {
      return this.ordinal();
   }

   @Override
   public NLoginCore_208 a() {
      throw new UnsupportedOperationException();
   }

   @Generated
   private NLoginCore_508(NLoginCore_474 var3, boolean var4) {
      this.g = var3;
      this.aK = var4;
   }

   private static void b() {
      c = -4397338019693907099L;
      long var0 = c ^ 3185306714636435977L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(13 + 55),
               (byte)(18 + 51),
               (byte)(78 + 5),
               (byte)(5 + 42),
               (byte)(5 + 62),
               (byte)(18 + 48),
               (byte)(30 + 37),
               47,
               (byte)(9 + 71),
               (byte)(62 + 13),
               67,
               (byte)(27 + 56),
               (byte)(46 + 7),
               (byte)(65 + 15),
               (byte)(69 + 28),
               (byte)(88 + 12),
               (byte)(57 + 43),
               (byte)(72 + 33),
               (byte)(95 + 15),
               (byte)(76 + 27)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_027.C("ԼՑԵ՟ՔՎճս\u0558քսՐ", (byte)113, 67);
               ZKM_STR_B[1] = NLoginCore_427.A("ƕƪƎƸƭƧǌǖƱǝǖƩ", (byte)113, 65);
               ZKM_STR_B[2] = NLoginCore_553.F("՞֧֗֞\u058b՝վ֎տְ֊ְ֩ս։ֹ֪֮֔֙֯ջմ֪շ֊֑։֖֕׀ֲ", (byte)113, 70);
               ZKM_STR_B[3] = NLoginCore_141.B("ƹƼǚưƶƲƟƫǎƸǀǜǧƣƞǢǛǤǋƣǦǭƴƵ", (byte)113, 66);
               ZKM_STR_B[4] = NLoginCore_241.C("ԹւղչզԸՙթ՚\u058bենջևՍՂզՋխ\u058c֎։֎֑կ\u058cպ\u0557ին։ռ", (byte)113, 67);
               ZKM_STR_B[5] = NLoginCore_433.A("ƷǖǘƓǆǈǖǖǜƷƽǗƵƴǃƣƵǅƻƦƤǭƴƵ", (byte)113, 65);
               ZKM_STR_B[6] = NLoginCore_110.C("ռ՛ր՚ՙՄոէթՒջքբՉ\u0558ըսջղՊ֓\u058cՖփ֍խ\u058bՎ֎ծ֠֟", (byte)113, 67);
               ZKM_STR_B[7] = NLoginCore_324.B("ǋƦǚǗƲǖƫƻƳƶƲƞǔƻǀǉǄƵƩǊǖǭƴƵ", (byte)113, 66);
               ZKM_STR_B[8] = NLoginCore_553.C("ռ՛ր՚ՙՄոէթՒջմՕ։իֆլս֏ղ՟գւ\u058cՋփփ֚՛Ք֓՞", (byte)113, 67);
               ZKM_STR_B[9] = NLoginCore_559.C("ՖԿւվջյցՙֆշճ\u058b՚\u0558Տձ՞օե֑Ւ֔՛՜", (byte)113, 67);
               ZKM_STR_B[10] = NLoginCore_324.A("ǙƥƪƵǉǝƝưƔƬƬǖǃǞǅƻǄƳƾǉƭǫƨƩǳưǋǐǂǮǦǎƷǈǙǳǔǴǀǪǓǃƿǉ", (byte)113, 65);
               ZKM_STR_B[11] = NLoginCore_183.F("֦ցգռ֝֓֫եեէք֝֫֝փִ֮֝֟ևփ֍֍չ֏֛֒ս֔֓\u0590ַ", (byte)113, 70);
               ZKM_STR_B[12] = NLoginCore_076.A("ƑƑƗƕưǒǓǢƠǔǢƿǗǧƱǁƳǠǆǡǫƬǉǂǱǋƯǊƴǥǂǡ", (byte)113, 65);
               ZKM_STR_B[13] = NLoginCore_141.B("ƔǗƭǝǒǜƜǐǚƻƛǆƾǀǡǀǗƣǙƤǜǇƴƵ", (byte)113, 66);
               ZKM_STR_B[14] = NLoginCore_559.E("՝՝գառ֮֞֟լֱ֠֟\u058cֲց\u058b֮ւճօպֺ֮\u0590ֺ֑֙վ\u0590ׁ֒վցָր׆ִ\u05cb֥֗րא֨֕", (byte)113, 69);
               ZKM_STR_B[15] = NLoginCore_324.C("ԻվՔքչփՃշցբՂ։ՌՆխ\u058bՠլ֓սրՐՠլխֈ֕ճծոժը", (byte)113, 67);
               ZKM_STR_B[16] = NLoginCore_433.F("՜ՙջջռե\u058bշնևְֳ֥֏ֲտְֳ֙կֵ֖֛֯\u058b֠ր֕րֹ֏ֲֿևֆֳַׅ֢ք\u05c9֟\u058b֕", (byte)113, 70);
               ZKM_STR_B[17] = NLoginCore_110.E("՟ճջ֗նմ֗֙֎ո֤վկ֜տ֢֒ևֶַֺ֥֮֨֨֫վ֍ׂ֛\u058c֣", (byte)113, 69);
               ZKM_STR_B[18] = NLoginCore_232.A("ǙǖǘǙƶǚƝƙƘƢƬǐǝǁǔǨǪǃƢǈǙǘǑǥƩǪǢǉưƭǫǇ", (byte)113, 65);
               ZKM_STR_B[19] = NLoginCore_387.A("ǋǑƶƷǙƺǁƗǍƟǂƹǐǙƿǇǗǊǪƷǬǭƴƵ", (byte)113, 65);
               ZKM_STR_B[20] = NLoginCore_127.B("ǖǊǊƨƼǙƷƱƷƶǒƴƯƝǚƢǦƧǢǖǪǯǬǉǈǈǈǓǭǉǈƯ", (byte)113, 66);
               ZKM_STR_B[21] = NLoginCore_530.E("֚֔մփնն֧֪֪֚֙֝և֛֧֭ցֱ֫֊ְփրց", (byte)113, 69);
               ZKM_STR_B[22] = NLoginCore_397.B("ƒǛǋǒƿƑƲǂƳǤƿƶƾǒƱƟƠƹǙǥǧǪǰǥƻƾƼǉǰǭƳǮ", (byte)113, 66);
               ZKM_STR_B[23] = NLoginCore_324.F("ռ֥֝֡ժ֧֚։֥թհչցճ\u058c֭֒֨֘֙֏փրց", (byte)113, 70);
               ZKM_STR_B[24] = NLoginCore_027.B("ǙǖǘǙƶǚƝƙƘƢƮǖƤƣǥƿƤƻǔƶǗǜǠƾƬǭǆǅǖǕǓǚ", (byte)113, 66);
               ZKM_STR_B[25] = NLoginCore_241.C("ՁԹ՜՝ՓմՆգէՔվէՇլ\u0590ծըխծէգՌմգՑՓպյ֝ծ֝ՠ", (byte)113, 67);
               ZKM_STR_B[26] = NLoginCore_453.E("շրվ֛֪֢֙֘֫֏֤֥֫֠ֆ֧\u058bծ֬֏ְָ֣֭շ֚պֹּ֔ւրָ֢֙֡֗׆ֽ֪֕֘׆֕", (byte)113, 69);
               ZKM_STR_B[27] = NLoginCore_091.D("՛ՐծկՎՑՙոՉՕ\u058bցնՅՉչծբռՊ\u058bՕիՖ\u058b֕Ֆ֛֚֙կջ", (byte)113, 68);
               ZKM_STR_B[28] = NLoginCore_384.E("տ֛֒չ֤֟չ֛֠֡ր֯֨ծ֤֯ֈ֣րֵֵ֓րց", (byte)113, 69);
               ZKM_STR_B[29] = NLoginCore_183.D("Ցշ՞ր՜ՂնփփաՖլըշ՛ևՑֆկի֎ց֔թխ֘Օ֓ձ֔֍ն", (byte)113, 68);
               ZKM_STR_B[30] = NLoginCore_553.C("ճձԼօ՛աբհմն՞ՌլպՇ\u0558օՉմ֏ՏՖցՓ\u058cկ֘֙շտ֘։", (byte)113, 67);
               ZKM_STR_B[31] = NLoginCore_223.E("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔\u0590ֳ֛֧֯ջִ־սֶׁ֖փ", (byte)113, 69);
               ZKM_STR_B[32] = NLoginCore_559.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƩǏǜǚǲƪǶǑǴǠǒ", (byte)113, 66);
               ZKM_STR_B[33] = NLoginCore_183.E("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔\u0590ֳ֤չֲֶֽ֦\u058bָׂ֑ւ", (byte)113, 69);
               ZKM_STR_B[34] = NLoginCore_433.D("ճձԼօ՛աբհմն՞ՌլպՇ\u0558օՉմ֏Տ֗ընխև֚\u058c\u058b֞ո֒", (byte)113, 68);
               ZKM_STR_B[35] = NLoginCore_092.C("պվՂՍնպԹՂ\u0558պ\u0558քօչբչ\u0590ռս՟օկ֘յ֓֗չ֝֝ճ՚֚", (byte)113, 67);
               ZKM_STR_B[36] = NLoginCore_384.B("ƚǊƸǓǈƑǒǝǌǡǔƵƠƺǈǂǫǛǆǇƺƧǝǥǮǔǉǢǬǘƱǊ", (byte)113, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.F("դ֧֕֙֙ի֮֞֩ծէվ֎֭ծִ֦֑֭֔ֈ֓րց", (byte)113, 70);
               ZKM_STR_B[1] = NLoginCore_530.A("ƢƸǄǕǞǖƲǌǖƝƹƺƲǔǀǤƴǇǟǫǩǭƴƵ", (byte)113, 65);
               ZKM_STR_B[2] = NLoginCore_110.E("՞֧֗֞\u058b՝վ֎տְ֊ְ֩ս։ֹ֪֮֔֙֯յ֒֏նֿ֝\u058cտׁ֤֫", (byte)113, 69);
               ZKM_STR_B[3] = NLoginCore_427.F("օֈ֦ռւվիշ֚ք֏\u058cև֔վօ֦֩ձִֹ֯րց", (byte)113, 70);
               ZKM_STR_B[4] = NLoginCore_127.B("ƒǛǋǒƿƑƲǂƳǤƾǏǔǠƦƛƿƤǆǥǧǡƦǂǥǭƭưǢǳǴǋƴƺǄǾǆǮǼǘǁǠǲǉ", (byte)113, 66);
               ZKM_STR_B[5] = NLoginCore_110.E("փ֢֤՟֢֢֒֔֨փ\u058b֜ժսցօ֪\u058bոְմִֵ֓֕֒֓֏ֳֵ֤֝", (byte)113, 69);
               ZKM_STR_B[6] = NLoginCore_110.B("ǕƴǙƳƲƝǑǀǂƫǔǝƻƢƱǁǖǔǋƣǬǟƾƻƺǈǐǉƵǉǏǰ", (byte)113, 66);
               ZKM_STR_B[7] = NLoginCore_521.B("ǋƦǚǗƲǖƫƻƳƶưƗƦǧƷƣƽƳǧǃǅǝƴƵ", (byte)113, 66);
               ZKM_STR_B[8] = NLoginCore_575.E("֡ր֥տվթ֝\u058c֎շ֠֙պ֮\u0590ִ֑֢֫֗քևքկ֩־֛\u058bֳֽׂ֖֟ս֥֤׆֢֬֞րֺ֧֕", (byte)113, 69);
               ZKM_STR_B[9] = NLoginCore_141.D("ՖԿւվջյցՙֆշլջսը\u0590ցֆ՜առձՠ֒չւո\u058bՕձ։֞ր", (byte)113, 68);
               ZKM_STR_B[10] = NLoginCore_553.B("ǙƥƪƵǉǝƝưƔƬƬǖǃǞǅƻǄƳƾǉƭǫƨƩǳưǋǐǂǮǦǎƴƺǄǪǵƽƷȁƽȂǐǉ", (byte)113, 66);
               ZKM_STR_B[11] = NLoginCore_553.D("ց՜Ծ\u0557ոծֆՀՀՂ՟ոֆո՞ո֏պ։բ՞թճաբՑՑթ֚ն\u0557ը", (byte)113, 68);
               ZKM_STR_B[12] = NLoginCore_232.B("ƑƑƗƕưǒǓǢƠǔǢƿǗǧƱǁƳǠǆǡǫǭƺưǄǥǮƧǰƴǉǺ", (byte)113, 66);
               ZKM_STR_B[13] = NLoginCore_110.F("ՠ֣չ֩֞֨ը֦֜ևժ֤֯ջֱծ֏ָց֒֒֎ֈ־֨֏֠֍ֶվֿ֟", (byte)113, 70);
               ZKM_STR_B[14] = NLoginCore_141.E("՝՝գառ֮֞֟լֱ֠֟\u058cֲց\u058b֮ւճօպֺ֮\u0590ֺ֑֙վ\u0590ׁ֒վ\u0590ֲׇ֢֦֞\u05ccֺ\u058b\u05cf֏֕", (byte)113, 69);
               ZKM_STR_B[15] = NLoginCore_127.A("ƔǗƭǝǒǜƜǐǚƻƛǢƥƟǆǤƹǅǬǖǙơǤǉƽǰǍǕƯƮƵǌ", (byte)113, 65);
               ZKM_STR_B[16] = NLoginCore_433.C("ԷԴՖՖ\u0557ՀզՒՑբ\u058bր֎ժ֍՚֎\u058bմՊձն\u0590֊զջ՛հ՛֔ժ֍սոխՠա֏֘\u0590֢ըժհ", (byte)113, 67);
               ZKM_STR_B[17] = NLoginCore_232.B("ƓƧƯǋƪƨǋǍǂƬǘƲƣǐƳǖǆƻǙǪǜƫǊǌƩǱǉǊǰǠǇǬ", (byte)113, 66);
               ZKM_STR_B[18] = NLoginCore_091.D("րստր՝ցՄՀԿՉՓշքըջ֏֑ժՉկրձ\u058cՎքծ՚։Փծ֚տ", (byte)113, 68);
               ZKM_STR_B[19] = NLoginCore_110.D("ղո՝՞րաըԾմՆժՃ֎ՙկ\u058cգժՊ\u058bւՌ֓կըկփՔ\u0557֘Ֆ֒", (byte)113, 68);
               ZKM_STR_B[20] = NLoginCore_575.F("֢֖֖մֈ֥փսփւ֞րջթ֦ծֲճֶ֢֮ո֫ջֱַ֮֕֯ց֯֒", (byte)113, 70);
               ZKM_STR_B[21] = NLoginCore_451.E("֚֔մփնն֧֪֚֭֙օևձճօֳ֧֡֏օִ֥֧֚վְִּ֪֣֝", (byte)113, 69);
               ZKM_STR_B[22] = NLoginCore_553.B("ƒǛǋǒƿƑƲǂƳǤƿƶƾǒƱƟƠƹǙǥǧǣǃƧǩǇƾǪǅǏƷǖ", (byte)113, 66);
               ZKM_STR_B[23] = NLoginCore_076.A("ưǑǕǙƞǎǛƽǙƝƤƻǥǛǣǗƲơǩƨǪƦƽƪǋǲǧǑǳǁǰǕ", (byte)113, 65);
               ZKM_STR_B[24] = NLoginCore_575.C("րստր՝ցՄՀԿՉՕսՋՊ\u058cզՋբջ՝վկժւ֘֊ղլշ\u058c՝տթձ֘ծ\u0590֠ւճ֚ՠզհ", (byte)113, 67);
               ZKM_STR_B[25] = NLoginCore_201.C("ՁԹ՜՝ՓմՆգէՔվէՇլ\u0590ծըխծէգՕւ֕֕։եթլթնծ", (byte)113, 67);
               ZKM_STR_B[26] = NLoginCore_173.E("շրվ֛֪֢֙֘֫֏֤֥֫֠ֆ֧\u058bծ֬֏ְָ֣֭շ֚պֹּ֔ւրָևօִֶ֫վ֫֎֣֬֕", (byte)113, 69);
               ZKM_STR_B[27] = NLoginCore_451.D("՛ՐծկՎՑՙոՉՕ\u058bցնՅՉչծբռՊ\u058b֖ՉՊքՓո֏՛յ֓ց", (byte)113, 68);
               ZKM_STR_B[28] = NLoginCore_433.D("՚խնՔպտՔջռն՝ժֆլՎբ\u0590Պացէ՟֓\u058bյօ֚ը֏խ֠ծ", (byte)113, 68);
               ZKM_STR_B[29] = NLoginCore_110.B("ƪǐƷǙƵƛǏǜǜƺƯǅǁǐƴǠƪǟǈǄǧǏǋǜǚǢǐǉƨǸǕǗƵƸǳǉǋǼǮǟǷǹƻǉ", (byte)113, 66);
               ZKM_STR_B[30] = NLoginCore_575.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƬǁǧǀǪǲƽǗǇǃǐǵǮǌǚǒǝǚǜȁǝǐǉ", (byte)113, 66);
               ZKM_STR_B[31] = NLoginCore_241.A("ƪǐƷǙƵƛǏǜǜƺƯǅǁǐƴǠƪǟǈǄǧǇǄƩǉƮǄǕǩǶǄƱǨǊƸǾǔǘǬǾǞǾǶǉ", (byte)113, 65);
               ZKM_STR_B[32] = NLoginCore_451.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƦǨǪƫǬǯǏǷǄƳǱƺƱǇǎǑǐǖǭǭǏǮǉ", (byte)113, 66);
               ZKM_STR_B[33] = NLoginCore_092.F("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔\u0590ֳֵ֗֏յ֛֮֕պ֔־ֿ֚֝տտֶָּ֛֦ֆ׆֕", (byte)113, 70);
               ZKM_STR_B[34] = NLoginCore_141.C("ճձԼօ՛աբհմն՞ՌլպՇ\u0558օՉմ֏ՏՎ֏֓յպշ՚Օ\u058bմ֑֕֏՚ճծ֏֢պմֆ\u058bհ", (byte)113, 67);
               ZKM_STR_B[35] = NLoginCore_138.B("ǓǗƛƦǏǓƒƛƱǓƱǝǞǒƻǒǩǕǖƸǞǈƭǈǥƿǏǣǍǐǪǇǅǶǅǴƺǘǍǬǽǭǺǉ", (byte)113, 66);
               ZKM_STR_B[36] = NLoginCore_223.A("ƚǊƸǓǈƑǒǝǌǡǔƵƠƺǈǂǫǛǆǇƺƩƯǉƩƾǰǧǄǐǯǇ", (byte)113, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.D("\u0558Տսռ՟՛Ձպա՜ՆՕՄՈծ\u058bըռձ֏\u0590ծ՛՜", (byte)113, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.D("ձռ՛չձ՟ԿԿԻշքևթՊ՜ևջբ֏յէ֔՛՜", (byte)113, 68);
         }
      }
   }

   private NLoginCore_508(String var3, boolean var4) {
      String[] var10001 = new String[b];
      var10001[c] = a(d, e ^ f) + var3;
      this.g = NLoginCore_474.a(var10001);
      this.aK = var4;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(ad, ae);
      int var10003 = af;
      String[] var10004 = new String[ag];
      var10004[ah] = a(ai & aj, ak);
      a = new NLoginCore_508(var10004);
      var10002 = a(al, am);
      var10003 = an;
      var10004 = new String[ao];
      var10004[ap] = a(aq & ar, as);
      b = new NLoginCore_508(var10004);
      var10002 = a(at, au ^ av);
      var10003 = aw;
      var10004 = new String[ax];
      var10004[ay] = a(az, ba);
      c = new NLoginCore_508(var10004);
      var10002 = a(bb & bc, bd);
      var10003 = be;
      var10004 = new String[bf];
      var10004[bg] = a(bh & bi, bj);
      d = new NLoginCore_508(var10004);
      var10002 = a(bk, bl);
      var10003 = bm;
      var10004 = new String[bn];
      var10004[bo] = a(bp & bq, br);
      e = new NLoginCore_508(var10004);
      var10002 = a(bs & bt, bu);
      var10003 = bv;
      var10004 = new String[bw];
      var10004[bx] = a(by, bz ^ ca);
      f = new NLoginCore_508(var10004);
      var10002 = a(cb & cc, cd);
      var10003 = ce;
      var10004 = new String[cf];
      var10004[cg] = a(ch, ci ^ cj);
      g = new NLoginCore_508(var10004);
      var10002 = a(ck, cl ^ cm);
      var10003 = cn;
      var10004 = new String[co];
      var10004[cp] = a(cq, cr ^ cs);
      h = new NLoginCore_508(var10004);
      var10002 = a(ct, cu);
      var10003 = cv;
      var10004 = new String[cw];
      var10004[cx] = a(cy, cz ^ da);
      i = new NLoginCore_508(var10004);
      var10002 = a(db & dc, dd);
      var10003 = de;
      var10004 = new String[df];
      var10004[dg] = a(dh, di ^ dj);
      j = new NLoginCore_508(var10004);
      var10002 = a(dk, dl ^ dm);
      var10003 = dn;
      var10004 = new String[var_do];
      var10004[dp] = a(dq, dr);
      k = new NLoginCore_508(var10004);
      var10002 = a(ds & dt, du);
      var10003 = dv;
      var10004 = new String[dw];
      var10004[dx] = a(dy & dz, ea);
      l = new NLoginCore_508(var10004);
      var10002 = a(eb & ec, ed);
      var10003 = ee;
      var10004 = new String[ef];
      var10004[eg] = a(eh, ei);
      var10004[ej] = a(ek & el, em);
      m = new NLoginCore_508(var10004);
   }

   @Override
   public Object a() {
      return a;
   }

   @Override
   public NLoginCore_474 a() {
      return this.g;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_508.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("ափօե։ֶ֢֨֠ձֳ֥֭֯նִִֺּֽ֛։", (byte)125, 69), NLoginCore_508.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.B("ǜǩǨƫǫǧǢǫǶǥƲǰǴǭǰǶƸԻԱԽՌԡՆՍՕՕՋԽՆՑԲǒ", (byte)125, 66) + var1 + NLoginCore_201.B("Ƴ", (byte)125, 66) + var2.toString(), var4
         );
      }
   }

   private NLoginCore_508(String... var3) {
      this.g = NLoginCore_474.a(Arrays.stream(var3).map(var0 -> a(g, h ^ i) + var0).toArray(String[]::new));
      this.aK = (a != 0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 17L;
      var1 ^= 3185306714636435977L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(21 + 48),
                     (byte)(57 + 26),
                     (byte)(36 + 11),
                     (byte)(37 + 30),
                     (byte)(31 + 35),
                     (byte)(5 + 62),
                     (byte)(14 + 33),
                     (byte)(33 + 47),
                     75,
                     (byte)(48 + 19),
                     (byte)(47 + 36),
                     53,
                     (byte)(28 + 52),
                     (byte)(94 + 3),
                     (byte)(84 + 16),
                     (byte)(33 + 67),
                     (byte)(71 + 34),
                     (byte)(57 + 53),
                     (byte)(41 + 62)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.C("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢦ࢜ࢨࢷࢌࢱࢸࣀࣀࢶࢨࢱࢼ࢝", (byte)101, 67));
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
}
