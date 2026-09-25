/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
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
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DatabaseBackendType
extends NLoginCore_098 {
    private static long gr;
    private static int cy;
    private static long fi;
    private static int in;
    private static int dw;
    private static long ge;
    private static int ce;
    private static String[] var_java_lang_String_arr_e;
    private static int ir;
    private static int em;
    private static long gx;
    private static long df;
    private static long au;
    private static long cz;
    private static int hm;
    private static long by;
    private static final String Q;
    private static int iy;
    private static long fc;
    private static long bk;
    private static long ha;
    private static int ij;
    private static int bi;
    private static long be;
    private static int ie;
    private static int fv;
    private static int ed;
    private static long eo;
    private static long bs;
    private static long at;
    private static long cl;
    private static int gv;
    private static int cv;
    private static int gs;
    private static long ee;
    private static int hh;
    private static long gk;
    private static long bh;
    private static int bn;
    private static int fa;
    private static int dz;
    private static int cc;
    private static int dl;
    private static int al;
    private static long di;
    private static int iu;
    private static long ig;
    private static long ik;
    private static int im;
    private static int de;
    private static long ab;
    private static int it;
    private static int gd;
    private static long cq;
    private static long dg;
    private static long io;
    private static long dv;
    private static int cb;
    private static int ea;
    private static int ec;
    private static long eb;
    private static long ct;
    private static int dx;
    private static int fm;
    private static long dm;
    private static int fl;
    private static int dk;
    private static int gw;
    private static long ez;
    private static int fz;
    private static int gm;
    private static int fw;
    private static long hl;
    private static int gh;
    private static int fs;
    private static int fd;
    private static long ew;
    private static int ho;
    private static int gq;
    private static int gj;
    private static int ey;
    private static long iz;
    private static int iq;
    private static String[] f;
    private static int y;
    private static int hg;
    private static int dn;
    private static int z;
    private static int dd;
    private static long bo;
    private static long ck;
    private static long dp;
    private static long o;
    private static long hz;
    private static long dy;
    private static int hj;
    private static long ga;
    private static int bz;
    private static long el;
    private static long bm;
    private static int gc;
    private static int cj;
    private static long gu;
    private static long es;
    private static int cs;
    private static long ff;
    private static int gg;
    private static long hp;
    private static int ex;
    private static int cg;
    private static long gf;
    private static long p;
    private static long ev;
    private static long q;
    private static int bp;
    private static int bu;
    private static int dq;
    private static long ci;
    private static int fh;
    private static int var_int_e;
    private static long cp;
    private static int dh;
    private static long ds;
    private static int eu;
    private static int fr;
    private static int fp;
    private static int ic;
    private static int cr;
    private static long bv;
    private static long br;
    private static int bd;
    private static int ix;
    private static long dc;
    private static int ii;
    private static long cu;
    private static int cfr_renamed_1;
    private static int co;
    private static long et;
    private static int ek;
    private static int eq;
    private static long jc;
    private static int cm;
    private static int gn;
    private static int hy;

    private static /* synthetic */ void a(Properties properties, String string) {
        String[] stringArray = string.split((String)DatabaseBackendType.c("㺀", (int)(im & in), (long)io));
        if (stringArray.length == iq) {
            properties.setProperty(stringArray[ir], stringArray[it]);
        }
    }

    private static void void_b() {
        int n;
        o = 6729508125291912493L;
        long l = o ^ 0x243229C1F5F69251L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(66 + 3), 83, (byte)(28 + 19), (byte)(10 + 57), (byte)(36 + 30), 67, (byte)(12 + 35), (byte)(10 + 70), (byte)(20 + 55), (byte)(21 + 46), (byte)(72 + 11), (byte)(39 + 14), (byte)(25 + 55), (byte)(50 + 47), (byte)(3 + 97), (byte)(84 + 16), (byte)(61 + 44), (byte)(48 + 62), (byte)(96 + 7)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
                    DatabaseBackendType.f[0] = NLoginCore_138.A("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħŭĹŋļĩĺĪŪīŒŏ", (byte)48, 65);
                    DatabaseBackendType.f[1] = NLoginCore_076.E("ԯԲՙԹՠժէՆԿիխՋՈՈհթՄՎբՖՏըԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[2] = NLoginCore_384.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħŭĹŋļĩĺĪŪīŒŏ", (byte)48, 66);
                    DatabaseBackendType.f[3] = NLoginCore_223.B("ĘģŔĭēĻħıĜŋœĺťŀĶĿŜŀŗŧņūĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[4] = NLoginCore_559.A("ĤŅŊŉŒŞĝŇęŠĪĸĢģŜġĶłŇŃņŅĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[5] = NLoginCore_004.C("ҜҨҼҙӂҁӃӀӇҀҥҨҺҊ҇ӆҺӐҜҢҟӑҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[6] = NLoginCore_387.E("ԛԯդթԹԴԫՠժԫԺԢզղՅ՜՝՗էկՊըԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[7] = NLoginCore_223.D("ҊҫҰүҸӄ҃ҭѿӆґҨ҈Ҷҕӆӂҝ҂ҺӄқҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[8] = NLoginCore_091.B("ņĳŎēķĬōŝėĵŊłřĶĵŗĿĸĠĢśūĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[9] = NLoginCore_201.D("ғҊҝӀғӁҰӅҕҳҜҍ", (byte)48, 68);
                    DatabaseBackendType.f[10] = NLoginCore_427.E("ՒԯԹԣթԳըա՘ԿԮԴ", (byte)48, 69);
                    DatabaseBackendType.f[11] = NLoginCore_092.F("ԺԱՄէԺը՗լԼ՚ՃԴ", (byte)48, 70);
                    DatabaseBackendType.f[12] = NLoginCore_110.D("ҩҩҾҊѹҕӁҼҿҾӂҍ", (byte)48, 68);
                    DatabaseBackendType.f[13] = NLoginCore_076.F("ԹԮԷՄ՗ՋԪ՞ժաՂզԨԮըՕճՁԯՏԯՂԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[14] = NLoginCore_451.E("ՃՏգՀթԨժէծԧՌՏաԱԮխաշՃՉՆոԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[15] = NLoginCore_387.A("ĦĤħĬŋŝŒħğĜŘħ", (byte)48, 65);
                    DatabaseBackendType.f[16] = NLoginCore_223.C("ҫҞӁҾҔүҰҼҲ҇ҕ҃ҒӂҦҜӈӉӈӒҌҩҞүӀҍӋӗӎӏҲӚӛӐҹӔӃҚҟӚӃӈӦҭ", (byte)48, 67);
                    DatabaseBackendType.f[17] = NLoginCore_223.A("ĤŅŊŉŒŞĝŇęŠĪĸĢģŜġĶłŇŃņŅĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[18] = NLoginCore_223.C("Ѿ҉Һғѹҡҍҗ҂ұҹҠӋҦҜҥӂҦҽӍҬӑҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[19] = NLoginCore_091.F("ԛԯդթԹԴԫՠժԫԺԢզղՅ՜՝՗էկՊըԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[20] = NLoginCore_092.E("ԱՒ՗Ֆ՟իԪՔԦխԸՏԯ՝ԼխթՄԩաիՂԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[21] = NLoginCore_324.E("ԱՒ՗Ֆ՟իԪՔԦխԷՙՉԬԽ՜՟մՍԴԸՌծԸՌՓ՞կՀւնմ", (byte)48, 69);
                    DatabaseBackendType.f[22] = NLoginCore_223.E("ՐՐեԱԠԼըգզեթԴ", (byte)48, 69);
                    DatabaseBackendType.f[23] = NLoginCore_559.A("ĵŇŔńēĲĕėęĲōķġěĦįĚŒŚŢŕŉŪŜĽŎőŅŭůįķņŹŐĸťōŷşřŻŬŇ", (byte)48, 65);
                    DatabaseBackendType.f[24] = NLoginCore_027.B("ŕŃśŒŅĸĶœīŀīŕŗİŏŦŃğŕĤĥśĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[25] = NLoginCore_324.F("ՖԦՏ԰Դ՛ՆՕԪծբհԾՐՆ՝՝լՁՀչՒԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[26] = NLoginCore_027.D("ҽѱҜҴүҾӃӀ҅ѽҸӇӁҊӃӃӂқӋӊһқҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[27] = NLoginCore_076.A("ĕĢĢĴŝŉŋĻŘŋŗřŎŃŝřĴĽťŜĹĵĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[28] = NLoginCore_027.D("ҔҵҐҐѿҝӀ҂ӅҰҔҍ", (byte)48, 68);
                    DatabaseBackendType.f[29] = NLoginCore_387.E("ԝՂԽ՘ՅեՉՀԷԻԻԴ", (byte)48, 69);
                    DatabaseBackendType.f[30] = NLoginCore_559.A("ŃŏĲŔĶŒōŀŒĸŘħ", (byte)48, 65);
                    DatabaseBackendType.f[31] = NLoginCore_446.E("ՎզէԵՉ՚՞ԫ՝՛ԮԴ", (byte)48, 69);
                    DatabaseBackendType.f[32] = NLoginCore_138.F("ԯԷՂԥԧ՚ԩՌԦ՘ԪԴ", (byte)48, 70);
                    DatabaseBackendType.f[33] = NLoginCore_223.E("ԯԷՂԥԧ՚ԩՌԦ՘ԪԴ", (byte)48, 69);
                    DatabaseBackendType.f[34] = NLoginCore_110.C("҈ҐқѾҀҳ҂ҥѿұ҃ҍ", (byte)48, 67);
                    DatabaseBackendType.f[35] = NLoginCore_138.F("ԝԥՃթ՛՜ԩՃԧՃՃԴ", (byte)48, 70);
                    DatabaseBackendType.f[36] = NLoginCore_453.D("ҬҊѷґҠҼҌҒҲӂӃҩҨ҅ҜҝӆҗҞӋҞӁҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[37] = NLoginCore_092.F("զԼ՞ըԧՆԩիՖ՗թՃՐԫ՜ԼյյԭՇԴՒԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[38] = NLoginCore_092.D("ҰҭҾҹѾҒҙғҮүҝҿңҵҝ҉ҡҽӉҠҋӁҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[39] = NLoginCore_091.A("ėĖĤēĜĲĐŎļŌęŐŏįņĽĺġĹĩŦŅĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[40] = NLoginCore_110.A("ňĖŏŃŏŝŕŎŘĸŠħ", (byte)48, 65);
                    DatabaseBackendType.f[41] = NLoginCore_027.F("ԗԳՏԿՔԶՀՠԪԩԻ՞ԣկ՞Ճ՝ՈՈՉԴպՆ՘ՉԶՇԷշԸ՟՜", (byte)48, 70);
                    continue block7;
                }
                case 1: {
                    DatabaseBackendType.f[0] = NLoginCore_446.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħĥŇĩĺĽŚńĬŋŃŒ", (byte)48, 66);
                    DatabaseBackendType.f[1] = NLoginCore_446.C("҈ҋҲҒҹӃӀҟҘӄӇӃҘҡҙ҈ҠӌҬӌҚӁҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[2] = NLoginCore_091.B("ĊĦłĲŇĩĳœĝĜĮőĖŢőĶŐĻĻļħĤķĮĪħŤĥŎŊņň", (byte)48, 66);
                    DatabaseBackendType.f[3] = NLoginCore_223.D("Ѿ҉Һғѹҡҍҗ҂ұҹӊҒӇҥӀҜңҘӄӒқҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[4] = NLoginCore_201.C("ҊҫҰүҸӄ҃ҭѿӆґҀҊҶҞҽҟӉҥҌҫӁҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[5] = NLoginCore_027.F("ՃՏգՀթԨժէծԧՎ՜ԣՠՆթԴՋՠՓՈԷՓըՊԶրլ՜Ֆ՝՞", (byte)48, 70);
                    DatabaseBackendType.f[6] = NLoginCore_559.E("ԛԯդթԹԴԫՠժԫԸ԰զՑԩհէՊՆՈեըԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[7] = NLoginCore_027.E("ԱՒ՗Ֆ՟իԪՔԦխԷԨ԰ՂՌյՊճձՏՐՈըՍԸզէըաիհԾ", (byte)48, 69);
                    DatabaseBackendType.f[8] = NLoginCore_110.E("ՓՀ՛ԠՄԹ՚ժԤՂ՘Կե՞ՄԦԬՑ՘հԳՂԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[9] = NLoginCore_110.B("ıĮđńŕĩŝŚŉŔŊĞťšİĸňŁŞŬłĵĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[10] = NLoginCore_575.B("ŔĲŎĶŎŜıśĮğŕőĴĝŀŁŢŊŋĽşĵĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[11] = NLoginCore_384.C("һҗѶҚҕҴҽӄӀґӆҀҜ҂ӌӊҬҘҊҊҜӑҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[12] = NLoginCore_427.C("Ѹ҇ѻѷҗ҂ѺҎӃҕұҡқҧҪҫҌҚұӑӌӑҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[13] = NLoginCore_559.A("ĬġĪķŊľĝőŝŔĲĝıŝľŗĞļūšľūĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[14] = NLoginCore_110.B("ĶłŖĳŜěŝŚšĚĿŔŤĽğŇħşţĵņŨŏşĨŏūŪťűįũ", (byte)48, 66);
                    DatabaseBackendType.f[15] = NLoginCore_559.D("ҬѾҵѻҁҍҝѻ҅Җӆҍ", (byte)48, 68);
                    DatabaseBackendType.f[16] = NLoginCore_076.B("ŅĸśŘĮŉŊŖŌġįĝĬŜŀĶŢţŢŬĦŃĸŉŚħťűŨũŌŴŪŢśıŒőŒıŻŶżŇ", (byte)48, 66);
                    DatabaseBackendType.f[17] = NLoginCore_446.B("ĤŅŊŉŒŞĝŇęŠīĿĺŎţĺğŉšŇĹŅĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[18] = NLoginCore_446.B("ĘģŔĭēĻħıĜŋŒŁĲŁįğħŔūşļŅĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[19] = NLoginCore_575.D("Ѵ҈ҽӂҒҍ҄ҹӃ҄ғӈқҽҧһҡӂҰӐҳҫҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[20] = NLoginCore_201.E("ԱՒ՗Ֆ՟իԪՔԦխԹ՛ՠխԩՑգ՞ՊԴոՇժԺ՞խՋԺՠժՏԼ", (byte)48, 69);
                    DatabaseBackendType.f[21] = NLoginCore_091.E("ԱՒ՗Ֆ՟իԪՔԦխԷՙՉԬԽ՜՟մՍԴԸՅՌնՙժՎԽյճԿո", (byte)48, 69);
                    DatabaseBackendType.f[22] = NLoginCore_223.C("ҽѹҔӀҏҸҡ҄҅ҞѺӈҳҜӃҬҎҦҍҽӃӑҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[23] = NLoginCore_027.C("қҭҺҪѹҘѻѽѿҘҳҝ҇ҁҌҕҀҸӀӈһүӐӂңҴҷҫӓӕҕҝәҝӍӂҘӌӚӍҽӁҼҭ", (byte)48, 67);
                    DatabaseBackendType.f[24] = NLoginCore_027.F("բՐը՟ՒՅՃՠԸՍԹԧԺխհՎ԰ՅյԷՄՂԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[25] = NLoginCore_559.C("үѿҨ҉ҍҴҟҮ҃ӇһҹҠҽ҄ҵҿӈӏҢҏҫҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[26] = NLoginCore_324.A("ŗċĶŎŉŘŝŚğėŒĽşŝľłŅğŤŕŖĵĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[27] = NLoginCore_076.B("ĕĢĢĴŝŉŋĻŘŋŔĕŠĴőļġĽĠŤŬŊŝŜũŞŌĥŴīŭŷ", (byte)48, 66);
                    DatabaseBackendType.f[28] = NLoginCore_110.A("ĦĶĸĵıĩĹķŒŌġħ", (byte)48, 65);
                    DatabaseBackendType.f[29] = NLoginCore_324.B("ŖĳōňĖĳėŉŞġōīŠĶţťĺœńľŘŅĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[30] = NLoginCore_575.F("ՀՇԹԟԳԺՄԬ՘ՖծխԩԽճՉՌԵՍձԵոԿՀ", (byte)48, 70);
                    DatabaseBackendType.f[31] = NLoginCore_446.B("łőİđĵĺįŋĖŉŌŎŤĿŇŀĻńŘŝťĵĲĳ", (byte)48, 66);
                    DatabaseBackendType.f[32] = NLoginCore_387.E("ՂԘՖ՞ՕԽՆբԶըԮԴ", (byte)48, 69);
                    DatabaseBackendType.f[33] = NLoginCore_559.D("ѶҴҴҷӀӄӀҎҡҔҶҍ", (byte)48, 68);
                    DatabaseBackendType.f[34] = NLoginCore_384.D("ѶҭѶҫҶҍҗҡӁҠҨҍ", (byte)48, 68);
                    DatabaseBackendType.f[35] = NLoginCore_091.C("ҪѶҺҖҽұҹҥұҜҨҍ", (byte)48, 67);
                    DatabaseBackendType.f[36] = NLoginCore_223.A("ņĤđīĺŖĦĬŌŜŝĽŝĠļĸŉĠřŖĬŅĲĳ", (byte)48, 65);
                    DatabaseBackendType.f[37] = NLoginCore_173.E("զԼ՞ըԧՆԩիՖ՗թ՝ԯՠՑղԽՠհծաՒԿՀ", (byte)48, 69);
                    DatabaseBackendType.f[38] = NLoginCore_384.C("ҰҭҾҹѾҒҙғҮүҞҪҒҹҭҗӀҧҙӊҍҫҘҙ", (byte)48, 67);
                    DatabaseBackendType.f[39] = NLoginCore_575.D("ѽѼҊѹ҂ҘѶҴҢҲҀӊҨӁҨӋҚ҉ҞҽҩҫҘҙ", (byte)48, 68);
                    DatabaseBackendType.f[40] = NLoginCore_223.F("դԮ՝ԞԵՈՇ՘ԺՠԷԴ", (byte)48, 70);
                    DatabaseBackendType.f[41] = NLoginCore_446.C("ѰҌҨҘҭҏҙҹ҃҂ҔҷѼӈҷҜҶҡҡҢҍ҉ҳӄҩҧҠӃҩҼӅӞ", (byte)48, 67);
                    continue block7;
                }
                case 2: {
                    DatabaseBackendType.f[0] = NLoginCore_324.D("ҪґҬѳҜҁҁүӄқґҧҔҝҥҾҘҧҮӑӁқҘҙ", (byte)48, 68);
                    continue block7;
                }
                case 4: {
                    DatabaseBackendType.f[0] = NLoginCore_027.B("ĠŒŕĹİĴĝħĖŐŘěşŐťşĵňļŨšĨũĭĨľņİŏľņĲ", (byte)48, 66);
                }
            }
        }
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(-5424439987498113350L);
        q = Long.reverse(-1297036692682702848L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = (-1 >>> 226 | -1 << -226) & 0xFFFFFFFF;
        ab = Long.reverse(6537120622797924026L);
        al = (524288 >>> 178 | 524288 << -178) & 0xFFFFFFFF;
        at = Long.reverse(-5424439987498113350L);
        au = Long.reverse(-1297036692682702848L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-5424439987498113350L);
        bh = Long.reverse(-1297036692682702848L);
        bi = (0x100000 >>> 82 | 0x100000 << -82) & 0xFFFFFFFF;
        bk = Long.reverse(-5424439987498113350L);
        bm = Long.reverse(-1297036692682702848L);
        bn = (0xA000000 >>> 217 | 0xA000000 << ~217 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(6537120622797924026L);
        bp = Integer.reverse(0x60000000);
        br = Long.reverse(-5424439987498113350L);
        bs = Long.reverse(-1297036692682702848L);
        bu = Integer.reverse(-536870912);
        bv = Long.reverse(-5424439987498113350L);
        by = Long.reverse(-1297036692682702848L);
        bz = Integer.reverse(Integer.MIN_VALUE);
        cb = Integer.reverse(0);
        cc = (0 >>> 115 | 0 << ~115 + 1) & 0xFFFFFFFF;
        ce = Integer.reverse(0x10000000);
        cg = Integer.reverse(-1);
        ci = Long.reverse(6537120622797924026L);
        cj = Integer.reverse(-1879048192);
        ck = Long.reverse(-5424439987498113350L);
        cl = Long.reverse(-1297036692682702848L);
        cm = -1 >>> 152 | -1 << ~152 + 1;
        co = 0x5000000 >>> 23 | 0x5000000 << -23;
        cp = Long.reverse(-5424439987498113350L);
        cq = Long.reverse(-1297036692682702848L);
        cr = 0 >>> 199 | 0 << ~199 + 1;
        cs = Integer.reverse(-805306368);
        ct = Long.reverse(-5424439987498113350L);
        cu = Long.reverse(-1297036692682702848L);
        cv = Integer.reverse(Integer.MIN_VALUE);
        cy = -1073741824 >>> 60 | -1073741824 << -60;
        cz = Long.reverse(-5424439987498113350L);
        dc = Long.reverse(-1297036692682702848L);
        dd = 0x40000000 >>> 157 | 0x40000000 << -157;
        de = (851968 >>> 16 | 851968 << ~16 + 1) & 0xFFFFFFFF;
        df = Long.reverse(-5424439987498113350L);
        dg = Long.reverse(-1297036692682702848L);
        dh = 0x70000000 >>> 219 | 0x70000000 << -219;
        di = Long.reverse(6537120622797924026L);
        dk = Integer.reverse(-268435456);
        dl = Integer.reverse(-1);
        dm = Long.reverse(6537120622797924026L);
        dn = Integer.reverse(0x8000000);
        cfr_renamed_1 = Integer.reverse(-1);
        dp = Long.reverse(6537120622797924026L);
        dq = (0x8800000 >>> 87 | 0x8800000 << ~87 + 1) & 0xFFFFFFFF;
        ds = Long.reverse(-5424439987498113350L);
        dv = Long.reverse(-1297036692682702848L);
        dw = Integer.reverse(1462763520);
        dx = 4608 >>> 232 | 4608 << -232;
        dy = Long.reverse(6537120622797924026L);
        dz = (0x13000000 >>> 184 | 0x13000000 << ~184 + 1) & 0xFFFFFFFF;
        ea = (-1 >>> 63 | -1 << ~63 + 1) & 0xFFFFFFFF;
        eb = Long.reverse(6537120622797924026L);
        ec = (160 >>> 99 | 160 << ~99 + 1) & 0xFFFFFFFF;
        ed = Integer.reverse(-1);
        ee = Long.reverse(6537120622797924026L);
        ek = Integer.reverse(-1476395008);
        el = Long.reverse(6537120622797924026L);
        em = Integer.reverse(0x68000000);
        eo = Long.reverse(6537120622797924026L);
        eq = -2147483637 >>> 95 | -2147483637 << ~95 + 1;
        es = Long.reverse(-5424439987498113350L);
        et = Long.reverse(-1297036692682702848L);
        eu = Integer.reverse(0x18000000);
        ev = Long.reverse(-5424439987498113350L);
        ew = Long.reverse(-1297036692682702848L);
        ex = Integer.reverse(-1744830464);
        ey = Integer.reverse(-1);
        ez = Long.reverse(6537120622797924026L);
        fa = (3328 >>> 199 | 3328 << -199) & 0xFFFFFFFF;
        fc = Long.reverse(6537120622797924026L);
        fd = 0x360000 >>> 241 | 0x360000 << -241;
        ff = Long.reverse(6537120622797924026L);
        fh = (28672 >>> 106 | 28672 << -106) & 0xFFFFFFFF;
        fi = Long.reverse(6537120622797924026L);
        fl = 3 >>> 192 | 3 << ~192 + 1;
        fm = Integer.reverse(0x20000000);
        fp = (0 >>> 215 | 0 << ~215 + 1) & 0xFFFFFFFF;
        fr = 0x9000000 >>> 86 | 0x9000000 << ~86 + 1;
        fs = 0x4000000 >>> 122 | 0x4000000 << -122;
        fv = Integer.reverse(0);
        fw = (-1 >>> 7 | -1 << ~7 + 1) & 0xFFFFFFFF;
        fz = Integer.reverse(-1207959552);
        ga = Long.reverse(6537120622797924026L);
        gc = 0 >>> 87 | 0 << -87;
        gd = 245760 >>> 141 | 245760 << ~141 + 1;
        ge = Long.reverse(-5424439987498113350L);
        gf = Long.reverse(-1297036692682702848L);
        gg = Integer.reverse(Integer.MIN_VALUE);
        gh = (126976 >>> 12 | 126976 << ~12 + 1) & 0xFFFFFFFF;
        gj = -1 >>> 109 | -1 << -109;
        gk = Long.reverse(6537120622797924026L);
        gm = 8 >>> 194 | 8 << ~194 + 1;
        gn = Integer.reverse(0x4000000);
        gq = Integer.reverse(-1);
        gr = Long.reverse(6537120622797924026L);
        gs = Integer.reverse(-2080374784);
        gu = Long.reverse(6537120622797924026L);
        gv = (2 >>> 64 | 2 << ~64 + 1) & 0xFFFFFFFF;
        gw = (557056 >>> 238 | 557056 << ~238 + 1) & 0xFFFFFFFF;
        gx = Long.reverse(-5424439987498113350L);
        ha = Long.reverse(-1297036692682702848L);
        hg = (1024 >>> 106 | 1024 << ~106 + 1) & 0xFFFFFFFF;
        hh = Integer.reverse(-1006632960);
        hj = Integer.reverse(-1);
        hl = Long.reverse(6537120622797924026L);
        hm = Integer.reverse(0x24000000);
        ho = Integer.reverse(-1);
        hp = Long.reverse(6537120622797924026L);
        hy = (9472 >>> 136 | 9472 << ~136 + 1) & 0xFFFFFFFF;
        hz = Long.reverse(6537120622797924026L);
        ic = 19 >>> 223 | 19 << ~223 + 1;
        ie = Integer.reverse(-1);
        ig = Long.reverse(6537120622797924026L);
        ii = Integer.reverse(-469762048);
        ij = Integer.reverse(-1);
        ik = Long.reverse(6537120622797924026L);
        im = 80 >>> 129 | 80 << -129;
        in = (-1 >>> 58 | -1 << -58) & 0xFFFFFFFF;
        io = Long.reverse(6537120622797924026L);
        iq = Integer.reverse(0x40000000);
        ir = Integer.reverse(0);
        it = Integer.reverse(Integer.MIN_VALUE);
        iu = 2688 >>> 230 | 2688 << ~230 + 1;
        ix = Integer.reverse(0x54000000);
        iy = 0xA400000 >>> 150 | 0xA400000 << ~150 + 1;
        iz = Long.reverse(-5424439987498113350L);
        jc = Long.reverse(-1297036692682702848L);
        var_java_lang_String_arr_e = new String[iu];
        f = new String[ix];
        DatabaseBackendType.void_b();
        Q = DatabaseBackendType.c("㺀", (int)iy, (long)(iz ^ jc));
    }

    public DatabaseBackendType(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_i, (String)DatabaseBackendType.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)DatabaseBackendType.c("㺃", (int)(y & z), (long)ab));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void b(ResultSet var1_1) {
        this.r = var1_1.getString((String)DatabaseBackendType.c("㺀", (int)DatabaseBackendType.eu, (long)(DatabaseBackendType.ev ^ DatabaseBackendType.ew)));
        if (this.r == null) {
            return;
        }
        var2_2 = NLoginCore_432.c(var1_1.getString((String)DatabaseBackendType.c("㺃", (int)(DatabaseBackendType.ex & DatabaseBackendType.ey), (long)DatabaseBackendType.ez)));
        var3_3 = NLoginCore_432.c(var1_1.getString((String)DatabaseBackendType.c("㺆", (int)DatabaseBackendType.fa, (long)DatabaseBackendType.fc)));
        var4_4 = var1_1.getString((String)DatabaseBackendType.c("㺉", (int)DatabaseBackendType.fd, (long)DatabaseBackendType.ff));
        if (var4_4 != null) {
            var5_5 /* !! */  = var4_4.split((String)DatabaseBackendType.c("㺌", (int)DatabaseBackendType.fh, (long)DatabaseBackendType.fi));
            if (var5_5 /* !! */ .length != DatabaseBackendType.fl && var5_5 /* !! */ .length != DatabaseBackendType.fm) {
                this.e(this.r, var4_4, null);
                return;
            }
            var6_6 = var4_4.charAt(DatabaseBackendType.fp) == DatabaseBackendType.fr ? DatabaseBackendType.fs : DatabaseBackendType.fv;
            var8_9 = var7_8 = var5_5 /* !! */ [var6_6].toUpperCase(Locale.ENGLISH);
            var9_10 = DatabaseBackendType.fw;
            switch (var8_9.hashCode()) {
                case -1850268089: {
                    if (!var8_9.equals(DatabaseBackendType.c("㺏", (int)DatabaseBackendType.fz, (long)DatabaseBackendType.ga))) break;
                    var9_10 = DatabaseBackendType.gc;
                    break;
                }
                case -1850265334: {
                    if (!var8_9.equals(DatabaseBackendType.c("㺒", (int)DatabaseBackendType.gd, (long)(DatabaseBackendType.ge ^ DatabaseBackendType.gf)))) break;
                    var9_10 = DatabaseBackendType.gg;
                    break;
                }
                case 1953930828: {
                    if (!var8_9.equals(DatabaseBackendType.c("㺕", (int)(DatabaseBackendType.gh & DatabaseBackendType.gj), (long)DatabaseBackendType.gk))) break;
                    var9_10 = DatabaseBackendType.gm;
                    break;
                }
            }
            switch (var9_10) {
                case 0: 
                case 1: {
                    var4_4 = (String)DatabaseBackendType.c("㺘", (int)(DatabaseBackendType.gn & DatabaseBackendType.gq), (long)DatabaseBackendType.gr) + (String)var7_8 + (String)DatabaseBackendType.c("㺛", (int)DatabaseBackendType.gs, (long)DatabaseBackendType.gu) + var5_5 /* !! */ [var6_6 + DatabaseBackendType.gv] + (String)DatabaseBackendType.c("㺞", (int)DatabaseBackendType.gw, (long)(DatabaseBackendType.gx ^ DatabaseBackendType.ha)) + var5_5 /* !! */ [var6_6 + DatabaseBackendType.hg];
                    break;
                }
                case 2: {
                    var4_4 = (String)DatabaseBackendType.c("㺡", (int)(DatabaseBackendType.hh & DatabaseBackendType.hj), (long)DatabaseBackendType.hl) + var4_4.substring(var7_8.length() + var6_6);
                    break;
                }
            }
            this.e(this.r, var4_4, (String)var7_8);
            return;
        }

        var5_5 /* !! */  = var1_1.getString((String)DatabaseBackendType.c("㺤", (int)(DatabaseBackendType.hm & DatabaseBackendType.ho), (long)DatabaseBackendType.hp));
        var6_7 = var1_1.getString((String)DatabaseBackendType.c("㺧", (int)DatabaseBackendType.hy, (long)DatabaseBackendType.hz));
        var7_8 = null;
        var8_9 = null;
        try {
            var7_8 = var1_1.getTimestamp((String)DatabaseBackendType.c("㺪", (int)(DatabaseBackendType.ic & DatabaseBackendType.ie), (long)DatabaseBackendType.ig));
            var8_9 = var1_1.getTimestamp((String)DatabaseBackendType.c("㺭", (int)(DatabaseBackendType.ii & DatabaseBackendType.ij), (long)DatabaseBackendType.ik));
        }
        catch (Exception var9_11) {
            // empty catch block
        }
        var9_12 = var8_9;
        var10_13 = var7_8;
        var11_14 = config -> a((String)var6_7, (Timestamp)var9_12, (Timestamp)var10_13, config);
        if (var3_3 != null) {
            this.a(this.r, var4_4, (String)var5_5 /* !! */ , var2_2, var3_3, var11_14);
            return;
        }
        this.a(this.r, var4_4, (String)var5_5 /* !! */ , var2_2, var11_14);
    }

    private static /* synthetic */ void a(String string, Timestamp timestamp, Timestamp timestamp2, ForceRegisterConfig ForceRegisterConfig2) {
        if (string != null) {
            ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().b(string);
        }
        ForceRegisterConfig2.a(timestamp != null ? Long.valueOf(timestamp.getTime()) : null, timestamp2 != null ? Long.valueOf(timestamp2.getTime()) : null);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(DatabaseBackendType.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.D("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 68), DatabaseBackendType.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲӹԁӼӚԂԋԄӾӬƇ", (byte)90, 66) + string + NLoginCore_427.A("ŭ", (byte)90, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x77L;
        l ^= 0x243229C1F5F69251L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(12 + 57), 83, (byte)(24 + 23), (byte)(21 + 46), (byte)(2 + 64), (byte)(21 + 46), (byte)(6 + 41), (byte)(77 + 3), (byte)(27 + 48), (byte)(60 + 7), (byte)(77 + 6), (byte)(24 + 29), (byte)(8 + 72), (byte)(89 + 8), 100, (byte)(95 + 5), (byte)(65 + 40), (byte)(108 + 2), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.F("֎֛֚՝֝֙֔֝֨֗դ֢֦֢֟֨ժࣱࣹ࣒ࣺࣴःࣶࣼࣤ", (byte)111, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            DatabaseBackendType.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void c(NLoginCore_219 var1_1) {
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
            NLoginCore_219 NLoginCore_2192 = this.com_nickuc_login_NLoginCore_219_a((String)DatabaseBackendType.c("㺀", (int)al, (long)(at ^ au)));
            return (NLoginCore_2192.p((String)DatabaseBackendType.c("㺃", (int)bd, (long)(be ^ bh))) && NLoginCore_2192.p((String)DatabaseBackendType.c("㺆", (int)bi, (long)(bk ^ bm))) && NLoginCore_2192.p((String)DatabaseBackendType.c("㺉", (int)bn, (long)bo)) && NLoginCore_2192.p((String)DatabaseBackendType.c("㺌", (int)bp, (long)(br ^ bs))) && NLoginCore_2192.p((String)DatabaseBackendType.c("㺏", (int)bu, (long)(bv ^ by))) ? bz : cb) != 0;
        }
        return cc != 0;
    }
}

