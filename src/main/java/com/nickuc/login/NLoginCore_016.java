/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Bukkit
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;

public final class NLoginCore_016 {
    private static int ba;
    private static int var_int_al;
    private static long ag;
    private static int r;
    private static int y;
    private static long var_long_c;
    private static int ar;
    private static int ai;
    private static int u;
    private static long var_long_am;
    private static long e;
    private static long d;
    private static long s;
    private static long z;
    private static long az;
    private static int au;
    private static int af;
    private static int ac;
    private static int var_int_b;
    private static int t;
    private static String[] var_java_lang_String_arr_a;
    private static long h;
    private static long bc;
    private static final String var_java_lang_String_aj;
    private static int ab;
    private static int as;
    private static String[] var_java_lang_String_arr_b;
    private static long ae;
    private static int m;
    private static long l;
    private static long var_long_aj;
    private static int x;
    private static int ax;
    private static long v;
    private static long var_long_ak;
    private static int ad;
    private static long i;
    private static long p;
    private static long at;
    private static long an;
    private static long o;
    private static long aw;
    private static final String var_java_lang_String_am;
    private static int n;
    private static long ah;
    private static int k;
    private static int g;
    private static int var_int_a;
    private static int ao;
    private static int j;
    private static final String var_java_lang_String_ak;
    private static long bb;
    private static int q;
    private static long ap;
    private static long w;
    private static long aq;
    private static long aa;
    private static final Pattern var_java_util_regex_Pattern_c;
    private static long av;
    private static int f;
    private static long ay;
    private static final String var_java_lang_String_al;

