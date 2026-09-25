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

public class NLoginCore_257 implements NLoginInterface_039, NLoginInterface_035 {
   private static int s = Integer.reverse(637534208);
   private static int h = (128 >>> 166 | 128 << -166) & -1;
   private static int v = 0 >>> 64 | 0 << ~64 + 1;
   private static int ax = (2097152 >>> 21 | 2097152 << -21) & -1;
   private static long p = Long.reverse(-5476377146882523136L);
   private static int w = -2147483646 >>> 127 | -2147483646 << ~127 + 1;
   private static int ay = Integer.reverse(0);
   private static long ar = Long.reverse(-5476377146882523136L);
   private static int q = -1 >>> 153 | -1 << ~153 + 1;
   private static int e = 2048 >>> 107 | 2048 << -107;
   private static String[] ZKM_STR_B = new String[NLoginCore_257.bc];
   private static int z = (100663296 >>> 120 | 100663296 << ~120 + 1) & -1;
   private static long aw = Long.reverse(-7875232798309457935L);
   private static long c;
   private static long ae = Long.reverse(-5476377146882523136L);
   private final NLoginCore_211 N;
   private static int as = (425984 >>> 143 | 425984 << -143) & -1;
   private static long an = Long.reverse(2789291119303876593L);
   private static long ad = Long.reverse(2789291119303876593L);
   private static int au = (1835008 >>> 145 | 1835008 << ~145 + 1) & -1;
   private static long aq = Long.reverse(2789291119303876593L);
   private static int a = Integer.reverse(0);
   private static int am = 22528 >>> 203 | 22528 << -203;
   private static int t = 524288 >>> 19 | 524288 << -19;
   private static int ac = Integer.reverse(-536870912);
   private static long al = Long.reverse(-7875232798309457935L);
   private static long x = Long.reverse(2789291119303876593L);
   private static long ao = Long.reverse(-5476377146882523136L);
   private static int av = Integer.reverse(-1);
   private static int k = (98304 >>> 47 | 98304 << ~47 + 1) & -1;
   private static int af = Integer.reverse(268435456);
   private static long ah = Long.reverse(-5476377146882523136L);
   private static long j = Long.reverse(-5476377146882523136L);
   private static int bb = (-268435456 >>> 252 | -268435456 << -252) & -1;
   private static int bc = Integer.reverse(-268435456);
   private static long f = Long.reverse(2789291119303876593L);
   private static long l = Long.reverse(2789291119303876593L);
   private static long d = Long.reverse(-5476377146882523136L);
   private static int ba = Integer.reverse(0);
   private static long aa = Long.reverse(2789291119303876593L);
   private static long i = Long.reverse(2789291119303876593L);
   private static long aj = Long.reverse(-7875232798309457935L);
   private static int az = Integer.reverse(0);
   private static int u = Integer.reverse(0);
   private static long y = Long.reverse(-5476377146882523136L);
   private static long ag = Long.reverse(2789291119303876593L);
   private static int ai = Integer.reverse(-1879048192);
   private static int ap = Integer.reverse(805306368);
   private static int n = Integer.reverse(536870912);
   private static String[] ZKM_STR_A = new String[bb];
   private static long b = Long.reverse(2789291119303876593L);
   private static long g = Long.reverse(-5476377146882523136L);
   private static long at = Long.reverse(-7875232798309457935L);
   private static long o = Long.reverse(2789291119303876593L);
   private static int ak = Integer.reverse(1342177280);
   private static long ab = Long.reverse(-5476377146882523136L);
   private static int r = (-1 >>> 47 | -1 << ~47 + 1) & -1;
   private static long m = Long.reverse(-5476377146882523136L);

