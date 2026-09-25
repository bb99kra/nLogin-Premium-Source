/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.HikariConnectionPool;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_536;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_034
extends HikariConnectionPool {
    private static int y;
    private static int ct;
    private static int da;
    private static long cd;
    private static long w;
    private static long k;
    private static int bq;
    private static long bp;
    private static String[] c;
    private static long br;
    private static long cj;
    private static long bd;
    private static int cr;
    private static long ch;
    private static long by;
    private static int co;
    private static int var_int_d;
    private static long cp;
    private static int bt;
    private static long aw;
    private static long cq;
    private static int bn;
    private static int i;
    private static long t;
    private static long bi;
    private static int ai;
    private static long cs;
    private static long ck;
    private static long r;
    private static int ax;
    private static long cx;
    private static int bw;
    private static long at;
    private static long n;
    private static long cn;
    private static long cm;
    private static int bg;
    private static long ag;
    private static long cy;
    private static long bx;
    private static long q;
    private static long aa;
    private static long bo;
    private static long ao;
    private static long bu;
    private static long bv;
    private static int dc;
    private static long cb;
    private static int ca;
    private static long bs;
    private static long az;
    private static int cw;
    private static long bl;
    private static int cz;
    private static int o;
    private static int bj;
    private static long x;
    private static String[] var_java_lang_String_arr_d;
    private static int bz;
    private static int dd;
    private static int ci;
    private static long aj;
    private static long al;
    private static long ae;
    private static long cg;
    private static int am;
    private static long h;
    private static long bm;
    private static int u;
    private static long cu;
    private static int l;
    private static int as;
    private static int cl;
    private static long aq;
    private static long ce;
    private static int ac;
    private static long f;
    private static int cf;
    private static int s;
    private static int cc;
    private static int j;
    private static long cv;
    private static long db;

    public static NLoginCore_034 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return NLoginCore_034.a(NLoginInterface_0112, NLoginCore_147, null);
    }

    static {
        var_int_d = Integer.reverse(0);
        h = Long.reverse(-2520615094567006950L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(-1);
        k = Long.reverse(-2520615094567006950L);
        l = Integer.reverse(0x40000000);
        n = Long.reverse(-2520615094567006950L);
        o = (0xC00000 >>> 182 | 0xC00000 << -182) & 0xFFFFFFFF;
        q = Long.reverse(-8861683369904665318L);
        r = Long.reverse(0x5800000000000000L);
        s = 32 >>> 3 | 32 << -3;
        t = Long.reverse(-2520615094567006950L);
        u = Integer.reverse(-1610612736);
        w = Long.reverse(-8861683369904665318L);
        x = Long.reverse(0x5800000000000000L);
        y = Integer.reverse(0x60000000);
        aa = Long.reverse(-2520615094567006950L);
        ac = 7168 >>> 202 | 7168 << -202;
        ae = Long.reverse(-8861683369904665318L);
        ag = Long.reverse(0x5800000000000000L);
        ai = Integer.reverse(0x10000000);
        aj = Long.reverse(-8861683369904665318L);
        al = Long.reverse(0x5800000000000000L);
        am = Integer.reverse(-1879048192);
        ao = Long.reverse(-8861683369904665318L);
        aq = Long.reverse(0x5800000000000000L);
        as = -1610612736 >>> 92 | -1610612736 << -92;
        at = Long.reverse(-8861683369904665318L);
        aw = Long.reverse(0x5800000000000000L);
        ax = Integer.reverse(-805306368);
        az = Long.reverse(-8861683369904665318L);
        bd = Long.reverse(0x5800000000000000L);
        bg = 196608 >>> 78 | 196608 << -78;
        bi = Long.reverse(-2520615094567006950L);
        bj = (0x1A0000 >>> 241 | 0x1A0000 << -241) & 0xFFFFFFFF;
        bl = Long.reverse(-8861683369904665318L);
        bm = Long.reverse(0x5800000000000000L);
        bn = (-536870912 >>> 60 | -536870912 << ~60 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(-8861683369904665318L);
        bp = Long.reverse(0x5800000000000000L);
        bq = (15360 >>> 202 | 15360 << ~202 + 1) & 0xFFFFFFFF;
        br = Long.reverse(-8861683369904665318L);
        bs = Long.reverse(0x5800000000000000L);
        bt = (64 >>> 2 | 64 << -2) & 0xFFFFFFFF;
        bu = Long.reverse(-8861683369904665318L);
        bv = Long.reverse(0x5800000000000000L);
        bw = Integer.reverse(-2013265920);
        bx = Long.reverse(-8861683369904665318L);
        by = Long.reverse(0x5800000000000000L);
        bz = (294912 >>> 142 | 294912 << -142) & 0xFFFFFFFF;
        ca = (-1 >>> 253 | -1 << ~253 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(-2520615094567006950L);
        cc = 1216 >>> 102 | 1216 << ~102 + 1;
        cd = Long.reverse(-8861683369904665318L);
        ce = Long.reverse(0x5800000000000000L);
        cf = 1280 >>> 134 | 1280 << -134;
        cg = Long.reverse(-8861683369904665318L);
        ch = Long.reverse(0x5800000000000000L);
        ci = Integer.reverse(-1476395008);
        cj = Long.reverse(-8861683369904665318L);
        ck = Long.reverse(0x5800000000000000L);
        cl = 720896 >>> 15 | 720896 << -15;
        cm = Long.reverse(-8861683369904665318L);
        cn = Long.reverse(0x5800000000000000L);
        co = Integer.reverse(-402653184);
        cp = Long.reverse(-8861683369904665318L);
        cq = Long.reverse(0x5800000000000000L);
        cr = (48 >>> 193 | 48 << ~193 + 1) & 0xFFFFFFFF;
        cs = Long.reverse(-2520615094567006950L);
        ct = (51200 >>> 139 | 51200 << ~139 + 1) & 0xFFFFFFFF;
        cu = Long.reverse(-8861683369904665318L);
        cv = Long.reverse(0x5800000000000000L);
        cw = (832 >>> 133 | 832 << -133) & 0xFFFFFFFF;
        cx = Long.reverse(-8861683369904665318L);
        cy = Long.reverse(0x5800000000000000L);
        cz = (-1342177279 >>> 92 | -1342177279 << -92) & 0xFFFFFFFF;
        da = (-1 >>> 165 | -1 << -165) & 0xFFFFFFFF;
        db = Long.reverse(-2520615094567006950L);
        dc = 917504 >>> 79 | 917504 << -79;
        dd = (229376 >>> 13 | 229376 << -13) & 0xFFFFFFFF;
        c = new String[dc];
        var_java_lang_String_arr_d = new String[dd];
        NLoginCore_034.b();
    }

    public static NLoginCore_034 b(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return new NLoginCore_034(NLoginInterface_0112, NLoginCore_147, null, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_b);
    }

    private NLoginCore_034(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer, NLoginCore_536 NLoginCore_5362) {
        super(NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d, NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_5362);
    }

    @Override
    protected String w() {
        return NLoginCore_034.c("㺀", (int)var_int_d, (long)h);
    }

    private static String a(int n, long l) {
        l ^= 0x1AL;
        l ^= 0xD7F95122070EA7E1L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(33 + 36), (byte)(53 + 30), (byte)(32 + 15), (byte)(2 + 65), (byte)(2 + 64), (byte)(30 + 37), (byte)(36 + 11), 80, (byte)(41 + 34), (byte)(48 + 19), (byte)(74 + 9), 53, (byte)(50 + 30), (byte)(50 + 47), (byte)(80 + 20), (byte)(36 + 64), (byte)(14 + 91), (byte)(55 + 55), (byte)(28 + 75)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("йцхЈшфпшѓтЏэёъэѓЕީޡޜޫޯޕިޟޢްޣ޳", (byte)11, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_034.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public static NLoginCore_034 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer) {
        return new NLoginCore_034(NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_a);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_034.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ԰ՕշնծմծՃ", (byte)55, 70), NLoginCore_034.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬӀҸҳӂӆҬҿҶҹӇҺӊń", (byte)55, 65) + string + NLoginCore_110.E("ԭ", (byte)55, 69) + methodType.toString(), exception);
        }
    }

    @Override
    protected void a(HikariConfig hikariConfig, NLoginCore_147 NLoginCore_147) {
        hikariConfig.setDriverClassName(this.w());
        hikariConfig.setJdbcUrl(this.java_lang_String_a(NLoginCore_147));
        hikariConfig.setUsername(NLoginCore_147.z());
        hikariConfig.setPassword(NLoginCore_147.java_lang_String_j());
    }

    private static void b() {
        int n;
        f = 6390919053289922721L;
        long l = f ^ 0xD7F95122070EA7E1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(58 + 11), (byte)(59 + 24), (byte)(11 + 36), (byte)(19 + 48), (byte)(61 + 5), (byte)(35 + 32), (byte)(23 + 24), (byte)(53 + 27), (byte)(54 + 21), (byte)(31 + 36), (byte)(78 + 5), (byte)(17 + 36), (byte)(21 + 59), (byte)(38 + 59), (byte)(56 + 44), (byte)(96 + 4), (byte)(93 + 12), 110, 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_034.var_java_lang_String_arr_d[0] = NLoginCore_575.B("ĤęēŃĉłňğĊčĻŅěŀİĽįŖīĖŃħēĵĻŜĠĚŠŢŘĠğšŤĥńĩĿŉŘĸşĽšĪŠŴŕœŉűķŬŪűķĶŷŵŔłšƂ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[1] = NLoginCore_201.E("ՄՈ՛ՊԲՌԝԟՖգԘՅՒԵբըՆժՇԿՄՉԶԷ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[2] = NLoginCore_559.A("ĮİėĹĕĴĵģġŇĨĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[3] = NLoginCore_387.D("ќҢѼғҡѳҙѹ҃ѸѬѲ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[4] = NLoginCore_110.E("՜ԛԽԳՙԡՐԵԝՙԯՇՂՄՅ՛ՃԾԻդթ՟ԶԷ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[5] = NLoginCore_092.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[6] = NLoginCore_091.D("ѽѴҤҒҏ҅ѹҖҫѧѫҥҩҠңұѳҪұҗ҈ҹҫҲҒѸҐѰҫҏѾҵ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[7] = NLoginCore_324.B("ĒĤłĲĜėğĕċŇĤĕ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[8] = NLoginCore_324.D("ѽѴҤҒҏ҅ѹҖҫѧѪҡѽѰ҂ѪҤҴ҆ғҌ҅ҏѵҺһҙҮғҘҀҙ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[9] = NLoginCore_427.B("ĕĳİćĲīĸĜľŉłĕ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[10] = NLoginCore_384.B("ĴěľĵćĶĚėĥňċŐĐďŎĝōĥķŕĢņĪĽėŀėĺŚśōĴ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[11] = NLoginCore_092.C("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[12] = NLoginCore_091.E("՜ԶՊՌաՠԢԴԿՔՖաԦ՗ՅԨազզ՚դ՜ժէ՜էՃխՔծԹդ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[13] = NLoginCore_451.E("ՓՕՏԳԪ՚ԲՠբՔԥԫ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[14] = NLoginCore_453.D("ѵѿҔѷ҆ѤҁѴҞҗҕҠҁҏҪҋҲҕ҅ҕҪҀҡұҲҵҫҲҽҮҝҬҶҞҶѽӃ҄҄Ӊҕ҇ҷҒ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[15] = NLoginCore_451.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[16] = NLoginCore_559.C("ҘҡѱѲѼ҆ҔѪѝҗѷҪҜҟҙҭқѦүҠҶҁҌҤѸҵҝҏҶҠҐҕ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[17] = NLoginCore_446.D("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[18] = NLoginCore_387.C("ќғҙ҂Ҟ҄ҁќқѷѼ҃ѬҨ҂Ґ҆ҧҀҬҐҭҨҗҎҹҨѷҿҷҢ҂Ғ҄ҢҎѾқҩҔҽҥӋҒ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[19] = NLoginCore_027.B("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[20] = NLoginCore_575.B("ŀġĕŇŅĴĞĺįįĻħĲĥıŖĐŐĬŎŃŅēŐŗĞĳĞĸřĲő", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[21] = NLoginCore_201.A("ĽĿĹĝĔńĜŊŌľďĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[22] = NLoginCore_451.F("ԸԕՉՌՕԙԚԸԠգ՟ՆԴԸՀԪՄ՞ՃհԾԹ՚հԱՂՆՎԴաձը", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[23] = NLoginCore_004.B("ĽĒęğĹĤėŉĖňľĕ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[24] = NLoginCore_092.B("ĵĸěŁĝĕČĕĤłįŉĄőŃĮġĤńŐĶŋŚĳŒħķĴŗĳĞģ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[25] = NLoginCore_027.C("ҚѯѶѼҖҁѴҦѳҥқѲ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[26] = NLoginCore_324.F("ԴՅԵԖՎ՟ՓԺ՘Ը՜԰՟ԴՅԴ՗ՙ՘ՄՍԽՀ԰բնՊնկ԰Քն", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[27] = NLoginCore_027.D("ҚҜҖѺѱҡѹҧҩқѬѲ", (byte)39, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_034.var_java_lang_String_arr_d[0] = NLoginCore_223.B("ĤęēŃĉłňğĊčĻŅěŀİĽįŖīĖŃħēĵĻŜĠĚŠŢŘĠğšŤĥńĩĿŉŘĸşĽšĪŠŴŕœŉűķŰĵŶļľĹŎŎřŌž", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[1] = NLoginCore_138.D("ҋҏҢґѹғѤѦҝҪѣҧѿҐ҅҄ҪҵѵҳѿҶѽѾ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[2] = NLoginCore_559.C("њѵҕѝўҙ҃ҕ҉ѽқѲ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[3] = NLoginCore_027.A("ĹĀŃĶĹĨęĿğďľĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[4] = NLoginCore_559.F("՜ԛԽԳՙԡՐԵԝՙԯՃԼբՀ՟ԾԨԧԪՄՠծ԰Խ՞ծՅՓն՘Ե", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[5] = NLoginCore_384.F("ՄԭԻԾԠԭԾԞԠԾՠԫ", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[6] = NLoginCore_027.A("ĠėŇĵĲĨĜĹŎĊĎňŌŃņŔĖōŔĺīđĭĸœŠİőĿįġń", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[7] = NLoginCore_223.A("ĹąĀĠĶĵĹĮĪńĤĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[8] = NLoginCore_387.E("Զԭ՝ՋՈԾԲՏդԠԣ՚ԶԩԻԣ՝խԿՌՅՄԿՒգՇԬՖեՕղԲ՛շ՗ԱՖՎԹՏՒտզՋ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[9] = NLoginCore_427.D("ѭҥѳңҢѦѵѽғҖѽѲ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[10] = NLoginCore_446.E("ՊԱՔՋԝՌ԰ԭԻ՞ԡզԦԥդԳգԻՍիԸ՚ԱՎխԿԵէԶծՂՆ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[11] = NLoginCore_384.D("ҎўѡѱґѰҗѸҫѿҭҝҘҎңѯҐґҀҬҰҶѽѾ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[12] = NLoginCore_324.B("ņĠĴĶŋŊČĞĩľŀŋĐŁįĒŋŐŐńŎĳīňőőŌœĜĢŗĥ", (byte)39, 66);
                    NLoginCore_034.var_java_lang_String_arr_d[13] = NLoginCore_201.A("ĐķĵŊĜĩĸĉĆĤćĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[14] = NLoginCore_201.E("ԮԸՍ԰ԿԝԺԭ՗ՐՎՙԺՈգՄիՎԾՎգԹ՚ժիծդինէՖեՊՅղձՒպգ՞ՕպՁՋ", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[15] = NLoginCore_384.A("ĂđĘĄŃĺĻćłīŊĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[16] = NLoginCore_138.F("Ց՚ԪԫԵԿՍԣԖՐ԰գՕ՘ՒզՔԟըՙկԺդԱէհՓ԰ոԶԵՙհՙՓշՕԿաՏՀսոՋ", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[17] = NLoginCore_324.F("ԛԽՉԴՈԫՃՎԮԠԱՙԥՄՒՅԫէՖիԻկԶԷ", (byte)39, 70);
                    NLoginCore_034.var_java_lang_String_arr_d[18] = NLoginCore_324.D("ќғҙ҂Ҟ҄ҁќқѷѼ҃ѬҨ҂Ґ҆ҧҀҬҐҭҨҗҎҹҨѷҿҷҢ҂ҋҤѻҔ҄ҁґқѽҺӃҒ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[19] = NLoginCore_110.D("ћҀѣҏѡҐѹҧҋ҃ҧѲ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[20] = NLoginCore_027.A("ŀġĕŇŅĴĞĺįįĻħĲĥıŖĐŐĬŎŃĸŊĥĨīĬŕĵĝĶĴ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[21] = NLoginCore_427.A("ĔėŅĂĆĶěľĮĥĤĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[22] = NLoginCore_384.A("ĢÿĳĶĿăĄĢĊōŉİĞĢĪĔĮňĭŚĨİŘŒĖŇĞĘŢĚŐŒ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[23] = NLoginCore_027.A("ėąĴćğĝĠŁĊĝľĕ", (byte)39, 65);
                    NLoginCore_034.var_java_lang_String_arr_d[24] = NLoginCore_384.C("ҒҕѸҞѺѲѩѲҁҟҌҦѡҮҠҋѾҁҡҭғҩґѸҳ҈ұҬѵҒүҾҵҿѻҀң҂ҿҟӀӂҌҒ", (byte)39, 67);
                    NLoginCore_034.var_java_lang_String_arr_d[25] = NLoginCore_384.D("ҎҍҒ҄Ҡѷѧ҉ѸѬҫѲ", (byte)39, 68);
                    NLoginCore_034.var_java_lang_String_arr_d[26] = NLoginCore_027.E("ԴՅԵԖՎ՟ՓԺ՘Ը՜԰՟ԴՅԴ՗ՙ՘ՄՍՆԨ՞ՠյԴԳՏնեն", (byte)39, 69);
                    NLoginCore_034.var_java_lang_String_arr_d[27] = NLoginCore_201.C("җѷѝҕҔҚѸ҅҆ѤқѲ", (byte)39, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_034.var_java_lang_String_arr_d[0] = NLoginCore_091.D("ҤњҖ҃ҧҚҠҗҜѴҝ҃ҙѰҝҰҔҰҁҭҎҦѽѾ", (byte)39, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_034.var_java_lang_String_arr_d[0] = NLoginCore_384.C("ѺқҒѺѿѸѳңҤҦѼҞѾҭҡҮҁҧҳѿҗҫѵҙҫҦҷҞҖҏѹҠ", (byte)39, 67);
                }
            }
        }
    }

    @Override
    protected String java_lang_String_a(NLoginCore_147 NLoginCore_147) {
        return (String)NLoginCore_034.c("㺀", (int)(i & j), (long)k) + NLoginCore_147.x() + (String)NLoginCore_034.c("㺃", (int)l, (long)n) + NLoginCore_147.int_j() + (String)NLoginCore_034.c("㺆", (int)o, (long)(q ^ r)) + NLoginCore_147.y();
    }

    @Override
    protected void a(Properties properties, boolean bl) {
        super.a(properties, bl);
        if (bl) {
            properties.putIfAbsent(NLoginCore_034.c("㺀", (int)s, (long)t), NLoginCore_034.c("㺃", (int)u, (long)(w ^ x)));
            properties.putIfAbsent(NLoginCore_034.c("㺆", (int)y, (long)aa), NLoginCore_034.c("㺉", (int)ac, (long)(ae ^ ag)));
            properties.putIfAbsent(NLoginCore_034.c("㺌", (int)ai, (long)(aj ^ al)), NLoginCore_034.c("㺏", (int)am, (long)(ao ^ aq)));
            properties.putIfAbsent(NLoginCore_034.c("㺒", (int)as, (long)(at ^ aw)), NLoginCore_034.c("㺕", (int)ax, (long)(az ^ bd)));
            properties.putIfAbsent(NLoginCore_034.c("㺘", (int)bg, (long)bi), NLoginCore_034.c("㺛", (int)bj, (long)(NLoginCore_034.bl ^ bm)));
            properties.putIfAbsent(NLoginCore_034.c("㺞", (int)bn, (long)(bo ^ bp)), NLoginCore_034.c("㺡", (int)bq, (long)(br ^ bs)));
            properties.putIfAbsent(NLoginCore_034.c("㺤", (int)bt, (long)(bu ^ bv)), NLoginCore_034.c("㺧", (int)bw, (long)(bx ^ by)));
            properties.putIfAbsent(NLoginCore_034.c("㺪", (int)(bz & ca), (long)cb), NLoginCore_034.c("㺭", (int)cc, (long)(cd ^ ce)));
            properties.putIfAbsent(NLoginCore_034.c("㺰", (int)cf, (long)(cg ^ ch)), NLoginCore_034.c("㺳", (int)ci, (long)(cj ^ ck)));
            properties.putIfAbsent(NLoginCore_034.c("㺶", (int)cl, (long)(cm ^ cn)), NLoginCore_034.c("㺹", (int)co, (long)(cp ^ cq)));
            properties.putIfAbsent(NLoginCore_034.c("㺼", (int)cr, (long)cs), NLoginCore_034.c("㺿", (int)ct, (long)(cu ^ cv)));
            properties.putIfAbsent(NLoginCore_034.c("㻂", (int)cw, (long)(cx ^ cy)), NLoginCore_034.c("㻅", (int)(cz & da), (long)db));
        }
    }
}

