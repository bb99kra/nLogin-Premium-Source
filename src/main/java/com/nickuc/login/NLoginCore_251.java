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
import lombok.Generated;

public enum NLoginCore_251 implements NLoginInterface_005 {
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
   k;

   private final NLoginCore_474 b;
   private static String[] ZKM_STR_A = new String[NLoginCore_251.w];
   private static String[] ZKM_STR_B = new String[NLoginCore_251.x];
   private static long c;
   private static int a = 0 >>> 255 | 0 << -255;
   private static int b = Integer.reverse(-1);
   private static long d = Long.reverse(-577031567895345217L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(2881732945925195711L);
   private static long g = Long.reverse(-3458764513820540928L);
   private static int h = Integer.reverse(1073741824);
   private static int i = (-1 >>> 254 | -1 << -254) & -1;
   private static long j = Long.reverse(-577031567895345217L);
   private static int k = 90112 >>> 205 | 90112 << ~205 + 1;
   private static int l = Integer.reverse(0);
   private static int m = (1 >>> 128 | 1 << ~128 + 1) & -1;
   private static int n = Integer.reverse(1073741824);
   private static int o = Integer.reverse(-1073741824);
   private static int p = (536870912 >>> 59 | 536870912 << ~59 + 1) & -1;
   private static int q = Integer.reverse(-1610612736);
   private static int r = 25165824 >>> 54 | 25165824 << -54;
   private static int s = Integer.reverse(-536870912);
   private static int t = 268435456 >>> 89 | 268435456 << -89;
   private static int u = (2304 >>> 168 | 2304 << ~168 + 1) & -1;
   private static int v = Integer.reverse(1342177280);
   private static int w = Integer.reverse(-1744830464);
   private static int x = 50 >>> 65 | 50 << -65;
   private static int y = Integer.reverse(-1073741824);
   private static long z = Long.reverse(2881732945925195711L);
   private static long aa = Long.reverse(-3458764513820540928L);
   private static int ab = 0 >>> 231 | 0 << ~231 + 1;
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = 0 >>> 242 | 0 << ~242 + 1;
   private static int ae = Integer.reverse(536870912);
   private static int af = Integer.reverse(-1);
   private static long ag = Long.reverse(-577031567895345217L);
   private static int ah = Integer.reverse(-1610612736);
   private static long ai = Long.reverse(2881732945925195711L);
   private static long aj = Long.reverse(-3458764513820540928L);
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int am = Integer.reverse(0);
   private static int an = Integer.reverse(1610612736);
   private static long ao = Long.reverse(-577031567895345217L);
   private static int ap = Integer.reverse(-536870912);
   private static long aq = Long.reverse(2881732945925195711L);
   private static long ar = Long.reverse(-3458764513820540928L);
   private static int as = (8 >>> 226 | 8 << ~226 + 1) & -1;
   private static int at = Integer.reverse(Integer.MIN_VALUE);
   private static int au = Integer.reverse(0);
   private static int av = 16 >>> 129 | 16 << -129;
   private static long aw = Long.reverse(2881732945925195711L);
   private static long ax = Long.reverse(-3458764513820540928L);
   private static int ay = Integer.reverse(-1879048192);
   private static int az = (-1 >>> 87 | -1 << ~87 + 1) & -1;
   private static long ba = Long.reverse(-577031567895345217L);
   private static int bb = Integer.reverse(-1073741824);
   private static int bc = 33554432 >>> 153 | 33554432 << -153;
   private static int bd = 0 >>> 201 | 0 << -201;
   private static int be = Integer.reverse(1342177280);
   private static long bf = Long.reverse(-577031567895345217L);
   private static int bg = Integer.reverse(-805306368);
   private static long bh = Long.reverse(2881732945925195711L);
   private static long bi = Long.reverse(-3458764513820540928L);
   private static int bj = Integer.reverse(536870912);
   private static int bk = Integer.reverse(Integer.MIN_VALUE);
   private static int bl = 0 >>> 69 | 0 << -69;
   private static int bm = (24 >>> 193 | 24 << ~193 + 1) & -1;
   private static int bn = -1 >>> 179 | -1 << -179;
   private static long bo = Long.reverse(-577031567895345217L);
   private static int bp = 6815744 >>> 19 | 6815744 << ~19 + 1;
   private static long bq = Long.reverse(2881732945925195711L);
   private static long br = Long.reverse(-3458764513820540928L);
   private static int bs = (5242880 >>> 20 | 5242880 << -20) & -1;
   private static int bt = (1073741824 >>> 222 | 1073741824 << ~222 + 1) & -1;
   private static int bu = (0 >>> 244 | 0 << -244) & -1;
   private static int bv = (14336 >>> 42 | 14336 << ~42 + 1) & -1;
   private static int bw = Integer.reverse(-1);
   private static long bx = Long.reverse(-577031567895345217L);
   private static int by = Integer.reverse(-268435456);
   private static long bz = Long.reverse(-577031567895345217L);
   private static int ca = -2147483647 >>> 254 | -2147483647 << -254;
   private static int cb = ('耀' >>> 15 | 32768 << ~15 + 1) & -1;
   private static int cc = (0 >>> 200 | 0 << ~200 + 1) & -1;
   private static int cd = Integer.reverse(134217728);
   private static long ce = Long.reverse(2881732945925195711L);
   private static long cf = Long.reverse(-3458764513820540928L);
   private static int cg = 1114112 >>> 16 | 1114112 << -16;
   private static int ch = Integer.reverse(-1);
   private static long ci = Long.reverse(-577031567895345217L);
   private static int cj = 7340032 >>> 84 | 7340032 << ~84 + 1;
   private static int ck = 32 >>> 133 | 32 << ~133 + 1;
   private static int cl = Integer.reverse(0);
   private static int cm = Integer.reverse(1207959552);
   private static long cn = Long.reverse(-577031567895345217L);
   private static int co = Integer.reverse(-939524096);
   private static long cp = Long.reverse(2881732945925195711L);
   private static long cq = Long.reverse(-3458764513820540928L);
   private static int cr = 512 >>> 166 | 512 << ~166 + 1;
   private static int cs = Integer.reverse(Integer.MIN_VALUE);
   private static int ct = Integer.reverse(0);
   private static int cu = (-1610612736 >>> 251 | -1610612736 << ~251 + 1) & -1;
   private static long cv = Long.reverse(2881732945925195711L);
   private static long cw = Long.reverse(-3458764513820540928L);
   private static int cx = Integer.reverse(-1476395008);
   private static long cy = Long.reverse(2881732945925195711L);
   private static long cz = Long.reverse(-3458764513820540928L);
   private static int da = Integer.reverse(-1879048192);
   private static int db = 8 >>> 99 | 8 << -99;
   private static int dc = Integer.reverse(0);
   private static int dd = Integer.reverse(1744830464);
   private static int de = -1 >>> 208 | -1 << -208;
   private static long df = Long.reverse(-577031567895345217L);
   private static int dg = Integer.reverse(-402653184);
   private static long dh = Long.reverse(2881732945925195711L);
   private static long di = Long.reverse(-3458764513820540928L);
   private static int dj = Integer.reverse(1342177280);
   private static int dk = Integer.reverse(Integer.MIN_VALUE);
   private static int dl = (0 >>> 71 | 0 << ~71 + 1) & -1;
   private static int dm = 24 >>> 96 | 24 << ~96 + 1;
   private static long dn = Long.reverse(-577031567895345217L);

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 578804008199255693L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(22 + 47),
                     83,
                     (byte)(46 + 1),
                     (byte)(11 + 56),
                     (byte)(5 + 61),
                     (byte)(24 + 43),
                     (byte)(43 + 4),
                     (byte)(25 + 55),
                     (byte)(23 + 52),
                     (byte)(28 + 39),
                     (byte)(62 + 21),
                     (byte)(7 + 46),
                     (byte)(53 + 27),
                     (byte)(46 + 51),
                     (byte)(77 + 23),
                     (byte)(76 + 24),
                     (byte)(14 + 91),
                     (byte)(67 + 43),
                     (byte)(79 + 24)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.E("գհկԲղծթղսլԹշջմշսԿࣗࣛࢻࢴ࣒ࣞ࣋ࣝࣛ", (byte)68, 69));
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

