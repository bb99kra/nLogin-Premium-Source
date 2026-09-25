/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Cancellable
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryOpenEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent$Result
 *  org.bukkit.event.player.PlayerBedEnterEvent
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 *  org.bukkit.event.player.PlayerDropItemEvent
 *  org.bukkit.event.player.PlayerEditBookEvent
 *  org.bukkit.event.player.PlayerEvent
 *  org.bukkit.event.player.PlayerFishEvent
 *  org.bukkit.event.player.PlayerInteractEntityEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.event.player.PlayerItemConsumeEvent
 *  org.bukkit.event.player.PlayerItemHeldEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerKickEvent
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.event.player.PlayerPickupItemEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.event.player.PlayerRespawnEvent
 *  org.bukkit.event.player.PlayerShearEntityEvent
 *  org.bukkit.event.server.ServerCommandEvent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_209;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
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
import org.bukkit.entity.Entity;
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
import org.bukkit.event.player.PlayerEvent;
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
import org.bukkit.event.server.ServerCommandEvent;

public class NLoginCore_253
implements NLoginInterface_027 {
    private static int at;
    private static long w;
    private static long var_long_c;
    private static int aw;
    private static int s;
    private static int n;
    private static int ai;
    private static long bo;
    private static int af;
    private static long var_long_o;
    private static int as;
    private final NLoginCore_187 var_com_nickuc_login_NLoginCore_187_a;
    private static int aa;
    private static int ao;
    private final boolean var_boolean_o;
    private static int k;
    private static int bh;
    private static int j;
    private static int var_int_g;
    private static long be;
    private static long ax;
    private static int bm;
    private static long u;
    private static int ad;
    private static int bn;
    private static int aq;
    private static int x;
    private static int ay;
    private static int p;
    private static int bl;
    private static long h;
    private static int al;
    private static int v;
    private static long e;
    private static int am;
    private static int m;
    private static int bk;
    private static int aj;
    private static int t;
    private static int f;
    private static int bg;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_g;
    private static int ag;
    private static int ak;
    private static String[] var_java_lang_String_arr_b;
    private static int ba;
    private static long bp;
    private static int ap;
    private static int z;
    private static int bf;
    private static int var_int_c;
    private static int y;
    private static long bj;
    private static long ar;
    private final NLoginCore_209 var_com_nickuc_login_NLoginCore_209_c;
    private static int d;
    private static int bb;
    private static int ab;
    private static int bd;
    private static long i;
    private static long l;
    private static final GameMode var_org_bukkit_GameMode_b;
    private static long av;
    private static int bi;
    private static long r;
    private static int ae;
    private static int ah;
    private static int az;
    private static String[] var_java_lang_String_arr_a;
    private static int ac;
    private static int bc;
    private static int au;
    private static int var_int_b;
    private static int var_int_a;
    private static int an;
    private static int q;

    @EventHandler(priority=EventPriority.LOW)
    public void b(PlayerQuitEvent playerQuitEvent) {
        ((NLoginCore_209)this.var_com_nickuc_login_bukkit_nLoginBukkit_g.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_056_b()).a(playerQuitEvent);
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerDropItemEvent playerDropItemEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerDropItemEvent)) {
            playerDropItemEvent.setCancelled(ah != 0);
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void b(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        if (!this.var_boolean_o && playerCommandPreprocessEvent.isCancelled() && this.a(playerCommandPreprocessEvent.getMessage())) {
            playerCommandPreprocessEvent.setCancelled(ay != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerInteractEvent playerInteractEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerInteractEvent)) {
            playerInteractEvent.setCancelled(aa != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerShearEntityEvent playerShearEntityEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerShearEntityEvent)) {
            playerShearEntityEvent.setCancelled(ac != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerItemConsumeEvent playerItemConsumeEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerItemConsumeEvent)) {
            playerItemConsumeEvent.setCancelled(aj != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOW)
    public void b(PlayerJoinEvent playerJoinEvent) {
        ((NLoginCore_209)this.var_com_nickuc_login_bukkit_nLoginBukkit_g.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_056_b()).a(playerJoinEvent);
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerItemHeldEvent playerItemHeldEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerItemHeldEvent)) {
            playerItemHeldEvent.setCancelled(ai != 0);
        }
    }

    private static void b() {
        int n;
        var_long_c = 8020924532559119297L;
        long l = var_long_c ^ 0x1CE5F4B9340FA8D1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(63 + 6), (byte)(33 + 50), (byte)(10 + 37), (byte)(21 + 46), (byte)(41 + 25), (byte)(47 + 20), (byte)(41 + 6), (byte)(45 + 35), (byte)(43 + 32), (byte)(21 + 46), (byte)(4 + 79), (byte)(40 + 13), 80, (byte)(78 + 19), (byte)(88 + 12), (byte)(52 + 48), 105, (byte)(67 + 43), (byte)(92 + 11)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    NLoginCore_253.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ЂмЀщятщПгдафвзЭШьљджгџЦЧ", (byte)10, 68);
                    NLoginCore_253.var_java_lang_String_arr_b[1] = NLoginCore_451.C("ишЄычрЊЅѓыьЛ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ӵԎԺՁԞԝԯԏԅԀԽԖԅԅԵՉԮԚՋԯԠՅՔՁՖՌՉԗԕԯ՜ԹՑՕԡԪ՛԰՜ԡԥ՞դէԳդԾ՞ԷՊղՅգԫ԰ՉՑՠյՂՏՓ՘ջձաՠՐ՝՞ՙՒՄՐդտ՚֊բ֋րկ֒ռծ՟ըՌլիձ֛ճհ֞֗", (byte)10, 69);
                    NLoginCore_253.var_java_lang_String_arr_b[3] = NLoginCore_076.F("ԫԻӷԾԺԳӽӸՆԾԿԎ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ЃЫуЌШЛмѓЦцчсБВБэшКМѕЩѝњўтѥНѧаѢўѬыѝФѫѡњтаЭрѲѤѡѷљкжѨѭљнѬѪія҆ѻѕѵѪѴѣѶѵ҂стѩѐяцѓѢћ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[5] = NLoginCore_559.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĨĖĘćĖěıĎĜöĬĉĆć", (byte)10, 65);
                    NLoginCore_253.var_java_lang_String_arr_b[6] = NLoginCore_384.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԱՃՅաբՠաԦԯծԻԼԹԺ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ЈлІънЪпШДТъЧЧЬєЯњќЙиаџЦЧ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[8] = NLoginCore_223.D("ЌьІПЊхЬђодАёьѐЕХяХявЮйЦЧ", (byte)10, 68);
                    NLoginCore_253.var_java_lang_String_arr_b[9] = NLoginCore_138.F("ԺԞԓՂԜӺՁԏԒԁԣԃԾԞԩԛԚԼԤԺՆԜԙԚ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[10] = NLoginCore_223.C("НУщКЌПТшятТЛ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[11] = NLoginCore_324.F("ԌӼԖԲԑԙԼԏԷԸԈԎ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[12] = NLoginCore_027.C("ЬЈкТЬЙђЩБУаАъФЧШжшОпњйЦЧ", (byte)10, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_253.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ЂмЀщятщПгдаіѐяяјѐѓђмћџЦЧ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[1] = NLoginCore_091.C("чниМЇЋмЋуЋшЛ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[2] = NLoginCore_384.A("ÂÛćĎëêüÜÒÍĊãÒÒĂĖûçĘüíĒġĎģęĖäâüĩĆĞĢî÷ĨýĩîòīıĴĀıċīĄėĿĒİøýĖĞĭłďĜĠĥňľĮĭĝĪīĦğđĝıŌħŗįŘōļşŉĻīĿľĴĵŧĴĺŇšŁ", (byte)10, 65);
                    NLoginCore_253.var_java_lang_String_arr_b[3] = NLoginCore_575.D("хЭЦуоЪомРШшЛ", (byte)10, 68);
                    NLoginCore_253.var_java_lang_String_arr_b[4] = NLoginCore_223.F("ӶԞԶӿԛԎԯՆԙԹԺԴԄԅԄՀԻԍԏՈԜՐՍՑԵ՘Ԑ՚ԣՕՑ՟ԾՐԗ՞ՔՍԵԣԠԳե՗ՔժՌԭԩ՛ՠՌ԰՟՝ՉՂչծՈը՝էՖջՍիԴՑՕ՚ռ՚եՑՎ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[5] = NLoginCore_427.A("ĉĈĎûÈêąĔÜâďĈăĘäÖěÖþĕÖéâāĄăÜĦĔýĚåĔùįĠĠĦĈĪĕĔĩîıðìĵĨčĬħøęĆć", (byte)10, 65);
                    NLoginCore_253.var_java_lang_String_arr_b[6] = NLoginCore_138.F("ԲԷԹԭӼՄԵԠԒԥԈԶԊԞՁԅՍԧՉՉԤՕԏԠՎՍՄՊԻԽ՚ՈԸՎ՛ԙՐՑբԷ՞ՂԳՆՓգաՉաիղձզբԹԺ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ЈлІънЪпШДТщаЩвћќвЖлђиЩЦЧ", (byte)10, 68);
                    NLoginCore_253.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ЌьІПЊхЬђодЏтбГъЧаццЪгЗЮяяаѠёєйСѡ", (byte)10, 67);
                    NLoginCore_253.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ćëàďéÇĎÜßÎïÖåęêøĊđēÞóğæç", (byte)10, 65);
                    NLoginCore_253.var_java_lang_String_arr_b[10] = NLoginCore_076.D("щюЩЊЮЌшЅЋОьЛ", (byte)10, 68);
                    NLoginCore_253.var_java_lang_String_arr_b[11] = NLoginCore_559.F("ԐԭԿԫԼԷԁԵԗӿԢՃԋՋՂՎԬԏԯԪՒԜԙԚ", (byte)10, 70);
                    NLoginCore_253.var_java_lang_String_arr_b[12] = NLoginCore_223.C("ЬЈкТЬЙђЩБУЯщєУЧьжЯЯЫОџЦЧ", (byte)10, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_253.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ӺԿԬӴԏԳԲՂԷԆԴԟԆՄԶԛՈՉԫՂՂՒԙԚ", (byte)10, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_253.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ÅÊāøøċďÞñäÕáÕêĂėåÕĆÕĒàġĜĠâāāĝġěö", (byte)10, 66);
                }
            }
        }
    }

    @EventHandler(priority=EventPriority.LOW)
    public void a(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        InetAddress inetAddress = asyncPlayerPreLoginEvent.getAddress();
        if (inetAddress == null || inetAddress.getHostAddress() == null) {
            String[] stringArray = new String[var_int_a];
            stringArray[NLoginCore_253.var_int_b] = NLoginCore_253.c("㺀", (int)(var_int_c & d), (long)e);
            stringArray[NLoginCore_253.f] = NLoginCore_253.c("㺃", (int)var_int_g, (long)(h ^ i));
            stringArray[NLoginCore_253.j] = NLoginCore_253.c("㺆", (int)k, (long)l);
            stringArray[NLoginCore_253.m] = NLoginCore_253.c("㺉", (int)n, (long)var_long_o);
            stringArray[NLoginCore_253.p] = NLoginCore_253.c("㺌", (int)q, (long)r);
            asyncPlayerPreLoginEvent.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, NLoginCore_112.a(stringArray));
        }
    }

    static {
        GameMode gameMode;
        var_int_a = (0x14000000 >>> 154 | 0x14000000 << -154) & 0xFFFFFFFF;
        var_int_b = 0 >>> 151 | 0 << -151;
        var_int_c = Integer.reverse(0);
        d = -1 >>> 5 | -1 << ~5 + 1;
        e = Long.reverse(-2035373346204415242L);
        f = (64 >>> 134 | 64 << -134) & 0xFFFFFFFF;
        var_int_g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-8952902373845497098L);
        i = Long.reverse(0x6000000000000000L);
        j = (0x10000000 >>> 187 | 0x10000000 << ~187 + 1) & 0xFFFFFFFF;
        k = (0x8000000 >>> 122 | 0x8000000 << ~122 + 1) & 0xFFFFFFFF;
        l = Long.reverse(-2035373346204415242L);
        m = Integer.reverse(-1073741824);
        n = Integer.reverse(-1073741824);
        var_long_o = Long.reverse(-2035373346204415242L);
        p = 524288 >>> 81 | 524288 << -81;
        q = 256 >>> 38 | 256 << -38;
        r = Long.reverse(-2035373346204415242L);
        s = Integer.reverse(Integer.MIN_VALUE);
        t = (2560 >>> 105 | 2560 << -105) & 0xFFFFFFFF;
        u = Long.reverse(-2035373346204415242L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-2035373346204415242L);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(0);
        z = (0x4000000 >>> 122 | 0x4000000 << -122) & 0xFFFFFFFF;
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = (64 >>> 102 | 64 << -102) & 0xFFFFFFFF;
        ac = 2 >>> 65 | 2 << -65;
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = 0x1000000 >>> 88 | 0x1000000 << -88;
        ag = 131072 >>> 49 | 131072 << ~49 + 1;
        ah = (524288 >>> 19 | 524288 << ~19 + 1) & 0xFFFFFFFF;
        ai = Integer.reverse(Integer.MIN_VALUE);
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = (2048 >>> 107 | 2048 << -107) & 0xFFFFFFFF;
        al = Integer.reverse(Integer.MIN_VALUE);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = Integer.reverse(0);
        ao = 0x2000000 >>> 185 | 0x2000000 << -185;
        ap = 112 >>> 196 | 112 << -196;
        aq = Integer.reverse(-1);
        ar = Long.reverse(-2035373346204415242L);
        as = Integer.reverse(0);
        at = (0 >>> 41 | 0 << -41) & 0xFFFFFFFF;
        au = 0x4000000 >>> 55 | 0x4000000 << -55;
        av = Long.reverse(-2035373346204415242L);
        aw = (144 >>> 100 | 144 << ~100 + 1) & 0xFFFFFFFF;
        ax = Long.reverse(-2035373346204415242L);
        ay = (0 >>> 187 | 0 << -187) & 0xFFFFFFFF;
        az = Integer.reverse(0);
        ba = Integer.reverse(0);
        bb = (752 >>> 36 | 752 << -36) & 0xFFFFFFFF;
        bc = 0x5E000000 >>> 57 | 0x5E000000 << -57;
        bd = 5 >>> 191 | 5 << -191;
        be = Long.reverse(-2035373346204415242L);
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = Integer.reverse(0);
        bh = Integer.reverse(-805306368);
        bi = -1 >>> 99 | -1 << -99;
        bj = Long.reverse(-2035373346204415242L);
        bk = (0 >>> 34 | 0 << -34) & 0xFFFFFFFF;
        bl = Integer.reverse(-1342177280);
        bm = (0x680000 >>> 243 | 0x680000 << ~243 + 1) & 0xFFFFFFFF;
        bn = Integer.reverse(0x30000000);
        bo = Long.reverse(-8952902373845497098L);
        bp = Long.reverse(0x6000000000000000L);
        var_java_lang_String_arr_a = new String[bl];
        var_java_lang_String_arr_b = new String[bm];
        NLoginCore_253.b();
        try {
            gameMode = GameMode.valueOf((String)NLoginCore_253.c("㺀", (int)bn, (long)(bo ^ bp)));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            gameMode = null;
        }
        var_org_bukkit_GameMode_b = gameMode;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(InventoryOpenEvent inventoryOpenEvent) {
        HumanEntity humanEntity = inventoryOpenEvent.getPlayer();
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((Entity)humanEntity) && this.boolean_a(inventoryOpenEvent.getView())) {
            inventoryOpenEvent.setCancelled(ak != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerInteractEntityEvent playerInteractEntityEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerInteractEntityEvent)) {
            playerInteractEntityEvent.setCancelled(ab != 0);
        }
    }

    private boolean boolean_a(Object object) {
        String string;
        if (object == null) {
            return am != 0;
        }
        List<String> list = NLoginCore_532.D.a(new Object[an]);
        if (list.isEmpty()) {
            return ao != 0;
        }
        try {
            string = NLoginCore_546.b(object.getClass(), (String)NLoginCore_253.c("㺀", (int)(ap & aq), (long)ar), new Class[as]).invoke(object, new Object[at]).toString();
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_253.c("㺃", (int)au, (long)av) + object.getClass().getCanonicalName() + (String)NLoginCore_253.c("㺆", (int)aw, (long)ax), reflectiveOperationException);
        }
        return list.stream().filter(Objects::nonNull).noneMatch(string2 -> NLoginCore_065.m(string2).contains(string));
    }

    @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
    public void a(PlayerKickEvent playerKickEvent) {
        int n;
        String string = playerKickEvent.getReason();
        int n2 = n = string.equalsIgnoreCase((String)NLoginCore_253.c("㺀", (int)t, (long)u)) || !this.var_com_nickuc_login_NLoginCore_187_a.boolean_b(this.var_com_nickuc_login_bukkit_nLoginBukkit_g.java_lang_Object_b().a(playerKickEvent.getPlayer())) && string.equalsIgnoreCase((String)NLoginCore_253.c("㺃", (int)v, (long)w)) ? x : y;
        if (n != 0) {
            playerKickEvent.setCancelled(z != 0);
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void a(ServerCommandEvent serverCommandEvent) {
        if (!this.var_boolean_o && serverCommandEvent instanceof Cancellable && serverCommandEvent.isCancelled() && this.a(serverCommandEvent.getCommand())) {
            serverCommandEvent.setCancelled(az != 0);
        }
    }

    private boolean a(String string) {
        if (!string.isEmpty()) {
            String[] stringArray;
            if (string.charAt(ba) != bb) {
                string = (char)bc + string;
            }
            if ((stringArray = string.split((String)NLoginCore_253.c("㺀", (int)bd, (long)be))).length > bf) {
                String string2 = stringArray[bg].toLowerCase(Locale.ENGLISH);
                return string2.equals(NLoginCore_253.c("㺃", (int)(bh & bi), (long)bj));
            }
        }
        return bk != 0;
    }

    @Generated
    public NLoginCore_253(nLoginBukkit nLoginBukkit2, NLoginCore_187 NLoginCore_1872, NLoginCore_209 NLoginCore_2092, boolean bl) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_g = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_187_a = NLoginCore_1872;
        this.var_com_nickuc_login_NLoginCore_209_c = NLoginCore_2092;
        this.var_boolean_o = bl;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerPickupItemEvent playerPickupItemEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerPickupItemEvent)) {
            playerPickupItemEvent.setCancelled(ag != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerFishEvent playerFishEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerFishEvent)) {
            playerFishEvent.setCancelled(ad != 0);
        }
    }

    @EventHandler
    public void a(PlayerRespawnEvent playerRespawnEvent) {
        Player player = playerRespawnEvent.getPlayer();
        if (this.var_com_nickuc_login_bukkit_nLoginBukkit_g.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a().b(player.getName(), player.getUniqueId())) {
            return;
        }
        NLoginCore_447 NLoginCore_4472 = (NLoginCore_447)this.var_com_nickuc_login_bukkit_nLoginBukkit_g.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginType_005_b();
        Location location = NLoginCore_4472.com_nickuc_login_NLoginCore_456_a().e();
        if (location != null) {
            playerRespawnEvent.setRespawnLocation(location);
        }
    }

    private static String a(int n, long l) {
        l ^= 6L;
        l ^= 0x1CE5F4B9340FA8D1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(31 + 38), 83, (byte)(28 + 19), (byte)(37 + 30), (byte)(13 + 53), (byte)(41 + 26), (byte)(44 + 3), (byte)(10 + 70), (byte)(35 + 40), (byte)(41 + 26), 83, (byte)(8 + 45), (byte)(63 + 17), (byte)(20 + 77), (byte)(28 + 72), (byte)(66 + 34), (byte)(20 + 85), (byte)(20 + 90), (byte)(15 + 88)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.A("øąĄÇćăþćĒāÎČĐĉČĒÔѤэѧѯѳќѫѰѪ", (byte)11, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_253.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_253.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("ĕķĹęĽŜŔŪŖĥţřŧšĪŏűŰŨŮŨĽ", (byte)55, 66), NLoginCore_253.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.E("Ֆգբԥեա՜եհ՟ԬժծէժհԲࣂࢫࣅ࣑࣍ࢺࣉ࣎ࣈՇ", (byte)55, 69) + string + NLoginCore_559.F("ԭ", (byte)55, 70) + methodType.toString(), exception);
        }
    }

    @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
    public void a(PlayerMoveEvent playerMoveEvent) {
        if (!NLoginCore_532.z.ar()) {
            return;
        }
        Player player = playerMoveEvent.getPlayer();
        Location location = playerMoveEvent.getFrom();
        Location location2 = playerMoveEvent.getTo();
        if (location2 != null && location.getY() > location2.getY() && (var_org_bukkit_GameMode_b == null || player.getGameMode() != var_org_bukkit_GameMode_b)) {
            return;
        }
        NLoginCore_509 NLoginCore_5092 = this.var_com_nickuc_login_NLoginCore_187_a.com_nickuc_login_NLoginCore_509_b(this.var_com_nickuc_login_bukkit_nLoginBukkit_g.java_lang_Object_b().a(player));
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g) && !NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_y)) {
            return;
        }
        playerMoveEvent.setTo(location);
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerBedEnterEvent playerBedEnterEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerBedEnterEvent)) {
            playerBedEnterEvent.setCancelled(ae != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(InventoryClickEvent inventoryClickEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((Entity)inventoryClickEvent.getWhoClicked()) && this.boolean_a(inventoryClickEvent.getView())) {
            inventoryClickEvent.setCancelled(al != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerEditBookEvent playerEditBookEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_c.a((PlayerEvent)playerEditBookEvent)) {
            playerEditBookEvent.setCancelled(af != 0);
        }
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void a(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_bukkit_nLoginBukkit_g.java_lang_Object_b().a(playerCommandPreprocessEvent.getPlayer());
        String string = playerCommandPreprocessEvent.getMessage().trim();
        String string2 = this.var_com_nickuc_login_bukkit_nLoginBukkit_g.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, string);
        if (string2 == null) {
            playerCommandPreprocessEvent.setCancelled(s != 0);
            return;
        }
        if (!string.equals(string2)) {
            playerCommandPreprocessEvent.setMessage(string2);
        }
    }
}

