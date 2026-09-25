/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_115
extends Enum<NLoginCore_115> {
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_a;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_b;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_c;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_d;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_e;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_f;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_g;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_h;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_i;
    public static final /* enum */ NLoginCore_115 var_com_nickuc_login_NLoginCore_115_j;
    public final String cp;
    private static final /* synthetic */ NLoginCore_115[] var_com_nickuc_login_NLoginCore_115_arr_a;
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
    private static int var_int_h;
    private static int var_int_i;
    private static int var_int_j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static long o;
    private static long p;
    private static int q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;
    private static int v;
    private static long w;
    private static int x;
    private static int y;
    private static long z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static int af;
    private static long ag;
    private static long ah;
    private static int ai;
    private static int aj;
    private static long ak;
    private static long al;
    private static int am;
    private static long an;
    private static long ao;
    private static int ap;
    private static int aq;
    private static long ar;
    private static int as;
    private static int at;
    private static long au;
    private static long av;
    private static int aw;
    private static int ax;
    private static long ay;
    private static int az;
    private static long ba;
    private static long bb;
    private static int bc;
    private static int bd;
    private static long be;
    private static int bf;
    private static long bg;
    private static int bh;

    @Nullable
    public static NLoginCore_115 a(int n) {
        return n > 0 && n < NLoginCore_115.values().length ? NLoginCore_115.values()[n] : null;
    }

    private static void b() {
        int n;
        var_long_c = -1725893528081186445L;
        long l = var_long_c ^ 0xB78830C99CEE29A2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(72 + 11), (byte)(39 + 8), (byte)(4 + 63), (byte)(11 + 55), (byte)(56 + 11), (byte)(21 + 26), (byte)(75 + 5), (byte)(41 + 34), (byte)(10 + 57), (byte)(68 + 15), (byte)(31 + 22), (byte)(61 + 19), (byte)(73 + 24), (byte)(9 + 91), (byte)(93 + 7), (byte)(18 + 87), 110, (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_115.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ǡǧƿǩǰǮǆǎǈǸǑǐǚǁǋǽȃǓǢǔǔǷǎǏ", (byte)126, 65);
                    NLoginCore_115.var_java_lang_String_arr_b[1] = NLoginCore_076.C("ւ։֦֘֟ե֫ա֪է֌֧֖֭֬֨քց֌֚֗֕ւփ", (byte)126, 67);
                    NLoginCore_115.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ւ։֦֘֟ե֫ա֪է֊֮օֲֵ֦֥֭֙֩պ֕ւփ", (byte)126, 67);
                    NLoginCore_115.var_java_lang_String_arr_b[3] = NLoginCore_223.E("թքֆ֫֏֢֎֨շ֜֯ւ", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[4] = NLoginCore_138.C("՞չջ֠ք֗փ֝լ֑֤շ", (byte)126, 67);
                    NLoginCore_115.var_java_lang_String_arr_b[5] = NLoginCore_453.A("ǭǊǋǌǏǩǚǪǉǱǎǃ", (byte)126, 65);
                    NLoginCore_115.var_java_lang_String_arr_b[6] = NLoginCore_201.D("֡վտրփ֝֎֞ս֥ւշ", (byte)126, 68);
                    NLoginCore_115.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ǠǮǌǋǥǅǣƲǝǻǈǿǮƽǝǖǲǲǠȀƺǑǎǏ", (byte)126, 65);
                    NLoginCore_115.var_java_lang_String_arr_b[8] = NLoginCore_138.E("ցւփ֊ֲָղ֏ջճոռֳնַֻ֕֔׀֣֦֐֍֎", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[9] = NLoginCore_453.B("ǁưǲǈǥƲǭǮƺǲǖƿƼǓǷȁǢǝǸǯǦǑǎǏ", (byte)126, 66);
                    NLoginCore_115.var_java_lang_String_arr_b[10] = NLoginCore_091.C("֡եՠ֕փ֪֜ֆզ֦թշ", (byte)126, 67);
                    NLoginCore_115.var_java_lang_String_arr_b[11] = NLoginCore_092.B("ǜǤƾǳǦǅƳǱǭǪǚǿǶƳǿǐƿǠǑǴǗǑǎǏ", (byte)126, 66);
                    NLoginCore_115.var_java_lang_String_arr_b[12] = NLoginCore_446.A("ǭǊǋǌǏǩǚǪǉǱǎǃ", (byte)126, 65);
                    NLoginCore_115.var_java_lang_String_arr_b[13] = NLoginCore_091.C("ռբչտչ֍֍֍֨֫֠֯րէ֧կ֒։֛֖֫֕ւփ", (byte)126, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_115.var_java_lang_String_arr_b[0] = NLoginCore_559.E("֦֠վ֭֨֯օ֍ևַ֐֙չ֋ּւֱֲ֔֕֙׉ֈֹ֦֭֜և֧֩ג֨", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[1] = NLoginCore_091.E("֍ֱ֣֪֔հֶլֵղ֗շ֒ջ֕֍֋֟׀ֺ׀֐֍֎", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[2] = NLoginCore_575.D("ւ։֦֘֟ե֫ա֪է֋֥ս֦ձ֭րִֻ֥֛֚ւփ", (byte)126, 68);
                    NLoginCore_115.var_java_lang_String_arr_b[3] = NLoginCore_559.E("ְ֬֠֯֩֍֘ոַֹմւ", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[4] = NLoginCore_173.F("խ֢֠֋֨ծֹ֧պ֧֗ւ", (byte)126, 70);
                    NLoginCore_115.var_java_lang_String_arr_b[5] = NLoginCore_027.E("ֲց֔ցֳփ֏ְ֭֫֘֔֐պ֭֒րսְ֥֏ֶ֍֎", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[6] = NLoginCore_138.E("ռ֩ի։ַ֦֓չչֹ֏ֳֵ֪֕֜׃ն֐׀ֵ׆֍֎", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[7] = NLoginCore_027.D("֢֔րտ֙չ֗զ֑֯պղֲ֡֍ֱ։ִ֖֏ֻ֨ւփ", (byte)126, 68);
                    NLoginCore_115.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ǂǃǄǋǳǹƳǐƼƴƹǹǯǺǞǮǾǃƸǔǖȇǎǏ", (byte)126, 65);
                    NLoginCore_115.var_java_lang_String_arr_b[9] = NLoginCore_027.B("ǁưǲǈǥƲǭǮƺǲǖǎƾƸǰƽǲƷǹǄǛǾǪǛǾǣǉȏȇǬǱǬ", (byte)126, 66);
                    NLoginCore_115.var_java_lang_String_arr_b[10] = NLoginCore_223.E("ւ֜֐ִַֹ֦ոְֶ֧֝֗։֭֍ֱֳֿׄ֜֠֍֎", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[11] = NLoginCore_091.E("֛֣սֲ֥քղְָֺֻ֥֬֩֜֘֗֙׀֦֪֖֠֕֘ׄ׀֧֢֚ׄ֡", (byte)126, 69);
                    NLoginCore_115.var_java_lang_String_arr_b[12] = NLoginCore_091.D("֠օռտֈր֏֫֐ֱ֦քհլը֬ւփֈ֐ֻֻւփ", (byte)126, 68);
                    NLoginCore_115.var_java_lang_String_arr_b[13] = NLoginCore_201.B("ǈƮǅǋǅǙǙǙǴǷǭǖǚǭǂǒǷǓǣǠǜǡǎǏ", (byte)126, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_115.var_java_lang_String_arr_b[0] = NLoginCore_387.E("ճ֪խճֱ֐֯ֈօֱֵ֪֪֝֘֩֐ׁ֖֟ւ׀֢֦փּ֫֜֫־֟֎", (byte)126, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_115.var_java_lang_String_arr_b[0] = NLoginCore_027.F("իխյֱ։֗֒ֆ֧֕֊ַև֪։ְ֞־׀ֶ֢֐֍֎", (byte)126, 70);
                }
            }
        }
    }

    private static /* synthetic */ NLoginCore_115[] a() {
        NLoginCore_115[] NLoginCore_115Array = new NLoginCore_115[var_int_a];
        NLoginCore_115Array[NLoginCore_115.var_int_b] = var_com_nickuc_login_NLoginCore_115_a;
        NLoginCore_115Array[NLoginCore_115.var_int_c] = var_com_nickuc_login_NLoginCore_115_b;
        NLoginCore_115Array[NLoginCore_115.var_int_d] = var_com_nickuc_login_NLoginCore_115_c;
        NLoginCore_115Array[NLoginCore_115.var_int_e] = var_com_nickuc_login_NLoginCore_115_d;
        NLoginCore_115Array[NLoginCore_115.var_int_f] = var_com_nickuc_login_NLoginCore_115_e;
        NLoginCore_115Array[NLoginCore_115.var_int_g] = var_com_nickuc_login_NLoginCore_115_f;
        NLoginCore_115Array[NLoginCore_115.var_int_h] = var_com_nickuc_login_NLoginCore_115_g;
        NLoginCore_115Array[NLoginCore_115.var_int_i] = var_com_nickuc_login_NLoginCore_115_h;
        NLoginCore_115Array[NLoginCore_115.var_int_j] = var_com_nickuc_login_NLoginCore_115_i;
        NLoginCore_115Array[NLoginCore_115.k] = var_com_nickuc_login_NLoginCore_115_j;
        return NLoginCore_115Array;
    }

    public static NLoginCore_115[] values() {
        return (NLoginCore_115[])var_com_nickuc_login_NLoginCore_115_arr_a.clone();
    }

    public static NLoginCore_115 valueOf(String string) {
        return Enum.valueOf(NLoginCore_115.class, string);
    }

    static {
        var_int_a = 0xA00000 >>> 180 | 0xA00000 << ~180 + 1;
        var_int_b = (0 >>> 188 | 0 << ~188 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = Integer.reverse(0x40000000);
        var_int_e = (6 >>> 65 | 6 << -65) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(0x20000000);
        var_int_g = Integer.reverse(-1610612736);
        var_int_h = Integer.reverse(0x60000000);
        var_int_i = Integer.reverse(-536870912);
        var_int_j = 0x2000000 >>> 54 | 0x2000000 << ~54 + 1;
        k = Integer.reverse(-1879048192);
        l = Integer.reverse(0x70000000);
        m = Integer.reverse(0x70000000);
        n = Integer.reverse(0);
        o = Long.reverse(-3566066543468597225L);
        p = Long.reverse(0x4800000000000000L);
        q = (0 >>> 101 | 0 << ~101 + 1) & 0xFFFFFFFF;
        r = Integer.reverse(Integer.MIN_VALUE);
        s = Long.reverse(-3566066543468597225L);
        t = Long.reverse(0x4800000000000000L);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = 524288 >>> 242 | 524288 << ~242 + 1;
        w = Long.reverse(-8754213314199408617L);
        x = Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << ~158 + 1;
        y = Integer.reverse(-1073741824);
        z = Long.reverse(-3566066543468597225L);
        aa = Long.reverse(0x4800000000000000L);
        ab = (1536 >>> 169 | 1536 << ~169 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(0x20000000);
        ad = -1 >>> 34 | -1 << ~34 + 1;
        ae = Long.reverse(-8754213314199408617L);
        af = Integer.reverse(-1610612736);
        ag = Long.reverse(-3566066543468597225L);
        ah = Long.reverse(0x4800000000000000L);
        ai = Integer.reverse(0x20000000);
        aj = Integer.reverse(0x60000000);
        ak = Long.reverse(-3566066543468597225L);
        al = Long.reverse(0x4800000000000000L);
        am = Integer.reverse(-536870912);
        an = Long.reverse(-3566066543468597225L);
        ao = Long.reverse(0x4800000000000000L);
        ap = Integer.reverse(-1610612736);
        aq = 0x2000000 >>> 54 | 0x2000000 << ~54 + 1;
        ar = Long.reverse(-8754213314199408617L);
        as = 0x180000 >>> 18 | 0x180000 << ~18 + 1;
        at = Integer.reverse(-1879048192);
        au = Long.reverse(-3566066543468597225L);
        av = Long.reverse(0x4800000000000000L);
        aw = Integer.reverse(-536870912);
        ax = Integer.reverse(0x50000000);
        ay = Long.reverse(-8754213314199408617L);
        az = Integer.reverse(-805306368);
        ba = Long.reverse(-3566066543468597225L);
        bb = Long.reverse(0x4800000000000000L);
        bc = 2 >>> 222 | 2 << ~222 + 1;
        bd = Integer.reverse(0x30000000);
        be = Long.reverse(-8754213314199408617L);
        bf = 425984 >>> 175 | 425984 << -175;
        bg = Long.reverse(-8754213314199408617L);
        bh = Integer.reverse(-1879048192);
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_115.b();
        var_com_nickuc_login_NLoginCore_115_a = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_b = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_c = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_d = new NLoginCore_115((String)NLoginCore_115.c("㺌", (int)(ac & ad), (long)ae));
        var_com_nickuc_login_NLoginCore_115_e = new NLoginCore_115((String)NLoginCore_115.c("㺒", (int)aj, (long)(ak ^ al)));
        var_com_nickuc_login_NLoginCore_115_f = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_g = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_h = new NLoginCore_115((String)NLoginCore_115.c("㺞", (int)ax, (long)ay));
        var_com_nickuc_login_NLoginCore_115_i = new NLoginCore_115((String)NLoginCore_115.c("㺤", (int)bd, (long)be));
        var_com_nickuc_login_NLoginCore_115_j = new NLoginCore_115(null);
        var_com_nickuc_login_NLoginCore_115_arr_a = NLoginCore_115.a();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_115.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("ҎҰҲҒҶӕӍӣӏҞӜӒӠӚңӈӪөӡӧӡҶ", (byte)59, 68), NLoginCore_115.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.A("ŘťŤħŧţŞŧŲšĮŬŰũŬŲĴӏҿӋӉҪӁӆҭӃӈӌŋ", (byte)59, 65) + string + NLoginCore_453.C("Ҡ", (byte)59, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_115(String string2) {
        this.cp = string2;
    }

    private static String a(int n, long l) {
        l ^= 0x12L;
        l ^= 0xB78830C99CEE29A2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(22 + 47), (byte)(42 + 41), (byte)(8 + 39), (byte)(41 + 26), (byte)(58 + 8), (byte)(46 + 21), (byte)(45 + 2), (byte)(68 + 12), (byte)(9 + 66), (byte)(30 + 37), (byte)(38 + 45), (byte)(30 + 23), (byte)(20 + 60), 97, (byte)(26 + 74), (byte)(48 + 52), (byte)(75 + 30), (byte)(109 + 1), (byte)(47 + 56)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(6 + 63), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.A("ìùø»û÷òûĆõÂĀĄýĀĆÈѣѓџѝоѕњсїќѠ", (byte)5, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_115.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

