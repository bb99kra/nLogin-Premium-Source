/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.LoginType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.tasks.CmdAfterAuthTask;
import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_035;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_310;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_001 {
    private static int l;
    private static int ag;
    private static long bb;
    private static int dh;
    private static long di;
    private static int t;
    private static int k;
    private static int dq;
    private static int bp;
    private static int cb;
    private static int ad;
    private static int aa;
    private static int w;
    private static int h;
    private static long co;
    private static int au;
    private static long j;
    private static int r;
    private static int g;
    private static int cd;
    private static String[] var_java_lang_String_arr_b;
    private static long ba;
    private static long p;
    private static long dp;
    private static int cl;
    private static int cv;
    private static int cf;
    private static int dd;
    private static int ac;
    private static int av;
    private static int dl;
    private static long dj;
    private static long bt;
    private static long ak;
    private static int de;
    private static int n;
    private static int at;
    private static int var_int_c;
    private static int bo;
    private static int bd;
    private static int cs;
    private static int dg;
    private static int q;
    private static int dm;
    private static long cn;
    private static long e;
    private static int bf;
    private static int ax;
    private static String[] var_java_lang_String_arr_a;
    private static int z;
    private static int ao;
    private static int cfr_renamed_1;
    private static int cp;
    private static int i;
    private static int db;
    private static int dz;
    private static long var_long_c;
    private static long bm;
    private static int bx;
    private static long bu;
    private static int am;
    private static int bg;
    private static long af;
    private static int cq;
    private static int bz;
    private static int dr;
    private static int f;
    private static int ea;
    private static int bc;
    private static long ch;
    private final NLoginCore_310 var_com_nickuc_login_NLoginType_005_a;
    private static int dt;
    private static int cz;
    private static int br;
    private static int v;
    private static int ca;
    private static int var_int_a;
    private static int by;
    private static int ct;
    private static int dv;
    private static int dc;
    private static int bs;
    private static int ci;
    private static long ae;
    private static int var_int_b;
    private static int dw;
    private static int cy;
    private static int cx;
    private static int ar;
    private static long cj;
    private static int s;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_b;
    private static int ce;
    private static int aw;
    private static long bq;
    private static int u;
    private static int as;
    private static long bh;
    private static long cg;
    private static int x;
    private static int dk;
    private static int cm;
    private static int bw;
    private static long ah;
    private static int ab;
    private static long bi;
    private static int aj;
    private static long al;
    private static int aq;
    private static long du;
    private static int be;
    private static int az;
    private static int ds;
    private static long cr;
    private static int bn;
    private static int df;
    private static int d;
    private static int cw;
    private static int dx;
    private static int da;
    private static int ck;
    private static int bv;
    private static int y;
    private static int m;
    private static int bk;
    private static int dy;
    private static long cu;
    private static int an;
    private static int ai;
    private static int bj;
    private static long o;
    private static int cc;
    private static int ay;
    private static int bl;
    private static int ap;
    private static int dn;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void a(NLoginCore_277 var1_1, String var2_2) {
        if ((var2_2 = var2_2.trim()).isEmpty()) {
            return;
        }
        var3_3 = var1_1.getName();
        v0 = new Object[NLoginType_001.ar];
        v0[NLoginType_001.as] = (boolean)NLoginType_001.at;
        v0[NLoginType_001.au] = (boolean)NLoginType_001.av;
        v0[NLoginType_001.aw] = NLoginType_001.ax;
        v0[NLoginType_001.ay] = null;
        var4_4 = v0;
        var5_5 = var2_2.split((String)NLoginType_001.c("㺀", (int)NLoginType_001.az, (long)(NLoginType_001.ba ^ NLoginType_001.bb)));
        var6_6 = new StringBuilder();
        block12: for (var7_7 = NLoginType_001.bc; var7_7 < var5_5.length; ++var7_7) {
            var8_9 = var5_5[var7_7];
            if (var8_9.isEmpty()) continue;
            if (var8_9.charAt(NLoginType_001.bd) != NLoginType_001.be) {
                if (var6_6.length() > 0) {
                    var6_6.append((String)NLoginType_001.c("㺕", (int)NLoginType_001.cm, (long)(NLoginType_001.cn ^ NLoginType_001.co)));
                }
                var6_6.append(var8_9);
                continue;
            }
            var9_11 = var8_9.toLowerCase(Locale.ENGLISH);
            var10_13 = NLoginType_001.bf;
            switch (var9_11.hashCode()) {
                case 822222103: {
                    if (!var9_11.equals(NLoginType_001.c("㺃", (int)NLoginType_001.bg, (long)(NLoginType_001.bh ^ NLoginType_001.bi)))) break;
                    var10_13 = NLoginType_001.bj;
                    break;
                }
                case 1939206702: {
                    if (!var9_11.equals(NLoginType_001.c("㺆", (int)(NLoginType_001.bk & NLoginType_001.bl), (long)NLoginType_001.bm))) break;
                    var10_13 = NLoginType_001.bn;
                    break;
                }
                case 1927733571: {
                    if (!var9_11.equals(NLoginType_001.c("㺉", (int)(NLoginType_001.bo & NLoginType_001.bp), (long)NLoginType_001.bq))) break;
                    var10_13 = NLoginType_001.br;
                    break;
                }
                case 59834243: {
                    if (!var9_11.equals(NLoginType_001.c("㺌", (int)NLoginType_001.bs, (long)(NLoginType_001.bt ^ NLoginType_001.bu)))) break;
                    var10_13 = NLoginType_001.bv;
                }
            }
            switch (var10_13) {
                case 0: {
                    var4_4[NLoginType_001.bw] = (boolean)NLoginType_001.bx;
                    continue block12;
                }
                case 1: {
                    var4_4[NLoginType_001.by] = (boolean)NLoginType_001.bz;
                    continue block12;
                }
                case 2: {
                    if (var7_7 + NLoginType_001.ca < var5_5.length) {
                        var4_4[NLoginType_001.cb] = NLoginCore_449.a(var5_5[++var7_7], (Integer)NLoginType_001.cc);
                        continue block12;
                    }
                    break;
                }
                case 3: {
                    if (var7_7 + NLoginType_001.cd < var5_5.length) {
                        if ((var11_14 = var5_5[++var7_7]) == null) continue block12;
                        if (var11_14.contains((CharSequence)NLoginType_001.c("㺏", (int)NLoginType_001.cf, (long)(NLoginType_001.cg ^ NLoginType_001.ch)))) {
                            v1 = var11_14.split((String)NLoginType_001.c("㺒", (int)NLoginType_001.ci, (long)NLoginType_001.cj));
                        } else {
                            v2 = new String[NLoginType_001.ck];
                            v1 = v2;
                            v2[NLoginType_001.cl] = var11_14;
                        }
                        var4_4[NLoginType_001.ce] = v1;
                        continue block12;
                    }
                }

                default: {
                    if (var6_6.length() > 0) {
                        var6_6.append((String)NLoginType_001.c("㺕", (int)NLoginType_001.cm, (long)(NLoginType_001.cn ^ NLoginType_001.co)));
                    }
                    var6_6.append(var8_9);
                }
            }
        }
        var7_8 = var6_6.toString().replace((CharSequence)NLoginType_001.c("㺘", (int)(NLoginType_001.cp & NLoginType_001.cq), (long)NLoginType_001.cr), var3_3).replace((CharSequence)NLoginType_001.c("㺛", (int)(NLoginType_001.cs & NLoginType_001.ct), (long)NLoginType_001.cu), var1_1.ac());
        if (var7_8.isEmpty()) {
            return;
        }
        var8_10 = (Boolean)var4_4[NLoginType_001.cv];
        var9_12 = this.var_com_nickuc_login_NLoginType_008_b.L() != false && (Boolean)var4_4[NLoginType_001.cw] != false ? NLoginType_001.cx : NLoginType_001.cy;
        var10_13 = Math.max((Integer)var4_4[NLoginType_001.cz], NLoginType_001.da) * NLoginType_001.db;
        var11_14 = (String[])var4_4[NLoginType_001.dc];
        var12_15 = () -> this.a(var9_12, var11_14, var1_1, var7_8, var8_10);
        if (var10_13 == 0) {
            var12_15.run();
        } else {
            this.var_com_nickuc_login_NLoginType_008_b.b((boolean)NLoginType_001.dd).a((Runnable)new CmdAfterAuthTask(var12_15), (long)var10_13, TimeUnit.MILLISECONDS);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_001.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ӷԙԛӻԟԾԶՌԸԇՅԻՉՃԌԱՓՒՊՐՊԟ", (byte)94, 67), NLoginType_001.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.D("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢢࢥࢋࢉࢤࢦ࢝࢐ࡻԣ", (byte)94, 68) + string + NLoginCore_223.A("ŵ", (byte)94, 65) + methodType.toString(), exception);
        }
    }

    private /* synthetic */ void a(boolean bl, String[] stringArray, NLoginCore_277 NLoginCore_277, String string, boolean bl2) {
        if (bl) {
            NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_b.c();
            if (stringArray != null) {
                String string3 = NLoginType_0102.java_lang_String_a(NLoginCore_277);
                if (Arrays.stream(stringArray).noneMatch(string2 -> string2.equals(string3))) {
                    return;
                }
            }
            Object[] objectArray = new Object[df];
            objectArray[NLoginType_001.dg] = NLoginType_001.c("㺀", (int)dh, (long)(di ^ dj));
            objectArray[NLoginType_001.dk] = dl;
            objectArray[NLoginType_001.dm] = NLoginType_001.c("㺃", (int)(dn & cfr_renamed_1), (long)dp);
            objectArray[NLoginType_001.dq] = string;
            objectArray[NLoginType_001.dr] = NLoginType_001.c("㺆", (int)(ds & dt), (long)du);
            objectArray[NLoginType_001.dv] = bl2;
            NLoginType_0102.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, de, objectArray);
        } else if (bl2) {
            this.var_com_nickuc_login_NLoginType_008_b.java_lang_Object_b().com_nickuc_login_NLoginInterface_006_a().l(string);
        } else {
            if (this.var_com_nickuc_login_NLoginType_008_b.L() && stringArray != null) {
                NLoginType_010 NLoginType_0103 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_b.c();
                String string4 = NLoginType_0103.java_lang_String_a(NLoginCore_277);
                if (Arrays.stream(stringArray).noneMatch(string2 -> string2.equals(string4))) {
                    return;
                }
            }
            if (string.charAt(dw) == dx && this.var_com_nickuc_login_NLoginType_008_b.com_nickuc_login_NLoginCore_364_b().a() != NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
                NLoginCore_277.l(string);
            } else {
                NLoginCore_277.p(string);
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = 49152 >>> 77 | 49152 << -77;
        var_int_c = (0 >>> 163 | 0 << ~163 + 1) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = Long.reverse(1721974606497653557L);
        f = 65536 >>> 80 | 65536 << ~80 + 1;
        g = (0x400000 >>> 149 | 0x400000 << -149) & 0xFFFFFFFF;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(-1);
        j = Long.reverse(1721974606497653557L);
        k = Integer.reverse(-1073741824);
        l = (0 >>> 148 | 0 << -148) & 0xFFFFFFFF;
        m = (4 >>> 96 | 4 << ~96 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(0x40000000);
        o = Long.reverse(-4042632916536581323L);
        p = Long.reverse(-3458764513820540928L);
        q = 0x28000000 >>> 187 | 0x28000000 << -187;
        r = 16384 >>> 78 | 16384 << -78;
        s = Integer.reverse(0);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(0);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 0 >>> 164 | 0 << ~164 + 1;
        x = 65536 >>> 240 | 65536 << ~240 + 1;
        y = Integer.reverse(0);
        z = (0 >>> 77 | 0 << ~77 + 1) & 0xFFFFFFFF;
        aa = (0x8000000 >>> 219 | 0x8000000 << -219) & 0xFFFFFFFF;
        ab = 0 >>> 20 | 0 << -20;
        ac = (0x400000 >>> 22 | 0x400000 << -22) & 0xFFFFFFFF;
        ad = Integer.reverse(-1073741824);
        ae = Long.reverse(-4042632916536581323L);
        af = Long.reverse(-3458764513820540928L);
        ag = Integer.reverse(0x20000000);
        ah = Long.reverse(1721974606497653557L);
        ai = Integer.reverse(0);
        aj = 0x28000000 >>> 27 | 0x28000000 << -27;
        ak = Long.reverse(-4042632916536581323L);
        al = Long.reverse(-3458764513820540928L);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = 0 >>> 212 | 0 << ~212 + 1;
        ao = Integer.reverse(0);
        ap = Integer.reverse(0);
        aq = Integer.reverse(0);
        ar = (262144 >>> 80 | 262144 << -80) & 0xFFFFFFFF;
        as = (0 >>> 218 | 0 << ~218 + 1) & 0xFFFFFFFF;
        at = Integer.reverse(0);
        au = 8 >>> 35 | 8 << -35;
        av = 0x10000000 >>> 220 | 0x10000000 << -220;
        aw = Integer.reverse(0x40000000);
        ax = 0 >>> 71 | 0 << -71;
        ay = (48 >>> 4 | 48 << ~4 + 1) & 0xFFFFFFFF;
        az = Integer.reverse(0x60000000);
        ba = Long.reverse(-4042632916536581323L);
        bb = Long.reverse(-3458764513820540928L);
        bc = (0 >>> 81 | 0 << ~81 + 1) & 0xFFFFFFFF;
        bd = Integer.reverse(0);
        be = (0x100000 >>> 78 | 0x100000 << ~78 + 1) & 0xFFFFFFFF;
        bf = -1 >>> 137 | -1 << ~137 + 1;
        bg = Integer.reverse(-536870912);
        bh = Long.reverse(-4042632916536581323L);
        bi = Long.reverse(-3458764513820540928L);
        bj = 0 >>> 208 | 0 << ~208 + 1;
        bk = Integer.reverse(0x10000000);
        bl = (-1 >>> 141 | -1 << -141) & 0xFFFFFFFF;
        bm = Long.reverse(1721974606497653557L);
        bn = 2048 >>> 107 | 2048 << ~107 + 1;
        bo = Integer.reverse(-1879048192);
        bp = Integer.reverse(-1);
        bq = Long.reverse(1721974606497653557L);
        br = 0x8000000 >>> 218 | 0x8000000 << ~218 + 1;
        bs = Integer.reverse(0x50000000);
        bt = Long.reverse(-4042632916536581323L);
        bu = Long.reverse(-3458764513820540928L);
        bv = Integer.reverse(-1073741824);
        bw = Integer.reverse(0);
        bx = Integer.reverse(Integer.MIN_VALUE);
        by = (0x2000000 >>> 249 | 0x2000000 << ~249 + 1) & 0xFFFFFFFF;
        bz = (0 >>> 157 | 0 << -157) & 0xFFFFFFFF;
        ca = Integer.reverse(Integer.MIN_VALUE);
        cb = (65536 >>> 175 | 65536 << -175) & 0xFFFFFFFF;
        cc = Integer.reverse(0);
        cd = Integer.reverse(Integer.MIN_VALUE);
        ce = Integer.reverse(-1073741824);
        cf = Integer.reverse(-805306368);
        cg = Long.reverse(-4042632916536581323L);
        ch = Long.reverse(-3458764513820540928L);
        ci = 0x300000 >>> 50 | 0x300000 << ~50 + 1;
        cj = Long.reverse(1721974606497653557L);
        ck = 0x800000 >>> 151 | 0x800000 << -151;
        cl = (0 >>> 80 | 0 << -80) & 0xFFFFFFFF;
        cm = (0x1A000000 >>> 185 | 0x1A000000 << ~185 + 1) & 0xFFFFFFFF;
        cn = Long.reverse(-4042632916536581323L);
        co = Long.reverse(-3458764513820540928L);
        cp = (0x1C0000 >>> 209 | 0x1C0000 << -209) & 0xFFFFFFFF;
        cq = -1 >>> 67 | -1 << -67;
        cr = Long.reverse(1721974606497653557L);
        cs = (0x7800000 >>> 215 | 0x7800000 << ~215 + 1) & 0xFFFFFFFF;
        ct = (-1 >>> 46 | -1 << ~46 + 1) & 0xFFFFFFFF;
        cu = Long.reverse(1721974606497653557L);
        cv = Integer.reverse(0);
        cw = (0x1000000 >>> 24 | 0x1000000 << -24) & 0xFFFFFFFF;
        cx = Integer.reverse(Integer.MIN_VALUE);
        cy = Integer.reverse(0);
        cz = Integer.reverse(0x40000000);
        da = 0 >>> 39 | 0 << -39;
        db = (-2147483636 >>> 158 | -2147483636 << -158) & 0xFFFFFFFF;
        dc = Integer.reverse(-1073741824);
        dd = (0 >>> 183 | 0 << ~183 + 1) & 0xFFFFFFFF;
        de = 1 >>> 126 | 1 << -126;
        df = Integer.reverse(0x60000000);
        dg = 0 >>> 240 | 0 << -240;
        dh = Integer.reverse(0x8000000);
        di = Long.reverse(-4042632916536581323L);
        dj = Long.reverse(-3458764513820540928L);
        dk = Integer.reverse(Integer.MIN_VALUE);
        dl = (0x1000000 >>> 152 | 0x1000000 << -152) & 0xFFFFFFFF;
        dm = (1024 >>> 73 | 1024 << ~73 + 1) & 0xFFFFFFFF;
        dn = Integer.reverse(-2013265920);
        cfr_renamed_1 = Integer.reverse(-1);
        dp = Long.reverse(1721974606497653557L);
        dq = Integer.reverse(-1073741824);
        dr = Integer.reverse(0x20000000);
        ds = Integer.reverse(0x48000000);
        dt = -1 >>> 243 | -1 << -243;
        du = Long.reverse(1721974606497653557L);
        dv = (-2147483646 >>> 255 | -2147483646 << ~255 + 1) & 0xFFFFFFFF;
        dw = (0 >>> 149 | 0 << -149) & 0xFFFFFFFF;
        dx = Integer.reverse(-201326592);
        dy = Integer.reverse(Integer.MIN_VALUE);
        dz = Integer.reverse(-939524096);
        ea = Integer.reverse(-939524096);
        var_java_lang_String_arr_a = new String[dz];
        var_java_lang_String_arr_b = new String[ea];
        NLoginType_001.b();
    }

    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        String string;
        NLoginCore_154 NLoginInterface_0122;
        if (bl) {
            this.var_com_nickuc_login_NLoginType_005_a.a(NLoginCore_277, NLoginCore_5092);
        }
        if ((NLoginInterface_0122 = (NLoginCore_154)NLoginCore_5092.a(NLoginCore_567.H)) != null) {
            NLoginInterface_0122.c(this.var_com_nickuc_login_NLoginType_008_b, NLoginCore_277, NLoginCore_5092);
        }
        if ((string = (String)NLoginCore_5092.a(NLoginCore_567.G)) != null) {
            Object[] objectArray = new Object[am];
            objectArray[NLoginType_001.an] = string;
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ay, objectArray);
        }
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0x2F73A6BFB236F5C0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(64 + 5), (byte)(20 + 63), (byte)(19 + 28), (byte)(51 + 16), (byte)(11 + 55), (byte)(33 + 34), (byte)(9 + 38), (byte)(71 + 9), (byte)(12 + 63), (byte)(57 + 10), 83, (byte)(49 + 4), (byte)(51 + 29), (byte)(78 + 19), (byte)(61 + 39), (byte)(66 + 34), (byte)(92 + 13), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.B("äñð³óïêóþíºøüõøþÀєїнліјятЭ", (byte)1, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_001.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void a(NLoginCore_277 NLoginCore_277, boolean bl) {
        List<String> list;
        List<String> list2 = list = bl ? NLoginCore_532.aq.a(new Object[ao]) : NLoginCore_532.ar.a(new Object[ap]);
        if (list.isEmpty()) {
            return;
        }
        Runnable runnable = () -> list.forEach(arg_0 -> this.a(NLoginCore_277, arg_0));
        this.var_com_nickuc_login_NLoginType_008_b.b(aq != 0).a(new CmdAfterAuthTask(runnable));
    }

    @Generated
    public NLoginType_001(NLoginType_008 NLoginType_008, NLoginCore_310 NLoginType_0052) {
        this.var_com_nickuc_login_NLoginType_008_b = NLoginType_008;
        this.var_com_nickuc_login_NLoginType_005_a = NLoginType_0052;
    }

    private static void b() {
        int n;
        var_long_c = -5997509100165552157L;
        long l = var_long_c ^ 0x2F73A6BFB236F5C0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(58 + 11), (byte)(55 + 28), (byte)(9 + 38), (byte)(52 + 15), (byte)(43 + 23), (byte)(44 + 23), 47, (byte)(62 + 18), (byte)(13 + 62), 67, (byte)(75 + 8), (byte)(13 + 40), (byte)(21 + 59), (byte)(30 + 67), (byte)(47 + 53), (byte)(51 + 49), (byte)(79 + 26), (byte)(34 + 76), (byte)(68 + 35)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_001.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ƂǇƭƨǊƬƾǕǑưƑƟ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ՆԼբՔՏՎՈԵՅՐզՇՍչաՏպՎՓՀյ՚բմֆՊաՃՇևզ՟", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[2] = NLoginCore_076.C("ԪՇՒՇմգԵՎգՑԴ՗ՆղՌԷ՞ռճմԽՏՌՍ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[3] = NLoginCore_091.F("֠֐մ֢ձ֛պոգ֚֭֗ը֜֙֬֊֤֝֜օղֶ֒֫ո֑֒ո֖֯׀։ֳ֜ռֱַֹֽ֖֘֡׆ׂ֛֦ׅ֠֨׀ֵד֮֞֠ׄדׇֻ֛־ֶֹ֛֮׀ׁף֡׈֠׊ֿ׋ְ", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[4] = NLoginCore_223.D("բծ՜ԬՀէՠՔզխԳՁ", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ƢƛǅǇƧƬƟƷǍǚƬǎǖǒƱǕƠƪǁǐǓǀƿǇǉǁǔǛƿƿƹǊǱǐƬǭǝǭƱǡǇǶǋǻǋǷƵǳǮǢƾȁǙǽǲǼǰǞǙȇǵǄǥȃǌȇȃǌȋȐǐǠșȃǧȓǺȕȜǕȋǠȕȌȣȓȔǴȝǾȨȝȔǣȣș", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[6] = NLoginCore_027.E("֑ՙլյ֖վ՞պ֚֨ջհ", (byte)108, 69);
                    NLoginType_001.var_java_lang_String_arr_b[7] = NLoginCore_091.B("ǎƢƎƫƊƧƞƮƮǓƷƣƕǌưǋƬǊƝƷƠƽƪƫ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[8] = NLoginCore_387.C("ԲԱբՃՏաԳՌԶթնՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[9] = NLoginCore_004.B("ƪǌǅƼƤƠǌƏƠǑƪƟ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[10] = NLoginCore_076.C("ՅՁԯըըԲլՌԱդղՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[11] = NLoginCore_446.C("Ճ՛ՇԿՐԿթՊձՐԳՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[12] = NLoginCore_091.E("ղ֊նծտծ֘չ֠տբհ", (byte)108, 69);
                    NLoginType_001.var_java_lang_String_arr_b[13] = NLoginCore_384.E("֑ՙլյ֖վ՞պ֚֨ջհ", (byte)108, 69);
                    NLoginType_001.var_java_lang_String_arr_b[14] = NLoginCore_575.E("֝֌յ՚ղ֦֓֝֙յբհ", (byte)108, 69);
                    NLoginType_001.var_java_lang_String_arr_b[15] = NLoginCore_027.D("ԱբդԬԿ՘գծ՚ԸԴԴշծհ՗ՔՌՒքմօՌՍ", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[16] = NLoginCore_559.B("ưưƯƯƜƯƧƨǆƖǔƟ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[17] = NLoginCore_384.D("Ղ՝ՀիՍՄՅՙՙԷ՘Ձ", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[18] = NLoginCore_092.F("֡նձ֛ՠ֔՟֘գ֕թ֜ժ֖֎֯֎ցֲ֝օվջռ", (byte)108, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_001.var_java_lang_String_arr_b[0] = NLoginCore_173.F("֞֏ջ֜՛֎֏՟՟֧֥֗ց֎ռ֘֟թ֠խְ֎ջռ", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[1] = NLoginCore_384.A("ƤƚǀƲƭƬƦƓƣƮǄƥƫǗƿƭǘƬƱƞǓƺƘǖƟƿƢƺƦƼǝƦ", (byte)108, 65);
                    NLoginType_001.var_java_lang_String_arr_b[2] = NLoginCore_453.A("ƈƥưƥǒǁƓƬǁƯƒƵưƬƨƷƛǎǔǁǓƽƪƫ", (byte)108, 65);
                    NLoginType_001.var_java_lang_String_arr_b[3] = NLoginCore_201.F("֠֐մ֢ձ֛պոգ֚֭֗ը֜֙֬֊֤֝֜օղֶ֒֫ո֑֒ո֖֯׀։ֳ֜ռֱַֹֽ֖֘֡׆ׂ֛֦ׅ֠֨׀ֵד֮֞֠ׄדׇֻ֛־֛֢֚֮עגסׇ׆֞דְֿ֠", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[4] = NLoginCore_453.C("ԬՓզԧճԳՄզյլՌՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[5] = NLoginCore_076.A("ƢƛǅǇƧƬƟƷǍǚƬǎǖǒƱǕƠƪǁǐǓǀƿǇǉǁǔǛƿƿƹǊǱǐƬǭǝǭƱǡǇǶǋǻǋǷƵǳǮǢƾȁǙǽǲǼǰǞǙȇǵǄǥȃǌȇȃǌȋȐǐǠșȃǧȓǺȕȜǕȋǠȕȌȣȡǸǦȣȅȂȈȜȧȂǫȟȮȡǰȁǬȉȸȔȦǹǿ", (byte)108, 65);
                    NLoginType_001.var_java_lang_String_arr_b[6] = NLoginCore_324.C("կԽՀԾլՇԪՍդՕՌՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ǎƢƎƫƊƧƞƮƮǓƷǃǌǞƜưƲǡƟƽǕǣƪƫ", (byte)108, 65);
                    NLoginType_001.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ƂǌƒƎǍǆƦǍǗƴǃƒưǗǙƳƚƿƮƛǟǣƪƫ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[9] = NLoginCore_575.D("ՁՓյԵզՍչԫՖՍԷԴՙճՋԾՙ՚ՔՎԾՏՌՍ", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[10] = NLoginCore_201.B("ƧƑƛƜơƽƷǁƢƴǚǗǓǍǚǓƴƠƙǘǁƽƪƫ", (byte)108, 66);
                    NLoginType_001.var_java_lang_String_arr_b[11] = NLoginCore_110.E("՘ՠպւ֝քց֡վնփհ", (byte)108, 69);
                    NLoginType_001.var_java_lang_String_arr_b[12] = NLoginCore_173.C("ըաՔԬձզՙժպԭՐՁ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[13] = NLoginCore_575.D("՚՛ՕլիԲՊՙՖԲժՁ", (byte)108, 68);
                    NLoginType_001.var_java_lang_String_arr_b[14] = NLoginCore_384.F("շ֏բդֆն֖֩գաա֊֠֍ւվձ֒֍ֆ֕֎ջռ", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[15] = NLoginCore_324.F("ՠ֑֓՛ծև֒֝։էեպե֬֌֣֚֘֜֡֒֎ջռ", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[16] = NLoginCore_384.F("֛յբջ֢հոՠ֖ըթ֢֖֌֭֙֠։֮ւծִջռ", (byte)108, 70);
                    NLoginType_001.var_java_lang_String_arr_b[17] = NLoginCore_559.C("Սխկ՝Ղ՟ՒչպԴՒՏՋմԸ՘ՍպԽտ՜օՌՍ", (byte)108, 67);
                    NLoginType_001.var_java_lang_String_arr_b[18] = NLoginCore_092.A("ǐƥƠǊƏǃƎǇƒǄƗƮǉǌƔǌƻǑƻǁǍǓƪƫ", (byte)108, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_001.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ƙƎƈƩƬǓƩƨƕǚƹƬǊǕƘǌǀƠƻǚƽǣƪƫ", (byte)108, 66);
                    continue block7;
                }
                case 4: {
                    NLoginType_001.var_java_lang_String_arr_b[0] = NLoginCore_076.C("ՇՋ՞ձԶԶՒ՘բՉճԺՈՓՉթԿՌՍգՐֈՁփ֊՘ռԿօ՘֍ւ", (byte)108, 67);
                }
            }
        }
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, LoginType loginType, String string) {
        try {
            Object object;
            if (!NLoginCore_277.R()) {
                return;
            }
            NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f);
            LoginMainQueueTask.n(NLoginCore_277);
            boolean bl = ForceRegisterConfig2.v();
            if (loginType != LoginType.REGISTER) {
                this.var_com_nickuc_login_NLoginType_008_b.com_nickuc_login_NLoginCore_291_a().void_a(ForceRegisterConfig2, NLoginCore_277.ac(), string);
            }
            if (this.var_com_nickuc_login_NLoginType_008_b.L()) {
                object = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_b.c();
                Object[] objectArray = new Object[var_int_b];
                objectArray[NLoginType_001.var_int_c] = NLoginType_001.c("㺀", (int)d, (long)e);
                objectArray[NLoginType_001.f] = loginType.ordinal();
                objectArray[NLoginType_001.g] = NLoginType_001.c("㺃", (int)(h & i), (long)j);
                objectArray[NLoginType_001.k] = l != 0;
                objectArray[NLoginType_001.m] = NLoginType_001.c("㺆", (int)n, (long)(o ^ p));
                objectArray[NLoginType_001.q] = (!NLoginCore_5092.a(NLoginCore_567.L) && !NLoginCore_592.var_com_nickuc_login_NLoginCore_532_g.ar() && !NLoginCore_592.var_com_nickuc_login_NLoginCore_532_i.ar() ? r : s) != 0;
                object.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, var_int_a, objectArray);
            }
            if ((object = this.var_com_nickuc_login_NLoginType_008_b.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginCore_033_a()) != null) {
                ((NLoginCore_033)object).a(NLoginCore_277, NLoginCore_035.var_com_nickuc_login_NLoginCore_035_a);
            }
            this.a(NLoginCore_277, (loginType == LoginType.REGISTER || bl ? t : u) != 0);
            Object[] objectArray = new Object[v];
            objectArray[NLoginType_001.w] = NLoginCore_277;
            this.var_com_nickuc_login_NLoginType_008_b.a(EventEnum.AUTHENTICATE_EVENT, objectArray);
            int n = x;
            if (this.var_com_nickuc_login_NLoginType_008_b.L() && (NLoginCore_5092.a(NLoginCore_567.L) || NLoginCore_592.var_com_nickuc_login_NLoginCore_532_g.ar() || NLoginCore_592.var_com_nickuc_login_NLoginCore_532_i.ar())) {
                NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_b.c();
                int n2 = Math.max(NLoginCore_592.var_com_nickuc_login_NLoginCore_532_e.r(), y);
                if (n2 > 0) {
                    n = z;
                    this.var_com_nickuc_login_NLoginType_008_b.b(aa != 0).a(() -> {
                        if (!NLoginCore_277.R()) {
                            return;
                        }
                        if (NLoginType_0102.a(NLoginCore_277, NLoginCore_5092) == null) {
                            this.a(NLoginCore_277, NLoginCore_5092, dy != 0);
                        }
                    }, (long)n2, TimeUnit.MILLISECONDS);
                } else if (NLoginType_0102.a(NLoginCore_277, NLoginCore_5092) != null) {
                    n = ab;
                }
            }
            if (n != 0) {
                this.a(NLoginCore_277, NLoginCore_5092, ac != 0);
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_001.c("㺉", (int)ad, (long)(ae ^ af)) + NLoginCore_277.getName() + (String)NLoginType_001.c("㺌", (int)ag, (long)ah), throwable, new Object[ai]);
            NLoginCore_277.a((String)NLoginType_001.c("㺏", (int)aj, (long)(ak ^ al)));
        }
    }
}

