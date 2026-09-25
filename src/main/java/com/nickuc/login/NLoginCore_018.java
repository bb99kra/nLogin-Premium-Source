package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_018 extends NLoginCore_098 {
   private static int gg = Integer.reverse(-1073741824);
   private static long be = Long.reverse(8262952726149646479L);
   private static long dm = Long.reverse(-7301487586042787697L);
   private static int cy = (872415232 >>> 90 | 872415232 << ~90 + 1) & -1;
   private static long df = Long.reverse(8262952726149646479L);
   private static long cu = Long.reverse(-1729382256910270464L);
   private static int bl = (-1 >>> 68 | -1 << ~68 + 1) & -1;
   private static int bd = Integer.reverse(-1073741824);
   private static int dd = Integer.reverse(-268435456);
   private static long fy = Long.reverse(-1729382256910270464L);
   private static int cm = Integer.reverse(1462763520);
   private static int gm = (7168 >>> 72 | 7168 << ~72 + 1) & -1;
   private static int bu = Integer.reverse(0);
   private static long fc = Long.reverse(-1729382256910270464L);
   private static long cd = Long.reverse(-7301487586042787697L);
   private static int fp = (-1 >>> 231 | -1 << ~231 + 1) & -1;
   private static int gd = (2097152 >>> 148 | 2097152 << -148) & -1;
   private static int y = (384 >>> 134 | 384 << ~134 + 1) & -1;
   private static int dh = (65536 >>> 108 | 65536 << ~108 + 1) & -1;
   private static int gn = (117440512 >>> 118 | 117440512 << ~118 + 1) & -1;
   private static long cq = Long.reverse(-1729382256910270464L);
   private static long dy = Long.reverse(-7301487586042787697L);
   private static long ac = Long.reverse(-1729382256910270464L);
   private static long dc = Long.reverse(-7301487586042787697L);
   private static int dw = (-1 >>> 43 | -1 << -43) & -1;
   private static long ck = Long.reverse(8262952726149646479L);
   private static long br = Long.reverse(-7301487586042787697L);
   private static long dp = Long.reverse(8262952726149646479L);
   private static int gc = 2097152 >>> 181 | 2097152 << ~181 + 1;
   private static int gj = (1342177280 >>> 60 | 1342177280 << ~60 + 1) & -1;
   private static int fe = Integer.reverse(402653184);
   private static int fs = -2147483642 >>> 126 | -2147483642 << -126;
   private static int du = Integer.reverse(1207959552);
   private static long ez = Long.reverse(8262952726149646479L);
   private static int bi = Integer.reverse(536870912);
   private static long p = Long.reverse(8262952726149646479L);
   private final String[] b = new String[y];
   private static int dz = 128 >>> 71 | 128 << -71;
   private static String[] ZKM_STR_A = new String[gm];
   private static int bx = Integer.reverse(-1);
   private static int dk = Integer.reverse(-1);
   private static long cl = Long.reverse(-1729382256910270464L);
   private static int e = 0 >>> 118 | 0 << ~118 + 1;
   private static long cz = Long.reverse(-7301487586042787697L);
   private static long ct = Long.reverse(8262952726149646479L);
   private static int cv = Integer.reverse(805306368);
   private static int ek = Integer.reverse(671088640);
   private static int fl = (12288 >>> 140 | 12288 << -140) & -1;
   private static int ea = 2432 >>> 167 | 2432 << ~167 + 1;
   private static int fr = Integer.reverse(536870912);
   private static long fi = Long.reverse(-7301487586042787697L);
   private static int al = (16384 >>> 13 | 16384 << -13) & -1;
   private static int bn = (640 >>> 71 | 640 << -71) & -1;
   private static long ee = Long.reverse(-1729382256910270464L);
   private static long ft = Long.reverse(-7301487586042787697L);
   private static long fq = Long.reverse(-7301487586042787697L);
   private static int fd = Integer.reverse(1073741824);
   private static int fw = (1728 >>> 70 | 1728 << ~70 + 1) & -1;
   private static int ao = Integer.reverse(-1);
   private static long bk = Long.reverse(-7301487586042787697L);
   private static long cx = Long.reverse(-1729382256910270464L);
   private static long ab = Long.reverse(8262952726149646479L);
   private static int co = (41943040 >>> 182 | 41943040 << -182) & -1;
   private static int fm = Integer.reverse(-1744830464);
   private static int bw = -1073741824 >>> 61 | -1073741824 << -61;
   private static int cc = Integer.reverse(-1);
   private static long by = Long.reverse(-7301487586042787697L);
   private static int em = Integer.reverse(-1476395008);
   private static long cp = Long.reverse(8262952726149646479L);
   private static int z = 8192 >>> 173 | 8192 << ~173 + 1;
   private static int bp = -1 >>> 42 | -1 << ~42 + 1;
   private static long et = Long.reverse(-1729382256910270464L);
   private static int ce = 1 >>> 63 | 1 << ~63 + 1;
   private static int dn = -2013265920 >>> 251 | -2013265920 << ~251 + 1;
   private static int cr = (369098752 >>> 57 | 369098752 << ~57 + 1) & -1;
   private static int cb = ('\ue000' >>> 173 | 57344 << ~173 + 1) & -1;
   private static int bz = 2097152 >>> 85 | 2097152 << ~85 + 1;
   private static int ex = Integer.reverse(-402653184);
   private static long eo = Long.reverse(-7301487586042787697L);
   private static long ds = Long.reverse(-1729382256910270464L);
   private static long bh = Long.reverse(-1729382256910270464L);
   private static int er = 2883584 >>> 241 | 2883584 << ~241 + 1;
   private static int fv = 83886080 >>> 56 | 83886080 << -56;
   private static long ci = Long.reverse(-7301487586042787697L);
   private static long es = Long.reverse(8262952726149646479L);
   private static String[] ZKM_STR_B = new String[gn];
   private static long dg = Long.reverse(-1729382256910270464L);
   private static long el = Long.reverse(-7301487586042787697L);
   private static int gh = Integer.reverse(536870912);
   private static int cj = Integer.reverse(-1879048192);
   private static long at = Long.reverse(-7301487586042787697L);
   private static long q = Long.reverse(-1729382256910270464L);
   private static int eu = Integer.reverse(Integer.MIN_VALUE);
   private static long eb = Long.reverse(8262952726149646479L);
   private static int dt = (0 >>> 150 | 0 << ~150 + 1) & -1;
   private static int fz = (0 >>> 129 | 0 << -129) & -1;
   private static long fx = Long.reverse(8262952726149646479L);
   private static int ch = Integer.reverse(-1);
   private static int cg = Integer.reverse(268435456);
   private static long o;
   private static int fh = -1 >>> 148 | -1 << ~148 + 1;
   private static int da = (896 >>> 38 | 896 << ~38 + 1) & -1;
   private static long cw = Long.reverse(8262952726149646479L);
   private static int eq = (0 >>> 25 | 0 << -25) & -1;

   private static void b() {
      o = -1075375502356130482L;
      long var0 = o ^ 2297435109047706916L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               (byte)(59 + 10),
               (byte)(44 + 39),
               47,
               67,
               (byte)(55 + 11),
               (byte)(57 + 10),
               (byte)(37 + 10),
               (byte)(64 + 16),
               (byte)(46 + 29),
               (byte)(9 + 58),
               (byte)(64 + 19),
               (byte)(28 + 25),
               (byte)(68 + 12),
               (byte)(80 + 17),
               (byte)(47 + 53),
               (byte)(29 + 71),
               (byte)(19 + 86),
               (byte)(65 + 45),
               (byte)(4 + 99)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.E("Կաՠ՛՛Մախցթդդ՟Ս֖ՏշՕգՌռ֊աբ", (byte)82, 69);
               ZKM_STR_B[1] = NLoginCore_559.A("ŖƓƖŧƙƓƑơźųŵſţƗŦƓƌƟƊƉƑƠźƥŭůƍƂƐƯƎƜ", (byte)82, 65);
               ZKM_STR_B[2] = NLoginCore_138.C("ԍӣԥԀԉӳӳԣԞӤԜӳ", (byte)82, 67);
               ZKM_STR_B[3] = NLoginCore_027.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԋӲԣԌԹԆԊԿԔԿԡԗԁԺԶՄԉԣԓԽՍՄԓ", (byte)82, 68);
               ZKM_STR_B[4] = NLoginCore_092.C("ԝӵԒԣӹԆԀӳԭӭԊӳ", (byte)82, 67);
               ZKM_STR_B[5] = NLoginCore_451.B("ƅśƝŸƁūūƛƖŜƔū", (byte)82, 66);
               ZKM_STR_B[6] = NLoginCore_427.A("ŵżŦŸŜŗſƐƞƚƜū", (byte)82, 65);
               ZKM_STR_B[7] = NLoginCore_521.E("վշՓշւՈ՞\u058cց֎տՖ", (byte)82, 69);
               ZKM_STR_B[8] = NLoginCore_241.D("ӚӱԙԚԕӤԧԩӬԅӶӳ", (byte)82, 68);
               ZKM_STR_B[9] = NLoginCore_397.F("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճեֆ֊՟՚֓լխտբ֝", (byte)82, 70);
               ZKM_STR_B[10] = NLoginCore_027.F("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճե֚֏պխտ֔մչ֎֔", (byte)82, 70);
               ZKM_STR_B[11] = NLoginCore_138.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈſƫƀƌƀƇƃƈŷƅƏƹƈƙƲƲƽƳƒƀŷƒƋ", (byte)82, 66);
               ZKM_STR_B[12] = NLoginCore_397.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԂԔԓԝԗӽ\u0530ԪӷՂԾԷԿԄԚӿՆՊՄӾԬԮԓ", (byte)82, 68);
               ZKM_STR_B[13] = NLoginCore_397.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈžŭƥƤƆűƍƪƭűƘ", (byte)82, 66);
               ZKM_STR_B[14] = NLoginCore_553.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճձխՕ֎։ծց֖֡՟հզֆ֜֡֞֜՟էթևֱ֞֊֏ս֊ղְ֪֕֫֔ցւ", (byte)82, 69);
               ZKM_STR_B[15] = NLoginCore_553.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճխ֊ճ֙ց՛պձքջքպ֢ո֚֡֙֫նְ֣֭֟թ֏յ֤խ։ַ֥ջ֪ցւ", (byte)82, 69);
               ZKM_STR_B[16] = NLoginCore_223.B("ŴŰƆųŘƉƖůơŴŝū", (byte)82, 66);
               ZKM_STR_B[17] = NLoginCore_241.B("ƝŸƜŮşƊūŢžƘűŲŤźƘơŵƢƃūƞƇƄƩƭſƕƤƑűƥƄ", (byte)82, 66);
               ZKM_STR_B[18] = NLoginCore_076.F("Ն՛\u0557ը\u0558օՄՉ\u0590է՛զՍճիդդհմպՙ֕չ՛֟։Փ֑֙լխզ", (byte)82, 70);
               ZKM_STR_B[19] = NLoginCore_091.B("ƓƌŨƌƗŝųơƖƣƔū", (byte)82, 66);
               ZKM_STR_B[20] = NLoginCore_092.B("ŧŷžŸƏƐūżƀƣƖŢƐŽƥƄƚşƂƊƥƧƃƎűƞƪƭơƬƱƪƎƨƎƞƉžŻžƕƥƴƋ", (byte)82, 66);
               ZKM_STR_B[21] = NLoginCore_027.F("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճժճ֕\u058b՜ՙ\u058b՛հ֖՟աշռփո֩լ֛ւռսն", (byte)82, 70);
               ZKM_STR_B[22] = NLoginCore_183.F("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճժ֙զ֖շ֔ջ֖֘֓՝վտօ֔՝ք֪֞լխ֣ն", (byte)82, 70);
               ZKM_STR_B[23] = NLoginCore_427.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԊԅԌԵԯԱԾԛԕӻԒԺԴԱԕԝԜԿԓԸԷՀԓ", (byte)82, 68);
               ZKM_STR_B[24] = NLoginCore_092.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճղը֑֗ջ֢Ք֟մբ֞ձ֢և֜֞ց\u058bևպչ֟ն", (byte)82, 69);
               ZKM_STR_B[25] = NLoginCore_453.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճի՚պ֚ր֡՝ղ֜՜֛ՙ՞ավզթովփկչն", (byte)82, 69);
               ZKM_STR_B[26] = NLoginCore_530.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԃԸԯӺԯ\u0530ԳԞԓӸԫӾӿԠԵԔՀՊՁԻԡԺԆԝ\u0530\u0530ՌԊԥԐՒՆԡԞԟ", (byte)82, 68);
               ZKM_STR_B[27] = NLoginCore_446.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂƃƞƈƤƩƎŵƸŲƷƨźƛƛƿǀƌƮżƐƼƋ", (byte)82, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_201.E("Կաՠ՛՛Մախցթդջ֔թա֊նյՕՒՙ֚աբ", (byte)82, 69);
               ZKM_STR_B[1] = NLoginCore_387.F("ՁվցՒքվռ\u058cե՞ՠժՎւՑվշ֊յմռ֕ն֊֛շ֞փ֘գ֖օ", (byte)82, 70);
               ZKM_STR_B[2] = NLoginCore_138.B("ŧƝŻƎŷœůŢƢŤƅƥƨŧſƥƊţŠƗƦƟŶŷ", (byte)82, 66);
               ZKM_STR_B[3] = NLoginCore_183.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƃŪƛƄƱžƂƷƌƷƙƪƻƘŻƙƁƝŻƄǁƞƋ", (byte)82, 66);
               ZKM_STR_B[4] = NLoginCore_453.D("ԙӴԅӰӸԇԗԂԚԭӦԈӬԈԉԭԪӳԉӿԭԷӾӿ", (byte)82, 68);
               ZKM_STR_B[5] = NLoginCore_451.D("ԥԓԦԧӞԠԜԄӾԤӻӯԙԮԟӽ\u0530ӰԯԦӵԧӾӿ", (byte)82, 68);
               ZKM_STR_B[6] = NLoginCore_433.A("ťťŬƖŽŲŻƀƛƤšƝƑƤžƩƪƈƘŧƝŹŶŷ", (byte)82, 65);
               ZKM_STR_B[7] = NLoginCore_387.A("ŹƋƚŘŨŭŮƓŢŰűƘŧƣŸŨƜŽŸŧũƟŶŷ", (byte)82, 65);
               ZKM_STR_B[8] = NLoginCore_141.E("Ձք՝ք\u058b՟օՙխ՝ՈՖ", (byte)82, 69);
               ZKM_STR_B[9] = NLoginCore_241.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճլՔըռ֠ջնփւ֡մպ֘՟շ֤֝֫ֈշ֣֯ն", (byte)82, 69);
               ZKM_STR_B[10] = NLoginCore_183.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճէ՝֖֍֑խ֒֎ձմ֒", (byte)82, 69);
               ZKM_STR_B[11] = NLoginCore_530.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճժ֖իշիղծճբհպտփ֢ֈ֦֫գզ֟֙չն", (byte)82, 69);
               ZKM_STR_B[12] = NLoginCore_553.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճեշնրպՠ֓֍՚֥֚֡ե֠օ֦֖֕լիւ֑ն", (byte)82, 69);
               ZKM_STR_B[13] = NLoginCore_004.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƄƲƯƒƇŶƘƑƤƦƃƇƞƖƈƔŸƐƿžƏưƋ", (byte)82, 65);
               ZKM_STR_B[14] = NLoginCore_092.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճձխՕ֎։ծց֖֡՟հզֆ֜֡֞֜՟էթևֱփ֭օְֲ֘ևն֦֛֓֗ֆַ֫־ֻּ֚֘ո", (byte)82, 69);
               ZKM_STR_B[15] = NLoginCore_446.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂƟƈƮƖŰƏƆƙƐƙƏƷƍƶƮƯǀƋǂƴƸơƗƄǅƨǋǅƎǁǏǄƥǃǂǓƖǘǅǑƳǓ", (byte)82, 66);
               ZKM_STR_B[16] = NLoginCore_110.F("ԹՆՄՅՈցզծՉՍՇղՉֆը\u058cո֍֚֕֎դաբ", (byte)82, 70);
               ZKM_STR_B[17] = NLoginCore_433.B("ƝŸƜŮşƊūŢžƘűŲŤźƘơŵƢƃūƞƁūƣơƧžƘůƏƥŹųƇŽƙƼƬƎƠƝƄưƋ", (byte)82, 66);
               ZKM_STR_B[18] = NLoginCore_138.B("śŰŬŽŭƚřŞƥżŰŻŢƈƀŹŹƅƉƏŮƣƫŰƨƞƶƂƵƈƘƜƷżƗƭƬǁƺƹƃƵƖƋ", (byte)82, 66);
               ZKM_STR_B[19] = NLoginCore_201.B("ŮżŪŪơƚźŭţŮƒűżżƤūƩŸƯƁƱŹŶŷ", (byte)82, 66);
               ZKM_STR_B[20] = NLoginCore_004.B("ŧŷžŸƏƐūżƀƣƖŢƐŽƥƄƚşƂƊƥƧƃƎűƞƪƭơƬƱƪƶƈźƬƺƮƝƜƔƤưƋ", (byte)82, 66);
               ZKM_STR_B[21] = NLoginCore_433.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճժճ֕\u058b՜ՙ\u058b՛հ֖՟է֤չ֪մգ\u058cռ֩վհն", (byte)82, 69);
               ZKM_STR_B[22] = NLoginCore_076.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈſƮŻƫƌƩƐƫƭƨŲŶưƻƙƼƬŻƀƻƘƢƋ", (byte)82, 65);
               ZKM_STR_B[23] = NLoginCore_183.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂŽƄƭƧƩƶƓƍųƊƇƎƖƨƏƀƜƸƸŽǄƁƞƜǉƫƽǆƊƌƏǏƖƗ", (byte)82, 66);
               ZKM_STR_B[24] = NLoginCore_397.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճղը֑֗ջ֢Ք֟մբ֥֥֞֗ա֢օչի֪ռ֣ն", (byte)82, 69);
               ZKM_STR_B[25] = NLoginCore_530.F("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճի՚պ֚ր֡՝ղ֜՜֛֖բտն֤զ֎֎֭֭ը։ֱճְ։֬շ֡֫մքցւ", (byte)82, 70);
               ZKM_STR_B[26] = NLoginCore_559.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԃԸԯӺԯ\u0530ԳԞԓӸԫӾӿԠԵԔՀՊՁԻԡԻՀԆԻԦԞԩՌՌԒՖ\u0557Ԟԟ", (byte)82, 68);
               ZKM_STR_B[27] = NLoginCore_138.E("ՁվցՒքվռ\u058cե՞՟վւ֍մՖգՔ\u0557։ճխծ։ճ֏֔չՠ֣՝֢և֙եոզռ֘֩վ֣սն", (byte)82, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.C("ӻӗӜԤԜԘԝӹӹӫԂӳ", (byte)82, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.F("ձՅյճՁԾ՝՛իբծը֑ՐֈնՕւՕօղզ\u0590ոռ՛՟֓շ՝չֆ", (byte)82, 70);
         }
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(z, ab ^ ac), a(al & ao, at)).toUpperCase(Locale.ENGLISH);
      String var3 = var1.a(a(bd, be ^ bh), a(bi, bk));
      int var5 = bl;
      switch (var2.hashCode()) {
         case -1841605620:
            if (var2.equals(a(bn & bp, br))) {
               var5 = bu;
            }
            break;
         case 73844866:
            if (var2.equals(a(bw & bx, by))) {
               var5 = bz;
            }
            break;
         case 1557169620:
            if (var2.equals(a(cb & cc, cd))) {
               var5 = ce;
            }
      }

      switch (var5) {
         case 0:
            File var6 = new File(this.b(), var3 + a(cg & ch, ci));
            this.d = NLoginCore_586.a(this.m, var6, new Properties());
            break;
         case 1:
         case 2:
            int var7 = var1.a(a(cj, ck ^ cl), cm);
            String var8 = var1.b(a(co, cp ^ cq));
            String var9 = var1.b(a(cr, ct ^ cu));
            String var10 = var1.b(a(cv, cw ^ cx));
            boolean var11 = var1.d(a(cy, cz));
            boolean var12 = var1.d(a(da, dc));
            boolean var13 = var1.d(a(dd, df ^ dg));
            Properties var14 = new Properties();
            var14.setProperty(a(dh & dk, dm), Boolean.toString(var11));
            if (!var12) {
               var14.setProperty(a(dn, dp ^ ds), Boolean.toString((dt != 0)));
            }

            if (var13) {
               var14.setProperty(a(du & dw, dy), Boolean.toString((dz != 0)));
            }

            NLoginCore_147 var15 = NLoginCore_147.a(var8, var7, var3, var9, var10, var14);
            this.d = (NLoginCore_459)(a(ea, eb ^ ee).equals(var2) ? NLoginCore_562.b(this.m, var15) : NLoginCore_034.b(this.m, var15));
            break;
         default:
            throw new IllegalArgumentException(a(ek, el) + var2);
      }

      this.P = var1.b(a(em, eo));
      this.b[eq] = var1.b(a(er, es ^ et));
      this.b[eu] = var1.b(a(ex, ez ^ fc));
      this.b[fd] = var1.b(a(fe & fh, fi));
      this.b[fl] = var1.b(a(fm & fp, fq));
      this.b[fr] = var1.b(a(fs, ft));
      this.b[fv] = var1.b(a(fw, fx ^ fy));
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 23L;
      var1 ^= 2297435109047706916L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     69,
                     (byte)(14 + 69),
                     (byte)(8 + 39),
                     (byte)(28 + 39),
                     (byte)(16 + 50),
                     (byte)(30 + 37),
                     (byte)(19 + 28),
                     (byte)(42 + 38),
                     (byte)(55 + 20),
                     (byte)(47 + 20),
                     (byte)(82 + 1),
                     (byte)(38 + 15),
                     (byte)(55 + 25),
                     (byte)(3 + 94),
                     (byte)(41 + 59),
                     (byte)(58 + 42),
                     105,
                     (byte)(69 + 41),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.A("ƔơƠţƣƟƚƣƮƝŪƨƬƥƨƮŰӢӺԇԁԍӢԇөӻӞ", (byte)89, 65));
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
   protected void b(ResultSet var1) {
      this.r = var1.getString(this.b[fz]);
      String var2 = var1.getString(this.b[gc]);
      String var3 = var1.getString(this.b[gd]);
      long var4 = var1.getLong(this.b[gg]);
      long var6 = var1.getLong(this.b[gh]);
      String var8 = var1.getString(this.b[gj]);
      this.a(this.r, var2, var3, null, var5 -> {
         if (var8 != null) {
            var5.a().b(var8);
         }

         var5.a(var6, var4);
      });
   }

   public NLoginCore_018(NLoginType_008 var1) {
      super(var1, NLoginCore_479.b, a(e, p ^ q));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_018.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.A("ţƅƇŧƋƪƢƸƤųƱƧƵƯŸƝƿƾƶƼƶƋ", (byte)94, 65), NLoginCore_018.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_471.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢀ࢘ࢥ࢟ࢫࢀࢥࢇ࢙ࡼԤ", (byte)94, 67) + var1 + NLoginCore_521.C("ԉ", (byte)94, 67) + var2.toString(), var4);
      }
   }
}
