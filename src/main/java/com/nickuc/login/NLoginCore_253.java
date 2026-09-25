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

public class NLoginCore_253 implements NLoginInterface_027 {
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
   private final NLoginCore_187 a;
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
   private static String[] ZKM_STR_B = new String[bm];
   private static int ba = Integer.reverse(0);
   private static long bp = Long.reverse(6917529027641081856L);
   private static int ap = 112 >>> 196 | 112 << -196;
   private static int z = (67108864 >>> 122 | 67108864 << -122) & -1;
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int y = Integer.reverse(0);
   private static long bj = Long.reverse(-2035373346204415242L);
   private static long ar = Long.reverse(-2035373346204415242L);
   private final NLoginCore_209 c;
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
   private static String[] ZKM_STR_A = new String[bl];
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
      ((NLoginCore_209)this.g.a().b()).a(var1);
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerDropItemEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((ah != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void b(PlayerCommandPreprocessEvent var1) {
      if (!this.o && var1.isCancelled() && this.a(var1.getMessage())) {
         var1.setCancelled((ay != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerInteractEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((aa != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerShearEntityEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((ac != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerItemConsumeEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((aj != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void b(PlayerJoinEvent var1) {
      ((NLoginCore_209)this.g.a().b()).a(var1);
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerItemHeldEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((ai != 0));
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
               ZKM_STR_B[0] = NLoginCore_110.D("ЂмЀщятщПгдафвзЭШьљджгџЦЧ", (byte)10, 68);
               ZKM_STR_B[1] = NLoginCore_004.C("ишЄычрЊЅѓыьЛ", (byte)10, 67);
               ZKM_STR_B[2] = NLoginCore_433.E(
                  "ӵԎԺՁԞԝԯԏԅԀԽԖԅԅԵՉԮԚՋԯԠՅՔՁՖՌՉԗԕԯ՜ԹՑՕԡԪ՛\u0530՜ԡԥ՞դէԳդԾ՞ԷՊղՅգԫ\u0530ՉՑՠյՂՏՓ\u0558ջձաՠՐ՝՞ՙՒՄՐդտ՚֊բ\u058bրկ֒ռծ՟ըՌլիձ֛ճհ֞֗", (byte)10, 69
               );
               ZKM_STR_B[3] = NLoginCore_553.F("ԫԻӷԾԺԳӽӸՆԾԿԎ", (byte)10, 70);
               ZKM_STR_B[4] = NLoginCore_427.C("ЃЫуЌШЛмѓЦцчсБВБэшКМѕЩѝњўтѥНѧаѢўѬыѝФѫѡњтаЭрѲѤѡѷљкжѨѭљнѬѪія҆ѻѕѵѪѴѣѶѵ҂стѩѐяцѓѢћ", (byte)10, 67);
               ZKM_STR_B[5] = NLoginCore_232.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĨĖĘćĖěıĎĜöĬĉĆć", (byte)10, 65);
               ZKM_STR_B[6] = NLoginCore_471.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԱՃՅաբՠաԦԯծԻԼԹԺ", (byte)10, 70);
               ZKM_STR_B[7] = NLoginCore_397.C("ЈлІънЪпШДТъЧЧЬєЯњќЙиаџЦЧ", (byte)10, 67);
               ZKM_STR_B[8] = NLoginCore_433.D("ЌьІПЊхЬђодАёьѐЕХяХявЮйЦЧ", (byte)10, 68);
               ZKM_STR_B[9] = NLoginCore_141.F("ԺԞԓՂԜӺՁԏԒԁԣԃԾԞԩԛԚԼԤԺՆԜԙԚ", (byte)10, 70);
               ZKM_STR_B[10] = NLoginCore_433.C("НУщКЌПТшятТЛ", (byte)10, 67);
               ZKM_STR_B[11] = NLoginCore_384.F("ԌӼԖԲԑԙԼԏԷԸԈԎ", (byte)10, 70);
               ZKM_STR_B[12] = NLoginCore_427.C("ЬЈкТЬЙђЩБУаАъФЧШжшОпњйЦЧ", (byte)10, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.C("ЂмЀщятщПгдаіѐяяјѐѓђмћџЦЧ", (byte)10, 67);
               ZKM_STR_B[1] = NLoginCore_521.C("чниМЇЋмЋуЋшЛ", (byte)10, 67);
               ZKM_STR_B[2] = NLoginCore_471.A("ÂÛćĎëêüÜÒÍĊãÒÒĂĖûçĘüíĒġĎģęĖäâüĩĆĞĢî÷ĨýĩîòīıĴĀıċīĄėĿĒİøýĖĞĭłďĜĠĥňľĮĭĝĪīĦğđĝıŌħŗįŘōļşŉĻīĿľĴĵŧĴĺŇšŁ", (byte)10, 65);
               ZKM_STR_B[3] = NLoginCore_575.D("хЭЦуоЪомРШшЛ", (byte)10, 68);
               ZKM_STR_B[4] = NLoginCore_223.F("ӶԞԶӿԛԎԯՆԙԹԺԴԄԅԄՀԻԍԏՈԜՐՍՑԵ\u0558Ԑ՚ԣՕՑ՟ԾՐԗ՞ՔՍԵԣԠԳե\u0557ՔժՌԭԩ՛ՠՌ\u0530՟՝ՉՂչծՈը՝էՖջՍիԴՑՕ՚ռ՚եՑՎ", (byte)10, 70);
               ZKM_STR_B[5] = NLoginCore_076.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĩîıðìĵĨčĬħøęĆć", (byte)10, 65);
               ZKM_STR_B[6] = NLoginCore_141.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԳՆՓգաՉաիղձզբԹԺ", (byte)10, 70);
               ZKM_STR_B[7] = NLoginCore_427.D("ЈлІънЪпШДТщаЩвћќвЖлђиЩЦЧ", (byte)10, 68);
               ZKM_STR_B[8] = NLoginCore_223.C("ЌьІПЊхЬђодЏтбГъЧаццЪгЗЮяяаѠёєйСѡ", (byte)10, 67);
               ZKM_STR_B[9] = NLoginCore_521.A("ćëàďéÇĎÜßÎïÖåęêøĊđēÞóğæç", (byte)10, 65);
               ZKM_STR_B[10] = NLoginCore_553.D("щюЩЊЮЌшЅЋОьЛ", (byte)10, 68);
               ZKM_STR_B[11] = NLoginCore_232.F("ԐԭԿԫԼԷԁԵԗӿԢՃԋՋՂՎԬԏԯԪՒԜԙԚ", (byte)10, 70);
               ZKM_STR_B[12] = NLoginCore_433.C("ЬЈкТЬЙђЩБУЯщєУЧьжЯЯЫОџЦЧ", (byte)10, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.E("ӺԿԬӴԏԳԲՂԷԆԴԟԆՄԶԛՈՉԫՂՂՒԙԚ", (byte)10, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.B("ÅÊāøøċďÞñäÕáÕêĂėåÕĆÕĒàġĜĠâāāĝġěö", (byte)10, 66);
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
            var10002[b] = a(c & d, e);
            var10002[f] = a(g, h ^ i);
            var10002[j] = a(k, l);
            var10002[m] = a(n, o);
            var10002[p] = a(q, r);
            var1.disallow(var10001, NLoginCore_112.a(var10002));
         }
      }
   }

   static {
      b();

      GameMode var0;
      try {
         var0 = GameMode.valueOf(a(bn, bo ^ bp));
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
         var1.setCancelled((ak != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerInteractEntityEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((ab != 0));
      }
   }

   private boolean a(Object var1) {
      if (var1 == null) {
         return (am != 0);
      } else {
         List var2 = NLoginCore_477.D.a(new Object[an]);
         if (var2.isEmpty()) {
            return (ao != 0);
         } else {
            String var3;
            try {
               var3 = NLoginCore_546.b(var1.getClass(), a(ap & aq, ar)).invoke(var1).toString();
            } catch (ReflectiveOperationException var5) {
               throw new RuntimeException(a(au, av) + var1.getClass().getCanonicalName() + a(aw, ax), var5);
            }

            return var2.stream().filter(Objects::nonNull).noneMatch(var1x -> NLoginCore_065.m(var1x).contains(var3));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(PlayerKickEvent var1) {
      String var2 = var1.getReason();
      int var3 = !var2.equalsIgnoreCase(a(t, u)) && (this.a.b(this.g.b().a(var1.getPlayer())) || !var2.equalsIgnoreCase(a(v, w))) ? y : x;
      if (var3 != 0) {
         var1.setCancelled((z != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void a(ServerCommandEvent var1) {
      if (!this.o && var1 instanceof Cancellable && var1.isCancelled() && this.a(var1.getCommand())) {
         var1.setCancelled((az != 0));
      }
   }

   private boolean a(String var1) {
      if (!var1.isEmpty()) {
         if (var1.charAt(ba) != bb) {
            var1 = bc + var1;
         }

         String[] var2 = var1.split(a(bd, be));
         if (var2.length > bf) {
            String var3 = var2[bg].toLowerCase(Locale.ENGLISH);
            return var3.equals(a(bh & bi, bj));
         }
      }

      return (bk != 0);
   }

   @Generated
   public NLoginCore_253(nLoginBukkit var1, NLoginCore_187 var2, NLoginCore_209 var3, boolean var4) {
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
         var1.setCancelled((ag != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerFishEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((ad != 0));
      }
   }

   @EventHandler
   public void a(PlayerRespawnEvent var1) {
      Player var2 = var1.getPlayer();
      if (!this.g.a().a().b(var2.getName(), var2.getUniqueId())) {
         NLoginCore_447 var3 = (NLoginCore_447)this.g.a().b();
         Location var4 = var3.a().e();
         if (var4 != null) {
            var1.setRespawnLocation(var4);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 6L;
      var1 ^= 2082339479008291025L;
      if (ZKM_STR_A[var0] == null) {
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
            throw new RuntimeException(NLoginCore_324.A("øąĄÇćăþćĒāÎČĐĉČĒÔѤэѧѯѳќѫѰѪ", (byte)11, 65));
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
                  NLoginCore_253.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.B("ĕķĹęĽŜŔŪŖĥţřŧšĪŏűŰŨŮŨĽ", (byte)55, 66), NLoginCore_253.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.E("Ֆգբԥեա՜եհ՟ԬժծէժհԲࣂࢫࣅ࣑࣍ࢺࣉ࣎ࣈՇ", (byte)55, 69) + var1 + NLoginCore_232.F("ԭ", (byte)55, 70) + var2.toString(), var4
         );
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(PlayerMoveEvent var1) {
      if (NLoginCore_477.z.ar()) {
         Player var2 = var1.getPlayer();
         Location var3 = var1.getFrom();
         Location var4 = var1.getTo();
         if (var4 == null || !(var3.getY() > var4.getY()) || b != null && var2.getGameMode() == b) {
            NLoginCore_509 var5 = this.a.b(this.g.b().a(var2));
            if (!var5.a().b(NLoginCore_077.g) || var5.d(NLoginCore_567.y)) {
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
         var1.setCancelled((ae != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(InventoryClickEvent var1) {
      if (this.c.a(var1.getWhoClicked()) && this.a(var1.getView())) {
         var1.setCancelled((al != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerEditBookEvent var1) {
      if (this.c.a(var1)) {
         var1.setCancelled((af != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(PlayerCommandPreprocessEvent var1) {
      NLoginCore_277 var2 = this.g.b().a(var1.getPlayer());
      String var3 = var1.getMessage().trim();
      String var4 = this.g.a().b().a(var2, var3);
      if (var4 == null) {
         var1.setCancelled((s != 0));
      } else {
         if (!var3.equals(var4)) {
            var1.setMessage(var4);
         }
      }
   }
}