   private static void b() {
      c = -152393664069386268L;
      long var0 = c ^ 578804008199255693L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(6 + 63),
               (byte)(61 + 22),
               (byte)(23 + 24),
               (byte)(53 + 14),
               (byte)(29 + 37),
               (byte)(11 + 56),
               (byte)(42 + 5),
               (byte)(56 + 24),
               (byte)(11 + 64),
               (byte)(23 + 44),
               83,
               (byte)(25 + 28),
               (byte)(21 + 59),
               (byte)(14 + 83),
               (byte)(50 + 50),
               (byte)(75 + 25),
               (byte)(85 + 20),
               110,
               (byte)(64 + 39)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_427.A("ƒǄǍǄƦǓƚǆƖƱƶǝƮǎǟǣǤǞǣǗƳǡǤǦǉƫǚǢǞǩǲǴǑǳƬǀǭǍǗǦǸǳǨǩƾǷǠǘȂǿǝǥǝǑǎǏ", (byte)110, 65);
               ZKM_STR_B[1] = NLoginCore_183.B("ƦƭƠƨƪƪǇƶƹǚƕƣ", (byte)110, 66);
               ZKM_STR_B[2] = NLoginCore_451.C("ծգղպը՞ՒխռԾՒՇ", (byte)110, 67);
               ZKM_STR_B[3] = NLoginCore_324.D("մՌջԶՖս\u0558մԽրծտշՓՙՏ\u0558է՜\u0557՚Յՠքձ՞֓ֆ֎զՑՠ", (byte)110, 68);
               ZKM_STR_B[4] = NLoginCore_183.F("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֧հֶ֧և֝\u0590ֳղֳִֵ֡րֻ֑֧֦֓֟֩\u05cb֒", (byte)110, 70);
               ZKM_STR_B[5] = NLoginCore_201.C("մՌջԶՖս\u0558մԽրխնՐճԼէՔօզ\u0558ՕՖ֏դ։Ռ\u0590\u058cՆՋշզ", (byte)110, 67);
               ZKM_STR_B[6] = NLoginCore_232.A("ǉƦƩƕƗǅƔǏǒǅǑƲǊƯǟǛǡǜǥƯǣǦǃǫǫǥǀǛƫƾƼǞǋǨǟǷǯǦǐǯǹƳǆǃ", (byte)110, 65);
               ZKM_STR_B[7] = NLoginCore_201.B("ǐƨǗƒƲǙƴǐƙǜǉǠƜǗƔƯǎǢǔǒǤǠƲǀƶǛƹǃǭǡǊǆ", (byte)110, 66);
               ZKM_STR_B[8] = NLoginCore_451.E("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֯֨֙ն\u058cևֶ֪֚չ־֒ք֤֏֦փֵׇ֘֙֙֒", (byte)110, 69);
               ZKM_STR_B[9] = NLoginCore_387.B("ǐƨǗƒƲǙƴǐƙǜǉǖǋƸƵǍƺǔǤǓǥƥƽǃǆƦƤǉƪǙǄƽ", (byte)110, 66);
               ZKM_STR_B[10] = NLoginCore_141.C("խՊՍԹԻթԸճնթյՖծՓփտօր։Փևֆզֆպ՞սՐ՝տէ֑ձ֚փօխ֝զը՚\u0590ՙէ", (byte)110, 67);
               ZKM_STR_B[11] = NLoginCore_324.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƥǕƩƹƦǆǚƬƼƻƾǓǡǳǌǵǌǓǫǓǭǳǕǗǐȂǾǜǑǄǵƿǡǎǏ", (byte)110, 66);
               ZKM_STR_B[12] = NLoginCore_530.E("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡և֖֚խ\u0590ֱֵ֚֭֕պջֵֵַַֹ֦֞\u058b֩\u05c9֘־֢֠\u05c8\u05ccׂ׃ׇ֤ד֯\u058cחכטֿ\u05c9נלֲ", (byte)110, 69);
               ZKM_STR_B[13] = NLoginCore_173.E("ղշղա՝վտ֜\u058c֗ցւ\u058c֛։֑֑֏ցկָձ֢֔պջֻ֕֏ղֳַָׇֺֻֽֿ֭֡֟֜֞֒", (byte)110, 69);
               ZKM_STR_B[14] = NLoginCore_004.F("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡և֖֚խ\u0590ֱֵ֚֭֕պֺׁׂ֭֔ֈַ֙փֲׇֻּֿׅ֭֮֊ֱאִז֝֞", (byte)110, 70);
               ZKM_STR_B[15] = NLoginCore_223.F("ղշղա՝վտ֜\u058c֗ցւ\u058c֛։֑֑֏ցկָմ֤ոֈյ֕֩ջ\u058b֊֍ֹֿ֒օְ֥ջׇֺֻ֥֠־בֽ\u05cb֛֒֍ֱ֤ז֝֞", (byte)110, 70);
               ZKM_STR_B[16] = NLoginCore_397.D("խՊՍԹԻթԸճնթշց՝՟ւևՕպՉէն՜կիՂե֊ժկւֆՏՏՙ\u0557ձՖՔ֊չ֕ր֕ց\u058c֛֖֝֙փւ֦։֛ղճ", (byte)110, 68);
               ZKM_STR_B[17] = NLoginCore_076.D("ՇՌՇԶԲՓՔձալՖ\u0557ահ՞զզդՖՄ֍\u058cգզ\u058cև֏֒ճյցՕեՓ֑֚֔ս՛Ֆխ֑֓ւօֆբֆ֖աչ֪֛֬ղճ", (byte)110, 68);
               ZKM_STR_B[18] = NLoginCore_433.B("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƽǓǪǪǢƽǐƬǍưǁǋǲƴǩǊǤǧǩǋǧǊǞǬƼƿǴǬǐǜǁǚȆǣǾǫǄǗǘȌǙǮǤ", (byte)110, 66);
               ZKM_STR_B[19] = NLoginCore_433.C("իՄէԳ\u0558յԼՍՏԺգղչմՄՆ՝ճջնչՖւբե֊կւե\u058bօ֍թՏզիճ՚մ֝֞ալ֍֍֝վհդևվ֖պ֛ղճ", (byte)110, 67);
               ZKM_STR_B[20] = NLoginCore_141.F("փ֑յչնւ֖֙պլ֭ժ֘ֆ֣֚ջև֯֎ճ֡ց֢֖֊ִ֍֏ր֑֫յׂ֟ովׇׁ֛֤\u058cׁ֠ׄאև\u0590ׅ֑\u05ce\u05cdְׂ֝֞", (byte)110, 70);
               ZKM_STR_B[21] = NLoginCore_076.B("ǇƠǃƏƴǑƘƩƫƖƿƱƪƽǋƺǄǁǁǚǁƸǋƫǇǁƷƽǨǐǟǋǇǧƾǈǥƳǇƵǳƴǎǮǐǳǛǭǳǳǒȈǴǡǎǏ", (byte)110, 66);
               ZKM_STR_B[22] = NLoginCore_553.B("ƴǂƦƪƧƳǇǊƫƝǟǘƗǟƸǂǂƶǧǐƧƨƴǆƫǛƾǮǘǙǣǇǉǬǯǋƵǶǷƷǊǨƻǳǽǒǋǝǖǃǿǏǻǸȊǪǜǧǷȌǐǞǉǬ", (byte)110, 66);
               ZKM_STR_B[23] = NLoginCore_397.A("ǇƠǃƏƴǑƘƩƫƖƿǎǕǐƠƢƹǏǗǒǕƲǞƾǁǦǋǞǁǧǡǩƾǄǞǵǓǶǆǫƵǙǈǲǛǪǱǱǴƷǙǲǚǷǎǏ", (byte)110, 65);
               ZKM_STR_B[24] = NLoginCore_092.A("ƴǂƦƪƧƳǇǊƫƝǞƷǒǓƪǖǄǙƞƹǁǇǥƝƧǧǘǘǆǣǯǲǈǓǀƴǢƱǆǆǲƺǬǚǶǽƿǋǤƼǻǃǑǧǵǋȌǨǻȎǏǯǊǢ", (byte)110, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.D("ԶըձըՊշԾժԺՕ՚ցՒղփևֈւևջ\u0557օֈ֊խՏվֆւ֍֖֘յ֗Րդ֑ձջ֊֜֗֍մ֤֍պֆվ֨֓։եօղճ", (byte)110, 68);
               ZKM_STR_B[1] = NLoginCore_223.F("ՠ֍֚֓֝ճ֛յ֥֨ոև֧րփի֦֯իַ֪֦սվ", (byte)110, 70);
               ZKM_STR_B[2] = NLoginCore_471.C("ՄՋԵԳՙծԻՓՀի՞Շ", (byte)110, 67);
               ZKM_STR_B[3] = NLoginCore_324.D("մՌջԶՖս\u0558մԽրծտշՓՙՏ\u0558է՜\u0557՚Ճ՜ՆջՉ֓\u058bէՓը֒", (byte)110, 68);
               ZKM_STR_B[4] = NLoginCore_091.F("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֧հֶ֧և֝\u0590ֳղֳִ֦֚֙֟׆րׅֈ\u058bֹ֙֒", (byte)110, 70);
               ZKM_STR_B[5] = NLoginCore_433.A("ǐƨǗƒƲǙƴǐƙǜǉǒƬǏƘǃưǡǂƴƱƹǠǩǙƾƦǝǇǏǓǲ", (byte)110, 65);
               ZKM_STR_B[6] = NLoginCore_384.D("խՊՍԹԻթԸճնթյՖծՓփտօր։Փև֊է֏֏։դտՏբՠւյցզխէպիտ\u058b֝վէ", (byte)110, 68);
               ZKM_STR_B[7] = NLoginCore_091.A("ǐƨǗƒƲǙƴǐƙǜǉǠƜǗƔƯǎǢǔǒǤǦƴǈƴǭƨǋƢǁǫǇ", (byte)110, 65);
               ZKM_STR_B[8] = NLoginCore_138.D("խՊՍԹԻթԸճնթյՖծՓփտօր։ՓևքսծՋա՜տ\u058bկՎ֓֍ցնչկռ֍\u0558֎ո\u0590է", (byte)110, 68);
               ZKM_STR_B[9] = NLoginCore_201.A("ǐƨǗƒƲǙƴǐƙǜǉǖǋƸƵǍƺǔǤǓǥƧƾǛƻƸǊƿƪƨǬǃ", (byte)110, 65);
               ZKM_STR_B[10] = NLoginCore_223.E("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֱֱֲ֑֥։֨ջֈּ֪֒պֵց\u0590֛֦֜־։\u058b֩֒", (byte)110, 69);
               ZKM_STR_B[11] = NLoginCore_232.D("ՇՌՇԶԲՓՔձալՖ\u0557ահ՞զզդՖՄ֍ՉչՍ՝ՊժվՐՠ՟բշօ֗հ֙հշ֏շ֑֗֔րդ֑֒\u0590շբօ֝֫ղճ", (byte)110, 68);
               ZKM_STR_B[12] = NLoginCore_173.A("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫƬǪǏǨǨǦǦǗƼǚǺǉǯǑǓǹǽǳǴǕǸǽǒǟǪǶǆǽȈȇǎǯ", (byte)110, 65);
               ZKM_STR_B[13] = NLoginCore_138.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƢǓǅƫƬǆǬǀƣǬǞǝǢǪǪǷǢǇǒǱǐƹǃ", (byte)110, 66);
               ZKM_STR_B[14] = NLoginCore_433.B("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫǅǲǞǫǳƹǨǊƴǸǳǖǋǛǡǋǠǁǞǻǼǷǎǏ", (byte)110, 66);
               ZKM_STR_B[15] = NLoginCore_471.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƥǕƩƹƦǆǚƬƼƻƾǰǪǃƶǡǖƬǖǸǑǮǩƺǽǺȁǔǽǒȄǂǑǎǏ", (byte)110, 66);
               ZKM_STR_B[16] = NLoginCore_076.A("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫƫƵƳǍƲưǦǕǱǜǰǇǼǱǔǫǼǔǵǯǐǡǸǉȊǃǷǥǈǬǦǼ", (byte)110, 65);
               ZKM_STR_B[17] = NLoginCore_110.A("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩǨƿǂǨǣǫǮǏǑǝƱǁƯǶǰǭǙƷƲǉǭǬǪǭǿǘǔƺǀǺǱǠǷǎǏ", (byte)110, 65);
               ZKM_STR_B[18] = NLoginCore_521.E("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡\u058cֱֹֹ֢\u058c֟ջ֜տ\u0590ׁ֚փֳֶֶָָֻ֚֭֙֙\u058b֎׃ֻ֟֫\u0590֩\u05ce׆ט\u05caֳֺֹ֩֘֨\u05cf", (byte)110, 69);
               ZKM_STR_B[19] = NLoginCore_387.E("֖կ֒՞փ֠էոպե֎֤֝֟կձֈ֦֤֞֡ց֭֍\u0590ֵ֚֭\u0590ְֶָ֔պ֑֖֞օ֟\u05c8\u05c9\u058c֖֦\u058bּ֭֎ׄגׇח֬׆֝֞", (byte)110, 69);
               ZKM_STR_B[20] = NLoginCore_433.E("փ֑յչնւ֖֙պլ֭ժ֘ֆ֣֚ջև֯֎ճ֡ց֢֖֊ִ֍֏ր֑֫յׂ֟ովׇׁ֛֤\u058cְָֺׂ֟֝֏֠ב֧֦׆֝֞", (byte)110, 69);
               ZKM_STR_B[21] = NLoginCore_451.A("ǇƠǃƏƴǑƘƩƫƖƿƱƪƽǋƺǄǁǁǚǁƸǋƫǇǁƷƽǨǐǟǋǇǧƾǈǥƳǇƵǳƴǑƿƸǵǷǣȀǻǂǆǟǷǎǏ", (byte)110, 65);
               ZKM_STR_B[22] = NLoginCore_091.C("\u0558զՊՎՋ\u0557իծՏՁփռԻփ՜զզ՚\u058bմՋՌ\u0558ժՏտբ֒ռսևիխ\u0590֓կՙ֛֚՛ծ\u058c՟֗֡նկցպէ֣ճ֟֟֍ք֊ծքֆ֒֟տն", (byte)110, 67);
               ZKM_STR_B[23] = NLoginCore_324.B("ǇƠǃƏƴǑƘƩƫƖƿǎǕǐƠƢƹǏǗǒǕƲǞƾǁǦǋǞǁǧǡǩƾǄǞǵǓǶǆǫƵǙǇǚƸǁƺȀƶȅǙǥǛǡǎǏ", (byte)110, 66);
               ZKM_STR_B[24] = NLoginCore_092.A("ƴǂƦƪƧƳǇǊƫƝǞƷǒǓƪǖǄǙƞƹǁǇǥƝƧǧǘǘǆǣǯǲǈǓǀƴǢƱǆǆǲƺǬǚǶǽƿǋǤƼǻǃǑǧǪǇȀǙȈǯǱǨȉǾ", (byte)110, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_433.E("մ՜՝ե֙\u0590֡շն֩֩ֈ֚֩֡֠թ֞֏ֈ֢րսվ", (byte)110, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.F("ՠ֞֞չ֣֨֜դ֭֞֊֘֎֬սջսճִֶ֒֩սվ", (byte)110, 70);
         }
      }
   }

   @Override
   public int a() {
      return this.ordinal();
   }

   @Generated
   @Override
   public String toString() {
      return a(a & b, d) + this.name() + a(e, f ^ g) + this.b + a(h & i, j);
   }

   @Generated
   private NLoginCore_251(NLoginCore_474 var3) {
      this.b = var3;
   }

   private NLoginCore_251(String... var3) {
      this.b = NLoginCore_474.a(var3);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_251.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.E("\u0558պռ՜ր֭֟֗֙ը֦֪֤֜խֱֳִ֒֫֫ր", (byte)116, 69), NLoginCore_251.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_027.B("ǊǗǖƙǙǕǐǙǤǓƠǞǢǛǞǤƦԾՂԢԛՅԲՄՂԹƻ", (byte)116, 66) + var1 + NLoginCore_530.D("Ջ", (byte)116, 68) + var2.toString(), var4);
      }
   }

   @Override
   public NLoginCore_208 a() {
      throw new UnsupportedOperationException();
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(y, z ^ aa);
      int var10003 = ab;
      String[] var10004 = new String[ac];
      var10004[ad] = a(ae & af, ag);
      a = new NLoginCore_251(var10004);
      var10002 = a(ah, ai ^ aj);
      var10003 = ak;
      var10004 = new String[al];
      var10004[am] = a(an, ao);
      b = new NLoginCore_251(var10004);
      var10002 = a(ap, aq ^ ar);
      var10003 = as;
      var10004 = new String[at];
      var10004[au] = a(av, aw ^ ax);
      c = new NLoginCore_251(var10004);
      var10002 = a(ay & az, ba);
      var10003 = bb;
      var10004 = new String[bc];
      var10004[bd] = a(be, bf);
      d = new NLoginCore_251(var10004);
      var10002 = a(bg, bh ^ bi);
      var10003 = bj;
      var10004 = new String[bk];
      var10004[bl] = a(bm & bn, bo);
      e = new NLoginCore_251(var10004);
      var10002 = a(bp, bq ^ br);
      var10003 = bs;
      var10004 = new String[bt];
      var10004[bu] = a(bv & bw, bx);
      f = new NLoginCore_251(var10004);
      var10002 = a(by, bz);
      var10003 = ca;
      var10004 = new String[cb];
      var10004[cc] = a(cd, ce ^ cf);
      g = new NLoginCore_251(var10004);
      var10002 = a(cg & ch, ci);
      var10003 = cj;
      var10004 = new String[ck];
      var10004[cl] = a(cm, cn);
      h = new NLoginCore_251(var10004);
      var10002 = a(co, cp ^ cq);
      var10003 = cr;
      var10004 = new String[cs];
      var10004[ct] = a(cu, cv ^ cw);
      i = new NLoginCore_251(var10004);
      var10002 = a(cx, cy ^ cz);
      var10003 = da;
      var10004 = new String[db];
      var10004[dc] = a(dd & de, df);
      j = new NLoginCore_251(var10004);
      var10002 = a(dg, dh ^ di);
      var10003 = dj;
      var10004 = new String[dk];
      var10004[dl] = a(dm, dn);
      k = new NLoginCore_251(var10004);
   }

   @Override
   public NLoginCore_474 a() {
      return this.b;
   }

   @Override
   public Object a() {
      throw new UnsupportedOperationException();
   }
}
