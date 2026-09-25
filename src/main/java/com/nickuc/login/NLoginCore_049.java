/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Sound
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_409;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import com.nickuc.login.NLoginCore_016;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public class NLoginCore_049 {
    private static long bz;
    private static int x;
    private static int bu;
    private static int s;
    private static long bg;
    private static long cg;
    private static int au;
    private static int y;
    private static int aq;
    private static int cu;
    private static int by;
    private static int ce;
    private static long az;
    private static long cq;
    private static int var_int_b;
    @Nullable
    public static final Class<?> var_java_lang_Class____h;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_k;
    private static int bt;
    private static long u;
    private static int cy;
    private static long bv;
    private static int cw;
    @Nullable
    public static final Field var_java_lang_reflect_Field_e;
    private static int m;
    private static int bx;
    @Nullable
    public static final Method var_java_lang_reflect_Method_f;
    private static int cf;
    private static long bj;
    private static int ab;
    private static int cd;
    private static long an;
    private static int ci;
    @Nullable
    public static final Class<?> var_java_lang_Class____k;
    private static int var_int_h;
    private static int var_int_e;
    @Nullable
    public static final Class<?> var_java_lang_Class____i;
    private static int cm;
    private static int bi;
    private static long ax;
    private static long bs;
    private static int ao;
    private static int ay;
    private static long bm;
    private static int v;
    private static long t;
    private static long r;
    private static int z;
    private static long br;
    private static long var_long_f;
    private static int be;
    private static long cx;
    private static long var_long_d;
    private static int bd;
    private static int bp;
    public static final Method var_java_lang_reflect_Method_h;
    private static int bf;
    private static int bk;
    private static long ct;
    private static long ac;
    private static long ca;
    private static long as;
    private static int bc;
    private static long q;
    private static int bb;
    private static int cs;
    private static int at;
    private static int bl;
    private static int bq;
    private static int bh;
    private static long am;
    private static int cr;
    private static int cb;
    private static long cp;
    private static int ad;
    private static int p;
    private static int cv;
    private static int aw;
    private static int var_int_j;
    private static int ch;
    private static long bw;
    private static int cz;
    private static int cl;
    @Nullable
    public static final Field var_java_lang_reflect_Field_d;
    @Nullable
    public static final Class<?> var_java_lang_Class____j;
    private static int av;
    private static int cj;
    private static int ae;
    private static long ba;
    private static int var_int_a;
    private static long w;
    @Nullable
    public static final Method var_java_lang_reflect_Method_g;
    private static int co;
    private static int bo;
    private static int cn;
    private static int cc;
    private static int n;
    private static int ak;
    private static long var_long_g;
    private static int aa;
    private static int var_int_i;
    private static long ai;
    private static int al;
    private static String[] var_java_lang_String_arr_b;
    private static long ck;
    private static int ar;
    private static int o;
    private static int ag;
    private static long c;
    @Nullable
    public static final Class<?> var_java_lang_Class____l;
    private static int ah;
    private static long aj;
    private static long bn;
    private static int ap;
    private static int af;
    private static int var_int_l;

    private static String a(int n, long l) {
        l ^= 0x57L;
        l ^= 0x14E2741ECAA462B0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(11 + 58), (byte)(44 + 39), (byte)(26 + 21), (byte)(58 + 9), (byte)(39 + 27), (byte)(28 + 39), (byte)(21 + 26), (byte)(51 + 29), 75, (byte)(13 + 54), (byte)(42 + 41), (byte)(32 + 21), (byte)(8 + 72), (byte)(58 + 39), (byte)(68 + 32), (byte)(19 + 81), (byte)(33 + 72), (byte)(99 + 11), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.F("ՙզեԨըդ՟ըճբԯխձժխճԵࢽࢼࢲ࣌ࢮ࢟ࣃ࣒ࣖ", (byte)58, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_049.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static Class<?> a(Callable<Class<?>> callable, String ... stringArray) {
        Class<?> clazz = NLoginCore_049.a(stringArray);
        if (clazz != null) {
            return clazz;
        }
        try {
            return callable.call();
        }
        catch (Exception exception) {
            throw new RuntimeException((String)NLoginCore_049.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d) + (stringArray.length > 0 ? (String)NLoginCore_049.c("㺃", (int)var_int_e, (long)(var_long_f ^ var_long_g)) + stringArray[var_int_h] : Integer.valueOf(var_int_i)) + (String)NLoginCore_049.c("㺆", (int)var_int_j, (long)var_long_k), exception);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_049.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("ƑƳƵƕƹǘǐǦǒơǟǕǣǝƦǋǭǬǤǪǤƹ", (byte)117, 65), NLoginCore_049.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.C("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փ࣐ࣛࣚ࣪࣌ࢽࣰ࣡ࣴը", (byte)117, 67) + string + NLoginCore_027.D("Վ", (byte)117, 68) + methodType.toString(), exception);
        }
    }

    @Nullable
    public static Class<?> a(String ... stringArray) {
        for (int i = var_int_l; i < stringArray.length; ++i) {
            stringArray[i] = NLoginCore_016.i(stringArray[i]);
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = m; i < n; ++i) {
            String string = stringArray2[i];
            try {
                Class<?> clazz = NLoginCore_298.a(NLoginCore_016.i(string), new String[NLoginCore_049.n]);
                if (clazz == null) continue;
                return clazz;
            }
            catch (Throwable throwable) {
                NLoginCore_370.a(throwable);
            }
        }
        return null;
    }

    private static void b() {
        int n;
        c = -2336874101866007275L;
        long l = c ^ 0x14E2741ECAA462B0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(20 + 49), (byte)(6 + 77), (byte)(26 + 21), (byte)(28 + 39), (byte)(3 + 63), (byte)(42 + 25), (byte)(21 + 26), (byte)(44 + 36), (byte)(43 + 32), 67, (byte)(50 + 33), (byte)(10 + 43), (byte)(18 + 62), (byte)(8 + 89), (byte)(40 + 60), 100, (byte)(53 + 52), (byte)(72 + 38), (byte)(50 + 53)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_049.var_java_lang_String_arr_b[0] = NLoginCore_559.F("՟ր֚֒֕֬֩ցֳ֦֜ւծվ֐րծ֕ղ֩շմֲֲִַ֚֜֜֟֯֏֞׈֣֨֜׈֡ֈ֚֠֞֗", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[1] = NLoginCore_138.F("֝ջֈ֊փք֤էծհ֊շ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[2] = NLoginCore_027.F("ե֞֗֔ջ՟փ֧֪֤ւշ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[3] = NLoginCore_559.C("աԺ՗՚ոՃցէժրտ֏ձգ֓ֆզ֙ֆխ֑֘ծֈ֏֑֜ՠ֓շ֞զ", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[4] = NLoginCore_427.C("Ց՝վռ՛Մ՝ժ։ջՈ֌ժՎ՞֔֏գճ֐Ցղե֐է֓՞֏֜֔ձծ֙պ֡դ֡օփխ֋թչְղմւ֡ւ֤֢շղ֭մֵֈ֮֞ռׇֻׂ֔֝փփׂ֛׀ׇׂ֢֭֕׎֪֑׈֌ֶ֬֗׌ִ֢֯֡", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ƨƴǕǓƲƛƴǁǠǒƟǣǁƥƵǫǦƺǊǧƨƽưǔǢƷǖǋǸƱǻǚǊǍǬǏǜǑǜǄǆǄǴǟǹǪǵǼǢǧǛǜȈǋǣǶǎǎȍǤǓǨǼȞșȊȝǪǸȗǱȄȕȡȢǻǜȩȈǷȇǯȝǩȞȡǸǹ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[6] = NLoginCore_559.B("ƮǒƨǕǡƯƝǘǣǞƻƟƾƪǍǦǞƸǰǛǇƻƸƹ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[7] = NLoginCore_324.E("֛֝ւ֖բ֝պւ֢թծְִֵֶ֯յ֕շָչ֑֭֚֕֠֕֡տ֡տֵ֜րռׇ֧֖֛ֆ֞ג֎ׅ֒֋ׁׁׂ֤א׉֗כ֢֣", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[8] = NLoginCore_110.C("՜վ՛զբօֈՍիՙսգ՝ևՏրհՠ֋֋֗հ֐֘֏ջ֖֓՜ւեբ", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[9] = NLoginCore_324.A("ƐƯƚǋưƾǔǎƥƺǓƧƶƥƣǚƪǘǌƯǌƻƭǨǑǭǱǏǃƴǴǮ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[10] = NLoginCore_223.B("ƪǎǖƘƵƺǘǙưǛǄƠƨƿǄǠǘǊǭǎǧǪǳǡǍǘǁǆǐǱǗǭǮǸƾǱƽǫƼǃǛǙǇǍ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[11] = NLoginCore_223.E("ք֊֠շ֊֮չլ֌ից֦֣֯տִֹ֖֣֤֠֫ւփ", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[12] = NLoginCore_324.D("ռպայՁռՙացՈՍ֎֓֔֕֏ՔմՖ֗՘֎֑զՖ՗ս՝֑՚֍՝֐ջգռեռ֣֨շհ֣֑֯֋֣֤֟֯֔փ֍֪ցւ", (byte)115, 68);
                    NLoginCore_049.var_java_lang_String_arr_b[13] = NLoginCore_027.A("ǓǑƸǌƘǓưƸǘƟƤǥǪǫǬǦƫǋƭǮƯǥǨƽƭƮǔƴǨƱǤƴƼǓǙǉǖȂǍǶǿǯǀǅǈǿǌȉǆȃȐȇǲǫǘǙ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[14] = NLoginCore_451.E("֟և֣֓֝֟֊ե֪չֆօֲճրֵշ֮֏֖֝֗ևն֫֎֟չֿ֑֛֛", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[15] = NLoginCore_559.E("֛֝ւ֖բ֝պւ֢թծְִֵֶ֯յ֕շָչֲ֕տչշ֛֋֖տֵָ֢֣֚֜֕֡֩ֆְ֧֊֝֨֒׎הֳ֯ׄזֲַׇ֫׌אנמ֠׏ׇ֠", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[16] = NLoginCore_091.C("ռպայՁռՙացՈՍ֎֓֔֕֏ՔմՖ֗՘֑մ՞՘Ֆպժյ՞ց֔ճջէ֠֘֟֠ՠ֣֭ւռ֠վւְ֣֠֋ֹֺ֏ռֈյֹ֛մׂ֯ց֎ֶ֑֒֒ׄ֝׉֨օ֪֨ׄ׉ו֯֔׈֊׍ךִָ֢֡", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[17] = NLoginCore_384.B("ƳƾƞƱƳǃǀǠơƽǤƿǓǫǕƤǀǋǣǱƮƭǉǯǓǍǋƹǕƺǒǫ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[18] = NLoginCore_223.E("֛֝ւ֖բ֝պւ֢թծ֏֑֝֯֊ֶ֥֭ևְ֎պ֐֞֊֯սֵւ֕֕׆ׅ׈֝֋֣ֆֆ֩׉ֳ֪֒֋ְׇֿ֖֣֑֔כ֢֣", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[19] = NLoginCore_138.D("ռպայՁռՙացՈՍծհռ֎թ֌֕քզ֏խը֖վս֔֞ամ֦֐ց՞զյճ֩ն֛֣֎պ֣֌ְ֔քָփղ֗֍֪ցւ", (byte)115, 68);
                    NLoginCore_049.var_java_lang_String_arr_b[20] = NLoginCore_076.A("ǓǑƸǌƘǓưƸǘƟƤǅǇǓǥǀǣǬǛƽǦǂǕǒƶǨƶǤǈƷǸǗǪǌǠǺǳǫǍǳƾǃȃǆǢǖǣȎǹǰǨȎǱǛǘǙ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[21] = NLoginCore_092.A("ƽǝƖǊƻƺǝǛǕǙƹǩǈǬƿǭǃǄǯǛƺǋƸƹ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[22] = NLoginCore_453.B("ǌƧƾǂƝǕǜƮƢǝǞƭ", (byte)115, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_049.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ƕƶǈǋǐǢǟƷǜǒǩƸƤƴǆƶƤǋƨǟƭƪǨǨǐǪǒǭǒǕǥǅǼǑǵƿǲǺǃȃǒƿǲǍ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[1] = NLoginCore_384.F("֨ՠշգմֆ֨ց֤֡֓թ֥մֶ֯ժַ֨֎֒օւփ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ƵǕǋǗǟǎǂǎǡǗǦƭ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ƸƑƮƱǏƚǘƾǁǗǖǦǈƺǪǝƽǰǝǄǨǪǵƲǦưǣǢǈǒƷǫƷǨƶǕǓǀǍǸǸǶȆǍ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[4] = NLoginCore_091.D("Ց՝վռ՛Մ՝ժ։ջՈ֌ժՎ՞֔֏գճ֐Ցղե֐է֓՞֏֜֔ձծ֙պ֡դ֡օփխ֋թչְղմւ֡ւ֤֢շղ֭մֵֈ֮֞ռׇֻׂ֔֝փփׂ֛׀ׇׂ֢֮֕֐ֽׁׂ׍ְׂ׎֫֩טב׈ֺ֭֚֜־סלִ", (byte)115, 68);
                    NLoginCore_049.var_java_lang_String_arr_b[5] = NLoginCore_138.F("ղվ֟֝ռեվ֋֪֜թ֭֋կտְֵքֱ֔ղևպ֞֬ցׂ֠֕ջֶׅ֤֦֛֦֔֗֙֎֐֎־֩׃ִֿ׆ֱ֥֦֬ג֭֕׀֘֘חֲ֮֝׆רףהקִׂסֻ׎ן׫ׯֽֽתֵױאפ׭ִץת׌׼׎׹ׂםֻ؆׿צ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[6] = NLoginCore_138.F("ո֜ղ֟֫չէ֢֭֨քց֔րֳմ֤ցְִյ֫ւփ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[7] = NLoginCore_384.B("ǓǑƸǌƘǓưƸǘƟƤǥǪǫǬǦƫǋƭǮƯǣǋǐǖǋǗǇƵǗƵǫǒƶƲǽǝǌǑƼǔȈǆǔȆǿȆǦǻǮǰǤǣǫǘǙ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[8] = NLoginCore_092.F("ս֟ռևփ֦֩ծ֌պ֞քվ֨հ֑֡ցָ֬֬֋ְ֟֎ְֱּ֪֟տֻׂ֦֩֩վ֍ַָ֏׋֞֗", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[9] = NLoginCore_173.B("ƐƯƚǋưƾǔǎƥƺǓƧƶƥƣǚƪǘǌƯǌƼǪƬǲǏǲǰƳǪǳǙ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[10] = NLoginCore_384.A("ƪǎǖƘƵƺǘǙưǛǄƠƨƿǄǠǘǊǭǎǧǪǳǡǍǘǁǆǐǱǗǭƼǹǛǸǘǟǬȀƽǤǤǍ", (byte)115, 65);
                    NLoginCore_049.var_java_lang_String_arr_b[11] = NLoginCore_138.D("գթտՖթ֍՘ՋիՊՠսճ֏էելթգ՗՗դաբ", (byte)115, 68);
                    NLoginCore_049.var_java_lang_String_arr_b[12] = NLoginCore_559.D("ռպայՁռՙացՈՍ֎֓֔֕֏ՔմՖ֗՘֎֑զՖ՗ս՝֑՚֍՝֐ջգռեռ֣֨շհֱղսքլխֳֺ֖ւִոֶ֋ֵׂ֮֠֝տ֦ս", (byte)115, 68);
                    NLoginCore_049.var_java_lang_String_arr_b[13] = NLoginCore_027.F("֛֝ւ֖բ֝պւ֢թծְִֵֶ֯յ֕շָչֲ֯ևշո֞վֲջ֮վֆ֣֝֓֠׌֗׀׉ֹ֌ׄגֲא׃ח֐ֱ֭֔׊ן֩֟׌כׁ֖ך֞י", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[14] = NLoginCore_138.C("վզւղռվթՄ։՘եդ֑Ւ՟֔Ֆ֍ծյռջև֋֞֌֍֟ս֏չտ", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[15] = NLoginCore_453.F("֛֝ւ֖բ֝պւ֢թծְִֵֶ֯յ֕շָչֲ֕տչշ֛֋֖տֵָ֢֣֚֜֕֡֩ֆְ֧֊֝֨֒׎הֳ֯ׄזֶַֹ֘֗נִ֢֭ז׎ל", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[16] = NLoginCore_223.C("ռպայՁռՙացՈՍ֎֓֔֕֏ՔմՖ֗՘֑մ՞՘Ֆպժյ՞ց֔ճջէ֠֘֟֠ՠ֣֭ւռ֠վւְ֣֠֋ֹֺ֏ռֈյֹ֛մׂ֯ց֎ֶ֑֒֒ׄ֝׉֨օ֪֨ב֢ׅ֍֪׃ד֣֔׍֤֢֡", (byte)115, 67);
                    NLoginCore_049.var_java_lang_String_arr_b[17] = NLoginCore_076.F("սֈըջս֍֊֪իև֮։ֵ֝֟ծ֊ֻ֭֕ոս֏֎֑ց֔ս֖֯֔վֱֹׁ֠׉ׇֹ֫א։։֗", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ǓǑƸǌƘǓưƸǘƟƤǅǇǓǥǀǣǬǛƽǦǄưǆǔǀǥƳǫƸǋǋǼǻǾǓǁǙƼƼǟǿƾǠƼǊȇǪȈǅǦȏǧǫǘǙ", (byte)115, 66);
                    NLoginCore_049.var_java_lang_String_arr_b[19] = NLoginCore_076.E("֛֝ւ֖բ֝պւ֢թծ֏֑֝֯֊ֶ֥֭ևְ֎։ֵַֿ֟֞ւֱׇ֢֕տև֖֔׊ּ֚֗ׄ֯׋֦׋׃֢֨ך֥֖֙׋֢֣", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[20] = NLoginCore_451.E("֛֝ւ֖բ֝պւ֢թծ֏֑֝֯֊ֶ֥֭ևְ֌֟֜րֲր֮֒ցִֵֽֽׂ֖֪֡ׄ֗ֈ֍׎ׇ֢֮֡׍׏֑֮׃א׏ך׋ַֽ־ְ֢וֶמ", (byte)115, 69);
                    NLoginCore_049.var_java_lang_String_arr_b[21] = NLoginCore_138.F("և֧ՠ֔օք֧֥֣֟օեվկֵֶ֯֯֏֪ղ֕ւփ", (byte)115, 70);
                    NLoginCore_049.var_java_lang_String_arr_b[22] = NLoginCore_384.B("ƔƜǀƞǝƮǑƴǥƦǝƛǈǊǨƥǌǰǯǑǤǡƸƹ", (byte)115, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_049.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ǒǎǓƼƺǚƭǗǎǣǁǂƧǞǩƺǏǰƫǁǦǧǡǒưǏǣǵǅƳǐǬ", (byte)115, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_049.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ձ֤֓֫ըի֞֗խֱ֣֪֝ֆխև֓օֻ֧֭֗ւփ", (byte)115, 70);
                }
            }
        }
    }

    static {
        Method method;
        Class<?> clazz;
        Class<?> clazz2;
        var_int_a = (0 >>> 238 | 0 << -238) & 0xFFFFFFFF;
        var_int_b = -1 >>> 151 | -1 << ~151 + 1;
        var_long_d = Long.reverse(4805040211711199739L);
        var_int_e = (64 >>> 70 | 64 << ~70 + 1) & 0xFFFFFFFF;
        var_long_f = Long.reverse(-6291829270129702405L);
        var_long_g = Long.reverse(-1585267068834414592L);
        var_int_h = 0 >>> 215 | 0 << -215;
        var_int_i = Integer.reverse(0);
        var_int_j = Integer.reverse(0x40000000);
        var_long_k = Long.reverse(4805040211711199739L);
        var_int_l = (0 >>> 142 | 0 << ~142 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0);
        n = Integer.reverse(0);
        o = 0 >>> 17 | 0 << -17;
        p = 98304 >>> 47 | 98304 << ~47 + 1;
        q = Long.reverse(-6291829270129702405L);
        r = Long.reverse(-1585267068834414592L);
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-6291829270129702405L);
        u = Long.reverse(-1585267068834414592L);
        v = 81920 >>> 14 | 81920 << ~14 + 1;
        w = Long.reverse(4805040211711199739L);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = 0 >>> 209 | 0 << ~209 + 1;
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = 0 >>> 240 | 0 << -240;
        ab = (6 >>> 64 | 6 << ~64 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(4805040211711199739L);
        ad = Integer.reverse(-402653184);
        ae = Integer.reverse(-402653184);
        af = Integer.reverse(0x40000000);
        ag = Integer.reverse(0);
        ah = Integer.reverse(-536870912);
        ai = Long.reverse(-6291829270129702405L);
        aj = Long.reverse(-1585267068834414592L);
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = 0x10000000 >>> 249 | 0x10000000 << ~249 + 1;
        am = Long.reverse(-6291829270129702405L);
        an = Long.reverse(-1585267068834414592L);
        ao = (16384 >>> 110 | 16384 << ~110 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(0);
        aq = 18432 >>> 235 | 18432 << ~235 + 1;
        ar = Integer.reverse(-1);
        as = Long.reverse(4805040211711199739L);
        at = 0x4000000 >>> 26 | 0x4000000 << -26;
        au = 0 >>> 182 | 0 << ~182 + 1;
        av = Integer.reverse(0x50000000);
        aw = -1 >>> 7 | -1 << -7;
        ax = Long.reverse(4805040211711199739L);
        ay = (0x2C0000 >>> 210 | 0x2C0000 << ~210 + 1) & 0xFFFFFFFF;
        az = Long.reverse(-6291829270129702405L);
        ba = Long.reverse(-1585267068834414592L);
        bb = (0 >>> 158 | 0 << ~158 + 1) & 0xFFFFFFFF;
        bc = (12288 >>> 236 | 12288 << ~236 + 1) & 0xFFFFFFFF;
        bd = Integer.reverse(0);
        be = 6 >>> 223 | 6 << ~223 + 1;
        bf = (-1 >>> 216 | -1 << ~216 + 1) & 0xFFFFFFFF;
        bg = Long.reverse(4805040211711199739L);
        bh = 32 >>> 197 | 32 << -197;
        bi = Integer.reverse(-1342177280);
        bj = Long.reverse(4805040211711199739L);
        bk = (0x100000 >>> 147 | 0x100000 << ~147 + 1) & 0xFFFFFFFF;
        bl = Integer.reverse(0x70000000);
        bm = Long.reverse(-6291829270129702405L);
        bn = Long.reverse(-1585267068834414592L);
        bo = (49152 >>> 142 | 49152 << -142) & 0xFFFFFFFF;
        bp = Integer.reverse(0);
        bq = Integer.reverse(-268435456);
        br = Long.reverse(-6291829270129702405L);
        bs = Long.reverse(-1585267068834414592L);
        bt = 0x200000 >>> 117 | 0x200000 << -117;
        bu = Integer.reverse(0x8000000);
        bv = Long.reverse(-6291829270129702405L);
        bw = Long.reverse(-1585267068834414592L);
        bx = Integer.reverse(0x40000000);
        by = Integer.reverse(-2013265920);
        bz = Long.reverse(-6291829270129702405L);
        ca = Long.reverse(-1585267068834414592L);
        cb = Integer.reverse(0);
        cc = (2048 >>> 234 | 2048 << -234) & 0xFFFFFFFF;
        cd = Integer.reverse(0);
        ce = Integer.reverse(0x48000000);
        cf = Integer.reverse(-1);
        cg = Long.reverse(4805040211711199739L);
        ch = Integer.reverse(Integer.MIN_VALUE);
        ci = Integer.reverse(-939524096);
        cj = -1 >>> 220 | -1 << ~220 + 1;
        ck = Long.reverse(4805040211711199739L);
        cl = Integer.reverse(0);
        cm = Integer.reverse(0x40000000);
        cn = Integer.reverse(0);
        co = (0xA00000 >>> 115 | 0xA00000 << -115) & 0xFFFFFFFF;
        cp = Long.reverse(-6291829270129702405L);
        cq = Long.reverse(-1585267068834414592L);
        cr = (0x400000 >>> 150 | 0x400000 << -150) & 0xFFFFFFFF;
        cs = Integer.reverse(-1476395008);
        ct = Long.reverse(4805040211711199739L);
        cu = Integer.reverse(Integer.MIN_VALUE);
        cv = (0 >>> 111 | 0 << ~111 + 1) & 0xFFFFFFFF;
        cw = Integer.reverse(0x68000000);
        cx = Long.reverse(4805040211711199739L);
        cy = 16 >>> 36 | 16 << ~36 + 1;
        cz = (0 >>> 157 | 0 << -157) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_049.b();
        String[] stringArray = new String[af];
        stringArray[NLoginCore_049.ag] = NLoginCore_049.c("㺀", (int)ah, (long)(ai ^ aj));
        stringArray[NLoginCore_049.ak] = NLoginCore_049.c("㺃", (int)al, (long)(am ^ an));
        var_java_lang_Class____h = NLoginCore_049.a(stringArray);
        String[] stringArray2 = new String[ao];
        stringArray2[NLoginCore_049.ap] = NLoginCore_049.c("㺆", (int)(aq & ar), (long)as);
        var_java_lang_Class____i = NLoginCore_049.a(stringArray2);
        String[] stringArray3 = new String[at];
        stringArray3[NLoginCore_049.au] = NLoginCore_049.c("㺉", (int)(av & aw), (long)ax);
        var_int_j = (int)NLoginCore_049.a(stringArray3);
        var_java_lang_reflect_Method_f = var_int_j != null ? NLoginCore_546.a(var_int_j, (String)NLoginCore_049.c("㺌", (int)ay, (long)(az ^ ba)), new Class[bb]) : null;
        String[] stringArray4 = new String[bc];
        stringArray4[NLoginCore_049.bd] = NLoginCore_049.c("㺏", (int)(be & bf), (long)bg);
        stringArray4[NLoginCore_049.bh] = NLoginCore_049.c("㺒", (int)bi, (long)bj);
        stringArray4[NLoginCore_049.bk] = NLoginCore_049.c("㺕", (int)bl, (long)(bm ^ bn));
        var_long_k = (long)NLoginCore_049.a(() -> var_java_lang_reflect_Method_f != null ? var_java_lang_reflect_Method_f.getReturnType() : null, stringArray4);
        String[] stringArray5 = new String[bo];
        stringArray5[NLoginCore_049.bp] = NLoginCore_049.c("㺘", (int)bq, (long)(br ^ bs));
        stringArray5[NLoginCore_049.bt] = NLoginCore_049.c("㺛", (int)bu, (long)(bv ^ bw));
        stringArray5[NLoginCore_049.bx] = NLoginCore_049.c("㺞", (int)by, (long)(bz ^ ca));
        var_java_lang_Class____l = NLoginCore_049.a(() -> var_long_k != null ? (Class)Arrays.stream(var_long_k.getDeclaredFields()).map(Field::getType).filter(clazz -> clazz.getSimpleName().contains((CharSequence)NLoginCore_049.c("㺀", (int)ab, (long)ac))).findFirst().orElse(null) : null, stringArray5);
        Field field = var_java_lang_reflect_Field_d = var_long_k != null && var_java_lang_Class____l != null ? NLoginCore_546.a(var_long_k, var_java_lang_Class____l, cb) : null;
        if (NLoginCore_409.a().a(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_i) && var_java_lang_Class____l != null) {
            String[] stringArray6 = new String[cc];
            stringArray6[NLoginCore_049.cd] = NLoginCore_049.c("㺡", (int)(ce & cf), (long)cg);
            stringArray6[NLoginCore_049.ch] = NLoginCore_049.c("㺤", (int)(ci & cj), (long)ck);
            clazz2 = NLoginCore_049.a(stringArray6);
            var_java_lang_reflect_Field_e = NLoginCore_546.a(var_java_lang_Class____l, clazz2, cl);
            clazz = clazz2;
        } else {
            var_java_lang_reflect_Field_e = null;
            clazz = var_java_lang_Class____l;
        }
        String[] stringArray7 = new String[cm];
        stringArray7[NLoginCore_049.cn] = NLoginCore_049.c("㺧", (int)co, (long)(cp ^ cq));
        stringArray7[NLoginCore_049.cr] = NLoginCore_049.c("㺪", (int)cs, (long)ct);
        clazz2 = NLoginCore_049.a(stringArray7);
        if (clazz2 != null && clazz != null) {
            Class[] classArray = new Class[cu];
            classArray[NLoginCore_049.cv] = clazz2;
            method = NLoginCore_546.a(clazz, null, Void.TYPE, classArray);
        } else {
            method = null;
        }
        var_java_lang_reflect_Method_g = method;
        Class[] classArray = new Class[cy];
        classArray[NLoginCore_049.cz] = String.class;
        var_java_lang_reflect_Method_h = NLoginCore_546.a(Sound.class, (String)NLoginCore_049.c("㺭", (int)cw, (long)cx), classArray);
    }

    @Nullable
    public static Object a(Player player) {
        return var_java_lang_reflect_Method_f != null ? NLoginCore_546.a(var_java_lang_reflect_Method_f, (Object)player, new Object[o]) : null;
    }

    public static void ae() {
    }

    public static void a(Player player, Object object) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_049.c("㺀", (int)p, (long)(q ^ r)));
        }
        if (var_java_lang_reflect_Field_d == null) {
            throw new IllegalArgumentException((String)NLoginCore_049.c("㺃", (int)s, (long)(t ^ u)));
        }
        if (var_java_lang_reflect_Field_e == null) {
            throw new IllegalArgumentException((String)NLoginCore_049.c("㺆", (int)v, (long)w));
        }
        Object object2 = NLoginCore_049.a(player);
        if (object2 == null) {
            return;
        }
        Object object3 = var_java_lang_reflect_Field_d.get(object2);
        if (NLoginCore_409.a().a(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_i)) {
            Object object4 = var_java_lang_reflect_Field_e.get(object3);
            Object[] objectArray = new Object[x];
            objectArray[NLoginCore_049.y] = object;
            NLoginCore_546.a(var_java_lang_reflect_Method_g, object4, objectArray);
        } else {
            Object[] objectArray = new Object[z];
            objectArray[NLoginCore_049.aa] = object;
            NLoginCore_546.a(var_java_lang_reflect_Method_g, object3, objectArray);
        }
    }
}

