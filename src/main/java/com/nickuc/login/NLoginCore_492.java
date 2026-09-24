package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_492 implements NLoginInterface_003, NLoginInterface_043 {
   private static int aa = Integer.reverse(1073741824);
   private static long y = Long.reverse(1441151880758558720L);
   private static int ac = Integer.reverse(-536870912);
   private static int z = Integer.reverse(0);
   private static int w = (768 >>> 39 | 768 << ~39 + 1) & -1;
   private static long v = Long.reverse(1441151880758558720L);
   private static long x = Long.reverse(5678119429909366178L);
   private static long l = Long.reverse(1441151880758558720L);
   private static long e = Long.reverse(1441151880758558720L);
   private static int i = 0 >>> 150 | 0 << ~150 + 1;
   private static int t = Integer.reverse(-1610612736);
   private static long d = Long.reverse(5678119429909366178L);
   private static long h = Long.reverse(1441151880758558720L);
   private static long p = Long.reverse(6542810558364501410L);
   private static int m = Integer.reverse(0);
   private static long k = Long.reverse(5678119429909366178L);
   private static int s = Integer.reverse(0);
   private static int q = (1048576 >>> 242 | 1048576 << ~242 + 1) & -1;
   private static int j = 16384 >>> 173 | 16384 << ~173 + 1;
   private static int b = Integer.reverse(0);
   private static long g = Long.reverse(5678119429909366178L);
   private static long u = Long.reverse(5678119429909366178L);
   private static long r = Long.reverse(6542810558364501410L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int n = 6 >>> 225 | 6 << ~225 + 1;
   private static int ab = Integer.reverse(-536870912);
   private static String[] a = new String[ab];
   private static String[] b = new String[ac];
   private static int o = Integer.reverse(-1);
   private static int a = (4 >>> 193 | 4 << -193) & -1;

   private static String a(int var0, long var1) {
      var1 ^= 40L;
      var1 ^= 2483204766605628367L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(50 + 19),
                     (byte)(46 + 37),
                     47,
                     (byte)(5 + 62),
                     66,
                     (byte)(65 + 2),
                     (byte)(18 + 29),
                     (byte)(53 + 27),
                     (byte)(50 + 25),
                     (byte)(61 + 6),
                     (byte)(31 + 52),
                     (byte)(34 + 19),
                     (byte)(72 + 8),
                     (byte)(51 + 46),
                     (byte)(76 + 24),
                     (byte)(95 + 5),
                     (byte)(3 + 102),
                     (byte)(30 + 80),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.B("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐҠҤҌҪҬҜҠҞҜҨҰҪҟҒҵ", (byte)41, 66));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_492.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_471.A("íďđñĕĴĬłĮýĻıĿĹĂħŉňŀņŀĕ", (byte)35, 65), NLoginCore_492.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟࢮࢲ࢚ࢸࢺࢪࢮࢬࢪࢶࢾࢸࢭࢠࣃԹ", (byte)35, 69) + var1 + NLoginCore_427.E("ԙ", (byte)35, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 5018065350996865906L;
      long var0 = c ^ 2483204766605628367L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(37 + 32),
               (byte)(58 + 25),
               (byte)(37 + 10),
               (byte)(26 + 41),
               (byte)(62 + 4),
               (byte)(49 + 18),
               (byte)(14 + 33),
               (byte)(24 + 56),
               75,
               (byte)(52 + 15),
               83,
               (byte)(18 + 35),
               (byte)(77 + 3),
               (byte)(93 + 4),
               (byte)(2 + 98),
               (byte)(97 + 3),
               (byte)(25 + 80),
               (byte)(19 + 91),
               (byte)(27 + 76)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_241.D("ӳӞӊӵӠӖԁӖԆԋԏԋԍӱөӽӡԁӳӠӰԜԆԡԘӺԈԬԜԙԍԣԳӰӦӱӶӱԃԶӷӷԇӳԌԱԲԒԪԎӽӽԜԓԞԩԇԘՈԮԩԯԸԝ", (byte)76, 68);
               b[1] = NLoginCore_027.B("ŦƏũŲƋƔŢƃƙřƉŖūƝŷŞŗƢơƐŵŠƙƇŨűƈŤƦƉƙƩƙƒƜƤŽƤƃũƠƆƅƃƻƙŸŸƔƳƭžƌƯƘƤƳƟƓƶƿƽƣƋ", (byte)76, 66);
               b[2] = NLoginCore_530.E(
                  "բՍԹդՏՅհՅյպվգխքջ՜կ։վ֕֎ՍՖֈդֆ՛ֆոկՙ֟ց֓տՖ֜ռ\u0590ճե֗րդ֪֚֏֏պִ֪\u0590֎֑֕\u0590֙֔մֵ֛մ֑֣֢֦֘֒֞֝տ֖֣֪֩֞ֆֈ֎ֿׅ֪֭֮־ֶ֡א\u05c9֧֔ם֙֘לְֲָֹפנלדֵׇֹ֤ז\u05ecַׅ\u05cd֬ׄנֽ׳\u05ebגֱ\u05cc\u05fbח\u05edיוװ־\u05f5\u05cfּײפֽ׆בץ״\u05ffםן\u05ff\u05c8\u05cbץ؇\u05eb\u0601\u05cc\u05eeכל",
                  (byte)76,
                  69
               );
               b[3] = NLoginCore_138.A("ƊůƀŌŨůőšƋƅőş", (byte)76, 65);
               b[4] = NLoginCore_183.D("ӚӱӟԏӧԖӭӱԂӫӰӡ", (byte)76, 68);
               b[5] = NLoginCore_397.F("բՍԹդՏՅհՅյպվեշՌխչՠֆՎ՝յըշֈձ։֍֚՛՚֠ձ\u0558ր֢՝դտֆ֧֚վժհ", (byte)76, 70);
               b[6] = NLoginCore_091.F("բԺՏՐՔՒրՐղՁՁ\u058bյէփՐՑՌ֒։ճծ՛՜", (byte)76, 70);
               break;
            case 1:
               b[0] = NLoginCore_521.B("űŜňųŞŔſŔƄƉƍƉƋůŧŻşſűŞŮƚƄƟƖŸƆƪƚƗƋơƱŮŤůŴůƁƴŵŵƅűƊƯưƐƨƌŻŻƚƒƒƽƿǀƷƗƛƾǎƨǌƪƐƪǒǒƓǀơǁƙƟ", (byte)76, 66);
               b[1] = NLoginCore_471.B("ŦƏũŲƋƔŢƃƙřƉŖūƝŷŞŗƢơƐŵŠƙƇŨűƈŤƦƉƙƩƙƒƜƤŽƤƃũƠƆƅƃƻƙŸŸƔƳƭžƌƱƃƾźƴƳǂƇƷƛƿ", (byte)76, 66);
               b[2] = NLoginCore_183.B(
                  "űŜňųŞŔſŔƄƉƍŲżƓƊūžƘƍƤƝŜťƗųƕŪƕƇžŨƮƐƢƎťƫƋƟƂŴƦƏųƹƩƞƞƉƹǃƟƝƠƤƟƨƣƃǄƪƃƠƧơƲƭƱƬƵƎƥƲƹƸƭƕƗƝƽǔǎƼƹǍưǅǟǘƣƶǬƨƧǫǈǁƿǇǳǯǫǢǈƳǄǖǥǻǔǆǜƻǓǯǌȂǺǡǀǛȊǦǼǨǤǿǍȄǞǋȁǳǌǕǠǴȃȍǷǖȐǗǱǶȁǱǫǮȄǯǼǻȊǢǦȀȡǦȠ",
                  (byte)76,
                  66
               );
               b[3] = NLoginCore_183.A("ňŇƒŭōƕũƇŹƒŪş", (byte)76, 65);
               b[4] = NLoginCore_559.F("աՕդԿԼՀշՒ՜՟օՐ", (byte)76, 70);
               b[5] = NLoginCore_384.D("ӳӞӊӵӠӖԁӖԆԋԏӶԈӝӾԊӱԗӟӮԆӹԈԙԂԚԞԫӬӫԱԂӪӱԨԍӬԀӶԋԈԨԗԊԫԨԑՀԂԿԠӽԽՅԌԍ", (byte)76, 68);
               b[6] = NLoginCore_201.A("űŉŞşţšƏşƁŐŐũŽƒśŖƝźƌƑƚŭŪū", (byte)76, 65);
               break;
            case 2:
               b[0] = NLoginCore_241.B("šşƋŤŽŤňƕŲźŕş", (byte)76, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.F("աՀդւՄմվփՖՂՉզտՋզՙՠբ՟է֔֔՛՜", (byte)76, 70);
         }
      }
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      if (BCryptHashProvider.a() == NLoginCore_175.c) {
         Channel var2 = (Channel)var1.getChannel();
         if (var2.hasAttr(NLoginCore_096.c)) {
            NLoginCore_096 var3 = (NLoginCore_096)var2.attr(NLoginCore_096.c).get();
            if (var3 != null) {
               if (var3.f == a) {
                  var2.attr(NLoginCore_096.c).set(null);
                  BCryptHashProvider.a(NLoginCore_175.d);
                  NLoginCore_370.c(a(b, d ^ e) + BCryptHashProvider.a() + a(f, g ^ h));
                  NLoginCore_370.c(a(j, k ^ l) + NLoginCore_477.al.a().a()[m] + a(n & o, p) + NLoginCore_175.d + a(q, r));
                  NLoginCore_370.c(a(t, u ^ v) + NLoginCore_175.d + a(w, x ^ y));
               }
            }
         }
      }
   }

   @Override
   public void a(PacketSendEvent var1) {
      if (BCryptHashProvider.a() == NLoginCore_175.c) {
         Channel var2 = (Channel)var1.getChannel();
         if (var2.hasAttr(NLoginCore_096.c)) {
            NLoginCore_096 var3 = (NLoginCore_096)var2.attr(NLoginCore_096.c).get();
            if (var3 != null) {
               var3.f = (byte)aa;
            }
         }
      }
   }
}
