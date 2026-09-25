/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.proxy.InboundConnection
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_298;
import com.velocitypowered.api.proxy.InboundConnection;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.kyori.adventure.text.Component;

public class NLoginCore_273 {
    private static long bb;
    private static long n;
    private static int ao;
    private static int al;
    private static final Method var_java_lang_reflect_Method_q;
    private static long an;
    private static long x;
    private static long c;
    private static long ak;
    private static long aj;
    private static final Class<?> var_java_lang_Class____r;
    private static int g;
    private static long am;
    private static int ax;
    private static int m;
    private static final Method var_java_lang_reflect_Method_r;
    private static int aq;
    private static long ae;
    private static long av;
    private static int ay;
    private static long aa;
    private static long var_long_b;
    private static int var_int_a;
    private static int bd;
    private static int ad;
    private static int au;
    private static int ah;
    private static int at;
    private static long az;
    private static long ag;
    private static int ba;
    private static int ac;
    private static long t;
    private static int be;
    private static int l;
    private static long bc;
    private static int y;
    private static final Method var_java_lang_reflect_Method_p;
    private static long as;
    private static long var_long_q;
    private static int ap;
    private static int j;
    private static long h;
    private static String[] var_java_lang_String_arr_a;
    private static int af;
    private static final Class<?> var_java_lang_Class____p;
    private static int v;
    private static final Class<?> var_java_lang_Class____q;
    private static long w;
    private static int ab;
    private static long ar;
    private static long z;
    private static long bg;
    private static int aw;
    private static int o;
    private static int var_int_r;
    private static int k;
    private static int s;
    private static long i;
    private static int e;
    private static long bh;
    private static int u;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static long d;
    private static long var_long_p;
    private static int bf;
    private static int ai;

