/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_147;
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
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_323;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_300;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_288;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_561;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_468;
import com.nickuc.login.NLoginCore_199;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_523 {
    private static long aq;
    private static long cr;
    private static int fn;
    private static int t;
    private static long ku;
    private static long ih;
    private static int mi;
    private static int hv;
    private static int iz;
    private static int gk;
    private static int md;
    private static long ht;
    private static long jc;
    private static long ji;
    private static int cy;
    private static int gq;
    private static int ez;
    private static long lq;
    private static int jo;
    private static long dw;
    private static int bs;
    private static int eg;
    private static int m;
    private static long al;
    private static long ia;
    private static long bc;
    private static long am;
    private static int ml;
    private static int hn;
    private static long kh;
    private static long cz;
    private static int jp;
    private static long hf;
    private static long ho;
    private static int u;
    private static int ey;
    private static int ma;
    private static long jj;
    private static long hz;
    private static int ds;
    private static int et;
    private static int dk;
    private static int cc;
    private static int co;
    private static long dq;
    private static long gp;
    private static int na;
    private static long eu;
    private static int es;
    private static long lm;
    private static int y;
    private static long hl;
    private static long ed;
    private static long fi;
    private static long f;
    private static int ij;
    private static int kr;
    private static int fk;
    private static long ge;
    private static long dl;
    private static int ld;
    private static long il;
    private static int fu;
    private static long o;
    private static int hm;
    private static int kz;
    private static long db;
    private static int fy;
    private static long ap;
    private static long eq;
    private static long cfr_renamed_0;
    private static long hw;
    private static int fv;
    private static int bb;
    private static long ms;
    private static long fm;
    private static int eb;
    private static int dj;
    private static int mr;
    private static long mc;
    private static long hx;
    private static long w;
    private static long ne;
    private static long ix;
    private static long jm;
    private static int la;
    private static int ak;
    private static int ga;
    private static long jv;
    private static long jz;
    private static long jr;
    private static int dd;
    private static long ec;
    private static int bq;
    private static long br;
    private static long lz;
    private static int bt;
    private static int ca;
    private final NLoginCore_459 var_com_nickuc_login_NLoginCore_459_b;
    private static int lb;
    private static int fq;
    private static int ax;
    private static int kt;
    private static long hi;
    private static int ni;
    private static int ks;
    private static long hu;
    private static int ad;
    private static int hg;
    private static int lu;
    private static long nb;
    private static long n;
    private static long ly;
    private static int bh;
    private static long fp;
    private static long ke;
    private static int gc;
    private static long he;
    private static int dv;
    private static long hc;
    private static int ej;
    private static int bw;
    private static int hj;
    private static long ah;
    private static int cs;
    private static int fb;
    private static long nc;
    private static int ik;
    private static int bk;
    private static int ep;
    private static long it;
    private static long er;
    private static int e;
    private static long gb;
    private static int kq;
    private static int jd;
    private static int da;
    private static int ck;
    private static long el;
    private static int ab;
    private static int lo;
    private static long ju;
    private static int bu;
    private static long af;
    private static int fd;
    private static int fe;
    private static long mt;
    private static long df;
    private static String[] var_java_lang_String_arr_a;
    private static int iv;
    private static int lx;
    private static int lv;
    private static int kp;
    private static int ko;
    private static int jt;
    private static long dx;
    private static int av;
    private static int gy;
    private static int ll;
    private static int az;
    private static long j;
    private static int in;
    private static long jx;
    private static int ls;
    private static int cm;
    private static long fx;
    private static long iq;
    private static long g;
    private static int lk;
    private static long mx;
    private static int is;
    private static int fl;
    private static long ir;
    private static long fc;
    private static long jn;
    private static int dz;
    private static long ft;
    private static int dy;
    private static int var_int_a;
    private static int id;
    private static int hb;
    private static long bv;
    private static int mm;
    private static int kw;
    private static long aa;
    private static int jw;
    private static int kf;
    private static int jl;
    private static int mf;
    private static int cd;
    private static long gi;
    private static int js;
    private static int gf;
    private static long iw;
    private static long dt;
    private static long ln;
    private static int fo;
    private static long du;
    private static long jg;
    private static int ew;
    private static long cq;
    private static int je;
    private static int au;
    private static long mk;
    private static long ch;
    private static long ha;
    private static long ei;
    private static int bi;
    private static int kj;
    private static int gd;
    private static long li;
    private static int kk;
    private static int mv;
    private static int nd;
    private static long jq;
    private static long mp;
    private static int kg;
    private static int gz;
    private static int jk;
    private static long lj;
    private static long hq;
    private static int h;
    private static int cl;
    private static int mw;
    private static long lr;
    private static int ay;
    private static int dg;
    private static long hr;
    private static int gg;
    private static int jh;
    private static int an;
    private static long ct;
    private static long jf;
    private static long var_long_b;
    private static long var_long_k;
    private static long gu;
    private static int mz;
    private static long ii;
    private static int lf;
    private static long s;
    private static int dp;
    private static int bd;
    private static long ef;
    private static int fr;
    private static int d;
    private static int mo;
    private static int bm;
    private static long ic;
    private static int en;
    private static long mh;
    private static long fs;
    private static long kd;
    public static final int q;
    private static int hp;
    private static long ki;
    private static int var_int_c;
    private static int lc;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_k;
    private static int bl;
    private static int gl;
    private static int hs;
    private static long gr;
    private static int i;
    private static long ci;
    private static int cv;
    private static int mu;
    private static int v;
    private static int gv;
    private static int go;
    private static long di;
    private static int kv;
    private static int ee;
    private static int kl;
    private static int my;
    private static int l;
    private static int ev;
    private static int le;
    private static int ig;
    private static int bj;
    private static int ao;
    private static int ib;
    private static int lp;
    private static int fh;
    private static long dc;
    private static long de;
    private static int by;
    private static long cu;
    private static int aw;
    private static int r;
    private static long io;
    private static long ng;
    private static int ae;
    private static long ie;
    private static int bn;
    private static long lt;
    private static int dm;
    private static int bo;
    private static int be;
    private static long ex;
    private static int as;
    private static int kb;
    private static long mg;
    private static long gm;
    private static int nh;
    private static int hy;
    private static long im;
    private static int ai;
    private static long fj;
    private static long cw;
    private static String[] var_java_lang_String_arr_b;
    private static int kn;
    private static long eo;
    private static int at;
    private static int iy;
    private static int lh;
    private static int lg;
    private static long dh;
    private static long dn;
    private static long bf;
    private static int ac;
    private static long fa;
    private static int hd;
    private static int ek;
    private static int jy;
    private static long ka;
    private static int aj;
    private static long var_long_c;
    private static int jb;
    private static int km;
    private static long ja;
    private static long lw;
    private static long fg;
    private static int ba;
    private static int ip;
    private static int gn;
    private static long ea;
    private static int gj;
    private static int hk;
    private static int x;
    private static int bx;
    private static int p;
    private static long kx;
    private static int gw;
    private static int mj;
    private static int bg;
    private static long mq;
    private static long nf;
    private static long cfr_renamed_1;
    private static long me;
    private static long mn;
    private static long gx;
    private static int fw;
    private static long cn;
    private static int ce;
    private static int gs;
    private static long mb;
    private static int fz;
    private static int cp;
    private static int nj;
    private static int ag;
    private static int bz;
    private static int ar;
    private static long z;
    private static long ff;
    private static int em;
    private static int cb;
    private static int cf;
    private static int iu;
    private static long ky;
    private static long hh;
    private static int kc;
    private static int cj;
    private static long cx;
    private static long gt;
    private static int eh;
    private static int cg;
    private static int bp;
    private static long dr;
    private static long gh;

    public void w() {
        try {
            NLoginCore_300 NLoginCore_3002 = NLoginCore_561.a(this.var_com_nickuc_login_NLoginCore_459_b);
            if (NLoginCore_3002 != null) {
                BCryptHashProvider.a(NLoginCore_3002.a());
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_523.c("㺀", (int)kc, (long)(kd ^ ke)), exception, new Object[kf]);
        }
    }

    public Integer java_lang_Integer_a() {
        Object[] objectArray = new Object[ar];
        objectArray[NLoginCore_523.as] = NLoginCore_532.u.a(new Object[at]);
        objectArray[NLoginCore_523.au] = NLoginCore_532.r.a(new Object[av]);
        objectArray[NLoginCore_523.aw] = NLoginCore_532.t.a(new Object[ax]);
        Object[] objectArray2 = new Object[ay];
        objectArray2[NLoginCore_523.az] = NLoginCore_523.c("㺃", (int)(ba & bb), (long)bc);
        try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginCore_523.c("㺀", (int)ao, (long)(ap ^ aq)), objectArray), objectArray2);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            if (!resultSet.next()) {
                Integer n = null;
                return n;
            }
            byte[] byArray = resultSet.getBytes(bd);
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            Integer n = dataInputStream.readUnsignedShort();
            return n;
        }
    }

    private static String a(int n, long l) {
        l ^= 0x46L;
        l ^= 0x596740DDE808F057L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(16 + 53), (byte)(27 + 56), (byte)(27 + 20), (byte)(3 + 64), (byte)(41 + 25), (byte)(61 + 6), (byte)(30 + 17), (byte)(29 + 51), (byte)(23 + 52), (byte)(7 + 60), (byte)(56 + 27), 53, (byte)(55 + 25), (byte)(92 + 5), (byte)(87 + 13), (byte)(13 + 87), 105, (byte)(16 + 94), (byte)(77 + 26)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.A("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲԇәԋӺԂԋԇӞԇԋ", (byte)90, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_523.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long long_a() {
        String string = NLoginCore_532.e.a(new Object[ac]);
        try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_523.c("㺀", (int)(ad & ae), (long)af) + string + (String)NLoginCore_523.c("㺃", (int)ag, (long)ah), new Object[ai]);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            if (!resultSet.next()) return 0L;
            long l = resultSet.getLong(aj);
            return l;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_523.c("㺆", (int)ak, (long)(al ^ am)) + string, exception, new Object[an]);
        }
        return 0L;
    }

    public void a(int n) {
        Integer n2 = this.java_lang_Integer_a();
        if (n2 == null) {
            Object[] objectArray = new Object[bg];
            objectArray[NLoginCore_523.bh] = NLoginCore_532.r.a(new Object[bi]);
            objectArray[NLoginCore_523.bj] = NLoginCore_532.t.a(new Object[bk]);
            objectArray[NLoginCore_523.bl] = NLoginCore_532.u.a(new Object[bm]);
            try (NLoginCore_288 NLoginCore_2882 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_288_a(String.format((String)NLoginCore_523.c("㺀", (int)be, (long)bf), objectArray), new Object[bn]);){
                byte[] byArray = NLoginCore_140.a(NLoginCore_1262 -> NLoginCore_1262.f(n));
                PreparedStatement preparedStatement = (PreparedStatement)NLoginCore_2882.d();
                preparedStatement.setString(bo, (String)NLoginCore_523.c("㺃", (int)(bp & bq), (long)br));
                preparedStatement.setBytes(bs, byArray);
                preparedStatement.execute();
            }
        }
        if (n2 != n) {
            Object[] objectArray = new Object[bw];
            objectArray[NLoginCore_523.bx] = NLoginCore_532.r.a(new Object[by]);
            objectArray[NLoginCore_523.bz] = NLoginCore_532.t.a(new Object[ca]);
            objectArray[NLoginCore_523.cb] = NLoginCore_532.u.a(new Object[cc]);
            try (NLoginCore_288 NLoginCore_2883 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_288_a(String.format((String)NLoginCore_523.c("㺆", (int)(bt & bu), (long)bv), objectArray), new Object[cd]);){
                byte[] byArray = NLoginCore_140.a(NLoginCore_1262 -> NLoginCore_1262.f(n));
                PreparedStatement preparedStatement = (PreparedStatement)NLoginCore_2883.d();
                preparedStatement.setBytes(ce, byArray);
                preparedStatement.setString(cf, (String)NLoginCore_523.c("㺉", (int)cg, (long)(ch ^ ci)));
                preparedStatement.execute();
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(9145631871358744198L);
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(0);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(2083987655641806470L);
        g = Long.reverse(0x6200000000000000L);
        h = 0 >>> 136 | 0 << -136;
        i = Integer.reverse(0x40000000);
        j = Long.reverse(2083987655641806470L);
        var_long_k = Long.reverse(0x6200000000000000L);
        l = Integer.reverse(0);
        m = Integer.reverse(-1073741824);
        n = Long.reverse(2083987655641806470L);
        o = Long.reverse(0x6200000000000000L);
        p = Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1;
        r = Integer.reverse(0x20000000);
        s = Long.reverse(9145631871358744198L);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(-1610612736);
        v = -1 >>> 151 | -1 << ~151 + 1;
        w = Long.reverse(9145631871358744198L);
        x = 0 >>> 91 | 0 << -91;
        y = 3 >>> 95 | 3 << ~95 + 1;
        z = Long.reverse(2083987655641806470L);
        aa = Long.reverse(0x6200000000000000L);
        ab = Integer.reverse(0);
        ac = Integer.reverse(0);
        ad = 0x7000000 >>> 248 | 0x7000000 << ~248 + 1;
        ae = Integer.reverse(-1);
        af = Long.reverse(9145631871358744198L);
        ag = Integer.reverse(0x10000000);
        ah = Long.reverse(9145631871358744198L);
        ai = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        aj = (16384 >>> 142 | 16384 << -142) & 0xFFFFFFFF;
        ak = Integer.reverse(-1879048192);
        al = Long.reverse(2083987655641806470L);
        am = Long.reverse(0x6200000000000000L);
        an = 0 >>> 232 | 0 << -232;
        ao = Integer.reverse(0x50000000);
        ap = Long.reverse(2083987655641806470L);
        aq = Long.reverse(0x6200000000000000L);
        ar = Integer.reverse(-1073741824);
        as = (0 >>> 171 | 0 << ~171 + 1) & 0xFFFFFFFF;
        at = Integer.reverse(0);
        au = 1024 >>> 106 | 1024 << ~106 + 1;
        av = Integer.reverse(0);
        aw = Integer.reverse(0x40000000);
        ax = Integer.reverse(0);
        ay = Integer.reverse(Integer.MIN_VALUE);
        az = (0 >>> 7 | 0 << ~7 + 1) & 0xFFFFFFFF;
        ba = 5632 >>> 41 | 5632 << -41;
        bb = (-1 >>> 31 | -1 << ~31 + 1) & 0xFFFFFFFF;
        bc = Long.reverse(9145631871358744198L);
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = 12288 >>> 74 | 12288 << -74;
        bf = Long.reverse(9145631871358744198L);
        bg = (786432 >>> 210 | 786432 << ~210 + 1) & 0xFFFFFFFF;
        bh = (0 >>> 21 | 0 << ~21 + 1) & 0xFFFFFFFF;
        bi = (0 >>> 88 | 0 << ~88 + 1) & 0xFFFFFFFF;
        bj = Integer.reverse(Integer.MIN_VALUE);
        bk = Integer.reverse(0);
        bl = Integer.reverse(0x40000000);
        bm = Integer.reverse(0);
        bn = Integer.reverse(0);
        bo = (0x2000000 >>> 57 | 0x2000000 << ~57 + 1) & 0xFFFFFFFF;
        bp = (0xD00000 >>> 52 | 0xD00000 << ~52 + 1) & 0xFFFFFFFF;
        bq = (-1 >>> 71 | -1 << ~71 + 1) & 0xFFFFFFFF;
        br = Long.reverse(9145631871358744198L);
        bs = Integer.reverse(0x40000000);
        bt = -536870912 >>> 188 | -536870912 << -188;
        bu = (-1 >>> 83 | -1 << ~83 + 1) & 0xFFFFFFFF;
        bv = Long.reverse(9145631871358744198L);
        bw = Integer.reverse(-1073741824);
        bx = Integer.reverse(0);
        by = Integer.reverse(0);
        bz = 1 >>> 96 | 1 << -96;
        ca = (0 >>> 249 | 0 << -249) & 0xFFFFFFFF;
        cb = Integer.reverse(0x40000000);
        cc = 0 >>> 207 | 0 << ~207 + 1;
        cd = Integer.reverse(0);
        ce = 0x400000 >>> 86 | 0x400000 << ~86 + 1;
        cf = Integer.reverse(0x40000000);
        cg = 122880 >>> 45 | 122880 << ~45 + 1;
        ch = Long.reverse(2083987655641806470L);
        ci = Long.reverse(0x6200000000000000L);
        cj = Integer.reverse(Integer.MIN_VALUE);
        ck = Integer.reverse(0);
        cl = Integer.reverse(0);
        cm = Integer.reverse(0x8000000);
        cn = Long.reverse(9145631871358744198L);
        co = Integer.reverse(0);
        cp = (17 >>> 96 | 17 << ~96 + 1) & 0xFFFFFFFF;
        cq = Long.reverse(2083987655641806470L);
        cr = Long.reverse(0x6200000000000000L);
        cs = (72 >>> 34 | 72 << -34) & 0xFFFFFFFF;
        ct = Long.reverse(2083987655641806470L);
        cu = Long.reverse(0x6200000000000000L);
        cv = 19456 >>> 10 | 19456 << -10;
        cw = Long.reverse(2083987655641806470L);
        cx = Long.reverse(0x6200000000000000L);
        cy = (0x1400000 >>> 148 | 0x1400000 << -148) & 0xFFFFFFFF;
        cz = Long.reverse(9145631871358744198L);
        da = 43008 >>> 107 | 43008 << -107;
        db = Long.reverse(2083987655641806470L);
        dc = Long.reverse(0x6200000000000000L);
        dd = (0x2C00000 >>> 21 | 0x2C00000 << ~21 + 1) & 0xFFFFFFFF;
        de = Long.reverse(2083987655641806470L);
        df = Long.reverse(0x6200000000000000L);
        dg = Integer.reverse(-402653184);
        dh = Long.reverse(2083987655641806470L);
        di = Long.reverse(0x6200000000000000L);
        dj = (6144 >>> 168 | 6144 << -168) & 0xFFFFFFFF;
        dk = (-1 >>> 126 | -1 << ~126 + 1) & 0xFFFFFFFF;
        dl = Long.reverse(9145631871358744198L);
        dm = Integer.reverse(-1744830464);
        dn = Long.reverse(2083987655641806470L);
        cfr_renamed_1 = Long.reverse(0x6200000000000000L);
        dp = Integer.reverse(0x58000000);
        dq = Long.reverse(2083987655641806470L);
        dr = Long.reverse(0x6200000000000000L);
        ds = Integer.reverse(-671088640);
        dt = Long.reverse(2083987655641806470L);
        du = Long.reverse(0x6200000000000000L);
        dv = 0x7000000 >>> 118 | 0x7000000 << -118;
        dw = Long.reverse(2083987655641806470L);
        dx = Long.reverse(0x6200000000000000L);
        dy = -805306367 >>> 188 | -805306367 << -188;
        dz = -1 >>> 236 | -1 << -236;
        ea = Long.reverse(9145631871358744198L);
        eb = Integer.reverse(0x78000000);
        ec = Long.reverse(2083987655641806470L);
        ed = Long.reverse(0x6200000000000000L);
        ee = Integer.reverse(-134217728);
        ef = Long.reverse(9145631871358744198L);
        eg = Integer.reverse(0x4000000);
        eh = (-1 >>> 165 | -1 << ~165 + 1) & 0xFFFFFFFF;
        ei = Long.reverse(9145631871358744198L);
        ej = (67584 >>> 75 | 67584 << -75) & 0xFFFFFFFF;
        ek = Integer.reverse(-1);
        el = Long.reverse(9145631871358744198L);
        em = Integer.reverse(0x44000000);
        en = (-1 >>> 36 | -1 << ~36 + 1) & 0xFFFFFFFF;
        eo = Long.reverse(9145631871358744198L);
        ep = 35840 >>> 170 | 35840 << -170;
        eq = Long.reverse(2083987655641806470L);
        er = Long.reverse(0x6200000000000000L);
        es = Integer.reverse(0);
        et = Integer.reverse(0x24000000);
        eu = Long.reverse(9145631871358744198L);
        ev = Integer.reverse(-1543503872);
        ew = (-1 >>> 107 | -1 << ~107 + 1) & 0xFFFFFFFF;
        ex = Long.reverse(9145631871358744198L);
        ey = (9728 >>> 8 | 9728 << -8) & 0xFFFFFFFF;
        ez = -1 >>> 210 | -1 << ~210 + 1;
        fa = Long.reverse(9145631871358744198L);
        fb = Integer.reverse(-469762048);
        fc = Long.reverse(9145631871358744198L);
        fd = (0 >>> 23 | 0 << -23) & 0xFFFFFFFF;
        fe = (0x2800000 >>> 52 | 0x2800000 << -52) & 0xFFFFFFFF;
        ff = Long.reverse(2083987655641806470L);
        fg = Long.reverse(0x6200000000000000L);
        fh = 82 >>> 33 | 82 << ~33 + 1;
        fi = Long.reverse(2083987655641806470L);
        fj = Long.reverse(0x6200000000000000L);
        fk = Integer.reverse(0x54000000);
        fl = -1 >>> 0 | -1 << ~0 + 1;
        fm = Long.reverse(9145631871358744198L);
        fn = Integer.reverse(0);
        fo = Integer.reverse(-738197504);
        fp = Long.reverse(9145631871358744198L);
        fq = Integer.reverse(0);
        fr = 0x5800000 >>> 21 | 0x5800000 << ~21 + 1;
        fs = Long.reverse(2083987655641806470L);
        ft = Long.reverse(0x6200000000000000L);
        fu = (0 >>> 212 | 0 << ~212 + 1) & 0xFFFFFFFF;
        fv = 1474560 >>> 207 | 1474560 << ~207 + 1;
        fw = Integer.reverse(-1);
        fx = Long.reverse(9145631871358744198L);
        fy = 0 >>> 110 | 0 << ~110 + 1;
        fz = 736 >>> 132 | 736 << -132;
        ga = Integer.reverse(-1);
        gb = Long.reverse(9145631871358744198L);
        gc = Integer.reverse(0);
        gd = Integer.reverse(-201326592);
        ge = Long.reverse(9145631871358744198L);
        gf = Integer.reverse(Integer.MIN_VALUE);
        gg = (24576 >>> 105 | 24576 << ~105 + 1) & 0xFFFFFFFF;
        gh = Long.reverse(2083987655641806470L);
        gi = Long.reverse(0x6200000000000000L);
        gj = Integer.reverse(0);
        gk = Integer.reverse(-1946157056);
        gl = Integer.reverse(-1);
        gm = Long.reverse(9145631871358744198L);
        gn = Integer.reverse(0x4C000000);
        go = Integer.reverse(-1);
        gp = Long.reverse(9145631871358744198L);
        gq = (417792 >>> 45 | 417792 << -45) & 0xFFFFFFFF;
        gr = Long.reverse(9145631871358744198L);
        gs = Integer.reverse(0x2C000000);
        gt = Long.reverse(2083987655641806470L);
        gu = Long.reverse(0x6200000000000000L);
        gv = (848 >>> 4 | 848 << -4) & 0xFFFFFFFF;
        gw = -1 >>> 167 | -1 << -167;
        gx = Long.reverse(9145631871358744198L);
        gy = 27 >>> 223 | 27 << ~223 + 1;
        gz = Integer.reverse(-1);
        ha = Long.reverse(9145631871358744198L);
        hb = (-2147483621 >>> 223 | -2147483621 << -223) & 0xFFFFFFFF;
        hc = Long.reverse(9145631871358744198L);
        hd = -1073741823 >>> 187 | -1073741823 << ~187 + 1;
        he = Long.reverse(2083987655641806470L);
        hf = Long.reverse(0x6200000000000000L);
        hg = (0x4000000E >>> 30 | 0x4000000E << -30) & 0xFFFFFFFF;
        hh = Long.reverse(2083987655641806470L);
        hi = Long.reverse(0x6200000000000000L);
        hj = (-1610612733 >>> 124 | -1610612733 << ~124 + 1) & 0xFFFFFFFF;
        hk = Integer.reverse(-1);
        hl = Long.reverse(9145631871358744198L);
        hm = (1933312 >>> 79 | 1933312 << -79) & 0xFFFFFFFF;
        hn = Integer.reverse(-1);
        ho = Long.reverse(9145631871358744198L);
        hp = Integer.reverse(0x3C000000);
        hq = Long.reverse(2083987655641806470L);
        hr = Long.reverse(0x6200000000000000L);
        hs = Integer.reverse(-1140850688);
        ht = Long.reverse(2083987655641806470L);
        hu = Long.reverse(0x6200000000000000L);
        hv = (1015808 >>> 14 | 1015808 << -14) & 0xFFFFFFFF;
        hw = Long.reverse(2083987655641806470L);
        hx = Long.reverse(0x6200000000000000L);
        hy = (126 >>> 33 | 126 << ~33 + 1) & 0xFFFFFFFF;
        hz = Long.reverse(2083987655641806470L);
        ia = Long.reverse(0x6200000000000000L);
        ib = Integer.reverse(0x2000000);
        ic = Long.reverse(9145631871358744198L);
        id = (0x4100000 >>> 180 | 0x4100000 << ~180 + 1) & 0xFFFFFFFF;
        ie = Long.reverse(2083987655641806470L);
        cfr_renamed_0 = Long.reverse(0x6200000000000000L);
        ig = 0x10000002 >>> 59 | 0x10000002 << ~59 + 1;
        ih = Long.reverse(2083987655641806470L);
        ii = Long.reverse(0x6200000000000000L);
        ij = Integer.reverse(0);
        ik = 536 >>> 131 | 536 << -131;
        il = Long.reverse(2083987655641806470L);
        im = Long.reverse(0x6200000000000000L);
        in = (0x11000000 >>> 150 | 0x11000000 << ~150 + 1) & 0xFFFFFFFF;
        io = Long.reverse(9145631871358744198L);
        ip = Integer.reverse(-1577058304);
        iq = Long.reverse(2083987655641806470L);
        ir = Long.reverse(0x6200000000000000L);
        is = Integer.reverse(0x62000000);
        it = Long.reverse(9145631871358744198L);
        iu = 0 >>> 173 | 0 << ~173 + 1;
        iv = Integer.reverse(-503316480);
        iw = Long.reverse(2083987655641806470L);
        ix = Long.reverse(0x6200000000000000L);
        iy = Integer.reverse(0x12000000);
        iz = Integer.reverse(-1);
        ja = Long.reverse(9145631871358744198L);
        jb = 19136512 >>> 18 | 19136512 << -18;
        jc = Long.reverse(9145631871358744198L);
        jd = (0 >>> 53 | 0 << -53) & 0xFFFFFFFF;
        je = 18944 >>> 136 | 18944 << -136;
        jf = Long.reverse(2083987655641806470L);
        jg = Long.reverse(0x6200000000000000L);
        jh = (0x4B000000 >>> 88 | 0x4B000000 << -88) & 0xFFFFFFFF;
        ji = Long.reverse(2083987655641806470L);
        jj = Long.reverse(0x6200000000000000L);
        jk = Integer.reverse(0);
        jl = Integer.reverse(0x32000000);
        jm = Long.reverse(2083987655641806470L);
        jn = Long.reverse(0x6200000000000000L);
        jo = (0 >>> 255 | 0 << ~255 + 1) & 0xFFFFFFFF;
        jp = 1073741843 >>> 158 | 1073741843 << ~158 + 1;
        jq = Long.reverse(2083987655641806470L);
        jr = Long.reverse(0x6200000000000000L);
        js = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << ~31 + 1;
        jt = Integer.reverse(0x72000000);
        ju = Long.reverse(2083987655641806470L);
        jv = Long.reverse(0x6200000000000000L);
        jw = (-536870903 >>> 253 | -536870903 << -253) & 0xFFFFFFFF;
        jx = Long.reverse(9145631871358744198L);
        jy = Integer.reverse(0xA000000);
        jz = Long.reverse(2083987655641806470L);
        ka = Long.reverse(0x6200000000000000L);
        kb = 0 >>> 54 | 0 << ~54 + 1;
        kc = (0x14400000 >>> 150 | 0x14400000 << -150) & 0xFFFFFFFF;
        kd = Long.reverse(2083987655641806470L);
        ke = Long.reverse(0x6200000000000000L);
        kf = 0 >>> 197 | 0 << -197;
        kg = 343932928 >>> 150 | 343932928 << -150;
        kh = Long.reverse(2083987655641806470L);
        ki = Long.reverse(0x6200000000000000L);
        kj = (-2147483647 >>> 31 | -2147483647 << -31) & 0xFFFFFFFF;
        kk = Integer.reverse(0);
        kl = Integer.reverse(0);
        km = Integer.reverse(Integer.MIN_VALUE);
        kn = (0 >>> 75 | 0 << ~75 + 1) & 0xFFFFFFFF;
        ko = 1 >>> 191 | 1 << -191;
        kp = (0 >>> 215 | 0 << -215) & 0xFFFFFFFF;
        kq = 524288 >>> 51 | 524288 << ~51 + 1;
        kr = Integer.reverse(0);
        ks = Integer.reverse(-905969664);
        kt = -1 >>> 252 | -1 << -252;
        ku = Long.reverse(9145631871358744198L);
        kv = Integer.reverse(0x2000000);
        kw = Integer.reverse(0x2A000000);
        kx = Long.reverse(2083987655641806470L);
        ky = Long.reverse(0x6200000000000000L);
        kz = 24 >>> 195 | 24 << -195;
        la = (0 >>> 228 | 0 << -228) & 0xFFFFFFFF;
        lb = (0 >>> 75 | 0 << ~75 + 1) & 0xFFFFFFFF;
        lc = 64 >>> 166 | 64 << -166;
        ld = Integer.reverse(0);
        le = 128 >>> 166 | 128 << ~166 + 1;
        lf = 0 >>> 167 | 0 << ~167 + 1;
        lg = (4096 >>> 204 | 4096 << ~204 + 1) & 0xFFFFFFFF;
        lh = Integer.reverse(-1442840576);
        li = Long.reverse(2083987655641806470L);
        lj = Long.reverse(0x6200000000000000L);
        lk = Integer.reverse(0x40000000);
        ll = 0x2B000000 >>> 247 | 0x2B000000 << ~247 + 1;
        lm = Long.reverse(2083987655641806470L);
        ln = Long.reverse(0x6200000000000000L);
        lo = Integer.reverse(Integer.MIN_VALUE);
        lp = Integer.reverse(-369098752);
        lq = Long.reverse(2083987655641806470L);
        lr = Long.reverse(0x6200000000000000L);
        ls = Integer.reverse(0x1A000000);
        lt = Long.reverse(9145631871358744198L);
        lu = (2848 >>> 133 | 2848 << ~133 + 1) & 0xFFFFFFFF;
        lv = -1 >>> 31 | -1 << -31;
        lw = Long.reverse(9145631871358744198L);
        lx = Integer.reverse(0x5A000000);
        ly = Long.reverse(2083987655641806470L);
        lz = Long.reverse(0x6200000000000000L);
        ma = Integer.reverse(-637534208);
        mb = Long.reverse(2083987655641806470L);
        mc = Long.reverse(0x6200000000000000L);
        md = (0x2E0000 >>> 15 | 0x2E0000 << ~15 + 1) & 0xFFFFFFFF;
        me = Long.reverse(9145631871358744198L);
        mf = 11904 >>> 7 | 11904 << -7;
        mg = Long.reverse(2083987655641806470L);
        mh = Long.reverse(0x6200000000000000L);
        mi = Integer.reverse(0x7A000000);
        mj = Integer.reverse(-1);
        mk = Long.reverse(9145631871358744198L);
        ml = Integer.reverse(-100663296);
        mm = (-1 >>> 56 | -1 << -56) & 0xFFFFFFFF;
        mn = Long.reverse(9145631871358744198L);
        mo = 0x18000000 >>> 214 | 0x18000000 << -214;
        mp = Long.reverse(2083987655641806470L);
        mq = Long.reverse(0x6200000000000000L);
        mr = (397312 >>> 108 | 397312 << -108) & 0xFFFFFFFF;
        ms = Long.reverse(2083987655641806470L);
        mt = Long.reverse(0x6200000000000000L);
        mu = Integer.reverse(0x50000000);
        mv = Integer.reverse(0x46000000);
        mw = Integer.reverse(-1);
        mx = Long.reverse(9145631871358744198L);
        my = 320 >>> 197 | 320 << ~197 + 1;
        mz = 3168 >>> 197 | 3168 << ~197 + 1;
        na = Integer.reverse(-1);
        nb = Long.reverse(9145631871358744198L);
        nc = Long.reverse(0x7800000000000000L);
        nd = Integer.reverse(0x26000000);
        ne = Long.reverse(2083987655641806470L);
        nf = Long.reverse(0x6200000000000000L);
        ng = Long.reverse(-6917529027641081856L);
        nh = -1811939327 >>> 186 | -1811939327 << ~186 + 1;
        ni = Integer.reverse(-1509949440);
        nj = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[nh];
        var_java_lang_String_arr_b = new String[ni];
        NLoginCore_523.void_b();
        q = nj;
    }

    public void a(NLoginCore_199 NLoginCore_1992) {
        byte[] byArray;
        block21: {
            try {
                Object[] objectArray = new Object[kj];
                objectArray[NLoginCore_523.kk] = NLoginCore_532.u.a(new Object[kl]);
                objectArray[NLoginCore_523.km] = NLoginCore_532.r.a(new Object[kn]);
                objectArray[NLoginCore_523.ko] = NLoginCore_532.t.a(new Object[kp]);
                Object[] objectArray2 = new Object[kq];
                objectArray2[NLoginCore_523.kr] = NLoginCore_523.c("㺃", (int)(ks & kt), (long)ku);
                try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginCore_523.c("㺀", (int)kg, (long)(kh ^ ki)), objectArray), objectArray2);){
                    ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                    if (!resultSet.next()) {
                        byArray = new byte[kv];
                        new SecureRandom().nextBytes(byArray);
                        Connection connection = this.var_com_nickuc_login_NLoginCore_459_b.java_sql_Connection_a();
                        try {
                            Object[] objectArray3 = new Object[kz];
                            objectArray3[NLoginCore_523.la] = NLoginCore_532.r.a(new Object[lb]);
                            objectArray3[NLoginCore_523.lc] = NLoginCore_532.t.a(new Object[ld]);
                            objectArray3[NLoginCore_523.le] = NLoginCore_532.u.a(new Object[lf]);
                            try (PreparedStatement preparedStatement = connection.prepareStatement(String.format((String)NLoginCore_523.c("㺆", (int)kw, (long)(kx ^ ky)), objectArray3));){
                                preparedStatement.setString(lg, (String)NLoginCore_523.c("㺉", (int)lh, (long)(li ^ lj)));
                                preparedStatement.setBytes(lk, byArray);
                                preparedStatement.execute();
                                break block21;
                            }
                        }
                        catch (Exception exception) {
                            throw new IllegalArgumentException((String)NLoginCore_523.c("㺌", (int)ll, (long)(lm ^ ln)), exception);
                        }
                        finally {
                            this.var_com_nickuc_login_NLoginCore_459_b.a(connection);
                        }
                    }
                    byArray = resultSet.getBytes(lo);
                    if (byArray == null || byArray.length == 0) {
                        throw new IllegalArgumentException((String)NLoginCore_523.c("㺏", (int)lp, (long)(lq ^ lr)));
                    }
                }
            }
            catch (Exception exception) {
                throw new IllegalArgumentException((String)NLoginCore_523.c("㺒", (int)ls, (long)lt), exception);
            }
        }
        NLoginCore_1992.b(byArray);
    }

    @Generated
    public NLoginCore_459 com_nickuc_login_NLoginCore_459_a() {
        return this.var_com_nickuc_login_NLoginCore_459_b;
    }

    @Generated
    public NLoginType_008 com_nickuc_login_NLoginType_008_b() {
        return this.var_com_nickuc_login_NLoginType_008_k;
    }

    private static void void_b() {
        int n;
        var_long_c = 7020033597024491320L;
        long l = var_long_c ^ 0x596740DDE808F057L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(23 + 46), (byte)(68 + 15), (byte)(24 + 23), (byte)(9 + 58), (byte)(6 + 60), 67, 47, (byte)(40 + 40), (byte)(33 + 42), (byte)(55 + 12), (byte)(58 + 25), (byte)(37 + 16), (byte)(50 + 30), (byte)(86 + 11), (byte)(19 + 81), (byte)(55 + 45), (byte)(73 + 32), (byte)(43 + 67), (byte)(2 + 101)}, StandardCharsets.UTF_8));
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
                    NLoginCore_523.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ŲƕƒƂƚŸƢŹƑťƟƤƔżƬƚƉůŰůƢƢƱƉƣƔưƧƎƳŻƬ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ƀƜƃƚŷƥƖţſƔŷƔƀŻŽƉƏƊƟƈƩƣźŻ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ԖԞԛөӻԫԀөӺӳӰԦԣԎԗԲԑӹԏԴԔԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[3] = NLoginCore_076.C("ԊԦԍԤԁԯԠӭԉԞԁԞԊԅԇԓԙԔԩԒԳԭԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[4] = NLoginCore_027.E("յսպՈ՚֊՟ՈՙՒՏօւխն֑հ՘ծ֓ճնգդ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[5] = NLoginCore_559.F("ճՔյոտտվր֍ճՌէՓ֒խչՔՓֈ֍֙֘է֔ՠձ֡՚֑֘եճս֪ցշ֧֟֜֐֤ըջո", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[6] = NLoginCore_451.B("ƊūƌƏƖƖƕƗƤƊţƠƩŵƉƫƇűźŽŬƇƠƴƃƅƂųƲƊƽƼƛŽƙƚƢƯƛƨƩƱƴƔƺƄƬƫƇǈƳƤƔƝƚƛ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[7] = NLoginCore_138.A("ŠŽƏŝŵŝơƗŵŲŶƪƖŧƦŨƢƅƏƔƯŵưƮƯƙƨųƫƬƓƔ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[8] = NLoginCore_324.E("աէշՙք՗քպթվ՟՘", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[9] = NLoginCore_027.F("դյՈգ՛աքսբգՓ֎օշժց֕ճ֜ս֓ո֕ՙ֔փռնւպց֟֒ֈա֢֗լ֭֋֮օ֢քհ֖֨ֆ֏ִ֓նִֆ֐ֹֽ֬֞֗֡քּ֒", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[10] = NLoginCore_027.A("ƎŮƔƚƖŵŻűŦŵƟƊżƪƨƉƄůƏŮƇŵƗƓƭƷƔŶŸƜƊƫǀƻƓƗƽſƀƐƒƵƦƽƵƹƢƥƨƉƍƯǑǈǃƉƥƕƥƖƤưƗƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[11] = NLoginCore_091.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơůƂƊƃƐŲŶƑƲƒư", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[12] = NLoginCore_559.A("ŴŜƗřŵŻŰťŞƈŨŧƃƩƂƏŨƈžŮƆƱƷƌƵƋƋƺƴƞƷźƈǁƴǂǀƮƷƇǈǉƾƾƣƪƢƥƧǌƨƨƦǔƾƟƠƷƮƕǜƛƮƱ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[13] = NLoginCore_427.F("է՚էՆՠվ՗ՊօՌռէտժ֍եՋհ֚֌֊՘իճլչ՛՟պ֛ջ֙", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ֆպՉՄտէՋ֎կ֏Յւըֈՠօ֍փ֖պ֎ևն֑֔ծ՞ջ֐նջ֓յա֖֤֠֎տ֜֙֠֟տյֶ֘ք֍ֻ֨֩֙ֆփք", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[15] = NLoginCore_091.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơůƂƊƃƐŲŶƑƲƒư", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[16] = NLoginCore_384.C("ԙԇӪԞԜԫԝԠԑԪԞԮԢԔԹԃԯԨԎԔԯԭԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[17] = NLoginCore_201.A("ƐżƗƖŶŭƤŢŦŲƘů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[18] = NLoginCore_223.F("ՕրօՃՌՙտհդ՞֊էևկ֗ՠմ֊ռյՓղ֠֡ն֚իջ֍փ՞զո֪չև֧իոְռխֈ֮֯֎ք֣֫։ֽ֯մ֖փք", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[19] = NLoginCore_384.B("ƜƏƢƟŠƁƟƞƃťƆžơƄŠƪƤƍƭūƥƔůŶƗŴƚŭƽŽƊƭƩƻƞưƼƅƧǁſƳƒƏ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[20] = NLoginCore_027.F("օո֋ֈՉժֈևլՎղս֎ւաՖ֗֔ղ։սնգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[21] = NLoginCore_138.B("ƎƜŻūƜŶſƂƞšŲů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[22] = NLoginCore_324.F("րս՗ռՅ֎տօՌդ֑՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[23] = NLoginCore_076.C("ӵӺԚԦԈӷӦӣԚԴӼӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[24] = NLoginCore_446.E("օո֋ֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՐ֏֏կ֍փ֚֜ֆշ֕", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[25] = NLoginCore_138.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁŧƦƦƆƤƚƱƳƝƎƬ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[26] = NLoginCore_138.F("օո֋ֈՉժֈևլՎկևՑ֓ղմ՘մքխհ֑ս֖֝֐ք֢ռ՘գ֞", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[27] = NLoginCore_091.C("ԦԙԬԩӪԋԩԨԍӯԓԂԪӲԊԶӸԏԋԎӷԲӽԭԟԱԌԶԤԣԼՃՂԊԵԋՇՇԾԥՌՀԳԤԿՐԖԵՂՉ՝Ե՞ԷԤԥ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[28] = NLoginCore_027.C("ӺԥԂӣӿԚԞԛԪԢԠԉԥԠԒԖԚԋԊԻԻӽԒԴԣԸԿԶԟԖԓԕԟԾՋԷԋԉԼԨԫԎՇՈՋԪԑ՗ԚՅՄԓՉՇԙՌբ԰գԭԜ՗Ղե՝՛՞ՌգՍՇԣՄհԼԹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[29] = NLoginCore_201.C("ӺԥԂӣӿԚԞԛԪԢԠԉԥԠԒԖԚԋԊԻԻӽԒԴԣԸԿԶԟԖԓԕԟԾՋԷԋԉԼԨԫԎՇՈՋԪԑ՗ԚՅՄԓՉՇԙՌբ԰գԭԜ՗Ղե՝՛՞ՌգՍՇԣՄհԼԹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[30] = NLoginCore_004.F("օո֋ֈՉժֈևլՎկևՑ֓ղմ՘մքխհ֑ս֖֝֐ք֢ռ՘գ֞", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[31] = NLoginCore_223.B("ƜƏƢƟŠƁƟƞƃťƆƞŨƪƉƋůƋƛƄƇƨƔƭƴƧƛƹƓůźƵ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[32] = NLoginCore_173.D("ԢԥԡԉԜӹӧӺԬ԰ԭԮԕԓԓԎӷԛԻԓԶԲԔԩԓԖԎӿԏԄԖԵԖԻՈԫԉԯԱԿԧԐԬԙ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[33] = NLoginCore_092.D("ԋӝԈԭԝӨөԄԞԅԜӾԓӲԔԉԨԒԐԭԞԌԉԊԴԫԟԡԅԴԽԹԛԚԗԋԘԾԢՇԻՒՆԙ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[34] = NLoginCore_138.E("օՇռՔցֈՉհ՛օգփբՕՏկզխՑշ֞֜գդ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[35] = NLoginCore_092.D("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[36] = NLoginCore_027.C("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[37] = NLoginCore_091.F("՝ըբօվ֏՜ՆՍկց՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[38] = NLoginCore_559.C("ԦӨԝӵԢԩӪԑӼԦԄԤԃӶӰԐԇԎӲԘԿԽԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[39] = NLoginCore_027.C("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[40] = NLoginCore_324.E("ր՞ՖՔփծհլվ֑ց՘", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[41] = NLoginCore_324.A("ŴſŹƜƕƦųŝŤƆƘů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[42] = NLoginCore_387.D("ԙԇӪԞԜԫԝԠԑԪԞԮԢԔԹԃԯԨԎԔԯԭԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[43] = NLoginCore_027.F("չերտ՟Ֆ֍ՋՏ՛ց՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[44] = NLoginCore_110.D("ӶԡԦӤӭӺԠԑԅӿԫԈԨԐԸԁԕԫԝԖӴԓՁՂԗԻԌԜԮԤӿԇԙՋԚԨՈԌԙՑԝԎԩՐՏԯԥՄՌԪՐ՞ԕԷԤԥ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[45] = NLoginCore_138.A("ƜƏƢƟŠƁƟƞƃťƆžơƄŠƪƤƍƭūƥƠűŭƳƇƩƪƥŹƾƔŹƁưƠƄƴƲƞƆƆƅǆƙƘƌǂǀƨǏƑƿǓƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[46] = NLoginCore_324.D("ԢԥԡԉԜӹӧӺԬ԰ԬԊԌԦԵԈԫӴԭԚԒԲԖӳԐԬӼԱӿԡՁԲԀԪԈԾԯՌ԰ՄԛՒԫԩՉԭԊԦԤ՜ԎԼ԰ԧԤԥ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[47] = NLoginCore_223.B("ƁœžƣƓŞşźƔŻƒŴƉŨƊſƞƈƆƣƔƂſƀƪơƕƗŻƪƳƯƑƐƍƁƎƴƘƽƱǈƼƏ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[48] = NLoginCore_324.F("ոզՉսջ֊ռտհ։տ՝՞րֆ֙Րգ֗Քՙ֌գդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[49] = NLoginCore_027.D("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[50] = NLoginCore_027.D("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԻԭԖԛԏԥӻԔԨԅԉ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[51] = NLoginCore_559.A("ƜƏƢƟŠƁƟƞƃťƇŷƠƇŦƋƞƟźƢƱƑƷƒŴưƸƺƌŷƖƾƠƛžǀưƒƺƚƟƛƚƏ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[52] = NLoginCore_451.F("օո֋ֈՉժֈևլՎղս֎ւաՖ֗֔ղ։սնգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[53] = NLoginCore_559.A("ƎƜŻūƜŶſƂƞšŲů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[54] = NLoginCore_451.C("ԡԞӸԝӦԯԠԦӭԅԲӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[55] = NLoginCore_091.F("ՔՙչօէՖՅՂչ֓՛՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[56] = NLoginCore_324.F("օո֋ֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՐ֏֏կ֍փ֚֜ֆշ֕", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[57] = NLoginCore_027.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁŧƦƦƆƤƚƱƳƝƎƬ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[58] = NLoginCore_387.D("ԦԙԬԩӪԋԩԨԍӯԒԉԖԱԯԋӺԤӹԽԶӿԜԘԯԺԃӻԶԃԩԠ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[59] = NLoginCore_559.E("օո֋ֈՉժֈևլՎղա։Ցթ֕՗ծժխՖ֑՜֌վ֐ի֕փւ֛֢֡թ֔ժ֦֦֝ք֫֟֒փ֞֯յּֽ֖֔֡֨֔փք", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[60] = NLoginCore_384.F("ՙքաՂ՞չսպ։ցր։ց֖է։֋֌ծթՏզգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[61] = NLoginCore_201.C("ӺԥԂӣӿԚԞԛԪԢԡԪԢԷԈԪԬԭԏԊӰԇԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[62] = NLoginCore_027.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŵƒƎƥưŹűƬŹƟƖ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[63] = NLoginCore_201.F("օո֋ֈՉժֈևլՎձըյ֐֎ժՙփ՘֜֕՞ջշ֎֙բ՚֕բֈտ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[64] = NLoginCore_384.B("ƕƚƜƢžŸŴƏŻƞƆů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[65] = NLoginCore_110.E("օՇռՔցֈՉհ՛օգփբՕՏկզխՑշ֞֜գդ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[66] = NLoginCore_453.A("şƜƟźųƐŞŷƝƞƋžƃƪƧŭƁůƣƏƇƣźŻ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[67] = NLoginCore_324.E("ր՞ՖՔփծհլվ֑ց՘", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[68] = NLoginCore_027.C("ӾԉԃԦԟ԰ӽӧӮԐԢӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[69] = NLoginCore_451.D("ԦӨԝӵԢԩӪԑӼԦԄԤԃӶӰԐԇԎӲԘԿԽԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[70] = NLoginCore_453.D("өԦԩԄӽԚӨԁԧԨԕԈԍԴԱӷԋӹԭԙԑԭԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[71] = NLoginCore_110.C("ԡӿӷӵԤԏԑԍԟԲԢӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[72] = NLoginCore_027.D("ӾԉԃԦԟ԰ӽӧӮԐԢӹ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[73] = NLoginCore_092.C("ԙԇӪԞԜԫԝԠԑԪԠӾӿԡԧԺӱԄԸӵӺԭԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[74] = NLoginCore_427.B("ƗŵŭūƚƅƇƃƕƨƘů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[75] = NLoginCore_092.F("ձՅՔրոէլր՝Ւօքբթն֒֋չփկՕ֚֌յպծք՚ճևդը", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[76] = NLoginCore_091.D("ԦԙԬԩӪԋԩԨԍӯԑԁԪԑӰԕԨԩԄԬԻԙԯՂԂԫԮӷ԰ԃՇԓԗԦՉԄՉԿԆԧԢԛԠԦԣՋԲ՚ՕՒԙԜԛԷԤԥ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[77] = NLoginCore_451.E("շՒըՇզ։։վգ՛֓ՠտխՎոմ։֖֌֒ռ֖ձծփ֜ա֚֙զ֡", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[78] = NLoginCore_387.C("ԆӥԬԩԢԠԥӺԑԩӽԂԞԟԸԅӲԙԓԽӼӾԺԍӿԂԒӾՁԙԞԖ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[79] = NLoginCore_110.B("ƊūƌƏƖƖƕƗƤƊŤƕŪũźƩƁƬƤƧųƦƶŭƴƍƛƕưƙƋƲƲƔƔƒǄƦƶƹǅƁƜƕƶǍƝƛǆƈƈƦƯƩƈƏơǏƩǐƎǍǆƗ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[80] = NLoginCore_110.C("ӾԉԃԦԟ԰ӽӧӮԐԢӹ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[81] = NLoginCore_324.F("ճՔյոտտվր֍ճՋվկզհ՗ճնհ֌֊յտմճ֌՜ձ֙ա֥֒ձ֡֜ը֬֬։֧֤լև֋ְִֶ֖֑֪֬֗֝֍ַָּ֛֣ռ֤֡־֠քֵַ׊֨׃ׅ֨׋׃ׅ֘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[82] = NLoginCore_027.A("ƎŮƔƚƖŵŻűŦŵƟƊżƪƨƉƄůƏŮƇŵƗƓƭƷƔŶŸƜƊƫǀƻƓƗƽſƀƐƒƵƦƽƵƹƢƥƨƉƍƯǑǈǃƉƥƕƥƖƤưƗƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[83] = NLoginCore_091.C("ӣӻӣԧԧӻԥԟԯӥӰԵӭԌӶԤԨԐԤԛԧԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[84] = NLoginCore_384.B("ŴŜƗřŵŻŰťŞƈŨŧƃƩƂƏŨƈžŮƆƱƷƌƵƋƋƺƴƞƷźƈǁƴǂǀƮƷƇǈǉƾƾƣƪƢƥƧǌƨƨƦǔƾƟƠƷƮƕǜƛƮƱ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[85] = NLoginCore_092.D("ӣӻӣԧԧӻԥԟԯӥӰԵӭԌӶԤԨԐԤԛԧԗԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[86] = NLoginCore_559.D("ԔӵԖԙԠԠԟԡԮԔӬӯԷԩӵԍԈԏԆ԰ԟӽԈԀԻԸԯԣԝԥԠԱՄՄԸԼԍՉԮԨԝՅՑՏԐԗԹԗԢԖՄ՞՞ԧԤԥ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[87] = NLoginCore_110.B("żśƢƟƘƖƛŰƇƟŴƜƠƍƅƃƏƠŬƉƁƎƄƤƀŲƴƲƽƹŵƫƷƓƗƍƴƀƛƽƇƲƪƏ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[88] = NLoginCore_427.A("ƊūƌƏƖƖƕƗƤƊţƅŤƜƆŪƚƦŻſƌƴƕƭƙŹƢƳƴƶƔƝƩƸƯƤƚƀƷƱƔƙƲƕƩƭǆƙǊƨƤƟǕƭƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[89] = NLoginCore_559.B("ƉşśūŲůŰƠŽƓƘƨťƬƁƤůƅŲƢưƳźŻ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[90] = NLoginCore_091.B("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[91] = NLoginCore_446.D("ԝԊԘԕӧӮԜԄԯӳ԰ԑԵԠԆӳӲԛԏԗԻԽԄԅ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[92] = NLoginCore_092.A("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[93] = NLoginCore_110.E("՛յ֊ըՇնրՊւէՏՍֆխօ֋Ֆըֈմո֜գդ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[94] = NLoginCore_223.A("ƀřžƋƤųƝƅƅƠƨů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[95] = NLoginCore_092.C("ӨԊӻԎԉԢԌԱԥԴԆӿԵӵԴԷԪԈԔԨӰԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[96] = NLoginCore_559.F("եՄ֋ֈցտքՙհֈ՜ասվ֗դՑող֜՛՝֙լ՞աձ՝֠ոսյ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[97] = NLoginCore_027.C("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ԰ԝԝԽԼԷՃԠՃԽԿԾՅԵԞԫՄԡԆԩՏՒԄՄԞՐԎԭԴԷԳԹԨԷՐՋԜՓԿ԰ԭԹՐդՇՈ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[98] = NLoginCore_027.C("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ԰ԝԝӺԕԝԀӿԳՄԕԁԧԪԂԴԚԟԠԜԾՎԣԜԱԦԯԣԑԷԴՌՓԘԼԧԤԥ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[99] = NLoginCore_451.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƹżƫƿƑžƎƆƅǈƒǃƢǆǊƍƽǊƐǂƿǍǌǖƗƖƚƯǄƷƾƳ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[100] = NLoginCore_384.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƗƲƊžƠƑƀƲưƩƁƷǊƺƠǆƻǅƋƎǆƎƠƷǏƥƸǛƔưǚǠ", (byte)84, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_523.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŲƕƒƂƚŸƢŹƑťƟƤƔżƬƚƉůŰůƢƞƤƎŪƄƅƏƮƝƫƯ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[1] = NLoginCore_427.C("ԊԦԍԤԁԯԠӭԉԞԂԎԎԍԔԏԨԏԬӵԜԇԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[2] = NLoginCore_138.F("յսպՈ՚֊՟ՈՙՒՏմ֍֎շՖ֕֎Ց֌Ք֌գդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ƀƜƃƚŷƥƖţſƔŶƣƆƂƝƅźżūƄųƳźŻ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[4] = NLoginCore_027.F("յսպՈ՚֊՟ՈՙՒՏիֈնդֈ֘խքճֆ֖֕՝֜ց֟լֆ֐֚ղ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[5] = NLoginCore_201.C("ԔӵԖԙԠԠԟԡԮԔӭԈӴԳԎԚӵӴԩԮԺԹԈԵԁԒՂӻԹԲԆԔԖԨԿԋԍՁՃԃԯՔԬՈՈԱՎԦԻԶՇ՘ՐԧԤԥ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[6] = NLoginCore_324.A("ƊūƌƏƖƖƕƗƤƊţƠƩŵƉƫƇűźŽŬƇƠƴƃƅƂųƲƊƽƼƛŽƙƚƢƯƛƨƩƱƴƪƽƵƶƫơƫƽƦǃƭƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[7] = NLoginCore_387.C("ӪԇԙӧӿӧԫԡӿӼԀԴԠӱ԰ӲԬԏԙԞԹӷӿԵԕӻԣԔԲԀԙԝՆԅԚԄԾՆԍՏԐԌԜԙ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[8] = NLoginCore_091.F("ւՙՙժխ֋ՙֈՋփ՟՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[9] = NLoginCore_559.F("դյՈգ՛աքսբգՓ֎օշժց֕ճ֜ս֓ո֕ՙ֔փռնւպց֟֒ֈա֢֗լ֭֋֮օ֢քհ֖֨ֆ֏ִ֓նִֻ֖֕֘֫տֵֹֹֽֿ֑֢֢֝֕֡։֬֙֬֊֘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[10] = NLoginCore_384.D("ԘӸԞԤԠӿԅӻӰӿԩԔԆԴԲԓԎӹԙӸԑӿԡԝԷՁԞԀԂԦԔԵՊՅԝԡՇԉԊԚԜԿ԰ՇԿՃԬԯԲԓԗԹ՛ՒԜԯՊՌ՝ԷԜԿՅթՕԤ՜՚ՂՂՃբբՋ՞Թ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[11] = NLoginCore_427.B("žűžŝŷƕŮšƜţƓžƖƁƤżŢƇƱƣơŭŲƧƴƄƲŴƵƙưƛ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[12] = NLoginCore_451.F("՝ՅրՂ՞դՙՎՇձՑՐլ֒իոՑձէ՗կ֚֠յ֞մմ֣֝և֠գձ֪֝֫֩֗֠հֱֲ֧֧֌֓֋֎֐ֵ֑֑֏ֽֿ֭֙֍ռ֌ֶ֢֗֗", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[13] = NLoginCore_453.C("ԈӻԈӧԁԟӸӫԦӭԝԈԠԋԮԆӬԑԻԭԫՀԉԐԸԶӽӻԿԃԩԜ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[14] = NLoginCore_092.E("ֆպՉՄտէՋ֎կ֏Յւըֈՠօ֍փ֖պ֎ևն֑֔ծ՞ջ֐նջ֓յա֖֤֠֎տ֖֜֙֠֝֯֕֒ն֧֬ք֨֐ֆֺղֺֿֿջ֏ׇֽ֦", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[15] = NLoginCore_091.F("է՚էՆՠվ՗ՊօՌռէտժ֍եՋհ֚֌֊֚֜չ՘լա֐հօ֚պ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[16] = NLoginCore_427.B("ƏŽŠƔƒơƓƖƇƠƕŽƛƗƫŽŧŪƪơƄƊƋƄƶƗŹŲƭƾƛƠ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[17] = NLoginCore_201.A("ŝşřűšŵűƄƩŦťů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[18] = NLoginCore_004.B("ŬƗƜŚţŰƖƇŻŵơžƞƆƮŷƋơƓƌŪƉƷƸƍƱƂƒƤƚŵŽƏǁƐƞƾƂƏǇƓƄơƹƛƕƢƚƝǑǐơƠƭƚƛ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[19] = NLoginCore_027.F("օո֋ֈՉժֈևլՎկէ֊խՉ֓֍ն֖Ք֎ս՘՟ր՝փՖ֦զճ֖ա֣ֆ֕֊ց֛խ֚֊֡ո", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[20] = NLoginCore_173.D("ԦԙԬԩӪԋԩԨԍӯԐԀԌԔԙӱӬԺӻӻԎԧԻԷԕՁԽԳԼӹԆԻ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[21] = NLoginCore_138.F("թտՄՙբՊՎև՚ՐՉ֌Ս֏ՠ֊։֙ք֏֜նգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[22] = NLoginCore_324.A("űŻśſƚŰţŶƨƘŶů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[23] = NLoginCore_453.B("ƋƏŵƕƞşƘƚƣƖƨů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[24] = NLoginCore_453.F("օո֋ֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՕկծծ֑֎ք֥֥֤֜յ֦ը֨֍֊֢լ֪֋֥ո", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[25] = NLoginCore_201.E("օո֋ֈՉժֈևլՎղՍֆվթկ֊ֆֈշժՖ֘֌֍՛յ՞կ՟֧հ֔ըզլ֣֍ֈ֍տխ֝ո", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[26] = NLoginCore_223.A("ƜƏƢƟŠƁƟƞƃťƆƞŨƪƉƋůƋƛƄƇƬůƎƥƁƎƜźƽŸƐ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[27] = NLoginCore_201.D("ԦԙԬԩӪԋԩԨԍӯԓԂԪӲԊԶӸԏԋԎӷԲӽԭԟԱԌԶԤԣԼՃՂԊԵԋՇՇԾԥՌՀԲԐԲԍԡԺՏԷԻԚՕԧԤԥ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[28] = NLoginCore_223.F("ՙքաՂ՞չսպ։ցտըքտձյչժթ֚֚՜ձ֓ւ֗֞֕վյղմվ֪֖֝ժը֛և֊խ֦֧֪։հֶչ֤֣ղ֦֨ոׁ֫֏ׂ֌ջֶׇֻׁ֡ׄ֩տֽ֪֤֠֠֜֘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[29] = NLoginCore_091.F("ՙքաՂ՞չսպ։ցտըքտձյչժթ֚֚՜ձ֓ւ֗֞֕վյղմվ֪֖֝ժը֛և֊խ֦֧֪։հֶչ֤֣ղ֦֨ոׁ֫֏ׂ֌ջֶ֡ׄւ֥֥֨׌׊ֈ֏ׄ֯֫֘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[30] = NLoginCore_223.E("օո֋ֈՉժֈևլՎկևՑ֓ղմ՘մքխհ֓ծնռփ՛֠՜եոս", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[31] = NLoginCore_384.E("օո֋ֈՉժֈևլՎկևՑ֓ղմ՘մքխհ֍֛֏֝ծ֍֒յռ֛փ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[32] = NLoginCore_173.A("ƘƛƗſƒůŝŰƢƦƣƤƋƉƉƄŭƑƱƉƬƨƊƟƉƌƄŵƅźƌƫǀŻŻǃǂǅǆƱǆǃƞƏ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[33] = NLoginCore_427.D("ԋӝԈԭԝӨөԄԞԅԜӾԓӲԔԉԨԒԐԭԞԌԉԊԴԫԟԡԅԴԽԹԤՃԅՋՄԏԨԤՍՁԏԙ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[34] = NLoginCore_575.D("ԦӨԝӵԢԩӪԑӼԦԆԬԄԟԠԳԒԒӵԦԬӺԞԋӽԁӺՄԄԛԔԷ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[35] = NLoginCore_201.F("Ոօֈգ՜չՇՠֆևմՆ՝֑կ֘֎֘Ֆ֔Ք֜գդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[36] = NLoginCore_092.A("ƗŮƂƒƠƟŻƅŶƦƂů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[37] = NLoginCore_027.B("ƟŹŰƌƣƎŲŹƦƈťů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[38] = NLoginCore_223.C("ԦӨԝӵԢԩӪԑӼԦԄӲԗԵԉԌԦӺԻԍ԰ԽԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[39] = NLoginCore_451.C("өԦԩԄӽԚӨԁԧԨԔԭӭԏԀӳӰԺӲԅԵԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[40] = NLoginCore_138.F("՜Ձֈփն֊չ՚րրէ՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[41] = NLoginCore_138.B("ſƕƂŚŰƣŽƏƟƙŲů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[42] = NLoginCore_138.E("ոզՉսջ֊ռտհ։վճբ֑֏կ֚՗ձֈսյվպղ՞՚֝օոշ֚", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[43] = NLoginCore_324.F("եՃւՃլՅպւրբս՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[44] = NLoginCore_027.E("ՕրօՃՌՙտհդ՞֊էևկ֗ՠմ֊ռյՓղ֠֡ն֚իջ֍փ՞զո֪չև֧իոְռխ֊փ֣ձձ֋ֈւֻ֊֌ּփք", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[45] = NLoginCore_138.E("օո֋ֈՉժֈևլՎկէ֊խՉ֓֍ն֖Ք֎։՚Ֆ֜հ֒֓֎բ֧սբժ֙։խ֛֝ևկկձֱֶ֧֓ն֍նքּּ֙փք", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[46] = NLoginCore_201.C("ԢԥԡԉԜӹӧӺԬ԰ԬԊԌԦԵԈԫӴԭԚԒԲԖӳԐԬӼԱӿԡՁԲԀԪԈԾԯՌ԰ՄԛՒԩՈԮԵ՘ԥՃԍԤԩԼԵԩ՜ԵՏԴԷՄՓբԦ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[47] = NLoginCore_091.A("ƁœžƣƓŞşźƔŻƒŴƉŨƊſƞƈƆƣƔƂſƀƪơƕƗŻƪƳƯƗƩƶƙƏƯƣƕƓƷƀƸǈǎƤƗǂǉƒƧƮǓƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[48] = NLoginCore_223.B("ƏŽŠƔƒơƓƖƇƠƔƤƫţžŧƭƒƈƥžƤƞŵŲƇŰŴƄƺƽƒ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[49] = NLoginCore_324.A("ƠŶšŻŬƝźŤƐŧũů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[50] = NLoginCore_575.C("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԷԛӳԪӺԁԐԠԠӺՀԟԔՃԹԹԍԐՆԉԧՒԙ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[51] = NLoginCore_110.C("ԦԙԬԩӪԋԩԨԍӯԑԁԪԑӰԕԨԩԄԬԻԛՁԜӾԺՂՄԖԁԠՈԩԜՃӿԛՄՆՅՁԿԬԙ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[52] = NLoginCore_091.B("ƜƏƢƟŠƁƟƞƃťƈƓƝŹƚƚƄŰūƳŽƌƋƢƤƳƛƗƱƾƍƩ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[53] = NLoginCore_384.F("մՆՕ՛ա֎Ձ֌Սղֈՠբլկ֌֙հ֐֛ե֜գդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[54] = NLoginCore_091.F("։ՕէՊ֍Չ֏ձ՜Ջ՟՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[55] = NLoginCore_451.E("շ՗ճւրՅՍՇ֒Ցճ՘", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[56] = NLoginCore_201.B("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁųƢŰƬƢƕƍưƾƓƐƻƁƝƕƐƍƚƶưƗƒƏ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[57] = NLoginCore_384.A("ƜƏƢƟŠƁƟƞƃťƉŤƝƕƀƆơƝƟƎƁůƪƄƒƊƕƧƇƔƩŶƟƋƺƽƌƷƿƼžƑƦƏ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[58] = NLoginCore_201.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŲŶƍƌŸƹŻƹƜƝƠ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[59] = NLoginCore_201.A("ƜƏƢƟŠƁƟƞƃťƉŸƠŨƀƬŮƅƁƄŭƨųƣƕƧƂƬƚƙƲƹƸƀƫƁƽƽƴƛǂƶƦƁƠǌƢƆǂƢƍƞǊƝƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[60] = NLoginCore_575.C("ӺԥԂӣӿԚԞԛԪԢԡԤԳ԰ԅԴԷԔԧԴԼԵӹӷԯՀӿՃԔԙԴԾ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[61] = NLoginCore_575.E("ՙքաՂ՞չսպ։ցվցյօձօՙ֏֐Փ֞է֜Ֆպ՚֏՜ոս֝ն", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[62] = NLoginCore_091.F("օո֋ֈՉժֈևլՎձըյ֐֎ժՙփ՘֜֕Օհկ֢֓մ֍՝֣վզ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[63] = NLoginCore_110.A("ƜƏƢƟŠƁƟƞƃťƈſƌƧƥƁŰƚůƳƬŬƋƕƢŷŵƄƩƛƍƨ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[64] = NLoginCore_076.F("Փ՛ջբխժՊէպ՞։ցՐմաՕֆ֏֖զլ֜գդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[65] = NLoginCore_384.E("օՇռՔցֈՉհ՛օգվփՌՒ՗֔ՙպպշ֙ՙ֓շշ֛֞շո֙֝", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[66] = NLoginCore_201.F("Ոօֈգ՜չՇՠֆևռփՒւր֍Ջՙ֛եշնգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[67] = NLoginCore_559.F("՛վօպՅֆ՟՟խ֒ի՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[68] = NLoginCore_027.A("ƚŘƃƞƝżƥƟƞƙťů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[69] = NLoginCore_387.C("ԦӨԝӵԢԩӪԑӼԦԆԃԤԈԷԖԬԦԌԍԵԇԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[70] = NLoginCore_027.E("Ոօֈգ՜չՇՠֆևջՌօլՔըթմՖը֝֌գդ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[71] = NLoginCore_027.F("Հ՞դ։ի֊ըօ՛֍֍՘", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[72] = NLoginCore_091.D("ӵӫӦԇөԄԄԚԧԁԔӹ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[73] = NLoginCore_559.C("ԙԇӪԞԜԫԝԠԑԪԠӴӵԣӳԮԬԴԄԏԙԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[74] = NLoginCore_138.B("ŨƖŸƍƁżơƀƆŤƆů", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[75] = NLoginCore_223.C("ԒӦӵԡԙԈԍԡӾӳԦԥԃԊԗԳԬԚԤԐӶԸӼӳԏՃԌԙԲԡՆԡԉԡԊԺԬԯԂԯԫՑՊԙ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[76] = NLoginCore_223.A("ƜƏƢƟŠƁƟƞƃťƇŷƠƇŦƋƞƟźƢƱƏƥƸŸơƤŭƦŹƽƉƍƜƿźƿƵżƝƘƑƘƹƺƾƌƢǆǇƽǇƍǓƚƛ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[77] = NLoginCore_559.F("շՒըՇզ։։վգ՛֓ՠտխՎոմ։֖֌֒ոոո֑֙֜֘֞֟օբ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[78] = NLoginCore_138.F("եՄ֋ֈցտքՙհֈ՜ասվ֗դՑող֜՛՘՜֑֚֐ռ֐՟֚ֈ֣ը֞֌ս֨֊֚ծ։ֈ֭ո", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[79] = NLoginCore_027.D("ԔӵԖԙԠԠԟԡԮԔӮԟӴӳԄԳԋԶԮԱӽ԰ՀӷԾԗԥԟԺԣԕԼԼԞԞԜՎ԰ՀՃՏԋԦԟՀ՗ԧԥՐԒԒ԰ԹԵՉԜԢԳԵԗդԾ՝Փ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[80] = NLoginCore_110.A("ŲſƃŹƑŷŝťƠżƤů", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[81] = NLoginCore_387.E("ճՔյոտտվր֍ճՋվկզհ՗ճնհ֌֊յտմճ֌՜ձ֙ա֥֒ձ֡֜ը֬֬։֧֤լև֋ְִֶ֖֑֪֬֗֝֍ַָּ֛֣ռ֤֡־֠֕֔ք֟֍֝׍֣ׅׄ֝֘", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[82] = NLoginCore_427.E("շ՗սփտ՞դ՚Տ՞ֈճե֑֓ղխ՘ո՗հ՞րռ֖֠ս՟աօճ֤֔֩ռր֦ըթչջ֞֏֦֢֞֋֎֑ղնֶֺֿ֘֏ֹվ֢׀֏ִֹֆ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[83] = NLoginCore_387.F("Ղ՚Ղֆֆ՚քվ֎ՄՏձևյւգմՖ֗հն֞֏ի֟լ֖չ֣֥֧ք", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[84] = NLoginCore_201.F("՝ՅրՂ՞դՙՎՇձՑՐլ֒իոՑձէ՗կ֚֠յ֞մմ֣֝և֠գձ֪֝֫֩֗֠հֱֲ֧֧֌֓֋֎֐ֵ֑֑֏չևִ֨֔ր֕օֵ֧֨", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[85] = NLoginCore_201.E("Ղ՚Ղֆֆ՚քվ֎ՄՑՎրժհմձ֕ջ֒ե֘֠֟֜֌շք֏֎֥մ", (byte)84, 69);
                    NLoginCore_523.var_java_lang_String_arr_b[86] = NLoginCore_092.C("ԔӵԖԙԠԠԟԡԮԔӬӯԷԩӵԍԈԏԆ԰ԟӽԈԀԻԸԯԣԝԥԠԱՄՄԸԼԍՉԮԨԝՅՐԍԢՈԏԏԨՏԛԫԺԷԤԥ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[87] = NLoginCore_387.C("ԆӥԬԩԢԠԥӺԑԩӾԦԪԗԏԍԙԪӶԓԋԘԎԮԊӼԾԼՇՃӿԵԔԞԹՃԦԙԐՀՈՄԨԙ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[88] = NLoginCore_324.F("ճՔյոտտվր֍ճՌծՍօկՓփ֏դըյ֝վ֖ւբ֋֜֝֟սֆ֒֡֘֍փթ֚֠սւ֛֭ց֊ֵ֯֩֩չֻ֐֬փք", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[89] = NLoginCore_559.B("ƉşśūŲůŰƠŽƓƛƟŻƌŭƜƯūƎƭƧƣźŻ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[90] = NLoginCore_223.F("ՠք՞՚Չչքհս։փՏփի՟֋ն֑յլեզգդ", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[91] = NLoginCore_223.D("ԝԊԘԕӧӮԜԄԯӳԮԤԁԟԎӹԉԘԑӹӷӼԩԠԷԤԘԤԔԿ԰Ի", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[92] = NLoginCore_076.C("ӪԨԩӹԣӼԋԲӮԛԍԦԢԂԈԤԣԯԤԾԔԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[93] = NLoginCore_427.C("ӼԖԫԉӨԗԡӫԣԈӲԱԧԸӱԔԍԗԴԫԨԗԄԅ", (byte)84, 67);
                    NLoginCore_523.var_java_lang_String_arr_b[94] = NLoginCore_004.A("ŷźŪƄŠŵųűşƜŠƙƟƌƁƨžƊƛūƍŽźŻ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[95] = NLoginCore_138.B("ŞƀűƄſƘƂƧƛƪŽŧƢƪƁƀƀƙƬŬƌƍźŻ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[96] = NLoginCore_559.F("եՄ֋ֈցտքՙհֈ՜ասվ֗դՑող֜՛֞շց֗պ֚֚ցօօ֙֞֞֙ր֎օջ֐֡։֥ո", (byte)84, 70);
                    NLoginCore_523.var_java_lang_String_arr_b[97] = NLoginCore_427.A("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓƳƲƭƹƖƹƳƵƴƻƫƔơƺƗżƟǅǈźƺƔǆƄƣƪƭƩƯƞƭǆƱǍƸǑƸǊƫƗƴƽǞ", (byte)84, 65);
                    NLoginCore_523.var_java_lang_String_arr_b[98] = NLoginCore_027.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠŸƪƐƕƖƒƴǄƙƒƩƅƇƉƖƋƟǉƑƠƼƝƚƛ", (byte)84, 66);
                    NLoginCore_523.var_java_lang_String_arr_b[99] = NLoginCore_110.D("ԈӻԈӧԁԟӸӫԦӭԕԯӳӰӯԫԒԌ԰ԝԝӺԕԝԀӿԳՄԕԁԧԪՃԆԵՉԛԈԘԐԏՒԜՍԬՐՔԗՇՔԚՌՉՎՓ՞՝ՓԮՕՄզՑթ", (byte)84, 68);
                    NLoginCore_523.var_java_lang_String_arr_b[100] = NLoginCore_446.B("žűžŝŷƕŮšƜţƋƥũŦťơƈƂƦƓƓŰƋƓŶŵƩƺƋŷƝƠƗƲƊžƠƑƀƲưƩƁƷǊƺƠǆƻǅƋƎǆƌƭǌƬǇƪǛƜǅƐƘ", (byte)84, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_523.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ƓƗŵŵƒƖƚŠƚƖŪƦƧŤƢƌŪƛƱűƧƀƱųƸƐƵƒƛƏŹƷ", (byte)84, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_523.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ӶԧӿԈԫӪӪԞԢԧԇԃӲԤԇӸԛԄԋԨӶԽԄԅ", (byte)84, 67);
                }
            }
        }
    }

    public static NLoginCore_459 a(NLoginType_008 NLoginType_008, NLoginCore_036 NLoginCore_0362, boolean bl) {
        switch (NLoginCore_468.g[NLoginCore_0362.ordinal()]) {
            case 1: 
            case 2: {
                NLoginCore_219 NLoginCore_2192 = NLoginType_008.com_nickuc_login_NLoginCore_219_a();
                NLoginCore_147 NLoginCore_147 = NLoginCore_323.a(NLoginCore_2192, NLoginCore_0362);
                if (bl) {
                    NLoginCore_147.a().put(NLoginCore_523.c("㺀", (int)(lu & lv), (long)lw), NLoginCore_523.c("㺃", (int)lx, (long)(ly ^ lz)));
                    NLoginCore_147.a().put(NLoginCore_523.c("㺆", (int)ma, (long)(mb ^ mc)), NLoginCore_523.c("㺉", (int)md, (long)me));
                    NLoginCore_147.a().put(NLoginCore_523.c("㺌", (int)mf, (long)(mg ^ mh)), NLoginCore_523.c("㺏", (int)(mi & mj), (long)mk));
                }
                return NLoginCore_323.a(NLoginType_008, NLoginCore_0362, NLoginCore_147, hikariConfig -> {
                    hikariConfig.setMaximumPoolSize(NLoginCore_2192.a(NLoginCore_523.c("㺀", (int)mr, (long)(ms ^ mt)), mu));
                    hikariConfig.setMinimumIdle(NLoginCore_2192.a(NLoginCore_523.c("㺃", (int)(mv & mw), (long)mx), my));
                    hikariConfig.setMaxLifetime((long)NLoginCore_2192.a(NLoginCore_523.c("㺆", (int)(mz & na), (long)nb), (int)TimeUnit.MINUTES.toMillis(nc)));
                    hikariConfig.setConnectionTimeout((long)NLoginCore_2192.a(NLoginCore_523.c("㺉", (int)nd, (long)(ne ^ nf)), (int)TimeUnit.SECONDS.toMillis(ng)));
                });
            }
            case 3: {
                File file = new File(NLoginType_008.java_io_File_c(), (String)NLoginCore_523.c("㺒", (int)(ml & mm), (long)mn));
                return NLoginCore_586.a(NLoginType_008, file, new Properties());
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_523.c("㺕", (int)mo, (long)(mp ^ mq)) + (Object)((Object)NLoginCore_0362));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_523.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("ЖикКоѝѕѫїЦѤњѨѢЫѐѲѱѩѯѩо", (byte)19, 68), NLoginCore_523.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѹыѽѬѴѽѹѐѹѽú", (byte)19, 66) + string + NLoginCore_223.B("ß", (byte)19, 66) + methodType.toString(), exception);
        }
    }

    public boolean q() {
        return this.var_com_nickuc_login_NLoginType_008_k.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().boolean_a((String)NLoginCore_523.c("㺀", (int)r, (long)s), t != 0);
    }

    public void c() {
        try {
            NLoginCore_400.J();
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_523.c("㺀", (int)(u & v), (long)w), exception, new Object[x]);
        }
        try {
            this.var_com_nickuc_login_NLoginCore_459_b.void_c();
        }
        catch (SQLException sQLException) {
            NLoginCore_370.c((String)NLoginCore_523.c("㺃", (int)y, (long)(z ^ aa)), sQLException, new Object[ab]);
        }
    }

    public void u() {
        this.var_com_nickuc_login_NLoginType_008_k.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().com_nickuc_login_NLoginCore_482_a((String)NLoginCore_523.c("㺀", (int)i, (long)(j ^ var_long_k)), l != 0).ag();
    }

    public void v() {
        this.a(cj != 0);
    }

    public void t() {
        this.var_com_nickuc_login_NLoginType_008_k.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().com_nickuc_login_NLoginCore_482_a((String)NLoginCore_523.c("㺀", (int)e, (long)(f ^ g)), h != 0).ag();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(boolean bl) {
        NLoginCore_036 NLoginCore_0362 = this.var_com_nickuc_login_NLoginCore_459_b.com_nickuc_login_NLoginCore_036_a();
        try (Connection connection = this.var_com_nickuc_login_NLoginCore_459_b.java_sql_Connection_a();
             Statement statement = connection.createStatement();){
            boolean bl2 = NLoginCore_323.a(this.var_com_nickuc_login_NLoginCore_459_b, NLoginCore_532.e.a(new Object[ck]));
            boolean bl3 = NLoginCore_323.a(this.var_com_nickuc_login_NLoginCore_459_b, NLoginCore_532.r.a(new Object[cl]));
            switch (NLoginCore_468.g[NLoginCore_0362.ordinal()]) {
                case 1: 
                case 2: {
                    if (!bl2) {
                        statement.execute((String)NLoginCore_523.c("㺀", (int)cm, (long)cn) + NLoginCore_532.e.a(new Object[co]) + (String)NLoginCore_523.c("㺃", (int)cp, (long)(cq ^ cr)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName() + (String)NLoginCore_523.c("㺆", (int)cs, (long)(ct ^ cu)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㺉", (int)cv, (long)(cw ^ cx)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName() + (String)NLoginCore_523.c("㺌", (int)cy, (long)cz) + (String)(bl ? NLoginCore_523.c("㺏", (int)da, (long)(db ^ dc)) : NLoginCore_523.c("㺒", (int)dd, (long)(de ^ df))) + (String)NLoginCore_523.c("㺕", (int)dg, (long)(dh ^ di)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName() + (String)NLoginCore_523.c("㺘", (int)(dj & dk), (long)dl) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName() + (String)NLoginCore_523.c("㺛", (int)dm, (long)(dn ^ cfr_renamed_1)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName() + (String)NLoginCore_523.c("㺞", (int)dp, (long)(dq ^ dr)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㺡", (int)ds, (long)(dt ^ du)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName() + (String)NLoginCore_523.c("㺤", (int)dv, (long)(dw ^ dx)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName() + (String)NLoginCore_523.c("㺧", (int)(dy & dz), (long)ea) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName() + (String)NLoginCore_523.c("㺪", (int)eb, (long)(ec ^ ed)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName() + (String)NLoginCore_523.c("㺭", (int)ee, (long)ef) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName() + (String)NLoginCore_523.c("㺰", (int)(eg & eh), (long)ei) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName() + (String)NLoginCore_523.c("㺳", (int)(ej & ek), (long)el));
                        statement.execute((String)NLoginCore_523.c("㺶", (int)(em & en), (long)eo) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㺹", (int)ep, (long)(eq ^ er)) + NLoginCore_532.e.a(new Object[es]) + (String)NLoginCore_523.c("㺼", (int)et, (long)eu) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㺿", (int)(ev & ew), (long)ex));
                        statement.execute((String)NLoginCore_523.c("㻂", (int)(ey & ez), (long)fa) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㻅", (int)fb, (long)fc) + NLoginCore_532.e.a(new Object[fd]) + (String)NLoginCore_523.c("㻈", (int)fe, (long)(ff ^ fg)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㻋", (int)fh, (long)(fi ^ fj)));
                    }
                    if (bl3) return;
                    statement.execute((String)NLoginCore_523.c("㻎", (int)(fk & fl), (long)fm) + NLoginCore_532.r.a(new Object[fn]) + (String)NLoginCore_523.c("㻑", (int)fo, (long)fp) + NLoginCore_532.s.a(new Object[fq]) + (String)NLoginCore_523.c("㻔", (int)fr, (long)(fs ^ ft)) + NLoginCore_532.t.a(new Object[fu]) + (String)NLoginCore_523.c("㻗", (int)(fv & fw), (long)fx) + NLoginCore_532.u.a(new Object[fy]) + (String)NLoginCore_523.c("㻚", (int)(fz & ga), (long)gb) + NLoginCore_532.s.a(new Object[gc]) + (String)NLoginCore_523.c("㻝", (int)gd, (long)ge));
                    this.a(gf);
                    return;
                }
                case 3: {
                    if (!bl2) {
                        statement.execute((String)NLoginCore_523.c("㻠", (int)gg, (long)(gh ^ gi)) + NLoginCore_532.e.a(new Object[gj]) + (String)NLoginCore_523.c("㻣", (int)(gk & gl), (long)gm) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName() + (String)NLoginCore_523.c("㻦", (int)(gn & go), (long)gp) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㻩", (int)gq, (long)gr) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName() + (String)NLoginCore_523.c("㻬", (int)gs, (long)(gt ^ gu)) + (String)(bl ? NLoginCore_523.c("㻯", (int)(gv & gw), (long)gx) : NLoginCore_523.c("㻲", (int)(gy & gz), (long)ha)) + (String)NLoginCore_523.c("㻵", (int)hb, (long)hc) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName() + (String)NLoginCore_523.c("㻸", (int)hd, (long)(he ^ hf)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName() + (String)NLoginCore_523.c("㻻", (int)hg, (long)(hh ^ hi)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName() + (String)NLoginCore_523.c("㻾", (int)(hj & hk), (long)hl) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㼁", (int)(hm & hn), (long)ho) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName() + (String)NLoginCore_523.c("㼄", (int)hp, (long)(hq ^ hr)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName() + (String)NLoginCore_523.c("㼇", (int)hs, (long)(ht ^ hu)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName() + (String)NLoginCore_523.c("㼊", (int)hv, (long)(hw ^ hx)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName() + (String)NLoginCore_523.c("㼍", (int)hy, (long)(hz ^ ia)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName() + (String)NLoginCore_523.c("㼐", (int)ib, (long)ic));
                        statement.execute((String)NLoginCore_523.c("㼓", (int)id, (long)(ie ^ cfr_renamed_0)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㼖", (int)ig, (long)(ih ^ ii)) + NLoginCore_532.e.a(new Object[ij]) + (String)NLoginCore_523.c("㼙", (int)ik, (long)(il ^ im)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)NLoginCore_523.c("㼜", (int)in, (long)io));
                        statement.execute((String)NLoginCore_523.c("㼟", (int)ip, (long)(iq ^ ir)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㼢", (int)is, (long)it) + NLoginCore_532.e.a(new Object[iu]) + (String)NLoginCore_523.c("㼥", (int)iv, (long)(iw ^ ix)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)NLoginCore_523.c("㼨", (int)(iy & iz), (long)ja));
                    }
                    if (bl3) return;
                    statement.execute((String)NLoginCore_523.c("㼫", (int)jb, (long)jc) + NLoginCore_532.r.a(new Object[jd]) + (String)NLoginCore_523.c("㼮", (int)je, (long)(jf ^ jg)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName() + (String)NLoginCore_523.c("㼱", (int)jh, (long)(ji ^ jj)) + NLoginCore_532.t.a(new Object[jk]) + (String)NLoginCore_523.c("㼴", (int)jl, (long)(jm ^ jn)) + NLoginCore_532.u.a(new Object[jo]) + (String)NLoginCore_523.c("㼷", (int)jp, (long)(jq ^ jr)));
                    this.a(js);
                    return;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_523.c("㼺", (int)jt, (long)(ju ^ jv)) + (Object)((Object)NLoginCore_0362));
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_523.c("㼽", (int)jw, (long)jx) + NLoginCore_0362.name() + (String)NLoginCore_523.c("㽀", (int)jy, (long)(jz ^ ka)), exception, new Object[kb]);
        }
    }

    public NLoginCore_523(NLoginType_008 NLoginType_008, NLoginCore_036 NLoginCore_0362) {
        this.var_com_nickuc_login_NLoginType_008_k = NLoginType_008;
        NLoginCore_370.b((String)NLoginCore_523.c("㺀", (int)var_int_a, (long)var_long_b), new Object[var_int_c]);
        this.var_com_nickuc_login_NLoginCore_459_b = NLoginCore_523.a(NLoginType_008, NLoginCore_0362, d != 0);
    }

    public boolean p() {
        return this.var_com_nickuc_login_NLoginType_008_k.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().boolean_a((String)NLoginCore_523.c("㺀", (int)m, (long)(n ^ o)), p != 0);
    }
}

