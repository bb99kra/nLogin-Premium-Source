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

public class BukkitHelper_001 {
   private static int k = (96 >>> 229 | 96 << ~229 + 1) & -1;
   private static long g = Long.reverse(-6052837899185946624L);
   private static int a = Integer.reverse(-536870912);
   private static long d = Long.reverse(-717492141676953996L);
   private static int h = Integer.reverse(1073741824);
   private static String[] a;
   public static final String a = a(h, BukkitHelper_001.i ^ BukkitHelper_001.j);
   private static long c;
   private static long v = Long.reverse(-717492141676953996L);
   private static long j = Long.reverse(-6052837899185946624L);
   private static long r = Long.reverse(6488267262115839604L);
   private static long s = Long.reverse(-6052837899185946624L);
   private static long i = Long.reverse(6488267262115839604L);
   private static int c = 0 >>> 150 | 0 << ~150 + 1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int q = Integer.reverse(-1610612736);
   public static final String c = a(k, BukkitHelper_001.l ^ BukkitHelper_001.m);
   public static final String f;
   public static final String g = a(q, r ^ s);
   private static long o = Long.reverse(6488267262115839604L);
   private static long l = Long.reverse(6488267262115839604L);
   private static int u = (-1 >>> 253 | -1 << ~253 + 1) & -1;
   public static final String b = a(BukkitHelper_001.n, o ^ BukkitHelper_001.p);
   private static int n = Integer.reverse(536870912);
   private static int t = (3145728 >>> 211 | 3145728 << ~211 + 1) & -1;
   private static int b = Integer.reverse(-536870912);
   private static long m = Long.reverse(-6052837899185946624L);
   private static String[] b;
   private static long p = Long.reverse(-6052837899185946624L);
   private static long f = Long.reverse(6488267262115839604L);
   public static final String e;
   public static final String d = a(t & u, v);

