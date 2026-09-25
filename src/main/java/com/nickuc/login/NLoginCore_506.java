/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
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

final class NLoginCore_506
extends Enum<NLoginCore_506> {
    public static final /* enum */ NLoginCore_506 var_com_nickuc_login_NLoginCore_506_b;
    public static final /* enum */ NLoginCore_506 var_com_nickuc_login_NLoginCore_506_c;
    public static final /* enum */ NLoginCore_506 var_com_nickuc_login_NLoginCore_506_d;
    public static final /* enum */ NLoginCore_506 var_com_nickuc_login_NLoginCore_506_e;
    private static final /* synthetic */ NLoginCore_506[] var_com_nickuc_login_NLoginCore_506_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int f;
    private static int g;
    private static int h;
    private static long i;
    private static int j;
    private static int k;
    private static int l;
    private static long m;
    private static int n;
    private static int o;
    private static int p;
    private static long q;
    private static int r;
    private static int s;
    private static long t;
    private static int u;

    private static void b() {
        int n;
        var_long_c = 1555966325424537525L;
        long l = var_long_c ^ 0x2D8FDCB2B1F4CC1FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(53 + 16), (byte)(22 + 61), (byte)(4 + 43), (byte)(50 + 17), (byte)(21 + 45), (byte)(15 + 52), (byte)(7 + 40), (byte)(76 + 4), 75, 67, (byte)(38 + 45), (byte)(35 + 18), (byte)(70 + 10), (byte)(21 + 76), (byte)(57 + 43), (byte)(37 + 63), (byte)(62 + 43), (byte)(91 + 19), (byte)(55 + 48)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_506.var_java_lang_String_arr_b[0] = NLoginCore_453.E("ԀӿԏӾԣՉԹԬԡԈՀԓ", (byte)15, 69);
                    NLoginCore_506.var_java_lang_String_arr_b[1] = NLoginCore_559.D("ХюзѐєНаЛіПхЪ", (byte)15, 68);
                    NLoginCore_506.var_java_lang_String_arr_b[2] = NLoginCore_027.E("ԞԐԒԡԺՊԆԊԋՎԚԓ", (byte)15, 69);
                    NLoginCore_506.var_java_lang_String_arr_b[3] = NLoginCore_091.F("ԸԷԲԙԣՃՂԡԖԫԾԦԭԍԫԢԣԒՁ՘Ԙ՗Ԟԟ", (byte)15, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_506.var_java_lang_String_arr_b[0] = NLoginCore_223.C("фкЪиБвљљѡОнЪ", (byte)15, 67);
                    NLoginCore_506.var_java_lang_String_arr_b[1] = NLoginCore_004.C("алШвџЛНЛЯјѦяђојѦгїќњЫшеж", (byte)15, 67);
                    NLoginCore_506.var_java_lang_String_arr_b[2] = NLoginCore_559.D("юшьэђљпРіьѠчесгкТўеЬюиеж", (byte)15, 68);
                    NLoginCore_506.var_java_lang_String_arr_b[3] = NLoginCore_110.D("яющакњљиЭтєПФлШолрншѨўеж", (byte)15, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_506.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ĔÔîđúóėìĉĝĔĂÝïĤĄĤúþĈęęðñ", (byte)15, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_506.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ԂԅԸԸՀԩԕԅԪԶԜԌԧԽԝԾԳԵՄԬԴ՗Ԟԟ", (byte)15, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_506.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ҎҰҲҒҶӕӍӣӏҞӜӒӠӚңӈӪөӡӧӡҶ", (byte)59, 67), NLoginCore_506.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.B("ŘťŤħŧţŞŧŲšĮŬŰũŬŲĴӃҸҼӉӍӁӍӈӂӗŊ", (byte)59, 66) + string + NLoginCore_092.F("Ա", (byte)59, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 524288 >>> 17 | 524288 << ~17 + 1;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0x40000000 >>> 221 | 0x40000000 << ~221 + 1;
        var_int_e = Integer.reverse(-1073741824);
        f = 0x800000 >>> 53 | 0x800000 << ~53 + 1;
        g = Integer.reverse(0x20000000);
        h = 0 >>> 169 | 0 << -169;
        i = Long.reverse(-3892123069624882776L);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = -1 >>> 191 | -1 << -191;
        m = Long.reverse(-3892123069624882776L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = (2 >>> 128 | 2 << -128) & 0xFFFFFFFF;
        p = (-1 >>> 237 | -1 << ~237 + 1) & 0xFFFFFFFF;
        q = Long.reverse(-3892123069624882776L);
        r = (128 >>> 230 | 128 << -230) & 0xFFFFFFFF;
        s = 0xC000000 >>> 218 | 0xC000000 << -218;
        t = Long.reverse(-3892123069624882776L);
        u = (196608 >>> 80 | 196608 << -80) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_506.b();
        var_com_nickuc_login_NLoginCore_506_b = new NLoginCore_506();
        var_com_nickuc_login_NLoginCore_506_c = new NLoginCore_506();
        var_com_nickuc_login_NLoginCore_506_d = new NLoginCore_506();
        var_com_nickuc_login_NLoginCore_506_e = new NLoginCore_506();
        var_com_nickuc_login_NLoginCore_506_arr_a = NLoginCore_506.a();
    }

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0x2D8FDCB2B1F4CC1FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(15 + 54), (byte)(79 + 4), (byte)(33 + 14), (byte)(18 + 49), (byte)(4 + 62), (byte)(64 + 3), (byte)(43 + 4), (byte)(61 + 19), (byte)(57 + 18), (byte)(63 + 4), (byte)(32 + 51), (byte)(34 + 19), 80, (byte)(27 + 70), (byte)(80 + 20), (byte)(67 + 33), (byte)(13 + 92), (byte)(47 + 63), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.B("ŀōŌďŏŋņŏŚŉĖŔŘőŔŚĜҫҠҤұҵҩҵҰҪҿ", (byte)47, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_506.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_506 valueOf(String string) {
        return Enum.valueOf(NLoginCore_506.class, string);
    }

    public static NLoginCore_506[] values() {
        return (NLoginCore_506[])var_com_nickuc_login_NLoginCore_506_arr_a.clone();
    }

    private static /* synthetic */ NLoginCore_506[] a() {
        NLoginCore_506[] NLoginCore_506Array = new NLoginCore_506[var_int_a];
        NLoginCore_506Array[NLoginCore_506.var_int_b] = var_com_nickuc_login_NLoginCore_506_b;
        NLoginCore_506Array[NLoginCore_506.var_int_c] = var_com_nickuc_login_NLoginCore_506_c;
        NLoginCore_506Array[NLoginCore_506.var_int_d] = var_com_nickuc_login_NLoginCore_506_d;
        NLoginCore_506Array[NLoginCore_506.var_int_e] = var_com_nickuc_login_NLoginCore_506_e;
        return NLoginCore_506Array;
    }
}

