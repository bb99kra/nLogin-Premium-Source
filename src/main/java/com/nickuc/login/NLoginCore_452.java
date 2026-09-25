/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.types.Identity;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_539;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_174;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_452
implements NLoginInterface_019<Identity> {
    private static int au;
    private static int l;
    private static int s;
    private static int aq;
    private static long aa;
    private static String[] var_java_lang_String_arr_a;
    public static final NLoginCore_452 var_com_nickuc_login_NLoginCore_452_a;
    private static long d;
    private static long k;
    private static int y;
    private static long var_long_b;
    private static long ao;
    private static int ac;
    private static String[] var_java_lang_String_arr_b;
    private static long t;
    private static int i;
    private static long af;
    private static long m;
    private static int r;
    private static long p;
    private static long ag;
    private static int ah;
    private static int v;
    private static long q;
    private static int var_int_a;
    private static long w;
    private static int aj;
    private static long ar;
    private static long am;
    private static long x;
    private static long ak;
    private static int o;
    private static int an;
    private static int e;
    private static long ai;
    private static long z;
    private static int g;
    private static long h;
    private static long u;
    private static long as;
    private static int al;
    private static int ab;
    private static int ae;
    private static long c;
    private static long j;
    private static int at;
    private static int f;
    private static long ap;
    private static long ad;
    private static long n;

    @Override
    public Class<?> a() {
        return Identity.class;
    }

    @Override
    public JSONObject a(@Nonnull Identity identity) {
        JSONObject jSONObject = new JSONObject();
        if (identity instanceof NLoginCore_539) {
            UUID uUID;
            NLoginCore_539 NLoginCore_539 = (NLoginCore_539)identity;
            jSONObject.put((String)NLoginCore_452.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), e);
            jSONObject.put((String)NLoginCore_452.c("㺃", (int)(f & g), (long)h), (Object)NLoginCore_539.getName());
            UUID uUID2 = NLoginCore_539.getMojangId();
            if (uUID2 != null) {
                jSONObject.put((String)NLoginCore_452.c("㺆", (int)i, (long)(j ^ k)), (Object)NLoginCore_432.b(uUID2));
            }
            if ((uUID = NLoginCore_539.getBedrockId()) != null) {
                jSONObject.put((String)NLoginCore_452.c("㺉", (int)l, (long)(m ^ n)), (Object)NLoginCore_432.b(uUID));
            }
        } else if (identity instanceof NLoginCore_174) {
            NLoginCore_174 NLoginCore_1742 = (NLoginCore_174)identity;
            jSONObject.put((String)NLoginCore_452.c("㺌", (int)o, (long)(p ^ q)), r);
            jSONObject.put((String)NLoginCore_452.c("㺏", (int)s, (long)(t ^ u)), (Object)NLoginCore_1742.getKnownName());
        } else {
            throw new IllegalArgumentException((String)NLoginCore_452.c("㺒", (int)v, (long)(w ^ x)) + identity.getClass().getCanonicalName());
        }
        return jSONObject;
    }

    private static String a(int n, long l) {
        l ^= 0x39L;
        l ^= 0x90AB0BEE4E31DA60L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(30 + 39), (byte)(48 + 35), (byte)(5 + 42), (byte)(53 + 14), (byte)(15 + 51), (byte)(62 + 5), 47, (byte)(78 + 2), (byte)(73 + 2), (byte)(41 + 26), (byte)(76 + 7), (byte)(19 + 34), 80, (byte)(59 + 38), (byte)(71 + 29), (byte)(95 + 5), (byte)(57 + 48), (byte)(29 + 81), (byte)(51 + 52)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ҥҲұѴҴҰҫҴҿҮѻҹҽҶҹҿҁࠍ߯࠙ࠌࠝ߫ࠒࠛࠠࠤࠠࠑࠡࠠ", (byte)47, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_452.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 6220514155168890258L;
        long l = c ^ 0x90AB0BEE4E31DA60L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(19 + 50), (byte)(61 + 22), (byte)(22 + 25), (byte)(22 + 45), (byte)(24 + 42), 67, (byte)(45 + 2), (byte)(43 + 37), (byte)(28 + 47), (byte)(28 + 39), (byte)(82 + 1), (byte)(12 + 41), (byte)(62 + 18), (byte)(69 + 28), 100, (byte)(20 + 80), (byte)(20 + 85), (byte)(108 + 2), (byte)(55 + 48)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
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
                    NLoginCore_452.var_java_lang_String_arr_b[0] = NLoginCore_076.C("զ՝ըՈղՕՒ՘մԿկՊ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[1] = NLoginCore_027.D("Ռ՘կոՔԽվժծԾՍՊ", (byte)111, 68);
                    NLoginCore_452.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ƎƯǍƥƮƚƚǝǖǊǐǟǀǁǢƴǓǅǕǓǩǩưƱ", (byte)111, 65);
                    NLoginCore_452.var_java_lang_String_arr_b[3] = NLoginCore_453.B("ǐƪưǔǐƘƩǍƙǚƽƱǊƠƖǔǄƷǆƱƥǙưƱ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[4] = NLoginCore_004.C("զ՝ըՈղՕՒ՘մԿկՊ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[5] = NLoginCore_324.C("պհոԸխՎԼԿձՐզՕոՇՕՒնոդՊծըՕՖ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[6] = NLoginCore_201.C("ճՇը԰տՑԸՊցն՛եսհճջՅՋՊթ֍ՉՇ֒ՠՒ֊օՍբնՕչֈ֊֗֌րրվ֤֟կ֠ռվ։֪ւ֗ռնի֫ը֤֭֭֮նֆր֧ք", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[7] = NLoginCore_387.B("ǁƸǃƣǍưƭƳǏƚǊƥ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[8] = NLoginCore_384.E("յց֘֡սզ֧֓֗էնճ", (byte)111, 69);
                    NLoginCore_452.var_java_lang_String_arr_b[9] = NLoginCore_091.D("ԳՔղՊՓԿԿւջկյքեզևՙոժպո֎֎ՕՖ", (byte)111, 68);
                    NLoginCore_452.var_java_lang_String_arr_b[10] = NLoginCore_427.A("ƎƯǍƥƮƚƚǝǖǊǐǟǀǁǢƴǓǅǕǓǩǩưƱ", (byte)111, 65);
                    NLoginCore_452.var_java_lang_String_arr_b[11] = NLoginCore_387.C("յՏՕչյԽՎղԾտբՖկՅԻչթ՜իՖՊվՕՖ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[12] = NLoginCore_575.D("յՏՕչյԽՎղԾտբՖկՅԻչթ՜իՖՊվՕՖ", (byte)111, 68);
                    NLoginCore_452.var_java_lang_String_arr_b[13] = NLoginCore_453.B("ǕǋǓƓǈƩƗƚǌƫǁưǓƢưƭǑǓƿƥǉǃưƱ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ǎƢǃƋǚƬƓƥǜǑƴǡǒƶǡǍǦǏƥǆǛǜǁǣƿƹǧƮǈƼǣǨǤǬǡǂǣƳǫƴǏǩƹǵƺǑǭǲȂƿǾǽǁǓǐǑ", (byte)111, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_452.var_java_lang_String_arr_b[0] = NLoginCore_451.F("տոճևփ֜֙ճպ֥֥֝֙֯ղ֝ս֣֯մ֓ցվտ", (byte)111, 70);
                    NLoginCore_452.var_java_lang_String_arr_b[1] = NLoginCore_201.F("֛րնվրմ֣՝ցխվճ", (byte)111, 70);
                    NLoginCore_452.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƎƯǍƥƮƚƚǝǖǊǑǛǘƭǎǚƲǧǖǛƾǩưƱ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[3] = NLoginCore_027.F("֞ով֢֞զշ֛է֨֋֢֙֊լֳ֪֭֯ծևַվտ", (byte)111, 70);
                    NLoginCore_452.var_java_lang_String_arr_b[4] = NLoginCore_091.A("ǏǅǑǑƔƫƴǝƶƭƸƥ", (byte)111, 65);
                    NLoginCore_452.var_java_lang_String_arr_b[5] = NLoginCore_559.A("ǕǋǓƓǈƩƗƚǌƫǁǒǛƯǍǚƸƝǃǥǈǃưƱ", (byte)111, 65);
                    NLoginCore_452.var_java_lang_String_arr_b[6] = NLoginCore_387.B("ǎƢǃƋǚƬƓƥǜǑƶǀǘǋǎǖƠƦƥǄǨƤƢǭƻƭǥǠƨƽǑưǔǣǥǲǧǛǛǙǿǺǊǻǗǙǤȅǝǲǗǑǆǹȁǝȅǪǋǚȉȎȆǮǿȐǱǬǬǔǥǭǰțȊǥ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[7] = NLoginCore_076.A("ǑƒǙǉǇƱƩƭƞǌǀƥ", (byte)111, 65);
                    NLoginCore_452.var_java_lang_String_arr_b[8] = NLoginCore_446.C("ԳԷՕ՞խժՌկՃ՛ՙՊ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[9] = NLoginCore_324.E("՜ս֛ճռըը֤֫֘֞զկ֦օղսֶ֖ֆַ֪վտ", (byte)111, 69);
                    NLoginCore_452.var_java_lang_String_arr_b[10] = NLoginCore_384.E("՜ս֛ճռըը֤֫֘֜ր֘ժ֢կի֋֨ք֎ցվտ", (byte)111, 69);
                    NLoginCore_452.var_java_lang_String_arr_b[11] = NLoginCore_223.C("յՏՕչյԽՎղԾտգռԿդր֊՘Պ։։։֎ՕՖ", (byte)111, 67);
                    NLoginCore_452.var_java_lang_String_arr_b[12] = NLoginCore_092.B("ǐƪưǔǐƘƩǍƙǚƾƓƹƫǞǍǑǦǡǁƣǩưƱ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[13] = NLoginCore_004.B("ǕǋǓƓǈƩƗƚǌƫǀƪǖƶǏƹƦǀƳƦƳǃưƱ", (byte)111, 66);
                    NLoginCore_452.var_java_lang_String_arr_b[14] = NLoginCore_324.F("֜հ֑ՙ֨պաճ֪֟ւ֯֠քִ֛֯֝ճ֪֔֩֏ֱ֍ևֵռ֖֊ֱֲֶֺ֯֐ֱցֹւַ֝և֠׋֍֪׏֦ה֌֟׎ׇ֞֟", (byte)111, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_452.var_java_lang_String_arr_b[0] = NLoginCore_138.D("Ջռԯո՘ՒԳլղՑՃձՑնժվ՜ՖզնՅ֎բ֎ծըֈ֋֑զհ֗", (byte)111, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_452.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ռչհԹծ՚ՉՎՀուն՝ՓՑբ֋Չֈա֋ըՕՖ", (byte)111, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_452.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.D("ҲӔӖҶӚӹӱԇӳӂԀӶԄӾӇӬԎԍԅԋԅӚ", (byte)71, 68), NLoginCore_452.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡕ࠷ࡡࡔࡥ࠳࡚ࡣࡨ࡬ࡨ࡙ࡩࡨӣ", (byte)71, 68) + string + NLoginCore_201.A("Ň", (byte)71, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 217 | 0 << ~217 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(5313830679315597930L);
        d = Long.reverse(-7205759403792793600L);
        e = Integer.reverse(0);
        f = (1 >>> 96 | 1 << -96) & 0xFFFFFFFF;
        g = (-1 >>> 157 | -1 << ~157 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-3044850229084042646L);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(5313830679315597930L);
        k = Long.reverse(-7205759403792793600L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(5313830679315597930L);
        n = Long.reverse(-7205759403792793600L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(5313830679315597930L);
        q = Long.reverse(-7205759403792793600L);
        r = 8 >>> 195 | 8 << -195;
        s = (0x28000000 >>> 219 | 0x28000000 << -219) & 0xFFFFFFFF;
        t = Long.reverse(5313830679315597930L);
        u = Long.reverse(-7205759403792793600L);
        v = 0x60000000 >>> 156 | 0x60000000 << -156;
        w = Long.reverse(5313830679315597930L);
        x = Long.reverse(-7205759403792793600L);
        y = Integer.reverse(-536870912);
        z = Long.reverse(5313830679315597930L);
        aa = Long.reverse(-7205759403792793600L);
        ab = 4096 >>> 41 | 4096 << ~41 + 1;
        ac = Integer.reverse(-1);
        ad = Long.reverse(-3044850229084042646L);
        ae = Integer.reverse(-1879048192);
        af = Long.reverse(5313830679315597930L);
        ag = Long.reverse(-7205759403792793600L);
        ah = 40960 >>> 76 | 40960 << ~76 + 1;
        ai = Long.reverse(-3044850229084042646L);
        aj = Integer.reverse(-805306368);
        ak = Long.reverse(-3044850229084042646L);
        al = (6 >>> 63 | 6 << -63) & 0xFFFFFFFF;
        am = Long.reverse(-3044850229084042646L);
        an = (0xD00000 >>> 52 | 0xD00000 << ~52 + 1) & 0xFFFFFFFF;
        ao = Long.reverse(5313830679315597930L);
        ap = Long.reverse(-7205759403792793600L);
        aq = 114688 >>> 77 | 114688 << ~77 + 1;
        ar = Long.reverse(5313830679315597930L);
        as = Long.reverse(-7205759403792793600L);
        at = Integer.reverse(-268435456);
        au = Integer.reverse(-268435456);
        var_java_lang_String_arr_a = new String[at];
        var_java_lang_String_arr_b = new String[au];
        NLoginCore_452.b();
        var_com_nickuc_login_NLoginCore_452_a = new NLoginCore_452();
    }

    @Override
    public Identity a(@Nonnull JSONObject jSONObject) {
        int n = jSONObject.getInt((String)NLoginCore_452.c("㺀", (int)y, (long)(z ^ aa)));
        switch (n) {
            case 0: {
                String string = jSONObject.getString((String)NLoginCore_452.c("㺃", (int)(ab & ac), (long)ad));
                UUID uUID = jSONObject.has((String)NLoginCore_452.c("㺆", (int)ae, (long)(af ^ ag))) ? NLoginCore_432.c(jSONObject.getString((String)NLoginCore_452.c("㺉", (int)ah, (long)ai))) : null;
                UUID uUID2 = jSONObject.has((String)NLoginCore_452.c("㺌", (int)aj, (long)ak)) ? NLoginCore_432.c(jSONObject.getString((String)NLoginCore_452.c("㺏", (int)al, (long)am))) : null;
                return new NLoginCore_539(string, uUID, uUID2);
            }
            case 1: {
                String string = jSONObject.getString((String)NLoginCore_452.c("㺒", (int)an, (long)(ao ^ ap)));
                return new NLoginCore_174(string);
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_452.c("㺕", (int)aq, (long)(ar ^ as)) + n);
    }
}

