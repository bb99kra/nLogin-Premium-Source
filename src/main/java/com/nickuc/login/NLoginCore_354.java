/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_354 {
    private static int m;
    private static int l;
    private static long d;
    private static int i;
    private static long h;
    private static long j;
    private static int f;
    private static int var_int_a;
    private static int var_int_b;
    private static int n;
    private static final Random var_java_util_Random_a;
    private static long k;
    private static final SecureRandom var_java_security_SecureRandom_b;
    private static long e;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static long c;
    private static String[] var_java_lang_String_arr_b;

    static {
        var_int_a = (0 >>> 158 | 0 << -158) & 0xFFFFFFFF;
        var_int_b = (0 >>> 120 | 0 << ~120 + 1) & 0xFFFFFFFF;
        d = Long.reverse(-403948210295038824L);
        e = Long.reverse(0x6000000000000000L);
        f = 2048 >>> 171 | 2048 << -171;
        g = Long.reverse(-403948210295038824L);
        h = Long.reverse(0x6000000000000000L);
        i = 0x200000 >>> 116 | 0x200000 << -116;
        j = Long.reverse(-403948210295038824L);
        k = Long.reverse(0x6000000000000000L);
        l = Integer.reverse(0);
        m = 24 >>> 227 | 24 << -227;
        n = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_354.b();
        var_java_util_Random_a = new Random();
        var_java_security_SecureRandom_b = new SecureRandom();
    }

    private static void b() {
        int n;
        c = 1817674743521158751L;
        long l = c ^ 0xD62C2E645971983EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(28 + 41), (byte)(39 + 44), (byte)(9 + 38), (byte)(2 + 65), (byte)(59 + 7), (byte)(14 + 53), 47, (byte)(51 + 29), 75, (byte)(39 + 28), (byte)(65 + 18), (byte)(3 + 50), (byte)(62 + 18), (byte)(64 + 33), (byte)(17 + 83), (byte)(70 + 30), (byte)(23 + 82), (byte)(24 + 86), (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_354.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԎՄՏԴԣ԰ՆՏԣԘՈԙՖ՗ԙԽՌՔ՚ՔԹՂԻե՟՚ՍբԬզՉՠԥՠՈճղզդՍԻԺԼՂ", (byte)30, 69);
                    NLoginCore_354.var_java_lang_String_arr_b[1] = NLoginCore_138.C("҉ҊѵѸјчѺюѢѾѩѼ҆ѽѩѸҁҕѤѷѼҔѩғѪҐҁ҃҂ғјҥҠ҅ѪѥѻҊҟѭ҃ҥѱѷ", (byte)30, 67);
                    NLoginCore_354.var_java_lang_String_arr_b[2] = NLoginCore_324.B("ćõèòīøĥ÷ĹüĴĮĳüďĽıčĕňĔľćĠķčĨĞņįńŉĥŉğħĕďňĻļěĕģ", (byte)30, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_354.var_java_lang_String_arr_b[0] = NLoginCore_138.D("уѹ҄ѩјѥѻ҄јэѽюҋҌюѲҁ҉ҏ҉ѮѷѰҚҔҏ҂җѡқѾҕҁҧҚѫѧҁ҉ҟѹҁұҋҦғҵҥҶҡѵҊҤһ҂҃", (byte)30, 68);
                    NLoginCore_354.var_java_lang_String_arr_b[1] = NLoginCore_559.D("҉ҊѵѸјчѺюѢѾѩѼ҆ѽѩѸҁҕѤѷѼҔѩғѪҐҁ҃҂ғјҥѷѨ҉ҖѷѪҏѹҥ҄ѭѪҥ҅ҡҠ҅ҺҎҊҴҕ҂҃", (byte)30, 68);
                    NLoginCore_354.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ćõèòīøĥ÷ĹüĴĮĳüďĽıčĕňĔľćĠķčĨĞņįńŉħłňıŁŐňŊĨŖĺģ", (byte)30, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_354.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ðĭĪĭęĦēíĩĵćööĩĪěāăŀĀĜđĎď", (byte)30, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_354.var_java_lang_String_arr_b[0] = NLoginCore_092.E("ԥՅՁՕՂԊՕԳԩԒՓԢ", (byte)30, 69);
                }
            }
        }
    }

    public static String a(char[] cArray, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = l; i < n; ++i) {
            stringBuilder.append(cArray[var_java_security_SecureRandom_b.nextInt(cArray.length)]);
        }
        return stringBuilder.toString();
    }

    public static int a(int n) {
        return n == 0 ? var_int_a : var_java_util_Random_a.nextInt(n);
    }

    private static String a(int n, long l) {
        l ^= 6L;
        l ^= 0xD62C2E645971983EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(7 + 62), (byte)(14 + 69), (byte)(7 + 40), (byte)(41 + 26), (byte)(56 + 10), (byte)(33 + 34), (byte)(33 + 14), (byte)(51 + 29), (byte)(10 + 65), (byte)(30 + 37), (byte)(67 + 16), (byte)(25 + 28), (byte)(11 + 69), (byte)(72 + 25), (byte)(93 + 7), (byte)(87 + 13), 105, (byte)(72 + 38), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.D("ӧӴӳҶӶӲӭӶԁӰҽӻӿӸӻԁӃࡎ࡝ࡠ࡝ࡏ࡚ࡣࡓ࡙ࡧ࠳ࡤࡇ࡚", (byte)69, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_354.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String a(String string, int n) {
        return NLoginCore_354.a(string.toCharArray(), n);
    }

    public static Random a() {
        return var_java_util_Random_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_354.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԯՑՓԳ՗նծքհԿսճցջՄթ֋֊ւֈւ՗", (byte)75, 69), NLoginCore_354.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("ŸƅƄŇƇƃžƇƒƁŎƌƐƉƌƒŔӟӮӱӮӠӫӴӤӪӸӄӵӘӫŮ", (byte)75, 65) + string + NLoginCore_138.B("ŏ", (byte)75, 66) + methodType.toString(), exception);
        }
    }

    public static String a(NLoginCore_198 NLoginCore_1982, int n) {
        return NLoginCore_354.a(NLoginCore_198.a(NLoginCore_1982), n);
    }

    public static int a(int n, int n2) {
        int n3;
        if (n == n2) {
            throw new IllegalArgumentException((String)NLoginCore_354.c("㺀", (int)var_int_b, (long)(d ^ e)));
        }
        if (n < 0) {
            throw new IllegalArgumentException((String)NLoginCore_354.c("㺃", (int)f, (long)(g ^ h)));
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException((String)NLoginCore_354.c("㺆", (int)i, (long)(j ^ k)));
        }
        if (n > n2) {
            n3 = n2;
            n2 = n;
            n = n3;
        }
        n3 = n2 - n;
        int n4 = NLoginCore_354.a(n3);
        return n + n4;
    }
}

