/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_163
extends NLoginCore_098 {
    private static int fv;
    private static long ds;
    private static int fe;
    private static long cd;
    private static long df;
    private static int dk;
    private static long cu;
    private static long es;
    private static long dv;
    private static long eo;
    private static int ex;
    private static long q;
    private static int cr;
    private static long fx;
    private static long bk;
    private static long at;
    private static long ac;
    private static long br;
    private static long dp;
    private static int bq;
    private static String[] f;
    private static int dd;
    private static int cj;
    private static long gx;
    private static long ca;
    private static int cm;
    private static long ev;
    private static long dc;
    private static String[] var_java_lang_String_arr_e;
    private static int var_int_e;
    private static long ft;
    private static int fl;
    private static int gm;
    private static int em;
    private static long bo;
    private static int eu;
    private static int y;
    private static long ee;
    private static long gi;
    private static int fw;
    private static long be;
    private static int co;
    private static long by;
    private static int bp;
    private static long eb;
    private static int fz;
    private static int cy;
    private static long ci;
    private static long ef;
    private static long bh;
    private static long fu;
    private static int gq;
    private static long go;
    private static int bn;
    private static int ec;
    private static int dq;
    private static int bz;
    private static long fo;
    private static long o;
    private static int bi;
    private static long dj;
    private static int fh;
    private static int fd;
    private static long dg;
    private static long ff;
    private static int gj;
    private static long ab;
    private static int eq;
    private static int dw;
    private static long ct;
    private static long gu;
    private static int gy;
    private static int gc;
    private static int cg;
    private static int fa;
    private static long et;
    private static int gs;
    private static long fy;
    private static int db;
    private static int ek;
    private static int gz;
    private static long bv;
    private static long ge;
    private static long ew;
    private static int cv;
    private static long bm;
    private static int al;
    private static int bd;
    private static int fr;
    private static long p;
    private static long gr;
    private static int gg;
    private static long ez;
    private static int fp;
    private static int ey;
    private static int fb;
    private static long dm;
    private static int da;
    private static long di;
    private static int bu;
    private static long fn;
    private static int dh;
    private static long cz;
    private static int gd;
    private static long dy;
    private static int ce;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_163.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ѳҕҗѷқҺҲӈҴ҃ӁҷӅҿ҈ҭӏӎӆӌӆқ", (byte)50, 67), NLoginCore_163.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("Ց՞՝Ԡՠ՜՗ՠի՚ԧեթբեիԭ࢓ࣃࢼࣁࢦࢤࣂ࣌ࢽ࣏ࣁ࢝ࣅࣈࢵՈ", (byte)50, 69) + string + NLoginCore_091.B("ĝ", (byte)50, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(-9202820377070954658L);
        q = Long.reverse(0x5C00000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(-9202820377070954658L);
        ac = Long.reverse(0x5C00000000000000L);
        al = 16384 >>> 173 | 16384 << -173;
        at = Long.reverse(-2573521725581584546L);
        bd = -2147483647 >>> 95 | -2147483647 << ~95 + 1;
        be = Long.reverse(-9202820377070954658L);
        bh = Long.reverse(0x5C00000000000000L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(-9202820377070954658L);
        bm = Long.reverse(0x5C00000000000000L);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(-2573521725581584546L);
        bp = (1536 >>> 200 | 1536 << -200) & 0xFFFFFFFF;
        bq = Integer.reverse(-1);
        br = Long.reverse(-2573521725581584546L);
        bu = 28672 >>> 12 | 28672 << ~12 + 1;
        bv = Long.reverse(-9202820377070954658L);
        by = Long.reverse(0x5C00000000000000L);
        bz = Integer.reverse(0x10000000);
        ca = Long.reverse(-9202820377070954658L);
        cd = Long.reverse(0x5C00000000000000L);
        ce = 0x9000000 >>> 24 | 0x9000000 << -24;
        cg = (-1 >>> 111 | -1 << ~111 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-2573521725581584546L);
        cj = (16384 >>> 142 | 16384 << -142) & 0xFFFFFFFF;
        cm = Integer.reverse(0);
        co = (0 >>> 173 | 0 << ~173 + 1) & 0xFFFFFFFF;
        cr = Integer.reverse(0x50000000);
        ct = Long.reverse(-9202820377070954658L);
        cu = Long.reverse(0x5C00000000000000L);
        cv = 1733296128 >>> 179 | 1733296128 << -179;
        cy = Integer.reverse(-805306368);
        cz = Long.reverse(-2573521725581584546L);
        da = Integer.reverse(0x30000000);
        db = Integer.reverse(-1);
        dc = Long.reverse(-2573521725581584546L);
        dd = 6656 >>> 137 | 6656 << ~137 + 1;
        df = Long.reverse(-9202820377070954658L);
        dg = Long.reverse(0x5C00000000000000L);
        dh = 7168 >>> 105 | 7168 << -105;
        di = Long.reverse(-9202820377070954658L);
        dj = Long.reverse(0x5C00000000000000L);
        dk = Integer.reverse(-268435456);
        dm = Long.reverse(-9202820377070954658L);
        dp = Long.reverse(0x5C00000000000000L);
        dq = Integer.reverse(0x8000000);
        ds = Long.reverse(-9202820377070954658L);
        dv = Long.reverse(0x5C00000000000000L);
        dw = Integer.reverse(-2013265920);
        dy = Long.reverse(-9202820377070954658L);
        eb = Long.reverse(0x5C00000000000000L);
        ec = 288 >>> 228 | 288 << -228;
        ee = Long.reverse(-9202820377070954658L);
        ef = Long.reverse(0x5C00000000000000L);
        ek = Integer.reverse(-939524096);
        em = Integer.reverse(-1);
        eo = Long.reverse(-2573521725581584546L);
        eq = Integer.reverse(0x28000000);
        es = Long.reverse(-9202820377070954658L);
        et = Long.reverse(0x5C00000000000000L);
        eu = Integer.reverse(-1476395008);
        ev = Long.reverse(-9202820377070954658L);
        ew = Long.reverse(0x5C00000000000000L);
        ex = Integer.reverse(0x68000000);
        ey = Integer.reverse(-1);
        ez = Long.reverse(-2573521725581584546L);
        fa = 4 >>> 34 | 4 << ~34 + 1;
        fb = Integer.reverse(Integer.MIN_VALUE);
        fd = Integer.reverse(0);
        fe = (0xB80000 >>> 179 | 0xB80000 << -179) & 0xFFFFFFFF;
        ff = Long.reverse(-2573521725581584546L);
        fh = Integer.reverse(-1);
        fl = 48 >>> 129 | 48 << ~129 + 1;
        fn = Long.reverse(-9202820377070954658L);
        fo = Long.reverse(0x5C00000000000000L);
        fp = Integer.reverse(0);
        fr = Integer.reverse(-1744830464);
        ft = Long.reverse(-9202820377070954658L);
        fu = Long.reverse(0x5C00000000000000L);
        fv = Integer.reverse(Integer.MIN_VALUE);
        fw = (106496 >>> 172 | 106496 << ~172 + 1) & 0xFFFFFFFF;
        fx = Long.reverse(-9202820377070954658L);
        fy = Long.reverse(0x5C00000000000000L);
        fz = Integer.reverse(0x40000000);
        gc = Integer.reverse(-671088640);
        gd = Integer.reverse(-1);
        ge = Long.reverse(-2573521725581584546L);
        gg = (14336 >>> 201 | 14336 << ~201 + 1) & 0xFFFFFFFF;
        gi = Long.reverse(-2573521725581584546L);
        gj = 0x1D0000 >>> 80 | 0x1D0000 << ~80 + 1;
        gm = -1 >>> 114 | -1 << -114;
        go = Long.reverse(-2573521725581584546L);
        gq = Integer.reverse(0x78000000);
        gr = Long.reverse(-2573521725581584546L);
        gs = Integer.reverse(-134217728);
        gu = Long.reverse(-9202820377070954658L);
        gx = Long.reverse(0x5C00000000000000L);
        gy = Integer.reverse(0x4000000);
        gz = (512 >>> 132 | 512 << -132) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[gy];
        f = new String[gz];
        NLoginCore_163.void_b();
    }

    private static /* synthetic */ void a(long l, long l2, ForceRegisterConfig ForceRegisterConfig2) {
        ForceRegisterConfig2.a(l, l2);
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        int n = NLoginCore_2192.a(NLoginCore_163.c("㺀", (int)cr, (long)(ct ^ cu)), cv);
        String string = NLoginCore_2192.a(NLoginCore_163.c("㺃", (int)cy, (long)cz), (String)NLoginCore_163.c("㺆", (int)(da & db), (long)dc));
        String string2 = NLoginCore_2192.a(NLoginCore_163.c("㺉", (int)dd, (long)(df ^ dg)), (String)NLoginCore_163.c("㺌", (int)dh, (long)(di ^ dj)));
        String string3 = NLoginCore_2192.a(NLoginCore_163.c("㺏", (int)dk, (long)(dm ^ dp)), (String)NLoginCore_163.c("㺒", (int)dq, (long)(ds ^ dv)));
        String string4 = NLoginCore_2192.a(NLoginCore_163.c("㺕", (int)dw, (long)(dy ^ eb)), (String)NLoginCore_163.c("㺘", (int)ec, (long)(ee ^ ef)));
        this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, n, string2, string3, string4, new Properties()));
    }

    private static void void_b() {
        int n;
        o = 8856802780170457601L;
        long l = o ^ 0x9A1B26F28655B38DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(51 + 18), (byte)(78 + 5), 47, (byte)(40 + 27), (byte)(3 + 63), (byte)(52 + 15), (byte)(14 + 33), (byte)(6 + 74), (byte)(12 + 63), (byte)(26 + 41), (byte)(81 + 2), (byte)(33 + 20), (byte)(6 + 74), (byte)(8 + 89), 100, (byte)(49 + 51), (byte)(104 + 1), (byte)(34 + 76), (byte)(28 + 75)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(49 + 34)}, StandardCharsets.UTF_8));
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
                    NLoginCore_163.f[0] = NLoginCore_201.B("ſűƮžƧƆƃƨƘŭƧƊƙƗƲǀƣƏżƗžƵƌƍ", (byte)93, 66);
                    NLoginCore_163.f[1] = NLoginCore_324.D("ԯՁԔԡԂԗԺԃԫԆԅԘԡԤԼԞԦ԰ՋԩԬ՘ԟԠ", (byte)93, 68);
                    NLoginCore_163.f[2] = NLoginCore_004.E("՟Ց֎՞ևզգֈոՍևժչշ֒֠փկ՜շ՞֕լխ", (byte)93, 69);
                    NLoginCore_163.f[3] = NLoginCore_201.A("ƦƒƲžƒƴƏƬŸƺƝƎƫžƚǂƴƟźſŽǈƑƘƄƪƆƿǋǐƫƫ", (byte)93, 65);
                    NLoginCore_163.f[4] = NLoginCore_091.F("ֆղ֒՞ղ֔կ֌՘֚սծ֋՞պ֢֔տ՚՟՝֨ձոդ֊զְ֟֫֋֋", (byte)93, 70);
                    NLoginCore_163.f[5] = NLoginCore_110.B("ƦƒƲžƒƴƏƬŸƺƤƝƟƩƎƓƾƽƭƲƸƕƱƃƣƋƚƜơƸƩǆ", (byte)93, 66);
                    NLoginCore_163.f[6] = NLoginCore_384.B("ƦƒƲžƒƴƏƬŸƺƤƳƘƴŸƳưźƶžƔǀƁƻǂƝƉƢǊƤƦƱ", (byte)93, 66);
                    NLoginCore_163.f[7] = NLoginCore_138.C("ԹԥՅԑԥՇԢԿԋՍ԰ԜՆՉ԰ԮԱԤԩԧՅԷՃ՚՛ԧՋՖԚ՗ԝԵ", (byte)93, 67);
                    NLoginCore_163.f[8] = NLoginCore_110.D("ԹԥՅԑԥՇԢԿԋՍԯԢՒԎՌԴՐՌԤԢԩԪԭԛԏ՟՜ԱԯԸԕԶ", (byte)93, 68);
                    NLoginCore_163.f[9] = NLoginCore_138.A("ƦƒƲžƒƴƏƬŸƺƝŴƖƺƠƳƜƷƏƵƅƃƩƤǃƢƥƶƿǏưǍ", (byte)93, 65);
                    NLoginCore_163.f[10] = NLoginCore_559.D("ԹԥՅԑԥՇԢԿԋՍԷՆԫՇԋՆՃԍՉԑԧՓԔՎՕ԰ԜԵ՝ԷԹՄ", (byte)93, 68);
                    NLoginCore_163.f[11] = NLoginCore_451.C("ԹԥՅԑԥՇԢԿԋՍԷ԰ԲԼԡԦՑՐՀՅՋԨՄԖԶԞԭԯԴՋԼՙ", (byte)93, 67);
                    NLoginCore_163.f[12] = NLoginCore_076.C("ԦԃӹԦԙՋԉՆԗԹԽԎԨԤԟՌԬԞԶԳԑ՘ԟԠ", (byte)93, 67);
                    NLoginCore_163.f[13] = NLoginCore_138.E("ֆղ֒՞ղ֔կ֌՘֚սթ֖֓սջվձնմ֒ք֐֧֨մ֣֘է֤ժւ", (byte)93, 69);
                    NLoginCore_163.f[14] = NLoginCore_138.E("թՋել֖մ֒կ֙հ՚լ՜֌ծղն֠փ՗֥֜լխ", (byte)93, 69);
                    NLoginCore_163.f[15] = NLoginCore_223.C("ԹԥՅԑԥՇԢԿԋՍԯԢՒԎՌԴՐՌԤԢԩԪԭԛԏ՟՜ԱԯԸԕԶ", (byte)93, 67);
                    NLoginCore_163.f[16] = NLoginCore_223.B("ŬƈŽƎŬƈƢƒŸŷŻƁ", (byte)93, 66);
                    NLoginCore_163.f[17] = NLoginCore_223.C("ԹԥՅԑԥՇԢԿԋՍ԰ԇԩՍԳՆԯՊԢՈԘԖԼԷՖԵԸՉՒբՃՠ", (byte)93, 67);
                    NLoginCore_163.f[18] = NLoginCore_223.F("բֆ֊֕հշլէ֘ֈՓա", (byte)93, 70);
                    NLoginCore_163.f[19] = NLoginCore_427.E("ջՌՓֆհֈՎ֍պ֖֗ա", (byte)93, 69);
                    NLoginCore_163.f[20] = NLoginCore_076.C("ԕԽԒԓԧԆԃՃԹԇԆԔ", (byte)93, 67);
                    NLoginCore_163.f[21] = NLoginCore_091.D("ԸԆԃԂԝӼՉԔՆԇՉՈԍՆԓՎԶԨՋԐԫՈԟԠ", (byte)93, 68);
                    NLoginCore_163.f[22] = NLoginCore_559.E("Ռբ֋զտփ֖ֈՌըՙՕջ֚֜ճխ֓֠օ֖֕լխ", (byte)93, 69);
                    NLoginCore_163.f[23] = NLoginCore_201.F("֐մՔմ֓֘Ֆդ՚ձ֊ա", (byte)93, 70);
                    NLoginCore_163.f[24] = NLoginCore_201.A("ƤŲƃŴƖƇƎƴƒƆŷƁ", (byte)93, 65);
                    NLoginCore_163.f[25] = NLoginCore_091.E("բՠաօծբ֖֐իոդա", (byte)93, 69);
                    NLoginCore_163.f[26] = NLoginCore_324.C("ՄԜԶԺԞԻԢԴԝԾԯԔ", (byte)93, 67);
                    NLoginCore_163.f[27] = NLoginCore_446.C("ԘԂԾӾԠԤԓՃՅԪԎԔ", (byte)93, 67);
                    NLoginCore_163.f[28] = NLoginCore_027.F("եՏ֋Ջխձՠ֐֒շ՛ա", (byte)93, 70);
                    NLoginCore_163.f[29] = NLoginCore_575.D("ԚԲԕԾԱԫԷԺՇԾԫԔ", (byte)93, 68);
                    NLoginCore_163.f[30] = NLoginCore_201.E("ժ՜էՋճբ֍ք֏Օի՚֞իժ֌֢֋հւ՟տլխ", (byte)93, 69);
                    NLoginCore_163.f[31] = NLoginCore_201.A("ƄťƓƑƮƟƲūƇŵƊƲƗſƜƝƮſƿƏǂƵƌƍ", (byte)93, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_163.f[0] = NLoginCore_427.F("՟Ց֎՞ևզգֈոՍ։֝֝ղռիբ՜ր֥չտլխ", (byte)93, 70);
                    NLoginCore_163.f[1] = NLoginCore_384.B("ƜƮƁƎůƄƧŰƘųŲŴƨƘƭƎƚƲƂƏƅƟƌƍ", (byte)93, 66);
                    NLoginCore_163.f[2] = NLoginCore_324.C("ԒԄՁԑԺԙԖԻԫԀԺԭՌԈԳԠԨՓՃԱՎՈԟԠ", (byte)93, 67);
                    NLoginCore_163.f[3] = NLoginCore_324.B("ƦƒƲžƒƴƏƬŸƺƝƎƫžƚǂƴƟźſŽŹƧƈǊƤƽƩǃǅǎƻ", (byte)93, 66);
                    NLoginCore_163.f[4] = NLoginCore_004.E("ֆղ֒՞ղ֔կ֌՘֚սծ֋՞պ֢֔տ՚՟՝դր֔տթզտ֫֊տ֤", (byte)93, 69);
                    NLoginCore_163.f[5] = NLoginCore_076.F("ֆղ֒՞ղ֔կ֌՘֚քստ։ծճ֞֝֍֒֘կ֧֤֞՝֝ևջ֛֣ւ", (byte)93, 70);
                    NLoginCore_163.f[6] = NLoginCore_575.C("ԹԥՅԑԥՇԢԿԋՍԷՆԫՇԋՆՃԍՉԑԧՔՅԱԫՎԭԩՕՕ՝ԣ", (byte)93, 67);
                    NLoginCore_163.f[7] = NLoginCore_223.F("ֆղ֒՞ղ֔կ֌՘֚սթ֖֓սջվձնմ֒րզղ֖֢֚֨֫չէ֍֋ֳַֹ֟֔֕մ֧յֲց", (byte)93, 70);
                    NLoginCore_163.f[8] = NLoginCore_427.E("ֆղ֒՞ղ֔կ֌՘֚ռկ֟՛֙ց֝֙ձկնմղաաէցְ֧֭֭֩֬֒։֟֕ցֱ֩֋օֶց", (byte)93, 69);
                    NLoginCore_163.f[9] = NLoginCore_201.E("ֆղ֒՞ղ֔կ֌՘֚սՔն֚ր֓ռ֗կ֕եՙե֙ը։ը֩֌֪֚֟֌֏֓֝խ֑ղ֭ղֲֈց", (byte)93, 69);
                    NLoginCore_163.f[10] = NLoginCore_027.F("ֆղ֒՞ղ֔կ֌՘֚ք֓ո֔՘֓֐՚֖՞մ֣֚֜պդֆ֧֩֊ւ֮", (byte)93, 70);
                    NLoginCore_163.f[11] = NLoginCore_027.F("ֆղ֒՞ղ֔կ֌՘֚քստ։ծճ֞֝֍֒֘կե֜շգ֜ռշְ֙է", (byte)93, 70);
                    NLoginCore_163.f[12] = NLoginCore_110.F("ճՐՆճզ֘Ֆ֓դֆ֊հ֌՜՗֏֝քափ֞֕լխ", (byte)93, 70);
                    NLoginCore_163.f[13] = NLoginCore_384.C("ԹԥՅԑԥՇԢԿԋՍ԰ԜՆՉ԰ԮԱԤԩԧՅՄԒԎԕՎԬԗԲԢՃՕ", (byte)93, 67);
                    NLoginCore_163.f[14] = NLoginCore_091.F("թՋել֖մ֒կ֙հ՗շճ֕՛՞կռ֣֤ն֥լխ", (byte)93, 70);
                    NLoginCore_163.f[15] = NLoginCore_384.F("ֆղ֒՞ղ֔կ֌՘֚ռկ֟՛֙ց֝֙ձկնճե֟֡եօ֍֖ևֱ֦", (byte)93, 70);
                    NLoginCore_163.f[16] = NLoginCore_091.F("քլ֊ՒՌեձըՒ֛լա", (byte)93, 70);
                    NLoginCore_163.f[17] = NLoginCore_384.C("ԹԥՅԑԥՇԢԿԋՍ԰ԇԩՍԳՆԯՊԢՈԘՙՙԙՈԾ՛Ԓ՚ԶԚԡՎ՘՛ՂՃԩԼբգԤԮԴ", (byte)93, 67);
                    NLoginCore_163.f[18] = NLoginCore_384.B("ƳƯƎƵžƕƢŲƋŻƎŵƿƵƯƯŴƻƹƘƁƵƌƍ", (byte)93, 66);
                    NLoginCore_163.f[19] = NLoginCore_384.C("ԃՀԿԄԩԿԞӾՂԩԹԔ", (byte)93, 67);
                    NLoginCore_163.f[20] = NLoginCore_201.F("աճլղֈֆՐ֍֔֒֎ա", (byte)93, 70);
                    NLoginCore_163.f[21] = NLoginCore_384.C("ԸԆԃԂԝӼՉԔՆԇՉԯԺԋՔԔԧԯՀԮԧ՘ԟԠ", (byte)93, 67);
                    NLoginCore_163.f[22] = NLoginCore_201.A("ŬƂƫƆƟƣƶƨŬƈźƜƵƫƿƘƙƝƟƟǅƏƌƍ", (byte)93, 65);
                    NLoginCore_163.f[23] = NLoginCore_091.F("փգՔաշեծդՕՙլա", (byte)93, 70);
                    NLoginCore_163.f[24] = NLoginCore_446.A("ƞƥƓƨƞƔƌƌƴưƈƁ", (byte)93, 65);
                    NLoginCore_163.f[25] = NLoginCore_384.B("ƃŽƟƄƭŵƠƣƓƛƸƩƆƴŲŹƙƐƘǀƄƏƌƍ", (byte)93, 66);
                    NLoginCore_163.f[26] = NLoginCore_138.F("Րծէ՝կՏ֗֌֛֕Քօսէ՜ջ՚ւաբֆ֕լխ", (byte)93, 70);
                    NLoginCore_163.f[27] = NLoginCore_324.A("ƤƯƈžƈƒƀūűƗƦƁ", (byte)93, 65);
                    NLoginCore_163.f[28] = NLoginCore_027.F("քցճև֊֍Ֆ֐Ք֛լա", (byte)93, 70);
                    NLoginCore_163.f[29] = NLoginCore_324.E("քՑ՞ՌֈՒՖՕկ֎լա", (byte)93, 69);
                    NLoginCore_163.f[30] = NLoginCore_223.C("ԝԏԚӾԦԕՀԷՂԈԞՂՀՏԓԢՁՔԒԸԦԢԟԠ", (byte)93, 67);
                    NLoginCore_163.f[31] = NLoginCore_384.B("ƄťƓƑƮƟƲūƇŵƋŷƾƘƖƿƿżŻƳƀƏƌƍ", (byte)93, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_163.f[0] = NLoginCore_387.C("ӾԵԦԲԹԢԜԙԛՇԯԔ", (byte)93, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_163.f[0] = NLoginCore_027.A("ƭƯƩƊƎƸƖūŴŻƥƗƖƵƝƁƭƖſƽƁƲſƀƙƤƩƣǆǅƟƫ", (byte)93, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0x9A1B26F28655B38DL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(11 + 58), (byte)(20 + 63), (byte)(5 + 42), (byte)(59 + 8), (byte)(5 + 61), (byte)(5 + 62), (byte)(33 + 14), 80, (byte)(37 + 38), (byte)(11 + 56), (byte)(58 + 25), 53, (byte)(22 + 58), (byte)(30 + 67), (byte)(57 + 43), (byte)(30 + 70), (byte)(22 + 83), (byte)(94 + 16), (byte)(15 + 88)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.A("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӀӰөӮӓӑӯӹӪӼӮӊӲӵӢ", (byte)78, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_163.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_163(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_m, (String)NLoginCore_163.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_163.c("㺃", (int)y, (long)(ab ^ ac)));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void b(ResultSet var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public boolean isAvailable() {
        if (super.isAvailable()) {
            NLoginCore_219 NLoginCore_2192 = this.com_nickuc_login_NLoginCore_219_a((String)NLoginCore_163.c("㺀", (int)al, (long)at));
            return (NLoginCore_2192.p((String)NLoginCore_163.c("㺃", (int)bd, (long)(be ^ bh))) && NLoginCore_2192.d(NLoginCore_163.c("㺆", (int)bi, (long)(bk ^ bm))) && NLoginCore_2192.p((String)NLoginCore_163.c("㺉", (int)bn, (long)bo)) && NLoginCore_2192.p((String)NLoginCore_163.c("㺌", (int)(bp & bq), (long)br)) && NLoginCore_2192.p((String)NLoginCore_163.c("㺏", (int)bu, (long)(bv ^ by))) && NLoginCore_2192.p((String)NLoginCore_163.c("㺒", (int)bz, (long)(ca ^ cd))) && NLoginCore_2192.p((String)NLoginCore_163.c("㺕", (int)(ce & cg), (long)ci)) ? cj : cm) != 0;
        }
        return co != 0;
    }
}

