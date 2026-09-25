/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.tasks.StartAsyncLoginTask;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_133;
import com.nickuc.login.NLoginCore_118;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_367;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_581;
import com.nickuc.login.NLoginCore_042;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_563;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_299;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_310;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_418;
import com.nickuc.login.NLoginCore_199;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_015 {
    private static int bq;
    private static int as;
    private static int h;
    private static int bl;
    private static int cl;
    private static int bg;
    private static int af;
    private static int co;
    private static int bf;
    private static int ag;
    private final NLoginCore_310 var_com_nickuc_login_NLoginType_005_b;
    private static int i;
    private static int ck;
    private static long cd;
    private static int bo;
    private static long k;
    private static long cm;
    private static long z;
    private static int av;
    private static int cu;
    private static int v;
    private static long bs;
    private static int ap;
    private static int var_int_a;
    private static int cz;
    private static long bj;
    private static int cr;
    private static long ba;
    private static int ai;
    private static int j;
    private static int bz;
    private static long cj;
    private static int cx;
    private static int ao;
    private static int bu;
    private static int aq;
    private static long cn;
    private static long var_long_c;
    private static long ct;
    private static int o;
    private static int da;
    private static int bb;
    private static long bd;
    private static int at;
    private static int ae;
    private static int cb;
    private static int cv;
    private static String[] var_java_lang_String_arr_b;
    private static int al;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_d;
    private static int var_int_b;
    private static int t;
    private static int ar;
    private static int ac;
    private static int ad;
    private static int q;
    private static int n;
    private static int ab;
    private static int bw;
    private static int ah;
    private static int bh;
    private static int bc;
    private static int x;
    private static String[] var_java_lang_String_arr_a;
    private static int s;
    private static int ay;
    private static int br;
    private static int ch;
    private static int bx;
    private static int ak;
    private static int cf;
    private static int e;
    private static int cq;
    private static long w;
    private static long y;
    private static long p;
    private static long cp;
    private static long bm;
    private static long ci;
    private static int bn;
    private static int r;
    private static int l;
    private static int g;
    private static int aa;
    private static int by;
    private static long an;
    private static int u;
    private static long be;
    private static int aj;
    private static long cy;
    private static int au;
    private static int bv;
    private static long cw;
    private static int var_int_c;
    private static long cc;
    private static int bi;
    private static int am;
    private static int bk;
    private static int ce;
    private static int bp;
    private static long cg;
    private static long bt;
    private static int ca;
    private static int m;
    private static long ax;
    private static int var_int_d;
    private static int f;
    private static int cs;
    private static long aw;
    private static long az;

    static {
        var_int_a = (32 >>> 197 | 32 << -197) & 0xFFFFFFFF;
        var_int_b = (0 >>> 225 | 0 << ~225 + 1) & 0xFFFFFFFF;
        var_int_c = (0 >>> 194 | 0 << ~194 + 1) & 0xFFFFFFFF;
        var_int_d = 0 >>> 185 | 0 << ~185 + 1;
        e = Integer.reverse(0);
        f = Integer.reverse(0);
        g = 0x4000000 >>> 56 | 0x4000000 << ~56 + 1;
        h = Integer.reverse(0);
        i = 0 >>> 125 | 0 << -125;
        j = (-1 >>> 224 | -1 << -224) & 0xFFFFFFFF;
        k = Long.reverse(4947871273982203747L);
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Integer.reverse(0);
        n = 0x40000000 >>> 61 | 0x40000000 << ~61 + 1;
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Long.reverse(4947871273982203747L);
        q = Integer.reverse(-1073741824);
        r = 16384 >>> 238 | 16384 << ~238 + 1;
        s = Integer.reverse(0);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = (8 >>> 2 | 8 << -2) & 0xFFFFFFFF;
        v = Integer.reverse(-1);
        w = Long.reverse(4947871273982203747L);
        x = (-1073741824 >>> 126 | -1073741824 << -126) & 0xFFFFFFFF;
        y = Long.reverse(9127211728182024035L);
        z = Long.reverse(0x3A00000000000000L);
        aa = 0 >>> 233 | 0 << -233;
        ab = (0 >>> 147 | 0 << ~147 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = (0 >>> 235 | 0 << -235) & 0xFFFFFFFF;
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = (0 >>> 212 | 0 << ~212 + 1) & 0xFFFFFFFF;
        ag = 524288 >>> 51 | 524288 << ~51 + 1;
        ah = Integer.reverse(Integer.MIN_VALUE);
        ai = Integer.reverse(0);
        aj = 64 >>> 37 | 64 << ~37 + 1;
        ak = (0 >>> 176 | 0 << -176) & 0xFFFFFFFF;
        al = Integer.reverse(0);
        am = (0x20000000 >>> 59 | 0x20000000 << ~59 + 1) & 0xFFFFFFFF;
        an = Long.reverse(4947871273982203747L);
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        aq = 1024 >>> 10 | 1024 << ~10 + 1;
        ar = Integer.reverse(0);
        as = (524288 >>> 211 | 524288 << -211) & 0xFFFFFFFF;
        at = Integer.reverse(Integer.MIN_VALUE);
        au = (0 >>> 235 | 0 << ~235 + 1) & 0xFFFFFFFF;
        av = Integer.reverse(-1610612736);
        aw = Long.reverse(9127211728182024035L);
        ax = Long.reverse(0x3A00000000000000L);
        ay = Integer.reverse(0x60000000);
        az = Long.reverse(9127211728182024035L);
        ba = Long.reverse(0x3A00000000000000L);
        bb = Integer.reverse(0);
        bc = 1792 >>> 40 | 1792 << -40;
        bd = Long.reverse(9127211728182024035L);
        be = Long.reverse(0x3A00000000000000L);
        bf = Integer.reverse(0);
        bg = (0 >>> 130 | 0 << -130) & 0xFFFFFFFF;
        bh = (0x100000 >>> 49 | 0x100000 << -49) & 0xFFFFFFFF;
        bi = Integer.reverse(-1);
        bj = Long.reverse(4947871273982203747L);
        bk = Integer.reverse(-1879048192);
        bl = -1 >>> 84 | -1 << -84;
        bm = Long.reverse(4947871273982203747L);
        bn = Integer.reverse(0);
        bo = Integer.reverse(0);
        bp = (0 >>> 5 | 0 << ~5 + 1) & 0xFFFFFFFF;
        bq = Integer.reverse(0);
        br = Integer.reverse(0x50000000);
        bs = Long.reverse(9127211728182024035L);
        bt = Long.reverse(0x3A00000000000000L);
        bu = (0 >>> 125 | 0 << ~125 + 1) & 0xFFFFFFFF;
        bv = 0 >>> 142 | 0 << -142;
        bw = 4 >>> 162 | 4 << ~162 + 1;
        bx = (0x10000000 >>> 252 | 0x10000000 << ~252 + 1) & 0xFFFFFFFF;
        by = Integer.reverse(Integer.MIN_VALUE);
        bz = 0 >>> 26 | 0 << ~26 + 1;
        ca = Integer.reverse(0);
        cb = (-2147483643 >>> 159 | -2147483643 << ~159 + 1) & 0xFFFFFFFF;
        cc = Long.reverse(9127211728182024035L);
        cd = Long.reverse(0x3A00000000000000L);
        ce = 12 >>> 96 | 12 << ~96 + 1;
        cf = Integer.reverse(-1);
        cg = Long.reverse(4947871273982203747L);
        ch = Integer.reverse(-1342177280);
        ci = Long.reverse(9127211728182024035L);
        cj = Long.reverse(0x3A00000000000000L);
        ck = (0 >>> 251 | 0 << -251) & 0xFFFFFFFF;
        cl = Integer.reverse(0x70000000);
        cm = Long.reverse(9127211728182024035L);
        cn = Long.reverse(0x3A00000000000000L);
        co = (960 >>> 70 | 960 << -70) & 0xFFFFFFFF;
        cp = Long.reverse(4947871273982203747L);
        cq = (0 >>> 133 | 0 << -133) & 0xFFFFFFFF;
        cr = Integer.reverse(0x8000000);
        cs = (-1 >>> 233 | -1 << ~233 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(4947871273982203747L);
        cu = 0x2200000 >>> 149 | 0x2200000 << -149;
        cv = -1 >>> 206 | -1 << -206;
        cw = Long.reverse(4947871273982203747L);
        cx = 36 >>> 1 | 36 << -1;
        cy = Long.reverse(4947871273982203747L);
        cz = Integer.reverse(-939524096);
        da = Integer.reverse(-939524096);
        var_java_lang_String_arr_a = new String[cz];
        var_java_lang_String_arr_b = new String[da];
        NLoginType_015.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_015.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.B("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 66), NLoginType_015.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.F("ԳՀԿԂՂԾԹՂՍԼԉՇՋՄՇՍԏࡴࢨࢧࢡࢦࢣࢬࢩࢌԤ", (byte)20, 70) + string + NLoginCore_387.D("Ы", (byte)20, 68) + methodType.toString(), exception);
        }
    }

    public void b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        Object object;
        Object object2;
        boolean bl;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        NLoginCore_5092.a(NLoginCore_567.A);
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z, (Object)e);
        if (this.var_com_nickuc_login_NLoginType_008_d.L()) {
            object6 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_d.c();
            object5 = object6.com_nickuc_login_NLoginCore_199_a();
            Object[] objectArray = new Object[g];
            objectArray[NLoginType_015.h] = NLoginType_015.c("㺀", (int)(i & j), (long)k);
            objectArray[NLoginType_015.l] = m;
            objectArray[NLoginType_015.n] = NLoginType_015.c("㺃", (int)o, (long)p);
            objectArray[NLoginType_015.q] = BCryptHashProvider.aD();
            ((NLoginCore_199)object5).c(NLoginCore_277, f, objectArray);
        }
        object6 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (NLoginCore_596.var_com_nickuc_login_NLoginCore_363_a.ar() && this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b && ((ForceRegisterConfig)object6).com_nickuc_login_NLoginCore_335_a().m() == null && (object4 = ((NLoginCore_299)(object5 = (NLoginCore_299)this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginInterface_030_b())).com_nickuc_login_NLoginCore_563_a()) != null && (object3 = ((NLoginCore_563)object4).a(NLoginCore_277.java_util_UUID_a())) != null) {
            ((ForceRegisterConfig)object6).com_nickuc_login_NLoginCore_335_a().c((String)object3);
            NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[r];
            NLoginCore_436Array[NLoginType_015.s] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
            this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_291_a().a((ForceRegisterConfig)object6, NLoginCore_436Array);
        }
        if (!(bl = ((ForceRegisterConfig)object6).boolean_A())) {
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && ((ForceRegisterConfig)object6).t()) {
                this.var_com_nickuc_login_NLoginType_005_b.b((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092);
                return;
            }
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_k.ar() && ((ForceRegisterConfig)object6).u() && NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e)) {
                this.var_com_nickuc_login_NLoginType_005_b.c((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092);
                return;
            }
            object4 = NLoginCore_277.ac();
            switch (NLoginCore_133.c[this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_291_a().com_nickuc_login_NLoginCore_244_a((ForceRegisterConfig)object6, (String)object4).ordinal()]) {
                case 1: {
                    this.var_com_nickuc_login_NLoginType_005_b.a((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092);
                    return;
                }
                case 2: {
                    NLoginCore_5092.a(NLoginCore_567.B, (Object)(t != 0));
                }
            }
        }
        if (NLoginCore_5092.a(NLoginCore_567.C)) {
            NLoginCore_370.b((String)NLoginType_015.c("㺆", (int)(u & v), (long)w) + NLoginCore_277.getName() + (String)NLoginType_015.c("㺉", (int)x, (long)(y ^ z)), new Object[aa]);
            this.var_com_nickuc_login_NLoginType_005_b.a((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092, null, NLoginCore_5092.d(NLoginCore_567.C), ab != 0);
            return;
        }
        object4 = NLoginCore_5092.com_nickuc_login_NLoginInterface_017_a();
        object3 = object4.com_nickuc_login_NLoginCore_042_a();
        if (object3 != null) {
            if (bl) {
                this.var_com_nickuc_login_NLoginType_005_b.a((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092, ((NLoginCore_042)object3).au(), ((NLoginCore_042)object3).av(), ac != 0, ad != 0);
            } else {
                this.var_com_nickuc_login_NLoginType_005_b.a((ForceRegisterConfig)object6, NLoginCore_277, NLoginCore_5092, ((NLoginCore_042)object3).au(), ae != 0, af != 0);
            }
            return;
        }
        int n = ag;
        if (NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e)) {
            object2 = this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
            if (object2 instanceof NLoginCore_418) {
                object = (NLoginCore_418)object2;
                NLoginCore_118 NLoginCore_118 = ((NLoginCore_418)object).a();
                if (NLoginCore_118 != null) {
                    n = !(!bl ? NLoginCore_118.boolean_a(NLoginCore_277, NLoginCore_5092, (ForceRegisterConfig)object6) : NLoginCore_118.boolean_b(NLoginCore_277, NLoginCore_5092, (ForceRegisterConfig)object6)) ? ah : ai;
                }
                NLoginCore_5092.a(NLoginCore_567.A, (Object)(NLoginCore_532.E.r() * aj));
            }
        } else if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() == NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d && (object = ((NLoginCore_581)(object2 = this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_581_b())).com_nickuc_login_lib_packetevents_api_protocol_player_User_a(NLoginCore_277)).getClientVersion().isNewerThanOrEquals(ClientVersion.V_1_21_6) && ((NLoginCore_581)object2).a((User)object).isNewerThanOrEquals(ClientVersion.V_1_21_6)) {
            if (bl) {
                ((NLoginCore_581)object2).a().a((User)object, NLoginCore_5092.d(), null);
            } else {
                ((NLoginCore_581)object2).a().a((User)object, NLoginCore_5092.d(), NLoginCore_367.a(this.var_com_nickuc_login_NLoginType_008_d, (ForceRegisterConfig)object6), null);
            }
            n = ak;
        }
        if (n != 0) {
            this.c(NLoginCore_277, NLoginCore_5092, bl);
        }
        if (object4.f()) {
            NLoginCore_466.var_com_nickuc_login_NLoginCore_466_i.a(NLoginCore_277, NLoginCore_5092, new String[al]);
        }
        object2 = this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginCore_033_a();
        object = (byte[])NLoginCore_5092.d(NLoginCore_567.N);
        if (object2 != null && object != null) {
            int n2 = !((ForceRegisterConfig)object6).com_nickuc_login_NLoginCore_407_a().boolean_c((String)NLoginType_015.c("㺌", (int)am, (long)an)) ? ao : ap;
            ((NLoginCore_033)object2).a(NLoginCore_277, (byte[])object, n2 != 0, (!bl ? aq : ar) != 0);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x5CL;
        l ^= 0x171C232243477408L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(11 + 58), (byte)(57 + 26), (byte)(12 + 35), (byte)(41 + 26), (byte)(52 + 14), (byte)(13 + 54), (byte)(12 + 35), 80, (byte)(11 + 64), (byte)(35 + 32), (byte)(49 + 34), (byte)(34 + 19), (byte)(22 + 58), (byte)(95 + 2), (byte)(89 + 11), (byte)(67 + 33), 105, (byte)(26 + 84), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(45 + 38)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.B("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎҳӧӦӠӥӢӫӨӋ", (byte)72, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_015.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void b(NLoginCore_277 NLoginCore_277, boolean bl) {
        if (NLoginCore_277 == null || !NLoginCore_277.R()) {
            return;
        }
        if (!bl) {
            this.var_com_nickuc_login_NLoginType_008_d.b(as != 0).a(new StartAsyncLoginTask(() -> {
                if (!NLoginCore_277.R()) {
                    return;
                }
                NLoginCore_509 NLoginCore_5092 = this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
                if (NLoginCore_5092 == null) {
                    NLoginCore_370.c((String)NLoginType_015.c("㺀", (int)(ce & cf), (long)cg) + NLoginCore_277.getName() + (String)NLoginType_015.c("㺃", (int)ch, (long)(ci ^ cj)), new Object[ck]);
                    return;
                }
                if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().d(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_b)) {
                    return;
                }
                try {
                    this.b(NLoginCore_277);
                    boolean bl = this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginCore_423_a().boolean_a(NLoginCore_277, NLoginCore_5092);
                    NLoginCore_5092.a(bl ? NLoginCore_077.var_com_nickuc_login_NLoginCore_077_c : NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_b);
                    if (!bl) {
                        this.b(NLoginCore_277, NLoginCore_5092);
                    }
                    LoginMainQueueTask.m(NLoginCore_277);
                }
                catch (Throwable throwable) {
                    NLoginCore_370.c((String)NLoginType_015.c("㺆", (int)cl, (long)(cm ^ cn)) + NLoginCore_277.getName() + (String)NLoginType_015.c("㺉", (int)co, (long)cp), throwable, new Object[cq]);
                    NLoginCore_277.a((String)NLoginType_015.c("㺌", (int)(cr & cs), (long)ct));
                }
            }));
        }
    }

    private static void b() {
        int n;
        var_long_c = -4113607188004842114L;
        long l = var_long_c ^ 0x171C232243477408L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(3 + 66), (byte)(50 + 33), (byte)(13 + 34), (byte)(20 + 47), (byte)(14 + 52), 67, (byte)(16 + 31), 80, (byte)(30 + 45), (byte)(3 + 64), (byte)(3 + 80), (byte)(43 + 10), (byte)(47 + 33), (byte)(8 + 89), (byte)(36 + 64), (byte)(25 + 75), (byte)(80 + 25), (byte)(80 + 30), (byte)(52 + 51)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_015.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ԔԠӿԩԸԓԐԶӹԻԅԂ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ջյՎ֋ֆ։թգաֈզ՛", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[2] = NLoginCore_004.A("ƃơƢťƊƗơŻƆƯƮƝƃƝƈƄƦơŪūƻƩƀƁ", (byte)87, 65);
                    NLoginType_015.var_java_lang_String_arr_b[3] = NLoginCore_575.D("ԦԒӱԠԀԀӰԑԒӻԕӽԫԷӷԜԵԐՁԠӿԶԍԎ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[4] = NLoginCore_027.D("ԎӯԫԣӵԱԐԍԩԩԾӷӸԮӽՁԯԭԏԅԄՆԍԎ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[5] = NLoginCore_004.C("ԁԟӯԪԨԬԌԱӭԐԩԗԎԒԺԵԕԢԢՂԣՅՃԩԢՅԵԟՐԆԲԎԣԮԥԕՁՂՈԕՋԸԓՍՉԷԗԡՄԞԻ԰Ծթ՘ԣԷԨԬՁեխԽաԪԫիՃ԰ՃՐԲռկՙՂ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[6] = NLoginCore_451.C("ԯԋӭԦԤԓԴԤԎԏԙԂ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[7] = NLoginCore_427.F("ՔՃ՞տագՎւագֈՎֈ֌չյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։֐գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡׉֋ׇ֣֦֩־֎וְׇ֕֨גׅך׎ֺמ׊סֽ֢֝֗־נ׃םץם", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[8] = NLoginCore_384.E("՝ֈՎ՛հթ՝ֈէօ֖ճժ֓և։ն֌զ՟ձ֏զէ", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[9] = NLoginCore_453.D("ԎԃԤԡԭԤԆԒԒӴԶӻԑԜԍԱԭӼԑԁԤԠԍԎ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[10] = NLoginCore_091.F("՝ֈՎ՛հթ՝ֈէօ֖ճժ֓և։ն֌զ՟ձ֏զէ", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[11] = NLoginCore_387.F("ՌտՖլքէկՊյզժ՛", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[12] = NLoginCore_173.E("ը֋ժ֏ՠռՈ՜֒հ։ՎՖմ֘֘էծ֝՟֡տղգպգւպր֘չբ֕գօխզ֧֤֮տ֋մւմ֎ֆ֐֜֜ջֹ֛։ֆև", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[13] = NLoginCore_451.A("ƘŻƢƒƋŹūŵŬƎŪƆƎƒƧůſƗƖƅƆƹƜżƉƺưƠƸƀžƘƖƿǆƠƠƄƿſƤǍƏƕ", (byte)87, 65);
                    NLoginType_015.var_java_lang_String_arr_b[14] = NLoginCore_173.C("ԁԟӯԪԨԬԌԱӭԐԩԗԎԒԺԵԕԢԢՂԣՅՃԩԢՅԵԟՐԆԲԎԣԮԥԕՁՂՈԕՋԸԓԛ՜ԟԭ՟՜Ֆԯԣ՟էՄ՛ԹՇԟ՗ԼձԱԪեհԴՑոշԴԱ՘ՈՖտԾ՚իտվՍ՘ՔքևֈՊբց՟՛Վի֋կ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[15] = NLoginCore_027.F("ֈդՆտսլ֍սէըղ՛", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[16] = NLoginCore_559.F("ՔՃ՞տագՎւագֈՎֈ֌չյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։֐գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡׉֋ׇ֣֦֩־֎וְׇ֕֨גׅך׎ֺמ׊סֽ֢֝֗־נ׃םץם", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[17] = NLoginCore_324.D("ԏԟԖԁԪԄӸԧԩԶӴԂ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[18] = NLoginCore_076.A("ƖƇŦťŧŝƊƃƫũƅũžƄƃƇƋƸƒƧƑƃƀƁ", (byte)87, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_015.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ťƂƃƟƒƖƣŷƟƜƄƎƳųƟƯƠƊƅƗƊƃƀƁ", (byte)87, 66);
                    NLoginType_015.var_java_lang_String_arr_b[1] = NLoginCore_453.B("ŸƏŸųƟƕƅƁŭƉŸƥŬƌƲƶƉƷƖƇŹƓƀƁ", (byte)87, 66);
                    NLoginType_015.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ԐԮԯӲԗԤԮԈԓԼԽԳԻӺԠԭԴԡԹՃԿՆԍԎ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[3] = NLoginCore_201.D("ԦԒӱԠԀԀӰԑԒӻԘԸԹԔԠԏԕԏԓԆՈԐԍԎ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ԎӯԫԣӵԱԐԍԩԩԽԧԚԗԼՁԎԵԝԙԛԠԍԎ", (byte)87, 67);
                    NLoginType_015.var_java_lang_String_arr_b[5] = NLoginCore_110.E("՚ոՈփցօե֊Նթւհէի֓֎ծջջ֛ռ֞֜ւջ֞֎ո֩՟֋էռևվծ֛֚֡ծ֤֑լ֦֢֐հպ֝շ֔։ֱׂ֗ռ֐ցօ֚־׆ֺ֖֊֫֞֊և֮ֈ֍ׂ֋֛֕", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[6] = NLoginCore_091.E("սՋՆցՍՍ֐ւ՟ՠծ՛", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[7] = NLoginCore_027.E("ՔՃ՞տագՎւագֈՎֈ֌չյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։֐գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡׉֋ׇ֣֦֩־֎וְׇ֕֨גׅך׎ֺמ׊ןם׍ֶַֻ֗אִ֥ף׆כׂ׃סְױ׊׆ױ׬ֻ", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[8] = NLoginCore_004.F("՝ֈՎ՛հթ՝ֈէօ֕Փճդ֑֋ո֜֌֐ծւ՚֛֗յ՟֦ձ֨֡ո", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[9] = NLoginCore_091.F("է՜սպֆս՟իիՍ֎ֈշը֓֏֗՛֞։՟չզէ", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[10] = NLoginCore_092.F("՝ֈՎ՛հթ՝ֈէօ֗ֆւն֌մՎպկլղշ֖֑֕՝֒֏ևմՠա", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[11] = NLoginCore_575.E("ըփնը։՟ըՍՊև֌՛", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[12] = NLoginCore_575.D("ԏԲԑԶԇԣӯԃԹԗ԰ӵӽԛԿԿԎԕՄԆՈԦԙԊԡԊԩԡԧԿԠԉԼԊԬԔԍՎՕՋԦԲԚ՞ԚԼԠԡՒԾ԰ԜԻՀԭԮ", (byte)87, 68);
                    NLoginType_015.var_java_lang_String_arr_b[13] = NLoginCore_138.A("ƘŻƢƒƋŹūŵŬƎŪƆƎƒƧůſƗƖƅƆƹƜżƉƺưƠƸƀžƘƛƂƲƔƨǋƾǈƝǐƠƕ", (byte)87, 65);
                    NLoginType_015.var_java_lang_String_arr_b[14] = NLoginCore_453.F("՚ոՈփցօե֊Նթւհէի֓֎ծջջ֛ռ֞֜ւջ֞֎ո֩՟֋էռևվծ֛֚֡ծ֤֑լմֵոֆֵָ֯ֈռָ׀ִ֝֒֠ոְ֕׊֊փ־׉֍֪בא֍֊ֱ֡֯טֳ֗ׄטחֱ֦֭םנֱֳב׃זי֧ׄ־י", (byte)87, 70);
                    NLoginType_015.var_java_lang_String_arr_b[15] = NLoginCore_223.A("ƛƘŽżƛƀƦƮƈůƚŵ", (byte)87, 65);
                    NLoginType_015.var_java_lang_String_arr_b[16] = NLoginCore_453.B("ŮŝŸƙŻŽŨƜŻŽƢŨƢƦƓƏųƆƉŵŶƇƛŷƿƍǁƒƳƏƛƃżƞƵƣƪŽƭƸƆƉǐƾƳƿƎƌƳƢƴƗƷǎǎǖǑǊǟƴƫǃǟǑƻǣƥƽǃǀǡǘƨǯǡǊƯǂǬǟǴǨǔǸǤƳǤǧƷǿǍǢǸǯƻǞǁǛȇǸǊǊǠǟǩȅǨǕ", (byte)87, 66);
                    NLoginType_015.var_java_lang_String_arr_b[17] = NLoginCore_559.E("փ֋֋ըօֆևՍհփևՍէծք֎և՘֗՛ճչզէ", (byte)87, 69);
                    NLoginType_015.var_java_lang_String_arr_b[18] = NLoginCore_575.A("ƖƇŦťŧŝƊƃƫũƄƁūƮƜƂŮƠƧƬƤƹƀƁ", (byte)87, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_015.var_java_lang_String_arr_b[0] = NLoginCore_223.F("Չւ՞֏սաւժ֊մղյլճ֓՗Օ֜֔ևխյ֛յփրսե֜զ֧ը", (byte)87, 70);
                    continue block7;
                }
                case 4: {
                    NLoginType_015.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ťšƂŴƥƞƜſƘƥƁƦŪƠŭƦƔƷŶƺźƓƀƁ", (byte)87, 65);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        try {
            Object object = NLoginCore_5092.var_java_lang_Object_n;
            synchronized (object) {
                if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_b)) {
                    return;
                }
                NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_b, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_a);
                Object[] objectArray = new Object[at];
                objectArray[NLoginType_015.au] = NLoginCore_277;
                if (this.var_com_nickuc_login_NLoginType_008_d.a(EventEnum.LOGIN_REQUEST, objectArray)) {
                    this.var_com_nickuc_login_NLoginType_005_b.b(NLoginCore_277, NLoginCore_5092, NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a().w());
                } else {
                    NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_a, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_b);
                }
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_015.c("㺀", (int)av, (long)(aw ^ ax)) + NLoginCore_277.getName() + (String)NLoginType_015.c("㺃", (int)ay, (long)(az ^ ba)), throwable, new Object[bb]);
            NLoginCore_277.a((String)NLoginType_015.c("㺆", (int)bc, (long)(bd ^ be)));
        }
    }

    public boolean a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2, UUID uUID, boolean bl, InetSocketAddress inetSocketAddress) {
        if (!NLoginCore_592.var_com_nickuc_login_NLoginCore_532_c.ar()) {
            return bf != 0;
        }
        NLoginCore_248[] NLoginCore_311Array = NLoginCore_248.values();
        int n = NLoginCore_311Array.length;
        for (int i = bg; i < n; ++i) {
            NLoginCore_248 NLoginCore_3112 = NLoginCore_311Array[i];
            if (!NLoginCore_3112.d(this.var_com_nickuc_login_NLoginType_008_d)) continue;
            if (NLoginCore_3112.java_lang_String_b(ForceRegisterConfig2) != null) {
                String string;
                NLoginCore_560 NLoginInterface_0382 = NLoginCore_3112.com_nickuc_login_NLoginInterface_038_a(this.var_com_nickuc_login_NLoginType_008_d);
                if (!NLoginInterface_0382.aF()) continue;
                if (!(NLoginCore_277.i((String)NLoginType_015.c("㺀", (int)(bh & bi), (long)bj) + NLoginCore_3112.getName()) || NLoginCore_277.i((String)NLoginType_015.c("㺃", (int)(bk & NLoginType_015.bl), (long)bm) + NLoginCore_3112.getName()) || (string = ForceRegisterConfig2.k()) != null && !string.equals(inetSocketAddress.getAddress().getHostAddress()))) {
                    return bn != 0;
                }
                if (!NLoginCore_3112.e(ForceRegisterConfig2)) continue;
                return bo != 0;
            }
            if (!NLoginCore_3112.aJ()) continue;
            if (!ForceRegisterConfig2.t() || NLoginCore_3112.aK()) {
                return bp != 0;
            }
            if (!ForceRegisterConfig2.u() || NLoginCore_3112.aL()) {
                return bq != 0;
            }
            if (NLoginCore_277.i((String)NLoginType_015.c("㺆", (int)br, (long)(bs ^ bt)) + NLoginCore_3112.getName())) continue;
            return bu != 0;
        }
        if (ForceRegisterConfig2.boolean_A()) {
            return bv != 0;
        }
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && ForceRegisterConfig2.t()) {
            return bl;
        }
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_k.ar() && NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e)) {
            return bw != 0;
        }
        switch (NLoginCore_133.c[this.var_com_nickuc_login_NLoginType_008_d.com_nickuc_login_NLoginCore_291_a().com_nickuc_login_NLoginCore_244_a(ForceRegisterConfig2, inetSocketAddress.getAddress().getHostAddress()).ordinal()]) {
            case 1: {
                return bx != 0;
            }
            case 2: {
                NLoginCore_5092.a(NLoginCore_567.B, (Object)(by != 0));
                return bz != 0;
            }
        }
        return ca != 0;
    }

    public void c(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_x, (Object)(var_int_a != 0));
        NLoginCore_150.a(NLoginCore_277, bl ? NLoginCore_508.var_com_nickuc_login_NLoginCore_508_b : NLoginCore_508.var_com_nickuc_login_NLoginCore_508_a, new Object[var_int_b]);
        NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
        if (bl) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.e, string -> NLoginInterface_0242.e((String)string, (String)NLoginType_015.c("㺀", (int)cx, (long)cy)), new Object[var_int_c]);
        } else {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.d, string -> NLoginInterface_0242.e((String)string, (String)NLoginType_015.c("㺀", (int)(cu & cv), (long)cw)), new Object[var_int_d]);
        }
    }

    private void b(NLoginCore_277 NLoginCore_277) {
        NLoginCore_277.o((String)NLoginType_015.c("㺀", (int)cb, (long)(cc ^ cd)));
        NLoginCore_277.ad();
    }

    @Generated
    public NLoginType_015(NLoginType_008 NLoginType_008, NLoginCore_310 NLoginType_0052) {
        this.var_com_nickuc_login_NLoginType_008_d = NLoginType_008;
        this.var_com_nickuc_login_NLoginType_005_b = NLoginType_0052;
    }
}

