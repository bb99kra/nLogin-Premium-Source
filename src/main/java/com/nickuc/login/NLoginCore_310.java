/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.LoginType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.NLoginType_015;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginType_001;
import com.nickuc.login.NLoginCore_229;
import com.nickuc.login.NLoginCore_423;
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
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_310 {
    private static int ak;
    private static long bb;
    private static int cfr_renamed_1;
    private static int cp;
    private static long bv;
    private static int dg;
    private static int x;
    private static int dv;
    private static int j;
    private static long y;
    private static int cd;
    private static int u;
    private static int bi;
    private static long am;
    private static String[] var_java_lang_String_arr_b;
    private static int bc;
    private static int az;
    private static int cx;
    private static int bs;
    private static int dm;
    private static long dj;
    private static int be;
    private static long ax;
    private static long ap;
    private static long cw;
    private static int cn;
    private static int ac;
    private final NLoginType_015 var_com_nickuc_login_NLoginType_015_a;
    private static int z;
    private static int dz;
    private static int ay;
    private static int ce;
    private static long df;
    private static int ct;
    private static int dr;
    private static int ah;
    private static int bk;
    private static int bn;
    private static long cr;
    private static int bp;
    private static int var_int_a;
    private static long ai;
    private static int de;
    private static int bf;
    private static int g;
    private static int ao;
    private static int dy;
    private static int cv;
    private static int e;
    private static long t;
    private static int at;
    private static int dt;
    private static long ab;
    private static long cb;
    private static long bg;
    private static int dd;
    private static int q;
    private static long o;
    private final NLoginCore_423 var_com_nickuc_login_NLoginCore_423_a;
    private static int bd;
    private static long ca;
    private static long dk;
    private static int d;
    private static int p;
    private static float m;
    private static int af;
    private static long cy;
    private static long co;
    private static long bh;
    private static long bj;
    private static long bl;
    private static int r;
    private static int au;
    private static int cq;
    private static long bm;
    private static int ck;
    private static long cs;
    private static long ar;
    private static float l;
    private static int cm;
    private static int ch;
    private static int dq;
    private static long aj;
    private static int dp;
    private static long ae;
    private static String[] var_java_lang_String_arr_a;
    private static long av;
    private static int aw;
    private static long ad;
    private static long bo;
    private static int bz;
    private static long aa;
    private final NLoginType_001 var_com_nickuc_login_NLoginType_001_a;
    private static int f;
    private static int dc;
    protected final NLoginType_008 var_com_nickuc_login_NLoginType_008_c;
    private static long ba;
    private static int h;
    private static int cu;
    private static long dh;
    private static int var_int_b;
    private static int di;
    private static int ds;
    private static long cl;
    private static int dl;
    private static long cf;
    private static int bq;
    private static int s;
    private static int cj;
    private static long dn;
    private static int da;
    private static int ea;
    private static int an;
    private static long by;
    private static int v;
    private static int eb;
    private static int aq;
    private static long ag;
    private static int k;
    private static int cg;
    private static int var_int_c;
    private static int n;
    private static long bu;
    private static long br;
    private static long ci;
    private static int w;
    private static int bw;
    private static int i;
    private static long du;
    private static long dx;
    private static int cc;
    private static long db;
    private static long as;
    private static long cz;
    private static long var_long_c;
    private static int bx;
    private static int bt;
    private static int al;
    private static int dw;

    private static void b() {
        int n;
        var_long_c = -8647873347044642587L;
        long l = var_long_c ^ 0x98139CDAED822E0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(6 + 63), 83, (byte)(29 + 18), (byte)(7 + 60), (byte)(65 + 1), (byte)(66 + 1), 47, (byte)(56 + 24), (byte)(27 + 48), (byte)(17 + 50), (byte)(35 + 48), (byte)(20 + 33), (byte)(31 + 49), (byte)(43 + 54), (byte)(39 + 61), (byte)(11 + 89), (byte)(40 + 65), (byte)(27 + 83), (byte)(50 + 53)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_310.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ӐӒһӋҿңӑҔҩҖҺҟ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ҠҿӂқҴҠҷӕҨҧҥҫҤӏһүӓҪӋүӤңҞҝӅӀӛҧәӮӈӮҨҿҨӀӍҿҬӤҰҶӍӐӪӽһӜӬәӿӎӰӲӽӻӚӄӉӫӬӷӺԈӞӣӏӬӫӾӪԎԉӦӮӟ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[2] = NLoginCore_453.A("ŕĽĲĴĤťťńĻĩŊĳ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ŒőņŗĺŃķŇĤĶĪŘűŊŃňųŦŷŨŗőľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[4] = NLoginCore_223.A("ĻŞŘŗłŤŦīũĶĥŘŌťĮůŔŲŞŖŸĳŊůĴŷŹžźžŰšŸŃŖŀŁűłŉŽŻŅœ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[5] = NLoginCore_092.F("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[6] = NLoginCore_384.B("ĖľĻıĴŗŨŪŘŃŜŃşňŠŭŵŪİŷŃūźŧĴŐœĺŐŗƁƁŜŒŷţŸņŉƈŊřŸœ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[7] = NLoginCore_223.C("҉ҐҋҦҟҶҫӎҩӐҬүҽҙҴӇҿҪҼҮӄӣҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[8] = NLoginCore_173.D("ҾҽҲӃҦүңҳҐҢҖӄӝҶүҴӟӒӣӔӃҽҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[9] = NLoginCore_201.C("҈ҊҠӄҵӔӓӗҥҤҺӓҲӝҾҟӍҭӚҽұҢңӡӢӊҿҦҹҩӫҽҧңӣөӀҳӆӍӓӢӂҿ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[10] = NLoginCore_324.F("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[11] = NLoginCore_027.D("҂ҪҧҝҠӃӔӖӄүӈүӋҴӌәӡӖҜӣүӘӥҥӖӅҲҿӛӝӦҮӧӏұӏӔҭӇӪӳӪӰҿ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[12] = NLoginCore_027.D("ҚҡҡғҒӔҷҏҥүҔҪҰӆӋқӑҷӜӀҼӣҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[13] = NLoginCore_575.A("ŒőņŗĺŃķŇĤĶĪŘűŊŃňųŦŷŨŗőľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[14] = NLoginCore_453.D("ӉҟҲӒңңӔҿӉҷӊҦҎӕҫӑҟҬҽҫҽҭңҟӄҳҪӬҵӕӚүҿӬӳӈӁӭӋӪӈӳҷӔӖӲөӑҾӒӁҽӁӵӯԁӀӅԈԂӶӭӟӺ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[15] = NLoginCore_387.A("ŌİĵłŁļŘħŭŘńľůĿįŲŇŴĿŎŖŁľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[16] = NLoginCore_451.B("ĭŜŘĤĵšŕœņņŚŜŅĺŋŧŐŖŖŮŅŷĶœŒťŭśŏŸŴűŹžţŷšşśŬłŽƎŋžřƌŏţũŷŎŖŋūŹżŰŗƞƕřƓž", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[17] = NLoginCore_092.F("Ԧ՚Ԭ՞ՅՏՐխՄՕԵձՠՈՓՓԸը՗խձ՘ՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ĚœŁŢĸĩţŧłŠīŪŚħĽĪŲŨŅŔĮŧľĿ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[19] = NLoginCore_027.B("ĠŝĴĳŀĲśĳşŪŜĺŠŦţńľįľŏĪŖŰĺŪļİśũŌĿĻųŤŽŇşŁŢŤŤūūŬōŠƓůūƀƊŦŠƗűœŸūųƖŒšƟƏ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[20] = NLoginCore_027.C("ҬӎҎӁҒҲӆӏҊӌҙӑҴӛӉӐҼӢӎҺәӥһӈӛөҠҡӤӌҺҷӪҹӂұҲұӐҴӷӑӳӧӼҴҰӧӓӳԀԂӒӯӡҽӝӁҼӚӄӻӣӮӎӯӄӨԍӱԖӣӣӒӮӭӗԇӲӜӳӓԋӰԔԢӯԃԢԤӶԜԖӭԩӾԢԅӫԨԧԔԁԦԖӫԎԌԯԘԱӱԞӷԌԬԤԔԄԠԥԚԼԃԝԅՂԗ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[21] = NLoginCore_575.E("ՙ՘Ս՞ՁՊԾՎԫԽԱ՟ոՑՊՏպխվկ՞՘ՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[22] = NLoginCore_324.E("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ՘Ն՘ՈԾԺ՟ՎՅևՐհյՊ՜պշ՛բ֏ը֓՛թ֐մ֑֔֌՚և֜֝է֓ոեզ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[23] = NLoginCore_223.C("ҸҜҡҮҭҨӄғәӄҰҪӛҫқӞҳӠҫҺӂҭҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[24] = NLoginCore_324.E("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ՗՝՝յՌվԽ՚ՙլմբՖտջոՠ՚՝՗ոսկ֓էհթՐժճ֙՗զՎ֝ՔՕ։֛֑֢շ֎֏֑֪֝տ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[25] = NLoginCore_110.A("ķţŜşŇĠŝţłśĺŎŉŢĭŔĽũŅĩťŁľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[26] = NLoginCore_201.D("҆ҿҭӎҤҕӏӓҮӌҗӖӆғҩҖӞӔұӀҚӓҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[27] = NLoginCore_559.B("ĠŝĴĳŀĲśĳşŪŝŋįűįĲŎŠĮĿŎĸĲŸŘĶųŲŋżŷŲřŰşţŽŘžŹŘŇŜƎźƄŲƏƄœňţƃŹŔŲƍƐŬŸŹűŝƗ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[28] = NLoginCore_201.B("ŀŢĢŕĦņŚţĞŠĭťňůŝŤŐŶŢŎŭŹŏŜůŽĴĵŸŠŎŋžōŖŅņŅŤňƋťƄŢũŪŒƇŦŧŮƕŏŶƐŖųśƉƖơŘżſƗƜŷƓŦžƠũƧŵŭƭƚƉſƊƌſƴƤƄƺŸƬƄƓƆƵƿųǃƸƻƘƙſƷǀǁǂƝƖƹƫƌƌƭƑƿƪƔƍƴǇƞƟ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[29] = NLoginCore_446.E("ՙ՘Ս՞ՁՊԾՎԫԽԱ՟ոՑՊՏպխվկ՞՘ՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[30] = NLoginCore_559.E("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ՘Ն՘ՈԾԺ՟ՎՅևՐհյՊ֊բ՚քՎըփհ֌օզըՠՐՓ֏ձ֝՘մ՗ըեզ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[31] = NLoginCore_027.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՅնՆԶչՎջՆՕ՝ՈՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[32] = NLoginCore_223.E("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ՗՝՝յՌվԽ՚ՙլմբՖտջոժդ֌֋՟՞ՃՐձՊՌծեն֊֋֏ն֝Ք֟՘֚՟֍֡փ֞֐ՠթ֫", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[33] = NLoginCore_091.A("ŃğŃġĤŦŜĶŠĸŀţřŚŤŋŤœŰŶĲŁľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[34] = NLoginCore_027.D("ҥҨҌһҫӇҩӉӘҏғҩҽҩӋҚҼҘҝӑҸӓҪҫ", (byte)54, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_310.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŠşĠņħŊūũľŝŬĳ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[1] = NLoginCore_575.A("ĴœŖįňĴŋũļĻĹĿĸţŏŃŧľşŃŸķĲıřŔůĻŭƂŜƂļœļŔšœŀŸńŊšŤžƑŏŰƀŭƓŢƄƆƑƏŮŘŝſƀƋƎƜƢƏƕƝźƅŜƝƭƢŭų", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[2] = NLoginCore_138.F("ԧՔթդ՗թՆզԥզԧԬ՟ԵՖդՒղՍ՜ռծՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[3] = NLoginCore_092.B("ŒőņŗĺŃķŇĤĶīĥĨňĻŬŁňũŋĸŷľĿ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[4] = NLoginCore_427.A("ĻŞŘŗłŤŦīũĶĥŘŌťĮůŔŲŞŖŸĳŊůĴŷŹžźžŰšŽƁƃľňƆũŧŌũŸœ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[5] = NLoginCore_091.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՓՇՎՏՓիՉ՛՝րծՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[6] = NLoginCore_004.F("ԝՅՂԸԻ՞կձ՟ՊգՊզՏէմռձԷվՊղցծԻ՗՚Ձ՗՞ֈֈդչխիՉպ։զ֒՟Ռ՚", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[7] = NLoginCore_427.C("҉ҐҋҦҟҶҫӎҩӐҫӔӈҦҐҘҰӖҿҷӁӓҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[8] = NLoginCore_027.C("ҾҽҲӃҦүңҳҐҢҘӗӍҴқӓӊҟҪңҲӣҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[9] = NLoginCore_138.F("ԣԥԻ՟ՐկծղՀԿՕծՍոՙԺըՈյ՘ՌԽԾռսե՚ՁՔՄֆ՘Ղշ՞վ՚Ն֌֍գ֒և՚", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[10] = NLoginCore_559.E("ՓԷԼՉՈՃ՟Ԯմ՟Չղ՗ԴձճԴՋռՇլ՘ՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[11] = NLoginCore_223.F("ԝՅՂԸԻ՞կձ՟ՊգՊզՏէմռձԷվՊճրՀձՠՍ՚նոցՉ։ՆՉ֎ռռՇւվե֋՚", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ĮĵĵħĦŨŋģĹŃħůőŐŃŮōŐĭŨŨūŷŷŅŜŬŌŏŲŢŎ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ҾҽҲӃҦүңҳҐҢҕҩӅӍҹӕҝҽһӄӞҭҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[14] = NLoginCore_076.F("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ՘Ն՘ՈԾԺ՟ՎՅևՐհյՊ՚և֎գ՜ֈզօգ֎Ւկձ֍քլՙխ՜՘՜֕ծՙբր֒և֜առ֙", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[15] = NLoginCore_384.E("ՓԷԼՉՈՃ՟Ԯմ՟ՋՃ԰թՌՌպԷ՛թՕՈՅՆ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[16] = NLoginCore_027.D("ҙӈӄҐҡӍӁҿҲҲӆӈұҦҷӓҼӂӂӚұӣҢҿҾӑәӇһӤӠӝӥӪӏӣӍӋӇӘҮөӺҷӪӅӸһӏӕӣҺӂӄӧӓӽӛԂԆԆӉӼԆ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[17] = NLoginCore_384.F("Ԧ՚Ԭ՞ՅՏՐխՄՕԵշեՎոՏ՛ՇղջԽվՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[18] = NLoginCore_384.C("҆ҿҭӎҤҕӏӓҮӌҗӐҕҔҚҧҶҷҰӄӎҽҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[19] = NLoginCore_575.F("ԧդԻԺՇԹբԺզձգՁէխժՋՅԶՅՖԱ՝շՁձՃԷբհՓՆՂպիքՎզՈթիիղղճՔէ֚նղև֑խէ՛֛֚֚֒չ֥֐պգշ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[20] = NLoginCore_091.A("ŀŢĢŕĦņŚţĞŠĭťňůŝŤŐŶŢŎŭŹŏŜůŽĴĵŸŠŎŋžōŖŅņŅŤňƋťƇŻƐňńŻŧƇƔƖŦƃŵőűŕŐŮŘƏŷƂŢƃŘżơƅƪŷŷŦƂƁūƛƆŰƇŧƟƄƨƶƃƗƶƸƊưƪƁƽƒƶƙſƼƻƨƕƺƪſƢƠǃƬǅƅƲƋƠǀƸơǅǕƗƩƷǊƠƻƼƱǙǅǟƹǑǩǠƫǄǩǊƳ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[21] = NLoginCore_173.F("ՙ՘Ս՞ՁՊԾՎԫԽ԰ՇՑԸշ՘չԻ՛ձ՜ՈՅՆ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[22] = NLoginCore_027.F("դԺՍխԾԾկ՚դՒեՁԩհՆլԺՇ՘Ն՘ՈԾԺ՟ՎՅևՐհյՊ՜պշ՛բ֏ը֓՛թ֐զփ֑խՑ֎լո֝֋թ֛֑֖ղ֓֒քա֒շ", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[23] = NLoginCore_138.A("ŌİĵłŁļŘħŭŘŃĮŌĩŒōűťŒŧŋőľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[24] = NLoginCore_223.C("ҙӈӄҐҡӍӁҿҲҲӆӈұҦҷӓҼӂӂӚұӣҢҿҾӑәӇһӤӠӝӅҿӂҼӝӢӔӸӌӕӎҵӏӘӾҼӋҳԂҹҺӠӧԁӂӡӦӦԋӸӞӸ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[25] = NLoginCore_324.B("ķţŜşŇĠŝţłśĻŰĦĭıĽĲŋĲńŨŧľĿ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[26] = NLoginCore_453.C("҆ҿҭӎҤҕӏӓҮӌҕҍҼӖҭґӜҰҫӌҮӓҪҫ", (byte)54, 67);
                    NLoginCore_310.var_java_lang_String_arr_b[27] = NLoginCore_324.E("ԧդԻԺՇԹբԺզձդՒԶոԶԹՕէԵՆՕԿԹտ՟ԽպչՒփվչՠշզժք՟օր՟Վգ֕ց֋չ֖֋՚Տժ֊ցթ֟գ֘֒ցզ֖պն֗ռվր֜օջծ֋տմպ", (byte)54, 69);
                    NLoginCore_310.var_java_lang_String_arr_b[28] = NLoginCore_004.D("ҬӎҎӁҒҲӆӏҊӌҙӑҴӛӉӐҼӢӎҺәӥһӈӛөҠҡӤӌҺҷӪҹӂұҲұӐҴӷӑӰӎӕӖҾӳӒӓӚԁһӢӼӂӟӇӵԂԍӄӨӫԃԈӣӿӒӪԌӕԓӡәԙԆӵӫӶӸӫԠԐӰԦӤԘӰӿӲԡԫӟԯԤԧԄԅӫԣԬԭԮԉԂԧԒԇԦԘԚԵԾԒԴԺԻԆԆՇԚԨԥՉԍԦԺ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[29] = NLoginCore_384.D("ҾҽҲӃҦүңҳҐҢҖһҺӊҿӇҲӎӓҴӞӓҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[30] = NLoginCore_004.B("ŝĳņŦķķŨœŝŋŞĺĢũĿťĳŀőĿőŁķĳŘŇľƀŉũŮŃƃśœŽŇšżũƅžŠŝƆŦńœűƁƍŒƌŭŮƖŕƞƒőƞƞƣƏ", (byte)54, 66);
                    NLoginCore_310.var_java_lang_String_arr_b[31] = NLoginCore_138.A("ŌİĵłŁļŘħŭŘŃĥĿłŅľŞĲņńŸŧľĿ", (byte)54, 65);
                    NLoginCore_310.var_java_lang_String_arr_b[32] = NLoginCore_223.F("Դգ՟ԫԼը՜՚ՍՍագՌՁՒծ՗՝՝յՌվԽ՚ՙլմբՖտջոժդ֌֋՟՞ՃՐձՊՌծեն֊֋֏ն֝Ք֟՗֓՜ն֝֓վ֘՞ջր", (byte)54, 70);
                    NLoginCore_310.var_java_lang_String_arr_b[33] = NLoginCore_173.D("үҋүҍҐӒӈҢӌҤҫӏҭҫүґҾҝҬӃӓҭҪҫ", (byte)54, 68);
                    NLoginCore_310.var_java_lang_String_arr_b[34] = NLoginCore_451.E("ՀՃԧՖՆբՄդճԪԯՈՉժոլչճՋԵ՛վՅՆ", (byte)54, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_310.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ĮŚŝňňŔŖšŦţŚřŉŌŰıŲĮţĴŤŁľĿ", (byte)54, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_310.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ӈҭҨӀғҲӔӌӎүґҟ", (byte)54, 67);
                }
            }
        }
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!this.a(NLoginCore_5092, (String)NLoginCore_310.c("㺀", (int)az, (long)(ba ^ bb)), bc != 0)) {
            return;
        }
        if (this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, null, null, NLoginCore_374.l, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_i, LoginType.SESSION)) {
            Object[] objectArray = new Object[bd];
            objectArray[NLoginCore_310.be] = NLoginCore_277;
            this.var_com_nickuc_login_NLoginType_008_c.a(EventEnum.SESSION_LOGIN_EVENT, objectArray);
            String string = NLoginCore_277.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_310.c("㺃", (int)bf, (long)(bg ^ bh)) + string + (String)NLoginCore_310.c("㺆", (int)bi, (long)bj) : (String)NLoginCore_310.c("㺉", (int)bk, (long)(bl ^ bm)) + string + (String)NLoginCore_310.c("㺌", (int)bn, (long)bo), new Object[bp]);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_310.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginCore_310.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("զճղԵյձլյրկԼպվշպրՂࣛࢸ࣏ࣛࣚࣞࣔࣖࢿ࣓ࣙࣧࣞ՛", (byte)71, 70) + string + NLoginCore_201.F("Խ", (byte)71, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_423 com_nickuc_login_NLoginCore_423_a() {
        return this.var_com_nickuc_login_NLoginCore_423_a;
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, boolean bl, boolean bl2) {
        if (!this.a(NLoginCore_5092, (String)NLoginCore_310.c("㺀", (int)(w & x), (long)y), bl2)) {
            return;
        }
        if (this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, string, null, bl ? NLoginCore_374.j : null, bl ? NLoginCore_508.var_com_nickuc_login_NLoginCore_508_c : null, LoginType.LOGIN)) {
            String string2 = NLoginCore_277.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_310.c("㺃", (int)z, (long)(aa ^ ab)) + string2 + (String)NLoginCore_310.c("㺆", (int)ac, (long)(ad ^ ae)) : (String)NLoginCore_310.c("㺉", (int)af, (long)ag) + string2 + (String)NLoginCore_310.c("㺌", (int)ah, (long)(ai ^ aj)), new Object[ak]);
        }
    }

    @Generated
    public NLoginType_015 com_nickuc_login_NLoginType_015_a() {
        return this.var_com_nickuc_login_NLoginType_015_a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(NLoginCore_509 NLoginCore_5092) {
        Object object = NLoginCore_5092.var_java_lang_Object_n;
        synchronized (object) {
            if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a() == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e) {
                NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0x98139CDAED822E0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(57 + 12), (byte)(45 + 38), (byte)(20 + 27), 67, (byte)(64 + 2), (byte)(24 + 43), (byte)(44 + 3), (byte)(79 + 1), (byte)(40 + 35), (byte)(37 + 30), (byte)(62 + 21), (byte)(44 + 9), (byte)(54 + 26), (byte)(66 + 31), (byte)(39 + 61), (byte)(69 + 31), (byte)(103 + 2), (byte)(76 + 34), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("տ֌֋Վ֎֊օ֎֙ֈՕ֓֗֐֓֙՛ࣲ࣑࣭࣯ࣴࣴࣳࣷࣨࣘ࣬ऀࣷ", (byte)96, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_310.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_310(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_c = NLoginType_008;
        this.var_com_nickuc_login_NLoginType_015_a = new NLoginType_015(NLoginType_008, this);
        this.var_com_nickuc_login_NLoginType_001_a = new NLoginType_001(NLoginType_008, this);
        this.var_com_nickuc_login_NLoginCore_423_a = new NLoginCore_423(NLoginType_008);
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, @Nullable String string2, boolean bl, boolean bl2) {
        if (!this.a(NLoginCore_5092, (String)NLoginCore_310.c("㺀", (int)al, (long)am), bl2)) {
            return;
        }
        if (this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, string, string2, NLoginCore_374.k, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_d, LoginType.REGISTER)) {
            String string3 = NLoginCore_277.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_310.c("㺃", (int)(an & ao), (long)ap) + string3 + (String)NLoginCore_310.c("㺆", (int)aq, (long)(ar ^ as)) : (String)NLoginCore_310.c("㺉", (int)(at & au), (long)av) + string3 + (String)NLoginCore_310.c("㺌", (int)aw, (long)ax), new Object[ay]);
        }
    }

    public abstract void b(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3);

    public abstract void a(NLoginCore_277 var1, NLoginCore_509 var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected boolean a(NLoginCore_509 NLoginCore_5092, String string, boolean bl) {
        Object object = NLoginCore_5092.var_java_lang_Object_n;
        synchronized (object) {
            if (bl && NLoginCore_5092.com_nickuc_login_NLoginCore_077_a() != NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d) {
                return dp != 0;
            }
            NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d);
            return dq != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, boolean bl, boolean bl2) {
        if (NLoginCore_277 == null || !NLoginCore_277.R()) {
            return;
        }
        NLoginCore_509 NLoginCore_5092 = this.var_com_nickuc_login_NLoginType_008_c.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        Object object = NLoginCore_5092.var_java_lang_Object_n;
        synchronized (object) {
            NLoginCore_077 NLoginCore_0772 = NLoginCore_5092.com_nickuc_login_NLoginCore_077_a();
            if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e)) {
                return;
            }
            if (bl2) {
                NLoginCore_5092.a(NLoginCore_567.D, (Object)(dr != 0));
            }
            if (NLoginCore_0772 == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d) {
                this.var_com_nickuc_login_NLoginType_008_c.b(ds != 0).a(() -> {
                    if (!NLoginCore_277.R()) {
                        return;
                    }
                    if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().d(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d)) {
                        return;
                    }
                    NLoginCore_370.b((String)NLoginCore_310.c("㺀", (int)dt, (long)du) + NLoginCore_277.getName() + (String)NLoginCore_310.c("㺃", (int)(dv & dw), (long)dx), new Object[dy]);
                    this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, null, bl, dz != 0);
                });
            } else {
                NLoginCore_5092.a(NLoginCore_567.C, (Object)bl);
            }
        }
    }

    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!this.a(NLoginCore_5092, (String)NLoginCore_310.c("㺀", (int)bq, (long)br), bs != 0)) {
            return;
        }
        NLoginCore_229 NLoginCore_2292 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a();
        if (NLoginCore_2292 != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_a) {
            throw new IllegalStateException((String)NLoginCore_310.c("㺃", (int)bt, (long)(bu ^ bv)) + NLoginCore_277.getName() + (String)NLoginCore_310.c("㺆", (int)(bw & bx), (long)by) + (Object)((Object)NLoginCore_2292));
        }
        if (!NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_c)) {
            throw new IllegalStateException((String)NLoginCore_310.c("㺉", (int)bz, (long)(ca ^ cb)) + NLoginCore_277.getName());
        }
        if (this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, null, null, NLoginCore_374.m, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_j, LoginType.PREMIUM)) {
            Object[] objectArray = new Object[cc];
            objectArray[NLoginCore_310.cd] = NLoginCore_277;
            this.var_com_nickuc_login_NLoginType_008_c.a(EventEnum.PREMIUM_LOGIN_EVENT, objectArray);
            String string = NLoginCore_277.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_310.c("㺌", (int)ce, (long)cf) + string + (String)NLoginCore_310.c("㺏", (int)(cg & ch), (long)ci) : (String)NLoginCore_310.c("㺒", (int)(cj & ck), (long)cl) + string + (String)NLoginCore_310.c("㺕", (int)(cm & cn), (long)co), new Object[cp]);
        }
    }

    /*
     * Exception decompiling
     */
    private boolean a(ForceRegisterConfig var1_1, NLoginCore_277 var2_2, NLoginCore_509 var3_3, String var4_4, @Nullable String var5_5, @Nullable NLoginCore_374 var6_6, @Nullable NLoginCore_508 var7_7, LoginType var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    @Generated
    public NLoginType_001 com_nickuc_login_NLoginType_001_a() {
        return this.var_com_nickuc_login_NLoginType_001_a;
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = (0 >>> 52 | 0 << -52) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0);
        e = 0 >>> 34 | 0 << ~34 + 1;
        f = 0 >>> 129 | 0 << -129;
        g = 0x4000000 >>> 57 | 0x4000000 << -57;
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Float.intBitsToFloat(Integer.reverse(3714));
        m = Float.intBitsToFloat(0x8080000 >>> 221 | 0x8080000 << ~221 + 1);
        n = Integer.reverse(0);
        o = Long.reverse(-7561636707772579871L);
        p = Integer.reverse(0);
        q = 0 >>> 245 | 0 << ~245 + 1;
        r = (32 >>> 133 | 32 << ~133 + 1) & 0xFFFFFFFF;
        s = -1 >>> 90 | -1 << -90;
        t = Long.reverse(-7561636707772579871L);
        u = 0 >>> 218 | 0 << -218;
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 128 >>> 198 | 128 << -198;
        x = Integer.reverse(-1);
        y = Long.reverse(-7561636707772579871L);
        z = Integer.reverse(-1073741824);
        aa = Long.reverse(-6408715203165732895L);
        ab = Long.reverse(0x3000000000000000L);
        ac = Integer.reverse(0x20000000);
        ad = Long.reverse(-6408715203165732895L);
        ae = Long.reverse(0x3000000000000000L);
        af = Integer.reverse(-1610612736);
        ag = Long.reverse(-7561636707772579871L);
        ah = Integer.reverse(0x60000000);
        ai = Long.reverse(-6408715203165732895L);
        aj = Long.reverse(0x3000000000000000L);
        ak = 0 >>> 55 | 0 << -55;
        al = -2147483645 >>> 223 | -2147483645 << -223;
        am = Long.reverse(-7561636707772579871L);
        an = Integer.reverse(0x10000000);
        ao = Integer.reverse(-1);
        ap = Long.reverse(-7561636707772579871L);
        aq = (0x900000 >>> 148 | 0x900000 << -148) & 0xFFFFFFFF;
        ar = Long.reverse(-6408715203165732895L);
        as = Long.reverse(0x3000000000000000L);
        at = Integer.reverse(0x50000000);
        au = Integer.reverse(-1);
        av = Long.reverse(-7561636707772579871L);
        aw = (22528 >>> 107 | 22528 << ~107 + 1) & 0xFFFFFFFF;
        ax = Long.reverse(-7561636707772579871L);
        ay = Integer.reverse(0);
        az = Integer.reverse(0x30000000);
        ba = Long.reverse(-6408715203165732895L);
        bb = Long.reverse(0x3000000000000000L);
        bc = 0 >>> 246 | 0 << -246;
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = Integer.reverse(0);
        bf = Integer.reverse(-1342177280);
        bg = Long.reverse(-6408715203165732895L);
        bh = Long.reverse(0x3000000000000000L);
        bi = -1073741823 >>> 157 | -1073741823 << ~157 + 1;
        bj = Long.reverse(-7561636707772579871L);
        bk = 0x78000000 >>> 251 | 0x78000000 << ~251 + 1;
        bl = Long.reverse(-6408715203165732895L);
        bm = Long.reverse(0x3000000000000000L);
        bn = (8 >>> 127 | 8 << -127) & 0xFFFFFFFF;
        bo = Long.reverse(-7561636707772579871L);
        bp = Integer.reverse(0);
        bq = 0x11000000 >>> 216 | 0x11000000 << ~216 + 1;
        br = Long.reverse(-7561636707772579871L);
        bs = (0 >>> 123 | 0 << ~123 + 1) & 0xFFFFFFFF;
        bt = Integer.reverse(0x48000000);
        bu = Long.reverse(-6408715203165732895L);
        bv = Long.reverse(0x3000000000000000L);
        bw = 0x2600000 >>> 53 | 0x2600000 << -53;
        bx = Integer.reverse(-1);
        by = Long.reverse(-7561636707772579871L);
        bz = (655360 >>> 15 | 655360 << ~15 + 1) & 0xFFFFFFFF;
        ca = Long.reverse(-6408715203165732895L);
        cb = Long.reverse(0x3000000000000000L);
        cc = Integer.reverse(Integer.MIN_VALUE);
        cd = 0 >>> 8 | 0 << ~8 + 1;
        ce = Integer.reverse(-1476395008);
        cf = Long.reverse(-7561636707772579871L);
        cg = Integer.reverse(0x68000000);
        ch = Integer.reverse(-1);
        ci = Long.reverse(-7561636707772579871L);
        cj = Integer.reverse(-402653184);
        ck = Integer.reverse(-1);
        cl = Long.reverse(-7561636707772579871L);
        cm = (786432 >>> 79 | 786432 << -79) & 0xFFFFFFFF;
        cn = -1 >>> 40 | -1 << ~40 + 1;
        co = Long.reverse(-7561636707772579871L);
        cp = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        cq = Integer.reverse(-1744830464);
        cr = Long.reverse(-6408715203165732895L);
        cs = Long.reverse(0x3000000000000000L);
        ct = (0 >>> 252 | 0 << -252) & 0xFFFFFFFF;
        cu = (13312 >>> 169 | 13312 << -169) & 0xFFFFFFFF;
        cv = Integer.reverse(-1);
        cw = Long.reverse(-7561636707772579871L);
        cx = Integer.reverse(-671088640);
        cy = Long.reverse(-6408715203165732895L);
        cz = Long.reverse(0x3000000000000000L);
        da = Integer.reverse(0x38000000);
        db = Long.reverse(-7561636707772579871L);
        dc = 512 >>> 233 | 512 << -233;
        dd = 0 >>> 153 | 0 << -153;
        de = 3712 >>> 231 | 3712 << ~231 + 1;
        df = Long.reverse(-7561636707772579871L);
        dg = Integer.reverse(0x78000000);
        dh = Long.reverse(-7561636707772579871L);
        di = Integer.reverse(-134217728);
        dj = Long.reverse(-6408715203165732895L);
        dk = Long.reverse(0x3000000000000000L);
        dl = Integer.reverse(0x4000000);
        dm = (-1 >>> 162 | -1 << ~162 + 1) & 0xFFFFFFFF;
        dn = Long.reverse(-7561636707772579871L);
        cfr_renamed_1 = 0 >>> 177 | 0 << -177;
        dp = Integer.reverse(0);
        dq = (4096 >>> 44 | 4096 << ~44 + 1) & 0xFFFFFFFF;
        dr = 4 >>> 130 | 4 << ~130 + 1;
        ds = Integer.reverse(Integer.MIN_VALUE);
        dt = 33 >>> 160 | 33 << -160;
        du = Long.reverse(-7561636707772579871L);
        dv = Integer.reverse(0x44000000);
        dw = Integer.reverse(-1);
        dx = Long.reverse(-7561636707772579871L);
        dy = 0 >>> 122 | 0 << -122;
        dz = Integer.reverse(0);
        ea = (70 >>> 193 | 70 << -193) & 0xFFFFFFFF;
        eb = Integer.reverse(-1006632960);
        var_java_lang_String_arr_a = new String[ea];
        var_java_lang_String_arr_b = new String[eb];
        NLoginCore_310.b();
    }

    public void c(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!this.a(NLoginCore_5092, (String)NLoginCore_310.c("㺀", (int)cq, (long)(cr ^ cs)), ct != 0)) {
            return;
        }
        NLoginCore_229 NLoginCore_2292 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a();
        if (NLoginCore_2292 != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c) {
            throw new IllegalStateException((String)NLoginCore_310.c("㺃", (int)(cu & cv), (long)cw) + NLoginCore_277.getName() + (String)NLoginCore_310.c("㺆", (int)cx, (long)(cy ^ cz)) + (Object)((Object)NLoginCore_2292));
        }
        NLoginInterface_031 NLoginInterface_0312 = this.var_com_nickuc_login_NLoginType_008_c.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
        if (NLoginInterface_0312 == null || !NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e)) {
            throw new IllegalStateException((String)NLoginCore_310.c("㺉", (int)da, (long)db) + NLoginCore_277.getName());
        }
        if (this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, null, null, NLoginCore_374.n, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_k, LoginType.BEDROCK)) {
            Object[] objectArray = new Object[dc];
            objectArray[NLoginCore_310.dd] = NLoginCore_277;
            this.var_com_nickuc_login_NLoginType_008_c.a(EventEnum.BEDROCK_LOGIN_EVENT, objectArray);
            String string = NLoginCore_277.getName();
            NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_310.c("㺌", (int)de, (long)df) + string + (String)NLoginCore_310.c("㺏", (int)dg, (long)dh) : (String)NLoginCore_310.c("㺒", (int)di, (long)(dj ^ dk)) + string + (String)NLoginCore_310.c("㺕", (int)(dl & dm), (long)dn), new Object[cfr_renamed_1]);
        }
    }
}

