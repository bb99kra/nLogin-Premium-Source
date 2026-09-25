/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_082;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
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
import com.nickuc.login.NLoginCore_115;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_526
extends NLoginCore_098 {
    private static long bs;
    private static int hh;
    private static long fi;
    private static int jo;
    private static long iw;
    private static long bm;
    private static int gj;
    private static long el;
    private static long ha;
    private static long hp;
    private static int bf;
    private static int gs;
    private static int cm;
    private static long ge;
    private static int hg;
    private static long hl;
    private static int dd;
    private static long ik;
    private static int iq;
    private static int dq;
    private static int fz;
    private static long ds;
    private static int jl;
    private static int kf;
    private static int bu;
    private static long ip;
    private static int dx;
    private static int hm;
    private static long fu;
    private static int fr;
    private static long iv;
    private static int dw;
    private static long io;
    private static long is;
    private static long fn;
    private static int je;
    private static int bl;
    private static long jj;
    private static long go;
    private static long ab;
    private static int cy;
    private static long cd;
    private static int kh;
    private static int gh;
    private static int ch;
    private static int var_int_e;
    private static long eo;
    private static long kd;
    private static int ic;
    private static long ee;
    private static int fp;
    private static int jt;
    private static int ji;
    private static int gq;
    private static int fv;
    private static int ii;
    private static int cr;
    private static long q;
    private static int fw;
    private static long ft;
    private static long hi;
    private static long ez;
    private static int eq;
    private static int hj;
    private static long bv;
    private static int gm;
    private static int bd;
    private static long fc;
    private static long gx;
    private static long by;
    private static int kg;
    private static int ix;
    private static int ie;
    private static int gc;
    private static int al;
    private static long eb;
    private static int bz;
    private static long jk;
    private static int er;
    private static long gi;
    private static long df;
    private static int cj;
    private static long dp;
    private static int z;
    private static int bg;
    private static int gv;
    private static long bo;
    private static int it;
    private static long cn;
    private static long jq;
    private static int gd;
    private static int dz;
    private static long at;
    private static int gg;
    private static int ce;
    private static int ao;
    private static long dy;
    private static long fq;
    private static long ig;
    private static long dm;
    private static long o;
    private static int bp;
    private static int ek;
    private static long ca;
    private static long es;
    private static int dk;
    private static int hy;
    private static int de;
    private static long jv;
    private static long gu;
    private static long p;
    private static int gw;
    private static int im;
    private static long id;
    private static long fj;
    private static long jc;
    private static int ex;
    private static long cz;
    private static long hn;
    private static int ka;
    private static int ki;
    private static int dh;
    private static String[] var_java_lang_String_arr_e;
    private static int co;
    private static long ct;
    private static long br;
    private static int fa;
    private static long iz;
    private static int cv;
    private static int eu;
    private static int ir;
    private static int bi;
    private static int kc;
    private static long bk;
    private static int fl;
    private static int y;
    private static int ke;
    private static int fh;
    private static long fx;
    private static long ju;
    private static String[] f;
    private static long dv;
    private static int cg;
    private static long ff;
    private static long jg;
    private static long kb;
    private static long hz;
    private static long dc;

    /*
     * Unable to fully structure code
     */
    @Override
    protected void b(ResultSet var1_1) {
        this.r = var1_1.getString((String)NLoginCore_526.c("㺀", (int)(NLoginCore_526.hg & NLoginCore_526.hh), (long)NLoginCore_526.hi));
        var2_2 = var1_1.getBytes((String)NLoginCore_526.c("㺃", (int)NLoginCore_526.hj, (long)NLoginCore_526.hl));
        if (var2_2.length == 0) {
            return;
        }
        try {
            var4_3 = new DataInputStream(new ByteArrayInputStream(var2_2));
            try {
                var5_6 = Math.toIntExact(var4_3.readLong());
                var6_9 = NLoginCore_115.a(var5_6);
                if (var6_9 == null) {
                    this.e(this.r, var2_2.length + (String)NLoginCore_526.c("㺆", (int)NLoginCore_526.hm, (long)(NLoginCore_526.hn ^ NLoginCore_526.hp)), Integer.toString(var5_6));
                    return;
                }
                switch (NLoginCore_082.o[var6_9.ordinal()]) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        var3_11 = new String(NLoginCore_526.a(var4_3, var4_3.available()), StandardCharsets.UTF_8);
                        break;
lbl17:
                        // 1 sources

                        break;
                    }
                    case 5: 
                    case 6: {
                        var7_12 = new String(NLoginCore_526.a(var4_3, var4_3.available()), StandardCharsets.UTF_8);
                        var3_11 = (String)NLoginCore_526.c("㺉", (int)NLoginCore_526.hy, (long)NLoginCore_526.hz) + var6_9.cp + (String)NLoginCore_526.c("㺌", (int)NLoginCore_526.ic, (long)NLoginCore_526.id) + var7_12;
                        break;
lbl22:
                        // 1 sources

                        break;
                    }
                    case 7: 
                    case 8: {
                        var7_13 = var4_3.readUTF();
                        var8_15 = var4_3.readUTF();
                        var3_11 = (String)NLoginCore_526.c("㺏", (int)NLoginCore_526.ie, (long)NLoginCore_526.ig) + var6_9.cp + (String)NLoginCore_526.c("㺒", (int)NLoginCore_526.ii, (long)NLoginCore_526.ik) + var7_13 + (String)NLoginCore_526.c("㺕", (int)NLoginCore_526.im, (long)(NLoginCore_526.io ^ NLoginCore_526.ip)) + var8_15;
                        break;
lbl28:
                        // 1 sources

                        break;
                    }
                    case 9: 
                    case 10: {
                        var4_3.reset();
                        var7_14 = Base64.getEncoder().withoutPadding().encodeToString(NLoginCore_526.a(var4_3, var4_3.available()));
                        var3_11 = (String)NLoginCore_526.c("㺘", (int)(NLoginCore_526.iq & NLoginCore_526.ir), (long)NLoginCore_526.is) + var7_14;
                        break;
lbl34:
                        // 1 sources

                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException((String)NLoginCore_526.c("㺛", (int)NLoginCore_526.it, (long)(NLoginCore_526.iv ^ NLoginCore_526.iw)) + (Object)var6_9 + (String)NLoginCore_526.c("㺞", (int)NLoginCore_526.ix, (long)(NLoginCore_526.iz ^ NLoginCore_526.jc)));
                    }
                }
            }
            finally {
                var4_3.close();
            }
        }
        catch (IOException var4_4) {
            throw new IllegalArgumentException((String)NLoginCore_526.c("㺡", (int)NLoginCore_526.je, (long)NLoginCore_526.jg) + this.r);
        }
        var4_5 = var1_1.getBoolean((String)NLoginCore_526.c("㺤", (int)NLoginCore_526.ji, (long)(NLoginCore_526.jj ^ NLoginCore_526.jk)));
        var5_8 = NLoginCore_432.c(var1_1.getString((String)NLoginCore_526.c("㺧", (int)(NLoginCore_526.jl & NLoginCore_526.jo), (long)NLoginCore_526.jq)));
        if (var4_5) {
            this.a(this.r, var3_11, (String)null, var5_8, (UUID)null);
        } else {
            this.a(this.r, var3_11, null, var5_8);
        }
    }

    @Override
    protected NLoginCore_219 com_nickuc_login_NLoginCore_219_a(String string) {
        NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(string, new File(this.java_io_File_b() + File.separator + (String)NLoginCore_526.c("㺀", (int)(al & ao), (long)at)), bd != 0);
        NLoginCore_2192.a(bf != 0);
        return NLoginCore_2192;
    }

    public NLoginCore_526(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_h, (String)NLoginCore_526.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_526.c("㺃", (int)(y & z), (long)ab));
    }

    private static /* synthetic */ void a(Properties properties, String string) {
        String[] stringArray = string.split((String)NLoginCore_526.c("㺀", (int)kc, (long)kd));
        if (stringArray.length == ke) {
            properties.setProperty(stringArray[kf], stringArray[kg]);
        }
    }

    public static byte[] a(InputStream inputStream, int n) {
        byte[] byArray = new byte[n];
        int n2 = inputStream.read(byArray);
        if (n2 != n) {
            throw new IllegalArgumentException((String)NLoginCore_526.c("㺀", (int)jt, (long)(ju ^ jv)) + n + (String)NLoginCore_526.c("㺃", (int)ka, (long)kb) + n2);
        }
        return byArray;
    }

    private static String a(int n, long l) {
        l ^= 0x6EL;
        l ^= 0x320E9225FDB8E3FDL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(48 + 21), (byte)(46 + 37), (byte)(22 + 25), (byte)(57 + 10), (byte)(49 + 17), (byte)(38 + 29), (byte)(22 + 25), (byte)(5 + 75), (byte)(31 + 44), (byte)(3 + 64), (byte)(62 + 21), (byte)(29 + 24), (byte)(33 + 47), 97, 100, (byte)(15 + 85), (byte)(93 + 12), (byte)(102 + 8), (byte)(86 + 17)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.D("шѕєЗїѓюїѢёОќѠљќѢФ޶ި޸޽޷޲߅߆ް", (byte)16, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_526.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(2291054160690583547L);
        q = Long.reverse(0x7600000000000000L);
        y = 256 >>> 136 | 256 << -136;
        z = Integer.reverse(-1);
        ab = Long.reverse(7623316119497250811L);
        al = (2048 >>> 10 | 2048 << -10) & 0xFFFFFFFF;
        ao = Integer.reverse(-1);
        at = Long.reverse(7623316119497250811L);
        bd = Integer.reverse(0);
        bf = 0x20000000 >>> 125 | 0x20000000 << ~125 + 1;
        bg = 0xC000000 >>> 218 | 0xC000000 << ~218 + 1;
        bi = -1 >>> 86 | -1 << -86;
        bk = Long.reverse(7623316119497250811L);
        bl = (0x40000000 >>> 156 | 0x40000000 << ~156 + 1) & 0xFFFFFFFF;
        bm = Long.reverse(2291054160690583547L);
        bo = Long.reverse(0x7600000000000000L);
        bp = (10 >>> 161 | 10 << -161) & 0xFFFFFFFF;
        br = Long.reverse(2291054160690583547L);
        bs = Long.reverse(0x7600000000000000L);
        bu = Integer.reverse(0x60000000);
        bv = Long.reverse(2291054160690583547L);
        by = Long.reverse(0x7600000000000000L);
        bz = Integer.reverse(-536870912);
        ca = Long.reverse(2291054160690583547L);
        cd = Long.reverse(0x7600000000000000L);
        ce = Integer.reverse(0);
        cg = 0x800000 >>> 215 | 0x800000 << ~215 + 1;
        ch = Integer.reverse(-1);
        cj = Integer.reverse(0x10000000);
        cm = (-1 >>> 47 | -1 << -47) & 0xFFFFFFFF;
        cn = Long.reverse(7623316119497250811L);
        co = Integer.reverse(0);
        cr = 0x9000000 >>> 152 | 0x9000000 << -152;
        ct = Long.reverse(7623316119497250811L);
        cv = (0x2000000 >>> 217 | 0x2000000 << -217) & 0xFFFFFFFF;
        cy = (327680 >>> 15 | 327680 << ~15 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(2291054160690583547L);
        dc = Long.reverse(0x7600000000000000L);
        dd = 65536 >>> 111 | 65536 << -111;
        de = (0x2C00000 >>> 182 | 0x2C00000 << ~182 + 1) & 0xFFFFFFFF;
        df = Long.reverse(7623316119497250811L);
        dh = (12288 >>> 76 | 12288 << -76) & 0xFFFFFFFF;
        dk = Integer.reverse(0x30000000);
        dm = Long.reverse(2291054160690583547L);
        dp = Long.reverse(0x7600000000000000L);
        dq = (6656 >>> 73 | 6656 << ~73 + 1) & 0xFFFFFFFF;
        ds = Long.reverse(2291054160690583547L);
        dv = Long.reverse(0x7600000000000000L);
        dw = (28 >>> 129 | 28 << ~129 + 1) & 0xFFFFFFFF;
        dx = Integer.reverse(-1);
        dy = Long.reverse(7623316119497250811L);
        dz = Integer.reverse(-268435456);
        eb = Long.reverse(2291054160690583547L);
        ee = Long.reverse(0x7600000000000000L);
        ek = Integer.reverse(0x8000000);
        el = Long.reverse(2291054160690583547L);
        eo = Long.reverse(0x7600000000000000L);
        eq = -2013265920 >>> 123 | -2013265920 << ~123 + 1;
        er = Integer.reverse(-1);
        es = Long.reverse(7623316119497250811L);
        eu = Integer.reverse(0x48000000);
        ex = (-1 >>> 231 | -1 << -231) & 0xFFFFFFFF;
        ez = Long.reverse(7623316119497250811L);
        fa = (152 >>> 99 | 152 << ~99 + 1) & 0xFFFFFFFF;
        fc = Long.reverse(2291054160690583547L);
        ff = Long.reverse(0x7600000000000000L);
        fh = Integer.reverse(0x28000000);
        fi = Long.reverse(2291054160690583547L);
        fj = Long.reverse(0x7600000000000000L);
        fl = Integer.reverse(-1476395008);
        fn = Long.reverse(7623316119497250811L);
        fp = (0x16000000 >>> 216 | 0x16000000 << -216) & 0xFFFFFFFF;
        fq = Long.reverse(7623316119497250811L);
        fr = Integer.reverse(-402653184);
        ft = Long.reverse(2291054160690583547L);
        fu = Long.reverse(0x7600000000000000L);
        fv = Integer.reverse(0x18000000);
        fw = -1 >>> 167 | -1 << -167;
        fx = Long.reverse(7623316119497250811L);
        fz = Integer.reverse(0);
        gc = -134215681 >>> 251 | -134215681 << -251;
        gd = Integer.reverse(-1744830464);
        ge = Long.reverse(7623316119497250811L);
        gg = Integer.reverse(-1);
        gh = Integer.reverse(0x58000000);
        gi = Long.reverse(7623316119497250811L);
        gj = Integer.reverse(0);
        gm = Integer.reverse(-671088640);
        go = Long.reverse(7623316119497250811L);
        gq = Integer.reverse(Integer.MIN_VALUE);
        gs = Integer.reverse(0x38000000);
        gu = Long.reverse(7623316119497250811L);
        gv = Integer.reverse(0x40000000);
        gw = Integer.reverse(-1207959552);
        gx = Long.reverse(2291054160690583547L);
        ha = Long.reverse(0x7600000000000000L);
        hg = Integer.reverse(0x78000000);
        hh = Integer.reverse(-1);
        hi = Long.reverse(7623316119497250811L);
        hj = Integer.reverse(-134217728);
        hl = Long.reverse(7623316119497250811L);
        hm = Integer.reverse(0x4000000);
        hn = Long.reverse(2291054160690583547L);
        hp = Long.reverse(0x7600000000000000L);
        hy = (16896 >>> 169 | 16896 << ~169 + 1) & 0xFFFFFFFF;
        hz = Long.reverse(7623316119497250811L);
        ic = (557056 >>> 46 | 557056 << -46) & 0xFFFFFFFF;
        id = Long.reverse(7623316119497250811L);
        ie = Integer.reverse(-1006632960);
        ig = Long.reverse(7623316119497250811L);
        ii = (-2147483644 >>> 93 | -2147483644 << ~93 + 1) & 0xFFFFFFFF;
        ik = Long.reverse(7623316119497250811L);
        im = (606208 >>> 14 | 606208 << -14) & 0xFFFFFFFF;
        io = Long.reverse(2291054160690583547L);
        ip = Long.reverse(0x7600000000000000L);
        iq = 304 >>> 67 | 304 << -67;
        ir = -1 >>> 198 | -1 << -198;
        is = Long.reverse(7623316119497250811L);
        it = (327155712 >>> 55 | 327155712 << ~55 + 1) & 0xFFFFFFFF;
        iv = Long.reverse(2291054160690583547L);
        iw = Long.reverse(0x7600000000000000L);
        ix = (20480 >>> 73 | 20480 << ~73 + 1) & 0xFFFFFFFF;
        iz = Long.reverse(2291054160690583547L);
        jc = Long.reverse(0x7600000000000000L);
        je = (164 >>> 226 | 164 << ~226 + 1) & 0xFFFFFFFF;
        jg = Long.reverse(7623316119497250811L);
        ji = (0x540000 >>> 17 | 0x540000 << ~17 + 1) & 0xFFFFFFFF;
        jj = Long.reverse(2291054160690583547L);
        jk = Long.reverse(0x7600000000000000L);
        jl = (172 >>> 226 | 172 << -226) & 0xFFFFFFFF;
        jo = Integer.reverse(-1);
        jq = Long.reverse(7623316119497250811L);
        jt = 5632 >>> 199 | 5632 << ~199 + 1;
        ju = Long.reverse(2291054160690583547L);
        jv = Long.reverse(0x7600000000000000L);
        ka = Integer.reverse(-1275068416);
        kb = Long.reverse(7623316119497250811L);
        kc = (0x5C00000 >>> 213 | 0x5C00000 << ~213 + 1) & 0xFFFFFFFF;
        kd = Long.reverse(7623316119497250811L);
        ke = (32 >>> 132 | 32 << ~132 + 1) & 0xFFFFFFFF;
        kf = Integer.reverse(0);
        kg = Integer.reverse(Integer.MIN_VALUE);
        kh = (3008 >>> 198 | 3008 << -198) & 0xFFFFFFFF;
        ki = 6016 >>> 135 | 6016 << ~135 + 1;
        var_java_lang_String_arr_e = new String[kh];
        f = new String[ki];
        NLoginCore_526.void_b();
    }

    private static void void_b() {
        int n;
        o = -2312276769397353480L;
        long l = o ^ 0x320E9225FDB8E3FDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), 69, (byte)(17 + 66), (byte)(9 + 38), (byte)(11 + 56), (byte)(5 + 61), (byte)(44 + 23), (byte)(42 + 5), (byte)(22 + 58), 75, (byte)(46 + 21), (byte)(40 + 43), (byte)(8 + 45), (byte)(11 + 69), (byte)(14 + 83), (byte)(33 + 67), (byte)(16 + 84), (byte)(104 + 1), (byte)(37 + 73), (byte)(50 + 53)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_526.f[0] = NLoginCore_427.D("ѰҞѯѭѾѸљѝѻҐѶѴҕҚѽѣҭѦҍҜ҄ҊѷѸ", (byte)37, 68);
                    NLoginCore_526.f[1] = NLoginCore_223.E("ՍԤՏԯՐՑՕ՝ԝԴԣ՟ՀԴեԠ՗ՙխծՍԽԮԾԻԮՏաէՃԵՃ", (byte)37, 69);
                    NLoginCore_526.f[2] = NLoginCore_138.E("ՑՐԪ՜ԮԘՈԗԻԡԼԩ", (byte)37, 69);
                    NLoginCore_526.f[3] = NLoginCore_324.B("İĒÿľľĽĿûĻĖěĞČāęġĚčēŐķŕĜĝ", (byte)37, 66);
                    NLoginCore_526.f[4] = NLoginCore_027.F("ԫԨԓԴՓԳԛԱՁԚՖԩ", (byte)37, 70);
                    NLoginCore_526.f[5] = NLoginCore_324.C("ѲѲҀѴѰѸѽѷџҕғҢ҇҇ѻѢҍҭҡѼ҂ҊѷѸ", (byte)37, 67);
                    NLoginCore_526.f[6] = NLoginCore_110.C("ѕҋѾћғѻҡѷќѦѲѨҥҘ҂҄҆ҝҌ҃҅ҰѷѸ", (byte)37, 67);
                    NLoginCore_526.f[7] = NLoginCore_004.C("ҔғѭҟѱћҋњѾѤѿѬ", (byte)37, 67);
                    NLoginCore_526.f[8] = NLoginCore_027.B("ēĐûĜĻěăęĩĂľđ", (byte)37, 66);
                    NLoginCore_526.f[9] = NLoginCore_201.A("úĀĭýŁĒĲıĠĦĠđ", (byte)37, 65);
                    NLoginCore_526.f[10] = NLoginCore_091.A("ĳļûĵĻĕĜĦĕēłđ", (byte)37, 65);
                    NLoginCore_526.f[11] = NLoginCore_091.E("Ը԰ՋԻԩԴԻաԘՕԼԴԺՓՑդՄ՟խՂՍխԴԵ", (byte)37, 69);
                    NLoginCore_526.f[12] = NLoginCore_446.C("ѵҊҚҗѡҞґҌѽҀ҇Ѭ", (byte)37, 67);
                    NLoginCore_526.f[13] = NLoginCore_092.E("՚ԫԯԴ՝ՋԨՍ՝ԸԚԻՅՔԥԿեՃԴԷԮխԴԵ", (byte)37, 69);
                    NLoginCore_526.f[14] = NLoginCore_223.A("ĿłłĘĺģıľĊĔĺđ", (byte)37, 65);
                    NLoginCore_526.f[15] = NLoginCore_453.D("ҋѭњҙҙҘҚіҖѱѳѵѷҒѾѺҤѹҜ҄ҁ҆Ҫ҂҃ѨҵҎҮңҦҏ", (byte)37, 68);
                    NLoginCore_526.f[16] = NLoginCore_575.F("ԮՎԤԲԬ՛ՊԩԶԾԼ՜ԡՔՕՙթՆՍԤՃԷԴԵ", (byte)37, 70);
                    NLoginCore_526.f[17] = NLoginCore_138.E("ՈԪԗՖՖՕ՗ԓՓԮ԰ԭՆԷԣ՟ԜեՙԟԥկԹ՛ՀՓխըժԩժ՗", (byte)37, 69);
                    NLoginCore_526.f[18] = NLoginCore_091.B("ĹÿįĔĎāĿĄĤġĜđ", (byte)37, 66);
                    NLoginCore_526.f[19] = NLoginCore_387.C("ҋѭњҙҙҘҚіҖѱѵҙѤҔҬҩ҄ѬѹҤ҆ҎҀѪҊҫҭ҇ѵѵҫҔ", (byte)37, 67);
                    NLoginCore_526.f[20] = NLoginCore_138.E("ԥՉՆԜԜ՘ԹԹ՜԰ԺՓզԙԱԠՕԥՕՋ՗խԴԵ", (byte)37, 69);
                    NLoginCore_526.f[21] = NLoginCore_110.D("ҋѭњҙҙҘҚіҖѱѵҠҪҥ҇Ҕ҈ҦѼҬҪҲҤҪѬҌ҃ҕҳҐѸґ", (byte)37, 68);
                    NLoginCore_526.f[22] = NLoginCore_076.F("԰ՎՅԥՈՙԨԘՍԺՍ՘ԠՖՔթԵԨխէՀխԴԵ", (byte)37, 70);
                    NLoginCore_526.f[23] = NLoginCore_324.F("ԥ԰ԺԲԭՏԨՒ՘՛՛ԥԸԧԷԼՈբԞխկ՝ԴԵ", (byte)37, 70);
                    NLoginCore_526.f[24] = NLoginCore_446.D("ҋѭњҙҙҘҚіҖѱѶҨѶҁҥқѿѻҊѿѩѺѷѸ", (byte)37, 68);
                    NLoginCore_526.f[25] = NLoginCore_004.F("ՖԥԹԼԷՙԝԓՙգՀԩ", (byte)37, 70);
                    NLoginCore_526.f[26] = NLoginCore_091.E("ԒԘՅԕՙԪՊՉԸԾԸԩ", (byte)37, 69);
                    NLoginCore_526.f[27] = NLoginCore_027.E("ՋՔԓՍՓԭԴԾԭԫ՚ԩ", (byte)37, 69);
                    NLoginCore_526.f[28] = NLoginCore_110.E("Ը԰ՋԻԩԴԻաԘՕԼԴԺՓՑդՄ՟խՂՍխԴԵ", (byte)37, 69);
                    NLoginCore_526.f[29] = NLoginCore_173.B("ĴĒĜĕĲęĈňľłċŃŉĉŌŎĐħĲĥģňħőİīļĩŚřŚōįšġĳĺŤĠťĨŊňı", (byte)37, 66);
                    NLoginCore_526.f[30] = NLoginCore_559.C("ѬҐҎѸѯѫ҂џў҇ҕѬ", (byte)37, 67);
                    NLoginCore_526.f[31] = NLoginCore_110.B("čıĮĄĄŀġġńĘĢĻŎāęĈĽčĽĳĿŕĜĝ", (byte)37, 66);
                    NLoginCore_526.f[32] = NLoginCore_076.F("ՏԤԬԽ՜ՈԫԳԹՁԟԩ", (byte)37, 70);
                    NLoginCore_526.f[33] = NLoginCore_138.D("ҋѯќјѷѶќғҟ҂ѳѬ", (byte)37, 68);
                    NLoginCore_526.f[34] = NLoginCore_138.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
                    NLoginCore_526.f[35] = NLoginCore_575.E("ՈԬԙԕԴԳԙՐ՜Կ԰ԩ", (byte)37, 69);
                    NLoginCore_526.f[36] = NLoginCore_223.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
                    NLoginCore_526.f[37] = NLoginCore_027.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
                    NLoginCore_526.f[38] = NLoginCore_223.A("įĒýĂĒĺĝēĳĺĺģĞłňōĎđČĪĈįĜĝ", (byte)37, 65);
                    NLoginCore_526.f[39] = NLoginCore_451.C("ѬѼҐҗҎѠ҄ҟѹѷ҇ңҀѩҌѵңҞҋѨҫҬ҂ҡҴңѩ҅ѯѵҗғүҬғҘѷҏӀҺ҅҃ґҀҝҀ҄ҙӄҚқҟҧӐҗҘ", (byte)37, 67);
                    NLoginCore_526.f[40] = NLoginCore_223.C("ѮќѳѲҍѫѡҌңўѦѬ", (byte)37, 67);
                    NLoginCore_526.f[41] = NLoginCore_091.C("ѺҗҏҚҞҚҒѝҟѾҗџ҃ѽѡҀѬҦҚҟѰҟѥ҅ҍѬҨҲҪҮѲҵҘҺѸҮҊҺҕҙҗѼұҵҝӄҦҝҤҮҷҤҽӀҗҘ", (byte)37, 67);
                    NLoginCore_526.f[42] = NLoginCore_201.A("ûĹĸĞāŀĿĜŋĩĠđ", (byte)37, 65);
                    NLoginCore_526.f[43] = NLoginCore_004.F("ՑԤ՗ՖԿԑ՟ԯԠԛԬԩ", (byte)37, 70);
                    NLoginCore_526.f[44] = NLoginCore_004.C("ғҋёҖѯҜ҃ѼѾ҆ҨѺҔѺҦ҄ҟѹҰҢҰҊѷѸ", (byte)37, 67);
                    NLoginCore_526.f[45] = NLoginCore_451.E("ՆԕՖ՚՝՝ԞԴ՜ԡբ՚զԤԞՁԻԼխՌԺ՞Ԧաղ՞Վծզի԰ԲիՈՈՒՑղՈՖւոՍ՟ՅյՃցՁ՘աՍլէՔՕ", (byte)37, 69);
                    NLoginCore_526.f[46] = NLoginCore_004.E("ԨՏԜ՝ԞԵՐՎՖ԰Ԭԩ", (byte)37, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_526.f[0] = NLoginCore_110.C("ѰҞѯѭѾѸљѝѻҐѳўҥҡ҄ѪҮҨҞѯѼҠѷѸ", (byte)37, 67);
                    NLoginCore_526.f[1] = NLoginCore_201.B("ĵČķėĸĹĽŅąĜċŇĨĜōĈĿŁŕŖĵĦœŗĸħŝĵĿŒĜĜĪęĚŚŤĵıĶħŢŌı", (byte)37, 66);
                    NLoginCore_526.f[2] = NLoginCore_110.B("ěĖĎģąĔĖĸĀģħĤōĉĢŃďŃīĶčğĜĝ", (byte)37, 66);
                    NLoginCore_526.f[3] = NLoginCore_201.C("ҋѭњҙҙҘҚіҖѱѵҚґѾҌқѼҌҩ҇ѧѲѱҴңҩҕѷҵ҇ҙҸ", (byte)37, 67);
                    NLoginCore_526.f[4] = NLoginCore_446.D("ґҝҏњҕҏҙѰѶѰҝѬ", (byte)37, 68);
                    NLoginCore_526.f[5] = NLoginCore_027.D("ѲѲҀѴѰѸѽѷџҕҔҕѷҁѝѼҪѩѽѼҧҠѷѸ", (byte)37, 68);
                    NLoginCore_526.f[6] = NLoginCore_384.B("úİģĀĸĠņĜāċėġľŊĻŀņĉĩĵğŅĜĝ", (byte)37, 66);
                    NLoginCore_526.f[7] = NLoginCore_223.B("ĹĖĬďĳģĨāķĝĦěąċĩĽģĩńĤœŕĜĝ", (byte)37, 66);
                    NLoginCore_526.f[8] = NLoginCore_110.B("ĐûļĕħĳĳđēāĔđ", (byte)37, 66);
                    NLoginCore_526.f[9] = NLoginCore_173.D("қҎҊҚҞҗ҂ґҤҚѾҢѤҚѺҝҎҭҊ҄ѨѺѷѸ", (byte)37, 68);
                    NLoginCore_526.f[10] = NLoginCore_446.A("āėĬąĐđĞĺĖĳĆōŊčŁīĢĭĨģĞğĜĝ", (byte)37, 65);
                    NLoginCore_526.f[11] = NLoginCore_446.A("ĠĘĳģđĜģŉĀĽħćĸŀĮŊŌħēłŇğĜĝ", (byte)37, 65);
                    NLoginCore_526.f[12] = NLoginCore_575.B("čěČņĳĹĐęŃęĠđ", (byte)37, 66);
                    NLoginCore_526.f[13] = NLoginCore_223.C("ҝѮѲѷҠҎѫҐҠѻѧѼҗѵѻ҇ѣѬҀҫҜҊѷѸ", (byte)37, 67);
                    NLoginCore_526.f[14] = NLoginCore_384.A("ĽĴĔĿįăĲĕŀěŊđ", (byte)37, 65);
                    NLoginCore_526.f[15] = NLoginCore_384.A("İĒÿľľĽĿûĻĖĘĚĜķģğŉĞŁĩĦĨŅĦĕĲňĽōľŎŋ", (byte)37, 65);
                    NLoginCore_526.f[16] = NLoginCore_091.F("ԮՎԤԲԬ՛ՊԩԶԾԿԞԣԸԚՙՠԫ՟ԬՄ՝ԴԵ", (byte)37, 70);
                    NLoginCore_526.f[17] = NLoginCore_451.B("İĒÿľľĽĿûĻĖĘĕĮğċŇĄōŁćčĔĩđłĹĪŉŐļŋĭ", (byte)37, 66);
                    NLoginCore_526.f[18] = NLoginCore_384.B("ŀŃČėŁĕúĆģāĚłĻļĿıĈĢĵġŏğĜĝ", (byte)37, 66);
                    NLoginCore_526.f[19] = NLoginCore_027.A("İĒÿľľĽĿûĻĖĚľĉĹőŎĩđĞŉīķŇŖŅŋŋňĭėĚś", (byte)37, 65);
                    NLoginCore_526.f[20] = NLoginCore_324.A("čıĮĄĄŀġġńĘĠęĝąŁŎĄŐŃĬďŅĜĝ", (byte)37, 65);
                    NLoginCore_526.f[21] = NLoginCore_453.F("ՈԪԗՖՖՕ՗ԓՓԮԲ՝էբՄՑՅգԹթէԡԢԺԼՋՑԾՁմըը", (byte)37, 70);
                    NLoginCore_526.f[22] = NLoginCore_027.A("ĘĶĭčİŁĐĀĵĢĴĞĎċĿĞŇĪĥĥİŅĜĝ", (byte)37, 65);
                    NLoginCore_526.f[23] = NLoginCore_324.A("čĘĢĚĕķĐĺŀŃŃŎġįįōĮĳĎďĤĮĢņįĭŘĝňŏĨĬ", (byte)37, 65);
                    NLoginCore_526.f[24] = NLoginCore_453.B("İĒÿľľĽĿûĻĖęĸąŀĞĉŏİčďĨŕĜĝ", (byte)37, 66);
                    NLoginCore_526.f[25] = NLoginCore_173.A("ĭĔĐ÷ėĕėĆĿĹĠđ", (byte)37, 65);
                    NLoginCore_526.f[26] = NLoginCore_110.C("ѵҊўѹѪѹҐѽҒҎ҃ѳѡғѨѺҮҫѸѨѮҠѷѸ", (byte)37, 67);
                    NLoginCore_526.f[27] = NLoginCore_223.A("ĕùúĜġĒłğĘĹňĠģĝĚŒĽŇľŎŖįĜĝ", (byte)37, 65);
                    NLoginCore_526.f[28] = NLoginCore_138.B("ĠĘĳģđĜģŉĀĽĤĿĦĦńĐĢĒĦĬľŅĜĝ", (byte)37, 66);
                    NLoginCore_526.f[29] = NLoginCore_223.D("ҏѭѷѰҍѴѣңҙҝѦҞҤѤҧҩѫ҂ҍҀѾң҂Ҭҋ҆җ҄ҵҴҵҨҩҕҺҹӁҼҮүѽӇѾҌ", (byte)37, 68);
                    NLoginCore_526.f[30] = NLoginCore_223.F("ԥԳԫ԰ՉԙՀԚՔաՁՂաԠ՗՗ՉԸ՛ՌՈԷԴԵ", (byte)37, 70);
                    NLoginCore_526.f[31] = NLoginCore_223.F("ԥՉՆԜԜ՘ԹԹ՜԰ԹԝԵ՗դԷՅԣՀՊ՛ՇԴԵ", (byte)37, 70);
                    NLoginCore_526.f[32] = NLoginCore_091.E("ՋՊԒԖԭՌԸՍՎՕՅ՞՘դՈԠԠԵգՊԮԷԴԵ", (byte)37, 69);
                    NLoginCore_526.f[33] = NLoginCore_027.F("ՐԹՆՒԘԻՏԷՊԹՒԩ", (byte)37, 70);
                    NLoginCore_526.f[34] = NLoginCore_575.E("ՎԱՆԱՓ՞ՑԠ՚ԾՀԩ", (byte)37, 69);
                    NLoginCore_526.f[35] = NLoginCore_092.E("ԴՙՓԲ՘ԻԺ԰ՁԶբԩ", (byte)37, 69);
                    NLoginCore_526.f[36] = NLoginCore_092.C("ѻѭѶњҗѝѕҝѺ҄ґѬ", (byte)37, 67);
                    NLoginCore_526.f[37] = NLoginCore_027.A("ĒĺĕĐăĜĩĽŉĄłđ", (byte)37, 65);
                    NLoginCore_526.f[38] = NLoginCore_091.A("įĒýĂĒĺĝēĳĺĻĮŊōįōŎĻĦēĭŕĜĝ", (byte)37, 65);
                    NLoginCore_526.f[39] = NLoginCore_559.A("đġĵļĳąĩńĞĜĬňĥĎıĚňŃİčŐőħņřňĎĪĔĚļĸŔőĸĽĜĴťşĪĨķĺņŪŮűŁĿĿŲŕŀĮĶŒňųŚŦŖœƀ", (byte)37, 65);
                    NLoginCore_526.f[40] = NLoginCore_446.C("ѶҝіѸѶқҁҗғѳҕѬ", (byte)37, 67);
                    NLoginCore_526.f[41] = NLoginCore_027.F("ԷՔՌ՗՛՗ՏԚ՜ԻՔԜՀԺԞԽԩգ՗՜ԭ՜ԢՂՊԩեկէիԯղՕշԵիՇշՒՖՔԹկփցՀ՜բՉեզռկէՔՕ", (byte)37, 70);
                    NLoginCore_526.f[42] = NLoginCore_201.B("ùăĒýĜĨĿĂĨľņėĹĚŏġőĩğēŖŅĜĝ", (byte)37, 66);
                    NLoginCore_526.f[43] = NLoginCore_027.A("ĮăüĞĴħĜăļęĔđ", (byte)37, 65);
                    NLoginCore_526.f[44] = NLoginCore_092.D("ғҋёҖѯҜ҃ѼѾ҆ҥѼ҅җ҈ѤңҙѸңѮѪҩѼҟҪҨ҃ҕҳҍѵ", (byte)37, 68);
                    NLoginCore_526.f[45] = NLoginCore_201.D("҉јҙҝҠҠѡѷҟѤҥҝҩѧѡ҄ѾѿҰҏѽҡѩҤҵҡґұҩҮѳѵҮҋҋҕҔҵҋҙӅһҒҔѿҖҙӀҾӎӄҪӆӐҗҘ", (byte)37, 68);
                    NLoginCore_526.f[46] = NLoginCore_091.A("ûŃēĞĐĸħĺĦĩŊđ", (byte)37, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_526.f[0] = NLoginCore_091.F("ԨԲՕ԰՘ԪՀԾԜՂՁ՞՛ԣԣՇ՚ըԹԷ՚ԷԴԵ", (byte)37, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_526.f[0] = NLoginCore_387.C("ѯѦѬҙҏҁҕѾѮѰҢѶҡҕҋ҈ѻѧ҄ѫ҇ҰѷѸ", (byte)37, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_526.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.E("ԮՐՒԲՖյխփկԾռղրպՃը֊։ցևցՖ", (byte)74, 69), NLoginCore_526.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.F("թնյԸոմկոփղԿսցպսփՅࣗࣉ࣓ࣦ࣑ࣙࣞࣘࣧ՚", (byte)74, 70) + string + NLoginCore_027.C("Ӎ", (byte)74, 67) + methodType.toString(), exception);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void c(NLoginCore_219 var1_1) {
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
}

