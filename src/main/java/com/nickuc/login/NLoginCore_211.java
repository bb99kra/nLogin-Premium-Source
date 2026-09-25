/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.BungeeGuardHook;
import com.nickuc.login.NLoginCore_194;
import com.nickuc.login.NLoginCore_162;
import com.nickuc.login.NLoginCore_257;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_580;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_143;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_329;
import com.nickuc.login.NLoginCore_421;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.UpdateCommand;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.ChatHookManager;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_553;
import com.nickuc.login.NLoginCore_579;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.ContactCommand;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_520;
import com.nickuc.login.NLoginCore_330;
import com.nickuc.login.NLoginCore_391;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_072;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_379;
import com.nickuc.login.NLoginCore_279;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_001;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_343;
import com.nickuc.login.NLoginCore_088;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_321;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_038;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_141;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_256;
import com.nickuc.login.NLoginCore_591;
import com.nickuc.login.NLoginCore_521;
import com.nickuc.login.NLoginCore_463;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_122;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_124;
import com.nickuc.login.NLoginCore_192;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_340;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_381;
import com.nickuc.login.NLoginCore_477;
import com.nickuc.login.NLoginCore_377;
import com.nickuc.login.NLoginCore_101;
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

public final class NLoginCore_211
extends Enum<NLoginCore_211> {
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_a;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_b;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_c;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_d;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_e;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_f;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_g;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_h;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_i;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_j;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_k;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_l;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_m;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_n;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_o;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_p;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_q;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_r;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_s;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_t;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_u;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_v;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_w;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_x;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_y;
    public static final /* enum */ NLoginCore_211 var_com_nickuc_login_NLoginCore_211_z;
    public static final /* enum */ NLoginCore_211 A;
    public static final /* enum */ NLoginCore_211 B;
    public static final /* enum */ NLoginCore_211 C;
    public static final /* enum */ NLoginCore_211 D;
    public static final /* enum */ NLoginCore_211 E;
    public static final /* enum */ NLoginCore_211 F;
    public static final /* enum */ NLoginCore_211 G;
    public static final /* enum */ NLoginCore_211 H;
    public static final /* enum */ NLoginCore_211 I;
    public static final /* enum */ NLoginCore_211 J;
    public static final /* enum */ NLoginCore_211 K;
    private final NLoginCore_154 var_com_nickuc_login_NLoginInterface_012_a;
    private static final /* synthetic */ NLoginCore_211[] var_com_nickuc_login_NLoginCore_211_arr_a;
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
    private static long var_long_i;
    private static int var_int_j;
    private static int var_int_k;
    private static int var_int_l;
    private static int var_int_m;
    private static int var_int_n;
    private static int var_int_o;
    private static int var_int_p;
    private static int var_int_q;
    private static int var_int_r;
    private static int var_int_s;
    private static int var_int_t;
    private static int var_int_u;
    private static int var_int_v;
    private static int var_int_w;
    private static int var_int_x;
    private static int var_int_y;
    private static int var_int_z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static long ay;
    private static long az;
    private static int ba;
    private static int bb;
    private static long bc;
    private static long bd;
    private static int be;
    private static int bf;
    private static long bg;
    private static long bh;
    private static int bi;
    private static int bj;
    private static long bk;
    private static int bl;
    private static int bm;
    private static long bn;
    private static long bo;
    private static int bp;
    private static int bq;
    private static long br;
    private static long bs;
    private static int bt;
    private static int bu;
    private static int bv;
    private static long bw;
    private static int bx;
    private static int by;
    private static long bz;
    private static long ca;
    private static int cb;
    private static int cc;
    private static long cd;
    private static long ce;
    private static int cf;
    private static int cg;
    private static long ch;
    private static int ci;
    private static int cj;
    private static long ck;
    private static int cl;
    private static int cm;
    private static long cn;
    private static long co;
    private static int cp;
    private static int cq;
    private static int cr;
    private static long cs;
    private static int ct;
    private static int cu;
    private static long cv;
    private static int cw;
    private static int cx;
    private static long cy;
    private static long cz;
    private static int da;
    private static int db;
    private static long dc;
    private static long dd;
    private static int de;
    private static int df;
    private static long dg;
    private static long dh;
    private static int di;
    private static int dj;
    private static long dk;
    private static int dl;
    private static int dm;
    private static long dn;
    private static int cfr_renamed_1;
    private static int dp;
    private static int dq;
    private static long dr;
    private static int ds;
    private static int dt;
    private static long du;
    private static int dv;
    private static int dw;
    private static int dx;
    private static long dy;
    private static int dz;
    private static int ea;
    private static long eb;
    private static int ec;
    private static int ed;
    private static long ee;
    private static int ef;
    private static int eg;
    private static long eh;
    private static long ei;
    private static int ej;
    private static int ek;
    private static int el;
    private static long em;
    private static int en;
    private static int eo;
    private static long ep;
    private static long eq;
    private static int er;
    private static int es;
    private static long et;
    private static long eu;
    private static int ev;
    private static int ew;
    private static long ex;
    private static int ey;
    private static int ez;
    private static long fa;
    private static long fb;
    private static int fc;
    private static int fd;
    private static int fe;
    private static long ff;
    private static int fg;
    private static int fh;
    private static int fi;
    private static long fj;
    private static int fk;
    private static int fl;
    private static int fm;
    private static long fn;
    private static int fo;
    private static int fp;
    private static long fq;
    private static long fr;
    private static int fs;
    private static int ft;
    private static int fu;
    private static long fv;
    private static int fw;
    private static int fx;
    private static long fy;
    private static long fz;
    private static int ga;
    private static int gb;
    private static long gc;
    private static int gd;

    private static NLoginCore_211[] a(boolean bl) {
        if (bl) {
            NLoginCore_211 NLoginCore_211;
            int n;
            NLoginCore_211[] NLoginCore_211Array = NLoginCore_211.values();
            NLoginCore_211[] NLoginCore_211Array2 = new NLoginCore_211[NLoginCore_211Array.length];
            int n2 = var_int_e;
            NLoginCore_211[] NLoginCore_211Array3 = NLoginCore_211Array;
            int n3 = NLoginCore_211Array3.length;
            for (n = var_int_f; n < n3; ++n) {
                NLoginCore_211 = NLoginCore_211Array3[n];
                if (!(NLoginCore_211.var_com_nickuc_login_NLoginInterface_012_a instanceof NLoginCore_249)) continue;
                NLoginCore_211Array2[n2++] = NLoginCore_211;
            }
            NLoginCore_211Array3 = NLoginCore_211Array;
            n3 = NLoginCore_211Array3.length;
            for (n = var_int_g; n < n3; ++n) {
                NLoginCore_211 = NLoginCore_211Array3[n];
                if (NLoginCore_211.var_com_nickuc_login_NLoginInterface_012_a instanceof NLoginCore_249) continue;
                NLoginCore_211Array2[n2++] = NLoginCore_211;
            }
            return NLoginCore_211Array2;
        }
        return NLoginCore_211.values();
    }

    private NLoginCore_211(Class<? extends NLoginCore_154> clazz) {
        try {
            Class[] classArray = new Class[var_int_a];
            classArray[NLoginCore_211.var_int_b] = NLoginCore_211.class;
            Object[] objectArray = new Object[var_int_c];
            objectArray[NLoginCore_211.var_int_d] = this;
            this.var_com_nickuc_login_NLoginInterface_012_a = clazz.getConstructor(classArray).newInstance(objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static NLoginCore_211[] values() {
        return (NLoginCore_211[])var_com_nickuc_login_NLoginCore_211_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_211.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_211.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("ըյմԷշճծշւձԾռրչռւՄࢿ࣊ࢳ࣓ࣗ࣢࣏࣡՘", (byte)73, 70) + string + NLoginCore_223.B("ŋ", (byte)73, 66) + methodType.toString(), exception);
        }
    }

    public NLoginCore_154 com_nickuc_login_NLoginInterface_012_a() {
        return this.var_com_nickuc_login_NLoginInterface_012_a;
    }

    private static String a(int n, long l) {
        l ^= 0xEL;
        l ^= 0xDBE72EF4C55FE94CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(43 + 26), (byte)(26 + 57), (byte)(36 + 11), 67, (byte)(65 + 1), (byte)(61 + 6), 47, (byte)(30 + 50), (byte)(72 + 3), (byte)(48 + 19), (byte)(64 + 19), (byte)(34 + 19), (byte)(23 + 57), (byte)(28 + 69), (byte)(32 + 68), (byte)(4 + 96), (byte)(28 + 77), (byte)(8 + 102), (byte)(51 + 52)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.C("мщшЋычтыіхВѐєэѐіИޓޞއޫާ޶ޣ޵", (byte)12, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_211.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public int v() {
        return this.ordinal();
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0 >>> 31 | 0 << -31) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = Integer.reverse(0);
        var_int_e = 0 >>> 60 | 0 << -60;
        var_int_f = Integer.reverse(0);
        var_int_g = Integer.reverse(0);
        var_int_h = Integer.reverse(0);
        var_long_i = Long.reverse(-8598151967311855558L);
        var_int_j = Integer.reverse(-1543503872);
        var_int_k = (0 >>> 215 | 0 << ~215 + 1) & 0xFFFFFFFF;
        var_int_l = Integer.reverse(Integer.MIN_VALUE);
        var_int_m = 16384 >>> 13 | 16384 << -13;
        var_int_n = Integer.reverse(-1073741824);
        var_int_o = 256 >>> 38 | 256 << ~38 + 1;
        var_int_p = 0x14000000 >>> 218 | 0x14000000 << ~218 + 1;
        var_int_q = Integer.reverse(0x60000000);
        var_int_r = (-1073741823 >>> 222 | -1073741823 << -222) & 0xFFFFFFFF;
        var_int_s = Integer.reverse(0x10000000);
        var_int_t = (144 >>> 4 | 144 << -4) & 0xFFFFFFFF;
        var_int_u = 10 >>> 128 | 10 << ~128 + 1;
        var_int_v = (-2147483643 >>> 255 | -2147483643 << ~255 + 1) & 0xFFFFFFFF;
        var_int_w = Integer.reverse(0x30000000);
        var_int_x = 53248 >>> 172 | 53248 << -172;
        var_int_y = (0xE00000 >>> 20 | 0xE00000 << ~20 + 1) & 0xFFFFFFFF;
        var_int_z = 960 >>> 6 | 960 << -6;
        aa = (2 >>> 253 | 2 << ~253 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(-2013265920);
        ac = (0x240000 >>> 17 | 0x240000 << ~17 + 1) & 0xFFFFFFFF;
        ad = (0x60000002 >>> 29 | 0x60000002 << ~29 + 1) & 0xFFFFFFFF;
        ae = -1610612736 >>> 27 | -1610612736 << ~27 + 1;
        af = (84 >>> 194 | 84 << -194) & 0xFFFFFFFF;
        ag = Integer.reverse(0x68000000);
        ah = (0x5C000000 >>> 90 | 0x5C000000 << ~90 + 1) & 0xFFFFFFFF;
        ai = Integer.reverse(0x18000000);
        aj = 0xC800000 >>> 215 | 0xC800000 << -215;
        ak = (0x680000 >>> 114 | 0x680000 << -114) & 0xFFFFFFFF;
        al = 884736 >>> 175 | 884736 << -175;
        am = (114688 >>> 236 | 114688 << -236) & 0xFFFFFFFF;
        an = Integer.reverse(-1207959552);
        ao = (15 >>> 63 | 15 << ~63 + 1) & 0xFFFFFFFF;
        ap = (1984 >>> 6 | 1984 << ~6 + 1) & 0xFFFFFFFF;
        aq = 524288 >>> 14 | 524288 << ~14 + 1;
        ar = Integer.reverse(-2080374784);
        as = Integer.reverse(0x44000000);
        at = Integer.reverse(-1006632960);
        au = Integer.reverse(0x24000000);
        av = (0x1300000 >>> 83 | 0x1300000 << ~83 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(0x64000000);
        ax = Integer.reverse(Integer.MIN_VALUE);
        ay = Long.reverse(-527701435063926726L);
        az = Long.reverse(0x7000000000000000L);
        ba = Integer.reverse(0);
        bb = 1024 >>> 105 | 1024 << ~105 + 1;
        bc = Long.reverse(-527701435063926726L);
        bd = Long.reverse(0x7000000000000000L);
        be = 0x2000000 >>> 249 | 0x2000000 << -249;
        bf = (12288 >>> 172 | 12288 << ~172 + 1) & 0xFFFFFFFF;
        bg = Long.reverse(-527701435063926726L);
        bh = Long.reverse(0x7000000000000000L);
        bi = (0x800000 >>> 214 | 0x800000 << -214) & 0xFFFFFFFF;
        bj = (1024 >>> 72 | 1024 << ~72 + 1) & 0xFFFFFFFF;
        bk = Long.reverse(-8598151967311855558L);
        bl = Integer.reverse(-1073741824);
        bm = Integer.reverse(-1610612736);
        bn = Long.reverse(-527701435063926726L);
        bo = Long.reverse(0x7000000000000000L);
        bp = Integer.reverse(0x20000000);
        bq = Integer.reverse(0x60000000);
        br = Long.reverse(-527701435063926726L);
        bs = Long.reverse(0x7000000000000000L);
        bt = (20480 >>> 236 | 20480 << ~236 + 1) & 0xFFFFFFFF;
        bu = Integer.reverse(-536870912);
        bv = (-1 >>> 61 | -1 << -61) & 0xFFFFFFFF;
        bw = Long.reverse(-8598151967311855558L);
        bx = Integer.reverse(0x60000000);
        by = Integer.reverse(0x10000000);
        bz = Long.reverse(-527701435063926726L);
        ca = Long.reverse(0x7000000000000000L);
        cb = (-536870912 >>> 157 | -536870912 << ~157 + 1) & 0xFFFFFFFF;
        cc = Integer.reverse(-1879048192);
        cd = Long.reverse(-527701435063926726L);
        ce = Long.reverse(0x7000000000000000L);
        cf = Integer.reverse(0x10000000);
        cg = Integer.reverse(0x50000000);
        ch = Long.reverse(-8598151967311855558L);
        ci = Integer.reverse(-1879048192);
        cj = (704 >>> 134 | 704 << -134) & 0xFFFFFFFF;
        ck = Long.reverse(-8598151967311855558L);
        cl = (0x500000 >>> 83 | 0x500000 << ~83 + 1) & 0xFFFFFFFF;
        cm = Integer.reverse(0x30000000);
        cn = Long.reverse(-527701435063926726L);
        co = Long.reverse(0x7000000000000000L);
        cp = 22528 >>> 11 | 22528 << -11;
        cq = Integer.reverse(-1342177280);
        cr = (-1 >>> 152 | -1 << ~152 + 1) & 0xFFFFFFFF;
        cs = Long.reverse(-8598151967311855558L);
        ct = 0x18000000 >>> 217 | 0x18000000 << ~217 + 1;
        cu = Integer.reverse(0x70000000);
        cv = Long.reverse(-8598151967311855558L);
        cw = Integer.reverse(-1342177280);
        cx = Integer.reverse(-268435456);
        cy = Long.reverse(-527701435063926726L);
        cz = Long.reverse(0x7000000000000000L);
        da = 0x1C0000 >>> 17 | 0x1C0000 << -17;
        db = Integer.reverse(0x8000000);
        dc = Long.reverse(-527701435063926726L);
        dd = Long.reverse(0x7000000000000000L);
        de = (240 >>> 36 | 240 << -36) & 0xFFFFFFFF;
        df = (0x11000000 >>> 24 | 0x11000000 << -24) & 0xFFFFFFFF;
        dg = Long.reverse(-527701435063926726L);
        dh = Long.reverse(0x7000000000000000L);
        di = (8 >>> 191 | 8 << -191) & 0xFFFFFFFF;
        dj = Integer.reverse(0x48000000);
        dk = Long.reverse(-8598151967311855558L);
        dl = (0x2200000 >>> 21 | 0x2200000 << -21) & 0xFFFFFFFF;
        dm = 155648 >>> 45 | 155648 << ~45 + 1;
        dn = Long.reverse(-8598151967311855558L);
        cfr_renamed_1 = (0x480000 >>> 210 | 0x480000 << -210) & 0xFFFFFFFF;
        dp = Integer.reverse(0x28000000);
        dq = -1 >>> 210 | -1 << -210;
        dr = Long.reverse(-8598151967311855558L);
        ds = Integer.reverse(-939524096);
        dt = Integer.reverse(-1476395008);
        du = Long.reverse(-8598151967311855558L);
        dv = Integer.reverse(0x28000000);
        dw = Integer.reverse(0x68000000);
        dx = -1 >>> 41 | -1 << ~41 + 1;
        dy = Long.reverse(-8598151967311855558L);
        dz = 0x40000005 >>> 126 | 0x40000005 << ~126 + 1;
        ea = 23552 >>> 106 | 23552 << -106;
        eb = Long.reverse(-8598151967311855558L);
        ec = (720896 >>> 47 | 720896 << -47) & 0xFFFFFFFF;
        ed = (24576 >>> 106 | 24576 << -106) & 0xFFFFFFFF;
        ee = Long.reverse(-8598151967311855558L);
        ef = 0x170000 >>> 208 | 0x170000 << ~208 + 1;
        eg = Integer.reverse(-1744830464);
        eh = Long.reverse(-527701435063926726L);
        ei = Long.reverse(0x7000000000000000L);
        ej = (12 >>> 159 | 12 << -159) & 0xFFFFFFFF;
        ek = Integer.reverse(0x58000000);
        el = -1 >>> 6 | -1 << -6;
        em = Long.reverse(-8598151967311855558L);
        en = (0x190000 >>> 208 | 0x190000 << -208) & 0xFFFFFFFF;
        eo = -671088640 >>> 219 | -671088640 << -219;
        ep = Long.reverse(-527701435063926726L);
        eq = Long.reverse(0x7000000000000000L);
        er = 0x34000000 >>> 89 | 0x34000000 << ~89 + 1;
        es = Integer.reverse(0x38000000);
        et = Long.reverse(-527701435063926726L);
        eu = Long.reverse(0x7000000000000000L);
        ev = (108 >>> 162 | 108 << -162) & 0xFFFFFFFF;
        ew = (58 >>> 1 | 58 << ~1 + 1) & 0xFFFFFFFF;
        ex = Long.reverse(-8598151967311855558L);
        ey = Integer.reverse(0x38000000);
        ez = Integer.reverse(0x78000000);
        fa = Long.reverse(-527701435063926726L);
        fb = Long.reverse(0x7000000000000000L);
        fc = Integer.reverse(-1207959552);
        fd = Integer.reverse(-134217728);
        fe = Integer.reverse(-1);
        ff = Long.reverse(-8598151967311855558L);
        fg = Integer.reverse(0x78000000);
        fh = (65536 >>> 235 | 65536 << ~235 + 1) & 0xFFFFFFFF;
        fi = (-1 >>> 73 | -1 << -73) & 0xFFFFFFFF;
        fj = Long.reverse(-8598151967311855558L);
        fk = Integer.reverse(-134217728);
        fl = Integer.reverse(-2080374784);
        fm = -1 >>> 27 | -1 << ~27 + 1;
        fn = Long.reverse(-8598151967311855558L);
        fo = Integer.reverse(0x4000000);
        fp = 17408 >>> 169 | 17408 << ~169 + 1;
        fq = Long.reverse(-527701435063926726L);
        fr = Long.reverse(0x7000000000000000L);
        fs = Integer.reverse(-2080374784);
        ft = -1073741816 >>> 158 | -1073741816 << ~158 + 1;
        fu = -1 >>> 104 | -1 << ~104 + 1;
        fv = Long.reverse(-8598151967311855558L);
        fw = Integer.reverse(0x44000000);
        fx = Integer.reverse(0x24000000);
        fy = Long.reverse(-527701435063926726L);
        fz = Long.reverse(0x7000000000000000L);
        ga = Integer.reverse(-1006632960);
        gb = Integer.reverse(-1543503872);
        gc = Long.reverse(-8598151967311855558L);
        gd = 72 >>> 225 | 72 << -225;
        var_java_lang_String_arr_a = new String[av];
        var_java_lang_String_arr_b = new String[aw];
        NLoginCore_211.b();
        var_com_nickuc_login_NLoginCore_211_a = new NLoginCore_211(NLoginCore_162.class);
        var_com_nickuc_login_NLoginCore_211_b = new NLoginCore_211(NLoginCore_520.class);
        var_com_nickuc_login_NLoginCore_211_c = new NLoginCore_211(NLoginCore_329.class);
        var_com_nickuc_login_NLoginCore_211_d = new NLoginCore_211(NLoginCore_141.class);
        var_com_nickuc_login_NLoginCore_211_e = new NLoginCore_211(NLoginCore_340.class);
        var_com_nickuc_login_NLoginCore_211_f = new NLoginCore_211(NLoginCore_122.class);
        var_com_nickuc_login_NLoginCore_211_g = new NLoginCore_211(NLoginCore_257.class);
        var_com_nickuc_login_NLoginCore_211_h = new NLoginCore_211(NLoginCore_391.class);
        var_com_nickuc_login_NLoginCore_211_i = new NLoginCore_211(NLoginCore_421.class);
        var_com_nickuc_login_NLoginCore_211_j = new NLoginCore_211(NLoginCore_143.class);
        var_com_nickuc_login_NLoginCore_211_k = new NLoginCore_211(NLoginCore_580.class);
        var_com_nickuc_login_NLoginCore_211_l = new NLoginCore_211(NLoginCore_072.class);
        var_com_nickuc_login_NLoginCore_211_m = new NLoginCore_211(UpdateCommand.class);
        var_com_nickuc_login_NLoginCore_211_n = new NLoginCore_211(NLoginCore_377.class);
        var_com_nickuc_login_NLoginCore_211_o = new NLoginCore_211(NLoginCore_591.class);
        var_com_nickuc_login_NLoginCore_211_p = new NLoginCore_211(NLoginCore_343.class);
        var_com_nickuc_login_NLoginCore_211_q = new NLoginCore_211(NLoginCore_379.class);
        var_com_nickuc_login_NLoginCore_211_r = new NLoginCore_211(BungeeGuardHook.class);
        var_com_nickuc_login_NLoginCore_211_s = new NLoginCore_211(NLoginCore_477.class);
        var_com_nickuc_login_NLoginCore_211_t = new NLoginCore_211(NLoginCore_279.class);
        var_com_nickuc_login_NLoginCore_211_u = new NLoginCore_211(NLoginCore_038.class);
        var_com_nickuc_login_NLoginCore_211_v = new NLoginCore_211(NLoginCore_321.class);
        var_com_nickuc_login_NLoginCore_211_w = new NLoginCore_211(NLoginCore_463.class);
        var_com_nickuc_login_NLoginCore_211_x = new NLoginCore_211(NLoginCore_553.class);
        var_com_nickuc_login_NLoginCore_211_y = new NLoginCore_211(NLoginCore_101.class);
        var_com_nickuc_login_NLoginCore_211_z = new NLoginCore_211(NLoginCore_194.class);
        A = new NLoginCore_211(NLoginCore_579.class);
        B = new NLoginCore_211(ChatHookManager.class);
        C = new NLoginCore_211(NLoginCore_330.class);
        D = new NLoginCore_211(NLoginCore_256.class);
        E = new NLoginCore_211(NLoginCore_381.class);
        F = new NLoginCore_211(NLoginCore_124.class);
        G = new NLoginCore_211(ContactCommand.class);
        H = new NLoginCore_211(NLoginCore_521.class);
        I = new NLoginCore_211(NLoginCore_192.class);
        J = new NLoginCore_211(NLoginCore_001.class);
        K = new NLoginCore_211(NLoginCore_088.class);
        var_com_nickuc_login_NLoginCore_211_arr_a = NLoginCore_211.com_nickuc_login_NLoginCore_211_arr_a();
    }

    private static void b() {
        int n;
        var_long_c = 6629494282591712543L;
        long l = var_long_c ^ 0xDBE72EF4C55FE94CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(10 + 59), (byte)(23 + 60), (byte)(19 + 28), (byte)(50 + 17), (byte)(11 + 55), 67, (byte)(27 + 20), (byte)(40 + 40), (byte)(29 + 46), (byte)(29 + 38), (byte)(31 + 52), (byte)(29 + 24), (byte)(3 + 77), (byte)(32 + 65), 100, (byte)(34 + 66), (byte)(20 + 85), (byte)(106 + 4), (byte)(24 + 79)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_211.var_java_lang_String_arr_b[0] = NLoginCore_223.F("֗՚֎ս֗ո՞՞֘ք֛֢՞յդճոբչ֋֮չխգ֊ի֔մ֧֭փ֍և֑֭օ֨֌ָրտ֛ջ։", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[1] = NLoginCore_004.C("Ծ՞ԲՍՖԚՃՓ՞ՃՑ՟Օաթգ՞՗հլՇԫՐՠՈԵկՉէձպջպխշ՜ԾմԼվչՕԾՌ", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[2] = NLoginCore_091.A("ƣǃƗƲƻſƨƸǃƨƹƾƉơƌƋǆƯǃƍǄǐƘǏǖƥǝǑƵǏǒǘ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[3] = NLoginCore_575.A("ƖŻƤƞƵƤƧǉƉƣƞƣǋƋƇƦƤưǁƒƠƯƜƝ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[4] = NLoginCore_575.B("ƖŻƤƞƵƤƧǉƉƣƞƘƤƊǈǁƎƪǕƮƥǅƜƝ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[5] = NLoginCore_451.C("ԵՓԫՁՊԞ՗Ձ՞զէգՙզ՜ԶժԷՄՆԭ՞գԬՠշ԰բԱՐԶ՚", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[6] = NLoginCore_027.B("ƚƸƐƦƯƃƼƦǃǋǌƕƌƜǂǋƮǓƔǅƫǅƜƝ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ƪǄƣƓƧǆƵƑƵƕƊǃǉƮǆǐƑƒƎǂƓƟƜƝ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[8] = NLoginCore_201.B("ƣǃƗƲƻſƨƸǃƨƶǄƺǆǎǈǃƼǕǑƬƕǕƩǃƦƽƔƺƛƪǋƴǝƞƠƲǤǡƳƾǜǖƱ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[9] = NLoginCore_324.A("ƀǄƷǂƚƾƜơƨƃǇƜƌƘƮơǒǉǊƪƱǊƧƲǆƺƗƬǝƻƩǋƱǋǁǐǠƙƠƿǖƩƫƱ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[10] = NLoginCore_384.B("ƮƎƀǅƞƏƣƅƻƫƘƦǃƥǊƥƩǐƋƪƤǎǋƸƗƓƗƲƽƛƱƱ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[11] = NLoginCore_223.A("ƀƎƮƾƜƾſƞƁƹžǆǌƮƹƱƫƿƌƒǗǅƜƝ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[12] = NLoginCore_384.B("ƴƷżƢƄǂƹƦƒƇƻƢƅƯƧƠǈǈƲƬǔƟƜƝ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[13] = NLoginCore_223.A("ƠǂǀƁƱƷƙƗƔƈƸƧƶƨƨưǇƍǂƍǀƿƏƦƭǄƶƜǊǞƵǌǓǎƚǂǁƷǅǆƹơǪƱ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ƠǂǀƁƱƷƙƗƔƈƶǍƿƷǇƛƫƲƓƣƢǍƎǕǙǋǏǏưƳǋƾƹƞǎƾƝǈǕǓƼǩƼƺǙƪǀǭǯƪǪǈǫƿƼƽ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[15] = NLoginCore_076.C("Ի՝՛ԜՌՒԴԲԯԣՔԴՔՔԪ՟Իՠՠթզ՝԰ժՆՊԴգծԷձէՆտՎԷյփԺւնրՓՌ", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[16] = NLoginCore_027.B("ƴǀƘƤǁƔƇƝƁƆƛƫƞƙƜƤǈƛƵƨǖƯƜƝ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[17] = NLoginCore_453.B("ƠǂǀƁƱƷƙƗƔƈƷǆƈǅƍƦƨƽƩƝǖǆǈƘǂƼǇǙǟƙƚƯ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[18] = NLoginCore_201.D("Ի՝՛ԜՌՒԴԲԯԣՓգՈՖ՞՗ԩՈՎգԪէՎՋՁՉԲմՄՔոշ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[19] = NLoginCore_453.F("Ռք՘Ք֘մ՜ղծ֠լ֢զնմ֕֨ֈը֩֎ֆվ֍ս։֢֩փճ֠ձ֌նչ֞֍֎ֶַֹ֔֘։", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[20] = NLoginCore_092.E("ո֚֘ՙ։֏ձկլՠ֏ջ֛ս֚զ֜պ֋֢ց֜սժդ։ֈս֗ճֲ֏յֱ֫֊֯յַ֋֡֕տ։", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[21] = NLoginCore_559.A("ƠǂǀƁƱƷƙƗƔƈƷƣǃƥǂƎǄƢƳǊƩǄƥƒƌƱưƥƿƛǚƷǞƬƛƱƵƷǣǪơǃǫǎǧǰǁǛƿǛǢǰǟǴƷǑǆǬƶǋǛǴǏǐ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[22] = NLoginCore_451.B("ƾƒƒƒƳƅƹƵƅƚǆǆǋǄǃƯƼơǒƶƓƪƸǖǊǎǇǛƦǋƸƙƲǡǖƳưƦǧǑƢǘǀǦǀǬǬǥǃǢƯǕǁǵƼƽ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[23] = NLoginCore_091.E("֓պ֒֔Ֆֈ֒ւռւ֐օդ֒ֆփ֋ենտխ֑֮֝֊հժ֋֖֨֯հյևֆְ֐֌ֽ֖֮֨֗֗սֳ֜օ֫׉ֶ֣ևֽ֔֕", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[24] = NLoginCore_446.A("ƮǃƹǀſƚǅƃƆƥƽƇǉǋƺƎƒƭƓƠƫƴƒƶƥǍƓƪƲƜǜǟ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[25] = NLoginCore_324.E("ջֈ։լ֚յ֊֌֚֒շհֆ֓փ֡֊չլթ֥֯ժ֢֑րհրֵ֋ִַ", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[26] = NLoginCore_384.A("ƳƳƒƮƲƺƕƇżǄƺƪƢǃưƯƐƭǋƍǗǍƪǁƘƨƛưƯǉƴƽ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[27] = NLoginCore_173.B("ƳƏưƿſǃƣǅǇƥƞƸƠƟƸƏƉƾƤƪƐƓƕƏƧǔǒƾǉǟƞǔ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[28] = NLoginCore_324.F("֛Սն֎տ֖֘ւ֙ի֑֜֝բւմ֣֜֘֠շռտւ֧ծ֯֋ւָ֪֣", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[29] = NLoginCore_384.F("նո՚Ք՝՝֞֌֙ս՟ա֕ք֛֥զւ֞փցռ֪֧֋֣֯կְյֱհ", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[30] = NLoginCore_004.A("ƘƎǁǄƤƺƦƞƼƳƊƪƼǋƻǑƒǑǌƲưƯƏǈƚǅǒǌƴǘƛƽ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[31] = NLoginCore_201.C("ԛ՟Ւ՝ԵՙԷԼՃԞաԧՖՙԥխՀՀ՞ՠԯ՜՜ՂիժիՏհԲՖշ", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[32] = NLoginCore_092.A("ƠƲƵƔƂƼƾƙƼƈǀƈƚƯƜƐǌƿƜƋǊƶǕǙƖƹǜƦƨƹƯƮ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[33] = NLoginCore_076.E("ջ֛կ֊֓՗ր֐֛ր֐խ֕բ՚պ֖ֈզ֡։֭մյ", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[34] = NLoginCore_427.D("ԾՍԧԪԪԙԝԚԲԯԳ՛ՠՔՅԩԾ՝աեԹՍԫՀՀԾհգՔԷԶՍ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[35] = NLoginCore_201.E("զՍո֙֊֑ո՚ռ֣բճգդո֠ստ֝փ֮֗ս֙րժ֊֖ւֲ֖֠", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[36] = NLoginCore_453.E("ջ֛կ֊֓՗ր֐֛ր֏֎քճբ֖֔֋շ֬։եְֱֶ֛֓֜֜֟֘֌", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[37] = NLoginCore_559.C("ԹՎՙԜՔԙգ՛ՐԣՅԱՁԪԢՌ՛ՌԬԻզհԷԸ", (byte)101, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_211.var_java_lang_String_arr_b[0] = NLoginCore_138.D("՚ԝՑՀ՚Իԡԡ՛Շ՞եԡԸԧԶԻԥԼՎձԼ԰ԦՍԮ՗ԷհժՆՐՓԵծԽնԿՁՖռմ՟Ռ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ջ֛կ֊֓՗ր֐֛ր֎֦֛֭֜֒֞֠֔֩քը֍֝օղ֬ֆַָ֤֮ևշչ֯֍֬֐֛ջׂ֔։", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[2] = NLoginCore_138.A("ƣǃƗƲƻſƨƸǃƨƹƾƉơƌƋǆƯǃƍǄǈǏǉƶƗƨƱƫƧǐǐ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[3] = NLoginCore_138.C("ԱԖԿԹՐԿՂդԤԾԺԳԹԥզԶՌթՆԫ՟ՎՐՓիԨՇՁՉՖթո", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[4] = NLoginCore_076.F("ծՓռն֍ռտ֡աջն՟ւո֥֨֒ըշ֜ոս֜ց֋ւմ֐քտ։֓", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[5] = NLoginCore_451.C("ԵՓԫՁՊԞ՗Ձ՞զէգՙզ՜ԶժԷՄՆԭ՛Ԫ՞ՈգիՐՊՒՙե", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ƚƸƐƦƯƃƼƦǃǋǍƵǀǍƠǒƍǆƭƢƣǗǂǆƳǓƨǋƳƛƹƳ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[7] = NLoginCore_559.E("ւ֜ջիտ֞֍թ֍խայ֛ջ֚֚֙֗֋ըְ֫ևօְֱ֪֕փն֍֑", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[8] = NLoginCore_453.B("ƣǃƗƲƻſƨƸǃƨƶǄƺǆǎǈǃƼǕǑƬƕǕƩǃƦƽƔƺƛƪǋǕǁƝơǗǓǉǖƳǁǈƱ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ƀǄƷǂƚƾƜơƨƃǇƜƌƘƮơǒǉǊƪƱǊƧƲǆƺƗƬǝƻƩǋƹƚǗǜơƠǟƶǓǛǈƱ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[10] = NLoginCore_138.E("ֆզ՘֝նէջ՝֓փհվ֛ս֢սց֨գւռ֥վլֆִ֪֮֌ֱֲշ", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[11] = NLoginCore_110.E("՘զֆ֖մ֖՗նՙ֑դն֣֚օ֚բւ֊֠շ֧֊֏փ֐ցֆ֋֦ճկ", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[12] = NLoginCore_201.F("֌֏Քպ՜֑֚վժ՟֕՝գ֢ց֊֥֙և֣դ֜։֥֩֊֦֮֗֯֡֌", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[13] = NLoginCore_027.F("ո֚֘ՙ։֏ձկլՠ֐տ֎րրֈ֟ե֚ե֘֗էվօ֜֎մֶ֢֍֤֧֧ֆַּ֛պׂ֯յ֤։", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[14] = NLoginCore_173.E("ո֚֘ՙ։֏ձկլՠ֎֥֗֏֟ճփ֊իջպ֥զֱ֣֧֧֭ֈ֋֣֖֑ն֦֖յׁ֭֠֫֔֕վ־ְֻׂ֧֥֚֠֋ֽ֔֕", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[15] = NLoginCore_027.D("Ի՝՛ԜՌՒԴԲԯԣՔԴՔՔԪ՟Իՠՠթզ՝԰ժՆՊԴգծԷձէխտՔց՗շ՟ՀՁևՏՌ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[16] = NLoginCore_027.F("֌֘հռ֙լ՟յՙ՞ղ֝֏յ֒եֆըգյւ֏լ֢։ձְַ֦ղ֙֊", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[17] = NLoginCore_446.D("Ի՝՛ԜՌՒԴԲԯԣՒաԣՠԨՁՃ՘ՄԸձիելՔՇԳըգչհղ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ƠǂǀƁƱƷƙƗƔƈƸǈƭƻǃƼƎƭƳǈƏǉƭƺƪƴƧƖǒƝǀƵƽƛƸƛǗǃƵƠǊǢǄƱ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[19] = NLoginCore_559.F("Ռք՘Ք֘մ՜ղծ֠լ֢զնմ֕֨ֈը֩֎ֆվ֍ս։֢֩փճ֠ձ֊֣ֈ֒֞յֲ֋׃֑֘։", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[20] = NLoginCore_092.D("Ի՝՛ԜՌՒԴԲԯԣՒԾ՞Հ՝ԩ՟ԽՎեՄ՟ՀԭԧՌՋՀ՚ԶյՒ՛ձիսՠտ՞՝՗դչՌ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[21] = NLoginCore_223.B("ƠǂǀƁƱƷƙƗƔƈƷƣǃƥǂƎǄƢƳǊƩǄƥƒƌƱưƥƿƛǚƷǞƬƛƱƵƷǣǪơǃǫǎǧǰǁǛƿǛǢǰǟǫǋƸǖǇǭǱǏƱǊǊ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[22] = NLoginCore_559.F("֖ժժժ֋՝֑֍՝ղ֣֛֞֞֜և֔չ֪֎իւ֐ֳ֢֦֮֟վ֣֐ձ֊ֹ֮֋ֈվֿ֩պְׂ֘սֵֽ֤֟־֊׍׀ֽ֔֕", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[23] = NLoginCore_223.F("֓պ֒֔Ֆֈ֒ւռւ֐օդ֒ֆփ֋ենտխ֑֮֝֊հժ֋֖֨֯հյևֆְ֐֌ֽ֖֮֨֕֒֟ք׈֖֔ս֝և֚֗֔֕", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[24] = NLoginCore_201.A("ƮǃƹǀſƚǅƃƆƥƽƇǉǋƺƎƒƭƓƠƫǄƶǒǄƪǈǝƕƲǟƝǚǍƽƸƴƳǃƣƠǛǞƱ", (byte)101, 65);
                    NLoginCore_211.var_java_lang_String_arr_b[25] = NLoginCore_091.E("ջֈ։լ֚յ֊֌֚֒շհֆ֓փ֡֊չլթ֯֞իև֍֦֭֕֏ֶ֥ղ", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[26] = NLoginCore_201.B("ƳƳƒƮƲƺƕƇżǄƺƪƢǃưƯƐƭǋƍǗǆƎƪƒǑƤǚƐƖǒǔ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[27] = NLoginCore_559.B("ƳƏưƿſǃƣǅǇƥƞƸƠƟƸƏƉƾƤƪƐƓƦƮƥƦƗǋƖƧǀǖǃƷǒƠưƺƺǅǁƺƫƱ", (byte)101, 66);
                    NLoginCore_211.var_java_lang_String_arr_b[28] = NLoginCore_091.F("֛Սն֎տ֖֘ւ֙ի֑֜֝բւմ֣֜֘֠շջ֏֤֭֡֝փխֵևւ", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[29] = NLoginCore_384.F("նո՚Ք՝՝֞֌֙ս՟ա֕ք֛֥զւ֞փցփ֧֭ջְ֛յ֊ָֹ֯", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[30] = NLoginCore_451.F("հզ֙֜ռ֒վն֔֋բւ֣֔֓֩ժ֤֩֊ֈ։ջ։ֳ֣օէղ֪֒ց", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[31] = NLoginCore_027.C("ԛ՟Ւ՝ԵՙԷԼՃԞաԧՖՙԥխՀՀ՞ՠԯ՝ՌՎԵ՗ՑԮՐԸճԹ", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[32] = NLoginCore_091.D("ԻՍՐԯԝ՗ՙԴ՗ԣ՛ԣԵՊԷԫէ՚ԷԦեՌԿՠթՇխԳ՚ջՈ՝", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[33] = NLoginCore_027.F("ջ֛կ֊֓՗ր֐֛ր֑֢֕շ֢֧գ֡֍օջ֭մյ", (byte)101, 70);
                    NLoginCore_211.var_java_lang_String_arr_b[34] = NLoginCore_223.E("ջ֊դէէՖ՚՗կլհ֑֘֝ւզջ֢֚֞ն։֍֑֒ժվ֢֞֎֒֏", (byte)101, 69);
                    NLoginCore_211.var_java_lang_String_arr_b[35] = NLoginCore_324.C("ԩԐԻ՜ՍՔԻԝԿզԥԶԦԧԻգՀՂՠՆ՚ԤՀՉՑՄճըՈ԰մս", (byte)101, 67);
                    NLoginCore_211.var_java_lang_String_arr_b[36] = NLoginCore_223.D("Ծ՞ԲՍՖԚՃՓ՞ՃՒՑՇԶԥՙ՗ՎԺկՌԪիԦԵժՠՍ՗ՔծՄ", (byte)101, 68);
                    NLoginCore_211.var_java_lang_String_arr_b[37] = NLoginCore_223.E("ն֋֖ՙ֑Ֆ֠֘֍ՠփմդ֔֓֓֨բվֈլռ֣հ֜֊֮֞ք֪֙֒", (byte)101, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_211.var_java_lang_String_arr_b[0] = NLoginCore_384.C("՘ԙՍԜ՝՘ԹԯԟԻԢԬ", (byte)101, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_211.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ƸǁŶƎǄǀƥƵơƃƺƑ", (byte)101, 66);
                }
            }
        }
    }

    public static NLoginCore_211 valueOf(String string) {
        return Enum.valueOf(NLoginCore_211.class, string);
    }

    public static int size() {
        return NLoginCore_211.values().length;
    }

    public static NLoginCore_211 a(int n, boolean bl) {
        NLoginCore_211[] NLoginCore_211Array = NLoginCore_211.a(bl);
        if (n >= 0 && n < NLoginCore_211Array.length) {
            return NLoginCore_211Array[n];
        }
        throw new IllegalArgumentException((String)NLoginCore_211.c("㺀", (int)var_int_h, (long)var_long_i) + n);
    }

    private static /* synthetic */ NLoginCore_211[] com_nickuc_login_NLoginCore_211_arr_a() {
        NLoginCore_211[] NLoginCore_211Array = new NLoginCore_211[var_int_j];
        NLoginCore_211Array[NLoginCore_211.var_int_k] = var_com_nickuc_login_NLoginCore_211_a;
        NLoginCore_211Array[NLoginCore_211.var_int_l] = var_com_nickuc_login_NLoginCore_211_b;
        NLoginCore_211Array[NLoginCore_211.var_int_m] = var_com_nickuc_login_NLoginCore_211_c;
        NLoginCore_211Array[NLoginCore_211.var_int_n] = var_com_nickuc_login_NLoginCore_211_d;
        NLoginCore_211Array[NLoginCore_211.var_int_o] = var_com_nickuc_login_NLoginCore_211_e;
        NLoginCore_211Array[NLoginCore_211.var_int_p] = var_com_nickuc_login_NLoginCore_211_f;
        NLoginCore_211Array[NLoginCore_211.var_int_q] = var_com_nickuc_login_NLoginCore_211_g;
        NLoginCore_211Array[NLoginCore_211.var_int_r] = var_com_nickuc_login_NLoginCore_211_h;
        NLoginCore_211Array[NLoginCore_211.var_int_s] = var_com_nickuc_login_NLoginCore_211_i;
        NLoginCore_211Array[NLoginCore_211.var_int_t] = var_com_nickuc_login_NLoginCore_211_j;
        NLoginCore_211Array[NLoginCore_211.var_int_u] = var_com_nickuc_login_NLoginCore_211_k;
        NLoginCore_211Array[NLoginCore_211.var_int_v] = var_com_nickuc_login_NLoginCore_211_l;
        NLoginCore_211Array[NLoginCore_211.var_int_w] = var_com_nickuc_login_NLoginCore_211_m;
        NLoginCore_211Array[NLoginCore_211.var_int_x] = var_com_nickuc_login_NLoginCore_211_n;
        NLoginCore_211Array[NLoginCore_211.var_int_y] = var_com_nickuc_login_NLoginCore_211_o;
        NLoginCore_211Array[NLoginCore_211.var_int_z] = var_com_nickuc_login_NLoginCore_211_p;
        NLoginCore_211Array[NLoginCore_211.aa] = var_com_nickuc_login_NLoginCore_211_q;
        NLoginCore_211Array[NLoginCore_211.ab] = var_com_nickuc_login_NLoginCore_211_r;
        NLoginCore_211Array[NLoginCore_211.ac] = var_com_nickuc_login_NLoginCore_211_s;
        NLoginCore_211Array[NLoginCore_211.ad] = var_com_nickuc_login_NLoginCore_211_t;
        NLoginCore_211Array[NLoginCore_211.ae] = var_com_nickuc_login_NLoginCore_211_u;
        NLoginCore_211Array[NLoginCore_211.af] = var_com_nickuc_login_NLoginCore_211_v;
        NLoginCore_211Array[NLoginCore_211.ag] = var_com_nickuc_login_NLoginCore_211_w;
        NLoginCore_211Array[NLoginCore_211.ah] = var_com_nickuc_login_NLoginCore_211_x;
        NLoginCore_211Array[NLoginCore_211.ai] = var_com_nickuc_login_NLoginCore_211_y;
        NLoginCore_211Array[NLoginCore_211.aj] = var_com_nickuc_login_NLoginCore_211_z;
        NLoginCore_211Array[NLoginCore_211.ak] = A;
        NLoginCore_211Array[NLoginCore_211.al] = B;
        NLoginCore_211Array[NLoginCore_211.am] = C;
        NLoginCore_211Array[NLoginCore_211.an] = D;
        NLoginCore_211Array[NLoginCore_211.ao] = E;
        NLoginCore_211Array[NLoginCore_211.ap] = F;
        NLoginCore_211Array[NLoginCore_211.aq] = G;
        NLoginCore_211Array[NLoginCore_211.ar] = H;
        NLoginCore_211Array[NLoginCore_211.as] = I;
        NLoginCore_211Array[NLoginCore_211.at] = J;
        NLoginCore_211Array[NLoginCore_211.au] = K;
        return NLoginCore_211Array;
    }
}

