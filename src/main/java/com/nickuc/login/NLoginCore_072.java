package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_072 implements NLoginInterface_010 {
   private static long u = Long.reverse(-3746994889972252672L);
   private static long c;
   private static int g = (1048576 >>> 180 | 1048576 << -180) & -1;
   private static long t = Long.reverse(4495704402569648265L);
   private static long z = Long.reverse(4495704402569648265L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int s = (262144 >>> 113 | 262144 << -113) & -1;
   private static int l = Integer.reverse(0);
   private static int h = (0 >>> 35 | 0 << -35) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_072.au];
   private static int y = 32 >>> 3 | 32 << -3;
   private static long o = Long.reverse(-3746994889972252672L);
   private static long al = Long.reverse(-3746994889972252672L);
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static long b = Long.reverse(4296434044511453184L);
   private static long n = Long.reverse(4495704402569648265L);
   private static int ae = (12 >>> 161 | 12 << -161) & -1;
   private static long af = Long.reverse(-980672744312874871L);
   private static int am = Integer.reverse(-1879048192);
   private static int i = -1811939311 >>> 215 | -1811939311 << -215;
   private static long w = Long.reverse(4495704402569648265L);
   private static int aj = Integer.reverse(268435456);
   private static String[] ZKM_STR_B = new String[NLoginCore_072.av];
   private static long aa = Long.reverse(-3746994889972252672L);
   private static int av = (1342177280 >>> 59 | 1342177280 << -59) & -1;
   private static int ab = Integer.reverse(-1610612736);
   private static int q = -1 >>> 70 | -1 << ~70 + 1;
   private static int an = -1 >>> 87 | -1 << -87;
   private static long as = Long.reverse(-6917529027641081856L);
   private static int au = Integer.reverse(1342177280);
   private static int j = Integer.reverse(0);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_211 Z;
   private static int ar = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(-980672744312874871L);
   private static long ac = Long.reverse(4495704402569648265L);
   private static long ah = Long.reverse(4495704402569648265L);
   private static long x = Long.reverse(-3746994889972252672L);
   private static long f = Long.reverse(8646911284551352320L);
   private static long ad = Long.reverse(-3746994889972252672L);
   private static int aq = 0 >>> 146 | 0 << -146;
   private static long e = Long.reverse(4323455642275676160L);
   private static int ag = (229376 >>> 47 | 229376 << ~47 + 1) & -1;
   private static long ak = Long.reverse(4495704402569648265L);
   private static int at = Integer.reverse(0);
   private static long ap = Long.reverse(4611686018427387904L);
   private static long ao = Long.reverse(-980672744312874871L);
   private static int v = (25165824 >>> 183 | 25165824 << -183) & -1;
   private static long ai = Long.reverse(-3746994889972252672L);
   private static int c = (0 >>> 62 | 0 << -62) & -1;
   private static int m = Integer.reverse(0);

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      var2.ad();
      NLoginInterface_010.super.a(var1, var2, var3, var4, var5);
   }

   private static String a(int var0, long var1) {
      var1 ^= 51L;
      var1 ^= -6977737227918045566L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(23 + 45),
                     (byte)(17 + 52),
                     (byte)(42 + 41),
                     (byte)(32 + 15),
                     (byte)(20 + 47),
                     66,
                     (byte)(18 + 49),
                     47,
                     (byte)(33 + 47),
                     (byte)(56 + 19),
                     (byte)(48 + 19),
                     (byte)(71 + 12),
                     (byte)(18 + 35),
                     (byte)(61 + 19),
                     (byte)(44 + 53),
                     (byte)(50 + 50),
                     (byte)(41 + 59),
                     (byte)(77 + 28),
                     (byte)(78 + 32),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(24 + 44), 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.E("ՀՍՌԏՏՋՆՏ՚ՉԖՔ\u0558ՑՔ՚Ԝࢤࢩࢪࢄ\u0895ࢇࢥࢫࢾ", (byte)33, 69));
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
      c = -7990711347680655748L;
      long var0 = c ^ -6977737227918045566L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(44 + 25),
               (byte)(39 + 44),
               (byte)(38 + 9),
               (byte)(13 + 54),
               (byte)(54 + 12),
               67,
               (byte)(22 + 25),
               (byte)(62 + 18),
               (byte)(29 + 46),
               67,
               (byte)(33 + 50),
               (byte)(28 + 25),
               (byte)(75 + 5),
               (byte)(43 + 54),
               (byte)(16 + 84),
               (byte)(86 + 14),
               (byte)(48 + 57),
               (byte)(108 + 2),
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(20 + 63)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.C("ѲқѮјғҊҒџҠҤҟѷҁҜғѽѷҪҫѷ҉ҝѴѵ", (byte)36, 67);
               ZKM_STR_B[1] = NLoginCore_559.F("ԶԺ՜ԶԜՋԖՎԓբԵԺ՚ԹՒՂ՜ԶգԥՎէՀԽՈՎիճՆԾԱՓՉոՐԻՉչԵԷԿ՞ՏՈ", (byte)36, 70);
               ZKM_STR_B[2] = NLoginCore_433.F("ԫՓԨԱԺ\u0557Օ՜ԟԻԻԨ", (byte)36, 70);
               ZKM_STR_B[3] = NLoginCore_521.E("ԶԺ՜ԶԜՋԖՎԓբԳԝԻՄՔ՞՞Ԡ\u0558՛ԹՏՈ՛ՌժՋԳեՈՉխՙգոՄՍջՎջկնչՈ", (byte)36, 69);
               ZKM_STR_B[4] = NLoginCore_232.C("ѫ҇ҋѬѦѨѳѭҟѹҀѿѴѼҜѽѨѧѪҧҗҝѴѵ", (byte)36, 67);
               ZKM_STR_B[5] = NLoginCore_110.F("ԶԺ՜ԶԜՋԖՎԓբԴդԗՑՐ՚ԿԺՌՔՈԾԥԦՉՓԽիխԮԳԪԸ\u0558ՃՇԼՇճՊՒցչՁՅջԾցչ\u0558ոոեՖՓՔ", (byte)36, 70);
               ZKM_STR_B[6] = NLoginCore_076.B("þþĂēĞĜĹĿĐŇĤĚńĖĎĨģĤńŇĪĭĚě", (byte)36, 66);
               ZKM_STR_B[7] = NLoginCore_027.A("ĝġŃĝăĲýĵúŉĚļłļīŐńĺŏğİĮĎĸĖįęģĮĘĔĭōŋĲŚşŏłŝĽĶŕĥŠŮŀĭūīōŲŁŠĶŒŘįŉŷśŷůźŝŁŴōťŻŢřſœŶŽŦƊƁŢśţƀŮŵƓŚś", (byte)36, 65);
               ZKM_STR_B[8] = NLoginCore_553.E("ԏԯ\u0557ԚՎՖԧՒԝՔԹԾդ՟ԯզՓզԿՉՇլԳԴ", (byte)36, 69);
               ZKM_STR_B[9] = NLoginCore_223.C("ѷѻҝѷѝҌїҏєңѴўѼ҅ҕҟҟѡҙҜѺҗҦ҆ҦҍѭѫҤѯҌѯ", (byte)36, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.E("Ա՚ԭԗՒՉՑԞ՟գ՝ԝԢԠԺՇԺԩԾՠ՟Ԫէե\u0530հՑՎՍՒՌԵ", (byte)36, 69);
               ZKM_STR_B[1] = NLoginCore_091.A("ĝġŃĝăĲýĵúŉĜġŁĠĹĩŃĝŊČĵŎħĤįĵŒŚĭĥĘĺīĚĠĴŘţŦģŨıņĸĨŨŋŤĭĩŰŢįųĺĻ", (byte)36, 65);
               ZKM_STR_B[2] = NLoginCore_092.F("ԵԵՓՊԲԫ՚՟ՐԫաԾաԺզՠՂԪՓգխլԳԴ", (byte)36, 70);
               ZKM_STR_B[3] = NLoginCore_471.A("ĝġŃĝăĲýĵúŉĚĄĢīĻŅŅćĿłĠĶįłĳőĲĚŌįİŔŌıľŝĬįĳļİěķũŞũŮĨŦŌśļīĽĺĻ", (byte)36, 65);
               ZKM_STR_B[4] = NLoginCore_397.C("ѫ҇ҋѬѦѨѳѭҟѹ҂ѤѝғѵҒҚѝҫѻү҇Ѵѵ", (byte)36, 67);
               ZKM_STR_B[5] = NLoginCore_427.C("ѷѻҝѷѝҌїҏєңѵҥјҒґқҀѻҍҕ҉ѿѦѧҊҔѾҬҮѯѴѫѹҙ҄҈ѽ҈ҴҋғӂҺѷұҙҡ҂ҨҥӀҠӌҗҔҕ", (byte)36, 67);
               ZKM_STR_B[6] = NLoginCore_427.E("ԗԗԛԬԷԵՒ\u0558ԩՠԾԺԠՕեՆԹ՟ԣՃԭԶԳԴ", (byte)36, 69);
               ZKM_STR_B[7] = NLoginCore_433.F(
                  "ԶԺ՜ԶԜՋԖՎԓբԳՕ՛ՕՄթ՝ՓըԸՉՇԧՑԯՈԲԼՇԱԭՆզդՋճոը՛նՖՏծԾչևՙՆքՄզ\u058b՚չՏիձՈբ\u0590մ\u0590ֈ֓ն՚֍զվ֔ջղ֘լ֎\u058c֒֙՝ր֊ճը֙֫ի֯թս֫֒֓ծ֯ղք", (byte)36, 70
               );
               ZKM_STR_B[8] = NLoginCore_173.F("ԏԯ\u0557ԚՎՖԧՒԝՔԸՐՁԺԱՖե՟ՁԫլՆԳԴ", (byte)36, 70);
               ZKM_STR_B[9] = NLoginCore_397.F("ԶԺ՜ԶԜՋԖՎԓբԳԝԻՄՔ՞՞Ԡ\u0558՛ԹՉ՟ԢԩղԫմՌՁ\u0530ոաբկ\u0557ՙջսԺԷ՛ԾՈ", (byte)36, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_453.C("ѸғѶ҉іѽј҂ѺѴ҂ѢѴ҃ҀҢқҁѫҮ҈ѷѴѵ", (byte)36, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.B("ľýĢĳŀĻņĆēĦĺĵņĘĈĽŊńĻĪŀĭĚě", (byte)36, 66);
         }
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.Z;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().p();
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_190 var5 = NLoginCore_445.f.a(var2);
      NLoginCore_150.a(var2, NLoginCore_237.e, var1x -> {
         if (var1x.contains(a(m, n ^ o))) {
            var4.c(var1x, a(p & q, r));
         } else if (var1x.contains(a(s, t ^ u))) {
            var4.c(var1x, a(v, w ^ x));
         } else if (var1x.contains(a(y, z ^ aa))) {
            var4.c(var1x, a(ab, ac ^ ad));
         } else if (var1x.contains(a(ae, af))) {
            var4.c(var1x, a(ag, ah ^ ai));
         } else if (var1x.contains(a(aj, ak ^ al))) {
            var4.c(var1x, a(am & an, ao));
         } else {
            var4.a(var1x);
         }
      });
      var1.b((d != 0)).a(var4x -> {
         if (var2.R() && this.a(var3)) {
            NLoginCore_508 var10001 = NLoginCore_508.p;
            Object[] var10002 = new Object[k];
            var10002[l] = var5.ar();
            NLoginCore_150.a(var2, var10001, var10002);
         } else {
            var4x.Z();
         }
      }, e, f, TimeUnit.SECONDS);
      GUIButtonContainer[] var10000 = new GUIButtonContainer[g];
      var10000[h] = new GUIButtonContainer(NLoginCore_445.f, var5);
      return var10000;
   }

   @Override
   public int a(boolean var1) {
      return i;
   }

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      var1.b((a != 0)).a(() -> {
         if (var2.R() && this.a(var3)) {
            NLoginCore_150.a(var2, NLoginCore_194.ci);
            var2.a().a(() -> NLoginCore_150.a(var2, NLoginCore_194.cc), ap, TimeUnit.SECONDS);
            NLoginCore_150.a(var2, NLoginCore_508.n);
            var1.b((ar != 0)).a(() -> {
               if (var2.R() && this.a(var3)) {
                  NLoginCore_150.a(var2, NLoginCore_508.o);
               }
            }, as, TimeUnit.SECONDS);
         }
      }, b, TimeUnit.MILLISECONDS);
   }

   @Generated
   public NLoginCore_072(NLoginCore_211 var1) {
      this.Z = var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_072.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.E("ԯՑՓԳ\u0557նծքհԿսճցջՄթ\u058b֊ւֈւ\u0557", (byte)75, 69), NLoginCore_072.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_110.A("ŸƅƄŇƇƃžƇƒƁŎƌƐƉƌƒŔӜӡӢҼӍҿӝӣӶũ", (byte)75, 65) + var1 + NLoginCore_384.E("Ձ", (byte)75, 69) + var2.toString(), var4);
      }
   }

   @Override
   public boolean au() {
      return (j != 0);
   }

   static {
      b();
   }
}
