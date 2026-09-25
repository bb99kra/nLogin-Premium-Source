/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_372 {
    private static int j;
    private static long u;
    private static int y;
    private static long c;
    private static long var_long_b;
    private static int l;
    private static long x;
    private static int p;
    private static int k;
    private static int ae;
    private static int ab;
    private static int e;
    private static long o;
    private static long w;
    private static int var_int_a;
    private static int s;
    private static String[] var_java_lang_String_arr_a;
    private static int ac;
    private static long d;
    private static int g;
    private static int t;
    private static long r;
    private static int af;
    private static long i;
    private static int v;
    private static int f;
    private static int m;
    private static int ad;
    private static long h;
    private static int aa;
    private static long n;
    private static String[] var_java_lang_String_arr_b;
    private static long q;
    private static long z;

    private static String a(int n, long l) {
        l ^= 0xEL;
        l ^= 0xB2141C69DE9DE630L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(25 + 44), 83, (byte)(25 + 22), (byte)(60 + 7), (byte)(11 + 55), (byte)(3 + 64), (byte)(9 + 38), (byte)(69 + 11), (byte)(36 + 39), (byte)(27 + 40), (byte)(19 + 64), (byte)(42 + 11), (byte)(79 + 1), (byte)(34 + 63), (byte)(45 + 55), (byte)(65 + 35), (byte)(51 + 54), 110, (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟࢮࢲࢯࢤ࢈ࢼࢾࢶࢫ࢜ࢸ࢏ࣅ", (byte)35, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_372.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String ae() {
        return System.getProperty((String)NLoginCore_372.c("㺀", (int)p, (long)(q ^ r)));
    }

    public static OperatingSystemMXBean a() {
        return ManagementFactory.getOperatingSystemMXBean();
    }

    public static void c(int n) {
        try {
            Class[] classArray = new Class[aa];
            classArray[NLoginCore_372.ab] = Integer.TYPE;
            Object[] objectArray = new Object[ac];
            objectArray[NLoginCore_372.ad] = n;
            NLoginCore_546.a(System.class, ((String)NLoginCore_372.c("㺀", (int)(s & t), (long)u)).concat((String)NLoginCore_372.c("㺃", (int)v, (long)(w ^ x))).concat((String)NLoginCore_372.c("㺆", (int)y, (long)z)), classArray).invoke(null, objectArray);
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_372.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.F("ԚԼԾԞՂաՙկ՛Ԫը՞լզԯՔնյխճխՂ", (byte)54, 70), NLoginCore_372.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.C("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠦࠪࠧࠜࠀ࠴࠶࠮ࠣࠔ࠰ࠇ࠽ү", (byte)54, 67) + string + NLoginCore_453.D("ґ", (byte)54, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 254 | 0 << ~254 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(8409442463912470823L);
        d = Long.reverse(0x7000000000000000L);
        e = (0x800000 >>> 214 | 0x800000 << ~214 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(-1073741824);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(8409442463912470823L);
        i = Long.reverse(0x7000000000000000L);
        j = Integer.reverse(-1);
        k = (0 >>> 3 | 0 << -3) & 0xFFFFFFFF;
        l = (0 >>> 52 | 0 << ~52 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0x40000000);
        n = Long.reverse(8409442463912470823L);
        o = Long.reverse(0x7000000000000000L);
        p = 24576 >>> 13 | 24576 << ~13 + 1;
        q = Long.reverse(8409442463912470823L);
        r = Long.reverse(0x7000000000000000L);
        s = 0x1000000 >>> 182 | 0x1000000 << -182;
        t = Integer.reverse(-1);
        u = Long.reverse(338991931664541991L);
        v = Integer.reverse(-1610612736);
        w = Long.reverse(8409442463912470823L);
        x = Long.reverse(0x7000000000000000L);
        y = Integer.reverse(0x60000000);
        z = Long.reverse(338991931664541991L);
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = 0 >>> 26 | 0 << ~26 + 1;
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = 0 >>> 190 | 0 << ~190 + 1;
        ae = 0x38000000 >>> 187 | 0x38000000 << -187;
        af = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ae];
        var_java_lang_String_arr_b = new String[af];
        NLoginCore_372.b();
    }

    public static int u() {
        char c;
        String string = NLoginCore_372.ae();
        if (string.startsWith((String)NLoginCore_372.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)))) {
            string = string.substring(e, f);
        } else {
            int n = string.indexOf((String)NLoginCore_372.c("㺃", (int)g, (long)(h ^ i)));
            if (n != j) {
                string = string.substring(k, n);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = l; i < string.length() && NLoginCore_449.a(c = string.charAt(i)); ++i) {
            stringBuilder.append(c);
        }
        if (stringBuilder.length() == 0) {
            throw new RuntimeException((String)NLoginCore_372.c("㺆", (int)m, (long)(n ^ o)) + NLoginCore_372.ae());
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private static void b() {
        int n;
        c = -1975557250761478866L;
        long l = c ^ 0xB2141C69DE9DE630L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(15 + 54), (byte)(50 + 33), (byte)(22 + 25), (byte)(38 + 29), (byte)(17 + 49), (byte)(7 + 60), (byte)(15 + 32), (byte)(73 + 7), (byte)(5 + 70), (byte)(20 + 47), (byte)(30 + 53), (byte)(23 + 30), (byte)(62 + 18), (byte)(10 + 87), (byte)(88 + 12), 100, (byte)(46 + 59), (byte)(9 + 101), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
                    NLoginCore_372.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ё҄йїѕс҉ъ҅ѿ҅є", (byte)29, 67);
                    NLoginCore_372.var_java_lang_String_arr_b[1] = NLoginCore_138.F("ԍՏԎԢԐԮԳԧՙՑՊԡ", (byte)29, 70);
                    NLoginCore_372.var_java_lang_String_arr_b[2] = NLoginCore_138.D("јѯѿѻѵ҄ѴфѬ҈ъ҆ыяҀѴѵѥєїҊђѱљҌғѰҔҍҕѻѾҥјѥҀқҗҔқ҆Үң҆҈ҤҮѯұҏ҆ҶҶҒѿҀ", (byte)29, 68);
                    NLoginCore_372.var_java_lang_String_arr_b[3] = NLoginCore_138.F("ԐԠԐԾԦՌՐԶԶՕՋՓՓ՝ՏՒԭԵԾԿԺՕԬԭ", (byte)29, 70);
                    NLoginCore_372.var_java_lang_String_arr_b[4] = NLoginCore_453.C("ѢњѨффѓѨљѮѭює", (byte)29, 67);
                    NLoginCore_372.var_java_lang_String_arr_b[5] = NLoginCore_110.A("ĳćďģģóıĴĒôĔā", (byte)29, 65);
                    NLoginCore_372.var_java_lang_String_arr_b[6] = NLoginCore_138.D("ѓфф҆҄҈҆тїѶѧє", (byte)29, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_372.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԌԬԍԮԌԳՂԧԲԚՆԡ", (byte)29, 70);
                    NLoginCore_372.var_java_lang_String_arr_b[1] = NLoginCore_173.A("òćþìČēðĢĘęČā", (byte)29, 65);
                    NLoginCore_372.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ԥԼՌՈՂՑՁԑԹՕԗՓԘԜՍՁՂԲԡԤ՗ԟԾԦՙՠԽա՚բՈՋղԥԲՍըդաըՓջձՇՔ՘խոՠՏԿծ՛ՐփաՁֆփիֈՁ՘Չ", (byte)29, 69);
                    NLoginCore_372.var_java_lang_String_arr_b[3] = NLoginCore_451.A("ðĀðĞĆĬİĖĖĵĭĎđķĞĘďĕěĄłĵČč", (byte)29, 65);
                    NLoginCore_372.var_java_lang_String_arr_b[4] = NLoginCore_110.B("īĳāĂğðćĊĮĐĶā", (byte)29, 66);
                    NLoginCore_372.var_java_lang_String_arr_b[5] = NLoginCore_324.E("ԛԬՑՂԦՁԷՊԨ՚Լԡ", (byte)29, 69);
                    NLoginCore_372.var_java_lang_String_arr_b[6] = NLoginCore_091.B("êĳāđčĔĩĆñĬĐā", (byte)29, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_372.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ģÿĮĶāïĤĊõĺĩöĮĐĎđĂďÿąļĵČč", (byte)29, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_372.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ԲՃԽՇԕԑԥԯՐԕ԰԰ԙՑԙԟԛ՗ԬԾզԵԷՙԡըԤլՈԻՊՀ", (byte)29, 70);
                }
            }
        }
    }
}

