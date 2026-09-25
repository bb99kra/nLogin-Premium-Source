/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_407;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_308;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_335;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_248
extends Enum<NLoginCore_248> {
    public static final /* enum */ NLoginCore_248 var_com_nickuc_login_NLoginCore_311_e;
    public static final /* enum */ NLoginCore_248 var_com_nickuc_login_NLoginCore_311_f;
    public static final int aD;
    public static final int aE;
    private final String var_java_lang_String_cx;
    private static final /* synthetic */ NLoginCore_248[] var_com_nickuc_login_NLoginCore_311_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static int var_int_a;
    private static long var_long_b;
    private static long d;
    private static int var_int_e;
    private static int var_int_f;
    private static long g;
    private static int h;
    private static long i;
    private static long j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static long o;
    private static int p;
    private static long q;
    private static long r;
    private static int s;
    private static long t;
    private static long u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static long z;
    private static long aa;
    private static int ab;
    private static long ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static int ah;
    private static long ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static long am;
    private static int an;
    private static long ao;
    private static long ap;
    private static int aq;
    private static long ar;
    private static long as;
    private static int at;
    private static long au;
    private static long av;
    private static long aw;
    private static int ax;
    private static int ay;
    private static long az;
    private static long ba;
    private static int bb;
    private static long bc;
    private static long bd;
    private static int be;
    private static long bf;
    private static long bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static long bm;
    private static int bn;
    private static long bo;
    private static long bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static int bt;
    private static long bu;
    private static long bv;
    private static int bw;
    private static long bx;
    private static int by;
    private static int bz;
    private static int ca;
    private static long cb;
    private static long cc;
    private static int cd;
    private static long ce;
    private static long cf;
    private static int cg;
    private static int ch;
    private static int ci;
    private static int cj;
    private static int ck;
    private static int cl;
    private static long cm;
    private static int cn;
    private static long co;
    private static long cp;
    private static int cq;
    private static int cr;
    private static long cs;
    private static int ct;
    private static int cu;
    private static long cv;
    private static int cw;
    private static long var_long_cx;
    private static int cy;
    private static int cz;
    private static long da;
    private static int db;
    private static long dc;
    private static int dd;
    private static long de;
    private static long df;
    private static int dg;
    private static long dh;
    private static long di;
    private static int dj;
    private static long dk;
    private static long dl;
    private static int dm;
    private static long dn;
    private static long cfr_renamed_1;
    private static int dp;
    private static long dq;
    private static int dr;
    private static long ds;
    private static long dt;
    private static int du;
    private static long dv;
    private static long dw;
    private static int dx;
    private static long dy;
    private static int dz;
    private static long ea;
    private static long eb;
    private static int ec;
    private static int ed;
    private static long ee;
    private static int ef;
    private static int eg;
    private static long eh;
    private static int ei;
    private static int ej;
    private static long ek;
    private static int el;
    private static int em;
    private static long en;
    private static int eo;
    private static int ep;
    private static long eq;
    private static int er;
    private static long es;
    private static long et;
    private static int eu;
    private static int ev;
    private static long ew;
    private static int ex;
    private static long ey;
    private static int ez;
    private static long fa;
    private static long fb;
    private static int fc;
    private static long fd;
    private static long fe;
    private static int ff;
    private static int fg;
    private static long fh;
    private static int fi;
    private static long fj;
    private static long fk;
    private static int fl;
    private static int fm;
    private static int fn;
    private static int fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private static int fs;
    private static long ft;
    private static int fu;
    private static int fv;
    private static long fw;
    private static int fx;
    private static long fy;
    private static int fz;
    private static int ga;
    private static int gb;
    private static int gc;
    private static int gd;
    private static int ge;
    private static int gf;
    private static int gg;
    private static int gh;
    private static int gi;
    private static int gj;
    private static long gk;
    private static int gl;
    private static int gm;
    private static long gn;
    private static int go;
    private static long gp;
    private static long gq;
    private static int gr;
    private static int gs;
    private static int gt;
    private static long gu;

    public boolean aG() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_c.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_l.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)(cq & cr), (long)cs) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)(ct & cu), (long)cv));
    }

    public NLoginCore_560 com_nickuc_login_NLoginInterface_038_a(NLoginType_008 NLoginType_008) {
        NLoginCore_560 NLoginInterface_0382;
        NLoginCore_308 NLoginCore_3082 = NLoginType_008.com_nickuc_login_NLoginCore_308_a();
        switch (this.ordinal()) {
            case 0: {
                NLoginInterface_0382 = NLoginCore_3082.com_nickuc_login_NLoginCore_057_a();
                break;
            }
            case 1: {
                NLoginInterface_0382 = NLoginCore_3082.com_nickuc_login_NLoginCore_144_a();
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)(ei & ej), (long)ek) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)(el & em), (long)en));
            }
        }
        if (NLoginInterface_0382 == null) {
            throw new IllegalStateException((Object)((Object)this) + (String)NLoginCore_248.c("㺆", (int)(eo & ep), (long)eq));
        }
        return NLoginInterface_0382;
    }

    public boolean a(ForceRegisterConfig ForceRegisterConfig2, @Nullable NLoginCore_137 NLoginCore_1372, String string) {
        return (string != null && string.equalsIgnoreCase(this.java_lang_String_a(ForceRegisterConfig2, NLoginCore_1372)) ? bh : bi) != 0;
    }

    private static /* synthetic */ NLoginCore_248[] a() {
        NLoginCore_248[] NLoginCore_311Array = new NLoginCore_248[gb];
        NLoginCore_311Array[NLoginCore_248.gc] = var_com_nickuc_login_NLoginCore_311_e;
        NLoginCore_311Array[NLoginCore_248.gd] = var_com_nickuc_login_NLoginCore_311_f;
        return NLoginCore_311Array;
    }

    public boolean aJ() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_e.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_n.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)dr, (long)(ds ^ dt)) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)du, (long)(dv ^ dw)));
    }

    public String getName() {
        return this.var_java_lang_String_cx;
    }

    public boolean boolean_a(ForceRegisterConfig ForceRegisterConfig2, @Nullable NLoginCore_137 NLoginCore_1372) {
        if (NLoginCore_1372 == null) {
            return v != 0;
        }
        NLoginCore_137 NLoginCore_1373 = this.com_nickuc_login_NLoginCore_137_a(ForceRegisterConfig2);
        return (NLoginCore_1373 != null && NLoginCore_1373 == NLoginCore_1372 ? w : x) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0xA6D97355058DDFB0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(5 + 64), (byte)(45 + 38), (byte)(21 + 26), (byte)(32 + 35), (byte)(60 + 6), 67, (byte)(33 + 14), (byte)(3 + 77), (byte)(24 + 51), (byte)(45 + 22), (byte)(75 + 8), (byte)(6 + 47), (byte)(75 + 5), (byte)(79 + 18), (byte)(89 + 11), (byte)(69 + 31), (byte)(77 + 28), (byte)(101 + 9), (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߲߱߳߿ࠀ߷߱߱߳߳ࠆࠌࠄ", (byte)38, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_248.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public String java_lang_String_a(ForceRegisterConfig ForceRegisterConfig2) {
        return (String)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().b((String)NLoginCore_248.c("㺀", (int)k, (long)(l ^ m)) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺃", (int)n, (long)o));
    }

    public NLoginCore_137 com_nickuc_login_NLoginCore_137_a(ForceRegisterConfig ForceRegisterConfig2) {
        String string = (String)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().b((String)NLoginCore_248.c("㺀", (int)s, (long)(t ^ u)));
        return string != null ? NLoginCore_137.valueOf(string) : null;
    }

    public String u() {
        if (this == var_com_nickuc_login_NLoginCore_311_f && NLoginCore_150.j()) {
            return NLoginCore_248.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
        }
        return this.var_java_lang_String_cx;
    }

    public boolean b(ForceRegisterConfig ForceRegisterConfig2, @Nullable NLoginCore_137 NLoginCore_1372) {
        return (this.java_lang_String_a(ForceRegisterConfig2, NLoginCore_1372) != null ? bj : bk) != 0;
    }

    public static NLoginCore_248[] values() {
        return (NLoginCore_248[])var_com_nickuc_login_NLoginCore_311_arr_a.clone();
    }

    public boolean aI() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_d.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_m.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)dm, (long)(dn ^ cfr_renamed_1)) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)dp, (long)dq));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_248.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ѰҒҔѴҘҷүӅұҀҾҴӂҼ҅ҪӌӋӃӉӃҘ", (byte)49, 67), NLoginCore_248.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.D("ҫҸҷѺҺҶұҺӅҴҁҿӃҼҿӅ҇ࠒࠓࠔࠠࠡ࠘ࠒࠒࠔࠔࠧ࠭ࠥҠ", (byte)49, 68) + string + NLoginCore_453.F("ԧ", (byte)49, 70) + methodType.toString(), exception);
        }
    }

    @Nullable
    public String java_lang_String_b(ForceRegisterConfig ForceRegisterConfig2) {
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_3352.m();
            }
            case 1: {
                return NLoginCore_3352.l();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)db, (long)dc) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)dd, (long)(de ^ df)));
    }

    static {
        var_int_a = 0 >>> 108 | 0 << ~108 + 1;
        var_long_b = Long.reverse(-8194804750778054018L);
        d = Long.reverse(0x1400000000000000L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        var_int_f = Integer.reverse(-1);
        g = Long.reverse(-7330113622322918786L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-8194804750778054018L);
        j = Long.reverse(0x1400000000000000L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-8194804750778054018L);
        m = Long.reverse(0x1400000000000000L);
        n = (0x400000 >>> 116 | 0x400000 << -116) & 0xFFFFFFFF;
        o = Long.reverse(-7330113622322918786L);
        p = 0x140000 >>> 242 | 0x140000 << ~242 + 1;
        q = Long.reverse(-8194804750778054018L);
        r = Long.reverse(0x1400000000000000L);
        s = Integer.reverse(0x60000000);
        t = Long.reverse(-8194804750778054018L);
        u = Long.reverse(0x1400000000000000L);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = (64 >>> 198 | 64 << ~198 + 1) & 0xFFFFFFFF;
        x = (0 >>> 111 | 0 << ~111 + 1) & 0xFFFFFFFF;
        y = 7 >>> 192 | 7 << ~192 + 1;
        z = Long.reverse(-8194804750778054018L);
        aa = Long.reverse(0x1400000000000000L);
        ab = Integer.reverse(0x10000000);
        ac = Long.reverse(-7330113622322918786L);
        ad = Long.reverse(-1152921504606846976L);
        ae = 0x480000 >>> 147 | 0x480000 << -147;
        af = Integer.reverse(-1);
        ag = Long.reverse(-7330113622322918786L);
        ah = (20480 >>> 75 | 20480 << ~75 + 1) & 0xFFFFFFFF;
        ai = Long.reverse(-8194804750778054018L);
        aj = Long.reverse(0x1400000000000000L);
        ak = 0x2C00000 >>> 150 | 0x2C00000 << -150;
        al = -1 >>> 178 | -1 << -178;
        am = Long.reverse(-7330113622322918786L);
        an = Integer.reverse(0x30000000);
        ao = Long.reverse(-8194804750778054018L);
        ap = Long.reverse(0x1400000000000000L);
        aq = Integer.reverse(-1342177280);
        ar = Long.reverse(-8194804750778054018L);
        as = Long.reverse(0x1400000000000000L);
        at = Integer.reverse(0x70000000);
        au = Long.reverse(-8194804750778054018L);
        av = Long.reverse(0x1400000000000000L);
        aw = Long.reverse(-1152921504606846976L);
        ax = (0x78000000 >>> 219 | 0x78000000 << -219) & 0xFFFFFFFF;
        ay = Integer.reverse(-1);
        az = Long.reverse(-7330113622322918786L);
        ba = Long.reverse(-1152921504606846976L);
        bb = Integer.reverse(0x8000000);
        bc = Long.reverse(-8194804750778054018L);
        bd = Long.reverse(0x1400000000000000L);
        be = (0x10000001 >>> 28 | 0x10000001 << -28) & 0xFFFFFFFF;
        bf = Long.reverse(-8194804750778054018L);
        bg = Long.reverse(0x1400000000000000L);
        bh = (8 >>> 195 | 8 << -195) & 0xFFFFFFFF;
        bi = 0 >>> 87 | 0 << -87;
        bj = Integer.reverse(Integer.MIN_VALUE);
        bk = Integer.reverse(0);
        bl = 1152 >>> 166 | 1152 << -166;
        bm = Long.reverse(-7330113622322918786L);
        bn = (304 >>> 68 | 304 << -68) & 0xFFFFFFFF;
        bo = Long.reverse(-8194804750778054018L);
        bp = Long.reverse(0x1400000000000000L);
        bq = 192 >>> 38 | 192 << ~38 + 1;
        br = (32 >>> 165 | 32 << -165) & 0xFFFFFFFF;
        bs = (0 >>> 55 | 0 << ~55 + 1) & 0xFFFFFFFF;
        bt = Integer.reverse(0x28000000);
        bu = Long.reverse(-8194804750778054018L);
        bv = Long.reverse(0x1400000000000000L);
        bw = Integer.reverse(-1476395008);
        bx = Long.reverse(-7330113622322918786L);
        by = Integer.reverse(0);
        bz = (1 >>> 64 | 1 << -64) & 0xFFFFFFFF;
        ca = (0x16000000 >>> 152 | 0x16000000 << ~152 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(-8194804750778054018L);
        cc = Long.reverse(0x1400000000000000L);
        cd = Integer.reverse(-402653184);
        ce = Long.reverse(-7330113622322918786L);
        cf = Long.reverse(-1152921504606846976L);
        cg = (0x40000000 >>> 62 | 0x40000000 << ~62 + 1) & 0xFFFFFFFF;
        ch = 0 >>> 157 | 0 << ~157 + 1;
        ci = Integer.reverse(Integer.MIN_VALUE);
        cj = (0 >>> 161 | 0 << ~161 + 1) & 0xFFFFFFFF;
        ck = Integer.reverse(0x18000000);
        cl = Integer.reverse(-1);
        cm = Long.reverse(-7330113622322918786L);
        cn = Integer.reverse(-1744830464);
        co = Long.reverse(-8194804750778054018L);
        cp = Long.reverse(0x1400000000000000L);
        cq = Integer.reverse(0x58000000);
        cr = (-1 >>> 240 | -1 << ~240 + 1) & 0xFFFFFFFF;
        cs = Long.reverse(-7330113622322918786L);
        ct = Integer.reverse(-671088640);
        cu = -1 >>> 254 | -1 << -254;
        cv = Long.reverse(-7330113622322918786L);
        cw = (896 >>> 133 | 896 << -133) & 0xFFFFFFFF;
        var_long_cx = Long.reverse(-7330113622322918786L);
        cy = Integer.reverse(-1207959552);
        cz = (-1 >>> 176 | -1 << -176) & 0xFFFFFFFF;
        da = Long.reverse(-7330113622322918786L);
        db = Integer.reverse(0x78000000);
        dc = Long.reverse(-7330113622322918786L);
        dd = Integer.reverse(-134217728);
        de = Long.reverse(-8194804750778054018L);
        df = Long.reverse(0x1400000000000000L);
        dg = Integer.reverse(0x4000000);
        dh = Long.reverse(-8194804750778054018L);
        di = Long.reverse(0x1400000000000000L);
        dj = Integer.reverse(-2080374784);
        dk = Long.reverse(-8194804750778054018L);
        dl = Long.reverse(0x1400000000000000L);
        dm = Integer.reverse(0x44000000);
        dn = Long.reverse(-8194804750778054018L);
        cfr_renamed_1 = Long.reverse(0x1400000000000000L);
        dp = Integer.reverse(-1006632960);
        dq = Long.reverse(-7330113622322918786L);
        dr = Integer.reverse(0x24000000);
        ds = Long.reverse(-8194804750778054018L);
        dt = Long.reverse(0x1400000000000000L);
        du = (74 >>> 225 | 74 << -225) & 0xFFFFFFFF;
        dv = Long.reverse(-8194804750778054018L);
        dw = Long.reverse(0x1400000000000000L);
        dx = (608 >>> 228 | 608 << ~228 + 1) & 0xFFFFFFFF;
        dy = Long.reverse(-7330113622322918786L);
        dz = (939524097 >>> 251 | 939524097 << -251) & 0xFFFFFFFF;
        ea = Long.reverse(-8194804750778054018L);
        eb = Long.reverse(0x1400000000000000L);
        ec = Integer.reverse(0x14000000);
        ed = Integer.reverse(-1);
        ee = Long.reverse(-7330113622322918786L);
        ef = (10496 >>> 40 | 10496 << ~40 + 1) & 0xFFFFFFFF;
        eg = Integer.reverse(-1);
        eh = Long.reverse(-7330113622322918786L);
        ei = Integer.reverse(0x54000000);
        ej = (-1 >>> 239 | -1 << ~239 + 1) & 0xFFFFFFFF;
        ek = Long.reverse(-7330113622322918786L);
        el = Integer.reverse(-738197504);
        em = Integer.reverse(-1);
        en = Long.reverse(-7330113622322918786L);
        eo = Integer.reverse(0x34000000);
        ep = (-1 >>> 185 | -1 << ~185 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(-7330113622322918786L);
        er = Integer.reverse(-1275068416);
        es = Long.reverse(-8194804750778054018L);
        et = Long.reverse(0x1400000000000000L);
        eu = Integer.reverse(0x74000000);
        ev = -1 >>> 1 | -1 << ~1 + 1;
        ew = Long.reverse(-7330113622322918786L);
        ex = (-1140850688 >>> 154 | -1140850688 << ~154 + 1) & 0xFFFFFFFF;
        ey = Long.reverse(-7330113622322918786L);
        ez = 0xC00000 >>> 18 | 0xC00000 << ~18 + 1;
        fa = Long.reverse(-8194804750778054018L);
        fb = Long.reverse(0x1400000000000000L);
        fc = Integer.reverse(-1946157056);
        fd = Long.reverse(-8194804750778054018L);
        fe = Long.reverse(0x1400000000000000L);
        ff = 0xC800000 >>> 214 | 0xC800000 << ~214 + 1;
        fg = (-1 >>> 19 | -1 << ~19 + 1) & 0xFFFFFFFF;
        fh = Long.reverse(-7330113622322918786L);
        fi = Integer.reverse(-872415232);
        fj = Long.reverse(-8194804750778054018L);
        fk = Long.reverse(0x1400000000000000L);
        fl = Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << -222;
        fm = (0 >>> 185 | 0 << -185) & 0xFFFFFFFF;
        fn = (0 >>> 101 | 0 << ~101 + 1) & 0xFFFFFFFF;
        fo = 0x100000 >>> 180 | 0x100000 << ~180 + 1;
        fp = 0x400000 >>> 54 | 0x400000 << -54;
        fq = Integer.reverse(0);
        fr = (0x6800000 >>> 149 | 0x6800000 << ~149 + 1) & 0xFFFFFFFF;
        fs = Integer.reverse(-1);
        ft = Long.reverse(-7330113622322918786L);
        fu = (868352 >>> 206 | 868352 << -206) & 0xFFFFFFFF;
        fv = (-1 >>> 3 | -1 << ~3 + 1) & 0xFFFFFFFF;
        fw = Long.reverse(-7330113622322918786L);
        fx = Integer.reverse(0x6C000000);
        fy = Long.reverse(-7330113622322918786L);
        fz = Integer.reverse(0);
        ga = Integer.reverse(0);
        gb = Integer.reverse(0x40000000);
        gc = 0 >>> 169 | 0 << -169;
        gd = Integer.reverse(Integer.MIN_VALUE);
        ge = Integer.reverse(-603979776);
        gf = Integer.reverse(-603979776);
        gg = 0x1E0000 >>> 177 | 0x1E0000 << ~177 + 1;
        gh = 786432 >>> 146 | 786432 << ~146 + 1;
        gi = Integer.reverse(-335544320);
        gj = Integer.reverse(-1);
        gk = Long.reverse(-7330113622322918786L);
        gl = 0 >>> 37 | 0 << ~37 + 1;
        gm = (0x1C0000 >>> 207 | 0x1C0000 << -207) & 0xFFFFFFFF;
        gn = Long.reverse(-7330113622322918786L);
        go = Integer.reverse(-1677721600);
        gp = Long.reverse(-8194804750778054018L);
        gq = Long.reverse(0x1400000000000000L);
        gr = (32768 >>> 239 | 32768 << -239) & 0xFFFFFFFF;
        gs = Integer.reverse(0x5C000000);
        gt = -1 >>> 37 | -1 << -37;
        gu = Long.reverse(-7330113622322918786L);
        var_java_lang_String_arr_a = new String[ge];
        var_java_lang_String_arr_b = new String[gf];
        NLoginCore_248.b();
        aD = gg;
        aE = gh;
        var_com_nickuc_login_NLoginCore_311_e = new NLoginCore_248((String)NLoginCore_248.c("㺃", (int)gm, (long)gn));
        var_com_nickuc_login_NLoginCore_311_f = new NLoginCore_248((String)NLoginCore_248.c("㺉", (int)(gs & gt), (long)gu));
        var_com_nickuc_login_NLoginCore_311_arr_a = NLoginCore_248.a();
    }

    public boolean e(ForceRegisterConfig ForceRegisterConfig2) {
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_3352.D();
            }
            case 1: {
                return NLoginCore_3352.C();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)dg, (long)(dh ^ di)) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)dj, (long)(dk ^ dl)));
    }

    public void void_b(ForceRegisterConfig ForceRegisterConfig2) {
        NLoginCore_407 NLoginCore_407 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a();
        Integer n = (Integer)NLoginCore_407.b((String)NLoginCore_248.c("㺀", (int)bt, (long)(bu ^ bv)) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺃", (int)bw, (long)bx));
        if (n == null) {
            n = by;
        }
        Integer n2 = n;
        n = n + bz;
        NLoginCore_407.a((String)NLoginCore_248.c("㺆", (int)ca, (long)(cb ^ cc)) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺉", (int)cd, (long)ce), n, cf, TimeUnit.MINUTES);
    }

    public boolean aH() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_j.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_r.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)cw, (long)var_long_cx) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)(cy & cz), (long)da));
    }

    public boolean aL() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_g.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_p.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)(ec & ed), (long)ee) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)(ef & eg), (long)eh));
    }

    public static NLoginCore_248 valueOf(String string) {
        return Enum.valueOf(NLoginCore_248.class, string);
    }

    public boolean d(NLoginType_008 NLoginType_008) {
        switch (this.ordinal()) {
            case 0: {
                return (NLoginCore_596.var_com_nickuc_login_NLoginCore_363_a.ar() && NLoginType_008.com_nickuc_login_NLoginCore_308_a().com_nickuc_login_NLoginCore_057_a() != null ? cg : ch) != 0;
            }
            case 1: {
                return (NLoginCore_596.var_com_nickuc_login_NLoginCore_363_k.ar() && NLoginType_008.com_nickuc_login_NLoginCore_308_a().com_nickuc_login_NLoginCore_144_a() != null ? ci : cj) != 0;
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)(ck & cl), (long)cm) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)cn, (long)(co ^ cp)));
    }

    private static void b() {
        int n;
        c = 9102632753717600881L;
        long l = c ^ 0xA6D97355058DDFB0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(43 + 26), (byte)(61 + 22), (byte)(44 + 3), 67, (byte)(22 + 44), (byte)(51 + 16), (byte)(13 + 34), (byte)(20 + 60), (byte)(20 + 55), (byte)(38 + 29), 83, (byte)(9 + 44), (byte)(15 + 65), (byte)(45 + 52), (byte)(46 + 54), (byte)(5 + 95), (byte)(104 + 1), (byte)(69 + 41), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
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
                    NLoginCore_248.var_java_lang_String_arr_b[0] = NLoginCore_004.E("ժ֋֐ձՏ֊Ւ՗է֎՚ՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[4] = NLoginCore_092.E("֒եմւլՎ֘֘֔֎յշ֕ֆղ֗՞֍֐֡գվիլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[5] = NLoginCore_004.C("ԸԴԤԖՆԤԙӿԫԶԨԩԉԝԚՁԮԅԎՉՕԟԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[6] = NLoginCore_027.E("֑֋զ֊՟Ռձ֋յօ՛զկ՜խ՗խա֡ջ՟վիլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[7] = NLoginCore_091.B("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ƱƄƓơƋŭƷƷƳƭƔƖƴƥƑƶŽƬƯǀƂƝƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[9] = NLoginCore_027.C("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[10] = NLoginCore_324.C("ՃԖԥԳԝӿՉՉՅԿԦԨՆԷԣՈԏԾՁՒԔԯԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[11] = NLoginCore_559.C("ԘӾԭӷԀՈՆԩՃԟԇԬԠԆԪԞԛԐԍՎԢՉՙԹԹՌՈԓԷԩ԰՛ՔգդՆ՟գԵՓթԥՙԥԸՁեՐժՈՅԯժՏԼԽ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[12] = NLoginCore_138.A("ŨƑƭŻƢƕƆƫƹƤƉƕŲƱƊƖƊƬƿƭƓżƁƻƢƱƅƸƟƺƫƇ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[13] = NLoginCore_387.B("ƣƝƲƟƕƊƓƕƓŲŷƶƯŹƆƜƻƶƭƒƣǃƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[14] = NLoginCore_427.B("ƦƢƒƄƴƒƇŭƙƤƖƗŷƋƈƯƜųżƷǃƍƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[15] = NLoginCore_138.E("֑֋զ֊՟Ռձ֋յօ՛զկ՜խ՗խա֡ջ՟վիլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[16] = NLoginCore_076.B("ƦƢƒƄƴƒƇŭƙƤƖƗŷƋƈƯƜųżƷǃƍƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[17] = NLoginCore_027.D("ՂԼԗԻԐӽԢԼԦԶԌԗԠԍԞԈԞԒՒԬԐԯԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[18] = NLoginCore_004.A("ƢƙūƂŮƟŲƒƹƈƊſ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[19] = NLoginCore_091.F("՟ՍՒյՐէՠՖՓհ֕՚շ՛֗ծ֟մ֛֒գռ֕ձտւ֣֭֓֨լ֤", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[20] = NLoginCore_324.D("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[21] = NLoginCore_223.C("ԐӾԃԦԁԘԑԇԄԡՆԋԨԌՈԟՐԥՌՃԔԭՆԢ԰ԳՄՔ՞ՙԝՕ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[22] = NLoginCore_223.D("ԴԫӽԔԀԱԄԤՋԚԜԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[23] = NLoginCore_201.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƛƴƐƞơƲǂǌǇƋǃ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[24] = NLoginCore_427.C("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[25] = NLoginCore_427.F("թՎՅֈիե֓Վքւշՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[26] = NLoginCore_201.A("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[27] = NLoginCore_091.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[28] = NLoginCore_091.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[29] = NLoginCore_384.A("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[30] = NLoginCore_453.A("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[31] = NLoginCore_451.F("թՎՅֈիե֓Վքւշՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[32] = NLoginCore_076.B("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[33] = NLoginCore_559.B("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[34] = NLoginCore_324.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[35] = NLoginCore_559.C("ԚӿӶԹԜԖՄӿԵԳԨԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[36] = NLoginCore_201.B("ŧơŮƬžƝƐƕƘƔƩƜŵƗƍƱŽƍưƁƒƝƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[37] = NLoginCore_076.D("ԚӿӶԹԜԖՄӿԵԳԨԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[38] = NLoginCore_004.F("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[39] = NLoginCore_027.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[40] = NLoginCore_451.C("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[41] = NLoginCore_004.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[42] = NLoginCore_223.D("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[43] = NLoginCore_446.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[44] = NLoginCore_173.A("ƮƜƐƆƝƴŵůơƐűƻƛƚƎƠƬƽǀƹƯƀƞǁƛƒƪƇƈƝƗǆǄƣǋưƑǊƿƫƎƤƲƟ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[45] = NLoginCore_004.E("ՈւՏ֍՟վձնչյ֊սՖոծ֒՞ծ֑բճվիլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[46] = NLoginCore_223.E("թՎՅֈիե֓Վքւշՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[47] = NLoginCore_076.D("ӹԳԀԾԐԯԢԧԪԦԻԮԇԩԟՃԏԟՂԓԤԯԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[48] = NLoginCore_384.A("ƈŭŤƧƊƄƲŭƣơƖſ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[49] = NLoginCore_091.B("ŮŨƪƨƭƩƎƦƪūƙƧƴƵƲƊƛƀƪơƞǆżǇſơƣƵơƿƟƊƿǍǁǌƐơǐǃƭƧǆǇƲƻƬƯǚǔƾƸǢǓƪƫ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[50] = NLoginCore_110.A("ŦƭŤƉƳưƐűƵƓƯƯƄƧƫŵƸƵſƛǂƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[51] = NLoginCore_427.B("ƌƣƨƭŮƮſƗƣƑƖſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[52] = NLoginCore_173.C("ՁԳՂӽӸԑՄԓԞՉԝԮԙԼԣԜԯԐԟԦԴՕԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[53] = NLoginCore_384.B("ƘŪūƟƨƕƓƧƯƧƳƒŴƳƔƒǀƔƋƺƻƓƯǃƳƜƣƼžƩƫƭǋǉƣƤǃƕƌƑƮǗƫƶƺǅǆǒƙǘƟǝǓǣƪƫ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[54] = NLoginCore_384.F("ժպ֓ձՔՖևխո՗ՙ՛Օ֚ղչչւ֡բճ֔իլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[55] = NLoginCore_324.C("ԟԽӾԾԗԼԾԼԝԽԶԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[56] = NLoginCore_559.E("ՙ֎֎֊ղ֌ըաՖ՗կՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[57] = NLoginCore_387.F("ՙծկֆֈ֐Չղ֐֎֍ՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[58] = NLoginCore_138.F("վՈծտՠդըցևջիՠ", (byte)92, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_248.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ŹƱƋƀƆŵƢƓƖƣƉƅƨƶƛżƩǂƟƴƏǃƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[1] = NLoginCore_076.B("ŧơŮƬžƝƐƕƘƔƩưųƷƦƎưƫƫƫƲƀƒǇƸƖǋƖƢƨƜǌ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ūƨźƏƄơƦƟƉƃűſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[3] = NLoginCore_223.A("ƙƣƦƳƒƵƳƇŶůƴƅƘƚƏƍƔƖƿźƯƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[4] = NLoginCore_027.E("֒եմւլՎ֘֘֔֎ն֎֐֑րծ՘իփջ֛ծիլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[5] = NLoginCore_173.D("ԸԴԤԖՆԤԙӿԫԶԪԠԎԣԾԐՈԤԼԳՒԟԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ưƪƅƩžūƐƪƔƤŰƑƮƩƟƨƊƩƳƵƼǃƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[7] = NLoginCore_110.C("ՀԣԗԝԕԞӺԧԹԋՆԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[8] = NLoginCore_092.A("ƱƄƓơƋŭƷƷƳƭƒƐƷƲƝŸǁƭƎǄƃƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[9] = NLoginCore_223.E("իՐլՔ֍֎Քշ֎փ։ՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[10] = NLoginCore_110.F("֒եմւլՎ֘֘֔֎մշձկխ֋ղր֐ղ֑֤իլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[11] = NLoginCore_201.E("էՍռՆՏ֗֕ո֒ծՖջկՕչխժ՟՜֝ձ֘֨ֈֈ֛֗բֆոտֲֲֳ֪֣֮֕քָ֢մ֥֒օպֺ֖֓֊չ֐ռׄ֋֌", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[12] = NLoginCore_451.A("ŨƑƭŻƢƕƆƫƹƤƉƕŲƱƊƖƊƬƿƭƓƄƤǃƅƸƕƇƄſƽǋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[13] = NLoginCore_092.B("ƣƝƲƟƕƊƓƕƓŲŵƍƭƨƨƙƱƩƓƑƽƳƊƋ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[14] = NLoginCore_324.A("ƦƢƒƄƴƒƇŭƙƤƘűƽƱƈƛƹſƕƞƬƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[15] = NLoginCore_091.A("ưƪƅƩžūƐƪƔƤŬŶŸƓƐƭŸƚǁưƘƳƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[16] = NLoginCore_004.E("ևփճե֕ճըՎպօչ։֒թտ։խ՝վքե֤իլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ưƪƅƩžūƐƪƔƤŹƤƪƸŽƕƘƹƫƢƔƝƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[18] = NLoginCore_110.C("ӺԠԒӽԳԱԀԒԾՊՆԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[19] = NLoginCore_201.C("ԐӾԃԦԁԘԑԇԄԡՆԋԨԌՈԟՐԥՌՃԔԢՈԕԓՏ՚ՑՇԱԶԡ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[20] = NLoginCore_110.A("ŽſƣŰžƉƀƪƆƴƬſ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[21] = NLoginCore_324.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƙƛƷƟƲƻƊƧƷƛƥ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[22] = NLoginCore_091.B("ƎƣƩƀƴůƋƁƲŷƆſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[23] = NLoginCore_324.B("žŬűƔůƆſŵŲƏƴŹƖźƶƍƾƓƺƱƂƗǆƕƛƀƛƨǋƝƷƎ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ӹԳԀԾԐԯԢԧԪԦԼՁՂԿԪԻԳՎԡԮԭԢԬԷԺԖԙՔ՗ԖԮբ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[25] = NLoginCore_384.F("՟խլ֋ր։ըՊճպ֑ՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[26] = NLoginCore_173.A("ŧơŮƬžƝƐƕƘƔƫŻƄƇƸƚƨƏƐƓǅƺǅƥƵƝƘƘƃƹƦƧ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[27] = NLoginCore_201.F("ջզՏթբ֌Չ՗ՏՒ֙ՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[28] = NLoginCore_201.F("ՈւՏ֍՟վձնչյ։֘Տևխջ՛՞֓փշ֔իլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[29] = NLoginCore_027.A("ƎƋƃƟŮƇžƱƏơƚſ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[30] = NLoginCore_201.A("ŧơŮƬžƝƐƕƘƔƫƚƏŻƱƔƖƒƸƵƟƳƊƋ", (byte)92, 65);
                    NLoginCore_248.var_java_lang_String_arr_b[31] = NLoginCore_223.C("ӾԾӻԮԧԄԲԈԣӽԋԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[32] = NLoginCore_427.E("ՈւՏ֍՟վձնչյ֋ծ֓վթ֠֘ւ֣֌պ֤զ֗ՠ֦֕րսդ֗ը", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[33] = NLoginCore_451.D("ԠԒԲԹԕԄӾՃӼԠԤԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[34] = NLoginCore_091.F("ՈւՏ֍՟վձնչյ։ժ֏֖մթո֜֓֡եվիլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[35] = NLoginCore_223.B("ŮűƋƬůƔƦŮƙƹƸſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[36] = NLoginCore_091.C("ӹԳԀԾԐԯԢԧԪԦԻՃԘԘԤԱԎՒԔԩԐԗ԰ԑՅԖ՜ԦԙԬ՜Ա", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[37] = NLoginCore_223.E("զլֈՏՑժձց֚֓ճՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[38] = NLoginCore_575.F("ՈւՏ֍՟վձնչյ֌հ֍֛լֈ֖֝՜֢ա֞զջֆ֢֡ռքխւ֫", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[39] = NLoginCore_427.D("ԍӾԣԓԻԴՅԚԴԷԠԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[40] = NLoginCore_201.D("ӹԳԀԾԐԯԢԧԪԦԼԝՈԦԠՎՈՌԢԣԬԟԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[41] = NLoginCore_223.B("žưżƉƠƐƢƎƢƖƬſ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[42] = NLoginCore_387.E("ՈւՏ֍՟վձնչյ֌յձՐձ՘վճմ֘չ֐֢ղփվ֖֍֗օկ֪", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[43] = NLoginCore_451.F("ՌՍՌքքօմ։յՕէՠ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[44] = NLoginCore_138.C("ՀԮԢԘԯՆԇԁԳԢԃՍԭԬԠԲԾՏՒՋՁԒ԰ՓԭԤԼԙԚԯԩ՘՗ԚԮԸՎԼԞԱԥ՚ՀԱ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[45] = NLoginCore_092.B("ŧơŮƬžƝƐƕƘƔƫƕƸƞƎŸƔƐƒƕŽǆƱǂǃƸƾƦƨƾǊǃ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[46] = NLoginCore_027.C("ԢԬԎԮԗԸԖԝԂԓԇԑ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[47] = NLoginCore_559.E("ՈւՏ֍՟վձնչյ։ս՗պն֜լ֟նջշ֤իլ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[48] = NLoginCore_027.D("ӹӿӻԁԕԛԤԪԹԗԤԑ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[49] = NLoginCore_091.D("ԀӺԼԺԿԻԠԸԼӽԫԹՆՇՄԜԭԒԼԳ԰՘ԎՙԑԳԵՇԳՑԱԜՑ՟Փ՞ԢԳբՕԿԹ՗ԟԮԯԸՂԼՆդ՞՗Ռ՗ը԰ՅԼՉզՕՋԿ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[50] = NLoginCore_223.B("ŦƭŤƉƳưƐűƵƓƮźƥŶƩƵŽƋƿƑƠƕưƟƙǆƞƶƵǀǎƍ", (byte)92, 66);
                    NLoginCore_248.var_java_lang_String_arr_b[51] = NLoginCore_138.E("վկևՌ։ՖտՎզքկՠ", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[52] = NLoginCore_076.D("ՁԳՂӽӸԑՄԓԞՉԜԟՈՆՌԹԎԬԳԕՔԟԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[53] = NLoginCore_076.E("չՋՌր։նմֈ֐ֈ֔ճՕ֔յճ֡յլ֛֜մ֐֤֔սք֝՟֊֌֎֪֬քօ֤նխղ֏ָ֍֍ֱռ֝պ֐ր־֝փִׇָׂׂׂ֞ֆׅ֦֊", (byte)92, 69);
                    NLoginCore_248.var_java_lang_String_arr_b[54] = NLoginCore_027.D("ԛԫՄԢԅԇԸԞԩԈԈԈԸՐՇԼՋԯՔՓԾՕԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[55] = NLoginCore_223.C("ӴԂԣԟԕԵԳԱՇՁԊՍԣՎՌՄԱԢՊԵՕՅԜԝ", (byte)92, 67);
                    NLoginCore_248.var_java_lang_String_arr_b[56] = NLoginCore_027.F("ատօխէօ֎ըչՔ֕ե՜֚ծ֖֞֞՚֓գ֤իլ", (byte)92, 70);
                    NLoginCore_248.var_java_lang_String_arr_b[57] = NLoginCore_138.D("ӸԙԌԓԛԜԩԇԟՁԄՍԸՍՂՅԒՁՍԣՄՅԜԝ", (byte)92, 68);
                    NLoginCore_248.var_java_lang_String_arr_b[58] = NLoginCore_223.C("ՃԓӻԵՄԅԂԑՁԟՊԑ", (byte)92, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_248.var_java_lang_String_arr_b[0] = NLoginCore_076.C("ӸԬԛԖԱӹԻՀՅԪՆԜՍԟԽԯՇՈ԰ԒՍՔՂՙՑԩԨ՗ԯ՟ԶՁ", (byte)92, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_248.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ԕԷՀՅԓՀԄԗԡԜԇԦԨԈՊՇՎԉԠԢԣԡԫԱԧԸՏԥԾՍՁԸ", (byte)92, 68);
                }
            }
        }
    }

    public String java_lang_String_a(ForceRegisterConfig ForceRegisterConfig2, @Nullable NLoginCore_137 NLoginCore_1372) {
        return this.boolean_a(ForceRegisterConfig2, NLoginCore_1372) ? (String)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().b((String)NLoginCore_248.c("㺀", (int)p, (long)(q ^ r))) : null;
    }

    @Generated
    private NLoginCore_248(String string2) {
        this.var_java_lang_String_cx = string2;
    }

    @Nullable
    public String aA() {
        NLoginCore_466 NLoginCore_4662;
        switch (this.ordinal()) {
            case 0: {
                NLoginCore_4662 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_d;
                break;
            }
            case 1: {
                NLoginCore_4662 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_e;
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)(var_int_e & var_int_f), (long)g) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)h, (long)(i ^ j)));
            }
        }
        return NLoginCore_4662.a().d().stream().findFirst().orElse(null);
    }

    @Nullable
    public NLoginCore_219 com_nickuc_login_NLoginCore_219_a(NLoginType_008 NLoginType_008) {
        NLoginCore_308 NLoginCore_3082 = NLoginType_008.com_nickuc_login_NLoginCore_308_a();
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_3082.com_nickuc_login_NLoginCore_219_b();
            }
            case 1: {
                return NLoginCore_3082.c();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)er, (long)(es ^ et)) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)(eu & ev), (long)ew));
    }

    public void b(ForceRegisterConfig ForceRegisterConfig2, String string) {
        NLoginCore_407 NLoginCore_407 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a();
        if (string != null) {
            NLoginCore_407.a((String)NLoginCore_248.c("㺀", (int)y, (long)(z ^ aa)) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺃", (int)ab, (long)ac), string, ad, TimeUnit.MINUTES);
        } else {
            NLoginCore_407.e((String)NLoginCore_248.c("㺆", (int)(ae & af), (long)ag) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺉", (int)ah, (long)(ai ^ aj)));
        }
    }

    public boolean aK() {
        switch (this.ordinal()) {
            case 0: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_f.ar();
            }
            case 1: {
                return NLoginCore_596.var_com_nickuc_login_NLoginCore_363_o.ar();
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)dx, (long)dy) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)dz, (long)(ea ^ eb)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(NLoginType_008 NLoginType_008, String string) {
        NLoginCore_436 NLoginCore_4362;
        switch (this.ordinal()) {
            case 0: {
                NLoginCore_4362 = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
                break;
            }
            case 1: {
                NLoginCore_4362 = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j;
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_248.c("㺀", (int)ex, (long)ey) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)ez, (long)(fa ^ fb)));
            }
        }
        NLoginCore_459 NLoginCore_459 = NLoginType_008.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a();
        String string2 = (String)NLoginCore_248.c("㺆", (int)fc, (long)(fd ^ fe)) + (String)(NLoginCore_459.com_nickuc_login_NLoginCore_036_a() == NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f ? NLoginCore_248.c("㺉", (int)(ff & fg), (long)fh) : NLoginCore_248.c("㺌", (int)fi, (long)(fj ^ fk)));
        try {
            Object[] objectArray = new Object[fl];
            objectArray[NLoginCore_248.fm] = NLoginCore_532.e.a(new Object[fn]);
            objectArray[NLoginCore_248.fo] = NLoginCore_4362.getName();
            Object[] objectArray2 = new Object[fp];
            objectArray2[NLoginCore_248.fq] = string;
            try (NLoginCore_171 NLoginCore_171 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a(String.format(string2, objectArray), objectArray2);){
                ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                if (!resultSet.next()) return ga;
                int n = resultSet.getInt((String)NLoginCore_248.c("㺏", (int)(fr & fs), (long)ft));
                return n;
            }
        }
        catch (Exception exception) {
            NLoginCore_370.d((String)NLoginCore_248.c("㺒", (int)(fu & fv), (long)fw) + string + (String)NLoginCore_248.c("㺕", (int)fx, (long)fy) + (Object)((Object)this), new Object[fz]);
        }
        return ga;
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, String string, NLoginCore_137 NLoginCore_1372) {
        if (this == var_com_nickuc_login_NLoginCore_311_e && NLoginCore_1372 == NLoginCore_137.var_com_nickuc_login_NLoginCore_137_a) {
            throw new IllegalStateException((String)NLoginCore_248.c("㺀", (int)(ak & al), (long)am) + (Object)((Object)this) + (String)NLoginCore_248.c("㺃", (int)an, (long)(ao ^ ap)) + (Object)((Object)NLoginCore_1372) + (String)NLoginCore_248.c("㺆", (int)aq, (long)(ar ^ as)));
        }
        NLoginCore_407 NLoginCore_407 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a();
        if (string != null && NLoginCore_1372 != null) {
            NLoginCore_407.a((String)NLoginCore_248.c("㺉", (int)at, (long)(au ^ av)), string, aw, TimeUnit.MINUTES);
            NLoginCore_407.a((String)NLoginCore_248.c("㺌", (int)(ax & ay), (long)az), NLoginCore_1372.name(), ba, TimeUnit.MINUTES);
        } else {
            NLoginCore_407.e((String)NLoginCore_248.c("㺏", (int)bb, (long)(bc ^ bd)));
            NLoginCore_407.e((String)NLoginCore_248.c("㺒", (int)be, (long)(bf ^ bg)));
        }
    }

    public boolean d(ForceRegisterConfig ForceRegisterConfig2) {
        Integer n = (Integer)ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().b((String)NLoginCore_248.c("㺀", (int)bl, (long)bm) + this.var_java_lang_String_cx + (String)NLoginCore_248.c("㺃", (int)bn, (long)(bo ^ bp)));
        return (n != null && n >= bq ? br : bs) != 0;
    }
}

