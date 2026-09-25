/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
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
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_365;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_275
extends NLoginCore_400 {
    private static int dr;
    private static int ek;
    private static int dt;
    private static long br;
    private static long aj;
    private static long ca;
    private static int ec;
    private static long u;
    private static int bz;
    private final NLoginCore_036 b;
    private static int dw;
    private static long bm;
    private static long as;
    private static int bj;
    private static int dq;
    private static int az;
    private static long be;
    private static int dk;
    private static long am;
    private static int fp;
    private static long i;
    private static long df;
    private static int dn;
    private static long dy;
    private static long cz;
    private static int dl;
    private static int cm;
    private static long fc;
    private static long cd;
    private static int bn;
    private static int cv;
    private static long ap;
    private static int t;
    private static int cfr_renamed_1;
    private static long bo;
    private static int bw;
    private static int cg;
    private static String[] var_java_lang_String_arr_c;
    private static int dh;
    private static long ck;
    private static int cs;
    private static int bx;
    private static int em;
    private static long ff;
    private static long dg;
    private static long aa;
    private static long ag;
    private static int fd;
    private static int db;
    private static long f;
    private static int w;
    private static int en;
    private static int ae;
    private static long cf;
    private static int co;
    private static int fs;
    private static long cu;
    private static int aq;
    private static int y;
    private static int af;
    private static int ce;
    private static int eu;
    private static int m;
    private static int eq;
    private static int fa;
    private static int fm;
    private static long bk;
    private static int bi;
    private static int cy;
    private static long bh;
    private static long by;
    private static long g;
    private static long cp;
    private static long fg;
    private static int du;
    private static int cr;
    private static int ex;
    private static int bu;
    private static int bc;
    private static long ct;
    private static int s;
    private static int ak;
    private static int fh;
    private static int ar;
    private static long ba;
    private static long eb;
    private static int er;
    private static int ed;
    private static int dd;
    private static int fr;
    private static String[] d;
    private static int var_int_c;
    private static int ey;
    private static long at;
    private final NLoginCore_036 a;
    private static int fl;
    private static long ci;
    private static int z;
    private static long bv;
    private static int da;
    private static int aw;

    static {
        var_int_c = (0 >>> 73 | 0 << -73) & 0xFFFFFFFF;
        g = Long.reverse(-587552241295981910L);
        i = Long.reverse(0x6200000000000000L);
        m = Integer.reverse(0);
        s = 0 >>> 166 | 0 << -166;
        t = (4096 >>> 140 | 4096 << ~140 + 1) & 0xFFFFFFFF;
        u = Long.reverse(-7649196457012919638L);
        w = Integer.reverse(0);
        y = Integer.reverse(0x40000000);
        z = -1 >>> 152 | -1 << -152;
        aa = Long.reverse(-7649196457012919638L);
        ae = (0 >>> 217 | 0 << ~217 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(-1073741824);
        ag = Long.reverse(-587552241295981910L);
        aj = Long.reverse(0x6200000000000000L);
        ak = Integer.reverse(0x20000000);
        am = Long.reverse(-587552241295981910L);
        ap = Long.reverse(0x6200000000000000L);
        aq = Integer.reverse(0);
        ar = 320 >>> 230 | 320 << ~230 + 1;
        as = Long.reverse(-587552241295981910L);
        at = Long.reverse(0x6200000000000000L);
        aw = 0x180000 >>> 210 | 0x180000 << -210;
        az = -1 >>> 92 | -1 << -92;
        ba = Long.reverse(-7649196457012919638L);
        bc = Integer.reverse(-536870912);
        be = Long.reverse(-587552241295981910L);
        bh = Long.reverse(0x6200000000000000L);
        bi = Integer.reverse(0);
        bj = Integer.MIN_VALUE >>> 124 | Integer.MIN_VALUE << -124;
        bk = Long.reverse(-587552241295981910L);
        bm = Long.reverse(0x6200000000000000L);
        bn = 0x48000000 >>> 123 | 0x48000000 << -123;
        bo = Long.reverse(-587552241295981910L);
        br = Long.reverse(0x6200000000000000L);
        bu = Integer.reverse(0x50000000);
        bv = Long.reverse(-7649196457012919638L);
        bw = Integer.reverse(-805306368);
        bx = Integer.reverse(-1);
        by = Long.reverse(-7649196457012919638L);
        bz = 0x30000000 >>> 218 | 0x30000000 << -218;
        ca = Long.reverse(-587552241295981910L);
        cd = Long.reverse(0x6200000000000000L);
        ce = Integer.reverse(-1342177280);
        cf = Long.reverse(-7649196457012919638L);
        cg = 28672 >>> 43 | 28672 << ~43 + 1;
        ci = Long.reverse(-587552241295981910L);
        ck = Long.reverse(0x6200000000000000L);
        cm = 0x780000 >>> 211 | 0x780000 << -211;
        co = Integer.reverse(-1);
        cp = Long.reverse(-7649196457012919638L);
        cr = 0 >>> 194 | 0 << -194;
        cs = Integer.reverse(0x8000000);
        ct = Long.reverse(-587552241295981910L);
        cu = Long.reverse(0x6200000000000000L);
        cv = Integer.reverse(0);
        cy = Integer.reverse(-2013265920);
        cz = Long.reverse(-7649196457012919638L);
        da = Integer.reverse(0);
        db = (0 >>> 166 | 0 << ~166 + 1) & 0xFFFFFFFF;
        dd = (18 >>> 224 | 18 << -224) & 0xFFFFFFFF;
        df = Long.reverse(-587552241295981910L);
        dg = Long.reverse(0x6200000000000000L);
        dh = Integer.reverse(-1073741824);
        dk = 0 >>> 228 | 0 << ~228 + 1;
        dl = Integer.reverse(0);
        dn = Integer.reverse(Integer.MIN_VALUE);
        cfr_renamed_1 = Integer.reverse(0);
        dq = 0x40000000 >>> 157 | 0x40000000 << ~157 + 1;
        dr = Integer.reverse(0);
        dt = 0x100000 >>> 116 | 0x100000 << -116;
        du = Integer.reverse(0x40000000);
        dw = 0x2600000 >>> 245 | 0x2600000 << ~245 + 1;
        dy = Long.reverse(-587552241295981910L);
        eb = Long.reverse(0x6200000000000000L);
        ec = Integer.reverse(-1073741824);
        ed = Integer.reverse(0);
        ek = 0 >>> 141 | 0 << ~141 + 1;
        em = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        en = 0 >>> 80 | 0 << ~80 + 1;
        eq = Integer.reverse(0x40000000);
        er = Integer.reverse(0);
        eu = Integer.reverse(Integer.MIN_VALUE);
        ex = 0x40000000 >>> 189 | 0x40000000 << -189;
        ey = 0x14000000 >>> 120 | 0x14000000 << ~120 + 1;
        fa = (-1 >>> 99 | -1 << -99) & 0xFFFFFFFF;
        fc = Long.reverse(-7649196457012919638L);
        fd = Integer.reverse(-1476395008);
        ff = Long.reverse(-587552241295981910L);
        fg = Long.reverse(0x6200000000000000L);
        fh = 0 >>> 139 | 0 << ~139 + 1;
        fl = Integer.reverse(0);
        fm = Integer.reverse(Integer.MIN_VALUE);
        fp = Integer.reverse(0);
        fr = Integer.reverse(0x68000000);
        fs = Integer.reverse(0x68000000);
        var_java_lang_String_arr_c = new String[fr];
        d = new String[fs];
        NLoginCore_275.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_275.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 66), NLoginCore_275.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲӆҿӎӏӉӐҪӉӔӀӇӐӔҤӏō", (byte)58, 66) + string + NLoginCore_427.D("ҝ", (byte)58, 68) + methodType.toString(), exception);
        }
    }

    public NLoginCore_275(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, NLoginCore_036 NLoginCore_0362, NLoginCore_036 NLoginCore_0363) {
        super(NLoginType_008, NLoginCore_479);
        this.a = NLoginCore_0362;
        this.b = NLoginCore_0363;
    }

    private static String a(int n, long l) {
        l ^= 0x46L;
        l ^= 0x2AB76DFD6F2A6EC8L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(35 + 34), (byte)(77 + 6), (byte)(35 + 12), (byte)(31 + 36), (byte)(62 + 4), (byte)(20 + 47), 47, (byte)(30 + 50), (byte)(33 + 42), (byte)(20 + 47), (byte)(29 + 54), (byte)(20 + 33), 80, (byte)(57 + 40), (byte)(73 + 27), (byte)(85 + 15), (byte)(23 + 82), (byte)(26 + 84), (byte)(46 + 57)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.C("ӛӨӧҪӪӦӡӪӵӤұӯӳӬӯӵҷࡋࡄࡓࡔࡎࡕ࠯ࡎ࡙ࡅࡌࡕ࡙ࠩࡔ", (byte)65, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_275.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        block50: {
            NLoginCore_036 NLoginCore_0362 = this.m.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a().com_nickuc_login_NLoginCore_036_a();
            if (NLoginCore_0362 != this.b && !this.a(NLoginCore_0362)) {
                throw new IllegalStateException((String)NLoginCore_275.c("㺀", (int)var_int_c, (long)(g ^ i)));
            }
            this.d = NLoginCore_523.a((NLoginType_008)this.m, this.a, m != 0);
            String string = NLoginCore_532.e.a(new Object[s]);
            this.void_f(string);
            try {
                Object object;
                Object object2;
                Object object3;
                AutoCloseable autoCloseable;
                NLoginCore_291 NLoginCore_2912 = this.m.com_nickuc_login_NLoginCore_291_a();
                try (AutoCloseable autoCloseable2 = this.d.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_275.c("㺃", (int)t, (long)u) + NLoginCore_532.e.a(new Object[w]) + (String)NLoginCore_275.c("㺆", (int)(y & z), (long)aa), new Object[ae]);){
                    autoCloseable = (ResultSet)((NLoginCore_218)((Object)autoCloseable2)).d();
                    while (autoCloseable.next() && this.m.N()) {
                        object3 = null;
                        try {
                            object2 = NLoginCore_2912.a((ResultSet)autoCloseable);
                            if (object2 == null) {
                                throw new Exception((String)NLoginCore_275.c("㺉", (int)af, (long)(ag ^ aj)) + (Object)((Object)this.a) + (String)NLoginCore_275.c("㺌", (int)ak, (long)(am ^ ap)));
                            }
                            object3 = ((ForceRegisterConfig)object2).i();
                            object = NLoginCore_2912.a(((ForceRegisterConfig)object2).i(), ((ForceRegisterConfig)object2).getMojangId(), ((ForceRegisterConfig)object2).getBedrockId(), aq != 0);
                            if (object == null) {
                                throw new Exception((String)NLoginCore_275.c("㺏", (int)ar, (long)(as ^ at)) + (String)object3 + (String)NLoginCore_275.c("㺒", (int)(aw & az), (long)ba) + (Object)((Object)this.b) + (String)NLoginCore_275.c("㺕", (int)bc, (long)(be ^ bh)));
                            }
                            if (((ForceRegisterConfig)object).boolean_h()) continue;
                            if (!NLoginCore_2912.a((NLoginCore_459)((Object)this.a), (ForceRegisterConfig)object2, new NLoginCore_436[bi])) {
                                throw new Exception((String)NLoginCore_275.c("㺘", (int)bj, (long)(bk ^ bm)) + (String)object3 + (String)NLoginCore_275.c("㺛", (int)bn, (long)(bo ^ br)) + (Object)((Object)this.b) + (String)NLoginCore_275.c("㺞", (int)bu, (long)bv));
                            }
                            ++this.k;
                        }
                        catch (Exception exception) {
                            NLoginCore_370.b((String)NLoginCore_275.c("㺡", (int)(bw & bx), (long)by) + ((NLoginCore_531)((Object)this.a)).getName() + (String)NLoginCore_275.c("㺤", (int)bz, (long)(ca ^ cd)) + (String)(object3 == null ? NLoginCore_275.c("㺧", (int)ce, (long)cf) : (String)object3 + (String)NLoginCore_275.c("㺪", (int)cg, (long)(ci ^ ck))) + (String)NLoginCore_275.c("㺭", (int)(cm & co), (long)cp), exception, new Object[cr]);
                        }
                        finally {
                            ++this.l;
                        }
                    }
                }
                autoCloseable2 = this.d.com_nickuc_login_NLoginCore_365_a();
                try {
                    autoCloseable = ((NLoginCore_365)autoCloseable2).b();
                    object3 = autoCloseable.prepareStatement((String)NLoginCore_275.c("㺰", (int)cs, (long)(ct ^ cu)) + NLoginCore_532.r.a(new Object[cv]) + (String)NLoginCore_275.c("㺳", (int)cy, (long)cz));
                    try {
                        try {
                            object2 = object3.executeQuery();
                        while (true) {
                            if (!object2.next() || !this.m.N()) break block50;
                            object = object2.getString(NLoginCore_532.t.a(new Object[da]));
                            byte[] byArray = object2.getBytes(NLoginCore_532.u.a(new Object[db]));
                            try {
                                Object[] objectArray = new Object[dh];
                                objectArray[NLoginCore_275.dk] = NLoginCore_532.r.a(new Object[dl]);
                                objectArray[NLoginCore_275.dn] = NLoginCore_532.u.a(new Object[cfr_renamed_1]);
                                objectArray[NLoginCore_275.dq] = NLoginCore_532.t.a(new Object[dr]);
                                try (PreparedStatement preparedStatement = autoCloseable.prepareStatement(String.format((String)NLoginCore_275.c("㺶", (int)dd, (long)(df ^ dg)), objectArray));){
                                    preparedStatement.setBytes(dt, byArray);
                                    preparedStatement.setString(du, (String)object);
                                    int n = preparedStatement.executeUpdate();
                                    if (n != 0) continue;
                                    Object[] objectArray2 = new Object[ec];
                                    objectArray2[NLoginCore_275.ed] = NLoginCore_532.r.a(new Object[ek]);
                                    objectArray2[NLoginCore_275.em] = NLoginCore_532.t.a(new Object[en]);
                                    objectArray2[NLoginCore_275.eq] = NLoginCore_532.u.a(new Object[er]);
                                    PreparedStatement preparedStatement2 = autoCloseable.prepareStatement(String.format((String)NLoginCore_275.c("㺹", (int)dw, (long)(dy ^ eb)), objectArray2));
                                    try {
                                        preparedStatement2.setString(eu, (String)object);
                                        preparedStatement2.setBytes(ex, byArray);
                                        preparedStatement2.execute();
                                    }
                                    finally {
                                        if (preparedStatement2 == null) continue;
                                        preparedStatement2.close();
                                    }
                                }
                            }
                            catch (Exception exception) {
                                throw new RuntimeException((String)NLoginCore_275.c("㺼", (int)(ey & fa), (long)fc) + (String)object + (String)NLoginCore_275.c("㺿", (int)fd, (long)(ff ^ fg)), exception);
                            }
                        }
                    }
                    finally {
                            if (object2 != null) {
                                object2.close();
                            }
                        }
                    }
                    finally {
                        if (object3 != null) {
                            object3.close();
                        }
                    }
                }
                finally {
                    if (Collections.singletonList(autoCloseable2).get(fh) != null) {
                        ((NLoginCore_365)autoCloseable2).close();
                    }
                }
            }
            finally {
                this.d.void_c();
            }
        }
        this.c(NLoginInterface_0422);
    }

    private static void void_b() {
        int n;
        f = 6143342406115335151L;
        long l = f ^ 0x2AB76DFD6F2A6EC8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(2 + 67), 83, (byte)(8 + 39), (byte)(42 + 25), (byte)(55 + 11), (byte)(54 + 13), (byte)(11 + 36), (byte)(2 + 78), (byte)(51 + 24), (byte)(60 + 7), (byte)(71 + 12), (byte)(42 + 11), (byte)(7 + 73), (byte)(90 + 7), (byte)(91 + 9), (byte)(41 + 59), (byte)(60 + 45), (byte)(100 + 10), (byte)(90 + 13)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(74 + 9)}, StandardCharsets.UTF_8));
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
                    NLoginCore_275.d[0] = NLoginCore_027.F("ցջ֐Ռկ֖֓֘շՖդժևլ֚֟֜֓՞ծ֖֗դռպօատ֚֜է֨հ֯կֆִօְ֐հְֱִ֧֭֮֨֒ո֡֍ֳֶ֖֡֘֔֡փ֝׎ּ֘֫־ּׂ֣׈ׁ֊ֲ֩׊ז֓זׇחמ׊׋דףפ֫֬", (byte)92, 70);
                    NLoginCore_275.d[1] = NLoginCore_559.B("ƝưƤƠơƓƄƤƒƍưƔŵƆƍƌŷƔƿƽƖƝƊƋ", (byte)92, 66);
                    NLoginCore_275.d[2] = NLoginCore_027.B("ũơƍżƝƐŭƴŵƔűſ", (byte)92, 66);
                    NLoginCore_275.d[3] = NLoginCore_427.D("ԀԒԛՂՇԲԼՇԝԁԫՅԀՂԾԌՅԮԯԮԫԶԭՋԌՖԸԸ՟ԩՔԫ՟ՙ՟Ԟ՝՝ՠԧԷԨզԱ", (byte)92, 68);
                    NLoginCore_275.d[4] = NLoginCore_427.E("բս՞֔խտժխֆեգՠ", (byte)92, 69);
                    NLoginCore_275.d[5] = NLoginCore_223.E("Տաժ֑֖ց֋֖լՐպ֔Տ֑֍՛֔սվսպւչ֔֗պ֊֣փֱ֦֛", (byte)92, 69);
                    NLoginCore_275.d[6] = NLoginCore_446.D("ԶԀԝԔԱԞԻԂՈԡԧԨԩԫԍԾԫԍԴՅՎՕԜԝ", (byte)92, 68);
                    NLoginCore_275.d[7] = NLoginCore_559.A("ƁƜŽƳƌƞƉƌƥƄƂſ", (byte)92, 65);
                    NLoginCore_275.d[8] = NLoginCore_110.B("ŮƀƉưƵƠƪƵƋůƘƺƽƗŻƳƮƽƐƲƥƁƕƜƥƅƢƜǌƧƪƊ", (byte)92, 66);
                    NLoginCore_275.d[9] = NLoginCore_559.E("օՏլգրխ֊Ց֗հնշոպ՜֍պ՜փ֤֔֝իլ", (byte)92, 69);
                    NLoginCore_275.d[10] = NLoginCore_027.A("ƁƜŽƳƌƞƉƌƥƄƂſ", (byte)92, 65);
                    NLoginCore_275.d[11] = NLoginCore_173.B("ƈƚŪƦƲƦƢƭƒƲƸſ", (byte)92, 66);
                    NLoginCore_275.d[12] = NLoginCore_138.F("֎ՠՏ֏ՔՠՎ֖յխՖՠ", (byte)92, 70);
                    NLoginCore_275.d[13] = NLoginCore_027.C("ӼԷӾԣԻԱԚԘՀԦԤԑ", (byte)92, 67);
                    NLoginCore_275.d[14] = NLoginCore_387.C("ӸԮՀԭԚԙԸԻԤՅՂԑ", (byte)92, 67);
                    NLoginCore_275.d[15] = NLoginCore_138.E("վՊ֒֍Վզ֗Ցձե֑Ֆճ֓ձչ֚֕ր՛֢֎֡֠քգֆֆ֦֠կռք֓խհֲտֳ֒֔֎֩ր", (byte)92, 69);
                    NLoginCore_275.d[16] = NLoginCore_384.B("ƝưƤƠơƓƄƤƒƍưƔŵƆƍƌŷƔƿƽƖƝƊƋ", (byte)92, 66);
                    NLoginCore_275.d[17] = NLoginCore_427.A("ũơƍżƝƐŭƴŵƔűſ", (byte)92, 65);
                    NLoginCore_275.d[18] = NLoginCore_324.A("ŬƑƈųƒūƨƶƹƶƣŶƐƊŽƌƱƪƊƜƕƃƺǅƚƢƞƩƛƽǋǊƥƪǒƪǕǎǁǖƒǕǆƩƸƙƹƫƯƿƚƜƿǓƪƫ", (byte)92, 65);
                    NLoginCore_275.d[19] = NLoginCore_027.F("թտջՑ՟ՖՒ֎ՙթ֍֊ֆժովծ՞ՠդխ֞ֈ֣ւշդ֍֠֩֬հֈ֟և֊օֶ֒֙֍հո֔־ֈִֵֵ֛֒֬׀ֳ֦׀տ׊֪֪֔֗א֞", (byte)92, 70);
                    NLoginCore_275.d[20] = NLoginCore_201.E("վՏէգ։֊ց֒շեՓօծ՘շ֟ի֕ջտբռոր՛քրժ֌֋֭էս֤ծ֬֒֋ֲ֖֘մֆ֝ֆְֲ֚շ־ֱֳָָ֗֘օ֧֓ւ֜׆֎֊", (byte)92, 69);
                    NLoginCore_275.d[21] = NLoginCore_027.E("Ճւ՜զղՕկ֑ագ֕ՠ", (byte)92, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_275.d[0] = NLoginCore_223.C("ԲԬՁӽԠՇՄՉԨԇԕԛԸԝՐՍՋՄԏԟՇՈԕԭԫԶԒ԰ՍՋԘՙԡՠԠԷեԶաՁԡ՞՟՘եՙՃբաԩՒԾդՒՉՅէՒՇԴՎտխՉ՜կխՔճչղԻգ՚պբՠբօ֏֊հ՝֑֗օ՜՝", (byte)92, 67);
                    NLoginCore_275.d[1] = NLoginCore_453.F("վ֑օցւմեօճծ֒զՏ՛ին֣֡֒֌ղ֖՞֘բ֋֦ֈվցսլ", (byte)92, 70);
                    NLoginCore_275.d[2] = NLoginCore_027.B("ƚžƊƥƴƈƅƐơƩŹſ", (byte)92, 66);
                    NLoginCore_275.d[3] = NLoginCore_110.E("Տաժ֑֖ց֋֖լՐպ֔Տ֑֍՛֔սվսպօռ֚՛֥ևև֮ո֣պփվս֫րօִֵ֤֨֨ր", (byte)92, 69);
                    NLoginCore_275.d[4] = NLoginCore_446.A("ſƫƂƋƜƐƇƤƂƅƨſ", (byte)92, 65);
                    NLoginCore_275.d[5] = NLoginCore_446.B("ŮƀƉưƵƠƪƵƋůƙƳŮưƬźƳƜƝƜƙƣžƚƵƄƙǁƤƚƜǋ", (byte)92, 66);
                    NLoginCore_275.d[6] = NLoginCore_384.A("ƤŮƋƂƟƌƩŰƶƏƒƨŵƑƷƋƌƏƌƭƸǅƐƝƴƅżƃƬſƌƿ", (byte)92, 65);
                    NLoginCore_275.d[7] = NLoginCore_201.C("ԋԟԂԮԥՄԁԗԂԿՊԑ", (byte)92, 67);
                    NLoginCore_275.d[8] = NLoginCore_384.E("Տաժ֑֖ց֋֖լՐչ֛֞ո՜֔֏֞ձ֓ֆՠֈ֛֜ք֕նշթ֨֏", (byte)92, 69);
                    NLoginCore_275.d[9] = NLoginCore_223.F("օՏլգրխ֊Ց֗հմ֕լ։֌ր֗լցրդօե֤բվ֚֝տ֡ա֊", (byte)92, 70);
                    NLoginCore_275.d[10] = NLoginCore_027.F("Շ֍րծ֊օ֊թժնշՠ", (byte)92, 70);
                    NLoginCore_275.d[11] = NLoginCore_091.B("ƥƎƈſƴƱƭƏƌƁƴſ", (byte)92, 66);
                    NLoginCore_275.d[12] = NLoginCore_092.A("ƎƈŬƯƲƝŲƷŪƸűſ", (byte)92, 65);
                    NLoginCore_275.d[13] = NLoginCore_387.E("ֆ֎հֆհլ֗մօ֗քև֓֊֊՚֘ՙջօցծիլ", (byte)92, 69);
                    NLoginCore_275.d[14] = NLoginCore_451.F("ւ֍Վ֐նՔտհ֓յՖՠ", (byte)92, 70);
                    NLoginCore_275.d[15] = NLoginCore_324.A("ƝũƱƬŭƅƶŰƐƄưŵƒƲƐƘƴƹƟźǁƭǀƿƣƂƥƥƿǅƎƛƮǈƐƅǈǆǐƍƲǇƔǘƧǛƬƪƾƜǜǞƛǣƪƫ", (byte)92, 65);
                    NLoginCore_275.d[16] = NLoginCore_575.F("վ֑օցւմեօճծ֓մղ՚Օ֑ղ֞տ֓քօ՝֣֨֕֫զ՟ե֤֠", (byte)92, 70);
                    NLoginCore_275.d[17] = NLoginCore_451.D("ԬԝԾԣՁԆԅԑԳԉՊԑ", (byte)92, 68);
                    NLoginCore_275.d[18] = NLoginCore_091.F("ՍղթՔճՌ։֚֗֗ք՗ձի՞խ֒֋իսնդ֛֦ջփտ֊ռ֞֬֫ֆ֋ֳ֋ֶַ֢֯ճֵֶֻ֧֮֨֙։ׇֻֿׁ֥֑֮֕֠ׄ֙֠֩׎֦", (byte)92, 70);
                    NLoginCore_275.d[19] = NLoginCore_324.C("Ԛ԰ԬԂԐԇԃԿԊԚԾԻԷԛԩԯԟԏԑԕԞՏԹՔԳԨԕԾՑ՚՝ԡԹՐԸԻԶէՃՊԾԡԩՅկԹՃզզե՝ՌձբՋպՒ՘ԸջԹչՌՒ", (byte)92, 67);
                    NLoginCore_275.d[20] = NLoginCore_027.B("ƝŮƆƂƨƩƠƱƖƄŲƤƍŷƖƾƊƴƚƞƁƛƗƟźƣƟƉƫƪǌƆƜǃƍǋƱƪƷƵǑƓƥƼƥǏƹǑƖǝǒƶǐƱƥǟƺƷǖǉƬǨƤƪ", (byte)92, 66);
                    NLoginCore_275.d[21] = NLoginCore_027.F("՛՜տՆսփ֒յլհէՠ", (byte)92, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_275.d[0] = NLoginCore_384.A("ſƋƜƢŭƩƴƬůƂƚƛƩƍƚƙưƐƍƎŶƃƄǂƳǁƚƸƟƙǌƪ", (byte)92, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_275.d[0] = NLoginCore_076.D("ԊԔԀԐԔԹԖԥԣՃԕՅԉԾԢՏՅԻԦԝՉԟԜԝ", (byte)92, 68);
                }
            }
        }
    }

    private boolean a(NLoginCore_036 NLoginCore_0362) {
        return (!(NLoginCore_0362 != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d && NLoginCore_0362 != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c || this.b != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d && this.b != NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c) ? fm : fp) != 0;
    }
}

