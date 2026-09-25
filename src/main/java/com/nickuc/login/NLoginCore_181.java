/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
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
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
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
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_181
extends NLoginCore_098 {
    private static int fz;
    private static long eo;
    private static long ee;
    private static int al;
    private static int bd;
    private static long gk;
    private static int gv;
    private static int var_int_e;
    private static long el;
    private static long eb;
    private static int cs;
    private static long by;
    private static long ff;
    private static long ac;
    private static int gh;
    private static long hb;
    private static long ge;
    private static int hg;
    private static String[] var_java_lang_String_arr_e;
    private static long gr;
    private static long dc;
    private static int ex;
    private static int fm;
    private static long ab;
    private static long gu;
    private static int gy;
    private static int hm;
    private static int dh;
    private static int cj;
    private static String[] f;
    private static int eq;
    private static int ce;
    private static long gi;
    private static int fl;
    private static long gx;
    private static int co;
    private static long ft;
    private static long bm;
    private static int gm;
    private static int bi;
    private static int ey;
    private static long ca;
    private static int eu;
    private static int fh;
    private static int bf;
    private static int fd;
    private static int cm;
    private static int hk;
    private static int cy;
    private static int em;
    private static long gp;
    private static int bu;
    private static int y;
    private static int bw;
    private static long cd;
    private static long cp;
    private static long at;
    private static int bn;
    private static long bk;
    private static long cf;
    private static int bj;
    private static long ha;
    private static long ds;
    private static long hi;
    private static long dm;
    private static long et;
    private static int ao;
    private static long fq;
    private static long dv;
    private static long o;
    private static long be;
    private static long go;
    private static int gg;
    private static long bo;
    private static long gf;
    private static int hj;
    private static int de;
    private static int dz;
    private static long cq;
    private static long fc;
    private static long p;
    private static long bh;
    private static int fv;
    private static long ep;
    private static int hh;
    private static long cz;
    private static int fw;
    private static int cr;
    private static long br;
    private static long es;
    private static long dy;
    private static int dd;
    private static int dk;
    private static long q;
    private static int gw;
    private static int dq;
    private static long dp;
    private static int fp;
    private static int ek;
    private static int fa;
    private static int gq;
    private static long fx;
    private static int cv;
    private static int dt;
    private static long ci;
    private static int cb;
    private static int bz;
    private static int gc;

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

    public NLoginCore_181(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_o, (String)NLoginCore_181.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_181.c("㺃", (int)y, (long)(ab ^ ac)));
        if (new File(this.java_io_File_b(), (String)NLoginCore_181.c("㺆", (int)(al & ao), (long)at)).exists()) {
            this.O = NLoginCore_181.c("㺉", (int)bd, (long)be);
        }
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(716057597160989091L);
        q = Long.reverse(0x6800000000000000L);
        y = 2 >>> 129 | 2 << ~129 + 1;
        ab = Long.reverse(716057597160989091L);
        ac = Long.reverse(0x6800000000000000L);
        al = (0x4000000 >>> 153 | 0x4000000 << ~153 + 1) & 0xFFFFFFFF;
        ao = Integer.reverse(-1);
        at = Long.reverse(7057125872498647459L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(7057125872498647459L);
        bf = Integer.reverse(0x20000000);
        bh = Long.reverse(7057125872498647459L);
        bi = 433324032 >>> 209 | 433324032 << ~209 + 1;
        bj = Integer.reverse(-1610612736);
        bk = Long.reverse(716057597160989091L);
        bm = Long.reverse(0x6800000000000000L);
        bn = (0xC000000 >>> 249 | 0xC000000 << ~249 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(716057597160989091L);
        br = Long.reverse(0x6800000000000000L);
        bu = (-536870912 >>> 189 | -536870912 << -189) & 0xFFFFFFFF;
        bw = Integer.reverse(-1);
        by = Long.reverse(7057125872498647459L);
        bz = 1024 >>> 103 | 1024 << ~103 + 1;
        ca = Long.reverse(7057125872498647459L);
        cb = Integer.reverse(-1879048192);
        cd = Long.reverse(7057125872498647459L);
        ce = (0x280000 >>> 242 | 0x280000 << ~242 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(716057597160989091L);
        ci = Long.reverse(0x6800000000000000L);
        cj = (0x800000 >>> 22 | 0x800000 << -22) & 0xFFFFFFFF;
        cm = 0 >>> 202 | 0 << ~202 + 1;
        co = 45056 >>> 236 | 45056 << ~236 + 1;
        cp = Long.reverse(716057597160989091L);
        cq = Long.reverse(0x6800000000000000L);
        cr = Integer.reverse(0x40000000);
        cs = (0 >>> 178 | 0 << ~178 + 1) & 0xFFFFFFFF;
        cv = (0x4000000 >>> 122 | 0x4000000 << -122) & 0xFFFFFFFF;
        cy = Integer.reverse(0x30000000);
        cz = Long.reverse(716057597160989091L);
        dc = Long.reverse(0x6800000000000000L);
        dd = Integer.reverse(0x40000000);
        de = Integer.reverse(0);
        dh = Integer.reverse(Integer.MIN_VALUE);
        dk = Integer.reverse(-1342177280);
        dm = Long.reverse(716057597160989091L);
        dp = Long.reverse(0x6800000000000000L);
        dq = Integer.reverse(0x70000000);
        ds = Long.reverse(7057125872498647459L);
        dt = Integer.reverse(-268435456);
        dv = Long.reverse(716057597160989091L);
        dy = Long.reverse(0x6800000000000000L);
        dz = 0x40000000 >>> 58 | 0x40000000 << -58;
        eb = Long.reverse(716057597160989091L);
        ee = Long.reverse(0x6800000000000000L);
        ek = Integer.reverse(-2013265920);
        el = Long.reverse(7057125872498647459L);
        em = Integer.reverse(0x48000000);
        eo = Long.reverse(716057597160989091L);
        ep = Long.reverse(0x6800000000000000L);
        eq = (0x980000 >>> 179 | 0x980000 << -179) & 0xFFFFFFFF;
        es = Long.reverse(716057597160989091L);
        et = Long.reverse(0x6800000000000000L);
        eu = 16 >>> 196 | 16 << -196;
        ex = (32768 >>> 47 | 32768 << -47) & 0xFFFFFFFF;
        ey = (0 >>> 228 | 0 << ~228 + 1) & 0xFFFFFFFF;
        fa = (0x2800000 >>> 149 | 0x2800000 << -149) & 0xFFFFFFFF;
        fc = Long.reverse(7057125872498647459L);
        fd = 42 >>> 33 | 42 << -33;
        ff = Long.reverse(7057125872498647459L);
        fh = (786432 >>> 178 | 786432 << -178) & 0xFFFFFFFF;
        fl = Integer.reverse(Integer.MIN_VALUE);
        fm = -1 >>> 61 | -1 << -61;
        fp = Integer.reverse(0x68000000);
        fq = Long.reverse(716057597160989091L);
        ft = Long.reverse(0x6800000000000000L);
        fv = (0 >>> 26 | 0 << ~26 + 1) & 0xFFFFFFFF;
        fw = Integer.reverse(-402653184);
        fx = Long.reverse(7057125872498647459L);
        fz = Integer.reverse(Integer.MIN_VALUE);
        gc = Integer.reverse(0x18000000);
        ge = Long.reverse(716057597160989091L);
        gf = Long.reverse(0x6800000000000000L);
        gg = (Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << ~190 + 1) & 0xFFFFFFFF;
        gh = 0x640000 >>> 146 | 0x640000 << ~146 + 1;
        gi = Long.reverse(716057597160989091L);
        gk = Long.reverse(0x6800000000000000L);
        gm = 26 >>> 64 | 26 << -64;
        go = Long.reverse(716057597160989091L);
        gp = Long.reverse(0x6800000000000000L);
        gq = Integer.reverse(-671088640);
        gr = Long.reverse(716057597160989091L);
        gu = Long.reverse(0x6800000000000000L);
        gv = (0x38000000 >>> 185 | 0x38000000 << -185) & 0xFFFFFFFF;
        gw = Integer.reverse(-1);
        gx = Long.reverse(7057125872498647459L);
        gy = Integer.reverse(-1207959552);
        ha = Long.reverse(716057597160989091L);
        hb = Long.reverse(0x6800000000000000L);
        hg = Integer.reverse(0x78000000);
        hh = -1 >>> 227 | -1 << ~227 + 1;
        hi = Long.reverse(7057125872498647459L);
        hj = (512 >>> 39 | 512 << ~39 + 1) & 0xFFFFFFFF;
        hk = (-2147483633 >>> 95 | -2147483633 << -95) & 0xFFFFFFFF;
        hm = Integer.reverse(-134217728);
        var_java_lang_String_arr_e = new String[hk];
        f = new String[hm];
        NLoginCore_181.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_181.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 65), NLoginCore_181.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("ӃӐӏҒӒӎӉӒӝӌҙӗӛӔӗӝҟࠪࠨ࠶ࠥࠪ࠵࠺࠘ࠔࠚ࠯ࠟ࠮ࠡ࠱Һ", (byte)57, 67) + string + NLoginCore_027.D("Қ", (byte)57, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x16L;
        l ^= 0x4D33380A6A2603D8L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(52 + 17), (byte)(47 + 36), (byte)(45 + 2), (byte)(6 + 61), (byte)(14 + 52), 67, (byte)(37 + 10), 80, (byte)(56 + 19), (byte)(54 + 13), (byte)(76 + 7), (byte)(48 + 5), (byte)(29 + 51), (byte)(64 + 33), (byte)(88 + 12), (byte)(97 + 3), (byte)(22 + 83), (byte)(62 + 48), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.A("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҥңұҠҥҰҵғҏҕҪҚҩҜҬ", (byte)46, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_181.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        int n = NLoginCore_2192.a(NLoginCore_181.c("㺀", (int)bf, (long)bh), bi);
        String string = NLoginCore_2192.java_lang_String_b(NLoginCore_181.c("㺃", (int)bj, (long)(bk ^ bm)));
        String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_181.c("㺆", (int)bn, (long)(bo ^ br)));
        String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_181.c("㺉", (int)(bu & bw), (long)by));
        String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_181.c("㺌", (int)bz, (long)ca));
        Properties properties = new Properties();
        String string5 = NLoginCore_2192.java_lang_String_b(NLoginCore_181.c("㺏", (int)cb, (long)cd));
        if (string5 != null) {
            String[] stringArray = string5.split((String)NLoginCore_181.c("㺒", (int)ce, (long)(cf ^ ci)));
            if (stringArray.length >= cj) {
                String[] stringArray2 = stringArray;
                int n2 = stringArray2.length;
                for (int i = cm; i < n2; ++i) {
                    String string6 = stringArray2[i];
                    String[] stringArray3 = string6.split((String)NLoginCore_181.c("㺕", (int)co, (long)(cp ^ cq)));
                    if (stringArray3.length != cr) continue;
                    properties.setProperty(stringArray3[cs], stringArray3[cv]);
                }
            } else {
                String[] stringArray4 = string5.split((String)NLoginCore_181.c("㺘", (int)cy, (long)(cz ^ dc)));
                if (stringArray4.length == dd) {
                    properties.setProperty(stringArray4[de], stringArray4[dh]);
                }
            }
        }
        boolean bl = NLoginCore_2192.d(NLoginCore_181.c("㺛", (int)dk, (long)(dm ^ dp)));
        properties.setProperty((String)NLoginCore_181.c("㺞", (int)dq, (long)ds), Boolean.toString(bl));
        this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, n, string2, string3, string4, properties));
    }

    private static void void_b() {
        int n;
        o = -4214241440432130160L;
        long l = o ^ 0x4D33380A6A2603D8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), 69, (byte)(16 + 67), (byte)(6 + 41), (byte)(10 + 57), (byte)(51 + 15), (byte)(43 + 24), (byte)(2 + 45), (byte)(76 + 4), (byte)(9 + 66), (byte)(32 + 35), (byte)(21 + 62), (byte)(17 + 36), (byte)(23 + 57), (byte)(17 + 80), (byte)(20 + 80), (byte)(66 + 34), (byte)(3 + 102), (byte)(11 + 99), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_181.f[0] = NLoginCore_427.E("եդթդԺՇՇլծԺՑՐՈՒԾՇդէդՊծՓՀՁ", (byte)49, 69);
                    NLoginCore_181.f[1] = NLoginCore_387.B("ĕŇħĩīđőĘĭŠŜŜŢŗĥőšŗĵŦōŝĴĵ", (byte)49, 66);
                    NLoginCore_181.f[2] = NLoginCore_091.D("ҜҪҬҰңүѹңҾҦӈӀӍӅҭҘӎҦҰҏҭӔқҜ", (byte)49, 68);
                    NLoginCore_181.f[3] = NLoginCore_384.B("ĵŃŅŉļňĒļŗĿšřŦŞņıŧĿŉĨņŭĴĵ", (byte)49, 66);
                    NLoginCore_181.f[4] = NLoginCore_387.E("դՄՖՅՔԪԣ՗ԧԼխԽճՄՋթԳԷԯՄժՃՀՁ", (byte)49, 69);
                    NLoginCore_181.f[5] = NLoginCore_223.C("ѺҫҬҜ҅҅қӅ҂ӄӅ҃ҩӎӉӎҹҝҫҞҎҞқҜ", (byte)49, 67);
                    NLoginCore_181.f[6] = NLoginCore_427.D("ҺҲҫҘҭҰҧҐӀҊҢ҅ҊҘӏҌҙҾғӔҤҞқҜ", (byte)49, 68);
                    NLoginCore_181.f[7] = NLoginCore_173.F("՗ՈՠեԥՄ՗՘ԫեԼղՉէՋղՓԲիՕ՘թՀՁ", (byte)49, 70);
                    NLoginCore_181.f[8] = NLoginCore_559.F("ՏՖԸՆ՟ԻՋԬզԥըաԭՃՊծթՋՄԸՇչՀՁ", (byte)49, 70);
                    NLoginCore_181.f[9] = NLoginCore_451.F("՘դե՝ԡՀաԼՆՈ՟԰ՈղխՖյԲճՔԱՓՀՁ", (byte)49, 70);
                    NLoginCore_181.f[10] = NLoginCore_427.C("ѺҀҚҭҎҹҢғҀҨӉҐ", (byte)49, 67);
                    NLoginCore_181.f[11] = NLoginCore_027.D("ғҪҿ҃ңҏҝҸӁӄҫҐ", (byte)49, 68);
                    NLoginCore_181.f[12] = NLoginCore_091.C("ғҪҿ҃ңҏҝҸӁӄҫҐ", (byte)49, 67);
                    NLoginCore_181.f[13] = NLoginCore_384.F("՚՞Չ՞ՕՀԴԹդ՝Ԩԣ՟ԲդԵբ՗ճՁԹՃՀՁ", (byte)49, 70);
                    NLoginCore_181.f[14] = NLoginCore_384.D("Ҕұҝ҄҃Ґ҄ӆ҂ҧӉҐ", (byte)49, 68);
                    NLoginCore_181.f[15] = NLoginCore_223.A("ķĕĬŉĵĽşœĬŚğĩ", (byte)49, 65);
                    NLoginCore_181.f[16] = NLoginCore_446.F("ԣԧԿՄՉՓՂՙ՘հ՞Ե", (byte)49, 70);
                    NLoginCore_181.f[17] = NLoginCore_110.F("Ղԙը՗՞ԢալլՇԦՉՎԫծՌԯՠՉկըչՀՁ", (byte)49, 70);
                    NLoginCore_181.f[18] = NLoginCore_027.A("ŒŏĬŊŜŏĵŘĝĸļĩ", (byte)49, 65);
                    NLoginCore_181.f[19] = NLoginCore_384.A("ŒēśŗŘŋŜġĭŔģĩ", (byte)49, 65);
                    NLoginCore_181.f[20] = NLoginCore_575.E("Ղ՘ՠՙՅՖժՎԻէզԵ", (byte)49, 69);
                    NLoginCore_181.f[21] = NLoginCore_384.B("ėĪŎŒľœĬġĪěģĩ", (byte)49, 66);
                    NLoginCore_181.f[22] = NLoginCore_223.D("ұѹҡ҄ҞҏґӇҹҕ҆Ґ", (byte)49, 68);
                    NLoginCore_181.f[23] = NLoginCore_559.E("ԢՏԽդաբՋաէՐԸԵ", (byte)49, 69);
                    NLoginCore_181.f[24] = NLoginCore_091.C("ұҐѵѼҒҝӅ҃ҵңңҐ", (byte)49, 67);
                    NLoginCore_181.f[25] = NLoginCore_559.A("łħŕēŚĸŏĞŞĴğĩ", (byte)49, 65);
                    NLoginCore_181.f[26] = NLoginCore_110.C("ҐғҁҶ҂ӇһҲѻ҇Ҟҧ҄ҦҫһҾӇӌҌҿӄқҜ", (byte)49, 67);
                    NLoginCore_181.f[27] = NLoginCore_091.B("ČĲĮĲęŎŎěĠĺĸĩ", (byte)49, 66);
                    NLoginCore_181.f[28] = NLoginCore_138.B("ĖĥŖĬŜŕŕśĔīĝņİŨśĴģħŗŌĥŇĴĵ", (byte)49, 66);
                    NLoginCore_181.f[29] = NLoginCore_451.B("ČĲĮĲęŎŎěĠĺĸĩ", (byte)49, 66);
                    NLoginCore_181.f[30] = NLoginCore_384.A("ķĻŅŋļŒőĻĳĺŗĽĸœĹŦŘŉĞļşŭĴĵ", (byte)49, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_181.f[0] = NLoginCore_559.F("եդթդԺՇՇլծԺ՘ԧՉղծբիկՈձԳթՀՁ", (byte)49, 70);
                    NLoginCore_181.f[1] = NLoginCore_223.B("ĕŇħĩīđőĘĭŠśĢģŀœńĵŢīšśŭĴĵ", (byte)49, 66);
                    NLoginCore_181.f[2] = NLoginCore_138.D("ҜҪҬҰңүѹңҾҦӅҬҗҋҽҠҏӀҡҒӁӔқҜ", (byte)49, 68);
                    NLoginCore_181.f[3] = NLoginCore_004.C("ҜҪҬҰңүѹңҾҦӆҞҌӉӊҌҜҼӇңүӔқҜ", (byte)49, 67);
                    NLoginCore_181.f[4] = NLoginCore_453.D("ҿҟұҠү҅ѾҲ҂җӈқҝҶҚҏһӆґӑӃҮқҜ", (byte)49, 68);
                    NLoginCore_181.f[5] = NLoginCore_223.B("ēńŅĵĞĞĴŞěŝŠİĥĢŔšŤřĶŚŬŭĴĵ", (byte)49, 66);
                    NLoginCore_181.f[6] = NLoginCore_110.A("œŋńıņŉŀĩřģĻŦĸňŐŧĲĺŦĹŉŰůŁńůŒŴŷōŢņ", (byte)49, 65);
                    NLoginCore_181.f[7] = NLoginCore_091.F("՗ՈՠեԥՄ՗՘ԫեԾՀլԱհՉյՏՏՇԹչՀՁ", (byte)49, 70);
                    NLoginCore_181.f[8] = NLoginCore_004.C("ҪұғҡҺҖҦ҇ӁҀӃӍӆӎҙҞӐӁҬҳґӌӌӁҙӑҬӌӝҷӖӕ", (byte)49, 67);
                    NLoginCore_181.f[9] = NLoginCore_575.E("՘դե՝ԡՀաԼՆՈՠ՞ՒՠԽԿԲԩՇԴԬչՀՁ", (byte)49, 69);
                    NLoginCore_181.f[10] = NLoginCore_173.C("ґҁҗӂӅҵҙҢҶҲӅҐ", (byte)49, 67);
                    NLoginCore_181.f[11] = NLoginCore_027.B("ŐĥśŏŚĽĮĝŃĵĬĩ", (byte)49, 66);
                    NLoginCore_181.f[12] = NLoginCore_451.C("ҼҲӂґҤ҃ҸҠҳҿӁҐ", (byte)49, 67);
                    NLoginCore_181.f[13] = NLoginCore_384.E("՚՞Չ՞ՕՀԴԹդ՝ԪձՈՋՓԱթժՆՙՊՃՀՁ", (byte)49, 69);
                    NLoginCore_181.f[14] = NLoginCore_173.A("ĔĻŚŐĶşňěŞęĜťįľĴħłšŖŉľŝĴĵ", (byte)49, 65);
                    NLoginCore_181.f[15] = NLoginCore_201.D("ҏҐҳҔҳңңқұҟҊҐ", (byte)49, 68);
                    NLoginCore_181.f[16] = NLoginCore_324.D("ҪӂҗҸѾ҆҂ҧҧҢқҐ", (byte)49, 68);
                    NLoginCore_181.f[17] = NLoginCore_427.E("Ղԙը՗՞ԢալլՇ԰԰՝ԼՄ՝ՎՒՊծ՛չՀՁ", (byte)49, 69);
                    NLoginCore_181.f[18] = NLoginCore_223.D("ѻѼӁҜҭҖҳҼҥ҉һҵҡҺӌҾӍҐҪӂӐҮқҜ", (byte)49, 68);
                    NLoginCore_181.f[19] = NLoginCore_575.C("ҳҋүҽҒґҹҖӀһҩҿ҉ңҊҰҲҿҭҫҪӄқҜ", (byte)49, 67);
                    NLoginCore_181.f[20] = NLoginCore_451.A("ŏŕĶĕīŖŞłĪĢŒĩ", (byte)49, 65);
                    NLoginCore_181.f[21] = NLoginCore_451.B("ŐēňņĹĵōĞšœĴĩ", (byte)49, 66);
                    NLoginCore_181.f[22] = NLoginCore_027.A("ŚĒőĚĭĶŜēĸŢŎĩ", (byte)49, 65);
                    NLoginCore_181.f[23] = NLoginCore_004.A("ĥħņĚĸŠŐĪĵĵļĩ", (byte)49, 65);
                    NLoginCore_181.f[24] = NLoginCore_201.B("ĬēėŐıĺĲľŋĲěĩ", (byte)49, 66);
                    NLoginCore_181.f[25] = NLoginCore_223.B("ĮčŔİĘğĻĘŖĮńĩ", (byte)49, 66);
                    NLoginCore_181.f[26] = NLoginCore_027.C("ҐғҁҶ҂ӇһҲѻ҇ҜӀҌҜҾӑҍҎӄҜңҞқҜ", (byte)49, 67);
                    NLoginCore_181.f[27] = NLoginCore_223.A("ŉőĬĘĻĜļŒıţŖĩ", (byte)49, 65);
                    NLoginCore_181.f[28] = NLoginCore_446.B("ĖĥŖĬŜŕŕśĔīĞŢŇŤĵĠĿŊśşņŇĴĵ", (byte)49, 66);
                    NLoginCore_181.f[29] = NLoginCore_027.B("ňśĘĮřŒĨįıŢĴĩ", (byte)49, 66);
                    NLoginCore_181.f[30] = NLoginCore_324.C("ҞҢҬҲңҹҸҢҚҡҿӌ҄ҼҠӄ҈ҐҤӍүҮқҜ", (byte)49, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_181.f[0] = NLoginCore_223.E("ԾԢԳԴէՉԬԣծԾՁ՝ԼՊմխիՆՓյԸ՘մՍԶնոԺՐձազ", (byte)49, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_181.f[0] = NLoginCore_223.B("ĸńĲśĝŔŋŚİőŀįśłţšřŃňũĶķĴĵ", (byte)49, 66);
                }
            }
        }
    }
}

