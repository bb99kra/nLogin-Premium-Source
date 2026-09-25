/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
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
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_093
extends NLoginCore_098 {
    private static int fb;
    private static int cr;
    private static long eo;
    private static int en;
    private static long cn;
    private static int eu;
    private static long cf;
    private static int dn;
    private static long ab;
    private static int ex;
    private static long cx;
    private static int bu;
    private static long ee;
    private static int er;
    private static long fx;
    private static int da;
    private static long cw;
    private static long gi;
    private static int ec;
    private static long p;
    private static long ds;
    private static int bp;
    private static long ca;
    private static long gb;
    private static int bw;
    private static long ct;
    private static long di;
    private static long dm;
    private static int cv;
    private static long dy;
    private static long fn;
    private static int var_int_e;
    private static long cu;
    private static long ga;
    private static long fq;
    private static long bm;
    private static int gh;
    private static int fv;
    private static int dk;
    private static int bn;
    private static int bd;
    private static long bh;
    private static int bf;
    private static long gf;
    private static int ek;
    private static long by;
    private static long o;
    private static String[] f;
    private static int y;
    private static int gd;
    private static int eq;
    private static long br;
    private static int dh;
    private static long gk;
    private static int dq;
    private static int fl;
    private static long ge;
    private static long eb;
    private static long cd;
    private static int cb;
    private static int cy;
    private static int z;
    private static int cm;
    private static long ft;
    private static int fh;
    private static int cc;
    private static int al;
    private static int fa;
    private static int ey;
    private static int dz;
    private static int bi;
    private static int dr;
    private static int gg;
    private static int fe;
    private static long dc;
    private static long cp;
    private static int em;
    private static int bl;
    private static long fc;
    private static int du;
    private static long df;
    private static int gq;
    private static int cg;
    private static int gc;
    private static long at;
    private static int bj;
    private static String[] var_java_lang_String_arr_e;
    private static long es;
    private static int gn;
    private static int fp;
    private static int fw;
    private static long dp;
    private static long bs;
    private static long ci;
    private static int dw;
    private static long ff;
    private static int fd;
    private static int m;
    private static int cj;
    private static int dt;
    private static int fz;
    private static int ed;
    private static int ch;
    private static long ez;
    private static int fr;
    private static int gm;

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
    protected NLoginCore_171 a(NLoginCore_459 NLoginCore_459) {
        return NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_093.c("㺀", (int)(fa & fb), (long)fc) + this.P + (String)NLoginCore_093.c("㺃", (int)(fd & fe), (long)ff), new Object[fh]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_093.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.F("Ի՝՟Կգւպ֐ռՋ։տ֍ևՐյ֖֗֎֔֎գ", (byte)87, 70), NLoginCore_093.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.C("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹ࢑ࡧࢅࢂࢌࢊࢎࢇࢌ࢙ࡩࡹࡷࢀԓ", (byte)87, 67) + string + NLoginCore_091.F("Ս", (byte)87, 70) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x4DL;
        l ^= 0xE0C80C2B3CA5093DL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(21 + 48), (byte)(27 + 56), (byte)(25 + 22), (byte)(51 + 16), (byte)(40 + 26), (byte)(59 + 8), 47, 80, (byte)(41 + 34), (byte)(37 + 30), (byte)(20 + 63), (byte)(47 + 6), (byte)(61 + 19), (byte)(91 + 6), (byte)(84 + 16), (byte)(46 + 54), (byte)(103 + 2), (byte)(70 + 40), (byte)(57 + 46)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖ࠮ࠄࠢࠟࠩࠧࠫࠤࠩ࠶ࠆࠖࠔࠝ", (byte)54, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_093.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_093(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_q, (String)NLoginCore_093.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_093.c("㺃", (int)(y & z), (long)ab));
    }

    static {
        var_int_e = (0 >>> 121 | 0 << ~121 + 1) & 0xFFFFFFFF;
        m = -1 >>> 95 | -1 << -95;
        p = Long.reverse(-5085607933408232490L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(-1);
        ab = Long.reverse(-5085607933408232490L);
        al = (0x800000 >>> 182 | 0x800000 << ~182 + 1) & 0xFFFFFFFF;
        at = Long.reverse(-5085607933408232490L);
        bd = (48 >>> 36 | 48 << -36) & 0xFFFFFFFF;
        bf = Integer.reverse(-1);
        bh = Long.reverse(-5085607933408232490L);
        bi = -1 >>> 37 | -1 << ~37 + 1;
        bj = (131072 >>> 143 | 131072 << ~143 + 1) & 0xFFFFFFFF;
        bl = Integer.reverse(-1);
        bm = Long.reverse(-5085607933408232490L);
        bn = Integer.reverse(0);
        bp = 0x40000001 >>> 30 | 0x40000001 << ~30 + 1;
        br = Long.reverse(823114777701858262L);
        bs = Long.reverse(-5620492334958379008L);
        bu = 2 >>> 193 | 2 << ~193 + 1;
        bw = 96 >>> 100 | 96 << ~100 + 1;
        by = Long.reverse(823114777701858262L);
        ca = Long.reverse(-5620492334958379008L);
        cb = 32768 >>> 238 | 32768 << -238;
        cc = Integer.reverse(-536870912);
        cd = Long.reverse(823114777701858262L);
        cf = Long.reverse(-5620492334958379008L);
        cg = 0xC00000 >>> 86 | 0xC00000 << -86;
        ch = Integer.reverse(0x10000000);
        ci = Long.reverse(-5085607933408232490L);
        cj = (0x2000000 >>> 151 | 0x2000000 << -151) & 0xFFFFFFFF;
        cm = (0x1200000 >>> 53 | 0x1200000 << -53) & 0xFFFFFFFF;
        cn = Long.reverse(823114777701858262L);
        cp = Long.reverse(-5620492334958379008L);
        cr = Integer.reverse(0x50000000);
        ct = Long.reverse(823114777701858262L);
        cu = Long.reverse(-5620492334958379008L);
        cv = Integer.reverse(-805306368);
        cw = Long.reverse(823114777701858262L);
        cx = Long.reverse(-5620492334958379008L);
        cy = (0 >>> 228 | 0 << -228) & 0xFFFFFFFF;
        da = Integer.reverse(0x30000000);
        dc = Long.reverse(823114777701858262L);
        df = Long.reverse(-5620492334958379008L);
        dh = 0x340000 >>> 82 | 0x340000 << ~82 + 1;
        di = Long.reverse(-5085607933408232490L);
        dk = Integer.reverse(0x70000000);
        dm = Long.reverse(-5085607933408232490L);
        dn = 1920 >>> 167 | 1920 << -167;
        dp = Long.reverse(-5085607933408232490L);
        dq = (1 >>> 28 | 1 << -28) & 0xFFFFFFFF;
        dr = Integer.reverse(-1);
        ds = Long.reverse(-5085607933408232490L);
        dt = Integer.reverse(-65536);
        du = (0x20000002 >>> 253 | 0x20000002 << ~253 + 1) & 0xFFFFFFFF;
        dw = Integer.reverse(-1);
        dy = Long.reverse(-5085607933408232490L);
        dz = Integer.reverse(0x48000000);
        eb = Long.reverse(-5085607933408232490L);
        ec = (-1 >>> 238 | -1 << -238) & 0xFFFFFFFF;
        ed = 19456 >>> 10 | 19456 << ~10 + 1;
        ee = Long.reverse(-5085607933408232490L);
        ek = 0 >>> 162 | 0 << ~162 + 1;
        em = 0x14000000 >>> 24 | 0x14000000 << ~24 + 1;
        en = Integer.reverse(-1);
        eo = Long.reverse(-5085607933408232490L);
        eq = (0x100000 >>> 148 | 0x100000 << -148) & 0xFFFFFFFF;
        er = 172032 >>> 77 | 172032 << ~77 + 1;
        es = Long.reverse(-5085607933408232490L);
        eu = Integer.reverse(0x40000000);
        ex = Integer.reverse(0x68000000);
        ey = (-1 >>> 74 | -1 << ~74 + 1) & 0xFFFFFFFF;
        ez = Long.reverse(-5085607933408232490L);
        fa = 94208 >>> 44 | 94208 << -44;
        fb = Integer.reverse(-1);
        fc = Long.reverse(-5085607933408232490L);
        fd = Integer.reverse(0x18000000);
        fe = Integer.reverse(-1);
        ff = Long.reverse(-5085607933408232490L);
        fh = Integer.reverse(0);
        fl = (0x20000003 >>> 189 | 0x20000003 << ~189 + 1) & 0xFFFFFFFF;
        fn = Long.reverse(-5085607933408232490L);
        fp = Integer.reverse(0x58000000);
        fq = Long.reverse(-5085607933408232490L);
        fr = (54 >>> 1 | 54 << -1) & 0xFFFFFFFF;
        ft = Long.reverse(-5085607933408232490L);
        fv = 3584 >>> 7 | 3584 << -7;
        fw = (-1 >>> 24 | -1 << -24) & 0xFFFFFFFF;
        fx = Long.reverse(-5085607933408232490L);
        fz = 0x3A0000 >>> 209 | 0x3A0000 << ~209 + 1;
        ga = Long.reverse(823114777701858262L);
        gb = Long.reverse(-5620492334958379008L);
        gc = (-1 >>> 14 | -1 << -14) & 0xFFFFFFFF;
        gd = Integer.reverse(0x78000000);
        ge = Long.reverse(823114777701858262L);
        gf = Long.reverse(-5620492334958379008L);
        gg = Integer.reverse(0);
        gh = Integer.reverse(-134217728);
        gi = Long.reverse(823114777701858262L);
        gk = Long.reverse(-5620492334958379008L);
        gm = (0x8000000 >>> 187 | 0x8000000 << -187) & 0xFFFFFFFF;
        gn = (128 >>> 2 | 128 << ~2 + 1) & 0xFFFFFFFF;
        gq = Integer.reverse(0x4000000);
        var_java_lang_String_arr_e = new String[gn];
        f = new String[gq];
        NLoginCore_093.void_b();
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

    private static void void_b() {
        int n;
        o = 7772318499322607312L;
        long l = o ^ 0xE0C80C2B3CA5093DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(67 + 2), (byte)(79 + 4), (byte)(36 + 11), (byte)(65 + 2), (byte)(42 + 24), (byte)(35 + 32), (byte)(26 + 21), (byte)(64 + 16), (byte)(6 + 69), (byte)(25 + 42), (byte)(52 + 31), (byte)(23 + 30), (byte)(35 + 45), (byte)(44 + 53), 100, 100, (byte)(47 + 58), (byte)(45 + 65), (byte)(57 + 46)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_093.f[0] = NLoginCore_427.C("҈ѼҮҏѻѻѾҞҘѾҏҥҳҒѿҽ҂ҕӋ҅ҋӎҕҖ", (byte)47, 67);
                    NLoginCore_093.f[1] = NLoginCore_027.D("ѺҴҼҍѼҘӀҖѾҗҺҕѽҝҁҷҕңӅҘӀҨҕҖ", (byte)47, 68);
                    NLoginCore_093.f[2] = NLoginCore_427.F("ՙգՔԱ՜ՔէաԬ՝՛հթԱՍգԴձլզզՁի՗Ցն՛կՏՀցՐղբ՟ռոօ՜ճքխՉՓ", (byte)47, 70);
                    NLoginCore_093.f[3] = NLoginCore_223.C("ҮѺҩҷҠҽҐҀҺӃҳҊ", (byte)47, 67);
                    NLoginCore_093.f[4] = NLoginCore_091.D("ҮѺҩҷҠҽҐҀҺӃҳҊ", (byte)47, 68);
                    NLoginCore_093.f[5] = NLoginCore_427.E("ԽԜգԿ՝՛դե՟ՍՆԳ", (byte)47, 69);
                    NLoginCore_093.f[6] = NLoginCore_384.E("ԵՔբԣՆՂԿդԩխ՜Գ", (byte)47, 69);
                    NLoginCore_093.f[7] = NLoginCore_110.A("ġĉĭŎłŕŐŎŜŔĨĥ", (byte)47, 65);
                    NLoginCore_093.f[8] = NLoginCore_559.C("ҋҽҌҽҺѾҰңӁӃҟҤ҅ѾҀӉӌҸқҩӀҨҕҖ", (byte)47, 67);
                    NLoginCore_093.f[9] = NLoginCore_004.A("ĵĨŉĖŒńňĺşŝĬĳļĸİğıļĻŔŕĩŊŪńŞņİĻťĭţŕņņŲŖśŭĳžųőƂƂŵŲŹƅœűŒƅƈŕōŸŻƂŏƈƎŋƖŰŕŐťƒŴŷƍƚŗűƑƖƋŻźƘƔƜƤŽƅƉŷŨƩŬŽƞƓŴƄƶƆƀűźƕƘƧŻƚƚƖŹƘƹƤǀƆƶǊƅƕƗǂƗƍǅƃƑƋƐƝ", (byte)47, 65);
                    NLoginCore_093.f[10] = NLoginCore_110.B("ĒŋēēŏİēĚĕĚĴıŏĠŚŁńłŚħķũİı", (byte)47, 66);
                    NLoginCore_093.f[11] = NLoginCore_559.C("ҰҺҫ҈ҳҫҾҸ҃ҴұґѾҳҢҠҞҼҌҥӄҥӒӑ҅ҍҪҾҕҪҴҰ", (byte)47, 67);
                    NLoginCore_093.f[12] = NLoginCore_076.D("ҰҺҫ҈ҳҫҾҸ҃Ҵүү҇ҷӁӆҷҧ҇ҘҹӇҊӅҰҬҥҖӓӋӉӈ", (byte)47, 68);
                    NLoginCore_093.f[13] = NLoginCore_091.F("ՙգՔԱ՜ՔէաԬ՝՘ԷՀ՞՞ՔՈԯՆՎՁՉ՚թՆՆԸի՟տ՞ն", (byte)47, 70);
                    NLoginCore_093.f[14] = NLoginCore_091.A("ŋŕņģŎņřœĞŏŊőŋśĮŘġŚťŊŕģĶŦūĪŧŅŠŭŇĳ", (byte)47, 65);
                    NLoginCore_093.f[15] = NLoginCore_091.F("ՙգՔԱ՜ՔէաԬ՝՚ազԽճհիՆծԿդ԰ՒըմպղՔառՀՖ", (byte)47, 70);
                    NLoginCore_093.f[16] = NLoginCore_201.B("ŋŕņģŎņřœĞŏŊőŋśĮŘġŚťŊŕĤŧūŦŉĩĮŢňĭĴ", (byte)47, 66);
                    NLoginCore_093.f[17] = NLoginCore_076.D("ѱҪѶұҗҚҠӃҘҾҳҊ", (byte)47, 68);
                    NLoginCore_093.f[18] = NLoginCore_446.C("ҏҔҸҐѶҷұѼҢ҂ҍҊ", (byte)47, 67);
                    NLoginCore_093.f[19] = NLoginCore_559.D("ҌҫҹѺҝҙҖһҀӄҳҊ", (byte)47, 68);
                    NLoginCore_093.f[20] = NLoginCore_201.F("ԯԗԻ՜Րգ՞՜ժբԶԳ", (byte)47, 70);
                    NLoginCore_093.f[21] = NLoginCore_092.B("ĦŘħŘŕęŋľŜŞĺĿĠęěŤŧœĶńśŃİı", (byte)47, 66);
                    NLoginCore_093.f[22] = NLoginCore_324.A("ĩĉĲĔőśĻįőŏœŁŚŘľŀřĤŇĽĴŨķŖĨīŁįũţŅŲŇűœŎŊĻŤŝųŖŲŅ", (byte)47, 65);
                    NLoginCore_093.f[23] = NLoginCore_027.B("ķķŀŔģħŖňĬŠĞĠęłĤņŃĳİĿŀŬĵŜŖŌŠŎŋĳŪŇŏőōŕũńŐŕŸŗŗŸŜŶƁľůņřƃƂłŋŬňūźŪƉƂŏƖŢŎŶŵźƃƛƆŷşƌƀƘƐƁƂžƨšƊźƘũƮƤƘƭŬƤŮƵƐ", (byte)47, 66);
                    NLoginCore_093.f[24] = NLoginCore_446.B("ŃĳĮęśĨŉŞřŏōŔŗŘŃįŠģİŖŪŜŤţşŏŊŅŌİĬŏĬōůłĺůŮŦŧľŝľŗŢŻŽŽŘŃřžŵŻžńŠŢƆŋƐŋƃŶūŬƊŨŶźŜƘƋƀť", (byte)47, 66);
                    NLoginCore_093.f[25] = NLoginCore_223.B("ĭŊŃŚŋřĚŋěōĹęšİŒĸŤœŤřŖũİı", (byte)47, 66);
                    NLoginCore_093.f[26] = NLoginCore_092.B("ĲŒŒŕđřĜŇĚōĘľĘġŤńĵŔşħŕŃİı", (byte)47, 66);
                    NLoginCore_093.f[27] = NLoginCore_223.A("ġĩďĶŖńęņįįŒĥ", (byte)47, 65);
                    NLoginCore_093.f[28] = NLoginCore_559.B("ŏĵŇĵĭīŕĖĘğŀĥ", (byte)47, 66);
                    NLoginCore_093.f[29] = NLoginCore_091.C("Ґ҄ҳѹҩҴѼҀҁҖұҔҽҠ҄҉һҡҋҀҹӎҕҖ", (byte)47, 67);
                    NLoginCore_093.f[30] = NLoginCore_427.F("ԯԷ՚ՂՄ՜ԣԫՇՍՊԳ", (byte)47, 70);
                    NLoginCore_093.f[31] = NLoginCore_559.C("ҎҴҕѵҗҮґҿҾѿ҄Ҋ", (byte)47, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_093.f[0] = NLoginCore_173.C("҈ѼҮҏѻѻѾҞҘѾҐҞѾқҩ҂҇ӉӂҨҙҨҕҖ", (byte)47, 67);
                    NLoginCore_093.f[1] = NLoginCore_076.D("ѺҴҼҍѼҘӀҖѾҗҹҲҔқҽҊӌҠҺҺҷҤҊ҉үҬҎҵҔғӎҩ", (byte)47, 68);
                    NLoginCore_093.f[2] = NLoginCore_027.F("ՙգՔԱ՜ՔէաԬ՝՛հթԱՍգԴձլզզՁի՗Ցն՛կՏՀցՐգ՗ծըըՓՇժն՟ոՓ", (byte)47, 70);
                    NLoginCore_093.f[3] = NLoginCore_110.A("ŔłňŔŇįīŋŕĕŗľĭőľŚŀňŔĸŇŃİı", (byte)47, 65);
                    NLoginCore_093.f[4] = NLoginCore_223.F("Բԯ՛էԵԾՀՋՃՉԻԸգՂեդՕէԾՎՎՁԾԿ", (byte)47, 70);
                    NLoginCore_093.f[5] = NLoginCore_446.F("ԤՑԷՏԟՙԲ՛թԸԼ՝ՇՉԪծԽձՑգՇՁԾԿ", (byte)47, 70);
                    NLoginCore_093.f[6] = NLoginCore_223.A("ĶŋŐķČĔĮĥķşĲŌĵğĲėŇşťķŗũİı", (byte)47, 65);
                    NLoginCore_093.f[7] = NLoginCore_223.C("҆ҴҊғґҝҙҞҢҏҹҠѹҼҜҼҔѾҘҞҗҘҕҖ", (byte)47, 67);
                    NLoginCore_093.f[8] = NLoginCore_173.A("ĦŘħŘŕęŋľŜŞĺŠęŋĮĠŔŤĨĥņřİı", (byte)47, 65);
                    NLoginCore_093.f[9] = NLoginCore_027.B("ĵĨŉĖŒńňĺşŝĬĳļĸİğıļĻŔŕĩŊŪńŞņİĻťĭţŕņņŲŖśŭĳžųőƂƂŵŲŹƅœűŒƅƈŕōŸŻƂŏƈƎŋƖŰŕŐťƒŴŷƍƚŗűƑƖƋŻźƘƔƜƤŽƅƉŷŨƩŬŽƞƓŴƄƶƆƀűźƕƘƧŻƚƚƖŹƘƹƤǀƆƶǊƅƕƠǆƷƫƏƿƪǎƝƥ", (byte)47, 66);
                    NLoginCore_093.f[10] = NLoginCore_384.C("ѷҰѸѸҴҕѸѿѺѿҜҔҷҽҺҩҤҶңҟҥҘҕҖ", (byte)47, 67);
                    NLoginCore_093.f[11] = NLoginCore_110.D("ҰҺҫ҈ҳҫҾҸ҃ҴұґѾҳҢҠҞҼҌҥӄҥҡӀҨӁӅҰӔәҭұ", (byte)47, 68);
                    NLoginCore_093.f[12] = NLoginCore_092.E("ՙգՔԱ՜ՔէաԬ՝՘՘԰ՠժկՠՐ԰Ձբխ՗ՐզսէռտՑնԼՐճՔտ՛ե՝իժպ՚Փ", (byte)47, 69);
                    NLoginCore_093.f[13] = NLoginCore_223.E("ՙգՔԱ՜ՔէաԬ՝՘ԷՀ՞՞ՔՈԯՆՎՁՎե՘ԷՐՋ՟խՕ՚ՂՍխՅ՘վփֆրվնՅՓ", (byte)47, 69);
                    NLoginCore_093.f[14] = NLoginCore_091.C("ҰҺҫ҈ҳҫҾҸ҃ҴүҶҰӀғҽ҆ҿӊүҺҐҠқӉҌҟұӖӔҪұӍӆӘҔҶҖӗҿүһӗҪ", (byte)47, 67);
                    NLoginCore_093.f[15] = NLoginCore_446.A("ŋŕņģŎņřœĞŏŌœŘįťŢŝĸŠıŖĝłŅŝĹŞļŰĮŐŪ", (byte)47, 65);
                    NLoginCore_093.f[16] = NLoginCore_384.C("ҰҺҫ҈ҳҫҾҸ҃ҴүҶҰӀғҽ҆ҿӊүҺӎҢҜӉӁҢҕӌҔӒҦ", (byte)47, 67);
                    NLoginCore_093.f[17] = NLoginCore_091.B("ĿĶĔīńŅīĥĳĹŚĥ", (byte)47, 66);
                    NLoginCore_093.f[18] = NLoginCore_223.A("ĨŀĮĺĴķŒĜŌśŌşıŖĚĴĺĴĵşĽŃİı", (byte)47, 65);
                    NLoginCore_093.f[19] = NLoginCore_451.F("ԷՒ՜԰ՙԼՁՆԞՆԾԳ", (byte)47, 70);
                    NLoginCore_093.f[20] = NLoginCore_173.B("ņĿŏŇįĘńĻŔĘĽįěĮŗōģņŕĻŚũİı", (byte)47, 66);
                    NLoginCore_093.f[21] = NLoginCore_110.B("ĦŘħŘŕęŋľŜŞĻĶĳĳŞğŇŁŚńŃřİı", (byte)47, 66);
                    NLoginCore_093.f[22] = NLoginCore_559.D("ҎѮҗѹҶӀҠҔҶҴҸҦҿҽңҥҾ҉ҬҢҙӍҜһҍҐҦҔӎӈҪӗҬҲӔӏҸӌҿӜӜӏұҪ", (byte)47, 68);
                    NLoginCore_093.f[23] = NLoginCore_223.C("ҜҜҥҹ҈ҌһҭґӅ҃҅Ѿҧ҉ҫҨҘҕҤҥӑҚӁһұӅҳҰҘӏҬҴҶҲҺӎҩҵҺӝҼҼӝӁӛӦңӔҫҾӨӧҧҰӑҭӐӟӏӮӧҴӻӇҳӛӚӟӨԀӫӜӄӱӥӽӵӦӧӣԍӆӯӟӰӲԀԂӜԊӱӫӫӺӪӔԈӫԗӗԜԛԊԖӹԓӪ", (byte)47, 67);
                    NLoginCore_093.f[24] = NLoginCore_446.B("ŃĳĮęśĨŉŞřŏōŔŗŘŃįŠģİŖŪŜŤţşŏŊŅŌİĬŏĬōůłĺůŮŦŧľŝľŗŢŻŽŽŘŃřžŵŻžńŠŢƆŋƐŋƃƁƔŸŸűźƈůŝŝŪƌƛƓŹƏŝŹƂŢƟƙŰű", (byte)47, 66);
                    NLoginCore_093.f[25] = NLoginCore_091.D("ҒүҨҿҰҾѿҰҀҲҠѿҸҧӉ҃Ҡ҆һҷӍҘҕҖ", (byte)47, 68);
                    NLoginCore_093.f[26] = NLoginCore_027.F("ՀՠՠգԟէԪՕԨ՛ԦհէԧՁ՟զԾըՋ԰ճձ՗պՅղ՗ՌՑ՞Լ", (byte)47, 70);
                    NLoginCore_093.f[27] = NLoginCore_027.C("җҒҮѻҬҠҕҴҹүҍҊ", (byte)47, 67);
                    NLoginCore_093.f[28] = NLoginCore_387.F("ՒՓԘբԾՂԾՃԺԤՁԼԪլԨԽՂիլ԰թէԾԿ", (byte)47, 70);
                    NLoginCore_093.f[29] = NLoginCore_453.E("Թԭ՜ԢՒ՝ԥԩԪԿ՛ԧթԫԬՑՏլզՑՂՁԾԿ", (byte)47, 69);
                    NLoginCore_093.f[30] = NLoginCore_076.F("Ԣ՗՟ԺՁ՚ՄգԿԵՎԿԸհՎգեՎՇՓՠշԾԿ", (byte)47, 70);
                    NLoginCore_093.f[31] = NLoginCore_138.D("ѺѼҰҬѶғҸҫѹүҚҼ҄ҾҨҕҙҬ҈Ҏ҆ҾҕҖ", (byte)47, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_093.f[0] = NLoginCore_451.A("ĠŗņđĨŜĩĺĞĸŚĥ", (byte)47, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_093.f[0] = NLoginCore_384.E("ԵԺԝԠէԟՃ՜ե՝՞ՎդԺլԪԾՐղՅխշմՃՍյոՍչՌգռ", (byte)47, 69);
                }
            }
        }
    }
}

