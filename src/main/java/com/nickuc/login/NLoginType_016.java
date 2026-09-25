/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginType_026;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginType_016
extends Enum<NLoginType_016> {
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_a;
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_b;
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_c;
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_d;
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_e;
    public static final /* enum */ NLoginType_016 var_com_nickuc_login_NLoginType_016_f;
    public static final List<String> var_java_util_List_java_lang_String__t;
    public final String cR;
    public final String cS;
    public final SpawnType var_com_nickuc_login_api_enums_SpawnType_a;
    private static final /* synthetic */ NLoginType_016[] var_com_nickuc_login_NLoginType_016_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int var_int_e;
    private static long var_long_f;
    private static long g;
    private static int h;
    private static long i;
    private static long j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;
    private static long r;
    private static int s;
    private static long var_long_t;
    private static long u;
    private static int v;
    private static int w;
    private static long x;
    private static int y;
    private static long z;
    private static int aa;
    private static int ab;
    private static long ac;
    private static int ad;
    private static long ae;
    private static int af;
    private static long ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static int ak;
    private static long al;
    private static long am;
    private static int an;
    private static int ao;
    private static long ap;
    private static int aq;
    private static int ar;
    private static long as;
    private static long at;
    private static int au;
    private static int av;
    private static int aw;
    private static long ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static long be;
    private static int bf;
    private static int bg;
    private static int bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static long bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static int bt;
    private static int bu;
    private static int bv;
    private static int bw;
    private static long bx;
    private static int by;
    private static int bz;
    private static long ca;
    private static int cb;
    private static int cc;
    private static long cd;
    private static int ce;
    private static long cf;
    private static long cg;
    private static int ch;
    private static int ci;
    private static long cj;
    private static int ck;
    private static long cl;
    private static int cm;
    private static int cn;
    private static long co;
    private static int cp;
    private static int cq;
    private static long cr;
    private static long cs;
    private static int ct;
    private static long cu;
    private static int cv;
    private static int cw;
    private static long cx;
    private static int cy;
    private static int cz;
    private static long da;
    private static long db;
    private static int dc;
    private static long dd;
    private static long de;
    private static int df;
    private static long dg;
    private static long dh;
    private static int di;
    private static int dj;
    private static long dk;
    private static int dl;
    private static long dm;
    private static long dn;
    private static int cfr_renamed_1;
    private static long dp;
    private static long dq;
    private static int dr;
    private static int ds;
    private static int dt;
    private static long du;
    private static int dv;
    private static long dw;

    static {
        var_int_a = (0 >>> 247 | 0 << -247) & 0xFFFFFFFF;
        var_int_b = -1 >>> 238 | -1 << ~238 + 1;
        var_long_d = Long.reverse(-7645743546635613635L);
        var_int_e = (8192 >>> 205 | 8192 << -205) & 0xFFFFFFFF;
        var_long_f = Long.reverse(2154089242522585661L);
        g = Long.reverse(-8646911284551352320L);
        h = (16384 >>> 173 | 16384 << ~173 + 1) & 0xFFFFFFFF;
        i = Long.reverse(2154089242522585661L);
        j = Long.reverse(-8646911284551352320L);
        k = (3072 >>> 170 | 3072 << ~170 + 1) & 0xFFFFFFFF;
        l = Long.reverse(2154089242522585661L);
        m = Long.reverse(-8646911284551352320L);
        n = Integer.reverse(0x20000000);
        o = Integer.reverse(-1);
        p = Long.reverse(-7645743546635613635L);
        q = (327680 >>> 16 | 327680 << ~16 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-7645743546635613635L);
        s = (0x300000 >>> 83 | 0x300000 << -83) & 0xFFFFFFFF;
        var_long_t = Long.reverse(2154089242522585661L);
        u = Long.reverse(-8646911284551352320L);
        v = 0x1C00000 >>> 150 | 0x1C00000 << ~150 + 1;
        w = Integer.reverse(-1);
        x = Long.reverse(-7645743546635613635L);
        y = Integer.reverse(0x10000000);
        z = Long.reverse(-7645743546635613635L);
        aa = 589824 >>> 16 | 589824 << -16;
        ab = Integer.reverse(-1);
        ac = Long.reverse(-7645743546635613635L);
        ad = (0x140000 >>> 113 | 0x140000 << -113) & 0xFFFFFFFF;
        ae = Long.reverse(-7645743546635613635L);
        af = Integer.reverse(-805306368);
        ag = Long.reverse(-7645743546635613635L);
        ah = (393216 >>> 239 | 393216 << ~239 + 1) & 0xFFFFFFFF;
        ai = (-1 >>> 14 | -1 << ~14 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(-7645743546635613635L);
        ak = (851968 >>> 240 | 851968 << ~240 + 1) & 0xFFFFFFFF;
        al = Long.reverse(2154089242522585661L);
        am = Long.reverse(-8646911284551352320L);
        an = -1 >>> 153 | -1 << ~153 + 1;
        ao = Integer.reverse(0x70000000);
        ap = Long.reverse(-7645743546635613635L);
        aq = Integer.reverse(0);
        ar = Integer.reverse(-268435456);
        as = Long.reverse(2154089242522585661L);
        at = Long.reverse(-8646911284551352320L);
        au = 2 >>> 1 | 2 << ~1 + 1;
        av = (131072 >>> 205 | 131072 << -205) & 0xFFFFFFFF;
        aw = Integer.reverse(-1);
        ax = Long.reverse(-7645743546635613635L);
        ay = 131072 >>> 240 | 131072 << ~240 + 1;
        az = 17 >>> 128 | 17 << ~128 + 1;
        ba = Long.reverse(-7645743546635613635L);
        bb = (0x1800000 >>> 215 | 0x1800000 << -215) & 0xFFFFFFFF;
        bc = Integer.reverse(0x48000000);
        bd = Integer.reverse(-1);
        be = Long.reverse(-7645743546635613635L);
        bf = (2048 >>> 201 | 2048 << -201) & 0xFFFFFFFF;
        bg = Integer.reverse(-939524096);
        bh = (-1 >>> 19 | -1 << -19) & 0xFFFFFFFF;
        bi = Long.reverse(-7645743546635613635L);
        bj = Integer.reverse(-1610612736);
        bk = 5 >>> 222 | 5 << ~222 + 1;
        bl = (-1 >>> 68 | -1 << -68) & 0xFFFFFFFF;
        bm = Long.reverse(-7645743546635613635L);
        bn = (0xC00000 >>> 85 | 0xC00000 << -85) & 0xFFFFFFFF;
        bo = Integer.reverse(0);
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0x40000000);
        br = 0xC00000 >>> 86 | 0xC00000 << ~86 + 1;
        bs = 131072 >>> 47 | 131072 << ~47 + 1;
        bt = Integer.reverse(-1610612736);
        bu = Integer.reverse(-469762048);
        bv = 4992 >>> 7 | 4992 << ~7 + 1;
        bw = Integer.reverse(-1476395008);
        bx = Long.reverse(-7645743546635613635L);
        by = 0 >>> 106 | 0 << -106;
        bz = Integer.reverse(0x68000000);
        ca = Long.reverse(-7645743546635613635L);
        cb = -2147483637 >>> 127 | -2147483637 << ~127 + 1;
        cc = -1 >>> 194 | -1 << -194;
        cd = Long.reverse(-7645743546635613635L);
        ce = Integer.reverse(0x18000000);
        cf = Long.reverse(2154089242522585661L);
        cg = Long.reverse(-8646911284551352320L);
        ch = Integer.reverse(Integer.MIN_VALUE);
        ci = (12800 >>> 9 | 12800 << -9) & 0xFFFFFFFF;
        cj = Long.reverse(-7645743546635613635L);
        ck = (0x6800000 >>> 118 | 0x6800000 << ~118 + 1) & 0xFFFFFFFF;
        cl = Long.reverse(-7645743546635613635L);
        cm = 221184 >>> 205 | 221184 << -205;
        cn = (-1 >>> 43 | -1 << ~43 + 1) & 0xFFFFFFFF;
        co = Long.reverse(-7645743546635613635L);
        cp = (0x8000000 >>> 122 | 0x8000000 << ~122 + 1) & 0xFFFFFFFF;
        cq = Integer.reverse(0x38000000);
        cr = Long.reverse(2154089242522585661L);
        cs = Long.reverse(-8646911284551352320L);
        ct = Integer.reverse(-1207959552);
        cu = Long.reverse(-7645743546635613635L);
        cv = 0xF00000 >>> 115 | 0xF00000 << -115;
        cw = Integer.reverse(-1);
        cx = Long.reverse(-7645743546635613635L);
        cy = 3 >>> 224 | 3 << ~224 + 1;
        cz = 124 >>> 66 | 124 << ~66 + 1;
        da = Long.reverse(2154089242522585661L);
        db = Long.reverse(-8646911284551352320L);
        dc = Integer.reverse(0x4000000);
        dd = Long.reverse(2154089242522585661L);
        de = Long.reverse(-8646911284551352320L);
        df = Integer.reverse(-2080374784);
        dg = Long.reverse(2154089242522585661L);
        dh = Long.reverse(-8646911284551352320L);
        di = (2048 >>> 105 | 2048 << ~105 + 1) & 0xFFFFFFFF;
        dj = Integer.reverse(0x44000000);
        dk = Long.reverse(-7645743546635613635L);
        dl = Integer.reverse(-1006632960);
        dm = Long.reverse(2154089242522585661L);
        dn = Long.reverse(-8646911284551352320L);
        cfr_renamed_1 = (0x1200000 >>> 83 | 0x1200000 << -83) & 0xFFFFFFFF;
        dp = Long.reverse(2154089242522585661L);
        dq = Long.reverse(-8646911284551352320L);
        dr = Integer.reverse(-1610612736);
        ds = Integer.reverse(-1543503872);
        dt = Integer.reverse(-1);
        du = Long.reverse(-7645743546635613635L);
        dv = Integer.reverse(0x64000000);
        dw = Long.reverse(-7645743546635613635L);
        var_java_lang_String_arr_a = new String[bu];
        var_java_lang_String_arr_b = new String[bv];
        NLoginType_016.b();
        var_com_nickuc_login_NLoginType_016_a = new NLoginType_016((String)NLoginType_016.c("㺃", (int)bz, (long)ca), (String)NLoginType_016.c("㺆", (int)(cb & cc), (long)cd), SpawnType.JOIN);
        var_com_nickuc_login_NLoginType_016_b = new NLoginType_016((String)NLoginType_016.c("㺌", (int)ci, (long)cj), (String)NLoginType_016.c("㺏", (int)ck, (long)cl), SpawnType.FIRST_JOIN);
        var_com_nickuc_login_NLoginType_016_c = new NLoginType_016((String)NLoginType_016.c("㺕", (int)cq, (long)(cr ^ cs)), (String)NLoginType_016.c("㺘", (int)ct, (long)cu), SpawnType.LOGIN);
        var_com_nickuc_login_NLoginType_016_d = new NLoginType_016((String)NLoginType_016.c("㺞", (int)cz, (long)(da ^ db)), (String)NLoginType_016.c("㺡", (int)dc, (long)(dd ^ de)), SpawnType.REGISTER);
        var_com_nickuc_login_NLoginType_016_e = new NLoginType_016((String)NLoginType_016.c("㺧", (int)dj, (long)dk), (String)NLoginType_016.c("㺪", (int)dl, (long)(dm ^ dn)), SpawnType.RESPAWN);
        var_com_nickuc_login_NLoginType_016_f = new NLoginType_016((String)NLoginType_016.c("㺰", (int)(ds & dt), (long)du), (String)NLoginType_016.c("㺳", (int)dv, (long)dw), null);
        var_com_nickuc_login_NLoginType_016_arr_a = NLoginType_016.a();
        var_java_util_List_java_lang_String__t = Arrays.stream(NLoginType_016.values()).map(NLoginType_0162 -> NLoginType_0162.cR).collect(Collectors.toList());
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public static NLoginType_016 a(String var0) {
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

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_016.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.C("ӽԟԡԁԥՄԼՒԾԍՋՁՏՉԒԷՙ՘ՐՖՐԥ", (byte)96, 67), NLoginType_016.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.B("ƢƯƮűƱƭƨƱƼƫŸƶƺƳƶƼžԑԂԆԍԐӵӪԈԡԎԑԐӷƗ", (byte)96, 66) + string + NLoginCore_201.D("ԏ", (byte)96, 68) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ NLoginType_016[] a() {
        NLoginType_016[] NLoginType_016Array = new NLoginType_016[bn];
        NLoginType_016Array[NLoginType_016.bo] = var_com_nickuc_login_NLoginType_016_a;
        NLoginType_016Array[NLoginType_016.bp] = var_com_nickuc_login_NLoginType_016_b;
        NLoginType_016Array[NLoginType_016.bq] = var_com_nickuc_login_NLoginType_016_c;
        NLoginType_016Array[NLoginType_016.br] = var_com_nickuc_login_NLoginType_016_d;
        NLoginType_016Array[NLoginType_016.bs] = var_com_nickuc_login_NLoginType_016_e;
        NLoginType_016Array[NLoginType_016.bt] = var_com_nickuc_login_NLoginType_016_f;
        return NLoginType_016Array;
    }

    public String d(boolean bl) {
        switch (this.ordinal()) {
            case 0: {
                return bl ? NLoginType_016.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d) : NLoginType_016.c("㺃", (int)var_int_e, (long)(var_long_f ^ g));
            }
            case 1: {
                return bl ? NLoginType_016.c("㺆", (int)h, (long)(i ^ j)) : NLoginType_016.c("㺉", (int)k, (long)(l ^ m));
            }
            case 2: {
                return bl ? NLoginType_016.c("㺌", (int)(n & o), (long)p) : NLoginType_016.c("㺏", (int)q, (long)r);
            }
            case 3: {
                return bl ? NLoginType_016.c("㺒", (int)s, (long)(var_long_t ^ u)) : NLoginType_016.c("㺕", (int)(v & w), (long)x);
            }
            case 4: {
                return bl ? NLoginType_016.c("㺘", (int)y, (long)z) : NLoginType_016.c("㺛", (int)(aa & ab), (long)ac);
            }
            case 5: {
                return bl ? NLoginType_016.c("㺞", (int)ad, (long)ae) : NLoginType_016.c("㺡", (int)af, (long)ag);
            }
        }
        throw new IllegalArgumentException((String)NLoginType_016.c("㺤", (int)(ah & ai), (long)aj) + (Object)((Object)this));
    }

    public static NLoginType_016 a(SpawnType spawnType) {
        switch (NLoginType_026.ah[spawnType.ordinal()]) {
            case 1: {
                return var_com_nickuc_login_NLoginType_016_a;
            }
            case 2: {
                return var_com_nickuc_login_NLoginType_016_b;
            }
            case 3: {
                return var_com_nickuc_login_NLoginType_016_c;
            }
            case 4: {
                return var_com_nickuc_login_NLoginType_016_d;
            }
            case 5: {
                return var_com_nickuc_login_NLoginType_016_e;
            }
        }
        throw new IllegalArgumentException((String)NLoginType_016.c("㺀", (int)(bk & bl), (long)bm) + spawnType);
    }

    private static String a(int n, long l) {
        l ^= 0x11L;
        l ^= 0x444EE4EF9950B2B8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(40 + 29), 83, (byte)(5 + 42), (byte)(30 + 37), (byte)(33 + 33), (byte)(17 + 50), (byte)(13 + 34), (byte)(43 + 37), (byte)(71 + 4), (byte)(41 + 26), (byte)(50 + 33), (byte)(12 + 41), (byte)(20 + 60), (byte)(74 + 23), 100, (byte)(53 + 47), (byte)(37 + 68), (byte)(87 + 23), (byte)(95 + 8)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҹҪҮҵҸҝҒҰӉҶҹҸҟ", (byte)52, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_016.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public String aE() {
        return (String)NLoginType_016.c("㺀", (int)ak, (long)(al ^ am)) + this.cR;
    }

    @Generated
    private NLoginType_016(String string2, String string3, SpawnType spawnType) {
        this.cR = string2;
        this.cS = string3;
        this.var_com_nickuc_login_api_enums_SpawnType_a = spawnType;
    }

    public static NLoginType_016 valueOf(String string) {
        return Enum.valueOf(NLoginType_016.class, string);
    }

    public static NLoginType_016[] values() {
        return (NLoginType_016[])var_com_nickuc_login_NLoginType_016_arr_a.clone();
    }

    private static void b() {
        int n;
        var_long_c = -4877063272974833736L;
        long l = var_long_c ^ 0x444EE4EF9950B2B8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(43 + 40), (byte)(10 + 37), (byte)(38 + 29), (byte)(22 + 44), (byte)(45 + 22), (byte)(25 + 22), (byte)(37 + 43), (byte)(28 + 47), (byte)(19 + 48), (byte)(31 + 52), (byte)(10 + 43), (byte)(56 + 24), (byte)(20 + 77), (byte)(88 + 12), (byte)(67 + 33), (byte)(93 + 12), 110, (byte)(10 + 93)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
                    NLoginType_016.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫүӹӁӄӘӷӪһӸӺҺӂӕӲӑәӜӆӡӪӽӺӑ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄոընՓ։քՖֈ՛ոի", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[2] = NLoginCore_004.B("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĽƇŏŒŦƅŸŉƆƈňŉƀťƈƉŞŶťŹťŌŕƜƈƋŧƛƗŶƝŖſƀŻƝŨſƉƀźƝŽ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[3] = NLoginCore_559.C("ҿӤҷӜҟҟӚҠҧңҿӫӣӁӃҭӆӎҦҲҵӬӄӂӏӚҺҳӗһӬӢӪҾӽӥӦԂӧҿӡӘӚӨӎӹӠԏԋӐӨӽԊӧӭӋԍԆӳӏԉӜӴӯ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[4] = NLoginCore_091.A("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĿłŶšňŨŖŇƉŊťƐƐňœŪŏŦŢŤŸƐş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[5] = NLoginCore_027.A("ōŲŅŪĭĭŨĮĵıōŇŇźŦŨňĺŴŀŷœľŽŝƆŁſŞŮƆŞŜƊŬƈƕōŠƏŒƕőş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[6] = NLoginCore_427.A("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĿƆŹƆŢūƂŴŖŽƐžťűżƕƏƍųŖƗƘş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[7] = NLoginCore_092.B("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŵŞĹŅńŞſƌŽƋŁŊƌŉŜŌŌŔŵŗŬřş", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[8] = NLoginCore_076.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫҳҪӳӱҷӜӰӵӨӷҷӣҿӴӗԂӢԉӻӹәӇӑ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[9] = NLoginCore_091.C("ҿӤҷӜҟҟӚҠҧңҼҩҥӗӫүӚӭӎӧӁӦӦӢӔһӓӑӚҽӜԀӿӰҶӖӄӕӛӘӨӁӃӑ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[10] = NLoginCore_092.E("խԺժ՝ՄԾՖՍպզՇպՒվՑԻՊրլՒԼաճՖ՗ռՕլչ՛Պ՝ՠրիտփէծձՑպկյկՔն֋հ֖Օ֤֞֘պ֙ռ֔֬նչ֋ֆծջ֋֔ռ֖֓թր֓֍պր", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[11] = NLoginCore_027.E("խԨՅծԯըՎ՗ՐՐՍլԶծՠԶՁՒՌլֆՏ՞ՙճի՜՚էՎՊ՘զ՞ՎՎՍվփքթ֕֋՗էի՜֛֊֓ր֥֤֠֔պֱ֪֦֢֤֦֝֝֩֘֘֡հկֱֲօֹ֬ր", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[12] = NLoginCore_076.D("ҭӕңӅӔӡӄҵҥӇҴҿӎҾҬҼӜӇӎӉӦүӥӕӂӓӰһӹҶҶӌӀӛӥӸӝԀӀӜӨӡӃӑ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[13] = NLoginCore_138.F("ըՆհՎՏՔնՇԷպ՗Հ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[14] = NLoginCore_138.C("ӞҜӓӥӎӘӡӤӜӔӌұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[15] = NLoginCore_559.E("ԽԤմխըմՑՖպչ՚թԼՆԻծՕԴՀդ՜՞ՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[16] = NLoginCore_223.F("՚ՃԭՂԿդզեՂՈ՗Հ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[17] = NLoginCore_384.E("ԾԻձժՑձՊԲՁէէԮոոՉչՀվիմն՞ՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[18] = NLoginCore_223.C("ӃҰӥҝҞңҴҦҹҧӚұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[19] = NLoginCore_451.D("ұҲӑҡңӣӒӢҤӗӠҨӨҦӍӧӮӌӲӝӇӏҼҽ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[20] = NLoginCore_027.E("ԼդԲՔգհՓՄԴՖՃՎ՝ՍԻՋիՖ՝՘յԾմդՑբտՊֈՅՅ՛Տժմևլ֏ՏիշհՒՠ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[21] = NLoginCore_384.A("ĩśļŬŅōŋİŊĸĹĿ", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[22] = NLoginCore_559.B("ŬĪšųŜŦůŲŪŢŚĿ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[23] = NLoginCore_384.C("ҷҠҹҼӥӀӥқҾӌӚұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[24] = NLoginCore_559.F("ՁՋ՟ՈՊգդՕՌթնթ՗Ս՟ՎբվԹՙեմՋՌ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[25] = NLoginCore_201.A("ļģųŬŧųŐŕŹŸřŨĻŅĺŭŔĳĿţśŝŊŋ", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[26] = NLoginCore_559.B("ĩļŁŋņŀŭŨŖźńŻŎųĹŘŜũŕźľƃŊŋ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[27] = NLoginCore_027.E("ԪԩՑՋղՒՅԸէԷխՀ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[28] = NLoginCore_223.A("řłĬŁľţťŤŁŇŖĿ", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[29] = NLoginCore_384.E("ՏիՃՁԯ՟ճՔՄմՋՀ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[30] = NLoginCore_324.B("ľĭŀŧūōŗŉōųŗŭŌŽŬĶŬŭŹƃĻųŊŋ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[31] = NLoginCore_076.B("ĽĺŰũŐŰŉıŀŦŦĭŷŷňŸĿŽŪųŵŝŊŋ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[32] = NLoginCore_138.C("ҽҷқүҦұӈӜҲҽӗӍӍҧөӥӣҬҫӳӒӵҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[33] = NLoginCore_201.D("ӞӌӜҽңүһӢӆӟӈұ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[34] = NLoginCore_173.C("ӃҰӥҝҞңҴҦҹҧӚұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[35] = NLoginCore_201.E("԰՟ՏԮՇՇաՓՒգՋՀ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[36] = NLoginCore_076.C("ӂҝӗҜӧӤӦҲӀҢӬӎҼӤҩӥӉӆҬӀӅӵҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[37] = NLoginCore_223.B("ĿŀşįıűŠŰĲťŮĶŶĴśŵżŚƀūŕŝŊŋ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[38] = NLoginCore_110.C("ҔҳӔҤӦҡӘӘһҢӁҼӎӋҰӄӜӔҽӵӶӏҼҽ", (byte)60, 67);
                    continue block7;
                }
                case 1: {
                    NLoginType_016.var_java_lang_String_arr_b[0] = NLoginCore_027.E("՞ՆՁՁՇՄկՈԴՖԵՓԼյԱՊԼ՟ն՜պԾֈՐՓէֆչՊև։ՉՎխռՐ֋֓թ֍Ւէգՠ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[1] = NLoginCore_173.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄտցոէտԽս֊֎֍֌ՊձգՒ֕Րգէն֎իՠ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[2] = NLoginCore_076.D("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫүӹӁӄӘӷӪһӸӺҺһӲӗӺӻӐӨӗӫӗҾӇԎӺӽәԍԉӨԏӈӿԖԆӤӼӥӝԘӕӞӬ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[3] = NLoginCore_173.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄջՓՑ՞թՉՂզՊջձչՍ֌մյ֑նՎհէթշ՝ֈկ֚֞՟շ֌֙յձհղ֟֗֙քևա֝", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[4] = NLoginCore_451.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫұҴӨӓҺӚӈҹӻҼӗӑәӽӑӔӥӀҿӤԋӤӚԁӦӨӌӽԐӭԃӠӟӜӝ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ōŲŅŪĭĭŨĮĵıōŇŇźŦŨňĺŴŀŷœľŽŝƆŁſŞŮƆŞřźżƎƀƒƑƅŨƎƇƇŰŝƉŻƔŚŸƑŜƣŪū", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[6] = NLoginCore_387.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫұӸӫӸӔӝӴӦӈӯԂҺҵӶӓӦӄӣԁӛԌӡӣԏӊӇӠԒԇөӬԐӟӜӝ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[7] = NLoginCore_559.B("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŵŞĹŅńŞſƌŽƋŁƊƃſŲņŋŲƖŬœŗŻƒƙŹřſƊŷŞŸƣŪū", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[8] = NLoginCore_559.B("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹŁĸƁſŅŪžƃŶƅŅşƉƄŊŪŶőƐƔŋůƈŹŦŚŞƓƞƁƣƔƣŪū", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[9] = NLoginCore_138.A("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŴŴŰŢŉšşŨŋŪƎŜźŧšůŋŖƖƁŒŪş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[10] = NLoginCore_138.F("խԺժ՝ՄԾՖՍպզՇպՒվՑԻՊրլՒԼաճՖ՗ռՕլչ՛Պ՝ՠրիտփէծձՑպկյկՔն֋հ֖Օ֤֞֘պ֙ռ֔֬նչ֋ֆծրծիզ֦վրո֚֗փր", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[11] = NLoginCore_138.F("խԨՅծԯըՎ՗ՐՐՍլԶծՠԶՁՒՌլֆՏ՞ՙճի՜՚էՎՊ՘զ՞ՎՎՍվփքթ֕֋՗էի՜֛֊֓ր֥֤֠֔պ֪֦֢֝֝֩֘֘ֆֈ։քֈֱֵ֧֨չղր", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[12] = NLoginCore_427.A("ĻţıœŢůŒŃĳŕłōŜŌĺŊŪŕŜŗŴĽųţŐšžŉƇńńŚťōƈſņŽŌŠŏƕƈş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[13] = NLoginCore_092.C("ҲӂӎӜҺұӄӞӨӇҦӄҹҿӁӮӈӤӈӝӒӥҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[14] = NLoginCore_138.C("һӏӀңұһӐӗӠӤӊҷӮӢӇҨӆҬӑӶӀӥҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[15] = NLoginCore_138.C("ҮҕӥӞәӥӂӇӫӪӉӝһҫҭҿӳӂӪӞӯӥҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[16] = NLoginCore_138.E("ը՛թ՞յՖՌլԷջթՖՙտԹԽձՑշբՂքՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[17] = NLoginCore_559.C("үҬӢӛӂӢһңҲӘӖӣӢӪӏӌӪӄҪӑӋӥҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[18] = NLoginCore_091.E("ԯԭՄ՞ՋՋԮԪշՔՇխԶՑ՝ԺՙռլչՃ՞ՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[19] = NLoginCore_559.D("ұҲӑҡңӣӒӢҤӗӞҶҤӃҧӏӳҾӊӆӮӤӗҹҴҭӲӭӑӺӎӶ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[20] = NLoginCore_091.A("ĻţıœŢůŒŃĳŕłōŜŌĺŊŪŕŜŗŴĽųţŐšžŉƇńńŚŪƅŨƑſŲŔƂƘŵőş", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[21] = NLoginCore_453.F("Չ՟ԭՆՏԳեչՂՂԶՀ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[22] = NLoginCore_384.D("ҞұӢҜҘүӂӦҲӛҺӞҮӐӇҾӨӓөӞӟӏҼҽ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[23] = NLoginCore_201.D("ҢҸӠҸӛӑҿҥҢӞӛӁӇәӦӋӈҪҽҿӯҿҼҽ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[24] = NLoginCore_446.E("ՁՋ՟ՈՊգդՕՌթն՘ոՙԾց՗ՑՓխՅմՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[25] = NLoginCore_004.F("ԽԤմխըմՑՖպչ՚Վյ՚է՜ծա՜ո՛՞ՋՌ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[26] = NLoginCore_223.D("қҮҳҽҸҲӟӚӈӬҵҺӏҬҧҫӞӒӏӰӳҿҼҽ", (byte)60, 68);
                    NLoginType_016.var_java_lang_String_arr_b[27] = NLoginCore_004.C("ҴӁҳҷӎӃӇӘӝӈҫұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[28] = NLoginCore_027.E("՜ՀաըԯԮԿՖժկյՀ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[29] = NLoginCore_201.C("ӁҬңҾӧӘӆөӋӨӖұ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[30] = NLoginCore_091.C("ҰҟҲәӝҿӉһҿӥӉӛӦӃүҧӍӃӔҳӐҿҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[31] = NLoginCore_027.B("ĽĺŰũŐŰŉıŀŦťĭŵĸũŷŕĹţŞƄōŊŋ", (byte)60, 66);
                    NLoginType_016.var_java_lang_String_arr_b[32] = NLoginCore_384.A("ŋŅĩĽĴĿŖŪŀŋŤŵļŧŷŹŚŲőūŮŝŊŋ", (byte)60, 65);
                    NLoginType_016.var_java_lang_String_arr_b[33] = NLoginCore_223.F("԰աՏՠՃը՘ՠ՗նՍԷ՘ՉձծՖվհ՗րքՋՌ", (byte)60, 70);
                    NLoginType_016.var_java_lang_String_arr_b[34] = NLoginCore_173.C("ҳӐҰӤҲӝҤҟӕҫҵҸӭәӪӰӄҾӬӋӱӏҼҽ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[35] = NLoginCore_027.E("԰լԫՠՕԬեՋչՅդԷՓյիԹծԹՓ՝ՒՎՋՌ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[36] = NLoginCore_453.E("ՑԬզԫնճյՁՏԱպյԻՏՏ՟Քն՟ՑահԿ՘ՈՈը՜ո֏Շֆ", (byte)60, 69);
                    NLoginType_016.var_java_lang_String_arr_b[37] = NLoginCore_223.C("ұҲӑҡңӣӒӢҤӗӟӬҪӗӬҿӇӲӬӝҮҰӯӐҬҺҷӓӆҷӝӿ", (byte)60, 67);
                    NLoginType_016.var_java_lang_String_arr_b[38] = NLoginCore_004.D("ҔҳӔҤӦҡӘӘһҢӂӂӘҽҢҧҮҩӠӲӱҿҼҽ", (byte)60, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_016.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ҚҠҚӂҵұӞӢҡӟӦӆӤӝҰӦҫүӁҵӵӥҼҽ", (byte)60, 68);
                    continue block7;
                }
                case 4: {
                    NLoginType_016.var_java_lang_String_arr_b[0] = NLoginCore_091.E("՝ԬխՏՇՌՏ՘ՑՂՄՐԽտԾԲպՒՔհ՚՞ՋՌ", (byte)60, 69);
                }
            }
        }
    }
}

