package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;

final class NLoginCore_281 implements NLoginInterface_026 {
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int j = (16384 >>> 238 | 16384 << -238) & -1;
   private static int w = Integer.reverse(536870912);
   private static long aa = Long.reverse(3715705314997295207L);
   private final NLoginCore_089 a;
   private static int ah = 1879048192 >>> 220 | 1879048192 << ~220 + 1;
   private static int am = Integer.reverse(268435456);
   private static int i = 0 >>> 116 | 0 << ~116 + 1;
   private static int ap = Integer.reverse(-1879048192);
   private static long o = Long.reverse(3715705314997295207L);
   private static int z = Integer.reverse(-1610612736);
   private static int ae = 786432 >>> 81 | 786432 << -81;
   private static long aq = Long.reverse(3715705314997295207L);
   private static int e = Integer.reverse(0);
   private static int g = Integer.reverse(-1342177280);
   private static long af = Long.reverse(3715705314997295207L);
   private static int ax = (22528 >>> 235 | 22528 << ~235 + 1) & -1;
   private static int as = Integer.reverse(1342177280);
   private static long p = Long.reverse(3746994889972252672L);
   private static long d = Long.reverse(3746994889972252672L);
   private static long b = Long.reverse(3715705314997295207L);
   private static long y = Long.reverse(545171177328466023L);
   private static long u = Long.reverse(545171177328466023L);
   private static int a = (0 >>> 37 | 0 << -37) & -1;
   private static String[] b = new String[NLoginCore_281.ay];
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int al = 2048 >>> 11 | 2048 << -11;
   private static long ar = Long.reverse(3746994889972252672L);
   private static int aw = 256 >>> 136 | 256 << ~136 + 1;
   private static String[] a = new String[ax];
   private static int v = Integer.reverse(0);
   private static int m = Integer.reverse(0);
   private static int t = Integer.reverse(-1073741824);
   private static long r = Long.reverse(3715705314997295207L);
   private static long an = Long.reverse(3715705314997295207L);
   private static long at = Long.reverse(3715705314997295207L);
   private static int av = Integer.reverse(0);
   private static long c;
   private static long ai = Long.reverse(3715705314997295207L);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long ag = Long.reverse(3746994889972252672L);
   private static int ak = 0 >>> 117 | 0 << ~117 + 1;
   private static long s = Long.reverse(3746994889972252672L);
   private static int k = (8912896 >>> 147 | 8912896 << -147) & -1;
   private static int ac = 0 >>> 223 | 0 << ~223 + 1;
   private static long aj = Long.reverse(3746994889972252672L);
   private static int q = 512 >>> 72 | 512 << ~72 + 1;
   private static long au = Long.reverse(3746994889972252672L);
   private static int l = 128 >>> 231 | 128 << ~231 + 1;
   private static long ao = Long.reverse(3746994889972252672L);
   private static int ay = (5767168 >>> 211 | 5767168 << -211) & -1;
   private static long ab = Long.reverse(3746994889972252672L);
   private static int x = Integer.reverse(-1);

   @Override
   public void T() {
      this.a.T();
   }

   @Override
   public NLoginCore_364 a() {
      Server var1 = this.a.a();
      return new NLoginCore_364(
         var1.getName(),
         var1.getVersion(),
         a(n, o ^ p) + var1.getBukkitVersion() + a(q, r ^ s) + var1.getVersion(),
         NLoginCore_419.b,
         NLoginCore_165.a().O()
      );
   }

   @Override
   public void j() {
      this.a.j();
   }

