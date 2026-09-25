/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_498
implements Filter {
    private static int o;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int var_int_b;
    private static int n;
    private static int var_int_a;
    private static int var_int_c;
    private static long g;
    private static int k;
    private static long j;
    private static int p;
    private static int d;
    private static int h;
    private boolean ac;
    private static final Object[] var_java_lang_Object_arr_c;
    private final Filter var_java_util_logging_Filter_a;
    private static int i;
    private static int l;
    private static String[] var_java_lang_String_arr_b;
    private static long f;
    private static int m;
    private static long var_long_c;

    private static String a(int n, long l) {
        l ^= 0x5BL;
        l ^= 0xF14856C8B5F18EE0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(27 + 42), (byte)(67 + 16), (byte)(9 + 38), (byte)(62 + 5), (byte)(64 + 2), (byte)(6 + 61), (byte)(34 + 13), (byte)(17 + 63), (byte)(22 + 53), 67, (byte)(29 + 54), (byte)(39 + 14), 80, (byte)(48 + 49), (byte)(80 + 20), (byte)(96 + 4), (byte)(101 + 4), (byte)(107 + 3), (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҕҦҦҪҮҢҺҸҬ҉ҊҸҵҷҾ", (byte)46, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_498.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (2 >>> 65 | 2 << -65) & 0xFFFFFFFF;
        var_int_b = 0 >>> 155 | 0 << ~155 + 1;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = 0 >>> 44 | 0 << -44;
        e = Integer.reverse(0);
        f = Long.reverse(6328939591602276655L);
        g = Long.reverse(-2738188573441261568L);
        h = (0 >>> 169 | 0 << -169) & 0xFFFFFFFF;
        i = 1 >>> 128 | 1 << ~128 + 1;
        j = Long.reverse(-8226694404059166417L);
        k = 0 >>> 1 | 0 << ~1 + 1;
        l = 4 >>> 130 | 4 << -130;
        m = Integer.reverse(0);
        n = 256 >>> 71 | 256 << -71;
        o = (262144 >>> 17 | 262144 << ~17 + 1) & 0xFFFFFFFF;
        p = (0 >>> 156 | 0 << ~156 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_498.b();
        var_java_lang_Object_arr_c = new Object[p];
    }

    private static void b() {
        int n;
        var_long_c = -824094670751061014L;
        long l = var_long_c ^ 0xF14856C8B5F18EE0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(23 + 60), (byte)(41 + 6), (byte)(21 + 46), (byte)(6 + 60), (byte)(48 + 19), (byte)(42 + 5), (byte)(73 + 7), (byte)(54 + 21), (byte)(10 + 57), (byte)(19 + 64), 53, (byte)(44 + 36), (byte)(55 + 42), (byte)(65 + 35), (byte)(61 + 39), (byte)(99 + 6), (byte)(16 + 94), (byte)(25 + 78)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
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
                    NLoginCore_498.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ҰӅӋұӊӴӖӖӘүӹӪӴҷӾӃӰӼӁӤԀԉԄԇӾөԆӽөԀӾӉӪӌӿӥԐӱԔӯӼԗӭԗӝӠӮӕӹԣӝԤԥӤӳӹԬӪԚԬԏԎԌԳ", (byte)66, 67);
                    NLoginCore_498.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ŅŲŦŪŞĳŘŐŖķŜŒŴŃŝŦņŤŖŨƃŌŭŠŜŋƉƏŲƍŢżŸŔŦŕƠƑŷŢƙųŝū", (byte)66, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_498.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ĸōœĹŒżŞŞŠķƁŲżĿƆŋŸƄŉŬƈƑƌƏƆűƎƅűƈƆőŲŔƇŭƘŹƜŷƄƟŵƟťŨŶŝƁƫťƬƭŰƳƏƍƌƆƓƤŵƑƌ", (byte)66, 66);
                    NLoginCore_498.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ŅŲŦŪŞĳŘŐŖķŜŒŴŃŝŦņŤŖŨƃŌŭŠŜŋƉƏŲƍŢżūŬŴŴŚƚƐƁŹƝžū", (byte)66, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_498.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ŊťşĻŖƁŐŵŃżżŨŃŒŵƈżňŊŇŬřŖŗ", (byte)66, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_498.var_java_lang_String_arr_b[0] = NLoginCore_091.F("եբկդԵդԸջԼՒնչՍ՟նաղՕՂՃ֋՝՛Մռչ֏ժխվֆե", (byte)66, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_498.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("ӄӦӨӈӬԋԃԙԅӔԒԈԖԐәӾԠԟԗԝԗӬ", (byte)77, 67), NLoginCore_498.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡖࡧࡧ࡫࡯ࡣࡻࡹ࡭ࡊࡋࡹࡶࡸࡿӶ", (byte)77, 67) + string + NLoginCore_451.A("œ", (byte)77, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_498(Filter filter) {
        this.var_java_util_logging_Filter_a = filter;
    }

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        if (logRecord == null || logRecord.getMessage() == null || this.ac) {
            return (this.var_java_util_logging_Filter_a == null || this.var_java_util_logging_Filter_a.isLoggable(logRecord) ? var_int_a : var_int_b) != 0;
        }
        Object[] objectArray = logRecord.getParameters();
        if (NLoginCore_370.d().stream().noneMatch(NLoginInterface_016 -> {
            try {
                return NLoginInterface_016.filter(logRecord.getLoggerName(), logRecord.getMessage(), objectArray == null ? var_java_lang_Object_arr_c : objectArray);
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)NLoginCore_498.c("㺀", (int)i, (long)j), throwable, new Object[k]);
                this.ac = l;
                return m != 0;
            }
        })) {
            return (this.var_java_util_logging_Filter_a == null || this.var_java_util_logging_Filter_a.isLoggable(logRecord) ? var_int_c : d) != 0;
        }
        logRecord.setMessage((String)NLoginCore_498.c("㺀", (int)e, (long)(f ^ g)));
        return h != 0;
    }
}

