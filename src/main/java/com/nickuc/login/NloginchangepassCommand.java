/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.ChangePasswordSource
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.enums.event.UpdatePasswordSource
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.ChangePasswordSource;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
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
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginchangepassCommand
extends NLoginCore_353 {
    private static int am;
    private static int x;
    private static int ag;
    private static long az;
    private static int ad;
    private static long bk;
    private static long d;
    private static int r;
    private static int ao;
    private static int as;
    private static int br;
    private static int j;
    private static int l;
    private static int w;
    private static int bo;
    private static long var_long_c;
    private static int i;
    private static int bb;
    private static int z;
    private static int bf;
    private static int ab;
    private static long bc;
    private static int av;
    private static int au;
    private static long bl;
    private static int o;
    private static int f;
    private static int bs;
    private static int m;
    private static long s;
    private static long e;
    private static int ap;
    private static long u;
    private static int p;
    private static int y;
    private static String[] b;
    private static long al;
    private static String[] a;
    private static long bp;
    private static long bg;
    private static int bq;
    private static long n;
    private static long ai;
    private static int aj;
    private static long an;
    private static int ae;
    private static int var_int_c;
    private static int ar;
    private static int bj;
    private static int aq;
    private static long g;
    private static int bn;
    private static int af;
    private static int ah;
    private static int aa;
    private static long bd;
    private static float ax;
    private static long ba;
    private static int ak;
    private static int ac;
    private static int q;
    private static float aw;
    private static int bi;
    private static long bh;
    private static int k;
    private static int t;
    private static int bm;
    private static int be;
    private static int v;
    private static long h;
    private static int ay;
    private static int at;

    private static void void_b() {
        int n;
        var_long_c = -2891586168758658819L;
        long l = var_long_c ^ 0x2A08427B8C9B2F93L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(35 + 34), (byte)(6 + 77), (byte)(37 + 10), (byte)(23 + 44), (byte)(51 + 15), (byte)(4 + 63), (byte)(39 + 8), (byte)(43 + 37), (byte)(67 + 8), 67, (byte)(5 + 78), 53, (byte)(76 + 4), (byte)(83 + 14), (byte)(49 + 51), (byte)(55 + 45), (byte)(38 + 67), (byte)(43 + 67), (byte)(95 + 8)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
                    NloginchangepassCommand.b[0] = NLoginCore_092.B("ďûāßßģĘÙĦĈõêÿüĉėĚĲĉĩĬģúû", (byte)20, 66);
                    NloginchangepassCommand.b[1] = NLoginCore_223.C("сНїѕслЮШыѠѬфьхѷъуѣѐѶнѬьѿѳѿјћпйѝ҄҇є҅ўрџ҆ъѦѿҌѳѿ҂ѶѦѱѤѯҒҐѷѤѥ", (byte)20, 67);
                    NloginchangepassCommand.b[2] = NLoginCore_138.D("љхыЩЩѭѢУѰђнѡѤѠѓѭєѩѓзѪѭфх", (byte)20, 68);
                    NloginchangepassCommand.b[3] = NLoginCore_575.C("їѧУьѨѡлйбѧфчэѳтсжіилщчфх", (byte)20, 67);
                    NloginchangepassCommand.b[4] = NLoginCore_453.B("ğĊâĂăĢāĒĞęôěĪýčĜèûĐďóĮôĉįĂČôđĆđĵúĔļčĄĜěĴėĄĚď", (byte)20, 66);
                    NloginchangepassCommand.b[5] = NLoginCore_027.D("ѪћѢеЭшяѱѱўьй", (byte)20, 68);
                    NloginchangepassCommand.b[6] = NLoginCore_384.C("ЦѝњѫюѐЬѦьѐѫЮрэщѧѺхѬѦѱѳѬѶѶђќ҅янѾљсѷџ҄щҀѤэҐ҉ѨҐѫҏєѣҌ҅ҔѺҙѷѤѥ", (byte)20, 67);
                    NloginchangepassCommand.b[7] = NLoginCore_384.C("ѪлныњмьЩѦќѐй", (byte)20, 67);
                    NloginchangepassCommand.b[8] = NLoginCore_201.B("ėøĀėÿäÞāāĄĢøěĎøăīĝüĬćóĤĤđĘĄúĽýęėþĩĜāŅăİĵąđĻĂĆěĭěĜĦłĬŁĳŗŕŋċŚĦěįĕĹ", (byte)20, 66);
                    NloginchangepassCommand.b[9] = NLoginCore_427.F("ԝԗԙԗԶՈԿԽԨՊԱԼԓԍԶԖԮՙԤՉԖՌԣԤ", (byte)20, 70);
                    NloginchangepassCommand.b[10] = NLoginCore_091.D("пѓјѝЬцѡЫФюѪй", (byte)20, 68);
                    NloginchangepassCommand.b[11] = NLoginCore_384.E("ԗԉԡԆՃԌԸՁԋՋԋԐՇԱԣԤԤԹՉՐ԰ԚՉԴՏԽԯբԢԼ՚ԧԥ՞ԦՄԦՋԷըեՐձԸ", (byte)20, 69);
                    NloginchangepassCommand.b[12] = NLoginCore_223.E("ԛԈԡԷՉԥԟԎԢՈԯԘ", (byte)20, 69);
                    continue block7;
                }
                case 1: {
                    NloginchangepassCommand.b[0] = NLoginCore_027.F("ԸԤԪԈԈՌՁԂՏԱԞՕՑՋԫԪՇԓԣԻԹԦԣԤ", (byte)20, 70);
                    NloginchangepassCommand.b[1] = NLoginCore_138.E("ԠӼԶԴԠԚԍԇԪԿՋԣԫԤՖԩԢՂԯՕԜՋԫ՞Ւ՞ԷԺԞԘԼգզԳդԽԟԾեԩՅ՞լը՞ՖՌՁՙՊԳԷճՆՃՄ", (byte)20, 69);
                    NloginchangepassCommand.b[2] = NLoginCore_324.F("ԸԤԪԈԈՌՁԂՏԱԜԯԏՆԉՍՂՆԻԭԥՒԾՍԼԴԭԛՄԯԧՆ", (byte)20, 70);
                    NloginchangepassCommand.b[3] = NLoginCore_384.C("їѧУьѨѡлйбѧхчфыіёзѵйнжчфх", (byte)20, 67);
                    NloginchangepassCommand.b[4] = NLoginCore_091.D("ѩєЬьэѬыќѨѣоѥѴчїѦвхњљнѸоѓѹьіоћѐћѿушѽѮҁщҌѣђѾѰљ", (byte)20, 68);
                    NloginchangepassCommand.b[5] = NLoginCore_004.C("ѕТмљХјѯыыувѭѕѧѷѴјѷщѥљїфх", (byte)20, 67);
                    NloginchangepassCommand.b[6] = NLoginCore_223.E("ԅԼԹՊԭԯԋՅԫԯՊԍԟԬԨՆՙԤՋՅՐՒՋՕՕԱԻդԮԜ՝ԸԠՖԾգԨ՟ՃԬկըՉՁխՇՄգժժՙՉԷՆՃՄ", (byte)20, 69);
                    NloginchangepassCommand.b[7] = NLoginCore_223.E("ԵՂԾՁԠԊԏԪԲԡԽԘ", (byte)20, 69);
                    NloginchangepassCommand.b[8] = NLoginCore_387.F("ՀԡԩՀԨԍԇԪԪԭՋԡՄԷԡԬՔՆԥՕ԰ԜՍՍԺՁԭԣզԦՂՀԧՒՅԪծԬՙ՞ԮԺդԫԯՄՖՄՅՏիՕժիՕի՚կշփհ՘էֈ", (byte)20, 70);
                    NloginchangepassCommand.b[9] = NLoginCore_092.A("ôîðîčğĖĔÿġĉ÷ĥğĈĀïİğĔĭîĴĕĉĒĒĵĤĵįİ", (byte)20, 65);
                    NloginchangepassCommand.b[10] = NLoginCore_559.F("ԩԨԿԄԾԤԆԢՅԦԊԘ", (byte)20, 70);
                    NloginchangepassCommand.b[11] = NLoginCore_173.B("îàøÝĚãďĘâĢâçĞĈúûûĐĠħćñĠċĦĔĆĹùēıþĴĴīĴĲÿĦĆĴĤĄĄąĪġŅňĢčČğĭĚě", (byte)20, 66);
                    NloginchangepassCommand.b[12] = NLoginCore_091.B("ñ×þĂğðģēġėěæäĘĪĝıįüĂĝģúû", (byte)20, 66);
                    continue block7;
                }
                case 2: {
                    NloginchangepassCommand.b[0] = NLoginCore_451.F("ԖԚՈԷԩԈԮԍՍՋԒԘ", (byte)20, 70);
                    continue block7;
                }
                case 4: {
                    NloginchangepassCommand.b[0] = NLoginCore_027.C("ћџхнзйѨѲхѴѰввѰхдѰѬьэѦѽфх", (byte)20, 67);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (stringArray.length != o) {
            Object[] objectArray = new Object[p];
            objectArray[NloginchangepassCommand.q] = (String)NloginchangepassCommand.c("㺀", (int)r, (long)s) + this.e().toLowerCase(Locale.ENGLISH) + (String)NloginchangepassCommand.c("㺃", (int)t, (long)u);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        NLoginCore_291 NLoginCore_2912 = this.a.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, stringArray[v]);
        if (ForceRegisterConfig2 == null) {
            return;
        }
        if (!ForceRegisterConfig2.s()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[w]);
            return;
        }
        String string = stringArray[x];
        int n = string.length();
        if (n <= NLoginCore_532.T.r()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.L, new Object[y]);
            return;
        }
        if (n >= NLoginCore_532.U.r()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.K, new Object[z]);
            return;
        }
        if (NLoginCore_2912.boolean_a(ForceRegisterConfig2, string)) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.J, new Object[aa]);
            return;
        }
        String string2 = ForceRegisterConfig2.i();
        NLoginCore_277 NLoginCore_277 = this.a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string2);
        UUID uUID = NLoginCore_277 != null ? NLoginCore_277.java_util_UUID_a() : ForceRegisterConfig2.java_util_UUID_a();
        Object[] objectArray = new Object[ab];
        objectArray[NloginchangepassCommand.ac] = NLoginCore_277;
        objectArray[NloginchangepassCommand.ad] = uUID;
        objectArray[NloginchangepassCommand.ae] = string2;
        objectArray[NloginchangepassCommand.af] = ChangePasswordSource.BY_ADMIN;
        if (this.a.a(EventEnum.CHANGE_PASSWORD, objectArray)) {
            Object object = ForceRegisterConfig2.var_java_lang_Object_c;
            synchronized (object) {
                if (!NLoginCore_2912.c(ForceRegisterConfig2, string)) {
                    NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[ag]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                NLoginCore_370.b((String)NloginchangepassCommand.c("㺆", (int)ah, (long)ai) + string2 + (String)NloginchangepassCommand.c("㺉", (int)(aj & ak), (long)al) + NLoginInterface_0422.getName() + (String)NloginchangepassCommand.c("㺌", (int)am, (long)an), new Object[ao]);
                Object[] objectArray2 = new Object[ap];
                objectArray2[NloginchangepassCommand.aq] = NLoginCore_277;
                objectArray2[NloginchangepassCommand.ar] = uUID;
                objectArray2[NloginchangepassCommand.as] = string2;
                objectArray2[NloginchangepassCommand.at] = string;
                objectArray2[NloginchangepassCommand.au] = UpdatePasswordSource.BY_ADMIN;
                this.a.a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray2);
                if (NLoginCore_277 != null) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.var_com_nickuc_login_NLoginCore_487_o, new Object[av]);
                }
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, aw, ax);
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangepassCommand.c("㺏", (int)ay, (long)(az ^ ba)) + string2 + (String)NloginchangepassCommand.c("㺒", (int)bb, (long)(bc ^ bd)), new Object[be]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangepassCommand.c("㺕", (int)bf, (long)(bg ^ bh)), new Object[bi]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NloginchangepassCommand.c("㺘", (int)bj, (long)(bk ^ bl)) + NLoginCore_2702.a(TimeUnit.MILLISECONDS, bm) + (String)NloginchangepassCommand.c("㺛", (int)(bn & bo), (long)bp), new Object[bq]);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x2A08427B8C9B2F93L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(14 + 55), (byte)(51 + 32), (byte)(38 + 9), (byte)(22 + 45), (byte)(9 + 57), (byte)(40 + 27), (byte)(25 + 22), 80, (byte)(45 + 30), (byte)(50 + 17), (byte)(35 + 48), (byte)(15 + 38), (byte)(62 + 18), (byte)(17 + 80), (byte)(91 + 9), 100, (byte)(79 + 26), (byte)(38 + 72), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.D("пьыЎюъхюљшЕѓїѐѓљЛޟިެޮ޳ޭ޺ުޛޭޭދތް", (byte)13, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NloginchangepassCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NloginchangepassCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.E("ԇԩԫԋԯՎՆ՜ՈԗՕՋՙՓԜՁգբ՚ՠ՚ԯ", (byte)35, 69), NloginchangepassCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("ҁҎҍѐҐҌ҇ҐқҊїҕҙҒҕқѝߡߪ߮߰ߵ߯߼߬ߝ߯߯ߍߎ߲ѷ", (byte)35, 68) + string + NLoginCore_201.C("ј", (byte)35, 67) + methodType.toString(), exception);
        }
    }

    public NloginchangepassCommand(NLoginType_008 NLoginType_008) {
        String[] stringArray = new String[k];
        stringArray[NloginchangepassCommand.l] = NloginchangepassCommand.c("㺆", (int)m, (long)n);
        super(NLoginType_008, (String)NloginchangepassCommand.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NloginchangepassCommand.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, stringArray);
    }

    static {
        var_int_c = 0 >>> 220 | 0 << ~220 + 1;
        d = Long.reverse(-4676797289688138773L);
        e = Long.reverse(0x7400000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-4676797289688138773L);
        h = Long.reverse(0x7400000000000000L);
        i = 64 >>> 38 | 64 << ~38 + 1;
        j = 0 >>> 76 | 0 << -76;
        k = Integer.reverse(Integer.MIN_VALUE);
        l = 0 >>> 32 | 0 << ~32 + 1;
        m = (128 >>> 166 | 128 << ~166 + 1) & 0xFFFFFFFF;
        n = Long.reverse(-3812106161233003541L);
        o = 0x600000 >>> 213 | 0x600000 << ~213 + 1;
        p = Integer.reverse(Integer.MIN_VALUE);
        q = 0 >>> 37 | 0 << ~37 + 1;
        r = (0x18000000 >>> 251 | 0x18000000 << -251) & 0xFFFFFFFF;
        s = Long.reverse(-3812106161233003541L);
        t = (Integer.MIN_VALUE >>> 29 | Integer.MIN_VALUE << -29) & 0xFFFFFFFF;
        u = Long.reverse(-3812106161233003541L);
        v = 2 >>> 225 | 2 << -225;
        w = Integer.reverse(0);
        x = Integer.reverse(0x40000000);
        y = Integer.reverse(0);
        z = (0 >>> 99 | 0 << ~99 + 1) & 0xFFFFFFFF;
        aa = 0 >>> 32 | 0 << -32;
        ab = 0x400000 >>> 212 | 0x400000 << -212;
        ac = Integer.reverse(0);
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = Integer.reverse(0x40000000);
        af = Integer.reverse(-1073741824);
        ag = Integer.reverse(0);
        ah = Integer.reverse(-1610612736);
        ai = Long.reverse(-3812106161233003541L);
        aj = Integer.reverse(0x60000000);
        ak = -1 >>> 70 | -1 << ~70 + 1;
        al = Long.reverse(-3812106161233003541L);
        am = Integer.reverse(-536870912);
        an = Long.reverse(-3812106161233003541L);
        ao = Integer.reverse(0);
        ap = Integer.reverse(-1610612736);
        aq = 0 >>> 48 | 0 << -48;
        ar = 0x10000000 >>> 92 | 0x10000000 << ~92 + 1;
        as = Integer.reverse(0x40000000);
        at = (48 >>> 4 | 48 << ~4 + 1) & 0xFFFFFFFF;
        au = Integer.reverse(0x20000000);
        av = Integer.reverse(0);
        aw = Float.intBitsToFloat(Integer.reverse(3714));
        ax = Float.intBitsToFloat((2056 >>> 109 | 2056 << -109) & 0xFFFFFFFF);
        ay = Integer.reverse(0x10000000);
        az = Long.reverse(-4676797289688138773L);
        ba = Long.reverse(0x7400000000000000L);
        bb = (-2147483644 >>> 63 | -2147483644 << ~63 + 1) & 0xFFFFFFFF;
        bc = Long.reverse(-4676797289688138773L);
        bd = Long.reverse(0x7400000000000000L);
        be = 0 >>> 114 | 0 << ~114 + 1;
        bf = 0x280000 >>> 82 | 0x280000 << ~82 + 1;
        bg = Long.reverse(-4676797289688138773L);
        bh = Long.reverse(0x7400000000000000L);
        bi = (0 >>> 191 | 0 << -191) & 0xFFFFFFFF;
        bj = (-1073741822 >>> 254 | -1073741822 << ~254 + 1) & 0xFFFFFFFF;
        bk = Long.reverse(-4676797289688138773L);
        bl = Long.reverse(0x7400000000000000L);
        bm = Integer.reverse(0x40000000);
        bn = 0x3000000 >>> 22 | 0x3000000 << -22;
        bo = Integer.reverse(-1);
        bp = Long.reverse(-3812106161233003541L);
        bq = (0 >>> 42 | 0 << -42) & 0xFFFFFFFF;
        br = 0xD00000 >>> 244 | 0xD00000 << ~244 + 1;
        bs = (0x1A00000 >>> 85 | 0x1A00000 << -85) & 0xFFFFFFFF;
        a = new String[br];
        b = new String[bs];
        NloginchangepassCommand.void_b();
    }
}