   private static void b() {
      c = 3350586224643362906L;
      long var0 = c ^ -6363808814331967818L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(49 + 19),
               (byte)(26 + 43),
               (byte)(23 + 60),
               (byte)(35 + 12),
               (byte)(13 + 54),
               (byte)(47 + 19),
               (byte)(41 + 26),
               47,
               80,
               (byte)(28 + 47),
               (byte)(13 + 54),
               (byte)(63 + 20),
               (byte)(45 + 8),
               (byte)(6 + 74),
               (byte)(44 + 53),
               (byte)(32 + 68),
               (byte)(4 + 96),
               (byte)(21 + 84),
               (byte)(54 + 56),
               (byte)(94 + 9)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.D("ҙ҈ѩѬҤүҨѮҍҹѵҭ҇҇ҼѼҺҵѿҟҲҀҍҼқҠҢѼӈҥӊҟӊүҰӏӍҒӆӊҶҫҭӄҔһҹҶҾҴқӌӖӜҭӥҰҞӝҹӖҫҽҿөӎӄӋӏҪӀӱӠӑӪҰӦӷӖӍӰӏӖһӀӣӏӾӧҾӚӛӻӫӞӜ", (byte)43, 68);
               b[1] = NLoginCore_138.E("՚ԪԟԲՔԤ՝ԻԳՖՕԪԻՊ՟ը՚ՈբՃկ՞մգՉոՅիԹժզսալցճՍԻհԿՔՈւՆնթՊՇդգ՛֔րգ֒֓չշձչք֞ղծհ֖֑՞չ֚՞զ֒վթ֊֭֚֮֜֎֍ղժְ֖֝ձ\u058b֦֍ֆַּ֭֮", (byte)43, 69);
               b[2] = NLoginCore_453.E("ԩԽԶԹԟԮՀՆԵՔԜԹԩԭԾ՞ծժհՎճՅԵձԵՉՎԴՈսզԱ", (byte)43, 69);
               b[3] = NLoginCore_384.B("ŅķĭĨŎġŐĤńłŃŖŋčıŇśŌĪœŚęġİŞłģŢĦœĽŪŀŬĮŐĩŁĭŠŷŋœŲİŧŮőŚűŪŐƃųűŮţĿŰĻśňŭƄƄŇŉƎƐŤƍƅŰƄŦőƉřŵŮƎůƎŪŠŬŝŞƒſųŤŧƩŻŶ", (byte)43, 66);
               b[4] = NLoginCore_397.C("ҁҢѫҁҳҫѧѮѶҥҢҘһҜҳҙҗҮҵҍѿѽѼ҆ѽҧҩ҉ҟӌҼҪҾӄӉҳқҳӁӌӇҖҭәҬӕҶӈҳҗӎҰӚӣҭҳӀӘӝӤҽҾӀӢәӘӱҿӇӃҫӰӴӧӕӷӒӔҳӏӜӹӏӷӚӜӛԃԅӛӂԂԆӄәӈ", (byte)43, 67);
               b[5] = NLoginCore_397.C("ҡ҈ҫѽҬҠ҃ҤѭҘҍѳ҄ҔѴҌҩҿ҉ҭӂҎҢҾҡҕӇҖ҃ҝҋӆҎҥӇҋӔҝҐҧҗӊҮӓҕҘҺӑӐӏҴҮҺҬҹӘӛӉӇҡҪӄңҽӠҢӍӤӓҪӟӠӑӫӃӪӣӔҴӿӠӓӼӱәӤӄӗӞӴӂԄӜӣӮԁ", (byte)43, 67);
               b[6] = NLoginCore_451.B("ġĜľČŅđŃģőŅĪĨœŗĜřŌěŐśřġĸįĦńńłũŤŢŋŬŜŅśļĽŐıŁŋŸŦŰŬśŬľŏœĸŮŭƂŸĸłŦŞŷŗŻťŹŚŬŢťŦƒƍŰƕũűŘŗƋŽŦŞŽƉşƂżƖƦŧŰżƜťźƤ", (byte)43, 66);
               break;
            case 1:
               b[0] = NLoginCore_183.D("ҙ҈ѩѬҤүҨѮҍҹѵҭ҇҇ҼѼҺҵѿҟҲҀҍҼқҠҢѼӈҥӊҟӊүҰӏӍҒӆӊҶҫҭӄҔһҹҶҾҴқӌӖӜҭӥҰҞӝҹӖҫҽҿөӎӄӋӏҪӀӱӠӑӪҰӦӷӖӍӰӏӖһӀӜԅӯӑӢӜӳԋӗӶԇ", (byte)43, 68);
               b[1] = NLoginCore_553.A("ňĘčĠłĒŋĩġńŃĘĩĸōŖňĶŐıŝŌŢőķŦĳřħŘŔūŏŚůšĻĩŞĭłĶŰĴŤŗĸĵŒőŉƂŮőƀƁŧťşŧŲƌŠŜŞƄſŌŧƈŌŔƀŬŗŸƊƜƛƈżŻŠŘƋƒśŝƛƄſƥƆƧƊƣ", (byte)43, 65);
               b[2] = NLoginCore_553.B("ėīĤħčĜĮĴģłĊħėěĬŌŜŘŞļšĶŘŀıŚşģŁņšĻ", (byte)43, 66);
               b[3] = NLoginCore_324.F("\u0557ՉԿԺՠԳբԶՖՔՕը՝ԟՃՙխ՞ԼելԫԳՂհՔԵմԸեՏռՒվՀբԻՓԿղ։՝եքՂչրգլփռբ֕օփրյՑւՍխ՚տ֖֖ՙ՛֢֠ն֟֗ւ֖ոգ֛իևր֠ց֠ռղֈֲֶֹղִֵ֎֒չ֙", (byte)43, 70);
               b[4] = NLoginCore_173.C("ҁҢѫҁҳҫѧѮѶҥҢҘһҜҳҙҗҮҵҍѿѽѼ҆ѽҧҩ҉ҟӌҼҪҾӄӉҳқҳӁӌӇҖҭәҬӕҶӈҳҗӎҰӚӣҭҳӀӘӝӤҽҾӀӢәӘӱҿӇӃҫӰӴӧӕӷӒӔҳӏӜӹӏӷӚӯӷӂӅӿԇԂӸӝӝԄ", (byte)43, 67);
               b[5] = NLoginCore_201.D("ҡ҈ҫѽҬҠ҃ҤѭҘҍѳ҄ҔѴҌҩҿ҉ҭӂҎҢҾҡҕӇҖ҃ҝҋӆҎҥӇҋӔҝҐҧҗӊҮӓҕҘҺӑӐӏҴҮҺҬҹӘӛӉӇҡҪӄңҽӠҢӍӤӓҪӟӠӑӫӃӪӣӔҴӿӠӓӼӱәӟӴӢԀӰӉӥӶӨӇӷ", (byte)43, 68);
               b[6] = NLoginCore_451.F(
                  "ԳԮՐԞ\u0557ԣՕԵգ\u0557ԼԺեթԮի՞ԭբխիԳՊՁԸՖՖՔջնմ՝վծ\u0557խՎՏբՃՓ՝֊ուվխվՐաեՊրտ֔֊ՊՔոհ։թ֍շ\u058bլվմշո֤֟ւ֧ջփժթ֝֏ոհ֏֛ձ֡\u0590ծ֕փչք֊֎֏֧", (byte)43, 70
               );
               break;
            case 2:
               b[0] = NLoginCore_091.F("ԠՙԵԹԟՒԤԦԟԟՁեիՁէԼԻԩՑՄՕՒՅՎՄՓչՌճծզԹ", (byte)43, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_324.C("Ҩ҅үҀҭҮҩҍҩҹ҉Ѿ", (byte)43, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  BukkitHelper_001.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_201.E("\u0530ՒՔԴ\u0558շկօձՀվմւռՅժ\u058c\u058bփ։փ\u0558", (byte)76, 69), BukkitHelper_001.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.C("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘࡊࡤࡢࡣ\u086dࡗࡪࡹࡒࡇࡴӯ", (byte)76, 67) + var1 + NLoginCore_530.A("ő", (byte)76, 65) + var2.toString(), var4
         );
      }
   }

   static {
      a = new String[a];
      b = new String[b];
      b();
      f = a(c, d);
      e = a(e, f ^ g);
   }

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= -6363808814331967818L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(35 + 33),
                     (byte)(60 + 9),
                     (byte)(37 + 46),
                     (byte)(5 + 42),
                     (byte)(29 + 38),
                     (byte)(18 + 48),
                     (byte)(40 + 27),
                     (byte)(37 + 10),
                     (byte)(61 + 19),
                     75,
                     (byte)(28 + 39),
                     (byte)(45 + 38),
                     (byte)(8 + 45),
                     (byte)(2 + 78),
                     (byte)(2 + 95),
                     (byte)(53 + 47),
                     (byte)(90 + 10),
                     (byte)(72 + 33),
                     110,
                     (byte)(10 + 93)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.A("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴӦԀӾӿԉӳԆԕӮӣԐ", (byte)91, 65));
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
}
