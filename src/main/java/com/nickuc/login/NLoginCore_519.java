package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_519 {
   private static int s = Integer.reverse(-1610612736);
   private static int bo = (0 >>> 156 | 0 << -156) & -1;
   private static long f = Long.reverse(3589544318949612600L);
   private static long q = Long.reverse(3589544318949612600L);
   private static int v = Integer.reverse(1610612736);
   private static long k = Long.reverse(6917529027641081856L);
   private static int i = 2048 >>> 202 | 2048 << -202;
   private static long an = Long.reverse(6917529027641081856L);
   private static long w = Long.reverse(3589544318949612600L);
   private static float at = Float.intBitsToFloat(269484032 >>> 222 | 269484032 << ~222 + 1);
   private static long aw = Long.reverse(6917529027641081856L);
   private static int ai = (536870913 >>> 189 | 536870913 << ~189 + 1) & -1;
   private static int ac = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[NLoginCore_519.bq];
   private static long c;
   private static int bk = Integer.reverse(0);
   private static long n = Long.reverse(6917529027641081856L);
   private static String[] ZKM_STR_A = new String[NLoginCore_519.bp];
   private static int ae = 262144 >>> 241 | 262144 << -241;
   private static int bp = Integer.reverse(-2013265920);
   private static long ak = Long.reverse(6917529027641081856L);
   private static int bc = 458752 >>> 175 | 458752 << -175;
   private static long aj = Long.reverse(3589544318949612600L);
   private static long bh = Long.reverse(5895387328163306552L);
   private static int h = Integer.reverse(0);
   private static long av = Long.reverse(3589544318949612600L);
   private static int bl = Integer.reverse(0);
   private static int b = Integer.reverse(0);
   private static long g = Long.reverse(6917529027641081856L);
   private static int ax = 436207616 >>> 121 | 436207616 << ~121 + 1;
   private static int bm = Integer.reverse(0);
   private static long t = Long.reverse(3589544318949612600L);
   private static long j = Long.reverse(3589544318949612600L);
   private static int ar = Integer.reverse(0);
   private static long z = Long.reverse(3589544318949612600L);
   private static long x = Long.reverse(6917529027641081856L);
   private static int ba = Integer.reverse(0);
   private static int ao = 352 >>> 5 | 352 << ~5 + 1;
   private static long ay = Long.reverse(3589544318949612600L);
   private static long ap = Long.reverse(3589544318949612600L);
   private static long d = Long.reverse(5895387328163306552L);
   private static int bf = (0 >>> 171 | 0 << ~171 + 1) & -1;
   private static int bb = 0 >>> 201 | 0 << ~201 + 1;
   private static long az = Long.reverse(6917529027641081856L);
   private static int l = Integer.reverse(-1073741824);
   private static long m = Long.reverse(3589544318949612600L);
   private static int bn = 32 >>> 5 | 32 << -5;
   private static long bj = Long.reverse(5895387328163306552L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int c = -1 >>> 133 | -1 << -133;
   private static int br = Integer.reverse(0);
   private static int au = Integer.reverse(805306368);
   private static int p = 4096 >>> 42 | 4096 << -42;
   private static int y = (-2147483645 >>> 159 | -2147483645 << -159) & -1;
   private static long aa = Long.reverse(6917529027641081856L);
   private static int ab = ('쀀' >>> 'N' | 49152 << -78) & -1;
   private static long ah = Long.reverse(6917529027641081856L);
   private static int af = (128 >>> 4 | 128 << ~4 + 1) & -1;
   private static long aq = Long.reverse(6917529027641081856L);
   private static int bq = 2228224 >>> 209 | 2228224 << -209;
   private static long u = Long.reverse(6917529027641081856L);
   private static int bi = 4 >>> 158 | 4 << ~158 + 1;
   private static int o = (0 >>> 167 | 0 << -167) & -1;
   private static long ag = Long.reverse(3589544318949612600L);
   private static int al = (2621440 >>> 178 | 2621440 << -178) & -1;
   private static long am = Long.reverse(3589544318949612600L);
   private static int e = 8 >>> 99 | 8 << -99;
   private static long r = Long.reverse(6917529027641081856L);
   private static float as = Float.intBitsToFloat(Integer.reverse(3714));
   private static int ad = (65536 >>> 48 | 65536 << ~48 + 1) & -1;
   private static int bd = (-1 >>> 9 | -1 << ~9 + 1) & -1;
   private static final AtomicBoolean c = new AtomicBoolean((br != 0));
   private static long be = Long.reverse(5895387328163306552L);
   private static int bg = Integer.reverse(-268435456);

   private static void b() {
      c = 2034150577809197964L;
      long var0 = c ^ -7994166716336112185L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(23 + 45),
               (byte)(43 + 26),
               (byte)(54 + 29),
               (byte)(36 + 11),
               (byte)(64 + 3),
               (byte)(46 + 20),
               67,
               (byte)(29 + 18),
               (byte)(39 + 41),
               (byte)(10 + 65),
               (byte)(44 + 23),
               (byte)(32 + 51),
               (byte)(20 + 33),
               (byte)(11 + 69),
               (byte)(82 + 15),
               100,
               (byte)(25 + 75),
               (byte)(88 + 17),
               (byte)(40 + 70),
               (byte)(92 + 11)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(7 + 76)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_092.E(
                  "ՁԶգՁ՟ՀԷխՎԭծ՟ՁԿ՜դՈշԮԶՁջՃՌՅԼՖծչՁ՞ջօբԾաճաևՠզզցՆՍՏ֔ղՔմ֎ՠֈ֖֚\u058b֑ջվ֔֓ճց֎֝ք՞՚֝ՠցտ֢֘ը֢֡֬խ֮և֧֟֨ձ\u0590ջ֤֧֓\u058c֚֏ֹ֗փ׀׃ַּ֙։ַ֖֦ր֛֔", (byte)48, 69
               );
               ZKM_STR_B[1] = NLoginCore_183.B(
                  "ŔĭİĺļĪĩħœĴĺŏńğŧġŚħĜŚķŀŎŉŧŜũīįņİŮŮŇŚůĹŏŴŉŐŝűřłſŽŶņřſŽŷŧŨƍũƌƑůƌƎƄŉƗƊŧűƏŽŖƜŪƐŲźơƎƞŲƇŤƤƘƙŧƘžƜƲƋƈƏƩƤơƀƌƈƈƝƘŹƩƶŽƢƇ", (byte)48, 66
               );
               ZKM_STR_B[2] = NLoginCore_138.A("ĎŕĮŚřŕėğŎŊśĢĴšıĽĦĸœřūňŇŪőŤľŢŊłĿņŴŭĲŅļŴŮıĶŸŮŘŵŶŶŶłƊŷťƈťŒœ", (byte)48, 65);
               ZKM_STR_B[3] = NLoginCore_004.C("ҔҶѲҰѻһҵҼҏҾӈӇӇӈҭҦҮҏҞӑҪҎӁҿҐҢҥӗӗӜӇҶӒӌҝӝӂҢӎҼӂӛӂҾӈӠҿһӇӬӉӁҫһҸҹ", (byte)48, 67);
               ZKM_STR_B[4] = NLoginCore_530.C("ѺҾҙҟҮҤѽҿѾѽѿҍ", (byte)48, 67);
               ZKM_STR_B[5] = NLoginCore_397.F("ԻԴդԠ\u0557ՔժԿխԺՁԢԪՈԭէթմնչժՖկեյՖ\u0557ՋՍԾ\u0558ց", (byte)48, 70);
               ZKM_STR_B[6] = NLoginCore_138.D("ҰѵҒѳҁҟҡҾҖҀӂҍ", (byte)48, 68);
               ZKM_STR_B[7] = NLoginCore_324.F("ԥԵԢԼԣիԫժԼխ՚Ս՜ՉԳ՝ԭՄՈՕՎըԿՀ", (byte)48, 70);
               ZKM_STR_B[8] = NLoginCore_433.C("ѺҽҴҪӁ҂ҺқӃқҘҍ", (byte)48, 67);
               ZKM_STR_B[9] = NLoginCore_521.E("բԱԦԢՕՇՋաԩ՛՝Դ", (byte)48, 69);
               ZKM_STR_B[10] = NLoginCore_183.F("ԽԟԲզԼՕԨԢ՟ԿԿԴ", (byte)48, 70);
               ZKM_STR_B[11] = NLoginCore_004.E("ԯԴՄթՑժժԦԾԠթԴ", (byte)48, 69);
               ZKM_STR_B[12] = NLoginCore_451.E("ՑՁ՚ԸԧդՔԦԵ\u0557Շ՚ՠԤզԬԱզեԷմԲԹ՜ՔպՒ՟ծպշՔդՅմմթմքգփիփխ֊օհ՟ՍՈւՖաբ՟ՠ", (byte)48, 69);
               ZKM_STR_B[13] = NLoginCore_451.F("ՑՁ՚ԸԧդՔԦԵ\u0557Պ՚ՁԪՂՍՄԱՔեՈմՕԷԹթՓհ՛աՑմ՛ՠըեՙի։վտեըբփ՟բժ֑֔ւ\u0590քֈ՟ՠ", (byte)48, 70);
               ZKM_STR_B[14] = NLoginCore_173.C("һүӀҴҎұҾңҰҧҥӂҳҫҡӅҝҾҎҟҮҾӅӑҍҭӑҔҧӑҪҖҺҘӍүҞҺҚӘӣӃҳӥӪӕӌӢӞҥӐҬӇӱҸҹ", (byte)48, 67);
               ZKM_STR_B[15] = NLoginCore_138.A("ŁĪŉĴĻĻŚļĩœŁğĿŚŇĵıņĠŚňŗĥņŤŠŇŧłũŃķņŵŻŔŧņŖŌŔūŰŬŶſŹƄƀŸſƂŪŻŒœ", (byte)48, 65);
               ZKM_STR_B[16] = NLoginCore_241.D("ҧҐүҚҡҡӀҢҏҹҤ҅ҜҁҿҘҿӁҋҽӈӊҴҲҟӒӘҷҲӛҰӘҽӠҗҪұүҺӂҜҧӛӀҹӌӠҬӘһӑӄӌӱҸҹ", (byte)48, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_471.F(
                  "ՁԶգՁ՟ՀԷխՎԭծ՟ՁԿ՜դՈշԮԶՁջՃՌՅԼՖծչՁ՞ջօբԾաճաևՠզզցՆՍՏ֔ղՔմ֎ՠֈ֖֚\u058b֑ջվ֔֓ճց֎֝ք՞՚֝ՠցտ֢֘ը֢֡֬խ֮և֧֟֨ձ\u0590ջ֤֧֓\u058c֚֏ֹ֗փ֖֚֯\u05c8֣\u05caֻւ\u058c\u05ce֗֔",
                  (byte)48,
                  70
               );
               ZKM_STR_B[1] = NLoginCore_433.D(
                  "ҺғҖҠҢҐҏҍҹҚҠҵҪ҅Ӎ҇Ӏҍ҂ӀҝҦҴүӍӂӏґҕҬҖӔӔҭӀӕҟҵӚүҶӃӗҿҨӥӣӜҬҿӥӣӝӍӎӳӏӲӷӕӲӴӪүӽӰӍӗӵӣҼԂӐӶӘӠԇӴԄӘӭӊԊӾӿӍӾӤԂԘӱӮӵԏԊԇӮӯԓԒӝӣӠӭԦӼԢӭ", (byte)48, 68
               );
               ZKM_STR_B[2] = NLoginCore_471.A("ĎŕĮŚřŕėğŎŊśĢĴšıĽĦĸœřūňŇŪőŤľŢŊłĿņŴŭĲŅļŴŮıĶŸŮųŲńŕŰſŚŕƈŸƋŒœ", (byte)48, 65);
               ZKM_STR_B[3] = NLoginCore_553.D("ҔҶѲҰѻһҵҼҏҾӈӇӇӈҭҦҮҏҞӑҪҎӁҿҐҢҥӗӗӜӇҶӒӌҝӝӂҢӎҼӂӛӂӅҾӤҞӦӪһөӚҮӱҸҹ", (byte)48, 68);
               ZKM_STR_B[4] = NLoginCore_446.E("ՔԼ՟եԷԦՋԣծՃԫեԻՊ՞՟ՂզմնՖոԿՀ", (byte)48, 69);
               ZKM_STR_B[5] = NLoginCore_453.D("ҔҍҽѹҰҭӃҘӆғҚѻ҃ҡ҆ӀӂӍӏӒӃһӈҤӂҵҩүңӓҪӔ", (byte)48, 68);
               ZKM_STR_B[6] = NLoginCore_091.B("ħģņĪŘĺĪęėşŞĵĹŒŤĽĹţĤœŞŅĲĳ", (byte)48, 66);
               ZKM_STR_B[7] = NLoginCore_138.B("ĘĨĕįĖŞĞŝįŠŎķţŔŕĵģŕŒŪōŅĲĳ", (byte)48, 66);
               ZKM_STR_B[8] = NLoginCore_223.A("ŌĮėĲŔĭĭĪĸŎŔħ", (byte)48, 65);
               ZKM_STR_B[9] = NLoginCore_427.D("ҹүӁҙҪѿһҿҐӄҘҍ", (byte)48, 68);
               ZKM_STR_B[10] = NLoginCore_553.B("ĕŎĺıĴŗŕŚĜĸŢĞĳľŦğģťŠŦĺŅĲĳ", (byte)48, 66);
               ZKM_STR_B[11] = NLoginCore_183.B("ĪģĐŋĬļĐĵěőŎłĺįŅŇŠřĳţŇśĲĳ", (byte)48, 66);
               ZKM_STR_B[12] = NLoginCore_387.D("ҪҚҳґҀҽҭѿҎҰҠҳҹѽҿ҅ҊҿҾҐӍҋҒҵҭӓҫҸӇӓӐҭҽҞӍӍӂӍӝҼӜӄӛҽӛәҧӂӨӧәҭҪӱҸҹ", (byte)48, 68);
               ZKM_STR_B[13] = NLoginCore_521.F("ՑՁ՚ԸԧդՔԦԵ\u0557Պ՚ՁԪՂՍՄԱՔեՈմՕԷԹթՓհ՛աՑմ՛ՠըեՙի։վտեթՏ֍ըՏգճև֓փ։֘՟ՠ", (byte)48, 70);
               ZKM_STR_B[14] = NLoginCore_397.E("բՖէ՛Ե\u0558եՊ\u0557ՎՌթ՚ՒՈլՄեԵՆՕելոԴՔոԻՎոՑԽաԿմՖՅաՁտ֊ժՙչւջև֔տտտՊյբ՟ՠ", (byte)48, 69);
               ZKM_STR_B[15] = NLoginCore_451.F("ՎԷՖՁՈՈէՉԶՠՎԬՌէՔՂԾՓԭէՕդԲՓձխՔմՏնՐՄՓւֈամՓգՙաոսՉօՋէւՍըՠճժղ՟ՠ", (byte)48, 70);
               ZKM_STR_B[16] = NLoginCore_092.F("ՎԷՖՁՈՈէՉԶՠՋԬՃԨզԿզըԲդկձ՛ՙՆչտ՞ՙւ\u0557տդևԾՑ\u0558ՖաթՃՎփ՜ֈօ֒֓\u058bՈտրիղ՟ՠ", (byte)48, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.F("ԺԡԷՈ\u0557\u0557ԵՙԺ\u0557գ\u0530զՃԿբՒգՑԵժՒԿՀ", (byte)48, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_530.F("ՏէաՓԷԡԹգՎՆզՀ՜էճԫՉկՁՙՏԱՍճՕԵվՉչժդՔ", (byte)48, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_519.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.C("ѕѷѹљѽҜҔҪҖѥңҙҧҡѪҏұҰҨҮҨѽ", (byte)40, 67), NLoginCore_519.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬߞߥࠇߤߪࠄ߿\u07fbߩҁ", (byte)40, 67) + var1 + NLoginCore_091.B("ĉ", (byte)40, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 6L;
      var1 ^= -7994166716336112185L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     (byte)(11 + 58),
                     (byte)(6 + 77),
                     (byte)(42 + 5),
                     (byte)(57 + 10),
                     (byte)(9 + 57),
                     (byte)(59 + 8),
                     (byte)(2 + 45),
                     (byte)(5 + 75),
                     75,
                     (byte)(21 + 46),
                     83,
                     (byte)(40 + 13),
                     (byte)(33 + 47),
                     (byte)(13 + 84),
                     (byte)(69 + 31),
                     (byte)(8 + 92),
                     (byte)(29 + 76),
                     (byte)(47 + 63),
                     (byte)(29 + 74)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾࡰࡷ࢙ࡶࡼ\u0896\u0891ࢍࡻ", (byte)3, 70));
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

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File a(NLoginType_008 var0, @Nullable NLoginInterface_042 var1, boolean var2) {
      if (c.getAndSet((a != 0))) {
         if (var1 != null) {
            NLoginCore_150.a(var1, var2 ? a(b & c, d) : a(e, f ^ g));
         }

         return null;
      } else {
         if (var1 != null) {
            NLoginCore_150.a(var1, var2 ? a(i, j ^ k) : a(l, m ^ n));
         }

         boolean var12 = false /* VF: Semaphore variable */;

         File var16;
         label118: {
            label117: {
               File var4;
               try {
                  var12 = true;
                  NLoginCore_189 var3 = new NLoginCore_189();
                  var4 = new File(var0.c(), a(p, q ^ r));
                  if (!var4.exists() && !var4.mkdirs()) {
                     throw new IOException(a(s, t ^ u) + var4 + a(v, w ^ x));
                  }

                  StringBuilder var10000 = new StringBuilder();
                  String var10001 = a(y, z ^ aa);
                  Object[] var10002 = new Object[ab];
                  var10002[ac] = var3.an();
                  var10002[ad] = var3.am();
                  var10002[ae] = var3.al();
                  String var5 = var10000.append(String.format(var10001, var10002))
                     .append(a(af, ag ^ ah))
                     .append(var3.ak())
                     .append(a(ai, aj ^ ak))
                     .append(var3.aj())
                     .toString();
                  File var6 = NLoginCore_366.a(new File(var4, var5 + a(al, am ^ an)), var5 + a(ao, ap ^ aq));
                  List var7 = Arrays.stream(Objects.requireNonNull(var0.c().listFiles()))
                     .filter(var1x -> ((!var1x.equals(var4) != 0) ? bn : bo))
                     .collect(Collectors.toList());
                  if (var7.isEmpty()) {
                     var16 = null;
                     var12 = false;
                     break label118;
                  }

                  NLoginCore_350.a(var7, var6);
                  if (var1 != null) {
                     NLoginCore_150.a(var1, NLoginCore_194.C, as, at);
                     NLoginCore_150.a(var1, var2 ? a(au, av ^ aw) : a(ax, ay ^ az));
                  }

                  var16 = var6;
                  var12 = false;
                  break label117;
               } catch (Exception var13) {
                  NLoginCore_370.c(a(bc & bd, be), var13);
                  if (var1 != null) {
                     NLoginCore_150.a(var1, var2 ? a(bg, bh) : a(bi, bj));
                  }

                  var4 = null;
                  var12 = false;
               } finally {
                  if (var12) {
                     c.set((bm != 0));
                  }
               }

               c.set((bl != 0));
               return var4;
            }

            c.set((bb != 0));
            return var16;
         }

         c.set((ar != 0));
         return var16;
      }
   }
}
