package com.nickuc.login;

import java.io.File;
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

public class NLoginCore_518 extends NLoginCore_098 {
   private static int bw = Integer.reverse(1610612736);
   private static long at = Long.reverse(-6710426675327975741L);
   private static long fi = Long.reverse(-8583924120314102077L);
   private static long ft = Long.reverse(3026418949592973312L);
   private static long eo = Long.reverse(3026418949592973312L);
   private static int cg = 1048576 >>> 241 | 1048576 << -241;
   private static long dc = Long.reverse(3026418949592973312L);
   private static int cj = -2147482822 >>> 222 | -2147482822 << ~222 + 1;
   private static long cd = Long.reverse(-8583924120314102077L);
   private static int bd = Integer.reverse(-1073741824);
   private static String[] e = new String[NLoginCore_518.gg];
   private static long fn = Long.reverse(-8583924120314102077L);
   private static long p = Long.reverse(-8583924120314102077L);
   private static int fh = Integer.reverse(1744830464);
   private static long bm = Long.reverse(3026418949592973312L);
   private static int cv = Integer.reverse(-805306368);
   private static long dv = Long.reverse(-8583924120314102077L);
   private boolean E;
   private static int bu = Integer.reverse(0);
   private static long bk = Long.reverse(-8583924120314102077L);
   private static long bs = Long.reverse(3026418949592973312L);
   private static int cy = Integer.reverse(805306368);
   private static long cn = Long.reverse(-8583924120314102077L);
   private static long fo = Long.reverse(3026418949592973312L);
   private static int fb = Integer.reverse(671088640);
   private static int bn = Integer.reverse(-1);
   private static long ds = Long.reverse(-6710426675327975741L);
   private static String[] f = new String[NLoginCore_518.gh];
   private static int ed = Integer.reverse(Integer.MIN_VALUE);
   private static int ea = Integer.reverse(1946157056);
   private static long fq = Long.reverse(-8583924120314102077L);
   private static int gc = Integer.reverse(1476395008);
   private static int ao = (512 >>> 136 | 512 << ~136 + 1) & -1;
   private static long gb = Long.reverse(3026418949592973312L);
   private static long ff = Long.reverse(-6710426675327975741L);
   private static int ek = Integer.reverse(1207959552);
   private static long cx = Long.reverse(3026418949592973312L);
   private static int fl = Integer.reverse(-402653184);
   private static long cp = Long.reverse(3026418949592973312L);
   private static int gg = Integer.reverse(-671088640);
   private static int ey = Integer.reverse(0);
   private static long ct = Long.reverse(-6710426675327975741L);
   private static int fv = Integer.reverse(1073741824);
   private static long ci = Long.reverse(-6710426675327975741L);
   private static long by = Long.reverse(-8583924120314102077L);
   private static int fw = (393216 >>> 145 | 393216 << ~145 + 1) & -1;
   private static long ab = Long.reverse(-6710426675327975741L);
   private static long ca = Long.reverse(3026418949592973312L);
   private static int ec = Integer.reverse(0);
   private static int fz = (104857600 >>> 214 | 104857600 << ~214 + 1) & -1;
   private static int al = (0 >>> 8 | 0 << ~8 + 1) & -1;
   private static int bp = (81920 >>> 78 | 81920 << -78) & -1;
   private static int cm = (1073741826 >>> 222 | 1073741826 << -222) & -1;
   private static int dz = (1048576 >>> 148 | 1048576 << -148) & -1;
   private static long cf = Long.reverse(3026418949592973312L);
   private static int fa = 524288 >>> 115 | 524288 << ~115 + 1;
   private static long ga = Long.reverse(-8583924120314102077L);
   private static long gf = Long.reverse(3026418949592973312L);
   private static int e = Integer.reverse(0);
   private static int dq = Integer.reverse(134217728);
   private static long br = Long.reverse(-8583924120314102077L);
   private static int bi = Integer.reverse(536870912);
   private static long cw = Long.reverse(-8583924120314102077L);
   private static int dt = (285212672 >>> 184 | 285212672 << -184) & -1;
   private static long dj = Long.reverse(3026418949592973312L);
   private static int dk = Integer.reverse(-268435456);
   private static long q = Long.reverse(3026418949592973312L);
   private static long dp = Long.reverse(3026418949592973312L);
   private static int dd = Integer.reverse(-1342177280);
   private static long el = Long.reverse(-8583924120314102077L);
   private static long dy = Long.reverse(3026418949592973312L);
   private static long fc = Long.reverse(-6710426675327975741L);
   private static int fp = -2147483647 >>> 124 | -2147483647 << ~124 + 1;
   private static int ex = Integer.reverse(1946157056);
   private static int cr = Integer.reverse(1342177280);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static long cz = Long.reverse(-8583924120314102077L);
   private static long be = Long.reverse(-8583924120314102077L);
   private static long bh = Long.reverse(3026418949592973312L);
   private static int eu = Integer.reverse(Integer.MIN_VALUE);
   private static long di = Long.reverse(-8583924120314102077L);
   private static int ch = (-1 >>> 157 | -1 << ~157 + 1) & -1;
   private static long dm = Long.reverse(-8583924120314102077L);
   private static int eq = Integer.reverse(-939524096);
   private static long df = Long.reverse(-6710426675327975741L);
   private static long ge = Long.reverse(-8583924120314102077L);
   private static long fj = Long.reverse(3026418949592973312L);
   private static int dh = (917504 >>> 144 | 917504 << ~144 + 1) & -1;
   private static int ar = Integer.reverse(-1);
   private static int gh = Integer.reverse(-671088640);
   private static int de = (-1 >>> 71 | -1 << ~71 + 1) & -1;
   private static int fd = Integer.reverse(-1476395008);
   private static int cc = (28 >>> 2 | 28 << -2) & -1;
   private static int cb = (1048576 >>> 180 | 1048576 << ~180 + 1) & -1;
   private static long es = Long.reverse(-6710426675327975741L);
   private static long o;

