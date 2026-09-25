/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_311;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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
import lombok.Generated;

public final class NLoginCore_036
extends Enum<NLoginCore_036> {
    public static final /* enum */ NLoginCore_036 var_com_nickuc_login_NLoginCore_036_c;
    public static final /* enum */ NLoginCore_036 var_com_nickuc_login_NLoginCore_036_d;
    public static final /* enum */ NLoginCore_036 var_com_nickuc_login_NLoginCore_036_e;
    public static final /* enum */ NLoginCore_036 var_com_nickuc_login_NLoginCore_036_f;
    public static final /* enum */ NLoginCore_036 var_com_nickuc_login_NLoginCore_036_g;
    private final NLoginCore_311 var_com_nickuc_login_NLoginCore_315_a;
    private final String var_java_lang_String_at;
    private final boolean S;
    private final int E;
    private static final /* synthetic */ NLoginCore_036[] var_com_nickuc_login_NLoginCore_036_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int var_int_g;
    private static int h;
    private static int i;
    private static long j;
    private static long k;
    private static int l;
    private static int m;
    private static long n;
    private static long o;
    private static int p;
    private static int q;
    private static int r;
    private static long s;
    private static int t;
    private static int u;
    private static long v;
    private static long w;
    private static int x;
    private static int y;
    private static int z;
    private static long aa;
    private static long ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static long ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static long am;
    private static long an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static long ar;
    private static long as;
    private static int var_int_at;
    private static int au;
    private static int av;
    private static long aw;
    private static int ax;
    private static int ay;

    static {
        var_int_a = (0x1400000 >>> 86 | 0x1400000 << -86) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = (0x4000000 >>> 89 | 0x4000000 << -89) & 0xFFFFFFFF;
        var_int_e = (0x30000000 >>> 28 | 0x30000000 << -28) & 0xFFFFFFFF;
        var_int_f = (0x200000 >>> 211 | 0x200000 << ~211 + 1) & 0xFFFFFFFF;
        var_int_g = (1280 >>> 199 | 1280 << -199) & 0xFFFFFFFF;
        h = (0x500000 >>> 211 | 0x500000 << -211) & 0xFFFFFFFF;
        i = Integer.reverse(0);
        j = Long.reverse(6266546287520421823L);
        k = Long.reverse(-6917529027641081856L);
        l = Integer.reverse(0);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Long.reverse(6266546287520421823L);
        o = Long.reverse(-6917529027641081856L);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Integer.reverse(1462763520);
        r = 0x100000 >>> 147 | 0x100000 << -147;
        s = Long.reverse(-650982740120660033L);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = (48 >>> 228 | 48 << -228) & 0xFFFFFFFF;
        v = Long.reverse(6266546287520421823L);
        w = Long.reverse(-6917529027641081856L);
        x = (0x800000 >>> 87 | 0x800000 << ~87 + 1) & 0xFFFFFFFF;
        y = 1342177383 >>> 59 | 1342177383 << -59;
        z = (16384 >>> 140 | 16384 << -140) & 0xFFFFFFFF;
        aa = Long.reverse(6266546287520421823L);
        ab = Long.reverse(-6917529027641081856L);
        ac = 4 >>> 161 | 4 << ~161 + 1;
        ad = 0x40000001 >>> 30 | 0x40000001 << ~30 + 1;
        ae = Long.reverse(-650982740120660033L);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = (88997888 >>> 110 | 88997888 << ~110 + 1) & 0xFFFFFFFF;
        ah = Integer.reverse(0x60000000);
        ai = Long.reverse(6266546287520421823L);
        aj = Long.reverse(-6917529027641081856L);
        ak = 98304 >>> 79 | 98304 << -79;
        al = Integer.reverse(-536870912);
        am = Long.reverse(6266546287520421823L);
        an = Long.reverse(-6917529027641081856L);
        ao = Integer.reverse(0);
        ap = -1 >>> 69 | -1 << -69;
        aq = Integer.reverse(0x10000000);
        ar = Long.reverse(6266546287520421823L);
        as = Long.reverse(-6917529027641081856L);
        var_int_at = Integer.reverse(0x20000000);
        au = Integer.reverse(-1879048192);
        av = Integer.reverse(-1);
        aw = Long.reverse(-650982740120660033L);
        ax = Integer.reverse(0);
        ay = (-1 >>> 253 | -1 << -253) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[var_int_g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_036.b();
        var_com_nickuc_login_NLoginCore_036_c = new NLoginCore_036(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_u, (String)NLoginCore_036.c("㺃", (int)m, (long)(n ^ o)), p != 0, q);
        var_com_nickuc_login_NLoginCore_036_d = new NLoginCore_036(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_v, (String)NLoginCore_036.c("㺉", (int)u, (long)(v ^ w)), x != 0, y);
        var_com_nickuc_login_NLoginCore_036_e = new NLoginCore_036(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_w, (String)NLoginCore_036.c("㺏", (int)ad, (long)ae), af != 0, ag);
        var_com_nickuc_login_NLoginCore_036_f = new NLoginCore_036(NLoginCore_311.A, (String)NLoginCore_036.c("㺕", (int)al, (long)(am ^ an)), ao != 0, ap);
        var_com_nickuc_login_NLoginCore_036_g = new NLoginCore_036(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_y, (String)NLoginCore_036.c("㺛", (int)(au & av), (long)aw), ax != 0, ay);
        var_com_nickuc_login_NLoginCore_036_arr_a = NLoginCore_036.com_nickuc_login_NLoginCore_036_arr_a();
    }

    @Generated
    private NLoginCore_036(NLoginCore_311 NLoginCore_3152, String string2, boolean bl, int n2) {
        this.var_com_nickuc_login_NLoginCore_315_a = NLoginCore_3152;
        this.var_java_lang_String_at = string2;
        this.S = bl;
        this.E = n2;
    }

    public String v() {
        return this.var_java_lang_String_at;
    }

    private static /* synthetic */ NLoginCore_036[] com_nickuc_login_NLoginCore_036_arr_a() {
        NLoginCore_036[] NLoginCore_036Array = new NLoginCore_036[var_int_a];
        NLoginCore_036Array[NLoginCore_036.var_int_b] = var_com_nickuc_login_NLoginCore_036_c;
        NLoginCore_036Array[NLoginCore_036.var_int_c] = var_com_nickuc_login_NLoginCore_036_d;
        NLoginCore_036Array[NLoginCore_036.var_int_d] = var_com_nickuc_login_NLoginCore_036_e;
        NLoginCore_036Array[NLoginCore_036.var_int_e] = var_com_nickuc_login_NLoginCore_036_f;
        NLoginCore_036Array[NLoginCore_036.var_int_f] = var_com_nickuc_login_NLoginCore_036_g;
        return NLoginCore_036Array;
    }

    public NLoginCore_311 com_nickuc_login_NLoginCore_315_a() {
        return this.var_com_nickuc_login_NLoginCore_315_a;
    }

    public int i() {
        return this.E;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_036.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.E("ՍկձՑյ֔֌֢֎՝֛֑֟֙բև֦֩֨֠֠յ", (byte)105, 69), NLoginCore_036.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.A("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԣԆԤԥԢԝԠԥԪԨԫԐƨ", (byte)105, 65) + string + NLoginCore_559.A("Ƌ", (byte)105, 65) + methodType.toString(), exception);
        }
    }

    public boolean aa() {
        return this.S;
    }

    public static NLoginCore_036 valueOf(String string) {
        return Enum.valueOf(NLoginCore_036.class, string);
    }

    private static String a(int n, long l) {
        l ^= 5L;
        l ^= 0xCA4C8CBF1EC7117L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(24 + 45), (byte)(62 + 21), (byte)(7 + 40), (byte)(35 + 32), (byte)(28 + 38), (byte)(35 + 32), (byte)(29 + 18), (byte)(78 + 2), (byte)(20 + 55), (byte)(23 + 44), (byte)(28 + 55), (byte)(15 + 38), (byte)(5 + 75), (byte)(78 + 19), 100, (byte)(53 + 47), (byte)(99 + 6), (byte)(55 + 55), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(37 + 46)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.B("ǘǥǤƧǧǣǞǧǲǡƮǬǰǩǬǲƴՇԪՈՉՆՁՄՉՎՌՏԴ", (byte)123, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_036.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -150505302066925718L;
        long l = var_long_c ^ 0xCA4C8CBF1EC7117L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(12 + 57), (byte)(55 + 28), (byte)(31 + 16), (byte)(47 + 20), (byte)(43 + 23), 67, (byte)(44 + 3), (byte)(19 + 61), (byte)(74 + 1), (byte)(22 + 45), (byte)(32 + 51), (byte)(28 + 25), (byte)(5 + 75), (byte)(55 + 42), (byte)(84 + 16), (byte)(25 + 75), (byte)(4 + 101), 110, (byte)(80 + 23)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_036.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ƚƳƚƞƵŻƴƓƝƛƁƋ", (byte)98, 65);
                    NLoginCore_036.var_java_lang_String_arr_b[1] = NLoginCore_091.F("քա֏֎֕֍էվ֏֌թզ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[2] = NLoginCore_091.F("Օկխջե֋ն֗֙ջ՜զ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[3] = NLoginCore_173.B("ŹƲƮƶƌƫƑƠƱƹŽƋ", (byte)98, 66);
                    NLoginCore_036.var_java_lang_String_arr_b[4] = NLoginCore_559.B("ƥƨƨƟƵƀƢǂƂƭǃƼƲƱƟǃƦƧƹǅƸǏƖƗ", (byte)98, 66);
                    NLoginCore_036.var_java_lang_String_arr_b[5] = NLoginCore_324.B("ƔƌƦƵƲƽƢƖƴƚƂƚƢǀǂƶƇƛƫƨƍƿƖƗ", (byte)98, 66);
                    NLoginCore_036.var_java_lang_String_arr_b[6] = NLoginCore_446.A("ƝƊŷƈƙơƴơƎƘƸƋ", (byte)98, 65);
                    NLoginCore_036.var_java_lang_String_arr_b[7] = NLoginCore_324.F("Օհ֗֒օ֘֗հ։֌֓զ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[8] = NLoginCore_138.D("ՇԪԷԪԩԷԱ՛ԒԦԕԣ", (byte)98, 68);
                    NLoginCore_036.var_java_lang_String_arr_b[9] = NLoginCore_453.F("֊խպխլպմ֞Օթ՘զ", (byte)98, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_036.var_java_lang_String_arr_b[0] = NLoginCore_027.F("շե֌կֈ֛ջիս֗յՠՠ֝֘ղ֤֚֡֙֩֟ձղ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[1] = NLoginCore_138.C("ԬՑԬԸՍԵԯԹԎՌԻԝ՘ՀՀԵԠԝՄՒՄէԮԯ", (byte)98, 67);
                    NLoginCore_036.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ԋԿԱԕ՗ԐԕԓՍՊԶԣ", (byte)98, 67);
                    NLoginCore_036.var_java_lang_String_arr_b[3] = NLoginCore_427.F("Փա֍քքմ֒ջ֚ո՜ջփնգհքբւ֪֚֙ձղ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[4] = NLoginCore_138.D("ԽՀՀԷՍԘԺ՚ԚՅՙՠԵԛԢաՌԢՓաԴՁԮԯ", (byte)98, 68);
                    NLoginCore_036.var_java_lang_String_arr_b[5] = NLoginCore_324.C("ԬԤԾՍՊՕԺԮՌԲԚԑ՟Ե՚ԚԳ՚ՅՑթՁԮԯ", (byte)98, 67);
                    NLoginCore_036.var_java_lang_String_arr_b[6] = NLoginCore_110.F("և֒ալ՘չ֋֋ջ֙֝ն֟ր֣֙֐֩և֖֪֪ձղ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[7] = NLoginCore_324.F("ոևո՘ֆէ՝֐֔րհհ֤֙֙նշսպճռ֪ձղ", (byte)98, 70);
                    NLoginCore_036.var_java_lang_String_arr_b[8] = NLoginCore_387.B("ƷƬƶƏƏƲŹƃƴǄƚƋ", (byte)98, 66);
                    NLoginCore_036.var_java_lang_String_arr_b[9] = NLoginCore_091.B("ƨƻŰƚƐƼƺƯǁơƒƋ", (byte)98, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_036.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ƖŶƾƷŹƓƋƹƻŽưƋ", (byte)98, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_036.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ն֋֖ձ֖խՙ֏որսզ", (byte)98, 69);
                }
            }
        }
    }

    public static NLoginCore_036[] values() {
        return (NLoginCore_036[])var_com_nickuc_login_NLoginCore_036_arr_a.clone();
    }
}

