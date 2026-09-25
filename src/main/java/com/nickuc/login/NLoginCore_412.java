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
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
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
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_412
extends NLoginCore_098 {
    private static long ds;
    private static int ie;
    private static int im;
    private static long il;
    private static long hn;
    private static long ge;
    private static int ch;
    private static int bl;
    private static long by;
    private static int fs;
    private static long fx;
    private static long ha;
    private static long gk;
    private static int bi;
    private static long ci;
    private static long eo;
    private static long hi;
    private static long gu;
    private static int cb;
    private static long gr;
    private static int dz;
    private static int hg;
    private static long br;
    private static int bp;
    private static int dh;
    private static int hy;
    private static int gc;
    private static int ic;
    private static int var_int_e;
    private static long dp;
    private static long ig;
    private static int ey;
    private static int bd;
    private static int gq;
    private static String[] var_java_lang_String_arr_e;
    private static int cfr_renamed_0;
    private static int fe;
    private static long ct;
    private static long ab;
    private static long hp;
    private static int eu;
    private static int ek;
    private static int dq;
    private static int fd;
    private static long ca;
    private static long eb;
    private static int dl;
    private static int bn;
    private static long gx;
    private static int em;
    private static long cz;
    private static long di;
    private static long go;
    private static long cd;
    private static int gg;
    private static int fl;
    private static int fa;
    private static int dd;
    private static int bu;
    private static int cg;
    private static int fz;
    private static int gn;
    private static long p;
    private static int gv;
    private static long dv;
    private static int ii;
    private static int z;
    private static long o;
    private static long bk;
    private static int cv;
    private static int y;
    private static int dk;
    private static int cc;
    private static int gm;
    private static int fw;
    private static int in;
    private static int hm;
    private static long at;
    private static long dy;
    private static int fv;
    private static long cf;
    private static long fn;
    private static long ck;
    private static int co;
    private static long ff;
    private static long dc;
    private static long ev;
    private static long gf;
    private static int cr;
    private static int cm;
    private static int ex;
    private static int al;
    private static long gi;
    private static long id;
    private static long ik;
    private static int ao;
    private static int bw;
    private static int fb;
    private static long dm;
    private static long dj;
    private static long el;
    private static int fr;
    private static int gh;
    private static int dt;
    private static long fo;
    private static long be;
    private static long ee;
    private static long bh;
    private static int dn;
    private static long hl;
    private static int en;
    private static int fh;
    private static long hz;
    private static int fp;
    private static int cy;
    private static int m;
    private static int eq;
    private static long cw;
    private static int bj;
    private static long es;
    private static String[] f;
    private static long df;

    @Override
    protected File java_io_File_b() {
        return new File(this.m.java_io_File_c().getParentFile(), this.a.p().toLowerCase(Locale.ENGLISH));
    }

    private static String a(int n, long l) {
        l ^= 0x4AL;
        l ^= 0x9ADA29D94C96EFABL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(3 + 66), (byte)(46 + 37), 47, (byte)(21 + 46), (byte)(50 + 16), (byte)(48 + 19), (byte)(9 + 38), (byte)(26 + 54), (byte)(27 + 48), (byte)(20 + 47), (byte)(15 + 68), (byte)(20 + 33), (byte)(45 + 35), (byte)(94 + 3), (byte)(44 + 56), 100, (byte)(23 + 82), (byte)(19 + 91), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(17 + 52), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.A("ðýü¿ÿûöÿĊùÆĄĈāĄĊÌњѣљѓѓыѢѧѮѨњ", (byte)7, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_412.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    static {
        var_int_e = (0 >>> 131 | 0 << -131) & 0xFFFFFFFF;
        m = Integer.reverse(-1);
        p = Long.reverse(7570680814927839205L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(-1);
        ab = Long.reverse(7570680814927839205L);
        al = 131072 >>> 48 | 131072 << -48;
        ao = -1 >>> 54 | -1 << -54;
        at = Long.reverse(7570680814927839205L);
        bd = 12 >>> 34 | 12 << -34;
        be = Long.reverse(4256031489183154149L);
        bh = Long.reverse(0x5200000000000000L);
        bi = Integer.reverse(-1);
        bj = Integer.MIN_VALUE >>> 221 | Integer.MIN_VALUE << -221;
        bk = Long.reverse(7570680814927839205L);
        bl = 0 >>> 248 | 0 << ~248 + 1;
        bn = Integer.reverse(-1610612736);
        bp = -1 >>> 243 | -1 << -243;
        br = Long.reverse(7570680814927839205L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(4256031489183154149L);
        ca = Long.reverse(0x5200000000000000L);
        cb = Integer.reverse(0x40000000);
        cc = Integer.reverse(-536870912);
        cd = Long.reverse(4256031489183154149L);
        cf = Long.reverse(0x5200000000000000L);
        cg = Integer.reverse(-1073741824);
        ch = Integer.reverse(0x10000000);
        ci = Long.reverse(4256031489183154149L);
        ck = Long.reverse(0x5200000000000000L);
        cm = (0x200000 >>> 19 | 0x200000 << ~19 + 1) & 0xFFFFFFFF;
        co = Integer.reverse(-1879048192);
        cr = (-1 >>> 196 | -1 << -196) & 0xFFFFFFFF;
        ct = Long.reverse(7570680814927839205L);
        cv = Integer.reverse(0x50000000);
        cw = Long.reverse(7570680814927839205L);
        cy = Integer.reverse(-805306368);
        cz = Long.reverse(4256031489183154149L);
        dc = Long.reverse(0x5200000000000000L);
        dd = (0xC000000 >>> 248 | 0xC000000 << -248) & 0xFFFFFFFF;
        df = Long.reverse(7570680814927839205L);
        dh = Integer.reverse(-1342177280);
        di = Long.reverse(4256031489183154149L);
        dj = Long.reverse(0x5200000000000000L);
        dk = Integer.reverse(0x70000000);
        dl = Integer.reverse(-1);
        dm = Long.reverse(7570680814927839205L);
        dn = Integer.reverse(-268435456);
        dp = Long.reverse(7570680814927839205L);
        dq = 0x100000 >>> 80 | 0x100000 << -80;
        ds = Long.reverse(7570680814927839205L);
        dt = (4352 >>> 40 | 4352 << -40) & 0xFFFFFFFF;
        dv = Long.reverse(4256031489183154149L);
        dy = Long.reverse(0x5200000000000000L);
        dz = -2147483644 >>> 158 | -2147483644 << -158;
        eb = Long.reverse(4256031489183154149L);
        ee = Long.reverse(0x5200000000000000L);
        ek = Integer.reverse(-939524096);
        el = Long.reverse(7570680814927839205L);
        em = Integer.reverse(0x28000000);
        en = (-1 >>> 219 | -1 << ~219 + 1) & 0xFFFFFFFF;
        eo = Long.reverse(7570680814927839205L);
        eq = Integer.reverse(-1476395008);
        es = Long.reverse(7570680814927839205L);
        eu = Integer.reverse(0x68000000);
        ev = Long.reverse(7570680814927839205L);
        ex = (4 >>> 33 | 4 << -33) & 0xFFFFFFFF;
        ey = (0 >>> 22 | 0 << ~22 + 1) & 0xFFFFFFFF;
        fa = Integer.reverse(-67108864);
        fb = (512 >>> 73 | 512 << -73) & 0xFFFFFFFF;
        fd = Integer.reverse(-402653184);
        fe = -1 >>> 2 | -1 << -2;
        ff = Long.reverse(7570680814927839205L);
        fh = (0 >>> 178 | 0 << -178) & 0xFFFFFFFF;
        fl = (98304 >>> 12 | 98304 << ~12 + 1) & 0xFFFFFFFF;
        fn = Long.reverse(4256031489183154149L);
        fo = Long.reverse(0x5200000000000000L);
        fp = Integer.reverse(0x40000000);
        fr = (0 >>> 73 | 0 << -73) & 0xFFFFFFFF;
        fs = (0x10000000 >>> 28 | 0x10000000 << ~28 + 1) & 0xFFFFFFFF;
        fv = Integer.reverse(-1);
        fw = (0x32000000 >>> 153 | 0x32000000 << ~153 + 1) & 0xFFFFFFFF;
        fx = Long.reverse(7570680814927839205L);
        fz = Integer.reverse(0);
        gc = Integer.reverse(0x58000000);
        ge = Long.reverse(4256031489183154149L);
        gf = Long.reverse(0x5200000000000000L);
        gg = (0x100000 >>> 148 | 0x100000 << ~148 + 1) & 0xFFFFFFFF;
        gh = Integer.reverse(-671088640);
        gi = Long.reverse(4256031489183154149L);
        gk = Long.reverse(0x5200000000000000L);
        gm = Integer.reverse(0x40000000);
        gn = (917504 >>> 111 | 917504 << -111) & 0xFFFFFFFF;
        go = Long.reverse(7570680814927839205L);
        gq = Integer.reverse(-1207959552);
        gr = Long.reverse(4256031489183154149L);
        gu = Long.reverse(0x5200000000000000L);
        gv = Integer.reverse(0x78000000);
        gx = Long.reverse(4256031489183154149L);
        ha = Long.reverse(0x5200000000000000L);
        hg = Integer.reverse(-134217728);
        hi = Long.reverse(4256031489183154149L);
        hl = Long.reverse(0x5200000000000000L);
        hm = (0x100000 >>> 143 | 0x100000 << -143) & 0xFFFFFFFF;
        hn = Long.reverse(4256031489183154149L);
        hp = Long.reverse(0x5200000000000000L);
        hy = 2112 >>> 102 | 2112 << ~102 + 1;
        hz = Long.reverse(7570680814927839205L);
        ic = -2013265920 >>> 186 | -2013265920 << ~186 + 1;
        id = Long.reverse(7570680814927839205L);
        ie = Integer.reverse(-1006632960);
        cfr_renamed_0 = -1 >>> 159 | -1 << -159;
        ig = Long.reverse(7570680814927839205L);
        ii = Integer.reverse(0x24000000);
        ik = Long.reverse(4256031489183154149L);
        il = Long.reverse(0x5200000000000000L);
        im = Integer.reverse(-1543503872);
        in = 148 >>> 98 | 148 << ~98 + 1;
        var_java_lang_String_arr_e = new String[im];
        f = new String[in];
        NLoginCore_412.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_412.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.D("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 68), NLoginCore_412.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.F("՛ըէԪժզաժյդԱկճլկյԷࣅ࣎ࣄࢾࢾࢶ࣒࣓࣍ࣙࣅՎ", (byte)60, 70) + string + NLoginCore_387.E("Բ", (byte)60, 69) + methodType.toString(), exception);
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

    private static void void_b() {
        int n;
        o = -6341413999125591844L;
        long l = o ^ 0x9ADA29D94C96EFABL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(13 + 70), (byte)(25 + 22), (byte)(30 + 37), (byte)(13 + 53), 67, (byte)(4 + 43), (byte)(43 + 37), (byte)(66 + 9), (byte)(26 + 41), (byte)(43 + 40), (byte)(19 + 34), (byte)(77 + 3), (byte)(66 + 31), (byte)(67 + 33), (byte)(40 + 60), (byte)(23 + 82), (byte)(75 + 35), (byte)(100 + 3)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
                    NLoginCore_412.f[0] = NLoginCore_453.B("ƪǀǄƨǌƭǝǱǃǭǤǴƴǥǎƵǋǷưǸǼǙǆǇ", (byte)122, 66);
                    NLoginCore_412.f[1] = NLoginCore_110.B("ƽƾǆǰǜǛǡǋǃǇǬƻ", (byte)122, 66);
                    NLoginCore_412.f[2] = NLoginCore_324.F("֞սծ֎ճհլ֔֕ոֵփ֣֛֮֓֕֘վ֌ׇ֣֮ׄ֠֙־ք֗׍־֫", (byte)122, 70);
                    NLoginCore_412.f[3] = NLoginCore_446.B("ƣǤƶǅǂưƨǪǨǭƭƻ", (byte)122, 66);
                    NLoginCore_412.f[4] = NLoginCore_324.F("զ֧չֈօճիְ֭֫հվ", (byte)122, 70);
                    NLoginCore_412.f[5] = NLoginCore_201.B("ǤǘƫƼǑǛǇƪǜǴƾƻ", (byte)122, 66);
                    NLoginCore_412.f[6] = NLoginCore_091.B("ǭƬǀƫǢǊǬǋǭǴǊƻ", (byte)122, 66);
                    NLoginCore_412.f[7] = NLoginCore_091.B("ƩǫǆƷǨƾǬǑǮǊǒƻ", (byte)122, 66);
                    NLoginCore_412.f[8] = NLoginCore_427.E("ծ։֍ղթֈ֟տ֢֕֡և։օ֬֍֘֫֋֔־ׂ։֊", (byte)122, 69);
                    NLoginCore_412.f[9] = NLoginCore_091.C("խծն֠֌֋֑ջճշ֜ի", (byte)122, 67);
                    NLoginCore_412.f[10] = NLoginCore_559.D("֍՛՗վ։֐֗կմշն֦ոՠ֣֥֞֨֌֊չչնշ", (byte)122, 68);
                    NLoginCore_412.f[11] = NLoginCore_559.B("ƽƾǆǰǜǛǡǋǃǇǬƻ", (byte)122, 66);
                    NLoginCore_412.f[12] = NLoginCore_223.C("֍՛՗վ։֐֗կմշն֪֞֟յսս֕֎կէչնշ", (byte)122, 67);
                    NLoginCore_412.f[13] = NLoginCore_384.E("֞սծ֎ճհլ֔֕ոִ֌ָշֲ֗սְֺֻֻ֫֗֝׆֞֒׈ֈׂ֚׌", (byte)122, 69);
                    NLoginCore_412.f[14] = NLoginCore_138.B("ǠǀǪǂƢǙǦǣǳǬƾǫǓǆǎƻǑǧǶƺǝǙǆǇ", (byte)122, 66);
                    NLoginCore_412.f[15] = NLoginCore_138.B("ǛƺƫǋưƭƩǑǒƵǱǓǨǑǃǣǮǲƵǩǝǯǆǇ", (byte)122, 66);
                    NLoginCore_412.f[16] = NLoginCore_223.D("ֈ՚֎ծ՞։տնա֟֐ի", (byte)122, 68);
                    NLoginCore_412.f[17] = NLoginCore_110.A("ǛƺƫǋưƭƩǑǒƵǳǅǎǖǌǰǔƵǩǍǟǍȃǋǘǣȂǴǰȅǪǚ", (byte)122, 65);
                    NLoginCore_412.f[18] = NLoginCore_324.E("֤֡էֆ֞֎֔֞֊ֱָ֫֩֔֔֩շ֏֡׀ֿ֌։֊", (byte)122, 69);
                    NLoginCore_412.f[19] = NLoginCore_223.F("֞սծ֎ճհլ֔֕ոֶ֎ַ֓նռֺ֔֯տֳֵֶַ֛֖֕׈֜׉ׂ֠", (byte)122, 70);
                    NLoginCore_412.f[20] = NLoginCore_138.A("ǡǞƤǃǛǋǑǛǇǨǮǦǑǵǑǦƴǌǞǽǼǉǆǇ", (byte)122, 65);
                    NLoginCore_412.f[21] = NLoginCore_575.C("֋ժ՛ջՠ՝ՙցւե֣սփբ֗դբ֙վ֢թծցճ֊֬ք֢֐ևֹճ֧֗։ֵׁ֖֘֌ָֹ֢֋", (byte)122, 67);
                    NLoginCore_412.f[22] = NLoginCore_201.B("ƻƧƼƦǎưǈƱǔǶǟƱǢǅǻƴǘǱƶǊǈǛǻǂǱǱǵǻǄǒȆǔǔǌȊǞȉǾǦǪȕȁǯȎǹȆȇǵǓȖǞǞǶǱȜǚȠȞǲșǻȑǧȫǵǦǻȢȜǻǮǱȢǱȬǻ", (byte)122, 66);
                    NLoginCore_412.f[23] = NLoginCore_091.B("ǃǣƤǠƼƫǲǎƼǋǤƻ", (byte)122, 66);
                    NLoginCore_412.f[24] = NLoginCore_138.D("֕ջ֒խՠն֡֎փջծի", (byte)122, 68);
                    NLoginCore_412.f[25] = NLoginCore_138.D("ՙ֛նէ֘ծ֜ց֞պւի", (byte)122, 68);
                    NLoginCore_412.f[26] = NLoginCore_324.C("֝՜հ՛֒պ֜ջ֤֝պի", (byte)122, 67);
                    NLoginCore_412.f[27] = NLoginCore_559.A("ƫǆǊƯƦǅǜƼǟǒǞǄǆǂǩǊǕǨǈǑǻǿǆǇ", (byte)122, 65);
                    NLoginCore_412.f[28] = NLoginCore_173.B("ǛƨƮǢǃǫǠǝǃǒǭƲǊǒǥǍǤǸǗǑƿǰǿǶǻǠȀǳǷǜǫǥǃǿȏǇǿǜȉǣȍȐȀǛ", (byte)122, 66);
                    NLoginCore_412.f[29] = NLoginCore_091.C("զը֟֝ծ֞֏ս֡դկջ֑֕րշ֛վո֘ռչնշ", (byte)122, 67);
                    NLoginCore_412.f[30] = NLoginCore_138.D("֐ժվ֎֜րճձւջ֘ի", (byte)122, 68);
                    NLoginCore_412.f[31] = NLoginCore_446.F("֝֍ծս֭խ֦ք֋֤հվ", (byte)122, 70);
                    NLoginCore_412.f[32] = NLoginCore_027.C("կՓծ֐ի֡ն֤ւՠ֐ի", (byte)122, 67);
                    NLoginCore_412.f[33] = NLoginCore_559.A("ƢƿǫǠƼǲƻǯƱƮǨƻ", (byte)122, 65);
                    NLoginCore_412.f[34] = NLoginCore_110.A("ǙǛƮǆǮǉǆǫǴǞǪƴǧǘǓǸǬǻǋǔǈǯǆǇ", (byte)122, 65);
                    NLoginCore_412.f[35] = NLoginCore_384.A("ǍǈƬǜǍǣǜƱǈǊƱƻ", (byte)122, 65);
                    NLoginCore_412.f[36] = NLoginCore_223.D("՜֞վսրջպտ֟֗ւի", (byte)122, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_412.f[0] = NLoginCore_027.F("խփևի֏հִ֠ֆְ֪ֈ֍ַֻֻ֒տց֓֐֌։֊", (byte)122, 70);
                    NLoginCore_412.f[1] = NLoginCore_091.D("֒֓լճ՞֔Ք֛՜֐֔ի", (byte)122, 68);
                    NLoginCore_412.f[2] = NLoginCore_091.F("֞սծ֎ճհլ֔֕ոֵփ֣֛֮֓֕֘վ֌֣֟֍ֽֽ֛֞փׅ֨׉֬׉ֹּ֪־֓֏׀ֿ֥֭֞", (byte)122, 70);
                    NLoginCore_412.f[3] = NLoginCore_451.D("թն՘և֙֠֋մդ֦ծի", (byte)122, 68);
                    NLoginCore_412.f[4] = NLoginCore_384.A("ǉǊƭǝǈƱǡǆưǋǬƻ", (byte)122, 65);
                    NLoginCore_412.f[5] = NLoginCore_427.F("֎ֆֈ֭ճ֟է֢ճ֡֔֊ֳֻ֘յֲֽֿ֑֫֝։֊", (byte)122, 70);
                    NLoginCore_412.f[6] = NLoginCore_324.C("՗Քն֝֕֋Քղ֖֎՜տճ֦ր֥֤֨֞֫֙֯նշ", (byte)122, 67);
                    NLoginCore_412.f[7] = NLoginCore_110.F("֤֎խլհ֫խհ֭֗քփո֯֍ֳֽ֮֡֫֕֌։֊", (byte)122, 70);
                    NLoginCore_412.f[8] = NLoginCore_110.A("ƫǆǊƯƦǅǜƼǟǒǖǃƴưǛǯǶǋǙǮǗǯǆǇ", (byte)122, 65);
                    NLoginCore_412.f[9] = NLoginCore_091.A("ǩǪǎǀǥǠǜƱǬǡǊƻ", (byte)122, 65);
                    NLoginCore_412.f[10] = NLoginCore_324.E("֠ծժ֑֣֪֜ւև֊։։ոָֆֆ֪֝տցւׂ։֊", (byte)122, 69);
                    NLoginCore_412.f[11] = NLoginCore_324.B("ǟǃǝƪǋǪǤǑǲǕƾǨǒǘǫƺǮƼƵǧƲǙǆǇ", (byte)122, 66);
                    NLoginCore_412.f[12] = NLoginCore_324.F("֠ծժ֑֣֪֜ւև֊֌֊֏֩־֋ֱֳ־֛֤֤֪֗֬֜֗֜֙֕ֈ֡", (byte)122, 70);
                    NLoginCore_412.f[13] = NLoginCore_559.B("ǛƺƫǋưƭƩǑǒƵǱǉǵƴǔǯƺǨǸǭǔǜǝǤǢȃǚǁǑȃȁǅ", (byte)122, 66);
                    NLoginCore_412.f[14] = NLoginCore_451.C("֐հ֚ղՒ։֖֣֓֜հ֖զ։֙ջտ֡ֆ֧֥կ֐ֲխ֑յրֶֶ֖֥", (byte)122, 67);
                    NLoginCore_412.f[15] = NLoginCore_384.D("֋ժ՛ջՠ՝ՙցւե֢֡֞֔՜֗֨։նց֠չնշ", (byte)122, 68);
                    NLoginCore_412.f[16] = NLoginCore_223.B("ǚƹǇƾǀƽǮǑǫƭƾƻ", (byte)122, 66);
                    NLoginCore_412.f[17] = NLoginCore_324.E("֞սծ֎ճհլ֔֕ոֶֈ֑֙֏ֳ֗ո֬֐ִַַ֢֕֓֓֞׀ֺ֍֍", (byte)122, 69);
                    NLoginCore_412.f[18] = NLoginCore_027.A("ǡǞƤǃǛǋǑǛǇǨǮǇǘǋǌǒƼǎǲǭǴǯǆǇ", (byte)122, 65);
                    NLoginCore_412.f[19] = NLoginCore_092.F("֞սծ֎ճհլ֔֕ոֶ֎ַ֓նռֺ֔֯տַ֐օֵֹֺֽׁ֤փ֨׃", (byte)122, 70);
                    NLoginCore_412.f[20] = NLoginCore_027.D("֑֎Քճ֋ջց֋շ֘֞ֈջ֥տ֘֟֎պ֡֨֟նշ", (byte)122, 68);
                    NLoginCore_412.f[21] = NLoginCore_138.C("֋ժ՛ջՠ՝ՙցւե֣սփբ֗դբ֙վ֢թծցճ֊֬ք֢֐ևֹճ֎֝֕ձշֱրռսռֶַַ֢֜׉ֻք֌ֿֿ֖֞֗", (byte)122, 67);
                    NLoginCore_412.f[22] = NLoginCore_559.A("ƻƧƼƦǎưǈƱǔǶǟƱǢǅǻƴǘǱƶǊǈǛǻǂǱǱǵǻǄǒȆǔǔǌȊǞȉǾǦǪȕȁǯȎǹȆȇǵǓȖǞǞǶǱȜǚȠȞǲșǻȑǧȫǫȋȅǨȤǣȆȓȐȊȬǻ", (byte)122, 65);
                    NLoginCore_412.f[23] = NLoginCore_173.E("֢֏քս֊֊էծַ֬հվ", (byte)122, 69);
                    NLoginCore_412.f[24] = NLoginCore_138.D("քեռ՛ճստն֐ղ֠ի", (byte)122, 68);
                    NLoginCore_412.f[25] = NLoginCore_076.E("֞֫֋֒վִ֪֯ւ֣֡֔֎֔։ֱ֘֓֙ջֲ֭։֊", (byte)122, 69);
                    NLoginCore_412.f[26] = NLoginCore_173.F("ըվְ֩֞ժ֢֍յ֓֕վ", (byte)122, 70);
                    NLoginCore_412.f[27] = NLoginCore_201.E("ծ։֍ղթֈ֟տֳ֢֚֕֏ֶ֑֍ֺ֚֔֬ռ֜։֊", (byte)122, 69);
                    NLoginCore_412.f[28] = NLoginCore_324.C("֋՘՞֒ճ֛֐֍ճւ֝բպւ֕ս֔֨ևցկ֦֠֯֫֐ְ֣֧֌ּ֛֕֗շ֟־׀ׁպս֜ց֋", (byte)122, 67);
                    NLoginCore_412.f[29] = NLoginCore_559.B("ƶƸǯǭƾǮǟǍǱƴǁǒǡǺǢǷǗǧǟǩǞǙǆǇ", (byte)122, 66);
                    NLoginCore_412.f[30] = NLoginCore_387.F("օ֧ց֑կ֓֝֗֫֯յչֹ֣֙նտ֪֌ֽ֝֜։֊", (byte)122, 70);
                    NLoginCore_412.f[31] = NLoginCore_076.E("֊փֈրսևծ֪֫ձցվ", (byte)122, 69);
                    NLoginCore_412.f[32] = NLoginCore_427.A("ƿǉǨǩǈǐǭǪǀǝǡǒǅǕǆǄǴǉǳǰǊǿǆǇ", (byte)122, 65);
                    NLoginCore_412.f[33] = NLoginCore_387.D("քնծ֒Ֆ֤֘֡չ֑աի", (byte)122, 68);
                    NLoginCore_412.f[34] = NLoginCore_559.A("ǙǛƮǆǮǉǆǫǴǞǨƮǷǺǲƷǊƺƽǊǚǿǆǇ", (byte)122, 65);
                    NLoginCore_412.f[35] = NLoginCore_427.F("֯կ֣֜֠֕քֵխַկչ֋ֆֽֆֱ֮֓֡֙֜։֊", (byte)122, 70);
                    NLoginCore_412.f[36] = NLoginCore_223.F("։ըպւ֑֩֊֊շַָվ", (byte)122, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_412.f[0] = NLoginCore_451.E("թծ֤֓֏հ֣։ַփ֧վ", (byte)122, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_412.f[0] = NLoginCore_173.B("ƩǂǧƫǮǄǤǡǈƭǲǊǆǎǰǇǮǮǞǿǴǉǆǇ", (byte)122, 66);
                }
            }
        }
    }

    public NLoginCore_412(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_j, (String)NLoginCore_412.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_412.c("㺃", (int)(y & z), (long)ab));
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_412.c("㺀", (int)gq, (long)(gr ^ gu)));
        String string = resultSet.getString((String)NLoginCore_412.c("㺃", (int)gv, (long)(gx ^ ha)));
        String string2 = resultSet.getString((String)NLoginCore_412.c("㺆", (int)hg, (long)(hi ^ hl)));
        long l = resultSet.getLong((String)NLoginCore_412.c("㺉", (int)hm, (long)(hn ^ hp)));
        UUID uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_412.c("㺌", (int)hy, (long)hz)));
        UUID uUID2 = NLoginCore_432.c(resultSet.getString((String)NLoginCore_412.c("㺏", (int)ic, (long)id)));
        if (string != null) {
            string = string.replace((CharSequence)NLoginCore_412.c("㺒", (int)(ie & cfr_renamed_0), (long)ig), (CharSequence)NLoginCore_412.c("㺕", (int)ii, (long)(ik ^ il)));
        }
        Consumer<ForceRegisterConfig> consumer = ForceRegisterConfig2 -> ForceRegisterConfig2.a(l, l);
        if (uUID2 != null) {
            this.a(this.r, string, string2, uUID, uUID2, consumer);
        } else {
            this.a(this.r, string, string2, uUID, consumer);
        }
    }
}

