/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_389;
import com.nickuc.login.NLoginCore_453;
import io.netty.util.AttributeKey;
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

public class NLoginCore_306 {
    private static int var_int_b;
    public static final AttributeKey<NLoginCore_306> var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_306__d;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private final int am;
    private static int var_int_c;
    private final String ca;
    private static long var_long_c;
    private static int var_int_d;
    private static int var_int_a;
    private static long e;
    private final Object h;

    @Generated
    public Object h() {
        return this.h;
    }

    @Generated
    public String aw() {
        return this.ca;
    }

    @Generated
    public NLoginCore_306(int n, String string, Object object) {
        this.am = n;
        this.ca = string;
        this.h = object;
    }

    @Generated
    public int w() {
        return this.am;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_306.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.E("ӭԏԑӱԕԴԬՂԮӽԻԱԿԹԂԧՉՈՀՆՀԕ", (byte)9, 69), NLoginCore_306.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.D("грпЂтойтэмЉчыфчэЏބޢޕަޛާޣޠݽުޱ޴ެ޷޵Ъ", (byte)9, 68) + string + NLoginCore_091.F("ӿ", (byte)9, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -7473810353893484317L;
        long l = var_long_c ^ 0x1B6ED748AB40186L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(11 + 58), (byte)(82 + 1), (byte)(37 + 10), (byte)(26 + 41), 66, (byte)(31 + 36), (byte)(11 + 36), (byte)(21 + 59), (byte)(44 + 31), (byte)(2 + 65), (byte)(67 + 16), (byte)(39 + 14), (byte)(62 + 18), (byte)(17 + 80), (byte)(43 + 57), (byte)(84 + 16), (byte)(25 + 80), (byte)(18 + 92), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_306.var_java_lang_String_arr_b[0] = NLoginCore_173.C("ԎԗԱӺԨԑԔԱԗԍԮԖԭԔԸՇՇԞԧԫՍԈԻԉԋՎԩԦՂԴԯ՗", (byte)89, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_306.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ſƈƢūƙƂƅƢƈžƟƇƞƅƩƸƸƏƘƜƾŻƮƐżƴƓƜƾƽƝƈƢƥƴƢƾǍƥƹƫƎǊƙ", (byte)89, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_306.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ŤŹƧƇžƊƆƙƠƢƍűƌƐƊƕƷƓƉƕƲƶƌƞƬƜơŽƼưƝƥ", (byte)89, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_306.var_java_lang_String_arr_b[0] = NLoginCore_201.F("փստթ֒սգ֓ծբք֒Ռգ՚օ֓֟՟֚֘իըթ", (byte)89, 70);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = Integer.reverse(0);
        var_int_d = -1 >>> 12 | -1 << -12;
        e = Long.reverse(8006082386344141337L);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_306.b();
        var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_306__d = NLoginCore_389.a((String)NLoginCore_306.c("㺀", (int)(var_int_c & var_int_d), (long)e));
    }

    private static String a(int n, long l) {
        l ^= 0x15L;
        l ^= 0x1B6ED748AB40186L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(35 + 34), (byte)(49 + 34), (byte)(33 + 14), (byte)(16 + 51), (byte)(44 + 22), (byte)(50 + 17), (byte)(22 + 25), 80, (byte)(69 + 6), 67, (byte)(81 + 2), (byte)(18 + 35), (byte)(60 + 20), (byte)(55 + 42), (byte)(91 + 9), (byte)(55 + 45), (byte)(100 + 5), (byte)(85 + 25), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(13 + 56), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.A("ĒğĞáġĝĘġĬěèĦĪģĦĬîѣҁѴ҅Ѻ҆҂ѿќ҉ҐғҋҖҔ", (byte)24, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_306.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

