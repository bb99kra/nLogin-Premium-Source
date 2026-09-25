/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.configuration.file.YamlConfiguration
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_342;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_346;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_323;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_515;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_254;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.BedrockFloodgateHook;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_308;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_126;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.configuration.file.YamlConfiguration;

public class BCryptHashProvider {
    private static int eo;
    private static int gi;
    private static long op;
    private static int u;
    private static int am;
    private static long ck;
    private static int var_int_c;
    private static int aw;
    private static List<Pattern> var_java_util_List_java_util_regex_Pattern__r;
    private static long av;
    private static String[] var_java_lang_String_arr_b;
    private static int pa;
    private static int nv;
    private static long kv;
    private static long bm;
    private static long io;
    private static int ex;
    private static int cfr_renamed_1;
    private static int es;
    private static int cy;
    private static long ez;
    private static int bd;
    private static int ko;
    private static int x;
    private static long dx;
    private static long cd;
    private static long var_long_c;
    private static int kh;
    private static int lh;
    private static int lm;
    private static long gh;
    private static boolean aO;
    private static long br;
    private static long dk;
    private static long jh;
    private static int lf;
    private static int fy;
    private static int nn;
    private static int bh;
    private static long id;
    private static int jk;
    private static long fl;
    private static long fw;
    private static int du;
    private static int kx;
    private static long aa;
    private static KeyPair var_java_security_KeyPair_b;
    private static int kq;
    private static int ff;
    private static long fn;
    private static long kk;
    private static int mw;
    private static long gb;
    private static int mm;
    private static int iv;
    private static int p;
    private static long eq;
    private static int var_int_b;
    private static int nt;
    private static int mq;
    private static int go;
    private static int lu;
    private static int ls;
    private static long jn;
    private static long jc;
    private static boolean aL;
    private static long ed;
    private static int ei;
    private static int jo;
    private static int ne;
    private static long ct;
    private static int nl;
    private static int n;
    private static int g;
    private static long au;
    private static long nx;
    private static long eu;
    private static long eg;
    private static int w;
    private static NLoginCore_566 var_com_nickuc_login_NLoginCore_566_a;
    private static long ml;
    private static int ee;
    private static long il;
    private static long kc;
    private static int ma;
    private static int dr;
    private static int gx;
    private static int mz;
    private static long by;
    private static long dm;
    private static int oy;
    private static long bb;
    private static int cm;
    private static long lq;
    private static int jt;
    private static long ac;
    private static int lx;
    private static long ag;
    private static long ai;
    private static int kl;
    private static int dd;
    private static int od;
    private static Pattern var_java_util_regex_Pattern_h;
    private static int os;
    private static int li;
    private static int nq;
    private static long ju;
    private static int iq;
    private static int ns;
    private static int lk;
    private static int hx;
    private static long iw;
    private static int em;
    private static long lj;
    private static long be;
    private static long kj;
    private static int var_int_r;
    private static int fq;
    private static int ij;
    private static int var_int_h;
    private static int la;
    private static long de;
    private static int iu;
    private static int eb;
    private static long var_long_i;
    private static int ir;
    private static int lv;
    private static long ks;
    private static long hh;
    private static int ob;
    private static long kn;
    private static long nr;
    private static long ci;
    private static int kw;
    private static int oa;
    private static int kg;
    private static long mv;
    private static long cz;
    private static int kp;
    private static int ah;
    private static long bp;
    private static long kz;
    private static int fe;
    private static int ha;
    private static long cb;
    private static int ic;
    private static int y;
    private static long on;
    private static long im;
    private static int bt;
    private static long ef;
    private static long ey;
    private static int et;
    private static long nf;
    private static int hk;
    private static int aj;
    private static long ak;
    private static int dl;
    private static int gd;
    private static int hi;
    private static boolean aM;
    private static long ay;
    private static long me;
    private static int fb;
    private static int el;
    private static int pb;
    private static long en;
    private static long nb;
    private static Pattern var_java_util_regex_Pattern_i;
    private static long ar;
    private static long bj;
    private static int ld;
    private static long bv;
    private static int fz;
    private static int mu;
    private static long np;
    private static long gf;
    private static long cn;
    private static long hr;
    private static long oj;
    private static NLoginCore_175 var_com_nickuc_login_NLoginCore_175_a;
    private static int nm;
    private static int of;
    private static int bq;
    private static int og;
    private static long fd;
    private static int bi;
    private static int in;
    private static long df;
    private static int jv;
    private static int mg;
    private static int cv;
    private static int ov;
    private static int gm;
    private static int mo;
    private static int mt;
    private static String[] var_java_lang_String_arr_a;
    private static long kf;
    private static int ep;
    private static int kt;
    private static long ja;
    private static int ll;
    private static int ol;
    private static long mb;
    private static long mk;
    private static int dy;
    private static long gw;
    private static int hb;
    private static int ax;
    private static long bl;
    private static long dt;
    private static int hq;
    private static long ke;
    private static int mn;
    private static int jj;
    private static long ft;
    private static int nc;
    private static NLoginCore_254 var_com_nickuc_login_NLoginCore_254_a;
    private static int gu;
    private static int le;
    private static long bx;
    private static long mc;
    private static long ku;
    private static long fo;
    private static long kb;
    private static int cw;
    private static long v;
    private static int gk;
    private static long dc;
    private static long ou;
    private static int gy;
    private static int cl;
    private static int fh;
    private static int bw;
    private static long o;
    private static int ki;
    private static int hz;
    private static long z;
    private static int ab;
    private static long ap;
    private static int e;
    private static int jm;
    private static long jf;
    private static int oz;
    private static int dz;
    private static int oc;
    private static int nk;
    private static int bn;
    private static long ad;
    private static int jz;
    private static int je;
    private static List<Pattern> var_java_util_List_java_util_regex_Pattern__s;
    private static int na;
    private static int gr;
    private static int cfr_renamed_0;
    private static long lg;
    private static long ie;
    private static int gq;
    private static int q;
    private static int iz;
    private static int jl;
    private static int ht;
    private static long ok;
    private static long hp;
    private static long km;
    private static NLoginCore_555 var_com_nickuc_login_NLoginCore_555_b;
    private static long gc;
    private static int aq;
    private static long bo;
    private static long jx;
    private static long ca;
    private static int md;
    private static long mi;
    private static int hc;
    private static long kr;
    private static int jb;
    private static int ib;
    private static long hs;
    private static long hd;
    private static int ch;
    private static long oh;
    private static long cu;
    private static int fu;
    private static long ce;
    private static int var_int_j;
    private static int jg;
    private static int fs;
    private static int cg;
    private static int dg;
    private static long lz;
    private static long t;
    private static long al;
    private static int ik;
    private static int cj;
    private static int hf;
    private static int lb;
    private static int fv;
    private static int hy;
    private static long dq;
    private static int ms;
    private static long ng;
    private static long an;
    private static long hw;
    private static long k;
    private static int ae;
    private static int db;
    private static String cL;
    private static int dw;
    private static int bg;
    private static long dj;
    private static long ln;
    private static int nh;
    private static long ea;
    private static int gj;
    private static int ka;
    private static int ba;
    private static long oq;
    private static int mx;
    private static int fx;
    private static int gg;
    private static long lo;
    private static long ow;
    private static long nd;
    private static int bz;
    private static int is;
    private static int kd;
    private static long hu;
    private static int fp;
    private static int my;
    private static long jp;
    private static long jd;
    private static int fm;
    private static long dn;
    private static long af;
    private static long ig;
    private static long fc;
    private static int bk;
    private static long ih;
    private static long ec;
    private static int fj;
    private static int bs;
    private static long jw;
    private static long ix;
    private static int oe;
    private static long ew;
    private static int lw;
    private static int ky;
    private static int lr;
    private static long nw;
    private static long co;
    private static int hm;
    private static int lt;
    private static boolean aN;
    private static int ds;
    private static int gt;
    private static long bf;
    private static long hl;
    private static int iy;
    private static int ev;
    private static int oo;
    private static int oi;
    private static int om;
    private static int ej;
    private static long mh;
    private static int gl;
    private static long fk;
    private static int pc;
    private static int it;
    private static int cs;
    private static int or;
    private static int di;
    private static long lc;
    private static int ga;
    private static int d;
    private static int hn;
    private static int hv;
    private static int ni;
    private static long mf;
    private static NLoginCore_036 var_com_nickuc_login_NLoginCore_036_j;
    private static long nu;
    private static long dp;
    private static long jq;
    private static int jr;
    private static long ox;
    private static int fr;
    private static byte[] var_byte_arr_j;
    private static int cp;
    private static long ly;
    private static long cq;
    private static int az;
    private static long ge;
    private static int no;
    private static long as;
    private static int jy;
    private static int ii;
    private static int eh;
    private static NLoginCore_555 var_com_nickuc_login_NLoginCore_555_c;
    private static int mj;
    private static long fg;
    private static long cx;
    private static int bc;
    private static long ho;
    private static long var_long_s;
    private static long bu;
    private static long he;
    private static long hg;
    private static long l;
    private static int m;
    private static int mr;
    private static int fa;
    private static long hj;
    private static long nj;
    private static long da;
    private static int at;
    private static int cc;
    private static int ip;
    private static int fi;
    private static int dh;
    private static long nz;
    private static int cf;
    private static int js;
    private static long ot;
    private static long ji;
    private static int lp;
    private static int gn;
    private static long gv;
    private static long mp;
    private static int dv;
    private static int gs;
    private static long f;
    private static int ek;
    private static long gz;
    private static int er;
    private static int ao;
    private static int ia;
    private static int ny;
    private static long cr;
    private static int gp;
    private static int var_int_a;

