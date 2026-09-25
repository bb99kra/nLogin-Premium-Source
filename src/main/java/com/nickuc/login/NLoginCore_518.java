/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
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
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_518
extends NLoginCore_098 {
    private static int bw;
    private static long at;
    private static long fi;
    private static long ft;
    private static long eo;
    private static int cg;
    private static long dc;
    private static int cj;
    private static long cd;
    private static int bd;
    private static String[] var_java_lang_String_arr_e;
    private static long fn;
    private static long p;
    private static int fh;
    private static long bm;
    private static int cv;
    private static long dv;
    private boolean E = al;
    private static int bu;
    private static long bk;
    private static long bs;
    private static int cy;
    private static long cn;
    private static long fo;
    private static int fb;
    private static int bn;
    private static long ds;
    private static String[] f;
    private static int ed;
    private static int ea;
    private static long fq;
    private static int gc;
    private static int ao;
    private static long gb;
    private static long ff;
    private static int ek;
    private static long cx;
    private static int fl;
    private static long cp;
    private static int gg;
    private static int ey;
    private static long ct;
    private static int fv;
    private static long ci;
    private static long by;
    private static int fw;
    private static long ab;
    private static long ca;
    private static int ec;
    private static int fz;
    private static int al;
    private static int bp;
    private static int cm;
    private static int dz;
    private static long cf;
    private static int fa;
    private static long ga;
    private static long gf;
    private static int var_int_e;
    private static int dq;
    private static long br;
    private static int bi;
    private static long cw;
    private static int dt;
    private static long dj;
    private static int dk;
    private static long q;
    private static long dp;
    private static int dd;
    private static long el;
    private static long dy;
    private static long fc;
    private static int fp;
    private static int ex;
    private static int cr;
    private static int y;
    private static long cz;
    private static long be;
    private static long bh;
    private static int eu;
    private static long di;
    private static int ch;
    private static long dm;
    private static int eq;
    private static long df;
    private static long ge;
    private static long fj;
    private static int dh;
    private static int ar;
    private static int gh;
    private static int de;
    private static int fd;
    private static int cc;
    private static int cb;
    private static long es;
    private static long o;

    private static String a(int n, long l) {
        l ^= 0x54L;
        l ^= 0xB16BF5398C4BF262L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(68 + 1), (byte)(7 + 76), 47, (byte)(49 + 18), (byte)(13 + 53), (byte)(29 + 38), (byte)(15 + 32), (byte)(79 + 1), (byte)(32 + 43), (byte)(20 + 47), (byte)(32 + 51), (byte)(52 + 1), (byte)(21 + 59), (byte)(49 + 48), (byte)(75 + 25), (byte)(78 + 22), 105, (byte)(18 + 92), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.B("ƒƟƞšơƝƘơƬƛŨƦƪƣƦƬŮԃԊӽӹԇӥӻӛԄ", (byte)88, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_518.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected File java_io_File_b() {
        if (this.m.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c) {
            return new File(this.m.java_io_File_c().getParentFile().getParentFile(), (String)NLoginCore_518.c("㺀", (int)(ao & ar), (long)at));
        }
        return super.java_io_File_b();
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(-8583924120314102077L);
        q = Long.reverse(0x2A00000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(-6710426675327975741L);
        al = (0 >>> 8 | 0 << ~8 + 1) & 0xFFFFFFFF;
        ao = (512 >>> 136 | 512 << ~136 + 1) & 0xFFFFFFFF;
        ar = Integer.reverse(-1);
        at = Long.reverse(-6710426675327975741L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-8583924120314102077L);
        bh = Long.reverse(0x2A00000000000000L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(-8583924120314102077L);
        bm = Long.reverse(0x2A00000000000000L);
        bn = Integer.reverse(-1);
        bp = (81920 >>> 78 | 81920 << -78) & 0xFFFFFFFF;
        br = Long.reverse(-8583924120314102077L);
        bs = Long.reverse(0x2A00000000000000L);
        bu = Integer.reverse(0);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(-8583924120314102077L);
        ca = Long.reverse(0x2A00000000000000L);
        cb = (0x100000 >>> 180 | 0x100000 << ~180 + 1) & 0xFFFFFFFF;
        cc = (28 >>> 2 | 28 << -2) & 0xFFFFFFFF;
        cd = Long.reverse(-8583924120314102077L);
        cf = Long.reverse(0x2A00000000000000L);
        cg = 0x100000 >>> 241 | 0x100000 << -241;
        ch = (-1 >>> 157 | -1 << ~157 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-6710426675327975741L);
        cj = -2147482822 >>> 222 | -2147482822 << ~222 + 1;
        cm = (0x40000002 >>> 222 | 0x40000002 << -222) & 0xFFFFFFFF;
        cn = Long.reverse(-8583924120314102077L);
        cp = Long.reverse(0x2A00000000000000L);
        cr = Integer.reverse(0x50000000);
        ct = Long.reverse(-6710426675327975741L);
        cv = Integer.reverse(-805306368);
        cw = Long.reverse(-8583924120314102077L);
        cx = Long.reverse(0x2A00000000000000L);
        cy = Integer.reverse(0x30000000);
        cz = Long.reverse(-8583924120314102077L);
        dc = Long.reverse(0x2A00000000000000L);
        dd = Integer.reverse(-1342177280);
        de = (-1 >>> 71 | -1 << ~71 + 1) & 0xFFFFFFFF;
        df = Long.reverse(-6710426675327975741L);
        dh = (917504 >>> 144 | 917504 << ~144 + 1) & 0xFFFFFFFF;
        di = Long.reverse(-8583924120314102077L);
        dj = Long.reverse(0x2A00000000000000L);
        dk = Integer.reverse(-268435456);
        dm = Long.reverse(-8583924120314102077L);
        dp = Long.reverse(0x2A00000000000000L);
        dq = Integer.reverse(0x8000000);
        ds = Long.reverse(-6710426675327975741L);
        dt = (0x11000000 >>> 184 | 0x11000000 << -184) & 0xFFFFFFFF;
        dv = Long.reverse(-8583924120314102077L);
        dy = Long.reverse(0x2A00000000000000L);
        dz = (0x100000 >>> 148 | 0x100000 << -148) & 0xFFFFFFFF;
        ea = Integer.reverse(0x74000000);
        ec = Integer.reverse(0);
        ed = Integer.reverse(Integer.MIN_VALUE);
        ek = Integer.reverse(0x48000000);
        el = Long.reverse(-8583924120314102077L);
        eo = Long.reverse(0x2A00000000000000L);
        eq = Integer.reverse(-939524096);
        es = Long.reverse(-6710426675327975741L);
        eu = Integer.reverse(Integer.MIN_VALUE);
        ex = Integer.reverse(0x74000000);
        ey = Integer.reverse(0);
        fa = 524288 >>> 115 | 524288 << ~115 + 1;
        fb = Integer.reverse(0x28000000);
        fc = Long.reverse(-6710426675327975741L);
        fd = Integer.reverse(-1476395008);
        ff = Long.reverse(-6710426675327975741L);
        fh = Integer.reverse(0x68000000);
        fi = Long.reverse(-8583924120314102077L);
        fj = Long.reverse(0x2A00000000000000L);
        fl = Integer.reverse(-402653184);
        fn = Long.reverse(-8583924120314102077L);
        fo = Long.reverse(0x2A00000000000000L);
        fp = -2147483647 >>> 124 | -2147483647 << ~124 + 1;
        fq = Long.reverse(-8583924120314102077L);
        ft = Long.reverse(0x2A00000000000000L);
        fv = Integer.reverse(0x40000000);
        fw = (393216 >>> 145 | 393216 << ~145 + 1) & 0xFFFFFFFF;
        fz = (0x6400000 >>> 214 | 0x6400000 << ~214 + 1) & 0xFFFFFFFF;
        ga = Long.reverse(-8583924120314102077L);
        gb = Long.reverse(0x2A00000000000000L);
        gc = Integer.reverse(0x58000000);
        ge = Long.reverse(-8583924120314102077L);
        gf = Long.reverse(0x2A00000000000000L);
        gg = Integer.reverse(-671088640);
        gh = Integer.reverse(-671088640);
        var_java_lang_String_arr_e = new String[gg];
        f = new String[gh];
        NLoginCore_518.void_b();
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

    private static void void_b() {
        int n;
        o = -4360430295273178351L;
        long l = o ^ 0xB16BF5398C4BF262L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), 69, (byte)(57 + 26), 47, (byte)(18 + 49), (byte)(4 + 62), (byte)(38 + 29), (byte)(10 + 37), (byte)(66 + 14), (byte)(20 + 55), (byte)(52 + 15), (byte)(15 + 68), (byte)(27 + 26), (byte)(6 + 74), (byte)(74 + 23), (byte)(10 + 90), (byte)(45 + 55), (byte)(19 + 86), (byte)(49 + 61), (byte)(60 + 43)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_518.f[0] = NLoginCore_138.E("յ֝թ֚֝՛֝հփ՞֚չ֊֙քսժզէ֌ֲ֦չպ", (byte)106, 69);
                    NLoginCore_518.f[1] = NLoginCore_324.D("ԽԹՈՌՈԣՇԿԼՁՁՇթնԳ՛՚ձԺՙյՙՆՇ", (byte)106, 68);
                    NLoginCore_518.f[2] = NLoginCore_201.F("Ֆ՞֘՜֢֥մֆև֧֚ծ", (byte)106, 70);
                    NLoginCore_518.f[3] = NLoginCore_004.D("ՈԭՆԬգաՐՍՈՎԲԯԷԫԲձթՕՎՇցտՆՇ", (byte)106, 68);
                    NLoginCore_518.f[4] = NLoginCore_446.B("ƻǉƊƤǃƐƩƠƼƟǈƛ", (byte)106, 66);
                    NLoginCore_518.f[5] = NLoginCore_384.F("։ս֎ի֏֓՝ց֔ց֛ծ", (byte)106, 70);
                    NLoginCore_518.f[6] = NLoginCore_575.F("պ՟֌֣֖֗֡ադ֐֣ծ", (byte)106, 70);
                    NLoginCore_518.f[7] = NLoginCore_559.B("ƟǌƙƎƠǀƞƨƔƓǇƎƦǙǍǐƫƦƻǇƾǓǟǕǙǀƴǟưǙơǌ", (byte)106, 66);
                    NLoginCore_518.f[8] = NLoginCore_324.B("ƨƍƦƌǃǁưƭƨƮƒƖǐǁƴƦǋƔƲƱǎƩƦƧ", (byte)106, 66);
                    NLoginCore_518.f[9] = NLoginCore_427.A("ƨƍƦƌǃǁưƭƨƮƑǍǅƣǊƤƗǉǚƽƼƮǡƴǖǑǎƻƿƷǔƤ", (byte)106, 65);
                    NLoginCore_518.f[10] = NLoginCore_091.B("ƨƍƦƌǃǁưƭƨƮƓƑǂƫƫƶƺǘƬƙǝƹǠƢǅƟǟƤƟƥƽǚ", (byte)106, 66);
                    NLoginCore_518.f[11] = NLoginCore_575.A("ƨƍƦƌǃǁưƭƨƮƒǃƔǗƯǚƶǖǜǚƙƹƦƧ", (byte)106, 65);
                    NLoginCore_518.f[12] = NLoginCore_453.F("ջՠչ՟֖֔փրջցզ֘շթզժք֊֑֫֯֠֍ձձ֒յִָֻ֜֞", (byte)106, 70);
                    NLoginCore_518.f[13] = NLoginCore_384.A("ƨƍƦƌǃǁưƭƨƮƔơǑưǓƗǝƾƪƹƲǙǐǣƽǁǗǟǛǘƵǄ", (byte)106, 65);
                    NLoginCore_518.f[14] = NLoginCore_027.D("գԼԺԬՆ՟ՠգՂյըԻ", (byte)106, 68);
                    NLoginCore_518.f[15] = NLoginCore_173.A("ƌƮƫƚǐǌƈǎǉƬƕƮƊƩƌƤǉƚǔƙƭƳǗǋƼǢǏǆƞƢǧƴǈǈǆǚǏƣǬǅǜǋƾǦƱǑǎǖǪǖǖƺǀǉǆǇ", (byte)106, 65);
                    NLoginCore_518.f[16] = NLoginCore_559.C("՘՜դխգկԼԬԭՈԱԻ", (byte)106, 67);
                    NLoginCore_518.f[17] = NLoginCore_110.C("զ՘զՏՈժՓԮլՒՆԻ", (byte)106, 67);
                    NLoginCore_518.f[18] = NLoginCore_451.B("ƼƖƝƋƏǍǅǌƿǔǄƛ", (byte)106, 66);
                    NLoginCore_518.f[19] = NLoginCore_027.D("Ս՗ԪԡՆԱՆհՋյԵՓՓՕՉՆ՝չնչպՙՆՇ", (byte)106, 68);
                    NLoginCore_518.f[20] = NLoginCore_575.F("֚ՠ֡փք֞՜փկ֖֔֔ց֡֬֎֧֟իֆ֪֌չպ", (byte)106, 70);
                    NLoginCore_518.f[21] = NLoginCore_223.A("ǄƕƛƯƘƣƎǉƧƽǗƿƲǅƮǖƯƸǘƜƗƩƦƧ", (byte)106, 65);
                    NLoginCore_518.f[22] = NLoginCore_559.E("տՖ՜Քկւ֦֒ևղցծ", (byte)106, 69);
                    NLoginCore_518.f[23] = NLoginCore_173.D("ԻՖԩէդՌեՅ՞ԿԱԻ", (byte)106, 68);
                    NLoginCore_518.f[24] = NLoginCore_559.A("ƛƉƣƅƎƮƱƞƎǀƞƛ", (byte)106, 65);
                    NLoginCore_518.f[25] = NLoginCore_091.C("ԸբԿՉԾ՟ԯՓԳաԲթգէՊխշնՎԿԽՉՆՇ", (byte)106, 67);
                    NLoginCore_518.f[26] = NLoginCore_027.D("ժԵկ՛ԢժՋժՔնՖԻ", (byte)106, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_518.f[0] = NLoginCore_027.B("ƢǊƖǊǇƈǊƝưƋǄǕƶǍƣǔƻǑǚǓǀƩƦƧ", (byte)106, 66);
                    NLoginCore_518.f[1] = NLoginCore_091.A("ƝƙƨƬƨƃƧƟƜơƞơƫƵǈƩƺǗƙǟƻǑƘƿǣǎƱǨǤǩƼǡ", (byte)106, 65);
                    NLoginCore_518.f[2] = NLoginCore_201.C("Ձԭլ՗ԩԾժՌՍԳըԻ", (byte)106, 67);
                    NLoginCore_518.f[3] = NLoginCore_110.F("ջՠչ՟֖֔փրջցդ֟֋փ֠պ֙չջ֧ղְ֋ղ֥֚֡ֈշ֊ջ֓", (byte)106, 70);
                    NLoginCore_518.f[4] = NLoginCore_384.F("՜ռ֗՚֣տչ՝֕գգջ֝դ֪֋է֥իլփ֢չպ", (byte)106, 70);
                    NLoginCore_518.f[5] = NLoginCore_223.C("ԾԪՠԹՈկՇ՞՝ՁեՈՏՑՅռՕճԴնՍտՆՇ", (byte)106, 67);
                    NLoginCore_518.f[6] = NLoginCore_092.E("թպ՘՜Օ֛վօ֏֛՟բյտ՟ե֑֣֡֫֊ֲչպ", (byte)106, 69);
                    NLoginCore_518.f[7] = NLoginCore_004.B("ƟǌƙƎƠǀƞƨƔƓǇƎƦǙǍǐƫƦƻǇƾǝưǜƣƹǡƦǇǁƴǥ", (byte)106, 66);
                    NLoginCore_518.f[8] = NLoginCore_138.B("ƨƍƦƌǃǁưƭƨƮƔƗƸƓƖǐǜƱǑƽǒƴǎǎǥǄƯƶǢƻƷƵ", (byte)106, 66);
                    NLoginCore_518.f[9] = NLoginCore_223.D("ՈԭՆԬգաՐՍՈՎԱխեՃժՄԷթպ՝՜՘Թի՚Լդ՗։ռՆճ", (byte)106, 68);
                    NLoginCore_518.f[10] = NLoginCore_446.E("ջՠչ՟֖֔փրջցզդ֕վվ։֍֫տլְֶ֟ևն֨֘֎֕նֵ֜", (byte)106, 69);
                    NLoginCore_518.f[11] = NLoginCore_027.B("ƨƍƦƌǃǁưƭƨƮƒƑƳǙǅƸưǎƮƮǐǒǎƺǜƵǁǓǂƟƜƣ", (byte)106, 66);
                    NLoginCore_518.f[12] = NLoginCore_575.C("ՈԭՆԬգաՐՍՈՎԳեՄԶԳԷՑ՗ոռ՞ՠՂԼւխՄփ՗ՙՆլ", (byte)106, 67);
                    NLoginCore_518.f[13] = NLoginCore_387.E("ջՠչ՟֖֔փրջցէմ֤փ֦ժְ֑ս֌օ֪֢֓֍ֺ֣յֶ֐֫ֈ", (byte)106, 69);
                    NLoginCore_518.f[14] = NLoginCore_427.B("ǀǄǇƞƉǐƉƋǏƵƲơǃưƸƖǆƳǛƷƬƹƦƧ", (byte)106, 66);
                    NLoginCore_518.f[15] = NLoginCore_201.B("ƌƮƫƚǐǌƈǎǉƬƕƮƊƩƌƤǉƚǔƙƭƳǗǋƼǢǏǆƞƢǧƴǈǈǆǚǏƣǬǅǜǋǁǔǤǚǪǸǬǻǚǚǯǯǆǇ", (byte)106, 66);
                    NLoginCore_518.f[16] = NLoginCore_559.C("ԢծՌԼԾԣԪՇԫՊմԻ", (byte)106, 67);
                    NLoginCore_518.f[17] = NLoginCore_201.B("ƝƊƋƧƜǅǒƉƎǁƌƳǓƒǍǇƛƏƘǓƽǏƦƧ", (byte)106, 66);
                    NLoginCore_518.f[18] = NLoginCore_092.D("ԵԻծԨԢ՝Փմՠդ԰լՇՊԴՌ՗ԷվԱժՉՆՇ", (byte)106, 68);
                    NLoginCore_518.f[19] = NLoginCore_092.C("Ս՗ԪԡՆԱՆհՋյԶկԮնԺդղխ՟շՕՙՆՇ", (byte)106, 67);
                    NLoginCore_518.f[20] = NLoginCore_091.B("ǇƍǎưƱǋƉưƜǃǂƷƴƭǘƔǅƝƵƫƞƹƦƧ", (byte)106, 66);
                    NLoginCore_518.f[21] = NLoginCore_091.D("դԵԻՏԸՃԮթՇ՝նԴչլիՕՙ՚ԾչյՙՆՇ", (byte)106, 68);
                    NLoginCore_518.f[22] = NLoginCore_201.B("ƺơƘƸƼǑƺƤǏƍƕƛ", (byte)106, 66);
                    NLoginCore_518.f[23] = NLoginCore_201.E("՚֗֐֔բձկ՘֜֕ՠդնեְ֪֤֚ֈտճ֢չպ", (byte)106, 69);
                    NLoginCore_518.f[24] = NLoginCore_201.D("Ո՜գիԫԣՁդբԾԵԻ", (byte)106, 68);
                    NLoginCore_518.f[25] = NLoginCore_091.F("ի֕ղռձ֒բֆզ֔ե֛զռշժֱ֣ը֜ճռչպ", (byte)106, 70);
                    NLoginCore_518.f[26] = NLoginCore_027.E("ղ֐֢֝֍վֆևմՠ֛ծ", (byte)106, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_518.f[0] = NLoginCore_387.F("՛խ֙րհ֔՗ո֖ճ֩րճ֠գ֊։֛վ֒֜ռչպ", (byte)106, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_518.f[0] = NLoginCore_384.B("ƥƿƧƺǂƈƪƽƵƪƈƵƑƥƴǋƎƾƕǚƱƹƦƧ", (byte)106, 66);
                }
            }
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        String string;
        this.r = resultSet.getString((String)NLoginCore_518.c("㺀", (int)dq, (long)ds));
        String string2 = resultSet.getString((String)NLoginCore_518.c("㺃", (int)dt, (long)(dv ^ dy)));
        if (!string2.isEmpty() && string2.charAt(string2.length() - dz) == ea) {
            string2 = string2.substring(ec, string2.length() - ed);
        }
        UUID uUID = NLoginCore_432.c(string2);
        boolean bl = resultSet.getBoolean((String)NLoginCore_518.c("㺆", (int)ek, (long)(el ^ eo)));
        String string3 = resultSet.getString((String)NLoginCore_518.c("㺉", (int)eq, (long)es));
        if (!string3.isEmpty() && string3.charAt(string3.length() - eu) == ex) {
            string3 = string3.substring(ey, string3.length() - fa);
        }
        UUID uUID2 = bl ? NLoginCore_432.c(string3) : null;
        String string4 = string = resultSet.getBoolean((String)NLoginCore_518.c("㺌", (int)fb, (long)fc)) ? resultSet.getString((String)NLoginCore_518.c("㺏", (int)fd, (long)ff)) : null;
        if (string != null && !string.startsWith((String)NLoginCore_518.c("㺒", (int)fh, (long)(fi ^ fj)))) {
            if (string.startsWith((String)NLoginCore_518.c("㺕", (int)fl, (long)(fn ^ fo)))) {
                String[] stringArray = string.split((String)NLoginCore_518.c("㺘", (int)fp, (long)(fq ^ ft)));
                String string5 = stringArray[fv];
                String string6 = stringArray[fw];
                string = (String)NLoginCore_518.c("㺛", (int)fz, (long)(ga ^ gb)) + string6 + (String)NLoginCore_518.c("㺞", (int)gc, (long)(ge ^ gf)) + string5;
            } else {
                this.e(this.r, string, null);
                return;
            }
        }
        if (this.E && bl && uUID2 != null) {
            uUID = uUID2;
        }
        if (bl) {
            this.a(this.r, string, null, uUID, uUID2);
        } else {
            this.a(this.r, string, null, uUID);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_518.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("ңӅӇҧӋӪӢӸӤҳӱӧӵӯҸӝӿӾӶӼӶӋ", (byte)66, 67), NLoginCore_518.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("ածխ԰հլէհջժԷյչղյջԽ࣒ࣙ࣌ࣈࣖࢴ࣊ࢪ࣓Ւ", (byte)66, 69) + string + NLoginCore_091.B("Ľ", (byte)66, 66) + methodType.toString(), exception);
        }
    }

    public NLoginCore_518(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_r, (String)NLoginCore_518.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_518.c("㺃", (int)y, (long)ab));
    }
}

