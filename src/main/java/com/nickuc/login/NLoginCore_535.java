/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_016;
import com.nickuc.login.NLoginCore_307;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_060;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_267;
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

public final class NLoginCore_535 {
    private static int var_int_a;
    private static long c;
    private static long d;
    private static int g;
    private static long var_long_b;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static int i;
    private static int f;
    private static int e;
    private static int h;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_535.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.C("ϻНПϿУткѐмЋщпэчАеїіюєюУ", (byte)10, 67), NLoginCore_535.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("жутЅхсмхѐпЌъючъѐВފޚݺޮޯޑުީުЧ", (byte)10, 67) + string + NLoginCore_324.C("Ѝ", (byte)10, 67) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 7067779144361393508L;
        long l = c ^ 0xA8E3D95008DCDB33L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(28 + 41), (byte)(26 + 57), (byte)(41 + 6), 67, (byte)(46 + 20), (byte)(17 + 50), (byte)(7 + 40), (byte)(52 + 28), (byte)(57 + 18), (byte)(39 + 28), 83, (byte)(18 + 35), (byte)(29 + 51), (byte)(48 + 49), (byte)(85 + 15), (byte)(86 + 14), (byte)(82 + 23), (byte)(29 + 81), (byte)(78 + 25)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_535.var_java_lang_String_arr_b[0] = NLoginCore_223.D("вЊЍмЎлтгХвфвУГгочТЮйЌѐёЊнЮуђгђИѐъИвВнсЭЮфѧОЬ", (byte)5, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_535.var_java_lang_String_arr_b[0] = NLoginCore_324.B("÷ÏÒāÓĀćøê÷ĉ÷èØøăČçóþÑĕĖÏĂóĈėøėÝĕĘëöååĕåĩĪôČñ", (byte)5, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_535.var_java_lang_String_arr_b[0] = NLoginCore_324.F("ԗԱԷӯԿԑԺԎԸӹԟԲԚԦӿՈԄԉԧՊԺԗԔԕ", (byte)5, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_535.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ЗОЙПϷЀГЎЮАтЖщЪЬЅъпъАМрЗИ", (byte)5, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0xA8E3D95008DCDB33L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), 69, (byte)(34 + 49), (byte)(37 + 10), (byte)(39 + 28), (byte)(57 + 9), (byte)(33 + 34), (byte)(42 + 5), (byte)(79 + 1), (byte)(73 + 2), (byte)(22 + 45), (byte)(23 + 60), (byte)(50 + 3), (byte)(33 + 47), (byte)(91 + 6), (byte)(51 + 49), (byte)(33 + 67), (byte)(73 + 32), (byte)(54 + 56), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("ыјїКњіёњѥєСџѣќџѥЧޟޯޏ߃߄ަ޿޾޿", (byte)17, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_535.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2791327175672047686L);
        d = Long.reverse(0x3000000000000000L);
        e = Integer.reverse(0);
        f = Integer.reverse(0);
        g = 0 >>> 28 | 0 << ~28 + 1;
        h = (32 >>> 69 | 32 << -69) & 0xFFFFFFFF;
        i = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_535.b();
    }

    public static void a(NLoginCore_419 NLoginCore_4192, NLoginCore_276 NLoginCore_2762) {
        NLoginCore_370.b((String)NLoginCore_535.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), new Object[e]);
        switch (NLoginCore_060.ad[NLoginCore_4192.ordinal()]) {
            case 1: {
                NLoginCore_370.a(new NLoginCore_267(NLoginCore_2762, null), new NLoginInterface_016[f]);
                break;
            }
            case 2: 
            case 3: {
                NLoginCore_370.a(new NLoginCore_307(NLoginCore_2762, null), new NLoginInterface_016[g]);
            }
        }
    }
}

