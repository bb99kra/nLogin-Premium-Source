/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.command.CommandSource
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.ProxyServer
 *  com.velocitypowered.api.proxy.messages.ChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.title.Title
 *  net.kyori.adventure.title.Title$Times
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_465;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_023;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;

public class NLoginCore_420
implements NLoginCore_277 {
    private static int bf;
    private static String[] var_java_lang_String_arr_b;
    private static int bi;
    private static long bq;
    private static int bp;
    private static int an;
    private static long i;
    private static int ce;
    private static int ar;
    private static long aw;
    private static int w;
    private static int bx;
    private static int bo;
    private static long bn;
    private static long ao;
    private static int bb;
    private static int r;
    private static long az;
    private static long t;
    private static int var_int_f;
    private static int s;
    private static int z;
    private static int h;
    private static int q;
    private static int u;
    private static int af;
    private static int var_int_a;
    private final UUID var_java_util_UUID_f = UUID.randomUUID();
    private static int var_int_b;
    private NLoginInterface_023 var_com_nickuc_login_NLoginInterface_023_a;
    private static int x;
    private static long cg;
    private static long bh;
    private static int ay;
    private static int n;
    private final ProxyServer var_com_velocitypowered_api_proxy_ProxyServer_c;
    private static int bw;
    private static int ci;
    private static long g;
    private static long bd;
    private static int ag;
    private static int ak;
    private static int ad;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_aq;
    private static int aa;
    private static long be;
    private static int e;
    private final NLoginCore_455 var_com_nickuc_login_NLoginCore_455_b;
    private static int ca;
    private static long am;
    private static int ac;
    private static int bt;
    private static int cb;
    private static int au;
    private static int bl;
    private static int ax;
    private static long by;
    private static int bk;
    private static int bu;
    private static long as;
    private static int ah;
    private static int bg;
    private static long d;
    private static int bj;
    private static int ab;
    private static long var_long_j;
    private final boolean var_boolean_aq;
    private static int ba;
    private static long ap;
    private static long v;
    private static int cf;
    private static long k;
    static final Map<Player, NLoginCore_420> cfr_renamed_22;
    private static int aj;
    private static int bc;
    private static int ch;
    private static long br;
    private static int p;
    private final Player var_com_velocitypowered_api_proxy_Player_a;
    private static int cc;
    private static int m;
    private static int ae;
    private static int ai;
    private static int al;
    private static long bm;
    private static int av;
    private static long var_long_c;
    private static long l;
    private static int cd;
    private static long bv;
    private static long bz;
    private static long at;
    private static long y;
    private static long o;
    private static int bs;

    @Override
    public void l(String string) {
        if (string.length() >= z && string.charAt(aa) == ab) {
            string = string.substring(ac);
        }
        this.var_com_velocitypowered_api_proxy_ProxyServer_c.getCommandManager().executeImmediatelyAsync((CommandSource)this.var_com_velocitypowered_api_proxy_Player_a, string);
    }

    @Override
    public CompletableFuture<Void> a(String string) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.var_com_velocitypowered_api_proxy_Player_a.disconnect((Component)NLoginCore_529.a(string));
        completableFuture.complete(null);
        return completableFuture;
    }

    @Generated
    private NLoginCore_420(NLoginCore_455 NLoginCore_4552, Player player, ProxyServer proxyServer, boolean bl) {
        this.var_com_nickuc_login_NLoginCore_455_b = NLoginCore_4552;
        this.var_com_velocitypowered_api_proxy_Player_a = player;
        this.var_com_velocitypowered_api_proxy_ProxyServer_c = proxyServer;
        this.var_boolean_aq = bl;
    }

    @Override
    public UUID java_util_UUID_a() {
        return this.var_com_velocitypowered_api_proxy_Player_a.getUniqueId();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_420.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 67), NLoginCore_420.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ࢒࢔࢜࢟ࢊ࡭ࢎ࢙ࢂ࢝ࢣ࢓Ԛ", (byte)90, 67) + string + NLoginCore_091.B("ŭ", (byte)90, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean i(String string) {
        return this.var_com_velocitypowered_api_proxy_Player_a.hasPermission(string);
    }

    private static String a(int n, long l) {
        l ^= 0x4CL;
        l ^= 0xB8428CD24EC4C560L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(24 + 45), (byte)(42 + 41), (byte)(2 + 45), 67, (byte)(39 + 27), (byte)(19 + 48), (byte)(44 + 3), (byte)(33 + 47), (byte)(14 + 61), (byte)(30 + 37), (byte)(28 + 55), (byte)(51 + 2), (byte)(15 + 65), 97, (byte)(2 + 98), (byte)(30 + 70), (byte)(45 + 60), (byte)(72 + 38), (byte)(81 + 22)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(8 + 75)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("ԩԶԵӸԸԴԯԸՃԲӿԽՁԺԽՃԅ࢕ࢗ࢟ࢢࢍࡰ࢑࢜ࢅࢠࢦ࢖", (byte)10, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_420.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static NLoginCore_420 a(NLoginCore_455 NLoginCore_4552, ProxyServer proxyServer, Player player) {
        NLoginCore_420 NLoginCore_4202 = (NLoginCore_420)var_long_j.get(player);
        if (NLoginCore_4202 != null) {
            return NLoginCore_4202;
        }
        if (NLoginCore_370.aj()) {
            StackTraceElement[] stackTraceElementArray = new Exception().getStackTrace();
            Object object = stackTraceElementArray.length > 0 ? stackTraceElementArray[Math.min(ba, stackTraceElementArray.length - bb)].toString() : NLoginCore_420.c("㺀", (int)bc, (long)(bd ^ be));
            Object[] objectArray = new Object[bi];
            objectArray[NLoginCore_420.bj] = player.getUsername();
            objectArray[NLoginCore_420.bk] = object;
            NLoginCore_370.c((String)NLoginCore_420.c("㺃", (int)(bf & bg), (long)bh), objectArray);
        }
        return NLoginCore_420.b(NLoginCore_4552, proxyServer, player);
    }

    @Override
    public Optional<String> a() {
        return Optional.of(this.var_com_velocitypowered_api_proxy_Player_a.getPlayerSettings().getLocale().toLanguageTag());
    }

    static {
        var_int_a = (0 >>> 151 | 0 << ~151 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(7582871019383140978L);
        e = Integer.reverse(Integer.MIN_VALUE);
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(7582871019383140978L);
        h = 2 >>> 128 | 2 << -128;
        i = Long.reverse(7582871019383140978L);
        var_long_j = Long.reverse(0x4C00000000000000L);
        k = Long.reverse(0x4C00000000000000L);
        l = Long.reverse(0x4C00000000000000L);
        m = (24576 >>> 109 | 24576 << ~109 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(-1);
        o = Long.reverse(7582871019383140978L);
        p = (1024 >>> 137 | 1024 << ~137 + 1) & 0xFFFFFFFF;
        q = 0 >>> 184 | 0 << ~184 + 1;
        r = (4 >>> 2 | 4 << -2) & 0xFFFFFFFF;
        s = 4096 >>> 106 | 4096 << -106;
        t = Long.reverse(7582871019383140978L);
        u = Integer.reverse(-1610612736);
        v = Long.reverse(7582871019383140978L);
        w = Integer.reverse(0x60000000);
        x = Integer.reverse(-1);
        y = Long.reverse(7582871019383140978L);
        z = Integer.reverse(0x40000000);
        aa = Integer.reverse(0);
        ab = Integer.reverse(-201326592);
        ac = (8192 >>> 173 | 8192 << -173) & 0xFFFFFFFF;
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = (0 >>> 114 | 0 << ~114 + 1) & 0xFFFFFFFF;
        af = 0x200000 >>> 245 | 0x200000 << -245;
        ag = Integer.reverse(0);
        ah = 0x2000000 >>> 24 | 0x2000000 << ~24 + 1;
        ai = 0 >>> 170 | 0 << -170;
        aj = (65536 >>> 112 | 65536 << -112) & 0xFFFFFFFF;
        ak = Integer.reverse(-536870912);
        al = Integer.reverse(-1);
        am = Long.reverse(7582871019383140978L);
        an = Integer.reverse(0x10000000);
        ao = Long.reverse(6574064702852149874L);
        ap = Long.reverse(0x3200000000000000L);
        var_int_aq = (1073741855 >>> 254 | 1073741855 << ~254 + 1) & 0xFFFFFFFF;
        ar = Integer.reverse(-1879048192);
        as = Long.reverse(6574064702852149874L);
        at = Long.reverse(0x3200000000000000L);
        au = Integer.reverse(0x50000000);
        av = (-1 >>> 181 | -1 << -181) & 0xFFFFFFFF;
        aw = Long.reverse(7582871019383140978L);
        ax = (2816 >>> 40 | 2816 << ~40 + 1) & 0xFFFFFFFF;
        ay = -1 >>> 93 | -1 << -93;
        az = Long.reverse(7582871019383140978L);
        ba = Integer.reverse(-1073741824);
        bb = Integer.reverse(Integer.MIN_VALUE);
        bc = (24 >>> 161 | 24 << -161) & 0xFFFFFFFF;
        bd = Long.reverse(6574064702852149874L);
        be = Long.reverse(0x3200000000000000L);
        bf = Integer.reverse(-1342177280);
        bg = -1 >>> 35 | -1 << ~35 + 1;
        bh = Long.reverse(7582871019383140978L);
        bi = Integer.reverse(0x40000000);
        bj = (0 >>> 111 | 0 << -111) & 0xFFFFFFFF;
        bk = (4 >>> 162 | 4 << ~162 + 1) & 0xFFFFFFFF;
        bl = (0x1C000000 >>> 57 | 0x1C000000 << -57) & 0xFFFFFFFF;
        bm = Long.reverse(6574064702852149874L);
        bn = Long.reverse(0x3200000000000000L);
        bo = Integer.reverse(-1);
        bp = (0x1E000000 >>> 89 | 0x1E000000 << ~89 + 1) & 0xFFFFFFFF;
        bq = Long.reverse(6574064702852149874L);
        br = Long.reverse(0x3200000000000000L);
        bs = 0 >>> 210 | 0 << -210;
        bt = Integer.reverse(0x8000000);
        bu = -1 >>> 7 | -1 << -7;
        bv = Long.reverse(7582871019383140978L);
        bw = 256 >>> 72 | 256 << -72;
        bx = Integer.reverse(-2013265920);
        by = Long.reverse(6574064702852149874L);
        bz = Long.reverse(0x3200000000000000L);
        ca = Integer.reverse(0x40000000);
        cb = 0x4000000 >>> 26 | 0x4000000 << -26;
        cc = (0 >>> 25 | 0 << ~25 + 1) & 0xFFFFFFFF;
        cd = Integer.reverse(0);
        ce = (2304 >>> 135 | 2304 << -135) & 0xFFFFFFFF;
        cf = Integer.reverse(-1);
        cg = Long.reverse(7582871019383140978L);
        ch = Integer.reverse(-939524096);
        ci = (0x4C000000 >>> 218 | 0x4C000000 << ~218 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ch];
        var_java_lang_String_arr_b = new String[ci];
        NLoginCore_420.void_b();
        var_long_j = (long)new ConcurrentHashMap();
    }

    @Override
    public void a(String string, String string2, int n, int n2, int n3) {
        this.var_com_velocitypowered_api_proxy_Player_a.showTitle(Title.title((Component)NLoginCore_529.a(string), (Component)NLoginCore_529.a(string2), (Title.Times)Title.Times.times((Duration)Duration.ofMillis((long)n * var_long_j), (Duration)Duration.ofMillis((long)n2 * k), (Duration)Duration.ofMillis((long)n3 * l))));
    }

    public int hashCode() {
        Object[] objectArray = new Object[ah];
        objectArray[NLoginCore_420.ai] = this.var_java_util_UUID_f;
        objectArray[NLoginCore_420.aj] = this.var_com_velocitypowered_api_proxy_Player_a;
        return Objects.hash(objectArray);
    }

    @Override
    public boolean R() {
        return this.var_com_velocitypowered_api_proxy_Player_a.isActive();
    }

    @Override
    public void n(String string) {
        throw new UnsupportedOperationException((String)NLoginCore_420.c("㺀", (int)(var_int_a & var_int_b), (long)d));
    }

    @Override
    @Nullable
    public InetSocketAddress java_net_InetSocketAddress_a() {
        return this.var_com_velocitypowered_api_proxy_Player_a.getRemoteAddress();
    }

    @Override
    @Generated
    public boolean S() {
        return this.var_boolean_aq;
    }

    private static void void_b() {
        int n;
        var_long_c = 5642438536056790234L;
        long l = var_long_c ^ 0xB8428CD24EC4C560L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(49 + 20), (byte)(55 + 28), (byte)(45 + 2), 67, (byte)(65 + 1), (byte)(59 + 8), (byte)(23 + 24), (byte)(73 + 7), 75, (byte)(12 + 55), (byte)(54 + 29), (byte)(16 + 37), (byte)(34 + 46), (byte)(86 + 11), (byte)(34 + 66), (byte)(83 + 17), (byte)(93 + 12), (byte)(63 + 47), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_420.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ûĎðċõýûüġÝðĎñğĤóáęĈġþĭôõ", (byte)17, 65);
                    NLoginCore_420.var_java_lang_String_arr_b[1] = NLoginCore_451.B("òíÓðóğĒñăÿíĥĐħĢğäġĈĖďďĪģèþđĔĔÿõôįõĤĕčĩŁěįúĺĉ", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ԃԄԞԪԉԾԥԿԬՐՊԕ", (byte)17, 70);
                    NLoginCore_420.var_java_lang_String_arr_b[3] = NLoginCore_559.E("ӽԻԧԴԲՉՆԟԤ԰Ԭԕ", (byte)17, 69);
                    NLoginCore_420.var_java_lang_String_arr_b[4] = NLoginCore_384.C("ИгѝбяЮѓѠЩпзфцѭѦхйШхўѐгѤъвљѺѱжемъћыѶѾѸѤѣ҄҅Ѿѫѐ", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[5] = NLoginCore_387.D("ОПйхФљрњчѫѥа", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[6] = NLoginCore_446.E("ԞԙӿԜԟՋԾԝԯԫԚԃԺԍԆԬԩԲԡՌԔԳԔՍ԰ԘՔԩ՛ՓՁԭ", (byte)17, 69);
                    NLoginCore_420.var_java_lang_String_arr_b[7] = NLoginCore_575.C("ћѢжхгѧкКФШѓЬПЪзооѯщбѩхѳѫьфшщьѭѷѓѷѐљэѵѴчјѿѻѹѐ", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[8] = NLoginCore_427.D("ѕѡЫѣЗолџѤмзкќШѬиЬѢчѮпѤлм", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[9] = NLoginCore_453.F("ԞԙӿԜԟՋԾԝԯԫԚԜՓՍՁԨԡՔԮԓԕԵՅԴԷԞ՗Ր՟ԶԢՕԵՔԽԽՃՈՂ՛ՆԬ՚Ե", (byte)17, 70);
                    NLoginCore_420.var_java_lang_String_arr_b[10] = NLoginCore_223.C("ОПйхФљрњчѫѥа", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[11] = NLoginCore_223.C("ўефѝбчСѩСУѝа", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[12] = NLoginCore_575.C("иНїСмчУшбфуа", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[13] = NLoginCore_092.C("џѢѤєкѦхиПѫцТоЦЦТфоѲђѬѠяѮѺљхѯѧкљѾѫјѝѸо҅ѯоѩѡјќѻѪѸшҐ҈ьѿҒ҄ѱғғ҈ѪґҐҊѼҕѓѲћўѺ҄Қҥ҂ѵѿѣѼѥѻѬҏҥҟҰѭҞѩѲѶѷқҔѯѷҖҴ", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[14] = NLoginCore_324.D("ѡлѕгћМўношљѭмћйѝѮќЮђѪолм", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[15] = NLoginCore_223.F("ӿՈԽՀԞԫՉԩԄՇԸԠԽԡԲԯԷՓՌՐՕԳԠԡ", (byte)17, 70);
                    NLoginCore_420.var_java_lang_String_arr_b[16] = NLoginCore_223.A("ė÷üðæÕğēöÞğĖćÙþòäúČĈććôõ", (byte)17, 65);
                    NLoginCore_420.var_java_lang_String_arr_b[17] = NLoginCore_559.D("ѐТуѕбУЙѐтСЪШыщЬсхщћыоѴлм", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[18] = NLoginCore_027.C("ѝтїЬвПѥѝжЪчѕитцѥѢѠрЫѡѤлм", (byte)17, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_420.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ûĎðċõýûüġÝñöđġßēĝûĥĈĥĊçĭďħĩİĤÿİĦ", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[1] = NLoginCore_453.D("йдКзкѦљиъцдѬїѮѩѦЫѨяѝііѱѪЯхјћћцмлћю҃рѲсҁј҈ѷ҅ѐ", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[2] = NLoginCore_559.F("ԆԂԹԆԜԖԨԚԶԣԘԕ", (byte)17, 70);
                    NLoginCore_420.var_java_lang_String_arr_b[3] = NLoginCore_324.D("ИиЬМјеУнърТа", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[4] = NLoginCore_575.B("ÑìĖêĈçČęâøðýÿĦğþòáþėĉìĝăëĒĳĪïîõăĶĻĺïĿĊĜþċùĞįĞĦĆħĒŉĨġčōĔĕ", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[5] = NLoginCore_446.E("ӸԁԽԇՇԴԩՂԹԟԏԕ", (byte)17, 69);
                    NLoginCore_420.var_java_lang_String_arr_b[6] = NLoginCore_324.A("òíÓðóğĒñăÿî×ĎáÚĀýĆõĠèęěĜēċæĵĶĀė÷ĐčĳýĮĎīČĢĲĐĉ", (byte)17, 65);
                    NLoginCore_420.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ћѢжхгѧкКФШѓЬПЪзооѯщбѩхѳѫьфшщьѭѷѓпђєуѳѺіѨўѩ҉ѐ", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[8] = NLoginCore_427.F("ԺՆԐՈӼԣԠՄՉԡԜՒԐՑԼՈԏ԰ԲՐ՚ՙԠԡ", (byte)17, 70);
                    NLoginCore_420.var_java_lang_String_arr_b[9] = NLoginCore_559.E("ԞԙӿԜԟՋԾԝԯԫԚԜՓՍՁԨԡՔԮԓԕԵՅԴԷԞ՗Ր՟ԶԢՕԶԥԴՠբ՟Ո՜՟ՙզԵ", (byte)17, 69);
                    NLoginCore_420.var_java_lang_String_arr_b[10] = NLoginCore_387.A("ï×æêďÿÞðôßĖé", (byte)17, 65);
                    NLoginCore_420.var_java_lang_String_arr_b[11] = NLoginCore_446.B("Öě×ėíÚøÓêâðé", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[12] = NLoginCore_092.C("вТрМђѥяаСъјпѪзѝњѫбфџѲолм", (byte)17, 67);
                    NLoginCore_420.var_java_lang_String_arr_b[13] = NLoginCore_138.D("џѢѤєкѦхиПѫцТоЦЦТфоѲђѬѠяѮѺљхѯѧкљѾѫјѝѸо҅ѯоѩѡјќѻѪѸшҐ҈ьѿҒ҄ѱғғ҈ѪґҐҊѼҕѓѲћўѺ҄Қҥ҂ѵѿѣѼѥѻѬҏҥҟҰѭҢ҉ҴҙѴҴѷҨҐҠҭ", (byte)17, 68);
                    NLoginCore_420.var_java_lang_String_arr_b[14] = NLoginCore_559.B("ĚôĎìĔÕėö÷āĔðĤüþĢĕĕûĜćĪĂĬăðĐāĄčĒñ", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[15] = NLoginCore_027.B("ÓĜđĔòÿĝýØěČåøôèöĝõêģĜěĩéĭħīĎēđĮĤ", (byte)17, 66);
                    NLoginCore_420.var_java_lang_String_arr_b[16] = NLoginCore_223.E("ՃԣԨԜԒԁՋԿԢԊՌԼՓԌՂԩՎԶԎՊԕՙԠԡ", (byte)17, 69);
                    NLoginCore_420.var_java_lang_String_arr_b[17] = NLoginCore_427.A("ĉÛüĎêÜÒĉûÚãĐę÷ÿēĞĕ÷ĞìĤûĪéěĠĵèĔõĪ", (byte)17, 65);
                    NLoginCore_420.var_java_lang_String_arr_b[18] = NLoginCore_201.B("ĖûĐåëØĞĖïãāïüåóø÷ĊĞħċĝôõ", (byte)17, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_420.var_java_lang_String_arr_b[0] = NLoginCore_387.D("ѠљЮёЯжХђчѓѪзўќтцсшгЮсѤлм", (byte)17, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_420.var_java_lang_String_arr_b[0] = NLoginCore_092.B("æĊąñùęØ×ûĤġýģāûááÿõęæ÷ôõ", (byte)17, 66);
                }
            }
        }
    }

    public String toString() {
        return (String)NLoginCore_420.c("㺀", (int)(ak & al), (long)am) + this.var_com_velocitypowered_api_proxy_Player_a + (String)NLoginCore_420.c("㺃", (int)an, (long)(ao ^ ap)) + this.var_java_util_UUID_f + (char)var_int_aq;
    }

    @Override
    public String u() {
        return this.var_com_velocitypowered_api_proxy_Player_a.getUsername();
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return ae != 0;
        }
        NLoginCore_420 NLoginCore_4202 = (NLoginCore_420)object;
        return (Objects.equals(this.var_java_util_UUID_f, NLoginCore_4202.var_java_util_UUID_f) && Objects.equals(this.var_com_velocitypowered_api_proxy_Player_a, NLoginCore_4202.var_com_velocitypowered_api_proxy_Player_a) ? af : ag) != 0;
    }

    @Override
    public void d(Object object) {
        if (object instanceof String) {
            this.var_com_velocitypowered_api_proxy_Player_a.sendMessage((Component)NLoginCore_529.b((String)object, e != 0));
        } else if (object instanceof Component) {
            this.var_com_velocitypowered_api_proxy_Player_a.sendMessage((Component)object);
        } else {
            throw new IllegalArgumentException((String)NLoginCore_420.c("㺀", (int)var_int_f, (long)g) + object + (String)NLoginCore_420.c("㺃", (int)h, (long)i) + object.getClass().getCanonicalName());
        }
    }

    @Override
    public void p(String string) {
        this.var_com_velocitypowered_api_proxy_Player_a.spoofChatInput(string);
    }

    @Override
    public void a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_337 NLoginCore_3372, Object object, byte[] byArray) {
        ChannelIdentifier channelIdentifier;
        if (object instanceof String) {
            String string = (String)object;
            String[] stringArray = string.split((String)NLoginCore_420.c("㺀", (int)(m & n), (long)o));
            channelIdentifier = stringArray.length == p ? MinecraftChannelIdentifier.create((String)stringArray[q], (String)stringArray[r]) : new LegacyChannelIdentifier(string);
        } else if (object instanceof ChannelIdentifier) {
            channelIdentifier = (ChannelIdentifier)object;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_420.c("㺃", (int)s, (long)t) + object + (String)NLoginCore_420.c("㺆", (int)u, (long)v) + object.getClass().getCanonicalName());
        }
        switch (NLoginCore_465.t[NLoginCore_3372.ordinal()]) {
            case 1: {
                this.var_com_velocitypowered_api_proxy_Player_a.sendPluginMessage(channelIdentifier, byArray);
                break;
            }
            case 2: {
                this.var_com_velocitypowered_api_proxy_Player_a.getCurrentServer().ifPresent(serverConnection -> {
                    if (!serverConnection.getServer().getPlayersConnected().isEmpty()) {
                        serverConnection.sendPluginMessage(channelIdentifier, byArray);
                    }
                });
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_420.c("㺉", (int)(w & x), (long)y) + (Object)((Object)NLoginCore_3372));
            }
        }
    }

    public static NLoginCore_420 a(NLoginCore_455 NLoginCore_4552, ProxyServer proxyServer, Object object) {
        if (object instanceof String) {
            String string = ((String)object).toLowerCase(Locale.ENGLISH);
            return proxyServer.getPlayer(string).map(player -> NLoginCore_420.a(NLoginCore_4552, proxyServer, player)).orElse(null);
        }
        if (object instanceof Player) {
            return NLoginCore_420.a(NLoginCore_4552, proxyServer, (Player)object);
        }
        throw new IllegalArgumentException((String)NLoginCore_420.c("㺀", (int)ar, (long)(as ^ at)) + object + (String)NLoginCore_420.c("㺃", (int)(au & av), (long)aw) + (String)(object != null ? object.getClass().getCanonicalName() : NLoginCore_420.c("㺆", (int)(ax & ay), (long)az)));
    }

    /*
     * Exception decompiling
     */
    static NLoginCore_420 b(NLoginCore_455 var0, ProxyServer var1_1, Player var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void ad() {
        this.var_com_velocitypowered_api_proxy_Player_a.resetTitle();
    }

    @Override
    public NLoginCore_589 com_nickuc_login_NLoginInterface_022_a() {
        return this.var_com_nickuc_login_NLoginCore_455_b.a(ad != 0);
    }

    @Override
    public <T> T c() {
        return (T)this.var_com_velocitypowered_api_proxy_Player_a;
    }

    @Override
    public NLoginInterface_023 com_nickuc_login_NLoginInterface_023_a() {
        if (this.var_com_nickuc_login_NLoginInterface_023_a == null) {
            this.var_com_nickuc_login_NLoginInterface_023_a = (object, objectArray) -> {
                throw new UnsupportedOperationException((String)NLoginCore_420.c("㺀", (int)(ce & cf), (long)cg));
            };
        }
        return this.var_com_nickuc_login_NLoginInterface_023_a;
    }

    @Override
    public int h() {
        return (int)this.var_com_velocitypowered_api_proxy_Player_a.getPing();
    }

    @Override
    public void o(String string) {
        this.var_com_velocitypowered_api_proxy_Player_a.sendActionBar((Component)NLoginCore_529.a(string));
    }

    @Override
    public String getName() {
        return this.var_com_velocitypowered_api_proxy_Player_a.getUsername();
    }
}

