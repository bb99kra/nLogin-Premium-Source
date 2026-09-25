/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.LoaderBootstrap
 *  com.nickuc.login.loader.platform.VelocityLoader
 *  com.velocitypowered.api.proxy.ProxyServer
 *  com.velocitypowered.api.proxy.server.RegisteredServer
 */
package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.VelocityLoader;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginInterface_020;
import com.nickuc.login.NLoginCore_152;
import com.nickuc.login.NLoginCore_292;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_390;
import com.nickuc.login.NLoginCore_471;
import com.nickuc.login.NLoginCore_071;
import com.nickuc.login.NLoginCore_516;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_422;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_572;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_455
implements LoaderBootstrap,
NLoginCore_292,
NLoginCore_116<VelocityLoader> {
    private static int e;
    private static int i;
    private static int s;
    private static long p;
    private final VelocityLoader var_com_nickuc_login_loader_platform_VelocityLoader_a;
    private static int o;
    final NLoginCore_572 var_com_nickuc_login_NLoginCore_572_c;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long q;
    private static int var_int_c;
    private static int f;
    private static int h;
    private static int var_int_b;
    private static long n;
    private static long var_long_c;
    private final NLoginCore_516 var_com_nickuc_login_NLoginCore_516_a;
    private final NLoginInterface_020 var_com_nickuc_login_NLoginInterface_020_c;
    private static int d;
    private static long j;
    private static long k;
    private static int var_int_a;
    private static int r;
    private boolean Q;
    private static long m;
    private static int l;

    protected void i() {
        if (this.var_com_nickuc_login_NLoginCore_572_c.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_c.a()).void_i();
        }
    }

    protected abstract NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a();

    @Override
    public void void_c() {
        this.Q = var_int_c;
    }

    @Override
    public /* synthetic */ Object java_lang_Object_b() {
        return this.com_nickuc_login_loader_platform_VelocityLoader_a();
    }

    @Override
    public boolean N() {
        return this.Q;
    }

    protected void j() {
        if (this.var_com_nickuc_login_NLoginCore_572_c.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_c.a()).j();
        }
    }

    @Override
    public Object a(int n) {
        switch (n) {
            case 0: {
                Collection collection = this.com_velocitypowered_api_proxy_ProxyServer_a().getAllServers();
                if (collection == null || collection.isEmpty()) break;
                StringBuilder stringBuilder = new StringBuilder();
                for (RegisteredServer registeredServer : collection) {
                    String string;
                    int n2;
                    InetSocketAddress inetSocketAddress = registeredServer.getServerInfo().getAddress();
                    if (!inetSocketAddress.isUnresolved()) {
                        InetAddress inetAddress = inetSocketAddress.getAddress();
                        n2 = inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress() || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_a.b(inetAddress) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_b.b(inetAddress) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_c.b(inetAddress) ? d : e;
                        string = inetAddress.getHostAddress();
                    } else {
                        n2 = f;
                        string = inetSocketAddress.getHostName();
                        if (string == null) {
                            n2 = g;
                        } else {
                            try {
                                string = InetAddress.getByName(string).getHostAddress();
                            }
                            catch (UnknownHostException unknownHostException) {
                                n2 = h;
                            }
                        }
                    }
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append((String)NLoginCore_455.c("㺀", (int)i, (long)(j ^ k)));
                    }
                    if (n2 != 0) {
                        stringBuilder.append((String)NLoginCore_455.c("㺃", (int)l, (long)(m ^ NLoginCore_455.n)));
                    } else {
                        stringBuilder.append(string);
                    }
                    stringBuilder.append((String)NLoginCore_455.c("㺆", (int)o, (long)(p ^ q)));
                    stringBuilder.append(inetSocketAddress.getPort());
                }
                return stringBuilder.toString();
            }
            case 1: {
                return this.com_velocitypowered_api_proxy_ProxyServer_a().getBoundAddress().getPort();
            }
        }
        return null;
    }

    public NLoginCore_390 com_nickuc_login_NLoginCore_390_a() {
        return (NLoginCore_390)this.var_com_nickuc_login_NLoginCore_572_c.c();
    }

    public String toString() {
        return this.var_com_nickuc_login_NLoginCore_572_c.toString();
    }

    @Override
    public /* synthetic */ NLoginCore_589 b(boolean bl) {
        return this.a(bl);
    }

    public void enable() {
        this.var_com_nickuc_login_NLoginCore_572_c.av();
    }

    public void load() {
        this.Q = var_int_a;
        this.var_com_nickuc_login_NLoginCore_572_c.au();
    }

    public void disable() {
        this.var_com_nickuc_login_NLoginCore_572_c.aw();
        this.Q = var_int_b;
    }

    public NLoginCore_471 a(boolean bl) {
        return (NLoginCore_471)this.var_com_nickuc_login_NLoginCore_572_c.b(bl);
    }

    private static void void_b() {
        int n;
        var_long_c = 6655719618394647308L;
        long l = var_long_c ^ 0x7D952043CE9747A0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(47 + 22), (byte)(33 + 50), (byte)(16 + 31), (byte)(43 + 24), (byte)(34 + 32), (byte)(49 + 18), (byte)(41 + 6), (byte)(25 + 55), (byte)(67 + 8), 67, (byte)(6 + 77), (byte)(29 + 24), (byte)(5 + 75), (byte)(57 + 40), (byte)(24 + 76), (byte)(98 + 2), (byte)(93 + 12), (byte)(23 + 87), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_455.var_java_lang_String_arr_b[0] = NLoginCore_324.A("šůšĩĬũūņŤŔŮĽ", (byte)59, 65);
                    NLoginCore_455.var_java_lang_String_arr_b[1] = NLoginCore_138.F("Ջ՚ՠըՓյՕԶՂաըԿ", (byte)59, 70);
                    NLoginCore_455.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ŌřůŉņĳűŀŵİŲĽ", (byte)59, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_455.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ҕӘһӜҮӖҳӁӑӖӗҮ", (byte)59, 67);
                    NLoginCore_455.var_java_lang_String_arr_b[1] = NLoginCore_384.A("ŜŅŇůľūŏŧőůĪŲŰĭŅĶŲƀŭŚłƁňŉ", (byte)59, 65);
                    NLoginCore_455.var_java_lang_String_arr_b[2] = NLoginCore_451.F("գ՞թՑլՃՈդՉՕ՚Կ", (byte)59, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_455.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ҶҾӜӚӟҮӆӕӄӣҳөӡӃӝӠӞҧңұӰӢҹҺ", (byte)59, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_455.var_java_lang_String_arr_b[0] = NLoginCore_324.F("ՋԱճՄիմՕՒՓլՇԵսկՎՙՊԹ՟որ՝ՊՋ", (byte)59, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_455.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.D("ҋҭүҏҳӒӊӠӌқәӏӝӗҠӅӧӦӞӤӞҳ", (byte)58, 68), NLoginCore_455.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.C("ӆӓӒҕӕӑӌӕӠӏҜӚӞӗӚӠҢ࠱ࠪࠉ࠻࠭࠳ࠍ࠲࠲࠲ࠒ࠺࠹ࠪҼ", (byte)58, 67) + string + NLoginCore_324.B("ĭ", (byte)58, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public File java_io_File_c() {
        return this.var_com_nickuc_login_loader_platform_VelocityLoader_a.getDataDirectory();
    }

    @Override
    public String s() {
        return this.var_com_nickuc_login_loader_platform_VelocityLoader_a.getVersion();
    }

    public ProxyServer com_velocitypowered_api_proxy_ProxyServer_a() {
        return this.var_com_nickuc_login_loader_platform_VelocityLoader_a.getServer();
    }

    public VelocityLoader com_nickuc_login_loader_platform_VelocityLoader_a() {
        return this.var_com_nickuc_login_loader_platform_VelocityLoader_a;
    }

    @Override
    public NLoginInterface_020 com_nickuc_login_NLoginInterface_020_a() {
        return this.var_com_nickuc_login_NLoginInterface_020_c;
    }

    protected void O() {
        if (this.var_com_nickuc_login_NLoginCore_572_c.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_c.a()).O();
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = 0 >>> 163 | 0 << ~163 + 1;
        d = (Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << -63) & 0xFFFFFFFF;
        e = Integer.reverse(0);
        f = Integer.reverse(0);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (0x4000000 >>> 26 | 0x4000000 << ~26 + 1) & 0xFFFFFFFF;
        i = 0 >>> 181 | 0 << ~181 + 1;
        j = Long.reverse(3519352953317866042L);
        k = Long.reverse(-4467570830351532032L);
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Long.reverse(3519352953317866042L);
        n = Long.reverse(-4467570830351532032L);
        o = 4 >>> 225 | 4 << -225;
        p = Long.reverse(3519352953317866042L);
        q = Long.reverse(-4467570830351532032L);
        r = 0x600000 >>> 117 | 0x600000 << ~117 + 1;
        s = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[r];
        var_java_lang_String_arr_b = new String[s];
        NLoginCore_455.void_b();
    }

    @Override
    public String q() {
        return this.var_com_nickuc_login_NLoginCore_572_c.var_java_lang_String_bn;
    }

    @Override
    public NLoginCore_493 com_nickuc_login_NLoginInterface_026_a() {
        return this.var_com_nickuc_login_NLoginCore_516_a;
    }

    protected void T() {
        if (this.var_com_nickuc_login_NLoginCore_572_c.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_c.a()).T();
        }
    }

    @Override
    public NLoginCore_572 com_nickuc_login_NLoginCore_572_a() {
        return this.var_com_nickuc_login_NLoginCore_572_c;
    }

    @Override
    public /* synthetic */ NLoginInterface_047 com_nickuc_login_NLoginInterface_047_b() {
        return this.com_nickuc_login_NLoginCore_390_a();
    }

    public NLoginCore_455(VelocityLoader velocityLoader, String string, NLoginCore_422 NLoginCore_4222) {
        this.var_com_nickuc_login_loader_platform_VelocityLoader_a = velocityLoader;
        this.var_com_nickuc_login_NLoginCore_516_a = new NLoginCore_516(this);
        this.var_com_nickuc_login_NLoginCore_572_c = new NLoginCore_572(string, velocityLoader.getVersion(), NLoginCore_4222, this);
        this.var_com_nickuc_login_NLoginInterface_020_c = new NLoginCore_152(velocityLoader.getLogger());
    }

    private static String a(int n, long l) {
        l ^= 0x43L;
        l ^= 0x7D952043CE9747A0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(65 + 4), (byte)(77 + 6), (byte)(26 + 21), (byte)(34 + 33), (byte)(42 + 24), (byte)(4 + 63), (byte)(15 + 32), (byte)(18 + 62), (byte)(50 + 25), (byte)(16 + 51), (byte)(31 + 52), 53, (byte)(79 + 1), (byte)(53 + 44), (byte)(22 + 78), (byte)(80 + 20), (byte)(16 + 89), 110, (byte)(64 + 39)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.B("ĠĭĬïįīĦįĺĩöĴĸıĴĺüҋ҄ѣҕ҇ҍѧҌҌҌѬҔғ҄", (byte)31, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_455.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

