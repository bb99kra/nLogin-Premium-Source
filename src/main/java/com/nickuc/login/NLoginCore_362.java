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

public class NLoginCore_362 extends NLoginCore_098 {
   private static int bw = Integer.reverse(1610612736);
   private static int cg = Integer.reverse(-1);
   private static int y = (2 >>> 129 | 2 << ~129 + 1) & -1;
   private static int da = Integer.reverse(-1342177280);
   private static long o;
   private static long bk = Long.reverse(138974891002463468L);
   private static long ee = Long.reverse(-864691128455135232L);
   private static long es = Long.reverse(-725716237452671764L);
   private static long df = Long.reverse(-864691128455135232L);
   private static int bj = Integer.reverse(536870912);
   private static long at = Long.reverse(-725716237452671764L);
   private static long br = Long.reverse(-864691128455135232L);
   private static long eb = Long.reverse(-725716237452671764L);
   private static int e = Integer.reverse(0);
   private static int m = Integer.reverse(-1);
   private static long dm = Long.reverse(138974891002463468L);
   private static long ct = Long.reverse(-725716237452671764L);
   private static int bd = Integer.reverse(-1073741824);
   private static long bh = Long.reverse(-864691128455135232L);
   private static long di = Long.reverse(-725716237452671764L);
   private static String[] ZKM_STR_B = new String[NLoginCore_362.ex];
   private static long au = Long.reverse(-864691128455135232L);
   private static long dc = Long.reverse(-725716237452671764L);
   private static String[] ZKM_STR_A = new String[NLoginCore_362.eu];
   private static int dh = (458752 >>> 207 | 458752 << -207) & -1;
   private static int dt = (1114112 >>> 176 | 1114112 << ~176 + 1) & -1;
   private static int bl = Integer.reverse(0);
   private static long dv = Long.reverse(-725716237452671764L);
   private static int ek = Integer.reverse(-939524096);
   private static int bz = 114688 >>> 46 | 114688 << ~46 + 1;
   private static long cu = Long.reverse(-864691128455135232L);
   private static long dy = Long.reverse(-864691128455135232L);
   private static long ds = Long.reverse(-864691128455135232L);
   private static long be = Long.reverse(-725716237452671764L);
   private static long ci = Long.reverse(138974891002463468L);
   private static long cz = Long.reverse(138974891002463468L);
   private static int eu = Integer.reverse(-1476395008);
   private static int ce = Integer.reverse(268435456);
   private static int ex = (1342177281 >>> 60 | 1342177281 << -60) & -1;
   private static int cm = 5 >>> 223 | 5 << ~223 + 1;
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int cy = Integer.reverse(-1);
   private static int em = (-1 >>> 71 | -1 << ~71 + 1) & -1;
   private static int cr = 11264 >>> 202 | 11264 << ~202 + 1;
   private static int dk = (245760 >>> 46 | 245760 << -46) & -1;
   private static long cd = Long.reverse(138974891002463468L);
   private static long cp = Long.reverse(-864691128455135232L);
   private static long cn = Long.reverse(-725716237452671764L);
   private static long eo = Long.reverse(138974891002463468L);
   private static int eq = (640 >>> 197 | 640 << ~197 + 1) & -1;
   private static int cb = Integer.reverse(-1);
   private static long ab = Long.reverse(138974891002463468L);
   private static int al = Integer.reverse(1073741824);
   private static long dp = Long.reverse(-725716237452671764L);
   private static long bo = Long.reverse(-725716237452671764L);
   private static int dz = 18 >>> 0 | 18 << -0;
   private static long by = Long.reverse(138974891002463468L);
   private static long et = Long.reverse(-864691128455135232L);
   private static int cv = (3072 >>> 40 | 3072 << ~40 + 1) & -1;
   private static int bi = Integer.reverse(-1);
   private static long dj = Long.reverse(-864691128455135232L);
   private static int dn = 2 >>> 125 | 2 << ~125 + 1;
   private static long p = Long.reverse(138974891002463468L);
   private static int cj = Integer.reverse(-1879048192);
   private static int bn = Integer.reverse(-1610612736);
   private static long ck = Long.reverse(138974891002463468L);

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al, at ^ au), a(bd, be ^ bh)).toLowerCase(Locale.ENGLISH);
      int var4 = bi;
      switch (var2.hashCode()) {
         case -894935028:
            if (var2.equals(a(bj, bk))) {
               var4 = bl;
            }
            break;
         case 104382626:
            if (var2.equals(a(bn, bo ^ br))) {
               var4 = bu;
            }
      }

      switch (var4) {
         case 0:
            File var5 = new File(this.b(), a(bw, by));
            this.d = NLoginCore_586.a(this.m, var5, new Properties());
            break;
         case 1:
            String var6 = var1.a(a(bz & cb, cd), a(ce & cg, ci));
            String var7 = var1.a(a(cj, ck), a(cm, cn ^ cp));
            String var8 = var1.a(a(cr, ct ^ cu), a(cv & cy, cz));
            String var9 = var1.a(a(da, dc ^ df), a(dh, di ^ dj));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var6, var9, var7, var8, new Properties(), NLoginCore_036.d.i()));
            break;
         default:
            throw new IllegalArgumentException(a(dk, dm) + var2);
      }
   }

   private static void b() {
      o = 3972569916917004207L;
      long var0 = o ^ 3338672478239031885L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(38 + 30),
               (byte)(9 + 60),
               (byte)(43 + 40),
               (byte)(39 + 8),
               (byte)(57 + 10),
               66,
               (byte)(13 + 54),
               (byte)(44 + 3),
               (byte)(43 + 37),
               (byte)(61 + 14),
               (byte)(61 + 6),
               (byte)(16 + 67),
               (byte)(23 + 30),
               (byte)(34 + 46),
               (byte)(72 + 25),
               (byte)(18 + 82),
               (byte)(11 + 89),
               (byte)(91 + 14),
               110,
               (byte)(62 + 41)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_241.B("êĒÜùĎāÿþĤô÷çĤāğçĂąèĂðċøù", (byte)19, 66);
               ZKM_STR_B[1] = NLoginCore_223.F("ӿՇԃԜԾԟԋՁՅԜԚԗ", (byte)19, 70);
               ZKM_STR_B[2] = NLoginCore_553.A("ĊĈĈáû÷âďþĤöøĤõĉĤīġĪèĄġøù", (byte)19, 65);
               ZKM_STR_B[3] = NLoginCore_521.A("ĝĠÙĢøÞğģï÷Ąí", (byte)19, 65);
               ZKM_STR_B[4] = NLoginCore_241.C("ѦѩТѫсЧѨѬирэж", (byte)19, 67);
               ZKM_STR_B[5] = NLoginCore_004.C("ѦхѥѪЩіьќѥрѯж", (byte)19, 67);
               ZKM_STR_B[6] = NLoginCore_127.F("ԶԥԪԫԥԸՆԢԨԟԼԗ", (byte)19, 70);
               ZKM_STR_B[7] = NLoginCore_427.D("ѓёёЪфрЫјчѭрќэющоьѨдюыњщѷҀѸњџҁѴнѼёҁѕ҈ыѸѽрќҐѝі", (byte)19, 68);
               ZKM_STR_B[8] = NLoginCore_201.B("öĎýùđčöÿĢæÚùõúÞċĊùĄĞİûøù", (byte)19, 66);
               ZKM_STR_B[9] = NLoginCore_223.E("ԴԲԲԋԥԡԌԹԨՎԡԽԮԯԪԟԭՉԕԯԬԽԙՒՌԪ՜ԚդԷՁԺ\u0530ԷԼԧՕԹԶաՄԧԭԷ", (byte)19, 69);
               ZKM_STR_B[10] = NLoginCore_521.D("едќмгѭшЪѬяаж", (byte)19, 68);
               ZKM_STR_B[11] = NLoginCore_451.D("ѓёёЪфрЫјчѭрќэющоьѨдюыѦњѮѨѹкѪҁѸҁсц҃ѻ҅ѡчпѧўэҏі", (byte)19, 68);
               ZKM_STR_B[12] = NLoginCore_138.F("ԖԕԽԝԔՎԩԋՍ\u0530ԑԗ", (byte)19, 70);
               ZKM_STR_B[13] = NLoginCore_183.B("ĊĈĈáû÷âďþĤ÷ēĄąĀõăğëąĂčąĂįĒêČôĳĖùľĩĸċĸĵľĕĲĘÿč", (byte)19, 66);
               ZKM_STR_B[14] = NLoginCore_446.B("êçČĒùėâøÝðøí", (byte)19, 66);
               ZKM_STR_B[15] = NLoginCore_451.F("ԷԢԜԴԕԡՊԋԭԬԩՔՈԬԧՖԴԮՄԲԛՒ՟ԚԗԷԔԲԹ\u0558զԦՄՕ\u0558ՕՠԿՃթկՠդԷ", (byte)19, 70);
               ZKM_STR_B[16] = NLoginCore_127.A("ØĒĕĚĐùãēâĞĨÛĥëĆăĤÿçüýıøù", (byte)19, 65);
               ZKM_STR_B[17] = NLoginCore_027.E("ԨՄԥՊԼԭՎՁՆՌԋՔՕՕ\u0557ՃԹՓԦՙԯԵԢԣ", (byte)19, 69);
               ZKM_STR_B[18] = NLoginCore_387.D("жХєтѫєнцѠцхж", (byte)19, 68);
               ZKM_STR_B[19] = NLoginCore_027.F("ԐԖԄԫԬԝԊԉԍԡԍԗ", (byte)19, 70);
               ZKM_STR_B[20] = NLoginCore_521.A("çÜýÿÞĕĥĥĕĈĂõøĀĜĤęêîĢĭûøù", (byte)19, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_324.B("êĒÜùĎāÿþĤôôôôèìģ÷ďěíģıøù", (byte)19, 66);
               ZKM_STR_B[1] = NLoginCore_092.B("ñęġĂÞĖàĚħßãßÜĞĘğĢĎĨāĪûøù", (byte)19, 66);
               ZKM_STR_B[2] = NLoginCore_076.D("ѓёёЪфрЫјчѭпЯђфЬѭьфЯшќйѬьзѻѺѵњжѸс", (byte)19, 68);
               ZKM_STR_B[3] = NLoginCore_433.F("ԿԘԥԷԣԤԌԤԦԝԉԮԌԟԱԨԬՖԲԱՐՋԢԣ", (byte)19, 70);
               ZKM_STR_B[4] = NLoginCore_453.E("ԸԥՅԙԡԞԞՃԤԥԑԽՊ\u0530ԑԳԗՕԪ\u0558ՉԥԢԣ", (byte)19, 69);
               ZKM_STR_B[5] = NLoginCore_433.F("ԣԛԾԵԫԝՀԛՐԞԈՁԦՍԡԱՏՓԘԼԭՋԢԣ", (byte)19, 70);
               ZKM_STR_B[6] = NLoginCore_076.B("çćöčàîáąħėĒùćõĤìĊĤěîĀċøù", (byte)19, 66);
               ZKM_STR_B[7] = NLoginCore_004.E("ԴԲԲԋԥԡԌԹԨՎԡԽԮԯԪԟԭՉԕԯԬԻԪ\u0558աՙԻՀբՕԞ՝\u0557ՊԴԨԴԨՁԡժՈլԷ", (byte)19, 69);
               ZKM_STR_B[8] = NLoginCore_110.F("ԠԸԧԣԻԷԠԩՌԐԈԋԊԌԩԪ\u0558ՌՃԩՒԙԖԙՊԮ\u0558՜՟գԹՑ", (byte)19, 70);
               ZKM_STR_B[9] = NLoginCore_530.A("ĊĈĈáû÷âďþĤ÷ēĄąĀõăğëąĂēïĨĢĀĲðĺčėĐĶ÷ĨĘďĽŃĠøùĐč", (byte)19, 65);
               ZKM_STR_B[10] = NLoginCore_387.C("яногчЬѡЦћљхж", (byte)19, 67);
               ZKM_STR_B[11] = NLoginCore_384.D("ѓёёЪфрЫјчѭрќэющоьѨдюыѦњѮѨѹкѪҁѸҁснѨѝџћѴѫшѢѧ҈ыҎѴяѭѪҕ҅ҕѶҊѡѢ", (byte)19, 68);
               ZKM_STR_B[12] = NLoginCore_110.E("ՁԳԗՀԝԕԩԸԣԃԱԮԎԝԨՓԖՄՒ՚ԷՋԢԣ", (byte)19, 69);
               ZKM_STR_B[13] = NLoginCore_173.C("ѓёёЪфрЫјчѭрќэющоьѨдюыіюыѸћгѕнѼџтѯџѢуј҃ѢҏѺѽѣѿѧғы҂ҕҏѭ҇ҙѤѡѢ", (byte)19, 67);
               ZKM_STR_B[14] = NLoginCore_091.D("њЦзќоѭѦѝоѢаж", (byte)19, 68);
               ZKM_STR_B[15] = NLoginCore_173.A("čøòĊë÷ĠáăĂÿĪĞĂýĬĊĄĚĈñĨĵðíčêĈďĮļüĕĩ÷ĻğĐŅĭİÿņč", (byte)19, 65);
               ZKM_STR_B[16] = NLoginCore_397.B("ØĒĕĚĐùãēâĞĨēĜééèħĂùĞíûøù", (byte)19, 66);
               ZKM_STR_B[17] = NLoginCore_521.F("ԨՄԥՊԼԭՎՁՆՌԌԢԾԩԿՎԣՃՙԵՓՋԢԣ", (byte)19, 70);
               ZKM_STR_B[18] = NLoginCore_446.D("хјгїыѩѦѭўѤэж", (byte)19, 68);
               ZKM_STR_B[19] = NLoginCore_092.D("СквѢѓсѩѠЫѥйаќђўтѱяиѩйєст", (byte)19, 68);
               ZKM_STR_B[20] = NLoginCore_521.F("ԑԆԧԩԈԿՏՏԿԲԭԲԯՁՓԣԫՋԭԺԱԥԢԣ", (byte)19, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_141.C("втѩћпќѕяѡсџж", (byte)19, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_223.D("іїсѫеХїкЮцѣж", (byte)19, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_362.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.F("ԂԤԦԆԪՉՁ\u0557ՃԒՐՆՔՎԗԼ՞՝Օ՛ՕԪ", (byte)30, 70), NLoginCore_362.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.D("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߛ߇ߝ߉ߌ߀ߦߐ߃ߒѤ", (byte)30, 68) + var1 + NLoginCore_201.A("õ", (byte)30, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void b(ResultSet var1) {
      String var2 = var1.getString(a(dn, dp ^ ds));
      String var3 = var1.getString(a(dt, dv ^ dy));
      String var4 = var1.getString(a(dz, eb ^ ee));
      UUID var5 = NLoginCore_432.c(var1.getString(a(ek & em, eo)));
      this.a(var2, a(eq, es ^ et) + var3, var4, var5, null);
   }

   public NLoginCore_362(NLoginType_008 var1) {
      super(var1, NLoginCore_479.s, a(e & m, p), a(y, ab));
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 47L;
      var1 ^= 3338672478239031885L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     69,
                     (byte)(48 + 35),
                     (byte)(23 + 24),
                     (byte)(57 + 10),
                     (byte)(7 + 59),
                     (byte)(60 + 7),
                     (byte)(20 + 27),
                     (byte)(32 + 48),
                     (byte)(14 + 61),
                     (byte)(15 + 52),
                     (byte)(76 + 7),
                     (byte)(23 + 30),
                     (byte)(70 + 10),
                     (byte)(24 + 73),
                     (byte)(23 + 77),
                     (byte)(16 + 84),
                     (byte)(95 + 10),
                     110,
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(56 + 27)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬ߹ߥ\u07fbߧߪߞࠄ߮ߡ߰", (byte)40, 67));
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
