/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_519;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_005
extends NLoginCore_353 {
    private static long h;
    private static int k;
    private static int l;
    private static int i;
    private static String[] a;
    private static long var_long_c;
    private static long e;
    private static String[] b;
    private static int j;
    private static int m;
    private static int f;
    private static long d;
    private static int g;
    private static int var_int_c;

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        NLoginCore_519.a((NLoginType_008)this.a, NLoginInterface_0422, this.j());
    }

    static {
        var_int_c = (0 >>> 152 | 0 << ~152 + 1) & 0xFFFFFFFF;
        d = Long.reverse(4993124620616283151L);
        e = Long.reverse(-720575940379279360L);
        f = 0x40000000 >>> 62 | 0x40000000 << ~62 + 1;
        g = (-1 >>> 92 | -1 << ~92 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-5527284108921195505L);
        i = (0 >>> 69 | 0 << ~69 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = (0 >>> 206 | 0 << -206) & 0xFFFFFFFF;
        l = Integer.reverse(0x40000000);
        m = Integer.reverse(0x40000000);
        a = new String[l];
        b = new String[m];
        NLoginCore_005.void_b();
    }

    public NLoginCore_005(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_005.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_005.c("㺃", (int)(f & g), (long)h), i != 0, j != 0, new String[k]);
    }

    private static void void_b() {
        int n;
        var_long_c = -1140280682385976670L;
        long l = var_long_c ^ 0xA8C8DCAC79E6BA89L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(25 + 44), (byte)(66 + 17), (byte)(29 + 18), (byte)(20 + 47), (byte)(18 + 48), 67, (byte)(10 + 37), (byte)(2 + 78), (byte)(34 + 41), (byte)(50 + 17), (byte)(43 + 40), (byte)(47 + 6), (byte)(7 + 73), (byte)(71 + 26), (byte)(66 + 34), (byte)(46 + 54), (byte)(83 + 22), (byte)(29 + 81), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(66 + 17)}, StandardCharsets.UTF_8));
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
                    NLoginCore_005.b[0] = NLoginCore_223.F("լբՉԨԻաթՏՒՔՖԻ", (byte)55, 70);
                    NLoginCore_005.b[1] = NLoginCore_223.A("įŒĺśŔłŝťĿĩŋłįĮŎŨľœţŨŨŹŀŁ", (byte)55, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_005.b[0] = NLoginCore_223.F("ՁեԸԿՋեժձՂՒԭՁթմ՛ՖՐռՍժխկՆՇ", (byte)55, 70);
                    NLoginCore_005.b[1] = NLoginCore_427.D("ҜҿҧӈӁүӊӒҬҖҸӚӑӑҘәӂһӗҜӤӐәӘӄӜҵӂӗӡӅҩ", (byte)55, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_005.b[0] = NLoginCore_223.A("ŚŧĴłĺĽũĶĨŭŬŀŊŋŒĲŢũŤŸĸŃŀŁ", (byte)55, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_005.b[0] = NLoginCore_223.F("ԸԶՉդկԩդՑՅձխէԯԳոՔԻէՒղ՘տՆՇ", (byte)55, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6FL;
        l ^= 0xA8C8DCAC79E6BA89L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(12 + 57), (byte)(26 + 57), (byte)(8 + 39), (byte)(31 + 36), (byte)(43 + 23), (byte)(45 + 22), (byte)(4 + 43), (byte)(54 + 26), (byte)(51 + 24), 67, (byte)(12 + 71), (byte)(33 + 20), (byte)(23 + 57), (byte)(46 + 51), (byte)(55 + 45), (byte)(46 + 54), (byte)(89 + 16), (byte)(39 + 71), (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.A("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҇ѸѣѴѲҏ҆Ґ", (byte)31, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_005.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_005.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.B("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 66), NLoginCore_005.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߄޵ޠޱޯߌ߃ߍэ", (byte)23, 67) + string + NLoginCore_004.F("ԍ", (byte)23, 70) + methodType.toString(), exception);
        }
    }
}

