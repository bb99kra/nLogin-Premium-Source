/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_020;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_402;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
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

@Generated
public class NLoginCore_086 {
    private static long f;
    @Generated
    private String var_java_lang_String_s;
    private static long r;
    private static long y;
    private static long var_long_b;
    private static long i;
    private static int e;
    @Generated
    private String T;
    private static int k;
    private static int aa;
    private static int var_int_a;
    private static long j;
    private static int w;
    private static long c;
    private static int n;
    private static long o;
    private static long d;
    @Generated
    private NLoginCore_020 var_com_nickuc_login_NLoginCore_020_a;
    private static long p;
    private static long g;
    private static int u;
    @Generated
    private int t;
    private static long l;
    @Generated
    private String X;
    private static long m;
    @Generated
    private String V;
    private static int q;
    private static String[] var_java_lang_String_arr_b;
    private static long x;
    private static long v;
    private static int var_int_s;
    private static int h;
    private static String[] var_java_lang_String_arr_a;
    private static int z;
    @Generated
    private String U;

    @Generated
    public NLoginCore_086 d(String string) {
        this.var_java_lang_String_s = string;
        return this;
    }

    @Generated
    public NLoginCore_086 c(String string) {
        this.V = string;
        return this;
    }

    @Generated
    public NLoginCore_086 a(NLoginCore_020 NLoginCore_0202) {
        this.var_com_nickuc_login_NLoginCore_020_a = NLoginCore_0202;
        return this;
    }

    static {
        var_int_a = (0 >>> 105 | 0 << -105) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-7435424456220289670L);
        d = Long.reverse(-7205759403792793600L);
        e = (131072 >>> 81 | 131072 << -81) & 0xFFFFFFFF;
        f = Long.reverse(-7435424456220289670L);
        g = Long.reverse(-7205759403792793600L);
        h = 4096 >>> 171 | 4096 << ~171 + 1;
        i = Long.reverse(-7435424456220289670L);
        j = Long.reverse(-7205759403792793600L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-7435424456220289670L);
        m = Long.reverse(-7205759403792793600L);
        n = 16 >>> 34 | 16 << ~34 + 1;
        o = Long.reverse(-7435424456220289670L);
        p = Long.reverse(-7205759403792793600L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(346795699875927418L);
        var_int_s = Integer.reverse(0x60000000);
        u = -1 >>> 39 | -1 << ~39 + 1;
        v = Long.reverse(346795699875927418L);
        w = 0x700000 >>> 84 | 0x700000 << -84;
        x = Long.reverse(-7435424456220289670L);
        y = Long.reverse(-7205759403792793600L);
        z = 0x400000 >>> 19 | 0x400000 << -19;
        aa = (128 >>> 100 | 128 << -100) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[z];
        var_java_lang_String_arr_b = new String[aa];
        NLoginCore_086.b();
    }

    @Generated
    NLoginCore_086() {
    }

    @Generated
    public NLoginCore_086 a(int n) {
        this.t = n;
        return this;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_086.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_020_a) + (String)NLoginCore_086.c("㺃", (int)e, (long)(f ^ g)) + this.T + (String)NLoginCore_086.c("㺆", (int)h, (long)(i ^ j)) + this.U + (String)NLoginCore_086.c("㺉", (int)k, (long)(l ^ m)) + this.V + (String)NLoginCore_086.c("㺌", (int)n, (long)(o ^ p)) + this.var_java_lang_String_s + (String)NLoginCore_086.c("㺏", (int)q, (long)r) + this.t + (String)NLoginCore_086.c("㺒", (int)(var_int_s & u), (long)v) + this.X + (String)NLoginCore_086.c("㺕", (int)w, (long)(x ^ y));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_086.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("Ѥ҆҈ѨҌҫңҹҥѴҲҨҶҰѹҞӀҿҷҽҷҌ", (byte)45, 67), NLoginCore_086.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.F("Ռՙ՘ԛ՛՗Ւ՛զՕԢՠդ՝ՠզԨࢶࢷࣂࢳࢿࣃࢳࣀࢺࣁࣆࣁࢯՁ", (byte)45, 70) + string + NLoginCore_138.B("ē", (byte)45, 66) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_086 e(String string) {
        this.X = string;
        return this;
    }

    @Generated
    public NLoginCore_086 b(String string) {
        this.U = string;
        return this;
    }

    @Generated
    public NLoginCore_086 a(String string) {
        this.T = string;
        return this;
    }