   @Override
   public NLoginInterface_013 b() {
      return (NLoginInterface_013)(NLoginCore_409.a().a(NLoginCore_409.b) && NLoginCore_298.a(a(a, b ^ d))
         ? new NLoginCore_385(this.a, this.a.a())
         : new NLoginCore_507(this.a, this.a.a()));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_281.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_076.D("ӊӬӮӎӲԑԉԟԋӚԘԎԜԖӟԄԦԥԝԣԝӲ", (byte)79, 68), NLoginCore_281.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.C("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡳࡈ\u086fࡳࡗ\u086dࡌࡾࢃࡷࡷࡱࡧӺ", (byte)79, 67) + var1 + NLoginCore_110.D("Ӝ", (byte)79, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public NLoginInterface_013 a() {
      return new NLoginCore_239(this.a);
   }

   @Override
   public void V() {
      try {
         if (NLoginCore_409.a().a(NLoginCore_409.s)) {
            NLoginCore_409.a();
            NLoginInterface_033.a();
            NLoginInterface_001.a();
            NLoginCore_165.a();
            NLoginCore_194.values();
            NLoginCore_049.ae();
         }

         NLoginCore_012.a(this.a);
      } catch (Throwable var2) {
         throw new RuntimeException(a(t, u), var2);
      }
   }

   private static void b() {
      c = -1865740973721843252L;
      long var0 = c ^ 8607246087622158612L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(22 + 46),
               (byte)(59 + 10),
               (byte)(47 + 36),
               (byte)(12 + 35),
               (byte)(32 + 35),
               (byte)(59 + 7),
               (byte)(9 + 58),
               (byte)(18 + 29),
               (byte)(11 + 69),
               (byte)(10 + 65),
               (byte)(4 + 63),
               (byte)(6 + 77),
               (byte)(12 + 41),
               (byte)(25 + 55),
               (byte)(61 + 36),
               (byte)(47 + 53),
               (byte)(16 + 84),
               105,
               110,
               (byte)(14 + 89)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.D("ԐԐԯԴԒՂՄԁԣӿԓԦԋԽԞԼԈԚՌ\u0530ԌԆԱԟԫ\u0558ՖԨԒՎԪԴ\u0557ԫ՜ԜաԖԺԶԦԞգԦԪՊԺծգԯծՋՀՋԫյԯՅՙՏՏԸվ՟ԾԺԺՍիվտԸւ՞ժՉ։՜ֈւվ՝՞Տվլՙ՚", (byte)91, 68);
               b[1] = NLoginCore_471.D("ԲԴӳԣԴԝԂԐՂԀԳԣԼԟԥՇՆՈԭՒՉՂԙԚ", (byte)91, 68);
               b[2] = NLoginCore_201.B("ƟŧƟƭžƉŦŭƢƩŶƕƥƱƽƷƎƴƬƋƏƱƈƉ", (byte)91, 66);
               b[3] = NLoginCore_427.A("ƦūƃţƌƇƵſƐŶƍƄŰƨƱŵƒƇƺƻƒŹſǃǆƾǁǁǈƦƉƉǍƉǊƍƼƟƳƔǇǖǙǃƪǓǌƏǌƷǉǑƷƫƨƩ", (byte)91, 65);
               b[4] = NLoginCore_397.A("ƦūƃţƌƇƵſƐŶƍơųƋƧŽżƔǀƑƓƶƄơƳƨƖƸƆƴƈƵƾƺƨƉƍǏǒƋǒƳǀǐǆǜǝǑƼƹƱơƛǢƶǓƳƦƢƺǗǣǔƽǎƭƩƩǝǬǧǵǟǑǁǋǵǥǚǧǪǚǿƼǹǱǈǉ", (byte)91, 65);
               b[5] = NLoginCore_384.D("ԹԲԘӽԲԸԅԚԀԈԿԎ", (byte)91, 68);
               b[6] = NLoginCore_092.A("ƆƜƜžŤƢƁƊƧŰƘŽ", (byte)91, 65);
               b[7] = NLoginCore_138.C(
                  "ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՒՅէՂէՃԧՎՙՈՋեէՆԮՖՊծզ\u0558Ռտճ\u0557ՏՕւԺՐՂշՂՁՄ֊չծւպոէՏ՞ցդՏհ֑գի֑ժ\u0558֜", (byte)91, 67
               );
               b[8] = NLoginCore_553.E("րքփբՔփժեծՔժչ՛֛Ք֛ը֢֣֝֜՛֣յր֧֓֡վժփք", (byte)91, 69);
               b[9] = NLoginCore_223.A(
                  "ƦūƃţƌƇƵſƐŶƍơųƋƧŽżƔǀƑƓƶƄơƳƨƖƸƆƴƈƵƾƺƨƉƍǏǒƋǒƳǀǆǂǄƶƴǜƛƗƴƯǤǒǑƣǣƼƻƻǥǦǥǀǙǑǑǂǈƮǠưǊưǳǪǇǲǧǬǐǊǐƾǑƼǾǦǕǛǪǽǚǤȎǫǞǙǚǍǌǧǬȅǏǬȘǫǬǸȋǻǻǞǯȘȑǨǩ", (byte)91, 65
               );
               b[10] = NLoginCore_397.D("ԹԲԘӽԲԸԅԚԀԈԿԎ", (byte)91, 68);
               break;
            case 1:
               b[0] = NLoginCore_451.F(
                  "աարօգ֓֕ՒմՐդշ՜֎կ֍ՙի֝ց՝\u0557ւհռ֧֩չգ֟ջօ֨ռ֭խֲէ\u058bևշկִշջ֛\u058bִֿրֿ֑֜֜ռ׆ր֖֪֠֠։\u05cfְ֏\u058b\u058bּ֞\u05cfא։דֻׅ֦֖֯֔֫\u05c9֮׀ובד֪֫",
                  (byte)91,
                  70
               );
               b[1] = NLoginCore_427.E("փօՄմօծՓա֓Ցֆյ։֗ծ֗֡֠մ՛խխժի", (byte)91, 69);
               b[2] = NLoginCore_232.A("ƟŧƟƭžƉŦŭƢƩŶŲƇƸƝƉƳƭƯƍƺƋƈƉ", (byte)91, 65);
               b[3] = NLoginCore_451.C("ԷӼԔӴԝԘՆԐԡԇԞԕԁԹՂԆԣԘՋՌԣԊԐՔ\u0557ՏՒՒՙԷԚԚ՞Ԛ՛ԞՍ\u0530Մԥ\u0558էըԳՀ՞ԶԧՆՑբԾժղԹԺ", (byte)91, 67);
               b[4] = NLoginCore_138.E(
                  "ֈՍեՅծթ֗աղ\u0558կփՕխ։՟՞ն֢ճյ֘զփ֕֊ո֚ը֖ժ֗֠֜֊իկֱִխֲִ֢֕֨־ֳֿ֛֞֓փսֵׄ֘֕ֈքְֶֹׅ֜֟֏\u058b\u058bֿ\u05ce\u05c9חֳׁ֥זל֮֙מ֯\u05caן֯\u05cd֪֭֫", (byte)91, 69
               );
               b[5] = NLoginCore_110.A("ŧƝƥƆŰƏűƒƱũƀŽ", (byte)91, 65);
               b[6] = NLoginCore_092.C("ԙԺԡՁԝԱԺԦԦՄԷԘԉՌՉԠԛՑԇԚԪՂԙԚ", (byte)91, 67);
               b[7] = NLoginCore_027.C(
                  "ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՒՅէՂէՃԧՎՙՈՋեէՆԮՖՊծզ\u0558Ռտճ\u0557ՏՕւԺՐՂշՂՁՄ֊չծւպոէՏ՞րօ֍տ֑էմկ֛֚֍թ֠՛Քշ֓՟ք֣֔֜ծ", (byte)91, 67
               );
               b[8] = NLoginCore_173.F("րքփբՔփժեծՔժչ՛֛Ք֛ը֢֣֦֝֜֠ց֒յ֧֒֬լջքլ֤ըջռ֎\u0590ն֭ձָտ", (byte)91, 70);
               b[9] = NLoginCore_530.C(
                  "ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՑ\u0557ՓՕՇՅխԬԨՅՀյգբԴմՍՌՌնշնՑժբբՓՙԿձՁ՛Ձքջ\u0558փոսա՛աՏբՍ֏շզլջ֎իյ֟ռկժի՞՝ոս֖ՠտջժ֭ռֆր\u0590ւ֓֩\u058cչպ",
                  (byte)91,
                  67
               );
               b[10] = NLoginCore_092.F("\u0558ձՒ֎տ֒ճՕկ֚֘՟", (byte)91, 70);
               break;
            case 2:
               b[0] = NLoginCore_446.F("Ս֎Չձցրկտշեթպպժէռ֞֝չՕռ֣֥֙եթֆ\u058c֧ռ֧֗", (byte)91, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_427.D("ӷԙԼӼӺԴӾԟӿԣՅԶԣԤԼԷ\u0530ՇՆԠԎՂԙԚ", (byte)91, 68);
         }
      }
   }

   @Override
   public NLoginInterface_047 a() {
      return new NLoginCore_120(this.a);
   }

   @Override
   public NLoginInterface_040 a() {
      Server var1 = this.a.a();
      return new NLoginCore_574(this.a, var1, NLoginCore_358.a(var1, var1.getConsoleSender()));
   }

   private static String a(int var0, long var1) {
      var1 ^= 44L;
      var1 ^= 8607246087622158612L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(62 + 6),
                     69,
                     (byte)(17 + 66),
                     (byte)(14 + 33),
                     (byte)(53 + 14),
                     (byte)(52 + 14),
                     (byte)(21 + 46),
                     (byte)(12 + 35),
                     (byte)(40 + 40),
                     (byte)(39 + 36),
                     (byte)(47 + 20),
                     (byte)(39 + 44),
                     (byte)(41 + 12),
                     (byte)(77 + 3),
                     (byte)(19 + 78),
                     100,
                     (byte)(36 + 64),
                     (byte)(23 + 82),
                     (byte)(59 + 51),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.C("юћњНѝљєѝѨїФѢѦџѢѨЪ\u07bcޑ\u07b8\u07bcޠ\u07b6ޕ߇ߌ߀߀\u07baް", (byte)18, 67));
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

   @Override
   public NLoginInterface_022 a(boolean var1) {
      return (NLoginInterface_022)(NLoginCore_012.V() ? new NLoginCore_380(this.a.a(), var1) : new NLoginCore_540(this.a.a(), var1));
   }

   @Generated
   public NLoginCore_281(NLoginCore_089 var1) {
      this.a = var1;
   }

   @Override
   public NLoginInterface_034[] a() {
      return this.a.a();
   }

   static {
      b();
   }

   @Override
   public void i() {
      this.a.i();
   }

   @Override
   public boolean e(String var1) {
      int var2 = v;
      PluginDescriptionFile var3 = this.a.a().getDescription();
      if (!var3.getName().equals(var1)) {
         NLoginCore_370.d(a(w & x, y) + this.a.a().getName() + a(z, aa ^ ab));
         var2 = ad;
      }

      if (!var3.getAuthors().contains(a(ae, af ^ ag))) {
         NLoginCore_370.d(a(ah, ai ^ aj));
         var2 = al;
      }

      if (var3.getWebsite() != null && !var3.getWebsite().equals(a(am, an ^ ao))) {
         NLoginCore_370.d(a(ap, aq ^ ar) + var3.getWebsite() + a(as, at ^ au));
         var2 = aw;
      }

      return (boolean)var2;
   }

   @Override
   public void U() {
      NLoginCore_409 var1 = NLoginCore_409.a();
      int var2 = var1.e() == f && var1.f() <= g ? h : i;
      int var3 = var1.e() == j && var1.f() <= k ? l : m;
      NLoginCore_370.a(this.a, (boolean)var2, (boolean)var3);
   }

   @Override
   public void O() {
      this.a.O();
   }
}
