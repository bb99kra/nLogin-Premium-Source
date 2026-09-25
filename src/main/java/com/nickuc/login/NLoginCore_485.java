/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_524;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginCore_485
extends NLoginCore_353 {
    private static String[] b;
    private static int ad;
    private static int j;
    private static long v;
    private static int i;
    private static long q;
    private static int z;
    private static int w;
    private static long g;
    private static int ah;
    private static long d;
    private static long e;
    private static int ag;
    private static int ac;
    private static int t;
    private static int r;
    private static int var_int_c;
    private static long var_long_c;
    private static long y;
    private static long p;
    private static long h;
    private static String[] a;
    private static int f;
    private static long aa;
    private static int af;
    private static int ae;
    private static long n;
    private static long u;
    private static int k;
    private static int m;
    private static long ab;
    private static int l;
    private static int o;
    private static int ai;
    private static int s;
    private static long x;

    private static String a(int n, long l) {
        l ^= 0x1EL;
        l ^= 0x654723D62373D3A1L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(64 + 5), (byte)(5 + 78), 47, (byte)(66 + 1), (byte)(47 + 19), (byte)(46 + 21), (byte)(2 + 45), 80, (byte)(66 + 9), (byte)(49 + 18), (byte)(56 + 27), (byte)(29 + 24), (byte)(57 + 23), (byte)(57 + 40), (byte)(35 + 65), (byte)(36 + 64), (byte)(8 + 97), (byte)(107 + 3), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴӺԐԑԀӽԉԏӡԑ", (byte)91, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_485.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-2904363839179635279L);
        e = Long.reverse(0x7800000000000000L);
        f = (0x800000 >>> 247 | 0x800000 << ~247 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-2904363839179635279L);
        h = Long.reverse(0x7800000000000000L);
        i = Integer.reverse(0);
        j = 0x20000000 >>> 125 | 0x20000000 << ~125 + 1;
        k = Integer.reverse(0);
        l = (-1 >>> 66 | -1 << ~66 + 1) & 0xFFFFFFFF;
        m = (524288 >>> 146 | 524288 << ~146 + 1) & 0xFFFFFFFF;
        n = Long.reverse(-5786667600696752719L);
        o = Integer.reverse(-1073741824);
        p = Long.reverse(-2904363839179635279L);
        q = Long.reverse(0x7800000000000000L);
        r = Integer.reverse(0);
        s = -1 >>> 209 | -1 << ~209 + 1;
        t = (0x1000000 >>> 182 | 0x1000000 << ~182 + 1) & 0xFFFFFFFF;
        u = Long.reverse(-2904363839179635279L);
        v = Long.reverse(0x7800000000000000L);
        w = 0x5000000 >>> 152 | 0x5000000 << ~152 + 1;
        x = Long.reverse(-2904363839179635279L);
        y = Long.reverse(0x7800000000000000L);
        z = (0x600000 >>> 116 | 0x600000 << -116) & 0xFFFFFFFF;
        aa = Long.reverse(-2904363839179635279L);
        ab = Long.reverse(0x7800000000000000L);
        ac = 0 >>> 52 | 0 << ~52 + 1;
        ad = 491520 >>> 109 | 491520 << -109;
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = 524288 >>> 211 | 524288 << ~211 + 1;
        ag = Integer.reverse(0x3C000000);
        ah = (229376 >>> 15 | 229376 << -15) & 0xFFFFFFFF;
        ai = 0xE000000 >>> 89 | 0xE000000 << ~89 + 1;
        a = new String[ah];
        b = new String[ai];
        NLoginCore_485.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_485.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ŃťŧŇūƊƂƘƄœƑƇƕƏŘŽƟƞƖƜƖū", (byte)78, 65), NLoginCore_485.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӠӶӷӦӣӯӵӇӷů", (byte)78, 66) + string + NLoginCore_027.B("ŕ", (byte)78, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        NLoginCore_150.a(NLoginInterface_0422, (String)(NLoginCore_524.var_int_p != l ? NLoginCore_485.c("㺀", (int)m, (long)n) : NLoginCore_485.c("㺃", (int)o, (long)(p ^ q))), new Object[r]);
        NLoginCore_370.e(NLoginInterface_0422.getName() + (String)(NLoginCore_524.var_int_p != s ? NLoginCore_485.c("㺆", (int)t, (long)(u ^ v)) : NLoginCore_485.c("㺉", (int)w, (long)(x ^ y))) + (String)NLoginCore_485.c("㺌", (int)z, (long)(aa ^ ab)), new Object[ac]);
        int n = ad;
        if (stringArray.length > ae) {
            n = NLoginCore_449.a(stringArray[af], (Integer)n);
        }
        NLoginCore_524.a((NLoginType_008)this.a, n > 0 ? n : ag);
    }

    public NLoginCore_485(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_485.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_485.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, new String[k]);
    }

    private static void void_b() {
        int n;
        var_long_c = -8240834326065476117L;
        long l = var_long_c ^ 0x654723D62373D3A1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(66 + 3), (byte)(15 + 68), (byte)(46 + 1), (byte)(60 + 7), 66, (byte)(10 + 57), (byte)(17 + 30), (byte)(26 + 54), (byte)(45 + 30), (byte)(27 + 40), (byte)(52 + 31), (byte)(44 + 9), (byte)(43 + 37), (byte)(16 + 81), (byte)(79 + 21), (byte)(95 + 5), (byte)(92 + 13), (byte)(70 + 40), (byte)(27 + 76)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_485.b[0] = NLoginCore_223.A("ãĐÏĂðěïĒĉûÛå", (byte)15, 65);
                    NLoginCore_485.b[1] = NLoginCore_092.F("ԃԑԵ԰ԕԅԴԷՂԍԚԛԙՆՇՉԲՁԕՄԎ՗Ԟԟ", (byte)15, 70);
                    NLoginCore_485.b[2] = NLoginCore_138.A("êĐñëõĆĚøĞėÛďñğēóþĨģĪöăÞėĜåæĥĄĒħò", (byte)15, 65);
                    NLoginCore_485.b[3] = NLoginCore_091.F("ԳԜԃԄՁԉՇԶՃԧԗՐՉԱԋՓԭԱԖՔՑԵՒԯ՘ՕՇՖԯԾՎԙՕ՟Ծ՘գ՟ՋԢըԨՂԳ", (byte)15, 70);
                    NLoginCore_485.b[4] = NLoginCore_223.B("ÓÉÎčÙĕÜþėĔýĘñúîĦĦññæ÷ęðñ", (byte)15, 66);
                    NLoginCore_485.b[5] = NLoginCore_092.F("ԣԣӼԖՀԟԗԗԫԵԽՊՇԜԚԦԫԫՋՇՔ՗Ԟԟ", (byte)15, 70);
                    NLoginCore_485.b[6] = NLoginCore_324.F("ԹԙԷԚԹԾԊԵԫԸՆՇՃԙԠՅԵԨԨԩՐԮԻՕԩԜԚԲՓՙԶԠ", (byte)15, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_485.b[0] = NLoginCore_092.F("ՂԏԢԓԨԪՋԃԧԕԿԎԟԨԤԪՐՋԭԴԓԱԞԟ", (byte)15, 70);
                    NLoginCore_485.b[1] = NLoginCore_201.A("ÕãćĂç×ĆĉĔßíðđàÝěăğóĊøæÞëýíħħċāëĪ", (byte)15, 65);
                    NLoginCore_485.b[2] = NLoginCore_091.F("ԘԾԟԙԣԴՈԦՌՅԉԽԟՍՁԡԬՖՑ՘ԤՂՒԩԙՌԝՑՙՎԫԞ", (byte)15, 70);
                    NLoginCore_485.b[3] = NLoginCore_091.F("ԳԜԃԄՁԉՇԶՃԧԗՐՉԱԋՓԭԱԖՔՑԵՒԯ՘ՕՇՖԯԾՎԙԱԛ՘ԥ԰Ը՚ՃԸԩՆԳ", (byte)15, 70);
                    NLoginCore_485.b[4] = NLoginCore_004.F("ԁӷӼԻԇՃԊԬՅՂԭԷԌԇԦԩԵԝԮՒԨԡԞԟ", (byte)15, 70);
                    NLoginCore_485.b[5] = NLoginCore_091.C("ккГЭїжЮЮтьіЦкѠєкЦужкуўеж", (byte)15, 67);
                    NLoginCore_485.b[6] = NLoginCore_384.B("ċëĉìċĐÜćýĊĘęĕëòėćúúûĢĂĩĚĤĜęĜüýðď", (byte)15, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_485.b[0] = NLoginCore_092.D("ыЭўъыВОНљёѣЪ", (byte)15, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_485.b[0] = NLoginCore_076.C("ёЧШЙБкСТвпћЪ", (byte)15, 67);
                }
            }
        }
    }
}

