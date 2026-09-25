/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.ServerConnectType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.event.bungee.connection.ServerPreConnectEvent
 *  lombok.Generated
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.config.ServerInfo
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.ServerConnectEvent
 *  net.md_5.bungee.api.event.ServerConnectedEvent
 *  net.md_5.bungee.api.event.ServerSwitchEvent
 *  net.md_5.bungee.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.bungee.connection.ServerPreConnectEvent;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_031;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginInterface_046;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginType_009
implements NLoginInterface_046 {
    private static int ab;
    private static long t;
    private static long be;
    private static int q;
    private static long n;
    private static int p;
    private static int bb;
    private static int y;
    private final NLoginType_008 C;
    private static int al;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_e;
    private static int by;
    private static int bt;
    private static int aq;
    private static int ah;
    private static long af;
    private static int ar;
    private static long c;
    private static long cb;
    private static int k;
    private static int bm;
    private static int var_int_a;
    private static int ba;
    private static long av;
    private static int bj;
    private static int bd;
    private static int j;
    private static long ad;
    private static int s;
    private static long var_long_b;
    private static int cm;
    private static String[] var_java_lang_String_arr_b;
    private static int cl;
    private static int az;
    private static long z;
    private static int ap;
    private static int ao;
    private static int l;
    private static int at;
    private static int cg;
    private static int bq;
    private static long cf;
    private static int ax;
    private static int br;
    private static long g;
    private static int var_int_e;
    private static int bk;
    private static int bs;
    private static long m;
    private static long r;
    private static int bn;
    private static int cj;
    private static int bl;
    private static int bv;
    private static long w;
    private static int bz;
    private static int bx;
    private static long bg;
    private static long aj;
    private static long d;
    private static int au;
    private static int bo;
    private static int ci;
    private static String[] var_java_lang_String_arr_a;
    private static long i;
    private static long bh;
    private static int ae;
    private static int bf;
    private static int ac;
    private static int am;
    private static long u;
    private static long cc;
    private static int cd;
    private static int aa;
    private static int ch;
    private static int h;
    private static long ag;
    private static int bp;
    private static long an;
    private static long f;
    private static int ay;
    private static int ce;
    private static int ck;
    private static int ak;
    private static int x;
    private static int bi;
    private static int aw;
    private static int bc;
    private static int as;
    private static int bw;
    private static int v;
    private static int o;
    private static long ai;
    private static int bu;
    private static int ca;

    @EventHandler
    public void a(ServerSwitchEvent serverSwitchEvent) {
        ProxiedPlayer proxiedPlayer = serverSwitchEvent.getPlayer();
        if (!proxiedPlayer.isConnected()) {
            return;
        }
        try {
            if (proxiedPlayer.getPendingConnection().getVersion() < o) {
                NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.java_lang_Object_b().a(proxiedPlayer);
                if (NLoginCore_277.S()) {
                    return;
                }
                NLoginCore_509 NLoginCore_5092 = this.C.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                ((NLoginType_031)this.C.com_nickuc_login_NLoginCore_056_b()).a(NLoginCore_277, proxiedPlayer.getServer().getInfo().getName(), Boolean.TRUE.equals(NLoginCore_5092.a(NLoginCore_567.M)));
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_009.c("㺀", (int)(p & q), (long)r) + serverSwitchEvent.getClass().getSimpleName() + (String)NLoginType_009.c("㺃", (int)s, (long)(t ^ u)) + proxiedPlayer.getName() + (String)NLoginType_009.c("㺆", (int)v, (long)w), throwable, new Object[x]);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginType_009.c("㺉", (int)y, (long)z)));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_009.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ċĭįďĳŒŊŠŌěřŏŝŗĠŅŧŦŞŤŞĳ", (byte)50, 66), NLoginType_009.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("ҮһҺѽҽҹҴҽӈҷ҄ӂӆҿӂӈҊࠤࠔࠐࠛࠟࠤࠤࠨࠗࠀࠛࠧҢ", (byte)50, 67) + string + NLoginCore_427.C("҅", (byte)50, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(66902738432552077L);
        d = Long.reverse(-1585267068834414592L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(66902738432552077L);
        g = Long.reverse(-1585267068834414592L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-1518364330401862515L);
        j = 0 >>> 76 | 0 << ~76 + 1;
        k = 524288 >>> 51 | 524288 << ~51 + 1;
        l = Integer.reverse(-1073741824);
        m = Long.reverse(66902738432552077L);
        n = Long.reverse(-1585267068834414592L);
        o = Integer.reverse(1061158912);
        p = Integer.reverse(0x20000000);
        q = (-1 >>> 252 | -1 << ~252 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-1518364330401862515L);
        s = 1280 >>> 136 | 1280 << ~136 + 1;
        t = Long.reverse(66902738432552077L);
        u = Long.reverse(-1585267068834414592L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-1518364330401862515L);
        x = 0 >>> 209 | 0 << -209;
        y = Integer.reverse(-536870912);
        z = Long.reverse(-1518364330401862515L);
        aa = Integer.reverse(1061158912);
        ab = Integer.reverse(0x10000000);
        ac = Integer.reverse(-1);
        ad = Long.reverse(-1518364330401862515L);
        ae = Integer.reverse(-1879048192);
        af = Long.reverse(66902738432552077L);
        ag = Long.reverse(-1585267068834414592L);
        ah = Integer.reverse(0x50000000);
        ai = Long.reverse(66902738432552077L);
        aj = Long.reverse(-1585267068834414592L);
        ak = Integer.reverse(0);
        al = Integer.reverse(-805306368);
        am = Integer.reverse(-1);
        an = Long.reverse(-1518364330401862515L);
        ao = (0x800000 >>> 183 | 0x800000 << -183) & 0xFFFFFFFF;
        ap = (8192 >>> 141 | 8192 << -141) & 0xFFFFFFFF;
        aq = 0 >>> 7 | 0 << ~7 + 1;
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = Integer.reverse(0x30000000);
        au = -1 >>> 80 | -1 << ~80 + 1;
        av = Long.reverse(-1518364330401862515L);
        aw = Integer.reverse(0);
        ax = Integer.reverse(-1073741824);
        ay = (0 >>> 213 | 0 << ~213 + 1) & 0xFFFFFFFF;
        az = (512 >>> 41 | 512 << -41) & 0xFFFFFFFF;
        ba = Integer.reverse(0x40000000);
        bb = 0 >>> 233 | 0 << ~233 + 1;
        bc = (0x1A000000 >>> 249 | 0x1A000000 << ~249 + 1) & 0xFFFFFFFF;
        bd = Integer.reverse(-1);
        be = Long.reverse(-1518364330401862515L);
        bf = Integer.reverse(0x70000000);
        bg = Long.reverse(66902738432552077L);
        bh = Long.reverse(-1585267068834414592L);
        bi = Integer.reverse(-1073741824);
        bj = 0 >>> 238 | 0 << ~238 + 1;
        bk = Integer.reverse(Integer.MIN_VALUE);
        bl = 262144 >>> 113 | 262144 << -113;
        bm = Integer.reverse(0);
        bn = 196608 >>> 48 | 196608 << -48;
        bo = Integer.reverse(0);
        bp = 32768 >>> 143 | 32768 << -143;
        bq = 0x4000000 >>> 25 | 0x4000000 << ~25 + 1;
        br = (0x180000 >>> 83 | 0x180000 << ~83 + 1) & 0xFFFFFFFF;
        bs = Integer.reverse(0);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = Integer.reverse(0x40000000);
        bv = Integer.reverse(0);
        bw = (1 >>> 159 | 1 << ~159 + 1) & 0xFFFFFFFF;
        bx = (0 >>> 58 | 0 << -58) & 0xFFFFFFFF;
        by = 0x8000000 >>> 251 | 0x8000000 << ~251 + 1;
        bz = 0x100000 >>> 180 | 0x100000 << -180;
        ca = 960 >>> 134 | 960 << ~134 + 1;
        cb = Long.reverse(66902738432552077L);
        cc = Long.reverse(-1585267068834414592L);
        cd = Integer.reverse(0x8000000);
        ce = (-1 >>> 83 | -1 << ~83 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(-1518364330401862515L);
        cg = Integer.reverse(-1073741824);
        ch = Integer.reverse(0);
        ci = 0x100000 >>> 148 | 0x100000 << ~148 + 1;
        cj = Integer.reverse(0x40000000);
        ck = Integer.reverse(0);
        cl = (-2013265920 >>> 251 | -2013265920 << -251) & 0xFFFFFFFF;
        cm = Integer.reverse(-2013265920);
        var_java_lang_String_arr_a = new String[cl];
        var_java_lang_String_arr_b = new String[cm];
        NLoginType_009.b();
    }

    @EventHandler
    public void a(ServerConnectedEvent serverConnectedEvent) {
        ProxiedPlayer proxiedPlayer = serverConnectedEvent.getPlayer();
        if (!proxiedPlayer.isConnected()) {
            return;
        }
        try {
            if (proxiedPlayer.getPendingConnection().getVersion() >= aa) {
                NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.java_lang_Object_b().a(proxiedPlayer);
                if (NLoginCore_277.S()) {
                    return;
                }
                NLoginCore_509 NLoginCore_5092 = this.C.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                ((NLoginType_031)this.C.com_nickuc_login_NLoginCore_056_b()).a(NLoginCore_277, proxiedPlayer.getServer().getInfo().getName(), Boolean.TRUE.equals(NLoginCore_5092.a(NLoginCore_567.M)));
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_009.c("㺀", (int)(ab & ac), (long)ad) + serverConnectedEvent.getClass().getSimpleName() + (String)NLoginType_009.c("㺃", (int)ae, (long)(af ^ ag)) + proxiedPlayer.getName() + (String)NLoginType_009.c("㺆", (int)ah, (long)(ai ^ aj)), throwable, new Object[ak]);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginType_009.c("㺉", (int)(al & am), (long)an)));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x57L;
        l ^= 0xBF3EB17A278B7B57L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(19 + 50), (byte)(21 + 62), 47, (byte)(64 + 3), (byte)(34 + 32), (byte)(60 + 7), (byte)(23 + 24), (byte)(50 + 30), (byte)(46 + 29), (byte)(58 + 9), (byte)(72 + 11), (byte)(35 + 18), (byte)(79 + 1), (byte)(33 + 64), 100, (byte)(27 + 73), (byte)(89 + 16), (byte)(49 + 61), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("úćĆÉĉąĀĉĔăÐĎĒċĎĔÖѰѠќѧѫѰѰѴѣьѧѳ", (byte)12, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_009.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void b(ServerConnectEvent serverConnectEvent) {
        ServerPreConnectEvent serverPreConnectEvent;
        Object object;
        Object object2;
        int n;
        ProxiedPlayer proxiedPlayer = serverConnectEvent.getPlayer();
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.java_lang_Object_b().a(proxiedPlayer);
        if (NLoginCore_277.S()) {
            return;
        }
        if (!NLoginCore_277.R()) {
            serverConnectEvent.setCancelled(ao != 0);
            return;
        }
        NLoginCore_509 NLoginCore_5092 = this.C.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
            return;
        }
        ServerInfo serverInfo = serverConnectEvent.getTarget();
        String string2 = serverInfo.getName();
        int n2 = n = proxiedPlayer.getServer() == null ? ap : aq;
        if (n == 0) {
            if (!this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.a(NLoginCore_5092, string2)) {
                serverConnectEvent.setCancelled(ar != 0);
            }
            return;
        }
        NLoginCore_5092.a(NLoginCore_567.M, (Object)(as != 0));
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        boolean bl = this.C.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, proxiedPlayer.getUniqueId(), proxiedPlayer.getPendingConnection().isOnlineMode(), (InetSocketAddress)proxiedPlayer.getSocketAddress());
        if (bl) {
            if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_g.ar() && (object2 = (String)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().a((String)NLoginType_009.c("㺀", (int)(at & au), (long)av))) != null && !this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.a(NLoginCore_5092, (String)object2) && !NLoginCore_592.var_com_nickuc_login_NLoginCore_532_h.a(new Object[aw]).contains(object2) && (object = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.net_md_5_bungee_api_ProxyServer_a().getServerInfo((String)object2)) != null) {
                Object[] objectArray = new Object[ax];
                objectArray[NLoginType_009.ay] = NLoginCore_277;
                objectArray[NLoginType_009.az] = ServerConnectType.WITH_LAST_SERVER;
                objectArray[NLoginType_009.ba] = object;
                serverPreConnectEvent = (ServerPreConnectEvent)this.C.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
                if (this.C.callEvent(serverPreConnectEvent)) {
                    serverConnectEvent.setTarget(serverPreConnectEvent.getServer());
                    return;
                }
            }
            if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_i.ar()) {
                object2 = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_j.a(new Object[bb]).stream().map(string -> this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.net_md_5_bungee_api_ProxyServer_a().getServerInfo(string)).filter(Objects::nonNull).collect(Collectors.toList());
                if (object2.isEmpty()) {
                    object = NLoginCore_5092.j() ? NLoginType_009.c("㺃", (int)(bc & bd), (long)be) : NLoginType_009.c("㺆", (int)bf, (long)(bg ^ bh));
                    Object[] objectArray = new Object[bi];
                    objectArray[NLoginType_009.bj] = string2;
                    objectArray[NLoginType_009.bk] = object2;
                    objectArray[NLoginType_009.bl] = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_j.a(new Object[bm]);
                    serverPreConnectEvent = TextComponent.fromLegacyText((String)String.format((String)object, objectArray));
                    proxiedPlayer.disconnect((BaseComponent[])serverPreConnectEvent);
                    return;
                }
                object = (ServerInfo)object2.get(NLoginCore_354.a().nextInt(object2.size()));
                Object[] objectArray = new Object[bn];
                objectArray[NLoginType_009.bo] = NLoginCore_277;
                objectArray[NLoginType_009.bp] = ServerConnectType.WITH_CONFIGURED_SERVER;
                objectArray[NLoginType_009.bq] = object;
                serverPreConnectEvent = (ServerPreConnectEvent)this.C.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
                if (this.C.callEvent(serverPreConnectEvent)) {
                    serverConnectEvent.setTarget(serverPreConnectEvent.getServer());
                    return;
                }
            }
            Object[] objectArray = new Object[br];
            objectArray[NLoginType_009.bs] = NLoginCore_277;
            objectArray[NLoginType_009.bt] = ServerConnectType.WITH_PLATFORM_SERVER;
            objectArray[NLoginType_009.bu] = serverInfo;
            object2 = (ServerPreConnectEvent)this.C.a(EventEnum.SERVER_PRE_CONNECT, objectArray);
            if (this.C.callEvent(object2)) {
                serverConnectEvent.setTarget(object2.getServer());
                return;
            }
        }
        if (NLoginCore_592.var_com_nickuc_login_NLoginCore_532_d.ar()) {
            if (!this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.a(NLoginCore_5092, string2)) {
                NLoginCore_5092.a(NLoginCore_567.L, (Object)string2);
            }
            object = !(object2 = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[bv]).stream().map(string -> this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e.net_md_5_bungee_api_ProxyServer_a().getServerInfo(string)).filter(Objects::nonNull).collect(Collectors.toList())).isEmpty() ? (ServerInfo)object2.get(NLoginCore_354.a().nextInt(object2.size())) : null;
            Object[] objectArray = new Object[bw];
            objectArray[NLoginType_009.bx] = NLoginCore_277;
            objectArray[NLoginType_009.by] = object;
            serverPreConnectEvent = (ServerPreConnectEvent)this.C.a(EventEnum.DEFINE_AUTH_SERVER, objectArray);
            this.C.callEvent(serverPreConnectEvent);
            ServerInfo serverInfo2 = serverPreConnectEvent.getServer().orElse(null);
            if (serverInfo2 == null) {
                serverConnectEvent.setCancelled(bz != 0);
                Object object3 = NLoginCore_5092.j() ? NLoginType_009.c("㺉", (int)ca, (long)(cb ^ cc)) : NLoginType_009.c("㺌", (int)(cd & ce), (long)cf);
                Object[] objectArray2 = new Object[cg];
                objectArray2[NLoginType_009.ch] = string2;
                objectArray2[NLoginType_009.ci] = object2;
                objectArray2[NLoginType_009.cj] = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[ck]);
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)String.format((String)object3, objectArray2));
                proxiedPlayer.disconnect(baseComponentArray);
                return;
            }
            NLoginCore_5092.a(NLoginCore_567.F, (Object)serverInfo2.getName());
            serverConnectEvent.setTarget(serverInfo2);
        }
    }

    private static void b() {
        int n;
        c = -5676889146963675392L;
        long l = c ^ 0xBF3EB17A278B7B57L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(30 + 39), 83, (byte)(6 + 41), (byte)(8 + 59), (byte)(19 + 47), (byte)(55 + 12), (byte)(17 + 30), (byte)(16 + 64), (byte)(14 + 61), (byte)(30 + 37), (byte)(30 + 53), (byte)(35 + 18), (byte)(52 + 28), (byte)(27 + 70), (byte)(80 + 20), (byte)(68 + 32), (byte)(103 + 2), 110, (byte)(72 + 31)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_009.var_java_lang_String_arr_b[0] = NLoginCore_223.F("֞րփծ֦ղ֕֝֊֘քըվցֈ֢֟խ֪֣֫ք֓֍ն֍ֆֳֺֺּ֗", (byte)109, 70);
                    NLoginType_009.var_java_lang_String_arr_b[1] = NLoginCore_004.C("էհկմ՘ծիպՐՓ՞ՠռ՘ՔՑՀԾհքզՒՏՐ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[2] = NLoginCore_384.C("ՀՅՌՆլբըոԳԴսՄ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[3] = NLoginCore_091.D("նԳՎՊՆ՗ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց֋բգճ՘֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯֐֦֋ռֱֲֵֶ֛֢֑֖֬֠֡֋ֵ׀ք֡֏ׇ֥֒֯", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[4] = NLoginCore_451.F("֞րփծ֦ղ֕֝֊֘քըվցֈ֢֟խ֪֣֫ք֓֍ն֍ֆֳֺֺּ֗", (byte)109, 70);
                    NLoginType_009.var_java_lang_String_arr_b[5] = NLoginCore_110.C("էհկմ՘ծիպՐՓ՞ՠռ՘ՔՑՀԾհքզՒՏՐ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[6] = NLoginCore_091.B("ƝƢƩƣǉƿǅǕƐƑǚơ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[7] = NLoginCore_384.D("նԳՎՊՆ՗ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց֋բգճ՘֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯֐֦֋ռֱֲֵֶ֛֢֑֖֬֠֡֋ֵ׀ք֡֏ׇ֥֒֯", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[8] = NLoginCore_324.D("ձՓՖՁչՅըհ՝ի՗ԻՑՔ՛յղՀսնվ՗զՠՉՠՙժ֏ֆ֍֍", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[9] = NLoginCore_324.E("֔֝֜֡օ֛֧֘սր֋֍֩օցվխիֱ֝֓տռս", (byte)109, 69);
                    NLoginType_009.var_java_lang_String_arr_b[10] = NLoginCore_091.B("ƝƢƩƣǉƿǅǕƐƑǚơ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[11] = NLoginCore_427.E("֣ՠջշճքզփ֢չ֣֜֝զֱ֤ֈֆֱ֖֡թձֵ֋֯֒չ֛֕֊ֺ֚վָ֏֐֠օַֻֻֿ׀֞ցְ׉֎֪֮֬׃ה׊֖֓׆ֳִֵֵׁ֗֜֝֫דַֺלֽדָ֩׈ף׏עין־׃מ׍׎ָע׭ֱ׎ּ״גֿל", (byte)109, 69);
                    NLoginType_009.var_java_lang_String_arr_b[12] = NLoginCore_173.C("ճլՇի԰նՓՖԹջՎ՞ո՝բՖ՝չզշջՒՏՐ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[13] = NLoginCore_091.B("ǁƱƮƮƭƖƭƐƕƖƪƾƿƿƺƛƯǘǙƳƱǓƺǂƿƷǘƿƪǫƽǃǉǓǅǴǶǧǷǨǍǃǎƺǵǓƲǒȂǾǳǻǡǯǲǒȂȋȈǥǡȈǢǏȊǛȐȏǔǎǩȘȕǥȒțǲȝȘǰǛȜǲȗǼǺȟȝȣȋȈǬȡȟǿȀȦȬȁȄȫȊȴȌȲǷȔȮȔǵȀȶȔȲȒȖɄǿșɁȆǽɊȢɄȯɁȺȎȟȞɄɖȫȶȢɎȩɆɕȰɎɉɂșɁɒɒɚȰȸɣɅɠȷȵɠȹɠȬɌȽɍɂɐȴȮɲɲɼɘȶȸɳɻɔɱȾȿɓȿɕɃɨɉɖɜʉɩɣɿʉʌɒɌʏɐɉɥʁɒɣʘʔʈʊɚʁʞʜɮʆʀɰʅʤʉɣʂɦɬʰʟɾʡʨʮʟʨɿʘʋʫʅʶʬʋɼʊʴʯʍɾʶʡʤʤʓˁʨʜʵʦʎʰʺʄʽʔˏˌ˓ʥˎʸ˕ˌ˔ʬʶʺ˖ʶʡ˅ʞ˅ʱˢʡ˟ˋ˛ʭʪʹʼˀ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ƩƦƋǆǒƍƱǎǒƯǇƦƲƳƒƿƬǌǚǜǄǚǟǆƻǜǬǛǝǉǨǙǀƪǧǨǱǠƶǯǛǷǰƵƷǪǘǎǗȂƾǼǆǂǩǁǧȌǛǬǜȇǊǦǡǲȐǔȔǿȖǥǳȅȇǾȟǱǙǝǢȗǳǱǦǶǽȤȡǼșȢȇȤǺȣȪȈȭȝȈǯȉȴȯȭȧǸȾȱȐȻȱȴȓɁǸɆȾȥɂȷȟɅȬȍțȩȬȝɈȏɕȎȒɋȶȵɆȸɒȲȳȫɜɖȴȼȿɛɈɖȡɫɖȼȽɋɅɩɲȬȽȳɰɀɑɒȵɸȹɅɹȾɝȾȿʃɴəɶʅȿɿɾɓɤʀɈʊɫɧɈɛɬʇʌɴʉɓʛɴʋɳɳɹɨʙɽɣɝʀɠʙʨɨɵʈɪʉɻʦʢʯʥʨʱɴɴʖʱɴʴʙʔɻʋʉɺʙʷʒʡ˄ʗʵʌʍ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[15] = NLoginCore_201.A("ǁƱƮƮƭƖƭƐƕƖƪƾƿƿƺƛƯǘǙƳƱǓƺǂƿƷǘƿƪǫƽǃǉǓǅǴǶǧǷǨǍǃǎƺǵǓƲǒȂǾǳǻǡǯǲǒȂȋȈǥǡȈǢǏȊǛȐȏǔǎǩȘȕǥȔǶȍǬǙǛǴȄȀǵțǧǟǾǜǣȄȉȀǾȭȇǻȞǾȦȢȲȸȪȧǶȌȩȲȰǺȴȲȯɀșȖǾȑȉȼȡȄȧɊɎȜɌɇȨɐɍȑȶȱȗȲȹȦȯȺȰɒȩɀȴȹɦȢȼȹɒȵȽȵȨȦɗɋȩȫɒɏɉȬȰɦɷɵɓɏɲɵɿȸɹɒɘɬɷɂɐɽɣɶɺɝɌɝɢʉɰɧɢʋʊɬɟɦʏɥʈɯɹʍɵʠɛɚɭʟɿɵʀɠɠʞɻɥʉɤʟɭʲʨʜʕʁʍʬʬʏʻʭʅʑʹʛʕɸʹʬ˅˅ʑʒ˄˂ʆʳʔʼʼʞ˄ˁʤʞ˅ˌʔʕʴʢʖ˄ˈ˙˘ʚ˘ʵˋʞ˒ʶʳʷ˕˃ʲ˃ʸʼˎˬʿ˰", (byte)109, 65);
                    NLoginType_009.var_java_lang_String_arr_b[16] = NLoginCore_427.A("ƩƦƋǆǒƍƱǎǒƯǇƦƲƳƒƿƬǌǚǜǄǚǟǆƻǜǬǛǝǉǨǙƿǓǳǍǴƮƵǙǗǰǑƺǊǨǖǭǝǾȃǚǁǽǵȀǷȄǋǉǢǹǎǰǛǬȉǠǷȍȕȔȘțǰǱȉǘǷȖǟȂǠȄǠȁǷǩǨȊȧȀǶȜȏȄȁȳȌǮȴȋȀȤȎȑǶȍȩȹȗșȪǵȌȄȗȏȘȦȸȬȈȭɈȟȼȼȋȩȑȤȮɕȸȗȨȍȰȏɏɜȸɌɝɄɛɆȴɇɤɇȪɘɣɬɘɇɇȣȯȰɳȮɕȩȶɌɴɅȺɭəɝɍɰɡɰȻɼɟɴȿɡɤɳɪɷɊɘʑɝʎʏɑʐʉɸɕɲɳʇʒʌɔʑɳʜʣʎʄɿɾʏɼɶʧʬɿʍʘʥʄʒʉʫʐʄʑʢʭɹʑʤʊʵʧʍɻʾʊɽʓʴˇɹ˂ʪʵɽʙˎʠ˅ʱˏ", (byte)109, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_009.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ձՓՖՁչՅըհ՝ի՗ԻՑՔ՛յղՀսնվՠֆ֋ռ՜։֐Ցփ֍֔", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[1] = NLoginCore_446.F("֔֝֜֡օ֛֧֘սրֈյջո֝֏րֲֶ֯փ֥ռս", (byte)109, 70);
                    NLoginType_009.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ղՍՂյ԰ՄՇպթ՝սՄ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[3] = NLoginCore_453.A("ǓƐƫƧƣƴƖƳǒƩǌǍǓƖǔǡƸƶǑǡǆƙơǥƻǟǂƩǅǋƺǊǪƮǨƿǀǐƵǧǯǫǫǰǎƱǠǹƾǜǚǞǳȄǺǃǆǶǣǥǤǇǌǱǍǛǥȃǪǧȌǭȃǨǙǸȓǿȒȉȏǮǳȎǽǹȤǵȩșǩȃǫȨǬȆȱȊȌȠȡȉȤȘȹȲȜȁ", (byte)109, 65);
                    NLoginType_009.var_java_lang_String_arr_b[4] = NLoginCore_138.D("ձՓՖՁչՅըհ՝ի՗ԻՑՔ՛յղՀսնվՠվԾվիգռձ՛ձՍ", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[5] = NLoginCore_387.C("էհկմ՘ծիպՐՓ՛՗նԹոՖցՒճՔզՒՏՐ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[6] = NLoginCore_223.B("ƾƐƋƎǕƩƲǓǌǙƓơ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[7] = NLoginCore_091.D("նԳՎՊՆ՗ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց֋բգճ՘֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯֐֦֋ռֱֲֵֶ֛֢֑֖֬֠֘ֆֹ֧֖֢֫֜։ֲ֎׊ׂאֱיֻ֪֤֚֘֕֘", (byte)109, 68);
                    NLoginType_009.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ǎưƳƞǖƢǅǍƺǈƴƘƮƱƸǒǏƝǚǓǛƱƚǥǖƺƾǎƬǗƻǑǛǴǞǐǦǡǕǙǧǑǜǁ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[9] = NLoginCore_004.F("֔֝֜֡օ֛֧֘սր֊֟֩ֈջ֪֤հִ֣֤֏ռս", (byte)109, 70);
                    NLoginType_009.var_java_lang_String_arr_b[10] = NLoginCore_092.C("գկՊիԱշնըԻիՋՄ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[11] = NLoginCore_091.B("ǓƐƫƧƣƴƖƳǒƩǌǍǓƖǔǡƸƶǑǡǆƙơǥƻǟǂƩǅǋƺǊǪƮǨƿǀǐƵǧǯǫǫǰǎƱǠǹƾǜǚǞǳȄǺǃǆǶǣǥǤǇǌǱǍǛǥȃǪǧȌǭȃǨǙǸȓǿȒȉȏǮǳȎǽǻǨȄȔȡȫȌȅȧȈǿȤȧȕȎȀǰȓǫȘȗȌȁ", (byte)109, 66);
                    NLoginType_009.var_java_lang_String_arr_b[12] = NLoginCore_091.F("֠֙մ֘՝֣րփզ֨պթ֮ռ֮տֈ֟֩֊ծֵռս", (byte)109, 70);
                    NLoginType_009.var_java_lang_String_arr_b[13] = NLoginCore_559.E("֑ցվվսզսՠեզպ֎֏֏֊իտ֨֩փց֣֊֒֏և֨֏պֻ֍֣֓֙֕ׄ׆ַׇָ֝֓֞֊ׅ֣ւ֢ג׎׃׋ֱֿׂ֢גכטֱֵטֲ֟ך֫נןֹ֤֞רץֵע׫ׂ׭ר׀֫׬ׂק׌׊ׯ׭׳כטּױׯ׏א׶׼בה׻ך؄ל؂ׇפ׾פׅא؆פ؂עצؔ׏שؑז׍ؚײؔ׿ؑ؊מׯ׮ؔئ׻؆ײ؞׹ؖإ؀؞ؙؒשؑآآت؀؈سؕذ؇؅ذ؉ذ׼؜؍؝ؒؠ؄׾ققٌب؆؈كًؤف؎؏أ؏إؓظؙئجٙعسُٜٙآ؜ٟؠؙصّآس٨٤٘ٚتّٮ٬ؾِٖـٕٴٙسْضؼڀٯَٱٸپٯٸُ٨ٛٻٕچټٌٛٚڄٿَٝچٱٴٴ٣ڑٸ٬څٶٞڀڊٔڍ٤ڟڜڣٵڞڈڥڜڤټچڊڦچٱڕٮڕڅڃڢڷٵڇڷڙڰڝڰ", (byte)109, 69);
                    NLoginType_009.var_java_lang_String_arr_b[14] = NLoginCore_223.C("ՌՉԮթյ԰ՔձյՒժՉՕՖԵբՏկստէսւթ՞տ֏վրլ֋ռգՍ֊֋֔փՙ֒վ֚֓՘՚֍ջձպ֥ա֟թե֌դ֊֯վ֏տ֪խ։քֳ֕շַֹ֢ֈׂ֖֪֨֡֔ռրօֺ֖֔։ׇׇּׅ֪֙֠ׄ֟֝׆׍֫א׀֫֒֬חגא׊֛סהֳמהחֶפ֛שס׈ץךׂר׏ְ־׌׏׀׫ֲ׸ֱֵ׮יטשכ׵וז׎׿׹חןע׾׫׹ׄ؎׹ןנ׮ר،ؕ׏נזؓף״׵ט؛לר؜ס؀סעئؗ׼ؙبעآء׶؇أ׫ح؎؊׫׾؏تدؗج׶ؾؗخؖؖ؜؋ؼؠ؆؀أ؃ؼً؋ؘث؍ج؞ىمْؤًؗؗعٔؗٗؼظٌٗسِٖ١ؠكأؽ٘دذ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[15] = NLoginCore_559.C("դՔՑՑՐԹՐԳԸԹՍաբբ՝ԾՒջռՖՔն՝եբ՚ջբՍ֎ՠզլնը֗֙֊֚֋հզձ՝֘նՕյ֥֖֡֞ք֒֕յ֥֮֫ֈք֫օղ֭վֲֳշձ֌ָֻֈְַ֙֏ռվ֧֣֗֘־֊ւ֡տֆ֧֣֬֡אׁ֪֞֡׉ׅוכ׍׊֙֯׌וד֝חוגףִֹּ֡֬ן֧ׄ׊׭ױֿׯת׋׳װִיהֺול׉גםד׵׌ףחל؉ׅןל׵טנט׋׉׺׮׌׎׵ײ׬׏ד؉ؘؚ׶ײؘؕآכ؜׵׻؏ؚץ׳ؠ؆ؙ؝؀ׯ؀؅جؓ؊؅خح؏؂؉ز؈ثؒ؜ذؘك׾׽ؐقآؘأ؃؃ف؞؈ج؇قًٕؐؿظؤذُُزِٞبشٜؾظ؛ُٜ٨٨شص٧٥ةٖطٟٟف٧٤هف٨ٯطظٗمع٧٫ټٻؽٻ٘ٮفٵٖٙٞڈ١نٜمڄٍ٤ڏٴ", (byte)109, 67);
                    NLoginType_009.var_java_lang_String_arr_b[16] = NLoginCore_453.D("ՌՉԮթյ԰ՔձյՒժՉՕՖԵբՏկստէսւթ՞տ֏վրլ֋ռբն֖հ֗Ց՘ռպ֓մ՝խ֋չ֐ր֦֡սդ֣֧֚֠֘ծլօ֜ձ֓վ֏֬փְַָֻ֚־֓֔֬ջֹ֚ւ֥փ֧փ֤֚֌֋֭׊ֲֿ֣֧֤֙ז֑֯חְֱִׇ֣֮֙׌לֺּ׍ֲֺֻ֧֘֯׉כ׏֫א׫ׂןן֮׌ִׇב׸כֺ׋ְדֲײ׿כׯ؀ק׾שחת؇ת׍׻؆؏׻תת׆גדؖב׸׌יׯؗרםؐ׼؀װؓ؄ؓמ؟؂ؗע؄؇ؖ؍ؚ׭׻ش؀رز״سج؛׸ؕؖتصد׷شؖؿنراآءز؟ؙيُآذػواصجَساشمِ؜شهح٘يذ؞١حؠضٗ٪ؠٚ١٥٠٥نؾٓٝؿ", (byte)109, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_009.var_java_lang_String_arr_b[0] = NLoginCore_446.B("ƌƌƢƠǁǄƸƑǐƯƹƙǗƬƗǉƝƟƭƞơƾǕǟǧǊǞǁǇǯǱǪ", (byte)109, 66);
                    continue block7;
                }
                case 4: {
                    NLoginType_009.var_java_lang_String_arr_b[0] = NLoginCore_201.C("դԱՠՅլմձոՓՇՔՊշփԻն՞նՔգՖֈՏՐ", (byte)109, 67);
                }
            }
        }
    }

    @Generated
    public NLoginType_009(nLoginBungee nLoginBungee2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_e = nLoginBungee2;
        this.C = NLoginType_008;
    }

    @EventHandler(priority=32)
    public void a(ServerConnectEvent serverConnectEvent) {
        if (serverConnectEvent.isCancelled()) {
            return;
        }
        try {
            this.b(serverConnectEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_009.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + serverConnectEvent.getClass().getSimpleName() + (String)NLoginType_009.c("㺃", (int)var_int_e, (long)(f ^ g)) + serverConnectEvent.getPlayer().getName() + (String)NLoginType_009.c("㺆", (int)h, (long)i), throwable, new Object[j]);
            serverConnectEvent.setCancelled(k != 0);
            serverConnectEvent.getPlayer().disconnect(TextComponent.fromLegacyText((String)NLoginType_009.c("㺉", (int)l, (long)(m ^ n))));
        }
    }
}

