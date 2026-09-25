/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_026;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_189 {
    private static int ai;
    private static long f;
    private static int var_int_w;
    private static int ab;
    private static long ah;
    private static long aa;
    private static long d;
    private static long s;
    private String bL;
    private static int n;
    private static int y;
    private static long l;
    private static long x;
    private static long var_long_b;
    private static long i;
    private String bM;
    private static long ad;
    private String bN;
    private static long j;
    private String bK;
    private static int var_int_a;
    private static int t;
    private String bJ;
    private static long m;
    private static long o;
    private static String[] var_java_lang_String_arr_b;
    private final Locale var_java_util_Locale_a;
    private static int e;
    private static int h;
    private String bP;
    private String bI;
    private static long c;
    private static int aj;
    private static int af;
    private static long v;
    private static String[] var_java_lang_String_arr_a;
    private final long var_long_w;
    private static long g;
    private static int u;
    private static int k;
    private String bO;
    private static int q;
    private static long p;
    private static long ag;
    private static double ae;
    private static long ac;
    private static int z;
    private static long r;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_189.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.D("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 68), NLoginCore_189.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.F("չֆօՈֈքտֈ֓ւՏ֍֑֊֍֓Օࢺࣲࣣࣦࣩࣹࣶ࣫࣫ࣨ࣠ࣥࣟծ", (byte)90, 70) + string + NLoginCore_027.F("Ր", (byte)90, 70) + methodType.toString(), exception);
        }
    }

    private void aC() {
        if (this.bI == null) {
            this.bI = this.x((String)NLoginCore_189.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
            this.bJ = this.x((String)NLoginCore_189.c("㺃", (int)e, (long)(f ^ g)));
            this.bK = this.x((String)NLoginCore_189.c("㺆", (int)h, (long)(i ^ j)));
            this.bL = this.x((String)NLoginCore_189.c("㺉", (int)k, (long)(l ^ m)));
            this.bM = this.x((String)NLoginCore_189.c("㺌", (int)n, (long)(o ^ p)));
            this.bN = this.x((String)NLoginCore_189.c("㺏", (int)q, (long)(r ^ s)));
            this.bO = this.x((String)NLoginCore_189.c("㺒", (int)(t & u), (long)v));
            this.bP = this.x((String)NLoginCore_189.c("㺕", (int)var_int_w, (long)x));
        }
    }

    private String x(String string) {
        return new SimpleDateFormat(string, this.var_java_util_Locale_a).format(new Date(this.var_long_w));
    }

    public String aj() {
        this.aC();
        return this.bJ;
    }

    public NLoginCore_189(long l, Locale locale) {
        this.var_long_w = l;
        this.var_java_util_Locale_a = locale;
    }

    public String ap() {
        this.aC();
        return this.bP;
    }

    public String an() {
        this.aC();
        return this.bN;
    }

    public NLoginCore_189() {
        this(Locale.getDefault());
    }

    public String ak() {
        this.aC();
        return this.bK;
    }

    public String ao() {
        this.aC();
        return this.bO;
    }

    public NLoginCore_189(long l) {
        this(l, Locale.getDefault());
    }

    public NLoginCore_189(Locale locale) {
        this(System.currentTimeMillis(), locale);
    }

    public static String a(long l, long l2) {
        return NLoginCore_189.a(l, l2, y != 0);
    }

    private static void b() {
        int n;
        c = 1131126207817288100L;
        long l = c ^ 0x5A5715C04F04532BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(51 + 18), (byte)(45 + 38), (byte)(43 + 4), (byte)(40 + 27), 66, 67, (byte)(25 + 22), (byte)(9 + 71), (byte)(47 + 28), (byte)(15 + 52), (byte)(70 + 13), (byte)(9 + 44), (byte)(74 + 6), (byte)(23 + 74), (byte)(72 + 28), (byte)(16 + 84), (byte)(2 + 103), (byte)(33 + 77), (byte)(97 + 6)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
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
                    NLoginCore_189.var_java_lang_String_arr_b[0] = NLoginCore_223.A("žƀŞţžťƓŶƚŽƈű", (byte)85, 65);
                    NLoginCore_189.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ՃշՋՅջը՛Տ՟ֈՓՙ", (byte)85, 69);
                    NLoginCore_189.var_java_lang_String_arr_b[2] = NLoginCore_173.A("ŘŷƗƏƣƣƨƣƟŵƌű", (byte)85, 65);
                    NLoginCore_189.var_java_lang_String_arr_b[3] = NLoginCore_091.E("՛պՌՠ՗Ջ՝ղէևվՙ", (byte)85, 69);
                    NLoginCore_189.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ԫԋӷӬԦԲԬԟԞԟԭӼ", (byte)85, 68);
                    NLoginCore_189.var_java_lang_String_arr_b[5] = NLoginCore_324.D("ԛԤԬԊӰԌӽԯԍԦӿӼ", (byte)85, 68);
                    NLoginCore_189.var_java_lang_String_arr_b[6] = NLoginCore_201.A("ƣƚŞƄŢźŵżżšūű", (byte)85, 65);
                    NLoginCore_189.var_java_lang_String_arr_b[7] = NLoginCore_110.F("ճռպՅտ֎գ֊բՠհՙ", (byte)85, 70);
                    NLoginCore_189.var_java_lang_String_arr_b[8] = NLoginCore_451.D("ԙӫԚԋԩԓԟԌԍԦԱӼ", (byte)85, 68);
                    NLoginCore_189.var_java_lang_String_arr_b[9] = NLoginCore_091.F("դՋռէրհ֏՟ի֒հՙ", (byte)85, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_189.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ԎԌԮӬԁԡԋӾԮԳӶӼ", (byte)85, 68);
                    NLoginCore_189.var_java_lang_String_arr_b[1] = NLoginCore_110.E("ՠդՄՠՖ՛ՆձՄՑ՜ՙ", (byte)85, 69);
                    NLoginCore_189.var_java_lang_String_arr_b[2] = NLoginCore_453.C("ԚԖӦԍԜԥԪӽӽԵԓӼ", (byte)85, 67);
                    NLoginCore_189.var_java_lang_String_arr_b[3] = NLoginCore_092.B("ƠƀƟŵŶƂŦƀƈūƌű", (byte)85, 66);
                    NLoginCore_189.var_java_lang_String_arr_b[4] = NLoginCore_091.F("օեՂր՟փէծՋՅըՙ", (byte)85, 70);
                    NLoginCore_189.var_java_lang_String_arr_b[5] = NLoginCore_451.B("ƏŲƁƜŸƙŠƟƉƄƆƈƄŸƣƯƮƟƉƍƔſżŽ", (byte)85, 66);
                    NLoginCore_189.var_java_lang_String_arr_b[6] = NLoginCore_384.B("źşƗŴŻƄƛťŻŨƄƋƯżƀƬŲƬƞƌžƵżŽ", (byte)85, 66);
                    NLoginCore_189.var_java_lang_String_arr_b[7] = NLoginCore_324.C("ӟӫӷԢԪԠԥԤԐӭӭԹԇԅԧԧԦԺԯԵӷԊԇԈ", (byte)85, 67);
                    NLoginCore_189.var_java_lang_String_arr_b[8] = NLoginCore_201.D("ӧԇԣԤԙԑ԰ԔӱԌԭӼ", (byte)85, 68);
                    NLoginCore_189.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ƐūŽţƒƤźžŧƔƞű", (byte)85, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_189.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ſūśťŮšƕŤžŽŧƫƁƉƀưƑƍŽƢƗƥżŽ", (byte)85, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_189.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ƓŝƁƓſƕƚƀƤƚƦƂƉƙƍŬŬƇƆƊƷųƠƈųƒƯƽƟƼƔŽ", (byte)85, 66);
                }
            }
        }
    }

    public static String b(long l) {
        return NLoginCore_189.a(l, System.currentTimeMillis());
    }

    private static String a(int n, long l) {
        l ^= 0x78L;
        l ^= 0x5A5715C04F04532BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(41 + 28), 83, (byte)(7 + 40), (byte)(17 + 50), 66, (byte)(8 + 59), (byte)(42 + 5), (byte)(53 + 27), (byte)(52 + 23), (byte)(39 + 28), (byte)(29 + 54), (byte)(24 + 29), (byte)(59 + 21), (byte)(16 + 81), (byte)(56 + 44), (byte)(22 + 78), (byte)(7 + 98), (byte)(56 + 54), (byte)(83 + 20)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("Վ՛՚ԝ՝ՙՔ՝ը՗Ԥբզ՟բըԪ࢏ࣀࣀࢽࢵࢺࢴࢸࢻࢾࣇ࣎࣋", (byte)47, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_189.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String a(long l, long l2, boolean bl) {
        long l3 = Math.max(l, l2) - Math.min(l, l2);
        StringBuilder stringBuilder = new StringBuilder();
        NLoginCore_026[] NLoginCore_026Array = NLoginCore_026.values();
        int n = NLoginCore_026Array.length;
        for (int i = z; i < n; ++i) {
            long l4;
            NLoginCore_026 NLoginCore_026 = NLoginCore_026Array[i];
            if (bl && NLoginCore_026 == NLoginCore_026.var_com_nickuc_login_NLoginCore_026_d && l3 >= aa || (l4 = ((Long)NLoginCore_026.java_util_function_Function_a(NLoginCore_026).apply(l3)).longValue()) <= 0L) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append((String)NLoginCore_189.c("㺀", (int)ab, (long)ac));
            }
            stringBuilder.append(l4).append(NLoginCore_026.char_a(NLoginCore_026));
        }
        if (stringBuilder.length() == 0) {
            double d = (double)(l3 % ad) / ae;
            return d + (String)NLoginCore_189.c("㺃", (int)af, (long)(ag ^ ah));
        }
        return stringBuilder.toString();
    }

    public String al() {
        this.aC();
        return this.bL;
    }

    public String am() {
        this.aC();
        return this.bM;
    }

    public String ai() {
        this.aC();
        return this.bI;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2707130259706826224L);
        d = Long.reverse(0x1E00000000000000L);
        e = (2 >>> 65 | 2 << -65) & 0xFFFFFFFF;
        f = Long.reverse(2707130259706826224L);
        g = Long.reverse(0x1E00000000000000L);
        h = 512 >>> 104 | 512 << ~104 + 1;
        i = Long.reverse(2707130259706826224L);
        j = Long.reverse(0x1E00000000000000L);
        k = (0x30000000 >>> 124 | 0x30000000 << ~124 + 1) & 0xFFFFFFFF;
        l = Long.reverse(2707130259706826224L);
        m = Long.reverse(0x1E00000000000000L);
        n = (0x40000000 >>> 252 | 0x40000000 << ~252 + 1) & 0xFFFFFFFF;
        o = Long.reverse(2707130259706826224L);
        p = Long.reverse(0x1E00000000000000L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(2707130259706826224L);
        s = Long.reverse(0x1E00000000000000L);
        t = Integer.reverse(0x60000000);
        u = (-1 >>> 244 | -1 << ~244 + 1) & 0xFFFFFFFF;
        v = Long.reverse(4292397328541240816L);
        var_int_w = Integer.reverse(-536870912);
        x = Long.reverse(4292397328541240816L);
        y = (0 >>> 2 | 0 << -2) & 0xFFFFFFFF;
        z = (0 >>> 243 | 0 << ~243 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(456833887201394688L);
        ab = (0x10000000 >>> 249 | 0x10000000 << -249) & 0xFFFFFFFF;
        ac = Long.reverse(4292397328541240816L);
        ad = Long.reverse(1711367858400788480L);
        ae = Double.longBitsToDouble(Long.reverse(192770L));
        af = (147456 >>> 174 | 147456 << -174) & 0xFFFFFFFF;
        ag = Long.reverse(2707130259706826224L);
        ah = Long.reverse(0x1E00000000000000L);
        ai = 5 >>> 63 | 5 << -63;
        aj = 20480 >>> 75 | 20480 << ~75 + 1;
        var_java_lang_String_arr_a = new String[ai];
        var_java_lang_String_arr_b = new String[aj];
        NLoginCore_189.b();
    }
}

