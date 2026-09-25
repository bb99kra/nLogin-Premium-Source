/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_016;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_060;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_307
implements NLoginInterface_016 {
    private static String[] var_java_lang_String_arr_b;
    private static int o;
    private static long e;
    private static int n;
    private static int k;
    private static int i;
    private static long d;
    private static long j;
    private static int var_int_a;
    private static int m;
    private static int f;
    private static long q;
    private static int var_int_b;
    private final NLoginCore_276 var_com_nickuc_login_NLoginCore_276_c;
    private static String[] var_java_lang_String_arr_a;
    private static long p;
    private static long var_long_c;
    private static final String cw;
    private static int l;
    private static int h;
    private static int g;

    /* synthetic */ NLoginCore_307(NLoginCore_276 NLoginCore_2762, NLoginCore_060 NLoginCore_0602) {
        this(NLoginCore_2762);
    }

    private static String a(int n, long l) {
        l ^= 0x53L;
        l ^= 0x78BBA9F7D1169EA2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(25 + 44), (byte)(48 + 35), (byte)(44 + 3), (byte)(5 + 62), (byte)(58 + 8), (byte)(63 + 4), (byte)(10 + 37), (byte)(78 + 2), (byte)(26 + 49), 67, (byte)(69 + 14), (byte)(46 + 7), (byte)(6 + 74), (byte)(17 + 80), (byte)(89 + 11), (byte)(93 + 7), (byte)(46 + 59), 110, (byte)(33 + 70)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.A("ìùø»û÷òûĆõÂĀĄýĀĆÈыћѢџѐвѨчєѝѨрѢ", (byte)5, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_307.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 1540723589220783176L;
        long l = var_long_c ^ 0x78BBA9F7D1169EA2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(37 + 32), (byte)(25 + 58), (byte)(3 + 44), (byte)(63 + 4), (byte)(60 + 6), 67, (byte)(35 + 12), (byte)(35 + 45), (byte)(2 + 73), (byte)(43 + 24), (byte)(28 + 55), (byte)(32 + 21), (byte)(46 + 34), (byte)(60 + 37), (byte)(41 + 59), (byte)(3 + 97), (byte)(11 + 94), 110, (byte)(35 + 68)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
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
                    NLoginCore_307.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪՇ԰՜՞՘ԿաԺԯԽԿ", (byte)94, 68);
                    NLoginCore_307.var_java_lang_String_arr_b[1] = NLoginCore_559.B("ƱƓƨƸƳƐƖƄƚƦƆƃ", (byte)94, 66);
                    NLoginCore_307.var_java_lang_String_arr_b[2] = NLoginCore_446.A("ŲƔƋŭŴűƕƶƇƚƸŵƀƾƺźƶƠƀƖƖƳƜǈǊǄƫǍƦƛƩƫ", (byte)94, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_307.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪՉՕԟՎԚ՘՘՞եզՈ", (byte)94, 67);
                    NLoginCore_307.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ƀůƆűƭŴƧƫƸŴƼƃ", (byte)94, 65);
                    NLoginCore_307.var_java_lang_String_arr_b[2] = NLoginCore_076.C("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪԶԹԹՊԱԔԽԷԺՆՆ", (byte)94, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_307.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ԣԅԛԕՁՀԠՊԛ԰ԤՉԾԴԍԮՃԶԵԔԧԓՓԸԞՀՕ՟ԭՃԽԙ", (byte)94, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_307.var_java_lang_String_arr_b[0] = NLoginCore_451.C("ԑӿԓԢԭԜԇԞԪՇԫԭՍՋԎԮ԰ԨՇԩԶՋԢԣ", (byte)94, 67);
                }
            }
        }
    }

    @Override
    public boolean filter(String string, String string2, Object ... objectArray) {
        if (objectArray.length == var_int_a && string2.contains((CharSequence)NLoginCore_307.c("㺀", (int)var_int_b, (long)(d ^ e)))) {
            String string3 = (char)f + (String)objectArray[g];
            String string4 = string3.split((String)NLoginCore_307.c("㺃", (int)(h & i), (long)j))[k].toLowerCase(Locale.ENGLISH);
            return this.var_com_nickuc_login_NLoginCore_276_c.a().stream().anyMatch(string4::equals);
        }
        return l != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_307.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_307.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.F("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձࣴऄऋईࣹࣛऑࣰࣽआऑࣩऋ֊", (byte)118, 70) + string + NLoginCore_223.A("ƥ", (byte)118, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (Integer.MIN_VALUE >>> 254 | Integer.MIN_VALUE << -254) & 0xFFFFFFFF;
        var_int_b = (0 >>> 141 | 0 << -141) & 0xFFFFFFFF;
        d = Long.reverse(1309290883186525864L);
        e = Long.reverse(-3891110078048108544L);
        f = (96256 >>> 75 | 96256 << ~75 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(-1);
        j = Long.reverse(-2870049571013294424L);
        k = Integer.reverse(0);
        l = Integer.reverse(0);
        m = (12288 >>> 108 | 12288 << -108) & 0xFFFFFFFF;
        n = Integer.reverse(-1073741824);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(1309290883186525864L);
        q = Long.reverse(-3891110078048108544L);
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_307.b();
        cw = NLoginCore_307.c("㺀", (int)o, (long)(p ^ q));
    }

    @Generated
    private NLoginCore_307(NLoginCore_276 NLoginCore_2762) {
        this.var_com_nickuc_login_NLoginCore_276_c = NLoginCore_2762;
    }
}

