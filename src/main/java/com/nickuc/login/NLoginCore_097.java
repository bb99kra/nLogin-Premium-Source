/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.core.Filter
 *  org.apache.logging.log4j.core.Filter$Result
 *  org.apache.logging.log4j.core.LogEvent
 *  org.apache.logging.log4j.core.Logger
 *  org.apache.logging.log4j.core.filter.AbstractFilter
 *  org.apache.logging.log4j.message.Message
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_575;
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
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.filter.AbstractFilter;
import org.apache.logging.log4j.message.Message;

public final class NLoginCore_097
extends AbstractFilter {
    private static int i;
    private static int j;
    private static final Object[] var_java_lang_Object_arr_b;
    private static int e;
    private static long d;
    private static int var_int_b;
    private static int var_int_a;
    private static int g;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int h;
    private static String[] var_java_lang_String_arr_a;
    private boolean ac;
    private static long c;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_097.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), NLoginCore_097.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.C("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծउࣔउं࣪ंंऍअࣼք", (byte)126, 67) + string + NLoginCore_091.B("Ƶ", (byte)126, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3EL;
        l ^= 0xE7A75DDD2A5BB695L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(3 + 66), (byte)(31 + 52), (byte)(12 + 35), 67, (byte)(19 + 47), (byte)(59 + 8), (byte)(41 + 6), (byte)(67 + 13), (byte)(60 + 15), (byte)(43 + 24), (byte)(10 + 73), (byte)(9 + 44), (byte)(50 + 30), (byte)(38 + 59), (byte)(95 + 5), (byte)(99 + 1), (byte)(88 + 17), (byte)(105 + 5), (byte)(101 + 2)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨê҅ѐ҅ѾѦѾѾ҉ҁѸ", (byte)22, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_097.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-8722982843324016484L);
        e = Integer.reverse(0);
        f = (16 >>> 132 | 16 << ~132 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = 4 >>> 2 | 4 << -2;
        j = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_097.b();
        var_java_lang_Object_arr_b = new Object[j];
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object ... objectArray) {
        return this.a(logger.getName(), string, objectArray);
    }

    private Filter.Result a(String string, String string2, Object[] objectArray) {
        return string2 != null && !this.ac && NLoginCore_370.d().stream().anyMatch(NLoginInterface_016 -> {
            try {
                return NLoginInterface_016.filter(string, string2, objectArray == null ? var_java_lang_Object_arr_b : objectArray);
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)NLoginCore_097.c("㺀", (int)(var_int_a & var_int_b), (long)d), throwable, new Object[e]);
                this.ac = f;
                return g != 0;
            }
        }) ? Filter.Result.DENY : Filter.Result.NEUTRAL;
    }

    public static void as() {
        Logger logger = (Logger)LogManager.getRootLogger();
        logger.addFilter((Filter)new NLoginCore_097());
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, Message message, Throwable throwable) {
        return this.a(logger.getName(), message, var_java_lang_Object_arr_b);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, Object object, Throwable throwable) {
        if (object == null) {
            return Filter.Result.NEUTRAL;
        }
        return this.a(logger.getName(), object.toString(), var_java_lang_Object_arr_b);
    }

    private static void b() {
        int n;
        c = 4114631447380070239L;
        long l = c ^ 0xE7A75DDD2A5BB695L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(20 + 49), (byte)(2 + 81), (byte)(9 + 38), 67, 66, (byte)(31 + 36), (byte)(6 + 41), (byte)(64 + 16), (byte)(45 + 30), (byte)(53 + 14), (byte)(13 + 70), (byte)(12 + 41), (byte)(7 + 73), (byte)(27 + 70), (byte)(50 + 50), (byte)(33 + 67), (byte)(27 + 78), (byte)(2 + 108), (byte)(93 + 10)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_097.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ыѾёѨҀѰођяѮѡѓцѓѹѿҍўѝ҂҂ѣѳ҄҃ѱѕҁҗ҂ґ҆҆ҊѮѶіҌҐѶҘҝѾѫ", (byte)26, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_097.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ûĮāĘİĠîĂÿĞđăöăĩįĽĎčĲĲēģĴĳġąıŇĲŁĶČċĞŉęěŎĭĵŃĪě", (byte)26, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_097.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ģãþħĝęñāīĂĖéćĸðĲĬĝĺķįįĆć", (byte)26, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_097.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ÿċûċęĉąġąďđİĸāĂúĘĩĮľĐđŁĕĲĕĸÿňĦüĈ", (byte)26, 65);
                }
            }
        }
    }

    public Filter.Result filter(LogEvent logEvent) {
        if (logEvent == null) {
            return Filter.Result.NEUTRAL;
        }
        Message message = logEvent.getMessage();
        if (message == null) {
            return Filter.Result.NEUTRAL;
        }
        return this.a(logEvent.getLoggerName(), message, message.getParameters());
    }

    private Filter.Result a(String string, Message message, Object[] objectArray) {
        return message != null ? this.a(string, message.getFormattedMessage(), objectArray) : Filter.Result.NEUTRAL;
    }
}

