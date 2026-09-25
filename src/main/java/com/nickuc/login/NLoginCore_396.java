/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_204;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
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
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_396
extends NLoginCore_353 {
    private static int db;
    private static long ad;
    private static long ew;
    private static int cs;
    private static int cf;
    private static long de;
    private static float dz;
    private static int bv;
    private static int dd;
    private static long av;
    private static int at;
    private static long bt;
    private static long cp;
    private static int dn;
    private static long du;
    private static long da;
    private static long ef;
    private static long fp;
    private static int di;
    private static long cj;
    private static int d;
    private static long fe;
    private static long cg;
    private static int bm;
    private static int cr;
    private static int dl;
    private static int fz;
    private static int fs;
    private final AtomicBoolean var_java_util_concurrent_atomic_AtomicBoolean_b = new AtomicBoolean(l != 0);
    private static int fb;
    private static long cl;
    private static long ek;
    private static int dw;
    private static long bf;
    private static long cw;
    private static int i;
    private static long e;
    private static int ab;
    private static long cc;
    private static long h;
    private static long cd;
    private static int ak;
    private static long ct;
    private static long bb;
    private static int z;
    private static int fw;
    private static long ds;
    private static int am;
    private static long cq;
    private static int bq;
    private static int y;
    private static int an;
    private static int fj;
    private static long p;
    private static int bj;
    private static int eh;
    private static long aa;
    private static long fr;
    private static int af;
    private static int ee;
    private static int bi;
    private static int fx;
    private static int ej;
    private static float ea;
    private static float dj;
    private static long fv;
    private static int ck;
    private static int j;
    private static int k;
    private static int ci;
    private static int br;
    private static int bh;
    private static int dq;
    private static long x;
    private static long cx;
    private static int g;
    private static long aj;
    private static int s;
    private static int az;
    private static long fh;
    private static long eq;
    private static int ac;
    private static int ch;
    private static int dc;
    private static long w;
    private static int cb;
    private static long bz;
    private static long bk;
    private static long ed;
    private static long dh;
    private static int fd;
    private static int eu;
    private static long ec;
    private static int ah;
    private static int ar;
    private static long au;
    private static long dg;
    private static long ax;
    private static int dt;
    private static int ae;
    private static int by;
    private static long dr;
    private static long eo;
    private static int v;
    private static int eb;
    private static long dp;
    private static int ce;
    private static long fi;
    private static int o;
    private static float dk;
    private static int cy;
    private static int f;
    private static int et;
    private static long ay;
    private static int fn;
    private static int l;
    private static long el;
    private static long be;
    private static int ey;
    private static int var_int_c;
    private static int fq;
    private static long ao;
    private static long q;
    private static int ep;
    private static int bx;
    private static int fa;
    private static int fc;
    private static long var_long_c;
    private static int df;
    private static long eg;
    private static int cu;
    private static long bl;
    private static long fl;
    private static int es;
    private static int n;
    private static long bs;
    private static int co;
    private static long cm;
    private static int fm;
    private static int em;
    private static int dy;
    private static int fy;
    private static int fo;
    private static int ba;
    private static int m;
    private static int r;
    private static int bg;
    private static long ca;
    private static int bc;
    private static int bd;
    private static long er;
    private static int ff;
    private static int ft;
    private static int bn;
    private static String[] var_java_lang_String_arr_b;
    private static long en;
    private static long as;
    private static int aq;
    private static long ag;
    private static long ez;
    private static int ap;
    private static int cn;
    private static long bo;
    private static int dx;
    private static long fu;
    private static int cz;
    private static int fk;
    private static int cv;
    private static long cfr_renamed_1;
    private static long ai;
    private static int aw;
    private static long al;
    private static int fg;
    private static long u;
    private static long ex;
    private static int bw;
    private static int dm;
    private static long dv;
    private static int t;
    private static int ev;
    private static int bu;
    private static int ei;
    private static long bp;
    private static String[] a;

    static {
        var_int_c = (0 >>> 130 | 0 << -130) & 0xFFFFFFFF;
        d = -1 >>> 116 | -1 << ~116 + 1;
        e = Long.reverse(4939586391751297975L);
        f = 262144 >>> 146 | 262144 << -146;
        g = -1 >>> 52 | -1 << -52;
        h = Long.reverse(4939586391751297975L);
        i = Integer.reverse(0);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Integer.reverse(0);
        l = Integer.reverse(0);
        m = (524288 >>> 146 | 524288 << ~146 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(-1073741824);
        o = 128 >>> 230 | 128 << -230;
        p = Long.reverse(472015561399765943L);
        q = Long.reverse(0x4200000000000000L);
        r = Integer.reverse(0);
        s = Integer.reverse(-1073741824);
        t = -1 >>> 11 | -1 << ~11 + 1;
        u = Long.reverse(4939586391751297975L);
        v = Integer.reverse(0x20000000);
        w = Long.reverse(472015561399765943L);
        x = Long.reverse(0x4200000000000000L);
        y = Integer.reverse(-1610612736);
        z = Integer.reverse(-1);
        aa = Long.reverse(4939586391751297975L);
        ab = (0x600000 >>> 212 | 0x600000 << -212) & 0xFFFFFFFF;
        ac = (-1 >>> 78 | -1 << -78) & 0xFFFFFFFF;
        ad = Long.reverse(4939586391751297975L);
        ae = (0 >>> 47 | 0 << -47) & 0xFFFFFFFF;
        af = (-536870912 >>> 29 | -536870912 << ~29 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(4939586391751297975L);
        ah = Integer.reverse(0x10000000);
        ai = Long.reverse(472015561399765943L);
        aj = Long.reverse(0x4200000000000000L);
        ak = Integer.reverse(-1879048192);
        al = Long.reverse(4939586391751297975L);
        am = (10240 >>> 234 | 10240 << -234) & 0xFFFFFFFF;
        an = Integer.reverse(-1);
        ao = Long.reverse(4939586391751297975L);
        ap = (0 >>> 189 | 0 << -189) & 0xFFFFFFFF;
        aq = Integer.reverse(-805306368);
        ar = Integer.reverse(-1);
        as = Long.reverse(4939586391751297975L);
        at = Integer.reverse(0x30000000);
        au = Long.reverse(472015561399765943L);
        av = Long.reverse(0x4200000000000000L);
        aw = 0xD000000 >>> 216 | 0xD000000 << ~216 + 1;
        ax = Long.reverse(472015561399765943L);
        ay = Long.reverse(0x4200000000000000L);
        az = 3584 >>> 136 | 3584 << ~136 + 1;
        ba = Integer.reverse(-1);
        bb = Long.reverse(4939586391751297975L);
        bc = (0 >>> 60 | 0 << ~60 + 1) & 0xFFFFFFFF;
        bd = (480 >>> 101 | 480 << -101) & 0xFFFFFFFF;
        be = Long.reverse(472015561399765943L);
        bf = Long.reverse(0x4200000000000000L);
        bg = 0 >>> 157 | 0 << -157;
        bh = 4096 >>> 140 | 4096 << ~140 + 1;
        bi = -1 >>> 50 | -1 << ~50 + 1;
        bj = 0x200000 >>> 49 | 0x200000 << -49;
        bk = Long.reverse(472015561399765943L);
        bl = Long.reverse(0x4200000000000000L);
        bm = Integer.reverse(0);
        bn = Integer.reverse(-2013265920);
        bo = Long.reverse(472015561399765943L);
        bp = Long.reverse(0x4200000000000000L);
        bq = Integer.reverse(Integer.MIN_VALUE);
        br = Integer.reverse(0x48000000);
        bs = Long.reverse(472015561399765943L);
        bt = Long.reverse(0x4200000000000000L);
        bu = Integer.reverse(0x40000000);
        bv = (2 >>> 128 | 2 << ~128 + 1) & 0xFFFFFFFF;
        bw = 256 >>> 8 | 256 << -8;
        bx = (0 >>> 146 | 0 << -146) & 0xFFFFFFFF;
        by = Integer.reverse(-939524096);
        bz = Long.reverse(472015561399765943L);
        ca = Long.reverse(0x4200000000000000L);
        cb = 5 >>> 254 | 5 << ~254 + 1;
        cc = Long.reverse(472015561399765943L);
        cd = Long.reverse(0x4200000000000000L);
        ce = 0x1500000 >>> 212 | 0x1500000 << -212;
        cf = -1 >>> 136 | -1 << ~136 + 1;
        cg = Long.reverse(4939586391751297975L);
        ch = 1024 >>> 105 | 1024 << ~105 + 1;
        ci = (1408 >>> 134 | 1408 << -134) & 0xFFFFFFFF;
        cj = Long.reverse(4939586391751297975L);
        ck = Integer.reverse(-402653184);
        cl = Long.reverse(472015561399765943L);
        cm = Long.reverse(0x4200000000000000L);
        cn = Integer.reverse(0);
        co = 393216 >>> 46 | 393216 << -46;
        cp = Long.reverse(472015561399765943L);
        cq = Long.reverse(0x4200000000000000L);
        cr = Integer.reverse(-1744830464);
        cs = (-1 >>> 207 | -1 << -207) & 0xFFFFFFFF;
        ct = Long.reverse(4939586391751297975L);
        cu = Integer.reverse(0);
        cv = (425984 >>> 46 | 425984 << ~46 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(472015561399765943L);
        cx = Long.reverse(0x4200000000000000L);
        cy = Integer.reverse(-671088640);
        cz = Integer.reverse(-1);
        da = Long.reverse(4939586391751297975L);
        db = (0 >>> 67 | 0 << -67) & 0xFFFFFFFF;
        dc = Integer.reverse(Integer.MIN_VALUE);
        dd = Integer.reverse(0x38000000);
        de = Long.reverse(4939586391751297975L);
        df = 0x1D00000 >>> 52 | 0x1D00000 << -52;
        dg = Long.reverse(472015561399765943L);
        dh = Long.reverse(0x4200000000000000L);
        di = 0 >>> 186 | 0 << ~186 + 1;
        dj = Float.intBitsToFloat(134016 >>> 179 | 134016 << -179);
        dk = Float.intBitsToFloat((-2139095040 >>> 161 | -2139095040 << ~161 + 1) & 0xFFFFFFFF);
        dl = Integer.reverse(Integer.MIN_VALUE);
        dm = 0 >>> 137 | 0 << -137;
        dn = Integer.reverse(0x78000000);
        cfr_renamed_1 = Long.reverse(472015561399765943L);
        dp = Long.reverse(0x4200000000000000L);
        dq = -134217728 >>> 155 | -134217728 << ~155 + 1;
        dr = Long.reverse(472015561399765943L);
        ds = Long.reverse(0x4200000000000000L);
        dt = 0x1000000 >>> 211 | 0x1000000 << ~211 + 1;
        du = Long.reverse(472015561399765943L);
        dv = Long.reverse(0x4200000000000000L);
        dw = Integer.reverse(0);
        dx = 0x780000 >>> 114 | 0x780000 << ~114 + 1;
        dy = (24576 >>> 12 | 24576 << -12) & 0xFFFFFFFF;
        dz = Float.intBitsToFloat(Integer.reverse(3714));
        ea = Float.intBitsToFloat((526336 >>> 213 | 526336 << -213) & 0xFFFFFFFF);
        eb = Integer.reverse(-2080374784);
        ec = Long.reverse(472015561399765943L);
        ed = Long.reverse(0x4200000000000000L);
        ee = Integer.reverse(0x44000000);
        ef = Long.reverse(472015561399765943L);
        eg = Long.reverse(0x4200000000000000L);
        eh = 0 >>> 27 | 0 << -27;
        ei = 0x4000000 >>> 154 | 0x4000000 << -154;
        ej = Integer.reverse(-1006632960);
        ek = Long.reverse(472015561399765943L);
        el = Long.reverse(0x4200000000000000L);
        em = 1152 >>> 133 | 1152 << ~133 + 1;
        en = Long.reverse(472015561399765943L);
        eo = Long.reverse(0x4200000000000000L);
        ep = (4736 >>> 7 | 4736 << ~7 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(472015561399765943L);
        er = Long.reverse(0x4200000000000000L);
        es = Integer.reverse(0);
        et = 0x7800000 >>> 118 | 0x7800000 << ~118 + 1;
        eu = 6 >>> 32 | 6 << ~32 + 1;
        ev = Integer.reverse(0x64000000);
        ew = Long.reverse(472015561399765943L);
        ex = Long.reverse(0x4200000000000000L);
        ey = Integer.reverse(-469762048);
        ez = Long.reverse(4939586391751297975L);
        fa = Integer.reverse(0);
        fb = (0 >>> 83 | 0 << -83) & 0xFFFFFFFF;
        fc = 0 >>> 182 | 0 << -182;
        fd = (0x140000 >>> 175 | 0x140000 << -175) & 0xFFFFFFFF;
        fe = Long.reverse(4939586391751297975L);
        ff = 8 >>> 131 | 8 << ~131 + 1;
        fg = 20992 >>> 201 | 20992 << -201;
        fh = Long.reverse(472015561399765943L);
        fi = Long.reverse(0x4200000000000000L);
        fj = Integer.reverse(0x54000000);
        fk = (-1 >>> 228 | -1 << ~228 + 1) & 0xFFFFFFFF;
        fl = Long.reverse(4939586391751297975L);
        fm = Integer.reverse(0);
        fn = Integer.reverse(-738197504);
        fo = -1 >>> 81 | -1 << -81;
        fp = Long.reverse(4939586391751297975L);
        fq = (44 >>> 32 | 44 << ~32 + 1) & 0xFFFFFFFF;
        fr = Long.reverse(4939586391751297975L);
        fs = 0 >>> 54 | 0 << ~54 + 1;
        ft = -1610612731 >>> 157 | -1610612731 << ~157 + 1;
        fu = Long.reverse(472015561399765943L);
        fv = Long.reverse(0x4200000000000000L);
        fw = 0x100000 >>> 52 | 0x100000 << ~52 + 1;
        fx = (0 >>> 103 | 0 << -103) & 0xFFFFFFFF;
        fy = Integer.reverse(0x74000000);
        fz = Integer.reverse(0x74000000);
        a = new String[fy];
        var_java_lang_String_arr_b = new String[fz];
        NLoginCore_396.void_b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void b(NLoginCore_494 var1_1, String[] var2_2) {
        var3_3 = this.e().toLowerCase(Locale.ENGLISH);
        if (var2_2.length != NLoginCore_396.m && var2_2.length != NLoginCore_396.n) {
            NLoginCore_150.a(var1_1, (String)NLoginCore_396.c("㺀", (int)NLoginCore_396.o, (long)(NLoginCore_396.p ^ NLoginCore_396.q)), new Object[NLoginCore_396.r]);
            NLoginCore_150.a(var1_1, (String)NLoginCore_396.c("㺃", (int)(NLoginCore_396.s & NLoginCore_396.t), (long)NLoginCore_396.u) + var3_3 + (String)NLoginCore_396.c("㺆", (int)NLoginCore_396.v, (long)(NLoginCore_396.w ^ NLoginCore_396.x)) + (String)(this.j() != false ? NLoginCore_396.c("㺉", (int)(NLoginCore_396.y & NLoginCore_396.z), (long)NLoginCore_396.aa) : NLoginCore_396.c("㺌", (int)(NLoginCore_396.ab & NLoginCore_396.ac), (long)NLoginCore_396.ad)), new Object[NLoginCore_396.ae]);
            NLoginCore_150.a(var1_1, (String)NLoginCore_396.c("㺏", (int)NLoginCore_396.af, (long)NLoginCore_396.ag) + var3_3 + (String)NLoginCore_396.c("㺒", (int)NLoginCore_396.ah, (long)(NLoginCore_396.ai ^ NLoginCore_396.aj)) + (String)(this.j() != false ? NLoginCore_396.c("㺕", (int)NLoginCore_396.ak, (long)NLoginCore_396.al) : NLoginCore_396.c("㺘", (int)(NLoginCore_396.am & NLoginCore_396.an), (long)NLoginCore_396.ao)), new Object[NLoginCore_396.ap]);
            NLoginCore_150.a(var1_1, (String)NLoginCore_396.c("㺛", (int)(NLoginCore_396.aq & NLoginCore_396.ar), (long)NLoginCore_396.as) + var3_3 + (String)NLoginCore_396.c("㺞", (int)NLoginCore_396.at, (long)(NLoginCore_396.au ^ NLoginCore_396.av)) + (String)(this.j() != false ? NLoginCore_396.c("㺡", (int)NLoginCore_396.aw, (long)(NLoginCore_396.ax ^ NLoginCore_396.ay)) : NLoginCore_396.c("㺤", (int)(NLoginCore_396.az & NLoginCore_396.ba), (long)NLoginCore_396.bb)), new Object[NLoginCore_396.bc]);
            NLoginCore_150.a(var1_1, (String)NLoginCore_396.c("㺧", (int)NLoginCore_396.bd, (long)(NLoginCore_396.be ^ NLoginCore_396.bf)), new Object[NLoginCore_396.bg]);
            return;
        }
        var5_5 = var4_4 = var2_2[NLoginCore_396.bh].toLowerCase(Locale.ENGLISH);
        var6_6 = NLoginCore_396.bi;
        switch (var5_5.hashCode()) {
            case 738950403: {
                if (!var5_5.equals(NLoginCore_396.c("㺪", (int)NLoginCore_396.bj, (long)(NLoginCore_396.bk ^ NLoginCore_396.bl)))) break;
                var6_6 = NLoginCore_396.bm;
                break;
            }
            case 951117504: {
                if (!var5_5.equals(NLoginCore_396.c("㺭", (int)NLoginCore_396.bn, (long)(NLoginCore_396.bo ^ NLoginCore_396.bp)))) break;
                var6_6 = NLoginCore_396.bq;
                break;
            }
            case 3005871: {
                if (!var5_5.equals(NLoginCore_396.c("㺰", (int)NLoginCore_396.br, (long)(NLoginCore_396.bs ^ NLoginCore_396.bt)))) break;
                var6_6 = NLoginCore_396.bu;
            }
        }
        switch (var6_6) {
            case 0: {
                if (var2_2.length == NLoginCore_396.bv) {
                    v0 = new Object[NLoginCore_396.bw];
                    v0[NLoginCore_396.bx] = (String)NLoginCore_396.c("㺳", (int)NLoginCore_396.by, (long)(NLoginCore_396.bz ^ NLoginCore_396.ca)) + var3_3 + (String)NLoginCore_396.c("㺶", (int)NLoginCore_396.cb, (long)(NLoginCore_396.cc ^ NLoginCore_396.cd)) + var4_4 + (String)NLoginCore_396.c("㺹", (int)(NLoginCore_396.ce & NLoginCore_396.cf), (long)NLoginCore_396.cg);
                    NLoginCore_150.a(var1_1, NLoginCore_374.x, v0);
                    break;
                }
                var7_7 = NLoginCore_204.a(var2_2[NLoginCore_396.ch]);
                if (var7_7 == null) {
                    NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㺼", (int)NLoginCore_396.ci, (long)NLoginCore_396.cj) : NLoginCore_396.c("㺿", (int)NLoginCore_396.ck, (long)(NLoginCore_396.cl ^ NLoginCore_396.cm))), new Object[NLoginCore_396.cn]);
                    break;
                }
                this.a.com_nickuc_login_NLoginCore_227_a().a(var7_7);
                if (var7_7 == NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b) {
                    NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻂", (int)NLoginCore_396.co, (long)(NLoginCore_396.cp ^ NLoginCore_396.cq)) : NLoginCore_396.c("㻅", (int)(NLoginCore_396.cr & NLoginCore_396.cs), (long)NLoginCore_396.ct)), new Object[NLoginCore_396.cu]);
                    break;
                }
                NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻈", (int)NLoginCore_396.cv, (long)(NLoginCore_396.cw ^ NLoginCore_396.cx)) : NLoginCore_396.c("㻋", (int)(NLoginCore_396.cy & NLoginCore_396.cz), (long)NLoginCore_396.da)), new Object[NLoginCore_396.db]);
                break;
            }
            case 1: {
                if (!this.var_java_util_concurrent_atomic_AtomicBoolean_b.getAndSet((boolean)NLoginCore_396.dc)) break;
                try {
                    var7_8 = this.a.com_nickuc_login_NLoginCore_224_a();
                    var8_10 = var7_8.com_nickuc_login_NLoginCore_233_a();
                    if (var8_10.ah() || !this.a.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().ad()) {
                        this.a.com_nickuc_login_NLoginCore_227_a().am();
                    }
                    if (this.a.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().ad()) {
                        if (var8_10.ah()) {
                            if (var1_1 instanceof NLoginCore_277) {
                                ((NLoginCore_277)var1_1).a((String)NLoginCore_396.c("㻔", (int)NLoginCore_396.dn, (long)(NLoginCore_396.cfr_renamed_1 ^ NLoginCore_396.dp)), (String)(this.j() != false ? NLoginCore_396.c("㻗", (int)NLoginCore_396.dq, (long)(NLoginCore_396.dr ^ NLoginCore_396.ds)) : NLoginCore_396.c("㻚", (int)NLoginCore_396.dt, (long)(NLoginCore_396.du ^ NLoginCore_396.dv))), NLoginCore_396.dw, NLoginCore_396.dx, NLoginCore_396.dy);
                                NLoginCore_150.a(var1_1, NLoginCore_119.C, NLoginCore_396.dz, NLoginCore_396.ea);
                            } else {
                                NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻝", (int)NLoginCore_396.eb, (long)(NLoginCore_396.ec ^ NLoginCore_396.ed)) : NLoginCore_396.c("㻠", (int)NLoginCore_396.ee, (long)(NLoginCore_396.ef ^ NLoginCore_396.eg))), new Object[NLoginCore_396.eh]);
                            }
                            var8_10.e((boolean)NLoginCore_396.ei);
                        } else {
                            NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻎", (int)NLoginCore_396.dd, (long)NLoginCore_396.de) : NLoginCore_396.c("㻑", (int)NLoginCore_396.df, (long)(NLoginCore_396.dg ^ NLoginCore_396.dh))), new Object[NLoginCore_396.di]);
                            NLoginCore_150.a(var1_1, NLoginCore_119.C, NLoginCore_396.dj, NLoginCore_396.dk);
                            var8_10.e((boolean)NLoginCore_396.dl);
                            this.var_java_util_concurrent_atomic_AtomicBoolean_b.set((boolean)NLoginCore_396.dm);
                            break;
                        }
                    } else {
                        if (var1_1 instanceof NLoginCore_277) {
                            ((NLoginCore_277)var1_1).a((String)NLoginCore_396.c("㻣", (int)NLoginCore_396.ej, (long)(NLoginCore_396.ek ^ NLoginCore_396.el)), (String)(this.j() != false ? NLoginCore_396.c("㻦", (int)NLoginCore_396.em, (long)(NLoginCore_396.en ^ NLoginCore_396.eo)) : NLoginCore_396.c("㻩", (int)NLoginCore_396.ep, (long)(NLoginCore_396.eq ^ NLoginCore_396.er))), NLoginCore_396.es, NLoginCore_396.et, NLoginCore_396.eu);
                        }
                        NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻬", (int)NLoginCore_396.ev, (long)(NLoginCore_396.ew ^ NLoginCore_396.ex)) : NLoginCore_396.c("㻯", (int)NLoginCore_396.ey, (long)NLoginCore_396.ez)), new Object[NLoginCore_396.fa]);
                    }
                }
                catch (Throwable var9_12) {
                    this.var_java_util_concurrent_atomic_AtomicBoolean_b.set((boolean)NLoginCore_396.fc);
                    throw var9_12;
                }
                this.var_java_util_concurrent_atomic_AtomicBoolean_b.set((boolean)NLoginCore_396.fb);
                break;
            }
            case 2: {
                var7_9 = this.a.com_nickuc_login_NLoginCore_224_a();
                var8_11 = var7_9.com_nickuc_login_NLoginCore_482_a();
                var9_13 = var8_11.boolean_a((String)NLoginCore_396.c("㻲", (int)NLoginCore_396.fd, (long)NLoginCore_396.fe), (boolean)NLoginCore_396.ff);
                if (var9_13) {
                    NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻵", (int)NLoginCore_396.fg, (long)(NLoginCore_396.fh ^ NLoginCore_396.fi)) : NLoginCore_396.c("㻸", (int)(NLoginCore_396.fj & NLoginCore_396.fk), (long)NLoginCore_396.fl)), new Object[NLoginCore_396.fm]);
                } else {
                    NLoginCore_150.a(var1_1, (String)(this.j() != false ? NLoginCore_396.c("㻻", (int)(NLoginCore_396.fn & NLoginCore_396.fo), (long)NLoginCore_396.fp) : NLoginCore_396.c("㻾", (int)NLoginCore_396.fq, (long)NLoginCore_396.fr)), new Object[NLoginCore_396.fs]);
                }
                var8_11.com_nickuc_login_NLoginCore_482_a((String)NLoginCore_396.c("㼁", (int)NLoginCore_396.ft, (long)(NLoginCore_396.fu ^ NLoginCore_396.fv)), (boolean)(var9_13 == false ? NLoginCore_396.fw : NLoginCore_396.fx));
                break;
            }
        }
    }

    public NLoginCore_396(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_396.c("㺀", (int)(var_int_c & d), (long)e), (String)NLoginCore_396.c("㺃", (int)(f & g), (long)h), i != 0, j != 0, new String[k]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_396.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ЫэяЯѓѲѪҀѬлѹѯѽѷрѥ҇҆Ѿ҄Ѿѓ", (byte)26, 67), NLoginCore_396.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ĖģĢåĥġĜĥİğìĪĮħĪİòѼ҉ѼѿѮҐґѽ҂ѿ҆҈Ċ", (byte)26, 65) + string + NLoginCore_027.B("í", (byte)26, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x42L;
        l ^= 0x39BB886F5C935463L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(66 + 3), (byte)(72 + 11), (byte)(12 + 35), (byte)(28 + 39), (byte)(65 + 1), (byte)(17 + 50), (byte)(27 + 20), (byte)(70 + 10), (byte)(21 + 54), (byte)(10 + 57), 83, (byte)(34 + 19), 80, (byte)(76 + 21), (byte)(4 + 96), (byte)(57 + 43), (byte)(42 + 63), (byte)(85 + 25), (byte)(20 + 83)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ôāĀÃăÿúăĎýÊĈČąĈĎÐњѧњѝьѮѯћѠѝѤѦ", (byte)9, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_396.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static void void_b() {
        int n;
        var_long_c = -1310251038326443680L;
        long l = var_long_c ^ 0x39BB886F5C935463L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(41 + 28), (byte)(71 + 12), (byte)(44 + 3), (byte)(33 + 34), (byte)(24 + 42), (byte)(6 + 61), (byte)(45 + 2), 80, (byte)(46 + 29), (byte)(20 + 47), (byte)(39 + 44), 53, (byte)(63 + 17), (byte)(27 + 70), (byte)(12 + 88), (byte)(67 + 33), (byte)(81 + 24), (byte)(62 + 48), (byte)(89 + 14)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
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
                    NLoginCore_396.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ҼҹҳҘҷ҈ҷӌӌҼҼғ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ŘŌŐĨıŎšŎĬŕőŚšĿŀļĺŗŧũŊůĶķ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[2] = NLoginCore_387.D("ҏҒѼӆҡҴӋҽ҉ҫӄғ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[3] = NLoginCore_384.A("ŝņŎěěĸĢĚĞŒĶĳĹšĦŕĽŬĺġŧŌŨœŲĵĭŴšĶŗũ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[4] = NLoginCore_091.A("ĖĚņĕĶŖśŌįļŐĳŜřĴūūĻŅľŭŐŤűŠĭŷŤĸŔŭĶĶĵžūźŉŴŮťŻƄŤŝźŞŋŔƇƀŚƁƏŖŗ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[5] = NLoginCore_201.F("ԼթԳՠզաՋԸԮՄԭԻԬՒ԰ԲԯԲՁմչշՋԻԱվԽԿՂՖճճսաՙոէՂ՚լ֍լֈՎմ֌ևգՉ֊ւև֏֊աբ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[6] = NLoginCore_427.A("ōľňĬıľŕşĶĢĝńĺšŉļťŬůĭŎŐŤŀŭųŬŰŖĶŤĲųĻŪŏňřŪĺļżŎŋ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[7] = NLoginCore_223.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏҴӐһӚҝҕӜӉҞҿӑ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[8] = NLoginCore_223.E("՛ԨՈԲԿԿՙլՇՃղՎՌԮբդ՘զհԶՊՔՁՂ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[9] = NLoginCore_027.F("՗Ղ՚դԹԬԵՂԡՄՊլՑյէՠղթԯ՛մզԴՋըշպձցՙոե՛ջ՟՝՚ՃւՋ՝կ։ը֋ֆեՔււ֍֓ռ֚աբ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[10] = NLoginCore_091.F("ՙէԧԥՂՉլՅՀլՍդՐԭՄձՌԳըԵռզժ՞Շծ՜յ՗լեև՚Փ՘՘ևըՅփթկաՖ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[11] = NLoginCore_575.E("ըՑՙԦԦՃԭԥԩ՝ՁԾՄլԱՠՈշՅԬղ՗ճ՞սՀԸտլՁբմ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[12] = NLoginCore_091.C("ҙѾүӅ҅ҢҺҡҝҗ҇ӎҫһӌӔғҒҕҨҫӗҞҟ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[13] = NLoginCore_092.D("ҷҽ҃ҧӅҧҫҩңҬӏҟҋҐӅҾӍҝӑҫҵҰӌҴҔӑӘӠӐғӐҢӒҶҵҾҿҤӗӗҷӦӯӨҹӞӡӲӕӧӐҭҮӲӗӮӹӘӴӕҺһӜӮ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ŘľļĻįľīğłŒŏĤĨĺłńŝŅĮŨĦŏŬūŨŅŧşŷŚŹŦĹŕŎŏĻſŪūœŹƅűœƀţŵľŕŀƎƅſŖŗ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[15] = NLoginCore_201.C("ҏҒѼӆҡҴӋҽ҉ҫӄғ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[16] = NLoginCore_201.E("ԼՈ՜ՄԢԶ՛՘ԷԿԹԶ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[17] = NLoginCore_110.B("ŎĭŉğřĘşńĚģĮī", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[18] = NLoginCore_387.A("ŚĴĐĭĹĳįŜĖŐŐī", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[19] = NLoginCore_453.A("ĸňĺşĻİğěĵŘŚğŀŘŪłŠĿŅŠŧĹĶķ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[20] = NLoginCore_427.D("ҼѻӅҒұҺӂҥҪӄҞғ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[21] = NLoginCore_027.A("ĵŚĵĹĳŌŔšŖřĶĥŧŕĢĶŉĶŝŌĺĹĶķ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[22] = NLoginCore_173.D("ҖҟҐҘҁҖӇҁҷҾҸӍҐӑҬҾӃӂӏӉӍӎҸӘҰҲӟҴұҳӑӗҷӥӠӈӄӝӛһәӜҼӗҿӐҫӏӔҬӁӰӆӲҴӔөӝӽһӼӻӖӱ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[23] = NLoginCore_223.D("ңҠҽқҝ҉ҢҵҌһӌҹӌҦҦҫ҆ҞҖӔӏҹӇҮӉҨҧґӉҪҳҿӌӢӕәӓӊӋңҺӛҤӗүӤӲӜӰӀҾӴӅӑҾҿ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŪŗļśŲŹőŵŃŰŚŜŔŗśžŖśŌŷƋŝťŏŝƃŪŪŷšƃů", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[25] = NLoginCore_427.A("ĜĚĚőĵŘĝĠťŘľŖĳŪśķĴŋķĺŅĮŋœňĬũĮŌŨůŵŎĽŋŲľžŻŰżŵŴżŁƉŷňŘƆŎņŽŻűŠōŢƉŦŏŔŚƐ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[26] = NLoginCore_324.F("ԷԶՇա՘՘աԠՁՌԺ՜ԾհՀթժաԱՊԭնշԴ՝Լչձ՛՗ւ՝ՙ։ՠֆ՟՜՘֏՗֌պլա֕աֈֈնկջճե՛֍խ։աՔ֍ճ֣֓ր֞՛֞։֥֗֏֞֯ըն", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[27] = NLoginCore_138.E("ԧԥԥ՜ՀգԨԫհգՉաԾյզՂԿՖՂՅՐԹՖ՞ՓԷմԹ՗ճպր՘չ՝ֆՙգՈ֊Ռժ֊ՒՒռ֐Տծշ֌ղպֈպ։ձհ՛լՕո֥֑֗՞րփչ՞փպզկօն", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[28] = NLoginCore_223.A("ŗıĹŀĲĹţĲĴĹŏŖŒŉħĳŧřŅŚİħĨŮŢŐŔŦŒİŃżōźŹıŴĿūŗľƂšœłŠŊƃłũŽŭƄőŬƌŵƍƁŬţƇƋƆŦųƟžŬŜƙŭśŗƖűƑŴƄżƪƅžƊƀƜżſƑůƊűƌŵƍƳŮƚƆƭƸƫŻƲƌƼƺƑžǇƠƾƆƞǇơƜƏƯǅƩƢǕƗƯǔǆưƺƱưƫƳǕǏƞǔƠƺƫ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[29] = NLoginCore_384.D("ҸҒҖҝғҾӈ҄ҴҊҶҿҡҫҿҌҩӏҩҫӄҥӛҶӕҗӚҨүҚҭҴӝҷӒӠӓӀҷӡҞӘӍҮӊүҺҬӵӆӵӐӐҸӉӉӨӍӵҽӌӬҸӬԂӳӗӤӰөԁӷԂӘӗӸӤӃӳӧԃԎԂӧӎәәԊӰԝӦӹӸԉӻӴԍԙԃԥԒӻԄԄԤԂԞԨԁԏԦӮԀԭԊԆӴԤԊԴԌԫԧӿԱԘԖԺӻԍԢӽԺԥԊԸԃԦԖԓ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[30] = NLoginCore_027.F("ԲԵԟթՄ՗ծՠԬՎէԶ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[31] = NLoginCore_384.B("ŒĳŝĻŕŖŞŕĴĝĞšŖşŪĪśģĩľńşŢŭŇŶĶŏŊŤňŎŊŅľŠşžŏĺŶŅŰźƄżşŬŻƎŇŅŚƆŽŧũƉƎŭŬŷŐƋ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[32] = NLoginCore_324.F("ՇըԠբՊդՍՇՏՊ՟ՀՋՂՈՄդՍժծեՈՉՉ՟ՠՓՍ՛Ղ՚ճդս՟ՓՊՙՉչռռհ֋֋֋փՓև֌զյ֖֕֝Ֆլ֐ՙ՝ՙ՛֓՘", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[33] = NLoginCore_076.C("ҺқӅңҽҾӆҽҜ҅҆ӉҾӇӒҒӃҋґҦҬӇӊӕүӞҞҷҲӌҰҶҲҭҦӈӇӦҷҢӞҭӘӢӬӤӇӔӣӶүҭӂӮӥӏӑӱӶӕӔӟҸӳ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[34] = NLoginCore_091.D("ҤӅѽҿҧӁҪҤҬҧҼҝҨҟҥҡӁҪӇӋӂҥҦҦҼҽҰҪҸҟҷӐӁӚҼҰҧҶҦӖәәӍӨӨӨӠҰӤөӃӒӲӳӺҳӉӭҶҺҶҸӰҵ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[35] = NLoginCore_138.F("ԲԵԟթՄ՗ծՠԬՎէԶ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[36] = NLoginCore_559.F("ԦԴաԠ՟՚ԻկԩՍ՞ԿՄՄԱկթՃՑդըլսՆՏԼԼՂծխջՆՁտ։՘եՌք֍ե՞՝Ֆ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[37] = NLoginCore_384.F("ՠՈՃՃՃԻԻզՐ՘ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէզՃզ՝֊բըՍշ՘թՖ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[38] = NLoginCore_453.D("҃ґҾѽҼҷҘӌ҆ҪһҜҡҡҎӌӆҠҮӁӅӉӚңҬҙҙҟӋӊӘңҞӜӦҵӂҩӡӪӂһҺҳ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[39] = NLoginCore_223.A("ŕĽĸĸĸİİśŅōĺŇĽńŠŀŦļŧŭőşŲĳŰŠŅŢĮŏŻŜŜņŐŋſŕĹŽŗƃĽŋ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[40] = NLoginCore_223.D("ѺҭѼҏӆҚӁқҦ҆ҧҩҜӃҼҤӌӖӏҰӔҡҞҟ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[41] = NLoginCore_004.E("՜ՕՄԠՊԤՍԿԬՊկթղդԴՌաԪճԳպ՗ՋիՐջՊն՝կվՔնՐշաբևՅտւՇչըՅ֑։բ֋օ֗իֈ֐պՕի՜֐֊֐ց֏դֆ։բ֗իշ֣ռպ֙լն", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[42] = NLoginCore_384.B("ĩĬŎŏļĶĹŢōŠœŤĽķśšŞōľŐłũŉŏőİňĵŖŉŊřĲŌĹśŵųůŸŃşŚŧŒőŖŊƍŌŶŏƌƏŨŏŨŏūƃƃƌŦƖ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[43] = NLoginCore_004.A("ŚėĹĳľśōĹĤıťŜĺĶņĺŠŎŞłŨŦŌŅūŴůłŀůŲĲĮũŋŋŵŌżŷĶļŮŘƄśƊŔŭƃšŢŨűžžšƊůŶƁŶŖŤ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[44] = NLoginCore_076.F("ՇԾՆԾԦԼԿՍՉ՞ը՞ԼՏԲԭՕչՑՑՅչնռԵխԾչՖԾՑչջՠՔըՇփու՛ևՎՊ֎ՋՒֆ֐ծՓ֖իշ֜ճնջիչք֜ռ՞", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[45] = NLoginCore_384.E("ԝՐԟԲթԽդԾՉԩՊՌԿզ՟ՇկչղՓշՄՁՂ", (byte)50, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_396.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ѽҕҿҿҀҷӂҡқӂҧҤӆҭҺґӀӏӈҴҐӗҞҟ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ŘŌŐĨıŎšŎĬŕőŧĴŤŘŬŬśśŁşŢŰŅŧŧŌĴųŦĹķ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[2] = NLoginCore_091.E("Ԧ՘ԹԸՁԵդթՀԬԬԶ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏӄғӘҸӏӈҙӌҶӛҳ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[4] = NLoginCore_027.A("ĖĚņĕĶŖśŌįļŐĳŜřĴūūĻŅľŭŐŤűŠĭŷŤĸŔŭĶĶĵžūźŉŴŮťŻƆŻŃŪžƅƉŧƁšŽſŖŗ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[5] = NLoginCore_091.E("ԼթԳՠզաՋԸԮՄԭԻԬՒ԰ԲԯԲՁմչշՋԻԱվԽԿՂՖճճսաՙոէՂ՚լ֍լ։տ֒է֍՞֗՘մ֙ճդաբ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[6] = NLoginCore_201.F("՘ՉՓԷԼՉՠժՁԭԨՏՅլՔՇհշպԸՙ՛կՋովշջաՁկԽՂհդտմՌտ֋Վ֍թՖ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[7] = NLoginCore_092.B("ŝņŎěěĸĢĚĞŒĶĳĹšĦŕĽŬĺġŧőŞšŦœŮŊķŗŕŎ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[8] = NLoginCore_027.E("՛ԨՈԲԿԿՙլՇՃհՂկխդդԷՋըՅծպՁՂ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[9] = NLoginCore_324.C("ҴҟҷӁҖ҉ҒҟѾҡҧӉҮӒӄҽӏӆҌҸӑӃґҨӅӔӗӎӞҶӕӂҸӘҼҺҷҠӟҨҺӌӤӏҼӡӤӏұӀӗӍҵӧҾҿ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[10] = NLoginCore_091.F("ՙէԧԥՂՉլՅՀլՍդՐԭՄձՌԳըԵռզժ՞Շծ՜յ՗լեևցՔշբ֋՟ժ֋ջ՞տՖ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[11] = NLoginCore_027.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏҹҴҳҴӕҫҩҹӌҭҺ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[12] = NLoginCore_110.A("ıĖŇŝĝĺŒĹĵįĝĶģĴŨŧōħľĻōşĶķ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[13] = NLoginCore_004.D("ҷҽ҃ҧӅҧҫҩңҬӏҟҋҐӅҾӍҝӑҫҵҰӌҴҔӑӘӠӐғӐҢӒҶҵҾҿҤӗӗҷӦӯӨҹӞӡӲӕӧӐҭҮӯӛөӵҷӟӺҶӳӮәҾԄӒӾӸӄԉӳӘӆӮӓ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[14] = NLoginCore_324.C("ӀҦҤңҗҦғ҇ҪҺҷҌҐҢҪҬӅҭҖӐҎҷӔӓӐҭӏӇӟӂӡӎҡҽҶҷңӧӒӓһӡӬүӘӐҪҮӕӝӂҰӌӁҾҿ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[15] = NLoginCore_223.F("ԲթՔՉԨ՛ԟՙԥ՝կԶ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[16] = NLoginCore_004.E("զ՚ԥՀդա՝ՉԪՋկճՈՠ԰ճ՟ոԲԳՐՄՁՂ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[17] = NLoginCore_223.F("ՙՙԷՖաՈազթաՍՅԯՉմՌՃՓՊիԵժՁՂ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[18] = NLoginCore_223.D("ѼһҤҤ҅ҁӅҟҞ҅ҧ҉ӋӊҭҫғұҍҷҧӇҞҟ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[19] = NLoginCore_027.E("ՃՓՅժՆԻԪԦՀգդՆԲՍըՎԵչՍնՆՄՁՂ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[20] = NLoginCore_223.F("ԢՑդբեՠՈՃԨթՉԶ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[21] = NLoginCore_027.B("ĵŚĵĹĳŌŔšŖřĹśĤĿŧŉŃĵśřŋŢĪŝţŤŗŪńńńŹ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[22] = NLoginCore_027.F("ԹՂԳԻԤԹժԤ՚ա՛հԳմՏազեղլհձ՛ջՓՕւ՗ՔՖմպ՚ֈփիէրվ՞ռտ՟պբճՎղշՏդ֓թ֕֗շ՝֋֎շռճջ֜", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[23] = NLoginCore_451.F("ՆՃՠԾՀԬՅ՘ԯ՞կ՜կՉՉՎԩՁԹշղ՜ժՑլՋՊԴլՍՖբկօոռնխծՆ՝վՇկՉ֋դ՟բՔլևևֆեն՝֎խղոչ֣օ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[24] = NLoginCore_451.A("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŪŗļśŲŹőŵŃŰŚŜŔŗśžŖśŌŷƋŤťƒƄŮŏşƘũƆŴ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[25] = NLoginCore_091.A("ĜĚĚőĵŘĝĠťŘľŖĳŪśķĴŋķĺŅĮŋœňĬũĮŌŨůŵŎĽŋŲľžŻŰżŵŴżŁƉŷňŘƆŎņŽůŭŦƍšƍƕƐũŷŦŸťŬƉƜƎŶżśŵžū", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[26] = NLoginCore_575.A("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŎžŕŻŔőōƄŌƁůšŖƊŖŽŽūŤŰŨŚŐƂŢžŖŉƂŨƈƘŵŕŮƞŬşŘƤŴżŮŴƞƩšťƬƥƧŬƯƯŶŷ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[27] = NLoginCore_387.E("ԧԥԥ՜ՀգԨԫհգՉաԾյզՂԿՖՂՅՐԹՖ՞ՓԷմԹ՗ճպր՘չ՝ֆՙգՈ֊Ռժ֊ՒՒռ֐Տծշ֌ղպֈպ։ձհ՛լՕո֥֦֗ս֞ՠճ֬եզփֱ֦֘լ֍ָ֥֑֥֓լֵքցւ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[28] = NLoginCore_201.B("ŗıĹŀĲĹţĲĴĹŏŖŒŉħĳŧřŅŚİħĨŮŢŐŔŦŒİŃżōźŹıŴĿūŗľƂšœłŠŊƃłũŽŭƄőŬƌŵƍƁŬţƇƋƆŦųƟžŬŜƙŭśŗƖűƑŴƄżƪƅžƊƀƜżſƑůƊűƌŵƍƳŮƚƆƭƸƫŻƲƌƼƺƑžǇƠƾƆƞǇơƜƏƯǅƩƢǕƗƯǔǆưƴƷƫƕǝǎƹƵǝƞǅƝơǥǒǝƶǈǫǘǌǯƶƷ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[29] = NLoginCore_201.D("ҸҒҖҝғҾӈ҄ҴҊҶҿҡҫҿҌҩӏҩҫӄҥӛҶӕҗӚҨүҚҭҴӝҷӒӠӓӀҷӡҞӘӍҮӊүҺҬӵӆӵӐӐҸӉӉӨӍӵҽӌӬҸӬԂӳӗӤӰөԁӷԂӘӗӸӤӃӳӧԃԎԂӧӎәәԊӰԝӦӹӸԉӻӴԍԙԃԥԒӻԄԄԤԂԞԨԁԏԦӮԀԭԊԆӴԤԊԴԌԫԧӿԱԘԖԺԤԟԐԞԠԂՈԆԗՄԞԓ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[30] = NLoginCore_201.B("ĭŐĮşŜőľĽŗģľī", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[31] = NLoginCore_027.F("՝ԾըՆՠաթՠԿԨԩլաժյԵզԮԴՉՏժխոՒցՁ՚ՕկՓՙՕՐՉիժ։՚ՅցՐջօ֏ևժշֆ֙ՒՐե֙֎ն֐֟֡՞մ֛֐ռֈր։֟ֆ֜պֆ֟֩։ն", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[32] = NLoginCore_559.A("ļŝĕŗĿřłļńĿŔĵŀķĽĹřłşţŚĽľľŔŕňłŐķŏŨřŲŔňĿŎľŮűűťƀƀƀŸňżƁśŪƊƉŊšſŇŬũƑŘƅƐ", (byte)50, 65);
                    NLoginCore_396.var_java_lang_String_arr_b[33] = NLoginCore_446.B("ŒĳŝĻŕŖŞŕĴĝĞšŖşŪĪśģĩľńşŢŭŇŶĶŏŊŤňŎŊŅľŠşžŏĺŶŅŰźƄżşŬŻƎŇŅŚſżśŽŤŠŒŸőŭƍŶƊſőƊƎƋŲƓƟƆū", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[34] = NLoginCore_004.C("ҤӅѽҿҧӁҪҤҬҧҼҝҨҟҥҡӁҪӇӋӂҥҦҦҼҽҰҪҸҟҷӐӁӚҼҰҧҶҦӖәәӍӨӨӨӠҰӤөӃӒӲӧӏӶҳӐӊҿҺӳӁӵ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[35] = NLoginCore_092.D("ҘӀӃҺҶҠҀҖӅҸҞғ", (byte)50, 68);
                    NLoginCore_396.var_java_lang_String_arr_b[36] = NLoginCore_027.C("҃ґҾѽҼҷҘӌ҆ҪһҜҡҡҎӌӆҠҮӁӅӉӚңҬҙҙҟӋӊӘңӡҠӥһәҨӜӧҫӮҫӭӝҼҨӈӨӐӂӌӸӑҾҿ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[37] = NLoginCore_559.E("ՠՈՃՃՃԻԻզՐ՘ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէ՟ցբնՂ՚ՌՌՅքՌՖ", (byte)50, 69);
                    NLoginCore_396.var_java_lang_String_arr_b[38] = NLoginCore_076.B("ěĩŖĕŔŏİŤĞłœĴĹĹĦŤŞĸņřŝšŲĻńııķţŢŰĻŪũŎųŋƁœűſƂœŲŀżŸņţŦũƎŸřŖŗ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[39] = NLoginCore_201.F("ՠՈՃՃՃԻԻզՐ՘ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէքՂՒյ֊Ջս֎ժՌ՝Ֆ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[40] = NLoginCore_384.B("ĒŅĔħŞĲřĳľĞŀŕĴŗĳĿħŬĬŰŨĹĶķ", (byte)50, 66);
                    NLoginCore_396.var_java_lang_String_arr_b[41] = NLoginCore_110.C("ҹҲҡѽҧҁҪҜ҉ҧӌӆӏӁґҩҾ҇ӐҐӗҴҨӈҭӘҧӓҺӌӛұӓҭӔҾҿӤҢӜӟҤӖӅҢӮӦҿӨӢӴӈӥӭӗҲӈҹӭӧӭӞӬӁӯӻԄӲӛӟӼӽӌӷӍӓ", (byte)50, 67);
                    NLoginCore_396.var_java_lang_String_arr_b[42] = NLoginCore_091.F("ԴԷՙ՚ՇՁՄխ՘ի՞կՈՂզլթ՘Չ՛ՍմՔ՚՜ԻՓՀաՔՕդԽ՗ՄզրվպփՎժեղ՝՜աՕ֘՗ց՚֗Փ՜֗֠վ֚Ք՟վձղ", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[43] = NLoginCore_453.F("եԢՄԾՉզ՘ՄԯԼհէՅՁՑՅիՙթՍճձ՗ՐնտպՍՋպսԽԹմՖՖր՗ևւՁՇչգ֏զ֕՟ո֎լխճշճչՙ֠֏՛ո֛֕֏՝ֆձ֞փ՞֧ֆ֥կ֣ն", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[44] = NLoginCore_223.F("ՇԾՆԾԦԼԿՍՉ՞ը՞ԼՏԲԭՕչՑՑՅչնռԵխԾչՖԾՑչջՠՔըՇփու՛ևՎՊ֎ՋՒֆ֐ծՓ֖ի։չ֊ժ֠ղվ՜ո֑֠", (byte)50, 70);
                    NLoginCore_396.var_java_lang_String_arr_b[45] = NLoginCore_223.A("ĒŅĔħŞĲřĳľĞŀģĻŧĪĽĺŎŗļŞĹĶķ", (byte)50, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_396.var_java_lang_String_arr_b[0] = NLoginCore_451.E("Մ՜եՈԸ՟լԭՂԫդթԫԴզգՈմՍձՅՏԽՒՖ՚ՖՒԵճ՗ֆ", (byte)50, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_396.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ҀҐҧҷ҄ӈҢӇӇҾҪҧ҆ҿӃҎҞҳҫґұӇҞҟ", (byte)50, 67);
                }
            }
        }
    }
}

