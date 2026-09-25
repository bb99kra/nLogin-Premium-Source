/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
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

public final class NLoginCore_337
extends Enum<NLoginCore_337> {
    public static final /* enum */ NLoginCore_337 var_com_nickuc_login_NLoginCore_337_a;
    public static final /* enum */ NLoginCore_337 var_com_nickuc_login_NLoginCore_337_b;
    private static final /* synthetic */ NLoginCore_337[] var_com_nickuc_login_NLoginCore_337_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static int e;
    private static int f;
    private static long g;
    private static long h;
    private static int i;
    private static int j;
    private static int k;
    private static long l;
    private static int m;

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = 0 >>> 16 | 0 << ~16 + 1;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0x40000000);
        e = (0x400000 >>> 213 | 0x400000 << -213) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = Long.reverse(-4353171860664834615L);
        h = Long.reverse(-3746994889972252672L);
        i = (0 >>> 16 | 0 << ~16 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (-1 >>> 126 | -1 << ~126 + 1) & 0xFFFFFFFF;
        l = Long.reverse(1123205286217688521L);
        m = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[d];
        var_java_lang_String_arr_b = new String[e];
        NLoginCore_337.b();
        var_com_nickuc_login_NLoginCore_337_a = new NLoginCore_337();
        var_com_nickuc_login_NLoginCore_337_b = new NLoginCore_337();
        var_com_nickuc_login_NLoginCore_337_arr_a = NLoginCore_337.a();
    }

    public static NLoginCore_337 valueOf(String string) {
        return Enum.valueOf(NLoginCore_337.class, string);
    }

    private static String a(int n, long l) {
        l ^= 0x33L;
        l ^= 0x25A30ECBE26AC925L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(49 + 20), (byte)(23 + 60), 47, (byte)(40 + 27), (byte)(7 + 59), (byte)(4 + 63), (byte)(22 + 25), (byte)(25 + 55), (byte)(43 + 32), (byte)(4 + 63), (byte)(17 + 66), (byte)(43 + 10), 80, (byte)(20 + 77), (byte)(74 + 26), (byte)(70 + 30), (byte)(10 + 95), (byte)(23 + 87), (byte)(20 + 83)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), (byte)(32 + 51)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("հսռԿտջնտ֊չՆքֈցք֊Ռ࣑ࣅࣀࣦࣣࣤࣥࣥࣝ", (byte)81, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_337.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static /* synthetic */ NLoginCore_337[] a() {
        NLoginCore_337[] NLoginCore_337Array = new NLoginCore_337[var_int_a];
        NLoginCore_337Array[NLoginCore_337.var_int_b] = var_com_nickuc_login_NLoginCore_337_a;
        NLoginCore_337Array[NLoginCore_337.var_int_c] = var_com_nickuc_login_NLoginCore_337_b;
        return NLoginCore_337Array;
    }

    public static NLoginCore_337[] values() {
        return (NLoginCore_337[])var_com_nickuc_login_NLoginCore_337_arr_a.clone();
    }

    private static void b() {
        int n;
        var_long_c = -7807804153099032125L;
        long l = var_long_c ^ 0x25A30ECBE26AC925L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(46 + 37), (byte)(17 + 30), (byte)(65 + 2), (byte)(64 + 2), (byte)(25 + 42), (byte)(38 + 9), (byte)(6 + 74), (byte)(16 + 59), (byte)(5 + 62), (byte)(74 + 9), (byte)(45 + 8), (byte)(53 + 27), (byte)(45 + 52), (byte)(3 + 97), (byte)(29 + 71), (byte)(7 + 98), (byte)(15 + 95), (byte)(61 + 42)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
                    NLoginCore_337.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ïëĒČÐõĊÕöëďþĜĔĤĦęĖćĂêĩðñ", (byte)15, 66);
                    NLoginCore_337.var_java_lang_String_arr_b[1] = NLoginCore_453.E("ӿԠԎ԰ՅԥԖԶԪԦՎՏԌԾԒԨԢՏԐԶԕ՗Ԟԟ", (byte)15, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_337.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ïëĒČÐõĊÕöëđþ÷ĖÖüüüòğħăðñ", (byte)15, 66);
                    NLoginCore_337.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ÑòàĂė÷èĈüøġÛĊďġÿßöāħýăðñ", (byte)15, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_337.var_java_lang_String_arr_b[0] = NLoginCore_110.E("ԮԓӸԑԑԲՆԿՉԽԹՂԐՃԽԾԼԮՑՇԔՑ՛ԣԔԫԝՔՍբԯԲ", (byte)15, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_337.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԄԀԼԁԴԳԈԛԢԟՀԊԉՎԟՎՆԑՃԲԢԱԞԟ", (byte)15, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_337.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("ӯԑԓӳԗԶԮՄ԰ӿԽԳՁԻԄԩՋՊՂՈՂԗ", (byte)11, 70), NLoginCore_337.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.F("ԪԷԶӹԹԵ԰ԹՄԳԀԾՂԻԾՄԆࢋࡿࡺࢠ࢝࢞࢟࢟ࢗԛ", (byte)11, 70) + string + NLoginCore_173.D("А", (byte)11, 68) + methodType.toString(), exception);
        }
    }
}

