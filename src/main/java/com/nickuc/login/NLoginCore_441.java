/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_441
extends NLoginCore_353 {
    private static int dp;
    private static int bm;
    private static int af;
    private static long co;
    private static int ak;
    private static long ac;
    private static int cv;
    private static int cj;
    private static long ah;
    private static int dy;
    private static int ed;
    private static long bh;
    private static int h;
    private static int ao;
    private static int ar;
    private static int cm;
    private static int du;
    private static int o;
    private static int cp;
    private static String[] a;
    private static long eb;
    private static int cq;
    private static int n;
    private static int az;
    private static int ch;
    private static long bp;
    private static int cw;
    private static long bd;
    private static int v;
    private static long au;
    private static int dl;
    private static long cx;
    private static int ca;
    private static long cs;
    private static int dr;
    private static int aq;
    private static int av;
    private static long df;
    private static int bx;
    private static int bj;
    private static int k;
    private static int at;
    private static int q;
    private static long dx;
    private static int u;
    private static int ec;
    private static long bz;
    private static String[] b;
    private static long cg;
    private static int dd;
    private static int ab;
    private static long cy;
    private static long r;
    private static int dh;
    private static int be;
    private static long dt;
    private static long ba;
    private static long s;
    private static int f;
    private static int ee;
    private static long dj;
    private static int cr;
    private static long ag;
    private static int bg;
    private static int t;
    private static int cn;
    private static int di;
    private static int y;
    private static long bt;
    private static int aa;
    private static int bb;
    private static int dm;
    private static long d;
    private static int j;
    private static long ad;
    private static int by;
    private static int dv;
    private static int cu;
    private static long dk;
    private static long bi;
    private static long da;
    private static int dz;
    private static int ds;
    private static int dn;
    private static long bu;
    private static int ai;
    private static int dc;
    private static long al;
    private static long ap;
    private static long l;
    private static int var_int_c;
    private static long cb;
    private static int bw;
    private static int bk;
    private static long ce;
    private static long ck;
    private static int bf;
    private static int bn;
    private static int ay;
    private static long dq;
    private static long ea;
    private static int g;
    private static int as;
    private static int x;
    private static int cd;
    private static int bo;
    private static int cz;
    private static long w;
    private static int cfr_renamed_1;
    private static int bv;
    private static long bl;
    private static int de;
    private static long ax;
    private static long dg;
    private static long e;
    private static long z;
    private static int i;
    private static long cl;
    private static int br;
    private static long var_long_c;
    private static int dw;
    private static long bq;
    private static int bs;
    private static int ct;
    private static int cc;
    private static long bc;
    private static int aj;
    private static long db;
    private static int p;
    private static long am;
    private static int ci;
    private static int an;
    private static long m;
    private static int aw;
    private static int cf;
    private static int ae;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_441.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("ϾРТЂЦхнѓпЎьтѐъГињљёїёЦ", (byte)11, 67), NLoginCore_441.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("йцхЈшфпшѓтЏэёъэѓЕސޥޫިޠޞަމޫ޸ީ޳޹ވވа", (byte)11, 67) + string + NLoginCore_324.E("ԁ", (byte)11, 69) + methodType.toString(), exception);
        }
    }

    public NLoginCore_441(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_441.c("㺀", (int)var_int_c, (long)(d ^ e)), null, f != 0, g != 0, new String[h]);
    }

    private static void void_b() {
        int n;
        var_long_c = 4560234390883163359L;
        long l = var_long_c ^ 0x487CAB40382246AAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(25 + 58), (byte)(42 + 5), (byte)(24 + 43), (byte)(32 + 34), (byte)(57 + 10), 47, (byte)(6 + 74), (byte)(12 + 63), (byte)(55 + 12), (byte)(28 + 55), (byte)(22 + 31), (byte)(51 + 29), (byte)(69 + 28), (byte)(78 + 22), (byte)(79 + 21), (byte)(27 + 78), (byte)(81 + 29), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(36 + 47)}, StandardCharsets.UTF_8));
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
                    NLoginCore_441.b[0] = NLoginCore_387.C("ӵӐӶӕӯәӛӗӛӔӃӉ", (byte)68, 67);
                    NLoginCore_441.b[1] = NLoginCore_575.F("խդՔյծԾճԶՍաՎՏԽզբւևՔւաֈՌ՛հեՒաա֏Փւ֏", (byte)68, 70);
                    NLoginCore_441.b[2] = NLoginCore_559.E("ՎչԱՆԷնՎծ՞ԽՐդեէն՚։ՕռԾվզՓՔ", (byte)68, 69);
                    NLoginCore_441.b[3] = NLoginCore_427.F("ՏԱթԴԶսվԶնԺՔՒ՟նջՇսՆՖևյռՓՔ", (byte)68, 70);
                    NLoginCore_441.b[4] = NLoginCore_324.D("ӧӚӻӅӽҺӉӟӭӢӚԅӐӴӓԃӗӛөӞӟӽӔӕ", (byte)68, 68);
                    NLoginCore_441.b[5] = NLoginCore_201.F("ՂՂծղ՘պրս՛տոՍՠեՐդե՚փ։ՋզՓՔ", (byte)68, 70);
                    NLoginCore_441.b[6] = NLoginCore_201.C("ӦӘҷӔӳӜӟӒԁӔӷӏӟӒԄԄӕӽӨӶӞӽӔӕ", (byte)68, 67);
                    NLoginCore_441.b[7] = NLoginCore_223.B("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 66);
                    NLoginCore_441.b[8] = NLoginCore_173.E("լլե՗էէԹՑՠԼջ՛Մ՛հՑբմյՖըռՓՔ", (byte)68, 69);
                    NLoginCore_441.b[9] = NLoginCore_324.E("ղ՚ԸՅձՖ՘՜ՐփԼՓ՗ռսևՄճ՘ՈՙդշՈռֈ՞րկ֗Վմ", (byte)68, 69);
                    NLoginCore_441.b[10] = NLoginCore_451.A("œŵůŕŕŅŢŀƆżƈŏ", (byte)68, 65);
                    NLoginCore_441.b[11] = NLoginCore_453.A("ĹŠœŻśőţſƇƊżŏ", (byte)68, 65);
                    NLoginCore_441.b[12] = NLoginCore_091.B("ŗĸūżŠŃŮŴƉſƀŏ", (byte)68, 66);
                    NLoginCore_441.b[13] = NLoginCore_446.B("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 66);
                    NLoginCore_441.b[14] = NLoginCore_110.F("լլե՗էէԹՑՠԼպհ՝ջՀԿմ։դչւդռփի֑֍՝ւՍՓճ", (byte)68, 70);
                    NLoginCore_441.b[15] = NLoginCore_559.C("ӳӛҹӆӲӗәӝӑԄҽӔӘӽӾԈӅӴәӉӚӥӸӉӽԉӟԁӰԘӏӵ", (byte)68, 67);
                    NLoginCore_441.b[16] = NLoginCore_387.E("ղ՚ԸՅձՖ՘՜ՐփԺԼ՝ՀՐՕօՁյյՃՙ՚է՚բլ՞ղնհապ֕֜ճ֖պ֠ջռի֣ջ֔֝֝փճֈ֞և֘նճմ", (byte)68, 69);
                    NLoginCore_441.b[17] = NLoginCore_446.F("ՁԵռՙ՗ԶՇ՚ԼփմՁ՜Ղտգթս՞ոլՀետռքծցձՕ֏ք", (byte)68, 70);
                    NLoginCore_441.b[18] = NLoginCore_451.E("ճԲկՐՉՉռՙԹՋՕՄ՗ՄՖՕ՘՟ըգ՛րոաՍղիռՕվձ՗ֈզղխ՚լՖ՗՜ւիը", (byte)68, 69);
                    NLoginCore_441.b[19] = NLoginCore_223.A("ňżżŝŴŀŶŧƅƈƃŹƍōƈƃŎžƍųœŭŚś", (byte)68, 65);
                    NLoginCore_441.b[20] = NLoginCore_446.F("ՃՂՊ՛ԴԹՎվՍղցՈ", (byte)68, 70);
                    NLoginCore_441.b[21] = NLoginCore_092.E("ՁՈոԻԹ԰տՍԹԹչՈ", (byte)68, 69);
                    NLoginCore_441.b[22] = NLoginCore_559.D("ӢӑӽӔӮӉӳӛӮӤӑӁӱӛӗԁԈӹӫԅӯӧӔӕ", (byte)68, 68);
                    NLoginCore_441.b[23] = NLoginCore_223.A("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŤŌŦŗƈŹŘŰŔƔŹ", (byte)68, 65);
                    NLoginCore_441.b[24] = NLoginCore_384.A("ňŏſłŀķƆŔŀŀƀŏ", (byte)68, 65);
                    NLoginCore_441.b[25] = NLoginCore_223.D("ӢӑӽӔӮӉӳӛӮӤӑӁӱӛӗԁԈӹӫԅӯӧӔӕ", (byte)68, 68);
                    NLoginCore_441.b[26] = NLoginCore_091.A("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŤŌŦŗƈŹŘŰŔƔŹ", (byte)68, 65);
                    NLoginCore_441.b[27] = NLoginCore_559.D("ӅӬӸӎӰӇӏӺӎӶӳӾӕӒӱӄԊӟӌԈԍӽӔӕ", (byte)68, 68);
                    NLoginCore_441.b[28] = NLoginCore_091.A("ŷŪŹŮŷŵƀłŐũƄŘŬƊƌŗŢŊŪűƋƓŚś", (byte)68, 65);
                    NLoginCore_441.b[29] = NLoginCore_201.E("ՖՈոՉԵնԿճմ՘լՔԼՄՏ՗ՂՆցտժ֌ՓՔ", (byte)68, 69);
                    NLoginCore_441.b[30] = NLoginCore_092.A("ſſŸŷŐŁŵĽŽŷƅŸŽŊřůƂƀšŭƐƐŞƐƐŖƇŶŲŖŽžũŰƞŬſƦƎƘƧƢŢƨƩƟƁƛŧƭžƱƅƳźŻ", (byte)68, 65);
                    NLoginCore_441.b[31] = NLoginCore_027.A("ĹſźŵœųƄľũŤŦŢśƄňņŘŬŏŉƌƓŚś", (byte)68, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_441.b[0] = NLoginCore_173.C("ӚӥӗӚӈҵӺӝӁӳӤӉ", (byte)68, 67);
                    NLoginCore_441.b[1] = NLoginCore_446.A("ŴūśżŵŅźĽŔŨŕŖńŭũƉƎśƉŨƏƕƒƊŕšƖţƑŮŸƒƉƎƃŝűƜťťƑƑƊů", (byte)68, 65);
                    NLoginCore_441.b[2] = NLoginCore_173.C("ӏӺҲӇҸӷӏӯӟҾӑӚԀӯӜөԃӝӂӛԅӋԍӣӤԎӥӌөӴԘӹ", (byte)68, 67);
                    NLoginCore_441.b[3] = NLoginCore_138.D("ӐҲӪҵҷӾӿҷӷһӖӃԂӘӶӉӲԉԄӈӣӝӋӱӍӌӔԉөԐӥԕ", (byte)68, 68);
                    NLoginCore_441.b[4] = NLoginCore_092.F("զՙպՄռԹՈ՞լաՙՂմ՟ՖպցթէֈլզՓՔ", (byte)68, 70);
                    NLoginCore_441.b[5] = NLoginCore_453.B("ŉŉŵŹşƁƇƄŢƆżŦžƅŠƈŨŧƉŴŝƓŚś", (byte)68, 66);
                    NLoginCore_441.b[6] = NLoginCore_173.D("ӦӘҷӔӳӜӟӒԁӔӹӺӷӠӛԈөԁӹԋӹӻԇӭӞԑԋӾӭӗӧԃ", (byte)68, 68);
                    NLoginCore_441.b[7] = NLoginCore_110.F("ԯՒՇՓԳԾղ՘՟գՋՈ", (byte)68, 70);
                    NLoginCore_441.b[8] = NLoginCore_138.C("ӭӭӦӘӨӨҺӒӡҽӺӠӾҿԆԂӧԇԌӣӡӽӔӕ", (byte)68, 67);
                    NLoginCore_441.b[9] = NLoginCore_092.F("ղ՚ԸՅձՖ՘՜ՐփԼՓ՗ռսևՄճ՘Ոՙ՛շկՏըեՑձծօթց֕հ՚յ֔֔՗ո՚ջը", (byte)68, 70);
                    NLoginCore_441.b[10] = NLoginCore_453.E("ԲոՖԸԴո՘՚ԿԽԺՈ", (byte)68, 69);
                    NLoginCore_441.b[11] = NLoginCore_076.C("ӎӈӄӱӫӠӓӵӊҽӔӉ", (byte)68, 67);
                    NLoginCore_441.b[12] = NLoginCore_027.B("žŭşŶŰŵŲņƆĻŅŏ", (byte)68, 66);
                    NLoginCore_441.b[13] = NLoginCore_091.E("԰ԸՓԲՕՌըշբի՗Ո", (byte)68, 69);
                    NLoginCore_441.b[14] = NLoginCore_110.A("ųųŬŞŮŮŀŘŧŃƁŷŤƂŇņŻƐūƀƉšōşƈƖƎƏŧƆŖřƌŭơŽůƟƃŷƣƘũů", (byte)68, 65);
                    NLoginCore_441.b[15] = NLoginCore_027.B("ŹšĿŌŸŝşţŗƊŃŚŞƃƄƎŋźşŏŠťƉƉƙƓűƔƛŚŭƕűůƐƟśƘƜųŲƤƜů", (byte)68, 66);
                    NLoginCore_441.b[16] = NLoginCore_223.B("ŹšĿŌŸŝşţŗƊŁŃŤŇŗŜƌňżżŊŠšŮšũųťŹŽŷŨƁƜƣźƝƁƧƂƃŲƩƣūƠƟƮƫƲŮƔƲƍźŻ", (byte)68, 66);
                    NLoginCore_441.b[17] = NLoginCore_027.A("ňļƃŠŞĽŎšŃƊŻňţŉƆŪŰƄťſųŇŏōŸŦƄƆŕƊŖŬ", (byte)68, 65);
                    NLoginCore_441.b[18] = NLoginCore_110.F("ճԲկՐՉՉռՙԹՋՕՄ՗ՄՖՕ՘՟ըգ՛րոաՍղիռՕվձ՗֌֕։ղհ֘֓՗լ֔ջը", (byte)68, 70);
                    NLoginCore_441.b[19] = NLoginCore_575.B("ňżżŝŴŀŶŧƅƈƂłƊſŗŉũŐŢŰŞƓŚś", (byte)68, 66);
                    NLoginCore_441.b[20] = NLoginCore_223.B("ĹŔŎŚŏŎŰœœŸŅŏ", (byte)68, 66);
                    NLoginCore_441.b[21] = NLoginCore_173.E("ակձԼՇՔ՘Ֆթ՗ՂՈ", (byte)68, 69);
                    NLoginCore_441.b[22] = NLoginCore_091.A("ŨŗƃŚŴŏŹšŴŪŖŹŬƉŉŻŧŚƃŌƔŝŚś", (byte)68, 65);
                    NLoginCore_441.b[23] = NLoginCore_173.B("šŪŔĺŴĿŢŰŤŗŴƇŖŉţŮŚƇŎƅƁŧŏŭŊƁƚŤŨƐŸƕŽœŞƏƚšŴƚžŨƂů", (byte)68, 66);
                    NLoginCore_441.b[24] = NLoginCore_076.B("ŵŋœļųŮœŐżƇŴŏ", (byte)68, 66);
                    NLoginCore_441.b[25] = NLoginCore_384.B("ŨŗƃŚŴŏŹšŴŪŖŷūřżšƑŊƊŐƃŭŚś", (byte)68, 66);
                    NLoginCore_441.b[26] = NLoginCore_223.E("՚գՍԳխԸ՛թ՝ՐխրՏՂ՜էՓրՇվպ՘ջ֌Պֆհփօդ֖֘ւ֛֚֓֞֘֏ո֡՝֡ը", (byte)68, 69);
                    NLoginCore_441.b[27] = NLoginCore_559.F("ՄիշՍկՆՎչՍյձդասՕփևՂպշցռՓՔ", (byte)68, 70);
                    NLoginCore_441.b[28] = NLoginCore_453.B("ŷŪŹŮŷŵƀłŐũƆŋŔũƃƋƀƉşŭŜƃŚś", (byte)68, 66);
                    NLoginCore_441.b[29] = NLoginCore_201.E("ՖՈոՉԵնԿճմ՘իԻջՙհւ՝֋ցց՘ՖՓՔ", (byte)68, 69);
                    NLoginCore_441.b[30] = NLoginCore_173.E("ոոձհՉԺծԶնհվձնՃՒըջչ՚զ։։՗։։ՏրկիՏնշբթ֗եո֟և֑֛֠՚֦֓֗ւշյ֣ջ֡ց֜ճմ", (byte)68, 69);
                    NLoginCore_441.b[31] = NLoginCore_027.B("ĹſźŵœųƄľũŤŦŦņŠŉƉźŽūƌşƃŚś", (byte)68, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_441.b[0] = NLoginCore_324.D("ӂҵҸӆӮҽӿӐӼӽӯԁӱӚӠӚӠӾӢӜԊӚӹԅӿӑԓԎӞӗӷԄ", (byte)68, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_441.b[0] = NLoginCore_453.C("ӳөӌӝӐӷӗӡӛӣԄӝӰӑԃӽӛӳӻӪӿӷӏӰӥԊӬӣөӸԂӫ", (byte)68, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x43L;
        l ^= 0x487CAB40382246AAL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(17 + 52), (byte)(25 + 58), (byte)(14 + 33), (byte)(41 + 26), (byte)(49 + 17), (byte)(61 + 6), (byte)(41 + 6), (byte)(60 + 20), (byte)(61 + 14), (byte)(32 + 35), (byte)(6 + 77), (byte)(39 + 14), (byte)(68 + 12), 97, (byte)(7 + 93), (byte)(87 + 13), 105, (byte)(45 + 65), (byte)(7 + 96)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԋԠԦԣԛԙԡԄԦԳԤԮԴԃԃ", (byte)105, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_441.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = 0 >>> 185 | 0 << ~185 + 1;
        d = Long.reverse(-343900238455729412L);
        e = Long.reverse(-4467570830351532032L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = (65536 >>> 80 | 65536 << -80) & 0xFFFFFFFF;
        h = 0 >>> 27 | 0 << ~27 + 1;
        i = Integer.reverse(0);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (4096 >>> 44 | 4096 << -44) & 0xFFFFFFFF;
        l = Long.reverse(-343900238455729412L);
        m = Long.reverse(-4467570830351532032L);
        n = 0 >>> 198 | 0 << -198;
        o = 2048 >>> 43 | 2048 << ~43 + 1;
        p = Integer.reverse(-1);
        q = Integer.reverse(0x40000000);
        r = Long.reverse(-343900238455729412L);
        s = Long.reverse(-4467570830351532032L);
        t = (0 >>> 224 | 0 << -224) & 0xFFFFFFFF;
        u = Integer.reverse(-1073741824);
        v = Integer.reverse(-1);
        w = Long.reverse(4123670591895802620L);
        x = (65536 >>> 16 | 65536 << -16) & 0xFFFFFFFF;
        y = Integer.reverse(0x20000000);
        z = Long.reverse(4123670591895802620L);
        aa = Integer.reverse(0x40000000);
        ab = 0x500000 >>> 180 | 0x500000 << -180;
        ac = Long.reverse(-343900238455729412L);
        ad = Long.reverse(-4467570830351532032L);
        ae = (0xC00000 >>> 214 | 0xC00000 << ~214 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(0x60000000);
        ag = Long.reverse(-343900238455729412L);
        ah = Long.reverse(-4467570830351532032L);
        ai = (0x1000000 >>> 246 | 0x1000000 << ~246 + 1) & 0xFFFFFFFF;
        aj = (393216 >>> 113 | 393216 << -113) & 0xFFFFFFFF;
        ak = 0x700000 >>> 52 | 0x700000 << ~52 + 1;
        al = Long.reverse(-343900238455729412L);
        am = Long.reverse(-4467570830351532032L);
        an = 512 >>> 102 | 512 << -102;
        ao = Integer.reverse(-1);
        ap = Long.reverse(4123670591895802620L);
        aq = Integer.reverse(0);
        ar = 4 >>> 129 | 4 << -129;
        as = 0x24000000 >>> 154 | 0x24000000 << -154;
        at = -1 >>> 224 | -1 << ~224 + 1;
        au = Long.reverse(4123670591895802620L);
        av = Integer.reverse(0);
        aw = Integer.reverse(0x50000000);
        ax = Long.reverse(4123670591895802620L);
        ay = Integer.reverse(-805306368);
        az = (-1 >>> 61 | -1 << ~61 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(4123670591895802620L);
        bb = (0x60000000 >>> 219 | 0x60000000 << -219) & 0xFFFFFFFF;
        bc = Long.reverse(-343900238455729412L);
        bd = Long.reverse(-4467570830351532032L);
        be = Integer.reverse(0);
        bf = (524288 >>> 209 | 524288 << ~209 + 1) & 0xFFFFFFFF;
        bg = 53248 >>> 12 | 53248 << -12;
        bh = Long.reverse(-343900238455729412L);
        bi = Long.reverse(-4467570830351532032L);
        bj = Integer.reverse(0x70000000);
        bk = Integer.reverse(-1);
        bl = Long.reverse(4123670591895802620L);
        bm = Integer.reverse(0);
        bn = Integer.reverse(0x40000000);
        bo = Integer.reverse(-268435456);
        bp = Long.reverse(-343900238455729412L);
        bq = Long.reverse(-4467570830351532032L);
        br = Integer.reverse(0);
        bs = (0x40000000 >>> 186 | 0x40000000 << -186) & 0xFFFFFFFF;
        bt = Long.reverse(-343900238455729412L);
        bu = Long.reverse(-4467570830351532032L);
        bv = 0 >>> 238 | 0 << ~238 + 1;
        bw = (24 >>> 67 | 24 << ~67 + 1) & 0xFFFFFFFF;
        bx = Integer.reverse(-2013265920);
        by = (-1 >>> 192 | -1 << ~192 + 1) & 0xFFFFFFFF;
        bz = Long.reverse(4123670591895802620L);
        ca = Integer.reverse(0x48000000);
        cb = Long.reverse(4123670591895802620L);
        cc = Integer.reverse(-939524096);
        cd = Integer.reverse(-1);
        ce = Long.reverse(4123670591895802620L);
        cf = 2560 >>> 135 | 2560 << ~135 + 1;
        cg = Long.reverse(4123670591895802620L);
        ch = Integer.reverse(0);
        ci = Integer.reverse(-1073741824);
        cj = Integer.reverse(-1476395008);
        ck = Long.reverse(-343900238455729412L);
        cl = Long.reverse(-4467570830351532032L);
        cm = -2147483643 >>> 94 | -2147483643 << ~94 + 1;
        cn = -1 >>> 247 | -1 << ~247 + 1;
        co = Long.reverse(4123670591895802620L);
        cp = Integer.reverse(0);
        cq = Integer.reverse(0x40000000);
        cr = Integer.reverse(-402653184);
        cs = Long.reverse(4123670591895802620L);
        ct = (0 >>> 88 | 0 << ~88 + 1) & 0xFFFFFFFF;
        cu = (0 >>> 105 | 0 << -105) & 0xFFFFFFFF;
        cv = 192 >>> 166 | 192 << ~166 + 1;
        cw = 0xC00000 >>> 83 | 0xC00000 << -83;
        cx = Long.reverse(-343900238455729412L);
        cy = Long.reverse(-4467570830351532032L);
        cz = Integer.reverse(-1744830464);
        da = Long.reverse(-343900238455729412L);
        db = Long.reverse(-4467570830351532032L);
        dc = Integer.reverse(0);
        dd = Integer.reverse(0x40000000);
        de = 3328 >>> 135 | 3328 << ~135 + 1;
        df = Long.reverse(-343900238455729412L);
        dg = Long.reverse(-4467570830351532032L);
        dh = 0 >>> 110 | 0 << -110;
        di = Integer.reverse(-671088640);
        dj = Long.reverse(-343900238455729412L);
        dk = Long.reverse(-4467570830351532032L);
        dl = Integer.reverse(0);
        dm = (0x800000 >>> 87 | 0x800000 << -87) & 0xFFFFFFFF;
        dn = 0 >>> 231 | 0 << -231;
        cfr_renamed_1 = (0x700000 >>> 242 | 0x700000 << ~242 + 1) & 0xFFFFFFFF;
        dp = Integer.reverse(-1);
        dq = Long.reverse(4123670591895802620L);
        dr = Integer.reverse(-1207959552);
        ds = -1 >>> 114 | -1 << -114;
        dt = Long.reverse(4123670591895802620L);
        du = Integer.reverse(0);
        dv = Integer.reverse(0x78000000);
        dw = (-1 >>> 103 | -1 << ~103 + 1) & 0xFFFFFFFF;
        dx = Long.reverse(4123670591895802620L);
        dy = Integer.reverse(0);
        dz = (0x3E000000 >>> 25 | 0x3E000000 << -25) & 0xFFFFFFFF;
        ea = Long.reverse(-343900238455729412L);
        eb = Long.reverse(-4467570830351532032L);
        ec = 0 >>> 109 | 0 << ~109 + 1;
        ed = (2 >>> 156 | 2 << ~156 + 1) & 0xFFFFFFFF;
        ee = Integer.reverse(0x4000000);
        a = new String[ed];
        b = new String[ee];
        NLoginCore_441.void_b();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b(NLoginCore_494 var1_1, String[] var2_2) {
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
}

