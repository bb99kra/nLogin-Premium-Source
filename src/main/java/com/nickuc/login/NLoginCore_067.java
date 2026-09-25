/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_067
extends NLoginCore_353 {
    private static int j;
    private static long e;
    private static String[] a;
    private static long k;
    private static int v;
    private static long p;
    private static long t;
    private static String[] b;
    private static int n;
    private static int g;
    private static long s;
    private static int i;
    private static int l;
    private static int r;
    private static int h;
    private static int f;
    private static int d;
    private static long o;
    private static int q;
    private static int u;
    private static int var_int_c;
    private static int m;
    private static long var_long_c;

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        Object[] objectArray = new Object[l];
        objectArray[NLoginCore_067.m] = NLoginCore_067.c("㺃", (int)n, (long)(o ^ p));
        objectArray[NLoginCore_067.q] = NLoginCore_067.c("㺆", (int)r, (long)(s ^ t));
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_067.c("㺀", (int)(i & j), (long)k), objectArray);
    }

    private static String a(int n, long l) {
        l ^= 0x18L;
        l ^= 0xAB0632D2E783DE6CL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(27 + 42), (byte)(30 + 53), (byte)(33 + 14), (byte)(20 + 47), (byte)(23 + 43), (byte)(35 + 32), (byte)(27 + 20), (byte)(28 + 52), (byte)(71 + 4), (byte)(52 + 15), (byte)(30 + 53), (byte)(4 + 49), 80, 97, (byte)(3 + 97), (byte)(26 + 74), (byte)(19 + 86), (byte)(3 + 107), (byte)(48 + 55)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӹӘӲӾӽԄԀԀԍԀӷԁԇ", (byte)86, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_067.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = 0 >>> 245 | 0 << -245;
        d = (-1 >>> 47 | -1 << ~47 + 1) & 0xFFFFFFFF;
        e = Long.reverse(2793422078774879394L);
        f = (0 >>> 64 | 0 << ~64 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0);
        i = (0x4000000 >>> 122 | 0x4000000 << ~122 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(-1);
        k = Long.reverse(2793422078774879394L);
        l = (128 >>> 134 | 128 << ~134 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0);
        n = (16384 >>> 237 | 16384 << -237) & 0xFFFFFFFF;
        o = Long.reverse(4522804335685149858L);
        p = Long.reverse(0x1800000000000000L);
        q = 0x200000 >>> 181 | 0x200000 << -181;
        r = 192 >>> 134 | 192 << -134;
        s = Long.reverse(4522804335685149858L);
        t = Long.reverse(0x1800000000000000L);
        u = (262144 >>> 48 | 262144 << -48) & 0xFFFFFFFF;
        v = (1024 >>> 136 | 1024 << -136) & 0xFFFFFFFF;
        a = new String[u];
        b = new String[v];
        NLoginCore_067.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_067.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.C("԰ՒՔԴ՘շկօձՀվմւռՅժ֌֋փ։փ՘", (byte)113, 67), NLoginCore_067.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣻࣚࣴऀࣿआंंएंࣹःउօ", (byte)113, 69) + string + NLoginCore_091.D("Ղ", (byte)113, 68) + methodType.toString(), exception);
        }
    }

    public NLoginCore_067(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_067.c("㺀", (int)(var_int_c & d), (long)e), null, f != 0, g != 0, new String[h]);
    }

    private static void void_b() {
        int n;
        var_long_c = 4982169318253667196L;
        long l = var_long_c ^ 0xAB0632D2E783DE6CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(10 + 59), (byte)(24 + 59), (byte)(33 + 14), (byte)(45 + 22), (byte)(43 + 23), (byte)(5 + 62), (byte)(44 + 3), (byte)(19 + 61), (byte)(15 + 60), (byte)(12 + 55), (byte)(26 + 57), (byte)(13 + 40), (byte)(42 + 38), (byte)(74 + 23), (byte)(60 + 40), (byte)(83 + 17), (byte)(62 + 43), (byte)(13 + 97), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_067.b[0] = NLoginCore_427.F("ԷՌիեՎԩՒՏՖՊՃԼ", (byte)56, 70);
                    NLoginCore_067.b[1] = NLoginCore_387.C("ҵӒҲүӏӘҎӎҪҹҼҸәӁӁұҦӔҽӗӋӢӡӖӥҬӂӚҭӤӋӏӳӵӍӈӥӯӄҶӛәһӠԂҽҺәӖӔӇӦӴӚӾӄӠӁӇԌӰԒӟӡ", (byte)56, 67);
                    NLoginCore_067.b[2] = NLoginCore_451.A("ĨĥūśĶĵłŚŞŃşŰųōŌųřĹűĵřŅłŃ", (byte)56, 65);
                    NLoginCore_067.b[3] = NLoginCore_324.E("ԧլգԸՏզի՟ԫԳԮթԲիՇձղտՊՉԿհՇՈ", (byte)56, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_067.b[0] = NLoginCore_138.D("ҏӅҷҷҧҰҩӏӈҟҩқұҶҚҝҟҼӔҦӦөҰұ", (byte)56, 68);
                    NLoginCore_067.b[1] = NLoginCore_453.C("ҵӒҲүӏӘҎӎҪҹҼҸәӁӁұҦӔҽӗӋӢӡӖӥҬӂӚҭӤӋӏӳӵӍӈӥӯӄҶӛәһӠԂҽҺәӖӔӇӦӴӟӨӦӖӋӻԋӢӟԔӠ", (byte)56, 67);
                    NLoginCore_067.b[2] = NLoginCore_559.B("ĨĥūśĶĵłŚŞŃŜņņŖŵńťİřźŏŕłŃ", (byte)56, 66);
                    NLoginCore_067.b[3] = NLoginCore_110.A("ĢŧŞĳŊšŦŚĦĮĩōŌŐŢūķŷŭőůŅłŃ", (byte)56, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_067.b[0] = NLoginCore_223.D("ӍҗҶҕҒӋӆҧһҫҨҴҷҭұӒҴҿӃҽӞөҰұ", (byte)56, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_067.b[0] = NLoginCore_027.C("ҢҖӈҬҚӗӚӎҖҰҠҝһҴҾқӤӅҦӕӃҳҰұ", (byte)56, 67);
                }
            }
        }
    }
}

