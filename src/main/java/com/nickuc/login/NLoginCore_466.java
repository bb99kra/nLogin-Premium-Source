package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_466 {
   b(a(NLoginCore_466.an, NLoginCore_466.ao), NLoginCore_043.class, (NLoginCore_466 != 0).ap, (NLoginCore_466 != 0).aq),
   c(a(NLoginCore_466.av, NLoginCore_466.aw), NLoginType_021.class, (NLoginCore_466 != 0).ax, (NLoginCore_466 != 0).ay),
   d(a(NLoginCore_466.bd, NLoginCore_466.be), NLoginCore_333.class, (NLoginCore_466 != 0).bf, (NLoginCore_466 != 0).bg),
   e(a(NLoginCore_466.bk & NLoginCore_466.bl, NLoginCore_466.bm), NLoginCore_295.class, (NLoginCore_466 != 0).bn, (NLoginCore_466 != 0).bo),
   f(a(NLoginCore_466.bt, NLoginCore_466.bu ^ NLoginCore_466.bv), NLoginType_020.class, (NLoginCore_466 != 0).bw, (NLoginCore_466 != 0).bx),
   g(a(NLoginCore_466.cc, NLoginCore_466.cd), NLoginCore_014.class, (NLoginCore_466 != 0).ce, (NLoginCore_466 != 0).cf),
   h(a(NLoginCore_466.ck & NLoginCore_466.cl, NLoginCore_466.cm), NLoginCore_462.class, (NLoginCore_466 != 0).cn, (NLoginCore_466 != 0).co),
   i(a(NLoginCore_466.cs, NLoginCore_466.ct), NLoginCore_367.class, (NLoginCore_466 != 0).cu, (NLoginCore_466 != 0).cv),
   j(a(NLoginCore_466.da, NLoginCore_466.db ^ NLoginCore_466.dc), NLoginCore_437.class, (NLoginCore_466 != 0).dd, (NLoginCore_466 != 0).de),
   k(a(NLoginCore_466.di, NLoginCore_466.dj), NLoginType_025.class, (NLoginCore_466 != 0).dk, (NLoginCore_466 != 0).dl);

   private final String n;
   private final NLoginCore_168<NLoginType_008> a;
   private final boolean u;
   private final boolean v;
   private static String[] ZKM_STR_A = new String[NLoginCore_466.ah];
   private static String[] ZKM_STR_B = new String[NLoginCore_466.ai];
   private static long c;
   private static int a = 512 >>> 169 | 512 << ~169 + 1;
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (0 >>> 243 | 0 << -243) & -1;
   private static int e = (0 >>> 107 | 0 << ~107 + 1) & -1;
   private static long f = Long.reverse(-6688020125545717271L);
   private static int g = (256 >>> 40 | 256 << ~40 + 1) & -1;
   private static int h = Integer.reverse(-1);
   private static long i = Long.reverse(-6688020125545717271L);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(1073741824);
   private static long l = Long.reverse(-491067038283914775L);
   private static long m = Long.reverse(6485183463413514240L);
   private static int n = Integer.reverse(-1073741824);
   private static int o = (-1 >>> 39 | -1 << ~39 + 1) & -1;
   private static long p = Long.reverse(-6688020125545717271L);
   private static int q = (16777216 >>> 54 | 16777216 << -54) & -1;
   private static long r = Long.reverse(-491067038283914775L);
   private static long s = Long.reverse(6485183463413514240L);
   private static int t = (20971520 >>> 54 | 20971520 << -54) & -1;
   private static int u = Integer.reverse(-1);
   private static long v = Long.reverse(-6688020125545717271L);
   private static int w = 10 >>> 32 | 10 << ~32 + 1;
   private static int x = Integer.reverse(0);
   private static int y = 16384 >>> 46 | 16384 << -46;
   private static int z = Integer.reverse(1073741824);
   private static int aa = Integer.reverse(-1073741824);
   private static int ab = Integer.reverse(536870912);
   private static int ac = (10 >>> 97 | 10 << ~97 + 1) & -1;
   private static int ad = Integer.reverse(1610612736);
   private static int ae = Integer.reverse(-536870912);
   private static int af = 8 >>> 160 | 8 << ~160 + 1;
   private static int ag = (73728 >>> 173 | 73728 << ~173 + 1) & -1;
   private static int ah = (104 >>> 162 | 104 << -162) & -1;
   private static int ai = Integer.reverse(1476395008);
   private static int aj = (-1073741824 >>> 29 | -1073741824 << ~29 + 1) & -1;
   private static int ak = (-1 >>> 164 | -1 << ~164 + 1) & -1;
   private static long al = Long.reverse(-6688020125545717271L);
   private static int am = 0 >>> 204 | 0 << ~204 + 1;
   private static int an = (7168 >>> 234 | 7168 << -234) & -1;
   private static long ao = Long.reverse(-6688020125545717271L);
   private static int ap = (256 >>> 72 | 256 << ~72 + 1) & -1;
   private static int aq = Integer.reverse(Integer.MIN_VALUE);
   private static int ar = Integer.reverse(268435456);
   private static long as = Long.reverse(-491067038283914775L);
   private static long at = Long.reverse(6485183463413514240L);
   private static int au = Integer.reverse(Integer.MIN_VALUE);
   private static int av = Integer.reverse(-1879048192);
   private static long aw = Long.reverse(-6688020125545717271L);
   private static int ax = Integer.reverse(Integer.MIN_VALUE);
   private static int ay = (16777216 >>> 88 | 16777216 << ~88 + 1) & -1;
   private static int az = (5242880 >>> 179 | 5242880 << ~179 + 1) & -1;
   private static int ba = Integer.reverse(-1);
   private static long bb = Long.reverse(-6688020125545717271L);
   private static int bc = '耀' >>> '.' | 32768 << ~46 + 1;
   private static int bd = Integer.reverse(-805306368);
   private static long be = Long.reverse(-6688020125545717271L);
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = Integer.reverse(Integer.MIN_VALUE);
   private static int bh = Integer.reverse(805306368);
   private static long bi = Long.reverse(-6688020125545717271L);
   private static int bj = 393216 >>> 49 | 393216 << -49;
   private static int bk = Integer.reverse(-1342177280);
   private static int bl = Integer.reverse(-1);
   private static long bm = Long.reverse(-6688020125545717271L);
   private static int bn = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = Integer.reverse(Integer.MIN_VALUE);
   private static int bp = Integer.reverse(1879048192);
   private static long bq = Long.reverse(-491067038283914775L);
   private static long br = Long.reverse(6485183463413514240L);
   private static int bs = 262144 >>> 240 | 262144 << -240;
   private static int bt = Integer.reverse(-268435456);
   private static long bu = Long.reverse(-491067038283914775L);
   private static long bv = Long.reverse(6485183463413514240L);
   private static int bw = 16 >>> 68 | 16 << -68;
   private static int bx = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static int by = ('耀' >>> 'k' | 32768 << -107) & -1;
   private static int bz = Integer.reverse(-1);
   private static long ca = Long.reverse(-6688020125545717271L);
   private static int cb = 81920 >>> 206 | 81920 << ~206 + 1;
   private static int cc = (536870914 >>> 221 | 536870914 << ~221 + 1) & -1;
   private static long cd = Long.reverse(-6688020125545717271L);
   private static int ce = Integer.reverse(Integer.MIN_VALUE);
   private static int cf = Integer.reverse(Integer.MIN_VALUE);
   private static int cg = Integer.reverse(1207959552);
   private static long ch = Long.reverse(-491067038283914775L);
   private static long ci = Long.reverse(6485183463413514240L);
   private static int cj = Integer.reverse(1610612736);
   private static int ck = (4980736 >>> 178 | 4980736 << ~178 + 1) & -1;
   private static int cl = Integer.reverse(-1);
   private static long cm = Long.reverse(-6688020125545717271L);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);
   private static int co = 8388608 >>> 247 | 8388608 << ~247 + 1;
   private static int cp = ('ꀀ' >>> 171 | 40960 << -171) & -1;
   private static long cq = Long.reverse(-6688020125545717271L);
   private static int cr = Integer.reverse(-536870912);
   private static int cs = (1342177281 >>> 188 | 1342177281 << ~188 + 1) & -1;
   private static long ct = Long.reverse(-6688020125545717271L);
   private static int cu = (131072 >>> 49 | 131072 << ~49 + 1) & -1;
   private static int cv = Integer.reverse(0);
   private static int cw = (720896 >>> 79 | 720896 << -79) & -1;
   private static long cx = Long.reverse(-491067038283914775L);
   private static long cy = Long.reverse(6485183463413514240L);
   private static int cz = Integer.reverse(268435456);
   private static int da = Integer.reverse(-402653184);
   private static long db = Long.reverse(-491067038283914775L);
   private static long dc = Long.reverse(6485183463413514240L);
   private static int dd = Integer.reverse(Integer.MIN_VALUE);
   private static int de = Integer.reverse(0);
   private static int df = Integer.reverse(402653184);
   private static long dg = Long.reverse(-6688020125545717271L);
   private static int dh = 18 >>> 33 | 18 << ~33 + 1;
   private static int di = Integer.reverse(-1744830464);
   private static long dj = Long.reverse(-6688020125545717271L);
   private static int dk = 0 >>> 69 | 0 << -69;
   private static int dl = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 90L;
      var1 ^= -1565258560449250986L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(52 + 16),
                     (byte)(56 + 13),
                     (byte)(26 + 57),
                     (byte)(2 + 45),
                     (byte)(66 + 1),
                     (byte)(39 + 27),
                     (byte)(21 + 46),
                     (byte)(30 + 17),
                     (byte)(4 + 76),
                     75,
                     (byte)(23 + 44),
                     (byte)(4 + 79),
                     53,
                     (byte)(37 + 43),
                     (byte)(80 + 17),
                     (byte)(22 + 78),
                     (byte)(91 + 9),
                     (byte)(45 + 60),
                     (byte)(26 + 84),
                     (byte)(9 + 94)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.C("Ս՚ՙԜ՜\u0558Փ՜էՖԣաե՞աէԩࢲࢵࣀࢼࢿࢱࢡࣉࢬ", (byte)103, 67));
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

   @Generated
   public String e() {
      return this.n;
   }

   @Generated
   public boolean l() {
      return this.u;
   }

   @Generated
   public NLoginCore_168<NLoginType_008> a() {
      return this.a;
   }

   static {
      b();
   }

   public void a(NLoginCore_277 var1, NLoginCore_509 var2, String... var3) {
      if (!(this.a instanceof NLoginType_032)) {
         throw new IllegalStateException(a(k, l ^ m) + this + a(n & o, p));
      } else {
         var2.a(NLoginCore_567.k, System.currentTimeMillis());
         NLoginType_032 var4 = (NLoginType_032)this.a;
         var4.d(var1, var4.aa(), var3);
      }
   }

   private static void b() {
      c = -7528623955909348193L;
      long var0 = c ^ -1565258560449250986L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(52 + 17),
               (byte)(72 + 11),
               (byte)(6 + 41),
               (byte)(62 + 5),
               (byte)(16 + 50),
               (byte)(57 + 10),
               (byte)(22 + 25),
               80,
               (byte)(27 + 48),
               (byte)(2 + 65),
               (byte)(53 + 30),
               (byte)(3 + 50),
               (byte)(24 + 56),
               97,
               (byte)(71 + 29),
               (byte)(96 + 4),
               (byte)(4 + 101),
               (byte)(67 + 43),
               (byte)(97 + 6)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.F("\u058b֏ֱ֢֧֨ք֦֬մֺճ\u0590ջ֪֨տ\u058bֿ\u058c֥֘֓ׄ֞ֆ֣֔֡־֛ֈ־֎֫\u05cc֦ו\u05ce֗׆׃\u05c8֟", (byte)123, 70);
               ZKM_STR_B[1] = NLoginCore_446.F("ց֧։ծ֕քտ֒յ֚֩տ", (byte)123, 70);
               ZKM_STR_B[2] = NLoginCore_201.A("ǂƭǏǝǉǓǋǲǒƴǨǌǂǸƵƴǖǒǏƽǝǱǈǉ", (byte)123, 65);
               ZKM_STR_B[3] = NLoginCore_521.C("ս֖֔նճչո֒ֆ֝ե֤ց֥փս֏֊֢֨֠֒֊֏֥֤֥֭֠ճִ֧", (byte)123, 67);
               ZKM_STR_B[4] = NLoginCore_092.C("ճ՞ր֎պքռ֣փե֙սճ֩զեևփրծ֎֢չպ", (byte)123, 67);
               ZKM_STR_B[5] = NLoginCore_201.F("֎֧֥ևք֊։֣֮֗նֵֶ֒֔֎ֱֱֳֵֶֹ֛֣֛֠֠־ֶքָׅ", (byte)123, 70);
               ZKM_STR_B[6] = NLoginCore_027.C("ի\u058b֎ս֣տշմ֛հՠծ", (byte)123, 67);
               ZKM_STR_B[7] = NLoginCore_076.A("ƾƷǅƬưƩƴǍǣǬǄƽ", (byte)123, 65);
               ZKM_STR_B[8] = NLoginCore_223.B("ǛǗǑƧǑƽǱƱƳǟƱǉǱǋǯƸƸƷǖǑǺȁǈǉ", (byte)123, 66);
               ZKM_STR_B[9] = NLoginCore_575.C("՚ճՓՙՕ֜քֆբօ֑֪֮֞֝վ\u058bլև֥֟\u058cչպ", (byte)123, 67);
               ZKM_STR_B[10] = NLoginCore_521.A("ƥǠƯǛǝǬƭǡƭƳǔƽ", (byte)123, 65);
               ZKM_STR_B[11] = NLoginCore_110.E("։և֦֏լְֳ֯\u0590֑֎տ", (byte)123, 69);
               ZKM_STR_B[12] = NLoginCore_173.A("ƤƨǚƻƤƻǔǦǵǓǀƽ", (byte)123, 65);
               ZKM_STR_B[13] = NLoginCore_559.F("ֱտ֡֊փիְփֶ֤֬տ", (byte)123, 70);
               ZKM_STR_B[14] = NLoginCore_092.A("ǙǄǎǬƱǥǴƽǓǤƳƽ", (byte)123, 65);
               ZKM_STR_B[15] = NLoginCore_173.E("ըգ\u058cֲ֣֎֭֬֒ն֚տ", (byte)123, 69);
               ZKM_STR_B[16] = NLoginCore_530.C("֘լւ\u058c֙՞\u0557ղդշ֣ծ", (byte)123, 67);
               ZKM_STR_B[17] = NLoginCore_384.B("ǗǆǩǋƻǋǞǢǴǥǀƽ", (byte)123, 66);
               ZKM_STR_B[18] = NLoginCore_384.E("֥֍֥ւ֎ք֪ևֵ֦ւտ", (byte)123, 69);
               ZKM_STR_B[19] = NLoginCore_530.F("խէֲ֭֬֯ֈօ֩հ֤տ", (byte)123, 70);
               ZKM_STR_B[20] = NLoginCore_384.C("\u0558ՙ֝՟հգ֘եու֛ծ", (byte)123, 67);
               ZKM_STR_B[21] = NLoginCore_232.A("ƿǝǠƨǚǜǫƫƴǰǌƽ", (byte)123, 65);
               ZKM_STR_B[22] = NLoginCore_091.B("ǄǧǁƽǦǅǴǯǖǐǷǧǕǙǵǗǞǘƹǟǘǱǈǉ", (byte)123, 66);
               ZKM_STR_B[23] = NLoginCore_223.E("չ։֨֎մ֩ֈ֪֏ֻ֣֨֎־ֳտֳ֖֠֕֗֜֊\u058b", (byte)123, 69);
               ZKM_STR_B[24] = NLoginCore_223.E("֣֠րղ֣ղծ֊֗ֈւևֲ֛֙֫ղֺ֗ցնֳ֊\u058b", (byte)123, 69);
               ZKM_STR_B[25] = NLoginCore_004.F("\u058b\u058cթ֢ղ֭։ַ֦֮֕ֆչպչև׀֏ոׂ\u058c֝֊\u058b", (byte)123, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.C("պվ֑֖֠֗ճ֛֕գ֩բտժ֗֙ծպ֮ջևւֳ֍֔յփ\u0590֭֒֊շ׀֞\u0590֣֠ջ֍ִִտր֎", (byte)123, 67);
               ZKM_STR_B[1] = NLoginCore_183.C("֎ՠ֕֙քր֚֒ոսցծ", (byte)123, 67);
               ZKM_STR_B[2] = NLoginCore_127.B("ǂƭǏǝǉǓǋǲǒƴǨƯǺǬǴƹǋǷǮǘǀǋǈǉ", (byte)123, 66);
               ZKM_STR_B[3] = NLoginCore_141.E("֎֧֥ևք֊։֣֮֗նֵֶ֒֔֎ֱֳֶֶֹׁׂ֛֦֠֯֜֝ׄ\u05cf־", (byte)123, 69);
               ZKM_STR_B[4] = NLoginCore_091.C("ճ՞ր֎պքռ֣փե֦֚֘թ֨ն\u058c֚րվִռչպ", (byte)123, 67);
               ZKM_STR_B[5] = NLoginCore_451.B("ǌǥǣǅǂǈǇǡǕǬƴǳǐǴǒǌǞǙǷǯǱǬǥǓƼǻȃǾǴǋǸȇ", (byte)123, 66);
               ZKM_STR_B[6] = NLoginCore_027.A("ƻƹǋǧǫǩǮǣǉǅǇǚǫǓƳǏƹǬƼǛǚȁǈǉ", (byte)123, 65);
               ZKM_STR_B[7] = NLoginCore_446.A("ƽǫǞǊǫǲǢǭƲǧǯǵƲǓǈǶǔǚǷǑǶȁǈǉ", (byte)123, 65);
               ZKM_STR_B[8] = NLoginCore_451.F("֝֙֓թ֓տֳճյ֡ձ֥֥֦֩ս֖֟֩֝֕֍֊\u058b", (byte)123, 70);
               ZKM_STR_B[9] = NLoginCore_387.D("՚ճՓՙՕ֜քֆբօ։֘դցչ\u058b֗\u058cւի֏\u058cչպ", (byte)123, 68);
               ZKM_STR_B[10] = NLoginCore_559.E("֘ը֜րևֱֈ֗յչִֺ֚֫֨֔սׁ׀ֲ֡׃֊\u058b", (byte)123, 69);
               ZKM_STR_B[11] = NLoginCore_433.F("լְ֣֢֬֊ְַ֢֪֖֬֔֊ְ֫֏֗֫\u058bֳַ֊\u058b", (byte)123, 70);
               ZKM_STR_B[12] = NLoginCore_553.F("խ֙սֳ֥֟փյոհ֖տ", (byte)123, 70);
               ZKM_STR_B[13] = NLoginCore_521.E("ըպ֟եղ֎֥տ֢֘֫ք֨֬մְ֞ճֲֹ֒֝֊\u058b", (byte)123, 69);
               ZKM_STR_B[14] = NLoginCore_127.B("ǄǫǬƣǍǒǡƯǯǐǘƽ", (byte)123, 66);
               ZKM_STR_B[15] = NLoginCore_173.E("ց֨֜ծքֳխ֏ժղհճ֏ֵ֗֍֬ս\u058cִ׀֝֊\u058b", (byte)123, 69);
               ZKM_STR_B[16] = NLoginCore_110.D("շծ֕յղլ֗֠ագտտւ֍\u058c֪֜օֆձֲ֡չպ", (byte)123, 68);
               ZKM_STR_B[17] = NLoginCore_127.A("ǪǛǀƿǝƭǃƳǅǠǧǅƹǧǨƺǰǔǭƹǍǱǈǉ", (byte)123, 65);
               ZKM_STR_B[18] = NLoginCore_397.B("ǃǝǂǡǪǤǭƿƱǪǡǈǉǄǎǦƹǪǘǛǡǋǈǉ", (byte)123, 66);
               ZKM_STR_B[19] = NLoginCore_559.D("\u058cչճմ֘՝֝֓֟բ֝ևտ֛֟օօքլ\u0590լֲչպ", (byte)123, 68);
               ZKM_STR_B[20] = NLoginCore_559.A("ƬƻǪǰƬǅǯǕǓǘǖǴǳǴǩǉǈǶǐǶǁǱǈǉ", (byte)123, 65);
               ZKM_STR_B[21] = NLoginCore_446.E("֎֎ֱջִִֆ֣֙ֆքֹ֥֔յջվ־֒֙ն֍֊\u058b", (byte)123, 69);
               ZKM_STR_B[22] = NLoginCore_324.D("յ֘ղծ֗ն֥֠ևց֩տ֗֨ժ֍փզ֩։փ\u058cչպ", (byte)123, 68);
               ZKM_STR_B[23] = NLoginCore_553.C("ըո֗սգ֘շ֙վ֪֗յ\u058cոտ֫֍ս֩դփ\u058cչպ", (byte)123, 67);
               ZKM_STR_B[24] = NLoginCore_471.B("ǞǡƾưǡưƬǈǕǆǂǴǄǖǶǚưǲǚǭǓǋǈǉ", (byte)123, 66);
               ZKM_STR_B[25] = NLoginCore_397.E("\u058b\u058cթ֢ղ֭։ַ֦֕֬֬ռ֙־ְ֧֎\u058b֔ր׃֊\u058b", (byte)123, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.C("֛֔֞ռփց֣֕\u0590հչզշօևզտ֪֢֫լֲչպ", (byte)123, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.B("ǉǐǤǝǁǦǰǉǟǀǍǮǨǈǛǎǦǪǽǯǋȁǈǉ", (byte)123, 66);
         }
      }
   }

   @Generated
   public boolean m() {
      return this.v;
   }

   public void a(NLoginCore_277 var1, NLoginCore_509 var2, String var3, String... var4) {
      if (!(this.a instanceof NLoginType_032)) {
         throw new IllegalStateException(a(q, r ^ s) + this + a(t & u, v));
      } else {
         var2.a(NLoginCore_567.k, System.currentTimeMillis());
         NLoginType_032 var5 = (NLoginType_032)this.a;
         var5.c(var1, var3, var4);
      }
   }

   private NLoginCore_466(String var3, Class<? extends NLoginCore_168<NLoginType_008>> var4, boolean var5, boolean var6) {
      this.n = var3;
      this.u = var5;
      this.v = var6;

      NLoginCore_168 var7;
      try {
         Class[] var10001 = new Class[a];
         var10001[b] = NLoginCore_466.class;
         Constructor var10000 = var4.getConstructor(var10001);
         Object[] var10 = new Object[c];
         var10[d] = this;
         var7 = (NLoginCore_168)var10000.newInstance(var10);
      } catch (ReflectiveOperationException var9) {
         NLoginCore_370.c(a(e, f) + this.name() + a(g & h, i), var9);
         var7 = null;
      }

      this.a = var7;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_466.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.D("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 68), NLoginCore_466.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_183.B("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒқҞҩҥҨҚҊҲҕħ", (byte)42, 66) + var1 + NLoginCore_530.B("č", (byte)42, 66) + var2.toString(), var4);
      }
   }
}