   private static String a(int var0, long var1) {
      var1 ^= 84L;
      var1 ^= -5662162478972538270L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(32 + 36),
                     (byte)(68 + 1),
                     (byte)(7 + 76),
                     47,
                     (byte)(49 + 18),
                     (byte)(13 + 53),
                     (byte)(29 + 38),
                     (byte)(15 + 32),
                     (byte)(79 + 1),
                     (byte)(32 + 43),
                     (byte)(20 + 47),
                     (byte)(32 + 51),
                     (byte)(52 + 1),
                     (byte)(21 + 59),
                     (byte)(49 + 48),
                     (byte)(75 + 25),
                     (byte)(78 + 22),
                     105,
                     (byte)(18 + 92),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.B("ƒƟƞšơƝƘơƬƛŨƦƪƣƦƬŮԃԊӽӹԇӥӻӛԄ", (byte)88, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   @Override
   protected File b() {
      return this.m.b().a() == NLoginCore_419.c ? new File(this.m.c().getParentFile().getParentFile(), a(ao & ar, at)) : super.b();
   }

   static {
      b();
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(bd, be ^ bh), a(bi, bk ^ bm)).toUpperCase(Locale.ENGLISH);
      int var4 = bn;
      switch (var2.hashCode()) {
         case -1841605620:
            if (var2.equals(a(bp, br ^ bs))) {
               var4 = bu;
            }
            break;
         case 73844866:
            if (var2.equals(a(bw, by ^ ca))) {
               var4 = cb;
            }
      }

      switch (var4) {
         case 0:
            File var5 = new File(this.b(), a(cc, cd ^ cf));
            this.d = NLoginCore_586.a(this.m, var5, new Properties());
            break;
         case 1:
            int var6 = var1.a(a(cg & ch, ci), cj);
            String var7 = var1.b(a(cm, cn ^ cp));
            String var8 = var1.b(a(cr, ct));
            String var9 = var1.b(a(cv, cw ^ cx));
            String var10 = var1.b(a(cy, cz ^ dc));
            boolean var11 = var1.d(a(dd & de, df));
            Properties var12 = new Properties();
            var12.put(a(dh, di ^ dj), Boolean.toString(var11));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var7, var6, var8, var9, var10, var12));
      }

