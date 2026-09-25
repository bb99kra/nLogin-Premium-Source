/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_080;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_367
extends NLoginType_032 {
    private static int dg;
    private static int ay;
    private static long e;
    private static long dj;
    private static int bx;
    private static int bt;
    private static long bh;
    private static long dq;
    private static long bm;
    private static int av;
    private static int bc;
    private static int cm;
    private static int bq;
    private static long dc;
    private static long cx;
    private static int bv;
    private static long cq;
    private static int cc;
    private static int dd;
    private static long cj;
    private static int be;
    private static long cfr_renamed_1;
    private static int dt;
    private static int bi;
    private static int dp;
    private static int cz;
    private static long cr;
    private static long cb;
    private static int dk;
    private static int bf;
    private static int by;
    private static int dz;
    private static int cf;
    private static int bo;
    private static int bz;
    private static long du;
    private static long ce;
    private static long cu;
    private static long dl;
    private static int ax;
    private static long ct;
    private static long di;
    private static int co;
    private static int bs;
    private static long bj;
    private static long db;
    private static int da;
    private static long cn;
    private static int de;
    private static long bu;
    private static int aw;
    private static int ea;
    private static int az;
    private static long dw;
    private static int bl;
    private static int ds;
    private static long ck;
    private static int dv;
    private static long bk;
    private static int ca;
    private static long bg;
    private static int dh;
    private static int br;
    private static int bn;
    private static int bd;
    private static int df;
    private static int ch;
    private static int cd;
    private static int cp;
    private static int eb;
    private static int dy;
    private static int ci;
    private static int a;
    private static int ec;
    private static long dx;
    private static long bp;
    private static long dr;
    private static int bw;
    private static int cl;
    private static long dm;
    private static long ba;
    private static int cy;
    private static String[] d;
    private static int cv;
    private static long cg;
    private static int cs;
    private static long cw;
    private static int dn;
    private static String[] c;
    private static int bb;

    private static List<NLoginCore_248> a(ForceRegisterConfig ForceRegisterConfig2) {
        ArrayList<NLoginCore_248> arrayList = new ArrayList<NLoginCore_248>();
        NLoginCore_248[] NLoginCore_311Array = NLoginCore_248.values();
        int n = NLoginCore_311Array.length;
        for (int i = de; i < n; ++i) {
            NLoginCore_248 NLoginCore_3112 = NLoginCore_311Array[i];
            if (NLoginCore_3112.java_lang_String_b(ForceRegisterConfig2) == null) continue;
            arrayList.add(NLoginCore_3112);
        }
        return arrayList;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_367.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("¯ÑÓ³×öîĄð¿ýóāûÄéċĊĂĈĂ×", (byte)4, 65), NLoginCore_367.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆъјѕїўуєвѨєѦћирà", (byte)4, 65) + string + NLoginCore_324.D("ϻ", (byte)4, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2AL;
        l ^= 0xC7A73377B9FC6CAEL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(49 + 20), (byte)(54 + 29), (byte)(9 + 38), (byte)(12 + 55), (byte)(34 + 32), (byte)(10 + 57), (byte)(38 + 9), (byte)(47 + 33), (byte)(54 + 21), (byte)(36 + 31), (byte)(47 + 36), (byte)(14 + 39), (byte)(53 + 27), (byte)(57 + 40), (byte)(37 + 63), 100, (byte)(61 + 44), (byte)(103 + 7), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), (byte)(36 + 47)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣯ࣺࣽࣼःࣹࣨࣗऍࣹऋऀࣝࣥ", (byte)112, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_367.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        e = -6403028026020647299L;
        long l = e ^ 0xC7A73377B9FC6CAEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(57 + 12), (byte)(31 + 52), (byte)(35 + 12), (byte)(34 + 33), (byte)(59 + 7), (byte)(20 + 47), (byte)(8 + 39), (byte)(25 + 55), (byte)(16 + 59), (byte)(57 + 10), (byte)(21 + 62), 53, (byte)(47 + 33), (byte)(23 + 74), (byte)(65 + 35), 100, (byte)(40 + 65), (byte)(32 + 78), (byte)(19 + 84)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(40 + 29), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_367.d[0] = NLoginCore_091.F("Ս԰ՕՂԦԵԬԩՒՉ՚ԡ", (byte)29, 70);
                    NLoginCore_367.d[1] = NLoginCore_201.B("ĆăĳďĎóêĥĊĵĪā", (byte)29, 66);
                    NLoginCore_367.d[2] = NLoginCore_223.B("ĀāĪİģĢĆđĬúĦā", (byte)29, 66);
                    NLoginCore_367.d[3] = NLoginCore_575.D("ѵм҄јҊцѿъҌхѧє", (byte)29, 68);
                    NLoginCore_367.d[4] = NLoginCore_092.A("ĒĎĔĕĥĀĭāđĳĎĳĶñĕĔĜþčķĶļĜŁĽĦğĈĦĸŀŃ", (byte)29, 65);
                    NLoginCore_367.d[5] = NLoginCore_575.A("êħĀĦčĐñąñĆČā", (byte)29, 65);
                    NLoginCore_367.d[6] = NLoginCore_324.D("мќф҄Ѡѧ҄ѧщѣҍє", (byte)29, 68);
                    NLoginCore_367.d[7] = NLoginCore_201.C("њўћ҄сѦ҃ѷ҂ѝъє", (byte)29, 67);
                    NLoginCore_367.d[8] = NLoginCore_559.F("ԉԩԑՑԭԴՑԴԖ԰՚ԡ", (byte)29, 70);
                    NLoginCore_367.d[9] = NLoginCore_451.B("ćċĈıîēİĤįĊ÷ā", (byte)29, 66);
                    NLoginCore_367.d[10] = NLoginCore_138.D("ѦѱѠѹҁчн҅ѕцъѪ҃ѩўѣѯ҇ѦҍҁҒ҃҈ѬіѼѲѱјҒѵ", (byte)29, 68);
                    NLoginCore_367.d[11] = NLoginCore_384.D("т҃цѻћђѵѸҊѿҐѥѹҁҁѮѣѪѣѰ҉҈џѠ", (byte)29, 68);
                    NLoginCore_367.d[12] = NLoginCore_201.F("ԳԢԣԾԾԐՂ԰Օ՚ԓԡ", (byte)29, 70);
                    NLoginCore_367.d[13] = NLoginCore_201.B("ĀĥëĵćíăĪģĳĄā", (byte)29, 66);
                    NLoginCore_367.d[14] = NLoginCore_384.F("ԠՅԋՕԧԍԣՊՃՓԤԡ", (byte)29, 70);
                    NLoginCore_367.d[15] = NLoginCore_446.B("ĆăĳďĎóêĥĊĵĪā", (byte)29, 66);
                    NLoginCore_367.d[16] = NLoginCore_324.E("ՊՇԡՒՈՑԷԶՒԷԬՒՒ՞ԮԿՍՂՠՍՐԿԬԭ", (byte)29, 69);
                    NLoginCore_367.d[17] = NLoginCore_110.A("ĆăĳďĎóêĥĊĵĪā", (byte)29, 65);
                    NLoginCore_367.d[18] = NLoginCore_004.F("ՊՇԡՒՈՑԷԶՒԷԮԷԭՇՙՀԭԹԶԻՏՕԬԭ", (byte)29, 70);
                    NLoginCore_367.d[19] = NLoginCore_091.D("ѵм҄јҊцѿъҌхѧє", (byte)29, 68);
                    NLoginCore_367.d[20] = NLoginCore_092.D("ѥѡѧѨѸѓҀєѤ҆ѡ҆҉фѨѧѯёѠҊ҉ҏѯҔҐѹѲћѹҋғҖ", (byte)29, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_367.d[0] = NLoginCore_138.C("оѓѨіцѪѺѩѪҁѧє", (byte)29, 67);
                    NLoginCore_367.d[1] = NLoginCore_324.E("ԒԳԢԝՕԬԣՊՄԖԛԡ", (byte)29, 69);
                    NLoginCore_367.d[2] = NLoginCore_004.C("ђ҃ѹуѽѧчєљѸює", (byte)29, 67);
                    NLoginCore_367.d[3] = NLoginCore_027.A("ăòįĒďĀħĥēĲĄā", (byte)29, 65);
                    NLoginCore_367.d[4] = NLoginCore_324.A("ĒĎĔĕĥĀĭāđĳĎĳĶñĕĔĜþčķĶĺĺĥļĔōĿĨĹŎđ", (byte)29, 65);
                    NLoginCore_367.d[5] = NLoginCore_091.E("ՄԅՎՍԏՍԥԵԤ԰ԥԷՎՇ՘ԬՑՀԯԼեՕԬԭ", (byte)29, 69);
                    NLoginCore_367.d[6] = NLoginCore_559.D("ќѠйфѶѼѻіҌѭѫє", (byte)29, 68);
                    NLoginCore_367.d[7] = NLoginCore_110.F("ԜԼԭԏՃՆ՗ՒՙԸԼԡ", (byte)29, 70);
                    NLoginCore_367.d[8] = NLoginCore_451.B("ąČĮíìĥċ÷ĄĪĲā", (byte)29, 66);
                    NLoginCore_367.d[9] = NLoginCore_201.F("ՎՏՏԍՅՄՌՎԳԻԸԡ", (byte)29, 70);
                    NLoginCore_367.d[10] = NLoginCore_453.D("ѦѱѠѹҁчн҅ѕцъѪ҃ѩўѣѯ҇ѦҍҁҒѯґѯѱѳѪҐѰҙ҂ҖңҥҦѧҖҨңѶѪ҇Ѵ", (byte)29, 68);
                    NLoginCore_367.d[11] = NLoginCore_091.F("ԏՐԓՈԨԟՂՅ՗Ռ՚ԓԭԹ՟Ծԛ԰ԡԺ՚եԬԭ", (byte)29, 70);
                    NLoginCore_367.d[12] = NLoginCore_223.B("ĀĞăĔîġĳġĘĺĪā", (byte)29, 66);
                    NLoginCore_367.d[13] = NLoginCore_387.F("ԳԓՀԞՁՕԸՅՄԳԓԡ", (byte)29, 70);
                    NLoginCore_367.d[14] = NLoginCore_384.F("ՎԠԯՓՆԸՉ՚ՋՐԸԡ", (byte)29, 70);
                    NLoginCore_367.d[15] = NLoginCore_091.B("ģĒĊĕôāĎĊĥīĲā", (byte)29, 66);
                    NLoginCore_367.d[16] = NLoginCore_451.A("ĪħāĲĨıėĖĲėĎĳĚĚûĊýĺĬûĦďČč", (byte)29, 65);
                    NLoginCore_367.d[17] = NLoginCore_027.E("ՌՍԝԑԕԥԖԒԫ՜԰ԡ", (byte)29, 69);
                    NLoginCore_367.d[18] = NLoginCore_451.D("ѽѺє҅ѻ҄Ѫѩ҅ѪџјџҎѓҀьѠѥ҂ѪѲџѠ", (byte)29, 68);
                    NLoginCore_367.d[19] = NLoginCore_201.D("ѐмѨѵѱѽщљѸчїє", (byte)29, 68);
                    NLoginCore_367.d[20] = NLoginCore_559.D("ѥѡѧѨѸѓҀєѤ҆ѡ҆҉фѨѧѯёѠҊ҉ғѦҍѾґҠѫҚѡҢѳ", (byte)29, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_367.d[0] = NLoginCore_091.A("īĳĎģôĆêĪĲčĖ÷ĕĽĺĒĵĬýńĤĕđļŊļĬĢĿĪİĦ", (byte)29, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_367.d[0] = NLoginCore_091.D("ҀуѰѥ҉єщщ҉҇њќ҂Ѧ҂҃ҐғѱђѪѢџѠ", (byte)29, 68);
                }
            }
        }
    }

    static {
        a = 0 >>> 232 | 0 << ~232 + 1;
        av = Integer.reverse(0);
        aw = Integer.reverse(0);
        ax = (65536 >>> 208 | 65536 << -208) & 0xFFFFFFFF;
        ay = Integer.reverse(0);
        az = (0 >>> 74 | 0 << ~74 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(-1552382346924407579L);
        bb = 0 >>> 26 | 0 << -26;
        bc = Integer.reverse(Integer.MIN_VALUE);
        bd = (16384 >>> 238 | 16384 << -238) & 0xFFFFFFFF;
        be = (0 >>> 144 | 0 << -144) & 0xFFFFFFFF;
        bf = (4096 >>> 236 | 4096 << -236) & 0xFFFFFFFF;
        bg = Long.reverse(-4722916484593236763L);
        bh = Long.reverse(0x5400000000000000L);
        bi = (262144 >>> 49 | 262144 << ~49 + 1) & 0xFFFFFFFF;
        bj = Long.reverse(-4722916484593236763L);
        bk = Long.reverse(0x5400000000000000L);
        bl = Integer.reverse(-1073741824);
        bm = Long.reverse(-1552382346924407579L);
        bn = Integer.reverse(0x20000000);
        bo = Integer.reverse(-1);
        bp = Long.reverse(-1552382346924407579L);
        bq = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        br = (0 >>> 139 | 0 << -139) & 0xFFFFFFFF;
        bs = 655360 >>> 17 | 655360 << ~17 + 1;
        bt = (-1 >>> 188 | -1 << -188) & 0xFFFFFFFF;
        bu = Long.reverse(-1552382346924407579L);
        bv = (0 >>> 61 | 0 << ~61 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = Integer.reverse(0);
        by = (6144 >>> 43 | 6144 << ~43 + 1) & 0xFFFFFFFF;
        bz = 0x300000 >>> 147 | 0x300000 << -147;
        ca = Integer.reverse(-1);
        cb = Long.reverse(-1552382346924407579L);
        cc = 896 >>> 103 | 896 << -103;
        cd = -1 >>> 105 | -1 << ~105 + 1;
        ce = Long.reverse(-1552382346924407579L);
        cf = Integer.reverse(0x10000000);
        cg = Long.reverse(-1552382346924407579L);
        ch = (0x100000 >>> 20 | 0x100000 << -20) & 0xFFFFFFFF;
        ci = Integer.reverse(-1879048192);
        cj = Long.reverse(-4722916484593236763L);
        ck = Long.reverse(0x5400000000000000L);
        cl = Integer.reverse(Integer.MIN_VALUE);
        cm = 20 >>> 129 | 20 << ~129 + 1;
        cn = Long.reverse(-1552382346924407579L);
        co = Integer.reverse(0);
        cp = Integer.reverse(-805306368);
        cq = Long.reverse(-4722916484593236763L);
        cr = Long.reverse(0x5400000000000000L);
        cs = Integer.reverse(0x30000000);
        ct = Long.reverse(-4722916484593236763L);
        cu = Long.reverse(0x5400000000000000L);
        cv = 425984 >>> 47 | 425984 << ~47 + 1;
        cw = Long.reverse(-4722916484593236763L);
        cx = Long.reverse(0x5400000000000000L);
        cy = (0 >>> 207 | 0 << -207) & 0xFFFFFFFF;
        cz = (64 >>> 230 | 64 << ~230 + 1) & 0xFFFFFFFF;
        da = (1792 >>> 231 | 1792 << ~231 + 1) & 0xFFFFFFFF;
        db = Long.reverse(-4722916484593236763L);
        dc = Long.reverse(0x5400000000000000L);
        dd = Integer.reverse(Integer.MIN_VALUE);
        de = 0 >>> 108 | 0 << ~108 + 1;
        df = (262144 >>> 178 | 262144 << -178) & 0xFFFFFFFF;
        dg = Integer.reverse(0);
        dh = (15360 >>> 10 | 15360 << ~10 + 1) & 0xFFFFFFFF;
        di = Long.reverse(-4722916484593236763L);
        dj = Long.reverse(0x5400000000000000L);
        dk = (128 >>> 99 | 128 << ~99 + 1) & 0xFFFFFFFF;
        dl = Long.reverse(-4722916484593236763L);
        dm = Long.reverse(0x5400000000000000L);
        dn = (0x4400000 >>> 22 | 0x4400000 << ~22 + 1) & 0xFFFFFFFF;
        cfr_renamed_1 = Long.reverse(-1552382346924407579L);
        dp = Integer.reverse(0x48000000);
        dq = Long.reverse(-4722916484593236763L);
        dr = Long.reverse(0x5400000000000000L);
        ds = Integer.reverse(-939524096);
        dt = Integer.reverse(-1);
        du = Long.reverse(-1552382346924407579L);
        dv = 160 >>> 195 | 160 << -195;
        dw = Long.reverse(-4722916484593236763L);
        dx = Long.reverse(0x5400000000000000L);
        dy = (32 >>> 132 | 32 << -132) & 0xFFFFFFFF;
        dz = (0 >>> 153 | 0 << -153) & 0xFFFFFFFF;
        ea = Integer.reverse(Integer.MIN_VALUE);
        eb = (-1610612734 >>> 221 | -1610612734 << ~221 + 1) & 0xFFFFFFFF;
        ec = Integer.reverse(-1476395008);
        c = new String[eb];
        d = new String[ec];
        NLoginCore_367.b();
    }

    public static boolean a(NLoginType_008 NLoginType_008, ForceRegisterConfig ForceRegisterConfig2) {
        return NLoginCore_367.a(ForceRegisterConfig2).stream().anyMatch(NLoginCore_3112 -> (NLoginCore_3112.d(NLoginType_008) && NLoginCore_3112.com_nickuc_login_NLoginInterface_038_a(NLoginType_008).aF() ? df : dg) != 0);
    }

    public NLoginCore_367(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
    }

    @Override
    protected void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.z, new Object[a]);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a();
        if (NLoginCore_1872.boolean_b(NLoginCore_277)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.F, new Object[av]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_f, new Object[aw]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        List<NLoginCore_248> list = NLoginCore_367.a(ForceRegisterConfig2);
        switch (list.size()) {
            case 0: {
                Object[] objectArray = new Object[ax];
                objectArray[NLoginCore_367.ay] = NLoginCore_367.c("㺀", (int)az, (long)ba);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.aj, objectArray);
                break;
            }
            case 1: {
                NLoginCore_466 NLoginCore_4662;
                NLoginCore_248 NLoginCore_3113 = list.get(bb);
                switch (NLoginCore_080.d[NLoginCore_3113.ordinal()]) {
                    case 1: {
                        NLoginCore_4662 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_d;
                        break;
                    }
                    case 2: {
                        NLoginCore_4662 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_e;
                        if (stringArray.length == bc) break;
                        Object[] objectArray = new Object[bd];
                        objectArray[NLoginCore_367.be] = (String)NLoginCore_367.c("㺃", (int)bf, (long)(bg ^ bh)) + string + (String)NLoginCore_367.c("㺆", (int)bi, (long)(bj ^ bk)) + NLoginCore_3113.u() + (String)NLoginCore_367.c("㺉", (int)bl, (long)bm);
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
                        return;
                    }
                    default: {
                        throw new IllegalStateException((String)NLoginCore_367.c("㺌", (int)(bn & bo), (long)bp) + list);
                    }
                }
                String[] stringArray2 = new String[stringArray.length + bq];
                stringArray2[NLoginCore_367.br] = NLoginCore_367.c("㺏", (int)(bs & bt), (long)bu);
                System.arraycopy(stringArray, bv, stringArray2, bw, stringArray.length);
                NLoginCore_4662.a(NLoginCore_277, NLoginCore_5092, stringArray2);
                break;
            }
            default: {
                NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
                List<String> list2 = NLoginCore_150.a(NLoginCore_374.at, NLoginCore_277, new Object[bx]);
                for (String string2 : list2) {
                    if (string2.length() > by && string2.contains((CharSequence)NLoginCore_367.c("㺒", (int)(bz & ca), (long)cb)) && string2.contains((CharSequence)NLoginCore_367.c("㺕", (int)(cc & cd), (long)ce))) {
                        int n = string2.indexOf((String)NLoginCore_367.c("㺘", (int)cf, (long)cg)) + ch;
                        int n2 = string2.lastIndexOf((String)NLoginCore_367.c("㺛", (int)ci, (long)(cj ^ ck)));
                        if (n2 - n <= cl) {
                            throw new IllegalArgumentException((String)NLoginCore_367.c("㺞", (int)cm, (long)cn) + ((NLoginCore_474)NLoginCore_374.at.java_lang_Object_a()).a()[co] + (String)NLoginCore_367.c("㺡", (int)cp, (long)(cq ^ cr)) + string2 + (String)NLoginCore_367.c("㺤", (int)cs, (long)(ct ^ cu)));
                        }
                        Object object = NLoginCore_367.c("㺧", (int)cv, (long)(cw ^ cx));
                        if (n > 0) {
                            object = string2.substring(cy, n - cz);
                        }
                        Object object2 = NLoginCore_367.c("㺪", (int)da, (long)(db ^ dc));
                        if (n2 + dd != string2.length()) {
                            object2 = string2.substring(n2);
                        }
                        String string3 = (String)object + string2.substring(n, n2) + (String)object2;
                        list.forEach(NLoginCore_3112 -> {
                            String string2;
                            String string3;
                            switch (NLoginCore_080.d[NLoginCore_3112.ordinal()]) {
                                case 1: {
                                    string3 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_d.a().aa();
                                    string2 = (String)NLoginCore_367.c("㺀", (int)dh, (long)(di ^ dj)) + string3 + (String)NLoginCore_367.c("㺃", (int)dk, (long)(dl ^ dm));
                                    break;
                                }
                                case 2: {
                                    string3 = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_e.a().aa();
                                    string2 = (String)NLoginCore_367.c("㺆", (int)dn, (long)cfr_renamed_1) + string3 + (String)NLoginCore_367.c("㺉", (int)dp, (long)(dq ^ dr)) + NLoginCore_3112.u() + (String)NLoginCore_367.c("㺌", (int)(ds & dt), (long)du);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException((String)NLoginCore_367.c("㺏", (int)dv, (long)(dw ^ dx)) + (Object)NLoginCore_3112);
                                }
                            }
                            Object[] objectArray = new Object[dy];
                            objectArray[NLoginCore_367.dz] = NLoginCore_112.t(NLoginCore_3112.u());
                            objectArray[NLoginCore_367.ea] = string3;
                            NLoginInterface_0242.e(NLoginCore_112.a(string3, objectArray), string2);
                        });
                        continue;
                    }
                    NLoginInterface_0242.a(string2);
                }
            }
        }
    }
}

