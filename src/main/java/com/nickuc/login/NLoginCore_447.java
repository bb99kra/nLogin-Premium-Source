package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.limbo.DelayedPlayerLimboClearTask;
import com.nickuc.login.tasks.limbo.PlayerLimboClearTask;
import com.nickuc.login.tasks.limbo.PlayerLimboRestoreTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;

public class NLoginCore_447 extends NLoginType_005 {
   private static long bc = Long.reverse(-6336063559446913429L);
   private final NLoginCore_456 a;
   private static int am = 0 >>> 187 | 0 << ~187 + 1;
   private static long ah = Long.reverse(-5759602807143489941L);
   private static int ad = Integer.reverse(-1610612736);
   private static String[] ZKM_STR_B = new String[NLoginCore_447.bm];
   private static int bm = Integer.reverse(1342177280);
   private static String[] ZKM_STR_A = new String[NLoginCore_447.bl];
   private static int bg = Integer.reverse(0);
   private static long u = Long.reverse(-5759602807143489941L);
   private final nLoginBukkit a;
   private static int aa = Integer.reverse(0);
   private static int bl = (1073741825 >>> 93 | 1073741825 << -93) & -1;
   private static int as = Integer.reverse(0);
   private static int ar = 0 >>> 240 | 0 << -240;
   private static long bk = Long.reverse(-6336063559446913429L);
   private static long af = Long.reverse(-6336063559446913429L);
   private static long q = Long.reverse(1729382256910270464L);
   private static int ax = (939524096 >>> 251 | 939524096 << ~251 + 1) & -1;
   private static int ba = Integer.reverse(268435456);
   private static int av = Integer.reverse(0);
   private static int ab = Integer.reverse(536870912);
   private static long ak = Long.reverse(1729382256910270464L);
   private static long p = Long.reverse(-5759602807143489941L);
   private static int ap = Integer.reverse(1275068416);
   private static long z = Long.reverse(-6336063559446913429L);
   private static long e;
   private static int y = 6 >>> 97 | 6 << -97;
   private static int l = Integer.reverse(0);
   private static long ac = Long.reverse(-6336063559446913429L);
   private static int m = Integer.reverse(-1);
   private static long v = Long.reverse(1729382256910270464L);
   private static int t = Integer.reverse(1073741824);
   private static int bh = Integer.reverse(-1879048192);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int bj = (-1 >>> 82 | -1 << -82) & -1;
   private static long n = Long.reverse(-6336063559446913429L);
   private static long ay = Long.reverse(-6336063559446913429L);
   private static int ag = Integer.reverse(1610612736);

