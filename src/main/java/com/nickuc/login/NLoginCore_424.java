package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_424 extends NLoginCore_045 {
   private static int d = Integer.reverse(-1);
   private static int am = 0 >>> 91 | 0 << -91;
   private final nLoginVelocity a;
   private static long ad = Long.reverse(6121332172690072843L);
   private static int q = Integer.reverse(-1073741824);
   private static int al = 0 >>> 58 | 0 << -58;
   private static long o = Long.reverse(6121332172690072843L);
   private static int t = Integer.reverse(0);
   private static int aj = 0 >>> 199 | 0 << -199;
   private static long r = Long.reverse(6121332172690072843L);
   private static long ah = Long.reverse(6121332172690072843L);
   private static int ak = Integer.reverse(0);
   private static long ab = Long.reverse(-2449958197289549824L);
   private static int u = (536870912 >>> 155 | 536870912 << ~155 + 1) & -1;
   private static long m = Long.reverse(-8434301822971370229L);
   private static long ai = Long.reverse(-2449958197289549824L);
   private static int x = Integer.reverse(-1610612736);
   private static int c = 0 >>> 92 | 0 << -92;
   private static long g = Long.reverse(-8434301822971370229L);
   private static long e;
   private static long v = Long.reverse(-8434301822971370229L);
   private static int w = Integer.reverse(0);
   private static int an = Integer.reverse(-1879048192);
   private final NLoginCore_132 a;
   private static long y = Long.reverse(-8434301822971370229L);
   private static String[] ZKM_STR_A = new String[an];
   private static long ae = Long.reverse(-2449958197289549824L);
   private static int ac = Integer.reverse(-536870912);
   private static long aa = Long.reverse(6121332172690072843L);
   private static int h = (4 >>> 162 | 4 << ~162 + 1) & -1;
   private static int n = 4096 >>> 107 | 4096 << -107;
   private static int ag = Integer.reverse(268435456);
   private static long p = Long.reverse(-2449958197289549824L);
   private static int l = Integer.reverse(-1);
   private static int af = Integer.reverse(0);
   private static long s = Long.reverse(-2449958197289549824L);
   private static int z = (12 >>> 1 | 12 << ~1 + 1) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_424.ao];
   private static int ao = Integer.reverse(-1879048192);

   @Override
   public NLoginInterface_030 a() {
      return new NLoginCore_058(this.a, this.a);
   }

   @Override
   public void b() {
      super.b();
      if (NLoginCore_329.n.ar() && this.a.a().getConfiguration().shouldPreventClientProxyConnections()) {
         String var1 = this.a.a().getVersion().getName();
         String var2 = a(c & d, g);
         if (NLoginCore_150.j()) {
            NLoginCore_370.c(a(h & l, m) + var2 + a(n, o ^ p) + var1 + a(q, r ^ s));
            NLoginCore_370.c(a(u, v));
         } else {
            NLoginCore_370.c(a(x, y) + var2 + a(z, aa ^ ab) + var1 + a(ac, ad ^ ae));
            NLoginCore_370.c(a(ag, ah ^ ai));
         }
      }
   }

   @Override
   public void f() {
      NLoginCore_390 var1 = this.a.a();
      var1.c(this.a.a());
      var1.c(this.a.b());
   }

   @Override
   public void e() {
      NLoginCore_390 var1 = this.a.a();
      var1.a(this.a.a(), this.a);
      var1.a(this.a.b(), this.a);
      this.a.a(new NLoginCore_266(this.a, this.a.a()), new NLoginInterface_013[ak]);
      this.a.a(new NLoginType_027(this.a, this.a.a()), new NLoginInterface_013[al]);
      this.a.a(new NLoginCore_470(this.a, this.a.a()), new NLoginInterface_013[am]);
   }

   public NLoginCore_424(nLoginVelocity var1) {
      super(var1);
      this.a = var1;
      this.a = new NLoginCore_132(var1);
   }

   private static void d() {
      e = -3412256736593391830L;
      long var0 = e ^ -2672350162532495038L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(33 + 36),
               (byte)(8 + 75),
               (byte)(12 + 35),
               (byte)(45 + 22),
               (byte)(43 + 23),
               (byte)(15 + 52),
               (byte)(10 + 37),
               (byte)(47 + 33),
               (byte)(31 + 44),
               (byte)(20 + 47),
               (byte)(10 + 73),
               (byte)(38 + 15),
               (byte)(5 + 75),
               (byte)(95 + 2),
               (byte)(39 + 61),
               (byte)(11 + 89),
               (byte)(69 + 36),
               110,
               (byte)(5 + 98)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.D("҇қҾҵҸѼҩҶӂ҂ұҘҽҼҥҢҷ҆ҠүҝҦүӃӂ҆ҎӐҿҤҳұґҽҩҗҙҚҶӠҴҠҲһҠҹӉҾӗӚҫҸӁҸҵҶ", (byte)47, 68);
               ZKM_STR_B[1] = NLoginCore_384.D("ҩҸһҨҔҔѾҝғѻҿҰӈҚңӂҕҧӂҥҤӎҕҖ", (byte)47, 68);
               ZKM_STR_B[2] = NLoginCore_110.F("ԼՀՏեեաԵիՇՋ՛ԿԫդճհՌաթԮԪբճՄիՓչ՜կՌբփ՛Ց՞ևպժիՈշՖզՓ", (byte)47, 70);
               ZKM_STR_B[3] = NLoginCore_141.A("İĸŎĐņŊśĮĕĬěĥ", (byte)47, 65);
               ZKM_STR_B[4] = NLoginCore_241.C(
                  "ѺҔ҅ҸҸѻѸһґҺ҂ҿҢӀұңӇҬҍӊӉұҾҩӑӒӋҖұҴҖҸҬҰҲҲұҵӠҫҝӍӢӂӗҼӇӝҢҷһӆҼӃӫӞҲӯӑӗӬӪӁӌӧӏӾӇӳҲӒԁҹӕӅӞӀӹӽԋӗӶԋӚӘӯԋӜԇӑӬԅӱӭӖԗәӺӵӬԊԉәӶӺԥӽӵӣԠԔԘԝԭԬӭԙӻӯԟԆԬԋԡөԘӵԚԈԛԗԌӷԛԶԟԤԙԔԿԆԛԃԩԝՄԋՊԭԾՍԝԳՕԏՄՇԳԷՉ",
                  (byte)47,
                  67
               );
               ZKM_STR_B[5] = NLoginCore_141.A("ŉıĶōĦĖĽřŘđŁŝōěĢļŐğļśŋũİı", (byte)47, 65);
               ZKM_STR_B[6] = NLoginCore_384.C("ҷҚҏҟҶҕҎ҂ѵҖҴһұѺңӉҞһӀӆҢүҬӊҤӂ҇ҏҥӃҘҵ", (byte)47, 67);
               ZKM_STR_B[7] = NLoginCore_384.D("Һ҅ѻѰ҉ҳқҺҜҕѻңҟ҃Ҷӈ҉ӋҕӎҧӎҕҖ", (byte)47, 68);
               ZKM_STR_B[8] = NLoginCore_141.F(
                  "ԻՁԹԿԺՒՈԹԤԶԺլձըաԲՉՄՊԿկԸԬՉՕՈԹՑըբլԹգտՂ՞ջև՚փֆխ։֎ջ֑֎ե֏ֆ՟հօՓ։։ձէղՑցշմկվդնղ֤ազճ\u058bշը֬կ\u0590թִ֨ֆխշ֣ֆֻ֓֊ּ֟սֶր֮յ֛֭֚֒֟֗֘ֆֺ֞֡օֻ֥גה֪֪\u05ceֲֶ֮֫ל֬\u05ccטֳ֖֜\u05cfֽ",
                  (byte)47,
                  70
               );
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.A("ĢĶřŐœėńőŝĝŌĳŘŗŀĽŒġĻŊĸŁŊŞŝġĩūŚĿŎŌĬŘńĲĴĵőŻŏĻŌŮŰŵťŎſŚŴŦƃţŐő", (byte)47, 65);
               ZKM_STR_B[1] = NLoginCore_183.F("ՒադՑԽԽԧՆԼԤթ՟ԾՈԬՒՕհՇ\u0558ՐՁԾԿ", (byte)47, 70);
               ZKM_STR_B[2] = NLoginCore_183.D("ғҗҦҼҼҸҌӂҞҢҲҖ҂һӊӇңҸӀ҅ҁҹӊқӂҪӐҳӆңҹӚҸӔҗӚґӊҝҲӃҢӕӀҡӥҧҵӄӡӊӁӢӮҵҶ", (byte)47, 68);
               ZKM_STR_B[3] = NLoginCore_138.C("҅ҴѽѷѾҠҹҞҌҶҥҊ", (byte)47, 67);
               ZKM_STR_B[4] = NLoginCore_027.B(
                  "ĕįĠœœĖēŖĬŕĝŚĽśŌľŢŇĨťŤŌřńŬŭŦıŌŏıœŇŋōōŌŐŻņĸŨŽŝŲŗŢŸĽŒŖšŗŞƆŹōƊŬŲƇƅŜŧƂŪƙŢƎōŭƜŔŰŠŹśƔƘƦŲƑƦŵųƊƦŷƢŬƇƠƌƈűƲŴƕƐƇƥƤŴƑƕǀƘƐžƻƯƳƸǈǇƈƴƖƊƺơǇƦƼƄƳƐƵƣƶƲƧƒƶǑƺƿƴƯǚơƶƞǄƸǟƦǥǈǣƩǀǞƨǭƿǏǪǟƴ",
                  (byte)47,
                  66
               );
               ZKM_STR_B[5] = NLoginCore_575.A("ŉıĶōĦĖĽřŘđňğĘĲğłĞĲŜŖĻŃİı", (byte)47, 65);
               ZKM_STR_B[6] = NLoginCore_241.B("ŒĵĪĺőİĩĝĐıŏŖŌĕľŤĹŖśšĽŇņōĶľŭŲŁńŨů", (byte)47, 66);
               ZKM_STR_B[7] = NLoginCore_521.B("ŕĠĖċĤŎĶŕķİĖķĞģŘĺņĻņĨĨŘĸũŧŗĨľŚłŤĵ", (byte)47, 66);
               ZKM_STR_B[8] = NLoginCore_575.D(
                  "ҒҘҐҖґҩҟҐѻҍґӃӈҿҸ҉ҠқҡҖӆҏ҃ҠҬҟҐҨҿҹӃҐҺӖҙҵӒӞұӚӝӄӠӥӒӨӥҼӦӝҶӇӜҪӠӠӈҾӉҨӘӎӋӆӕһӍӉӻҸҽӊӢӎҿԃӆӧӀӿԋӝӄӎӺӝԒӪӡԓӶӔԍӗԅӌԄӱөӶӲӮӯӝӵӸԑӜӼԒԩԫԁԁԥԍԂӺԥԨԧԞԖӨԱԯԥӶԮӼԴԮԕԬӷԷՂӾՃԊ",
                  (byte)47,
                  68
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.B("ĩĖŐŇĦŐĮŞĖŚĺĜĲģŢĝĸįĦĠşĽĨťĩŝŞŁľľōŖ", (byte)47, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_141.F("Թ՞ՙբաԟթԵՙԥՆԧԯԩԼՋԴԱՆՅԶԱՔղձ՞լՋԼԷմԺ", (byte)47, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 123L;
      var1 ^= -2672350162532495038L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(2 + 66),
                     (byte)(9 + 60),
                     (byte)(13 + 70),
                     (byte)(34 + 13),
                     (byte)(36 + 31),
                     66,
                     (byte)(21 + 46),
                     (byte)(14 + 33),
                     (byte)(43 + 37),
                     (byte)(26 + 49),
                     (byte)(18 + 49),
                     (byte)(4 + 79),
                     (byte)(52 + 1),
                     (byte)(29 + 51),
                     (byte)(64 + 33),
                     (byte)(63 + 37),
                     100,
                     (byte)(63 + 42),
                     (byte)(94 + 16),
                     (byte)(86 + 17)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.C("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠩࠞࠟࠧࠏ࠶࠷࠷", (byte)54, 67));
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
      d();
   }

   private static Object e(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_424.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.E("Ը՚՜Լՠտշ֍չՈֆռ֊քՍղ֔֓\u058b֑\u058bՠ", (byte)84, 69), NLoginCore_424.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.E("ճրտՂւվչւ֍ռՉև\u058bքև֍Տ\u08e2ࣗࣘ࣠ࣈࣰࣰ࣯գ", (byte)84, 69) + var1 + NLoginCore_183.C("ӫ", (byte)84, 67) + var2.toString(), var4
         );
      }
   }

   @Override
   public nLoginAPI a() {
      return new NLoginType_013(this.a.a());
   }

   public NLoginCore_240 a() {
      return new NLoginCore_240(this.a.a());
   }
}
