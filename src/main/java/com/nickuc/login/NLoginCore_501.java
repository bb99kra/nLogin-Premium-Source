/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_336;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_501 {
    private static int d;
    private static int h;
    private final boolean at;
    private static int var_int_c;
    private static int j;
    private static int l;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private int ab = j;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private final boolean ar;
    private static long var_long_c;
    private static int g;
    private static long i;
    private static int e;
    private static int f;
    private final NLoginType_008 s;
    private final boolean as;

    public synchronized NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.com_nickuc_login_NLoginInterface_012_b().com_nickuc_login_NLoginCore_211_a();
    }

    @Nullable
    public synchronized NLoginCore_154 b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        int n;
        if (this.ab + var_int_a >= NLoginCore_211.size()) {
            return null;
        }
        int n2 = this.ab += var_int_b;
        NLoginCore_154 NLoginInterface_0122 = NLoginCore_211.a(n2, this.s.com_nickuc_login_NLoginCore_495_a().p()).com_nickuc_login_NLoginInterface_012_a();
        if (NLoginInterface_0122 instanceof NLoginCore_415 && !this.at) {
            return this.b(NLoginCore_277, NLoginCore_5092);
        }
        if (this.ar && !(NLoginInterface_0122 instanceof NLoginCore_336)) {
            return this.b(NLoginCore_277, NLoginCore_5092);
        }
        int n3 = n = NLoginInterface_0122 instanceof NLoginCore_395 && ((NLoginCore_395)NLoginInterface_0122).c(this.s) ? var_int_c : d;
        if (this.as && n == 0 || !this.as && n != 0) {
            return this.b(NLoginCore_277, NLoginCore_5092);
        }
        if (!NLoginInterface_0122.a(this.s, NLoginCore_277, NLoginCore_5092)) {
            return this.b(NLoginCore_277, NLoginCore_5092);
        }
        return NLoginInterface_0122;
    }

    private static void void_b() {
        int n;
        var_long_c = -1081908274134796261L;
        long l = var_long_c ^ 0x47E87147F7C95B75L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(13 + 56), (byte)(12 + 71), (byte)(28 + 19), (byte)(41 + 26), (byte)(16 + 50), (byte)(35 + 32), (byte)(17 + 30), (byte)(35 + 45), (byte)(43 + 32), (byte)(12 + 55), (byte)(11 + 72), (byte)(26 + 27), (byte)(3 + 77), (byte)(9 + 88), (byte)(76 + 24), 100, (byte)(81 + 24), (byte)(59 + 51), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_501.var_java_lang_String_arr_b[0] = NLoginCore_575.D("ӈӌӟӰӱӮԀӠӲӥԃӞӜӗӗӵӬӺԎӬӟӰӼӒԇӳӮԑԂԊԔӦ", (byte)69, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_501.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ӈӌӟӰӱӮԀӠӲӥԃӞӜӗӗӵӬӺԎӬӟӮӾԌԌԖӑӗԁӴӒӶ", (byte)69, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_501.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ӲӏӨӖӋӗӻԄӅӞӦӺԄԊӃӤӉӣԈӣӬӚӗӘ", (byte)69, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_501.var_java_lang_String_arr_b[0] = NLoginCore_453.F("գԵդըՊ՚Ջ՚իՋԻՉ", (byte)69, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x34L;
        l ^= 0x47E87147F7C95B75L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83, (byte)(6 + 41), (byte)(6 + 61), (byte)(45 + 21), (byte)(45 + 22), (byte)(6 + 41), (byte)(10 + 70), (byte)(47 + 28), (byte)(13 + 54), (byte)(79 + 4), (byte)(43 + 10), (byte)(35 + 45), (byte)(25 + 72), (byte)(18 + 82), (byte)(87 + 13), (byte)(50 + 55), (byte)(22 + 88), (byte)(22 + 81)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.F("ԟԬԫӮԮԪԥԮԹԨӵԳԷ԰ԳԹӻࢇࢊࡷࢗࡺ࢓࢈࢚࢕࢈", (byte)0, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_501.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_501 com_nickuc_login_NLoginCore_501_a() {
        NLoginCore_501 NLoginCore_5012 = new NLoginCore_501(this.s, this.ar, this.as, e != 0);
        NLoginCore_5012.ab = this.ab;
        return NLoginCore_5012;
    }

    @Generated
    public NLoginCore_501(NLoginType_008 NLoginType_008, boolean bl, boolean bl2, boolean bl3) {
        this.s = NLoginType_008;
        this.ar = bl;
        this.as = bl2;
        this.at = bl3;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0x1000000 >>> 248 | 0x1000000 << ~248 + 1) & 0xFFFFFFFF;
        var_int_c = (131072 >>> 241 | 131072 << -241) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = -1 >>> 208 | -1 << -208;
        g = Integer.reverse(0);
        h = Integer.reverse(-1);
        i = Long.reverse(-856311664099574001L);
        j = Integer.reverse(-1);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = (0x10000000 >>> 92 | 0x10000000 << -92) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_501.void_b();
    }

    public synchronized NLoginCore_154 com_nickuc_login_NLoginInterface_012_b() {
        if (this.ab == f) {
            throw new IllegalStateException((String)NLoginCore_501.c("㺀", (int)(g & h), (long)i));
        }
        return NLoginCore_211.a(this.ab, this.s.com_nickuc_login_NLoginCore_495_a().p()).com_nickuc_login_NLoginInterface_012_a();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_501.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.F("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)106, 70), NLoginCore_501.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ƶǃǂƅǅǁƼǅǐƿƌǊǎǇǊǐƒԞԡԎԮԑԪԟԱԬԟƨ", (byte)106, 65) + string + NLoginCore_091.D("ԭ", (byte)106, 68) + methodType.toString(), exception);
        }
    }
}

