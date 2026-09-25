/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_254
extends Enum<NLoginCore_254> {
    public static final /* enum */ NLoginCore_254 var_com_nickuc_login_NLoginCore_254_b;
    public static final /* enum */ NLoginCore_254 var_com_nickuc_login_NLoginCore_254_c;
    public static final /* enum */ NLoginCore_254 var_com_nickuc_login_NLoginCore_254_d;
    private static final /* synthetic */ NLoginCore_254[] var_com_nickuc_login_NLoginCore_254_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static long var_long_b;
    private static long var_long_d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static long l;
    private static int m;
    private static int n;
    private static long o;
    private static int p;
    private static int q;
    private static long r;
    private static int s;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_254.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.E("ԢՄՆԦՊթաշգԲհզմծԷ՜վսյջյՊ", (byte)62, 69), NLoginCore_254.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ŞūŪĭŭũŤŭŸŧĴŲŶůŲŸĺӉӇӆӌӅӆӉӇӈŏ", (byte)62, 66) + string + NLoginCore_384.E("Դ", (byte)62, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 151 | 0 << -151) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-355975510576187558L);
        var_long_d = Long.reverse(-6052837899185946624L);
        e = (0x180000 >>> 147 | 0x180000 << ~147 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = 8 >>> 163 | 8 << ~163 + 1;
        h = Integer.reverse(0x40000000);
        i = 16 >>> 194 | 16 << -194;
        j = (131072 >>> 207 | 131072 << ~207 + 1) & 0xFFFFFFFF;
        k = (1024 >>> 106 | 1024 << -106) & 0xFFFFFFFF;
        l = Long.reverse(6273323140913182554L);
        m = Integer.reverse(0);
        n = (0x10000000 >>> 155 | 0x10000000 << -155) & 0xFFFFFFFF;
        o = Long.reverse(6273323140913182554L);
        p = (64 >>> 134 | 64 << ~134 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(-1073741824);
        r = Long.reverse(6273323140913182554L);
        s = 32768 >>> 174 | 32768 << ~174 + 1;
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_254.b();
        var_com_nickuc_login_NLoginCore_254_b = new NLoginCore_254();
        var_com_nickuc_login_NLoginCore_254_c = new NLoginCore_254();
        var_com_nickuc_login_NLoginCore_254_d = new NLoginCore_254();
        var_com_nickuc_login_NLoginCore_254_arr_a = NLoginCore_254.a();
    }

    private static /* synthetic */ NLoginCore_254[] a() {
        NLoginCore_254[] NLoginCore_254Array = new NLoginCore_254[e];
        NLoginCore_254Array[NLoginCore_254.f] = var_com_nickuc_login_NLoginCore_254_b;
        NLoginCore_254Array[NLoginCore_254.g] = var_com_nickuc_login_NLoginCore_254_c;
        NLoginCore_254Array[NLoginCore_254.h] = var_com_nickuc_login_NLoginCore_254_d;
        return NLoginCore_254Array;
    }

    private static void b() {
        int n;
        var_long_c = 6551746785302999263L;
        long l = var_long_c ^ 0xA13B516015A2E408L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(81 + 2), (byte)(7 + 40), (byte)(54 + 13), (byte)(49 + 17), 67, (byte)(11 + 36), (byte)(25 + 55), (byte)(70 + 5), (byte)(21 + 46), (byte)(78 + 5), (byte)(38 + 15), (byte)(25 + 55), (byte)(93 + 4), (byte)(72 + 28), (byte)(66 + 34), (byte)(74 + 31), (byte)(85 + 25), (byte)(44 + 59)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(28 + 40), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_254.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ƒŨůŏťƁŢƔřťŹƠŞƕƏƔƠŢſƐƟƟƓŝơŶƮŻƙūžƳƮŬƄƫƤųƻƈƽƵƊƃ", (byte)78, 65);
                    NLoginCore_254.var_java_lang_String_arr_b[1] = NLoginCore_138.B("ŜűƒƎŴšƘƋƎƎƘţ", (byte)78, 66);
                    NLoginCore_254.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ƉşŖƔŷŘŤţƘŸƌţ", (byte)78, 66);
                    NLoginCore_254.var_java_lang_String_arr_b[3] = NLoginCore_427.C("өӐԎӵӭԑӴԠԠԋӪӧ", (byte)78, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_254.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƒŨůŏťƁŢƔřťŹƠŞƕƏƔƠŢſƐƟƟƓŝơŶƮŻƙūžƳƔůƏƱƷƬƭŸƳƔƼƃ", (byte)78, 65);
                    NLoginCore_254.var_java_lang_String_arr_b[1] = NLoginCore_201.F("քծՓդպ՛՚բփժ՜ՙևրի՞՛հ֖թե֖՝՞", (byte)78, 70);
                    NLoginCore_254.var_java_lang_String_arr_b[2] = NLoginCore_223.F("վհպԾփռֆՊիՌ֋Ւ", (byte)78, 70);
                    NLoginCore_254.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ƓƃţŴŲŐŧųƔŸƒŪŲřƖƙƒŤŴŤƐƗŮů", (byte)78, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_254.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ԊԚӵӺԐӽӜӟәӴԠӧ", (byte)78, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_254.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ӴӬԊԋԑԗӯԐӪԑӹԕӹԏԤԤԕӾԣӪԔԪԀԎԤԫԑӭԎԀԇԫ", (byte)78, 67);
                }
            }
        }
    }

    public UUID a(String string, UUID uUID) {
        switch (this.ordinal()) {
            case 0: {
                return UUID.randomUUID();
            }
            case 1: {
                return uUID != null ? uUID : NLoginCore_432.d(string);
            }
            case 2: {
                return NLoginCore_432.d(string);
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_254.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)) + (Object)((Object)this));
    }

    public static NLoginCore_254 valueOf(String string) {
        return Enum.valueOf(NLoginCore_254.class, string);
    }

    public static NLoginCore_254[] values() {
        return (NLoginCore_254[])var_com_nickuc_login_NLoginCore_254_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0xA13B516015A2E408L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(15 + 54), (byte)(65 + 18), 47, (byte)(43 + 24), (byte)(25 + 41), (byte)(28 + 39), (byte)(25 + 22), (byte)(9 + 71), (byte)(34 + 41), (byte)(55 + 12), (byte)(72 + 11), (byte)(37 + 16), (byte)(36 + 44), (byte)(44 + 53), (byte)(64 + 36), (byte)(69 + 31), (byte)(25 + 80), (byte)(52 + 58), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.D("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߈߆߅ߋ߄߅߈߆߇", (byte)23, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_254.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

