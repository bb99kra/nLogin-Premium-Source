/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

public class NLoginCore_573
implements NLoginInterface_037 {
    private static int ab;
    private static String[] var_java_lang_String_arr_a;
    private static int at;
    private static long av;
    private static int an;
    private static int j;
    private static int bb;
    private static long k;
    private static long e;
    private static int t;
    private static long ai;
    private static int f;
    private static long al;
    private static long u;
    private static int bd;
    private static int ay;
    private static int var_int_b;
    private static int af;
    private static int ag;
    private static final char[] var_char_arr_d;
    private static int am;
    private static int aa;
    public static final String cr;
    private static String[] var_java_lang_String_arr_b;
    private static int bc;
    private static final int aB;
    private static int v;
    private static int aw;
    private static int ar;
    private static int l;
    private static int var_int_a;
    private static int as;
    private static long ao;
    private static int s;
    private static int az;
    private static int bf;
    private static long ba;
    private static int ad;
    private static long c;
    private static final String cs;
    private static long n;
    private static long ah;
    private static int ak;
    private static long be;
    private static long q;
    private static int ae;
    private static long bg;
    private static int p;
    private static int ac;
    private static long r;
    private static int y;
    private static long au;
    private static int aq;
    private static int m;
    private static long ap;
    private static int o;
    private static long h;
    private static int z;
    private static long g;
    private static int ax;
    private static long var_long_d;
    private static int w;
    private static int i;
    private static int x;
    private static int aj;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_573.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), NLoginCore_573.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.C("ЭкйϼмигмчжЃсхосчЉޠޤޖޜއޡޥޘޔއП", (byte)7, 67) + string + NLoginCore_384.D("Є", (byte)7, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 213 | 0 << ~213 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-7076126539178525826L);
        e = Long.reverse(0x5A00000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-7076126539178525826L);
        h = Long.reverse(0x5A00000000000000L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (0x2000000 >>> 120 | 0x2000000 << ~120 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-4049707589585552514L);
        l = (196608 >>> 176 | 196608 << ~176 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(-1);
        n = Long.reverse(-4049707589585552514L);
        o = (65536 >>> 208 | 65536 << ~208 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0x20000000);
        q = Long.reverse(-7076126539178525826L);
        r = Long.reverse(0x5A00000000000000L);
        s = 1280 >>> 136 | 1280 << ~136 + 1;
        t = -1 >>> 8 | -1 << -8;
        u = Long.reverse(-4049707589585552514L);
        v = 0 >>> 157 | 0 << ~157 + 1;
        w = 262144 >>> 146 | 262144 << -146;
        x = Integer.reverse(0x40000000);
        y = (0 >>> 190 | 0 << ~190 + 1) & 0xFFFFFFFF;
        z = Integer.reverse(0x800000);
        aa = (0 >>> 206 | 0 << ~206 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(0);
        ac = Integer.reverse(0);
        ad = 0x20000000 >>> 125 | 0x20000000 << -125;
        ae = 0 >>> 87 | 0 << -87;
        af = Integer.reverse(0x200000);
        ag = Integer.reverse(0x60000000);
        ah = Long.reverse(-7076126539178525826L);
        ai = Long.reverse(0x5A00000000000000L);
        aj = Integer.reverse(-536870912);
        ak = Integer.reverse(-1);
        al = Long.reverse(-4049707589585552514L);
        am = Integer.reverse(0);
        an = (128 >>> 228 | 128 << -228) & 0xFFFFFFFF;
        ao = Long.reverse(-7076126539178525826L);
        ap = Long.reverse(0x5A00000000000000L);
        aq = 0 >>> 192 | 0 << -192;
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = Integer.reverse(-4194305);
        at = 0x24000000 >>> 186 | 0x24000000 << -186;
        au = Long.reverse(-7076126539178525826L);
        av = Long.reverse(0x5A00000000000000L);
        aw = (64 >>> 6 | 64 << -6) & 0xFFFFFFFF;
        ax = 0x68000000 >>> 27 | 0x68000000 << -27;
        ay = (53248 >>> 172 | 53248 << -172) & 0xFFFFFFFF;
        az = Integer.reverse(0x50000000);
        ba = Long.reverse(-4049707589585552514L);
        bb = Integer.reverse(0x200000);
        bc = 5632 >>> 41 | 5632 << ~41 + 1;
        bd = Integer.reverse(-1);
        be = Long.reverse(-4049707589585552514L);
        bf = 0x600000 >>> 19 | 0x600000 << -19;
        bg = Long.reverse(-4049707589585552514L);
        var_java_lang_String_arr_a = new String[ax];
        var_java_lang_String_arr_b = new String[ay];
        NLoginCore_573.b();
        cs = NLoginCore_573.c("㺀", (int)az, (long)ba);
        aB = bb;
        cr = NLoginCore_573.c("㺃", (int)(bc & bd), (long)be);
        var_char_arr_d = ((String)NLoginCore_573.c("㺆", (int)bf, (long)bg)).toCharArray();
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        Matcher matcher;
        string2 = string2.substring(var_int_a, string2.length() - ((String)NLoginCore_573.c("㺀", (int)var_int_b, (long)(var_long_d ^ e))).length());
        String[] stringArray = string2.split((String)NLoginCore_573.c("㺃", (int)f, (long)(g ^ h)));
        String string3 = stringArray[i];
        Pattern pattern = Pattern.compile((String)NLoginCore_573.c("㺆", (int)j, (long)k) + string3 + (String)NLoginCore_573.c("㺉", (int)(l & m), (long)n));
        if (string3.length() <= o) {
            pattern = Pattern.compile((String)NLoginCore_573.c("㺌", (int)p, (long)(q ^ r)) + string3 + (String)NLoginCore_573.c("㺏", (int)(s & t), (long)u));
        }
        if (!(matcher = pattern.matcher(string2)).matches()) {
            return v != 0;
        }
        int n = NLoginCore_573.b(Integer.parseInt(matcher.group(w)));
        byte[] byArray = Base64.getUrlDecoder().decode(matcher.group(x));
        byte[] byArray2 = Arrays.copyOfRange(byArray, y, z);
        char[] cArray = var_char_arr_d;
        int n2 = cArray.length;
        for (int i = aa; i < n2; ++i) {
            char c = cArray[i];
            String string4 = string + c;
            byte[] byArray3 = NLoginCore_573.a(string4.toCharArray(), byArray2, n);
            int n3 = ab;
            for (int j = ac; j < byArray3.length; ++j) {
                n3 |= byArray[byArray2.length + j] ^ byArray3[j];
            }
            if (n3 != 0) continue;
            return ad != 0;
        }
        return ae != 0;
    }

    private static byte[] a(char[] cArray, byte[] byArray, int n) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArray, byArray, n, af);
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)NLoginCore_573.c("㺀", (int)ag, (long)(ah ^ ai)));
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            NLoginCore_370.c((String)NLoginCore_573.c("㺃", (int)(aj & ak), (long)al), invalidKeySpecException, new Object[am]);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            NLoginCore_370.c((String)NLoginCore_573.c("㺆", (int)an, (long)(ao ^ ap)), noSuchAlgorithmException, new Object[aq]);
        }
        return new byte[ar];
    }

    private static String a(int n, long l) {
        l ^= 0x5AL;
        l ^= 0x897A72CF82E78A26L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(46 + 23), (byte)(23 + 60), (byte)(15 + 32), 67, (byte)(53 + 13), (byte)(43 + 24), (byte)(10 + 37), (byte)(58 + 22), (byte)(54 + 21), 67, (byte)(34 + 49), (byte)(45 + 8), (byte)(3 + 77), (byte)(10 + 87), (byte)(76 + 24), (byte)(6 + 94), (byte)(44 + 61), (byte)(41 + 69), (byte)(53 + 50)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.E("ֈ֕֔՗֗֓֎֢֑֗՞֢֜֠֙֜դࣱࣻࣿࣷ࣢ࣼऀ࣯ࣳ࣢", (byte)105, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_573.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 9141517188189991865L;
        long l = c ^ 0x897A72CF82E78A26L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(50 + 19), 83, (byte)(36 + 11), (byte)(29 + 38), (byte)(34 + 32), (byte)(60 + 7), (byte)(18 + 29), (byte)(16 + 64), (byte)(62 + 13), (byte)(36 + 31), 83, (byte)(50 + 3), (byte)(78 + 2), (byte)(32 + 65), (byte)(94 + 6), (byte)(79 + 21), (byte)(52 + 53), (byte)(26 + 84), (byte)(51 + 52)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(52 + 31)}, StandardCharsets.UTF_8));
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
                    NLoginCore_573.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ŲĻŎŲŌŜſŏůŝŃŧŝŔśŕŃņŠūƄřŖŗ", (byte)66, 65);
                    NLoginCore_573.var_java_lang_String_arr_b[1] = NLoginCore_446.E("յճ՚՚ԶԵՉ՚՞ՍճՆ", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[2] = NLoginCore_324.F("յճ՚՚ԶԵՉ՚՞ՍճՆ", (byte)66, 70);
                    NLoginCore_573.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ԵիՐՅհեԹՆՇ՝ՓիՓՏՖծշքՅբ՛֊֊խՅկ֒֊կզհշ", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[4] = NLoginCore_559.B("źŸşşĻĺŎşţŒŸŋ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[5] = NLoginCore_201.B("ĺŰŕŊŵŪľŋŌŢŘŰŘŔśųżƉŊŧŠƏƏŲŊŴƗƏŴūŵż", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[6] = NLoginCore_027.B("œŪſŵůůźżƄľŜŀŅųƇƈŠũťżƈƀƃţŌŋƏŠŗŲƚż", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[7] = NLoginCore_324.E("եեԱՑ՛ԮԶ՘ԷՋն՜ԽՎ՗ծջձքՂդժգՉՁՂ֎իֈ՟ացօև֍Օ֏Փ՝ֈտ֝֙֍֤֟՝֤֑դ֛֙֟֞գնթխ֟լ֑֒֞֐", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[8] = NLoginCore_076.B("ŪŪĶŖŠĳĻŝļŐŻšłœŜųƀŶƉŇũźƅōŊƃŠōƈƊŴűŔƎũƞƘźžŮƖŹƖŦƣſŤƜŧžƆƗƙƢƄƤƫƵƊƉƪƤƤƚźƒƬƏŽƻƿǁƵƾƐƴǅƹƖƤžƜƝǃƿǏƖƗ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[9] = NLoginCore_004.F("ճճՔ՛խԴշԹԸՋՀՆ", (byte)66, 70);
                    NLoginCore_573.var_java_lang_String_arr_b[10] = NLoginCore_110.B("œŪſŵůůźżƄľŜŀŅųƇƈŠũťżƈƀƃţŌŋƏŠŗŲƚż", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[11] = NLoginCore_324.B("ŲĻŎŲŌŜſŏůŝŃŧŝŔśŕŃņŠūƄřŖŗ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[12] = NLoginCore_027.C("ӓӮҭӸӳӓӐӖәӬӷӸӵӔҾӔӝӥӤӾӜҿӡӫӇӻӊӨԈԆӒӉӔӡӯӢӭԚԇӪӤԐӾӰӾԗӔӽӠԦԦԜԣԣԃӢԝԮӺԗӫӪӾԓӮԵԈӷԮԳԵӲԱԈԸԮԯԑԟԋӿԎՆԥԣԑԎԏ", (byte)66, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_573.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŲĻŎŲŌŜſŏůŝńƇľŢūłŪƃŞŸƈũŖŗ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ŐĳŵŷŨųŽŹżĻƀŋ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[2] = NLoginCore_027.E("ՒչզՙՃժՏԹԻ՗ՕՆ", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ҲӨӍӂӭӢҶӃӄӚӐӨӐӌӓӫӴԁӂӟӘӂӊӿӴӹӗԎӜӼӭӒԎԔӭӦӵԌӦӶӪԔӲӣ", (byte)66, 68);
                    NLoginCore_573.var_java_lang_String_arr_b[4] = NLoginCore_076.B("ŐĳŵŷŨųŽŹżĻƀŋ", (byte)66, 66);
                    NLoginCore_573.var_java_lang_String_arr_b[5] = NLoginCore_559.D("ҲӨӍӂӭӢҶӃӄӚӐӨӐӌӓӫӴԁӂӟӘӃӇӆӢӷԇӬӌӝԄԀӰӐӶӨԂӦԃԙԆӷӦӣ", (byte)66, 68);
                    NLoginCore_573.var_java_lang_String_arr_b[6] = NLoginCore_110.F("ՎեպհժժյշտԹ՗ԻՀծւփ՛դՠշփև֌՜ջՏցքգ֎փդ", (byte)66, 70);
                    NLoginCore_573.var_java_lang_String_arr_b[7] = NLoginCore_384.D("ӢӢҮӎӘҫҳӕҴӈӳәҺӋӔӫӸӮԁҿӡӧӠӆҾҿԋӨԅӜӞӾԂԄԊӒԌӐӚԅӼԚԖԊԡԜӚԡԎӡԖԘԜԣԔӦӽԈԚԩԙԦԧԯԃԎԷӲԲӱԛӺӹԧ԰ԃ", (byte)66, 68);
                    NLoginCore_573.var_java_lang_String_arr_b[8] = NLoginCore_324.C("ӢӢҮӎӘҫҳӕҴӈӳәҺӋӔӫӸӮԁҿӡӲӽӅӂӻӘӅԀԂӬөӌԆӡԖԐӲӶӦԎӱԎӞԛӷӜԔӟӶӾԏԑԚӼԜԣԭԂԁԢԜԜԒӲԊԤԇӵԳԷԹԭԶԉԟՀԁԞԋԯԒՇԶԺՇԎԏ", (byte)66, 67);
                    NLoginCore_573.var_java_lang_String_arr_b[9] = NLoginCore_091.E("ՐԲժԹՆՙ՛ԺռցյԼյարՁւջ՜ֆքպՑՒ", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[10] = NLoginCore_110.E("ՎեպհժժյշտԹ՗ԻՀծւփ՛դՠշփփդկրսֈիղֈմդ", (byte)66, 69);
                    NLoginCore_573.var_java_lang_String_arr_b[11] = NLoginCore_223.D("ӪҳӆӪӄӔӷӇӧӕһӠҺһһҺӥӐӦӿәӷӎӏ", (byte)66, 68);
                    NLoginCore_573.var_java_lang_String_arr_b[12] = NLoginCore_324.A("śŶĵƀŻśŘŞšŴſƀŽŜņŜťŭŬƆŤŇũųŏƃŒŰƐƎŚőŜũŷŪŵƢƏŲŬƘƆŸƆƟŜƅŨƮƮƤƫƫƋŪƥƶƂƟųŲƆƛŶƽƐſƶƻƽźƹƐǃƘƶƂƤǋƌƆǁƘƆǏƖƗ", (byte)66, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_573.var_java_lang_String_arr_b[0] = NLoginCore_559.F("Կ՘ՙՖյղ՞ԺռվՕՆ", (byte)66, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_573.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՋՀպՉէՒս՘՘սԽՎւջԽՏՕՄժիՙս֊լևցձկժՠփտ", (byte)66, 70);
                }
            }
        }
    }

    private static int b(int n) {
        if ((n & as) != 0) {
            throw new IllegalArgumentException((String)NLoginCore_573.c("㺀", (int)at, (long)(au ^ av)) + n);
        }
        return aw << n;
    }
}

