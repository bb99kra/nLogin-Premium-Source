/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_410;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
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

public class NLoginCore_302
extends NLoginCore_410 {
    private static long o;
    private static String[] f;
    private final String L;
    private static int af;
    private static int z;
    private static long q;
    private static String[] var_java_lang_String_arr_e;
    private static long p;
    private final String M;
    private static int var_int_e;

    public NLoginCore_302(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, String string2, String string3, String string4) {
        super(NLoginType_008, NLoginCore_479, string, string2);
        this.L = string3;
        this.M = string4;
    }

    private static void void_b() {
        int n;
        o = 1667284027609101933L;
        long l = o ^ 0x4DC9C34CFE94B2E7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(45 + 24), (byte)(51 + 32), (byte)(5 + 42), (byte)(57 + 10), (byte)(44 + 22), (byte)(61 + 6), (byte)(44 + 3), (byte)(60 + 20), (byte)(36 + 39), (byte)(14 + 53), 83, (byte)(47 + 6), (byte)(69 + 11), (byte)(53 + 44), 100, (byte)(51 + 49), (byte)(57 + 48), (byte)(43 + 67), (byte)(71 + 32)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_302.f[0] = NLoginCore_453.D("ԊԮՅՈԚԾԮԵՁՍԓԝ", (byte)96, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_302.f[0] = NLoginCore_387.B("ƲƬźƭƉƳƴƜƝƼƸƇ", (byte)96, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_302.f[0] = NLoginCore_027.A("ƇƹƆƍƶƔƍƚƫƬƁƞƟƑƮƓƶƠƸƆƘƕƒƓ", (byte)96, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_302.f[0] = NLoginCore_427.F("մ֍֖գն՚միշիչիկմփ՞ւջ֟ն՛ղկհ", (byte)96, 70);
                }
            }
        }
    }

    @Override
    protected void a(NLoginCore_219 NLoginCore_2192, String string, String string2) {
        String string3 = NLoginCore_2192.java_lang_String_b(string2 + this.L);
        String string4 = null;
        if (this.M != null) {
            string4 = NLoginCore_2192.java_lang_String_b(string2 + this.M);
            if (((String)NLoginCore_302.c("㺀", (int)var_int_e, (long)(p ^ q))).equals(string4)) {
                string4 = null;
            }
        }
        this.a(string, string3, string4, null);
        ++this.l;
    }

    private static String a(int n, long l) {
        l ^= 8L;
        l ^= 0x4DC9C34CFE94B2E7L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(68 + 1), 83, (byte)(17 + 30), (byte)(12 + 55), (byte)(28 + 38), 67, (byte)(14 + 33), (byte)(48 + 32), (byte)(12 + 63), (byte)(51 + 16), (byte)(64 + 19), (byte)(19 + 34), (byte)(62 + 18), (byte)(21 + 76), (byte)(88 + 12), (byte)(39 + 61), (byte)(65 + 40), (byte)(42 + 68), (byte)(27 + 76)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("òÿþÁāýøāČûÈĆĊăĆČÎрљќѢѡѝсѢљѰѬп", (byte)8, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_302.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    static {
        var_int_e = 0 >>> 128 | 0 << ~128 + 1;
        p = Long.reverse(-5301499054767291160L);
        q = Long.reverse(0x1000000000000000L);
        z = Integer.reverse(Integer.MIN_VALUE);
        af = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_e = new String[z];
        f = new String[af];
        NLoginCore_302.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_302.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.E("Ԏ԰ԲԒԶՕՍգՏԞ՜Ւՠ՚ԣՈժթաէաԶ", (byte)42, 69), NLoginCore_302.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.A("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒ҄ҝҠҦҥҡ҅ҦҝҴҰ҃Ī", (byte)42, 65) + string + NLoginCore_324.B("č", (byte)42, 66) + methodType.toString(), exception);
        }
    }
}

