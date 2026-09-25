/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_429
implements Cloneable {
    private static int h;
    private static int var_int_c;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_a;
    private String bG;
    static NLoginCore_429 var_com_nickuc_login_NLoginCore_429_b;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private String bF;
    private static int var_int_a;
    private static long g;
    private int af;
    private TimeUnit var_java_util_concurrent_TimeUnit_a;
    private static long d;
    private static int var_int_b;
    private static int e;

    @Generated
    public NLoginCore_429(String string, String string2, TimeUnit timeUnit, int n) {
        this.bF = string;
        this.bG = string2;
        this.var_java_util_concurrent_TimeUnit_a = timeUnit;
        this.af = n;
    }

    @Generated
    public NLoginCore_429 a(int n) {
        this.af = n;
        return this;
    }

    @Generated
    public NLoginCore_429 b(String string) {
        this.bG = string;
        return this;
    }

    static {
        var_int_a = (0x400000 >>> 117 | 0x400000 << ~117 + 1) & 0xFFFFFFFF;
        var_int_b = (4096 >>> 139 | 4096 << ~139 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-3040907170101238456L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (-1 >>> 122 | -1 << ~122 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-3040907170101238456L);
        h = 0x600000 >>> 85 | 0x600000 << -85;
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_429.b();
        var_com_nickuc_login_NLoginCore_429_b = new NLoginCore_429((String)NLoginCore_429.c("㺀", (int)var_int_c, (long)d), (String)NLoginCore_429.c("㺃", (int)(e & f), (long)g), TimeUnit.MILLISECONDS, h);
    }

    static /* synthetic */ String b(NLoginCore_429 NLoginCore_4292) {
        return NLoginCore_4292.bG;
    }

    @Generated
    public NLoginCore_429 a(String string) {
        this.bF = string;
        return this;
    }

    private static void b() {
        int n;
        var_long_c = 1343960354209739714L;
        long l = var_long_c ^ 0xEF365DB05A969897L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(30 + 39), (byte)(15 + 68), 47, (byte)(39 + 28), (byte)(12 + 54), (byte)(55 + 12), (byte)(21 + 26), (byte)(32 + 48), (byte)(11 + 64), (byte)(9 + 58), (byte)(60 + 23), (byte)(5 + 48), (byte)(49 + 31), (byte)(13 + 84), (byte)(5 + 95), (byte)(3 + 97), (byte)(66 + 39), 110, (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_429.var_java_lang_String_arr_b[0] = NLoginCore_384.E("աԸՐհիՠը՟ժԷՂկճլչՌԺ՝ԹԺԾիՀ՞ԿևեՁփոոպծլՍՏ՝կ՜ե՞յոո֕Ս֝֊՜֐֙֌֋՞֥աֆբզպ֕դբեժլչ֭ֈփքևֆַքս", (byte)57, 69);
                    NLoginCore_429.var_java_lang_String_arr_b[1] = NLoginCore_324.E("ԭժՠԭբխԫՕԾՇդգջ՚ՌժյԾ՚՜ՔձՈՉ", (byte)57, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_429.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ŝĴŌŬŧŜŤśŦĳľūůŨŵňĶřĵĶĺŧļŚĻƃšĽſŴŴŶŪŨŉŋřūŘšŚűŴŴƑŉƙƆŘƌƕƈƇŚơŝƂŞŢŶƑŠŞšƘŧŧŻƗƉƤƄŲƨƈŹ", (byte)57, 65);
                    NLoginCore_429.var_java_lang_String_arr_b[1] = NLoginCore_446.A("ĩŦŜĩŞũħőĺŃŠŝĲįŃŚŒśĵĺŋſŪĽşŲőŶƅņƀŖ", (byte)57, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_429.var_java_lang_String_arr_b[0] = NLoginCore_324.E("զԼԿա՜ՒմՀՓէՆԳգՎծՏվՋ՛չ՚ցՈՉ", (byte)57, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_429.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ҴҴӓҜҴӉӟӁұӏҾӎҤҮӀҹӀӉӇӊҶӀӇӬӝӦӳӏӯӍӌӊ", (byte)57, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x69L;
        l ^= 0xEF365DB05A969897L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(41 + 42), (byte)(46 + 1), (byte)(3 + 64), (byte)(6 + 60), (byte)(50 + 17), (byte)(27 + 20), (byte)(42 + 38), (byte)(69 + 6), (byte)(34 + 33), (byte)(49 + 34), 53, (byte)(3 + 77), (byte)(42 + 55), (byte)(92 + 8), (byte)(52 + 48), (byte)(38 + 67), (byte)(94 + 16), (byte)(41 + 62)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҰӇӅҵҕҶӆҫӆӋ", (byte)55, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_429.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static /* synthetic */ int int_a(NLoginCore_429 NLoginCore_4292) {
        return NLoginCore_4292.af;
    }

    static /* synthetic */ TimeUnit java_util_concurrent_TimeUnit_a(NLoginCore_429 NLoginCore_4292) {
        return NLoginCore_4292.var_java_util_concurrent_TimeUnit_a;
    }

    @Generated
    public NLoginCore_429 a(TimeUnit timeUnit) {
        this.var_java_util_concurrent_TimeUnit_a = timeUnit;
        return this;
    }

    public static NLoginCore_429 a() {
        try {
            return (NLoginCore_429)var_com_nickuc_login_NLoginCore_429_b.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    static /* synthetic */ String java_lang_String_a(NLoginCore_429 NLoginCore_4292) {
        return NLoginCore_4292.bF;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_429.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.D("ѹқҝѽҡӀҸӎҺ҉ӇҽӋӅҎҳӕӔӌӒӌҡ", (byte)52, 68), NLoginCore_429.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ҴӁӀ҃ӃҿҺӃӎҽҊӈӌӅӈӎҐࠔࠫࠩ࠙߹ࠚࠪࠏࠪ࠯Ҧ", (byte)52, 68) + string + NLoginCore_201.A("ġ", (byte)52, 65) + methodType.toString(), exception);
        }
    }
}

