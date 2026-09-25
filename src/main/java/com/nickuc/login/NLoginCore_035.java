/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
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

public final class NLoginCore_035
extends Enum<NLoginCore_035> {
    public static final /* enum */ NLoginCore_035 var_com_nickuc_login_NLoginCore_035_a;
    public static final /* enum */ NLoginCore_035 var_com_nickuc_login_NLoginCore_035_b;
    public static final /* enum */ NLoginCore_035 var_com_nickuc_login_NLoginCore_035_c;
    public static final /* enum */ NLoginCore_035 var_com_nickuc_login_NLoginCore_035_d;
    public static final /* enum */ NLoginCore_035 var_com_nickuc_login_NLoginCore_035_e;
    private static final /* synthetic */ NLoginCore_035[] var_com_nickuc_login_NLoginCore_035_arr_a;
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
    private static int i;
    private static long j;
    private static int k;
    private static int l;
    private static long m;
    private static long n;
    private static int o;
    private static int p;
    private static long q;
    private static long r;
    private static int s;
    private static int t;
    private static long u;
    private static long v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;

    private static void b() {
        int n;
        var_long_c = -322378447279808631L;
        long l = var_long_c ^ 0xA87BDAE8DDCB4E61L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(14 + 55), (byte)(64 + 19), (byte)(45 + 2), (byte)(18 + 49), (byte)(20 + 46), (byte)(22 + 45), (byte)(3 + 44), (byte)(60 + 20), (byte)(62 + 13), (byte)(12 + 55), (byte)(56 + 27), 53, (byte)(2 + 78), (byte)(82 + 15), (byte)(20 + 80), (byte)(64 + 36), (byte)(42 + 63), (byte)(41 + 69), (byte)(54 + 49)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(21 + 48), (byte)(61 + 22)}, StandardCharsets.UTF_8));
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
                    NLoginCore_035.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ŢŬŉƇƊŻũşŧŻŦƕƐŸūƑųŚŲŗƌşŴƠűŬůżţƅżƠ", (byte)73, 65);
                    NLoginCore_035.var_java_lang_String_arr_b[1] = NLoginCore_575.A("ƆƃŴƃŅŉōŞŤŭŝƆŵƆŴųƉŨŴƕŽƗŨŝŔźŠƦŷƃŹƨ", (byte)73, 65);
                    NLoginCore_035.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ԀӺӬӫӋӽӣӜӚԄԐӪӳӵӭԍӦԗӧԇԋԑԖӻӘԒԐӴӻԤӲӷ", (byte)73, 68);
                    NLoginCore_035.var_java_lang_String_arr_b[3] = NLoginCore_027.D("ӜӡӤӿԌӬԏӠӑӮӿӬԋӷԌԕԃӹӚԄӸԘӻԉӪԘԖԎӝӺԈӲ", (byte)73, 68);
                    NLoginCore_035.var_java_lang_String_arr_b[4] = NLoginCore_446.A("ƈŴŬƍŝŗŽŋŠƎŤř", (byte)73, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_035.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ӡӫӈԆԉӺӨӞӦӺӥԔԏӷӪԐӲәӱӖԋԝԠԛԕԃӠԢӡԢԝԜ", (byte)73, 68);
                    NLoginCore_035.var_java_lang_String_arr_b[1] = NLoginCore_451.A("ƆƃŴƃŅŉōŞŤŭŝƆŵƆŴųƉŨŴƕŽƏŜƒŜƟŢſŻƔƤƁŵƗŴƢŦƙƮƟƞƲƞŹ", (byte)73, 65);
                    NLoginCore_035.var_java_lang_String_arr_b[2] = NLoginCore_004.C("ԀӺӬӫӋӽӣӜӚԄԐӪӳӵӭԍӦԗӧԇԋԔӟԠԁӳӹӽԀԛԘԜ", (byte)73, 67);
                    NLoginCore_035.var_java_lang_String_arr_b[3] = NLoginCore_223.D("ӜӡӤӿԌӬԏӠӑӮӿӬԋӷԌԕԃӹӚԄӸԐӟӿәԙӢӚԂԁӴӽ", (byte)73, 68);
                    NLoginCore_035.var_java_lang_String_arr_b[4] = NLoginCore_027.A("ŕƋƄŪƈƁŚŠŬűžťőŤƍƃƍŨŤƞūƝŤť", (byte)73, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_035.var_java_lang_String_arr_b[0] = NLoginCore_223.A("żŔſƃŹƂŌžŉſżŎƖŦőƔŘŦƊƞżƚśŷŔžşƖźŲſƁ", (byte)73, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_035.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ӧӸӛӗӈӶԅӉӃӥӣԃӤӓӴԗԄәԎӦԍԌӣӤ", (byte)73, 68);
                }
            }
        }
    }

    public static NLoginCore_035[] values() {
        return (NLoginCore_035[])var_com_nickuc_login_NLoginCore_035_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0xA87BDAE8DDCB4E61L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(63 + 6), (byte)(26 + 57), (byte)(36 + 11), (byte)(10 + 57), (byte)(55 + 11), 67, (byte)(45 + 2), (byte)(27 + 53), 75, (byte)(43 + 24), (byte)(81 + 2), (byte)(48 + 5), (byte)(69 + 11), (byte)(53 + 44), (byte)(64 + 36), (byte)(72 + 28), (byte)(99 + 6), (byte)(16 + 94), (byte)(50 + 53)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(24 + 45), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.D("ҖңҢѥҥҡҜҥҰҟѬҪҮҧҪҰѲ߬ࠋࠂࠁ߼ߤ߳ࠍࠒߠࠋߪࠖࠑࠗ", (byte)42, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_035.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_035 valueOf(String string) {
        return Enum.valueOf(NLoginCore_035.class, string);
    }

    private static /* synthetic */ NLoginCore_035[] a() {
        NLoginCore_035[] NLoginCore_035Array = new NLoginCore_035[var_int_a];
        NLoginCore_035Array[NLoginCore_035.var_int_b] = var_com_nickuc_login_NLoginCore_035_a;
        NLoginCore_035Array[NLoginCore_035.var_int_c] = var_com_nickuc_login_NLoginCore_035_b;
        NLoginCore_035Array[NLoginCore_035.var_int_d] = var_com_nickuc_login_NLoginCore_035_c;
        NLoginCore_035Array[NLoginCore_035.var_int_e] = var_com_nickuc_login_NLoginCore_035_d;
        NLoginCore_035Array[NLoginCore_035.f] = var_com_nickuc_login_NLoginCore_035_e;
        return NLoginCore_035Array;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_035.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("ҲӔӖҶӚӹӱԇӳӂԀӶԄӾӇӬԎԍԅԋԅӚ", (byte)71, 68), NLoginCore_035.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡃࡢ࡙ࡘࡓ࠻ࡊࡤࡩ࠷ࡢࡁ࡭ࡨ࡮Ӥ", (byte)71, 67) + string + NLoginCore_027.E("Խ", (byte)71, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0xA000000 >>> 25 | 0xA000000 << ~25 + 1;
        var_int_b = Integer.reverse(0);
        var_int_c = (256 >>> 136 | 256 << -136) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(0x40000000);
        var_int_e = (0x180000 >>> 51 | 0x180000 << ~51 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(0x20000000);
        g = (0x40000001 >>> 158 | 0x40000001 << ~158 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(-1610612736);
        i = 0 >>> 227 | 0 << ~227 + 1;
        j = Long.reverse(4465500970745684447L);
        k = Integer.reverse(0);
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Long.reverse(-7928405203777920545L);
        n = Long.reverse(-6052837899185946624L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = 0x200000 >>> 180 | 0x200000 << ~180 + 1;
        q = Long.reverse(-7928405203777920545L);
        r = Long.reverse(-6052837899185946624L);
        s = (1 >>> 191 | 1 << ~191 + 1) & 0xFFFFFFFF;
        t = Integer.reverse(-1073741824);
        u = Long.reverse(-7928405203777920545L);
        v = Long.reverse(-6052837899185946624L);
        w = Integer.reverse(-1073741824);
        x = 32768 >>> 141 | 32768 << -141;
        y = Long.reverse(4465500970745684447L);
        z = Integer.reverse(0x20000000);
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_035.b();
        var_com_nickuc_login_NLoginCore_035_a = new NLoginCore_035();
        var_com_nickuc_login_NLoginCore_035_b = new NLoginCore_035();
        var_com_nickuc_login_NLoginCore_035_c = new NLoginCore_035();
        var_com_nickuc_login_NLoginCore_035_d = new NLoginCore_035();
        var_com_nickuc_login_NLoginCore_035_e = new NLoginCore_035();
        var_com_nickuc_login_NLoginCore_035_arr_a = NLoginCore_035.a();
    }
}

