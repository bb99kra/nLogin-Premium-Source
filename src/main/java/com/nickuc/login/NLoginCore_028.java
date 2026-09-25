/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_028<T>
implements NLoginInterface_019<T> {
    private final Class<?> var_java_lang_Class____b;
    public static NLoginCore_028<Long> var_com_nickuc_login_NLoginCore_028_java_lang_Long__d;
    private static int n;
    private static int o;
    public static NLoginCore_028<String> var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
    private static long var_long_c;
    private static long m;
    private static long f;
    private static long var_long_d;
    private final Class<T> var_java_lang_Class_T__c;
    private static long j;
    private static String[] var_java_lang_String_arr_a;
    private static int h;
    private static int k;
    private static String[] var_java_lang_String_arr_b;
    public static NLoginCore_028<Boolean> var_com_nickuc_login_NLoginCore_028_java_lang_Boolean__c;
    private static long var_long_b;
    private static long g;
    private static int l;
    public static NLoginCore_028<Integer> var_com_nickuc_login_NLoginCore_028_java_lang_Integer__b;
    private static int e;
    private static long i;
    private static int var_int_a;

    @Generated
    public Class<T> b() {
        return this.var_long_c;
    }

    @Override
    public JSONObject a(@Nonnull Object object) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginCore_028.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)), object);
        return jSONObject;
    }

    private static void b() {
        int n;
        var_long_c = 7591364220862252176L;
        long l = var_long_c ^ 0x941EB62746AD223DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(34 + 35), (byte)(35 + 48), (byte)(26 + 21), (byte)(57 + 10), (byte)(42 + 24), (byte)(22 + 45), (byte)(33 + 14), (byte)(74 + 6), (byte)(71 + 4), (byte)(15 + 52), (byte)(73 + 10), (byte)(36 + 17), (byte)(54 + 26), (byte)(31 + 66), 100, (byte)(23 + 77), (byte)(44 + 61), (byte)(21 + 89), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
                    NLoginCore_028.var_java_lang_String_arr_b[0] = NLoginCore_384.E("ւօսր՝ՙՅՓ՞էխՒ", (byte)78, 69);
                    NLoginCore_028.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ԗԚԒԕӲӮӚӨӳӼԂӧ", (byte)78, 67);
                    NLoginCore_028.var_java_lang_String_arr_b[2] = NLoginCore_451.C("ӑӮӬԖӤӝӗӛӨӗӽԒԓӗԇӝӠԣԗԂӧӣԤԠԝԒԆԎԁӭԑԭ", (byte)78, 67);
                    NLoginCore_028.var_java_lang_String_arr_b[3] = NLoginCore_091.F("ջցՀյճֆՓյՠգփֈհխկՋ՞իևֆշհ՝՞", (byte)78, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_028.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ՐԿսօվզն՗՚ը՞կՈ՝ՎՒօդՏզիՠ՝՞", (byte)78, 70);
                    NLoginCore_028.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ԕӥӳӪӚӱӿԒӚӲԜӧ", (byte)78, 68);
                    NLoginCore_028.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ōŪŨƒŠřœŗŤœŹƎƏœƃřŜƟƓžţťŦƖŤƈƦƠŪƬźƎ", (byte)78, 65);
                    NLoginCore_028.var_java_lang_String_arr_b[3] = NLoginCore_138.F("ջցՀյճֆՓյՠգօ՛֊՛՚եևաՍաՑ֖՝՞", (byte)78, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_028.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƀƐŢƅƀŧƔƑƕżƞŜƐƎſƞƑůŜŶƅƗŮů", (byte)78, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_028.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ձԻՙ՘ևՈ՟֊՟օարհ֐բիՐֆ֊մՑֆ՝՞", (byte)78, 69);
                }
            }
        }
    }

    static {
        var_int_a = (0 >>> 193 | 0 << -193) & 0xFFFFFFFF;
        var_long_b = Long.reverse(658467292632291990L);
        var_long_d = Long.reverse(-9079256848778919936L);
        e = 0x8000000 >>> 187 | 0x8000000 << -187;
        f = Long.reverse(658467292632291990L);
        g = Long.reverse(-9079256848778919936L);
        h = 0x2000000 >>> 120 | 0x2000000 << -120;
        i = Long.reverse(658467292632291990L);
        j = Long.reverse(-9079256848778919936L);
        k = Integer.reverse(-1073741824);
        l = Integer.reverse(-1);
        m = Long.reverse(-8420789556146627946L);
        n = (0x10000000 >>> 186 | 0x10000000 << ~186 + 1) & 0xFFFFFFFF;
        o = (8 >>> 97 | 8 << -97) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_028.b();
        var_com_nickuc_login_NLoginCore_028_java_lang_String__a = new NLoginCore_028<String>(String.class, String.class);
        var_java_lang_Class____b = new NLoginCore_028<Integer>(Integer.TYPE, Integer.class);
        var_long_c = (long)new NLoginCore_028<Boolean>(Boolean.TYPE, Boolean.class);
        var_com_nickuc_login_NLoginCore_028_java_lang_Long__d = new NLoginCore_028<Long>(Long.TYPE, Long.class);
    }

    private static String a(int n, long l) {
        l ^= 0x41L;
        l ^= 0x941EB62746AD223DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(36 + 47), (byte)(22 + 25), (byte)(27 + 40), (byte)(28 + 38), (byte)(40 + 27), (byte)(25 + 22), (byte)(41 + 39), (byte)(62 + 13), (byte)(22 + 45), (byte)(11 + 72), (byte)(51 + 2), (byte)(54 + 26), 97, (byte)(7 + 93), (byte)(43 + 57), (byte)(14 + 91), (byte)(61 + 49), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡗࡗࡦࡆࡓࡉࡄ࠶ࡔ", (byte)71, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_028.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public T a(@Nonnull JSONObject jSONObject) {
        Object object = jSONObject.get((String)NLoginCore_028.c("㺀", (int)e, (long)(f ^ g)));
        if (this.var_long_c.isInstance(object)) {
            return this.var_long_c.cast(object);
        }
        throw new IllegalArgumentException((String)NLoginCore_028.c("㺃", (int)h, (long)(i ^ j)) + object.getClass() + (String)NLoginCore_028.c("㺆", (int)(k & l), (long)m) + this.var_long_c);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_028.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 65), NLoginCore_028.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԜԜԫԋԘԎԉӻԙƣ", (byte)104, 65) + string + NLoginCore_384.D("ԧ", (byte)104, 68) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_028(Class<?> clazz, Class<T> clazz2) {
        this.var_java_lang_Class____b = clazz;
        this.var_long_c = (long)clazz2;
    }

    @Override
    @Generated
    public Class<?> a() {
        return this.var_java_lang_Class____b;
    }
}

