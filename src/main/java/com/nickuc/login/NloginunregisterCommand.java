/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.enums.event.UnregisterSource
 *  com.nickuc.login.api.enums.event.UpdatePasswordSource
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UnregisterSource;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
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
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginunregisterCommand
extends NLoginCore_353 {
    private static long g;
    private static long al;
    private static int cb;
    private static int bh;
    private static int af;
    private static int z;
    private static long dd;
    private static int aq;
    private static long bp;
    private static int bq;
    private static int at;
    private static long bj;
    private static long bn;
    private static int cl;
    private static int bb;
    private static long cc;
    private static int var_int_c;
    private static int m;
    private static long ai;
    private static int ba;
    private static int l;
    private static int cx;
    private static int u;
    private static int dh;
    private static String[] a;
    private static int j;
    private static int ae;
    private static int au;
    private static int ar;
    private static long bc;
    private static long bi;
    private static int be;
    private static long dg;
    private static int k;
    private static long cs;
    private static int bo;
    private static int de;
    private static long bg;
    private static int as;
    private static long bw;
    private static int bu;
    private static int co;
    private static int aa;
    private static int an;
    private static int ah;
    private static int df;
    private static long bf;
    private static long cf;
    private static long cj;
    private static long t;
    private static long ci;
    private static int s;
    private static int ab;
    private static int am;
    private static String[] b;
    private static int q;
    private static long var_long_c;
    private static int ca;
    private static int bx;
    private static long bs;
    private static float az;
    private static int ak;
    private static long cn;
    private static int f;
    private static long e;
    private static int cy;
    private static long h;
    private static long bz;
    private static long v;
    private static int aj;
    private static int x;
    private static float ay;
    private static int dj;
    private static long w;
    private static int bv;
    private static int p;
    private static int ag;
    private static int r;
    private static int bd;
    private static long by;
    private static int da;
    private static long ce;
    private static int ad;
    private static int cg;
    private static long cr;
    private static int ct;
    private static int ck;
    private static long ao;
    private static int db;
    private static int di;
    private static int aw;
    private static int bt;
    private static int dc;
    private static int cm;
    private static long cv;
    private static long cu;
    private static int i;
    private static int ax;
    private static int y;
    private static int ap;
    private static int bm;
    private static int bk;
    private static int ac;
    private static long cz;
    private static int bl;
    private static int cd;
    private static long o;
    private static int av;
    private static int cq;
    private static long cp;
    private static int d;
    private static int ch;
    private static int n;
    private static int cw;
    private static int br;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        block16: {
            if (stringArray.length != p) {
                Object[] objectArray = new Object[q];
                objectArray[NloginunregisterCommand.r] = (String)NloginunregisterCommand.c("㺀", (int)s, (long)t) + this.e() + (String)NloginunregisterCommand.c("㺃", (int)u, (long)(v ^ w));
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
                return;
            }
            NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
            String string = stringArray[x];
            NLoginCore_291 NLoginCore_2912 = this.a.com_nickuc_login_NLoginCore_291_a();
            ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, string);
            if (ForceRegisterConfig2 == null) {
                return;
            }
            if (!ForceRegisterConfig2.boolean_h()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[y]);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                return;
            }
            String string2 = ForceRegisterConfig2.i();
            NLoginCore_277 NLoginCore_277 = this.a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string2);
            UUID uUID = NLoginCore_277 != null ? NLoginCore_277.java_util_UUID_a() : ForceRegisterConfig2.java_util_UUID_a();
            Object[] objectArray = new Object[z];
            objectArray[NloginunregisterCommand.aa] = NLoginCore_277;
            objectArray[NloginunregisterCommand.ab] = uUID;
            objectArray[NloginunregisterCommand.ac] = ForceRegisterConfig2.i();
            objectArray[NloginunregisterCommand.ad] = UnregisterSource.BY_ADMIN;
            if (!this.a.a(EventEnum.UNREGISTER, objectArray)) break block16;
            Object object = ForceRegisterConfig2.var_java_lang_Object_c;
            synchronized (object) {
                block15: {
                    if (!ForceRegisterConfig2.boolean_h()) {
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[ae]);
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                        return;
                    }
                    if (NLoginCore_277 != null) {
                        string2 = NLoginCore_277.getName();
                    }
                    if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2)) {
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[af]);
                        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                        return;
                    }
                    NLoginCore_370.b((String)NloginunregisterCommand.c("㺆", (int)(ag & ah), (long)ai) + string2 + (String)NloginunregisterCommand.c("㺉", (int)(aj & ak), (long)al) + NLoginInterface_0422.getName() + (String)NloginunregisterCommand.c("㺌", (int)(am & an), (long)ao), new Object[ap]);
                    try {
                        Object[] objectArray2 = new Object[aq];
                        objectArray2[NloginunregisterCommand.ar] = NLoginCore_277;
                        objectArray2[NloginunregisterCommand.as] = uUID;
                        objectArray2[NloginunregisterCommand.at] = string2;
                        objectArray2[NloginunregisterCommand.au] = null;
                        objectArray2[NloginunregisterCommand.av] = UpdatePasswordSource.BY_ADMIN;
                        this.a.a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray2);
                        if (NLoginCore_277 == null) break block15;
                        NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[aw]));
                    }
                    catch (Throwable throwable) {
                        if (NLoginCore_277 != null) {
                            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[ax]));
                        }
                        throw throwable;
                    }
                }
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, ay, az);
                if (ForceRegisterConfig2.t() && ForceRegisterConfig2.java_util_UUID_a().equals(ForceRegisterConfig2.getMojangId())) {
                    if (this.j()) {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺏", (int)(ba & bb), (long)bc), new Object[bd]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺒", (int)be, (long)(bf ^ bg)) + string2 + (String)NloginunregisterCommand.c("㺕", (int)bh, (long)(bi ^ bj)), new Object[bk]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺘", (int)(bl & bm), (long)bn) + string2 + (String)NloginunregisterCommand.c("㺛", (int)bo, (long)bp), new Object[bq]);
                    } else {
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺞", (int)br, (long)bs), new Object[bt]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺡", (int)(bu & bv), (long)bw) + string2 + (String)NloginunregisterCommand.c("㺤", (int)bx, (long)(by ^ bz)), new Object[ca]);
                        NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺧", (int)cb, (long)cc) + string2 + (String)NloginunregisterCommand.c("㺪", (int)cd, (long)(ce ^ cf)), new Object[cg]);
                    }
                    NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺭", (int)ch, (long)(ci ^ cj)), new Object[ck]);
                }
                NLoginCore_150.a(NLoginInterface_0422, this.j() ? (String)NloginunregisterCommand.c("㺰", (int)(cl & cm), (long)cn) + string2 + (String)NloginunregisterCommand.c("㺳", (int)co, (long)cp) : (String)NloginunregisterCommand.c("㺶", (int)cq, (long)(cr ^ cs)) + string2 + (String)NloginunregisterCommand.c("㺹", (int)ct, (long)(cu ^ cv)), new Object[cw]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺼", (int)(cx & cy), (long)cz), new Object[da]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginunregisterCommand.c("㺿", (int)(db & dc), (long)dd) + NLoginCore_2702.a(TimeUnit.MILLISECONDS, de) + (String)NloginunregisterCommand.c("㻂", (int)df, (long)dg), new Object[dh]);
            }
        }
    }

    static {
        var_int_c = (0 >>> 9 | 0 << -9) & 0xFFFFFFFF;
        d = Integer.reverse(-1);
        e = Long.reverse(5270724526511641871L);
        f = (1 >>> 128 | 1 << -128) & 0xFFFFFFFF;
        g = Long.reverse(-1070343748826016497L);
        h = Long.reverse(-5188146770730811392L);
        i = (0x2000000 >>> 57 | 0x2000000 << -57) & 0xFFFFFFFF;
        j = (0 >>> 227 | 0 << -227) & 0xFFFFFFFF;
        k = Integer.reverse(Integer.MIN_VALUE);
        l = (0 >>> 152 | 0 << -152) & 0xFFFFFFFF;
        m = (8192 >>> 108 | 8192 << ~108 + 1) & 0xFFFFFFFF;
        n = -1 >>> 89 | -1 << -89;
        o = Long.reverse(5270724526511641871L);
        p = Integer.reverse(0x40000000);
        q = 1024 >>> 170 | 1024 << -170;
        r = 0 >>> 52 | 0 << -52;
        s = (12 >>> 162 | 12 << -162) & 0xFFFFFFFF;
        t = Long.reverse(5270724526511641871L);
        u = Integer.reverse(0x20000000);
        v = Long.reverse(-1070343748826016497L);
        w = Long.reverse(-5188146770730811392L);
        x = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        y = 0 >>> 158 | 0 << ~158 + 1;
        z = Integer.reverse(0x20000000);
        aa = Integer.reverse(0);
        ab = (16 >>> 132 | 16 << -132) & 0xFFFFFFFF;
        ac = Integer.reverse(0x40000000);
        ad = 384 >>> 7 | 384 << -7;
        ae = Integer.reverse(0);
        af = 0 >>> 146 | 0 << -146;
        ag = Integer.reverse(-1610612736);
        ah = (-1 >>> 110 | -1 << -110) & 0xFFFFFFFF;
        ai = Long.reverse(5270724526511641871L);
        aj = (48 >>> 195 | 48 << ~195 + 1) & 0xFFFFFFFF;
        ak = (-1 >>> 93 | -1 << -93) & 0xFFFFFFFF;
        al = Long.reverse(5270724526511641871L);
        am = Integer.reverse(-536870912);
        an = -1 >>> 15 | -1 << -15;
        ao = Long.reverse(5270724526511641871L);
        ap = Integer.reverse(0);
        aq = (20480 >>> 236 | 20480 << -236) & 0xFFFFFFFF;
        ar = Integer.reverse(0);
        as = (16 >>> 164 | 16 << -164) & 0xFFFFFFFF;
        at = 16 >>> 163 | 16 << -163;
        au = (0x18000000 >>> 155 | 0x18000000 << ~155 + 1) & 0xFFFFFFFF;
        av = 32 >>> 3 | 32 << -3;
        aw = Integer.reverse(0);
        ax = 0 >>> 37 | 0 << -37;
        ay = Float.intBitsToFloat(Integer.reverse(3714));
        az = Float.intBitsToFloat(Integer.reverse(514));
        ba = Integer.reverse(0x10000000);
        bb = (-1 >>> 104 | -1 << -104) & 0xFFFFFFFF;
        bc = Long.reverse(5270724526511641871L);
        bd = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        be = (0x120000 >>> 49 | 0x120000 << ~49 + 1) & 0xFFFFFFFF;
        bf = Long.reverse(-1070343748826016497L);
        bg = Long.reverse(-5188146770730811392L);
        bh = Integer.reverse(0x50000000);
        bi = Long.reverse(-1070343748826016497L);
        bj = Long.reverse(-5188146770730811392L);
        bk = (0 >>> 78 | 0 << -78) & 0xFFFFFFFF;
        bl = 22 >>> 97 | 22 << ~97 + 1;
        bm = Integer.reverse(-1);
        bn = Long.reverse(5270724526511641871L);
        bo = Integer.reverse(0x30000000);
        bp = Long.reverse(5270724526511641871L);
        bq = Integer.reverse(0);
        br = Integer.reverse(-1342177280);
        bs = Long.reverse(5270724526511641871L);
        bt = Integer.reverse(0);
        bu = Integer.reverse(0x70000000);
        bv = (-1 >>> 5 | -1 << ~5 + 1) & 0xFFFFFFFF;
        bw = Long.reverse(5270724526511641871L);
        bx = Integer.reverse(-268435456);
        by = Long.reverse(-1070343748826016497L);
        bz = Long.reverse(-5188146770730811392L);
        ca = 0 >>> 233 | 0 << -233;
        cb = Integer.reverse(0x8000000);
        cc = Long.reverse(5270724526511641871L);
        cd = (34 >>> 129 | 34 << ~129 + 1) & 0xFFFFFFFF;
        ce = Long.reverse(-1070343748826016497L);
        cf = Long.reverse(-5188146770730811392L);
        cg = Integer.reverse(0);
        ch = Integer.reverse(0x48000000);
        ci = Long.reverse(-1070343748826016497L);
        cj = Long.reverse(-5188146770730811392L);
        ck = (0 >>> 175 | 0 << ~175 + 1) & 0xFFFFFFFF;
        cl = Integer.reverse(-939524096);
        cm = Integer.reverse(-1);
        cn = Long.reverse(5270724526511641871L);
        co = (0x140000 >>> 208 | 0x140000 << -208) & 0xFFFFFFFF;
        cp = Long.reverse(5270724526511641871L);
        cq = 1344 >>> 230 | 1344 << -230;
        cr = Long.reverse(-1070343748826016497L);
        cs = Long.reverse(-5188146770730811392L);
        ct = Integer.reverse(0x68000000);
        cu = Long.reverse(-1070343748826016497L);
        cv = Long.reverse(-5188146770730811392L);
        cw = Integer.reverse(0);
        cx = (92 >>> 226 | 92 << ~226 + 1) & 0xFFFFFFFF;
        cy = -1 >>> 245 | -1 << ~245 + 1;
        cz = Long.reverse(5270724526511641871L);
        da = Integer.reverse(0);
        db = (1536 >>> 230 | 1536 << ~230 + 1) & 0xFFFFFFFF;
        dc = Integer.reverse(-1);
        dd = Long.reverse(5270724526511641871L);
        de = Integer.reverse(0x40000000);
        df = 204800 >>> 13 | 204800 << ~13 + 1;
        dg = Long.reverse(5270724526511641871L);
        dh = Integer.reverse(0);
        di = Integer.reverse(0x58000000);
        dj = 0x34000000 >>> 249 | 0x34000000 << ~249 + 1;
        a = new String[di];
        b = new String[dj];
        NloginunregisterCommand.void_b();
    }

    private static void void_b() {
        int n;
        var_long_c = -1104976337736129393L;
        long l = var_long_c ^ 0x804DFFF78AFCD064L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(36 + 33), (byte)(35 + 48), (byte)(26 + 21), (byte)(49 + 18), 66, (byte)(39 + 28), (byte)(9 + 38), (byte)(40 + 40), (byte)(30 + 45), (byte)(31 + 36), (byte)(13 + 70), (byte)(41 + 12), (byte)(50 + 30), 97, (byte)(12 + 88), (byte)(32 + 68), (byte)(86 + 19), (byte)(82 + 28), (byte)(29 + 74)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
                    NloginunregisterCommand.b[0] = NLoginCore_446.D("јѮҙ҂ҒҚѴѠ҆ҠҦѫҁѷѻҝ҈ҩүҥҋѽѺѻ", (byte)38, 68);
                    NloginunregisterCommand.b[1] = NLoginCore_004.B("ėĲĳĀģĠĿĩŉĊĜŐŉĬĪŒĦČďŃĎŁČĮĻĮŖĭľŀŐęŜťĸŒĚŦŇŘģĥŏĭŝŐĽŞıŐĲŎŲŁľĿ", (byte)38, 66);
                    NloginunregisterCommand.b[2] = NLoginCore_092.C("ѻљңѻѤҞѲҔѤҚѥѯ", (byte)38, 67);
                    NloginunregisterCommand.b[3] = NLoginCore_091.F("ԖՉԩ՘ԬՁ՗ԱԽԺԱՖԼեԛԩ՟էՋեԿԸԵԶ", (byte)38, 70);
                    NloginunregisterCommand.b[4] = NLoginCore_223.F("ՖԯԻԮԨ՘ՊՐԟԾզՐՑ՛աԽԡԧԻԧ՘ծԵԶ", (byte)38, 70);
                    NloginunregisterCommand.b[5] = NLoginCore_027.F("ՏՅՓ԰ԧՒՙԡԺԺԤԪ", (byte)38, 70);
                    NloginunregisterCommand.b[6] = NLoginCore_201.B("ĜńŃěęĄĝĻħĘŅĈěŃņŎĝĒĩōŅħŕĪīĴĕœĵŜŊġőŁğšĽĵńĹŤŤŊįĢŤİŅĬōŦĴĶŢőŭŲŔŜūũŴşŹ", (byte)38, 66);
                    NloginunregisterCommand.b[7] = NLoginCore_027.B("ĹĢĖćĠľĹėĹľĞē", (byte)38, 66);
                    NloginunregisterCommand.b[8] = NLoginCore_027.E("ՉՋ՘ԚԜՁԻՌՄԶԺԺԱՄՓըՁեՠ՚խխԿէԬՔ՞ՌՕԪԱԴԸՐՙձոՋլղՐԼշդքր՗ֈ՛ռ֋ի՘կկզ֐ռ֏ՖևՊկՑՒ֝՘թս֎սո֐օ֗քշ֕՛ր֣ր֙զ֟֝պփ֏լֆ֍հֵֹ֗ղֱֆֳ֫׀֎ׁ֟֏֡ռև֦֨֙֕׀׉֪֮֟֟֜֍֣׉֧׉ׂ֨֨", (byte)38, 69);
                    NloginunregisterCommand.b[9] = NLoginCore_138.D("ѶѾѾѮџ҂ѳҝҤѽҥѝѩѫѬҪҘҮҥҏҞҋҔҒѷҮҺғҕҝқҍҴұҵѼҗһүҽһҜҪ҉ҕҹҮӎӊӏҎӆӊӒӃҷҕӐӖґҦҕӈҙӏӓҺқҝӃҞӤӔҶҸҹӕҹӍӢӉүӓӅӠӳҺһ", (byte)38, 68);
                    NloginunregisterCommand.b[10] = NLoginCore_201.E("ՕՅԹՔԽԯՔԹ՗԰ԺՂ՛ԟԽ՗ՄԫԨՇՅԾԿՉԳՓ՞՟հՐճԶ", (byte)38, 69);
                    NloginunregisterCommand.b[11] = NLoginCore_138.E("ԱԹԹԩԚԽԮ՘՟Ը՟ԡ԰՗Ոԧ՝էԬՇՐՆՠՠդԾՎՊշՑշ՘ՔնՔԻ՜Ռշմհ՜ր՘Կ։ՓֆՂխխ՞ո՝֌ՐՍՔ֊Ոքդմթխևխղ֑շ֕ց֑֐դք֧է֞աեօփ֥֦ֈյն", (byte)38, 69);
                    NloginunregisterCommand.b[12] = NLoginCore_223.D("ҚѹѵѬѲҒҤҟѲѦ҂ѯ", (byte)38, 68);
                    NloginunregisterCommand.b[13] = NLoginCore_027.C("ҒҚҘҟѲҕўҞҟҜѶ҅ҬѼҝѻѾҋҲҭҠҦҰҮҴҔҏ҄ҼҾҺҳҜҺҾҮѶӅҗҏҕҡӋҶӃҚҩӄӈӋҨӅҊӂӖҶҭӑӋҺҼҰҿҺқҡҚҞҽӠӞӦӣӪәҿҦҫҧөҼӒӊӉӒҫӀҶӏҰӲҴӰӌҼӹӲӓӚӐӣӘԀҽӤӺԀӏ", (byte)38, 67);
                    NloginunregisterCommand.b[14] = NLoginCore_138.C("ўґҘўҥїѻҥѽ҉ѹҫҩ҆ѦѨ҈ҲҋҠҲҲҠ҈ґҲұҤҫұҨ҈ҏҸҀҏҳҲҁҟҀ҃ҒҔҥӆ҄ҿ҂ҭӄӋғӍҦӄӈӊӏҵҧҴӜӌӞӉӔҵҜҽһҶӒӂҡү", (byte)38, 67);
                    NloginunregisterCommand.b[15] = NLoginCore_027.E("ԬԯԵ՗ՓԙԡԯԼՓՆԘ՞աԳԪԹԸծԬՐաիՀԿյծ՟ՖՌխկ", (byte)38, 69);
                    NloginunregisterCommand.b[16] = NLoginCore_446.E("ՑԭԚԽՒԬԵԠՂբ԰ԟՇՉՉդԴՍՆ՜՘ԻՙՐհՊՄ԰ժթՊդՎծՇ՘ՖջնՌՍջՐօկՃսՃքըՆ֎փսժ֏ֈՎՇ֒՗մՓ֘ղե֒֘հը֒֟֐֑դժ", (byte)38, 69);
                    NloginunregisterCommand.b[17] = NLoginCore_076.A("ľĝęĐĖĶňŃĖĊĦē", (byte)38, 65);
                    NloginunregisterCommand.b[18] = NLoginCore_453.F("ՋԹՏԧԬԬԡ՝ԯԱԠԪ", (byte)38, 70);
                    NloginunregisterCommand.b[19] = NLoginCore_223.F("ԩՙՓԱ՞ՀԺԟաՄԮԳԣԥՇՂԣ՞ՀՊբհԮդՔզիԾՎշ՗՚ՖԹՍ՚Ող՟ՌՠԼՀ՗՝ՕպտԽպյեՎվՕՖ", (byte)38, 70);
                    NloginunregisterCommand.b[20] = NLoginCore_453.C("ѵјѬґҕҞѱҁҧѸҖѤ҅ѸҀ҈Ҥҏ҃ҥҤѬҟҎ҇ҎҮҖҔҥҎҚ", (byte)38, 67);
                    NloginunregisterCommand.b[21] = NLoginCore_559.F("ԛՌԧԻԛՈԸԼԲԷԶ՟ՁԟԥԶԥՈԤԤ՛ՍՄԾԼճբզ԰ղԵՉ՜ՋՋԴ՞Քժղ՜ՔպՂմպՁոՃՖևտջ՞ասւթղ֎փՕ֘ՑՖս֍֔վ՜ղՔ֗ս֠վ՞ՠ֑չ֖֦դք֮֬յն", (byte)38, 70);
                    NloginunregisterCommand.b[22] = NLoginCore_427.F("ԳԒԜԧԨ՛ԮՀ՛ԴԹԪ", (byte)38, 70);
                    NloginunregisterCommand.b[23] = NLoginCore_027.D("ҐѾҔѬѱѱѦҢѴѶѥѯ", (byte)38, 68);
                    NloginunregisterCommand.b[24] = NLoginCore_384.F("՛Ո՚ԕԝՓ՗՛՝ԯԷՆագբԠեՉԦԦէ՚թ՛թբբծԵՠյպԶխԳ՜Օխլ՗ՙՔկՊ", (byte)38, 70);
                    NloginunregisterCommand.b[25] = NLoginCore_110.B("úýĽăćĠĩĥĈħĖē", (byte)38, 66);
                    continue block7;
                }
                case 1: {
                    NloginunregisterCommand.b[0] = NLoginCore_138.E("ԓԩՔԽՍՕԯԛՁ՛բա՛Ձԣ՟Լԩ՚ԧ՟ԸԵԶ", (byte)38, 69);
                    NloginunregisterCommand.b[1] = NLoginCore_559.D("ѳҎҏќѿѼқ҅ҥѦѸҬҥ҈҆Ү҂ѨѫҟѪҝѨҊҗҊҲ҉ҚҜҬѵҸӁҔҮѶӂңҴѿҁҳӊҠҿҡҟӐүӈңҳҭҚқ", (byte)38, 68);
                    NloginunregisterCommand.b[2] = NLoginCore_559.B("ĐĕėįĩģġĹĬăņĆĤĐĜğĥċĶņĬıĞğ", (byte)38, 66);
                    NloginunregisterCommand.b[3] = NLoginCore_384.A("ÿĲĒŁĕĪŀĚĦģĚŐŇĻċĜİĐĿĲĵġĞğ", (byte)38, 65);
                    NloginunregisterCommand.b[4] = NLoginCore_091.A("ĿĘĤėđŁĳĹĈħŎĭĺĪĥĬŋľŗŘĩŗĞğ", (byte)38, 65);
                    NloginunregisterCommand.b[5] = NLoginCore_092.A("İþĮćķğńŀīŎńē", (byte)38, 65);
                    NloginunregisterCommand.b[6] = NLoginCore_173.C("ѸҠҟѷѵѠѹҗ҃ѴҡѤѷҟҢҪѹѮ҅ҩҡ҃ұ҆҇ҐѱүґҸҦѽҭҝѻҽҙґҠҕӀӀҦҋѾӀҌҡ҈ҩӂҐҒүӈӐұґҔӍӚҭҼҜ", (byte)38, 67);
                    NloginunregisterCommand.b[7] = NLoginCore_173.B("úąęĿłėăĹĨĥňē", (byte)38, 66);
                    NloginunregisterCommand.b[8] = NLoginCore_223.D("ҎҐҝџѡ҆Ҁґ҉ѻѿѿѶ҉Ҙҭ҆ҪҥҟҲҲ҄ҬѱҙңґҚѯѶѹѽҕҞҶҽҐұҷҕҁҼҩӉӅҜӍҠӁӐҰҝҴҴҫӕӁӔқӌҏҴҖҗӢҝҮӂӓӂҽӕӊӜӉҼӚҠӅӨӅӞҫӤӢҿӈӔұӋӒҵӾӜӺҷӶӋӰӸԅӓӤԆӔӦӁӌӭӞӫӚԅԎӤӳӽӾӣӏԙԅӍӷԔӵӿ", (byte)38, 68);
                    NloginunregisterCommand.b[9] = NLoginCore_384.C("ѶѾѾѮџ҂ѳҝҤѽҥѝѩѫѬҪҘҮҥҏҞҋҔҒѷҮҺғҕҝқҍҴұҵѼҗһүҽһҜҪ҉ҕҹҮӎӊӏҎӆӊӒӃҷҕӐӖґҦҕӈҙӏӓҺқҝӃҞӤӔҶҸҶҽӉӧҭӂӁӎҽӆҽҺһ", (byte)38, 67);
                    NloginunregisterCommand.b[10] = NLoginCore_091.C("ҚҊѾҙ҂ѴҙѾҜѵѿ҇ҠѤ҂Ҝ҉ѰѭҌҊҀѵҮ҉ѷҋҪҰҰѰҸ", (byte)38, 67);
                    NloginunregisterCommand.b[11] = NLoginCore_004.D("ѶѾѾѮџ҂ѳҝҤѽҤѦѵҜҍѬҢҬѱҌҕҋҥҥҩ҃ғҏҼҖҼҝҙһҙҀҡґҼҹҵҡӅҝ҄ӎҘӋ҇ҲҲңҽҢӑҕҒҙӏҍӉҩҹҮҲӌҲҷӖҼӚӆӖӕҜҶҫҤһӛӊӍӤӡӐӣҺһ", (byte)38, 68);
                    NloginunregisterCommand.b[12] = NLoginCore_092.B("ŁĖĿıŁŇĝĄĊĮĦē", (byte)38, 66);
                    NloginunregisterCommand.b[13] = NLoginCore_173.C("ҒҚҘҟѲҕўҞҟҜѶ҅ҬѼҝѻѾҋҲҭҠҦҰҮҴҔҏ҄ҼҾҺҳҜҺҾҮѶӅҗҏҕҡӋҶӃҚҩӄӈӋҨӅҊӂӖҶҭӑӋҺҼҰҿҺқҡҚҞҽӠӞӦӣӪәҿҦҫҧөҼӒӊӉӒҫӀҶӏҰӲҴӰӌҼӹӸӍҽӹӞӁӗӠӡӁӖӏ", (byte)38, 67);
                    NloginunregisterCommand.b[14] = NLoginCore_223.E("ԙՌՓԙՠԒԶՠԸՄԴզդՁԡԣՃխՆ՛խխ՛ՃՌխլ՟զլգՃՊճԻՊծխԼ՚ԻԾՍՏՠցԿպԽըտֆՎֈատփօ֊հբկ֗և֚՛֋զշ֐֏լ֓֎գփռ֚֜ֆփո֋ո֊ֈյն", (byte)38, 69);
                    NloginunregisterCommand.b[15] = NLoginCore_559.C("ѱѴѺҜҘўѦѴҁҘҋѝңҦѸѯѾѽҳѱҕҪҞҡ҉ҮҪҩѶ҅ҭҊ", (byte)38, 67);
                    NloginunregisterCommand.b[16] = NLoginCore_138.A("ĺĖăĦĻĕĞĉīŋęĈİĲĲōĝĶįŅŁĤłĹřĳĭęœŒĳōķŗİŁĿŤşĵĶŤĹŮŘĬŦĬŭőįŷŬŦœŸűķİŻŀŝļƁŚųŶŇƅƁƅŚŘňŚœ", (byte)38, 65);
                    NloginunregisterCommand.b[17] = NLoginCore_027.E("ԖԎԓ՞ՔԪԻԪԮՠՁԺՕՕՆԴԣՖՋՋՁՈԵԶ", (byte)38, 69);
                    NloginunregisterCommand.b[18] = NLoginCore_575.A("ŀľāđĶęĶĩĚņčē", (byte)38, 65);
                    NloginunregisterCommand.b[19] = NLoginCore_427.B("ĒłļĚŇĩģĈŊĭėĜČĎİīČŇĩĳŋřėōĽŏŔħķŠŀŃĿĢĶŃıśňĵŉĥĩŏľŧťĪťńųŷŹŃŰĺĴŉŧŝƁůūƄ", (byte)38, 66);
                    NloginunregisterCommand.b[20] = NLoginCore_223.E("԰ԓԧՌՐՙԬԼբԳՑԟՀԳԻՃ՟ՊԾՠ՟հԺԲԮղ԰ԬՖիթԳ", (byte)38, 69);
                    NloginunregisterCommand.b[21] = NLoginCore_387.C("ѠґѬҀѠҍѽҁѷѼѻҤ҆ѤѪѻѪҍѩѩҠҒ҉҃ҁҸҧҫѵҷѺҎҡҐҐѹңҙүҷҡҙҿ҇ҹҿ҆ҽ҈қӌӄӀңҦӂӇҮҷӓӈҚӝҖқӂӒәӃҡҷҙӜӂӧӥӕӪҿәҹӡҪӍӨӳҺһ", (byte)38, 67);
                    NloginunregisterCommand.b[22] = NLoginCore_384.F("ԲԽԗԷ՜ՖԞՙԟԳՏԪ", (byte)38, 70);
                    NloginunregisterCommand.b[23] = NLoginCore_027.E("ՋԚԖԝՙ՟ՋԚբ԰ԭԪ", (byte)38, 69);
                    NloginunregisterCommand.b[24] = NLoginCore_427.D("ҠҍҟњѢҘҜҠҢѴѼҋҦҨҧѥҪҎѫѫҬҟҮҠҮҧҧҳѺҥҺҿҿѸҠҞҥҾҽҤҰҖ҉ҧӉҊҪҜӈґҬӋӑҝҚқ", (byte)38, 68);
                    NloginunregisterCommand.b[25] = NLoginCore_201.A("ġĀĂņÿĴĀňĖĿęĺħłŌĜňłŅŘįŇĞğ", (byte)38, 65);
                    continue block7;
                }
                case 2: {
                    NloginunregisterCommand.b[0] = NLoginCore_173.D("њҏҌѲѝѤѵѧџҤѠѫѾҧҧѦѫҦҰҎѦҮ҃ѩҥҵѺҺҊҼҏҘ", (byte)38, 68);
                    continue block7;
                }
                case 4: {
                    NloginunregisterCommand.b[0] = NLoginCore_138.D("ҐѝҎѼҐќҕҚѷҨѣңѥҘѪҘѰѮѨүҠѽѺѻ", (byte)38, 68);
                }
            }
        }
    }

    public NloginunregisterCommand(NLoginType_008 NLoginType_008) {
        String[] stringArray = new String[k];
        stringArray[NloginunregisterCommand.l] = NloginunregisterCommand.c("㺆", (int)(m & n), (long)o);
        super(NLoginType_008, (String)NloginunregisterCommand.c("㺀", (int)(var_int_c & d), (long)e), (String)NloginunregisterCommand.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, stringArray);
    }

    private static String a(int n, long l) {
        l ^= 0x1DL;
        l ^= 0x804DFFF78AFCD064L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(7 + 62), (byte)(68 + 15), (byte)(29 + 18), (byte)(63 + 4), (byte)(3 + 63), (byte)(59 + 8), 47, (byte)(3 + 77), (byte)(16 + 59), (byte)(66 + 1), (byte)(18 + 65), (byte)(22 + 31), (byte)(9 + 71), (byte)(42 + 55), 100, (byte)(94 + 6), (byte)(17 + 88), (byte)(97 + 13), (byte)(49 + 54)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟ࢖ࢯࢯࢹࢰ࢞ࢹࢬ࢛ࣁࢽࢣࢰࣂࢯ", (byte)35, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NloginunregisterCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NloginunregisterCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ÅçéÉíČĄĚĆÕēĉėđÚÿġĠĘĞĘí", (byte)15, 65), NloginunregisterCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.D("хђёДєѐыєџюЛљѝіљџСޙ޲޲޼޳ޡ޼ޯޞ߄߀ަ޳߅޲м", (byte)15, 68) + string + NLoginCore_004.F("ԅ", (byte)15, 70) + methodType.toString(), exception);
        }
    }
}

