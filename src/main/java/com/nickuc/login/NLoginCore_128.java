/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.bcrypt.BCrypt
 *  com.nickuc.login.lib.bcrypt.BCrypt$Hasher
 *  com.nickuc.login.lib.bcrypt.BCrypt$Result
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_009;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
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
import lombok.Generated;

public class NLoginCore_128
implements NLoginInterface_009 {
    private static int g;
    private final BCrypt.Hasher var_com_nickuc_login_lib_bcrypt_BCrypt$Hasher_a;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static int r;
    private static long j;
    private static int o;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_c;
    private static int p;
    private static long var_long_c;
    private static int e;
    private static int n;
    private static long d;
    private static int i;
    private static int q;
    private static long l;
    private static int h;
    private static long m;
    private static int var_int_b;
    private static int f;
    private static int k;

    @Override
    public boolean v(String string) {
        return (!NLoginCore_128.boolean_w(string) ? o : p) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x2CL;
        l ^= 0xFFA8C0862AEDE88L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(54 + 15), (byte)(23 + 60), (byte)(22 + 25), 67, (byte)(2 + 64), (byte)(54 + 13), (byte)(6 + 41), (byte)(23 + 57), (byte)(11 + 64), (byte)(9 + 58), (byte)(82 + 1), (byte)(10 + 43), (byte)(26 + 54), (byte)(49 + 48), (byte)(25 + 75), 100, (byte)(66 + 39), (byte)(22 + 88), (byte)(100 + 3)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҿӅӄҸҼӁҹҼӏҼҼӇӒӌӔ", (byte)55, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_128.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 5528777821443263006L;
        long l = var_long_c ^ 0xFFA8C0862AEDE88L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(17 + 52), (byte)(3 + 80), (byte)(38 + 9), (byte)(51 + 16), (byte)(64 + 2), (byte)(41 + 26), (byte)(2 + 45), (byte)(26 + 54), (byte)(33 + 42), (byte)(15 + 52), (byte)(64 + 19), (byte)(47 + 6), 80, (byte)(5 + 92), 100, (byte)(86 + 14), (byte)(59 + 46), (byte)(60 + 50), (byte)(86 + 17)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_128.var_java_lang_String_arr_b[0] = NLoginCore_027.F("թն֑ի֏կն֥֞հ֑լ", (byte)104, 70);
                    NLoginCore_128.var_java_lang_String_arr_b[1] = NLoginCore_138.E("խչձՙ՜վ՞տցշկլ", (byte)104, 69);
                    NLoginCore_128.var_java_lang_String_arr_b[2] = NLoginCore_004.B("ƘƤƜƄƇƩƉƪƬƢƚƗ", (byte)104, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_128.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ƈƺƖƁǆƌƀƘǈǆǄƗ", (byte)104, 65);
                    NLoginCore_128.var_java_lang_String_arr_b[1] = NLoginCore_076.E("֕֏֙մ֑֔լռղ֢֙լ", (byte)104, 69);
                    NLoginCore_128.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ƈƀǈƝǋƵǇƞƜƽǄƗ", (byte)104, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_128.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ՐԵ՜ԴՄՕՂԷկԼԬԹԮՆՂԳՍՇճզՑչՀՁ", (byte)104, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_128.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ǁƛƝǈƭƅƥƞǉƪƢƍƆƎǉƵƸƳƳǛƵǏǋǌƙǞǞǤƿƟƺǈ", (byte)104, 66);
                }
            }
        }
    }

    static {
        var_int_a = 245760 >>> 108 | 245760 << ~108 + 1;
        var_int_b = Integer.reverse(0);
        var_int_c = (-1 >>> 254 | -1 << -254) & 0xFFFFFFFF;
        d = Long.reverse(5499164058363125042L);
        e = (32 >>> 165 | 32 << ~165 + 1) & 0xFFFFFFFF;
        f = (0 >>> 238 | 0 << ~238 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(-1);
        j = Long.reverse(5499164058363125042L);
        k = (Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << -62) & 0xFFFFFFFF;
        l = Long.reverse(8669698196031954226L);
        m = Long.reverse(0x3400000000000000L);
        n = Integer.reverse(0);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = 0 >>> 39 | 0 << ~39 + 1;
        q = Integer.reverse(-1073741824);
        r = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_128.b();
    }

    @Generated
    protected NLoginCore_128(BCrypt.Hasher hasher) {
        this.var_com_nickuc_login_lib_bcrypt_BCrypt$Hasher_a = hasher;
    }

    @Override
    public String java_lang_String_w(String string) {
        return this.var_com_nickuc_login_lib_bcrypt_BCrypt$Hasher_a.hashToString(NLoginCore_532.ac.r(), string.toCharArray());
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        if (!NLoginCore_128.boolean_w(string2)) {
            return g != 0;
        }
        String string3 = string2.contains((CharSequence)NLoginCore_128.c("㺀", (int)(h & i), (long)j)) ? string2.split((String)NLoginCore_128.c("㺃", (int)k, (long)(l ^ m)))[n] : string2;
        BCrypt.Result result = BCrypt.verifyer().verify(string.getBytes(StandardCharsets.UTF_8), string3.getBytes(StandardCharsets.UTF_8));
        return result.verified;
    }

    private static boolean boolean_w(String string) {
        return (string.length() == var_int_a && string.startsWith((String)NLoginCore_128.c("㺀", (int)(var_int_b & var_int_c), (long)d)) ? e : f) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_128.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 67), NLoginCore_128.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԓԙԘԌԐԕԍԐԣԐԐԛԦԠԨƛ", (byte)97, 66) + string + NLoginCore_201.D("Ԓ", (byte)97, 68) + methodType.toString(), exception);
        }
    }
}

