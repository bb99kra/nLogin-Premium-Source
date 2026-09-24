package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;
import org.bukkit.event.server.ServerCommandEvent;

public class ξΦοφωαοσμ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int at = (0 >>> 41 | 0 << -41) & -1;
   private static long w = Long.reverse(-2035373346204415242L);
   private static long c;
   private static int aw = (144 >>> 100 | 144 << ~100 + 1) & -1;
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(-1073741824);
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static long bo = Long.reverse(-8952902373845497098L);
   private static int af = 16777216 >>> 88 | 16777216 << -88;
   private static long o = Long.reverse(-2035373346204415242L);
   private static int as = Integer.reverse(0);
   private final εσλρΔμΔψχεθυνΔ a;
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int ao = 33554432 >>> 185 | 33554432 << -185;
   private final boolean o;
   private static int k = (134217728 >>> 122 | 134217728 << ~122 + 1) & -1;
   private static int bh = Integer.reverse(-805306368);
   private static int j = (268435456 >>> 187 | 268435456 << ~187 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long be = Long.reverse(-2035373346204415242L);
   private static long ax = Long.reverse(-2035373346204415242L);
   private static int bm = (6815744 >>> 243 | 6815744 << ~243 + 1) & -1;
   private static long u = Long.reverse(-2035373346204415242L);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static int bn = Integer.reverse(805306368);
   private static int aq = Integer.reverse(-1);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int ay = (0 >>> 187 | 0 << -187) & -1;
   private static int p = 524288 >>> 81 | 524288 << -81;
   private static int bl = Integer.reverse(-1342177280);
   private static long h = Long.reverse(-8952902373845497098L);
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(1610612736);
   private static long e = Long.reverse(-2035373346204415242L);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(-1073741824);
   private static int bk = (0 >>> 34 | 0 << -34) & -1;
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static int t = (2560 >>> 105 | 2560 << -105) & -1;
   private static int f = (64 >>> 134 | 64 << -134) & -1;
   private static int bg = Integer.reverse(0);
   private final nLoginBukkit g;
   private static int ag = 131072 >>> 49 | 131072 << ~49 + 1;
   private static int ak = (2048 >>> 107 | 2048 << -107) & -1;
   private static String[] b = new String[bm];
   private static int ba = Integer.reverse(0);
   private static long bp = Long.reverse(6917529027641081856L);
   private static int ap = 112 >>> 196 | 112 << -196;
   private static int z = (67108864 >>> 122 | 67108864 << -122) & -1;
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int y = Integer.reverse(0);
   private static long bj = Long.reverse(-2035373346204415242L);
   private static long ar = Long.reverse(-2035373346204415242L);
   private final αοΛσφψΦε c;
   private static int d = -1 >>> 5 | -1 << ~5 + 1;
   private static int bb = (752 >>> 36 | 752 << -36) & -1;
   private static int ab = (64 >>> 102 | 64 << -102) & -1;
   private static int bd = 5 >>> 191 | 5 << -191;
   private static long i = Long.reverse(6917529027641081856L);
   private static long l = Long.reverse(-2035373346204415242L);
   private static final GameMode b;
   private static long av = Long.reverse(-2035373346204415242L);
   private static int bi = -1 >>> 99 | -1 << -99;
   private static long r = Long.reverse(-2035373346204415242L);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = (524288 >>> 19 | 524288 << ~19 + 1) & -1;
   private static int az = Integer.reverse(0);
   private static String[] a = new String[bl];
   private static int ac = 2 >>> 65 | 2 << -65;
   private static int bc = 1577058304 >>> 57 | 1577058304 << -57;
   private static int au = 67108864 >>> 55 | 67108864 << -55;
   private static int b = 0 >>> 151 | 0 << -151;
   private static int a = (335544320 >>> 154 | 335544320 << -154) & -1;
   private static int an = Integer.reverse(0);
   private static int q = 256 >>> 38 | 256 << -38;

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void b(PlayerQuitEvent var1) {
      ((αοΛσφψΦε)this.g.a().b()).a(var1);
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerDropItemEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ah);
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void b(PlayerCommandPreprocessEvent var1) {
      if (!this.o && var1.isCancelled() && this.a(var1.getMessage())) {
         var1.setCancelled((boolean)ay);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerInteractEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)aa);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerShearEntityEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ac);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerItemConsumeEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)aj);
      }
   }

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void b(PlayerJoinEvent var1) {
      ((αοΛσφψΦε)this.g.a().b()).a(var1);
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerItemHeldEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ai);
      }
   }

   private static void b() {
      c = 8020924532559119297L;
      long var0 = c ^ 2082339479008291025L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(41 + 27),
               (byte)(63 + 6),
               (byte)(33 + 50),
               (byte)(10 + 37),
               (byte)(21 + 46),
               (byte)(41 + 25),
               (byte)(47 + 20),
               (byte)(41 + 6),
               (byte)(45 + 35),
               (byte)(43 + 32),
               (byte)(21 + 46),
               (byte)(4 + 79),
               (byte)(40 + 13),
               80,
               (byte)(78 + 19),
               (byte)(88 + 12),
               (byte)(52 + 48),
               105,
               (byte)(67 + 43),
               (byte)(92 + 11)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               b[0] = ντθΔζβΔζ.D("ЂмЀщятщПгдафвзЭШьљджгџЦЧ", (byte)10, 68);
               b[1] = χφπρψπφΦθμπ.C("ишЄычрЊЅѓыьЛ", (byte)10, 67);
               b[2] = φδχεθοκψαλΛογλ.E(
                  "ӵԎԺՁԞԝԯԏԅԀԽԖԅԅԵՉԮԚՋԯԠՅՔՁՖՌՉԗԕԯ՜ԹՑՕԡԪ՛\u0530՜ԡԥ՞դէԳդԾ՞ԷՊղՅգԫ\u0530ՉՑՠյՂՏՓ\u0558ջձաՠՐ՝՞ՙՒՄՐդտ՚֊բ\u058bրկ֒ռծ՟ըՌլիձ֛ճհ֞֗", (byte)10, 69
               );
               b[3] = λΣΩσμφγχ.F("ԫԻӷԾԺԳӽӸՆԾԿԎ", (byte)10, 70);
               b[4] = ιΠοθΩΦξκ.C("ЃЫуЌШЛмѓЦцчсБВБэшКМѕЩѝњўтѥНѧаѢўѬыѝФѫѡњтаЭрѲѤѡѷљкжѨѭљнѬѪія҆ѻѕѵѪѴѣѶѵ҂стѩѐяцѓѢћ", (byte)10, 67);
               b[5] = ΦδφπθΩΩλζξ.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĨĖĘćĖěıĎĜöĬĉĆć", (byte)10, 65);
               b[6] = οοθδΨιοΦΠβδζ.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԱՃՅաբՠաԦԯծԻԼԹԺ", (byte)10, 70);
               b[7] = οΩνΩρωλΨηΛδωδ.C("ЈлІънЪпШДТъЧЧЬєЯњќЙиаџЦЧ", (byte)10, 67);
               b[8] = φδχεθοκψαλΛογλ.D("ЌьІПЊхЬђодАёьѐЕХяХявЮйЦЧ", (byte)10, 68);
               b[9] = ξψθρΣΠΣς.F("ԺԞԓՂԜӺՁԏԒԁԣԃԾԞԩԛԚԼԤԺՆԜԙԚ", (byte)10, 70);
               b[10] = φδχεθοκψαλΛογλ.C("НУщКЌПТшятТЛ", (byte)10, 67);
               b[11] = πχσδΦΦνθΔπ.F("ԌӼԖԲԑԙԼԏԷԸԈԎ", (byte)10, 70);
               b[12] = ιΠοθΩΦξκ.C("ЬЈкТЬЙђЩБУаАъФЧШжшОпњйЦЧ", (byte)10, 67);
               break;
            case 1:
               b[0] = ντθΔζβΔζ.C("ЂмЀщятщПгдаіѐяяјѐѓђмћџЦЧ", (byte)10, 67);
               b[1] = μεςΩΔΣγν.C("чниМЇЋмЋуЋшЛ", (byte)10, 67);
               b[2] = οοθδΨιοΦΠβδζ.A("ÂÛćĎëêüÜÒÍĊãÒÒĂĖûçĘüíĒġĎģęĖäâüĩĆĞĢî÷ĨýĩîòīıĴĀıċīĄėĿĒİøýĖĞĭłďĜĠĥňľĮĭĝĪīĦğđĝıŌħŗįŘōļşŉĻīĿľĴĵŧĴĺŇšŁ", (byte)10, 65);
               b[3] = ςπυηννναΣ.D("хЭЦуоЪомРШшЛ", (byte)10, 68);
               b[4] = βεξΠθρρςΔΦμ.F("ӶԞԶӿԛԎԯՆԙԹԺԴԄԅԄՀԻԍԏՈԜՐՍՑԵ\u0558Ԑ՚ԣՕՑ՟ԾՐԗ՞ՔՍԵԣԠԳե\u0557ՔժՌԭԩ՛ՠՌ\u0530՟՝ՉՂչծՈը՝էՖջՍիԴՑՕ՚ռ՚եՑՎ", (byte)10, 70);
               b[5] = ΣδτΠνεγοΓορητ.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĩîıðìĵĨčĬħøęĆć", (byte)10, 65);
               b[6] = ξψθρΣΠΣς.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԳՆՓգաՉաիղձզբԹԺ", (byte)10, 70);
               b[7] = ιΠοθΩΦξκ.D("ЈлІънЪпШДТщаЩвћќвЖлђиЩЦЧ", (byte)10, 68);
               b[8] = βεξΠθρρςΔΦμ.C("ЌьІПЊхЬђодЏтбГъЧаццЪгЗЮяяаѠёєйСѡ", (byte)10, 67);
               b[9] = μεςΩΔΣγν.A("ćëàďéÇĎÜßÎïÖåęêøĊđēÞóğæç", (byte)10, 65);
               b[10] = λΣΩσμφγχ.D("щюЩЊЮЌшЅЋОьЛ", (byte)10, 68);
               b[11] = ΦδφπθΩΩλζξ.F("ԐԭԿԫԼԷԁԵԗӿԢՃԋՋՂՎԬԏԯԪՒԜԙԚ", (byte)10, 70);
               b[12] = φδχεθοκψαλΛογλ.C("ЬЈкТЬЙђЩБУЯщєУЧьжЯЯЫОџЦЧ", (byte)10, 67);
               break;
            case 2:
               b[0] = πηγμΣΔκκ.E("ӺԿԬӴԏԳԲՂԷԆԴԟԆՄԶԛՈՉԫՂՂՒԙԚ", (byte)10, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = μεςΩΔΣγν.B("ÅÊāøøċďÞñäÕáÕêĂėåÕĆÕĒàġĜĠâāāĝġěö", (byte)10, 66);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void a(AsyncPlayerPreLoginEvent var1) {
      if (var1.getLoginResult() == Result.ALLOWED) {
         InetAddress var2 = var1.getAddress();
         if (var2 == null || var2.getHostAddress() == null) {
            Result var10001 = Result.KICK_OTHER;
            String[] var10002 = new String[a];
            var10002[b] = c<"㺀">(c & d, e);
            var10002[f] = c<"㺃">(g, h ^ i);
            var10002[j] = c<"㺆">(k, l);
            var10002[m] = c<"㺉">(n, o);
            var10002[p] = c<"㺌">(q, r);
            var1.disallow(var10001, βιχγΓλχΠσπ.a(var10002));
         }
      }
   }

   static {
      b();

      GameMode var0;
      try {
         var0 = GameMode.valueOf(c<"㺀">(bn, bo ^ bp));
      } catch (IllegalArgumentException var2) {
         var0 = null;
      }

      b = var0;
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(InventoryOpenEvent var1) {
      HumanEntity var2 = var1.getPlayer();
      if (this.c.a(var2) && this.a(var1.getView())) {
         var1.setCancelled((boolean)ak);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerInteractEntityEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ab);
      }
   }

   private boolean a(Object var1) {
      if (var1 == null) {
         return (boolean)am;
      } else {
         List var2 = ΣλνΨουΩΔοθεβ.D.a(new Object[an]);
         if (var2.isEmpty()) {
            return (boolean)ao;
         } else {
            String var3;
            try {
               var3 = ΓΛθσφζςηκ.b(var1.getClass(), c<"㺀">(ap & aq, ar)).invoke(var1).toString();
            } catch (ReflectiveOperationException var5) {
               throw new RuntimeException(c<"㺃">(au, av) + var1.getClass().getCanonicalName() + c<"㺆">(aw, ax), var5);
            }

            return var2.stream().filter(Objects::nonNull).noneMatch(var1x -> ςβικδπφδΣκ.m(var1x).contains(var3));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(PlayerKickEvent var1) {
      String var2 = var1.getReason();
      int var3 = !var2.equalsIgnoreCase(c<"㺀">(t, u)) && (this.a.b(this.g.b().a(var1.getPlayer())) || !var2.equalsIgnoreCase(c<"㺃">(v, w))) ? y : x;
      if (var3 != 0) {
         var1.setCancelled((boolean)z);
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void a(ServerCommandEvent var1) {
      if (!this.o && var1 instanceof Cancellable && var1.isCancelled() && this.a(var1.getCommand())) {
         var1.setCancelled((boolean)az);
      }
   }

   private boolean a(String var1) {
      if (!var1.isEmpty()) {
         if (var1.charAt(ba) != bb) {
            var1 = bc + var1;
         }

         String[] var2 = var1.split(c<"㺀">(bd, be));
         if (var2.length > bf) {
            String var3 = var2[bg].toLowerCase(Locale.ENGLISH);
            return var3.equals(c<"㺃">(bh & bi, bj));
         }
      }

      return (boolean)bk;
   }

   @Generated
   public ξΦοφωαοσμ(nLoginBukkit var1, εσλρΔμΔψχεθυνΔ var2, αοΛσφψΦε var3, boolean var4) {
      this.g = var1;
      this.a = var2;
      this.c = var3;
      this.o = var4;
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerPickupItemEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ag);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerFishEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ad);
      }
   }

   @EventHandler
   public void a(PlayerRespawnEvent var1) {
      Player var2 = var1.getPlayer();
      if (!this.g.a().a().b(var2.getName(), var2.getUniqueId())) {
         λΓλχΩαοΨωθτοςΓ var3 = (λΓλχΩαοΨωθτοςΓ)this.g.a().b();
         Location var4 = var3.a().e();
         if (var4 != null) {
            var1.setRespawnLocation(var4);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 6L;
      var1 ^= 2082339479008291025L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(67 + 1),
                     (byte)(31 + 38),
                     83,
                     (byte)(28 + 19),
                     (byte)(37 + 30),
                     (byte)(13 + 53),
                     (byte)(41 + 26),
                     (byte)(44 + 3),
                     (byte)(10 + 70),
                     (byte)(35 + 40),
                     (byte)(41 + 26),
                     83,
                     (byte)(8 + 45),
                     (byte)(63 + 17),
                     (byte)(20 + 77),
                     (byte)(28 + 72),
                     (byte)(66 + 34),
                     (byte)(20 + 85),
                     (byte)(20 + 90),
                     (byte)(15 + 88)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ςΦζσμτΓσ.A("øąĄÇćăþćĒāÎČĐĉČĒÔѤэѧѯѳќѫѰѪ", (byte)11, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ξΦοφωαοσμ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.B("ĕķĹęĽŜŔŪŖĥţřŧšĪŏűŰŨŮŨĽ", (byte)55, 66), ξΦοφωαοσμ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μζξτΩσσφυδεπλΨ.E("Ֆգբԥեա՜եհ՟ԬժծէժհԲࣂࢫࣅ࣑࣍ࢺࣉ࣎ࣈՇ", (byte)55, 69) + var1 + ΦδφπθΩΩλζξ.F("ԭ", (byte)55, 70) + var2.toString(), var4
         );
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(PlayerMoveEvent var1) {
      if (ΣλνΨουΩΔοθεβ.z.ar()) {
         Player var2 = var1.getPlayer();
         Location var3 = var1.getFrom();
         Location var4 = var1.getTo();
         if (var4 == null || !(var3.getY() > var4.getY()) || b != null && var2.getGameMode() == b) {
            ιηοψσγξςΩγδ var5 = this.a.b(this.g.b().a(var2));
            if (!var5.a().b(οωλθςδυΛβσΨδγπ.g) || var5.d(πβκνλοΛκΠδΦτφλ.y)) {
               var1.setTo(var3);
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerBedEnterEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)ae);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(InventoryClickEvent var1) {
      if (this.c.a(var1.getWhoClicked()) && this.a(var1.getView())) {
         var1.setCancelled((boolean)al);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerEditBookEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((boolean)af);
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(PlayerCommandPreprocessEvent var1) {
      ΨαχΨχΣλεΠψΦ var2 = this.g.b().a(var1.getPlayer());
      String var3 = var1.getMessage().trim();
      String var4 = this.g.a().b().a(var2, var3);
      if (var4 == null) {
         var1.setCancelled((boolean)s);
      } else {
         if (!var3.equals(var4)) {
            var1.setMessage(var4);
         }
      }
   }
}