    private static void aP() {
        String string = NLoginCore_532.G.a(new Object[nm]);
        try {
            var_java_util_regex_Pattern_h = Pattern.compile(string);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)(nn & no), (long)np) + string + (String)BCryptHashProvider.c("㺃", (int)nq, (long)nr), patternSyntaxException, new Object[ns]);
            var_java_util_regex_Pattern_h = Pattern.compile((String)NLoginCore_532.G.java_lang_Object_a());
        }
    }

    static {
        var_int_a = 0 >>> 204 | 0 << ~204 + 1;
        var_int_b = Integer.reverse(0);
        var_int_c = 0x10000000 >>> 92 | 0x10000000 << ~92 + 1;
        d = (0 >>> 205 | 0 << ~205 + 1) & 0xFFFFFFFF;
        e = (0 >>> 27 | 0 << ~27 + 1) & 0xFFFFFFFF;
        f = Long.reverse(7513335334271960691L);
        g = (144 >>> 100 | 144 << ~100 + 1) & 0xFFFFFFFF;
        var_int_h = (512 >>> 9 | 512 << ~9 + 1) & 0xFFFFFFFF;
        var_long_i = Long.reverse(7513335334271960691L);
        var_int_j = Integer.reverse(0x40000000);
        k = Long.reverse(6936874581968537203L);
        l = Long.reverse(0x800000000000000L);
        m = Integer.reverse(-1073741824);
        n = (-1 >>> 54 | -1 << ~54 + 1) & 0xFFFFFFFF;
        o = Long.reverse(7513335334271960691L);
        p = Integer.reverse(0);
        q = Integer.reverse(0);
        var_int_r = (32 >>> 35 | 32 << -35) & 0xFFFFFFFF;
        var_long_s = Long.reverse(6936874581968537203L);
        t = Long.reverse(0x800000000000000L);
        u = Integer.reverse(-1610612736);
        v = Long.reverse(7513335334271960691L);
        w = (0 >>> 74 | 0 << -74) & 0xFFFFFFFF;
        x = Integer.reverse(0);
        y = (0x18000000 >>> 58 | 0x18000000 << -58) & 0xFFFFFFFF;
        z = Long.reverse(6936874581968537203L);
        aa = Long.reverse(0x800000000000000L);
        ab = Integer.reverse(-536870912);
        ac = Long.reverse(6936874581968537203L);
        ad = Long.reverse(0x800000000000000L);
        ae = 0x200000 >>> 178 | 0x200000 << -178;
        af = Long.reverse(6936874581968537203L);
        ag = Long.reverse(0x800000000000000L);
        ah = Integer.reverse(-1879048192);
        ai = Long.reverse(7513335334271960691L);
        aj = Integer.reverse(0x50000000);
        ak = Long.reverse(6936874581968537203L);
        al = Long.reverse(0x800000000000000L);
        am = Integer.reverse(-805306368);
        an = Long.reverse(7513335334271960691L);
        ao = Integer.reverse(0x30000000);
        ap = Long.reverse(7513335334271960691L);
        aq = (832 >>> 102 | 832 << ~102 + 1) & 0xFFFFFFFF;
        ar = Long.reverse(6936874581968537203L);
        as = Long.reverse(0x800000000000000L);
        at = Integer.reverse(0x70000000);
        au = Long.reverse(6936874581968537203L);
        av = Long.reverse(0x800000000000000L);
        aw = (240 >>> 36 | 240 << -36) & 0xFFFFFFFF;
        ax = Integer.reverse(-1);
        ay = Long.reverse(7513335334271960691L);
        az = 1 >>> 92 | 1 << -92;
        ba = Integer.reverse(-1);
        bb = Long.reverse(7513335334271960691L);
        bc = Integer.reverse(0);
        bd = Integer.reverse(-2013265920);
        be = Long.reverse(6936874581968537203L);
        bf = Long.reverse(0x800000000000000L);
        bg = (0 >>> 212 | 0 << -212) & 0xFFFFFFFF;
        bh = 0 >>> 50 | 0 << ~50 + 1;
        bi = Integer.reverse(0x48000000);
        bj = Long.reverse(7513335334271960691L);
        bk = 38912 >>> 107 | 38912 << -107;
        bl = Long.reverse(6936874581968537203L);
        bm = Long.reverse(0x800000000000000L);
        bn = (10240 >>> 73 | 10240 << -73) & 0xFFFFFFFF;
        bo = Long.reverse(6936874581968537203L);
        bp = Long.reverse(0x800000000000000L);
        bq = 0x50000001 >>> 156 | 0x50000001 << ~156 + 1;
        br = Long.reverse(7513335334271960691L);
        bs = Integer.reverse(0);
        bt = (2816 >>> 167 | 2816 << -167) & 0xFFFFFFFF;
        bu = Long.reverse(6936874581968537203L);
        bv = Long.reverse(0x800000000000000L);
        bw = Integer.reverse(-402653184);
        bx = Long.reverse(6936874581968537203L);
        by = Long.reverse(0x800000000000000L);
        bz = (786432 >>> 207 | 786432 << ~207 + 1) & 0xFFFFFFFF;
        ca = Long.reverse(6936874581968537203L);
        cb = Long.reverse(0x800000000000000L);
        cc = Integer.reverse(-1744830464);
        cd = Long.reverse(6936874581968537203L);
        ce = Long.reverse(0x800000000000000L);
        cf = (0 >>> 50 | 0 << ~50 + 1) & 0xFFFFFFFF;
        cg = (0 >>> 141 | 0 << -141) & 0xFFFFFFFF;
        ch = Integer.reverse(0x58000000);
        ci = Long.reverse(7513335334271960691L);
        cj = Integer.reverse(-671088640);
        ck = Long.reverse(7513335334271960691L);
        cl = (0 >>> 202 | 0 << ~202 + 1) & 0xFFFFFFFF;
        cm = Integer.reverse(0x38000000);
        cn = Long.reverse(6936874581968537203L);
        co = Long.reverse(0x800000000000000L);
        cp = (118784 >>> 172 | 118784 << ~172 + 1) & 0xFFFFFFFF;
        cq = Long.reverse(6936874581968537203L);
        cr = Long.reverse(0x800000000000000L);
        cs = Integer.reverse(0x78000000);
        ct = Long.reverse(6936874581968537203L);
        cu = Long.reverse(0x800000000000000L);
        cv = 0 >>> 49 | 0 << ~49 + 1;
        cw = 63488 >>> 75 | 63488 << -75;
        cx = Long.reverse(7513335334271960691L);
        cy = Integer.reverse(0x4000000);
        cz = Long.reverse(6936874581968537203L);
        da = Long.reverse(0x800000000000000L);
        db = Integer.reverse(-2080374784);
        dc = Long.reverse(7513335334271960691L);
        dd = Integer.reverse(0x44000000);
        de = Long.reverse(6936874581968537203L);
        df = Long.reverse(0x800000000000000L);
        dg = (0 >>> 141 | 0 << ~141 + 1) & 0xFFFFFFFF;
        dh = Integer.reverse(0);
        di = Integer.reverse(-1006632960);
        dj = Long.reverse(6936874581968537203L);
        dk = Long.reverse(0x800000000000000L);
        dl = Integer.reverse(0x24000000);
        dm = Long.reverse(6936874581968537203L);
        dn = Long.reverse(0x800000000000000L);
        cfr_renamed_1 = 0x4A000000 >>> 57 | 0x4A000000 << ~57 + 1;
        dp = Long.reverse(6936874581968537203L);
        dq = Long.reverse(0x800000000000000L);
        dr = Integer.reverse(0x64000000);
        ds = -1 >>> 199 | -1 << -199;
        dt = Long.reverse(7513335334271960691L);
        du = (0 >>> 152 | 0 << -152) & 0xFFFFFFFF;
        dv = 0 >>> 186 | 0 << ~186 + 1;
        dw = (2496 >>> 102 | 2496 << -102) & 0xFFFFFFFF;
        dx = Long.reverse(7513335334271960691L);
        dy = (-1610612736 >>> 250 | -1610612736 << ~250 + 1) & 0xFFFFFFFF;
        dz = Integer.reverse(-1);
        ea = Long.reverse(7513335334271960691L);
        eb = (1312 >>> 197 | 1312 << ~197 + 1) & 0xFFFFFFFF;
        ec = Long.reverse(6936874581968537203L);
        ed = Long.reverse(0x800000000000000L);
        ee = 0x15000000 >>> 215 | 0x15000000 << ~215 + 1;
        ef = Long.reverse(6936874581968537203L);
        eg = Long.reverse(0x800000000000000L);
        eh = 0 >>> 121 | 0 << -121;
        ei = Integer.reverse(0);
        ej = Integer.reverse(0);
        ek = 0 >>> 81 | 0 << ~81 + 1;
        el = Integer.reverse(-738197504);
        em = Integer.reverse(-1);
        en = Long.reverse(7513335334271960691L);
        eo = Integer.reverse(0x34000000);
        ep = -1 >>> 214 | -1 << ~214 + 1;
        eq = Long.reverse(7513335334271960691L);
        er = Integer.reverse(0);
        es = (0 >>> 72 | 0 << ~72 + 1) & 0xFFFFFFFF;
        et = Integer.reverse(-1275068416);
        eu = Long.reverse(7513335334271960691L);
        ev = Integer.reverse(0x74000000);
        ew = Long.reverse(7513335334271960691L);
        ex = Integer.reverse(-201326592);
        ey = Long.reverse(6936874581968537203L);
        ez = Long.reverse(0x800000000000000L);
        fa = Integer.reverse(0);
        fb = 0x18000000 >>> 119 | 0x18000000 << ~119 + 1;
        fc = Long.reverse(6936874581968537203L);
        fd = Long.reverse(0x800000000000000L);
        fe = Integer.reverse(0);
        ff = Integer.reverse(-1946157056);
        fg = Long.reverse(7513335334271960691L);
        fh = Integer.reverse(Integer.MIN_VALUE);
        fi = Integer.reverse(0);
        fj = Integer.reverse(0x4C000000);
        fk = Long.reverse(6936874581968537203L);
        fl = Long.reverse(0x800000000000000L);
        fm = Integer.reverse(-872415232);
        fn = Long.reverse(6936874581968537203L);
        fo = Long.reverse(0x800000000000000L);
        fp = 0 >>> 68 | 0 << ~68 + 1;
        fq = 0 >>> 93 | 0 << -93;
        fr = -1 >>> 18 | -1 << ~18 + 1;
        fs = Integer.reverse(0x2C000000);
        ft = Long.reverse(7513335334271960691L);
        fu = (0 >>> 31 | 0 << -31) & 0xFFFFFFFF;
        fv = Integer.reverse(-1409286144);
        fw = Long.reverse(7513335334271960691L);
        fx = (8 >>> 99 | 8 << -99) & 0xFFFFFFFF;
        fy = (0 >>> 212 | 0 << ~212 + 1) & 0xFFFFFFFF;
        fz = Integer.reverse(Integer.MIN_VALUE);
        ga = 0x6C00000 >>> 181 | 0x6C00000 << -181;
        gb = Long.reverse(6936874581968537203L);
        gc = Long.reverse(0x800000000000000L);
        gd = Integer.reverse(-335544320);
        ge = Long.reverse(6936874581968537203L);
        gf = Long.reverse(0x800000000000000L);
        gg = (1792 >>> 37 | 1792 << -37) & 0xFFFFFFFF;
        gh = Long.reverse(7513335334271960691L);
        gi = Integer.reverse(0);
        gj = Integer.reverse(Integer.MIN_VALUE);
        gk = Integer.reverse(0);
        gl = Integer.reverse(0);
        gm = Integer.reverse(Integer.MIN_VALUE);
        gn = 0x2000000 >>> 185 | 0x2000000 << ~185 + 1;
        go = (64 >>> 98 | 64 << ~98 + 1) & 0xFFFFFFFF;
        gp = 0 >>> 131 | 0 << -131;
        gq = 0 >>> 234 | 0 << ~234 + 1;
        gr = Integer.reverse(0);
        gs = Integer.reverse(Integer.MIN_VALUE);
        gt = Integer.reverse(0);
        gu = Integer.reverse(-1677721600);
        gv = Long.reverse(6936874581968537203L);
        gw = Long.reverse(0x800000000000000L);
        gx = -2147483634 >>> 30 | -2147483634 << ~30 + 1;
        gy = (-1 >>> 42 | -1 << ~42 + 1) & 0xFFFFFFFF;
        gz = Long.reverse(7513335334271960691L);
        ha = Integer.reverse(0);
        hb = Integer.reverse(0);
        hc = (30932992 >>> 211 | 30932992 << -211) & 0xFFFFFFFF;
        hd = Long.reverse(6936874581968537203L);
        he = Long.reverse(0x800000000000000L);
        hf = Integer.reverse(0x3C000000);
        hg = Long.reverse(6936874581968537203L);
        hh = Long.reverse(0x800000000000000L);
        hi = (976 >>> 68 | 976 << ~68 + 1) & 0xFFFFFFFF;
        hj = Long.reverse(7513335334271960691L);
        hk = Integer.reverse(0x7C000000);
        hl = Long.reverse(7513335334271960691L);
        hm = Integer.reverse(0);
        hn = Integer.reverse(-67108864);
        ho = Long.reverse(6936874581968537203L);
        hp = Long.reverse(0x800000000000000L);
        hq = (Integer.MIN_VALUE >>> 153 | Integer.MIN_VALUE << ~153 + 1) & 0xFFFFFFFF;
        hr = Long.reverse(6936874581968537203L);
        hs = Long.reverse(0x800000000000000L);
        ht = 532480 >>> 205 | 532480 << -205;
        hu = Long.reverse(7513335334271960691L);
        hv = (0x8400000 >>> 245 | 0x8400000 << -245) & 0xFFFFFFFF;
        hw = Long.reverse(7513335334271960691L);
        hx = Integer.reverse(0);
        hy = Integer.reverse(-1073741824);
        hz = Integer.reverse(0x4C000000);
        ia = 0 >>> 227 | 0 << ~227 + 1;
        ib = 4096 >>> 73 | 4096 << ~73 + 1;
        ic = (2195456 >>> 143 | 2195456 << ~143 + 1) & 0xFFFFFFFF;
        id = Long.reverse(6936874581968537203L);
        ie = Long.reverse(0x800000000000000L);
        cfr_renamed_0 = (278528 >>> 12 | 278528 << ~12 + 1) & 0xFFFFFFFF;
        ig = Long.reverse(6936874581968537203L);
        ih = Long.reverse(0x800000000000000L);
        ii = Integer.reverse(0);
        ij = (253952 >>> 13 | 253952 << ~13 + 1) & 0xFFFFFFFF;
        ik = (8832 >>> 7 | 8832 << ~7 + 1) & 0xFFFFFFFF;
        il = Long.reverse(6936874581968537203L);
        im = Long.reverse(0x800000000000000L);
        in = Integer.reverse(0x62000000);
        io = Long.reverse(7513335334271960691L);
        ip = 0 >>> 43 | 0 << ~43 + 1;
        iq = (0x4000000 >>> 25 | 0x4000000 << ~25 + 1) & 0xFFFFFFFF;
        ir = 0 >>> 172 | 0 << ~172 + 1;
        is = 0x1000000 >>> 152 | 0x1000000 << -152;
        it = 0x100000 >>> 84 | 0x100000 << -84;
        iu = Integer.reverse(0);
        iv = Integer.reverse(-503316480);
        iw = Long.reverse(6936874581968537203L);
        ix = Long.reverse(0x800000000000000L);
        iy = 2304 >>> 37 | 2304 << -37;
        iz = Integer.reverse(-1);
        ja = Long.reverse(7513335334271960691L);
        jb = Integer.reverse(-1845493760);
        jc = Long.reverse(6936874581968537203L);
        jd = Long.reverse(0x800000000000000L);
        je = Integer.reverse(0x52000000);
        jf = Long.reverse(7513335334271960691L);
        jg = Integer.reverse(-771751936);
        jh = Long.reverse(6936874581968537203L);
        ji = Long.reverse(0x800000000000000L);
        jj = Integer.reverse(0);
        jk = 131072 >>> 81 | 131072 << ~81 + 1;
        jl = Integer.reverse(0x32000000);
        jm = -1 >>> 196 | -1 << -196;
        jn = Long.reverse(7513335334271960691L);
        jo = (20185088 >>> 178 | 20185088 << ~178 + 1) & 0xFFFFFFFF;
        jp = Long.reverse(6936874581968537203L);
        jq = Long.reverse(0x800000000000000L);
        jr = Integer.reverse(0);
        js = Integer.reverse(-1073741824);
        jt = Integer.reverse(0x72000000);
        ju = Long.reverse(7513335334271960691L);
        jv = Integer.reverse(-234881024);
        jw = Long.reverse(6936874581968537203L);
        jx = Long.reverse(0x800000000000000L);
        jy = (0 >>> 125 | 0 << -125) & 0xFFFFFFFF;
        jz = Integer.reverse(0x2000000);
        ka = 0x28000000 >>> 215 | 0x28000000 << ~215 + 1;
        kb = Long.reverse(6936874581968537203L);
        kc = Long.reverse(0x800000000000000L);
        kd = Integer.reverse(-1979711488);
        ke = Long.reverse(6936874581968537203L);
        kf = Long.reverse(0x800000000000000L);
        kg = Integer.reverse(0);
        kh = Integer.reverse(0x20000000);
        ki = Integer.reverse(0x4A000000);
        kj = Long.reverse(6936874581968537203L);
        kk = Long.reverse(0x800000000000000L);
        kl = 332 >>> 2 | 332 << ~2 + 1;
        km = Long.reverse(6936874581968537203L);
        kn = Long.reverse(0x800000000000000L);
        ko = (0 >>> 253 | 0 << ~253 + 1) & 0xFFFFFFFF;
        kp = Integer.reverse(0x20000000);
        kq = Integer.reverse(0x2A000000);
        kr = Long.reverse(6936874581968537203L);
        ks = Long.reverse(0x800000000000000L);
        kt = Integer.reverse(-1442840576);
        ku = Long.reverse(6936874581968537203L);
        kv = Long.reverse(0x800000000000000L);
        kw = 0 >>> 218 | 0 << -218;
        kx = Integer.reverse(0x100000);
        ky = Integer.reverse(0x6A000000);
        kz = Long.reverse(7513335334271960691L);
        la = (174 >>> 33 | 174 << ~33 + 1) & 0xFFFFFFFF;
        lb = Integer.reverse(-1);
        lc = Long.reverse(7513335334271960691L);
        ld = Integer.reverse(0);
        le = Integer.reverse(Integer.MIN_VALUE);
        lf = Integer.reverse(0x1A000000);
        lg = Long.reverse(7513335334271960691L);
        lh = -1879048187 >>> 124 | -1879048187 << -124;
        li = Integer.reverse(-1);
        lj = Long.reverse(7513335334271960691L);
        lk = (0 >>> 133 | 0 << -133) & 0xFFFFFFFF;
        ll = Integer.reverse(0x10000000);
        lm = Integer.reverse(0x5A000000);
        ln = Long.reverse(6936874581968537203L);
        lo = Long.reverse(0x800000000000000L);
        lp = Integer.reverse(-637534208);
        lq = Long.reverse(7513335334271960691L);
        lr = 0 >>> 46 | 0 << -46;
        ls = (524288 >>> 242 | 524288 << ~242 + 1) & 0xFFFFFFFF;
        lt = Integer.reverse(0);
        lu = 0x4000000 >>> 250 | 0x4000000 << -250;
        lv = Integer.reverse(Integer.MIN_VALUE);
        lw = (0 >>> 254 | 0 << ~254 + 1) & 0xFFFFFFFF;
        lx = Integer.reverse(0x3A000000);
        ly = Long.reverse(6936874581968537203L);
        lz = Long.reverse(0x800000000000000L);
        ma = 0xBA0000 >>> 49 | 0xBA0000 << ~49 + 1;
        mb = Long.reverse(6936874581968537203L);
        mc = Long.reverse(0x800000000000000L);
        md = 0x2F000000 >>> 87 | 0x2F000000 << -87;
        me = Long.reverse(6936874581968537203L);
        mf = Long.reverse(0x800000000000000L);
        mg = Integer.reverse(-100663296);
        mh = Long.reverse(6936874581968537203L);
        mi = Long.reverse(0x800000000000000L);
        mj = Integer.reverse(0x6000000);
        mk = Long.reverse(6936874581968537203L);
        ml = Long.reverse(0x800000000000000L);
        mm = 0 >>> 151 | 0 << -151;
        mn = Integer.reverse(Integer.MIN_VALUE);
        mo = 194 >>> 129 | 194 << -129;
        mp = Long.reverse(7513335334271960691L);
        mq = 0 >>> 33 | 0 << -33;
        mr = Integer.reverse(Integer.MIN_VALUE);
        ms = 0 >>> 84 | 0 << ~84 + 1;
        mt = (401408 >>> 140 | 401408 << ~140 + 1) & 0xFFFFFFFF;
        mu = -1 >>> 195 | -1 << -195;
        mv = Long.reverse(7513335334271960691L);
        mw = Integer.reverse(0);
        mx = 0 >>> 216 | 0 << ~216 + 1;
        my = Integer.reverse(0);
        mz = 0 >>> 33 | 0 << -33;
        na = Integer.reverse(-973078528);
        nb = Long.reverse(7513335334271960691L);
        nc = (0x3200000 >>> 19 | 0x3200000 << ~19 + 1) & 0xFFFFFFFF;
        nd = Long.reverse(7513335334271960691L);
        ne = 0x6500000 >>> 84 | 0x6500000 << -84;
        nf = Long.reverse(6936874581968537203L);
        ng = Long.reverse(0x800000000000000L);
        nh = (3264 >>> 133 | 3264 << -133) & 0xFFFFFFFF;
        ni = Integer.reverse(-1);
        nj = Long.reverse(7513335334271960691L);
        nk = 0 >>> 122 | 0 << ~122 + 1;
        nl = 0 >>> 31 | 0 << ~31 + 1;
        nm = Integer.reverse(0);
        nn = Integer.reverse(-436207616);
        no = (-1 >>> 182 | -1 << ~182 + 1) & 0xFFFFFFFF;
        np = Long.reverse(7513335334271960691L);
        nq = (0x34000000 >>> 23 | 0x34000000 << -23) & 0xFFFFFFFF;
        nr = Long.reverse(7513335334271960691L);
        ns = Integer.reverse(0);
        nt = 420 >>> 162 | 420 << ~162 + 1;
        nu = Long.reverse(7513335334271960691L);
        nv = (434176 >>> 172 | 434176 << ~172 + 1) & 0xFFFFFFFF;
        nw = Long.reverse(6936874581968537203L);
        nx = Long.reverse(0x800000000000000L);
        ny = (107 >>> 192 | 107 << -192) & 0xFFFFFFFF;
        nz = Long.reverse(7513335334271960691L);
        oa = Integer.reverse(0x20000000);
        ob = Integer.reverse(0);
        oc = Integer.reverse(0);
        od = (4096 >>> 236 | 4096 << ~236 + 1) & 0xFFFFFFFF;
        oe = Integer.reverse(0x40000000);
        of = Integer.reverse(-1073741824);
        og = (27 >>> 30 | 27 << -30) & 0xFFFFFFFF;
        oh = Long.reverse(7513335334271960691L);
        oi = 28573696 >>> 18 | 28573696 << ~18 + 1;
        oj = Long.reverse(6936874581968537203L);
        ok = Long.reverse(0x800000000000000L);
        ol = (0xDC0000 >>> 113 | 0xDC0000 << -113) & 0xFFFFFFFF;
        om = (-1 >>> 102 | -1 << ~102 + 1) & 0xFFFFFFFF;
        on = Long.reverse(7513335334271960691L);
        oo = (931135488 >>> 215 | 931135488 << ~215 + 1) & 0xFFFFFFFF;
        op = Long.reverse(6936874581968537203L);
        oq = Long.reverse(0x800000000000000L);
        or = 0 >>> 0 | 0 << -0;
        os = Integer.reverse(0xE000000);
        ot = Long.reverse(6936874581968537203L);
        ou = Long.reverse(0x800000000000000L);
        ov = (0x7100000 >>> 244 | 0x7100000 << -244) & 0xFFFFFFFF;
        ow = Long.reverse(6936874581968537203L);
        ox = Long.reverse(0x800000000000000L);
        oy = (0 >>> 158 | 0 << ~158 + 1) & 0xFFFFFFFF;
        oz = -469762048 >>> 217 | -469762048 << ~217 + 1;
        pa = 0x20000007 >>> 220 | 0x20000007 << ~220 + 1;
        pb = (131072 >>> 145 | 131072 << -145) & 0xFFFFFFFF;
        pc = (32768 >>> 79 | 32768 << ~79 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[oz];
        var_java_lang_String_arr_b = new String[pa];
        BCryptHashProvider.void_b();
        aL = pb;
        aM = pc;
    }

    public static void e(NLoginType_008 NLoginType_008, boolean bl) {
        NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_203_a().a((String)BCryptHashProvider.c("㺀", (int)nt, (long)nu), NLoginCore_150.aC());
        if (!bl) {
            NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_203_a().a((String)BCryptHashProvider.c("㺃", (int)nv, (long)(nw ^ nx)), Optional.ofNullable(NLoginType_008.com_nickuc_login_NLoginCore_495_a()).map(NLoginCore_523::a).orElse(0L)).a((String)BCryptHashProvider.c("㺆", (int)ny, (long)nz), BCryptHashProvider.com_nickuc_login_NLoginCore_036_b().name().toLowerCase(Locale.ENGLISH));
        }
    }

    @Generated
    public static Pattern java_util_regex_Pattern_a() {
        return var_java_util_regex_Pattern_h;
    }

    private static String a(int n, long l) {
        l ^= 0x10L;
        l ^= 0x5596FCACB4416EB1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(57 + 12), (byte)(9 + 74), (byte)(14 + 33), (byte)(40 + 27), (byte)(27 + 39), (byte)(8 + 59), (byte)(39 + 8), (byte)(22 + 58), (byte)(70 + 5), (byte)(8 + 59), (byte)(53 + 30), 53, (byte)(34 + 46), (byte)(58 + 39), (byte)(29 + 71), 100, (byte)(81 + 24), (byte)(51 + 59), (byte)(96 + 7)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҰҳҔӇҾӃҼҽҹ", (byte)55, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            BCryptHashProvider.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void aK() {
        String string = Optional.ofNullable(BedrockFloodgateHook.cH).orElse(NLoginCore_254.var_com_nickuc_login_NLoginCore_254_c.name()).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_254_a = NLoginCore_254.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺀", (int)cw, (long)cx) + string + (String)BCryptHashProvider.c("㺃", (int)cy, (long)(cz ^ da)) : (String)BCryptHashProvider.c("㺆", (int)db, (long)dc) + string + (String)BCryptHashProvider.c("㺉", (int)dd, (long)(de ^ df)), new Object[dg]);
            var_com_nickuc_login_NLoginCore_254_a = NLoginCore_254.var_com_nickuc_login_NLoginCore_254_c;
        }
        String string2 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_a.a(new Object[dh]).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_555_b = NLoginCore_555.valueOf(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺌", (int)di, (long)(dj ^ dk)) + string2 + (String)BCryptHashProvider.c("㺏", (int)dl, (long)(dm ^ dn)) : (String)BCryptHashProvider.c("㺒", (int)cfr_renamed_1, (long)(dp ^ dq)) + string2 + (String)BCryptHashProvider.c("㺕", (int)(dr & ds), (long)dt), new Object[du]);
            var_com_nickuc_login_NLoginCore_555_b = NLoginCore_555.valueOf((String)NLoginCore_370.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_a));
        }
        String string3 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_b.a(new Object[dv]).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_555_c = NLoginCore_555.valueOf(string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺘", (int)dw, (long)dx) + string3 + (String)BCryptHashProvider.c("㺛", (int)(dy & dz), (long)ea) : (String)BCryptHashProvider.c("㺞", (int)eb, (long)(ec ^ ed)) + string3 + (String)BCryptHashProvider.c("㺡", (int)ee, (long)(ef ^ eg)), new Object[eh]);
            var_com_nickuc_login_NLoginCore_555_c = NLoginCore_555.valueOf((String)NLoginCore_370.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_b));
        }
        if (var_com_nickuc_login_NLoginCore_555_b == NLoginCore_555.var_com_nickuc_login_NLoginCore_555_e) {
            BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_c, (Object)(ei != 0));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(BCryptHashProvider.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.C("щѫѭэѱҐ҈ҞҊљҗҍқҕў҃ҥҤҜҢҜѱ", (byte)36, 67), BCryptHashProvider.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.B("ĪķĶùĹĵİĹńĳĀľłĻľńĆҊҍѮҡҘҝҖҗғě", (byte)36, 66) + string + NLoginCore_091.F("Ԛ", (byte)36, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public static Pattern java_util_regex_Pattern_b() {
        return var_java_util_regex_Pattern_i;
    }

    @Generated
    public static NLoginCore_036 com_nickuc_login_NLoginCore_036_b() {
        return var_com_nickuc_login_NLoginCore_036_j;
    }

    @Generated
    public static boolean boolean_aO() {
        return aO;
    }

    private static void aL() {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.E;
        int n = NLoginCore_477.r();
        if (n <= 0) {
            BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
            NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)gu, (long)(gv ^ gw)) + n + (String)BCryptHashProvider.c("㺃", (int)(gx & gy), (long)gz), new Object[ha]);
        }
    }

    private static void d(NLoginType_008 NLoginType_008, boolean bl) {
    }

    private static void void_aO() {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.as;
        List<String> list = NLoginCore_477.b(new Object[nl]);
        list.replaceAll(string -> {
            if (!(string = string.toLowerCase(Locale.ENGLISH)).startsWith((String)BCryptHashProvider.c("㺀", (int)og, (long)oh))) {
                string = (String)BCryptHashProvider.c("㺃", (int)oi, (long)(oj ^ ok)) + string;
            }
            return string;
        });
        BCryptHashProvider.a(NLoginCore_477, list);
    }

    @Generated
    public static NLoginCore_555 c() {
        return var_com_nickuc_login_NLoginCore_555_c;
    }

    private static void aM() {
        BCryptHashProvider.a(NLoginCore_532.C, NLoginCore_532.C.b(new Object[mx]).stream().map(String::toLowerCase).collect(Collectors.toList()));
        BCryptHashProvider.a(NLoginCore_532.D, NLoginCore_532.D.b(new Object[my]).stream().map(NLoginCore_065::m).collect(Collectors.toList()));
    }

    @Generated
    public static NLoginCore_254 com_nickuc_login_NLoginCore_254_a() {
        return var_com_nickuc_login_NLoginCore_254_a;
    }

    @Generated
    public static NLoginCore_555 com_nickuc_login_NLoginCore_555_b() {
        return var_com_nickuc_login_NLoginCore_555_b;
    }

    private static void void_aN() {
        String string = NLoginCore_532.al.a(new Object[mz]).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_175_a = NLoginCore_175.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺀", (int)na, (long)nb) + string + (String)BCryptHashProvider.c("㺃", (int)nc, (long)nd) : (String)BCryptHashProvider.c("㺆", (int)ne, (long)(nf ^ ng)) + string + (String)BCryptHashProvider.c("㺉", (int)(nh & ni), (long)nj), new Object[nk]);
            var_com_nickuc_login_NLoginCore_175_a = NLoginCore_175.valueOf((String)NLoginCore_532.a(NLoginCore_532.al));
        }
    }

    private static void j(NLoginType_008 NLoginType_008) {
        YamlConfiguration yamlConfiguration;
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        ArrayList<Pattern> arrayList2 = new ArrayList<Pattern>();
        NLoginCore_370.var_com_nickuc_login_NLoginCore_329_g.a(new Object[ej]).forEach(string -> {
            try {
                arrayList.add(Pattern.compile(string));
            }
            catch (PatternSyntaxException patternSyntaxException) {
                NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)os, (long)(ot ^ ou)) + string + (String)BCryptHashProvider.c("㺃", (int)ov, (long)(ow ^ ox)), new Object[oy]);
            }
        });
        NLoginCore_370.var_com_nickuc_login_NLoginCore_329_j.a(new Object[ek]).forEach(string -> {
            try {
                arrayList2.add(Pattern.compile(string));
            }
            catch (PatternSyntaxException patternSyntaxException) {
                NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)(ol & om), (long)on) + string + (String)BCryptHashProvider.c("㺃", (int)oo, (long)(op ^ oq)), new Object[or]);
            }
        });
        var_java_util_List_java_util_regex_Pattern__r = arrayList;
        var_java_util_List_java_util_regex_Pattern__s = arrayList2;
        aL = BCryptHashProvider.a((String)BCryptHashProvider.c("㺀", (int)(el & em), (long)en), NLoginCore_370.var_com_nickuc_login_NLoginCore_329_f);
        aM = BCryptHashProvider.a((String)BCryptHashProvider.c("㺃", (int)(eo & ep), (long)eq), NLoginCore_370.var_com_nickuc_login_NLoginCore_329_i);
        String string2 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e.a(new Object[er]).trim();
        String string3 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h.a(new Object[es]).trim();
        BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e, (Object)string2);
        BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h, (Object)string3);
        if (aL == aM && string2.equals(string3) || string2.isEmpty() && string3.isEmpty()) {
            BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e.java_lang_Object_a());
            BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_f, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_f.java_lang_Object_a());
            BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h.java_lang_Object_a());
            BCryptHashProvider.a(NLoginCore_370.var_com_nickuc_login_NLoginCore_329_i, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_i.java_lang_Object_a());
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                NLoginCore_370.c((String)BCryptHashProvider.c("㺆", (int)et, (long)eu) + string2 + (String)BCryptHashProvider.c("㺉", (int)ev, (long)ew) + string3 + (String)BCryptHashProvider.c("㺌", (int)ex, (long)(ey ^ ez)), new Object[fa]);
            }
        }
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b && (yamlConfiguration = NLoginCore_012.a()) != null && yamlConfiguration.getBoolean((String)BCryptHashProvider.c("㺏", (int)fb, (long)(fc ^ fd)), fe != 0)) {
            Object[] objectArray = new Object[fh];
            objectArray[BCryptHashProvider.fi] = BCryptHashProvider.c("㺕", (int)fj, (long)(fk ^ fl));
            NLoginCore_370.c((String)BCryptHashProvider.c("㺒", (int)ff, (long)fg), objectArray);
            NLoginCore_370.c((String)BCryptHashProvider.c("㺘", (int)fm, (long)(fn ^ fo)), new Object[fp]);
        }
    }

    public static void a(KeyPair keyPair) {
        var_java_security_KeyPair_b = keyPair;
    }

    public static NLoginCore_515 b(NLoginType_008 NLoginType_008) {
        return BCryptHashProvider.com_nickuc_login_NLoginCore_515_a(NLoginType_008, var_int_c != 0, d != 0);
    }

    @Generated
    public static KeyPair java_security_KeyPair_b() {
        return var_java_security_KeyPair_b;
    }

    public static String g(String string, boolean bl) {
        String string2;
        String string3 = (bl ? NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e : NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h).a(new Object[gk]);
        boolean bl2 = bl ? aL : aM;
        String string4 = string;
        do {
            string2 = bl2 ? string4 + string3 : string3 + string4;
        } while ((string4 = string4.substring(gl, string4.length() - gm)).length() > gn && string2.getBytes(StandardCharsets.UTF_8).length > go);
        return string2;
    }

    @Generated
    public static NLoginCore_175 com_nickuc_login_NLoginCore_175_a() {
        return var_com_nickuc_login_NLoginCore_175_a;
    }

    @Generated
    public static String aD() {
        return cL;
    }

    private static void k(NLoginType_008 NLoginType_008) {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.ab;
        String string = NLoginCore_477.a(new Object[hb]).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.b(string);
            if (!var_com_nickuc_login_NLoginCore_566_a.aD()) {
                NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺀", (int)hc, (long)(hd ^ he)) + string + (String)BCryptHashProvider.c("㺃", (int)hf, (long)(hg ^ hh)) : (String)BCryptHashProvider.c("㺆", (int)hi, (long)hj) + string + (String)BCryptHashProvider.c("㺉", (int)hk, (long)hl), new Object[hm]);
                var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.valueOf((String)NLoginCore_477.java_lang_Object_a());
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺌", (int)hn, (long)(ho ^ hp)) + string + (String)BCryptHashProvider.c("㺏", (int)hq, (long)(hr ^ hs)) : (String)BCryptHashProvider.c("㺒", (int)ht, (long)hu) + string + (String)BCryptHashProvider.c("㺕", (int)hv, (long)hw), new Object[hx]);
            var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.valueOf((String)NLoginCore_477.java_lang_Object_a());
        }
        BCryptHashProvider.l(NLoginType_008);
        BCryptHashProvider.m(NLoginType_008);
        BCryptHashProvider.n(NLoginType_008);
        BCryptHashProvider.a(NLoginCore_532.T, (Object)Math.max(NLoginCore_532.T.r(), hy));
        BCryptHashProvider.a(NLoginCore_532.U, (Object)Math.min(NLoginCore_532.U.r(), hz));
        try {
            var_java_util_regex_Pattern_i = Pattern.compile(NLoginCore_532.X.a(new Object[ia]));
        }
        catch (PatternSyntaxException patternSyntaxException) {
            var_java_util_regex_Pattern_i = Pattern.compile((String)NLoginCore_532.X.java_lang_Object_a());
        }
    }

    public static NLoginCore_515 a(NLoginType_008 NLoginType_008) {
        return BCryptHashProvider.com_nickuc_login_NLoginCore_515_a(NLoginType_008, var_int_a != 0, var_int_b != 0);
    }

    public static boolean c(String string, boolean bl) {
        boolean bl2;
        String string2 = (bl ? NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e : NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h).a(new Object[gr]);
        boolean bl3 = bl2 = bl ? aL : aM;
        if (string2.isEmpty()) {
            return gs != 0;
        }
        if (string2.length() >= string.length()) {
            return gt != 0;
        }
        return bl2 ? string.endsWith(string2) : string.startsWith(string2);
    }

    public static void a(NLoginCore_370 NLoginCore_3292, Object object) {
        NLoginCore_525.a(NLoginCore_3292, (NLoginCore_208)NLoginCore_3292.java_lang_Object_a(), object);
    }

    private static void h(NLoginType_008 NLoginType_008) {
        File file;
        NLoginCore_219 NLoginCore_2192 = NLoginType_008.com_nickuc_login_NLoginCore_219_a();
        String string = NLoginCore_2192.a(BCryptHashProvider.c("㺀", (int)ae, (long)(af ^ ag)), NLoginCore_2192.a(BCryptHashProvider.c("㺃", (int)ah, (long)ai), (String)BCryptHashProvider.c("㺆", (int)aj, (long)(ak ^ al))));
        if (!string.endsWith((String)BCryptHashProvider.c("㺉", (int)am, (long)an))) {
            string = string + (String)BCryptHashProvider.c("㺌", (int)ao, (long)ap);
        }
        if ((file = new File(NLoginType_008.java_io_File_c(), (String)BCryptHashProvider.c("㺏", (int)aq, (long)(ar ^ as)))).exists()) {
            String[] stringArray;
            File file2 = new File(file, string);
            File file3 = new File(NLoginType_008.java_io_File_c(), (String)BCryptHashProvider.c("㺒", (int)at, (long)(au ^ av)));
            if (!file3.exists() && file2.exists() && !file2.renameTo(file3)) {
                NLoginCore_370.d((String)BCryptHashProvider.c("㺕", (int)(aw & ax), (long)ay) + string + (String)BCryptHashProvider.c("㺘", (int)(az & ba), (long)bb), new Object[bc]);
            }
            if ((stringArray = file.list()) != null && stringArray.length == 0 && !file.delete()) {
                NLoginCore_370.d((String)BCryptHashProvider.c("㺛", (int)bd, (long)(be ^ bf)), new Object[bg]);
            }
        }
    }

    @Generated
    public static boolean boolean_aN() {
        return aN;
    }

    @Generated
    public static byte[] e() {
        return var_byte_arr_j;
    }

    @Nullable
    public static String h(String string, boolean bl) {
        boolean bl2;
        boolean bl3;
        String string2 = (bl ? NLoginCore_370.var_com_nickuc_login_NLoginCore_329_e : NLoginCore_370.var_com_nickuc_login_NLoginCore_329_h).a(new Object[gp]);
        boolean bl4 = bl3 = bl ? aL : aM;
        if (string2.isEmpty()) {
            return null;
        }
        if (string2.length() >= string.length()) {
            return null;
        }
        boolean bl5 = bl2 = bl3 ? string.endsWith(string2) : string.startsWith(string2);
        if (!bl2) {
            return null;
        }
        int n = bl3 ? gq : string2.length();
        int n2 = bl3 ? string.length() - string2.length() : string.length();
        return string.substring(n, n2);
    }

    @Generated
    public static List<Pattern> l() {
        return var_java_util_List_java_util_regex_Pattern__s;
    }

    private static void m(NLoginType_008 NLoginType_008) {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.ad;
        int n = NLoginCore_477.r();
        if (n < 0) {
            BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
            NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)(jl & jm), (long)jn) + n + (String)BCryptHashProvider.c("㺃", (int)jo, (long)(jp ^ jq)), new Object[jr]);
        }
    }

    static NLoginCore_515 com_nickuc_login_NLoginCore_515_a(NLoginType_008 NLoginType_008, boolean bl, boolean bl2) {
        Object object;
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        NLoginCore_219 NLoginCore_2192 = NLoginType_008.com_nickuc_login_NLoginCore_219_a();
        if (!NLoginCore_2192.r()) {
            object = NLoginCore_195.a(NLoginType_008, NLoginCore_2192, (String)BCryptHashProvider.c("㺀", (int)e, (long)f), bl);
            if (!object.aQ()) {
                return object;
            }
        } else if (!bl2 && !NLoginCore_2192.X()) {
            return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_b;
        }
        if (!NLoginCore_2192.Z()) {
            return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_b;
        }
        NLoginCore_525.a(NLoginCore_532.values(), NLoginCore_532.var_com_nickuc_login_NLoginCore_208_h, NLoginCore_2192);
        if (NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_227_a().n() == g) {
            object = new NLoginCore_219((String)BCryptHashProvider.c("㺃", (int)var_int_h, (long)var_long_i), new File(NLoginType_008.java_io_File_c(), (String)BCryptHashProvider.c("㺆", (int)var_int_j, (long)(k ^ l))));
            if (!((NLoginCore_219)object).r()) {
                NLoginCore_515 NLoginCore_5152 = NLoginCore_195.a(NLoginType_008, (NLoginCore_219)object, (String)BCryptHashProvider.c("㺉", (int)(m & n), (long)o), bl);
                if (!NLoginCore_5152.aQ()) {
                    return NLoginCore_5152;
                }
            } else if (!bl2 && !((NLoginCore_219)object).Z()) {
                return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_b;
            }
            NLoginCore_525.a(NLoginCore_370.values(), NLoginCore_370.var_com_nickuc_login_NLoginCore_208_i, (NLoginCore_219)object);
        }
        BCryptHashProvider.c(NLoginType_008, p != 0);
        BCryptHashProvider.h(NLoginType_008);
        BCryptHashProvider.i(NLoginType_008);
        BCryptHashProvider.aK();
        BCryptHashProvider.j(NLoginType_008);
        BCryptHashProvider.aL();
        BCryptHashProvider.k(NLoginType_008);
        BCryptHashProvider.aM();
        BCryptHashProvider.void_aN();
        BCryptHashProvider.void_aO();
        BCryptHashProvider.aP();
        BCryptHashProvider.d(NLoginType_008, bl2);
        BCryptHashProvider.e(NLoginType_008, q != 0);
        BCryptHashProvider.void_a(NLoginType_008, bl, bl2);
        BCryptHashProvider.f(NLoginType_008, bl);
        NLoginCore_370.b((String)BCryptHashProvider.c("㺌", (int)var_int_r, (long)(var_long_s ^ t)) + NLoginCore_2702.h() + (String)BCryptHashProvider.c("㺏", (int)u, (long)v), new Object[w]);
        return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_a;
    }

    public static void a(NLoginCore_532 NLoginCore_477, Object object) {
        NLoginCore_525.a(NLoginCore_477, (NLoginCore_208)NLoginCore_477.java_lang_Object_a(), object);
    }

    private static void void_b() {
        int n;
        var_long_c = -3574778677023661562L;
        long l = var_long_c ^ 0x5596FCACB4416EB1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(54 + 15), (byte)(45 + 38), (byte)(21 + 26), (byte)(46 + 21), (byte)(65 + 1), (byte)(31 + 36), (byte)(18 + 29), (byte)(22 + 58), (byte)(68 + 7), (byte)(10 + 57), (byte)(29 + 54), (byte)(27 + 26), (byte)(40 + 40), (byte)(29 + 68), 100, (byte)(57 + 43), (byte)(94 + 11), (byte)(100 + 10), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(29 + 40), 83}, StandardCharsets.UTF_8));
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
                    BCryptHashProvider.var_java_lang_String_arr_b[0] = NLoginCore_451.C("ՀփՁՂշ֊չգտթծՎջցէ֑քժժֈՠձ՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[1] = NLoginCore_324.B("ǚƶƔƙǉǠǘǀƺǗƟǙƳǇƽƨƞǖƩǍǏǟƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[2] = NLoginCore_201.E("֢֗բբ֤ժվ֭֠խհն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[3] = NLoginCore_092.A("ǑƛƳǖǠƴǣơƢƜƜƱƟǗƻǟǍǅǦƺƦǚǢǴǉǝǞǸǶǑǢǏ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[4] = NLoginCore_387.E("յ֧֙֊ա֩է֤կքհիֵ֝֌ֳ֫֏֍ձ֋֎ֳ֮֠֏ֳտֻ֖֠տֽ֪֚׊׌ִ֥֮֟֘׃֖", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[5] = NLoginCore_138.C("ԺՐաեՙշ՚ն՞ջռՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[6] = NLoginCore_384.A("ǙƪƾƑǉƴƷǑǟƲƲƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[7] = NLoginCore_138.D("ցՒզԹձ՜՟չև՚՚Փ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[8] = NLoginCore_027.D("ՓենյցՖՊփ՝ր֏՗՟իպիյլ֒զխ֐ջհ֛Փֆ֗ռ՚ց֙֟ջ֖֚֓ՠ֦բ֔֜֡զ֡հ֭֞խ֌֠ֆ֪ցվտ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[9] = NLoginCore_091.C("խՂսԿտՁգբֆՆՇՊտքՑՒ՜ալ֔Պո֓֜ղՕղ֒՚ծտ֣֖֥՜ջ֨ոտշչ֞զ֎֩էֲ֦֢֟֞֨֎ցվտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[10] = NLoginCore_138.A("ƵǓƛƛƬǘǌǋǘǎǜƻƱǪǆƺƽƾǃƧǬǟƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[11] = NLoginCore_004.E("֖֥օպ՝֖֕ը֥֠օն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[12] = NLoginCore_004.E("֖֥օպ՝֖֕ը֥֠օն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[13] = NLoginCore_027.B("ƫƽǎǍǙƮƢǛƵǘǥƺǈǒƿǃǢǋƨƿƼƹƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[14] = NLoginCore_004.F("պշ֛փճռ֩տսզ֞֠֍ֵ֪֍֔րճ֑֑֔ցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[15] = NLoginCore_324.C("բֆ՝զպմյ՜ւդէլՆցէգֈ֕լօՎՕ՘հ֒նղր֋՜՚֐", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[16] = NLoginCore_223.A("ǊǝƦƛƹǠǠǠƯƻǢƤǆơƨƣǣǩƸǪƿƹƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[17] = NLoginCore_384.F("օ֩ր։֝֗֘տ֥և֌֢ե֥կ֍ָ֑֯֘֯ք֏պոֳչֿ֯֐֎֦֦ևׇ֩օָֿ֠׆֍֋ֲֲֻ֣֝׋ׄ֯ך׌֤֢֡", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[18] = NLoginCore_324.F("֏չթՠ֡֗օ֚ֆ֤֌֪֬֨կ֭֔֌֣նյ֪֭չշոַֻׂ֏ִׅ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[19] = NLoginCore_201.E("֑ֈփ֗իմ֌֢֛֮֯֏ցձփ֖֒ծ֙֙֨քցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[20] = NLoginCore_091.D("Ցՠէտֆ՗՝ՈաՄֈՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[21] = NLoginCore_004.E("օքպյ֛֗ֆ֧ժ֘֬֎ցִ֦տִ֨֐ֹ֯֌։ֹ֎ֶ֑֪֑֥֩֒փ֒֠։ֶַּ֖אֆ׏֖", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[22] = NLoginCore_575.D("լՖՆԽվմբշգցթ։ևօՌ֊ձթրՓՒև֊ՖՔՕ֟֘֔լ֢֑", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[23] = NLoginCore_324.B("ƔǍǎǎƴǌƠǖǙǒǀǡǞƺƣǉƬǡǛƸǏǨưǐƦǉǟƩǅǎǪǍǔǫƶƽǗǹƼƾǵȁǔǡǥǖǤǨȌǅǶȋǿȏǖǗ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[24] = NLoginCore_384.B("ƳưǕǉǙƽƽƷƖǡƹǕǝǂƶǧǪǧǨǡƹǯƽǏǃƿǈǖǲƲǗǫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[25] = NLoginCore_324.C("կ՗կքվն։ւոՕՀհցփրՍռւզՍժ։֒֕պ֑֌֜ս֊պ֎Ֆճ֦վ֖֣֔վչ֦֩լտծ֠ծ֋ծ֪֟փ֑վտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[26] = NLoginCore_384.B("ǐƚƳǕǋǒǘƷǍǥǟơƹƤƴƼǠǫǊǰƭǉƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[27] = NLoginCore_027.D("ոՂ՛սճպր՟յ֍ևՉաՌ՜դֈ֓ղ֘Օձ՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[28] = NLoginCore_110.E("ձվբրև֊֊ֈ֗կ֪֫ս֑օ֩նֵ֛֭֔քցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[29] = NLoginCore_446.A("ƦƳƗƵƼƿƿƽǌƤǠǟƲǆƺǞƫǉǪǐǢƹƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[30] = NLoginCore_453.D("՝ՁՀՄՄզ՗տ։ՙՊչՏ֐֓թՏդդ֒֏փ֘՚խ֖Ր֓ց֞֊ծցխպբք։ը֧֚֊֚֮֯ձւֳָ֑֢֟֠֡հֺ֖֮֋ֳ֬֘־վ֬֏փ׆֥׃׋֣ֆֹׂ֛֛֙ד׃֋דֱ׉ֵ׏֕י֫גַֺׁח֭׌", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[31] = NLoginCore_446.F("֏չթՠ֡֗օ֚ֆ֤֌ջղ֊֦ձ֑շ֩ֈְ֊֦սֻ֊ֶֹպ֌փ֏", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[32] = NLoginCore_387.D("ծեՠմՈՑթ֌տո֋լ՞ՎՠկճՋննօա՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[33] = NLoginCore_091.F("մփ֊֢֩պրիքէ֫ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[34] = NLoginCore_451.B("ƷƩǐƑƾǡƔƷƺǤưƥǘǇǖǠƿǁǋƥƺƣǜǦǌǁǪǎǥǧǧǴǔǓǲǚǝǮǘƺǐǼǆǠǙǦȋǼȁȋǯǎȁǩǖǗ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[35] = NLoginCore_575.A("ƭƼǏƶƸƗƭƶƛǡƺǟƥǠǤǫǌƨǉǁǛǉƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[36] = NLoginCore_387.D("ծեՠմՈՑթ֌տո֋լ՞ՎՠկճՋննօա՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[37] = NLoginCore_324.E("մփ֊֢֩պրիքէ֫ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[38] = NLoginCore_575.C("խբանՐՠմՕ՜ՍՖֆ֊թ֍ՠցՇֈ֖ՠժ֋֑ծ֗֍՝վ՟ՙ֚֌չ֗զ֢֖֞֨գէնճ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[39] = NLoginCore_201.F("ոև֚ցփբոցզ֬օ֪հֶ֫֯֗ճ֔֌֦֔ցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[40] = NLoginCore_173.E("֑ֈփ֗իմ֌֢֛֮֯֏ցձփ֖֒ծ֙֙֨քցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[41] = NLoginCore_091.D("Ցՠէտֆ՗՝ՈաՄֈՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[42] = NLoginCore_384.D("խբանՐՠմՕ՜ՍՖֆ֊թ֍ՠցՇֈ֖ՠժ֋֑ծ֗֍՝վ՟ՙ֚֌չ֗զ֢֖֞֨գէնճ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[43] = NLoginCore_559.F("֢֗բբ֤ժվ֭֠խհն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[44] = NLoginCore_559.D("ռՠվ՗րցՈ՜լՊՉՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[45] = NLoginCore_092.B("ƥƬƹƮǊƴƪơǁǂƣǁǨƱǒǪƹǄƶǛǡƯǝǛǌǇǮǠǇǮƶǑǝǲǲƹǬǻǽǶȀǃǚǾǀǵǜǞǧǾǮǮǐǰȒǑǓȔǩȔǏȌǱȇǎȕǲȚǮȞȓȄȔǤȂǫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[46] = NLoginCore_110.B("ƳǜǖƶƲǓƾƾƳǎǘƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[47] = NLoginCore_110.A("ƴƼƧǠǜǋƵƵƝǤƥƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[48] = NLoginCore_384.E("ս֦րտոետթտօ֎ձ֢ր֝ր։֏֨լ֭֜֩ոձּ֐֢֑֓֗ւ׆֥ր֕׀փ֪֥֮׆ֺׅ׏ג֍ֱׇ׍֢֐ה֛׏ׇׇזםט֮׎־֘ןֳּ֪֨׭ע֧לְֶ֭", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[49] = NLoginCore_575.E("ֆ֢֒ժ֟զ֥ր֧֘ծռեֹ֪֖֧֠չլ֜֗֌֖֏ׁտ֘ջտռտ֧օ֔ֈ׉ַ֨֡֎֝׍׋ְ֟֋ְ֑֩֯֫ךֽ֛ם׊זִָֽׁ֢֥֧֚֜טָּֽׂק֬קֶ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[50] = NLoginCore_575.D("՚փ՝՜ՕՂ՜Ն՜բիՎտ՝պ՝զլօՉչ֊ֆՕՎ֙խտհծմ՟֣ւ՝ղ֝ՠև֋ւ֣֢֗֬֯ժ֤֎֪տխֱոֳֵֺ֤֤֬֋֛֫յּօ֐֙և׊ֿքֹ֊֍֓", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[51] = NLoginCore_027.C("ճՓՎՇսվ՚՗էվ՟ՠՍ՞՞֍տլր֐֍Փզխ֚ղ՝֐֑աւլռ֥֕էպռր֖֚֬ժչ֛և֩֒խֈַ֮ժֲ֢֜օկְֹ֖֬֝֡֘ׄփֳִֺֽ֡֝օ֎ֽׁ֮֎։֮׎׌ֶ׉ׇ֖֛֗֯֯נחֱֶּלֳֿ֝׀׃ץץֵ׉ֳֺ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[52] = NLoginCore_201.A("ƘƜǉǛƚƗƱǀƝǞƾƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[53] = NLoginCore_027.A("ƜƳưǉǞƛǓǂƛǕǤƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[54] = NLoginCore_451.C("ւվփՂՙզՓ֊֍յտբց՚ւց֔ճճւչղդջ֗վպ֙՞֏Ք֞", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[55] = NLoginCore_559.C("Հ՟՞ՖօշՖդ՛չ֏ցՂֈօ՛եզ֕հշ֗՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[56] = NLoginCore_427.A("ƮǇǑƛƳǏǊǠƛǖǤǕǥƠǪƫǠǩƶǯǇưǭǩǁǭǓǂƴǥƷƴ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[57] = NLoginCore_027.D("՟Ճ՚դհֆՕՖքըՎՠըՍ՞ազճձ֑խցծ֐Ֆռ֋֒Ւ֐վ֤֓֞֝֔ևբն֩ժոէ֐֯րս֜րճ֗֫ն֋ձְռֳֶָ֦־׃ַָ֥֠֟ֆ֥־ֺ֮֟֠֓", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[58] = NLoginCore_004.B("ǐƯǉƬƿǗƴǁǞƿǐƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[59] = NLoginCore_223.B("ƯƜƽǒƗǠƹǀǝƥƞƦǑƴǒǥƧǤƬǡǙƯǜǐǎƮǦǶưǬƶǐǦǖǴǸƹǼǲȁǐǣǰǋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[60] = NLoginCore_076.F("՟֘֙֙տ֗ի֤֡֝֋֬֩օծ֔շ֦֬փֶ֚֜։ֵֈַָּֿ֛֛֞֡֟֗׆֟֌׋օ֌־׎֌֜֯׉חֵ׏֤בך֢֡", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[61] = NLoginCore_384.C("Ցՠէտֆ՗՝ՈաՄֈՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[62] = NLoginCore_091.E("չֆր֜֨յօ֪֟֘փ֒ֆսִլթ֪֑֯պֲ֩֨֫֩֘֫֓նշ֠֐ֹ֜ցׁ׌ַ׆׊֥׃֡֜֎֭֮֡׈יב֔טֵַֺֺ֜יכנאֳֳַי׆ץ׌צ֮׃֩׉ֶ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[63] = NLoginCore_451.C("՗ՄեպԿֈաըօՍՆՎչ՜պ֍Տ֌Ք։ց՗քոնՖ֎֞՘֔՞ո֎վ֜֠ա֤֚֩ո֋֘ճ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[64] = NLoginCore_451.A("ǆƽƸǌƠƩǁǤǗǐǣǄƶƦƸǇǋƣǎǎǝƹƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[65] = NLoginCore_092.A("ƩƸƿǗǞƯƵƠƹƜǠƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[66] = NLoginCore_091.C("Ֆգ՝չօՒբևռյՠկգ՚֑ՉՆև֌ծ՗շնը֓ս֟֙պցՙ՛֡ձո֠ոևռ֥֟֞֘֘֟֞դևփֈկ֖֑֭վտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[67] = NLoginCore_223.B("ƯǅƝǠƮǙǍǒƲƶƾǏǩƟǩƿǙǪǗƬǩǒǌǲưǩǁƩǒǴǌǧƻǲǘǠǚǏƸǹǑǶǓȃȅǹǦǄȈȌǧȏȋȍǻǽȓǥǬǮǭȄȓȕǕǨǹȒȈǼǝǜǮțǜǸșǟǴȝǸȫȆǾǫȤȝǿȫȡȦȭǵȎșȕȷȼȇȾȔșȿǻǿȸȁȋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[68] = NLoginCore_223.F("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[69] = NLoginCore_384.B("ƯǅƝǠƮǙǍǒƲƶƾǏǩƟǩƿǙǪǗƬǩǒǌǲưǩǁƩǒǴǌǧƻǲǘǠǚǏƸǹǑǶǒȂǵǪǛǨǆǗǋǆǹȆȒǢǰǟǩǶǮȕǱǒǔǮȊȋȞȞȣǣȄȘȇȅȔǡǹȩȍǥǪȇȱǿȲȁȤȤȲȀȀȩșȃ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[70] = NLoginCore_223.B("ǐƯǉƬƿǗƴǁǞƿǐƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[71] = NLoginCore_138.D("բֆ՝զպմյ՜ւդզհՏգֆ՛ֆւՖղիպջ֛հֆչժ֚֜խն՝հ֠֏ձփբտ֛֢չֱ֡֩կ֟ժ֪֪ֈփ֒֎յ֧֕֕ջֳֵֹֿ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[72] = NLoginCore_451.C("ջ՟՝ֆւդճթ՛զքՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[73] = NLoginCore_575.E("֢֘վ֦րջո։֠կ֛ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[74] = NLoginCore_173.A("ƦƺǐǉǋƶǚǒƛƝǐƙǜƩǥǢƻǬǈǬƹǎƪƥǆǔǢƳǭƸƶƸ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[75] = NLoginCore_223.E("՞֐֪֜֨և֡ջևռ։ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[76] = NLoginCore_092.E("պ֐ը֫չ֤֘֝սց։֛֏ֆվְ֞֔նֲֲ֕֫ևִַռֵ֣֠֔օտֽ֗־ֻּֿׁ֜ֆ֬׍־ד֢׉ט׊ֳ֭דּ֑֓֗׏ֳּ֬֙בֺא֣תַמט֟לֶֺֻֽ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[77] = NLoginCore_138.F("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[78] = NLoginCore_223.E("պ֐ը֫չ֤֘֝սց֌հւզ֥֌ֲ֘օֈխծֲָ֯֊ׂ֠֟֜֙־֗ւֹּ֙օ׆׍֙֊ג֐ֵ֦֮֫֟֔יֹ֙֒֜הֳ֕ב׌ְֱֺ֯ןֳָמחַׁי֫ץרק׆ׄבׁ׊ב׊ךׇ׸ר׶׳דָס׹ׁ׎ןמׂ׿ור؃ֿׅךױיז", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[79] = NLoginCore_110.E("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[80] = NLoginCore_138.B("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƣǧǭǤƿǕǔǷǑǎǳǌƷǱǎǮƺǻȂǎƿȇǅǛǣǠǔǪǉȎǎǇǊȇȀȇȀǦǫȄȋǚǒǚȜțǛǱǬȞȚǰǱǿȦǢǳǹǫȅǾȜȐȢȪȨǲǲȶȦȱȵȳȐǲȥȞǸȨȘȖȒȃǺȦȅȋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[81] = NLoginCore_223.E("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[82] = NLoginCore_027.A("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƩǁƥǬǏǷǠǲǯǚǥǏƳǽǳǪǚǫǶǑǛǺȀǖǠǵǗǣǨȈǏȂȊǤǓǋǟǢǣȍǕȏȏǻȝǪǽǜǗǴțȀǤȠǺǴǷȇȖȝȡȈǫȩȟǶǷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[83] = NLoginCore_223.F("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[84] = NLoginCore_201.D("՗խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֡֗չ֍ի֫ց֎մ֥յքֳչ֊֏֊ְֿ֕֬֙֏֍׀ָ֓֞׋ֿ֌֦֫֜֜֟בׂׂ׋֬֯׎֪֙׊׌ֱַֹּׁ֖֛֝מס׏ּ֥ט֝׬ֳֶ֭", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[85] = NLoginCore_223.E("ձ֙վւ֜֔֎֍֊֘֟ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[86] = NLoginCore_575.B("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƩǁƥǬǏǷǠǲǯǚǥǏƳǽǳǪǚǫǶǑǛǻƾƾǹǺȁǂǆȅǜǎǟǼǅǤǿǮǎǲǤǫǒȘǘǮǖǩǠǵȜǤǟȕǱȝȃȝȞǹǥȏǿǩǽȂȞȆȴȃȢȶǹȓǲȐȎȏȾǲǷȶɃǿȝȴȋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[87] = NLoginCore_384.A("ƦǎƳƷǑǉǃǂƿǍǔƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[88] = NLoginCore_559.E("պ֐ը֫չ֤֘֝սց֌հւզ֥֌ֲ֘օֈխնָպְ֌־ּ֡־րռ֚֡֗֡֗֞֡֕׌֏ֲׅ־֪֮֯׏֔֗׃ֹ֤׆ֺֽ׊ע֚אל֟חי׀ֺסנ֧֧֬׀׈׌ב׀שׇף֭זדצץׯֳ׈׼׳ן؀ױֿ־׃׶א׻׹ם׭׉׋؇׎ױז", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[89] = NLoginCore_223.D("ո՗ձՔէտ՜թֆէոՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[90] = NLoginCore_427.A("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƫǭƯǥǁǳǱǖǳƵƱǖǌǖǌǓǖǊǏȁǄǺǧǳǣǤǟȄǉǌǸǮǢǜǍǥȄǬǵȋǸȔǶǨǺțǲǷȏȕȁȥȄȧȇǼǛȁțȕȆǪǺǻǱȤȲȅȂȒȓȳȬȨȤǮȹȪǱȉȭȝǺɀȗɀȋ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[91] = NLoginCore_076.F("֛պ֔շ֊֢տ֌֩֊֛ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[92] = NLoginCore_091.A("ƺǞƵƾǒǌǍƴǚƼƾǈƧƻǞƳǞǚƮǊǃǐǧƽǐǪǇǪǪƷǆǙǑǉƶǷǯǖǀƾǺǚǦǳǚǣǈǆǼǄǬȎȐǼǤǞǜǨȈǴǤǮȇǳ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[93] = NLoginCore_201.A("ǓƷƵǞǚƼǋǁƳƾǜƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[94] = NLoginCore_223.B("ǍǗƳǛƵưƭƾǕƤǐƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[95] = NLoginCore_201.C("Լց՘ճ՜ՙՄգյչվևֆղժղվքըՏբք֚Ւ՛ձ֍֠ՠ֣֤֚", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[96] = NLoginCore_324.C("Իխչևօդվ՘դՙզՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[97] = NLoginCore_223.A("ƻƨǞƙǈƪƪǝǠƠƣƣǣǦǫǡǫǣƺǯǈǄƭǇǀƯǊǎƸƹǯǸǈǏǞǇǏƺǍǚǳǟǖǆǿǵǵǼǾǇǙȂȄȈǨǾȌȆǨǗǠǯȈǧ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[98] = NLoginCore_201.A("ƒǝǆƳǔƶƛǒƺưǔǣƠƽǦơƪǤǀǞƾǒƩǭƱưǲƭǦǔǺƷǷƼǜǸȁǉƺǘȁǔǆǽǝǴǝȊƾȄǆȐǽǮǽȋȊǦȊȍǲșȒǩǦȖǔǴȋǵȚȢȔȐȝȞȩȄȊǪȉȧȜǡȚǨǾȏǪȪȥȆȹȑȩȦ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[99] = NLoginCore_446.E("֜֙՛րէփ֤֮շ֏֋թ֎֢տ֌ִմַ֖֪֮ցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[100] = NLoginCore_453.A("ƲƮƱƝƨǙƪƢƳǡǆǀƶƢơǓƣǌǛƼǑǚǥǦƴǅǧǢǅǳǵǗǗǒưǗƶǢǲȀǶǥǼǋ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[101] = NLoginCore_138.B("ƩƸƿǗǞƯƵƠƹƜǠƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[102] = NLoginCore_453.F("֨ք֦մըմշր֬ֆթկտխց֩կ֕ղ֣֒֕օ֌ձֲ֪֔֯֒֐ւִֹׂׂ֜փֶ֯֝׀֐֖", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[103] = NLoginCore_027.D("ւվփՂՙզՓ֊֍յս՚կփաֈը֊էղ֙ՐօՓ֘֏վը֖վ֍ն՞օ֛֛դգճ֩֍֤֕ճ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[104] = NLoginCore_384.C("՟ՑռըզԿզՂգՍ֊ֈթքՉլխ֒հֈր։Փկկՙ֑չ֛֓նյ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[105] = NLoginCore_324.C("փոՖՏՁռՖՄն֍։ըտդ֓փց֑ւՠքև՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[106] = NLoginCore_091.D("ՑՂզՓ՟ՇՒճորՀ՘քվ֑զժխհՍզձ՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[107] = NLoginCore_384.A("ƫƽǎǍǙƮƢǛƵǘǥǒƱǢƣǠǙǥǣǡǍǉƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[108] = NLoginCore_173.E("ց֙վև֙֝֟լւ֐֣ն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[109] = NLoginCore_453.C("՞ն՛դնպռՉ՟խրՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[110] = NLoginCore_027.D("ւվփՂՙզՓ֊֍յտ՗իտօջփֈ֊փք֊էՙՖՏլշ՟խ֚ջ֚֚զ֝վյ֧֛֩ժթ֘կ֢ցֳ֕քտ֒֌ցվտ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[111] = NLoginCore_027.A("ƩǓƭƷƫǖƠƱƼƱǀƷǨơǗǝǘƭƻǐǑǁƯƻǍƵǡǩǑǱǨǐǋǊǐǍǖǻǣǺǌǿȁǑȄǙǿǃȌǿȅǈǟǩǖǗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[112] = NLoginCore_324.C("ւվփՂՙզՓ֊֍յտ՗իտօջփֈ֊փք֌չդ֚֝֌֘֐վփ֍֛՝՝ր֤֗֠փդ֛֬սրձ֤ծֳ֧֕֩֓֒վտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[113] = NLoginCore_138.B("ƩǓƭƷƫǖƠƱƼƱǀƷǨơǗǝǘƭƻǐǑǁƯƻǍƵǡǩǑǱǨǐǋǊǐǍǖǻǣǺǌǿȁǑȄǙǿǃȌǿȅǈǟǩǖǗ", (byte)114, 66);
                    continue block7;
                }
                case 1: {
                    BCryptHashProvider.var_java_lang_String_arr_b[0] = NLoginCore_453.B("ƘǛƙƚǏǢǑƻǗǁǏǦƿƹƩǟƿǇƩƻƺƱǒǲǕǱǃǉǩǑǚƭ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[1] = NLoginCore_384.D("ւ՞ԼՁձֈրըբտՈ։։աՈգ֔ևՓհզձ՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[2] = NLoginCore_575.F("֒ո֘֫ե֖է֜֯խռֆց֭֭վ֪֦֗֎ֵքցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[3] = NLoginCore_387.F("֜զվ֡֫տ֮լխէէռժ֢ֆ֪֘֐ֱօձַ֨ռև֩֏֐ֲ׀֞ս", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[4] = NLoginCore_110.B("ƪǜǎƿƖǞƜǙƤƹƥƠǒǪǁǠǨǄǂƦǀǃǣǨǕǄǨƴǋǕǰƴƹǚǘǘƶǡǶǵǳȆǞǋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[5] = NLoginCore_384.B("ǔƫƙƶƚǀǐǏƳƷƮǖƲǤƜƦƫǧǭǇǢǟƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[6] = NLoginCore_091.D("գՒՏ՛՝աՖշ՚ւոՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[7] = NLoginCore_451.C("օՒճէ՞րֆՈ՜պւֆւր՝թՑ֔իօբա՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[8] = NLoginCore_324.A("ƫƽǎǍǙƮƢǛƵǘǧƯƷǃǒǃǍǄǪƾǅǨǓǈǳƫǞǯǔƲǙǱǷǓǮǫǲƸǾƺǬǴǺȃǑǙǜǝǭȆǜǦǂȏǖǗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[9] = NLoginCore_004.C("խՂսԿտՁգբֆՆՇՊտքՑՒ՜ալ֔Պո֓֜ղՕղ֒՚ծտ֣֖֥՜ջ֨ոտշչ֞ը֥֩ը֋ִք֫խ֥ղ֑վտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[10] = NLoginCore_173.E("ր֞զզշ֣֖֣֗֙֨ւ֭ֈ֝վֳ֊֦ֆֳ֪ցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[11] = NLoginCore_138.D("ՀՒդկձՇո՚ռժՉՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[12] = NLoginCore_091.C("ԻդԸշմգՈՓ֍ևծՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ՓենյցՖՊփ՝ր֏թրՎֈՅֆՎփֈց֗՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[14] = NLoginCore_201.C("՗ՔոՠՐՙֆ՜՚Ճչ՟֐խ՜աօՑ֋լխա՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[15] = NLoginCore_201.C("բֆ՝զպմյ՜ւդէլՆցէգֈ֕լօՎՙպժ֒՛ֆժ֒՝֣֠", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[16] = NLoginCore_201.D("ղօՎՃաֈֈֈ՗գֈ՛հվետէգևՒ֊գեգսմմվֈկ֣՛", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[17] = NLoginCore_076.D("բֆ՝զպմյ՜ւդթտՂւՌժ֌ծ֕յ֌ալ՗Օ֐Ֆ֜֌խիփփդ֤ֆբ֕֜ս֣ժզո֩ւկֲփծ֋֣փ֑վտ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[18] = NLoginCore_091.C("լՖՆԽվմբշգցթ։ևօՌ֊ձթրՓՒ֖֐ՔՖիՐ֌֋֐ձբ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[19] = NLoginCore_027.E("֑ֈփ֗իմ֌֢֛֣֯֫ս֢֖֠փ֥֓ֆֱֹ֪֮ձֿչְվֹֺ֔", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[20] = NLoginCore_138.E("֔֔ջ֞ֈր֎չ֊֜վև֬ևօ֏խִֶ֑֏֪ցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[21] = NLoginCore_138.F("օքպյ֛֗ֆ֧ժ֘֬֎ցִ֦տִ֨֐ֹ֯֌։ֹ֎ֶ֑֪֑֥֩֒տֵֹֺֿ֢֨׀ֻ֘׎ֱׇֿ֥֞֔׆ד׈֥ך֢֡", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[22] = NLoginCore_559.E("֏չթՠ֡֗օ֚ֆ֤֌֪֬֨կ֭֔֌֣նյְֶּ֞֒֗׀յ׀օւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[23] = NLoginCore_324.A("ƔǍǎǎƴǌƠǖǙǒǀǡǞƺƣǉƬǡǛƸǏǨưǐƦǉǟƩǅǎǪǍǔǫƶƽǗǹƼƾǵȁǓǄǠǆǩǤǅǮǨǣȄǿǖǗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[24] = NLoginCore_138.E("վջ֤֠֔ֈֈւա֬ք֠֨֍ցֲֲֳֵ֬քֺ֦ևֳ֭֩չ֍ւջ֤", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[25] = NLoginCore_091.D("կ՗կքվն։ւոՕՀհցփրՍռւզՍժ։֒֕պ֑֌֜ս֊պ֎Ֆճ֦վ֖֣֔վչ֧֚֩ը֪ը֟ծֳֵ֪֧֯վտ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[26] = NLoginCore_138.A("ǐƚƳǕǋǒǘƷǍǥǟǂǑǕǨƨǅǎǊƿǬǡƤǅǊƫǮǰǂƹǯǨ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[27] = NLoginCore_004.C("ոՂ՛սճպր՟յ֍ֆըլ՜դՍՑտֆՖ֖֗՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[28] = NLoginCore_201.F("ձվբրև֊֊ֈ֗կ֬֝֒֡կ֓ց֎ք֗֌֔ցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[29] = NLoginCore_453.D("Վ՛Կ՝դէէեմՌ֋ե֎֋՚վ֒Րլֆփձ՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[30] = NLoginCore_453.E("րդգէէ։պ֢֬ռխ֜ղֳֶ֌ղևևֲֵֻ֦ս֐ֹճֶׁ֤֑֤֭֐֝օ֧֬֋ֽ׊֭גֽבִׂ֥֔׃זׄכׅ֓בםֹ֮ז׏ֻס֡׏ֲ֦ש׈צ׮׆֩־־ץלּ׶צ֮׶ה׬ט׳חרָױֺװ׍חך؆", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[31] = NLoginCore_091.B("ǄƮƞƕǖǌƺǏƻǙǁưƧƿǛƦǆƬǞƽǥƽǭǴǑƵǳƮǥƹǬǗ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[32] = NLoginCore_384.F("֑ֈփ֗իմ֌֢֛֯֫ւ֪ւօ֒ղ֚֯փֵּ֛֛ջֻ֚֙֝֓վֹ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[33] = NLoginCore_138.A("ǗƙƝǐƬƟǋƠǑưưƳǅǃƠƣƻǠǆǡƯƹƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[34] = NLoginCore_559.E("ւմ֛՜։֬՟ւօ֯ջհ֣֒֡֫֊֌֖հօծֱ֧֗֌ְֲֲֵֹֽֿ֥֣֙֟֞֨օׇ֛֑׀֏׋֟זזז׊֢֤֢֕֡", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[35] = NLoginCore_004.E("ոև֚ցփբոցզ֬օֆտև֧֥֔օևָ֗քցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[36] = NLoginCore_201.D("ծեՠմՈՑթ֌տոֈՇՇ։գճՔհկձգ֍մ֕և֞՛մՖՓճ֟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[37] = NLoginCore_004.B("ƥǞƼƵƝƸǑƱƚǠƳǛǑƿƿƶǈǁǍǰƾǯƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[38] = NLoginCore_575.F("֐օք֙ճփ֗ոտհչ֭֩֌ְփ֤ժֹ֫փ֍ְִֺ֑֮ր֡ւռִֽ֥׊ִׇ֝֙ֈֿ֖֯֙", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[39] = NLoginCore_091.F("ոև֚ցփբոցզ֬ֈֳ֒ւ֎֫֏քֺ֛֪֕ցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[40] = NLoginCore_559.E("֑ֈփ֗իմ֌֢֛֮֯֏ւ֥֢֠֩ֆկւ֑֦֙֜յ֠ջִׁ֮֯֗", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[41] = NLoginCore_223.F("օչշ֫֕եի֯չֆհթխմք֒ղմ֫֘ձ֪ցւ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[42] = NLoginCore_575.A("ǅƺƹǎƨƸǌƭƴƥƮǞǢǁǥƸǙƟǠǮƸǂǣǩǆǯǥƵǖƷƱǲƺǪǪǕƺǢǝǤǑǹǰǋ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[43] = NLoginCore_091.C("չՀՎպճ։՟Յ՗ից՜֏հ֒՞ՌզՒժի֗՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[44] = NLoginCore_201.E("րսդէշըժ֪էխֱ֧֥֝֯յ֢֕քն֌ֺցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[45] = NLoginCore_559.F("հշքչ֕տյլ֌֍ծ֌ֳռֵ֝ք֏ց֦֬պֹֹ֦֨֗֒֫֒ցֽֽ֜֨քַ׆׈ׁ׋֎֥׉֋׀ֲ֧֩׉ֹֹֻ֛ם֜֞ןִן֚חּג׏ֲֺ֤ח֤יּּֽבֶ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[46] = NLoginCore_201.E("ս֔աէ֕ր֊֭կ։հն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[47] = NLoginCore_427.F("֦ս֣֥֦֕֜֌֦֌ըն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[48] = NLoginCore_091.A("ƲǛƵƴƭƚƴƞƴƺǃƦǗƵǒƵƾǄǝơǑǢǞƭƦǱǅǗǈǆǌƷǻǚƵǊǵƸǟǣǚǻǺǯȄȇǂǼǦȂǗǅȉǐȄǼǼȋȒȍǣȃǳǍȚȈȎȀȔȊǠȡȣȁǾǫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[49] = NLoginCore_387.A("ƻǇǗƟǔƛǚƵǜǍƣƱƚǟǕǋǜǮƮơǑǌǁǋǄǶƴǍưƴƱƴǜƺǉƽǾǝǖǬǃǒȂȀǔǥǀǞǤǠǥǆȏǲǐȒǿȋǩǲǏǑǗǭȔǫǱǮǵȓțȝȅȢǵǱǤȆȉȊǾȮȌǹȉȉǶǷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[50] = NLoginCore_446.F("ս֦րտոետթտօ֎ձ֢ր֝ր։֏֨լ֭֜֩ոձּ֐֢֑֓֗ւ׆֥ր֕׀փ֪֥֮׆ֺׅ׏ג֍ֱׇ׍֢֐ה֛׏ׇׇזםט֮׎־֘׈עללֹֻ֦ףֶ֩֬֬", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[51] = NLoginCore_427.A("ǋƫƦƟǕǖƲƯƿǖƷƸƥƶƶǥǗǄǘǨǥƫƾǅǲǊƵǨǩƹǚǄǔǭǽƿǒǔǘǮȄǲǂǑǳǟȁǪǅǠȏȆǂǺȊǴǝǇȈȄǵǹǰȜǮȑǛǹȒȌȋǵȕǝǦșȕȆǦǡȆȦȤȎȡǯȟǮȇȇǳȸȯȔȉȎȩȷȆǶȸȴȹȀȵɁȁȡȴȗȥɌɍȸȞɍɉȿȖȗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[52] = NLoginCore_384.D("պ՛Հ՚ՙֈ՟փՉզվև֏։֋րՆֈֆզյա՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[53] = NLoginCore_173.A("ưǇǞƩƸƶƟǑƾƸǂǡǘƽƸǣǋǃƿǐƭǉƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[54] = NLoginCore_427.E("֥֦֡եռ։նְ֢֭֘օ֤սַ֥֤֖֖֥֜֔սֆׂ֪֑֝տ֌֑֓քֳ׃ׅս֚׋ּ֡֝֌֖", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[55] = NLoginCore_223.B("ƘƷƶƮǝǏƮƼƳǑǧƸǒƨǟƫǖǥǞǠǚƧǀǬǔǫǎǫƸƸǓƻ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[56] = NLoginCore_223.C("ՖկչՃ՛շղֈՃվ֌ս֍Ո֒Փֈ֑՞֗կ֑֚֘խըՔ֖ՙ֏֡֓ն֕֕ճձ֝֟֊փդ֤ճ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[57] = NLoginCore_201.D("՟Ճ՚դհֆՕՖքըՎՠըՍ՞ազճձ֑խցծ֐Ֆռ֋֒Ւ֐վ֤֓֞֝֔ևբն֩ժոէ֐֯րս֜րճ֗֫ն֋ձְռֳֶָ֦־׃ַպִֿ֦֗օ֨փּׄօ֓", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[58] = NLoginCore_575.D("՞կբ՛Մփև՟ջչռՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[59] = NLoginCore_223.F("պէֈ֝բ֫ք֋֨հթձ֜տְ֝ղ֯շ֤֬պ֧֛֙չֱׁջַցֻ֛֥֢֙փָֺ֮֨׋׋ֿ֢֥֬֟֍ֵ֣֕׏ך֢֡", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[60] = NLoginCore_324.C("Լյնն՜մՈվցպը։ֆբՋձՔ։փՠշ֓չզ֒ե֜֙֕ոջվ֔ռմո֣ռթ֨բթְְ֦֘֎ժ֐֖ևնքցվտ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[61] = NLoginCore_384.A("ǗƖǘƙǜƮƴǡƠǠǙǔǓǣƽǡǚǮƶǐǃǯƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[62] = NLoginCore_575.F("չֆր֜֨յօ֪֟֘փ֒ֆսִլթ֪֑֯պֲ֩֨֫֩֘֫֓նշ֠֐ֹ֜ցׁ׌ַ׆׊֥׃֡֜֎֭֮֡׈יב֔טֵַֺֺ֜יכנאְַט֟ןן׉׆פט֨ף׳דרהֲ֨׵וב׸׺ׁׂ", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[63] = NLoginCore_446.C("՗ՄեպԿֈաըօՍՆՎչ՜պ֍Տ֌Ք։ց՗քոնՖ֎֞՘֔՞ո՛կջ֓ֆւճւթ֥եճ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[64] = NLoginCore_453.D("ծեՠմՈՑթ֌տո֋շեդզսցհմեյծՔ֐ռՕյ֘՘՟֐լ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[65] = NLoginCore_091.B("ƜǖƼǋǑƳǕƝƳǠǛǡǝƤƴǝǜƨƪǟǀƹƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[66] = NLoginCore_427.B("ƮƻƵǑǝƪƺǟǔǍƸǇƻƲǩơƞǟǤǆƯǏǎǀǫǕǷǱǒǙƱƳǹǉǐǸǐǟǔǷǶǰǳǘǐǦǉǸǕǶǽȇǿǦǼǦȏǦǓǩǶȈȇǭ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[67] = NLoginCore_446.F("պ֐ը֫չ֤֘֝սց։ִ֚ժִ֊ֵ֤֢շִֽ֝֗ջִ֌մֲֿ֝֗ֆֽ֣֥֚֫փׁׄ֜֞׎אֱׄ֏דחֲךזט׆׈מְַָֹ׏מנֳ֠ׄםדׇֹ֧֨צ֧׃פֿ֪ר׃׶ב׉ֶׯר׊׶׬ױ׸׀יפנא׶؊ה׫׼׋׍؅؈؃ז", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[68] = NLoginCore_559.C("տվչպ՝սՃՕ՗ՍռՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[69] = NLoginCore_138.D("՗խՅֈՖցյպ՚՞զշ֑Շ֑էց֒տՔ֑պմ֚՘֑թՑպ֜մ֏գ֚րֈւշՠ֡չ֞պ֪֝֒փ֐ծտճծֺ֮֡֊֘ևֽ֑֖֞֙պռֲֳ֖׆׆׋֋֬׀ּ֭֯։֡בֵ֍֒֯י֣ה׍ֲ֫ךֱֹ֯֞֠עזכ֥נלֶֺׅ׍ֳ֭", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[70] = NLoginCore_110.D("փջղՅնՀեչ֋՝ոՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[71] = NLoginCore_324.E("օ֩ր։֝֗֘տ֥և։֓ղֆ֩վ֥֩չ֕֎֝֞־֓֩֜֍ֽֿ֐֙ր֓׃ֲ֦֔օ֢־ׅ֜ׄה׌ׂ֒֍׍׍ֹֽ֦֭֫ךׂ֙וֶ֝נ׏", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[72] = NLoginCore_427.B("ƦƽƷǝƛƯƞǠƛǕƞǤƟǂƨǉǋƶǈƫƹǯƶƷ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[73] = NLoginCore_559.E("տ֕չդբ֡֍փ֍֭հն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[74] = NLoginCore_027.B("ƦƺǐǉǋƶǚǒƛƝǐƙǜƩǥǢƻǬǈǬƹǌǦǭǞǤǒǩǃǲǃǜǦǭǘƾǾǸȁȁȃǝǸǋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[75] = NLoginCore_092.F("՟֢ռտէեո֣֣֘֍ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[76] = NLoginCore_138.A("ƯǅƝǠƮǙǍǒƲƶƾǐǄƻƳǓǉǥƫǧǊǧǠƼǩǬƱǪǕǘǉƺƴǌǲǳǶǴǑǰǱƻǡȂǳȈǗǾȍǿǨǢȈǈǌǱǆȄǡǱǎǨȆǯȕȏȗǛǫȖȓȏǭǴǦǺǢȩȫȨǸȆȧȜǬȯǶǷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[77] = NLoginCore_110.C("մՖՀՀճոՠզէցՍՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[78] = NLoginCore_201.C("՗խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՋ֏֕֌էսռ֟չն֛մ՟֙ն֖բ֣֪նէ֯խփ֋ֈռ֒ձֶնկչֱ֖ղ֐֮֩֎֍֗֌ּ֕֐ִֶֻ֔֞ֈַׂׅ֣֧֧֤֮֮ׄ֡֞וׅדאְ֕־זּ֣֞֫ך׃ֽףֳַ֥׭־׆׌׈ֺ֫צׁשצ׶׬ב־ֿ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[79] = NLoginCore_091.B("ǒǕǚǚƲƸƯǝƟǤǔƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[80] = NLoginCore_027.B("ƯǅƝǠƮǙǍǒƲƶǁƥƷƛǚǁǧǍƺƽƢƣǧǭǤƿǕǔǷǑǎǳǌƷǱǎǮƺǻȂǎƿȇǅǛǣǠǔǪǉȎǎǇǊȇȀȇȀǦǫȄȋǚǒǚȜțǛǱǬȞȚǰǱǿȦǢǳǹǫȅǾȜȐȢȪȨǲǲȶȦȱȵȳȐǲȊȆȦǱȨȐȟɁɃȚȢȋ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[81] = NLoginCore_091.B("ǝǔǗƪƸƲǕƭǎƗƺƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[82] = NLoginCore_223.D("՗խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֢֨վֈ֝տ֋֐ְշֲ֪֌ջճև֊֋ֵսַַ֣ׅ֥֒քտ֜׃֨֌׉֗֫ב֏ׁ֢֤׋ְֱׂ֞֟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[83] = NLoginCore_324.C("Հ՟ճՙՑտ՟օ՚ծՅՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[84] = NLoginCore_110.C("՗խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՑթՍ֔շ֟ֈ֚֗ւ֍շ՛֥֛֒ւ֓֞չփ֡֗չ֍ի֫ց֎մ֥յքֳչ֊֏֊ְֿ֕֬֙֏֍׀ָ֓֞׋ֿ֌֦֫֜֜֟בׂׂ׋֬֯׎֪֙׊׌ֱַֹֺּ֖֛֢֝֠ףעידּֿ׎׬ֳ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[85] = NLoginCore_004.D("ՠ՟Խ՞Օյւ՛աֈքՓ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[86] = NLoginCore_451.E("պ֐ը֫չ֤֘֝սց֌հւզ֥֌ֲ֘օֈխմ֌հְַֺֽׂ֥֚֚֫վ׈־ֵֶׁ֥֦֜׆։։ׅׄ׌֍֑אׇ֧֪֙֐֯׊ֶֹֽ֙֯֝ףִֹ֣֡֫׀ק֪֯נּר׎רשְׄך׊ִ׈׍שב׿׎׭؁ׄמֽ׾ש؄؈הנ׾׫،ל׭ז", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[87] = NLoginCore_453.B("ǇǜưǙƞƛǀƹǑǂǤƫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[88] = NLoginCore_451.E("պ֐ը֫չ֤֘֝սց֌հւզ֥֌ֲ֘օֈխնָպְ֌־ּ֡־րռ֚֡֗֡֗֞֡֕׌֏ֲׅ־֪֮֯׏֔֗׃ֹ֤׆ֺֽ׊ע֚אל֟חי׀ֺסנ֧֧֬׀׈׌ב׀שׇף֭זדצץׯֳ׈׼׳ן؀ױֿ־׃חרד׊זנ؍׮؋מ׊؏؈ןפמחؔؗץؚؗסע", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[89] = NLoginCore_138.A("ƤƾǍƭƸǎƳǋǜǝƝƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[90] = NLoginCore_110.C("՗խՅֈՖցյպ՚՞թՍ՟Ճւթ֏յբեՊՓ֕՗֍թ֛֙վ֛՝ՙվմվմջվղշ֩լ֢֏֛֋֌և֬ձմ֖֠֊քյ֍ֳּ֬֔֝֠֞֐֢׃ַֽ֚֟֩׍֬׏֤֯փ֩׃ֽ֢֣֮֒֙׌ךֺֻ֪֭כהא׌טֱַ׀ֱׅ׈ׅ֩׫ֳ֥", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[91] = NLoginCore_091.E("դ֛֝ա֪շ֦֦֭֮օն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[92] = NLoginCore_076.C("բֆ՝զպմյ՜ւդզհՏգֆ՛ֆւՖղիո֏եո֒կ֒֒՟ծցչձ՞֟֗վըզ֢ւ֎֛ւ֋հծ֤լֶָ֧֔֗շևֶ֗֎ַ֒֯֒", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[93] = NLoginCore_004.C("ՑՑՆաԿՉՇըաևֈՓ", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[94] = NLoginCore_027.E("֓փդղրւ֣֖֙ֈհն", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[95] = NLoginCore_027.E("՟֤ջ֖տռէֆ֪֘֜֡֩֕֍֧֕֡֋ղօֻ֗֯շ֏֢֯֏վ֖֡", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[96] = NLoginCore_201.F("ն֐նս֖֧խռի։։ն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[97] = NLoginCore_387.B("ƻƨǞƙǈƪƪǝǠƠƣƣǣǦǫǡǫǣƺǯǈǄƭǇǀƯǊǎƸƹǯǸǈǏǞǇǏƺǍǚǳǟǖǆǿǵǵǼǾǇǙȂȄȎǐǬȆǑȒǡǸǑȏǳǽǘȉǙȟǶǡțȥǗǶǫ", (byte)114, 66);
                    BCryptHashProvider.var_java_lang_String_arr_b[98] = NLoginCore_027.F("՝֑֨վ֟ցզ֝օջ֮֟իֈֱլյ֯֋֩։֝մָռջֽոֱׅ֟ւׂև֧׃׌֔օ֣׌֑֟׈ֿ֨֨ו։׏֑כ׈ֹ׈זוֱוטֽפםֱִסֿ֟ז׀ץ׭ןכרש״׏וֵהײק֬ץ֮ײלרװ׼׀װ׶פ׶ײׁ׽ת؁׃׌؏קׂסז", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[99] = NLoginCore_004.E("֜֙՛րէփ֤֮շ֏֋֎թ֣֦֪֚֨֔֓֩֔ցւ", (byte)114, 69);
                    BCryptHashProvider.var_java_lang_String_arr_b[100] = NLoginCore_092.A("ƲƮƱƝƨǙƪƢƳǡǆǀƶƢơǓƣǌǛƼǑǚǥǦƴǅǧǢǅǳǵǗǱǲǵǩǻƷǶǴǗǙǢǋ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[101] = NLoginCore_076.D("ԺՐոԾՠոփֈյՊէ՜՜եգ֊հ֕իօբձ՞՟", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[102] = NLoginCore_384.F("֨ք֦մըմշր֬ֆթկտխց֩կ֕ղ֣֒֕օ֌ձֲ֪֔֯֒֐ւ֝ֈֳּ֧֩֠րֿ֡׀׆ֽ֎֒׉֓ח׏ִ֑֧֢֡", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[103] = NLoginCore_091.F("֥֦֡եռ։նְ֭֘֠ս֦֒ք֫֋֭֊ּ֕ճ֨նֲֻ֡֋ְַֹׂ֚֡֙֟ֆ։ֵֹֹ֌֌֖", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[104] = NLoginCore_027.A("ƷƩǔǀƾƗƾƚƻƥǢǠǁǜơǄǅǪǈǠǘǢǒǯǋǇǎǮǒǧǱǍ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[105] = NLoginCore_138.A("ǛǐƮƧƙǔƮƜǎǥǠƸǨǝǋǫƹǕǭǐǝǟƶƷ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[106] = NLoginCore_004.F("մե։նւժյ֖֛֣ձ֦֬ֆմ֥ք֢֣֔֙օָֺֿ֧֛֮֘ք֍֎", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[107] = NLoginCore_453.C("ՓենյցՖՊփ՝ր֍ՠջդ֌Փւ֕բ՟ՠա՞՟", (byte)114, 67);
                    BCryptHashProvider.var_java_lang_String_arr_b[108] = NLoginCore_092.A("ƶƨƲƴƚǝƔǁǄƣơƫ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[109] = NLoginCore_091.F("ղ֩֓զդ֧֙֠֘֜հն", (byte)114, 70);
                    BCryptHashProvider.var_java_lang_String_arr_b[110] = NLoginCore_387.A("ǚǖǛƚƱƾƫǢǥǍǗƯǃǗǝǓǛǠǢǛǜǢƿƱƮƧǄǏƷǅǲǓǲǲƾǵǖǍǿǳȁǂǂǄȉǿǷǷǶƿǝǿǹǙǖǗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[111] = NLoginCore_004.D("ՑջՕ՟ՓվՈՙդՙը՟֐ՉտօրՕգոչթ՗գյ՝։֑չ֙֐ոճղոյվ֣֋֢մ֧֥֩սֆքս֐ְձ֟կַվտ", (byte)114, 68);
                    BCryptHashProvider.var_java_lang_String_arr_b[112] = NLoginCore_324.A("ǚǖǛƚƱƾƫǢǥǍǗƯǃǗǝǓǛǠǢǛǜǤǑƼǲǵǤǰǨǖǛǥǳƵƵǘǼǯǸǛƼȄǱǴǟǿǄȇȃǪǚȎǡǿǖǗ", (byte)114, 65);
                    BCryptHashProvider.var_java_lang_String_arr_b[113] = NLoginCore_092.E("մ֞ուն֡իռևռ֋ւֳլ֢֣֨ոֆ֛֜֌պֆ֘րֳִּ֛֖֛֬֜֕֘֡׆ׅ֮֗׊׍׆׍֏֣֔֓֕֋׃ׇך֢֡", (byte)114, 69);
                    continue block7;
                }
                case 2: {
                    BCryptHashProvider.var_java_lang_String_arr_b[0] = NLoginCore_201.E("մա։֛ր֙գ֩ջ֭չֳ֌ֲ֧֪֍ֹ֗֕ղֺցւ", (byte)114, 69);
                    continue block7;
                }
                case 4: {
                    BCryptHashProvider.var_java_lang_String_arr_b[0] = NLoginCore_451.F("բ֥ր֫ժ֪֝֩֠֨օ֦֥֨֌ւ֐ձ֤֢֩֗֔֯־֬ց֚֐պ֍׆", (byte)114, 70);
                }
            }
        }
    }

    private static void f(NLoginType_008 NLoginType_008, boolean bl) {
        if (!NLoginType_008.L()) {
            return;
        }
        NLoginCore_592.a(NLoginType_008, bl);
        var_byte_arr_j = NLoginCore_140.a((NLoginCore_126 NLoginCore_1262) -> {
            Set<NLoginCore_532> set = Arrays.stream(NLoginCore_532.values()).filter(NLoginCore_477 -> NLoginCore_532.b(NLoginCore_477)).collect(Collectors.toSet());
            NLoginCore_1262.f(oa);
            NLoginCore_1262.f(set.size());
            set.forEach(NLoginCore_477 -> {
                Object t = NLoginCore_477.g();
                NLoginCore_1262.x(NLoginCore_477.var_com_nickuc_login_NLoginCore_474_h.a()[ob]);
                if (t instanceof String) {
                    NLoginCore_1262.e(oc);
                    NLoginCore_1262.x((String)t);
                } else if (t instanceof Boolean) {
                    NLoginCore_1262.e(od);
                    NLoginCore_1262.h((Boolean)t);
                } else if (t instanceof Integer) {
                    NLoginCore_1262.e(oe);
                    NLoginCore_1262.h((Integer)t);
                } else if (t instanceof Collection) {
                    Collection collection = (Collection)t;
                    NLoginCore_1262.e(of);
                    NLoginCore_1262.h(collection.size());
                    collection.forEach(NLoginCore_1262::x);
                }
            });
        });
        cL = NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.b(var_byte_arr_j);
    }

    private static void l(NLoginType_008 NLoginType_008) {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.ac;
        int n = NLoginCore_477.r();
        if (n < ib) {
            BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
            NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)ic, (long)(id ^ ie)) + n + (String)BCryptHashProvider.c("㺃", (int)cfr_renamed_0, (long)(ig ^ ih)), new Object[ii]);
        } else if (n > ij) {
            BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
            NLoginCore_370.c((String)BCryptHashProvider.c("㺆", (int)ik, (long)(il ^ im)) + n + (String)BCryptHashProvider.c("㺉", (int)in, (long)io), new Object[ip]);
        }
        NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[iq];
        NLoginInterface_034Array[BCryptHashProvider.ir] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_a;
        NLoginInterface_034Array[BCryptHashProvider.is] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_b;
        if (!NLoginType_008.com_nickuc_login_NLoginCore_583_a().boolean_a(NLoginInterface_034Array)) {
            int n2 = var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_f || var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_g ? it : iu;
            NLoginCore_370.d((String)BCryptHashProvider.c("㺌", (int)iv, (long)(iw ^ ix)) + NLoginCore_346.var_com_nickuc_login_NLoginCore_379_b.A() + (String)BCryptHashProvider.c("㺏", (int)(iy & iz), (long)ja) + NLoginCore_346.var_com_nickuc_login_NLoginCore_379_a.A() + (String)BCryptHashProvider.c("㺒", (int)jb, (long)(jc ^ jd)) + (String)(n2 != 0 ? BCryptHashProvider.c("㺕", (int)je, (long)jf) : BCryptHashProvider.c("㺘", (int)jg, (long)(jh ^ ji))), new Object[jj]);
            if (n2 != 0) {
                var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.var_com_nickuc_login_NLoginCore_566_f;
            }
            aO = jk;
        }
    }

    private static void i(NLoginType_008 NLoginType_008) {
        NLoginCore_532 NLoginCore_477 = NLoginCore_532.var_com_nickuc_login_NLoginCore_477_c;
        String string = NLoginCore_477.a(new Object[bh]).toUpperCase(Locale.ENGLISH);
        try {
            var_com_nickuc_login_NLoginCore_036_j = NLoginCore_036.valueOf(string);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺀", (int)bi, (long)bj) + string + (String)BCryptHashProvider.c("㺃", (int)bk, (long)(bl ^ bm)) : (String)BCryptHashProvider.c("㺆", (int)bn, (long)(bo ^ bp)) + string + (String)BCryptHashProvider.c("㺉", (int)bq, (long)br), new Object[bs]);
            var_com_nickuc_login_NLoginCore_036_j = NLoginCore_036.valueOf((String)NLoginCore_477.java_lang_Object_a());
        }
        if (var_com_nickuc_login_NLoginCore_036_j != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c && var_com_nickuc_login_NLoginCore_036_j != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d && var_com_nickuc_login_NLoginCore_036_j != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f) {
            NLoginCore_370.c(NLoginCore_150.j() ? (String)BCryptHashProvider.c("㺌", (int)bt, (long)(bu ^ bv)) + string + (String)BCryptHashProvider.c("㺏", (int)bw, (long)(bx ^ by)) : (String)BCryptHashProvider.c("㺒", (int)bz, (long)(ca ^ cb)) + string + (String)BCryptHashProvider.c("㺕", (int)cc, (long)(cd ^ ce)), new Object[cf]);
            var_com_nickuc_login_NLoginCore_036_j = NLoginCore_036.valueOf((String)NLoginCore_477.java_lang_Object_a());
        }
        NLoginCore_523 NLoginCore_4952 = NLoginType_008.com_nickuc_login_NLoginCore_495_a();
        try {
            if (NLoginCore_4952 != null) {
                if (NLoginCore_323.a(NLoginCore_4952.com_nickuc_login_NLoginCore_459_a(), NLoginCore_532.e.a(new Object[cg]), (String)BCryptHashProvider.c("㺘", (int)ch, (long)ci))) {
                    BCryptHashProvider.a(NLoginCore_532.l, BCryptHashProvider.c("㺛", (int)cj, (long)ck));
                }
                if (NLoginCore_323.a(NLoginCore_4952.com_nickuc_login_NLoginCore_459_a(), NLoginCore_532.e.a(new Object[cl]), (String)BCryptHashProvider.c("㺞", (int)cm, (long)(cn ^ co)))) {
                    BCryptHashProvider.a(NLoginCore_532.m, BCryptHashProvider.c("㺡", (int)cp, (long)(cq ^ cr)));
                }
            }
        }
        catch (SQLException sQLException) {
            NLoginCore_370.c((String)BCryptHashProvider.c("㺤", (int)cs, (long)(ct ^ cu)), sQLException, new Object[cv]);
        }
    }

    private static void n(NLoginType_008 NLoginType_008) {
        block18: {
            NLoginCore_532 NLoginCore_477 = NLoginCore_532.af;
            int n = NLoginCore_477.r();
            if (n < js) {
                BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺀", (int)jt, (long)ju) + n + (String)BCryptHashProvider.c("㺃", (int)jv, (long)(jw ^ jx)), new Object[jy]);
            } else if (n > jz) {
                BCryptHashProvider.a(NLoginCore_477, NLoginCore_532.a(NLoginCore_477));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺆", (int)ka, (long)(kb ^ kc)) + n + (String)BCryptHashProvider.c("㺉", (int)kd, (long)(ke ^ kf)), new Object[kg]);
            }
            NLoginCore_532 NLoginCore_4772 = NLoginCore_532.ag;
            int n2 = NLoginCore_4772.r();
            if (n2 % kh != 0) {
                BCryptHashProvider.a(NLoginCore_4772, NLoginCore_532.a(NLoginCore_4772));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺌", (int)ki, (long)(kj ^ kk)) + n + (String)BCryptHashProvider.c("㺏", (int)kl, (long)(km ^ kn)), new Object[ko]);
            } else if (n2 < kp) {
                BCryptHashProvider.a(NLoginCore_4772, NLoginCore_532.a(NLoginCore_4772));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺒", (int)kq, (long)(kr ^ ks)) + n + (String)BCryptHashProvider.c("㺕", (int)kt, (long)(ku ^ kv)), new Object[kw]);
            } else if (n2 > kx) {
                BCryptHashProvider.a(NLoginCore_4772, NLoginCore_532.a(NLoginCore_4772));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺘", (int)ky, (long)kz) + n + (String)BCryptHashProvider.c("㺛", (int)(la & lb), (long)lc), new Object[ld]);
            }
            NLoginCore_532 NLoginCore_4773 = NLoginCore_532.ah;
            int n3 = NLoginCore_4773.r();
            if (n3 < le) {
                BCryptHashProvider.a(NLoginCore_4773, NLoginCore_532.a(NLoginCore_4773));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺞", (int)lf, (long)lg) + n + (String)BCryptHashProvider.c("㺡", (int)(lh & li), (long)lj), new Object[lk]);
            } else if (n3 > ll) {
                BCryptHashProvider.a(NLoginCore_4773, NLoginCore_532.a(NLoginCore_4773));
                NLoginCore_370.c((String)BCryptHashProvider.c("㺤", (int)lm, (long)(ln ^ lo)) + n + (String)BCryptHashProvider.c("㺧", (int)lp, (long)lq), new Object[lr]);
            }
            try {
                NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[ls];
                NLoginInterface_034Array[BCryptHashProvider.lt] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_c;
                NLoginInterface_034Array[BCryptHashProvider.lu] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_d;
                if (!NLoginType_008.com_nickuc_login_NLoginCore_583_a().boolean_a(NLoginInterface_034Array)) {
                    int n4 = var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_b || var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_c || var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_d ? lv : lw;
                    NLoginCore_370.d((String)BCryptHashProvider.c("㺪", (int)lx, (long)(ly ^ lz)) + NLoginCore_346.var_com_nickuc_login_NLoginCore_379_c.A() + (String)BCryptHashProvider.c("㺭", (int)ma, (long)(mb ^ mc)) + NLoginCore_346.var_com_nickuc_login_NLoginCore_379_d.A() + (String)BCryptHashProvider.c("㺰", (int)md, (long)(me ^ mf)) + (String)(n4 != 0 ? BCryptHashProvider.c("㺳", (int)mg, (long)(mh ^ mi)) : BCryptHashProvider.c("㺶", (int)mj, (long)(mk ^ ml))), new Object[mm]);
                    if (n4 != 0) {
                        var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.var_com_nickuc_login_NLoginCore_566_e;
                    }
                } else {
                    aN = mn;
                }
            }
            catch (Throwable throwable) {
                int n5;
                boolean bl = NLoginCore_370.aj();
                if (bl) {
                    NLoginCore_370.c((String)BCryptHashProvider.c("㺹", (int)mo, (long)mp), throwable, new Object[mq]);
                }
                int n6 = n5 = var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_b || var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_c || var_com_nickuc_login_NLoginCore_566_a == NLoginCore_566.var_com_nickuc_login_NLoginCore_566_d ? mr : ms;
                if (n5 == 0) break block18;
                if (!bl) {
                    NLoginCore_370.d((String)BCryptHashProvider.c("㺼", (int)(mt & mu), (long)mv), new Object[mw]);
                }
                var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.var_com_nickuc_login_NLoginCore_566_e;
            }
        }
    }

    @Generated
    public static void a(NLoginCore_175 NLoginCore_175) {
        var_com_nickuc_login_NLoginCore_175_a = NLoginCore_175;
    }

    @Generated
    public static List<Pattern> k() {
        return var_java_util_List_java_util_regex_Pattern__r;
    }

    /*
     * Exception decompiling
     */
    private static boolean a(String var0, NLoginCore_370 var1_1) {
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

    public static void c(NLoginType_008 NLoginType_008, boolean bl) {
        String string = NLoginCore_532.var_com_nickuc_login_NLoginCore_477_b.a(new Object[x]);
        if (!string.endsWith((String)BCryptHashProvider.c("㺀", (int)y, (long)(z ^ aa)))) {
            BCryptHashProvider.a(NLoginCore_532.var_com_nickuc_login_NLoginCore_477_b, (Object)(string + (String)BCryptHashProvider.c("㺃", (int)ab, (long)(ac ^ ad))));
        }
        NLoginCore_195.b(NLoginType_008, bl);
    }

    private static void void_a(NLoginType_008 NLoginType_008, boolean bl, boolean bl2) {
        NLoginCore_308 NLoginCore_3082;
        if (!bl2) {
            NLoginType_008.com_nickuc_login_NLoginInterface_030_b().a(NLoginType_008, bl);
            NLoginType_008.com_nickuc_login_NLoginCore_276_a().a(NLoginType_008, bl);
        }
        if ((NLoginCore_3082 = NLoginType_008.com_nickuc_login_NLoginCore_308_a()) != null) {
            NLoginCore_3082.a(NLoginType_008, bl);
        }
    }

    @Generated
    public static NLoginCore_566 com_nickuc_login_NLoginCore_566_b() {
        return var_com_nickuc_login_NLoginCore_566_a;
    }
}