   public NLoginCore_447(nLoginBukkit var1) {
      super(var1.a());
      this.a = var1;
      this.a = new NLoginCore_456(var1);
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 24L;
      var1 ^= 1140989877499573875L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(16 + 53),
                     (byte)(42 + 41),
                     (byte)(19 + 28),
                     (byte)(43 + 24),
                     (byte)(58 + 8),
                     (byte)(49 + 18),
                     47,
                     (byte)(10 + 70),
                     (byte)(14 + 61),
                     (byte)(58 + 9),
                     (byte)(72 + 11),
                     53,
                     (byte)(67 + 13),
                     (byte)(70 + 27),
                     (byte)(39 + 61),
                     (byte)(45 + 55),
                     (byte)(101 + 4),
                     (byte)(87 + 23),
                     (byte)(80 + 23)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.C("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡖ\u082fࡘࡥࡈࡑࡠࡊ\u086c\u085cࡩࡥࡩ࠻", (byte)71, 67));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_447.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.A("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 65), NLoginCore_447.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߕޮߗߤ߇ߐߟ߉߫ߛߨߤߨ\u07baѢ", (byte)28, 67) + var1 + NLoginCore_110.C("у", (byte)28, 67) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      e = -2992225113935214579L;
      long var0 = e ^ 1140989877499573875L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(2 + 66),
               (byte)(46 + 23),
               (byte)(53 + 30),
               (byte)(42 + 5),
               (byte)(5 + 62),
               (byte)(39 + 27),
               (byte)(47 + 20),
               47,
               (byte)(58 + 22),
               (byte)(23 + 52),
               (byte)(50 + 17),
               (byte)(26 + 57),
               (byte)(10 + 43),
               (byte)(51 + 29),
               (byte)(50 + 47),
               (byte)(90 + 10),
               (byte)(50 + 50),
               (byte)(85 + 20),
               110,
               (byte)(23 + 80)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_027.D("ֈ֍֎\u0558իջի֚֏֗կ֢ձ֦֠֟֙֡րօ֦պ\u058c֍֞ր\u0590֬լծտկֲִ֮ևօքֲ֑շռ֚\u0590׃\u058c֛ջְׅ֦֖֚֒\u05ca֦\u05caׇ֪փְ֝אׄ", (byte)120, 68);
               ZKM_STR_B[1] = NLoginCore_127.B("ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȵȟȧȍȴȖǽȕȯȞș", (byte)120, 66);
               ZKM_STR_B[2] = NLoginCore_223.E("֙թսր\u0590պ֥֞֬լ֖֖֩֔֗ֆ֔պֱֶ֝֔׀ւֻ֒׆ֺ֤׃ׇ֜\u05caֿ֧֪֚֜֘\u05c9ֲ֏֧֜", (byte)120, 69);
               ZKM_STR_B[3] = NLoginCore_201.D("Տգւ\u058b֗֔լշ֔ռպ։֚֙֏֤ֆփսոՠզ֚գ֪֊ժֱժ֞և֟", (byte)120, 68);
               ZKM_STR_B[4] = NLoginCore_110.A("ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȵȟȧȍȴȖǽȕȯȞș", (byte)120, 65);
               ZKM_STR_B[5] = NLoginCore_173.D(
                  "՞իզէ\u0557֗էմ֟ջ֏֖մ֞փ՝֖՝֕ձ֕՝փ֮փ֧ֆֲ֑֛֓֜֯֓ր֣֏խ\u058cս֚֬տ։ְֵֺ֕֘տּ֥֘֊֬\u058bֶ։א֪֭։֓֏ב\u05ca׃֧֮ח\u05cc\u05cf־\u05cfזּהֹֽ֤כ֧֝וְֱֳ֦", (byte)120, 68
               );
               ZKM_STR_B[6] = NLoginCore_076.A("ƞƹǂƷƪǈƪǠǎǦǂƷ", (byte)120, 65);
               ZKM_STR_B[7] = NLoginCore_471.B("ưƽƸƹƩǩƹǆǱǍǡǨǆǰǕƯǨƯǧǃǧƯǕȀǕǹǘǣǥǭǮȁȄǥǒǵǡƿǞǏǬǾǒȍȃǤǴǡȔǋȖșǩǽǕȖǫȟȣǼǲǰǷǝȣǶǦȞǞȂǤǹȣțȊȁȢȳȤȸȲȩȩȆȫȫȂȃ", (byte)120, 66);
               ZKM_STR_B[8] = NLoginCore_446.B("ƞƹǂƷƪǈƪǠǎǦǂƷ", (byte)120, 66);
               ZKM_STR_B[9] = NLoginCore_559.C(
                  "ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩\u058b֪\u058cֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗\u05c9\u05cb\u05c9ֺגז֖֭֚\u05cfך֤וֻ־ףה֥ף\u05cdוֻעׄ֫׃ם\u05ccׇ",
                  (byte)120,
                  67
               );
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.E("֤֥֟կւ֒ւֱ֦֮ֆֹֈְֵֶַָֽֽ֑֣֤֧֗֜֗׃փօ֖ֆ\u05cb\u05c9ׅ֛֞֜֨\u05c9֎ֱ֧֓ךֲ֣֒֩לֱֶׇֽמפןקּ֢ךֵ\u05ccת", (byte)120, 69);
               ZKM_STR_B[1] = NLoginCore_141.C(
                  "ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩\u058b֪\u058cֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗\u05c9\u05cb\u05c9ֺגז֖֭֚\u05cfך֤וֻ־ףה֥ף\u05cb׆\u05ceטשֺ֯שִ\u05ebװ\u05c9\u05edװטׄקׇֽױ\u05f6ׅ",
                  (byte)120,
                  67
               );
               ZKM_STR_B[2] = NLoginCore_092.B("ǔƤƸƻǋƵǙǧǠƧǤǏǒǑǑǁǏƵǘǬǱǏǻƽǶǍȁǟǵǾȂǗǅǀȃǢǺǄǫǤǚȆǉǠǞǦȑǮȉǏǢǕǯǥǢǣ", (byte)120, 66);
               ZKM_STR_B[3] = NLoginCore_433.F("զպ֢֮֙֫փ֎ְֱֻ֑֦֚֫֓֠֝֔֏շւֵ־ַ֤֗ևַֹֻ׀", (byte)120, 70);
               ZKM_STR_B[4] = NLoginCore_173.D(
                  "ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩\u058b֪\u058cֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗\u05c9\u05cb\u05c9ֺגז֖֭֚\u05cfך֤וֻ־ףה֥יזוַ׆\u05ca֧מ\u05ccִ־גק\u05ec׆\u05cfק״\u05faחֻאׅ",
                  (byte)120,
                  68
               );
               ZKM_STR_B[5] = NLoginCore_223.A("ưƽƸƹƩǩƹǆǱǍǡǨǆǰǕƯǨƯǧǃǧƯǕȀǕǹǘǣǥǭǮȁȄǥǒǵǡƿǞǏǬǾǑǛȇȌȂǧǪǑȎǪǷǜǾǝȈǛȢǿǼǛǥǡȣȜȕȀǹȩȞȡȐȡȫȃȈǳǮȷȮȯȌǱǹȻȂȃ", (byte)120, 65);
               ZKM_STR_B[6] = NLoginCore_241.E("գեխէջ֒օց֪ցֵռ", (byte)120, 69);
               ZKM_STR_B[7] = NLoginCore_173.F(
                  "յւսվծ֮վ\u058bֶ֦֭֒\u058bֵ֚մ֭մ֬ֈ֬մׅ֚֚־ֲֳ֪֝֨׆\u05c9ֺ֪֦֗քֱ֣֔׃֗ג\u05c8ֹ֦֩י\u0590כמׂ֚֮כְפרֵַּׁ֢רֻ֫ףׇ֣֩־רנ\u05cf׃ׯ\u05fbֵחָ\u05f9\u05edת\u05f8ף\u05f6\u0600זׯ\u05fdׇ׀לׅ\u05fc",
                  (byte)120,
                  70
               );
               ZKM_STR_B[8] = NLoginCore_141.B("ǤƽǪǜƫǈǇǧƮƻǎƷ", (byte)120, 66);
               ZKM_STR_B[9] = NLoginCore_127.B(
                  "ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȷȗȍǺȝȎȽȲțȵȀɁȀȇȕȦȌȫɂȎȝȚȗ", (byte)120, 66
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.F("֬լ֚ծռվֳֶ֥֤֮֯֗քևֈֈֽ֑ղַ֚ևֈ", (byte)120, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_004.B("ǩǀǀǞƴǁǤƼƽǎǦƱǣǱǗƶưǎǈƹƺǻǂǃ", (byte)120, 66);
         }
      }
   }

   @Override
   public void a(NLoginCore_277 var1, NLoginCore_509 var2) {
      var2.a(NLoginCore_567.y);
      NLoginCore_510 var3 = var2.d(NLoginCore_567.g);
      if (var3 == null) {
         var1.<Player>c().updateInventory();
      } else {
         Server var4 = this.a.b().c();
         if (var4.isPrimaryThread() && !NLoginCore_012.V()) {
            this.a.a(var2, var3, (ar != 0));
         } else {
            var1.a().a(new PlayerLimboRestoreTask(() -> this.a.a(var2, var3, (as != 0))));
         }
      }
   }

   @Override
   protected boolean a(NLoginCore_509 var1, String var2, boolean var3) {
      if (this.a.a().isPrimaryThread()) {
         throw new IllegalStateException(var2 + a(l & m, n));
      } else {
         return super.a(var1, var2, var3);
      }
   }

   @Override
   public void b(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3) {
      NLoginCore_510 var4 = var2.d(NLoginCore_567.g);
      if (var4 == null) {
         var1.a(a(o, p ^ q));
         NLoginCore_370.d(a(t, u ^ v) + var1.getName() + a(y, z));
      } else {
         try {
            this.a.a(var2, var4, var3);
         } catch (Exception var7) {
            var1.a(a(ab, ac));
            NLoginCore_370.c(a(ad, af) + var1.getName() + a(ag, ah ^ ak), var7);
            return;
         }

         Runnable var5 = () -> {
            int var4x = av;

            try {
               var4x = this.a.a(var2, var4);
            } catch (Exception var6x) {
               NLoginCore_370.c(a(ax, ay) + var1.getName() + a(ba, bc), var6x);
            }

            if (var4x == 0) {
               var1.a(a(bh & bj, bk));
            }
         };
         int var6 = NLoginCore_477.v.r() * ap;
         if (var6 <= 0) {
            new PlayerLimboClearTask(var5).run();
         } else {
            var1.a().a(new DelayedPlayerLimboClearTask(var5), (long)var6, TimeUnit.MILLISECONDS);
         }
      }
   }

   @Generated
   public NLoginCore_456 a() {
      return this.a;
   }
}
