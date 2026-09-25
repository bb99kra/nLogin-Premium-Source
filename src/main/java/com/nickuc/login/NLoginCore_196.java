/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_549;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_392;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_020;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_214;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_323;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_086;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_402;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_428;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_196
extends NLoginCore_098 {
    private static int it;
    private static long ds;
    private static int var_int_e;
    private static int fe;
    private static long kz;
    private static int ea;
    private static int je;
    private static long lt;
    private static long cp;
    private static long o;
    private static int ch;
    private static int mc;
    private static int ks;
    private static int ii;
    private static long gr;
    private static int jb;
    private static int fr;
    private static long cw;
    private static int ec;
    private static long bm;
    private static long cx;
    private static int iq;
    private static long ik;
    private static int lx;
    private static long bh;
    private static long cf;
    private static long lv;
    private static int fz;
    private static int bw;
    private static int dk;
    private static int ls;
    private static long bs;
    private static int bf;
    private static long ca;
    private static long q;
    private static long lg;
    private static int lo;
    private static long ee;
    private static long bo;
    private static long gk;
    private static long cu;
    private static int ll;
    private static int fl;
    private static int ix;
    private static long id;
    private static int dz;
    private static long dc;
    private static int kq;
    private static long et;
    private static int jl;
    private static int kx;
    private static int ji;
    private static long lm;
    private static int fa;
    private static final String R;
    private static int jo;
    private static long ci;
    private static int fd;
    private static int cm;
    private static int fh;
    private static int mb;
    private static long eb;
    private static long eo;
    private static long kk;
    private static int fs;
    private static long hl;
    private static long ge;
    private static long ky;
    private static long ig;
    private static int kr;
    private static long cz;
    private static int kc;
    private static long hp;
    private static long hz;
    private static int jp;
    private static int li;
    private static int ho;
    private static int ke;
    private static long lj;
    private static int cv;
    private static long gu;
    private static int gq;
    private static int bp;
    private static long gx;
    private static int hg;
    private static int jt;
    private static long lw;
    private static long kn;
    private static long gi;
    private static int lb;
    private static int dh;
    private static long be;
    private static int eq;
    private static long mf;
    private static long dv;
    private static long fq;
    private static long jg;
    private static int im;
    private static int kl;
    private static long lq;
    private static int ij;
    private static long bv;
    private static int la;
    private static int gm;
    private static long gp;
    private static int kh;
    private static int bd;
    private static long lc;
    private static int ex;
    private static long by;
    private static long km;
    private static long ha;
    private static int md;
    private static int kf;
    private static long kb;
    private static int ek;
    private static int ic;
    private static int da;
    private static int kv;
    private static int em;
    private static long es;
    private static long dy;
    private static int ln;
    private static int hm;
    private static long df;
    private static int ma;
    private static long iz;
    private static long io;
    private static int eu;
    private static long jc;
    private static int al;
    private static int lu;
    private static int cb;
    private static long cd;
    private Boolean b;
    private static long lk;
    private static int cg;
    private static long ew;
    private static long fy;
    private static int z;
    private static long p;
    private static int kd;
    private static int kg;
    private static int le;
    private static int ki;
    private static int cj;
    private static long me;
    private static int lr;
    private static long bk;
    private static long is;
    private static long dp;
    private static int cr;
    private static int hy;
    private static int bl;
    private static long ku;
    private static int kw;
    private static long cn;
    private static int cy;
    private static long br;
    private static long dm;
    private static int ja;
    private static long hi;
    private static int ao;
    private static long iv;
    private static long ct;
    private static long ab;
    private static int fp;
    private static int ed;
    private static long el;
    private static int fm;
    private static long fx;
    private static int gv;
    private static int gg;
    private static int bu;
    private static int ld;
    private static long at;
    private static long ev;
    private static int fv;
    private static long ly;
    private static int ka;
    private static int lh;
    private static int jf;
    private static long lp;
    private static int ko;
    private static int dt;
    private static long ef;
    private Boolean a;
    private static long lz;
    private static int dn;
    private static long ez;
    private static int gc;
    private static int lf;
    private static int kj;
    private static int iy;
    private static long go;
    private static int kp;
    private static String[] var_java_lang_String_arr_e;
    private static int y;
    private static String[] f;
    private static long kt;
    private static int in;
    private static int fb;

    static {
        var_int_e = (0 >>> 120 | 0 << ~120 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-4544791751411500518L);
        q = Long.reverse(0x4800000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(-1);
        ab = Long.reverse(-8580017017535464934L);
        al = 0 >>> 32 | 0 << ~32 + 1;
        ao = Integer.reverse(0x40000000);
        at = Long.reverse(-8580017017535464934L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-8580017017535464934L);
        bf = 0x2000000 >>> 87 | 0x2000000 << -87;
        bh = Long.reverse(-4544791751411500518L);
        bk = Long.reverse(0x4800000000000000L);
        bl = Integer.reverse(-1610612736);
        bm = Long.reverse(-4544791751411500518L);
        bo = Long.reverse(0x4800000000000000L);
        bp = -1073741824 >>> 61 | -1073741824 << -61;
        br = Long.reverse(-4544791751411500518L);
        bs = Long.reverse(0x4800000000000000L);
        bu = 28672 >>> 236 | 28672 << -236;
        bv = Long.reverse(-8580017017535464934L);
        bw = 0x20000000 >>> 26 | 0x20000000 << -26;
        by = Long.reverse(-4544791751411500518L);
        ca = Long.reverse(0x4800000000000000L);
        cb = (-1879048192 >>> 188 | -1879048192 << -188) & 0xFFFFFFFF;
        cd = Long.reverse(-4544791751411500518L);
        cf = Long.reverse(0x4800000000000000L);
        cg = (655360 >>> 80 | 655360 << -80) & 0xFFFFFFFF;
        ch = -1 >>> 177 | -1 << -177;
        ci = Long.reverse(-8580017017535464934L);
        cj = Integer.reverse(1462763520);
        cm = Integer.reverse(-805306368);
        cn = Long.reverse(-4544791751411500518L);
        cp = Long.reverse(0x4800000000000000L);
        cr = 196608 >>> 238 | 196608 << -238;
        ct = Long.reverse(-4544791751411500518L);
        cu = Long.reverse(0x4800000000000000L);
        cv = (416 >>> 197 | 416 << ~197 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(-4544791751411500518L);
        cx = Long.reverse(0x4800000000000000L);
        cy = Integer.reverse(0x70000000);
        cz = Long.reverse(-8580017017535464934L);
        da = Integer.reverse(-268435456);
        dc = Long.reverse(-4544791751411500518L);
        df = Long.reverse(0x4800000000000000L);
        dh = Integer.reverse(Integer.MIN_VALUE);
        dk = 2 >>> 253 | 2 << -253;
        dm = Long.reverse(-8580017017535464934L);
        dn = Integer.reverse(-2013265920);
        dp = Long.reverse(-4544791751411500518L);
        ds = Long.reverse(0x4800000000000000L);
        dt = 0x9000000 >>> 87 | 0x9000000 << -87;
        dv = Long.reverse(-4544791751411500518L);
        dy = Long.reverse(0x4800000000000000L);
        dz = 9728 >>> 233 | 9728 << -233;
        ea = Integer.reverse(-1);
        eb = Long.reverse(-8580017017535464934L);
        ec = 0 >>> 116 | 0 << -116;
        ed = (0x28000000 >>> 249 | 0x28000000 << -249) & 0xFFFFFFFF;
        ee = Long.reverse(-4544791751411500518L);
        ef = Long.reverse(0x4800000000000000L);
        ek = Integer.reverse(-1476395008);
        el = Long.reverse(-8580017017535464934L);
        em = 0xB00000 >>> 211 | 0xB00000 << -211;
        eo = Long.reverse(-8580017017535464934L);
        eq = Integer.reverse(-402653184);
        es = Long.reverse(-4544791751411500518L);
        et = Long.reverse(0x4800000000000000L);
        eu = Integer.reverse(0x18000000);
        ev = Long.reverse(-4544791751411500518L);
        ew = Long.reverse(0x4800000000000000L);
        ex = Integer.reverse(-1744830464);
        ez = Long.reverse(-8580017017535464934L);
        fa = Integer.reverse(0);
        fb = Integer.reverse(Integer.MIN_VALUE);
        fd = Integer.reverse(0x44000000);
        fe = 0x20000002 >>> 188 | 0x20000002 << ~188 + 1;
        fh = 312 >>> 163 | 312 << -163;
        fl = (159744 >>> 12 | 159744 << -12) & 0xFFFFFFFF;
        fm = Integer.reverse(0x58000000);
        fp = Integer.reverse(-1);
        fq = Long.reverse(-8580017017535464934L);
        fr = 0x1000000 >>> 184 | 0x1000000 << -184;
        fs = 0x400000 >>> 54 | 0x400000 << ~54 + 1;
        fv = Integer.reverse(-671088640);
        fx = Long.reverse(-4544791751411500518L);
        fy = Long.reverse(0x4800000000000000L);
        fz = -536870912 >>> 27 | -536870912 << -27;
        gc = (-1 >>> 95 | -1 << -95) & 0xFFFFFFFF;
        ge = Long.reverse(-8580017017535464934L);
        gg = Integer.reverse(-1207959552);
        gi = Long.reverse(-4544791751411500518L);
        gk = Long.reverse(0x4800000000000000L);
        gm = Integer.reverse(0x78000000);
        go = Long.reverse(-4544791751411500518L);
        gp = Long.reverse(0x4800000000000000L);
        gq = Integer.reverse(-134217728);
        gr = Long.reverse(-4544791751411500518L);
        gu = Long.reverse(0x4800000000000000L);
        gv = 32 >>> 32 | 32 << ~32 + 1;
        gx = Long.reverse(-4544791751411500518L);
        ha = Long.reverse(0x4800000000000000L);
        hg = 8448 >>> 136 | 8448 << -136;
        hi = Long.reverse(-4544791751411500518L);
        hl = Long.reverse(0x4800000000000000L);
        hm = Integer.reverse(0x44000000);
        ho = -1 >>> 136 | -1 << -136;
        hp = Long.reverse(-8580017017535464934L);
        hy = Integer.reverse(-1006632960);
        hz = Long.reverse(-8580017017535464934L);
        ic = Integer.reverse(0x24000000);
        id = Long.reverse(-4544791751411500518L);
        ig = Long.reverse(0x4800000000000000L);
        ii = (-1811939328 >>> 186 | -1811939328 << ~186 + 1) & 0xFFFFFFFF;
        ij = (-1 >>> 189 | -1 << ~189 + 1) & 0xFFFFFFFF;
        ik = Long.reverse(-8580017017535464934L);
        im = 0x9800000 >>> 22 | 0x9800000 << -22;
        in = Integer.reverse(-1);
        io = Long.reverse(-8580017017535464934L);
        iq = Integer.reverse(-469762048);
        is = Long.reverse(-8580017017535464934L);
        it = (80 >>> 65 | 80 << -65) & 0xFFFFFFFF;
        iv = Long.reverse(-8580017017535464934L);
        ix = 0 >>> 66 | 0 << -66;
        iy = (164 >>> 34 | 164 << ~34 + 1) & 0xFFFFFFFF;
        iz = Long.reverse(-8580017017535464934L);
        ja = Integer.reverse(Integer.MIN_VALUE);
        jb = 21 >>> 63 | 21 << ~63 + 1;
        jc = Long.reverse(-8580017017535464934L);
        je = (0 >>> 95 | 0 << -95) & 0xFFFFFFFF;
        jf = 11008 >>> 200 | 11008 << -200;
        jg = Long.reverse(-8580017017535464934L);
        ji = (0 >>> 135 | 0 << -135) & 0xFFFFFFFF;
        jl = 0x1000000 >>> 216 | 0x1000000 << -216;
        jo = (2048 >>> 202 | 2048 << -202) & 0xFFFFFFFF;
        jp = (512 >>> 9 | 512 << ~9 + 1) & 0xFFFFFFFF;
        jt = Integer.reverse(Integer.MIN_VALUE);
        ka = 2816 >>> 70 | 2816 << -70;
        kb = Long.reverse(-8580017017535464934L);
        kc = (0x3000000 >>> 151 | 0x3000000 << -151) & 0xFFFFFFFF;
        kd = 0 >>> 195 | 0 << -195;
        ke = 0x200000 >>> 21 | 0x200000 << ~21 + 1;
        kf = Integer.reverse(0x40000000);
        kg = Integer.reverse(-1073741824);
        kh = 256 >>> 70 | 256 << -70;
        ki = Integer.reverse(-1610612736);
        kj = Integer.reverse(-1275068416);
        kk = Long.reverse(-8580017017535464934L);
        kl = Integer.reverse(0x74000000);
        km = Long.reverse(-4544791751411500518L);
        kn = Long.reverse(0x4800000000000000L);
        ko = Integer.reverse(0);
        kp = 0x40000002 >>> 60 | 0x40000002 << ~60 + 1;
        kq = 0x2000000 >>> 185 | 0x2000000 << ~185 + 1;
        kr = Integer.reverse(0);
        ks = (0x5E00000 >>> 53 | 0x5E00000 << -53) & 0xFFFFFFFF;
        kt = Long.reverse(-4544791751411500518L);
        ku = Long.reverse(0x4800000000000000L);
        kv = (393216 >>> 17 | 393216 << ~17 + 1) & 0xFFFFFFFF;
        kw = Integer.reverse(0x20000000);
        kx = 0x60000000 >>> 25 | 0x60000000 << -25;
        ky = Long.reverse(-4544791751411500518L);
        kz = Long.reverse(0x4800000000000000L);
        la = 0x62000000 >>> 249 | 0x62000000 << ~249 + 1;
        lb = (-1 >>> 187 | -1 << -187) & 0xFFFFFFFF;
        lc = Long.reverse(-8580017017535464934L);
        ld = (32 >>> 4 | 32 << ~4 + 1) & 0xFFFFFFFF;
        le = Integer.reverse(0x4C000000);
        lf = -1 >>> 230 | -1 << -230;
        lg = Long.reverse(-8580017017535464934L);
        lh = (524288 >>> 51 | 524288 << ~51 + 1) & 0xFFFFFFFF;
        li = Integer.reverse(-872415232);
        lj = Long.reverse(-4544791751411500518L);
        lk = Long.reverse(0x4800000000000000L);
        ll = Integer.reverse(0x2C000000);
        lm = Long.reverse(-8580017017535464934L);
        ln = Integer.reverse(Integer.MIN_VALUE);
        lo = (54272 >>> 106 | 54272 << ~106 + 1) & 0xFFFFFFFF;
        lp = Long.reverse(-4544791751411500518L);
        lq = Long.reverse(0x4800000000000000L);
        lr = (110592 >>> 235 | 110592 << ~235 + 1) & 0xFFFFFFFF;
        ls = Integer.reverse(-1);
        lt = Long.reverse(-8580017017535464934L);
        lu = Integer.reverse(-335544320);
        lv = Long.reverse(-4544791751411500518L);
        lw = Long.reverse(0x4800000000000000L);
        lx = Integer.reverse(0x1C000000);
        ly = Long.reverse(-4544791751411500518L);
        lz = Long.reverse(0x4800000000000000L);
        ma = 0x20000000 >>> 91 | 0x20000000 << -91;
        mb = 232 >>> 226 | 232 << ~226 + 1;
        mc = Integer.reverse(0x5C000000);
        md = 57 >>> 64 | 57 << -64;
        me = Long.reverse(-4544791751411500518L);
        mf = Long.reverse(0x4800000000000000L);
        var_java_lang_String_arr_e = new String[mb];
        f = new String[mc];
        NLoginCore_196.void_b();
        R = NLoginCore_196.c("㺀", (int)md, (long)(me ^ mf));
    }

    @Override
    protected File java_io_File_b() {
        File file = super.java_io_File_b();
        if (!file.exists()) {
            file = new File(this.m.java_io_File_c().getParentFile(), ((NLoginCore_531)((Object)this.a)).p().toLowerCase(Locale.ENGLISH));
        }
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        File file = new File(this.java_io_File_b(), this.O);
        try (NLoginCore_549 NLoginCore_549 = NLoginCore_428.a(file);){
            Object object;
            String string;
            EnumMap<NLoginCore_020, NLoginCore_402> enumMap = new EnumMap<NLoginCore_020, NLoginCore_402>(NLoginCore_020.class);
            NLoginCore_086 NLoginCore_0862 = null;
            Enum enum_ = null;
            int n = al;
            while ((string = NLoginCore_549.ah()) != null) {
                object = string.trim();
                if (NLoginCore_0862 != null) {
                    if (((String)object).equals(NLoginCore_196.c("㺀", (int)ao, (long)at))) {
                        NLoginCore_402 NLoginCore_4022 = NLoginCore_0862.a();
                        enumMap.put(NLoginCore_402.com_nickuc_login_NLoginCore_020_a(NLoginCore_4022), NLoginCore_4022);
                        NLoginCore_0862 = null;
                        continue;
                    }
                    if (((String)object).startsWith((String)NLoginCore_196.c("㺃", (int)bd, (long)be))) {
                        NLoginCore_0862.a(this.f((String)object, (String)NLoginCore_196.c("㺆", (int)bf, (long)(bh ^ bk))));
                        continue;
                    }
                    if (((String)object).startsWith((String)NLoginCore_196.c("㺉", (int)bl, (long)(bm ^ bo)))) {
                        NLoginCore_0862.b(this.f((String)object, (String)NLoginCore_196.c("㺌", (int)bp, (long)(br ^ bs))));
                        continue;
                    }
                    if (((String)object).startsWith((String)NLoginCore_196.c("㺏", (int)bu, (long)bv))) {
                        NLoginCore_0862.d(this.f((String)object, (String)NLoginCore_196.c("㺒", (int)bw, (long)(by ^ ca))));
                        continue;
                    }
                    if (((String)object).startsWith((String)NLoginCore_196.c("㺕", (int)cb, (long)(cd ^ cf)))) {
                        NLoginCore_0862.a(NLoginCore_449.a(this.f((String)object, (String)NLoginCore_196.c("㺘", (int)(cg & ch), (long)ci)), (Integer)cj));
                        continue;
                    }
                    if (((String)object).startsWith((String)NLoginCore_196.c("㺛", (int)cm, (long)(cn ^ cp)))) {
                        NLoginCore_0862.c(this.f((String)object, (String)NLoginCore_196.c("㺞", (int)cr, (long)(ct ^ cu))));
                        continue;
                    }
                    if (!((String)object).startsWith((String)NLoginCore_196.c("㺡", (int)cv, (long)(cw ^ cx)))) continue;
                    NLoginCore_0862.e(this.f((String)object, (String)NLoginCore_196.c("㺤", (int)cy, (long)cz)));
                    continue;
                }
                if (((String)object).equals(NLoginCore_196.c("㺧", (int)da, (long)(dc ^ df)))) {
                    n = dh;
                    continue;
                }
                if (n == 0) continue;
                if (((String)object).startsWith((String)NLoginCore_196.c("㺪", (int)dk, (long)dm))) {
                    String string2 = this.f((String)object, (String)NLoginCore_196.c("㺭", (int)dn, (long)(dp ^ ds)));
                    enum_ = NLoginCore_020.a(string2);
                    if (enum_ == null) {
                        throw new UnsupportedOperationException((String)NLoginCore_196.c("㺰", (int)dt, (long)(dv ^ dy)) + string2 + (String)NLoginCore_196.c("㺳", (int)(dz & ea), (long)eb));
                    }
                    n = ec;
                    continue;
                }
                NLoginCore_020 NLoginCore_0202 = NLoginCore_020.b((String)object);
                if (NLoginCore_0202 == null) continue;
                NLoginCore_0862 = NLoginCore_402.a().a(NLoginCore_0202);
            }
            if (enum_ == null) {
                throw new IllegalStateException((String)NLoginCore_196.c("㺶", (int)ed, (long)(ee ^ ef)));
            }
            object = (NLoginCore_402)enumMap.get(enum_);
            if (object == null) {
                throw new IllegalStateException((String)NLoginCore_196.c("㺹", (int)ek, (long)el) + enum_ + (String)NLoginCore_196.c("㺼", (int)em, (long)eo));
            }
            switch (enum_.ordinal()) {
                case 0: 
                case 1: {
                    int n2 = NLoginCore_402.int_a((NLoginCore_402)object);
                    String string3 = NLoginCore_402.java_lang_String_a((NLoginCore_402)object);
                    String string4 = NLoginCore_402.b((NLoginCore_402)object);
                    String string5 = NLoginCore_402.c((NLoginCore_402)object);
                    String string6 = NLoginCore_402.d((NLoginCore_402)object);
                    this.d = enum_ == NLoginCore_020.var_com_nickuc_login_NLoginCore_020_b ? NLoginCore_034.b(this.m, NLoginCore_147.a(string3, n2, string4, string5, string6, new Properties())) : NLoginCore_392.b(this.m, NLoginCore_147.a(string3, n2, string4, string5, string6, new Properties()));
                    return;
                }
                case 2: {
                    String string7 = NLoginCore_402.e((NLoginCore_402)object);
                    if (string7 == null) {
                        throw new IllegalStateException((String)NLoginCore_196.c("㺿", (int)eq, (long)(es ^ et)) + enum_ + (String)NLoginCore_196.c("㻂", (int)eu, (long)(ev ^ ew)));
                    }
                    File file2 = new File(this.java_io_File_b(), string7);
                    this.d = NLoginCore_586.a(this.m, file2, new Properties());
                    return;
                }
            }
            return;
        }
    }

    @Override
    protected NLoginCore_219 com_nickuc_login_NLoginCore_219_a(String string) {
        return null;
    }

    private String f(String string, String string2) {
        if (string.length() == string2.length()) {
            return NLoginCore_196.c("㺀", (int)ex, (long)ez);
        }
        String string3 = string.substring(string2.length());
        char c = string3.charAt(fa);
        char c2 = string3.charAt(string3.length() - fb);
        if (c == fd && c2 == fe || c == fh && c2 == fl) {
            switch (string3.length()) {
                case 1: {
                    return string3;
                }
                case 2: {
                    return NLoginCore_196.c("㺃", (int)(fm & fp), (long)fq);
                }
            }
            return string3.substring(fr, string3.length() - fs);
        }
        return string3;
    }

    private static String a(int n, long l) {
        l ^= 0x12L;
        l ^= 0xF14806783A0B8B19L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(2 + 67), (byte)(51 + 32), (byte)(10 + 37), (byte)(12 + 55), (byte)(37 + 29), (byte)(33 + 34), (byte)(8 + 39), (byte)(33 + 47), (byte)(24 + 51), 67, (byte)(19 + 64), 53, (byte)(38 + 42), (byte)(65 + 32), (byte)(93 + 7), (byte)(79 + 21), (byte)(24 + 81), (byte)(27 + 83), (byte)(33 + 70)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(27 + 41), 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.D("փ֐֏Ւ֒֎։֒֝֌ՙ֛֗֔֗֝՟ࣶ࣭ࣸࣗ࣬ࣉࣱࣹࣳࣷ", (byte)121, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_196.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = 6368018941178394371L;
        long l = o ^ 0xF14806783A0B8B19L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(36 + 33), (byte)(46 + 37), (byte)(22 + 25), (byte)(15 + 52), (byte)(39 + 27), (byte)(8 + 59), (byte)(19 + 28), (byte)(53 + 27), (byte)(37 + 38), (byte)(12 + 55), (byte)(65 + 18), (byte)(41 + 12), (byte)(37 + 43), (byte)(76 + 21), (byte)(52 + 48), (byte)(61 + 39), (byte)(7 + 98), (byte)(43 + 67), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_196.f[0] = NLoginCore_027.D("ՑըԹ՛ԺԶչծլլ՘՚ՖջսՇֆՔ՞֋ցվՕՖ", (byte)111, 68);
                    NLoginCore_196.f[1] = NLoginCore_223.A("ǍǖƖƹǅƮƒƔƲǑƞƯǛƟƾƼƟƵƴơǤǅƞǡǧǮƨǤǃǛǳǄ", (byte)111, 65);
                    NLoginCore_196.f[2] = NLoginCore_223.B("ƫǎƱƴƻǚǆưƼƜƸƥ", (byte)111, 66);
                    NLoginCore_196.f[3] = NLoginCore_201.F("՟֑֝սևն֢ր֦֦֤֪֫֋֡֍֏ք֢֟ֈַվտ", (byte)111, 70);
                    NLoginCore_196.f[4] = NLoginCore_027.A("ƑǃǏƯƹƨǔƲǝǘǘǖǜƽǓƿǁƶǑǔƺǩưƱ", (byte)111, 65);
                    NLoginCore_196.f[5] = NLoginCore_138.B("ǗǖǙǘƣƴƲǆƻƯƸƥ", (byte)111, 66);
                    NLoginCore_196.f[6] = NLoginCore_027.D("ռջվսՈՙ՗իՠՔ՝Պ", (byte)111, 68);
                    NLoginCore_196.f[7] = NLoginCore_223.F("խ֤֚֔ևՠ֝փ֛֢ւ֣֌֌֣֏քֆձ֪կ֧վտ", (byte)111, 70);
                    NLoginCore_196.f[8] = NLoginCore_027.C("Մձջի՞Էմ՚ղչՙպգգպզ՛՝ՈցՆվՕՖ", (byte)111, 67);
                    NLoginCore_196.f[9] = NLoginCore_451.F("բ֛֔վոյն֚ռ֤֙ճ", (byte)111, 70);
                    NLoginCore_196.f[10] = NLoginCore_092.F("բ֛֔վոյն֚ռ֤֙ճ", (byte)111, 70);
                    NLoginCore_196.f[11] = NLoginCore_091.F("֛֠ջֈ֞֙ճո֟վթճ", (byte)111, 70);
                    NLoginCore_196.f[12] = NLoginCore_324.B("ǒǍƭƺǐǋƥƪǑưƛƥ", (byte)111, 66);
                    NLoginCore_196.f[13] = NLoginCore_559.B("ƪǃƤƬƮǑǌǖƵƼƗƥ", (byte)111, 66);
                    NLoginCore_196.f[14] = NLoginCore_324.D("ՏըՉՑՓնձջ՚աԼՊ", (byte)111, 68);
                    NLoginCore_196.f[15] = NLoginCore_446.C("ԶըմՔ՞Սչ՗ւսռԽ՘քՕ՛վբւըՈըՕՖ", (byte)111, 67);
                    NLoginCore_196.f[16] = NLoginCore_092.D("եխսնխիխղդ՝աՊ", (byte)111, 68);
                    NLoginCore_196.f[17] = NLoginCore_091.A("ǀǈǘǑǈǆǈǍƿƸƼƥ", (byte)111, 65);
                    NLoginCore_196.f[18] = NLoginCore_324.D("կՈՍՙ՜ՈԷճիռշՑդօփՓչՙՌ֊ւչՙ֑ցվգշՐ։պ֏՗֑֕՝վձՓչ՛շՠժ", (byte)111, 68);
                    NLoginCore_196.f[19] = NLoginCore_004.B("ƵƦǑƺƥƪƘƻƴƫƼƥ", (byte)111, 66);
                    NLoginCore_196.f[20] = NLoginCore_451.D("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ֌ն֍յչց֌֙֏պ֞֗շկ՘պշծյ֘֩ց֤ժ֧ևզ֧վ֏հ֥֡իֲַփ֪պմֵַָ֍֬֜չׁսք֊", (byte)111, 68);
                    NLoginCore_196.f[21] = NLoginCore_027.D("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ֌ն֍յչց֌֎՘։լ֝թ֢ի֒՝՛՞ՙ։ւպ֞֬֝ծըֈյն", (byte)111, 68);
                    NLoginCore_196.f[22] = NLoginCore_091.D("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑֌կ֖֒Տիֆ֓֝խ՚Օ։մփ֋օդժ", (byte)111, 68);
                    NLoginCore_196.f[23] = NLoginCore_446.D("ՎԵնԼջտՊչԿոՅյՆսվիբ֊զ֏ը֋֏ՑՐ֕ըՔ֐Ր՗ճչ֏֌ֆ֍՟֘լ֗շ֓եփջևվ։֙֨֏֛֮յն", (byte)111, 68);
                    NLoginCore_196.f[24] = NLoginCore_027.C("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑֌կ֖֒Տիֆ֓֝խ՚Օ։մփ֋օդժ", (byte)111, 67);
                    NLoginCore_196.f[25] = NLoginCore_223.A("ǒǑǐƋƸǅƲƫǞƱǒƥ", (byte)111, 65);
                    NLoginCore_196.f[26] = NLoginCore_027.A("ǒǑǐƋƸǅƲƫǞƱǒƥ", (byte)111, 65);
                    NLoginCore_196.f[27] = NLoginCore_575.F("ղչզդ֠ըր֕ջյթճ", (byte)111, 70);
                    NLoginCore_196.f[28] = NLoginCore_575.F("֙ո֞՝֚աճյ֖֬֠ճ", (byte)111, 70);
                    NLoginCore_196.f[29] = NLoginCore_559.D("ՍմՙխՍժծՙՃճ՗տՒշ֊դ֊ջվՖՙ՘ՕՖ", (byte)111, 68);
                    NLoginCore_196.f[30] = NLoginCore_387.A("ƭǕǎƺƐǙǏƺƩƹƬƥ", (byte)111, 65);
                    NLoginCore_196.f[31] = NLoginCore_091.B("ƠưǅǈƷǇƒƭưƗƾƞǟǑƾƥƴƸǃƵƷǙưƱ", (byte)111, 66);
                    NLoginCore_196.f[32] = NLoginCore_027.E("֣ձ֏֜և֕ք֤ոդխվ֬֏֚։ֲ֨֔յ֊֧վտ", (byte)111, 69);
                    NLoginCore_196.f[33] = NLoginCore_201.F("ղչզդ֠ըր֕ջյթճ", (byte)111, 70);
                    NLoginCore_196.f[34] = NLoginCore_453.E("֙ո֞՝֚աճյ֖֬֠ճ", (byte)111, 69);
                    NLoginCore_196.f[35] = NLoginCore_559.B("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 66);
                    NLoginCore_196.f[36] = NLoginCore_451.E("֑֍՜֟֐֧ո֣֥֤֡ճ", (byte)111, 69);
                    NLoginCore_196.f[37] = NLoginCore_223.F("֑֍՜֟֐֧ո֣֥֤֡ճ", (byte)111, 70);
                    NLoginCore_196.f[38] = NLoginCore_387.A("ǓƒƲǄǆǊǏǝǜǏƨƥ", (byte)111, 65);
                    NLoginCore_196.f[39] = NLoginCore_223.F("֑֍՜֟֐֧ո֣֥֤֡ճ", (byte)111, 70);
                    NLoginCore_196.f[40] = NLoginCore_076.A("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 65);
                    NLoginCore_196.f[41] = NLoginCore_387.A("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 65);
                    NLoginCore_196.f[42] = NLoginCore_223.D("ոԷ՗թիկմւցմՍՊ", (byte)111, 68);
                    NLoginCore_196.f[43] = NLoginCore_138.C("Վճ՘նՌջԿրոՍշՊ", (byte)111, 67);
                    NLoginCore_196.f[44] = NLoginCore_138.F("֜՛ր֞֟ՠ֥ջ֤֨դփ֞օհ֊ֆ֣֡փ֌֫ճ֮֎־ֳ֛շ֎տ֟֗֎֢֤֒ևֶֈ׀֋ֽ֦֚֊֛׏֑֡֒׌זֱ֞֟", (byte)111, 70);
                    NLoginCore_196.f[45] = NLoginCore_091.F("֤խ֕մ֗ձ֛ժ֕֬փ֋չ֭րժձճ֎ֶ֓չ֖֬մ֋֊֚֗ռְָ֡փ֏֑ւ֤֫֓֔տׇ׌ֱ։ֽ֭֬׆֤׊ָׇ֞֟", (byte)111, 70);
                    NLoginCore_196.f[46] = NLoginCore_384.D("ջՕԽՕնրկԿԵռՄՊ", (byte)111, 68);
                    NLoginCore_196.f[47] = NLoginCore_173.C("ոԷ՗թիկմւցմՍՊ", (byte)111, 67);
                    NLoginCore_196.f[48] = NLoginCore_384.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
                    NLoginCore_196.f[49] = NLoginCore_384.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
                    NLoginCore_196.f[50] = NLoginCore_092.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
                    NLoginCore_196.f[51] = NLoginCore_201.F("֑֍՜֟֐֧ո֣֥֤֡ճ", (byte)111, 70);
                    NLoginCore_196.f[52] = NLoginCore_201.F("րվ֙֟վքցվյ֞ֆճ", (byte)111, 70);
                    NLoginCore_196.f[53] = NLoginCore_201.D("ջՄլՋծՈղՁլփ՚բՐք՗ՁՈՊե֍ժՐխփՋբաձծՓ֏ևո՚զըՙջւժիՖ֣֞ֈՠփ֔ք֝ջ֡֏֞յն", (byte)111, 68);
                    NLoginCore_196.f[54] = NLoginCore_027.E("֤վզվ֟֩֘ը՞֥խճ", (byte)111, 69);
                    NLoginCore_196.f[55] = NLoginCore_027.F("֚ՠշ֤֟վգ֧֦ք֘ճ", (byte)111, 70);
                    NLoginCore_196.f[56] = NLoginCore_427.F("վ֝՟֤ցոե֨֜։ցլֱ֫֯եծյտ֫ց֑վտ", (byte)111, 70);
                    NLoginCore_196.f[57] = NLoginCore_092.C("ՑըԹ՛ԺԶչծլլ՘՚ՖջսՇֆՔ՞֋ցվՕՖ", (byte)111, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_196.f[0] = NLoginCore_138.F("պ֑բքգ՟֢֗֕֕վ֍֪֩֞֨վհַ֕֒ցվտ", (byte)111, 70);
                    NLoginCore_196.f[1] = NLoginCore_223.C("ղջԻ՞ժՓԷԹ՗նՃՔրՄգաՄ՚ՙՆ։թՠաֆա։ցբ֏֏֒", (byte)111, 67);
                    NLoginCore_196.f[2] = NLoginCore_387.D("՗ՍԽՏըԽլգբլՀՊ", (byte)111, 68);
                    NLoginCore_196.f[3] = NLoginCore_559.D("ԶըմՔ՞Սչ՗ւսռջԾՇւրՉտիւջըՕՖ", (byte)111, 68);
                    NLoginCore_196.f[4] = NLoginCore_559.B("ƑǃǏƯƹƨǔƲǝǘǘǔǋǓƣǞǝưǧƠƠǙưƱ", (byte)111, 66);
                    NLoginCore_196.f[5] = NLoginCore_138.E("֥֚֓ռ֥ջճ֗֙յիֈվ֏իծ֞֋հֳַ֒վտ", (byte)111, 69);
                    NLoginCore_196.f[6] = NLoginCore_223.C("ԵժՙլԶմՊՐիջկՊ", (byte)111, 67);
                    NLoginCore_196.f[7] = NLoginCore_223.B("ƟǌǖǆƹƒǏƵǍǔƴǍƳƞƵǐƯǅǓǟƲǩưƱ", (byte)111, 66);
                    NLoginCore_196.f[8] = NLoginCore_092.F("խ֤֚֔ևՠ֝փ֛֢ք֝չ֥֝֯տ։մկղ֧վտ", (byte)111, 70);
                    NLoginCore_196.f[9] = NLoginCore_575.A("ƑƦǖǋƧǋǗǏǎǕǗƷƹƫƱƝǇƺƥǢƢǩưƱ", (byte)111, 65);
                    NLoginCore_196.f[10] = NLoginCore_223.A("ǈƭǊƣǚƫǅǑǋƛƩƫǍƾǓǤǣƲƾǩǫǩưƱ", (byte)111, 65);
                    NLoginCore_196.f[11] = NLoginCore_091.E("յ֥գ֟ձ֥֡ցէ֣֟ս֝֡պֳսֱֳֵַ֭վտ", (byte)111, 69);
                    NLoginCore_196.f[12] = NLoginCore_559.A("ǁǔƲƭƭǓǉǌǙǠƸƥ", (byte)111, 65);
                    NLoginCore_196.f[13] = NLoginCore_427.D("ԷղՏհՇՉ՟՘դսՙԼՙտ՛դճքՕաՇըՕՖ", (byte)111, 68);
                    NLoginCore_196.f[14] = NLoginCore_324.A("ƴƷƫǖǂǉƭǎƖǌǎƥ", (byte)111, 65);
                    NLoginCore_196.f[15] = NLoginCore_384.A("ƑǃǏƯƹƨǔƲǝǘǙơƷǃǢƽƜǐƺǆƠƳưƱ", (byte)111, 65);
                    NLoginCore_196.f[16] = NLoginCore_027.F("ւ֥֑֢֪֜֝֘յ֚֘ճ", (byte)111, 70);
                    NLoginCore_196.f[17] = NLoginCore_076.F("խ՗֝ջ֩թտւ֙֎֭֗֩ֆ֥հր֧֪ւ։֧վտ", (byte)111, 70);
                    NLoginCore_196.f[18] = NLoginCore_173.D("կՈՍՙ՜ՈԷճիռշՑդօփՓչՙՌ֊ւչՙ֑ցվգշՐ։պ֏֌ճհպ՗֕֗֘ռ֎֟ժ", (byte)111, 68);
                    NLoginCore_196.f[19] = NLoginCore_091.D("նՕջԷ՝ԲիփՌչկՊ", (byte)111, 68);
                    NLoginCore_196.f[20] = NLoginCore_076.C("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ֌ն֍յչց֌֙֏պ֞֗շկ՘պշծյ֘֩ց֤ժ֧ևզ֧վ֏հ֥֡իֲַփ֪պֲ֪֥֫֞־֋֒տպ֡֊", (byte)111, 67);
                    NLoginCore_196.f[21] = NLoginCore_387.F("շ՞֟ե֤֨ճ֢ը֡դ֞֞ֈ֮֓ձղւ֠հ֗յ֐ֵֵֶַ֤֢֪֟֞ցֲ֕׆֒׋ֻ֔ֆ֎ֈ֦֚֚֏׉ׄ׆֣׊ךוֱֹ֚֓גֱ׏ַ׋", (byte)111, 70);
                    NLoginCore_196.f[22] = NLoginCore_091.B("ǋƮƖƪǊƸƷƚƶƨǎƮǡƷǁǙǝǝƦǗǞƶǙǨǬǧǊǱǭƪǆǡǀǶǖǅǱǘǕǅǘǴǔǅ", (byte)111, 66);
                    NLoginCore_196.f[23] = NLoginCore_092.B("ƩƐǑƗǖǚƥǔƚǓƠǐơǘǙǆƽǥǁǪǃǦǪƬƫǰǃƯǫƫƲǎǔǪǧǡǨƺǳǇǲǒǮǽǮǹǝƷǔƽǩǻȊǣǐǑ", (byte)111, 66);
                    NLoginCore_196.f[24] = NLoginCore_453.D("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑֌կ֖֒Տիֆ֜ղինըի֊ամ֏դժ", (byte)111, 68);
                    NLoginCore_196.f[25] = NLoginCore_091.C("ՍՅՇոջռ՗ն՟կՀՊ", (byte)111, 67);
                    NLoginCore_196.f[26] = NLoginCore_427.B("ƦƫǆƲǗǃƬǕǞƝƗƥ", (byte)111, 66);
                    NLoginCore_196.f[27] = NLoginCore_027.F("քծ֞և֓վ֝֊֞դ֜֗քևտե֖֦֩ն֠ցվտ", (byte)111, 70);
                    NLoginCore_196.f[28] = NLoginCore_559.A("ƶǑǋƏǘǓǌƫƛǟǞƥ", (byte)111, 65);
                    NLoginCore_196.f[29] = NLoginCore_076.B("ƨǏƴǈƨǅǉƴƞǎƲǟƫƬƱǚǑǚǧǗơǫƢƿǇƮƦǣǮǤǃƱ", (byte)111, 66);
                    NLoginCore_196.f[30] = NLoginCore_223.E("վծ֙ջ֦֒ֈքէիֆճ", (byte)111, 69);
                    NLoginCore_196.f[31] = NLoginCore_091.D("ՅՕժխ՜լԷՒՕԼաՏՂԺՅն՘ՙ՛դ՛թՙՠ֓աՓ֖֋֗֕ջ", (byte)111, 68);
                    NLoginCore_196.f[32] = NLoginCore_091.E("֣ձ֏֜և֕ք֤ոդՠ֥֡ր֍֦֑֥֠֯֒֊ճ֣֏ֲպֹ֋ִֿ֛", (byte)111, 69);
                    NLoginCore_196.f[33] = NLoginCore_384.D("ԶծՋժըՒցկջ՛տՊ", (byte)111, 68);
                    NLoginCore_196.f[34] = NLoginCore_223.A("ƦƱƸƳƦƬƨǗƯƯƞƜƲƫƾǤƷƠƲǓǕǩưƱ", (byte)111, 65);
                    NLoginCore_196.f[35] = NLoginCore_092.D("ԻՆԶվՊպԿՍՙջջՊ", (byte)111, 68);
                    NLoginCore_196.f[36] = NLoginCore_384.F("֠֜՝֙պ֊ճգց֕֘ճ", (byte)111, 70);
                    NLoginCore_196.f[37] = NLoginCore_138.E("յ֦֓֓եՠ֣֓գոֆճ", (byte)111, 69);
                    NLoginCore_196.f[38] = NLoginCore_201.D("՗ճլձՉԺԽԼգԶՀՊ", (byte)111, 68);
                    NLoginCore_196.f[39] = NLoginCore_004.E("֢֗֙֝ղղՠ֡ռնթճ", (byte)111, 69);
                    NLoginCore_196.f[40] = NLoginCore_201.B("ƍƨǉƥǇƣƴƱǊƿƴƥ", (byte)111, 66);
                    NLoginCore_196.f[41] = NLoginCore_110.D("լՅզ՞խվչՑՂ՛աՊ", (byte)111, 68);
                    NLoginCore_196.f[42] = NLoginCore_027.B("ǊƑƠƺƮǒưƷƖǌƴƥ", (byte)111, 66);
                    NLoginCore_196.f[43] = NLoginCore_004.D("յճՖէԽըղՙԿԻկՊ", (byte)111, 68);
                    NLoginCore_196.f[44] = NLoginCore_575.A("ǎƍƲǐǑƒǗƭǖǚƖƵǐƷƢƼƸǓǕƵƾǝƥǠǀǰǍǥƩǀƱǑǉǀǔǖǄƹǨƺǲƽǯǢǝǭǚǜǽǅǿǪǞǓǐǑ", (byte)111, 65);
                    NLoginCore_196.f[45] = NLoginCore_091.A("ǖƟǇƦǉƣǍƜǇǞƵƽƫǟƲƜƣƥǀǨǅƫǈǞƦƽƼǌǉƮǪǢǓƵǁǃƴǖǝǅǆƱǸƿƹǶǮȆǰȃȃƻǵǣǐǑ", (byte)111, 65);
                    NLoginCore_196.f[46] = NLoginCore_091.A("ƥưǂǄƕƨǋƚƻƜƗƥ", (byte)111, 65);
                    NLoginCore_196.f[47] = NLoginCore_384.A("ƠǓƊƒǅǗƦǊǗƖǀƥ", (byte)111, 65);
                    NLoginCore_196.f[48] = NLoginCore_453.C("ԭԵՅԺպ՟ծՙյխԼՊ", (byte)111, 67);
                    NLoginCore_196.f[49] = NLoginCore_559.D("հՌթՆճ՝ճնճտՀՊ", (byte)111, 68);
                    NLoginCore_196.f[50] = NLoginCore_453.E("ՠխհ֥֙֓֡տր֡֠ճ", (byte)111, 69);
                    NLoginCore_196.f[51] = NLoginCore_384.B("ƿǆǃƮƲǘǙƬǛƜƼƥ", (byte)111, 66);
                    NLoginCore_196.f[52] = NLoginCore_451.E("֤֥֢֤֟֔ֆև֡ֈե֎ְ֞֓ջ֍֎֌ֵ֧֙վտ", (byte)111, 69);
                    NLoginCore_196.f[53] = NLoginCore_451.E("֤խ֕մ֗ձ֛ժ֕֬փ֋չ֭րժձճ֎ֶ֓չ֖֬մ֋֊֚֗ռְָ֡փ֏֑ւ֤֫֓֔տׅ֍־֚֫֓׉ֿ׏֠׀ח֞֟", (byte)111, 69);
                    NLoginCore_196.f[54] = NLoginCore_324.E("ծփ֙հֆշ֠գժ֜ֆճ", (byte)111, 69);
                    NLoginCore_196.f[55] = NLoginCore_223.A("ƶƫǒƭǅƔƻǙǈƑƹƻǙǜǢǙƯƹǒƹǉǙưƱ", (byte)111, 65);
                    NLoginCore_196.f[56] = NLoginCore_223.F("վ֝՟֤ցոե֨֜։տ֡տ֤֙֫ցտ֍ֶ֧֮վտ", (byte)111, 70);
                    NLoginCore_196.f[57] = NLoginCore_223.E("պ֑բքգ՟֢֗֕֕տիլ֣֤։֠տ։ְ֯ցվտ", (byte)111, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_196.f[0] = NLoginCore_138.D("շՋԯ՛նՠբ՟իՎջբգֈձ՝եՅևծզըՕՖ", (byte)111, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_196.f[0] = NLoginCore_091.A("ǂǉƫǋǅƳǇǅƛƹƨƥ", (byte)111, 65);
                }
            }
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        String string;
        Object object;
        Object object2;
        UUID uUID;
        UUID uUID2;
        block26: {
            block24: {
                String string2;
                block25: {
                    if (this.a == null) {
                        this.a = NLoginCore_323.a(resultSet, (String)NLoginCore_196.c("㺀", (int)fv, (long)(fx ^ fy)));
                    }
                    if (this.b == null) {
                        this.b = NLoginCore_323.a(resultSet, (String)NLoginCore_196.c("㺃", (int)(fz & gc), (long)ge));
                    }
                    this.r = resultSet.getString((String)NLoginCore_196.c("㺆", (int)gg, (long)(gi ^ gk)));
                    if (this.r == null) {
                        return;
                    }
                    uUID2 = NLoginCore_432.c(resultSet.getString((String)NLoginCore_196.c("㺉", (int)gm, (long)(go ^ gp))));
                    uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_196.c("㺌", (int)gq, (long)(gr ^ gu))));
                    string2 = resultSet.getString((String)NLoginCore_196.c("㺏", (int)gv, (long)(gx ^ ha)));
                    if (string2 == null || string2.isEmpty()) break block24;
                    if (!this.a.booleanValue()) break block25;
                    object2 = resultSet.getString((String)NLoginCore_196.c("㺒", (int)hg, (long)(hi ^ hl)));
                    if (this.b.booleanValue()) {
                        object = NLoginCore_214.b(resultSet.getString((String)NLoginCore_196.c("㺕", (int)(hm & ho), (long)hp)));
                    } else {
                        switch (string2.length()) {
                            case 64: {
                                object = NLoginCore_214.var_com_nickuc_login_NLoginCore_214_a;
                                break;
                            }
                            case 128: {
                                object = NLoginCore_214.var_com_nickuc_login_NLoginCore_214_b;
                                break;
                            }
                            default: {
                                object = null;
                            }
                        }
                    }
                    if (object == null) {
                        this.e(this.r, string2, null);
                        return;
                    }
                    switch (((Enum)object).ordinal()) {
                        case 0: 
                        case 1: {
                            string = (String)NLoginCore_196.c("㺘", (int)hy, (long)hz) + NLoginCore_214.a((NLoginCore_214)((Object)object)) + (String)NLoginCore_196.c("㺛", (int)ic, (long)(id ^ ig)) + string2 + (String)NLoginCore_196.c("㺞", (int)(ii & ij), (long)ik) + (String)object2;
                            break block26;
                        }
                        case 2: 
                        case 3: {
                            String[] stringArray = string2.split((String)NLoginCore_196.c("㺡", (int)(im & in), (long)io));
                            string = (String)NLoginCore_196.c("㺤", (int)iq, (long)is) + NLoginCore_214.a((NLoginCore_214)((Object)object)) + (String)NLoginCore_196.c("㺧", (int)it, (long)iv) + stringArray[ix] + (String)NLoginCore_196.c("㺪", (int)iy, (long)iz) + (String)object2 + stringArray[ja];
                            break block26;
                        }
                        case 4: {
                            String[] stringArray = string2.split((String)NLoginCore_196.c("㺭", (int)jb, (long)jc));
                            String[] stringArray2 = stringArray[je].split((String)NLoginCore_196.c("㺰", (int)jf, (long)jg));
                            int n = Integer.parseInt(stringArray2[ji]);
                            int n2 = Integer.parseInt(stringArray2[jl]);
                            int n3 = Integer.parseInt(stringArray2[jo]);
                            int n4 = jp;
                            byte[] byArray = Base64.getDecoder().decode((String)object2);
                            byte[] byArray2 = Base64.getDecoder().decode(stringArray[jt]);
                            Object[] objectArray = new Object[kc];
                            objectArray[NLoginCore_196.kd] = n;
                            objectArray[NLoginCore_196.ke] = n3;
                            objectArray[NLoginCore_196.kf] = n2;
                            objectArray[NLoginCore_196.kg] = n4;
                            objectArray[NLoginCore_196.kh] = Base64.getEncoder().withoutPadding().encodeToString(byArray);
                            objectArray[NLoginCore_196.ki] = Base64.getEncoder().withoutPadding().encodeToString(byArray2);
                            string = String.format((String)NLoginCore_196.c("㺳", (int)ka, (long)kb), objectArray);
                            break block26;
                        }
                        default: {
                            throw new UnsupportedOperationException((String)NLoginCore_196.c("㺶", (int)kj, (long)kk) + object + (String)NLoginCore_196.c("㺹", (int)kl, (long)(km ^ kn)));
                        }
                    }
                }
                int n = string2.charAt(ko) == kp ? kq : kr;
                String[] stringArray = string2.split((String)NLoginCore_196.c("㺼", (int)ks, (long)(kt ^ ku)));
                if (stringArray.length != kv && stringArray.length != kw) {
                    this.e(this.r, string2, null);
                    return;
                }
                object = NLoginCore_214.b(stringArray[n].toUpperCase(Locale.ENGLISH));
                if (object == null) {
                    this.e(this.r, string2, null);
                    return;
                }
                switch (((Enum)object).ordinal()) {
                    case 0: 
                    case 1: {
                        string = (String)NLoginCore_196.c("㺿", (int)kx, (long)(ky ^ kz)) + NLoginCore_214.a((NLoginCore_214)((Object)object)) + (String)NLoginCore_196.c("㻂", (int)(la & lb), (long)lc) + stringArray[n + ld] + (String)NLoginCore_196.c("㻅", (int)(le & lf), (long)lg) + stringArray[n + lh];
                        break;
                    }
                    case 2: 
                    case 3: {
                        string = (String)NLoginCore_196.c("㻈", (int)li, (long)(lj ^ lk)) + NLoginCore_214.a((NLoginCore_214)((Object)object)) + string2.substring(((String)NLoginCore_196.c("㻋", (int)ll, (long)lm)).length() + (n + ln));
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException((String)NLoginCore_196.c("㻎", (int)lo, (long)(lp ^ lq)) + object + (String)NLoginCore_196.c("㻑", (int)(lr & ls), (long)lt));
                    }
                }
                break block26;
            }
            string = null;
        }
        object = resultSet.getTimestamp((String)NLoginCore_196.c("㻔", (int)lu, (long)(lv ^ lw)));
        object2 = resultSet.getTimestamp((String)NLoginCore_196.c("㻗", (int)lx, (long)(ly ^ lz)));
        Consumer<ForceRegisterConfig> consumer = arg_0 -> NLoginCore_196.a((Timestamp)object, (Timestamp)object2, arg_0);
        if (uUID != null && uUID.version() != ma) {
            uUID = null;
        }
        if (uUID != null) {
            this.a(this.r, string, null, uUID2, uUID, consumer);
        } else {
            this.a(this.r, string, null, uUID2, consumer);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_196.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginCore_196.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.A("ŰŽżĿſŻŶſƊŹņƄƈƁƄƊŌӣӚӥӄәҶӠӦӤӞŢ", (byte)71, 65) + string + NLoginCore_559.C("ӄ", (byte)71, 67) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ void a(Timestamp timestamp, Timestamp timestamp2, ForceRegisterConfig ForceRegisterConfig2) {
        ForceRegisterConfig2.a(timestamp != null ? Long.valueOf(timestamp.getTime()) : null, timestamp2 != null ? Long.valueOf(timestamp2.getTime()) : null);
    }

    public NLoginCore_196(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_l, (String)NLoginCore_196.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_196.c("㺃", (int)(y & z), (long)ab));
    }
}

