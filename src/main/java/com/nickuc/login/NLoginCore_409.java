/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Bukkit
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
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
import org.bukkit.Bukkit;

public class NLoginCore_409 {
    private static int ah;
    private static int bv;
    private static int bi;
    private static int as;
    private static long u;
    private static int bm;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_l;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_c;
    private static int bx;
    private static int ce;
    private static int var_int_g;
    private static int cfr_renamed_1;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_j;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_g;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_s;
    private static int bj;
    private static int bz;
    private static int cl;
    private static int co;
    private static int var_int_q;
    private static int var_int_l;
    private static int cp;
    private static int ap;
    private static int aj;
    private static int bs;
    private static int bc;
    private static int ab;
    private static long dm;
    private static int cf;
    private static int cz;
    private static int ao;
    private static int w;
    private static int cd;
    private static int var_int_i;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_i;
    private static int ax;
    private static int ae;
    private static int dr;
    private static long var_long_r;
    private static int var_int_t;
    private static int de;
    private static int ag;
    private static int dq;
    private static int aq;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_n;
    private static int cu;
    private final int B;
    private static int ca;
    private static int af;
    private static int ai;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_b;
    private static int var_int_b;
    private static int bf;
    private static int dd;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_o;
    private static long var_long_s;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_k;
    private static int y;
    private static int ac;
    private static int x;
    private static long cv;
    private static int bo;
    private static int ar;
    private static int var_int_j;
    private static int var_int_a;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_p;
    private static int am;
    private static int cj;
    private static long cr;
    private static String[] var_java_lang_String_arr_a;
    private static int dl;
    private static int var_int_c;
    private static int ak;
    private static int ct;
    private static int aw;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_r;
    private static int be;
    private static int var_int_m;
    private static int ci;
    private static long du;
    private static long dt;
    private static String[] var_java_lang_String_arr_b;
    private static int bb;
    private static int cn;
    private static int bk;
    private static int cw;
    private static int dn;
    private static int aa;
    private static long db;
    private static int bt;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_e;
    private static int dk;
    private static int bq;
    private static long cs;
    private static int az;
    private static int au;
    private static int ch;
    private static int bn;
    private final int A;
    private static int var_int_e;
    private static int dc;
    private static long dj;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_h;
    private static int bd;
    private static long var_long_c;
    private static int at;
    private static int ad;
    private static int var_int_n;
    private static int bg;
    private static int cm;
    private static int cg;
    private final int z;
    private static int var_int_k;
    private static int bw;
    private static int var_int_d;
    private static int an;
    private static int cc;
    private static int cy;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_f;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_m;
    private static int dp;
    private static int var_int_p;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_a;
    private static long df;
    private static long cx;
    private static int ba;
    private static int var_int_f;
    private static int by;
    private static int bp;
    private static int av;
    private static int cq;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_q;
    private static long di;
    private static int ds;
    private static int bu;
    private static int var_int_o;
    private static int ay;
    private static long da;
    private static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_t;
    public static final NLoginCore_409 var_com_nickuc_login_NLoginCore_409_d;
    private static int al;
    private static int ck;
    private static int bh;
    private static int cb;
    private static int bl;
    private static long v;
    private static int br;
    private static int var_int_h;
    private static int dh;
    private static int dg;

