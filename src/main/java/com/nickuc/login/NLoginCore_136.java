/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
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

public class NLoginCore_136 {
    public static final String ck;
    public static final String cl;
    private static int o;
    private static int g;
    public static final int an;
    public static final int at;
    private static int s;
    private static int e;
    private static int q;
    private static int var_int_a;
    private static long l;
    private static int d;
    private static int m;
    private static int p;
    public static final int as;
    private static int n;
    private static long f;
    public static final int au;
    public static final int ar;
    public static final int av;
    private static int k;
    private static long var_long_c;
    public static final String cj;
    private static int var_int_b;
    private static int var_int_c;
    public static final int ap;
    private static int r;
    public static final int aq;
    private static long i;
    private static int j;
    private static String[] var_java_lang_String_arr_b;
    public static final int ao;
    private static String[] var_java_lang_String_arr_a;
    private static long h;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_136.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.F("ӴԖԘӸԜԻԳՉԵԄՂԸՆՀԉԮՐՏՇՍՇԜ", (byte)16, 70), NLoginCore_136.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("ĂďĎÑđčĈđĜċØĖĚēĖĜÞѢѶѲцѷѪѲѮò", (byte)16, 66) + string + NLoginCore_427.F("Ԇ", (byte)16, 70) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 3L;
        l ^= 0xFCF228BB5F2FF46EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(60 + 9), (byte)(21 + 62), (byte)(36 + 11), (byte)(7 + 60), (byte)(51 + 15), 67, (byte)(15 + 32), (byte)(50 + 30), (byte)(4 + 71), (byte)(31 + 36), (byte)(48 + 35), (byte)(22 + 31), (byte)(34 + 46), (byte)(14 + 83), (byte)(81 + 19), (byte)(21 + 79), 105, (byte)(34 + 76), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("ŨŵŴķŷųŮŷƂűľżƀŹżƂńӈӜӘҬӝӐӘӔ", (byte)67, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_136.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0x1800000 >>> 55 | 0x1800000 << -55) & 0xFFFFFFFF;
        var_int_b = (0x60000000 >>> 157 | 0x60000000 << ~157 + 1) & 0xFFFFFFFF;
        var_int_c = -1 >>> 78 | -1 << -78;
        d = Integer.reverse(0);
        e = -1 >>> 224 | -1 << -224;
        f = Long.reverse(5597267065567692908L);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-8237790989714470804L);
        i = Long.reverse(-4611686018427387904L);
        j = 16 >>> 226 | 16 << -226;
        k = (0x800000 >>> 86 | 0x800000 << -86) & 0xFFFFFFFF;
        l = Long.reverse(5597267065567692908L);
        m = Integer.reverse(0x40000000);
        n = 5120 >>> 106 | 5120 << -106;
        o = Integer.reverse(0x60000000);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Integer.reverse(-1073741824);
        r = 7168 >>> 138 | 7168 << -138;
        s = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_136.b();
        an = var_int_c;
        cj = NLoginCore_136.c("㺀", (int)(d & e), (long)f);
        ck = NLoginCore_136.c("㺃", (int)g, (long)(h ^ i));
        as = j;
        cl = NLoginCore_136.c("㺆", (int)k, (long)l);
        aq = m;
        at = n;
        au = o;
        ap = p;
        ar = q;
        av = r;
        ao = s;
    }

    private static void b() {
        int n;
        var_long_c = 3896708970525406641L;
        long l = var_long_c ^ 0xFCF228BB5F2FF46EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(46 + 23), (byte)(64 + 19), (byte)(7 + 40), (byte)(3 + 64), (byte)(34 + 32), (byte)(43 + 24), (byte)(44 + 3), (byte)(7 + 73), (byte)(74 + 1), (byte)(31 + 36), 83, 53, (byte)(67 + 13), (byte)(27 + 70), (byte)(25 + 75), (byte)(89 + 11), (byte)(14 + 91), (byte)(99 + 11), (byte)(94 + 9)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_136.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԞՍեՀ՚՟զԵԺՂՊԳ", (byte)47, 70);
                    NLoginCore_136.var_java_lang_String_arr_b[1] = NLoginCore_559.D("Ұ҆ҎѶҨҖҋҞӀҴүҊ", (byte)47, 68);
                    NLoginCore_136.var_java_lang_String_arr_b[2] = NLoginCore_559.C("ңҲҷҎҕҋҽӂҼҙҁҵ҆ҒҤҵҸҶҙӀҿҘҕҖ", (byte)47, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_136.var_java_lang_String_arr_b[0] = NLoginCore_138.C("һҐҰґҝѸҡҮѾҞҗҴҝҙһҗ҅ҪһҿӈҨҕҖ", (byte)47, 67);
                    NLoginCore_136.var_java_lang_String_arr_b[1] = NLoginCore_384.F("ԴՅԽՕ՝՚ՄԝԫՌՉ՗Ԩ԰եՂԯբՁՌԷՑԾԿ", (byte)47, 70);
                    NLoginCore_136.var_java_lang_String_arr_b[2] = NLoginCore_027.E("Ռ՛ՠԷԾԴզիեՂԪՀՎլՑԭՇԲՒԵեէԾԿ", (byte)47, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_136.var_java_lang_String_arr_b[0] = NLoginCore_076.C("ѷҗѵѹҔҗҕҍҷҜҴҐӄңҤ҄ҾҿӋһҮҘҕҖ", (byte)47, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_136.var_java_lang_String_arr_b[0] = NLoginCore_076.F("՝ԿդզԚԳէգԤծՎհԩՊԩԪՏԲՁՏզթՕժՇծոԽ՜ցՍ՛", (byte)47, 70);
                }
            }
        }
    }
}

