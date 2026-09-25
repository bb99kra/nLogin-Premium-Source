/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_562;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_037
extends NLoginCore_098 {
    private static long fc;
    private static int ex;
    private static long ev;
    private static long be;
    private static int dt;
    private static long ab;
    private static long cd;
    private static int fz;
    private static int dd;
    private static int cb;
    private static long au;
    private static long bv;
    private static long dp;
    private static long es;
    private static long ez;
    private static int al;
    private static int y;
    private static long eb;
    private static long bk;
    private static int cy;
    private static long dv;
    private static long el;
    private static long fn;
    private static int gd;
    private static int ek;
    private static long q;
    private static long ci;
    private static long df;
    private static int eu;
    private static int bn;
    private static int bz;
    private static int fv;
    private static long cw;
    private static int fp;
    private static long ct;
    private static int var_int_e;
    private static String[] f;
    private static long o;
    private static int bi;
    private static long eo;
    private static long by;
    private static int cr;
    private static long ck;
    private static int bu;
    private static long dy;
    private static long ft;
    private static int cg;
    private static int cm;
    private static long ds;
    private static String[] var_java_lang_String_arr_e;
    private static long br;
    private static int ey;
    private static long cu;
    private static long fy;
    private static long p;
    private static long cp;
    private static int fr;
    private static long fx;
    private static long at;
    private static long dm;
    private static int da;
    private static long ff;
    private static int bd;
    private static long fu;
    private static long cf;
    private static int dh;
    private static int dk;
    private static int gc;
    private static long cn;
    private static int fh;
    private static long dc;
    private static int fa;
    private static int fl;
    private static long bh;
    private static long bo;
    private static long cx;
    private static int eq;
    private static long ee;
    private static long bm;
    private static int dq;
    private static int cv;
    private static int dz;
    private static long dg;

    private static String a(int n, long l) {
        l ^= 0x4FL;
        l ^= 0x23853D806344CE86L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(11 + 58), (byte)(5 + 78), (byte)(35 + 12), (byte)(50 + 17), (byte)(20 + 46), 67, (byte)(13 + 34), (byte)(68 + 12), (byte)(62 + 13), (byte)(2 + 65), (byte)(33 + 50), (byte)(23 + 30), (byte)(63 + 17), (byte)(48 + 49), (byte)(11 + 89), (byte)(48 + 52), (byte)(26 + 79), (byte)(26 + 84), (byte)(34 + 69)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(28 + 55)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("ĮĻĺýĽĹĴĽňķĄłņĿłňĊҘҀҜҞқҩҙѷҢҘҫҍҥ", (byte)38, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_037.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_037(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.P, (String)NLoginCore_037.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_037.c("㺃", (int)y, (long)ab));
    }

    static {
        var_int_e = 0 >>> 47 | 0 << ~47 + 1;
        p = Long.reverse(4993325179669294616L);
        q = Long.reverse(-1008806316530991104L);
        y = 16 >>> 100 | 16 << -100;
        ab = Long.reverse(-5238853173716472296L);
        al = 524288 >>> 18 | 524288 << ~18 + 1;
        at = Long.reverse(4993325179669294616L);
        au = Long.reverse(-1008806316530991104L);
        bd = (196608 >>> 240 | 196608 << -240) & 0xFFFFFFFF;
        be = Long.reverse(4993325179669294616L);
        bh = Long.reverse(-1008806316530991104L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(4993325179669294616L);
        bm = Long.reverse(-1008806316530991104L);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(4993325179669294616L);
        br = Long.reverse(-1008806316530991104L);
        bu = (3 >>> 191 | 3 << -191) & 0xFFFFFFFF;
        bv = Long.reverse(4993325179669294616L);
        by = Long.reverse(-1008806316530991104L);
        bz = Integer.reverse(1462763520);
        cb = 28 >>> 194 | 28 << ~194 + 1;
        cd = Long.reverse(4993325179669294616L);
        cf = Long.reverse(-1008806316530991104L);
        cg = Integer.reverse(0x10000000);
        ci = Long.reverse(4993325179669294616L);
        ck = Long.reverse(-1008806316530991104L);
        cm = Integer.reverse(-1879048192);
        cn = Long.reverse(4993325179669294616L);
        cp = Long.reverse(-1008806316530991104L);
        cr = Integer.reverse(0x50000000);
        ct = Long.reverse(4993325179669294616L);
        cu = Long.reverse(-1008806316530991104L);
        cv = (180224 >>> 174 | 180224 << -174) & 0xFFFFFFFF;
        cw = Long.reverse(4993325179669294616L);
        cx = Long.reverse(-1008806316530991104L);
        cy = 786432 >>> 16 | 786432 << -16;
        da = Integer.reverse(-1);
        dc = Long.reverse(-5238853173716472296L);
        dd = Integer.reverse(-1342177280);
        df = Long.reverse(4993325179669294616L);
        dg = Long.reverse(-1008806316530991104L);
        dh = Integer.reverse(0);
        dk = Integer.reverse(0x70000000);
        dm = Long.reverse(4993325179669294616L);
        dp = Long.reverse(-1008806316530991104L);
        dq = Integer.reverse(-268435456);
        ds = Long.reverse(-5238853173716472296L);
        dt = Integer.reverse(0x8000000);
        dv = Long.reverse(4993325179669294616L);
        dy = Long.reverse(-1008806316530991104L);
        dz = (4352 >>> 136 | 4352 << ~136 + 1) & 0xFFFFFFFF;
        eb = Long.reverse(4993325179669294616L);
        ee = Long.reverse(-1008806316530991104L);
        ek = 0x480000 >>> 242 | 0x480000 << ~242 + 1;
        el = Long.reverse(4993325179669294616L);
        eo = Long.reverse(-1008806316530991104L);
        eq = 0x2600000 >>> 245 | 0x2600000 << -245;
        es = Long.reverse(-5238853173716472296L);
        eu = (0x40000001 >>> 92 | 0x40000001 << ~92 + 1) & 0xFFFFFFFF;
        ev = Long.reverse(-5238853173716472296L);
        ex = Integer.reverse(-1476395008);
        ey = (-1 >>> 214 | -1 << ~214 + 1) & 0xFFFFFFFF;
        ez = Long.reverse(-5238853173716472296L);
        fa = Integer.reverse(0x68000000);
        fc = Long.reverse(4993325179669294616L);
        ff = Long.reverse(-1008806316530991104L);
        fh = Integer.reverse(-402653184);
        fl = Integer.reverse(-1);
        fn = Long.reverse(-5238853173716472296L);
        fp = (262144 >>> 242 | 262144 << ~242 + 1) & 0xFFFFFFFF;
        fr = 0x30000000 >>> 89 | 0x30000000 << ~89 + 1;
        ft = Long.reverse(4993325179669294616L);
        fu = Long.reverse(-1008806316530991104L);
        fv = (0x3200000 >>> 181 | 0x3200000 << ~181 + 1) & 0xFFFFFFFF;
        fx = Long.reverse(4993325179669294616L);
        fy = Long.reverse(-1008806316530991104L);
        fz = Integer.reverse(0);
        gc = (851968 >>> 239 | 851968 << ~239 + 1) & 0xFFFFFFFF;
        gd = (26 >>> 0 | 26 << -0) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[gc];
        f = new String[gd];
        NLoginCore_037.void_b();
    }

    private void h(String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_037.c("㺀", (int)fa, (long)(fc ^ ff)));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_037.c("㺃", (int)(fh & fl), (long)fn));
        }
        NLoginCore_291 NLoginCore_2912 = this.m.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(string, null, null, fp != 0);
        if (ForceRegisterConfig2 == null) {
            throw new RuntimeException((String)NLoginCore_037.c("㺆", (int)fr, (long)(ft ^ fu)) + string + (String)NLoginCore_037.c("㺉", (int)fv, (long)(fx ^ fy)));
        }
        if (ForceRegisterConfig2.t()) {
            return;
        }
        ForceRegisterConfig2.void_z();
        if (NLoginCore_2912.a((NLoginCore_459)this.a, ForceRegisterConfig2, new NLoginCore_436[fz])) {
            ++this.k;
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_037.c("㺀", (int)eu, (long)ev));
        boolean bl = Boolean.parseBoolean(resultSet.getString((String)NLoginCore_037.c("㺃", (int)(ex & ey), (long)ez)));
        if (bl) {
            this.h(this.r);
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_037.c("㺀", (int)al, (long)(at ^ au)), (String)NLoginCore_037.c("㺃", (int)bd, (long)(be ^ bh)));
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_037.c("㺆", (int)bi, (long)(bk ^ bm)));
        }
        String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_037.c("㺉", (int)bn, (long)(bo ^ br))).trim().toLowerCase(Locale.ENGLISH);
        int n = NLoginCore_2192.a(NLoginCore_037.c("㺌", (int)bu, (long)(bv ^ by)), bz);
        String string3 = NLoginCore_2192.a(NLoginCore_037.c("㺏", (int)cb, (long)(cd ^ cf)), (String)NLoginCore_037.c("㺒", (int)cg, (long)(ci ^ ck)));
        String string4 = NLoginCore_2192.a(NLoginCore_037.c("㺕", (int)cm, (long)(cn ^ cp)), (String)NLoginCore_037.c("㺘", (int)cr, (long)(ct ^ cu)));
        String string5 = NLoginCore_2192.a(NLoginCore_037.c("㺛", (int)cv, (long)(cw ^ cx)), (String)NLoginCore_037.c("㺞", (int)(cy & da), (long)dc));
        boolean bl = NLoginCore_2192.a(NLoginCore_037.c("㺡", (int)dd, (long)(df ^ dg)), dh != 0);
        Properties properties = new Properties();
        properties.setProperty((String)NLoginCore_037.c("㺤", (int)dk, (long)(dm ^ dp)), Boolean.toString(bl));
        properties.setProperty((String)NLoginCore_037.c("㺧", (int)dq, (long)ds), (String)NLoginCore_037.c("㺪", (int)dt, (long)(dv ^ dy)));
        if (string2.contains((CharSequence)NLoginCore_037.c("㺭", (int)dz, (long)(eb ^ ee)))) {
            this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(string3, n, string, string4, string5, properties));
        } else if (string2.contains((CharSequence)NLoginCore_037.c("㺰", (int)ek, (long)(el ^ eo)))) {
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string3, n, string, string4, string5, properties));
        } else {
            throw new UnsupportedOperationException((String)NLoginCore_037.c("㺳", (int)eq, (long)es) + string2);
        }
    }

    private static void void_b() {
        int n;
        o = 1762539618434798242L;
        long l = o ^ 0x23853D806344CE86L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(63 + 6), (byte)(66 + 17), (byte)(19 + 28), (byte)(9 + 58), (byte)(16 + 50), (byte)(21 + 46), (byte)(5 + 42), (byte)(7 + 73), (byte)(40 + 35), (byte)(5 + 62), (byte)(10 + 73), 53, 80, (byte)(46 + 51), (byte)(69 + 31), (byte)(82 + 18), (byte)(83 + 22), (byte)(5 + 105), (byte)(88 + 15)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
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
                    NLoginCore_037.f[0] = NLoginCore_027.A("ƥƸƜǍƳǊƘƾƠƛƲƫ", (byte)114, 65);
                    NLoginCore_037.f[1] = NLoginCore_453.A("ƻƻƬǒƳƯƯǟƶƻƯǏƧƼƺǋǚƧǧǏǦǉƶƷ", (byte)114, 65);
                    NLoginCore_037.f[2] = NLoginCore_453.A("ǇǎƮǉǋǍƴƕƳǠǝǥƲǨǠƶƢǋƥƻǝǉƶƷ", (byte)114, 65);
                    NLoginCore_037.f[3] = NLoginCore_223.E("֦֗֟ՠի՞֥֝աֈթ֟֋֮ղֆ֣֤ի֌շքցւ", (byte)114, 69);
                    NLoginCore_037.f[4] = NLoginCore_201.F("֠չֆ։֞օֈ֝ժծ֡ղ֢զֳ֖հհ֩֓նֻ֛֙֔նվֲտֵ֗֘֯־׈ָֺփ׎֭֯׉֖֡", (byte)114, 70);
                    NLoginCore_037.f[5] = NLoginCore_453.C("ցճծՒ՝էԼշբ֍դըս֍՝Չև֌ղ֍֏և՞՟", (byte)114, 67);
                    NLoginCore_037.f[6] = NLoginCore_110.B("ƼƝƳǙƬƚǟǂǡưƲƫ", (byte)114, 66);
                    NLoginCore_037.f[7] = NLoginCore_559.C("Քւծչմօ՜ջմ՝ՊևՊղգռՎ՞Ր֑ժձ՞՟", (byte)114, 67);
                    NLoginCore_037.f[8] = NLoginCore_091.B("ƯƮƺƺƮƲǔƴǄǛǎǝƿƻƿǨǩǍƮǚǏǟƶƷ", (byte)114, 66);
                    NLoginCore_037.f[9] = NLoginCore_223.E("ֆն֦֛պ֜զ֠տ֋ֲֳ֣֣֬֫֝֓֒֊֮քցւ", (byte)114, 69);
                    NLoginCore_037.f[10] = NLoginCore_387.F("եէ՛ժիևְ֨֘֍֧ն", (byte)114, 70);
                    NLoginCore_037.f[11] = NLoginCore_027.B("ƗǗǚƼƱƯǡǞƢƢơǤǚƠƾǢǜǪǪƮǎǟƶƷ", (byte)114, 66);
                    NLoginCore_037.f[12] = NLoginCore_138.B("ǙǈǞǏƝƺƴƳǤǀǒǧǩǥǢǬǉǭƨǪƩǟƶƷ", (byte)114, 66);
                    NLoginCore_037.f[13] = NLoginCore_223.B("ǌƮƔƹǕǂƻơǁƞǗƿƺǔǉǋǂƸǟƩǩƹƶƷ", (byte)114, 66);
                    NLoginCore_037.f[14] = NLoginCore_201.E("֝եվվ֕զգ֦֫֡֍ն", (byte)114, 69);
                    NLoginCore_037.f[15] = NLoginCore_223.D("ձԾեօ՞ցՓք՗ֈշֆւկստՠն֗Ւհհ՘շլէՕ֙֍֖֐֜", (byte)114, 68);
                    NLoginCore_037.f[16] = NLoginCore_223.A("ƚƫƹǐǉƽǖǓƹƠƲƫ", (byte)114, 65);
                    NLoginCore_037.f[17] = NLoginCore_384.E("ղ֚։ը֓ֆքթ֧֝֠ն", (byte)114, 69);
                    NLoginCore_037.f[18] = NLoginCore_324.D("ցղքՑռՀևէ֊՛ծՓ", (byte)114, 68);
                    NLoginCore_037.f[19] = NLoginCore_575.D("ռփՎՖՆՇ՘ՃՃԿտՙաՉ֏ՋբՏշր֒չՖզ՚ը֏ո֙֙հ֟֐փ֣֟֞֗բրջ֋ւճ", (byte)114, 68);
                    NLoginCore_037.f[20] = NLoginCore_427.A("ǏƗƽƾǓƭƾǔƱơǚǙǕǡƺǧƻǚǜǯƼǯƶƷ", (byte)114, 65);
                    NLoginCore_037.f[21] = NLoginCore_091.D("ցռգփֆՙսթն՛ՅՓ", (byte)114, 68);
                    NLoginCore_037.f[22] = NLoginCore_138.E("֠և֟չփ֣֖֤֗ռռկ֣֠ճ֣նծ։֖֊ֺֹֻևֲ֖֐׃ִׅ֙սցׄ֟׉֦ׅ֞֬֊֖֝", (byte)114, 69);
                    NLoginCore_037.f[23] = NLoginCore_387.B("ǕƼǔƮƸǘǋǙǌƱƱƤǕǘƨǘƫƣƾǋƿƭǊƭǍǒǯǎǣǙǶǕƵǗǨƹǜǾǊǭȀǼǦǋ", (byte)114, 66);
                    NLoginCore_037.f[24] = NLoginCore_575.A("ǗƴǔƷǞƓƹƻƮƠǁǃǐǂƾƪǡǄƿǨƻƧǋǂƲƭǗǤǶǤƶǥ", (byte)114, 65);
                    NLoginCore_037.f[25] = NLoginCore_092.A("ƼǆǑƑǉƬǍǎƣǀƦǥƳǟƼƤƣǗƨƷƭƹƶƷ", (byte)114, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_037.f[0] = NLoginCore_110.B("ƸƶǕǝƜǟǃǋǒƽǀǢƞƦǟǇǔǅƶƿƾǯƶƷ", (byte)114, 66);
                    NLoginCore_037.f[1] = NLoginCore_027.D("գգՔպ՛՗՗և՞գ՗օՠգի՛֕սՍըչձ՞՟", (byte)114, 68);
                    NLoginCore_037.f[2] = NLoginCore_091.F("֒֙չ֖֔֘տՠվ֧֫լ֐ղ֫ւ֎յ֬֍֭֔ցւ", (byte)114, 70);
                    NLoginCore_037.f[3] = NLoginCore_004.D("մռփԽՈԻւպԾեՇՅռկխ՞֔օբ֏Քա՞՟", (byte)114, 68);
                    NLoginCore_037.f[4] = NLoginCore_138.A("ǕƮƻƾǓƺƽǒƟƣǖƧǗƛǋǨƥƥǞǈƫǎǰǉǐƫƳǧƴǪǌǍǨǙǖǐǺǶǻǵǼǵǁǋ", (byte)114, 65);
                    NLoginCore_037.f[5] = NLoginCore_559.A("ǙǋǆƪƵƿƔǏƺǥƺƵǈǜƶǋƫǘƿǗƪǉƶƷ", (byte)114, 65);
                    NLoginCore_037.f[6] = NLoginCore_384.C("Խկու՚ճՆեԾչո՟Տ՜Սվ՜յբ֒կձ՞՟", (byte)114, 67);
                    NLoginCore_037.f[7] = NLoginCore_575.C("Քւծչմօ՜ջմ՝ՉդՐ՝ՈւՑՏզ֕֕֗՞՟", (byte)114, 67);
                    NLoginCore_037.f[8] = NLoginCore_559.D("՗ՖբբՖ՚ռ՜լփկլՌչրլ֒֍֕ժմա՞՟", (byte)114, 68);
                    NLoginCore_037.f[9] = NLoginCore_324.E("ֆն֦֛պ֜զ֠տ֋֥֌֋֊յ֗րֲղլּքցւ", (byte)114, 69);
                    NLoginCore_037.f[10] = NLoginCore_559.E("էբ֑յ֘ոևիծռսն", (byte)114, 69);
                    NLoginCore_037.f[11] = NLoginCore_384.B("ƗǗǚƼƱƯǡǞƢƢƢǜǦƷǩǩǊǬǖƮƧǉƶƷ", (byte)114, 66);
                    NLoginCore_037.f[12] = NLoginCore_223.D("ցհֆշՅբ՜՛֌ըջ՝սժՉ֒֋րթօլև՞՟", (byte)114, 68);
                    NLoginCore_037.f[13] = NLoginCore_575.E("֗չ՟ք֠֍ֆլ֌թ֢ռցխյձ֟ժַ֣֘֔ցւ", (byte)114, 69);
                    NLoginCore_037.f[14] = NLoginCore_223.F("֐շ֤֒֝֨֘֘֎֭֌֋֒֏ֵַ֑րֱհ֒֔ցւ", (byte)114, 70);
                    NLoginCore_037.f[15] = NLoginCore_076.A("ǉƖƽǝƶǙƫǜƯǠǏǞǚǇǕǗƸǎǯƪǈǆǋƿǜǔǣƲǅǤǑǍǌǲǊǱǏƷƸǓǿǁǰǋ", (byte)114, 65);
                    NLoginCore_037.f[16] = NLoginCore_384.E("ռմջ֜և֘ց֡ռռսթֈ֝֌վֲֳ֤֤֩֔ցւ", (byte)114, 69);
                    NLoginCore_037.f[17] = NLoginCore_138.E("֖֚ձջո֖֝վ֤֏օ֋֔֌֍մւַփֵ֓քցւ", (byte)114, 69);
                    NLoginCore_037.f[18] = NLoginCore_223.A("ƽƶƼƿƺǍǂǚǁǟƮƝǉǇǘǪƷǋƾƼƭƹƶƷ", (byte)114, 65);
                    NLoginCore_037.f[19] = NLoginCore_138.B("ǔǛƦƮƞƟưƛƛƗǗƱƹơǧƣƺƧǏǘǪǑƮƾƲǀǧǐǱǱǈǷƷƴǱǫǒȀǌǤȃǰǹǀǓǅǝǽǉǖǜǊǼǩǖǗ", (byte)114, 66);
                    NLoginCore_037.f[20] = NLoginCore_223.B("ǏƗƽƾǓƭƾǔƱơǚǡǁǚǚǉƹǩƽǃǃǯƶƷ", (byte)114, 66);
                    NLoginCore_037.f[21] = NLoginCore_427.B("ǚƮƺƱǙƜǘǎǍǝƱƵơƩǣơǁǞǮǪǑǉƶƷ", (byte)114, 66);
                    NLoginCore_037.f[22] = NLoginCore_091.D("սդռՖՠրճցմՙՙՌսրՐրՓՋզճէ֖֗֘դ֏ճխ֠ն֑֢պգ֣ֆ֜ղփթ֪֎֎ճ", (byte)114, 68);
                    NLoginCore_037.f[23] = NLoginCore_173.A("ǕƼǔƮƸǘǋǙǌƱƱƤǕǘƨǘƫƣƾǋƿƭǊƭǍǒǯǎǣǙǶǕǝǯǯǲǚǋǁƵǼȃǒǋ", (byte)114, 65);
                    NLoginCore_037.f[24] = NLoginCore_453.E("֢տ֟ւ֩՞քֆչի֌֎֛֍։յ֬֏֊ֳֆְּ֮֫֟֫֟׀ռ֗֔", (byte)114, 69);
                    NLoginCore_037.f[25] = NLoginCore_138.F("և֑֜՜֔շ֘֙ծ֋է֦օմֳֵ֥֊ִ֢չ֪ցւ", (byte)114, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_037.f[0] = NLoginCore_223.A("ǈƕǖǇƟǔǑǘǝƣƤƦǓƟǈƢǝǠƭǨǚǯƶƷ", (byte)114, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_037.f[0] = NLoginCore_027.B("ǑǍǐƞƸǠǚƠƠǦƺƞǨǓƾǥƤǧǟƹǨǉƶƷ", (byte)114, 66);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_037.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.B("ÁãåÅéĈĀĖĂÑďąēčÖûĝĜĔĚĔé", (byte)13, 66), NLoginCore_037.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.B("üĉĈËċćĂċĖąÒĐĔčĐĖØѦюѪѬѩѷѧхѰѦѹћѳñ", (byte)13, 66) + string + NLoginCore_427.A("Ó", (byte)13, 65) + methodType.toString(), exception);
        }
    }
}

