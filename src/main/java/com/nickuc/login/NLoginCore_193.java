/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_319;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_215;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_193 {
    private static int w;
    private static long ae;
    private static int ad;
    private static long e;
    private static long aa;
    private static int aj;
    private static String[] var_java_lang_String_arr_b;
    private static int p;
    private static int k;
    public static final int var_int_u;
    private static int var_int_a;
    private static int s;
    private static long g;
    private static int ah;
    private static long am;
    private static long ac;
    private static int ab;
    private static long var_long_c;
    private static long var_long_u;
    private static long t;
    private static int var_int_c;
    private static long var_long_b;
    private static long q;
    public static final String Y;
    private static long o;
    private static int y;
    private static int ak;
    private static int h;
    private static int i;
    private static int ao;
    private static int n;
    private static int ap;
    private final NLoginCore_319 var_com_nickuc_login_NLoginCore_319_a;
    private static int f;
    private static long an;
    private static int al;
    private static long z;
    private static int x;
    private static String[] var_java_lang_String_arr_a;
    private static long af;
    private static long r;
    private static long l;
    public static final int v;
    private static long j;
    private static long m;
    private static int d;
    private static long ai;
    private static int ag;

    public void a(int n, Consumer<JSONObject> consumer) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginCore_193.c("㺀", (int)ab, (long)ac), n);
        JSONObject jSONObject2 = new JSONObject();
        consumer.accept(jSONObject2);
        jSONObject.put((String)NLoginCore_193.c("㺃", (int)ad, (long)(ae ^ af)), (Object)jSONObject2);
        this.var_com_nickuc_login_NLoginCore_319_a.l((String)NLoginCore_193.c("㺆", (int)(ag & ah), (long)ai), jSONObject.toString());
    }

    private static String a(int n, long l) {
        l ^= 0x16L;
        l ^= 0x2C597BB6C3725CE0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(34 + 35), (byte)(35 + 48), (byte)(39 + 8), (byte)(54 + 13), 66, (byte)(8 + 59), (byte)(13 + 34), (byte)(78 + 2), (byte)(59 + 16), (byte)(40 + 27), (byte)(75 + 8), (byte)(36 + 17), (byte)(16 + 64), (byte)(19 + 78), (byte)(11 + 89), (byte)(8 + 92), (byte)(51 + 54), (byte)(76 + 34), (byte)(42 + 61)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(10 + 73)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.D("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣅࣰࣲࣩ࣭࣭࣮ࣛ࣌ࣳࣞࣕࣤࣆࣸ", (byte)117, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_193.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_193.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.A("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 65), NLoginCore_193.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡍࡱࡣࡵࡔࡵࡻࡦࡶࡺ࡝࡬ࡸࡎࢀӶ", (byte)77, 67) + string + NLoginCore_138.B("œ", (byte)77, 66) + methodType.toString(), exception);
        }
    }

    @Nullable
    public static NLoginCore_193 a(NLoginType_008 NLoginType_008) {
        Object object;
        List<String> list;
        NLoginCore_219 NLoginCore_2192 = NLoginType_008.com_nickuc_login_NLoginCore_219_a();
        if (!NLoginCore_2192.d(NLoginCore_193.c("㺀", (int)var_int_a, (long)var_long_b)) && !NLoginCore_2192.d(NLoginCore_193.c("㺃", (int)(var_int_c & d), (long)e))) {
            return null;
        }
        Object t = NLoginCore_2192.d(NLoginCore_193.c("㺆", (int)f, (long)g));
        if (t == null) {
            return null;
        }
        if (t instanceof String) {
            list = Collections.singletonList(t.toString());
        } else if (t instanceof List) {
            object = (List)t;
            list = object.stream().map(Object::toString).collect(Collectors.toList());
        } else {
            throw new IllegalArgumentException((String)NLoginCore_193.c("㺉", (int)(h & i), (long)j) + t);
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_193.c("㺌", (int)k, (long)(l ^ m)));
        }
        object = NLoginCore_2192.java_lang_String_b(NLoginCore_193.c("㺏", (int)n, (long)o));
        String string = NLoginCore_2192.java_lang_String_b(NLoginCore_193.c("㺒", (int)p, (long)(q ^ r)));
        boolean bl = NLoginCore_2192.d(NLoginCore_193.c("㺕", (int)s, (long)(NLoginCore_193.t ^ var_long_u)));
        if (object != null && ((String)object).isEmpty()) {
            object = null;
        }
        if (string != null && string.isEmpty()) {
            string = null;
        }
        NLoginCore_319 NLoginCore_319 = list.size() > w ? NLoginCore_319.a(NLoginType_008, list, (String)object, string, bl) : NLoginCore_319.a(NLoginType_008, list.get(x), (String)object, string, bl);
        return new NLoginCore_193(NLoginType_008, NLoginCore_319);
    }

    public void c() {
        this.var_com_nickuc_login_NLoginCore_319_a.close();
    }

    static {
        var_int_a = (0 >>> 11 | 0 << ~11 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(3244511063956227650L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = (-1 >>> 242 | -1 << -242) & 0xFFFFFFFF;
        e = Long.reverse(3244511063956227650L);
        f = 262144 >>> 209 | 262144 << -209;
        g = Long.reverse(3244511063956227650L);
        h = 0x300000 >>> 20 | 0x300000 << -20;
        i = -1 >>> 185 | -1 << -185;
        j = Long.reverse(3244511063956227650L);
        k = Integer.reverse(0x20000000);
        l = Long.reverse(4973893320866498114L);
        m = Long.reverse(0x6800000000000000L);
        n = (0x5000000 >>> 152 | 0x5000000 << ~152 + 1) & 0xFFFFFFFF;
        o = Long.reverse(3244511063956227650L);
        p = 1536 >>> 104 | 1536 << ~104 + 1;
        q = Long.reverse(4973893320866498114L);
        r = Long.reverse(0x6800000000000000L);
        s = Integer.reverse(-536870912);
        t = Long.reverse(4973893320866498114L);
        var_long_u = Long.reverse(0x6800000000000000L);
        w = (524288 >>> 83 | 524288 << ~83 + 1) & 0xFFFFFFFF;
        x = Integer.reverse(0);
        y = Integer.reverse(0x10000000);
        z = Long.reverse(4973893320866498114L);
        aa = Long.reverse(0x6800000000000000L);
        ab = Integer.reverse(-1879048192);
        ac = Long.reverse(3244511063956227650L);
        ad = Integer.reverse(0x50000000);
        ae = Long.reverse(4973893320866498114L);
        af = Long.reverse(0x6800000000000000L);
        ag = (22 >>> 33 | 22 << -33) & 0xFFFFFFFF;
        ah = Integer.reverse(-1);
        ai = Long.reverse(3244511063956227650L);
        aj = (0x340000 >>> 210 | 0x340000 << ~210 + 1) & 0xFFFFFFFF;
        ak = (0xD000000 >>> 24 | 0xD000000 << -24) & 0xFFFFFFFF;
        al = (3072 >>> 232 | 3072 << -232) & 0xFFFFFFFF;
        am = Long.reverse(4973893320866498114L);
        an = Long.reverse(0x6800000000000000L);
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_193.b();
        Y = NLoginCore_193.c("㺀", (int)al, (long)(am ^ an));
        v = ao;
        var_int_u = ap;
    }

    private static void b() {
        int n;
        var_long_c = 4783376111911002274L;
        long l = var_long_c ^ 0x2C597BB6C3725CE0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(41 + 28), (byte)(43 + 40), (byte)(4 + 43), (byte)(11 + 56), (byte)(21 + 45), (byte)(25 + 42), (byte)(44 + 3), (byte)(17 + 63), (byte)(34 + 41), (byte)(25 + 42), (byte)(8 + 75), (byte)(17 + 36), (byte)(11 + 69), 97, (byte)(45 + 55), (byte)(68 + 32), (byte)(56 + 49), 110, (byte)(36 + 67)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_193.var_java_lang_String_arr_b[0] = NLoginCore_324.E("կձְֱ֤֨մ֤֙֝նְֺֽ֪֕ջׂ֔׆֥֠֍֎", (byte)126, 69);
                    NLoginCore_193.var_java_lang_String_arr_b[1] = NLoginCore_384.B("ưƲǱǲǩǥƵǚǥǞƶǙǹǵƿǳǵǠǄȃȆǑǎǏ", (byte)126, 66);
                    NLoginCore_193.var_java_lang_String_arr_b[2] = NLoginCore_446.D("գ֙շքդ֪֫֎֪֯ծ֫֩վհֱւ֩չֵֻ֘ւփ", (byte)126, 68);
                    NLoginCore_193.var_java_lang_String_arr_b[3] = NLoginCore_575.F("֑ֆ֕֫ծ֮։֥պֆ֏ո֓֍ովյ׃ַքּ֞քֻևׂ֍քց֡׈׍֤֍֩׋גׅ֣זֱֱ֢֘", (byte)126, 70);
                    NLoginCore_193.var_java_lang_String_arr_b[4] = NLoginCore_027.D("֢֒զդ֝֗ււծխպ֢֮֠քխ֥֍ֽ֥֔֍ս֩ղպւֲ֘֟րֆׇ֦֡֨֔׌֘֋֍֜׈֗", (byte)126, 68);
                    NLoginCore_193.var_java_lang_String_arr_b[5] = NLoginCore_223.E("֔֋։ֵ֪֠ք֖֧֛֪֛֭֘֘վֻպִׂ֠֠֍֎", (byte)126, 69);
                    NLoginCore_193.var_java_lang_String_arr_b[6] = NLoginCore_138.F("ղվ֧֕նյ֏֐ֈֹ֦֗֏ַ֗׀֐ւռֵ֡֐֍֎", (byte)126, 70);
                    NLoginCore_193.var_java_lang_String_arr_b[7] = NLoginCore_453.A("ǋǎǕǋǱǐǭǈǓǲƻǴǞǶǗǀǽǡǚǦǟǑǎǏ", (byte)126, 65);
                    NLoginCore_193.var_java_lang_String_arr_b[8] = NLoginCore_446.D("֢աա֬֙ևլցվև֡֬լ֖խ֐ִֵָ֛֭֫ւփ", (byte)126, 68);
                    NLoginCore_193.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ֳ֦֒֫ւ֍֩֨֗օֻւ", (byte)126, 70);
                    NLoginCore_193.var_java_lang_String_arr_b[10] = NLoginCore_110.D("֙ցյ֫չռըչ֚ժ֜շ", (byte)126, 68);
                    NLoginCore_193.var_java_lang_String_arr_b[11] = NLoginCore_091.E("֭լլַ֤֒շ֌։ַ֒֬շ֡ո֛׃ָֿ֦׀ֶ֍֎", (byte)126, 69);
                    NLoginCore_193.var_java_lang_String_arr_b[12] = NLoginCore_384.B("ǮƭƭǸǥǓƸǍǊǓǭǸƸǢƹǜȄǹȀǧȁǷǎǏ", (byte)126, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_193.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ưƲǱǲǩǥƵǚǥǞƸƺǝƳǂǲǯǎǖǱǱǡǎǏ", (byte)126, 66);
                    NLoginCore_193.var_java_lang_String_arr_b[1] = NLoginCore_076.A("ưƲǱǲǩǥƵǚǥǞƵǙƻǲƼǵǺǍǚǶǲƿǫǷǻȂǚǎǝǱǱǯ", (byte)126, 65);
                    NLoginCore_193.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ƯǥǃǐưǶǷǚǻǶƼǗǯǭȁǗǣǰȁǓǙǪǟǤǻǘǞǦǆǼǜǯ", (byte)126, 66);
                    NLoginCore_193.var_java_lang_String_arr_b[3] = NLoginCore_110.E("֑ֆ֕֫ծ֮։֥պֆ֏ո֓֍ովյ׃ַքּ֞քֻևׂ֍քց֡׈׍׎׋ׇ֟׏׀ֺֹׅ֦֗לֳ׌֛֘םכסף׃צ֭֮", (byte)126, 69);
                    NLoginCore_193.var_java_lang_String_arr_b[4] = NLoginCore_173.A("ǞǮƲưǩǣǎǎƺƹǆǮǺǬǐƹǱǙǠǱȉǙǉǵƾǆǎǤǫǾǌǒǟȁǬȎǪǷȈǯǳǷǝǼǯȉǞǻǲǾȕǝǳȁǮǯ", (byte)126, 65);
                    NLoginCore_193.var_java_lang_String_arr_b[5] = NLoginCore_027.F("֔֋։ֵ֪֠ք֖֧֘֙։ּׁ֊սַ֌ַַׇּֽֿ֘֯֕֋֍֨։ּ", (byte)126, 70);
                    NLoginCore_193.var_java_lang_String_arr_b[6] = NLoginCore_559.A("ƳƿǖǨƷƶǐǑǉǘǦǎǲǿǴǗǔƼȇǚȆȂǸǹǉȈǠǺǫǮǧǭ", (byte)126, 65);
                    NLoginCore_193.var_java_lang_String_arr_b[7] = NLoginCore_575.A("ǋǎǕǋǱǐǭǈǓǲƹǈǺǘǿǃǠǅǹǰǼȇǎǏ", (byte)126, 65);
                    NLoginCore_193.var_java_lang_String_arr_b[8] = NLoginCore_027.F("֭լլַ֤֒շ֌։֮֒֙ձֱֿ֛֭֡֎տ֐֠֍֎", (byte)126, 70);
                    NLoginCore_193.var_java_lang_String_arr_b[9] = NLoginCore_173.B("ǏƮǓǆǘǒǏǬǮǭǨǃ", (byte)126, 66);
                    NLoginCore_193.var_java_lang_String_arr_b[10] = NLoginCore_201.C("֥նշ֝ցդ֠֜վփ֎շ", (byte)126, 67);
                    NLoginCore_193.var_java_lang_String_arr_b[11] = NLoginCore_138.D("֢աա֬֙ևլցվև֡ֆ֤֫ֆ֔ֆհ֏֜ճֻւփ", (byte)126, 68);
                    NLoginCore_193.var_java_lang_String_arr_b[12] = NLoginCore_384.D("֢աա֬֙ևլցվևֳ֡֓ի֬թ։քև֋֤օւփ", (byte)126, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_193.var_java_lang_String_arr_b[0] = NLoginCore_110.D("֧չ֖֒ր֩պ֧չև֤շ", (byte)126, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_193.var_java_lang_String_arr_b[0] = NLoginCore_453.E("ֵ֪֠ք֟։֎֓֋֨օւ", (byte)126, 69);
                }
            }
        }
    }

    private NLoginCore_193(NLoginType_008 NLoginType_008, NLoginCore_319 NLoginCore_319) {
        this.var_com_nickuc_login_NLoginCore_319_a = NLoginCore_319;
        NLoginCore_319.a((String)NLoginCore_193.c("㺀", (int)y, (long)(z ^ aa)), new NLoginCore_215(NLoginType_008, null));
    }
}

