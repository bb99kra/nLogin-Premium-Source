/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 *  net.md_5.bungee.BungeeCord
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.event.PreLoginEvent
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_016;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_045;
import com.nickuc.login.NLoginCore_240;
import com.nickuc.login.NLoginType_023;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_284;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_078;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_247;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginType_009;
import com.nickuc.login.NLoginCore_017;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.PreLoginEvent;

public class NLoginCore_326
extends NLoginCore_045 {
    private static int br;
    private static long bg;
    private static long i;
    private static int ai;
    private static int bf;
    private static int q;
    private static long au;
    private static long ck;
    private static int cf;
    private static long bo;
    private static int bh;
    private static int v;
    private static int bn;
    private static long cg;
    private static int be;
    private static long av;
    private static long af;
    private static int bp;
    private static long bz;
    private static int at;
    private static String[] d;
    private static long bs;
    private static int al;
    private static int aw;
    private static long ac;
    private static long bj;
    private static int bk;
    private static int ah;
    private static int cb;
    private static int h;
    private static int cj;
    private static int u;
    private static long ce;
    private static long bb;
    private static long ba;
    private static long cd;
    private final NLoginCore_017 var_com_nickuc_login_NLoginCore_017_a;
    private static String[] var_java_lang_String_arr_c;
    private static int ar;
    private static int l;
    private static int bc;
    private static int bv;
    private static int cu;
    private static int bd;
    private static long ay;
    private static long aq;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_a;
    private static long cm;
    private static long bw;
    private static int ak;
    private static int bt;
    private static long p;
    private static long t;
    private static int cq;
    private static int ap;
    private static int cs;
    private static int an;
    private static int ao;
    private static long bi;
    private static long as;
    private static long ag;
    private static int cl;
    private static long y;
    private static long bl;
    private static long cn;
    private static int bm;
    private static long e;
    private static long ab;
    private static long g;
    private static long bx;
    private static int by;
    private static int x;
    private static long s;
    private static long ax;
    private static int az;
    private static long aj;
    private static long ch;
    private static long w;
    private static int n;
    private static int cp;
    private static int ct;
    private static long z;
    private static long o;
    private static int aa;
    private static int bu;
    private static int am;
    private static int ae;
    private static int bq;
    private static long m;
    private static int var_int_c;
    private static int co;
    private static int cr;
    private static int ci;
    private static int r;
    private static int ad;
    private static long ca;
    private static int cc;

    static {
        var_int_c = 0 >>> 59 | 0 << ~59 + 1;
        g = Long.reverse(-5946861006846608734L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(-5946861006846608734L);
        l = Integer.reverse(0x40000000);
        m = Long.reverse(-5946861006846608734L);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(4573547722690869922L);
        p = Long.reverse(-7926335344172072960L);
        q = 0 >>> 222 | 0 << -222;
        r = 0x2000000 >>> 119 | 0x2000000 << ~119 + 1;
        s = Long.reverse(4573547722690869922L);
        t = Long.reverse(-7926335344172072960L);
        u = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        v = Integer.reverse(-1610612736);
        w = Long.reverse(-5946861006846608734L);
        x = 1536 >>> 200 | 1536 << -200;
        y = Long.reverse(4573547722690869922L);
        z = Long.reverse(-7926335344172072960L);
        aa = (0x1C0000 >>> 178 | 0x1C0000 << -178) & 0xFFFFFFFF;
        ab = Long.reverse(4573547722690869922L);
        ac = Long.reverse(-7926335344172072960L);
        ad = (0 >>> 179 | 0 << ~179 + 1) & 0xFFFFFFFF;
        ae = (0x200000 >>> 242 | 0x200000 << -242) & 0xFFFFFFFF;
        af = Long.reverse(4573547722690869922L);
        ag = Long.reverse(-7926335344172072960L);
        ah = Integer.reverse(0);
        ai = (0x240000 >>> 146 | 0x240000 << -146) & 0xFFFFFFFF;
        aj = Long.reverse(-5946861006846608734L);
        ak = (0 >>> 236 | 0 << ~236 + 1) & 0xFFFFFFFF;
        al = Integer.reverse(0);
        am = Integer.reverse(0);
        an = Integer.reverse(0);
        ao = 10 >>> 192 | 10 << ~192 + 1;
        ap = Integer.reverse(-1);
        aq = Long.reverse(-5946861006846608734L);
        ar = 88 >>> 195 | 88 << ~195 + 1;
        as = Long.reverse(-5946861006846608734L);
        at = Integer.reverse(0x30000000);
        au = Long.reverse(4573547722690869922L);
        av = Long.reverse(-7926335344172072960L);
        aw = (13312 >>> 202 | 13312 << ~202 + 1) & 0xFFFFFFFF;
        ax = Long.reverse(4573547722690869922L);
        ay = Long.reverse(-7926335344172072960L);
        az = Integer.reverse(0x70000000);
        ba = Long.reverse(4573547722690869922L);
        bb = Long.reverse(-7926335344172072960L);
        bc = Integer.reverse(0);
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = Integer.reverse(0);
        bf = Integer.reverse(-268435456);
        bg = Long.reverse(-5946861006846608734L);
        bh = (32768 >>> 11 | 32768 << ~11 + 1) & 0xFFFFFFFF;
        bi = Long.reverse(4573547722690869922L);
        bj = Long.reverse(-7926335344172072960L);
        bk = Integer.reverse(-2013265920);
        bl = Long.reverse(-5946861006846608734L);
        bm = (4608 >>> 232 | 4608 << -232) & 0xFFFFFFFF;
        bn = Integer.reverse(-1);
        bo = Long.reverse(-5946861006846608734L);
        bp = Integer.reverse(0);
        bq = Integer.reverse(-939524096);
        br = Integer.reverse(-1);
        bs = Long.reverse(-5946861006846608734L);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = Integer.reverse(0x40000000);
        bv = (0x5000000 >>> 22 | 0x5000000 << ~22 + 1) & 0xFFFFFFFF;
        bw = Long.reverse(4573547722690869922L);
        bx = Long.reverse(-7926335344172072960L);
        by = Integer.reverse(-1476395008);
        bz = Long.reverse(4573547722690869922L);
        ca = Long.reverse(-7926335344172072960L);
        cb = Integer.reverse(0);
        cc = (90112 >>> 12 | 90112 << -12) & 0xFFFFFFFF;
        cd = Long.reverse(4573547722690869922L);
        ce = Long.reverse(-7926335344172072960L);
        cf = Integer.reverse(-402653184);
        cg = Long.reverse(4573547722690869922L);
        ch = Long.reverse(-7926335344172072960L);
        ci = 0x300000 >>> 241 | 0x300000 << -241;
        cj = (-1 >>> 36 | -1 << ~36 + 1) & 0xFFFFFFFF;
        ck = Long.reverse(-5946861006846608734L);
        cl = Integer.reverse(-1744830464);
        cm = Long.reverse(4573547722690869922L);
        cn = Long.reverse(-7926335344172072960L);
        co = Integer.reverse(0);
        cp = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        cq = (256 >>> 200 | 256 << ~200 + 1) & 0xFFFFFFFF;
        cr = Integer.reverse(0);
        cs = Integer.reverse(0);
        ct = 0x680000 >>> 178 | 0x680000 << ~178 + 1;
        cu = 0xD000000 >>> 151 | 0xD000000 << ~151 + 1;
        var_java_lang_String_arr_c = new String[ct];
        d = new String[cu];
        NLoginCore_326.d();
    }

    @Override
    public void b() {
        super.b();
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && BungeeCord.getInstance().getConfig().isPreventProxyConnections()) {
            String string = ProxyServer.getInstance().getName();
            Object object = NLoginCore_326.e("㺀", (int)var_int_c, (long)g);
            if (NLoginCore_150.j()) {
                NLoginCore_370.c((String)NLoginCore_326.e("㺃", (int)h, (long)i) + (String)object + (String)NLoginCore_326.e("㺆", (int)l, (long)m) + string + (String)NLoginCore_326.e("㺉", (int)n, (long)(o ^ p)), new Object[q]);
                NLoginCore_370.c((String)NLoginCore_326.e("㺌", (int)r, (long)(s ^ t)), new Object[u]);
            } else {
                NLoginCore_370.c((String)NLoginCore_326.e("㺏", (int)v, (long)w) + (String)object + (String)NLoginCore_326.e("㺒", (int)x, (long)(y ^ z)) + string + (String)NLoginCore_326.e("㺕", (int)aa, (long)(ab ^ ac)), new Object[ad]);
                NLoginCore_370.c((String)NLoginCore_326.e("㺘", (int)ae, (long)(af ^ ag)), new Object[ah]);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x49L;
        l ^= 0xD79235F2A467A256L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(68 + 1), (byte)(29 + 54), 47, (byte)(39 + 28), (byte)(31 + 35), (byte)(38 + 29), (byte)(22 + 25), (byte)(28 + 52), (byte)(33 + 42), (byte)(52 + 15), (byte)(69 + 14), (byte)(19 + 34), (byte)(27 + 53), (byte)(9 + 88), (byte)(55 + 45), (byte)(70 + 30), (byte)(66 + 39), (byte)(30 + 80), (byte)(28 + 75)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(26 + 57)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.A("ǌǙǘƛǛǗǒǛǦǕƢǠǤǝǠǦƨ԰ԭԶՅԱ԰ՉԸԼԣԤ", (byte)117, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_326.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    @Override
    public nLoginAPI com_nickuc_login_api_nLoginAPI_a() {
        return new NLoginType_023(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginType_008_a());
    }

    public NLoginCore_326(nLoginBungee nLoginBungee2) {
        super(nLoginBungee2);
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a = nLoginBungee2;
        this.var_com_nickuc_login_NLoginCore_017_a = new NLoginCore_017(nLoginBungee2);
    }

    @Override
    public NLoginCore_240 com_nickuc_login_NLoginCore_240_a() {
        return new NLoginCore_240(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginType_008_a());
    }

    @Override
    public NLoginInterface_030 com_nickuc_login_NLoginInterface_030_a() {
        return new NLoginCore_284(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a, this.var_com_nickuc_login_NLoginCore_017_a);
    }

    @Override
    public void f() {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginCore_345_a().c(NLoginCore_326.e("㺀", (int)(ao & ap), (long)aq));
    }

    private static void d() {
        int n;
        e = 4998030697122832124L;
        long l = e ^ 0xD79235F2A467A256L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(4 + 65), 83, (byte)(36 + 11), (byte)(48 + 19), (byte)(62 + 4), (byte)(17 + 50), (byte)(25 + 22), (byte)(52 + 28), (byte)(52 + 23), (byte)(5 + 62), 83, (byte)(52 + 1), (byte)(73 + 7), (byte)(18 + 79), (byte)(73 + 27), (byte)(87 + 13), (byte)(93 + 12), (byte)(59 + 51), (byte)(86 + 17)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_326.d[0] = NLoginCore_451.C("ՀԱӹԸՊԤԋԞԿԽՄՊՁՆԱՊԱԦԑՅՃԩԺՎՅԭՈԱՔ՚ՔԮԡԵՄԚՙեՊըԵԿԻԴ", (byte)93, 67);
                    NLoginCore_326.d[1] = NLoginCore_559.E("Ոաօտ֎֓Ւ֒ձ֔֋՚֝֔֞ր֕ք՝ւ֥֘լխ", (byte)93, 69);
                    NLoginCore_326.d[2] = NLoginCore_091.B("ƞƈƋžŬŴƵƵƧƗƛƐƩƫƾŷƱƤƜƳưƤǅǅƔǃƅƌƛƷǑƥƍƠƥƞƶǒƮƓƮǙǚơ", (byte)93, 66);
                    NLoginCore_326.d[3] = NLoginCore_201.C("ՁԾԲԳԀԸՂԆԇԯԛԔ", (byte)93, 67);
                    NLoginCore_326.d[4] = NLoginCore_027.D("ԙԙԥԐԵԥՄԴԡԢԘԯԡԪԪԤԽՂԶՊԬՅՃԓԵԽՋԼԷՎՙՌՁԟԵՉՒՇբԨԼՈՉՉ՜ԲՄՊԳյհԵԲԴՖՔԵէՒս՜Ցմփտե՜ռՓՠռօԿևՋՆ֏Վ֏Ցը՟շֆ֓Քՙ֘նձ՛խւպց֗֔ձՠ։ա֧֚֡֙ջպ֘սև֏֦֏֞տշ֧ն֌ֱֳֳֻֻֽ֦֑֜ջֆվ׀֥֕֠֘֞֞׌ׁׂ֧֟֟֔׈ֲׇ֑֡׃֚֕׆֫נד׏נן", (byte)93, 68);
                    NLoginCore_326.d[5] = NLoginCore_575.E("աւզՍՎՉՎյ֔֎՘֝պև֐֌֝֌շ֙զկլխ", (byte)93, 69);
                    NLoginCore_326.d[6] = NLoginCore_559.E("֐֒՜՝֖կ֑֒֎յ֓։սըճՓբ֚֔֔դ֖֦֒ժնդ֮֘շ֠տ", (byte)93, 69);
                    NLoginCore_326.d[7] = NLoginCore_092.C("ԖԵԢԓՄԂԩԨՂԙԿԜԫԜՒԋԓԷԎԦԗ՘ԟԠ", (byte)93, 67);
                    NLoginCore_326.d[8] = NLoginCore_138.B("ƄƊůŴƌűƃƬƛƮƼƭŰƞǁƀƘƤƭƮǅƨƝƱƇƘƷƋƨơƯƟƩƎƒƤƓƑǒǙǚƦƛǎǑƺƱƚƛƸǘǗǀƻơƧƤǗƶƷƠǗǮƯǇǰǦǕưǦǰǭǬǫǝǆǝǜƻǮǟƾǲǘƸƹǣȊǙǿǋǠȅǟǩǻǰǪȏǠȂǬȂǋǬȆǤǛȗȎǛǼȡǬǺǢǘǷșȑȠȨȕǥǽțȚǫ", (byte)93, 66);
                    NLoginCore_326.d[9] = NLoginCore_110.B("ƮƤƆƖƔƯƩƪƶƵƐŹƯƿƵƐƒƷƁưǃǅƌƍ", (byte)93, 66);
                    NLoginCore_326.d[10] = NLoginCore_446.F("֎քզնմ֏։֊֖֕հՙ֏֟֕հղ֗ա֐֣֥լխ", (byte)93, 70);
                    NLoginCore_326.d[11] = NLoginCore_092.E("՜՛թ՝էՔղզ֕՚ևձ֕ը֚֎ղ֥֗֐տՠքթր֠֔տցը֋֞սվ֑֯֗֊։֤ոָֺ֜֒֠֫֏֢֣֙վׅ֝֌֍", (byte)93, 69);
                    NLoginCore_326.d[12] = NLoginCore_324.B("ƈơưƳƏƕƊƮƛưƄƁ", (byte)93, 66);
                    NLoginCore_326.d[13] = NLoginCore_384.B("ƞűƦƊƠƨƗŵƍƍŻƁ", (byte)93, 66);
                    NLoginCore_326.d[14] = NLoginCore_453.C("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ՗ՊԔԢԟԠ", (byte)93, 67);
                    NLoginCore_326.d[15] = NLoginCore_027.B("ƑƧūƍſƘƧƲƯƜŸƇƾƓƈƙưǀƑƴƒƴƛǂƆƨǊƼǄƩƥƾǂƩƦƴǆƐǍǕƥǌƘǘƘǎƵǒƻƝƵƱƤǙƲƧƷǃƪǉǎǈƺǀǣǃǔǪǓƲƸǓǅǑǲǁ", (byte)93, 66);
                    NLoginCore_326.d[16] = NLoginCore_076.D("ԤԺӾԠԒԫԺՅՂԯԋԚՑԦԛԬՃՓԤՇԥՂՅԔ԰ՌԬՕՏՁդԶ", (byte)93, 68);
                    NLoginCore_326.d[17] = NLoginCore_427.D("ԱԄԹԝԳԻԪԈԠԠԎԔ", (byte)93, 68);
                    NLoginCore_326.d[18] = NLoginCore_559.F("՛֌ճր֑֑ևՒշ֑ղղէՙնպռ֗ւվօՠ֩օմ֟գեօ֛լֆ", (byte)93, 70);
                    NLoginCore_326.d[19] = NLoginCore_384.D("ՀԻՄԻԕԞԿՂԊԠԟԞԡԬԭՁԕԱՂԤՄԙԙ՝ՌՓԲՋՍՒԣՖ", (byte)93, 68);
                    NLoginCore_326.d[20] = NLoginCore_559.B("ƮƒſƂƂũƏŸƴƕƜƩƹƋƨƺſƓƏƱŽƄƴƕƜƻƿƅƮƻǄƍƜǋƢǈƲǔƑưƺƓươ", (byte)93, 66);
                    NLoginCore_326.d[21] = NLoginCore_223.D("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ՗ՊԔԢԟԠ", (byte)93, 68);
                    NLoginCore_326.d[22] = NLoginCore_091.B("ŰƔƜƢƔƠƧƶƙźƮŷƉưƒƔƶƭƑƄƓƀǃƀƃǈǋƙƉưƢǎ", (byte)93, 66);
                    NLoginCore_326.d[23] = NLoginCore_201.D("ԞԐԐ԰ԓԤԉԻՌՍՍԔ", (byte)93, 68);
                    NLoginCore_326.d[24] = NLoginCore_324.B("ƎƳżƇűƭƁƲƣŶƔƁ", (byte)93, 66);
                    NLoginCore_326.d[25] = NLoginCore_453.D("ԎԿԦԳՄՄԺԅԪՄԦԚՅԭՀԡԳԏ՗ՊԔԢԟԠ", (byte)93, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_326.d[0] = NLoginCore_027.F("֍վՆօ֗ձ՘ի֌֊֑֗֎֓վ֗վճ՞֒֐նև֛֒պ֕վ֧֡֡ջծս֡֕ը֗ց։ֳո֪ց", (byte)93, 70);
                    NLoginCore_326.d[1] = NLoginCore_324.A("ŨƁƥƟƮƳŲƲƑƴƬƪƇƠƒƑŹƯſƁƒƏƌƍ", (byte)93, 65);
                    NLoginCore_326.d[2] = NLoginCore_091.C("ԱԛԞԑӿԇՈՈԺԪԮԣԼԾՑԊՄԷԯՆՃԷ՘՘ԧՖԘԟԮՊդԸԷզԞՂՕԸԴՂՍդ՛՝ԾԮղդՠԮգէՕՂԿՀ", (byte)93, 67);
                    NLoginCore_326.d[3] = NLoginCore_173.F("ղգը֕֔իՓ֎֔ն՛ա", (byte)93, 70);
                    NLoginCore_326.d[4] = NLoginCore_453.F("զզղ՝ւղ֑ցծկեռծշշձ֊֏փ֗չ֒֐ՠւ֊֘։ք֛֦֙֎լւ֖֟֔֯յ։֖֖֕֩տ֑֗րֽׂւտց֣֡ւִ֟׊ׁ֩֞א׌ֲ֩׉֭֠׉ג֌ה֘֓ל֛לֵ֞֬ׄדנ֦֡ץ׃־ֺ֨׏ׇ׎פס־֭ז֮ק׮צ״׈ׇץ׊הל׳ל׫׌ׄ״׃י؊ש׳؀מ׾؀؈؈׈ד׋؍ע׭ץ׫׫ײؙ؎׬׬״؏סؕؔ׮׿צ؝ײإ׵ئ؞׿؆׿׾", (byte)93, 70);
                    NLoginCore_326.d[5] = NLoginCore_201.E("աւզՍՎՉՎյ֔֎՘ՙղ֊ժցմ֦֚֝֗չ֠ադ֝թ֧֋֧֭ւ", (byte)93, 69);
                    NLoginCore_326.d[6] = NLoginCore_575.F("֐֒՜՝֖կ֑֒֎յ֓։սըճՓբ֚֔֔դ֑֚֕ղ֦֢֠֗րֱք", (byte)93, 70);
                    NLoginCore_326.d[7] = NLoginCore_427.B("ƃƢƏƀƱůƖƕƯƆƪƭƻƈǁƿƫƠơƃƜƽƣƩƚƩƤƹƸƞǊƪ", (byte)93, 66);
                    NLoginCore_326.d[8] = NLoginCore_223.F("դժՏՔլՑգ֌ջ֎֜֍Րվ֡ՠոք֍֎֥ֈս֑էո֗իֈց֏տ։ծղքճձֲֹֺֆջֱ֑֚֮պջַָ֛֘֠ցևքַ֖֗րַ׎֏֧א׆ֵ֐׆א׍׌׋ּֽֽ֦֛׎ֿ֞גָ֘֙׃תֹן֫׀ץֿ׉כא׊ׯ׀ע׌ע֫׌צֻׄ׷׮ֻל؁׌ךָׂמג״׈הצ׹؅׺ױף؀׿ס׬؋،א׳ؐ׼؎ס", (byte)93, 70);
                    NLoginCore_326.d[9] = NLoginCore_138.B("ƮƤƆƖƔƯƩƪƶƵƓƫƶſžǁƞƳƾƽƢƟƌƍ", (byte)93, 66);
                    NLoginCore_326.d[10] = NLoginCore_027.C("ՁԷԙԩԧՂԼԽՉՈԦԣԪԋԐԥԪԎ՘ՖԩԲԟԠ", (byte)93, 67);
                    NLoginCore_326.d[11] = NLoginCore_324.E("՜՛թ՝էՔղզ֕՚ևձ֕ը֚֎ղ֥֗֐տՠքթր֠֔տցը֋֞սվ֑֯֗֊։֤ոָ֤֫շֱտִׂ֢֑֘֙֟֌֍", (byte)93, 69);
                    NLoginCore_326.d[12] = NLoginCore_110.B("ƤƢŲƤƪƗƦƩƏƑżŷŵƬƻƋƹƣƛƱƻƵƌƍ", (byte)93, 66);
                    NLoginCore_326.d[13] = NLoginCore_138.F("հեդցՏ֐ևՔղ՛֐թժ֙֕։֙֎֕ճձ֕լխ", (byte)93, 70);
                    NLoginCore_326.d[14] = NLoginCore_091.A("ŻƬƓƠƱƱƧŲƗƱƐƆƭƜžƹƣƟƿƍǂƳƄƸƠǆƔơƄƷƬǇ", (byte)93, 65);
                    NLoginCore_326.d[15] = NLoginCore_387.C("ԤԺӾԠԒԫԺՅՂԯԋԚՑԦԛԬՃՓԤՇԥՇԮՕԙԻ՝Տ՗ԼԸՑՕԼԹՇՙԣՠըԸ՟ԫիԫաՈեՎ԰ՈՄԷլՅԺՊՖԽ՜ա՛ՍՓպԿ՝ՀշՈբ֊՛֍՚՜գծՋհզՒժ֎ճ֘՟ՠ", (byte)93, 67);
                    NLoginCore_326.d[16] = NLoginCore_446.A("ƑƧūƍſƘƧƲƯƜŸƇƾƓƈƙưǀƑƴƒƳƓƀƲƷǉƌƾǋƥƿ", (byte)93, 65);
                    NLoginCore_326.d[17] = NLoginCore_384.D("ӿԅԹԖԨԇԊԃԜԋՇՐԲԺԿԟՃՋԯՔԸՈԟԠ", (byte)93, 68);
                    NLoginCore_326.d[18] = NLoginCore_027.D("ԎԿԦԳՄՄԺԅԪՄԥԥԚԌԩԭԯՊԵԱԸԐԫԸՏԗԶՍԪԭԚՠ", (byte)93, 68);
                    NLoginCore_326.d[19] = NLoginCore_453.B("ƭƨƱƨƂƋƬƯŷƍƌƋƎƙƚƮƂƞƯƑƱƂƐƷƇƵƬƞƷƛǊƢ", (byte)93, 66);
                    NLoginCore_326.d[20] = NLoginCore_384.A("ƮƒſƂƂũƏŸƴƕƜƩƹƋƨƺſƓƏƱŽƄƴƕƜƻƿƅƮƻǄƍǒƊƽǓƈưƯƴƤƹƼơ", (byte)93, 65);
                    NLoginCore_326.d[21] = NLoginCore_138.F("՛֌ճր֑֑ևՒշ֑ղշչտժա՜ս֟մ՜ս՚շթջգդծշ֐֮", (byte)93, 70);
                    NLoginCore_326.d[22] = NLoginCore_027.A("ŰƔƜƢƔƠƧƶƙźƮŷƉưƒƔƶƭƑƄƓǆƺƁƔƛƂƭƍǅǁƉ", (byte)93, 65);
                    NLoginCore_326.d[23] = NLoginCore_575.A("ŪƒſƏƳŷŸƒƏƧƌƁ", (byte)93, 65);
                    NLoginCore_326.d[24] = NLoginCore_384.A("ƂƑƬƟưŵųƙƊƖƶŻŻƪƩƓƣƓƞƮƕǅƌƍ", (byte)93, 65);
                    NLoginCore_326.d[25] = NLoginCore_575.C("ԎԿԦԳՄՄԺԅԪՄԦԘԐԾԉԳԿԴԳԣ԰ԷԵԖ԰ՉՕՀԭ԰ԙԷ", (byte)93, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_326.d[0] = NLoginCore_384.C("ӽՆԞԒԕԧԶՋՃՁԾՊԻԟՋՆԿԭՂԠ՗ՈԟԠ", (byte)93, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_326.d[0] = NLoginCore_384.C("ӼԳԼԶԵԹԡԙՅԣԺԱՒԬՔԳԓՀԓԖԪ՘ԟԠ", (byte)93, 67);
                }
            }
        }
    }

    private static Object e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_326.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ÅçéÉíČĄĚĆÕēĉėđÚÿġĠĘĞĘí", (byte)15, 65), NLoginCore_326.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("ԮԻԺӽԽԹԴԽՈԷԄՂՆԿՂՈԊ࢒࢏࢘ࢧ࢓࢒ࢫ࢚࢞ࢅࢆԡ", (byte)15, 69) + string + NLoginCore_091.F("ԅ", (byte)15, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public void e() {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginCore_345_a().a(NLoginCore_326.e("㺀", (int)ai, (long)aj), this.var_com_nickuc_login_NLoginCore_017_a);
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.a(new NLoginCore_247(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a, this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[ak]);
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.a(new NLoginType_009(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a, this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[al]);
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.a(new NLoginCore_078(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a, this.var_com_nickuc_login_proxy_bungee_nLoginBungee_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[am]);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        NLoginCore_370.a((String string, String string2, Object[] objectArray) -> {
            switch (objectArray.length) {
                case 2: {
                    if (!atomicBoolean.get() || !string2.equals(NLoginCore_326.e("㺀", (int)ar, (long)as)) && (!string2.startsWith((String)NLoginCore_326.e("㺃", (int)at, (long)(au ^ av))) || !string2.contains((CharSequence)NLoginCore_326.e("㺆", (int)aw, (long)(ax ^ ay))) || !string2.endsWith((String)NLoginCore_326.e("㺉", (int)az, (long)(ba ^ bb))))) break;
                    return (objectArray[bc] instanceof PreLoginEvent && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && !NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar() ? bd : be) != 0;
                }
                case 3: {
                    String string3;
                    if (!string2.equals(NLoginCore_326.e("㺌", (int)bf, (long)bg)) && (!string2.startsWith((String)NLoginCore_326.e("㺏", (int)bh, (long)(bi ^ bj))) || !string2.contains((CharSequence)NLoginCore_326.e("㺒", (int)bk, (long)bl)) || !string2.contains((CharSequence)NLoginCore_326.e("㺕", (int)(bm & bn), (long)bo))) || !(string3 = (String)objectArray[bp]).startsWith((String)NLoginCore_326.e("㺘", (int)(bq & br), (long)bs))) break;
                    Object object = objectArray[bt];
                    Object object2 = objectArray[bu];
                    if (string3.equals(NLoginCore_247.class.getCanonicalName()) && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && !NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                        NLoginCore_370.b((String)NLoginCore_326.e("㺛", (int)bv, (long)(bw ^ bx)) + object + (String)NLoginCore_326.e("㺞", (int)by, (long)(bz ^ ca)), new Object[cb]);
                    } else {
                        NLoginCore_370.c((String)NLoginCore_326.e("㺡", (int)cc, (long)(cd ^ ce)) + string3 + (String)NLoginCore_326.e("㺤", (int)cf, (long)(cg ^ ch)) + object2.getClass().getSimpleName() + (String)NLoginCore_326.e("㺧", (int)(ci & cj), (long)ck) + object + (String)NLoginCore_326.e("㺪", (int)cl, (long)(cm ^ cn)), new Object[co]);
                    }
                    atomicBoolean.set(cp != 0);
                    return cq != 0;
                }
                default: {
                    atomicBoolean.set(cr != 0);
                }
            }
            return cs != 0;
        }, new NLoginInterface_016[an]);
    }
}

