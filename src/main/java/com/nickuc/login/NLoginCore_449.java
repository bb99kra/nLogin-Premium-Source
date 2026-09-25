/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.DecimalFormat;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_449 {
    private static int n;
    private static long t;
    private static long r;
    private static long var_long_b;
    private static int var_int_g;
    private static int o;
    private static long x;
    private static int al;
    private static int ah;
    private static long k;
    private static final String[] var_java_lang_String_arr_e;
    private static int at;
    private static int ap;
    private static int v;
    private static long ab;
    private static int i;
    private static long d;
    private static double au;
    private static double as;
    private static int ae;
    private static int y;
    private static int ad;
    private static long ar;
    private static int w;
    private static int am;
    private static int l;
    private static long u;
    private static int ak;
    private static final DecimalFormat var_java_text_DecimalFormat_a;
    private static long an;
    private static long aq;
    private static int ao;
    private static final double var_double_g;
    private static long af;
    private static int j;
    private static int q;
    private static int var_int_a;
    private static int f;
    private static int p;
    private static int ag;
    private static final double[] var_double_arr_a;
    private static long c;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_e;
    private static int aa;
    private static double h;
    private static long aj;
    private static long ac;
    private static final String bQ;
    private static long m;
    private static int ai;
    private static final String bR;
    private static int s;
    private static int z;

    public static String c(long l) {
        if (l <= 0L) {
            return NLoginCore_449.c("㺀", (int)(i & j), (long)k);
        }
        int n = (int)(Math.log10(l) / var_double_g);
        double d = (double)l / var_double_arr_a[n];
        return var_java_text_DecimalFormat_a.format(d) + (String)NLoginCore_449.c("㺃", (int)NLoginCore_449.l, (long)m) + var_java_lang_String_arr_e[n];
    }

    private static void b() {
        int n;
        c = 5119087106964986736L;
        long l = c ^ 0x18468C01E0E52EE5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(43 + 26), 83, (byte)(43 + 4), (byte)(18 + 49), (byte)(44 + 22), (byte)(3 + 64), (byte)(27 + 20), (byte)(48 + 32), (byte)(72 + 3), (byte)(17 + 50), (byte)(39 + 44), (byte)(40 + 13), (byte)(14 + 66), (byte)(52 + 45), (byte)(58 + 42), 100, (byte)(15 + 90), (byte)(64 + 46), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_449.var_java_lang_String_arr_b[0] = NLoginCore_110.D("պՌռֈՐ՞Փ֏֕ճաազՐ֙զ֖պ՛լ՚֐էը", (byte)117, 68);
                    NLoginCore_449.var_java_lang_String_arr_b[1] = NLoginCore_451.B("ƬǘƴǜǅǨƢƛǅǔƣƱ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[2] = NLoginCore_427.C("ՃիՏՠխ՝՜խՠ֑Ւ՜", (byte)117, 67);
                    NLoginCore_449.var_java_lang_String_arr_b[3] = NLoginCore_004.C("պՌռֈՐ՞Փ֏֕ճաազՐ֙զ֖պ՛լ՚֐էը", (byte)117, 67);
                    NLoginCore_449.var_java_lang_String_arr_b[4] = NLoginCore_387.C("՗փ՟ևհ֓ՍՆհտՎ՜", (byte)117, 67);
                    NLoginCore_449.var_java_lang_String_arr_b[5] = NLoginCore_091.D("֋ՄՎջբ֒էեմձ։՜", (byte)117, 68);
                    NLoginCore_449.var_java_lang_String_arr_b[6] = NLoginCore_091.E("գր֦և֥֋֑֯ձ։֞չ", (byte)117, 69);
                    NLoginCore_449.var_java_lang_String_arr_b[7] = NLoginCore_092.B("ƹƺǍǦǔƞǃǝǪǫƧƱ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[8] = NLoginCore_575.D("տՎՎՉլճփՋժևց՜", (byte)117, 68);
                    NLoginCore_449.var_java_lang_String_arr_b[9] = NLoginCore_451.B("ǢƼǢǎǞǦƠǘǈǦǚƱ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[10] = NLoginCore_559.B("ǣǐǞƜǣǞƶƵǛǌƼƱ", (byte)117, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_449.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ǏơǑǝƥƳƨǤǪǈƷƼƸƷǐǌƯǲǦǟǪƿƼƽ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[1] = NLoginCore_076.F("֨վեգ֨֏֭֯֓ջ֌չ", (byte)117, 70);
                    NLoginCore_449.var_java_lang_String_arr_b[2] = NLoginCore_384.E("ոք֨թ֥֨֡֋փճռչ", (byte)117, 69);
                    NLoginCore_449.var_java_lang_String_arr_b[3] = NLoginCore_110.C("պՌռֈՐ՞Փ֏֕ճ՟ճ֖֑ոջՏժ֠֋֙֠էը", (byte)117, 67);
                    NLoginCore_449.var_java_lang_String_arr_b[4] = NLoginCore_223.D("վ՜խՊ՜։֋ժւմ֍՜", (byte)117, 68);
                    NLoginCore_449.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ǏǤƺƿƴƷƢƠǛƥǭƩƼǡƫǟƪǇǲǰƲǵƼƽ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[6] = NLoginCore_110.D("ԿֆհխկՠըֈՔՠՎ՜", (byte)117, 68);
                    NLoginCore_449.var_java_lang_String_arr_b[7] = NLoginCore_451.B("ƼǞƛǜǀơǡǤƼǂǌƱ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[8] = NLoginCore_446.B("ƫǡǎǝƥǖƨǗǧǤǦƱ", (byte)117, 66);
                    NLoginCore_449.var_java_lang_String_arr_b[9] = NLoginCore_453.A("ǏǛƿƟƤǂǆǑƪǩǦƱ", (byte)117, 65);
                    NLoginCore_449.var_java_lang_String_arr_b[10] = NLoginCore_384.E("֒֊֕չծ֣֠֫տ֟֐չ", (byte)117, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_449.var_java_lang_String_arr_b[0] = NLoginCore_091.D("պՌՉխՈ֍ՠՊ։ւ֐հխ֋֚֍նլխջ՗մ֐ջ֔֓ո֡ւֆգլ", (byte)117, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_449.var_java_lang_String_arr_b[0] = NLoginCore_091.D("բթ՘ՆՉ֑մՎժՒ։՜", (byte)117, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x23L;
        l ^= 0x18468C01E0E52EE5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(48 + 21), 83, (byte)(28 + 19), (byte)(43 + 24), (byte)(34 + 32), (byte)(23 + 44), 47, (byte)(63 + 17), (byte)(25 + 50), (byte)(16 + 51), (byte)(53 + 30), (byte)(47 + 6), (byte)(79 + 1), (byte)(18 + 79), (byte)(86 + 14), (byte)(44 + 56), (byte)(40 + 65), (byte)(46 + 64), (byte)(97 + 6)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.E("ց֎֍Ր֐֌և֐֛֊՗֛֕֙֒֕՝ࣲࣩ࣮ࣺࣦࣩࣤ࣫࣬࣊", (byte)98, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_449.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static boolean a(char c) {
        return (((String)NLoginCore_449.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))).indexOf(c) > var_int_e ? f : var_int_g) != 0;
    }

    public static double a(long l, long l2) {
        return (double)l * h / (double)l2;
    }

    @Nullable
    public static Short java_lang_Short_a(String string) {
        return NLoginCore_449.a(string, null);
    }

    public static Integer a(String string, Integer n) {
        if (string == null) {
            return n;
        }
        try {
            return Integer.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static Long a(String string, Long l) {
        if (string == null) {
            return l;
        }
        try {
            return Long.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return l;
        }
    }

    @Nullable
    public static Long java_lang_Long_a(String string) {
        return NLoginCore_449.a(string, null);
    }

    @Nullable
    public static Double java_lang_Double_a(String string) {
        return NLoginCore_449.a(string, null);
    }

    public static Double a(String string, Double d) {
        if (string == null) {
            return d;
        }
        try {
            return Double.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return d;
        }
    }

    public static Short a(String string, Short s) {
        if (string == null) {
            return s;
        }
        try {
            return Short.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return s;
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_449.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.E("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 69), NLoginCore_449.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣺࣳࣻࣸࣽउࣵࣙँࣸւ", (byte)113, 69) + string + NLoginCore_384.B("ƛ", (byte)113, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(1069735823603486946L);
        d = Long.reverse(-4323455642275676160L);
        var_int_e = Integer.reverse(-1);
        f = (16384 >>> 238 | 16384 << ~238 + 1) & 0xFFFFFFFF;
        var_int_g = Integer.reverse(0);
        h = Double.longBitsToDouble(Long.reverse(39426L));
        i = (131072 >>> 177 | 131072 << ~177 + 1) & 0xFFFFFFFF;
        j = -1 >>> 75 | -1 << ~75 + 1;
        k = Long.reverse(-3830180570975612702L);
        l = (32768 >>> 206 | 32768 << ~206 + 1) & 0xFFFFFFFF;
        m = Long.reverse(-3830180570975612702L);
        n = Integer.reverse(-805306368);
        o = (0x58000000 >>> 187 | 0x58000000 << ~187 + 1) & 0xFFFFFFFF;
        p = 0xC00000 >>> 86 | 0xC00000 << ~86 + 1;
        q = -1 >>> 38 | -1 << -38;
        r = Long.reverse(-3830180570975612702L);
        s = 8 >>> 33 | 8 << -33;
        t = Long.reverse(1069735823603486946L);
        u = Long.reverse(-4323455642275676160L);
        v = (10 >>> 161 | 10 << -161) & 0xFFFFFFFF;
        w = (-1 >>> 22 | -1 << ~22 + 1) & 0xFFFFFFFF;
        x = Long.reverse(-3830180570975612702L);
        y = Integer.reverse(-1610612736);
        z = 0 >>> 97 | 0 << -97;
        aa = Integer.reverse(0x60000000);
        ab = Long.reverse(1069735823603486946L);
        ac = Long.reverse(-4323455642275676160L);
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = (28672 >>> 140 | 28672 << -140) & 0xFFFFFFFF;
        af = Long.reverse(-3830180570975612702L);
        ag = Integer.reverse(0x40000000);
        ah = 524288 >>> 112 | 524288 << ~112 + 1;
        ai = (-1 >>> 244 | -1 << -244) & 0xFFFFFFFF;
        aj = Long.reverse(-3830180570975612702L);
        ak = (768 >>> 232 | 768 << ~232 + 1) & 0xFFFFFFFF;
        al = (9 >>> 96 | 9 << -96) & 0xFFFFFFFF;
        am = -1 >>> 187 | -1 << ~187 + 1;
        an = Long.reverse(-3830180570975612702L);
        ao = (0x100000 >>> 146 | 0x100000 << ~146 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(0x50000000);
        aq = Long.reverse(1069735823603486946L);
        ar = Long.reverse(-4323455642275676160L);
        as = Double.longBitsToDouble(Long.reverse(2306L));
        at = (0 >>> 65 | 0 << -65) & 0xFFFFFFFF;
        au = Double.longBitsToDouble(Long.reverse(2306L));
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_449.b();
        bQ = NLoginCore_449.c("㺀", (int)(p & q), (long)r);
        bR = NLoginCore_449.c("㺃", (int)s, (long)(t ^ u));
        var_java_text_DecimalFormat_a = new DecimalFormat((String)NLoginCore_449.c("㺆", (int)(v & w), (long)x));
        String[] stringArray = new String[y];
        stringArray[NLoginCore_449.z] = NLoginCore_449.c("㺉", (int)aa, (long)(ab ^ ac));
        stringArray[NLoginCore_449.ad] = NLoginCore_449.c("㺌", (int)ae, (long)af);
        stringArray[NLoginCore_449.ag] = NLoginCore_449.c("㺏", (int)(ah & ai), (long)aj);
        stringArray[NLoginCore_449.ak] = NLoginCore_449.c("㺒", (int)(al & am), (long)an);
        stringArray[NLoginCore_449.ao] = NLoginCore_449.c("㺕", (int)ap, (long)(aq ^ ar));
        var_java_lang_String_arr_e = stringArray;
        var_double_g = Math.log10(as);
        var_double_arr_a = new double[var_java_lang_String_arr_e.length];
        for (int i = at; i < var_double_arr_a.length; ++i) {
            NLoginCore_449.var_double_arr_a[i] = Math.pow(au, i);
        }
    }

    @Nullable
    public static Integer java_lang_Integer_a(String string) {
        return NLoginCore_449.a(string, null);
    }
}

