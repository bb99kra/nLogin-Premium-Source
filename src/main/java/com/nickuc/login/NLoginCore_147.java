/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_147 {
    private static int i;
    private static int aa;
    private static long g;
    private static long h;
    private static long p;
    private static int var_int_b;
    private static long s;
    private static int var_int_a;
    private final String ay;
    private static int u;
    private static int l;
    private static int t;
    private static long j;
    private static int v;
    private static int e;
    private static long m;
    private static int ab;
    private static String[] var_java_lang_String_arr_a;
    private static int y;
    private final String az;
    private static int w;
    private final String ax;
    private final String aw;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private final Properties var_java_util_Properties_b;
    private static long k;
    private static int z;
    private static long x;
    private static int o;
    private static long d;
    private static int q;
    private static long n;
    private static long r;
    private final int G;
    private static long c;

    private static void b() {
        int n;
        c = 7848512995458722243L;
        long l = c ^ 0xE9C4092E4C3DA2C3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(66 + 3), (byte)(36 + 47), (byte)(14 + 33), (byte)(54 + 13), 66, (byte)(23 + 44), (byte)(21 + 26), (byte)(34 + 46), (byte)(33 + 42), (byte)(51 + 16), (byte)(53 + 30), (byte)(12 + 41), (byte)(60 + 20), (byte)(30 + 67), (byte)(84 + 16), 100, (byte)(69 + 36), (byte)(30 + 80), (byte)(19 + 84)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
                    NLoginCore_147.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ĊĹĜłČĩłĬĩŀŏŌİŃŇĹĬŉęĭĸĸřŚšĶĿĶĳřġĹĹŅŅĬśŪĮňŮľĭĻ", (byte)42, 65);
                    NLoginCore_147.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ҞѧѮҡѩѮүҟѲҳ҉҈ҫңҥҋһѴҼҹҠҙ҆҇", (byte)42, 67);
                    NLoginCore_147.var_java_lang_String_arr_b[2] = NLoginCore_004.B("ĿĻĞįņĿĨğňĽŉĳŋĢĸŕŕļŖļŕŉřęĸįĥįģĹřľŇĵŝřŦŭůňŀŌłŪŕīİŖůŎŔŧŀŉņŇ", (byte)42, 66);
                    NLoginCore_147.var_java_lang_String_arr_b[3] = NLoginCore_453.E("ՖԳԻՖԛԬՅԴՇ՝ՇՖՠ՞՘՟ՂԹՒԻԾԽհՏՃդՐՖՅիծՑՈղԼջխձտցդհեՎ", (byte)42, 69);
                    NLoginCore_147.var_java_lang_String_arr_b[4] = NLoginCore_201.B("ĿŌŊĨĜŌŌđņŃĐņĩĪĦģĪŝňŞĮłĢŚŌĴņšĸţĪŤĶūŪťĿĮĪŀĦŔŠĻ", (byte)42, 66);
                    NLoginCore_147.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ҤҀҀҬ҃҂ҊұҞѱѱѻ", (byte)42, 68);
                    NLoginCore_147.var_java_lang_String_arr_b[6] = NLoginCore_138.F("ՑԚԡՔԜԡբՒԥզԼԻ՞Ֆ՘ԾծԧկլՓՌԹԺ", (byte)42, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_147.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ĊĹĜłČĩłĬĩŀŏŌİŃŇĹĬŉęĭĸĸřŚšĶĿĶĳřġĹŀŠŎįĿūŁţĴīŤĻ", (byte)42, 66);
                    NLoginCore_147.var_java_lang_String_arr_b[1] = NLoginCore_004.A("ľćĎŁĉĎŏĿĒœĦĖŉńŌĨĭĭĹħĬşĮłĹĥĻŨŦĻķł", (byte)42, 65);
                    NLoginCore_147.var_java_lang_String_arr_b[2] = NLoginCore_110.A("ĿĻĞįņĿĨğňĽŉĳŋĢĸŕŕļŖļŕŉřęĸįĥįģĹřľŇĵŝřŦŭůňŀŌŃĳŵŒŪŪŒŞŜļŝřņŇ", (byte)42, 65);
                    NLoginCore_147.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ңҀ҈ңѨѹҒҁҔҪҔңҭҫҥҬҏ҆ҟ҈ҋҊҽҜҐұҝңҒҸһҞҪ҄ҤӈӇҧҮӏҎүҦқ", (byte)42, 67);
                    NLoginCore_147.var_java_lang_String_arr_b[4] = NLoginCore_559.A("ĿŌŊĨĜŌŌđņŃĐņĩĪĦģĪŝňŞĮłĢŚŌĴņšĸţĪŤŉšĺşĺťĤœĭőłĻ", (byte)42, 65);
                    NLoginCore_147.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ҥѹѨѹҎҏҢҏңҮҬѻ", (byte)42, 68);
                    NLoginCore_147.var_java_lang_String_arr_b[6] = NLoginCore_173.A("ľćĎŁĉĎŏĿĒœĩĵŃęđĩŏĖķěěŢĽŜľŤĝŦũťņœ", (byte)42, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_147.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ѹ҅ҫ҉ѫґҚѱѮұѱҒҁ҅ҖҪѻҞѶѱ҈ѼҶҷҭҤѾӈҁҙҚӅ", (byte)42, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_147.var_java_lang_String_arr_b[0] = NLoginCore_453.D("҄ѻҠѦҬѪҠ҉ҲҦҳҴҌѶғҒүѳҋӀҞҴҚҔқҲҝҵҧӀҔһ", (byte)42, 68);
                }
            }
        }
    }

    public static NLoginCore_147 a(String string, String string2, String string3, String string4, Properties properties, int n) {
        int n2;
        String[] stringArray = string.split((String)NLoginCore_147.c("㺀", (int)q, (long)(r ^ s)));
        try {
            n2 = stringArray.length > t ? Integer.parseInt(stringArray[u]) : n;
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺃", (int)(v & w), (long)x) + stringArray[y]);
        }
        return NLoginCore_147.a(stringArray.length > 0 ? stringArray[z] : string, n2, string2, string3, string4, properties);
    }

    @Generated
    public String y() {
        return this.ax;
    }

    @Generated
    public String java_lang_String_j() {
        return this.az;
    }

    @Generated
    public String z() {
        return this.ay;
    }

    @Generated
    public Properties a() {
        return this.var_java_util_Properties_b;
    }

    public static NLoginCore_147 a(String string, int n, String string2, String string3, String string4, Properties properties) {
        return new NLoginCore_147(string, n, string2, string3, string4, properties);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_147.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.B("ÿġģăħņľŔŀďōŃőŋĔĹśŚŒŘŒħ", (byte)44, 66), NLoginCore_147.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸߞ߾ߴࠊࠐࠖࠉࠅࠌࠗࠖࠊ࠘ґ", (byte)44, 67) + string + NLoginCore_384.F("Ԣ", (byte)44, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public int int_j() {
        return this.G;
    }

    @Generated
    public String x() {
        return this.aw;
    }

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0xE9C4092E4C3DA2C3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(32 + 37), 83, (byte)(5 + 42), (byte)(40 + 27), (byte)(15 + 51), (byte)(5 + 62), (byte)(43 + 4), (byte)(42 + 38), (byte)(23 + 52), (byte)(7 + 60), (byte)(60 + 23), (byte)(27 + 26), (byte)(69 + 11), (byte)(65 + 32), (byte)(54 + 46), (byte)(95 + 5), (byte)(31 + 74), 110, (byte)(82 + 21)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.E("Քաՠԣգ՟՚գծ՝Ԫըլեըծ԰࢖ࢶࢬࣂࣈ࣎ࣁࢽࣄ࣏࣎ࣂ࣐", (byte)53, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_147.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private NLoginCore_147(String string, int n, String string2, String string3, String string4, Properties properties) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺀", (int)(var_int_a & var_int_b), (long)d));
        }
        if (n <= 0 || n > e) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺃", (int)f, (long)(g ^ h)) + n);
        }
        if (string2 == null || string2.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺆", (int)i, (long)(j ^ k)));
        }
        if (string3 == null) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺉", (int)l, (long)(m ^ NLoginCore_147.n)));
        }
        if (string4 == null) {
            throw new IllegalArgumentException((String)NLoginCore_147.c("㺌", (int)o, (long)p));
        }
        this.aw = string;
        this.G = n;
        this.ax = string2;
        this.ay = string3;
        this.az = string4;
        this.var_java_util_Properties_b = properties;
    }

    static {
        var_int_a = (0 >>> 161 | 0 << -161) & 0xFFFFFFFF;
        var_int_b = -1 >>> 235 | -1 << -235;
        d = Long.reverse(-6947547145719130314L);
        e = Integer.reverse(-65536);
        f = (16384 >>> 110 | 16384 << ~110 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-4353473760353724618L);
        h = Long.reverse(0x5C00000000000000L);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-4353473760353724618L);
        k = Long.reverse(0x5C00000000000000L);
        l = (196608 >>> 16 | 196608 << -16) & 0xFFFFFFFF;
        m = Long.reverse(-4353473760353724618L);
        n = Long.reverse(0x5C00000000000000L);
        o = (1024 >>> 200 | 1024 << ~200 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-6947547145719130314L);
        q = 0x5000000 >>> 152 | 0x5000000 << ~152 + 1;
        r = Long.reverse(-4353473760353724618L);
        s = Long.reverse(0x5C00000000000000L);
        t = (0x2000000 >>> 249 | 0x2000000 << -249) & 0xFFFFFFFF;
        u = 0x400000 >>> 214 | 0x400000 << ~214 + 1;
        v = Integer.reverse(0x60000000);
        w = (-1 >>> 14 | -1 << -14) & 0xFFFFFFFF;
        x = Long.reverse(-6947547145719130314L);
        y = (8 >>> 67 | 8 << ~67 + 1) & 0xFFFFFFFF;
        z = 0 >>> 170 | 0 << -170;
        aa = (7168 >>> 42 | 7168 << -42) & 0xFFFFFFFF;
        ab = (7168 >>> 106 | 7168 << -106) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[aa];
        var_java_lang_String_arr_b = new String[ab];
        NLoginCore_147.b();
    }
}

