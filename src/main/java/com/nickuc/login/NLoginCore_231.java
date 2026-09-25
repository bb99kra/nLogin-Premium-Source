/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
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

public final class NLoginCore_231
extends Enum<NLoginCore_231> {
    public static final /* enum */ NLoginCore_231 var_com_nickuc_login_NLoginCore_231_a;
    public static final /* enum */ NLoginCore_231 var_com_nickuc_login_NLoginCore_231_b;
    private static final /* synthetic */ NLoginCore_231[] var_com_nickuc_login_NLoginCore_231_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static long h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;

    private static /* synthetic */ NLoginCore_231[] a() {
        NLoginCore_231[] NLoginCore_231Array = new NLoginCore_231[var_int_a];
        NLoginCore_231Array[NLoginCore_231.var_int_b] = var_com_nickuc_login_NLoginCore_231_a;
        NLoginCore_231Array[NLoginCore_231.var_int_c] = var_com_nickuc_login_NLoginCore_231_b;
        return NLoginCore_231Array;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_231.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.F("՝տցաօֲ֤֜֞խ֫֡֯֩ղְְֶָֹ֗օ", (byte)121, 70), NLoginCore_231.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऊࣰएंࣼऊ࣬ऐࣷऑए֋", (byte)121, 69) + string + NLoginCore_324.B("ƫ", (byte)121, 66) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -2912285955079198339L;
        long l = var_long_c ^ 0x58FAE0C26F734A39L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(27 + 41), 69, (byte)(17 + 66), (byte)(29 + 18), (byte)(25 + 42), (byte)(20 + 46), (byte)(46 + 21), (byte)(7 + 40), (byte)(78 + 2), (byte)(24 + 51), (byte)(59 + 8), (byte)(75 + 8), (byte)(45 + 8), (byte)(19 + 61), (byte)(7 + 90), 100, (byte)(7 + 93), (byte)(51 + 54), (byte)(72 + 38), (byte)(60 + 43)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_231.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ӱԌԳԐԄԨԌԒԵӿԔԅ", (byte)1, 69);
                    NLoginCore_231.var_java_lang_String_arr_b[1] = NLoginCore_027.D("БϮЮЊУЃЋиАЂ϶Ѐ", (byte)1, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_231.var_java_lang_String_arr_b[0] = NLoginCore_092.B("¬êÚæÇÐöÜÙóÙÍáăĈõÙØ÷ÕØçÔÕ", (byte)1, 66);
                    NLoginCore_231.var_java_lang_String_arr_b[1] = NLoginCore_004.C("ЅϬЌϳϽбФЅкϳЫϹϹЪкЮϷϻПЏддЋЌ", (byte)1, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_231.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ϺЌϲϮТбЬТІЬеЀ", (byte)1, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_231.var_java_lang_String_arr_b[0] = NLoginCore_384.B("¬¸äæÇìòÞíÔÔÉ", (byte)1, 66);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0);
        var_int_c = (524288 >>> 179 | 524288 << -179) & 0xFFFFFFFF;
        d = 512 >>> 40 | 512 << -40;
        e = 65536 >>> 143 | 65536 << ~143 + 1;
        f = Integer.reverse(0);
        g = -1 >>> 202 | -1 << ~202 + 1;
        h = Long.reverse(330069857424812523L);
        i = Integer.reverse(0);
        j = 128 >>> 135 | 128 << -135;
        k = Long.reverse(-4713961725230142997L);
        l = Long.reverse(-5044031582654955520L);
        m = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[d];
        var_java_lang_String_arr_b = new String[e];
        NLoginCore_231.b();
        var_com_nickuc_login_NLoginCore_231_a = new NLoginCore_231();
        var_com_nickuc_login_NLoginCore_231_b = new NLoginCore_231();
        var_com_nickuc_login_NLoginCore_231_arr_a = NLoginCore_231.a();
    }

    public static NLoginCore_231 valueOf(String string) {
        return Enum.valueOf(NLoginCore_231.class, string);
    }

    private static String a(int n, long l) {
        l ^= 0x5DL;
        l ^= 0x58FAE0C26F734A39L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(17 + 52), (byte)(23 + 60), (byte)(9 + 38), (byte)(27 + 40), (byte)(39 + 27), (byte)(6 + 61), (byte)(45 + 2), 80, (byte)(9 + 66), (byte)(65 + 2), (byte)(29 + 54), 53, (byte)(66 + 14), (byte)(75 + 22), (byte)(65 + 35), (byte)(38 + 62), (byte)(36 + 69), (byte)(73 + 37), (byte)(89 + 14)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.E("֤֣֗զֱ֦֢֦֝֠խֱ֫֯֨֫ճउ࣯ऎँࣻउ࣫एࣶऐऎ", (byte)120, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_231.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_231[] values() {
        return (NLoginCore_231[])var_com_nickuc_login_NLoginCore_231_arr_a.clone();
    }
}

