/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
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

public class BukkitHelper_001 {
    private static int k;
    private static long var_long_g;
    private static int var_int_a;
    private static long var_long_d;
    private static int h;
    private static String[] var_java_lang_String_arr_a;
    public static final String var_java_lang_String_a;
    private static long var_long_c;
    private static long v;
    private static long j;
    private static long r;
    private static long s;
    private static long i;
    private static int var_int_c;
    private static int var_int_e;
    private static int q;
    public static final String var_java_lang_String_c;
    public static final String var_java_lang_String_f;
    public static final String var_java_lang_String_g;
    private static long o;
    private static long l;
    private static int u;
    public static final String var_java_lang_String_b;
    private static int n;
    private static int t;
    private static int var_int_b;
    private static long m;
    private static String[] var_java_lang_String_arr_b;
    private static long p;
    private static long var_long_f;
    public static final String var_java_lang_String_e;
    public static final String var_java_lang_String_d;

    private static void b() {
        int n;
        var_long_c = 3350586224643362906L;
        long l = var_long_c ^ 0xA7AF3599AB3E46B6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(26 + 43), (byte)(23 + 60), (byte)(35 + 12), (byte)(13 + 54), (byte)(47 + 19), (byte)(41 + 26), 47, 80, (byte)(28 + 47), (byte)(13 + 54), (byte)(63 + 20), (byte)(45 + 8), (byte)(6 + 74), (byte)(44 + 53), (byte)(32 + 68), (byte)(4 + 96), (byte)(21 + 84), (byte)(54 + 56), (byte)(94 + 9)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
                    BukkitHelper_001.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ҙ҈ѩѬҤүҨѮҍҹѵҭ҇҇ҼѼҺҵѿҟҲҀҍҼқҠҢѼӈҥӊҟӊүҰӏӍҒӆӊҶҫҭӄҔһҹҶҾҴқӌӖӜҭӥҰҞӝҹӖҫҽҿөӎӄӋӏҪӀӱӠӑӪҰӦӷӖӍӰӏӖһӀӣӏӾӧҾӚӛӻӫӞӜ", (byte)43, 68);
                    BukkitHelper_001.var_java_lang_String_arr_b[1] = NLoginCore_138.E("՚ԪԟԲՔԤ՝ԻԳՖՕԪԻՊ՟ը՚ՈբՃկ՞մգՉոՅիԹժզսալցճՍԻհԿՔՈւՆնթՊՇդգ՛֔րգ֒֓չշձչք֞ղծհ֖֑՞չ֚՞զ֒վթ֊֭֚֮֜֎֍ղժְ֖֝ձ֋֦֍ֆַּ֭֮", (byte)43, 69);
                    BukkitHelper_001.var_java_lang_String_arr_b[2] = NLoginCore_453.E("ԩԽԶԹԟԮՀՆԵՔԜԹԩԭԾ՞ծժհՎճՅԵձԵՉՎԴՈսզԱ", (byte)43, 69);
                    BukkitHelper_001.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ŅķĭĨŎġŐĤńłŃŖŋčıŇśŌĪœŚęġİŞłģŢĦœĽŪŀŬĮŐĩŁĭŠŷŋœŲİŧŮőŚűŪŐƃųűŮţĿŰĻśňŭƄƄŇŉƎƐŤƍƅŰƄŦőƉřŵŮƎůƎŪŠŬŝŞƒſųŤŧƩŻŶ", (byte)43, 66);
                    BukkitHelper_001.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ҁҢѫҁҳҫѧѮѶҥҢҘһҜҳҙҗҮҵҍѿѽѼ҆ѽҧҩ҉ҟӌҼҪҾӄӉҳқҳӁӌӇҖҭәҬӕҶӈҳҗӎҰӚӣҭҳӀӘӝӤҽҾӀӢәӘӱҿӇӃҫӰӴӧӕӷӒӔҳӏӜӹӏӷӚӜӛԃԅӛӂԂԆӄәӈ", (byte)43, 67);
                    BukkitHelper_001.var_java_lang_String_arr_b[5] = NLoginCore_223.C("ҡ҈ҫѽҬҠ҃ҤѭҘҍѳ҄ҔѴҌҩҿ҉ҭӂҎҢҾҡҕӇҖ҃ҝҋӆҎҥӇҋӔҝҐҧҗӊҮӓҕҘҺӑӐӏҴҮҺҬҹӘӛӉӇҡҪӄңҽӠҢӍӤӓҪӟӠӑӫӃӪӣӔҴӿӠӓӼӱәӤӄӗӞӴӂԄӜӣӮԁ", (byte)43, 67);
                    BukkitHelper_001.var_java_lang_String_arr_b[6] = NLoginCore_384.B("ġĜľČŅđŃģőŅĪĨœŗĜřŌěŐśřġĸįĦńńłũŤŢŋŬŜŅśļĽŐıŁŋŸŦŰŬśŬľŏœĸŮŭƂŸĸłŦŞŷŗŻťŹŚŬŢťŦƒƍŰƕũűŘŗƋŽŦŞŽƉşƂżƖƦŧŰżƜťźƤ", (byte)43, 66);
                    continue block7;
                }
                case 1: {
                    BukkitHelper_001.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ҙ҈ѩѬҤүҨѮҍҹѵҭ҇҇ҼѼҺҵѿҟҲҀҍҼқҠҢѼӈҥӊҟӊүҰӏӍҒӆӊҶҫҭӄҔһҹҶҾҴқӌӖӜҭӥҰҞӝҹӖҫҽҿөӎӄӋӏҪӀӱӠӑӪҰӦӷӖӍӰӏӖһӀӜԅӯӑӢӜӳԋӗӶԇ", (byte)43, 68);
                    BukkitHelper_001.var_java_lang_String_arr_b[1] = NLoginCore_076.A("ňĘčĠłĒŋĩġńŃĘĩĸōŖňĶŐıŝŌŢőķŦĳřħŘŔūŏŚůšĻĩŞĭłĶŰĴŤŗĸĵŒőŉƂŮőƀƁŧťşŧŲƌŠŜŞƄſŌŧƈŌŔƀŬŗŸƊƜƛƈżŻŠŘƋƒśŝƛƄſƥƆƧƊƣ", (byte)43, 65);
                    BukkitHelper_001.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ėīĤħčĜĮĴģłĊħėěĬŌŜŘŞļšĶŘŀıŚşģŁņšĻ", (byte)43, 66);
                    BukkitHelper_001.var_java_lang_String_arr_b[3] = NLoginCore_324.F("՗ՉԿԺՠԳբԶՖՔՕը՝ԟՃՙխ՞ԼելԫԳՂհՔԵմԸեՏռՒվՀբԻՓԿղ։՝եքՂչրգլփռբ֕օփրյՑւՍխ՚տ֖֖ՙ՛֢֠ն֟֗ւ֖ոգ֛իևր֠ց֠ռղֈֲֶֹղִֵ֎֒չ֙", (byte)43, 70);
                    BukkitHelper_001.var_java_lang_String_arr_b[4] = NLoginCore_173.C("ҁҢѫҁҳҫѧѮѶҥҢҘһҜҳҙҗҮҵҍѿѽѼ҆ѽҧҩ҉ҟӌҼҪҾӄӉҳқҳӁӌӇҖҭәҬӕҶӈҳҗӎҰӚӣҭҳӀӘӝӤҽҾӀӢәӘӱҿӇӃҫӰӴӧӕӷӒӔҳӏӜӹӏӷӚӯӷӂӅӿԇԂӸӝӝԄ", (byte)43, 67);
                    BukkitHelper_001.var_java_lang_String_arr_b[5] = NLoginCore_201.D("ҡ҈ҫѽҬҠ҃ҤѭҘҍѳ҄ҔѴҌҩҿ҉ҭӂҎҢҾҡҕӇҖ҃ҝҋӆҎҥӇҋӔҝҐҧҗӊҮӓҕҘҺӑӐӏҴҮҺҬҹӘӛӉӇҡҪӄңҽӠҢӍӤӓҪӟӠӑӫӃӪӣӔҴӿӠӓӼӱәӟӴӢԀӰӉӥӶӨӇӷ", (byte)43, 68);
                    BukkitHelper_001.var_java_lang_String_arr_b[6] = NLoginCore_384.F("ԳԮՐԞ՗ԣՕԵգ՗ԼԺեթԮի՞ԭբխիԳՊՁԸՖՖՔջնմ՝վծ՗խՎՏբՃՓ՝֊ուվխվՐաեՊրտ֔֊ՊՔոհ։թ֍շ֋լվմշո֤֟ւ֧ջփժթ֝֏ոհ֏֛ձ֡֐ծ֕փչք֊֎֏֧", (byte)43, 70);
                    continue block7;
                }
                case 2: {
                    BukkitHelper_001.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԠՙԵԹԟՒԤԦԟԟՁեիՁէԼԻԩՑՄՕՒՅՎՄՓչՌճծզԹ", (byte)43, 70);
                    continue block7;
                }
                case 4: {
                    BukkitHelper_001.var_java_lang_String_arr_b[0] = NLoginCore_324.C("Ҩ҅үҀҭҮҩҍҩҹ҉Ѿ", (byte)43, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(BukkitHelper_001.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("԰ՒՔԴ՘շկօձՀվմւռՅժ֌֋փ։փ՘", (byte)76, 69), BukkitHelper_001.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘࡊࡤࡢࡣ࡭ࡗࡪࡹࡒࡇࡴӯ", (byte)76, 67) + string + NLoginCore_559.A("ő", (byte)76, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(-536870912);
        var_int_b = Integer.reverse(-536870912);
        var_int_c = 0 >>> 150 | 0 << ~150 + 1;
        var_long_d = Long.reverse(-717492141676953996L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        var_long_f = Long.reverse(6488267262115839604L);
        var_long_g = Long.reverse(-6052837899185946624L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(6488267262115839604L);
        j = Long.reverse(-6052837899185946624L);
        k = (96 >>> 229 | 96 << ~229 + 1) & 0xFFFFFFFF;
        l = Long.reverse(6488267262115839604L);
        m = Long.reverse(-6052837899185946624L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(6488267262115839604L);
        p = Long.reverse(-6052837899185946624L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(6488267262115839604L);
        s = Long.reverse(-6052837899185946624L);
        t = (0x300000 >>> 211 | 0x300000 << ~211 + 1) & 0xFFFFFFFF;
        u = (-1 >>> 253 | -1 << ~253 + 1) & 0xFFFFFFFF;
        v = Long.reverse(-717492141676953996L);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        BukkitHelper_001.b();
        var_java_lang_String_f = BukkitHelper_001.c("㺀", (int)var_int_c, (long)var_long_d);
        var_java_lang_String_e = BukkitHelper_001.c("㺃", (int)var_int_e, (long)(var_long_f ^ var_long_g));
        var_java_lang_String_a = BukkitHelper_001.c("㺆", (int)h, (long)(i ^ j));
        var_java_lang_String_c = BukkitHelper_001.c("㺉", (int)k, (long)(l ^ m));
        var_java_lang_String_b = BukkitHelper_001.c("㺌", (int)n, (long)(o ^ p));
        var_java_lang_String_g = BukkitHelper_001.c("㺏", (int)q, (long)(r ^ s));
        var_java_lang_String_d = BukkitHelper_001.c("㺒", (int)(t & u), (long)v);
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0xA7AF3599AB3E46B6L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(60 + 9), (byte)(37 + 46), (byte)(5 + 42), (byte)(29 + 38), (byte)(18 + 48), (byte)(40 + 27), (byte)(37 + 10), (byte)(61 + 19), 75, (byte)(28 + 39), (byte)(45 + 38), (byte)(8 + 45), (byte)(2 + 78), (byte)(2 + 95), (byte)(53 + 47), (byte)(90 + 10), (byte)(72 + 33), 110, (byte)(10 + 93)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.A("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴӦԀӾӿԉӳԆԕӮӣԐ", (byte)91, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            BukkitHelper_001.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

