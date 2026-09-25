/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.config.ServerInfo
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.plugin.PluginDescription
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_513;
import com.nickuc.login.NLoginCore_095;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_003;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_345;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_217;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_040;
import com.nickuc.login.NLoginCore_159;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginDescription;

final class NLoginCore_178
implements NLoginCore_493 {
    private static int var_int_b;
    private static int q;
    private static int n;
    private static int z;
    private static int ac;
    private static String[] var_java_lang_String_arr_a;
    private static long s;
    private static int g;
    private static int r;
    private static int y;
    private static int j;
    private static long ab;
    private static long i;
    private static long w;
    private static int v;
    private static int k;
    private static long f;
    private static long t;
    private static String[] var_java_lang_String_arr_b;
    private static long h;
    private static long o;
    private static long l;
    private static long m;
    private static int d;
    private static int var_int_a;
    private static int ad;
    private static int x;
    private static int e;
    private static int aa;
    private static long var_long_c;
    private final NLoginCore_383 var_com_nickuc_login_NLoginCore_383_a;
    private static int var_int_c;
    private static int u;
    private static int p;

    private static String a(int n, long l) {
        l ^= 0x4EL;
        l ^= 0xBC18BF0D6D0CFE2AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(50 + 33), (byte)(7 + 40), (byte)(51 + 16), (byte)(36 + 30), (byte)(45 + 22), 47, (byte)(14 + 66), (byte)(12 + 63), (byte)(47 + 20), (byte)(5 + 78), (byte)(2 + 51), (byte)(50 + 30), (byte)(70 + 27), (byte)(55 + 45), (byte)(19 + 81), (byte)(63 + 42), (byte)(65 + 45), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(28 + 41), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöґѼўҐѯѨҗҐѣҎ", (byte)28, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_178.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_a() {
        return new NLoginCore_217(this.var_com_nickuc_login_NLoginCore_383_a);
    }

    @Override
    public NLoginCore_364 com_nickuc_login_NLoginCore_364_a() {
        ProxyServer proxyServer = this.var_com_nickuc_login_NLoginCore_383_a.net_md_5_bungee_api_ProxyServer_a();
        return new NLoginCore_364(proxyServer.getName(), proxyServer.getVersion(), proxyServer.getVersion(), NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c, var_int_c != 0);
    }

    @Override
    public void j() {
        this.var_com_nickuc_login_NLoginCore_383_a.j();
    }

    @Override
    public NLoginCore_589 a(boolean bl) {
        return new NLoginCore_095((Plugin)this.var_com_nickuc_login_NLoginCore_383_a.com_nickuc_login_loader_platform_BungeeLoader_a());
    }

    private static void void_b() {
        int n;
        var_long_c = -5387934710969076702L;
        long l = var_long_c ^ 0xBC18BF0D6D0CFE2AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(47 + 36), (byte)(18 + 29), (byte)(52 + 15), (byte)(58 + 8), (byte)(58 + 9), (byte)(46 + 1), (byte)(42 + 38), 75, (byte)(8 + 59), (byte)(39 + 44), (byte)(36 + 17), (byte)(79 + 1), (byte)(10 + 87), (byte)(9 + 91), (byte)(8 + 92), (byte)(59 + 46), (byte)(22 + 88), (byte)(50 + 53)}, StandardCharsets.UTF_8));
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
                    NLoginCore_178.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ѼҌҏѤѐѴѠҍѣѭђїњѯҕҕқѶѽѫѷҡѨѩ", (byte)32, 68);
                    NLoginCore_178.var_java_lang_String_arr_b[1] = NLoginCore_387.D("ҌҁѪѠҋхѢ҉҇щ҂ѝ", (byte)32, 68);
                    NLoginCore_178.var_java_lang_String_arr_b[2] = NLoginCore_324.D("ѣҐцҀѣ҇ѼғѠѴјёіҚѱҙѲѽҐѳҕѡ҃Ѥҏҗ҈Ѥ҆ѽѶҡҨҎҋұѾҰҡҤ҅ѭ҂ҋѳҤҏҸҦҶҩґҸһѶңңҡҝұ҅ҿӉӂҹҧӏҼӇҨҨӋӏҡҡҔӄҷҷҴӛҳҗҜӟҫҨҩ", (byte)32, 68);
                    NLoginCore_178.var_java_lang_String_arr_b[3] = NLoginCore_138.C("ѨхяѢѿҔѼ҃ҐҀѓѝ", (byte)32, 67);
                    NLoginCore_178.var_java_lang_String_arr_b[4] = NLoginCore_004.E("ԐԌՎԨԱ՛՚ՐՋՓՉԤ", (byte)32, 69);
                    NLoginCore_178.var_java_lang_String_arr_b[5] = NLoginCore_446.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĪĲĮřşŕŚńūŧŬŅşŃĪŋĻİŕŭŐŉĶŧŏŤŊśĻűĺŵųőšŒŔŕņŃƄƈƃŇžŻƃŧƆůŌŏŌƑ", (byte)32, 66);
                    NLoginCore_178.var_java_lang_String_arr_b[6] = NLoginCore_384.F("ԶՀ՗ԖԢԚՒԫԶՏՉԤ", (byte)32, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_178.var_java_lang_String_arr_b[0] = NLoginCore_427.F("ՃՓՖԫԗԻԧՔԪԴԘԼ՟ԲԼՂ԰ԺԼԡԟՂԯ԰", (byte)32, 70);
                    NLoginCore_178.var_java_lang_String_arr_b[1] = NLoginCore_138.C("іҐѢяѮѤҔѽҌ҅ѓѝ", (byte)32, 67);
                    NLoginCore_178.var_java_lang_String_arr_b[2] = NLoginCore_223.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĬĵĝŎĹŢŐŠœĻŢťĠōōŋŇśįũųŬţőŹŦűŒŒŵŹŋŊōńƄƃŠŚźźŪŌŕŒœ", (byte)32, 66);
                    NLoginCore_178.var_java_lang_String_arr_b[3] = NLoginCore_559.D("ѼсњћҊ҂ѧѢѧѯҖѝ", (byte)32, 68);
                    NLoginCore_178.var_java_lang_String_arr_b[4] = NLoginCore_453.C("ф҈ѥѣ҈ѡѪўўюҋҋҋҘѤѰ҉ҎҋѠҗѻѨѩ", (byte)32, 67);
                    NLoginCore_178.var_java_lang_String_arr_b[5] = NLoginCore_559.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĪĲĮřşŕŚńūŧŬŅşŃĪŋĻİŕŭŐŉĶŧŏŤŊśĻűĺŵųőšŒŔŕņŃƄƈƃƋŧŦŻŰŧƁƋƆŧŪūťƘƗƈřŭŮƉƔƔŧ", (byte)32, 66);
                    NLoginCore_178.var_java_lang_String_arr_b[6] = NLoginCore_427.C("҅њшъўѮѝѥѩҍҊѝ", (byte)32, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_178.var_java_lang_String_arr_b[0] = NLoginCore_138.D("҈ѨѮѼяэѮҍѫҌѳ҂ѱѣю҇ѵѭѵҍҞѰѶҢѼҒ҈ѡѶ҇ңѿ", (byte)32, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_178.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԬՎԦԊՋԬԧԺ՝ԔԬԘԴԔԙԽ՝԰ԟԺաԣըԫՌԶՅԫՉ԰Ճե", (byte)32, 70);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = (2048 >>> 139 | 2048 << ~139 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = (0 >>> 84 | 0 << ~84 + 1) & 0xFFFFFFFF;
        e = -1 >>> 223 | -1 << ~223 + 1;
        f = Long.reverse(3904354669348805805L);
        g = 1 >>> 192 | 1 << -192;
        h = Long.reverse(4913160985879796909L);
        i = Long.reverse(0x7200000000000000L);
        j = Integer.reverse(0);
        k = Integer.reverse(0x40000000);
        l = Long.reverse(4913160985879796909L);
        m = Long.reverse(0x7200000000000000L);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(3904354669348805805L);
        p = Integer.reverse(0);
        q = (0x40000000 >>> 190 | 0x40000000 << ~190 + 1) & 0xFFFFFFFF;
        r = 0x800000 >>> 21 | 0x800000 << ~21 + 1;
        s = Long.reverse(4913160985879796909L);
        t = Long.reverse(0x7200000000000000L);
        u = 0x28000000 >>> 187 | 0x28000000 << ~187 + 1;
        v = (-1 >>> 206 | -1 << -206) & 0xFFFFFFFF;
        w = Long.reverse(3904354669348805805L);
        x = 0 >>> 158 | 0 << ~158 + 1;
        y = Integer.reverse(Integer.MIN_VALUE);
        z = (3 >>> 31 | 3 << -31) & 0xFFFFFFFF;
        aa = Integer.reverse(-1);
        ab = Long.reverse(3904354669348805805L);
        ac = (0xE00000 >>> 213 | 0xE00000 << -213) & 0xFFFFFFFF;
        ad = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ac];
        var_java_lang_String_arr_b = new String[ad];
        NLoginCore_178.void_b();
    }

    @Override
    public void O() {
        this.var_com_nickuc_login_NLoginCore_383_a.O();
    }

    @Override
    public void V() {
        try {
            Map<String, ServerInfo> map = this.var_com_nickuc_login_NLoginCore_383_a.a();
            if (map != null && !map.isEmpty()) {
                List list = map.entrySet().stream().map(entry -> (String)entry.getKey() + (String)NLoginCore_178.c("㺀", (int)(z & aa), (long)ab) + ((ServerInfo)entry.getValue()).getSocketAddress()).collect(Collectors.toList());
                this.var_com_nickuc_login_NLoginCore_383_a.var_com_nickuc_login_NLoginCore_572_b.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_203_a().a((String)NLoginCore_178.c("㺀", (int)(d & e), (long)f), String.join((CharSequence)NLoginCore_178.c("㺃", (int)g, (long)(h ^ i)), list));
            }
        }
        catch (NoSuchMethodError noSuchMethodError) {
            // empty catch block
        }
    }

    @Override
    public NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a() {
        return this.var_com_nickuc_login_NLoginCore_383_a.com_nickuc_login_NLoginInterface_034_arr_a();
    }

    @Override
    public void T() {
        this.var_com_nickuc_login_NLoginCore_383_a.T();
    }

    @Override
    public NLoginInterface_040 com_nickuc_login_NLoginInterface_040_a() {
        ProxyServer proxyServer = this.var_com_nickuc_login_NLoginCore_383_a.net_md_5_bungee_api_ProxyServer_a();
        return new NLoginCore_159(this.var_com_nickuc_login_NLoginCore_383_a, proxyServer, NLoginCore_513.a(proxyServer, proxyServer.getConsole()));
    }

    @Override
    public NLoginInterface_047 com_nickuc_login_NLoginInterface_047_a() {
        return new NLoginCore_345(this.var_com_nickuc_login_NLoginCore_383_a);
    }

    @Generated
    public NLoginCore_178(NLoginCore_383 NLoginCore_3832) {
        this.var_com_nickuc_login_NLoginCore_383_a = NLoginCore_3832;
    }

    @Override
    public boolean e(String string) {
        int n = j;
        PluginDescription pluginDescription = this.var_com_nickuc_login_NLoginCore_383_a.com_nickuc_login_loader_platform_BungeeLoader_a().getDescription();
        if (!pluginDescription.getName().equals(string)) {
            NLoginCore_370.d((String)NLoginCore_178.c("㺀", (int)k, (long)(l ^ m)) + pluginDescription.getName() + (String)NLoginCore_178.c("㺃", (int)NLoginCore_178.n, (long)o), new Object[p]);
            n = q;
        }
        if (!pluginDescription.getAuthor().equals(NLoginCore_178.c("㺆", (int)r, (long)(s ^ t)))) {
            NLoginCore_370.d((String)NLoginCore_178.c("㺉", (int)(u & v), (long)w), new Object[x]);
            n = y;
        }
        return n != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_178.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.C("ӖӸӺӚӾԝԕԫԗӦԤԚԨԢӫԐԲԱԩԯԩӾ", (byte)83, 67), NLoginCore_178.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.A("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӿӪӌӾӝӖԅӾӑӼź", (byte)83, 65) + string + NLoginCore_384.F("Չ", (byte)83, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_b() {
        return new NLoginCore_003(this.var_com_nickuc_login_NLoginCore_383_a, this.var_com_nickuc_login_NLoginCore_383_a.net_md_5_bungee_api_ProxyServer_a());
    }

    @Override
    public void U() {
        NLoginCore_370.a(this.var_com_nickuc_login_NLoginCore_383_a, var_int_a != 0, var_int_b != 0);
    }

    @Override
    public void i() {
        this.var_com_nickuc_login_NLoginCore_383_a.i();
    }
}

