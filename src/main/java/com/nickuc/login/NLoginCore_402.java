/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_020;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_086;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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
import lombok.Generated;

class NLoginCore_402 {
    private final String W;
    private static long f;
    private static long l;
    private static long x;
    private static int z;
    private static int e;
    private static long g;
    private static int q;
    private final String V;
    private static int o;
    private static String[] var_java_lang_String_arr_a;
    private final NLoginCore_020 var_com_nickuc_login_NLoginCore_020_a;
    private static long p;
    private static int k;
    private final int t;
    private static int var_int_a;
    private static long i;
    private static int h;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;
    private static int u;
    private static long m;
    private static long s;
    private static long r;
    private static int aa;
    private static long y;
    private static long d;
    private static long c;
    private static long v;
    private final String X;
    private final String T;
    private static long j;
    private final String U;
    private static int w;
    private static int n;

    private static String a(int n, long l) {
        l ^= 0x36L;
        l ^= 0x102F69A5B09864DFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(26 + 43), (byte)(78 + 5), (byte)(31 + 16), 67, (byte)(40 + 26), (byte)(28 + 39), (byte)(10 + 37), (byte)(64 + 16), (byte)(73 + 2), (byte)(41 + 26), (byte)(57 + 26), (byte)(3 + 50), (byte)(35 + 45), (byte)(89 + 8), (byte)(55 + 45), (byte)(44 + 56), 105, (byte)(3 + 107), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѹѶѩѿ҂ѸѭѐљѥѶѧ҃ѿ", (byte)19, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_402.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    NLoginCore_402(NLoginCore_020 NLoginCore_0202, String string, String string2, String string3, String string4, int n, String string5) {
        this.var_com_nickuc_login_NLoginCore_020_a = NLoginCore_0202;
        this.T = string;
        this.U = string2;
        this.V = string3;
        this.W = string4;
        this.t = n;
        this.X = string5;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_402.c("㺀", (int)(var_int_a & var_int_b), (long)d) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_020_a) + (String)NLoginCore_402.c("㺃", (int)e, (long)(f ^ g)) + this.T + (String)NLoginCore_402.c("㺆", (int)h, (long)(i ^ j)) + this.U + (String)NLoginCore_402.c("㺉", (int)k, (long)(l ^ m)) + this.V + (String)NLoginCore_402.c("㺌", (int)(n & o), (long)p) + this.W + (String)NLoginCore_402.c("㺏", (int)q, (long)(r ^ s)) + this.t + (String)NLoginCore_402.c("㺒", (int)u, (long)v) + this.X + (String)NLoginCore_402.c("㺕", (int)w, (long)(x ^ y));
    }

    static /* synthetic */ String b(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.T;
    }

    static /* synthetic */ String c(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.V;
    }

    static /* synthetic */ int int_a(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.t;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_402.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_402.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("ՉՖՕԘ՘ՔՏ՘գՒԟ՝ա՚՝գԥࢺࢷࢪࣀࣃࢹࢮ࢑࢚ࢦࢷࢨࣄࣀԿ", (byte)42, 69) + string + NLoginCore_076.E("Ԡ", (byte)42, 69) + methodType.toString(), exception);
        }
    }

    static /* synthetic */ NLoginCore_020 com_nickuc_login_NLoginCore_020_a(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.var_com_nickuc_login_NLoginCore_020_a;
    }

    static /* synthetic */ String d(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.W;
    }

    static /* synthetic */ String e(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.X;
    }

    static /* synthetic */ String java_lang_String_a(NLoginCore_402 NLoginCore_4022) {
        return NLoginCore_4022.U;
    }

    static {
        var_int_a = 0 >>> 162 | 0 << ~162 + 1;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(4656773120370751182L);
        e = (8192 >>> 205 | 8192 << ~205 + 1) & 0xFFFFFFFF;
        f = Long.reverse(3215621239612192462L);
        g = Long.reverse(0x6C00000000000000L);
        h = (2048 >>> 42 | 2048 << -42) & 0xFFFFFFFF;
        i = Long.reverse(3215621239612192462L);
        j = Long.reverse(0x6C00000000000000L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(3215621239612192462L);
        m = Long.reverse(0x6C00000000000000L);
        n = Integer.reverse(0x20000000);
        o = -1 >>> 227 | -1 << ~227 + 1;
        p = Long.reverse(4656773120370751182L);
        q = 5120 >>> 10 | 5120 << ~10 + 1;
        r = Long.reverse(3215621239612192462L);
        s = Long.reverse(0x6C00000000000000L);
        u = Integer.reverse(0x60000000);
        v = Long.reverse(4656773120370751182L);
        w = (0xE000000 >>> 121 | 0xE000000 << ~121 + 1) & 0xFFFFFFFF;
        x = Long.reverse(3215621239612192462L);
        y = Long.reverse(0x6C00000000000000L);
        z = Integer.reverse(0x10000000);
        aa = (8192 >>> 106 | 8192 << ~106 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[z];
        var_java_lang_String_arr_b = new String[aa];
        NLoginCore_402.b();
    }

    private static void b() {
        int n;
        c = 8317184168625964340L;
        long l = c ^ 0x102F69A5B09864DFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(30 + 39), 83, (byte)(17 + 30), (byte)(23 + 44), (byte)(41 + 25), (byte)(12 + 55), (byte)(26 + 21), 80, (byte)(25 + 50), (byte)(12 + 55), (byte)(35 + 48), (byte)(8 + 45), (byte)(25 + 55), (byte)(35 + 62), (byte)(45 + 55), (byte)(31 + 69), (byte)(28 + 77), (byte)(75 + 35), (byte)(55 + 48)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(29 + 54)}, StandardCharsets.UTF_8));
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
                    NLoginCore_402.var_java_lang_String_arr_b[0] = NLoginCore_138.E("լհբ֔կ֐օ֋Ֆկն֍֗ղչ֧֦֝շնջ֗չքծժ֛կրִ֔֟֒շոփֳջ֊մև֑ղׁ֖րֿ֮ցֳրֹּׂ֐֑", (byte)97, 69);
                    NLoginCore_402.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ԇԒԝԫԕ԰Ձ՘ԪՓՍԭՈԝԱԬՙԞԾ՟ԜԾԫԬ", (byte)97, 68);
                    NLoginCore_402.var_java_lang_String_arr_b[2] = NLoginCore_092.F("ն֍֐գ֛ծևըֈրոե", (byte)97, 70);
                    NLoginCore_402.var_java_lang_String_arr_b[3] = NLoginCore_446.C("Ԩ԰ՀԟՉԣԟԵԓՙԫԠ", (byte)97, 67);
                    NLoginCore_402.var_java_lang_String_arr_b[4] = NLoginCore_201.D("ԣԝՏԨՎԟԑԫԋԖԔԘԪՆԸԛԷԽԲԼՑդԫԬ", (byte)97, 68);
                    NLoginCore_402.var_java_lang_String_arr_b[5] = NLoginCore_324.B("ŴźƻƾŰƑƮƯžƤǂƉ", (byte)97, 66);
                    NLoginCore_402.var_java_lang_String_arr_b[6] = NLoginCore_027.D("ՎՁԬԿԢՃՑԒԙ՚ԖԠ", (byte)97, 68);
                    NLoginCore_402.var_java_lang_String_arr_b[7] = NLoginCore_223.F("Ֆղքևչ՘հջ֔֗֞ե", (byte)97, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_402.var_java_lang_String_arr_b[0] = NLoginCore_324.E("լհբ֔կ֐օ֋Ֆկն֍֗ղչ֧֦֝շնջ֗չքծժ֛կրִ֔֟֒շոփֳջ֊մև֑տ֊ֹ֝֡սք׃ֿ֞׈ֹ֐֑", (byte)97, 69);
                    NLoginCore_402.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ԇԒԝԫԕ԰Ձ՘ԪՓՍԯԜԨԮԳ՗ԢԜ԰՞ՔԫԬ", (byte)97, 68);
                    NLoginCore_402.var_java_lang_String_arr_b[2] = NLoginCore_446.B("ųűƥƵŰƞŲƪǁƀƍżƙƁƝƼǁǅƕƉƌƗƔƕ", (byte)97, 66);
                    NLoginCore_402.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ԙԲԾ԰ԪԶՍԫՖ՛ՔԤԙ՟ԴՙԠԟՄԝԟԾԫԬ", (byte)97, 67);
                    NLoginCore_402.var_java_lang_String_arr_b[4] = NLoginCore_427.A("ƌƆƸƑƷƈźƔŴſŽƥưƘƳǂƧƓǈƾƅƗƔƕ", (byte)97, 65);
                    NLoginCore_402.var_java_lang_String_arr_b[5] = NLoginCore_384.E("֏֔չՓՐ՛ղ՘՘ըղսյյխՠ֑՞֥գ֪ճհձ", (byte)97, 69);
                    NLoginCore_402.var_java_lang_String_arr_b[6] = NLoginCore_004.C("ՏՉԛՒԕԈՎՀՄԬԼՐՓ՗՚ԲԬՋ՗բ՛դԫԬ", (byte)97, 67);
                    NLoginCore_402.var_java_lang_String_arr_b[7] = NLoginCore_201.C("ԲՉԴԬՁԎԯՆՈԴՙԠ", (byte)97, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_402.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƇƷƒƌƓƩƟƊǃƭƵƟƲǀƵƘƇƢƈƺƸƗƔƕ", (byte)97, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_402.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ՍԩԓԠԥԎ՗ԶՅԵԹՒ՚ԱԚՐԚՐՁՓԢՔԫԬ", (byte)97, 67);
                }
            }
        }
    }

    @Generated
    public static NLoginCore_086 a() {
        return new NLoginCore_086();
    }
}

