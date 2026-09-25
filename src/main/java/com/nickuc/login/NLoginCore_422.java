/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.MemClassLoader
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.loader.MemClassLoader;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginCore_422 {
    private static int bu;
    private static int ab;
    private static int ch;
    private static int am;
    private static int ah;
    private static int ca;
    private static int e;
    private final String var_java_lang_String_bd;
    private static long ar;
    private static int var_int_bf;
    private final String var_java_lang_String_bf;
    private static long as;
    private static long j;
    private static int ba;
    private static int cd;
    private static int var_int_bc;
    private static long bw;
    private static long bz;
    private static int var_int_bg;
    private static long bt;
    private static int ao;
    private static int q;
    private static String[] var_java_lang_String_arr_a;
    private static int x;
    private final String var_java_lang_String_bc;
    private static int var_int_c;
    private static long s;
    private static int au;
    private static int ci;
    private static int bs;
    private static int ac;
    private final String var_java_lang_String_bh;
    private static long var_long_c;
    private static long var_long_bd;
    private static long m;
    private boolean Y;
    private static String[] var_java_lang_String_arr_b;
    private static int br;
    private static int al;
    private static long ae;
    private static int d;
    private static int az;
    private static int bx;
    private static long o;
    private static int ce;
    private static int ag;
    private static int cg;
    private static int var_int_bi;
    private static long aw;
    private static int k;
    private static int var_int_bh;
    private static int bb;
    private String var_java_lang_String_bj;
    private static long w;
    private static int bl;
    private static int ap;
    private static long i;
    private static long cc;
    private static int p;
    private static long l;
    private final String var_java_lang_String_be;
    private static long aj;
    private static int v;
    private static int n;
    private static int bv;
    private static long f;
    private static int bq;
    private static int ak;
    private static int ai;
    private static long by;
    private static long ad;
    private static int ay;
    private static long bo;
    private final String var_java_lang_String_bi;
    private static int t;
    private static long an;
    private static int z;
    private static int aq;
    private static int bp;
    private static long var_long_be;
    private static long y;
    private static int g;
    private static int af;
    private static int h;
    private static int var_int_a;
    private static long ax;
    private static int bm;
    private static long r;
    private static int at;
    private static int var_int_bj;
    private static long var_long_b;
    private static int aa;
    private static int cb;
    private static int u;
    private static int av;
    private final String var_java_lang_String_bg;
    private static int bn;
    private static long bk;
    private static int cf;

    @Generated
    public String W() {
        return this.var_java_lang_String_bj;
    }

    private String a(String string, ClassLoader classLoader) {
        return null;
    }

    @Generated
    public NLoginCore_422(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.var_java_lang_String_bc = string;
        this.var_java_lang_String_bd = string2;
        this.var_java_lang_String_be = string3;
        this.var_java_lang_String_bf = string4;
        this.var_java_lang_String_bg = string5;
        this.var_java_lang_String_bh = string6;
        this.var_java_lang_String_bi = string7;
    }

    @Generated
    public boolean ai() {
        return this.Y;
    }

    private String a(ClassLoader classLoader, String ... stringArray) {
        return null;
    }

    private static void b() {
        int n;
        var_long_c = 5858321907447926554L;
        long l = var_long_c ^ 0xA3935B8BB694AB10L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(39 + 30), (byte)(70 + 13), (byte)(20 + 27), (byte)(25 + 42), (byte)(12 + 54), (byte)(2 + 65), (byte)(24 + 23), (byte)(27 + 53), (byte)(63 + 12), (byte)(5 + 62), (byte)(67 + 16), (byte)(23 + 30), 80, 97, (byte)(16 + 84), (byte)(21 + 79), (byte)(6 + 99), (byte)(52 + 58), (byte)(18 + 85)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
                    NLoginCore_422.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ՒԵՒ՟ՂԴՉիՂլԪԴ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ҶѷґҒғҶҷҹҵҠӂһҒҿҖҿҜҟ҇ӌҮҬҼҌұҡӁӄӆӄҜҳҴӋӟӁӢӞӣңӢҡӚҴӝҤҢҬӌӀӬӋҾӱҸҹ", (byte)48, 68);
                    NLoginCore_422.var_java_lang_String_arr_b[2] = NLoginCore_559.D("ҋҾӀѼҞһҜҡҮҏҧҶӆӄӃһ҉ҚӆҍӀҏҧҏӇҬәӌӛҭҽҖҧӜӌӛҭӗӚҟӞҢӄӃӓҧҽӚӂӚӪӥӨӣӔӉӡұӹӐӱӲӮӪӜӶԀӕӷӲӻӒӸӜӺӍ", (byte)48, 68);
                    NLoginCore_422.var_java_lang_String_arr_b[3] = NLoginCore_427.B("ŏĥĔīŚļīĮĹŚĺĕŠĲĦĴŇňĴĢŔņĽĺūıŀůŲŢŁŘ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[4] = NLoginCore_201.C("Ҏҽ҉ҢҍѹҐҸҰҙҾҍ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[5] = NLoginCore_092.F("ԷՃԝԶԟԴԸիեԧԨԭԬգժթաՄՃԱթՕՊՅՓՔԾռ՚՝վձԿոՑնքնՠ֌շՄՍտւ֍՟եքխոէՕք֋իյվՑՒ֚ա֓օ֍֙՝ձ֗ըէ։֡ֆօֱրպվִ֤֪֣֝֠։֧֯֎ַռ֍ֹ֯֫֟֍֚֠׈ָֺּ֪֨׉֍׊׈ׂ׉׌֥֮׌֘׏ׅ֖֨׉ךְ֭֩֗גֱַ֢֞׈תץ֩֬םתסױכ׳ּ׍֯׆ש׉הקא׻׈׺ֱ׸ַײײ׌", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[6] = NLoginCore_387.B("ŅĨŅŒĵħļŞĵşĝħ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[7] = NLoginCore_384.F("ՂԾԤ՛դԣ՘ՕՃժգձՇՒՆՓՑՂյՆգչնԳ՜հջՎվԸՃԼ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[8] = NLoginCore_201.A("ŖőńŗĹŚĲŗōŕĺļŕĶńŚħœļĪŅĪĬŬĪŁŢśľįūŧřŁĺŮŵŧżŎŀŹŰŇ", (byte)48, 65);
                    NLoginCore_422.var_java_lang_String_arr_b[9] = NLoginCore_004.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԲխ՜ըըռՏԸնմղսֆւշչյֆյրքկՔ", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[10] = NLoginCore_076.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԳ՗կվՊձՔՓՒԹՌդՕՆՒօֆգ՗զՍ՟Ք", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[11] = NLoginCore_004.E("զՀաՃՁԳԾՍԿԥ՝ԾՏբԫԼյեԯՌՙէՌ՝ՉՍՎՑնյԻՒ", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[12] = NLoginCore_076.C("ҿҙҺҜҚҌҗҦҘѾҸҠӆҁ҂ҼҧқҼҎӀӑӌҋҨӄӋӇҰғҔҚ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[13] = NLoginCore_004.F("եԤԝՔԠՄՉՊԷԷԡ՞Ղթ՟ՄՍժէՔՌՓ՜ռղ՘րհռկ՚չ՛ՁվՄ՜ճՖՈժվ՘լթղռՑՎ֒֐֎՘ղ՟ՠ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[14] = NLoginCore_453.F("Ի՚ԶԞՃժ՞ԸԿԦԻԴ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[15] = NLoginCore_092.B("ŇŕĦņņśĲňŜīŔħ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[16] = NLoginCore_223.B("ĮĤİĕŇŘňįœĪĺŚĴěķĞĿŕşĹŭśĲĳ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[17] = NLoginCore_027.C("ғҠѼҴӃқҏҭҦҷҘҍ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[18] = NLoginCore_027.A("ŎĲŚĚĳŐŝŊŏŀęħ", (byte)48, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_422.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŔŋĶĮĘĝŝėľŏŌħ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ҶѷґҒғҶҷҹҵҠӂһҒҿҖҿҜҟ҇ӌҮҬҼҌұҡӁӄӆӄҜҳҴӋӟӁӢӞӣңӢҡӜөӉӘҦӖӀөӟӮӦҮӧҴҾҿҮӣҺҭӓӶ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[2] = NLoginCore_004.F("ԲեէԣՅբՃՈՕԶՎ՝խիժբ԰ՁխԴէԶՎԶծՓրճւՔդԽՎփճւՔվցՆօՉիժպՎդցթց֑֌֏֊ջհֈ՘֠շ֑֘֙֕ց֘՝֣֖֟֬ֆ֦֭֠մ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[3] = NLoginCore_427.B("ŏĥĔīŚļīĮĹŚĺĕŠĲĦĴŇňĴĢŔŖĻĿħŦŋĬŇņŞŒ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[4] = NLoginCore_223.E("ՠՔԱ՛ՅԻՓԸԵՀԿԴ", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[5] = NLoginCore_559.C("ҐҜѶҏѸҍґӄҾҀҁ҆҅ҼӃӂҺҝҜҊӂҮңҞҬҭҗӕҳҶӗӊҘӑҪӏӝӏҹӥӐҝҦӘӛӦҸҾӝӆӑӀҮӝӤӄӎӗҪҫӳҺӬӞӦӲҶӊӰӁӀӢӺӟӞԊәӓӗӶӽӹԍԃӼӢԈԀӧԐӕӦԈԒԄӸӦӳӹԡԃԕԓԁԑԢӦԣԡԛԢԥӾԇԥӱԨԞԁӯԢԳԂӰԉԆԫԊӻԐӷԡՃԾԂԅԶՃԺՊԴՌԕԦԈԟՂԢԭԽԓԨԵԎԘԣՃՆԥՇ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[6] = NLoginCore_091.E("԰ԹԺՑՅԠԢԹիԹԮԴ", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[7] = NLoginCore_004.E("ՂԾԤ՛դԣ՘ՕՃժգձՇՒՆՓՑՂյՆգԲԷդպթ՗ՠՍ՝խՁո՞ՑևՂտոՉևՀ։Ք", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[8] = NLoginCore_324.E("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԷԹչԷՎկըՋԼոմՄքՇՁՖքզ։Մտ։Ք", (byte)48, 69);
                    NLoginCore_422.var_java_lang_String_arr_b[9] = NLoginCore_004.F("գ՞ՑդՆէԿդ՚բՇՉբՃՑէԴՠՉԷՒԲխ՜ըըռՏԸնմղՙԼՙՀՓՔՖ՞թա՚՘ՎլՓ֑Ս֏֑֐֎բ՟ՠ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[10] = NLoginCore_324.B("ŖőńŗĹŚĲŗōŕĺļŕĶńŚħœļĪŅĦŊŢűĽŤŇņŅĬĿŭũűŉŴĺİųŲŹŢƂƃŹşřŁŚŃžŦƋŒœ", (byte)48, 66);
                    NLoginCore_422.var_java_lang_String_arr_b[11] = NLoginCore_027.D("ҿҙҺҜҚҌҗҦҘѾҶҗҨһ҄ҕӎҾ҈ҥҲҾҰӖӖӊҎҙӘӉӝҰҽґӌӛҬҞӟӤӐӒӖҭ", (byte)48, 68);
                    NLoginCore_422.var_java_lang_String_arr_b[12] = NLoginCore_575.F("զՀաՃՁԳԾՍԿԥ՟ՇխԨԩգՎՂգԵէԴՆՒ՛԰՝ՉիՊիՁՖՑփշՕՙրգբ֍֍Ք", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[13] = NLoginCore_427.C("ҾѽѶҭѹҝҢңҐҐѺҷқӂҸҝҦӃӀҭҥҬҵӕӋұәӉӕӈҳӒҴҚӗҝҵӌүҡӃӗҳӚӝӃҷӟҷҮӘӚҨӭӄӬӂүӖӎӺӍҳӎ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[14] = NLoginCore_446.A("ĵĹĢęĔļĦŇőşġħ", (byte)48, 65);
                    NLoginCore_422.var_java_lang_String_arr_b[15] = NLoginCore_027.F("ՏԸԼբբԶԦԿԪՌԺգՅՆ՜Ց԰ՆԶիՉոԿՀ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[16] = NLoginCore_384.C("ҔҊҖѻҭҾҮҕҹҐҡ҉ӃҾҞҡҫӌӆґҿӑҘҙ", (byte)48, 67);
                    NLoginCore_422.var_java_lang_String_arr_b[17] = NLoginCore_324.F("ԲՃՙեԵԡՖԤՠԿՙԴ", (byte)48, 70);
                    NLoginCore_422.var_java_lang_String_arr_b[18] = NLoginCore_559.E("԰ՒՖՀէՙԩԼԟ՝ՙԴ", (byte)48, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_422.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ҚѾѿҠҊҽӂҞҽҼҧ҃Ҕ҄ӍҠӎӈҐҏӎҫҘҙ", (byte)48, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_422.var_java_lang_String_arr_b[0] = NLoginCore_091.A("įĨĒŎĕŎĸĲĵŠķĚĿĵĥġĳŞŊũňŜşŏŇŭŊĲŇŖŴų", (byte)48, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x63L;
        l ^= 0xA3935B8BB694AB10L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(61 + 8), (byte)(52 + 31), (byte)(33 + 14), (byte)(60 + 7), (byte)(56 + 10), (byte)(40 + 27), (byte)(10 + 37), (byte)(16 + 64), 75, (byte)(16 + 51), (byte)(9 + 74), (byte)(21 + 32), (byte)(59 + 21), (byte)(94 + 3), (byte)(51 + 49), (byte)(87 + 13), (byte)(2 + 103), (byte)(50 + 60), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(77 + 6)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("üĉĈËċćĂċĖąÒĐĔčĐĖØѤќђѣѦѧѵѶѧѹњѨ", (byte)13, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_422.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void a(String string, MemClassLoader memClassLoader) {
        String string2 = this.a(string, memClassLoader.getParentLoader());
        if (string2 != null) {
            NLoginCore_370.d((String)NLoginCore_422.c("㺀", (int)var_int_a, (long)var_long_b), new Object[var_int_c]);
            NLoginCore_370.d((String)NLoginCore_422.c("㺃", (int)(d & e), (long)f), new Object[g]);
            NLoginCore_370.d((String)NLoginCore_422.c("㺆", (int)h, (long)(i ^ j)) + string + (String)NLoginCore_422.c("㺉", (int)k, (long)(l ^ m)) + string2 + (String)NLoginCore_422.c("㺌", (int)n, (long)o), new Object[p]);
            NLoginCore_370.d((String)NLoginCore_422.c("㺏", (int)q, (long)(r ^ s)), new Object[t]);
            NLoginCore_370.d((String)NLoginCore_422.c("㺒", (int)(u & v), (long)w), new Object[x]);
            try {
                Thread.sleep(y);
            }
            catch (InterruptedException interruptedException) {
                throw new RuntimeException(interruptedException);
            }
            this.Y = z;
            this.var_java_lang_String_bj = string2;
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-6993726771559452022L);
        var_int_c = (0 >>> 17 | 0 << ~17 + 1) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = Integer.reverse(-1);
        f = Long.reverse(-6993726771559452022L);
        g = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        h = 4096 >>> 75 | 4096 << -75;
        i = Long.reverse(6408985719495144074L);
        j = Long.reverse(-4179340454199820288L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(6408985719495144074L);
        m = Long.reverse(-4179340454199820288L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(-6993726771559452022L);
        p = 0 >>> 88 | 0 << ~88 + 1;
        q = Integer.reverse(-1610612736);
        r = Long.reverse(6408985719495144074L);
        s = Long.reverse(-4179340454199820288L);
        t = Integer.reverse(0);
        u = 0x180000 >>> 18 | 0x180000 << -18;
        v = -1 >>> 148 | -1 << -148;
        w = Long.reverse(-6993726771559452022L);
        x = Integer.reverse(0);
        y = Long.reverse(2562548187973812224L);
        z = 0x20000000 >>> 157 | 0x20000000 << ~157 + 1;
        aa = (384 >>> 69 | 384 << ~69 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(0);
        ac = 0x700000 >>> 180 | 0x700000 << -180;
        ad = Long.reverse(6408985719495144074L);
        ae = Long.reverse(-4179340454199820288L);
        af = (16384 >>> 110 | 16384 << -110) & 0xFFFFFFFF;
        ag = (262144 >>> 209 | 262144 << -209) & 0xFFFFFFFF;
        ah = Integer.reverse(0x10000000);
        ai = -1 >>> 236 | -1 << ~236 + 1;
        aj = Long.reverse(-6993726771559452022L);
        ak = (12 >>> 98 | 12 << ~98 + 1) & 0xFFFFFFFF;
        al = 8192 >>> 75 | 8192 << ~75 + 1;
        am = 147456 >>> 206 | 147456 << -206;
        an = Long.reverse(-6993726771559452022L);
        ao = Integer.reverse(-1610612736);
        ap = Integer.reverse(0x60000000);
        aq = Integer.reverse(0x50000000);
        ar = Long.reverse(6408985719495144074L);
        as = Long.reverse(-4179340454199820288L);
        at = (-536870912 >>> 93 | -536870912 << -93) & 0xFFFFFFFF;
        au = Integer.reverse(0x10000000);
        av = 0x580000 >>> 83 | 0x580000 << -83;
        aw = Long.reverse(6408985719495144074L);
        ax = Long.reverse(-4179340454199820288L);
        ay = Integer.reverse(Integer.MIN_VALUE);
        az = Integer.reverse(0);
        ba = 36 >>> 194 | 36 << -194;
        bb = (20 >>> 33 | 20 << ~33 + 1) & 0xFFFFFFFF;
        var_int_bc = Integer.reverse(0x30000000);
        var_long_bd = Long.reverse(6408985719495144074L);
        var_long_be = Long.reverse(-4179340454199820288L);
        var_int_bf = Integer.reverse(Integer.MIN_VALUE);
        var_int_bg = 0 >>> 187 | 0 << -187;
        var_int_bh = Integer.reverse(-805306368);
        var_int_bi = 64 >>> 69 | 64 << -69;
        var_int_bj = Integer.reverse(-1342177280);
        bk = Long.reverse(-6993726771559452022L);
        bl = (0 >>> 32 | 0 << -32) & 0xFFFFFFFF;
        bm = (0x1C0000 >>> 81 | 0x1C0000 << ~81 + 1) & 0xFFFFFFFF;
        bn = (-1 >>> 40 | -1 << ~40 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(-6993726771559452022L);
        bp = Integer.reverse(0x74000000);
        bq = Integer.reverse(-201326592);
        br = Integer.reverse(-268435456);
        bs = Integer.reverse(-1);
        bt = Long.reverse(-6993726771559452022L);
        bu = (16 >>> 228 | 16 << -228) & 0xFFFFFFFF;
        bv = (1 >>> 124 | 1 << -124) & 0xFFFFFFFF;
        bw = Long.reverse(-6993726771559452022L);
        bx = Integer.reverse(-2013265920);
        by = Long.reverse(6408985719495144074L);
        bz = Long.reverse(-4179340454199820288L);
        ca = 0 >>> 7 | 0 << ~7 + 1;
        cb = Integer.reverse(0x48000000);
        cc = Long.reverse(-6993726771559452022L);
        cd = Integer.reverse(0x40000000);
        ce = 0 >>> 250 | 0 << ~250 + 1;
        cf = (0 >>> 30 | 0 << ~30 + 1) & 0xFFFFFFFF;
        cg = Integer.reverse(0);
        ch = (608 >>> 101 | 608 << -101) & 0xFFFFFFFF;
        ci = Integer.reverse(-939524096);
        var_java_lang_String_arr_a = new String[ch];
        var_java_lang_String_arr_b = new String[ci];
        NLoginCore_422.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_422.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_422.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.D("պևֆՉ։օր։֔փՐ֎֒֋֎֔Ֆ࣢࣐ࣦࣚ࣡ࣤࣥࣳࣴࣥࣷࣘծ", (byte)118, 68) + string + NLoginCore_384.E("լ", (byte)118, 69) + methodType.toString(), exception);
        }
    }
}

