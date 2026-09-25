/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_020
extends Enum<NLoginCore_020> {
    public static final /* enum */ NLoginCore_020 var_com_nickuc_login_NLoginCore_020_b;
    public static final /* enum */ NLoginCore_020 var_com_nickuc_login_NLoginCore_020_c;
    public static final /* enum */ NLoginCore_020 var_com_nickuc_login_NLoginCore_020_d;
    private static final /* synthetic */ NLoginCore_020[] var_com_nickuc_login_NLoginCore_020_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int e;
    private static int f;
    private static long g;
    private static long h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;
    private static int n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static int v;
    private static int w;
    private static long x;
    private static int y;
    private static int z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static long ah;
    private static int ai;
    private static int aj;
    private static long ak;
    private static long al;
    private static int am;
    private static int an;
    private static long ao;
    private static int ap;

    public static NLoginCore_020[] values() {
        return (NLoginCore_020[])var_com_nickuc_login_NLoginCore_020_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x5FL;
        l ^= 0xBAE647BFEBA3B42FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(6 + 63), (byte)(35 + 48), (byte)(22 + 25), (byte)(30 + 37), (byte)(57 + 9), (byte)(23 + 44), (byte)(45 + 2), (byte)(38 + 42), (byte)(55 + 20), (byte)(51 + 16), (byte)(59 + 24), (byte)(41 + 12), (byte)(40 + 40), (byte)(81 + 16), 100, (byte)(13 + 87), (byte)(65 + 40), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.B("ìùø»û÷òûĆõÂĀĄýĀĆÈьѓџѝѦњгѪѧыџѮ", (byte)5, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_020.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_020.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.B("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 66), NLoginCore_020.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ŠŭŬįůūŦůźũĶŴŸűŴźļӀӇӓӑӚӎҧӞӛҿӓӢŔ", (byte)63, 65) + string + NLoginCore_427.C("Ҭ", (byte)63, 67) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 1014532370555893602L;
        long l = var_long_c ^ 0xBAE647BFEBA3B42FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(22 + 47), 83, (byte)(41 + 6), (byte)(6 + 61), (byte)(5 + 61), 67, (byte)(6 + 41), (byte)(55 + 25), (byte)(27 + 48), (byte)(61 + 6), (byte)(58 + 25), (byte)(2 + 51), (byte)(61 + 19), (byte)(21 + 76), (byte)(20 + 80), (byte)(25 + 75), (byte)(97 + 8), (byte)(61 + 49), (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
                    NLoginCore_020.var_java_lang_String_arr_b[0] = NLoginCore_173.C("ՑԞՆԸԽԡՊիԷՔՂ՟ԪՀՋՋՑԽԳՖշհՂԺՈձ՗ձԸյ՘՜", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ՑԞՆԸԽԡՊիԷՔՄԪԮՊ՟ԮԻէՒխթաՅյՐջպթըԷվյ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[2] = NLoginCore_384.F("֊՗տձն՚փ֤հ֍պ֧֒ք֥ջ֋֝֏֩վ֥֢֟ւլ֠ծַ֧֦փ", (byte)103, 70);
                    NLoginCore_020.var_java_lang_String_arr_b[3] = NLoginCore_173.A("ǃƳƽƥǁƹƺƃƿǂǊƕ", (byte)103, 65);
                    NLoginCore_020.var_java_lang_String_arr_b[4] = NLoginCore_387.C("՜՜ԹգԢԷԨթդզժժեԨ՞ՐԲ԰գհՔզԽԾ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[5] = NLoginCore_575.D("ԸՁզՒ՘բեՋԳԾՉ՞ԹԸՈՐԥծժՠգզԽԾ", (byte)103, 68);
                    NLoginCore_020.var_java_lang_String_arr_b[6] = NLoginCore_223.F("պՏֆջ֎֛֚֗պծեի", (byte)103, 70);
                    NLoginCore_020.var_java_lang_String_arr_b[7] = NLoginCore_384.C("ՍԶ՗ՙԤաԩԧԦՙՅԶՃ՜Ոկբ՟Սզ԰նԽԾ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[8] = NLoginCore_446.C("ՏԣԥՂգ՗ԣզԥՕԤԲ", (byte)103, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_020.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ՑԞՆԸԽԡՊիԷՔՂ՟ԪՀՋՋՑԽԳՖշզհՋձՔծճմ՛՚Լ", (byte)103, 68);
                    NLoginCore_020.var_java_lang_String_arr_b[1] = NLoginCore_387.E("֊՗տձն՚փ֤հ֍սգէփ֘էմ֠֋֦֢֐֫ֆ֪լմ֪փյյֹ֪պչ׀֪֫֐֯֍֒׀֋", (byte)103, 69);
                    NLoginCore_020.var_java_lang_String_arr_b[2] = NLoginCore_091.C("ՑԞՆԸԽԡՊիԷՔՁՙծՋլՂՒդՖհՅէՋՖՇՑշժՉՀպպ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[3] = NLoginCore_446.C("ԫԳԽՎՙԠԾՁՓՠՁՏԧՍիըթԼՖՑՂնԽԾ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[4] = NLoginCore_027.A("ƿƿƜǆƅƚƋǌǇǉǋǑƥƳƽƪƮƮǋƓǇǉƠơ", (byte)103, 65);
                    NLoginCore_020.var_java_lang_String_arr_b[5] = NLoginCore_559.C("ԸՁզՒ՘բեՋԳԾՋ՜ՁՇժՍըԼԭգՁզԽԾ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[6] = NLoginCore_027.E("֝ֈ֊֒֝֐֛֠հքնի", (byte)103, 69);
                    NLoginCore_020.var_java_lang_String_arr_b[7] = NLoginCore_091.C("ՍԶ՗ՙԤաԩԧԦՙՆՠհԻՂբՃլձԴԶնԽԾ", (byte)103, 67);
                    NLoginCore_020.var_java_lang_String_arr_b[8] = NLoginCore_004.A("ƅƓƜƛƩƛƟǃǏƉưǒƭǑƏƎƷǘƘǖƩǉƠơ", (byte)103, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_020.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ԵՖՄՄ՛ԧԛԣԢԪԾբԮՆԽխկՊղէ՘ՐԽԾ", (byte)103, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_020.var_java_lang_String_arr_b[0] = NLoginCore_138.E("սՏ֖֑֘Փճ֏֍փՠա՞֨ռւզ֧ն֣ը։նշ", (byte)103, 69);
                }
            }
        }
    }

    private static /* synthetic */ NLoginCore_020[] a() {
        NLoginCore_020[] NLoginCore_020Array = new NLoginCore_020[z];
        NLoginCore_020Array[NLoginCore_020.aa] = var_com_nickuc_login_NLoginCore_020_b;
        NLoginCore_020Array[NLoginCore_020.ab] = var_com_nickuc_login_NLoginCore_020_c;
        NLoginCore_020Array[NLoginCore_020.ac] = var_com_nickuc_login_NLoginCore_020_d;
        return NLoginCore_020Array;
    }

    static {
        var_int_a = -1 >>> 14 | -1 << ~14 + 1;
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-4832793292562618256L);
        e = 0 >>> 78 | 0 << ~78 + 1;
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(5111154684671436912L);
        h = Long.reverse(-432345564227567616L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (2048 >>> 10 | 2048 << -10) & 0xFFFFFFFF;
        k = Long.reverse(5111154684671436912L);
        l = Long.reverse(-432345564227567616L);
        m = 0x8000000 >>> 154 | 0x8000000 << -154;
        n = Integer.reverse(-1);
        o = Integer.reverse(-1073741824);
        p = Long.reverse(5111154684671436912L);
        q = Long.reverse(-432345564227567616L);
        r = (0 >>> 105 | 0 << -105) & 0xFFFFFFFF;
        s = Integer.reverse(0x20000000);
        t = Integer.reverse(-1);
        u = Long.reverse(-4832793292562618256L);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(-1610612736);
        x = Long.reverse(-4832793292562618256L);
        y = Integer.reverse(0x40000000);
        z = Integer.reverse(-1073741824);
        aa = Integer.reverse(0);
        ab = (0x1000000 >>> 56 | 0x1000000 << -56) & 0xFFFFFFFF;
        ac = Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << ~62 + 1;
        ad = Integer.reverse(-1879048192);
        ae = (144 >>> 36 | 144 << -36) & 0xFFFFFFFF;
        af = Integer.reverse(0x60000000);
        ag = -1 >>> 199 | -1 << -199;
        ah = Long.reverse(-4832793292562618256L);
        ai = 0 >>> 94 | 0 << ~94 + 1;
        aj = Integer.reverse(-536870912);
        ak = Long.reverse(5111154684671436912L);
        al = Long.reverse(-432345564227567616L);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = 4 >>> 63 | 4 << ~63 + 1;
        ao = Long.reverse(-4832793292562618256L);
        ap = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_020.b();
        var_com_nickuc_login_NLoginCore_020_b = new NLoginCore_020();
        var_com_nickuc_login_NLoginCore_020_c = new NLoginCore_020();
        var_com_nickuc_login_NLoginCore_020_d = new NLoginCore_020();
        var_com_nickuc_login_NLoginCore_020_arr_a = NLoginCore_020.a();
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public static NLoginCore_020 a(String var0) {
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

    public static NLoginCore_020 valueOf(String string) {
        return Enum.valueOf(NLoginCore_020.class, string);
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public static NLoginCore_020 b(String var0) {
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

