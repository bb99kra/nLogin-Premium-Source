/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
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

public final class NLoginCore_077
extends Enum<NLoginCore_077> {
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_a;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_b;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_c;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_d;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_e;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_f;
    public static final /* enum */ NLoginCore_077 var_com_nickuc_login_NLoginCore_077_g;
    private static final /* synthetic */ NLoginCore_077[] var_com_nickuc_login_NLoginCore_077_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int var_int_g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static int v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;
    private static int aa;
    private static long ab;
    private static long ac;
    private static int ad;
    private static int ae;
    private static long af;
    private static long ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static long ak;
    private static int al;
    private static int am;
    private static long an;
    private static long ao;
    private static int ap;
    private static int aq;
    private static long ar;
    private static long as;
    private static int at;

    public boolean a(NLoginCore_077 NLoginCore_0772) {
        return (this.ordinal() <= NLoginCore_0772.ordinal() ? var_int_a : var_int_b) != 0;
    }

    public boolean c(NLoginCore_077 NLoginCore_0772) {
        return (this.ordinal() < NLoginCore_0772.ordinal() ? var_int_e : var_int_f) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x6CL;
        l ^= 0xEB1611B7D6E2CF0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(13 + 56), (byte)(71 + 12), (byte)(36 + 11), (byte)(62 + 5), 66, (byte)(10 + 57), 47, (byte)(57 + 23), (byte)(2 + 73), (byte)(7 + 60), (byte)(57 + 26), (byte)(49 + 4), (byte)(10 + 70), (byte)(77 + 20), (byte)(91 + 9), (byte)(95 + 5), (byte)(17 + 88), (byte)(66 + 44), (byte)(2 + 101)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.B("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸӉӔӇӅӐӃӕҬӄӖҼӉӉӗ", (byte)61, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_077.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_077 valueOf(String string) {
        return Enum.valueOf(NLoginCore_077.class, string);
    }

    public boolean b(NLoginCore_077 NLoginCore_0772) {
        return (this.ordinal() >= NLoginCore_0772.ordinal() ? var_int_c : var_int_d) != 0;
    }

    static {
        var_int_a = (0x20000000 >>> 253 | 0x20000000 << ~253 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = (Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << -63) & 0xFFFFFFFF;
        var_int_d = (0 >>> 159 | 0 << ~159 + 1) & 0xFFFFFFFF;
        var_int_e = 256 >>> 136 | 256 << -136;
        var_int_f = Integer.reverse(0);
        var_int_g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0);
        i = (458752 >>> 48 | 458752 << -48) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = (0x1000000 >>> 184 | 0x1000000 << ~184 + 1) & 0xFFFFFFFF;
        l = 8 >>> 194 | 8 << -194;
        m = Integer.reverse(-1073741824);
        n = Integer.reverse(0x20000000);
        o = Integer.reverse(-1610612736);
        p = Integer.reverse(0x60000000);
        q = (0x70000000 >>> 92 | 0x70000000 << ~92 + 1) & 0xFFFFFFFF;
        r = 0xE000000 >>> 89 | 0xE000000 << ~89 + 1;
        s = Integer.reverse(0);
        t = Integer.reverse(-1);
        u = Long.reverse(-4075930353896669600L);
        v = Integer.reverse(0);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = Integer.reverse(-1);
        y = Long.reverse(-4075930353896669600L);
        z = 512 >>> 105 | 512 << ~105 + 1;
        aa = 64 >>> 69 | 64 << -69;
        ab = Long.reverse(-1049511404303696288L);
        ac = Long.reverse(0x3600000000000000L);
        ad = Integer.reverse(0x40000000);
        ae = Integer.reverse(-1073741824);
        af = Long.reverse(-1049511404303696288L);
        ag = Long.reverse(0x3600000000000000L);
        ah = 0x18000000 >>> 27 | 0x18000000 << -27;
        ai = (0x40000000 >>> 28 | 0x40000000 << -28) & 0xFFFFFFFF;
        aj = Long.reverse(-1049511404303696288L);
        ak = Long.reverse(0x3600000000000000L);
        al = Integer.reverse(0x20000000);
        am = Integer.reverse(-1610612736);
        an = Long.reverse(-1049511404303696288L);
        ao = Long.reverse(0x3600000000000000L);
        ap = 327680 >>> 240 | 327680 << -240;
        aq = Integer.reverse(0x60000000);
        ar = Long.reverse(-1049511404303696288L);
        as = Long.reverse(0x3600000000000000L);
        at = 0x1800000 >>> 214 | 0x1800000 << -214;
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_077.b();
        var_com_nickuc_login_NLoginCore_077_a = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_b = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_c = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_d = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_e = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_f = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_g = new NLoginCore_077();
        var_com_nickuc_login_NLoginCore_077_arr_a = NLoginCore_077.a();
    }

    private static void b() {
        int n;
        var_long_c = 467674436452415119L;
        long l = var_long_c ^ 0xEB1611B7D6E2CF0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(6 + 63), (byte)(53 + 30), (byte)(37 + 10), (byte)(16 + 51), 66, (byte)(32 + 35), (byte)(44 + 3), (byte)(45 + 35), (byte)(63 + 12), (byte)(15 + 52), (byte)(54 + 29), (byte)(10 + 43), 80, (byte)(95 + 2), (byte)(7 + 93), (byte)(47 + 53), (byte)(94 + 11), (byte)(102 + 8), (byte)(39 + 64)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
                    NLoginCore_077.var_java_lang_String_arr_b[0] = NLoginCore_453.E("օվ֖֠ՠ֞֡֍֕պպի", (byte)103, 69);
                    NLoginCore_077.var_java_lang_String_arr_b[1] = NLoginCore_453.A("ǁƶƣƩƵǉƂƛƹƚƐƞƯƬƵǕǉƱƘǃǚǙƠơ", (byte)103, 65);
                    NLoginCore_077.var_java_lang_String_arr_b[2] = NLoginCore_173.D("ԿգՏՐԠԽդեզլԣԼ՞ՠԭՇղ՜ՓՕ՟ԮՅՐՒչ՗լղ՟Ւբ", (byte)103, 68);
                    NLoginCore_077.var_java_lang_String_arr_b[3] = NLoginCore_076.A("ƢǆƲƳƃƠǇǈǉǏƐƝƋǉǊǒǇƴǎƣǂǙƠơ", (byte)103, 65);
                    NLoginCore_077.var_java_lang_String_arr_b[4] = NLoginCore_138.F("քռ֑֒ս֑֎֛քատ֚֞֒բոփգ֮֘ռ֟նշ", (byte)103, 70);
                    NLoginCore_077.var_java_lang_String_arr_b[5] = NLoginCore_092.F("դժ֞ս֑֡պւ֝ծ՘֗տ֘֋֢֗֨֙ֈքֈֈղխփ֪֐կִղ֭֩֋չ֭նսָֺ֭֯ׄ֋", (byte)103, 70);
                    NLoginCore_077.var_java_lang_String_arr_b[6] = NLoginCore_387.A("ƮƦƻƼƧƻƸǅƮƋƫƍǂǎƼƒƓǗƶƋƬǉƠơ", (byte)103, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_077.var_java_lang_String_arr_b[0] = NLoginCore_446.E("֎ճպ֍խ֛՝ՠռ֥մ֢֓աՠչնֈֆփւչնշ", (byte)103, 69);
                    NLoginCore_077.var_java_lang_String_arr_b[1] = NLoginCore_384.D("՞ՓՀՆՒզԟԸՖԷԭեեԪԧՊԭԼեծՌՐԽԾ", (byte)103, 68);
                    NLoginCore_077.var_java_lang_String_arr_b[2] = NLoginCore_324.E("ո֜ֈ։ՙն֥֝֞֟՜յ֗֙զր֫֕֌֎֘խ֪֩կմճ֖֣֭֔ֆ֏֧֚֩֕ջׂ֖֚֟֯֋", (byte)103, 69);
                    NLoginCore_077.var_java_lang_String_arr_b[3] = NLoginCore_223.F("ո֜ֈ։ՙն֥֝֞֟զ֣֥յսջք֚֫շ֝։նշ", (byte)103, 70);
                    NLoginCore_077.var_java_lang_String_arr_b[4] = NLoginCore_173.D("ՋՃ՘ՙՄ՘ՕբՋԨՇԥԹԩԧդՑզխՌՃյըԺԱդմԹԱՐՑ՗", (byte)103, 68);
                    NLoginCore_077.var_java_lang_String_arr_b[5] = NLoginCore_427.B("ƎƔǈƧǋƻƤƬǇƘƂǁƩǂƵǁǌǒǃƲƮƲƲƜƗƭǔƺƙǞƜǓƥǥǅǜƷǕǛǫǍǪƸƵ", (byte)103, 66);
                    NLoginCore_077.var_java_lang_String_arr_b[6] = NLoginCore_453.D("ՋՃ՘ՙՄ՘ՕբՋԨՆԹՈկբՋԽ՟ԲդՌՅՁդԸՋՇՋխՐԾյ", (byte)103, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_077.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƝƛƿƪƲƺƕſƝƚƤƕ", (byte)103, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_077.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ԜԣեԸՓԵՉՕ՚խգԲ", (byte)103, 67);
                }
            }
        }
    }

    private static /* synthetic */ NLoginCore_077[] a() {
        NLoginCore_077[] NLoginCore_077Array = new NLoginCore_077[i];
        NLoginCore_077Array[NLoginCore_077.j] = var_com_nickuc_login_NLoginCore_077_a;
        NLoginCore_077Array[NLoginCore_077.k] = var_com_nickuc_login_NLoginCore_077_b;
        NLoginCore_077Array[NLoginCore_077.l] = var_com_nickuc_login_NLoginCore_077_c;
        NLoginCore_077Array[NLoginCore_077.m] = var_com_nickuc_login_NLoginCore_077_d;
        NLoginCore_077Array[NLoginCore_077.n] = var_com_nickuc_login_NLoginCore_077_e;
        NLoginCore_077Array[NLoginCore_077.o] = var_com_nickuc_login_NLoginCore_077_f;
        NLoginCore_077Array[NLoginCore_077.p] = var_com_nickuc_login_NLoginCore_077_g;
        return NLoginCore_077Array;
    }

    public static NLoginCore_077[] values() {
        return (NLoginCore_077[])var_com_nickuc_login_NLoginCore_077_arr_a.clone();
    }

    public boolean d(NLoginCore_077 NLoginCore_0772) {
        return (this.ordinal() > NLoginCore_0772.ordinal() ? var_int_g : h) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_077.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 69), NLoginCore_077.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.B("ĚħĦéĩĥĠĩĴģðĮĲīĮĴö҇Ғ҅҃ҎҁғѪ҂ҔѺ҇҇ҕĐ", (byte)28, 66) + string + NLoginCore_201.C("у", (byte)28, 67) + methodType.toString(), exception);
        }
    }
}

