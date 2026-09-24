package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_022 extends NLoginCore_353 {
   private static int ea = (100663296 >>> 185 | 100663296 << ~185 + 1) & -1;
   private static int gg = Integer.reverse(67108864);
   private static int dx = 98304 >>> 140 | 98304 << -140;
   private static int hk = Integer.reverse(-1811939328);
   private static int fd = Integer.reverse(-1610612736);
   private static long cw = Long.reverse(8791026472627208192L);
   private static int ah = 393216 >>> 16 | 393216 << ~16 + 1;
   private static long cy = Long.reverse(-6380456274379960067L);
   private static int aq = Integer.reverse(-1);
   private static long fb = Long.reverse(-2489346196331851523L);
   private static int bf = Integer.reverse(-805306368);
   private static int fg = 134217728 >>> 218 | 134217728 << -218;
   private static int hz = Integer.reverse(872415232);
   private static long bp = Long.reverse(8791026472627208192L);
   private static int l = (0 >>> 252 | 0 << ~252 + 1) & -1;
   private static int gy = Integer.reverse(1677721600);
   private static long dn = Long.reverse(-2489346196331851523L);
   private static long ce = Long.reverse(-2489346196331851523L);
   private static int dr = 2048 >>> 235 | 2048 << ~235 + 1;
   private static int s = 16777216 >>> 23 | 16777216 << -23;
   private static int cf = Integer.reverse(0);
   private static int ho = (0 >>> 108 | 0 << -108) & -1;
   private static long an = Long.reverse(-6380456274379960067L);
   private static long cz = Long.reverse(8791026472627208192L);
   private static int fp = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(0);
   private static int ct = Integer.reverse(Integer.MIN_VALUE);
   private static int q = 16384 >>> 78 | 16384 << ~78 + 1;
   private static int eb = Integer.reverse(0);
   private static int cp = 16384 >>> 110 | 16384 << ~110 + 1;
   private static long hd = Long.reverse(-2489346196331851523L);
   private static int by = Integer.reverse(134217728);
   private static int hy = Integer.reverse(0);
   private static long hh = Long.reverse(-2489346196331851523L);
   private static int hi = 0 >>> 57 | 0 << -57;
   private static int cl = Integer.reverse(-939524096);
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static int en = Integer.reverse(0);
   private static int az = 7168 >>> 10 | 7168 << ~10 + 1;
   private static long bk = Long.reverse(-6380456274379960067L);
   private static int at = 33554432 >>> 217 | 33554432 << -217;
   private static int gp = Integer.reverse(-1);
   private static long gh = Long.reverse(-2489346196331851523L);
   private static long bv = Long.reverse(-6380456274379960067L);
   private static int em = Integer.reverse(536870912);
   private static long t = Long.reverse(-6380456274379960067L);
   private static int fa = Integer.reverse(-1);
   private static int ab = Integer.reverse(-1);
   private static long dy = Long.reverse(-6380456274379960067L);
   private static long ha = Long.reverse(8791026472627208192L);
   private static long ei = Long.reverse(-2489346196331851523L);
   private static long gz = Long.reverse(-6380456274379960067L);
   private static int hg = Integer.reverse(-1);
   private static int hc = Integer.reverse(-469762048);
   private static long gw = Long.reverse(8791026472627208192L);
   private static int ap = Integer.reverse(268435456);
   private static long fz = Long.reverse(-2489346196331851523L);
   private static int he = (16384 >>> 109 | 16384 << ~109 + 1) & -1;
   private static int gb = (0 >>> 156 | 0 << ~156 + 1) & -1;
   private static int ds = 33554432 >>> 216 | 33554432 << -216;
   private static int gu = Integer.reverse(-1543503872);
   private static int ck = 3 >>> 192 | 3 << ~192 + 1;
   private static int k = (0 >>> 159 | 0 << -159) & -1;
   private static long ey = Long.reverse(8791026472627208192L);
   private static long gk = Long.reverse(-2489346196331851523L);
   private static int hx = (0 >>> 79 | 0 << -79) & -1;
   private static int aa = 67108864 >>> 152 | 67108864 << -152;
   private static long u = Long.reverse(8791026472627208192L);
   private static long be = Long.reverse(456833887201394688L);
   private static double ee = Double.longBitsToDouble(Long.reverse(39426L));
   private static int bn = Integer.reverse(-1342177280);
   private static long bl = Long.reverse(8791026472627208192L);
   private static int hq = Integer.reverse(1409286144);
   private static int fy = (-1 >>> 184 | -1 << -184) & -1;
   private static int dt = Integer.reverse(-1073741824);
   private static int co = (131072 >>> 144 | 131072 << -144) & -1;
   private static long gt = Long.reverse(-2489346196331851523L);
   private static int bd = (0 >>> 60 | 0 << -60) & -1;
   private static long ar = Long.reverse(-2489346196331851523L);
   private static double ge = Double.longBitsToDouble(Long.reverse(39426L));
   private static int cs = Integer.reverse(398458880);
   private static int fe = Integer.reverse(0);
   private static int ff = Integer.reverse(Integer.MIN_VALUE);
   private static int dc = 176 >>> 67 | 176 << -67;
   private static int gi = 1073741832 >>> 158 | 1073741832 << ~158 + 1;
   private static int dh = Integer.reverse(0);
   private static int ad = Integer.reverse(-1610612736);
   private static int gf = (65536 >>> 207 | 65536 << ~207 + 1) & -1;
   private static long ae = Long.reverse(-6380456274379960067L);
   private static long ac = Long.reverse(-2489346196331851523L);
   private static String[] a = new String[hz];
   private static int hw = 0 >>> 67 | 0 << -67;
   private static int dp = Integer.reverse(0);
   private static long ao = Long.reverse(8791026472627208192L);
   private static long bt = Long.reverse(-2489346196331851523L);
   private static long fw = Long.reverse(2738188573441261568L);
   private static int br = Integer.reverse(1879048192);
   private static int n = (0 >>> 229 | 0 << ~229 + 1) & -1;
   private static int j = 1073741824 >>> 30 | 1073741824 << -30;
   private static int fl = Integer.reverse(-1207959552);
   private static int du = Integer.reverse(Integer.MIN_VALUE);
   private static long gv = Long.reverse(-6380456274379960067L);
   private static int ed = Integer.reverse(1073741824);
   private static int ec = Integer.reverse(Integer.MIN_VALUE);
   private static int dm = 1543503872 >>> 90 | 1543503872 << ~90 + 1;
   private static int hp = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int ep = (16777216 >>> 216 | 16777216 << -216) & -1;
   private static long x = Long.reverse(-2489346196331851523L);
   private static long fk = Long.reverse(2738188573441261568L);
   private static long aj = Long.reverse(8791026472627208192L);
   private static long i = Long.reverse(-2489346196331851523L);
   private static int ef = 256 >>> 167 | 256 << ~167 + 1;
   private static int da = 0 >>> 40 | 0 << -40;
   private static int es = Integer.reverse(Integer.MIN_VALUE);
   private static int ax = 262144 >>> 82 | 262144 << -82;
   private static long ek = Long.reverse(-6380456274379960067L);
   private static int cc = 34 >>> 129 | 34 << -129;
   private long e;
   private static long aw = Long.reverse(8791026472627208192L);
   private static int cx = Integer.reverse(-1476395008);
   private static int df = Integer.reverse(-1073741824);
   private static int dl = 0 >>> 13 | 0 << ~13 + 1;
   private static int ew = Integer.reverse(-671088640);
   private static int cd = Integer.reverse(-1);
   private static long bb = Long.reverse(-6380456274379960067L);
   private static int dj = (1048576 >>> 243 | 1048576 << ~243 + 1) & -1;
   private static int fs = Integer.reverse(1073741824);
   private static long cv = Long.reverse(-6380456274379960067L);
   private static long cn = Long.reverse(-2489346196331851523L);
   private static long bo = Long.reverse(-6380456274379960067L);
   private static int hj = 0 >>> 159 | 0 << -159;
   private static long hs = Long.reverse(8791026472627208192L);
   private static int gj = Integer.reverse(-1);
   private static int gr = (144 >>> 34 | 144 << -34) & -1;
   private static int cb = 0 >>> 71 | 0 << ~71 + 1;
   private static int bq = Integer.reverse(0);
   private static int eg = Integer.reverse(-1744830464);
   private static int fj = (0 >>> 250 | 0 << ~250 + 1) & -1;
   private static int cq = 0 >>> 52 | 0 << ~52 + 1;
   private static int dv = (0 >>> 21 | 0 << ~21 + 1) & -1;
   private static int cr = 1350 >>> 154 | 1350 << ~154 + 1;
   private static int gc = Integer.reverse(Integer.MIN_VALUE);
   private static int fq = Integer.reverse(1073741824);
   private static int hf = Integer.reverse(335544320);
   private static long hr = Long.reverse(-6380456274379960067L);
   private static int db = 0 >>> 136 | 0 << ~136 + 1;
   private static long bh = Long.reverse(8791026472627208192L);
   private static int fv = Integer.reverse(0);
   private static int dq = Integer.reverse(0);
   private static int ch = Integer.reverse(-1);
   private static int ay = 0 >>> 71 | 0 << -71;
   private static int go = Integer.reverse(-1006632960);
   private static int fc = 0 >>> 50 | 0 << -50;
   private static int gs = -1 >>> 172 | -1 << -172;
   private static int bs = Integer.reverse(-1);
   private final AtomicBoolean a;
   private static int eh = Integer.reverse(-1);
   private static int gx = (0 >>> 230 | 0 << -230) & -1;
   private static int am = -1073741823 >>> 190 | -1073741823 << ~190 + 1;
   private static long de = Long.reverse(-2489346196331851523L);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int bj = Integer.reverse(805306368);
   private static int bm = Integer.reverse(0);
   private static int eu = (0 >>> 216 | 0 << -216) & -1;
   private static String[] b = new String[NLoginType_022.ia];
   private static int c = (0 >>> 82 | 0 << -82) & -1;
   private static int ak = Integer.reverse(0);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int er = 192 >>> 6 | 192 << -6;
   private static int fi = Integer.reverse(536870912);
   private static long hv = Long.reverse(8791026472627208192L);
   private static long bz = Long.reverse(-6380456274379960067L);
   private static long hl = Long.reverse(-6380456274379960067L);
   private static int ht = Integer.reverse(-738197504);
   private static int al = (0 >>> 46 | 0 << -46) & -1;
   private static long ex = Long.reverse(-6380456274379960067L);
   private static int m = Integer.reverse(0);
   private static long gn = Long.reverse(8791026472627208192L);
   private static double fr = Double.longBitsToDouble(Long.reverse(39426L));
   private static int hb = (0 >>> 250 | 0 << ~250 + 1) & -1;
   private static int ga = Integer.reverse(-1073741824);
   private static int et = 0 >>> 29 | 0 << ~29 + 1;
   private static int bu = Integer.reverse(-268435456);
   private static long el = Long.reverse(8791026472627208192L);
   private static int ej = Integer.reverse(1476395008);
   private static int gl = Integer.reverse(1140850688);
   private static long ai = Long.reverse(-6380456274379960067L);
   private static int eo = Integer.reverse(0);
   private static int ba = Integer.reverse(1342177280);
   private static int cj = Integer.reverse(0);
   private static int h = Integer.reverse(-1);
   private static long bw = Long.reverse(8791026472627208192L);
   private static int ag = Integer.reverse(0);
   private static int dk = 8192 >>> 141 | 8192 << -141;
   private static int v = 196608 >>> 240 | 196608 << -240;
   private static int bi = Integer.reverse(0);
   private static long hm = Long.reverse(8791026472627208192L);
   private static int p = (3 >>> 96 | 3 << ~96 + 1) & -1;
   private static int di = (16384 >>> 110 | 16384 << ~110 + 1) & -1;
   private static int cg = Integer.reverse(1207959552);
   private static int cu = 5120 >>> 8 | 5120 << ~8 + 1;
   private static int fn = Integer.reverse(-1073741824);
   private static long af = Long.reverse(8791026472627208192L);
   private static int fh = (384 >>> 231 | 384 << -231) & -1;
   private static int hn = 524288 >>> 242 | 524288 << -242;
   private static int au = (-2147483644 >>> 159 | -2147483644 << ~159 + 1) & -1;
   private static int d = -1 >>> 210 | -1 << ~210 + 1;
   private static int dg = (0 >>> 31 | 0 << ~31 + 1) & -1;
   private static long hu = Long.reverse(-6380456274379960067L);
   private static long bc = Long.reverse(8791026472627208192L);
   private static int fx = (992 >>> 37 | 992 << ~37 + 1) & -1;
   private static long av = Long.reverse(-6380456274379960067L);
   private static long dz = Long.reverse(8791026472627208192L);
   private static int dw = Integer.reverse(Integer.MIN_VALUE);
   private static long ca = Long.reverse(8791026472627208192L);
   private static long gq = Long.reverse(-2489346196331851523L);
   private static int eq = Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << -222;
   private static int ft = Integer.reverse(2013265920);
   private static int o = 8192 >>> 140 | 8192 << -140;
   private static int as = (0 >>> 234 | 0 << -234) & -1;
   private static int ia = Integer.reverse(872415232);
   private static int ev = 0 >>> 113 | 0 << -113;
   private static int fo = (0 >>> 141 | 0 << ~141 + 1) & -1;
   private static int dd = Integer.reverse(-1);
   private static long ci = Long.reverse(-2489346196331851523L);
   private static long gm = Long.reverse(-6380456274379960067L);
   private static long f = Long.reverse(-2489346196331851523L);
   private static long bg = Long.reverse(-6380456274379960067L);
   private static long fm = Long.reverse(-2489346196331851523L);
   private static long fu = Long.reverse(-2489346196331851523L);
   private static int ez = (14336 >>> 201 | 14336 << -201) & -1;
   private static int gd = 64 >>> 101 | 64 << -101;
   private static int y = Integer.reverse(1073741824);
   private static int w = (-1 >>> 223 | -1 << ~223 + 1) & -1;
   private static int var_do = (4096 >>> 138 | 4096 << -138) & -1;
   private static int cm = (-1 >>> 185 | -1 << ~185 + 1) & -1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 94L;
      var1 ^= -7581481943238116227L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     (byte)(26 + 43),
                     83,
                     (byte)(33 + 14),
                     (byte)(52 + 15),
                     (byte)(32 + 34),
                     (byte)(61 + 6),
                     (byte)(42 + 5),
                     (byte)(24 + 56),
                     (byte)(44 + 31),
                     (byte)(3 + 64),
                     (byte)(49 + 34),
                     (byte)(32 + 21),
                     (byte)(30 + 50),
                     (byte)(58 + 39),
                     (byte)(95 + 5),
                     (byte)(16 + 84),
                     (byte)(72 + 33),
                     110,
                     (byte)(18 + 85)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.D("пьыЎюъхюљшЕѓїѐѓљЛިޥީ\u07b7\u07b7ު\u07b3ޱޘްޟ\u07beުޣ\u07bc", (byte)13, 68));
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

   private static void b() {
      c = -4680975955755782427L;
      long var0 = c ^ -7581481943238116227L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(44 + 24),
               (byte)(56 + 13),
               (byte)(43 + 40),
               (byte)(9 + 38),
               (byte)(64 + 3),
               (byte)(55 + 11),
               (byte)(53 + 14),
               47,
               (byte)(44 + 36),
               (byte)(45 + 30),
               (byte)(14 + 53),
               (byte)(16 + 67),
               (byte)(46 + 7),
               (byte)(12 + 68),
               (byte)(18 + 79),
               (byte)(21 + 79),
               (byte)(17 + 83),
               (byte)(104 + 1),
               (byte)(49 + 61),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), (byte)(78 + 5)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_138.D("֔՚֍՜֒՜՟քա֠դծ", (byte)123, 68);
               b[1] = NLoginCore_241.A("ƮǁƪưǮǎǔƯƶƭƯǔǍǖƵǼǫǛǾƼǻȁǈǉ", (byte)123, 65);
               b[2] = NLoginCore_397.F("հ\u058b֟֏֮֞յ֫ծָֹ֨չ֍֘պնֲֺ֚֕֝֊\u058b", (byte)123, 70);
               b[3] = NLoginCore_110.B("ǌǣǍǏƱƫǐǏǨǄǪƽ", (byte)123, 66);
               b[4] = NLoginCore_384.D("֕֙Փջք֔տծֈա֗ծ", (byte)123, 68);
               b[5] = NLoginCore_471.D("ֈ\u0590֏ջխ՜պ֝՝պռպս֝տո֟բ֊֑ճ֤\u058b֣֕փֆֺ֖֒ֆֻ׀չչֹּ֖֠֫׀և֕֎", (byte)123, 68);
               b[6] = NLoginCore_427.F("֨լխֈ\u0590ր֪֗ժֱղּ։֒պ֑֟վֻֻׂ֛֥֪֙֜֒ׄ։և֭֍\u05cfְ֛֊ֶׇ֪֞֟֨א֟", (byte)123, 70);
               b[7] = NLoginCore_183.A("ǪƽǅǢǒƱǂǅǩǌǖǍǹƹǛǈƷǭǒǰǺǴȂƷǗƿǇǘȋǉǆǛǛǆȃȀǯǜǌǌȔȌȒȇǔǯǥȔǴǼǱȓȠǬȣȡȏȦǞȣǻȅǞǭȥȭȫȌȑǫȏȃȦȓȐǽ", (byte)123, 65);
               b[8] = NLoginCore_127.E("֢֯ի֓հֲև\u058bյ\u058cւղ֗կִֺ֗֠֟֡ջָ֤֙ֈօ֛֤֣֖ׅ֘", (byte)123, 69);
               b[9] = NLoginCore_427.E("֬ռ\u058b֒ւ֝ք֔\u0590մ֏ֱօ֖֘֨֔տֱ֭ւսֱ\u0590րֺ֖֦֧֓ׄ׃ֿ֛\u05c8֊֔׃ֵָׂ֪֖֠\u05ceדהוגֵּ֜ׄ֜֜׀ׇ֨ט֡נׂ\u05c9\u05cb", (byte)123, 69);
               b[10] = NLoginCore_091.F("ս֯ժօ֓ձ֩ճֈղ֎պ֝շ֒սֵ֨ւִׅ֡ׄ׃\u05c8֞֒֡־ׇֻ֯֎֣ד\u05ceִ\u05c9ֶׂ֪הֵ֪֦֗אִ֞ך֪ך׃֤׀ַסׂז֧ׄתָׯ֦\u05cbװׇּ״ִ\u05cdהְפֿ", (byte)123, 70);
               b[11] = NLoginCore_324.B("ƤǙƢƭǮƮƪǀǪǃǉǕƲǫǩǧǓǖǻƼǔǑǞǿǦǯȆǜȉǵǼǩȀȋǭǝȅǣǮȔȆǰȎȅȚțȒȒȓǻȁȏȡȟǤȥǯǰǴȃȩǫȕȇȥȯȑǨȒȏǴȉȫȊȦșȳǭȜȶȾȑȋȿȏȏțɆȔȕȷȗɇȳȠș", (byte)123, 66);
               b[12] = NLoginCore_183.F(
                  "֞ռղִ֭֔ձ֨֕\u058c֥֓ղ֏ֿ֗֝ջւ֘֎շ֯֓ևֆׂ֨\u05ccք\u05cdׇׂ֪֤֬֞֫֕։ׅ\u05ca֧֒\u05ca֩\u05ca֗טׁ֟֡\u05ce׆ג֢׀חהץהפ\u05ccװ֫כ\u05ce׳\u05ccוצס֪\u05ecײד\u05eb\u05ca\u05f8חןד\u05f7\u05f7\u0602\u0605\u05fb\u05fa؈׆\u0600\u05cbפץננׇ\u0600؈\u05fb؎\u05ccו\u0601\u0601\u05cf\u05f6גךש؊\u05ed\u05ee\u05feؖױآ\u05fdת\u05eb",
                  (byte)123,
                  70
               );
               b[13] = NLoginCore_241.B(
                  "ǣƨƿƼưǓƴƧƨǗƸǎƹǔǱǦƷǉƹǘǙǐȀǍǓǻȆǞǴȇȉǵǮǍǇǟȀȐȈǣǫǩǐȆǒǓȚǲǩȐȜǽǘǙȡȑȓǦțǷǤǽǴǬȯȟȦǫǲȏȢȲǵȒȑȶȌȕȐȷȨȐȝȘǸȹȔȾɁȁɂɈțȩȭȸșȤȠȌȈȢȞɈȌɊɎɚȨɗȕȚȻȕȩȞȻɠɒȤɠȟɉəȳȴɧɮɣȬȦɰȮɉɪɭɣɥȯȽ",
                  (byte)123,
                  66
               );
               b[14] = NLoginCore_110.B("ǣǈƹǥƲǡǫǆǈǢǬƲǊǰǅƸǲǌǭǵȀǋǈǉ", (byte)123, 66);
               b[15] = NLoginCore_446.A("ǎƥǯǄǯǉǣǒƬǟǪƽ", (byte)123, 65);
               b[16] = NLoginCore_173.B("ǇƫǐǜƺǓǱǞǶǫǷƹǻǙǝǨǉǚǟƽǠǱǈǉ", (byte)123, 66);
               b[17] = NLoginCore_183.A("ǅƨǎƩǳǏǣǬǉǔǪƽ", (byte)123, 65);
               b[18] = NLoginCore_553.A("ǮƾǧƣǎǥǞǳƵǠǬǔǓǤǖǾǭǒǟǴƾƿǰȀǳǲǑǂǦǹȂǻȏǁǉǣȇȋǣǮȏǫȉǺȓȕǒǥȈǱȞǮȜșǴȆǟțǞǡǩȀȩȪȢǺǰǬȄȥȳǫȗȟǳȂȰǳȏǸȼȬǸɀȍȵȑɂȀȀȄȣȽȧȿȌ", (byte)123, 65);
               b[19] = NLoginCore_397.B("ǘǄƩǬǈǦƲǲƵǎǂǙǨǎǸǮǽǔǮǋǿǱǈǉ", (byte)123, 66);
               b[20] = NLoginCore_183.B("ǪƽǅǢǒƱǂǅǩǌǖǍǹƹǛǈƷǭǒǰǺǴȂƷǗƿǇǘȋǉǆǛǛǆȃȀǯǜǌǌȔȌȒȇǔǯǥȔǴǼǱȓȠǬȣȡȏȦǞȣǻȅǞǭȥȭȫȌȑǫȏȃȦȓȐǽ", (byte)123, 66);
               b[21] = NLoginCore_427.C("֑֞՚ւ՟֡նպդջձաֆ՞ֆ֏֣֩֎\u0590ժֈ֧֓շմ֊և֓֒օִ", (byte)123, 67);
               b[22] = NLoginCore_530.E("֛ք֣֍զհհְշղִ֤֛չ֧ռֳֻֿ֭֍ֽ֕׀֨ւׁ֣֔׆\u05ca֭֯\u05cc\u0590֊\u058cַֽ֧֞ךֵלׇׄמ֗֯\u05ccְלֲֶֻעֵ\u05c8וסׇ֣֩֫", (byte)123, 69);
               b[23] = NLoginCore_141.A("ƶǋƽǑƨƲǀǮǃǢǴƶǸǭǬǭǵǻǨȁǹǕǓǒǜǂǞǘǘƽǊǣǺǺǧǪȃȄǪȁǎȌȂǱǸǳǧǯǜǛǮǡȝȜǜȀǹǶȠǻǣȋȪȧȃǨǬȀȬȤȄȢȰȲȡǫǸȗǼȳȪȓȰȪȰȰȀȢȐȿȝȆȲȽɄȷȯȤȨȍɆɍȭȟɐȧɂȝ", (byte)123, 65);
               b[24] = NLoginCore_141.B("ǘǙǟǬǨǬǕǱǅǒǃǙǥǣǑǩǍƼǪǢǢǙǺǁȄǧȉȃǦȁǣǶǬǫǏǲȉǾǊȀǷȃǘǫǯǯǲǯǐǜȞǫǮȚțȠȝȢǸǿȇțȃȁȋȘȢȥȨȇȴǲǵȶȲǽ", (byte)123, 66);
               b[25] = NLoginCore_433.D("թ֔տւկ֣օ֖ց֠ՠծ", (byte)123, 68);
               b[26] = NLoginCore_387.C(
                  "֏ն֟ՠՠ֤֕ջտ֟֔փափ֪֟֗֯փվ\u058cքկ֭֠ժֳ֡֏ֳֵ֨\u058cչոս֝֗־֣֙֒րֈָֺ֛֚֡\u05cb\u05ce\u05ca֏ֲ֮֓֫\u05cc֢\u05c8֑֚־ל֪֝֙ד\u05cdח֞מו֤־צל׀֦ׅ֬צ֣\u05cb\u05eeעֳ֮תו\u05caזת\u05f7ה\u05f6",
                  (byte)123,
                  67
               );
               b[27] = NLoginCore_141.F("֤գֈճ֤ւֵֵֹֺ֧֓֨֔ֈּ֭֭ւֱִ֝֊\u058b", (byte)123, 70);
               b[28] = NLoginCore_553.D("ը՚֎ր՛խչև֓՚ոճ֛զ֣։չֱ֑֩֡\u058bմ\u058c֣֡փֱֵֺ֭֩֗֙֡\u058cֵׅ֫ׄ־ּ֟֨փք־ֹ֯ֈ\u05ceְׁ֣֩׀ָ֓י֨ךְָֻ", (byte)123, 68);
               b[29] = NLoginCore_559.A("ǘǙǟǬǨǬǕǱǅǒǃǙǥǣǑǩǍƼǪǢǢǙǺǁȄǧȉȃǦȁǣǶǬǫǏǲȉǾǊȀǷȃǘǫǯǯǲǯǐǜȞǫǮȚțȠȝȢǸǿȇțȃȁȋȘȢȥȨȇȴǲǵȶȲǽ", (byte)123, 65);
               b[30] = NLoginCore_397.D("թ֔տւկ֣օ֖ց֠ՠծ", (byte)123, 68);
               b[31] = NLoginCore_575.E(
                  "ֳ֛֪֚֮֮֡֗և֔օ֛֧֥֓֫֏վּ֤֤֛֬փ׆֩\u05cbׅ֨׃ִָ֥֑֭֮\u05cb׀\u058cֱֱֱִֹׂׅ֚֭֒֞נְ֭לםעןפֺׁ\u05c9םׅ׃\u05cdךפקת\u05c9\u05f6ִַ\u05f8״ֿ", (byte)123, 69
               );
               b[32] = NLoginCore_433.E("պ֥\u0590֓րֱִ֖֧֒ձտ", (byte)123, 69);
               b[33] = NLoginCore_530.E("ցօ֏ե֨֍ֳֵ֖֦ւտ", (byte)123, 69);
               b[34] = NLoginCore_553.C("խ՞՚֢֙լ֑֟յ՞գմ֪֘փ֎ս\u0590ր֮֏ռչպ", (byte)123, 67);
               b[35] = NLoginCore_387.D("Ֆ֏՚֘֝վ֍դճ֩ցծ", (byte)123, 68);
               b[36] = NLoginCore_141.F("ևժ\u0590իֵ֑֥֮\u058b֖֬տ", (byte)123, 70);
               b[37] = NLoginCore_397.B("ǇƾǜǭǰǨǀǌǍǌǕǩǥǜǗǬǫǉƲǘǚǳǗǙǑǰȂǦǲȁȊȅǢǋǇǪǬǌǢǬȃǍǠǝ", (byte)123, 66);
               b[38] = NLoginCore_092.C("նՙտ՚֤ր֔֝պօ֛ծ", (byte)123, 67);
               b[39] = NLoginCore_324.B("ǢƽǡǑƤǔǩǊǑƩƪǇǑǦǉǒǒǔǚǙǰǷƿǃǼǢǴǜǃǢǔǤǩǦǧǊȅǏȀǡǥȄǗǝ", (byte)123, 66);
               b[40] = NLoginCore_384.A("ǥƫǱǱǑƼƱǪƭǌǐƽ", (byte)123, 65);
               b[41] = NLoginCore_453.C("ոֈսւցճց֝բ֛ղաց֝֙ը֪֍էְժ֢֦֬օմֆָ֤֯֫շպֹֹֻ֭֙֎ָׂ֛֤ׅ֞\u05cb\u058cׇ\u058c֠\u05cbדֳ֦֝\u05cc֭\u0590ֵ\u05c8ח֓ח֩", (byte)123, 67);
               b[42] = NLoginCore_138.A("ǇƼǙƾǏƥǲƬǔƿǬǢǥǭǼǻǋƸƿǝǫǑƶǁǆǠǞȆǽǈǻǺ", (byte)123, 65);
               b[43] = NLoginCore_384.E("ևժ\u0590իֵ֑֥֮\u058b֖֬տ", (byte)123, 69);
               break;
            case 1:
               b[0] = NLoginCore_446.E("\u0590վ֢ր֥էըָ֪֎ւֱֺ։ս־։ռչֺׄ֍֊\u058b", (byte)123, 69);
               b[1] = NLoginCore_110.B("ƮǁƪưǮǎǔƯƶƭưƫƬǹǰǚǛƿǖǢǌǛǈǉ", (byte)123, 66);
               b[2] = NLoginCore_553.A("ƮǉǝǍǜǬƳǩƬǶǩǺǃƴǚƻǝǒǋǭǢȁǈǉ", (byte)123, 65);
               b[3] = NLoginCore_141.B("ǨǝǭǂǢƬǥǇǤǆǉǭƬǫǗǼƻƱǝǯǖǛǈǉ", (byte)123, 66);
               b[4] = NLoginCore_091.E("֛օֲ֤֭վ֔֨կ֓֨տ", (byte)123, 69);
               b[5] = NLoginCore_453.A("ǗǟǞǊƼƫǉǬƬǉǋǉǌǬǎǇǮƱǙǠǂǳǚǲǤǒǕȉǥǡǕȊǡǙȀǇȁȇǳǰǑȆǓȁȇǤǔȝǳǷȘȒȏǻǨǩ", (byte)123, 65);
               b[6] = NLoginCore_004.F("֨լխֈ\u0590ր֪֗ժֱղּ։֒պ֑֟վֻֻׂ֛֥֪֙֜֒ׄ։և֭֍ֱאֱָָׅ֥֝֠\u05ceׂ֕\u05caג֩נט֘םמְ֪֭֫", (byte)123, 70);
               b[7] = NLoginCore_433.D(
                  "֛ծն֓փբճն֚սևվ֪ժ\u058cչը֞փֳ֥֡֫ըֈհո։ּպշ\u058c\u058cշֱִ֠֍սսֽׅ׃ָօ֖ׅ֥֢֭֠ׄב֝הג׀ח֏הֶ֬֏ֺֽֿ֞֙֬֝־ׂׄ\u05c8כ\u05caֿ֨\u05cbׅ\u05edׅ׃ך\u05cbעֹֺ",
                  (byte)123,
                  68
               );
               b[8] = NLoginCore_553.E("֢֯ի֓հֲև\u058bյ\u058cւղ֗կִֺ֗֠֟֡ջׁ֗ևַ֧֤֚քׅ׃֟\u05cfֻ֭֞וֵ֤֍ֶׂ֨֟", (byte)123, 69);
               b[9] = NLoginCore_141.B("ǪƺǉǐǀǛǂǒǎƲǍǯǃǖǦǒǔƽǯǫǀƻǯǎƾǸǑǔȂǤǥȁǽǙȆǈǒȁǨȀǞǶǳǔȌȑȒȓȐǺǳǚȂǝȡȁǦǯȐȊȦșȃȍ", (byte)123, 66);
               b[10] = NLoginCore_223.B("ƻǭƨǃǑƯǧƱǆưǌƸǛƵǐƻǦǳǀǟǲȂȃȁȆǜǐǟǼǹǭȅǌǡȑȌǲȇǨǴȀȒǳǨǤǕȎǜǲȘǨȘȁǢǾǵȟȀȔȂǥȨǶȭȌȃǻǹǾȟǯǵȲȗȔǽ", (byte)123, 66);
               b[11] = NLoginCore_553.C(
                  "Օ֊Փ՞֟՟՛ձ֛մպֆգ֚֜֘քև֬խօւ֏ְַ֗֠֍ֱֺּ֦֭֚֞֎ֶֶַֿׅ֔֟֡\u05cb\u05cc׃׃ֲׄ֬׀גא֕זִ֥֠֡ך֜׆ָזנׂ֙׃׀ֺ֥לֻח\u05caפ֞\u05cdקׯּׂװ׀ׄ֯גַצֲַב\u05fbטֵ\u05fb\u05faת\u05ee׀ד\u05fdה\u0601כ\u05c8\u05ce",
                  (byte)123,
                  67
               );
               b[12] = NLoginCore_575.C(
                  "֍իա֣֜փՠ֗քջւ֔ավ֮ֆ\u058cժձևսզ֞ւնյֱֻ֗ճֱֶּ֛֙֍֚ք֓ոִֹցֹֹ֖֘ֆׇ֎ְ\u0590ֵֽׁ֑֯׆׃ה׃דֻן֚\u05caֽעֻׄוא֙כסׂךֹק׆\u05ceׂצצױ״תש\u05f7ֵׯֺדה\u05cf\u05cfֶׯ\u05f7ת\u05fdֻׄװװ־רץתׇי\u05faע\u05c8ؒ؏؎װשת\u0604דؐעׯװ\u05eeؐ",
                  (byte)123,
                  67
               );
               b[13] = NLoginCore_173.B(
                  "ǣƨƿƼưǓƴƧƨǗƸǎƹǔǱǦƷǉƹǘǙǐȀǍǓǻȆǞǴȇȉǵǮǍǇǟȀȐȈǣǫǩǐȆǒǓȚǲǩȐȜǽǘǙȡȑȓǦțǷǤǽǴǬȯȟȦǫǲȏȢȲǵȒȑȶȌȕȐȷȨȐȝȘǸȹȔȾɁȁɂɈțȩȭȸșȤȠȌȈȢȞɈȌɊɎɚȨɗȕȚȻȕȩȞȻɠɒȤɠȟɉəȳȴɧɮɤɡɀɝɃɳɇɁɤɲɄȽ",
                  (byte)123,
                  66
               );
               b[14] = NLoginCore_521.D("֔չժ֖գ֒֜շչ֣֓֜ճդզ֧֮֟հ֎ֲ֡չպ", (byte)123, 68);
               b[15] = NLoginCore_384.C("ծ֔֘ս՞կ֘\u0590ՙ֓յծ", (byte)123, 67);
               b[16] = NLoginCore_553.B("ǇƫǐǜƺǓǱǞǶǫǶǤǰǦƹǎǛǒǱǠǟǋǈǉ", (byte)123, 66);
               b[17] = NLoginCore_387.E("թ֎֤֩\u058cֲճ֏֙֘ֆտ", (byte)123, 69);
               b[18] = NLoginCore_141.A("ǮƾǧƣǎǥǞǳƵǠǬǔǓǤǖǾǭǒǟǴƾƿǰȀǳǲǑǂǦǹȂǻȏǁǉǣȇȋǣǮȏǫȉǺȓȕǒǥȈǱȞǮȜșǴȆǟțǞǡǩȀȩȪȢǺǰǬȄȥȳǫȗȟǳȂȰǳȏǸȼȬǸɀȍȴǻȖǾȣȡȄȸȫȫȤ", (byte)123, 65);
               b[19] = NLoginCore_138.A("ǘǄƩǬǈǦƲǲƵǎǀǳǗǱǔƸǓǈƸƻƴǛǈǉ", (byte)123, 65);
               b[20] = NLoginCore_141.E(
                  "֬տև֤֔ճքև֫֎֘֏ֻջ֝֊չֲֶּ֯֔ׄչ֙ց։֚\u05cd\u058bֈ֝֝ֈֱׂׅ֞֎֎ז\u05ceה\u05c9ֱ֖֧זֶ־ֳוע֮ץףבר֠ץׇֽ֠֯פ֫מׇף\u05f5ױ\u05ecתֶׅד\u05edחזָֽחֽ׃\u0605ם\u05ca\u05cb",
                  (byte)123,
                  69
               );
               b[21] = NLoginCore_446.E("֢֯ի֓հֲև\u058bյ\u058cւղ֗կִֺ֗֠֟֡ջָֽ֖֯\u05caָֻ׆ׁ֫\u05c9ׇׇ֦֦֣֮־֥֮֓֡֟", (byte)123, 69);
               b[22] = NLoginCore_427.B("ǙǂǡǋƤƮƮǮƵưǲǢǙƷǥƺǱǹǫǽǋǓǻǾǦǀǡǒǿȄȈǭǫȊǎǈǊǻǜǥǵȘǳȚȂȅȜǕǭȊǮȚǰǲǠȝȡȁǨȉǿȥȂȮǷȤȌȏȜȮȤȐȌȟȢǽ", (byte)123, 66);
               b[23] = NLoginCore_091.C(
                  "էռծւՙգձ֟մ֥֓էֲ֦֪֩֞֝֞֬֙ֆքփ֍ճ֏։։ծջֲִֵ֛֛֔֫֫֘տֳֽ֢֤֩֘֠֍\u058c֟֒\u05ce\u05cd֍ֱ֪֧בּ֬֔כטֱִ֙֝םוֵדסףג֜֩\u05c8֭פכׄסכססֱדׁװ\u05ceַף\u05ee\u05f5ראּט׳מגל\u05f7עז\u05ff\u05ce",
                  (byte)123,
                  67
               );
               b[24] = NLoginCore_241.D(
                  "։֊\u0590֝֙֝ֆ֢նփմ֊֖֔ւ֚վխ֛֓֓֊֫ղֲִֵֺ֧֘֗֔֝֜րֺ֣֯ջֱִ֨։֣֜֠֠֠ց֍\u05cf֜֟\u05cb\u05ccב\u05ceדְָ֩\u05ccֲֲֳִַֽֽֿע־ֺֿׂ֡צ\u05caי\u05c9ֽ֢ףײג\u05ccֹֺ",
                  (byte)123,
                  68
               );
               b[25] = NLoginCore_201.D("իձ՝՞գ֜գտ֧֨չծ", (byte)123, 68);
               b[26] = NLoginCore_453.E(
                  "֠ևְձձֵ֦\u058c\u0590ְ֥֔ղְֻ֔֨׀֔֏֝֕րֱ־ջֲֹׄ֠׆ׄ֝֊։֎֮֨\u05cfִ֪֣֑֙\u05cbֲ֫\u05c9֬לןכּֿ֤֠׃םֳי֢֫\u05cf\u05edֻ֪֮פמר֯ׯצֵ\u05cf\u05f7\u05edבַזֽ\u05f7ִל\u05ff\u0601ֿ\u05cfֿ؊דנ؆؇ףנ",
                  (byte)123,
                  69
               );
               b[27] = NLoginCore_471.B("ǢơǆƱǢǀǑǦǷǸǓǣǒǒǆǔǮǱƸǴǏǜǻǡǱǢǲǪǤǆȊȄ", (byte)123, 66);
               b[28] = NLoginCore_241.F("չի֑֟լվ֊֤֘ի։ք֬շִ֚֊ֲֺׂ֢֜օֲִ֝֔׆ֺ\u05cbׂ֪֨־ֲּ֝וז׆\u05cfְֹ\u05cd֔֕\u05cf׀\u05ca֙ןֺׁׄיצְֵדֺֹמ\u05c8א", (byte)123, 70);
               b[29] = NLoginCore_092.C(
                  "։֊\u0590֝֙֝ֆ֢նփմ֊֖֔ւ֚վխ֛֓֓֊֫ղֲִֵֺ֧֘֗֔֝֜րֺ֣֯ջֱִ֨։֣֜֠֠֠ց֍\u05cf֜֟\u05cb\u05ccב\u05ceדְָ֩\u05ccֱֲִז־ׂ֞־ףק֦חנ֣דֺתׅ֨׃\u05ebמׂײֹֺ", (byte)123, 67
               );
               b[30] = NLoginCore_433.C("֟՜֖֚՛օվս֨ՠցծ", (byte)123, 67);
               b[31] = NLoginCore_433.E(
                  "ֳ֛֪֚֮֮֡֗և֔օ֛֧֥֓֫֏վּ֤֤֛֬փ׆֩\u05cbׅ֨׃ִָ֥֑֭֮\u05cb׀\u058cֱֱֱִֹׂׅ֚֭֒֞נְ֭לםעןפֺׁ\u05c9םׅ׃נּ\u05eeֳׂנװׯִסח\u05ee\u05cfׯט\u05ffֿ\u05c9\u05f5ּ־ם\u05ca\u05cb",
                  (byte)123,
                  69
               );
               b[32] = NLoginCore_471.F("֭֠֊֨֨օ֢֍ָ֣չտ", (byte)123, 70);
               b[33] = NLoginCore_530.D("չ\u058b֘ծչ֗֍հ֝վ֘֘֬ցլ֞ֈըլսխ֢չպ", (byte)123, 68);
               b[34] = NLoginCore_141.D("խ՞՚֢֙լ֑֟յ՞աթ֘֔եջ֤֠֡սքռչպ", (byte)123, 68);
               b[35] = NLoginCore_521.C("՜ՙ֙֍֖\u058cօ֢հյ֛ծ", (byte)123, 67);
               b[36] = NLoginCore_110.B("ǬƯǫǏƾǁǮƾǍǃǲƽ", (byte)123, 66);
               b[37] = NLoginCore_324.B("ǇƾǜǭǰǨǀǌǍǌǕǩǥǜǗǬǫǉƲǘǚǳǗǙǑǰȂǦǲȁȊȅȈǗǯǠǜǭǑȋǑǦȎǝ", (byte)123, 66);
               b[38] = NLoginCore_453.D("սր֕ջ՚֝գ֢֧֒֒ծ", (byte)123, 68);
               b[39] = NLoginCore_004.C("֓ծ֒ւՕօ֚ջւ՚՛ու֗պփփօ\u058b֊֡֨հմ֥֭֓֍մ֓օ֕֯վ։ո֙նֽւ֝׀ւׇ֤ֈַ֜׆\u0590֢֩\u058b֚֜֙", (byte)123, 67);
               b[40] = NLoginCore_397.C("\u0558\u058bթ\u058c֎ա֜ծ֖֜֗֠ճ֛֨ծ֣֦րռֳ\u058cչպ", (byte)123, 67);
               b[41] = NLoginCore_127.C("ոֈսւցճց֝բ֛ղաց֝֙ը֪֍էְժ֢֦֬օմֆָ֤֯֫շպֹֹֻ֭֙֎ָׂ֛֤ׅ֞\u05cb\u058cׇ\u058c֠\u05cbדֲ֦֔׀֭֘ג\u05ceיָֽ֛ד֚ךחִ֡םעף֦֮֠", (byte)123, 67);
               b[42] = NLoginCore_091.C("ոխ֊կրՖ֣՝օհ֖֭֝֓֞֬ռթհ֎֜օ֫լָ֦֦֗ձ֦֬֏", (byte)123, 67);
               b[43] = NLoginCore_446.A("ǏǗǑǢƮǡǟǃǟǐǦƽ", (byte)123, 65);
               break;
            case 2:
               b[0] = NLoginCore_575.C("֎՞ժ֑ւպբ֜չճըծ", (byte)123, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_183.D("։ղ֚֞՚դ֤փ֡ձ֪ք֣պ֣ն֦֡և։֔ռչպ", (byte)123, 68);
         }
      }
   }

   public NLoginType_022(NLoginType_008 var1) {
      super(var1, a(c & d, f), a(g & h, i), (boolean)j, (boolean)k);
      this.a = new AtomicBoolean((boolean)m);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_022.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.D("ӖӸӺӚӾԝԕԫԗӦԤԚԨԢӫԐԲԱԩԯԩӾ", (byte)83, 68), NLoginType_022.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_451.B("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӱӮӲԀԀӳӼӺӡӹӨԇӳӬԅſ", (byte)83, 66) + var1 + NLoginCore_530.D("Ө", (byte)83, 68) + var2.toString(), var4
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void b(NLoginInterface_042 var1, String[] var2) {
      if (var1 instanceof NLoginCore_277) {
         NLoginCore_150.a(var1, NLoginCore_487.A);
      } else if (var2.length != o && var2.length != p) {
         NLoginCore_487 var72 = NLoginCore_487.x;
         Object[] var83 = new Object[q];
         var83[r] = a(s, t ^ u) + this.e().toLowerCase(Locale.ENGLISH) + a(v & w, x);
         NLoginCore_150.a(var1, var72, var83);
      } else if (var2.length == y && var2[z].equalsIgnoreCase(a(aa & ab, ac))) {
         if (!this.a.get()) {
            NLoginCore_150.a(var1, a(ad, ae ^ af));
         } else {
            NLoginCore_150.a(var1, a(ah, ai ^ aj));
            this.a.set((boolean)al);
         }
      } else if (this.a.get()) {
         NLoginCore_150.a(var1, a(am, an ^ ao) + this.e().toLowerCase(Locale.ENGLISH) + a(ap & aq, ar));
      } else {
         Integer var3 = NLoginCore_449.a(var2[at]);
         if (var3 != null && var3 > 0) {
            if (var3 <= az) {
               NLoginCore_150.a(var1, a(ba, bb ^ bc));
            } else {
               long var4 = System.currentTimeMillis();
               if (var4 - this.e >= be) {
                  NLoginCore_150.a(var1, a(bf, bg ^ bh));
                  NLoginCore_150.a(var1, a(bj, bk ^ bl));
                  NLoginCore_150.a(var1, a(bn, bo ^ bp));
                  NLoginCore_150.a(var1, a(br & bs, bt) + this.e().toLowerCase(Locale.ENGLISH) + a(bu, bv ^ bw) + var2[bx] + a(by, bz ^ ca));
                  NLoginCore_150.a(var1, a(cc & cd, ce));
                  NLoginCore_150.a(var1, a(cg & ch, ci));
                  this.e = var4;
               } else {
                  int var6 = var2.length == ck && a(cl & cm, cn).equals(var2[co]) ? cp : cq;
                  long var7 = System.currentTimeMillis() - var3 * cr * cs;
                  boolean var31 = false /* VF: Semaphore variable */;

                  label426: {
                     label474: {
                        label475: {
                           try {
                              var31 = true;
                              if (this.a.getAndSet((boolean)ct)) {
                                 NLoginCore_150.a(var1, a(cu, cv ^ cw) + this.e().toLowerCase(Locale.ENGLISH) + a(cx, cy ^ cz));
                                 var31 = false;
                                 break label426;
                              }

                              NLoginCore_171 var49;
                              label449: {
                                 NLoginCore_270 var9 = new NLoginCore_270();
                                 long var10 = 0L;
                                 if (var6 != 0) {
                                    NLoginCore_459 var59 = this.a.a().a();
                                    String var10001 = a(dc & dd, de);
                                    Object[] var73 = new Object[df];
                                    var73[dg] = NLoginCore_477.e.a(new Object[dh]);
                                    var73[di] = NLoginCore_436.h.getName();
                                    var73[dj] = NLoginCore_436.h.getName();
                                    var10001 = String.format(var10001, var73);
                                    var73 = new Object[dk];
                                    var73[dl] = var7;
                                    NLoginCore_218 var12 = var59.b(var10001, var73);
                                    var10 = ((Integer)var12.d()).intValue();
                                 } else {
                                    NLoginCore_291 var14 = this.a.a();
                                    NLoginCore_459 var60 = this.a.a().a();
                                    String var64 = a(dm, dn);
                                    Object[] var75 = new Object[var_do];
                                    var75[dp] = NLoginCore_477.e.a(new Object[dq]);
                                    var75[dr] = NLoginCore_436.f.getName();
                                    var75[ds] = NLoginCore_436.h.getName();
                                    var75[dt] = NLoginCore_436.h.getName();
                                    var64 = String.format(var64, var75);
                                    var75 = new Object[du];
                                    var75[dv] = var7;
                                    var49 = var60.a(var64, var75);

                                    long var48;
                                    try {
                                       ResultSet var16 = var49.d();
                                       var48 = var16.next() ? var16.getLong(dw) : 0L;
                                    } catch (Throwable var43) {
                                       if (var49 != null) {
                                          try {
                                             var49.close();
                                          } catch (Throwable var41) {
                                             var43.addSuppressed(var41);
                                          }
                                       }

                                       throw var43;
                                    }

                                    if (var49 != null) {
                                       var49.close();
                                    }

                                    if (var48 > 0L) {
                                       var64 = a(dx, dy ^ dz);
                                       var75 = new Object[ea];
                                       var75[eb] = NLoginCore_112.d(var10);
                                       var75[ec] = NLoginCore_112.d(var48);
                                       var75[ed] = NLoginCore_112.a((double)var10 / var48 * ee, ef) + a(eg & eh, ei);
                                       NLoginCore_150.a(var1, var64, var75);
                                       var60 = this.a.a().a();
                                       var64 = a(ej, ek ^ el);
                                       var75 = new Object[em];
                                       var75[en] = NLoginCore_477.e.a(new Object[eo]);
                                       var75[ep] = NLoginCore_436.f.getName();
                                       var75[eq] = NLoginCore_436.h.getName();
                                       var75[er] = NLoginCore_436.h.getName();
                                       var64 = String.format(var64, var75);
                                       var75 = new Object[es];
                                       var75[et] = var7;
                                       var49 = var60.a(var64, var75);

                                       try {
                                          ResultSet var50 = var49.d();

                                          while (this.a.get() && var50.next()) {
                                             ForceRegisterConfig var17 = var14.a(var50);
                                             if (var17 == null || !var14.a(var17)) {
                                                NLoginCore_150.a(var1, NLoginCore_487.w);
                                                NLoginCore_150.a(var1, NLoginCore_194.F);
                                                break label449;
                                             }

                                             String var18 = var17.i();
                                             String var19 = NLoginCore_329.d.ar() ? BCryptHashProvider.g(var18, var17.t()) : var18;
                                             NLoginCore_370.b(a(ew, ex ^ ey) + var19 + a(ez & fa, fb));
                                             NLoginCore_277 var20 = this.a.b().a(var19);
                                             UUID var21 = var20 != null ? var20.a() : var17.a();
                                             boolean var39 = false /* VF: Semaphore variable */;

                                             try {
                                                var39 = true;
                                                NLoginType_008 var62 = this.a;
                                                EventEnum var70 = EventEnum.PASSWORD_UPDATE_EVENT;
                                                var75 = new Object[fd];
                                                var75[fe] = var20;
                                                var75[ff] = var21;
                                                var75[fg] = var19;
                                                var75[fh] = null;
                                                var75[fi] = UpdatePasswordSource.BY_ADMIN;
                                                var62.a(var70, var75);
                                                var39 = false;
                                             } finally {
                                                if (var39) {
                                                   if (var20 != null) {
                                                      var20.a(NLoginCore_150.a(NLoginCore_487.q, var20));
                                                   }

                                                   if (++var10 % fw == 0L) {
                                                      var64 = a(fx & fy, fz);
                                                      var75 = new Object[ga];
                                                      var75[gb] = NLoginCore_112.d(var10);
                                                      var75[gc] = NLoginCore_112.d(var48);
                                                      var75[gd] = NLoginCore_112.a((double)var10 / var48 * ge, gf) + a(gg, gh);
                                                      NLoginCore_150.a(var1, var64, var75);
                                                   }
                                                }
                                             }

                                             if (var20 != null) {
                                                var20.a(NLoginCore_150.a(NLoginCore_487.q, var20));
                                             }

                                             if (++var10 % fk == 0L) {
                                                var64 = a(fl, fm);
                                                var75 = new Object[fn];
                                                var75[fo] = NLoginCore_112.d(var10);
                                                var75[fp] = NLoginCore_112.d(var48);
                                                var75[fq] = NLoginCore_112.a((double)var10 / var48 * fr, fs) + a(ft, fu);
                                                NLoginCore_150.a(var1, var64, var75);
                                             }
                                          }
                                       } catch (Throwable var44) {
                                          if (var49 != null) {
                                             try {
                                                var49.close();
                                             } catch (Throwable var40) {
                                                var44.addSuppressed(var40);
                                             }
                                          }

                                          throw var44;
                                       }

                                       if (var49 != null) {
                                          var49.close();
                                       }
                                    }
                                 }

                                 NLoginCore_150.a(
                                    var1,
                                    a(gi & gj, gk)
                                       + var10
                                       + a(gl, gm ^ gn)
                                       + (var10 > 1L ? a(go & gp, gq) : a(gr & gs, gt))
                                       + a(gu, gv ^ gw)
                                 );
                                 NLoginCore_150.a(var1, a(gy, gz ^ ha));
                                 NLoginCore_150.a(var1, a(hc, hd) + var9.a(TimeUnit.SECONDS, he) + a(hf & hg, hh));
                                 var31 = false;
                                 break label475;
                              }

                              if (var49 != null) {
                                 var49.close();
                                 var31 = false;
                              } else {
                                 var31 = false;
                              }
                              break label474;
                           } catch (Exception var45) {
                              String var10000 = a(hk, hl ^ hm);
                              Object[] var10002 = new Object[hn];
                              var10002[ho] = var3;
                              var10002[hp] = var6 != 0 ? a(hq, hr ^ hs) : a(ht, hu ^ hv);
                              NLoginCore_370.c(var10000, var45, var10002);
                              NLoginCore_150.a(var1, NLoginCore_487.w);
                              NLoginCore_150.a(var1, NLoginCore_194.F);
                              var31 = false;
                           } finally {
                              if (var31) {
                                 this.a.set((boolean)hy);
                              }
                           }

                           this.a.set((boolean)hx);
                           return;
                        }

                        this.a.set((boolean)hj);
                        return;
                     }

                     this.a.set((boolean)ev);
                     return;
                  }

                  this.a.set((boolean)db);
               }
            }
         } else {
            NLoginCore_150.a(var1, a(au, av ^ aw) + var2[ax]);
         }
      }
   }
}
