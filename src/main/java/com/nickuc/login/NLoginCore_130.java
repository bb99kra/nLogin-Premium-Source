/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginInterface_009;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_130
implements NLoginInterface_009 {
    private static int j;
    private static long g;
    private static int m;
    private static int q;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static long e;
    private static int f;
    protected final String cm;
    private static long d;
    private static int i;
    private static long h;
    private static int p;
    private static long l;
    private static String[] var_java_lang_String_arr_a;
    private static int o;
    private static int var_int_b;
    private static int var_int_a;
    private static long k;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_130.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.D("ѹқҝѽҡӀҸӎҺ҉ӇҽӋӅҎҳӕӔӌӒӌҡ", (byte)52, 68), NLoginCore_130.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҸҶҺӁҰҸҙҿҽӉļ", (byte)52, 65) + string + NLoginCore_223.B("ġ", (byte)52, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean v(String string) {
        return string.contains((CharSequence)NLoginCore_130.c("㺀", (int)var_int_b, (long)(d ^ e)));
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        return var_int_a != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x31402F3E8CB24F3FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(64 + 19), (byte)(46 + 1), 67, (byte)(19 + 47), (byte)(58 + 9), (byte)(37 + 10), (byte)(35 + 45), (byte)(71 + 4), (byte)(19 + 48), (byte)(34 + 49), (byte)(32 + 21), (byte)(10 + 70), (byte)(2 + 95), (byte)(58 + 42), (byte)(34 + 66), (byte)(15 + 90), (byte)(48 + 62), (byte)(85 + 18)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(25 + 58)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.A("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҨҦҪұҠҨ҉үҭҹ", (byte)44, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_130.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    protected NLoginCore_130(String string) {
        this.cm = string;
    }

    private static void b() {
        int n;
        c = -2124070118351206535L;
        long l = c ^ 0x31402F3E8CB24F3FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), 69, (byte)(82 + 1), (byte)(42 + 5), (byte)(52 + 15), (byte)(24 + 42), (byte)(47 + 20), (byte)(15 + 32), (byte)(50 + 30), (byte)(44 + 31), (byte)(30 + 37), (byte)(12 + 71), (byte)(4 + 49), (byte)(12 + 68), (byte)(92 + 5), (byte)(37 + 63), (byte)(66 + 34), (byte)(91 + 14), (byte)(14 + 96), (byte)(26 + 77)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_130.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ԲԓՈԬԼԬԶ՜ԪԺԛԩ", (byte)100, 67);
                    NLoginCore_130.var_java_lang_String_arr_b[1] = NLoginCore_173.A("ƸƫƢƎƑǄƯƂƲƩƢƏ", (byte)100, 65);
                    NLoginCore_130.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ԒԙԹԼԗՔՓԓԪԹ՞ԩ", (byte)100, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_130.var_java_lang_String_arr_b[0] = NLoginCore_091.F("է։և֝֕՗֜ն֛֙տը", (byte)100, 70);
                    NLoginCore_130.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ƞƓƜƳƙƤƃƞǁƗƞƏ", (byte)100, 66);
                    NLoginCore_130.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ԲԸԳԏԗԯՌ԰ԸԼԸԩ", (byte)100, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_130.var_java_lang_String_arr_b[0] = NLoginCore_575.D("ՖՊՐ՝ԙԳԞԩ՜ՠՏՅՐՀՆԻգՂԦ՟ՈխԴԵ", (byte)100, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_130.var_java_lang_String_arr_b[0] = NLoginCore_446.B("ŽƫƲƭƴƴƂƷƇƣƦƼƙƨǎǐƎƌǌƦƑǓƚƛ", (byte)100, 66);
                }
            }
        }
    }

    static {
        var_int_a = (0 >>> 133 | 0 << -133) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        d = Long.reverse(-6998059780965949113L);
        e = Long.reverse(0x3C00000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-6998059780965949113L);
        h = Long.reverse(0x3C00000000000000L);
        i = (0x200000 >>> 149 | 0x200000 << -149) & 0xFFFFFFFF;
        j = Integer.reverse(0x40000000);
        k = Long.reverse(-6998059780965949113L);
        l = Long.reverse(0x3C00000000000000L);
        m = (512 >>> 169 | 512 << -169) & 0xFFFFFFFF;
        n = Integer.reverse(0);
        o = 0x1000000 >>> 88 | 0x1000000 << ~88 + 1;
        p = Integer.reverse(-1073741824);
        q = (0xC000000 >>> 58 | 0xC000000 << ~58 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_130.b();
    }

    @Override
    public String java_lang_String_w(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(this.cm);
            messageDigest.reset();
            messageDigest.update(string.getBytes());
            byte[] byArray = messageDigest.digest();
            Object[] objectArray = new Object[m];
            objectArray[NLoginCore_130.n] = new BigInteger(o, byArray);
            return String.format((String)NLoginCore_130.c("㺀", (int)f, (long)(g ^ h)) + (byArray.length << i) + (String)NLoginCore_130.c("㺃", (int)j, (long)(k ^ l)), objectArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }
}

