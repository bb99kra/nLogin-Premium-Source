/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_221;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_519;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_400 {
    private static int ei;
    private static int gu;
    private static long dn;
    private static long ie;
    private static int au;
    private static int gp;
    private static long ij;
    private static int ee;
    private static int jh;
    private static long cc;
    private static int eh;
    private static long hk;
    private static int jz;
    private static long du;
    private static int var_int_k;
    private static long ce;
    protected long var_long_l;
    private static int gf;
    private static long y;
    private static int fi;
    private static long t;
    private static long gd;
    private static long bi;
    private static int dc;
    private static long dt;
    private static long bn;
    private static int ih;
    private static long jp;
    private static long fa;
    private static int fj;
    private static int jk;
    private static long cr;
    protected NLoginCore_459 var_com_nickuc_login_NLoginCore_459_d;
    private static int js;
    private static int aa;
    private static final Set<NLoginCore_400> var_java_util_Set_com_nickuc_login_NLoginCore_374__e;
    private static long cy;
    private static volatile Thread var_java_lang_Thread_a;
    protected static final String B;
    private static long ec;
    private static int var_int_a;
    private static long var_long_d;
    private final boolean A;
    private static long ak;
    private static int hf;
    private static int be;
    private static int jn;
    private static int g;
    private static long ix;
    private static long bl;
    private static int el;
    private static int cu;
    private static long z;
    private static long dz;
    private static int q;
    private static int ga;
    private static int id;
    private static long co;
    private static int jj;
    private static long az;
    private static int fk;
    private static long al;
    private static long bw;
    private static int ck;
    private static int ba;
    private static int jy;
    private static long iq;
    private static long gm;
    private static long ji;
    private static long iu;
    private static int ej;
    private static int cz;
    private static long dd;
    private static long cv;
    private static int es;
    private static int ab;
    private static long gq;
    private static int hr;
    private static int dv;
    private static long jt;
    private static long fw;
    private static int bs;
    private static int var_int_l;
    private static long eq;
    private static int r;
    private static int jx;
    private static long dh;
    private static int gr;
    private static long s;
    private static long ah;
    private static int ib;
    private static long cm;
    private static int ha;
    private static int cp;
    private static long bp;
    private static int bm;
    private static int dj;
    private static int ct;
    private static long dl;
    private static long gc;
    private static long bc;
    private static int as;
    private static long ir;
    private static String[] var_java_lang_String_arr_a;
    private static int hu;
    private static long aq;
    private static long hy;
    private static long bz;
    private static int am;
    private static long gh;
    private static long dx;
    private static long ao;
    private static int jv;
    private static int hi;
    private static int n;
    private static long fm;
    private static int il;
    private static int dm;
    private static int eg;
    private static long bx;
    private static int bv;
    private static long var_long_e;
    private static long af;
    private static int ds;
    private static int eo;
    private static long gs;
    private static int cw;
    private static long fd;
    private static long hj;
    private static long ex;
    private static int hl;
    private static int df;
    private static int gx;
    private static int o;
    private static long bf;
    private static int hd;
    private static int hq;
    private static long da;
    private static int jw;
    private static long ai;
    private static int hz;
    private static int ht;
    private static long fl;
    private static int hp;
    private static int he;
    private static int hs;
    private static long gy;
    private static long in;
    private static int fc;
    private static long db;
    private static long je;
    private static long fb;
    private static int jd;
    private static int br;
    private static long fs;
    private static long ii;
    private static int bb;
    private static int ag;
    private static long cfr_renamed_0;
    private static int gi;
    private static long gt;
    private static int x;
    private static int var_int_j;
    private static int ff;
    private static long an;
    private static int ef;
    private static long bg;
    private static int ju;
    private static long cj;
    protected final NLoginCore_531 var_com_nickuc_login_NLoginCore_479_a;
    private static int ip;
    private static int av;
    private static long fp;
    private static int ci;
    private NLoginCore_598 var_com_nickuc_login_NLoginInterface_048_b;
    private static int hv;
    private static int fy;
    private static long fe;
    private static long ja;
    private static int gb;
    private static int hw;
    private static long jf;
    private static int cq;
    protected long var_long_j;
    private static long ea;
    private static long bq;
    private static int jg;
    private static int var_int_b;
    private static long w;
    private static int ft;
    private static int ax;
    protected long var_long_k;
    private static int iv;
    private static long bj;
    private static long jo;
    private static long cfr_renamed_1;
    private static long var_long_m;
    private static int i;
    private static long ae;
    private static long de;
    private static int bh;
    private static long hg;
    private static long iy;
    private static long ic;
    private static int aj;
    private static int p;
    protected final NLoginType_008 var_com_nickuc_login_NLoginType_008_m;
    private static int fn;
    private static int dp;
    private static int ep;
    private static int eb;
    protected NLoginCore_221 var_com_nickuc_login_NLoginCore_221_a;
    private static int ad;
    private static int fu;
    private static long fz;
    private static long c;
    private static int ev;
    private static long gw;
    private static int jr;
    private static long cb;
    private static int hn;
    private static int at;
    private static int ca;
    private static int jc;
    private static long it;
    private NLoginCore_270 var_com_nickuc_login_NLoginCore_270_a;
    private static long fr;
    private static long er;
    private static int cf;
    private static int v;
    private static long em;
    private static long ey;
    private static int fo;
    private static long ho;
    private static int fx;
    private static int is;
    private static long ka;
    private static int iz;
    private static long bu;
    private static int ap;
    private static int ia;
    private static long ed;
    private static long ch;
    private static int ig;
    private static int go;
    private static int by;
    private static long h;
    private static int ge;
    private static int ik;
    private static long gn;
    private static long dw;
    private static int cn;
    private static long ar;
    private static int jm;
    private static long ek;
    private static int ew;
    private static int dy;
    private static int bo;
    private static int ay;
    private static int hb;
    private static int bt;
    private static long dk;
    private static int fg;
    private static int bk;
    private static long gz;
    private static long gj;
    private static long hh;
    private static long gv;
    private static int hc;
    private static long bd;
    private static long fh;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static int cl;
    private static int cd;
    private static long gg;
    private static int u;
    private static long aw;
    private static int jq;
    private static long jl;
    private static int dg;
    private static long cs;
    private static int hx;
    private static double hm;
    private static int ez;
    private static long fv;
    private static long cg;
    private static long eu;
    private static int gl;
    private static int iw;
    private static int gk;
    private static int di;
    private static int et;
    private static long dq;
    private static int io;
    private static int ac;
    private static int cx;
    private static long dr;
    private static long jb;
    private static long en;
    private static long im;
    private static int fq;

    protected void e(String string, String string2, String string3) {
        Object[] objectArray = new Object[n];
        objectArray[NLoginCore_400.o] = this.var_com_nickuc_login_NLoginCore_479_a.getName();
        objectArray[NLoginCore_400.p] = string2;
        objectArray[NLoginCore_400.q] = string3 != null ? (String)NLoginCore_400.c("㺃", (int)r, (long)(s ^ t)) + string3 + (String)NLoginCore_400.c("㺆", (int)(u & v), (long)w) : NLoginCore_400.c("㺉", (int)x, (long)(y ^ z));
        objectArray[NLoginCore_400.aa] = string;
        NLoginCore_370.c((String)NLoginCore_400.c("㺀", (int)(var_int_k & var_int_l), (long)var_long_m), objectArray);
    }

    @Generated
    public boolean G() {
        return this.A;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-3167127905720696155L);
        var_long_e = Long.reverse(0x2C00000000000000L);
        f = 32768 >>> 79 | 32768 << ~79 + 1;
        g = Integer.reverse(-1);
        h = Long.reverse(-573054520355290459L);
        i = 0 >>> 71 | 0 << ~71 + 1;
        var_int_j = Integer.reverse(Integer.MIN_VALUE);
        var_int_k = Integer.reverse(0x40000000);
        var_int_l = Integer.reverse(-1);
        var_long_m = Long.reverse(-573054520355290459L);
        n = Integer.reverse(0x20000000);
        o = 0 >>> 198 | 0 << ~198 + 1;
        p = 4 >>> 130 | 4 << ~130 + 1;
        q = (Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << -158) & 0xFFFFFFFF;
        r = 96 >>> 69 | 96 << ~69 + 1;
        s = Long.reverse(-3167127905720696155L);
        t = Long.reverse(0x2C00000000000000L);
        u = Integer.reverse(0x20000000);
        v = Integer.reverse(-1);
        w = Long.reverse(-573054520355290459L);
        x = -2147483646 >>> 31 | -2147483646 << -31;
        y = Long.reverse(-3167127905720696155L);
        z = Long.reverse(0x2C00000000000000L);
        aa = 786432 >>> 82 | 786432 << ~82 + 1;
        ab = (0 >>> 228 | 0 << -228) & 0xFFFFFFFF;
        ac = (8 >>> 99 | 8 << -99) & 0xFFFFFFFF;
        ad = Integer.reverse(0x60000000);
        ae = Long.reverse(-3167127905720696155L);
        af = Long.reverse(0x2C00000000000000L);
        ag = 0x1C0000 >>> 178 | 0x1C0000 << ~178 + 1;
        ah = Long.reverse(-3167127905720696155L);
        ai = Long.reverse(0x2C00000000000000L);
        aj = Integer.reverse(0x10000000);
        ak = Long.reverse(-3167127905720696155L);
        al = Long.reverse(0x2C00000000000000L);
        am = Integer.reverse(-1879048192);
        an = Long.reverse(-3167127905720696155L);
        ao = Long.reverse(0x2C00000000000000L);
        ap = Integer.reverse(0x50000000);
        aq = Long.reverse(-3167127905720696155L);
        ar = Long.reverse(0x2C00000000000000L);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = 0 >>> 39 | 0 << -39;
        au = Integer.reverse(0);
        av = -1342177280 >>> 220 | -1342177280 << ~220 + 1;
        aw = Long.reverse(-573054520355290459L);
        ax = Integer.reverse(0x30000000);
        ay = (-1 >>> 35 | -1 << ~35 + 1) & 0xFFFFFFFF;
        az = Long.reverse(-573054520355290459L);
        ba = (0 >>> 155 | 0 << ~155 + 1) & 0xFFFFFFFF;
        bb = (26 >>> 1 | 26 << ~1 + 1) & 0xFFFFFFFF;
        bc = Long.reverse(-3167127905720696155L);
        bd = Long.reverse(0x2C00000000000000L);
        be = (1792 >>> 135 | 1792 << -135) & 0xFFFFFFFF;
        bf = Long.reverse(-3167127905720696155L);
        bg = Long.reverse(0x2C00000000000000L);
        bh = Integer.reverse(-268435456);
        bi = Long.reverse(-3167127905720696155L);
        bj = Long.reverse(0x2C00000000000000L);
        bk = Integer.reverse(0x8000000);
        bl = Long.reverse(-573054520355290459L);
        bm = Integer.reverse(-2013265920);
        bn = Long.reverse(-573054520355290459L);
        bo = 0x4800000 >>> 246 | 0x4800000 << -246;
        bp = Long.reverse(-3167127905720696155L);
        bq = Long.reverse(0x2C00000000000000L);
        br = 0 >>> 14 | 0 << ~14 + 1;
        bs = 622592 >>> 207 | 622592 << -207;
        bt = Integer.reverse(-1);
        bu = Long.reverse(-573054520355290459L);
        bv = Integer.reverse(0x28000000);
        bw = Long.reverse(-3167127905720696155L);
        bx = Long.reverse(0x2C00000000000000L);
        by = Integer.reverse(-1476395008);
        bz = Long.reverse(-573054520355290459L);
        ca = Integer.reverse(0x68000000);
        cb = Long.reverse(-3167127905720696155L);
        cc = Long.reverse(0x2C00000000000000L);
        cd = Integer.reverse(-402653184);
        ce = Long.reverse(-573054520355290459L);
        cf = (786432 >>> 47 | 786432 << -47) & 0xFFFFFFFF;
        cg = Long.reverse(-3167127905720696155L);
        ch = Long.reverse(0x2C00000000000000L);
        ci = Integer.reverse(-1744830464);
        cj = Long.reverse(-573054520355290459L);
        ck = Integer.reverse(0x58000000);
        cl = Integer.reverse(-1);
        cm = Long.reverse(-573054520355290459L);
        cn = (0xD80000 >>> 51 | 0xD80000 << ~51 + 1) & 0xFFFFFFFF;
        co = Long.reverse(-573054520355290459L);
        cp = Integer.reverse(0);
        cq = Integer.reverse(0x38000000);
        cr = Long.reverse(-3167127905720696155L);
        cs = Long.reverse(0x2C00000000000000L);
        ct = (0x7400000 >>> 86 | 0x7400000 << -86) & 0xFFFFFFFF;
        cu = Integer.reverse(-1);
        cv = Long.reverse(-573054520355290459L);
        cw = Integer.reverse(0x78000000);
        cx = -1 >>> 179 | -1 << -179;
        cy = Long.reverse(-573054520355290459L);
        cz = Integer.reverse(-134217728);
        da = Long.reverse(-3167127905720696155L);
        db = Long.reverse(0x2C00000000000000L);
        dc = (4096 >>> 71 | 4096 << ~71 + 1) & 0xFFFFFFFF;
        dd = Long.reverse(-3167127905720696155L);
        de = Long.reverse(0x2C00000000000000L);
        df = 2112 >>> 102 | 2112 << -102;
        dg = Integer.reverse(-1);
        dh = Long.reverse(-573054520355290459L);
        di = 0 >>> 37 | 0 << -37;
        dj = Integer.reverse(0x44000000);
        dk = Long.reverse(-3167127905720696155L);
        dl = Long.reverse(0x2C00000000000000L);
        dm = Integer.reverse(-1006632960);
        dn = Long.reverse(-3167127905720696155L);
        cfr_renamed_1 = Long.reverse(0x2C00000000000000L);
        dp = Integer.reverse(0x24000000);
        dq = Long.reverse(-3167127905720696155L);
        dr = Long.reverse(0x2C00000000000000L);
        ds = (0x25000000 >>> 24 | 0x25000000 << ~24 + 1) & 0xFFFFFFFF;
        dt = Long.reverse(-3167127905720696155L);
        du = Long.reverse(0x2C00000000000000L);
        dv = (311296 >>> 13 | 311296 << -13) & 0xFFFFFFFF;
        dw = Long.reverse(-3167127905720696155L);
        dx = Long.reverse(0x2C00000000000000L);
        dy = 1248 >>> 197 | 1248 << ~197 + 1;
        dz = Long.reverse(-3167127905720696155L);
        ea = Long.reverse(0x2C00000000000000L);
        eb = (0x1400000 >>> 243 | 0x1400000 << -243) & 0xFFFFFFFF;
        ec = Long.reverse(-3167127905720696155L);
        ed = Long.reverse(0x2C00000000000000L);
        ee = Integer.reverse(Integer.MIN_VALUE);
        ef = 0 >>> 15 | 0 << ~15 + 1;
        eg = Integer.reverse(0);
        eh = Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << -159;
        ei = 0 >>> 203 | 0 << -203;
        ej = 343932928 >>> 247 | 343932928 << -247;
        ek = Long.reverse(-573054520355290459L);
        el = Integer.reverse(0x54000000);
        em = Long.reverse(-3167127905720696155L);
        en = Long.reverse(0x2C00000000000000L);
        eo = (0 >>> 188 | 0 << ~188 + 1) & 0xFFFFFFFF;
        ep = Integer.reverse(-738197504);
        eq = Long.reverse(-3167127905720696155L);
        er = Long.reverse(0x2C00000000000000L);
        es = 720896 >>> 142 | 720896 << -142;
        et = (-1 >>> 78 | -1 << ~78 + 1) & 0xFFFFFFFF;
        eu = Long.reverse(-573054520355290459L);
        ev = 0 >>> 19 | 0 << -19;
        ew = Integer.reverse(-1275068416);
        ex = Long.reverse(-3167127905720696155L);
        ey = Long.reverse(0x2C00000000000000L);
        ez = (23 >>> 191 | 23 << ~191 + 1) & 0xFFFFFFFF;
        fa = Long.reverse(-3167127905720696155L);
        fb = Long.reverse(0x2C00000000000000L);
        fc = (-268435454 >>> 124 | -268435454 << -124) & 0xFFFFFFFF;
        fd = Long.reverse(-3167127905720696155L);
        fe = Long.reverse(0x2C00000000000000L);
        ff = (0x180000 >>> 15 | 0x180000 << ~15 + 1) & 0xFFFFFFFF;
        fg = Integer.reverse(-1);
        fh = Long.reverse(-573054520355290459L);
        fi = Integer.reverse(0);
        fj = Integer.reverse(0x2000000);
        fk = Integer.reverse(-1946157056);
        fl = Long.reverse(-3167127905720696155L);
        fm = Long.reverse(0x2C00000000000000L);
        fn = (0 >>> 149 | 0 << ~149 + 1) & 0xFFFFFFFF;
        fo = (25600 >>> 9 | 25600 << ~9 + 1) & 0xFFFFFFFF;
        fp = Long.reverse(-573054520355290459L);
        fq = Integer.reverse(-872415232);
        fr = Long.reverse(-3167127905720696155L);
        fs = Long.reverse(0x2C00000000000000L);
        ft = 0 >>> 111 | 0 << ~111 + 1;
        fu = Integer.reverse(0x2C000000);
        fv = Long.reverse(-3167127905720696155L);
        fw = Long.reverse(0x2C00000000000000L);
        fx = (848 >>> 196 | 848 << ~196 + 1) & 0xFFFFFFFF;
        fy = Integer.reverse(-1);
        fz = Long.reverse(-573054520355290459L);
        ga = 0 >>> 192 | 0 << ~192 + 1;
        gb = 27 >>> 127 | 27 << -127;
        gc = Long.reverse(-3167127905720696155L);
        gd = Long.reverse(0x2C00000000000000L);
        ge = Integer.reverse(0);
        gf = Integer.reverse(-335544320);
        gg = Long.reverse(-3167127905720696155L);
        gh = Long.reverse(0x2C00000000000000L);
        gi = (0x7000000 >>> 21 | 0x7000000 << ~21 + 1) & 0xFFFFFFFF;
        gj = Long.reverse(-573054520355290459L);
        gk = Integer.reverse(0);
        gl = 29184 >>> 233 | 29184 << -233;
        gm = Long.reverse(-3167127905720696155L);
        gn = Long.reverse(0x2C00000000000000L);
        go = Integer.reverse(0);
        gp = (0x1D0000 >>> 143 | 0x1D0000 << ~143 + 1) & 0xFFFFFFFF;
        gq = Long.reverse(-573054520355290459L);
        gr = Integer.reverse(-603979776);
        gs = Long.reverse(-3167127905720696155L);
        gt = Long.reverse(0x2C00000000000000L);
        gu = (15 >>> 94 | 15 << -94) & 0xFFFFFFFF;
        gv = Long.reverse(-3167127905720696155L);
        gw = Long.reverse(0x2C00000000000000L);
        gx = 0x8000000 >>> 91 | 0x8000000 << ~91 + 1;
        gy = Long.reverse(1711367858400788480L);
        gz = Long.reverse(0x2600000000000000L);
        ha = 0 >>> 159 | 0 << -159;
        hb = (4 >>> 226 | 4 << -226) & 0xFFFFFFFF;
        hc = Integer.reverse(0);
        hd = Integer.reverse(Integer.MIN_VALUE);
        he = (0 >>> 29 | 0 << ~29 + 1) & 0xFFFFFFFF;
        hf = Integer.reverse(-1140850688);
        hg = Long.reverse(-3167127905720696155L);
        hh = Long.reverse(0x2C00000000000000L);
        hi = (248 >>> 34 | 248 << -34) & 0xFFFFFFFF;
        hj = Long.reverse(-3167127905720696155L);
        hk = Long.reverse(0x2C00000000000000L);
        hl = (0 >>> 35 | 0 << -35) & 0xFFFFFFFF;
        hm = Double.longBitsToDouble(Long.reverse(39426L));
        hn = 0x3F000000 >>> 56 | 0x3F000000 << -56;
        ho = Long.reverse(-573054520355290459L);
        hp = 0x28000000 >>> 59 | 0x28000000 << -59;
        hq = 0 >>> 123 | 0 << ~123 + 1;
        hr = Integer.reverse(Integer.MIN_VALUE);
        hs = Integer.reverse(0x40000000);
        ht = 256 >>> 71 | 256 << -71;
        hu = -2147483630 >>> 255 | -2147483630 << -255;
        hv = (12288 >>> 108 | 12288 << ~108 + 1) & 0xFFFFFFFF;
        hw = (25 >>> 224 | 25 << -224) & 0xFFFFFFFF;
        hx = 16 >>> 190 | 16 << ~190 + 1;
        hy = Long.reverse(-573054520355290459L);
        hz = 0x400000 >>> 180 | 0x400000 << ~180 + 1;
        ia = Integer.reverse(-2113929216);
        ib = Integer.reverse(-1);
        ic = Long.reverse(-573054520355290459L);
        id = Integer.reverse(0x42000000);
        ie = Long.reverse(-3167127905720696155L);
        cfr_renamed_0 = Long.reverse(0x2C00000000000000L);
        ig = Integer.reverse(0);
        ih = Integer.reverse(-1040187392);
        ii = Long.reverse(-3167127905720696155L);
        ij = Long.reverse(0x2C00000000000000L);
        ik = 0 >>> 110 | 0 << ~110 + 1;
        il = (0x40000004 >>> 28 | 0x40000004 << ~28 + 1) & 0xFFFFFFFF;
        im = Long.reverse(-3167127905720696155L);
        in = Long.reverse(0x2C00000000000000L);
        io = (0 >>> 121 | 0 << -121) & 0xFFFFFFFF;
        ip = (70656 >>> 138 | 70656 << ~138 + 1) & 0xFFFFFFFF;
        iq = Long.reverse(-3167127905720696155L);
        ir = Long.reverse(0x2C00000000000000L);
        is = Integer.reverse(0x62000000);
        it = Long.reverse(-3167127905720696155L);
        iu = Long.reverse(0x2C00000000000000L);
        iv = Integer.reverse(0);
        iw = 290816 >>> 12 | 290816 << ~12 + 1;
        ix = Long.reverse(-3167127905720696155L);
        iy = Long.reverse(0x2C00000000000000L);
        iz = (0x2400000 >>> 83 | 0x2400000 << -83) & 0xFFFFFFFF;
        ja = Long.reverse(-3167127905720696155L);
        jb = Long.reverse(0x2C00000000000000L);
        jc = Integer.reverse(0);
        jd = (1073741842 >>> 30 | 1073741842 << ~30 + 1) & 0xFFFFFFFF;
        je = Long.reverse(-3167127905720696155L);
        jf = Long.reverse(0x2C00000000000000L);
        jg = Integer.reverse(0);
        jh = 2368 >>> 165 | 2368 << ~165 + 1;
        ji = Long.reverse(-573054520355290459L);
        jj = Integer.reverse(-771751936);
        jk = (-1 >>> 79 | -1 << -79) & 0xFFFFFFFF;
        jl = Long.reverse(-573054520355290459L);
        jm = Integer.reverse(0);
        jn = 0x60000002 >>> 187 | 0x60000002 << ~187 + 1;
        jo = Long.reverse(-3167127905720696155L);
        jp = Long.reverse(0x2C00000000000000L);
        jq = (0 >>> 187 | 0 << -187) & 0xFFFFFFFF;
        jr = Integer.reverse(-1308622848);
        js = -1 >>> 189 | -1 << -189;
        jt = Long.reverse(-573054520355290459L);
        ju = Integer.reverse(Integer.MIN_VALUE);
        jv = (0 >>> 150 | 0 << -150) & 0xFFFFFFFF;
        jw = 331350016 >>> 214 | 331350016 << -214;
        jx = (10112 >>> 135 | 10112 << ~135 + 1) & 0xFFFFFFFF;
        jy = 0x4E000000 >>> 248 | 0x4E000000 << ~248 + 1;
        jz = (-1 >>> 225 | -1 << ~225 + 1) & 0xFFFFFFFF;
        ka = Long.reverse(-573054520355290459L);
        var_java_lang_String_arr_a = new String[jw];
        var_java_lang_String_arr_b = new String[jx];
        NLoginCore_400.void_b();
        B = NLoginCore_400.c("㺀", (int)(jy & jz), (long)ka);
        var_java_util_Set_com_nickuc_login_NLoginCore_374__e = new HashSet<NLoginCore_400>();
    }

    public static void b(NLoginType_008 NLoginType_008) {
        NLoginCore_531[] NLoginCore_479Array = NLoginCore_531.values();
        int n = NLoginCore_479Array.length;
        for (int i = ha; i < n; ++i) {
            NLoginCore_531 NLoginCore_479 = NLoginCore_479Array[i];
            try {
                Class[] classArray = new Class[hb];
                classArray[NLoginCore_400.hc] = NLoginType_008.class;
                Constructor constructor = NLoginCore_531.java_lang_Class_a(NLoginCore_479).getConstructor(classArray);
                Object[] objectArray = new Object[hd];
                objectArray[NLoginCore_400.he] = NLoginType_008;
                constructor.newInstance(objectArray);
                continue;
            }
            catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                NLoginCore_370.c((String)NLoginCore_400.c("㺀", (int)hf, (long)(hg ^ hh)) + NLoginCore_479.getName() + (String)NLoginCore_400.c("㺃", (int)hi, (long)(hj ^ hk)), reflectiveOperationException, new Object[hl]);
            }
        }
    }

    protected void a(String string, String string2, @Nullable String string3, @Nullable UUID uUID, @Nullable UUID uUID2) {
        this.a(string, string2, string3, uUID, uUID2, null);
    }

    private static String a(int n, long l) {
        l ^= 0x34L;
        l ^= 0xA78A9E56721155AEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(51 + 18), (byte)(79 + 4), (byte)(14 + 33), (byte)(2 + 65), (byte)(30 + 36), (byte)(9 + 58), (byte)(24 + 23), (byte)(63 + 17), (byte)(48 + 27), (byte)(66 + 1), 83, (byte)(18 + 35), (byte)(11 + 69), (byte)(72 + 25), (byte)(26 + 74), (byte)(51 + 49), (byte)(80 + 25), (byte)(23 + 87), (byte)(74 + 29)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࢍ࢙ࢌࢪࢱࢩࢡࢪࢡࢯࢠࢮࢶࢌࢶ", (byte)23, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_400.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_400(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, boolean bl) {
        this.var_com_nickuc_login_NLoginType_008_m = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_479_a = NLoginCore_479;
        this.A = bl;
        var_java_util_Set_com_nickuc_login_NLoginCore_374__e.add(this);
    }

    protected void void_f(String string) {
        try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginCore_459_d.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_400.c("㺀", (int)var_int_b, (long)(var_long_d ^ var_long_e)) + string + (String)NLoginCore_400.c("㺃", (int)(f & g), (long)h), new Object[i]);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            if (resultSet.next()) {
                this.var_long_j = resultSet.getInt(var_int_j);
            }
        }
    }

    protected File java_io_File_b() {
        File file;
        if (this.var_com_nickuc_login_NLoginType_008_m.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d && (file = new File(this.var_com_nickuc_login_NLoginType_008_m.java_io_File_c().getParentFile(), NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a).toLowerCase(Locale.ENGLISH))).exists()) {
            return file;
        }
        return new File(this.var_com_nickuc_login_NLoginType_008_m.java_io_File_c().getParentFile(), NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a));
    }

    public void a(NLoginCore_494 NLoginInterface_0422, boolean bl) {
        Object object;
        int n;
        NLoginCore_055 NLoginCore_0552 = NLoginInterface_0422 instanceof NLoginCore_277 ? this.var_com_nickuc_login_NLoginType_008_m.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginInterface_0422).com_nickuc_login_NLoginCore_055_a() : NLoginCore_150.c();
        int n2 = n = NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c || NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_s ? eh : ei;
        if (var_java_lang_Thread_a != null) {
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, (String)(n != 0 ? NLoginCore_400.c("㺀", (int)ej, (long)ek) : NLoginCore_400.c("㺃", (int)el, (long)(em ^ en))), new Object[eo]);
            }
            return;
        }
        if (!this.isAvailable()) {
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, (String)(n != 0 ? NLoginCore_400.c("㺆", (int)ep, (long)(eq ^ er)) : NLoginCore_400.c("㺉", (int)(es & et), (long)eu)), new Object[ev]);
            }
            return;
        }
        if (NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a) != null && this.var_com_nickuc_login_NLoginCore_479_a != NLoginCore_531.var_com_nickuc_login_NLoginCore_479_f && this.var_com_nickuc_login_NLoginType_008_m.java_lang_Object_b().j(NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a))) {
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, n != 0 ? (String)NLoginCore_400.c("㺌", (int)ew, (long)(ex ^ ey)) + NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㺏", (int)ez, (long)(fa ^ fb)) : (String)NLoginCore_400.c("㺒", (int)fc, (long)(fd ^ fe)) + NLoginCore_531.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㺕", (int)(ff & fg), (long)fh), new Object[fi]);
            }
            return;
        }
        try {
            object = this.var_com_nickuc_login_NLoginType_008_m.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a();
            this.var_com_nickuc_login_NLoginCore_221_a = new NLoginCore_221((NLoginCore_459)object, fj);
        }
        catch (SQLException sQLException) {
            NLoginCore_370.c((String)NLoginCore_400.c("㺘", (int)fk, (long)(fl ^ fm)), sQLException, new Object[fn]);
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, (String)(n != 0 ? NLoginCore_400.c("㺛", (int)fo, (long)fp) : NLoginCore_400.c("㺞", (int)fq, (long)(fr ^ fs))), new Object[ft]);
            }
            return;
        }
        this.var_com_nickuc_login_NLoginCore_270_a = new NLoginCore_270();
        if (n != 0) {
            NLoginCore_370.c((String)NLoginCore_400.c("㺡", (int)fu, (long)(fv ^ fw)) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺤", (int)(fx & fy), (long)fz), new Object[ga]);
            NLoginCore_370.c((String)NLoginCore_400.c("㺧", (int)gb, (long)(gc ^ gd)), new Object[ge]);
        } else {
            NLoginCore_370.c((String)NLoginCore_400.c("㺪", (int)gf, (long)(gg ^ gh)) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺭", (int)gi, (long)gj), new Object[gk]);
            NLoginCore_370.c((String)NLoginCore_400.c("㺰", (int)gl, (long)(gm ^ gn)), new Object[go]);
        }
        var_java_lang_Thread_a = new Thread(() -> this.a(n != 0, NLoginInterface_0422), (String)NLoginCore_400.c("㺳", (int)gp, (long)gq) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺶", (int)gr, (long)(gs ^ gt)));
        var_java_lang_Thread_a.start();
        object = NLoginCore_400.c("㺹", (int)gu, (long)(gv ^ gw));
        this.var_com_nickuc_login_NLoginInterface_048_b = this.var_com_nickuc_login_NLoginType_008_m.b(gx != 0).a(() -> {
            if (var_java_lang_Thread_a != null && !var_java_lang_Thread_a.isInterrupted() && this.var_long_j != 0L) {
                double d = (double)this.var_long_l * hm / (double)this.var_long_j;
                Object[] objectArray = new Object[hp];
                objectArray[NLoginCore_400.hq] = NLoginCore_531.b(this.var_com_nickuc_login_NLoginCore_479_a);
                objectArray[NLoginCore_400.hr] = NLoginCore_531.c(this.var_com_nickuc_login_NLoginCore_479_a);
                objectArray[NLoginCore_400.hs] = NLoginCore_112.a(d, ht) + (char)hu;
                objectArray[NLoginCore_400.hv] = NLoginCore_112.a(this.var_long_l, this.var_long_j, hw, (String)NLoginCore_400.c("㺃", (int)hx, (long)hy));
                objectArray[NLoginCore_400.hz] = NLoginCore_112.d(this.var_long_l);
                this.g(String.format((String)NLoginCore_400.c("㺀", (int)hn, (long)ho), objectArray));
            }
        }, gy, gz);
        if (bl) {
            try {
                var_java_lang_Thread_a.join();
            }
            catch (InterruptedException interruptedException) {
                NLoginCore_370.a(interruptedException);
            }
        }
    }

    public static void J() {
        if (var_java_lang_Thread_a != null) {
            var_java_lang_Thread_a.interrupt();
        }
    }

    protected void a(String string, String string2, @Nullable String string3, @Nullable UUID uUID, @Nullable UUID uUID2, @Nullable Consumer<ForceRegisterConfig> consumer) {
        this.a(string, string2, string3, uUID, uUID2, ac != 0, consumer);
    }

    protected void a(String string, String string2, @Nullable String string3, @Nullable UUID uUID) {
        this.a(string, string2, string3, uUID, (Consumer<ForceRegisterConfig>)null);
    }

    private static void void_b() {
        int n;
        c = -6538854247434801109L;
        long l = c ^ 0xA78A9E56721155AEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(60 + 9), (byte)(65 + 18), (byte)(26 + 21), 67, (byte)(3 + 63), (byte)(66 + 1), (byte)(24 + 23), (byte)(43 + 37), (byte)(36 + 39), (byte)(43 + 24), (byte)(8 + 75), (byte)(13 + 40), (byte)(4 + 76), (byte)(16 + 81), (byte)(77 + 23), 100, (byte)(80 + 25), (byte)(106 + 4), (byte)(50 + 53)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
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
                    NLoginCore_400.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ѩҁҥҙ҈ҐҪҰҍҟҧҲҊѰҭҬҩҺ҇ҲқұѸҔҰҎҹѹҰӂғҟ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[1] = NLoginCore_110.C("Җ҅ҤѮѾѫҞҐҞ҈Ҭѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ĚėŀĩĸĢěċĭēĥġłĢĘĸĒřİİėŝŕţĳŝŏĦšŖŖĥŠľũşŤŲŬūŴņľĩįķŲŤĹĽŸŻŬŎľźœřƆĽŀŷſŹƄŸŶśžşƈŉŵƑŰƐŊŹƉŪƓŬƖƌƈŵřƄŴŻŦűƂŧơƢ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[3] = NLoginCore_384.E("ԜՀՓՁգՑԣԞ՗գԽԮ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[4] = NLoginCore_004.D("ҭѼҚҝѽҦҥҫѰҁҬѻ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[5] = NLoginCore_451.A("ċĿķħŅōŉČĳĵĲě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[6] = NLoginCore_559.B("ĤćĮĦĪĞľĐīģłĔőĤŋīŔĔĲŖŞļřıĝĳŗŁşňľŖĶŗŨĪŅśļųŪşŒĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[7] = NLoginCore_138.F("ԷԚՁԹԽԱՑԣԾԶՕԧդԷ՞ԾէԧՅթձՌմԮԴՀճչմընԽԼացՒՑլծւՄօ՝Վ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[8] = NLoginCore_384.E("ՒԱԛՓԜԱԱՃԞՇԨդըՊԸՖՃՎԽԩԳՄՌլԶԵՅԴԸմյջՙցշՒԼՓՄդՑֈցպքօ՘զ֌վՎևբւՙ՚", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[9] = NLoginCore_559.D("ѺҧҟҰґѾ҆ҞҦґҲѵґҍҖҗҺ҆ҴүҊҩҺҰҡҘҕҞҙ҈Ҁҁ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[10] = NLoginCore_027.F("ԸԬԫԹՙԱՠՕդՄ՜ՅՅԶԭ՗ՊՄ԰ՈՆղԹԺ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[11] = NLoginCore_092.F("ԮԽՙԳՓԸՀԹԿԠէԵՃՇզԿհԽէԨ՜ՌՊՍիԶՉ՚ԴԳչՕիատՍ՞ղՕՁէՕշՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[12] = NLoginCore_384.A("ĬĻċĦċŃŇĿŃĭŃēĲŔėĺŒĕŗŏŖľĞğŜļŃĻŧŀĵšŪŬĦťţŉŞţŭŬľĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ҞҀѼқҁѺѼҒҝҧ҉ҢҷҁѴңһѴҧҲѻҭҜѾ҄ѻҀӀ҂ӃӇҞҽҭҗҹҠҤҬӌҢҳҢӕӈҢҐӒҺӉқҿҩӏҦҧ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[14] = NLoginCore_138.B("ĵńŋĎŇĺŏČŌĥĎŏŋŊĺĶŘĘħŝĵŏŜĿĮōıĝşŧĺńŨŖŧōŧŁŤŴŪœŠĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[15] = NLoginCore_324.A("īĨġĘŌĲčđħŖĶě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[16] = NLoginCore_453.B("ĝŁŎŀįĤłŒġōŒŎĊĵĸŇŅĶŗŞīōīšĻřĲĻŢĤĹţŅņŮťŰšĨĩĴŪŤĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[17] = NLoginCore_453.A("ĝĚĊĽļīĉŔĴŖĞě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[18] = NLoginCore_324.E("Ԛԯ՜ԘԶԼԽԴՔըԠԮ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[19] = NLoginCore_387.C("Ѻ҂ҊҞҝҀҩҮү҃Ҥѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[20] = NLoginCore_223.E("ՑԴՐԜԚՠԲԥԵՀԵԣզ՘Թ՟Ղ԰ՋՒճբԹԺ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[21] = NLoginCore_027.D("ҡҤҀҫҫѹҪҮѮҧҰңҶҏүүҗұґҭѾҰҕѽӃҜҺҝҷҖҔҙҺҜҼҙӆҠҋҮҞҞӂҫҳҨҐҖҪҪҸҽҺҿӍӋҲҭӜӟҟӧҶӀ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[22] = NLoginCore_427.F("ԼԛՓ՜ԚՌԹԴՀԤՁԮ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[23] = NLoginCore_223.C("ҚҨҊѭѽҒҋҋҰҏҶѳ҃ҲҙҵҪғѸѶҐҫҖҝҤѾҲҖӄӅҫҜ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[24] = NLoginCore_223.B("ĺňĪčĝĲīīŐįŕĔŗĐėĳĥĬņŉŚŏŏŘŏŢŢňŦŗũĝŖśŞŬłĮŪűıŪıĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[25] = NLoginCore_091.F("ԟԝԵ՛ՀԼՄՏԤէ՗Ԯ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[26] = NLoginCore_223.C("ҟ҆ѾҁҎҜѱҮѼѰҴѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[27] = NLoginCore_223.E("ԚԾԺ՗ԹԾԼԿ՘Ո՛բԡԿխԻԺԫթ՝ըՏՃ՞ձըԲԵՙՅձ԰՝խմժղճՄյ՘ռՈօն՚տաչոի֐է՜ՙ՚", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[28] = NLoginCore_575.A("ĿęģďĝĥŁąĭŃŇŒŃĴŗŅįĔĕĽķĠţīĸŤļřĚŝřŨŇŁŤŠņīūĪĬŌĵĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[29] = NLoginCore_559.D("ҌѺҮҝҨҞҩҥҴѫҵѳҔҢҍҒҹҥ҇җӀҹҒҖҴ҄҃ҳҹѿҺӄҿӋҼӇҙӒ҈ҏӕҡӀқ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[30] = NLoginCore_091.D("ҋ҈ҁѸҬҒѭѱ҇ҶҖѻ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[31] = NLoginCore_223.A("ěŋĆļłĉőŏĨĳĖĶŐĺŖŖĤśŊĿğĩţŢťĥŦşţľġĺŅĶĸŬŘĨŞłŨİŤĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[32] = NLoginCore_453.B("ĝĚĊĽļīĉŔĴŖĞě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[33] = NLoginCore_027.D("ѧѼҩѥ҃҉Ҋҁҡҵѭѻ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[34] = NLoginCore_387.A("ĚĢĪľĽĠŉŎŏģńě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[35] = NLoginCore_223.B("ľġĽĉćōğĒĢĭĢĐœŅĦŌįĝĸĿŠŏĦħ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[36] = NLoginCore_223.D("ҡҤҀҫҫѹҪҮѮҧҲҁѯҬѸҳҝѽҌҟҰҚҜҢҝҜҶҶҞҦҡҟҤҼҭҾҠӂ҄ҦҨӋҴғҮҖҴӊҔҘҵӒӞӏӍқҟҵҿӢӄҵҦҡ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[37] = NLoginCore_201.F("ԼԛՓ՜ԚՌԹԴՀԤՁԮ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[38] = NLoginCore_446.E("ԶԘՀա՞Է՗ԶԦ՝գՖՉՁՖիԽ՛ձՠՄԼԹԺ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[39] = NLoginCore_004.C("җѹҖҊ҇҄үҳҠұүҥѲҦҫҐѮҭҶҐғ҉҆҇", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[40] = NLoginCore_384.D("ѣқҭ҅ҍҠҩҁѼґҬҘ҆ҫҋҲѶѽҌѿҩҿ҆҇", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[41] = NLoginCore_324.E("ՀՍԜԫԟԲ԰՞ԹԠԥԵՄ՟ԭՏՄգՀՐՇՔէ԰ձՁկյԶ՜ժՊԱՌչԽՌճֆՑռՈցևք՗ԿշտՌռ՛կճՐփ֍֋ոՌռզ֓ռծ֛֘ոռ՛ւպ֏֕դ֡յդե֍֧բ֠ֆ։֊ձ։ղֲֵֹ֖֭֮ո", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[42] = NLoginCore_091.D("҉ѽ҂Ҭ҃ұүҎѯҬҏҏѲҸҶҋҍҷ҈ҮҊҎҏқҷҚҔҴңҖҚҿҭҤҙҸҪҽҺӈҵҢӄӒӉҭӖҪӍӆҵӉҵӠӖӖәӑҝӧҦҹөҵҦҧӚӅҫӃӁӂӃӄӰӠӦӄҳӲӷӺҼӇӭӺӷӝҾӯӃӠӨԇӖӣ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[43] = NLoginCore_091.C("ѴҘҏ҉ѮңҒҩҫңѰѩҙҌқҪҪ҈ѼҫҵҊѼҼҽұҸҞӂҜҗҤҥҢҡӈҩҾҪҦӋӈӀӅҠҨӊґҎӝҹұӋӚҫҫҾҷӒһҤӑҽӟҤӍҮӗӥӱұҿӓҭӉҭӮӱӯӺӜӯӕӬӐӯӆӇ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[44] = NLoginCore_027.B("ĔĹņĺġĊĭıŋďķŐģĨĬŊĸŌĕĵĴŘĭĭġĹŞņňłķŕŧĶĤńşĹŮĪŝįŰŒĲůĵŶźŜŚƀũšŐřĿĻśœŀņŸƅšƊŗſŠŦňƐťőƌś", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[45] = NLoginCore_387.A("łĶĿĻĨĻċčĒŎĦĕĶĦōĳĘĕīĵĜŢŃĶĤĵġħňŃĺūŝŌĸŁňŞŏţĲŲĵĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[46] = NLoginCore_004.B("ĘŃĻōŋĝĤŏģŐĤėĥĪŖœĨľňđĞŋĵĕŏłķńŨňŅŖĴŖĹňŞŐĺĬŀŪĵĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[47] = NLoginCore_324.D("ѶҁҨҋѮҧ҅қҤ҄ҁҬҁҗ҅ҨґқҫҽҔҽҍҘҎҟӇҏҼҡҸӁ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[48] = NLoginCore_091.F("ԕԘՏԼՎԬԸԤԳԨՃՀԹՍ՝ՠթԽ՜բ԰ըՏձ՘՘ՍՔղԹՍհ՞ՊԿԽվՑՃճՅևզՙ՝ֈՈ՜հցր֍ցւՙ՚", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[49] = NLoginCore_091.F("ԭ՚ՒգՄԱԹՑՙՄեՆԷԷ՛Նըբ԰ՈմիՔԬէՙՙթջծսԺԺԸԺ՟՛ԼչՎՀՁսզ՝ջդսխհՋ֊ւլՙ՚", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[50] = NLoginCore_324.C("҃ѧѼҦѮѨѤѭѳҤҥҭ҂ҘҒҜҔҖѹҠѻѺҔҴҬ҃һ҅ҙӃҞҠӊҢҬһҝҬӅҍӄҾҦӗҳҴҪҘҸӎӋҷӀҵұҷҲӔүӧӒҦҶҵӫҶӞӫӠұӚҪӥӄӧӗӦҲӑӴҵӉӫӹӞӯӆӇ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[51] = NLoginCore_427.F("՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ՗ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։՘՚ն՝ո֙֒ձսդջ։֢֙֡ըտփ֪֭֩֋֔ռչպ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[52] = NLoginCore_446.C("ҬҟѼѬѺҭѺҮҜҳҥҮұ҅Қ҆ҴҪүҽѶѼҡѺҞҮҢҟҩҚҀңҗҷһӐҡҋҰӀӂӔґқ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[53] = NLoginCore_173.E("ՋԴԺԙՏՍՃ՘ԢԨՓԮ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[54] = NLoginCore_384.F("ԧՒՔՂԼՁԾԯԶԳգԳ՛ՁԣՇիՏիժՋՒմաՑՙՙղՔՌԼԾշԻԸնչՠՍհԿՖշՂրեծֆգՂՊՍՐ֒ՙ՚", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[55] = NLoginCore_223.D("ҡѶҧѭҙңҢҟѫҲѨҔѵҎѰҨҪҥѵҷ҉ҢҾҺҖҕҎҦҀ҆҉Ҧ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[56] = NLoginCore_453.D("ҭ҅ҙѾ҄ҭңҎүѲҬҧҗ҇үҭҖѹҜҐҺ҉҆҇", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[57] = NLoginCore_091.E("ԼԞ԰ՊԟԽՂԷՃՙԡԪԾխԦԺՋխթՎմլԯՍմ՘ե՚ՖՒ՛յԸղԸՎՌդՂբՃՇյՔբՌշ՛ւ՞ք՞։լՙ՚", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[58] = NLoginCore_559.A("ĚŇĠŀĩċĲĝĿįĲě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[59] = NLoginCore_027.B("ŅĺĉŎİŀĻŐľĮőōŏıœĲĭŎĐķĴĹĦħ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[60] = NLoginCore_453.E("՝Ց՜ՋԮԽՄ՜ՀԷԸՔ՟եիՏՈՁ՚դՊԯԱմՈ՗Ձղը՛ՒձԹպԹ՜ԻԽՑփւճՓժ՚նոռգֆցսՌղ֊լւ՗՗՚ը֖ժ֙յ֙ՠվ֞յ՞֥ֈոֈ֦֙֨֡֏ְֲ֢֪֫֜չպ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[61] = NLoginCore_324.B("ċĚģĺıĈĨďĠŐđġŁņřĚĤķĻĬīŌĬŢŕŞĥĽĦŇťŚĵūħŐűńųũŜŮũŐűŚŶŜŒŞŏŨŒſņŇ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[62] = NLoginCore_027.F("ԖՎՠԸՀՓ՜ԴԯՄՠՉԤ՞խՁԩլԫԻՓղԹԺ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[63] = NLoginCore_446.C("ҪҞҩҘѻҊґҩҍ҄҅ҡҬҲҸҜҕҎҧұҗѼѾӁҕҤҎҿҵҨҟҾ҆Ӈ҆ҩ҈ҊҞӐӏӀҠҷҧӃӅӉҰӓӎӊҙҿӗҹӏҤҤҧҵӣҷӦӂӦҭӋӫӂҫӲӕӅӕӳӦӵӮӜӽӯӸӷөӿӆӇ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[64] = NLoginCore_223.B("łČĽĆċĹŐĬĒĩĦě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[65] = NLoginCore_223.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[66] = NLoginCore_446.B("ČŉĺĆņĐĤĩļŕŔĠŀŇŇňŌįĞĮňŞļŞıŗĸĶŃŠŝŕĤŨňŚļņŬűŐŬŬĻ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[67] = NLoginCore_575.A("ĚŇĿŐıĞĦľņıŒčŎĐŐĚŖļŋıřěĬļġśŇŧŁŧĜĶŊģşĩŚńőĳľīŔĴŪĹĳŭŔŅŪĸŰļœŖŐşŖźųźŖŪŘŶŀŽƄƄƒŝŞƉőś", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[68] = NLoginCore_559.A("ĔĬĶĊĈĭĺŇĎĤŃĿķİħĲŐœřěĸĜŔĻŜšŇťľĦŋŀģĿŠŋŰĺŉļţİţůŨŃŷŷĺŦœŷŉſņŇ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[69] = NLoginCore_451.A("ģćĜņĎĈĄčēńŅōĢĸĲļĴĶęŀěĚĴŔŌģśĥĹţľŀŪłŌśĽŌťĭŤŞņŷœŔŊĸŘŮūŗŠŕőŗŒŴŏƇŲņŖŕƋŖžƋƀőźŊƅŤƇŷƆŒűƔŕũƋƙžƏŦŧ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[70] = NLoginCore_173.E("՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ՗ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։՘՚ն՝ո֙֒ձսդջ։֢֙֡ըտփ֪֭֩֋֔ռչպ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[71] = NLoginCore_173.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[72] = NLoginCore_027.C("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵ҄ӈҨҺҜҦӌӑҰӌӌқ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[73] = NLoginCore_384.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ՗դՆՑԾէՇսՌՆրէ՘սՋփՏզթգղթ֍ֆ֍թսի։Փ֐֥֗֗հձ֜դծ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[74] = NLoginCore_027.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԪՍձՔԷՁխծԶՙս", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[75] = NLoginCore_446.F("ԟ՜ՍԙՙԣԷԼՏըէԳՓ՚՚՛՟ՂԱՁ՛ձՏձՄժՋՉՖճհըԷջ՛խՏՙտքգտտՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[76] = NLoginCore_201.C("ѺҧҟҰґѾ҆ҞҦґҲѭҮѰҰѺҶҜҫґҹѻҌҜҁһҧӇҡӇѼҖҪ҃ҿ҉ҺҤұғҞҋҴҔӊҙғӍҴҥӊҘӐҜҳҶҰҿҶӚӓӚҶӊҸӖҠӝӤӤӲҽҾөұһ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[77] = NLoginCore_453.F("ԼԝԝՊՙՁԟԲԯ՘Ց՞ԢԿլաՊծբ԰դղԹԺ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[78] = NLoginCore_201.D("ҪѪҌҞ҇ѹѺ҅ҵ҈ү҂Ҥҡ҂ҰҖҖҳҭҪү҆҇", (byte)42, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_400.var_java_lang_String_arr_b[0] = NLoginCore_387.F("ԜԴ՘ՌԻՃ՝գՀՒ՚եԽԣՠ՟՜խԺեՎբճԳզը԰ԸջոխԷԼռպՌշծղ՗՜՝թՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ѫҕѦ҃ѽҫ҉ҴҞ҈Ҩѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[2] = NLoginCore_004.F("ԭԪՓԼՋԵԮԞՀԦԸԴՕԵԫՋԥլՃՃԪհընՆհբԹմթթԸճՑռղշօտվևՙՑԼՂՊօշՌՐ֋֎տաՑ֍զլ֙ՐՓ֊֒֌֗֋։ծ֑ղ֛՜ֈ֤փ֣՝֌֜ս֦տ֛֩֟ֆսֳֵ֧֮ֆ֙ռֶ֫", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[3] = NLoginCore_575.A("ęĭĀĜŌĊļĎĵŏĳŀŏŃņĤŖŘļıĖŏĦħ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[4] = NLoginCore_201.F("Տԫԓ՝՝Դ՛ԢԥթՓԮ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[5] = NLoginCore_201.E("՝ՕՖԼԵՅՆԝԞ՛ԤԮ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[6] = NLoginCore_324.F("ԷԚՁԹԽԱՑԣԾԶՕԧդԷ՞ԾէԧՅթձՏլՄ԰ՆժՔղ՛ՑթէկՍՙմՠցֆջչթՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[7] = NLoginCore_453.A("ĤćĮĦĪĞľĐīģłĔőĤŋīŔĔĲŖŞĹšěġĭŠŦšŕţĪļŦħťŘĻňİīŀľĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[8] = NLoginCore_004.C("ҟѾѨҠѩѾѾҐѫҔѵұҵҗ҅ңҐқҊѶҀґҙҹ҃҂Ғҁ҅ӁӂӈҦӎӄҟ҉ҠґұҞӕӌүҫҸңӔӎҷҹӉӏҩҦҧ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[9] = NLoginCore_138.E("ԭ՚ՒգՄԱԹՑՙՄեԨՄՀՉՊխԹէբԽՒՏՆհՙ՚ՍԵՅԷո", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[10] = NLoginCore_027.F("ԸԬԫԹՙԱՠՕդՄ՜ԼՂԴԽՉՍԼՋ԰կղԹԺ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[11] = NLoginCore_173.D("ѻҊҦҀҠ҅ҍ҆ҌѭҴ҂ҐҔҳҌҽҊҴѵҩҙҗҚҸ҃ҖҧҁҀӆҢҾ҆ӅӅҿӇҩһӃӀҢқ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[12] = NLoginCore_027.C("Ҍқѫ҆ѫңҧҟңҍңѳҒҴѷҚҲѵҷүҶҞѾѿҼҜңқӇҠҕӁ҅ҹҬӏҺүӄӍҬҲӀҒҴӐҭҙҗҧҨӎҳӟҦҧ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[13] = NLoginCore_453.D("ҞҀѼқҁѺѼҒҝҧ҉ҢҷҁѴңһѴҧҲѻҭҜѾ҄ѻҀӀ҂ӃӇҞҽҭҗҹҠҤҬӌҢҳҤҡҭӆӕҪӉӝӈҪҲӟҦҧ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[14] = NLoginCore_138.B("ĵńŋĎŇĺŏČŌĥĎŏŋŊĺĶŘĘħŝĵŏŜĿĮōıĝşŧĺńřņŭŉİťňľţŤŰķŔźŒŜŜŬņŭşŉņŇ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[15] = NLoginCore_559.E("ԯԙԠՎԱԭԛԯ՘԰ԨԮ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[16] = NLoginCore_324.F("԰ՔաՓՂԷՕեԴՠեաԝՈՋ՚՘ՉժձԾՠԾմՎլՅՎյԷՌնս՞ՀտՋՃՁՓ՞պշՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[17] = NLoginCore_092.C("ѺҁҏҧҐүҍҦѫ҃ѱѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[18] = NLoginCore_559.B("ĂĭĊŃĬııđŒōňě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[19] = NLoginCore_446.B("ŁĹĦĢŇĐĻĩĭŎňě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[20] = NLoginCore_138.B("ľġĽĉćōğĒĢĭĤčďńőŅĪĚĮŕĶşĦħ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[21] = NLoginCore_559.D("ҡҤҀҫҫѹҪҮѮҧҰңҶҏүүҗұґҭѾҰҕѽӃҜҺҝҷҖҔҙҺҜҼҙӆҠҋҮҞҞӂҫҳҨҐҖҪҪҸҽҺӁӣҚҲҞҹӧӒҺҷҧ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[22] = NLoginCore_384.D("ѪҡѭҤ҄ҎѨґҀѾѱҎѷ҃ҬҌґҬҐҞҊү҆҇", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[23] = NLoginCore_446.A("ĺňĪčĝĲīīŐįŖēģŒĹŕŊĳĘĖİľĿĳĢŅĜŏłũĶŀŌľŁŮŉŞļũįĬĭĻ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[24] = NLoginCore_575.F("Ս՛ԽԠ԰ՅԾԾգՂըԧժԣԪՆԸԿՙ՜խբբիբյյ՛չժռ԰՛ժԿ՛նՔ՜՜չթջՎ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[25] = NLoginCore_451.D("ѦѷѫҰҭ҄ҦѳҴҌҎѻ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[26] = NLoginCore_427.B("ĝķĭċčĦċľňĳĶě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[27] = NLoginCore_559.F("ԚԾԺ՗ԹԾԼԿ՘Ո՛բԡԿխԻԺԫթ՝ըՏՃ՞ձըԲԵՙՅձ԰՝խմժղճՄյ՘ռՉյՂզեօ՜ջժ֑և՜֒ւճց֕֔ոշ֘ջ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[28] = NLoginCore_384.A("ĿęģďĝĥŁąĭŃŇŒŃĴŗŅįĔĕĽķĠţīĸŤļřĚŝřŨĴŦħĮššůţņŢŁĲŮťůŴŚŅňũźſņŇ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[29] = NLoginCore_387.C("ҌѺҮҝҨҞҩҥҴѫҵѳҔҢҍҒҹҥ҇җӀҹҒҖҴ҄҃ҳҹѿҺӄҸ҆҆һ҆҉ҟҝҔӈҞқ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[30] = NLoginCore_091.F("՟ԽՔգԚբԷՓգՠԨԮ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[31] = NLoginCore_027.C("ѻҫѦҜҢѩұү҈ғѶҖҰҚҶҶ҄һҪҟѿ҉ӃӂӅ҅ӆҿӃҞҁҚ҂ҦҎӎӎҌҿӏӈҴҍқ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[32] = NLoginCore_091.D("ҠѣѦѩѻҧ҅ҪѰҴҤѻ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[33] = NLoginCore_138.C("҇ҀѮѷҀҭҚғҭҌѾѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[34] = NLoginCore_384.A("ġńĖĭĩĦŇĭĎċňě", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[35] = NLoginCore_201.E("ՑԴՐԜԚՠԲԥԵՀԷՆՊաԧՍՐԬՒբծբԹԺ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[36] = NLoginCore_451.E("Ք՗Գ՞՞Ԭ՝աԡ՚եԴԢ՟ԫզՐ԰ԿՒգՍՏՕՐՏթթՑՙՔՒ՗կՠձՓյԷՙ՛վէՆաՉէսՇՋըօ֑ֆ՝Ոըբ։։֋չ֑֚", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[37] = NLoginCore_091.C("ҊѾҩҘҡҞ҈ҁ҂ѫҬѻ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[38] = NLoginCore_201.E("ԶԘՀա՞Է՗ԶԦ՝ե՞ԾԬծ՞ալխԮԲՀեզնախԹՃՔՈժ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[39] = NLoginCore_575.E("ՊԬՉԽԺԷբզՓդբՋԼ՗թՋբԢձՈՑՁՅՌԲծԲշ՚զթՖ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[40] = NLoginCore_427.A("ăĻōĥĭŀŉġĜıŎĠŕĮĺĔĨĹŖőŐŏĦħ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[41] = NLoginCore_027.B("ĭĺĉĘČğĝŋĦčĒĢıŌĚļıŐĭĽĴŁŔĝŞĮŜŢģŉŗķĞĹŦĪĹŠųľũĵŮŴűńĬŤŬĹũňŜŠĽŰźŸťĹũœƀũśƅƈťũňůŧżƂőƎŢőŒźƔŏƍųŶųƁšƄƆƞƗƨſƟƆ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[42] = NLoginCore_324.A("ĩĝĢŌģőŏĮďŌįįĒŘŖīĭŗĨŎĪĮįĻŗĺĴŔŃĶĺşōńĹŘŊŝŚŨŕłŤŲũōŶŊŭŦŕũŕƀŶŶŹűĽƇņřƉŕņŇźťŋţšŢţŤƐƀƆŤœƒƗƚŜŧƍƛƙƑŤžƒţŨŢƩƕ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[43] = NLoginCore_384.C("ѴҘҏ҉ѮңҒҩҫңѰѩҙҌқҪҪ҈ѼҫҵҊѼҼҽұҸҞӂҜҗҤҥҢҡӈҩҾҪҦӋӈӀӅҠҨӊґҎӝҹұӋӚҫҫҾҷӒһҤӑҽӟҤӍҮӗӥӱұҿӓҭӈӐӉӄӑӫӵӨӷөӾӉӆӇ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[44] = NLoginCore_451.E("ԧՌՙՍԴԝՀՄ՞ԢՊգԶԻԿ՝Ջ՟ԨՈՇիՀՀԴՌձՙ՛ՕՊըպՉԷ՗ղՌցԽհՂփեՅւՈ։֍կխ֓ռմգլՒՎծզՓՙ֋֘և֏֠ն֔ց֣ճ֒ջդծ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[45] = NLoginCore_027.F("ՕՉՒՎԻՎԞԠԥաԹԨՉԹՠՆԫԨԾՈԯյՖՉԷՈԴԺ՛ՖՍվռսԹւԵօրԸՔՔեչեչէլՇաի՝֔՜ՙ՚", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[46] = NLoginCore_384.B("ĘŃĻōŋĝĤŏģŐĤėĥĪŖœĨľňđĞŋĵĕŏłķńŨňŅŖľŠŘįħŰŧűŅŭŃıůŌŷňŇŅŉũĺřņŇ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[47] = NLoginCore_091.A("ĖġňīĎŇĥĻńĤġŌġķĥňıĻŋŝĴŐİŐĸŝĥŨĨţņš", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[48] = NLoginCore_387.F("ԕԘՏԼՎԬԸԤԳԨՃՀԹՍ՝ՠթԽ՜բ԰ըՏձ՘՘ՍՔղԹՍհ՞ՊԿԽվՑՃճՅևեա֋֊ց։Վե։տՉՔՑկՎ֔հօՍՕսի", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[49] = NLoginCore_110.A("ĚŇĿŐıĞĦľņıŒĳĤĤňĳŕŏĝĵšŘŁęŔņņŖŨśŪħħĥħŌňĩŦĻĭĮūŔŕŮŪńŕőőůžſņŇ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[50] = NLoginCore_384.C("҃ѧѼҦѮѨѤѭѳҤҥҭ҂ҘҒҜҔҖѹҠѻѺҔҴҬ҃һ҅ҙӃҞҠӊҢҬһҝҬӅҍӄҾҦӗҳҴҪҘҸӎӋҷӀҵұҷҲӔүӧӒҦҶҵӫҶӞӫӠұӚҪӥӄӤҩәӐҳҶӻһӪҸҿӿӆӇ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[51] = NLoginCore_451.E("՛ԙ՚ԚԺԞՃՎեաԵԨ՚ՋՙՊԨձՀդՋղԵԶ՗ՋՅժոկՇՙՑՈՓռբՌՍէՏՐ՞ոիֈՉՇդւփռզըդթ֑֔֘ժճ։՘՚ն՝ո֙֒ձսդջ։֚յս֋֟զպ֚֊ծ֍֒յ֤ձփ֌պֲִ֛֗", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[52] = NLoginCore_110.E("՟ՒԯԟԭՠԭաՏզ՘ադԸՍԹէ՝բհԩԯՔԭՑաՕՒ՜ՍԳՖի՝Ի՟՞ՄՏՀ՘ո՘՞ՠջ՝նՇՂֆէցւՙ՚", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[53] = NLoginCore_559.B("ĜĪęğČńĈōņĔĢě", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[54] = NLoginCore_201.B("ĔĿŁįĩĮīĜģĠŐĠňĮĐĴŘļŘŗĸĿšŎľņņşŁĹĩīŤĨĥţŦōĺŝĬŃŦĳŭŌĺŴŅŊŎĿĸĸžŌŘŽŖųŖŉŇŁ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[55] = NLoginCore_091.C("ҡѶҧѭҙңҢҟѫҲѨҔѵҎѰҨҪҥѵҷ҉ҟҗҢҖѽҲҷқ҉қҖ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[56] = NLoginCore_324.C("ҭ҅ҙѾ҄ҭңҎүѲҬҘҁҎғ҃҈Ҝҭҽҋҿ҆҇", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[57] = NLoginCore_559.C("҉ѫѽҗѬҊҏ҄ҐҦѮѷҋҺѳ҇ҘҺҶқӁҹѼҚӁҥҲҧңҟҨӂ҅ҿ҅қҙұҏүҐҔӀӖӋҩҹҘӖӊӘӏӊҠӔӘҿҹҤӕҾӧӟӖ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[58] = NLoginCore_446.E("ԜԻՔԾԯԝաԳէԳԴթՋ՞ՙ՚ԥթբՎճՌԹԺ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[59] = NLoginCore_091.A("ŅĺĉŎİŀĻŐľĮŒİĐłĩŇĺŗėĿŊĩĦħ", (byte)42, 65);
                    NLoginCore_400.var_java_lang_String_arr_b[60] = NLoginCore_575.B("ŊľŉĸěĪıŉĭĤĥŁŌŒŘļĵĮŇőķĜĞšĵńĮşŕňĿŞĦŧĦŉĨĪľŰůŠŀŗŇţťũŐųŮŪĹşŷřůńńŇŕƃŗƆŢƆōūƋŢŋƒŵťųŸŪŨƛƐƓŹŽųųŷŭŞŭťůƕƤŴƔƬ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[61] = NLoginCore_384.F("ԞԭԶՍՄԛԻԢԳգԤԴՔՙլԭԷՊՎԿԾ՟ԿյըձԸՐԹ՚ոխՈվԺգք՗ֆռկցջՆտ֋րՉՠ֎ւրֆլՙ՚", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[62] = NLoginCore_223.D("ѣқҭ҅ҍҠҩҁѼґҭҲѴѰҚѳҤҍ҉ѷѷ҉҆҇", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[63] = NLoginCore_091.B("ŊľŉĸěĪıŉĭĤĥŁŌŒŘļĵĮŇőķĜĞšĵńĮşŕňĿŞĦŧĦŉĨĪľŰůŠŀŗŇţťũŐųŮŪĹşŷřůńńŇŕƃŗƆŢƆōūƋŢŋƒŵťŵŖŗřƔŭƔŜŨŻśŽƐƀŮƎŻƈŵƉƆƉ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[64] = NLoginCore_223.F("ՌԨԻՍԮաԵԮգ԰ՓԮ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[65] = NLoginCore_201.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլյԿՑշհՖբՕձՕԷ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[66] = NLoginCore_446.D("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵӀ҄҇Ӑ҆ҹҫӀҝӔӀқ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[67] = NLoginCore_384.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ՗դՆՑԾէՇսՌՆրէ՘սՋփՏզթգղթ֍ֆ֍թսՕսհ՝մ֝ձք֛֟֟ծ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[68] = NLoginCore_110.D("ѴҌҖѪѨҍҚҧѮ҄ңҟҗҐ҇ҒҰҳҹѻҘѼҴқҼӁҧӅҞ҆ҫҠ҃ҟӀҫӐҚҩҜӃҐӁӑӊәҬҷӏҗӞҶҒӑӊӏһӦӔҟӚӈөӘ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[69] = NLoginCore_559.F("ԶԚԯՙԡԛԗԠԦ՗՘ՠԵՋՅՏՇՉԬՓԮԭՇէ՟ԶծԸՌնՑՓսՕ՟ծՐ՟ոՀշձՙ֊զէ՝Ջիցվժճըդժեևբ֚օՙթը֞թ֑֞֓դ֍՝֘շ֗ժ֪ս֋֚֮֨հժֲ֜չպ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[70] = NLoginCore_004.D("ҨѦҧѧ҇ѫҐқҲҮ҂ѵҧҘҦҗѵҾҍұҘҿ҂҃ҤҘҒҷӅҼҔҦҞҕҠӉүҙҚҴҜҝҫӅҸӕҖҔұӏӐӉҳҵұҶӡӞӥҷӀӖҥҧӃҪӅӦӟҾӊұӈӖӥӴӓӄӃӯҴӴӫӕӏӶӷԄӶӭҾәӶӶԂӬ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[71] = NLoginCore_453.B("ĚŇĿŐıĞĦľņıŒčŎĐŐĚŖļŋıřġŎœķĳĮŤĲņġœ", (byte)42, 66);
                    NLoginCore_400.var_java_lang_String_arr_b[72] = NLoginCore_451.E("ԟ՜ՍԙՙԣԷԼՏըէԳՓ՚՚՛՟ՂԱՁ՛ձՏձՄժՋՉՖճհը՛Ջ՘՗ԵղՕՀջմՑՎ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[73] = NLoginCore_076.C("ѺҧҟҰґѾ҆ҞҦґҲѭҮѰҰѺҶҜҫґҹѻҌҜҁһҧӇҡӇѼҖҪ҃ҿ҉ҺҤұғҞҋҴҔӊҙғӍҴҥӊҘӐҜҳҶҰҿҶӚӓӚҶӊӤӂӯүүӌӜӌӄӔӎһ", (byte)42, 67);
                    NLoginCore_400.var_java_lang_String_arr_b[74] = NLoginCore_384.E("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԭՊգԵթՅզՈՍՒԺ", (byte)42, 69);
                    NLoginCore_400.var_java_lang_String_arr_b[75] = NLoginCore_384.D("ѬҩҚѦҦѰ҄҉ҜҵҴҀҠҧҧҨҬҏѾҎҨҾҜҾґҷҘҖңӀҽҵ҇ӅӅҝӄңҚҒҨҔҞқ", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[76] = NLoginCore_138.F("ԭ՚ՒգՄԱԹՑՙՄեԠաԣգԭթՏ՞ՄլԮԿՏԴծ՚պՔպԯՉ՝ԶղԼխ՗դՆՑԾէՇսՌՆրէ՘սՋփՏզթգղթ֍ֆ֍թսէնց֘կւ՞֦֔ն֛ծ", (byte)42, 70);
                    NLoginCore_400.var_java_lang_String_arr_b[77] = NLoginCore_201.D("҉ѪѪҗҦҎѬѿѼҥҖѱҙҗѸҵҌѷҍ҉Ҹ҉҆҇", (byte)42, 68);
                    NLoginCore_400.var_java_lang_String_arr_b[78] = NLoginCore_173.E("՝ԝԿՑԺԬԭԸըԻՠԸԿԤ՟Ռԫ՝՟ԩէբԹԺ", (byte)42, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_400.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ħģġĹŊĽĢīōŃŐě", (byte)42, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_400.var_java_lang_String_arr_b[0] = NLoginCore_076.E("Ք՘ՑԫԜԴԢԳԦգՂ՘՛ՕԸՇԩԢՋ՝զԼԹԺ", (byte)42, 69);
                }
            }
        }
    }

    public NLoginCore_400(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479) {
        this(NLoginType_008, NLoginCore_479, var_int_a != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private /* synthetic */ void a(boolean bl, NLoginCore_494 NLoginInterface_0422) {
        try {
            block21: {
                NLoginCore_519.a(this.var_com_nickuc_login_NLoginType_008_m, null, bl);
                this.b(NLoginInterface_0422);
                if (this.var_com_nickuc_login_NLoginCore_459_d == null) break block21;
                try {
                    this.var_com_nickuc_login_NLoginCore_459_d.void_c();
                }
                catch (SQLException sQLException) {
                    NLoginCore_370.c((String)NLoginCore_400.c("㺀", (int)(ia & ib), (long)ic) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺃", (int)id, (long)(ie ^ cfr_renamed_0)), sQLException, new Object[ig]);
                }
            }
            if (this.var_com_nickuc_login_NLoginCore_221_a != null) {
                try {
                    this.var_com_nickuc_login_NLoginCore_221_a.void_c();
                }
                catch (SQLException sQLException) {
                    NLoginCore_370.c((String)NLoginCore_400.c("㺆", (int)ih, (long)(ii ^ ij)), sQLException, new Object[ik]);
                }
            }
            var_java_lang_Thread_a = null;
            this.var_com_nickuc_login_NLoginInterface_048_b.Z();
        }
        catch (Exception exception) {
                block22: {
                    try {
                        NLoginCore_370.c((String)NLoginCore_400.c("㺉", (int)il, (long)(im ^ in)) + this.var_com_nickuc_login_NLoginCore_479_a.getName(), exception, new Object[io]);
                        if (NLoginInterface_0422 != null) {
                            NLoginCore_150.a(NLoginInterface_0422, (String)(bl ? NLoginCore_400.c("㺌", (int)ip, (long)(iq ^ ir)) : NLoginCore_400.c("㺏", (int)is, (long)(it ^ iu))), new Object[iv]);
                        }
                        if (this.var_com_nickuc_login_NLoginCore_459_d == null) break block22;
                    }
                    catch (Throwable throwable) {
                        if (this.var_com_nickuc_login_NLoginCore_459_d != null) {
                            try {
                                this.var_com_nickuc_login_NLoginCore_459_d.void_c();
                            }
                            catch (SQLException sQLException) {
                                NLoginCore_370.c((String)NLoginCore_400.c("㺛", (int)jh, (long)ji) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺞", (int)(jj & jk), (long)jl), sQLException, new Object[jm]);
                            }
                        }
                        if (this.var_com_nickuc_login_NLoginCore_221_a != null) {
                            try {
                                this.var_com_nickuc_login_NLoginCore_221_a.void_c();
                            }
                            catch (SQLException sQLException) {
                                NLoginCore_370.c((String)NLoginCore_400.c("㺡", (int)jn, (long)(jo ^ jp)), sQLException, new Object[jq]);
                            }
                        }
                        var_java_lang_Thread_a = null;
                        this.var_com_nickuc_login_NLoginInterface_048_b.Z();
                        throw throwable;
                    }
                    try {
                        this.var_com_nickuc_login_NLoginCore_459_d.void_c();
                    }
                    catch (SQLException sQLException) {
                        NLoginCore_370.c((String)NLoginCore_400.c("㺒", (int)iw, (long)(ix ^ iy)) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺕", (int)iz, (long)(ja ^ jb)), sQLException, new Object[jc]);
                    }
                }
                if (this.var_com_nickuc_login_NLoginCore_221_a != null) {
                    try {
                        this.var_com_nickuc_login_NLoginCore_221_a.void_c();
                    }
                    catch (SQLException sQLException) {
                        NLoginCore_370.c((String)NLoginCore_400.c("㺘", (int)jd, (long)(je ^ jf)), sQLException, new Object[jg]);
                    }
                }
                var_java_lang_Thread_a = null;
                this.var_com_nickuc_login_NLoginInterface_048_b.Z();
        }
    }

    private void a(String string, String string2, @Nullable String string3, @Nullable UUID uUID, @Nullable UUID uUID2, boolean bl, @Nullable Consumer<ForceRegisterConfig> consumer) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_400.c("㺀", (int)ad, (long)(ae ^ af)));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_400.c("㺃", (int)ag, (long)(ah ^ ai)));
        }
        if (!bl && consumer == null && (string2 == null || string2.isEmpty())) {
            throw new IllegalArgumentException((String)NLoginCore_400.c("㺆", (int)aj, (long)(ak ^ al)));
        }
        NLoginCore_291 NLoginCore_2912 = this.var_com_nickuc_login_NLoginType_008_m.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(string, uUID2, null, bl);
        if (ForceRegisterConfig2 == null) {
            throw new RuntimeException((String)NLoginCore_400.c("㺉", (int)am, (long)(an ^ ao)) + string + (String)NLoginCore_400.c("㺌", (int)ap, (long)(aq ^ ar)));
        }
        if (!ForceRegisterConfig2.boolean_h()) {
            if (ForceRegisterConfig2.java_util_UUID_a() == null) {
                if (uUID == null) {
                    uUID = NLoginCore_432.d(string);
                }
                ForceRegisterConfig2.a(uUID);
            }
            ForceRegisterConfig2.a(string, string2, null, string3, (string2 != null && !NLoginCore_531.boolean_a(this.var_com_nickuc_login_NLoginCore_479_a) ? as : at) != 0);
            if (uUID2 != null) {
                ForceRegisterConfig2.b(uUID2);
            } else if (bl) {
                ForceRegisterConfig2.void_z();
            } else {
                ForceRegisterConfig2.void_x();
            }
            if (consumer != null) {
                consumer.accept(ForceRegisterConfig2);
            }
            if (NLoginCore_2912.a((NLoginCore_459)this.var_com_nickuc_login_NLoginCore_221_a, ForceRegisterConfig2, new NLoginCore_436[au])) {
                ++this.var_long_k;
            }
        }
    }

    private void g(String string) {
        if (NLoginCore_532.aj.ar()) {
            NLoginCore_187 NLoginCore_1872 = this.var_com_nickuc_login_NLoginType_008_m.com_nickuc_login_NLoginCore_187_a();
            this.var_com_nickuc_login_NLoginType_008_m.java_lang_Object_b().c().stream().filter(NLoginCore_277 -> (NLoginCore_1872.boolean_b((NLoginCore_277)NLoginCore_277) && NLoginCore_277.i((String)NLoginCore_400.c("㺀", (int)(jr & js), (long)jt)) ? ju : jv) != 0).forEach(NLoginCore_277 -> NLoginCore_277.o(string));
        }
    }

    protected abstract void b(NLoginCore_494 var1);

    protected void c(NLoginCore_494 NLoginInterface_0422) {
        String string = NLoginCore_112.d(this.var_long_k);
        String string2 = this.var_com_nickuc_login_NLoginCore_270_a.aq();
        if (NLoginCore_150.j()) {
            NLoginCore_370.e((String)NLoginCore_400.c("㺀", (int)av, (long)aw) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺃", (int)(ax & ay), (long)az), new Object[ba]);
            NLoginCore_370.e((String)(this.var_long_k == 0L ? NLoginCore_400.c("㺆", (int)bb, (long)(bc ^ bd)) : (this.var_long_k == 1L ? NLoginCore_400.c("㺉", (int)be, (long)(bf ^ bg)) : (String)NLoginCore_400.c("㺌", (int)bh, (long)(bi ^ bj)) + string + (String)NLoginCore_400.c("㺏", (int)bk, (long)bl))) + (String)NLoginCore_400.c("㺒", (int)bm, (long)bn) + string2 + (String)NLoginCore_400.c("㺕", (int)bo, (long)(bp ^ bq)), new Object[br]);
            this.g((String)NLoginCore_400.c("㺘", (int)(bs & bt), (long)bu) + NLoginCore_531.b(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㺛", (int)bv, (long)(bw ^ bx)) + NLoginCore_531.c(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㺞", (int)by, (long)bz) + string + (String)NLoginCore_400.c("㺡", (int)ca, (long)(cb ^ cc)) + (String)(this.var_long_k == 1L ? NLoginCore_400.c("㺤", (int)cd, (long)ce) : NLoginCore_400.c("㺧", (int)cf, (long)(cg ^ ch))) + (String)NLoginCore_400.c("㺪", (int)ci, (long)cj));
        } else {
            NLoginCore_370.e((String)NLoginCore_400.c("㺭", (int)(ck & cl), (long)cm) + this.var_com_nickuc_login_NLoginCore_479_a.getName() + (String)NLoginCore_400.c("㺰", (int)cn, (long)co), new Object[cp]);
            NLoginCore_370.e((String)(this.var_long_k == 0L ? NLoginCore_400.c("㺳", (int)cq, (long)(cr ^ cs)) : (this.var_long_k == 1L ? NLoginCore_400.c("㺶", (int)(ct & cu), (long)cv) : (String)NLoginCore_400.c("㺹", (int)(cw & cx), (long)cy) + string + (String)NLoginCore_400.c("㺼", (int)cz, (long)(da ^ db)))) + (String)NLoginCore_400.c("㺿", (int)dc, (long)(dd ^ de)) + string2 + (String)NLoginCore_400.c("㻂", (int)(df & dg), (long)dh), new Object[di]);
            this.g((String)NLoginCore_400.c("㻅", (int)dj, (long)(dk ^ dl)) + NLoginCore_531.b(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㻈", (int)dm, (long)(dn ^ cfr_renamed_1)) + NLoginCore_531.c(this.var_com_nickuc_login_NLoginCore_479_a) + (String)NLoginCore_400.c("㻋", (int)dp, (long)(dq ^ dr)) + string + (String)NLoginCore_400.c("㻎", (int)ds, (long)(dt ^ du)) + (String)(this.var_long_k == 1L ? NLoginCore_400.c("㻑", (int)dv, (long)(dw ^ dx)) : NLoginCore_400.c("㻔", (int)dy, (long)(dz ^ ea))) + (String)NLoginCore_400.c("㻗", (int)eb, (long)(ec ^ ed)));
        }
    }

    static /* synthetic */ Set c() {
        return var_java_util_Set_com_nickuc_login_NLoginCore_374__e;
    }

    protected void a(String string, String string2, @Nullable String string3, @Nullable UUID uUID, @Nullable Consumer<ForceRegisterConfig> consumer) {
        this.a(string, string2, string3, uUID, null, ab != 0, consumer);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_400.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("ҋҭүҏҳӒӊӠӌқәӏӝӗҠӅӧӦӞӤӞҳ", (byte)58, 68), NLoginCore_400.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.A("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲҭҹҬӊӑӉӁӊӁӏӀӎӖҬӖō", (byte)58, 65) + string + NLoginCore_076.E("԰", (byte)58, 69) + methodType.toString(), exception);
        }
    }

    public void d(NLoginCore_494 NLoginInterface_0422) {
        this.a(NLoginInterface_0422, eg != 0);
    }

    public boolean isAvailable() {
        return (this.var_com_nickuc_login_NLoginCore_479_a.H() || this.java_io_File_b().exists() ? ee : ef) != 0;
    }
}

