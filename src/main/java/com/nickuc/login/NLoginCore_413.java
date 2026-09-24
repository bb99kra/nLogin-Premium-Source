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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_413 extends NLoginCore_098 {
   private static long fi = Long.reverse(7141209490544566713L);
   private static long by = Long.reverse(7141209490544566713L);
   private static long ff = Long.reverse(-5332261958806667264L);
   private static int dn = Integer.reverse(1207959552);
   private static String[] e = new String[NLoginCore_413.ix];
   private static int dd = Integer.reverse(-268435456);
   private static long df = Long.reverse(-3090968862841200199L);
   private static int hg = Integer.reverse(-1073741824);
   private static long ct = Long.reverse(7141209490544566713L);
   private static int gm = 256 >>> 131 | 256 << ~131 + 1;
   private static int ao = (-1 >>> 62 | -1 << ~62 + 1) & -1;
   private static long cw = Long.reverse(7141209490544566713L);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int dw = (268431360 >>> 236 | 268431360 << -236) & -1;
   private static int hh = Integer.reverse(603979776);
   private static int bi = Integer.reverse(-1);
   private static int ed = Integer.reverse(-1476395008);
   private static int in = 1 >>> 224 | 1 << ~224 + 1;
   private static int hy = Integer.reverse(-1543503872);
   private static long fj = Long.reverse(-5332261958806667264L);
   private static long dc = Long.reverse(-3090968862841200199L);
   private static int e = 0 >>> 244 | 0 << -244;
   private static long fn = Long.reverse(7141209490544566713L);
   private static long cp = Long.reverse(7141209490544566713L);
   private static int hm = Integer.reverse(536870912);
   private static int co = Integer.reverse(1342177280);
   private static long fc = Long.reverse(7141209490544566713L);
   private static long di = Long.reverse(7141209490544566713L);
   private static int ir = 64 >>> 128 | 64 << ~128 + 1;
   private static long cd = Long.reverse(7141209490544566713L);
   private static long go = Long.reverse(7141209490544566713L);
   private static long ee = Long.reverse(7141209490544566713L);
   private static long dv = Long.reverse(-3090968862841200199L);
   private static int eu = Integer.reverse(1073741824);
   private static int fr = Integer.reverse(-1);
   private static long fo = Long.reverse(-5332261958806667264L);
   private static long p = Long.reverse(-3090968862841200199L);
   private static long gu = Long.reverse(-3090968862841200199L);
   private static long gf = Long.reverse(-5332261958806667264L);
   private static int cc = 469762048 >>> 58 | 469762048 << ~58 + 1;
   private static int dh = 2097152 >>> 177 | 2097152 << ~177 + 1;
   private static int fh = Integer.reverse(1476395008);
   private static long bh = Long.reverse(-5332261958806667264L);
   private static long ga = Long.reverse(7141209490544566713L);
   private static long cq = Long.reverse(-5332261958806667264L);
   private static long iv = Long.reverse(7141209490544566713L);
   private static int al = 32 >>> 4 | 32 << -4;
   private static long dj = Long.reverse(-5332261958806667264L);
   private static int ec = (-1 >>> 155 | -1 << ~155 + 1) & -1;
   private static int ek = 0 >>> 63 | 0 << ~63 + 1;
   private static long ci = Long.reverse(-3090968862841200199L);
   private static long iw = Long.reverse(-5332261958806667264L);
   private static int cm = Integer.reverse(-1879048192);
   private static int ho = (32 >>> 131 | 32 << ~131 + 1) & -1;
   private static int gh = Integer.reverse(Integer.MIN_VALUE);
   private static long ds = Long.reverse(-5332261958806667264L);
   private static int fl = 452984832 >>> 248 | 452984832 << ~248 + 1;
   private static long ef = Long.reverse(-5332261958806667264L);
   private static int fa = Integer.reverse(-1744830464);
   private static long cz = Long.reverse(-3090968862841200199L);
   private static String[] f = new String[NLoginCore_413.iy];
   private static long ig = Long.reverse(-5332261958806667264L);
   private static long cx = Long.reverse(-5332261958806667264L);
   private static int dl = (-1 >>> 219 | -1 << ~219 + 1) & -1;
   private static long ha = Long.reverse(-3090968862841200199L);
   private static long dm = Long.reverse(-3090968862841200199L);
   private static long gb = Long.reverse(-5332261958806667264L);
   private static long eo = Long.reverse(7141209490544566713L);
   private static long ab = Long.reverse(-3090968862841200199L);
   private static long hi = Long.reverse(7141209490544566713L);
   private static long id = Long.reverse(7141209490544566713L);
   private static int eq = 16 >>> 100 | 16 << ~100 + 1;
   private static long cn = Long.reverse(-3090968862841200199L);
   private static long be = Long.reverse(7141209490544566713L);
   private static int gq = (0 >>> 45 | 0 << -45) & -1;
   private static int dt = 311296 >>> 174 | 311296 << ~174 + 1;
   private static int gs = 1073741832 >>> 94 | 1073741832 << -94;
   private static int cr = (369098752 >>> 153 | 369098752 << ~153 + 1) & -1;
   private static long ez = Long.reverse(-3090968862841200199L);
   private static long bk = Long.reverse(7141209490544566713L);
   private static int db = Integer.reverse(-1);
   private static int gw = (1088 >>> 5 | 1088 << ~5 + 1) & -1;
   private static long br = Long.reverse(-3090968862841200199L);
   private static int bj = 64 >>> 228 | 64 << -228;
   private static int iq = Integer.reverse(1073741824);
   private static int ic = (152 >>> 2 | 152 << -2) & -1;
   private static int cj = 512 >>> 135 | 512 << ~135 + 1;
   private static long o;
   private static int dx = (20 >>> 0 | 20 << ~0 + 1) & -1;
   private static int bu = 268435456 >>> 220 | 268435456 << -220;
   private static int cg = 805306368 >>> 188 | 805306368 << ~188 + 1;
   private static long ft = Long.reverse(-3090968862841200199L);
   private static int ix = Integer.reverse(335544320);
   private static int ch = (2 >>> 222 | 2 << -222) & -1;
   private static int bd = (6 >>> 97 | 6 << ~97 + 1) & -1;
   private static int bw = 192 >>> 5 | 192 << -5;
   private static int dz = Integer.reverse(-1);
   private static int gy = '耀' >>> 'N' | 32768 << -78;
   private static long fx = Long.reverse(7141209490544566713L);
   private static long es = Long.reverse(7141209490544566713L);
   private static int gc = (15872 >>> 137 | 15872 << -137) & -1;
   private static long at = Long.reverse(-3090968862841200199L);
   private static int gj = Integer.reverse(-1);
   private static int fp = ('\ue000' >>> 139 | 57344 << ~139 + 1) & -1;
   private static int gg = (131072 >>> 17 | 131072 << ~17 + 1) & -1;
   private static int fv = ('\ue800' >>> 'K' | 59392 << ~75 + 1) & -1;
   private static int gt = Integer.reverse(-1);
   private static long hz = Long.reverse(-3090968862841200199L);
   private static int cb = Integer.reverse(1073741824);
   private static int ex = (-2147483647 >>> 188 | -2147483647 << -188) & -1;
   private static int er = 385875968 >>> 216 | 385875968 << ~216 + 1;
   private static int bp = Integer.reverse(-1610612736);
   private static int fz = Integer.reverse(2013265920);
   private static long ep = Long.reverse(-5332261958806667264L);
   private static int iy = Integer.reverse(335544320);
   private static int ij = Integer.reverse(0);
   private static long dp = Long.reverse(7141209490544566713L);
   private static int z = -1 >>> 13 | -1 << -13;
   private static long cf = Long.reverse(-5332261958806667264L);
   private static int da = Integer.reverse(1879048192);
   private static int cy = Integer.reverse(-1342177280);
   private static long cu = Long.reverse(-5332261958806667264L);
   private static long gp = Long.reverse(-5332261958806667264L);
   private static long gx = Long.reverse(-3090968862841200199L);
   private static int im = Integer.reverse(-1073741824);
   private static int dk = 17 >>> 64 | 17 << ~64 + 1;
   private static int ii = 256 >>> 103 | 256 << ~103 + 1;
   private static int bn = (0 >>> 73 | 0 << ~73 + 1) & -1;
   private static long ca = Long.reverse(-5332261958806667264L);
   private static long hl = Long.reverse(-5332261958806667264L);
   private static int it = Integer.reverse(-469762048);
   private static long fy = Long.reverse(-5332261958806667264L);
   private static int cv = (96 >>> 99 | 96 << ~99 + 1) & -1;
   private static long bm = Long.reverse(-5332261958806667264L);
   private static long ge = Long.reverse(7141209490544566713L);
   private static int gz = (143360 >>> 140 | 143360 << ~140 + 1) & -1;
   private static long et = Long.reverse(-5332261958806667264L);
   private static int em = 184549376 >>> 87 | 184549376 << -87;
   private static long eb = Long.reverse(-3090968862841200199L);
   private static int gv = Integer.reverse(Integer.MIN_VALUE);
   private static int du = Integer.reverse(-1);

   private static String a(int var0, long var1) {
      var1 ^= 109L;
      var1 ^= -3273353791788853844L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(30 + 39),
                     (byte)(53 + 30),
                     (byte)(17 + 30),
                     (byte)(49 + 18),
                     (byte)(15 + 51),
                     (byte)(42 + 25),
                     (byte)(27 + 20),
                     (byte)(30 + 50),
                     (byte)(38 + 37),
                     (byte)(14 + 53),
                     (byte)(72 + 11),
                     (byte)(4 + 49),
                     (byte)(13 + 67),
                     97,
                     (byte)(52 + 48),
                     (byte)(76 + 24),
                     (byte)(8 + 97),
                     110,
                     (byte)(54 + 49)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.B("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒӧӡӪӛӝӢҾӰӝӤ", (byte)74, 66));
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

   public NLoginCore_413(NLoginType_008 var1) {
      super(var1, NLoginCore_479.p, a(e, p), a(y & z, ab));
   }

   private static void b() {
      o = -7096140962263115578L;
      long var0 = o ^ -3273353791788853844L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(65 + 3),
               (byte)(29 + 40),
               (byte)(30 + 53),
               (byte)(14 + 33),
               67,
               66,
               (byte)(61 + 6),
               (byte)(34 + 13),
               (byte)(68 + 12),
               (byte)(13 + 62),
               (byte)(31 + 36),
               (byte)(55 + 28),
               (byte)(47 + 6),
               (byte)(14 + 66),
               (byte)(17 + 80),
               (byte)(63 + 37),
               (byte)(38 + 62),
               (byte)(27 + 78),
               (byte)(56 + 54),
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_076.D("ҒҮґӇӐӐӕҽӇҧҮҶҞҽәӢҹҶҾӊӥҳҰұ", (byte)56, 68);
               f[1] = NLoginCore_183.F("ՉՀՁԨ՟ԪԪՁՑԵՈ\u0530ՃՃԲՄՅՔՔըւհՇՈ", (byte)56, 70);
               f[2] = NLoginCore_076.A("ĹńŕŘĻŁĥņŢŏŀšĮĵŰŒĶŊůŧŇŻłŃ", (byte)56, 65);
               f[3] = NLoginCore_241.F("՛ԸՆգԻՓժԳՌԾԲԼ", (byte)56, 70);
               f[4] = NLoginCore_241.E("՛ԸՆգԻՓժԳՌԾԲԼ", (byte)56, 69);
               f[5] = NLoginCore_110.A("ĥĹĳĥšŞļĬőũŤķ", (byte)56, 65);
               f[6] = NLoginCore_091.F("ՈիԩԿՒծՍՓգյՓԼ", (byte)56, 70);
               f[7] = NLoginCore_446.A("ĚģŝŤŕĥĥĬŁįŎķ", (byte)56, 65);
               f[8] = NLoginCore_127.D("ӓӒӓҲҘҪҥӕҖүӈӜҚӓӕҵӄӡӧҿӧәҰұ", (byte)56, 68);
               f[9] = NLoginCore_575.D("ҟӖҪҺӒҮҪӕҦӐӞҥ", (byte)56, 68);
               f[10] = NLoginCore_127.A("ğĸĜŢŁĥĩřļŰŜķ", (byte)56, 65);
               f[11] = NLoginCore_183.A("ĸĢŤĺŦĨĭĪňŬıķ", (byte)56, 65);
               f[12] = NLoginCore_453.E("ԾՉ՚՝ՀՆԪՋէՔՅկԶծՌԵպջր\u0558որՇՈ", (byte)56, 69);
               f[13] = NLoginCore_471.B("ņĢĩľŊńńŚŃůşĭŉĲŬŲĳŐŵŲŽŕłŃ", (byte)56, 66);
               f[14] = NLoginCore_471.B("ĹńŕŘĻŁĥņŢŏĿŃĪŴŀĭŴŎŐıŇŻłŃ", (byte)56, 66);
               f[15] = NLoginCore_324.F("ԧԠծԺլխՓԯՏՀխԼ", (byte)56, 70);
               f[16] = NLoginCore_559.D("ҧҲӃӆҩүғҴӐҽҮӁӃҮӅӓӗҿӛӥӈӌӋҼҤҹӇӠӭҼұӁ", (byte)56, 68);
               f[17] = NLoginCore_110.B("ĞŇŃĢūķŎšŧŠŬķ", (byte)56, 66);
               f[18] = NLoginCore_223.F("ԾՉ՚՝ՀՆԪՋէՔՅՎհղՏ՝վԾԻլնժր՚մտՔԺպեֆց", (byte)56, 70);
               f[19] = NLoginCore_173.D("ҧҲӃӆҩүғҴӐҽҭӘӢӐҬӟӒҾӦӅӂөҰұ", (byte)56, 68);
               f[20] = NLoginCore_138.C("ҏӓҹҐҘҒӊӖӈһҸҥ", (byte)56, 67);
               f[21] = NLoginCore_201.F("ՈիԩԿՒծՍՓգյՓԼ", (byte)56, 70);
               f[22] = NLoginCore_138.B("ĚģŝŤŕĥĥĬŁįŎķ", (byte)56, 66);
               f[23] = NLoginCore_127.A("ťŤťńĪļķŧĨŁŚŮĬťŧŇŖųŹőŹūłŃ", (byte)56, 65);
               f[24] = NLoginCore_141.B("ŐŪĨłńĺŚŁļŏļĳĴĮŅįŌŒĸŰřŖŌŹĸřŘŎŷźŮŒƈŚƋřƂŦƊŽƄšōŗ", (byte)56, 66);
               f[25] = NLoginCore_324.B("ŉŔŇĝşňŞŪŏŲįĬŐŧłĿŴũńŕŧŕłŃ", (byte)56, 66);
               f[26] = NLoginCore_451.E("ԥԫԯԻգհեիբգՊբԹձկՎծՐՍՒՍհՇՈ", (byte)56, 69);
               f[27] = NLoginCore_553.C("ҡҡҭӘҶҮҪҲҙҚӒҥ", (byte)56, 67);
               f[28] = NLoginCore_110.E("խՄԼծխԼեՎէդՕծԴԬը՛ԳծձԻՠ՚ՇՈ", (byte)56, 69);
               f[29] = NLoginCore_553.C("ҐҫҕңӛҷӅӑӎҙӞҥ", (byte)56, 67);
               f[30] = NLoginCore_223.D("ӌҴҫӅңӜҥҮҽӔҗҥ", (byte)56, 68);
               f[31] = NLoginCore_433.C("ҔӎӏҷӆӋӍҺҕҙҴҥ", (byte)56, 67);
               f[32] = NLoginCore_091.B("łĥĽŜĬĽŃŧįĹıķ", (byte)56, 66);
               f[33] = NLoginCore_387.B("ķŖŞŠŪŢřŪĩŝŜķ", (byte)56, 66);
               f[34] = NLoginCore_173.D("ҨұәҗӛҕҶүӔӞҟҥ", (byte)56, 68);
               f[35] = NLoginCore_446.C("Ӆ҉ӇӖҸҍқҗҞӠүӚҜҭӀӘӄӁұӃҼӃҰұ", (byte)56, 67);
               f[36] = NLoginCore_091.F("ՁԹ՜՞Մ՞բՃղիեԼ", (byte)56, 70);
               f[37] = NLoginCore_446.F("ՕկԭՇՉԿ՟ՆՁՔՀդ՚ՌՓՈծծԱճիՋՒյՠչռյ՛ՙ՞ցծա\u058c՜ՠջ՟Ս֑ձՍՐևջչպձշ֛ռչ՞աս֗կ՞՚ՠց֚֓", (byte)56, 70);
               f[38] = NLoginCore_451.F("ԽԫԷԧՍԭՋգԵԵԱՌաՎՎՄՖԶՠԸձՊՇՈ", (byte)56, 70);
               f[39] = NLoginCore_027.E("ԽԫԷԧՍԭՋգԵԵԮԮԹՊՉս՜տՋՕՀրՇՈ", (byte)56, 69);
               break;
            case 1:
               f[0] = NLoginCore_575.A("ĤŀģřŢŢŧŏřĹĿļŲįŐŰūŘĸĳĵŅłŃ", (byte)56, 65);
               f[1] = NLoginCore_324.E("ՉՀՁԨ՟ԪԪՁՑԵՈՀըըթ՝ԹթձկՕՊՇՈ", (byte)56, 69);
               f[2] = NLoginCore_384.D("ҧҲӃӆҩүғҴӐҽҬӉӖҫҖҥӧҵҾӀӀӝӔӮҹӬӍӢӝҼөӶ", (byte)56, 68);
               f[3] = NLoginCore_241.C("үҬӂҮӐҭӐҩҾҩҴҥ", (byte)56, 67);
               f[4] = NLoginCore_471.F("Ԫխ՚լ\u0530Ծա՟դՎյԼ", (byte)56, 70);
               f[5] = NLoginCore_241.A("łĵŘĤĢśŦĸİħőŊįĭųņŗņźŻœūłŃ", (byte)56, 65);
               f[6] = NLoginCore_138.B("ŠŪĪŀŇŜĥŋŦŜŊŁŰŞŠşŸŵŬņűŕłŃ", (byte)56, 66);
               f[7] = NLoginCore_110.E("ԟԩեժզԽՉՃդըղզբԶՍ\u0558\u0557ձլՠ՟հՇՈ", (byte)56, 69);
               f[8] = NLoginCore_127.F("ժթժՉԯՁԼլԭՆ\u0557ՅկՌպոծխ՚ԽՙՊՇՈ", (byte)56, 70);
               f[9] = NLoginCore_559.B("ĵňĢśĸĿŘūįĭĨīļĲŎŗĵŦĲŚŶŕłŃ", (byte)56, 66);
               f[10] = NLoginCore_092.C("ҡҖҥҘӕәӑӓҙӔӖҥ", (byte)56, 67);
               f[11] = NLoginCore_138.B("ŇĠŕŗŊŉńĪőŬĭĩŇŨŐńőİŭŌŇŅłŃ", (byte)56, 66);
               f[12] = NLoginCore_138.E("ԾՉ՚՝ՀՆԪՋէՔՃՌՋՖծԴԶԹՊՊ՟Ք՝ծծվջֈֈմթվ", (byte)56, 69);
               f[13] = NLoginCore_453.D("ҴҐҗҬҸҲҲӈұӝӍүҔүҡӒәӢӖқһәҰұ", (byte)56, 68);
               f[14] = NLoginCore_324.C("ҧҲӃӆҩүғҴӐҽҬҴӗҫӜӃҮӆһӓӖҳҰұ", (byte)56, 67);
               f[15] = NLoginCore_241.D("ҒӅҹҡҥӎӆҕӜҘӟҬӛӏӂӢӔҦҰҳӢәҰұ", (byte)56, 68);
               f[16] = NLoginCore_110.C("ҧҲӃӆҩүғҴӐҽҮӁӃҮӅӓӗҿӛӥӈӇӠӚӋҺҾӮӁҾӐӅ", (byte)56, 67);
               f[17] = NLoginCore_141.A("ŖĻŕŘŞĦšħļŁŨķ", (byte)56, 65);
               f[18] = NLoginCore_127.A("ĹńŕŘĻŁĥņŢŏŀŉūŭŊŘŹĹĶŧűŦňŲŖűĻŠžŤńſ", (byte)56, 65);
               f[19] = NLoginCore_471.E("ԾՉ՚՝ՀՆԪՋէՔՄՙԵՃՆԲ՜ՈղՑշ՚ՇՈ", (byte)56, 69);
               f[20] = NLoginCore_446.F("Չ՚ԬՋՋԻհՃՌՎձԼ", (byte)56, 70);
               f[21] = NLoginCore_451.F("լԤՉեՂէԽԿՔՑեԶՆՄծՕ՜ՎԼՓյՊՇՈ", (byte)56, 70);
               f[22] = NLoginCore_076.C("ӊӄҢҴһҴҫүӝҳӛҲҿӘңӁҿүӨӚҪҳҰұ", (byte)56, 67);
               f[23] = NLoginCore_559.A("ťŤťńĪļķŧĨŁśŊļħĿĳŇķŅŋĲŕłŃ", (byte)56, 65);
               f[24] = NLoginCore_451.B("ŐŪĨłńĺŚŁļŏļĳĴĮŅįŌŒĸŰřŖŌŹĸřŘŎŷźŮŒũņūšũňŊƏŨŮŢŗ", (byte)56, 66);
               f[25] = NLoginCore_433.F("ՎՙՌԢդՍգկՔշԲԱժձՇՊմխ\u0557ԿորՇՈ", (byte)56, 70);
               f[26] = NLoginCore_530.E("ԥԫԯԻգհեիբգՈ\u0558ՐՆռսՔզԷՐՔրՇՈ", (byte)56, 69);
               f[27] = NLoginCore_453.D("ӌҢҸӆӛҪӐҽҜӝҮӏӓӡӍҠҦӠҷҵҪөҰұ", (byte)56, 68);
               f[28] = NLoginCore_092.F("խՄԼծխԼեՎէդՕՇայՍՄՒՕՌՊՒ՚ՇՈ", (byte)56, 70);
               f[29] = NLoginCore_553.B("ĹňĢŝŦŧřůŢŌŉľŭĿŀŭįįŻĭŗŕłŃ", (byte)56, 66);
               f[30] = NLoginCore_433.B("ĺŕŚŖŧŠŁŀśĨŜŉŤŰıŧũĸŵĻĶŻłŃ", (byte)56, 66);
               f[31] = NLoginCore_076.B("ģũľĸŬŋŌĹűĺĭķ", (byte)56, 66);
               f[32] = NLoginCore_387.C("ҮүҨҰӋұӍӘқӏҸҥ", (byte)56, 67);
               f[33] = NLoginCore_559.F("ԻծՀիՠ՟ղՏԿԶՅ\u0558ԶՇՓԸռՍխղՌրՇՈ", (byte)56, 70);
               f[34] = NLoginCore_397.C("ҳҤӌӓҮңӖӈӌӋҾӟҪӗӣӝңӣңөөәҰұ", (byte)56, 67);
               f[35] = NLoginCore_387.F("՜Ԡ՞խՏԤԲԮԵշՅԳ\u0557մՐծԼթժպՖ՚ՇՈ", (byte)56, 70);
               f[36] = NLoginCore_427.D("ҕӀҤҲҺӉҶӛҳӚҨҥ", (byte)56, 68);
               f[37] = NLoginCore_453.B("ŐŪĨłńĺŚŁļŏĻşŕŇŎŃũũĬŮŦņōŰśŴŷŰŖŔřżũŜƇŗśŶŚňƌŬňŋƂŶŴŵŬŲƖŷŴŚƇŻżŭƓŰƒƗťš", (byte)56, 66);
               f[38] = NLoginCore_223.D("ҦҔҠҐҶҖҴӌҞҞҗӑҡӐӥӜҳӆҠҴӠӃҰұ", (byte)56, 68);
               f[39] = NLoginCore_201.C("ҦҔҠҐҶҖҴӌҞҞҙҬҠқҖӐӖҼӚӆҲөҰұ", (byte)56, 67);
               break;
            case 2:
               f[0] = NLoginCore_092.B("ĥļŧňŕňľĦŜŨīŒŴŌĶşŤŃĵœŪŵŇŹŉĻűœŹžľſ", (byte)56, 66);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_471.C("ҒҭӖӈұӘӐҫӍӘӐӔӒӓҽңӗӅҲӀҷөҰұ", (byte)56, 67);
         }
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al & ao, at), a(bd, be ^ bh)).toUpperCase(Locale.ENGLISH);
      int var4 = bi;
      switch (var2.hashCode()) {
         case -1841605620:
            if (var2.equals(a(bp, br))) {
               var4 = bu;
            }
            break;
         case -1620389036:
            if (var2.equals(a(ch, ci))) {
               var4 = cj;
            }
            break;
         case 2282:
            if (var2.equals(a(bj, bk ^ bm))) {
               var4 = bn;
            }
            break;
         case 73844866:
            if (var2.equals(a(bw, by ^ ca))) {
               var4 = cb;
            }
            break;
         case 1557169620:
            if (var2.equals(a(cc, cd ^ cf))) {
               var4 = cg;
            }
      }

      switch (var4) {
         case 0:
            this.d = H2DatabaseProvider.a(
               this.m, NLoginCore_282.d, new File(var1.d().getParentFile(), a(cm, cn)), new Properties(), a(co, cp ^ cq), null
            );
            break;
         case 1:
            this.d = NLoginCore_586.a(this.m, new File(var1.d().getParentFile(), a(cr, ct ^ cu)), new Properties());
            break;
         case 2:
         case 3:
         case 4:
            String var5 = var1.a(a(cv, cw ^ cx), a(cy, cz));
            String var6 = var1.a(a(da & db, dc), a(dd, df));
            String var7 = var1.a(a(dh, di ^ dj), a(dk & dl, dm));
            String var8 = var1.b(a(dn, dp ^ ds));
            int var9 = var1.a((String)a(dt & du, dv));
            if (var9 > 0 && var9 < dw) {
               var5 = var5 + a(dx & dz, eb) + var9;
            }

            Properties var10 = new Properties();
            int var12 = ec;
            switch (var2.hashCode()) {
               case -1620389036:
                  if (var2.equals(a(er, es ^ et))) {
                     var12 = eu;
                  }
                  break;
               case 73844866:
                  if (var2.equals(a(ed, ee ^ ef))) {
                     var12 = ek;
                  }
                  break;
               case 1557169620:
                  if (var2.equals(a(em, eo ^ ep))) {
                     var12 = eq;
                  }
            }

            switch (var12) {
               case 0:
                  this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var10, NLoginCore_036.d.i()));
                  return;
               case 1:
                  this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var10, NLoginCore_036.c.i()));
                  return;
               case 2:
                  this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var10, NLoginCore_036.e.i()));
                  return;
               default:
                  return;
            }
         default:
            throw new IllegalArgumentException(a(ex, ez) + var2);
      }
   }

   static {
      b();
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(fa, fc ^ ff));
      String var2 = var1.getString(a(fh, fi ^ fj));
      String var3 = var1.getString(a(fl, fn ^ fo));
      long var4 = var1.getLong(a(fp & fr, ft));
      long var6 = var1.getLong(a(fv, fx ^ fy));
      boolean var8 = var1.getBoolean(a(fz, ga ^ gb));
      Consumer var9 = var4x -> var4x.a(var6, var4);
      String[] var10 = var2.split(a(gc, ge ^ gf));
      if (var10.length > gg) {
         String var11 = var10[gh].toUpperCase(Locale.ENGLISH);
         int var13 = gj;
         switch (var11.hashCode()) {
            case -812585448:
               if (var11.equals(a(gz, ha))) {
                  var13 = hg;
               }
               break;
            case -26212441:
               if (var11.equals(a(gw, gx))) {
                  var13 = gy;
               }
               break;
            case -26212436:
               if (var11.equals(a(gs & gt, gu))) {
                  var13 = gv;
               }
               break;
            case 1615:
               if (var11.equals(a(hh, hi ^ hl))) {
                  var13 = hm;
               }
               break;
            case 82060:
               if (var11.equals(a(gm, go ^ gp))) {
                  var13 = gq;
               }
         }

         switch (var13) {
            case 0:
               if (var10.length != ho) {
                  throw new IllegalArgumentException(a(hy, hz) + var10.length);
               }

               String var10000 = a(ic, id ^ ig);
               Object[] var10001 = new Object[ii];
               var10001[ij] = var10[im];
               var10001[in] = var10[iq];
               var2 = String.format(var10000, var10001);
            case 1:
            case 2:
            case 3:
            case 4:
               break;
            default:
               this.e(this.r, var2, var11);
               return;
         }
      } else {
         if (var2.length() != ir) {
            this.e(this.r, var2, null);
            return;
         }

         var2 = a(it, iv ^ iw) + var2;
      }

      if (var8) {
         this.a(this.r, var2, var3, null, null, var9);
      } else {
         this.a(this.r, var2, var3, null, var9);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_413.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_530.C("рѢѤфѨ҇ѿҕҁѐҎ҄ҒҌѕѺҜқғҙғѨ", (byte)33, 67), NLoginCore_413.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.B("ĤıİóĳįĪĳľĭúĸļĵĸľĀҕҏҘ҉ҋҐѬҞҋҒĖ", (byte)33, 66) + var1 + NLoginCore_451.E("ԗ", (byte)33, 69) + var2.toString(), var4
         );
      }
   }
}
