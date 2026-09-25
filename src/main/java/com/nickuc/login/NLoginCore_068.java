/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_548;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginCore_068 {
    private static int j;
    private static long u;
    private static int s;
    private static int var_int_b;
    private static long l;
    private static long x;
    private static int ae;
    private static int var_int_a;
    private static int d;
    private static long k;
    private static String[] var_java_lang_String_arr_a;
    private static int p;
    private static long e;
    private static int n;
    private static int o;
    private static long ab;
    private static int q;
    private static int w;
    private static int ac;
    private static long h;
    private static long i;
    private static long t;
    private static long r;
    private static int ad;
    private static int m;
    private static int g;
    private static long f;
    private static String[] var_java_lang_String_arr_b;
    private static long y;
    private static int v;
    private static long var_long_c;
    private static int z;
    private static long aa;
    private static int var_int_c;

    private static String a(int n, long l) {
        l ^= 5L;
        l ^= 0x401CB32FBD2A8CE0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(27 + 42), (byte)(46 + 37), (byte)(20 + 27), (byte)(35 + 32), (byte)(22 + 44), (byte)(30 + 37), (byte)(4 + 43), (byte)(38 + 42), (byte)(38 + 37), (byte)(16 + 51), (byte)(75 + 8), (byte)(42 + 11), (byte)(60 + 20), 97, 100, (byte)(46 + 54), (byte)(74 + 31), (byte)(98 + 12), (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࡎࡆࠜࡃࠪࡎࡉࡍ", (byte)64, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_068.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -1386670313671005753L;
        long l = var_long_c ^ 0x401CB32FBD2A8CE0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(20 + 63), (byte)(14 + 33), (byte)(30 + 37), (byte)(26 + 40), (byte)(41 + 26), (byte)(36 + 11), (byte)(51 + 29), 75, (byte)(39 + 28), (byte)(41 + 42), (byte)(34 + 19), (byte)(68 + 12), (byte)(47 + 50), (byte)(64 + 36), (byte)(22 + 78), (byte)(71 + 34), (byte)(8 + 102), (byte)(56 + 47)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_068.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ååíëðäÏöâéÛĊĈĘĜĘĠöðĢĢäĀ÷āĜėĦĄĎĄĨ", (byte)13, 65);
                    NLoginCore_068.var_java_lang_String_arr_b[1] = NLoginCore_027.B("äċÑäâĐïâĔåÓØčúČúĒìāĠúãĝãāùĔĄùèāĩýûôôĞēĀĭĂĔĜøİĚđĵĀĮĂ÷ĦĨģĒĸŌėčĤľıŅďĲĭľŁĦĭœŐŘėġ", (byte)13, 66);
                    NLoginCore_068.var_java_lang_String_arr_b[2] = NLoginCore_384.F("ӺԍӺԟԕԖՉՃԾԥԶԑ", (byte)13, 70);
                    NLoginCore_068.var_java_lang_String_arr_b[3] = NLoginCore_110.C("ЎЎяИАїВЬјћнмЩњЭмТцћеСвЯа", (byte)13, 67);
                    NLoginCore_068.var_java_lang_String_arr_b[4] = NLoginCore_092.B("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàßģãéĬċíĤáĨĤ", (byte)13, 66);
                    NLoginCore_068.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ËËČÕÍĔÏéĕĘúùæėêùßăĘòÞïìí", (byte)13, 65);
                    NLoginCore_068.var_java_lang_String_arr_b[6] = NLoginCore_575.E("ԠԸԚԀԛԐԾԇԴՂԺԥՄԥԹԡԍԜԧՌԐԏՓԓԙ՜ԻԝՔԑ՘Ք", (byte)13, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_068.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ԕԕԝԛԠԔӿԦԒԙԋԺԸՈՌՈՐԦԠՒՒԓԔԳՓԥՈԗԯ՗ԸՑ", (byte)13, 69);
                    NLoginCore_068.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ԔԻԁԔԒՀԟԒՄԕԃԈԽԪԼԪՂԜԱՐԪԓՍԓԱԩՄԴԩԘԱՙԭԫԤԤՎՃ԰՝ԲՄՌԨՠՊՁե԰՞ԲԧՖ՘ՓՂըռՇԽՔծայղ՛մՁեմև՚ՆՅֆՑ", (byte)13, 70);
                    NLoginCore_068.var_java_lang_String_arr_b[2] = NLoginCore_384.D("ГАјРЏЦуЖэИЫФ", (byte)13, 68);
                    NLoginCore_068.var_java_lang_String_arr_b[3] = NLoginCore_427.D("ЎЎяИАїВЬјћоюКћЫижєјиштЯа", (byte)13, 68);
                    NLoginCore_068.var_java_lang_String_arr_b[4] = NLoginCore_223.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàâçđüýãĘĈĪĪČ", (byte)13, 65);
                    NLoginCore_068.var_java_lang_String_arr_b[5] = NLoginCore_384.F("ӻӻԼԅӽՄӿԙՅՈԪԼԚՎՉԣԞԡՓԴԞՅԜԝ", (byte)13, 70);
                    NLoginCore_068.var_java_lang_String_arr_b[6] = NLoginCore_384.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàåęûĒĖĥĩĉĠîą", (byte)13, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_068.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ԵԢԤԚԐՇԄԑԇԄԂԄԄՉԎՊԾԓԎԵԫԯԜԝ", (byte)13, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_068.var_java_lang_String_arr_b[0] = NLoginCore_004.C("УпЫЊИЌэИоЭЬЪЗДОйЮРООкџШньљѠуѲџѳѦ", (byte)13, 67);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(NLoginType_008 NLoginType_008, String string, String string2, ForceRegisterConfig ForceRegisterConfig2) {
        boolean bl;
        if (string == null || string2 == null) {
            return var_int_a != 0;
        }
        long l = System.nanoTime();
        NLoginCore_566 NLoginCore_5662 = BCryptHashProvider.com_nickuc_login_NLoginCore_566_b();
        int n = var_int_b;
        try {
            boolean bl2;
            int bl22 = var_int_c;
            NLoginCore_566 NLoginCore_5663 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_566_a();
            if (NLoginCore_5663 == null) {
                NLoginCore_370.c((String)NLoginCore_068.c("㺀", (int)d, (long)(e ^ f)) + ForceRegisterConfig2.i() + (String)NLoginCore_068.c("㺃", (int)g, (long)(h ^ i)) + string2 + (String)NLoginCore_068.c("㺆", (int)j, (long)(k ^ NLoginCore_068.l)), new Object[m]);
            } else {
                bl2 = NLoginCore_5663.com_nickuc_login_NLoginInterface_009_a().boolean_i(string, string2);
            }
            if (bl2) {
                n = NLoginCore_5663 != NLoginCore_5662 || NLoginCore_5663.com_nickuc_login_NLoginInterface_009_a().v(string2) ? NLoginCore_068.n : o;
            }
            bl = bl2;
        }
        catch (Throwable throwable) {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_l, l);
            if (n != 0) {
                NLoginCore_370.b((String)NLoginCore_068.c("㺏", (int)w, (long)(x ^ y)) + ForceRegisterConfig2.i() + (String)NLoginCore_068.c("㺒", (int)z, (long)(aa ^ ab)) + NLoginCore_5662.name(), new Object[ac]);
                NLoginType_008.com_nickuc_login_NLoginCore_291_a().c(ForceRegisterConfig2, string);
            }
            throw throwable;
        }
        NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_l, l);
        if (n != 0) {
            NLoginCore_370.b((String)NLoginCore_068.c("㺉", (int)(p & q), (long)r) + ForceRegisterConfig2.i() + (String)NLoginCore_068.c("㺌", (int)s, (long)(t ^ u)) + NLoginCore_5662.name(), new Object[v]);
            NLoginType_008.com_nickuc_login_NLoginCore_291_a().c(ForceRegisterConfig2, string);
        }
        return bl;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_068.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 66), NLoginCore_068.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶԐԈӞԅӬԐԋԏƊ", (byte)92, 66) + string + NLoginCore_201.A("ű", (byte)92, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 232 | 0 << ~232 + 1;
        var_int_b = (0 >>> 127 | 0 << ~127 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = 0 >>> 176 | 0 << ~176 + 1;
        e = Long.reverse(-2047184366358920393L);
        f = Long.reverse(-6917529027641081856L);
        g = 32 >>> 165 | 32 << -165;
        h = Long.reverse(-2047184366358920393L);
        i = Long.reverse(-6917529027641081856L);
        j = 16384 >>> 205 | 16384 << ~205 + 1;
        k = Long.reverse(-2047184366358920393L);
        l = Long.reverse(-6917529027641081856L);
        m = 0 >>> 70 | 0 << ~70 + 1;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = (0 >>> 11 | 0 << -11) & 0xFFFFFFFF;
        p = (0x18000000 >>> 155 | 0x18000000 << ~155 + 1) & 0xFFFFFFFF;
        q = -1 >>> 61 | -1 << ~61 + 1;
        r = Long.reverse(4870344661282161463L);
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-2047184366358920393L);
        u = Long.reverse(-6917529027641081856L);
        v = Integer.reverse(0);
        w = (0x50000000 >>> 60 | 0x50000000 << -60) & 0xFFFFFFFF;
        x = Long.reverse(-2047184366358920393L);
        y = Long.reverse(-6917529027641081856L);
        z = Integer.reverse(0x60000000);
        aa = Long.reverse(-2047184366358920393L);
        ab = Long.reverse(-6917529027641081856L);
        ac = Integer.reverse(0);
        ad = Integer.reverse(-536870912);
        ae = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_068.b();
    }
}