    private static String a(int n, long l) {
        l ^= 0x39L;
        l ^= 0x21213EE454EF6869L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(65 + 4), (byte)(49 + 34), (byte)(34 + 13), (byte)(7 + 60), (byte)(34 + 32), 67, (byte)(15 + 32), (byte)(33 + 47), (byte)(21 + 54), (byte)(23 + 44), (byte)(50 + 33), (byte)(16 + 37), (byte)(62 + 18), (byte)(91 + 6), 100, (byte)(28 + 72), (byte)(9 + 96), (byte)(47 + 63), (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߇߈ߓ߄ߐߔ߄ߑߋߒߗߒ߀", (byte)23, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_086.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_402 a() {
        return new NLoginCore_402(this.var_com_nickuc_login_NLoginCore_020_a, this.T, this.U, this.V, this.var_java_lang_String_s, this.t, this.X);
    }

    private static void b() {
        int n;
        c = 6821613269758249753L;
        long l = c ^ 0x21213EE454EF6869L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), 69, 83, (byte)(13 + 34), (byte)(38 + 29), (byte)(32 + 34), (byte)(57 + 10), (byte)(16 + 31), (byte)(61 + 19), (byte)(28 + 47), (byte)(41 + 26), (byte)(70 + 13), (byte)(26 + 27), (byte)(30 + 50), (byte)(68 + 29), (byte)(92 + 8), (byte)(42 + 58), (byte)(3 + 102), (byte)(56 + 54), (byte)(52 + 51)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
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
                    NLoginCore_086.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ÈĀýÝąďæąÍÎôďÕåčĕĘÒēÔùØû÷ėÛìĥąüāąýĪĭČç÷îįêăēĊîéĕùėİĈĉĳñďĵĒļĹığĘĄĹķĸėĠĹćĘŎņŅĮĠįņĲĴĐĚĭĻĩķĤĥ", (byte)9, 65);
                    NLoginCore_086.var_java_lang_String_arr_b[1] = NLoginCore_384.B("ĄÆçăçÏÐĂĊÓĈĔĐĂĊêěĆēĔéčäå", (byte)9, 66);
                    NLoginCore_086.var_java_lang_String_arr_b[2] = NLoginCore_446.D("хвЇЈНЙЪЧтцэИ", (byte)9, 68);
                    NLoginCore_086.var_java_lang_String_arr_b[3] = NLoginCore_427.D("ЉФгЊжМомвщёИ", (byte)9, 68);
                    NLoginCore_086.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ϻгЁЉЋмймМяНФбЍиСтХѕдяжУФ", (byte)9, 67);
                    NLoginCore_086.var_java_lang_String_arr_b[5] = NLoginCore_324.F("ԵԒӽԓԖԋԮԘՁԾՂԍ", (byte)9, 70);
                    NLoginCore_086.var_java_lang_String_arr_b[6] = NLoginCore_201.F("ӹԖԓԠԁӾԬԖՇԸԺԍ", (byte)9, 70);
                    NLoginCore_086.var_java_lang_String_arr_b[7] = NLoginCore_004.B("ÞĄÿÄèèĀäÄÉĆÙ", (byte)9, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_086.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ЇпмМфюХфЌЍгюДФьєїБђГиЗкжіКЫѤфлрфмѩѬыЦжЭѮЩтђщЭШєиіѯчшѲаюѴёѻѸѰўїуѸѶѷіџѸцїҍ҅҄ѭѤѯ҄ѸҌѺѶѰѦѧҜѣѤ", (byte)9, 67);
                    NLoginCore_086.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ĄÆçăçÏÐĂĊÓĈéîāÎĐôïÒéěçäå", (byte)9, 65);
                    NLoginCore_086.var_java_lang_String_arr_b[2] = NLoginCore_091.B("åØúċýËäÑÈÜëýéàÕČíûæĉýčäå", (byte)9, 66);
                    NLoginCore_086.var_java_lang_String_arr_b[3] = NLoginCore_223.D("лчодЋыЪкцЩєпдѓїЩїЭћЩИќУФ", (byte)9, 68);
                    NLoginCore_086.var_java_lang_String_arr_b[4] = NLoginCore_453.A("¼ôÂÊÌýúýÝĐÞĐÖăęĎĄĎĄþìçäå", (byte)9, 65);
                    NLoginCore_086.var_java_lang_String_arr_b[5] = NLoginCore_427.A("âÂċÈÞìÛĉÍßâĖĊêèñéćêĈç÷äå", (byte)9, 65);
                    NLoginCore_086.var_java_lang_String_arr_b[6] = NLoginCore_559.B("àĀËÌÞäíòâþðÏĊöĈāÌĈùĝþçäå", (byte)9, 66);
                    NLoginCore_086.var_java_lang_String_arr_b[7] = NLoginCore_110.A("āćýÝčþĈæĒĆĆÙ", (byte)9, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_086.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԐԪԳԴӺԺӼԍԢԶԇԍ", (byte)9, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_086.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ІвФЈнНЉрЌьПИ", (byte)9, 68);
                }
            }
        }
    }
}