      this.E = var1.d(a(dk, dm ^ dp));
   }

   private static void b() {
      o = -4360430295273178351L;
      long var0 = o ^ -5662162478972538270L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               69,
               (byte)(57 + 26),
               47,
               (byte)(18 + 49),
               (byte)(4 + 62),
               (byte)(38 + 29),
               (byte)(10 + 37),
               (byte)(66 + 14),
               (byte)(20 + 55),
               (byte)(52 + 15),
               (byte)(15 + 68),
               (byte)(27 + 26),
               (byte)(6 + 74),
               (byte)(74 + 23),
               (byte)(10 + 90),
               (byte)(45 + 55),
               (byte)(19 + 86),
               (byte)(49 + 61),
               (byte)(60 + 43)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_138.E("յ֝թ֚֝՛֝հփ՞֚չ֊֙քսժզէ\u058cֲ֦չպ", (byte)106, 69);
               f[1] = NLoginCore_324.D("ԽԹՈՌՈԣՇԿԼՁՁՇթնԳ՛՚ձԺՙյՙՆՇ", (byte)106, 68);
               f[2] = NLoginCore_201.F("Ֆ՞֘՜֢֥մֆև֧֚ծ", (byte)106, 70);
               f[3] = NLoginCore_110.D("ՈԭՆԬգաՐՍՈՎԲԯԷԫԲձթՕՎՇցտՆՇ", (byte)106, 68);
               f[4] = NLoginCore_446.B("ƻǉƊƤǃƐƩƠƼƟǈƛ", (byte)106, 66);
               f[5] = NLoginCore_471.F("։ս֎ի֏֓՝ց֔ց֛ծ", (byte)106, 70);
               f[6] = NLoginCore_575.F("պ՟\u058c֣֖֗֡ադ\u0590֣ծ", (byte)106, 70);
               f[7] = NLoginCore_530.B("ƟǌƙƎƠǀƞƨƔƓǇƎƦǙǍǐƫƦƻǇƾǓǟǕǙǀƴǟưǙơǌ", (byte)106, 66);
               f[8] = NLoginCore_324.B("ƨƍƦƌǃǁưƭƨƮƒƖǐǁƴƦǋƔƲƱǎƩƦƧ", (byte)106, 66);
               f[9] = NLoginCore_076.A("ƨƍƦƌǃǁưƭƨƮƑǍǅƣǊƤƗǉǚƽƼƮǡƴǖǑǎƻƿƷǔƤ", (byte)106, 65);
               f[10] = NLoginCore_127.B("ƨƍƦƌǃǁưƭƨƮƓƑǂƫƫƶƺǘƬƙǝƹǠƢǅƟǟƤƟƥƽǚ", (byte)106, 66);
               f[11] = NLoginCore_575.A("ƨƍƦƌǃǁưƭƨƮƒǃƔǗƯǚƶǖǜǚƙƹƦƧ", (byte)106, 65);
               f[12] = NLoginCore_453.F("ջՠչ՟֖֔փրջցզ֘շթզժք֊֑֫֯֠֍ձձ֒յִָֻ֜֞", (byte)106, 70);
               f[13] = NLoginCore_471.A("ƨƍƦƌǃǁưƭƨƮƔơǑưǓƗǝƾƪƹƲǙǐǣƽǁǗǟǛǘƵǄ", (byte)106, 65);
               f[14] = NLoginCore_241.D("գԼԺԬՆ՟ՠգՂյըԻ", (byte)106, 68);
               f[15] = NLoginCore_173.A("ƌƮƫƚǐǌƈǎǉƬƕƮƊƩƌƤǉƚǔƙƭƳǗǋƼǢǏǆƞƢǧƴǈǈǆǚǏƣǬǅǜǋƾǦƱǑǎǖǪǖǖƺǀǉǆǇ", (byte)106, 65);
               f[16] = NLoginCore_232.C("\u0558՜դխգկԼԬԭՈԱԻ", (byte)106, 67);
               f[17] = NLoginCore_183.C("զ\u0558զՏՈժՓԮլՒՆԻ", (byte)106, 67);
               f[18] = NLoginCore_004.B("ƼƖƝƋƏǍǅǌƿǔǄƛ", (byte)106, 66);
               f[19] = NLoginCore_241.D("Ս\u0557ԪԡՆԱՆհՋյԵՓՓՕՉՆ՝չնչպՙՆՇ", (byte)106, 68);
               f[20] = NLoginCore_575.F("֚ՠ֡փք֞՜փկ֖֔֔ց֡֬֎֧֟իֆ֪\u058cչպ", (byte)106, 70);
               f[21] = NLoginCore_397.A("ǄƕƛƯƘƣƎǉƧƽǗƿƲǅƮǖƯƸǘƜƗƩƦƧ", (byte)106, 65);
               f[22] = NLoginCore_530.E("տՖ՜Քկւ֦֒ևղցծ", (byte)106, 69);
               f[23] = NLoginCore_173.D("ԻՖԩէդՌեՅ՞ԿԱԻ", (byte)106, 68);
               f[24] = NLoginCore_530.A("ƛƉƣƅƎƮƱƞƎǀƞƛ", (byte)106, 65);
               f[25] = NLoginCore_127.C("ԸբԿՉԾ՟ԯՓԳաԲթգէՊխշնՎԿԽՉՆՇ", (byte)106, 67);
               f[26] = NLoginCore_427.D("ժԵկ՛ԢժՋժՔնՖԻ", (byte)106, 68);
               break;
            case 1:
               f[0] = NLoginCore_427.B("ƢǊƖǊǇƈǊƝưƋǄǕƶǍƣǔƻǑǚǓǀƩƦƧ", (byte)106, 66);
               f[1] = NLoginCore_091.A("ƝƙƨƬƨƃƧƟƜơƞơƫƵǈƩƺǗƙǟƻǑƘƿǣǎƱǨǤǩƼǡ", (byte)106, 65);
               f[2] = NLoginCore_201.C("Ձԭլ\u0557ԩԾժՌՍԳըԻ", (byte)106, 67);
               f[3] = NLoginCore_183.F("ջՠչ՟֖֔փրջցդ֟\u058bփ֠պ֙չջ֧ղְ\u058bղ֥֚֡ֈշ֊ջ֓", (byte)106, 70);
               f[4] = NLoginCore_471.F("՜ռ֗՚֣տչ՝֕գգջ֝դ֪\u058bէ֥իլփ֢չպ", (byte)106, 70);
               f[5] = NLoginCore_397.C("ԾԪՠԹՈկՇ՞՝ՁեՈՏՑՅռՕճԴնՍտՆՇ", (byte)106, 67);
               f[6] = NLoginCore_092.E("թպ\u0558՜Օ֛վօ֏֛՟բյտ՟ե֑֣֡֫֊ֲչպ", (byte)106, 69);
               f[7] = NLoginCore_110.B("ƟǌƙƎƠǀƞƨƔƓǇƎƦǙǍǐƫƦƻǇƾǝưǜƣƹǡƦǇǁƴǥ", (byte)106, 66);
               f[8] = NLoginCore_138.B("ƨƍƦƌǃǁưƭƨƮƔƗƸƓƖǐǜƱǑƽǒƴǎǎǥǄƯƶǢƻƷƵ", (byte)106, 66);
               f[9] = NLoginCore_223.D("ՈԭՆԬգաՐՍՈՎԱխեՃժՄԷթպ՝՜\u0558Թի՚Լդ\u0557։ռՆճ", (byte)106, 68);
               f[10] = NLoginCore_446.E("ջՠչ՟֖֔փրջցզդ֕վվ։֍֫տլְֶ֟ևն֨֘֎֕նֵ֜", (byte)106, 69);
               f[11] = NLoginCore_241.B("ƨƍƦƌǃǁưƭƨƮƒƑƳǙǅƸưǎƮƮǐǒǎƺǜƵǁǓǂƟƜƣ", (byte)106, 66);
               f[12] = NLoginCore_575.C("ՈԭՆԬգաՐՍՈՎԳեՄԶԳԷՑ\u0557ոռ՞ՠՂԼւխՄփ\u0557ՙՆլ", (byte)106, 67);
               f[13] = NLoginCore_387.E("ջՠչ՟֖֔փրջցէմ֤փ֦ժְ֑ս\u058cօ֪֢֓֍ֺ֣յֶ\u0590֫ֈ", (byte)106, 69);
               f[14] = NLoginCore_076.B("ǀǄǇƞƉǐƉƋǏƵƲơǃưƸƖǆƳǛƷƬƹƦƧ", (byte)106, 66);
               f[15] = NLoginCore_559.B("ƌƮƫƚǐǌƈǎǉƬƕƮƊƩƌƤǉƚǔƙƭƳǗǋƼǢǏǆƞƢǧƴǈǈǆǚǏƣǬǅǜǋǁǔǤǚǪǸǬǻǚǚǯǯǆǇ", (byte)106, 66);
               f[16] = NLoginCore_232.C("ԢծՌԼԾԣԪՇԫՊմԻ", (byte)106, 67);
               f[17] = NLoginCore_559.B("ƝƊƋƧƜǅǒƉƎǁƌƳǓƒǍǇƛƏƘǓƽǏƦƧ", (byte)106, 66);
               f[18] = NLoginCore_092.D("ԵԻծԨԢ՝Փմՠդ\u0530լՇՊԴՌ\u0557ԷվԱժՉՆՇ", (byte)106, 68);
               f[19] = NLoginCore_092.C("Ս\u0557ԪԡՆԱՆհՋյԶկԮնԺդղխ՟շՕՙՆՇ", (byte)106, 67);
               f[20] = NLoginCore_127.B("ǇƍǎưƱǋƉưƜǃǂƷƴƭǘƔǅƝƵƫƞƹƦƧ", (byte)106, 66);
               f[21] = NLoginCore_127.D("դԵԻՏԸՃԮթՇ՝նԴչլիՕՙ՚ԾչյՙՆՇ", (byte)106, 68);
               f[22] = NLoginCore_201.B("ƺơƘƸƼǑƺƤǏƍƕƛ", (byte)106, 66);
               f[23] = NLoginCore_559.E("՚֗\u0590֔բձկ\u0558֜֕ՠդնեְ֪֤֚ֈտճ֢չպ", (byte)106, 69);
               f[24] = NLoginCore_201.D("Ո՜գիԫԣՁդբԾԵԻ", (byte)106, 68);
               f[25] = NLoginCore_127.F("ի֕ղռձ֒բֆզ֔ե֛զռշժֱ֣ը֜ճռչպ", (byte)106, 70);
               f[26] = NLoginCore_027.E("ղ\u0590֢֝֍վֆևմՠ֛ծ", (byte)106, 69);
               break;
            case 2:
               f[0] = NLoginCore_387.F("՛խ֙րհ֔\u0557ո֖ճ֩րճ֠գ֊։֛վ֒֜ռչպ", (byte)106, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_471.B("ƥƿƧƺǂƈƪƽƵƪƈƵƑƥƴǋƎƾƕǚƱƹƦƧ", (byte)106, 66);
         }
      }
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(dq, ds));
      String var2 = var1.getString(a(dt, dv ^ dy));
      if (!var2.isEmpty() && var2.charAt(var2.length() - dz) == ea) {
         var2 = var2.substring(ec, var2.length() - ed);
      }

      UUID var3 = NLoginCore_432.c(var2);
      boolean var4 = var1.getBoolean(a(ek, el ^ eo));
      String var5 = var1.getString(a(eq, es));
      if (!var5.isEmpty() && var5.charAt(var5.length() - eu) == ex) {
         var5 = var5.substring(ey, var5.length() - fa);
      }

      UUID var6 = var4 ? NLoginCore_432.c(var5) : null;
      String var7 = var1.getBoolean(a(fb, fc)) ? var1.getString(a(fd, ff)) : null;
      if (var7 != null && !var7.startsWith(a(fh, fi ^ fj))) {
         if (!var7.startsWith(a(fl, fn ^ fo))) {
            this.e(this.r, var7, null);
            return;
         }

         String[] var8 = var7.split(a(fp, fq ^ ft));
         String var9 = var8[fv];
         String var10 = var8[fw];
         var7 = a(fz, ga ^ gb) + var10 + a(gc, ge ^ gf) + var9;
      }

      if (this.E && var4 && var6 != null) {
         var3 = var6;
      }

      if (var4) {
         this.a(this.r, var7, null, var3, var6);
      } else {
         this.a(this.r, var7, null, var3);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_518.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.C("ңӅӇҧӋӪӢӸӤҳӱӧӵӯҸӝӿӾӶӼӶӋ", (byte)66, 67), NLoginCore_518.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.E("ածխ\u0530հլէհջժԷյչղյջԽ࣒ࣙ࣌ࣈࣖࢴ࣊ࢪ࣓Ւ", (byte)66, 69) + var1 + NLoginCore_521.B("Ľ", (byte)66, 66) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_518(NLoginType_008 var1) {
      super(var1, NLoginCore_479.r, a(e, p ^ q), a(y, ab));
      this.E = (boolean)al;
   }
}
