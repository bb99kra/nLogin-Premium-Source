/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.snakeyaml.LoaderOptions
 *  com.nickuc.login.lib.snakeyaml.Yaml
 *  com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor
 *  com.nickuc.login.lib.snakeyaml.constructor.Constructor
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_059 {
    private static int ak;
    private static long ai;
    private static int r;
    private static int var_int_a;
    private static int o;
    private static int as;
    private static int z;
    private static long ae;
    private static int h;
    private static long an;
    private static int x;
    private static int p;
    private static int au;
    private static long ab;
    private static int ao;
    private static int ad;
    private static long j;
    private static final Yaml var_com_nickuc_login_lib_snakeyaml_Yaml_a;
    private static long w;
    private static long aq;
    private static int ap;
    private static long y;
    private static int af;
    private static int var_int_c;
    private static long aa;
    private static int i;
    private static int v;
    private static int f;
    private static int var_int_b;
    private static long var_long_c;
    private static int n;
    private static long m;
    private static int aj;
    private static int k;
    private static long ar;
    private static long ah;
    private static final long s = 2592000000L;
    private static long q;
    private static int ag;
    private static int am;
    private static int l;
    private static int ac;
    private static int u;
    private static String[] var_java_lang_String_arr_b;
    private static int at;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int d;
    private static long al;
    private static long t;

    private static void b() {
        int n;
        var_long_c = -3528502785877001670L;
        long l = var_long_c ^ 0xA86D988B6B69FCB7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(53 + 16), (byte)(17 + 66), (byte)(35 + 12), (byte)(55 + 12), (byte)(65 + 1), (byte)(25 + 42), (byte)(44 + 3), (byte)(76 + 4), (byte)(68 + 7), (byte)(18 + 49), (byte)(17 + 66), (byte)(49 + 4), (byte)(67 + 13), 97, (byte)(91 + 9), 100, (byte)(4 + 101), (byte)(23 + 87), (byte)(68 + 35)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(81 + 2)}, StandardCharsets.UTF_8));
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
                    NLoginCore_059.var_java_lang_String_arr_b[0] = NLoginCore_027.F("԰ՋՊ՘Թ՛ՇՋԹ԰՚Տ՜Պԕՠ՛ԘԦԶաէ՗ԢԺիէՙԩՁԫբ", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[1] = NLoginCore_446.E("ՈՈԔԑԢԦՐԩԦԵԿԤ", (byte)32, 69);
                    NLoginCore_059.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ԲԷԭԩԧԱԑԓԦԞԕԒբՂԚԾՑԶՃե՞՘ԯ԰", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[3] = NLoginCore_076.B("ġĵĎĩįûħĊĉğĲļĮĿįňěĦńėĭŋĒē", (byte)32, 66);
                    NLoginCore_059.var_java_lang_String_arr_b[4] = NLoginCore_387.F("԰ՃԧՋՅԩՄՄԓԦԿԤ", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[5] = NLoginCore_201.D("ўѽцѯѳћђѣѵѢ҂ѝ", (byte)32, 68);
                    NLoginCore_059.var_java_lang_String_arr_b[6] = NLoginCore_027.F("ՒԴ՘ԭԷՎ՘ԤԝԸԞԷ՚ԞԬ԰ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆշ՚Մֆժժ։ֆգ՞աը֍խ՗֎֖֗յ՚ըհխ֕՘շ֛֖֘֞֩՟վ֧ռտնել֤կխֆ֣֯փ։֑յְ֚շնֹչֳ֯֠׃֐ׁ֖ׅփ֢֏֐", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[7] = NLoginCore_004.B("ĹòĦĎĵėýĳĠċĴć", (byte)32, 66);
                    NLoginCore_059.var_java_lang_String_arr_b[8] = NLoginCore_451.E("ՒԴ՘ԭԷՎ՘ԤԝԸԞԷ՚ԞԬ԰ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆըի֋ք֍չ֋Վջց֎", (byte)32, 69);
                    NLoginCore_059.var_java_lang_String_arr_b[9] = NLoginCore_559.E("ՂԳԭԣՄԘԮԭՎՎԶՐԘԱԯԝ՛՜ՆԢ՟իթդՙՇՍԹՌՃ՟Ո", (byte)32, 69);
                    NLoginCore_059.var_java_lang_String_arr_b[10] = NLoginCore_201.F("ՖԏՃԫՒԴԚՐԽԨՑԤ", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[11] = NLoginCore_004.C("ҋѭґѦѰ҇ґѝіѱїѰғїѥѩѭ҈ѻѝҟѼѮҥѰѵѺ҈ќѪҞҊҖүҟҧҥҞҭѮҶҟҫ҈Ѵҗ҄ҪҨѷҪѽѿңҰҏҦӁҖҢҵӋҹҾ", (byte)32, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_059.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ēĮĭĻĜľĪĮĜēĽĲĿĭøŃľûĉęńĿŋĨĿęŏőĢĐĶčĊĦŔŃĵŒřļŒĠĪħ", (byte)32, 66);
                    NLoginCore_059.var_java_lang_String_arr_b[1] = NLoginCore_138.C("ѠѨьҏғщўҍѩѥѬѝ", (byte)32, 67);
                    NLoginCore_059.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ԲԷԭԩԧԱԑԓԦԞԟՏԭ՜ԴՂՅԱՒՇԹՂԯ԰", (byte)32, 69);
                    NLoginCore_059.var_java_lang_String_arr_b[3] = NLoginCore_446.A("ġĵĎĩįûħĊĉğĲĴĿĥĚĺŃĢŅħĤĕĒē", (byte)32, 65);
                    NLoginCore_059.var_java_lang_String_arr_b[4] = NLoginCore_453.A("ĵĔăĵĖěýČķĻİńŀāğģĵĨėĦĭĥĒē", (byte)32, 65);
                    NLoginCore_059.var_java_lang_String_arr_b[5] = NLoginCore_387.D("ћѡў҄ґ҃ѱѣѦҗҒѝ", (byte)32, 68);
                    NLoginCore_059.var_java_lang_String_arr_b[6] = NLoginCore_201.F("ՒԴ՘ԭԷՎ՘ԤԝԸԞԷ՚ԞԬ԰ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆշ՚Մֆժժ։ֆգ՞աը֍խ՗֎֖֗յ՚ըհխ֕՘շ֛֖֘֞֩՟վ֧ռտնել֤կխֆ֣֯փ։֑յְ֚շնְֻ֋ցսׅ֠֓փַָ֘֏֐", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[7] = NLoginCore_027.B("ĂëĒėĄĪĦĘēĝāć", (byte)32, 66);
                    NLoginCore_059.var_java_lang_String_arr_b[8] = NLoginCore_201.F("ՒԴ՘ԭԷՎ՘ԤԝԸԞԷ՚ԞԬ԰ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆզմ։Պգ՞՝֌ձև՟", (byte)32, 70);
                    NLoginCore_059.var_java_lang_String_arr_b[9] = NLoginCore_451.A("ĥĖĐĆħûđĐııęĳûĔĒĀľĿĩąłĆĹħőŏĺĴĢĢĤŖĭŏĵŅŕśĩĝěŁŌħ", (byte)32, 65);
                    NLoginCore_059.var_java_lang_String_arr_b[10] = NLoginCore_110.E("ԯԯԠԹՏՌԣԥՕՕԯԤ", (byte)32, 69);
                    NLoginCore_059.var_java_lang_String_arr_b[11] = NLoginCore_453.D("ҋѭґѦѰ҇ґѝіѱїѰғїѥѩѭ҈ѻѝҟѼѮҥѰѵѺ҈ќѪҞҊҖүҟҧҥҞҭѮҶҟҫ҈Ѵҗ҄ҪҨѷҪѽѿҜҬѿҲҴҙ҇ҜӌҤӅ", (byte)32, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_059.var_java_lang_String_arr_b[0] = NLoginCore_575.D("юѣѾҎѳҁѨҁҎҁѯыѭҍҙѼҏѽҍ҂҃ҡѨѩ", (byte)32, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_059.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ѽыќѬьѬѓѤџҏҖѝ", (byte)32, 67);
                }
            }
        }
    }

    private static void a(NLoginCore_116<?> NLoginInterface_0112, File file) {
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return;
        }
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        for (int i = f; i < n; ++i) {
            File file2 = fileArray2[i];
            NLoginCore_059.b(NLoginInterface_0112, file2);
        }
    }

    public static void b(NLoginCore_116<?> NLoginInterface_0112, File file) {
        if (file.isDirectory()) {
            NLoginCore_059.a(NLoginInterface_0112, file);
            return;
        }
        if (!NLoginCore_366.a(file, g)) {
            return;
        }
        if (NLoginCore_525.as()) {
            NLoginCore_370.b((String)NLoginCore_059.c("㺀", (int)(h & i), (long)j) + file + (String)NLoginCore_059.c("㺃", (int)(k & l), (long)m), new Object[n]);
        }
        if (!file.delete()) {
            file.deleteOnExit();
        }
    }

    public static void c(NLoginCore_116<?> NLoginInterface_0112, File file) {
        NLoginCore_419 NLoginCore_4192 = NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b().a();
        Object object = NLoginCore_4192 == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c ? NLoginCore_059.c("㺀", (int)(o & p), (long)q) : NLoginCore_059.c("㺃", (int)r, (long)t);
        String string = NLoginInterface_0112.com_nickuc_login_NLoginCore_224_a().f().getName();
        try {
            File[] fileArray = file.listFiles();
            if (fileArray == null) {
                return;
            }
            File[] fileArray2 = fileArray;
            int n = fileArray2.length;
            for (int i = u; i < n; ++i) {
                String string2;
                File file2 = fileArray2[i];
                if (file2.isDirectory() || string.equals(string2 = file2.getName()) || !string2.endsWith((String)NLoginCore_059.c("㺆", (int)v, (long)w))) continue;
                try {
                    Map<String, Object> map = NLoginCore_059.a(file2, (String)object);
                    if (map == null) continue;
                    String string3 = (String)map.get(NLoginCore_059.c("㺉", (int)x, (long)y));
                    if (!NLoginInterface_0112.q().equals(string3) || file2.delete()) continue;
                    if (NLoginCore_525.as()) {
                        NLoginCore_370.d((String)NLoginCore_059.c("㺌", (int)z, (long)(aa ^ ab)) + string2 + (String)NLoginCore_059.c("㺏", (int)(ac & ad), (long)ae), new Object[af]);
                    }
                    file2.deleteOnExit();
                    continue;
                }
                catch (Throwable throwable) {
                    if (!NLoginCore_525.as()) continue;
                    NLoginCore_370.c((String)NLoginCore_059.c("㺒", (int)ag, (long)(ah ^ ai)) + throwable.getMessage() + (String)NLoginCore_059.c("㺕", (int)(aj & ak), (long)al) + string2 + (String)NLoginCore_059.c("㺘", (int)am, (long)an), throwable, new Object[ao]);
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.a(exception);
            NLoginCore_370.d((String)NLoginCore_059.c("㺛", (int)ap, (long)(aq ^ ar)), new Object[as]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public static Map<String, Object> a(File file, String string) {
        block9: {
            if (string != null) {
                JarFile jarFile = new JarFile(file);
                try {
                    Map map;
                    block10: {
                        JarEntry jarEntry = jarFile.getJarEntry(string);
                        if (jarEntry == null) break block9;
                        InputStream inputStream = jarFile.getInputStream(jarEntry);
                        try {
                            map = (Map)var_com_nickuc_login_lib_snakeyaml_Yaml_a.load(inputStream);
                            if (Collections.singletonList(inputStream).get(var_int_a) == null) break block10;
                        }
                        catch (Throwable throwable) {
                            if (Collections.singletonList(inputStream).get(var_int_c) != null) {
                                inputStream.close();
                            }
                            throw throwable;
                        }
                        inputStream.close();
                    }
                    return map;
                }
                finally {
                    if (Collections.singletonList(jarFile).get(var_int_b) != null) {
                        jarFile.close();
                    }
                }
            }
        }
        return null;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_059.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.D("ѰҒҔѴҘҷүӅұҀҾҴӂҼ҅ҪӌӋӃӉӃҘ", (byte)49, 68), NLoginCore_059.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.B("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҬҜҜҕҞҰӁҶүĵ", (byte)49, 66) + string + NLoginCore_076.E("ԧ", (byte)49, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 0 >>> 208 | 0 << -208;
        var_int_c = (0 >>> 30 | 0 << -30) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = 0 >>> 244 | 0 << ~244 + 1;
        f = Integer.reverse(0);
        g = Long.reverse(5486945274691584L);
        h = (0 >>> 244 | 0 << -244) & 0xFFFFFFFF;
        i = Integer.reverse(-1);
        j = Long.reverse(5790726819417952499L);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = (-1 >>> 78 | -1 << ~78 + 1) & 0xFFFFFFFF;
        m = Long.reverse(5790726819417952499L);
        n = Integer.reverse(0);
        o = (8 >>> 162 | 8 << -162) & 0xFFFFFFFF;
        p = -1 >>> 58 | -1 << -58;
        q = Long.reverse(5790726819417952499L);
        r = 3072 >>> 10 | 3072 << ~10 + 1;
        t = Long.reverse(5790726819417952499L);
        u = 0 >>> 160 | 0 << ~160 + 1;
        v = 1 >>> 190 | 1 << ~190 + 1;
        w = Long.reverse(5790726819417952499L);
        x = (81920 >>> 206 | 81920 << -206) & 0xFFFFFFFF;
        y = Long.reverse(5790726819417952499L);
        z = 196608 >>> 111 | 196608 << -111;
        aa = Long.reverse(6655417947873087731L);
        ab = Long.reverse(0xC00000000000000L);
        ac = Integer.reverse(-536870912);
        ad = (-1 >>> 32 | -1 << -32) & 0xFFFFFFFF;
        ae = Long.reverse(5790726819417952499L);
        af = Integer.reverse(0);
        ag = 128 >>> 100 | 128 << ~100 + 1;
        ah = Long.reverse(6655417947873087731L);
        ai = Long.reverse(0xC00000000000000L);
        aj = (73728 >>> 109 | 73728 << -109) & 0xFFFFFFFF;
        ak = Integer.reverse(-1);
        al = Long.reverse(5790726819417952499L);
        am = Integer.reverse(0x50000000);
        an = Long.reverse(5790726819417952499L);
        ao = Integer.reverse(0);
        ap = Integer.reverse(-805306368);
        aq = Long.reverse(6655417947873087731L);
        ar = Long.reverse(0xC00000000000000L);
        as = 0 >>> 243 | 0 << -243;
        at = Integer.reverse(0x30000000);
        au = Integer.reverse(0x30000000);
        var_java_lang_String_arr_a = new String[at];
        var_java_lang_String_arr_b = new String[au];
        NLoginCore_059.b();
        var_com_nickuc_login_lib_snakeyaml_Yaml_a = new Yaml((BaseConstructor)new Constructor(new LoaderOptions()));
    }

    private static String a(int n, long l) {
        l ^= 0x30L;
        l ^= 0xA86D988B6B69FCB7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(23 + 46), (byte)(79 + 4), (byte)(18 + 29), 67, (byte)(16 + 50), (byte)(44 + 23), (byte)(15 + 32), (byte)(59 + 21), (byte)(9 + 66), (byte)(16 + 51), (byte)(15 + 68), (byte)(10 + 43), (byte)(68 + 12), (byte)(16 + 81), 100, (byte)(33 + 67), (byte)(67 + 38), (byte)(40 + 70), (byte)(87 + 16)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("йцхЈшфпшѓтЏэёъэѓЕޡޑޑފޓޥ޶ޫޤ", (byte)11, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_059.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

