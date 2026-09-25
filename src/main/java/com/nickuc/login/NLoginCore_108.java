/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_323;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_262;
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
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_151;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_108
implements NLoginCore_151 {
    private static int s;
    private static long ch;
    private static int fy;
    private static int hl;
    private static int fo;
    private static int er;
    private static int dn;
    private static int bm;
    private static long cr;
    private static int eh;
    private static int ap;
    private static long dw;
    private static int fm;
    private static int dr;
    private static long hi;
    private static int k;
    private static int var_int_b;
    private static int fs;
    private static int fl;
    private static int eb;
    private static int v;
    private static long et;
    private static long dl;
    private static int r;
    private static int eg;
    private static long en;
    private static long eq;
    private static int dh;
    private static int de;
    private static long he;
    private static long cz;
    private static int hj;
    private static long co;
    private static long ea;
    private static int cq;
    private static int dx;
    private static int ei;
    private static long dp;
    private static int em;
    private static long bi;
    private static int ev;
    private static String[] var_java_lang_String_arr_a;
    private static int ct;
    private static int var_int_a;
    private static int e;
    private static int hk;
    private static int bz;
    private static int eu;
    private static long cn;
    private static int ge;
    private static long bk;
    private static int ck;
    private static int gp;
    private static int cu;
    private static int ey;
    private static long dz;
    private static long ai;
    private static long dg;
    private static int fw;
    private static int aa;
    private static long aw;
    private static long ec;
    private static int ca;
    private static long gu;
    private static int gc;
    private static long y;
    private static int ag;
    private static long c;
    private static int aq;
    private static int bq;
    private static long ar;
    private static int dj;
    private static int fg;
    private static int ee;
    private static int bb;
    private static int dq;
    private static int fk;
    private static int dm;
    private static long cw;
    private static long gd;
    private static int au;
    private static int cm;
    private static int dt;
    private static int gz;
    private static long gt;
    private static long m;
    private static int cp;
    private static long af;
    private static long cl;
    private static long cfr_renamed_1;
    private static int z;
    private static int fv;
    private static int hf;
    private static long dc;
    private static int bh;
    private static int fb;
    private static int bo;
    private static int bt;
    private static long cy;
    private static int bg;
    private static long f;
    private static long eo;
    private static long hn;
    private static long ex;
    private static int fa;
    private static int ek;
    private static int bv;
    private static int hh;
    private static int cj;
    private static int ad;
    private static long ed;
    private static int hc;
    private static int bf;
    private static int bw;
    private static int go;
    private static int bx;
    private static int aj;
    private static long p;
    private static int bn;
    private static long ac;
    private static int bp;
    private static int bl;
    private static long ha;
    private static long q;
    private static int ep;
    private static long dd;
    private static int h;
    private static int es;
    private static int gv;
    private static int gx;
    private static int fn;
    private static int i;
    private static int az;
    private static int ds;
    private static int ah;
    private static int el;
    private static long gb;
    private static int l;
    private static int di;
    private static long df;
    private static int dy;
    private static int gq;
    private static int t;
    private static int al;
    private static int bj;
    private static long gg;
    private static int hd;
    private static int bu;
    private static int fe;
    private static int hm;
    private static long ae;
    private static int bs;
    private static long u;
    private static int by;
    private static int db;
    private static int ef;
    private static int gl;
    private static int ga;
    private static String[] var_java_lang_String_arr_b;
    private static int fx;
    private static long fq;
    private static long gr;
    private static int dv;
    public static final NLoginCore_108 var_com_nickuc_login_NLoginCore_108_a;
    private static int o;
    private static int ff;
    private static int dk;
    private static long cv;
    private static long am;
    private static long ci;
    private static long hb;
    private static int ej;
    private static int cd;
    private static int ba;
    private static int fp;
    private static int w;
    private static long cf;
    private static int hp;
    private static long ce;
    private static int cb;
    private static long gj;
    private static int bc;
    private static int gk;
    private static int ak;
    private static int cx;
    private static int ao;
    private static int be;
    private static long at;
    private static int da;
    private static int as;
    private static long cs;
    private static long fc;
    private static long d;
    private static int ax;
    private static long fd;
    private static int br;
    private static int gf;
    private static int ay;
    private static int du;
    private static int fj;
    private static int cg;
    private static long gy;
    private static long gm;
    private static int an;
    private static int cc;
    private static long fu;
    private static long ew;
    private static int fi;
    private static long g;
    private static int fz;
    private static long ft;
    private static int gs;
    private static int bd;
    private static int n;
    private static int ez;
    private static int gw;
    private static long x;
    private static int hg;
    private static int gn;
    private static long av;
    private static int gi;
    private static long fh;
    private static int ho;
    private static long gh;
    private static int ab;
    private static int fr;
    private static long j;

    @Override
    public void void_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        Object object;
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        if (NLoginCore_150.j()) {
            NLoginCore_370.c((String)NLoginCore_108.c("㺀", (int)e, (long)(f ^ g)), new Object[h]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺃", (int)i, (long)j) + this.q() + (String)NLoginCore_108.c("㺆", (int)(k & l), (long)m), new Object[n]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺉", (int)o, (long)(p ^ q)), new Object[r]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺌", (int)(s & t), (long)u), new Object[v]);
        } else {
            NLoginCore_370.c((String)NLoginCore_108.c("㺏", (int)w, (long)(x ^ y)), new Object[z]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺒", (int)(aa & ab), (long)ac) + this.q() + (String)NLoginCore_108.c("㺕", (int)ad, (long)(ae ^ af)), new Object[ag]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺘", (int)ah, (long)ai), new Object[aj]);
            NLoginCore_370.c((String)NLoginCore_108.c("㺛", (int)(ak & al), (long)am), new Object[an]);
        }
        String string = NLoginCore_532.e.a(new Object[ao]);
        Object object2 = NLoginCore_323.a(NLoginCore_459, string, (String)NLoginCore_108.c("㺞", (int)(ap & aq), (long)ar)) ? NLoginCore_108.c("㺡", (int)as, (long)at) : NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName();
        NLoginCore_370.c((String)NLoginCore_108.c("㺤", (int)au, (long)(av ^ aw)), new Object[ax]);
        CharSequence[] charSequenceArray = new String[ay];
        charSequenceArray[NLoginCore_108.az] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
        charSequenceArray[NLoginCore_108.ba] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName();
        charSequenceArray[NLoginCore_108.bb] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        charSequenceArray[NLoginCore_108.bc] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
        charSequenceArray[NLoginCore_108.bd] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName();
        charSequenceArray[NLoginCore_108.be] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName();
        charSequenceArray[NLoginCore_108.bf] = NLoginCore_323.a(NLoginCore_459, string, (String)NLoginCore_108.c("㺧", (int)(bg & bh), (long)bi)) ? NLoginCore_108.c("㺪", (int)bj, (long)bk) : NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
        charSequenceArray[NLoginCore_108.bl] = object2;
        charSequenceArray[NLoginCore_108.bm] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName();
        charSequenceArray[NLoginCore_108.bn] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName();
        charSequenceArray[NLoginCore_108.bo] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName();
        charSequenceArray[NLoginCore_108.bp] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName();
        CharSequence[] charSequenceArray2 = charSequenceArray;
        CharSequence[] charSequenceArray3 = new String[bq];
        charSequenceArray3[NLoginCore_108.br] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
        charSequenceArray3[NLoginCore_108.bs] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName();
        charSequenceArray3[NLoginCore_108.bt] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        charSequenceArray3[NLoginCore_108.bu] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
        charSequenceArray3[NLoginCore_108.bv] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName();
        charSequenceArray3[NLoginCore_108.bw] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName();
        charSequenceArray3[NLoginCore_108.bx] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
        charSequenceArray3[NLoginCore_108.by] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName();
        charSequenceArray3[NLoginCore_108.bz] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName();
        charSequenceArray3[NLoginCore_108.ca] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName();
        charSequenceArray3[NLoginCore_108.cb] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName();
        charSequenceArray3[NLoginCore_108.cc] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName();
        CharSequence[] charSequenceArray4 = charSequenceArray3;
        if (NLoginCore_459.com_nickuc_login_NLoginCore_036_a() == NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f) {
            NLoginCore_459.void_a((String)NLoginCore_108.c("㺭", (int)cd, (long)(ce ^ cf)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_108.c("㺰", (int)cg, (long)(ch ^ ci)), new Object[cj]);
            NLoginCore_459.void_a((String)NLoginCore_108.c("㺳", (int)ck, (long)cl) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_108.c("㺶", (int)cm, (long)(cn ^ co)), new Object[cp]);
        }
        NLoginCore_370.c((String)NLoginCore_108.c("㺹", (int)cq, (long)(cr ^ cs)), new Object[ct]);
        String string2 = string + (String)NLoginCore_108.c("㺼", (int)cu, (long)(cv ^ cw));
        this.a(NLoginCore_459, string, string2);
        NLoginCore_4952.v();
        NLoginCore_370.c((String)NLoginCore_108.c("㺿", (int)cx, (long)(cy ^ cz)), new Object[da]);
        try (Object object3 = NLoginCore_459.java_sql_Connection_a();
             Statement statement = object3.createStatement();){
            if (NLoginCore_459.com_nickuc_login_NLoginCore_036_a() == NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d || NLoginCore_459.com_nickuc_login_NLoginCore_036_a() == NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c) {
                statement.addBatch((String)NLoginCore_108.c("㻂", (int)db, (long)(dc ^ dd)));
            }
            Object[] objectArray = new Object[dh];
            objectArray[NLoginCore_108.di] = string;
            objectArray[NLoginCore_108.dj] = String.join((CharSequence)NLoginCore_108.c("㻈", (int)dk, (long)dl), charSequenceArray4);
            objectArray[NLoginCore_108.dm] = String.join((CharSequence)NLoginCore_108.c("㻋", (int)dn, (long)(cfr_renamed_1 ^ dp)), charSequenceArray2);
            objectArray[NLoginCore_108.dq] = string2;
            objectArray[NLoginCore_108.dr] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
            objectArray[NLoginCore_108.ds] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
            objectArray[NLoginCore_108.dt] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
            statement.addBatch(String.format((String)NLoginCore_108.c("㻅", (int)de, (long)(df ^ dg)), objectArray));
            statement.executeBatch();
        }
        NLoginCore_370.c((String)NLoginCore_108.c("㻎", (int)(du & dv), (long)dw), new Object[dx]);
        object3 = new HashSet();
        long l = 0L;
        Object[] objectArray = new Object[ee];
        objectArray[NLoginCore_108.ef] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray[NLoginCore_108.eg] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray[NLoginCore_108.eh] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray[NLoginCore_108.ei] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        try (Object object4 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginCore_108.c("㻑", (int)dy, (long)(dz ^ ea)) + string2 + (String)NLoginCore_108.c("㻔", (int)eb, (long)(ec ^ ed)), objectArray), new Object[ej]);){
            object = (ResultSet)((NLoginCore_218)object4).d();
            while (object.next()) {
                object3.add(object.getString(ek));
                l += (long)object.getInt(el);
            }
        }
        NLoginCore_370.c((String)NLoginCore_108.c("㻗", (int)em, (long)(en ^ eo)) + NLoginCore_112.d(object3.size()) + (String)NLoginCore_108.c("㻚", (int)ep, (long)eq) + NLoginCore_112.d(l - (long)object3.size()) + (String)NLoginCore_108.c("㻝", (int)(er & es), (long)et), new Object[eu]);
        object4 = object3.iterator();
        while (object4.hasNext()) {
            object = (String)object4.next();
            Object[] objectArray2 = new Object[ey];
            objectArray2[NLoginCore_108.ez] = string;
            objectArray2[NLoginCore_108.fa] = String.join((CharSequence)NLoginCore_108.c("㻣", (int)fb, (long)(fc ^ fd)), charSequenceArray4);
            objectArray2[NLoginCore_108.fe] = String.join((CharSequence)NLoginCore_108.c("㻦", (int)(ff & fg), (long)fh), charSequenceArray2);
            objectArray2[NLoginCore_108.fi] = string2;
            objectArray2[NLoginCore_108.fj] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
            objectArray2[NLoginCore_108.fk] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
            objectArray2[NLoginCore_108.fl] = object2;
            Object[] objectArray3 = new Object[fm];
            objectArray3[NLoginCore_108.fn] = object;
            NLoginCore_459.void_a(String.format((String)NLoginCore_108.c("㻠", (int)ev, (long)(ew ^ ex)), objectArray2), objectArray3);
        }
        NLoginCore_370.c((String)NLoginCore_108.c("㻩", (int)(fo & fp), (long)fq) + NLoginCore_2702.a(TimeUnit.SECONDS, fr) + (String)NLoginCore_108.c("㻬", (int)fs, (long)(ft ^ fu)), new Object[fv]);
    }

    static {
        var_int_a = 0 >>> 83 | 0 << ~83 + 1;
        var_int_b = (-1 >>> 102 | -1 << -102) & 0xFFFFFFFF;
        d = Long.reverse(1382416795099085936L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(8155830634664311920L);
        g = Long.reverse(0x6200000000000000L);
        h = 0 >>> 186 | 0 << -186;
        i = Integer.reverse(0x40000000);
        j = Long.reverse(1382416795099085936L);
        k = Integer.reverse(-1073741824);
        l = (-1 >>> 62 | -1 << ~62 + 1) & 0xFFFFFFFF;
        m = Long.reverse(1382416795099085936L);
        n = Integer.reverse(0);
        o = (4096 >>> 42 | 4096 << -42) & 0xFFFFFFFF;
        p = Long.reverse(8155830634664311920L);
        q = Long.reverse(0x6200000000000000L);
        r = (0 >>> 239 | 0 << ~239 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(-1610612736);
        t = Integer.reverse(-1);
        u = Long.reverse(1382416795099085936L);
        v = Integer.reverse(0);
        w = (3 >>> 223 | 3 << ~223 + 1) & 0xFFFFFFFF;
        x = Long.reverse(8155830634664311920L);
        y = Long.reverse(0x6200000000000000L);
        z = Integer.reverse(0);
        aa = Integer.reverse(-536870912);
        ab = Integer.reverse(-1);
        ac = Long.reverse(1382416795099085936L);
        ad = 32768 >>> 204 | 32768 << ~204 + 1;
        ae = Long.reverse(8155830634664311920L);
        af = Long.reverse(0x6200000000000000L);
        ag = 0 >>> 190 | 0 << -190;
        ah = 9216 >>> 170 | 9216 << -170;
        ai = Long.reverse(1382416795099085936L);
        aj = Integer.reverse(0);
        ak = (0x2800000 >>> 246 | 0x2800000 << -246) & 0xFFFFFFFF;
        al = Integer.reverse(-1);
        am = Long.reverse(1382416795099085936L);
        an = (0 >>> 132 | 0 << -132) & 0xFFFFFFFF;
        ao = 0 >>> 15 | 0 << ~15 + 1;
        ap = 360448 >>> 79 | 360448 << ~79 + 1;
        aq = Integer.reverse(-1);
        ar = Long.reverse(1382416795099085936L);
        as = Integer.reverse(0x30000000);
        at = Long.reverse(1382416795099085936L);
        au = Integer.reverse(-1342177280);
        av = Long.reverse(8155830634664311920L);
        aw = Long.reverse(0x6200000000000000L);
        ax = Integer.reverse(0);
        ay = (24 >>> 65 | 24 << -65) & 0xFFFFFFFF;
        az = Integer.reverse(0);
        ba = 131072 >>> 81 | 131072 << ~81 + 1;
        bb = Integer.reverse(0x40000000);
        bc = 3072 >>> 138 | 3072 << ~138 + 1;
        bd = Integer.reverse(0x20000000);
        be = Integer.reverse(-1610612736);
        bf = Integer.reverse(0x60000000);
        bg = 7 >>> 223 | 7 << ~223 + 1;
        bh = Integer.reverse(-1);
        bi = Long.reverse(1382416795099085936L);
        bj = (0x3C00000 >>> 22 | 0x3C00000 << -22) & 0xFFFFFFFF;
        bk = Long.reverse(1382416795099085936L);
        bl = Integer.reverse(-536870912);
        bm = Integer.reverse(0x10000000);
        bn = (-2147483644 >>> 95 | -2147483644 << ~95 + 1) & 0xFFFFFFFF;
        bo = 0x50000000 >>> 59 | 0x50000000 << -59;
        bp = Integer.reverse(-805306368);
        bq = Integer.reverse(0x30000000);
        br = (0 >>> 254 | 0 << ~254 + 1) & 0xFFFFFFFF;
        bs = Integer.reverse(Integer.MIN_VALUE);
        bt = (4096 >>> 139 | 4096 << ~139 + 1) & 0xFFFFFFFF;
        bu = (49152 >>> 174 | 49152 << ~174 + 1) & 0xFFFFFFFF;
        bv = Integer.reverse(0x20000000);
        bw = 0x5000000 >>> 216 | 0x5000000 << ~216 + 1;
        bx = Integer.reverse(0x60000000);
        by = Integer.reverse(-536870912);
        bz = Integer.reverse(0x10000000);
        ca = (294912 >>> 79 | 294912 << ~79 + 1) & 0xFFFFFFFF;
        cb = Integer.reverse(0x50000000);
        cc = Integer.reverse(-805306368);
        cd = 4 >>> 190 | 4 << -190;
        ce = Long.reverse(8155830634664311920L);
        cf = Long.reverse(0x6200000000000000L);
        cg = (0x10000001 >>> 124 | 0x10000001 << -124) & 0xFFFFFFFF;
        ch = Long.reverse(8155830634664311920L);
        ci = Long.reverse(0x6200000000000000L);
        cj = Integer.reverse(0);
        ck = 144 >>> 195 | 144 << -195;
        cl = Long.reverse(1382416795099085936L);
        cm = Integer.reverse(-939524096);
        cn = Long.reverse(8155830634664311920L);
        co = Long.reverse(0x6200000000000000L);
        cp = Integer.reverse(0);
        cq = (10240 >>> 169 | 10240 << ~169 + 1) & 0xFFFFFFFF;
        cr = Long.reverse(8155830634664311920L);
        cs = Long.reverse(0x6200000000000000L);
        ct = 0 >>> 34 | 0 << ~34 + 1;
        cu = -1610612734 >>> 157 | -1610612734 << -157;
        cv = Long.reverse(8155830634664311920L);
        cw = Long.reverse(0x6200000000000000L);
        cx = (0x2C00000 >>> 117 | 0x2C00000 << ~117 + 1) & 0xFFFFFFFF;
        cy = Long.reverse(8155830634664311920L);
        cz = Long.reverse(0x6200000000000000L);
        da = Integer.reverse(0);
        db = Integer.reverse(-402653184);
        dc = Long.reverse(8155830634664311920L);
        dd = Long.reverse(0x6200000000000000L);
        de = (0x18000000 >>> 184 | 0x18000000 << -184) & 0xFFFFFFFF;
        df = Long.reverse(8155830634664311920L);
        dg = Long.reverse(0x6200000000000000L);
        dh = 0xE000000 >>> 153 | 0xE000000 << ~153 + 1;
        di = Integer.reverse(0);
        dj = Integer.reverse(Integer.MIN_VALUE);
        dk = (0x19000000 >>> 216 | 0x19000000 << -216) & 0xFFFFFFFF;
        dl = Long.reverse(1382416795099085936L);
        dm = 0x400000 >>> 53 | 0x400000 << -53;
        dn = 6656 >>> 232 | 6656 << ~232 + 1;
        cfr_renamed_1 = Long.reverse(8155830634664311920L);
        dp = Long.reverse(0x6200000000000000L);
        dq = (0x300000 >>> 212 | 0x300000 << -212) & 0xFFFFFFFF;
        dr = (0x4000000 >>> 248 | 0x4000000 << ~248 + 1) & 0xFFFFFFFF;
        ds = Integer.reverse(-1610612736);
        dt = Integer.reverse(0x60000000);
        du = Integer.reverse(-671088640);
        dv = -1 >>> 137 | -1 << ~137 + 1;
        dw = Long.reverse(1382416795099085936L);
        dx = (0 >>> 204 | 0 << -204) & 0xFFFFFFFF;
        dy = Integer.reverse(0x38000000);
        dz = Long.reverse(8155830634664311920L);
        ea = Long.reverse(0x6200000000000000L);
        eb = Integer.reverse(-1207959552);
        ec = Long.reverse(8155830634664311920L);
        ed = Long.reverse(0x6200000000000000L);
        ee = Integer.reverse(0x20000000);
        ef = 0 >>> 121 | 0 << ~121 + 1;
        eg = 0x40000000 >>> 158 | 0x40000000 << ~158 + 1;
        eh = (131072 >>> 16 | 131072 << -16) & 0xFFFFFFFF;
        ei = 384 >>> 71 | 384 << -71;
        ej = 0 >>> 240 | 0 << ~240 + 1;
        ek = Integer.reverse(Integer.MIN_VALUE);
        el = 0x1000000 >>> 119 | 0x1000000 << ~119 + 1;
        em = (480 >>> 132 | 480 << ~132 + 1) & 0xFFFFFFFF;
        en = Long.reverse(8155830634664311920L);
        eo = Long.reverse(0x6200000000000000L);
        ep = (31744 >>> 202 | 31744 << ~202 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(1382416795099085936L);
        er = Integer.reverse(0x4000000);
        es = (-1 >>> 178 | -1 << ~178 + 1) & 0xFFFFFFFF;
        et = Long.reverse(1382416795099085936L);
        eu = 0 >>> 208 | 0 << -208;
        ev = (1056 >>> 5 | 1056 << -5) & 0xFFFFFFFF;
        ew = Long.reverse(8155830634664311920L);
        ex = Long.reverse(0x6200000000000000L);
        ey = Integer.reverse(-536870912);
        ez = (0 >>> 206 | 0 << -206) & 0xFFFFFFFF;
        fa = (8192 >>> 141 | 8192 << -141) & 0xFFFFFFFF;
        fb = 0x11000000 >>> 23 | 0x11000000 << -23;
        fc = Long.reverse(8155830634664311920L);
        fd = Long.reverse(0x6200000000000000L);
        fe = 0x4000000 >>> 153 | 0x4000000 << ~153 + 1;
        ff = Integer.reverse(-1006632960);
        fg = Integer.reverse(-1);
        fh = Long.reverse(1382416795099085936L);
        fi = Integer.reverse(-1073741824);
        fj = (8192 >>> 139 | 8192 << -139) & 0xFFFFFFFF;
        fk = Integer.reverse(-1610612736);
        fl = Integer.reverse(0x60000000);
        fm = 32768 >>> 79 | 32768 << -79;
        fn = Integer.reverse(0);
        fo = Integer.reverse(0x24000000);
        fp = Integer.reverse(-1);
        fq = Long.reverse(1382416795099085936L);
        fr = (786432 >>> 82 | 786432 << -82) & 0xFFFFFFFF;
        fs = 9472 >>> 232 | 9472 << ~232 + 1;
        ft = Long.reverse(8155830634664311920L);
        fu = Long.reverse(0x6200000000000000L);
        fv = (0 >>> 235 | 0 << ~235 + 1) & 0xFFFFFFFF;
        fw = Integer.reverse(0);
        fx = Integer.reverse(0);
        fy = Integer.reverse(0);
        fz = 0x4C0000 >>> 145 | 0x4C0000 << -145;
        ga = (-1 >>> 103 | -1 << -103) & 0xFFFFFFFF;
        gb = Long.reverse(1382416795099085936L);
        gc = Integer.reverse(-469762048);
        gd = Long.reverse(1382416795099085936L);
        ge = 0 >>> 111 | 0 << ~111 + 1;
        gf = (0x50000000 >>> 121 | 0x50000000 << -121) & 0xFFFFFFFF;
        gg = Long.reverse(8155830634664311920L);
        gh = Long.reverse(0x6200000000000000L);
        gi = Integer.reverse(-1811939328);
        gj = Long.reverse(1382416795099085936L);
        gk = 0x15000000 >>> 23 | 0x15000000 << ~23 + 1;
        gl = -1 >>> 215 | -1 << -215;
        gm = Long.reverse(1382416795099085936L);
        gn = Integer.reverse(Integer.MIN_VALUE);
        go = Integer.reverse(0);
        gp = Integer.reverse(-738197504);
        gq = -1 >>> 237 | -1 << ~237 + 1;
        gr = Long.reverse(1382416795099085936L);
        gs = 360448 >>> 173 | 360448 << ~173 + 1;
        gt = Long.reverse(8155830634664311920L);
        gu = Long.reverse(0x6200000000000000L);
        gv = 0 >>> 199 | 0 << -199;
        gw = 184320 >>> 12 | 184320 << ~12 + 1;
        gx = -1 >>> 40 | -1 << ~40 + 1;
        gy = Long.reverse(1382416795099085936L);
        gz = (0x1700000 >>> 179 | 0x1700000 << -179) & 0xFFFFFFFF;
        ha = Long.reverse(8155830634664311920L);
        hb = Long.reverse(0x6200000000000000L);
        hc = Integer.reverse(-201326592);
        hd = -1 >>> 247 | -1 << -247;
        he = Long.reverse(1382416795099085936L);
        hf = (0 >>> 16 | 0 << ~16 + 1) & 0xFFFFFFFF;
        hg = 48 >>> 96 | 48 << -96;
        hh = Integer.reverse(-1);
        hi = Long.reverse(1382416795099085936L);
        hj = Integer.reverse(0);
        hk = (0x20000000 >>> 221 | 0x20000000 << ~221 + 1) & 0xFFFFFFFF;
        hl = 0x188000 >>> 239 | 0x188000 << -239;
        hm = Integer.reverse(-1);
        hn = Long.reverse(1382416795099085936L);
        ho = Integer.reverse(0x4C000000);
        hp = 409600 >>> 13 | 409600 << -13;
        var_java_lang_String_arr_a = new String[ho];
        var_java_lang_String_arr_b = new String[hp];
        NLoginCore_108.b();
        var_com_nickuc_login_NLoginCore_108_a = new NLoginCore_108();
    }

    @Override
    public boolean boolean_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        String string = NLoginCore_532.e.a(new Object[fw]);
        if (!NLoginCore_323.a(NLoginCore_459, string)) {
            return fx != 0;
        }
        String string2 = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        if (!NLoginCore_323.a(NLoginCore_459, string, string2)) {
            return fy != 0;
        }
        switch (NLoginCore_262.m[NLoginCore_459.com_nickuc_login_NLoginCore_036_a().ordinal()]) {
            case 1: 
            case 2: {
                try (NLoginCore_171 NLoginCore_171 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_108.c("㺀", (int)(fz & ga), (long)gb) + string + (String)NLoginCore_108.c("㺃", (int)gc, (long)gd), new Object[ge]);){
                    ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                    while (resultSet.next()) {
                        String string3 = resultSet.getString((String)NLoginCore_108.c("㺆", (int)gf, (long)(gg ^ gh)));
                        String string4 = resultSet.getString((String)NLoginCore_108.c("㺉", (int)gi, (long)gj));
                        if (!string3.equals(string2) || ((String)NLoginCore_108.c("㺌", (int)(gk & gl), (long)gm)).equals(string4)) continue;
                        boolean bl = gn;
                        return bl;
                    }
                }
                return go != 0;
            }
            case 3: {
                try (NLoginCore_171 NLoginCore_171 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_108.c("㺏", (int)(gp & gq), (long)gr) + string + (String)NLoginCore_108.c("㺒", (int)gs, (long)(gt ^ gu)), new Object[gv]);){
                    ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                    while (resultSet.next()) {
                        String string5 = resultSet.getString((String)NLoginCore_108.c("㺕", (int)(gw & gx), (long)gy));
                        NLoginCore_171 NLoginCore_1712 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_108.c("㺘", (int)gz, (long)(ha ^ hb)) + string5 + (String)NLoginCore_108.c("㺛", (int)(hc & hd), (long)he), new Object[hf]);
                        try {
                            ResultSet resultSet2 = (ResultSet)NLoginCore_1712.d();
                            if (!resultSet2.next()) continue;
                            String string6 = resultSet2.getString((String)NLoginCore_108.c("㺞", (int)(hg & hh), (long)hi));
                            if (!NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName().equals(string6)) continue;
                            boolean bl = hj;
                            return bl;
                        }
                        finally {
                            if (NLoginCore_1712 == null) continue;
                            NLoginCore_1712.close();
                        }
                    }
                }
                return hk != 0;
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_108.c("㺡", (int)(hl & hm), (long)hn) + (Object)((Object)NLoginCore_459.com_nickuc_login_NLoginCore_036_a()));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_108.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.B("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 66), NLoginCore_108.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢦࢭࢪࢲࢷ࢕ࢿࣄࢻࢸࣃࢠࢽࢼࢻԾ", (byte)40, 70) + string + NLoginCore_110.D("ѧ", (byte)40, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public String q() {
        return NLoginCore_108.c("㺀", (int)(var_int_a & var_int_b), (long)d);
    }

    private static void b() {
        int n;
        c = 1025790249360094350L;
        long l = c ^ 0xA0532AD2E46A2E0AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(28 + 41), (byte)(47 + 36), (byte)(32 + 15), (byte)(22 + 45), (byte)(32 + 34), (byte)(24 + 43), (byte)(46 + 1), (byte)(37 + 43), (byte)(47 + 28), (byte)(18 + 49), 83, 53, (byte)(15 + 65), (byte)(61 + 36), (byte)(67 + 33), (byte)(42 + 58), (byte)(81 + 24), (byte)(72 + 38), (byte)(46 + 57)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_108.var_java_lang_String_arr_b[0] = NLoginCore_173.A("ŦƇƐřƊŮŪŮŕŧŮƌŐƘƓřŬƘŴŷŹƌşƓƀƤšƖŢƄŸƩ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[1] = NLoginCore_138.B("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[2] = NLoginCore_091.C("ӞӠԇԐӅӳԈӓӢӮԁԈԎӻӪӚӷӗӻԔӸԜԠԏԖӱԇԨӝԀԪӮԘԎӣԛԥԣԁԢԨԍԨԖԍԻԥԍӹԗӽԀԻԘՀԅԾԸՅԓԩԆՊԡՆԇԦԒԉԝԋԳՁԬԩԞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[3] = NLoginCore_138.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[4] = NLoginCore_324.E("ծՙսկ՘ղՁեՃփՃչթւթտֈՑա։Ցցդ֏ըփւ֌ժՕ֚֝՗ՠշ֕դձ֕֨քրանոևջէփ֒թ֎ֱַ֧֨֡ձ։֭֭֬֕ոֳֺֿ֥֯֓֒֗֟֠׋֠׈֩֠֞׌ֱׅ֣׏և֎ְַ֡֒לטך׎ן", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[5] = NLoginCore_091.F("ՓՑյհ՛շՐցշՁոՏ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[6] = NLoginCore_427.B("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[7] = NLoginCore_027.B("ņƇŮżƅųņƌŨŤŷŔƐųŧŭŴƊŬŹƑſşƀŹŠŢŢŲťƢƀŸƐƍŧƨŽƬƥƋųƃƣŲƜƴƴŽƎƽƜƙźƑƻƢơơƻǀǉƻƟ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[8] = NLoginCore_451.E("ՍծԺՙՒԿհպ՜տՒՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[9] = NLoginCore_427.F("ՕՁՔպՔռՔզՈ՟֋տպզՉիոՇՏֆծ֕։֎ևֆ։ձթ֒ը՟֛֎ժ֙չջ֡՟մնըջւո֧ռբ֏ְ֊֠֒֌ֱ֣֙֘֯֙֋ַּּ֧֣֙׃տֻֿ֘ր֤ցַ֥֎ׅ֪ֈֳ֢֛֭֚֝", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[10] = NLoginCore_138.A("šşƃžũƅŞƏƅŏƆŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[11] = NLoginCore_201.E("կտԹպՙխն՝՜ՃփՂշ։ՊլՇջ֍մօ֓՚՛", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[12] = NLoginCore_138.E("կտԹպՙխն՝՜ՃփՂշ։ՊլՇջ֍մօ֓՚՛", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[13] = NLoginCore_201.B("ƏŌžſƐŭƌŎŢŏƊƘŪƙŶűūşřŲŪŸŮůŢơƄƀŪŶƛƖƍƨƭŰŭƅƆƇƠƇƲŽ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[14] = NLoginCore_223.E("ՒՌԺջՃՁՏչփեՅզտօՋէՉզպձթփ՚՛", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[15] = NLoginCore_384.F("ՒՌԺջՃՁՏչփեՅզտօՋէՉզպձթփ՚՛", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[16] = NLoginCore_427.E("ժճՏԼձԿՠգ՟ժ՟բևե՝ջՂջՌժ՞Տտ՗֎ւգ՘խ֜ո֚", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[17] = NLoginCore_384.B("ŘƉŮōƅƄŮŧƏŗŴŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[18] = NLoginCore_223.E("ժճՏԼձԿՠգ՟ժ՟բևե՝ջՂջՌժ՞Տտ՗֎ւգ՘խ֜ո֚", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[19] = NLoginCore_027.B("ŘƉŮōƅƄŮŧƏŗŴŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[20] = NLoginCore_324.D("ӋӇӢӻԁԅӕӓԊӑӸӮԑԝԖӵԐԏԎԏԞԒӺӺӵԖөԡӼӪӭӤ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[21] = NLoginCore_092.F("ՐտգՙՖզ՟նթՂքՏ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[22] = NLoginCore_384.C("ӈӬӫԃӾԆԃӦӬԎӧԕԑӗԖӐӰӴӸԒӞӻԞԑӱӣӲӷԡԡԡӠ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[23] = NLoginCore_173.A("ƂšƈźƓŏŰŒŶƌŸŧŰţƌŕƝſŰƎƓŶƝƗƅŰŹŠƟŶƚƝƝťŰūƯƁűƍƏŵƏƁƇƚƗƏŷŹƜƲƗŵƒƹƗƵǆƸƢƕƣƌǉǍƂƞǎǑǑƐǂƿǈƒǒƲƛƏƬƹǌƪƬƟƻǞƽǀǀƷƼƾƷǢƩƨǫƨǬǆǈǅǓƮǲƽ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[24] = NLoginCore_138.F("ՈԹւԼԽՔճՠԺշյ֌՘ցՅ՗ՊերՌժ։Ոդդ֙ՓՍջֈ֚֝խի՚ռ֌ղե֦֟֠յտ֘֗ժֈթ֤֋֔քսւֳֵ֢֗֊֚֚֘֐֘ռ֓ցփֲִֵ֑֕׀֝׃ֻևֽ֛֧֫׀֐֏׋׃֧הֱֱ֚֭֘נטע֞׍ֵגֻֻֻֿ֣נַףס׊׬׀ְם֦־׈׉גצ״ץָֺ׋׋׳ּי׬؁؅ָ؆רכ׀؂׾׺ר؊צ׮ש؄؎םךכ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[25] = NLoginCore_384.C("ԁӍӻӭԇӯԓӲԈԅԃӞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[26] = NLoginCore_446.A("ƀŌźŬƆŮƒűƇƄƂŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[27] = NLoginCore_027.A("ƏŌžſƐŭƌŎŢŏƋœŰŒƓƍŨŜƋźűƋżƥſţƝťţƕťƮŶƟƋŪƏƩƁƉƊƨųŽ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[28] = NLoginCore_223.D("ӧӻԋӈԓӑԅӦӧԇӪӗԚԋӹԌԀԖӴӭӢԄӟӺӰԆԣԢԔӾԭԭԭԇԀԨԟԔԅԈԈԯԷӾ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[29] = NLoginCore_446.F("՟՜ԻնՔ՛՗ՙրՖմ՜ք֎չՉ֑֐էփֈՠճտՠդշ֔ջֆ֑֑֑֊փ֝՛վՠ֖֞֔ռ֔չք֋ֈց֚պղ֊֍պջ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[30] = NLoginCore_453.C("ӅӬӿөԆԉӦӡӎԑӗԓԃӯӖәԎӵԔԑӟԙԦԠӴӥԚӲӧӽԌӭӸӫԣԊԬԡӾԬӮԆӷӳԔԩԞԇԍӾԍԜӻԍԅԼՃԙԝԚԘԖՇԀՃԜԤԍԬՀԽՉԟԨՂՊՕՋԬՏՍԶԸԭԺԟԾԺեԚե՞ժՄՎդ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[31] = NLoginCore_575.A("ŞƃşŝżşŏƆƆŧųŰƋŲƄŚŬƕŽŴƔŻŨũ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[32] = NLoginCore_559.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[33] = NLoginCore_223.A("ŖŇƐŊŋŢƁŮňƅƃƚŦƏœťŘųƎŚŸƗŖŲŲƧšśƉƖƫƨŻŹŨƊƚƀųƴƭƮƃƍƦƥŸƖŷƲƙƢƒƋƐǃǁƥưƘƦƨƨƞƦƊơƏƑƣǃƟǀǂǑƙƚǗǏƪƪǛǟƸǎƳǓƻǐƥƦǚǈƸƦƭǫƬƹǅƱǪǧǨǳƲǎǨǉƴǍƶǊǉƲǶǒǟǮǾǚǸǠǜǛȅǼȋȋǝȀǛǛǱǴȎȗǬǬǝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[34] = NLoginCore_201.D("ԁӍӻӭԇӯԓӲԈԅԃӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[35] = NLoginCore_027.E("ղԾլ՞ոՠքգչնմՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[36] = NLoginCore_559.D("ӫԋӹӞԇԔӧӥԈԖԘԄӴӻԏӗӱԡӟԣԄԣӥӱԗӧӽӴӝԃԜԛ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[37] = NLoginCore_575.D("ӟӦԃӍӅӾӢӴԅӨӐӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[38] = NLoginCore_223.B("řŮŭƉƒţŪŕƃůƖŏŹũŻŕƓƚśŹƎƃſŹŶşŲƂƃƈŷƠ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[39] = NLoginCore_451.F("՚ՌապծբեևՆշմՏ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[40] = NLoginCore_138.A("ŢƐŤōńƊƎƌŌšƆŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[41] = NLoginCore_027.A("şƐŭƋžűŌƏƍŲœŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[42] = NLoginCore_575.E("տԺՕՀ՗նՐգցԿքՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[43] = NLoginCore_223.A("ŢŦŞŻƇƆŋŮųƆƇƈƃƋŴŔŵƖƟŴƃţŴŻŦƟơƊƓƖŻƕ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[44] = NLoginCore_110.D("ӜӽӉӨӡӎӿԉӫԎӡӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[45] = NLoginCore_559.B("ŪżŮŊŐƅŴũşşƊŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[46] = NLoginCore_575.E("Ք՘ՐխչոԽՠեոո՜՛֎իպիՋփզՎլշՏ֏֓֍ՒՖ֎Օ֋", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[47] = NLoginCore_387.E("ՍծԺՙՒԿհպ՜տՒՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[48] = NLoginCore_201.C("ӫӽӯӋӑԆӵӪӠӠԋӞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[49] = NLoginCore_091.F("ոԽձշԺ՟րՀօԻրՔև՗ս֍քհՍՑ՞ՇՏ֒չյքզխթղ֞", (byte)75, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_108.var_java_lang_String_arr_b[0] = NLoginCore_223.F("՘չւՋռՠ՜ՠՇՙՠվՂ֊օՋ՞֊զթիճ֒և՗֘ֆֆՕՏխ֘", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[1] = NLoginCore_138.A("ţŝƁƀƃŪŤſűūŏŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[2] = NLoginCore_451.C("ӞӠԇԐӅӳԈӓӢӮԁԈԎӻӪӚӷӗӻԔӸԜԠԏԖӱԇԨӝԀԪӮԘԎӣԛԥԣԁԢԨԍԨԖԍԻԥԍӹԗӽԀԻԘՀԅԾԸՅԓԩԆՊԡՐԻ԰ԱԨՎՉԠՂՀՈՖԺԫԖՈՈԺբԲ՛ԼԩԪ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[3] = NLoginCore_092.A("ƉšƐƇƃžŝƂƍœŸŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[4] = NLoginCore_453.A("żŧƋŽŦƀŏųőƑőƇŷƐŷƍƖşůƗşƏŲƝŶƑƐƚŸţƫƨťŮƅƣŲſƣƶƒƎůƄƆƕƉŵƑƠŷƜƵƿƶǅƯſƗƺƻƣƻƆƽǈơǍƳƠǁƥƭƮǙƮǖƷƮƬǚƿǓƱǝǤƲƿǏǃǉǂƹơǙǤ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[5] = NLoginCore_091.C("ԎԏԁӲӡӋӳӮԈӐԏӞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[6] = NLoginCore_027.A("ƎřňƎůƊƁƍŐťƊŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[7] = NLoginCore_387.A("ņƇŮżƅųņƌŨŤŷŔƐųŧŭŴƊŬŹƑſşƀŹŠŢŢŲťƢƀŸƐƍŧƨŽƬƥƋųƃƣŲƜƴƴŽƎƽƜƙǃƙƗƾƘžƔǇƿǌƋ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ӮӪԃԍԃӾԂӈԓԋӵӞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[9] = NLoginCore_138.E("ՕՁՔպՔռՔզՈ՟֋տպզՉիոՇՏֆծ֕։֎ևֆ։ձթ֒ը՟֛֎ժ֙չջ֡՟մնըջւո֧ռբ֏ְ֊֠֒֌ֱ֣֙֘֯֙֋ַּּ֧֣֙׃տֻֿ֘ր֢֣׀ּք֮ׄ׈֜֋׎ד֛֚", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[10] = NLoginCore_027.C("ԁԐԅӭӲӢӓӭԕӥԇӞ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[11] = NLoginCore_201.D("ӾԎӈԉӨӼԅӬӫӒԑӗӖԋӳӐӺԍԠԡӚӬөӪ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[12] = NLoginCore_027.C("ӾԎӈԉӨӼԅӬӫӒԒӺӻӼӯԟԗԡԚԃӭӼөӪ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[13] = NLoginCore_559.C("ԐӍӿԀԑӮԍӏӣӐԋԙӫԚӷӲӬӠӚӳӫӹӯӰӣԢԅԁӫӷԜԗԘӿԑӰөԔӵӾԌԯԷӾ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[14] = NLoginCore_223.C("ӡӛӉԊӒӐӞԈԒӴӕӣөӸԞӴԌӾӮԊԖӼөӪ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[15] = NLoginCore_201.E("ՒՌԺջՃՁՏչփեՈ։֋փպց՞։խ֓ֆ֓՚՛", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[16] = NLoginCore_223.C("ӹԂӞӋԀӎӯӲӮӹӮӱԖӴӬԊӑԊӛӹӭԥԛԦԕӤԤӵԙԅԜӷԪԄԠӨԢԋӾԶԈӷԑӾ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[17] = NLoginCore_027.B("ŽŹŊŤŭŉƓŇšſŨœŻőŗŚƋŹƗƞƚūŨũ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[18] = NLoginCore_004.D("ӹԂӞӋԀӎӯӲӮӹӮӱԖӴӬԊӑԊӛӹӭԣӰӶԇԥԞӨԙӞӫԬԟԜԬԈԡԯԡԎԶԊԯӾ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[19] = NLoginCore_138.A("ŽŠƅŐŌƀşƅƅƓƂŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[20] = NLoginCore_027.D("ӋӇӢӻԁԅӕӓԊӑӸӮԑԝԖӵԐԏԎԏԞԗԞӷӠԉӠԈԧӺԍԝ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[21] = NLoginCore_324.E("՝ձպկւջպՏդձՠդօրՅլո֎դ՝՜փ՚՛", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[22] = NLoginCore_223.C("ӈӬӫԃӾԆԃӦӬԎӧԕԑӗԖӐӰӴӸԒӞӯӣӵԞԕԛԘԩӪԫԩ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[23] = NLoginCore_091.B("ƂšƈźƓŏŰŒŶƌŸŧŰţƌŕƝſŰƎƓŶƝƗƅŰŹŠƟŶƚƝƝťŰūƯƁűƍƏŵƏƁƇƚƗƏŷŹƜƲƗŵƒƹƗƵǆƸƢƕƣƌǉǍƂƞǎǑǑƐǂƿǈƒǒƲƛƏƬƹǌƪƬƟƻǞƽǀǀƷƼƾƷǢǁƻǩǢǑǐǝǓǣǟǌƽ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[24] = NLoginCore_446.E("ՈԹւԼԽՔճՠԺշյ֌՘ցՅ՗ՊերՌժ։Ոդդ֙ՓՍջֈ֚֝խի՚ռ֌ղե֦֟֠յտ֘֗ժֈթ֤֋֔քսւֳֵ֢֗֊֚֚֘֐֘ռ֓ցփֲִֵ֑֕׀֝׃ֻևֽ֛֧֫׀֐֏׋׃֧הֱֱ֚֭֘נטע֞׍ֵגֻֻֻֿ֣נַףס׊׬׀ְם֦־׈׉גצ״ץָֺ׋׋׳ּי׬؁؅ָ؆רכּׁת׾צמ׸ם׎؄׭؃ךכ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[25] = NLoginCore_451.A("ƌŭłŚŌťƋŧňƇƘƖŦūœŔŝőƗūŮŻŨũ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[26] = NLoginCore_223.D("ӣԀӇӱӠԒөӴӳӘӘӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[27] = NLoginCore_138.E("ցԾհձւ՟վՀՔՁսՅբՄօտ՚Վսլգսծ֗ձՕ֏՗Օև՗֠պռո՞ոհ֕ֆ֡֘տչ֟է֚ռջց֨ղ֌֣պջ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[28] = NLoginCore_027.E("՘լռԹքՂն՗՘ո՛Ո֋ռժսձևե՞ՓյՐիաշ֔֓օկ֞֞֕֝֠՟֒֘՘֡ըչբև֚֘֞ո֤֞րֳ֔֜պջ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[29] = NLoginCore_091.C("ӮӫӊԅӣӪӦӨԏӥԃӫԓԝԈӘԠԟӶԒԗӯԂԎӯӳԆԣԊԕԠԠԠԙԒԬӪԍӯԭԥԣԌӵԉԚԾԿԟԛԾՃԮԟ԰ԅ԰ԆԵԸՇԴԹԦ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[30] = NLoginCore_223.C("ӅӬӿөԆԉӦӡӎԑӗԓԃӯӖәԎӵԔԑӟԙԦԠӴӥԚӲӧӽԌӭӸӫԣԊԬԡӾԬӮԆӷӳԔԩԞԇԍӾԍԜӻԍԅԼՃԙԝԚԘԖՇԀՃԜԤԍԬՀԽՉԟԨՂՊՕՋԬՏՍԶԸԭԺԜբՠԻԣԩՆԥ՗էծ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[31] = NLoginCore_027.C("ӟԄӠӞӽӠӐԇԇӨӱӑӰӵӷӶԊԘԎӞԛӬөӪ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[32] = NLoginCore_138.E("կՖԾղԾեվբՑռֈՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[33] = NLoginCore_427.A("ŖŇƐŊŋŢƁŮňƅƃƚŦƏœťŘųƎŚŸƗŖŲŲƧšśƉƖƫƨŻŹŨƊƚƀųƴƭƮƃƍƦƥŸƖŷƲƙƢƒƋƐǃǁƥưƘƦƨƨƞƦƊơƏƑƣǃƟǀǂǑƙƚǗǏƪƪǛǟƸǎƳǓƻǐƥƦǚǈƸƦƭǫƬƹǅƱǪǧǨǳƲǎǨǉƴǍƶǊǉƲǶǒǟǮǾǚǸǠǜǛȅǼȋȆǌǾȃǑȍǨǑȃǨǬǝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[34] = NLoginCore_559.C("ԉӌӍԌӏӐӽԃӷӦԚԚӯӰԖӭӯӷӽӚӞԢөӪ", (byte)75, 67);
                    NLoginCore_108.var_java_lang_String_arr_b[35] = NLoginCore_138.F("ԻցԴ՟գվՕՀՆև՞Տ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[36] = NLoginCore_223.B("ŪƊŸŝƆƓŦŤƇƕƗƃųźƎŖŰƠŞƢƃơŵůƎƤƜšƩƢƀƢŭƏƁŨŭųƭƶƶƴųŽ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[37] = NLoginCore_384.E("Թ՛ի՗Օ՟նցգգՒՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[38] = NLoginCore_451.E("Ջՠ՟ջքՕ՜ՇյաֈՁի՛խՇօ֌Սիրնփը։զօ՛յ՘՝֖", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[39] = NLoginCore_091.F("ՏջԼՍլ՜ՒֈչՄռՏ", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[40] = NLoginCore_110.D("ӾӱԂӡԔԐӣӶԋӪԘԍӲӖӮӸԊӱӽԃӿӼөӪ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[41] = NLoginCore_091.D("ӜӤӏӟԔӝӤԒӟӳӵӞ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[42] = NLoginCore_384.A("ƌżŪőƋŉżƑŒƊƖŝ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[43] = NLoginCore_201.D("ӣӧӟӼԈԇӌӯӴԇԈԉԄԌӵӕӶԗԠӵԄԢӹӟӼӞӲԁӻԛӺԤ", (byte)75, 68);
                    NLoginCore_108.var_java_lang_String_arr_b[44] = NLoginCore_384.E("ջԿմոռեւմՔմՅՏ", (byte)75, 69);
                    NLoginCore_108.var_java_lang_String_arr_b[45] = NLoginCore_027.A("ƈƊŪŝńżŒŲƇŔŊŨŚƚƆƕŨŞŷƛƛƑŨũ", (byte)75, 65);
                    NLoginCore_108.var_java_lang_String_arr_b[46] = NLoginCore_223.F("Ք՘ՐխչոԽՠեոո՜՛֎իպիՋփզՎլՖֆ֙ըխֆ֛֙֏֋", (byte)75, 70);
                    NLoginCore_108.var_java_lang_String_arr_b[47] = NLoginCore_387.B("ƍſƊƃŧƒŧŴžƊŴŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[48] = NLoginCore_324.B("ƂŷżšŤƋţŏŵƂŬŝ", (byte)75, 66);
                    NLoginCore_108.var_java_lang_String_arr_b[49] = NLoginCore_446.A("ƆŋſƅňŭƎŎƓŉƎŢƕťƋƛƒžśşŬŚƔŢŷŝƒżŧƣŤŶƁƄƩƚƜƑƈƤųƟƦŽ", (byte)75, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_108.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ՉիԺԾմՃՙ՜Շ՚ՉտէֆՅևՠտռ֊զ֓՚՛", (byte)75, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_108.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԸՐծյԻՄ՗յՠղՖէբթւթեֈձգվ՟ժՖքւ֖֌֛֝֎֊", (byte)75, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x46L;
        l ^= 0xA0532AD2E46A2E0AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(63 + 6), (byte)(45 + 38), (byte)(43 + 4), (byte)(64 + 3), (byte)(35 + 31), (byte)(38 + 29), 47, (byte)(25 + 55), (byte)(3 + 72), (byte)(58 + 9), (byte)(15 + 68), (byte)(34 + 19), (byte)(16 + 64), 97, (byte)(53 + 47), (byte)(29 + 71), (byte)(102 + 3), (byte)(80 + 30), (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(51 + 32)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.F("ԾՋՊԍՍՉՄՍ՘ՇԔՒՖՏՒ՘Ԛ࢝ࢤࢡࢩࢮࢌࢶࢻࢲࢯࢺࢗࢴࢳࢲ", (byte)31, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_108.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

