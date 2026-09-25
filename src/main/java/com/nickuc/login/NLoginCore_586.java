/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_311;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_021;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_586
extends NLoginCore_021 {
    private static long ad;
    private static int u;
    private final Properties var_java_util_Properties_d;
    private static int k;
    private static int o;
    private static long f;
    private static int af;
    private static int z;
    private static int e;
    private static int w;
    private static long t;
    private static int h;
    private static int g;
    private final Constructor<?> var_java_lang_reflect_Constructor____d;
    private static int p;
    private static int s;
    private final String aC;
    private static long l;
    private static int j;
    private static int i;
    private static long var_long_d;
    private static int ae;
    private static int ab;
    private static String[] var_java_lang_String_arr_b;
    private static long ac;
    private static int n;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_a;
    private static int m;
    private static int aa;
    private static long c;
    private static int var_int_a;
    private static int v;
    private static long y;
    private static int q;
    private static long x;
    private static long r;

    private static void b() {
        int n;
        c = 2612434999779137962L;
        long l = c ^ 0x1EB1B5F7D07E566BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), 69, (byte)(68 + 15), (byte)(15 + 32), (byte)(25 + 42), (byte)(32 + 34), (byte)(18 + 49), (byte)(35 + 12), (byte)(15 + 65), (byte)(50 + 25), (byte)(41 + 26), (byte)(43 + 40), (byte)(43 + 10), (byte)(11 + 69), 97, (byte)(34 + 66), (byte)(98 + 2), (byte)(10 + 95), (byte)(71 + 39), (byte)(62 + 41)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_586.var_java_lang_String_arr_b[0] = NLoginCore_091.C("цќрєѳЮџѳѠѢечзїеяѹҁѭѡѱѳъы", (byte)22, 67);
                    NLoginCore_586.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ՂԺԧԣԷՏԮՒՍԵԍՎԖԴՇԧ՜ԨԬԽԕԷ԰ԽԴՔ՞Ն՗ՄՆՊգգՖԻԺԼԬՉԿղՉԺ", (byte)22, 70);
                    NLoginCore_586.var_java_lang_String_arr_b[2] = NLoginCore_559.D("цќрєѳЮџѳѠѢеяхїѦѝќѶҀѝѸзцйќѲ҃ѥќѧ҈҂҆уыѪ҆ґ҈҅ѷҔѕѱғѲѾѫѴѲєңѴғѪѫ", (byte)22, 68);
                    NLoginCore_586.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ãāćáĢèõýôêĮĢęĜĮĜĝĖĲĢĐĦĂĲ÷ĈċĪĵĊĘĿöĮġğĀĉŇĂĥĝĢē", (byte)22, 66);
                    NLoginCore_586.var_java_lang_String_arr_b[4] = NLoginCore_110.E("ԜԛԿԬԋՉՒԛԭԍՇԚ", (byte)22, 69);
                    NLoginCore_586.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ÞÞûàĜġêüêĩĥĨġêğĠĔĎĒđĩāþÿ", (byte)22, 65);
                    NLoginCore_586.var_java_lang_String_arr_b[6] = NLoginCore_451.F("ԅԅԢԇՃՈԑԣԑՐՌՏՈԑՆՇԻԵԹԸՐԨԥԦ", (byte)22, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_586.var_java_lang_String_arr_b[0] = NLoginCore_027.C("цќрєѳЮџѳѠѢжѹюзёѧѽёџђѮѿ҆ё҅ч҂тьуѩэ", (byte)22, 67);
                    NLoginCore_586.var_java_lang_String_arr_b[1] = NLoginCore_138.E("ՂԺԧԣԷՏԮՒՍԵԍՎԖԴՇԧ՜ԨԬԽԕԷ԰ԽԴՔ՞Ն՗ՄՆՊլլ՟ԺՠՎԽգԥՓ՟Ժ", (byte)22, 69);
                    NLoginCore_586.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ԡԷԛԯՎԉԺՎԻԽԐԪԠԲՁԸԷՑ՛ԸՓԒԡԔԷՍ՞ՀԷՂգ՝աԞԦՅալգՠՒկԲԳԿԮկըԻսեԵԾծՅՆ", (byte)22, 69);
                    NLoginCore_586.var_java_lang_String_arr_b[3] = NLoginCore_201.A("ãāćáĢèõýôêĮĢęĜĮĜĝĖĲĢĐĦĂĲ÷ĈċĪĵĊĘĿăýăĢŅĂĽĂĜĉĦē", (byte)22, 65);
                    NLoginCore_586.var_java_lang_String_arr_b[4] = NLoginCore_027.E("ՋԅԆԶԉԫՉԊԱՀՓԚ", (byte)22, 69);
                    NLoginCore_586.var_java_lang_String_arr_b[5] = NLoginCore_451.B("ÞÞûàĜġêüêĩĥĤčĉĭåîĆôĳĄĒİĵčľĖĵčāēĬ", (byte)22, 66);
                    NLoginCore_586.var_java_lang_String_arr_b[6] = NLoginCore_324.F("ԅԅԢԇՃՈԑԣԑՐՌԣԐԓՋԩԵԯԹ՟ԿԮՓԼ՝ԴԳԟՙՕբԥ", (byte)22, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_586.var_java_lang_String_arr_b[0] = NLoginCore_173.C("фчЭяоѩоѶѰсѺѸњѱѰжѨѲїѹњѳъы", (byte)22, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_586.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՀԠԹԦՌԝԃԬԎԵԾՈԥՆԺԷ԰ՅՅՐ՛ԠՋԵգԖՀԥՇԳԥՄ", (byte)22, 70);
                }
            }
        }
    }

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_586.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.E("ӴԖԘӸԜԻԳՉԵԄՂԸՆՀԉԮՐՏՇՍՇԜ", (byte)16, 69), NLoginCore_586.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("шѕєЗїѓюїѢёОќѠљќѢФޟި޽ޢ޸޿޶ޘи", (byte)16, 68) + string + NLoginCore_223.A("Ù", (byte)16, 65) + methodType.toString(), exception);
        }
    }

    private NLoginCore_586(NLoginCore_116<?> NLoginInterface_0112, File file, Properties properties) {
        Object object;
        if (NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b && NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b().ao()) {
            try {
                Class.forName((String)NLoginCore_586.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d));
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new RuntimeException((String)NLoginCore_586.c("㺃", (int)e, (long)f), classNotFoundException);
            }
            this.var_java_util_Properties_d = null;
        } else {
            NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[g];
            NLoginInterface_034Array[NLoginCore_586.h] = NLoginCore_311.var_com_nickuc_login_NLoginCore_315_o;
            NLoginInterface_034Array[NLoginCore_586.i] = NLoginCore_311.var_com_nickuc_login_NLoginCore_315_p;
            NLoginInterface_034Array[NLoginCore_586.j] = NLoginCore_311.A;
            object = NLoginInterface_0112.com_nickuc_login_NLoginCore_583_a().com_nickuc_login_NLoginCore_200_a(NLoginInterface_034Array);
            try {
                Class<?> clazz = ((ClassLoader)object).loadClass((String)NLoginCore_586.c("㺆", (int)k, (long)l));
                Class[] classArray = new Class[m];
                classArray[NLoginCore_586.n] = String.class;
                classArray[NLoginCore_586.o] = String.class;
                classArray[NLoginCore_586.p] = Properties.class;
                this.var_java_util_Properties_d = clazz.getConstructor(classArray);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw new RuntimeException(reflectiveOperationException);
            }
        }
        object = file.getParentFile();
        if (!((File)object).exists() && !((File)object).mkdirs()) {
            throw new RuntimeException((String)NLoginCore_586.c("㺉", (int)q, (long)r) + object + (String)NLoginCore_586.c("㺌", (int)s, (long)t));
        }
        this.aC = file.getAbsolutePath();
        this.var_java_util_Properties_d = properties;
    }

    public static NLoginCore_586 a(NLoginCore_116<?> NLoginInterface_0112, File file, Properties properties) {
        return new NLoginCore_586(NLoginInterface_0112, file, properties);
    }

    @Override
    protected Connection java_sql_Connection_c() {
        if (this.var_java_util_Properties_d != null) {
            try {
                Object[] objectArray = new Object[u];
                objectArray[NLoginCore_586.v] = (String)NLoginCore_586.c("㺀", (int)w, (long)(x ^ y)) + this.aC;
                objectArray[NLoginCore_586.z] = this.aC;
                objectArray[NLoginCore_586.aa] = this.var_java_util_Properties_d;
                return (Connection)((Constructor)((Object)this.var_java_util_Properties_d)).newInstance(objectArray);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                if (reflectiveOperationException.getCause() instanceof SQLException) {
                    throw (SQLException)reflectiveOperationException.getCause();
                }
                throw new RuntimeException(reflectiveOperationException);
            }
        }
        return DriverManager.getConnection((String)NLoginCore_586.c("㺃", (int)ab, (long)(ac ^ ad)) + this.aC, this.var_java_util_Properties_d);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        var_long_d = Long.reverse(-6514380988987178460L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-6514380988987178460L);
        g = Integer.reverse(-1073741824);
        h = Integer.reverse(0);
        i = 0x800000 >>> 151 | 0x800000 << ~151 + 1;
        j = (8192 >>> 12 | 8192 << -12) & 0xFFFFFFFF;
        k = Integer.reverse(0x40000000);
        l = Long.reverse(-6514380988987178460L);
        m = 6 >>> 129 | 6 << -129;
        n = Integer.reverse(0);
        o = 16384 >>> 238 | 16384 << -238;
        p = (8192 >>> 44 | 8192 << ~44 + 1) & 0xFFFFFFFF;
        q = (0x1800000 >>> 215 | 0x1800000 << ~215 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-6514380988987178460L);
        s = (512 >>> 39 | 512 << -39) & 0xFFFFFFFF;
        t = Long.reverse(-6514380988987178460L);
        u = 0x30000000 >>> 220 | 0x30000000 << ~220 + 1;
        v = Integer.reverse(0);
        w = 0x500000 >>> 212 | 0x500000 << -212;
        x = Long.reverse(6167755561688138276L);
        y = Long.reverse(-1152921504606846976L);
        z = (8192 >>> 205 | 8192 << ~205 + 1) & 0xFFFFFFFF;
        aa = Integer.reverse(0x40000000);
        ab = (786432 >>> 209 | 786432 << -209) & 0xFFFFFFFF;
        ac = Long.reverse(6167755561688138276L);
        ad = Long.reverse(-1152921504606846976L);
        ae = 0x1C00000 >>> 150 | 0x1C00000 << -150;
        af = -536870912 >>> 61 | -536870912 << -61;
        var_java_lang_String_arr_a = new String[ae];
        var_java_lang_String_arr_b = new String[af];
        NLoginCore_586.b();
    }

    private static String a(int n, long l) {
        l ^= 0xFL;
        l ^= 0x1EB1B5F7D07E566BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(58 + 11), (byte)(82 + 1), (byte)(22 + 25), (byte)(9 + 58), (byte)(11 + 55), (byte)(49 + 18), (byte)(16 + 31), 80, (byte)(17 + 58), (byte)(16 + 51), (byte)(26 + 57), (byte)(49 + 4), (byte)(68 + 12), (byte)(52 + 45), (byte)(60 + 40), (byte)(13 + 87), (byte)(62 + 43), (byte)(20 + 90), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.B("ưƽƼſƿƻƶƿǊƹƆǄǈǁǄǊƌԇԐԥԊԠԧԞԀ", (byte)103, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_586.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

