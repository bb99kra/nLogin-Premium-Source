/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
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

public final class NLoginCore_244
extends Enum<NLoginCore_244> {
    public static final /* enum */ NLoginCore_244 var_com_nickuc_login_NLoginCore_244_a;
    public static final /* enum */ NLoginCore_244 var_com_nickuc_login_NLoginCore_244_b;
    public static final /* enum */ NLoginCore_244 var_com_nickuc_login_NLoginCore_244_c;
    public static final /* enum */ NLoginCore_244 var_com_nickuc_login_NLoginCore_244_d;
    private static final /* synthetic */ NLoginCore_244[] var_com_nickuc_login_NLoginCore_244_arr_a;
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
    private static long n;
    private static int o;
    private static int p;
    private static long q;
    private static long r;
    private static int s;
    private static int t;
    private static long u;
    private static int v;

    public static NLoginCore_244[] values() {
        return (NLoginCore_244[])var_com_nickuc_login_NLoginCore_244_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_244.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.A("¹ÛÝ½áĀøĎúÉćýċąÎóĕĔČĒČá", (byte)9, 65), NLoginCore_244.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("ԨԵԴӷԷԳԮԷՂԱӾԼՀԹԼՂԄ࢛ࡺࢉࡴࢠࡾࢡࢤࢁ࢘ࢠࢪ࢞ԝ", (byte)9, 70) + string + NLoginCore_092.C("Њ", (byte)9, 67) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_244 valueOf(String string) {
        return Enum.valueOf(NLoginCore_244.class, string);
    }

    private static void b() {
        int n;
        var_long_c = 4900024078420719981L;
        long l = var_long_c ^ 0xD3E2EFC443DFD96L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(47 + 22), 83, (byte)(11 + 36), (byte)(9 + 58), (byte)(31 + 35), 67, (byte)(8 + 39), (byte)(24 + 56), (byte)(28 + 47), (byte)(26 + 41), (byte)(20 + 63), (byte)(17 + 36), (byte)(64 + 16), (byte)(88 + 9), (byte)(66 + 34), (byte)(31 + 69), (byte)(60 + 45), (byte)(54 + 56), (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
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
                    NLoginCore_244.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ęøĚýüĄĖéĀĆüñ", (byte)21, 65);
                    NLoginCore_244.var_java_lang_String_arr_b[1] = NLoginCore_446.E("ԤԨԊՃՌՎԝԃՓԐՊՂԴԕԥՙԻԸԵԭԴՍԤԥ", (byte)21, 69);
                    NLoginCore_244.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ëĎóğěġĒþĠĆãñ", (byte)21, 66);
                    NLoginCore_244.var_java_lang_String_arr_b[3] = NLoginCore_138.E("ԺԨԞՈԝԢԼՏ԰ԢԬԙ", (byte)21, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_244.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ýģěĚćïçğöęùúāçÿýĳĢìĭĔĵüý", (byte)21, 65);
                    NLoginCore_244.var_java_lang_String_arr_b[1] = NLoginCore_324.B("üĀâěĤĦõÛīèģßèČêĨĐēİĕóĵüý", (byte)21, 66);
                    NLoginCore_244.var_java_lang_String_arr_b[2] = NLoginCore_110.D("ѨќышцѧцѦЫђїЮїѮжќшѨќпѮҀчш", (byte)21, 68);
                    NLoginCore_244.var_java_lang_String_arr_b[3] = NLoginCore_173.F("ԓՅӾՇԢԨՂՆԒԬՓԨԳՋԘՈԺՃԯ԰ԯԧԤԥ", (byte)21, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_244.var_java_lang_String_arr_b[0] = NLoginCore_387.E("ԥԾԈԙԝԆԂԟԫԑՌՆԣԠԗԗԙՕԴ՞ԻԷԤԥ", (byte)21, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_244.var_java_lang_String_arr_b[0] = NLoginCore_451.D("щэѪЪыяѳрыыѩм", (byte)21, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 4L;
        l ^= 0xD3E2EFC443DFD96L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(61 + 8), (byte)(54 + 29), (byte)(8 + 39), (byte)(7 + 60), (byte)(23 + 43), (byte)(60 + 7), (byte)(29 + 18), (byte)(45 + 35), (byte)(23 + 52), 67, (byte)(3 + 80), (byte)(21 + 32), (byte)(73 + 7), (byte)(43 + 54), (byte)(13 + 87), (byte)(99 + 1), (byte)(34 + 71), (byte)(63 + 47), (byte)(9 + 94)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("ԤԱ԰ӳԳԯԪԳԾԭӺԸԼԵԸԾԀࢗࡶࢅࡰ࢜ࡺ࢝ࢠࡽ࢔࢜ࢦ࢚", (byte)5, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_244.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (128 >>> 101 | 128 << ~101 + 1) & 0xFFFFFFFF;
        var_int_b = 0 >>> 165 | 0 << ~165 + 1;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = Integer.reverse(0x40000000);
        e = (196608 >>> 240 | 196608 << -240) & 0xFFFFFFFF;
        f = Integer.reverse(0x20000000);
        g = (524288 >>> 177 | 524288 << -177) & 0xFFFFFFFF;
        h = (0 >>> 175 | 0 << ~175 + 1) & 0xFFFFFFFF;
        i = -1 >>> 107 | -1 << ~107 + 1;
        j = Long.reverse(-7593908345534808030L);
        k = 0 >>> 253 | 0 << ~253 + 1;
        l = (512 >>> 41 | 512 << -41) & 0xFFFFFFFF;
        m = Long.reverse(-5288065336321114078L);
        n = Long.reverse(0x2000000000000000L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Integer.reverse(0x40000000);
        q = Long.reverse(-5288065336321114078L);
        r = Long.reverse(0x2000000000000000L);
        s = Integer.reverse(0x40000000);
        t = (0x1800000 >>> 215 | 0x1800000 << -215) & 0xFFFFFFFF;
        u = Long.reverse(-7593908345534808030L);
        v = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_244.b();
        var_com_nickuc_login_NLoginCore_244_a = new NLoginCore_244();
        var_com_nickuc_login_NLoginCore_244_b = new NLoginCore_244();
        var_com_nickuc_login_NLoginCore_244_c = new NLoginCore_244();
        var_com_nickuc_login_NLoginCore_244_d = new NLoginCore_244();
        var_com_nickuc_login_NLoginCore_244_arr_a = NLoginCore_244.a();
    }

    private static /* synthetic */ NLoginCore_244[] a() {
        NLoginCore_244[] NLoginCore_244Array = new NLoginCore_244[var_int_a];
        NLoginCore_244Array[NLoginCore_244.var_int_b] = var_com_nickuc_login_NLoginCore_244_a;
        NLoginCore_244Array[NLoginCore_244.var_int_c] = var_com_nickuc_login_NLoginCore_244_b;
        NLoginCore_244Array[NLoginCore_244.var_int_d] = var_com_nickuc_login_NLoginCore_244_c;
        NLoginCore_244Array[NLoginCore_244.e] = var_com_nickuc_login_NLoginCore_244_d;
        return NLoginCore_244Array;
    }
}

