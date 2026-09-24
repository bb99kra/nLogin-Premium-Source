package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.UserConnection;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.ServerKickEvent;
import net.md_5.bungee.api.event.SettingsChangedEvent;
import net.md_5.bungee.api.event.TabCompleteEvent;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.protocol.packet.ClientSettings;

public class NLoginCore_078 implements NLoginInterface_046 {
   private static int ao = Integer.reverse(-805306368);
   private static long w = Long.reverse(-5908722711110090752L);
   private static int q = (376 >>> 67 | 376 << ~67 + 1) & -1;
   private static long bh = Long.reverse(-5908722711110090752L);
   private static long c;
   private static long bt = Long.reverse(246318313503294851L);
   private static int bp = Integer.reverse(0);
   private static long bx = Long.reverse(-5950634773758507645L);
   private static int bn = Integer.reverse(0);
   private static int bi = (131072 >>> 241 | 131072 << ~241 + 1) & -1;
   private static int by = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(246318313503294851L);
   private static long g = Long.reverse(-5908722711110090752L);
   private static int a = (0 >>> 254 | 0 << -254) & -1;
   private static int ah = 0 >>> 217 | 0 << ~217 + 1;
   private static int cb = Integer.reverse(-939524096);
   private static long an = Long.reverse(-5950634773758507645L);
   private static int h = 64 >>> 70 | 64 << -70;
   private static int af = Integer.reverse(268435456);
   private static int bq = ('밀' >>> '\n' | 48128 << -10) & -1;
   private static int bv = Integer.reverse(0);
   private static int bb = (67108864 >>> 90 | 67108864 << -90) & -1;
   private static long ax = Long.reverse(-5908722711110090752L);
   private static long at = Long.reverse(-5908722711110090752L);
   private static int n = Integer.reverse(-1073741824);
   private static int am = (-1610612736 >>> 252 | -1610612736 << -252) & -1;
   private static long aq = Long.reverse(-5950634773758507645L);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int bf = 480 >>> 101 | 480 << -101;
   private static long ag = Long.reverse(-5950634773758507645L);
   private static long t = Long.reverse(-5908722711110090752L);
   private static long k = Long.reverse(-5950634773758507645L);
   private static int az = -1 >>> 178 | -1 << ~178 + 1;
   private static long ba = Long.reverse(-5950634773758507645L);
   private static int bo = 0 >>> 140 | 0 << ~140 + 1;
   private static long as = Long.reverse(246318313503294851L);
   private static long bg = Long.reverse(246318313503294851L);
   private static int y = Integer.reverse(0);
   private static int br = (0 >>> 34 | 0 << ~34 + 1) & -1;
   private static int ar = Integer.reverse(805306368);
   private static long i = Long.reverse(-5950634773758507645L);
   private static long v = Long.reverse(246318313503294851L);
   private static int be = Integer.reverse(-201326592);
   private static String[] a = new String[NLoginCore_078.ca];
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(-1610612736);
   private static int bd = Integer.reverse(0);
   private static int j = 4096 >>> 75 | 4096 << ~75 + 1;
   private static int ac = 939524096 >>> 123 | 939524096 << -123;
   private static int p = Integer.reverse(0);
   private static int bs = 71303168 >>> 150 | 71303168 << ~150 + 1;
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(0);
   private static int l = (0 >>> 111 | 0 << -111) & -1;
   private final nLoginBungee c;
   private static int bc = Integer.reverse(0);
   private static long al = Long.reverse(-5908722711110090752L);
   private static int ay = Integer.reverse(1879048192);
   private static int z = (3 >>> 255 | 3 << ~255 + 1) & -1;
   private static long aw = Long.reverse(246318313503294851L);
   private static long bu = Long.reverse(-5908722711110090752L);
   private static int r = Integer.reverse(536870912);
   private static int bj = 0 >>> 138 | 0 << -138;
   private static int ca = (1245184 >>> 144 | 1245184 << -144) & -1;
   private static long ak = Long.reverse(246318313503294851L);
   private static int au = 0 >>> 96 | 0 << -96;
   private static long bm = Long.reverse(-5950634773758507645L);
   private static int bz = Integer.reverse(0);
   private static int ap = Integer.reverse(-1);
   private final NLoginType_008 B;
   private static long ad = Long.reverse(246318313503294851L);
   private static long ab = Long.reverse(-5908722711110090752L);
   private static int b = (12032 >>> 232 | 12032 << -232) & -1;
   private static long s = Long.reverse(246318313503294851L);
   private static long ae = Long.reverse(-5908722711110090752L);
   private static int av = (54525952 >>> 54 | 54525952 << -54) & -1;
   private static int bl = -1 >>> 78 | -1 << ~78 + 1;
   private static int bk = Integer.reverse(134217728);
   private static long aa = Long.reverse(246318313503294851L);
   private static int bw = Integer.reverse(1207959552);
   private static int d = 268435456 >>> 156 | 268435456 << -156;
   private static int aj = Integer.reverse(-1879048192);
   private static long o = Long.reverse(-5950634773758507645L);
   private static int c = (16384 >>> 174 | 16384 << ~174 + 1) & -1;
   private static String[] b = new String[cb];

