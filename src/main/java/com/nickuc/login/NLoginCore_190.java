/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_190 {
    private static String[] var_java_lang_String_arr_b;
    private static long j;
    private static int i;
    private static long d;
    private final String bU;
    private static String[] var_java_lang_String_arr_a;
    private static long f;
    private static int l;
    private static long var_long_b;
    private static int var_int_a;
    @Nullable
    private final String bV;
    private static long c;
    private static int e;
    private static long g;
    private static int k;
    private static int h;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7707785996585942102L);
        d = Long.reverse(0x3000000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-7707785996585942102L);
        g = Long.reverse(0x3000000000000000L);
        h = (4 >>> 33 | 4 << -33) & 0xFFFFFFFF;
        i = Integer.reverse(-1);
        j = Long.reverse(-6554864491979095126L);
        k = Integer.reverse(-1073741824);
        l = 196608 >>> 16 | 196608 << ~16 + 1;
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_190.b();
    }

    @Generated
    public NLoginCore_190(String string, @Nullable String string2) {
        this.bU = string;
        this.bV = string2;
    }

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0x11A5BE2DB043264L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(34 + 35), (byte)(77 + 6), 47, (byte)(60 + 7), (byte)(53 + 13), (byte)(54 + 13), (byte)(16 + 31), (byte)(21 + 59), (byte)(9 + 66), (byte)(60 + 7), (byte)(74 + 9), (byte)(11 + 42), (byte)(57 + 23), 97, (byte)(82 + 18), (byte)(45 + 55), (byte)(98 + 7), (byte)(79 + 31), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), (byte)(54 + 29)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("ԩԶԵӸԸԴԯԸՃԲӿԽՁԺԽՃԅ࢒࢐ࢂ࢐࢔ࡿࡱ࢓ࡳ࢘ࢥ࢔", (byte)10, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_190.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String ar() {
        return this.bU;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_190.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + this.ar() + (String)NLoginCore_190.c("㺃", (int)e, (long)(f ^ g)) + this.as() + (String)NLoginCore_190.c("㺆", (int)(h & i), (long)j);
    }

    private static void b() {
        int n;
        c = 6179997667138867369L;
        long l = c ^ 0x11A5BE2DB043264L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(51 + 18), (byte)(18 + 65), (byte)(4 + 43), (byte)(35 + 32), (byte)(46 + 20), (byte)(66 + 1), (byte)(2 + 45), (byte)(5 + 75), (byte)(28 + 47), (byte)(57 + 10), (byte)(49 + 34), (byte)(10 + 43), (byte)(8 + 72), (byte)(74 + 23), (byte)(4 + 96), (byte)(14 + 86), (byte)(81 + 24), (byte)(31 + 79), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_190.var_java_lang_String_arr_b[0] = NLoginCore_173.D("ԺԺԠՋԎՁԯԷԖԓԬԚՇՖ՜ՙ՛ԾԚՠՔԱԝԞԟ՚ԼգԻԾ՗լԪձԾդՑ՗շՆաղզՍՅԻՠկՖՊփՙօմՋՌ", (byte)97, 68);
                    NLoginCore_190.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ԼԟՌԿԾՀՏԴԘԑՙԖԻԗՍԟՋաՄԵՔդԫԬ", (byte)97, 68);
                    NLoginCore_190.var_java_lang_String_arr_b[2] = NLoginCore_091.C("ՇՍԴԥԔԳԗԡԬՊԚԠ", (byte)97, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_190.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ƣƣƉƴŷƪƘƠſżƕƃưƿǅǂǄƧƃǉƽƚƆƇƈǃƥǌƤƧǀǕƓǚƧǍƺǀǠƯǊǛǏǁǞǦǠǘƿƻǔǥǩǭƴƵ", (byte)97, 65);
                    NLoginCore_190.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ƥƈƵƨƧƩƸƝƁźǄƕǂƐƞƂƳǅƴǀƣƗƔƕ", (byte)97, 65);
                    NLoginCore_190.var_java_lang_String_arr_b[2] = NLoginCore_427.F("ժգՓեՙչ֘ժմս֒ե", (byte)97, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_190.var_java_lang_String_arr_b[0] = NLoginCore_110.F("Ւ՗գ֋իթ՘ճ՚էխ֏ս֤վգ֛֑֖֥֣֓֓֌֘փ֑֙տ֯օֱ", (byte)97, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_190.var_java_lang_String_arr_b[0] = NLoginCore_559.E("գաօՙՑՒպ֘ռ֋ջթն՟֟֡՟ե֣րշճհձ", (byte)97, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_190.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.B("Óõ÷×ûĚĒĨĔãġėĥğèčįĮĦĬĦû", (byte)22, 66), NLoginCore_190.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.C("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж߃߁޳߁߅ްޢ߄ޤ߉ߖ߅ю", (byte)22, 67) + string + NLoginCore_324.D("б", (byte)22, 68) + methodType.toString(), exception);
        }
    }

    @Nullable
    @Generated
    public String as() {
        return this.bV;
    }
}

