/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_332;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_274
extends NLoginCore_353 {
    private static int p;
    private static int j;
    private static int k;
    private static int v;
    private static int y;
    private static long e;
    private static int var_int_c;
    private static int q;
    private static long m;
    private static int n;
    private static long w;
    private static int u;
    private static String[] b;
    private static long s;
    private static int i;
    private static final Set<String> var_java_util_Set_java_lang_String__d;
    private static int h;
    private static int o;
    private static int x;
    private static long var_long_c;
    private static String[] a;
    private static int t;
    private static long r;
    private static long g;
    private static int l;
    private static int f;
    private static long var_long_d;

    public NLoginCore_274(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_274.c("㺀", (int)var_int_c, (long)(var_long_d ^ e)), (String)NLoginCore_274.c("㺃", (int)f, (long)g), h != 0, i != 0, new String[j]);
    }

    static /* synthetic */ Set java_util_Set_b() {
        return var_java_util_Set_java_lang_String__d;
    }

    private static String a(int n, long l) {
        l ^= 0x18L;
        l ^= 0x48F1F2E29AF7D19AL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(81 + 2), (byte)(9 + 38), (byte)(64 + 3), (byte)(50 + 16), (byte)(13 + 54), (byte)(10 + 37), 80, (byte)(37 + 38), (byte)(62 + 5), (byte)(47 + 36), (byte)(29 + 24), (byte)(35 + 45), (byte)(62 + 35), (byte)(19 + 81), (byte)(36 + 64), (byte)(49 + 56), (byte)(39 + 71), (byte)(70 + 33)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҴӀӇҹӀҸҬӍӀһ", (byte)55, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_274.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.z, new Object[k]);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        if (var_java_util_Set_java_lang_String__d.remove(NLoginCore_277.getName())) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_274.c("㺀", (int)l, (long)m), new Object[n]);
            return;
        }
        var_java_util_Set_java_lang_String__d.add(NLoginCore_277.getName());
        new NLoginCore_332((NLoginType_008)this.a, NLoginCore_277, (stringArray.length > o && stringArray[p].equalsIgnoreCase((String)NLoginCore_274.c("㺃", (int)q, (long)(r ^ s))) ? t : u) != 0);
        NLoginCore_277.o((String)NLoginCore_274.c("㺆", (int)v, (long)w));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_274.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 66), NLoginCore_274.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߐߜߣߕߜߔ߈ߩߜߗў", (byte)28, 67) + string + NLoginCore_384.F("Ԓ", (byte)28, 70) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        var_long_c = -8462216638888597848L;
        long l = var_long_c ^ 0x48F1F2E29AF7D19AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(26 + 43), 83, (byte)(3 + 44), (byte)(61 + 6), (byte)(28 + 38), (byte)(61 + 6), 47, (byte)(70 + 10), (byte)(28 + 47), (byte)(8 + 59), (byte)(30 + 53), (byte)(35 + 18), (byte)(11 + 69), (byte)(53 + 44), (byte)(73 + 27), (byte)(51 + 49), (byte)(39 + 66), (byte)(37 + 73), (byte)(28 + 75)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
                    NLoginCore_274.b[0] = NLoginCore_324.A("ţŒŤŽŒźŭŞžŠŔŉ", (byte)65, 65);
                    NLoginCore_274.b[1] = NLoginCore_027.C("ӢҭҮӜӮӆӸӑӴӹәӏӊӔӌҿӫӸҾҺӯӎӋӌ", (byte)65, 67);
                    NLoginCore_274.b[2] = NLoginCore_427.E("ԨէՆՃձԱ՚կխոԼղսՂցՄՄդԺյՄ֌՛Չ֏սֆՃ֑մգ֑ց֋փՒ֗ջ֑֑ռծհե", (byte)65, 69);
                    NLoginCore_274.b[3] = NLoginCore_451.A("ŧŕżŘŶıŪŐūļĻŉ", (byte)65, 65);
                    NLoginCore_274.b[4] = NLoginCore_575.A("ŖŲŉŝŝļżŌŲŖļƃţŻŕŚŧŘƇťƁŤƋšŒůſōōƉŕŏŮŴżƔƑŷƙƚŲųƀũ", (byte)65, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_274.b[0] = NLoginCore_091.B("ŒĸŎŋžœŒĸŋŹŭœŏƄŵŒŅżƅśŦŧŔŕ", (byte)65, 66);
                    NLoginCore_274.b[1] = NLoginCore_387.A("ūĶķťŷŏƁŚŽƂšŃŞŐŵŸŷŢŅŠƍūţŌũŪŲũŶŪƔŐ", (byte)65, 65);
                    NLoginCore_274.b[2] = NLoginCore_201.F("ԨէՆՃձԱ՚կխոԼղսՂցՄՄդԺյՄ֌՛Չ֏սֆՃ֑մգ֑հՒ֐կհ֑լմ֎ֈջկռա֏֜ռհ։ըջճհձ", (byte)65, 70);
                    NLoginCore_274.b[3] = NLoginCore_451.F("Շ՘ՂգՌՇդՍՇԼՌձՎՐփ՞ծՔՓպՂ։ՐՑ", (byte)65, 70);
                    NLoginCore_274.b[4] = NLoginCore_575.D("ӍөӀӔӔҳӳӃөӍҳӺӚӲӌӑӞӏӾӜӸӛԂӘӉӦӶӄӄԀӌӆӚӨӧӳӑԌԖԈӨӢԙӓӭԚӹӸԚӴӜԓӻӮӫӬ", (byte)65, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_274.b[0] = NLoginCore_004.A("ŰőĹŋŔŵŠŬƀśŚťĸŗŚŦŲŚƂžŶŧŔŕ", (byte)65, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_274.b[0] = NLoginCore_223.C("ӌӅӁӎӴӨӨҶӴӒӥӫӲәҼӰӜӸәӟӠԄӋӌ", (byte)65, 67);
                }
            }
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        var_long_d = Long.reverse(1541538790031755601L);
        e = Long.reverse(0x1800000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(965078037728332113L);
        h = Integer.reverse(0);
        i = (0x4000000 >>> 26 | 0x4000000 << ~26 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = Integer.reverse(0);
        l = Integer.reverse(0x40000000);
        m = Long.reverse(965078037728332113L);
        n = Integer.reverse(0);
        o = (0x10000000 >>> 92 | 0x10000000 << ~92 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Integer.reverse(-1073741824);
        r = Long.reverse(1541538790031755601L);
        s = Long.reverse(0x1800000000000000L);
        t = (1 >>> 192 | 1 << ~192 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(0);
        v = 0x200000 >>> 211 | 0x200000 << ~211 + 1;
        w = Long.reverse(965078037728332113L);
        x = Integer.reverse(-1610612736);
        y = (5120 >>> 234 | 5120 << -234) & 0xFFFFFFFF;
        a = new String[x];
        b = new String[y];
        NLoginCore_274.void_b();
        var_java_util_Set_java_lang_String__d = new HashSet<String>();
    }
}

