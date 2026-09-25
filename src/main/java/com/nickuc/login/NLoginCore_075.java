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

public class NLoginCore_075 {
   private static int au = 60 >>> 98 | 60 << -98;
   private static int bi = Integer.reverse(671088640);
   private static long bh = Long.reverse(9064091402317139837L);
   private static long v = Long.reverse(288230376151711744L);
   private static long ah = Long.reverse(9064091402317139837L);
   private static long an = Long.reverse(288230376151711744L);
   private static long ad = Long.reverse(288230376151711744L);
   private static long x = Long.reverse(9064091402317139837L);
   private static long e = Long.reverse(8775861026165428093L);
   private static int t = 20480 >>> 204 | 20480 << ~204 + 1;
   private static int ar = (458752 >>> 79 | 458752 << -79) & -1;
   private static int q = 262144 >>> 240 | 262144 << ~240 + 1;
   private static int ai = (11 >>> 0 | 11 << -0) & -1;
   private int aL;
   private static int c = Integer.reverse(1610612736);
   private static long u = Long.reverse(8775861026165428093L);
   private static long av = Long.reverse(9064091402317139837L);
   private static int aw = (1 >>> 188 | 1 << -188) & -1;
   private static int az = Integer.reverse(-2013265920);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long ax = Long.reverse(8775861026165428093L);
   private static long bb = Long.reverse(9064091402317139837L);
   private static String[] ZKM_STR_A = new String[bi];
   private static int y = (-1073741823 >>> 190 | -1073741823 << ~190 + 1) & -1;
   private static int ao = -2147483642 >>> 159 | -2147483642 << ~159 + 1;
   private static long aq = Long.reverse(9064091402317139837L);
   private static long i = Long.reverse(9064091402317139837L);
   private static long ak = Long.reverse(9064091402317139837L);
   private String cK;
   private static int ap = Integer.reverse(-1);
   private static long p = Long.reverse(9064091402317139837L);
   private int aN;
   private static int aj = Integer.reverse(-1);
   private static String[] ZKM_STR_B = new String[NLoginCore_075.bj];
   private static int w = Integer.reverse(1610612736);
   private static long m = Long.reverse(9064091402317139837L);
   private static long ac = Long.reverse(8775861026165428093L);
   private int aM;
   private static long am = Long.reverse(8775861026165428093L);
   private static long ay = Long.reverse(288230376151711744L);
   private static long z = Long.reverse(8775861026165428093L);
   private static int o = -1 >>> 112 | -1 << -112;
   private static int al = Integer.reverse(805306368);
   private static int k = Integer.reverse(0);
   private static int bf = (19 >>> 32 | 19 << -32) & -1;
   private static int bj = Integer.reverse(671088640);
   private static int ae = Integer.reverse(-1879048192);
   private static long be = Long.reverse(288230376151711744L);
   private static int ab = Integer.reverse(268435456);
   private static int as = -1 >>> 153 | -1 << -153;
   private static long aa = Long.reverse(288230376151711744L);
   private static int bc = 589824 >>> 207 | 589824 << ~207 + 1;
   private static long bd = Long.reverse(8775861026165428093L);
   private static long af = Long.reverse(9064091402317139837L);
   private static long f = Long.reverse(288230376151711744L);
   private String cJ;
   private static int j = 512 >>> 233 | 512 << ~233 + 1;
   private static int bg = Integer.reverse(-1);
   private static int b = (125829120 >>> 182 | 125829120 << -182) & -1;
   private static int l = Integer.reverse(1073741824);
   private static int d = Integer.reverse(0);
   private static int n = Integer.reverse(-1073741824);
   private static int ag = 20971520 >>> 149 | 20971520 << -149;
   private static int ba = -1 >>> 222 | -1 << ~222 + 1;
   private static long c;
   private static int h = (-1 >>> 232 | -1 << ~232 + 1) & -1;
   private static long at = Long.reverse(9064091402317139837L);
   private static int a = (0 >>> 60 | 0 << -60) & -1;
   private static long s = Long.reverse(9064091402317139837L);
   private static int r = Integer.reverse(-1);

