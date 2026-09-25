/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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
import lombok.Generated;

public final class NLoginCore_214
extends Enum<NLoginCore_214> {
    public static final /* enum */ NLoginCore_214 var_com_nickuc_login_NLoginCore_214_a;
    public static final /* enum */ NLoginCore_214 var_com_nickuc_login_NLoginCore_214_b;
    public static final /* enum */ NLoginCore_214 var_com_nickuc_login_NLoginCore_214_c;
    public static final /* enum */ NLoginCore_214 var_com_nickuc_login_NLoginCore_214_d;
    public static final /* enum */ NLoginCore_214 var_com_nickuc_login_NLoginCore_214_e;
    private final String S;
    private static final /* synthetic */ NLoginCore_214[] var_com_nickuc_login_NLoginCore_214_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static long var_long_e;
    private static int f;
    private static int g;
    private static long h;
    private static long i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;
    private static int s;
    private static long t;
    private static long u;
    private static int v;
    private static int w;
    private static long x;
    private static long y;
    private static int z;
    private static int aa;
    private static int ab;
    private static long ac;
    private static int ad;
    private static int ae;
    private static long af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static long ar;
    private static int as;
    private static int at;
    private static long au;
    private static long av;
    private static int aw;
    private static long ax;
    private static long ay;
    private static int az;
    private static int ba;
    private static long bb;
    private static long bc;
    private static int bd;
    private static long be;
    private static long bf;
    private static int bg;
    private static int bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static long bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static long bp;
    private static int bq;
    private static long br;
    private static long bs;
    private static int bt;
    private static int bu;
    private static int bv;
    private static long bw;

    @Generated
    private NLoginCore_214(String string2) {
        this.S = string2;
    }

    public static NLoginCore_214[] values() {
        return (NLoginCore_214[])var_com_nickuc_login_NLoginCore_214_arr_a.clone();
    }

    public static NLoginCore_214 valueOf(String string) {
        return Enum.valueOf(NLoginCore_214.class, string);
    }

    private static void b() {
        int n;
        var_long_c = -405955743651382151L;
        long l = var_long_c ^ 0x475C675B4C822003L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(36 + 33), (byte)(11 + 72), (byte)(43 + 4), 67, (byte)(51 + 15), 67, (byte)(46 + 1), (byte)(41 + 39), (byte)(61 + 14), (byte)(48 + 19), (byte)(8 + 75), (byte)(32 + 21), (byte)(10 + 70), (byte)(54 + 43), (byte)(31 + 69), (byte)(66 + 34), (byte)(41 + 64), (byte)(8 + 102), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
                    NLoginCore_214.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ÊĀçÍúËĎÓÐóêÛ", (byte)10, 65);
                    NLoginCore_214.var_java_lang_String_arr_b[1] = NLoginCore_387.E("ԕԺԟԵԜՁՅԶԄԩԑԎ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ӽԮӹԚԒՃԝԓԷԜԈԎ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[3] = NLoginCore_387.E("ԬԸӷՃԔԎԖԛԳԁԿԎ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[4] = NLoginCore_559.C("ЌЅЎЌЭэъсРЫжЛ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[5] = NLoginCore_027.C("ЈпуЭЯнЮШфшЍЭЪШДЕьєЫигйЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[6] = NLoginCore_427.F("ӻԲԶԠԢ԰ԡԛԷԻԃՆԙՃԛՊԋԹՑԥԠԜԙԚ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[7] = NLoginCore_173.C("ЪЩрМцЩЏямѕяжИЯЦйнМдПьяЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[8] = NLoginCore_091.C("ЊрЧЍкЋюГАгЪЛ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ӽԳԚԀԭӾՁԆԃԦԝԎ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[10] = NLoginCore_324.D("ЊлІЧПѐЪРфЩЕЛ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[11] = NLoginCore_027.F("ӽԮӹԚԒՃԝԓԷԜԈԎ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[12] = NLoginCore_138.E("ԜӽӳԮԐԂԯԆԕ԰ՉԈӽԪԼԇԋՂԜԉԿՒԙԚ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[13] = NLoginCore_027.C("ЊцЫЪцЭаШдВвЛ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[14] = NLoginCore_559.C("ЩЊЀлНЏмГТніуВаЮюЎцЧщвЩЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[15] = NLoginCore_384.A("çăæØáýĆďćàâÛ", (byte)10, 65);
                    NLoginCore_214.var_java_lang_String_arr_b[16] = NLoginCore_027.C("ЗыунЌЦбХУщЈПхфщЕѕЮўШмЩЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[17] = NLoginCore_201.E("ӻԜԁԝԁԿԮՃԏԔԤԩՋԺӿԣՈՍԤՐԅԜԙԚ", (byte)10, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_214.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ûõÙúëðąëććÎăçïçéÖĈĕÿĘğæç", (byte)10, 65);
                    NLoginCore_214.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ùè÷üàðÿĀîáöåóĊĐçÚ×êÞÝğæç", (byte)10, 66);
                    NLoginCore_214.var_java_lang_String_arr_b[2] = NLoginCore_387.E("ԯԍՁӹӾӽԹԿՆԽԦԟԨԤԷԆՊՈՃԏՊԬԙԚ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ИъФЁчвЪѓъэуРётыЖаїАНняЦЧ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[4] = NLoginCore_173.D("ЕЕлшІѐМЍмєяшеЗеЛїцЖШзйЦЧ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[5] = NLoginCore_427.D("ЈпуЭЯнЮШфшЎвйЧєЬгѓьпЖџЦЧ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[6] = NLoginCore_201.B("ÈÿăíïýîèĄĈÎõĀėóĘćĒëçĒďæç", (byte)10, 66);
                    NLoginCore_214.var_java_lang_String_arr_b[7] = NLoginCore_110.D("ЪЩрМцЩЏямѕябдяцдЯиЙюійЦЧ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[8] = NLoginCore_201.F("ӵԹԵԀӼӽԸԔԱԟԞԵԛՌԢԇԩՁԐԟԼԬԙԚ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[9] = NLoginCore_076.C("щЛХяРфђьюЯФюёУщыияѝщИйЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[10] = NLoginCore_091.D("УЦМмПБнФмдЯЮѓШЖђГЕИЖќЩЦЧ", (byte)10, 68);
                    NLoginCore_214.var_java_lang_String_arr_b[11] = NLoginCore_575.F("ԠԈԿՂӾԱԺՁԀԴԹԟՅԃԋԢԉՆԐԧԏԬԙԚ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[12] = NLoginCore_173.C("ЩЊЀлНЏмГТнідЬйФицЧЮўЫяЦЧ", (byte)10, 67);
                    NLoginCore_214.var_java_lang_String_arr_b[13] = NLoginCore_201.F("ԋԺԚԎԳԮԥԮԿԇԄԎ", (byte)10, 70);
                    NLoginCore_214.var_java_lang_String_arr_b[14] = NLoginCore_091.B("éÊÀûÝÏüÓâýĔãĉĚęÕĄúċþëďæç", (byte)10, 66);
                    NLoginCore_214.var_java_lang_String_arr_b[15] = NLoginCore_138.E("ӽԐԜԚԿԑԳԳԺԈԳԎ", (byte)10, 69);
                    NLoginCore_214.var_java_lang_String_arr_b[16] = NLoginCore_223.A("×ċăýÌæñåãĉÌÕėďëüĔçñĠØďæç", (byte)10, 65);
                    NLoginCore_214.var_java_lang_String_arr_b[17] = NLoginCore_076.A("ÈéÎêÎČûĐÜáðăĐÐĒéċèČċØğæç", (byte)10, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_214.var_java_lang_String_arr_b[0] = NLoginCore_387.D("ЗчщСПшщюМЪгуіхаЍлнбоѠяЦЧ", (byte)10, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_214.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ÆÆÅçÝãòâĂĖáïēúĕąæôĈÚċĝĎìĔôąĀĒÿāė", (byte)10, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0x475C675B4C822003L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(45 + 24), (byte)(22 + 61), (byte)(21 + 26), (byte)(50 + 17), (byte)(44 + 22), (byte)(64 + 3), 47, (byte)(18 + 62), (byte)(13 + 62), (byte)(5 + 62), (byte)(29 + 54), (byte)(29 + 24), (byte)(55 + 25), (byte)(91 + 6), (byte)(31 + 69), (byte)(57 + 43), (byte)(80 + 25), (byte)(98 + 12), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж޼ߌ߀ޱ߃߆ߋߌߍߗߔ", (byte)22, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_214.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static /* synthetic */ NLoginCore_214 b(String string) {
        return NLoginCore_214.a(string);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_214.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.B("«ÍÏ¯ÓòêĀì»ùïý÷ÀåćĆþĄþÓ", (byte)2, 66), NLoginCore_214.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.C("ОЫЪϭЭЩФЭиЧϴвжЯвиϺހސބݵއފޏސޑޛޘБ", (byte)2, 67) + string + NLoginCore_575.C("ϵ", (byte)2, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (-1 >>> 192 | -1 << ~192 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-7044609931319461281L);
        var_long_e = Long.reverse(0x1400000000000000L);
        f = Integer.reverse(0);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-7044609931319461281L);
        i = Long.reverse(0x1400000000000000L);
        j = 4 >>> 98 | 4 << -98;
        k = Integer.reverse(0x40000000);
        l = Long.reverse(-7044609931319461281L);
        m = Long.reverse(0x1400000000000000L);
        n = Integer.reverse(0x40000000);
        o = 49152 >>> 142 | 49152 << ~142 + 1;
        p = Long.reverse(-7044609931319461281L);
        q = Long.reverse(0x1400000000000000L);
        r = 49152 >>> 142 | 49152 << -142;
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-7044609931319461281L);
        u = Long.reverse(0x1400000000000000L);
        v = Integer.reverse(0x20000000);
        w = 20480 >>> 108 | 20480 << -108;
        x = Long.reverse(-7044609931319461281L);
        y = Long.reverse(0x1400000000000000L);
        z = (0x2800000 >>> 183 | 0x2800000 << -183) & 0xFFFFFFFF;
        aa = 49152 >>> 237 | 49152 << -237;
        ab = (-1 >>> 179 | -1 << -179) & 0xFFFFFFFF;
        ac = Long.reverse(-8485761812078020001L);
        ad = -1073741824 >>> 189 | -1073741824 << ~189 + 1;
        ae = 0xE00000 >>> 213 | 0xE00000 << ~213 + 1;
        af = Long.reverse(-8485761812078020001L);
        ag = (224 >>> 69 | 224 << ~69 + 1) & 0xFFFFFFFF;
        ah = 160 >>> 133 | 160 << ~133 + 1;
        ai = (0 >>> 113 | 0 << -113) & 0xFFFFFFFF;
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = Integer.reverse(0x40000000);
        al = Integer.reverse(-1073741824);
        am = 16384 >>> 140 | 16384 << -140;
        an = Integer.reverse(0x48000000);
        ao = 9 >>> 31 | 9 << ~31 + 1;
        ap = (8 >>> 64 | 8 << ~64 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(-1);
        ar = Long.reverse(-8485761812078020001L);
        as = Integer.reverse(0);
        at = (0x24000000 >>> 58 | 0x24000000 << ~58 + 1) & 0xFFFFFFFF;
        au = Long.reverse(-7044609931319461281L);
        av = Long.reverse(0x1400000000000000L);
        aw = Integer.reverse(0x50000000);
        ax = Long.reverse(-7044609931319461281L);
        ay = Long.reverse(0x1400000000000000L);
        az = (0x200000 >>> 213 | 0x200000 << ~213 + 1) & 0xFFFFFFFF;
        ba = Integer.reverse(-805306368);
        bb = Long.reverse(-7044609931319461281L);
        bc = Long.reverse(0x1400000000000000L);
        bd = Integer.reverse(0x30000000);
        be = Long.reverse(-7044609931319461281L);
        bf = Long.reverse(0x1400000000000000L);
        bg = (8 >>> 2 | 8 << -2) & 0xFFFFFFFF;
        bh = Integer.reverse(-1342177280);
        bi = Long.reverse(-8485761812078020001L);
        bj = (0x380000 >>> 178 | 0x380000 << -178) & 0xFFFFFFFF;
        bk = Integer.reverse(-1);
        bl = Long.reverse(-8485761812078020001L);
        bm = 12 >>> 2 | 12 << -2;
        bn = Integer.reverse(-268435456);
        bo = Integer.reverse(-1);
        bp = Long.reverse(-8485761812078020001L);
        bq = Integer.reverse(0x8000000);
        br = Long.reverse(-7044609931319461281L);
        bs = Long.reverse(0x1400000000000000L);
        bt = Integer.reverse(0x20000000);
        bu = 34 >>> 129 | 34 << -129;
        bv = Integer.reverse(-1);
        bw = Long.reverse(-8485761812078020001L);
        var_java_lang_String_arr_a = new String[an];
        var_java_lang_String_arr_b = new String[ao];
        NLoginCore_214.b();
        var_com_nickuc_login_NLoginCore_214_a = new NLoginCore_214((String)NLoginCore_214.c("㺃", (int)at, (long)(au ^ av)));
        var_com_nickuc_login_NLoginCore_214_b = new NLoginCore_214((String)NLoginCore_214.c("㺉", (int)ba, (long)(bb ^ bc)));
        var_com_nickuc_login_NLoginCore_214_c = new NLoginCore_214((String)NLoginCore_214.c("㺏", (int)bh, (long)bi));
        var_com_nickuc_login_NLoginCore_214_d = new NLoginCore_214((String)NLoginCore_214.c("㺕", (int)(bn & bo), (long)bp));
        var_com_nickuc_login_NLoginCore_214_e = new NLoginCore_214((String)NLoginCore_214.c("㺛", (int)(bu & bv), (long)bw));
        var_com_nickuc_login_NLoginCore_214_arr_a = NLoginCore_214.a();
    }

    static /* synthetic */ String a(NLoginCore_214 NLoginCore_2142) {
        return NLoginCore_2142.S;
    }

    /*
     * Exception decompiling
     */
    @Nullable
    private static NLoginCore_214 a(String var0) {
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

    private static /* synthetic */ NLoginCore_214[] a() {
        NLoginCore_214[] NLoginCore_214Array = new NLoginCore_214[ah];
        NLoginCore_214Array[NLoginCore_214.ai] = var_com_nickuc_login_NLoginCore_214_a;
        NLoginCore_214Array[NLoginCore_214.aj] = var_com_nickuc_login_NLoginCore_214_b;
        NLoginCore_214Array[NLoginCore_214.ak] = var_com_nickuc_login_NLoginCore_214_c;
        NLoginCore_214Array[NLoginCore_214.al] = var_com_nickuc_login_NLoginCore_214_d;
        NLoginCore_214Array[NLoginCore_214.am] = var_com_nickuc_login_NLoginCore_214_e;
        return NLoginCore_214Array;
    }
}