    private static String a(int n, long l) {
        l ^= 0x34L;
        l ^= 0xC7989650EEFE2C6FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(36 + 33), (byte)(25 + 58), (byte)(26 + 21), (byte)(51 + 16), (byte)(52 + 14), (byte)(5 + 62), (byte)(12 + 35), (byte)(27 + 53), (byte)(63 + 12), (byte)(14 + 53), (byte)(10 + 73), (byte)(2 + 51), (byte)(60 + 20), (byte)(12 + 85), (byte)(49 + 51), (byte)(65 + 35), 105, (byte)(70 + 40), (byte)(85 + 18)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(15 + 54), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऎऋःआंउࣾ࣠ईऀ", (byte)121, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_016.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -3489093126098339525L;
        long l = var_long_c ^ 0xC7989650EEFE2C6FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(29 + 40), 83, (byte)(17 + 30), (byte)(33 + 34), (byte)(26 + 40), (byte)(35 + 32), (byte)(12 + 35), 80, (byte)(71 + 4), (byte)(22 + 45), (byte)(24 + 59), (byte)(47 + 6), (byte)(19 + 61), (byte)(13 + 84), (byte)(59 + 41), (byte)(8 + 92), (byte)(17 + 88), (byte)(25 + 85), (byte)(91 + 12)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_016.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ӣҮӣҼӥҲӪӏӭӄҷҽ", (byte)64, 68);
                    NLoginCore_016.var_java_lang_String_arr_b[1] = NLoginCore_173.A("ĲťųōťŰœŧŭĿƀŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[2] = NLoginCore_387.A("ŪůůŏũŕŖıŘšŴŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[3] = NLoginCore_110.A("œŪŮķųŷŜŖŚŌżŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[4] = NLoginCore_387.A("ŐŬŇŹŹřŘűşĽŎŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[5] = NLoginCore_138.E("ԯՓդԴԴ՛ԳժՕնՒԲՋՙ՜՘քփֆՓն՚ՊպխցՊձ֌տճղ", (byte)64, 69);
                    NLoginCore_016.var_java_lang_String_arr_b[6] = NLoginCore_223.B("ūŴŰĭŨŒſĹſœŰŇ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[7] = NLoginCore_173.D("өҿҧӚҭӋӀӵӢҭӕӤӒӄӬӋӫӷӽҳӎӱӈӉ", (byte)64, 68);
                    NLoginCore_016.var_java_lang_String_arr_b[8] = NLoginCore_324.E("ՃԴՖՍՂՑՇՆճԴ՟իՔՏԿտՑճ՝ՃՖա՘֌ք֏եժՋջբՌ", (byte)64, 69);
                    NLoginCore_016.var_java_lang_String_arr_b[9] = NLoginCore_091.B("œūśŭŜŪŞŝſźŔĿŶŔŎűšřņƅŢƍňŨƄŏŽŤƈųœŵ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[10] = NLoginCore_223.D("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӚӑԅӽԈӞӣӄӴӛӅ", (byte)64, 68);
                    NLoginCore_016.var_java_lang_String_arr_b[11] = NLoginCore_027.B("œūśŭŜŪŞŝſźœŘŠŔźĹŚţŲŵŊťŒœ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[12] = NLoginCore_387.B("ņķřŐŅŔŊŉŶķŢŮŗŒłƂŔŶŠņřŤśƏƇƒŨŭŎžťŏ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[13] = NLoginCore_384.A("ŭĸŭņůļŴřŷŎŁŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[14] = NLoginCore_004.A("ūŴŰĭŨŒſĹſœŰŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[15] = NLoginCore_092.B("ŭĸŭņůļŴřŷŎŁŇ", (byte)64, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_016.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ҾӗҽһӛһӞүӤҿӲҽ", (byte)64, 68);
                    NLoginCore_016.var_java_lang_String_arr_b[1] = NLoginCore_004.C("әӗһӢӚӮӆӋӢӥӐҽ", (byte)64, 67);
                    NLoginCore_016.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ՀԮՂճյԴծԵպժսՄ", (byte)64, 70);
                    NLoginCore_016.var_java_lang_String_arr_b[3] = NLoginCore_091.A("ŇŪũũŘĳſŒŖőŒŇ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[4] = NLoginCore_384.F("ձՊխՃ՘ծլԼՉ՞ճնտռՌկզԽքպՕՒՏՐ", (byte)64, 70);
                    NLoginCore_016.var_java_lang_String_arr_b[5] = NLoginCore_453.F("ԯՓդԴԴ՛ԳժՕնՒԲՋՙ՜՘քփֆՓն՗ՉրՌտդՌֆդ՝֓", (byte)64, 70);
                    NLoginCore_016.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ӘӊҭӱӒӍӆӡӷӘҳҽ", (byte)64, 68);
                    NLoginCore_016.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ųŉıŤķŕŊſŬķŞĵŤŻżłőũŖƊƋťŒœ", (byte)64, 65);
                    NLoginCore_016.var_java_lang_String_arr_b[8] = NLoginCore_223.B("ņķřŐŅŔŊŉŶķŢŮŗŒłƂŔŶŠņřŠƌŞŌƄūƏƈŴƎōűƕŲŨűŷƇƒųżƜŧ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[9] = NLoginCore_173.F("Րը՘ժՙէ՛՚ռշՑԼճՑՋծ՞ՖՃւ՟ֈ՗ֈսժ՜խ֏֊Սբ", (byte)64, 70);
                    NLoginCore_016.var_java_lang_String_arr_b[10] = NLoginCore_091.C("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӏӣԀӞӒӑӈӦӺӵӶӈӫԀԒӞӯӨԅԁӬԖӝ", (byte)64, 67);
                    NLoginCore_016.var_java_lang_String_arr_b[11] = NLoginCore_324.B("œūśŭŜŪŞŝſźŕŐōśĽřņĻƊŬžŻŒœ", (byte)64, 66);
                    NLoginCore_016.var_java_lang_String_arr_b[12] = NLoginCore_324.C("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӚӺӐӱӨӘӠӜӥӼԌӜԎԋӊԍԐӑӶӏӱԊӝ", (byte)64, 67);
                    NLoginCore_016.var_java_lang_String_arr_b[13] = NLoginCore_223.E("ՂգնՁՕղԶԴխՈԶՄ", (byte)64, 69);
                    NLoginCore_016.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ԵհՕԴբնՋՍ՚՚ԾՄ", (byte)64, 69);
                    NLoginCore_016.var_java_lang_String_arr_b[15] = NLoginCore_427.E("մՊեՈՎԵՆպԸոչՄ", (byte)64, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_016.var_java_lang_String_arr_b[0] = NLoginCore_027.F("եԲԮբ՗նՒշՒՔԶաչփՌւհՖՅ՘ւֈՏՐ", (byte)64, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_016.var_java_lang_String_arr_b[0] = NLoginCore_384.F("կՇձ՘ՐըԱԸլզՓՄ", (byte)64, 70);
                }
            }
        }
    }

    @Generated
    private NLoginCore_016() {
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_016.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.E("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)1, 69), NLoginCore_016.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.A("äñð³óïêóþíºøüõøþÀњїяђюѕъЬєьÖ", (byte)1, 65) + string + NLoginCore_091.F("ӷ", (byte)1, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0x10000000 >>> 156 | 0x10000000 << -156) & 0xFFFFFFFF;
        var_int_b = 0 >>> 100 | 0 << ~100 + 1;
        d = Long.reverse(-2549770258386638349L);
        e = Long.reverse(0x2C00000000000000L);
        f = Integer.reverse(-1);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-2549770258386638349L);
        i = Long.reverse(0x2C00000000000000L);
        j = (0 >>> 17 | 0 << ~17 + 1) & 0xFFFFFFFF;
        k = Integer.reverse(0x40000000);
        l = Long.reverse(-1108618377628079629L);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(-2549770258386638349L);
        p = Long.reverse(0x2C00000000000000L);
        q = Integer.reverse(0x40000000);
        r = (0x10000000 >>> 186 | 0x10000000 << ~186 + 1) & 0xFFFFFFFF;
        s = Long.reverse(-1108618377628079629L);
        t = (0x600000 >>> 21 | 0x600000 << -21) & 0xFFFFFFFF;
        u = 20 >>> 162 | 20 << -162;
        v = Long.reverse(-2549770258386638349L);
        w = Long.reverse(0x2C00000000000000L);
        x = Integer.reverse(0x74000000);
        y = Integer.reverse(0x60000000);
        z = Long.reverse(-2549770258386638349L);
        aa = Long.reverse(0x2C00000000000000L);
        ab = Integer.reverse(0x8000000);
        ac = 256 >>> 164 | 256 << ~164 + 1;
        ad = Integer.reverse(-536870912);
        ae = Long.reverse(-1108618377628079629L);
        af = Integer.reverse(0x10000000);
        ag = Long.reverse(-2549770258386638349L);
        ah = Long.reverse(0x2C00000000000000L);
        ai = (0x20000001 >>> 253 | 0x20000001 << ~253 + 1) & 0xFFFFFFFF;
        var_long_aj = Long.reverse(-2549770258386638349L);
        var_long_ak = Long.reverse(0x2C00000000000000L);
        var_int_al = Integer.reverse(0x50000000);
        var_long_am = Long.reverse(-2549770258386638349L);
        an = Long.reverse(0x2C00000000000000L);
        ao = 0x58000000 >>> 155 | 0x58000000 << -155;
        ap = Long.reverse(-2549770258386638349L);
        aq = Long.reverse(0x2C00000000000000L);
        ar = (6 >>> 95 | 6 << -95) & 0xFFFFFFFF;
        as = -1 >>> 161 | -1 << -161;
        at = Long.reverse(-1108618377628079629L);
        au = 52 >>> 226 | 52 << ~226 + 1;
        av = Long.reverse(-2549770258386638349L);
        aw = Long.reverse(0x2C00000000000000L);
        ax = Integer.reverse(0x70000000);
        ay = Long.reverse(-2549770258386638349L);
        az = Long.reverse(0x2C00000000000000L);
        ba = Integer.reverse(-268435456);
        bb = Long.reverse(-2549770258386638349L);
        bc = Long.reverse(0x2C00000000000000L);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        NLoginCore_016.b();
        var_java_util_regex_Pattern_c = Pattern.compile((String)NLoginCore_016.c("㺀", (int)ad, (long)ae));
        var_java_lang_String_aj = Bukkit.getServer().getClass().getPackage().getName();
        var_java_lang_String_ak = var_java_lang_String_aj.replace((CharSequence)NLoginCore_016.c("㺃", (int)af, (long)(ag ^ ah)), (CharSequence)NLoginCore_016.c("㺆", (int)ai, (long)(var_long_aj ^ var_long_ak)));
        var_java_lang_String_al = var_java_lang_String_aj.replace((CharSequence)NLoginCore_016.c("㺉", (int)var_int_al, (long)(var_long_am ^ an)), (CharSequence)NLoginCore_016.c("㺌", (int)ao, (long)(ap ^ aq)));
        var_java_lang_String_am = var_java_lang_String_aj.replace((CharSequence)NLoginCore_016.c("㺏", (int)(ar & as), (long)at), (CharSequence)NLoginCore_016.c("㺒", (int)au, (long)(av ^ aw))).replace((CharSequence)NLoginCore_016.c("㺕", (int)ax, (long)(ay ^ az)), (CharSequence)NLoginCore_016.c("㺘", (int)ba, (long)(bb ^ bc)));
    }

    /*
     * Exception decompiling
     */
    public static String i(String var0) {
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
}

