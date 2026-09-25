package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;

public class NLoginCore_472 extends NLoginCore_411 {
   private static long dv = Long.reverse(8803468752508113831L);
   private static int ea = (188416 >>> 77 | 188416 << ~77 + 1) & -1;
   private static long cn = Long.reverse(-1861055165105220697L);
   private static int ai = (16384 >>> 110 | 16384 << -110) & -1;
   private static int cm = (192 >>> 132 | 192 << -132) & -1;
   private static long ci = Long.reverse(-1861055165105220697L);
   private static long dy = Long.reverse(8803468752508113831L);
   private static long be = Long.reverse(8803468752508113831L);
   private static int du = Integer.reverse(-1);
   private static long ee = Long.reverse(8803468752508113831L);
   private static String[] ZKM_STR_A = new String[ea];
   private static int bw = Integer.reverse(-1);
   private static int cb = Integer.reverse(-1);
   private static int z = Integer.reverse(0);
   private static long p = Long.reverse(-7205759403792793600L);
   private static int var_do = -1 >>> 71 | -1 << ~71 + 1;
   private static int bn = Integer.reverse(-536870912);
   private static long as = Long.reverse(-1861055165105220697L);
   private static int bf = Integer.reverse(1610612736);
   private static int de = Integer.reverse(134217728);
   private static long ay = Long.reverse(-7205759403792793600L);
   private static long ap = Long.reverse(-7205759403792793600L);
   private static int da = 0 >>> 33 | 0 << ~33 + 1;
   private static long bh = Long.reverse(-1861055165105220697L);
   private static long bo = Long.reverse(-1861055165105220697L);
   private static int dh = -1 >>> 211 | -1 << ~211 + 1;
   private static long dc = Long.reverse(8803468752508113831L);
   private static int dk = Integer.reverse(-2013265920);
   private static int bz = Integer.reverse(-1879048192);
   private static int cs = -1 >>> 49 | -1 << ~49 + 1;
   private static long ct = Long.reverse(8803468752508113831L);
   private static int e = 0 >>> 10 | 0 << ~10 + 1;
   private static long cf = Long.reverse(8803468752508113831L);
   private static int az = Integer.reverse(-1610612736);
   private static int cg = (22 >>> 193 | 22 << ~193 + 1) & -1;
   private static int ed = Integer.reverse(1744830464);
   private static int dd = 0 >>> 8 | 0 << -8;
   private static long cp = Long.reverse(-7205759403792793600L);
   private static long cd = Long.reverse(8803468752508113831L);
   private static final Pattern a = Pattern.compile(a(ed, ee));
   private static long ax = Long.reverse(-1861055165105220697L);
   private static long bk = Long.reverse(-7205759403792793600L);
   private static long cz = Long.reverse(8803468752508113831L);
   private static int dn = Integer.reverse(1207959552);
   private static int ec = 771751936 >>> 57 | 771751936 << ~57 + 1;
   private static long ds = Long.reverse(8803468752508113831L);
   private static int aw = (8192 >>> 203 | 8192 << -203) & -1;
   private static int cv = (896 >>> 198 | 896 << -198) & -1;
   private static int bc = Integer.reverse(-1);
   private static int dt = Integer.reverse(671088640);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = (524288 >>> 178 | 524288 << -178) & -1;
   private static int dz = Integer.reverse(0);
   private static long br = Long.reverse(-7205759403792793600L);
   private static int dq = Integer.reverse(-939524096);
   private static int cy = Integer.reverse(-1);
   private static long o = Long.reverse(-1861055165105220697L);
   private static int cr = (109051904 >>> 183 | 109051904 << -183) & -1;
   private static int bl = 0 >>> 32 | 0 << -32;
   private static int db = Integer.reverse(-268435456);
   private static long by = Long.reverse(8803468752508113831L);
   private static int ce = (1280 >>> 103 | 1280 << ~103 + 1) & -1;
   private static String[] ZKM_STR_B = new String[ec];
   private static long am = Long.reverse(-1861055165105220697L);
   private static long dm = Long.reverse(8803468752508113831L);
   private static long di = Long.reverse(8803468752508113831L);
   private static long i;
   private static long dp = Long.reverse(8803468752508113831L);
   private static long aj = Long.reverse(8803468752508113831L);
   private static int dw = Integer.reverse(-1476395008);
   private static int aq = Integer.reverse(-1073741824);
   private static long ck = Long.reverse(-7205759403792793600L);
   private static int bu = 1048576 >>> 209 | 1048576 << ~209 + 1;
   private static long at = Long.reverse(-7205759403792793600L);

