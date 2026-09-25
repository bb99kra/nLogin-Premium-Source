/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.MD5HashProvider;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_461;
import com.nickuc.login.NLoginCore_030;
import com.nickuc.login.NLoginCore_322;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_369;
import com.nickuc.login.NLoginCore_351;
import com.nickuc.login.NLoginCore_355;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.SHA256HashProvider;
import com.nickuc.login.NLoginCore_113;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_544;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_009;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_220;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_382;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_064;
import com.nickuc.login.NLoginCore_375;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_573;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_497;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_250;
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

public final class NLoginCore_566
extends Enum<NLoginCore_566> {
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_b;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_c;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_d;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_e;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_f;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_g;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_h;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_i;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_j;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_k;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_l;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_m;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_n;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_o;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_p;
    public static final /* enum */ NLoginCore_566 var_com_nickuc_login_NLoginCore_566_q;
    private final boolean aB;
    private final Class<? extends NLoginInterface_009> var_java_lang_Class___extends_com_nickuc_login_NLoginInterface_009__s;
    private NLoginInterface_009 var_com_nickuc_login_NLoginInterface_009_a;
    private static final /* synthetic */ NLoginCore_566[] var_com_nickuc_login_NLoginCore_566_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int var_int_e;
    private static long var_long_f;
    private static int var_int_g;
    private static int var_int_h;
    private static int var_int_i;
    private static long var_long_j;
    private static long var_long_k;
    private static int var_int_l;
    private static long var_long_m;
    private static long var_long_n;
    private static int var_int_o;
    private static long var_long_p;
    private static long var_long_q;
    private static int r;
    private static long var_long_s;
    private static int t;
    private static int u;
    private static long v;
    private static int w;
    private static long x;
    private static long y;
    private static int z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static long am;
    private static long an;
    private static int ao;
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
    private static long az;
    private static int ba;
    private static int bb;
    private static long bc;
    private static long bd;
    private static int be;
    private static int bf;
    private static int bg;
    private static long bh;
    private static int bi;
    private static int bj;
    private static long bk;
    private static long bl;
    private static int bm;
    private static int bn;
    private static long bo;
    private static long bp;
    private static int bq;
    private static int br;
    private static long bs;
    private static long bt;
    private static int bu;
    private static int bv;
    private static long bw;
    private static int bx;
    private static int by;
    private static int bz;
    private static long ca;
    private static int cb;
    private static int cc;
    private static int cd;
    private static long ce;
    private static int cf;
    private static int cg;
    private static int ch;
    private static long ci;
    private static int cj;
    private static int ck;
    private static long cl;
    private static int cm;
    private static int cn;
    private static long co;
    private static long cp;
    private static int cq;
    private static int cr;
    private static long cs;
    private static long ct;
    private static int cu;
    private static int cv;
    private static int cw;
    private static int cx;
    private static int cy;
    private static int cz;
    private static int da;
    private static int db;
    private static int dc;
    private static int dd;
    private static int de;
    private static int df;
    private static int dg;
    private static int dh;
    private static int di;
    private static int dj;
    private static int dk;
    private static int dl;
    private static int dm;
    private static int dn;
    private static int cfr_renamed_1;
    private static long dp;
    private static long dq;
    private static int dr;
    private static int ds;
    private static int dt;
    private static long du;
    private static int dv;
    private static int dw;
    private static long dx;
    private static long dy;
    private static int dz;
    private static int ea;
    private static long eb;
    private static long ec;
    private static int ed;
    private static int ee;
    private static long ef;
    private static int eg;
    private static int eh;
    private static int ei;
    private static long ej;
    private static int ek;
    private static int el;
    private static int em;
    private static long en;
    private static int eo;
    private static int ep;
    private static long eq;
    private static long er;
    private static int es;
    private static int et;
    private static long eu;
    private static long ev;
    private static int ew;
    private static int ex;
    private static long ey;
    private static long ez;
    private static int fa;
    private static int fb;
    private static int fc;
    private static long fd;
    private static long fe;
    private static int ff;
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
    private static int fq;
    private static long fr;
    private static int fs;
    private static int ft;
    private static int fu;
    private static long fv;
    private static int fw;
    private static int fx;
    private static int fy;
    private static int fz;
    private static long ga;
    private static int gb;
    private static int gc;

    @Nullable
    public static NLoginCore_566 a(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split((String)NLoginCore_566.c("㺀", (int)z, (long)aa));
        NLoginCore_566 NLoginCore_5662 = null;
        if (stringArray.length > ab && (NLoginCore_5662 = NLoginCore_566.c(stringArray[ac])) == null && (NLoginCore_5662 = NLoginCore_566.c(stringArray[ad])) == null && string.endsWith((String)NLoginCore_566.c("㺃", (int)(ae & af), (long)ag))) {
            return var_com_nickuc_login_NLoginCore_566_m;
        }
        return NLoginCore_5662;
    }

    public NLoginInterface_009 com_nickuc_login_NLoginInterface_009_a() {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                if (!BCryptHashProvider.boolean_aN()) {
                    throw new UnsupportedOperationException((Object)((Object)this) + (String)NLoginCore_566.c("㺀", (int)var_int_b, (long)var_long_d));
                }
            }
            case 4: {
                if (BCryptHashProvider.boolean_aO()) {
                    return NLoginCore_355.a();
                }
            }
            case 5: {
                if (!BCryptHashProvider.boolean_aO()) break;
                throw new UnsupportedOperationException((Object)((Object)this) + (String)NLoginCore_566.c("㺃", (int)var_int_e, (long)var_long_f));
            }
        }
        if (this.var_com_nickuc_login_NLoginInterface_009_a != null) {
            return this.var_com_nickuc_login_NLoginInterface_009_a;
        }
        try {
            this.var_com_nickuc_login_NLoginInterface_009_a = this.var_java_lang_Class___extends_com_nickuc_login_NLoginInterface_009__s.getConstructor(new Class[var_int_g]).newInstance(new Object[var_int_h]);
            return this.var_com_nickuc_login_NLoginInterface_009_a;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_566.c("㺆", (int)var_int_i, (long)(var_long_j ^ var_long_k)) + (Object)((Object)this) + (String)NLoginCore_566.c("㺉", (int)var_int_l, (long)(var_long_m ^ var_long_n)), reflectiveOperationException);
        }
    }

    /*
     * Exception decompiling
     */
    @Nullable
    private static NLoginCore_566 c(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
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

    public static NLoginCore_566[] values() {
        return (NLoginCore_566[])var_com_nickuc_login_NLoginCore_566_arr_a.clone();
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 173 | 0 << -173;
        var_long_d = Long.reverse(7681834121758226849L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        var_long_f = Long.reverse(7681834121758226849L);
        var_int_g = (0 >>> 217 | 0 << -217) & 0xFFFFFFFF;
        var_int_h = 0 >>> 159 | 0 << ~159 + 1;
        var_int_i = Integer.reverse(0x40000000);
        var_long_j = Long.reverse(-3703265736234387039L);
        var_long_k = Long.reverse(-6485183463413514240L);
        var_int_l = Integer.reverse(-1073741824);
        var_long_m = Long.reverse(-3703265736234387039L);
        var_long_n = Long.reverse(-6485183463413514240L);
        var_int_o = 65536 >>> 142 | 65536 << -142;
        var_long_p = Long.reverse(-3703265736234387039L);
        var_long_q = Long.reverse(-6485183463413514240L);
        r = Integer.reverse(-1610612736);
        var_long_s = Long.reverse(7681834121758226849L);
        t = Integer.reverse(0x60000000);
        u = (-1 >>> 237 | -1 << ~237 + 1) & 0xFFFFFFFF;
        v = Long.reverse(7681834121758226849L);
        w = (28672 >>> 12 | 28672 << -12) & 0xFFFFFFFF;
        x = Long.reverse(-3703265736234387039L);
        y = Long.reverse(-6485183463413514240L);
        z = Integer.reverse(0x10000000);
        aa = Long.reverse(7681834121758226849L);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = Integer.reverse(0);
        ae = 294912 >>> 143 | 294912 << ~143 + 1;
        af = (-1 >>> 160 | -1 << -160) & 0xFFFFFFFF;
        ag = Long.reverse(7681834121758226849L);
        ah = -1 >>> 49 | -1 << ~49 + 1;
        ai = Integer.reverse(0x50000000);
        aj = Long.reverse(7681834121758226849L);
        ak = 0 >>> 8 | 0 << ~8 + 1;
        al = -1073741822 >>> 62 | -1073741822 << -62;
        am = Long.reverse(-3703265736234387039L);
        an = Long.reverse(-6485183463413514240L);
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = (-1 >>> 216 | -1 << -216) & 0xFFFFFFFF;
        aq = Integer.reverse(0x30000000);
        ar = Long.reverse(7681834121758226849L);
        as = Integer.reverse(0);
        at = 0x34000000 >>> 186 | 0x34000000 << ~186 + 1;
        au = Long.reverse(-3703265736234387039L);
        av = Long.reverse(-6485183463413514240L);
        aw = (32768 >>> 79 | 32768 << ~79 + 1) & 0xFFFFFFFF;
        ax = Integer.reverse(0x70000000);
        ay = Long.reverse(-3703265736234387039L);
        az = Long.reverse(-6485183463413514240L);
        ba = (0x10000000 >>> 123 | 0x10000000 << -123) & 0xFFFFFFFF;
        bb = 0x1E000000 >>> 185 | 0x1E000000 << ~185 + 1;
        bc = Long.reverse(-3703265736234387039L);
        bd = Long.reverse(-6485183463413514240L);
        be = (786432 >>> 146 | 786432 << -146) & 0xFFFFFFFF;
        bf = 0x20000000 >>> 153 | 0x20000000 << ~153 + 1;
        bg = (-1 >>> 200 | -1 << -200) & 0xFFFFFFFF;
        bh = Long.reverse(7681834121758226849L);
        bi = (2048 >>> 41 | 2048 << -41) & 0xFFFFFFFF;
        bj = 272 >>> 36 | 272 << ~36 + 1;
        bk = Long.reverse(-3703265736234387039L);
        bl = Long.reverse(-6485183463413514240L);
        bm = (0x140000 >>> 114 | 0x140000 << ~114 + 1) & 0xFFFFFFFF;
        bn = (2304 >>> 167 | 2304 << -167) & 0xFFFFFFFF;
        bo = Long.reverse(-3703265736234387039L);
        bp = Long.reverse(-6485183463413514240L);
        bq = Integer.reverse(0x60000000);
        br = Integer.reverse(-939524096);
        bs = Long.reverse(-3703265736234387039L);
        bt = Long.reverse(-6485183463413514240L);
        bu = 14336 >>> 235 | 14336 << ~235 + 1;
        bv = Integer.reverse(0x28000000);
        bw = Long.reverse(7681834121758226849L);
        bx = Integer.reverse(0x10000000);
        by = Integer.reverse(-1476395008);
        bz = (-1 >>> 93 | -1 << -93) & 0xFFFFFFFF;
        ca = Long.reverse(7681834121758226849L);
        cb = 72 >>> 35 | 72 << -35;
        cc = Integer.reverse(0x68000000);
        cd = Integer.reverse(-1);
        ce = Long.reverse(7681834121758226849L);
        cf = 0x28000000 >>> 218 | 0x28000000 << ~218 + 1;
        cg = 0x170000 >>> 112 | 0x170000 << -112;
        ch = Integer.reverse(-1);
        ci = Long.reverse(7681834121758226849L);
        cj = Integer.reverse(-805306368);
        ck = (6144 >>> 232 | 6144 << ~232 + 1) & 0xFFFFFFFF;
        cl = Long.reverse(7681834121758226849L);
        cm = (98304 >>> 173 | 98304 << ~173 + 1) & 0xFFFFFFFF;
        cn = Integer.reverse(-1744830464);
        co = Long.reverse(-3703265736234387039L);
        cp = Long.reverse(-6485183463413514240L);
        cq = Integer.reverse(-1342177280);
        cr = (13312 >>> 73 | 13312 << ~73 + 1) & 0xFFFFFFFF;
        cs = Long.reverse(-3703265736234387039L);
        ct = Long.reverse(-6485183463413514240L);
        cu = Integer.reverse(0x70000000);
        cv = 4096 >>> 72 | 4096 << ~72 + 1;
        cw = (0 >>> 146 | 0 << ~146 + 1) & 0xFFFFFFFF;
        cx = (16 >>> 228 | 16 << -228) & 0xFFFFFFFF;
        cy = Integer.reverse(0x40000000);
        cz = (6 >>> 193 | 6 << ~193 + 1) & 0xFFFFFFFF;
        da = Integer.reverse(0x20000000);
        db = 0x140000 >>> 50 | 0x140000 << -50;
        dc = (0x180000 >>> 178 | 0x180000 << -178) & 0xFFFFFFFF;
        dd = (0x7000000 >>> 24 | 0x7000000 << -24) & 0xFFFFFFFF;
        de = (2048 >>> 104 | 2048 << -104) & 0xFFFFFFFF;
        df = (0x40000002 >>> 126 | 0x40000002 << -126) & 0xFFFFFFFF;
        dg = 0xA00000 >>> 180 | 0xA00000 << -180;
        dh = Integer.reverse(-805306368);
        di = Integer.reverse(0x30000000);
        dj = Integer.reverse(-1342177280);
        dk = (0xE000000 >>> 152 | 0xE000000 << -152) & 0xFFFFFFFF;
        dl = Integer.reverse(-268435456);
        dm = Integer.reverse(-738197504);
        dn = Integer.reverse(-738197504);
        cfr_renamed_1 = Integer.reverse(-671088640);
        dp = Long.reverse(-3703265736234387039L);
        dq = Long.reverse(-6485183463413514240L);
        dr = 0 >>> 249 | 0 << -249;
        ds = 114688 >>> 140 | 114688 << ~140 + 1;
        dt = -1 >>> 39 | -1 << -39;
        du = Long.reverse(7681834121758226849L);
        dv = 128 >>> 231 | 128 << -231;
        dw = Integer.reverse(-1207959552);
        dx = Long.reverse(-3703265736234387039L);
        dy = Long.reverse(-6485183463413514240L);
        dz = 8192 >>> 76 | 8192 << ~76 + 1;
        ea = (0x3C0000 >>> 241 | 0x3C0000 << ~241 + 1) & 0xFFFFFFFF;
        eb = Long.reverse(-3703265736234387039L);
        ec = Long.reverse(-6485183463413514240L);
        ed = Integer.reverse(-1073741824);
        ee = Integer.reverse(-134217728);
        ef = Long.reverse(7681834121758226849L);
        eg = (0x40000000 >>> 156 | 0x40000000 << -156) & 0xFFFFFFFF;
        eh = 0x40000000 >>> 185 | 0x40000000 << -185;
        ei = Integer.reverse(-1);
        ej = Long.reverse(7681834121758226849L);
        ek = Integer.reverse(-1610612736);
        el = Integer.reverse(-2080374784);
        em = Integer.reverse(-1);
        en = Long.reverse(7681834121758226849L);
        eo = Integer.reverse(0x60000000);
        ep = 17408 >>> 201 | 17408 << -201;
        eq = Long.reverse(-3703265736234387039L);
        er = Long.reverse(-6485183463413514240L);
        es = 14 >>> 193 | 14 << -193;
        et = Integer.reverse(-1006632960);
        eu = Long.reverse(-3703265736234387039L);
        ev = Long.reverse(-6485183463413514240L);
        ew = Integer.MIN_VALUE >>> 252 | Integer.MIN_VALUE << -252;
        ex = 0x900000 >>> 210 | 0x900000 << -210;
        ey = Long.reverse(-3703265736234387039L);
        ez = Long.reverse(-6485183463413514240L);
        fa = Integer.reverse(-1879048192);
        fb = (0 >>> 184 | 0 << -184) & 0xFFFFFFFF;
        fc = 37888 >>> 202 | 37888 << -202;
        fd = Long.reverse(-3703265736234387039L);
        fe = Long.reverse(-6485183463413514240L);
        ff = Integer.reverse(0x50000000);
        fg = Integer.reverse(0);
        fh = Integer.reverse(0x64000000);
        fi = (-1 >>> 194 | -1 << ~194 + 1) & 0xFFFFFFFF;
        fj = Long.reverse(7681834121758226849L);
        fk = (0x2C00000 >>> 86 | 0x2C00000 << -86) & 0xFFFFFFFF;
        fl = 0 >>> 196 | 0 << -196;
        fm = Integer.reverse(-469762048);
        fn = Long.reverse(7681834121758226849L);
        fo = (49152 >>> 204 | 49152 << -204) & 0xFFFFFFFF;
        fp = Integer.reverse(0);
        fq = 0xA000000 >>> 86 | 0xA000000 << -86;
        fr = Long.reverse(7681834121758226849L);
        fs = Integer.reverse(-1342177280);
        ft = (0 >>> 170 | 0 << -170) & 0xFFFFFFFF;
        fu = 10496 >>> 104 | 10496 << -104;
        fv = Long.reverse(7681834121758226849L);
        fw = Integer.reverse(0x70000000);
        fx = Integer.reverse(0);
        fy = Integer.reverse(0x54000000);
        fz = (-1 >>> 107 | -1 << -107) & 0xFFFFFFFF;
        ga = Long.reverse(7681834121758226849L);
        gb = Integer.reverse(-268435456);
        gc = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[dm];
        var_java_lang_String_arr_b = new String[dn];
        NLoginCore_566.b();
        var_com_nickuc_login_NLoginCore_566_b = new NLoginCore_566(NLoginCore_322.class);
        var_com_nickuc_login_NLoginCore_566_c = new NLoginCore_566(NLoginCore_351.class);
        var_com_nickuc_login_NLoginCore_566_d = new NLoginCore_566(NLoginCore_544.class);
        var_com_nickuc_login_NLoginCore_566_e = new NLoginCore_566(NLoginCore_375.class);
        var_com_nickuc_login_NLoginCore_566_f = new NLoginCore_566(NLoginCore_220.class);
        var_com_nickuc_login_NLoginCore_566_g = new NLoginCore_566(NLoginCore_382.class);
        var_com_nickuc_login_NLoginCore_566_h = new NLoginCore_566(NLoginCore_250.class);
        var_com_nickuc_login_NLoginCore_566_i = new NLoginCore_566(NLoginCore_369.class);
        var_com_nickuc_login_NLoginCore_566_j = new NLoginCore_566(MD5HashProvider.class);
        var_com_nickuc_login_NLoginCore_566_k = new NLoginCore_566(fb != 0, NLoginCore_030.class);
        var_com_nickuc_login_NLoginCore_566_l = new NLoginCore_566(fg != 0, NLoginCore_497.class);
        var_com_nickuc_login_NLoginCore_566_m = new NLoginCore_566(fl != 0, NLoginCore_573.class);
        var_com_nickuc_login_NLoginCore_566_n = new NLoginCore_566(fp != 0, NLoginCore_113.class);
        var_com_nickuc_login_NLoginCore_566_o = new NLoginCore_566(ft != 0, NLoginCore_461.class);
        var_com_nickuc_login_NLoginCore_566_p = new NLoginCore_566(fx != 0, SHA256HashProvider.class);
        var_com_nickuc_login_NLoginCore_566_q = new NLoginCore_566(gc != 0, NLoginCore_064.class);
        var_com_nickuc_login_NLoginCore_566_arr_a = NLoginCore_566.com_nickuc_login_NLoginCore_566_arr_a();
    }

    private static /* synthetic */ NLoginCore_566[] com_nickuc_login_NLoginCore_566_arr_a() {
        NLoginCore_566[] NLoginCore_566Array = new NLoginCore_566[cv];
        NLoginCore_566Array[NLoginCore_566.cw] = var_com_nickuc_login_NLoginCore_566_b;
        NLoginCore_566Array[NLoginCore_566.cx] = var_com_nickuc_login_NLoginCore_566_c;
        NLoginCore_566Array[NLoginCore_566.cy] = var_com_nickuc_login_NLoginCore_566_d;
        NLoginCore_566Array[NLoginCore_566.cz] = var_com_nickuc_login_NLoginCore_566_e;
        NLoginCore_566Array[NLoginCore_566.da] = var_com_nickuc_login_NLoginCore_566_f;
        NLoginCore_566Array[NLoginCore_566.db] = var_com_nickuc_login_NLoginCore_566_g;
        NLoginCore_566Array[NLoginCore_566.dc] = var_com_nickuc_login_NLoginCore_566_h;
        NLoginCore_566Array[NLoginCore_566.dd] = var_com_nickuc_login_NLoginCore_566_i;
        NLoginCore_566Array[NLoginCore_566.de] = var_com_nickuc_login_NLoginCore_566_j;
        NLoginCore_566Array[NLoginCore_566.df] = var_com_nickuc_login_NLoginCore_566_k;
        NLoginCore_566Array[NLoginCore_566.dg] = var_com_nickuc_login_NLoginCore_566_l;
        NLoginCore_566Array[NLoginCore_566.dh] = var_com_nickuc_login_NLoginCore_566_m;
        NLoginCore_566Array[NLoginCore_566.di] = var_com_nickuc_login_NLoginCore_566_n;
        NLoginCore_566Array[NLoginCore_566.dj] = var_com_nickuc_login_NLoginCore_566_o;
        NLoginCore_566Array[NLoginCore_566.dk] = var_com_nickuc_login_NLoginCore_566_p;
        NLoginCore_566Array[NLoginCore_566.dl] = var_com_nickuc_login_NLoginCore_566_q;
        return NLoginCore_566Array;
    }

    @Generated
    private NLoginCore_566(boolean bl, Class<? extends NLoginInterface_009> clazz) {
        this.aB = bl;
        this.var_java_lang_Class___extends_com_nickuc_login_NLoginInterface_009__s = clazz;
    }

    public static NLoginCore_566 valueOf(String string) {
        return Enum.valueOf(NLoginCore_566.class, string);
    }

    public String w(String string) {
        if (!this.aB) {
            throw new UnsupportedOperationException((String)NLoginCore_566.c("㺀", (int)var_int_o, (long)(var_long_p ^ var_long_q)) + (Object)((Object)this) + (String)NLoginCore_566.c("㺃", (int)r, (long)var_long_s));
        }
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return this.com_nickuc_login_NLoginInterface_009_a().java_lang_String_w(string);
            }
        }
        throw new UnsupportedOperationException((String)NLoginCore_566.c("㺆", (int)(t & u), (long)v) + (Object)((Object)this) + (String)NLoginCore_566.c("㺉", (int)w, (long)(x ^ y)));
    }

    @Generated
    public Class<? extends NLoginInterface_009> e() {
        return this.var_java_lang_Class___extends_com_nickuc_login_NLoginInterface_009__s;
    }

    /*
     * Exception decompiling
     */
    public static NLoginCore_566 b(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
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

    private NLoginCore_566(Class<? extends NLoginInterface_009> clazz) {
        this(var_int_a != 0, clazz);
    }

    private static void b() {
        int n;
        var_long_c = -8818616238883546829L;
        long l = var_long_c ^ 0x2DF77E1B198CE089L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(34 + 35), (byte)(39 + 44), (byte)(13 + 34), (byte)(45 + 22), (byte)(46 + 20), (byte)(12 + 55), (byte)(28 + 19), (byte)(70 + 10), (byte)(39 + 36), (byte)(45 + 22), (byte)(60 + 23), 53, (byte)(8 + 72), (byte)(9 + 88), 100, (byte)(55 + 45), (byte)(26 + 79), (byte)(100 + 10), (byte)(10 + 93)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_566.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ԽԝԊԞԉՏ԰ԑՄԕԨԐԯՖԤՊՕՒԳԷՕՏԶԴԽՓՄՠՇթԧիՊԾԸԦՃԮՐՀԼԴՋՑղն՘Գ՝ՋՐՉոկՆՇ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[1] = NLoginCore_138.C("ѤфбхаѶїиѫмязіѽыѱѼѹњўѼѶѝћѤѺѫ҇ѮҐюҒѱѥџэѪѕѷѧѣћѲѸҙҝѿњ҄ѲѷѰҟҖѭѮ", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[2] = NLoginCore_223.C("ЩѵѨвѕѫаѦќищюѯђѶпо҂ёѓўҀїѦѸҀ҂јшћѡѬ", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[3] = NLoginCore_223.A("āĢĄûģĊĚåĘĈāñäĐįđċĲĪĂİēĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[4] = NLoginCore_223.F("ԺԤԙԯԡՏՁՇԓՋՄՊԢԗԢԒԩԘԔԵԵՏԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[5] = NLoginCore_575.D("аЭѫѓѠиуЬѰњѲѼѽпѹёѫѱфтѤ҉ѱћѡѦћшѢѝѧҊ", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[6] = NLoginCore_138.D("ѡырішѶѨѮкѲѫѱщощйѐплќќѶэю", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[7] = NLoginCore_091.C("аЭѫѓѠиуЬѰњѱюъвјѼѹѷўѵѯѺѪіҁ҄ѧѫќџѽѳ", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[8] = NLoginCore_138.D("ѨѐаѧаѢђэѤищт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[9] = NLoginCore_091.B("ÿýÚßÿáĭüûęĩçīćþþĕĤĆĵđēĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[10] = NLoginCore_384.B("üõðĪåĢþĂèÿøõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[11] = NLoginCore_110.C("ьђцсѵѩѬѩёѴмт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[12] = NLoginCore_324.D("ЫтЯѥгюѐбѯщѧт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[13] = NLoginCore_091.A("ēĖĤäÿûýĪĩîĀõ", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[14] = NLoginCore_110.B("ĞďĠâĂèăãģĞĮõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[15] = NLoginCore_004.F("ՌՃԖԏԍԾԊԡԯՑԑԛ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[16] = NLoginCore_076.E("ԂԻՅԡԝԐԉԡԓՄԞԛ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[17] = NLoginCore_427.C("эѐѯєѥѠѴіЭѪёт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[18] = NLoginCore_004.D("ѤтчѶзшѮѓѐѤхт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[19] = NLoginCore_110.B("åúòĔóóĭäĭĉîðČéğĈĖčĬëĨēĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[20] = NLoginCore_027.C("ЬѱтѠѵЯѧущцдт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[21] = NLoginCore_324.B("ÞăùĥĦæĠĚĝìĢõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[22] = NLoginCore_201.C("юяьѩдзђггєѯт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[23] = NLoginCore_091.D("ђфѲѵеѵѕЬьзщт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[24] = NLoginCore_384.A("ĢøđĝĤČâęĄåİċëħıĬòñĔñīĹĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[25] = NLoginCore_384.B("ĐąħýĨĞĜøýčîģûîĒįİĈģĲĐăĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[26] = NLoginCore_453.F("ԬՄԶԤԤԟԜԝ԰ՄՋԲԔԴՑԣԙԪԬԲԖԹԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[27] = NLoginCore_453.C("эѐѯєѥѠѴіЭѪёт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[28] = NLoginCore_223.B("ėõúĩêûġĆăėøõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[29] = NLoginCore_384.D("вчпѡррѺбѺілнљжѬѕѣњѹиѵѠэю", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[30] = NLoginCore_387.E("ԂԻՅԡԝԐԉԡԓՄԞԛ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[31] = NLoginCore_559.E("ԪԛԡԊԻ԰ԤԽԲԣՋԎԘՒԸԼԙՍՈՏԶ՟Ԧԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[32] = NLoginCore_173.B("ėøâĂěģīĠåêíðČìĤëİôĘĺĘĩĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[33] = NLoginCore_138.F("ԄԩԟՋՌԌՆՀՃԒՈԛ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[34] = NLoginCore_324.E("ԅՊԛԹՎԈՀԜԢԟԍԛ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[35] = NLoginCore_027.F("ԧԨԥՂԍԐԫԌԌԭՈԛ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[36] = NLoginCore_324.D("птпжЮѕыкѨѩћѭѪэрѫѾ҅зѕфѠэю", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[37] = NLoginCore_384.A("üĢüçĈĂãĊĎČāĢĎĳñĲćČóĤĈĻòóĎĲľþøğŁğ", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[38] = NLoginCore_092.E("ԃԮՊԫԫՒԫԓԴՀՆՎԵԴԖԯԒԭԨ՜ՋԜՙՀԸՂՑԡԧՕթԻ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[39] = NLoginCore_223.E("ԶԫՍԣՎՄՂԞԣԳԒԪԘՂ՘ԫԯԖԲԪԹՏԦԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[40] = NLoginCore_027.A("ěĄĉĚćĨÿęĞęêĮĜĬÿĐĐāóđąēĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[41] = NLoginCore_559.F("ԣԸԇԏԠԏԣՍՕԨՌԵԨՉԹՋՐԯԺԕՕՌԔՏԴԶԟ՝Զԡ՝Ֆ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[42] = NLoginCore_091.D("ѯхўѪѱљЯѦёвѽѺѬѓњяй҂џѰўо҈Ѻш҉ҌѭѧѠѠъ", (byte)23, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_566.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ė÷äøãĩĊëĞïĂêĉİþĤįĬčđįĩĐĎėĭĞĺġŃāŅĤĘĒĀĝĈĪĚĖĎĤěİĐŃĮĈŒĎĥĲŌĘŒļħğŘęĲłĹ", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[1] = NLoginCore_453.D("ѤфбхаѶїиѫмязіѽыѱѼѹњўѼѶѝћѤѺѫ҇ѮҐюҒѱѥџэѪѕѷѧѣћѱѷҖјҙѺҚўҗҡҀҝңѧ҃ҦѷҝҋҁҰҡ", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[2] = NLoginCore_384.D("ЩѵѨвѕѫаѦќищюѯђѶпо҂ёѓўҀѱхѵшѼҀџѻѺҍѦѝ҆ёѦ҃ҚѓѪѕќѢ", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[3] = NLoginCore_387.E("ԧՈԪԡՉ԰ՀԋԾԮԧԡԕԖԸՊԖԦԭՓՓՕԻԾԛԢԽԙԣԡԩՔ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[4] = NLoginCore_091.E("ԺԤԙԯԡՏՁՇԓՋՆԕՏԑԲՆԧԔԨ՘ԷՏԦԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[5] = NLoginCore_138.F("ԉԆՄԬԹԑԜԅՉԳՋՕՖԘՒԪՄՊԝԛԽՠԢՀ԰Նդ՛ՃԥԹԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[6] = NLoginCore_384.F("ԺԤԙԯԡՏՁՇԓՋՆՌԡՂԙՆԚՍԭՒ՞ՏԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[7] = NLoginCore_004.D("аЭѫѓѠиуЬѰњѱюъвјѼѹѷўѵѯѺѧѶ҅ыҊфѝыѯѤ", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[8] = NLoginCore_004.B("ĖĚĂäýğ÷öćúĮõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[9] = NLoginCore_451.B("ÿýÚßÿáĭüûęĩąİñįāįĬĊĺĻăĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[10] = NLoginCore_387.F("ԵԜԪԢԟԌԢԫԑԴՒԉՊԷՒԲՇԾՐԴԲԹԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[11] = NLoginCore_324.E("ԽԥԚԹԉԋԽԟՇԐՐԓԖԳՙԨԎՉԶԟԛԩԦԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[12] = NLoginCore_138.B("ĄāåßĊģħĈäìĈõ", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[13] = NLoginCore_091.C("ѭЮЬѠфЮѴѓѴѪхт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[14] = NLoginCore_223.D("ЮхцвѩфѡѐѮвѳт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[15] = NLoginCore_453.C("Ѣббсжјщььймт", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[16] = NLoginCore_091.F("ԋԾԗԽԫԻԾԊՃՊՓՊՎԥԳՌԴԓԳՒԛԹԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[17] = NLoginCore_575.A("ïòàđğĉĬìþúīñĳòĕĖöģēñĸēĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[18] = NLoginCore_223.A("æĢæĖæĞīĊøĤįùđċčðĩįĬðñăĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[19] = NLoginCore_091.C("вчпѡррѺбѺілцъљѐўѠҁхпсѶэю", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[20] = NLoginCore_004.D("ёџвѯѬгѬёєєкањѩѶѯмоѷрє҆эю", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[21] = NLoginCore_384.F("ԵՍՆՁԞԋՆՍԣԥՄԳՈԋԢԪԯԗ՚ԛՐԩԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[22] = NLoginCore_387.A("ßĕěþùéâõþĢĢõ", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[23] = NLoginCore_223.E("ԣԸԋԸՋՌՎԎՀԠՔԛ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ĢøđĝĤČâęĄåįęċĴīðąÿĲĶĹĹĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[25] = NLoginCore_027.E("ԶԫՍԣՎՄՂԞԣԳԓԥԑՍԭԦՋ԰ԪԧՏԩԦԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[26] = NLoginCore_027.A("ĆĞĐþþùö÷ĊĞĢĢêåđđĥíćāĶĩĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[27] = NLoginCore_223.F("ԿԿԝԨԤԡԦԽԑԽԪԬԸՏԯԪԪԽԱԖ՜՟Ԧԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[28] = NLoginCore_223.C("рѡнѦѸљЫѳњѓѮѿпкѶим҄ќљёѶэю", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[29] = NLoginCore_451.B("åúòĔóóĭäĭĉëčġĬĆĂĥĴġĆúĩĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[30] = NLoginCore_110.E("ՃԿԘԝՐԤՍԛԣԪԒԧՆԱՎՋԦ԰԰ԫ՜ԩԦԧ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[31] = NLoginCore_453.B("ĄõûäĕĊþėČýĢĪúìďĂčġĶđįēĀā", (byte)23, 66);
                    NLoginCore_566.var_java_lang_String_arr_b[32] = NLoginCore_201.C("ѤхЯяѨѰѸѭвзишщђиљѴєїиёѐэю", (byte)23, 67);
                    NLoginCore_566.var_java_lang_String_arr_b[33] = NLoginCore_076.A("ÞĕĒĤĢĥġĠþĜĦêĳóĴćģÿčĕęĹĀā", (byte)23, 65);
                    NLoginCore_566.var_java_lang_String_arr_b[34] = NLoginCore_091.F("ԠՊԿԼԜՇԽԯԼԟԨԓԎՅԧԷՊՕԿՍԹԩԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[35] = NLoginCore_027.D("аёўѵЯѤњъѐээт", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[36] = NLoginCore_324.D("птпжЮѕыкѨѩљѯляљѸѓѕмцћѐэю", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[37] = NLoginCore_076.E("ԢՈԢԍԮԨԉ԰ԴԲԧՈԴՙԗ՘ԭԲԙՊԮբՁՀԖՕ՟ԙՙեԴԼԬՃեՆԢՠՉՑԭՒՒԻ", (byte)23, 69);
                    NLoginCore_566.var_java_lang_String_arr_b[38] = NLoginCore_091.F("ԃԮՊԫԫՒԫԓԴՀՆՎԵԴԖԯԒԭԨ՜Ջա՛ՐԳԡէՓՙԶԹՈ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[39] = NLoginCore_384.F("ԶԫՍԣՎՄՂԞԣԳԔՕԥՐԫՑՑԚԹ՟՟ՑԶբԣ՛Ղ՞ՂԵՇզ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[40] = NLoginCore_451.F("ՁԪԯՀԭՎԥԿՄԿԏԴՙԩԭԚԳԜ՟ԿԝԹԦԧ", (byte)23, 70);
                    NLoginCore_566.var_java_lang_String_arr_b[41] = NLoginCore_027.D("ъџЮжчжъѴѼяѳќяѰѠѲѷіѡмѼѩѦќ҃ѫѽўѷўѩѦ", (byte)23, 68);
                    NLoginCore_566.var_java_lang_String_arr_b[42] = NLoginCore_091.E("ՈԞԷՃՊԲԈԿԪԋՖՓՅԬԳԨԒ՛ԸՉԷՠԳՂեՑՆ՜թԛՀԡ", (byte)23, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_566.var_java_lang_String_arr_b[0] = NLoginCore_324.C("пѨѬрѯЮѱѴђкьѕѐоѼѱѲуюѓѺѐэю", (byte)23, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_566.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ĕðĉĄãĚüýęğĦõ", (byte)23, 66);
                }
            }
        }
    }

    @Generated
    public boolean aD() {
        return this.aB;
    }

    private static String a(int n, long l) {
        l ^= 0x65L;
        l ^= 0x2DF77E1B198CE089L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(67 + 2), (byte)(45 + 38), (byte)(45 + 2), (byte)(66 + 1), (byte)(8 + 58), (byte)(40 + 27), (byte)(6 + 41), (byte)(43 + 37), (byte)(42 + 33), (byte)(59 + 8), (byte)(82 + 1), (byte)(30 + 23), (byte)(63 + 17), (byte)(70 + 27), (byte)(2 + 98), 100, (byte)(12 + 93), (byte)(82 + 28), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.D("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠒࠤߴࠠࠕࠠࠅࠉࠬ࠯", (byte)51, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_566.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_566.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 65), NLoginCore_566.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.E("և֔֓Ֆ֖֒֍֖֡֐՝֛֛֟֘֡գࣺࣶࣶࣨ࣊࣫ࣛࣟंअչ", (byte)104, 69) + string + NLoginCore_076.B("Ɖ", (byte)104, 66) + methodType.toString(), exception);
        }
    }
}

