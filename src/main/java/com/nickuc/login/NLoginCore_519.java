/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_189;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_350;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_519 {
    private static int s;
    private static int bo;
    private static long f;
    private static long q;
    private static int v;
    private static long k;
    private static int i;
    private static long an;
    private static long w;
    private static float at;
    private static long aw;
    private static int ai;
    private static int ac;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int bk;
    private static long n;
    private static String[] var_java_lang_String_arr_a;
    private static int ae;
    private static int bp;
    private static long ak;
    private static int bc;
    private static long aj;
    private static long bh;
    private static int h;
    private static long av;
    private static int bl;
    private static int var_int_b;
    private static long g;
    private static int ax;
    private static int bm;
    private static long t;
    private static long j;
    private static int ar;
    private static long z;
    private static long x;
    private static int ba;
    private static int ao;
    private static long ay;
    private static long ap;
    private static long d;
    private static int bf;
    private static int bb;
    private static long az;
    private static int l;
    private static long m;
    private static int bn;
    private static long bj;
    private static int var_int_a;
    private static int var_int_c;
    private static int br;
    private static int au;
    private static int p;
    private static int y;
    private static long aa;
    private static int ab;
    private static long ah;
    private static int af;
    private static long aq;
    private static int bq;
    private static long u;
    private static int bi;
    private static int o;
    private static long ag;
    private static int al;
    private static long am;
    private static int e;
    private static long r;
    private static float as;
    private static int ad;
    private static int bd;
    private static final AtomicBoolean var_java_util_concurrent_atomic_AtomicBoolean_c;
    private static long be;
    private static int bg;

    private static void b() {
        int n;
        var_long_c = 2034150577809197964L;
        long l = var_long_c ^ 0x910F03B9F588FDC7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(43 + 26), (byte)(54 + 29), (byte)(36 + 11), (byte)(64 + 3), (byte)(46 + 20), 67, (byte)(29 + 18), (byte)(39 + 41), (byte)(10 + 65), (byte)(44 + 23), (byte)(32 + 51), (byte)(20 + 33), (byte)(11 + 69), (byte)(82 + 15), 100, (byte)(25 + 75), (byte)(88 + 17), (byte)(40 + 70), (byte)(92 + 11)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(7 + 76)}, StandardCharsets.UTF_8));
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
                    NLoginCore_519.var_java_lang_String_arr_b[0] = NLoginCore_092.E("ՁԶգՁ՟ՀԷխՎԭծ՟ՁԿ՜դՈշԮԶՁջՃՌՅԼՖծչՁ՞ջօբԾաճաևՠզզցՆՍՏ֔ղՔմ֎ՠֈ֖֚֋֑ջվ֔֓ճց֎֝ք՞՚֝ՠցտ֢֘ը֢֡֬խ֮և֧֟֨ձ֐ջ֤֧֓֌֚֏ֹ֗փ׀׃ַּ֙։ַ֖֦ր֛֔", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[1] = NLoginCore_110.B("ŔĭİĺļĪĩħœĴĺŏńğŧġŚħĜŚķŀŎŉŧŜũīįņİŮŮŇŚůĹŏŴŉŐŝűřłſŽŶņřſŽŷŧŨƍũƌƑůƌƎƄŉƗƊŧűƏŽŖƜŪƐŲźơƎƞŲƇŤƤƘƙŧƘžƜƲƋƈƏƩƤơƀƌƈƈƝƘŹƩƶŽƢƇ", (byte)48, 66);
                    NLoginCore_519.var_java_lang_String_arr_b[2] = NLoginCore_138.A("ĎŕĮŚřŕėğŎŊśĢĴšıĽĦĸœřūňŇŪőŤľŢŊłĿņŴŭĲŅļŴŮıĶŸŮŘŵŶŶŶłƊŷťƈťŒœ", (byte)48, 65);
                    NLoginCore_519.var_java_lang_String_arr_b[3] = NLoginCore_451.C("ҔҶѲҰѻһҵҼҏҾӈӇӇӈҭҦҮҏҞӑҪҎӁҿҐҢҥӗӗӜӇҶӒӌҝӝӂҢӎҼӂӛӂҾӈӠҿһӇӬӉӁҫһҸҹ", (byte)48, 67);
                    NLoginCore_519.var_java_lang_String_arr_b[4] = NLoginCore_559.C("ѺҾҙҟҮҤѽҿѾѽѿҍ", (byte)48, 67);
                    NLoginCore_519.var_java_lang_String_arr_b[5] = NLoginCore_223.F("ԻԴդԠ՗ՔժԿխԺՁԢԪՈԭէթմնչժՖկեյՖ՗ՋՍԾ՘ց", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[6] = NLoginCore_138.D("ҰѵҒѳҁҟҡҾҖҀӂҍ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[7] = NLoginCore_324.F("ԥԵԢԼԣիԫժԼխ՚Ս՜ՉԳ՝ԭՄՈՕՎըԿՀ", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ѺҽҴҪӁ҂ҺқӃқҘҍ", (byte)48, 67);
                    NLoginCore_519.var_java_lang_String_arr_b[9] = NLoginCore_091.E("բԱԦԢՕՇՋաԩ՛՝Դ", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[10] = NLoginCore_110.F("ԽԟԲզԼՕԨԢ՟ԿԿԴ", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[11] = NLoginCore_451.E("ԯԴՄթՑժժԦԾԠթԴ", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[12] = NLoginCore_384.E("ՑՁ՚ԸԧդՔԦԵ՗Շ՚ՠԤզԬԱզեԷմԲԹ՜ՔպՒ՟ծպշՔդՅմմթմքգփիփխ֊օհ՟ՍՈւՖաբ՟ՠ", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[13] = NLoginCore_384.F("ՑՁ՚ԸԧդՔԦԵ՗Պ՚ՁԪՂՍՄԱՔեՈմՕԷԹթՓհ՛աՑմ՛ՠըեՙի։վտեըբփ՟բժ֑֔ւ֐քֈ՟ՠ", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[14] = NLoginCore_173.C("һүӀҴҎұҾңҰҧҥӂҳҫҡӅҝҾҎҟҮҾӅӑҍҭӑҔҧӑҪҖҺҘӍүҞҺҚӘӣӃҳӥӪӕӌӢӞҥӐҬӇӱҸҹ", (byte)48, 67);
                    NLoginCore_519.var_java_lang_String_arr_b[15] = NLoginCore_138.A("ŁĪŉĴĻĻŚļĩœŁğĿŚŇĵıņĠŚňŗĥņŤŠŇŧłũŃķņŵŻŔŧņŖŌŔūŰŬŶſŹƄƀŸſƂŪŻŒœ", (byte)48, 65);
                    NLoginCore_519.var_java_lang_String_arr_b[16] = NLoginCore_027.D("ҧҐүҚҡҡӀҢҏҹҤ҅ҜҁҿҘҿӁҋҽӈӊҴҲҟӒӘҷҲӛҰӘҽӠҗҪұүҺӂҜҧӛӀҹӌӠҬӘһӑӄӌӱҸҹ", (byte)48, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_519.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ՁԶգՁ՟ՀԷխՎԭծ՟ՁԿ՜դՈշԮԶՁջՃՌՅԼՖծչՁ՞ջօբԾաճաևՠզզցՆՍՏ֔ղՔմ֎ՠֈ֖֚֋֑ջվ֔֓ճց֎֝ք՞՚֝ՠցտ֢֘ը֢֡֬խ֮և֧֟֨ձ֐ջ֤֧֓֌֚֏ֹ֗փ֖֚֯׈֣׊ֻւ֌׎֗֔", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ҺғҖҠҢҐҏҍҹҚҠҵҪ҅Ӎ҇Ӏҍ҂ӀҝҦҴүӍӂӏґҕҬҖӔӔҭӀӕҟҵӚүҶӃӗҿҨӥӣӜҬҿӥӣӝӍӎӳӏӲӷӕӲӴӪүӽӰӍӗӵӣҼԂӐӶӘӠԇӴԄӘӭӊԊӾӿӍӾӤԂԘӱӮӵԏԊԇӮӯԓԒӝӣӠӭԦӼԢӭ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[2] = NLoginCore_384.A("ĎŕĮŚřŕėğŎŊśĢĴšıĽĦĸœřūňŇŪőŤľŢŊłĿņŴŭĲŅļŴŮıĶŸŮųŲńŕŰſŚŕƈŸƋŒœ", (byte)48, 65);
                    NLoginCore_519.var_java_lang_String_arr_b[3] = NLoginCore_076.D("ҔҶѲҰѻһҵҼҏҾӈӇӇӈҭҦҮҏҞӑҪҎӁҿҐҢҥӗӗӜӇҶӒӌҝӝӂҢӎҼӂӛӂӅҾӤҞӦӪһөӚҮӱҸҹ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[4] = NLoginCore_446.E("ՔԼ՟եԷԦՋԣծՃԫեԻՊ՞՟ՂզմնՖոԿՀ", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[5] = NLoginCore_453.D("ҔҍҽѹҰҭӃҘӆғҚѻ҃ҡ҆ӀӂӍӏӒӃһӈҤӂҵҩүңӓҪӔ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[6] = NLoginCore_091.B("ħģņĪŘĺĪęėşŞĵĹŒŤĽĹţĤœŞŅĲĳ", (byte)48, 66);
                    NLoginCore_519.var_java_lang_String_arr_b[7] = NLoginCore_138.B("ĘĨĕįĖŞĞŝįŠŎķţŔŕĵģŕŒŪōŅĲĳ", (byte)48, 66);
                    NLoginCore_519.var_java_lang_String_arr_b[8] = NLoginCore_223.A("ŌĮėĲŔĭĭĪĸŎŔħ", (byte)48, 65);
                    NLoginCore_519.var_java_lang_String_arr_b[9] = NLoginCore_027.D("ҹүӁҙҪѿһҿҐӄҘҍ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[10] = NLoginCore_076.B("ĕŎĺıĴŗŕŚĜĸŢĞĳľŦğģťŠŦĺŅĲĳ", (byte)48, 66);
                    NLoginCore_519.var_java_lang_String_arr_b[11] = NLoginCore_110.B("ĪģĐŋĬļĐĵěőŎłĺįŅŇŠřĳţŇśĲĳ", (byte)48, 66);
                    NLoginCore_519.var_java_lang_String_arr_b[12] = NLoginCore_387.D("ҪҚҳґҀҽҭѿҎҰҠҳҹѽҿ҅ҊҿҾҐӍҋҒҵҭӓҫҸӇӓӐҭҽҞӍӍӂӍӝҼӜӄӛҽӛәҧӂӨӧәҭҪӱҸҹ", (byte)48, 68);
                    NLoginCore_519.var_java_lang_String_arr_b[13] = NLoginCore_091.F("ՑՁ՚ԸԧդՔԦԵ՗Պ՚ՁԪՂՍՄԱՔեՈմՕԷԹթՓհ՛աՑմ՛ՠըեՙի։վտեթՏ֍ըՏգճև֓փ։֘՟ՠ", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[14] = NLoginCore_223.E("բՖէ՛Ե՘եՊ՗ՎՌթ՚ՒՈլՄեԵՆՕելոԴՔոԻՎոՑԽաԿմՖՅաՁտ֊ժՙչւջև֔տտտՊյբ՟ՠ", (byte)48, 69);
                    NLoginCore_519.var_java_lang_String_arr_b[15] = NLoginCore_384.F("ՎԷՖՁՈՈէՉԶՠՎԬՌէՔՂԾՓԭէՕդԲՓձխՔմՏնՐՄՓւֈամՓգՙաոսՉօՋէւՍըՠճժղ՟ՠ", (byte)48, 70);
                    NLoginCore_519.var_java_lang_String_arr_b[16] = NLoginCore_092.F("ՎԷՖՁՈՈէՉԶՠՋԬՃԨզԿզըԲդկձ՛ՙՆչտ՞ՙւ՗տդևԾՑ՘ՖաթՃՎփ՜ֈօ֒֓֋Ոտրիղ՟ՠ", (byte)48, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_519.var_java_lang_String_arr_b[0] = NLoginCore_138.F("ԺԡԷՈ՗՗ԵՙԺ՗գ԰զՃԿբՒգՑԵժՒԿՀ", (byte)48, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_519.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ՏէաՓԷԡԹգՎՆզՀ՜էճԫՉկՁՙՏԱՍճՕԵվՉչժդՔ", (byte)48, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_519.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.C("ѕѷѹљѽҜҔҪҖѥңҙҧҡѪҏұҰҨҮҨѽ", (byte)40, 67), NLoginCore_519.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬߞߥࠇߤߪࠄ߿߻ߩҁ", (byte)40, 67) + string + NLoginCore_091.B("ĉ", (byte)40, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 6L;
        l ^= 0x910F03B9F588FDC7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(11 + 58), (byte)(6 + 77), (byte)(42 + 5), (byte)(57 + 10), (byte)(9 + 57), (byte)(59 + 8), (byte)(2 + 45), (byte)(5 + 75), 75, (byte)(21 + 46), 83, (byte)(40 + 13), (byte)(33 + 47), (byte)(13 + 84), (byte)(69 + 31), (byte)(8 + 92), (byte)(29 + 76), (byte)(47 + 63), (byte)(29 + 74)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾࡰࡷ࢙ࡶࡼ࢖࢑ࢍࡻ", (byte)3, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_519.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = -1 >>> 133 | -1 << -133;
        d = Long.reverse(5895387328163306552L);
        e = 8 >>> 99 | 8 << -99;
        f = Long.reverse(3589544318949612600L);
        g = Long.reverse(0x6000000000000000L);
        h = Integer.reverse(0);
        i = 2048 >>> 202 | 2048 << -202;
        j = Long.reverse(3589544318949612600L);
        k = Long.reverse(0x6000000000000000L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(3589544318949612600L);
        n = Long.reverse(0x6000000000000000L);
        o = (0 >>> 167 | 0 << -167) & 0xFFFFFFFF;
        p = 4096 >>> 42 | 4096 << -42;
        q = Long.reverse(3589544318949612600L);
        r = Long.reverse(0x6000000000000000L);
        s = Integer.reverse(-1610612736);
        t = Long.reverse(3589544318949612600L);
        u = Long.reverse(0x6000000000000000L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(3589544318949612600L);
        x = Long.reverse(0x6000000000000000L);
        y = (-2147483645 >>> 159 | -2147483645 << -159) & 0xFFFFFFFF;
        z = Long.reverse(3589544318949612600L);
        aa = Long.reverse(0x6000000000000000L);
        ab = (49152 >>> 78 | 49152 << -78) & 0xFFFFFFFF;
        ac = Integer.reverse(0);
        ad = (65536 >>> 48 | 65536 << ~48 + 1) & 0xFFFFFFFF;
        ae = 262144 >>> 241 | 262144 << -241;
        af = (128 >>> 4 | 128 << ~4 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(3589544318949612600L);
        ah = Long.reverse(0x6000000000000000L);
        ai = (0x20000001 >>> 189 | 0x20000001 << ~189 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(3589544318949612600L);
        ak = Long.reverse(0x6000000000000000L);
        al = (0x280000 >>> 178 | 0x280000 << -178) & 0xFFFFFFFF;
        am = Long.reverse(3589544318949612600L);
        an = Long.reverse(0x6000000000000000L);
        ao = 352 >>> 5 | 352 << ~5 + 1;
        ap = Long.reverse(3589544318949612600L);
        aq = Long.reverse(0x6000000000000000L);
        ar = Integer.reverse(0);
        as = Float.intBitsToFloat(Integer.reverse(3714));
        at = Float.intBitsToFloat(0x10100000 >>> 222 | 0x10100000 << ~222 + 1);
        au = Integer.reverse(0x30000000);
        av = Long.reverse(3589544318949612600L);
        aw = Long.reverse(0x6000000000000000L);
        ax = 0x1A000000 >>> 121 | 0x1A000000 << ~121 + 1;
        ay = Long.reverse(3589544318949612600L);
        az = Long.reverse(0x6000000000000000L);
        ba = Integer.reverse(0);
        bb = 0 >>> 201 | 0 << ~201 + 1;
        bc = 458752 >>> 175 | 458752 << -175;
        bd = (-1 >>> 9 | -1 << ~9 + 1) & 0xFFFFFFFF;
        be = Long.reverse(5895387328163306552L);
        bf = (0 >>> 171 | 0 << ~171 + 1) & 0xFFFFFFFF;
        bg = Integer.reverse(-268435456);
        bh = Long.reverse(5895387328163306552L);
        bi = 4 >>> 158 | 4 << ~158 + 1;
        bj = Long.reverse(5895387328163306552L);
        bk = Integer.reverse(0);
        bl = Integer.reverse(0);
        bm = Integer.reverse(0);
        bn = 32 >>> 5 | 32 << -5;
        bo = (0 >>> 156 | 0 << -156) & 0xFFFFFFFF;
        bp = Integer.reverse(-2013265920);
        bq = 0x220000 >>> 209 | 0x220000 << -209;
        br = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[bp];
        var_java_lang_String_arr_b = new String[bq];
        NLoginCore_519.b();
        var_java_util_concurrent_atomic_AtomicBoolean_c = new AtomicBoolean(br != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File a(NLoginType_008 NLoginType_008, @Nullable NLoginCore_494 NLoginInterface_0422, boolean bl) {
        List<File> list;
        File file;
        File file3;
        block11: {
            if (var_java_util_concurrent_atomic_AtomicBoolean_c.getAndSet(var_int_a != 0)) {
                if (NLoginInterface_0422 != null) {
                    NLoginCore_150.a(NLoginInterface_0422, (String)(bl ? NLoginCore_519.c("㺀", (int)(var_int_b & var_int_c), (long)d) : NLoginCore_519.c("㺃", (int)e, (long)(f ^ g))), new Object[h]);
                }
                return null;
            }
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, (String)(bl ? NLoginCore_519.c("㺆", (int)i, (long)(j ^ k)) : NLoginCore_519.c("㺉", (int)l, (long)(m ^ n))), new Object[o]);
            }
            NLoginCore_189 NLoginCore_189 = new NLoginCore_189();
            file3 = new File(NLoginType_008.java_io_File_c(), (String)NLoginCore_519.c("㺌", (int)p, (long)(q ^ r)));
            if (!file3.exists() && !file3.mkdirs()) {
                throw new IOException((String)NLoginCore_519.c("㺏", (int)s, (long)(t ^ u)) + file3 + (String)NLoginCore_519.c("㺒", (int)v, (long)(w ^ x)));
            }
            Object[] objectArray = new Object[ab];
            objectArray[NLoginCore_519.ac] = NLoginCore_189.an();
            objectArray[NLoginCore_519.ad] = NLoginCore_189.am();
            objectArray[NLoginCore_519.ae] = NLoginCore_189.al();
            String string = String.format((String)NLoginCore_519.c("㺕", (int)y, (long)(z ^ aa)), objectArray) + (String)NLoginCore_519.c("㺘", (int)af, (long)(ag ^ ah)) + NLoginCore_189.ak() + (String)NLoginCore_519.c("㺛", (int)ai, (long)(aj ^ ak)) + NLoginCore_189.aj();
            file = NLoginCore_366.a(new File(file3, string + (String)NLoginCore_519.c("㺞", (int)al, (long)(am ^ an))), string + (String)NLoginCore_519.c("㺡", (int)ao, (long)(ap ^ aq)));
            list = Arrays.stream(Objects.requireNonNull(NLoginType_008.java_io_File_c().listFiles())).filter(file2 -> (!file2.equals(file3) ? bn : bo) != 0).collect(Collectors.toList());
            if (!list.isEmpty()) break block11;
            File file4 = null;
            var_java_util_concurrent_atomic_AtomicBoolean_c.set(ar != 0);
            return file4;
        }
        try {
            NLoginCore_350.a(list, file);
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, as, at);
                NLoginCore_150.a(NLoginInterface_0422, (String)(bl ? NLoginCore_519.c("㺤", (int)au, (long)(av ^ aw)) : NLoginCore_519.c("㺧", (int)ax, (long)(ay ^ az))), new Object[ba]);
            }
            File file5 = file;
            var_java_util_concurrent_atomic_AtomicBoolean_c.set(bb != 0);
            return file5;
        }
        catch (Exception exception) {
            try {
                NLoginCore_370.c((String)NLoginCore_519.c("㺪", (int)(bc & bd), (long)be), exception, new Object[bf]);
                if (NLoginInterface_0422 != null) {
                    NLoginCore_150.a(NLoginInterface_0422, (String)(bl ? NLoginCore_519.c("㺭", (int)bg, (long)bh) : NLoginCore_519.c("㺰", (int)bi, (long)bj)), new Object[bk]);
                }
                file3 = null;
                var_java_util_concurrent_atomic_AtomicBoolean_c.set(NLoginCore_519.bl != 0);
                return file3;
            }
            catch (Throwable throwable) {
                var_java_util_concurrent_atomic_AtomicBoolean_c.set(bm != 0);
                throw throwable;
            }
        }
    }
}

