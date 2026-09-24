package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_163 extends NLoginCore_098 {
   private static int fv = Integer.reverse(Integer.MIN_VALUE);
   private static long ds = Long.reverse(-9202820377070954658L);
   private static int fe = (12058624 >>> 179 | 12058624 << -179) & -1;
   private static long cd = Long.reverse(6629298651489370112L);
   private static long df = Long.reverse(-9202820377070954658L);
   private static int dk = Integer.reverse(-268435456);
   private static long cu = Long.reverse(6629298651489370112L);
   private static long es = Long.reverse(-9202820377070954658L);
   private static long dv = Long.reverse(6629298651489370112L);
   private static long eo = Long.reverse(-2573521725581584546L);
   private static int ex = Integer.reverse(1744830464);
   private static long q = Long.reverse(6629298651489370112L);
   private static int cr = Integer.reverse(1342177280);
   private static long fx = Long.reverse(-9202820377070954658L);
   private static long bk = Long.reverse(-9202820377070954658L);
   private static long at = Long.reverse(-2573521725581584546L);
   private static long ac = Long.reverse(6629298651489370112L);
   private static long br = Long.reverse(-2573521725581584546L);
   private static long dp = Long.reverse(6629298651489370112L);
   private static int bq = Integer.reverse(-1);
   private static String[] f = new String[NLoginCore_163.gz];
   private static int dd = 6656 >>> 137 | 6656 << ~137 + 1;
   private static int cj = (16384 >>> 142 | 16384 << -142) & -1;
   private static long gx = Long.reverse(6629298651489370112L);
   private static long ca = Long.reverse(-9202820377070954658L);
   private static int cm = Integer.reverse(0);
   private static long ev = Long.reverse(-9202820377070954658L);
   private static long dc = Long.reverse(-2573521725581584546L);
   private static String[] e = new String[NLoginCore_163.gy];
   private static int e = Integer.reverse(0);
   private static long ft = Long.reverse(-9202820377070954658L);
   private static int fl = 48 >>> 129 | 48 << ~129 + 1;
   private static int gm = -1 >>> 114 | -1 << -114;
   private static int em = Integer.reverse(-1);
   private static long bo = Long.reverse(-2573521725581584546L);
   private static int eu = Integer.reverse(-1476395008);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static long ee = Long.reverse(-9202820377070954658L);
   private static long gi = Long.reverse(-2573521725581584546L);
   private static int fw = (106496 >>> 172 | 106496 << ~172 + 1) & -1;
   private static long be = Long.reverse(-9202820377070954658L);
   private static int co = (0 >>> 173 | 0 << ~173 + 1) & -1;
   private static long by = Long.reverse(6629298651489370112L);
   private static int bp = (1536 >>> 200 | 1536 << -200) & -1;
   private static long eb = Long.reverse(6629298651489370112L);
   private static int fz = Integer.reverse(1073741824);
   private static int cy = Integer.reverse(-805306368);
   private static long ci = Long.reverse(-2573521725581584546L);
   private static long ef = Long.reverse(6629298651489370112L);
   private static long bh = Long.reverse(6629298651489370112L);
   private static long fu = Long.reverse(6629298651489370112L);
   private static int gq = Integer.reverse(2013265920);
   private static long go = Long.reverse(-2573521725581584546L);
   private static int bn = Integer.reverse(-1610612736);
   private static int ec = 288 >>> 228 | 288 << -228;
   private static int dq = Integer.reverse(134217728);
   private static int bz = Integer.reverse(268435456);
   private static long fo = Long.reverse(6629298651489370112L);
   private static long o;
   private static int bi = Integer.reverse(536870912);
   private static long dj = Long.reverse(6629298651489370112L);
   private static int fh = Integer.reverse(-1);
   private static int fd = Integer.reverse(0);
   private static long dg = Long.reverse(6629298651489370112L);
   private static long ff = Long.reverse(-2573521725581584546L);
   private static int gj = 1900544 >>> 80 | 1900544 << ~80 + 1;
   private static long ab = Long.reverse(-9202820377070954658L);
   private static int eq = Integer.reverse(671088640);
   private static int dw = Integer.reverse(-2013265920);
   private static long ct = Long.reverse(-9202820377070954658L);
   private static long gu = Long.reverse(-9202820377070954658L);
   private static int gy = Integer.reverse(67108864);
   private static int gc = Integer.reverse(-671088640);
   private static int cg = (-1 >>> 111 | -1 << ~111 + 1) & -1;
   private static int fa = 4 >>> 34 | 4 << ~34 + 1;
   private static long et = Long.reverse(6629298651489370112L);
   private static int gs = Integer.reverse(-134217728);
   private static long fy = Long.reverse(6629298651489370112L);
   private static int db = Integer.reverse(-1);
   private static int ek = Integer.reverse(-939524096);
   private static int gz = (512 >>> 132 | 512 << -132) & -1;
   private static long bv = Long.reverse(-9202820377070954658L);
   private static long ge = Long.reverse(-2573521725581584546L);
   private static long ew = Long.reverse(6629298651489370112L);
   private static int cv = 1733296128 >>> 179 | 1733296128 << -179;
   private static long bm = Long.reverse(6629298651489370112L);
   private static int al = 16384 >>> 173 | 16384 << -173;
   private static int bd = -2147483647 >>> 95 | -2147483647 << ~95 + 1;
   private static int fr = Integer.reverse(-1744830464);
   private static long p = Long.reverse(-9202820377070954658L);
   private static long gr = Long.reverse(-2573521725581584546L);
   private static int gg = (14336 >>> 201 | 14336 << ~201 + 1) & -1;
   private static long ez = Long.reverse(-2573521725581584546L);
   private static int fp = Integer.reverse(0);
   private static int ey = Integer.reverse(-1);
   private static int fb = Integer.reverse(Integer.MIN_VALUE);
   private static long dm = Long.reverse(-9202820377070954658L);
   private static int da = Integer.reverse(805306368);
   private static long di = Long.reverse(-9202820377070954658L);
   private static int bu = 28672 >>> 12 | 28672 << ~12 + 1;
   private static long fn = Long.reverse(-9202820377070954658L);
   private static int dh = 7168 >>> 105 | 7168 << -105;
   private static long cz = Long.reverse(-2573521725581584546L);
   private static int gd = Integer.reverse(-1);
   private static long dy = Long.reverse(-9202820377070954658L);
   private static int ce = 150994944 >>> 24 | 150994944 << -24;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_163.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.C("ѳҕҗѷқҺҲӈҴ҃ӁҷӅҿ҈ҭӏӎӆӌӆқ", (byte)50, 67), NLoginCore_163.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.E("Ց՞՝Ԡՠ՜\u0557ՠի՚ԧեթբեիԭ\u0893ࣃࢼࣁࢦࢤࣂ࣌ࢽ࣏ࣁ࢝ࣅࣈࢵՈ", (byte)50, 69) + var1 + NLoginCore_127.B("ĝ", (byte)50, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      int var2 = var1.a(a(cr, ct ^ cu), cv);
      String var3 = var1.a(a(cy, cz), a(da & db, dc));
      String var4 = var1.a(a(dd, df ^ dg), a(dh, di ^ dj));
      String var5 = var1.a(a(dk, dm ^ dp), a(dq, ds ^ dv));
      String var6 = var1.a(a(dw, dy ^ eb), a(ec, ee ^ ef));
      this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var3, var2, var4, var5, var6, new Properties()));
   }

   private static void b() {
      o = 8856802780170457601L;
      long var0 = o ^ -7342231944419757171L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(29 + 39),
               (byte)(51 + 18),
               (byte)(78 + 5),
               47,
               (byte)(40 + 27),
               (byte)(3 + 63),
               (byte)(52 + 15),
               (byte)(14 + 33),
               (byte)(6 + 74),
               (byte)(12 + 63),
               (byte)(26 + 41),
               (byte)(81 + 2),
               (byte)(33 + 20),
               (byte)(6 + 74),
               (byte)(8 + 89),
               100,
               (byte)(49 + 51),
               (byte)(104 + 1),
               (byte)(34 + 76),
               (byte)(28 + 75)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(49 + 34)}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_201.B("ſűƮžƧƆƃƨƘŭƧƊƙƗƲǀƣƏżƗžƵƌƍ", (byte)93, 66);
               f[1] = NLoginCore_384.D("ԯՁԔԡԂԗԺԃԫԆԅԘԡԤԼԞԦ\u0530ՋԩԬ\u0558ԟԠ", (byte)93, 68);
               f[2] = NLoginCore_110.E("՟Ց֎՞ևզգֈոՍևժչշ֒֠փկ՜շ՞֕լխ", (byte)93, 69);
               f[3] = NLoginCore_201.A("ƦƒƲžƒƴƏƬŸƺƝƎƫžƚǂƴƟźſŽǈƑƘƄƪƆƿǋǐƫƫ", (byte)93, 65);
               f[4] = NLoginCore_521.F("ֆղ֒՞ղ֔կ\u058c\u0558֚սծ\u058b՞պ֢֔տ՚՟՝֨ձոդ֊զְ֟֫\u058b\u058b", (byte)93, 70);
               f[5] = NLoginCore_183.B("ƦƒƲžƒƴƏƬŸƺƤƝƟƩƎƓƾƽƭƲƸƕƱƃƣƋƚƜơƸƩǆ", (byte)93, 66);
               f[6] = NLoginCore_471.B("ƦƒƲžƒƴƏƬŸƺƤƳƘƴŸƳưźƶžƔǀƁƻǂƝƉƢǊƤƦƱ", (byte)93, 66);
               f[7] = NLoginCore_141.C("ԹԥՅԑԥՇԢԿԋՍ\u0530ԜՆՉ\u0530ԮԱԤԩԧՅԷՃ՚՛ԧՋՖԚ\u0557ԝԵ", (byte)93, 67);
               f[8] = NLoginCore_183.D("ԹԥՅԑԥՇԢԿԋՍԯԢՒԎՌԴՐՌԤԢԩԪԭԛԏ՟՜ԱԯԸԕԶ", (byte)93, 68);
               f[9] = NLoginCore_138.A("ƦƒƲžƒƴƏƬŸƺƝŴƖƺƠƳƜƷƏƵƅƃƩƤǃƢƥƶƿǏưǍ", (byte)93, 65);
               f[10] = NLoginCore_232.D("ԹԥՅԑԥՇԢԿԋՍԷՆԫՇԋՆՃԍՉԑԧՓԔՎՕ\u0530ԜԵ՝ԷԹՄ", (byte)93, 68);
               f[11] = NLoginCore_004.C("ԹԥՅԑԥՇԢԿԋՍԷ\u0530ԲԼԡԦՑՐՀՅՋԨՄԖԶԞԭԯԴՋԼՙ", (byte)93, 67);
               f[12] = NLoginCore_553.C("ԦԃӹԦԙՋԉՆԗԹԽԎԨԤԟՌԬԞԶԳԑ\u0558ԟԠ", (byte)93, 67);
               f[13] = NLoginCore_138.E("ֆղ֒՞ղ֔կ\u058c\u0558֚սթ֖֓սջվձնմ֒ք\u0590֧֨մ֣֘է֤ժւ", (byte)93, 69);
               f[14] = NLoginCore_138.E("թՋել֖մ֒կ֙հ՚լ՜\u058cծղն֠փ\u0557֥֜լխ", (byte)93, 69);
               f[15] = NLoginCore_223.C("ԹԥՅԑԥՇԢԿԋՍԯԢՒԎՌԴՐՌԤԢԩԪԭԛԏ՟՜ԱԯԸԕԶ", (byte)93, 67);
               f[16] = NLoginCore_433.B("ŬƈŽƎŬƈƢƒŸŷŻƁ", (byte)93, 66);
               f[17] = NLoginCore_223.C("ԹԥՅԑԥՇԢԿԋՍ\u0530ԇԩՍԳՆԯՊԢՈԘԖԼԷՖԵԸՉՒբՃՠ", (byte)93, 67);
               f[18] = NLoginCore_433.F("բֆ֊֕հշլէ֘ֈՓա", (byte)93, 70);
               f[19] = NLoginCore_076.E("ջՌՓֆհֈՎ֍պ֖֗ա", (byte)93, 69);
               f[20] = NLoginCore_553.C("ԕԽԒԓԧԆԃՃԹԇԆԔ", (byte)93, 67);
               f[21] = NLoginCore_127.D("ԸԆԃԂԝӼՉԔՆԇՉՈԍՆԓՎԶԨՋԐԫՈԟԠ", (byte)93, 68);
               f[22] = NLoginCore_530.E("Ռբ\u058bզտփ֖ֈՌըՙՕջ֚֜ճխ֓֠օ֖֕լխ", (byte)93, 69);
               f[23] = NLoginCore_559.F("\u0590մՔմ֓֘Ֆդ՚ձ֊ա", (byte)93, 70);
               f[24] = NLoginCore_559.A("ƤŲƃŴƖƇƎƴƒƆŷƁ", (byte)93, 65);
               f[25] = NLoginCore_521.E("բՠաօծբ֖\u0590իոդա", (byte)93, 69);
               f[26] = NLoginCore_324.C("ՄԜԶԺԞԻԢԴԝԾԯԔ", (byte)93, 67);
               f[27] = NLoginCore_446.C("ԘԂԾӾԠԤԓՃՅԪԎԔ", (byte)93, 67);
               f[28] = NLoginCore_027.F("եՏ\u058bՋխձՠ\u0590֒շ՛ա", (byte)93, 70);
               f[29] = NLoginCore_575.D("ԚԲԕԾԱԫԷԺՇԾԫԔ", (byte)93, 68);
               f[30] = NLoginCore_201.E("ժ՜էՋճբ֍ք֏Օի՚֞իժ\u058c֢\u058bհւ՟տլխ", (byte)93, 69);
               f[31] = NLoginCore_201.A("ƄťƓƑƮƟƲūƇŵƊƲƗſƜƝƮſƿƏǂƵƌƍ", (byte)93, 65);
               break;
            case 1:
               f[0] = NLoginCore_076.F("՟Ց֎՞ևզգֈոՍ։֝֝ղռիբ՜ր֥չտլխ", (byte)93, 70);
               f[1] = NLoginCore_471.B("ƜƮƁƎůƄƧŰƘųŲŴƨƘƭƎƚƲƂƏƅƟƌƍ", (byte)93, 66);
               f[2] = NLoginCore_384.C("ԒԄՁԑԺԙԖԻԫԀԺԭՌԈԳԠԨՓՃԱՎՈԟԠ", (byte)93, 67);
               f[3] = NLoginCore_324.B("ƦƒƲžƒƴƏƬŸƺƝƎƫžƚǂƴƟźſŽŹƧƈǊƤƽƩǃǅǎƻ", (byte)93, 66);
               f[4] = NLoginCore_110.E("ֆղ֒՞ղ֔կ\u058c\u0558֚սծ\u058b՞պ֢֔տ՚՟՝դր֔տթզտ֫֊տ֤", (byte)93, 69);
               f[5] = NLoginCore_553.F("ֆղ֒՞ղ֔կ\u058c\u0558֚քստ։ծճ֞֝֍֒֘կ֧֤֞՝֝ևջ֛֣ւ", (byte)93, 70);
               f[6] = NLoginCore_575.C("ԹԥՅԑԥՇԢԿԋՍԷՆԫՇԋՆՃԍՉԑԧՔՅԱԫՎԭԩՕՕ՝ԣ", (byte)93, 67);
               f[7] = NLoginCore_397.F("ֆղ֒՞ղ֔կ\u058c\u0558֚սթ֖֓սջվձնմ֒րզղ֖֢֚֨֫չէ֍\u058bֳַֹ֟֔֕մ֧յֲց", (byte)93, 70);
               f[8] = NLoginCore_076.E("ֆղ֒՞ղ֔կ\u058c\u0558֚ռկ֟՛֙ց֝֙ձկնմղաաէցְ֧֭֭֩֬֒։֟֕ցֱ֩\u058bօֶց", (byte)93, 69);
               f[9] = NLoginCore_559.E("ֆղ֒՞ղ֔կ\u058c\u0558֚սՔն֚ր֓ռ֗կ֕եՙե֙ը։ը֩\u058c֪֚֟\u058c֏֓֝խ֑ղ֭ղֲֈց", (byte)93, 69);
               f[10] = NLoginCore_241.F("ֆղ֒՞ղ֔կ\u058c\u0558֚ք֓ո֔\u0558֓\u0590՚֖՞մ֣֚֜պդֆ֧֩֊ւ֮", (byte)93, 70);
               f[11] = NLoginCore_427.F("ֆղ֒՞ղ֔կ\u058c\u0558֚քստ։ծճ֞֝֍֒֘կե֜շգ֜ռշְ֙է", (byte)93, 70);
               f[12] = NLoginCore_183.F("ճՐՆճզ֘Ֆ֓դֆ֊հ\u058c՜\u0557֏֝քափ֞֕լխ", (byte)93, 70);
               f[13] = NLoginCore_451.C("ԹԥՅԑԥՇԢԿԋՍ\u0530ԜՆՉ\u0530ԮԱԤԩԧՅՄԒԎԕՎԬԗԲԢՃՕ", (byte)93, 67);
               f[14] = NLoginCore_521.F("թՋել֖մ֒կ֙հ\u0557շճ֕՛՞կռ֣֤ն֥լխ", (byte)93, 70);
               f[15] = NLoginCore_471.F("ֆղ֒՞ղ֔կ\u058c\u0558֚ռկ֟՛֙ց֝֙ձկնճե֟֡եօ֍֖ևֱ֦", (byte)93, 70);
               f[16] = NLoginCore_521.F("քլ֊ՒՌեձըՒ֛լա", (byte)93, 70);
               f[17] = NLoginCore_471.C("ԹԥՅԑԥՇԢԿԋՍ\u0530ԇԩՍԳՆԯՊԢՈԘՙՙԙՈԾ՛Ԓ՚ԶԚԡՎ\u0558՛ՂՃԩԼբգԤԮԴ", (byte)93, 67);
               f[18] = NLoginCore_471.B("ƳƯƎƵžƕƢŲƋŻƎŵƿƵƯƯŴƻƹƘƁƵƌƍ", (byte)93, 66);
               f[19] = NLoginCore_451.C("ԃՀԿԄԩԿԞӾՂԩԹԔ", (byte)93, 67);
               f[20] = NLoginCore_559.F("աճլղֈֆՐ֍֔֒֎ա", (byte)93, 70);
               f[21] = NLoginCore_471.C("ԸԆԃԂԝӼՉԔՆԇՉԯԺԋՔԔԧԯՀԮԧ\u0558ԟԠ", (byte)93, 67);
               f[22] = NLoginCore_559.A("ŬƂƫƆƟƣƶƨŬƈźƜƵƫƿƘƙƝƟƟǅƏƌƍ", (byte)93, 65);
               f[23] = NLoginCore_521.F("փգՔաշեծդՕՙլա", (byte)93, 70);
               f[24] = NLoginCore_446.A("ƞƥƓƨƞƔƌƌƴưƈƁ", (byte)93, 65);
               f[25] = NLoginCore_451.B("ƃŽƟƄƭŵƠƣƓƛƸƩƆƴŲŹƙƐƘǀƄƏƌƍ", (byte)93, 66);
               f[26] = NLoginCore_138.F("Րծէ՝կՏ֗\u058c֛֕Քօսէ՜ջ՚ւաբֆ֕լխ", (byte)93, 70);
               f[27] = NLoginCore_384.A("ƤƯƈžƈƒƀūűƗƦƁ", (byte)93, 65);
               f[28] = NLoginCore_027.F("քցճև֊֍Ֆ\u0590Ք֛լա", (byte)93, 70);
               f[29] = NLoginCore_384.E("քՑ՞ՌֈՒՖՕկ֎լա", (byte)93, 69);
               f[30] = NLoginCore_223.C("ԝԏԚӾԦԕՀԷՂԈԞՂՀՏԓԢՁՔԒԸԦԢԟԠ", (byte)93, 67);
               f[31] = NLoginCore_451.B("ƄťƓƑƮƟƲūƇŵƋŷƾƘƖƿƿżŻƳƀƏƌƍ", (byte)93, 66);
               break;
            case 2:
               f[0] = NLoginCore_387.C("ӾԵԦԲԹԢԜԙԛՇԯԔ", (byte)93, 67);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_427.A("ƭƯƩƊƎƸƖūŴŻƥƗƖƵƝƁƭƖſƽƁƲſƀƙƤƩƣǆǅƟƫ", (byte)93, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -7342231944419757171L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(11 + 58),
                     (byte)(20 + 63),
                     (byte)(5 + 42),
                     (byte)(59 + 8),
                     (byte)(5 + 61),
                     (byte)(5 + 62),
                     (byte)(33 + 14),
                     80,
                     (byte)(37 + 38),
                     (byte)(11 + 56),
                     (byte)(58 + 25),
                     53,
                     (byte)(22 + 58),
                     (byte)(30 + 67),
                     (byte)(57 + 43),
                     (byte)(30 + 70),
                     (byte)(22 + 83),
                     (byte)(94 + 16),
                     (byte)(15 + 88)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.A("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӀӰөӮӓӑӯӹӪӼӮӊӲӵӢ", (byte)78, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   public NLoginCore_163(NLoginType_008 var1) {
      super(var1, NLoginCore_479.m, a(e, p ^ q), a(y, ab ^ ac));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(ek & em, eo));
      UUID var2 = NLoginCore_432.c(var1.getString(a(eq, es ^ et)));
      String var3 = var1.getString(a(eu, ev ^ ew));
      int var4 = var1.getInt(a(ex & ey, ez)) == fa ? fb : fd;
      if (var4 == 0) {
         var3 = null;
      }

      String var5 = var1.getString(a(fe, ff)).toUpperCase(Locale.ENGLISH);
      int var7 = fh;
      switch (var5.hashCode()) {
         case -1850268089:
            if (var5.equals(a(fr, ft ^ fu))) {
               var7 = fv;
            }
            break;
         case -1850265334:
            if (var5.equals(a(fw, fx ^ fy))) {
               var7 = fz;
            }
            break;
         case 76158:
            if (var5.equals(a(fl, fn ^ fo))) {
               var7 = fp;
            }
      }

      switch (var7) {
         case 0:
         case 1:
         case 2:
            var3 = a(gc & gd, ge) + var5 + a(gg, gi) + var3;
            String var6 = var1.getString(a(gj & gm, go));
            long var12 = var1.getLong(a(gq, gr));
            long var9 = var1.getLong(a(gs, gu ^ gx));
            this.a(this.r, var3, var6, var2, var4x -> var4x.a(var12, var9));
            return;
         default:
            this.e(this.r, var3, var5);
      }
   }

   @Override
   public boolean isAvailable() {
      if (!super.isAvailable()) {
         return (boolean)co;
      } else {
         NLoginCore_219 var1 = this.a(a(al, at));
         return (boolean)(var1.p(a(bd, be ^ bh))
               && var1.d(a(bi, bk ^ bm))
               && var1.p(a(bn, bo))
               && var1.p(a(bp & bq, br))
               && var1.p(a(bu, bv ^ by))
               && var1.p(a(bz, ca ^ cd))
               && var1.p(a(ce & cg, ci))
            ? cj
            : cm);
      }
   }
}
