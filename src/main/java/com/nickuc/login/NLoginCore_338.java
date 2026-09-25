/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

public final class NLoginCore_338
extends Enum<NLoginCore_338> {
    public static final /* enum */ NLoginCore_338 var_com_nickuc_login_NLoginCore_338_a;
    public static final /* enum */ NLoginCore_338 var_com_nickuc_login_NLoginCore_338_b;
    public static final /* enum */ NLoginCore_338 var_com_nickuc_login_NLoginCore_338_c;
    public static final /* enum */ NLoginCore_338 var_com_nickuc_login_NLoginCore_338_d;
    public static final /* enum */ NLoginCore_338 var_com_nickuc_login_NLoginCore_338_e;
    private static final /* synthetic */ NLoginCore_338[] var_com_nickuc_login_NLoginCore_338_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int var_int_e;
    private static int f;
    private static long g;
    private static int h;
    private static long i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static long s;
    private static int t;
    private static int u;
    private static long v;
    private static long w;
    private static int x;
    private static int y;
    private static int z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static long ah;
    private static int ai;

    public static NLoginCore_338 valueOf(String string) {
        return Enum.valueOf(NLoginCore_338.class, string);
    }

    public String e(String string) {
        switch (this.ordinal()) {
            case 0: {
                return (String)NLoginCore_338.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d) + string;
            }
            case 1: {
                return (String)NLoginCore_338.c("㺃", (int)(var_int_e & f), (long)g) + string;
            }
            case 2: {
                return (String)NLoginCore_338.c("㺆", (int)h, (long)i) + string;
            }
        }
        return string;
    }

    private static String a(int n, long l) {
        l ^= 0x71L;
        l ^= 0xBFF1A367BC7AB180L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(25 + 44), (byte)(81 + 2), (byte)(45 + 2), (byte)(4 + 63), 66, (byte)(62 + 5), (byte)(16 + 31), (byte)(13 + 67), (byte)(58 + 17), (byte)(11 + 56), (byte)(20 + 63), (byte)(38 + 15), (byte)(46 + 34), 97, (byte)(96 + 4), (byte)(72 + 28), (byte)(80 + 25), (byte)(57 + 53), (byte)(22 + 81)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.E("Ս՚ՙԜ՜՘Փ՜էՖԣաե՞աէԩ࢖ࢳࢮࢸࣇࢨࢸࣀࢺ", (byte)46, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_338.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    private NLoginCore_338() {
    }

    private static void b() {
        int n;
        var_long_c = 7956129555380721412L;
        long l = var_long_c ^ 0xBFF1A367BC7AB180L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(11 + 58), (byte)(53 + 30), (byte)(10 + 37), (byte)(46 + 21), (byte)(11 + 55), 67, (byte)(24 + 23), (byte)(41 + 39), (byte)(13 + 62), (byte)(5 + 62), (byte)(76 + 7), (byte)(18 + 35), (byte)(71 + 9), (byte)(62 + 35), (byte)(27 + 73), 100, (byte)(103 + 2), (byte)(23 + 87), (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
                    NLoginCore_338.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԺնշՆթՖցսժՕ՘Չ", (byte)69, 69);
                    NLoginCore_338.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ӍӓԀԁӑӹӽҶӶԁӴԄӲӜӦӽԎԍԉӹӪӚӗӘ", (byte)69, 68);
                    NLoginCore_338.var_java_lang_String_arr_b[2] = NLoginCore_559.C("ӌӴҵӓҽӍӽӴӡҼԃҾԁӨӾԋӖӷӪӭӏԀӗӘ", (byte)69, 67);
                    NLoginCore_338.var_java_lang_String_arr_b[3] = NLoginCore_027.D("ӵӐӑӀӞҼӢӀӄҼӓӌ", (byte)69, 68);
                    NLoginCore_338.var_java_lang_String_arr_b[4] = NLoginCore_559.C("ӇӝӴӾӭӐӟӵәӺӹӌ", (byte)69, 67);
                    NLoginCore_338.var_java_lang_String_arr_b[5] = NLoginCore_027.C("ӯӳӺӉӖӪӣӠӂӘӓӌ", (byte)69, 67);
                    NLoginCore_338.var_java_lang_String_arr_b[6] = NLoginCore_076.F("ՏԱղշՆ՜՗ԷծշվՉ", (byte)69, 70);
                    NLoginCore_338.var_java_lang_String_arr_b[7] = NLoginCore_004.B("ŞŞŔŎŝŔŗŸŢŊŠő", (byte)69, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_338.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ĺĻœƄůŘőƇŇšŔő", (byte)69, 66);
                    NLoginCore_338.var_java_lang_String_arr_b[1] = NLoginCore_027.D("ӍӓԀԁӑӹӽҶӶԁӱԂӨҼӥԇӕӀӸӼԐӚӗӘ", (byte)69, 68);
                    NLoginCore_338.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ՉձԲՐԺՊպձ՞Թտշտ՚պՔ՜զժբս՗ՔՕ", (byte)69, 69);
                    NLoginCore_338.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ŶŀńŤŮŴňşţżŕŕƂŋƏŊŢţŰƓŐůŜŝ", (byte)69, 66);
                    NLoginCore_338.var_java_lang_String_arr_b[4] = NLoginCore_004.C("ӾӋӓӡӿӗӖӞӳӜӜӚӅӸӧӄӦӌӹԃԋԐӗӘ", (byte)69, 67);
                    NLoginCore_338.var_java_lang_String_arr_b[5] = NLoginCore_453.C("ӴӵӌӊӰӻӚӃӭӲӥԉӕԄӴӛԈӼӹӇӮӪӗӘ", (byte)69, 67);
                    NLoginCore_338.var_java_lang_String_arr_b[6] = NLoginCore_092.B("ůōōŻœŅŠœŗśşşŽƄŠşƂŲƈſŵůŜŝ", (byte)69, 66);
                    NLoginCore_338.var_java_lang_String_arr_b[7] = NLoginCore_223.A("ĹžŀŒŚƂŜňƂŅŤżšŇōōŻŠƆŴŭůŜŝ", (byte)69, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_338.var_java_lang_String_arr_b[0] = NLoginCore_384.E("Ե՜՝ԸԸ՝ՑԺճՎսՕյԹԾպՅգգ֍ք՗ՔՕ", (byte)69, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_338.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ՃՙՐ՜նՇ՞՞մափճնբմղ֋գՉՄտէՔՕ", (byte)69, 70);
                }
            }
        }
    }

    private static /* synthetic */ NLoginCore_338[] a() {
        NLoginCore_338[] NLoginCore_338Array = new NLoginCore_338[j];
        NLoginCore_338Array[NLoginCore_338.k] = var_com_nickuc_login_NLoginCore_338_a;
        NLoginCore_338Array[NLoginCore_338.l] = var_com_nickuc_login_NLoginCore_338_b;
        NLoginCore_338Array[NLoginCore_338.m] = var_com_nickuc_login_NLoginCore_338_c;
        NLoginCore_338Array[NLoginCore_338.n] = var_com_nickuc_login_NLoginCore_338_d;
        NLoginCore_338Array[NLoginCore_338.o] = var_com_nickuc_login_NLoginCore_338_e;
        return NLoginCore_338Array;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = (-1 >>> 138 | -1 << ~138 + 1) & 0xFFFFFFFF;
        var_long_d = Long.reverse(-5842805912236222858L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        f = -1 >>> 213 | -1 << ~213 + 1;
        g = Long.reverse(-5842805912236222858L);
        h = 0x8000000 >>> 250 | 0x8000000 << ~250 + 1;
        i = Long.reverse(-5842805912236222858L);
        j = 320 >>> 198 | 320 << ~198 + 1;
        k = Integer.reverse(0);
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Integer.reverse(0x40000000);
        n = Integer.reverse(-1073741824);
        o = (65536 >>> 110 | 65536 << ~110 + 1) & 0xFFFFFFFF;
        p = (65536 >>> 205 | 65536 << -205) & 0xFFFFFFFF;
        q = 0x10000000 >>> 89 | 0x10000000 << ~89 + 1;
        r = Integer.reverse(-1073741824);
        s = Long.reverse(-5842805912236222858L);
        t = 0 >>> 192 | 0 << ~192 + 1;
        u = Integer.reverse(0x20000000);
        v = Long.reverse(2371759808087561846L);
        w = Long.reverse(-8214565720323784704L);
        x = 0x8000000 >>> 155 | 0x8000000 << ~155 + 1;
        y = Integer.reverse(-1610612736);
        z = Integer.reverse(-1);
        aa = Long.reverse(-5842805912236222858L);
        ab = (256 >>> 39 | 256 << -39) & 0xFFFFFFFF;
        ac = (196608 >>> 15 | 196608 << ~15 + 1) & 0xFFFFFFFF;
        ad = Long.reverse(-5842805912236222858L);
        ae = 0x300000 >>> 180 | 0x300000 << ~180 + 1;
        af = (0xE000000 >>> 57 | 0xE000000 << ~57 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(2371759808087561846L);
        ah = Long.reverse(-8214565720323784704L);
        ai = 1024 >>> 8 | 1024 << ~8 + 1;
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_338.b();
        var_com_nickuc_login_NLoginCore_338_a = new NLoginCore_338();
        var_com_nickuc_login_NLoginCore_338_b = new NLoginCore_338();
        var_com_nickuc_login_NLoginCore_338_c = new NLoginCore_338();
        var_com_nickuc_login_NLoginCore_338_d = new NLoginCore_338();
        var_com_nickuc_login_NLoginCore_338_e = new NLoginCore_338();
        var_com_nickuc_login_NLoginCore_338_arr_a = NLoginCore_338.a();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_338.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 65), NLoginCore_338.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ĊėĖÙęĕĐęĤēàĞĢěĞĤæѓѰѫѵ҄ѥѵѽѷû", (byte)20, 66) + string + NLoginCore_076.E("Ԋ", (byte)20, 69) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_338[] values() {
        return (NLoginCore_338[])var_com_nickuc_login_NLoginCore_338_arr_a.clone();
    }
}

