/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_131;
import com.nickuc.login.NLoginCore_503;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NloginunregisterCommand;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_024;
import com.nickuc.login.NLoginCore_296;
import com.nickuc.login.NLoginCore_441;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NloginchangepassCommand;
import com.nickuc.login.NLoginCore_485;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_401;
import com.nickuc.login.NLoginCore_274;
import com.nickuc.login.NloginchangeuuidCommand;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_396;
import com.nickuc.login.NloginregisterCommand;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_005;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NlogindeleteCommand;
import com.nickuc.login.NLoginCore_376;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_022;
import com.nickuc.login.NLoginCore_207;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_067;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_431;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_505;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NloginunbanCommand;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_527;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_043
extends NLoginType_032 {
    private static long bd;
    private static int dw;
    private static long dd;
    private static int dp;
    private static long fv;
    private static int dk;
    private static int bu;
    private static int gh;
    private static long er;
    private static long dr;
    private static long dm;
    private static long fs;
    private static int fj;
    private static long da;
    private static int ff;
    private static int ge;
    private static int gg;
    private static long ax;
    private static int fc;
    private static long bw;
    private static int ci;
    private static int bc;
    private static int gd;
    private static long e;
    private static int bv;
    private static int eo;
    private static int dq;
    private static int gr;
    private static int fw;
    private static long cq;
    private static long cz;
    private static int em;
    private static int fu;
    private static long fp;
    private static int ek;
    private static int fz;
    private static int bm;
    private static int dc;
    private static int gq;
    private static long fd;
    private static int cl;
    private static int bp;
    private static long dx;
    private static int cn;
    private static int dg;
    private static long du;
    private static long cu;
    private static int gy;
    private static long ef;
    private static int ga;
    private static int fk;
    private static long ev;
    private static long b;
    private static int eg;
    private static long bl;
    private static int de;
    private static int gc;
    private static int by;
    private static long cb;
    private static long ec;
    private static int gx;
    private static int gu;
    private static int he;
    private static long ct;
    private static int bj;
    private static int ed;
    private static int fr;
    private static long ew;
    private static int cj;
    private static int di;
    private static int bh;
    private static int ce;
    private static long cx;
    private static long fl;
    private static long bo;
    private static int cv;
    private static int eq;
    private static int go;
    private static int eh;
    private static int cc;
    private static int ay;
    private static int cp;
    private static long cf;
    private static int cy;
    private static int bq;
    private static long bx;
    private static int br;
    private static long dn;
    private static long dt;
    private static long bs;
    private static int fx;
    private static int cd;
    private List<NLoginCore_353> var_java_util_List_com_nickuc_login_NLoginCore_353__a = Collections.emptyList();
    private static int eu;
    private static int ds;
    private static int ep;
    private static int gn;
    private static int bb;
    private static String[] c;
    private static long hc;
    private static int dy;
    private static long bg;
    private static long hb;
    private static int ex;
    private static int ft;
    private static int ey;
    private static long es;
    private static int cfr_renamed_1;
    private static long ea;
    private static int bz;
    private static long bn;
    private static long ez;
    private static int fe;
    private static long ej;
    private static int var_int_a;
    private static int fa;
    private static int gl;
    private static int gk;
    private static long cw;
    private static int df;
    private static int be;
    private static int gj;
    private static long dz;
    private static long dh;
    private static int fy;
    private static int ha;
    private static long fm;
    private static int gi;
    private static long dj;
    private static int fb;
    private static int et;
    private static int gw;
    private static int db;
    private static int fn;
    private static long var_long_d;
    private static long en;
    private static int gb;
    private static int cs;
    private static int fq;
    private static int gf;
    private static int fo;
    private static long ck;
    private static long bk;
    private static long bt;
    private static long fh;
    private static int gz;
    private static int fi;
    private static int el;
    private static long ba;
    private static int gt;
    private static long ei;
    private static int az;
    private static int gs;
    private static int dv;
    private static int cg;
    private static int gp;
    private static int ch;
    private static int cr;
    private static int eb;
    private static int av;
    private static long bf;
    private static long bi;
    private static String[] var_java_lang_String_arr_d;
    private static int dl;
    private static int hf;
    private static long ee;
    private static int gm;
    private static long aw;
    private static int hd;
    private static long fg;
    private static int gv;
    private static long cm;
    private static int co;
    private static long ca;

    @Override
    public List<String> b(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (stringArray.length <= fj) {
            Object object;
            ArrayList<String> arrayList = new ArrayList<String>();
            Object object2 = object = stringArray.length == 0 ? NLoginCore_043.c("㺀", (int)fk, (long)(fl ^ fm)) : stringArray[stringArray.length - fn];
            if (!((String)object).isEmpty()) {
                for (NLoginCore_353 NLoginCore_3532 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
                    String string2 = NLoginCore_3532.e();
                    if (!string2.startsWith(((String)object).toLowerCase(Locale.ENGLISH)) || NLoginCore_3532.f() != null && !NLoginInterface_0422.i((String)NLoginCore_043.c("㺃", (int)fo, (long)fp)) && !NLoginInterface_0422.i(NLoginCore_3532.f())) continue;
                    arrayList.add(string2);
                }
            } else {
                for (NLoginCore_353 NLoginCore_3533 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
                    String string3 = NLoginCore_3533.f();
                    if (string3 != null && !NLoginInterface_0422.i((String)NLoginCore_043.c("㺆", (int)(fq & fr), (long)fs)) && !NLoginInterface_0422.i(string3)) continue;
                    arrayList.add(NLoginCore_3533.e());
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        }
        String string4 = stringArray[ft].toLowerCase(Locale.ENGLISH);
        NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_187_a();
        for (NLoginCore_353 NLoginCore_3534 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
            if (!string4.equals(NLoginCore_3534.e()) && !NLoginCore_3534.b().contains(string4)) continue;
            if (!(NLoginCore_3534 instanceof NLoginCore_207) && !(NLoginCore_3534 instanceof NLoginCore_131) && NLoginInterface_0422 instanceof NLoginCore_277 && !NLoginCore_1872.boolean_b((NLoginCore_277)NLoginInterface_0422)) {
                return null;
            }
            String string5 = NLoginCore_3534.f();
            if (string5 != null && !NLoginInterface_0422.i((String)NLoginCore_043.c("㺉", (int)fu, (long)fv)) && !NLoginInterface_0422.i(string5)) {
                return null;
            }
            return NLoginCore_3534.c(NLoginInterface_0422, string4, Arrays.copyOfRange(stringArray, fw, stringArray.length));
        }
        return null;
    }

    private void a(NLoginCore_494 NLoginInterface_0422) {
        if (!NLoginInterface_0422.i((String)NLoginCore_043.c("㺀", (int)var_int_a, (long)(b ^ var_long_d))) && !NLoginInterface_0422.i((String)NLoginCore_043.c("㺃", (int)av, (long)(aw ^ ax)))) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.y, new Object[ay]);
            if (NLoginInterface_0422 instanceof NLoginCore_277) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            }
            return;
        }
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺆", (int)az, (long)ba), new Object[bb]);
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺉", (int)bc, (long)bd) + ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).q() + (String)NLoginCore_043.c("㺌", (int)be, (long)(bf ^ bg)) + ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).s() + (String)NLoginCore_043.c("㺏", (int)bh, (long)bi) + ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_227_a().G() + (String)(((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_422_a().ai() ? NLoginCore_043.c("㺒", (int)bj, (long)(bk ^ bl)) : NLoginCore_043.c("㺕", (int)bm, (long)(bn ^ bo))), new Object[bp]);
        if (((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_227_a().n() == bq) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺘", (int)br, (long)(bs ^ bt)), new Object[bu]);
        }
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺛", (int)bv, (long)(bw ^ bx)), new Object[by]);
        if (this.var_java_util_List_com_nickuc_login_NLoginCore_353__a.isEmpty()) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺞", (int)bz, (long)(ca ^ cb)), new Object[cc]);
            return;
        }
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
            NLoginCore_509 NLoginCore_5092 = ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
            boolean bl = ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).j();
            for (NLoginCore_353 NLoginCore_3532 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
                String string;
                String string2;
                if (NLoginCore_3532.o() || (string2 = NLoginCore_3532.f()) != null && !NLoginCore_277.i(string2)) continue;
                List<String> list = NLoginCore_3532.b();
                if (bl) {
                    Object[] objectArray = new Object[cg];
                    objectArray[NLoginCore_043.ch] = NLoginCore_3532.n() && NLoginCore_532.F.ar() ? NLoginCore_043.c("㺤", (int)(ci & cj), (long)ck) : NLoginCore_043.c("㺧", (int)cl, (long)cm);
                    objectArray[NLoginCore_043.cn] = string2 == null ? NLoginCore_043.c("㺪", (int)(co & cp), (long)cq) : string2;
                    objectArray[NLoginCore_043.cr] = !list.isEmpty() ? (String)NLoginCore_043.c("㺭", (int)cs, (long)(ct ^ cu)) + String.join((CharSequence)NLoginCore_043.c("㺰", (int)cv, (long)(cw ^ cx)), list) : NLoginCore_043.c("㺳", (int)cy, (long)(cz ^ da));
                    string = String.format((String)NLoginCore_043.c("㺡", (int)(cd & ce), (long)cf), objectArray);
                } else {
                    Object[] objectArray = new Object[de];
                    objectArray[NLoginCore_043.df] = NLoginCore_3532.n() && NLoginCore_532.F.ar() ? NLoginCore_043.c("㺹", (int)dg, (long)dh) : NLoginCore_043.c("㺼", (int)di, (long)dj);
                    objectArray[NLoginCore_043.dk] = string2 == null ? NLoginCore_043.c("㺿", (int)dl, (long)(dm ^ dn)) : string2;
                    objectArray[NLoginCore_043.cfr_renamed_1] = !list.isEmpty() ? (String)NLoginCore_043.c("㻂", (int)(dp & dq), (long)dr) + String.join((CharSequence)NLoginCore_043.c("㻅", (int)ds, (long)(dt ^ du)), list) : NLoginCore_043.c("㻈", (int)(dv & dw), (long)dx);
                    string = String.format((String)NLoginCore_043.c("㺶", (int)(db & dc), (long)dd), objectArray);
                }
                String string3 = NLoginCore_3532.e();
                NLoginInterface_0242.a((String)NLoginCore_043.c("㻋", (int)dy, (long)(dz ^ ea)) + string3, string, (String)NLoginCore_043.c("㻎", (int)eb, (long)ec) + string3);
            }
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.C);
        } else {
            for (NLoginCore_353 NLoginCore_3533 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
                if (NLoginCore_3533.o()) continue;
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㻑", (int)ed, (long)(ee ^ ef)) + NLoginCore_3533.e(), new Object[eg]);
            }
        }
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㻔", (int)eh, (long)(ei ^ ej)), new Object[ek]);
    }

    static {
        var_int_a = Integer.reverse(0);
        b = Long.reverse(-4710750870359118573L);
        var_long_d = Long.reverse(0xA00000000000000L);
        av = 2 >>> 97 | 2 << ~97 + 1;
        aw = Long.reverse(-4710750870359118573L);
        ax = Long.reverse(0xA00000000000000L);
        ay = Integer.reverse(0);
        az = (64 >>> 101 | 64 << -101) & 0xFFFFFFFF;
        ba = Long.reverse(-5431326810738397933L);
        bb = 0 >>> 100 | 0 << ~100 + 1;
        bc = (-1073741824 >>> 254 | -1073741824 << ~254 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(-5431326810738397933L);
        be = (262144 >>> 240 | 262144 << -240) & 0xFFFFFFFF;
        bf = Long.reverse(-4710750870359118573L);
        bg = Long.reverse(0xA00000000000000L);
        bh = 0x5000000 >>> 56 | 0x5000000 << ~56 + 1;
        bi = Long.reverse(-5431326810738397933L);
        bj = 0x180000 >>> 50 | 0x180000 << ~50 + 1;
        bk = Long.reverse(-4710750870359118573L);
        bl = Long.reverse(0xA00000000000000L);
        bm = -1073741823 >>> 62 | -1073741823 << ~62 + 1;
        bn = Long.reverse(-4710750870359118573L);
        bo = Long.reverse(0xA00000000000000L);
        bp = (0 >>> 214 | 0 << -214) & 0xFFFFFFFF;
        bq = Integer.reverse(-1879048192);
        br = (0x10000000 >>> 217 | 0x10000000 << -217) & 0xFFFFFFFF;
        bs = Long.reverse(-4710750870359118573L);
        bt = Long.reverse(0xA00000000000000L);
        bu = 0 >>> 171 | 0 << -171;
        bv = 0x120000 >>> 145 | 0x120000 << ~145 + 1;
        bw = Long.reverse(-4710750870359118573L);
        bx = Long.reverse(0xA00000000000000L);
        by = Integer.reverse(0);
        bz = (0x1400000 >>> 181 | 0x1400000 << ~181 + 1) & 0xFFFFFFFF;
        ca = Long.reverse(-4710750870359118573L);
        cb = Long.reverse(0xA00000000000000L);
        cc = (0 >>> 152 | 0 << ~152 + 1) & 0xFFFFFFFF;
        cd = Integer.reverse(-805306368);
        ce = (-1 >>> 124 | -1 << ~124 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(-5431326810738397933L);
        cg = Integer.reverse(-1073741824);
        ch = 0 >>> 149 | 0 << -149;
        ci = (1536 >>> 103 | 1536 << -103) & 0xFFFFFFFF;
        cj = Integer.reverse(-1);
        ck = Long.reverse(-5431326810738397933L);
        cl = Integer.reverse(-1342177280);
        cm = Long.reverse(-5431326810738397933L);
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = 0x3800000 >>> 54 | 0x3800000 << ~54 + 1;
        cp = -1 >>> 239 | -1 << ~239 + 1;
        cq = Long.reverse(-5431326810738397933L);
        cr = 4096 >>> 11 | 4096 << ~11 + 1;
        cs = (-536870911 >>> 29 | -536870911 << -29) & 0xFFFFFFFF;
        ct = Long.reverse(-4710750870359118573L);
        cu = Long.reverse(0xA00000000000000L);
        cv = 4 >>> 222 | 4 << ~222 + 1;
        cw = Long.reverse(-4710750870359118573L);
        cx = Long.reverse(0xA00000000000000L);
        cy = Integer.reverse(-2013265920);
        cz = Long.reverse(-4710750870359118573L);
        da = Long.reverse(0xA00000000000000L);
        db = Integer.reverse(0x48000000);
        dc = -1 >>> 183 | -1 << -183;
        dd = Long.reverse(-5431326810738397933L);
        de = Integer.reverse(-1073741824);
        df = Integer.reverse(0);
        dg = Integer.reverse(-939524096);
        dh = Long.reverse(-5431326810738397933L);
        di = Integer.reverse(0x28000000);
        dj = Long.reverse(-5431326810738397933L);
        dk = Integer.reverse(Integer.MIN_VALUE);
        dl = Integer.reverse(-1476395008);
        dm = Long.reverse(-4710750870359118573L);
        dn = Long.reverse(0xA00000000000000L);
        cfr_renamed_1 = Integer.reverse(0x40000000);
        dp = (11 >>> 255 | 11 << -255) & 0xFFFFFFFF;
        dq = Integer.reverse(-1);
        dr = Long.reverse(-5431326810738397933L);
        ds = Integer.reverse(-402653184);
        dt = Long.reverse(-4710750870359118573L);
        du = Long.reverse(0xA00000000000000L);
        dv = Integer.reverse(0x18000000);
        dw = Integer.reverse(-1);
        dx = Long.reverse(-5431326810738397933L);
        dy = -2147483636 >>> 31 | -2147483636 << ~31 + 1;
        dz = Long.reverse(-4710750870359118573L);
        ea = Long.reverse(0xA00000000000000L);
        eb = 13312 >>> 41 | 13312 << -41;
        ec = Long.reverse(-5431326810738397933L);
        ed = Integer.reverse(-671088640);
        ee = Long.reverse(-4710750870359118573L);
        ef = Long.reverse(0xA00000000000000L);
        eg = Integer.reverse(0);
        eh = Integer.reverse(0x38000000);
        ei = Long.reverse(-4710750870359118573L);
        ej = Long.reverse(0xA00000000000000L);
        ek = Integer.reverse(0);
        el = 0x40000007 >>> 222 | 0x40000007 << ~222 + 1;
        em = -1 >>> 128 | -1 << ~128 + 1;
        en = Long.reverse(-5431326810738397933L);
        eo = (0 >>> 10 | 0 << -10) & 0xFFFFFFFF;
        ep = Integer.reverse(0);
        eq = Integer.reverse(0x78000000);
        er = Long.reverse(-4710750870359118573L);
        es = Long.reverse(0xA00000000000000L);
        et = (0 >>> 55 | 0 << -55) & 0xFFFFFFFF;
        eu = Integer.reverse(-134217728);
        ev = Long.reverse(-4710750870359118573L);
        ew = Long.reverse(0xA00000000000000L);
        ex = (0 >>> 151 | 0 << ~151 + 1) & 0xFFFFFFFF;
        ey = Integer.reverse(0x4000000);
        ez = Long.reverse(-5431326810738397933L);
        fa = (0 >>> 207 | 0 << ~207 + 1) & 0xFFFFFFFF;
        fb = -2147483632 >>> 223 | -2147483632 << -223;
        fc = (-1 >>> 192 | -1 << ~192 + 1) & 0xFFFFFFFF;
        fd = Long.reverse(-5431326810738397933L);
        fe = 0 >>> 172 | 0 << ~172 + 1;
        ff = (278528 >>> 13 | 278528 << -13) & 0xFFFFFFFF;
        fg = Long.reverse(-4710750870359118573L);
        fh = Long.reverse(0xA00000000000000L);
        fi = Integer.reverse(0);
        fj = Integer.reverse(Integer.MIN_VALUE);
        fk = 4480 >>> 103 | 4480 << -103;
        fl = Long.reverse(-4710750870359118573L);
        fm = Long.reverse(0xA00000000000000L);
        fn = Integer.reverse(Integer.MIN_VALUE);
        fo = Integer.reverse(0x24000000);
        fp = Long.reverse(-5431326810738397933L);
        fq = 0x250000 >>> 16 | 0x250000 << -16;
        fr = Integer.reverse(-1);
        fs = Long.reverse(-5431326810738397933L);
        ft = 0 >>> 15 | 0 << -15;
        fu = Integer.reverse(0x64000000);
        fv = Long.reverse(-5431326810738397933L);
        fw = 0x40000000 >>> 254 | 0x40000000 << ~254 + 1;
        fx = Integer.reverse(-402653184);
        fy = (0 >>> 219 | 0 << ~219 + 1) & 0xFFFFFFFF;
        fz = (0x200000 >>> 117 | 0x200000 << -117) & 0xFFFFFFFF;
        ga = Integer.reverse(0x40000000);
        gb = (-1073741824 >>> 222 | -1073741824 << -222) & 0xFFFFFFFF;
        gc = (4 >>> 192 | 4 << -192) & 0xFFFFFFFF;
        gd = (160 >>> 197 | 160 << ~197 + 1) & 0xFFFFFFFF;
        ge = Integer.reverse(0x60000000);
        gf = Integer.reverse(-536870912);
        gg = (32768 >>> 140 | 32768 << ~140 + 1) & 0xFFFFFFFF;
        gh = (589824 >>> 144 | 589824 << ~144 + 1) & 0xFFFFFFFF;
        gi = 40 >>> 162 | 40 << -162;
        gj = 0xB000000 >>> 248 | 0xB000000 << -248;
        gk = Integer.reverse(0x30000000);
        gl = Integer.reverse(-1342177280);
        gm = 0x1C00000 >>> 181 | 0x1C00000 << ~181 + 1;
        gn = 122880 >>> 109 | 122880 << ~109 + 1;
        go = Integer.reverse(0x8000000);
        gp = Integer.reverse(-2013265920);
        gq = 0x40000002 >>> 29 | 0x40000002 << -29;
        gr = -1073741820 >>> 190 | -1073741820 << -190;
        gs = Integer.reverse(0x28000000);
        gt = 0xA800000 >>> 87 | 0xA800000 << ~87 + 1;
        gu = 11264 >>> 201 | 11264 << ~201 + 1;
        gv = Integer.reverse(0);
        gw = Integer.reverse(Integer.MIN_VALUE);
        gx = 0 >>> 73 | 0 << -73;
        gy = 65536 >>> 176 | 65536 << ~176 + 1;
        gz = Integer.reverse(0);
        ha = (-536870908 >>> 189 | -536870908 << ~189 + 1) & 0xFFFFFFFF;
        hb = Long.reverse(-4710750870359118573L);
        hc = Long.reverse(0xA00000000000000L);
        hd = Integer.reverse(0);
        he = Integer.reverse(0x14000000);
        hf = Integer.reverse(0x14000000);
        c = new String[he];
        var_java_lang_String_arr_d = new String[hf];
        NLoginCore_043.b();
    }

    @Override
    public void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (stringArray.length == 0) {
            this.a(NLoginInterface_0422);
            return;
        }
        if (this.var_java_util_List_com_nickuc_login_NLoginCore_353__a.isEmpty()) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺀", (int)(el & em), (long)en), new Object[eo]);
            return;
        }
        NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)((Object)this.var_java_util_List_com_nickuc_login_NLoginCore_353__a)).com_nickuc_login_NLoginCore_187_a();
        boolean bl = NLoginInterface_0422 instanceof NLoginCore_277;
        String string2 = stringArray[ep].toLowerCase(Locale.ENGLISH);
        for (NLoginCore_353 NLoginCore_3532 : this.var_java_util_List_com_nickuc_login_NLoginCore_353__a) {
            if (!string2.equalsIgnoreCase(NLoginCore_3532.e()) && !NLoginCore_3532.b().contains(string2)) continue;
            if (!(NLoginCore_3532 instanceof NLoginCore_207) && !(NLoginCore_3532 instanceof NLoginCore_131) && bl && !NLoginCore_1872.boolean_b((NLoginCore_277)NLoginInterface_0422)) {
                return;
            }
            String string3 = NLoginCore_3532.f();
            if (string3 != null && !NLoginInterface_0422.i((String)NLoginCore_043.c("㺃", (int)eq, (long)(er ^ es))) && !NLoginInterface_0422.i(string3)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.y, new Object[et]);
                if (NLoginInterface_0422 instanceof NLoginCore_277) {
                    NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                }
                return;
            }
            if (bl && NLoginCore_3532.n() && NLoginCore_532.F.ar()) {
                if (NLoginCore_1872.com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginInterface_0422).j()) {
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺆", (int)eu, (long)(ev ^ ew)), new Object[ex]);
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺉", (int)ey, (long)ez), new Object[fa]);
                } else {
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺌", (int)(fb & fc), (long)fd), new Object[fe]);
                    NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_043.c("㺏", (int)ff, (long)(fg ^ fh)), new Object[fi]);
                }
                return;
            }
            NLoginCore_3532.a(NLoginInterface_0422, stringArray);
            return;
        }
        if (!bl || NLoginCore_1872.boolean_b((NLoginCore_277)NLoginInterface_0422)) {
            this.a(NLoginInterface_0422);
        }
    }

    private static void b() {
        int n;
        e = -3983566622199642755L;
        long l = e ^ 0xD13632C2FEFE6874L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(40 + 29), (byte)(74 + 9), (byte)(40 + 7), (byte)(56 + 11), (byte)(30 + 36), 67, (byte)(3 + 44), 80, (byte)(8 + 67), (byte)(33 + 34), (byte)(81 + 2), (byte)(26 + 27), (byte)(14 + 66), (byte)(64 + 33), (byte)(46 + 54), (byte)(79 + 21), (byte)(12 + 93), (byte)(74 + 36), (byte)(77 + 26)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
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
                    NLoginCore_043.var_java_lang_String_arr_d[0] = NLoginCore_559.E("֣բշպճ֧՟֪֥ծ֢֍հվ֨֫֐ְֳֳֶַ֚֮֘֩շսւׁօք", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[1] = NLoginCore_324.A("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[2] = NLoginCore_173.B("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[3] = NLoginCore_091.E("ևփն֪֚ըպս֢֡֩կ֔փ֧֐օְ֢ո֙֔ցւ", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[4] = NLoginCore_453.C("ՖճսշՑՒՒիթչզՓ", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[5] = NLoginCore_446.B("ƩƻǋǝƜƭƶǖơǔǆƫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[6] = NLoginCore_223.F("ե՟֪֋շ֣ջ֞֍֘է֤ղց֑֦ցֵ֦֍֬֋ֺ֚ևջ׀֎ֻֿ֡֡", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[7] = NLoginCore_223.B("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[8] = NLoginCore_223.F("փբը֢֙վօ֌֝։և֒ծֲֵַַ֦֥֣֪֮֮֠֫տ֍֘յ֎֛֭", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[9] = NLoginCore_559.F("ց։փմճ֚չջփ֞ցն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[10] = NLoginCore_004.F("֖֕զ֩՝գ֦֟և֣֨֩֩֫֕֬ֈյ֬֍ַ֌֒ոׁ֖֡֓֙׀֕րւ׃րֵּ֣֭֭֮֗֨֋׈ֱֳ֧֣֤֡֐׊ך֢֡", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[11] = NLoginCore_223.D("ՑԼտՐմփաուՌշվխֈՍ֓֏Ջ֏ց֙֔֊֎ճլխ՛֎֙հռ֔֔ջղ֦թՠ֓։֎֮ռցְ֣֢֡ցւ֋օչչ֐ֱַֹ֛֮֯֕ս", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[12] = NLoginCore_091.E("ձայ֙ի֢֬շ։֋ցն", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[13] = NLoginCore_004.A("ǖǗǎƞǈǋƢƾƣƻƺƫ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[14] = NLoginCore_223.D("քԿկզձ՜ֆէց՛թո֌Ցլ՟՜֒֐ըենՐգլջխ՜յլլմր֎֧՟֦ֆ֘փմն֍փ֧ձռ֛լծֳָּ֥֭֔֫֔֨֌֪֋ֳ־", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[15] = NLoginCore_223.A("ƜǊƦǍƒƼǂǡǒǙƟǚǗƱǙǦǂǇƾǅǞƱǯǂƮǠƮưǀǱǎǄ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[16] = NLoginCore_384.F("֗ա՛֚֔բռոըւ֧ն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[17] = NLoginCore_324.A("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[18] = NLoginCore_575.A("ƸƙƗƗƺƽƜƽǅƺǒǖǂƢǘƦƫǉƽǦǢǝǣǭǁǌƶǡǋǺǘǺǗƯǆǓǎǁǔǤǻƷǥǵǹǱǠȃȍǄǝǦǿȋȂǤǧȀȅǶǤǧȅǒ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[19] = NLoginCore_223.B("ƦƖƪǎƠǡǗƬƾǀƶƫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[20] = NLoginCore_173.E("֢֡֙թ֖֓խ։ծֆօն", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[21] = NLoginCore_091.B("ǆǗƩƬǁƓǡƟƟƭǢǢƻƺǃƣǙǢǭǍƾǜƾǦǃǃƶǬǊǨǓǼǵǨǨǵǲǋǔƹȄǿǤǁȆǙǸǷǂǛǋǭǟǤǯǧǰȂǷǩȌǒȋǕ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[22] = NLoginCore_559.C("ՎծտձցՔՁքբպց֐֎֑իգՒՇՖթ֙ք։֖֙Օո֑ձրկծ", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[23] = NLoginCore_091.A("ǌƖƐǏǉƗƱƭƝƷǜƫ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[24] = NLoginCore_091.D("՞զՠՑՐշՖ՘ՠջ՞Փ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[25] = NLoginCore_451.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ՗ձժզպն֟֊ս֏մք", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[26] = NLoginCore_091.D("շ՞վվՖթփփօածՓ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[27] = NLoginCore_384.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ՗ձժզպն֟֊ս֏մք", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[28] = NLoginCore_223.E("ց։փմճ֚չջփ֞ցն", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[29] = NLoginCore_387.D("ճղՃֆԺՀփռդօֆֆֈրղ։եՒ։ժ֔թկՕճ֞վհն֝ղ՝՟֠՝մ֒օ֊֊֋ր֙ը֥֎վ֐քրցխַ֧վտ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[30] = NLoginCore_223.A("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[31] = NLoginCore_004.F("ՠֈ֕ց֚֌յխ֌քֆ֦ժօֱֲ֢֫֫ֈֲչֳռֵ֕֎ֲָֽ֓վ֝տջ־׋ָ׉׋օ׆׍ֻ֛֧֓֏ׅ֐יֲֳ֖֚֗היִֺ֯֙־ס֤֥שֵֽ֢ףז֬׊ׂװֿ׳׶ֲִעׯײׅ׼י׫ם׋׍ִ׵וז׳", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[32] = NLoginCore_223.B("ƕƬƺǓǠƝƠƿǡǜƴƿƧǃƻǬƾƭǜǎǣǒǍǉƮǌǍǷƱƵƱƳƻǎǮǌǽƸǴƽǬƻȀǤǒȊǿǗǺǛǻǡǹȌȑȂǬȋǐǗǔǮȑǯǭǗǨȕǬȀǷȕǞǰǿȐǶǨȅǽǴșȥȪȡǨǯǭȥȳȣȪȄȘǲȰ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[33] = NLoginCore_091.A("ƦǆƬǌƩƲƪǠǢƺƵƴǓǠƢƳǦǖǗƺǘǉǌǄƱǳǧǃƷƹǕǨƷǭǬǐǳǋǗǒǐǞǹǦȉǸȋƽȆȇȊȐȑǞǌǥǪȕǮȈǷȓǳǒǒǩȍȍǵǛǺǾǣǭǱȒȑȔȔǪǻȋǤȏȮǹǶǷ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[34] = NLoginCore_451.B("ƪƼǉƼƝǘǑǤǥǝǅǨǁǦơǧǉƽƪƸƨƿǨǥƲǩǕǭǫǕǙǎǚǕǴǮǭǎǜǂǓǥǆǥȄǣǈǛȍȆǶȉǏǯǾǡȁȔȉȊȓȕȏȅǼȉǞǕǖȜȔǾȠȀǝǫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[35] = NLoginCore_384.F("ց։փմճ֚չջփ֞ցն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[36] = NLoginCore_027.D("ՎՃՁՃւբճը՗դՎս՘֊Ռկ՝ևէ֑ոա՞՟", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[37] = NLoginCore_201.C("ՎՃՁՃւբճը՗դՎս՘֊Ռկ՝ևէ֑ոա՞՟", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[38] = NLoginCore_173.B("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[39] = NLoginCore_453.F("հ֒եփվ֦֚֚֝֘ըփ֊֋տ֭֩յ֢֌֥֮յֹֻ֝֘չ֛վ֝֎րֈֵֻֽֈֿׁ֚֩֌֖", (byte)114, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_043.var_java_lang_String_arr_d[0] = NLoginCore_138.D("րԿՔ՗ՐքԼևւՋտժՍ՛օֈխ֐֓֐֔֋մշ֌Քզ՜֑ի֛պ֠֎֞ց֜ցսբֈ֚֠ճ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[1] = NLoginCore_201.E("ձզդզ֥օ֖֋պևգֆ֋ְ֪յָֺ֢֬֔֯ցւ", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[2] = NLoginCore_091.F("հշ֜֓սմշոշ֝չն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[3] = NLoginCore_387.C("դՠՓշևՅ՗՚տվևօ՘Ց֒՝՟֓դֆճմշֆքծ՘֎֓պ֙֜", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[4] = NLoginCore_387.F("ջյ֠ք֖և֕֙տր֟ն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[5] = NLoginCore_387.A("ǅƚƵƘƸƚǡǢƝǅƝƫ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[6] = NLoginCore_091.D("ՂԼևըՔր՘ջժյՄցՏ՞ծփ՞֒փժ։ըո֎֛նզսՖլ֌֠", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[7] = NLoginCore_091.F("՝֓չ֤է֪վսկ֘ցն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[8] = NLoginCore_451.A("ƸƗƝǗǎƳƺǁǒƾƼǇƣǕǛǧǚǬǣǣǘǡǡǏǯǩǕǪǐǡǦƸǗǚǾǴƲȁǽǙƿƷǼǋ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[9] = NLoginCore_004.C("ՐԷռ՚ևՕնՆտՙքՓ", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[10] = NLoginCore_324.F("֖֕զ֩՝գ֦֟և֣֨֩֩֫֕֬ֈյ֬֍ַ֌֒ոׁ֖֡֓֙׀֕րւ׃րֵּ֣֭֭֮֗֨։։ׇ֡֡׍ִ׆֣֤֢֔֡", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[11] = NLoginCore_427.B("ƩƔǗƨǌǛƹǐǚƤǏǖǅǠƥǫǧƣǧǙǱǬǢǦǋǄǅƳǦǱǈǔǬǬǓǊǾǁƸǫǡǦȆǔǙǹǻȈǺǙǚǣǝǉǤȓȐǾǫȈȃȂǬǒ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[12] = NLoginCore_324.D("ց՛ՃռվբՠԽ՛֎ը֏ՠչՈ։իՇեՔֆա՞՟", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[13] = NLoginCore_076.F("ռսֆք֌֊յ֬֙ծջ֊ևսձ֨հ֏ց֘փֺցւ", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[14] = NLoginCore_453.E("֧բ֒։֔տ֩֊֤վ֌֛֯մ֏ւտֳֵ֋ֈ֙ճֆ֏֞֐տ֘֏֏ֱ֣֗׊ւ׉ְֻ֦֦֩֗֙׊֔֟־֏֑זאַ׋֮אל֮֮ךֵ֬צ֣", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[15] = NLoginCore_223.A("ƜǊƦǍƒƼǂǡǒǙƟǚǗƱǙǦǂǇƾǅǞƨƬǱǎǢƯǓǤƴƬǚ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[16] = NLoginCore_027.F("վ֚֩ոէռ֊֭֏֯֯ն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[17] = NLoginCore_324.F("֒֩ճ֧զ֌թ֏շ֨ցն", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[18] = NLoginCore_091.B("ƸƙƗƗƺƽƜƽǅƺǒǖǂƢǘƦƫǉƽǦǢǝǣǭǁǌƶǡǋǺǘǺǗƯǆǓǎǁǔǤǻƷǥǵǹǱǠȃȍǄǝǦǿȁǏȉȊǋǡǍǳȖȐȜǨǺǸȚǨȘțǭȝǷǥǫ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[19] = NLoginCore_223.A("ƔƾƨƝǘǙƲǀǂǆƘƯǞơǛƼǜƹǣƯǘƹƶƷ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[20] = NLoginCore_575.C("Խկ՜՛ֈզժռախփՊբ֏ռհհՌժՔ՗և՞՟", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[21] = NLoginCore_138.C("ծտՑՔթԻ։ՇՇՕ֊֊գբիՋց֊֕յզքզ֎իի՞֔ղ֐ջ֤֝֐֐֚֝ճռա֧֬֌թ֮ց֠֟ժփճ֕ևցօ֦պև֩֎ֳ֝֌ջ", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[22] = NLoginCore_027.F("ձ֑֢֤֔շդ֧օֱֳִ֤֝֎ֆյժչ֌ּּ֙մ־ֹֹֻֿ֢֬֙", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[23] = NLoginCore_027.D("նճպ՝ատ՚Ֆ՚չծՓ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[24] = NLoginCore_173.D("ՍֆֆՂփ՘ՒշքիֈՓ", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[25] = NLoginCore_559.F("օ֣֊ճ֩ռ֊֝֏բփ֒ե֟խ֕֋ֲո֍պ֧կֲֵָָ֯֗֯֕֜", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[26] = NLoginCore_027.D("քֆղՑՓ՚ԼՄա՚սՊ՜Պց֒֌Վնէծձ՞՟", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[27] = NLoginCore_173.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ՗ղշօի֐֌ժն֡֙՞", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[28] = NLoginCore_575.A("ƶƼǑƾǝǓƬƣǚǏƥƫ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[29] = NLoginCore_223.A("ǋǊƛǞƒƘǛǔƼǝǞǞǠǘǊǡƽƪǡǂǬǁǇƭǋǶǖǈǎǵǊƵƷǸƵǌǪǝǢǢǣǘǰǰȈǚǡȌǵǼǎǺǜȏǖǗ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[30] = NLoginCore_138.F("ձզդզ֥օ֖֋պևէֱ։ֳ֤ձկָֹ֑֮֬֋֚֬֍ַַׅ֭֡֕", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[31] = NLoginCore_091.D("Խեղ՞շթՒՊթագփՇբ֎֏ֈֈտե֏Ֆ֐ՙղ֒իհ֏֚֕՛պ՜՘֛֦֨֕֨բ֣֪ո֘հքլ֢խֶմ֐ճշ֏ֱֶ֗֌ն֑֛־ցւ׆֒տ֚׀ֳ։֧֟׍֜אד֑֏ֿ׌׏֢ך֫֙ל֛֧ג֖׎ד׎", (byte)114, 68);
                    NLoginCore_043.var_java_lang_String_arr_d[32] = NLoginCore_559.B("ƕƬƺǓǠƝƠƿǡǜƴƿƧǃƻǬƾƭǜǎǣǒǍǉƮǌǍǷƱƵƱƳƻǎǮǌǽƸǴƽǬƻȀǤǒȊǿǗǺǛǻǡǹȌȑȂǬȋǐǗǔǮȑǯǭǗǨȕǬȀǷȕǞǰǿȐǶǨȅǽǴșȥȪȡǫȠǳȫȫȶȑȓȅȌǸȚȐȻȋȺǻȳȓȴȘɀȋ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[33] = NLoginCore_091.C("ՎծՔմՑ՚Ւֈ֊բ՝՜ջֈՊ՛֎վտբրձմլՙ֛֏ի՟աս֐՟֕֔ո֛ճտպոֆ֡֎ֱֳ֠եֲָֹ֮֯ֆմ֍ְֻֽ֖֛֒֟պպֵֵ֑֝փ֢֦֋֛֕֙֜א֢׎֪֋׆ׇ֦ח֞֟", (byte)114, 67);
                    NLoginCore_043.var_java_lang_String_arr_d[34] = NLoginCore_076.F("յև֔ևըְ֣֜֯֨֐ֳ֌ֱլֲ֔ֈյփճ֊ְֳսִֶָָֹֿ֤֥֧֠֠֙֠֙֍ְְ֑֞׏֦֮֓טבׁהֺ֚׉֬׌ןהומנךאףךּנזׅתףאב׊׭פ׳׵ץאֱ׆׏׉הׁׂ", (byte)114, 70);
                    NLoginCore_043.var_java_lang_String_arr_d[35] = NLoginCore_138.E("՞֓յժմ։զֆջ֣֫ն", (byte)114, 69);
                    NLoginCore_043.var_java_lang_String_arr_d[36] = NLoginCore_223.A("ƦƛƙƛǚƺǋǀƯƼƦǔǘǘǘǥƴǬǦƾǩǄƨǏǌǶǴƳǢǋǶǮ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[37] = NLoginCore_201.A("ƦƛƙƛǚƺǋǀƯƼƥǅƴƿƠǟƧǠǬǆǃƹƶƷ", (byte)114, 65);
                    NLoginCore_043.var_java_lang_String_arr_d[38] = NLoginCore_324.B("ƦƛƙƛǚƺǋǀƯƼƘơǟǕƴƸǩǡƶǅǪǟƶƷ", (byte)114, 66);
                    NLoginCore_043.var_java_lang_String_arr_d[39] = NLoginCore_453.E("հ֒եփվ֦֚֚֝֘ըփ֊֋տ֭֩յ֢֌֥֮յֹֻ֝֘չ֛վ֝֎֐ַ֣֖֘֙֬ևׇֿ֤֌֨׀֦֎֣֖֣֛֓ך֢֡", (byte)114, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_043.var_java_lang_String_arr_d[0] = NLoginCore_451.A("ǏǉƜƿǘƚƘǂǌƸǔǞƧǘƺǀƢǧǞǊǇǊƪǋƳǣǀǋǄǰǊǓ", (byte)114, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_043.var_java_lang_String_arr_d[0] = NLoginCore_446.E("դւզ֘֩֠֬ևեիծօրց֯֬ևְ֓ւո֔ցւ", (byte)114, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x50L;
        l ^= 0xD13632C2FEFE6874L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(63 + 6), (byte)(56 + 27), (byte)(35 + 12), (byte)(52 + 15), (byte)(7 + 59), (byte)(61 + 6), (byte)(9 + 38), (byte)(14 + 66), (byte)(14 + 61), (byte)(58 + 9), (byte)(69 + 14), 53, (byte)(55 + 25), (byte)(32 + 65), (byte)(93 + 7), 100, (byte)(63 + 42), (byte)(25 + 85), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(6 + 77)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("òÿþÁāýøāČûÈĆĊăĆČÎѧеѫѨѥюцѐѭѫ", (byte)8, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_043.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public NLoginCore_043(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_043.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ƝƿǁơǅǤǜǲǞƭǫǡǯǩƲǗǹǸǰǶǰǅ", (byte)123, 65), NLoginCore_043.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.D("։֖֕՘֘֔֏֣֘֒՟֣֚֝֡֝եࣾ࣌ंࣿࣼࣥࣝࣧऄंջ", (byte)123, 68) + string + NLoginCore_384.A("Ư", (byte)123, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public void s() {
        Class[] classArray = new Class[fx];
        classArray[NLoginCore_043.fy] = NLoginCore_441.class;
        classArray[NLoginCore_043.fz] = NLoginCore_067.class;
        classArray[NLoginCore_043.ga] = NLoginCore_274.class;
        classArray[NLoginCore_043.gb] = NLoginCore_401.class;
        classArray[NLoginCore_043.gc] = NLoginCore_505.class;
        classArray[NLoginCore_043.gd] = NloginchangepassCommand.class;
        classArray[NLoginCore_043.ge] = NloginchangeuuidCommand.class;
        classArray[NLoginCore_043.gf] = NLoginCore_376.class;
        classArray[NLoginCore_043.gg] = NlogindeleteCommand.class;
        classArray[NLoginCore_043.gh] = NLoginCore_503.class;
        classArray[NLoginCore_043.gi] = NLoginType_022.class;
        classArray[NLoginCore_043.gj] = NloginregisterCommand.class;
        classArray[NLoginCore_043.gk] = NloginunbanCommand.class;
        classArray[NLoginCore_043.gl] = NloginunregisterCommand.class;
        classArray[NLoginCore_043.gm] = NLoginCore_024.class;
        classArray[NLoginCore_043.gn] = NLoginCore_005.class;
        classArray[NLoginCore_043.go] = NLoginCore_431.class;
        classArray[NLoginCore_043.gp] = NLoginCore_131.class;
        classArray[NLoginCore_043.gq] = NLoginCore_296.class;
        classArray[NLoginCore_043.gr] = NLoginCore_485.class;
        classArray[NLoginCore_043.gs] = NLoginCore_396.class;
        classArray[NLoginCore_043.gt] = NLoginCore_527.class;
        classArray[NLoginCore_043.gu] = NLoginCore_207.class;
        Class[] classArray2 = classArray;
        ArrayList<NLoginCore_353> arrayList = new ArrayList<NLoginCore_353>();
        Class[] classArray3 = classArray2;
        int n = classArray3.length;
        for (int i = gv; i < n; ++i) {
            Class clazz = classArray3[i];
            try {
                Class[] classArray4 = new Class[gw];
                classArray4[NLoginCore_043.gx] = NLoginType_008.class;
                Object[] objectArray = new Object[gy];
                objectArray[NLoginCore_043.gz] = this.var_java_util_List_com_nickuc_login_NLoginCore_353__a;
                NLoginCore_353 NLoginCore_3534 = (NLoginCore_353)clazz.getConstructor(classArray4).newInstance(objectArray);
                arrayList.add(NLoginCore_3534);
                continue;
            }
            catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                NLoginCore_370.c((String)NLoginCore_043.c("㺀", (int)ha, (long)(hb ^ hc)) + clazz.getSimpleName(), reflectiveOperationException, new Object[hd]);
            }
        }
        arrayList.sort((NLoginCore_3532, NLoginCore_3533) -> NLoginCore_3532.e().compareToIgnoreCase(NLoginCore_3533.e()));
        this.var_java_util_List_com_nickuc_login_NLoginCore_353__a = arrayList;
    }
}

