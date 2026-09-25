/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_102;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_272;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginInterface_005;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_202;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_075;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_316 {
    private static int m;
    private static int ek;
    private static long gt;
    private static int br;
    private static int af;
    private static int t;
    private static int as;
    private static long cf;
    private static int gf;
    private static long gy;
    private static long ab;
    private static long ge;
    private final NLoginCore_208 var_com_nickuc_login_NLoginCore_208_f;
    private static int de;
    private static long ca;
    private static long gx;
    private static int dg;
    private static long ai;
    private static int eu;
    private static int gg;
    private static long ft;
    private static int fj;
    private static int eg;
    private static int ep;
    private static int es;
    private static int fu;
    private static long bz;
    private static long v;
    private static int dz;
    private static long dc;
    private static int be;
    private static int da;
    private static long l;
    private static long dm;
    private static int db;
    private static int bv;
    private static long fp;
    private static int ej;
    private static int ex;
    private static int eb;
    private static int by;
    private static int var_int_e;
    private static int gp;
    private static long bd;
    private static int dx;
    private static int hb;
    private static long dn;
    private static int et;
    private static long ao;
    private static int fs;
    private static long dr;
    private static int bl;
    private static int ec;
    private static long ba;
    private static int fv;
    private static int ee;
    private static int s;
    private static int y;
    private static int eh;
    private static int dj;
    private static int var_int_b;
    private static int cj;
    private static int h;
    private static int gn;
    private static long var_long_g;
    private static long q;
    private static long cw;
    private static int gl;
    private static int el;
    private static long em;
    private static int aw;
    private static int dl;
    private static int fr;
    private static int ds;
    private static long cq;
    private static long cd;
    private static int w;
    private static long go;
    private static int gv;
    private static long bq;
    private static int x;
    private static int dd;
    private static long cc;
    private final NLoginCore_208 var_com_nickuc_login_NLoginCore_208_d;
    private static int var_int_a;
    private static int ar;
    private static long ac;
    private static long au;
    private static int dt;
    private static long ct;
    private static int cy;
    private final NLoginCore_219 var_com_nickuc_login_NLoginCore_219_e;
    private final NLoginCore_208 var_com_nickuc_login_NLoginCore_208_g;
    private static int bt;
    private static int en;
    private static long fc;
    private static int fw;
    private static int gm;
    private static int dh;
    private static long dv;
    private static long p;
    private static int bm;
    private static long u;
    private static int aq;
    private static int cn;
    private static long an;
    private static int gi;
    private static int ez;
    private static int ey;
    private static long bg;
    private static int r;
    private static long cm;
    private static int ae;
    private static long al;
    private static int fk;
    private static long dk;
    private static int ak;
    private static int aj;
    private static int fm;
    private static long gu;
    private static long at;
    private static String[] var_java_lang_String_arr_b;
    private static long fd;
    private static int gq;
    private static long cp;
    private static long ci;
    private static long ew;
    private static long ev;
    private static int fa;
    private static long var_long_d;
    private static long ga;
    private static long gd;
    private static int av;
    private static int fg;
    private static int bh;
    private static long ah;
    private static long bj;
    private static long cv;
    private static int cr;
    private static int j;
    private static int ef;
    private static int gc;
    private static int n;
    private static int eo;
    private static int bu;
    private static long ch;
    private static int fl;
    private static long eq;
    private static int fe;
    private static long dw;
    private static long dy;
    private static int gz;
    private static int cg;
    private static int du;
    private static int dp;
    private static int ck;
    private static int gh;
    private static int bo;
    private static long ei;
    private static long ax;
    private static long c;
    private static long az;
    private static int fq;
    private static int cfr_renamed_1;
    private static int gw;
    private static int fb;
    private static int bs;
    private static int o;
    private static long df;
    private static int ea;
    private static long cs;
    private static int ad;
    private static int fy;
    private static long fo;
    private static int bx;
    private static long gk;
    private static int ed;
    private static int cb;
    private static int ag;
    private static long cz;
    private final NLoginCore_208 var_com_nickuc_login_NLoginCore_208_e;
    private final NLoginCore_055 var_com_nickuc_login_NLoginCore_055_b;
    private static long fz;
    private static int ha;
    private static int co;
    private static long ff;
    private static int cx;
    private static int ap;
    private static int bk;
    private static int z;
    private static int bc;
    private static int bb;
    private static int fx;
    private static long var_long_f;
    private static long fh;
    private static long dq;
    private static int am;
    private static int cu;
    private static int ce;
    private static int ay;
    private static String[] var_java_lang_String_arr_a;
    private static int fn;
    private static int fi;
    private static int i;
    private static int bw;
    private static long bi;
    private static int bn;
    private static int di;
    private static long k;
    private static long gj;
    private static long cl;
    private static int gr;
    private static long bp;
    private static long er;
    private static int aa;
    private static long bf;
    private static int gs;
    private static int gb;

    public List<String> a(NLoginCore_397 NLoginCore_2372, Object ... objectArray) {
        if (!NLoginCore_2372.aI) {
            throw new IllegalStateException(NLoginCore_2372 + (String)NLoginCore_316.c("㺀", (int)be, (long)(bf ^ bg)));
        }
        return NLoginCore_2372.a(this.var_com_nickuc_login_NLoginCore_208_e, objectArray);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        var_long_d = Long.reverse(6981124531794815904L);
        var_int_e = 512 >>> 41 | 512 << -41;
        var_long_f = Long.reverse(1504747384912292768L);
        var_long_g = Long.reverse(0x7400000000000000L);
        h = (0x400000 >>> 150 | 0x400000 << -150) & 0xFFFFFFFF;
        i = 0 >>> 209 | 0 << -209;
        j = 256 >>> 167 | 256 << -167;
        k = Long.reverse(1504747384912292768L);
        l = Long.reverse(0x7400000000000000L);
        m = 0x10000000 >>> 252 | 0x10000000 << -252;
        n = Integer.reverse(0);
        o = 3 >>> 128 | 3 << ~128 + 1;
        p = Long.reverse(1504747384912292768L);
        q = Long.reverse(0x7400000000000000L);
        r = 0x400000 >>> 86 | 0x400000 << -86;
        s = 0 >>> 148 | 0 << ~148 + 1;
        t = (256 >>> 166 | 256 << -166) & 0xFFFFFFFF;
        u = Long.reverse(1504747384912292768L);
        v = Long.reverse(0x7400000000000000L);
        w = 2048 >>> 75 | 2048 << -75;
        x = Integer.reverse(0);
        y = Integer.reverse(0);
        z = (32768 >>> 111 | 32768 << ~111 + 1) & 0xFFFFFFFF;
        aa = 640 >>> 231 | 640 << ~231 + 1;
        ab = Long.reverse(1504747384912292768L);
        ac = Long.reverse(0x7400000000000000L);
        ad = 131072 >>> 208 | 131072 << -208;
        ae = Integer.reverse(0);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = Integer.reverse(0x60000000);
        ah = Long.reverse(1504747384912292768L);
        ai = Long.reverse(0x7400000000000000L);
        aj = (114688 >>> 206 | 114688 << ~206 + 1) & 0xFFFFFFFF;
        ak = -1 >>> 252 | -1 << ~252 + 1;
        al = Long.reverse(6981124531794815904L);
        am = (256 >>> 229 | 256 << ~229 + 1) & 0xFFFFFFFF;
        an = Long.reverse(1504747384912292768L);
        ao = Long.reverse(0x7400000000000000L);
        ap = (65536 >>> 15 | 65536 << -15) & 0xFFFFFFFF;
        aq = Integer.reverse(0);
        ar = (524288 >>> 179 | 524288 << ~179 + 1) & 0xFFFFFFFF;
        as = (294912 >>> 111 | 294912 << ~111 + 1) & 0xFFFFFFFF;
        at = Long.reverse(1504747384912292768L);
        au = Long.reverse(0x7400000000000000L);
        av = (81920 >>> 173 | 81920 << ~173 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(-1);
        ax = Long.reverse(6981124531794815904L);
        ay = Integer.reverse(-805306368);
        az = Long.reverse(1504747384912292768L);
        ba = Long.reverse(0x7400000000000000L);
        bb = -1073741824 >>> 188 | -1073741824 << -188;
        bc = Integer.reverse(-1);
        bd = Long.reverse(6981124531794815904L);
        be = -2147483642 >>> 127 | -2147483642 << -127;
        bf = Long.reverse(1504747384912292768L);
        bg = Long.reverse(0x7400000000000000L);
        bh = 0x700000 >>> 179 | 0x700000 << -179;
        bi = Long.reverse(1504747384912292768L);
        bj = Long.reverse(0x7400000000000000L);
        bk = (0 >>> 7 | 0 << ~7 + 1) & 0xFFFFFFFF;
        bl = (0 >>> 107 | 0 << ~107 + 1) & 0xFFFFFFFF;
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = Integer.reverse(0);
        bo = Integer.reverse(-268435456);
        bp = Long.reverse(1504747384912292768L);
        bq = Long.reverse(0x7400000000000000L);
        br = 0 >>> 182 | 0 << ~182 + 1;
        bs = 32 >>> 197 | 32 << ~197 + 1;
        bt = Integer.reverse(0);
        bu = (8 >>> 195 | 8 << -195) & 0xFFFFFFFF;
        bv = Integer.reverse(0);
        bw = (0x40000000 >>> 30 | 0x40000000 << ~30 + 1) & 0xFFFFFFFF;
        bx = 0 >>> 107 | 0 << -107;
        by = (8 >>> 223 | 8 << ~223 + 1) & 0xFFFFFFFF;
        bz = Long.reverse(1504747384912292768L);
        ca = Long.reverse(0x7400000000000000L);
        cb = Integer.reverse(-2013265920);
        cc = Long.reverse(1504747384912292768L);
        cd = Long.reverse(0x7400000000000000L);
        ce = (147456 >>> 77 | 147456 << ~77 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(6981124531794815904L);
        cg = 4864 >>> 232 | 4864 << -232;
        ch = Long.reverse(1504747384912292768L);
        ci = Long.reverse(0x7400000000000000L);
        cj = Integer.reverse(0);
        ck = 640 >>> 5 | 640 << -5;
        cl = Long.reverse(1504747384912292768L);
        cm = Long.reverse(0x7400000000000000L);
        cn = Integer.reverse(0);
        co = (172032 >>> 173 | 172032 << ~173 + 1) & 0xFFFFFFFF;
        cp = Long.reverse(1504747384912292768L);
        cq = Long.reverse(0x7400000000000000L);
        cr = 2816 >>> 199 | 2816 << ~199 + 1;
        cs = Long.reverse(1504747384912292768L);
        ct = Long.reverse(0x7400000000000000L);
        cu = Integer.reverse(-402653184);
        cv = Long.reverse(1504747384912292768L);
        cw = Long.reverse(0x7400000000000000L);
        cx = Integer.reverse(0x18000000);
        cy = Integer.reverse(-1);
        cz = Long.reverse(6981124531794815904L);
        da = 0 >>> 158 | 0 << ~158 + 1;
        db = Integer.reverse(-1744830464);
        dc = Long.reverse(6981124531794815904L);
        dd = Integer.reverse(0);
        de = Integer.reverse(0x58000000);
        df = Long.reverse(6981124531794815904L);
        dg = 64 >>> 38 | 64 << -38;
        dh = (0 >>> 242 | 0 << ~242 + 1) & 0xFFFFFFFF;
        di = (-1342177279 >>> 124 | -1342177279 << ~124 + 1) & 0xFFFFFFFF;
        dj = Integer.reverse(-1);
        dk = Long.reverse(6981124531794815904L);
        dl = (0x1C00000 >>> 212 | 0x1C00000 << ~212 + 1) & 0xFFFFFFFF;
        dm = Long.reverse(1504747384912292768L);
        dn = Long.reverse(0x7400000000000000L);
        cfr_renamed_1 = Integer.reverse(Integer.MIN_VALUE);
        dp = Integer.reverse(-1207959552);
        dq = Long.reverse(1504747384912292768L);
        dr = Long.reverse(0x7400000000000000L);
        ds = (512 >>> 136 | 512 << ~136 + 1) & 0xFFFFFFFF;
        dt = Integer.reverse(0);
        du = (0xF00000 >>> 19 | 0xF00000 << ~19 + 1) & 0xFFFFFFFF;
        dv = Long.reverse(1504747384912292768L);
        dw = Long.reverse(0x7400000000000000L);
        dx = (31 >>> 224 | 31 << -224) & 0xFFFFFFFF;
        dy = Long.reverse(6981124531794815904L);
        dz = Integer.reverse(0);
        ea = Integer.reverse(0x40000000);
        eb = Integer.reverse(0);
        ec = Integer.reverse(Integer.MIN_VALUE);
        ed = (0x40000000 >>> 94 | 0x40000000 << ~94 + 1) & 0xFFFFFFFF;
        ee = Integer.reverse(Integer.MIN_VALUE);
        ef = (0 >>> 144 | 0 << -144) & 0xFFFFFFFF;
        eg = 0x40000000 >>> 25 | 0x40000000 << -25;
        eh = -1 >>> 195 | -1 << ~195 + 1;
        ei = Long.reverse(6981124531794815904L);
        ej = 0x1000000 >>> 120 | 0x1000000 << ~120 + 1;
        ek = Integer.reverse(-2080374784);
        el = (-1 >>> 59 | -1 << -59) & 0xFFFFFFFF;
        em = Long.reverse(6981124531794815904L);
        en = (0 >>> 145 | 0 << -145) & 0xFFFFFFFF;
        eo = 0x100000 >>> 84 | 0x100000 << -84;
        ep = Integer.reverse(0x44000000);
        eq = Long.reverse(1504747384912292768L);
        er = Long.reverse(0x7400000000000000L);
        es = Integer.reverse(Integer.MIN_VALUE);
        et = Integer.reverse(0);
        eu = (0x60000004 >>> 29 | 0x60000004 << -29) & 0xFFFFFFFF;
        ev = Long.reverse(1504747384912292768L);
        ew = Long.reverse(0x7400000000000000L);
        ex = Integer.reverse(0);
        ey = (0 >>> 69 | 0 << ~69 + 1) & 0xFFFFFFFF;
        ez = 0 >>> 13 | 0 << ~13 + 1;
        fa = Integer.reverse(0);
        fb = Integer.reverse(0x24000000);
        fc = Long.reverse(1504747384912292768L);
        fd = Long.reverse(0x7400000000000000L);
        fe = 4736 >>> 7 | 4736 << ~7 + 1;
        ff = Long.reverse(6981124531794815904L);
        fg = 304 >>> 131 | 304 << -131;
        fh = Long.reverse(6981124531794815904L);
        fi = (0 >>> 232 | 0 << -232) & 0xFFFFFFFF;
        fj = Integer.reverse(Integer.MIN_VALUE);
        fk = Integer.reverse(0);
        fl = 0 >>> 25 | 0 << -25;
        fm = (8 >>> 67 | 8 << -67) & 0xFFFFFFFF;
        fn = Integer.reverse(-469762048);
        fo = Long.reverse(1504747384912292768L);
        fp = Long.reverse(0x7400000000000000L);
        fq = (0 >>> 198 | 0 << -198) & 0xFFFFFFFF;
        fr = Integer.reverse(0x14000000);
        fs = Integer.reverse(-1);
        ft = Long.reverse(6981124531794815904L);
        fu = 0 >>> 152 | 0 << -152;
        fv = Integer.reverse(0);
        fw = Integer.reverse(0);
        fx = (16 >>> 68 | 16 << -68) & 0xFFFFFFFF;
        fy = 2624 >>> 198 | 2624 << ~198 + 1;
        fz = Long.reverse(1504747384912292768L);
        ga = Long.reverse(0x7400000000000000L);
        gb = (0 >>> 78 | 0 << ~78 + 1) & 0xFFFFFFFF;
        gc = Integer.reverse(0x54000000);
        gd = Long.reverse(1504747384912292768L);
        ge = Long.reverse(0x7400000000000000L);
        gf = (0 >>> 62 | 0 << -62) & 0xFFFFFFFF;
        gg = (0 >>> 90 | 0 << -90) & 0xFFFFFFFF;
        gh = (0 >>> 71 | 0 << ~71 + 1) & 0xFFFFFFFF;
        gi = -1409286144 >>> 26 | -1409286144 << ~26 + 1;
        gj = Long.reverse(1504747384912292768L);
        gk = Long.reverse(0x7400000000000000L);
        gl = Integer.reverse(0);
        gm = 352 >>> 131 | 352 << ~131 + 1;
        gn = Integer.reverse(-1);
        go = Long.reverse(6981124531794815904L);
        gp = (0 >>> 191 | 0 << ~191 + 1) & 0xFFFFFFFF;
        gq = 0 >>> 127 | 0 << -127;
        gr = Integer.reverse(0);
        gs = (368640 >>> 109 | 368640 << -109) & 0xFFFFFFFF;
        gt = Long.reverse(1504747384912292768L);
        gu = Long.reverse(0x7400000000000000L);
        gv = (0 >>> 104 | 0 << -104) & 0xFFFFFFFF;
        gw = (23552 >>> 169 | 23552 << ~169 + 1) & 0xFFFFFFFF;
        gx = Long.reverse(1504747384912292768L);
        gy = Long.reverse(0x7400000000000000L);
        gz = Integer.reverse(0);
        ha = (0x2F0000 >>> 144 | 0x2F0000 << ~144 + 1) & 0xFFFFFFFF;
        hb = -1140850688 >>> 218 | -1140850688 << ~218 + 1;
        var_java_lang_String_arr_a = new String[ha];
        var_java_lang_String_arr_b = new String[hb];
        NLoginCore_316.b();
    }

    public String a(NLoginCore_397 NLoginCore_2372, Object ... objectArray) {
        if (NLoginCore_2372.aI) {
            throw new IllegalStateException(NLoginCore_2372 + (String)NLoginCore_316.c("㺀", (int)(bb & bc), (long)bd));
        }
        return NLoginCore_2372.a(this.var_com_nickuc_login_NLoginCore_208_e, objectArray);
    }

    NLoginCore_316(NLoginType_008 NLoginType_008, NLoginCore_055 NLoginCore_0552, String string) {
        this.var_com_nickuc_login_NLoginCore_055_b = NLoginCore_0552;
        this.var_com_nickuc_login_NLoginCore_219_e = new NLoginCore_219(new File(NLoginType_008.java_io_File_c() + File.separator + (String)NLoginCore_316.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d), string));
        Object[] objectArray = new Object[h];
        objectArray[NLoginCore_316.i] = NLoginCore_0552.cN;
        this.var_com_nickuc_login_NLoginCore_208_d = new NLoginCore_208(String.format((String)NLoginCore_316.c("㺃", (int)var_int_e, (long)(var_long_f ^ var_long_g)), objectArray), NLoginCore_374.values().length);
        Object[] objectArray2 = new Object[m];
        objectArray2[NLoginCore_316.n] = NLoginCore_0552.cN;
        this.var_com_nickuc_login_NLoginCore_208_e = new NLoginCore_208(String.format((String)NLoginCore_316.c("㺆", (int)j, (long)(k ^ l)), objectArray2), NLoginCore_397.values().length);
        Object[] objectArray3 = new Object[r];
        objectArray3[NLoginCore_316.s] = NLoginCore_0552.cN;
        this.var_com_nickuc_login_NLoginCore_208_f = new NLoginCore_208(String.format((String)NLoginCore_316.c("㺉", (int)o, (long)(p ^ q)), objectArray3), NLoginCore_508.values().length);
        Object[] objectArray4 = new Object[w];
        objectArray4[NLoginCore_316.x] = NLoginCore_0552.cN;
        this.var_com_nickuc_login_NLoginCore_208_g = new NLoginCore_208(String.format((String)NLoginCore_316.c("㺌", (int)t, (long)(u ^ v)), objectArray4), NLoginCore_102.values().length);
        NLoginCore_219 NLoginCore_2192 = NLoginCore_272.a(NLoginCore_0552.cO, y != 0);
        NLoginCore_219 NLoginCore_2193 = NLoginCore_272.a(NLoginCore_0552.cO, z != 0);
        if (!this.var_com_nickuc_login_NLoginCore_219_e.r()) {
            if (!this.a(NLoginCore_2192, NLoginCore_2193)) {
                Object[] objectArray5 = new Object[ad];
                objectArray5[NLoginCore_316.ae] = NLoginCore_0552.cO;
                objectArray5[NLoginCore_316.af] = NLoginCore_0552;
                NLoginCore_370.d((String)NLoginCore_316.c("㺏", (int)aa, (long)(ab ^ ac)), objectArray5);
            }
        } else if (!this.b(NLoginCore_2192, NLoginCore_2193)) {
            File file = NLoginCore_366.a(new File(this.var_com_nickuc_login_NLoginCore_219_e.d().getParentFile(), string + (String)NLoginCore_316.c("㺒", (int)ag, (long)(ah ^ ai))), NLoginCore_366.c(this.var_com_nickuc_login_NLoginCore_219_e.d()) + (String)NLoginCore_316.c("㺕", (int)(aj & ak), (long)al));
            if (!this.var_com_nickuc_login_NLoginCore_219_e.d().renameTo(file)) {
                return;
            }
            if (!this.a(NLoginCore_2192, NLoginCore_2193)) {
                Object[] objectArray6 = new Object[ap];
                objectArray6[NLoginCore_316.aq] = NLoginCore_0552.cO;
                objectArray6[NLoginCore_316.ar] = NLoginCore_0552;
                NLoginCore_370.d((String)NLoginCore_316.c("㺘", (int)am, (long)(an ^ ao)), objectArray6);
            }
        }
        NLoginCore_2192.Y();
        NLoginCore_2193.Y();
    }

    public String a(NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        if (NLoginCore_4872.var_boolean_aJ) {
            throw new IllegalStateException(NLoginCore_4872 + (String)NLoginCore_316.c("㺀", (int)as, (long)(at ^ au)));
        }
        return NLoginCore_4872.a(this.var_com_nickuc_login_NLoginCore_208_d, objectArray);
    }

    private boolean b(NLoginCore_219 NLoginCore_2192, NLoginCore_219 NLoginCore_2193) {
        Enum enum_;
        int n;
        File file = this.var_com_nickuc_login_NLoginCore_219_e.d();
        NLoginCore_370.b((String)NLoginCore_316.c("㺀", (int)fe, (long)ff) + file.getName() + (String)NLoginCore_316.c("㺃", (int)fg, (long)fh), new Object[fi]);
        int n2 = fj;
        Enum[] enumArray = NLoginCore_374.values();
        int n3 = enumArray.length;
        for (n = fk; n < n3; ++n) {
            enum_ = enumArray[n];
            try {
                this.a(NLoginCore_2192, (NLoginCore_374)enum_);
                continue;
            }
            catch (Exception exception) {
                n2 = fl;
                NLoginCore_525.a((NLoginInterface_005)((Object)enum_), this.var_com_nickuc_login_NLoginCore_208_d, ((NLoginCore_374)enum_).var_java_lang_Object_o, fm != 0);
                NLoginCore_370.c((String)NLoginCore_316.c("㺆", (int)fn, (long)(fo ^ fp)) + ((NLoginCore_374)enum_).var_com_nickuc_login_NLoginCore_474_f.a()[fq] + (String)NLoginCore_316.c("㺉", (int)(fr & fs), (long)ft) + file.getName(), exception, new Object[fu]);
            }
        }
        enumArray = NLoginCore_397.values();
        n3 = enumArray.length;
        for (n = fv; n < n3; ++n) {
            enum_ = enumArray[n];
            try {
                this.a(NLoginCore_2193, (NLoginCore_397)enum_);
                continue;
            }
            catch (Exception exception) {
                n2 = fw;
                NLoginCore_525.a((NLoginInterface_005)((Object)enum_), this.var_com_nickuc_login_NLoginCore_208_e, ((NLoginCore_397)enum_).java_lang_Object_a(), fx != 0);
                NLoginCore_370.c((String)NLoginCore_316.c("㺌", (int)fy, (long)(fz ^ ga)) + ((NLoginCore_397)enum_).var_com_nickuc_login_NLoginCore_474_e.a()[gb] + (String)NLoginCore_316.c("㺏", (int)gc, (long)(gd ^ ge)) + file.getName(), exception, new Object[gf]);
            }
        }
        enumArray = NLoginCore_508.values();
        n3 = enumArray.length;
        for (n = gg; n < n3; ++n) {
            enum_ = enumArray[n];
            try {
                this.a(NLoginCore_2192, NLoginCore_2193, (NLoginCore_508)enum_);
                continue;
            }
            catch (Exception exception) {
                n2 = gh;
                NLoginCore_370.c((String)NLoginCore_316.c("㺒", (int)gi, (long)(gj ^ gk)) + ((NLoginCore_508)enum_).var_com_nickuc_login_NLoginCore_474_g.a()[gl] + (String)NLoginCore_316.c("㺕", (int)(gm & gn), (long)go) + file.getName(), exception, new Object[gp]);
            }
        }
        enumArray = NLoginCore_102.values();
        n3 = enumArray.length;
        for (n = gq; n < n3; ++n) {
            enum_ = enumArray[n];
            try {
                this.a(NLoginCore_2192, NLoginCore_2193, (NLoginCore_102)enum_);
                continue;
            }
            catch (Exception exception) {
                n2 = gr;
                NLoginCore_370.c((String)NLoginCore_316.c("㺘", (int)gs, (long)(gt ^ gu)) + ((NLoginCore_102)enum_).var_com_nickuc_login_NLoginCore_474_d.a()[gv] + (String)NLoginCore_316.c("㺛", (int)gw, (long)(gx ^ gy)) + file.getName(), exception, new Object[gz]);
            }
        }
        return n2 != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0xFE28C1B8E86E51BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(39 + 30), (byte)(78 + 5), (byte)(27 + 20), 67, (byte)(48 + 18), 67, (byte)(8 + 39), (byte)(11 + 69), (byte)(32 + 43), (byte)(15 + 52), (byte)(27 + 56), (byte)(29 + 24), (byte)(10 + 70), (byte)(12 + 85), (byte)(25 + 75), (byte)(92 + 8), (byte)(43 + 62), (byte)(12 + 98), (byte)(21 + 82)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԜԗԕԪԠԭԆԬԃ", (byte)104, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_316.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void a(NLoginCore_219 NLoginCore_2192, NLoginCore_397 NLoginCore_2372) {
        if (NLoginCore_2372.aI) {
            String string;
            List<String> list = null;
            String[] stringArray = NLoginCore_2372.var_com_nickuc_login_NLoginCore_474_e.a();
            int n = stringArray.length;
            for (int i = bt; i < n && (list = NLoginCore_2192.b(string = stringArray[i], (List<String>)null)) == null; ++i) {
            }
            if (list == null || list.isEmpty()) {
                list = (List)NLoginCore_2372.java_lang_Object_a();
            }
            NLoginCore_525.a((NLoginInterface_005)NLoginCore_2372, this.var_com_nickuc_login_NLoginCore_208_e, list, bu != 0);
        } else {
            String string;
            String string2 = null;
            String[] stringArray = NLoginCore_2372.var_com_nickuc_login_NLoginCore_474_e.a();
            int n = stringArray.length;
            for (int i = bv; i < n && (string2 = NLoginCore_2192.java_lang_String_b(string = stringArray[i])) == null; ++i) {
            }
            if (string2 == null) {
                string2 = (String)NLoginCore_2372.java_lang_Object_a();
            }
            NLoginCore_525.a((NLoginInterface_005)NLoginCore_2372, this.var_com_nickuc_login_NLoginCore_208_e, string2, bw != 0);
        }
    }

    public NLoginCore_190 a(NLoginCore_102 NLoginCore_102) {
        return (NLoginCore_190)NLoginCore_102.b(this.var_com_nickuc_login_NLoginCore_208_g);
    }

    private static void b() {
        int n;
        c = 420143546636928808L;
        long l = c ^ 0xFE28C1B8E86E51BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(25 + 44), 83, (byte)(12 + 35), (byte)(19 + 48), (byte)(51 + 15), (byte)(8 + 59), (byte)(20 + 27), (byte)(76 + 4), (byte)(68 + 7), (byte)(9 + 58), 83, (byte)(25 + 28), (byte)(46 + 34), (byte)(47 + 50), (byte)(11 + 89), (byte)(8 + 92), (byte)(84 + 21), (byte)(102 + 8), (byte)(11 + 92)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
                    NLoginCore_316.var_java_lang_String_arr_b[0] = NLoginCore_427.A("űĹşœƀŷŴŃŌƃŬŕ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[1] = NLoginCore_451.A("ńűŠŠńłƊŚŠŧťŏŲŦŏŴƓŢƕŮƚƉŠš", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[2] = NLoginCore_004.D("ӁӮӝӝӁҿԇӗӝӤӣԍӷԂӧӱԆԍӴԓӐӶӤӧӵԝӵӰӳӬӼӫ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[3] = NLoginCore_453.D("ӁӮӝӝӁҿԇӗӝӤӤԃӤԐӤԄԏӏӶԇӮԖӝӞ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ԺէՖՖԺԸրՐՖ՝՚Խ՜աՉՄռն՘ըևՙՖ՗", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[5] = NLoginCore_091.F("էՍնժց՞խծդԷյՐևՁՔիՕԿՈ֌ՋիՌղթՠ֒հՔ֕ւ֙օլՔ֑ղ֢ն֞ձսցև֢֧֪֝վդխվ֫֡֓ձ֒֔լտւִַֻ֤֯ռַվպִַּֽ֝֐֘׈֙֕֩׀֠׈ֽ׀֨׍֝ב׈֢֣֋׉לך׋׍ז֛׊ֺֺ֡ו֥֫", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[6] = NLoginCore_446.F("ԷՋչ՚ՍբժԽԾՎՎՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[7] = NLoginCore_324.F("՜ԳՈրչՍմՃՍ՘ոՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[8] = NLoginCore_076.A("űŗƀŴƋŨŷŸŮŁſŚƑŋŞŵşŉŒƖŕŵŖżųŪƜźŞƟƌƣƏŶŞƛżƬƀƨŻƇƋƑƬƧƱƴƈŮŷƈƵƫƝŻƜƞŶƉƌƹƾƮǁǅƆǁƈƄƾƧǇǁǆƚƢǒƣƟƳǊƪǒǇǊƲǗƧǛǒƬƭƕǓǦǤǕǗǠƥǔƫǄǄǟƯƵ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[9] = NLoginCore_004.E("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈՑՏ֔տ՞֕֓֒ժՔե", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[10] = NLoginCore_091.F("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈ֑ՍըՌ֕Ց։֕ծ֐ճ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[11] = NLoginCore_575.F("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈ֑ՍըՌ֕Ց։֕ծ֐ճ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[12] = NLoginCore_453.C("ҿҺӢӖӻӧӺӊԉӼӟӫӏӿӃӣԋԕӲԂӏӘӖԛԆӥԜԚԙӱӛӬ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[13] = NLoginCore_324.C("ҿҺӢӖӻӧӺӊԉӼӟӫӏӿӃӣԋԕӲԂӏԘӔӯӓԜӘԐԜӵԗӺ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[14] = NLoginCore_453.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒƛŗŲŖƟśƓƟŸƚŽ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[15] = NLoginCore_091.C("ҵҼӱӾӢԁӗӛӠӠӭӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[16] = NLoginCore_201.D("ӑӑӱӠӑӳӥӣӃӬӍԄәӟԉԄԀӌӌөԅӢԕӻԕԆӮӲԏԁӹԂԔӱӶԕԙԗөԠԠӫӬӲ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[17] = NLoginCore_027.B("ŕƅŨŧśŝŉŻŤžŠŕ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[18] = NLoginCore_092.F("լԺՏշժշոդՍՓմՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[19] = NLoginCore_201.F("՜Ժշՠը՝ոչկԽյԹՂքէգքթՠՙՇ֋ՋՏՊօիզեՏ՚՗֍ն֜ծ֏ց֒ձտք֘ի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[20] = NLoginCore_173.D("ӚһӡӰӔӦӝӓӫӣӊԍԈӘӍӝԇӏөӑӰӬӹԔԉԊӛӪӬӸӼԗ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[21] = NLoginCore_427.D("ӳӕӱӸӽԄԂӉӵӆԁԊӯӏӾӺԊӴԎӕӬӦӲӧԉӱԒԓәӹԏӵ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[22] = NLoginCore_092.A("ŕƅŨŧśŝŉŻŤžŠŕ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[23] = NLoginCore_091.C("ӳӁӖӾӱӾӿӫӔӚӻӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[24] = NLoginCore_324.C("ӟԃӻӵӦӐӲӫӵӵӢӌӋӘԅӳԏӆӞӟԒԆӰӬӗԙӸӹӨӮԑӭ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[25] = NLoginCore_384.D("ԁӭӍҸӐӼӺӵӸӻӿӟԎԇӿӾԌԍӐԖӶӎӭԄӧԙԓӮԒԎԑӛ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[26] = NLoginCore_201.C("ҵҼӱӾӢԁӗӛӠӠӭӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[27] = NLoginCore_092.B("ŕŦŒŝļƌŹźƃƆžŕ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[28] = NLoginCore_027.B("ŽŹŅżƋŦƈƊƄşƂŕ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[29] = NLoginCore_027.A("ŠŃťŁňŞŤŸŉŦźŕ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[30] = NLoginCore_446.B("ŠŃťŁňŞŤŸŉŦźŕ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[31] = NLoginCore_027.F("ճկԻղց՜վրպՕոՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[32] = NLoginCore_559.E("ՈնԹյԶ՚բծոՃքՋ", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[33] = NLoginCore_575.C("ԃӽӏӕәӞӄӄԌӭԇӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[34] = NLoginCore_453.F("ճկԻղց՜վրպՕոՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[35] = NLoginCore_027.E("Ջջ՞՝ՑՓԿձ՚մՖՋ", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[36] = NLoginCore_559.A("ŧƂņśŠƃŽŠřŊŸŌƊűŽſſŶŗťœūœƛƛŞŬƙƏƞƠůƥűƢƕƗƄũơƤŹưưƫŰƊƫƴƍűƐƵƩƀƁ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[37] = NLoginCore_027.F("ՍՊպՠ՜՜Ծսծճա՟ձքթր՞ՇՊքՎՙՖ՗", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[38] = NLoginCore_384.B("ųżƁƇŶŶţŤũŷşƎńŉƀŝũŉƆŗŰŻŖźƎƎơƒşŽŵŴ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[39] = NLoginCore_384.E("Ռ՝ԼԽոոՊԼօ՚ՃրըՒֆմֆՙգՌ֍Ջ֊լՏի։ֈՓ֒Ֆ֙", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[40] = NLoginCore_027.D("ԄӺӓӧӟӛԊӠӁӞԅӺӛԑԑӣԌӧӪӒӲԆӝӞ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[41] = NLoginCore_446.A("ŖŧņŇƂƂŔņƏŤōƊŲŜƐžƐţŭŖƗŕƔŶřŵƓƒŝƜŠƣ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[42] = NLoginCore_384.E("սճՌՠ՘ՔփՙԺ՗վճՔ֊֊՜օՠգՋիտՖ՗", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[43] = NLoginCore_387.D("ӓӤӃӄӿӿӑӃԌӡӋӪԁӊԅӈӣӬӮӣӭӗӦԑӣӴԚӰӕԁԡӜ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[44] = NLoginCore_201.B("ƇŽŖŪŢŞƍţńšƈŽŞƔƔŦƏŪŭŕŵƉŠš", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[45] = NLoginCore_076.E("Ռ՝ԼԽոոՊԼօ՚ՂՅֆՁՇՇֆՉ՜՗Վսեհՠէևծկ֓֏֏", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[46] = NLoginCore_091.F("սճՌՠ՘ՔփՙԺ՗վճՔ֊֊՜օՠգՋիտՖ՗", (byte)71, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_316.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ӒӺԄӻӟӝӇӨӸӇԋӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ԺէՖՖԺԸրՐՖ՝՜ՆեՑ՗ւՌժխփՐՙՖ՗", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[2] = NLoginCore_201.A("ńűŠŠńłƊŚŠŧŦƐźƅŪŴƉƐŷƖœŻŨƝźƕūƠŝūşƂŮššŻźƁƞƇŬƝƌŵ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[3] = NLoginCore_138.B("ńűŠŠńłƊŚŠŧŦƏŽƓŊƍōƗƉŴŌŨųŶŞƍůƑůźſƖ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[4] = NLoginCore_091.A("ńűŠŠńłƊŚŠŧŤƀŚżŽƇōƐƌŕƑůƒƌƏƘżŽƖŻųƢ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[5] = NLoginCore_427.F("էՍնժց՞խծդԷյՐևՁՔիՕԿՈ֌ՋիՌղթՠ֒հՔ֕ւ֙օլՔ֑ղ֢ն֞ձսցև֢֧֪֝վդխվ֫֡֓ձ֒֔լտւִַֻ֤֯ռַվպִַּֽ֝֐֘׈֙֕֩׀֠׈ֽ׀֨׍֝ב׈֢֣֋׉לֳֽֿ֮֗׀ג׋ֺ֛ל׃ֶקףׇ׍׬־֭ׄןֶַ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[6] = NLoginCore_201.D("ӿӻӅӜԁӁӪӾӝӿԁӶӏӻӦӲӐӞԕӎӪӰӝӞ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ӬӿӦӮӚҿԃӼӵӢӕӾӎӺӛӫԅӿԄӏԆӰӝӞ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[8] = NLoginCore_091.A("űŗƀŴƋŨŷŸŮŁſŚƑŋŞŵşŉŒƖŕŵŖżųŪƜźŞƟƌƣƏŶŞƛżƬƀƨŻƇƋƑƬƧƱƴƈŮŷƈƵƫƝŻƜƞŶƉƌƹƾƮǁǅƆǁƈƄƾƧǇǁǆƚƢǒƣƟƳǊƪǒǇǊƲǗƧǛǒƬƭƕǓǦǜƠǥǂǨƢǋǕƺǫǰǱƽǉǵǱǣǡǤǮǢǹǀǁ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[9] = NLoginCore_384.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒőƇƑƉŷƈſŹűźŸ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[10] = NLoginCore_173.E("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈ֏Ջհր֕ֈՍ֎եեՔ֝ռվ֕ռսպյբխ֐ի", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[11] = NLoginCore_387.F("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈ֐֋ա֎զք֑֒և՘չիշմ֞Ւտւյ֡հ֠ի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[12] = NLoginCore_451.A("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒŗƊŻƕŶŒŘƔŷŲƖ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[13] = NLoginCore_559.B("łĽťřžŪŽōƌſŢŮŒƂņŦƎƘŵƅŒƚƉŕśŻŻŜŹřŮƤŸŦźƘŧũƔƗŭƟƦŵ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[14] = NLoginCore_201.F("ԸԳ՛ՏմՠճՃւյ՘դՈոԼ՜ք֎իջՈՍ֏֒Վւ֕Տի֓֓խկ՝֚֞֗ի֟ա֔ապի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[15] = NLoginCore_446.A("śƆřŞŢŠńŢŌśƎƊŌűƎŰœŢŖŕŗƙŠš", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[16] = NLoginCore_091.F("ՊՊժՙՊլ՞՜ԼեՆսՒ՘ւսչՅՅբվ՛֎մ֎տէիֈպղջ֐֝ֈ֙ցնն֤՝ՠ֐ի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[17] = NLoginCore_201.D("ӯӹӣӐӇӠӵӻԋӥәӒ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[18] = NLoginCore_076.A("ŶƃŃŲŀœžśƇƌŘŕ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[19] = NLoginCore_110.D("ӣӁӾӧӯӤӿԀӶӄӼӀӉԋӮӪԋӰӧӠӎԒӒӖӑԌӲӭӬӖӡӞӡӠԏԧӿԗԛԔԋԉӵӲ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[20] = NLoginCore_223.D("ӚһӡӰӔӦӝӓӫӣӊԍԈӘӍӝԇӏөӑӰӢԍԗԄӽӸӺӪӞӷӻ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[21] = NLoginCore_201.F("լՎժձնսջՂծԿպփըՈշճփխևՎե՛ՉհխրղճՎեոգկ֖֕ո֖֍ն՚ոօ֔ի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[22] = NLoginCore_575.E("ԼՖմրՊԿւվՓԷՅՋ", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[23] = NLoginCore_173.C("ӮҿӎӎԄԁӪԆԉӈԋӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[24] = NLoginCore_223.F("՘ռմծ՟Չիդծծ՛ՅՄՑվլֈԿ՗՘֋փռՑգ՞տ֔֊֑֙ֈ֋վի֐րՓ֏ջ֑֟֔ի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[25] = NLoginCore_027.F("պզՆԱՉյճծձմո՘ևրոշօֆՉ֏կ֑֍ՋփՏի֏ծծջղ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[26] = NLoginCore_027.D("ӸԁӯӁԅӸӒӸҽԃӚәӮӿӦӌԁԑӦӈԅӰӝӞ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[27] = NLoginCore_223.D("ӴӓӜӃӢԆԂӇӻӨӡӒ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[28] = NLoginCore_027.E("դծՉԻցղճԾօՙրՋ", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[29] = NLoginCore_384.C("ҽӻӓӧӥӀӟԇӅӬӥӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[30] = NLoginCore_384.B("ŜńľŻŇƉŴŮŌƃŏŕ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[31] = NLoginCore_027.F("Ը՗ՏԺԻ՝՛վյ՘ԽՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[32] = NLoginCore_110.D("ӶҺӻӒӤԀӺӴӓӈӭӒ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[33] = NLoginCore_559.C("ӰӽӿӦӚӃԁӼԆԄӈӒ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[34] = NLoginCore_027.D("ӬӲӔԀӜӠӑӃӇӬөӒ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[35] = NLoginCore_201.F("դնՔձՔՙԼբՕԼՎՋ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[36] = NLoginCore_384.F("՝ոԼՑՖչճՖՏՀծՂրէճյյլՍ՛ՉաՉ֑֑Քբ֏օ֖֔ե֛է֘֋֍պ՟֚֗կ֥֏֕ռ֖֧֚ց֦֋քչնշ", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[37] = NLoginCore_223.D("ӔӑԁӧӣӣӅԄӵӺӨԂԌӢԒӒԁԌӥԊӧӫӮӔӔӼӽԚӴӰԓӽ", (byte)71, 68);
                    NLoginCore_316.var_java_lang_String_arr_b[38] = NLoginCore_091.E("թղշսլլՙ՚՟խՕքԺԿնՓ՟ԿռՍզջպցֆ֋գօկն֕շ", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[39] = NLoginCore_027.E("Ռ՝ԼԽոոՊԼօ՚ՃրըՒֆմֆՙգՌ֍Վքռվղլ֏եքքօխշՙէ֓֘ղռ՝բնի", (byte)71, 69);
                    NLoginCore_316.var_java_lang_String_arr_b[40] = NLoginCore_173.C("ԄӺӓӧӟӛԊӠӁӞԅӆӼԄӈӥӛԄӴԎӧӠӝӞ", (byte)71, 67);
                    NLoginCore_316.var_java_lang_String_arr_b[41] = NLoginCore_324.B("ŖŧņŇƂƂŔņƏŤōƊŲŜƐžƐţŭŖƗƜŗŦƈƚŻŘƍżŬƛŰŤšƘųƊƆŦƖƏƐŵ", (byte)71, 66);
                    NLoginCore_316.var_java_lang_String_arr_b[42] = NLoginCore_173.A("ƇŽŖŪŢŞƍţńšƆŊőŪŴŠƃƘťŒƆƉŠš", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[43] = NLoginCore_091.A("ŖŧņŇƂƂŔņƏŤŎŭƄōƈŋŦůűŦŰŒƙŦžƘƎƎšƞƞƃƓůƛƗơŨƟƄťƯƦŵ", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[44] = NLoginCore_201.A("ƇŽŖŪŢŞƍţńšƈſšŢƒŭƅŵƍŶŒƉŠš", (byte)71, 65);
                    NLoginCore_316.var_java_lang_String_arr_b[45] = NLoginCore_384.F("Ռ՝ԼԽոոՊԼօ՚ՂՅֆՁՇՇֆՉ՜՗ՎհքխՠթՈմժ֐ե֙շ֕֗՜լ֠֝ճ֞չւի", (byte)71, 70);
                    NLoginCore_316.var_java_lang_String_arr_b[46] = NLoginCore_138.E("սճՌՠ՘ՔփՙԺ՗սհՆշճլշլսՁձթՖ՗", (byte)71, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_316.var_java_lang_String_arr_b[0] = NLoginCore_110.E("՜ըչՉՉ՝Րփք՞՘ց՟փ՚սՄ՟դֆՌտՖ՗", (byte)71, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_316.var_java_lang_String_arr_b[0] = NLoginCore_387.D("ԀӣӕӃӦӖӡӔԀӾӨӈӉԏөԅӢӆӿӎӬԆӝӞ", (byte)71, 68);
                }
            }
        }
    }

    public List<String> b(NLoginCore_397 NLoginCore_2372, Object ... objectArray) {
        if (!NLoginCore_2372.aI) {
            throw new IllegalStateException(NLoginCore_2372 + (String)NLoginCore_316.c("㺀", (int)bh, (long)(bi ^ bj)));
        }
        return NLoginCore_2372.b(this.var_com_nickuc_login_NLoginCore_208_e, objectArray);
    }

    private void a(NLoginCore_219 NLoginCore_2192, NLoginCore_219 NLoginCore_2193, NLoginCore_102 NLoginCore_102) {
        String string = NLoginCore_102.var_com_nickuc_login_NLoginCore_474_d.a()[ez];
        NLoginCore_190 NLoginCore_1902 = NLoginCore_102.a(string, NLoginCore_102.aH ? NLoginCore_2193 : this.var_com_nickuc_login_NLoginCore_219_e);
        if (!NLoginCore_102.aH && NLoginCore_1902 == null) {
            NLoginCore_1902 = NLoginCore_102.a(string, NLoginCore_2192);
        }
        if (NLoginCore_1902 == null) {
            NLoginCore_1902 = (NLoginCore_190)NLoginCore_102.java_lang_Object_a();
        }
        NLoginCore_525.a((NLoginInterface_005)NLoginCore_102, this.var_com_nickuc_login_NLoginCore_208_g, NLoginCore_1902, fa != 0);
    }

    private void a(NLoginCore_219 NLoginCore_2192, NLoginCore_219 NLoginCore_2193, NLoginCore_508 NLoginCore_5082) {
        String string = NLoginCore_5082.var_com_nickuc_login_NLoginCore_474_g.a()[ex];
        NLoginCore_075 NLoginCore_0752 = NLoginCore_075.a(string, NLoginCore_5082.aK ? NLoginCore_2193 : this.var_com_nickuc_login_NLoginCore_219_e);
        if (!NLoginCore_5082.aK && !NLoginCore_0752.Z()) {
            NLoginCore_0752 = NLoginCore_075.a(string, NLoginCore_2192);
        }
        if (NLoginCore_0752 == null) {
            NLoginCore_0752 = (NLoginCore_075)NLoginCore_5082.java_lang_Object_a();
        }
        NLoginCore_525.a((NLoginInterface_005)NLoginCore_5082, this.var_com_nickuc_login_NLoginCore_208_f, NLoginCore_0752, ey != 0);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_316.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("Քնո՘ռ֛֓֩֕դ֢֦֘֠թ֎ְ֧֧֭֯ռ", (byte)112, 70), NLoginCore_316.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.B("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԬԧԥԺ԰ԽԖԼԓƳ", (byte)112, 66) + string + NLoginCore_138.F("զ", (byte)112, 70) + methodType.toString(), exception);
        }
    }

    @Nullable
    private String a(NLoginCore_374 NLoginCore_4872) {
        switch (NLoginCore_202.ag[NLoginCore_4872.ordinal()]) {
            case 1: 
            case 2: {
                NLoginCore_374 NLoginCore_4873;
                NLoginCore_374 NLoginCore_4874 = NLoginCore_4873 = NLoginCore_4872 == NLoginCore_374.h ? NLoginCore_374.var_com_nickuc_login_NLoginCore_487_f : NLoginCore_374.g;
                if (!this.var_com_nickuc_login_NLoginCore_219_e.p(NLoginCore_4873.var_com_nickuc_login_NLoginCore_474_f.a()[bx])) {
                    if (this.var_com_nickuc_login_NLoginCore_055_b == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c || this.var_com_nickuc_login_NLoginCore_055_b == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_s) {
                        NLoginCore_525.a((NLoginInterface_005)NLoginCore_4873, this.var_com_nickuc_login_NLoginCore_208_d, (String)NLoginCore_316.c("㺀", (int)by, (long)(bz ^ ca)) + (String)(NLoginCore_4872 == NLoginCore_374.h ? NLoginCore_316.c("㺃", (int)cb, (long)(cc ^ cd)) : NLoginCore_316.c("㺆", (int)ce, (long)cf)) + (String)NLoginCore_316.c("㺉", (int)cg, (long)(ch ^ ci)), cj != 0);
                        NLoginCore_525.a((NLoginInterface_005)NLoginCore_4872, this.var_com_nickuc_login_NLoginCore_208_d, NLoginCore_316.c("㺌", (int)ck, (long)(cl ^ cm)), cn != 0);
                    } else {
                        NLoginCore_525.a((NLoginInterface_005)NLoginCore_4873, this.var_com_nickuc_login_NLoginCore_208_d, (String)NLoginCore_316.c("㺏", (int)co, (long)(cp ^ cq)) + (String)(NLoginCore_4872 == NLoginCore_374.h ? NLoginCore_316.c("㺒", (int)cr, (long)(cs ^ ct)) : NLoginCore_316.c("㺕", (int)cu, (long)(cv ^ cw))) + (String)NLoginCore_316.c("㺘", (int)(cx & cy), (long)cz), da != 0);
                        NLoginCore_525.a((NLoginInterface_005)NLoginCore_4872, this.var_com_nickuc_login_NLoginCore_208_d, NLoginCore_316.c("㺛", (int)db, (long)dc), dd != 0);
                    }
                    return NLoginCore_316.c("㺞", (int)de, (long)df);
                }
                Object[] objectArray = new Object[dg];
                objectArray[NLoginCore_316.dh] = NLoginCore_316.c("㺡", (int)(di & dj), (long)dk);
                String string = this.a(NLoginCore_4873, objectArray);
                String[] stringArray = string.split((String)NLoginCore_316.c("㺤", (int)dl, (long)(dm ^ dn)));
                if (stringArray.length == cfr_renamed_1 && (stringArray = string.split((String)NLoginCore_316.c("㺧", (int)dp, (long)(dq ^ dr)))).length == ds) {
                    NLoginCore_525.a((NLoginInterface_005)NLoginCore_4873, this.var_com_nickuc_login_NLoginCore_208_d, NLoginCore_4873.a(this.var_com_nickuc_login_NLoginCore_208_d, new Object[dt]).replace((CharSequence)NLoginCore_316.c("㺪", (int)du, (long)(dv ^ dw)), (CharSequence)NLoginCore_316.c("㺭", (int)dx, (long)dy)), dz != 0);
                }
                if (stringArray.length == ea && stringArray[eb].length() > ec && stringArray[ed].length() > ee) {
                    int n = stringArray[ef].lastIndexOf((String)NLoginCore_316.c("㺰", (int)(eg & eh), (long)ei));
                    int n2 = stringArray[ej].indexOf((String)NLoginCore_316.c("㺳", (int)(ek & el), (long)em));
                    if (n >= 0 && n2 > 0) {
                        return stringArray[en].substring(n + eo) + (String)NLoginCore_316.c("㺶", (int)ep, (long)(eq ^ er)) + stringArray[es].substring(et, n2);
                    }
                }
                return NLoginCore_316.c("㺹", (int)eu, (long)(ev ^ ew));
            }
        }
        return null;
    }

    public NLoginCore_075 a(NLoginCore_508 NLoginCore_5082) {
        return (NLoginCore_075)NLoginCore_5082.b(this.var_com_nickuc_login_NLoginCore_208_f);
    }

    private void a(NLoginCore_219 NLoginCore_2192, NLoginCore_374 NLoginCore_4872) {
        if (NLoginCore_4872.var_boolean_aJ) {
            String string;
            int n;
            List<String> list = null;
            String[] stringArray = NLoginCore_4872.var_com_nickuc_login_NLoginCore_474_f.a();
            int n2 = stringArray.length;
            for (n = bk; n < n2 && (list = this.var_com_nickuc_login_NLoginCore_219_e.b(string = stringArray[n], (List<String>)null)) == null; ++n) {
            }
            if (list == null) {
                stringArray = NLoginCore_4872.var_com_nickuc_login_NLoginCore_474_f.a();
                n2 = stringArray.length;
                for (n = bl; n < n2 && (list = NLoginCore_2192.b(string = stringArray[n], (List<String>)null)) == null; ++n) {
                }
            }
            if (list == null || list.isEmpty()) {
                list = (List)NLoginCore_4872.var_java_lang_Object_o;
            }
            NLoginCore_525.a((NLoginInterface_005)NLoginCore_4872, this.var_com_nickuc_login_NLoginCore_208_d, list, bm != 0);
        } else {
            String string;
            int n;
            String string2 = null;
            String[] stringArray = NLoginCore_4872.var_com_nickuc_login_NLoginCore_474_f.a();
            int n3 = stringArray.length;
            for (n = bn; n < n3 && (string2 = this.var_com_nickuc_login_NLoginCore_219_e.java_lang_String_b(string = stringArray[n])) == null; ++n) {
            }
            if (string2 == null) {
                string2 = this.a(NLoginCore_4872);
                if (((String)NLoginCore_316.c("㺀", (int)bo, (long)(bp ^ bq))).equals(string2)) {
                    return;
                }
            }
            if (string2 == null) {
                stringArray = NLoginCore_4872.var_com_nickuc_login_NLoginCore_474_f.a();
                n3 = stringArray.length;
                for (n = br; n < n3 && (string2 = NLoginCore_2192.java_lang_String_b(string = stringArray[n])) == null; ++n) {
                }
            }
            if (string2 == null) {
                string2 = (String)NLoginCore_4872.var_java_lang_Object_o;
            }
            NLoginCore_525.a((NLoginInterface_005)NLoginCore_4872, this.var_com_nickuc_login_NLoginCore_208_d, string2, bs != 0);
        }
    }

    public List<String> b(NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        if (!NLoginCore_4872.var_boolean_aJ) {
            throw new IllegalStateException(NLoginCore_4872 + (String)NLoginCore_316.c("㺀", (int)ay, (long)(az ^ ba)));
        }
        return NLoginCore_4872.b(this.var_com_nickuc_login_NLoginCore_208_d, objectArray);
    }

    public List<String> a(NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        if (!NLoginCore_4872.var_boolean_aJ) {
            throw new IllegalStateException(NLoginCore_4872 + (String)NLoginCore_316.c("㺀", (int)(av & aw), (long)ax));
        }
        return NLoginCore_4872.a(this.var_com_nickuc_login_NLoginCore_208_d, objectArray);
    }

    private boolean a(NLoginCore_219 NLoginCore_2192, NLoginCore_219 NLoginCore_2193) {
        this.var_com_nickuc_login_NLoginCore_219_e.o((String)NLoginCore_316.c("㺀", (int)fb, (long)(fc ^ fd)) + this.var_com_nickuc_login_NLoginCore_055_b.cO);
        return this.b(NLoginCore_2192, NLoginCore_2193);
    }
}

