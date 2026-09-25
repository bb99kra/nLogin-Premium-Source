/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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
import lombok.Generated;

public final class NLoginCore_443
extends Enum<NLoginCore_443> {
    public static final /* enum */ NLoginCore_443 var_com_nickuc_login_NLoginCore_443_a;
    public static final /* enum */ NLoginCore_443 var_com_nickuc_login_NLoginCore_443_b;
    public static final /* enum */ NLoginCore_443 var_com_nickuc_login_NLoginCore_443_c;
    public static final /* enum */ NLoginCore_443 var_com_nickuc_login_NLoginCore_443_d;
    private final boolean aA;
    private static final /* synthetic */ NLoginCore_443[] var_com_nickuc_login_NLoginCore_443_arr_a;
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
    private static long i;
    private static long j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static long o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static long t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;
    private static int aa;

    private static String a(int n, long l) {
        l ^= 0x29L;
        l ^= 0x305C800CEA0C29A1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(56 + 13), (byte)(14 + 69), (byte)(26 + 21), (byte)(39 + 28), (byte)(32 + 34), (byte)(3 + 64), (byte)(31 + 16), (byte)(7 + 73), (byte)(40 + 35), (byte)(56 + 11), (byte)(55 + 28), (byte)(37 + 16), 80, (byte)(41 + 56), (byte)(98 + 2), (byte)(95 + 5), (byte)(66 + 39), (byte)(103 + 7), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.E("։֖֕՘֘֔֏֣֘֒՟֣֚֝֡֝եࣰ࣮ࣶ࣪࣡ࣼࣵँ࣒ࣾ", (byte)106, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_443.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0x20000000);
        var_int_b = 0 >>> 77 | 0 << ~77 + 1;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = (2048 >>> 234 | 2048 << -234) & 0xFFFFFFFF;
        e = Integer.reverse(-1073741824);
        f = Integer.MIN_VALUE >>> 157 | Integer.MIN_VALUE << ~157 + 1;
        g = Integer.reverse(0x20000000);
        h = Integer.reverse(0);
        i = Long.reverse(-1120393984565815365L);
        j = Long.reverse(-7782220156096217088L);
        k = Integer.reverse(0);
        l = 0x2000000 >>> 217 | 0x2000000 << ~217 + 1;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = (-1 >>> 152 | -1 << ~152 + 1) & 0xFFFFFFFF;
        o = Long.reverse(7238286923833825211L);
        p = 131072 >>> 241 | 131072 << -241;
        q = Integer.reverse(0);
        r = 32 >>> 100 | 32 << -100;
        s = (-1 >>> 42 | -1 << -42) & 0xFFFFFFFF;
        t = Long.reverse(7238286923833825211L);
        u = Integer.reverse(0x40000000);
        v = (0 >>> 193 | 0 << ~193 + 1) & 0xFFFFFFFF;
        w = Integer.reverse(-1073741824);
        x = Integer.reverse(-1);
        y = Long.reverse(7238286923833825211L);
        z = Integer.reverse(-1073741824);
        aa = (0 >>> 149 | 0 << ~149 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_443.b();
        var_com_nickuc_login_NLoginCore_443_a = new NLoginCore_443(l != 0);
        var_com_nickuc_login_NLoginCore_443_b = new NLoginCore_443(q != 0);
        var_com_nickuc_login_NLoginCore_443_c = new NLoginCore_443(v != 0);
        var_com_nickuc_login_NLoginCore_443_d = new NLoginCore_443(aa != 0);
        var_com_nickuc_login_NLoginCore_443_arr_a = NLoginCore_443.a();
    }

    private static void b() {
        int n;
        var_long_c = -2456116876087800305L;
        long l = var_long_c ^ 0x305C800CEA0C29A1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(7 + 62), (byte)(57 + 26), (byte)(37 + 10), (byte)(12 + 55), (byte)(2 + 64), (byte)(32 + 35), (byte)(17 + 30), 80, (byte)(27 + 48), (byte)(29 + 38), (byte)(13 + 70), 53, (byte)(44 + 36), (byte)(63 + 34), (byte)(35 + 65), (byte)(52 + 48), (byte)(90 + 15), (byte)(82 + 28), (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
                    NLoginCore_443.var_java_lang_String_arr_b[0] = NLoginCore_091.C("жϻкЕРϴсгЭГУЌ", (byte)5, 67);
                    NLoginCore_443.var_java_lang_String_arr_b[1] = NLoginCore_027.C("ЇϰЋϸЛЭϺТМϼИЖвыЇНЃмНМлѐЗИ", (byte)5, 67);
                    NLoginCore_443.var_java_lang_String_arr_b[2] = NLoginCore_091.A("Êú¼ĂąâèĊçāĂÑ", (byte)5, 65);
                    NLoginCore_443.var_java_lang_String_arr_b[3] = NLoginCore_027.A("íïą¿×úāßâ×ÔÑ", (byte)5, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_443.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ӳԯԩԊӽԐԵԮԟԟӿԉ", (byte)5, 69);
                    NLoginCore_443.var_java_lang_String_arr_b[1] = NLoginCore_324.F("ԄӭԈӵԘԪӷԟԙӹԖԳԿԤԇԩՋԷԧԾՋԧԔԕ", (byte)5, 70);
                    NLoginCore_443.var_java_lang_String_arr_b[2] = NLoginCore_173.D("ЩЌзжнЏЏрцЏНЙЧПеЗϿиыЉУЪЗИ", (byte)5, 68);
                    NLoginCore_443.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ϵϵвЙнϸЂпϼрСбЇЇУЉНчЉшНѐЗИ", (byte)5, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_443.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԚӭԻԾԸӱԎԾԠԓԮԉ", (byte)5, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_443.var_java_lang_String_arr_b[0] = NLoginCore_092.B("ÀăÜÿÓÂþÁø÷öÉâÞåÊäåĔÏÏĕÜÝ", (byte)5, 66);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_443.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 66), NLoginCore_443.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("ѯѼѻоѾѺѵѾ҉Ѹх҃҇Ҁ҃҉ыߔߐ߇ߢߜߖߛߧ޸ߤѡ", (byte)29, 67) + string + NLoginCore_092.B("ó", (byte)29, 66) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_443(boolean bl) {
        this.aA = bl;
    }

    static /* synthetic */ boolean a(NLoginCore_443 NLoginCore_4432) {
        return NLoginCore_4432.aA;
    }

    private static /* synthetic */ NLoginCore_443[] a() {
        NLoginCore_443[] NLoginCore_443Array = new NLoginCore_443[var_int_a];
        NLoginCore_443Array[NLoginCore_443.var_int_b] = var_com_nickuc_login_NLoginCore_443_a;
        NLoginCore_443Array[NLoginCore_443.var_int_c] = var_com_nickuc_login_NLoginCore_443_b;
        NLoginCore_443Array[NLoginCore_443.var_int_d] = var_com_nickuc_login_NLoginCore_443_c;
        NLoginCore_443Array[NLoginCore_443.e] = var_com_nickuc_login_NLoginCore_443_d;
        return NLoginCore_443Array;
    }

    public static NLoginCore_443[] values() {
        return (NLoginCore_443[])var_com_nickuc_login_NLoginCore_443_arr_a.clone();
    }

    public static NLoginCore_443 valueOf(String string) {
        return Enum.valueOf(NLoginCore_443.class, string);
    }
}

