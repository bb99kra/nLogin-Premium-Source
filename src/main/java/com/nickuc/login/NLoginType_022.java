/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
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
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_022
extends NLoginCore_353 {
    private static int ea;
    private static int gg;
    private static int dx;
    private static int hk;
    private static int fd;
    private static long cw;
    private static int ah;
    private static long cy;
    private static int aq;
    private static long fb;
    private static int bf;
    private static int fg;
    private static int hz;
    private static long bp;
    private static int l;
    private static int gy;
    private static long dn;
    private static long ce;
    private static int dr;
    private static int s;
    private static int cf;
    private static int ho;
    private static long an;
    private static long cz;
    private static int fp;
    private static int r;
    private static int ct;
    private static int q;
    private static int eb;
    private static int cp;
    private static long hd;
    private static int by;
    private static int hy;
    private static long hh;
    private static int hi;
    private static int cl;
    private static int bx;
    private static int en;
    private static int az;
    private static long bk;
    private static int at;
    private static int gp;
    private static long gh;
    private static long bv;
    private static int em;
    private static long t;
    private static int fa;
    private static int ab;
    private static long dy;
    private static long ha;
    private static long ei;
    private static long gz;
    private static int hg;
    private static int hc;
    private static long gw;
    private static int ap;
    private static long fz;
    private static int he;
    private static int gb;
    private static int ds;
    private static int gu;
    private static int ck;
    private static int k;
    private static long ey;
    private static long gk;
    private static int hx;
    private static int aa;
    private static long u;
    private static long be;
    private static double ee;
    private static int bn;
    private static long bl;
    private static int hq;
    private static int fy;
    private static int dt;
    private static int co;
    private static long gt;
    private static int bd;
    private static long ar;
    private static double ge;
    private static int cs;
    private static int fe;
    private static int ff;
    private static int dc;
    private static int gi;
    private static int dh;
    private static int ad;
    private static int gf;
    private static long ae;
    private static long ac;
    private static String[] var_java_lang_String_arr_a;
    private static int hw;
    private static int dp;
    private static long ao;
    private static long bt;
    private static long fw;
    private static int br;
    private static int n;
    private static int j;
    private static int fl;
    private static int du;
    private static long gv;
    private static int ed;
    private static int ec;
    private static int dm;
    private static int hp;
    private static long var_long_c;
    private static int ep;
    private static long x;
    private static long fk;
    private static long aj;
    private static long i;
    private static int ef;
    private static int da;
    private static int es;
    private static int ax;
    private static long ek;
    private static int cc;
    private long e;
    private static long aw;
    private static int cx;
    private static int df;
    private static int dl;
    private static int ew;
    private static int cd;
    private static long bb;
    private static int dj;
    private static int fs;
    private static long cv;
    private static long cn;
    private static long bo;
    private static int hj;
    private static long hs;
    private static int gj;
    private static int gr;
    private static int cb;
    private static int bq;
    private static int eg;
    private static int fj;
    private static int cq;
    private static int dv;
    private static int cr;
    private static int gc;
    private static int fq;
    private static int hf;
    private static long hr;
    private static int db;
    private static long bh;
    private static int fv;
    private static int dq;
    private static int ch;
    private static int ay;
    private static int go;
    private static int fc;
    private static int gs;
    private static int bs;
    private final AtomicBoolean var_java_util_concurrent_atomic_AtomicBoolean_a = new AtomicBoolean(m != 0);
    private static int eh;
    private static int gx;
    private static int am;
    private static long de;
    private static int g;
    private static int bj;
    private static int bm;
    private static int eu;
    private static String[] b;
    private static int var_int_c;
    private static int ak;
    private static int z;
    private static int er;
    private static int fi;
    private static long hv;
    private static long bz;
    private static long hl;
    private static int ht;
    private static int al;
    private static long ex;
    private static int m;
    private static long gn;
    private static double fr;
    private static int hb;
    private static int ga;
    private static int et;
    private static int bu;
    private static long el;
    private static int ej;
    private static int gl;
    private static long ai;
    private static int eo;
    private static int ba;
    private static int cj;
    private static int h;
    private static long bw;
    private static int ag;
    private static int dk;
    private static int v;
    private static int bi;
    private static long hm;
    private static int p;
    private static int di;
    private static int cg;
    private static int cu;
    private static int fn;
    private static long af;
    private static int fh;
    private static int hn;
    private static int au;
    private static int d;
    private static int dg;
    private static long hu;
    private static long bc;
    private static int fx;
    private static long av;
    private static long dz;
    private static int dw;
    private static long ca;
    private static long gq;
    private static int eq;
    private static int ft;
    private static int o;
    private static int as;
    private static int ia;
    private static int ev;
    private static int fo;
    private static int dd;
    private static long ci;
    private static long gm;
    private static long f;
    private static long bg;
    private static long fm;
    private static long fu;
    private static int ez;
    private static int gd;
    private static int y;
    private static int w;
    private static int cfr_renamed_1;
    private static int cm;

    static {
        var_int_c = (0 >>> 82 | 0 << -82) & 0xFFFFFFFF;
        d = -1 >>> 210 | -1 << ~210 + 1;
        f = Long.reverse(-2489346196331851523L);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(-1);
        i = Long.reverse(-2489346196331851523L);
        j = 0x40000000 >>> 30 | 0x40000000 << -30;
        k = (0 >>> 159 | 0 << -159) & 0xFFFFFFFF;
        l = (0 >>> 252 | 0 << ~252 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0);
        n = (0 >>> 229 | 0 << ~229 + 1) & 0xFFFFFFFF;
        o = 8192 >>> 140 | 8192 << -140;
        p = (3 >>> 96 | 3 << ~96 + 1) & 0xFFFFFFFF;
        q = 16384 >>> 78 | 16384 << ~78 + 1;
        r = Integer.reverse(0);
        s = 0x1000000 >>> 23 | 0x1000000 << -23;
        t = Long.reverse(-6380456274379960067L);
        u = Long.reverse(0x7A00000000000000L);
        v = 196608 >>> 240 | 196608 << -240;
        w = (-1 >>> 223 | -1 << ~223 + 1) & 0xFFFFFFFF;
        x = Long.reverse(-2489346196331851523L);
        y = Integer.reverse(0x40000000);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = 0x4000000 >>> 152 | 0x4000000 << -152;
        ab = Integer.reverse(-1);
        ac = Long.reverse(-2489346196331851523L);
        ad = Integer.reverse(-1610612736);
        ae = Long.reverse(-6380456274379960067L);
        af = Long.reverse(0x7A00000000000000L);
        ag = Integer.reverse(0);
        ah = 393216 >>> 16 | 393216 << ~16 + 1;
        ai = Long.reverse(-6380456274379960067L);
        aj = Long.reverse(0x7A00000000000000L);
        ak = Integer.reverse(0);
        al = (0 >>> 46 | 0 << -46) & 0xFFFFFFFF;
        am = -1073741823 >>> 190 | -1073741823 << ~190 + 1;
        an = Long.reverse(-6380456274379960067L);
        ao = Long.reverse(0x7A00000000000000L);
        ap = Integer.reverse(0x10000000);
        aq = Integer.reverse(-1);
        ar = Long.reverse(-2489346196331851523L);
        as = (0 >>> 234 | 0 << -234) & 0xFFFFFFFF;
        at = 0x2000000 >>> 217 | 0x2000000 << -217;
        au = (-2147483644 >>> 159 | -2147483644 << ~159 + 1) & 0xFFFFFFFF;
        av = Long.reverse(-6380456274379960067L);
        aw = Long.reverse(0x7A00000000000000L);
        ax = 262144 >>> 82 | 262144 << -82;
        ay = 0 >>> 71 | 0 << -71;
        az = 7168 >>> 10 | 7168 << ~10 + 1;
        ba = Integer.reverse(0x50000000);
        bb = Long.reverse(-6380456274379960067L);
        bc = Long.reverse(0x7A00000000000000L);
        bd = (0 >>> 60 | 0 << -60) & 0xFFFFFFFF;
        be = Long.reverse(456833887201394688L);
        bf = Integer.reverse(-805306368);
        bg = Long.reverse(-6380456274379960067L);
        bh = Long.reverse(0x7A00000000000000L);
        bi = Integer.reverse(0);
        bj = Integer.reverse(0x30000000);
        bk = Long.reverse(-6380456274379960067L);
        bl = Long.reverse(0x7A00000000000000L);
        bm = Integer.reverse(0);
        bn = Integer.reverse(-1342177280);
        bo = Long.reverse(-6380456274379960067L);
        bp = Long.reverse(0x7A00000000000000L);
        bq = Integer.reverse(0);
        br = Integer.reverse(0x70000000);
        bs = Integer.reverse(-1);
        bt = Long.reverse(-2489346196331851523L);
        bu = Integer.reverse(-268435456);
        bv = Long.reverse(-6380456274379960067L);
        bw = Long.reverse(0x7A00000000000000L);
        bx = Integer.reverse(Integer.MIN_VALUE);
        by = Integer.reverse(0x8000000);
        bz = Long.reverse(-6380456274379960067L);
        ca = Long.reverse(0x7A00000000000000L);
        cb = 0 >>> 71 | 0 << ~71 + 1;
        cc = 34 >>> 129 | 34 << -129;
        cd = Integer.reverse(-1);
        ce = Long.reverse(-2489346196331851523L);
        cf = Integer.reverse(0);
        cg = Integer.reverse(0x48000000);
        ch = Integer.reverse(-1);
        ci = Long.reverse(-2489346196331851523L);
        cj = Integer.reverse(0);
        ck = 3 >>> 192 | 3 << ~192 + 1;
        cl = Integer.reverse(-939524096);
        cm = (-1 >>> 185 | -1 << ~185 + 1) & 0xFFFFFFFF;
        cn = Long.reverse(-2489346196331851523L);
        co = (131072 >>> 144 | 131072 << -144) & 0xFFFFFFFF;
        cp = 16384 >>> 110 | 16384 << ~110 + 1;
        cq = 0 >>> 52 | 0 << ~52 + 1;
        cr = 1350 >>> 154 | 1350 << ~154 + 1;
        cs = Integer.reverse(398458880);
        ct = Integer.reverse(Integer.MIN_VALUE);
        cu = 5120 >>> 8 | 5120 << ~8 + 1;
        cv = Long.reverse(-6380456274379960067L);
        cw = Long.reverse(0x7A00000000000000L);
        cx = Integer.reverse(-1476395008);
        cy = Long.reverse(-6380456274379960067L);
        cz = Long.reverse(0x7A00000000000000L);
        da = 0 >>> 40 | 0 << -40;
        db = 0 >>> 136 | 0 << ~136 + 1;
        dc = 176 >>> 67 | 176 << -67;
        dd = Integer.reverse(-1);
        de = Long.reverse(-2489346196331851523L);
        df = Integer.reverse(-1073741824);
        dg = (0 >>> 31 | 0 << ~31 + 1) & 0xFFFFFFFF;
        dh = Integer.reverse(0);
        di = (16384 >>> 110 | 16384 << ~110 + 1) & 0xFFFFFFFF;
        dj = (0x100000 >>> 243 | 0x100000 << ~243 + 1) & 0xFFFFFFFF;
        dk = 8192 >>> 141 | 8192 << -141;
        dl = 0 >>> 13 | 0 << ~13 + 1;
        dm = 0x5C000000 >>> 90 | 0x5C000000 << ~90 + 1;
        dn = Long.reverse(-2489346196331851523L);
        cfr_renamed_1 = (4096 >>> 138 | 4096 << -138) & 0xFFFFFFFF;
        dp = Integer.reverse(0);
        dq = Integer.reverse(0);
        dr = 2048 >>> 235 | 2048 << ~235 + 1;
        ds = 0x2000000 >>> 216 | 0x2000000 << -216;
        dt = Integer.reverse(-1073741824);
        du = Integer.reverse(Integer.MIN_VALUE);
        dv = (0 >>> 21 | 0 << ~21 + 1) & 0xFFFFFFFF;
        dw = Integer.reverse(Integer.MIN_VALUE);
        dx = 98304 >>> 140 | 98304 << -140;
        dy = Long.reverse(-6380456274379960067L);
        dz = Long.reverse(0x7A00000000000000L);
        ea = (0x6000000 >>> 185 | 0x6000000 << ~185 + 1) & 0xFFFFFFFF;
        eb = Integer.reverse(0);
        ec = Integer.reverse(Integer.MIN_VALUE);
        ed = Integer.reverse(0x40000000);
        ee = Double.longBitsToDouble(Long.reverse(39426L));
        ef = 256 >>> 167 | 256 << ~167 + 1;
        eg = Integer.reverse(-1744830464);
        eh = Integer.reverse(-1);
        ei = Long.reverse(-2489346196331851523L);
        ej = Integer.reverse(0x58000000);
        ek = Long.reverse(-6380456274379960067L);
        el = Long.reverse(0x7A00000000000000L);
        em = Integer.reverse(0x20000000);
        en = Integer.reverse(0);
        eo = Integer.reverse(0);
        ep = (0x1000000 >>> 216 | 0x1000000 << -216) & 0xFFFFFFFF;
        eq = Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << -222;
        er = 192 >>> 6 | 192 << -6;
        es = Integer.reverse(Integer.MIN_VALUE);
        et = 0 >>> 29 | 0 << ~29 + 1;
        eu = (0 >>> 216 | 0 << -216) & 0xFFFFFFFF;
        ev = 0 >>> 113 | 0 << -113;
        ew = Integer.reverse(-671088640);
        ex = Long.reverse(-6380456274379960067L);
        ey = Long.reverse(0x7A00000000000000L);
        ez = (14336 >>> 201 | 14336 << -201) & 0xFFFFFFFF;
        fa = Integer.reverse(-1);
        fb = Long.reverse(-2489346196331851523L);
        fc = 0 >>> 50 | 0 << -50;
        fd = Integer.reverse(-1610612736);
        fe = Integer.reverse(0);
        ff = Integer.reverse(Integer.MIN_VALUE);
        fg = 0x8000000 >>> 218 | 0x8000000 << -218;
        fh = (384 >>> 231 | 384 << -231) & 0xFFFFFFFF;
        fi = Integer.reverse(0x20000000);
        fj = (0 >>> 250 | 0 << ~250 + 1) & 0xFFFFFFFF;
        fk = Long.reverse(0x2600000000000000L);
        fl = Integer.reverse(-1207959552);
        fm = Long.reverse(-2489346196331851523L);
        fn = Integer.reverse(-1073741824);
        fo = (0 >>> 141 | 0 << ~141 + 1) & 0xFFFFFFFF;
        fp = Integer.reverse(Integer.MIN_VALUE);
        fq = Integer.reverse(0x40000000);
        fr = Double.longBitsToDouble(Long.reverse(39426L));
        fs = Integer.reverse(0x40000000);
        ft = Integer.reverse(0x78000000);
        fu = Long.reverse(-2489346196331851523L);
        fv = Integer.reverse(0);
        fw = Long.reverse(0x2600000000000000L);
        fx = (992 >>> 37 | 992 << ~37 + 1) & 0xFFFFFFFF;
        fy = (-1 >>> 184 | -1 << -184) & 0xFFFFFFFF;
        fz = Long.reverse(-2489346196331851523L);
        ga = Integer.reverse(-1073741824);
        gb = (0 >>> 156 | 0 << ~156 + 1) & 0xFFFFFFFF;
        gc = Integer.reverse(Integer.MIN_VALUE);
        gd = 64 >>> 101 | 64 << -101;
        ge = Double.longBitsToDouble(Long.reverse(39426L));
        gf = (65536 >>> 207 | 65536 << ~207 + 1) & 0xFFFFFFFF;
        gg = Integer.reverse(0x4000000);
        gh = Long.reverse(-2489346196331851523L);
        gi = 0x40000008 >>> 158 | 0x40000008 << ~158 + 1;
        gj = Integer.reverse(-1);
        gk = Long.reverse(-2489346196331851523L);
        gl = Integer.reverse(0x44000000);
        gm = Long.reverse(-6380456274379960067L);
        gn = Long.reverse(0x7A00000000000000L);
        go = Integer.reverse(-1006632960);
        gp = Integer.reverse(-1);
        gq = Long.reverse(-2489346196331851523L);
        gr = (144 >>> 34 | 144 << -34) & 0xFFFFFFFF;
        gs = -1 >>> 172 | -1 << -172;
        gt = Long.reverse(-2489346196331851523L);
        gu = Integer.reverse(-1543503872);
        gv = Long.reverse(-6380456274379960067L);
        gw = Long.reverse(0x7A00000000000000L);
        gx = (0 >>> 230 | 0 << -230) & 0xFFFFFFFF;
        gy = Integer.reverse(0x64000000);
        gz = Long.reverse(-6380456274379960067L);
        ha = Long.reverse(0x7A00000000000000L);
        hb = (0 >>> 250 | 0 << ~250 + 1) & 0xFFFFFFFF;
        hc = Integer.reverse(-469762048);
        hd = Long.reverse(-2489346196331851523L);
        he = (16384 >>> 109 | 16384 << ~109 + 1) & 0xFFFFFFFF;
        hf = Integer.reverse(0x14000000);
        hg = Integer.reverse(-1);
        hh = Long.reverse(-2489346196331851523L);
        hi = 0 >>> 57 | 0 << -57;
        hj = 0 >>> 159 | 0 << -159;
        hk = Integer.reverse(-1811939328);
        hl = Long.reverse(-6380456274379960067L);
        hm = Long.reverse(0x7A00000000000000L);
        hn = 524288 >>> 242 | 524288 << -242;
        ho = (0 >>> 108 | 0 << -108) & 0xFFFFFFFF;
        hp = Integer.reverse(Integer.MIN_VALUE);
        hq = Integer.reverse(0x54000000);
        hr = Long.reverse(-6380456274379960067L);
        hs = Long.reverse(0x7A00000000000000L);
        ht = Integer.reverse(-738197504);
        hu = Long.reverse(-6380456274379960067L);
        hv = Long.reverse(0x7A00000000000000L);
        hw = 0 >>> 67 | 0 << -67;
        hx = (0 >>> 79 | 0 << -79) & 0xFFFFFFFF;
        hy = Integer.reverse(0);
        hz = Integer.reverse(0x34000000);
        ia = Integer.reverse(0x34000000);
        var_java_lang_String_arr_a = new String[hz];
        b = new String[ia];
        NLoginType_022.void_b();
    }

    private static String a(int n, long l) {
        l ^= 0x5EL;
        l ^= 0x96C92A574E40FC7DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(26 + 43), 83, (byte)(33 + 14), (byte)(52 + 15), (byte)(32 + 34), (byte)(61 + 6), (byte)(42 + 5), (byte)(24 + 56), (byte)(44 + 31), (byte)(3 + 64), (byte)(49 + 34), (byte)(32 + 21), (byte)(30 + 50), (byte)(58 + 39), (byte)(95 + 5), (byte)(16 + 84), (byte)(72 + 33), 110, (byte)(18 + 85)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.D("пьыЎюъхюљшЕѓїѐѓљЛިޥީ޷޷ު޳ޱޘްޟ޾ުޣ޼", (byte)13, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_022.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void void_b() {
        int n;
        var_long_c = -4680975955755782427L;
        long l = var_long_c ^ 0x96C92A574E40FC7DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(56 + 13), (byte)(43 + 40), (byte)(9 + 38), (byte)(64 + 3), (byte)(55 + 11), (byte)(53 + 14), 47, (byte)(44 + 36), (byte)(45 + 30), (byte)(14 + 53), (byte)(16 + 67), (byte)(46 + 7), (byte)(12 + 68), (byte)(18 + 79), (byte)(21 + 79), (byte)(17 + 83), (byte)(104 + 1), (byte)(49 + 61), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), (byte)(78 + 5)}, StandardCharsets.UTF_8));
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
                    NLoginType_022.b[0] = NLoginCore_138.D("֔՚֍՜֒՜՟քա֠դծ", (byte)123, 68);
                    NLoginType_022.b[1] = NLoginCore_027.A("ƮǁƪưǮǎǔƯƶƭƯǔǍǖƵǼǫǛǾƼǻȁǈǉ", (byte)123, 65);
                    NLoginType_022.b[2] = NLoginCore_223.F("հ֋֟֏֮֞յ֫ծָֹ֨չ֍֘պնֲֺ֚֕֝֊֋", (byte)123, 70);
                    NLoginType_022.b[3] = NLoginCore_004.B("ǌǣǍǏƱƫǐǏǨǄǪƽ", (byte)123, 66);
                    NLoginType_022.b[4] = NLoginCore_324.D("֕֙Փջք֔տծֈա֗ծ", (byte)123, 68);
                    NLoginType_022.b[5] = NLoginCore_384.D("ֈ֐֏ջխ՜պ֝՝պռպս֝տո֟բ֊֑ճ֤֋֣֕փֆֺ֖֒ֆֻ׀չչֹּ֖֠֫׀և֕֎", (byte)123, 68);
                    NLoginType_022.b[6] = NLoginCore_027.F("֨լխֈ֐ր֪֗ժֱղּ։֒պ֑֟վֻֻׂ֛֥֪֙֜֒ׄ։և֭֍׏ְ֛֊ֶׇ֪֞֟֨א֟", (byte)123, 70);
                    NLoginType_022.b[7] = NLoginCore_110.A("ǪƽǅǢǒƱǂǅǩǌǖǍǹƹǛǈƷǭǒǰǺǴȂƷǗƿǇǘȋǉǆǛǛǆȃȀǯǜǌǌȔȌȒȇǔǯǥȔǴǼǱȓȠǬȣȡȏȦǞȣǻȅǞǭȥȭȫȌȑǫȏȃȦȓȐǽ", (byte)123, 65);
                    NLoginType_022.b[8] = NLoginCore_091.E("֢֯ի֓հֲև֋յ֌ւղ֗կִֺ֗֠֟֡ջָ֤֙ֈօ֛֤֣֖ׅ֘", (byte)123, 69);
                    NLoginType_022.b[9] = NLoginCore_027.E("֬ռ֋֒ւ֝ք֔֐մ֏ֱօ֖֘֨֔տֱ֭ւսֱ֐րֺ֖֦֧֓ׄ׃ֿ֛׈֊֔׃ֵָׂ֪֖֠׎דהוגֵּ֜ׄ֜֜׀ׇ֨ט֡נׂ׉׋", (byte)123, 69);
                    NLoginType_022.b[10] = NLoginCore_091.F("ս֯ժօ֓ձ֩ճֈղ֎պ֝շ֒սֵ֨ւִׅ֡ׄ׃׈֞֒֡־ׇֻ֯֎֣ד׎ִ׉ֶׂ֪הֵ֪֦֗אִ֞ך֪ך׃֤׀ַסׂז֧ׄתָׯ֦׋װׇּ״ִ׍הְפֿ", (byte)123, 70);
                    NLoginType_022.b[11] = NLoginCore_324.B("ƤǙƢƭǮƮƪǀǪǃǉǕƲǫǩǧǓǖǻƼǔǑǞǿǦǯȆǜȉǵǼǩȀȋǭǝȅǣǮȔȆǰȎȅȚțȒȒȓǻȁȏȡȟǤȥǯǰǴȃȩǫȕȇȥȯȑǨȒȏǴȉȫȊȦșȳǭȜȶȾȑȋȿȏȏțɆȔȕȷȗɇȳȠș", (byte)123, 66);
                    NLoginType_022.b[12] = NLoginCore_110.F("֞ռղִ֭֔ձ֨֕֌֥֓ղ֏ֿ֗֝ջւ֘֎շ֯֓ևֆׂ֨׌ք׍ׇׂ֪֤֬֞֫֕։ׅ׊֧֒׊֩׊֗טׁ֟֡׎׆ג֢׀חהץהפ׌װ֫כ׎׳׌וצס֪׬ײד׫׊׸חןד׷׷؂؅׻׺؈׆؀׋פץננׇ؀؈׻؎׌ו؁؁׏׶גךש؊׭׮׾ؖױآ׽ת׫", (byte)123, 70);
                    NLoginType_022.b[13] = NLoginCore_027.B("ǣƨƿƼưǓƴƧƨǗƸǎƹǔǱǦƷǉƹǘǙǐȀǍǓǻȆǞǴȇȉǵǮǍǇǟȀȐȈǣǫǩǐȆǒǓȚǲǩȐȜǽǘǙȡȑȓǦțǷǤǽǴǬȯȟȦǫǲȏȢȲǵȒȑȶȌȕȐȷȨȐȝȘǸȹȔȾɁȁɂɈțȩȭȸșȤȠȌȈȢȞɈȌɊɎɚȨɗȕȚȻȕȩȞȻɠɒȤɠȟɉəȳȴɧɮɣȬȦɰȮɉɪɭɣɥȯȽ", (byte)123, 66);
                    NLoginType_022.b[14] = NLoginCore_004.B("ǣǈƹǥƲǡǫǆǈǢǬƲǊǰǅƸǲǌǭǵȀǋǈǉ", (byte)123, 66);
                    NLoginType_022.b[15] = NLoginCore_446.A("ǎƥǯǄǯǉǣǒƬǟǪƽ", (byte)123, 65);
                    NLoginType_022.b[16] = NLoginCore_173.B("ǇƫǐǜƺǓǱǞǶǫǷƹǻǙǝǨǉǚǟƽǠǱǈǉ", (byte)123, 66);
                    NLoginType_022.b[17] = NLoginCore_110.A("ǅƨǎƩǳǏǣǬǉǔǪƽ", (byte)123, 65);
                    NLoginType_022.b[18] = NLoginCore_076.A("ǮƾǧƣǎǥǞǳƵǠǬǔǓǤǖǾǭǒǟǴƾƿǰȀǳǲǑǂǦǹȂǻȏǁǉǣȇȋǣǮȏǫȉǺȓȕǒǥȈǱȞǮȜșǴȆǟțǞǡǩȀȩȪȢǺǰǬȄȥȳǫȗȟǳȂȰǳȏǸȼȬǸɀȍȵȑɂȀȀȄȣȽȧȿȌ", (byte)123, 65);
                    NLoginType_022.b[19] = NLoginCore_223.B("ǘǄƩǬǈǦƲǲƵǎǂǙǨǎǸǮǽǔǮǋǿǱǈǉ", (byte)123, 66);
                    NLoginType_022.b[20] = NLoginCore_110.B("ǪƽǅǢǒƱǂǅǩǌǖǍǹƹǛǈƷǭǒǰǺǴȂƷǗƿǇǘȋǉǆǛǛǆȃȀǯǜǌǌȔȌȒȇǔǯǥȔǴǼǱȓȠǬȣȡȏȦǞȣǻȅǞǭȥȭȫȌȑǫȏȃȦȓȐǽ", (byte)123, 66);
                    NLoginType_022.b[21] = NLoginCore_027.C("֑֞՚ւ՟֡նպդջձաֆ՞ֆ֏֣֩֎֐ժֈ֧֓շմ֊և֓֒օִ", (byte)123, 67);
                    NLoginType_022.b[22] = NLoginCore_559.E("֛ք֣֍զհհְշղִ֤֛չ֧ռֳֻֿ֭֍ֽ֕׀֨ւׁ֣֔׆׊֭֯׌֐֊֌ַֽ֧֞ךֵלׇׄמ֗֯׌ְלֲֶֻעֵ׈וסׇ֣֩֫", (byte)123, 69);
                    NLoginType_022.b[23] = NLoginCore_138.A("ƶǋƽǑƨƲǀǮǃǢǴƶǸǭǬǭǵǻǨȁǹǕǓǒǜǂǞǘǘƽǊǣǺǺǧǪȃȄǪȁǎȌȂǱǸǳǧǯǜǛǮǡȝȜǜȀǹǶȠǻǣȋȪȧȃǨǬȀȬȤȄȢȰȲȡǫǸȗǼȳȪȓȰȪȰȰȀȢȐȿȝȆȲȽɄȷȯȤȨȍɆɍȭȟɐȧɂȝ", (byte)123, 65);
                    NLoginType_022.b[24] = NLoginCore_138.B("ǘǙǟǬǨǬǕǱǅǒǃǙǥǣǑǩǍƼǪǢǢǙǺǁȄǧȉȃǦȁǣǶǬǫǏǲȉǾǊȀǷȃǘǫǯǯǲǯǐǜȞǫǮȚțȠȝȢǸǿȇțȃȁȋȘȢȥȨȇȴǲǵȶȲǽ", (byte)123, 66);
                    NLoginType_022.b[25] = NLoginCore_223.D("թ֔տւկ֣օ֖ց֠ՠծ", (byte)123, 68);
                    NLoginType_022.b[26] = NLoginCore_387.C("֏ն֟ՠՠ֤֕ջտ֟֔փափ֪֟֗֯փվ֌քկ֭֠ժֳ֡֏ֳֵ֨֌չոս֝֗־֣֙֒րֈָֺ֛֚֡׋׎׊֏ֲ֮֓֫׌֢׈֑֚־ל֪֝֙ד׍ח֞מו֤־צל׀֦ׅ֬צ֣׋׮עֳ֮תו׊זת׷ה׶", (byte)123, 67);
                    NLoginType_022.b[27] = NLoginCore_138.F("֤գֈճ֤ւֵֵֹֺ֧֓֨֔ֈּ֭֭ւֱִ֝֊֋", (byte)123, 70);
                    NLoginType_022.b[28] = NLoginCore_076.D("ը՚֎ր՛խչև֓՚ոճ֛զ֣։չֱ֑֩֡֋մ֌֣֡փֱֵֺ֭֩֗֙֡֌ֵׅ֫ׄ־ּ֟֨փք־ֹ֯ֈ׎ְׁ֣֩׀ָ֓י֨ךְָֻ", (byte)123, 68);
                    NLoginType_022.b[29] = NLoginCore_201.A("ǘǙǟǬǨǬǕǱǅǒǃǙǥǣǑǩǍƼǪǢǢǙǺǁȄǧȉȃǦȁǣǶǬǫǏǲȉǾǊȀǷȃǘǫǯǯǲǯǐǜȞǫǮȚțȠȝȢǸǿȇțȃȁȋȘȢȥȨȇȴǲǵȶȲǽ", (byte)123, 65);
                    NLoginType_022.b[30] = NLoginCore_223.D("թ֔տւկ֣օ֖ց֠ՠծ", (byte)123, 68);
                    NLoginType_022.b[31] = NLoginCore_575.E("ֳ֛֪֚֮֮֡֗և֔օ֛֧֥֓֫֏վּ֤֤֛֬փ׆֩׋ׅ֨׃ִָ֥֑֭֮׋׀֌ֱֱֱִֹׂׅ֚֭֒֞נְ֭לםעןפֺׁ׉םׅ׃׍ךפקת׉׶ִַ׸״ֿ", (byte)123, 69);
                    NLoginType_022.b[32] = NLoginCore_223.E("պ֥֐֓րֱִ֖֧֒ձտ", (byte)123, 69);
                    NLoginType_022.b[33] = NLoginCore_559.E("ցօ֏ե֨֍ֳֵ֖֦ւտ", (byte)123, 69);
                    NLoginType_022.b[34] = NLoginCore_076.C("խ՞՚֢֙լ֑֟յ՞գմ֪֘փ֎ս֐ր֮֏ռչպ", (byte)123, 67);
                    NLoginType_022.b[35] = NLoginCore_387.D("Ֆ֏՚֘֝վ֍դճ֩ցծ", (byte)123, 68);
                    NLoginType_022.b[36] = NLoginCore_138.F("ևժ֐իֵ֑֥֮֋֖֬տ", (byte)123, 70);
                    NLoginType_022.b[37] = NLoginCore_223.B("ǇƾǜǭǰǨǀǌǍǌǕǩǥǜǗǬǫǉƲǘǚǳǗǙǑǰȂǦǲȁȊȅǢǋǇǪǬǌǢǬȃǍǠǝ", (byte)123, 66);
                    NLoginType_022.b[38] = NLoginCore_092.C("նՙտ՚֤ր֔֝պօ֛ծ", (byte)123, 67);
                    NLoginType_022.b[39] = NLoginCore_324.B("ǢƽǡǑƤǔǩǊǑƩƪǇǑǦǉǒǒǔǚǙǰǷƿǃǼǢǴǜǃǢǔǤǩǦǧǊȅǏȀǡǥȄǗǝ", (byte)123, 66);
                    NLoginType_022.b[40] = NLoginCore_324.A("ǥƫǱǱǑƼƱǪƭǌǐƽ", (byte)123, 65);
                    NLoginType_022.b[41] = NLoginCore_453.C("ոֈսւցճց֝բ֛ղաց֝֙ը֪֍էְժ֢֦֬օմֆָ֤֯֫շպֹֹֻ֭֙֎ָׂ֛֤ׅ֞׋֌ׇ֌֠׋דֳ֦֝׌֭֐ֵ׈ח֓ח֩", (byte)123, 67);
                    NLoginType_022.b[42] = NLoginCore_138.A("ǇƼǙƾǏƥǲƬǔƿǬǢǥǭǼǻǋƸƿǝǫǑƶǁǆǠǞȆǽǈǻǺ", (byte)123, 65);
                    NLoginType_022.b[43] = NLoginCore_324.E("ևժ֐իֵ֑֥֮֋֖֬տ", (byte)123, 69);
                    continue block7;
                }
                case 1: {
                    NLoginType_022.b[0] = NLoginCore_446.E("֐վ֢ր֥էըָ֪֎ւֱֺ։ս־։ռչֺׄ֍֊֋", (byte)123, 69);
                    NLoginType_022.b[1] = NLoginCore_004.B("ƮǁƪưǮǎǔƯƶƭưƫƬǹǰǚǛƿǖǢǌǛǈǉ", (byte)123, 66);
                    NLoginType_022.b[2] = NLoginCore_076.A("ƮǉǝǍǜǬƳǩƬǶǩǺǃƴǚƻǝǒǋǭǢȁǈǉ", (byte)123, 65);
                    NLoginType_022.b[3] = NLoginCore_138.B("ǨǝǭǂǢƬǥǇǤǆǉǭƬǫǗǼƻƱǝǯǖǛǈǉ", (byte)123, 66);
                    NLoginType_022.b[4] = NLoginCore_091.E("֛օֲ֤֭վ֔֨կ֓֨տ", (byte)123, 69);
                    NLoginType_022.b[5] = NLoginCore_453.A("ǗǟǞǊƼƫǉǬƬǉǋǉǌǬǎǇǮƱǙǠǂǳǚǲǤǒǕȉǥǡǕȊǡǙȀǇȁȇǳǰǑȆǓȁȇǤǔȝǳǷȘȒȏǻǨǩ", (byte)123, 65);
                    NLoginType_022.b[6] = NLoginCore_451.F("֨լխֈ֐ր֪֗ժֱղּ։֒պ֑֟վֻֻׂ֛֥֪֙֜֒ׄ։և֭֍ֱאֱָָׅ֥֝֠׎ׂ֕׊ג֩נט֘םמְ֪֭֫", (byte)123, 70);
                    NLoginType_022.b[7] = NLoginCore_223.D("֛ծն֓փբճն֚սևվ֪ժ֌չը֞փֳ֥֡֫ըֈհո։ּպշ֌֌շֱִ֠֍սսֽׅ׃ָօ֖ׅ֥֢֭֠ׄב֝הג׀ח֏הֶ֬֏ֺֽֿ֞֙֬֝־ׂׄ׈כ׊ֿ֨׋ׅ׭ׅ׃ך׋עֹֺ", (byte)123, 68);
                    NLoginType_022.b[8] = NLoginCore_076.E("֢֯ի֓հֲև֋յ֌ւղ֗կִֺ֗֠֟֡ջׁ֗ևַ֧֤֚քׅ׃֟׏ֻ֭֞וֵ֤֍ֶׂ֨֟", (byte)123, 69);
                    NLoginType_022.b[9] = NLoginCore_138.B("ǪƺǉǐǀǛǂǒǎƲǍǯǃǖǦǒǔƽǯǫǀƻǯǎƾǸǑǔȂǤǥȁǽǙȆǈǒȁǨȀǞǶǳǔȌȑȒȓȐǺǳǚȂǝȡȁǦǯȐȊȦșȃȍ", (byte)123, 66);
                    NLoginType_022.b[10] = NLoginCore_223.B("ƻǭƨǃǑƯǧƱǆưǌƸǛƵǐƻǦǳǀǟǲȂȃȁȆǜǐǟǼǹǭȅǌǡȑȌǲȇǨǴȀȒǳǨǤǕȎǜǲȘǨȘȁǢǾǵȟȀȔȂǥȨǶȭȌȃǻǹǾȟǯǵȲȗȔǽ", (byte)123, 66);
                    NLoginType_022.b[11] = NLoginCore_076.C("Օ֊Փ՞֟՟՛ձ֛մպֆգ֚֜֘քև֬խօւ֏ְַ֗֠֍ֱֺּ֦֭֚֞֎ֶֶַֿׅ֔֟֡׋׌׃׃ֲׄ֬׀גא֕זִ֥֠֡ך֜׆ָזנׂ֙׃׀ֺ֥לֻח׊פ֞׍קׯּׂװ׀ׄ֯גַצֲַב׻טֵ׻׺ת׮׀ד׽ה؁כ׈׎", (byte)123, 67);
                    NLoginType_022.b[12] = NLoginCore_575.C("֍իա֣֜փՠ֗քջւ֔ավ֮ֆ֌ժձևսզ֞ւնյֱֻ֗ճֱֶּ֛֙֍֚ք֓ոִֹցֹֹ֖֘ֆׇ֎ְ֐ֵֽׁ֑֯׆׃ה׃דֻן֚׊ֽעֻׄוא֙כסׂךֹק׆׎ׂצצױ״תש׷ֵׯֺדה׏׏ֶׯ׷ת׽ֻׄװװ־רץתׇי׺ע׈ؒ؏؎װשת؄דؐעׯװ׮ؐ", (byte)123, 67);
                    NLoginType_022.b[13] = NLoginCore_173.B("ǣƨƿƼưǓƴƧƨǗƸǎƹǔǱǦƷǉƹǘǙǐȀǍǓǻȆǞǴȇȉǵǮǍǇǟȀȐȈǣǫǩǐȆǒǓȚǲǩȐȜǽǘǙȡȑȓǦțǷǤǽǴǬȯȟȦǫǲȏȢȲǵȒȑȶȌȕȐȷȨȐȝȘǸȹȔȾɁȁɂɈțȩȭȸșȤȠȌȈȢȞɈȌɊɎɚȨɗȕȚȻȕȩȞȻɠɒȤɠȟɉəȳȴɧɮɤɡɀɝɃɳɇɁɤɲɄȽ", (byte)123, 66);
                    NLoginType_022.b[14] = NLoginCore_091.D("֔չժ֖գ֒֜շչ֣֓֜ճդզ֧֮֟հ֎ֲ֡չպ", (byte)123, 68);
                    NLoginType_022.b[15] = NLoginCore_324.C("ծ֔֘ս՞կ֘֐ՙ֓յծ", (byte)123, 67);
                    NLoginType_022.b[16] = NLoginCore_076.B("ǇƫǐǜƺǓǱǞǶǫǶǤǰǦƹǎǛǒǱǠǟǋǈǉ", (byte)123, 66);
                    NLoginType_022.b[17] = NLoginCore_387.E("թ֎֤֩֌ֲճ֏֙֘ֆտ", (byte)123, 69);
                    NLoginType_022.b[18] = NLoginCore_138.A("ǮƾǧƣǎǥǞǳƵǠǬǔǓǤǖǾǭǒǟǴƾƿǰȀǳǲǑǂǦǹȂǻȏǁǉǣȇȋǣǮȏǫȉǺȓȕǒǥȈǱȞǮȜșǴȆǟțǞǡǩȀȩȪȢǺǰǬȄȥȳǫȗȟǳȂȰǳȏǸȼȬǸɀȍȴǻȖǾȣȡȄȸȫȫȤ", (byte)123, 65);
                    NLoginType_022.b[19] = NLoginCore_138.A("ǘǄƩǬǈǦƲǲƵǎǀǳǗǱǔƸǓǈƸƻƴǛǈǉ", (byte)123, 65);
                    NLoginType_022.b[20] = NLoginCore_138.E("֬տև֤֔ճքև֫֎֘֏ֻջ֝֊չֲֶּ֯֔ׄչ֙ց։֚׍֋ֈ֝֝ֈֱׂׅ֞֎֎ז׎ה׉ֱ֖֧זֶ־ֳוע֮ץףבר֠ץׇֽ֠֯פ֫מׇף׵ױ׬תֶׅד׭חזָֽחֽ׃؅ם׊׋", (byte)123, 69);
                    NLoginType_022.b[21] = NLoginCore_446.E("֢֯ի֓հֲև֋յ֌ւղ֗կִֺ֗֠֟֡ջָֽ֖֯׊ָֻ׆ׁ֫׉ׇׇ֦֦֣֮־֥֮֓֡֟", (byte)123, 69);
                    NLoginType_022.b[22] = NLoginCore_027.B("ǙǂǡǋƤƮƮǮƵưǲǢǙƷǥƺǱǹǫǽǋǓǻǾǦǀǡǒǿȄȈǭǫȊǎǈǊǻǜǥǵȘǳȚȂȅȜǕǭȊǮȚǰǲǠȝȡȁǨȉǿȥȂȮǷȤȌȏȜȮȤȐȌȟȢǽ", (byte)123, 66);
                    NLoginType_022.b[23] = NLoginCore_091.C("էռծւՙգձ֟մ֥֓էֲ֦֪֩֞֝֞֬֙ֆքփ֍ճ֏։։ծջֲִֵ֛֛֔֫֫֘տֳֽ֢֤֩֘֠֍֌֟֒׎׍֍ֱ֪֧בּ֬֔כטֱִ֙֝םוֵדסףג֜֩׈֭פכׄסכססֱדׁװ׎ַף׮׵ראּט׳מגל׷עז׿׎", (byte)123, 67);
                    NLoginType_022.b[24] = NLoginCore_027.D("։֊֐֝֙֝ֆ֢նփմ֊֖֔ւ֚վխ֛֓֓֊֫ղֲִֵֺ֧֘֗֔֝֜րֺ֣֯ջֱִ֨։֣֜֠֠֠ց֍׏֜֟׋׌ב׎דְָ֩׌ֲֲֳִַֽֽֿע־ֺֿׂ֡צ׊י׉ֽ֢ףײג׌ֹֺ", (byte)123, 68);
                    NLoginType_022.b[25] = NLoginCore_201.D("իձ՝՞գ֜գտ֧֨չծ", (byte)123, 68);
                    NLoginType_022.b[26] = NLoginCore_453.E("֠ևְձձֵ֦֌֐ְ֥֔ղְֻ֔֨׀֔֏֝֕րֱ־ջֲֹׄ֠׆ׄ֝֊։֎֮֨׏ִ֪֣֑֙׋ֲ֫׉֬לןכּֿ֤֠׃םֳי֢֫׏׭ֻ֪֮פמר֯ׯצֵ׏׷׭בַזֽ׷ִל׿؁ֿ׏ֿ؊דנ؆؇ףנ", (byte)123, 69);
                    NLoginType_022.b[27] = NLoginCore_384.B("ǢơǆƱǢǀǑǦǷǸǓǣǒǒǆǔǮǱƸǴǏǜǻǡǱǢǲǪǤǆȊȄ", (byte)123, 66);
                    NLoginType_022.b[28] = NLoginCore_027.F("չի֑֟լվ֊֤֘ի։ք֬շִ֚֊ֲֺׂ֢֜օֲִ֝֔׆ֺ׋ׂ֪֨־ֲּ֝וז׆׏ְֹ׍֔֕׏׀׊֙ןֺׁׄיצְֵדֺֹמ׈א", (byte)123, 70);
                    NLoginType_022.b[29] = NLoginCore_092.C("։֊֐֝֙֝ֆ֢նփմ֊֖֔ւ֚վխ֛֓֓֊֫ղֲִֵֺ֧֘֗֔֝֜րֺ֣֯ջֱִ֨։֣֜֠֠֠ց֍׏֜֟׋׌ב׎דְָ֩׌ֱֲִז־ׂ֞־ףק֦חנ֣דֺתׅ֨׃׫מׂײֹֺ", (byte)123, 67);
                    NLoginType_022.b[30] = NLoginCore_223.C("֟՜֖֚՛օվս֨ՠցծ", (byte)123, 67);
                    NLoginType_022.b[31] = NLoginCore_223.E("ֳ֛֪֚֮֮֡֗և֔օ֛֧֥֓֫֏վּ֤֤֛֬փ׆֩׋ׅ֨׃ִָ֥֑֭֮׋׀֌ֱֱֱִֹׂׅ֚֭֒֞נְ֭לםעןפֺׁ׉םׅ׃נּ׮ֳׂנװׯִסח׮׏ׯט׿ֿ׉׵ּ־ם׊׋", (byte)123, 69);
                    NLoginType_022.b[32] = NLoginCore_384.F("֭֠֊֨֨օ֢֍ָ֣չտ", (byte)123, 70);
                    NLoginType_022.b[33] = NLoginCore_559.D("չ֋֘ծչ֗֍հ֝վ֘֘֬ցլ֞ֈըլսխ֢չպ", (byte)123, 68);
                    NLoginType_022.b[34] = NLoginCore_138.D("խ՞՚֢֙լ֑֟յ՞աթ֘֔եջ֤֠֡սքռչպ", (byte)123, 68);
                    NLoginType_022.b[35] = NLoginCore_091.C("՜ՙ֙֍֖֌օ֢հյ֛ծ", (byte)123, 67);
                    NLoginType_022.b[36] = NLoginCore_004.B("ǬƯǫǏƾǁǮƾǍǃǲƽ", (byte)123, 66);
                    NLoginType_022.b[37] = NLoginCore_324.B("ǇƾǜǭǰǨǀǌǍǌǕǩǥǜǗǬǫǉƲǘǚǳǗǙǑǰȂǦǲȁȊȅȈǗǯǠǜǭǑȋǑǦȎǝ", (byte)123, 66);
                    NLoginType_022.b[38] = NLoginCore_453.D("սր֕ջ՚֝գ֢֧֒֒ծ", (byte)123, 68);
                    NLoginType_022.b[39] = NLoginCore_451.C("֓ծ֒ւՕօ֚ջւ՚՛ու֗պփփօ֋֊֡֨հմ֥֭֓֍մ֓օ֕֯վ։ո֙նֽւ֝׀ւׇ֤ֈַ֜׆֐֢֩֋֚֜֙", (byte)123, 67);
                    NLoginType_022.b[40] = NLoginCore_223.C("՘֋թ֌֎ա֜ծ֖֜֗֠ճ֛֨ծ֣֦րռֳ֌չպ", (byte)123, 67);
                    NLoginType_022.b[41] = NLoginCore_091.C("ոֈսւցճց֝բ֛ղաց֝֙ը֪֍էְժ֢֦֬օմֆָ֤֯֫շպֹֹֻ֭֙֎ָׂ֛֤ׅ֞׋֌ׇ֌֠׋דֲ֦֔׀֭֘ג׎יָֽ֛ד֚ךחִ֡םעף֦֮֠", (byte)123, 67);
                    NLoginType_022.b[42] = NLoginCore_091.C("ոխ֊կրՖ֣՝օհ֖֭֝֓֞֬ռթհ֎֜օ֫լָ֦֦֗ձ֦֬֏", (byte)123, 67);
                    NLoginType_022.b[43] = NLoginCore_446.A("ǏǗǑǢƮǡǟǃǟǐǦƽ", (byte)123, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_022.b[0] = NLoginCore_575.C("֎՞ժ֑ւպբ֜չճըծ", (byte)123, 67);
                    continue block7;
                }
                case 4: {
                    NLoginType_022.b[0] = NLoginCore_110.D("։ղ֚֞՚դ֤փ֡ձ֪ք֣պ֣ն֦֡և։֔ռչպ", (byte)123, 68);
                }
            }
        }
    }

    public NLoginType_022(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginType_022.c("㺀", (int)(var_int_c & d), (long)f), (String)NLoginType_022.c("㺃", (int)(g & h), (long)i), j != 0, k != 0, new String[l]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_022.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.D("ӖӸӺӚӾԝԕԫԗӦԤԚԨԢӫԐԲԱԩԯԩӾ", (byte)83, 68), NLoginType_022.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.B("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӱӮӲԀԀӳӼӺӡӹӨԇӳӬԅſ", (byte)83, 66) + string + NLoginCore_559.D("Ө", (byte)83, 68) + methodType.toString(), exception);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void b(NLoginCore_494 var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK], 1[TRYBLOCK]], but top level block is 18[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