   public NLoginCore_075() {
      this.aL = a;
      this.aM = b;
      this.aN = c;
   }

   public boolean Z() {
      return ((this.cJ != null && this.cK != null ? j : k) != 0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 32L;
      var1 ^= 8879492991699934640L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(39 + 29),
                     (byte)(64 + 5),
                     (byte)(20 + 63),
                     (byte)(21 + 26),
                     (byte)(20 + 47),
                     (byte)(8 + 58),
                     (byte)(49 + 18),
                     (byte)(7 + 40),
                     (byte)(11 + 69),
                     (byte)(27 + 48),
                     67,
                     (byte)(53 + 30),
                     (byte)(28 + 25),
                     (byte)(59 + 21),
                     97,
                     (byte)(8 + 92),
                     (byte)(36 + 64),
                     (byte)(29 + 76),
                     (byte)(45 + 65),
                     (byte)(10 + 93)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.A("ĸŅńćŇŃľŇŒŁĎŌŐŉŌŒĔҭ҇ѻҮѽҰҲҨҥҷҹҌҒҫҥ", (byte)43, 65));
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
      c = -4688085124976716898L;
      long var0 = c ^ 8879492991699934640L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               (byte)(12 + 57),
               83,
               (byte)(22 + 25),
               (byte)(45 + 22),
               (byte)(26 + 40),
               (byte)(63 + 4),
               (byte)(45 + 2),
               (byte)(59 + 21),
               (byte)(64 + 11),
               67,
               (byte)(49 + 34),
               (byte)(25 + 28),
               (byte)(46 + 34),
               (byte)(67 + 30),
               (byte)(41 + 59),
               (byte)(15 + 85),
               (byte)(98 + 7),
               (byte)(2 + 108),
               (byte)(101 + 2)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_471.C("թՀ՞ա՜զԭՉմՈԱԻ", (byte)106, 67);
               ZKM_STR_B[1] = NLoginCore_092.F("֜ճ֑֔֏֙ՠռ֧ջդծ", (byte)106, 70);
               ZKM_STR_B[2] = NLoginCore_241.C("գՁԸՎթ՞ԮՄ՞ԬՠԻ", (byte)106, 67);
               ZKM_STR_B[3] = NLoginCore_127.A("ƅƣǉƇƯƨǑƭƾƴƿǘǎƮǂǄƜƮƧǜǈǟƦƧ", (byte)106, 65);
               ZKM_STR_B[4] = NLoginCore_446.B("ǃơƘƮǉƾƎƤƾƌǀƛ", (byte)106, 66);
               ZKM_STR_B[5] = NLoginCore_553.C("իԥՏՉՐծՊակժՂԻ", (byte)106, 67);
               ZKM_STR_B[6] = NLoginCore_433.E("\u0558ն֜՚ւջ֤ր֑և֒֫֡ց֕֗կցպֲ֛֯չպ", (byte)106, 69);
               ZKM_STR_B[7] = NLoginCore_232.A("ǋƅƯƩưǎƪǁǏǊƢƛ", (byte)106, 65);
               ZKM_STR_B[8] = NLoginCore_575.D("ԶԸԬծՏձՁխԲմՕՕչոՉշՕՑզձՀՉՆՇ", (byte)106, 68);
               ZKM_STR_B[9] = NLoginCore_138.F("թի՟֡ւ֤մ֠ե֧ֈֈ֬֫ռ֪ֈք֤֙ճռչպ", (byte)106, 70);
               ZKM_STR_B[10] = NLoginCore_201.E("թի՟֡ւ֤մ֠ե֧օգ֞֨ժվֆօֆ\u058bի֢չպ", (byte)106, 69);
               ZKM_STR_B[11] = NLoginCore_201.B("ƖƘƌǎƯǑơǍƒǔƲƐǋǕƗƫƳƲƳƸƘǏƦƧ", (byte)106, 66);
               ZKM_STR_B[12] = NLoginCore_384.F("թի՟֡ւ֤մ֠ե֧օշյֳ֦֦֨֫֡֝օռչպ", (byte)106, 70);
               ZKM_STR_B[13] = NLoginCore_223.C("ԶԸԬծՏձՁխԲմՒՄՂյոճծճժրՒՉՆՇ", (byte)106, 67);
               ZKM_STR_B[14] = NLoginCore_232.F("էռ֎ՠլ֒՟ղ֛֢ֈպօթժ֍րիիը֩֏\u0590ւ֟֎֢֬ֈָֻ֛֕֫֯֕\u058bֺּֽ֑ֈֶׅ֛֠օׂ\u05cbׂ֤֭֚֠֬֙", (byte)106, 70);
               ZKM_STR_B[15] = NLoginCore_183.B("ƞƞƎƦƦƠƺƉƞǅǁƔǈƱƦưǉƶƙǉƲƩƦƧ", (byte)106, 66);
               ZKM_STR_B[16] = NLoginCore_471.D("ՠՋԧաՍբըՄՄՉ՞ՁկԶժէՇչնՠՑկՆՇ", (byte)106, 68);
               ZKM_STR_B[17] = NLoginCore_092.B("ƊǍǃǋƋǉǋơƐǆƟƶƕǆǏƲƔƔǜƾǕƹƦƧ", (byte)106, 66);
               ZKM_STR_B[18] = NLoginCore_201.A("ƸƃǊƅƙƩƮǋƵǐƦƛ", (byte)106, 65);
               ZKM_STR_B[19] = NLoginCore_027.E("ս\u0558մ֞ճւ՜աբրօծ", (byte)106, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.D("՛ՊծԾՉԫՂՒՔՄՃՋշՄՅԵՕիՌՇ\u0557ՙՆՇ", (byte)106, 68);
               ZKM_STR_B[1] = NLoginCore_530.E("֢֚֙֔֓՛ֆսվն֥֛֠եջ֢֗բ֥դ\u058cֲչպ", (byte)106, 69);
               ZKM_STR_B[2] = NLoginCore_223.F("֓չնս֤֙֞ֆե֤շՠց֚֎֨֗խէ֧֞ռչպ", (byte)106, 70);
               ZKM_STR_B[3] = NLoginCore_183.D("ԥՃթԧՏՈձՍ՞Ք՞զԲՅՏ՜ծՎ՚ոկտՆՇ", (byte)106, 68);
               ZKM_STR_B[4] = NLoginCore_559.D("ԣՖԤԮծժՍդՅՑ\u0557ԱՎԯզճռվԻԷԼՙՆՇ", (byte)106, 68);
               ZKM_STR_B[5] = NLoginCore_092.E("ձ֡\u0557֎֣գ֣֘֠եդծ", (byte)106, 69);
               ZKM_STR_B[6] = NLoginCore_223.C("ԥՃթԧՏՈձՍ՞ՔՖԴաՅԶԵդջմԵՒկՆՇ", (byte)106, 67);
               ZKM_STR_B[7] = NLoginCore_141.A("ƬƿƧƨƥǌƢƒǉǈǄƛ", (byte)106, 65);
               ZKM_STR_B[8] = NLoginCore_241.B("ƖƘƌǎƯǑơǍƒǔƲǆƊƐƱƘǌƽǎƨǟƶǕǌƭǓưǞǑƷƾǟ", (byte)106, 66);
               ZKM_STR_B[9] = NLoginCore_110.C("ԶԸԬծՏձՁխԲմՓԩըհկհղՏլնռչբ՟շգՐՃՑՁշՙ", (byte)106, 67);
               ZKM_STR_B[10] = NLoginCore_451.C("ԶԸԬծՏձՁխԲմՒՇչխՙէոճԶՌրտՆՇ", (byte)106, 67);
               ZKM_STR_B[11] = NLoginCore_232.A("ƖƘƌǎƯǑơǍƒǔƴǁǒǁƗƓǛƗƕǍƝƴǗƞƿǛǝǤǅǆƶǈ", (byte)106, 65);
               ZKM_STR_B[12] = NLoginCore_521.A("ƖƘƌǎƯǑơǍƒǔƴƫƎǓǌƣǏǕƳƷǗƪƺǗǗƥǏǝǢƴƻǀ", (byte)106, 65);
               ZKM_STR_B[13] = NLoginCore_553.E("թի՟֡ւ֤մ֠ե֧ֆյ֜ն֍֘ժ֯֜ֆթղկվ\u058b֦մ֕օ֑ռ֬", (byte)106, 69);
               ZKM_STR_B[14] = NLoginCore_471.D("ԴՉ՛ԭԹ՟ԬԿըկՕՇՒԶԷ՚ՍԸԸԵն՜՝Տլ՛չկՕբոռօըֈբ\u0558։՞և֊Օժ֊փ֑֔խ\u0557է֕Ֆրթզէ", (byte)106, 68);
               ZKM_STR_B[15] = NLoginCore_076.E("ձձաչչճ֍՜ձ֦֘֔\u058cռ֗ֆվ֣֮\u0590ժֲչպ", (byte)106, 69);
               ZKM_STR_B[16] = NLoginCore_530.A("ǀƫƇǁƭǂǈƤƤƩƶǒƧƋǔƩƺǕƹƱǈƩƦƧ", (byte)106, 65);
               ZKM_STR_B[17] = NLoginCore_451.B("ƊǍǃǋƋǉǋơƐǆƞǉǑưƳǊǙǏƲƱưǟƦƧ", (byte)106, 66);
               ZKM_STR_B[18] = NLoginCore_530.C("՟գեծՉԣԺՈլդՌՍդդոչՄԶ\u0557խղկՆՇ", (byte)106, 67);
               ZKM_STR_B[19] = NLoginCore_232.F("\u0558֠ծ\u0590֎ո՜բգղ֓ծ", (byte)106, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.E("\u058bռակղ֘ծ֟աՠդծ", (byte)106, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.B("ƾǆƈƛƐƝƦƨưƒǐƛ", (byte)106, 66);
         }
      }
   }

   @Generated
   @Override
   public String toString() {
      return a(ar & as, at)
         + this.cJ
         + a(au, av)
         + this.cK
         + a(aw, ax ^ ay)
         + this.aL
         + a(az & ba, bb)
         + this.aM
         + a(bc, bd ^ be)
         + this.aN
         + a(bf & bg, bh);
   }

   static {
      b();
   }

   public void a(NLoginCore_277 var1, Object... var2) {
      if (this.cJ != null && this.cK != null && this.aM > 0) {
         if (var1 != null && NLoginCore_477.ai.ar()) {
            String var3 = var1.getName();
            var1.a(
               NLoginCore_112.a(this.cJ.replace(a(d, e ^ f), var3), var2),
               NLoginCore_112.a(this.cK.replace(a(g & h, i), var3), var2),
               this.aL,
               this.aM,
               this.aN
            );
         }
      }
   }

   public static NLoginCore_075 a(String var0, NLoginCore_219 var1) {
      if (var1.p(var0 + a(l, m)) && var1.p(var0 + a(n & o, p))) {
         NLoginCore_075 var2 = new NLoginCore_075();
         var2.cJ = NLoginCore_065.q(var1.a(var0 + a(q & r, s), a(t, u ^ v)));
         var2.cK = NLoginCore_065.q(var1.a(var0 + a(w, x), a(y, z ^ aa)));
         if (var1.p(var0 + a(ab, ac ^ ad))) {
            var2.aL = var1.a((String)(var0 + a(ae, af)));
         }

         if (var1.p(var0 + a(ag, ah))) {
            var2.aM = var1.a((String)(var0 + a(ai & aj, ak)));
         }

         if (var1.p(var0 + a(al, am ^ an))) {
            var2.aN = var1.a((String)(var0 + a(ao & ap, aq)));
         }

         return var2;
      } else {
         return NLoginCore_508.a();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_075.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.A("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 65), NLoginCore_075.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.B("ƐƝƜşƟƛƖƟƪƙŦƤƨơƤƪŬԅӟӓԆӕԈԊԀӽԏԑӤӪԃӽƇ", (byte)87, 66) + var1 + NLoginCore_471.F("Ս", (byte)87, 70) + var2.toString(), var4
         );
      }
   }
}
