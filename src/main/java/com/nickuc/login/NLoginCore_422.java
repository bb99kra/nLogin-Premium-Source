package com.nickuc.login;

import com.nickuc.login.loader.MemClassLoader;
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

public class NLoginCore_422 {
   private static int bu = (16 >>> 228 | 16 << -228) & -1;
   private static int ab = Integer.reverse(0);
   private static int ch = (608 >>> 101 | 608 << -101) & -1;
   private static int am = 147456 >>> 206 | 147456 << -206;
   private static int ah = Integer.reverse(268435456);
   private static int ca = 0 >>> 7 | 0 << ~7 + 1;
   private static int e = Integer.reverse(-1);
   private final String bd;
   private static long ar = Long.reverse(6408985719495144074L);
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private final String bf;
   private static long as = Long.reverse(-4179340454199820288L);
   private static long j = Long.reverse(-4179340454199820288L);
   private static int ba = 36 >>> 194 | 36 << -194;
   private static int cd = Integer.reverse(1073741824);
   private static int bc = Integer.reverse(805306368);
   private static long bw = Long.reverse(-6993726771559452022L);
   private static long bz = Long.reverse(-4179340454199820288L);
   private static int bg = 0 >>> 187 | 0 << -187;
   private static long bt = Long.reverse(-6993726771559452022L);
   private static int ao = Integer.reverse(-1610612736);
   private static int q = Integer.reverse(-1610612736);
   private static String[] a = new String[ch];
   private static int x = Integer.reverse(0);
   private final String bc;
   private static int c = (0 >>> 17 | 0 << ~17 + 1) & -1;
   private static long s = Long.reverse(-4179340454199820288L);
   private static int au = Integer.reverse(268435456);
   private static int ci = Integer.reverse(-939524096);
   private static int bs = Integer.reverse(-1);
   private static int ac = 7340032 >>> 180 | 7340032 << -180;
   private final String bh;
   private static long c;
   private static long bd = Long.reverse(6408985719495144074L);
   private static long m = Long.reverse(-4179340454199820288L);
   private boolean Y;
   private static String[] b = new String[ci];
   private static int br = Integer.reverse(-268435456);
   private static int al = 8192 >>> 75 | 8192 << ~75 + 1;
   private static long ae = Long.reverse(-4179340454199820288L);
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int az = Integer.reverse(0);
   private static int bx = Integer.reverse(-2013265920);
   private static long o = Long.reverse(-6993726771559452022L);
   private static int ce = 0 >>> 250 | 0 << ~250 + 1;
   private static int ag = (262144 >>> 209 | 262144 << -209) & -1;
   private static int cg = Integer.reverse(0);
   private static int bi = 64 >>> 69 | 64 << -69;
   private static long aw = Long.reverse(6408985719495144074L);
   private static int k = Integer.reverse(-1073741824);
   private static int bh = Integer.reverse(-805306368);
   private static int bb = (20 >>> 33 | 20 << ~33 + 1) & -1;
   private String bj;
   private static long w = Long.reverse(-6993726771559452022L);
   private static int bl = (0 >>> 32 | 0 << -32) & -1;
   private static int ap = Integer.reverse(1610612736);
   private static long i = Long.reverse(6408985719495144074L);
   private static long cc = Long.reverse(-6993726771559452022L);
   private static int p = 0 >>> 88 | 0 << ~88 + 1;
   private static long l = Long.reverse(6408985719495144074L);
   private final String be;
   private static long aj = Long.reverse(-6993726771559452022L);
   private static int v = -1 >>> 148 | -1 << -148;
   private static int n = Integer.reverse(536870912);
   private static int bv = (1 >>> 124 | 1 << -124) & -1;
   private static long f = Long.reverse(-6993726771559452022L);
   private static int bq = Integer.reverse(-201326592);
   private static int ak = (12 >>> 98 | 12 << ~98 + 1) & -1;
   private static int ai = -1 >>> 236 | -1 << ~236 + 1;
   private static long by = Long.reverse(6408985719495144074L);
   private static long ad = Long.reverse(6408985719495144074L);
   private static int ay = Integer.reverse(Integer.MIN_VALUE);
   private static long bo = Long.reverse(-6993726771559452022L);
   private final String bi;
   private static int t = Integer.reverse(0);
   private static long an = Long.reverse(-6993726771559452022L);
   private static int z = 536870912 >>> 157 | 536870912 << ~157 + 1;
   private static int aq = Integer.reverse(1342177280);
   private static int bp = Integer.reverse(1946157056);
   private static long be = Long.reverse(-4179340454199820288L);
   private static long y = Long.reverse(2562548187973812224L);
   private static int g = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static int af = (16384 >>> 110 | 16384 << -110) & -1;
   private static int h = 4096 >>> 75 | 4096 << -75;
   private static int a = Integer.reverse(0);
   private static long ax = Long.reverse(-4179340454199820288L);
   private static int bm = (1835008 >>> 81 | 1835008 << ~81 + 1) & -1;
   private static long r = Long.reverse(6408985719495144074L);
   private static int at = (-536870912 >>> 93 | -536870912 << -93) & -1;
   private static int bj = Integer.reverse(-1342177280);
   private static long b = Long.reverse(-6993726771559452022L);
   private static int aa = (384 >>> 69 | 384 << ~69 + 1) & -1;
   private static int cb = Integer.reverse(1207959552);
   private static int u = 1572864 >>> 18 | 1572864 << -18;
   private static int av = 5767168 >>> 83 | 5767168 << -83;
   private final String bg;
   private static int bn = (-1 >>> 40 | -1 << ~40 + 1) & -1;
   private static long bk = Long.reverse(-6993726771559452022L);
   private static int cf = (0 >>> 30 | 0 << ~30 + 1) & -1;

