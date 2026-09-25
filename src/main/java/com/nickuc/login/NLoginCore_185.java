/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.geysermc.api.Geyser
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.geysermc.api.Geyser;

public class NLoginCore_185
implements NLoginInterface_031 {
    private static int m;
    private static int var_int_a;
    private static int o;
    private static String[] var_java_lang_String_arr_b;
    private static long e;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static long var_long_c;
    private static int n;
    private static int l;
    private static int var_int_b;
    private static int h;
    private static long j;
    private static int g;
    private static long d;
    private static long i;
    private static int f;

    @Override
    public boolean boolean_a(UUID uUID) {
        try {
            return (uUID != null && Geyser.api().connectionByUuid(uUID) != null ? var_int_a : var_int_b) != 0;
        }
        catch (Throwable throwable) {
            if (throwable.getCause() instanceof ClassNotFoundException) {
                Object[] objectArray = new Object[f];
                objectArray[NLoginCore_185.g] = throwable.getMessage();
                NLoginCore_370.c((String)NLoginCore_185.c("㺀", (int)var_int_c, (long)(d ^ e)), objectArray);
            } else {
                NLoginCore_370.b((String)NLoginCore_185.c("㺃", (int)h, (long)(i ^ j)), throwable, new Object[k]);
            }
            return l != 0;
        }
    }

    static {
        var_int_a = (512 >>> 105 | 512 << -105) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = 0 >>> 119 | 0 << ~119 + 1;
        d = Long.reverse(-1949611926973728091L);
        e = Long.reverse(0x6600000000000000L);
        f = (0x8000000 >>> 219 | 0x8000000 << ~219 + 1) & 0xFFFFFFFF;
        g = (0 >>> 163 | 0 << -163) & 0xFFFFFFFF;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(-1949611926973728091L);
        j = Long.reverse(0x6600000000000000L);
        k = Integer.reverse(0);
        l = 0 >>> 246 | 0 << -246;
        m = Integer.reverse(0);
        n = Integer.reverse(0x40000000);
        o = 1024 >>> 9 | 1024 << -9;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_185.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_185.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("©ËÍ­Ñðèþê¹÷íûõ¾ãąĄüĂüÑ", (byte)1, 66), NLoginCore_185.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.D("ЛШЧϪЪЦСЪеФϱЯгЬЯеϷޑݝދݽދހݸމޔއޜގޛݪޓВ", (byte)1, 68) + string + NLoginCore_384.A("»", (byte)1, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x66L;
        l ^= 0x68DF84A69B717BEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(62 + 7), (byte)(30 + 53), (byte)(43 + 4), 67, (byte)(62 + 4), (byte)(5 + 62), (byte)(17 + 30), (byte)(72 + 8), (byte)(24 + 51), (byte)(49 + 18), (byte)(49 + 34), (byte)(5 + 48), (byte)(77 + 3), (byte)(87 + 10), (byte)(69 + 31), (byte)(48 + 52), (byte)(20 + 85), (byte)(109 + 1), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғ࠭߹ࠧ࠙ࠧࠜࠔࠥ࠰ࠣ࠸ࠪ࠷ࠆ࠯", (byte)53, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_185.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public boolean J() {
        return m != 0;
    }

    private static void b() {
        int n;
        var_long_c = -6530857914856796377L;
        long l = var_long_c ^ 0x68DF84A69B717BEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), 69, (byte)(28 + 55), (byte)(39 + 8), (byte)(15 + 52), (byte)(52 + 14), (byte)(56 + 11), (byte)(23 + 24), (byte)(29 + 51), (byte)(27 + 48), (byte)(53 + 14), 83, (byte)(37 + 16), (byte)(19 + 61), (byte)(4 + 93), (byte)(47 + 53), (byte)(71 + 29), (byte)(23 + 82), (byte)(15 + 95), (byte)(65 + 38)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_185.var_java_lang_String_arr_b[0] = NLoginCore_223.E("՟եԨՍի԰ԸըԲՏժ՛ՊրկղՑՙ՗՝՞Հ՜Ձռ՜սՊդրջբՋւ՞֌ձՓՐճ֐ծ֐ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճ֝խձֱֱִֵ֦֦֧֛֚֨֘֘֏ׅ֬֗֡׉֖֠׃֤֜֞օ֊׎ֻ׋֣׏֞֐֏֖֓׌֭֔׈ךֲ֫׎כהּ׆זםח֮֯", (byte)63, 69);
                    NLoginCore_185.var_java_lang_String_arr_b[1] = NLoginCore_559.D("ӖӜҟӄӢҧүӟҩӆӡӒӁӷӦөӈӐӎӔӕҷӓҸӳӓӴӁӛӷӲәӂӹӕԃӨӊӇӪԇӥԇӳԑԁԄӲӹԚԑӹԎԝԊӯԁӡӗԖӦԨӡӪӡԔԜӾӨԛӼӨԴԪԴӿԊԪԊԦԳԪԚԍԊԷԵӾԤԑՅՀӾԢԟԞԚՂԤԸՊԜԾՄՈՉԢԭԥԬԮԲԬՐՈԫՌԱ՜ԜԱԤԵՃՈՓ՞Ջ", (byte)63, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_185.var_java_lang_String_arr_b[0] = NLoginCore_387.E("՟եԨՍի԰ԸըԲՏժ՛ՊրկղՑՙ՗՝՞Հ՜Ձռ՜սՊդրջբՋւ՞֌ձՓՐճ֐ծ֐ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճ֝խձֱֱִֵ֦֦֧֛֚֨֘֘֏ׅ֬֗֡׉֖֠׃֤֜֞օ֊׎ֻ׋֣׏֞֐֏֖֓׌֭֔׉ֺ֯־ֲֶ֢֫ג֠כׁ֮֯", (byte)63, 69);
                    NLoginCore_185.var_java_lang_String_arr_b[1] = NLoginCore_223.F("՟եԨՍի԰ԸըԲՏժ՛ՊրկղՑՙ՗՝՞Հ՜Ձռ՜սՊդրջբՋւ՞֌ձՓՐճ֐ծ֐ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճժ֥֝ևձ֤օձֳֽֽֈֳֳּ֣֖֓֓֯֓׀־և֭֚׎׉և֧֣֫֨׋ׁ֭דׇ֥׍בגֵֵֶַֻ֮֫יבִוֻ֦עַ֥֨֬ן׋֫ױ", (byte)63, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_185.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ӧӃӤӇҡҺҭӣӜӢӏҭҰӍӦӏӧӲӧҴҵӾӅӆ", (byte)63, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_185.var_java_lang_String_arr_b[0] = NLoginCore_004.B("ŒŷİŅĳĭŇįŰňŮŅ", (byte)63, 66);
                }
            }
        }
    }
}

