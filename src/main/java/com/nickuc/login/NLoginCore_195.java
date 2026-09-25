/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_255;
import com.nickuc.login.NLoginCore_303;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_515;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_195 {
    private static long br;
    private static long var_long_c;
    private static int u;
    private static long n;
    private static long ar;
    private static int aa;
    private static long e;
    private static int ag;
    private static int bu;
    private static int m;
    private static long t;
    private static int d;
    private static long q;
    private static int as;
    private static int aq;
    private static int am;
    private static int var_int_b;
    private static int o;
    private static long af;
    private static int s;
    private static long bd;
    private static int ab;
    private static long k;
    private static long bi;
    private static int j;
    private static long p;
    private static long av;
    private static int bh;
    private static int f;
    private static int ba;
    private static int bq;
    private static long ah;
    private static int bo;
    private static int var_int_a;
    private static int bb;
    private static int x;
    private static int be;
    private static long y;
    private static int bt;
    private static int cd;
    private static int bm;
    private static int var_int_c;
    private static long ak;
    private static long bw;
    private static String[] var_java_lang_String_arr_a;
    private static int bk;
    private static int ap;
    private static int aj;
    private static int bx;
    private static int bp;
    private static int cb;
    private static int i;
    private static long by;
    private static int au;
    private static int ao;
    private static int bn;
    private static int ax;
    private static long ac;
    private static int al;
    private static int r;
    private static long bg;
    private static long az;
    private static long ay;
    private static long bj;
    private static int ca;
    private static int bv;
    private static long bf;
    private static long h;
    private static long v;
    private static int at;
    private static int cc;
    private static int l;
    private static int bl;
    private static long aw;
    private static long ai;
    private static long ae;
    private static long z;
    private static long w;
    private static int ad;
    private static String[] var_java_lang_String_arr_b;
    private static long bz;
    private static long g;
    private static int bc;
    private static int bs;
    private static long an;

    private static String a(int n, long l) {
        l ^= 0x37L;
        l ^= 0x9D7E5A66ED593A48L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(5 + 64), (byte)(46 + 37), (byte)(37 + 10), 67, (byte)(27 + 39), (byte)(12 + 55), (byte)(21 + 26), (byte)(48 + 32), (byte)(9 + 66), (byte)(5 + 62), (byte)(29 + 54), 53, (byte)(39 + 41), (byte)(9 + 88), (byte)(56 + 44), (byte)(2 + 98), (byte)(45 + 60), (byte)(78 + 32), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.D("ս֊։Ռ֌ֈփ֌֗ֆՓ֑֕֎֑֗ՙ࣭ࣥ࣍࣢ࣵ࣬ࣨࣻ࣪", (byte)119, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_195.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static void b(NLoginType_008 NLoginType_008, boolean bl) {
        NLoginCore_055[] NLoginCore_055Array;
        NLoginCore_055[] NLoginCore_055Array2;
        int n;
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        String string = NLoginCore_150.aC();
        NLoginCore_150.var_com_nickuc_login_NLoginCore_055_b = NLoginCore_055.b(string);
        int n2 = n = bl || !NLoginCore_532.ap.ar() ? NLoginCore_195.bl : bm;
        if (n != 0) {
            NLoginCore_055[] NLoginCore_055Array3 = new NLoginCore_055[bn];
            NLoginCore_055Array2 = NLoginCore_055Array3;
            NLoginCore_055Array3[NLoginCore_195.bo] = NLoginCore_150.var_com_nickuc_login_NLoginCore_055_b;
        } else {
            NLoginCore_055Array2 = (NLoginCore_055[])Arrays.stream(NLoginCore_055.values()).filter(NLoginCore_0552 -> (NLoginCore_0552 != NLoginCore_055.var_com_nickuc_login_NLoginCore_055_x ? ca : cb) != 0).toArray(NLoginCore_055[]::new);
        }
        NLoginCore_055[] NLoginCore_055Array4 = NLoginCore_055Array = NLoginCore_055Array2;
        int n3 = NLoginCore_055Array4.length;
        for (int i = bp; i < n3; ++i) {
            NLoginCore_055 NLoginCore_0553 = NLoginCore_055Array4[i];
            NLoginCore_150.a(NLoginType_008, NLoginCore_0553);
        }
        Object[] objectArray = new Object[bs];
        objectArray[NLoginCore_195.bt] = NLoginCore_2702.h();
        objectArray[NLoginCore_195.bu] = n != 0 ? NLoginCore_195.c("㺃", (int)bv, (long)bw) : NLoginCore_195.c("㺆", (int)bx, (long)(by ^ bz));
        NLoginCore_370.b((String)NLoginCore_195.c("㺀", (int)bq, (long)br), objectArray);
    }

    public static boolean e(NLoginType_008 NLoginType_008) {
        return BCryptHashProvider.com_nickuc_login_NLoginCore_515_a(NLoginType_008, var_int_a != 0, var_int_b != 0).aQ();
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 1024 >>> 10 | 1024 << -10;
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(-1);
        e = Long.reverse(-9061982545526500820L);
        f = 65536 >>> 80 | 65536 << ~80 + 1;
        g = Long.reverse(7943609647424492076L);
        h = Long.reverse(-1441151880758558720L);
        i = (32 >>> 196 | 32 << ~196 + 1) & 0xFFFFFFFF;
        j = -1 >>> 33 | -1 << -33;
        k = Long.reverse(-9061982545526500820L);
        l = Integer.reverse(-1073741824);
        m = Integer.reverse(-1);
        n = Long.reverse(-9061982545526500820L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(7943609647424492076L);
        q = Long.reverse(-1441151880758558720L);
        r = 20 >>> 226 | 20 << -226;
        s = Integer.reverse(-1);
        t = Long.reverse(-9061982545526500820L);
        u = (0x3000000 >>> 87 | 0x3000000 << ~87 + 1) & 0xFFFFFFFF;
        v = Long.reverse(7943609647424492076L);
        w = Long.reverse(-1441151880758558720L);
        x = Integer.reverse(-536870912);
        y = Long.reverse(7943609647424492076L);
        z = Long.reverse(-1441151880758558720L);
        aa = 0x2000000 >>> 22 | 0x2000000 << ~22 + 1;
        ab = Integer.reverse(-1);
        ac = Long.reverse(-9061982545526500820L);
        ad = Integer.reverse(-1879048192);
        ae = Long.reverse(7943609647424492076L);
        af = Long.reverse(-1441151880758558720L);
        ag = Integer.reverse(0x50000000);
        ah = Long.reverse(7943609647424492076L);
        ai = Long.reverse(-1441151880758558720L);
        aj = Integer.reverse(-805306368);
        ak = Long.reverse(-9061982545526500820L);
        al = (6144 >>> 233 | 6144 << -233) & 0xFFFFFFFF;
        am = Integer.reverse(-1);
        an = Long.reverse(-9061982545526500820L);
        ao = Integer.reverse(0);
        ap = (13 >>> 64 | 13 << ~64 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(-1);
        ar = Long.reverse(-9061982545526500820L);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = Integer.reverse(0);
        au = 917504 >>> 208 | 917504 << -208;
        av = Long.reverse(7943609647424492076L);
        aw = Long.reverse(-1441151880758558720L);
        ax = Integer.reverse(-268435456);
        ay = Long.reverse(7943609647424492076L);
        az = Long.reverse(-1441151880758558720L);
        ba = Integer.reverse(0);
        bb = Integer.reverse(0x8000000);
        bc = Integer.reverse(-1);
        bd = Long.reverse(-9061982545526500820L);
        be = (0x220000 >>> 209 | 0x220000 << -209) & 0xFFFFFFFF;
        bf = Long.reverse(7943609647424492076L);
        bg = Long.reverse(-1441151880758558720L);
        bh = 4608 >>> 104 | 4608 << -104;
        bi = Long.reverse(7943609647424492076L);
        bj = Long.reverse(-1441151880758558720L);
        bk = (Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31) & 0xFFFFFFFF;
        bl = Integer.reverse(Integer.MIN_VALUE);
        bm = 0 >>> 218 | 0 << -218;
        bn = (0x200000 >>> 245 | 0x200000 << ~245 + 1) & 0xFFFFFFFF;
        bo = (0 >>> 26 | 0 << ~26 + 1) & 0xFFFFFFFF;
        bp = 0 >>> 67 | 0 << ~67 + 1;
        bq = Integer.reverse(-939524096);
        br = Long.reverse(-9061982545526500820L);
        bs = 256 >>> 167 | 256 << -167;
        bt = Integer.reverse(0);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bv = Integer.reverse(0x28000000);
        bw = Long.reverse(-9061982545526500820L);
        bx = Integer.reverse(-1476395008);
        by = Long.reverse(7943609647424492076L);
        bz = Long.reverse(-1441151880758558720L);
        ca = 16384 >>> 174 | 16384 << ~174 + 1;
        cb = 0 >>> 69 | 0 << ~69 + 1;
        cc = Integer.reverse(0x68000000);
        cd = 0x5800000 >>> 54 | 0x5800000 << -54;
        var_java_lang_String_arr_a = new String[cc];
        var_java_lang_String_arr_b = new String[cd];
        NLoginCore_195.b();
    }

    private static void b() {
        int n;
        var_long_c = 3767921502993431670L;
        long l = var_long_c ^ 0x9D7E5A66ED593A48L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(52 + 31), 47, (byte)(28 + 39), (byte)(38 + 28), (byte)(28 + 39), (byte)(39 + 8), (byte)(56 + 24), (byte)(16 + 59), (byte)(29 + 38), (byte)(6 + 77), (byte)(24 + 29), (byte)(51 + 29), (byte)(43 + 54), (byte)(27 + 73), (byte)(36 + 64), (byte)(17 + 88), (byte)(109 + 1), (byte)(12 + 91)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
                    NLoginCore_195.var_java_lang_String_arr_b[0] = NLoginCore_384.F("շՂքշցֆ՘՛Սսւ֐սծ֕֊Սցչ֕քգՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[1] = NLoginCore_173.D("ԁԋӵԢӭԔӠԚԆӽԛӦԮӧԟԉԅԎӭԑԄӾӻӼ", (byte)81, 68);
                    NLoginCore_195.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ƈƍŧŦŦƜŠƠŵƋŚƚƖƅƚũŵũƦŪƜƇŴŵ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[3] = NLoginCore_138.F("մչՓՒՒֈՌ֌աշՆֆւձֆՕաՕ֒Ֆֈճՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[4] = NLoginCore_451.B("ŷŻřřŻźƋžƑƟşũ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ӾԂӠӠԂԁԒԅԘԦӦӰ", (byte)81, 68);
                    NLoginCore_195.var_java_lang_String_arr_b[6] = NLoginCore_446.C("ԏԔӮӭӭԣӧԧӼԒӡԨԈԁԎԟԂӭӭԈԔԤӻӼ", (byte)81, 67);
                    NLoginCore_195.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ԏԔӮӭӭԣӧԧӼԒӡԡԝԌԡӰӼӰԭӱԣԎӻӼ", (byte)81, 67);
                    NLoginCore_195.var_java_lang_String_arr_b[8] = NLoginCore_138.F("Փվևղ֊֊լւպՏՍ֐զիֆ֔խՑ֙ա֚֙ՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[9] = NLoginCore_091.D("ԏԔӮӭӭԣӧԧӼԒӡӧӧԏӼԠӽԀԈԳԇԧԦԡ԰ԚԊԅԕԩԞӹ", (byte)81, 68);
                    NLoginCore_195.var_java_lang_String_arr_b[10] = NLoginCore_173.F("ԾՒ՟՜Ք։Ֆշե՛՜Օ", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[11] = NLoginCore_138.B("ţŒƐůƈƜŭƞƍƂŹŜżŹšŦŪƘƝŵŨŷŴŵ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[12] = NLoginCore_384.A("ŒƇŔƌźƕŨŶųŽƢũ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[13] = NLoginCore_110.F("ԼՆՂփՙբցՃ֋՘՞ժբ՟ֈ֔խրմգ֛ծէհ֝֙իռ֒ՙլ֟գ֕֙յճ֡ւ֋֞֎֌յ", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[14] = NLoginCore_575.F("չ՗՞աօմ֌դՇխհՕ", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[15] = NLoginCore_575.C("ӱӞӽԌԖԐӞԘԦԞԞӪԖԀ԰ԮԣԱԒӴԳԔԂԖԁӬӶԴԮԖԕԡԩԑԲԁԐԯԁԽՆՄԓԐ", (byte)81, 67);
                    NLoginCore_195.var_java_lang_String_arr_b[16] = NLoginCore_387.A("ŚōũœŰƑůƟƑƙƘƔŞŤƨŵƆźơƃƃƇŴŵ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[17] = NLoginCore_201.B("ŪƕƛŶƛŕũūŝſƏƤƞŶšŦƛƚƅƍƙƐůŰƇũƂūŶųƩƷ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[18] = NLoginCore_091.C("ԌԔԙӽԛӶԙӲԉԁӥԗԚԡԠӯԯԆӮԄԃԎӻӼ", (byte)81, 67);
                    NLoginCore_195.var_java_lang_String_arr_b[19] = NLoginCore_091.A("ŹƚŭŰŕƐŴŽŘƢƅŽŰƓŴƖƇŨƤƃƥŽƠţžƏŽƵƩŮƍƬƇƃƬƗƒƚſƞƠƌƙƞƔƄƙơƨƥǌƺǅƽƔƕ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[20] = NLoginCore_384.D("ӠԃԠӿԣԂԠԟԇӤӡԔԡԬԅԡԈԮԁԱԨӾӻӼ", (byte)81, 68);
                    NLoginCore_195.var_java_lang_String_arr_b[21] = NLoginCore_110.E("զԹճտֈչս֍պ֌ցըՒՍ֒օխբ֓ժ֖ճՠա", (byte)81, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_195.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ԒӝԟԒԜԡӳӶӨԘԠԧԌԆԫԩӹԊԀԐԍӾӻӼ", (byte)81, 68);
                    NLoginCore_195.var_java_lang_String_arr_b[1] = NLoginCore_451.E("զհ՚ևՒչՅտիբտծցքփըթ֐Փքքճՠա", (byte)81, 69);
                    NLoginCore_195.var_java_lang_String_arr_b[2] = NLoginCore_173.F("մչՓՒՒֈՌ֌աշՐ֌թ֎ֈժՑ։Վչֈ։ՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[3] = NLoginCore_223.F("մչՓՒՒֈՌ֌աշՐհիս֑խվգհժ֚գՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[4] = NLoginCore_201.F("՗ՆբՒ՝Ջ՘ստՈՙՃծֈ֏՞ժէ֊թՖճՠա", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[5] = NLoginCore_387.A("ƔőƏŘųƗŲſƖŷŬũ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[6] = NLoginCore_451.A("ƈƍŧŦŦƜŠƠŵƋŤŻŞƥšŻƉŸūťſƙžƉƫƳŬƬƁųƬū", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[7] = NLoginCore_384.A("ƈƍŧŦŦƜŠƠŵƋţŭƇƧŻţƫƙŵƎŧƭŴŵ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[8] = NLoginCore_559.B("ŧƒƛƆƞƞƀƖƎţşųŰŷŵƂſƛƬƩŧƨźƲŲŽƣƖŴƘƌƍ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[9] = NLoginCore_138.B("ƈƍŧŦŦƜŠƠŵƋŚŠŠƈŵƙŶŹƁƬƀƞƠƮƣơƉƕƊƯƆƕ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[10] = NLoginCore_027.B("ŲőŶŨŐƘŨŗŷƙƒƟŲŸƟƂŪžƈƀƈƇŴŵ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[11] = NLoginCore_110.F("ՏԾռ՛մֈՙ֊չծե՟ցջՆմՒև֓զղՒ։֞։ղջ֓չՙ֟֡", (byte)81, 70);
                    NLoginCore_195.var_java_lang_String_arr_b[12] = NLoginCore_027.E("ՠՕջ։մ՝֋֌էոՋՕ", (byte)81, 69);
                    NLoginCore_195.var_java_lang_String_arr_b[13] = NLoginCore_384.B("ŐŚŖƗŭŶƕŗƟŬŲžŶųƜƨƁƔƈŷƯƂŻƄƱƭſƐƦŭƀƳƔƦƤŹŵƟƋƓƽƺƮƉ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[14] = NLoginCore_201.E("գչցթԼսա֊ռժֆՕ", (byte)81, 69);
                    NLoginCore_195.var_java_lang_String_arr_b[15] = NLoginCore_387.B("ŪŗŶƅƏƉŗƑƟƗƗţƏŹƩƧƜƪƋŭƬƍŻƏźťůƭƧƏƎƚƅƷƱƴƏƏƝǀƹƜǂƞƹƾƹƉƗƦƽƠƺƽƔƕ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[16] = NLoginCore_575.C("ӡӔӰӚӷԘӶԦԘԠԝӬԣԞԜӧԆԞԦӭԶӮԆӮԓԋԲԭӼӶӹԳ", (byte)81, 67);
                    NLoginCore_195.var_java_lang_String_arr_b[17] = NLoginCore_173.B("ŪƕƛŶƛŕũūŝſƏƤƞŶšŦƛƚƅƍƙƎůƃűƤưſƇƋƈƯƍƥƍƕƴƬƉƹƘŽƤƉ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[18] = NLoginCore_091.A("ƅƍƒŶƔůƒūƂźŜŵţŢƑŽƆƞƦƍžƇŴŵ", (byte)81, 65);
                    NLoginCore_195.var_java_lang_String_arr_b[19] = NLoginCore_027.E("եֆՙ՜ՁռՠթՄ֎ձթ՜տՠւճՔ֐կ֑թ֌Տժջթ֡֕՚չ֘ճկ֘փվֆի֊֌ոֆժ֋ր֢֧հֵ֢֮լ֓րց", (byte)81, 69);
                    NLoginCore_195.var_java_lang_String_arr_b[20] = NLoginCore_110.B("řżƙŸƜŻƙƘƀŝŖśƝžŧŨƀƣƌƁƇƭŴŵ", (byte)81, 66);
                    NLoginCore_195.var_java_lang_String_arr_b[21] = NLoginCore_559.B("źōƇƓƜƍƑơƎƠƔƎƚŽųšƤƆƗƩŧƭžƨƐƒŽƔƦƓƢƧ", (byte)81, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_195.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ӪԘԑӜӢӘԙӟӱӴԥӨԧԘԮԁԮԜԏӪӾӾӻӼ", (byte)81, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_195.var_java_lang_String_arr_b[0] = NLoginCore_387.E("դվՙՓ֋թքՙ՛ՊսՍֆռծՌժ֐ՑՑ֎ղՖ֙կկՖ։սրսգ", (byte)81, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_195.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ŽƟơƁƥǄƼǒƾƍǋǁǏǉƒƷǙǘǐǖǐƥ", (byte)107, 66), NLoginCore_195.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.D("ՙզեԨըդ՟ըճբԯխձժխճԵࣉࣁࢩࢾ࣑ࣈࣄࣗࣆՊ", (byte)107, 68) + string + NLoginCore_091.D("԰", (byte)107, 68) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_515 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_219 NLoginCore_2192, String string, boolean bl) {
        return NLoginCore_195.a(NLoginInterface_0112, NLoginCore_2192, string, null, bl);
    }

    public static NLoginCore_515 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_219 NLoginCore_2192, String string, @Nullable NLoginCore_055 NLoginCore_0552, boolean bl) {
        Object object;
        Object object2;
        Object object3;
        if (NLoginCore_2192.r() && !bl) {
            return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_a;
        }
        if (NLoginCore_0552 == null && (object3 = NLoginCore_303.a()) != null) {
            switch (NLoginCore_255.af[object3.ordinal()]) {
                case 1: {
                    NLoginCore_0552 = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_m;
                    break;
                }
                case 2: {
                    NLoginCore_0552 = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_d;
                    break;
                }
                case 3: {
                    NLoginCore_0552 = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_e;
                    break;
                }
                case 4: {
                    NLoginCore_0552 = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c;
                    break;
                }
                case 5: {
                    NLoginCore_0552 = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_g;
                }
            }
        }
        if (NLoginCore_0552 == null && ((File)(object3 = new File(NLoginInterface_0112.java_io_File_c().getParentFile(), (String)NLoginCore_195.c("㺀", (int)(var_int_c & d), (long)e)))).exists() && ((File)object3).isDirectory() && ((NLoginCore_219)(object2 = new NLoginCore_219((String)NLoginCore_195.c("㺃", (int)f, (long)(g ^ h)), (File)object3))).p((String)NLoginCore_195.c("㺆", (int)(i & j), (long)k)) && (object = object2.java_lang_String_b(NLoginCore_195.c("㺉", (int)(l & m), (long)n))) != null) {
            if (!((String)object).endsWith((String)NLoginCore_195.c("㺌", (int)o, (long)(p ^ q)))) {
                object = (String)object + (String)NLoginCore_195.c("㺏", (int)(r & s), (long)t);
            }
            NLoginCore_0552 = NLoginCore_055.b((String)object);
        }
        if (NLoginCore_0552 == null) {
            object3 = NLoginInterface_0112.com_nickuc_login_NLoginCore_219_a().a(NLoginCore_195.c("㺒", (int)u, (long)(v ^ w)), NLoginInterface_0112.com_nickuc_login_NLoginCore_219_a().a(NLoginCore_195.c("㺕", (int)x, (long)(y ^ z)), (String)NLoginCore_195.c("㺘", (int)(aa & ab), (long)ac)));
            NLoginCore_0552 = NLoginCore_055.b((String)object3);
        }
        if (bl) {
            object3 = NLoginCore_055.a(NLoginCore_2192.int_a(NLoginCore_195.c("㺛", (int)ad, (long)(ae ^ af))));
            if (object3 == NLoginCore_0552) {
                return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_a;
            }
            object2 = NLoginCore_2192.d();
            if (!((File)object2).renameTo((File)(object = NLoginCore_366.a((File)object2, NLoginCore_366.c((File)object2) + (String)NLoginCore_195.c("㺞", (int)ag, (long)(ah ^ ai)))))) {
                NLoginCore_370.c((String)NLoginCore_195.c("㺡", (int)aj, (long)ak) + ((File)object2).getAbsolutePath() + (String)NLoginCore_195.c("㺤", (int)(al & am), (long)an) + ((File)object).getAbsolutePath(), new Object[ao]);
                return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_b;
            }
        }
        Object[] objectArray = new Object[as];
        objectArray[NLoginCore_195.at] = NLoginCore_0552.cP;
        if (NLoginCore_2192.o((String)NLoginCore_195.c("㺧", (int)(ap & aq), (long)ar) + String.format(string, objectArray))) {
            NLoginCore_370.b((String)NLoginCore_195.c("㺪", (int)au, (long)(av ^ aw)) + NLoginCore_2192.d().getName() + (String)NLoginCore_195.c("㺭", (int)ax, (long)(ay ^ az)), new Object[ba]);
            if (((String)NLoginCore_195.c("㺰", (int)(bb & bc), (long)bd)).equals(string) || ((String)NLoginCore_195.c("㺳", (int)be, (long)(bf ^ bg))).equals(string)) {
                NLoginInterface_0112.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().com_nickuc_login_NLoginCore_482_a((String)NLoginCore_195.c("㺶", (int)bh, (long)(bi ^ bj)), bk != 0).ag();
            }
        }
        return NLoginCore_515.var_com_nickuc_login_NLoginCore_515_a;
    }
}

