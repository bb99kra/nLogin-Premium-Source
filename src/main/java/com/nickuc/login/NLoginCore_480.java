package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.TimerTask;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_480 extends TimerTask {
   private static long g = Long.reverse(-3843463456573280277L);
   private static int c = 0 >>> 244 | 0 << ~244 + 1;
   private static long d = Long.reverse(7829866777571045355L);
   private static int i = (1 >>> 31 | 1 << -31) & -1;
   private static long e = Long.reverse(-6485183463413514240L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_A = new String[NLoginCore_480.h];
   private static long c;
   private static String[] ZKM_STR_B = new String[i];
   private static int b = (0 >>> 60 | 0 << -60) & -1;
   private static int h = Integer.reverse(1073741824);
   private static int f = (4 >>> 162 | 4 << ~162 + 1) & -1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 101L;
      var1 ^= -1051155045409310170L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(63 + 6),
                     (byte)(4 + 79),
                     (byte)(19 + 28),
                     (byte)(17 + 50),
                     (byte)(6 + 60),
                     (byte)(4 + 63),
                     (byte)(28 + 19),
                     80,
                     75,
                     (byte)(52 + 15),
                     (byte)(11 + 72),
                     (byte)(29 + 24),
                     (byte)(2 + 78),
                     (byte)(24 + 73),
                     (byte)(55 + 45),
                     (byte)(64 + 36),
                     (byte)(74 + 31),
                     (byte)(13 + 97),
                     (byte)(60 + 43)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.D("ёўѝРѠќїѠѫњЧѥѩѢѥѫЭ\u07b7߃ުߊޖ߀\u07bf߆\u07bc߅ߑ\u07b3", (byte)19, 68));
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

   NLoginCore_480(NLoginType_018 var1, NLoginCore_277 var2) {
      this.b = var1;
      this.a = var2;
   }

   private static void b() {
      c = -2885536524976089802L;
      long var0 = c ^ -1051155045409310170L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(47 + 22),
               83,
               (byte)(6 + 41),
               (byte)(42 + 25),
               (byte)(43 + 23),
               (byte)(35 + 32),
               (byte)(6 + 41),
               (byte)(31 + 49),
               (byte)(63 + 12),
               67,
               (byte)(52 + 31),
               (byte)(47 + 6),
               (byte)(13 + 67),
               (byte)(61 + 36),
               (byte)(89 + 11),
               (byte)(12 + 88),
               (byte)(24 + 81),
               (byte)(109 + 1),
               (byte)(83 + 20)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.F(
                  "ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՐՔԤԿԖԲՒԲԻԷԛԞԵՎԗԬԭՌեեզՅեՉՂդգբՅեՈԫՀՎկժճԯՊդԱխիհյշԷ\u0558ՌՎԷջՔճֆճշօգփըե՛ւբՌ֍օ֎ֆչգ\u0557՜Տՙոՙւ֊ջձղ֤֤֪֗֒\u058cիռ֥֢֩֞ղ֝֟յֱցձշ֎ֳִֺֻֿ֚֮֔֜սֱ\u0590չ׀\u05ca֪֢֞֨օֽ֘\u05ca֚\u058cֶ֦\u05cf֬֗֘\u05c9הֺֻֽ֖֚֮֨ןִָּ֜וסֿ\u05ebׇ׃ׂ׆יֽרלת\u05ccזֵׁׯׇֺ\u05f6םג\u05fb\u05fb\u0600\u05fdךגװ\u0605ׄ׆ךׂקתש؏\u05ccעכא\u05fbװ؈ؖבט\u05eeؑףד\u05f9ؐ\u0600טؙםؑؔ\u05f6ץ\u05fa\u05feןئ\u0602؈ثءؤخ،ء\u0603؋ءرؖ؉اػؑ؛ثؕػطؙجثؔنؗ\u05f9ؤ؍",
                  (byte)9,
                  70
               );
               ZKM_STR_B[1] = NLoginCore_387.E(
                  "ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՋՇՒԯՒԕԴՑԧԽԾՔԗԶՍՑԣ\u0558ԗՀ՛ԥԵգԷԺԺխԨ՝Աէՠ՝դբՇըձՎշխԸծլսԹմՓկշԽ՜՝բՙ՟թՙթՊքՎ֏֏֒դղլժ\u058c֚գդ\u0558֓լ֜֍֘շ֝մ֣֛֨֞ղշ֧֙֘կ֣֭օհռ֍ֳ֡֨֔մ֙֘֝֊որչց֛֖֟׃֔օ׆ָֹւ׀ֆ֥\u05ce֤\u05c8֭ה֢׃ז֪ד׆בא\u05cf֦֗\u05cd֜יףֻאֱסטׅ\u05c9ךיפ\u05c8װפׁ\u05caהפֱ\u05cc֮וה\u05fb\u05ebֳם\u05ffנמ\u05fdלנװ־׳ֽוס׀\u05cb\u05fb\u05fbן؆\u05ed\u05cd؍סؑץ\u05c8\u05ffט\u0601\u05f7؈\u05f7םקؐןם؍\u05fe\u05eeؕ\u0602ؚ\u05f5\u05f8\u0603\u05f5؟\u0601ؠ\u05feذج؈\u05fb\u05f8\u05f9",
                  (byte)9,
                  69
               );
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.F(
                  "ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՐՔԤԿԖԲՒԲԻԷԛԞԵՎԗԬԭՌեեզՅեՉՂդգբՅեՈԫՀՎկժճԯՊդԱխիհյշԷ\u0558ՌՎԷջՔճֆճշօգփըե՛ւբՌ֍օ֎ֆչգ\u0557՜Տՙոՙւ֊ջձղ֤֤֪֗֒\u058cիռ֥֢֩֞ղ֝֟յֱցձշ֎ֳִֺֻֿ֚֮֔֜սֱ\u0590չ׀\u05ca֪֢֞֨օֽ֘\u05ca֚\u058cֶ֦\u05cf֬֗֘\u05c9הֺֻֽ֖֚֮֨ןִָּ֜וסֿ\u05ebׇ׃ׂ׆יֽרלת\u05ccזֵׁׯׇֺ\u05f6םג\u05fb\u05fb\u0600\u05fdךגװ\u0605ׄ׆ךׂקתש؏\u05ccעכא\u05fbװ؈ؖבט\u05eeؑףד\u05f9ؐ\u0600טؙםؑؔ\u05f6ץ\u05fa\u05feןئ\u0602؈ثءؤخ،ء\u0603؋ءرؖ؉اػؑ؛ثس\u061c\u05fbدتحرؑ؏ؼؠؼإ؆ؠطكغّ؊آثؘؙ",
                  (byte)9,
                  70
               );
               ZKM_STR_B[1] = NLoginCore_223.B(
                  "óØÉÇÜçÎÈðćĄÍßøåČĒÕïíÚėēĞûĞáĀĝóĉĊĠãĂęĝïĤãČħñāįăĆĆĹôĩýĳĬĩİĮēĴĽĚŃĹĄĺĸŉąŀğĻŃĉĨĩĮĥīĵĥĵĖŐĚśśŞİľĸĶŘŦįİĤşĸŨřŤŃũŀůŴŧŪľŃťųŤĻůŹőļňřſŭŴŠŀťŤũŖńŌŅōŧŢūƏŠőƒƅƄŎƌŒűƚŰƔŹƠŮƏƢŶƟƒƝƜƛŲţƙŨƥƯƇƜŽƭƤƑƕƦƥưƔƼưƍƖƠưŽƘźơƠǇƷſƩǋƬƪǉƨƬƼƊƿƉơƭƌƗǇǇƫǒƹƙǙƭǝƱƔǋƤǍǃǔǃƩƳǜƫƩǙǊƺǡǎǦǁǃƨǤǏǧǗǄǨǹǯǇǄǅ",
                  (byte)9,
                  66
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.E("ԦԠԔԝԍԷԕՅӽԀԔԍ", (byte)9, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.C("ЃрыЗьцнЩУфёИ", (byte)9, 67);
         }
      }
   }

   @Override
   public void run() {
      int var1 = NLoginType_018.a(this.b).asMap().remove(this.a) != null ? a : b;
      if (var1 == 0) {
         NLoginCore_277 var2 = NLoginType_018.a(this.b).b().a(this.a.a());
         if (this.a.equals(var2)) {
            this.a.a(NLoginCore_150.j() ? a(c, d ^ e) : a(f, g));
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_480.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.D("ҠӂӄҤӈӧӟӵӡҰӮӤӲӬҵӚӼӻӳӹӳӈ", (byte)65, 68), NLoginCore_480.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_521.A("ŤűŰĳųůŪųžŭĺŸżŵŸžŀӊӖҽӝҩӓӒәӏӘӤӆŘ", (byte)65, 65) + var1 + NLoginCore_027.E("Է", (byte)65, 69) + var2.toString(), var4);
      }
   }
}
