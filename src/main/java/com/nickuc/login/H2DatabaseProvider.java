/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_200;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_021;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_282;
import java.io.File;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class H2DatabaseProvider
extends NLoginCore_021 {
    private static long q;
    private static int r;
    private static int var_int_a;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private final String aA;
    private static int l;
    private static int ai;
    private static int am;
    private static int al;
    private static int var_int_c;
    private static int ah;
    private static long t;
    private static int u;
    private static int ak;
    private static long var_long_e;
    private static int var_int_b;
    private static long s;
    private static long ad;
    private final NLoginCore_282 var_com_nickuc_login_NLoginCore_282_a;
    private static int z;
    private static long aa;
    @Nullable
    private final String aB;
    private static int j;
    @Nullable
    private final Object var_java_lang_Object_e;
    private final Properties var_java_util_Properties_c;
    private static long p;
    private static long v;
    private static long w;
    private static int i;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static int ap;
    private static int ab;
    private static int h;
    private static int g;
    private static int ac;
    private static int an;
    private final Constructor<?> var_java_lang_reflect_Constructor____c;
    private static int ao;
    private static int o;
    private static int f;
    private static int af;
    private static int k;
    private static int ag;
    private static int ae;
    private static long var_long_c;
    private static int x;
    private static int aj;
    private static int y;
    private static int m;

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return NLoginCore_036.var_com_nickuc_login_NLoginCore_036_g;
    }

    @Override
    protected Connection java_sql_Connection_c() {
        try {
            Object t;
            if (this.var_com_nickuc_login_NLoginCore_282_a.compareTo(NLoginCore_282.var_com_nickuc_login_NLoginCore_282_c) >= 0) {
                Object[] objectArray = new Object[ae];
                objectArray[H2DatabaseProvider.af] = this.aA;
                objectArray[H2DatabaseProvider.ag] = this.var_java_util_Properties_c;
                objectArray[H2DatabaseProvider.ah] = this.aB;
                objectArray[H2DatabaseProvider.ai] = this.var_java_lang_Object_e;
                objectArray[H2DatabaseProvider.aj] = ak != 0;
                t = this.var_int_c.newInstance(objectArray);
            } else {
                Object[] objectArray = new Object[al];
                objectArray[H2DatabaseProvider.am] = this.aA;
                objectArray[H2DatabaseProvider.an] = this.var_java_util_Properties_c;
                t = this.var_int_c.newInstance(objectArray);
            }
            Object t2 = t;
            return (Connection)t2;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            if (reflectiveOperationException.getCause() instanceof SQLException) {
                throw (SQLException)reflectiveOperationException.getCause();
            }
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    private static String a(int n, long l) {
        l ^= 0xAL;
        l ^= 0xC6AFFD1897C1CE22L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(13 + 56), (byte)(68 + 15), (byte)(45 + 2), 67, (byte)(22 + 44), (byte)(18 + 49), (byte)(5 + 42), 80, (byte)(30 + 45), (byte)(64 + 3), (byte)(74 + 9), (byte)(24 + 29), (byte)(44 + 36), (byte)(8 + 89), (byte)(90 + 10), (byte)(59 + 41), (byte)(66 + 39), (byte)(104 + 6), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸࠀࠎߧࠔࠕࠋ߹ࠊࠕࠍࠇࠔࠖࠋ࠙", (byte)44, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            H2DatabaseProvider.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = 131072 >>> 241 | 131072 << -241;
        var_int_b = 0 >>> 179 | 0 << -179;
        var_int_c = 0 >>> 66 | 0 << -66;
        d = Long.reverse(5461652613437406826L);
        var_long_e = Long.reverse(0x5000000000000000L);
        f = Integer.reverse(0x40000000);
        g = (0 >>> 214 | 0 << -214) & 0xFFFFFFFF;
        h = (16 >>> 132 | 16 << -132) & 0xFFFFFFFF;
        i = Integer.reverse(-1610612736);
        j = 0 >>> 34 | 0 << ~34 + 1;
        k = 0x8000000 >>> 251 | 0x8000000 << -251;
        l = Integer.reverse(0x40000000);
        m = Integer.reverse(-1073741824);
        n = (128 >>> 197 | 128 << ~197 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Long.reverse(5461652613437406826L);
        q = Long.reverse(0x5000000000000000L);
        r = 2 >>> 160 | 2 << ~160 + 1;
        s = Long.reverse(5461652613437406826L);
        t = Long.reverse(0x5000000000000000L);
        u = Integer.reverse(-1073741824);
        v = Long.reverse(5461652613437406826L);
        w = Long.reverse(0x5000000000000000L);
        x = Integer.reverse(0);
        y = (16384 >>> 172 | 16384 << -172) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        aa = Long.reverse(2002888099616865898L);
        ab = Integer.reverse(-1610612736);
        ac = (-1 >>> 100 | -1 << ~100 + 1) & 0xFFFFFFFF;
        ad = Long.reverse(2002888099616865898L);
        ae = Integer.reverse(-1610612736);
        af = Integer.reverse(0);
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = 0x1000000 >>> 119 | 0x1000000 << ~119 + 1;
        ai = Integer.reverse(-1073741824);
        aj = (2 >>> 159 | 2 << ~159 + 1) & 0xFFFFFFFF;
        ak = 0 >>> 220 | 0 << ~220 + 1;
        al = (2 >>> 32 | 2 << -32) & 0xFFFFFFFF;
        am = 0 >>> 1 | 0 << ~1 + 1;
        an = Integer.reverse(Integer.MIN_VALUE);
        ao = 49152 >>> 45 | 49152 << ~45 + 1;
        ap = (384 >>> 102 | 384 << ~102 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ao];
        var_java_lang_String_arr_b = new String[ap];
        H2DatabaseProvider.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(H2DatabaseProvider.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ӐӲӴӔӸԗԏԥԑӠԞԔԢԜӥԊԬԫԣԩԣӸ", (byte)81, 68), H2DatabaseProvider.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧ࡯ࡽࡖࢃࢄࡺࡨࡹࢄࡼࡶࢃࢅࡺ࢈Ԃ", (byte)81, 67) + string + NLoginCore_387.B("ś", (byte)81, 66) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 6232033446920573906L;
        long l = var_long_c ^ 0xC6AFFD1897C1CE22L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(65 + 4), (byte)(3 + 80), (byte)(11 + 36), (byte)(16 + 51), (byte)(55 + 11), (byte)(38 + 29), (byte)(15 + 32), (byte)(6 + 74), (byte)(73 + 2), (byte)(11 + 56), (byte)(7 + 76), (byte)(48 + 5), (byte)(79 + 1), (byte)(9 + 88), (byte)(31 + 69), (byte)(70 + 30), 105, 110, (byte)(79 + 24)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
                    H2DatabaseProvider.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ģŌĒĴņŖķŇŐĹşŖŞŒĢĻŢĴŁœŋŚśĩĬŀīŏŦőŁĲŒŷĳŌļŭŒœūĳŸŇ", (byte)48, 65);
                    H2DatabaseProvider.var_java_lang_String_arr_b[1] = NLoginCore_027.D("҆ҵҺҏҖҋҎӄӄҽ҂҈ҞҾ҆ҥӂӅӆҪҝӉҧҿҔҏӎңӇӍӄӊҘҲҬӑӖҫӠӕәӞҴҭ", (byte)48, 68);
                    H2DatabaseProvider.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ՄՖԞՠԽՂՔ՝՜՞ՏԴ", (byte)48, 70);
                    H2DatabaseProvider.var_java_lang_String_arr_b[3] = NLoginCore_027.C("үҠҝӂүѾҬҭ҄ӃҲҍ", (byte)48, 67);
                    H2DatabaseProvider.var_java_lang_String_arr_b[4] = NLoginCore_575.F("ՖՇՄթՖԥՓՔԫժՙԴ", (byte)48, 70);
                    H2DatabaseProvider.var_java_lang_String_arr_b[5] = NLoginCore_384.D("ѷҵҌҊҎҒѼӆҗӆҨ҈҅ҦҔ҆ҜӎҧӆӃҫҘҙ", (byte)48, 68);
                    continue block7;
                }
                case 1: {
                    H2DatabaseProvider.var_java_lang_String_arr_b[0] = NLoginCore_453.C("҉ҲѸҚҬҼҝҭҶҟӅҼӄҸ҈ҡӈҚҧҹұӀӁҏҒҦґҵӌҷҧҘһӒҚҮӗӟҼӐҹӥӦҭ", (byte)48, 67);
                    H2DatabaseProvider.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ĠŏŔĩİĥĨŞŞŗĜĢĸŘĠĿŜşŠńķţŁřĮĩŨĽšŧŞŤłňůţŪĽļſűŗŸŇ", (byte)48, 65);
                    H2DatabaseProvider.var_java_lang_String_arr_b[2] = NLoginCore_453.F("ՕԶԼՕգՀի՝բժՃԴ", (byte)48, 70);
                    H2DatabaseProvider.var_java_lang_String_arr_b[3] = NLoginCore_384.A("ĕġņķļĭĝŝŝēŃŔģŅŦŞłĤşŉōŅĲĳ", (byte)48, 65);
                    H2DatabaseProvider.var_java_lang_String_arr_b[4] = NLoginCore_446.F("ԥ՞԰Ց՛՚ՓբաԷ՗զԯ՟իՅբԾեճԸՒԿՀ", (byte)48, 70);
                    H2DatabaseProvider.var_java_lang_String_arr_b[5] = NLoginCore_173.B("đŏĦĤĨĬĖŠıŠłĲĜĞĘİŚŪŀŊŗśĲĳ", (byte)48, 66);
                    continue block7;
                }
                case 2: {
                    H2DatabaseProvider.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՅԸՙԼՕԩբԸիԬ՝Դ", (byte)48, 70);
                    continue block7;
                }
                case 4: {
                    H2DatabaseProvider.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ҰҠҨҼҼҠҸӀқҖғҖӁӊҋҿҍӈҝӋӋӁҘҙ", (byte)48, 68);
                }
            }
        }
    }

    private H2DatabaseProvider(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_282 NLoginCore_2822, File file, Properties properties, @Nullable String string, @Nullable Object object) {
        Serializable serializable;
        NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[var_int_a];
        NLoginInterface_034Array[H2DatabaseProvider.var_int_b] = NLoginCore_282.a(NLoginCore_2822);
        NLoginCore_200 NLoginCore_200 = NLoginInterface_0112.com_nickuc_login_NLoginCore_583_a().com_nickuc_login_NLoginCore_200_a(NLoginInterface_034Array);
        try {
            Constructor<?> constructor;
            serializable = NLoginCore_200.loadClass((String)H2DatabaseProvider.c("㺀", (int)var_int_c, (long)(d ^ var_long_e)));
            if (NLoginCore_2822 == NLoginCore_282.var_com_nickuc_login_NLoginCore_282_b) {
                Class[] classArray = new Class[f];
                classArray[H2DatabaseProvider.g] = String.class;
                classArray[H2DatabaseProvider.h] = Properties.class;
                constructor = ((Class)serializable).getConstructor(classArray);
            } else {
                Class[] classArray = new Class[i];
                classArray[H2DatabaseProvider.j] = String.class;
                classArray[H2DatabaseProvider.k] = Properties.class;
                classArray[H2DatabaseProvider.l] = String.class;
                classArray[H2DatabaseProvider.m] = Object.class;
                classArray[H2DatabaseProvider.n] = Boolean.TYPE;
                constructor = ((Class)serializable).getConstructor(classArray);
            }
            this.var_int_c = (int)constructor;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
        serializable = file.getParentFile();
        if (!((File)serializable).exists() && !((File)serializable).mkdirs()) {
            throw new RuntimeException((String)H2DatabaseProvider.c("㺃", (int)o, (long)(p ^ q)) + serializable + (String)H2DatabaseProvider.c("㺆", (int)r, (long)(s ^ t)));
        }
        String string2 = file.getAbsolutePath();
        if (string2.endsWith((String)H2DatabaseProvider.c("㺉", (int)u, (long)(v ^ w)))) {
            string2 = string2.substring(x, string2.length() - ((String)H2DatabaseProvider.c("㺌", (int)(y & z), (long)aa)).length());
        }
        this.var_com_nickuc_login_NLoginCore_282_a = NLoginCore_2822;
        this.aA = (String)H2DatabaseProvider.c("㺏", (int)(ab & ac), (long)ad) + string2;
        this.var_java_util_Properties_c = properties;
        this.aB = string;
        this.var_java_lang_Object_e = object;
    }

    public static H2DatabaseProvider a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_282 NLoginCore_2822, File file, Properties properties, @Nullable String string, @Nullable Object object) {
        return new H2DatabaseProvider(NLoginInterface_0112, NLoginCore_2822, file, properties, string, object);
    }

    public static H2DatabaseProvider a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_282 NLoginCore_2822, File file, Properties properties) {
        return H2DatabaseProvider.a(NLoginInterface_0112, NLoginCore_2822, file, properties, null, null);
    }
}

