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
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
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
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.ForceRegisterConfig;
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
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_362
extends NLoginCore_098 {
    private static int bw;
    private static int cg;
    private static int y;
    private static int da;
    private static long o;
    private static long bk;
    private static long ee;
    private static long es;
    private static long df;
    private static int bj;
    private static long at;
    private static long br;
    private static long eb;
    private static int var_int_e;
    private static int m;
    private static long dm;
    private static long ct;
    private static int bd;
    private static long bh;
    private static long di;
    private static String[] f;
    private static long au;
    private static long dc;
    private static String[] var_java_lang_String_arr_e;
    private static int dh;
    private static int dt;
    private static int bl;
    private static long dv;
    private static int ek;
    private static int bz;
    private static long cu;
    private static long dy;
    private static long ds;
    private static long be;
    private static long ci;
    private static long cz;
    private static int eu;
    private static int ce;
    private static int ex;
    private static int cm;
    private static int bu;
    private static int cy;
    private static int em;
    private static int cr;
    private static int dk;
    private static long cd;
    private static long cp;
    private static long cn;
    private static long eo;
    private static int eq;
    private static int cb;
    private static long ab;
    private static int al;
    private static long dp;
    private static long bo;
    private static int dz;
    private static long by;
    private static long et;
    private static int cv;
    private static int bi;
    private static long dj;
    private static int dn;
    private static long p;
    private static int cj;
    private static int bn;
    private static long ck;

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
        o = 3972569916917004207L;
        long l = o ^ 0x2E5558EE0ECF824DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(9 + 60), (byte)(43 + 40), (byte)(39 + 8), (byte)(57 + 10), 66, (byte)(13 + 54), (byte)(44 + 3), (byte)(43 + 37), (byte)(61 + 14), (byte)(61 + 6), (byte)(16 + 67), (byte)(23 + 30), (byte)(34 + 46), (byte)(72 + 25), (byte)(18 + 82), (byte)(11 + 89), (byte)(91 + 14), 110, (byte)(62 + 41)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_362.f[0] = NLoginCore_027.B("êĒÜùĎāÿþĤô÷çĤāğçĂąèĂðċøù", (byte)19, 66);
                    NLoginCore_362.f[1] = NLoginCore_223.F("ӿՇԃԜԾԟԋՁՅԜԚԗ", (byte)19, 70);
                    NLoginCore_362.f[2] = NLoginCore_076.A("ĊĈĈáû÷âďþĤöøĤõĉĤīġĪèĄġøù", (byte)19, 65);
                    NLoginCore_362.f[3] = NLoginCore_091.A("ĝĠÙĢøÞğģï÷Ąí", (byte)19, 65);
                    NLoginCore_362.f[4] = NLoginCore_027.C("ѦѩТѫсЧѨѬирэж", (byte)19, 67);
                    NLoginCore_362.f[5] = NLoginCore_451.C("ѦхѥѪЩіьќѥрѯж", (byte)19, 67);
                    NLoginCore_362.f[6] = NLoginCore_091.F("ԶԥԪԫԥԸՆԢԨԟԼԗ", (byte)19, 70);
                    NLoginCore_362.f[7] = NLoginCore_027.D("ѓёёЪфрЫјчѭрќэющоьѨдюыњщѷҀѸњџҁѴнѼёҁѕ҈ыѸѽрќҐѝі", (byte)19, 68);
                    NLoginCore_362.f[8] = NLoginCore_201.B("öĎýùđčöÿĢæÚùõúÞċĊùĄĞİûøù", (byte)19, 66);
                    NLoginCore_362.f[9] = NLoginCore_223.E("ԴԲԲԋԥԡԌԹԨՎԡԽԮԯԪԟԭՉԕԯԬԽԙՒՌԪ՜ԚդԷՁԺ԰ԷԼԧՕԹԶաՄԧԭԷ", (byte)19, 69);
                    NLoginCore_362.f[10] = NLoginCore_091.D("едќмгѭшЪѬяаж", (byte)19, 68);
                    NLoginCore_362.f[11] = NLoginCore_384.D("ѓёёЪфрЫјчѭрќэющоьѨдюыѦњѮѨѹкѪҁѸҁсц҃ѻ҅ѡчпѧўэҏі", (byte)19, 68);
                    NLoginCore_362.f[12] = NLoginCore_138.F("ԖԕԽԝԔՎԩԋՍ԰ԑԗ", (byte)19, 70);
                    NLoginCore_362.f[13] = NLoginCore_110.B("ĊĈĈáû÷âďþĤ÷ēĄąĀõăğëąĂčąĂįĒêČôĳĖùľĩĸċĸĵľĕĲĘÿč", (byte)19, 66);
                    NLoginCore_362.f[14] = NLoginCore_446.B("êçČĒùėâøÝðøí", (byte)19, 66);
                    NLoginCore_362.f[15] = NLoginCore_384.F("ԷԢԜԴԕԡՊԋԭԬԩՔՈԬԧՖԴԮՄԲԛՒ՟ԚԗԷԔԲԹ՘զԦՄՕ՘ՕՠԿՃթկՠդԷ", (byte)19, 70);
                    NLoginCore_362.f[16] = NLoginCore_091.A("ØĒĕĚĐùãēâĞĨÛĥëĆăĤÿçüýıøù", (byte)19, 65);
                    NLoginCore_362.f[17] = NLoginCore_027.E("ԨՄԥՊԼԭՎՁՆՌԋՔՕՕ՗ՃԹՓԦՙԯԵԢԣ", (byte)19, 69);
                    NLoginCore_362.f[18] = NLoginCore_387.D("жХєтѫєнцѠцхж", (byte)19, 68);
                    NLoginCore_362.f[19] = NLoginCore_027.F("ԐԖԄԫԬԝԊԉԍԡԍԗ", (byte)19, 70);
                    NLoginCore_362.f[20] = NLoginCore_091.A("çÜýÿÞĕĥĥĕĈĂõøĀĜĤęêîĢĭûøù", (byte)19, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_362.f[0] = NLoginCore_324.B("êĒÜùĎāÿþĤôôôôèìģ÷ďěíģıøù", (byte)19, 66);
                    NLoginCore_362.f[1] = NLoginCore_092.B("ñęġĂÞĖàĚħßãßÜĞĘğĢĎĨāĪûøù", (byte)19, 66);
                    NLoginCore_362.f[2] = NLoginCore_427.D("ѓёёЪфрЫјчѭпЯђфЬѭьфЯшќйѬьзѻѺѵњжѸс", (byte)19, 68);
                    NLoginCore_362.f[3] = NLoginCore_223.F("ԿԘԥԷԣԤԌԤԦԝԉԮԌԟԱԨԬՖԲԱՐՋԢԣ", (byte)19, 70);
                    NLoginCore_362.f[4] = NLoginCore_453.E("ԸԥՅԙԡԞԞՃԤԥԑԽՊ԰ԑԳԗՕԪ՘ՉԥԢԣ", (byte)19, 69);
                    NLoginCore_362.f[5] = NLoginCore_223.F("ԣԛԾԵԫԝՀԛՐԞԈՁԦՍԡԱՏՓԘԼԭՋԢԣ", (byte)19, 70);
                    NLoginCore_362.f[6] = NLoginCore_427.B("çćöčàîáąħėĒùćõĤìĊĤěîĀċøù", (byte)19, 66);
                    NLoginCore_362.f[7] = NLoginCore_451.E("ԴԲԲԋԥԡԌԹԨՎԡԽԮԯԪԟԭՉԕԯԬԻԪ՘աՙԻՀբՕԞ՝՗ՊԴԨԴԨՁԡժՈլԷ", (byte)19, 69);
                    NLoginCore_362.f[8] = NLoginCore_004.F("ԠԸԧԣԻԷԠԩՌԐԈԋԊԌԩԪ՘ՌՃԩՒԙԖԙՊԮ՘՜՟գԹՑ", (byte)19, 70);
                    NLoginCore_362.f[9] = NLoginCore_559.A("ĊĈĈáû÷âďþĤ÷ēĄąĀõăğëąĂēïĨĢĀĲðĺčėĐĶ÷ĨĘďĽŃĠøùĐč", (byte)19, 65);
                    NLoginCore_362.f[10] = NLoginCore_387.C("яногчЬѡЦћљхж", (byte)19, 67);
                    NLoginCore_362.f[11] = NLoginCore_324.D("ѓёёЪфрЫјчѭрќэющоьѨдюыѦњѮѨѹкѪҁѸҁснѨѝџћѴѫшѢѧ҈ыҎѴяѭѪҕ҅ҕѶҊѡѢ", (byte)19, 68);
                    NLoginCore_362.f[12] = NLoginCore_004.E("ՁԳԗՀԝԕԩԸԣԃԱԮԎԝԨՓԖՄՒ՚ԷՋԢԣ", (byte)19, 69);
                    NLoginCore_362.f[13] = NLoginCore_173.C("ѓёёЪфрЫјчѭрќэющоьѨдюыіюыѸћгѕнѼџтѯџѢуј҃ѢҏѺѽѣѿѧғы҂ҕҏѭ҇ҙѤѡѢ", (byte)19, 67);
                    NLoginCore_362.f[14] = NLoginCore_091.D("њЦзќоѭѦѝоѢаж", (byte)19, 68);
                    NLoginCore_362.f[15] = NLoginCore_173.A("čøòĊë÷ĠáăĂÿĪĞĂýĬĊĄĚĈñĨĵðíčêĈďĮļüĕĩ÷ĻğĐŅĭİÿņč", (byte)19, 65);
                    NLoginCore_362.f[16] = NLoginCore_223.B("ØĒĕĚĐùãēâĞĨēĜééèħĂùĞíûøù", (byte)19, 66);
                    NLoginCore_362.f[17] = NLoginCore_091.F("ԨՄԥՊԼԭՎՁՆՌԌԢԾԩԿՎԣՃՙԵՓՋԢԣ", (byte)19, 70);
                    NLoginCore_362.f[18] = NLoginCore_446.D("хјгїыѩѦѭўѤэж", (byte)19, 68);
                    NLoginCore_362.f[19] = NLoginCore_092.D("СквѢѓсѩѠЫѥйаќђўтѱяиѩйєст", (byte)19, 68);
                    NLoginCore_362.f[20] = NLoginCore_091.F("ԑԆԧԩԈԿՏՏԿԲԭԲԯՁՓԣԫՋԭԺԱԥԢԣ", (byte)19, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_362.f[0] = NLoginCore_138.C("втѩћпќѕяѡсџж", (byte)19, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_362.f[0] = NLoginCore_223.D("іїсѫеХїкЮцѣж", (byte)19, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_362.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("ԂԤԦԆԪՉՁ՗ՃԒՐՆՔՎԗԼ՞՝Օ՛ՕԪ", (byte)30, 70), NLoginCore_362.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.D("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߛ߇ߝ߉ߌ߀ߦߐ߃ߒѤ", (byte)30, 68) + string + NLoginCore_201.A("õ", (byte)30, 65) + methodType.toString(), exception);
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        String string = resultSet.getString((String)NLoginCore_362.c("㺀", (int)dn, (long)(dp ^ ds)));
        String string2 = resultSet.getString((String)NLoginCore_362.c("㺃", (int)dt, (long)(dv ^ dy)));
        String string3 = resultSet.getString((String)NLoginCore_362.c("㺆", (int)dz, (long)(eb ^ ee)));
        UUID uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_362.c("㺉", (int)(ek & em), (long)eo)));
        this.a(string, (String)NLoginCore_362.c("㺌", (int)eq, (long)(es ^ et)) + string2, string3, uUID, (Consumer<ForceRegisterConfig>)null);
    }

    public NLoginCore_362(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_s, (String)NLoginCore_362.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_362.c("㺃", (int)y, (long)ab));
    }

    static {
        var_int_e = Integer.reverse(0);
        m = Integer.reverse(-1);
        p = Long.reverse(138974891002463468L);
        y = (2 >>> 129 | 2 << ~129 + 1) & 0xFFFFFFFF;
        ab = Long.reverse(138974891002463468L);
        al = Integer.reverse(0x40000000);
        at = Long.reverse(-725716237452671764L);
        au = Long.reverse(-864691128455135232L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-725716237452671764L);
        bh = Long.reverse(-864691128455135232L);
        bi = Integer.reverse(-1);
        bj = Integer.reverse(0x20000000);
        bk = Long.reverse(138974891002463468L);
        bl = Integer.reverse(0);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(-725716237452671764L);
        br = Long.reverse(-864691128455135232L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(138974891002463468L);
        bz = 114688 >>> 46 | 114688 << ~46 + 1;
        cb = Integer.reverse(-1);
        cd = Long.reverse(138974891002463468L);
        ce = Integer.reverse(0x10000000);
        cg = Integer.reverse(-1);
        ci = Long.reverse(138974891002463468L);
        cj = Integer.reverse(-1879048192);
        ck = Long.reverse(138974891002463468L);
        cm = 5 >>> 223 | 5 << ~223 + 1;
        cn = Long.reverse(-725716237452671764L);
        cp = Long.reverse(-864691128455135232L);
        cr = 11264 >>> 202 | 11264 << ~202 + 1;
        ct = Long.reverse(-725716237452671764L);
        cu = Long.reverse(-864691128455135232L);
        cv = (3072 >>> 40 | 3072 << ~40 + 1) & 0xFFFFFFFF;
        cy = Integer.reverse(-1);
        cz = Long.reverse(138974891002463468L);
        da = Integer.reverse(-1342177280);
        dc = Long.reverse(-725716237452671764L);
        df = Long.reverse(-864691128455135232L);
        dh = (458752 >>> 207 | 458752 << -207) & 0xFFFFFFFF;
        di = Long.reverse(-725716237452671764L);
        dj = Long.reverse(-864691128455135232L);
        dk = (245760 >>> 46 | 245760 << -46) & 0xFFFFFFFF;
        dm = Long.reverse(138974891002463468L);
        dn = 2 >>> 125 | 2 << ~125 + 1;
        dp = Long.reverse(-725716237452671764L);
        ds = Long.reverse(-864691128455135232L);
        dt = (0x110000 >>> 176 | 0x110000 << ~176 + 1) & 0xFFFFFFFF;
        dv = Long.reverse(-725716237452671764L);
        dy = Long.reverse(-864691128455135232L);
        dz = 18 >>> 0 | 18 << -0;
        eb = Long.reverse(-725716237452671764L);
        ee = Long.reverse(-864691128455135232L);
        ek = Integer.reverse(-939524096);
        em = (-1 >>> 71 | -1 << ~71 + 1) & 0xFFFFFFFF;
        eo = Long.reverse(138974891002463468L);
        eq = (640 >>> 197 | 640 << ~197 + 1) & 0xFFFFFFFF;
        es = Long.reverse(-725716237452671764L);
        et = Long.reverse(-864691128455135232L);
        eu = Integer.reverse(-1476395008);
        ex = (0x50000001 >>> 60 | 0x50000001 << -60) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[eu];
        f = new String[ex];
        NLoginCore_362.void_b();
    }

    private static String a(int n, long l) {
        l ^= 0x2FL;
        l ^= 0x2E5558EE0ECF824DL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(48 + 35), (byte)(23 + 24), (byte)(57 + 10), (byte)(7 + 59), (byte)(60 + 7), (byte)(20 + 27), (byte)(32 + 48), (byte)(14 + 61), (byte)(15 + 52), (byte)(76 + 7), (byte)(23 + 30), (byte)(70 + 10), (byte)(24 + 73), (byte)(23 + 77), (byte)(16 + 84), (byte)(95 + 10), 110, (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(56 + 27)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬ߹ߥ߻ߧߪߞࠄ߮ߡ߰", (byte)40, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_362.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }
}

