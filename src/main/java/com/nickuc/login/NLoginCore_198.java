/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_198
extends Enum<NLoginCore_198> {
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_a;
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_b;
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_c;
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_d;
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_e;
    public static final /* enum */ NLoginCore_198 var_com_nickuc_login_NLoginCore_198_f;
    private final char[] var_char_arr_a;
    private static final /* synthetic */ NLoginCore_198[] var_com_nickuc_login_NLoginCore_198_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static long k;
    private static int l;
    private static int m;
    private static int n;
    private static long o;
    private static int p;
    private static int q;
    private static long r;
    private static int s;
    private static int t;
    private static long u;
    private static long v;
    private static int w;
    private static long x;
    private static long y;
    private static int z;
    private static int aa;
    private static long ab;
    private static long ac;
    private static int ad;
    private static long ae;
    private static long af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static int ak;
    private static long al;
    private static long am;
    private static int an;
    private static int ao;
    private static int ap;
    private static long aq;
    private static int ar;
    private static long as;
    private static long at;
    private static int au;
    private static int av;
    private static int aw;
    private static long ax;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_198.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ŧƉƋūƏƮƦƼƨŷƵƫƹƳżơǃǂƺǀƺƏ", (byte)96, 66), NLoginCore_198.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("տ֌֋Վ֎֊օ֎֙ֈՕ֓֗֐֓֙՛ࣲࣩࣟࣴࣄࣹࣶࣷࣧ࣫࣠ࣛࣙ࣢ࣿն", (byte)96, 69) + string + NLoginCore_384.E("Ֆ", (byte)96, 69) + methodType.toString(), exception);
        }
    }

    private NLoginCore_198(String string2) {
        this.var_char_arr_a = string2.toCharArray();
    }

    private static void b() {
        int n;
        var_long_c = 2474465525081767308L;
        long l = var_long_c ^ 0x5EB15ABFD4AC211L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(22 + 47), (byte)(49 + 34), (byte)(9 + 38), (byte)(47 + 20), (byte)(9 + 57), 67, (byte)(44 + 3), (byte)(50 + 30), (byte)(10 + 65), (byte)(12 + 55), (byte)(67 + 16), (byte)(39 + 14), (byte)(37 + 43), (byte)(71 + 26), (byte)(60 + 40), 100, (byte)(90 + 15), (byte)(8 + 102), (byte)(23 + 80)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_198.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ք՚֒֔ծհ֖՛֏֊տը", (byte)121, 68);
                    NLoginCore_198.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǴǗǦǽǷȎǭǣǊȌǨǙ", (byte)121, 66);
                    NLoginCore_198.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ƨǕǣƵǛǇƯƫƲǨǔƹ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[3] = NLoginCore_110.F("զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡׌ֽ׌ׂ֣֧֞֔׉ָ֭֝", (byte)121, 70);
                    NLoginCore_198.var_java_lang_String_arr_b[4] = NLoginCore_091.A("ƳǀƞƷƹǤƿǟƩǰǦǂǡƮǆƳǨƶǼǅǿǗǄǅ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[5] = NLoginCore_110.F("֩֫֬տղ֝֏խ֩օկְְֲֶֽ֤֤֣֭֜պքָ֤֣֝ֈցָ֖֠֙אּ׆֏֨׌ֽדזדֹׄ׆֛׈מ֨׀֜אִ֬׀ו־֧ס׆םַפ׮׬ֿ׉׉ץפתה״׈ֽ", (byte)121, 70);
                    NLoginCore_198.var_java_lang_String_arr_b[6] = NLoginCore_324.B("ǡǋƶƾǮƿǑǤƭƲƽǉǏǶǐǯƲǺǆǦǉǇǄǅ", (byte)121, 66);
                    NLoginCore_198.var_java_lang_String_arr_b[7] = NLoginCore_384.D("֖֔֗ժ՝ֈպ՘֔հ՚֏֏֛֨֝֡֘և֛֎եկ֏ֈ֣֎ճլ֋֣ցքփֶ֝ոָֹ֞ջֵֹׅ֧֚֜ցֿևփփև֦֓֔", (byte)121, 68);
                    NLoginCore_198.var_java_lang_String_arr_b[8] = NLoginCore_223.E("֋֎֤ևֱ֥֞֔ֈֶֶս", (byte)121, 69);
                    NLoginCore_198.var_java_lang_String_arr_b[9] = NLoginCore_027.A("ƩǢǠǫǮǋǝǪǨǥǵǐƳǈǍƱǙƺǏƼǾǇǄǅ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[10] = NLoginCore_201.E("շքբջս֨փ֣խִֵ֛֭֕մ֎ֹո֯֏պְ֚֐ֵָֺּׁ֚֡֞", (byte)121, 69);
                    NLoginCore_198.var_java_lang_String_arr_b[11] = NLoginCore_387.E("զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡ֈֈ׀ֳ֟ה֍ֶ֦׎֤׈חִ֔׌ֻ׀־֠אד׃֛֦י֧צִו־פֽ֠֫ׄלץדהנשץ֫׆׭ֳָ׼׸ר׾׳؁׈׉", (byte)121, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_198.var_java_lang_String_arr_b[0] = NLoginCore_027.E("֩օփ֒֏֞ևփքֱֵ֓֡֘֏օ֐֐־ֱֳ֩ֈ։", (byte)121, 69);
                    NLoginCore_198.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǵȂǆǆǙǦȇǪȄǢǜǙ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[2] = NLoginCore_092.C("պգ֏ջՙֈկ֏ձ֟ՠկ֚֡֗ււըմըռ֬ճմ", (byte)121, 67);
                    NLoginCore_198.var_java_lang_String_arr_b[3] = NLoginCore_138.E("զօժջխլְ֦֩քֲշַջ։ֺմֲ֔֝֬ռ֏ւ֣վֆׂ֛֣֩֡ր֍ֺ֎ג֋׊ׅג֫֨֝", (byte)121, 69);
                    NLoginCore_198.var_java_lang_String_arr_b[4] = NLoginCore_559.C("բկՍզը֓ծ֎՘֢֟֘հրօ֥֦֪֨և֣֟վո֯ժ֢֮֊ֱ֥֒", (byte)121, 67);
                    NLoginCore_198.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǕȌǸȂǋǤȈǹȏȒȏǵȀȂǗȄȚǤǼǘȌǰǨǼȑǺǣȝȂșǳȠǜȘșȢȤȯȐǯǱǬǦȟȞȋȳȦȍȖǲȲȇȽȄȅ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[6] = NLoginCore_559.E("֥֏պւֲփ֕֨ձնր֐լ֦֍֥չ֚֗֕֊վռְׅ֕֐ֆֻ׌֙׋", (byte)121, 69);
                    NLoginCore_198.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ǥǧǨƻƮǙǋƩǥǁƫǠǠǬǹǮǲǩǘǬǟƶǀǠǙǴǟǄƽǜǴǒǕǔȇǮǉȉǯȊǌǭȋǤȃȅȃȌȇǑǴǭǔȍǤǥ", (byte)121, 65);
                    NLoginCore_198.var_java_lang_String_arr_b[8] = NLoginCore_004.D("ե֛կթ՛կ֜մ֊ն֒ռ֖՞֦֒մ֔շն֤֬ճմ", (byte)121, 68);
                    NLoginCore_198.var_java_lang_String_arr_b[9] = NLoginCore_138.F("խֲ֦֤֯֏ַ֮֡֬֩յְָղ֛շձַ֮֟֋ֈ։", (byte)121, 70);
                    NLoginCore_198.var_java_lang_String_arr_b[10] = NLoginCore_451.D("բկՍզը֓ծ֎՘֟֘֠ֆր՟չ֤գ֚պե֌֝֩ըռ֓կ։֥֫֏ֳճ֥֐ֆյվ֕֐ְ֣ֈ", (byte)121, 68);
                    NLoginCore_198.var_java_lang_String_arr_b[11] = NLoginCore_138.C("ՑհՕզ՘՗֛֑֔կ֝բ֢զմ֥՟֝տֈ֗էպխ֎թձֆ֎֭֔֌ճճ֫֊ֿ֞ոֹ֑֡֏ֳׂտַ֦֟֫֩֋ֻ־֮ֆ֑ׄ֒ב֟׀֩׏֋ׇ֖֨֯א־ֿ׋ה׏ֱ׍ְ֧הדנצ׈ֵ֭ר׋׬עׇוׂ֫הש", (byte)121, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_198.var_java_lang_String_arr_b[0] = NLoginCore_091.F("և֨օ։֪֍֜փ֥֣֫֐ִ֤֛֖֐ռֳׁ֠֝ֈ։", (byte)121, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_198.var_java_lang_String_arr_b[0] = NLoginCore_091.D("Ջ֌ճ՛֞ռ՟լ֊նռկկռ՞ռ֝ս֟րթնճմ", (byte)121, 68);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0x60000000);
        var_int_b = Integer.reverse(0);
        var_int_c = 0x40000000 >>> 222 | 0x40000000 << -222;
        var_int_d = Integer.reverse(0x40000000);
        var_int_e = Integer.reverse(-1073741824);
        var_int_f = (0x400000 >>> 148 | 0x400000 << ~148 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(-1610612736);
        h = 1536 >>> 7 | 1536 << ~7 + 1;
        i = Integer.reverse(0x30000000);
        j = Integer.reverse(0);
        k = Long.reverse(-9097465967909737916L);
        l = (0 >>> 128 | 0 << -128) & 0xFFFFFFFF;
        m = 4096 >>> 140 | 4096 << -140;
        n = (-1 >>> 174 | -1 << ~174 + 1) & 0xFFFFFFFF;
        o = Long.reverse(-9097465967909737916L);
        p = Integer.reverse(0x40000000);
        q = (-1 >>> 246 | -1 << ~246 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-9097465967909737916L);
        s = Integer.reverse(Integer.MIN_VALUE);
        t = Integer.reverse(-1073741824);
        u = Long.reverse(3584670582765578820L);
        v = Long.reverse(-5764607523034234880L);
        w = Integer.reverse(0x20000000);
        x = Long.reverse(3584670582765578820L);
        y = Long.reverse(-5764607523034234880L);
        z = Integer.reverse(0x40000000);
        aa = Integer.reverse(-1610612736);
        ab = Long.reverse(3584670582765578820L);
        ac = Long.reverse(-5764607523034234880L);
        ad = Integer.reverse(0x60000000);
        ae = Long.reverse(3584670582765578820L);
        af = Long.reverse(-5764607523034234880L);
        ag = Integer.reverse(-1073741824);
        ah = Integer.reverse(-536870912);
        ai = Integer.reverse(-1);
        aj = Long.reverse(-9097465967909737916L);
        ak = 1 >>> 221 | 1 << -221;
        al = Long.reverse(3584670582765578820L);
        am = Long.reverse(-5764607523034234880L);
        an = Integer.reverse(0x20000000);
        ao = (9216 >>> 170 | 9216 << ~170 + 1) & 0xFFFFFFFF;
        ap = (-1 >>> 137 | -1 << -137) & 0xFFFFFFFF;
        aq = Long.reverse(-9097465967909737916L);
        ar = Integer.reverse(0x50000000);
        as = Long.reverse(3584670582765578820L);
        at = Long.reverse(-5764607523034234880L);
        au = Integer.reverse(-1610612736);
        av = (0x580000 >>> 211 | 0x580000 << ~211 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(-1);
        ax = Long.reverse(-9097465967909737916L);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_198.b();
        var_com_nickuc_login_NLoginCore_198_a = new NLoginCore_198((String)NLoginCore_198.c("㺃", (int)(m & n), (long)o));
        var_com_nickuc_login_NLoginCore_198_b = new NLoginCore_198((String)NLoginCore_198.c("㺉", (int)t, (long)(u ^ v)));
        var_com_nickuc_login_NLoginCore_198_c = new NLoginCore_198((String)NLoginCore_198.c("㺏", (int)aa, (long)(ab ^ ac)));
        var_com_nickuc_login_NLoginCore_198_d = new NLoginCore_198((String)NLoginCore_198.c("㺕", (int)(ah & ai), (long)aj));
        var_com_nickuc_login_NLoginCore_198_e = new NLoginCore_198((String)NLoginCore_198.c("㺛", (int)(ao & ap), (long)aq));
        var_com_nickuc_login_NLoginCore_198_f = new NLoginCore_198((String)NLoginCore_198.c("㺡", (int)(av & aw), (long)ax));
        var_com_nickuc_login_NLoginCore_198_arr_a = NLoginCore_198.a();
    }

    public static NLoginCore_198 valueOf(String string) {
        return Enum.valueOf(NLoginCore_198.class, string);
    }

    private static /* synthetic */ NLoginCore_198[] a() {
        NLoginCore_198[] NLoginCore_198Array = new NLoginCore_198[var_int_a];
        NLoginCore_198Array[NLoginCore_198.var_int_b] = var_com_nickuc_login_NLoginCore_198_a;
        NLoginCore_198Array[NLoginCore_198.var_int_c] = var_com_nickuc_login_NLoginCore_198_b;
        NLoginCore_198Array[NLoginCore_198.var_int_d] = var_com_nickuc_login_NLoginCore_198_c;
        NLoginCore_198Array[NLoginCore_198.var_int_e] = var_com_nickuc_login_NLoginCore_198_d;
        NLoginCore_198Array[NLoginCore_198.var_int_f] = var_com_nickuc_login_NLoginCore_198_e;
        NLoginCore_198Array[NLoginCore_198.g] = var_com_nickuc_login_NLoginCore_198_f;
        return NLoginCore_198Array;
    }

    static /* synthetic */ char[] a(NLoginCore_198 NLoginCore_1982) {
        return NLoginCore_1982.var_char_arr_a;
    }

    private static String a(int n, long l) {
        l ^= 0xDL;
        l ^= 0x5EB15ABFD4AC211L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(45 + 24), (byte)(49 + 34), (byte)(19 + 28), (byte)(42 + 25), (byte)(31 + 35), (byte)(64 + 3), (byte)(29 + 18), (byte)(20 + 60), (byte)(50 + 25), (byte)(32 + 35), (byte)(42 + 41), (byte)(44 + 9), (byte)(20 + 60), (byte)(76 + 21), (byte)(16 + 84), (byte)(39 + 61), (byte)(22 + 83), 110, 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("֓֠֟բ֢֢֭֞֙֜թ֧֤֧֭֫կࣳࣽईआࣘऋऍࣻࣿऊ࣯࣭ࣶࣴओ", (byte)116, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_198.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_198[] values() {
        return (NLoginCore_198[])var_com_nickuc_login_NLoginCore_198_arr_a.clone();
    }
}

