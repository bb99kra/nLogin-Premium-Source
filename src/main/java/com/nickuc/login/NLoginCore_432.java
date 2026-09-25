/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_432 {
    private static String[] var_java_lang_String_arr_b;
    private static long o;
    private static String[] var_java_lang_String_arr_a;
    private static final Pattern var_java_util_regex_Pattern_j;
    private static long t;
    private static long d;
    private static int var_int_a;
    private static long m;
    private static int h;
    private static int r;
    private static int q;
    private static long var_long_b;
    private static int s;
    private static long var_long_j;
    private static int n;
    private static int k;
    private static long i;
    private static int f;
    private static int e;
    private static long g;
    private static long p;
    private static long c;
    private static int l;

    static {
        var_int_a = 0 >>> 138 | 0 << -138;
        var_long_b = Long.reverse(676363008676895768L);
        d = Long.reverse(-3458764513820540928L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(-1);
        g = Long.reverse(-2782401505143645160L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(676363008676895768L);
        var_long_j = Long.reverse(-3458764513820540928L);
        k = 49152 >>> 206 | 49152 << ~206 + 1;
        l = (-1 >>> 146 | -1 << ~146 + 1) & 0xFFFFFFFF;
        m = Long.reverse(-2782401505143645160L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(676363008676895768L);
        p = Long.reverse(-3458764513820540928L);
        q = Integer.reverse(0x60000000);
        r = Integer.reverse(0x60000000);
        s = Integer.reverse(-1610612736);
        t = Long.reverse(-2782401505143645160L);
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_432.b();
        var_java_util_regex_Pattern_j = Pattern.compile((String)NLoginCore_432.c("㺀", (int)s, (long)t));
    }

    public static UUID d(String string) {
        return UUID.nameUUIDFromBytes(((String)NLoginCore_432.c("㺀", (int)n, (long)(o ^ p)) + string).getBytes(StandardCharsets.UTF_8));
    }

    public static UUID c(@Nullable String string) {
        if (string != null && !string.isEmpty()) {
            String string2 = string.contains((CharSequence)NLoginCore_432.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))) ? string : var_java_util_regex_Pattern_j.matcher(string).replaceAll((String)NLoginCore_432.c("㺃", (int)(e & f), (long)g));
            return UUID.fromString(string2);
        }
        return null;
    }

    public static UUID a(String string, UUID uUID) {
        return BCryptHashProvider.com_nickuc_login_NLoginCore_254_a().a(string, uUID);
    }

    private static void b() {
        int n;
        c = 1745539465544681104L;
        long l = c ^ 0xD8D79A9DCD6AF9FAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(38 + 31), (byte)(38 + 45), (byte)(19 + 28), (byte)(59 + 8), (byte)(56 + 10), (byte)(19 + 48), (byte)(19 + 28), (byte)(35 + 45), (byte)(18 + 57), (byte)(12 + 55), (byte)(28 + 55), (byte)(52 + 1), (byte)(78 + 2), (byte)(14 + 83), (byte)(67 + 33), (byte)(48 + 52), (byte)(80 + 25), (byte)(50 + 60), (byte)(84 + 19)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
                    NLoginCore_432.var_java_lang_String_arr_b[0] = NLoginCore_384.C("҆Ҷұ҇ҟѾҟҫҠҔҍҊ", (byte)47, 67);
                    NLoginCore_432.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ĐŇĸĕęįĒĪįŔňŋŐşŗİŏśģĳŖŃİı", (byte)47, 66);
                    NLoginCore_432.var_java_lang_String_arr_b[2] = NLoginCore_091.F("ԯ՟՚԰ՈԧՈՔՉԽԶԳ", (byte)47, 70);
                    NLoginCore_432.var_java_lang_String_arr_b[3] = NLoginCore_446.A("ĦĩĖĘŋĘļĶřĲŞĥ", (byte)47, 65);
                    NLoginCore_432.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ҦҒѷҭѵ҈қҵҌґһӂҵѿґҪӀҫҮҺҩҘҕҖ", (byte)47, 68);
                    NLoginCore_432.var_java_lang_String_arr_b[5] = NLoginCore_092.E("՟ԟԘբՁՕԜ՟Ջ՘թդՉՙԪձԯ՟ՐԶզիկՔՔճՈ՚ջծպԺեՍ՜՚՞ՕՀՈ֍ր՛֏Սսպՠ֊սբՏնա՞՟", (byte)47, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_432.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ҥҌҦѽҭүҸҡѿҐҀҊ", (byte)47, 68);
                    NLoginCore_432.var_java_lang_String_arr_b[1] = NLoginCore_427.A("ĐŇĸĕęįĒĪįŔňğŞńĞŗőĽĤŒņūĬŗĮįŀŀťĬŉĵ", (byte)47, 65);
                    NLoginCore_432.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ՎՂՕբ՞բՅբԥՌԭԳ", (byte)47, 69);
                    NLoginCore_432.var_java_lang_String_arr_b[3] = NLoginCore_453.C("ҒҮҔҍҚҌҬүҫҙ҄Ҋ", (byte)47, 67);
                    NLoginCore_432.var_java_lang_String_arr_b[4] = NLoginCore_387.D("ҦҒѷҭѵ҈қҵҌґҼҽӁҴҞҪҫӇҺӈҟӉҹ҄ҭ҆ҥӒҮҗҪҧ", (byte)47, 68);
                    NLoginCore_432.var_java_lang_String_arr_b[5] = NLoginCore_110.A("őđĊŔĳŇĎőĽŊśŖĻŋĜţġőłĨŘŝšņņťĺŌŭŠŬĬŗĿŎŌŐŇĲĺſŲōšŭűŘŞŷşŚƉŁŤŸŤřŻƅőŨŮųƖ", (byte)47, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_432.var_java_lang_String_arr_b[0] = NLoginCore_138.D("҅Ҙ҉ѻѶѶѿѽҗҰүҊ", (byte)47, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_432.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ҼұҎҼҔ҉ҁҚҍҤҙҊ", (byte)47, 68);
                }
            }
        }
    }

    public static String b(@Nullable UUID uUID) {
        return uUID != null ? uUID.toString().replace((CharSequence)NLoginCore_432.c("㺀", (int)h, (long)(i ^ var_long_j)), (CharSequence)NLoginCore_432.c("㺃", (int)(k & l), (long)m)) : null;
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0xD8D79A9DCD6AF9FAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(22 + 47), (byte)(8 + 75), (byte)(2 + 45), (byte)(10 + 57), (byte)(62 + 4), (byte)(41 + 26), (byte)(38 + 9), (byte)(2 + 78), (byte)(62 + 13), (byte)(61 + 6), (byte)(24 + 59), (byte)(13 + 40), 80, (byte)(60 + 37), 100, (byte)(54 + 46), (byte)(14 + 91), (byte)(66 + 44), (byte)(68 + 35)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(60 + 23)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.B("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӣӌӭӎӦӀӠӏӘ", (byte)76, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_432.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_432.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_432.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӝӆӧӈӠҺӚӉӒť", (byte)73, 66) + string + NLoginCore_223.E("Կ", (byte)73, 69) + methodType.toString(), exception);
        }
    }
}

