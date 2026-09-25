/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

public abstract class PBKDF2HashProvider {
    private static int aa;
    private static int y;
    private static long s;
    private static long p;
    private static int o;
    private static int t;
    private static final SecureRandom var_java_security_SecureRandom_d;
    private static int j;
    private static long f;
    private static int ab;
    private static int m;
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int var_int_b;
    private static long w;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static int l;
    private static int e;
    private static long var_long_c;
    private static long n;
    private static int ac;
    private static int z;
    private static long i;
    private static int r;
    private static long v;
    private static int var_int_d;
    private static long g;
    private static int x;
    private static long q;
    private static int u;
    private static long k;

    protected static String c(String string, int n, String string2) {
        int n2 = PBKDF2HashProvider.b(string);
        byte[] byArray = new byte[n2 / t];
        var_java_security_SecureRandom_d.nextBytes(byArray);
        byte[] byArray2 = PBKDF2HashProvider.a(string, string2.toCharArray(), byArray, n, n2);
        Object[] objectArray = new Object[x];
        objectArray[PBKDF2HashProvider.y] = n;
        objectArray[PBKDF2HashProvider.z] = Base64.getUrlEncoder().withoutPadding().encodeToString(byArray);
        objectArray[PBKDF2HashProvider.aa] = Base64.getUrlEncoder().withoutPadding().encodeToString(byArray2);
        return String.format((String)PBKDF2HashProvider.c("㺀", (int)u, (long)(v ^ w)), objectArray);
    }

