/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_102;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
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
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_445
extends Enum<NLoginCore_445> {
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_a;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_b;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_c;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_d;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_e;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_f;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_g;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_h;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_i;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_j;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_k;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_l;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_m;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_n;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_o;
    public static final /* enum */ NLoginCore_445 var_com_nickuc_login_NLoginCore_445_p;
    private final NLoginCore_102 var_com_nickuc_login_NLoginCore_102_a;
    private static final /* synthetic */ NLoginCore_445[] var_com_nickuc_login_NLoginCore_445_arr_a;
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
    private static int var_int_k;
    private static int var_int_l;
    private static int var_int_m;
    private static int var_int_n;
    private static int var_int_o;
    private static int var_int_p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static long v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;
    private static int aa;
    private static long ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static long af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static long am;
    private static int an;
    private static int ao;
    private static long ap;
    private static int aq;
    private static int ar;
    private static long as;
    private static int at;
    private static int au;
    private static long av;
    private static long aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static long be;
    private static int bf;
    private static int bg;
    private static long bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static long bl;
    private static long bm;
    private static int bn;
    private static int bo;
    private static long bp;
    private static long bq;
    private static int br;
    private static int bs;
    private static long bt;
    private static long bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static long by;
    private static int bz;

    public int v() {
        return this.ordinal();
    }

    public NLoginCore_190 com_nickuc_login_NLoginCore_190_a(NLoginCore_277 NLoginCore_277) {
        return NLoginCore_150.a(this.var_com_nickuc_login_NLoginCore_102_a, NLoginCore_277);
    }

    public static NLoginCore_445[] values() {
        return (NLoginCore_445[])var_com_nickuc_login_NLoginCore_445_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_445.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("ūƍƏůƓƲƪǀƬŻƹƯƽƷƀƥǇǆƾǄƾƓ", (byte)98, 66), NLoginCore_445.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ԾՋՊԍՍՉՄՍ՘ՇԔՒՖՏՒ՘Ԛ࢟ࢬࢥࢪࢩࢭࢧࢳࢫԯ", (byte)98, 68) + string + NLoginCore_223.A("Ž", (byte)98, 65) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_445 valueOf(String string) {
        return Enum.valueOf(NLoginCore_445.class, string);
    }

    private static String a(int n, long l) {
        l ^= 3L;
        l ^= 0x27FADA0A13B3DEC7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(38 + 31), 83, (byte)(24 + 23), (byte)(6 + 61), (byte)(5 + 61), (byte)(21 + 46), 47, (byte)(69 + 11), (byte)(43 + 32), (byte)(41 + 26), (byte)(13 + 70), (byte)(10 + 43), (byte)(60 + 20), (byte)(54 + 43), (byte)(86 + 14), (byte)(65 + 35), (byte)(101 + 4), (byte)(17 + 93), (byte)(33 + 70)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.B("ƢƯƮűƱƭƨƱƼƫŸƶƺƳƶƼžԃԐԉԎԍԑԋԗԏ", (byte)96, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_445.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    public static NLoginCore_445 a(int n) {
        NLoginCore_445[] NLoginCore_445Array = NLoginCore_445.values();
        if (n >= 0 && n < NLoginCore_445Array.length) {
            return NLoginCore_445Array[n];
        }
        return null;
    }

    private static void b() {
        int n;
        var_long_c = -6405746722120547825L;
        long l = var_long_c ^ 0x27FADA0A13B3DEC7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(30 + 39), (byte)(3 + 80), (byte)(36 + 11), (byte)(43 + 24), (byte)(45 + 21), (byte)(25 + 42), (byte)(15 + 32), (byte)(22 + 58), (byte)(17 + 58), (byte)(35 + 32), (byte)(19 + 64), (byte)(8 + 45), 80, (byte)(94 + 3), (byte)(12 + 88), (byte)(8 + 92), 105, (byte)(89 + 21), (byte)(11 + 92)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_445.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ЫЦѭеЩѩѷЬђхчюѼѐѰѫнѬѐуў҆эю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[1] = NLoginCore_324.D("ќнџўѧѤѺхиіѻт", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[2] = NLoginCore_092.F("ԵԶԢԫԍԐԮԭԥԝՐԛ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[3] = NLoginCore_427.B("ĢĐÚġąīĊãĦĂïďīéëċĔĈòĆķăĀā", (byte)23, 66);
                    NLoginCore_445.var_java_lang_String_arr_b[4] = NLoginCore_324.B("ĀĜæõéăīöêāÿĞĜıĦĖāîčĸĺĹĀā", (byte)23, 66);
                    NLoginCore_445.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ĄħĩàĩĈāĕüĎĚģēĲĜčè÷òġēĹĀā", (byte)23, 66);
                    NLoginCore_445.var_java_lang_String_arr_b[6] = NLoginCore_138.A("ûûðĩçħĈöåħüõ", (byte)23, 65);
                    NLoginCore_445.var_java_lang_String_arr_b[7] = NLoginCore_076.F("ԻԻԺՆԹԡԦՐԆՏՔԛ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[8] = NLoginCore_575.F("ԄԩԷԎԼՊԫՓԜԠԷԳՑԧ՚ԱՆՙԨՒԜԹԦԧ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[9] = NLoginCore_223.F("ԇԢԽԧԦ԰ԟԐԍԴԲԛ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[10] = NLoginCore_027.E("ՋԭԭՈԬԡԦԣԆԝՌԛ", (byte)23, 69);
                    NLoginCore_445.var_java_lang_String_arr_b[11] = NLoginCore_092.C("цэЧгѡфѣгйѴёт", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[12] = NLoginCore_091.D("отўюжѸѧѐѼшмжѽѐѩњјѹ҄ѴѠ҆эю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[13] = NLoginCore_138.D("ќьЬыѯвѩшќѝмѸѭоѻѾѮпѶѱј҆эю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[14] = NLoginCore_384.C("ѴѮЫтхщїћиыдт", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[15] = NLoginCore_453.F("ԄՁԪԝԹՐՆՉԏՄԢԛ", (byte)23, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_445.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ЫЦѭеЩѩѷЬђхцѵѰк҂Ѭѓѝѷ҅ѓѠэю", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[1] = NLoginCore_559.E("ԕԶԗԛԾԜՍՅԬՔԲԛ", (byte)23, 69);
                    NLoginCore_445.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ѥЭыстѰјєѨѷѕт", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ѯѝЧѮђѸїаѳяЯѿъяытҁѕѷњѾѶэю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[4] = NLoginCore_223.C("эѩгтжѐѸузюьдѼйѕыџѿѽѣѨѺѕѫєѪѭѪљћѫ҅", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[5] = NLoginCore_446.E("ԪՍՏԆՏԮԧԻԢԴՃԷԫԑՆԨԸԷԾ՘Ԯ՟Ԧԧ", (byte)23, 69);
                    NLoginCore_445.var_java_lang_String_arr_b[6] = NLoginCore_138.B("ĔòûĂėĉğĠĦġøĎēĊĲĂġĄĥģĲĹĀā", (byte)23, 66);
                    NLoginCore_445.var_java_lang_String_arr_b[7] = NLoginCore_138.C("ѥщѕѵёьэцёѹиїэѿѽџісѿќѓѠэю", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[8] = NLoginCore_092.D("ЫѐўеѣѱђѺучѦўѺѼјѯѶѠѣ҇р҆эю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[9] = NLoginCore_453.C("ёѡѭеѕђзбьвѮѾѕѕъъѼљюѸѼѶэю", (byte)23, 67);
                    NLoginCore_445.var_java_lang_String_arr_b[10] = NLoginCore_324.D("ЫђщюѶчЫјєіѳт", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[11] = NLoginCore_004.E("ӾԙԊՉԤԻԬԴՏԫԏԲՓՍԐՋԎՏԪԾԾԩԦԧ", (byte)23, 69);
                    NLoginCore_445.var_java_lang_String_arr_b[12] = NLoginCore_451.F("ԗԛԷԧԏՑՀԩՕԡԕԎՃՖՑԓԼ՘ԲԯԞԩԦԧ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[13] = NLoginCore_387.F("ԵԥԅԤՈԋՂԡԵԶԖԲՏԺԩՕԫՖԲՇՎԹԦԧ", (byte)23, 70);
                    NLoginCore_445.var_java_lang_String_arr_b[14] = NLoginCore_076.D("џвЫхѐёььѺѝўћїѷѫѺтѲѽѢѹ҆эю", (byte)23, 68);
                    NLoginCore_445.var_java_lang_String_arr_b[15] = NLoginCore_173.E("ԅԩՀԽՄԞՅԤԔՖԦԛ", (byte)23, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_445.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ՃՁԶԁԜԡԣԍԋԪՄԛ", (byte)23, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_445.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ėýÞĩĨćĖý÷ĥýĦĪħčçĵăĖįıĵļüĶĖįďĭēĘģ", (byte)23, 66);
                }
            }
        }
    }

    static {
        var_int_a = 262144 >>> 238 | 262144 << -238;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = Integer.reverse(0x40000000);
        var_int_e = Integer.reverse(-1073741824);
        var_int_f = Integer.reverse(0x20000000);
        var_int_g = Integer.reverse(-1610612736);
        var_int_h = (24 >>> 34 | 24 << -34) & 0xFFFFFFFF;
        var_int_i = Integer.reverse(-536870912);
        var_int_j = Integer.reverse(0x10000000);
        var_int_k = 0x1200000 >>> 53 | 0x1200000 << -53;
        var_int_l = (160 >>> 228 | 160 << ~228 + 1) & 0xFFFFFFFF;
        var_int_m = Integer.reverse(-805306368);
        var_int_n = Integer.reverse(0x30000000);
        var_int_o = 106496 >>> 77 | 106496 << ~77 + 1;
        var_int_p = 0xE00000 >>> 20 | 0xE00000 << -20;
        q = Integer.reverse(-268435456);
        r = Integer.reverse(0x8000000);
        s = Integer.reverse(0x8000000);
        t = 0 >>> 45 | 0 << ~45 + 1;
        u = Long.reverse(-1133913861306689307L);
        v = Long.reverse(-4611686018427387904L);
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Long.reverse(3477772157120698597L);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0x40000000);
        ab = Long.reverse(3477772157120698597L);
        ac = Integer.reverse(0x40000000);
        ad = Integer.reverse(-1073741824);
        ae = Long.reverse(-1133913861306689307L);
        af = Long.reverse(-4611686018427387904L);
        ag = (0x1800000 >>> 183 | 0x1800000 << ~183 + 1) & 0xFFFFFFFF;
        ah = 262144 >>> 176 | 262144 << ~176 + 1;
        ai = (-1 >>> 227 | -1 << -227) & 0xFFFFFFFF;
        aj = Long.reverse(3477772157120698597L);
        ak = Integer.reverse(0x20000000);
        al = 0x140000 >>> 178 | 0x140000 << ~178 + 1;
        am = Long.reverse(3477772157120698597L);
        an = 81920 >>> 110 | 81920 << ~110 + 1;
        ao = (96 >>> 228 | 96 << -228) & 0xFFFFFFFF;
        ap = Long.reverse(3477772157120698597L);
        aq = Integer.reverse(0x60000000);
        ar = -536870912 >>> 29 | -536870912 << ~29 + 1;
        as = Long.reverse(3477772157120698597L);
        at = 14 >>> 1 | 14 << ~1 + 1;
        au = 524288 >>> 208 | 524288 << -208;
        av = Long.reverse(-1133913861306689307L);
        aw = Long.reverse(-4611686018427387904L);
        ax = Integer.reverse(0x10000000);
        ay = Integer.reverse(-1879048192);
        az = -1 >>> 214 | -1 << -214;
        ba = Long.reverse(3477772157120698597L);
        bb = (-2147483644 >>> 255 | -2147483644 << ~255 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0x50000000);
        bd = -1 >>> 3 | -1 << -3;
        be = Long.reverse(3477772157120698597L);
        bf = (0x14000000 >>> 57 | 0x14000000 << ~57 + 1) & 0xFFFFFFFF;
        bg = Integer.reverse(-805306368);
        bh = Long.reverse(-1133913861306689307L);
        bi = Long.reverse(-4611686018427387904L);
        bj = (2816 >>> 8 | 2816 << -8) & 0xFFFFFFFF;
        bk = 0x300000 >>> 114 | 0x300000 << -114;
        bl = Long.reverse(-1133913861306689307L);
        bm = Long.reverse(-4611686018427387904L);
        bn = (6 >>> 31 | 6 << -31) & 0xFFFFFFFF;
        bo = Integer.reverse(-1342177280);
        bp = Long.reverse(-1133913861306689307L);
        bq = Long.reverse(-4611686018427387904L);
        br = 53248 >>> 140 | 53248 << -140;
        bs = Integer.reverse(0x70000000);
        bt = Long.reverse(-1133913861306689307L);
        bu = Long.reverse(-4611686018427387904L);
        bv = 0x1C0000 >>> 113 | 0x1C0000 << -113;
        bw = Integer.reverse(-268435456);
        bx = -1 >>> 185 | -1 << -185;
        by = Long.reverse(3477772157120698597L);
        bz = (0x3C000000 >>> 218 | 0x3C000000 << ~218 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[r];
        var_java_lang_String_arr_b = new String[s];
        NLoginCore_445.b();
        var_com_nickuc_login_NLoginCore_445_a = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_b);
        var_com_nickuc_login_NLoginCore_445_b = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_c);
        var_com_nickuc_login_NLoginCore_445_c = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_d);
        var_com_nickuc_login_NLoginCore_445_d = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_e);
        var_com_nickuc_login_NLoginCore_445_e = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_f);
        var_com_nickuc_login_NLoginCore_445_f = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_g);
        var_com_nickuc_login_NLoginCore_445_g = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_h);
        var_com_nickuc_login_NLoginCore_445_h = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_i);
        var_com_nickuc_login_NLoginCore_445_i = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_j);
        var_com_nickuc_login_NLoginCore_445_j = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_k);
        var_com_nickuc_login_NLoginCore_445_k = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_l);
        var_com_nickuc_login_NLoginCore_445_l = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_m);
        var_com_nickuc_login_NLoginCore_445_m = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_n);
        var_com_nickuc_login_NLoginCore_445_n = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_o);
        var_com_nickuc_login_NLoginCore_445_o = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_p);
        var_com_nickuc_login_NLoginCore_445_p = new NLoginCore_445(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_q);
        var_com_nickuc_login_NLoginCore_445_arr_a = NLoginCore_445.a();
    }

    @Generated
    private NLoginCore_445(NLoginCore_102 NLoginCore_102) {
        this.var_com_nickuc_login_NLoginCore_102_a = NLoginCore_102;
    }

    public GUIButtonContainer com_nickuc_login_GUIButtonContainer_a(NLoginCore_277 NLoginCore_277) {
        return new GUIButtonContainer(this, this.com_nickuc_login_NLoginCore_190_a(NLoginCore_277));
    }

    private static /* synthetic */ NLoginCore_445[] a() {
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[var_int_a];
        NLoginCore_445Array[NLoginCore_445.var_int_b] = var_com_nickuc_login_NLoginCore_445_a;
        NLoginCore_445Array[NLoginCore_445.var_int_c] = var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_445.var_int_d] = var_com_nickuc_login_NLoginCore_445_c;
        NLoginCore_445Array[NLoginCore_445.var_int_e] = var_com_nickuc_login_NLoginCore_445_d;
        NLoginCore_445Array[NLoginCore_445.var_int_f] = var_com_nickuc_login_NLoginCore_445_e;
        NLoginCore_445Array[NLoginCore_445.var_int_g] = var_com_nickuc_login_NLoginCore_445_f;
        NLoginCore_445Array[NLoginCore_445.var_int_h] = var_com_nickuc_login_NLoginCore_445_g;
        NLoginCore_445Array[NLoginCore_445.var_int_i] = var_com_nickuc_login_NLoginCore_445_h;
        NLoginCore_445Array[NLoginCore_445.var_int_j] = var_com_nickuc_login_NLoginCore_445_i;
        NLoginCore_445Array[NLoginCore_445.var_int_k] = var_com_nickuc_login_NLoginCore_445_j;
        NLoginCore_445Array[NLoginCore_445.var_int_l] = var_com_nickuc_login_NLoginCore_445_k;
        NLoginCore_445Array[NLoginCore_445.var_int_m] = var_com_nickuc_login_NLoginCore_445_l;
        NLoginCore_445Array[NLoginCore_445.var_int_n] = var_com_nickuc_login_NLoginCore_445_m;
        NLoginCore_445Array[NLoginCore_445.var_int_o] = var_com_nickuc_login_NLoginCore_445_n;
        NLoginCore_445Array[NLoginCore_445.var_int_p] = var_com_nickuc_login_NLoginCore_445_o;
        NLoginCore_445Array[NLoginCore_445.q] = var_com_nickuc_login_NLoginCore_445_p;
        return NLoginCore_445Array;
    }
}