   @Generated
   public String W() {
      return this.bj;
   }

   private String a(String var1, ClassLoader var2) {
      return null;
   }

   @Generated
   public NLoginCore_422(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      this.bc = var1;
      this.bd = var2;
      this.be = var3;
      this.bf = var4;
      this.bg = var5;
      this.bh = var6;
      this.bi = var7;
   }

   @Generated
   public boolean ai() {
      return this.Y;
   }

   private String a(ClassLoader var1, String... var2) {
      return null;
   }

   private static void b() {
      c = 5858321907447926554L;
      long var0 = c ^ -6659878768329053424L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(10 + 58),
               (byte)(39 + 30),
               (byte)(70 + 13),
               (byte)(20 + 27),
               (byte)(25 + 42),
               (byte)(12 + 54),
               (byte)(2 + 65),
               (byte)(24 + 23),
               (byte)(27 + 53),
               (byte)(63 + 12),
               (byte)(5 + 62),
               (byte)(67 + 16),
               (byte)(23 + 30),
               80,
               97,
               (byte)(16 + 84),
               (byte)(21 + 79),
               (byte)(6 + 99),
               (byte)(52 + 58),
               (byte)(18 + 85)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_110.F("ՒԵՒ՟ՂԴՉիՂլԪԴ", (byte)48, 70);
               b[1] = NLoginCore_138.D("ҶѷґҒғҶҷҹҵҠӂһҒҿҖҿҜҟ҇ӌҮҬҼҌұҡӁӄӆӄҜҳҴӋӟӁӢӞӣңӢҡӚҴӝҤҢҬӌӀӬӋҾӱҸҹ", (byte)48, 68);
               b[2] = NLoginCore_530.D("ҋҾӀѼҞһҜҡҮҏҧҶӆӄӃһ҉ҚӆҍӀҏҧҏӇҬәӌӛҭҽҖҧӜӌӛҭӗӚҟӞҢӄӃӓҧҽӚӂӚӪӥӨӣӔӉӡұӹӐӱӲӮӪӜӶԀӕӷӲӻӒӸӜӺӍ", (byte)48, 68);
               b[3] = NLoginCore_076.B("ŏĥĔīŚļīĮĹŚĺĕŠĲĦĴŇňĴĢŔņĽĺūıŀůŲŢŁŘ", (byte)48, 66);
               b[4] = NLoginCore_559.C("Ҏҽ҉ҢҍѹҐҸҰҙҾҍ", (byte)48, 67);
               b[5] = NLoginCore_092.F(
                  "ԷՃԝԶԟԴԸիեԧԨԭԬգժթաՄՃԱթՕՊՅՓՔԾռ՚՝վձԿոՑնքնՠ\u058cշՄՍտւ֍՟եքխոէՕք\u058bիյվՑՒ֚ա֓օ֍֙՝ձ֗ըէ։֡ֆօֱրպվִ֤֪֣֝֠։֧֯֎ַռ֍ֹ֯֫֟֍֚֠\u05c8ָֺּ֪֨\u05c9֍\u05ca\u05c8ׂ\u05c9\u05cc֥֮\u05cc֘\u05cfׅ֖֨\u05c9ךְ֭֩֗גֱַ֢֞\u05c8תץ֩֬םתסױכ׳ּ\u05cd֯׆ש\u05c9הקא\u05fb\u05c8\u05faֱ\u05f8ַײײ\u05cc",
                  (byte)48,
                  70
               );
               b[6] = NLoginCore_387.B("ŅĨŅŒĵħļŞĵşĝħ", (byte)48, 66);
               b[7] = NLoginCore_471.F("ՂԾԤ՛դԣ\u0558ՕՃժգձՇՒՆՓՑՂյՆգչնԳ՜հջՎվԸՃԼ", (byte)48, 70);
               b[8] = NLoginCore_201.A("ŖőńŗĹŚĲŗōŕĺļŕĶńŚħœļĪŅĪĬŬĪŁŢśľįūŧřŁĺŮŵŧżŎŀŹŰŇ", (byte)48, 65);
               b[9] = NLoginCore_110.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԲխ՜ըըռՏԸնմղսֆւշչյֆյրքկՔ", (byte)48, 69);
               b[10] = NLoginCore_553.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԳ\u0557կվՊձՔՓՒԹՌդՕՆՒօֆգ\u0557զՍ՟Ք", (byte)48, 69);
               b[11] = NLoginCore_110.E("զՀաՃՁԳԾՍԿԥ՝ԾՏբԫԼյեԯՌՙէՌ՝ՉՍՎՑնյԻՒ", (byte)48, 69);
               b[12] = NLoginCore_553.C("ҿҙҺҜҚҌҗҦҘѾҸҠӆҁ҂ҼҧқҼҎӀӑӌҋҨӄӋӇҰғҔҚ", (byte)48, 67);
               b[13] = NLoginCore_110.F("եԤԝՔԠՄՉՊԷԷԡ՞Ղթ՟ՄՍժէՔՌՓ՜ռղ\u0558րհռկ՚չ՛ՁվՄ՜ճՖՈժվ\u0558լթղռՑՎ֒\u0590֎\u0558ղ՟ՠ", (byte)48, 70);
               b[14] = NLoginCore_453.F("Ի՚ԶԞՃժ՞ԸԿԦԻԴ", (byte)48, 70);
               b[15] = NLoginCore_092.B("ŇŕĦņņśĲňŜīŔħ", (byte)48, 66);
               b[16] = NLoginCore_397.B("ĮĤİĕŇŘňįœĪĺŚĴěķĞĿŕşĹŭśĲĳ", (byte)48, 66);
               b[17] = NLoginCore_427.C("ғҠѼҴӃқҏҭҦҷҘҍ", (byte)48, 67);
               b[18] = NLoginCore_427.A("ŎĲŚĚĳŐŝŊŏŀęħ", (byte)48, 65);
               break;
            case 1:
               b[0] = NLoginCore_091.B("ŔŋĶĮĘĝŝėľŏŌħ", (byte)48, 66);
               b[1] = NLoginCore_521.C("ҶѷґҒғҶҷҹҵҠӂһҒҿҖҿҜҟ҇ӌҮҬҼҌұҡӁӄӆӄҜҳҴӋӟӁӢӞӣңӢҡӜөӉӘҦӖӀөӟӮӦҮӧҴҾҿҮӣҺҭӓӶ", (byte)48, 67);
               b[2] = NLoginCore_110.F("ԲեէԣՅբՃՈՕԶՎ՝խիժբ\u0530ՁխԴէԶՎԶծՓրճւՔդԽՎփճւՔվցՆօՉիժպՎդցթց֑\u058c֏֊ջհֈ\u0558֠շ֑֘֙֕ց֘՝֣֖֟֬ֆ֦֭֠մ", (byte)48, 70);
               b[3] = NLoginCore_076.B("ŏĥĔīŚļīĮĹŚĺĕŠĲĦĴŇňĴĢŔŖĻĿħŦŋĬŇņŞŒ", (byte)48, 66);
               b[4] = NLoginCore_433.E("ՠՔԱ՛ՅԻՓԸԵՀԿԴ", (byte)48, 69);
               b[5] = NLoginCore_232.C(
                  "ҐҜѶҏѸҍґӄҾҀҁ҆҅ҼӃӂҺҝҜҊӂҮңҞҬҭҗӕҳҶӗӊҘӑҪӏӝӏҹӥӐҝҦӘӛӦҸҾӝӆӑӀҮӝӤӄӎӗҪҫӳҺӬӞӦӲҶӊӰӁӀӢӺӟӞԊәӓӗӶӽӹԍԃӼӢԈԀӧԐӕӦԈԒԄӸӦӳӹԡԃԕԓԁԑԢӦԣԡԛԢԥӾԇԥӱԨԞԁӯԢԳԂӰԉԆԫԊӻԐӷԡՃԾԂԅԶՃԺՊԴՌԕԦԈԟՂԢԭԽԓԨԵԎԘԣՃՆԥՇ",
                  (byte)48,
                  67
               );
               b[6] = NLoginCore_091.E("\u0530ԹԺՑՅԠԢԹիԹԮԴ", (byte)48, 69);
               b[7] = NLoginCore_110.E("ՂԾԤ՛դԣ\u0558ՕՃժգձՇՒՆՓՑՂյՆգԲԷդպթ\u0557ՠՍ՝խՁո՞ՑևՂտոՉևՀ։Ք", (byte)48, 69);
               b[8] = NLoginCore_324.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԷԹչԷՎկըՋԼոմՄքՇՁՖքզ։Մտ։Ք", (byte)48, 69);
               b[9] = NLoginCore_110.F("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԲխ՜ըըռՏԸնմղՙԼՙՀՓՔՖ՞թա՚\u0558ՎլՓ֑Ս֏֑\u0590֎բ՟ՠ", (byte)48, 70);
               b[10] = NLoginCore_384.B("ŖőńŗĹŚĲŗōŕĺļŕĶńŚħœļĪŅĦŊŢűĽŤŇņŅĬĿŭũűŉŴĺİųŲŹŢƂƃŹşřŁŚŃžŦƋŒœ", (byte)48, 66);
               b[11] = NLoginCore_241.D("ҿҙҺҜҚҌҗҦҘѾҶҗҨһ҄ҕӎҾ҈ҥҲҾҰӖӖӊҎҙӘӉӝҰҽґӌӛҬҞӟӤӐӒӖҭ", (byte)48, 68);
               b[12] = NLoginCore_575.F("զՀաՃՁԳԾՍԿԥ՟ՇխԨԩգՎՂգԵէԴՆՒ՛\u0530՝ՉիՊիՁՖՑփշՕՙրգբ֍֍Ք", (byte)48, 70);
               b[13] = NLoginCore_076.C("ҾѽѶҭѹҝҢңҐҐѺҷқӂҸҝҦӃӀҭҥҬҵӕӋұәӉӕӈҳӒҴҚӗҝҵӌүҡӃӗҳӚӝӃҷӟҷҮӘӚҨӭӄӬӂүӖӎӺӍҳӎ", (byte)48, 67);
               b[14] = NLoginCore_446.A("ĵĹĢęĔļĦŇőşġħ", (byte)48, 65);
               b[15] = NLoginCore_241.F("ՏԸԼբբԶԦԿԪՌԺգՅՆ՜Ց\u0530ՆԶիՉոԿՀ", (byte)48, 70);
               b[16] = NLoginCore_451.C("ҔҊҖѻҭҾҮҕҹҐҡ҉ӃҾҞҡҫӌӆґҿӑҘҙ", (byte)48, 67);
               b[17] = NLoginCore_324.F("ԲՃՙեԵԡՖԤՠԿՙԴ", (byte)48, 70);
               b[18] = NLoginCore_232.E("\u0530ՒՖՀէՙԩԼԟ՝ՙԴ", (byte)48, 69);
               break;
            case 2:
               b[0] = NLoginCore_433.C("ҚѾѿҠҊҽӂҞҽҼҧ҃Ҕ҄ӍҠӎӈҐҏӎҫҘҙ", (byte)48, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_127.A("įĨĒŎĕŎĸĲĵŠķĚĿĵĥġĳŞŊũňŜşŏŇŭŊĲŇŖŴų", (byte)48, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 99L;
      var1 ^= -6659878768329053424L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     (byte)(61 + 8),
                     (byte)(52 + 31),
                     (byte)(33 + 14),
                     (byte)(60 + 7),
                     (byte)(56 + 10),
                     (byte)(40 + 27),
                     (byte)(10 + 37),
                     (byte)(16 + 64),
                     75,
                     (byte)(16 + 51),
                     (byte)(9 + 74),
                     (byte)(21 + 32),
                     (byte)(59 + 21),
                     (byte)(94 + 3),
                     (byte)(51 + 49),
                     (byte)(87 + 13),
                     (byte)(2 + 103),
                     (byte)(50 + 60),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(77 + 6)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.A("üĉĈËċćĂċĖąÒĐĔčĐĖØѤќђѣѦѧѵѶѧѹњѨ", (byte)13, 65));
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

   public void a(String var1, MemClassLoader var2) {
      String var3 = this.a(var1, var2.getParentLoader());
      if (var3 != null) {
         NLoginCore_370.d(a(a, b));
         NLoginCore_370.d(a(d & e, f));
         NLoginCore_370.d(a(h, i ^ j) + var1 + a(k, l ^ m) + var3 + a(n, o));
         NLoginCore_370.d(a(q, r ^ s));
         NLoginCore_370.d(a(u & v, w));

         try {
            Thread.sleep(y);
         } catch (InterruptedException var5) {
            throw new RuntimeException(var5);
         }

         this.Y = (boolean)z;
         this.bj = var3;
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_422.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_422.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.D("պևֆՉ։օր։֔փՐ֎֒\u058b֎֔Ֆ\u08e2࣐ࣦࣚ࣡ࣤࣥࣳࣴࣥࣷࣘծ", (byte)118, 68) + var1 + NLoginCore_471.E("լ", (byte)118, 69) + var2.toString(), var4
         );
      }
   }
}
