/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_166;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
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

public final class NLoginCore_369
extends NLoginCore_166 {
    private static int var_int_e;
    private static int af;
    private static long m;
    private static int ab;
    private static String[] f;
    private static long z;
    private static long y;
    private static int d;
    private static int x;
    private static String[] var_java_lang_String_arr_e;
    private static long n;

    private static void b() {
        int n;
        m = -6686755300657822303L;
        long l = m ^ 0xA5D366F30632791L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(11 + 58), 83, (byte)(19 + 28), (byte)(21 + 46), (byte)(5 + 61), (byte)(66 + 1), (byte)(21 + 26), (byte)(56 + 24), (byte)(27 + 48), (byte)(65 + 2), (byte)(9 + 74), (byte)(9 + 44), 80, (byte)(65 + 32), (byte)(59 + 41), (byte)(54 + 46), (byte)(80 + 25), (byte)(19 + 91), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_369.f[0] = NLoginCore_427.C("ҏѯѴҕѴғіѳѮѷѵѦ", (byte)35, 67);
                    NLoginCore_369.f[1] = NLoginCore_451.D("ѷ҄҄іҍ҄ѩѾҟҕѹѦ", (byte)35, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_369.f[0] = NLoginCore_027.C("ҕҍѱѓѲҒҏҎҀҚҁҔқҌѴҜ҃ҒҦҙѿҪѱѲ", (byte)35, 67);
                    NLoginCore_369.f[1] = NLoginCore_427.E("ԶԙԥՕԱՒԸԴԵԭՋԽԾ՝բԻ՟ԧԨԺԞ՛ԲԳ", (byte)35, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_369.f[0] = NLoginCore_324.D("ѥєїѨѺѰѩѾҌҠҞѵѱҁҔѽґѢѦҙѶ҄ѱѲ", (byte)35, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_369.f[0] = NLoginCore_384.B("ĸĽĭĔĳğĮĎāĴĺč", (byte)35, 66);
                }
            }
        }
    }

    public NLoginCore_369() {
        super((String)NLoginCore_369.c("㺀", (int)(d & var_int_e), (long)n), (String)NLoginCore_369.c("㺃", (int)x, (long)(y ^ z)));
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0xA5D366F30632791L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(52 + 17), (byte)(39 + 44), (byte)(23 + 24), (byte)(18 + 49), (byte)(14 + 52), (byte)(36 + 31), (byte)(32 + 15), (byte)(38 + 42), (byte)(53 + 22), (byte)(44 + 23), (byte)(78 + 5), (byte)(23 + 30), (byte)(43 + 37), (byte)(23 + 74), 100, (byte)(89 + 11), (byte)(33 + 72), 110, (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.A("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӟӒӫӠӴӶӉӃӪӪӭ", (byte)76, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_369.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_369.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.E("ԤՆՈԨՌիգչեԴղընհԹ՞րտշսշՌ", (byte)64, 69), NLoginCore_369.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.D("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴ࠽࠰ࡉ࠾ࡒࡔࠧࠡࡈࡈࡋӋ", (byte)64, 68) + string + NLoginCore_451.D("ү", (byte)64, 68) + methodType.toString(), exception);
        }
    }

    static {
        d = Integer.reverse(0);
        var_int_e = Integer.reverse(-1);
        n = Long.reverse(-6944222803990426427L);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Long.reverse(-8817720248976552763L);
        z = Long.reverse(0x1A00000000000000L);
        ab = Integer.reverse(0x40000000);
        af = 0x200000 >>> 116 | 0x200000 << -116;
        var_java_lang_String_arr_e = new String[ab];
        f = new String[af];
        NLoginCore_369.b();
    }
}

