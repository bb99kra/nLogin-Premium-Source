/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_112 {
    private static int bi;
    private static int bg;
    private static long ai;
    private static long f;
    private static int bv;
    private static int au;
    private static long ay;
    private static String[] var_java_lang_String_arr_a;
    private static int i;
    private static int aw;
    private static int aq;
    private static int v;
    private static long m;
    private static final DecimalFormat[] var_java_text_DecimalFormat_arr_a;
    private static int bo;
    private static int q;
    private static int av;
    private static int by;
    private static long aj;
    private static int o;
    private static int x;
    private static int ae;
    private static int j;
    private static long ad;
    private static int ak;
    private static long as;
    private static long br;
    private static long c;
    private static int ac;
    private static long bz;
    private static int bs;
    private static int ap;
    private static long ax;
    private static long be;
    private static int k;
    private static long g;
    private static int p;
    private static int bc;
    private static long aa;
    private static int bj;
    private static int ah;
    private static int l;
    private static long z;
    private static int bx;
    private static long at;
    private static final DecimalFormat var_java_text_DecimalFormat_b;
    private static String[] var_java_lang_String_arr_b;
    private static int t;
    private static long al;
    private static int an;
    private static int ab;
    private static int w;
    private static int bq;
    private static int y;
    private static long r;
    private static int h;
    private static double bf;
    private static int bm;
    private static int s;
    private static long ag;
    private static int ar;
    private static long n;
    private static int bl;
    private static long d;
    private static int bk;
    private static int am;
    private static long af;
    private static int bh;
    private static long ba;
    private static int bn;
    private static long bd;
    private static int e;
    private static int bu;
    private static long var_long_b;
    private static long bb;
    private static int az;
    private static int bp;
    private static int var_int_a;
    private static int bw;
    private static long bt;
    private static int ao;
    private static int u;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_112.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.D("ϬЎАϰДгЫсЭϼкаоиЁЦшчпхпД", (byte)5, 68), NLoginCore_112.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("Чдг϶жвЭжсаϽлпилсЃއޏޞދݬޕޢݼޠޞЙ", (byte)5, 68) + string + NLoginCore_575.B("Ã", (byte)5, 66) + methodType.toString(), exception);
        }
    }

    public static String a(double d, double d2, int n, String string) {
        int n2 = (int)(d * (double)n / d2);
        return (String)NLoginCore_112.c("㺀", (int)az, (long)(ba ^ bb)) + NLoginCore_112.b(string, n2) + (String)NLoginCore_112.c("㺃", (int)bc, (long)(bd ^ be)) + NLoginCore_112.b(string, n - n2);
    }

    private static String a(int n, long l) {
        l ^= 0x45L;
        l ^= 0x50BC7126AF43ED48L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(34 + 35), (byte)(54 + 29), (byte)(41 + 6), (byte)(44 + 23), (byte)(38 + 28), (byte)(58 + 9), 47, (byte)(55 + 25), (byte)(58 + 17), (byte)(47 + 20), 83, (byte)(30 + 23), (byte)(17 + 63), (byte)(36 + 61), (byte)(23 + 77), (byte)(54 + 46), (byte)(62 + 43), (byte)(18 + 92), (byte)(81 + 22)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.F("ճրտՂւվչւ֍ռՉև֋քև֍Տ࣓ࣛ࣪ࣗࢸ࣮࣡ࣈ࣬࣪", (byte)84, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_112.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String a(String string, String string2, String string3) {
        String string4 = string.toLowerCase();
        String string5 = string2.toLowerCase();
        int n = an;
        StringBuilder stringBuilder = new StringBuilder(string);
        while ((n = string4.indexOf(string5, n)) != ao) {
            stringBuilder.replace(n, n + string5.length(), string3);
            n += string3.length();
        }
        return stringBuilder.toString();
    }

    public static String d(long l) {
        return var_java_text_DecimalFormat_b.format(l);
    }

    public static String a(String ... stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = ap; i < stringArray.length; ++i) {
            stringBuilder.append(stringArray[i]);
            if (i == stringArray.length - aq) continue;
            stringBuilder.append((String)NLoginCore_112.c("㺀", (int)ar, (long)(as ^ at)));
        }
        return stringBuilder.toString();
    }

    public static String a(double d) {
        return var_java_text_DecimalFormat_b.format(d);
    }

    public static String y(String string) {
        if (string.isEmpty()) {
            return string;
        }
        CharSequence[] charSequenceArray = string.split((String)NLoginCore_112.c("㺀", (int)l, (long)(m ^ n)));
        if (charSequenceArray.length == 0) {
            return string;
        }
        for (int i = o; i < charSequenceArray.length; ++i) {
            charSequenceArray[i] = NLoginCore_112.t(charSequenceArray[i]);
        }
        return String.join((CharSequence)NLoginCore_112.c("㺃", (int)(p & q), (long)r), charSequenceArray);
    }

    private static DecimalFormat[] java_text_DecimalFormat_arr_a(int n) {
        DecimalFormat[] decimalFormatArray = new DecimalFormat[n];
        for (int i = h; i < n; ++i) {
            DecimalFormat decimalFormat;
            decimalFormatArray[i] = decimalFormat = NLoginCore_112.java_text_DecimalFormat_a(i + NLoginCore_112.i);
        }
        return decimalFormatArray;
    }

    public static String a(String string, Object ... objectArray) {
        if (objectArray != null && objectArray.length > 0) {
            int n = string.length();
            StringBuilder stringBuilder = new StringBuilder(n);
            block0: for (int i = s; i < n; ++i) {
                char c;
                block10: {
                    c = string.charAt(i);
                    if (c == t) {
                        for (int j = i + u; j < n; ++j) {
                            char c2 = string.charAt(j);
                            if (c2 == v) {
                                if (j - i >= w) {
                                    String string2 = string.substring(i + x, j);
                                    Integer n2 = NLoginCore_449.java_lang_Integer_a(string2);
                                    if (n2 == null) {
                                        throw new IllegalArgumentException((String)NLoginCore_112.c("㺀", (int)y, (long)(z ^ aa)) + string2 + (String)NLoginCore_112.c("㺃", (int)(ab & ac), (long)ad) + string + (String)NLoginCore_112.c("㺆", (int)ae, (long)(af ^ ag)) + i);
                                    }
                                    if (n2 < objectArray.length) {
                                        stringBuilder.append(objectArray[n2]);
                                        i += j - i;
                                        continue block0;
                                    }
                                }
                            } else if (NLoginCore_449.a(c2)) {
                                continue;
                            }
                            break block10;
                        }
                        stringBuilder.append(string.substring(i));
                        break;
                    }
                }
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
        return string;
    }

    public static String b(String string, int n) {
        if (n <= 0) {
            return NLoginCore_112.c("㺀", (int)ak, (long)al);
        }
        int n2 = string.length();
        char[] cArray = new char[n2 * n];
        char[] cArray2 = string.toCharArray();
        for (int i = am; i < cArray.length; ++i) {
            cArray[i] = cArray2[i % n2];
        }
        return new String(cArray);
    }

    public static String t(String string) {
        if (string.isEmpty()) {
            return string;
        }
        char[] cArray = string.toCharArray();
        cArray[NLoginCore_112.j] = Character.toUpperCase(cArray[k]);
        return new String(cArray);
    }

    public static String a(double d, double d2) {
        return NLoginCore_112.a(d, d2, av, (String)NLoginCore_112.c("㺀", (int)aw, (long)(ax ^ ay)));
    }

    public static String a(double d, int n) {
        DecimalFormat decimalFormat = var_java_text_DecimalFormat_arr_a.length <= n ? NLoginCore_112.java_text_DecimalFormat_a(n) : var_java_text_DecimalFormat_arr_a[n - au];
        return decimalFormat.format(d);
    }

    static {
        var_int_a = 0 >>> 72 | 0 << ~72 + 1;
        var_long_b = Long.reverse(-488089946308883236L);
        d = Long.reverse(-6773413839565225984L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-488089946308883236L);
        g = Long.reverse(-6773413839565225984L);
        h = (0 >>> 177 | 0 << -177) & 0xFFFFFFFF;
        i = Integer.reverse(Integer.MIN_VALUE);
        j = 0 >>> 90 | 0 << ~90 + 1;
        k = Integer.reverse(0);
        l = 256 >>> 103 | 256 << ~103 + 1;
        m = Long.reverse(-488089946308883236L);
        n = Long.reverse(-6773413839565225984L);
        o = 0 >>> 254 | 0 << -254;
        p = Integer.reverse(-1073741824);
        q = Integer.reverse(-1);
        r = Long.reverse(6573554269408054492L);
        s = Integer.reverse(0);
        t = 0x7B00000 >>> 212 | 0x7B00000 << -212;
        u = 4096 >>> 140 | 4096 << -140;
        v = 4096000 >>> 175 | 4096000 << -175;
        w = 0x8000000 >>> 122 | 0x8000000 << ~122 + 1;
        x = (524288 >>> 147 | 524288 << ~147 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(0x20000000);
        z = Long.reverse(-488089946308883236L);
        aa = Long.reverse(-6773413839565225984L);
        ab = Integer.reverse(-1610612736);
        ac = Integer.reverse(-1);
        ad = Long.reverse(6573554269408054492L);
        ae = Integer.reverse(0x60000000);
        af = Long.reverse(-488089946308883236L);
        ag = Long.reverse(-6773413839565225984L);
        ah = 896 >>> 7 | 896 << -7;
        ai = Long.reverse(-488089946308883236L);
        aj = Long.reverse(-6773413839565225984L);
        ak = (128 >>> 164 | 128 << -164) & 0xFFFFFFFF;
        al = Long.reverse(6573554269408054492L);
        am = Integer.reverse(0);
        an = 0 >>> 94 | 0 << ~94 + 1;
        ao = Integer.reverse(-1);
        ap = Integer.reverse(0);
        aq = Integer.reverse(Integer.MIN_VALUE);
        ar = 0x24000000 >>> 122 | 0x24000000 << -122;
        as = Long.reverse(-488089946308883236L);
        at = Long.reverse(-6773413839565225984L);
        au = (0x200000 >>> 21 | 0x200000 << ~21 + 1) & 0xFFFFFFFF;
        av = Integer.reverse(0x28000000);
        aw = Integer.reverse(0x50000000);
        ax = Long.reverse(-488089946308883236L);
        ay = Long.reverse(-6773413839565225984L);
        az = (0xB00000 >>> 212 | 0xB00000 << ~212 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(-488089946308883236L);
        bb = Long.reverse(-6773413839565225984L);
        bc = (0x3000000 >>> 86 | 0x3000000 << -86) & 0xFFFFFFFF;
        bd = Long.reverse(-488089946308883236L);
        be = Long.reverse(-6773413839565225984L);
        bf = Double.longBitsToDouble(Long.reverse(39426L));
        bg = (0x28000000 >>> 57 | 0x28000000 << ~57 + 1) & 0xFFFFFFFF;
        bh = 0x10000006 >>> 28 | 0x10000006 << -28;
        bi = -2147483646 >>> 220 | -2147483646 << ~220 + 1;
        bj = Integer.reverse(0x4C000000);
        bk = (245760 >>> 76 | 245760 << -76) & 0xFFFFFFFF;
        bl = Integer.reverse(0x6C000000);
        bm = (0x2800000 >>> 179 | 0x2800000 << ~179 + 1) & 0xFFFFFFFF;
        bn = Integer.reverse(-973078528);
        bo = -805306368 >>> 26 | -805306368 << ~26 + 1;
        bp = 0x6800000 >>> 119 | 0x6800000 << -119;
        bq = -1 >>> 163 | -1 << -163;
        br = Long.reverse(6573554269408054492L);
        bs = Integer.reverse(0x70000000);
        bt = Long.reverse(6573554269408054492L);
        bu = Integer.reverse(0x8000000);
        bv = Integer.reverse(0x8000000);
        bw = 655360 >>> 81 | 655360 << -81;
        bx = (0x1E00000 >>> 21 | 0x1E00000 << -21) & 0xFFFFFFFF;
        by = -1 >>> 184 | -1 << ~184 + 1;
        bz = Long.reverse(6573554269408054492L);
        var_java_lang_String_arr_a = new String[bu];
        var_java_lang_String_arr_b = new String[bv];
        NLoginCore_112.b();
        var_java_text_DecimalFormat_arr_a = NLoginCore_112.java_text_DecimalFormat_arr_a(bw);
        var_java_text_DecimalFormat_b = new DecimalFormat((String)NLoginCore_112.c("㺀", (int)(bx & by), (long)bz));
    }

    private static void b() {
        int n;
        c = 4265906954086358175L;
        long l = c ^ 0x50BC7126AF43ED48L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(35 + 34), (byte)(79 + 4), 47, (byte)(42 + 25), (byte)(24 + 42), (byte)(16 + 51), (byte)(17 + 30), (byte)(46 + 34), (byte)(32 + 43), (byte)(7 + 60), (byte)(43 + 40), (byte)(14 + 39), (byte)(43 + 37), (byte)(59 + 38), (byte)(64 + 36), (byte)(88 + 12), (byte)(23 + 82), (byte)(61 + 49), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_112.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ГбдхОшϻЧшИлВ", (byte)7, 67);
                    NLoginCore_112.var_java_lang_String_arr_b[1] = NLoginCore_427.B("ÜåÃĉÂĄąß×ÚðÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ûĆØØèÊăĊúÈÏÕ", (byte)7, 65);
                    NLoginCore_112.var_java_lang_String_arr_b[3] = NLoginCore_004.B("ûĆØØèÊăĊúÈÏÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[4] = NLoginCore_223.A("ÙÂé¿ÅÅùçíâďÚñĈåæāç××ÚòěÛĔìċáĀÞÞþÞġĔöĈĖø÷ĎĎêħąêĔĖĄĠĂïĘĔĩĬēğĝĳċāĶģ", (byte)7, 65);
                    NLoginCore_112.var_java_lang_String_arr_b[5] = NLoginCore_091.E("ӷԖӻӺԭՁԳԿԶԄԤԙԂԞԞԘԶԚԤՉԐԙԖԗ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[6] = NLoginCore_427.C("ЙЄрйфЧпЈьрНВ", (byte)7, 67);
                    NLoginCore_112.var_java_lang_String_arr_b[7] = NLoginCore_223.E("ԧԥԈԪԙӻԕԍԚԹԅԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ЕЂЮЂдГфгоТзВ", (byte)7, 68);
                    NLoginCore_112.var_java_lang_String_arr_b[9] = NLoginCore_173.E("ԸԊӽԠӲԛԭԘԬՃԒԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[10] = NLoginCore_201.E("ԑԔԝԱԞԺԣӺԹՅՄԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[11] = NLoginCore_138.F("ԬԌԏԷԛԡԫԸԿԡԎԋ", (byte)7, 70);
                    NLoginCore_112.var_java_lang_String_arr_b[12] = NLoginCore_027.B("ÏáÈÚÄùãąöäÇÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[13] = NLoginCore_451.D("ЏЂфЛЀЄСЇУХлВ", (byte)7, 68);
                    NLoginCore_112.var_java_lang_String_arr_b[14] = NLoginCore_446.E("ԅԗӾԐӺԯԙԻԬԚӽԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[15] = NLoginCore_201.E("ԫԽӵԜԉӻԻԋԛԚԎԋ", (byte)7, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_112.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ԯԼԖԶԵԾԢԯԼՀԚԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[1] = NLoginCore_110.B("øöăÂĂàÝøčØäÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[2] = NLoginCore_027.C("лЙРвЂнЃыЪЖпВ", (byte)7, 67);
                    NLoginCore_112.var_java_lang_String_arr_b[3] = NLoginCore_387.B("ÛÃóĈãåąÜíìèÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ЖϿЦϼЂЂжФЪПьЗЮхТУоФДДЗЯјИёЩшОнЛЛлЛўёгхѓедыыЧѤтЧёѓсѝпЬѕѤѳхѥклѬјіѬљёњѶјйѵ҉ћѩѕѭђ", (byte)7, 67);
                    NLoginCore_112.var_java_lang_String_arr_b[5] = NLoginCore_446.A("ÁàÅÄ÷ċýĉĀÎîÏäċÊĉêč×âåĉàá", (byte)7, 65);
                    NLoginCore_112.var_java_lang_String_arr_b[6] = NLoginCore_173.C("ДнцфЖКПГКтЧьзЉОЦэѕцЩЎцНО", (byte)7, 67);
                    NLoginCore_112.var_java_lang_String_arr_b[7] = NLoginCore_223.A("æåãäĆåÚÃÊäàÕ", (byte)7, 65);
                    NLoginCore_112.var_java_lang_String_arr_b[8] = NLoginCore_427.D("ЁЍиДоϺмъемХВ", (byte)7, 68);
                    NLoginCore_112.var_java_lang_String_arr_b[9] = NLoginCore_138.D("еуϿЁϾГпКЈЧцРяЉчЋХђЎѓааНО", (byte)7, 68);
                    NLoginCore_112.var_java_lang_String_arr_b[10] = NLoginCore_384.B("øăÑÞÁËČúąæĂÕ", (byte)7, 66);
                    NLoginCore_112.var_java_lang_String_arr_b[11] = NLoginCore_092.A("üÕúöø×ùøøÍäÕ", (byte)7, 65);
                    NLoginCore_112.var_java_lang_String_arr_b[12] = NLoginCore_091.D("УмхСРЄчЂонпВ", (byte)7, 68);
                    NLoginCore_112.var_java_lang_String_arr_b[13] = NLoginCore_384.E("ԦӴԩԌԬԕՂԬԏԴԼԋ", (byte)7, 69);
                    NLoginCore_112.var_java_lang_String_arr_b[14] = NLoginCore_223.F("ԷԳԱՀՁӾԘԟԿԦԴԋ", (byte)7, 70);
                    NLoginCore_112.var_java_lang_String_arr_b[15] = NLoginCore_076.E("ԐԧԴԚԋԭԮԏԭԶԚԋ", (byte)7, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_112.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ЭгоПГЖЃЀЊСЃяСОмкЛыжШѓРНО", (byte)7, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_112.var_java_lang_String_arr_b[0] = NLoginCore_110.E("Խԕ԰ӻӶԓԍԝӽԼԛԑՇՄԡԧԵՀԌԯԧԛԾՍԿԶՍԡԯՈԖՃ", (byte)7, 69);
                }
            }
        }
    }

    public static String b(double d, double d2, int n, String string) {
        int n2 = (int)(d * bf / d2);
        int n3 = n2 <= bg ? bh : (n2 <= bi ? bj : (n2 <= bk ? bl : (n2 <= bm ? bn : bo)));
        int n4 = (int)(d * (double)n / d2);
        return (String)NLoginCore_112.c("㺀", (int)(bp & bq), (long)br) + (char)n3 + NLoginCore_112.b(string, n4) + (String)NLoginCore_112.c("㺃", (int)bs, (long)bt) + NLoginCore_112.b(string, n - n4);
    }

    public static String java_lang_String_a(int n) {
        return (String)NLoginCore_112.c("㺀", (int)ah, (long)(ai ^ aj)) + Integer.toHexString(n).toUpperCase(Locale.ENGLISH);
    }

    private static DecimalFormat java_text_DecimalFormat_a(int n) {
        return new DecimalFormat((String)NLoginCore_112.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + NLoginCore_112.b((String)NLoginCore_112.c("㺃", (int)e, (long)(f ^ g)), n), DecimalFormatSymbols.getInstance(Locale.ENGLISH));
    }
}

