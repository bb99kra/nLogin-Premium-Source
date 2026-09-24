package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.api.enums.event.EventEnum;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginType_005 {
   private static int ak = 0 >>> 55 | 0 << -55;
   private static long bb = Long.reverse(3458764513820540928L);
   private static int var_do = 0 >>> 177 | 0 << -177;
   private static int cp = (0 >>> 73 | 0 << ~73 + 1) & -1;
   private static long bv = Long.reverse(3458764513820540928L);
   private static int dg = Integer.reverse(2013265920);
   private static int x = Integer.reverse(-1);
   private static int dv = Integer.reverse(1140850688);
   private static int j = Integer.reverse(0);
   private static long y = Long.reverse(-7561636707772579871L);
   private static int cd = 0 >>> 8 | 0 << ~8 + 1;
   private static int u = 0 >>> 218 | 0 << -218;
   private static int bi = -1073741823 >>> 157 | -1073741823 << ~157 + 1;
   private static long am = Long.reverse(-7561636707772579871L);
   private static String[] b = new String[NLoginType_005.eb];
   private static int bc = 0 >>> 246 | 0 << -246;
   private static int az = Integer.reverse(805306368);
   private static int cx = Integer.reverse(-671088640);
   private static int bs = (0 >>> 123 | 0 << ~123 + 1) & -1;
   private static int dm = (-1 >>> 162 | -1 << ~162 + 1) & -1;
   private static long dj = Long.reverse(-6408715203165732895L);
   private static int be = Integer.reverse(0);
   private static long ax = Long.reverse(-7561636707772579871L);
   private static long ap = Long.reverse(-7561636707772579871L);
   private static long cw = Long.reverse(-7561636707772579871L);
   private static int cn = -1 >>> 40 | -1 << ~40 + 1;
   private static int ac = Integer.reverse(536870912);
   private final NLoginType_015 a;
   private static int z = Integer.reverse(-1073741824);
   private static int dz = Integer.reverse(0);
   private static int ay = Integer.reverse(0);
   private static int ce = Integer.reverse(-1476395008);
   private static long df = Long.reverse(-7561636707772579871L);
   private static int ct = (0 >>> 252 | 0 << -252) & -1;
   private static int dr = 4 >>> 130 | 4 << ~130 + 1;
   private static int ah = Integer.reverse(1610612736);
   private static int bk = 2013265920 >>> 251 | 2013265920 << ~251 + 1;
   private static int bn = (8 >>> 127 | 8 << -127) & -1;
   private static long cr = Long.reverse(-6408715203165732895L);
   private static int bp = Integer.reverse(0);
   private static int a = Integer.reverse(1073741824);
   private static long ai = Long.reverse(-6408715203165732895L);
   private static int de = 3712 >>> 231 | 3712 << ~231 + 1;
   private static int bf = Integer.reverse(-1342177280);
   private static int g = 67108864 >>> 57 | 67108864 << -57;
   private static int ao = Integer.reverse(-1);
   private static int dy = 0 >>> 122 | 0 << -122;
   private static int cv = Integer.reverse(-1);
   private static int e = 0 >>> 34 | 0 << ~34 + 1;
   private static long t = Long.reverse(-7561636707772579871L);
   private static int at = Integer.reverse(1342177280);
   private static int dt = 33 >>> 160 | 33 << -160;
   private static long ab = Long.reverse(3458764513820540928L);
   private static long cb = Long.reverse(3458764513820540928L);
   private static long bg = Long.reverse(-6408715203165732895L);
   private static int dd = 0 >>> 153 | 0 << -153;
   private static int q = 0 >>> 245 | 0 << ~245 + 1;
   private static long o = Long.reverse(-7561636707772579871L);
   private final NLoginCore_423 a;
   private static int bd = Integer.reverse(Integer.MIN_VALUE);
   private static long ca = Long.reverse(-6408715203165732895L);
   private static long dk = Long.reverse(3458764513820540928L);
   private static int d = Integer.reverse(0);
   private static int p = Integer.reverse(0);
   private static float m = Float.intBitsToFloat(134742016 >>> 221 | 134742016 << ~221 + 1);
   private static int af = Integer.reverse(-1610612736);
   private static long cy = Long.reverse(-6408715203165732895L);
   private static long co = Long.reverse(-7561636707772579871L);
   private static long bh = Long.reverse(3458764513820540928L);
   private static long bj = Long.reverse(-7561636707772579871L);
   private static long bl = Long.reverse(-6408715203165732895L);
   private static int r = (32 >>> 133 | 32 << ~133 + 1) & -1;
   private static int au = Integer.reverse(-1);
   private static int cq = Integer.reverse(-1744830464);
   private static long bm = Long.reverse(3458764513820540928L);
   private static int ck = Integer.reverse(-1);
   private static long cs = Long.reverse(3458764513820540928L);
   private static long ar = Long.reverse(-6408715203165732895L);
   private static float l = Float.intBitsToFloat(Integer.reverse(3714));
   private static int cm = (786432 >>> 79 | 786432 << -79) & -1;
   private static int ch = Integer.reverse(-1);
   private static int dq = (4096 >>> 44 | 4096 << ~44 + 1) & -1;
   private static long aj = Long.reverse(3458764513820540928L);
   private static int dp = Integer.reverse(0);
   private static long ae = Long.reverse(3458764513820540928L);
   private static String[] a = new String[NLoginType_005.ea];
   private static long av = Long.reverse(-7561636707772579871L);
   private static int aw = (22528 >>> 107 | 22528 << ~107 + 1) & -1;
   private static long ad = Long.reverse(-6408715203165732895L);
   private static long bo = Long.reverse(-7561636707772579871L);
   private static int bz = (655360 >>> 15 | 655360 << ~15 + 1) & -1;
   private static long aa = Long.reverse(-6408715203165732895L);
   private final NLoginType_001 a;
   private static int f = 0 >>> 129 | 0 << -129;
   private static int dc = 512 >>> 233 | 512 << -233;
   protected final NLoginType_008 c;
   private static long ba = Long.reverse(-6408715203165732895L);
   private static int h = Integer.reverse(0);
   private static int cu = (13312 >>> 169 | 13312 << -169) & -1;
   private static long dh = Long.reverse(-7561636707772579871L);
   private static int b = (0 >>> 52 | 0 << -52) & -1;
   private static int di = Integer.reverse(-134217728);
   private static int ds = Integer.reverse(Integer.MIN_VALUE);
   private static long cl = Long.reverse(-7561636707772579871L);
   private static int dl = Integer.reverse(67108864);
   private static long cf = Long.reverse(-7561636707772579871L);
   private static int bq = 285212672 >>> 216 | 285212672 << ~216 + 1;
   private static int s = -1 >>> 90 | -1 << -90;
   private static int cj = Integer.reverse(-402653184);
   private static long dn = Long.reverse(-7561636707772579871L);
   private static int da = Integer.reverse(939524096);
   private static int ea = (70 >>> 193 | 70 << -193) & -1;
   private static int an = Integer.reverse(268435456);
   private static long by = Long.reverse(-7561636707772579871L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int eb = Integer.reverse(-1006632960);
   private static int aq = (9437184 >>> 148 | 9437184 << -148) & -1;
   private static long ag = Long.reverse(-7561636707772579871L);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int cg = Integer.reverse(1744830464);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(0);
   private static long bu = Long.reverse(-6408715203165732895L);
   private static long br = Long.reverse(-7561636707772579871L);
   private static long ci = Long.reverse(-7561636707772579871L);
   private static int w = 128 >>> 198 | 128 << -198;
   private static int bw = 39845888 >>> 53 | 39845888 << -53;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long du = Long.reverse(-7561636707772579871L);
   private static long dx = Long.reverse(-7561636707772579871L);
   private static int cc = Integer.reverse(Integer.MIN_VALUE);
   private static long db = Long.reverse(-7561636707772579871L);
   private static long as = Long.reverse(3458764513820540928L);
   private static long cz = Long.reverse(3458764513820540928L);
   private static long c;
   private static int bx = Integer.reverse(-1);
   private static int bt = Integer.reverse(1207959552);
   private static int al = -2147483645 >>> 223 | -2147483645 << -223;
   private static int dw = Integer.reverse(-1);

   private static void b() {
      c = -8647873347044642587L;
      long var0 = c ^ 684892173901505248L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(6 + 63),
               83,
               (byte)(29 + 18),
               (byte)(7 + 60),
               (byte)(65 + 1),
               (byte)(66 + 1),
               47,
               (byte)(56 + 24),
               (byte)(27 + 48),
               (byte)(17 + 50),
               (byte)(35 + 48),
               (byte)(20 + 33),
               (byte)(31 + 49),
               (byte)(43 + 54),
               (byte)(39 + 61),
               (byte)(11 + 89),
               (byte)(40 + 65),
               (byte)(27 + 83),
               (byte)(50 + 53)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_559.D("ӐӒһӋҿңӑҔҩҖҺҟ", (byte)54, 68);
               b[1] = NLoginCore_127.D("ҠҿӂқҴҠҷӕҨҧҥҫҤӏһүӓҪӋүӤңҞҝӅӀӛҧәӮӈӮҨҿҨӀӍҿҬӤҰҶӍӐӪӽһӜӬәӿӎӰӲӽӻӚӄӉӫӬӷӺԈӞӣӏӬӫӾӪԎԉӦӮӟ", (byte)54, 68);
               b[2] = NLoginCore_453.A("ŕĽĲĴĤťťńĻĩŊĳ", (byte)54, 65);
               b[3] = NLoginCore_241.A("ŒőņŗĺŃķŇĤĶĪŘűŊŃňųŦŷŨŗőľĿ", (byte)54, 65);
               b[4] = NLoginCore_223.A("ĻŞŘŗłŤŦīũĶĥŘŌťĮůŔŲŞŖŸĳŊůĴŷŹžźžŰšŸŃŖŀŁűłŉŽŻŅœ", (byte)54, 65);
               b[5] = NLoginCore_092.F("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 70);
               b[6] = NLoginCore_451.B("ĖľĻıĴŗŨŪŘŃŜŃşňŠŭŵŪİŷŃūźŧĴŐœĺŐŗƁƁŜŒŷţŸņŉƈŊřŸœ", (byte)54, 66);
               b[7] = NLoginCore_433.C("҉ҐҋҦҟҶҫӎҩӐҬүҽҙҴӇҿҪҼҮӄӣҪҫ", (byte)54, 67);
               b[8] = NLoginCore_173.D("ҾҽҲӃҦүңҳҐҢҖӄӝҶүҴӟӒӣӔӃҽҪҫ", (byte)54, 68);
               b[9] = NLoginCore_559.C("҈ҊҠӄҵӔӓӗҥҤҺӓҲӝҾҟӍҭӚҽұҢңӡӢӊҿҦҹҩӫҽҧңӣөӀҳӆӍӓӢӂҿ", (byte)54, 67);
               b[10] = NLoginCore_324.F("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 70);
               b[11] = NLoginCore_241.D("҂ҪҧҝҠӃӔӖӄүӈүӋҴӌәӡӖҜӣүӘӥҥӖӅҲҿӛӝӦҮӧӏұӏӔҭӇӪӳӪӰҿ", (byte)54, 68);
               b[12] = NLoginCore_027.D("ҚҡҡғҒӔҷҏҥүҔҪҰӆӋқӑҷӜӀҼӣҪҫ", (byte)54, 68);
               b[13] = NLoginCore_575.A("ŒőņŗĺŃķŇĤĶĪŘűŊŃňųŦŷŨŗőľĿ", (byte)54, 65);
               b[14] = NLoginCore_453.D("ӉҟҲӒңңӔҿӉҷӊҦҎӕҫӑҟҬҽҫҽҭңҟӄҳҪӬҵӕӚүҿӬӳӈӁӭӋӪӈӳҷӔӖӲөӑҾӒӁҽӁӵӯԁӀӅԈԂӶӭӟӺ", (byte)54, 68);
               b[15] = NLoginCore_387.A("ŌİĵłŁļŘħŭŘńľůĿįŲŇŴĿŎŖŁľĿ", (byte)54, 65);
               b[16] = NLoginCore_004.B("ĭŜŘĤĵšŕœņņŚŜŅĺŋŧŐŖŖŮŅŷĶœŒťŭśŏŸŴűŹžţŷšşśŬłŽƎŋžřƌŏţũŷŎŖŋūŹżŰŗƞƕřƓž", (byte)54, 66);
               b[17] = NLoginCore_092.F("Ԧ՚Ԭ՞ՅՏՐխՄՕԵձՠՈՓՓԸը\u0557խձ\u0558ՅՆ", (byte)54, 70);
               b[18] = NLoginCore_127.B("ĚœŁŢĸĩţŧłŠīŪŚħĽĪŲŨŅŔĮŧľĿ", (byte)54, 66);
               b[19] = NLoginCore_241.B("ĠŝĴĳŀĲśĳşŪŜĺŠŦţńľįľŏĪŖŰĺŪļİśũŌĿĻųŤŽŇşŁŢŤŤūūŬōŠƓůūƀƊŦŠƗűœŸūųƖŒšƟƏ", (byte)54, 66);
               b[20] = NLoginCore_027.C(
                  "ҬӎҎӁҒҲӆӏҊӌҙӑҴӛӉӐҼӢӎҺәӥһӈӛөҠҡӤӌҺҷӪҹӂұҲұӐҴӷӑӳӧӼҴҰӧӓӳԀԂӒӯӡҽӝӁҼӚӄӻӣӮӎӯӄӨԍӱԖӣӣӒӮӭӗԇӲӜӳӓԋӰԔԢӯԃԢԤӶԜԖӭԩӾԢԅӫԨԧԔԁԦԖӫԎԌԯԘԱӱԞӷԌԬԤԔԄԠԥԚԼԃԝԅՂԗ",
                  (byte)54,
                  67
               );
               b[21] = NLoginCore_575.E("ՙ\u0558Ս՞ՁՊԾՎԫԽԱ՟ոՑՊՏպխվկ՞\u0558ՅՆ", (byte)54, 69);
               b[22] = NLoginCore_324.E("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ\u0558Ն\u0558ՈԾԺ՟ՎՅևՐհյՊ՜պշ՛բ֏ը֓՛թ\u0590մ֑֔\u058c՚և֜֝է֓ոեզ", (byte)54, 69);
               b[23] = NLoginCore_223.C("ҸҜҡҮҭҨӄғәӄҰҪӛҫқӞҳӠҫҺӂҭҪҫ", (byte)54, 67);
               b[24] = NLoginCore_324.E("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ\u0557՝՝յՌվԽ՚ՙլմբՖտջոՠ՚՝\u0557ոսկ֓էհթՐժճ֙\u0557զՎ֝ՔՕ։֛֑֢շ֎֏֑֪֝տ", (byte)54, 69);
               b[25] = NLoginCore_183.A("ķţŜşŇĠŝţłśĺŎŉŢĭŔĽũŅĩťŁľĿ", (byte)54, 65);
               b[26] = NLoginCore_201.D("҆ҿҭӎҤҕӏӓҮӌҗӖӆғҩҖӞӔұӀҚӓҪҫ", (byte)54, 68);
               b[27] = NLoginCore_530.B("ĠŝĴĳŀĲśĳşŪŝŋįűįĲŎŠĮĿŎĸĲŸŘĶųŲŋżŷŲřŰşţŽŘžŹŘŇŜƎźƄŲƏƄœňţƃŹŔŲƍƐŬŸŹűŝƗ", (byte)54, 66);
               b[28] = NLoginCore_559.B(
                  "ŀŢĢŕĦņŚţĞŠĭťňůŝŤŐŶŢŎŭŹŏŜůŽĴĵŸŠŎŋžōŖŅņŅŤňƋťƄŢũŪŒƇŦŧŮƕŏŶƐŖųśƉƖơŘżſƗƜŷƓŦžƠũƧŵŭƭƚƉſƊƌſƴƤƄƺŸƬƄƓƆƵƿųǃƸƻƘƙſƷǀǁǂƝƖƹƫƌƌƭƑƿƪƔƍƴǇƞƟ", (byte)54, 66
               );
               b[29] = NLoginCore_446.E("ՙ\u0558Ս՞ՁՊԾՎԫԽԱ՟ոՑՊՏպխվկ՞\u0558ՅՆ", (byte)54, 69);
               b[30] = NLoginCore_530.E("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ\u0558Ն\u0558ՈԾԺ՟ՎՅևՐհյՊ֊բ՚քՎըփհ\u058cօզըՠՐՓ֏ձ֝\u0558մ\u0557ըեզ", (byte)54, 69);
               b[31] = NLoginCore_241.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 69);
               b[32] = NLoginCore_397.E("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ\u0557՝՝յՌվԽ՚ՙլմբՖտջոժդ\u058c\u058b՟՞ՃՐձՊՌծեն֊\u058b֏ն֝Ք֟\u0558֚՟֍֡փ֞\u0590ՠթ֫", (byte)54, 69);
               b[33] = NLoginCore_091.A("ŃğŃġĤŦŜĶŠĸŀţřŚŤŋŤœŰŶĲŁľĿ", (byte)54, 65);
               b[34] = NLoginCore_241.D("ҥҨҌһҫӇҩӉӘҏғҩҽҩӋҚҼҘҝӑҸӓҪҫ", (byte)54, 68);
               break;
            case 1:
               b[0] = NLoginCore_127.B("ŠşĠņħŊūũľŝŬĳ", (byte)54, 66);
               b[1] = NLoginCore_575.A("ĴœŖįňĴŋũļĻĹĿĸţŏŃŧľşŃŸķĲıřŔůĻŭƂŜƂļœļŔšœŀŸńŊšŤžƑŏŰƀŭƓŢƄƆƑƏŮŘŝſƀƋƎƜƢƏƕƝźƅŜƝƭƢŭų", (byte)54, 65);
               b[2] = NLoginCore_138.F("ԧՔթդ\u0557թՆզԥզԧԬ՟ԵՖդՒղՍ՜ռծՅՆ", (byte)54, 70);
               b[3] = NLoginCore_092.B("ŒőņŗĺŃķŇĤĶīĥĨňĻŬŁňũŋĸŷľĿ", (byte)54, 66);
               b[4] = NLoginCore_076.A("ĻŞŘŗłŤŦīũĶĥŘŌťĮůŔŲŞŖŸĳŊůĴŷŹžźžŰšŽƁƃľňƆũŧŌũŸœ", (byte)54, 65);
               b[5] = NLoginCore_521.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՓՇՎՏՓիՉ՛՝րծՅՆ", (byte)54, 69);
               b[6] = NLoginCore_110.F("ԝՅՂԸԻ՞կձ՟ՊգՊզՏէմռձԷվՊղցծԻ\u0557՚Ձ\u0557՞ֈֈդչխիՉպ։զ֒՟Ռ՚", (byte)54, 70);
               b[7] = NLoginCore_076.C("҉ҐҋҦҟҶҫӎҩӐҫӔӈҦҐҘҰӖҿҷӁӓҪҫ", (byte)54, 67);
               b[8] = NLoginCore_027.C("ҾҽҲӃҦүңҳҐҢҘӗӍҴқӓӊҟҪңҲӣҪҫ", (byte)54, 67);
               b[9] = NLoginCore_141.F("ԣԥԻ՟ՐկծղՀԿՕծՍոՙԺըՈյ\u0558ՌԽԾռսե՚ՁՔՄֆ\u0558Ղշ՞վ՚Ն\u058c֍գ֒և՚", (byte)54, 70);
               b[10] = NLoginCore_232.E("ՓԷԼՉՈՃ՟Ԯմ՟Չղ\u0557ԴձճԴՋռՇլ\u0558ՅՆ", (byte)54, 69);
               b[11] = NLoginCore_223.F("ԝՅՂԸԻ՞կձ՟ՊգՊզՏէմռձԷվՊճրՀձՠՍ՚նոցՉ։ՆՉ֎ռռՇւվե\u058b՚", (byte)54, 70);
               b[12] = NLoginCore_091.A("ĮĵĵħĦŨŋģĹŃħůőŐŃŮōŐĭŨŨūŷŷŅŜŬŌŏŲŢŎ", (byte)54, 65);
               b[13] = NLoginCore_521.D("ҾҽҲӃҦүңҳҐҢҕҩӅӍҹӕҝҽһӄӞҭҪҫ", (byte)54, 68);
               b[14] = NLoginCore_553.F("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ\u0558Ն\u0558ՈԾԺ՟ՎՅևՐհյՊ՚և֎գ՜ֈզօգ֎Ւկձ֍քլՙխ՜\u0558՜֕ծՙբր֒և֜առ֙", (byte)54, 70);
               b[15] = NLoginCore_471.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՃ\u0530թՌՌպԷ՛թՕՈՅՆ", (byte)54, 69);
               b[16] = NLoginCore_241.D("ҙӈӄҐҡӍӁҿҲҲӆӈұҦҷӓҼӂӂӚұӣҢҿҾӑәӇһӤӠӝӥӪӏӣӍӋӇӘҮөӺҷӪӅӸһӏӕӣҺӂӄӧӓӽӛԂԆԆӉӼԆ", (byte)54, 68);
               b[17] = NLoginCore_471.F("Ԧ՚Ԭ՞ՅՏՐխՄՕԵշեՎոՏ՛ՇղջԽվՅՆ", (byte)54, 70);
               b[18] = NLoginCore_451.C("҆ҿҭӎҤҕӏӓҮӌҗӐҕҔҚҧҶҷҰӄӎҽҪҫ", (byte)54, 67);
               b[19] = NLoginCore_575.F("ԧդԻԺՇԹբԺզձգՁէխժՋՅԶՅՖԱ՝շՁձՃԷբհՓՆՂպիքՎզՈթիիղղճՔէ֚նղև֑խէ՛֛֚֚֒չ֥\u0590պգշ", (byte)54, 70);
               b[20] = NLoginCore_091.A(
                  "ŀŢĢŕĦņŚţĞŠĭťňůŝŤŐŶŢŎŭŹŏŜůŽĴĵŸŠŎŋžōŖŅņŅŤňƋťƇŻƐňńŻŧƇƔƖŦƃŵőűŕŐŮŘƏŷƂŢƃŘżơƅƪŷŷŦƂƁūƛƆŰƇŧƟƄƨƶƃƗƶƸƊưƪƁƽƒƶƙſƼƻƨƕƺƪſƢƠǃƬǅƅƲƋƠǀƸơǅǕƗƩƷǊƠƻƼƱǙǅǟƹǑǩǠƫǄǩǊƳ",
                  (byte)54,
                  65
               );
               b[21] = NLoginCore_173.F("ՙ\u0558Ս՞ՁՊԾՎԫԽ\u0530ՇՑԸշ\u0558չԻ՛ձ՜ՈՅՆ", (byte)54, 70);
               b[22] = NLoginCore_427.F("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ\u0558Ն\u0558ՈԾԺ՟ՎՅևՐհյՊ՜պշ՛բ֏ը֓՛թ\u0590զփ֑խՑ֎լո֝\u058bթ֛֑֖ղ֓֒քա֒շ", (byte)54, 70);
               b[23] = NLoginCore_141.A("ŌİĵłŁļŘħŭŘŃĮŌĩŒōűťŒŧŋőľĿ", (byte)54, 65);
               b[24] = NLoginCore_397.C("ҙӈӄҐҡӍӁҿҲҲӆӈұҦҷӓҼӂӂӚұӣҢҿҾӑәӇһӤӠӝӅҿӂҼӝӢӔӸӌӕӎҵӏӘӾҼӋҳԂҹҺӠӧԁӂӡӦӦԋӸӞӸ", (byte)54, 67);
               b[25] = NLoginCore_324.B("ķţŜşŇĠŝţłśĻŰĦĭıĽĲŋĲńŨŧľĿ", (byte)54, 66);
               b[26] = NLoginCore_453.C("҆ҿҭӎҤҕӏӓҮӌҕҍҼӖҭґӜҰҫӌҮӓҪҫ", (byte)54, 67);
               b[27] = NLoginCore_324.E("ԧդԻԺՇԹբԺզձդՒԶոԶԹՕէԵՆՕԿԹտ՟ԽպչՒփվչՠշզժք՟օր՟Վգ֕ց\u058bչ֖\u058b՚Տժ֊ցթ֟գ֘֒ցզ֖պն֗ռվր֜օջծ\u058bտմպ", (byte)54, 69);
               b[28] = NLoginCore_110.D(
                  "ҬӎҎӁҒҲӆӏҊӌҙӑҴӛӉӐҼӢӎҺәӥһӈӛөҠҡӤӌҺҷӪҹӂұҲұӐҴӷӑӰӎӕӖҾӳӒӓӚԁһӢӼӂӟӇӵԂԍӄӨӫԃԈӣӿӒӪԌӕԓӡәԙԆӵӫӶӸӫԠԐӰԦӤԘӰӿӲԡԫӟԯԤԧԄԅӫԣԬԭԮԉԂԧԒԇԦԘԚԵԾԒԴԺԻԆԆՇԚԨԥՉԍԦԺ",
                  (byte)54,
                  68
               );
               b[29] = NLoginCore_471.D("ҾҽҲӃҦүңҳҐҢҖһҺӊҿӇҲӎӓҴӞӓҪҫ", (byte)54, 68);
               b[30] = NLoginCore_110.B("ŝĳņŦķķŨœŝŋŞĺĢũĿťĳŀőĿőŁķĳŘŇľƀŉũŮŃƃśœŽŇšżũƅžŠŝƆŦńœűƁƍŒƌŭŮƖŕƞƒőƞƞƣƏ", (byte)54, 66);
               b[31] = NLoginCore_138.A("ŌİĵłŁļŘħŭŘŃĥĿłŅľŞĲņńŸŧľĿ", (byte)54, 65);
               b[32] = NLoginCore_397.F("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ\u0557՝՝յՌվԽ՚ՙլմբՖտջոժդ\u058c\u058b՟՞ՃՐձՊՌծեն֊\u058b֏ն֝Ք֟\u0557֓՜ն֝֓վ֘՞ջր", (byte)54, 70);
               b[33] = NLoginCore_173.D("үҋүҍҐӒӈҢӌҤҫӏҭҫүґҾҝҬӃӓҭҪҫ", (byte)54, 68);
               b[34] = NLoginCore_004.E("ՀՃԧՖՆբՄդճԪԯՈՉժոլչճՋԵ՛վՅՆ", (byte)54, 69);
               break;
            case 2:
               b[0] = NLoginCore_575.A("ĮŚŝňňŔŖšŦţŚřŉŌŰıŲĮţĴŤŁľĿ", (byte)54, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_471.C("ӈҭҨӀғҲӔӌӎүґҟ", (byte)54, 67);
         }
      }
   }

   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (this.a(var3, a(az, ba ^ bb), (boolean)bc)) {
         if (this.a(var1, var2, var3, null, null, NLoginCore_487.l, NLoginCore_508.i, LoginType.SESSION)) {
            NLoginType_008 var10000 = this.c;
            EventEnum var10001 = EventEnum.SESSION_LOGIN_EVENT;
            Object[] var10002 = new Object[bd];
            var10002[be] = var2;
            var10000.a(var10001, var10002);
            String var4 = var2.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? a(bf, bg ^ bh) + var4 + a(bi, bj) : a(bk, bl ^ bm) + var4 + a(bn, bo));
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_005.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginType_005.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.F("զճղԵյձլյրկԼպվշպրՂࣛࢸ࣏ࣛࣚࣞࣔࣖࢿ࣓ࣙࣧࣞ՛", (byte)71, 70) + var1 + NLoginCore_559.F("Խ", (byte)71, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_423 a() {
      return this.a;
   }

   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3, String var4, boolean var5, boolean var6) {
      if (this.a(var3, a(w & x, y), var6)) {
         if (this.a(var1, var2, var3, var4, null, var5 ? NLoginCore_487.j : null, var5 ? NLoginCore_508.c : null, LoginType.LOGIN)) {
            String var7 = var2.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? a(z, aa ^ ab) + var7 + a(ac, ad ^ ae) : a(af, ag) + var7 + a(ah, ai ^ aj));
         }
      }
   }

   @Generated
   public NLoginType_015 a() {
      return this.a;
   }

   private void a(NLoginCore_509 var1) {
      synchronized (var1.n) {
         if (var1.a() == NLoginCore_077.e) {
            var1.a(NLoginCore_077.d, NLoginCore_077.e);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 12L;
      var1 ^= 684892173901505248L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(56 + 12),
                     (byte)(57 + 12),
                     (byte)(45 + 38),
                     (byte)(20 + 27),
                     67,
                     (byte)(64 + 2),
                     (byte)(24 + 43),
                     (byte)(44 + 3),
                     (byte)(79 + 1),
                     (byte)(40 + 35),
                     (byte)(37 + 30),
                     (byte)(62 + 21),
                     (byte)(44 + 9),
                     (byte)(54 + 26),
                     (byte)(66 + 31),
                     (byte)(39 + 61),
                     (byte)(69 + 31),
                     (byte)(103 + 2),
                     (byte)(76 + 34),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.E("տ\u058c\u058bՎ֎֊օ֎֙ֈՕ֓֗\u0590֓֙՛ࣲ࣑࣭࣯ࣴࣴࣳࣷࣨࣘ࣬ऀࣷ", (byte)96, 69));
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

   public NLoginType_005(NLoginType_008 var1) {
      this.c = var1;
      this.a = new NLoginType_015(var1, this);
      this.a = new NLoginType_001(var1, this);
      this.a = new NLoginCore_423(var1);
   }

   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3, String var4, @Nullable String var5, boolean var6, boolean var7) {
      if (this.a(var3, a(al, am), var7)) {
         if (this.a(var1, var2, var3, var4, var5, NLoginCore_487.k, NLoginCore_508.d, LoginType.REGISTER)) {
            String var8 = var2.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? a(an & ao, ap) + var8 + a(aq, ar ^ as) : a(at & au, av) + var8 + a(aw, ax));
         }
      }
   }

   public abstract void b(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3);

   public abstract void a(NLoginCore_277 var1, NLoginCore_509 var2);

   protected boolean a(NLoginCore_509 var1, String var2, boolean var3) {
      synchronized (var1.n) {
         if (var3 && var1.a() != NLoginCore_077.d) {
            return (boolean)dp;
         } else {
            var1.a(NLoginCore_077.e, NLoginCore_077.d);
            return (boolean)dq;
         }
      }
   }

   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, boolean var3, boolean var4) {
      if (var2 != null && var2.R()) {
         NLoginCore_509 var5 = this.c.a().b(var2);
         synchronized (var5.n) {
            NLoginCore_077 var7 = var5.a();
            if (!var5.a().b(NLoginCore_077.e)) {
               if (var4) {
                  var5.a(NLoginCore_567.D, Boolean.valueOf((boolean)dr));
               }

               if (var7 == NLoginCore_077.d) {
                  this.c.b((boolean)ds).a(() -> {
                     if (var2.R()) {
                        if (!var5.a().d(NLoginCore_077.d)) {
                           NLoginCore_370.b(a(dt, du) + var2.getName() + a(dv & dw, dx));
                           this.a(var1, var2, var5, null, var3, (boolean)dz);
                        }
                     }
                  });
               } else {
                  var5.a(NLoginCore_567.C, var3);
               }
            }
         }
      }
   }

   public void b(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (this.a(var3, a(bq, br), (boolean)bs)) {
         NLoginCore_229 var4 = var1.a();
         if (var4 != NLoginCore_229.a) {
            throw new IllegalStateException(a(bt, bu ^ bv) + var2.getName() + a(bw & bx, by) + var4);
         } else if (!var3.d(NLoginCore_567.c)) {
            throw new IllegalStateException(a(bz, ca ^ cb) + var2.getName());
         } else {
            if (this.a(var1, var2, var3, null, null, NLoginCore_487.m, NLoginCore_508.j, LoginType.PREMIUM)) {
               NLoginType_008 var10000 = this.c;
               EventEnum var10001 = EventEnum.PREMIUM_LOGIN_EVENT;
               Object[] var10002 = new Object[cc];
               var10002[cd] = var2;
               var10000.a(var10001, var10002);
               String var5 = var2.getName();
               NLoginCore_370.e(NLoginCore_150.j() ? a(ce, cf) + var5 + a(cg & ch, ci) : a(cj & ck, cl) + var5 + a(cm & cn, co));
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean a(
      ForceRegisterConfig var1,
      NLoginCore_277 var2,
      NLoginCore_509 var3,
      String var4,
      @Nullable String var5,
      @Nullable NLoginCore_487 var6,
      @Nullable NLoginCore_508 var7,
      LoginType var8
   ) {
      long var9 = System.nanoTime();

      try {
         switch (NLoginType_017.b[var8.ordinal()]) {
            case 1:
               NLoginType_008 var22 = this.c;
               EventEnum var23 = EventEnum.REGISTER_EVENT;
               Object[] var24 = new Object[a];
               var24[b] = var2;
               var24[c] = var4;
               if (!var22.a(var23, var24)) {
                  return (boolean)d;
               }

               String var18 = var3.d();
               if (!this.c.a().a(var1, var18, var4, var5, var2.ac())) {
                  NLoginCore_150.a(var2, NLoginCore_487.w);
                  NLoginCore_150.a(var2, NLoginCore_194.F);
                  return (boolean)f;
               }
               break;
            case 2:
               NLoginType_008 var10000 = this.c;
               EventEnum var10001 = EventEnum.LOGIN_EVENT;
               Object[] var10002 = new Object[g];
               var10002[h] = var2;
               var10002[i] = var4;
               if (!var10000.a(var10001, var10002)) {
                  return (boolean)j;
               }
         }

         var3.a(NLoginCore_077.f, NLoginCore_077.e);
         var3.a(NLoginCore_567.s, var8);
         var3.a(NLoginCore_567.x, Boolean.valueOf((boolean)k));
         if (var4 != null) {
            var3.a(NLoginCore_567.u, var4);
         }

         var3.a(NLoginCore_567.z);
         NLoginCore_150.a(var2, NLoginCore_194.C, l, m);
         var2.ad();
         var2.o(a(n, o));
         if (var6 != null) {
            NLoginCore_150.a(var2, var6);
         }

         if (var7 != null) {
            NLoginCore_150.a(var2, var7);
         }

         NLoginInterface_012 var19 = null;

         try {
            var19 = this.a.a(var2, var3);
         } catch (Exception var16) {
            NLoginCore_370.c(a(r & s, t), var16);
         }

         if (!(var19 instanceof NLoginInterface_039)) {
            this.a.a(var1, var2, var3, var8, var4);
         }

         return (boolean)v;
      } finally {
         NLoginCore_548.a(var8 == LoginType.REGISTER ? NLoginCore_425.h : NLoginCore_425.g, var9);
         this.a(var3);
      }
   }

   @Generated
   public NLoginType_001 a() {
      return this.a;
   }

   static {
      b();
   }

   public void c(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (this.a(var3, a(cq, cr ^ cs), (boolean)ct)) {
         NLoginCore_229 var4 = var1.a();
         if (var4 != NLoginCore_229.c) {
            throw new IllegalStateException(a(cu & cv, cw) + var2.getName() + a(cx, cy ^ cz) + var4);
         } else {
            NLoginInterface_031 var5 = this.c.b().a();
            if (var5 != null && var3.d(NLoginCore_567.e)) {
               if (this.a(var1, var2, var3, null, null, NLoginCore_487.n, NLoginCore_508.k, LoginType.BEDROCK)) {
                  NLoginType_008 var10000 = this.c;
                  EventEnum var10001 = EventEnum.BEDROCK_LOGIN_EVENT;
                  Object[] var10002 = new Object[dc];
                  var10002[dd] = var2;
                  var10000.a(var10001, var10002);
                  String var6 = var2.getName();
                  NLoginCore_370.e(NLoginCore_150.j() ? a(de, df) + var6 + a(dg, dh) : a(di, dj ^ dk) + var6 + a(dl & dm, dn));
               }
            } else {
               throw new IllegalStateException(a(da, db) + var2.getName());
            }
         }
      }
   }
}
