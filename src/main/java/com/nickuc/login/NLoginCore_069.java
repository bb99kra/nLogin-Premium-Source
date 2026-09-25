/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 */
package com.nickuc.login;

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
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
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
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_210;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_069 {
    private static long var_long_c;
    private static int x;
    private static long t;
    private static int al;
    private static int av;
    private static String[] var_java_lang_String_arr_b;
    private static int bv;
    private static int var_int_b;
    private static int bb;
    private static int bu;
    private static int l;
    private static int bh;
    private static long am;
    private static long ah;
    private static long q;
    private static int ad;
    private static int be;
    private static long bp;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_a;
    private static int bk;
    private static long bf;
    private static long z;
    private static long au;
    private static int r;
    private static int ay;
    private static int bx;
    private static long h;
    private static int i;
    private static int m;
    private static int bl;
    private static int ap;
    private static long d;
    private static int an;
    private static int aa;
    private static int f;
    private static long ae;
    private static int ab;
    private static long aj;
    private static int bq;
    private static int ai;
    private static long bs;
    private static long s;
    private static long g;
    private static long bg;
    private static int p;
    private static long as;
    private static int aw;
    private static int ao;
    private static int y;
    private static int bm;
    private static long k;
    private static int var_int_a;
    private static int at;
    private static long bi;
    private static long ac;
    private static long bj;
    private static int e;
    private static long o;
    private static int bt;
    private static int ag;
    private static int ak;
    private static long j;
    private static long bn;
    private static long v;
    private static long bd;
    private static int u;
    private static int aq;
    private static int az;
    private static int ar;
    private static long br;
    private static long ba;
    private static int bo;
    private static int n;
    private static long ax;
    private static int af;
    private static int bw;
    private static long bc;
    private static long w;

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = (0 >>> 117 | 0 << ~117 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(-1);
        d = Long.reverse(793833816036970781L);
        e = Integer.reverse(0x40000000);
        f = (64 >>> 6 | 64 << ~6 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-8285423032741949155L);
        h = Long.reverse(-8791026472627208192L);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-8285423032741949155L);
        k = Long.reverse(-8791026472627208192L);
        l = Integer.reverse(0);
        m = 0xC000000 >>> 90 | 0xC000000 << -90;
        n = (-1 >>> 16 | -1 << -16) & 0xFFFFFFFF;
        o = Long.reverse(793833816036970781L);
        p = Integer.reverse(0x20000000);
        q = Long.reverse(793833816036970781L);
        r = (0x1400000 >>> 22 | 0x1400000 << ~22 + 1) & 0xFFFFFFFF;
        s = Long.reverse(-8285423032741949155L);
        t = Long.reverse(-8791026472627208192L);
        u = Integer.reverse(0x60000000);
        v = Long.reverse(-8285423032741949155L);
        w = Long.reverse(-8791026472627208192L);
        x = Integer.reverse(-536870912);
        y = Integer.reverse(-1);
        z = Long.reverse(793833816036970781L);
        aa = 0x1000000 >>> 21 | 0x1000000 << -21;
        ab = (-1 >>> 212 | -1 << ~212 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(793833816036970781L);
        ad = Integer.reverse(-1879048192);
        ae = Long.reverse(793833816036970781L);
        af = Integer.reverse(0x50000000);
        ag = Integer.reverse(-1);
        ah = Long.reverse(793833816036970781L);
        ai = (720896 >>> 48 | 720896 << ~48 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(793833816036970781L);
        ak = Integer.reverse(0x30000000);
        al = -1 >>> 250 | -1 << -250;
        am = Long.reverse(793833816036970781L);
        an = Integer.reverse(0x40000000);
        ao = (0 >>> 138 | 0 << ~138 + 1) & 0xFFFFFFFF;
        ap = 32 >>> 69 | 32 << ~69 + 1;
        aq = Integer.reverse(0x40000000);
        ar = 0x1A0000 >>> 241 | 0x1A0000 << -241;
        as = Long.reverse(793833816036970781L);
        at = (14 >>> 224 | 14 << -224) & 0xFFFFFFFF;
        au = Long.reverse(793833816036970781L);
        av = Integer.reverse(-268435456);
        aw = Integer.reverse(-1);
        ax = Long.reverse(793833816036970781L);
        ay = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        az = Integer.reverse(0x8000000);
        ba = Long.reverse(793833816036970781L);
        bb = (0x2200000 >>> 245 | 0x2200000 << -245) & 0xFFFFFFFF;
        bc = Long.reverse(-8285423032741949155L);
        bd = Long.reverse(-8791026472627208192L);
        be = (73728 >>> 172 | 73728 << ~172 + 1) & 0xFFFFFFFF;
        bf = Long.reverse(-8285423032741949155L);
        bg = Long.reverse(-8791026472627208192L);
        bh = Integer.reverse(-939524096);
        bi = Long.reverse(-8285423032741949155L);
        bj = Long.reverse(-8791026472627208192L);
        bk = (0 >>> 158 | 0 << ~158 + 1) & 0xFFFFFFFF;
        bl = Integer.reverse(0x40000000);
        bm = 163840 >>> 45 | 163840 << -45;
        bn = Long.reverse(793833816036970781L);
        bo = Integer.reverse(-1476395008);
        bp = Long.reverse(793833816036970781L);
        bq = Integer.reverse(0x68000000);
        br = Long.reverse(-8285423032741949155L);
        bs = Long.reverse(-8791026472627208192L);
        bt = (4 >>> 161 | 4 << -161) & 0xFFFFFFFF;
        bu = 0 >>> 129 | 0 << ~129 + 1;
        bv = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(-402653184);
        bx = 0x170000 >>> 144 | 0x170000 << -144;
        var_java_lang_String_arr_a = new String[bw];
        var_java_lang_String_arr_b = new String[bx];
        NLoginCore_069.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_069.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 66), NLoginCore_069.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.E("նփւՅօցռօ֐տՌ֊֎և֊֐Ւࣧࣈࣆ࣭࣯ࣚࣟࣝࣥࣝ࣠ࣤ࣬ࣳլ", (byte)87, 69) + string + NLoginCore_223.B("ŧ", (byte)87, 66) + methodType.toString(), exception);
        }
    }

    @CheckReturnValue
    public static NLoginCore_210 a(String string, Object ... objectArray) {
        int n;
        if (objectArray.length % aq != 0) {
            throw new IllegalArgumentException((String)NLoginCore_069.c("㺀", (int)ar, (long)as));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)NLoginCore_069.c("㺃", (int)at, (long)au)).append(string).append((String)NLoginCore_069.c("㺆", (int)(av & aw), (long)ax));
        for (n = ay; n < objectArray.length; n += 2) {
            if (n != 0) {
                stringBuilder.append((String)NLoginCore_069.c("㺉", (int)az, (long)ba));
            }
            stringBuilder.append((String)NLoginCore_069.c("㺌", (int)bb, (long)(bc ^ bd))).append(objectArray[n]).append((String)NLoginCore_069.c("㺏", (int)be, (long)(bf ^ bg)));
        }
        stringBuilder.append((String)NLoginCore_069.c("㺒", (int)bh, (long)(bi ^ bj)));
        for (n = bk; n < objectArray.length / bl; ++n) {
            if (n != 0) {
                stringBuilder.append((String)NLoginCore_069.c("㺕", (int)bm, (long)bn));
            }
            stringBuilder.append((String)NLoginCore_069.c("㺘", (int)bo, (long)bp));
        }
        stringBuilder.append((String)NLoginCore_069.c("㺛", (int)bq, (long)(br ^ bs)));
        Object[] objectArray2 = new Object[objectArray.length / bt];
        int n2 = bu;
        for (int i = bv; i < objectArray.length; i += 2) {
            objectArray2[n2++] = objectArray[i];
        }
        return new NLoginCore_210(stringBuilder.toString(), objectArray2);
    }

    private static void b() {
        int n;
        var_long_c = -5149362690354700111L;
        long l = var_long_c ^ 0xA8A04C7D211CAFB5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(40 + 29), (byte)(70 + 13), (byte)(21 + 26), (byte)(14 + 53), (byte)(38 + 28), (byte)(49 + 18), (byte)(29 + 18), (byte)(21 + 59), 75, (byte)(26 + 41), (byte)(66 + 17), (byte)(2 + 51), 80, (byte)(84 + 13), (byte)(79 + 21), (byte)(36 + 64), (byte)(44 + 61), (byte)(84 + 26), (byte)(6 + 97)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_069.var_java_lang_String_arr_b[0] = NLoginCore_427.E("մովոծ՟ճբշՓադՌՍխօբՋյե֔֎ը֎Ռհ֏պ֖֐֗֐֚֟֡փմև՟ր֙֜ֈձ", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[1] = NLoginCore_451.E("ՀջնԿճև՟պՕըֈյֆլ՜ծճ֓֕ՎՌ՟՜՝", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ůŮƐŇţƐŵƎūƕƆš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ŢƓŒŤƀœƎŶŭƍśš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[4] = NLoginCore_446.B("ŮƆŢƁƕƏţƋƖŨƆš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ŮƆŢƁƕƏţƋƖŨƆš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[6] = NLoginCore_427.C("ӴӨӠԆӢԐӰӕԜӕӖӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[7] = NLoginCore_091.A("ƇƐŬŞƁƏŮţţŶœš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[8] = NLoginCore_575.D("ԋԅӭԂԏӔӭӎӼӻӷӤ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[9] = NLoginCore_027.F("՞նՒձօտՓջֆ՘նՑ", (byte)77, 70);
                    NLoginCore_069.var_java_lang_String_arr_b[10] = NLoginCore_223.B("ŮƆŢƁƕƏţƋƖŨƆš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[11] = NLoginCore_446.D("ӴӨӠԆӢԐӰӕԜӕӖӤ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[12] = NLoginCore_027.C("ӱԒԌԁԓԍӦӴӜӪӳӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[13] = NLoginCore_201.C("ԇԋԑԋԁӲԆӵԊӦӴӷӟӠԀԘӵӞԈӸԧԡӻԡӟԃԢԍԩԣԪԣԲԴԭԖԇԚӲԓԬԯԛԄ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[14] = NLoginCore_091.A("ŠƀƏŨœŲƋŸŸŹűƕƌŪƈŻŵŢƚƐŽůŬŭ", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[15] = NLoginCore_091.C("ӦԎӉԖӖөԆӤӘԛӫӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[16] = NLoginCore_201.F("ՒփՂՔհՃվզ՝սՋՑ", (byte)77, 70);
                    NLoginCore_069.var_java_lang_String_arr_b[17] = NLoginCore_223.A("ŮƆŢƁƕƏţƋƖŨƆš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[18] = NLoginCore_092.D("ӱԉӥԄԘԒӦԎԙӫԉӤ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[19] = NLoginCore_451.E("յւոսօֈյջ֊Մ՜ծէ՘ժ֎ՒմըՏՌ՟՜՝", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[20] = NLoginCore_138.F("ՒփՂՔհՃվզ՝սՋՑ", (byte)77, 70);
                    NLoginCore_069.var_java_lang_String_arr_b[21] = NLoginCore_223.B("ŉŭŮŮőŕŎŮŴŮƆš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[22] = NLoginCore_004.A("ƊƐšųƄŎƙũŔŕśš", (byte)77, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_069.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ƄƈƎƈžůƃŲƇţűŴŜŝŽƕŲśƅŵƤƞŸƞŜƀƟƊƦƠƧƠƈƫżƤƠƫƩƮƐƉƜƁ", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[1] = NLoginCore_324.D("ӓԎԉӒԆԚӲԍӨӻԙӲԘӺӷԢԡӲӰӺԈԘӯӰ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[2] = NLoginCore_092.B("ťŝŎŨƁşƄƅƊŦƋŗŴƒƀŴŵŻŝƒƜůŬŭ", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[3] = NLoginCore_324.F("՛շՖմՕՓպՂՒՁվՑ", (byte)77, 70);
                    NLoginCore_069.var_java_lang_String_arr_b[4] = NLoginCore_427.C("ӟԎԍӸӓԊԏӗӻӰӖӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ԅԔӎӘӏӷӯԛӻӰӚӤ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[6] = NLoginCore_559.C("ӯԏөԑӗԕӛӓӭԈӯӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[7] = NLoginCore_453.A("şƁƇŦŔťƓƖƌƊƇŜŝŚƑſƢƣţƣƖſŬŭ", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[8] = NLoginCore_027.D("ӳӨӟԁԘԋԆӱӕԗӫӗӼӶӽӬӾӵԘԓԒԂӯӰ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[9] = NLoginCore_451.D("ԐӡӧӊԊԙӺӹԊӧӳӤ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[10] = NLoginCore_173.B("ƁƍūűƅƆūŮŗţŸš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[11] = NLoginCore_201.B("žƎƍƓŢƏŷŘŖƕƘƌžŸƍƊųƎśƏƤƥŬŭ", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[12] = NLoginCore_324.E("ԽղւֆէյՓՑշր՘Ց", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[13] = NLoginCore_427.D("ԇԋԑԋԁӲԆӵԊӦӴӷӟӠԀԘӵӞԈӸԧԡӻԡӟԃԢԍԩԣԪԣԫԌԗԮԦԭӵԖԈӷԲӿԒԂԷԞԭӼԽԶՈԢԏԐ", (byte)77, 68);
                    NLoginCore_069.var_java_lang_String_arr_b[14] = NLoginCore_091.C("ӣԃԒӫӖӵԎӻӻӼӶԛԓӿӞԑӢӹԕԂӲԘӯӰ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[15] = NLoginCore_559.A("žūƃŒŬƌƕƊƙƃƚš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[16] = NLoginCore_091.E("ՂգՏՕցՃթդՀպըՑ", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[17] = NLoginCore_384.A("żţƄƑūŏůŬƃƈœš", (byte)77, 65);
                    NLoginCore_069.var_java_lang_String_arr_b[18] = NLoginCore_384.E("շլհ՟ֆՙՄՓեքֆՑ", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[19] = NLoginCore_446.E("յւոսօֈյջ֊Մ՜փևՋչ֌ղ֎գՏլ֕՜՝", (byte)77, 69);
                    NLoginCore_069.var_java_lang_String_arr_b[20] = NLoginCore_091.B("ŚŝŠŒŶƓŗŤőřŸš", (byte)77, 66);
                    NLoginCore_069.var_java_lang_String_arr_b[21] = NLoginCore_092.C("ӕԏӪԐԔӮөӦӕԝӞӤ", (byte)77, 67);
                    NLoginCore_069.var_java_lang_String_arr_b[22] = NLoginCore_559.F("ՏՠՠփմՆՂԻրվնՑ", (byte)77, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_069.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ŞœņŇţƗŢťŮƇƑƚũůŸŶŬśƍŢƓƈƒųŻƘŢŨŹżƪƚ", (byte)77, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_069.var_java_lang_String_arr_b[0] = NLoginCore_110.F("պփւհՃՔփս֋։֋պ՛Սադս֏րև֏՟՜՝", (byte)77, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x61L;
        l ^= 0xA8A04C7D211CAFB5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(67 + 2), (byte)(76 + 7), (byte)(4 + 43), (byte)(13 + 54), (byte)(57 + 9), 67, (byte)(20 + 27), (byte)(13 + 67), (byte)(63 + 12), (byte)(46 + 21), (byte)(76 + 7), 53, (byte)(10 + 70), (byte)(64 + 33), (byte)(2 + 98), (byte)(45 + 55), (byte)(12 + 93), (byte)(38 + 72), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.B("ǆǓǒƕǕǑǌǕǠǏƜǚǞǗǚǠƢԷԘԖԪԯԭԽԵԭ԰ԴԼԿՃ", (byte)114, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_069.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @CheckReturnValue
    public static NLoginCore_210 a(String string, int n, String string2, Object ... objectArray) {
        int n2;
        if (objectArray.length % var_int_a != 0) {
            throw new IllegalArgumentException((String)NLoginCore_069.c("㺀", (int)(var_int_b & var_int_c), (long)d));
        }
        int n3 = objectArray.length - n * e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)NLoginCore_069.c("㺃", (int)f, (long)(g ^ h))).append(string).append((String)NLoginCore_069.c("㺆", (int)i, (long)(j ^ k)));
        for (n2 = l; n2 < n3; n2 += 2) {
            if (n2 != 0) {
                stringBuilder.append((String)NLoginCore_069.c("㺉", (int)(m & NLoginCore_069.n), (long)o));
            }
            stringBuilder.append((String)NLoginCore_069.c("㺌", (int)p, (long)q)).append(objectArray[n2]).append((String)NLoginCore_069.c("㺏", (int)r, (long)(s ^ t))).append((String)NLoginCore_069.c("㺒", (int)u, (long)(v ^ w)));
        }
        stringBuilder.append((String)NLoginCore_069.c("㺕", (int)(x & y), (long)z));
        for (n2 = n3; n2 < objectArray.length; n2 += 2) {
            if (n2 > n3) {
                stringBuilder.append((String)NLoginCore_069.c("㺘", (int)(aa & ab), (long)ac));
            }
            stringBuilder.append((String)NLoginCore_069.c("㺛", (int)ad, (long)ae)).append(objectArray[n2]).append((String)NLoginCore_069.c("㺞", (int)(af & ag), (long)ah)).append((String)NLoginCore_069.c("㺡", (int)ai, (long)aj));
        }
        stringBuilder.append((String)NLoginCore_069.c("㺤", (int)(ak & al), (long)am)).append(string2);
        Object[] objectArray2 = new Object[objectArray.length / an];
        int n4 = ao;
        for (int i = ap; i < objectArray.length; i += 2) {
            objectArray2[n4++] = objectArray[i];
        }
        return new NLoginCore_210(stringBuilder.toString(), objectArray2);
    }
}

