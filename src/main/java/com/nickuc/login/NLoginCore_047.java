/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_371;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_259;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_047 {
    private static int var_int_c;
    private static int var_int_b;
    private static int l;
    private static int var_int_i;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int d;
    @Nullable
    private final UUID var_java_util_UUID_i;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static long f;
    private static int h;
    private static long j;
    private static int var_int_a;
    private static long g;

    @Generated
    public NLoginCore_047(@Nullable UUID uUID) {
        this.var_java_util_UUID_i = uUID;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_047.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ӧԉԋӫԏԮԦԼԨӷԵԫԹԳӼԡՃՂԺՀԺԏ", (byte)3, 70), NLoginCore_047.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("èõô·÷óî÷Ăñ¾üĀùüĂÄњзщдєьѥѦњљѝќъєÞ", (byte)3, 65) + string + NLoginCore_110.F("ӹ", (byte)3, 70) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x33L;
        l ^= 0x80180106A0FE3FA8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(12 + 57), (byte)(71 + 12), (byte)(27 + 20), (byte)(44 + 23), (byte)(31 + 35), 67, (byte)(23 + 24), (byte)(6 + 74), (byte)(49 + 26), (byte)(26 + 41), (byte)(33 + 50), (byte)(48 + 5), (byte)(9 + 71), (byte)(39 + 58), (byte)(33 + 67), (byte)(28 + 72), (byte)(84 + 21), 110, (byte)(50 + 53)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢭࢊ࢜ࢇࢧ࢟ࢸࢹࢭࢬࢰࢯ࢝ࢧ", (byte)28, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_047.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_047.c("㺀", (int)e, (long)(f ^ g)) + this.java_util_UUID_b() + (String)NLoginCore_047.c("㺃", (int)(h & var_int_i), (long)j);
    }

    public boolean a(NLoginCore_116<?> NLoginInterface_0112) {
        return (this.var_java_util_UUID_i != null && NLoginCore_371.a(NLoginInterface_0112, this.var_java_util_UUID_i) ? var_int_c : d) != 0;
    }

    public boolean a(@Nullable NLoginCore_259 NLoginCore_2592) {
        return (this.var_java_util_UUID_i != null && NLoginCore_371.a(NLoginCore_2592, this.var_java_util_UUID_i) ? var_int_a : var_int_b) != 0;
    }

    static {
        var_int_a = 256 >>> 168 | 256 << -168;
        var_int_b = 0 >>> 210 | 0 << ~210 + 1;
        var_int_c = 0x10000000 >>> 92 | 0x10000000 << -92;
        d = Integer.reverse(0);
        e = Integer.reverse(0);
        f = Long.reverse(8682684165395296526L);
        g = Long.reverse(-3746994889972252672L);
        h = 4 >>> 162 | 4 << -162;
        var_int_i = -1 >>> 15 | -1 << ~15 + 1;
        j = Long.reverse(-5440604266038578930L);
        k = (2 >>> 224 | 2 << ~224 + 1) & 0xFFFFFFFF;
        l = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_047.void_b();
    }

    private static void void_b() {
        int n;
        var_long_c = 8110370481538399774L;
        long l = var_long_c ^ 0x80180106A0FE3FA8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(23 + 46), (byte)(73 + 10), (byte)(33 + 14), (byte)(60 + 7), (byte)(11 + 55), (byte)(19 + 48), 47, (byte)(26 + 54), (byte)(41 + 34), (byte)(18 + 49), (byte)(18 + 65), (byte)(7 + 46), (byte)(64 + 16), (byte)(2 + 95), (byte)(20 + 80), 100, (byte)(100 + 5), (byte)(20 + 90), (byte)(90 + 13)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
                    NLoginCore_047.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԞԙՃԞԜՐըՙթ՝թծԧԨէՂ՛ՏԼՄգՋԯՆիՒ՜ՒԸրՓՓցՂոԽԸԾտգՙՓնՑ", (byte)45, 69);
                    NLoginCore_047.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ҶҴ҆҆ѳ҈ҷҦғҚ҇҄", (byte)45, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_047.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ѱѬҖѱѯңһҬҼҰҼӁѺѻҺҕҮҢҏҗҶҞ҂ҙҾҥүҥҋӓҦҦҵӅґӏҦӘҒҺҫӍҚҤ", (byte)45, 67);
                    NLoginCore_047.var_java_lang_String_arr_b[1] = NLoginCore_027.E("՞ԚԤՐԝՓըԡՃՉԴԱ", (byte)45, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_047.var_java_lang_String_arr_b[0] = NLoginCore_110.F("՝ՕԜ՗ԿԢէԤը՟ՀԱ", (byte)45, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_047.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ՕՂԱԵԲԱԹԳԨՠլիԹԯՉԼՃՐթՆՑյԼԽ", (byte)45, 69);
                }
            }
        }
    }

    @Nullable
    @Generated
    public UUID java_util_UUID_b() {
        return this.var_java_util_UUID_i;
    }
}

