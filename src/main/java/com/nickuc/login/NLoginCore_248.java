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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_248 extends NLoginCore_098 {
   private static int y = (2048 >>> 11 | 2048 << -11) & -1;
   private static long gi = Long.reverse(8519434885071997305L);
   private static long df = Long.reverse(5348900747403168121L);
   private static int hj = Integer.reverse(1140850688);
   private static long p = Long.reverse(8519434885071997305L);
   private static int iu = Integer.reverse(-1);
   private static int fl = Integer.reverse(-1744830464);
   private static int em = (-1 >>> 13 | -1 << ~13 + 1) & -1;
   private static long fx = Long.reverse(8519434885071997305L);
   private static long hl = Long.reverse(8519434885071997305L);
   private static int dz = Integer.reverse(-939524096);
   private static long ik = Long.reverse(5348900747403168121L);
   private static long dy = Long.reverse(8519434885071997305L);
   private static int cv = Integer.reverse(805306368);
   private static int gc = Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << ~159 + 1;
   private static long ig = Long.reverse(8519434885071997305L);
   private static int dx = (-1 >>> 75 | -1 << -75) & -1;
   private static int ek = Integer.reverse(671088640);
   private static long gp = Long.reverse(4323455642275676160L);
   private static int z = Integer.reverse(-1);
   private static int cr = 11534336 >>> 116 | 11534336 << ~116 + 1;
   private static int in = (-536870908 >>> 221 | -536870908 << ~221 + 1) & -1;
   private static long eo = Long.reverse(8519434885071997305L);
   private static int iq = Integer.reverse(-1);
   private static long by = Long.reverse(5348900747403168121L);
   private static String[] e = new String[NLoginCore_248.ja];
   private static int hy = (-1879048192 >>> 122 | -1879048192 << -122) & -1;
   private static int it = Integer.reverse(335544320);
   private static int cs = (-1 >>> 109 | -1 << ~109 + 1) & -1;
   private static int ix = '쀀' >>> 238 | 49152 << ~238 + 1;
   private static long fc = Long.reverse(5348900747403168121L);
   private static int fa = (385875968 >>> 88 | 385875968 << ~88 + 1) & -1;
   private static long hi = Long.reverse(8519434885071997305L);
   private static long bk = Long.reverse(5348900747403168121L);
   private static int gm = (240 >>> 99 | 240 << -99) & -1;
   private static int m = -1 >>> 223 | -1 << ~223 + 1;
   private static long fq = Long.reverse(5348900747403168121L);
   private static int cg = Integer.reverse(268435456);
   private static int bn = Integer.reverse(-1610612736);
   private static int ja = Integer.reverse(-1811939328);
   private static int bw = Integer.reverse(1610612736);
   private static long gr = Long.reverse(5348900747403168121L);
   private static int hh = -1 >>> 213 | -1 << ~213 + 1;
   private static int jb = Integer.reverse(-1811939328);
   private static int fz = (2048 >>> 42 | 2048 << ~42 + 1) & -1;
   private static int iy = 0 >>> 98 | 0 << ~98 + 1;
   private static int eq = (344064 >>> 78 | 344064 << ~78 + 1) & -1;
   private static int ao = (-1 >>> 96 | -1 << ~96 + 1) & -1;
   private static long gx = Long.reverse(5348900747403168121L);
   private static int cm = Integer.reverse(1462763520);
   private static long ez = Long.reverse(8519434885071997305L);
   private static int gj = Integer.reverse(-1207959552);
   private static long gk = Long.reverse(8519434885071997305L);
   private static int bp = (-1 >>> 106 | -1 << ~106 + 1) & -1;
   private static int hm = Integer.reverse(536870912);
   private static int hg = Integer.reverse(-2080374784);
   private static int co = (5242880 >>> 211 | 5242880 << ~211 + 1) & -1;
   private static long dv = Long.reverse(8519434885071997305L);
   private static long et = Long.reverse(4323455642275676160L);
   private static long fi = Long.reverse(8519434885071997305L);
   private static long hp = Long.reverse(8519434885071997305L);
   private static long o;
   private static long br = Long.reverse(8519434885071997305L);
   private static long ab = Long.reverse(8519434885071997305L);
   private static int gg = Integer.reverse(-1);
   private static long ha = Long.reverse(4323455642275676160L);
   private static int ie = Integer.reverse(-1543503872);
   private static long cd = Long.reverse(5348900747403168121L);
   private static int fv = Integer.reverse(-671088640);
   private static long go = Long.reverse(5348900747403168121L);
   private static int im = 0 >>> 173 | 0 << ~173 + 1;
   private static int dn = (0 >>> 50 | 0 << -50) & -1;
   private static long ff = Long.reverse(4323455642275676160L);
   private static long dg = Long.reverse(4323455642275676160L);
   private static long ca = Long.reverse(4323455642275676160L);
   private static long dm = Long.reverse(8519434885071997305L);
   private static int fw = -1 >>> 31 | -1 << ~31 + 1;
   private static long dc = Long.reverse(8519434885071997305L);
   private static long iv = Long.reverse(8519434885071997305L);
   private static int fp = ('퀀' >>> 'K' | 53248 << -75) & -1;
   private static int e = (0 >>> 62 | 0 << -62) & -1;
   private static int al = Integer.reverse(1073741824);
   private static long cp = Long.reverse(8519434885071997305L);
   private static int dw = (75497472 >>> 150 | 75497472 << ~150 + 1) & -1;
   private static long ct = Long.reverse(8519434885071997305L);
   private static long cw = Long.reverse(8519434885071997305L);
   private static int dh = Integer.reverse(0);
   private static long eb = Long.reverse(5348900747403168121L);
   private static int dt = 2176 >>> 199 | 2176 << -199;
   private static String[] f = new String[jb];
   private static int bd = Integer.reverse(-1073741824);
   private static long ds = Long.reverse(4323455642275676160L);
   private static int bi = Integer.reverse(536870912);
   private static long be = Long.reverse(5348900747403168121L);
   private static int da = -1 >>> 25 | -1 << -25;
   private static long ci = Long.reverse(8519434885071997305L);
   private static long ck = Long.reverse(8519434885071997305L);
   private static long is = Long.reverse(8519434885071997305L);
   private static long es = Long.reverse(5348900747403168121L);
   private static long hz = Long.reverse(8519434885071997305L);
   private static int gv = Integer.reverse(67108864);
   private static long il = Long.reverse(4323455642275676160L);
   private static long fn = Long.reverse(8519434885071997305L);
   private static long at = Long.reverse(8519434885071997305L);
   private boolean F;
   private static long cf = Long.reverse(4323455642275676160L);
   private static long gu = Long.reverse(4323455642275676160L);
   private static int dd = Integer.reverse(1879048192);
   private static int cb = Integer.reverse(-536870912);
   private static int ho = Integer.reverse(-1006632960);
   private static int cy = Integer.reverse(-1342177280);
   private static int ic = 0 >>> 25 | 0 << ~25 + 1;
   private static long ee = Long.reverse(4323455642275676160L);
   private static int gd = (28672 >>> 106 | 28672 << -106) & -1;
   private static int fh = Integer.reverse(402653184);
   private static long bm = Long.reverse(4323455642275676160L);
   private static long bh = Long.reverse(4323455642275676160L);
   private static int fm = -1 >>> 34 | -1 << ~34 + 1;
   private static int eu = Integer.reverse(1744830464);
   private static int cj = (576 >>> 230 | 576 << ~230 + 1) & -1;
   private static int gq = Integer.reverse(-134217728);
   private static int ex = Integer.reverse(-1);
   private static long ft = Long.reverse(4323455642275676160L);
   private static int dk = Integer.reverse(-268435456);
   private static long dp = Long.reverse(5348900747403168121L);
   private static int ii = (39845888 >>> 244 | 39845888 << ~244 + 1) & -1;
   private static int var_if = Integer.reverse(-1);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int var_do = (2 >>> 157 | 2 << -157) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_248.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_433.F("ԾՠբՂզօս֓տՎ\u058cւ\u0590֊Փո֑֑֚֙֗զ", (byte)90, 70), NLoginCore_248.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.C("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂࢉࢇ࢝\u0897\u086c࢟\u0894\u0892࢘ԗ", (byte)90, 67) + var1 + NLoginCore_183.A("ŭ", (byte)90, 65) + var2.toString(), var4
         );
      }
   }

   private File a(String var1) {
      String var2 = var1.replace(a(fp, fq ^ ft), a(fv & fw, fx));
      if (var2.length() >= fz) {
         var2 = var2.substring(gc);
         return new File(this.b(), var2);
      } else {
         throw new IllegalArgumentException(a(gd & gg, gi) + var1);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= -8429205658410143762L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(4 + 64),
                     (byte)(43 + 26),
                     (byte)(59 + 24),
                     (byte)(26 + 21),
                     (byte)(20 + 47),
                     (byte)(35 + 31),
                     (byte)(50 + 17),
                     (byte)(9 + 38),
                     (byte)(26 + 54),
                     (byte)(56 + 19),
                     67,
                     (byte)(11 + 72),
                     (byte)(7 + 46),
                     80,
                     (byte)(27 + 70),
                     (byte)(37 + 63),
                     (byte)(62 + 38),
                     (byte)(2 + 103),
                     (byte)(45 + 65),
                     (byte)(6 + 97)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.B("ĐĝĜßğěĖğĪęæĤĨġĤĪìѳѱ҇ҁі҉ѾѼ҂", (byte)23, 66));
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

   private static void b() {
      o = -7020667771944379310L;
      long var0 = o ^ -8429205658410143762L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(22 + 47),
               (byte)(64 + 19),
               47,
               (byte)(34 + 33),
               (byte)(48 + 18),
               (byte)(66 + 1),
               (byte)(3 + 44),
               (byte)(62 + 18),
               (byte)(31 + 44),
               (byte)(44 + 23),
               (byte)(6 + 77),
               (byte)(31 + 22),
               (byte)(35 + 45),
               (byte)(91 + 6),
               (byte)(78 + 22),
               (byte)(94 + 6),
               (byte)(76 + 29),
               (byte)(82 + 28),
               (byte)(66 + 37)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_004.C("қѽџљҤҁѡҟғѵѠѽҥҊҝѾҪҲ҈ҒҐҳѺѻ", (byte)38, 67);
               f[1] = NLoginCore_433.E("ԓԷԷԚԸՓՒգ՞՞ԤԪ", (byte)38, 69);
               f[2] = NLoginCore_575.B("ýĮĺĵĿĆģĪĈĦŇķĎĞČĉńēĵŘĶıĞğ", (byte)38, 66);
               f[3] = NLoginCore_451.A("ĚĲĖýĕĞĪīĜńŌē", (byte)38, 65);
               f[4] = NLoginCore_530.A("ĜľĤĥėûĕĉĥĝŇĞŉŅċĊĐńŖİĔŕőŘŎōĮĲĭŗŗĻţĿğĥŀĦũĶŔŘņĳ", (byte)38, 65);
               f[5] = NLoginCore_076.A("ĸıĦýęĄėŌĨěĘďęĺĮĊĦŒĳŉŉŗĞğ", (byte)38, 65);
               f[6] = NLoginCore_451.E("\u0530ՔԧՕԧՉ՜ՓԙԞԤԪ", (byte)38, 69);
               f[7] = NLoginCore_201.F("ԶԤԯ՛Ֆ\u0557՜Ԟԯ\u0530ԵԪ", (byte)38, 70);
               f[8] = NLoginCore_223.D("Ѷҗ҂ңҎѼңѲҤ҅҂ѯ", (byte)38, 68);
               f[9] = NLoginCore_027.F("ԣ՜Ե\u0558ՎՑԹԿԙ\u0557գԪ", (byte)38, 70);
               f[10] = NLoginCore_004.F("ՕՑԱՍԾԘԫԲԛԬՅԪ", (byte)38, 70);
               f[11] = NLoginCore_110.A("ĤĞĀňĥĞŃĴķĞĢĤĦŊŎĠŀĭŉĐħıĞğ", (byte)38, 65);
               f[12] = NLoginCore_141.C("ѶҎѲљѱѺ҆҇ѸҠҨѯ", (byte)38, 67);
               f[13] = NLoginCore_451.C("қѱњҞѽҖѵҗњқғѥѫ҉ѻѩѧҐѻҰ҆ҳѺѻ", (byte)38, 67);
               f[14] = NLoginCore_471.C("ҚѱѵѭѷѾҖ҅ѱѻ҂ѯ", (byte)38, 67);
               f[15] = NLoginCore_575.A("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġńĨņėīľŕŘŝĠř", (byte)38, 65);
               f[16] = NLoginCore_091.E("ՏՖԻԵ\u0530ԒԩԟԣգԥԘԵԾԠԲՇՀՅ՞զԾՌբՋՒՍթՉԴՑլ", (byte)38, 69);
               f[17] = NLoginCore_427.D("ҏҙғўҌғҞѷѾҊѲѯ", (byte)38, 68);
               f[18] = NLoginCore_530.D("ҊѼҜҐѰѶҔѤўћҩѽҔѾңѥҏѺѫҐҍҍѺѻ", (byte)38, 68);
               f[19] = NLoginCore_232.A("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġńĨņėīľŕŘŝĠř", (byte)38, 65);
               f[20] = NLoginCore_324.D("њїҎҘҙҤҝ҇ҘѹѻѪҜҘҬѨ҂ҨѫҜҭѲҰѴѶѷұѷҙѽѸѼ", (byte)38, 68);
               f[21] = NLoginCore_138.A("ĳĽķĂİķłěĢĮĖē", (byte)38, 65);
               f[22] = NLoginCore_553.C("ҌҚҗҍҙїѿѼҩҜҤѯ", (byte)38, 67);
               f[23] = NLoginCore_241.A("ĠăĠĒņĢĹĨċķĞē", (byte)38, 65);
               f[24] = NLoginCore_324.A("įįĺľĦĜłŃĴĺňē", (byte)38, 65);
               f[25] = NLoginCore_387.F("ԱՋ\u0530Ց\u0557ԼՎՙԴՓԶ\u0557ԯԡԽԪէԶժԭԨՉձըգՌՎՂՊԴԵղՃԼծՓԷԷՀոտ՞շՒէճ՟Ք՝ջՆըՅ֎ՕՖ", (byte)38, 70);
               f[26] = NLoginCore_387.D("ҌҍҕѯқѳѵѺўҁѽѷѹѥҁѪѫ҈ѱҧҁѽѺѻ", (byte)38, 68);
               f[27] = NLoginCore_141.F("ԱՉԭԔԬԵՁՂԳ՛գԪ", (byte)38, 70);
               f[28] = NLoginCore_397.D("ўѡѶљћҡҟҔѧѹѤҞѽҌ҃ҀҞѾҢҁѰѵҐҲҰҰҧҔҥѴҿҸѸҲҊѵҾҦ҃җҕҚҖҏ", (byte)38, 68);
               f[29] = NLoginCore_530.A("ĤĂĄŅŉđĶħŃłŌē", (byte)38, 65);
               f[30] = NLoginCore_201.A("đġĶĀĆĆĤĤĺĵĮē", (byte)38, 65);
               f[31] = NLoginCore_127.C("ѮѻҏѠѭқѯѠҦѲѥѯ", (byte)38, 67);
               f[32] = NLoginCore_027.D("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍҔҡѵҢѷѸҎ҇҅ҕѱҴҖҲҜңҹұӆҐңҖҏ", (byte)38, 68);
               f[33] = NLoginCore_453.C("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍґҶҶҴңүҊҤұґҒҐѽӂқҠҲқ҆ҼҗҒҏ", (byte)38, 67);
               f[34] = NLoginCore_110.E("ԻՊԗ՜ԧՋԪՠՄԭԼզՁԺԟՇՓԴՊԤՀԮՄՁՆՅՈԿյգճբ՜ՖլԶ՟մԷՖԵԽՄՊ", (byte)38, 69);
               f[35] = NLoginCore_232.F("ԻՊԗ՜ԧՋԪՠՄԭԹՓԙԥՁՙԿէդբՆՈը՟ըգՊԾաՙմ՛ՆՕո՚ԾՖլղփչեՊ", (byte)38, 70);
               f[36] = NLoginCore_241.C("ҠџѿѬҗќјҥѼҠҪ҇ҡѸҡѹ҆Ҝҩ҃ѦҳѺѻ", (byte)38, 67);
               f[37] = NLoginCore_223.B("čĮŁġĸńŀĳĄġĚŅĊĢŁġďŇĎŁĲďĵŏŋĔĜĚĳŝŃĳ", (byte)38, 66);
               f[38] = NLoginCore_559.C("ѰѯҏњҡѤҧѦҦҟҘҝҝҫ҆Ҍҏ҃Ңғ҈ҍѺѻ", (byte)38, 67);
               f[39] = NLoginCore_201.C("ѩҊҝѽҔҠҜҏѠѽѶҡѦѾҝѽѫңѪҝҎѫґҫҧѰѸѶҏҹҟҏ", (byte)38, 67);
               f[40] = NLoginCore_027.F("ԫԪՊԕ՜ԟբԡա՚Փ\u0558\u0558զՁՇՊԾ՝ՎՃՈԵԶ", (byte)38, 70);
               break;
            case 1:
               f[0] = NLoginCore_092.D("қѽџљҤҁѡҟғѵѠҙ҉҈ҚҰҠҠ҃ґҡҍѺѻ", (byte)38, 68);
               f[1] = NLoginCore_397.B("ĤĝļĢĈğĥĆōķŊĿŉņŉģœġĿőōŇĞğ", (byte)38, 66);
               f[2] = NLoginCore_575.F("ԔՅՑՌՖԝԺՁԟԽ՝՜ՆՐՁԷՇՠՉԻԿ՞ԵԶ", (byte)38, 70);
               f[3] = NLoginCore_397.D("ҟҚѸҙҍҘ҄ѧҡ҅Ҡѯ", (byte)38, 68);
               f[4] = NLoginCore_092.F("ԳՕԻԼԮԒԬԠԼԴ՞Եՠ՜Ԣԡԧ՛խՇԫլըկեդՅՉՄծծՒթզՖ՟չրսձՙՍԼՊ", (byte)38, 70);
               f[5] = NLoginCore_553.E("ՏՈԽԔ\u0530ԛԮգԿԲԮՅԹՐԡՅԦԴԹաՙԸԵԶ", (byte)38, 69);
               f[6] = NLoginCore_027.B("ĜĮąęþěĠĝĊĕĹĚĸņŎģĭŋģĪġŗĞğ", (byte)38, 66);
               f[7] = NLoginCore_223.B("łęįĄĝĸņĚþŉĽąĸĚċıœņņĒĴŇĞğ", (byte)38, 66);
               f[8] = NLoginCore_076.F("ԵՕԶԭՋԭԼբԮՍԱԪ", (byte)38, 70);
               f[9] = NLoginCore_384.B("ĴĖĸńĢĶĺŇĄŇļē", (byte)38, 66);
               f[10] = NLoginCore_433.B("ĄĜĘĘŃĀĥŇĺĉĮē", (byte)38, 66);
               f[11] = NLoginCore_127.F("ԻԵԗ՟ԼԵ՚ՋՎԵԺ\u0558ՃՓԢՊՔ՚ՂՖՎծԵԶ", (byte)38, 70);
               f[12] = NLoginCore_027.F("ՏՎ՝ԫԺ\u0530ԿՙգԷԠԪ", (byte)38, 70);
               f[13] = NLoginCore_433.D("қѱњҞѽҖѵҗњқғѹѤҪҀҭѩѫҦ҈ѲңѺѻ", (byte)38, 68);
               f[14] = NLoginCore_141.F("ՙԓԝՓ՞ՀՂՂԱՅԥԦԯԳՖէ՛Ԥխգ՜ԸԵԶ", (byte)38, 70);
               f[15] = NLoginCore_575.D("ҡҏѼѸҝѯѶҚҀҥѿѤҚҫѺѡѽѫҌѮѽҠҕ҂Ѱҷ҆ҹҽҘ҈ҌҷҙѹҴҾҭҽӃҔӉҦҏ", (byte)38, 68);
               f[16] = NLoginCore_173.A("ĸĿĤĞęûĒĈČŌĎāĞħĉěİĩĮŇŏĢňĶōĹĬŞŁĩĬŏįĽńśťŝļŗĶŘņĳ", (byte)38, 65);
               f[17] = NLoginCore_076.B("üēĎĲđĕĨĩŃĘłĿİŀŐĲġĢĮđĭıĞğ", (byte)38, 66);
               f[18] = NLoginCore_027.A("ĮĠŀĴĔĚĸĈĂÿōĘĨĦņđĤğĎńĔġĞğ", (byte)38, 65);
               f[19] = NLoginCore_521.B("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġĳŃńįĹőįŏŐŃŌŖŗĥŗĥŜħĩŜľĩĳ", (byte)38, 66);
               f[20] = NLoginCore_553.A("þûĲļĽňŁīļĝğĎŀļŐČĦŌďŀőĐįĻŉĸĸķŌĬŌŎŚĸŁŖŠţŇŊŅŝŨĳ", (byte)38, 65);
               f[21] = NLoginCore_446.F("ԗԕ\u0557ՔԕԮԹՒգա՝՛ԵՔԵԴթՙԫԩՐՈԵԶ", (byte)38, 70);
               f[22] = NLoginCore_451.B("ŀďøĘĖĝŇļĞŀĞĨħĞłļĞġŗĔŋŇĞğ", (byte)38, 66);
               f[23] = NLoginCore_141.C("ѿѴѸң҃ѶѾғѾҞѲѯ", (byte)38, 67);
               f[24] = NLoginCore_092.B("ė÷ęńĝĠĒĬĝąĊĆġļŁļŌŉŖŘĭŗĞğ", (byte)38, 66);
               f[25] = NLoginCore_232.B("ĚĴęĺŀĥķłĝļğŀĘĊĦēŐğœĖđĲŚőŌĵķīĳĝĞśĬĥŗļĠĠĩšŨŇţĻűĻŏŊũőŒňţĹİŤŰŶŚŷųŜĴŋ", (byte)38, 66);
               f[26] = NLoginCore_433.D("ҌҍҕѯқѳѵѺўҁѽңҔѿ҄Ѫ҈҈ҥѼѾңѺѻ", (byte)38, 68);
               f[27] = NLoginCore_183.F("Ա՝\u0530ԵԘԭԘԻՐԿԹԪ", (byte)38, 70);
               f[28] = NLoginCore_110.F("ԙԜԱԔԖ՜՚ՏԢԴԟՙԸՇԾԻՙԹ՝Լԫ\u0530ՋխիիբՏՠԯպճՐսշչէցչԹՙջՓ՛ք\u0557շըդՕփ\u058bժվՕՖ", (byte)38, 70);
               f[29] = NLoginCore_241.C("ҟѼҍѷҞҝҘҤң҂҆ѯ", (byte)38, 67);
               f[30] = NLoginCore_384.A("ĕĕŁŃėĶĉĥĖĄĥĬĎŊŒčĦŐĩŒĠıĞğ", (byte)38, 65);
               f[31] = NLoginCore_241.A("ĳİĝćŃāňŊČŉĸē", (byte)38, 65);
               f[32] = NLoginCore_141.D("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍҔҡѵҢѷѸҎ҇҅ҕѱҟҴҶҫҏ҅ҞҥҰҒҸҏ", (byte)38, 68);
               f[33] = NLoginCore_553.A("ěđďĘĔŉĨŋĵĸċĘğĿĒēĨćŕŗıĵŚŚŘŇœĮňŕĵĶšşŇŞĨļŉũŋŬŘĳ", (byte)38, 65);
               f[34] = NLoginCore_453.B("ĤĳĀŅĐĴēŉĭĖĥŏĪģĈİļĝĳčĩėĭĪįĮıĨŞŌŜŋģěĻšşŜľńśĥņĳ", (byte)38, 66);
               f[35] = NLoginCore_384.C("ҀҏќҡѬҐѯҥ҉ѲѾҘўѪ҆Ҟ҄ҬҩҧҋҍҭҤҭҨҏ҃ҦҞҹҠҽѹҘӃҭҚ҅ҿҚ҅҅ҏ", (byte)38, 67);
               f[36] = NLoginCore_173.D("ҠџѿѬҗќјҥѼҠҫѽҗ҉҇҉ѻ҈ѻҥ҈ңѺѻ", (byte)38, 68);
               f[37] = NLoginCore_201.F("ԤՅ\u0558ԸՏ՛\u0557ՊԛԸԱ՜ԡԹ\u0558ԸԦ՞ԥ\u0558ՉԨՌԾՓՈԾթհհՈՏ", (byte)38, 70);
               f[38] = NLoginCore_553.E("ԫԪՊԕ՜ԟբԡա՚ՕԝաԦՙԲԩԥՃՃԹՈԵԶ", (byte)38, 69);
               f[39] = NLoginCore_091.C("ѩҊҝѽҔҠҜҏѠѽѶҡѦѾҝѽѫңѪҝҎѲҖҘҀҕҤѸҧҶҮҕ", (byte)38, 67);
               f[40] = NLoginCore_384.F("ԫԪՊԕ՜ԟբԡա՚ՕՀՑՓՄըԶգՋէՉԸԵԶ", (byte)38, 70);
               break;
            case 2:
               f[0] = NLoginCore_110.D("ҕҔѠѳѼҁҔҀғҠѡѹҤҎѾѾҠѩ҃ѯ҇ѽѺѻ", (byte)38, 68);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_092.D("ѩѽҔҙѱѰ҄ѵҁѸ҉ѽѸ҄҈ѼұҢҪұҴҍѺѻ", (byte)38, 68);
         }
      }
   }

   private void a(String var1, UUID var2) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(gv, gx ^ ha));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(a(hg & hh, hi));
      } else if (var2 == null) {
         throw new IllegalArgumentException(a(hj, hl));
      } else if (var2.version() != hm) {
         throw new IllegalStateException(a(ho, hp) + var1 + a(hy, hz) + NLoginCore_432.b(var2));
      } else {
         NLoginCore_291 var3 = this.m.a();
         ForceRegisterConfig var4 = var3.a(var1, var2, null, (boolean)ic);
         if (var4 == null) {
            throw new RuntimeException(a(ie & var_if, ig) + var1 + a(ii, ik ^ il));
         } else {
            if (!var4.h()) {
               var4 = var3.a(var1, null, null, (boolean)im);
               if (var4 == null) {
                  throw new RuntimeException(a(in & iq, is) + var1 + a(it & iu, iv));
               }
            }

            var4.b(var2);
            UUID var5 = var4.a();
            if (var5 == null) {
               var5 = this.F ? var2 : NLoginCore_432.d(var1);
            } else if (var5.version() == ix && this.F) {
               var5 = var2;
            }

            var4.a(var5);
            if (var3.a(this.a, var4)) {
               this.k++;
            }
         }
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al & ao, at), a(bd, be ^ bh));
      if (var2.isEmpty()) {
         throw new IllegalArgumentException(a(bi, bk ^ bm));
      } else {
         this.F = var1.a(a(bn & bp, br), (boolean)bu);
         String var3 = var1.b(a(bw, by ^ ca)).trim().toLowerCase(Locale.ENGLISH);
         if (var3.contains(a(cb, cd ^ cf))) {
            this.d = NLoginCore_586.a(this.m, this.a(var2), new Properties());
         } else if (var3.contains(a(cg, ci))) {
            this.d = H2DatabaseProvider.a(this.m, NLoginCore_282.c, this.a(var2), new Properties());
         } else {
            int var4 = var1.a(a(cj, ck), cm);
            String var5 = var1.b(a(co, cp));
            String var6 = var1.a(a(cr & cs, ct), a(cv, cw));
            String var7 = var1.b(a(cy & da, dc));
            boolean var8 = var1.a(a(dd, df ^ dg), (boolean)dh);
            Properties var9 = new Properties();
            if (var8) {
               boolean var10 = var1.a(a(dk, dm), (boolean)dn);
               String var11 = var1.b(a(var_do, dp ^ ds));
               String var12 = var1.a(a(dt, dv), a(dw & dx, dy));
               var9.put(a(dz, eb ^ ee), var10);
               var9.put(a(ek & em, eo), var11);
               var9.put(a(eq, es ^ et), var12);
            }

            if (var3.contains(a(eu & ex, ez))) {
               this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var5, var4, var2, var6, var7, var9));
            } else if (var3.contains(a(fa, fc ^ ff))) {
               this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var5, var4, var2, var6, var7, var9));
            } else {
               if (!var3.contains(a(fh, fi))) {
                  throw new UnsupportedOperationException(a(fl & fm, fn) + var3);
               }

               this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var5, var4, var2, var6, var7, var9));
            }
         }
      }
   }

   public NLoginCore_248(NLoginType_008 var1) {
      super(var1, NLoginCore_479.O, a(e & m, p), a(y & z, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(gj, gk));
      boolean var2 = var1.getBoolean(a(gm, go ^ gp));
      if (var2) {
         UUID var3 = NLoginCore_432.c(var1.getString(a(gq, gr ^ gu)));
         if (var3 != null) {
            this.a(this.r, var3);
         }
      }
   }

   static {
      b();
   }
}
