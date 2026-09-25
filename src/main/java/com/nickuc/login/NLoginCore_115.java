package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_115 {
   a(null),
   b(null),
   c(null),
   d(a(NLoginCore_115.ac & NLoginCore_115.ad, NLoginCore_115.ae)),
   e(a(NLoginCore_115.aj, NLoginCore_115.ak ^ NLoginCore_115.al)),
   f(null),
   g(null),
   h(a(NLoginCore_115.ax, NLoginCore_115.ay)),
   i(a(NLoginCore_115.bd, NLoginCore_115.be)),
   j(null);

   public final String cp;
   private static String[] ZKM_STR_A = new String[NLoginCore_115.l];
   private static String[] ZKM_STR_B = new String[NLoginCore_115.m];
   private static long c;
   private static int a = 10485760 >>> 180 | 10485760 << ~180 + 1;
   private static int b = (0 >>> 188 | 0 << ~188 + 1) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);
   private static int e = (6 >>> 65 | 6 << -65) & -1;
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(-1610612736);
   private static int h = Integer.reverse(1610612736);
   private static int i = Integer.reverse(-536870912);
   private static int j = 33554432 >>> 54 | 33554432 << ~54 + 1;
   private static int k = Integer.reverse(-1879048192);
   private static int l = Integer.reverse(1879048192);
   private static int m = Integer.reverse(1879048192);
   private static int n = Integer.reverse(0);
   private static long o = Long.reverse(-3566066543468597225L);
   private static long p = Long.reverse(5188146770730811392L);
   private static int q = (0 >>> 101 | 0 << ~101 + 1) & -1;
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static long s = Long.reverse(-3566066543468597225L);
   private static long t = Long.reverse(5188146770730811392L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int v = 524288 >>> 242 | 524288 << ~242 + 1;
   private static long w = Long.reverse(-8754213314199408617L);
   private static int x = Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << ~158 + 1;
   private static int y = Integer.reverse(-1073741824);
   private static long z = Long.reverse(-3566066543468597225L);
   private static long aa = Long.reverse(5188146770730811392L);
   private static int ab = (1536 >>> 169 | 1536 << ~169 + 1) & -1;
   private static int ac = Integer.reverse(536870912);
   private static int ad = -1 >>> 34 | -1 << ~34 + 1;
   private static long ae = Long.reverse(-8754213314199408617L);
   private static int af = Integer.reverse(-1610612736);
   private static long ag = Long.reverse(-3566066543468597225L);
   private static long ah = Long.reverse(5188146770730811392L);
   private static int ai = Integer.reverse(536870912);
   private static int aj = Integer.reverse(1610612736);
   private static long ak = Long.reverse(-3566066543468597225L);
   private static long al = Long.reverse(5188146770730811392L);
   private static int am = Integer.reverse(-536870912);
   private static long an = Long.reverse(-3566066543468597225L);
   private static long ao = Long.reverse(5188146770730811392L);
   private static int ap = Integer.reverse(-1610612736);
   private static int aq = 33554432 >>> 54 | 33554432 << ~54 + 1;
   private static long ar = Long.reverse(-8754213314199408617L);
   private static int as = 1572864 >>> 18 | 1572864 << ~18 + 1;
   private static int at = Integer.reverse(-1879048192);
   private static long au = Long.reverse(-3566066543468597225L);
   private static long av = Long.reverse(5188146770730811392L);
   private static int aw = Integer.reverse(-536870912);
   private static int ax = Integer.reverse(1342177280);
   private static long ay = Long.reverse(-8754213314199408617L);
   private static int az = Integer.reverse(-805306368);
   private static long ba = Long.reverse(-3566066543468597225L);
   private static long bb = Long.reverse(5188146770730811392L);
   private static int bc = 2 >>> 222 | 2 << ~222 + 1;
   private static int bd = Integer.reverse(805306368);
   private static long be = Long.reverse(-8754213314199408617L);
   private static int bf = 425984 >>> 175 | 425984 << -175;
   private static long bg = Long.reverse(-8754213314199408617L);
   private static int bh = Integer.reverse(-1879048192);

   @Nullable
   public static NLoginCore_115 a(int var0) {
      return var0 > 0 && var0 < values().length ? values()[var0] : null;
   }

   private static void b() {
      c = -1725893528081186445L;
      long var0 = c ^ -5221870125456676446L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(35 + 34),
               (byte)(72 + 11),
               (byte)(39 + 8),
               (byte)(4 + 63),
               (byte)(11 + 55),
               (byte)(56 + 11),
               (byte)(21 + 26),
               (byte)(75 + 5),
               (byte)(41 + 34),
               (byte)(10 + 57),
               (byte)(68 + 15),
               (byte)(31 + 22),
               (byte)(61 + 19),
               (byte)(73 + 24),
               (byte)(9 + 91),
               (byte)(93 + 7),
               (byte)(18 + 87),
               110,
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_092.A("ǡǧƿǩǰǮǆǎǈǸǑǐǚǁǋǽȃǓǢǔǔǷǎǏ", (byte)126, 65);
               ZKM_STR_B[1] = NLoginCore_553.C("ւ։֦֘֟ե֫ա֪է\u058c֧֖֭֬֨քց\u058c֚֗֕ւփ", (byte)126, 67);
               ZKM_STR_B[2] = NLoginCore_092.C("ւ։֦֘֟ե֫ա֪է֊֮օֲֵ֦֥֭֙֩պ֕ւփ", (byte)126, 67);
               ZKM_STR_B[3] = NLoginCore_433.E("թքֆ֫֏֢֎֨շ֜֯ւ", (byte)126, 69);
               ZKM_STR_B[4] = NLoginCore_141.C("՞չջ֠ք֗փ֝լ֑֤շ", (byte)126, 67);
               ZKM_STR_B[5] = NLoginCore_453.A("ǭǊǋǌǏǩǚǪǉǱǎǃ", (byte)126, 65);
               ZKM_STR_B[6] = NLoginCore_559.D("֡վտրփ֝֎֞ս֥ւշ", (byte)126, 68);
               ZKM_STR_B[7] = NLoginCore_559.A("ǠǮǌǋǥǅǣƲǝǻǈǿǮƽǝǖǲǲǠȀƺǑǎǏ", (byte)126, 65);
               ZKM_STR_B[8] = NLoginCore_141.E("ցւփ֊ֲָղ֏ջճոռֳնַֻ֕֔׀֣֦\u0590֍֎", (byte)126, 69);
               ZKM_STR_B[9] = NLoginCore_453.B("ǁưǲǈǥƲǭǮƺǲǖƿƼǓǷȁǢǝǸǯǦǑǎǏ", (byte)126, 66);
               ZKM_STR_B[10] = NLoginCore_127.C("֡եՠ֕փ֪֜ֆզ֦թշ", (byte)126, 67);
               ZKM_STR_B[11] = NLoginCore_092.B("ǜǤƾǳǦǅƳǱǭǪǚǿǶƳǿǐƿǠǑǴǗǑǎǏ", (byte)126, 66);
               ZKM_STR_B[12] = NLoginCore_446.A("ǭǊǋǌǏǩǚǪǉǱǎǃ", (byte)126, 65);
               ZKM_STR_B[13] = NLoginCore_521.C("ռբչտչ֍֍֍֨֫֠֯րէ֧կ֒։֛֖֫֕ւփ", (byte)126, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.E("֦֠վ֭֨֯օ֍ևַ\u0590֙չ\u058bּւֱֲ֔֕֙\u05c9ֈֹ֦֭֜և֧֩ג֨", (byte)126, 69);
               ZKM_STR_B[1] = NLoginCore_127.E("֍ֱ֣֪֔հֶլֵղ֗շ֒ջ֕֍\u058b֟׀ֺ׀\u0590֍֎", (byte)126, 69);
               ZKM_STR_B[2] = NLoginCore_575.D("ւ։֦֘֟ե֫ա֪է\u058b֥ս֦ձ֭րִֻ֥֛֚ւփ", (byte)126, 68);
               ZKM_STR_B[3] = NLoginCore_232.E("ְ֬֠֯֩֍֘ոַֹմւ", (byte)126, 69);
               ZKM_STR_B[4] = NLoginCore_173.F("խ֢֠\u058b֨ծֹ֧պ֧֗ւ", (byte)126, 70);
               ZKM_STR_B[5] = NLoginCore_427.E("ֲց֔ցֳփ֏ְ֭֫֘֔\u0590պ֭֒րսְ֥֏ֶ֍֎", (byte)126, 69);
               ZKM_STR_B[6] = NLoginCore_141.E("ռ֩ի։ַ֦֓չչֹ֏ֳֵ֪֕֜׃ն\u0590׀ֵ׆֍֎", (byte)126, 69);
               ZKM_STR_B[7] = NLoginCore_241.D("֢֔րտ֙չ֗զ֑֯պղֲ֡֍ֱ։ִ֖֏ֻ֨ւփ", (byte)126, 68);
               ZKM_STR_B[8] = NLoginCore_127.A("ǂǃǄǋǳǹƳǐƼƴƹǹǯǺǞǮǾǃƸǔǖȇǎǏ", (byte)126, 65);
               ZKM_STR_B[9] = NLoginCore_027.B("ǁưǲǈǥƲǭǮƺǲǖǎƾƸǰƽǲƷǹǄǛǾǪǛǾǣǉȏȇǬǱǬ", (byte)126, 66);
               ZKM_STR_B[10] = NLoginCore_433.E("ւ֜\u0590ִַֹ֦ոְֶ֧֝֗։֭֍ֱֳֿׄ֜֠֍֎", (byte)126, 69);
               ZKM_STR_B[11] = NLoginCore_127.E("֛֣սֲ֥քղְָֺֻ֥֬֩֜֘֗֙׀֦֪֖֠֕֘ׄ׀֧֢֚ׄ֡", (byte)126, 69);
               ZKM_STR_B[12] = NLoginCore_521.D("֠օռտֈր֏֫\u0590ֱ֦քհլը֬ւփֈ\u0590ֻֻւփ", (byte)126, 68);
               ZKM_STR_B[13] = NLoginCore_201.B("ǈƮǅǋǅǙǙǙǴǷǭǖǚǭǂǒǷǓǣǠǜǡǎǏ", (byte)126, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.E("ճ֪խճֱ\u0590֯ֈօֱֵ֪֪֝֘֩\u0590ׁ֖֟ւ׀֢֦փּ֫֜֫־֟֎", (byte)126, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_427.F("իխյֱ։֗֒ֆ֧֕֊ַև֪։ְ֞־׀ֶ֢\u0590֍֎", (byte)126, 70);
         }
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_115.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.D("ҎҰҲҒҶӕӍӣӏҞӜӒӠӚңӈӪөӡӧӡҶ", (byte)59, 68), NLoginCore_115.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.A("ŘťŤħŧţŞŧŲšĮŬŰũŬŲĴӏҿӋӉҪӁӆҭӃӈӌŋ", (byte)59, 65) + var1 + NLoginCore_453.C("Ҡ", (byte)59, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   private NLoginCore_115(String var3) {
      this.cp = var3;
   }

   private static String a(int var0, long var1) {
      var1 ^= 18L;
      var1 ^= -5221870125456676446L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(22 + 47),
                     (byte)(42 + 41),
                     (byte)(8 + 39),
                     (byte)(41 + 26),
                     (byte)(58 + 8),
                     (byte)(46 + 21),
                     (byte)(45 + 2),
                     (byte)(68 + 12),
                     (byte)(9 + 66),
                     (byte)(30 + 37),
                     (byte)(38 + 45),
                     (byte)(30 + 23),
                     (byte)(20 + 60),
                     97,
                     (byte)(26 + 74),
                     (byte)(48 + 52),
                     (byte)(75 + 30),
                     (byte)(109 + 1),
                     (byte)(47 + 56)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(6 + 63), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.A("ìùø»û÷òûĆõÂĀĄýĀĆÈѣѓџѝоѕњсїќѠ", (byte)5, 65));
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
}
