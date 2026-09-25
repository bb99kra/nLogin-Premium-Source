/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_189;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_007 {
    private static long g;
    private static int ak;
    private static String[] var_java_lang_String_arr_a;
    private static int as;
    private static int var_int_a;
    private static long v;
    private static String[] var_java_lang_String_arr_b;
    private static int ac;
    private static long r;
    private static int av;
    private static int k;
    private static int ap;
    private static int t;
    private static long az;
    private static long u;
    private static long j;
    private static long m;
    private static long var_long_b;
    private static long aq;
    private static long y;
    private static int e;
    private static int ba;
    private static int w;
    private static long c;
    private static int h;
    private static long an;
    private static int q;
    private static long l;
    private static int n;
    private static int ay;
    private static int ab;
    private static int f;
    private static long aj;
    private static int aw;
    private static long ad;
    private static int ae;
    private static int i;
    private static long ai;
    private static int af;
    private static long p;
    private static long bc;
    private static long ar;
    private static int at;
    private static int z;
    private static long o;
    private static long x;
    private static int ax;
    private static long s;
    private static long d;
    private static int ah;
    private static final Locale var_java_util_Locale_b;
    private static int am;
    private static int bb;
    private static long aa;
    private static long al;
    private static long au;
    private static long ag;
    private static long ao;

    public static NLoginCore_189 com_nickuc_login_NLoginCore_189_a(long l, boolean bl) {
        return new NLoginCore_189(l, bl ? var_java_util_Locale_b : Locale.getDefault());
    }

    private static String a(int n, long l) {
        l ^= 0x47L;
        l ^= 0x78852422967C9055L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(40 + 29), (byte)(29 + 54), (byte)(4 + 43), (byte)(34 + 33), (byte)(14 + 52), (byte)(33 + 34), 47, (byte)(33 + 47), (byte)(45 + 30), (byte)(11 + 56), (byte)(35 + 48), (byte)(15 + 38), (byte)(49 + 31), (byte)(33 + 64), (byte)(36 + 64), (byte)(59 + 41), (byte)(20 + 85), (byte)(45 + 65), (byte)(34 + 69)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.B("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒҷӞӥӍӫӌӦӯөӢӠӷӡӴ", (byte)74, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_007.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String a(NLoginCore_189 NLoginCore_189, boolean bl) {
        return bl ? NLoginCore_189.al() + (String)NLoginCore_007.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + NLoginCore_189.am() + (String)NLoginCore_007.c("㺃", (int)(e & f), (long)g) + NLoginCore_189.an() + (String)NLoginCore_007.c("㺆", (int)(h & i), (long)j) + NLoginCore_189.ak() + (String)NLoginCore_007.c("㺉", (int)k, (long)(l ^ m)) + NLoginCore_189.aj() + (String)NLoginCore_007.c("㺌", (int)n, (long)(o ^ p)) + NLoginCore_189.ai() : NLoginCore_189.am() + (String)NLoginCore_007.c("㺏", (int)q, (long)(r ^ s)) + NLoginCore_189.al() + (String)NLoginCore_007.c("㺒", (int)t, (long)(u ^ v)) + NLoginCore_189.an() + (String)NLoginCore_007.c("㺕", (int)w, (long)(x ^ y)) + NLoginCore_189.ak() + (String)NLoginCore_007.c("㺘", (int)z, (long)aa) + NLoginCore_189.aj() + (String)NLoginCore_007.c("㺛", (int)(ab & ac), (long)ad) + NLoginCore_189.ai();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_007.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("ҸӚӜҼӠӿӷԍӹӈԆӼԊԄӍӲԔԓԋԑԋӠ", (byte)73, 67), NLoginCore_007.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐҵӜӣӋөӊӤӭӧӠӞӵӟӲŪ", (byte)73, 66) + string + NLoginCore_427.E("Կ", (byte)73, 69) + methodType.toString(), exception);
        }
    }

    public static String a(NLoginCore_189 NLoginCore_189) {
        return NLoginCore_189.ak() + (String)NLoginCore_007.c("㺀", (int)ap, (long)(aq ^ ar)) + NLoginCore_189.aj() + (String)NLoginCore_007.c("㺃", (int)(as & at), (long)au) + NLoginCore_189.ai();
    }

    public static String java_lang_String_a(long l, boolean bl) {
        return NLoginCore_007.a(NLoginCore_007.com_nickuc_login_NLoginCore_189_a(l, bl), bl);
    }

    public static String b(NLoginCore_189 NLoginCore_189, boolean bl) {
        return bl ? NLoginCore_189.al() + (String)NLoginCore_007.c("㺀", (int)(ae & af), (long)ag) + NLoginCore_189.am() + (String)NLoginCore_007.c("㺃", (int)ah, (long)(ai ^ aj)) + NLoginCore_189.an() : NLoginCore_189.am() + (String)NLoginCore_007.c("㺆", (int)ak, (long)al) + NLoginCore_189.al() + (String)NLoginCore_007.c("㺉", (int)am, (long)(an ^ ao)) + NLoginCore_189.an();
    }

    private static void b() {
        int n;
        c = 8714565895553789230L;
        long l = c ^ 0x78852422967C9055L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(13 + 56), (byte)(41 + 42), (byte)(45 + 2), 67, (byte)(19 + 47), (byte)(35 + 32), (byte)(12 + 35), (byte)(61 + 19), (byte)(27 + 48), (byte)(38 + 29), (byte)(66 + 17), 53, (byte)(8 + 72), (byte)(29 + 68), (byte)(6 + 94), (byte)(69 + 31), (byte)(90 + 15), (byte)(82 + 28), (byte)(9 + 94)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(74 + 9)}, StandardCharsets.UTF_8));
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
                    NLoginCore_007.var_java_lang_String_arr_b[0] = NLoginCore_324.F("շ֎։ֱ֬սյ֒քֳֹվ", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[2] = NLoginCore_091.C("հ֐ջ֐ֈ֟֊Օ֗֔վի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[3] = NLoginCore_027.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[4] = NLoginCore_453.D("֓Տը֍տրՙ՜֙՝եի", (byte)122, 68);
                    NLoginCore_007.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[6] = NLoginCore_138.B("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 66);
                    NLoginCore_007.var_java_lang_String_arr_b[7] = NLoginCore_223.F("֨և֞֋֬֊֑վ֥֗֯վ", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[8] = NLoginCore_453.E("֦բջ֠֒֓լկ֬հով", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[9] = NLoginCore_110.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[10] = NLoginCore_324.A("ƴǋǆǩǮƺƲǏǁǶǰƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[11] = NLoginCore_324.C("դջն֙֞ժբտձ֦֠ի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[12] = NLoginCore_201.C("դջն֙֞ժբտձ֦֠ի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[13] = NLoginCore_324.F("շ֎։ֱ֬սյ֒քֳֹվ", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[14] = NLoginCore_453.F("֦բջ֠֒֓լկ֬հով", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[15] = NLoginCore_110.A("ǣƟƸǝǏǐƩƬǩƭƵƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[16] = NLoginCore_446.B("ƢǞǠǬǐƫǧǬǕǐƭƻ", (byte)122, 66);
                    NLoginCore_007.var_java_lang_String_arr_b[17] = NLoginCore_091.C("֛մզէսռհպրբ֠ի", (byte)122, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_007.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ռ֫ք֮֨խ֐֣֑֗֠վ", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[1] = NLoginCore_387.D("զ֙֝ջ֑֔֔֘֌ֆ֐ի", (byte)122, 68);
                    NLoginCore_007.var_java_lang_String_arr_b[2] = NLoginCore_451.C("օ֏մջՒմչ֡֏֘՝ի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[3] = NLoginCore_223.E("ժչ֣կձ֑֑֣֠֩֯վ", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[4] = NLoginCore_223.D("դ֑նը֛ձվՕյ֦պի", (byte)122, 68);
                    NLoginCore_007.var_java_lang_String_arr_b[5] = NLoginCore_027.F("֬բը֋ֳֳլ֌֖֭֙վ", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[6] = NLoginCore_451.E("իւ֛քռ֧֯տ֯ցַվ", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[7] = NLoginCore_384.D("՘ըյ֖֛֐յ՚֕֞ւի", (byte)122, 68);
                    NLoginCore_007.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ƾǙƩǤưǯǅǩƯǦǴƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[9] = NLoginCore_223.F("փ֮֠֟ճְַ֧֓փով", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[10] = NLoginCore_173.A("ǃǡǣǍƦǉǲǀǑǪǬƻ", (byte)122, 65);
                    NLoginCore_007.var_java_lang_String_arr_b[11] = NLoginCore_110.F("ְ֘֐֦֎ֳձտց֥օվ", (byte)122, 70);
                    NLoginCore_007.var_java_lang_String_arr_b[12] = NLoginCore_384.E("֦֜֍լֲ֑ք֤֬֡մվ", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[13] = NLoginCore_092.C("հ՘ձ՞֍֎շ֒՝ռվի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[14] = NLoginCore_092.E("֦ք֢֋֧֯֍ճ֟֓մվ", (byte)122, 69);
                    NLoginCore_007.var_java_lang_String_arr_b[15] = NLoginCore_091.C("Օ֓խծ֙նլյցճ՝ի", (byte)122, 67);
                    NLoginCore_007.var_java_lang_String_arr_b[16] = NLoginCore_384.B("ƹǈƪƾǪǉǥǎǤǱǆƻ", (byte)122, 66);
                    NLoginCore_007.var_java_lang_String_arr_b[17] = NLoginCore_223.F("ժ֏ռծִ֭֓֩֍ֵօվ", (byte)122, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_007.var_java_lang_String_arr_b[0] = NLoginCore_384.F("պբְ֒լրִַ֢֢֟յ֪֋֮֒ռ֭֓׀ֹ֜։֊", (byte)122, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_007.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǨƟƺǅǏǃǭƩǀǄǍǁƴǺǂǐǈǇǚǒǀǯǆǇ", (byte)122, 66);
                }
            }
        }
    }

    static {
        var_int_a = (0 >>> 195 | 0 << ~195 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(8409887386508070686L);
        d = Long.reverse(-2161727821137838080L);
        e = (65536 >>> 48 | 65536 << ~48 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = Long.reverse(-7586898489911931106L);
        h = (64 >>> 133 | 64 << ~133 + 1) & 0xFFFFFFFF;
        i = -1 >>> 45 | -1 << -45;
        j = Long.reverse(-7586898489911931106L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(8409887386508070686L);
        m = Long.reverse(-2161727821137838080L);
        n = 0x2000000 >>> 23 | 0x2000000 << ~23 + 1;
        o = Long.reverse(8409887386508070686L);
        p = Long.reverse(-2161727821137838080L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(8409887386508070686L);
        s = Long.reverse(-2161727821137838080L);
        t = (12288 >>> 43 | 12288 << ~43 + 1) & 0xFFFFFFFF;
        u = Long.reverse(8409887386508070686L);
        v = Long.reverse(-2161727821137838080L);
        w = (112 >>> 228 | 112 << -228) & 0xFFFFFFFF;
        x = Long.reverse(8409887386508070686L);
        y = Long.reverse(-2161727821137838080L);
        z = 524288 >>> 208 | 524288 << ~208 + 1;
        aa = Long.reverse(-7586898489911931106L);
        ab = Integer.reverse(-1879048192);
        ac = -1 >>> 168 | -1 << ~168 + 1;
        ad = Long.reverse(-7586898489911931106L);
        ae = (0xA000000 >>> 152 | 0xA000000 << -152) & 0xFFFFFFFF;
        af = Integer.reverse(-1);
        ag = Long.reverse(-7586898489911931106L);
        ah = (352 >>> 165 | 352 << -165) & 0xFFFFFFFF;
        ai = Long.reverse(8409887386508070686L);
        aj = Long.reverse(-2161727821137838080L);
        ak = 0x18000000 >>> 25 | 0x18000000 << -25;
        al = Long.reverse(-7586898489911931106L);
        am = 212992 >>> 14 | 212992 << ~14 + 1;
        an = Long.reverse(8409887386508070686L);
        ao = Long.reverse(-2161727821137838080L);
        ap = 0x70000000 >>> 27 | 0x70000000 << -27;
        aq = Long.reverse(8409887386508070686L);
        ar = Long.reverse(-2161727821137838080L);
        as = Integer.reverse(-268435456);
        at = (-1 >>> 12 | -1 << -12) & 0xFFFFFFFF;
        au = Long.reverse(-7586898489911931106L);
        av = 144 >>> 195 | 144 << -195;
        aw = Integer.reverse(0x48000000);
        ax = Integer.reverse(0x8000000);
        ay = (-1 >>> 94 | -1 << -94) & 0xFFFFFFFF;
        az = Long.reverse(-7586898489911931106L);
        ba = Integer.reverse(-2013265920);
        bb = (-1 >>> 137 | -1 << -137) & 0xFFFFFFFF;
        bc = Long.reverse(-7586898489911931106L);
        var_java_lang_String_arr_a = new String[av];
        var_java_lang_String_arr_b = new String[aw];
        NLoginCore_007.b();
        var_java_util_Locale_b = new Locale((String)NLoginCore_007.c("㺀", (int)(ax & ay), (long)az), (String)NLoginCore_007.c("㺃", (int)(ba & bb), (long)bc));
    }
}

