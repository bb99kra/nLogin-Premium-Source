/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_229;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_462
extends NLoginType_032 {
    private static long dk;
    private static int es;
    private static long cu;
    private static long cfr_renamed_1;
    private static int fd;
    private static long cg;
    private static int gf;
    private static int bu;
    private static int dg;
    private static int hi;
    private static int dt;
    private static int ff;
    private static int dw;
    private static int ee;
    private static long dr;
    private static int ft;
    private static long bv;
    private static int cs;
    private static int fo;
    private static int ez;
    private static int ep;
    private static int gk;
    private static int da;
    private static long dz;
    private static long bn;
    private static int db;
    private static int ct;
    private static long dc;
    private static int ei;
    private static int cd;
    private static int fk;
    private static int fp;
    private static long ej;
    private static int ge;
    private static long fu;
    private static int dp;
    private static long bz;
    private static int cw;
    private static int gy;
    private static long cj;
    private static int cp;
    private static int dq;
    private static int cb;
    private static long dy;
    private static int ds;
    private static long bk;
    private static int fn;
    private static int bm;
    private static long fc;
    private static int aw;
    private static long gv;
    private static long ck;
    private static int fl;
    private static long ed;
    private static int di;
    private static int fs;
    private static long fg;
    private static int bw;
    private static long eu;
    private static int dl;
    private static long bo;
    private static int ef;
    private static long en;
    private static long gl;
    private static int hb;
    private static long du;
    private static int eb;
    private static long dd;
    private static int gt;
    private static int dx;
    private static int fr;
    private static int cc;
    private static long dj;
    private static long eq;
    private static int fa;
    private static int hh;
    private static int dm;
    private static long cq;
    private static int bi;
    private static int fw;
    private static int fx;
    private static int bd;
    private static long bs;
    private static long em;
    private static int ax;
    private static int gi;
    private static int hf;
    private static int bt;
    private static long dv;
    private static int ca;
    private static int ga;
    private static int br;
    private static int ey;
    private static int er;
    private static int gb;
    private static long bl;
    private static long cy;
    private static int av;
    private static int gn;
    private static int ha;
    private static long eg;
    private static int az;
    private static long gp;
    private static int ea;
    private static long go;
    private static int bj;
    private static long bf;
    private static int fe;
    private static long ec;
    private static int ev;
    private static long et;
    private static long fj;
    private static int bb;
    private static int hd;
    private static int gd;
    private static int gw;
    private static int fb;
    private static long e;
    private static long ba;
    private static String[] d;
    private static int hg;
    private static int de;
    private static int gz;
    private static int ew;
    private static int gj;
    private static long cr;
    private static int ci;
    private static long cv;
    private static long gc;
    private static int bc;
    private static long gg;
    private static int df;
    private static long cz;
    private static String[] c;
    private static int cm;
    private static long ay;
    private static int gq;
    private static int gh;
    private static long gu;
    private static int gx;
    private static int fq;
    private static int ce;
    private static long ch;
    private static int bx;
    private static int el;
    private static int gm;
    private static int ex;
    private static long fy;
    private static int eo;
    private static int bg;
    private static int ek;
    private static long co;
    private static int be;
    private static int cx;
    private static int a;
    private static long by;
    private static int cn;
    private static long dn;
    private static int gr;
    private static long dh;
    private static int gs;
    private static int cl;
    private static int fz;
    private static int bp;
    private static int hc;
    private static int fv;
    private static int he;
    private static int bq;
    private static int fh;
    private static long fm;
    private static int fi;
    private static int bh;
    private static long eh;
    private static int cf;

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0x1CD3CBF2E97C8857L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(6 + 63), (byte)(40 + 43), (byte)(2 + 45), (byte)(11 + 56), (byte)(64 + 2), (byte)(3 + 64), (byte)(39 + 8), (byte)(15 + 65), (byte)(23 + 52), (byte)(54 + 13), (byte)(51 + 32), 53, 80, (byte)(48 + 49), (byte)(24 + 76), (byte)(19 + 81), (byte)(41 + 64), (byte)(12 + 98), (byte)(55 + 48)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.A("ĤıİóĳįĪĳľĭúĸļĵĸľĀҗҋҔҔѱҙѾҝ", (byte)33, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_462.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    static {
        a = (4 >>> 130 | 4 << ~130 + 1) & 0xFFFFFFFF;
        av = 0x2000000 >>> 217 | 0x2000000 << -217;
        aw = Integer.reverse(0);
        ax = Integer.reverse(0);
        ay = Long.reverse(9021420303197987633L);
        az = (524288 >>> 83 | 524288 << ~83 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(9021420303197987633L);
        bb = Integer.reverse(0);
        bc = Integer.reverse(0);
        bd = (0x800000 >>> 118 | 0x800000 << -118) & 0xFFFFFFFF;
        be = -1 >>> 130 | -1 << ~130 + 1;
        bf = Long.reverse(9021420303197987633L);
        bg = Integer.reverse(0);
        bh = (0 >>> 208 | 0 << -208) & 0xFFFFFFFF;
        bi = Integer.reverse(0);
        bj = (96 >>> 101 | 96 << ~101 + 1) & 0xFFFFFFFF;
        bk = Long.reverse(7580268422439428913L);
        bl = Long.reverse(0x1400000000000000L);
        bm = Integer.reverse(0x20000000);
        bn = Long.reverse(7580268422439428913L);
        bo = Long.reverse(0x1400000000000000L);
        bp = Integer.reverse(0);
        bq = 5120 >>> 74 | 5120 << ~74 + 1;
        br = Integer.reverse(-1);
        bs = Long.reverse(9021420303197987633L);
        bt = 192 >>> 69 | 192 << -69;
        bu = (-1 >>> 74 | -1 << ~74 + 1) & 0xFFFFFFFF;
        bv = Long.reverse(9021420303197987633L);
        bw = Integer.reverse(0);
        bx = Integer.reverse(-536870912);
        by = Long.reverse(7580268422439428913L);
        bz = Long.reverse(0x1400000000000000L);
        ca = Integer.reverse(0);
        cb = Integer.reverse(0);
        cc = 0x1000000 >>> 184 | 0x1000000 << ~184 + 1;
        cd = 131072 >>> 48 | 131072 << -48;
        ce = Integer.reverse(Integer.MIN_VALUE);
        cf = Integer.reverse(0x10000000);
        cg = Long.reverse(7580268422439428913L);
        ch = Long.reverse(0x1400000000000000L);
        ci = Integer.reverse(-1879048192);
        cj = Long.reverse(7580268422439428913L);
        ck = Long.reverse(0x1400000000000000L);
        cl = (0 >>> 145 | 0 << -145) & 0xFFFFFFFF;
        cm = Integer.reverse(0x50000000);
        cn = Integer.reverse(-1);
        co = Long.reverse(9021420303197987633L);
        cp = Integer.reverse(-805306368);
        cq = Long.reverse(7580268422439428913L);
        cr = Long.reverse(0x1400000000000000L);
        cs = 0 >>> 54 | 0 << ~54 + 1;
        ct = Integer.reverse(0x30000000);
        cu = Long.reverse(7580268422439428913L);
        cv = Long.reverse(0x1400000000000000L);
        cw = 0 >>> 36 | 0 << ~36 + 1;
        cx = 0x34000000 >>> 250 | 0x34000000 << ~250 + 1;
        cy = Long.reverse(7580268422439428913L);
        cz = Long.reverse(0x1400000000000000L);
        da = 0 >>> 121 | 0 << -121;
        db = (229376 >>> 142 | 229376 << ~142 + 1) & 0xFFFFFFFF;
        dc = Long.reverse(7580268422439428913L);
        dd = Long.reverse(0x1400000000000000L);
        de = 0 >>> 227 | 0 << -227;
        df = (0x1E000000 >>> 153 | 0x1E000000 << -153) & 0xFFFFFFFF;
        dg = (-1 >>> 158 | -1 << ~158 + 1) & 0xFFFFFFFF;
        dh = Long.reverse(9021420303197987633L);
        di = Integer.reverse(0x8000000);
        dj = Long.reverse(7580268422439428913L);
        dk = Long.reverse(0x1400000000000000L);
        dl = Integer.reverse(0);
        dm = (8704 >>> 233 | 8704 << -233) & 0xFFFFFFFF;
        dn = Long.reverse(7580268422439428913L);
        cfr_renamed_1 = Long.reverse(0x1400000000000000L);
        dp = Integer.reverse(0);
        dq = (294912 >>> 238 | 294912 << -238) & 0xFFFFFFFF;
        dr = Long.reverse(9021420303197987633L);
        ds = 0 >>> 117 | 0 << ~117 + 1;
        dt = 0x9800000 >>> 23 | 0x9800000 << -23;
        du = Long.reverse(7580268422439428913L);
        dv = Long.reverse(0x1400000000000000L);
        dw = (0 >>> 238 | 0 << -238) & 0xFFFFFFFF;
        dx = Integer.reverse(0x28000000);
        dy = Long.reverse(7580268422439428913L);
        dz = Long.reverse(0x1400000000000000L);
        ea = Integer.reverse(0);
        eb = (21 >>> 128 | 21 << -128) & 0xFFFFFFFF;
        ec = Long.reverse(7580268422439428913L);
        ed = Long.reverse(0x1400000000000000L);
        ee = Integer.reverse(0);
        ef = 0x5800000 >>> 54 | 0x5800000 << ~54 + 1;
        eg = Long.reverse(7580268422439428913L);
        eh = Long.reverse(0x1400000000000000L);
        ei = Integer.reverse(-402653184);
        ej = Long.reverse(9021420303197987633L);
        ek = Integer.reverse(0);
        el = Integer.reverse(0x18000000);
        em = Long.reverse(7580268422439428913L);
        en = Long.reverse(0x1400000000000000L);
        eo = 0 >>> 50 | 0 << ~50 + 1;
        ep = (-939524096 >>> 187 | -939524096 << ~187 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(9021420303197987633L);
        er = Integer.reverse(0);
        es = 104 >>> 66 | 104 << ~66 + 1;
        et = Long.reverse(7580268422439428913L);
        eu = Long.reverse(0x1400000000000000L);
        ev = 0 >>> 161 | 0 << -161;
        ew = (4 >>> 161 | 4 << ~161 + 1) & 0xFFFFFFFF;
        ex = (0 >>> 91 | 0 << -91) & 0xFFFFFFFF;
        ey = (524288 >>> 211 | 524288 << ~211 + 1) & 0xFFFFFFFF;
        ez = Integer.reverse(0);
        fa = (-1073741818 >>> 30 | -1073741818 << ~30 + 1) & 0xFFFFFFFF;
        fb = Integer.reverse(-1);
        fc = Long.reverse(9021420303197987633L);
        fd = (0 >>> 30 | 0 << -30) & 0xFFFFFFFF;
        fe = Integer.reverse(0x38000000);
        ff = (-1 >>> 94 | -1 << -94) & 0xFFFFFFFF;
        fg = Long.reverse(9021420303197987633L);
        fh = Integer.reverse(0);
        fi = (3712 >>> 167 | 3712 << ~167 + 1) & 0xFFFFFFFF;
        fj = Long.reverse(9021420303197987633L);
        fk = 0x4000000 >>> 217 | 0x4000000 << -217;
        fl = 15360 >>> 137 | 15360 << -137;
        fm = Long.reverse(9021420303197987633L);
        fn = 0 >>> 72 | 0 << ~72 + 1;
        fo = 4096 >>> 139 | 4096 << -139;
        fp = Integer.reverse(0);
        fq = (0x200000 >>> 21 | 0x200000 << ~21 + 1) & 0xFFFFFFFF;
        fr = Integer.reverse(0);
        fs = 0xF800000 >>> 87 | 0xF800000 << ~87 + 1;
        ft = -1 >>> 72 | -1 << ~72 + 1;
        fu = Long.reverse(9021420303197987633L);
        fv = 0 >>> 40 | 0 << ~40 + 1;
        fw = Integer.reverse(0x4000000);
        fx = Integer.reverse(-1);
        fy = Long.reverse(9021420303197987633L);
        fz = Integer.reverse(0);
        ga = (0x42000000 >>> 121 | 0x42000000 << ~121 + 1) & 0xFFFFFFFF;
        gb = Integer.reverse(-1);
        gc = Long.reverse(9021420303197987633L);
        gd = (0x800000 >>> 54 | 0x800000 << -54) & 0xFFFFFFFF;
        ge = Integer.reverse(0x44000000);
        gf = (-1 >>> 197 | -1 << ~197 + 1) & 0xFFFFFFFF;
        gg = Long.reverse(9021420303197987633L);
        gh = (0 >>> 49 | 0 << -49) & 0xFFFFFFFF;
        gi = (256 >>> 102 | 256 << ~102 + 1) & 0xFFFFFFFF;
        gj = Integer.reverse(0);
        gk = 0x230000 >>> 80 | 0x230000 << -80;
        gl = Long.reverse(9021420303197987633L);
        gm = 0x10000000 >>> 188 | 0x10000000 << -188;
        gn = (589824 >>> 238 | 589824 << ~238 + 1) & 0xFFFFFFFF;
        go = Long.reverse(7580268422439428913L);
        gp = Long.reverse(0x1400000000000000L);
        gq = Integer.reverse(0x40000000);
        gr = Integer.reverse(-1073741824);
        gs = (524288 >>> 51 | 524288 << ~51 + 1) & 0xFFFFFFFF;
        gt = Integer.reverse(-1543503872);
        gu = Long.reverse(7580268422439428913L);
        gv = Long.reverse(0x1400000000000000L);
        gw = (2048 >>> 138 | 2048 << ~138 + 1) & 0xFFFFFFFF;
        gx = Integer.reverse(0);
        gy = (64 >>> 230 | 64 << ~230 + 1) & 0xFFFFFFFF;
        gz = 0 >>> 80 | 0 << ~80 + 1;
        ha = 2 >>> 129 | 2 << ~129 + 1;
        hb = 0 >>> 222 | 0 << -222;
        hc = Integer.reverse(0);
        hd = (0 >>> 184 | 0 << ~184 + 1) & 0xFFFFFFFF;
        he = Integer.reverse(0);
        hf = (0 >>> 73 | 0 << -73) & 0xFFFFFFFF;
        hg = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        hh = Integer.reverse(0x64000000);
        hi = (0x26000000 >>> 56 | 0x26000000 << -56) & 0xFFFFFFFF;
        c = new String[hh];
        d = new String[hi];
        NLoginCore_462.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_462.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("Юѐђвіѵѭ҃ѯоѼѲҀѺуѨҊ҉ҁ҇ҁі", (byte)27, 67), NLoginCore_462.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢭࢡࢪࢪࢇࢯ࢔ࢳԪ", (byte)27, 69) + string + NLoginCore_446.F("ԑ", (byte)27, 70) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar()) {
            return;
        }
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            return;
        }
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            if (stringArray.length < a) {
                Object[] objectArray = new Object[av];
                objectArray[NLoginCore_462.aw] = (String)NLoginCore_462.c("㺀", (int)ax, (long)ay) + string.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_462.c("㺃", (int)az, (long)ba);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
                return;
            }
            NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
            String string2 = stringArray[bb];
            ForceRegisterConfig ForceRegisterConfig2 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(NLoginInterface_0422, this.var_com_nickuc_login_NLoginCore_466_a, stringArray, string2);
            if (ForceRegisterConfig2 == null) {
                return;
            }
            if (!ForceRegisterConfig2.boolean_h()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[bc]);
                return;
            }
            if (ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a() == NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c) {
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺆", (int)(bd & be), (long)bf), new Object[bg]);
                return;
            }
            if (ForceRegisterConfig2.t()) {
                ForceRegisterConfig ForceRegisterConfig3 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(string2, null, null, bh != 0);
                if (ForceRegisterConfig3 == null) {
                    NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[bi]);
                    return;
                }
                if (ForceRegisterConfig3.r() && !Objects.equals(ForceRegisterConfig2.java_lang_Long_a(), ForceRegisterConfig3.java_lang_Long_a())) {
                    if (NLoginCore_150.j()) {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺉", (int)bj, (long)(bk ^ bl)) + ForceRegisterConfig3.i() + (String)NLoginCore_462.c("㺌", (int)bm, (long)(bn ^ bo)), new Object[bp]);
                    } else {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺏", (int)(bq & br), (long)bs) + ForceRegisterConfig3.i() + (String)NLoginCore_462.c("㺒", (int)(bt & bu), (long)bv), new Object[bw]);
                    }
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺕", (int)bx, (long)(by ^ bz)), new Object[ca]);
                    if (!((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig3)) {
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[cb]);
                        return;
                    }
                }
                UUID uUID = ForceRegisterConfig2.getMojangId();
                UUID uUID2 = ForceRegisterConfig2.java_util_UUID_a();
                if (uUID != null && uUID.equals(uUID2) && (stringArray.length == cc || stringArray.length == cd && stringArray[ce].equals(NLoginCore_462.c("㺘", (int)cf, (long)(cg ^ ch))))) {
                    String string3 = string + (String)NLoginCore_462.c("㺛", (int)ci, (long)(cj ^ ck)) + ForceRegisterConfig2.d(stringArray[cl]) + (String)NLoginCore_462.c("㺞", (int)(cm & cn), (long)co);
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺡", (int)cp, (long)(cq ^ cr)), new Object[cs]);
                    if (NLoginCore_150.j()) {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺤", (int)ct, (long)(cu ^ cv)), new Object[cw]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺧", (int)cx, (long)(cy ^ cz)), new Object[da]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺪", (int)db, (long)(dc ^ dd)), new Object[de]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺭", (int)(df & dg), (long)dh) + uUID2 + (String)NLoginCore_462.c("㺰", (int)di, (long)(dj ^ dk)), new Object[dl]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺳", (int)dm, (long)(dn ^ cfr_renamed_1)), new Object[dp]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺶", (int)dq, (long)dr) + string3, new Object[ds]);
                    } else {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺹", (int)dt, (long)(du ^ dv)), new Object[dw]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺼", (int)dx, (long)(dy ^ dz)), new Object[ea]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㺿", (int)eb, (long)(ec ^ ed)), new Object[ee]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻂", (int)ef, (long)(eg ^ eh)) + uUID2 + (String)NLoginCore_462.c("㻅", (int)ei, (long)ej), new Object[ek]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻈", (int)el, (long)(em ^ en)), new Object[eo]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻋", (int)ep, (long)eq) + string3, new Object[er]);
                    }
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻎", (int)es, (long)(et ^ eu)), new Object[ev]);
                    return;
                }
                ForceRegisterConfig2.b(null);
                ForceRegisterConfig2.void_A();
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[ew];
                NLoginCore_436Array[NLoginCore_462.ex] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d;
                NLoginCore_436Array[NLoginCore_462.ey] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                if (!((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array)) {
                    NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[ez]);
                    return;
                }
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻑", (int)(fa & fb), (long)fc), new Object[fd]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻔", (int)(fe & ff), (long)fg), new Object[fh]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻗", (int)fi, (long)fj) + NLoginCore_2702.a(TimeUnit.SECONDS, fk) + (String)NLoginCore_462.c("㻚", (int)fl, (long)fm), new Object[fn]);
                return;
            }
            ForceRegisterConfig2.b(null);
            ForceRegisterConfig2.void_A();
            ForceRegisterConfig2.void_z();
            NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[fo];
            NLoginCore_436Array[NLoginCore_462.fp] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d;
            NLoginCore_436Array[NLoginCore_462.fq] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
            if (!((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[fr]);
                return;
            }
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻝", (int)(fs & ft), (long)fu), new Object[fv]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻠", (int)(fw & fx), (long)fy), new Object[fz]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_462.c("㻣", (int)(ga & gb), (long)gc) + NLoginCore_2702.a(TimeUnit.SECONDS, gd) + (String)NLoginCore_462.c("㻦", (int)(ge & gf), (long)gg), new Object[gh]);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a();
        if (!NLoginCore_1872.boolean_b(NLoginCore_277)) {
            NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            if (NLoginCore_5012 != null && NLoginCore_5012.com_nickuc_login_NLoginCore_211_a() == NLoginCore_211.var_com_nickuc_login_NLoginCore_211_b) {
                String[] stringArray2 = new String[gi];
                stringArray2[NLoginCore_462.gj] = NLoginCore_462.c("㻩", (int)gk, (long)gl);
                stringArray2[NLoginCore_462.gm] = NLoginCore_462.c("㻬", (int)gn, (long)(go ^ gp));
                stringArray2[NLoginCore_462.gq] = Integer.toString(NLoginCore_211.var_com_nickuc_login_NLoginCore_211_b.v());
                stringArray2[NLoginCore_462.gr] = Integer.toString(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.v());
                NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b.a(NLoginCore_277, NLoginCore_5092, stringArray2);
            }
            return;
        }
        if (stringArray.length != gs) {
            Object[] objectArray = new Object[gw];
            objectArray[NLoginCore_462.gx] = string;
            objectArray[NLoginCore_462.gy] = NLoginCore_150.a(NLoginCore_374.D, NLoginCore_277, new Object[gz]);
            String string4 = String.format((String)NLoginCore_462.c("㻯", (int)gt, (long)(gu ^ gv)), objectArray);
            Object[] objectArray2 = new Object[ha];
            objectArray2[NLoginCore_462.hb] = string4;
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray2);
            return;
        }
        NLoginCore_509 NLoginCore_5093 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        ForceRegisterConfig ForceRegisterConfig4 = NLoginCore_5093.com_nickuc_login_ForceRegisterConfig_a();
        Object object = ForceRegisterConfig4.var_java_lang_Object_c;
        synchronized (object) {
            if (!ForceRegisterConfig4.boolean_h()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[hc]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            if (ForceRegisterConfig4.t()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.I, new Object[hd]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            String string5 = stringArray[he];
            if (!((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().boolean_a(ForceRegisterConfig4, string5)) {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.P, new Object[hf]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            NLoginCore_073.a((NLoginType_008)this.a, NLoginCore_5093.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress(), NLoginCore_280.var_com_nickuc_login_NLoginCore_280_c);
            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.s, NLoginCore_277, new Object[hg]));
        }
    }

    private static void b() {
        int n;
        e = -8302603908692226922L;
        long l = e ^ 0x1CD3CBF2E97C8857L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(39 + 30), (byte)(4 + 79), (byte)(34 + 13), (byte)(54 + 13), (byte)(9 + 57), 67, 47, (byte)(17 + 63), (byte)(24 + 51), (byte)(18 + 49), (byte)(70 + 13), (byte)(41 + 12), (byte)(3 + 77), (byte)(87 + 10), (byte)(83 + 17), (byte)(17 + 83), (byte)(28 + 77), (byte)(35 + 75), (byte)(66 + 37)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_462.d[0] = NLoginCore_173.A("ÐàÝĈēõÿĈąÑÑß", (byte)12, 65);
                    NLoginCore_462.d[1] = NLoginCore_427.C("ШмнЕЈсѓвУмяИёдКюОСѡдѐмхѝчѓсќўцпџ", (byte)12, 67);
                    NLoginCore_462.d[2] = NLoginCore_453.E("ՁӹԒՁԎԅԙԜԈԿԖԻԆՉԈԠԊԠՆՆԿԵԬԧԙԳԗՙՎՑԲԯԻԹՀԿԵՃԻԴՆԼԪըԻ՗ըՏԫՈժձՆխժղիՅԭշՇԶԸկձվՌԿչԿՑՆՠՇմլ՛ՠփՍ՝Մմ֏ֈ՞՛՜", (byte)12, 69);
                    NLoginCore_462.d[3] = NLoginCore_173.E("ԢӻՂԱԯՆԤԿՀԉԉԂՍԥՐՋԇԞԞԫՄՅԸԔՌԔՄԹԹ՜ԻՈԩՍԷԽԼՠԤԤ՛Պ՝ՙԬԦ՘ԢԩեՠժՇաՀՉՑՙչթԹյի՘ՠժջգԼոՏ՜րւիՐ", (byte)12, 69);
                    NLoginCore_462.d[4] = NLoginCore_110.B("ÆîÐċĐôþĖÏòĊÓēĘôóĉęëāĖĆùćûĕþĆčýĤĨđĀĐĩëčĉĠąĢĂĩĎęðĔĚłĭĕČŃĊċ", (byte)12, 66);
                    NLoginCore_462.d[5] = NLoginCore_453.D("ЯхсхЧєЗТЌаиЛмюнџжЯКњосмбѪќЧѦѪѡэсѮђђѮэтЮэѴѷѪйѻѿѸюѶѕ҄ѲѥѯѰлѕѵьчѻ҂чѡѿ҃҃ҐҌяѬыҍ҈Ғѡ", (byte)12, 68);
                    NLoginCore_462.d[6] = NLoginCore_091.D("ЈаВэђжрјБдывѕаіЯџѕзрсзйгѓНѢпѡррЩммЦѵЯѴѕёњшѳмѭѰѡѡяяѬѭмџєҁўѽїѭѫѢѿю", (byte)12, 68);
                    NLoginCore_462.d[7] = NLoginCore_027.B("ÞÚÝÎăßÈÍÓåúß", (byte)12, 66);
                    NLoginCore_462.d[8] = NLoginCore_453.C("МєЫЎАуБѓцлћШЗаЗьиСэжѐїоХУѩШѧњСЪѝ", (byte)12, 67);
                    NLoginCore_462.d[9] = NLoginCore_223.C("ХлЬЬУЏхЯйумС", (byte)12, 67);
                    NLoginCore_462.d[10] = NLoginCore_453.A("ĀČĈçēÓĎÔĈèâóæêĆöĈàñþãģýåñúêģģêĩġ", (byte)12, 65);
                    NLoginCore_462.d[11] = NLoginCore_173.E("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 69);
                    NLoginCore_462.d[12] = NLoginCore_004.A("ÐëÒĀíąåôĐăñĎĝĎÚÝûċďíĂġôĦĚĕĀøĪĉíĭıĤêąĈýíĦĸČċĖļěûċĽĻĵĳĻüģĢĢĀŋĉěħŉİ", (byte)12, 65);
                    NLoginCore_462.d[13] = NLoginCore_091.D("РМПАхСЊЏЕЧмС", (byte)12, 68);
                    NLoginCore_462.d[14] = NLoginCore_076.A("ùðúÍĕĔþčćìēëĊĞøĊúýĂďĐñĠþĂüċăğąäëīĩĎĠĆĔõēĦēĬĒĸļćĸ÷øļčĚĎŁŇŁÿğĽþņŅĥŉĈĄĦōĶēŗİģĴěōĜĦĲĴŕĴŜŠłŎķŧŪħļŠŀĹŇ", (byte)12, 65);
                    NLoginCore_462.d[15] = NLoginCore_092.E("ԩԊԽԹԺԯՈԧԁԺՊԇԟԧԻԘԙԊՃԱԯՈԮՒԴԨԑՖՋԞ԰ՏԚԫԹ՚ԲՀԟ՟ԴՕՠԫՄՌՊխթխծԱՊՐեխձըպոՌշյժ", (byte)12, 69);
                    NLoginCore_462.d[16] = NLoginCore_324.D("яЛфдѕюйШТміС", (byte)12, 68);
                    NLoginCore_462.d[17] = NLoginCore_446.A("ùðúÍĕĔþčćìēċäúÙÞØþòĞĢûĆĆġħēĊĢçüøëĊïďčëíîĲĒĬøĄĪįıĿúĴěĂğĀýúĔĻėĺĨčŎľğĦĊīŇıŕĮēĶĬĸĻŔįĪĪŁōĸŚğŃłļŢĦũĦŢŚśŲŜőœūŶņŁĴųĳĴĽĽňŨĿŜųőŔņŞŻřūŃŢƆſƏżƐŏŽƍŦŭōŰťŬƎƉƐƏŘƁƓƒƑƠŭŪū", (byte)12, 65);
                    NLoginCore_462.d[18] = NLoginCore_446.D("гНЯЎщдрЪифїйнЛНъѝћѕдћљѝщекЩсЩѢѯѬЬЯЯѯгѷѳйзыжыиюѺѹѶћѭмћяьэ", (byte)12, 68);
                    NLoginCore_462.d[19] = NLoginCore_004.D("оЍхЫдЎсіЖдєбъѝљъѝфѓСОѕѩѧфЩѢыХојќыѱќфШїяѦчѶвіджинҁѳѮџў҅ьэ", (byte)12, 68);
                    NLoginCore_462.d[20] = NLoginCore_559.C("РМПАхСЊЏЕЧмС", (byte)12, 67);
                    NLoginCore_462.d[21] = NLoginCore_091.C("лвмЏїірящЮђяыЬЭўдКвУХуКСпўјѝмћѨууѢѠшџЯѥѨхёѺѼђєѭѵѼѷћѯѤ҇҃пђџѾѬфчѬъѦѳ҈҅ѵҒҙѰқёѕҊѼѾѮѳҌѠѱѡҎљҦґѲҡҭҦѷѪѽҍ", (byte)12, 67);
                    NLoginCore_462.d[22] = NLoginCore_201.C("эыёеГёсЫИлцѐЗѝЗєзМолђѨТъєНХѤшкъьуХѯѨащсгыњюжѵѧѱҀѳјяўюѕѲѪѹ҇уѧҊцѨҋъѾ҄ѿѫѡҗѫѭѤѸѡ", (byte)12, 67);
                    NLoginCore_462.d[23] = NLoginCore_138.D("яЛфдѕюйШТміС", (byte)12, 68);
                    NLoginCore_462.d[24] = NLoginCore_027.B("ùðúÍĕĔþčćìēòĝçÜĒèĂĢċĢăÜñæèöüâĘĞĠîĮēāĤïíĈĤĕĪñąĶĿĪĊđĞęĞĔħĹŇĞĉŅĖġĤĭĻĈČĞĮőġŊĴĔŐńřĵĖĹŘşĽĭĲİĘŜŜĺūŦľĪňŃĽũŅłŏŕŒŏŨĹũŏőĳűĸŘŝŏƄľŞƁťŔŚŷŅņŜŧŜżƊƍſůŶşţƌőőş", (byte)12, 66);
                    NLoginCore_462.d[25] = NLoginCore_453.A("ÂÏæĂčíÔìÊËđðĐĔĈØĔďĕñĥąýüĆąĒâùąĜĆģįĀëĔąîö÷āöĆěûīĹĖııĢęčĊċ", (byte)12, 65);
                    NLoginCore_462.d[26] = NLoginCore_453.D("РМПАхСЊЏЕЧмС", (byte)12, 68);
                    NLoginCore_462.d[27] = NLoginCore_076.D("ЬШТьЮуаЦбЬЯЮЙѓЗЙЬклЮѠчќцмхмїяѡѬЯѫѳтѤђзѧѴтѱѽцѨзьѬ҂ѠѭѮїі҂ѳѨ҈ѝѭѫ҇ҐҒѠѪцѕѠҕѐјѕѶѪѷғѶѲҙҍҗѹҘѺѿѬѭ", (byte)12, 68);
                    NLoginCore_462.d[28] = NLoginCore_223.E("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 69);
                    NLoginCore_462.d[29] = NLoginCore_091.D("БЉъгуЎхАЯййЕгѕыэѐѕѥѢћѢЧщТѦъіЧпчѤѡлѠѭпѓѵѐкюјс", (byte)12, 68);
                    NLoginCore_462.d[30] = NLoginCore_027.F("ԚԿԱԾԎԱԃԗԀՅԆԐ", (byte)12, 70);
                    NLoginCore_462.d[31] = NLoginCore_201.D("ЬШТьЮуаЦбЬЯЮЙѓЗЙЬклЮѠчќцмхмїяѡѬЯѫѳтѤђзѧѴтѱѽцѨзьѬ҂ѠѭѮїі҂ѳѨ҈ѝѭѫ҇ҐҒёѩѤѽҀѥѮ҂ѦҜѭѫҍѽѷҘҊҤћѹңҕѬѭ", (byte)12, 68);
                    NLoginCore_462.d[32] = NLoginCore_324.F("ԏԋԎӿԴԐӹӾԄԖԫԐ", (byte)12, 70);
                    NLoginCore_462.d[33] = NLoginCore_091.B("ÏÇĈñāÌăÎí÷÷ÓñēĉċĎēģĠęĠåćàĤĈĔåýąĢğùĞīýđĳĎøČĖÿ", (byte)12, 66);
                    NLoginCore_462.d[34] = NLoginCore_446.B("éĎĀčÝĀÒæÏĔÕß", (byte)12, 66);
                    NLoginCore_462.d[35] = NLoginCore_138.E("ԴӿԂԞԷԝԖԥԤԇԗԐ", (byte)12, 69);
                    NLoginCore_462.d[36] = NLoginCore_559.D("ЛАяСчЭАцтЖеёјоЮюъПарњпЬЭ", (byte)12, 68);
                    NLoginCore_462.d[37] = NLoginCore_201.D("урѐУЍУрЫшљХЮлЙпрыЭсЮљпЬЭ", (byte)12, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_462.d[0] = NLoginCore_110.D("щЯЧдшёєіЙЪцС", (byte)12, 68);
                    NLoginCore_462.d[1] = NLoginCore_138.B("æúûÓÆÿđðáúčÖďòØČÜßğòĎøùğàĦøĪćêġĂ", (byte)12, 66);
                    NLoginCore_462.d[2] = NLoginCore_091.B("ĐÈáĐÝÔèë×ĎåĊÕĘ×ïÙïĕĕĎĄûöèĂæĨĝĠāþĊĈďĎĄĒĊăĕċùķĊĦķĞúėĹŀĕļĹŁĺĔüņĖąćľŀōěĎňĎĠĕįĖłįņŅŋęŘĪŊĳŤĭĪī", (byte)12, 66);
                    NLoginCore_462.d[3] = NLoginCore_223.F("ԢӻՂԱԯՆԤԿՀԉԉԂՍԥՐՋԇԞԞԫՄՅԸԔՌԔՄԹԹ՜ԻՈԩՍԷԽԼՠԤԤ՛Պ՝ՙԬԦ՘ԢԩեՠժՇաՀՉՑՙչթԹյի՘ԺՂՁպՓչավՙՄ՗Ր", (byte)12, 70);
                    NLoginCore_462.d[4] = NLoginCore_559.E("ӷԟԁԼՁԥԯՇԀԣԻԄՄՉԥԤԺՊԜԲՇԷԪԸԬՆԯԷԾԮՕՙՂԱՁ՚ԜԾԺՑԶՓԵ՜բիէԭՌ՛՟էԾԿՕդնԶԭԴԸՌիՓ", (byte)12, 69);
                    NLoginCore_462.d[5] = NLoginCore_324.C("ЯхсхЧєЗТЌаиЛмюнџжЯКњосмбѪќЧѦѪѡэсѮђђѮэтЮэѴѷѪйѻѿѸюѶѕ҄ѲѥѯѰлѕѵьчѻ҂чѡѦяюѝєҎѭѤѕҖҝҔѸњҎѵҠѲѣѴґѯѬѭ", (byte)12, 67);
                    NLoginCore_462.d[6] = NLoginCore_091.B("ÆîÐċĐôþĖÏòĉðēîĔíĝēõþÿõ÷ñđÛĠýğþþçúúäĳíĲēďĘĆıúīĮğğččĪīúĮĝĥĔĠĘģŇčĤĝ", (byte)12, 66);
                    NLoginCore_462.d[7] = NLoginCore_076.F("ԷԪԎԜԯՇԼԘԂՈԵԐ", (byte)12, 70);
                    NLoginCore_462.d[8] = NLoginCore_091.D("МєЫЎАуБѓцлћШЗаЗьиСэжѐібгщХѫѢчѩШч", (byte)12, 68);
                    NLoginCore_462.d[9] = NLoginCore_446.D("ЊЅЦѕоЏЦИуЧЛС", (byte)12, 68);
                    NLoginCore_462.d[10] = NLoginCore_453.C("тюъЩѕЕѐЖъЪФеШЬшиъТгрХЦшѓиѠиъѮЭёѢ", (byte)12, 67);
                    NLoginCore_462.d[11] = NLoginCore_138.F("ԴԚՂԴԤԟԺԆԟԀԵԐ", (byte)12, 70);
                    NLoginCore_462.d[12] = NLoginCore_559.F("ԁԜԃԱԞԶԖԥՁԴԢԿՎԿԋԎԬԼՀԞԳՒԥ՗ՋՆԱԩ՛ԺԞ՞բՕԛԶԹԮԞ՗թԽԼՇխՌԬԼծլզդլմկըխըՍՔՑ՗ՌՠՑ՚ղփԿևգքՒե՛Ր", (byte)12, 70);
                    NLoginCore_462.d[13] = NLoginCore_027.C("ыядЎёЩйюЪфмС", (byte)12, 67);
                    NLoginCore_462.d[14] = NLoginCore_427.D("лвмЏїірящЮѕЭьѠкьмпфёђгѢрфоэхѡчЦЭѭѫѐѢшізѕѨѕѮєѺѾщѺйкѾяќѐ҃҉҃сѡѿр҈҇ѧҋъцѨҏѸѕҙѲѥѶѝҏўѨѴѶҗѶҞҢҒѹҗѹңҍ҉ѭҫҩҙ", (byte)12, 68);
                    NLoginCore_462.d[15] = NLoginCore_092.C("кЛюъырљиВыћИаиьЩЪЛєтрљпѣхйТѧќЯсѠЫмъѫуёаѰхѦѱмѕѝћѾѺѾѿтћѰћ҆ѽѦќу҅ѯ҅ґѰьѪяѶѐҀҏҎѸѸѡ", (byte)12, 67);
                    NLoginCore_462.d[16] = NLoginCore_453.E("ԊӺՀԬԒӽԺԇԖӼԫԣԮԤԨԪԾԒԬՋԭՔԛԜ", (byte)12, 69);
                    NLoginCore_462.d[17] = NLoginCore_223.C("лвмЏїірящЮѕэЦмЛРКрдѠѤншшѣѩѕьѤЩокЭьбёяЭЯаѴєѮкцѬѱѳҁмѶѝфѡтпміѽљѼѪяҐҀѡѨьѭ҉ѳҗѰѕѸѮѺѽҖѱѬѬ҃ҏѺҜѡ҅҄ѾҤѨҫѨҤҜҝҴҞғҕҭҸ҈҃ѶҵѵѶѿѿҊҪҁҞҵғҖ҈Ҡҽқҭ҅ҤӈӁӑҾӒґҿӏҨүҏҲҧҬҸӍҼҟҼҬҸӠҶҿӥҬҭ", (byte)12, 67);
                    NLoginCore_462.d[18] = NLoginCore_004.B("ñÛíÌćòþèöĂĕ÷ûÙÛĈěęēòęėěćóøçÿçĠĭĪêííĭñĵı÷õĉñĕćıĸĘúĹĪĢĤčĤŁěĨŁŁĶĻīŎ", (byte)12, 66);
                    NLoginCore_462.d[19] = NLoginCore_559.B("üËăéòÌÿĔÔòĒïĈěėĈěĂđßÜēħĥĂçĠĉãüĖĚĉįĚĂæĕčĤąĴúČĊĆĲĮĻėûĝăāĳģŉĿľĞĕĄĻŃ", (byte)12, 66);
                    NLoginCore_462.d[20] = NLoginCore_201.E("ԾԓԁՄԃԸԹՈӻԀԆԐ", (byte)12, 69);
                    NLoginCore_462.d[21] = NLoginCore_384.D("лвмЏїірящЮђяыЬЭўдКвУХуКСпўјѝмћѨууѢѠшџЯѥѨхёѺѼђєѭѵѼѷћѯѤ҇҃пђџѾѬфчѬъѦѳ҈҅ѵҒҙѰқёѕҊѼѾѮѳҌѠѱѡҎҧқҒѺѪҊѥѪѪҥҌғҒѬҖҟѭѰҺѵ҆ѷҁ", (byte)12, 68);
                    NLoginCore_462.d[22] = NLoginCore_324.E("ԼԺՀԤԂՀ԰ԚԇԪԵԿԆՌԆՃԦԋԭԪՁ՗ԑԹՃԌԔՓԷԩԹԻԲԔ՞՗ԟԸ԰ԢԺՉԽԥդՖՠկբՇԾՍԽՄաՙընԲՖչԵ՗պԽՒատյՂեֈՒժ։Ր", (byte)12, 69);
                    NLoginCore_462.d[23] = NLoginCore_446.C("мЫтЫвШыЩћбаЪяэьџжѝгюжѥЬЭ", (byte)12, 67);
                    NLoginCore_462.d[24] = NLoginCore_138.D("лвмЏїірящЮѕдџЩОєЪфѤэѤхОгШЪиоФњѠѢаѰѕуѦбЯъѦїѬгчѸҁѬьѓѠћѠіѩѻ҉Ѡы҇јѣѦѯѽъюѠѰғѣҌѶіҒ҆қѷјѻҚҡѿѯѴѲњҞҞѼҭҨҀѬҊ҅ѿҫ҇҄ґҗҔґҪѻҫґғѵҳѺҚҟґӆҀҠӃҧҖҜҹ҇҈ҞҩҞҐ҅ҬӀӅҖҏҮҗҤҰҡ", (byte)12, 68);
                    NLoginCore_462.d[25] = NLoginCore_076.A("ÂÏæĂčíÔìÊËđðĐĔĈØĔďĕñĥąýüĆąĒâùąĜĆģįĀëĔąîö÷āöēđĔúľĹıĳĺŃÿĆĔēŇāğĕĕĥĽ", (byte)12, 65);
                    NLoginCore_462.d[26] = NLoginCore_451.D("ЪэєаѕУчњбФъС", (byte)12, 68);
                    NLoginCore_462.d[27] = NLoginCore_384.A("êæàĊìāîäïêíì×đÕ×êøùìĞąĚĄúăúĕčğĪíĩıĀĢĐõĥĲĀįĻĄĦõĊĪŀĞīĬĕĔŀıĦņěīĩŅŎŐĞĨĄēĞœĎĖēĴħŒěņĖđĨŎŚńĴŐŁŔĹœŊĺņŞŁş", (byte)12, 65);
                    NLoginCore_462.d[28] = NLoginCore_427.D("МЎпЯрѓЯДѓгиС", (byte)12, 68);
                    NLoginCore_462.d[29] = NLoginCore_201.B("ÏÇĈñāÌăÎí÷÷ÓñēĉċĎēģĠęĠåćàĤĈĔåýąĢđĬİĠþĉĞđĪĩĤĻēĸĖĵĩŁľĔđĳĊċ", (byte)12, 66);
                    NLoginCore_462.d[30] = NLoginCore_027.F("ՀԖԌԖԗՄԢԂԡՉԾԡԭԖԇ԰ԤԭՋԔՆԮԛԜ", (byte)12, 70);
                    NLoginCore_462.d[31] = NLoginCore_091.A("êæàĊìāîäïêíì×đÕ×êøùìĞąĚĄúăúĕčğĪíĩıĀĢĐõĥĲĀįĻĄĦõĊĪŀĞīĬĕĔŀıĦņěīĩŅŎŐďħĢĻľģĬŀĤŚĬĻńŚĮŝĒőŁŞĢĭŜğĵŔĹœŝķīł", (byte)12, 65);
                    NLoginCore_462.d[32] = NLoginCore_446.A("åòëÌõýÕčÎÙÑß", (byte)12, 65);
                    NLoginCore_462.d[33] = NLoginCore_091.F("ԀӸԹԢԲӽԴӿԞԨԨԄԢՄԺԼԿՄՔՑՊՑԖԸԑՕԹՅԖԮԶՓ԰Խ՚ՌՂԾԦզ՚գԵԦՉՏ՜ՀՂԩԩՍզմԻԼ", (byte)12, 70);
                    NLoginCore_462.d[34] = NLoginCore_223.E("ӸԁԴԠԏԹԿԚՅՇԹԐ", (byte)12, 69);
                    NLoginCore_462.d[35] = NLoginCore_027.C("КЌВЋЈдхфцФшиѕПЮсѓѠѓлђпЬЭ", (byte)12, 67);
                    NLoginCore_462.d[36] = NLoginCore_223.B("ÙÎčßąëÎĄĀÔôąåĚïğòýăëĤĎÿĥü÷øÿôĕĥġ", (byte)12, 66);
                    NLoginCore_462.d[37] = NLoginCore_384.B("āþĎáËáþéĆėâîóØÿĠØÿċęÿģêë", (byte)12, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_462.d[0] = NLoginCore_173.A("ÈĈÞĔĕßò×ďÖĄąÒþýóÛāĕČēģêë", (byte)12, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_462.d[0] = NLoginCore_559.E("ԐԻԼԿԡӽ԰ӾՀԉԪՊՎՎԸԽԞՉԡՎԝՔԛԜ", (byte)12, 69);
                }
            }
        }
    }

    public NLoginCore_462(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }
}

