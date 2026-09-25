/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
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
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_018
extends NLoginCore_098 {
    private static int gg;
    private static long be;
    private static long dm;
    private static int cy;
    private static long df;
    private static long cu;
    private static int bl;
    private static int bd;
    private static int dd;
    private static long fy;
    private static int cm;
    private static int gm;
    private static int bu;
    private static long fc;
    private static long cd;
    private static int fp;
    private static int gd;
    private static int y;
    private static int dh;
    private static int gn;
    private static long cq;
    private static long dy;
    private static long ac;
    private static long dc;
    private static int dw;
    private static long ck;
    private static long br;
    private static long dp;
    private static int gc;
    private static int gj;
    private static int fe;
    private static int fs;
    private static int du;
    private static long ez;
    private static int bi;
    private static long p;
    private final String[] b = new String[y];
    private static int dz;
    private static String[] var_java_lang_String_arr_e;
    private static int bx;
    private static int dk;
    private static long cl;
    private static int var_int_e;
    private static long cz;
    private static long ct;
    private static int cv;
    private static int ek;
    private static int fl;
    private static int ea;
    private static int fr;
    private static long fi;
    private static int al;
    private static int bn;
    private static long ee;
    private static long ft;
    private static long fq;
    private static int fd;
    private static int fw;
    private static int ao;
    private static long bk;
    private static long cx;
    private static long ab;
    private static int co;
    private static int fm;
    private static int bw;
    private static int cc;
    private static long by;
    private static int em;
    private static long cp;
    private static int z;
    private static int bp;
    private static long et;
    private static int ce;
    private static int dn;
    private static int cr;
    private static int cb;
    private static int bz;
    private static int ex;
    private static long eo;
    private static long ds;
    private static long bh;
    private static int er;
    private static int fv;
    private static long ci;
    private static long es;
    private static String[] f;
    private static long dg;
    private static long el;
    private static int gh;
    private static int cj;
    private static long at;
    private static long q;
    private static int eu;
    private static long eb;
    private static int dt;
    private static int fz;
    private static long fx;
    private static int ch;
    private static int cg;
    private static long o;
    private static int fh;
    private static int da;
    private static long cw;
    private static int eq;

    private static void void_b() {
        int n;
        o = -1075375502356130482L;
        long l = o ^ 0x1FE2210F314CA524L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(59 + 10), (byte)(44 + 39), 47, 67, (byte)(55 + 11), (byte)(57 + 10), (byte)(37 + 10), (byte)(64 + 16), (byte)(46 + 29), (byte)(9 + 58), (byte)(64 + 19), (byte)(28 + 25), (byte)(68 + 12), (byte)(80 + 17), (byte)(47 + 53), (byte)(29 + 71), (byte)(19 + 86), (byte)(65 + 45), (byte)(4 + 99)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_018.f[0] = NLoginCore_446.E("Կաՠ՛՛Մախցթդդ՟Ս֖ՏշՕգՌռ֊աբ", (byte)82, 69);
                    NLoginCore_018.f[1] = NLoginCore_201.A("ŖƓƖŧƙƓƑơźųŵſţƗŦƓƌƟƊƉƑƠźƥŭůƍƂƐƯƎƜ", (byte)82, 65);
                    NLoginCore_018.f[2] = NLoginCore_138.C("ԍӣԥԀԉӳӳԣԞӤԜӳ", (byte)82, 67);
                    NLoginCore_018.f[3] = NLoginCore_027.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԋӲԣԌԹԆԊԿԔԿԡԗԁԺԶՄԉԣԓԽՍՄԓ", (byte)82, 68);
                    NLoginCore_018.f[4] = NLoginCore_092.C("ԝӵԒԣӹԆԀӳԭӭԊӳ", (byte)82, 67);
                    NLoginCore_018.f[5] = NLoginCore_384.B("ƅśƝŸƁūūƛƖŜƔū", (byte)82, 66);
                    NLoginCore_018.f[6] = NLoginCore_027.A("ŵżŦŸŜŗſƐƞƚƜū", (byte)82, 65);
                    NLoginCore_018.f[7] = NLoginCore_091.E("վշՓշւՈ՞֌ց֎տՖ", (byte)82, 69);
                    NLoginCore_018.f[8] = NLoginCore_027.D("ӚӱԙԚԕӤԧԩӬԅӶӳ", (byte)82, 68);
                    NLoginCore_018.f[9] = NLoginCore_223.F("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճեֆ֊՟՚֓լխտբ֝", (byte)82, 70);
                    NLoginCore_018.f[10] = NLoginCore_027.F("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճե֚֏պխտ֔մչ֎֔", (byte)82, 70);
                    NLoginCore_018.f[11] = NLoginCore_138.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈſƫƀƌƀƇƃƈŷƅƏƹƈƙƲƲƽƳƒƀŷƒƋ", (byte)82, 66);
                    NLoginCore_018.f[12] = NLoginCore_223.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԂԔԓԝԗӽ԰ԪӷՂԾԷԿԄԚӿՆՊՄӾԬԮԓ", (byte)82, 68);
                    NLoginCore_018.f[13] = NLoginCore_223.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈžŭƥƤƆűƍƪƭűƘ", (byte)82, 66);
                    NLoginCore_018.f[14] = NLoginCore_076.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճձխՕ֎։ծց֖֡՟հզֆ֜֡֞֜՟էթևֱ֞֊֏ս֊ղְ֪֕֫֔ցւ", (byte)82, 69);
                    NLoginCore_018.f[15] = NLoginCore_076.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճխ֊ճ֙ց՛պձքջքպ֢ո֚֡֙֫նְ֣֭֟թ֏յ֤խ։ַ֥ջ֪ցւ", (byte)82, 69);
                    NLoginCore_018.f[16] = NLoginCore_223.B("ŴŰƆųŘƉƖůơŴŝū", (byte)82, 66);
                    NLoginCore_018.f[17] = NLoginCore_027.B("ƝŸƜŮşƊūŢžƘűŲŤźƘơŵƢƃūƞƇƄƩƭſƕƤƑűƥƄ", (byte)82, 66);
                    NLoginCore_018.f[18] = NLoginCore_427.F("Ն՛՗ը՘օՄՉ֐է՛զՍճիդդհմպՙ֕չ՛֟։Փ֑֙լխզ", (byte)82, 70);
                    NLoginCore_018.f[19] = NLoginCore_091.B("ƓƌŨƌƗŝųơƖƣƔū", (byte)82, 66);
                    NLoginCore_018.f[20] = NLoginCore_092.B("ŧŷžŸƏƐūżƀƣƖŢƐŽƥƄƚşƂƊƥƧƃƎűƞƪƭơƬƱƪƎƨƎƞƉžŻžƕƥƴƋ", (byte)82, 66);
                    NLoginCore_018.f[21] = NLoginCore_027.F("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճժճ֕֋՜ՙ֋՛հ֖՟աշռփո֩լ֛ւռսն", (byte)82, 70);
                    NLoginCore_018.f[22] = NLoginCore_110.F("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճժ֙զ֖շ֔ջ֖֘֓՝վտօ֔՝ք֪֞լխ֣ն", (byte)82, 70);
                    NLoginCore_018.f[23] = NLoginCore_027.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԊԅԌԵԯԱԾԛԕӻԒԺԴԱԕԝԜԿԓԸԷՀԓ", (byte)82, 68);
                    NLoginCore_018.f[24] = NLoginCore_092.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճղը֑֗ջ֢Ք֟մբ֞ձ֢և֜֞ց֋ևպչ֟ն", (byte)82, 69);
                    NLoginCore_018.f[25] = NLoginCore_453.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճի՚պ֚ր֡՝ղ֜՜֛ՙ՞ավզթովփկչն", (byte)82, 69);
                    NLoginCore_018.f[26] = NLoginCore_559.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԃԸԯӺԯ԰ԳԞԓӸԫӾӿԠԵԔՀՊՁԻԡԺԆԝ԰԰ՌԊԥԐՒՆԡԞԟ", (byte)82, 68);
                    NLoginCore_018.f[27] = NLoginCore_446.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂƃƞƈƤƩƎŵƸŲƷƨźƛƛƿǀƌƮżƐƼƋ", (byte)82, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_018.f[0] = NLoginCore_201.E("Կաՠ՛՛Մախցթդջ֔թա֊նյՕՒՙ֚աբ", (byte)82, 69);
                    NLoginCore_018.f[1] = NLoginCore_387.F("ՁվցՒքվռ֌ե՞ՠժՎւՑվշ֊յմռ֕ն֊֛շ֞փ֘գ֖օ", (byte)82, 70);
                    NLoginCore_018.f[2] = NLoginCore_138.B("ŧƝŻƎŷœůŢƢŤƅƥƨŧſƥƊţŠƗƦƟŶŷ", (byte)82, 66);
                    NLoginCore_018.f[3] = NLoginCore_110.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƃŪƛƄƱžƂƷƌƷƙƪƻƘŻƙƁƝŻƄǁƞƋ", (byte)82, 66);
                    NLoginCore_018.f[4] = NLoginCore_453.D("ԙӴԅӰӸԇԗԂԚԭӦԈӬԈԉԭԪӳԉӿԭԷӾӿ", (byte)82, 68);
                    NLoginCore_018.f[5] = NLoginCore_384.D("ԥԓԦԧӞԠԜԄӾԤӻӯԙԮԟӽ԰ӰԯԦӵԧӾӿ", (byte)82, 68);
                    NLoginCore_018.f[6] = NLoginCore_223.A("ťťŬƖŽŲŻƀƛƤšƝƑƤžƩƪƈƘŧƝŹŶŷ", (byte)82, 65);
                    NLoginCore_018.f[7] = NLoginCore_387.A("ŹƋƚŘŨŭŮƓŢŰűƘŧƣŸŨƜŽŸŧũƟŶŷ", (byte)82, 65);
                    NLoginCore_018.f[8] = NLoginCore_138.E("Ձք՝ք֋՟օՙխ՝ՈՖ", (byte)82, 69);
                    NLoginCore_018.f[9] = NLoginCore_027.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճլՔըռ֠ջնփւ֡մպ֘՟շ֤֝֫ֈշ֣֯ն", (byte)82, 69);
                    NLoginCore_018.f[10] = NLoginCore_110.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճէ՝֖֍֑խ֒֎ձմ֒", (byte)82, 69);
                    NLoginCore_018.f[11] = NLoginCore_559.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճժ֖իշիղծճբհպտփ֢ֈ֦֫գզ֟֙չն", (byte)82, 69);
                    NLoginCore_018.f[12] = NLoginCore_076.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճեշնրպՠ֓֍՚֥֚֡ե֠օ֦֖֕լիւ֑ն", (byte)82, 69);
                    NLoginCore_018.f[13] = NLoginCore_451.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƄƲƯƒƇŶƘƑƤƦƃƇƞƖƈƔŸƐƿžƏưƋ", (byte)82, 65);
                    NLoginCore_018.f[14] = NLoginCore_092.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճձխՕ֎։ծց֖֡՟հզֆ֜֡֞֜՟էթևֱփ֭օְֲ֘ևն֦֛֓֗ֆַ֫־ֻּ֚֘ո", (byte)82, 69);
                    NLoginCore_018.f[15] = NLoginCore_446.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂƟƈƮƖŰƏƆƙƐƙƏƷƍƶƮƯǀƋǂƴƸơƗƄǅƨǋǅƎǁǏǄƥǃǂǓƖǘǅǑƳǓ", (byte)82, 66);
                    NLoginCore_018.f[16] = NLoginCore_004.F("ԹՆՄՅՈցզծՉՍՇղՉֆը֌ո֍֚֕֎դաբ", (byte)82, 70);
                    NLoginCore_018.f[17] = NLoginCore_223.B("ƝŸƜŮşƊūŢžƘűŲŤźƘơŵƢƃūƞƁūƣơƧžƘůƏƥŹųƇŽƙƼƬƎƠƝƄưƋ", (byte)82, 66);
                    NLoginCore_018.f[18] = NLoginCore_138.B("śŰŬŽŭƚřŞƥżŰŻŢƈƀŹŹƅƉƏŮƣƫŰƨƞƶƂƵƈƘƜƷżƗƭƬǁƺƹƃƵƖƋ", (byte)82, 66);
                    NLoginCore_018.f[19] = NLoginCore_201.B("ŮżŪŪơƚźŭţŮƒűżżƤūƩŸƯƁƱŹŶŷ", (byte)82, 66);
                    NLoginCore_018.f[20] = NLoginCore_451.B("ŧŷžŸƏƐūżƀƣƖŢƐŽƥƄƚşƂƊƥƧƃƎűƞƪƭơƬƱƪƶƈźƬƺƮƝƜƔƤưƋ", (byte)82, 66);
                    NLoginCore_018.f[21] = NLoginCore_223.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճժճ֕֋՜ՙ֋՛հ֖՟է֤չ֪մգ֌ռ֩վհն", (byte)82, 69);
                    NLoginCore_018.f[22] = NLoginCore_427.A("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈſƮŻƫƌƩƐƫƭƨŲŶưƻƙƼƬŻƀƻƘƢƋ", (byte)82, 65);
                    NLoginCore_018.f[23] = NLoginCore_110.B("ŖƓƖŧƙƓƑơźųŴƓƗƢƉūŸũŬƞƈƂŽƄƭƧƩƶƓƍųƊƇƎƖƨƏƀƜƸƸŽǄƁƞƜǉƫƽǆƊƌƏǏƖƗ", (byte)82, 66);
                    NLoginCore_018.f[24] = NLoginCore_223.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճղը֑֗ջ֢Ք֟մբ֥֥֞֗ա֢օչի֪ռ֣ն", (byte)82, 69);
                    NLoginCore_018.f[25] = NLoginCore_559.F("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճի՚պ֚ր֡՝ղ֜՜֛֖բտն֤զ֎֎֭֭ը։ֱճְ։֬շ֡֫մքցւ", (byte)82, 70);
                    NLoginCore_018.f[26] = NLoginCore_201.D("ӞԛԞӯԡԛԙԩԂӻӼԛԟԪԑӳԀӱӴԦԐԃԸԯӺԯ԰ԳԞԓӸԫӾӿԠԵԔՀՊՁԻԡԻՀԆԻԦԞԩՌՌԒՖ՗Ԟԟ", (byte)82, 68);
                    NLoginCore_018.f[27] = NLoginCore_138.E("ՁվցՒքվռ֌ե՞՟վւ֍մՖգՔ՗։ճխծ։ճ֏֔չՠ֣՝֢և֙եոզռ֘֩վ֣սն", (byte)82, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_018.f[0] = NLoginCore_451.C("ӻӗӜԤԜԘԝӹӹӫԂӳ", (byte)82, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_018.f[0] = NLoginCore_138.F("ձՅյճՁԾ՝՛իբծը֑ՐֈնՕւՕօղզ֐ոռ՛՟֓շ՝չֆ", (byte)82, 70);
                }
            }
        }
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

    static {
        var_int_e = 0 >>> 118 | 0 << ~118 + 1;
        p = Long.reverse(8262952726149646479L);
        q = Long.reverse(-1729382256910270464L);
        y = (384 >>> 134 | 384 << ~134 + 1) & 0xFFFFFFFF;
        z = 8192 >>> 173 | 8192 << ~173 + 1;
        ab = Long.reverse(8262952726149646479L);
        ac = Long.reverse(-1729382256910270464L);
        al = (16384 >>> 13 | 16384 << -13) & 0xFFFFFFFF;
        ao = Integer.reverse(-1);
        at = Long.reverse(-7301487586042787697L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(8262952726149646479L);
        bh = Long.reverse(-1729382256910270464L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(-7301487586042787697L);
        bl = (-1 >>> 68 | -1 << ~68 + 1) & 0xFFFFFFFF;
        bn = (640 >>> 71 | 640 << -71) & 0xFFFFFFFF;
        bp = -1 >>> 42 | -1 << ~42 + 1;
        br = Long.reverse(-7301487586042787697L);
        bu = Integer.reverse(0);
        bw = -1073741824 >>> 61 | -1073741824 << -61;
        bx = Integer.reverse(-1);
        by = Long.reverse(-7301487586042787697L);
        bz = 0x200000 >>> 85 | 0x200000 << ~85 + 1;
        cb = (57344 >>> 173 | 57344 << ~173 + 1) & 0xFFFFFFFF;
        cc = Integer.reverse(-1);
        cd = Long.reverse(-7301487586042787697L);
        ce = 1 >>> 63 | 1 << ~63 + 1;
        cg = Integer.reverse(0x10000000);
        ch = Integer.reverse(-1);
        ci = Long.reverse(-7301487586042787697L);
        cj = Integer.reverse(-1879048192);
        ck = Long.reverse(8262952726149646479L);
        cl = Long.reverse(-1729382256910270464L);
        cm = Integer.reverse(1462763520);
        co = (0x2800000 >>> 182 | 0x2800000 << -182) & 0xFFFFFFFF;
        cp = Long.reverse(8262952726149646479L);
        cq = Long.reverse(-1729382256910270464L);
        cr = (0x16000000 >>> 57 | 0x16000000 << ~57 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(8262952726149646479L);
        cu = Long.reverse(-1729382256910270464L);
        cv = Integer.reverse(0x30000000);
        cw = Long.reverse(8262952726149646479L);
        cx = Long.reverse(-1729382256910270464L);
        cy = (0x34000000 >>> 90 | 0x34000000 << ~90 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(-7301487586042787697L);
        da = (896 >>> 38 | 896 << ~38 + 1) & 0xFFFFFFFF;
        dc = Long.reverse(-7301487586042787697L);
        dd = Integer.reverse(-268435456);
        df = Long.reverse(8262952726149646479L);
        dg = Long.reverse(-1729382256910270464L);
        dh = (65536 >>> 108 | 65536 << ~108 + 1) & 0xFFFFFFFF;
        dk = Integer.reverse(-1);
        dm = Long.reverse(-7301487586042787697L);
        dn = -2013265920 >>> 251 | -2013265920 << ~251 + 1;
        dp = Long.reverse(8262952726149646479L);
        ds = Long.reverse(-1729382256910270464L);
        dt = (0 >>> 150 | 0 << ~150 + 1) & 0xFFFFFFFF;
        du = Integer.reverse(0x48000000);
        dw = (-1 >>> 43 | -1 << -43) & 0xFFFFFFFF;
        dy = Long.reverse(-7301487586042787697L);
        dz = 128 >>> 71 | 128 << -71;
        ea = 2432 >>> 167 | 2432 << ~167 + 1;
        eb = Long.reverse(8262952726149646479L);
        ee = Long.reverse(-1729382256910270464L);
        ek = Integer.reverse(0x28000000);
        el = Long.reverse(-7301487586042787697L);
        em = Integer.reverse(-1476395008);
        eo = Long.reverse(-7301487586042787697L);
        eq = (0 >>> 25 | 0 << -25) & 0xFFFFFFFF;
        er = 0x2C0000 >>> 241 | 0x2C0000 << ~241 + 1;
        es = Long.reverse(8262952726149646479L);
        et = Long.reverse(-1729382256910270464L);
        eu = Integer.reverse(Integer.MIN_VALUE);
        ex = Integer.reverse(-402653184);
        ez = Long.reverse(8262952726149646479L);
        fc = Long.reverse(-1729382256910270464L);
        fd = Integer.reverse(0x40000000);
        fe = Integer.reverse(0x18000000);
        fh = -1 >>> 148 | -1 << ~148 + 1;
        fi = Long.reverse(-7301487586042787697L);
        fl = (12288 >>> 140 | 12288 << -140) & 0xFFFFFFFF;
        fm = Integer.reverse(-1744830464);
        fp = (-1 >>> 231 | -1 << ~231 + 1) & 0xFFFFFFFF;
        fq = Long.reverse(-7301487586042787697L);
        fr = Integer.reverse(0x20000000);
        fs = -2147483642 >>> 126 | -2147483642 << -126;
        ft = Long.reverse(-7301487586042787697L);
        fv = 0x5000000 >>> 56 | 0x5000000 << -56;
        fw = (1728 >>> 70 | 1728 << ~70 + 1) & 0xFFFFFFFF;
        fx = Long.reverse(8262952726149646479L);
        fy = Long.reverse(-1729382256910270464L);
        fz = (0 >>> 129 | 0 << -129) & 0xFFFFFFFF;
        gc = 0x200000 >>> 181 | 0x200000 << ~181 + 1;
        gd = (0x200000 >>> 148 | 0x200000 << -148) & 0xFFFFFFFF;
        gg = Integer.reverse(-1073741824);
        gh = Integer.reverse(0x20000000);
        gj = (0x50000000 >>> 60 | 0x50000000 << ~60 + 1) & 0xFFFFFFFF;
        gm = (7168 >>> 72 | 7168 << ~72 + 1) & 0xFFFFFFFF;
        gn = (0x7000000 >>> 118 | 0x7000000 << ~118 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[gm];
        f = new String[gn];
        NLoginCore_018.void_b();
    }

    private static String a(int n, long l) {
        l ^= 0x17L;
        l ^= 0x1FE2210F314CA524L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), 69, (byte)(14 + 69), (byte)(8 + 39), (byte)(28 + 39), (byte)(16 + 50), (byte)(30 + 37), (byte)(19 + 28), (byte)(42 + 38), (byte)(55 + 20), (byte)(47 + 20), (byte)(82 + 1), (byte)(38 + 15), (byte)(55 + 25), (byte)(3 + 94), (byte)(41 + 59), (byte)(58 + 42), 105, (byte)(69 + 41), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.A("ƔơƠţƣƟƚƣƮƝŪƨƬƥƨƮŰӢӺԇԁԍӢԇөӻӞ", (byte)89, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_018.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString(this.b[fz]);
        String string = resultSet.getString(this.b[gc]);
        String string2 = resultSet.getString(this.b[gd]);
        long l = resultSet.getLong(this.b[gg]);
        long l2 = resultSet.getLong(this.b[gh]);
        String string3 = resultSet.getString(this.b[gj]);
        this.a(this.r, string, string2, null, (ForceRegisterConfig ForceRegisterConfig2) -> {
            if (string3 != null) {
                ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().b(string3);
            }
            ForceRegisterConfig2.a(l2, l);
        });
    }

    public NLoginCore_018(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_b, (String)NLoginCore_018.c("㺀", (int)var_int_e, (long)(p ^ q)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_018.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("ţƅƇŧƋƪƢƸƤųƱƧƵƯŸƝƿƾƶƼƶƋ", (byte)94, 65), NLoginCore_018.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢀ࢘ࢥ࢟ࢫࢀࢥࢇ࢙ࡼԤ", (byte)94, 67) + string + NLoginCore_091.C("ԉ", (byte)94, 67) + methodType.toString(), exception);
        }
    }
}

