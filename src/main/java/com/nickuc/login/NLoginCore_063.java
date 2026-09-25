/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.proxy.InboundConnection
 *  io.netty.channel.Channel
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import com.velocitypowered.api.proxy.InboundConnection;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_063 {
    private static long u;
    private static long ay;
    private static final Field var_java_lang_reflect_Field_k;
    private static int ag;
    private static int o;
    private static long p;
    private static int al;
    private static int au;
    private static long bf;
    private static int af;
    private static long t;
    private static int var_int_m;
    private static long x;
    private static long var_long_b;
    private static long q;
    private static int z;
    private static int ax;
    private static final Field var_java_lang_reflect_Field_i;
    private static long as;
    private static int var_int_i;
    private static long var_long_c;
    private static int ac;
    private static long ai;
    private static int bb;
    private static int y;
    private static int bc;
    private static long ab;
    private static long w;
    private static long ao;
    private static int aw;
    private static int ar;
    private static long bd;
    private static long at;
    private static int s;
    private static int an;
    private static long e;
    private static int var_int_l;
    private static int v;
    private static long ap;
    private static long ah;
    private static int aj;
    private static long av;
    private static int ak;
    private static long var_long_k;
    private static int bg;
    private static long ad;
    private static int be;
    private static String[] var_java_lang_String_arr_b;
    private static final Field var_java_lang_reflect_Field_j;
    private static final Field var_java_lang_reflect_Field_l;
    private static long var_long_j;
    private static final Class<?> var_java_lang_Class____n;
    private static int var_int_a;
    private static final Class<?> var_java_lang_Class____m;
    private static long aa;
    private static int g;
    private static int ba;
    private static long var_long_n;
    private static int f;
    private static int az;
    private static int aq;
    private static int h;
    private static long am;
    private static int r;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static int var_int_c;
    private static long ae;

    private static void b() {
        int n;
        var_long_c = 3814369761979137562L;
        long l = var_long_c ^ 0x82728F59871D1C82L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(44 + 25), (byte)(16 + 67), (byte)(34 + 13), (byte)(40 + 27), (byte)(2 + 64), (byte)(46 + 21), (byte)(9 + 38), (byte)(35 + 45), (byte)(15 + 60), (byte)(54 + 13), 83, 53, (byte)(15 + 65), (byte)(35 + 62), (byte)(86 + 14), (byte)(99 + 1), (byte)(37 + 68), (byte)(12 + 98), (byte)(36 + 67)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
                    NLoginCore_063.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŚŲŽŨŰūŲœƒƗŚƜųźƘťƢŨƗơźƭŧƂƜƁƬơƩƖƅŷŰƉƖƷƱƗŽƎƪưſƉ", (byte)81, 66);
                    NLoginCore_063.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ƎźŭƌŴŶśƗšůżũ", (byte)81, 66);
                    NLoginCore_063.var_java_lang_String_arr_b[2] = NLoginCore_575.E("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ՗ՙ֌֤՜յսդճեե֟յֈՠ֏֌յ", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[3] = NLoginCore_201.A("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųŸƬƴƩƔƙźƠƽǁƲƉ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[4] = NLoginCore_223.E("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ՗ՙ֌֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ֋ַ֤֤֮֞֔֏մֲ֋ֵռտ֣վ֦֢֧֓֝ׄ֬֋քּ֣֌׃ֲִ֩׏׃ָׅ׏ּּ֕֯טּֿ֝יף֜׆", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[5] = NLoginCore_223.E("Ն՞թՔ՜՗՞ԿվփՐ՚քիլՍ֏գն՘էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ֳֶ֩֊ֽ֊ձնֵָ֭֡֝֘֠ք׃ֵׇׅ֚ׄ֠׈ׁֈ֣ב֨ה֐הֳׇָ֦֥׍ז׋֮֘סְג", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[6] = NLoginCore_173.D("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԼՂՅԞՉՑԡԣԯԽԽԤԒԴՍԻ՚՘ԔՉՒԿ՝գաԾՅբԟԨ՜ԥԶբԸԪԽԭԯԫծԼըմԻԼ", (byte)81, 68);
                    NLoginCore_063.var_java_lang_String_arr_b[7] = NLoginCore_091.D("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԏԖԷԭԸԉӵӼԕԺӺԽԐԬԿԁԆՀӺՇԟՇԃՅՃԹԏՈԱՐՄՆ԰ՉԡՊՂԦԴԝԔ԰ԜՎԚՋՠԣՔԻԼԥՠԦ԰", (byte)81, 68);
                    NLoginCore_063.var_java_lang_String_arr_b[8] = NLoginCore_138.F("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ՗ՙ֌֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ֋ַַֽ֤֛֥֚֮֞֔֜ռֲֳֳׇ֢֣֤֚֘֩֟׊ֆֱַׁׅ֤גׁ׈ז֧ח֯י֠֡", (byte)81, 70);
                    NLoginCore_063.var_java_lang_String_arr_b[9] = NLoginCore_092.E("Ն՞թՔ՜՗՞ԿվփՐ՚քիլՍ֏գն՘էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ְֳֵֶ֭ֆ֊չ֑֑֭֒րׂ֦֮֯֜־׍֦֡ցׁ֚֭׊ד֐זא֦טֳׄ֠֡", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[10] = NLoginCore_223.F("Ն՞թՔ՜՗՞ԿվփՐ՚քիլՍ֏գն՘էօՖծը՜՝ՠ֌ծ֍֏հօյ֥֟ֆ֌֫֊տ֮յ", (byte)81, 70);
                    NLoginCore_063.var_java_lang_String_arr_b[11] = NLoginCore_110.C("ԏԐԘԝԎԀԝԅԊӜԝӰ", (byte)81, 67);
                    NLoginCore_063.var_java_lang_String_arr_b[12] = NLoginCore_223.C("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԠӱԉԃӷӸӻԧԉԨԪԋԠԐՀԺԡԧՆԥԚՉԐ", (byte)81, 67);
                    NLoginCore_063.var_java_lang_String_arr_b[13] = NLoginCore_092.A("ƈƉƑƖƇŹƖžƃŕƖũ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[14] = NLoginCore_091.A("ƉƊƖžƗƑźŘƜŭŵŰƃŹƜƀƛƓŧƘŽƂƋŭƋťūŭƠƸŰƉưƄƱƈƾŶƍƔƕƁƳƥſǆƃƟƲǋƸƨǂƼƠǃƧƴƊƿǏƶƢƒƙǐƸưǎƧǠƻǞƫƞǗƽƟǔƼǣǔǬƵǀǦƹǬǲƫƱƲǊƵǹǈ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[15] = NLoginCore_110.F("քՂռպՊառֆՌՆ՜ֆՎցՋ֕՟ի֐֏՘֙ՠա", (byte)81, 70);
                    NLoginCore_063.var_java_lang_String_arr_b[16] = NLoginCore_091.A("œżƅŬƐŞŖƀŵŽƕţůŠƇŠƫơŶƎƆƃƃƝƠŬƥſžƁƔƨƤƈƺƺƻƷƛƶưƚŻƐơƱƽǃƀƩƈơǏƈƩƚǏǁǀƧƾƐƢƢǒǛǏƬǚǜƞưǀƼǞƩ", (byte)81, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_063.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ŚŲŽŨŰūŲœƒƗŚƜųźƘťƢŨƗơźƭŧƂƜƁƬơƩƖƅŷƸƋƇƐƪƻƉƜƀƕƑǅƜžƛƸƣǃƚǁƧƗƔƕ", (byte)81, 66);
                    NLoginCore_063.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ՅՁֆօՀէՄՙ՗թ֏կՊ՜Ւսխ։իՐՔճՠա", (byte)81, 70);
                    NLoginCore_063.var_java_lang_String_arr_b[2] = NLoginCore_559.C("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԮӹԙԀԎӽԛԾԂԣԣԐ", (byte)81, 67);
                    NLoginCore_063.var_java_lang_String_arr_b[3] = NLoginCore_138.B("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųƇƔƗƵƸƬƽƟŸƺƮƉ", (byte)81, 66);
                    NLoginCore_063.var_java_lang_String_arr_b[4] = NLoginCore_076.C("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԺԬԆՍԊԦԹՒԿԯՉԿԪԏՍԦՐԗԚԾԙՁԮԽՂԸ՟ՇԦԟԾ՗ԧ՞ՍՄՏժ՞ՠՓժ԰՗ձհծինԴհՉԷա", (byte)81, 67);
                    NLoginCore_063.var_java_lang_String_arr_b[5] = NLoginCore_027.E("Ն՞թՔ՜՗՞ԿվփՐ՚քիլՍ֏գն՘էմջ֜֒֝ծ՚ապ֟՟֢յ֑֤զի֥՟֬ք֫֏թ֯ծֲ֒֒֍ֳֶ֩֊ֽ֊ձնֵָ֭֡֝֘֠ք׃ֵׇׅ֚ׄ֠׈ׁֈ֣ב֨ה֐הֳׇ֨֒ז֘ובי׃׃֚ף", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[6] = NLoginCore_559.F("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ՗ՙ֌֤՜յ֜հ֝մ֪բչրցխ֧֪֡փֶ֮ֆֈ֢֢֔։շֲֽֿ֙֠չַׂ֤֮׈׆ׇ֣֪ք֍ׁ֊֙׌ֻ׀֐֬דֵ׃ט֤׉֠֡", (byte)81, 70);
                    NLoginCore_063.var_java_lang_String_arr_b[7] = NLoginCore_004.D("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԏԖԷԭԸԉӵӼԕԺӺԽԐԬԿԁԆՀӺՇԟՇԃՅՃԹԏՈԱՐՄՆ԰ՉԡՊՂԦԴԝԔ԰Ԝ՛Ճ՞Ե՛ԴՕՖԠՊԝՈՠՎԬձե՚ժՇՈդԻԼ", (byte)81, 68);
                    NLoginCore_063.var_java_lang_String_arr_b[8] = NLoginCore_559.E("յնւժփսզՄֈՙա՜կեֈլևտՓքթծշՙշՑ՗ՙ֌֤՜յ֜հ֝մ֪բչրցխ֑֟իֲկ֋ַַֽ֤֛֥֚֮֞֔֜ռֲֳֳׇ֢֣֤֚֘֩֟׊ֆְַ֛׉ֱׁ֏ֶ׏֤ח֣֨֠֡", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[9] = NLoginCore_027.A("ŚŲŽŨŰūŲœƒƗŤŮƘſƀšƣŷƊŬŻƈƏưƦƱƂŮŵƎƳųƶƉƥƸźſƹųǀƘƿƣŽǃƂƦƦǆơǊǇǄǉǁƚƞƍƦǁƥƥƔǂǃưƺǖǒǡƵƺƕǕǃǠƱƽƟƜǁƿǅǄƷƴƵ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[10] = NLoginCore_223.C("ӡӹԄӯӷӲӹӚԙԞӫӵԟԆԇӨԪӾԑӳԂԠӱԉԃӷӸӻԧԉԨԪԸԭӾԌԠԁ԰ՅԿԁՁԐ", (byte)81, 67);
                    NLoginCore_063.var_java_lang_String_arr_b[11] = NLoginCore_324.A("ŪŬůŹƘŪŚŞŹŢƒũ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[12] = NLoginCore_091.E("Ն՞թՔ՜՗՞ԿվփՐ՚քիլՍ֏գն՘էօՖծը՜՝ՠ֌ծ֍֏յ֣֝ղճջզփ֦֡֩յ", (byte)81, 69);
                    NLoginCore_063.var_java_lang_String_arr_b[13] = NLoginCore_384.A("ůƏƏƈŭƝŹƒƢŮƤŮƄŻŨƀƦƔŢŤƁƇŴŵ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[14] = NLoginCore_387.D("ԐԑԝԅԞԘԁӟԣӴӼӷԊԀԣԇԢԚӮԟԄԉԒӴԒӬӲӴԧԿӷԐԷԋԸԏՅӽԔԛԜԈԺԬԆՍԊԦԹՒԿԯՉՃԧՊԮԻԑՆՖԽԩԙԠ՗ԿԷՕԮէՂեԲԥ՞ՄԦ՛Ճժ՛ճԼՇծՄԷՅՓժռՐ՚՛Ր", (byte)81, 68);
                    NLoginCore_063.var_java_lang_String_arr_b[15] = NLoginCore_451.A("ƘŖƐƎŞŵƐƚŠŚŰųƁſƖŤŻŨơƍƖƝŴŵ", (byte)81, 65);
                    NLoginCore_063.var_java_lang_String_arr_b[16] = NLoginCore_173.D("ӚԃԌӳԗӥӝԇӼԄԜӪӶӧԎӧԲԨӽԕԍԊԊԤԧӳԬԆԅԈԛԯԫԏՁՁՂԾԢԽԷԡԂԗԨԸՄՊԇ԰ԏԨՖԏ԰ԡՖՈՇԮՅԗԩԩ՛ԶԜՂՖդԠՠԿԢԻ԰", (byte)81, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_063.var_java_lang_String_arr_b[0] = NLoginCore_453.B("ŤŹŜŬƗŬƒźơƗŸũ", (byte)81, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_063.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ԘӪӹԚԘӱԇԘԁԣԧӾԎӪӹԊԃԡԢӭԎԴӻӼ", (byte)81, 68);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(4503462237418747692L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(6376959682404874028L);
        e = Long.reverse(0x6600000000000000L);
        f = 0 >>> 206 | 0 << -206;
        g = (-2147483640 >>> 223 | -2147483640 << -223) & 0xFFFFFFFF;
        h = Integer.reverse(-2013265920);
        var_int_i = Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190;
        var_long_j = Long.reverse(6376959682404874028L);
        var_long_k = Long.reverse(0x6600000000000000L);
        var_int_l = 768 >>> 168 | 768 << -168;
        var_int_m = (-1 >>> 196 | -1 << ~196 + 1) & 0xFFFFFFFF;
        var_long_n = Long.reverse(4503462237418747692L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(6376959682404874028L);
        q = Long.reverse(0x6600000000000000L);
        r = 0 >>> 209 | 0 << -209;
        s = Integer.reverse(-1610612736);
        t = Long.reverse(6376959682404874028L);
        u = Long.reverse(0x6600000000000000L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(6376959682404874028L);
        x = Long.reverse(0x6600000000000000L);
        y = Integer.reverse(0);
        z = Integer.reverse(-536870912);
        aa = Long.reverse(6376959682404874028L);
        ab = Long.reverse(0x6600000000000000L);
        ac = (0x800000 >>> 244 | 0x800000 << -244) & 0xFFFFFFFF;
        ad = Long.reverse(6376959682404874028L);
        ae = Long.reverse(0x6600000000000000L);
        af = 0 >>> 155 | 0 << -155;
        ag = (0x4800000 >>> 247 | 0x4800000 << -247) & 0xFFFFFFFF;
        ah = Long.reverse(6376959682404874028L);
        ai = Long.reverse(0x6600000000000000L);
        aj = Integer.reverse(0);
        ak = Integer.reverse(0x50000000);
        al = -1 >>> 210 | -1 << ~210 + 1;
        am = Long.reverse(4503462237418747692L);
        an = Integer.reverse(-805306368);
        ao = Long.reverse(6376959682404874028L);
        ap = Long.reverse(0x6600000000000000L);
        aq = (0 >>> 142 | 0 << ~142 + 1) & 0xFFFFFFFF;
        ar = 384 >>> 37 | 384 << -37;
        as = Long.reverse(6376959682404874028L);
        at = Long.reverse(0x6600000000000000L);
        au = Integer.reverse(-1342177280);
        av = Long.reverse(4503462237418747692L);
        aw = (917504 >>> 144 | 917504 << -144) & 0xFFFFFFFF;
        ax = Integer.reverse(-1);
        ay = Long.reverse(4503462237418747692L);
        az = 0 >>> 127 | 0 << -127;
        ba = 524288 >>> 211 | 524288 << -211;
        bb = Integer.reverse(0);
        bc = Integer.reverse(-268435456);
        bd = Long.reverse(4503462237418747692L);
        be = Integer.reverse(0x8000000);
        bf = Long.reverse(4503462237418747692L);
        bg = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_063.b();
        Object object = NLoginCore_063.c("㺀", (int)var_int_i, (long)(var_long_j ^ var_long_k));
        Object object2 = NLoginCore_063.c("㺃", (int)(var_int_l & var_int_m), (long)var_long_n);
        Class<?> clazz = NLoginCore_298.a((String)NLoginCore_063.c("㺆", (int)o, (long)(p ^ q)), new String[r]);
        if (clazz == null) {
            throw new IllegalArgumentException((String)NLoginCore_063.c("㺉", (int)s, (long)(t ^ u)));
        }
        Class<?> clazz2 = NLoginCore_298.a((String)NLoginCore_063.c("㺌", (int)v, (long)(w ^ x)), new String[y]);
        var_int_m = (int)clazz2;
        if (clazz2 == null) {
            throw new IllegalArgumentException((String)NLoginCore_063.c("㺏", (int)z, (long)(aa ^ ab)));
        }
        var_java_lang_Class____n = NLoginCore_298.a((String)NLoginCore_063.c("㺒", (int)ac, (long)(ad ^ ae)), new String[af]);
        if (var_java_lang_Class____n == null) {
            throw new IllegalArgumentException((String)NLoginCore_063.c("㺕", (int)ag, (long)(ah ^ ai)));
        }
        var_java_lang_reflect_Field_i = NLoginCore_546.a(clazz, var_int_m, aj);
        if (var_java_lang_reflect_Field_i == null) {
            throw new IllegalArgumentException((String)NLoginCore_063.c("㺘", (int)(ak & al), (long)am) + var_int_m + (String)NLoginCore_063.c("㺛", (int)an, (long)(ao ^ ap)) + clazz);
        }
        var_java_lang_reflect_Field_j = NLoginCore_546.a(var_java_lang_Class____n, var_int_m, aq);
        if (var_java_lang_reflect_Field_j == null) {
            throw new IllegalArgumentException((String)NLoginCore_063.c("㺞", (int)ar, (long)(as ^ at)) + var_int_m + (String)NLoginCore_063.c("㺡", (int)au, (long)av) + var_java_lang_Class____n);
        }
        Class<?> clazz3 = NLoginCore_298.a((String)NLoginCore_063.c("㺤", (int)(aw & ax), (long)ay), new String[az]);
        if (clazz3 != null) {
            String[] stringArray = new String[ba];
            stringArray[NLoginCore_063.bb] = NLoginCore_063.c("㺧", (int)bc, (long)bd);
            var_java_lang_reflect_Field_k = NLoginCore_546.a(clazz3, stringArray);
            if (var_java_lang_reflect_Field_k == null) {
                throw new NullPointerException((String)NLoginCore_063.c("㺪", (int)be, (long)bf));
            }
        } else {
            var_java_lang_reflect_Field_k = null;
        }
        var_java_lang_reflect_Field_l = NLoginCore_546.a(var_int_m, Channel.class, bg);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_063.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.B("óĕė÷ěĺĲňĴăŁķŅĿĈĭŏŎņŌņě", (byte)38, 66), NLoginCore_063.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("ՅՒՑԔՔՐՋՔ՟Վԛՙ՝Ֆՙ՟ԡࢷ࢝ࢫࢺࢬࢼࢶࢯࢳԶ", (byte)38, 70) + string + NLoginCore_027.D("ѡ", (byte)38, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x66L;
        l ^= 0x82728F59871D1C82L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(7 + 62), (byte)(67 + 16), (byte)(35 + 12), (byte)(22 + 45), (byte)(52 + 14), (byte)(49 + 18), (byte)(15 + 32), 80, 75, (byte)(26 + 41), (byte)(49 + 34), (byte)(38 + 15), (byte)(55 + 25), (byte)(73 + 24), (byte)(69 + 31), (byte)(7 + 93), (byte)(12 + 93), (byte)(29 + 81), (byte)(26 + 77)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ƜƩƨūƫƧƢƫƶƥŲưƴƭưƶŸԎӴԂԑԃԓԍԆԊ", (byte)93, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_063.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    public static Channel a(Object object, InboundConnection inboundConnection) {
        try {
            Object object2;
            if (inboundConnection.getClass().isAssignableFrom(var_java_lang_Class____n)) {
                object2 = var_java_lang_reflect_Field_j.get(inboundConnection);
            } else if (var_java_lang_reflect_Field_k != null) {
                inboundConnection = (InboundConnection)var_java_lang_reflect_Field_k.get(inboundConnection);
                object2 = var_java_lang_reflect_Field_i.get(inboundConnection);
            } else {
                object2 = var_java_lang_reflect_Field_i.get(inboundConnection);
            }
            return (Channel)var_java_lang_reflect_Field_l.get(object2);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_063.c("㺀", (int)var_int_a, (long)var_long_b) + object.getClass().getCanonicalName() + (String)NLoginCore_063.c("㺃", (int)var_int_c, (long)(d ^ e)), exception, new Object[f]);
            return null;
        }
    }
}