    protected static byte[] a(String string, char[] cArray, byte[] byArray, int n, int n2) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArray, byArray, n, n2);
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)PBKDF2HashProvider.c("㺀", (int)j, (long)k) + string);
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new RuntimeException((String)PBKDF2HashProvider.c("㺃", (int)(l & m), (long)PBKDF2HashProvider.n), invalidKeySpecException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((String)PBKDF2HashProvider.c("㺆", (int)o, (long)(p ^ q)) + string + (String)PBKDF2HashProvider.c("㺉", (int)r, (long)s), noSuchAlgorithmException);
        }
    }

    static {
        var_int_a = 0 >>> 220 | 0 << ~220 + 1;
        var_int_b = (0x1000000 >>> 152 | 0x1000000 << -152) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(0x8000000);
        e = (0 >>> 134 | 0 << ~134 + 1) & 0xFFFFFFFF;
        f = Long.reverse(-1279360561286176815L);
        g = Long.reverse(-8214565720323784704L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(6935205159037607889L);
        j = Integer.reverse(0x40000000);
        k = Long.reverse(6935205159037607889L);
        l = 6144 >>> 43 | 6144 << -43;
        m = (-1 >>> 61 | -1 << -61) & 0xFFFFFFFF;
        n = Long.reverse(6935205159037607889L);
        o = 4096 >>> 234 | 4096 << -234;
        p = Long.reverse(-1279360561286176815L);
        q = Long.reverse(-8214565720323784704L);
        r = Integer.reverse(-1610612736);
        s = Long.reverse(6935205159037607889L);
        t = 0x2000000 >>> 151 | 0x2000000 << ~151 + 1;
        u = Integer.reverse(0x60000000);
        v = Long.reverse(-1279360561286176815L);
        w = Long.reverse(-8214565720323784704L);
        x = (-2147483647 >>> 63 | -2147483647 << -63) & 0xFFFFFFFF;
        y = 0 >>> 253 | 0 << ~253 + 1;
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0x40000000);
        ab = -1073741823 >>> 62 | -1073741823 << -62;
        ac = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        PBKDF2HashProvider.b();
        var_java_security_SecureRandom_d = new SecureRandom();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(PBKDF2HashProvider.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.E("԰ՒՔԴ՘շկօձՀվմւռՅժ֌֋փ։փ՘", (byte)76, 69), PBKDF2HashProvider.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.B("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӞӚӨӬӱӶӠӥӰū", (byte)76, 66) + string + NLoginCore_027.E("Ղ", (byte)76, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -8360608143537636233L;
        long l = var_long_c ^ 0xF5BF86A782D686BDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(25 + 44), 83, (byte)(36 + 11), (byte)(31 + 36), (byte)(44 + 22), (byte)(58 + 9), (byte)(7 + 40), (byte)(43 + 37), 75, (byte)(40 + 27), (byte)(7 + 76), (byte)(25 + 28), (byte)(59 + 21), (byte)(44 + 53), (byte)(74 + 26), (byte)(94 + 6), (byte)(102 + 3), (byte)(45 + 65), (byte)(66 + 37)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(40 + 29), 83}, StandardCharsets.UTF_8));
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
                    PBKDF2HashProvider.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ġþěĀġĪôĎčİĔĘıòôĳċėĪĽŀĜûŀğþĳĖłňłąįĹňćĿďŏĩŕİŖĝ", (byte)27, 66);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[1] = NLoginCore_110.A("äĤëČĨÿĕíõĲĈý", (byte)27, 65);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[2] = NLoginCore_446.C("ѵѨҁѡѾњѭѾѱ҄ђїѸоѤҁѥѦ҉ѣѳќљњ", (byte)27, 67);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ġþěĀġĪôĎčİĖĳõöēùıėĐŀþĖĹĕļĘĠŇĄīĴğħĉļĦńĩňĢŁŎīŐĮŔŒĨĩŐĭłľšĨĩ", (byte)27, 65);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[4] = NLoginCore_004.A("ġþěĀġĪôĎčİĔĘıòôĳċėĪĽŀĜûŀğþĳĖłňłąįĹňćĿďŏĩŕİŖĝ", (byte)27, 65);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[5] = NLoginCore_138.D("еѵмѝѹѐѦоц҃љю", (byte)27, 68);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[6] = NLoginCore_384.B("ĀîħďğĤďĒîĸĭĤõõĖęĘĖ÷ęľıĈĉ", (byte)27, 66);
                    continue block7;
                }
                case 1: {
                    PBKDF2HashProvider.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ՃԠԽԢՃՌԖ԰ԯՒԶԺՓԔԖՕԭԹՌ՟բԾԝբՁԠՕԸդժդԧՀԺճծեՍ԰ԮՌըՇոեկ՚խ՛ճճքտ՝ՊՋ", (byte)27, 69);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[1] = NLoginCore_027.E("ՆԤԥՀԧԲԒԐԴՁՄԟ", (byte)27, 69);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[2] = NLoginCore_201.E("ՆԹՒԲՏԫԾՏՂՕԤՏ՜ԦԭՕ՗ԭՋԞԱԭԪԫ", (byte)27, 69);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[3] = NLoginCore_173.F("ՃԠԽԢՃՌԖ԰ԯՒԸՕԗԘԵԛՓԹԲբԠԸ՛Է՞ԺՂթԦՍՖՁՉԫ՞ՈզՋժՄգհՋռթչժՇՍՙՠվ՜ճՊՋ", (byte)27, 70);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[4] = NLoginCore_138.C("ѲяѬёѲѻхџўҁѥѩ҂ух҄ќѨѻҎґѭьґѰя҄ѧғҙғіљѼҙќҎѱҝҠҘ҉ѨѮ", (byte)27, 67);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[5] = NLoginCore_324.E("ԉԐԄԲԓՉԞԢԨՐԲԟ", (byte)27, 69);
                    PBKDF2HashProvider.var_java_lang_String_arr_b[6] = NLoginCore_324.F("ԢԐՉԱՁՆԱԴԐ՚ՏՈՕԥՍԨԝԬՌՠԵԭԪԫ", (byte)27, 70);
                    continue block7;
                }
                case 2: {
                    PBKDF2HashProvider.var_java_lang_String_arr_b[0] = NLoginCore_453.F("ԯԡԈԍՆՄԎՁՖՉԪԴԖԦՑՉԾՠԢՄԤՂՎՈԦՈԻՊՅՎՉՅ", (byte)27, 70);
                    continue block7;
                }
                case 4: {
                    PBKDF2HashProvider.var_java_lang_String_arr_b[0] = NLoginCore_091.D("лѶѰяіѺн҂ѣҁѥю", (byte)27, 68);
                }
            }
        }
    }

    protected static int b(String string) {
        try {
            return Mac.getInstance(string).getMacLength() * var_int_d;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((String)PBKDF2HashProvider.c("㺀", (int)e, (long)(f ^ g)) + string + (String)PBKDF2HashProvider.c("㺃", (int)h, (long)i), noSuchAlgorithmException);
        }
    }

    protected static boolean a(byte[] byArray, byte[] byArray2) {
        int n = byArray.length ^ byArray2.length;
        for (int i = var_int_a; i < byArray.length && i < byArray2.length; ++i) {
            n |= byArray[i] ^ byArray2[i];
        }
        return (n == 0 ? var_int_b : var_int_c) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x71L;
        l ^= 0xF5BF86A782D686BDL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(53 + 16), (byte)(47 + 36), 47, (byte)(56 + 11), (byte)(47 + 19), (byte)(35 + 32), (byte)(18 + 29), (byte)(62 + 18), (byte)(13 + 62), (byte)(9 + 58), (byte)(82 + 1), (byte)(47 + 6), (byte)(64 + 16), (byte)(93 + 4), 100, (byte)(7 + 93), (byte)(19 + 86), (byte)(50 + 60), (byte)(39 + 64)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.C("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣯ࣳࣽँआऋࣺࣵअ", (byte)125, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            PBKDF2HashProvider.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

