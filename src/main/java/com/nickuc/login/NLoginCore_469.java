/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.Server
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_549;
import com.nickuc.login.NLoginCore_564;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_428;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class NLoginCore_469
extends NLoginCore_564 {
    private static long n;
    private static int dk;
    private static int aq;
    private static int az;
    private static long bh;
    private static int de;
    private static int dr;
    private static int bu;
    private static long cf;
    private static long ci;
    private static long di;
    private static int af;
    private static long p;
    private static String[] e;
    private static int co;
    private static long bo;
    private static int dd;
    private static long o;
    private static int cy;
    private static int cs;
    private static String[] f;
    private static long am;
    private static int ar;
    private static int bc;
    private static long ap;
    private static int cv;
    private static long dp;
    private static long br;
    private static int dh;
    private static long ca;
    private static long ck;
    private static int cj;
    private static long ay;
    private static long dm;
    private static int du;
    private static int dt;
    private static int ce;
    private static int z;
    private static int bw;
    private static long ab;
    private static long ax;
    private static int cm;
    private static long cz;
    private static long dj;
    private static long be;
    private static int bx;
    private static int d;
    private static int dq;
    private static int dw;
    private static int cr;
    private static int bd;
    private static int bi;
    private static int ah;
    private static int bn;
    private static long cd;
    private static int bl;
    private static int ai;
    private static int bz;
    private static long ac;
    private static int aw;
    private static long df;
    private static long dc;
    private static int bj;

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0x4A898908362DFE9BL;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), 69, (byte)(60 + 23), (byte)(2 + 45), 67, (byte)(20 + 46), (byte)(11 + 56), (byte)(2 + 45), (byte)(58 + 22), (byte)(49 + 26), (byte)(61 + 6), (byte)(52 + 31), (byte)(30 + 23), (byte)(6 + 74), (byte)(20 + 77), (byte)(44 + 56), (byte)(42 + 58), (byte)(47 + 58), (byte)(43 + 67), (byte)(68 + 35)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.C("՟լիԮծժեծչըԵճշհճչԻࢵࣂࣉࣇࣙ࣍࣍ࣝࢻࣖࣈ࣏", (byte)109, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_469.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    private static void void_b() {
        int n;
        NLoginCore_469.n = -3567899464443076387L;
        long l = NLoginCore_469.n ^ 0x4A898908362DFE9BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(63 + 6), (byte)(3 + 80), (byte)(30 + 17), (byte)(57 + 10), (byte)(47 + 19), (byte)(25 + 42), (byte)(39 + 8), (byte)(21 + 59), (byte)(55 + 20), (byte)(29 + 38), (byte)(60 + 23), 53, (byte)(23 + 57), (byte)(96 + 1), (byte)(11 + 89), (byte)(76 + 24), (byte)(79 + 26), (byte)(101 + 9), (byte)(89 + 14)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_469.f[0] = NLoginCore_223.A("įŇŨĭōŭŦũŏķŊŇ", (byte)64, 65);
                    NLoginCore_469.f[1] = NLoginCore_138.F("բյ՘շԷզՅԸիպԽԲԷց՜ՃՄՁեշՒբՏՐ", (byte)64, 70);
                    NLoginCore_469.f[2] = NLoginCore_324.A("ŪĳťżĺŌļƀŞƀŪŀĽŽŧŢũŧŘŷźťŒœ", (byte)64, 65);
                    NLoginCore_469.f[3] = NLoginCore_559.D("ӞҫӥӮҨӯӊҭӇӋӈӑӓӏӪӇӷӫӠҼӰԁӈӉ", (byte)64, 68);
                    NLoginCore_469.f[4] = NLoginCore_453.F("խմՓԵՒժԲՄմոի՜ւյձտ՞սևճվֈՏՐ", (byte)64, 70);
                    NLoginCore_469.f[5] = NLoginCore_138.A("ūŚŇŋōĸźŵŰŷŲŃŀŐŏŔťşŘƁƋťŒœ", (byte)64, 65);
                    NLoginCore_469.f[6] = NLoginCore_201.A("ĳŅńŔŸĳŕĺżķŁŇ", (byte)64, 65);
                    NLoginCore_469.f[7] = NLoginCore_223.B("űĲŹśŊŴŬŵŎŵƃœŀŐĸŻŷƀŞƊŅƊƌŮűŞŋƇŞŋŲŔŬƈŧůŻƙƈƟƍŭŲŷƢŲšŰŷťƔųŶŷƭƚŢơƠƇƵƑŨƒ", (byte)64, 66);
                    NLoginCore_469.f[8] = NLoginCore_138.E("Շ԰եՃՐբճն՝՜ԾՄ", (byte)64, 69);
                    NLoginCore_469.f[9] = NLoginCore_092.A("ŰńŮŌœŭŷŚŽřŕţŲľŻŜşŠŜťŋťŒœ", (byte)64, 65);
                    NLoginCore_469.f[10] = NLoginCore_453.A("ĳŅńŔŸĳŕĺżķŁŇ", (byte)64, 65);
                    NLoginCore_469.f[11] = NLoginCore_110.E("ծԯն՘ՇձթղՋղրՐԽՍԵոմս՛ևՂև։իծ՛Ոք՛ՈկՑմՒՏ֊շՐ֑՗։՝֗֓ՠ՝՜֛ռ֗շՠ֝֊ջի֖խ֤֜֘իհ֣", (byte)64, 69);
                    NLoginCore_469.f[12] = NLoginCore_091.C("ӤӪһӱӄӂӏҮӏҲӄҽ", (byte)64, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_469.f[0] = NLoginCore_575.C("ӭӈӂӐҩҫӊӃҿӵӌҽ", (byte)64, 67);
                    NLoginCore_469.f[1] = NLoginCore_575.E("բյ՘շԷզՅԸիպԻլՎԾղՁտնմւգբՏՐ", (byte)64, 69);
                    NLoginCore_469.f[2] = NLoginCore_138.D("ӠҩӛӲҰӂҲӶӔӶӠӺӵӱӆӊӖӸһҺԀӛӈӉ", (byte)64, 68);
                    NLoginCore_469.f[3] = NLoginCore_324.A("ŨĵůŸĲŹŔķőŕŒŔţƆľŁƆŉņžŃťŒœ", (byte)64, 65);
                    NLoginCore_469.f[4] = NLoginCore_091.F("խմՓԵՒժԲՄմոլնյմհՏ՜յՖոյՀՙԾՉցջֆէփցտ", (byte)64, 70);
                    NLoginCore_469.f[5] = NLoginCore_384.D("ӡӐҽӁӃҮӰӫӦӭӨӫӳӸӹӫӛӭӳӍӁӋәӳҼӄӱӪҼҽӿԌ", (byte)64, 68);
                    NLoginCore_469.f[6] = NLoginCore_201.B("ŴŪœťĮŪŞŌĻŁĹŇ", (byte)64, 66);
                    NLoginCore_469.f[7] = NLoginCore_559.D("ӧҨӯӑӀӪӢӫӄӫӹӉҶӆҮӱӭӶӔԀһԀԂӤӧӔӁӽӔӁӨӊӢӾӝӥӱԏӾԕԃӣӨӭԘӨӗӦӭӛԊөӬӸӡӼԧӽӦԒөԇԌԅԧԜԙԁԅԅԝԌԂԠԦӽ", (byte)64, 68);
                    NLoginCore_469.f[8] = NLoginCore_138.B("ıŏıŖķŎŲŰŚŒŸŇ", (byte)64, 66);
                    NLoginCore_469.f[9] = NLoginCore_559.C("ӦҺӤӂӉӣӭӐӳӏӋӏӅӷӚӧҸӷӽԂӳӛӈӉ", (byte)64, 67);
                    NLoginCore_469.f[10] = NLoginCore_004.F("ՋՑղՆՎՌ՜շէջ՛Մ", (byte)64, 70);
                    NLoginCore_469.f[11] = NLoginCore_027.D("ӧҨӯӑӀӪӢӫӄӫӹӉҶӆҮӱӭӶӔԀһԀԂӤӧӔӁӽӔӁӨӊӭӋӈԃӰӉԊӐԂӖԐԌәӖӕԔӵԐӰәԖԀӡԏԆӷӼӻԧԕԋӺ", (byte)64, 68);
                    NLoginCore_469.f[12] = NLoginCore_138.C("ҫӪӨәҰӞӦӎүӂӪӸӵӣӹӊӋӯӵԀӕӛӈӉ", (byte)64, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_469.f[0] = NLoginCore_446.D("ӊӀӂӊӈӆӟӍұҿӪӒӲӺӗӜӐӳӭҹӱӱӈӉ", (byte)64, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_469.f[0] = NLoginCore_110.F("թՖեՖԶՂմ՜ՐձըծՊբՕխՙՓսփօՒՏՐ", (byte)64, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_469.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.C("ҝҿӁҡӅӤӜӲӞҭӫӡӯөҲӗӹӸӰӶӰӅ", (byte)64, 67), NLoginCore_469.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.E("՟լիԮծժեծչըԵճշհճչԻࢵࣂࣉࣇࣙ࣍࣍ࣝࢻࣖࣈ࣏Փ", (byte)64, 69) + string + NLoginCore_091.D("ү", (byte)64, 68) + methodType.toString(), exception);
        }
    }

    static {
        d = 0 >>> 139 | 0 << -139;
        o = Long.reverse(-4970274363046478221L);
        p = Long.reverse(0x6400000000000000L);
        z = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(-4970274363046478221L);
        ac = Long.reverse(0x6400000000000000L);
        af = Integer.reverse(Integer.MIN_VALUE);
        ah = (0 >>> 26 | 0 << -26) & 0xFFFFFFFF;
        ai = Integer.reverse(0x40000000);
        am = Long.reverse(-4970274363046478221L);
        ap = Long.reverse(0x6400000000000000L);
        aq = Integer.reverse(0x10000000);
        ar = 0x40000000 >>> 187 | 0x40000000 << -187;
        aw = Integer.reverse(-1073741824);
        ax = Long.reverse(-4970274363046478221L);
        ay = Long.reverse(0x6400000000000000L);
        az = (163840 >>> 14 | 163840 << ~14 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0x50000000);
        bd = Integer.reverse(0x20000000);
        be = Long.reverse(-4970274363046478221L);
        bh = Long.reverse(0x6400000000000000L);
        bi = (458752 >>> 79 | 458752 << -79) & 0xFFFFFFFF;
        bj = Integer.reverse(-1342177280);
        bl = (0x2000000 >>> 185 | 0x2000000 << ~185 + 1) & 0xFFFFFFFF;
        bn = 0x40000001 >>> 94 | 0x40000001 << -94;
        bo = Long.reverse(-4970274363046478221L);
        br = Long.reverse(0x6400000000000000L);
        bu = Integer.reverse(0x8000000);
        bw = 0x3C0000 >>> 18 | 0x3C0000 << ~18 + 1;
        bx = (0x800000 >>> 87 | 0x800000 << ~87 + 1) & 0xFFFFFFFF;
        bz = Integer.reverse(0x60000000);
        ca = Long.reverse(-4970274363046478221L);
        cd = Long.reverse(0x6400000000000000L);
        ce = Integer.reverse(-536870912);
        cf = Long.reverse(-4970274363046478221L);
        ci = Long.reverse(0x6400000000000000L);
        cj = Integer.reverse(0x10000000);
        ck = Long.reverse(-2376200977681072525L);
        cm = Integer.reverse(0);
        co = 0 >>> 152 | 0 << -152;
        cr = 327680 >>> 144 | 327680 << ~144 + 1;
        cs = Integer.reverse(0);
        cv = Integer.reverse(-1610612736);
        cy = (2304 >>> 40 | 2304 << ~40 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(-4970274363046478221L);
        dc = Long.reverse(0x6400000000000000L);
        dd = (0xA000000 >>> 184 | 0xA000000 << -184) & 0xFFFFFFFF;
        de = -1 >>> 162 | -1 << ~162 + 1;
        df = Long.reverse(-2376200977681072525L);
        dh = Integer.reverse(-805306368);
        di = Long.reverse(-4970274363046478221L);
        dj = Long.reverse(0x6400000000000000L);
        dk = Integer.reverse(0x30000000);
        dm = Long.reverse(-4970274363046478221L);
        dp = Long.reverse(0x6400000000000000L);
        dq = 0 >>> 35 | 0 << ~35 + 1;
        dr = Integer.reverse(0);
        dt = Integer.reverse(0);
        du = (13 >>> 224 | 13 << -224) & 0xFFFFFFFF;
        dw = Integer.reverse(-1342177280);
        e = new String[du];
        f = new String[dw];
        NLoginCore_469.void_b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(File file) {
        block15: {
            String string = null;
            String string2 = null;
            NLoginCore_549 NLoginCore_549 = NLoginCore_428.a(file);
            try {
                String string3;
                Object object;
                String string4;
                while ((string4 = NLoginCore_549.ah()) != null) {
                    if (string4.startsWith((String)NLoginCore_469.c("㺀", (int)ai, (long)(am ^ ap))) && string4.length() > aq) {
                        string = string4.substring(ar);
                        continue;
                    }
                    if (string4.startsWith((String)NLoginCore_469.c("㺃", (int)aw, (long)(ax ^ ay))) && string4.length() > az) {
                        string2 = string4.substring(bc);
                        continue;
                    }
                    object = string4.trim();
                    if (((String)object).startsWith((String)NLoginCore_469.c("㺆", (int)bd, (long)(be ^ bh))) && ((String)object).length() > bi) {
                        string = ((String)object).substring(bj, ((String)object).length() - bl);
                        continue;
                    }
                    if (!((String)object).startsWith((String)NLoginCore_469.c("㺉", (int)bn, (long)(bo ^ br))) || ((String)object).length() <= bu) continue;
                    string2 = ((String)object).substring(bw, ((String)object).length() - bx);
                }
                if (string2 == null) {
                    NLoginCore_370.c((String)NLoginCore_469.c("㺌", (int)bz, (long)(ca ^ cd)) + this.a.getName() + (String)NLoginCore_469.c("㺏", (int)ce, (long)(cf ^ ci)) + file.getName() + (String)NLoginCore_469.c("㺒", (int)cj, (long)ck), new Object[cm]);
                    return;
                }
                object = null;
                if (string == null) {
                    string3 = file.getName();
                    if (string3.length() > cr) {
                        string3 = string3.substring(cs, string3.length() - cv);
                    }
                    object = NLoginCore_432.c(string3);
                    OfflinePlayer offlinePlayer = ((Server)this.m.java_lang_Object_b().c()).getOfflinePlayer((UUID)object);
                    string = offlinePlayer.getName();
                }
                if (string != null) {
                    try {
                        string3 = new String(Base64.getDecoder().decode(string2.getBytes()));
                    }
                    catch (Exception exception) {
                        string3 = string2;
                    }
                    this.a(string, string3 + (String)NLoginCore_469.c("㺕", (int)cy, (long)(cz ^ dc)), null, (UUID)object);
                    break block15;
                }
                NLoginCore_370.c((String)NLoginCore_469.c("㺘", (int)(dd & de), (long)df) + this.a.getName() + (String)NLoginCore_469.c("㺛", (int)dh, (long)(di ^ dj)) + file.getName() + (String)NLoginCore_469.c("㺞", (int)dk, (long)(dm ^ dp)), new Object[dq]);
            }
            finally {
                if (Collections.singletonList(NLoginCore_549).get(co) != null) {
                    NLoginCore_549.close();
                }
            }
        }
    }

    public NLoginCore_469(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_g, (String)NLoginCore_469.c("㺀", (int)d, (long)(o ^ p)) + File.separator + (String)NLoginCore_469.c("㺃", (int)z, (long)(ab ^ ac)), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? af : ah) != 0);
    }
}