    public static NLoginCore_409 a() {
        return var_com_nickuc_login_NLoginCore_409_t;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_409.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("ŽƟơƁƥǄƼǒƾƍǋǁǏǉƒƷǙǘǐǖǐƥ", (byte)107, 66), NLoginCore_409.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ƸǅǄƇǇǃƾǇǒǁƎǌǐǉǌǒƔӹӻԨԤԞԞԥԓԤԂԋԥԯƭ", (byte)107, 66) + string + NLoginCore_138.D("԰", (byte)107, 68) + methodType.toString(), exception);
        }
    }

    public String toString() {
        return this.z + (String)NLoginCore_409.c("㺀", (int)var_int_q, (long)(var_long_r ^ var_long_s)) + this.A + (String)NLoginCore_409.c("㺃", (int)var_int_t, (long)(u ^ v)) + this.B;
    }

    private static NLoginCore_409 a(int n, int n2, int n3) {
        return new NLoginCore_409(n, n2, n3);
    }

    public boolean b(NLoginCore_409 NLoginCore_409) {
        if (this.z > NLoginCore_409.z) {
            return var_int_c != 0;
        }
        if (this.z < NLoginCore_409.z) {
            return var_int_d != 0;
        }
        if (this.A > NLoginCore_409.A) {
            return var_int_e != 0;
        }
        if (this.A < NLoginCore_409.A) {
            return var_int_f != 0;
        }
        return (this.B > NLoginCore_409.B ? var_int_g : var_int_h) != 0;
    }

    @Generated
    protected boolean b(Object object) {
        return object instanceof NLoginCore_409;
    }

    public boolean c(NLoginCore_409 NLoginCore_409) {
        return (!this.b(NLoginCore_409) ? var_int_i : var_int_j) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x5EL;
        l ^= 0x496CAF5987CB027BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(33 + 36), (byte)(24 + 59), (byte)(43 + 4), (byte)(54 + 13), 66, (byte)(46 + 21), (byte)(9 + 38), (byte)(10 + 70), (byte)(39 + 36), (byte)(4 + 63), (byte)(76 + 7), (byte)(47 + 6), (byte)(78 + 2), (byte)(36 + 61), (byte)(20 + 80), 100, (byte)(28 + 77), (byte)(42 + 68), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(48 + 35)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.B("öăĂÅąāüąĐÿÌĊĎćĊĐÒзйѦѢќќѣёѢрщѣѭ", (byte)10, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_409.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public int e() {
        return this.z;
    }

    private static void b() {
        int n;
        var_long_c = 1034764045911944668L;
        long l = var_long_c ^ 0x496CAF5987CB027BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(8 + 61), (byte)(22 + 61), (byte)(5 + 42), (byte)(4 + 63), (byte)(13 + 53), 67, (byte)(44 + 3), (byte)(72 + 8), (byte)(39 + 36), (byte)(35 + 32), (byte)(56 + 27), (byte)(42 + 11), (byte)(63 + 17), 97, (byte)(92 + 8), (byte)(89 + 11), (byte)(84 + 21), (byte)(107 + 3), (byte)(60 + 43)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
                    NLoginCore_409.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ļƇŶŶŽňƃƐŨœŠř", (byte)73, 65);
                    NLoginCore_409.var_java_lang_String_arr_b[1] = NLoginCore_575.B("ļƇŶŶŽňƃƐŨœŠř", (byte)73, 66);
                    NLoginCore_409.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ӽӆӋӥӆӦԐӤӊӝӽӘ", (byte)73, 67);
                    NLoginCore_409.var_java_lang_String_arr_b[3] = NLoginCore_324.A("łŅƌšŨƆŉŻŰūőƑƇŨŢŴƈƌŜƎŭſƚſƘƄŴƙŲƃƥŹƧƦƢƉƦơƜƮƎƪƐŹ", (byte)73, 65);
                    NLoginCore_409.var_java_lang_String_arr_b[4] = NLoginCore_201.D("ӻӈӞҾӅԂӋӋӟӒԉӘ", (byte)73, 68);
                    NLoginCore_409.var_java_lang_String_arr_b[5] = NLoginCore_451.C("ӒӈԆӆӜӨԇԇӫӢӫӘ", (byte)73, 67);
                    NLoginCore_409.var_java_lang_String_arr_b[6] = NLoginCore_201.B("ŽƅūƁŝƀƃżōŽŨř", (byte)73, 66);
                    NLoginCore_409.var_java_lang_String_arr_b[7] = NLoginCore_091.D("ӁӄԋӠӧԅӈӺӯӪӐԐԆӧӡӳԇԋӛԍӬӾԙӾԗԃӳԘӱԂԤӸԦԥԡԈԥԠԛԭԍԩԏӸ", (byte)73, 68);
                    NLoginCore_409.var_java_lang_String_arr_b[8] = NLoginCore_559.F("ՇԽջԻՑ՝ռռՠ՗ՠՍ", (byte)73, 70);
                    NLoginCore_409.var_java_lang_String_arr_b[9] = NLoginCore_451.B("řƊƅŸŝŁšŦŤŢųƌƏũťŒœƚŴŨƏƌŲŞŢŭƛƛƓŠžƨƨƠũƕƆƯŧƯƑƧƌƱƵƴűƍƬŻƔƈƊƨƉƊƣƤŶƙơƿƗơƔǋǋǊƨƊưƻǋƑƞưƓƕƱǄǋƪǐǊǚƷƤƥ", (byte)73, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_409.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ƈŶƍşŅƍżőŉŤŠř", (byte)73, 66);
                    NLoginCore_409.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ӨӖӇӝӬӥӁӹӍӫԑӘ", (byte)73, 68);
                    NLoginCore_409.var_java_lang_String_arr_b[2] = NLoginCore_575.A("ňŇŪŵšōŞƑũőŏř", (byte)73, 65);
                    NLoginCore_409.var_java_lang_String_arr_b[3] = NLoginCore_324.D("ӁӄԋӠӧԅӈӺӯӪӐԐԆӧӡӳԇԋӛԍӬӾԙӾԗԃӳԘӱԂԤӸӺӸӾԇԢԊԘӽԜԢԔӫԔԭԯԆԙӲӸԛԱԼԃԄ", (byte)73, 68);
                    NLoginCore_409.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ӽӀӕԈӌӀӜӈӨӲӫӘ", (byte)73, 67);
                    NLoginCore_409.var_java_lang_String_arr_b[5] = NLoginCore_201.F("թՕՋՊՊԾ՘Փգ՟ՐՍ", (byte)73, 70);
                    NLoginCore_409.var_java_lang_String_arr_b[6] = NLoginCore_384.A("ţŤŶƁŘůŦƁƌŊŨř", (byte)73, 65);
                    NLoginCore_409.var_java_lang_String_arr_b[7] = NLoginCore_453.E("ԶԹրՕ՜պԽկդ՟Յօջ՜ՖըռրՐւաճ֎ճ֌ոը֍զշ֙խտ֒լ֚ռփ֦֒ւն֘֓օ֨ն֋ֈսֆֈֱ֨ոչ", (byte)73, 69);
                    NLoginCore_409.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ŧŷŗƁżřŨƁŮſŠř", (byte)73, 65);
                    NLoginCore_409.var_java_lang_String_arr_b[9] = NLoginCore_004.C("ӘԉԄӷӜӀӠӥӣӡӲԋԎӨӤӑӒԙӳӧԎԋӱӝӡӬԚԚԒӟӽԧԧԟӨԔԅԮӦԮԐԦԋ԰ԴԳӰԌԫӺԓԇԉԧԈԉԢԣӵԘԠԾԖԠԓՊՊՉԧԉԯԺՊԐԞԭԞՅՆԓԔՋԙԗԮՌԣԤ", (byte)73, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_409.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ջՉծՖԹՋԻյոպՃևճՂ֊ժպօ՛փՎֆլ֊տց֐յ֖խ֙Ք", (byte)73, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_409.var_java_lang_String_arr_b[0] = NLoginCore_173.C("ӞӺԇԈӽӤӥӾӨԇӧӘ", (byte)73, 67);
                }
            }
        }
    }

    @Generated
    private NLoginCore_409(int n, int n2, int n3) {
        this.z = n;
        this.A = n2;
        this.B = n3;
    }

    @Generated
    public int g() {
        return this.B;
    }

    static {
        int n;
        int n2;
        int n3;
        String[] stringArray;
        var_int_a = 2 >>> 65 | 2 << -65;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0 >>> 44 | 0 << -44;
        var_int_e = 0x1000000 >>> 88 | 0x1000000 << -88;
        var_int_f = 0 >>> 255 | 0 << -255;
        var_int_g = 32 >>> 37 | 32 << -37;
        var_int_h = Integer.reverse(0);
        var_int_i = Integer.reverse(Integer.MIN_VALUE);
        var_int_j = Integer.reverse(0);
        var_int_k = 0x10000000 >>> 28 | 0x10000000 << -28;
        var_int_l = Integer.reverse(0);
        var_int_m = (131072 >>> 241 | 131072 << ~241 + 1) & 0xFFFFFFFF;
        var_int_n = (0 >>> 178 | 0 << ~178 + 1) & 0xFFFFFFFF;
        var_int_o = (256 >>> 104 | 256 << -104) & 0xFFFFFFFF;
        var_int_p = 0 >>> 204 | 0 << ~204 + 1;
        var_int_q = (0 >>> 23 | 0 << ~23 + 1) & 0xFFFFFFFF;
        var_long_r = Long.reverse(4302828165633161840L);
        var_long_s = Long.reverse(0x7A00000000000000L);
        var_int_t = Integer.reverse(Integer.MIN_VALUE);
        u = Long.reverse(4302828165633161840L);
        v = Long.reverse(0x7A00000000000000L);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = (0 >>> 129 | 0 << ~129 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(0);
        aa = Integer.reverse(0);
        ab = 0 >>> 225 | 0 << ~225 + 1;
        ac = Integer.reverse(0);
        ad = 0x8000000 >>> 155 | 0x8000000 << -155;
        ae = 7552 >>> 7 | 7552 << ~7 + 1;
        af = 128 >>> 71 | 128 << -71;
        ag = 0x76000000 >>> 249 | 0x76000000 << ~249 + 1;
        ah = Integer.reverse(-603979776);
        ai = Integer.reverse(-603979776);
        aj = Integer.reverse(0x50000000);
        ak = 81920 >>> 77 | 81920 << -77;
        al = Integer.reverse(0x58000000);
        am = Integer.reverse(0);
        an = 0 >>> 81 | 0 << -81;
        ao = (1 >>> 32 | 1 << ~32 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(-1476395008);
        aq = (57344 >>> 77 | 57344 << ~77 + 1) & 0xFFFFFFFF;
        ar = 32 >>> 5 | 32 << ~5 + 1;
        as = Integer.reverse(0x28000000);
        at = Integer.reverse(0x60000000);
        au = Integer.reverse(Integer.MIN_VALUE);
        av = Integer.reverse(0x28000000);
        aw = (32768 >>> 174 | 32768 << -174) & 0xFFFFFFFF;
        ax = 256 >>> 8 | 256 << -8;
        ay = Integer.reverse(0x28000000);
        az = Integer.reverse(0);
        ba = (0x8000000 >>> 91 | 0x8000000 << ~91 + 1) & 0xFFFFFFFF;
        bb = Integer.reverse(-939524096);
        bc = Integer.MIN_VALUE >>> 93 | Integer.MIN_VALUE << -93;
        bd = (32768 >>> 207 | 32768 << ~207 + 1) & 0xFFFFFFFF;
        be = 304 >>> 36 | 304 << ~36 + 1;
        bf = Integer.reverse(-1073741824);
        bg = Integer.reverse(Integer.MIN_VALUE);
        bh = -2147483639 >>> 255 | -2147483639 << -255;
        bi = Integer.reverse(0);
        bj = Integer.reverse(Integer.MIN_VALUE);
        bk = -2147483644 >>> 190 | -2147483644 << -190;
        bl = (0 >>> 141 | 0 << -141) & 0xFFFFFFFF;
        bm = 16 >>> 68 | 16 << ~68 + 1;
        bn = (557056 >>> 207 | 557056 << ~207 + 1) & 0xFFFFFFFF;
        bo = (0 >>> 90 | 0 << ~90 + 1) & 0xFFFFFFFF;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = 8 >>> 223 | 8 << ~223 + 1;
        br = Integer.reverse(0);
        bs = Integer.reverse(Integer.MIN_VALUE);
        bt = Integer.reverse(-268435456);
        bu = (0 >>> 217 | 0 << ~217 + 1) & 0xFFFFFFFF;
        bv = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0x70000000);
        bx = (0 >>> 244 | 0 << ~244 + 1) & 0xFFFFFFFF;
        by = (16384 >>> 110 | 16384 << -110) & 0xFFFFFFFF;
        bz = Integer.reverse(-1342177280);
        ca = Integer.reverse(0);
        cb = Integer.reverse(Integer.MIN_VALUE);
        cc = (12 >>> 32 | 12 << -32) & 0xFFFFFFFF;
        cd = 0 >>> 30 | 0 << -30;
        ce = Integer.reverse(Integer.MIN_VALUE);
        cf = (44 >>> 130 | 44 << -130) & 0xFFFFFFFF;
        cg = 0 >>> 4 | 0 << ~4 + 1;
        ch = Integer.reverse(Integer.MIN_VALUE);
        ci = (0x280000 >>> 50 | 0x280000 << -50) & 0xFFFFFFFF;
        cj = 0 >>> 197 | 0 << ~197 + 1;
        ck = Integer.reverse(Integer.MIN_VALUE);
        cl = Integer.reverse(-1879048192);
        cm = (0 >>> 44 | 0 << ~44 + 1) & 0xFFFFFFFF;
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = Integer.reverse(0x10000000);
        cp = 0 >>> 191 | 0 << ~191 + 1;
        cq = Integer.reverse(0x40000000);
        cr = Long.reverse(4302828165633161840L);
        cs = Long.reverse(0x7A00000000000000L);
        ct = Integer.reverse(-1);
        cu = Integer.reverse(-1073741824);
        cv = Long.reverse(4735173729860729456L);
        cw = Integer.reverse(0x20000000);
        cx = Long.reverse(4735173729860729456L);
        cy = -1 >>> 125 | -1 << ~125 + 1;
        cz = Integer.reverse(-1610612736);
        da = Long.reverse(4302828165633161840L);
        db = Long.reverse(0x7A00000000000000L);
        dc = Integer.reverse(Integer.MIN_VALUE);
        dd = Integer.reverse(0);
        de = Integer.reverse(0x60000000);
        df = Long.reverse(4735173729860729456L);
        dg = Integer.reverse(0x40000000);
        dh = (0x1C000000 >>> 26 | 0x1C000000 << -26) & 0xFFFFFFFF;
        di = Long.reverse(4302828165633161840L);
        dj = Long.reverse(0x7A00000000000000L);
        dk = Integer.reverse(0x10000000);
        dl = Integer.reverse(-1);
        dm = Long.reverse(4735173729860729456L);
        dn = 0 >>> 162 | 0 << ~162 + 1;
        cfr_renamed_1 = 0x10000000 >>> 156 | 0x10000000 << -156;
        dp = 12 >>> 130 | 12 << ~130 + 1;
        dq = Integer.reverse(0x40000000);
        dr = (0 >>> 28 | 0 << ~28 + 1) & 0xFFFFFFFF;
        ds = -1879048192 >>> 156 | -1879048192 << -156;
        dt = Long.reverse(4302828165633161840L);
        du = Long.reverse(0x7A00000000000000L);
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_409.b();
        var_com_nickuc_login_NLoginCore_409_a = NLoginCore_409.a(al, am, an);
        var_com_nickuc_login_NLoginCore_409_b = NLoginCore_409.a(ao, ap, aq);
        var_com_nickuc_login_NLoginCore_409_c = NLoginCore_409.a(ar, as, at);
        var_com_nickuc_login_NLoginCore_409_d = NLoginCore_409.a(au, av, aw);
        var_com_nickuc_login_NLoginCore_409_e = NLoginCore_409.a(ax, ay, az);
        var_com_nickuc_login_NLoginCore_409_f = NLoginCore_409.a(ba, bb, bc);
        var_com_nickuc_login_NLoginCore_409_g = NLoginCore_409.a(bd, be, bf);
        var_com_nickuc_login_NLoginCore_409_h = NLoginCore_409.a(bg, bh, bi);
        var_com_nickuc_login_NLoginCore_409_i = NLoginCore_409.a(bj, bk, bl);
        var_com_nickuc_login_NLoginCore_409_j = NLoginCore_409.a(bm, bn, bo);
        var_com_nickuc_login_NLoginCore_409_k = NLoginCore_409.a(bp, bq, br);
        var_com_nickuc_login_NLoginCore_409_l = NLoginCore_409.a(bs, bt, bu);
        var_com_nickuc_login_NLoginCore_409_m = NLoginCore_409.a(bv, bw, bx);
        var_com_nickuc_login_NLoginCore_409_n = NLoginCore_409.a(by, bz, ca);
        var_com_nickuc_login_NLoginCore_409_o = NLoginCore_409.a(cb, cc, cd);
        var_com_nickuc_login_NLoginCore_409_p = NLoginCore_409.a(ce, cf, cg);
        var_com_nickuc_login_NLoginCore_409_q = NLoginCore_409.a(ch, ci, cj);
        var_com_nickuc_login_NLoginCore_409_r = NLoginCore_409.a(ck, cl, cm);
        var_com_nickuc_login_NLoginCore_409_s = NLoginCore_409.a(cn, co, cp);
        String string = Bukkit.getVersion();
        Object object = NLoginCore_409.c("㺀", (int)cq, (long)(cr ^ cs));
        int n4 = string.indexOf((String)object);
        if (n4 == ct) {
            throw new IllegalArgumentException((String)NLoginCore_409.c("㺃", (int)cu, (long)cv) + string);
        }
        String string2 = string.substring(n4);
        int n5 = string2.indexOf((String)NLoginCore_409.c("㺆", (int)cw, (long)cx));
        if (n5 != cy && (stringArray = (string2 = string2.substring(((String)object).length(), n5)).split((String)NLoginCore_409.c("㺉", (int)cz, (long)(da ^ db)))).length > dc) {
            string2 = stringArray[dd];
        }
        if ((stringArray = string2.split((String)NLoginCore_409.c("㺌", (int)de, (long)df))).length < dg) {
            throw new IllegalArgumentException((String)NLoginCore_409.c("㺏", (int)dh, (long)(di ^ dj)) + string + (String)NLoginCore_409.c("㺒", (int)(dk & dl), (long)dm) + stringArray.length);
        }
        try {
            n3 = Integer.parseInt(stringArray[dn]);
            n2 = Integer.parseInt(stringArray[cfr_renamed_1]);
            n = stringArray.length >= dp ? Integer.parseInt(stringArray[dq]) : dr;
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException((String)NLoginCore_409.c("㺕", (int)ds, (long)(dt ^ du)) + string);
        }
        var_com_nickuc_login_NLoginCore_409_t = new NLoginCore_409(n3, n2, n);
    }

    @Generated
    public int hashCode() {
        int n = ae;
        int n2 = af;
        n2 = n2 * ag + this.e();
        n2 = n2 * ah + this.f();
        n2 = n2 * ai + this.g();
        return n2;
    }

    public boolean a(NLoginCore_409 NLoginCore_409) {
        return (!this.d(NLoginCore_409) ? var_int_a : var_int_b) != 0;
    }

    public boolean d(NLoginCore_409 NLoginCore_409) {
        if (this.z < NLoginCore_409.z) {
            return var_int_k != 0;
        }
        if (this.z > NLoginCore_409.z) {
            return var_int_l != 0;
        }
        if (this.A < NLoginCore_409.A) {
            return var_int_m != 0;
        }
        if (this.A > NLoginCore_409.A) {
            return var_int_n != 0;
        }
        return (this.B < NLoginCore_409.B ? var_int_o : var_int_p) != 0;
    }

    @Generated
    public int f() {
        return this.A;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return w != 0;
        }
        if (!(object instanceof NLoginCore_409)) {
            return x != 0;
        }
        NLoginCore_409 NLoginCore_409 = (NLoginCore_409)object;
        if (!NLoginCore_409.b((Object)this)) {
            return y != 0;
        }
        if (this.e() != NLoginCore_409.e()) {
            return aa != 0;
        }
        if (this.f() != NLoginCore_409.f()) {
            return ab != 0;
        }
        if (this.g() != NLoginCore_409.g()) {
            return ac != 0;
        }
        return ad != 0;
    }
}

