/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.guava.common.collect.Multimap
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.lib.guava.common.collect.Multimap;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Handler;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class NLoginCore_074 {
    private static int r;
    private static int z;
    private static int n;
    private static long t;
    private static long y;
    private static long l;
    private static int ag;
    private static int ae;
    private static int ak;
    private static int aa;
    private static int w;
    private static long i;
    private static String[] var_java_lang_String_arr_a;
    private static int g;
    private static int o;
    private static long d;
    private static int k;
    private static int am;
    private static int ad;
    private static int var_int_a;
    private static int j;
    private static long q;
    private static long aj;
    private static int s;
    private static long ai;
    private static String[] var_java_lang_String_arr_b;
    private static long h;
    private static int al;
    private static long u;
    private static long p;
    private static long f;
    private static long m;
    private static long ac;
    private static int x;
    private static int ab;
    private static int var_int_b;
    private static int v;
    private static long c;
    private static int e;
    private static int ah;
    private static long af;

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        d = Long.reverse(7512781183130649889L);
        e = (0 >>> 2 | 0 << -2) & 0xFFFFFFFF;
        f = Long.reverse(0xBE0000000000000L);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(1459943283944703265L);
        i = Long.reverse(0x7C00000000000000L);
        j = Integer.reverse(0);
        k = (4 >>> 225 | 4 << -225) & 0xFFFFFFFF;
        l = Long.reverse(1459943283944703265L);
        m = Long.reverse(0x7C00000000000000L);
        n = 4096 >>> 44 | 4096 << -44;
        o = 0xC000000 >>> 186 | 0xC000000 << ~186 + 1;
        p = Long.reverse(1459943283944703265L);
        q = Long.reverse(0x7C00000000000000L);
        r = 0 >>> 129 | 0 << ~129 + 1;
        s = (64 >>> 228 | 64 << ~228 + 1) & 0xFFFFFFFF;
        t = Long.reverse(1459943283944703265L);
        u = Long.reverse(0x7C00000000000000L);
        v = 0x2000000 >>> 25 | 0x2000000 << -25;
        w = (80 >>> 4 | 80 << -4) & 0xFFFFFFFF;
        x = Integer.reverse(-1);
        y = Long.reverse(7512781183130649889L);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0x60000000);
        ab = (-1 >>> 174 | -1 << ~174 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(7512781183130649889L);
        ad = (1 >>> 64 | 1 << ~64 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(-536870912);
        af = Long.reverse(7512781183130649889L);
        ag = Integer.reverse(0);
        ah = 2 >>> 222 | 2 << -222;
        ai = Long.reverse(1459943283944703265L);
        aj = Long.reverse(0x7C00000000000000L);
        ak = 0 >>> 228 | 0 << ~228 + 1;
        al = Integer.reverse(-1879048192);
        am = Integer.reverse(-1879048192);
        var_java_lang_String_arr_a = new String[al];
        var_java_lang_String_arr_b = new String[am];
        NLoginCore_074.b();
    }

    private static String a(int n, long l) {
        l ^= 0x3EL;
        l ^= 0x87B92AAE3BFB0257L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(49 + 20), 83, (byte)(18 + 29), (byte)(20 + 47), (byte)(29 + 37), (byte)(50 + 17), (byte)(14 + 33), (byte)(20 + 60), (byte)(3 + 72), (byte)(16 + 51), (byte)(58 + 25), (byte)(18 + 35), 80, (byte)(83 + 14), (byte)(59 + 41), (byte)(46 + 54), (byte)(17 + 88), (byte)(82 + 28), (byte)(18 + 85)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.A("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸҞӊҬҠӉӗӃӃӔӒҺ", (byte)61, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_074.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_074.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("ďıĳēķŖŎŤŐğŝœšśĤŉūŪŢŨŢķ", (byte)52, 66), NLoginCore_074.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҌҸҚҎҷӅұұӂӀҨĽ", (byte)52, 65) + string + NLoginCore_201.C("ҋ", (byte)52, 67) + methodType.toString(), exception);
        }
    }

    public static void a(Plugin plugin) {
        Map.Entry entry;
        Object object;
        PluginManager pluginManager = ProxyServer.getInstance().getPluginManager();
        ClassLoader classLoader = plugin.getClass().getClassLoader();
        try {
            plugin.onDisable();
            object = plugin.getLogger().getHandlers();
            int n = ((Handler[])object).length;
            for (int i = var_int_a; i < n; ++i) {
                entry = object[i];
                ((Handler)((Object)entry)).close();
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_074.c("㺀", (int)var_int_b, (long)d) + plugin.getDescription().getName(), throwable, new Object[e]);
        }
        pluginManager.unregisterListeners(plugin);
        pluginManager.unregisterCommands(plugin);
        ProxyServer.getInstance().getScheduler().cancel(plugin);
        plugin.getExecutorService().shutdownNow();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (thread.getClass().getClassLoader() != classLoader) continue;
            try {
                thread.interrupt();
                thread.join(f);
                if (!thread.isAlive()) continue;
                thread.interrupt();
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)NLoginCore_074.c("㺃", (int)g, (long)(h ^ i)) + plugin.getDescription().getName(), throwable, new Object[j]);
            }
        }
        try {
            object = PluginManager.class.getDeclaredField((String)NLoginCore_074.c("㺆", (int)k, (long)(l ^ m)));
            ((Field)object).setAccessible(n != 0);
            Map map = (Map)((Field)object).get(pluginManager);
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                entry = iterator.next();
                if (((Command)entry.getValue()).getClass().getClassLoader() != classLoader) continue;
                iterator.remove();
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_074.c("㺉", (int)o, (long)(p ^ q)) + plugin.getDescription().getName(), throwable, new Object[r]);
        }
        try {
            object = PluginManager.class.getDeclaredField((String)NLoginCore_074.c("㺌", (int)s, (long)(t ^ u)));
            ((Field)object).setAccessible(v != 0);
            Map map = (Map)((Field)object).get(pluginManager);
            map.values().remove(plugin);
            Field field = PluginManager.class.getDeclaredField((String)NLoginCore_074.c("㺏", (int)(w & x), (long)y));
            field.setAccessible(z != 0);
            entry = (Multimap)field.get(pluginManager);
            entry.removeAll(plugin);
            Field field2 = PluginManager.class.getDeclaredField((String)NLoginCore_074.c("㺒", (int)(aa & ab), (long)ac));
            field2.setAccessible(ad != 0);
            Multimap multimap = (Multimap)field2.get(pluginManager);
            multimap.removeAll((Object)plugin);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_074.c("㺕", (int)ae, (long)af) + plugin.getDescription().getName(), throwable, new Object[ag]);
        }
        if (classLoader instanceof URLClassLoader) {
            try {
                ((URLClassLoader)classLoader).close();
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)NLoginCore_074.c("㺘", (int)ah, (long)(ai ^ aj)) + plugin.getDescription().getName(), throwable, new Object[ak]);
            }
        }
    }

    private static void b() {
        int n;
        c = -8889052338912542168L;
        long l = c ^ 0x87B92AAE3BFB0257L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(14 + 55), (byte)(66 + 17), (byte)(5 + 42), (byte)(39 + 28), (byte)(27 + 39), (byte)(9 + 58), (byte)(43 + 4), (byte)(74 + 6), (byte)(18 + 57), 67, (byte)(12 + 71), 53, (byte)(5 + 75), (byte)(56 + 41), (byte)(23 + 77), (byte)(41 + 59), (byte)(45 + 60), (byte)(8 + 102), (byte)(39 + 64)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
                    NLoginCore_074.var_java_lang_String_arr_b[0] = NLoginCore_091.E("Քֈսն֊Կբ՜աձ֌ցՋէֆՕ֏ցդֈՎֆէ֌։սր֟֝֞֏֓֝֡֫ջ֬պջ֤֑ֆ֠շ", (byte)83, 69);
                    NLoginCore_074.var_java_lang_String_arr_b[1] = NLoginCore_575.D("ԢӻԊӾԦԉԣԀӥԠԙԐԧԌӭԡԅԙԋԸԱԱӵԩԽԯԔԯԁԕԿԑԨԧԓԦԆԡՃՃԆԏՉԻՃՎԏԥԯԡՇՎԑԹԼԿ՞ԠԓՏԲՄՍՂ", (byte)83, 68);
                    NLoginCore_074.var_java_lang_String_arr_b[2] = NLoginCore_575.C("ԨӡӼԥԉӸԠӷӻӭӼӯӻԞԊԁ԰ԣԆԛԮԺԁԂ", (byte)83, 67);
                    NLoginCore_074.var_java_lang_String_arr_b[3] = NLoginCore_387.F("փ՜ի՟ևժքաՆցճսՏհևծշՓ֊ճօ֔֓ճշՙ՝֏ւ֛֘֗ո֙ե֗ի֬ք֚տս֜շ", (byte)83, 70);
                    NLoginCore_074.var_java_lang_String_arr_b[4] = NLoginCore_384.C("ԆԣөӡԃԁԂӬԀԅԧӶ", (byte)83, 67);
                    NLoginCore_074.var_java_lang_String_arr_b[5] = NLoginCore_076.A("ƛŜūƝƟƚƙűƤŦŽƠƣƝƚƍƩƣƩŨưƠƄſƉƢƍƃųƛƌƮ", (byte)83, 65);
                    NLoginCore_074.var_java_lang_String_arr_b[6] = NLoginCore_446.E("չևժւթ֊֋հ֋օթլփՒվֆշ֘մՒ֜Տՙ՛֚֎֜֓ցպշն", (byte)83, 69);
                    NLoginCore_074.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ԢӻԊӾԦԉԣԀӥԠԒԜӮԏԦԍԖӲԩԒԤԱԱԸԸԹԝԛӼӻԕԆԳԓԲԢՉԖӿԀՄՉ԰ՅԭԬՄԑՁՅԏՃԫԕԔԴԭԭԚԯԣԺՂԤզ՞Է՞ԶԾՇԮՇՊ԰ԽԽ՝ծՅԲ԰ՇՅՐժՁՂ", (byte)83, 67);
                    NLoginCore_074.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ƙŲƁŵƝƀƚŷŜƗƈţźƞŵƞƄƭŰƢưƍƇžůƬƇƺƶƶƑƦƉƸƘƚơǃƷƢƘǃǆƦǁƤƴǇǊƟǁƽƢƞƤƩƓǉǈƴƭǈǖƬ", (byte)83, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_074.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ŪƞƓƌƠŕŸŲŷƇƢƗšŽƜūƥƗźƞŤƜŽƢƟƓƖƵƳƴƥƩƖƐƐƱƓǃƑƭƔǇƾƍ", (byte)83, 65);
                    NLoginCore_074.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ƙŲƁŵƝƀƚŷŜƗƐƇƞƃŤƘżƐƂƯƨƨŬƠƴƦƋƦŸƌƶƈƟƞƊƝŽƘƺƺŽƆǀƲƺǅƆƜƦƘƾǅƈǀǐǃǂƶƢǙǗƩǉƏ", (byte)83, 66);
                    NLoginCore_074.var_java_lang_String_arr_b[2] = NLoginCore_324.F("։Ղ՝ֆժՙց՘՜Վ՛լ՜՞փ֌ոՙօ֏մյբգ", (byte)83, 70);
                    NLoginCore_074.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ƙŲƁŵƝƀƚŷŜƗƉƓťƆƝƄƍũƠƉƛƪƩƉƍůųƥƘƱƮƭƲƯƕƘƱƶƖƳƾƛǂƤǅƗƽǂƝƭƱǑƩǁƘƙ", (byte)83, 66);
                    NLoginCore_074.var_java_lang_String_arr_b[4] = NLoginCore_387.C("ӲԧԦӺԬԫԄӥԜԍԂԋԪԜԝԁԃԔԤӰԚԺԁԂ", (byte)83, 67);
                    NLoginCore_074.var_java_lang_String_arr_b[5] = NLoginCore_110.E("օՆՕև։քփ՛֎Րէ֊֍ևքշ֓֍֓Ւ֚ո՛ծ֋՟֡֗ց֑ան", (byte)83, 69);
                    NLoginCore_074.var_java_lang_String_arr_b[6] = NLoginCore_027.C("ԘԦԉԡԈԩԪԏԪԤԈԋԢӱԝԥԖԷԓӱԻӸӹԹԗԨԲԎԶԿԄԦ", (byte)83, 67);
                    NLoginCore_074.var_java_lang_String_arr_b[7] = NLoginCore_201.E("փ՜ի՟ևժքաՆցճսՏհևծշՓ֊ճօ֚֒֒֙֙վռ՝՜նէ֔մ֓փ֪շՠա֥֪֑֦֎֍֥ղ֢֦հ֤֌նյ֕֎֎ջ֐ք֛֣օׇֿֿ֘֗֟֨֏֨֫ք׋֧֌ֶ֦׌׈׈יֲכ֢֣", (byte)83, 69);
                    NLoginCore_074.var_java_lang_String_arr_b[8] = NLoginCore_138.C("ԢӻԊӾԦԉԣԀӥԠԑӬԃԧӾԧԍԶӹԫԹԖԐԇӸԵԐՃԿԿԚԯԒՁԡԣԪՌՀԫԡՌՏԯՊԭԽՐՓԨՊՆԫԫՍ՗ԟԼ԰Ԕ՗՘՟բ", (byte)83, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_074.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ԆԦԦӥԇԬԜӭӷӧӺԑԠԔԦӭԆӰӲԫԸԔԁԂ", (byte)83, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_074.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ӴӳԁԝԇөԮԎӼԢԝԉԅԴԁӳӱӮԪԐӭԪԁԂ", (byte)83, 68);
                }
            }
        }
    }
}

