package com.nickuc.login.tasks;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_477;
import com.nickuc.login.NLoginCore_232;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginCore_127;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_039;
import com.nickuc.login.NLoginInterface_048;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_183;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_548;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_553;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_521;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_141;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_471;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_487;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_433;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class LoginMainQueueTask implements Runnable {
   private static long y = Long.reverse(2449958197289549824L);
   private static long au = Long.reverse(2449958197289549824L);
   private static long l = Long.reverse(-4661387340910955053L);
   private static int ap = 41943040 >>> 246 | 41943040 << ~246 + 1;
   private static int zkm_e = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = (268435456 >>> 185 | 268435456 << -185) & -1;
   private static long c;
   private static long r = Long.reverse(2449958197289549824L);
   private static int n = 2 >>> 191 | 2 << ~191 + 1;
   private static int zkm_p = Integer.reverse(-1610612736);
   private static int bc = Integer.reverse(-1342177280);
   private static int z = Integer.reverse(0);
   private static long ai = Long.reverse(-4661387340910955053L);
   private static int am = Integer.reverse(-1879048192);
   private static int g = Integer.reverse(1073741824);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(-7111345538200504877L);
   private static final Set<NLoginCore_277> w = ConcurrentHashMap.newKeySet();
   private static long m = Long.reverse(2449958197289549824L);
   private static NLoginInterface_048 e;
   private static int k = -2147483647 >>> 63 | -2147483647 << ~63 + 1;
   private static int ba = Integer.reverse(-1);
   private static int b = Integer.reverse(0);
   private static int zkm_w = Integer.reverse(-536870912);
   private static int ae = Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << -63;
   private static long d = Long.reverse(-7111345538200504877L);
   private static final int aP = LoginMainQueueTask.be;
   private static long u = Long.reverse(2449958197289549824L);
   private static int av = Integer.reverse(0);
   private static long aj = Long.reverse(2449958197289549824L);
   private static long t = Long.reverse(-4661387340910955053L);
   private static int be = Integer.reverse(1593835520);
   private static int v = Integer.reverse(0);
   private static int ad = Integer.reverse(0);
   private static int h = Integer.reverse(-1);
   private final NLoginType_008 L;
   private static int s = 192 >>> 165 | 192 << ~165 + 1;
   private static final int aQ = LoginMainQueueTask.bf;
   private static int af = Integer.reverse(0);
   private static int al = Integer.reverse(0);
   private static long i = Long.reverse(-7111345538200504877L);
   private static String[] ZKM_STR_B = new String[LoginMainQueueTask.bd];
   private static int c = -1 >>> 107 | -1 << -107;
   private static int bd = 109051904 >>> 151 | 109051904 << -151;
   private static long ay = Long.reverse(6845471433603153920L);
   private static String[] ZKM_STR_A = new String[bc];
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static int an = Integer.reverse(-1);
   private static int j = Integer.reverse(0);
   private static long o = Long.reverse(-7111345538200504877L);
   private static int az = Integer.reverse(805306368);
   private static long ao = Long.reverse(-7111345538200504877L);
   private static long at = Long.reverse(-4661387340910955053L);
   private static int ag = Integer.reverse(0);
   private static int a = Integer.reverse(-1610612736);
   private static long ar = Long.reverse(-7111345538200504877L);
   private static int aa = 0 >>> 154 | 0 << -154;
   private static int bf = (256 >>> 102 | 256 << -102) & -1;
   private static long q = Long.reverse(-4661387340910955053L);
   private static long bb = Long.reverse(-7111345538200504877L);
   private static final Map<NLoginCore_277, LoginMainQueueTask$Cycle> p = new ConcurrentHashMap<>();
   private static int ac = 65536 >>> 112 | 65536 << -112;
   private static int as = -1073741822 >>> 158 | -1073741822 << -158;
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private static long x = Long.reverse(-4661387340910955053L);
   private static int aq = Integer.reverse(-1);
   private static long ax = Long.reverse(6845471433603153920L);

   static {
      b();
   }

   public LoginMainQueueTask(NLoginType_008 var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      if (this.L.N()) {
         if (!w.isEmpty()) {
            long var1 = System.nanoTime();
            NLoginCore_187 var3 = this.L.a();

            for (NLoginCore_277 var5 : w) {
               try {
                  LoginMainQueueTask$Cycle var6 = p.computeIfAbsent(var5, var0 -> new LoginMainQueueTask$Cycle());
                  if (!var6.aR()) {
                     return;
                  }

                  if (!var5.R()) {
                     n(var5);
                     return;
                  }

                  NLoginCore_509 var7 = var3.a(var5);
                  if (var7 == null) {
                     n(var5);
                     return;
                  }

                  synchronized (var7.n) {
                     NLoginCore_077 var9 = var7.a();
                     if (var9.b(NLoginCore_077.f)) {
                        NLoginCore_501 var10 = var7.d(NLoginCore_567.n);
                        if (var9 != NLoginCore_077.f || var10 == null || !(var10.b() instanceof NLoginInterface_039) || !((NLoginInterface_039)var10.b()).at()) {
                           n(var5);
                           return;
                        }
                     }

                     var7.aI();
                     ForceRegisterConfig var20 = var7.a();
                     boolean var11 = var20.A();
                     if (var9.d(NLoginCore_077.c)) {
                        int var12 = var7.a((NLoginCore_567)NLoginCore_567.z);
                        if (this.L.L() && !var20.u() && var12 == a && NLoginCore_532.b.ar() && !var7.a(NLoginCore_567.I)) {
                           NLoginType_010 var13 = this.L.c();
                           String var14 = var13.a(var5);
                           if (var13.a(var7, var14)) {
                              var7.a()
                                 .a(
                                    var7.j()
                                       ? a(b & c, d) + var14 + a(zkm_e, f) + var14 + a(g & h, i) + NLoginCore_532.a.a().a()[j] + a(k, l ^ m)
                                       : a(n, o) + var14 + a(zkm_p, q ^ r) + var14 + a(s, t ^ u) + NLoginCore_532.a.a().a()[v] + a(zkm_w, x ^ y)
                                 );
                           }
                        }

                        if (var9.c(NLoginCore_077.e)) {
                           if (Boolean.TRUE.equals(var7.a(NLoginCore_567.v))) {
                              this.L.b().a().c(var5, var7, var11);
                           }

                           if (Boolean.TRUE.equals(var7.a(NLoginCore_567.w))) {
                              NLoginCore_466.i.a(var5, var7);
                           }
                        }
                     }

                     Integer var21 = var7.b();
                     if (var21 != null) {
                        if (var21 <= 0) {
                           var5.a(NLoginCore_150.a(var11 ? NLoginCore_487.ad : NLoginCore_487.ac, var5));
                           n(var5);
                           return;
                        }

                        if (NLoginCore_477.ak.ar() && NLoginCore_477.aj.ar() && var7.d(NLoginCore_567.x)) {
                           int var22 = var21 != ab ? ac : ad;
                           NLoginCore_487 var10000 = var22 != 0 ? NLoginCore_487.g : NLoginCore_487.f;
                           Object[] var10002 = new Object[ae];
                           var10002[af] = var21;
                           String var23 = NLoginCore_150.a(var10000, var5, var10002);
                           String var15 = NLoginCore_150.a(var22 != 0 ? NLoginCore_487.i : NLoginCore_487.h, var5);
                           if (!var15.isEmpty()) {
                              String var16 = var15.split(a(ah, ai ^ aj))[var11 ? ak : al];
                              var23 = var23.replace(a(am & an, ao) + var15 + a(ap & aq, ar), var16);
                           }

                           var5.o(var23);
                        }
                     }
                  }
               } catch (Exception var19) {
                  NLoginCore_370.c(a(as, at ^ au) + var5.getName(), var19);
               }
            }

            NLoginCore_548.a(NLoginCore_425.a, var1);
         }
      }
   }

   public static int x() {
      return w.size();
   }

   private static void b() {
      c = -3769514981516184835L;
      long var0 = c ^ 50716935409016518L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               (byte)(57 + 12),
               (byte)(16 + 67),
               (byte)(26 + 21),
               (byte)(39 + 28),
               (byte)(54 + 12),
               (byte)(10 + 57),
               (byte)(45 + 2),
               (byte)(15 + 65),
               (byte)(64 + 11),
               (byte)(62 + 5),
               (byte)(49 + 34),
               (byte)(9 + 44),
               80,
               (byte)(54 + 43),
               (byte)(91 + 9),
               (byte)(36 + 64),
               (byte)(39 + 66),
               110,
               (byte)(52 + 51)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_559.C(
                  "ѻіҘѱѵѺѬѼҚѵѠѴѡҧ҆҉ҞҍҊѦҤґҁғҏҴҭ҇үҧҥҏҩҐҝѾҋҹҚҍҒ҃ӈ҈ґҟҁҘ҄҄ӋҊӃ҉ӅӎӅӀӔӎӐӊҖҤҬӏӑҿӕӕӞҹӢҹӣәӑҢӞӅҾҼӘӝӨҰӈұӥӔҵөӊӊӍәӯҰӠҹӡҿӭӛӖҼԆӀӷԄԆӄӤԇԉөԆԓӊӳӣԖԘԈԕӮӶԄԇӹԜӴԖӽӸԔԦԒԟӾԛԈӽԁӵԄԋԩԢԭԂԞԕ\u0530ԧԍԕԱԑӼԵԐԷԐԁԠԽԮԟԆԆՇԥԡԃԛՌՀՎՆԨԋԠԪՇԌ\u0558ԯԋՄԤՋԯԘՖՔՔԡՓՒԴՅ՝եԱժԾԸԧԼծՙԧԯձԴԳԲծՉՄՇԸձ",
                  (byte)37,
                  67
               );
               ZKM_STR_B[1] = NLoginCore_387.E(
                  "Չ՜ՑԽԼՓԹՕ՞Ծՙ՞ԮեդթՃԢՁըԬԭԩԣԲՁթԮՃկՅՙձհճՊս՜ԲձռղջվծԾղաղրֈ\u0557֍ՁրեՌ֍րՐ֒աձ֊քըթճհժ\u058bժ֣շգր֤գՠև֖֓ց֎֥փ֍֏ղս֓֞ծ֖֮֬ք֖֘֗\u058c֏ָ֖֮֬\u0590։",
                  (byte)37,
                  69
               );
               ZKM_STR_B[2] = NLoginCore_521.A("úċĂńĆĶÿĲĿĬġĦķŃįŒěŐņģŉŘŅđŐęĮěŊĳŜĪ", (byte)37, 65);
               ZKM_STR_B[3] = NLoginCore_471.A("ŃúŃĎņķľŀŋĺĘđ", (byte)37, 65);
               ZKM_STR_B[4] = NLoginCore_553.D(
                  "ѻіҘѱѵѺѬѼҚѵѠѴѡҧ҆҉ҞҍҊѦҤҌҴңҍҭѮѳѱҴѹѵҩҼқҴҢҼҘҗѼҹҵҤӆҦҜҥҋҮҮӀҌӀӅӌҨҞӆҰӇӓҷҔҏһҼҝӢҘӘӕҳӝәӠҠӋӗһӘҿӥӋҨӱӐӁҲӟӪӴӡҸӲӳӺӌӴӺӝҾӱҽӀӐӑӤӝӅӶӪӢӊԍӛӿӡԒӧӶԊԄӴӦӧӻӒӺӨӗӺԛԏԛӡԦӻԒԨӺԛԌԁӽԇԯӫӪԇӿԇӮԲӮԅԇԱӲӳԧӻԈՀԼԳԃԐԎԡՀԈԠԨԊԉԃՄՈԱԉԟԽԤԯՌՊԪԙ՛ԕԯ",
                  (byte)37,
                  68
               );
               ZKM_STR_B[5] = NLoginCore_397.F(
                  "ԌԸՎՐԕՕՑՠԫԿԖ\u0558ԽբՆԺԨԪՅԽՊԸԯՍՒՇեՓխբձպ\u0557զզՎԽՖՀԳպտնօվԹ՟Քևք՚փՀՌգ֎ւխդ՞֏Օղ֔֕֏է֎֑֞֗֏֛֤ջխվո֢ը֧շ֨֠էք֥֞ծ֩֠տը֧ֆ֥֤֘ճ֏մּ։ո־ֳֺ։", (byte)37, 70
               );
               ZKM_STR_B[6] = NLoginCore_027.C("њѻѬҠҡѯҀѺҢѹѸѶҖѹѫҫѥѶҏѼҎҭѰҪүѯұү҄үһһҚҳҨӀҳѺүүңҟңҌ", (byte)37, 67);
               ZKM_STR_B[7] = NLoginCore_127.D("ѯћҕҖѯѷ҄ҤҢўѢѻѴѶҔ҇Ѹ҃ѫҡҞѺѷѸ", (byte)37, 68);
               ZKM_STR_B[8] = NLoginCore_384.D("ҙѷѳҙҍҌҌѯѠ҄ўѬ", (byte)37, 68);
               ZKM_STR_B[9] = NLoginCore_027.F("Ֆ՛՛\u0557ԦՖաՐՖԴԸԩ", (byte)37, 70);
               ZKM_STR_B[10] = NLoginCore_223.A("ċġğĲĥĜĴćĕğĬđ", (byte)37, 65);
               ZKM_STR_B[11] = NLoginCore_471.B("ĮĬğĜħęĴĿłĉĊġĩķıĥŇŁőĪŀĤįœİĨĜļŐĪĶőġŗĸŜŧĤŨŝŤģĬňľŀŇıŜŭŊňĴŏļĽ", (byte)37, 66);
               ZKM_STR_B[12] = NLoginCore_027.E("ԻԩԭՖՇԗԴՔ՚Ԣԛ՟ԥԼ՝ՈԹդԵ՚ժԸ՝ԫլՐԪդկյՓՅճջնԺզկՙսգ՚րՃՖաՆ։՛ՠեշ֍Չՙջ֒ը՜վծձրի֚ջ֓ծֆն֊֑յ՛֒թ", (byte)37, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_004.E(
                  "ԸԓՕԮԲԷԩԹ\u0557ԲԝԱԞդՃՆ՛ՊՇԣաՎԾՐՌձժՄլդբՌզՍ՚ԻՈն\u0557ՊՏՀօՅՎ՜ԾՕՁՁֈՇրՆւ\u058bւս֑\u058b֍ևՓաթ\u058c֎ռ֛֒֒ն֟ն֖֠֎՟֛ւջչ֥֚֕խօծ֢֑ղ֦ևև֊֖֬խ֝ն֞ռ֪֘֓չ׃սִׁ׃ց֡ׄ׆֦׃אևְ֠דוׅגֳֶׁ֫ׄיֱדֵֺבף\u05cfלֻטֺׅ־ֲׁ\u05c8צןתֿכג\u05edפ\u05caג\u05ee\u05ceֹײ\u05cd״\u05cd־ם\u05fa\u05ebל׃׃\u0604עמ׀ט؉\u05fd؋\u0603ץ\u05c8םק\u0604\u05c9ؕ\u05ec\u05c8\u0601ס؈\u05ecוؓؑؑמؐ؏ױ\u0602ؚآ\u05eeا\u05fb\u05f5פ\u05f9ثؖפרؤ؎ذح؋ױ\u0605\u05f7ؙة",
                  (byte)37,
                  69
               );
               ZKM_STR_B[1] = NLoginCore_384.B(
                  "ıńĹĥĤĻġĽņĦŁņĖōŌőīĊĩŐĔĕđċĚĩőĖīŗĭŁřŘśĲťńĚřŤŚţŦŖĦŚŉŚŨŰĿŵĩŨōĴŵŨĸźŉřŲŬŐőśŘŒųŒƋşŋŨƌŋňůžŻũŶƍūŵŷŚťŻƆŖžƔƖůƠƚƑşŢųŷŶŶƦƬŽƏƃƇƯůƀƫƴƥżŽ", (byte)37, 66
               );
               ZKM_STR_B[2] = NLoginCore_324.A("úċĂńĆĶÿĲĿĬġĦķŃįŒěŐņģŉĉĢłĶħŅśŝŖřķ", (byte)37, 65);
               ZKM_STR_B[3] = NLoginCore_232.A("ĮüĐłĲķąûĦŋČčŀŊĸĻŁħďŐōŅĜĝ", (byte)37, 65);
               ZKM_STR_B[4] = NLoginCore_004.E(
                  "ԸԓՕԮԲԷԩԹ\u0557ԲԝԱԞդՃՆ՛ՊՇԣաՉձՠՊժԫ\u0530ԮձԶԲզչ\u0558ձ՟չՕՔԹնղափգՙբՈիիսՉսւ։ե՛փխք\u0590մՑՌոչ՚֟Օ֕֒հ֖֚֝՝ֈ֔ո֕ռ֢ֈե֮֍վկֱ֧֜֞յְַ֯։ֱַ֚ջ֮պս֍֎֚֡ւֳ֧֟և\u05caּ֘֞\u05cfֱֳׇָׁ֤֣֤֏ַַ֥֔ט\u05ccט֞ףָ\u05cfץַט\u05c9־ֺׄ\u05ecּ֧֨ׄׄ֫ׯׂ֫ׄ\u05eeְ֯פָׅ\u05fd\u05f9װ׀\u05cd\u05cbמ\u05fdׅםץׇ׆׀\u0601\u0605\u05ee׆ךאבׯ؊סג\u05f7ؓ\u0604\u05f6",
                  (byte)37,
                  69
               );
               ZKM_STR_B[5] = NLoginCore_433.F(
                  "ԌԸՎՐԕՕՑՠԫԿԖ\u0558ԽբՆԺԨԪՅԽՊԸԯՍՒՇեՓխբձպ\u0557զզՎԽՖՀԳպտնօվԹ՟Քևք՚փՀՌգ֎ւխդ՞֏Օղ֔֕֏է֎֑֞֗֏֛֤ջխվո֢ը֧շ֨֠էք֥֞ծ֩֠տը֧ֆ֥֧֘֔֏ֱֺ֟֯֒֝֬։", (byte)37, 70
               );
               ZKM_STR_B[6] = NLoginCore_387.C("њѻѬҠҡѯҀѺҢѹѸѶҖѹѫҫѥѶҏѼҎҭѰҪүѯұү҄үһһҳҝӀҀҽҟҋҸҕҁҹҌ", (byte)37, 67);
               ZKM_STR_B[7] = NLoginCore_387.B("ĔĀĺĻĔĜĩŉŇăĈĈěĬīĎĬĐİŐČįĳńŊŖĕěĜĕľġ", (byte)37, 66);
               ZKM_STR_B[8] = NLoginCore_453.D("ҏғҏҀҜҐѲҟҘѹўѬ", (byte)37, 68);
               ZKM_STR_B[9] = NLoginCore_110.B("ľčĬĒĞĻāķĹħņđ", (byte)37, 66);
               ZKM_STR_B[10] = NLoginCore_004.A("ĕĎčıęħĸļĦĶĜđ", (byte)37, 65);
               ZKM_STR_B[11] = NLoginCore_138.E("ՆՄԷԴԿԱՌ\u0557՚ԡԢԹՁՏՉԽ՟ՙթՂ\u0558ԼՇիՈՀԴՔըՂՎթԹկՐմտԼրյռԻԶկջռՖ՚՝գիՌՙսՔՕ", (byte)37, 69);
               ZKM_STR_B[12] = NLoginCore_004.F("ԻԩԭՖՇԗԴՔ՚Ԣԛ՟ԥԼ՝ՈԹդԵ՚ժԸ՝ԫլՐԪդկյՓՅճջնԺզկՙսգ՚րՃՖաՆ։՛ՠեշ֍Չՙջ֒ը՜վծձրի֊յՙ֏էճ\u0557կՔս֖թ", (byte)37, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_183.E("ԶԕԻԪԕՠ՜Բ\u0557ԚԟԡԾ՛ՈՑԵԧԺԤԩԾզժՈԬԾԾղլՈն", (byte)37, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.D("Ѳѷ҇ҜҁѮґҝѮѲ҇ҝѺқѫѷҜңѯҚҌҨҟҲҡҨѱҘҶ҄ѱғ", (byte)37, 68);
         }
      }
   }

   public static void n(NLoginCore_277 var0) {
      w.remove(var0);
      p.remove(var0);
   }

   public static void p(NLoginType_008 var0) {
      if (e == null) {
         e = var0.b((aw != 0)).a(new LoginMainQueueTask(var0), ax, ay, TimeUnit.MILLISECONDS);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  LoginMainQueueTask.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.D("ѪҌҎѮҒұҩҿҫѺҸҮҼҶѿҤӆӅҽӃҽҒ", (byte)47, 68), LoginMainQueueTask.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.A("ŀōŌďŏŋņŏŚŉĖŔŘőŔŚĜŢŐţŜťĢŀŤŝŠŦņśŤŪŎųŤŵŦŖŤŷŰŀ", (byte)47, 65) + var1 + NLoginCore_091.B("ė", (byte)47, 66) + var2.toString(), var4
         );
      }
   }

   public static boolean c(NLoginCore_277 var0) {
      return w.contains(var0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 68L;
      var1 ^= 50716935409016518L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(56 + 12),
                     (byte)(12 + 57),
                     (byte)(71 + 12),
                     (byte)(23 + 24),
                     (byte)(11 + 56),
                     (byte)(62 + 4),
                     (byte)(57 + 10),
                     (byte)(7 + 40),
                     (byte)(40 + 40),
                     (byte)(4 + 71),
                     67,
                     (byte)(13 + 70),
                     (byte)(7 + 46),
                     (byte)(73 + 7),
                     97,
                     (byte)(62 + 38),
                     (byte)(23 + 77),
                     (byte)(60 + 45),
                     (byte)(82 + 28),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.C("ёўѝРѠќїѠѫњЧѥѩѢѥѫЭѳѡѴѭѶгёѵѮѱѷїѬѵѻџ҄ѵ҆ѷѧѵ҈ҁ", (byte)19, 67));
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

   public static void m(NLoginCore_277 var0) {
      if (!w.add(var0)) {
         throw new IllegalStateException(a(az & ba, bb));
      }
   }
}
