/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.LoginType
 *  io.netty.channel.Channel
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.NLoginCore_056;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_548;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_588;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_031
extends NLoginCore_056 {
    private static int eh;
    private static int h;
    private static long cc;
    private static long cr;
    private static String[] c;
    private static int ci;
    private static long er;
    private static int bx;
    private static long bl;
    private static long fs;
    private static int var_int_b;
    private static long bp;
    private static long ck;
    private static long ge;
    private static int z;
    private static int fv;
    private static int ee;
    private static int fu;
    private static long ea;
    private final NLoginType_010 var_com_nickuc_login_NLoginType_010_b;
    private static long q;
    private static long fl;
    private static long du;
    private static int ca;
    private static int e;
    private static long cg;
    private static long ch;
    private static int ct;
    private static int dk;
    private static int el;
    private static int fr;
    private static int gg;
    private static int ew;
    private static int fg;
    private static long ax;
    private static long es;
    private static int dv;
    private static long bd;
    private static int al;
    private static long gj;
    private static int fj;
    private static long dp;
    private static int at;
    private static long dm;
    private static int aw;
    private static int eu;
    private static int ag;
    private static int bo;
    private static int cj;
    private static int ep;
    private static long i;
    private static int gl;
    private static long cfr_renamed_1;
    private static long an;
    private static int ds;
    private static int dq;
    private static int aa;
    private static int bg;
    private static int gc;
    private static int gh;
    private static int o;
    private static int g;
    private static int eq;
    private static int fn;
    private static int k;
    private static int cd;
    private static int ac;
    private static long bq;
    private static long en;
    private static long bi;
    private static int cf;
    private static int fo;
    private static int cz;
    private static int gk;
    private static long ey;
    private static int et;
    private static long gi;
    private static long ay;
    private static long ga;
    private static int bu;
    private static long dd;
    private static int cm;
    private static int be;
    private static int ba;
    private static int ei;
    private static long dl;
    private static int dc;
    private static String[] d;
    private static long f;
    private static long co;
    private static int dg;
    private static long p;
    private static int cb;
    private static int fz;
    private static int bc;
    private static long dx;
    private static int dn;
    private static int n;
    private static int bj;
    private static int ap;

    static {
        var_int_b = Integer.reverse(0x40000000);
        e = Integer.reverse(0x60000000);
        g = Integer.reverse(0);
        h = 0 >>> 224 | 0 << -224;
        i = Long.reverse(1797986653705226057L);
        k = (2 >>> 193 | 2 << -193) & 0xFFFFFFFF;
        n = (8192 >>> 44 | 8192 << -44) & 0xFFFFFFFF;
        o = 4096 >>> 44 | 4096 << ~44 + 1;
        p = Long.reverse(-3246044928949729463L);
        q = Long.reverse(-3891110078048108544L);
        z = (24 >>> 163 | 24 << -163) & 0xFFFFFFFF;
        aa = Integer.reverse(Integer.MIN_VALUE);
        ac = Integer.reverse(0x20000000);
        ag = Integer.reverse(0x40000000);
        al = Integer.reverse(-1);
        an = Long.reverse(1797986653705226057L);
        ap = (163840 >>> 239 | 163840 << -239) & 0xFFFFFFFF;
        at = (0x1000000 >>> 120 | 0x1000000 << ~120 + 1) & 0xFFFFFFFF;
        aw = (12288 >>> 236 | 12288 << -236) & 0xFFFFFFFF;
        ax = Long.reverse(-3246044928949729463L);
        ay = Long.reverse(-3891110078048108544L);
        ba = (0x800000 >>> 213 | 0x800000 << ~213 + 1) & 0xFFFFFFFF;
        bc = -1 >>> 180 | -1 << ~180 + 1;
        bd = Long.reverse(1797986653705226057L);
        be = Integer.reverse(0);
        bg = 0x280000 >>> 51 | 0x280000 << -51;
        bi = Long.reverse(1797986653705226057L);
        bj = 0x180000 >>> 114 | 0x180000 << ~114 + 1;
        bl = Long.reverse(1797986653705226057L);
        bo = Integer.reverse(-536870912);
        bp = Long.reverse(-3246044928949729463L);
        bq = Long.reverse(-3891110078048108544L);
        bu = (0 >>> 135 | 0 << -135) & 0xFFFFFFFF;
        bx = 160 >>> 69 | 160 << ~69 + 1;
        ca = 0 >>> 47 | 0 << -47;
        cb = 0x20000000 >>> 154 | 0x20000000 << -154;
        cc = Long.reverse(1797986653705226057L);
        cd = 0x400000 >>> 150 | 0x400000 << -150;
        cf = (2304 >>> 200 | 2304 << -200) & 0xFFFFFFFF;
        cg = Long.reverse(-3246044928949729463L);
        ch = Long.reverse(-3891110078048108544L);
        ci = Integer.reverse(0x40000000);
        cj = (0x280000 >>> 210 | 0x280000 << ~210 + 1) & 0xFFFFFFFF;
        ck = Long.reverse(1797986653705226057L);
        cm = (5632 >>> 137 | 5632 << -137) & 0xFFFFFFFF;
        co = Long.reverse(-3246044928949729463L);
        cr = Long.reverse(-3891110078048108544L);
        ct = Integer.reverse(-1073741824);
        cz = Integer.reverse(0x30000000);
        dc = -1 >>> 39 | -1 << ~39 + 1;
        dd = Long.reverse(1797986653705226057L);
        dg = 512 >>> 103 | 512 << ~103 + 1;
        dk = Integer.reverse(-1342177280);
        dl = Long.reverse(-3246044928949729463L);
        dm = Long.reverse(-3891110078048108544L);
        dn = (7168 >>> 233 | 7168 << ~233 + 1) & 0xFFFFFFFF;
        cfr_renamed_1 = Long.reverse(-3246044928949729463L);
        dp = Long.reverse(-3891110078048108544L);
        dq = 30 >>> 129 | 30 << ~129 + 1;
        ds = Integer.reverse(-1);
        du = Long.reverse(1797986653705226057L);
        dv = Integer.reverse(0x8000000);
        dx = Long.reverse(-3246044928949729463L);
        ea = Long.reverse(-3891110078048108544L);
        ee = 0 >>> 157 | 0 << -157;
        eh = Integer.reverse(-1610612736);
        ei = 0 >>> 153 | 0 << ~153 + 1;
        el = (544 >>> 101 | 544 << ~101 + 1) & 0xFFFFFFFF;
        en = Long.reverse(1797986653705226057L);
        ep = (32 >>> 229 | 32 << ~229 + 1) & 0xFFFFFFFF;
        eq = Integer.reverse(0x48000000);
        er = Long.reverse(-3246044928949729463L);
        es = Long.reverse(-3891110078048108544L);
        et = Integer.reverse(0x40000000);
        eu = (608 >>> 101 | 608 << ~101 + 1) & 0xFFFFFFFF;
        ew = (-1 >>> 114 | -1 << ~114 + 1) & 0xFFFFFFFF;
        ey = Long.reverse(1797986653705226057L);
        fg = Integer.reverse(-1073741824);
        fj = Integer.reverse(0x28000000);
        fl = Long.reverse(1797986653705226057L);
        fn = (0x1000000 >>> 54 | 0x1000000 << ~54 + 1) & 0xFFFFFFFF;
        fo = Integer.reverse(-1476395008);
        fr = -1 >>> 225 | -1 << -225;
        fs = Long.reverse(1797986653705226057L);
        fu = Integer.reverse(Integer.MIN_VALUE);
        fv = (0 >>> 8 | 0 << -8) & 0xFFFFFFFF;
        fz = Integer.reverse(0x68000000);
        ga = Long.reverse(1797986653705226057L);
        gc = 0x2E000000 >>> 121 | 0x2E000000 << -121;
        ge = Long.reverse(1797986653705226057L);
        gg = Integer.reverse(0);
        gh = Integer.reverse(0x18000000);
        gi = Long.reverse(-3246044928949729463L);
        gj = Long.reverse(-3891110078048108544L);
        gk = 0x1900000 >>> 148 | 0x1900000 << -148;
        gl = Integer.reverse(-1744830464);
        c = new String[gk];
        d = new String[gl];
        NLoginType_031.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void d(NLoginCore_277 NLoginCore_277) {
        long l = System.nanoTime();
        NLoginCore_187 NLoginCore_1872 = this.e.com_nickuc_login_NLoginCore_187_a();
        try {
            super.d(NLoginCore_277);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_031.c("㺀", (int)bj, (long)bl) + NLoginCore_277.getName() + (String)NLoginType_031.c("㺃", (int)bo, (long)(bp ^ bq)), throwable, new Object[bu]);
        }
        finally {
            NLoginCore_1872.l(NLoginCore_277);
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_e, l);
        }
    }

    public NLoginType_031(NLoginType_008 NLoginType_008, NLoginType_010 NLoginType_0102) {
        super(NLoginType_008);
        this.var_com_nickuc_login_NLoginType_010_b = NLoginType_0102;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(NLoginCore_277 NLoginCore_277, String string, boolean bl) {
        long l = System.nanoTime();
        try {
            if (!NLoginCore_277.R()) {
                return;
            }
            NLoginCore_509 NLoginCore_5092 = this.e.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            this.var_com_nickuc_login_NLoginType_010_b.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, NLoginCore_5092, string);
            if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
                Object[] objectArray = new Object[e];
                objectArray[NLoginType_031.g] = NLoginType_031.c("㺀", (int)h, (long)i);
                objectArray[NLoginType_031.k] = LoginType.SESSION.ordinal();
                objectArray[NLoginType_031.n] = NLoginType_031.c("㺃", (int)o, (long)(p ^ q));
                objectArray[NLoginType_031.z] = aa != 0;
                objectArray[NLoginType_031.ac] = NLoginType_031.c("㺆", (int)(ag & al), (long)an);
                objectArray[NLoginType_031.ap] = at != 0;
                this.var_com_nickuc_login_NLoginType_010_b.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, var_int_b, objectArray);
            } else if (bl) {
                super.d(NLoginCore_277, NLoginCore_5092);
            }
            this.var_com_nickuc_login_NLoginType_010_b.com_nickuc_login_NLoginCore_199_a().f(NLoginCore_277, NLoginCore_5092);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_031.c("㺉", (int)aw, (long)(ax ^ ay)) + NLoginCore_277.getName() + (String)NLoginType_031.c("㺌", (int)(ba & bc), (long)bd), throwable, new Object[be]);
            NLoginCore_277.a((String)NLoginType_031.c("㺏", (int)bg, (long)bi));
        }
        finally {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_d, l);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x53L;
        l ^= 0x3EEBD98C8078560FL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(22 + 47), (byte)(3 + 80), (byte)(41 + 6), (byte)(34 + 33), (byte)(54 + 12), (byte)(47 + 20), (byte)(6 + 41), (byte)(27 + 53), (byte)(52 + 23), (byte)(48 + 19), (byte)(62 + 21), (byte)(25 + 28), (byte)(7 + 73), (byte)(33 + 64), (byte)(13 + 87), (byte)(97 + 3), (byte)(2 + 103), 110, (byte)(57 + 46)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("йцхЈшфпшѓтЏэёъэѓЕޏާޜިޥޤޥ޲", (byte)11, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_031.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_031.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("řŻŽŝƁƠƘƮƚũƧƝƫƥŮƓƵƴƬƲƬƁ", (byte)89, 65), NLoginType_031.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.B("ƔơƠţƣƟƚƣƮƝŪƨƬƥƨƮŰӪԂӷԃԀӿԀԍƄ", (byte)89, 66) + string + NLoginCore_559.A("ū", (byte)89, 65) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public String a(NLoginCore_277 NLoginCore_277, Object object, Channel channel, boolean bl) {
        long l = System.nanoTime();
        String string = NLoginCore_277.getName();
        try {
            if (channel == null) {
                String[] stringArray = new String[bx];
                stringArray[NLoginType_031.ca] = NLoginType_031.c("㺀", (int)cb, (long)cc);
                stringArray[NLoginType_031.cd] = NLoginType_031.c("㺃", (int)cf, (long)(cg ^ ch));
                stringArray[NLoginType_031.ci] = (String)NLoginType_031.c("㺆", (int)cj, (long)ck) + object.getClass().getSimpleName() + (String)NLoginType_031.c("㺉", (int)cm, (long)(co ^ cr));
                stringArray[NLoginType_031.ct] = NLoginType_031.c("㺌", (int)(cz & dc), (long)dd);
                stringArray[NLoginType_031.dg] = NLoginType_031.c("㺏", (int)dk, (long)(dl ^ dm));
                String string2 = NLoginCore_112.a(stringArray);
                return string2;
            }
            NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
            if (NLoginCore_5882 == null) {
                String string3 = (String)NLoginType_031.c("㺒", (int)dn, (long)(cfr_renamed_1 ^ dp)) + NLoginCore_277.getName() + (String)NLoginType_031.c("㺕", (int)(dq & ds), (long)du) + object.getClass().getSimpleName() + (String)NLoginType_031.c("㺘", (int)dv, (long)(dx ^ ea));
                NLoginCore_370.c(string3, new Object[ee]);
                String[] stringArray = new String[eh];
                stringArray[NLoginType_031.ei] = NLoginType_031.c("㺛", (int)el, (long)en);
                stringArray[NLoginType_031.ep] = NLoginType_031.c("㺞", (int)eq, (long)(er ^ es));
                stringArray[NLoginType_031.et] = (String)NLoginType_031.c("㺡", (int)(eu & ew), (long)ey) + string3;
                stringArray[NLoginType_031.fg] = NLoginType_031.c("㺤", (int)fj, (long)fl);
                stringArray[NLoginType_031.fn] = NLoginType_031.c("㺧", (int)(fo & fr), (long)fs);
                String string4 = NLoginCore_112.a(stringArray);
                return string4;
            }
            NLoginInterface_031 NLoginInterface_0312 = this.e.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
            String string5 = super.a(NLoginCore_277, NLoginCore_5882.var_com_nickuc_login_ForceRegisterConfig_f, NLoginCore_5882.ci, NLoginCore_277.java_net_InetSocketAddress_b(), bl, (NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null || NLoginInterface_0312 != null && NLoginInterface_0312.boolean_a(NLoginCore_277.java_util_UUID_a()) ? fu : fv) != 0, NLoginCore_5882);
            return string5;
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginType_031.c("㺪", (int)fz, (long)ga) + string + (String)NLoginType_031.c("㺭", (int)gc, (long)ge), throwable, new Object[gg]);
            Object object2 = NLoginType_031.c("㺰", (int)gh, (long)(gi ^ gj));
            return object2;
        }
        finally {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_c, l);
        }
    }

    private static void b() {
        int n;
        f = -7862582105189003445L;
        long l = f ^ 0x3EEBD98C8078560FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(24 + 45), (byte)(18 + 65), 47, (byte)(15 + 52), (byte)(12 + 54), (byte)(2 + 65), (byte)(33 + 14), (byte)(14 + 66), (byte)(36 + 39), (byte)(34 + 33), (byte)(66 + 17), (byte)(43 + 10), (byte)(13 + 67), (byte)(12 + 85), (byte)(33 + 67), (byte)(99 + 1), (byte)(69 + 36), (byte)(11 + 99), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
                    NLoginType_031.d[0] = NLoginCore_446.C("ѲѪѐчѵѝѻуѱњѦы", (byte)26, 67);
                    NLoginType_031.d[1] = NLoginCore_004.A("÷Ėę÷îèāĒÿĦĐČöĖñćĔĈĻĨĸďĎúŅİĥŀĲħĲý", (byte)26, 65);
                    NLoginType_031.d[2] = NLoginCore_138.B("ĂöĎøéĄāıñģĊĐĵĦěĸĴĝďŀĎęĆć", (byte)26, 66);
                    NLoginType_031.d[3] = NLoginCore_091.B("çğĉëČģĐðþĔĊĥ÷ĪĬĬöČĈĪĸĒıĚĚÿįľņķüĝħĭŇČňĎĈŁňīĒŎģĬśěŔŖŕļĞķįŀŃğŘĸŅĹĦŚūŋŝōŇĪōįĴŀŨĻ", (byte)26, 66);
                    NLoginType_031.d[4] = NLoginCore_453.F("ԥԾԋՇՓԽԤՎԕԹՋԞ", (byte)26, 70);
                    NLoginType_031.d[5] = NLoginCore_004.E("ԽԋՎՇԱԓԋԥԴԒՈԻՕ՘ՌՏՉԱաՒՁ՘ՓԘԶԾԽՇԢԺ՚ԷԩԮ՜եեեՔՒաԱդՓՌմՐՉԼՏՍմկ՜տո՘ՐսՙըՕռփզ֎փՏ՟սՑՎՓ֍ևՒք֕էՙ֖՛՝֘խ֖բրօֆզռ֚֕սլ", (byte)26, 69);
                    NLoginType_031.d[6] = NLoginCore_201.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԴՕՂեԣԿԽիԞբՈՋԮհեՓՋ՞՞խբՍՃԲ՜ՅյկՀբՏՃւՉՊ", (byte)26, 69);
                    NLoginType_031.d[7] = NLoginCore_004.C("ђѫиѴҀѪёѻтѦѸы", (byte)26, 67);
                    NLoginType_031.d[8] = NLoginCore_387.E("ԽԋՎՇԱԓԋԥԴԒՊՃՖ՝ԩ՟ԧ԰ԛ՞ԛբԩԪ", (byte)26, 69);
                    NLoginType_031.d[9] = NLoginCore_091.A("ČúöìěĮĢāòćñû", (byte)26, 65);
                    NLoginType_031.d[10] = NLoginCore_076.A("ĊëįğġĆëİĳĲĮĎęĬĄñİúĦĐĈĹúĸýĳĺĨĵĽĲýĦăŁħŏĨŀŒĦĳĬġńġĮŋŐōıęįĹĦħ", (byte)26, 65);
                    NLoginType_031.d[11] = NLoginCore_110.A("ûåāêýèĢĪĥĈĨû", (byte)26, 65);
                    NLoginType_031.d[12] = NLoginCore_559.F("ԯԝԙԏԾՑՅԤԕԪԔԞ", (byte)26, 70);
                    NLoginType_031.d[13] = NLoginCore_427.F("ԗՏՐՇ԰ԣՁԖԴԕԹԤՋԔԵ՜ԸՖԘԬԳԛԷՂՏՅՈթԤՙԽՏԸծէԨըե՝ՂԩԸԱԱՆսՎՎ՟Տ՜՝դ՜ՉՊ", (byte)26, 70);
                    NLoginType_031.d[14] = NLoginCore_091.F("ԁԋԩԲԳՉԡԯՆՁԷԙԣԤ՛ԨԹԵՑԷԹՖԥէեՃԳԲՕըԨԪԻժԮաՒԬիՑժիեՅչՌեՒռոՍշՠԿպԽՏԾտվլ՚Պՠ", (byte)26, 70);
                    NLoginType_031.d[15] = NLoginCore_004.D("ѤдѓэѱѮѷнкѻюы", (byte)26, 68);
                    NLoginType_031.d[16] = NLoginCore_223.C("ѵгџкєрѕљѕѢѼѦјѕѲ҃ҍѮѾѠт҃Ҏ҈ѝѐ҉ѦѦєҎҌқіѯѳѶҋѫѭѝѻѸҞ҃ҁҘҊҡ҇ҘҘѹүѶѷ", (byte)26, 67);
                    NLoginType_031.d[17] = NLoginCore_223.F("ԽԋՎՇԱԓԋԥԴԒՊՃՖ՝ԩ՟ԧ԰ԛ՞ԛբԩԪ", (byte)26, 70);
                    NLoginType_031.d[18] = NLoginCore_453.A("ČúöìěĮĢāòćñû", (byte)26, 65);
                    NLoginType_031.d[19] = NLoginCore_138.B("øêĬĄğĥčêĉģĂû", (byte)26, 66);
                    NLoginType_031.d[20] = NLoginCore_451.C("ќъцмѫѾѲётїсы", (byte)26, 67);
                    NLoginType_031.d[21] = NLoginCore_427.B("ôĬĭĤčĀĞóđòĖāĨñĒĹĕĳõĉĐøĔğĬĢĥņāĶĚĬĕŋńąŅłĺğĆĕĎĎģŚīīļĬĹĺŁĹĦħ", (byte)26, 66);
                    NLoginType_031.d[22] = NLoginCore_091.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԵՔԽԽԢՒաթ՚ԟՀՄՀՌաՌԱՕՊձՌԹժՊԲՓԹժչյՌԽղՉՊ", (byte)26, 69);
                    NLoginType_031.d[23] = NLoginCore_451.D("ђѫиѴҀѪёѻтѦѸы", (byte)26, 68);
                    NLoginType_031.d[24] = NLoginCore_575.B("ĚèīĤĎðèĂđïĥĘĲĵĩĬĦĎľįĞĵİõēěĚĤÿėķĔĆċĹłłłıįľĎŁİĩőĭĦęĬĪőŌĹŜŕĵĭŚĶŅĲřŠŃūŠĬļŚĮīİŪŤįšŲńĶųĸĺŵŊųĿŝŢţŃřŷŲŚŉ", (byte)26, 66);
                    continue block7;
                }
                case 1: {
                    NLoginType_031.d[0] = NLoginCore_559.B("ìČ÷ėíĨěĞĆĒēĮčģčĤòĩĩĩĐĉĆć", (byte)26, 66);
                    NLoginType_031.d[1] = NLoginCore_173.D("чѦѩчоиёѢяѶѠќцѦсїѤјҋѸ҈ѣѾѯђѥѨѫѪѢѐҖ", (byte)26, 68);
                    NLoginType_031.d[2] = NLoginCore_384.A("ĂöĎøéĄāıñģČİïĵąīęĵĕĮīĿĆć", (byte)26, 65);
                    NLoginType_031.d[3] = NLoginCore_076.F("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԵՔԽԽԢՒաթ՚ԟՀՊՐժԯիԱԫդիՎԵձՆՏվԾշչո՟Ձ՚ՒգզՂջ՛ը՜Չսռ՞ղիՠժեՈՠչչ՞", (byte)26, 70);
                    NLoginType_031.d[4] = NLoginCore_076.C("хішѯџѿѣєѰѱҀы", (byte)26, 67);
                    NLoginType_031.d[5] = NLoginCore_223.C("ѪиѻѴўриђѡпѵѨ҂҅ѹѼѶўҎѿѮ҅ҀхѣѫѪѴяѧ҇Ѥіћ҉ҒҒҒҁѿҎўґҀѹҡѽѶѩѼѺҡҜ҉Ҭҥ҅ѽҪ҆ҕ҂ҩҰғһҰѼҌҪѾѻҀҺҴѿұӂҔ҆Ӄ҈ҊӅҚӊҢҡҞҥӍҟӋҋҷҥҮҸӌӓӠҽҞӟңңҺҫ", (byte)26, 67);
                    NLoginType_031.d[6] = NLoginCore_427.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԴՕՂեԣԿԽիԞբՈՋԮհեՓՋ՞՞խբՎՇիլ՗էրԼիՑվ՜ՉՊ", (byte)26, 69);
                    NLoginType_031.d[7] = NLoginCore_324.A("ġĬħĀČđĆčĬõĴû", (byte)26, 65);
                    NLoginType_031.d[8] = NLoginCore_027.F("ԽԋՎՇԱԓԋԥԴԒՈԭԬԗԻԺՈՠԛԯՏԬԩԪ", (byte)26, 70);
                    NLoginType_031.d[9] = NLoginCore_453.D("ьћѵпћѶѽеіфђы", (byte)26, 68);
                    NLoginType_031.d[10] = NLoginCore_223.F("ԭԎՒՂՄԩԎՓՖՕՑԱԼՏԧԔՓԝՉԳԫ՜ԝ՛ԠՖ՝Ջ՘ՠՕԠՉԦդՊղՋգյՉՖՐ՘ԶԵզՖձ՝՗ՊտղՉՊ", (byte)26, 70);
                    NLoginType_031.d[11] = NLoginCore_427.F("ԛՌԋԈ԰ԪԲԴՉՂԤԤԶ՚ԏԼՕԿԚԪաԬԩԪ", (byte)26, 70);
                    NLoginType_031.d[12] = NLoginCore_004.F("ԈԽԍԜՇԾԯԑՐԦԹԞ", (byte)26, 70);
                    NLoginType_031.d[13] = NLoginCore_559.C("фѼѽѴѝѐѮуѡтѦёѸсѢ҉ѥ҃хљѠшѤѯѼѲѵҖё҆ѪѼѥқҔѕҕҒҊѯіѥўҁҕ҄҇ѴҢ҂ѧҞҋүѶѷ", (byte)26, 67);
                    NLoginType_031.d[14] = NLoginCore_387.C("ЮиіџѠѶюќѳѮѤцѐё҈ѕѦѢѾѤѦ҃ђҔҒѰѠџ҂ҕѕїѨҗћҎѿљҘѾҗҘҒѲҦѹҒѿҩҥѺҤҍѬѼѪѴѯҦҬҸѱҤұ", (byte)26, 67);
                    NLoginType_031.d[15] = NLoginCore_223.C("фѴжѧѿҁѓѲѺҀ҂ѹѱѵ҆ѝєчѧѥҋѩії", (byte)26, 67);
                    NLoginType_031.d[16] = NLoginCore_091.E("ՈԆԲԍԧԓԨԬԨԵՏԹԫԨՅՖՠՁՑԳԕՖա՛԰ԣ՜ԹԹԧա՟ծԩՂՆՉ՞ԾՀ԰ՎՌհՉջԷ՗թԲՕհգ՝ղ՝շևՓՠպդՕՋ", (byte)26, 69);
                    NLoginType_031.d[17] = NLoginCore_384.B("ĚèīĤĎðèĂđïĤðČĺįİĽĳĎĘýĉĆć", (byte)26, 66);
                    NLoginType_031.d[18] = NLoginCore_575.E("ՉԮԧՌՊՑՖԱ՘ԧՃԞ", (byte)26, 69);
                    NLoginType_031.d[19] = NLoginCore_223.B("ĭĖåĎïçĚĝýġíû", (byte)26, 66);
                    NLoginType_031.d[20] = NLoginCore_384.F("ԾԚԻԺԱՍԯՆԍՊԱԞ", (byte)26, 70);
                    NLoginType_031.d[21] = NLoginCore_027.F("ԗՏՐՇ԰ԣՁԖԴԕԹԤՋԔԵ՜ԸՖԘԬԳԛԷՂՏՅՈթԤՙԽՏԸծէԨըե՝ՂԩԸԱԺԶո՘իՙշշն՜ւՉՊ", (byte)26, 70);
                    NLoginType_031.d[22] = NLoginCore_027.A("çğĉëČģĐðþĔĊĥ÷ĪĬĬöČĈĪĸĒıĚĚÿįľņķüĝġĝĩľĩĎĲħŎĩĕıńđĐĲĳŐŘœĬŏĦħ", (byte)26, 65);
                    NLoginType_031.d[23] = NLoginCore_324.B("ĊĬäĊëďüİĂþĊû", (byte)26, 66);
                    NLoginType_031.d[24] = NLoginCore_076.D("ѪиѻѴўриђѡпѵѨ҂҅ѹѼѶўҎѿѮ҅ҀхѣѫѪѴяѧ҇Ѥіћ҉ҒҒҒҁѿҎўґҀѹҡѽѶѩѼѺҡҜ҉Ҭҥ҅ѽҪ҆ҕ҂ҩҰғһҰѼҌҪѾѻҀҺҴѿұӂҔ҆Ӄ҈ҊӅҚӁӌҜҫҞӌҰҕӖҥҥҼҽӗҬӔӉҳҙӌӁӆҫ", (byte)26, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_031.d[0] = NLoginCore_173.C("йњчѺџлѠыѐѵѢя҄ѝт҆ѺѹѬѝѮҏії", (byte)26, 67);
                    continue block7;
                }
                case 4: {
                    NLoginType_031.d[0] = NLoginCore_451.D("њќьѰв҂ѼйњѡѥцњѱѼѵ҂ѿћхѢѿії", (byte)26, 68);
                }
            }
        }
    }
}

