package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_037 extends NLoginCore_098 {
   private static long fc = Long.reverse(4993325179669294616L);
   private static int ex = Integer.reverse(-1476395008);
   private static long ev = Long.reverse(-5238853173716472296L);
   private static long be = Long.reverse(4993325179669294616L);
   private static int dt = Integer.reverse(134217728);
   private static long ab = Long.reverse(-5238853173716472296L);
   private static long cd = Long.reverse(4993325179669294616L);
   private static int fz = Integer.reverse(0);
   private static int dd = Integer.reverse(-1342177280);
   private static int cb = 28 >>> 194 | 28 << ~194 + 1;
   private static long au = Long.reverse(-1008806316530991104L);
   private static long bv = Long.reverse(4993325179669294616L);
   private static long dp = Long.reverse(-1008806316530991104L);
   private static long es = Long.reverse(-5238853173716472296L);
   private static long ez = Long.reverse(-5238853173716472296L);
   private static int al = 524288 >>> 18 | 524288 << ~18 + 1;
   private static int y = 16 >>> 100 | 16 << -100;
   private static long eb = Long.reverse(4993325179669294616L);
   private static long bk = Long.reverse(4993325179669294616L);
   private static int cy = 786432 >>> 16 | 786432 << -16;
   private static long dv = Long.reverse(4993325179669294616L);
   private static long el = Long.reverse(4993325179669294616L);
   private static long fn = Long.reverse(-5238853173716472296L);
   private static int gd = (26 >>> 0 | 26 << -0) & -1;
   private static int ek = 4718592 >>> 242 | 4718592 << ~242 + 1;
   private static long q = Long.reverse(-1008806316530991104L);
   private static long ci = Long.reverse(4993325179669294616L);
   private static long df = Long.reverse(4993325179669294616L);
   private static int eu = (1073741825 >>> 92 | 1073741825 << ~92 + 1) & -1;
   private static int bn = Integer.reverse(-1610612736);
   private static int bz = Integer.reverse(1462763520);
   private static int fv = (52428800 >>> 181 | 52428800 << ~181 + 1) & -1;
   private static long cw = Long.reverse(4993325179669294616L);
   private static int fp = (262144 >>> 242 | 262144 << ~242 + 1) & -1;
   private static long ct = Long.reverse(4993325179669294616L);
   private static int e = 0 >>> 47 | 0 << ~47 + 1;
   private static String[] f = new String[gd];
   private static long o;
   private static int bi = Integer.reverse(536870912);
   private static long eo = Long.reverse(-1008806316530991104L);
   private static long by = Long.reverse(-1008806316530991104L);
   private static int cr = Integer.reverse(1342177280);
   private static long ck = Long.reverse(-1008806316530991104L);
   private static int bu = (3 >>> 191 | 3 << -191) & -1;
   private static long dy = Long.reverse(-1008806316530991104L);
   private static long ft = Long.reverse(4993325179669294616L);
   private static int cg = Integer.reverse(268435456);
   private static int cm = Integer.reverse(-1879048192);
   private static long ds = Long.reverse(-5238853173716472296L);
   private static String[] e = new String[NLoginCore_037.gc];
   private static long br = Long.reverse(-1008806316530991104L);
   private static int ey = (-1 >>> 214 | -1 << ~214 + 1) & -1;
   private static long cu = Long.reverse(-1008806316530991104L);
   private static long fy = Long.reverse(-1008806316530991104L);
   private static long p = Long.reverse(4993325179669294616L);
   private static long cp = Long.reverse(-1008806316530991104L);
   private static int fr = 805306368 >>> 89 | 805306368 << ~89 + 1;
   private static long fx = Long.reverse(4993325179669294616L);
   private static long at = Long.reverse(4993325179669294616L);
   private static long dm = Long.reverse(4993325179669294616L);
   private static int da = Integer.reverse(-1);
   private static long ff = Long.reverse(-1008806316530991104L);
   private static int bd = (196608 >>> 240 | 196608 << -240) & -1;
   private static long fu = Long.reverse(-1008806316530991104L);
   private static long cf = Long.reverse(-1008806316530991104L);
   private static int dh = Integer.reverse(0);
   private static int dk = Integer.reverse(1879048192);
   private static int gc = (851968 >>> 239 | 851968 << ~239 + 1) & -1;
   private static long cn = Long.reverse(4993325179669294616L);
   private static int fh = Integer.reverse(-402653184);
   private static long dc = Long.reverse(-5238853173716472296L);
   private static int fa = Integer.reverse(1744830464);
   private static int fl = Integer.reverse(-1);
   private static long bh = Long.reverse(-1008806316530991104L);
   private static long bo = Long.reverse(4993325179669294616L);
   private static long cx = Long.reverse(-1008806316530991104L);
   private static int eq = 39845888 >>> 245 | 39845888 << -245;
   private static long ee = Long.reverse(-1008806316530991104L);
   private static long bm = Long.reverse(-1008806316530991104L);
   private static int dq = Integer.reverse(-268435456);
   private static int cv = (180224 >>> 174 | 180224 << -174) & -1;
   private static int dz = (4352 >>> 136 | 4352 << ~136 + 1) & -1;
   private static long dg = Long.reverse(-1008806316530991104L);

   private static String a(int var0, long var1) {
      var1 ^= 79L;
      var1 ^= 2559519584860556934L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(11 + 58),
                     (byte)(5 + 78),
                     (byte)(35 + 12),
                     (byte)(50 + 17),
                     (byte)(20 + 46),
                     67,
                     (byte)(13 + 34),
                     (byte)(68 + 12),
                     (byte)(62 + 13),
                     (byte)(2 + 65),
                     (byte)(33 + 50),
                     (byte)(23 + 30),
                     (byte)(63 + 17),
                     (byte)(48 + 49),
                     (byte)(11 + 89),
                     (byte)(48 + 52),
                     (byte)(26 + 79),
                     (byte)(26 + 84),
                     (byte)(34 + 69)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(28 + 55)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.B("ĮĻĺýĽĹĴĽňķĄłņĿłňĊҘҀҜҞқҩҙѷҢҘҫҍҥ", (byte)38, 66));
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

   public NLoginCore_037(NLoginType_008 var1) {
      super(var1, NLoginCore_479.P, a(e, p ^ q), a(y, ab));
   }

   static {
      b();
   }

   private void h(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(fa, fc ^ ff));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(a(fh & fl, fn));
      } else {
         NLoginCore_291 var2 = this.m.a();
         ForceRegisterConfig var3 = var2.a(var1, null, null, (boolean)fp);
         if (var3 == null) {
            throw new RuntimeException(a(fr, ft ^ fu) + var1 + a(fv, fx ^ fy));
         } else if (!var3.t()) {
            var3.z();
            if (var2.a(this.a, var3)) {
               this.k++;
            }
         }
      }
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(eu, ev));
      boolean var2 = Boolean.parseBoolean(var1.getString(a(ex & ey, ez)));
      if (var2) {
         this.h(this.r);
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al, at ^ au), a(bd, be ^ bh));
      if (var2.isEmpty()) {
         throw new IllegalArgumentException(a(bi, bk ^ bm));
      } else {
         String var3 = var1.b(a(bn, bo ^ br)).trim().toLowerCase(Locale.ENGLISH);
         int var4 = var1.a(a(bu, bv ^ by), bz);
         String var5 = var1.a(a(cb, cd ^ cf), a(cg, ci ^ ck));
         String var6 = var1.a(a(cm, cn ^ cp), a(cr, ct ^ cu));
         String var7 = var1.a(a(cv, cw ^ cx), a(cy & da, dc));
         boolean var8 = var1.a(a(dd, df ^ dg), (boolean)dh);
         Properties var9 = new Properties();
         var9.setProperty(a(dk, dm ^ dp), Boolean.toString(var8));
         var9.setProperty(a(dq, ds), a(dt, dv ^ dy));
         if (var3.contains(a(dz, eb ^ ee))) {
            this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var5, var4, var2, var6, var7, var9));
         } else {
            if (!var3.contains(a(ek, el ^ eo))) {
               throw new UnsupportedOperationException(a(eq, es) + var3);
            }

            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var5, var4, var2, var6, var7, var9));
         }
      }
   }

   private static void b() {
      o = 1762539618434798242L;
      long var0 = o ^ 2559519584860556934L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(4 + 64),
               (byte)(63 + 6),
               (byte)(66 + 17),
               (byte)(19 + 28),
               (byte)(9 + 58),
               (byte)(16 + 50),
               (byte)(21 + 46),
               (byte)(5 + 42),
               (byte)(7 + 73),
               (byte)(40 + 35),
               (byte)(5 + 62),
               (byte)(10 + 73),
               53,
               80,
               (byte)(46 + 51),
               (byte)(69 + 31),
               (byte)(82 + 18),
               (byte)(83 + 22),
               (byte)(5 + 105),
               (byte)(88 + 15)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_241.A("ƥƸƜǍƳǊƘƾƠƛƲƫ", (byte)114, 65);
               f[1] = NLoginCore_453.A("ƻƻƬǒƳƯƯǟƶƻƯǏƧƼƺǋǚƧǧǏǦǉƶƷ", (byte)114, 65);
               f[2] = NLoginCore_453.A("ǇǎƮǉǋǍƴƕƳǠǝǥƲǨǠƶƢǋƥƻǝǉƶƷ", (byte)114, 65);
               f[3] = NLoginCore_397.E("֦֗֟ՠի՞֥֝աֈթ֟\u058b֮ղֆ֣֤ի\u058cշքցւ", (byte)114, 69);
               f[4] = NLoginCore_201.F("֠չֆ։֞օֈ֝ժծ֡ղ֢զֳ֖հհ֩֓նֻ֛֙֔նվֲտֵ֗֘֯־\u05c8ָֺփ\u05ce֭֯\u05c9֖֡", (byte)114, 70);
               f[5] = NLoginCore_453.C("ցճծՒ՝էԼշբ֍դըս֍՝Չև\u058cղ֍֏և՞՟", (byte)114, 67);
               f[6] = NLoginCore_183.B("ƼƝƳǙƬƚǟǂǡưƲƫ", (byte)114, 66);
               f[7] = NLoginCore_232.C("Քւծչմօ՜ջմ՝ՊևՊղգռՎ՞Ր֑ժձ՞՟", (byte)114, 67);
               f[8] = NLoginCore_521.B("ƯƮƺƺƮƲǔƴǄǛǎǝƿƻƿǨǩǍƮǚǏǟƶƷ", (byte)114, 66);
               f[9] = NLoginCore_397.E("ֆն֦֛պ֜զ֠տ\u058bֲֳ֣֣֬֫֝֓֒֊֮քցւ", (byte)114, 69);
               f[10] = NLoginCore_387.F("եէ՛ժիևְ֨֘֍֧ն", (byte)114, 70);
               f[11] = NLoginCore_027.B("ƗǗǚƼƱƯǡǞƢƢơǤǚƠƾǢǜǪǪƮǎǟƶƷ", (byte)114, 66);
               f[12] = NLoginCore_141.B("ǙǈǞǏƝƺƴƳǤǀǒǧǩǥǢǬǉǭƨǪƩǟƶƷ", (byte)114, 66);
               f[13] = NLoginCore_397.B("ǌƮƔƹǕǂƻơǁƞǗƿƺǔǉǋǂƸǟƩǩƹƶƷ", (byte)114, 66);
               f[14] = NLoginCore_559.E("֝եվվ֕զգ֦֫֡֍ն", (byte)114, 69);
               f[15] = NLoginCore_223.D("ձԾեօ՞ցՓք\u0557ֈշֆւկստՠն֗Ւհհ\u0558շլէՕ֙֍֖\u0590֜", (byte)114, 68);
               f[16] = NLoginCore_397.A("ƚƫƹǐǉƽǖǓƹƠƲƫ", (byte)114, 65);
               f[17] = NLoginCore_471.E("ղ֚։ը֓ֆքթ֧֝֠ն", (byte)114, 69);
               f[18] = NLoginCore_324.D("ցղքՑռՀևէ֊՛ծՓ", (byte)114, 68);
               f[19] = NLoginCore_575.D("ռփՎՖՆՇ\u0558ՃՃԿտՙաՉ֏ՋբՏշր֒չՖզ՚ը֏ո֙֙հ֟\u0590փ֣֟֞֗բրջ\u058bւճ", (byte)114, 68);
               f[20] = NLoginCore_076.A("ǏƗƽƾǓƭƾǔƱơǚǙǕǡƺǧƻǚǜǯƼǯƶƷ", (byte)114, 65);
               f[21] = NLoginCore_521.D("ցռգփֆՙսթն՛ՅՓ", (byte)114, 68);
               f[22] = NLoginCore_138.E("֠և֟չփ֣֖֤֗ռռկ֣֠ճ֣նծ։֖֊ֺֹֻևֲ֖\u0590׃ִׅ֙սցׄ֟\u05c9֦ׅ֞֬֊֖֝", (byte)114, 69);
               f[23] = NLoginCore_387.B("ǕƼǔƮƸǘǋǙǌƱƱƤǕǘƨǘƫƣƾǋƿƭǊƭǍǒǯǎǣǙǶǕƵǗǨƹǜǾǊǭȀǼǦǋ", (byte)114, 66);
               f[24] = NLoginCore_575.A("ǗƴǔƷǞƓƹƻƮƠǁǃǐǂƾƪǡǄƿǨƻƧǋǂƲƭǗǤǶǤƶǥ", (byte)114, 65);
               f[25] = NLoginCore_092.A("ƼǆǑƑǉƬǍǎƣǀƦǥƳǟƼƤƣǗƨƷƭƹƶƷ", (byte)114, 65);
               break;
            case 1:
               f[0] = NLoginCore_183.B("ƸƶǕǝƜǟǃǋǒƽǀǢƞƦǟǇǔǅƶƿƾǯƶƷ", (byte)114, 66);
               f[1] = NLoginCore_427.D("գգՔպ՛\u0557\u0557և՞գ\u0557օՠգի՛֕սՍըչձ՞՟", (byte)114, 68);
               f[2] = NLoginCore_127.F("֒֙չ֖֔֘տՠվ֧֫լ\u0590ղ֫ւ֎յ֬֍֭֔ցւ", (byte)114, 70);
               f[3] = NLoginCore_110.D("մռփԽՈԻւպԾեՇՅռկխ՞֔օբ֏Քա՞՟", (byte)114, 68);
               f[4] = NLoginCore_138.A("ǕƮƻƾǓƺƽǒƟƣǖƧǗƛǋǨƥƥǞǈƫǎǰǉǐƫƳǧƴǪǌǍǨǙǖǐǺǶǻǵǼǵǁǋ", (byte)114, 65);
               f[5] = NLoginCore_232.A("ǙǋǆƪƵƿƔǏƺǥƺƵǈǜƶǋƫǘƿǗƪǉƶƷ", (byte)114, 65);
               f[6] = NLoginCore_471.C("Խկու՚ճՆեԾչո՟Տ՜Սվ՜յբ֒կձ՞՟", (byte)114, 67);
               f[7] = NLoginCore_575.C("Քւծչմօ՜ջմ՝ՉդՐ՝ՈւՑՏզ֕֕֗՞՟", (byte)114, 67);
               f[8] = NLoginCore_530.D("\u0557ՖբբՖ՚ռ՜լփկլՌչրլ֒֍֕ժմա՞՟", (byte)114, 68);
               f[9] = NLoginCore_324.E("ֆն֦֛պ֜զ֠տ\u058b֥\u058c\u058b֊յ֗րֲղլּքցւ", (byte)114, 69);
               f[10] = NLoginCore_530.E("էբ֑յ֘ոևիծռսն", (byte)114, 69);
               f[11] = NLoginCore_471.B("ƗǗǚƼƱƯǡǞƢƢƢǜǦƷǩǩǊǬǖƮƧǉƶƷ", (byte)114, 66);
               f[12] = NLoginCore_433.D("ցհֆշՅբ՜՛\u058cըջ՝սժՉ֒\u058bրթօլև՞՟", (byte)114, 68);
               f[13] = NLoginCore_575.E("֗չ՟ք֠֍ֆլ\u058cթ֢ռցխյձ֟ժַ֣֘֔ցւ", (byte)114, 69);
               f[14] = NLoginCore_433.F("\u0590շ֤֒֝֨֘֘֎֭\u058c\u058b֒֏ֵַ֑րֱհ֒֔ցւ", (byte)114, 70);
               f[15] = NLoginCore_553.A("ǉƖƽǝƶǙƫǜƯǠǏǞǚǇǕǗƸǎǯƪǈǆǋƿǜǔǣƲǅǤǑǍǌǲǊǱǏƷƸǓǿǁǰǋ", (byte)114, 65);
               f[16] = NLoginCore_471.E("ռմջ֜և֘ց֡ռռսթֈ֝\u058cվֲֳ֤֤֩֔ցւ", (byte)114, 69);
               f[17] = NLoginCore_141.E("֖֚ձջո֖֝վ֤֏օ\u058b֔\u058c֍մւַփֵ֓քցւ", (byte)114, 69);
               f[18] = NLoginCore_223.A("ƽƶƼƿƺǍǂǚǁǟƮƝǉǇǘǪƷǋƾƼƭƹƶƷ", (byte)114, 65);
               f[19] = NLoginCore_138.B("ǔǛƦƮƞƟưƛƛƗǗƱƹơǧƣƺƧǏǘǪǑƮƾƲǀǧǐǱǱǈǷƷƴǱǫǒȀǌǤȃǰǹǀǓǅǝǽǉǖǜǊǼǩǖǗ", (byte)114, 66);
               f[20] = NLoginCore_397.B("ǏƗƽƾǓƭƾǔƱơǚǡǁǚǚǉƹǩƽǃǃǯƶƷ", (byte)114, 66);
               f[21] = NLoginCore_076.B("ǚƮƺƱǙƜǘǎǍǝƱƵơƩǣơǁǞǮǪǑǉƶƷ", (byte)114, 66);
               f[22] = NLoginCore_521.D("սդռՖՠրճցմՙՙՌսրՐրՓՋզճէ֖֗֘դ֏ճխ֠ն֑֢պգ֣ֆ֜ղփթ֪֎֎ճ", (byte)114, 68);
               f[23] = NLoginCore_173.A("ǕƼǔƮƸǘǋǙǌƱƱƤǕǘƨǘƫƣƾǋƿƭǊƭǍǒǯǎǣǙǶǕǝǯǯǲǚǋǁƵǼȃǒǋ", (byte)114, 65);
               f[24] = NLoginCore_453.E("֢տ֟ւ֩՞քֆչի\u058c֎֛֍։յ֬֏֊ֳֆְּ֮֫֟֫֟׀ռ֗֔", (byte)114, 69);
               f[25] = NLoginCore_138.F("և֑֜՜֔շ֘֙ծ\u058bէ֦օմֳֵ֥֊ִ֢չ֪ցւ", (byte)114, 70);
               break;
            case 2:
               f[0] = NLoginCore_223.A("ǈƕǖǇƟǔǑǘǝƣƤƦǓƟǈƢǝǠƭǨǚǯƶƷ", (byte)114, 65);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_427.B("ǑǍǐƞƸǠǚƠƠǦƺƞǨǓƾǥƤǧǟƹǨǉƶƷ", (byte)114, 66);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_037.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.B("ÁãåÅéĈĀĖĂÑďąēčÖûĝĜĔĚĔé", (byte)13, 66), NLoginCore_037.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.B("üĉĈËċćĂċĖąÒĐĔčĐĖØѦюѪѬѩѷѧхѰѦѹћѳñ", (byte)13, 66) + var1 + NLoginCore_076.A("Ó", (byte)13, 65) + var2.toString(), var4
         );
      }
   }
}