   private static void b() {
      i = -1888417748851346329L;
      long var0 = i ^ 7825788260926642256L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(39 + 30),
               (byte)(58 + 25),
               (byte)(25 + 22),
               (byte)(16 + 51),
               (byte)(36 + 30),
               (byte)(42 + 25),
               (byte)(22 + 25),
               80,
               (byte)(56 + 19),
               (byte)(39 + 28),
               (byte)(7 + 76),
               (byte)(39 + 14),
               80,
               (byte)(5 + 92),
               (byte)(34 + 66),
               (byte)(59 + 41),
               (byte)(10 + 95),
               (byte)(27 + 83),
               (byte)(16 + 87)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_110.D("գ՜Չ՚՝՛ՐԻՃՙՃզՇՈցսՉՂօքխըՕՖ", (byte)111, 68);
               ZKM_STR_B[1] = NLoginCore_397.B("ƪưǃƒǂǆǅƬƗǠǑƱǊƱƤơƶơǛƥƧǙưƱ", (byte)111, 66);
               ZKM_STR_B[2] = NLoginCore_141.E("֚ղմ֗ձ֞էվչժ֢֚֠֎ջւ֨ծվհ֦ցվտ", (byte)111, 69);
               ZKM_STR_B[3] = NLoginCore_471.A("ǋƱƓǃǒǗƘǜƩƾǛǘǏǜƼǎƶǃƿǈǃǩưƱ", (byte)111, 65);
               ZKM_STR_B[4] = NLoginCore_471.F("ով֑ՠ\u0590֔֓պե֮֟սռ֞ռ֑֫֒ղֱָ֧վտ", (byte)111, 70);
               ZKM_STR_B[5] = NLoginCore_092.B("ǂƴǕƦƐƻƖƯƪƟƷưƫƿǐƸǤǒƧƥƩƳưƱ", (byte)111, 66);
               ZKM_STR_B[6] = NLoginCore_387.C("ՈՖծԼՊըՖՙբՙՄԾքՐՈնՋաչՎՙըՕՖ", (byte)111, 67);
               ZKM_STR_B[7] = NLoginCore_553.F("֑֦֛֮֗֔֔֒֕֔֠ճ", (byte)111, 70);
               ZKM_STR_B[8] = NLoginCore_471.D("նոշ՜ծսՀՑիօՍՊ", (byte)111, 68);
               ZKM_STR_B[9] = NLoginCore_232.B("ƶǒƫƋǍǇǘƶƦǀǊƥ", (byte)111, 66);
               ZKM_STR_B[10] = NLoginCore_384.D("մ\u0557ջ\u0530սԲԾ՝ս՝ՕՊ", (byte)111, 68);
               ZKM_STR_B[11] = NLoginCore_384.C("՛ծՇՑՍտԻ\u0558՟վճՊ", (byte)111, 67);
               ZKM_STR_B[12] = NLoginCore_183.B("ƠƐƐǄƘǅƤƴƬǠƟƥ", (byte)111, 66);
               ZKM_STR_B[13] = NLoginCore_451.E("ՠ֒պէ֖֥յմ֘՟֦֧ջ\u058c֤֞֟֓ևֱֵָ֔֓֏ֲյ\u058cֹֿ֞ջ֑֒րֲִօֵׇփօּ֞ׄ\u05cd֍\u0590֢׆א\u05ce֕ח֞֟", (byte)111, 69);
               ZKM_STR_B[14] = NLoginCore_530.F("լս֖֒զ֊֫փևքւճ", (byte)111, 70);
               ZKM_STR_B[15] = NLoginCore_433.B("ơǅǆǁƯƗƦƩƔƟǏƶƬǗǡǗǟǑǢƸǉǩưƱ", (byte)111, 66);
               ZKM_STR_B[16] = NLoginCore_141.C("՛շՐ\u0530ղլս՛ՋեկՊ", (byte)111, 67);
               ZKM_STR_B[17] = NLoginCore_521.E("֝ր֤ՙ֦՛էֆ֦ֆվճ", (byte)111, 69);
               ZKM_STR_B[18] = NLoginCore_076.A("ƶǉƢƬƨǚƖƳƺǙǎƥ", (byte)111, 65);
               ZKM_STR_B[19] = NLoginCore_027.A("ƠƐƐǄƘǅƤƴƬǠƟƥ", (byte)111, 65);
               ZKM_STR_B[20] = NLoginCore_127.B("ƒǄƬƙǈǗƧƦǊƑǘǙƭƾǐǑǖǅƹǆǧǪǣǅǁǤƧƾǫǐǱƭǄǃƲǤǦƷǧǹƵƷǮǐǶǿƿǂǔǸȂȀǇȉǐǑ", (byte)111, 66);
               ZKM_STR_B[21] = NLoginCore_387.C("ՃՔթխԽաւ՚՞՛ՙՊ", (byte)111, 67);
               ZKM_STR_B[22] = NLoginCore_553.F(
                  "պցծ֨հՠ֗է֨֬֏եְ֪֞֝քֵ֞և֯ցְֲִ֭֚֓֞֩֯րֳֳֶֿ֚֠׀ׄ֬ׄ\u058c֢֠׆ֻּ֪\u05cb׃\u05cd֢\u05caׄ׃ֱ֛זִ֛֮דמְםֱַֽ׃יׇרס\u05ec\u05eeם\u05ecל\u05eeן\u05cbקץֶץַפ\u05ed\u05fa\u05ed\u05fb\u05ecׯ\u0600\u05cbג\u05f7׀כ\u0602ב׆זו\u05ff\u05fcד",
                  (byte)111,
                  70
               );
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_223.F("\u058cօղփֆքչդլւլթցհ։\u0590ժ֊֑֩\u0590ցվտ", (byte)111, 70);
               ZKM_STR_B[1] = NLoginCore_324.D("ՏՕըԷէիժՑԼօյբՅ՚՜զքՕբ՚՚ՈՋվ֍֎քևՔ\u058bզզ", (byte)111, 68);
               ZKM_STR_B[2] = NLoginCore_451.A("ǌƤƦǉƣǐƙưƫƜǓƘǎƼƳǗǦƢƱƥƜǙưƱ", (byte)111, 65);
               ZKM_STR_B[3] = NLoginCore_027.E("֙տա֑֥֠զ֪շ\u058c֩֟֡և\u0590֫֔կֆ֖\u0590ַֿ֭֕֬֔֩֍ֿ֮֗", (byte)111, 69);
               ZKM_STR_B[4] = NLoginCore_446.D("ՏՕըԷէիժՑԼօնկոյՙփՂսՅՇ֎ը՟ՐրօՑզցո։Ֆ", (byte)111, 68);
               ZKM_STR_B[5] = NLoginCore_004.F("\u0590ւ֣մ՞։դսոխփ֣֏ի֍֨֊ְְֱֻ֢֬֒֬֙֗֜րֲ֮֜", (byte)111, 70);
               ZKM_STR_B[6] = NLoginCore_241.B("ƣƱǉƗƥǃƱƴƽƴƟǋǗǠǠǞƶǧǇƽǄǙưƱ", (byte)111, 66);
               ZKM_STR_B[7] = NLoginCore_553.A("ǐƩƤƥƸǋƶƔƬƖǏƮǙǙǐƿƿƸƟǚǣǙưƱ", (byte)111, 65);
               ZKM_STR_B[8] = NLoginCore_173.D("ՌղՓԶ\u0557լկրԵղճՊ", (byte)111, 68);
               ZKM_STR_B[9] = NLoginCore_397.D("ԹնԴ՞իվտգց՜ճՊ", (byte)111, 68);
               ZKM_STR_B[10] = NLoginCore_471.A("ƨƵƏƔƕƧƩƾƳǙƗƥ", (byte)111, 65);
               ZKM_STR_B[11] = NLoginCore_027.C("յ՚Վ՚\u0557ՐՑմՋՌ՟էՆ՞ՠյփնՕ՜ՈվՕՖ", (byte)111, 67);
               ZKM_STR_B[12] = NLoginCore_521.C("նԻՅՏՠՏՕ\u0557ԺՃճՊ", (byte)111, 67);
               ZKM_STR_B[13] = NLoginCore_324.F("ՠ֒պէ֖֥յմ֘՟֦֧ջ\u058c֤֞֟֓ևֱֵָ֔֓֏ֲյ\u058cֹֿ֞ջ֑֒րֲִօֵׇփօֿ\u05cf֞ׄ֩֫\u058bָׁ֒חֲ׆הכ\u05cbָֹֻׁ֗֬", (byte)111, 70);
               ZKM_STR_B[14] = NLoginCore_559.B("ƬƷƤƪƦǇǇƏƮƝǚƥ", (byte)111, 66);
               ZKM_STR_B[15] = NLoginCore_384.F("կ֓֔֏սեմշբխ֣֞օ\u058bֲվ֪ծճ֏ց֑վտ", (byte)111, 70);
               ZKM_STR_B[16] = NLoginCore_027.E("լ֔՞է֛֘֊մջևխճ", (byte)111, 69);
               ZKM_STR_B[17] = NLoginCore_397.F("֑֙գտօ֪֖֥՞֡նճ", (byte)111, 70);
               ZKM_STR_B[18] = NLoginCore_397.E("֖֝ձոաե֥֡։֢ե֦֪֧֦֡֝ծ֤֮֯ցվտ", (byte)111, 69);
               ZKM_STR_B[19] = NLoginCore_110.E("՝֤֗֔ջ֨ժ֧֕\u058b֤ճ", (byte)111, 69);
               ZKM_STR_B[20] = NLoginCore_384.E("ՠ֒պէ֖֥յմ֘՟֦֧ջ\u058c֤֞֟֓ևֱֵָ֔֓֏ֲյ\u058cֹֿ֞ջ֑֒րֲִօֵׇփօַֿ\u05cdֿ֝օֱ׆\u05ceָׄח֞֟", (byte)111, 69);
               ZKM_STR_B[21] = NLoginCore_553.E("վնս֔ր֞մգդ֡֬ճ", (byte)111, 69);
               ZKM_STR_B[22] = NLoginCore_241.F(
                  "պցծ֨հՠ֗է֨֬֏եְ֪֞֝քֵ֞և֯ցְֲִ֭֚֓֞֩֯րֳֳֶֿ֚֠׀ׄ֬ׄ\u058c֢֠׆ֻּ֪\u05cb׃\u05cd֢\u05caׄ׃ֱ֛זִ֛֮דמְםֱַֽ׃יׇרס\u05ec\u05eeם\u05ecל\u05eeן\u05cbקץֶץַפ\u05ed\u05fa\u05ed\u05fb\u05ecׯ\u0600\u05cbץ\u0603דׂע؊פ\u05f7\u05f6\u05fa\u0600؍ؑ؊ؑؔ\u05cb\u05f6\u05c8ؐؖסמן",
                  (byte)111,
                  70
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.B("ǌƲƒƪƩƤǍƜǚƶƠǙƹǠƴǝǚƽƿǝǡǙưƱ", (byte)111, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.C("ՃՖ\u0558՛տՋաՍԿՁշ՚Փւ՜վՊն֊ռգ\u0558ՕՖ", (byte)111, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 57L;
      var1 ^= 7825788260926642256L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(56 + 12),
                     (byte)(47 + 22),
                     (byte)(79 + 4),
                     (byte)(39 + 8),
                     (byte)(21 + 46),
                     (byte)(14 + 52),
                     (byte)(57 + 10),
                     (byte)(31 + 16),
                     (byte)(51 + 29),
                     (byte)(24 + 51),
                     (byte)(60 + 7),
                     (byte)(19 + 64),
                     53,
                     (byte)(36 + 44),
                     (byte)(36 + 61),
                     (byte)(52 + 48),
                     (byte)(71 + 29),
                     (byte)(39 + 66),
                     (byte)(78 + 32),
                     (byte)(44 + 59)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.C("եղձԴմհիմտծԻչսնչտՁࢶ࣏ࣔ࣍ࣟࣚࢿࣃ", (byte)111, 67));
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
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_472.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_433.C("ӜӾԀӠԄԣԛԱԝӬԪԠԮԨӱԖԸԷԯԵԯԄ", (byte)85, 67), NLoginCore_472.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.E("մցրՃփտպփ֎սՊֈ\u058cօֈ֎Րࣅࣣ࣮ࣩ࣒ࣜࣞ࣎դ", (byte)85, 69) + var1 + NLoginCore_223.A("ţ", (byte)85, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void a(ResultSet var1) {
      String var2 = null;
      int var3 = bl;

      try {
         var2 = var1.getString(a(bn, bo ^ br));
         var3 = a.matcher(var2).matches();
         String var4 = var1.getString(a(bu & bw, by));
         this.a(var2, var4, (var3 != 0));
      } catch (Exception var5) {
         NLoginCore_370.b(
            a(bz & cb, cd)
               + this.a.getName()
               + a(ce, cf)
               + (var2 == null ? a(cg, ci ^ ck) : var2 + a(cm, cn ^ cp))
               + a(cr & cs, ct)
               + var3
               + a(cv & cy, cz),
            var5
         );
      }
   }

   private void a(String var1, String var2, boolean var3) {
      if (var1 != null && var2 != null) {
         UUID var5 = null;
         String var4;
         if (var3) {
            var5 = UUID.fromString(var1);
            OfflinePlayer var6 = this.m.b().<Server>c().getOfflinePlayer(var5);
            var4 = var6.getName();
         } else {
            var4 = var1;
         }

         if (var4 != null) {
            this.a(var4, var2, null, var5);
         }
      }
   }

   @Override
   protected void a(NLoginCore_219 var1) {
      boolean var2 = var1.d(a(ai, aj));
      if (var2) {
         String var3 = var1.b(a(ak, am ^ ap));
         String var4 = var1.b(a(aq, as ^ at));
         String var5 = var1.b(a(aw, ax ^ ay));
         String var6 = var1.b(a(az & bc, be));
         this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var3, var4, var5, var6, new Properties(), NLoginCore_036.d.i()));
         this.P = a(bf, bh ^ bk);
      }
   }

   @Override
   protected void b(NLoginCore_219 var1) {
      NLoginCore_219 var2 = new NLoginCore_219(a(db, dc), this.b());

      for (String var5 : var2.<FileConfiguration>c().getKeys((dd != 0))) {
         boolean var6 = a.matcher(var5).matches();

         try {
            String var7 = var2.b(var5);
            this.a(var5, var7, var6);
         } catch (Exception var11) {
            NLoginCore_370.b(
               a(de & dh, di)
                  + this.a.getName()
                  + a(dk, dm)
                  + (var5 == null ? a(dn & var_do, dp) : var5 + a(dq, ds))
                  + a(dt & du, dv)
                  + var6
                  + a(dw, dy),
               var11
            );
         } finally {
            this.l++;
         }
      }
   }

   public NLoginCore_472(NLoginType_008 var1) {
      super(var1, NLoginCore_479.A, a(e, o ^ p), ((var1.b() != 0).a() == NLoginCore_419.b ? t : z));
   }
}
