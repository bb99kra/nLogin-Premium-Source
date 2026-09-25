/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_388 {
    public static final long n;
    private static int var_int_b;
    private static long var_long_c;
    private static int var_int_c;
    private static long f;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    public static final String as;
    private static String[] var_java_lang_String_arr_b;
    private static int d;
    public static final int C;
    private static int e;
    public static final int D;

    static {
        var_int_a = (0x1000000 >>> 216 | 0x1000000 << ~216 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = Integer.reverse(0x40000000);
        d = (0x3000000 >>> 151 | 0x3000000 << -151) & 0xFFFFFFFF;
        e = Integer.reverse(0);
        f = Long.reverse(-3361811071859263257L);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_388.b();
        D = var_int_c;
        C = d;
        as = NLoginCore_388.c("㺀", (int)e, (long)f);
        n = System.currentTimeMillis();
    }

    private static void b() {
        int n;
        var_long_c = -1792894643519743234L;
        long l = var_long_c ^ 0x2BB5D965C3047951L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(61 + 8), (byte)(40 + 43), (byte)(34 + 13), (byte)(64 + 3), 66, (byte)(55 + 12), (byte)(22 + 25), (byte)(3 + 77), (byte)(53 + 22), (byte)(52 + 15), (byte)(37 + 46), (byte)(2 + 51), 80, (byte)(48 + 49), (byte)(9 + 91), (byte)(14 + 86), (byte)(67 + 38), (byte)(54 + 56), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(25 + 44), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_388.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ԊԡԅԬԦӪԶӵԪ԰ӸԂ", (byte)87, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_388.var_java_lang_String_arr_b[0] = NLoginCore_451.C("ӱԑԩԀԦԲԓԪԒӷԻԂ", (byte)87, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_388.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ƙƠşƓŧơƗƄŷšŦƞơƒžƱƕŵƫƕƭƃƀƁ", (byte)87, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_388.var_java_lang_String_arr_b[0] = NLoginCore_451.B("ƒųƦƑƛŷżƙŶžƜƊƳƓƐƓžƊƇƱƴƅƽƝƞžŻŷǂſơƁ", (byte)87, 66);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_388.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.E("՜վրՠքֱ֣֛֝լ֪֮֠֨ձֵַָ֖֯֯ք", (byte)120, 69), NLoginCore_388.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.F("֤֣֗զֱ֦֢֦֝֠խֱ֫֯֨֫ճऋऄࣺ࣮ऀऑःऋएइ։", (byte)120, 70) + string + NLoginCore_091.D("՗", (byte)120, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x75L;
        l ^= 0x2BB5D965C3047951L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41), (byte)(7 + 40), (byte)(62 + 5), (byte)(24 + 42), (byte)(45 + 22), (byte)(20 + 27), (byte)(46 + 34), (byte)(9 + 66), (byte)(49 + 18), (byte)(6 + 77), (byte)(7 + 46), (byte)(70 + 10), (byte)(22 + 75), (byte)(78 + 22), (byte)(89 + 11), (byte)(48 + 57), (byte)(13 + 97), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.E("չֆօՈֈքտֈ֓ւՏ֍֑֊֍֓Օ࣭ࣦ࣐ࣜ࣢ࣱ࣭ࣩࣳࣥ", (byte)90, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_388.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

