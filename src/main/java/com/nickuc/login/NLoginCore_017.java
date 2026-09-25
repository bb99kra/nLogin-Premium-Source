/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.event.PluginMessageEvent
 *  net.md_5.bungee.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_046;
import com.nickuc.login.NLoginCore_451;
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
import net.md_5.bungee.api.event.PluginMessageEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_017
implements NLoginInterface_046 {
    private static String[] var_java_lang_String_arr_a;
    private static long p;
    private static int f;
    private static int ae;
    private static int j;
    private static int g;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_d;
    private static int x;
    private static long y;
    private static int ac;
    private static int q;
    private static String[] var_java_lang_String_arr_b;
    private static long w;
    private static long h;
    private static int aa;
    private static long c;
    private static int ab;
    private static long v;
    private static int l;
    private static int var_int_b;
    private static long m;
    private static int u;
    private static int i;
    private static long ad;
    private static int z;
    private static int s;
    private static int k;
    private static int var_int_a;
    private static int n;
    private static int e;
    private static long var_long_d;
    private static int r;
    private static int o;
    private static int af;
    private static long t;

    static {
        var_int_a = Integer.reverse(-1);
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-5774156773265975862L);
        e = Integer.reverse(0);
        f = 32 >>> 37 | 32 << ~37 + 1;
        g = -1 >>> 217 | -1 << -217;
        h = Long.reverse(-5774156773265975862L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = 0x10000000 >>> 220 | 0x10000000 << ~220 + 1;
        k = Integer.reverse(0x40000000);
        l = (-1 >>> 187 | -1 << ~187 + 1) & 0xFFFFFFFF;
        m = Long.reverse(-5774156773265975862L);
        n = (0x6000000 >>> 185 | 0x6000000 << -185) & 0xFFFFFFFF;
        o = (-1 >>> 136 | -1 << -136) & 0xFFFFFFFF;
        p = Long.reverse(-5774156773265975862L);
        q = Integer.reverse(0);
        r = 0x200000 >>> 213 | 0x200000 << -213;
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-5774156773265975862L);
        u = (320 >>> 38 | 320 << -38) & 0xFFFFFFFF;
        v = Long.reverse(-1162470754838587958L);
        w = Long.reverse(0x4000000000000000L);
        x = Integer.reverse(0x60000000);
        y = Long.reverse(-5774156773265975862L);
        z = Integer.reverse(0);
        aa = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & 0xFFFFFFFF;
        ab = 0x38000000 >>> 27 | 0x38000000 << -27;
        ac = -1 >>> 82 | -1 << -82;
        ad = Long.reverse(-5774156773265975862L);
        ae = Integer.reverse(0x10000000);
        af = Integer.reverse(0x10000000);
        var_java_lang_String_arr_a = new String[ae];
        var_java_lang_String_arr_b = new String[af];
        NLoginCore_017.b();
    }

    private static void b() {
        int n;
        c = 6028921560642386935L;
        long l = c ^ 0x85D387FF42DE00FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), 69, (byte)(60 + 23), (byte)(3 + 44), 67, (byte)(24 + 42), (byte)(65 + 2), (byte)(16 + 31), (byte)(59 + 21), (byte)(51 + 24), (byte)(57 + 10), (byte)(18 + 65), (byte)(20 + 33), (byte)(10 + 70), (byte)(77 + 20), (byte)(79 + 21), (byte)(37 + 63), (byte)(84 + 21), (byte)(56 + 54), (byte)(71 + 32)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
                    NLoginCore_017.var_java_lang_String_arr_b[0] = NLoginCore_092.E("ՙՎՠՅըՓբՠԯՊգԷԺզՅՐյսՔխԵ՜ՉՊ", (byte)58, 69);
                    NLoginCore_017.var_java_lang_String_arr_b[1] = NLoginCore_027.F("՟ըկՆկՃՎեՌՙՖղթՅ՛Ժղ՛՟Պղ՜ՉՊ", (byte)58, 70);
                    NLoginCore_017.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ӒӏҿһҼҙҚҿӤӔҡӃӛҲҽӬӚҥӭҺөҩӇӐұӤҲӖӎҫӅӋӴҶӬӧԀӻӵӛӠӚӓӯԇӢӕӶӋӫӪӰӞӧӢӠӋӧӣӉӪԈӯԐӹԇԍӟӾԖԞӾӼӟԇԅԘӺԠԢԆӼԝԧԝԯӶӷ", (byte)58, 67);
                    NLoginCore_017.var_java_lang_String_arr_b[3] = NLoginCore_027.F("՜լ՚Ի՟կՔՇ՟ՅՇխՑՍՅՓշՓ՚ՍլՑՂՔֆբօ։ՙփևՍևֈ֋֌ՠրՠ։իքճ֓օՔ֛՝֓ժ֠բ֑ՠխց֝պվսֆ֟՟֬֩ևտկօ֥֎֏֤օ֥ֈֱծֱ֭֨֞֫տׂ֤։֊", (byte)58, 70);
                    NLoginCore_017.var_java_lang_String_arr_b[4] = NLoginCore_446.C("ӋҳҩҰүғҷӓӑҾҜҳӒҥҠӝҦӮҼҺҦӯӎҽҼөӁӷӥӆӧӕ", (byte)58, 67);
                    NLoginCore_017.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ӍқһӏӕӀҶҚӄҮӜӕҹҨҢӕҪӚӞҦӝӉҶҷ", (byte)58, 68);
                    NLoginCore_017.var_java_lang_String_arr_b[6] = NLoginCore_223.B("ĵōĭġŠļņŋŊŵľĻ", (byte)58, 66);
                    NLoginCore_017.var_java_lang_String_arr_b[7] = NLoginCore_138.B("ĥŚĨņŎĹŮŠŧŁľũœŇůĺťŖĴŰżŊƁŠźœŧşƂƅŧƊƌŞƂƃūƎŬŊƑŲƁƊŎƆŖŮƚřŚŭřƍƝŭűŗťƝźƈƣżƊƘƛůƠƩżƢŽƱƮŮƅŶŸƈƔƎƛƙƶƁƱƗǃƽƂƥƄƩƄƶ", (byte)58, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_017.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ŖŋŝłťŐşŝĬŇŠŅŔłŦŤŜűŋžżſņŇ", (byte)58, 66);
                    NLoginCore_017.var_java_lang_String_arr_b[1] = NLoginCore_575.A("ŜťŬŃŬŀŋŢŉŖŔŬŦřŖŐŌžņžſřņŇ", (byte)58, 65);
                    NLoginCore_017.var_java_lang_String_arr_b[2] = NLoginCore_453.E("եբՒՎՏԬԭՒշէԴՖծՅՐտխԸրՍռԼ՚գՄշՅթաԾ՘՞ևՉտպ֓֎ֈծճխզւ֚յը։՞վսփձպյճ՞պն՜ս֛ւ֣֌֚֠ղֱ֑֑֩֏ղֺ֡շֱ֩֗ոַջִֵ֤֮֡֞֠׊׊ׂ֓֋ַ", (byte)58, 69);
                    NLoginCore_017.var_java_lang_String_arr_b[3] = NLoginCore_324.A("řũŗĸŜŬőńŜłńŪŎŊłŐŴŐŗŊũŎĿőƃşƂƆŖƀƄŊƄƅƈƉŝŽŝƆŨƁŰƐƂőƘŚƐŧƝşƎŝŪžƚŷŻźƃƜŜƩƦƄżŬƂƢƋƌơƂƢƒƀƁƩźƭƾƩƴƑƯƆƇ", (byte)58, 65);
                    NLoginCore_017.var_java_lang_String_arr_b[4] = NLoginCore_324.A("śŃĹŀĿģŇţšŎĬŃŢĵİŭĶžŌŊĶĺŲŝŲŰƆŝŖŖņŹ", (byte)58, 65);
                    NLoginCore_017.var_java_lang_String_arr_b[5] = NLoginCore_092.B("ŝīŋşťŐņĪŔľŮũĪįŚŦĵĴőƀŭſņŇ", (byte)58, 66);
                    NLoginCore_017.var_java_lang_String_arr_b[6] = NLoginCore_091.B("ŕŀťŰŌŚŇŃıŇņĻ", (byte)58, 66);
                    NLoginCore_017.var_java_lang_String_arr_b[7] = NLoginCore_027.A("ĥŚĨņŎĹŮŠŧŁľũœŇůĺťŖĴŰżŊƁŠźœŧşƂƅŧƊƌŞƂƃūƎŬŊƑŲƁƊŎƆŖŮƚřŚŭřƍƝŭűŗťƝźƈƣżƊƘƛůƠƩżƢŽƱƮŮƅŶŸƈƔƎƛƙƶŸƜƙǀƼǆƐǈƒƔƺƆƥǃƿǆǄǇƌǆǌƞƛ", (byte)58, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_017.var_java_lang_String_arr_b[0] = NLoginCore_451.A("łŮĩŰŅŊųĪŉşŴŊŐńťŖťŴŻĹůŎŝĻŽńƆſƅŲşœ", (byte)58, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_017.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՅՎ՚ՌԳԼԭԲՅհՋծԹլՊՌծՈձՂճղՉՊ", (byte)58, 69);
                }
            }
        }
    }

    @Generated
    public NLoginCore_017(nLoginBungee nLoginBungee2) {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_d = nLoginBungee2;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_017.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ҚҼҾҞӂӡәӯӛҪӨӞӬӦүӔӶӵӭӳӭӂ", (byte)63, 67), NLoginCore_017.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("՞իժԭխթդխոէԴղնկղոԺࣕࢨ࣍ࣖࣃ࣓ࣗ࣍ࣉࣚࣘࣖࣚՓ", (byte)63, 69) + string + NLoginCore_076.B("ķ", (byte)63, 66) + methodType.toString(), exception);
        }
    }

    /*
     * Exception decompiling
     */
    @EventHandler
    public void a(PluginMessageEvent var1_1) {
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
        l ^= 2L;
        l ^= 0x85D387FF42DE00FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(38 + 31), (byte)(45 + 38), (byte)(13 + 34), (byte)(65 + 2), (byte)(27 + 39), (byte)(44 + 23), (byte)(11 + 36), 80, (byte)(72 + 3), (byte)(34 + 33), (byte)(49 + 34), (byte)(8 + 45), (byte)(8 + 72), (byte)(94 + 3), (byte)(77 + 23), (byte)(77 + 23), (byte)(47 + 58), 110, (byte)(56 + 47)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("տ֌֋Վ֎֊օ֎֙ֈՕ֓֗֐֓֙՛ࣶࣉ࣮࣮ࣹࣷࣤࣸࣴ࣪ࣻࣷࣻ", (byte)96, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_017.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

