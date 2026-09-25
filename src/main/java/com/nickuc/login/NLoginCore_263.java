/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import java.io.File;
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

public class NLoginCore_263
extends NLoginCore_098 {
    private static long o;
    private static int cy;
    private static long ab;
    private static long cd;
    private static int cj;
    private static long br;
    private static long at;
    private static int cv;
    private static int bz;
    private static long cz;
    private static int cg;
    private static int ce;
    private static long bm;
    private static long p;
    private static int al;
    private static int cr;
    private static long be;
    private static int bw;
    private static int ao;
    private static long cn;
    private static String[] f;
    private static int bp;
    private static int bd;
    private static long cx;
    private static String[] var_java_lang_String_arr_e;
    private static int var_int_e;
    private static long cp;
    private static long bk;
    private static long ci;
    private static int bu;
    private static int db;
    private static int cs;
    private static int bn;
    private static long by;
    private static long ac;
    private static int y;
    private static long cu;
    private static long cw;
    private static long ct;
    private static int cb;
    private static long bh;
    private static int da;
    private static int cm;
    private static int bi;

    public NLoginCore_263(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_B, (String)NLoginCore_263.c("㺀", (int)var_int_e, (long)p), (String)NLoginCore_263.c("㺃", (int)y, (long)(ab ^ ac)));
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

    private static String a(int n, long l) {
        l ^= 0x79L;
        l ^= 0x21D3555FC7C201E2L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(50 + 19), (byte)(24 + 59), (byte)(29 + 18), (byte)(11 + 56), (byte)(30 + 36), (byte)(46 + 21), (byte)(36 + 11), (byte)(20 + 60), (byte)(8 + 67), (byte)(58 + 9), (byte)(76 + 7), (byte)(48 + 5), (byte)(33 + 47), (byte)(59 + 38), (byte)(86 + 14), (byte)(95 + 5), (byte)(20 + 85), (byte)(7 + 103), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), (byte)(50 + 33)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.B("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѦѡїѥљѭѨѱшѶёѲыѲѳ", (byte)14, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_263.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = -7004047707347410664L;
        long l = o ^ 0x21D3555FC7C201E2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83, (byte)(25 + 22), (byte)(59 + 8), (byte)(26 + 40), (byte)(48 + 19), (byte)(19 + 28), (byte)(66 + 14), (byte)(22 + 53), (byte)(41 + 26), (byte)(62 + 21), (byte)(21 + 32), (byte)(72 + 8), (byte)(91 + 6), (byte)(40 + 60), (byte)(78 + 22), (byte)(50 + 55), (byte)(107 + 3), (byte)(59 + 44)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
                    NLoginCore_263.f[0] = NLoginCore_559.C("ԹԄԤՁԛԪԥՇՊԋԏԫԱԏՆՕԤԫԗԲՎ՞ԥԦ", (byte)95, 67);
                    NLoginCore_263.f[1] = NLoginCore_201.C("ԖԌՀՇԏԦԟՅ԰ԢՍԔՈԓԋԹԺԱՍՋ԰ԨԥԦ", (byte)95, 67);
                    NLoginCore_263.f[2] = NLoginCore_091.D("ՂԔԄԼԏԍԉԠԻԍՋԚ", (byte)95, 68);
                    NLoginCore_263.f[3] = NLoginCore_076.B("ŲſƨƘƲƥƩƻƌƬƺƅ", (byte)95, 66);
                    NLoginCore_263.f[4] = NLoginCore_091.E("թճ֖ցրլՙդնճվծ֞Փյփծց֙ն֠֗ծկ", (byte)95, 69);
                    NLoginCore_263.f[5] = NLoginCore_223.C("ԝՀՈԾԍԍՒԼԼԳԥԚ", (byte)95, 67);
                    NLoginCore_263.f[6] = NLoginCore_324.A("ƎƫƙųƭŴƜƘƧƗƪƅ", (byte)95, 65);
                    NLoginCore_263.f[7] = NLoginCore_324.D("ԅԫԇԦԾԧԜԄՔԭՇԚ", (byte)95, 68);
                    NLoginCore_263.f[8] = NLoginCore_446.A("ůųƧƶƥƲƐŶŹŸƺƅ", (byte)95, 65);
                    NLoginCore_263.f[9] = NLoginCore_384.B("ƆƘƮƩƯƍƹƘƈƏſƅ", (byte)95, 66);
                    NLoginCore_263.f[10] = NLoginCore_223.E("ՠղր֓֙օծօծ֝֔գ", (byte)95, 69);
                    NLoginCore_263.f[11] = NLoginCore_027.B("ƂƔƢƵƻƧƐƧƐƿƶƅ", (byte)95, 66);
                    NLoginCore_263.f[12] = NLoginCore_223.E("ՏՑտհխ֚ղ֖֊կ֔գ", (byte)95, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_263.f[0] = NLoginCore_173.D("ԹԄԤՁԛԪԥՇՊԋԍԖԣԎՒՃԘՌՐԳԟԸԥԦ", (byte)95, 68);
                    NLoginCore_263.f[1] = NLoginCore_027.C("ԖԌՀՇԏԦԟՅ԰ԢՌ՗ՂԶՑԔԺԽՙԪՊՎԥԦ", (byte)95, 67);
                    NLoginCore_263.f[2] = NLoginCore_173.D("ԨԺՌԾԋՆԇԑՎԍԔԪԵՒԺԻՕՉԖԞՎԨԥԦ", (byte)95, 68);
                    NLoginCore_263.f[3] = NLoginCore_110.B("ƗƸŮƖŲƄƮƺƜƑƺƅ", (byte)95, 66);
                    NLoginCore_263.f[4] = NLoginCore_027.F("թճ֖ցրլՙդնճվժ֏ճ՜֐ւ֝պպք֧ծկ", (byte)95, 70);
                    NLoginCore_263.f[5] = NLoginCore_223.C("ԴՆԖԇԝԂՆՂՔՋՉԵԷԫԘՖԦԧՕ՘ՌՎԥԦ", (byte)95, 67);
                    NLoginCore_263.f[6] = NLoginCore_091.B("ƍƎŶƱƍƒƨƴźƗƘƅ", (byte)95, 66);
                    NLoginCore_263.f[7] = NLoginCore_446.D("ԨԧԢԎԥՉԺԫՌՇՃՕԲՕՙԺԥՓԘՖՠԸԥԦ", (byte)95, 68);
                    NLoginCore_263.f[8] = NLoginCore_173.D("ԣԡԕԝԬԥՅԑԪԤԌՓՏԒԒՆ՘ՈԚԫՓԨԥԦ", (byte)95, 68);
                    NLoginCore_263.f[9] = NLoginCore_138.F("՞Վծՠՠի֊օֆ։֑լ֓ւ֒մ֢֤ք֕ո֧ծկ", (byte)95, 70);
                    NLoginCore_263.f[10] = NLoginCore_446.B("ƆƨűƇƒƜƴƚƷƜƲƅ", (byte)95, 66);
                    NLoginCore_263.f[11] = NLoginCore_076.F("եփօ֋Օն֗ձլ֜ՙգ", (byte)95, 70);
                    NLoginCore_263.f[12] = NLoginCore_223.E("սևՔ֍ժՙղղլ֍նգ", (byte)95, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_263.f[0] = NLoginCore_004.F("էբօեթղ֘Ք֋֜՜և՘֑֏֖լ֕ջ֛փցծկ", (byte)95, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_263.f[0] = NLoginCore_027.B("ŮƈŲƑƏƨƬƛƉƶƴƓƷźƃƻǂƞƂǈǄƿƴǁƊƻǅƞƚƋƞƮ", (byte)95, 66);
                }
            }
        }
    }

    static {
        var_int_e = (0 >>> 164 | 0 << ~164 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-8753636788947831943L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(1766771940589646713L);
        ac = Long.reverse(-7061644215716937728L);
        al = Integer.reverse(0x40000000);
        ao = Integer.reverse(-1);
        at = Long.reverse(-8753636788947831943L);
        bd = 0x300000 >>> 180 | 0x300000 << ~180 + 1;
        be = Long.reverse(1766771940589646713L);
        bh = Long.reverse(-7061644215716937728L);
        bi = (64 >>> 68 | 64 << -68) & 0xFFFFFFFF;
        bk = Long.reverse(1766771940589646713L);
        bm = Long.reverse(-7061644215716937728L);
        bn = (0xA000000 >>> 153 | 0xA000000 << ~153 + 1) & 0xFFFFFFFF;
        bp = Integer.reverse(-1);
        br = Long.reverse(-8753636788947831943L);
        bu = Integer.reverse(-1);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(-8753636788947831943L);
        bz = Integer.reverse(0);
        cb = Integer.reverse(-536870912);
        cd = Long.reverse(-8753636788947831943L);
        ce = Integer.reverse(Integer.MIN_VALUE);
        cg = (0x400000 >>> 211 | 0x400000 << ~211 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-8753636788947831943L);
        cj = 64 >>> 37 | 64 << ~37 + 1;
        cm = 144 >>> 164 | 144 << -164;
        cn = Long.reverse(1766771940589646713L);
        cp = Long.reverse(-7061644215716937728L);
        cr = Integer.reverse(-1073741824);
        cs = -2147483646 >>> 126 | -2147483646 << -126;
        ct = Long.reverse(1766771940589646713L);
        cu = Long.reverse(-7061644215716937728L);
        cv = Integer.reverse(-805306368);
        cw = Long.reverse(1766771940589646713L);
        cx = Long.reverse(-7061644215716937728L);
        cy = Integer.reverse(0x30000000);
        cz = Long.reverse(-8753636788947831943L);
        da = (-805306368 >>> 252 | -805306368 << -252) & 0xFFFFFFFF;
        db = Integer.reverse(-1342177280);
        var_java_lang_String_arr_e = new String[da];
        f = new String[db];
        NLoginCore_263.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_263.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)88, 67), NLoginCore_263.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.E("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փ࣐࣒ࣦࣟࣚࣞ࣡࣪ࣁ࣯࣊࣫ࣄ࣫࣬ծ", (byte)88, 69) + string + NLoginCore_427.B("ũ", (byte)88, 66) + methodType.toString(), exception);
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        File file = new File(this.java_io_File_b(), (String)NLoginCore_263.c("㺀", (int)(al & ao), (long)at));
        this.d = NLoginCore_586.a(this.m, file, new Properties());
    }
}

