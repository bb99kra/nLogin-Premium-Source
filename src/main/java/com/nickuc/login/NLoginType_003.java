/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.AccountType
 *  com.nickuc.login.api.types.AccountData
 *  com.nickuc.login.api.types.AccountDataImpl
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_003
implements NLoginInterface_019<AccountData> {
    private static long ag;
    private static int n;
    private static int t;
    private static int o;
    private static int y;
    private static int ah;
    private static int bf;
    private static long aw;
    private static long ao;
    private static int var_int_c;
    private static int bd;
    private static long u;
    private static int var_int_a;
    private static long aj;
    private static long am;
    private static int bb;
    private static long ar;
    private final Field[] var_java_lang_reflect_Field_arr_a = AccountDataImpl.class.getDeclaredFields();
    private static long d;
    private static long al;
    private static int bh;
    private static String[] var_java_lang_String_arr_a;
    private static int ax;
    private static int ba;
    private static long bi;
    private static int p;
    private final Constructor<?> var_java_lang_reflect_Constructor____a;
    private static int br;
    private static long i;
    private static long be;
    private static int bm;
    private static long var_long_c;
    private static int ae;
    private static int e;
    private static long bl;
    private static long bg;
    private static int var_int_b;
    private static long av;
    private static int ak;
    private static int bk;
    private static int m;
    private static int at;
    private static int ab;
    private static long ap;
    private static long x;
    private static int w;
    private static int bo;
    private static int r;
    private static long ad;
    private static long aa;
    private static int v;
    private static long g;
    private static long as;
    private static long bn;
    private static int ay;
    private static long af;
    private static int h;
    private static long bp;
    private static long l;
    private static int z;
    private static long ai;
    private static int j;
    private static long f;
    private static int q;
    private static String[] var_java_lang_String_arr_b;
    private static int aq;
    private static int an;
    private static long bc;
    public static NLoginType_003 var_com_nickuc_login_NLoginType_003_a;
    private static long az;
    private static long ac;
    private static long k;
    private static int au;
    private static int s;
    private static int bq;
    private static int bj;

    @Override
    public AccountData a(@Nonnull JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginType_003.c("㺀", (int)aq, (long)(ar ^ as)));
        Object[] objectArray = new Object[jSONArray.length()];
        block9: for (int i = at; i < objectArray.length; ++i) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (!jSONObject2.has((String)NLoginType_003.c("㺃", (int)au, (long)(av ^ aw)))) continue;
            int n = jSONObject2.getInt((String)NLoginType_003.c("㺆", (int)(ax & ay), (long)az));
            switch (n) {
                case 0: 
                case 2: {
                    objectArray[i] = jSONObject2.get((String)NLoginType_003.c("㺉", (int)(ba & bb), (long)bc));
                    continue block9;
                }
                case 3: {
                    objectArray[i] = jSONObject2.getLong((String)NLoginType_003.c("㺌", (int)bd, (long)be));
                    continue block9;
                }
                case 4: {
                    objectArray[i] = jSONObject2.getJSONObject((String)NLoginType_003.c("㺏", (int)bf, (long)bg)).toMap();
                    continue block9;
                }
                case 5: {
                    objectArray[i] = jSONObject2.getEnum(AccountType.class, (String)NLoginType_003.c("㺒", (int)bh, (long)bi));
                    continue block9;
                }
                case 1: {
                    objectArray[i] = UUID.fromString((String)jSONObject2.get((String)NLoginType_003.c("㺕", (int)(bj & bk), (long)bl)));
                }
            }
        }
        try {
            return (AccountData)this.var_int_a.newInstance(objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginType_003.c("㺘", (int)bm, (long)bn) + AccountData.class.getCanonicalName() + (String)NLoginType_003.c("㺛", (int)bo, (long)bp), reflectiveOperationException);
        }
    }

    public NLoginType_003() {
        AnnotatedElement[] annotatedElementArray = this.var_java_lang_reflect_Field_arr_a;
        int n = annotatedElementArray.length;
        for (int i = var_int_a; i < n; ++i) {
            Field field = annotatedElementArray[i];
            field.setAccessible(var_int_b != 0);
        }
        try {
            annotatedElementArray = (Class[])Arrays.stream(this.var_java_lang_reflect_Field_arr_a).map(Field::getType).toArray(Class[]::new);
            this.var_int_a = (int)AccountDataImpl.class.getConstructor((Class<?>[])annotatedElementArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException((String)NLoginType_003.c("㺀", (int)var_int_c, (long)d) + AccountDataImpl.class.getCanonicalName() + (String)NLoginType_003.c("㺃", (int)e, (long)(f ^ g)), noSuchMethodException);
        }
    }

    private static void b() {
        int n;
        var_long_c = -6294812530500968642L;
        long l = var_long_c ^ 0x57E7995B7E52CB10L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), 69, 83, (byte)(16 + 31), (byte)(51 + 16), (byte)(20 + 46), (byte)(33 + 34), (byte)(29 + 18), (byte)(43 + 37), (byte)(50 + 25), (byte)(5 + 62), (byte)(25 + 58), (byte)(26 + 27), (byte)(48 + 32), (byte)(13 + 84), (byte)(59 + 41), (byte)(36 + 64), (byte)(32 + 73), (byte)(63 + 47), (byte)(92 + 11)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(25 + 44), (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
                    NLoginType_003.var_java_lang_String_arr_b[0] = NLoginCore_384.E("֏ֈըտ֪֢ֆ֋֪֊հպ֠ււ֑֥֓իֻ֭֊ֳָ֫վոֹ֚֟րְֲֳ֓׉ִ։ֿ֪֌ֱֈ֖", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[1] = NLoginCore_092.D("քՔֆը։՞ճշոիֈՓ", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[2] = NLoginCore_453.B("ǍƭǐƛǛƾƢǓưƯǕƯƼƼǦǫƧƥǚǮǑƱǬǄǅǖǴǎǌǅǆǋǪǊƾǺǷǻǺȁǎǘǘǽǙǖǢǙǼǬǬȂǇǟȒȅǓȑȎǔȓȑȖț", (byte)114, 66);
                    NLoginType_003.var_java_lang_String_arr_b[3] = NLoginCore_324.F("֧շ֩֋֬ց֖֛֚֎֫ն", (byte)114, 70);
                    NLoginType_003.var_java_lang_String_arr_b[4] = NLoginCore_110.F("֞֕֞֗֔դո֘֋֘վրֱ֪֓֩րֶ֛֘֫։ֳ֨ֈ֠տ֭յּֿւָּ֦֚֕׀ׁ֡׈֥֖֩", (byte)114, 70);
                    NLoginType_003.var_java_lang_String_arr_b[5] = NLoginCore_110.A("ƳƛƺƩǁƹƙƮǒƮƾƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[6] = NLoginCore_384.A("ǘƩǌǌƨǡǗƿǤǥǜƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[7] = NLoginCore_451.C("րՑմմՐ։տէ֌֍քՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[8] = NLoginCore_076.E("ֆՠ֊պմռը֎ռւհն", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[9] = NLoginCore_076.A("ǄƽƝƴǟǗƻǀǟƿƘǞǅƛǒƺǩǋǀǗǯƿǩƼǟǫǁǑǸǱǛǐ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[10] = NLoginCore_138.A("ǜƬǞǀǡƶǋǏǐǃǠƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[11] = NLoginCore_387.C("հրՠւմՕեՆ՝ջծՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[12] = NLoginCore_173.C("հրՠւմՕեՆ՝ջծՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[13] = NLoginCore_091.C("րՑմմՐ։տէ֌֍քՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[14] = NLoginCore_575.A("ƻƕƿƯƩƱƝǃƱƷƥƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[15] = NLoginCore_387.C("րՑմմՐ։տէ֌֍քՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[16] = NLoginCore_138.E("֣մ֗֗ճ֢֬֊ְ֧֯ն", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[17] = NLoginCore_138.C("րՑմմՐ։տէ֌֍քՓ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[18] = NLoginCore_427.E("֣մ֗֗ճ֢֬֊ְ֧֯ն", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[19] = NLoginCore_091.B("ǘƩǌǌƨǡǗƿǤǥǜƫ", (byte)114, 66);
                    NLoginType_003.var_java_lang_String_arr_b[20] = NLoginCore_453.D("լեՅ՜ևտգըևէՍ՜֋Չբճվ֋ւ֖Քշ֖֑էթ՞սյ֐Ք֕", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[21] = NLoginCore_110.B("ǜƬǞǀǡƶǋǏǐǃǠƫ", (byte)114, 66);
                    continue block7;
                }
                case 1: {
                    NLoginType_003.var_java_lang_String_arr_b[0] = NLoginCore_027.E("֏ֈըտ֪֢ֆ֋֪֊հպ֠ււ֑֥֓իֻ֭֊ֳָ֫վոֹ֚֟րְֺֻ֑֦ׅ֑֨֜֔֡֠֊ׂ֪֟֩׎ט׃בֻ֤֢֡", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[1] = NLoginCore_110.D("ՓբՃաէՅՄբ՛աՖ֐հղՉՅ֑ՠաՐաձ՞՟", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[2] = NLoginCore_076.D("յՕոՃփզՊջ՘՗ս՗դդ֎֓ՏՍւ֖չՙ֔լխվ֜նմխծճ֒ղզ֢֣֢֟֩նրր֥ցվ֊ց֤֪֔֔կւ֛քօռְֱ֖֨֬֏", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[3] = NLoginCore_110.B("ǆƴƦƪǀǑƟǛƿǎƠǅǢǝǆǝǠǡǞǀưǯƶƷ", (byte)114, 66);
                    NLoginType_003.var_java_lang_String_arr_b[4] = NLoginCore_575.C("ջղջմձՁՕյըյ՛՝ևհ֎ֆ՝յֈ֓ոզօ֐ես՜֊Ւ֙֜՟֌ղապն֨ֈտշխ֬ճ", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ǚǚǘƷǟƳǂǖǔǗƾƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[6] = NLoginCore_324.C("ԻՖդՓ՘ֆպևց՗ՎդՈ՟եՎՊևւլ֊ա՞՟", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ձԾգպղՆՃմ֌եբՓ", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ƹƙƖǔƲǕƮƯƴǗƺƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[9] = NLoginCore_559.D("լեՅ՜ևտգըևէՀֆխՃպբ֑ճըտ֗բմջ՛խ֕֝։ա֋ի", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[10] = NLoginCore_110.B("ǆƴƔƵƺƿƫưƱƼǝƵǒƸǪǬǍǬǀƹǮǟƶƷ", (byte)114, 66);
                    NLoginType_003.var_java_lang_String_arr_b[11] = NLoginCore_446.E("քդ֡վպ֋ְֱ֤֭֮֠֒֐֮ձְָֹյִֺցւ", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[12] = NLoginCore_223.C("ոՠնԿռը֊տռ֌֋՞խֆւՠրբ֊րֆև՞՟", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[13] = NLoginCore_027.D("ՒՙցՑՃո՞տ։ֆևգխթՈՌֆ֔հ֐ճա՞՟", (byte)114, 68);
                    NLoginType_003.var_java_lang_String_arr_b[14] = NLoginCore_138.A("ǋƺǍƨǟǒƷǙƟǝǘƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[15] = NLoginCore_451.A("ƨǞƖƲǜƠƜǐǏƜƥƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[16] = NLoginCore_004.A("ƨǇƴƶƝơƚƜǑƼǜƫ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[17] = NLoginCore_453.A("ƼƴǛƨƩǝǙǢƯƶƟǔǤƧǟǉǧƺǋǟǞǟƶƷ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[18] = NLoginCore_324.A("ǑƧƪǉƺǝǎǂƱǑƼǓƨǒǨǣǉǨǞƫƾǟƶƷ", (byte)114, 65);
                    NLoginType_003.var_java_lang_String_arr_b[19] = NLoginCore_092.E("ջփևգւ։֖֮խտգ֜֋ֱծ֦տց֑ֈֺ֖ցւ", (byte)114, 69);
                    NLoginType_003.var_java_lang_String_arr_b[20] = NLoginCore_091.C("լեՅ՜ևտգըևէՍ՜֋Չբճվ֋ւ֖Քցՙչչը֊Ց֢֛֛֗", (byte)114, 67);
                    NLoginType_003.var_java_lang_String_arr_b[21] = NLoginCore_004.C("՗ռ՝ռօ՞ոՆլչեՇէՃվռէՋօգզև՞՟", (byte)114, 67);
                    continue block7;
                }
                case 2: {
                    NLoginType_003.var_java_lang_String_arr_b[0] = NLoginCore_173.E("բջքգ֔։֧֨֝վֲ֪֥֜ձ֭ևյցָֻ֛֑֫֯֕֩֓׃׀ֲ֭", (byte)114, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_003.var_java_lang_String_arr_b[0] = NLoginCore_223.E("֏֑տ֖֓զչ֣֠֙֙հֱ֖֮֍֥֔֕֒չ֪ցւ", (byte)114, 69);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = (0x40000000 >>> 158 | 0x40000000 << ~158 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(8141368943566267669L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(9006060072021402901L);
        g = Long.reverse(0xC00000000000000L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(8141368943566267669L);
        j = Integer.reverse(-1073741824);
        k = Long.reverse(9006060072021402901L);
        l = Long.reverse(0xC00000000000000L);
        m = Integer.reverse(0);
        n = (0 >>> 122 | 0 << -122) & 0xFFFFFFFF;
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Integer.reverse(0x40000000);
        q = Integer.reverse(-1073741824);
        r = 8 >>> 97 | 8 << ~97 + 1;
        s = (0xA000000 >>> 121 | 0xA000000 << ~121 + 1) & 0xFFFFFFFF;
        t = (0x800000 >>> 181 | 0x800000 << ~181 + 1) & 0xFFFFFFFF;
        u = Long.reverse(8141368943566267669L);
        v = Integer.reverse(-1610612736);
        w = -1 >>> 228 | -1 << ~228 + 1;
        x = Long.reverse(8141368943566267669L);
        y = 512 >>> 201 | 512 << -201;
        z = (0xC00000 >>> 53 | 0xC00000 << -53) & 0xFFFFFFFF;
        aa = Long.reverse(8141368943566267669L);
        ab = (0x38000000 >>> 219 | 0x38000000 << -219) & 0xFFFFFFFF;
        ac = Long.reverse(9006060072021402901L);
        ad = Long.reverse(0xC00000000000000L);
        ae = 32768 >>> 76 | 32768 << ~76 + 1;
        af = Long.reverse(9006060072021402901L);
        ag = Long.reverse(0xC00000000000000L);
        ah = Integer.reverse(-1879048192);
        ai = Long.reverse(9006060072021402901L);
        aj = Long.reverse(0xC00000000000000L);
        ak = -1610612736 >>> 220 | -1610612736 << ~220 + 1;
        al = Long.reverse(9006060072021402901L);
        am = Long.reverse(0xC00000000000000L);
        an = 11264 >>> 106 | 11264 << -106;
        ao = Long.reverse(9006060072021402901L);
        ap = Long.reverse(0xC00000000000000L);
        aq = 0x600000 >>> 115 | 0x600000 << -115;
        ar = Long.reverse(9006060072021402901L);
        as = Long.reverse(0xC00000000000000L);
        at = Integer.reverse(0);
        au = Integer.reverse(-1342177280);
        av = Long.reverse(9006060072021402901L);
        aw = Long.reverse(0xC00000000000000L);
        ax = Integer.reverse(0x70000000);
        ay = (-1 >>> 169 | -1 << -169) & 0xFFFFFFFF;
        az = Long.reverse(8141368943566267669L);
        ba = Integer.reverse(-268435456);
        bb = (-1 >>> 128 | -1 << ~128 + 1) & 0xFFFFFFFF;
        bc = Long.reverse(8141368943566267669L);
        bd = 0x2000000 >>> 181 | 0x2000000 << ~181 + 1;
        be = Long.reverse(8141368943566267669L);
        bf = Integer.reverse(-2013265920);
        bg = Long.reverse(8141368943566267669L);
        bh = (2304 >>> 167 | 2304 << -167) & 0xFFFFFFFF;
        bi = Long.reverse(8141368943566267669L);
        bj = (0x13000000 >>> 88 | 0x13000000 << -88) & 0xFFFFFFFF;
        bk = Integer.reverse(-1);
        bl = Long.reverse(8141368943566267669L);
        bm = (320 >>> 164 | 320 << -164) & 0xFFFFFFFF;
        bn = Long.reverse(8141368943566267669L);
        bo = Integer.reverse(-1476395008);
        bp = Long.reverse(8141368943566267669L);
        bq = (45056 >>> 75 | 45056 << ~75 + 1) & 0xFFFFFFFF;
        br = (-1342177280 >>> 91 | -1342177280 << ~91 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[bq];
        var_java_lang_String_arr_b = new String[br];
        NLoginType_003.b();
        var_com_nickuc_login_NLoginType_003_a = new NLoginType_003();
    }

    @Override
    public Class<?> a() {
        return AccountData.class;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_003.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.F("ԆԨԪԊԮՍՅ՛ՇԖՔՊ՘ՒԛՀբաՙ՟ՙԮ", (byte)34, 70), NLoginType_003.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњߏ߶ߔ߯߸߫ߺ߇ߚߛѰ", (byte)34, 68) + string + NLoginCore_324.F("Ԙ", (byte)34, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public JSONObject a(@Nonnull AccountData accountData) {
        if (!(accountData instanceof AccountDataImpl)) {
            throw new IllegalArgumentException((String)NLoginType_003.c("㺀", (int)h, (long)i) + AccountDataImpl.class.getCanonicalName() + (String)NLoginType_003.c("㺃", (int)j, (long)(k ^ l)) + accountData.getClass().getCanonicalName());
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (int i = m; i < this.var_java_lang_reflect_Field_arr_a.length; ++i) {
                int n;
                JSONObject jSONObject2 = new JSONObject();
                jSONArray.put(i, (Object)jSONObject2);
                Object object = this.var_java_lang_reflect_Field_arr_a[i].get(accountData);
                if (object == null) continue;
                if (object instanceof String) {
                    n = NLoginType_003.n;
                } else if (object instanceof UUID) {
                    n = o;
                } else if (object instanceof Boolean) {
                    n = p;
                } else if (object instanceof Long) {
                    n = q;
                } else if (object instanceof Map) {
                    n = r;
                } else if (object instanceof AccountType) {
                    n = s;
                } else {
                    throw new IllegalArgumentException((String)NLoginType_003.c("㺆", (int)t, (long)u) + object.getClass().getCanonicalName() + (String)NLoginType_003.c("㺉", (int)(v & w), (long)x) + object);
                }
                if (n == y) {
                    jSONObject2.put((String)NLoginType_003.c("㺌", (int)z, (long)aa), (Object)object.toString());
                } else {
                    jSONObject2.put((String)NLoginType_003.c("㺏", (int)ab, (long)(ac ^ ad)), object);
                }
                jSONObject2.put((String)NLoginType_003.c("㺒", (int)ae, (long)(af ^ ag)), n);
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginType_003.c("㺕", (int)ah, (long)(ai ^ aj)) + AccountData.class.getCanonicalName() + (String)NLoginType_003.c("㺘", (int)ak, (long)(al ^ am)), reflectiveOperationException);
        }
        jSONObject.put((String)NLoginType_003.c("㺛", (int)an, (long)(ao ^ ap)), (Object)jSONArray);
        return jSONObject;
    }

    private static String a(int n, long l) {
        l ^= 0x30L;
        l ^= 0x57E7995B7E52CB10L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(8 + 61), (byte)(67 + 16), (byte)(30 + 17), (byte)(35 + 32), (byte)(62 + 4), (byte)(47 + 20), (byte)(8 + 39), (byte)(54 + 26), (byte)(28 + 47), (byte)(64 + 3), (byte)(15 + 68), (byte)(10 + 43), 80, (byte)(72 + 25), (byte)(58 + 42), (byte)(56 + 44), (byte)(66 + 39), 110, (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("պևֆՉ։օր։֔փՐ֎֒֋֎֔Ֆࣲ࣐ࣶ࣋࣫ࣴࣧࣃࣖࣗ", (byte)91, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_003.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

