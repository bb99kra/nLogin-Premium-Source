/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
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

public final class NLoginCore_009
extends Enum<NLoginCore_009> {
    public static final /* enum */ NLoginCore_009 var_com_nickuc_login_NLoginCore_009_a;
    public static final /* enum */ NLoginCore_009 var_com_nickuc_login_NLoginCore_009_b;
    public static final /* enum */ NLoginCore_009 var_com_nickuc_login_NLoginCore_009_c;
    public static final /* enum */ NLoginCore_009 var_com_nickuc_login_NLoginCore_009_d;
    private static final /* synthetic */ NLoginCore_009[] var_com_nickuc_login_NLoginCore_009_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static long j;
    private static int k;
    private static int l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;

    private static void b() {
        int n;
        var_long_c = 1839269208355773501L;
        long l = var_long_c ^ 0xB7BCB7E258A0FCDBL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(3 + 66), (byte)(7 + 76), (byte)(22 + 25), (byte)(14 + 53), 66, (byte)(3 + 64), (byte)(15 + 32), (byte)(30 + 50), (byte)(40 + 35), (byte)(28 + 39), (byte)(18 + 65), (byte)(5 + 48), (byte)(47 + 33), (byte)(31 + 66), (byte)(73 + 27), (byte)(53 + 47), (byte)(74 + 31), 110, (byte)(58 + 45)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(65 + 18)}, StandardCharsets.UTF_8));
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
                    NLoginCore_009.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ÞĔćĀèçÕêäĄĚá", (byte)13, 65);
                    NLoginCore_009.var_java_lang_String_arr_b[1] = NLoginCore_446.D("ѐяЭыУбеаёѐЩЛјїНхлѡѥічвЯа", (byte)13, 68);
                    NLoginCore_009.var_java_lang_String_arr_b[2] = NLoginCore_201.F("ӽՀԗԃԁԞԡӿՆՂԺԑ", (byte)13, 70);
                    NLoginCore_009.var_java_lang_String_arr_b[3] = NLoginCore_384.C("ФтАхеггббмщФ", (byte)13, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_009.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ЎѓЧъдљшМѝдѠшїѕмёѦЯклТтЯа", (byte)13, 68);
                    NLoginCore_009.var_java_lang_String_arr_b[1] = NLoginCore_027.C("ѐяЭыУбеаёѐЩђљіњѓлНЦѧлѨЯа", (byte)13, 67);
                    NLoginCore_009.var_java_lang_String_arr_b[2] = NLoginCore_384.F("ԸԮԼԵԟԜԙӿԪԃԌԠԣԗԧԱԯԩԑԿԬԟԜԝ", (byte)13, 70);
                    NLoginCore_009.var_java_lang_String_arr_b[3] = NLoginCore_559.D("жіЍїзЙафхозЭюяпКихихѕѨЯа", (byte)13, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_009.var_java_lang_String_arr_b[0] = NLoginCore_451.C("іечРгхиЭкћЫшѕѠдѤМњОёѤтЯа", (byte)13, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_009.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ааєаЪбЗьђмКМѢвѤЛѢџѡѥїѨЯа", (byte)13, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_009.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("яѱѳѓѷҖҎҤҐџҝғҡқѤ҉ҫҪҢҨҢѷ", (byte)38, 68), NLoginCore_009.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߰߳߻߯߮߷ߑ߶߶߳߶ߞѾ", (byte)38, 68) + string + NLoginCore_223.B("ą", (byte)38, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 64 >>> 132 | 64 << -132;
        var_int_b = 0 >>> 14 | 0 << ~14 + 1;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0x400000 >>> 53 | 0x400000 << -53;
        e = Integer.reverse(-1073741824);
        f = (0x40000000 >>> 124 | 0x40000000 << -124) & 0xFFFFFFFF;
        g = Integer.reverse(0x20000000);
        h = 0 >>> 129 | 0 << ~129 + 1;
        i = Integer.reverse(-1);
        j = Long.reverse(7653931637321130392L);
        k = 0 >>> 56 | 0 << -56;
        l = (32 >>> 69 | 32 << -69) & 0xFFFFFFFF;
        m = Long.reverse(7653931637321130392L);
        n = 0x800000 >>> 215 | 0x800000 << ~215 + 1;
        o = Integer.reverse(0x40000000);
        p = Long.reverse(7653931637321130392L);
        q = Integer.reverse(0x40000000);
        r = Integer.reverse(-1073741824);
        s = Long.reverse(-4884089725278330472L);
        t = Long.reverse(-3026418949592973312L);
        u = (0x18000000 >>> 123 | 0x18000000 << -123) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_009.b();
        var_com_nickuc_login_NLoginCore_009_a = new NLoginCore_009();
        var_com_nickuc_login_NLoginCore_009_b = new NLoginCore_009();
        var_com_nickuc_login_NLoginCore_009_c = new NLoginCore_009();
        var_com_nickuc_login_NLoginCore_009_d = new NLoginCore_009();
        var_com_nickuc_login_NLoginCore_009_arr_a = NLoginCore_009.a();
    }

    public static NLoginCore_009 valueOf(String string) {
        return Enum.valueOf(NLoginCore_009.class, string);
    }

    private static String a(int n, long l) {
        l ^= 0x6BL;
        l ^= 0xB7BCB7E258A0FCDBL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(34 + 35), (byte)(27 + 56), (byte)(10 + 37), (byte)(34 + 33), (byte)(17 + 49), (byte)(9 + 58), (byte)(9 + 38), (byte)(4 + 76), (byte)(69 + 6), 67, (byte)(46 + 37), (byte)(48 + 5), (byte)(31 + 49), (byte)(90 + 7), 100, (byte)(75 + 25), (byte)(46 + 59), (byte)(11 + 99), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ս֊։Ռ֌ֈփ֌֗ֆՓ֑֕֎֑֗ՙࣣࣦ࣮࣢࣡࣪ࣄࣩࣩࣦࣩ࣑", (byte)119, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_009.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static /* synthetic */ NLoginCore_009[] a() {
        NLoginCore_009[] NLoginCore_009Array = new NLoginCore_009[var_int_a];
        NLoginCore_009Array[NLoginCore_009.var_int_b] = var_com_nickuc_login_NLoginCore_009_a;
        NLoginCore_009Array[NLoginCore_009.var_int_c] = var_com_nickuc_login_NLoginCore_009_b;
        NLoginCore_009Array[NLoginCore_009.var_int_d] = var_com_nickuc_login_NLoginCore_009_c;
        NLoginCore_009Array[NLoginCore_009.e] = var_com_nickuc_login_NLoginCore_009_d;
        return NLoginCore_009Array;
    }

    public static NLoginCore_009[] values() {
        return (NLoginCore_009[])var_com_nickuc_login_NLoginCore_009_arr_a.clone();
    }
}

