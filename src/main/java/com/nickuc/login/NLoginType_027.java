/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.ServerConnectType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.event.velocity.connection.DefineAuthServerEvent
 *  com.nickuc.login.api.event.velocity.connection.ServerPreConnectEvent
 *  com.velocitypowered.api.event.PostOrder
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.player.PlayerChooseInitialServerEvent
 *  com.velocitypowered.api.event.player.ServerPostConnectEvent
 *  com.velocitypowered.api.event.player.ServerPreConnectEvent
 *  com.velocitypowered.api.event.player.ServerPreConnectEvent$ServerResult
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.ServerConnection
 *  com.velocitypowered.api.proxy.server.RegisteredServer
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.velocity.connection.DefineAuthServerEvent;
import com.nickuc.login.api.event.velocity.connection.ServerPreConnectEvent;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_031;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.PlayerChooseInitialServerEvent;
import com.velocitypowered.api.event.player.ServerPostConnectEvent;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginType_027
implements NLoginInterface_029 {
    private static long f;
    private static int bx;
    private static long as;
    private static int ao;
    private static int ak;
    private static int t;
    private static int ax;
    private static long bw;
    private static int bj;
    private static long m;
    private static int var_int_e;
    private static long ac;
    private static String[] var_java_lang_String_arr_b;
    private static int ck;
    private static long j;
    private static int ay;
    private static int bb;
    private final NLoginType_008 F;
    private static int cc;
    private static long x;
    private static int ca;
    private static int bl;
    private static int bs;
    private static long am;
    private static int be;
    private static int bg;
    private static int at;
    private static int bi;
    private static int an;
    private static long ar;
    private static int az;
    private static int bh;
    private static int ce;
    private static int br;
    private static int z;
    private static int bo;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_e;
    private static long o;
    private static long ba;
    private static int q;
    private static int bf;
    private static int cd;
    private static int by;
    private static long bz;
    private static int au;
    private static int p;
    private static long c;
    private static int aj;
    private static long cj;
    private static long ci;
    private static int av;
    private static int y;
    private static int bp;
    private static int cg;
    private static long ab;
    private static String[] var_java_lang_String_arr_a;
    private static long bd;
    private static int l;
    private static int bn;
    private static int ad;
    private static int bm;
    private static int n;
    private static int w;
    private static int k;
    private static int cf;
    private static int bc;
    private static int v;
    private static long var_long_b;
    private static int var_int_a;
    private static int aq;
    private static int bu;
    private static long r;
    private static int aa;
    private static int ah;
    private static int aw;
    private static int bv;
    private static long ap;
    private static long u;
    private static int ch;
    private static int cb;
    private static int i;
    private static int s;
    private static long af;
    private static long d;
    private static int ae;
    private static long ai;
    private static int bk;
    private static int ag;
    private static int cl;
    private static long g;
    private static int bt;
    private static int bq;
    private static int h;
    private static int al;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-3530781212475344562L);
        d = Long.reverse(-7782220156096217088L);
        var_int_e = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
        f = Long.reverse(-3530781212475344562L);
        g = Long.reverse(-7782220156096217088L);
        h = Integer.reverse(0x40000000);
        i = Integer.reverse(-1);
        j = Long.reverse(6557281952834566478L);
        k = 0 >>> 167 | 0 << -167;
        l = Integer.reverse(-1073741824);
        m = Long.reverse(6557281952834566478L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(6557281952834566478L);
        p = Integer.reverse(-1610612736);
        q = Integer.reverse(-1);
        r = Long.reverse(6557281952834566478L);
        s = (24576 >>> 204 | 24576 << ~204 + 1) & 0xFFFFFFFF;
        t = (-1 >>> 5 | -1 << -5) & 0xFFFFFFFF;
        u = Long.reverse(6557281952834566478L);
        v = (0 >>> 150 | 0 << ~150 + 1) & 0xFFFFFFFF;
        w = 14336 >>> 171 | 14336 << ~171 + 1;
        x = Long.reverse(6557281952834566478L);
        y = 1024 >>> 106 | 1024 << ~106 + 1;
        z = Integer.reverse(0);
        aa = Integer.reverse(0x10000000);
        ab = Long.reverse(-3530781212475344562L);
        ac = Long.reverse(-7782220156096217088L);
        ad = (1152 >>> 7 | 1152 << ~7 + 1) & 0xFFFFFFFF;
        ae = (-1 >>> 148 | -1 << ~148 + 1) & 0xFFFFFFFF;
        af = Long.reverse(6557281952834566478L);
        ag = Integer.reverse(0x50000000);
        ah = Integer.reverse(-1);
        ai = Long.reverse(6557281952834566478L);
        aj = Integer.reverse(0);
        ak = Integer.reverse(-805306368);
        al = (-1 >>> 209 | -1 << -209) & 0xFFFFFFFF;
        am = Long.reverse(6557281952834566478L);
        an = (0x600000 >>> 51 | 0x600000 << ~51 + 1) & 0xFFFFFFFF;
        ao = (-1 >>> 248 | -1 << -248) & 0xFFFFFFFF;
        ap = Long.reverse(6557281952834566478L);
        aq = Integer.reverse(-1342177280);
        ar = Long.reverse(-3530781212475344562L);
        as = Long.reverse(-7782220156096217088L);
        at = Integer.reverse(0);
        au = Integer.reverse(-1073741824);
        av = Integer.reverse(0);
        aw = (0x10000000 >>> 188 | 0x10000000 << -188) & 0xFFFFFFFF;
        ax = Integer.reverse(0x40000000);
        ay = (0 >>> 89 | 0 << -89) & 0xFFFFFFFF;
        az = (448 >>> 101 | 448 << -101) & 0xFFFFFFFF;
        ba = Long.reverse(6557281952834566478L);
        bb = Integer.reverse(-268435456);
        bc = -1 >>> 92 | -1 << -92;
        bd = Long.reverse(6557281952834566478L);
        be = -1073741824 >>> 30 | -1073741824 << -30;
        bf = 0 >>> 26 | 0 << -26;
        bg = Integer.reverse(Integer.MIN_VALUE);
        bh = Integer.reverse(0x40000000);
        bi = Integer.reverse(0);
        bj = 0x60000000 >>> 29 | 0x60000000 << -29;
        bk = 0 >>> 140 | 0 << -140;
        bl = 128 >>> 167 | 128 << -167;
        bm = (2 >>> 64 | 2 << ~64 + 1) & 0xFFFFFFFF;
        bn = Integer.reverse(-1073741824);
        bo = Integer.reverse(0);
        bp = (512 >>> 41 | 512 << ~41 + 1) & 0xFFFFFFFF;
        bq = (0x1000000 >>> 87 | 0x1000000 << -87) & 0xFFFFFFFF;
        br = Integer.reverse(0);
        bs = (0x10000000 >>> 251 | 0x10000000 << -251) & 0xFFFFFFFF;
        bt = 0 >>> 68 | 0 << -68;
        bu = Integer.reverse(Integer.MIN_VALUE);
        bv = (512 >>> 229 | 512 << ~229 + 1) & 0xFFFFFFFF;
        bw = Long.reverse(6557281952834566478L);
        bx = Integer.reverse(-2013265920);
        by = Integer.reverse(-1);
        bz = Long.reverse(6557281952834566478L);
        ca = Integer.reverse(-1073741824);
        cb = (0 >>> 35 | 0 << -35) & 0xFFFFFFFF;
        cc = Integer.reverse(Integer.MIN_VALUE);
        cd = 0x100000 >>> 51 | 0x100000 << -51;
        ce = 0 >>> 177 | 0 << -177;
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = Integer.reverse(0);
        ch = Integer.reverse(0x48000000);
        ci = Long.reverse(-3530781212475344562L);
        cj = Long.reverse(-7782220156096217088L);
        ck = 0x60000002 >>> 253 | 0x60000002 << ~253 + 1;
        cl = (0x30000001 >>> 124 | 0x30000001 << -124) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ck];
        var_java_lang_String_arr_b = new String[cl];
        NLoginType_027.b();
    }

    @Subscribe(order=PostOrder.LAST)
    public void a(PlayerChooseInitialServerEvent playerChooseInitialServerEvent) {
        try {
            this.b(playerChooseInitialServerEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_027.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + playerChooseInitialServerEvent.getClass().getSimpleName() + (String)NLoginType_027.c("㺃", (int)var_int_e, (long)(f ^ g)) + playerChooseInitialServerEvent.getPlayer().getUsername() + (String)NLoginType_027.c("㺆", (int)(h & i), (long)j), throwable, new Object[k]);
            playerChooseInitialServerEvent.getPlayer().disconnect((Component)NLoginCore_529.a((String)NLoginType_027.c("㺉", (int)l, (long)m)));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x29L;
        l ^= 0xFB4AF2F9094B0AAFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(18 + 51), (byte)(14 + 69), (byte)(20 + 27), 67, (byte)(5 + 61), (byte)(47 + 20), (byte)(34 + 13), (byte)(79 + 1), (byte)(30 + 45), (byte)(10 + 57), (byte)(42 + 41), (byte)(15 + 38), (byte)(24 + 56), 97, (byte)(60 + 40), (byte)(89 + 11), (byte)(34 + 71), (byte)(36 + 74), (byte)(3 + 100)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.B("ôāĀÃăÿúăĎýÊĈČąĈĎÐћћїрѬѢѤўѠѫѦрсѧ", (byte)9, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_027.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void b(PlayerChooseInitialServerEvent playerChooseInitialServerEvent) {
        ServerPreConnectEvent serverPreConnectEvent;
        Object object;
        Object object2;
        Object object3;
        Player player = playerChooseInitialServerEvent.getPlayer();
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.java_lang_Object_b().a(player);
        if (NLoginCore_277.S()) {
            return;
        }
        NLoginCore_509 NLoginCore_5092 = this.F.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
            return;
        }
        Optional optional2 = playerChooseInitialServerEvent.getInitialServer();
        String string2 = optional2.map(registeredServer -> registeredServer.getServerInfo().getName()).orElse((String)NLoginType_027.c("㺀", (int)(an & ao), (long)ap));
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        boolean bl = this.F.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, player.getUniqueId(), player.isOnlineMode(), player.getRemoteAddress());
        NLoginCore_5092.a(NLoginCore_567.E, (Object)bl);
        if (bl) {
            if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_g.ar() && (object3 = (String)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().a((String)NLoginType_027.c("㺃", (int)aq, (long)(ar ^ as)))) != null && !this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.a(NLoginCore_5092, (String)object3) && !NLoginCore_592.var_com_nickuc_login_NLoginCore_532_h.a(new Object[at]).contains(object3) && ((Optional)(object2 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.com_velocitypowered_api_proxy_ProxyServer_a().getServer((String)object3))).isPresent()) {
                object = (RegisteredServer)((Optional)object2).get();
                Object[] objectArray = new Object[au];
                objectArray[NLoginType_027.av] = NLoginCore_277;
                objectArray[NLoginType_027.aw] = ServerConnectType.WITH_LAST_SERVER;
                objectArray[NLoginType_027.ax] = object;
                serverPreConnectEvent = (ServerPreConnectEvent)this.F.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
                if (this.F.callEvent(serverPreConnectEvent)) {
                    playerChooseInitialServerEvent.setInitialServer(serverPreConnectEvent.getServer());
                    return;
                }
            }
            if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_i.ar()) {
                object3 = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_j.a(new Object[ay]).stream().map(string -> this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.com_velocitypowered_api_proxy_ProxyServer_a().getServer(string)).map(optional -> optional.orElse(null)).filter(Objects::nonNull).collect(Collectors.toList());
                if (object3.isEmpty()) {
                    playerChooseInitialServerEvent.setInitialServer(null);
                    object2 = NLoginCore_5092.j() ? NLoginType_027.c("㺆", (int)az, (long)ba) : NLoginType_027.c("㺉", (int)(bb & bc), (long)bd);
                    Object[] objectArray = new Object[be];
                    objectArray[NLoginType_027.bf] = string2;
                    objectArray[NLoginType_027.bg] = object3;
                    objectArray[NLoginType_027.bh] = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[bi]);
                    object = String.format((String)object2, objectArray);
                    player.disconnect((Component)NLoginCore_529.a((String)object));
                    return;
                }
                object2 = (RegisteredServer)object3.get(NLoginCore_354.a().nextInt(object3.size()));
                Object[] objectArray = new Object[bj];
                objectArray[NLoginType_027.bk] = NLoginCore_277;
                objectArray[NLoginType_027.bl] = ServerConnectType.WITH_CONFIGURED_SERVER;
                objectArray[NLoginType_027.bm] = object2;
                object = (ServerPreConnectEvent)this.F.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
                if (this.F.callEvent(object)) {
                    playerChooseInitialServerEvent.setInitialServer(object.getServer());
                    return;
                }
            }
            if (optional2.isPresent()) {
                Object[] objectArray = new Object[bn];
                objectArray[NLoginType_027.bo] = NLoginCore_277;
                objectArray[NLoginType_027.bp] = ServerConnectType.WITH_PLATFORM_SERVER;
                objectArray[NLoginType_027.bq] = optional2.get();
                object3 = (ServerPreConnectEvent)this.F.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
                if (this.F.callEvent(object3)) {
                    playerChooseInitialServerEvent.setInitialServer(object3.getServer());
                    return;
                }
            }
        }
        if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_d.ar()) {
            optional2.map(registeredServer -> registeredServer.getServerInfo().getName()).filter(string -> (!this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.a(NLoginCore_5092, (String)string) ? cf : cg) != 0).ifPresent(string -> NLoginCore_5092.a(NLoginCore_567.L, string));
            object3 = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[br]).stream().map(string -> this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.com_velocitypowered_api_proxy_ProxyServer_a().getServer(string)).map(optional -> optional.orElse(null)).filter(Objects::nonNull).collect(Collectors.toList());
            object2 = !object3.isEmpty() ? (RegisteredServer)object3.get(NLoginCore_354.a().nextInt(object3.size())) : null;
            Object[] objectArray = new Object[bs];
            objectArray[NLoginType_027.bt] = NLoginCore_277;
            objectArray[NLoginType_027.bu] = object2;
            object = (DefineAuthServerEvent)this.F.a(EventEnum.DEFINE_AUTH_SERVER, objectArray);
            this.F.callEvent(object);
            serverPreConnectEvent = object.getServer().orElse(null);
            if (serverPreConnectEvent == null) {
                Object object4 = NLoginCore_5092.j() ? NLoginType_027.c("㺌", (int)bv, (long)bw) : NLoginType_027.c("㺏", (int)(bx & by), (long)bz);
                Object[] objectArray2 = new Object[ca];
                objectArray2[NLoginType_027.cb] = string2;
                objectArray2[NLoginType_027.cc] = object3;
                objectArray2[NLoginType_027.cd] = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[ce]);
                String string3 = String.format((String)object4, objectArray2);
                player.disconnect((Component)NLoginCore_529.a(string3));
                return;
            }
            NLoginCore_5092.a(NLoginCore_567.F, (Object)serverPreConnectEvent.getServerInfo().getName());
            playerChooseInitialServerEvent.setInitialServer((RegisteredServer)serverPreConnectEvent);
        }
    }

    @Generated
    public NLoginType_027(nLoginVelocity nLoginVelocity2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e = nLoginVelocity2;
        this.F = NLoginType_008;
    }

    @Subscribe
    public void a(ServerPostConnectEvent serverPostConnectEvent) {
        Player player = serverPostConnectEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            ((NLoginType_031)this.F.com_nickuc_login_NLoginCore_056_b()).a(NLoginCore_277, ((ServerConnection)player.getCurrentServer().orElseThrow(() -> new IllegalStateException((String)NLoginType_027.c("㺀", (int)ch, (long)(ci ^ cj))))).getServerInfo().getName(), (serverPostConnectEvent.getPreviousServer() == null ? y : z) != 0);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_027.c("㺀", (int)aa, (long)(ab ^ ac)) + serverPostConnectEvent.getClass().getSimpleName() + (String)NLoginType_027.c("㺃", (int)(ad & ae), (long)af) + player.getUsername() + (String)NLoginType_027.c("㺆", (int)(ag & ah), (long)ai), throwable, new Object[aj]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginType_027.c("㺉", (int)(ak & al), (long)am)));
        }
    }

    @Subscribe(order=PostOrder.LAST)
    public void a(com.velocitypowered.api.event.player.ServerPreConnectEvent serverPreConnectEvent) {
        if (!serverPreConnectEvent.getResult().isAllowed()) {
            return;
        }
        Player player = serverPreConnectEvent.getPlayer();
        if (!player.isActive()) {
            serverPreConnectEvent.setResult(ServerPreConnectEvent.ServerResult.denied());
            return;
        }
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            NLoginCore_509 NLoginCore_5092 = this.F.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
                return;
            }
            Optional optional = serverPreConnectEvent.getResult().getServer();
            if (!optional.isPresent() || !this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_e.a(NLoginCore_5092, ((RegisteredServer)optional.get()).getServerInfo().getName()) && !NLoginCore_5092.d(NLoginCore_567.E)) {
                serverPreConnectEvent.setResult(ServerPreConnectEvent.ServerResult.denied());
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_027.c("㺀", (int)n, (long)o) + serverPreConnectEvent.getClass().getSimpleName() + (String)NLoginType_027.c("㺃", (int)(p & q), (long)r) + player.getUsername() + (String)NLoginType_027.c("㺆", (int)(s & t), (long)u), throwable, new Object[v]);
            serverPreConnectEvent.setResult(ServerPreConnectEvent.ServerResult.denied());
            player.disconnect((Component)NLoginCore_529.a((String)NLoginType_027.c("㺉", (int)w, (long)x)));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_027.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.C("ЄЦШЈЬыуљхДђшіѐЙоѠџїѝїЬ", (byte)13, 67), NLoginType_027.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.F("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢓࢓࢏ࡸࢤ࢚࢜࢖࢘ࢣ࢞ࡸࡹ࢟Ԣ", (byte)13, 70) + string + NLoginCore_324.F("ԃ", (byte)13, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 8258778515460325619L;
        long l = c ^ 0xFB4AF2F9094B0AAFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(31 + 38), (byte)(26 + 57), (byte)(42 + 5), (byte)(9 + 58), (byte)(10 + 56), (byte)(29 + 38), 47, (byte)(18 + 62), (byte)(50 + 25), (byte)(37 + 30), (byte)(75 + 8), (byte)(8 + 45), (byte)(11 + 69), (byte)(68 + 29), (byte)(90 + 10), 100, (byte)(58 + 47), (byte)(40 + 70), (byte)(32 + 71)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_027.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ƗǌǠƻƹơƤǅƷǛǔƢƼǂǨǙƩƺƺǣǭǳƺƻ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[2] = NLoginCore_384.A("ǉǋƸƕƯǘǜǘƹǜǘƯ", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[3] = NLoginCore_092.A("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȟȪȃȓǷǴȔȤȾȸț", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[4] = NLoginCore_223.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[5] = NLoginCore_091.E("ՠ֕֩քւժխ֎ր֤֝իօ֋ֱ֢ղփփֶּ֬փք", (byte)116, 69);
                    NLoginType_027.var_java_lang_String_arr_b[6] = NLoginCore_201.F("֒֔ց՞ո֥֡֡ւ֥֡ո", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[7] = NLoginCore_384.F("ե։֊֖֛֡֯քտְ֦օְֈփնֻֿ֥֨֘֨։շֺոչׄ־ׅ֣֝֨֔֗փָ׏ֱֹ׃֋ִ֑֧֡֔׏דֱ֛֭ט־׎׏כןן׏פ׃ק֣םכׅוטיֻ׫ְןשתהף׈ׄׄוצַחר׳׌ל׀ֽם׭؇؁פ", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[8] = NLoginCore_427.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[9] = NLoginCore_076.F("ՠ֕֩քւժխ֎ր֤֝իօ֋ֱ֢ղփփֶּ֬փք", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[10] = NLoginCore_559.D("ճյբԿՙւֆւգֆւՙ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[11] = NLoginCore_223.B("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȟȪȃȓǷǴȔȤȾȸț", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[12] = NLoginCore_091.E("՟֤֙֘ըւժժխվտո", (byte)116, 69);
                    NLoginType_027.var_java_lang_String_arr_b[13] = NLoginCore_446.F("ռ֖֞ոշ֣կֲ֢լֆ֦էֳַ֤֧֪֭֕֗ֆփք", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[14] = NLoginCore_384.D("Ղ֋Ֆ՛զՏ՚ք֌Պվւըօմղբֆ֖կ֋թպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ֌֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚׋׉ֱ֢֮֫֩֫דחִ֧֭֠ח֚֫֔֝חָםׁ֭ףֱ֢ׅ׉֜הס׃ָר֩׎׉קײֿקׇׁא׭׊ךִחֵֺֺֽ׎ס׎׶׺؇؊ם׆פ׿؍؁׫לؓ؁׬קשגؐק؉װײ׬؎ל׽؜כ؋׿ף؅צؕ؀״ب׷؇أ׬أ׾ر؋؟׮؃׵؏ؒئة؍؎ػؘشؙدك׿؀؅ؙظ؄آ؆ؤكلؚّيث؞اضه؟ذئعَدتىشٞؾٗلٛٝذ١ٗزؤٞىضاؾّٰٯٜٔـٱ٤ٷٲٌنٓ٭ٶػٕٞٓفّ٦٤٘كمٖ٥ٗلٽڀى١ِٰ٢ٵچڒٗٸڄڄٕڋښ٭٠ٗڎڐٝڒپڡڨږ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[15] = NLoginCore_173.A("ƶǟƾǞǎƺǅǖơǥǟƴǊƩƽƦǮǨǤǋǩǎǷǁǇǫǹƻǬǒǶǳǻǀǸǮǥǝȁǞǺǺǡǵȋȁǜǜǫǈǦǋǟǨǱǔǯȁȏǗǕǓǝȊǷǫǚǝǞȒǷȗǤȆȠȧǶȊȧȣȚȨǨȇǿǽǲǮȦȫǳȚȲșǻȒȖȚɂȬȢǼȝȞȡȆȀțȝȜȩɇȂȲȽȎȏȪȑȠȒȣȸɐȲɈȲȞɍɋɛȺȺȞȸȥɀɄȷȝɅɫȽɎɘɯɨȼɃɮɍɤɠȶɲɸɨɒɕəɮɪɕɺʂɣɯɕɒɷɫɻɝəɞɆɎɾɿɒɔɶʕɟɖɒɰɸɨɥɻʝɚʑʌɣɡʎʅʞɤʉʓʂʈʘɷʆɬʠʌʅʇʟʄʥʲʱʸʤʍʐʏʮʒˁʀʭʐʦʡʙʜʕʝʶˋʙʧˉʞʏˀʐ˒ʝʚʛ", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[16] = NLoginCore_091.D("Ղ֋Ֆ՛զՏ՚ք֌Պվւըօմղբֆ֖կ֋թպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ֌֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚׋׉ֱֱֵ֢֪ׅ֮֮֫֩֒֟׊ג֖דדכ֩אֵּ֥זֳיל֠ץך֫ם׆ןפנ֥ג׶השיױד׫֮׬׌׈טַ؁מ؂ב׮׿׃׃׽ה׹׺ען׻׹؍ؒ؍ג׈׭׹؏׭؏ט؝׬מ׵ׯ׷ײ׾ئ؂י؁פ؋׿؄ץإ؅؇ةؚ؞ب׬ذ׶ثظث؃״ئؑع؉دظ؜ؙع؎ذؘؔ؟؊،أَُب؍ٍمتّئةمةؑةضيؾؽسةدرّلْئ؟ٔاإؾإ٪ٛلكمٝهّقٍخٸي٭ػٰٔ٨٩ٷڂَٙفٲٗمٝ٦پؾم٩٠٪ڀ٧چًُ٬ٷ٩٩ڒٛږٗژّٹ٪ٟڗڞڃڧٺڝڪ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[17] = NLoginCore_559.F("տ֨և֧֗փ֎֟ժ֮֨ս֓ղֆկֱֲַ֭֔֗׀֊֐ִׂքֵּֿ֛֩ֆ֟׆ֿ։֗֜׋׉ֵָׂ֑֜ה֐֨׏׎א׆ִִ֨֩היׄץדֳָׁ׊֢֫֫ן֢ױ֨׭ֳ־׵ׁקֵקף֮תרט׌؀׽׃כװ؀סע׽׈ם؁׋׈׺א؉׻מא׳ؓ؈׭רؓ׻י؞י؍נ؞םם؜׽؎ס׺إ׷ؙؖإؖ؃؜ؐ،؛ث؝׾ؤذ،؎،׶غ׸ضتؚد׵ؿإقائعظ؇ظؾؚ؜ٌ؉ؒ؋ِِيُِِ٘كمٗؼؗدؽرلٝءٗءٚء٩ٜ١ؽٖٯئؼجز٧ٌٖشضي٤٤يٳٵ٩ِٙځ٣پٚٱڇڃنٺڄٞڇ٫١ٌٟلچٲٔږڗږٔٙٸڔٕډ٬ٷڐڌښڝٴڟڤٻ", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[18] = NLoginCore_076.B("ǡǌƿǣǏǍǖǙǞǒǢƸǄǖƥǊǫǊǎǮǫƧǅǓǄǪǖǇǨƼǦǶǉǷǺǽǣǥǻǘǘǱǿǻǤǪǋǭǧǜȂǮȌǟǌȖǑȃǺǻȏȈșȋȐǸȊǶǞȗǘȢȅȨǻȈȖȭȪȧȍǮȯǲȍȟȢȒȎȤȴȚȶȏȲȶ", (byte)116, 66);
                    continue block7;
                }
                case 1: {
                    NLoginType_027.var_java_lang_String_arr_b[0] = NLoginCore_076.F("֡։՝֙ք֣֫֡և֢ղւ֊ծ֨ք֓ֆֵָ֕֝֊֍֭֝׀վֱ֑֯־", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[1] = NLoginCore_559.C("Ձն֊եգՋՎկաօտծժկևղ։յշ֞֙֍դե", (byte)116, 67);
                    NLoginType_027.var_java_lang_String_arr_b[2] = NLoginCore_223.D("՚ս՟ըՇլՠՠաի֊ՙ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[3] = NLoginCore_384.A("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȓȠȷȖȳǵȲȺǶȬȲǺȗȓȳǽȠȑȆɂȄȦȏ", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[4] = NLoginCore_384.E("֡։՝֙ք֣֫֡և֢ղւ֊ծ֨ք֓ֆֵָ֕֨֌րֹּ֯֯֍ց֟պֈ׀ֿ֜ׄ֎և׈׃֨֊֘", (byte)116, 69);
                    NLoginType_027.var_java_lang_String_arr_b[5] = NLoginCore_092.F("ՠ֕֩քւժխ֎ր֤֝լ֣֝ֈև֤֛֚֘յ֬փք", (byte)116, 70);
                    NLoginType_027.var_java_lang_String_arr_b[6] = NLoginCore_453.D("՚Յզ՚ՆիսՏտդՏՙ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[7] = NLoginCore_173.E("ե։֊֖֛֡֯քտְ֦օְֈփնֻֿ֥֨֘֨։շֺոչׄ־ׅ֣֝֨֔֗փָ׏ֱֹ׃֋ִ֑֧֡֔׏דֱ֛֭ט־׎׏כןן׏פ׃ק֣םכׅוטיֻ׫ְןשתהף׈ׄׄוצַחיך׭ײ؀ֽׄ׎ט׼ֺ؅תתפ׫؃؇קױ؅כט", (byte)116, 69);
                    NLoginType_027.var_java_lang_String_arr_b[8] = NLoginCore_076.A("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǒƴǕǉƹǏǚǆǵǷƼ", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[9] = NLoginCore_453.C("Ձն֊եգՋՎկաօվըՎւձդ՚֌ս֐՛շդե", (byte)116, 67);
                    NLoginType_027.var_java_lang_String_arr_b[10] = NLoginCore_027.C("ցջՖ՛ՌդտՐՈ՛դՙ", (byte)116, 67);
                    NLoginType_027.var_java_lang_String_arr_b[11] = NLoginCore_004.A("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȝȋȐǲȲȱȎȩȐȞȬȮȽȢȝȐȢɆȏȤȥɈȏ", (byte)116, 65);
                    NLoginType_027.var_java_lang_String_arr_b[12] = NLoginCore_451.B("ƮǍƚƬǁǍǃǥƲƺǊƯ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[13] = NLoginCore_027.B("ƳǕǍƯƮǚƦǙǩƣƺǓƨǗƿǃǡǯƻǳǤǳƺƻ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ƘǡƬƱƼƥưǚǢƠǔǘƾǛǊǈƸǜǬǅǡƿǐǠƴǴǯƹǈƼǩǞƸǘǂǂǳǶǚƿȇƿȆǋǠǨǀȏǛǞǄǢǿǠǶȘȄǋǲǛǥȐǭǝȀȒǰȡȟȁȄȇǸǿȁȩȭǶǽȃȊȭȁǪǳǰȭȎȳȗȃȹȇǸțȟǲȪȷșȎȾǿȤȟȽɈȕȽȝȗȦɃȠȰȊȭȋȐȐȓȤȷȤɌɐɝɠȳȜȺɕɣɗɁȲɩɗɂȽȿȨɦȽɟɆɈɂɤȲɓɲȱɡɕȹɛȼɫɖɊɾɍɝɹɂɹɔʇɡɵɄəɋɥɨɼɿɣɤʑɮʊɯʅʙɕɖɛɯʎɚɸɜɺʙʚɰʧʠʁɴɽʌʝɵʆɼʏʤʅʀʟʊʴʔʭʚʱʳʆʷʭʈɺʴʟʌɽʔˆʧ˅ʪʲʖˇʺˍˈʢʜʩ˃ˌʑʫʴʩʗʧʼʺʮʙʛʬʻʭʚ˓˖ʟʷˆʦʸˋ˜˨ʭˎ˚˚ʫˡ˰ˊʳʱʸ˶ˊˏʻ˺ʻʼ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[15] = NLoginCore_324.B("ƶǟƾǞǎƺǅǖơǥǟƴǊƩƽƦǮǨǤǋǩǎǷǁǇǫǹƻǬǒǶǳǻǀǸǮǥǝȁǞǺǺǡǵȋȁǜǜǫǈǦǋǟǨǱǔǯȁȏǗǕǓǝȊǷǫǚǝǞȒǷȗǤȆȠȧǶȊȧȣȚȨǨȇǿǽǲǮȦȫǳȚȲșǻȒȖȚɂȬȢǼȝȞȡȆȀțȝȜȩɇȂȲȽȎȏȪȑȠȒȣȸɐȲɈȲȞɍɋɛȺȺȞȸȥɀɄȷȝɅɫȽɎɘɯɨȼɃɮɍɤɠȶɲɸɨɒɕəɮɪɕɺʂɣɯɕɒɷɫɻɝəɞɆɎɾɿɒɔɶʕɟɖɒɰɸɨɥɻʝɚʑʌɣɡʎʅʞɤʉʓʂʈʘɷʆɬʠʌʅʇʟʄʥʲʱʸʤʍʐʏʮʒˁʀʭʐʦʡʙʜʕʝˆʾʉʽˁʉʣʄ˄ˎ˓ʚʛ", (byte)116, 66);
                    NLoginType_027.var_java_lang_String_arr_b[16] = NLoginCore_201.D("Ղ֋Ֆ՛զՏ՚ք֌Պվւըօմղբֆ֖կ֋թպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ֌֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚׋׉ֱֱֵ֢֪ׅ֮֮֫֩֒֟׊ג֖דדכ֩אֵּ֥זֳיל֠ץך֫ם׆ןפנ֥ג׶השיױד׫֮׬׌׈טַ؁מ؂ב׮׿׃׃׽ה׹׺ען׻׹؍ؒ؍ג׈׭׹؏׭؏ט؝׬מ׵ׯ׷ײ׾ئ؂י؁פ؋׿؄ץإ؅؇ةؚ؞ب׬ذ׶ثظث؃״ئؑع؉دظ؜ؙع؎ذؘؔ؟؊،أَُب؍ٍمتّئةمةؑةضيؾؽسةدرّلْئ؟ٔاإؾإ٪ٛلكمٝهّقٍخٸي٭ػٰٔ٨٩ٷڂَٙفٲٗمٝ٦پؾم٩٠٪ڀ٧چًُ٬ٷ٩٩ڒٛږٗژڞ٘پڛٯ٤ڜٟڅڃڡ", (byte)116, 68);
                    NLoginType_027.var_java_lang_String_arr_b[17] = NLoginCore_427.E("տ֨և֧֗փ֎֟ժ֮֨ս֓ղֆկֱֲַ֭֔֗׀֊֐ִׂքֵּֿ֛֩ֆ֟׆ֿ։֗֜׋׉ֵָׂ֑֜ה֐֨׏׎א׆ִִ֨֩היׄץדֳָׁ׊֢֫֫ן֢ױ֨׭ֳ־׵ׁקֵקף֮תרט׌؀׽׃כװ؀סע׽׈ם؁׋׈׺א؉׻מא׳ؓ؈׭רؓ׻י؞י؍נ؞םם؜׽؎ס׺إ׷ؙؖإؖ؃؜ؐ،؛ث؝׾ؤذ،؎،׶غ׸ضتؚد׵ؿإقائعظ؇ظؾؚ؜ٌ؉ؒ؋ِِيُِِ٘كمٗؼؗدؽرلٝءٗءٚء٩ٜ١ؽٖٯئؼجز٧ٌٖشضي٤٤يٳٵ٩ِٙځ٣پٚٱڇڃنٺڄٞڇ٫١ٌٟلچٲٔږڗږٔٙٸڔٕٶڠڏڕښڔڙٞڄړٟ", (byte)116, 69);
                    NLoginType_027.var_java_lang_String_arr_b[18] = NLoginCore_559.C("֋նթ֍չշրփֈռ֌բծրՏմ֕մո֘֕Ցկսծ֔րձ֒զ֐֠ճ֤֧֡֍֏֥ււ֛֥֩֎֔յ֑֗ֆֶ֬֘։ն׀ջֲֹ֤֥֭׃ִֵֺ֢֠ֈׁւ׌֯גֲ֥׀חהבַ֘יַ֜׊֘י֯׏ף֢לֵּׁש׌־׋֥֩כֽׅ֮׌ֹ", (byte)116, 67);
                    continue block7;
                }
                case 2: {
                    NLoginType_027.var_java_lang_String_arr_b[0] = NLoginCore_559.D("չՠիև՝ՁՊֆկ՜֋ձՈֆ֋ցճիհՕ֕֝դե", (byte)116, 68);
                    continue block7;
                }
                case 4: {
                    NLoginType_027.var_java_lang_String_arr_b[0] = NLoginCore_091.E("֣ցշ֩֬էա֡ր֞֡֊֐֣֕և֍֓օ֔կ֖փք", (byte)116, 69);
                }
            }
        }
    }
}

