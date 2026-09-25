package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_066 extends NLoginCore_098 {
   private static long ef = Long.reverse(-3602879701896396800L);
   private static long be = Long.reverse(-8992657002499826121L);
   private static long p = Long.reverse(5562976993161616951L);
   private static long by = Long.reverse(5562976993161616951L);
   private static long ee = Long.reverse(-8992657002499826121L);
   private static int ec = Integer.reverse(671088640);
   private static long ck = Long.reverse(-3602879701896396800L);
   private static int m = -1 >>> 22 | -1 << ~22 + 1;
   private static long cx = Long.reverse(-3602879701896396800L);
   private static int fp = Integer.reverse(-671088640);
   private static int fh = (1677721600 >>> 90 | 1677721600 << -90) & -1;
   private static int fv = Integer.reverse(939524096);
   private static int dl = Integer.reverse(-1);
   private static int dq = Integer.reverse(-2013265920);
   private static long fq = Long.reverse(-8992657002499826121L);
   private static long gi = Long.reverse(5562976993161616951L);
   private static long eo = Long.reverse(5562976993161616951L);
   private static long gb = Long.reverse(-3602879701896396800L);
   private static long cn = Long.reverse(-8992657002499826121L);
   private static long dm = Long.reverse(5562976993161616951L);
   private static long ge = Long.reverse(-8992657002499826121L);
   private static long fn = Long.reverse(-8992657002499826121L);
   private static long ci = Long.reverse(-8992657002499826121L);
   private static long bk = Long.reverse(-8992657002499826121L);
   private static int eu = Integer.reverse(536870912);
   private static int dd = (109051904 >>> 247 | 109051904 << -247) & -1;
   private static int ey = Integer.reverse(-402653184);
   private static int bz = 64 >>> 69 | 64 << ~69 + 1;
   private static long at = Long.reverse(5562976993161616951L);
   private static int bn = 0 >>> 94 | 0 << -94;
   private static int cm = 9216 >>> 202 | 9216 << ~202 + 1;
   private static int ea = (-1 >>> 214 | -1 << -214) & -1;
   private static int eq = Integer.reverse(1744830464);
   private static long cp = Long.reverse(-3602879701896396800L);
   private static int bi = (-1 >>> 203 | -1 << ~203 + 1) & -1;
   private static long dy = Long.reverse(5562976993161616951L);
   private static int ek = Integer.reverse(-1476395008);
   private static int ex = Integer.reverse(Integer.MIN_VALUE);
   private static long bh = Long.reverse(-3602879701896396800L);
   private static long ga = Long.reverse(-8992657002499826121L);
   private static long bm = Long.reverse(-3602879701896396800L);
   private static int em = Integer.reverse(-1);
   private static long br = Long.reverse(5562976993161616951L);
   private static long ds = Long.reverse(-8992657002499826121L);
   private static int bd = Integer.reverse(-1073741824);
   private static int bp = 81920 >>> 238 | 81920 << -238;
   private static long dg = Long.reverse(-3602879701896396800L);
   private static int gm = Integer.reverse(67108864);
   private static long di = Long.reverse(-8992657002499826121L);
   private static long fo = Long.reverse(-3602879701896396800L);
   private static int cg = Integer.reverse(268435456);
   private static long fx = Long.reverse(5562976993161616951L);
   private static int cb = Integer.reverse(-536870912);
   private static int cy = Integer.reverse(805306368);
   private static int dz = Integer.reverse(-939524096);
   private static int dk = (7680 >>> 9 | 7680 << -9) & -1;
   private static long et = Long.reverse(-3602879701896396800L);
   private static String[] ZKM_STR_B = new String[gm];
   private static long dv = Long.reverse(-3602879701896396800L);
   private static int fz = Integer.reverse(-1207959552);
   private static int bj = 16384 >>> 108 | 16384 << -108;
   private static long ct = Long.reverse(5562976993161616951L);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int al = 134217728 >>> 250 | 134217728 << -250;
   private static long df = Long.reverse(-8992657002499826121L);
   private static int var_do = -1 >>> 210 | -1 << ~210 + 1;
   private static int fl = Integer.reverse(1476395008);
   private static int dx = -1 >>> 198 | -1 << -198;
   private static int gj = (33554432 >>> 20 | 33554432 << -20) & -1;
   private static long dc = Long.reverse(5562976993161616951L);
   private static long ab = Long.reverse(-8992657002499826121L);
   private static long o;
   private static int bw = Integer.reverse(1610612736);
   private static int dn = 131072 >>> 205 | 131072 << -205;
   private static long ac = Long.reverse(-3602879701896396800L);
   private static long fi = Long.reverse(5562976993161616951L);
   private static long dj = Long.reverse(-3602879701896396800L);
   private static int dw = Integer.reverse(1207959552);
   private static long dp = Long.reverse(5562976993161616951L);
   private static String[] ZKM_STR_A = new String[gj];
   private static long es = Long.reverse(-8992657002499826121L);
   private static int ao = -1 >>> 75 | -1 << ~75 + 1;
   private static int da = -1 >>> 234 | -1 << -234;
   private static int fw = Integer.reverse(-1);
   private static int gc = Integer.reverse(2013265920);
   private static long gf = Long.reverse(-3602879701896396800L);
   private static long cf = Long.reverse(-3602879701896396800L);
   private static long cw = Long.reverse(-8992657002499826121L);
   private static int cv = (2816 >>> 200 | 2816 << ~200 + 1) & -1;
   private static long eb = Long.reverse(5562976993161616951L);
   private static long ft = Long.reverse(-3602879701896396800L);
   private static int cr = Integer.reverse(1342177280);
   private static int gg = Integer.reverse(-134217728);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int bq = (-1 >>> 24 | -1 << -24) & -1;
   private static int fa = -1 >>> 3 | -1 << ~3 + 1;
   private static long cd = Long.reverse(-8992657002499826121L);
   private static int fd = Integer.reverse(402653184);
   private static int e = (0 >>> 37 | 0 << -37) & -1;
   private static long fc = Long.reverse(5562976993161616951L);
   private static int dh = (28672 >>> 11 | 28672 << ~11 + 1) & -1;
   private static long ff = Long.reverse(5562976993161616951L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_066.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.B("ÛýÿßăĢĚİĜëĩğĭħðĕķĶĮĴĮă", (byte)26, 66), NLoginCore_066.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.D("ѦѳѲеѵѱѬѵҀѯмѺѾѷѺҀт߉\u07bb߉ߙߑ\u07b4ߎߌߏї", (byte)26, 68) + var1 + NLoginCore_027.D("н", (byte)26, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 115L;
      var1 ^= 5975045692475787905L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(65 + 3),
                     (byte)(23 + 46),
                     (byte)(78 + 5),
                     (byte)(39 + 8),
                     (byte)(17 + 50),
                     (byte)(29 + 37),
                     (byte)(12 + 55),
                     (byte)(39 + 8),
                     (byte)(69 + 11),
                     (byte)(31 + 44),
                     (byte)(33 + 34),
                     (byte)(47 + 36),
                     53,
                     (byte)(19 + 61),
                     (byte)(16 + 81),
                     (byte)(92 + 8),
                     (byte)(23 + 77),
                     105,
                     (byte)(85 + 25),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մ࣭ࣻࣻऋःࣦऀࣾँ", (byte)121, 69));
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

   public NLoginCore_066(NLoginType_008 var1) {
      super(var1, NLoginCore_479.t, a(e & m, p), a(y, ab ^ ac));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(dk & dl, dm));
      UUID var2 = NLoginCore_432.c(var1.getString(a(dn & var_do, dp)));
      String var3 = var1.getString(a(dq, ds ^ dv));
      String var4 = var1.getString(a(dw & dx, dy));
      String var5 = var1.getString(a(dz & ea, eb));
      boolean var6 = a(ec, ee ^ ef).equals(var1.getString(a(ek & em, eo)));
      if (var3 != null) {
         String[] var7 = var3.split(a(eq, es ^ et));
         if (var7.length == eu) {
            String var8 = var7[ex].toUpperCase(Locale.ENGLISH);
            if (!a(ey & fa, fc).equalsIgnoreCase(var8)) {
               this.e(this.r, var3, var8);
               return;
            }
         } else {
            String var11 = var4 != null ? a(fd, ff) + var4 : a(fh, fi);
            switch (var3.length()) {
               case 32:
                  var3 = a(fl, fn ^ fo) + var3 + var11;
                  break;
               case 64:
                  var3 = a(fp, fq ^ ft) + var3 + var11;
                  break;
               case 128:
                  var3 = a(fv & fw, fx) + var3 + var11;
            }
         }
      }

      Long var10 = var1.getLong(a(fz, ga ^ gb));
      Long var12 = var1.getLong(a(gc, ge ^ gf));
      String var9 = var1.getString(a(gg, gi));
      this.a(this.r, var3, var5, var2, var4x -> {
         if (var9 != null) {
            var4x.a().b(var9);
         }

         if (var6) {
            var4x.z();
         }

         var4x.a(var10, var12);
      });
   }

   private static void b() {
      o = -1406942983381201727L;
      long var0 = o ^ 5975045692475787905L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(60 + 9),
               (byte)(32 + 51),
               (byte)(39 + 8),
               (byte)(4 + 63),
               66,
               (byte)(59 + 8),
               (byte)(3 + 44),
               (byte)(19 + 61),
               (byte)(62 + 13),
               (byte)(24 + 43),
               (byte)(15 + 68),
               (byte)(6 + 47),
               (byte)(79 + 1),
               97,
               (byte)(55 + 45),
               (byte)(17 + 83),
               (byte)(39 + 66),
               (byte)(23 + 87),
               (byte)(62 + 41)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(45 + 38)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_575.B("ČĲĄăęĳ÷İĨöĠĹĕāĥęŇħđĂĂĘīķĽĠİĻħċīĞ", (byte)31, 66);
               ZKM_STR_B[1] = NLoginCore_141.E("ԭԭԥԶԠԹՉՉԶԘԛԾՑԷԔԶՕՠ\u0558ՠԠէԮԯ", (byte)31, 69);
               ZKM_STR_B[2] = NLoginCore_127.A("čČĭăĬďĽĦĎĶĮėıĐčŁĚĄĚěăġŅċĽįģĎļŁōő", (byte)31, 65);
               ZKM_STR_B[3] = NLoginCore_530.B("èĵĂĕĸóĳĭĶñĔą", (byte)31, 66);
               ZKM_STR_B[4] = NLoginCore_241.D("щѣҀѧѹѬ҂ҀҀҔьњ", (byte)31, 68);
               ZKM_STR_B[5] = NLoginCore_433.C("҇҃љѼыцѠҋѭёҏњ", (byte)31, 67);
               ZKM_STR_B[6] = NLoginCore_241.A("ĩĔČĢĎįēĺĶěČą", (byte)31, 65);
               ZKM_STR_B[7] = NLoginCore_110.B("čČĭăĬďĽĦĎĶİČùĻĥĖĶĚńĆėŉĐđ", (byte)31, 66);
               ZKM_STR_B[8] = NLoginCore_183.F("ԫԪՋԡՊԭ՛ՄԬՔՎԧՊԼԫԝԽ\u0530՟ԙՀԧՅԢԶԨՃլզգ՜Ս", (byte)31, 70);
               ZKM_STR_B[9] = NLoginCore_384.B("čČĭăĬďĽĦĎĶĮøÿĸĳĠĝňĦĿłŁĖČĦĠİħįğŉĠ", (byte)31, 66);
               ZKM_STR_B[10] = NLoginCore_575.E("ԫԪՋԡՊԭ՛ՄԬՔՎՑԼԝԘբԤՎԟԴՂԢՕՈՋՎԭՌԢԱըՄ", (byte)31, 69);
               ZKM_STR_B[11] = NLoginCore_446.A("čČĭăĬďĽĦĎĶįĮĘĴÿĘĽÿđąĵĹĐđ", (byte)31, 65);
               ZKM_STR_B[12] = NLoginCore_387.E(
                  "ՄԦՕ\u0557ՈՅՖԫՏԶԿԖԪբԡԬԹԤՏԿ՛եՀԤժզՇԭՊԾԲծՅՌՑՍշԷշըՎ՛ղՏաՠԹծդՍվաչռոգ՚ծլՅհՑտ֍ցցՓՉցղ֚քիՖ֒։ժա֒\u058bւ֦֠զ՞ևՠ՝֍րշապ֏ը֦֜֕ւյֲֳ֒ն\u058bօս֚ս֫֝\u058c֎׃\u0590\u05c8ַָֻֽ֚֮֞֩֞\u058cֳֿ",
                  (byte)31,
                  69
               );
               ZKM_STR_B[13] = NLoginCore_241.A(
                  "ĬĤĎĥĩąćđľēľĪüĐĭĚĜĘġûĀŌĄăįġŃĞĿīĩčŊŋŗħŃśĮŌĔĞŔĮşĴĵĥĘİĚġłŅłĻśĨşŋńĭŢūőŗŏōŚŜůżŎŐĽŘŰŷţŴşűłŚŕŔżŢŉũŬŢƍƐƏŪőƑŷůŷƌŗźŵƐźƍƓŸơƦſƣŵşŴŝƂŬƪƯƝũƨűűƃƗŵƭƸŸƩƊƭƏŷƐƅ",
                  (byte)31,
                  65
               );
               ZKM_STR_B[14] = NLoginCore_201.D("ѵѠѦыҍщѥёѾъҍѕѷ҄ҎҒҔѲѭѫѪѩѴҔѠҌҁҞҞҦҀҫҡѽҞҠ҆ѬѼҭҰ҆ѴѺ", (byte)31, 68);
               ZKM_STR_B[15] = NLoginCore_092.E("ԝԿԣԴՋՂԗՒԸԘ՚ՒԶԛԲգՎԶՀԽ՜ԱԮԯ", (byte)31, 69);
               ZKM_STR_B[16] = NLoginCore_471.E("ՄԨԐՈՌՔԩԮԎԔԺԣ", (byte)31, 69);
               ZKM_STR_B[17] = NLoginCore_027.C("҈ѫѨ҈ѿњ҃҄҃ҏѫѪ҅ѥҕѫқѹѓ҇ҕҞѥѦ", (byte)31, 67);
               ZKM_STR_B[18] = NLoginCore_427.C("фѾѸљҁюѐ҆ѤҎғњ", (byte)31, 67);
               ZKM_STR_B[19] = NLoginCore_076.D("Ҍѩ҆ѯҏњущҀґўюҊъѮєѭѭѰѝѵѨѥѦ", (byte)31, 68);
               ZKM_STR_B[20] = NLoginCore_559.F("ՕԐԩՒԔՑԵԸԭ՚ԝԣ", (byte)31, 70);
               ZKM_STR_B[21] = NLoginCore_232.C("҆ыѼњѮтўҐҐҌғњ", (byte)31, 67);
               ZKM_STR_B[22] = NLoginCore_397.A("ģğøċĨĆċęõĘĪą", (byte)31, 65);
               ZKM_STR_B[23] = NLoginCore_384.C("нхэ҂Ҁѿѩ҄ўѤѝњ", (byte)31, 67);
               ZKM_STR_B[24] = NLoginCore_553.A("ĦďĖăĘģĴďĞīĺą", (byte)31, 65);
               ZKM_STR_B[25] = NLoginCore_091.D("нҊїѪҍш҈҂ҋцѩњ", (byte)31, 68);
               ZKM_STR_B[26] = NLoginCore_427.D("ѻѧ҇чѸѱѮѾђҍьњ", (byte)31, 68);
               ZKM_STR_B[27] = NLoginCore_427.C("ѳѿэѶ҉ѩѹҋҔҀѴѵ҉ъѬѺѪєѸѸҋҞѥѦ", (byte)31, 67);
               ZKM_STR_B[28] = NLoginCore_141.E("ԝՍԠԡՆԤԫՅԗՈԔՠ՜ԯԶԟՕԼՑ\u0558ԸէԮԯ", (byte)31, 69);
               ZKM_STR_B[29] = NLoginCore_027.E("ԪՔԾԿԏԦՐՇԷԥԸՀ\u0557Ԝ\u0530\u0557ՀԯԳ՞ԚէԮԯ", (byte)31, 69);
               ZKM_STR_B[30] = NLoginCore_575.F("ՕԲՏԸ\u0558ԣԌԒՉ՚Ԩ\u0557Ծբԟԕՙ՝՜աբ\u0557Ԯԯ", (byte)31, 70);
               ZKM_STR_B[31] = NLoginCore_575.B("ēéĤĩđòĉċĦĈĺą", (byte)31, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.D("ѡ҇љјѮ҈ь҅ѽыѵҎѪіѺѮҜѼѦїїѫҀѲҟіѽѢљҔҟѵ", (byte)31, 68);
               ZKM_STR_B[1] = NLoginCore_553.A("ďďćĘĂěīīĘúþğĪĵúýŀĄŅĆłēĐđ", (byte)31, 65);
               ZKM_STR_B[2] = NLoginCore_232.F("ԫԪՋԡՊԭ՛ՄԬՔՌԵՏԮԫ՟ԸԢԸԹԡԻԨ՜՞աՉԪդղՐԿ", (byte)31, 70);
               ZKM_STR_B[3] = NLoginCore_575.D("҃҇Ѡ҃ѸѤьыѤҏ҇њ", (byte)31, 68);
               ZKM_STR_B[4] = NLoginCore_384.B("þčČĥďĥĈČīďķłĖġģŁĆĴĥńĳēĐđ", (byte)31, 66);
               ZKM_STR_B[5] = NLoginCore_387.F("ԲԏԣԪՃԵԖԣԶ՛Քԣ", (byte)31, 70);
               ZKM_STR_B[6] = NLoginCore_397.E("ՑԲՒ\u0557ԠԤ\u0557ՄԤ՝\u0557ՙՌԯՌԟԿզԽԯԹէԮԯ", (byte)31, 69);
               ZKM_STR_B[7] = NLoginCore_530.B("čČĭăĬďĽĦĎĶĮČĚďĀĥĥùāćŀĹĐđ", (byte)31, 66);
               ZKM_STR_B[8] = NLoginCore_553.B("čČĭăĬďĽĦĎĶİĉĬĞčÿğĒŁûĢćĜĖįĤįăčŉŊĬ", (byte)31, 66);
               ZKM_STR_B[9] = NLoginCore_446.B("čČĭăĬďĽĦĎĶĮøÿĸĳĠĝňĦĿłľĢġŃěĎĤĪĜŁĐ", (byte)31, 66);
               ZKM_STR_B[10] = NLoginCore_241.D("Ѣѡ҂јҁѤҒѻѣҋ҅҈ѳєяҙћ҅іѫѹќѬѷќ҅ѠҞҔґћ҇", (byte)31, 68);
               ZKM_STR_B[11] = NLoginCore_384.D("Ѣѡ҂јҁѤҒѻѣҋ҃ѴѯѹѳѺҍѮғѰѼѸѥѦ", (byte)31, 68);
               ZKM_STR_B[12] = NLoginCore_092.B(
                  "ĦĈķĹĪħĸčıĘġøČńăĎěĆıġĽŇĢĆŌňĩďĬĠĔŐħĮĳįřęřŊİĽŔıŃłěŐņįŠŃśŞŚŅļŐŎħŒĳšůţţĵīţŔżŦōĸŴūŌŃŴŭŤƈƂňŀũłĿůŢřŃŜűŊžŷƈŤŗƔƕŴŘŭŧşżşƍſŮŰƥŲƪƝƚƋƪŸƦƘƂżƫŰƩƦŲŰƮƌƫƨƜƈưƶƅ",
                  (byte)31,
                  66
               );
               ZKM_STR_B[13] = NLoginCore_076.D(
                  "ҁѹѣѺѾњќѦғѨғѿёѥ҂ѯѱѭѶѐѕҡљј҄ѶҘѳҔҀѾѢҟҠҬѼҘҰ҃ҡѩѳҩ҃Ҵ҉ҊѺѭ҅ѯѶҗҚҗҐҰѽҴҠҙ҂ҷӀҦҬҤҢүұӄӑңҥҒҭӅӌҸӉҴӆҗүҪҩӑҷҞҾӁҷӢӥӤҿҦӦӌӄӌӡҬӏӊӥӏӢӨӍӶӻӔӸӊҴӉҲӗӁӿԄӲҾӽӆӆӘӛәӺԎӺӚӾӳԔӥӡӚ",
                  (byte)31,
                  68
               );
               ZKM_STR_B[14] = NLoginCore_091.F("ԾԩԯԔՖԒԮԚՇԓՖԞՀՍ\u0557՛՝ԻԶԴԳԲԽ՝ԩՕՊէէկՉմՍհէ՟ՊզմձթՋՆՃ", (byte)31, 70);
               ZKM_STR_B[15] = NLoginCore_091.B("ÿġąĖĭĤùĴĚúĻøċĜĶûÿņĀĀľēĐđ", (byte)31, 66);
               ZKM_STR_B[16] = NLoginCore_521.E("ԋՄՔԔՙԡԒԪ\u0530Թԝԣ", (byte)31, 69);
               ZKM_STR_B[17] = NLoginCore_223.F("ՑԴԱՑՈԣՌՍՌ\u0558ԲՋԠԼ՛ՖԞԝգՄ՝ՁԮԯ", (byte)31, 70);
               ZKM_STR_B[18] = NLoginCore_446.D("ѕѷїѽѻў҆ҍѭҐғњ", (byte)31, 68);
               ZKM_STR_B[19] = NLoginCore_004.D("Ҍѩ҆ѯҏњущҀґѠҖѡѬ҈Ѳѕѯѹ҆ѿҁўҏљҔѤҔғѼѷѶ", (byte)31, 68);
               ZKM_STR_B[20] = NLoginCore_141.E("ՄԫԈԣՇԋԔԕԛՍԝԣ", (byte)31, 69);
               ZKM_STR_B[21] = NLoginCore_241.D("јѝ҄ѻѦ҆џѰѨѥѡњ", (byte)31, 68);
               ZKM_STR_B[22] = NLoginCore_427.A("ÿÿēïăĴóõøùľą", (byte)31, 65);
               ZKM_STR_B[23] = NLoginCore_004.E("ԵԲԱՊԗԙՌԓԔԏԪԣ", (byte)31, 69);
               ZKM_STR_B[24] = NLoginCore_201.E("\u0530ԇԩԿ\u0558ՑՈՐԱ՜ԕԣ", (byte)31, 69);
               ZKM_STR_B[25] = NLoginCore_232.D("ѷѦцэѢҁѨыыѲєњ", (byte)31, 68);
               ZKM_STR_B[26] = NLoginCore_004.C("ќтўќчѨѝѫ҃ҎѯѵєѠҍҎѫѸѨҎҟѨѥѦ", (byte)31, 67);
               ZKM_STR_B[27] = NLoginCore_427.F("ԼՈԖԿՒԲՂՔ՝ՉԻԬԬ\u0557ՊԕԖ՟Ի՟Փ\u0557Ԯԯ", (byte)31, 70);
               ZKM_STR_B[28] = NLoginCore_553.A("ÿįĂăĨĆčħùĪöĢķāĳĻĸĔĦąĦēĐđ", (byte)31, 65);
               ZKM_STR_B[29] = NLoginCore_004.A("ČĶĠġñĈĲĩęćęęŁŁăľĖĲĐĖĳēĐđ", (byte)31, 65);
               ZKM_STR_B[30] = NLoginCore_433.C("Ҍѩ҆ѯҏњущҀґўҊғѳјѫҕѲѻқҊҎѥѦ", (byte)31, 67);
               ZKM_STR_B[31] = NLoginCore_091.C("ѵф҇цѭҌ҆ѧћѢѰяҘҗѬҚҘѕѱҘѹѨѥѦ", (byte)31, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_553.F("ԆԕԎԪՋՎԒԫՊԵԶԣ", (byte)31, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.A("ėİòČĤıĲõďħøčŁĘĤġķŀĜĪĢĔĩŊĜĩŎĎŃČĵĨ", (byte)31, 65);
         }
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al & ao, at), a(bd, be ^ bh)).toUpperCase(Locale.ENGLISH);
      int var4 = bi;
      switch (var2.hashCode()) {
         case 2282:
            if (var2.equals(a(bp & bq, br))) {
               var4 = bu;
            }
            break;
         case 73844866:
            if (var2.equals(a(bj, bk ^ bm))) {
               var4 = bn;
            }
            break;
         case 1954237522:
            if (var2.equals(a(bw, by))) {
               var4 = bz;
            }
      }

      switch (var4) {
         case 0:
            int var5 = var1.a(a(cb, cd ^ cf), NLoginCore_036.d.i());
            String var6 = var1.b(a(cg, ci ^ ck));
            String var7 = var1.b(a(cm, cn ^ cp));
            String var8 = var1.b(a(cr, ct));
            String var9 = var1.b(a(cv, cw ^ cx));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var6, var5, var9, var7, var8, new Properties()));
            return;
         case 1:
            throw new UnsupportedOperationException(a(cy & da, dc));
         case 2:
            throw new UnsupportedOperationException(a(dd, df ^ dg));
         default:
            throw new IllegalArgumentException(a(dh, di ^ dj) + var2);
      }
   }

   static {
      b();
   }
}
