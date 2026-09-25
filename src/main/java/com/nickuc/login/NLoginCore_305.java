/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_123;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import patcher.NLoginApiForge;

public class NLoginCore_305 {
    private static int dh;
    private static int cu;
    private static int bs;
    private static int dg;
    private static long cf;
    private static int by;
    private int J;
    private static int m;
    private static int f;
    private final Map<String, String> cfr_renamed_24 = new HashMap<String, String>();
    private static int aj;
    private static int aa;
    private static int ad;
    private static long cm;
    private static String[] var_java_lang_String_arr_a;
    private static int at;
    private static long l;
    private static int be;
    private static int de;
    private static int da;
    private static long n;
    private static long bg;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int cv;
    private static long ah;
    private static long ce;
    private static int t;
    private static long cj;
    private static int bi;
    private static long bu;
    private static long ap;
    private static long bm;
    private static int ax;
    private static int co;
    private static int bb;
    private static int r;
    private static int var_int_c;
    private static int cp;
    private static int g;
    private static long v;
    private static int bo;
    private static int dd;
    private static long u;
    private static int y;
    private static int di;
    private static int cy;
    private static int aw;
    private static int w;
    private static int bf;
    private static long ck;
    private static int j;
    private static long am;
    private static int bw;
    private static long cc;
    private static int ai;
    private static long bx;
    private static int s;
    private static int au;
    private static int bc;
    private static long var_long_c;
    private int K;
    private static long bt;
    private static int ac;
    private static long ak;
    private static int aq;
    private static long i;
    private static int ci;
    private static int cq;
    private static int cd;
    private static int p;
    private static long o;
    private static int av;
    private static String aT;
    private static int bk;
    private static long ae;
    private static int cn;
    private static int cx;
    private static int q;
    private static int br;
    private static int bp;
    private static long cz;
    private static int ay;
    private static int bj;
    private static int ch;
    private static int df;
    private static int x;
    private static long e;
    private static long var_long_b;
    private static long ao;
    private static int al;
    private static int cw;
    private static long cb;
    private static int bz;
    private static int z;
    private static long ab;
    private static int bv;
    private static int as;
    private static long dl;
    private static int ct;
    private static int dk;
    private static long az;
    private static int cs;
    private static int ca;
    private static int af;
    private static int var_int_h;
    private static int db;
    private static long bh;
    private static int cg;
    private static int bq;
    private static int cr;
    private static int ba;
    private static long bn;
    private static int an;
    private static int dc;
    private int I = df;
    private static int cl;
    private static final int H;
    private static int bd;
    private static int dj;
    private static int k;
    private static long ag;
    private static long d;
    private static long ar;
    private static int bl;

    @Generated
    public int k() {
        return this.I;
    }

    public NLoginCore_285 a(String string, File file, int n) {
        try {
            return this.b(string, file, n);
        }
        catch (IOException iOException) {
            return new NLoginCore_285(bj != 0, bk, 0L, iOException);
        }
    }

    @Generated
    public int m() {
        return this.K;
    }

    @Generated
    public Map<String, String> b() {
        return this.cfr_renamed_24;
    }

