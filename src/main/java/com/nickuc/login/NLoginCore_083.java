/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Server
 *  org.bukkit.configuration.file.FileConfiguration
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_411;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
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
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;

public class NLoginCore_083
extends NLoginCore_411 {
    private static long hz;
    private static long cp;
    private static long ez;
    private static long ck;
    private static int gs;
    private static int hj;
    private static long kv;
    private static int kw;
    private static int cg;
    private static long km;
    private static int ec;
    private static int fa;
    private static long kb;
    private static long jm;
    private static long ap;
    private static long by;
    private static int bn;
    private static long eo;
    private static long bm;
    private static long eb;
    private static long gx;
    private static int bi;
    private static int ll;
    private static long ds;
    private static int gv;
    private static int eu;
    private static long di;
    private static long ga;
    private static long fi;
    private static long la;
    private static int eq;
    private static long am;
    private static long iz;
    private static int bu;
    private static long gi;
    private static int bx;
    private static long fn;
    private static int dk;
    private static long es;
    private static int em;
    private static long id;
    private static long ku;
    private static int kl;
    private static long be;
    private static long gf;
    private static int lv;
    private static long gk;
    private static int lc;
    private static int dq;
    private static int ek;
    private static int hg;
    private static long ia;
    private static int kq;
    private static int kx;
    private static int z;
    private static long gp;
    private static int cv;
    private static long ff;
    private static long hq;
    private static int fl;
    private static int cr;
    private static long ba;
    private static int je;
    private static long cu;
    private static long fx;
    private static final Pattern b;
    private static long ky;
    private static int kk;
    private static int kd;
    private static int kt;
    private static int er;
    private static int co;
    private static long ki;
    private static int it;
    private static long lp;
    private static int bd;
    private static long cw;
    private static int lu;
    private static int fh;
    private static long lb;
    private static int ai;
    private static long kc;
    private static long cq;
    private static int im;
    private static int kg;
    private static int dt;
    private static long jq;
    private static int jl;
    private static int bj;
    private static long li;
    private static long gu;
    private static long dv;
    private static int ix;
    private static long bh;
    private static long hn;
    private static long ik;
    private static int kz;
    private static long ci;
    private static long kp;
    private static long bk;
    private static int gd;
    private static long io;
    private static int ii;
    private static int hy;
    private static long ip;
    private static int lx;
    private static long dp;
    private static long x;
    private static int aw;
    private static long hl;
    private static long i;
    private static long hi;
    private static long ha;
    private static long kf;
    private static int gh;
    private static int t;
    private static long iv;
    private static int dr;
    private static int kn;
    private static long ee;
    private static long df;
    private static long cf;
    private static int cfr_renamed_0;
    private static long cz;
    private static long ly;
    private static long lq;
    private static int jo;
    private static int ie;
    private static int lf;
    private static long bb;
    private static int ji;
    private static int lk;
    private static long at;
    private static int gm;
    private static int cb;
    private static int fv;
    private static long el;
    private static int az;
    private static long hp;
    private static long cx;
    private static int lo;
    private static long jj;
    private static long ge;
    private static long gb;
    private static int ex;
    private static int dh;
    private static int gq;
    private static long dc;
    private static int hk;
    private static long kj;
    private static int bc;
    private static int ko;
    private static int jf;
    private static long as;
    private static int fp;
    private static long lg;
    private static long kr;
    private static int ka;
    private static long cd;
    private static int gc;
    private static int var_int_e;
    private static int ln;
    private static long ke;
    private static int bp;
    private static int dz;
    private static int kh;
    private static long ks;
    private static int iq;
    private static int ld;
    private static long fj;
    private static long go;
    private static String[] var_java_lang_String_arr_e;
    private static int le;
    private static long ct;
    private static int gg;
    private static long dy;
    private static int hm;
    private static long ft;
    private static long gl;
    private static long ls;
    private static int cm;
    private static int ak;
    private static int ic;
    private static int ch;
    private static long lt;
    private static int lm;
    private static long jg;
    private static long fc;
    private static int gj;
    private static int bw;
    private static long br;
    private static int bz;
    private static long fq;
    private static int fz;
    private static long jr;
    private static int fm;
    private static int en;
    private static String[] f;
    private static int lh;
    private static int lw;
    private static long jc;
    private static int aq;
    private static int ho;
    private static int lr;
    private static long lj;
    private static int cy;
    private static long ig;
    private static long is;
    private static int jt;
    private static long dm;
    private static int da;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_083.c("㺀", (int)ka, (long)(kb ^ kc)), (String)NLoginCore_083.c("㺃", (int)kd, (long)(ke ^ kf)));
        NLoginCore_219 NLoginCore_2193 = new NLoginCore_219(string, this.java_io_File_b());
        FileConfiguration fileConfiguration = (FileConfiguration)NLoginCore_2193.c();
        Set set = fileConfiguration.getKeys(kg != 0);
        this.j = set.size();
        for (String string2 : set) {
            try {
                String string3 = fileConfiguration.isConfigurationSection(string2) ? fileConfiguration.getString(string2 + (String)NLoginCore_083.c("㺆", (int)kh, (long)(ki ^ kj))) : fileConfiguration.getString(string2);
                String string4 = fileConfiguration.getString(string2 + (String)NLoginCore_083.c("㺉", (int)(kk & kl), (long)km));
                this.f(string2, string4, string3);
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_083.c("㺌", (int)(kn & ko), (long)kp) + this.a.getName() + (String)NLoginCore_083.c("㺏", (int)kq, (long)(kr ^ ks)) + (String)(string2 == null ? NLoginCore_083.c("㺒", (int)kt, (long)(ku ^ kv)) : string2 + (String)NLoginCore_083.c("㺕", (int)(kw & kx), (long)ky)) + (String)NLoginCore_083.c("㺘", (int)kz, (long)(la ^ lb)), exception, new Object[lc]);
            }
            finally {
                ++this.l;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f(String string, String string2, String string3) {
        Object object;
        if (string3 == null) {
            return;
        }
        UUID uUID = null;
        if (string2 == null && string != null) {
            uUID = UUID.fromString(string);
            object = ((Server)this.m.java_lang_Object_b().c()).getOfflinePlayer(uUID);
            string2 = object.getName();
        }
        if (string2 != null) {
            if (string3.charAt(ld) == le) {
                try {
                    object = Base64.getDecoder().decode(string3.replaceAll((String)NLoginCore_083.c("㺀", (int)lf, (long)lg), (String)NLoginCore_083.c("㺃", (int)lh, (long)(li ^ lj))));
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            string3 = (String)objectInputStream.readObject();
                        }
                        finally {
                            if (Collections.singletonList(objectInputStream).get(lk) != null) {
                                objectInputStream.close();
                            }
                        }
                    }
                    finally {
                        if (Collections.singletonList(byteArrayInputStream).get(lm) != null) {
                            byteArrayInputStream.close();
                        }
                    }
                }
                catch (Exception exception) {
                    NLoginCore_370.b((String)NLoginCore_083.c("㺆", (int)lo, (long)(lp ^ lq)) + this.a.getName() + (String)NLoginCore_083.c("㺉", (int)lr, (long)(ls ^ lt)) + string2, exception, new Object[lu]);
                }
            } else if (!b.matcher(string3).matches()) {
                string3 = BCryptHashProvider.com_nickuc_login_NLoginCore_566_b().w(string3);
            }
            this.a(string2, string3, null, uUID);
        }
    }

    private static String a(int n, long l) {
        l ^= 0xAL;
        l ^= 0x4A9F7CA3AACEFB74L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(65 + 4), 83, (byte)(8 + 39), (byte)(58 + 9), (byte)(14 + 52), (byte)(54 + 13), (byte)(9 + 38), (byte)(53 + 27), (byte)(63 + 12), (byte)(4 + 63), (byte)(43 + 40), (byte)(45 + 8), (byte)(11 + 69), (byte)(95 + 2), (byte)(34 + 66), (byte)(54 + 46), (byte)(94 + 11), 110, (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ƊƗƖřƙƕƐƙƤƓŠƞƢƛƞƤŦԀӲӿӡԄӯәӷԉӼԆ", (byte)84, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_083.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected void a(ResultSet resultSet) {
        String string = null;
        try {
            string = resultSet.getString((String)NLoginCore_083.c("㺀", (int)iq, (long)is));
            String string2 = resultSet.getString((String)NLoginCore_083.c("㺃", (int)it, (long)iv));
            this.f(string, null, string2);
        }
        catch (Exception exception) {
            NLoginCore_370.b((String)NLoginCore_083.c("㺆", (int)ix, (long)(iz ^ jc)) + this.a.getName() + (String)NLoginCore_083.c("㺉", (int)(je & jf), (long)jg) + (String)(string == null ? NLoginCore_083.c("㺌", (int)ji, (long)jj) : string + (String)NLoginCore_083.c("㺏", (int)jl, (long)jm)) + (String)NLoginCore_083.c("㺒", (int)jo, (long)(jq ^ jr)), exception, new Object[jt]);
        }
    }

    static {
        var_int_e = (0 >>> 132 | 0 << -132) & 0xFFFFFFFF;
        t = -1 >>> 130 | -1 << ~130 + 1;
        x = Long.reverse(7271569650875171169L);
        z = Integer.reverse(Integer.MIN_VALUE);
        ai = Integer.reverse(0);
        ak = (4 >>> 34 | 4 << ~34 + 1) & 0xFFFFFFFF;
        am = Long.reverse(3812805137054630241L);
        ap = Long.reverse(0x5000000000000000L);
        aq = 262144 >>> 241 | 262144 << -241;
        as = Long.reverse(3812805137054630241L);
        at = Long.reverse(0x5000000000000000L);
        aw = -1 >>> 176 | -1 << ~176 + 1;
        az = (0x3000000 >>> 24 | 0x3000000 << ~24 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(3812805137054630241L);
        bb = Long.reverse(0x5000000000000000L);
        bc = Integer.reverse(0);
        bd = (32 >>> 227 | 32 << -227) & 0xFFFFFFFF;
        be = Long.reverse(3812805137054630241L);
        bh = Long.reverse(0x5000000000000000L);
        bi = 524288 >>> 83 | 524288 << -83;
        bj = (160 >>> 165 | 160 << -165) & 0xFFFFFFFF;
        bk = Long.reverse(3812805137054630241L);
        bm = Long.reverse(0x5000000000000000L);
        bn = 4 >>> 129 | 4 << -129;
        bp = Integer.reverse(0x60000000);
        br = Long.reverse(7271569650875171169L);
        bu = 12 >>> 98 | 12 << ~98 + 1;
        bw = Integer.reverse(-536870912);
        bx = (-1 >>> 2 | -1 << -2) & 0xFFFFFFFF;
        by = Long.reverse(7271569650875171169L);
        bz = Integer.reverse(0x20000000);
        cb = (0x1000000 >>> 213 | 0x1000000 << ~213 + 1) & 0xFFFFFFFF;
        cd = Long.reverse(3812805137054630241L);
        cf = Long.reverse(0x5000000000000000L);
        cg = Integer.reverse(-1610612736);
        ch = Integer.reverse(-1879048192);
        ci = Long.reverse(3812805137054630241L);
        ck = Long.reverse(0x5000000000000000L);
        cm = 48 >>> 227 | 48 << ~227 + 1;
        co = 0x50000000 >>> 27 | 0x50000000 << -27;
        cp = Long.reverse(3812805137054630241L);
        cq = Long.reverse(0x5000000000000000L);
        cr = (0x580000 >>> 19 | 0x580000 << ~19 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(3812805137054630241L);
        cu = Long.reverse(0x5000000000000000L);
        cv = 0x6000000 >>> 183 | 0x6000000 << -183;
        cw = Long.reverse(3812805137054630241L);
        cx = Long.reverse(0x5000000000000000L);
        cy = (425984 >>> 143 | 425984 << ~143 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(7271569650875171169L);
        da = Integer.reverse(0x70000000);
        dc = Long.reverse(3812805137054630241L);
        df = Long.reverse(0x5000000000000000L);
        dh = (-268435456 >>> 252 | -268435456 << ~252 + 1) & 0xFFFFFFFF;
        di = Long.reverse(7271569650875171169L);
        dk = Integer.reverse(0x8000000);
        dm = Long.reverse(3812805137054630241L);
        dp = Long.reverse(0x5000000000000000L);
        dq = (-2147482822 >>> 190 | -2147482822 << -190) & 0xFFFFFFFF;
        dr = (0x22000000 >>> 217 | 0x22000000 << ~217 + 1) & 0xFFFFFFFF;
        ds = Long.reverse(7271569650875171169L);
        dt = (72 >>> 226 | 72 << -226) & 0xFFFFFFFF;
        dv = Long.reverse(3812805137054630241L);
        dy = Long.reverse(0x5000000000000000L);
        dz = 311296 >>> 142 | 311296 << ~142 + 1;
        eb = Long.reverse(7271569650875171169L);
        ec = 0x280000 >>> 209 | 0x280000 << -209;
        ee = Long.reverse(7271569650875171169L);
        ek = 21 >>> 192 | 21 << ~192 + 1;
        el = Long.reverse(7271569650875171169L);
        em = Integer.reverse(0x68000000);
        en = -1 >>> 29 | -1 << ~29 + 1;
        eo = Long.reverse(7271569650875171169L);
        eq = Integer.reverse(-402653184);
        er = (-1 >>> 16 | -1 << -16) & 0xFFFFFFFF;
        es = Long.reverse(7271569650875171169L);
        eu = (0x600000 >>> 82 | 0x600000 << -82) & 0xFFFFFFFF;
        ex = Integer.reverse(-1);
        ez = Long.reverse(7271569650875171169L);
        fa = 0x3200000 >>> 21 | 0x3200000 << -21;
        fc = Long.reverse(3812805137054630241L);
        ff = Long.reverse(0x5000000000000000L);
        fh = (1664 >>> 102 | 1664 << -102) & 0xFFFFFFFF;
        fi = Long.reverse(3812805137054630241L);
        fj = Long.reverse(0x5000000000000000L);
        fl = 13824 >>> 73 | 13824 << -73;
        fm = (-1 >>> 83 | -1 << -83) & 0xFFFFFFFF;
        fn = Long.reverse(7271569650875171169L);
        fp = 14 >>> 255 | 14 << ~255 + 1;
        fq = Long.reverse(3812805137054630241L);
        ft = Long.reverse(0x5000000000000000L);
        fv = Integer.reverse(-1207959552);
        fx = Long.reverse(7271569650875171169L);
        fz = 0x7800000 >>> 214 | 0x7800000 << ~214 + 1;
        ga = Long.reverse(3812805137054630241L);
        gb = Long.reverse(0x5000000000000000L);
        gc = (6770688 >>> 75 | 6770688 << -75) & 0xFFFFFFFF;
        gd = -1073741817 >>> 254 | -1073741817 << ~254 + 1;
        ge = Long.reverse(3812805137054630241L);
        gf = Long.reverse(0x5000000000000000L);
        gg = 1 >>> 27 | 1 << ~27 + 1;
        gh = -1 >>> 49 | -1 << -49;
        gi = Long.reverse(7271569650875171169L);
        gj = (0x4200000 >>> 213 | 0x4200000 << -213) & 0xFFFFFFFF;
        gk = Long.reverse(3812805137054630241L);
        gl = Long.reverse(0x5000000000000000L);
        gm = Integer.reverse(0x44000000);
        go = Long.reverse(3812805137054630241L);
        gp = Long.reverse(0x5000000000000000L);
        gq = Integer.reverse(-1006632960);
        gs = (-1 >>> 195 | -1 << ~195 + 1) & 0xFFFFFFFF;
        gu = Long.reverse(7271569650875171169L);
        gv = Integer.reverse(0x24000000);
        gx = Long.reverse(3812805137054630241L);
        ha = Long.reverse(0x5000000000000000L);
        hg = (1184 >>> 197 | 1184 << ~197 + 1) & 0xFFFFFFFF;
        hi = Long.reverse(7271569650875171169L);
        hj = 4864 >>> 71 | 4864 << ~71 + 1;
        hk = -1 >>> 240 | -1 << ~240 + 1;
        hl = Long.reverse(7271569650875171169L);
        hm = Integer.reverse(-469762048);
        hn = Long.reverse(7271569650875171169L);
        ho = 1280 >>> 133 | 1280 << ~133 + 1;
        hp = Long.reverse(3812805137054630241L);
        hq = Long.reverse(0x5000000000000000L);
        hy = 1312 >>> 5 | 1312 << -5;
        hz = Long.reverse(3812805137054630241L);
        ia = Long.reverse(0x5000000000000000L);
        ic = Integer.reverse(0x54000000);
        id = Long.reverse(7271569650875171169L);
        ie = 704512 >>> 78 | 704512 << ~78 + 1;
        cfr_renamed_0 = -1 >>> 242 | -1 << -242;
        ig = Long.reverse(7271569650875171169L);
        ii = (2816 >>> 230 | 2816 << -230) & 0xFFFFFFFF;
        ik = Long.reverse(7271569650875171169L);
        im = 0x2D0000 >>> 240 | 0x2D0000 << -240;
        io = Long.reverse(3812805137054630241L);
        ip = Long.reverse(0x5000000000000000L);
        iq = 0x17000000 >>> 87 | 0x17000000 << ~87 + 1;
        is = Long.reverse(7271569650875171169L);
        it = (2013265921 >>> 123 | 2013265921 << -123) & 0xFFFFFFFF;
        iv = Long.reverse(7271569650875171169L);
        ix = 24576 >>> 41 | 24576 << -41;
        iz = Long.reverse(3812805137054630241L);
        jc = Long.reverse(0x5000000000000000L);
        je = Integer.reverse(-1946157056);
        jf = Integer.reverse(-1);
        jg = Long.reverse(7271569650875171169L);
        ji = Integer.reverse(0x4C000000);
        jj = Long.reverse(7271569650875171169L);
        jl = 51 >>> 96 | 51 << -96;
        jm = Long.reverse(7271569650875171169L);
        jo = Integer.reverse(0x2C000000);
        jq = Long.reverse(3812805137054630241L);
        jr = Long.reverse(0x5000000000000000L);
        jt = Integer.reverse(0);
        ka = (217088 >>> 12 | 217088 << ~12 + 1) & 0xFFFFFFFF;
        kb = Long.reverse(3812805137054630241L);
        kc = Long.reverse(0x5000000000000000L);
        kd = (0x36000000 >>> 24 | 0x36000000 << ~24 + 1) & 0xFFFFFFFF;
        ke = Long.reverse(3812805137054630241L);
        kf = Long.reverse(0x5000000000000000L);
        kg = 0 >>> 69 | 0 << -69;
        kh = (55 >>> 0 | 55 << -0) & 0xFFFFFFFF;
        ki = Long.reverse(3812805137054630241L);
        kj = Long.reverse(0x5000000000000000L);
        kk = (14 >>> 190 | 14 << -190) & 0xFFFFFFFF;
        kl = -1 >>> 140 | -1 << ~140 + 1;
        km = Long.reverse(7271569650875171169L);
        kn = Integer.reverse(-1677721600);
        ko = -1 >>> 189 | -1 << -189;
        kp = Long.reverse(7271569650875171169L);
        kq = Integer.reverse(0x5C000000);
        kr = Long.reverse(3812805137054630241L);
        ks = Long.reverse(0x5000000000000000L);
        kt = (60416 >>> 170 | 60416 << -170) & 0xFFFFFFFF;
        ku = Long.reverse(3812805137054630241L);
        kv = Long.reverse(0x5000000000000000L);
        kw = (7680 >>> 7 | 7680 << ~7 + 1) & 0xFFFFFFFF;
        kx = (-1 >>> 70 | -1 << ~70 + 1) & 0xFFFFFFFF;
        ky = Long.reverse(7271569650875171169L);
        kz = (1998848 >>> 175 | 1998848 << -175) & 0xFFFFFFFF;
        la = Long.reverse(3812805137054630241L);
        lb = Long.reverse(0x5000000000000000L);
        lc = Integer.reverse(0);
        ld = Integer.reverse(0);
        le = Integer.reverse(-452984832);
        lf = 992 >>> 4 | 992 << -4;
        lg = Long.reverse(7271569650875171169L);
        lh = (0x3F000000 >>> 24 | 0x3F000000 << -24) & 0xFFFFFFFF;
        li = Long.reverse(3812805137054630241L);
        lj = Long.reverse(0x5000000000000000L);
        lk = Integer.reverse(0);
        ll = (0 >>> 64 | 0 << -64) & 0xFFFFFFFF;
        lm = Integer.reverse(0);
        ln = Integer.reverse(0);
        lo = Integer.reverse(0x2000000);
        lp = Long.reverse(3812805137054630241L);
        lq = Long.reverse(0x5000000000000000L);
        lr = (2080 >>> 101 | 2080 << -101) & 0xFFFFFFFF;
        ls = Long.reverse(3812805137054630241L);
        lt = Long.reverse(0x5000000000000000L);
        lu = (0 >>> 49 | 0 << ~49 + 1) & 0xFFFFFFFF;
        lv = 0x10C0000 >>> 210 | 0x10C0000 << -210;
        lw = (1072 >>> 36 | 1072 << -36) & 0xFFFFFFFF;
        lx = Integer.reverse(0x42000000);
        ly = Long.reverse(7271569650875171169L);
        var_java_lang_String_arr_e = new String[lv];
        f = new String[lw];
        NLoginCore_083.void_b();
        b = Pattern.compile((String)NLoginCore_083.c("㺀", (int)lx, (long)ly));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_083.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ՑճյՕչ֘֐֦֒ա֣֟֕֝զ֋֤֪֤֭֬չ", (byte)109, 70), NLoginCore_083.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըंࣴँࣣआࣱࣹࣛऋࣾईտ", (byte)109, 69) + string + NLoginCore_091.E("գ", (byte)109, 69) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        i = -8754795415792806100L;
        long l = i ^ 0x4A9F7CA3AACEFB74L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(42 + 27), (byte)(36 + 47), (byte)(15 + 32), (byte)(39 + 28), (byte)(61 + 5), (byte)(7 + 60), (byte)(3 + 44), (byte)(71 + 9), (byte)(46 + 29), (byte)(44 + 23), (byte)(28 + 55), 53, (byte)(4 + 76), (byte)(11 + 86), (byte)(32 + 68), (byte)(7 + 93), 105, (byte)(106 + 4), (byte)(65 + 38)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_083.f[0] = NLoginCore_173.C("ԠԪԞԈՁԽԝՋԊՎՐ԰ԩԖԳԯԺԱՓԱ՘ԨԥԦ", (byte)95, 67);
                    NLoginCore_083.f[1] = NLoginCore_138.C("ԕԪՊՊՉԉԇԩՅԪԪԒԎԭԮՄԚԙԩԿԑՎԥԦ", (byte)95, 67);
                    NLoginCore_083.f[2] = NLoginCore_575.E("֒֊֑հձշ֕լ։ձ֘գ", (byte)95, 69);
                    NLoginCore_083.f[3] = NLoginCore_384.D("ՀԃՈՇՎԛԥԉՒԩԵԚ", (byte)95, 68);
                    NLoginCore_083.f[4] = NLoginCore_092.E("ս֔լց։շ֎գլհՙգ", (byte)95, 69);
                    NLoginCore_083.f[5] = NLoginCore_110.E("֌լզօմՕՖ՚օկ֓֜ճթ֕կ֓֔տՠ֧֩ծկ", (byte)95, 69);
                    NLoginCore_083.f[6] = NLoginCore_387.B("ƮƎƈƧƖŷŸżƧƑƴƢŽǀƶƁƙƺƆƀƒǉƐƑ", (byte)95, 66);
                    NLoginCore_083.f[7] = NLoginCore_384.D("ՉՁՈԧԨԮՌԣՀԨՏԚ", (byte)95, 68);
                    NLoginCore_083.f[8] = NLoginCore_092.F("տխՠլե֚֓֏Ք֝վգ", (byte)95, 70);
                    NLoginCore_083.f[9] = NLoginCore_453.D("ԷԄԃԬՎՌԫԭՄԵՃԚ", (byte)95, 68);
                    NLoginCore_083.f[10] = NLoginCore_092.B("ƀƕƵƵƴŴŲƔưƕƖƷơǄƘƔƘƽƿƼƖƟƇƠƆƫƤƍƟƌǓƫƶƳǋƣƙǆƶǊưƾƟƥ", (byte)95, 66);
                    NLoginCore_083.f[11] = NLoginCore_223.B("ƊƇƐƺƙƷƩŷźŹƉƚƻƛƏƢƔƷƥƧƛƆǆǇƎƟƌǇƞƤǋƲƬƪǁƗǆƕǄƹǙƩǒƥ", (byte)95, 66);
                    NLoginCore_083.f[12] = NLoginCore_027.E("՞ճ֓֓֒ՒՐղ֎ճմ֕տ֢նղն֛֚֝մռ֘մ֛֡ց֤ը֧֡ք", (byte)95, 69);
                    NLoginCore_083.f[13] = NLoginCore_451.F("ւժբՓՓ֓Ռ֊֒֏հ֘՝ՙվ֕ո՞ո֧փձծկ", (byte)95, 70);
                    NLoginCore_083.f[14] = NLoginCore_559.D("ԫՃԧՍԆՃՏԺԨՎԵԚ", (byte)95, 68);
                    NLoginCore_083.f[15] = NLoginCore_453.C("ԟԦԆԚՈԽՆԡԮԣՃԚ", (byte)95, 67);
                    NLoginCore_083.f[16] = NLoginCore_091.E("՞ճ֓֓֒ՒՐղ֎ճմ֋ց՟֍֖֎֍֓շ֙֕և֨ց֝֍ըչջկ֧", (byte)95, 69);
                    NLoginCore_083.f[17] = NLoginCore_223.C("ԕԪՊՊՉԉԇԩՅԪԬԠԡԗԢԮՑԛԩ՞ՓՍԷԚԡԝՄԷՒԹՑ՛", (byte)95, 67);
                    NLoginCore_083.f[18] = NLoginCore_201.E("՞ճ֓֓֒ՒՐղ֎ճղ՗վա֢ց֣֘՘՝փ֖֭֔֩֗ծչթ֥֩֡", (byte)95, 69);
                    NLoginCore_083.f[19] = NLoginCore_201.E("ձւկՓ֚֘֗֘։պլՙ՝մ֠֋֕խհհ։֧ծկ", (byte)95, 69);
                    NLoginCore_083.f[20] = NLoginCore_138.A("ƀƕƵƵƴŴŲƔưƕƕŹƭƗƖƃƷƯƵǉƘƾǀƶƝƆƯƮƌưƍƟ", (byte)95, 65);
                    NLoginCore_083.f[21] = NLoginCore_324.B("ƄƭƶƗƅƔƄƭƬƓƈƅ", (byte)95, 66);
                    NLoginCore_083.f[22] = NLoginCore_324.F("՞ճ֓֓֒ՒՐղ֎ճմ֋ց՟֍֖֎֍֓շ֦֙֒շս֬զռֆ։֣֑", (byte)95, 70);
                    NLoginCore_083.f[23] = NLoginCore_559.A("ƁƋƊƭưƓƆƦƮƨżƱǃƿǀƠǃƔƷƓƸƹƐƑ", (byte)95, 65);
                    NLoginCore_083.f[24] = NLoginCore_091.F("՞ճ֓֓֒ՒՐղ֎ճճ։ծխւ֕֙֍֗գ֘յյքռթ֏ְ֪֛֟֌", (byte)95, 70);
                    NLoginCore_083.f[25] = NLoginCore_138.B("ƲƥŸƒƇƹƎƫžǀƪƅ", (byte)95, 66);
                    NLoginCore_083.f[26] = NLoginCore_223.E("՞ճ֓֓֒ՒՐղ֎ճմ֑֙րձբ֥֞ձև՞ոց֋ւ֝ս֢֊֚֮ջ", (byte)95, 69);
                    NLoginCore_083.f[27] = NLoginCore_559.D("ԹԡԙԊԊՊԃՁՉՆԧՏԔԐԵՌԯԕԯ՞ԺԨԥԦ", (byte)95, 68);
                    NLoginCore_083.f[28] = NLoginCore_027.F("մ֌հ֖Տ֌֘փձ֗վգ", (byte)95, 70);
                    NLoginCore_083.f[29] = NLoginCore_446.C("ԟԦԆԚՈԽՆԡԮԣՃԚ", (byte)95, 67);
                    NLoginCore_083.f[30] = NLoginCore_559.D("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫՔՏՊԝգ՟ԽԿ՚ԵԦՀԨԥՍՊՃԫԾՃՠճԺ", (byte)95, 68);
                    NLoginCore_083.f[31] = NLoginCore_324.C("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫ՚՝ԲԳԚՙ՛ԦԧԩԦԪԶՁՊՍԦեՠՐա԰Ժ", (byte)95, 67);
                    NLoginCore_083.f[32] = NLoginCore_173.D("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫ՝ԡԙՌՎՓԴՅ԰բ՟՜ՋծՃՠՉՄ՟ըԼՉԺ", (byte)95, 68);
                    NLoginCore_083.f[33] = NLoginCore_027.A("ƓƤƑŵƺƹƺƼƫƜƎŻſƖǂƭƷƏƒƒƫǉƐƑ", (byte)95, 65);
                    NLoginCore_083.f[34] = NLoginCore_384.C("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫ՝԰ՙԟդԠԸԤ՘բՔզ՘դբԾկձԮԭՅկԺ", (byte)95, 67);
                    NLoginCore_083.f[35] = NLoginCore_223.B("ƄƭƶƗƅƔƄƭƬƓƈƅ", (byte)95, 66);
                    NLoginCore_083.f[36] = NLoginCore_091.B("ƀƕƵƵƴŴŲƔưƕƖƕƊƓǂŻƆƣǁƳƖǀƔƥƀƽƫǐƈƉǁǖǅǈǐƐǐƯƧƭƫǗƟƥ", (byte)95, 66);
                    NLoginCore_083.f[37] = NLoginCore_027.B("ƁƋƊƭưƓƆƦƮƨżƱǃƿǀƠǃƔƷƓƸƹƐƑ", (byte)95, 66);
                    NLoginCore_083.f[38] = NLoginCore_110.E("՞ճ֓֓֒ՒՐղ֎ճմճըձ֠ՙդց֑֟մ֚թս֔յ֚շ֬֬վֱ", (byte)95, 69);
                    NLoginCore_083.f[39] = NLoginCore_223.F("֐փՖհե֗լ։՜֞ֈգ", (byte)95, 70);
                    NLoginCore_083.f[40] = NLoginCore_451.D("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫ՜՟ՍՎԭՃԶՈԚ՘գԩԽելՅ՞իգձԼգԺ", (byte)95, 68);
                    NLoginCore_083.f[41] = NLoginCore_559.A("ƤƌƄŵŵƵŮƬƴƱƒƺſŻƠƷƚƀƚǉƥƓƐƑ", (byte)95, 65);
                    NLoginCore_083.f[42] = NLoginCore_027.A("ƖƮƒƸűƮƺƥƓƹƠƅ", (byte)95, 65);
                    NLoginCore_083.f[43] = NLoginCore_138.C("ԟԦԆԚՈԽՆԡԮԣՃԚ", (byte)95, 67);
                    NLoginCore_083.f[44] = NLoginCore_138.C("ՇԡԼԸԛՈԣԼԴԜՑԱԒԣԷՂՌՈ԰ԫԮՋԼԻաԶԺգՕՈբՂԴզԣԤՇԽկխՌԽՃԲՆծԫիՃ՛ԽԴՉ՟լՂբՔնՔ՜Կյր։ո՘Հե՞ՙ֐գֈՒքՑ֐հ֊֓ջ֘Ֆ֜ՒՓջ֑ռ֡ո֢ռձ֋յքօխ֊ռ֜ք֏ևֲֵֻ֤֔֟֓֩ճֽ֖֨֔ւֱֺֽ֐ְֲ֖ֆָ֖օ֫֌֚֮֩ג֑ד֚", (byte)95, 67);
                    NLoginCore_083.f[45] = NLoginCore_027.E("քե֑֓֊ղկկՙռ՝ը֙խա֤֗֠նտյւ֩տ֛֗֋սջ֒֎֍սֱ֭ֆֹ֏ַ֣օְ֊փ", (byte)95, 69);
                    NLoginCore_083.f[46] = NLoginCore_173.E("Քյբ֏քՓՑ՛ճ՝֜գ", (byte)95, 69);
                    NLoginCore_083.f[47] = NLoginCore_559.A("ƁƋƊƭưƓƆƦƮƨżƱǃƿǀƠǃƔƷƓƸƹƐƑ", (byte)95, 65);
                    NLoginCore_083.f[48] = NLoginCore_027.D("ԖԸՊԥԈԧՁԜԍԆԔԚ", (byte)95, 68);
                    NLoginCore_083.f[49] = NLoginCore_201.F("Ցկ֍ըմնշ֘ֆ՝ժգ", (byte)95, 70);
                    NLoginCore_083.f[50] = NLoginCore_223.D("ԷӾՀՉԆԥԝՄԣԭԝԚ", (byte)95, 68);
                    NLoginCore_083.f[51] = NLoginCore_092.C("ԜՂԦԦԊԣԾԌՄՉՋԚ", (byte)95, 67);
                    NLoginCore_083.f[52] = NLoginCore_384.D("ՆՁՃՄԥԤԉԒՋԆՖԷՑՀԷ՗ԬԙԬ՛Հ՟ԓԘՒՍՙԿԟ՝ՒԢՈՌ՗ՄՠԮԽՏՂՕՕԺ", (byte)95, 68);
                    NLoginCore_083.f[53] = NLoginCore_091.A("ƀƕƵƵƴŴŲƔưƕƕƳƂƱƷƺƛƏƥƾƆƋƅǋƌƺƬƚǁƝƭƮ", (byte)95, 65);
                    NLoginCore_083.f[54] = NLoginCore_427.F("֓ՐՒբՓ֙էռ֕ըո֙կ՗՘փ՚վձկ֠֗ծկ", (byte)95, 70);
                    NLoginCore_083.f[55] = NLoginCore_173.B("ƤƯƙƕƙƧżůƦƚƋǂơƬƌƐǅƿƳƶǄǉƐƑ", (byte)95, 66);
                    NLoginCore_083.f[56] = NLoginCore_324.B("ƂƎƈƴƔƔƇƍƷưƈƅ", (byte)95, 66);
                    NLoginCore_083.f[57] = NLoginCore_575.C("ԖԸՊԥԈԧՁԜԍԆԔԚ", (byte)95, 67);
                    NLoginCore_083.f[58] = NLoginCore_559.A("ųƑƯƊƖƘƙƺƨſƌƅ", (byte)95, 65);
                    NLoginCore_083.f[59] = NLoginCore_027.F("րՇ։֒Տծզ֍լնզգ", (byte)95, 70);
                    NLoginCore_083.f[60] = NLoginCore_387.E("ե֋կկՓլևՕ֍֒֔գ", (byte)95, 69);
                    NLoginCore_083.f[61] = NLoginCore_201.D("ՆՁՃՄԥԤԉԒՋԆՖԷՑՀԷ՗ԬԙԬ՛Հ՟ԓԘՒՍՙԿԟ՝ՒԢզՋՖ՘ՠՌԾՒՑԱԴԺ", (byte)95, 68);
                    NLoginCore_083.f[62] = NLoginCore_446.C("ԞԋԮՁԫԬՍԛՇՇԩԚ", (byte)95, 67);
                    NLoginCore_083.f[63] = NLoginCore_138.D("ԟԦԆԚՈԽՆԡԮԣՃԚ", (byte)95, 68);
                    NLoginCore_083.f[64] = NLoginCore_110.C("ԖԸՊԥԈԧՁԜԍԆԔԚ", (byte)95, 67);
                    NLoginCore_083.f[65] = NLoginCore_575.F("֌՝Ք֑ոպէմՎպճ֘կ֕՞֌րյ֐ֈք֥֦֘֙խ֎չ֩ևկձ֧֩֕կַփַַֹ֥֥֚֙֜֜յַָ֛֑֜֡֎֏", (byte)95, 70);
                    NLoginCore_083.f[66] = NLoginCore_091.F("֍՝վՑ֏ըղՓճն֜֍ՠր՚չ֠ղ֦֕գաճցթ֪֜րֆփիկծքֱ֨֓ձִֹֺ֖֛֭֨֫֝׃ְֿׁ֖֤֡֎֏", (byte)95, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_083.f[0] = NLoginCore_384.C("ԠԪԞԈՁԽԝՋԊՎՒՂԑՐԨԶԧԲԲԻԚՎԥԦ", (byte)95, 67);
                    NLoginCore_083.f[1] = NLoginCore_453.B("ƀƕƵƵƴŴŲƔưƕƗƗƹƑƓƳƽǁǁƸƧƉǅǃƾǁǁǍǉƞƫǕ", (byte)95, 66);
                    NLoginCore_083.f[2] = NLoginCore_092.E("Քծ֖ճզճւլ֙ռղգ", (byte)95, 69);
                    NLoginCore_083.f[3] = NLoginCore_223.E("յ՟գ֖հ֕֙֒ռմ֞Օկա֕֔օ֥֘զ֑ցծկ", (byte)95, 69);
                    NLoginCore_083.f[4] = NLoginCore_076.C("ԚԻԠՈՊՋՌԄՒԏԬՈԯՈԏԷՃԧՒ՝԰ԨԥԦ", (byte)95, 67);
                    NLoginCore_083.f[5] = NLoginCore_091.F("֌լզօմՕՖ՚օկ֒֎։չժհք֓աէ֚ցծկ", (byte)95, 70);
                    NLoginCore_083.f[6] = NLoginCore_173.E("֌լզօմՕՖ՚օկ֓լ֖֝֒՟՜ե֦֕զձծկ", (byte)95, 69);
                    NLoginCore_083.f[7] = NLoginCore_559.B("ƏƗƇŹŲƵƈƒƛŷƩƀưƙǃƏƂƅƟƑƟǉƐƑ", (byte)95, 66);
                    NLoginCore_083.f[8] = NLoginCore_004.E("հ֒տՓօհՕ֗ռֆսջջվ֛պքճկջւցծկ", (byte)95, 69);
                    NLoginCore_083.f[9] = NLoginCore_223.A("ƶƯŶųŴƅƵƷŰƚƗƑƯƘžƒƗƒƹƥƝƓƐƑ", (byte)95, 65);
                    NLoginCore_083.f[10] = NLoginCore_559.B("ƀƕƵƵƴŴŲƔưƕƖƷơǄƘƔƘƽƿƼƖƟƇƠƆƫƤƍƟƌǓƫǂƟǓơǓƶƬƺǉƘƴƥ", (byte)95, 66);
                    NLoginCore_083.f[11] = NLoginCore_201.B("ƊƇƐƺƙƷƩŷźŹƉƚƻƛƏƢƔƷƥƧƛƆǆǇƎƟƌǇƞƤǋƲƥƑǔǉƪƸƽǖƭƷưƥ", (byte)95, 66);
                    NLoginCore_083.f[12] = NLoginCore_091.B("ƀƕƵƵƴŴŲƔưƕƖƷơǄƘƔƘƽƿƼƖƞƝƼǍǇƂƺǍƍƑƢƠǗƗƷǈƕƩǆǔưǎƥ", (byte)95, 66);
                    NLoginCore_083.f[13] = NLoginCore_451.A("ƤƌƄŵŵƵŮƬƴƱƑƑƍƍƿƂƺƦǀƵƻƣƐƑ", (byte)95, 65);
                    NLoginCore_083.f[14] = NLoginCore_451.D("ԣԡԠԤԇԜԻԲԻՋՏԚ", (byte)95, 68);
                    NLoginCore_083.f[15] = NLoginCore_324.B("ƈƄƲŷƖƧƲƏƖƐƲƅ", (byte)95, 66);
                    NLoginCore_083.f[16] = NLoginCore_427.A("ƀƕƵƵƴŴŲƔưƕƖƭƣƁƯƸưƯƵƙƻƴƶƞƻƆǆƑǑǋƼƠ", (byte)95, 65);
                    NLoginCore_083.f[17] = NLoginCore_092.E("՞ճ֓֓֒ՒՐղ֎ճյթժՠիշ֚դղ֧֧֜֒֡֬֫ջ֪փ֦֮֫", (byte)95, 69);
                    NLoginCore_083.f[18] = NLoginCore_453.D("ԕԪՊՊՉԉԇԩՅԪԩԎԵԘՙԸ՚ՏԏԔԺՌԟԷՎԮԵԽԞՒՙգԿԽՊդլխԨգԿմԽԺ", (byte)95, 68);
                    NLoginCore_083.f[19] = NLoginCore_201.A("ƓƤƑŵƺƹƺƼƫƜƍơƁƞƻƴƁƚƤǃǉƙƵƖƎƈƞǂǁǇƧǖ", (byte)95, 65);
                    NLoginCore_083.f[20] = NLoginCore_446.A("ƀƕƵƵƴŴŲƔưƕƕŹƭƗƖƃƷƯƵǉƘǀƸƷƇơǅơƑƝƲƦƐƢƨƒƙǙƮƸǎǉǖƥ", (byte)95, 65);
                    NLoginCore_083.f[21] = NLoginCore_324.C("ԤԦԫՁԣԠՑՁԎՉՃԚ", (byte)95, 67);
                    NLoginCore_083.f[22] = NLoginCore_427.F("՞ճ֓֓֒ՒՐղ֎ճմ֋ց՟֍֖֎֍֓շ֙ևյ֝֔թ֠օ֮֒ք֏ְִ֨֨֡֊մմ֚֮֕փ", (byte)95, 70);
                    NLoginCore_083.f[23] = NLoginCore_110.E("՟թը֋֎ձդք֌ֆ՛՝ղշ֞մձվ՜֤֙֗ծկ", (byte)95, 69);
                    NLoginCore_083.f[24] = NLoginCore_324.B("ƀƕƵƵƴŴŲƔưƕƕƫƐƏƤƷƻƯƹƅƺƗƻƵƛƬƩơǇƏƭƇ", (byte)95, 66);
                    NLoginCore_083.f[25] = NLoginCore_138.A("ƪƲƄƑŲŷƝưƆŽƔƶƐƽƐƠƎƘźƴǈǉƐƑ", (byte)95, 65);
                    NLoginCore_083.f[26] = NLoginCore_092.D("ԕԪՊՊՉԉԇԩՅԪԫՈՐԷԨԙՕ՜ԨԾԕԩՀԲԻ՝ԱԟՐԵԺզ", (byte)95, 68);
                    NLoginCore_083.f[27] = NLoginCore_575.D("ԹԡԙԊԊՊԃՁՉՆԧԓԓԑՅՓԣՕՌՒԼՎԥԦ", (byte)95, 68);
                    NLoginCore_083.f[28] = NLoginCore_091.B("ƗƕƦƬƒƼƹƶƭƬƔƅ", (byte)95, 66);
                    NLoginCore_083.f[29] = NLoginCore_027.C("ԋԦԜԞԧԡԇԼԏԱԿԚ", (byte)95, 67);
                    NLoginCore_083.f[30] = NLoginCore_427.D("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫՔՏՊԝգ՟ԽԿ՚ԵԦգԵԦՈ՟ՇՅՉգիճԺ", (byte)95, 68);
                    NLoginCore_083.f[31] = NLoginCore_110.E("՞ճ֓֓֒ՒՐղ֎ճմճըձ֠ՙդց֑֟մ֣֦ջռգ֢֤կհղկ֦վցֲֶ֫շֻ֧֙յփ", (byte)95, 69);
                    NLoginCore_083.f[32] = NLoginCore_110.C("ԕԪՊՊՉԉԇԩՅԪԫԪԟԨ՗ԐԛԸՖՈԫ՝ԡԙՌՎՓԴՅ԰բ՟ՔՉԦԼըՊԬհէիէԺ", (byte)95, 67);
                    NLoginCore_083.f[33] = NLoginCore_138.F("ձւկՓ֚֘֗֘։պի֝֐֓յբ֢֞՞րֈ֦֖֕էֆւ֎ְ֙֓֌", (byte)95, 70);
                    NLoginCore_083.f[34] = NLoginCore_091.E("՞ճ֓֓֒ՒՐղ֎ճմճըձ֠ՙդց֑֟մ֦չ֢ը֭թցխ֡֫֝ք֋ձղֳִ֑֊ռպֆִ֚֩֜յ֣֢֎ָׄ֡֎֏", (byte)95, 69);
                    NLoginCore_083.f[35] = NLoginCore_387.F("։գՔինՒ֐լ։֑ղգ", (byte)95, 70);
                    NLoginCore_083.f[36] = NLoginCore_575.B("ƀƕƵƵƴŴŲƔưƕƖƕƊƓǂŻƆƣǁƳƖǀƔƥƀƽƫǐƈƉǁǖǈơƖƴƫǋƳǇƷƗƟƥ", (byte)95, 66);
                    NLoginCore_083.f[37] = NLoginCore_451.E("՟թը֋֎ձդք֌ֆ՜֞֋՗ժշ՞հ֥տըձծկ", (byte)95, 69);
                    NLoginCore_083.f[38] = NLoginCore_223.F("՞ճ֓֓֒ՒՐղ֎ճմճըձ֠ՙդց֑֟մ֢շյ֖վ֫փտլղ֏֑սַ֮֓մֱ֙շֱֆփ", (byte)95, 70);
                    NLoginCore_083.f[39] = NLoginCore_223.F("էժի֘ի֒ձէդկս֘ջ֘ս֢՞ւ֧ք֦ձծկ", (byte)95, 70);
                    NLoginCore_083.f[40] = NLoginCore_223.A("ƀƕƵƵƴŴŲƔưƕƖƕƊƓǂŻƆƣǁƳƖǇǊƸƹƘƮơƳƅǃǎƬǖƊǇƯưǓƏưƩƨƥ", (byte)95, 65);
                    NLoginCore_083.f[41] = NLoginCore_324.B("ƤƌƄŵŵƵŮƬƴƱƐƸƾƛƵƘƜƚƙǆƿƣƐƑ", (byte)95, 66);
                    NLoginCore_083.f[42] = NLoginCore_110.B("ƟƪƭŶƢŲƥƬƌƇŻƅ", (byte)95, 66);
                    NLoginCore_083.f[43] = NLoginCore_027.A("ŭƁƲŷƩƋƺƈƼƉſƅ", (byte)95, 65);
                    NLoginCore_083.f[44] = NLoginCore_427.F("֐ժօցդ֑լօսե֚պ՛լր֋֑֕չմշ֔օք֪տփ֑֬֞֫֋ս֯լխ֐ֆֶָ֕ֆ֌ջ֏ַմִ֌֤ֆսֵ֒֨֋ֿ֥֫֝֝ֈ־׉גׁ֡։֧֢֮י֬ב֛׍֚יֹדלׄס֟ץ֛֜ׄךׅתׁ׫ֺׅה־׍׎ֶדׅץ׍טא׻םר׭ל׾؄ײּןױ؆ם׋؃׺؆י׹׻ן׏׏״׫؀ץؐ؇חג׮ؘף", (byte)95, 70);
                    NLoginCore_083.f[45] = NLoginCore_092.F("քե֑֓֊ղկկՙռ՝ը֙խա֤֗֠նտյւ֩տ֛֗֋սջ֒֎֍֫֔֞օշ֗փ֣շջյփ", (byte)95, 70);
                    NLoginCore_083.f[46] = NLoginCore_387.A("ƐŭƋƗƸƫƙƱƵƞƶƅ", (byte)95, 65);
                    NLoginCore_083.f[47] = NLoginCore_446.D("ԖԠԟՂՅԨԛԻՃԽԑԓԪԵՋԘԩԶՔՆԨՎԥԦ", (byte)95, 68);
                    NLoginCore_083.f[48] = NLoginCore_384.F("ՋնՌլՕՏեքքծ֜գ", (byte)95, 70);
                    NLoginCore_083.f[49] = NLoginCore_324.A("ƐƋƇƸƲƤƉźƺƚŷƅ", (byte)95, 65);
                    NLoginCore_083.f[50] = NLoginCore_004.D("ՀԤՀՃԅԞԎԐԣԐԇՖՔԗՈՑՕԹ՗ՋՀԨԥԦ", (byte)95, 68);
                    NLoginCore_083.f[51] = NLoginCore_138.A("ƶƨƌƭƏƅƔƛƟƠƮƅ", (byte)95, 65);
                    NLoginCore_083.f[52] = NLoginCore_027.B("ƱƬƮƯƐƏŴŽƶűǁƢƼƫƢǂƗƄƗǆƫǊžƃƽƸǄƪƊǈƽƍǓǆǘƬƳƷƔǗǉƨǀƥ", (byte)95, 66);
                    NLoginCore_083.f[53] = NLoginCore_559.D("ԕԪՊՊՉԉԇԩՅԪԪՈԗՆՌՏ԰ԤԺՓԛԚԴՂՖՑԭՇԴ՘ԟՂ", (byte)95, 68);
                    NLoginCore_083.f[54] = NLoginCore_138.C("ՊԇԉԙԊՐԞԳՌԟԮԤՎՕԺՏԲԴԷՏԭԬԩԼԾԤ՞ԡզԷժԼ", (byte)95, 67);
                    NLoginCore_083.f[55] = NLoginCore_004.D("ԹՄԮԪԮԼԑԄԻԯԞՑՄԬԓԐՊԪԾՇԽ՞ԥԦ", (byte)95, 68);
                    NLoginCore_083.f[56] = NLoginCore_575.F("֓նՓ֕ք֖խ֛ՙօ֘րլ֞֊մմ՜ջհ՚֧ծկ", (byte)95, 70);
                    NLoginCore_083.f[57] = NLoginCore_076.A("ƣųơƹƣŹƱƓŻƊƘƅ", (byte)95, 65);
                    NLoginCore_083.f[58] = NLoginCore_091.D("ԈԵԺԺՄԇՐՆՊՒԥԚ", (byte)95, 68);
                    NLoginCore_083.f[59] = NLoginCore_324.B("ƞűƇƩƑƻƹƹƾƾƗƼƵƯƢƲƒƅźƲƒƣƐƑ", (byte)95, 66);
                    NLoginCore_083.f[60] = NLoginCore_453.A("ƇſƶƁƊƦƘƦƆƴƲƅ", (byte)95, 65);
                    NLoginCore_083.f[61] = NLoginCore_027.F("֏֊֌֍ծխՒ՛֔Տ֟ր֚։ր֠յբյ֤։֨՜ա֛֖֢ֈը֦֛ի֥֔֗֫֋֖֥֐֍֒֬փ", (byte)95, 70);
                    NLoginCore_083.f[62] = NLoginCore_201.C("ԚՂԞԋԧԆԞԏՏԊԔԚ", (byte)95, 67);
                    NLoginCore_083.f[63] = NLoginCore_076.F("մ՟րզ֔ն֏հքօղգ", (byte)95, 70);
                    NLoginCore_083.f[64] = NLoginCore_223.A("ƯŷƥƊƔƹƚƧƶƟƶƅ", (byte)95, 65);
                    NLoginCore_083.f[65] = NLoginCore_223.C("ՃԔԋՈԯԱԞԫԅԱԪՏԦՌԕՃԷԬՇԿԻՏՐ՜՝ԤՅ԰ՠԾԦԨՠ՞ՌԦծԺ՜Ր՜հՔՇ՗չձԴՇՔՍծՈվՅՆ", (byte)95, 67);
                    NLoginCore_083.f[66] = NLoginCore_223.B("ƯſƠųƱƊƔŵƕƘƾƯƂƢżƛǂƔǈƷƅƃƕƣƋǌƾƢƨƥƍƑƐƦǊƵǓƓǊǛǜǍƻƹƴǚƛǤǛƯǉǕǞǙưƱ", (byte)95, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_083.f[0] = NLoginCore_324.D("ԃԙӿԌԗԐԠԯԩՏԬԤԣԔԪՑԨՐԔԺ՟ՎԥԦ", (byte)95, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_083.f[0] = NLoginCore_201.D("ԙՃԶԾՋՎԙՆՎԱԕԑՂՉՈԴԫԘԨՆՒԨԥԦ", (byte)95, 68);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(NLoginCore_219 var1_1) {
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

    public NLoginCore_083(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_v, (String)NLoginCore_083.c("㺀", (int)(var_int_e & t), (long)x), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? z : ai) != 0);
    }
}

