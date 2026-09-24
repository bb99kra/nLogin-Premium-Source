package com.nickuc.login;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_561 {
   private static int cp = (19922944 >>> 244 | 19922944 << ~244 + 1) & -1;
   private static int by = 112 >>> 67 | 112 << -67;
   private static long p = Long.reverse(-8732337413803153704L);
   private static int cf = 4 >>> 190 | 4 << -190;
   private static long at = Long.reverse(-8502796096475496448L);
   private static int k = 0 >>> 226 | 0 << ~226 + 1;
   private static long cr = Long.reverse(-8502796096475496448L);
   private static int cs = (0 >>> 173 | 0 << ~173 + 1) & -1;
   private static long av = Long.reverse(923380187279189720L);
   private static long as = Long.reverse(-8732337413803153704L);
   private static int ak = Integer.reverse(-1073741824);
   private static int j = 0 >>> 56 | 0 << ~56 + 1;
   private static long z = Long.reverse(923380187279189720L);
   private static int ab = 0 >>> 214 | 0 << ~214 + 1;
   private static int ct = (0 >>> 217 | 0 << -217) & -1;
   private static int a = 0 >>> 190 | 0 << -190;
   private static int s = (0 >>> 20 | 0 << -20) & -1;
   private static long d = Long.reverse(-8502796096475496448L);
   private static int i = 524288 >>> 210 | 524288 << ~210 + 1;
   private static long cx = Long.reverse(-8732337413803153704L);
   private static int cu = Integer.reverse(0);
   private static long bl = Long.reverse(-8502796096475496448L);
   private static int cm = Integer.reverse(-1);
   private static long cj = Long.reverse(-8732337413803153704L);
   private static int bh = Integer.reverse(-1);
   private static long bw = Long.reverse(-8502796096475496448L);
   private static long cn = Long.reverse(923380187279189720L);
   private static int ah = Integer.reverse(1610612736);
   private static int af = Integer.reverse(0);
   private static int cz = Integer.reverse(-1476395008);
   private static long ay = Long.reverse(-8732337413803153704L);
   private static int br = 67108864 >>> 25 | 67108864 << ~25 + 1;
   private static long ai = Long.reverse(-8732337413803153704L);
   private static int n = 4 >>> 194 | 4 << ~194 + 1;
   private static long ck = Long.reverse(-8502796096475496448L);
   private static int bt = 8 >>> 3 | 8 << ~3 + 1;
   private static long ca = Long.reverse(-8502796096475496448L);
   private static int t = Integer.reverse(512);
   private static int ad = (-1 >>> 217 | -1 << ~217 + 1) & -1;
   private static int x = Integer.reverse(512);
   private static long cy = Long.reverse(-8502796096475496448L);
   private static String[] a = new String[cz];
   private static int e = (0 >>> 104 | 0 << -104) & -1;
   private static int bo = 0 >>> 151 | 0 << ~151 + 1;
   private static int co = Integer.reverse(0);
   private static long h = Long.reverse(-8502796096475496448L);
   private static int cd = (-1073741821 >>> 126 | -1073741821 << ~126 + 1) & -1;
   private static long ch = Long.reverse(-8502796096475496448L);
   private static int ac = Integer.reverse(-1610612736);
   private static int cv = Integer.reverse(0);
   private static long bk = Long.reverse(-8732337413803153704L);
   private static int ba = (128 >>> 155 | 128 << -155) & -1;
   private static int w = (0 >>> 202 | 0 << ~202 + 1) & -1;
   private static long g = Long.reverse(-8732337413803153704L);
   private static long cq = Long.reverse(-8732337413803153704L);
   private static int am = 0 >>> 248 | 0 << ~248 + 1;
   private static int be = (33554432 >>> 249 | 33554432 << -249) & -1;
   private static long bd = Long.reverse(-8502796096475496448L);
   private static int cc = 0 >>> 33 | 0 << -33;
   private static String[] b = new String[NLoginCore_561.da];
   private static int bn = Integer.reverse(0);
   private static int cl = Integer.reverse(1207959552);
   private static int ax = Integer.reverse(-1879048192);
   private static int aw = Integer.reverse(0);
   private static int bg = 46137344 >>> 182 | 46137344 << ~182 + 1;
   private static int ap = Integer.reverse(1073741824);
   private static int bf = 536870912 >>> 28 | 536870912 << -28;
   private static int u = 192 >>> 70 | 192 << -70;
   private static long bi = Long.reverse(923380187279189720L);
   private static long bc = Long.reverse(-8732337413803153704L);
   private static int bj = 192 >>> 100 | 192 << -100;
   private static int ao = (0 >>> 214 | 0 << ~214 + 1) & -1;
   private static long b = Long.reverse(-8732337413803153704L);
   private static long cg = Long.reverse(-8732337413803153704L);
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int bs = 0 >>> 25 | 0 << -25;
   private static int an = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = Integer.reverse(-1342177280);
   private static int bq = Integer.reverse(0);
   private static int ag = (0 >>> 207 | 0 << -207) & -1;
   private static long aj = Long.reverse(-8502796096475496448L);
   private static int bb = Integer.reverse(1342177280);
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int ci = 34 >>> 129 | 34 << ~129 + 1;
   private static long ae = Long.reverse(923380187279189720L);
   private static int al = 0 >>> 74 | 0 << ~74 + 1;
   private static long ce = Long.reverse(923380187279189720L);
   private static long bv = Long.reverse(-8732337413803153704L);
   private static int bm = Integer.reverse(-1073741824);
   private static int au = 16384 >>> 107 | 16384 << -107;
   private static long az = Long.reverse(-8502796096475496448L);
   private static int bx = Integer.reverse(1073741824);
   private static int o = Integer.reverse(1073741824);
   private static long bz = Long.reverse(-8732337413803153704L);
   private static int cw = Integer.reverse(671088640);
   private static int da = (21504 >>> 10 | 21504 << -10) & -1;
   private static int aq = 0 >>> 44 | 0 << ~44 + 1;
   private static long v = Long.reverse(923380187279189720L);
   private static int m = (0 >>> 152 | 0 << -152) & -1;
   private static long q = Long.reverse(-8502796096475496448L);
   private static long c;
   private static int aa = 0 >>> 202 | 0 << ~202 + 1;
   private static int cb = (0 >>> 155 | 0 << ~155 + 1) & -1;
   private static int r = Integer.reverse(0);
   private static int y = 8388608 >>> 21 | 8388608 << ~21 + 1;
   private static int ar = 917504 >>> 209 | 917504 << ~209 + 1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);

   private static void b() {
      c = 1974572159233756001L;
      long var0 = c ^ 884164494700651051L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(43 + 26),
               (byte)(12 + 71),
               (byte)(4 + 43),
               (byte)(60 + 7),
               (byte)(28 + 38),
               (byte)(57 + 10),
               (byte)(18 + 29),
               (byte)(55 + 25),
               (byte)(22 + 53),
               (byte)(59 + 8),
               (byte)(70 + 13),
               (byte)(42 + 11),
               (byte)(36 + 44),
               (byte)(49 + 48),
               (byte)(79 + 21),
               (byte)(64 + 36),
               (byte)(40 + 65),
               (byte)(105 + 5),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_397.D("ՂԷՀՠՂ՝ԯճլխԱՉՐՇԸը՝ԳժէՓՓԸԵԿճհջֈեքՖքւ՝զ՝րձ։՟Օծ՛", (byte)106, 68);
               b[1] = NLoginCore_559.D("ԥԬԮդՠՅՇըՈզնՓՄՌԬթԶի՞Ո\u0557ՙՆՇ", (byte)106, 68);
               b[2] = NLoginCore_232.F("յ֜ժ֓֍՚ճ֞ցջրշո֬֩պ\u058b֥է֡եռչպ", (byte)106, 70);
               b[3] = NLoginCore_201.C("է՞ԭԭԦ՚իղծՖԱՅծՋՅ՜թ\u0558Փ\u0557յչժղՍ\u0558ճՔըջյ՛՝փիըՏՍգա֎եՑ՛", (byte)106, 67);
               b[4] = NLoginCore_575.F("֓Ւխ֣֗֒ծբ֒֨֊֞ց\u058cդէց֑֭ըթզիִճձֱֵָֻ֥֕շִֻ֕ս֠֍ֽօ֖֥֎", (byte)106, 70);
               b[5] = NLoginCore_173.E("։\u058bՠ֜ղն֙կ֜մթ֛ւի֧ռ֮֏վ֣֫֫ֈմ։֬֏֏ְֹ֣֨", (byte)106, 69);
               b[6] = NLoginCore_110.C("ՃԶՠՍկՠՏհհՎՕԳՕՎձՑդժԹղԺԹԸխշւօզա։ՀըքջՙսՎՋջ֏՝ճօևթշժ֔ժիհտռչզէ", (byte)106, 67);
               b[7] = NLoginCore_223.E(
                  "\u0557֊֊֛֡֘դ֥֛֡֨֙ն՞֢֚սջհֈ֍։֍ծְֳճւֻջ֔\u058bֲ־ֵֶֻ֑֢֕֡֞ջֺׁ֣֦֚֜\u058bְ\u0590\u0590\u05ce֎\u05ccִב֡֨֬\u05caׅן\u05ccוְל֢חׂ֮֮ףִׂל\u05ec\u05cdֶ֡\u05eeֿס\u05c8ײֹֺ",
                  (byte)106,
                  69
               );
               b[8] = NLoginCore_076.D("Լ՚ՇՆԩգՁբՀԳՀՖլՑնէՎյնՌԺչիՋՄՔՅշՖՁՙզվՊ֏ջխՑծխՍ֖զէ֖֒պ֊֊ղՖ֞\u0557֢֓ՙծբ՜տց֙բըչ֦\u058cշֱտռթ֍֎յջ", (byte)106, 68);
               b[9] = NLoginCore_027.A("ƆƮƞƾǌƫǎƯƐƱǔƛ", (byte)106, 65);
               b[10] = NLoginCore_223.E("։\u058bՠ֜ղն֙կ֜մ՟ն֦֓֞֙րֈռքֱ։կֲ֥շ։մ֥֪նֻ֏չսցֺփվ׆֨ք֑֎", (byte)106, 69);
               b[11] = NLoginCore_201.D("ՂթԷՠ՚ԧՀիՎՈՍՄՅչնՇ\u0558ղԴծԲՉՆՇ", (byte)106, 68);
               b[12] = NLoginCore_223.F("\u058b\u0557հ֔՜֕֓֏փււթոը֟ՠա֥֜\u058cև֮֟֟\u058c\u058cի֦֥չֹ֔ձַׇֺֻׂ֛֫֗֡֡ք֨׃ֈֽևְֲֳֽׁׂׅ֡֓֔\u05c9֦֚֒\u0590", (byte)106, 70);
               b[13] = NLoginCore_141.F("յ֜ժ֓֍՚ճ֞ցջրշո֬֩պ\u058b֥է֡եռչպ", (byte)106, 70);
               b[14] = NLoginCore_201.F("։\u058bՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ\u058bսվְֵׂ֖֕֞ս֛֩֎", (byte)106, 70);
               b[15] = NLoginCore_110.F("֘֗֏լձ\u058c՝֧ֈւ֖֔տ֘՟֡կ֝ցօ֖֯֔կ֖ճւոո֗ճմֱֳ֔\u058cֽ֍֎׆֖־ָ֧֧֣֚֙֜։׆א֍֏ֵַ֥֔֨׆ָ֪א֫לֱֿף֫חׁיהסׅ֮", (byte)106, 70);
               b[16] = NLoginCore_232.B("ƃƬƬƏǇƼǉƝƟƨƶƛ", (byte)106, 66);
               b[17] = NLoginCore_553.C("ՉժծԫձԾԱԬԯՂՓձՍԹՐԶԻզՌԾԼչծհդւրՓզ֊ՊցՈՃ֍\u0558ՉչծՌհկժՒբոֈ՚Օ֏ձպճ֖֡\u0590դաա֘֕֔օ֩֗տցց\u0590ս֠\u058c֤֟֨ջ", (byte)106, 67);
               b[18] = NLoginCore_127.B("ƃƬƬƏǇƼǉƝƟƨƶƛ", (byte)106, 66);
               b[19] = NLoginCore_232.F("։\u058bՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ\u058bֿ\u058cտָ֥֚շտցׇֈ֎", (byte)106, 70);
               b[20] = NLoginCore_076.F("ՙցձ֑֟վ֡ւգք֧ծ", (byte)106, 70);
               break;
            case 1:
               b[0] = NLoginCore_241.E("յժճ֓յ\u0590բ֦֟֠դռփպի֛\u0590զ֚֝ֆֆիըղַֻ֦֣֮֘։ֱֲ֪֖֭֝փֻׂ֥֙֎", (byte)106, 69);
               b[1] = NLoginCore_553.D("ԥԬԮդՠՅՇըՈզյԳոլՈՏկՈՕԷ՝ՙՆՇ", (byte)106, 68);
               b[2] = NLoginCore_076.D("ՂթԷՠ՚ԧՀիՎՈՍոԸ՚Էծժ\u0558ՇհծկՆՇ", (byte)106, 68);
               b[3] = NLoginCore_530.D("է՞ԭԭԦ՚իղծՖԱՅծՋՅ՜թ\u0558Փ\u0557յչժղՍ\u0558ճՔըջյ՛իՕքչհ՝խբկ֖ղ՛", (byte)106, 68);
               b[4] = NLoginCore_324.D("ՠԟԺդ՟հԻԯ՟յ\u0557իՎՙԱԴՎպ՞ԵԶԳԸցՀԾօբվֈղւժյաֆՍ՟ֆ֔գհր՛", (byte)106, 68);
               b[5] = NLoginCore_110.F("։\u058bՠ֜ղն֙կ֜մթ֛ւի֧ռ֮֏վ֣֮֫օ֬ճմ֚օְּ֏ֈ֗֊ոտ֫քֽ֮֞׆׃֎", (byte)106, 70);
               b[6] = NLoginCore_575.B("ƣƖǀƭǏǀƯǐǐƮƵƓƵƮǑƱǄǊƙǒƚƙƘǍǗǢǥǆǁǩƠǈǤǛƹǝƮƫǛǯƽǓǥǧǇǖǥǬǕǥƵǉȀǒǹȂǰǸȄǗǓȆǤǈ", (byte)106, 66);
               b[7] = NLoginCore_127.A("ƄƷƷǈǎǅƑǎǒǕǈǆƣƋǏǇƪƨƝƵƺƶƺƛǠǝƠƯǨƨǁƸǟǫǢǣǂǎǋƾǨǏƨǉǮǐǓǧǇƸǝƽƽǻƻǹǡǾǎǕǙǷǲȌǹȂǝȉǏȄǛǛǯȐǡǩǲǳǯȌǭǦǰȠǚȟǦǧ", (byte)106, 65);
               b[8] = NLoginCore_223.A("ƜƺƧƦƉǃơǂƠƓƠƶǌƱǖǇƮǕǖƬƚǙǋƫƤƴƥǗƶơƹǆǞƪǯǛǍƱǎǍƭǶǆǇǶǲǚǪǪǒƶǾƷǳȂƹǎǂƼǟǡǹǂǈǦǬȈǥǆǠǟǥǎǟǮǛ", (byte)106, 65);
               b[9] = NLoginCore_559.F("սֈհհ֜յ֥֏՟ըՠծ", (byte)106, 70);
               b[10] = NLoginCore_127.D("Ֆ\u0558ԭթԿՃզԼթՁԬՃՠիզճՍՕՉՑվՖԼտղՄՖՁղշՃֈՌպ֏չՙզ֎դդևՍ֖թՓչշն֜՛վպթզէ", (byte)106, 68);
               b[11] = NLoginCore_559.C("ՂթԷՠ՚ԧՀիՎՈՊ՟ժեՕ\u0557յ՜\u0530կ՚ՉՆՇ", (byte)106, 67);
               b[12] = NLoginCore_384.E("\u058b\u0557հ֔՜֕֓֏փււթոը֟ՠա֥֜\u058cև֮֟֟\u058c\u058cի֦֥չֹ֔ձַׇֺֻׂ֛֫֗֡֡ք֨׃ֈֽևְֲֽׂאև\u05c9\u05ccְׇ֖֖֚כ\u05c9", (byte)106, 69);
               b[13] = NLoginCore_091.C("ՂթԷՠ՚ԧՀիՎՈՌզթթՎՓմջԷտՕկՆՇ", (byte)106, 67);
               b[14] = NLoginCore_110.D("Ֆ\u0558ԭթԿՃզԼթՁԶՅՂղթԵՈխձԿՕՌԽՔ\u0557յՕՆ՜Օք\u0558Շվ՚ո։վՍՠ՟Շվ֓Ֆւ\u0590\u0590֚իճմշչզէ", (byte)106, 68);
               b[15] = NLoginCore_530.E("֘֗֏լձ\u058c՝֧ֈւ֖֔տ֘՟֡կ֝ցօ֖֯֔կ֖ճւոո֗ճմֱֳ֔\u058cֽ֍֎׆֖־ָ֧֧֣֚֙֜։׆א֍֏ֵַ֥֔֨׆ָ֪א֫כְ֙יֶהם־֝ק֟נַתת֥֩טמװגעֹֺ", (byte)106, 69);
               b[16] = NLoginCore_004.C("ԧՆԥ՚՜ՃՎԱճ՞ՖԻ", (byte)106, 67);
               b[17] = NLoginCore_110.E(
                  "ռ֝֡՞֤ձդ՟բյֆ֤րլփթծ֙տձկֳֵ֣֬֡֗ֆֽ֙սִջն׀\u058bռ֬֡տ֣֢֝օֻ֕֫֍ֈׂ֤֦֭ה\u05c9׃֗֔֔\u05cb\u05c8ׇָלוֽ֝ם׃ֱ־טג֧֟ך֪\u05caּ֫\u05ceױ֯\u05c8ֹֺֻּ", (byte)106, 69
               );
               b[18] = NLoginCore_530.F("ֈ\u0590՛վՙցվբն՟ՠծ", (byte)106, 70);
               b[19] = NLoginCore_521.E("։\u058bՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ\u058b֏֨\u058bֻׁ֣֗֘׆ֶׇ\u05c9ֵׇ֭օַևג֯֎ׂ֚֙", (byte)106, 69);
               b[20] = NLoginCore_324.A("ƃƆƸƙƞƫƯǆǓƿǐƛ", (byte)106, 65);
               break;
            case 2:
               b[0] = NLoginCore_141.E("֗՜֒\u058c\u058c֑֠օ֗ւ֟ծ", (byte)106, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.C("ՂիկՙթԣՁԼՁըՃաա\u0557եԲՐծՆՠՍՉՆՇ", (byte)106, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 81L;
      var1 ^= 884164494700651051L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(58 + 10),
                     (byte)(35 + 34),
                     (byte)(73 + 10),
                     (byte)(20 + 27),
                     (byte)(37 + 30),
                     (byte)(22 + 44),
                     (byte)(8 + 59),
                     (byte)(41 + 6),
                     (byte)(23 + 57),
                     (byte)(49 + 26),
                     (byte)(60 + 7),
                     (byte)(75 + 8),
                     53,
                     (byte)(65 + 15),
                     (byte)(89 + 8),
                     (byte)(59 + 41),
                     (byte)(53 + 47),
                     (byte)(33 + 72),
                     (byte)(12 + 98),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.D("ӛӨӧҪӪӦӡӪӵӤұӯӳӬӯӵҷࡏࡁࡋࡃࡂࡑ࠵ࡊࡂ࠵ࡖࡅ\u085c", (byte)65, 68));
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static NLoginCore_300 a(NLoginCore_459 var0) {
      NLoginCore_365 var1 = var0.a();
      boolean var28 = false /* VF: Semaphore variable */;

      NLoginCore_300 var55;
      label399: {
         Object var57;
         label400: {
            Object var13;
            label401: {
               try {
                  label409: {
                     var28 = true;
                     Connection var2 = var1.b();
                     KeyPair var3 = null;

                     try {
                        String var10001 = a(a, b ^ d) + NLoginCore_477.t.a(new Object[e]) + a(f, g ^ h);
                        Object[] var10002 = new Object[i];
                        var10002[j] = NLoginCore_477.u.a(new Object[k]);
                        var10002[l] = NLoginCore_477.r.a(new Object[m]);
                        PreparedStatement var4 = var2.prepareStatement(String.format(var10001, var10002));

                        try {
                           var4.setString(n, a(o, p ^ q));
                           ResultSet var56 = var4.executeQuery();
                           boolean var41 = false /* VF: Semaphore variable */;

                           try {
                              var41 = true;
                              if (var56.next()) {
                                 DataInputStream var6 = new DataInputStream(new ByteArrayInputStream(var56.getBytes(NLoginCore_477.u.a(new Object[r]))));
                                 if (var6.available() > 0) {
                                    int var7 = Math.max(var6.readInt(), s);
                                    if (var7 > t) {
                                       throw new IllegalArgumentException(a(u, v) + var7);
                                    }

                                    byte[] var8 = new byte[var7];
                                    var6.readFully(var8);
                                    int var9 = Math.max(var6.readInt(), w);
                                    if (var9 > x) {
                                       throw new IllegalArgumentException(a(y, z) + var7);
                                    }

                                    byte[] var10 = new byte[var9];
                                    var6.readFully(var10);
                                    var3 = a(var8, var10);
                                    var41 = false;
                                 } else {
                                    var41 = false;
                                 }
                              } else {
                                 var41 = false;
                              }
                           } finally {
                              if (var41) {
                                 if (Collections.singletonList(var56).get(ab) != null) {
                                    var56.close();
                                 }
                              }
                           }

                           if (Collections.singletonList(var56).get(aa) != null) {
                              var56.close();
                           }
                        } catch (Throwable var48) {
                           if (var4 != null) {
                              try {
                                 var4.close();
                              } catch (Throwable var44) {
                                 var48.addSuppressed(var44);
                              }
                           }

                           throw var48;
                        }

                        if (var4 != null) {
                           var4.close();
                        }
                     } catch (Exception var52) {
                        NLoginCore_370.c(a(ac & ad, ae), var52);
                        var57 = null;
                        var28 = false;
                        break label409;
                     }

                     if (var3 == null) {
                        try {
                           String var75 = a(ah, ai ^ aj);
                           Object[] var77 = new Object[ak];
                           var77[al] = NLoginCore_477.r.a(new Object[am]);
                           var77[an] = NLoginCore_477.u.a(new Object[ao]);
                           var77[ap] = NLoginCore_477.t.a(new Object[aq]);
                           PreparedStatement var54 = var2.prepareStatement(String.format(var75, var77));

                           label381: {
                              try {
                                 label407: {
                                    ByteArrayOutputStream var58 = new ByteArrayOutputStream();
                                    DataOutputStream var59 = new DataOutputStream(var58);
                                    NLoginCore_270 var60 = new NLoginCore_270();
                                    NLoginCore_370.e(NLoginCore_150.j() ? a(ar, as ^ at) : a(au, av));

                                    try {
                                       KeyPairGenerator var61 = KeyPairGenerator.getInstance(a(ax, ay ^ az));
                                       var61.initialize(ba);
                                       var3 = var61.generateKeyPair();
                                    } catch (Exception var45) {
                                       throw new RuntimeException(a(bb, bc ^ bd), var45);
                                    }

                                    byte[] var62 = var3.getPublic().getEncoded();
                                    var59.writeInt(var62.length);
                                    var59.write(var62);
                                    byte[] var63 = var3.getPrivate().getEncoded();
                                    var59.writeInt(var63.length);
                                    var59.write(var63);
                                    byte[] var64 = var58.toByteArray();
                                    var54.setBytes(be, var64);
                                    var54.setString(bf, a(bg & bh, bi));
                                    int var11 = var54.executeUpdate();
                                    if (var11 == 0) {
                                       try {
                                          var75 = a(bj, bk ^ bl);
                                          var77 = new Object[bm];
                                          var77[bn] = NLoginCore_477.r.a(new Object[bo]);
                                          var77[bp] = NLoginCore_477.t.a(new Object[bq]);
                                          var77[br] = NLoginCore_477.u.a(new Object[bs]);
                                          PreparedStatement var12 = var2.prepareStatement(String.format(var75, var77));

                                          try {
                                             var12.setString(bt, a(bu, bv ^ bw));
                                             var12.setBytes(bx, var64);
                                             var12.execute();
                                          } catch (Throwable var46) {
                                             if (var12 != null) {
                                                try {
                                                   var12.close();
                                                } catch (Throwable var43) {
                                                   var46.addSuppressed(var43);
                                                }
                                             }

                                             throw var46;
                                          }

                                          if (var12 != null) {
                                             var12.close();
                                          }
                                       } catch (Exception var49) {
                                          NLoginCore_370.c(a(by, bz ^ ca), var49);
                                          var13 = null;
                                          break label407;
                                       }
                                    }

                                    NLoginCore_370.e(
                                       NLoginCore_150.j()
                                          ? a(cd, ce) + var60.aq() + a(cf, cg ^ ch)
                                          : a(ci, cj ^ ck) + var60.aq() + a(cl & cm, cn)
                                    );
                                    break label381;
                                 }
                              } catch (Throwable var50) {
                                 if (var54 != null) {
                                    try {
                                       var54.close();
                                    } catch (Throwable var42) {
                                       var50.addSuppressed(var42);
                                    }
                                 }

                                 throw var50;
                              }

                              if (var54 != null) {
                                 var54.close();
                                 var28 = false;
                              } else {
                                 var28 = false;
                              }
                              break label401;
                           }

                           if (var54 != null) {
                              var54.close();
                           }
                        } catch (Exception var51) {
                           NLoginCore_370.c(a(cp, cq ^ cr), var51);
                           var57 = null;
                           var28 = false;
                           break label400;
                        }
                     }

                     var55 = new NLoginCore_300(var3, null);
                     var28 = false;
                     break label399;
                  }
               } finally {
                  if (var28) {
                     if (Collections.singletonList(var1).get(cv) != null) {
                        var1.close();
                     }
                  }
               }

               if (Collections.singletonList(var1).get(ag) != null) {
                  var1.close();
               }

               return (NLoginCore_300)var57;
            }

            if (Collections.singletonList(var1).get(cc) != null) {
               var1.close();
            }

            return (NLoginCore_300)var13;
         }

         if (Collections.singletonList(var1).get(ct) != null) {
            var1.close();
         }

         return (NLoginCore_300)var57;
      }

      if (Collections.singletonList(var1).get(cu) != null) {
         var1.close();
      }

      return var55;
   }

   private static KeyPair a(byte[] var0, byte[] var1) {
      KeyFactory var2 = KeyFactory.getInstance(a(cw, cx ^ cy));
      X509EncodedKeySpec var3 = new X509EncodedKeySpec(var0);
      PublicKey var4 = var2.generatePublic(var3);
      PKCS8EncodedKeySpec var5 = new PKCS8EncodedKeySpec(var1);
      PrivateKey var6 = var2.generatePrivate(var5);
      return new KeyPair(var4, var6);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_561.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.F("ӭԏԑӱԕԴԬՂԮӽԻԱԿԹԂԧՉՈՀՆՀԕ", (byte)9, 70), NLoginCore_561.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_575.E("ԨԵԴӷԷԳԮԷՂԱӾԼՀԹԼՂԄ࢜ࢎ࢘\u0890\u088f࢞ࢂ\u0897\u088fࢂࢣ\u0892ࢩԝ", (byte)9, 69) + var1 + NLoginCore_091.C("Њ", (byte)9, 67) + var2.toString(),
            var4
         );
      }
   }

   static {
      b();
   }
}
