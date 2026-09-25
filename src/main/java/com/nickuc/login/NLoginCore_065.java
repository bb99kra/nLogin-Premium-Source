/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_065 {
    private static long bq;
    private static long var_long_g;
    private static long ch;
    private static int ay;
    private static int am;
    private static String[] var_java_lang_String_arr_b;
    private static int af;
    private static int ad;
    private static long av;
    private static int ck;
    private static long bx;
    private static int bo;
    public static final char var_char_c;
    private static long ba;
    private static int be;
    private static int ap;
    private static int al;
    private static long cl;
    private static int cd;
    private static int ao;
    private static int m;
    private static int bd;
    private static int ca;
    private static int bf;
    private static long bi;
    private static int i;
    private static long bw;
    private static int bn;
    private static final Pattern var_java_util_regex_Pattern_g;
    private static int var_int_b;
    private static final Pattern var_java_util_regex_Pattern_d;
    private static int s;
    private static final Pattern var_java_util_regex_Pattern_e;
    private static long cc;
    private static int au;
    private static int k;
    public static final char var_char_d;
    private static int j;
    private static int as;
    private static int v;
    public static final String var_java_lang_String_bv;
    private static long aw;
    private static int ci;
    private static int aj;
    private static int var_int_bv;
    private static int x;
    private static int aq;
    private static int ar;
    private static int w;
    private static int t;
    private static long ce;
    private static int az;
    private static int bb;
    private static int ax;
    private static int bc;
    private static int ai;
    private static int bp;
    private static long ab;
    private static int z;
    private static int n;
    private static int ac;
    private static int bg;
    private static int bt;
    private static int var_int_f;
    private static int o;
    private static int q;
    private static int br;
    private static int aa;
    private static int bl;
    private static int ag;
    public static final String var_java_lang_String_bu;
    private static int bh;
    private static int ae;
    private static int cg;
    private static int bm;
    private static int u;
    private static int r;
    private static int var_int_c;
    private static int at;
    private static long cj;
    private static int y;
    private static long var_long_c;
    private static int var_int_e;
    private static int an;
    private static int bz;
    private static int by;
    private static int p;
    private static int bs;
    private static int ah;
    private static final Pattern var_java_util_regex_Pattern_f;
    private static long h;
    private static int bj;
    private static int ak;
    private static int l;
    private static long var_long_d;
    private static int cb;
    private static int var_int_bu;
    private static int cf;
    private static int var_int_a;
    public static final char var_char_b;
    private static int bk;
    private static String[] var_java_lang_String_arr_a;

    public static String r(String string) {
        return NLoginCore_065.a(string, (char)q, (char)r, s != 0, t != 0);
    }

    public static String o(String string) {
        return NLoginCore_065.e(string, var_int_e != 0);
    }

    public static String d(String string, boolean bl) {
        return string != null && !string.isEmpty() ? (bl ? var_java_util_regex_Pattern_e : var_java_util_regex_Pattern_d).matcher(string).replaceAll((String)NLoginCore_065.c("㺀", (int)(var_int_b & var_int_c), (long)var_long_d)) : string;
    }

    public static String s(String string) {
        return NLoginCore_065.a(string, (char)u, (char)v, w != 0, x != 0);
    }

    private static String a(String string, char c, char c2, boolean bl, boolean bl2) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] cArray = string.toCharArray();
        block0: for (int i = an; i < cArray.length - ao; ++i) {
            if (cArray[i] != c) continue;
            char c3 = cArray[i + ap];
            if (bl2 && c3 == aq && cArray.length > i + ar) {
                for (int j = i + as; j <= i + at; ++j) {
                    char c4 = cArray[j];
                    if (((String)NLoginCore_065.c("㺀", (int)au, (long)(av ^ aw))).indexOf(c4) == ax) continue block0;
                }
                cArray[i] = c2;
                i += 7;
                continue;
            }
            if (!bl || ((String)NLoginCore_065.c("㺃", (int)(ay & az), (long)ba)).indexOf(c3) <= bb) continue;
            cArray[i] = c2;
            cArray[++i] = Character.toLowerCase(cArray[i]);
        }
        return new String(cArray);
    }

    static {
        var_int_a = 0 >>> 132 | 0 << -132;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(-1);
        var_long_d = Long.reverse(8681166663148114367L);
        var_int_e = (0 >>> 190 | 0 << ~190 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        var_long_g = Long.reverse(6087093277782708671L);
        h = Long.reverse(0x2C00000000000000L);
        i = Integer.reverse(-452984832);
        j = Integer.reverse(0x64000000);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = 0x100000 >>> 84 | 0x100000 << -84;
        m = Integer.reverse(0x64000000);
        n = Integer.reverse(-452984832);
        o = (131072 >>> 145 | 131072 << ~145 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Integer.reverse(0x64000000);
        r = Integer.reverse(-452984832);
        s = (4 >>> 98 | 4 << ~98 + 1) & 0xFFFFFFFF;
        t = (0 >>> 147 | 0 << -147) & 0xFFFFFFFF;
        u = Integer.reverse(0x64000000);
        v = Integer.reverse(-452984832);
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(0x4000000);
        z = (1 >>> 160 | 1 << ~160 + 1) & 0xFFFFFFFF;
        aa = Integer.reverse(0x40000000);
        ab = Long.reverse(8681166663148114367L);
        ac = 0 >>> 240 | 0 << -240;
        ad = Integer.reverse(-452984832);
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = Integer.reverse(-452984832);
        ag = Integer.reverse(0x40000000);
        ah = 42752 >>> 136 | 42752 << ~136 + 1;
        ai = Integer.reverse(-1073741824);
        aj = 85504 >>> 41 | 85504 << -41;
        ak = (4096 >>> 42 | 4096 << -42) & 0xFFFFFFFF;
        al = 342016 >>> 203 | 342016 << ~203 + 1;
        am = Integer.reverse(-1610612736);
        an = Integer.reverse(0);
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = Integer.reverse(Integer.MIN_VALUE);
        aq = 0x2300000 >>> 148 | 0x2300000 << ~148 + 1;
        ar = Integer.reverse(-536870912);
        as = 262144 >>> 241 | 262144 << ~241 + 1;
        at = Integer.reverse(-536870912);
        au = (393216 >>> 81 | 393216 << ~81 + 1) & 0xFFFFFFFF;
        av = Long.reverse(6087093277782708671L);
        aw = Long.reverse(0x2C00000000000000L);
        ax = -1 >>> 121 | -1 << ~121 + 1;
        ay = Integer.reverse(0x20000000);
        az = (-1 >>> 77 | -1 << -77) & 0xFFFFFFFF;
        ba = Long.reverse(8681166663148114367L);
        bb = (-1 >>> 160 | -1 << ~160 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0);
        bd = Integer.reverse(0x40000000);
        be = Integer.reverse(Integer.MIN_VALUE);
        bf = 35 >>> 0 | 35 << -0;
        bg = 655360 >>> 209 | 655360 << -209;
        bh = -1 >>> 163 | -1 << ~163 + 1;
        bi = Long.reverse(8681166663148114367L);
        bj = -1 >>> 69 | -1 << ~69 + 1;
        bk = 2048 >>> 139 | 2048 << ~139 + 1;
        bl = 0x7000000 >>> 88 | 0x7000000 << -88;
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = 0x1000000 >>> 248 | 0x1000000 << -248;
        bo = Integer.reverse(0x60000000);
        bp = Integer.reverse(-1);
        bq = Long.reverse(8681166663148114367L);
        br = -1 >>> 186 | -1 << ~186 + 1;
        bs = (13 >>> 128 | 13 << -128) & 0xFFFFFFFF;
        bt = Integer.reverse(-1342177280);
        var_int_bu = Integer.reverse(0x64000000);
        var_int_bv = Integer.reverse(-536870912);
        bw = Long.reverse(6087093277782708671L);
        bx = Long.reverse(0x2C00000000000000L);
        by = 573440 >>> 14 | 573440 << -14;
        bz = (21889024 >>> 17 | 21889024 << -17) & 0xFFFFFFFF;
        ca = 0x4000000 >>> 247 | 0x4000000 << ~247 + 1;
        cb = -1 >>> 134 | -1 << -134;
        cc = Long.reverse(8681166663148114367L);
        cd = Integer.reverse(-1879048192);
        ce = Long.reverse(8681166663148114367L);
        cf = Integer.reverse(0x50000000);
        cg = (-1 >>> 178 | -1 << ~178 + 1) & 0xFFFFFFFF;
        ch = Long.reverse(8681166663148114367L);
        ci = Integer.reverse(-805306368);
        cj = Long.reverse(8681166663148114367L);
        ck = 0x180000 >>> 81 | 0x180000 << ~81 + 1;
        cl = Long.reverse(8681166663148114367L);
        var_java_lang_String_arr_a = new String[bs];
        var_java_lang_String_arr_b = new String[bt];
        NLoginCore_065.b();
        var_char_c = (char)var_int_bu;
        var_java_lang_String_bv = NLoginCore_065.c("㺀", (int)var_int_bv, (long)(bw ^ bx));
        var_char_b = (char)by;
        var_char_d = (char)bz;
        var_java_lang_String_bu = NLoginCore_065.c("㺃", (int)(ca & cb), (long)cc);
        var_java_util_regex_Pattern_d = Pattern.compile((String)NLoginCore_065.c("㺆", (int)cd, (long)ce));
        var_java_util_regex_Pattern_e = Pattern.compile((String)NLoginCore_065.c("㺉", (int)(cf & cg), (long)ch));
        var_java_util_regex_Pattern_f = Pattern.compile((String)NLoginCore_065.c("㺌", (int)ci, (long)cj));
        var_java_util_regex_Pattern_g = Pattern.compile((String)NLoginCore_065.c("㺏", (int)ck, (long)cl));
    }

    public static String e(String string, boolean bl) {
        return string != null && !string.isEmpty() ? (bl ? var_java_util_regex_Pattern_g : var_java_util_regex_Pattern_f).matcher(string).replaceAll((String)NLoginCore_065.c("㺀", (int)var_int_f, (long)(var_long_g ^ h))) : string;
    }

    public static String t(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] cArray = string.toCharArray();
        block5: for (int i = bc; i < cArray.length; ++i) {
            char c = cArray[i];
            switch (c) {
                case '&': 
                case '§': {
                    char c2;
                    if (cArray.length < i + bd || (c2 = cArray[i + be]) == bf) continue block5;
                    if (((String)NLoginCore_065.c("㺀", (int)(bg & bh), (long)bi)).indexOf(c2) > bj) {
                        ++i;
                        continue block5;
                    }
                    cArray[i + NLoginCore_065.bk] = Character.toUpperCase(c2);
                    break block5;
                }
                case '#': {
                    int n = i + bl;
                    if (cArray.length < n + bm) continue block5;
                    for (int j = i + bn; j < n; ++j) {
                        char c3 = cArray[j];
                        if (((String)NLoginCore_065.c("㺃", (int)(bo & bp), (long)bq)).indexOf(c3) != br) continue;
                        cArray[j] = Character.toUpperCase(cArray[j]);
                        break block5;
                    }
                    i += 6;
                    continue block5;
                }
                case ' ': {
                    continue block5;
                }
                default: {
                    cArray[i] = Character.toUpperCase(cArray[i]);
                    break block5;
                }
            }
        }
        return new String(cArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_065.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.A("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 65), NLoginCore_065.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.F("ՆՓՒԕՕՑՌՕՠՏԜ՚՞՗՚ՠԢࢶࢧࢯࢱࢬࢹࣀࢯ࢟ࢷԸ", (byte)39, 70) + string + NLoginCore_027.F("ԝ", (byte)39, 70) + methodType.toString(), exception);
        }
    }

    public static String q(String string) {
        return NLoginCore_065.a(string, (char)m, (char)n, o != 0, p != 0);
    }

    public static String n(String string) {
        return NLoginCore_065.d(string, var_int_a != 0);
    }

    public static String m(String string) {
        return NLoginCore_065.o(NLoginCore_065.n(string));
    }

    public static String f(String string, boolean bl) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        Matcher matcher = (bl ? var_java_util_regex_Pattern_g : var_java_util_regex_Pattern_f).matcher(string);
        StringBuffer stringBuffer = new StringBuffer(string.length() + y);
        while (matcher.find()) {
            String string2 = matcher.group(z).toLowerCase(Locale.ROOT);
            matcher.appendReplacement(stringBuffer, (String)NLoginCore_065.c("㺀", (int)aa, (long)ab) + string2.charAt(ac) + (char)ad + string2.charAt(ae) + (char)af + string2.charAt(ag) + (char)ah + string2.charAt(ai) + (char)aj + string2.charAt(ak) + (char)al + string2.charAt(am));
        }
        return matcher.appendTail(stringBuffer).toString();
    }

    public static String c(String string, boolean bl) {
        return NLoginCore_065.e(NLoginCore_065.d(string, bl), bl);
    }

    private static String a(int n, long l) {
        l ^= 0x34L;
        l ^= 0xD3C2DC37E2FE33F2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(55 + 14), (byte)(82 + 1), (byte)(43 + 4), (byte)(62 + 5), (byte)(41 + 25), (byte)(20 + 47), (byte)(21 + 26), 80, (byte)(43 + 32), (byte)(3 + 64), 83, (byte)(31 + 22), (byte)(12 + 68), (byte)(35 + 62), (byte)(56 + 44), (byte)(54 + 46), (byte)(28 + 77), (byte)(41 + 69), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("֊֖֗ՙ֙֕֐֤֙֓ՠ֢֛֤֞֞զࣰࣺ࣫ࣳࣵࣽऄࣣࣳࣻ", (byte)107, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_065.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String p(String string) {
        return NLoginCore_065.a(string, (char)i, (char)j, k != 0, l != 0);
    }

    private static void b() {
        int n;
        var_long_c = -177866777717531094L;
        long l = var_long_c ^ 0xD3C2DC37E2FE33F2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(51 + 18), (byte)(29 + 54), (byte)(39 + 8), (byte)(65 + 2), 66, (byte)(50 + 17), (byte)(23 + 24), (byte)(55 + 25), (byte)(27 + 48), (byte)(46 + 21), (byte)(45 + 38), (byte)(43 + 10), (byte)(19 + 61), (byte)(94 + 3), (byte)(35 + 65), (byte)(95 + 5), (byte)(20 + 85), (byte)(101 + 9), (byte)(46 + 57)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
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
                    NLoginCore_065.var_java_lang_String_arr_b[0] = NLoginCore_559.E("էգ֏՛օ֋ձՓազկ՜", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ԐԌԸԄԮԴԚӼԊԏԘԅ", (byte)88, 68);
                    NLoginCore_065.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ԉԸԡԔԣԅԋԙԉԾԈԅ", (byte)88, 67);
                    NLoginCore_065.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƨƋƳƭƐǀƎƷƞǆƏ", (byte)88, 66);
                    NLoginCore_065.var_java_lang_String_arr_b[4] = NLoginCore_324.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƅǁƐǇǅǒƏƥǇǇƵƢƣ", (byte)88, 66);
                    NLoginCore_065.var_java_lang_String_arr_b[5] = NLoginCore_384.A("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƅǁƐǇǅǒƏƥǇǇƵƢƣ", (byte)88, 65);
                    NLoginCore_065.var_java_lang_String_arr_b[6] = NLoginCore_004.E("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվ֍հ֘֒յ֥ճ֜փ֫մ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[7] = NLoginCore_004.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƨƋƳƭƐǀƎƷƞǆƏ", (byte)88, 66);
                    NLoginCore_065.var_java_lang_String_arr_b[8] = NLoginCore_027.E("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվր֓֌յդյՠ֒յ֨֕թ֜ֈ֞ձ֒ջց֪խ֭ժ֦յַ֪֬մ֊֚֬֬ևֈ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[9] = NLoginCore_559.C("ԠԃԯԩԎԈԶԏԼԑԡԝԒԗӿԤԏԛԸԧӼԕՇԬՃԡԣՒԩԟԱԐԿԿԔԗԘԳԨԜՇԺԬԞՀՔԣՀԹԣՅեԩՙ԰Ա", (byte)88, 67);
                    NLoginCore_065.var_java_lang_String_arr_b[10] = NLoginCore_091.E("֍ի֏գ՝ժժճև֏֕կաժ՘ե֒֌Ցլճ֋֌ր֢օբ֑֒֋բօ֭֡կւ֭֮֝ծֳըտռ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[11] = NLoginCore_324.E("սֈֆջ՚գվՒկ՞ֆ֍՗ծմ֝՘պ՘֚֋֘խ֎ց՘֕՞էդ֡պ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[12] = NLoginCore_091.E("սՊՅ֋ՠա֏֕Ւ՟ՕՐնքզզ֙և֝կ֚չ֐֢ճ֣֢֟֠ֈժֈ", (byte)88, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_065.var_java_lang_String_arr_b[0] = NLoginCore_110.F("ցիՠ֍ՇՄձծզՕ֍՜", (byte)88, 70);
                    NLoginCore_065.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ƙŵƨƊƀƃŻƝƝůƒŷ", (byte)88, 65);
                    NLoginCore_065.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ƢƑƠŧƨŽŪūƢƋƓżƯƲƁƵƌƎƩƫƬƻƂƃ", (byte)88, 65);
                    NLoginCore_065.var_java_lang_String_arr_b[3] = NLoginCore_446.E("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվփՙ֎բ֠֐֕֊ը֢ք֭լեփ֛֥֟֟֫֞ղռ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[4] = NLoginCore_138.B("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǊƾǎǌƑƲƏǒƬƷƙǛƢƣ", (byte)88, 66);
                    NLoginCore_065.var_java_lang_String_arr_b[5] = NLoginCore_559.F("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվր֓֌յդյՠ֒յ֨֕թ֜ֈ֞ձ֒ջց֪խְִַֹ֭֘ոָֺ֟ո׀ևֈ", (byte)88, 70);
                    NLoginCore_065.var_java_lang_String_arr_b[6] = NLoginCore_559.F("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվտ֚ոպ֟ռ֤ճ֛֤֩ք֍ֆւ֛֌֪֟ր֭֬ռ", (byte)88, 70);
                    NLoginCore_065.var_java_lang_String_arr_b[7] = NLoginCore_201.E("չՖՆ֋ս֑֑տՠմգ֔֍բՙլձո֕հվ֎՚տ՟ֆ֢՞չ֣֔փ՟չկ֯ծ֓ռւր֫֗ռ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[8] = NLoginCore_027.A("ƔűšƦƘƬƬƚŻƏžƯƨŽŴƇƌƓưƋƙƛƮƧƐſƐŻƭƐǃưƄƷƣƹƌƭƖƜǅƈǈƊǃǎǅƫƫƴƭƔƮǋƢƣ", (byte)88, 65);
                    NLoginCore_065.var_java_lang_String_arr_b[9] = NLoginCore_324.C("ԠԃԯԩԎԈԶԏԼԑԡԝԒԗӿԤԏԛԸԧӼԕՇԬՃԡԣՒԩԟԱԐԿԿԔԗԘԳԨԜՇԺԮՁՍԷ՝ԮՐԠեժՆթ԰Ա", (byte)88, 67);
                    NLoginCore_065.var_java_lang_String_arr_b[10] = NLoginCore_559.E("֍ի֏գ՝ժժճև֏֕կաժ՘ե֒֌Ցլճ֋֌ր֢օբ֑֒֋բօ֨ն֢հգ֌֏֤֭֔֟֊֧ֆչ֙֜սյ֎֩׀ևֈ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[11] = NLoginCore_384.E("սֈֆջ՚գվՒկ՞ֆ֍՗ծմ֝՘պ՘֚֋֑֍֚֜յւե֪֦֚֓֔֎֏֏ֈֆ֪ղ֫տ֥ռ", (byte)88, 69);
                    NLoginCore_065.var_java_lang_String_arr_b[12] = NLoginCore_004.A("ƘťŠƦŻżƪưŭźŰūƑƟƁƁƴƢƸƊƵƓŶƶƯǀƕưſƳǀƔƆƈƥƔƝſƬƭƨǋƪƗ", (byte)88, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_065.var_java_lang_String_arr_b[0] = NLoginCore_451.A("źŵſŦŸŶƠƥƥŻƄƴƌůƯŭƊƳƧƔƷƅƂƃ", (byte)88, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_065.var_java_lang_String_arr_b[0] = NLoginCore_559.E("ՖՈ֊֏՝իքֈ֏օլ֎ՓզժյՖ֝ի՟֎֐էը", (byte)88, 69);
                }
            }
        }
    }
}