    static void a(InboundConnection inboundConnection, Component component) {
        Method method;
        if (inboundConnection.getClass().isAssignableFrom((Class<?>)((Object)var_java_lang_reflect_Method_p))) {
            method = var_java_lang_reflect_Method_p;
        } else if (inboundConnection.getClass().isAssignableFrom((Class<?>)((Object)var_java_lang_reflect_Method_q))) {
            method = var_java_lang_reflect_Method_q;
        } else if (inboundConnection.getClass().isAssignableFrom(var_java_lang_Class____r)) {
            method = var_java_lang_reflect_Method_r;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + inboundConnection.getClass().getCanonicalName());
        }
        try {
            Object[] objectArray = new Object[e];
            objectArray[NLoginCore_273.f] = component;
            method.invoke((Object)inboundConnection, objectArray);
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_273.c("㺃", (int)g, (long)(h ^ i)) + inboundConnection, reflectiveOperationException);
        }
    }

    static {
        var_int_a = (0 >>> 183 | 0 << -183) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-6574361565825025178L);
        d = Long.reverse(-3170534137668829184L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = 0 >>> 166 | 0 << ~166 + 1;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-6574361565825025178L);
        i = Long.reverse(-3170534137668829184L);
        j = Integer.reverse(0x8000000);
        k = 4096 >>> 232 | 4096 << ~232 + 1;
        l = (65536 >>> 111 | 65536 << ~111 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(-1);
        n = Long.reverse(8125387617912273766L);
        o = Integer.reverse(-1073741824);
        var_long_p = Long.reverse(-6574361565825025178L);
        var_long_q = Long.reverse(-3170534137668829184L);
        var_int_r = Integer.reverse(0x20000000);
        s = Integer.reverse(-1);
        t = Long.reverse(8125387617912273766L);
        u = Integer.reverse(0);
        v = Integer.reverse(-1610612736);
        w = Long.reverse(-6574361565825025178L);
        x = Long.reverse(-3170534137668829184L);
        y = Integer.reverse(0x60000000);
        z = Long.reverse(-6574361565825025178L);
        aa = Long.reverse(-3170534137668829184L);
        ab = Integer.reverse(0);
        ac = 896 >>> 231 | 896 << ~231 + 1;
        ad = Integer.reverse(-1);
        ae = Long.reverse(8125387617912273766L);
        af = 0x10000000 >>> 153 | 0x10000000 << ~153 + 1;
        ag = Long.reverse(8125387617912273766L);
        ah = Integer.reverse(0);
        ai = 73728 >>> 13 | 73728 << ~13 + 1;
        aj = Long.reverse(-6574361565825025178L);
        ak = Long.reverse(-3170534137668829184L);
        al = (640 >>> 102 | 640 << -102) & 0xFFFFFFFF;
        am = Long.reverse(-6574361565825025178L);
        an = Long.reverse(-3170534137668829184L);
        ao = 0x40000000 >>> 222 | 0x40000000 << ~222 + 1;
        ap = 0 >>> 62 | 0 << ~62 + 1;
        aq = (0x5800000 >>> 183 | 0x5800000 << -183) & 0xFFFFFFFF;
        ar = Long.reverse(-6574361565825025178L);
        as = Long.reverse(-3170534137668829184L);
        at = 196608 >>> 78 | 196608 << -78;
        au = Integer.reverse(-1);
        av = Long.reverse(8125387617912273766L);
        aw = Integer.reverse(Integer.MIN_VALUE);
        ax = Integer.reverse(0);
        ay = 26 >>> 65 | 26 << -65;
        az = Long.reverse(8125387617912273766L);
        ba = Integer.reverse(0x70000000);
        bb = Long.reverse(-6574361565825025178L);
        bc = Long.reverse(-3170534137668829184L);
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = Integer.reverse(0);
        bf = -1073741821 >>> 222 | -1073741821 << -222;
        bg = Long.reverse(-6574361565825025178L);
        bh = Long.reverse(-3170534137668829184L);
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_273.b();
        Object object = NLoginCore_273.c("㺀", (int)(l & m), (long)n);
        Object object2 = NLoginCore_273.c("㺃", (int)o, (long)(var_long_p ^ var_long_q));
        var_java_lang_reflect_Method_p = NLoginCore_298.a((String)NLoginCore_273.c("㺆", (int)(var_int_r & s), (long)t), new String[u]);
        if (var_java_lang_reflect_Method_p == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺉", (int)v, (long)(w ^ x)));
        }
        var_java_lang_reflect_Method_q = NLoginCore_298.a((String)NLoginCore_273.c("㺌", (int)y, (long)(z ^ aa)), new String[ab]);
        if (var_java_lang_reflect_Method_q == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺏", (int)(ac & ad), (long)ae));
        }
        var_java_lang_Class____r = NLoginCore_298.a((String)NLoginCore_273.c("㺒", (int)af, (long)ag), new String[ah]);
        if (var_java_lang_Class____r == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺕", (int)ai, (long)(aj ^ ak)));
        }
        Class[] classArray = new Class[ao];
        classArray[NLoginCore_273.ap] = Component.class;
        if ((var_java_lang_reflect_Method_p = NLoginCore_546.a(var_java_lang_reflect_Method_p, (String)NLoginCore_273.c("㺘", (int)al, (long)(am ^ an)), classArray)) == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺛", (int)aq, (long)(ar ^ as)) + var_java_lang_reflect_Method_p);
        }
        Class[] classArray2 = new Class[aw];
        classArray2[NLoginCore_273.ax] = Component.class;
        if ((var_java_lang_reflect_Method_q = NLoginCore_546.a(var_java_lang_reflect_Method_q, (String)NLoginCore_273.c("㺞", (int)(at & au), (long)av), classArray2)) == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺡", (int)ay, (long)az) + var_java_lang_reflect_Method_q);
        }
        Class[] classArray3 = new Class[bd];
        classArray3[NLoginCore_273.be] = Component.class;
        var_java_lang_reflect_Method_r = NLoginCore_546.a(var_java_lang_Class____r, (String)NLoginCore_273.c("㺤", (int)ba, (long)(bb ^ bc)), classArray3);
        if (var_java_lang_reflect_Method_r == null) {
            throw new IllegalArgumentException((String)NLoginCore_273.c("㺧", (int)bf, (long)(bg ^ bh)) + var_java_lang_Class____r);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2BL;
        l ^= 0xC07BB01140CD7A2BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(12 + 57), (byte)(60 + 23), (byte)(34 + 13), 67, (byte)(7 + 59), 67, (byte)(10 + 37), (byte)(72 + 8), (byte)(10 + 65), (byte)(2 + 65), (byte)(66 + 17), (byte)(38 + 15), (byte)(30 + 50), (byte)(65 + 32), (byte)(4 + 96), (byte)(44 + 56), (byte)(32 + 73), (byte)(93 + 17), (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.D("єѡѠУѣџњѣѮѝЪѨѬѥѨѮа޶߅ޭ޸ީ޹߂ޱް߂", (byte)20, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_273.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_273.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ԥՇՉԩՍլդպզԵճթշձԺ՟ցրովոՍ", (byte)65, 69), NLoginCore_273.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.F("ՠխլԯկիզկպթԶմոձմպԼࣂ࣑ࢹࣄࢵࣅ࣎ࢽࢼ࣎Ւ", (byte)65, 70) + string + NLoginCore_446.A("Ļ", (byte)65, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 7412115886740652837L;
        long l = c ^ 0xC07BB01140CD7A2BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(52 + 17), 83, (byte)(39 + 8), (byte)(38 + 29), (byte)(2 + 64), 67, (byte)(43 + 4), (byte)(74 + 6), (byte)(62 + 13), (byte)(62 + 5), (byte)(72 + 11), (byte)(21 + 32), (byte)(57 + 23), (byte)(87 + 10), (byte)(82 + 18), (byte)(27 + 73), (byte)(33 + 72), (byte)(63 + 47), (byte)(7 + 96)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_273.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ԨԶ՗՚հԽԺՀմլԧԳղ՗կԸժկՋՈԺՌխ՝աջրՆՖ։մժճՔ֎րվՌսֈ՝ւՏ։Տ֔֕ջղ֖ըս֍֐խտ֛֤՜֛֓֗պյ֖֠֩֞֋֍ְ֯ծքվ֋֋֭ւնָ֦֘հֿ֠֬ւ֍ֻ֮ׄ֕քֶօֹׅ֧֮։ֱׂ֠׍֔א׉ְׇּׂ֯ו֭֕המ֥֦", (byte)54, 69);
                    NLoginCore_273.var_java_lang_String_arr_b[1] = NLoginCore_384.D("ӃҩҳӅӈңӈӊҗҙүҔҫӔӕҚӝӎӀӂӞӒӦӠҴӘӖӃӬҨӅҪ", (byte)54, 68);
                    NLoginCore_273.var_java_lang_String_arr_b[2] = NLoginCore_076.A("ĜŝŗğőŘřńĸŪŪŤĮŋūŎŨţŒįŴĶŉŋĹŖźľŭĽŎľŢƄŞŧľƆœƅŻƂŪœ", (byte)54, 65);
                    NLoginCore_273.var_java_lang_String_arr_b[3] = NLoginCore_223.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՞ՋՖԻո՚չգղ՜ՈՂք՟էւՏդսծֈխ՚", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[4] = NLoginCore_559.C("҈ӉӃҋҽӄӅҰҤӖӖӐҚҷӗҺӔӏҾқӠҢҵҷҥӂӦҪәҩҺҪҸӠӧҲӓӠӗӏӡӲҳӚӛӬӫӘӬӔӮӘӼӻӼӨҺӛӗӥԁәӽӆӯӌӣӿԑӇԏӔӶӦԇԄԅӖԆӷӝӟӺӞԟӜԎԢӽӤӦԛԕԫӶԢ", (byte)54, 67);
                    NLoginCore_273.var_java_lang_String_arr_b[5] = NLoginCore_027.B("ŗĽŇřŜķŜŞīĭńŌşŉĲŒňŪŋŊŁŗńŏĴűœŲŜūŕŁŲƂŜŷńƁżƅŴƈƎƆūśŝƂƒƋƑƄŭűƖƜƑŹŚƖƌƋŹűŢųƞƂƜŷƘƨƤƈƩƆƈơƢƂƮƐƴƐƨŶƶƼƋƉƼƝƙƍƌƋ", (byte)54, 66);
                    NLoginCore_273.var_java_lang_String_arr_b[6] = NLoginCore_027.C("҈ӉӃҋҽӄӅҰҤӖӖӐҚҷӗҺӔӏҾқӠҢҵҷҥӂӦҪәҩҺҪҸӠӧҲӓӠӗӏӡӲҳӚӛӬӫӘӬӔӮӘӼӼҸӏҺӈӛӷԃԇԇӯӸӛӼӑԉӣӴԏӸӖӷӧӤӼӧӕӭԊӚԌӻӼԓӡӰӠԃӶӪӽӭԞ", (byte)54, 67);
                    NLoginCore_273.var_java_lang_String_arr_b[7] = NLoginCore_427.A("ŗĽŇřŜķŜŞīĭńŌşŉĲŒňŪŋŊŁŗńŏĴűœŲŜūŕŁŲƂŜŷńƁżƅŴƈƎƆūśŝƂƒƋƑƄŭƆƃƋŖƋŕŕŮŪƋƙŭŜƅŷƘƟƘƙūŨƥŭưƚƆŰƣƨƱŭƷƑŷƎưƎŷƗƐŻƪƁ", (byte)54, 65);
                    NLoginCore_273.var_java_lang_String_arr_b[8] = NLoginCore_427.E("ԣդ՞Ԧ՘՟ՠՋԿձձիԵՒղՕկժՙԶջԽՐՒՀ՝ցՅմՄՕՅՓջւՍծջղժռ֍Վյնևֆճևկ։ճ֗֎֎րգափաևցՠֆ֨ր֗իֈ։ֵַ֥֤֧֢֢֮֒֨ղ֐ּ֒ջ֮օֆ", (byte)54, 69);
                    NLoginCore_273.var_java_lang_String_arr_b[9] = NLoginCore_110.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՞ՋՖԻո՚չգղ՜Ոչ։գվՋֈփ֌ջ֏֕֍ղբդ։֙֒֘֋մո֞ցւ֤դ֙֒ֈ՟֦ը֊֎զ֡փ֎֢եִ֣֐֌ֵ֋լ֓ոև֗֋ֈօֆ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[10] = NLoginCore_223.E("ԾժըԼհէթ՛եՄՓզհՌԷԹԳԺժԸՕվՅՆ", (byte)54, 69);
                    NLoginCore_273.var_java_lang_String_arr_b[11] = NLoginCore_138.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՚բՑՒջԽցԹ՛էՃո՘ՆՇփՇռև֋ազըֈՐդՙխ՜։ն՝ՙնւ֍֒գր֏֕շ֡ֆ֖֣֭պօ֑֬֟ֈ֧պ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[12] = NLoginCore_004.D("ңӏӍҡӕӌӎӀӊҩҸӋӕұҜҞҘҟӏҝҺӣҪҫ", (byte)54, 68);
                    NLoginCore_273.var_java_lang_String_arr_b[13] = NLoginCore_559.B("ŗĽŇřŜķŜŞīĭńŌşŉĲŒňŪŋŊŁœśŊŋŴĶźĲŔŠļűőĿŀżŀŵƀƄŚşšƁŉŝŒŦŕƂůŖŒůŻƆƋŜŹƈƎŰƚſƦƏƜųžƥƘƊƁƠų", (byte)54, 66);
                    NLoginCore_273.var_java_lang_String_arr_b[14] = NLoginCore_384.F("ԾժըԼհէթ՛եՄՓզհՌԷԹԳԺժԸՕվՅՆ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[15] = NLoginCore_138.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՚բՑՒջԽցԹ՛էՃո՘ՆՇփՇռև֋ազըֈՐդՙխ՜։ն՝ՙնւ֍֒գր֏֕շ֡ֆ֖֣֭պօ֑֬֟ֈ֧պ", (byte)54, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_273.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ҍқҼҿӕҢҟҥәӑҌҘӗҼӔҝӏӔҰҭҟұӒӂӆӠӥҫһӮәӏӘҹӳӥӣұӢӭӂӧҴӮҴӹӺӠӗӻӍӢӲӵӒӤԀԉӁӸӼԀӟӚԅԎӻԃӰӲԕԔӓөӣӰӰԒӧӛӽԝԋӕԅԑԤӧӲԩԓԠӺөԛӪԪԌԓԞӮԅԖԧԲӹԷӵԯӷԽԞԈԘԚՀӺԑՀԗӾԀԢԵԋՇԎՀ", (byte)54, 67);
                    NLoginCore_273.var_java_lang_String_arr_b[1] = NLoginCore_027.F("՞ՄՎՠգԾգեԲԴՊԯՆկհԵոթ՛՝չժՙԸԺ՘րրՏՑՓ՗ևՆվփո՘Շ֍֊թ֏՚", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[2] = NLoginCore_451.A("ĜŝŗğőŘřńĸŪŪŤĮŋūŎŨţŒįŴĶŉŋĹŖźľŭĽŎľĺŐŅųŁţƉŋšźŦœ", (byte)54, 65);
                    NLoginCore_273.var_java_lang_String_arr_b[3] = NLoginCore_004.A("ŗĽŇřŜķŜŞīĭńŌşŉĲŒňŪŋŊŁŗńŏĴűœŲŜūŕŁŭŁŹŇĺŹƄƅŴōŖœ", (byte)54, 65);
                    NLoginCore_273.var_java_lang_String_arr_b[4] = NLoginCore_138.D("҈ӉӃҋҽӄӅҰҤӖӖӐҚҷӗҺӔӏҾқӠҢҵҷҥӂӦҪәҩҺҪҸӠӧҲӓӠӗӏӡӲҳӚӛӬӫӘӬӔӮӘӼӻӼӨҺӛӗӥԁәӽӆӯӌӣӿԑӇԏӔӶӦԇԄԅӖԆӷӝӟӺӞԟӝӝӵԓԥԘԢԇԇԯԀ", (byte)54, 68);
                    NLoginCore_273.var_java_lang_String_arr_b[5] = NLoginCore_027.A("ŗĽŇřŜķŜŞīĭńŌşŉĲŒňŪŋŊŁŗńŏĴűœŲŜūŕŁŲƂŜŷńƁżƅŴƈƎƆūśŝƂƒƋƑƄŭűƖƜƑŹŚƖƌƋŹűŢųƞƂƜŷƘƨƤƈƩƆƈơƢƂƮƐƴƐƨŶŷƳƨƨƆƧŻƩŴƣ", (byte)54, 65);
                    NLoginCore_273.var_java_lang_String_arr_b[6] = NLoginCore_324.C("҈ӉӃҋҽӄӅҰҤӖӖӐҚҷӗҺӔӏҾқӠҢҵҷҥӂӦҪәҩҺҪҸӠӧҲӓӠӗӏӡӲҳӚӛӬӫӘӬӔӮӘӼӼҸӏҺӈӛӷԃԇԇӯӸӛӼӑԉӣӴԏӸӖӷӧӤӼӧӕӭԊӚԌӻӮԔӽԦӹԜԕԩӵӧԩ", (byte)54, 67);
                    NLoginCore_273.var_java_lang_String_arr_b[7] = NLoginCore_138.D("ӃҩҳӅӈңӈӊҗҙҰҸӋҵҞҾҴӖҷҶҭӃҰһҠӝҿӞӈӗӁҭӞӮӈӣҰӭӨӱӠӴӺӲӗӇӉӮӾӷӽӰәӲӯӷӂӷӁӁӚӖӷԅәӈӱӣԄԋԄԅӗӔԑәԜԆӲӜԏԔԝәԣԆԃӥԦӣԒԃԡԬӺԜ", (byte)54, 68);
                    NLoginCore_273.var_java_lang_String_arr_b[8] = NLoginCore_110.F("ԣդ՞Ԧ՘՟ՠՋԿձձիԵՒղՕկժՙԶջԽՐՒՀ՝ցՅմՄՕՅՓջւՍծջղժռ֍Վյնևֆճևկ։ճ֗֎֎րգափաևցՠֆ֨ր֗իֈ։ֵ֥֦֑֮֒ֈֱօֱ֊։֖֧֒־օֆ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[9] = NLoginCore_027.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՞ՋՖԻո՚չգղ՜Ոչ։գվՋֈփ֌ջ֏֕֍ղբդ։֙֒֘֋մո֞ցւ֤դ֙֒ֈ՟֦ը֊֎զ֡փ֎֢եֳַ֣֧ղօְֵ֫֬֝֫֘օֆ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[10] = NLoginCore_446.F("ԾժըԼհէթ՛եՄՔՆԮկՍյՎ՛ԴՙՒՈՅՆ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[11] = NLoginCore_027.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՚բՑՒջԽցԹ՛էՃո՘ՆՇփՇռև֋ազըֈՐդՙխ՜։ն՝ՙնւ֍֒գր֏֕շ֡֫թս֥֧֚֨֘ձղ֯պ", (byte)54, 70);
                    NLoginCore_273.var_java_lang_String_arr_b[12] = NLoginCore_384.B("ķţšĵũŠŢŔŞĽōōņŢňŅŧőŖŰŭŁľĿ", (byte)54, 66);
                    NLoginCore_273.var_java_lang_String_arr_b[13] = NLoginCore_201.C("ӃҩҳӅӈңӈӊҗҙҰҸӋҵҞҾҴӖҷҶҭҿӇҶҷӠҢӦҞӀӌҨӝҽҫҬӨҬӡӬӰӆӋӍӭҵӉҾӒӁӮӛӂҾӛӧӲӷӈӥӴӺӜԆӸӇӨөӦӐӎөԌӕԐӟ", (byte)54, 67);
                    NLoginCore_273.var_java_lang_String_arr_b[14] = NLoginCore_201.E("ԾժըԼհէթ՛եՄՔիԷդԹկԸջզՑՑվՅՆ", (byte)54, 69);
                    NLoginCore_273.var_java_lang_String_arr_b[15] = NLoginCore_091.F("՞ՄՎՠգԾգեԲԴՋՓզՐԹՙՏձՒՑՈ՚բՑՒջԽցԹ՛էՃո՘ՆՇփՇռև֋ազըֈՐդՙխ՜։ն՝ՙնւ֍֒գր֏֕շ֡ա֩րշ֜ը֨դջ֐հպ", (byte)54, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_273.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ҹҰҮҼӕҟҍҮҵҩҢӈҬӇӉӌҚӐүӒӘӓҪҫ", (byte)54, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_273.var_java_lang_String_arr_b[0] = NLoginCore_453.B("řĶįŦŇĲŁīĥĿŮĽŎűĨĻĿťĿŖųŁľĿ", (byte)54, 66);
                }
            }
        }
    }
}

