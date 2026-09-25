/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 *  lombok.Generated
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.NLoginCore_056;
import com.nickuc.login.NLoginCore_212;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_535;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_209;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_478;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_148;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_090;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_299;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginType_007;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class NLoginCore_558
implements NLoginCore_212 {
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static int m;
    private static int h;
    private static int x;
    private static long r;
    private static int var_int_b;
    private static long g;
    private static int v;
    private static long d;
    private static int w;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_b;
    private static int k;
    private static int l;
    private static int s;
    private static long t;
    private static int f;
    private static long j;
    private static long n;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int o;
    private static long p;
    private static long i;
    private static int u;
    private static long c;
    private static int q;

    private static void e() {
        int n;
        c = 227294843008864261L;
        long l = c ^ 0xBBC2A310295B16D6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(38 + 31), (byte)(59 + 24), (byte)(5 + 42), (byte)(22 + 45), (byte)(21 + 45), 67, (byte)(24 + 23), (byte)(20 + 60), (byte)(69 + 6), (byte)(36 + 31), (byte)(59 + 24), 53, (byte)(54 + 26), (byte)(86 + 11), (byte)(23 + 77), (byte)(81 + 19), (byte)(65 + 40), (byte)(22 + 88), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
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
                    NLoginCore_558.var_java_lang_String_arr_b[0] = NLoginCore_110.F("ՋԓԴԦԷԸԯՇ՜ԱԹԭՙԠՉՎԷ԰՗ՄԤ԰ԭԮ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[1] = NLoginCore_223.E("ԮՑՑԞՓԩԢԶԍԕՋԨ՚ԚԹ԰՛Ց՘ԮԱՖԭԮ", (byte)30, 69);
                    NLoginCore_558.var_java_lang_String_arr_b[2] = NLoginCore_384.F("ԟԼԲԫԴՀԙԦԤՔԪԻԾՎՠՌ՟ԝԴԜՃ԰ԭԮ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[3] = NLoginCore_324.A("ôýćĐòĤĢćĘĩĐĿĻāēĤİĲŅĖĂķĎď", (byte)30, 65);
                    NLoginCore_558.var_java_lang_String_arr_b[4] = NLoginCore_453.F("ԋԩԣՕ԰ԹՓՕՐՆՋԫՏԻԓԚՙՑԟՄՏզԭԮ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[5] = NLoginCore_092.C("ѸлѾтљѼѼїҀѣшѧ҃ҍѮѡяѪѣёҋқљґҍѠҕғҢґҙҥ", (byte)30, 67);
                    NLoginCore_558.var_java_lang_String_arr_b[6] = NLoginCore_091.B("āĬĈéĎĭĔąĮĥĞă", (byte)30, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_558.var_java_lang_String_arr_b[0] = NLoginCore_451.F("ՋԓԴԦԷԸԯՇ՜ԱԹԼԛՙՠԪաԾՒՐ՟՟՚ԼԡԹեՁեթԻձ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[1] = NLoginCore_427.D("ѣ҆҆ѓ҈ўїѫтъҀѰѭҎҌ҉ѹљҘѫјѵѢѣ", (byte)30, 68);
                    NLoginCore_558.var_java_lang_String_arr_b[2] = NLoginCore_201.F("ԟԼԲԫԴՀԙԦԤՔԬԫԷաԯ԰ԫԭԺ՚ՒՀԭԮ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[3] = NLoginCore_384.D("шёћѤцѸѶћѬѽѣќ҅ѨѷҌҒѫљѻѶҞҒёѼҁѪѹџҢ҆ѡ", (byte)30, 68);
                    NLoginCore_558.var_java_lang_String_arr_b[4] = NLoginCore_138.F("ԋԩԣՕ԰ԹՓՕՐՆՎՖԱՌԙՕՂԮԣՂՅՀԭԮ", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[5] = NLoginCore_091.F("ՃԆՉԍԤՇՇԢՋԮԓԲՎ՘ԹԬԚԵԮԜՖԧբԦ՞ՙգԺ՝զՏ՟", (byte)30, 70);
                    NLoginCore_558.var_java_lang_String_arr_b[6] = NLoginCore_027.D("ѩш҇ѺѩьѤҌџ҂ҏъѰҕьѢ҉җѣјҐқѢѣ", (byte)30, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_558.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ĕīąÿĥēăĦĄĜüĲĳŁĬüĭďĞĤúŇĎď", (byte)30, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_558.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԼՇՃՃԴՀԤԸԖ՜ՊՊԳՠԾԳ՛ԟԼ՞՝ԻՁԸԧՙբ՝եաՒՂ", (byte)30, 69);
                }
            }
        }
    }

    static {
        var_int_a = (0 >>> 136 | 0 << -136) & 0xFFFFFFFF;
        var_int_b = (0 >>> 55 | 0 << -55) & 0xFFFFFFFF;
        d = Long.reverse(8073347853545759936L);
        e = (524288 >>> 51 | 524288 << -51) & 0xFFFFFFFF;
        f = (-1 >>> 32 | -1 << ~32 + 1) & 0xFFFFFFFF;
        g = Long.reverse(8073347853545759936L);
        h = (0x100000 >>> 211 | 0x100000 << ~211 + 1) & 0xFFFFFFFF;
        i = Long.reverse(-6914631706343250752L);
        j = Long.reverse(-3458764513820540928L);
        k = 0 >>> 116 | 0 << -116;
        l = (384 >>> 135 | 384 << ~135 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(-1);
        n = Long.reverse(8073347853545759936L);
        o = (0x100000 >>> 82 | 0x100000 << -82) & 0xFFFFFFFF;
        p = Long.reverse(8073347853545759936L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(8073347853545759936L);
        s = Integer.reverse(0x60000000);
        t = Long.reverse(8073347853545759936L);
        u = (0 >>> 250 | 0 << ~250 + 1) & 0xFFFFFFFF;
        v = Integer.reverse(0);
        w = Integer.reverse(-536870912);
        x = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[w];
        var_java_lang_String_arr_b = new String[x];
        NLoginCore_558.e();
    }

    @Override
    public boolean boolean_a() {
        return NLoginCore_195.e(this.var_com_nickuc_login_bukkit_nLoginBukkit_b.com_nickuc_login_NLoginType_008_a());
    }

    @Override
    public NLoginInterface_030 com_nickuc_login_NLoginInterface_030_a() {
        return new NLoginCore_299(this.var_com_nickuc_login_bukkit_nLoginBukkit_b);
    }

    private void d() {
        PluginManager pluginManager = this.var_com_nickuc_login_bukkit_nLoginBukkit_b.org_bukkit_Server_a().getPluginManager();
        Plugin plugin = pluginManager.getPlugin((String)NLoginCore_558.f("㺀", (int)(l & m), (long)n));
        if (plugin != null) {
            pluginManager.disablePlugin(plugin);
            File file = new File(this.var_com_nickuc_login_bukkit_nLoginBukkit_b.java_io_File_c().getParentFile(), (String)NLoginCore_558.f("㺃", (int)o, (long)p));
            if (file.exists() && !file.delete()) {
                NLoginCore_370.d((String)NLoginCore_558.f("㺆", (int)q, (long)r) + file.getPath() + (String)NLoginCore_558.f("㺉", (int)s, (long)t), new Object[u]);
            }
        }
    }

    @Override
    public NLoginCore_447 com_nickuc_login_NLoginCore_447_a() {
        return new NLoginCore_447(this.var_com_nickuc_login_bukkit_nLoginBukkit_b);
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0xBBC2A310295B16D6L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(55 + 14), (byte)(78 + 5), (byte)(24 + 23), (byte)(34 + 33), (byte)(3 + 63), (byte)(30 + 37), (byte)(38 + 9), (byte)(21 + 59), (byte)(28 + 47), (byte)(45 + 22), (byte)(34 + 49), (byte)(42 + 11), (byte)(11 + 69), (byte)(7 + 90), 100, 100, (byte)(81 + 24), (byte)(35 + 75), (byte)(70 + 33)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.B("ĆēĒÕĕđČĕĠďÜĚĞėĚĠâѦѫѫѸѯќѹѶѿѮѺ", (byte)18, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_558.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public NLoginCore_056 com_nickuc_login_NLoginCore_056_a() {
        return new NLoginCore_209((NLoginType_008)this.var_com_nickuc_login_bukkit_nLoginBukkit_b.java_lang_Object_b(), this.var_com_nickuc_login_bukkit_nLoginBukkit_b, k != 0);
    }

    @Override
    public nLoginAPI com_nickuc_login_api_nLoginAPI_a() {
        return new NLoginType_007(this.var_com_nickuc_login_bukkit_nLoginBukkit_b.com_nickuc_login_NLoginType_008_a());
    }

    @Generated
    public NLoginCore_558(nLoginBukkit nLoginBukkit2) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_b = nLoginBukkit2;
    }

    private static Object f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_558.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("¿áãÃçĆþĔĀÏčăđċÔùěĚĒĘĒç", (byte)12, 65), NLoginCore_558.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.D("мщшЋычтыіхВѐєэѐіИޜޡޡޮޥޒޯެ޵ޤްЯ", (byte)12, 68) + string + NLoginCore_027.B("Ñ", (byte)12, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public void c() {
    }

    @Override
    public void b() {
        NLoginType_008 NLoginType_008 = this.var_com_nickuc_login_bukkit_nLoginBukkit_b.com_nickuc_login_NLoginType_008_a();
        this.var_com_nickuc_login_bukkit_nLoginBukkit_b.java_lang_Object_b().c().forEach(NLoginCore_277 -> NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.p, NLoginCore_277, new Object[v])));
        NLoginCore_478.a(this.var_com_nickuc_login_bukkit_nLoginBukkit_b, var_int_a != 0);
        NLoginCore_276 NLoginCore_2762 = NLoginType_008.com_nickuc_login_NLoginCore_276_a();
        NLoginCore_2762.r();
        NLoginCore_535.a(((NLoginCore_364)this.var_com_nickuc_login_bukkit_nLoginBukkit_b.java_lang_Object_b()).a(), NLoginCore_2762);
        LoginMainQueueTask.p(NLoginType_008);
        this.var_com_nickuc_login_bukkit_nLoginBukkit_b.java_lang_Object_b().c().forEach(NLoginCore_277 -> NLoginType_008.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().c((NLoginCore_277)NLoginCore_277, NLoginType_008.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginCore_277)));
        NLoginCore_400.b(NLoginType_008);
        NLoginCore_090.var_com_nickuc_login_NLoginCore_090_a.b(NLoginType_008);
        NLoginCore_148 NLoginCore_2032 = this.var_com_nickuc_login_bukkit_nLoginBukkit_b.a().com_nickuc_login_NLoginCore_203_a();
        NLoginCore_2032.a((String)NLoginCore_558.f("㺀", (int)var_int_b, (long)d), NLoginType_008.com_nickuc_login_NLoginCore_495_a().long_a());
        NLoginCore_2032.a((String)NLoginCore_558.f("㺃", (int)(e & f), (long)g), NLoginCore_150.aC());
        NLoginCore_2032.a((String)NLoginCore_558.f("㺆", (int)h, (long)(i ^ j)), BCryptHashProvider.com_nickuc_login_NLoginCore_036_b().name().toLowerCase(Locale.ENGLISH));
        this.d();
    }
}