   @EventHandler(
      priority = 127
   )
   public void b(ChatEvent var1) {
      if (var1.isCancelled() && this.a(var1.getMessage())) {
         var1.setCancelled((boolean)bc);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_078.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_201.F("ՇթիՋկ֎ֆ֜ֈ\u0557֕\u058b֙֓՜ց֣֢֚֚֠կ", (byte)99, 70), NLoginCore_078.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_521.D("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢳࢶࢺࢦࢪࢷࢩࢾࢿ\u0893ࢱࢬࢼԶ", (byte)99, 68) + var1 + NLoginCore_384.E("ՙ", (byte)99, 69) + var2.toString(), var4
         );
      }
   }

   @EventHandler(
      priority = -64
   )
   public void a(ChatEvent var1) {
      if (!var1.isCancelled()) {
         Connection var2 = var1.getSender();
         if (var2 instanceof ProxiedPlayer) {
            String var3 = var1.getMessage().trim();
            if (!var3.isEmpty()) {
               ProxiedPlayer var4 = (ProxiedPlayer)var2;

               try {
                  NLoginCore_277 var5 = this.c.b().a(var4);
                  if (var5.S()) {
                     return;
                  }

                  if (var3.charAt(a) == b) {
                     String var6 = this.B.b().a(var5, var3);
                     if (var6 == null) {
                        var1.setCancelled((boolean)c);
                        return;
                     }

                     if (!var3.equals(var6)) {
                        var1.setMessage(var6);
                     }
                  } else if (this.B.b().a(this.c.b().a(var4), var3)) {
                     var1.setCancelled((boolean)d);
                  }
               } catch (Throwable var7) {
                  NLoginCore_370.c(a(e, f ^ g) + var1.getClass().getSimpleName() + a(h, i) + var4.getName() + a(j, k), var7);
                  var1.setCancelled((boolean)m);
                  var4.disconnect(TextComponent.fromLegacyText(a(n, o)));
               }
            }
         }
      }
   }

   private static void b() {
      c = -4494152216305150272L;
      long var0 = c ^ 4695241207512435355L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(4 + 64),
               (byte)(65 + 4),
               (byte)(51 + 32),
               (byte)(45 + 2),
               (byte)(21 + 46),
               (byte)(5 + 61),
               (byte)(41 + 26),
               47,
               (byte)(60 + 20),
               (byte)(39 + 36),
               (byte)(31 + 36),
               (byte)(37 + 46),
               (byte)(9 + 44),
               (byte)(69 + 11),
               (byte)(27 + 70),
               (byte)(22 + 78),
               (byte)(14 + 86),
               (byte)(52 + 53),
               (byte)(14 + 96),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_559.C("ծ՟ՠ֑՝Սծ֑մ՟\u058b֎ղ֘էլղխ՞թ՝բհց֥՞ո֓պ֟։ջ", (byte)117, 67);
               b[1] = NLoginCore_141.C("րՖ\u0590ձ՚՜֍\u058c֔մ\u0590\u0558Ւ֕հՓձ՞\u0557֞\u058bժէը", (byte)117, 67);
               b[2] = NLoginCore_076.E("֖ւզո֫ժ֦տ֪֦֔չ", (byte)117, 69);
               b[3] = NLoginCore_521.D(
                  "ր՛։\u058cօՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓\u058c\u0590կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ\u05c8ִּם֠חפסֽכׂש֤", (byte)117, 68
               );
               b[4] = NLoginCore_173.B("ǟƶǣƣǆưǥƾǈǉǈǡƼǤǋǋǂǴǥǓǅǅǫǦǰǛǒǈǘǕƾǴ", (byte)117, 66);
               b[5] = NLoginCore_232.E("ֆ։ըְ֭֝պպ֢ժ։ֳ֯ղ֥֘֎֤֧־֞֗քօ", (byte)117, 69);
               b[6] = NLoginCore_232.B("ǃƴƵǦƲƢǃǦǉƴǠǣǇǭƼǁǇǂƳƾƲƷǅǖǺƳǍǨǏǴǞǐ", (byte)117, 66);
               b[7] = NLoginCore_530.B("ǕƫǥǆƯƱǢǡǩǉǥƭƧǪǅƨǆƳƬǳǠƿƼƽ", (byte)117, 66);
               b[8] = NLoginCore_183.B("ǎƺƞưǣƢǞƷǢǞǌƱ", (byte)117, 66);
               b[9] = NLoginCore_004.F(
                  "֝ո֦֢֩սջ֞։\u0590֍֕նֳև֥֤֚֫֕֞֬֕ցַ֮ׄվրַքַָփ\u05c8֮֊׆ְֿ֭֩\u058c\u058cחוֵ֢חׇ\u05ce\u05ce֙\u05c9֛֫ם֜וֱַגםס\u05cbכִלּ־ֳׂ֧֤במה֯\u05f6\u05f5\u05edװאץיב\u05faֽ״\u0601\u05feך\u05f8ן؆ׁ",
                  (byte)117,
                  70
               );
               b[10] = NLoginCore_427.C("ծ՟ՠ֑՝Սծ֑մ՟\u058b֎ղ֘էլղխ՞թ՝բհց֥՞ո֓պ֟։ջ", (byte)117, 67);
               b[11] = NLoginCore_384.C("րՖ\u0590ձ՚՜֍\u058c֔մ\u0590\u0558Ւ֕հՓձ՞\u0557֞\u058bժէը", (byte)117, 67);
               b[12] = NLoginCore_384.A("ǎƺƞưǣƢǞƷǢǞǌƱ", (byte)117, 65);
               b[13] = NLoginCore_530.C(
                  "ր՛։\u058cօՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓\u058c\u0590կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ\u05c8ִּם֠חפסֽכׂש֤", (byte)117, 67
               );
               b[14] = NLoginCore_427.F("նգ֘֗֊ռ֍֪֎կֆ֎ְ֖շճ֊֦\u058bֲֶ֔֍ճ֕ջց֎֔׆օ֛֦֠֗֗ֆ\u05c8֣א\u05cdֱֲ֩֬֍אׁט֥֭֩ןַ֤֥", (byte)117, 70);
               b[15] = NLoginCore_241.A("ƪƢơǦƾǄƷǂǚǁƧƱ", (byte)117, 65);
               b[16] = NLoginCore_553.D("խ\u0557ֈէ\u058c։֒\u058bՋ֒կ՜", (byte)117, 68);
               b[17] = NLoginCore_559.F("ղժթ֮ֆ\u058cտ֊֢։կչ", (byte)117, 70);
               b[18] = NLoginCore_433.A("ǂƬǝƼǡǞǧǠƠǧǄƱ", (byte)117, 65);
               break;
            case 1:
               b[0] = NLoginCore_453.E("\u058bռս֮պժ\u058b֑֮ռ֨֫֏ֵք։֏֊ջֆպչ׀֎֒ջ֚֓־ֲֽ֟", (byte)117, 69);
               b[1] = NLoginCore_453.F("֝ճ֭֎շչֱ֪֑֭֩ծծ֟ֈ\u058bֶ֛յֲֽ֩քօ", (byte)117, 70);
               b[2] = NLoginCore_433.D("բփՆՂՉՠ\u058bլբնշ՜", (byte)117, 68);
               b[3] = NLoginCore_241.A(
                  "ǕưǞǡǚƵƳǖǁǈǅǍƮǫƿǝǣǜǍǖǤǍǒƹǯǼǦƶƸǯƼǰǯƻȀǦǂǾǷǨǡǥǄǄȏȍǚǭȏǿȆȆǑȁǓǣȕǔȍǩǯȊȕșȃȓǬȔǴǶǟǺǜǫȉȖȌǧȮȭȥȨȈȝȑȎȫȴȇȕȥǵǹȝǸȺȜȲȖȍȎɀȘɆȸȴȜȑ", (byte)117, 65
               );
               b[4] = NLoginCore_451.F("֧վ֫ի֎ո֭ֆ\u0590֑\u0590֩ք֬֓֓֊ּ֛֭֍\u058c\u058b֚֠֠֍ׁ֝սվջֺ֓օ\u05c8ׇ֜א֏ד\u05ceִ֙", (byte)117, 70);
               b[5] = NLoginCore_091.F("ֆ։ըְ֭֝պպ֢ժ֊էְմְְ֦֕ճշոֽքօ", (byte)117, 70);
               b[6] = NLoginCore_384.C("ծ՟ՠ֑՝Սծ֑մ՟\u058b֎ղ֘էլղխ՞թ՝՞ր֧֟֔֒գ֥տ֪ի֫֠֊֘պձփ\u058b\u058c֯֗ռ", (byte)117, 67);
               b[7] = NLoginCore_173.C("րՖ\u0590ձ՚՜֍\u058c֔մ֍ը\u0557ւյ֑ֈ֏֛հ֙ժէը", (byte)117, 67);
               b[8] = NLoginCore_092.B("ǛƚǝǤǘǥǨǒƾǥƧƱ", (byte)117, 66);
               b[9] = NLoginCore_004.D(
                  "ր՛։\u058cօՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓\u058c\u0590կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ\u05c8ֵַּׅ֫מכִׇ֢ץ\u05cd֧\u05cdן\u05ecבגׄ\u05ca\u05f6֬ױּ",
                  (byte)117,
                  68
               );
               b[10] = NLoginCore_027.A("ǃƴƵǦƲƢǃǦǉƴǠǣǇǭƼǁǇǂƳƾƲƮǪǱƹƲǓǾǒƸǌǾ", (byte)117, 65);
               b[11] = NLoginCore_453.E("֝ճ֭֎շչֱ֪֑֤֩֬մֹ֧֪֖֒ֈյշ֗քօ", (byte)117, 69);
               b[12] = NLoginCore_451.C("ՙ։ռևհ֒բկծվշ՜", (byte)117, 67);
               b[13] = NLoginCore_241.E(
                  "֝ո֦֢֩սջ֞։\u0590֍֕նֳև֥֤֚֫֕֞֬֕ցַ֮ׄվրַքַָփ\u05c8֮֊׆ְֿ֭֩\u058c\u058cחוֵ֢חׇ\u05ce\u05ce֙\u05c9֛֫ם֜וֱַגםס\u05cbכִלּ־ֳׂ֧֤במה֯\u05f6\u05f5\u05edװאץיהּֿ\u05cf\u05f7יי\u0603ׄכר\u05f7ףתן\u0603ט؎ך؈ؑלי",
                  (byte)117,
                  69
               );
               b[14] = NLoginCore_241.E("նգ֘֗֊ռ֍֪֎կֆ֎ְ֖շճ֊֦\u058bֲֶ֔֍ճ֕ջց֎֔׆օ֛֦֠֗֗ֆ\u05c8֣א\u05cdְ֩ׄ֔֕֫ך׃֤ג׆\u0590֧֤֥", (byte)117, 69);
               b[15] = NLoginCore_076.B("ǛǄǓǑƻƶǜǠƜǛǢƱ", (byte)117, 66);
               b[16] = NLoginCore_384.D("չ՛ՌՉլբթքխ։֘զ֔ըզև՜֔՟֑պպէը", (byte)117, 68);
               b[17] = NLoginCore_232.C("բ՞փծՉ\u0590ՊՔի։֍՜", (byte)117, 67);
               b[18] = NLoginCore_241.C("՞ւՇՍՈքլ\u058bտիՕմ֒փե֔պ՞սն։ժէը", (byte)117, 67);
               break;
            case 2:
               b[0] = NLoginCore_446.E("ջօ֡֫\u058b֚֝վկֈ֜֏ևֶփձփֺֈ֏պ։ֽ֞׀ָ֠ր֧֛֥ֈ", (byte)117, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_076.D("եՀ֊տգաձՒ֕ւՏխհ\u0557ՙթ֓֎թ֗՝ժէը", (byte)117, 68);
         }
      }
   }

   private boolean a(String var1) {
      if (!var1.isEmpty() && var1.charAt(bd) == be) {
         String[] var2 = var1.split(a(bf, bg ^ bh));
         if (var2.length > bi) {
            String var3 = var2[bj].toLowerCase(Locale.ENGLISH);
            return var3.equals(a(bk & bl, bm));
         }
      }

      return (boolean)bn;
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 117L;
      var1 ^= 4695241207512435355L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(58 + 10),
                     (byte)(41 + 28),
                     (byte)(81 + 2),
                     (byte)(35 + 12),
                     (byte)(20 + 47),
                     (byte)(29 + 37),
                     (byte)(53 + 14),
                     (byte)(34 + 13),
                     (byte)(39 + 41),
                     (byte)(25 + 50),
                     67,
                     (byte)(28 + 55),
                     53,
                     (byte)(26 + 54),
                     (byte)(5 + 92),
                     (byte)(6 + 94),
                     (byte)(25 + 75),
                     (byte)(21 + 84),
                     (byte)(66 + 44),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.E("ԣ\u0530ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿ\u0895࢘࢜࢈ࢌ࢙ࢋࢠࢡࡵ\u0893ࢎ࢞", (byte)4, 69));
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

   @Generated
   public NLoginCore_078(nLoginBungee var1, NLoginType_008 var2) {
      this.c = var1;
      this.B = var2;
   }

   @EventHandler(
      priority = -64
   )
   public void a(TabCompleteEvent var1) {
      if (!var1.isCancelled()) {
         Connection var2 = var1.getSender();
         if (var2 instanceof ProxiedPlayer) {
            ProxiedPlayer var3 = (ProxiedPlayer)var2;

            try {
               List var4 = var1.getSuggestions();
               if (var4.isEmpty()) {
                  return;
               }

               String var5 = var1.getCursor().trim();
               if (!var5.isEmpty() && var5.charAt(p) != q) {
                  return;
               }

               NLoginCore_277 var6 = this.c.b().a(var3);
               if (var6.S()) {
                  return;
               }

               int var7 = !var6.i(a(r, s ^ t)) && !var6.i(a(u, v ^ w)) ? y : x;
               var4.removeIf(var3x -> {
                  if (var3x.trim().isEmpty()) {
                     return (boolean)bo;
                  } else if (var3x.charAt(bp) != bq) {
                     return (boolean)br;
                  } else {
                     String[] var4x = var3x.split(a(bs, bt ^ bu));
                     String var5x = var4x[bv].toLowerCase(Locale.ENGLISH);
                     if (!var7 && var5x.equals(a(bw, bx))) {
                        return (boolean)by;
                     } else {
                        return (boolean)(this.B.a().b(var6) ? bz : this.B.a().b(var3x));
                     }
                  }
               });
            } catch (Throwable var8) {
               NLoginCore_370.c(a(z, aa ^ ab) + var1.getClass().getSimpleName() + a(ac, ad ^ ae) + var3.getName() + a(af, ag), var8);
               var1.setCancelled((boolean)ai);
               var3.disconnect(TextComponent.fromLegacyText(a(aj, ak ^ al)));
            }
         }
      }
   }

   @EventHandler
   public void a(ServerKickEvent var1) {
      if (!var1.isCancelled()) {
         String var2 = BaseComponent.toLegacyText(var1.getKickReasonComponent());
         if (var2.equalsIgnoreCase(a(ay & az, ba))) {
            var1.setCancelled((boolean)bb);
         }
      }
   }

   @EventHandler
   public void a(SettingsChangedEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      if (var2 instanceof UserConnection) {
         try {
            NLoginCore_277 var3 = this.c.b().a(var2);
            if (var3.S()) {
               return;
            }

            ClientSettings var4 = ((UserConnection)var2).getSettings();
            NLoginCore_055 var5 = NLoginCore_055.c(var4.getLocale());
            if (var5 != null) {
               NLoginCore_509 var6 = this.B.a().a(var3);
               if (var6 != null) {
                  var6.a(NLoginCore_567.i, var5);
               }
            }
         } catch (Throwable var7) {
            NLoginCore_370.c(a(am, an) + var1.getClass().getSimpleName() + a(ao & ap, aq) + var2.getName() + a(ar, as ^ at), var7);
            var2.disconnect(TextComponent.fromLegacyText(a(av, aw ^ ax)));
         }
      }
   }
}