   private static void b() {
      c = -8072066103545582236L;
      long var0 = c ^ -7549037813100244765L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(4 + 65),
               (byte)(42 + 41),
               (byte)(30 + 17),
               (byte)(9 + 58),
               (byte)(20 + 46),
               (byte)(64 + 3),
               (byte)(46 + 1),
               80,
               75,
               (byte)(28 + 39),
               (byte)(52 + 31),
               (byte)(12 + 41),
               (byte)(45 + 35),
               (byte)(51 + 46),
               (byte)(66 + 34),
               (byte)(56 + 44),
               (byte)(64 + 41),
               (byte)(78 + 32),
               (byte)(64 + 39)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.E("֬ձջվց\u058cֶ֣ղչֵր", (byte)124, 69);
               ZKM_STR_B[1] = NLoginCore_530.C("՝ւ֎֤֏օ֥ֈեը֖ձ", (byte)124, 67);
               ZKM_STR_B[2] = NLoginCore_091.B("ǤǛǨǒǏǯǧǤǥǩǆƿ", (byte)124, 66);
               ZKM_STR_B[3] = NLoginCore_091.C("֖֍֚քց֖֛֡֙֗ոձ", (byte)124, 67);
               ZKM_STR_B[4] = NLoginCore_201.C("ծ\u058c֒֗\u0558ձւ֛գ\u058c֦ձ", (byte)124, 67);
               ZKM_STR_B[5] = NLoginCore_027.E("֥֜֩֓\u0590ְ֥֦֪֨ևր", (byte)124, 69);
               ZKM_STR_B[6] = NLoginCore_446.F("֬ձջվց\u058cֶ֣ղչֵր", (byte)124, 70);
               ZKM_STR_B[7] = NLoginCore_553.A("ƫǐǜǲǝǓǳǖƳƶǤƿ", (byte)124, 65);
               ZKM_STR_B[8] = NLoginCore_471.C("չՠ֑֦տն֢և\u058bժէձ", (byte)124, 67);
               ZKM_STR_B[9] = NLoginCore_091.E("֢֬խ֮֬֓֩ծյլֵր", (byte)124, 69);
               ZKM_STR_B[10] = NLoginCore_553.D("պպտջ֥ջտֆ։֖֬ձ", (byte)124, 68);
               ZKM_STR_B[11] = NLoginCore_127.E("֥֜֩֓\u0590ְ֥֦֪֨ևր", (byte)124, 69);
               ZKM_STR_B[12] = NLoginCore_076.E("֬ձջվց\u058cֶ֣ղչֵր", (byte)124, 69);
               ZKM_STR_B[13] = NLoginCore_076.F("լֳִ֑֝֞֔֗մշ֥ր", (byte)124, 70);
               ZKM_STR_B[14] = NLoginCore_004.B("ǐǍǰǒƿưǱǈǃǉǰƿ", (byte)124, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.B("ǚƻǦǳǥǶǋǴǫǸǖƿ", (byte)124, 66);
               ZKM_STR_B[1] = NLoginCore_446.B("ƽƱǥǌǟǭǗǶǘƯǬƿ", (byte)124, 66);
               ZKM_STR_B[2] = NLoginCore_027.B("ǇǧǂǍƳƿǌǃǌƯƬǵƷǸǹǲǳƸƻƻǾǍǊǋ", (byte)124, 66);
               ZKM_STR_B[3] = NLoginCore_004.C("֏֘սբվ֖֑֘ղ֪֢֪֡պօ֣֝֎֑֥֟֏ռս", (byte)124, 67);
               ZKM_STR_B[4] = NLoginCore_397.F("֝ջւ֟\u058c֊ֱ֨մ֊֛֚սմַ֭֭֠֕֓֘ׄ\u058b\u058c", (byte)124, 70);
               ZKM_STR_B[5] = NLoginCore_427.C("ա֚֒ռ\u0558պռո֚֔յց֦կֈգ֤֫խֆ֪տռս", (byte)124, 67);
               ZKM_STR_B[6] = NLoginCore_397.B("ƸǛƲưǎǎǤƶǱǰƱƿ", (byte)124, 66);
               ZKM_STR_B[7] = NLoginCore_433.D("֜֜ճր֘կ֖մպ֗ռձ", (byte)124, 68);
               ZKM_STR_B[8] = NLoginCore_451.A("ǢǦǰƪǰǏǨǌǣǭƹƿ", (byte)124, 65);
               ZKM_STR_B[9] = NLoginCore_027.F("չըֳ֤ր֯\u0590ժֹֹ\u058bր", (byte)124, 70);
               ZKM_STR_B[10] = NLoginCore_521.B("ǉǞǞǴǝǓǮǬǘǵǰƿ", (byte)124, 66);
               ZKM_STR_B[11] = NLoginCore_141.E("ռְֱ֢֝ր֘ժ֤֚և֑ռ֑\u058bְָׂրְֲִ\u058b\u058c", (byte)124, 69);
               ZKM_STR_B[12] = NLoginCore_521.C("ցա֜\u0557֝օ֖օ֡չֈձ", (byte)124, 67);
               ZKM_STR_B[13] = NLoginCore_384.C("֖֢֥֕ղեմֈփ֓րձ", (byte)124, 67);
               ZKM_STR_B[14] = NLoginCore_446.E("֑ղֳ\u058c֖֪֕ղ֧֚չմ\u0590ոֲִׁ֪־ִ֯ׄ\u058b\u058c", (byte)124, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.E("\u058bֵ֦֬֠հ֫ւֱ֤֘մն։պֹֽׁ֏ּ֏ׄ\u058b\u058c", (byte)124, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.D("՟չ՝֗հ՟֠ւբյ\u058c֣ց֯֬֊\u0590ֲ֎ֵ֢֮ռս", (byte)124, 68);
         }
      }
   }

   @Override
   public boolean at() {
      return (ba != 0);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.N;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      NLoginCore_142 var4 = var1.a().a();
      return this.a(var4, var3.j() ? a(a, b ^ d) : a(e, f ^ g));
   }

   static {
      b();
   }

   private boolean a(NLoginCore_142 var1, String var2) {
      String var3 = var1.g(a(h, i ^ j) + var2);
      if (var3 != null && !var3.isEmpty()) {
         int var4 = NLoginCore_449.a(var1.g(a(k, l ^ m) + var2 + a(n, o ^ p)), q);
         return ((var4 != r && NLoginCore_354.a() != 0).nextInt(s) > var4 ? u : t);
      } else {
         return (v != 0);
      }
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (az != 0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 45L;
      var1 ^= -7549037813100244765L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(33 + 36),
                     (byte)(47 + 36),
                     (byte)(5 + 42),
                     (byte)(64 + 3),
                     (byte)(34 + 32),
                     (byte)(36 + 31),
                     (byte)(8 + 39),
                     (byte)(65 + 15),
                     (byte)(68 + 7),
                     (byte)(2 + 65),
                     (byte)(19 + 64),
                     (byte)(43 + 10),
                     (byte)(34 + 46),
                     (byte)(96 + 1),
                     100,
                     (byte)(10 + 90),
                     (byte)(71 + 34),
                     (byte)(33 + 77),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.D("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹ\u085fࢉ\u086dࢅ\u0894\u0892ࢅࡻ\u086eࢆ࢙ࡼ\u0897", (byte)87, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_257.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.C("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)104, 67), NLoginCore_257.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.C("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬ\u0892ࢼࢠࢸࣇࣅࢸࢮࢡࢹ࣌ࢯ࣊Յ", (byte)104, 67) + var1 + NLoginCore_575.C("ԧ", (byte)104, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_257(NLoginCore_211 var1) {
      this.N = var1;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_142 var5 = var1.a().a();
      boolean var6 = var3.j();
      String var7 = var5.b(a(w, x ^ y) + (var6 ? a(z, aa ^ ab) : a(ac, ad ^ ae)), a(af, ag ^ ah));
      String var8 = NLoginCore_065.q(NLoginCore_158.u(var7).replace(a(ai, aj), a(ak, al)));
      String var9 = var5.g(a(am, an ^ ao) + (var6 ? a(ap, aq ^ ar) : a(as, at)) + a(au & av, aw));
      if (var9 != null && !var9.isEmpty()) {
         var4.c(var8, NLoginCore_158.u(var9));
      } else {
         var4.a(var8);
      }

      NLoginCore_445[] var10001 = new NLoginCore_445[ax];
      var10001[ay] = NLoginCore_445.a;
      return GUIButtonContainer.a(var2, var10001);
   }
}