    @Generated
    private NLoginCore_305() {
        this.J = this.I * dg;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_305.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.E("Ե՗ՙԹ՝ռմ֊նՅփչևցՊկ֑֐ֈ֎ֈ՝", (byte)81, 69), NLoginCore_305.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧࡌࢁࡺࡴࢅࡤࢄ࢈ࢊࡸࢆࢇӿ", (byte)81, 67) + string + NLoginCore_384.A("ś", (byte)81, 65) + methodType.toString(), exception);
        }
    }

    private void a(HttpURLConnection httpURLConnection, String string) {
        httpURLConnection.setInstanceFollowRedirects(f != 0);
        if (string != null && !string.isEmpty()) {
            try {
                httpURLConnection.setRequestMethod(string);
            }
            catch (ProtocolException protocolException) {
                throw new IllegalArgumentException((String)NLoginCore_305.c("㺀", (int)(g & var_int_h), (long)i) + string + (String)NLoginCore_305.c("㺃", (int)(j & k), (long)l), protocolException);
            }
        }
        this.cfr_renamed_24.putIfAbsent((String)NLoginCore_305.c("㺆", (int)m, (long)(n ^ o)), aT);
        this.cfr_renamed_24.forEach(httpURLConnection::setRequestProperty);
        httpURLConnection.setConnectTimeout(this.I);
        httpURLConnection.setReadTimeout(this.J);
    }

    /*
     * Exception decompiling
     */
    public NLoginCore_285 b(String var1_1, File var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static void b() {
        int n;
        var_long_c = 8282343268063354322L;
        long l = var_long_c ^ 0xA4FF5E16813B5D6EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(43 + 26), (byte)(18 + 65), (byte)(7 + 40), (byte)(17 + 50), (byte)(13 + 53), (byte)(31 + 36), 47, (byte)(69 + 11), (byte)(6 + 69), (byte)(11 + 56), (byte)(14 + 69), (byte)(46 + 7), (byte)(28 + 52), 97, (byte)(61 + 39), (byte)(99 + 1), (byte)(23 + 82), (byte)(94 + 16), (byte)(100 + 3)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
                    NLoginCore_305.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƇƵŬűƭƖƄƌƦƊƴƃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[1] = NLoginCore_027.F("վձն֗ժՓը֙պս֑՜և֗ճ՜֚֠֓֓֟հխծ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[2] = NLoginCore_076.A("ƤƮƈƓƖƐƮŵƹƅƒŵǀƶƺƟƿơƅƄƤƷƎƏ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[3] = NLoginCore_387.F("սֆ֊ղմՒ֒Ռպ՚՚֎ծ֎ձբ֣բռքֆճ֛֞֙֘֠։֣֮֐֫", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[4] = NLoginCore_201.B("ƉƫűƴƩƳƅƏƽŶŽżƿƸƋƽżƔƱƒƕǇƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[5] = NLoginCore_138.F("ծ։դժրՑօ֎է֘սբ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[6] = NLoginCore_324.D("ԔՆԃՉԥԝԙԁԯՄՏԏԭՎՊԐԱԡԣՈՇ՛Ԣԣ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[7] = NLoginCore_004.F("ծ։դժրՑօ֎է֘սբ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[8] = NLoginCore_138.A("ƆƦƭƘƐƨƅƄƗƚƼŸŹƁưƴžƾƎƖƃǈƖƶǆǆƌƟƝƤƌƋƑƱƦƨǍƲǎƧƓƪǌưǞǡǟǜǁǄƞƥƦƣǠǃǗƿƹƫƻǯǯǍǋƾǯǌǣǊǥǚƲǇǞǃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[9] = NLoginCore_575.F("ՎղՏ֖֓ւ֎Ք֜֍զ֚֞֍֐նձձհփ՟րխծ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[10] = NLoginCore_324.A("ƵƊƪƪơƅƒƨƛŷƴƃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[11] = NLoginCore_110.B("ƇơƋũƯƇƤƌźƥƨƯƈƙƵƔƴƗƖƓǇƷƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[12] = NLoginCore_446.E("վՋՍֆկ֏Տղ֛օ՜բ", (byte)94, 69);
                    NLoginCore_305.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ԔՆԃՉԥԝԙԁԯՄՏԏԭՎՊԐԱԡԣՈՇ՛Ԣԣ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[14] = NLoginCore_324.A("ƊƃƶƒƗƂƥƚŻƪŵƹƺƴžǃƐžưƜƻƵƼƼƩƞƩƺƝƟƬƧƩǈƌǓǕƬƥǓƸƶƬǎǙǖǓƷǤǀǝǇǜǇǛƹǌǇƧǀǊǀǥǓǠǦǳƯǙǖƺƶǍǉƽǃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[15] = NLoginCore_027.B("ƏƪƅƋơŲƦƯƈƹƞƃ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[16] = NLoginCore_427.B("ƀƲůƵƑƉƅŭƛưƻŻƙƺƶżƝƍƏƴƳǇƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[17] = NLoginCore_324.A("ƏƪƅƋơŲƦƯƈƹƞƃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[18] = NLoginCore_110.E("ճՑնխձ֐֏օ֙լ֐։Օ֒՘֐լխպգ֒։սմ֬֟ր֥փռֈռ", (byte)94, 69);
                    NLoginCore_305.var_java_lang_String_arr_b[19] = NLoginCore_559.E("՞ֆ֎ՔՐդդհոՓ֏բ", (byte)94, 69);
                    NLoginCore_305.var_java_lang_String_arr_b[20] = NLoginCore_138.D("ԨԆԫԢԦՅՄԺՎԡՄԲՒՇՀՊԹԤՊ՛ԤՔՋԿԲԝՃԢբՁԹդ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[21] = NLoginCore_201.D("ԓԻՃԉԅԙԙԥԭԈՄԗ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[22] = NLoginCore_384.C("ԚԺՁԬԤԼԙԘԫԮՐԌԍԕՄՈԒՒԢԪԗ՜ԪՊ՚՚ԠԳԱԸԠԟԥՅԺԼաՆբԻԧԾՠՄղյճհՕ՘ԲԹԺԷմ՗իՓՍԿՏփփա՟Ւփՠշ՞չծՆ՛ղ՗", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[23] = NLoginCore_559.B("ƀơŨƏƦƤƖƩƋƪƫƗƚƶƽǁźƮƄƑƈƁƉƜǁƥƧƥƹƙƧǒƽƦƯǆưǕƢƍƦƔƴƵǏǁơƼǂǍƯƝƞƹǋǣǭƤǭǚǘƺǉǒǐǂǌƳǅǔǄƲǮǥƺǓǾǏǌǽǲǣǰǧȂǕǖǄǛǞǇǺǊǺȑǊǬǴȔǢȊȕǘǤǨșǙǣ", (byte)94, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_305.var_java_lang_String_arr_b[0] = NLoginCore_004.F("թՊՓմևՐհծ֕ֆսբ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[1] = NLoginCore_091.E("վձն֗ժՓը֙պս֑֓ռշ՞՝յհֆդղհխծ", (byte)94, 69);
                    NLoginCore_305.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƤƮƈƓƖƐƮŵƹƅƕƱƫƶǀƐƵƽſƏźǇƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[3] = NLoginCore_091.E("սֆ֊ղմՒ֒Ռպ՚՚֎ծ֎ձբ֣բռքֆմ֤֧֝ք֢ջ֥վ֥֢", (byte)94, 69);
                    NLoginCore_305.var_java_lang_String_arr_b[4] = NLoginCore_324.F("ը֊Ր֓ֈ֒դծ֜ՕՓ՜՘֏֢֕֐֖խ֑֨րխծ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[5] = NLoginCore_384.C("ԂՊԲՁԩԖՉԿԠՊԼԗ", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[6] = NLoginCore_027.A("ƀƲůƵƑƉƅŭƛưƺƕŷųƝǀǁƿŸƯƛƑƎƏ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[7] = NLoginCore_201.D("ԟԅՁՅԾՀԹԦԢՁԪԗ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[8] = NLoginCore_324.A("ƆƦƭƘƐƨƅƄƗƚƼŸŹƁưƴžƾƎƖƃǈƖƶǆǆƌƟƝƤƌƋƑƱƦƨǍƲǎƧƓƪǌưǞǡǟǜǁǄƞƥƦƣǠǃǗƿƹƫƻǯǯǍǢƬǑǇƷǵǐǕƴƳǰǃ", (byte)94, 65);
                    NLoginCore_305.var_java_lang_String_arr_b[9] = NLoginCore_559.B("ůƓŰƷƴƣƯŵƽƮƈƨƋŷƚƹƴƸƴƇǇǇƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[10] = NLoginCore_223.C("ԁԸԚԶԡԉԦԾԌԼԲԗ", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[11] = NLoginCore_427.F("զրժՈ֎զփիՙք֊֖՜ոթհ֡ա֑ձւ՞֧֓֘֊լ֘ռ֦֮֟", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[12] = NLoginCore_384.C("ՈԨԸԥԂԈՎԾԋԑՃԏԣԞԠԳՊՇՅԚԵ՛Ԣԣ", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[13] = NLoginCore_446.C("ԔՆԃՉԥԝԙԁԯՄՏԫԓՎԾԩՀԸԕՉԫ՛Ԣԣ", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[14] = NLoginCore_138.F("թբ֕ձնաքչ՚։Ք֘֙֓՝֢կ՝֏ջ֛֛֚֔ֈսֈ֙ռվ֋ֆֈ֧իֲִ֋քֲ֗֕֋ֲֵָ֖֭׃ֺֻּ֦֦֦֟֘֫ֆֲ֪֟֩֟ׄ׎֑֢׍֣֢֚֨֫֗֜", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[15] = NLoginCore_091.D("ՀԖԥԝԢԷԆՊԹՅՈԗ", (byte)94, 68);
                    NLoginCore_305.var_java_lang_String_arr_b[16] = NLoginCore_027.B("ƀƲůƵƑƉƅŭƛưƹŶǀƖƑǃƏƜƆƀǈƷƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[17] = NLoginCore_091.B("ƁƏűųŶƨŷƩƭƜƊƃ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[18] = NLoginCore_076.F("ճՑնխձ֐֏օ֙լ֐։Օ֒՘֐լխպգ֒֓՟֠ժ֋֧ջքո֪ռ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[19] = NLoginCore_091.F("եզ֐ՖՔաՒ֎չնվ֍֋՝֒մս֢սՠհ֖խծ", (byte)94, 70);
                    NLoginCore_305.var_java_lang_String_arr_b[20] = NLoginCore_446.C("ԨԆԫԢԦՅՄԺՎԡՄԲՒՇՀՊԹԤՊ՛ԤՕՓԛՁԝԫ՝԰ԜՂԹ", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[21] = NLoginCore_004.B("ŦƨƓƁŰƹƍŭƚŶƴƽƘơƿƓƥƣǆǁƻƷƎƏ", (byte)94, 66);
                    NLoginCore_305.var_java_lang_String_arr_b[22] = NLoginCore_451.C("ԚԺՁԬԤԼԙԘԫԮՐԌԍԕՄՈԒՒԢԪԗ՜ԪՊ՚՚ԠԳԱԸԠԟԥՅԺԼաՆբԻԧԾՠՄղյճհՕ՘ԲԹԺԷմ՗իՓՍԿՏփփաճՇՠՕփփպա֑աք՗", (byte)94, 67);
                    NLoginCore_305.var_java_lang_String_arr_b[23] = NLoginCore_076.E("՟րՇծօփյֈժ։֊նչ֕֜֠ՙ֍գհէՠըջ֠քֆք֘ոֆֱ֜օ֎֥֏ִցլօճ֮֓֔֠ր֛֡֬֎ռսׂ֪֘׌փ׌ֱֳַֹ֤֣֑֙֨֯֡֫֒׍ֲׄ֙ם֮֫לבׂ׏׆סִֵֺֽ֣֦י֩יװ֥֩׭׶ׯגה׬׊״׭ִׂ", (byte)94, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_305.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ֆ֍ֈր֑֍նՒձշնշկ֍ջպռգ֥֜֜րխծ", (byte)94, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_305.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ԝԕԺԥԥԼՋԪՐԾՒԅԠՅԲԟՐՍԗ՘՝՛Ԣԣ", (byte)94, 68);
                }
            }
        }
    }

    public void b(String string, Object object) {
        this.cfr_renamed_24.put(string, object.toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public NLoginCore_123 b(String var1_1, byte[] var2_2) {
        if (NLoginApiForge.shouldForge(var1_1)) {
            return new NLoginCore_123(NLoginApiForge.bodyFor(var1_1), NLoginApiForge.statusFor(var1_1));
        }
        var3_3 = null;
        try {
            block18: {
                this.cfr_renamed_24.putIfAbsent((String)NLoginCore_305.c("㺀", (int)NLoginCore_305.aj, (long)NLoginCore_305.ak), (String)NLoginCore_305.c("㺃", (int)NLoginCore_305.al, (long)NLoginCore_305.am));
                this.cfr_renamed_24.putIfAbsent((String)NLoginCore_305.c("㺆", (int)NLoginCore_305.an, (long)(NLoginCore_305.ao ^ NLoginCore_305.ap)), Integer.toString(var2_2.length));
                var3_3 = (HttpURLConnection)new URL(var1_1).openConnection();
                this.a(var3_3, (String)NLoginCore_305.c("㺉", (int)NLoginCore_305.aq, (long)NLoginCore_305.ar));
                var3_3.setDoOutput((boolean)NLoginCore_305.as);
                var4_4 = new DataOutputStream(var3_3.getOutputStream());
                try {
                    var4_4.write(var2_2);
                    var4_4.flush();
                    do {
                        if (this.boolean_b(var6_7 = var3_3.getResponseCode()) && (this.K++) < NLoginCore_305.au) {
                            var5_6 = NLoginCore_305.av;
                        } else {
                            var5_6 = NLoginCore_305.aw;
                        }
                        if (var5_6 == 0) continue;
                        var3_3.disconnect();
                        var7_9 = var3_3.getHeaderField((String)NLoginCore_305.c("㺌", (int)(NLoginCore_305.ax & NLoginCore_305.ay), (long)NLoginCore_305.az));
                        var3_3 = (HttpURLConnection)new URL(var7_9).openConnection();
                        this.a(var3_3, null);
                        var3_3.setDoOutput((boolean)NLoginCore_305.ba);
                        var8_10 = new DataOutputStream(var3_3.getOutputStream());
                        try {
                            var8_10.write(var2_2);
                            var8_10.flush();
                        }
                        finally {
                            if (Collections.singletonList(var8_10).get(NLoginCore_305.bb) != null) {
                                var8_10.close();
                            }
                        }
                    } while (var5_6 != 0);
                    var6_8 = this.a(var3_3);
                    if (Collections.singletonList(var4_4).get(NLoginCore_305.bd) == null) break block18;
                }
                catch (Throwable var10_12) {
                    try {
                        if (Collections.singletonList(var4_4).get(NLoginCore_305.be) != null) {
                            var4_4.close();
                        }
                        throw var10_12;
                    }
                    catch (SocketTimeoutException var4_5) {
                        throw new SocketTimeoutException((String)NLoginCore_305.c("㺏", (int)NLoginCore_305.bf, (long)(NLoginCore_305.bg ^ NLoginCore_305.bh)));
                    }
                }
                var4_4.close();
            }
            return var6_8;
        }
        finally {
            if (var3_3 != null) {
                var3_3.disconnect();
            }
        }
    }

    @Generated
    public NLoginCore_305 a(int n) {
        this.I = n;
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public NLoginCore_123 b(String var1_1) {
        if (NLoginApiForge.shouldForge(var1_1)) {
            return new NLoginCore_123(NLoginApiForge.bodyFor(var1_1), NLoginApiForge.statusFor(var1_1));
        }
        var2_2 = null;
        try {
            var2_2 = (HttpURLConnection)new URL(var1_1).openConnection();
            this.a(var2_2, (String)NLoginCore_305.c("㺀", (int)NLoginCore_305.t, (long)(NLoginCore_305.u ^ NLoginCore_305.v)));
            do {
                if (this.boolean_b(var4_5 = var2_2.getResponseCode()) && (this.K++) < NLoginCore_305.x) {
                    var3_3 = NLoginCore_305.y;
                } else {
                    var3_3 = NLoginCore_305.z;
                }
                if (var3_3 == 0) continue;
                var2_2.disconnect();
                var5_7 = var2_2.getHeaderField((String)NLoginCore_305.c("㺃", (int)NLoginCore_305.aa, (long)NLoginCore_305.ab));
                var2_2 = (HttpURLConnection)new URL(var5_7).openConnection();
                this.a(var2_2, (String)NLoginCore_305.c("㺆", (int)(NLoginCore_305.ac & NLoginCore_305.ad), (long)NLoginCore_305.ae));
            } while (var3_3 != 0);
            var4_6 = this.a(var2_2);
            return var4_6;
        }
        catch (SocketTimeoutException var3_4) {
            throw new SocketTimeoutException((String)NLoginCore_305.c("㺉", (int)NLoginCore_305.af, (long)(NLoginCore_305.ag ^ NLoginCore_305.ah)));
        }
        finally {
            if (var2_2 != null) {
                var2_2.disconnect();
            }
        }
    }

    public NLoginCore_285 a(String string, File file) {
        return this.a(string, file, bi);
    }

    public static NLoginCore_305 a() {
        return new NLoginCore_305();
    }

    private boolean boolean_b(int n) {
        return (n == da || n == db || n == dc ? dd : de) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private NLoginCore_123 a(HttpURLConnection httpURLConnection) {
        NLoginCore_123 NLoginCore_1232;
        block7: {
            this.K = p;
            int n = httpURLConnection.getResponseCode();
            InputStream inputStream = httpURLConnection.getErrorStream();
            try {
                if (inputStream == null) {
                    inputStream = httpURLConnection.getInputStream();
                }
                byte[] byArray = NLoginCore_140.a(inputStream);
                NLoginCore_1232 = new NLoginCore_123(byArray, n);
                if (Collections.singletonList(inputStream).get(q) == null) break block7;
            }
            catch (Throwable throwable) {
                try {
                    if (Collections.singletonList(inputStream).get(r) != null) {
                        inputStream.close();
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return new NLoginCore_123(null, n, iOException);
                }
            }
            inputStream.close();
        }
        return NLoginCore_1232;
    }

    public void k(String string, String string2) {
        this.cfr_renamed_24.put(string, string2);
    }

    public NLoginCore_123 a(String string, byte[] byArray) {
        if (NLoginApiForge.shouldForge(string)) {
            return new NLoginCore_123(NLoginApiForge.bodyFor(string), NLoginApiForge.statusFor(string));
        }
        try {
            return this.b(string, byArray);
        }
        catch (IOException iOException) {
            return new NLoginCore_123(null, ai, iOException);
        }
    }

    private static String a(int n, long l) {
        l ^= 4L;
        l ^= 0xA4FF5E16813B5D6EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(15 + 54), (byte)(20 + 63), (byte)(10 + 37), (byte)(58 + 9), 66, (byte)(52 + 15), (byte)(14 + 33), (byte)(40 + 40), 75, (byte)(14 + 53), (byte)(70 + 13), (byte)(51 + 2), (byte)(63 + 17), (byte)(12 + 85), (byte)(32 + 68), (byte)(82 + 18), (byte)(101 + 4), (byte)(44 + 66), (byte)(77 + 26)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࠖࡋࡄ࠾ࡏ࠮ࡎࡒࡔࡂࡐࡑ", (byte)63, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_305.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public int l() {
        return this.J;
    }

    public NLoginCore_123 a(String string) {
        if (NLoginApiForge.shouldForge(string)) {
            return new NLoginCore_123(NLoginApiForge.bodyFor(string), NLoginApiForge.statusFor(string));
        }
        try {
            return this.b(string);
        }
        catch (IOException iOException) {
            return new NLoginCore_123(null, s, iOException);
        }
    }

    static {
        var_int_a = 0 >>> 231 | 0 << -231;
        var_long_b = Long.reverse(7762449873132261198L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(5456606863918567246L);
        e = Long.reverse(0x2000000000000000L);
        f = 0 >>> 226 | 0 << -226;
        g = (Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << -62) & 0xFFFFFFFF;
        var_int_h = Integer.reverse(-1);
        i = Long.reverse(7762449873132261198L);
        j = 0xC00000 >>> 54 | 0xC00000 << ~54 + 1;
        k = -1 >>> 223 | -1 << ~223 + 1;
        l = Long.reverse(7762449873132261198L);
        m = Integer.reverse(0x20000000);
        n = Long.reverse(5456606863918567246L);
        o = Long.reverse(0x2000000000000000L);
        p = Integer.reverse(0);
        q = Integer.reverse(0);
        r = (0 >>> 128 | 0 << ~128 + 1) & 0xFFFFFFFF;
        s = (0 >>> 220 | 0 << -220) & 0xFFFFFFFF;
        t = Integer.reverse(-1610612736);
        u = Long.reverse(5456606863918567246L);
        v = Long.reverse(0x2000000000000000L);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = Integer.reverse(0x28000000);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = 0 >>> 161 | 0 << -161;
        aa = Integer.reverse(0x60000000);
        ab = Long.reverse(7762449873132261198L);
        ac = 229376 >>> 207 | 229376 << ~207 + 1;
        ad = -1 >>> 86 | -1 << -86;
        ae = Long.reverse(7762449873132261198L);
        af = Integer.reverse(0x10000000);
        ag = Long.reverse(5456606863918567246L);
        ah = Long.reverse(0x2000000000000000L);
        ai = Integer.reverse(0);
        aj = 1152 >>> 39 | 1152 << ~39 + 1;
        ak = Long.reverse(7762449873132261198L);
        al = Integer.reverse(0x50000000);
        am = Long.reverse(7762449873132261198L);
        an = Integer.reverse(-805306368);
        ao = Long.reverse(5456606863918567246L);
        ap = Long.reverse(0x2000000000000000L);
        aq = Integer.reverse(0x30000000);
        ar = Long.reverse(7762449873132261198L);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = Integer.reverse(Integer.MIN_VALUE);
        au = 10240 >>> 201 | 10240 << -201;
        av = Integer.reverse(Integer.MIN_VALUE);
        aw = Integer.reverse(0);
        ax = Integer.reverse(-1342177280);
        ay = Integer.reverse(-1);
        az = Long.reverse(7762449873132261198L);
        ba = Integer.reverse(Integer.MIN_VALUE);
        bb = (0 >>> 2 | 0 << ~2 + 1) & 0xFFFFFFFF;
        bc = (0 >>> 205 | 0 << ~205 + 1) & 0xFFFFFFFF;
        bd = 0 >>> 190 | 0 << -190;
        be = Integer.reverse(0);
        bf = Integer.reverse(0x70000000);
        bg = Long.reverse(5456606863918567246L);
        bh = Long.reverse(0x2000000000000000L);
        bi = (0 >>> 14 | 0 << -14) & 0xFFFFFFFF;
        bj = Integer.reverse(0);
        bk = Integer.reverse(0);
        bl = 960 >>> 70 | 960 << -70;
        bm = Long.reverse(5456606863918567246L);
        bn = Long.reverse(0x2000000000000000L);
        bo = Integer.reverse(Integer.MIN_VALUE);
        bp = Integer.reverse(0x28000000);
        bq = 262144 >>> 82 | 262144 << -82;
        br = Integer.reverse(0);
        bs = Integer.reverse(0x8000000);
        bt = Long.reverse(5456606863918567246L);
        bu = Long.reverse(0x2000000000000000L);
        bv = 0x44000000 >>> 122 | 0x44000000 << -122;
        bw = Integer.reverse(-1);
        bx = Long.reverse(7762449873132261198L);
        by = Integer.reverse(0);
        bz = Integer.reverse(0);
        ca = Integer.reverse(0x48000000);
        cb = Long.reverse(5456606863918567246L);
        cc = Long.reverse(0x2000000000000000L);
        cd = (0x26000000 >>> 153 | 0x26000000 << ~153 + 1) & 0xFFFFFFFF;
        ce = Long.reverse(5456606863918567246L);
        cf = Long.reverse(0x2000000000000000L);
        cg = Integer.reverse(0);
        ch = 0 >>> 57 | 0 << ~57 + 1;
        ci = (0x140000 >>> 240 | 0x140000 << -240) & 0xFFFFFFFF;
        cj = Long.reverse(5456606863918567246L);
        ck = Long.reverse(0x2000000000000000L);
        cl = Integer.reverse(-1476395008);
        cm = Long.reverse(7762449873132261198L);
        cn = 0 >>> 208 | 0 << -208;
        co = (16 >>> 100 | 16 << ~100 + 1) & 0xFFFFFFFF;
        cp = (0 >>> 44 | 0 << -44) & 0xFFFFFFFF;
        cq = Integer.reverse(0);
        cr = 0 >>> 167 | 0 << ~167 + 1;
        cs = 0 >>> 229 | 0 << ~229 + 1;
        ct = 0 >>> 150 | 0 << ~150 + 1;
        cu = 0 >>> 21 | 0 << -21;
        cv = Integer.reverse(0);
        cw = 0 >>> 195 | 0 << -195;
        cx = Integer.reverse(0x68000000);
        cy = Integer.reverse(-1);
        cz = Long.reverse(7762449873132261198L);
        da = Integer.reverse(1954545664);
        db = (4816 >>> 4 | 4816 << -4) & 0xFFFFFFFF;
        dc = Integer.reverse(-192937984);
        dd = (0x2000000 >>> 89 | 0x2000000 << ~89 + 1) & 0xFFFFFFFF;
        de = Integer.reverse(0);
        df = -2147482711 >>> 93 | -2147482711 << -93;
        dg = 12 >>> 130 | 12 << ~130 + 1;
        dh = 393216 >>> 78 | 393216 << -78;
        di = Integer.reverse(0x18000000);
        dj = (0x1400000 >>> 180 | 0x1400000 << -180) & 0xFFFFFFFF;
        dk = Integer.reverse(-402653184);
        dl = Long.reverse(7762449873132261198L);
        var_java_lang_String_arr_a = new String[dh];
        var_java_lang_String_arr_b = new String[di];
        NLoginCore_305.b();
        H = dj;
        aT = NLoginCore_305.c("㺀", (int)dk, (long)dl);
    }

    @Generated
    public NLoginCore_305 com_nickuc_login_NLoginCore_305_b(int n) {
        this.J = n;
        return this;
    }

    public static void j(String string, String string2) {
        aT = string + (String)NLoginCore_305.c("㺀", (int)var_int_a, (long)var_long_b) + string2 + (String)NLoginCore_305.c("㺃", (int)var_int_c, (long)(d ^ e));
    }
}

