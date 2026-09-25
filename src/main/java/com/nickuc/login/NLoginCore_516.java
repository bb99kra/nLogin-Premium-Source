/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.proxy.ProxyServer
 *  com.velocitypowered.api.proxy.server.ServerInfo
 *  com.velocitypowered.api.util.ProxyVersion
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_500;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_390;
import com.nickuc.login.NLoginCore_471;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_008;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_149;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_328;
import com.nickuc.login.NLoginInterface_040;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.ServerInfo;
import com.velocitypowered.api.util.ProxyVersion;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_516
implements NLoginCore_493 {
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private static int var_int_c;
    private static int m;
    private static int t;
    private static int g;
    private static long h;
    private static long d;
    private static int j;
    private static int p;
    private static long var_long_c;
    private static int s;
    private static int o;
    private static long n;
    private static String[] var_java_lang_String_arr_a;
    private static long q;
    private final NLoginCore_455 var_com_nickuc_login_NLoginCore_455_a;
    private static int k;
    private static long e;
    private static int f;
    private static int i;
    private static long r;
    private static int var_int_a;
    private static long l;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_516.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ÑóõÕùĘĐĦĒáğĕģĝæċĭĬĤĪĤù", (byte)21, 65), NLoginCore_516.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("ԴՁՀԃՃԿԺՃՎԽԊՈՌՅՈՎԐࢗ࢕࢜ࢠ࢙ࢂࢯࢠࢦԥ", (byte)21, 70) + string + NLoginCore_138.E("ԋ", (byte)21, 69) + methodType.toString(), exception);
        }
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_a() {
        return new NLoginCore_328(this.var_com_nickuc_login_NLoginCore_455_a);
    }

    private static String a(int n, long l) {
        l ^= 0x4BL;
        l ^= 0xBA681933E6DFA346L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(8 + 61), 83, (byte)(23 + 24), (byte)(13 + 54), (byte)(15 + 51), (byte)(13 + 54), (byte)(16 + 31), (byte)(18 + 62), (byte)(29 + 46), (byte)(50 + 17), (byte)(36 + 47), (byte)(44 + 9), (byte)(72 + 8), (byte)(2 + 95), (byte)(29 + 71), (byte)(68 + 32), (byte)(2 + 103), (byte)(103 + 7), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.A("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӗӕӜӠәӂӯӠӦ", (byte)73, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_516.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void j() {
        this.var_com_nickuc_login_NLoginCore_455_a.j();
    }

    @Override
    public NLoginInterface_040 com_nickuc_login_NLoginInterface_040_a() {
        ProxyServer proxyServer = this.var_com_nickuc_login_NLoginCore_455_a.com_velocitypowered_api_proxy_ProxyServer_a();
        return new NLoginCore_500(this.var_com_nickuc_login_NLoginCore_455_a, proxyServer, NLoginCore_149.a(proxyServer, proxyServer.getConsoleCommandSource()));
    }

    @Override
    public NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a() {
        return this.var_com_nickuc_login_NLoginCore_455_a.com_nickuc_login_NLoginInterface_034_arr_a();
    }

    @Override
    public boolean e(String string) {
        return o != 0;
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_b() {
        return new NLoginCore_008(this.var_com_nickuc_login_NLoginCore_455_a, this.var_com_nickuc_login_NLoginCore_455_a.com_velocitypowered_api_proxy_ProxyServer_a());
    }

    @Override
    public NLoginInterface_047 com_nickuc_login_NLoginInterface_047_a() {
        return new NLoginCore_390(this.var_com_nickuc_login_NLoginCore_455_a);
    }

    @Override
    public void i() {
        this.var_com_nickuc_login_NLoginCore_455_a.i();
    }

    @Override
    public void U() {
        NLoginCore_370.a(this.var_com_nickuc_login_NLoginCore_455_a, var_int_a != 0, var_int_b != 0);
    }

    @Override
    public void T() {
        this.var_com_nickuc_login_NLoginCore_455_a.T();
    }

    private static void void_b() {
        int n;
        var_long_c = -7601439360259094240L;
        long l = var_long_c ^ 0xBA681933E6DFA346L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(33 + 36), (byte)(24 + 59), (byte)(17 + 30), (byte)(43 + 24), (byte)(65 + 1), (byte)(14 + 53), (byte)(28 + 19), (byte)(63 + 17), 75, (byte)(34 + 33), (byte)(51 + 32), (byte)(41 + 12), (byte)(52 + 28), 97, (byte)(59 + 41), (byte)(79 + 21), (byte)(16 + 89), (byte)(83 + 27), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_516.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ՀԚԱԯԟԭԨՃԑՅՆԝ", (byte)96, 68);
                    NLoginCore_516.var_java_lang_String_arr_b[1] = NLoginCore_004.F("֎֑Չ֑֘֓դ֖֍֊՞դ", (byte)96, 70);
                    NLoginCore_516.var_java_lang_String_arr_b[2] = NLoginCore_559.B("ƖƤƪŶƏųƍſƜŽƝƣƀŽżơƤơƂǉƅƕƒƓ", (byte)96, 66);
                    NLoginCore_516.var_java_lang_String_arr_b[3] = NLoginCore_091.A("ƣƵŰƎŸƹƬŷƭŽƸƇ", (byte)96, 65);
                    NLoginCore_516.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ՁՉԂՃԬԌԪՔՆԕԓԝ", (byte)96, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_516.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƊƦƉƜƏƽŽƪƛƌŽƇ", (byte)96, 65);
                    NLoginCore_516.var_java_lang_String_arr_b[1] = NLoginCore_575.D("ԭԭԐԎԒԤԡՃԟՐԴԝ", (byte)96, 68);
                    NLoginCore_516.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ƖƤƪŶƏųƍſƜŽƛƾƶƹƿƁǄƂƵǋƾƥƒƓ", (byte)96, 66);
                    NLoginCore_516.var_java_lang_String_arr_b[3] = NLoginCore_387.A("ƢƚƊƤƫƼŷƘŹƌƢƇ", (byte)96, 65);
                    NLoginCore_516.var_java_lang_String_arr_b[4] = NLoginCore_427.D("ԾՉՃԎԐԮՀԯՉԫՖԝ", (byte)96, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_516.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ԸՄՎԎՎՐՏՀՉՒԐԢԵԔԵՆՉՠԱԯՂԫԨԩ", (byte)96, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_516.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ԿԼՂԨԄԣՏՃՄԡԗԨՆ՗ԪՐԜԴԳԙ՟ՓԽՃՏԹԸՇԦգԸբ", (byte)96, 67);
                }
            }
        }
    }

    @Override
    public NLoginCore_589 a(boolean bl) {
        return new NLoginCore_471(this.var_com_nickuc_login_NLoginCore_455_a.com_nickuc_login_loader_platform_VelocityLoader_a());
    }

    @Generated
    public NLoginCore_516(NLoginCore_455 NLoginCore_4552) {
        this.var_com_nickuc_login_NLoginCore_455_a = NLoginCore_4552;
    }

    @Override
    public NLoginCore_364 com_nickuc_login_NLoginCore_364_a() {
        ProxyVersion proxyVersion = this.var_com_nickuc_login_NLoginCore_455_a.com_velocitypowered_api_proxy_ProxyServer_a().getVersion();
        return new NLoginCore_364(proxyVersion.getName(), proxyVersion.getVersion(), proxyVersion.getVersion() + (String)NLoginCore_516.c("㺀", (int)var_int_c, (long)(d ^ e)) + proxyVersion.getVendor() + (String)NLoginCore_516.c("㺃", (int)(f & g), (long)h), NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d, i != 0);
    }

    @Override
    public void O() {
        this.var_com_nickuc_login_NLoginCore_455_a.O();
    }

    @Override
    public void V() {
        try {
            Collection collection = this.var_com_nickuc_login_NLoginCore_455_a.com_velocitypowered_api_proxy_ProxyServer_a().getAllServers();
            if (collection != null && !collection.isEmpty()) {
                List list = collection.stream().map(registeredServer -> {
                    ServerInfo serverInfo = registeredServer.getServerInfo();
                    return serverInfo.getName() + (String)NLoginCore_516.c("㺀", (int)p, (long)(q ^ r)) + serverInfo.getAddress();
                }).collect(Collectors.toList());
                this.var_com_nickuc_login_NLoginCore_455_a.var_com_nickuc_login_NLoginCore_572_c.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_203_a().a((String)NLoginCore_516.c("㺀", (int)(j & k), (long)l), String.join((CharSequence)NLoginCore_516.c("㺃", (int)m, (long)n), list));
            }
        }
        catch (NoSuchMethodError noSuchMethodError) {
            // empty catch block
        }
    }

    static {
        var_int_a = 0 >>> 98 | 0 << ~98 + 1;
        var_int_b = (0 >>> 101 | 0 << ~101 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(329229449797189993L);
        e = Long.reverse(-3314649325744685056L);
        f = (128 >>> 199 | 128 << ~199 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(-1);
        h = Long.reverse(-2985419875947495063L);
        i = Integer.reverse(0);
        j = Integer.reverse(0x40000000);
        k = -1 >>> 84 | -1 << ~84 + 1;
        l = Long.reverse(-2985419875947495063L);
        m = Integer.reverse(-1073741824);
        n = Long.reverse(-2985419875947495063L);
        o = Integer.reverse(0);
        p = (32 >>> 3 | 32 << -3) & 0xFFFFFFFF;
        q = Long.reverse(329229449797189993L);
        r = Long.reverse(-3314649325744685056L);
        s = Integer.reverse(-1610612736);
        t = (0x2800000 >>> 183 | 0x2800000 << -183) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_516.void_b();
    }
}

