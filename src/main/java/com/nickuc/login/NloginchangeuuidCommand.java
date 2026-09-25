/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_029;
import com.nickuc.login.NLoginCore_371;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_259;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginchangeuuidCommand
extends NLoginCore_353 {
    private static int ck;
    private static int cs;
    private static int cv;
    private static int ed;
    private static long ec;
    private static int z;
    private static long ag;
    private static long bb;
    private static int ci;
    private static int bq;
    private static long ab;
    private static int co;
    private static int ee;
    private static int az;
    private static int eh;
    private static int cfr_renamed_1;
    private static int bl;
    private static int ch;
    private static long as;
    private static long cq;
    private static int bk;
    private static int bu;
    private static long cy;
    private static int br;
    private static int y;
    private static long g;
    private static String[] b;
    private static long bi;
    private static int au;
    private static int p;
    private static int var_int_e;
    private static int cx;
    private static int aj;
    private static int dt;
    private static int var_int_c;
    private static long dw;
    private static int r;
    private static int w;
    private static long dz;
    private static int bz;
    private static long aw;
    private static long bd;
    private static int bj;
    private static int cj;
    private static long al;
    private static int du;
    private static long v;
    private static int dp;
    private static int j;
    private static long cm;
    private static int dn;
    private static int el;
    private static int an;
    private static int em;
    private static int cg;
    private static long cw;
    private static final int m;
    private static int bv;
    private static long u;
    private static int dx;
    private static int at;
    private static int ef;
    private static long be;
    private static int eb;
    private static long ao;
    private static final List<String> var_java_util_List_java_lang_String__e;
    private static int aq;
    private static int l;
    private static long ba;
    private static int dj;
    private static long ek;
    private static long eg;
    private static int bc;
    private static int da;
    private static long db;
    private static int bw;
    private static int ae;
    private static int x;
    private static long ak;
    private static long de;
    private static int ca;
    private static long cf;
    private static String[] a;
    private static int cd;
    private static long dg;
    private static int cn;
    private static int dq;
    private static int dk;
    private static int aa;
    private static long ah;
    private static long s;
    private static int dy;
    private static int bn;
    private static long dd;
    private static long ej;
    private static long ax;
    private static int dh;
    private static float cc;
    private static final int o;
    private static long ad;
    private static int bx;
    private static int k;
    private static int h;
    private static int cr;
    private static long dv;
    private static int bp;
    private static int ai;
    private static long var_long_d;
    private static int ds;
    private static int cu;
    private static int q;
    private static int dr;
    private static int by;
    private static int ac;
    private static int dl;
    private static int i;
    private static long f;
    private static int dm;
    private static int cz;
    private static final List<String> var_java_util_List_java_lang_String__d;
    private static final int n;
    private static int dc;
    private static long bs;
    private static int bf;
    private static int ay;
    private static long var_long_c;
    private static long en;
    private static int bh;
    private static int av;
    private static int ei;
    private static long ct;
    private static int t;
    private static int ce;
    private static int am;
    private static float cb;
    private static int ar;
    private static long bm;
    private static int af;
    private static int cl;
    private static int bo;
    private static int df;
    private static long cp;
    private static long bt;
    private static int ea;
    private static int di;
    private static int ap;
    private static int bg;

    public NloginchangeuuidCommand(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NloginchangeuuidCommand.c("㺀", (int)var_int_c, (long)var_long_d), (String)NloginchangeuuidCommand.c("㺃", (int)var_int_e, (long)(f ^ g)), h != 0, i != 0, new String[j]);
    }

    private int a(@Nullable UUID uUID, @Nullable UUID uUID2) {
        if (uUID == null) {
            return di;
        }
        if (uUID.version() == dj) {
            return dk;
        }
        if (uUID.equals(uUID2)) {
            return dl;
        }
        return dm;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        Object object;
        Object object2;
        if (stringArray.length != k) {
            Object[] objectArray = new Object[l];
            objectArray[NloginchangeuuidCommand.p] = (String)NloginchangeuuidCommand.c("㺀", (int)(q & r), (long)s) + this.e().toLowerCase(Locale.ENGLISH) + (String)NloginchangeuuidCommand.c("㺃", (int)t, (long)(u ^ v));
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        NLoginCore_291 NLoginCore_2912 = this.a.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, stringArray[w]);
        if (ForceRegisterConfig2 == null) {
            return;
        }
        if (!ForceRegisterConfig2.r()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[x]);
            return;
        }
        UUID uUID = ForceRegisterConfig2.java_util_UUID_a();
        UUID uUID2 = ForceRegisterConfig2.getMojangId();
        int n = this.a(uUID, uUID2);
        String string = stringArray[y].toLowerCase(Locale.ENGLISH);
        Object object3 = null;
        int n2 = var_long_d.indexOf(string);
        if (n2 == z) {
            try {
                switch (string.length()) {
                    case 32: 
                    case 36: {
                        object3 = NLoginCore_432.c(string);
                        n2 = this.a((UUID)object3, uUID2);
                        break;
                    }
                    default: {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺆", (int)aa, (long)ab) + String.join((CharSequence)NloginchangeuuidCommand.c("㺉", (int)ac, (long)ad), (Iterable<? extends CharSequence>)var_long_d), new Object[ae]);
                        return;
                    }
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺌", (int)af, (long)(ag ^ ah)) + string, new Object[ai]);
                return;
            }
        }
        if (n2 == 0 && n == n2 || uUID != null && uUID.equals(object3)) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺏", (int)aj, (long)(ak ^ al)) + uUID + (String)NloginchangeuuidCommand.c("㺒", (int)(am & an), (long)ao) + (String)var_int_e.get(n2), new Object[ap]);
            return;
        }
        String string2 = ForceRegisterConfig2.i();
        if (object3 == null) {
            switch (n2) {
                case 0: {
                    if (uUID2 != null) {
                        object3 = uUID2;
                        break;
                    }
                    NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺕", (int)(aq & ar), (long)as), new Object[at]);
                    object2 = NLoginCore_371.a(this.a, string2, au != 0);
                    if (object2 == null) {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺘", (int)av, (long)(aw ^ ax)), new Object[ay]);
                        return;
                    }
                    object = ((NLoginCore_259)object2).java_util_UUID_b();
                    if (object == null) {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺛", (int)az, (long)(ba ^ bb)) + string2 + (String)NloginchangeuuidCommand.c("㺞", (int)bc, (long)(bd ^ be)), new Object[bf]);
                        return;
                    }
                    object3 = object;
                    break;
                }
                case 2: {
                    object3 = NLoginCore_432.d(string2);
                    break;
                }
                case 1: {
                    object3 = UUID.randomUUID();
                    break;
                }
                default: {
                    NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺡", (int)(bg & bh), (long)bi) + n2, new Object[bj]);
                }
            }
        }
        if (uUID != null && uUID.equals(object3)) {
            Object[] objectArray = new Object[bn];
            objectArray[NloginchangeuuidCommand.bo] = uUID;
            objectArray[NloginchangeuuidCommand.bp] = var_int_e.get(n2);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺤", (int)(bk & bl), (long)bm), objectArray);
            return;
        }
        object2 = NLoginCore_2912.a((UUID)object3);
        if (object2 == null) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[bq]);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        if (((NLoginCore_029)object2).d != null) {
            Object[] objectArray = new Object[bu];
            objectArray[NloginchangeuuidCommand.bv] = ((NLoginCore_029)object2).d.i();
            objectArray[NloginchangeuuidCommand.bw] = uUID;
            objectArray[NloginchangeuuidCommand.bx] = var_int_e.get(n2);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺧", (int)br, (long)(bs ^ bt)), objectArray);
            return;
        }
        object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            ForceRegisterConfig2.a((UUID)object3);
            NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[by];
            NLoginCore_436Array[NloginchangeuuidCommand.bz] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c;
            if (!NLoginCore_2912.a(ForceRegisterConfig2, NLoginCore_436Array)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[ca]);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                return;
            }
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, cb, cc);
            Object[] objectArray = new Object[cg];
            objectArray[NloginchangeuuidCommand.ch] = string2;
            objectArray[NloginchangeuuidCommand.ci] = object3;
            objectArray[NloginchangeuuidCommand.cj] = var_int_e.get(n2);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺪", (int)(cd & ce), (long)cf), objectArray);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺭", (int)(ck & cl), (long)cm), new Object[cn]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangeuuidCommand.c("㺰", (int)co, (long)(cp ^ cq)) + NLoginCore_2702.a(TimeUnit.SECONDS, cr) + (String)NloginchangeuuidCommand.c("㺳", (int)cs, (long)ct), new Object[cu]);
            NLoginCore_370.b((String)NloginchangeuuidCommand.c("㺶", (int)cv, (long)cw) + string2 + (String)NloginchangeuuidCommand.c("㺹", (int)cx, (long)cy) + object3 + (String)NloginchangeuuidCommand.c("㺼", (int)(cz & da), (long)db) + (String)var_long_d.get(n2) + (String)NloginchangeuuidCommand.c("㺿", (int)dc, (long)(dd ^ de)) + NLoginInterface_0422.getName() + (String)NloginchangeuuidCommand.c("㻂", (int)df, (long)dg), new Object[dh]);
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        var_long_d = Long.reverse(567441105355488133L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(1576247421886479237L);
        g = Long.reverse(0x1200000000000000L);
        h = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        i = Integer.reverse(0);
        j = 0 >>> 248 | 0 << ~248 + 1;
        k = 768 >>> 104 | 768 << ~104 + 1;
        l = 0x2000000 >>> 57 | 0x2000000 << ~57 + 1;
        p = Integer.reverse(0);
        q = 0x800000 >>> 150 | 0x800000 << ~150 + 1;
        r = -1 >>> 197 | -1 << ~197 + 1;
        s = Long.reverse(567441105355488133L);
        t = 24 >>> 3 | 24 << ~3 + 1;
        u = Long.reverse(1576247421886479237L);
        v = Long.reverse(0x1200000000000000L);
        w = 0x400000 >>> 214 | 0x400000 << -214;
        x = (0 >>> 82 | 0 << ~82 + 1) & 0xFFFFFFFF;
        y = (64 >>> 101 | 64 << ~101 + 1) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        aa = Integer.reverse(0x20000000);
        ab = Long.reverse(567441105355488133L);
        ac = Integer.reverse(-1610612736);
        ad = Long.reverse(567441105355488133L);
        ae = 0 >>> 113 | 0 << ~113 + 1;
        af = 0x1800000 >>> 22 | 0x1800000 << -22;
        ag = Long.reverse(1576247421886479237L);
        ah = Long.reverse(0x1200000000000000L);
        ai = (0 >>> 97 | 0 << ~97 + 1) & 0xFFFFFFFF;
        aj = Integer.reverse(-536870912);
        ak = Long.reverse(1576247421886479237L);
        al = Long.reverse(0x1200000000000000L);
        am = 8 >>> 224 | 8 << ~224 + 1;
        an = Integer.reverse(-1);
        ao = Long.reverse(567441105355488133L);
        ap = 0 >>> 36 | 0 << -36;
        aq = 36864 >>> 76 | 36864 << ~76 + 1;
        ar = -1 >>> 114 | -1 << -114;
        as = Long.reverse(567441105355488133L);
        at = 0 >>> 202 | 0 << ~202 + 1;
        au = Integer.reverse(Integer.MIN_VALUE);
        av = 5 >>> 191 | 5 << ~191 + 1;
        aw = Long.reverse(1576247421886479237L);
        ax = Long.reverse(0x1200000000000000L);
        ay = 0 >>> 56 | 0 << ~56 + 1;
        az = Integer.reverse(-805306368);
        ba = Long.reverse(1576247421886479237L);
        bb = Long.reverse(0x1200000000000000L);
        bc = Integer.reverse(0x30000000);
        bd = Long.reverse(1576247421886479237L);
        be = Long.reverse(0x1200000000000000L);
        bf = Integer.reverse(0);
        bg = Integer.reverse(-1342177280);
        bh = -1 >>> 133 | -1 << -133;
        bi = Long.reverse(567441105355488133L);
        bj = Integer.reverse(0);
        bk = Integer.reverse(0x70000000);
        bl = Integer.reverse(-1);
        bm = Long.reverse(567441105355488133L);
        bn = Integer.reverse(0x40000000);
        bo = 0 >>> 17 | 0 << ~17 + 1;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0);
        br = (61440 >>> 140 | 61440 << ~140 + 1) & 0xFFFFFFFF;
        bs = Long.reverse(1576247421886479237L);
        bt = Long.reverse(0x1200000000000000L);
        bu = (786432 >>> 242 | 786432 << -242) & 0xFFFFFFFF;
        bv = (0 >>> 219 | 0 << -219) & 0xFFFFFFFF;
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = Integer.reverse(0x40000000);
        by = (0x20000000 >>> 29 | 0x20000000 << ~29 + 1) & 0xFFFFFFFF;
        bz = (0 >>> 148 | 0 << -148) & 0xFFFFFFFF;
        ca = Integer.reverse(0);
        cb = Float.intBitsToFloat(536064 >>> 245 | 536064 << ~245 + 1);
        cc = Float.intBitsToFloat(Integer.reverse(514));
        cd = (0x40000000 >>> 26 | 0x40000000 << ~26 + 1) & 0xFFFFFFFF;
        ce = (-1 >>> 138 | -1 << ~138 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(567441105355488133L);
        cg = 0x600000 >>> 117 | 0x600000 << ~117 + 1;
        ch = 0 >>> 87 | 0 << ~87 + 1;
        ci = 0x800000 >>> 55 | 0x800000 << ~55 + 1;
        cj = (0x1000000 >>> 119 | 0x1000000 << -119) & 0xFFFFFFFF;
        ck = (0x2200000 >>> 181 | 0x2200000 << -181) & 0xFFFFFFFF;
        cl = Integer.reverse(-1);
        cm = Long.reverse(567441105355488133L);
        cn = Integer.reverse(0);
        co = Integer.reverse(0x48000000);
        cp = Long.reverse(1576247421886479237L);
        cq = Long.reverse(0x1200000000000000L);
        cr = Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190;
        cs = 304 >>> 228 | 304 << -228;
        ct = Long.reverse(567441105355488133L);
        cu = Integer.reverse(0);
        cv = Integer.reverse(0x28000000);
        cw = Long.reverse(567441105355488133L);
        cx = Integer.reverse(-1476395008);
        cy = Long.reverse(567441105355488133L);
        cz = 704 >>> 133 | 704 << ~133 + 1;
        da = Integer.reverse(-1);
        db = Long.reverse(567441105355488133L);
        dc = Integer.reverse(-402653184);
        dd = Long.reverse(1576247421886479237L);
        de = Long.reverse(0x1200000000000000L);
        df = (6144 >>> 72 | 6144 << ~72 + 1) & 0xFFFFFFFF;
        dg = Long.reverse(567441105355488133L);
        dh = Integer.reverse(0);
        di = Integer.reverse(-1);
        dj = (6144 >>> 107 | 6144 << -107) & 0xFFFFFFFF;
        dk = 1024 >>> 169 | 1024 << -169;
        dl = Integer.reverse(0);
        dm = 131072 >>> 209 | 131072 << -209;
        dn = Integer.reverse(-134217728);
        cfr_renamed_1 = (15872 >>> 41 | 15872 << -41) & 0xFFFFFFFF;
        dp = 0x40000000 >>> 61 | 0x40000000 << -61;
        dq = Integer.reverse(0);
        dr = (8192 >>> 13 | 8192 << ~13 + 1) & 0xFFFFFFFF;
        ds = Integer.reverse(-1073741824);
        dt = Integer.reverse(0);
        du = 0x32000000 >>> 89 | 0x32000000 << -89;
        dv = Long.reverse(1576247421886479237L);
        dw = Long.reverse(0x1200000000000000L);
        dx = Integer.reverse(Integer.MIN_VALUE);
        dy = Integer.reverse(0x58000000);
        dz = Long.reverse(567441105355488133L);
        ea = Integer.reverse(0x40000000);
        eb = Integer.reverse(-671088640);
        ec = Long.reverse(567441105355488133L);
        ed = Integer.reverse(-1073741824);
        ee = (0 >>> 85 | 0 << ~85 + 1) & 0xFFFFFFFF;
        ef = Integer.reverse(0x38000000);
        eg = Long.reverse(567441105355488133L);
        eh = Integer.reverse(Integer.MIN_VALUE);
        ei = Integer.reverse(-1207959552);
        ej = Long.reverse(1576247421886479237L);
        ek = Long.reverse(0x1200000000000000L);
        el = Integer.reverse(0x40000000);
        em = Integer.reverse(0x78000000);
        en = Long.reverse(567441105355488133L);
        a = new String[dn];
        b = new String[cfr_renamed_1];
        NloginchangeuuidCommand.void_b();
        o = dp;
        m = dq;
        n = dr;
        String[] stringArray = new String[ds];
        stringArray[NloginchangeuuidCommand.dt] = NloginchangeuuidCommand.c("㺀", (int)du, (long)(dv ^ dw));
        stringArray[NloginchangeuuidCommand.dx] = NloginchangeuuidCommand.c("㺃", (int)dy, (long)dz);
        stringArray[NloginchangeuuidCommand.ea] = NloginchangeuuidCommand.c("㺆", (int)eb, (long)ec);
        var_long_d = (long)Arrays.asList(stringArray);
        String[] stringArray2 = new String[ed];
        stringArray2[NloginchangeuuidCommand.ee] = NloginchangeuuidCommand.c("㺉", (int)ef, (long)eg);
        stringArray2[NloginchangeuuidCommand.eh] = NloginchangeuuidCommand.c("㺌", (int)ei, (long)(ej ^ ek));
        stringArray2[NloginchangeuuidCommand.el] = NloginchangeuuidCommand.c("㺏", (int)em, (long)en);
        var_int_e = (int)Arrays.asList(stringArray2);
    }

    private static void void_b() {
        int n;
        var_long_c = -6783311833472173144L;
        long l = var_long_c ^ 0x328051EDCDDFD2E2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(39 + 30), (byte)(30 + 53), 47, (byte)(26 + 41), (byte)(60 + 6), (byte)(8 + 59), (byte)(17 + 30), 80, (byte)(65 + 10), (byte)(36 + 31), (byte)(39 + 44), (byte)(9 + 44), (byte)(63 + 17), (byte)(47 + 50), (byte)(45 + 55), (byte)(22 + 78), (byte)(54 + 51), (byte)(81 + 29), (byte)(26 + 77)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
                    NloginchangeuuidCommand.b[0] = NLoginCore_091.B("ŝƗŴŞƕƢƘſƫŦŤƃƠƄƎƊŭưŪūƒƏżŽ", (byte)85, 66);
                    NloginchangeuuidCommand.b[1] = NLoginCore_091.F("՜սեՄց՝ջՠկլքբբֈևհզ֓֌և։խֈ֏՜֌՛հձաբ՛փց֨ը֝փ֥ռձְ֠սկ֨֌ַ֔ղօյ֍ևքօ", (byte)85, 70);
                    NloginchangeuuidCommand.b[2] = NLoginCore_173.E("պջխՖտը։թր֐ց՝թ֐խւ֑ժ֛՛֌էդե", (byte)85, 69);
                    NloginchangeuuidCommand.b[3] = NLoginCore_027.E("փփՠՙ֎՗ոևփֆֆբխփրն֎եՓզ֔թղլ֖մ֛֘֟ձ֡ֆ֣֫֨խ֗սէֲծ֊ռչ", (byte)85, 69);
                    NloginchangeuuidCommand.b[4] = NLoginCore_173.C("ԥӼԩԞԫԜӪԩԈԨӲԴԥԄԻԈԕԺӱԹԜՁԌԢԕԏԵԳԠԣԻԫ", (byte)85, 67);
                    NloginchangeuuidCommand.b[5] = NLoginCore_004.C("ӟԮԄӢԣԎԤԲӰӭԗӼ", (byte)85, 67);
                    NloginchangeuuidCommand.b[6] = NLoginCore_384.D("ӵԊԘԘ԰ԲԠԊӫԖԃԗԫԗԮԷԪԩԶԕԉԻՁԚԦՅԚՉԾԻԄԝ", (byte)85, 68);
                    NloginchangeuuidCommand.b[7] = NLoginCore_559.F("ՓՓխ֋ֈթհ֌ց֔֕ՏեֆըթկՕ֒֝֗֟՞՗֢վջՠ֔֕ք֙նշ֣ք֡֎֋֟֫ճև֞կֵ֎ֱִֹֽ֙֩֜ռ֭տֱ֑֡֞փׄւ", (byte)85, 70);
                    NloginchangeuuidCommand.b[8] = NLoginCore_138.E("՝պՇէ՛՞պևթլվՙ", (byte)85, 69);
                    NloginchangeuuidCommand.b[9] = NLoginCore_575.F("չոՄ֎ՠվ֊է՜՝Ջֆ֎֍ֈպըհ֘Ֆ՝֥֚֙֗֜֘սքփւռմյլիս֚տ֦պ֠֍֋֎ֻ֣֦֕֯֫֕մվ֏֡־ֶ׃ִָֺ֖֓", (byte)85, 70);
                    NloginchangeuuidCommand.b[10] = NLoginCore_387.F("նՂՌեկս֎զճթ՟փթիւյպՕխ՝իչ֊֠ՠ֍բչ֤ՙ֛նև֩ե֌֋֝֎֐ք֊ֳ֐֑֖ճֵյ֚֒օִ֭քօ", (byte)85, 70);
                    NloginchangeuuidCommand.b[11] = NLoginCore_091.D("ԆԌԍԍԚԞԩԦԮԈԓԱԃԊԗԹԧӸԾԨ԰ԡԭԃԸԯԘӺԓԣԕԈՇԇԬԎՇԻՈՆՎԡԢՃԹԣԹԭՔԚԗ՝՟ԺԧԨ", (byte)85, 68);
                    NloginchangeuuidCommand.b[12] = NLoginCore_223.C("Ԃӿ԰ӦԄԏӳԭԅԞԔԳӱԷӳӺӴԲԚԖԸ԰ԎԵՃԯԶԁՊՈԷԨ", (byte)85, 67);
                    NloginchangeuuidCommand.b[13] = NLoginCore_324.F("Ն՟օՋՇՠռեպֈ՜ե֏տ֋ի֘Ֆժզ֘։՝սւ֝ցբ֗ւ֤֦փք֙֌ր֥֞ր֛֮րչ", (byte)85, 70);
                    NloginchangeuuidCommand.b[14] = NLoginCore_076.C("ӶӶԐԮԫԌԓԯԤԷԸӲԈԩԋԌԒӸԵՀԺՂԁӺՅԡԞԃԷԸԧԼԙԚՆԧՄԱԮՂՎԖԪՁԒ՘Ա՜՗ԼՌՠԿՔԡ՗ԵԴԶը՜աՙԧլեԨ԰ղճՑԭԧԿՓԼ", (byte)85, 67);
                    NloginchangeuuidCommand.b[15] = NLoginCore_092.B("ƙƄŤƦƧŝƀƈŢƅŦťƆƄŹƤƫƥƫƑƭƘƂƧűƐŮƊŶŻơƫƀƌƣƻƚƗƶǊƛǄǃǉƶƥƏƈǌǔƟơƱǉƲǁǙǅǒǞƖǘƷƶǙǡƯǏƳǘƻƽǀǋƵǁǙǄƻǞǣƿǑǑǫƭǙǏǒǑƷƵƹǋǨǝ", (byte)85, 66);
                    NloginchangeuuidCommand.b[16] = NLoginCore_384.C("ԀԏԎԫԐԆԎԂӯԔԢԴԑԫԓԍԭԸԝԙԊӺԋԾԃԶԸԞԘԂԚԡԗՁՇԣԙՂՃ԰ԤՐԥՎՙԓԓ՚՛Ջ԰ԭՖԙ՟ԣՑէԠԶՑ՞ԹԶԧԥՋխեԫՇ՝ՁՃՓդՏմիեԴԽԶկՓ՘ՔԻ՜է՛սֆՙ֌ջ", (byte)85, 67);
                    NloginchangeuuidCommand.b[17] = NLoginCore_138.A("ƠƓŜƒůŻƜƔƓƋƌű", (byte)85, 65);
                    NloginchangeuuidCommand.b[18] = NLoginCore_091.D("ӭԯԊԭԲԀ԰ӪԉԈԗӮӳԕԛԉԑӰӽӲԠԶԠԓԅԚՄӺԀԢԤԟԆՅԆԣՏԠԩԑԨԯԒԜ", (byte)85, 68);
                    NloginchangeuuidCommand.b[19] = NLoginCore_201.A("ƗųƟžŠƗżŢƟźƪű", (byte)85, 65);
                    NloginchangeuuidCommand.b[20] = NLoginCore_138.B("ƖŢƀſŰƄƈƓơũƄű", (byte)85, 66);
                    NloginchangeuuidCommand.b[21] = NLoginCore_575.A("ŲƢƃŻƤŦơƃŠťžżƇůŢƲŰŪƨƏŨƑƕƄƭŵƷƘžƇƈźơƠƬưƢƓƻǄƢǌƅƚǍƟǏƪǊǎǌǂǎƯƜƝ", (byte)85, 65);
                    NloginchangeuuidCommand.b[22] = NLoginCore_138.F("՟լ՘օչ՝զիիւ֎ՙ", (byte)85, 70);
                    NloginchangeuuidCommand.b[23] = NLoginCore_091.A("ŲűžţƘŵűƀƨųƈű", (byte)85, 65);
                    NloginchangeuuidCommand.b[24] = NLoginCore_223.C("ӵԯԣԙԚӾԐԨԝԩԥӼ", (byte)85, 67);
                    NloginchangeuuidCommand.b[25] = NLoginCore_201.B("ŶůŭŜŶŻƙƈƔżƦű", (byte)85, 66);
                    NloginchangeuuidCommand.b[26] = NLoginCore_324.A("ŘƒƘƑŴƞšŸƕūżű", (byte)85, 65);
                    NloginchangeuuidCommand.b[27] = NLoginCore_223.B("ƏŬŢƤƄŶŸŢƤƂƌű", (byte)85, 66);
                    NloginchangeuuidCommand.b[28] = NLoginCore_138.E("՞ՈՇֆնռՊօփՏ֔՞ւֆծ֔ւձ֜ժխշդե", (byte)85, 69);
                    NloginchangeuuidCommand.b[29] = NLoginCore_201.B("şŚƣƢơŰŵƛƪũƗƬŤŮƀơưŮƃưƧƥżŽ", (byte)85, 66);
                    NloginchangeuuidCommand.b[30] = NLoginCore_384.A("ūŵƏƁƠƂžƜżƪƆƌƃūƠŽƠƅƫŬƕƥżŽ", (byte)85, 65);
                    continue block7;
                }
                case 1: {
                    NloginchangeuuidCommand.b[0] = NLoginCore_027.A("ŝƗŴŞƕƢƘſƫŦŤŶŸƗƐơƝƝƉƝŨƥżŽ", (byte)85, 65);
                    NloginchangeuuidCommand.b[1] = NLoginCore_091.F("՜սեՄց՝ջՠկլքբբֈևհզ֓֌և։խֈ֏՜֌՛հձաբ՛փց֨ը֝փ֥ռձְ֟֒խթֵ֢ձ֧ֈպַֽքօ", (byte)85, 70);
                    NloginchangeuuidCommand.b[2] = NLoginCore_223.A("ƒƓƅŮƗƀơƁƘƨƘƉƝŻūƲƟƈƪƉƔƥżŽ", (byte)85, 65);
                    NloginchangeuuidCommand.b[3] = NLoginCore_201.D("ԦԦԃӼԱӺԛԪԦԩԩԅԐԦԣԙԱԈӶԉԷԌԕԏԹԗԾԻՂԔՄԩԵԬՈՐԊԏԳՑԍԮՅԫՌԩՆՆԪԸԴԜՂԪԧԨ", (byte)85, 68);
                    NloginchangeuuidCommand.b[4] = NLoginCore_027.D("ԥӼԩԞԫԜӪԩԈԨӲԴԥԄԻԈԕԺӱԹԜӴԀԂԭՅԡԈԱԄԳԝ", (byte)85, 68);
                    NloginchangeuuidCommand.b[5] = NLoginCore_427.B("ŪŞűžŹŲƑƞƊŦżű", (byte)85, 66);
                    NloginchangeuuidCommand.b[6] = NLoginCore_427.C("ӵԊԘԘ԰ԲԠԊӫԖԃԗԫԗԮԷԪԩԶԕԉԴԢԙӿԳԣԵԽՇԆԋԝԼՏԻԱԋԥԵՑԏՅԜ", (byte)85, 67);
                    NloginchangeuuidCommand.b[7] = NLoginCore_453.A("ūūƅƣƠƁƈƤƙƬƭŧŽƞƀƁƇŭƪƵƯƷŶůƺƖƓŸƬƭƜƱƎƏƻƜƹƦƣƷǃƋƟƶƇǍƦǑǌƱǁǕƴǓƱƙǙƴǙǔǘǐƸƳ", (byte)85, 65);
                    NloginchangeuuidCommand.b[8] = NLoginCore_451.C("ԇӸԐӯԡԜԊԂԞԗԡӼ", (byte)85, 67);
                    NloginchangeuuidCommand.b[9] = NLoginCore_027.A("ƑƐŜƦŸƖƢſŴŵţƞƦƥƠƒƀƈưŮŵƱƯƴƲưƽƕƜƛƚƔƌƍƄƃƕƲƗƾƒƸƥƣƦƭǇǃƭƻǓƾƌƓǋƙƕǎƦǎǝǓƖƫ", (byte)85, 65);
                    NloginchangeuuidCommand.b[10] = NLoginCore_427.B("ƎŚŤŽƇƕƦžƋƁŷƛƁƃƚƍƒŭƅŵƃƑƢƸŸƥźƑƼűƳƎƟǁŽƤƣƵƦƨƜƢǊǁƪƪƯǌƒƅƿǋǂǔƷǊǄƮǖƥƐǀƪƸ", (byte)85, 66);
                    NloginchangeuuidCommand.b[11] = NLoginCore_027.A("ŻƁƂƂƏƓƞƛƣŽƈƦŸſƌƮƜŭƳƝƥƖƢŸƭƤƍůƈƘƊŽƼżơƃƼưƽƻǃƖƔƜƩƯƈǑƦƥƤƧƱǅƜƝ", (byte)85, 65);
                    NloginchangeuuidCommand.b[12] = NLoginCore_201.C("Ԃӿ԰ӦԄԏӳԭԅԞԔԳӱԷӳӺӴԲԚԖԸԳԎӼԒԁԟԔԢՋԚԪԿԞԣԍԺԭՍԥՔԞՍԜ", (byte)85, 67);
                    NloginchangeuuidCommand.b[13] = NLoginCore_173.E("Ն՟օՋՇՠռեպֈ՜ե֏տ֋ի֘Ֆժզ֘։՝սւ֝ցբ֗ւ֤֦֡ե֢ւ֣վ֍֧ձճղքձֈ֐֪ք֊։ֺּ֗քօ", (byte)85, 69);
                    NloginchangeuuidCommand.b[14] = NLoginCore_091.D("ӶӶԐԮԫԌԓԯԤԷԸӲԈԩԋԌԒӸԵՀԺՂԁӺՅԡԞԃԷԸԧԼԙԚՆԧՄԱԮՂՎԖԪՁԒ՘Ա՜՗ԼՌՠԿՔԡ՗ԵԴԶը՜աՙԧժ՟Ըեղճ՜էծԬՏԼ", (byte)85, 68);
                    NloginchangeuuidCommand.b[15] = NLoginCore_027.E("ցլՌ֎֏ՅըհՊխՎՍծլա֌֓֍֓չ֕րժ֏ՙոՖղ՞գ։֓ըմ֋֣ւտֲ֞փֱ֬֫֞֍շհִּև։ֱֺׁ֚֭֙֩׆վ׀ׁ֟֞׉ַ֛֗׀ֳׁ֣֥֣֨֝֩֬׆׋ֹֹ֧ד֘מָׁנוֶודִד", (byte)85, 69);
                    NloginchangeuuidCommand.b[16] = NLoginCore_384.D("ԀԏԎԫԐԆԎԂӯԔԢԴԑԫԓԍԭԸԝԙԊӺԋԾԃԶԸԞԘԂԚԡԗՁՇԣԙՂՃ԰ԤՐԥՎՙԓԓ՚՛Ջ԰ԭՖԙ՟ԣՑէԠԶՑ՞ԹԶԧԥՋխեԫՇ՝ՁՃՓդՏմիեԴԽԶկՓՒհՌռՓքՓպրքՌ", (byte)85, 68);
                    NloginchangeuuidCommand.b[17] = NLoginCore_451.B("ŸŞƢƢźƞŤŻƖũţű", (byte)85, 66);
                    NloginchangeuuidCommand.b[18] = NLoginCore_559.F("Պ֌է֊֏՝֍ՇզեմՋՐղոզծՍ՚Տս֓սհբշ֡՗՝տցռ֥֥֢֕ծչ֐էֲօֲ֨ֈ֬֓։֎֗ճֳ֧֗քօ", (byte)85, 70);
                    NloginchangeuuidCommand.b[19] = NLoginCore_559.B("žƛŵƆƗƄŠſƞƋŵŬſƈƨƁƃƳŦƪơƏżŽ", (byte)85, 66);
                    NloginchangeuuidCommand.b[20] = NLoginCore_223.D("ӺԤԀԦӽԧԠԝԲӯԤӵԵӴԧӹԐԵԈԵԭՀԇԈ", (byte)85, 68);
                    NloginchangeuuidCommand.b[21] = NLoginCore_223.A("ŲƢƃŻƤŦơƃŠťžżƇůŢƲŰŪƨƏŨƑƕƄƭŵƷƘžƇƈźơƠƬưƢƓƻǄƢǌƅƊǂǉƉǍƩǀƼƐƈƯƜƝ", (byte)85, 65);
                    NloginchangeuuidCommand.b[22] = NLoginCore_138.A("ƝƛŢƢŠſƤźƝƪŸű", (byte)85, 65);
                    NloginchangeuuidCommand.b[23] = NLoginCore_076.A("ƗŚƀűƆŴƂũƙƉƦű", (byte)85, 65);
                    NloginchangeuuidCommand.b[24] = NLoginCore_559.A("ŮŜƎűƀƢŹţƣƌƖű", (byte)85, 65);
                    NloginchangeuuidCommand.b[25] = NLoginCore_004.B("ŶƛƞƤŦůƨƞơƅūƖƊūƯƁƚơſƨƟƏżŽ", (byte)85, 66);
                    NloginchangeuuidCommand.b[26] = NLoginCore_004.C("ӫԛӪԭӼԈԃԥԶԥԕӶӱԧԕԶԨӻԶӻԵԚԇԈ", (byte)85, 67);
                    NloginchangeuuidCommand.b[27] = NLoginCore_004.B("ƗƎƐƑƝŞƓŸƈƌƍƞƆƤƋƏƯƉƲƳƵƵżŽ", (byte)85, 66);
                    NloginchangeuuidCommand.b[28] = NLoginCore_559.E("՞ՈՇֆնռՊօփՏ֔ՓՈ֑կճ֏֋֐Տ֗շդե", (byte)85, 69);
                    NloginchangeuuidCommand.b[29] = NLoginCore_027.F("ՇՂ֋֊։՘՝փ֒ՑտՑբբ֕՗֓ձձկֈ֝դե", (byte)85, 70);
                    NloginchangeuuidCommand.b[30] = NLoginCore_446.D("ӶԀԚԌԫԍԉԧԇԵԏӲԃԂӷӵԅӷԕԉԪӿԂԮԤԮԧԟԥԣԨԄ", (byte)85, 68);
                    continue block7;
                }
                case 2: {
                    NloginchangeuuidCommand.b[0] = NLoginCore_076.A("ŢŕƃƤſƑƘƅƗƝƫŽŹƫŻŮƦƳƑƧűƥżŽ", (byte)85, 65);
                    continue block7;
                }
                case 4: {
                    NloginchangeuuidCommand.b[0] = NLoginCore_138.A("żƍƚťŘŦŰŷŠƪƌű", (byte)85, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x48L;
        l ^= 0x328051EDCDDFD2E2L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(44 + 25), (byte)(48 + 35), (byte)(25 + 22), (byte)(16 + 51), (byte)(2 + 64), (byte)(55 + 12), (byte)(14 + 33), (byte)(16 + 64), (byte)(23 + 52), (byte)(57 + 10), (byte)(66 + 17), 53, 80, (byte)(65 + 32), (byte)(23 + 77), (byte)(28 + 72), (byte)(86 + 19), (byte)(36 + 74), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.A("üĉĈËċćĂċĖąÒĐĔčĐĖØѡѠєѴїѬѬѹѸ", (byte)13, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NloginchangeuuidCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NloginchangeuuidCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 66), NloginchangeuuidCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠟࠞࠒ࠲ࠕࠪࠪ࠷࠶ҫ", (byte)54, 68) + string + NLoginCore_138.D("ґ", (byte)54, 68) + methodType.toString(), exception);
        }
    }
}

