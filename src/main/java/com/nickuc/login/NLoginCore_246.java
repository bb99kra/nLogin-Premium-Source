/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_246 {
    private static String[] var_java_lang_String_arr_a;
    private static int r;
    private static int k;
    private static int e;
    private static long p;
    private static int q;
    private static long f;
    private static int m;
    private static int u;
    private static long h;
    private static int t;
    private static int x;
    private static int y;
    private static int i;
    private static int var_int_a;
    private static int z;
    private static final SecureRandom var_java_security_SecureRandom_a;
    private static long var_long_b;
    private static int o;
    private static int g;
    private static String[] var_java_lang_String_arr_b;
    private static int n;
    private static long d;
    private static long c;
    private static long v;
    private static long w;
    private static int j;
    private static int l;
    private static long s;

    public static byte[] d(byte[] byArray, Key key) {
        try {
            return NLoginCore_246.e(byArray, key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException((String)NLoginCore_246.c("㺀", (int)r, (long)s), generalSecurityException);
        }
    }

    public static byte[] a(String string, Key key) {
        return NLoginCore_246.d(Base64.getDecoder().decode(string), key);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-1643147638786712414L);
        d = Long.reverse(0x3E00000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-2940184331469415262L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(-2940184331469415262L);
        i = (512 >>> 103 | 512 << -103) & 0xFFFFFFFF;
        j = Integer.reverse(0x20000000);
        k = Integer.reverse(0);
        l = (0 >>> 236 | 0 << -236) & 0xFFFFFFFF;
        m = (0 >>> 230 | 0 << -230) & 0xFFFFFFFF;
        n = 512 >>> 231 | 512 << ~231 + 1;
        o = (-1073741824 >>> 222 | -1073741824 << ~222 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-2940184331469415262L);
        q = 2048 >>> 171 | 2048 << ~171 + 1;
        r = Integer.reverse(0x20000000);
        s = Long.reverse(-2940184331469415262L);
        t = 0x2000000 >>> 119 | 0x2000000 << ~119 + 1;
        u = 10240 >>> 11 | 10240 << ~11 + 1;
        v = Long.reverse(-1643147638786712414L);
        w = Long.reverse(0x3E00000000000000L);
        x = Integer.reverse(0x40000000);
        y = Integer.reverse(0x60000000);
        z = Integer.reverse(0x60000000);
        var_java_lang_String_arr_a = new String[y];
        var_java_lang_String_arr_b = new String[z];
        NLoginCore_246.b();
        var_java_security_SecureRandom_a = new SecureRandom();
    }

    private static void b() {
        int n;
        c = 4988045712076459159L;
        long l = c ^ 0x2126894B6AC568B8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(10 + 59), (byte)(20 + 63), (byte)(12 + 35), 67, (byte)(48 + 18), (byte)(50 + 17), (byte)(17 + 30), (byte)(63 + 17), (byte)(36 + 39), (byte)(49 + 18), (byte)(55 + 28), 53, (byte)(8 + 72), (byte)(95 + 2), (byte)(54 + 46), (byte)(80 + 20), (byte)(41 + 64), (byte)(12 + 98), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
                    NLoginCore_246.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ǠǨǜǳƱǋǈǭưƹǆƿ", (byte)124, 65);
                    NLoginCore_246.var_java_lang_String_arr_b[1] = NLoginCore_004.D("֚֒֎֥գսպ֟բիոձ", (byte)124, 68);
                    NLoginCore_246.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ǉƩƬƭǡǟǣǑǖǡǉǄǜǔǙǺǲƷǻǳƶǁǄȃȃǗǝǛǆȂȄȏǺǙǠǮǯǽȊǟǐǴȈǟ", (byte)124, 66);
                    NLoginCore_246.var_java_lang_String_arr_b[3] = NLoginCore_324.F("ִ֡֩֝ղ֌։֮ձպևր", (byte)124, 70);
                    NLoginCore_246.var_java_lang_String_arr_b[4] = NLoginCore_027.B("ǉƩƬƭǡǟǣǑǖǡǇƻƺǊǇǎǿǟǪǛǄȃƸǱǺǤǴǩǽǙǖǎȑȉȐǻǧǾǫȂǢǣǮǟ", (byte)124, 66);
                    NLoginCore_246.var_java_lang_String_arr_b[5] = NLoginCore_223.D("֚֒֎֥գսպ֟բիոձ", (byte)124, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_246.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ǡǏǌǌǎǧǔǭǹǤǂƿ", (byte)124, 65);
                    NLoginCore_246.var_java_lang_String_arr_b[1] = NLoginCore_110.D("շւ՟շֆ֤֞՟փզ֪ձ", (byte)124, 68);
                    NLoginCore_246.var_java_lang_String_arr_b[2] = NLoginCore_027.E("֊ժխծ֢֤֢֠֒֗֊օֳֻ֚֝֕ոִּշւօׄׄ֘֞֜և׃ׅא׋ּד־֤֕֐֊ֲ֐֚֠", (byte)124, 69);
                    NLoginCore_246.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ǚưƾǔǦǧǆǎǏǹǴƿ", (byte)124, 66);
                    NLoginCore_246.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ջ՛՞՟֑֓֕փֈ֓չխլռչրֱ֑֜֍նֵժ֣֖֦֛֬֯֋ֈր׃փ֟֓ց֗ւׂ֛֦֑֔", (byte)124, 67);
                    NLoginCore_246.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ƽǢǒǐǃǔǞƩƪǡƱƿ", (byte)124, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_246.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ǭǌǡǞǡǲǂǲǯǊǶǧƷǅǹǷǍǹǏǴǏȀȃǴǀȇǁȋǹǗǋȃ", (byte)124, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_246.var_java_lang_String_arr_b[0] = NLoginCore_223.E("֜֓կկսֱ֔օִ֖֢֪֭֩֍֊ֵ֘֍֘֟֞֋֌", (byte)124, 69);
                }
            }
        }
    }

    public static PublicKey java_security_PublicKey_a(byte[] byArray) {
        KeyFactory keyFactory = KeyFactory.getInstance((String)NLoginCore_246.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }

    public static byte[] c(byte[] byArray, Key key) {
        Cipher cipher = Cipher.getInstance((String)NLoginCore_246.c("㺀", (int)o, (long)p));
        cipher.init(q, key);
        return cipher.doFinal(byArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_246.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.E("ՒմնՖպ֑֧֙֓բ֖֤֠֞է֌֥֥֭֮֫պ", (byte)110, 69), NLoginCore_246.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.D("բկծԱձխըձռիԸնպճնռԾࣕࢥ࣑࣊࣍ࣚࣞ࣋࣎Փ", (byte)110, 68) + string + NLoginCore_451.F("դ", (byte)110, 70) + methodType.toString(), exception);
        }
    }

    public static byte[] byte_arr_a(byte[] byArray, Key key) {
        try {
            return NLoginCore_246.b(byArray, key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException((String)NLoginCore_246.c("㺀", (int)g, (long)h), generalSecurityException);
        }
    }

    public static PrivateKey java_security_PrivateKey_a(byte[] byArray) {
        KeyFactory keyFactory = KeyFactory.getInstance((String)NLoginCore_246.c("㺀", (int)e, (long)f));
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(byArray);
        return keyFactory.generatePrivate(pKCS8EncodedKeySpec);
    }

    public static byte[] f(byte[] byArray, Key key) {
        Cipher cipher = Cipher.getInstance((String)NLoginCore_246.c("㺀", (int)u, (long)(v ^ w)));
        cipher.init(x, key);
        return cipher.doFinal(byArray);
    }

    public static byte[] e(byte[] byArray, Key key) {
        byte[] byArray2 = NLoginCore_246.f(byArray, key);
        return Arrays.copyOfRange(byArray2, t, byArray2.length);
    }

    public static byte[] b(byte[] byArray, Key key) {
        byte[] byArray2 = new byte[byArray.length + i];
        byte[] byArray3 = new byte[j];
        var_java_security_SecureRandom_a.nextBytes(byArray3);
        System.arraycopy(byArray3, k, byArray2, l, byArray3.length);
        System.arraycopy(byArray, m, byArray2, n, byArray.length);
        return NLoginCore_246.c(byArray2, key);
    }

    public static String java_lang_String_a(byte[] byArray, Key key) {
        return Base64.getEncoder().encodeToString(NLoginCore_246.byte_arr_a(byArray, key));
    }

    private static String a(int n, long l) {
        l ^= 0x7CL;
        l ^= 0x2126894B6AC568B8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(41 + 28), (byte)(23 + 60), (byte)(42 + 5), (byte)(24 + 43), (byte)(17 + 49), (byte)(42 + 25), (byte)(29 + 18), (byte)(24 + 56), (byte)(49 + 26), (byte)(19 + 48), 83, (byte)(17 + 36), (byte)(69 + 11), (byte)(3 + 94), 100, (byte)(42 + 58), (byte)(90 + 15), (byte)(42 + 68), (byte)(64 + 39)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸӏҟӄӇӔӘӋӅӈ", (byte)61, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_246.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

