/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_482;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_233;
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_224 {
    private static int al;
    private static int bj;
    private static long d;
    private final File var_java_io_File_i;
    private static int var_int_i;
    private static int v;
    private static long q;
    private static long az;
    private static int w;
    private static int p;
    private static int s;
    private static int ay;
    private static int bk;
    private static int m;
    private static long bi;
    private static String[] var_java_lang_String_arr_b;
    private static long z;
    private static long aj;
    private static long as;
    private static int bc;
    private static int h;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int au;
    private static int ab;
    private static int l;
    private static int ae;
    private static long k;
    private static int aq;
    private static long r;
    private static long x;
    private NLoginCore_482 var_com_nickuc_login_NLoginCore_482_a;
    private static int e;
    private static int j;
    private static long aw;
    private static long ao;
    private static long ba;
    private static int bf;
    private static int o;
    private static int var_int_b;
    private static long g;
    private static int af;
    private static long am;
    private static long ak;
    private static long av;
    private static int bg;
    private static long ag;
    private static int y;
    private static int at;
    private static long aa;
    private static int t;
    private static long bd;
    private static long f;
    private static long c;
    private static long ac;
    private final NLoginCore_233 var_com_nickuc_login_NLoginCore_233_a;
    private static long ah;
    private static long bh;
    private static long ad;
    private static long be;
    private static long n;
    private static int bb;
    private static int ax;
    private static long u;
    private static long ap;
    private static int an;
    private static int ai;
    private static int bl;
    private static int ar;

    @Generated
    public NLoginCore_482 com_nickuc_login_NLoginCore_482_a() {
        return this.var_com_nickuc_login_NLoginCore_482_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_224.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.D("ҸӚӜҼӠӿӷԍӹӈԆӼԊԄӍӲԔԓԋԑԋӠ", (byte)73, 68), NLoginCore_224.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӤӠӨӣӜӨӦӑӢӎŦ", (byte)73, 66) + string + NLoginCore_110.E("Կ", (byte)73, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 4047483108496700592L;
        long l = c ^ 0xB60E61A5F8AF1CBAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(61 + 8), (byte)(74 + 9), (byte)(20 + 27), (byte)(65 + 2), (byte)(45 + 21), (byte)(24 + 43), (byte)(41 + 6), (byte)(70 + 10), (byte)(3 + 72), (byte)(8 + 59), (byte)(40 + 43), (byte)(24 + 29), 80, (byte)(59 + 38), 100, (byte)(31 + 69), (byte)(61 + 44), (byte)(88 + 22), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_224.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ԸԶԼӿԲӼԥԽӿԇԝԺԢӾԻԝԩԬՒԳԳՀԲՁՏՎՆՅԥ՚ԝԳԨԹԪՑՂՒ՚ՠԦ՘՘Յ՟ԢՕՄԮեԬխՅՏեՄԶիբՐձդ՘վ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ԰ՕԼՓՓՈՕԻՙԿԟ՘՝Կ՝ԩՁԻծՈԥգհԮԾԯՈՕՂՠզՂՒՓհՖ", (byte)91, 68);
                    NLoginCore_224.var_java_lang_String_arr_b[2] = NLoginCore_076.E("ա֌ժճգցբոձզՙ՟", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[3] = NLoginCore_324.E("է֑ւիխ֓ժ֔՘ֆ֊֕֒շս֑խիբ՚դգւձղ֦֫բց֦֍֤֞ֆլ֣ձֵֈַ֑֔հ֤֯մ֞֓ֈ֛֐ֲտֵֶֻ֢֖֗֟׋ַֽ׏", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[4] = NLoginCore_201.D("ԬԫԶԫԹԃԁԹՅӺԻԎ", (byte)91, 68);
                    NLoginCore_224.var_java_lang_String_arr_b[5] = NLoginCore_138.E("ցդջիյ՞եեցգ֕ջմլ՛֕հ֗պքք֓ժի", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[6] = NLoginCore_173.F("ՊՋ֐զ֐Տ։ևձևշ֊է֋ձծ֖ճռ՜֥սժի", (byte)91, 70);
                    NLoginCore_224.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ƟƂƙƉƓżƃƃƟƁƳƙƒƊŹƳƎƵƘƢƢƱƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[8] = NLoginCore_387.B("ƟƂƙƉƓżƃƃƟƁƳƙƒƊŹƳƎƵƘƢƢƱƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[9] = NLoginCore_427.B("ŮƭŧŹƌũƮŭŶƔƴƹŬŷƴŻƲưƮſƼƛƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[10] = NLoginCore_223.E("րՑ՞Վ՟Օ՟ղ՘ցև՗֋֞֐ղՙխ֢֘՜֣ժի", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[11] = NLoginCore_138.B("ŮƭŧŹƌũƮŭŶƔƴƹŬŷƴŻƲưƮſƼƛƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[12] = NLoginCore_451.C("ӿԾӸԊԝӺԿӾԇԥՅՊӽԈՅԌՃՁԿԐՍԬԙԚ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[13] = NLoginCore_027.F("ՊՋ֐զ֐Տ։ևձևշ֊է֋ձծ֖ճռ՜֥սժի", (byte)91, 70);
                    NLoginCore_224.var_java_lang_String_arr_b[14] = NLoginCore_451.E("ք֒՚էց՝իՔգւ֐՟", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[15] = NLoginCore_223.C("ԱԞԱԓԞԎԽՄԛԟՄԔԗԉԮԘԢԥԝԠ԰ԬԙԚ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[16] = NLoginCore_027.E("ՊՋ֐զ֐Տ։ևձևշ֊է֋ձծ֖ճռ՜֥սժի", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[17] = NLoginCore_427.D("ӹӺԿԕԿӾԸԶԠԶԦԹԖԺԠԝՅԢԫԋՔԬԙԚ", (byte)91, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_224.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƧƥƫŮơūƔƬŮŶƌƩƑŭƪƌƘƛǁƢƢƯơưƾƽƵƴƔǉƌƢƗƨƙǀƱǁǉǏƕǇǇƴǎƑǄƳƝǔƛǜƴǎƼƴƹǕƹƦǣƩǍǥ", (byte)91, 65);
                    NLoginCore_224.var_java_lang_String_arr_b[1] = NLoginCore_384.C("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ԰ՕԼՓՓՈՕԻՙԿԟ՘՝Կ՝ԩՁԻծՈԥգհԮԾղՃՔՖեԸզՋի՗ՓՑԸ՗ԹԿՌծԽ՗քՙՎ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[2] = NLoginCore_092.A("ƬƊƩƀƜŮƬƥƵƃƊơƇƉƘƜŰƓƜƎƙƋƈƉ", (byte)91, 65);
                    NLoginCore_224.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ԰ՕԼՓՍԵԛՒԠդԷՀՃզԟՓ՞ԣՍՂԷՊԿաԮէՍԲՅդԹՓ՜՝ժզ", (byte)91, 68);
                    NLoginCore_224.var_java_lang_String_arr_b[4] = NLoginCore_453.F("ր՚Ւ֏՞դՖ֒֒֒ւհծռֈ։֙ՙ՚֛՟֣ժի", (byte)91, 70);
                    NLoginCore_224.var_java_lang_String_arr_b[5] = NLoginCore_559.A("ƟƂƙƉƓżƃƃƟƁƲƳƏƸƻŹƻƋƴƍƵƚƞǀƁƚƽƛƉƋǁƚ", (byte)91, 65);
                    NLoginCore_224.var_java_lang_String_arr_b[6] = NLoginCore_453.C("ӹӺԿԕԿӾԸԶԠԶԨԕՀԾՀԛԊԡԽՌԲԑԪԖԡՈԱՎՐՖԘՓ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[7] = NLoginCore_004.C("԰ԓԪԚԤԍԔԔ԰ԒՃԩԚԗԦԯԹԏԽԒԪԑԣԨԥԪՋՙԓ՘ԩԧ", (byte)91, 67);
                    NLoginCore_224.var_java_lang_String_arr_b[8] = NLoginCore_027.E("ցդջիյ՞եեցգ֖֗֌նմ։֐՛֕ւճ֢տև֘֨շն֫է֋ը", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[9] = NLoginCore_091.E("Ր֏Չ՛ծՋ֐Տ՘ն֕ծժ֏ծՖ֠կ֑֐֏խժի", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[10] = NLoginCore_223.B("ƞůżŬŽųŽƐŶƟƥƒƐƅŹƞƓŻƶƮƞƋƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[11] = NLoginCore_223.A("ŮƭŧŹƌũƮŭŶƔƴƊŲƷƶƷƗƔžƶƟƱƈƉ", (byte)91, 65);
                    NLoginCore_224.var_java_lang_String_arr_b[12] = NLoginCore_027.E("Ր֏Չ՛ծՋ֐Տ՘ն֖յֆ՘՜֊Ւպ՛ճ֖սժի", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[13] = NLoginCore_324.E("ՊՋ֐զ֐Տ։ևձևոն֊Փ֋ՕՖ֗֝չ֣֏՟վ։֛֩մդ֫չ֜", (byte)91, 69);
                    NLoginCore_224.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ƟƆƚƩƫƦŭƎſƲƅƈűƦƔƨŽƯŽƶǀǁƈƉ", (byte)91, 66);
                    NLoginCore_224.var_java_lang_String_arr_b[15] = NLoginCore_201.D("ԱԞԱԓԞԎԽՄԛԟՃԕԼԆԌԆԯԐԝԩԯՒԙԚ", (byte)91, 68);
                    NLoginCore_224.var_java_lang_String_arr_b[16] = NLoginCore_027.D("ӹӺԿԕԿӾԸԶԠԶԧԺԝՋԗՊԦՁԛՈԱԱՋՖՍՍՓԴԬԯԗԷ", (byte)91, 68);
                    NLoginCore_224.var_java_lang_String_arr_b[17] = NLoginCore_575.E("ՊՋ֐զ֐Տ։ևձևչէևը֛ճ֚֍֣֛֒ս֙֟ոևաո֧֝ֈց", (byte)91, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_224.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ՀԈԬԎԿԓԑԻՁ԰ԥӼԠԾՈԀԋԠԱՄԩՄԐՒԓՍԱՍՒ՚ԴԜ", (byte)91, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_224.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ԏԌԸԚӼՂԜԀԴԳԩԗԡԶԹԻՎՋԈԞՂԡԵՊԔԡԺԙԱՎԻԲ", (byte)91, 67);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = -1 >>> 254 | -1 << ~254 + 1;
        d = Long.reverse(-8561507635601222628L);
        e = 1 >>> 192 | 1 << -192;
        f = Long.reverse(950094777405264924L);
        g = Long.reverse(-8935141660703064064L);
        h = Integer.reverse(0);
        var_int_i = 1024 >>> 169 | 1024 << -169;
        j = (-1 >>> 158 | -1 << ~158 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-8561507635601222628L);
        l = Integer.reverse(-1073741824);
        m = -1 >>> 250 | -1 << -250;
        n = Long.reverse(-8561507635601222628L);
        o = Integer.reverse(0);
        p = Integer.reverse(0x20000000);
        q = Long.reverse(950094777405264924L);
        r = Long.reverse(-8935141660703064064L);
        s = (0 >>> 64 | 0 << -64) & 0xFFFFFFFF;
        t = (81920 >>> 14 | 81920 << -14) & 0xFFFFFFFF;
        u = Long.reverse(-8561507635601222628L);
        v = (48 >>> 3 | 48 << -3) & 0xFFFFFFFF;
        w = Integer.reverse(-1);
        x = Long.reverse(-8561507635601222628L);
        y = 0x1C000000 >>> 26 | 0x1C000000 << ~26 + 1;
        z = Long.reverse(950094777405264924L);
        aa = Long.reverse(-8935141660703064064L);
        ab = 8 >>> 32 | 8 << ~32 + 1;
        ac = Long.reverse(950094777405264924L);
        ad = Long.reverse(-8935141660703064064L);
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = Integer.reverse(-1879048192);
        ag = Long.reverse(950094777405264924L);
        ah = Long.reverse(-8935141660703064064L);
        ai = 0x28000000 >>> 186 | 0x28000000 << ~186 + 1;
        aj = Long.reverse(950094777405264924L);
        ak = Long.reverse(-8935141660703064064L);
        al = (0x60000001 >>> 157 | 0x60000001 << -157) & 0xFFFFFFFF;
        am = Long.reverse(-8561507635601222628L);
        an = Integer.reverse(0x30000000);
        ao = Long.reverse(950094777405264924L);
        ap = Long.reverse(-8935141660703064064L);
        aq = Integer.reverse(Integer.MIN_VALUE);
        ar = Integer.reverse(-1342177280);
        as = Long.reverse(-8561507635601222628L);
        at = (-1 >>> 59 | -1 << -59) & 0xFFFFFFFF;
        au = (0x700000 >>> 211 | 0x700000 << ~211 + 1) & 0xFFFFFFFF;
        av = Long.reverse(950094777405264924L);
        aw = Long.reverse(-8935141660703064064L);
        ax = Integer.reverse(0);
        ay = Integer.reverse(-268435456);
        az = Long.reverse(950094777405264924L);
        ba = Long.reverse(-8935141660703064064L);
        bb = Integer.reverse(Integer.MIN_VALUE);
        bc = 0x10000000 >>> 216 | 0x10000000 << ~216 + 1;
        bd = Long.reverse(950094777405264924L);
        be = Long.reverse(-8935141660703064064L);
        bf = (64 >>> 6 | 64 << ~6 + 1) & 0xFFFFFFFF;
        bg = (2176 >>> 167 | 2176 << -167) & 0xFFFFFFFF;
        bh = Long.reverse(950094777405264924L);
        bi = Long.reverse(-8935141660703064064L);
        bj = (Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << ~95 + 1) & 0xFFFFFFFF;
        bk = Integer.reverse(0x48000000);
        bl = Integer.reverse(0x48000000);
        var_java_lang_String_arr_a = new String[bk];
        var_java_lang_String_arr_b = new String[bl];
        NLoginCore_224.b();
    }

    @Generated
    public File f() {
        return this.var_java_io_File_i;
    }

    /*
     * Exception decompiling
     */
    public NLoginCore_224(NLoginCore_116<?> var1_1) {
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
        l ^= 0x21L;
        l ^= 0xB60E61A5F8AF1CBAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(33 + 36), (byte)(25 + 58), (byte)(12 + 35), (byte)(32 + 35), (byte)(27 + 39), (byte)(56 + 11), (byte)(14 + 33), (byte)(57 + 23), (byte)(70 + 5), (byte)(60 + 7), (byte)(28 + 55), 53, (byte)(2 + 78), (byte)(15 + 82), (byte)(95 + 5), (byte)(92 + 8), (byte)(36 + 69), (byte)(100 + 10), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("զճղԵյձլյրկԼպվշպրՂ࣒ࣖࣚࣕ࣎ࣚࣘࣃࣔࣀ", (byte)71, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_224.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_233 com_nickuc_login_NLoginCore_233_a() {
        return this.var_com_nickuc_login_NLoginCore_233_a;
    }
}

