package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_034 extends HikariConnectionPool {
   private static int y = Integer.reverse(1610612736);
   private static int ct = ('저' >>> 139 | 51200 << ~139 + 1) & -1;
   private static int da = (-1 >>> 165 | -1 << -165) & -1;
   private static long cd = Long.reverse(-8861683369904665318L);
   private static long w = Long.reverse(-8861683369904665318L);
   private static long k = Long.reverse(-2520615094567006950L);
   private static int bq = (15360 >>> 202 | 15360 << ~202 + 1) & -1;
   private static long bp = Long.reverse(6341068275337658368L);
   private static String[] c = new String[NLoginCore_034.dc];
   private static long br = Long.reverse(-8861683369904665318L);
   private static long cj = Long.reverse(-8861683369904665318L);
   private static long bd = Long.reverse(6341068275337658368L);
   private static int cr = (48 >>> 193 | 48 << ~193 + 1) & -1;
   private static long ch = Long.reverse(6341068275337658368L);
   private static long by = Long.reverse(6341068275337658368L);
   private static int co = Integer.reverse(-402653184);
   private static int d = Integer.reverse(0);
   private static long cp = Long.reverse(-8861683369904665318L);
   private static int bt = (64 >>> 2 | 64 << -2) & -1;
   private static long aw = Long.reverse(6341068275337658368L);
   private static long cq = Long.reverse(6341068275337658368L);
   private static int bn = (-536870912 >>> 60 | -536870912 << ~60 + 1) & -1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long t = Long.reverse(-2520615094567006950L);
   private static long bi = Long.reverse(-2520615094567006950L);
   private static int ai = Integer.reverse(268435456);
   private static long cs = Long.reverse(-2520615094567006950L);
   private static long ck = Long.reverse(6341068275337658368L);
   private static long r = Long.reverse(6341068275337658368L);
   private static int ax = Integer.reverse(-805306368);
   private static long cx = Long.reverse(-8861683369904665318L);
   private static int bw = Integer.reverse(-2013265920);
   private static long at = Long.reverse(-8861683369904665318L);
   private static long n = Long.reverse(-2520615094567006950L);
   private static long cn = Long.reverse(6341068275337658368L);
   private static long cm = Long.reverse(-8861683369904665318L);
   private static int bg = 196608 >>> 78 | 196608 << -78;
   private static long ag = Long.reverse(6341068275337658368L);
   private static long cy = Long.reverse(6341068275337658368L);
   private static long bx = Long.reverse(-8861683369904665318L);
   private static long q = Long.reverse(-8861683369904665318L);
   private static long aa = Long.reverse(-2520615094567006950L);
   private static long bo = Long.reverse(-8861683369904665318L);
   private static long ao = Long.reverse(-8861683369904665318L);
   private static long bu = Long.reverse(-8861683369904665318L);
   private static long bv = Long.reverse(6341068275337658368L);
   private static int dc = 917504 >>> 79 | 917504 << -79;
   private static long cb = Long.reverse(-2520615094567006950L);
   private static int ca = (-1 >>> 253 | -1 << ~253 + 1) & -1;
   private static long bs = Long.reverse(6341068275337658368L);
   private static long az = Long.reverse(-8861683369904665318L);
   private static int cw = (832 >>> 133 | 832 << -133) & -1;
   private static long bl = Long.reverse(-8861683369904665318L);
   private static int cz = (-1342177279 >>> 92 | -1342177279 << -92) & -1;
   private static int o = (12582912 >>> 182 | 12582912 << -182) & -1;
   private static int bj = (1703936 >>> 241 | 1703936 << -241) & -1;
   private static long x = Long.reverse(6341068275337658368L);
   private static String[] d = new String[NLoginCore_034.dd];
   private static int bz = (294912 >>> 142 | 294912 << -142) & -1;
   private static int dd = (229376 >>> 13 | 229376 << -13) & -1;
   private static int ci = Integer.reverse(-1476395008);
   private static long aj = Long.reverse(-8861683369904665318L);
   private static long al = Long.reverse(6341068275337658368L);
   private static long ae = Long.reverse(-8861683369904665318L);
   private static long cg = Long.reverse(-8861683369904665318L);
   private static int am = Integer.reverse(-1879048192);
   private static long h = Long.reverse(-2520615094567006950L);
   private static long bm = Long.reverse(6341068275337658368L);
   private static int u = Integer.reverse(-1610612736);
   private static long cu = Long.reverse(-8861683369904665318L);
   private static int l = Integer.reverse(1073741824);
   private static int as = -1610612736 >>> 92 | -1610612736 << -92;
   private static int cl = 720896 >>> 15 | 720896 << -15;
   private static long aq = Long.reverse(6341068275337658368L);
   private static long ce = Long.reverse(6341068275337658368L);
   private static int ac = 7168 >>> 202 | 7168 << -202;
   private static long f;
   private static int cf = 1280 >>> 134 | 1280 << -134;
   private static int s = 32 >>> 3 | 32 << -3;
   private static int cc = 1216 >>> 102 | 1216 << ~102 + 1;
   private static int j = Integer.reverse(-1);
   private static long cv = Long.reverse(6341068275337658368L);
   private static long db = Long.reverse(-2520615094567006950L);

   public static NLoginCore_034 a(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return a(var0, var1, null);
   }

   static {
      b();
   }

   public static NLoginCore_034 b(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return new NLoginCore_034(var0, var1, null, NLoginCore_536.b);
   }

   private NLoginCore_034(NLoginInterface_011<?> var1, NLoginCore_147 var2, Consumer<HikariConfig> var3, NLoginCore_536 var4) {
      super(NLoginCore_036.d, var1, var2, var3, var4);
   }

   @Override
   protected String w() {
      return a(d, h);
   }

   private static String a(int var0, long var1) {
      var1 ^= 26L;
      var1 ^= -2884184879764953119L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(52 + 16),
                     (byte)(33 + 36),
                     (byte)(53 + 30),
                     (byte)(32 + 15),
                     (byte)(2 + 65),
                     (byte)(2 + 64),
                     (byte)(30 + 37),
                     (byte)(36 + 11),
                     80,
                     (byte)(41 + 34),
                     (byte)(48 + 19),
                     (byte)(74 + 9),
                     53,
                     (byte)(50 + 30),
                     (byte)(50 + 47),
                     (byte)(80 + 20),
                     (byte)(36 + 64),
                     (byte)(14 + 91),
                     (byte)(55 + 55),
                     (byte)(28 + 75)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.D("йцхЈшфпшѓтЏэёъэѓЕީޡޜޫޯޕިޟޢްޣ\u07b3", (byte)11, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   public static NLoginCore_034 a(NLoginInterface_011<?> var0, NLoginCore_147 var1, Consumer<HikariConfig> var2) {
      return new NLoginCore_034(var0, var1, var2, NLoginCore_536.a);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_034.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ\u0530ՕշնծմծՃ", (byte)55, 70), NLoginCore_034.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬӀҸҳӂӆҬҿҶҹӇҺӊń", (byte)55, 65) + var1 + NLoginCore_183.E("ԭ", (byte)55, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void a(HikariConfig var1, NLoginCore_147 var2) {
      var1.setDriverClassName(this.w());
      var1.setJdbcUrl(this.a(var2));
      var1.setUsername(var2.z());
      var1.setPassword(var2.j());
   }

   private static void b() {
      f = 6390919053289922721L;
      long var0 = f ^ -2884184879764953119L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(58 + 11),
               (byte)(59 + 24),
               (byte)(11 + 36),
               (byte)(19 + 48),
               (byte)(61 + 5),
               (byte)(35 + 32),
               (byte)(23 + 24),
               (byte)(53 + 27),
               (byte)(54 + 21),
               (byte)(31 + 36),
               (byte)(78 + 5),
               (byte)(17 + 36),
               (byte)(21 + 59),
               (byte)(38 + 59),
               (byte)(56 + 44),
               (byte)(96 + 4),
               (byte)(93 + 12),
               110,
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_575.B("ĤęēŃĉłňğĊčĻŅěŀİĽįŖīĖŃħēĵĻŜĠĚŠŢŘĠğšŤĥńĩĿŉŘĸşĽšĪŠŴŕœŉűķŬŪűķĶŷŵŔłšƂ", (byte)39, 66);
               d[1] = NLoginCore_559.E("ՄՈ՛ՊԲՌԝԟՖգԘՅՒԵբըՆժՇԿՄՉԶԷ", (byte)39, 69);
               d[2] = NLoginCore_232.A("ĮİėĹĕĴĵģġŇĨĕ", (byte)39, 65);
               d[3] = NLoginCore_387.D("ќҢѼғҡѳҙѹ҃ѸѬѲ", (byte)39, 68);
               d[4] = NLoginCore_183.E("՜ԛԽԳՙԡՐԵԝՙԯՇՂՄՅ՛ՃԾԻդթ՟ԶԷ", (byte)39, 69);
               d[5] = NLoginCore_092.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
               d[6] = NLoginCore_521.D("ѽѴҤҒҏ҅ѹҖҫѧѫҥҩҠңұѳҪұҗ҈ҹҫҲҒѸҐѰҫҏѾҵ", (byte)39, 68);
               d[7] = NLoginCore_384.B("ĒĤłĲĜėğĕċŇĤĕ", (byte)39, 66);
               d[8] = NLoginCore_384.D("ѽѴҤҒҏ҅ѹҖҫѧѪҡѽѰ҂ѪҤҴ҆ғҌ҅ҏѵҺһҙҮғҘҀҙ", (byte)39, 68);
               d[9] = NLoginCore_076.B("ĕĳİćĲīĸĜľŉłĕ", (byte)39, 66);
               d[10] = NLoginCore_451.B("ĴěľĵćĶĚėĥňċŐĐďŎĝōĥķŕĢņĪĽėŀėĺŚśōĴ", (byte)39, 66);
               d[11] = NLoginCore_092.C("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 67);
               d[12] = NLoginCore_091.E("՜ԶՊՌաՠԢԴԿՔՖաԦ\u0557ՅԨազզ՚դ՜ժէ՜էՃխՔծԹդ", (byte)39, 69);
               d[13] = NLoginCore_004.E("ՓՕՏԳԪ՚ԲՠբՔԥԫ", (byte)39, 69);
               d[14] = NLoginCore_453.D("ѵѿҔѷ҆ѤҁѴҞҗҕҠҁҏҪҋҲҕ҅ҕҪҀҡұҲҵҫҲҽҮҝҬҶҞҶѽӃ҄҄Ӊҕ҇ҷҒ", (byte)39, 68);
               d[15] = NLoginCore_004.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
               d[16] = NLoginCore_530.C("ҘҡѱѲѼ҆ҔѪѝҗѷҪҜҟҙҭқѦүҠҶҁҌҤѸҵҝҏҶҠҐҕ", (byte)39, 67);
               d[17] = NLoginCore_446.D("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 68);
               d[18] = NLoginCore_387.C("ќғҙ҂Ҟ҄ҁќқѷѼ҃ѬҨ҂Ґ҆ҧҀҬҐҭҨҗҎҹҨѷҿҷҢ҂Ғ҄ҢҎѾқҩҔҽҥӋҒ", (byte)39, 67);
               d[19] = NLoginCore_427.B("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 66);
               d[20] = NLoginCore_575.B("ŀġĕŇŅĴĞĺįįĻħĲĥıŖĐŐĬŎŃŅēŐŗĞĳĞĸřĲő", (byte)39, 66);
               d[21] = NLoginCore_201.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
               d[22] = NLoginCore_004.F("ԸԕՉՌՕԙԚԸԠգ՟ՆԴԸՀԪՄ՞ՃհԾԹ՚հԱՂՆՎԴաձը", (byte)39, 70);
               d[23] = NLoginCore_110.B("ĽĒęğĹĤėŉĖňľĕ", (byte)39, 66);
               d[24] = NLoginCore_092.B("ĵĸěŁĝĕČĕĤłįŉĄőŃĮġĤńŐĶŋŚĳŒħķĴŗĳĞģ", (byte)39, 66);
               d[25] = NLoginCore_241.C("ҚѯѶѼҖҁѴҦѳҥқѲ", (byte)39, 67);
               d[26] = NLoginCore_324.F("ԴՅԵԖՎ՟ՓԺ\u0558Ը՜\u0530՟ԴՅԴ\u0557ՙ\u0558ՄՍԽՀ\u0530բնՊնկ\u0530Քն", (byte)39, 70);
               d[27] = NLoginCore_427.D("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 68);
               break;
            case 1:
               d[0] = NLoginCore_433.B("ĤęēŃĉłňğĊčĻŅěŀİĽįŖīĖŃħēĵĻŜĠĚŠŢŘĠğšŤĥńĩĿŉŘĸşĽšĪŠŴŕœŉűķŰĵŶļľĹŎŎřŌž", (byte)39, 66);
               d[1] = NLoginCore_138.D("ҋҏҢґѹғѤѦҝҪѣҧѿҐ҅҄ҪҵѵҳѿҶѽѾ", (byte)39, 68);
               d[2] = NLoginCore_530.C("њѵҕѝўҙ҃ҕ҉ѽқѲ", (byte)39, 67);
               d[3] = NLoginCore_027.A("ĹĀŃĶĹĨęĿğďľĕ", (byte)39, 65);
               d[4] = NLoginCore_530.F("՜ԛԽԳՙԡՐԵԝՙԯՃԼբՀ՟ԾԨԧԪՄՠծ\u0530Խ՞ծՅՓն\u0558Ե", (byte)39, 70);
               d[5] = NLoginCore_451.F("ՄԭԻԾԠԭԾԞԠԾՠԫ", (byte)39, 70);
               d[6] = NLoginCore_241.A("ĠėŇĵĲĨĜĹŎĊĎňŌŃņŔĖōŔĺīđĭĸœŠİőĿįġń", (byte)39, 65);
               d[7] = NLoginCore_223.A("ĹąĀĠĶĵĹĮĪńĤĕ", (byte)39, 65);
               d[8] = NLoginCore_387.E("Զԭ՝ՋՈԾԲՏդԠԣ՚ԶԩԻԣ՝խԿՌՅՄԿՒգՇԬՖեՕղԲ՛շ\u0557ԱՖՎԹՏՒտզՋ", (byte)39, 69);
               d[9] = NLoginCore_076.D("ѭҥѳңҢѦѵѽғҖѽѲ", (byte)39, 68);
               d[10] = NLoginCore_446.E("ՊԱՔՋԝՌ\u0530ԭԻ՞ԡզԦԥդԳգԻՍիԸ՚ԱՎխԿԵէԶծՂՆ", (byte)39, 69);
               d[11] = NLoginCore_471.D("ҎўѡѱґѰҗѸҫѿҭҝҘҎңѯҐґҀҬҰҶѽѾ", (byte)39, 68);
               d[12] = NLoginCore_324.B("ņĠĴĶŋŊČĞĩľŀŋĐŁįĒŋŐŐńŎĳīňőőŌœĜĢŗĥ", (byte)39, 66);
               d[13] = NLoginCore_559.A("ĐķĵŊĜĩĸĉĆĤćĕ", (byte)39, 65);
               d[14] = NLoginCore_201.E("ԮԸՍ\u0530ԿԝԺԭ\u0557ՐՎՙԺՈգՄիՎԾՎգԹ՚ժիծդինէՖեՊՅղձՒպգ՞ՕպՁՋ", (byte)39, 69);
               d[15] = NLoginCore_471.A("ĂđĘĄŃĺĻćłīŊĕ", (byte)39, 65);
               d[16] = NLoginCore_138.F("Ց՚ԪԫԵԿՍԣԖՐ\u0530գՕ\u0558ՒզՔԟըՙկԺդԱէհՓ\u0530ոԶԵՙհՙՓշՕԿաՏՀսոՋ", (byte)39, 70);
               d[17] = NLoginCore_384.F("ԛԽՉԴՈԫՃՎԮԠԱՙԥՄՒՅԫէՖիԻկԶԷ", (byte)39, 70);
               d[18] = NLoginCore_384.D("ќғҙ҂Ҟ҄ҁќқѷѼ҃ѬҨ҂Ґ҆ҧҀҬҐҭҨҗҎҹҨѷҿҷҢ҂ҋҤѻҔ҄ҁґқѽҺӃҒ", (byte)39, 68);
               d[19] = NLoginCore_183.D("ћҀѣҏѡҐѹҧҋ҃ҧѲ", (byte)39, 68);
               d[20] = NLoginCore_027.A("ŀġĕŇŅĴĞĺįįĻħĲĥıŖĐŐĬŎŃĸŊĥĨīĬŕĵĝĶĴ", (byte)39, 65);
               d[21] = NLoginCore_076.A("ĔėŅĂĆĶěľĮĥĤĕ", (byte)39, 65);
               d[22] = NLoginCore_451.A("ĢÿĳĶĿăĄĢĊōŉİĞĢĪĔĮňĭŚĨİŘŒĖŇĞĘŢĚŐŒ", (byte)39, 65);
               d[23] = NLoginCore_027.A("ėąĴćğĝĠŁĊĝľĕ", (byte)39, 65);
               d[24] = NLoginCore_471.C("ҒҕѸҞѺѲѩѲҁҟҌҦѡҮҠҋѾҁҡҭғҩґѸҳ҈ұҬѵҒүҾҵҿѻҀң҂ҿҟӀӂҌҒ", (byte)39, 67);
               d[25] = NLoginCore_451.D("ҎҍҒ҄Ҡѷѧ҉ѸѬҫѲ", (byte)39, 68);
               d[26] = NLoginCore_427.E("ԴՅԵԖՎ՟ՓԺ\u0558Ը՜\u0530՟ԴՅԴ\u0557ՙ\u0558ՄՍՆԨ՞ՠյԴԳՏնեն", (byte)39, 69);
               d[27] = NLoginCore_201.C("җѷѝҕҔҚѸ҅҆ѤқѲ", (byte)39, 67);
               break;
            case 2:
               d[0] = NLoginCore_127.D("ҤњҖ҃ҧҚҠҗҜѴҝ҃ҙѰҝҰҔҰҁҭҎҦѽѾ", (byte)39, 68);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_471.C("ѺқҒѺѿѸѳңҤҦѼҞѾҭҡҮҁҧҳѿҗҫѵҙҫҦҷҞҖҏѹҠ", (byte)39, 67);
         }
      }
   }

   @Override
   protected String a(NLoginCore_147 var1) {
      return a(i & j, k) + var1.x() + a(l, n) + var1.j() + a(o, q ^ r) + var1.y();
   }

   @Override
   protected void a(Properties var1, boolean var2) {
      super.a(var1, var2);
      if (var2) {
         var1.putIfAbsent(a(s, t), a(u, w ^ x));
         var1.putIfAbsent(a(y, aa), a(ac, ae ^ ag));
         var1.putIfAbsent(a(ai, aj ^ al), a(am, ao ^ aq));
         var1.putIfAbsent(a(as, at ^ aw), a(ax, az ^ bd));
         var1.putIfAbsent(a(bg, bi), a(bj, bl ^ bm));
         var1.putIfAbsent(a(bn, bo ^ bp), a(bq, br ^ bs));
         var1.putIfAbsent(a(bt, bu ^ bv), a(bw, bx ^ by));
         var1.putIfAbsent(a(bz & ca, cb), a(cc, cd ^ ce));
         var1.putIfAbsent(a(cf, cg ^ ch), a(ci, cj ^ ck));
         var1.putIfAbsent(a(cl, cm ^ cn), a(co, cp ^ cq));
         var1.putIfAbsent(a(cr, cs), a(ct, cu ^ cv));
         var1.putIfAbsent(a(cw, cx ^ cy), a(cz & da, db));
      }
   }
}
