/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_280
extends Enum<NLoginCore_280> {
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_a;
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_b;
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_c;
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_d;
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_e;
    public static final /* enum */ NLoginCore_280 var_com_nickuc_login_NLoginCore_280_f;
    private static final /* synthetic */ NLoginCore_280[] var_com_nickuc_login_NLoginCore_280_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;
    private static int n;
    private static long o;
    private static long p;
    private static int q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;
    private static int v;
    private static long w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static long ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static int af;

    private static String a(int n, long l) {
        l ^= 0x69L;
        l ^= 0xD8F57873C5BB5944L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(55 + 14), (byte)(21 + 62), (byte)(29 + 18), (byte)(51 + 16), (byte)(31 + 35), (byte)(50 + 17), (byte)(14 + 33), 80, (byte)(13 + 62), (byte)(31 + 36), (byte)(67 + 16), (byte)(44 + 9), 80, (byte)(87 + 10), (byte)(53 + 47), (byte)(81 + 19), (byte)(85 + 20), (byte)(12 + 98), (byte)(85 + 18)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.D("ЭкйϼмигмчжЃсхосчЉݶބޅޑޓޣޛޟޫޡޚ", (byte)7, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_280.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_280 valueOf(String string) {
        return Enum.valueOf(NLoginCore_280.class, string);
    }

    private static /* synthetic */ NLoginCore_280[] a() {
        NLoginCore_280[] NLoginCore_280Array = new NLoginCore_280[var_int_a];
        NLoginCore_280Array[NLoginCore_280.var_int_b] = var_com_nickuc_login_NLoginCore_280_a;
        NLoginCore_280Array[NLoginCore_280.var_int_c] = var_com_nickuc_login_NLoginCore_280_b;
        NLoginCore_280Array[NLoginCore_280.var_int_d] = var_com_nickuc_login_NLoginCore_280_c;
        NLoginCore_280Array[NLoginCore_280.var_int_e] = var_com_nickuc_login_NLoginCore_280_d;
        NLoginCore_280Array[NLoginCore_280.var_int_f] = var_com_nickuc_login_NLoginCore_280_e;
        NLoginCore_280Array[NLoginCore_280.g] = var_com_nickuc_login_NLoginCore_280_f;
        return NLoginCore_280Array;
    }

    public static NLoginCore_280[] values() {
        return (NLoginCore_280[])var_com_nickuc_login_NLoginCore_280_arr_a.clone();
    }

    static {
        var_int_a = 98304 >>> 238 | 98304 << -238;
        var_int_b = Integer.reverse(0);
        var_int_c = (1 >>> 128 | 1 << ~128 + 1) & 0xFFFFFFFF;
        var_int_d = (65536 >>> 239 | 65536 << -239) & 0xFFFFFFFF;
        var_int_e = (96 >>> 101 | 96 << ~101 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(0x20000000);
        g = Integer.reverse(-1610612736);
        h = 6 >>> 0 | 6 << ~0 + 1;
        i = Integer.reverse(0x60000000);
        j = Integer.reverse(0);
        k = Long.reverse(-4642805189423201553L);
        l = Long.reverse(-7638104968020361216L);
        m = (0 >>> 104 | 0 << -104) & 0xFFFFFFFF;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Long.reverse(-4642805189423201553L);
        p = Long.reverse(-7638104968020361216L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(0x40000000);
        s = Long.reverse(-4642805189423201553L);
        t = Long.reverse(-7638104968020361216L);
        u = 0x4000000 >>> 249 | 0x4000000 << -249;
        v = (48 >>> 228 | 48 << ~228 + 1) & 0xFFFFFFFF;
        w = Long.reverse(-4642805189423201553L);
        x = Long.reverse(-7638104968020361216L);
        y = 0x18000000 >>> 59 | 0x18000000 << -59;
        z = 4 >>> 0 | 4 << -0;
        aa = Long.reverse(-4642805189423201553L);
        ab = Long.reverse(-7638104968020361216L);
        ac = Integer.reverse(0x20000000);
        ad = Integer.reverse(-1610612736);
        ae = Long.reverse(2995299778597159663L);
        af = Integer.reverse(-1610612736);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_280.b();
        var_com_nickuc_login_NLoginCore_280_a = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_b = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_c = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_d = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_e = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_f = new NLoginCore_280();
        var_com_nickuc_login_NLoginCore_280_arr_a = NLoginCore_280.a();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_280.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ӻԝԟӿԣՂԺՐԼԋՉԿՍՇԐԵ՗ՖՎՔՎԣ", (byte)23, 69), NLoginCore_280.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࡿࢍࢎ࢚࢜ࢬࢤࢨࢴࢪࢣԩ", (byte)23, 70) + string + NLoginCore_027.B("ç", (byte)23, 66) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -630248006929708547L;
        long l = var_long_c ^ 0xD8F57873C5BB5944L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(29 + 40), (byte)(22 + 61), (byte)(19 + 28), (byte)(47 + 20), (byte)(55 + 11), (byte)(65 + 2), (byte)(37 + 10), (byte)(20 + 60), (byte)(58 + 17), 67, (byte)(79 + 4), (byte)(12 + 41), (byte)(65 + 15), 97, (byte)(61 + 39), (byte)(76 + 24), (byte)(54 + 51), (byte)(93 + 17), (byte)(88 + 15)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_280.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ƂſŧſƃƐŤƦƍŴŵŻ", (byte)90, 66);
                    NLoginCore_280.var_java_lang_String_arr_b[1] = NLoginCore_173.B("ƀƨƂƝƧơƆƍƟŬƈƢůƘŬƃƦŸŴƻƩƿƆƇ", (byte)90, 66);
                    NLoginCore_280.var_java_lang_String_arr_b[2] = NLoginCore_110.D("ԈԝԓԒӼՁԵԯԻԥԄԙԠԃԚԙӾԦԌՀՉԿԖԗ", (byte)90, 68);
                    NLoginCore_280.var_java_lang_String_arr_b[3] = NLoginCore_027.E("Վբ։աՋեֈյ՟Ցմզթօ՚՞֜՟Փ՚֍֢թժ", (byte)90, 69);
                    NLoginCore_280.var_java_lang_String_arr_b[4] = NLoginCore_387.B("ŞƜƚƯƚŮƉūƕƵƤŻ", (byte)90, 66);
                    NLoginCore_280.var_java_lang_String_arr_b[5] = NLoginCore_076.A("ŪŶŷƫƮžůƣƃŲƊŻ", (byte)90, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_280.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƨƋſƀŭƒŪƤƔűƑƆƅƷƇƭƗƓƷźźƙƆƇ", (byte)90, 65);
                    NLoginCore_280.var_java_lang_String_arr_b[1] = NLoginCore_027.D("ԐԸԒԭԷԱԖԝԯӼԗӽԘԽՄՁԦՌՋՁԫԙԖԗ", (byte)90, 68);
                    NLoginCore_280.var_java_lang_String_arr_b[2] = NLoginCore_427.B("ŸƍƃƂŬƱƥƟƫƕŴƣƷŹƫƼƝƊƖżƑƿƆƇ", (byte)90, 66);
                    NLoginCore_280.var_java_lang_String_arr_b[3] = NLoginCore_453.A("ūſƦžŨƂƥƒżŮƎƧƬƥƦƸƇƬƊƊƯƙƆƇ", (byte)90, 65);
                    NLoginCore_280.var_java_lang_String_arr_b[4] = NLoginCore_076.C("ӷӸԸԽԸԭԛՀԹԯԦԋ", (byte)90, 67);
                    NLoginCore_280.var_java_lang_String_arr_b[5] = NLoginCore_575.A("ŷơơƂƪƀƧơƧƅưŻ", (byte)90, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_280.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ƕƈƄƊūƏƍƏŰſƓƘƉƨƻƗŻƶƯƱƵƙƆƇ", (byte)90, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_280.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ӻԔԋԪԱԫԷԶӿԘԴԋ", (byte)90, 68);
                }
            }
        }
    }
}

