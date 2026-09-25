/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.Server
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
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
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
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class NLoginCore_238
extends NLoginCore_098 {
    private static int fl;
    private static int bn;
    private static long bo;
    private static int fv;
    private static int gg;
    private static int ek;
    private static long gr;
    private static int gs;
    private static long dc;
    private static int cy;
    private static int fr;
    private static int cb;
    private static long dp;
    private static long ez;
    private static int var_int_e;
    private static long be;
    private static long ck;
    private static int dk;
    private static long eo;
    private static long ee;
    private static long cf;
    private static int cc;
    private static long ft;
    private static long et;
    private static long ca;
    private static int gd;
    private static int bd;
    private static long o;
    private static int ex;
    private static int bu;
    private static int hg;
    private static int ed;
    private static int cr;
    private static long dy;
    private static int gv;
    private static long ff;
    private static int hj;
    private static int cfr_renamed_1;
    private static int er;
    private static long by;
    private static int z;
    private static int gj;
    private static long ci;
    private static String[] var_java_lang_String_arr_e;
    private static int hh;
    private static String[] f;
    private static long cn;
    private static long ef;
    private static int gm;
    private static int fs;
    private static int dh;
    private static long cd;
    private static long gx;
    private static int bf;
    private static long p;
    private static long fc;
    private static long gu;
    private static long ep;
    private static int cg;
    private static int ar;
    private static long bk;
    private static long dm;
    private static int fp;
    private static long df;
    private static int gq;
    private static int hk;
    private static int gn;
    private static long fn;
    private static int gt;
    private static int cv;
    private static long cw;
    private static long ds;
    private static int fe;
    private static int dn;
    private static int dq;
    private static int cs;
    private static int gh;
    private static int fh;
    private static int bw;
    private static int fd;
    private static int ch;
    private static int gc;
    private static long es;
    private static int dw;
    private static int em;
    private static long br;
    private static long fu;
    private static int hm;
    private static long bh;
    private static long q;
    private static long ha;
    private static int eq;
    private static int ea;
    private static int cm;
    private static int ec;
    private static int dz;
    private static int fw;
    private static int al;
    private static int bl;
    private static long ev;
    private static long dg;
    private static long cz;
    private static int eu;
    private static int y;
    private static int ao;
    private static long dv;
    private static long ab;
    private static long hi;
    private static int fz;
    private static int dd;
    private static long cp;
    private static long eb;

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

    private static String a(long l) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = hg; i >= 0; --i) {
            stringBuilder.append(l >> i * hh & hi);
            if (i <= 0) continue;
            stringBuilder.append((char)hj);
        }
        return stringBuilder.toString();
    }

    private static String a(int n, long l) {
        l ^= 0x14L;
        l ^= 0x9E1EC436233B63D8L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(50 + 19), (byte)(69 + 14), (byte)(24 + 23), (byte)(8 + 59), 66, (byte)(33 + 34), (byte)(37 + 10), 80, (byte)(56 + 19), (byte)(23 + 44), (byte)(50 + 33), (byte)(19 + 34), (byte)(36 + 44), (byte)(71 + 26), (byte)(7 + 93), (byte)(14 + 86), (byte)(53 + 52), (byte)(89 + 21), (byte)(43 + 60)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢫ࢟ࢮ࢑ࢡ࢐ࢎ࢏ࢦࢌࢷ", (byte)27, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_238.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = 2794520898742384581L;
        long l = o ^ 0x9E1EC436233B63D8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(11 + 58), (byte)(54 + 29), (byte)(12 + 35), (byte)(34 + 33), (byte)(22 + 44), (byte)(23 + 44), (byte)(41 + 6), (byte)(78 + 2), (byte)(42 + 33), (byte)(11 + 56), (byte)(65 + 18), 53, (byte)(6 + 74), (byte)(43 + 54), (byte)(54 + 46), (byte)(68 + 32), (byte)(21 + 84), (byte)(65 + 45), (byte)(46 + 57)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_238.f[0] = NLoginCore_324.B("ưǫǪǬǖǦƳǸǹǯƹǮǾǕǍǁȂǿǕǐǯǏǌǍ", (byte)125, 66);
                    NLoginCore_238.f[1] = NLoginCore_384.A("ǜƪǐǅǞǗǑǱǴǬǤǎǲǒȀƺǱǴǽǯǵǏǌǍ", (byte)125, 65);
                    NLoginCore_238.f[2] = NLoginCore_575.A("ǠǌǉƿǨǃǒǆƵǱǙǽǽȀǫǾǻǜǬǀƽǟǌǍ", (byte)125, 65);
                    NLoginCore_238.f[3] = NLoginCore_138.D("֕՜՟ողէ֤պոցփմ", (byte)125, 68);
                    NLoginCore_238.f[4] = NLoginCore_427.E("֢թլօտմֱևօ֎֐ց", (byte)125, 69);
                    NLoginCore_238.f[5] = NLoginCore_559.E("ևֲ֤սնְַ֑֬։ֺց", (byte)125, 69);
                    NLoginCore_238.f[6] = NLoginCore_324.E("ִ֮ֈ֬֎֘֯ֈհֵնս֌֍ֿ֐վְׁ֥֭֟֌֍", (byte)125, 69);
                    NLoginCore_238.f[7] = NLoginCore_559.B("ǜƪǐǅǞǗǑǱǴǬǝǳǋǕȁǚǻǚȁǔȂǡƾǠǓȋȁȁǞǝȄǬ", (byte)125, 66);
                    NLoginCore_238.f[8] = NLoginCore_559.F("֠֌։տ֨փ֒ֆյֱ֚պ֔ս֠ոֻ֯֟֎ֽׅ֌֍", (byte)125, 70);
                    NLoginCore_238.f[9] = NLoginCore_427.F("֠֌։տ֨փ֒ֆյֱָ֛֊չֱֻֻ־նֻվֽ֛֩օ֧׉֨׎֍֦֙", (byte)125, 70);
                    NLoginCore_238.f[10] = NLoginCore_110.B("ǪǩǴǕǮǳǍǆƳǹǯǭƸǠǈǹǂǌǐǿǰǟǌǍ", (byte)125, 66);
                    NLoginCore_238.f[11] = NLoginCore_091.E("֠֌։տ֨փ֒ֆյֱ֛֚֏ս֖֊ֿ֢֛֥֫׈ֹ֧֧֒ֈֶֻֆ֌֠", (byte)125, 69);
                    NLoginCore_238.f[12] = NLoginCore_453.B("ƤǋǣǡƭƮǢǍǉǘǘǁ", (byte)125, 66);
                    NLoginCore_238.f[13] = NLoginCore_324.C("֓տռղ֛նօչը֤֎֣տ֫։֬քձֵ֦֭֩֘օּմֵ֑֓֊֒֬", (byte)125, 67);
                    NLoginCore_238.f[14] = NLoginCore_091.E("֢֟և֯ծֆճկ֯։֯֜֍֗֔։ֵ֓֫֝֗֒֌֍", (byte)125, 69);
                    NLoginCore_238.f[15] = NLoginCore_384.B("ǠǌǉƿǨǃǒǆƵǱǘǗǮƿƽǮǷǿǷǢǐǿȇǈǻǘȆǊȄǸȊǝ", (byte)125, 66);
                    NLoginCore_238.f[16] = NLoginCore_091.D("խր֟եովփը֍֎֥մ", (byte)125, 68);
                    NLoginCore_238.f[17] = NLoginCore_201.B("ǇǤǲƽƶǬǷǰǑǉǺǁ", (byte)125, 66);
                    NLoginCore_238.f[18] = NLoginCore_559.B("ǮǴǈǬǎǘǯǈưǵƶƽǌǍǿǐƾǭǰȁǥǟǌǍ", (byte)125, 66);
                    NLoginCore_238.f[19] = NLoginCore_091.C("֥շո՟֦վ֤֝֋տփ֚֩հկռէ֤֗ր֯լն֎ս֚ռֱֶֹׂׂ֑֠֨֩־֩֠׀֛֬׍֔", (byte)125, 67);
                    NLoginCore_238.f[20] = NLoginCore_091.F("֜֨֔ևև֘֏ִֺ֔֨ց", (byte)125, 70);
                    NLoginCore_238.f[21] = NLoginCore_201.E("֢֟և֯ծֆճկ֯։֯֜֍֗֔։ֵ֓֫֝֗֒֌֍", (byte)125, 69);
                    NLoginCore_238.f[22] = NLoginCore_324.C("֚դեմ֪օբտ֫֍֭մ", (byte)125, 67);
                    NLoginCore_238.f[23] = NLoginCore_138.D("֝վճ֡։֢֘֜թ֥եւխְլ֪֖ծֹ֕օ֥֚֓նսջն֟־ֲֶֺ׀ׇ֢ր׃ַֺ֜׋ׁ֔", (byte)125, 68);
                    NLoginCore_238.f[24] = NLoginCore_027.B("ƿǍƭǫƲƵǦǰǎƷǛǙǳǚƻǰǔǱȃǔǖǏǌǍ", (byte)125, 66);
                    NLoginCore_238.f[25] = NLoginCore_076.F("֏֑֦֪֫֯֬֕֌֥շց", (byte)125, 70);
                    NLoginCore_238.f[26] = NLoginCore_324.B("ƤǁƮǳǔǊǸǒǓǨǱƸƹƱȁǎƾǾǙǂǄǏǌǍ", (byte)125, 66);
                    NLoginCore_238.f[27] = NLoginCore_138.F("֨ծִ֯֐ֈ֌ָ֍֚֍֦֎ּ֞־ׂ֟֍ׁ֥ׅ֌֍", (byte)125, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_238.f[0] = NLoginCore_027.A("ưǫǪǬǖǦƳǸǹǯƸǝǇȀƷǑǺǂǿǢǮǏǌǍ", (byte)125, 65);
                    NLoginCore_238.f[1] = NLoginCore_223.B("ǜƪǐǅǞǗǑǱǴǬǝǪǜǵǝǮǟƾǜǃǧȅǌǍ", (byte)125, 66);
                    NLoginCore_238.f[2] = NLoginCore_324.F("֠֌։տ֨փ֒ֆյֱ֙֓֊֔ջ֌ְ֙֜֔֗ևֱׇֹֽ֪օ֌ׅ֠׊", (byte)125, 70);
                    NLoginCore_238.f[3] = NLoginCore_223.C("ջձջ֩է֧ֆ֠֊լֆ֣ժս֦զ֌ղ֣֓նָտր", (byte)125, 67);
                    NLoginCore_238.f[4] = NLoginCore_223.D("ռ֘֙֘֓վ֣֠րշ֦ոխ֦֮֝֔֕խո֐֒տր", (byte)125, 68);
                    NLoginCore_238.f[5] = NLoginCore_138.D("մյւուփք֊յ֠փմ", (byte)125, 68);
                    NLoginCore_238.f[6] = NLoginCore_446.B("ǮǴǈǬǎǘǯǈưǵƳǳǓƱǟǟǼǎȂȂǮǟǌǍ", (byte)125, 66);
                    NLoginCore_238.f[7] = NLoginCore_091.C("֏՝փո֑֊ք֤֧֟֐֦վֈִ֍֮֍ִևֵ֦ջ֎֛֮֘տ֊մַվ", (byte)125, 67);
                    NLoginCore_238.f[8] = NLoginCore_427.A("ǠǌǉƿǨǃǒǆƵǱǚǻǚǞǷǢǰǲǀȄǢǠȁƻƼȊǦǛǻǫȁǑ", (byte)125, 65);
                    NLoginCore_238.f[9] = NLoginCore_173.B("ǠǌǉƿǨǃǒǆƵǱǛǸǊƹǻǻǱǾƶǻƾǞǑǆǈǗǪǶǪǜǹǽ", (byte)125, 66);
                    NLoginCore_238.f[10] = NLoginCore_201.B("ǪǩǴǕǮǳǍǆƳǹǮǋǐǘƿǞƺǌǡǴǟǵǌǍ", (byte)125, 66);
                    NLoginCore_238.f[11] = NLoginCore_138.C("֓տռղ֛նօչը֤֎֍ւհ։ս֕֞֎ֲ֘պ֛֎ն֬֔֝֊ֳִֺ", (byte)125, 67);
                    NLoginCore_238.f[12] = NLoginCore_027.C("ր֢մռօ֣ցնրժծմ", (byte)125, 67);
                    NLoginCore_238.f[13] = NLoginCore_027.A("ǠǌǉƿǨǃǒǆƵǱǛǰǌǸǖǹǑƾǶȂǥǿǜȅǘǪȌȃǇȀǭǼ", (byte)125, 65);
                    NLoginCore_238.f[14] = NLoginCore_451.D("֒֕պ֢աչզբ֢ռ֥֡ր֊֥ֆտֶնղց֨տր", (byte)125, 68);
                    NLoginCore_238.f[15] = NLoginCore_559.A("ǠǌǉƿǨǃǒǆƵǱǘǗǮƿƽǮǷǿǷǢǐǸǾǅǞǿȅǈǌǊȍǃ", (byte)125, 65);
                    NLoginCore_238.f[16] = NLoginCore_575.E("փ֦֨֒յֱևղք։֔ց", (byte)125, 69);
                    NLoginCore_238.f[17] = NLoginCore_575.B("ƲǒǌƿưƴƶƳǙƸƷǁ", (byte)125, 66);
                    NLoginCore_238.f[18] = NLoginCore_384.C("֧֡ջ֟ց֋֢ջգ֨ը֝խ֤֍հֶ֝ֆ֖֥֒տր", (byte)125, 67);
                    NLoginCore_238.f[19] = NLoginCore_223.F("ֲքօլֳ֋ֱ֪֘֌֐ֶ֧սռ։մֱ֤֍ּչփ֛֊֧։֞׏׆׃ֲ֭׊׏ִ֤֫֕ב֥טג֡", (byte)125, 70);
                    NLoginCore_238.f[20] = NLoginCore_223.B("ƺƳƳǮǎƯǗǫǰǖƻǁ", (byte)125, 66);
                    NLoginCore_238.f[21] = NLoginCore_324.A("ǟǢǇǯƮǆƳƯǯǉǱǳǋƸƶǎǑǙƺƽǛȅǌǍ", (byte)125, 65);
                    NLoginCore_238.f[22] = NLoginCore_559.F("ֲճֶ֔ը֎րօ֛֙ջց", (byte)125, 70);
                    NLoginCore_238.f[23] = NLoginCore_324.B("ǪǋǀǮǖǯǥǩƶǲƲǏƺǽƹǷǣƻǢȆǒǧǠǲǃǊǈǃǬȋǿȃȃǯǔǌȗǓǮǐǧǷǗǡ", (byte)125, 66);
                    NLoginCore_238.f[24] = NLoginCore_110.C("ղրՠ֞եը֣֙ցժ֋ֱ֝֨֒ղև֔ֈֹիָտր", (byte)125, 67);
                    NLoginCore_238.f[25] = NLoginCore_387.D("֎ա՞֞ֈթ֣փթ֣֩խ֤֪֑֯֞կ֧֖֯֒տր", (byte)125, 68);
                    NLoginCore_238.f[26] = NLoginCore_324.C("՗մա֦ևս֫օֆ֛֣֠֎վջկ֧ճք֥ւ֒տր", (byte)125, 67);
                    NLoginCore_238.f[27] = NLoginCore_110.E("֨ծִ֯֐ֈ֌ָ֍֚֍մ֮֩֜־֎ִֵ֮֡֕֌֍", (byte)125, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_238.f[0] = NLoginCore_173.C("գւ֧֤֢ժբչ֧շ֋֍ժ֋ֆռ֟֯֫ճցֹ֤֯օ֙׀ׁ֭պִ֞", (byte)125, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_238.f[0] = NLoginCore_223.F("ցִ֥֣֑֯ծ֥մօ֗֨֍ֽ֭֯֯֏ռֹֹׂׄ֙֜֨ւ֜׏ֺׁ֨", (byte)125, 70);
                }
            }
        }
    }

    static {
        var_int_e = (0 >>> 36 | 0 << -36) & 0xFFFFFFFF;
        p = Long.reverse(-6633926007117835420L);
        q = Long.reverse(0x2800000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = (-1 >>> 227 | -1 << -227) & 0xFFFFFFFF;
        ab = Long.reverse(-8363308264028105884L);
        al = Integer.reverse(Integer.MIN_VALUE);
        ao = Integer.reverse(0);
        ar = 16 >>> 163 | 16 << -163;
        bd = Integer.reverse(-1);
        be = Long.reverse(-8363308264028105884L);
        bf = (12288 >>> 76 | 12288 << ~76 + 1) & 0xFFFFFFFF;
        bh = Long.reverse(-6633926007117835420L);
        bk = Long.reverse(0x2800000000000000L);
        bl = Integer.reverse(-1);
        bn = (0x8000000 >>> 25 | 0x8000000 << ~25 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(-6633926007117835420L);
        br = Long.reverse(0x2800000000000000L);
        bu = Integer.reverse(0);
        bw = Integer.reverse(-1610612736);
        by = Long.reverse(-6633926007117835420L);
        ca = Long.reverse(0x2800000000000000L);
        cb = 8192 >>> 237 | 8192 << -237;
        cc = Integer.reverse(0x60000000);
        cd = Long.reverse(-6633926007117835420L);
        cf = Long.reverse(0x2800000000000000L);
        cg = (0x100000 >>> 211 | 0x100000 << ~211 + 1) & 0xFFFFFFFF;
        ch = Integer.reverse(-536870912);
        ci = Long.reverse(-6633926007117835420L);
        ck = Long.reverse(0x2800000000000000L);
        cm = Integer.reverse(0x10000000);
        cn = Long.reverse(-6633926007117835420L);
        cp = Long.reverse(0x2800000000000000L);
        cr = Integer.reverse(1462763520);
        cs = Integer.reverse(-1879048192);
        cv = Integer.reverse(-1);
        cw = Long.reverse(-8363308264028105884L);
        cy = Integer.reverse(0x50000000);
        cz = Long.reverse(-6633926007117835420L);
        dc = Long.reverse(0x2800000000000000L);
        dd = Integer.reverse(-805306368);
        df = Long.reverse(-6633926007117835420L);
        dg = Long.reverse(0x2800000000000000L);
        dh = Integer.reverse(0x30000000);
        dk = Integer.reverse(-1);
        dm = Long.reverse(-8363308264028105884L);
        dn = Integer.reverse(-1342177280);
        cfr_renamed_1 = (-1 >>> 200 | -1 << ~200 + 1) & 0xFFFFFFFF;
        dp = Long.reverse(-8363308264028105884L);
        dq = 0x1C000000 >>> 249 | 0x1C000000 << ~249 + 1;
        ds = Long.reverse(-6633926007117835420L);
        dv = Long.reverse(0x2800000000000000L);
        dw = Integer.reverse(-268435456);
        dy = Long.reverse(-8363308264028105884L);
        dz = Integer.reverse(0x8000000);
        ea = (-1 >>> 179 | -1 << -179) & 0xFFFFFFFF;
        eb = Long.reverse(-8363308264028105884L);
        ec = Integer.reverse(-1);
        ed = (0x440000 >>> 82 | 0x440000 << ~82 + 1) & 0xFFFFFFFF;
        ee = Long.reverse(-6633926007117835420L);
        ef = Long.reverse(0x2800000000000000L);
        ek = 0 >>> 24 | 0 << ~24 + 1;
        em = Integer.reverse(0x48000000);
        eo = Long.reverse(-6633926007117835420L);
        ep = Long.reverse(0x2800000000000000L);
        eq = (128 >>> 7 | 128 << ~7 + 1) & 0xFFFFFFFF;
        er = Integer.reverse(-939524096);
        es = Long.reverse(-6633926007117835420L);
        et = Long.reverse(0x2800000000000000L);
        eu = (40960 >>> 203 | 40960 << ~203 + 1) & 0xFFFFFFFF;
        ev = Long.reverse(-8363308264028105884L);
        ex = Integer.reverse(-1476395008);
        ez = Long.reverse(-6633926007117835420L);
        fc = Long.reverse(0x2800000000000000L);
        fd = Integer.reverse(0x68000000);
        fe = -1 >>> 112 | -1 << ~112 + 1;
        ff = Long.reverse(-8363308264028105884L);
        fh = (23 >>> 64 | 23 << ~64 + 1) & 0xFFFFFFFF;
        fl = (-1 >>> 36 | -1 << ~36 + 1) & 0xFFFFFFFF;
        fn = Long.reverse(-8363308264028105884L);
        fp = Integer.reverse(-536870912);
        fr = Integer.reverse(0);
        fs = Integer.reverse(0x18000000);
        ft = Long.reverse(-6633926007117835420L);
        fu = Long.reverse(0x2800000000000000L);
        fv = Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1;
        fw = (304 >>> 36 | 304 << ~36 + 1) & 0xFFFFFFFF;
        fz = Integer.reverse(0x40000000);
        gc = (-419430369 >>> 245 | -419430369 << -245) & 0xFFFFFFFF;
        gd = Integer.reverse(-1073741824);
        gg = Integer.reverse(0x20000000);
        gh = (0x40000000 >>> 28 | 0x40000000 << -28) & 0xFFFFFFFF;
        gj = (8 >>> 193 | 8 << -193) & 0xFFFFFFFF;
        gm = Integer.reverse(-1610612736);
        gn = (3072 >>> 137 | 3072 << -137) & 0xFFFFFFFF;
        gq = Integer.reverse(-1744830464);
        gr = Long.reverse(-8363308264028105884L);
        gs = Integer.reverse(0x58000000);
        gt = (-1 >>> 89 | -1 << -89) & 0xFFFFFFFF;
        gu = Long.reverse(-8363308264028105884L);
        gv = (432 >>> 228 | 432 << -228) & 0xFFFFFFFF;
        gx = Long.reverse(-6633926007117835420L);
        ha = Long.reverse(0x2800000000000000L);
        hg = (0x60000000 >>> 253 | 0x60000000 << ~253 + 1) & 0xFFFFFFFF;
        hh = (0x10000000 >>> 249 | 0x10000000 << -249) & 0xFFFFFFFF;
        hi = Long.reverse(-72057594037927936L);
        hj = -2147483637 >>> 254 | -2147483637 << -254;
        hk = 0x1C0000 >>> 48 | 0x1C0000 << ~48 + 1;
        hm = (0xE00000 >>> 83 | 0xE00000 << ~83 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[hk];
        f = new String[hm];
        NLoginCore_238.void_b();
    }

    public NLoginCore_238(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_j, (String)NLoginCore_238.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_238.c("㺃", (int)(y & z), (long)ab), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? al : ao) != 0);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_238.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.E("՗չջ՛տ֖֞֬֘է֥֛֣֩լְֲֳ֑֪֪տ", (byte)115, 69), NLoginCore_238.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.C("ձվսՀրռշր֋պՇօ։ւօ֋Ս࣢ࣖࣥࣈࣘࣇࣅࣆࣝࣃ࣮դ", (byte)115, 67) + string + NLoginCore_138.E("թ", (byte)115, 69) + methodType.toString(), exception);
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        UUID uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_238.c("㺀", (int)eu, (long)ev)));
        OfflinePlayer offlinePlayer = ((Server)this.m.java_lang_Object_b().c()).getOfflinePlayer(uUID);
        this.r = offlinePlayer.getName();
        String string = resultSet.getString((String)NLoginCore_238.c("㺃", (int)ex, (long)(ez ^ fc)));
        byte[] byArray = Base64.getDecoder().decode(resultSet.getString((String)NLoginCore_238.c("㺆", (int)(fd & fe), (long)ff)));
        String string2 = Base64.getEncoder().withoutPadding().encodeToString(byArray);
        Object[] objectArray = new Object[fp];
        objectArray[NLoginCore_238.fr] = NLoginCore_238.c("㺌", (int)fs, (long)(ft ^ fu));
        objectArray[NLoginCore_238.fv] = fw;
        objectArray[NLoginCore_238.fz] = gc;
        objectArray[NLoginCore_238.gd] = gg;
        objectArray[NLoginCore_238.gh] = gj;
        objectArray[NLoginCore_238.gm] = string2;
        objectArray[NLoginCore_238.gn] = string;
        String string3 = String.format((String)NLoginCore_238.c("㺉", (int)(fh & fl), (long)fn), objectArray);
        String string4 = resultSet.getString((String)NLoginCore_238.c("㺏", (int)gq, (long)gr));
        String string5 = NLoginCore_238.a(resultSet.getLong((String)NLoginCore_238.c("㺒", (int)(gs & gt), (long)gu)));
        long l = resultSet.getLong((String)NLoginCore_238.c("㺕", (int)gv, (long)(gx ^ ha)));
        Consumer<ForceRegisterConfig> consumer = ForceRegisterConfig2 -> {
            ForceRegisterConfig2.a(l, l);
            ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().b(string4);
        };
        this.a(this.r, string3, string5, uUID, consumer);
    }
}

