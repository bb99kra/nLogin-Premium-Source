/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.HikariConnectionPool;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_536;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_392
extends HikariConnectionPool {
    private static long aj;
    private static int am;
    private static long ao;
    private static long n;
    private static int af;
    private static long ah;
    private static int au;
    private static int o;
    private static long r;
    private static long f;
    private static long ag;
    private static long aq;
    private static int an;
    private static int j;
    private static int y;
    private static long q;
    private static int m;
    private static long ae;
    private static int u;
    private static int ac;
    private static int ad;
    private static long w;
    private static long h;
    private static String[] var_java_lang_String_arr_d;
    private static int var_int_d;
    private static String[] c;
    private static long k;
    private static int i;
    private static int v;
    private static long ab;
    private static int l;
    private static int as;
    private static long t;
    private static long aa;
    private static int ai;
    private static int s;
    private static long ar;
    private static long al;
    private static int ap;
    private static int e;

    private static void b() {
        int n;
        f = 3251714733130984628L;
        long l = f ^ 0xF08E477969E885B9L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(25 + 44), (byte)(11 + 72), (byte)(30 + 17), (byte)(19 + 48), (byte)(28 + 38), (byte)(3 + 64), (byte)(27 + 20), (byte)(17 + 63), 75, 67, (byte)(79 + 4), (byte)(7 + 46), (byte)(8 + 72), (byte)(83 + 14), (byte)(8 + 92), (byte)(30 + 70), (byte)(88 + 17), (byte)(15 + 95), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
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
                    NLoginCore_392.var_java_lang_String_arr_d[0] = NLoginCore_223.F("գւնզֈ֔ց֢֡ըտքփ֐ձ֫քթֆճշ֨֬ֈֿ֌֍֏պֳֺշׇֻּ֪ւ֪ׄտ֢֧֪֬֡־֌׏ֶָ֣׋ׂי֠֡", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[1] = NLoginCore_091.B("ƱǕǄǌǉƲƴƶǀǐǚǤǒǓǄƴƢǉƞƫǨǍƹƬǈǁǥǨǵǣǩǦ", (byte)113, 66);
                    NLoginCore_392.var_java_lang_String_arr_d[2] = NLoginCore_575.F("դզ֙֟ֆնևիօ֏֢յ", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[3] = NLoginCore_446.A("ǊƚƙƹƹǐưǖƿƝƼƩ", (byte)113, 65);
                    NLoginCore_392.var_java_lang_String_arr_d[4] = NLoginCore_324.D("Ծ՝ՑՁգկ՜ռսՃ՚՟՞իՌֆ՟ՄաՎՒփևգ֚էըժՕ֕֎Ւ֢֖֗օ՝օ֟՚ևստ֕գդ֚֮֝ֆ֤ֆ֒֫ֈմֱֱַ֣֚֎ֽ֔սջյ֤ցׇւ֘֡օ֟֐", (byte)113, 68);
                    NLoginCore_392.var_java_lang_String_arr_d[5] = NLoginCore_201.D("ԹղՠձգԿև՗ՑՅ֊՚ա՗ջՎ֌ՏւէՋք՛՜", (byte)113, 68);
                    NLoginCore_392.var_java_lang_String_arr_d[6] = NLoginCore_559.C("՞ՒկԻնՂ՛պսՙևօզթպօ։ճօՓ֎ծ՛՜", (byte)113, 67);
                    NLoginCore_392.var_java_lang_String_arr_d[7] = NLoginCore_110.F("֕ջմ֖֫պ֥֛֦վբ֧֮ձ֏֞֎֖ցֵֹ֥րց", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[8] = NLoginCore_138.C("ՖշԺճ՞ԸՇ՚՜։ՂՐ", (byte)113, 67);
                    NLoginCore_392.var_java_lang_String_arr_d[9] = NLoginCore_384.C("ԷՋՏյՏՅնըՆա՘ՈքջևբՋՋքղՏծ՛՜", (byte)113, 67);
                    NLoginCore_392.var_java_lang_String_arr_d[10] = NLoginCore_138.D("ՙիջՂնՆՁ՗ՀՇֈՈեըփջ֑ք֌բթ՞՛՜", (byte)113, 68);
                    NLoginCore_392.var_java_lang_String_arr_d[11] = NLoginCore_004.F("աղ֓ը֕՝ւ֣սկֱ֢֮֠֠֫հմ֮֍֤֯ֆև֧ո֟׀ց֥֕ׄ", (byte)113, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_392.var_java_lang_String_arr_d[0] = NLoginCore_027.F("գւնզֈ֔ց֢֡ըտքփ֐ձ֫քթֆճշ֨֬ֈֿ֌֍֏պֳֺշׇֻּ֪ւ֪ׄտֲ֢֧֬׏֠הֲׁהֳָׂ֯֗ילַמֵֺ֛֟ע", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[1] = NLoginCore_223.D("՘ռիճհՙ՛՝էշց֋չպի՛ՉհՅՒ֏ճցֆնդփ֏ֈն։խ", (byte)113, 68);
                    NLoginCore_392.var_java_lang_String_arr_d[2] = NLoginCore_223.A("ƱƙƗǕƯǀƗǂƵưƟƩ", (byte)113, 65);
                    NLoginCore_392.var_java_lang_String_arr_d[3] = NLoginCore_110.E("ֆ՟զ֛֜֟֜։ְ֣րյ", (byte)113, 69);
                    NLoginCore_392.var_java_lang_String_arr_d[4] = NLoginCore_324.B("ƗƶƪƚƼǈƵǕǖƜƳƸƷǄƥǟƸƝƺƧƫǜǠƼǳǀǁǃƮǮǧƫǻǯǰǞƶǞǸƳǠǖǘǮƼƽȇǳǶǟǽǟǫȄǡǍǼȊǳȐȊǧȖǭǗǍǪǹǿǴǷǲǾȑǠȤȢȠǞȞǪȞȣȩǦȭǴǵ", (byte)113, 66);
                    NLoginCore_392.var_java_lang_String_arr_d[5] = NLoginCore_427.C("ԹղՠձգԿև՗ՑՅ֌ԾխՀ։ևգՐՏ֕քք՛՜", (byte)113, 67);
                    NLoginCore_392.var_java_lang_String_arr_d[6] = NLoginCore_076.F("փշ֔ՠ֛էր֢֟վ֑֫֌վַ֦֦֧֞֒ոֹրց", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[7] = NLoginCore_559.F("֕ջմ֖֫պ֥֛֦վզ֑֎֋֢խִֵָ֒հֹրց", (byte)113, 70);
                    NLoginCore_392.var_java_lang_String_arr_d[8] = NLoginCore_027.B("ǇƚƱƧǇƫǘƳƹƻǢƩ", (byte)113, 66);
                    NLoginCore_392.var_java_lang_String_arr_d[9] = NLoginCore_138.D("ԷՋՏյՏՅնըՆա՘գվնՌ֌գբզՍքծ՛՜", (byte)113, 68);
                    NLoginCore_392.var_java_lang_String_arr_d[10] = NLoginCore_092.B("ƲǄǔƛǏƟƚưƙƠǟƥǂƟǒǦǛƫǭǡƤǭƴƵ", (byte)113, 66);
                    NLoginCore_392.var_java_lang_String_arr_d[11] = NLoginCore_027.D("ԼՍծՃհԸ՝վ՘Պջջ։֌ֆսՋՏ։ը֊կ֕ըմ՚շՔ֝ղ՝Ֆ", (byte)113, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_392.var_java_lang_String_arr_d[0] = NLoginCore_223.C("՜ԻհճՑղՒե՝՛գջցՋպՇդբղ՟֍Ցյՠչթ֒֜կ֝։֟", (byte)113, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_392.var_java_lang_String_arr_d[0] = NLoginCore_324.A("ǊƥƵƳƗǗƞǂƺƺƱǕǒǀƨǄǢƾǟǗǝǇƴƵ", (byte)113, 65);
                }
            }
        }
    }

    static {
        var_int_d = Integer.reverse(0);
        e = (-1 >>> 25 | -1 << ~25 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-921913208416631628L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (-1 >>> 246 | -1 << ~246 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-921913208416631628L);
        l = Integer.reverse(0x40000000);
        m = (-1 >>> 249 | -1 << ~249 + 1) & 0xFFFFFFFF;
        n = Long.reverse(-921913208416631628L);
        o = Integer.reverse(-1073741824);
        q = Long.reverse(3257427245783188660L);
        r = Long.reverse(-2449958197289549824L);
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-921913208416631628L);
        u = 1280 >>> 8 | 1280 << ~8 + 1;
        v = Integer.reverse(-1);
        w = Long.reverse(-921913208416631628L);
        y = 384 >>> 166 | 384 << -166;
        aa = Long.reverse(3257427245783188660L);
        ab = Long.reverse(-2449958197289549824L);
        ac = 1792 >>> 40 | 1792 << -40;
        ad = Integer.reverse(-1);
        ae = Long.reverse(-921913208416631628L);
        af = 0x20000000 >>> 58 | 0x20000000 << -58;
        ag = Long.reverse(3257427245783188660L);
        ah = Long.reverse(-2449958197289549824L);
        ai = Integer.reverse(-1879048192);
        aj = Long.reverse(3257427245783188660L);
        al = Long.reverse(-2449958197289549824L);
        am = 10240 >>> 10 | 10240 << ~10 + 1;
        an = (-1 >>> 223 | -1 << -223) & 0xFFFFFFFF;
        ao = Long.reverse(-921913208416631628L);
        ap = (352 >>> 197 | 352 << -197) & 0xFFFFFFFF;
        aq = Long.reverse(3257427245783188660L);
        ar = Long.reverse(-2449958197289549824L);
        as = 786432 >>> 80 | 786432 << ~80 + 1;
        au = Integer.reverse(0x30000000);
        c = new String[as];
        var_java_lang_String_arr_d = new String[au];
        NLoginCore_392.b();
    }

    private static String a(int n, long l) {
        l ^= 0x7BL;
        l ^= 0xF08E477969E885B9L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(11 + 58), (byte)(6 + 77), (byte)(44 + 3), (byte)(8 + 59), (byte)(15 + 51), (byte)(23 + 44), 47, (byte)(64 + 16), (byte)(4 + 71), (byte)(13 + 54), 83, (byte)(21 + 32), (byte)(47 + 33), (byte)(46 + 51), (byte)(32 + 68), (byte)(9 + 91), (byte)(24 + 81), (byte)(61 + 49), (byte)(63 + 40)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.A("ĊėĖÙęĕĐęĤēàĞĢěĞĤæѠљѰѻѐѹҀѼѹѴ҆ѼѵѾљ", (byte)20, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_392.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    @Override
    protected void a(Properties properties, boolean bl) {
        super.a(properties, bl);
        properties.remove(NLoginCore_392.c("㺀", (int)(am & an), (long)ao));
        properties.remove(NLoginCore_392.c("㺃", (int)ap, (long)(aq ^ ar)));
    }

    @Override
    protected String java_lang_String_a(NLoginCore_147 NLoginCore_147) {
        return (String)NLoginCore_392.c("㺀", (int)(i & j), (long)k) + NLoginCore_147.x() + (String)NLoginCore_392.c("㺃", (int)(l & m), (long)n) + NLoginCore_147.int_j() + (String)NLoginCore_392.c("㺆", (int)o, (long)(q ^ r)) + NLoginCore_147.y();
    }

    @Override
    protected String w() {
        return NLoginCore_392.c("㺀", (int)(var_int_d & e), (long)h);
    }

    private NLoginCore_392(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer, NLoginCore_536 NLoginCore_5362) {
        super(NLoginCore_036.var_com_nickuc_login_NLoginCore_036_e, NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_5362);
    }

    public static NLoginCore_392 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return NLoginCore_392.a(NLoginInterface_0112, NLoginCore_147, null);
    }

    public static NLoginCore_392 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer) {
        return new NLoginCore_392(NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_a);
    }

    @Override
    protected void a(HikariConfig hikariConfig, NLoginCore_147 NLoginCore_147) {
        hikariConfig.setDataSourceClassName((String)NLoginCore_392.c("㺀", (int)s, (long)t));
        hikariConfig.addDataSourceProperty((String)NLoginCore_392.c("㺃", (int)(u & v), (long)w), (Object)NLoginCore_147.x());
        hikariConfig.addDataSourceProperty((String)NLoginCore_392.c("㺆", (int)y, (long)(aa ^ ab)), (Object)Integer.toString(NLoginCore_147.int_j()));
        hikariConfig.addDataSourceProperty((String)NLoginCore_392.c("㺉", (int)(ac & ad), (long)ae), (Object)NLoginCore_147.y());
        hikariConfig.addDataSourceProperty((String)NLoginCore_392.c("㺌", (int)af, (long)(ag ^ ah)), (Object)NLoginCore_147.z());
        hikariConfig.addDataSourceProperty((String)NLoginCore_392.c("㺏", (int)ai, (long)(aj ^ al)), (Object)NLoginCore_147.java_lang_String_j());
    }

    public static NLoginCore_392 b(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return new NLoginCore_392(NLoginInterface_0112, NLoginCore_147, null, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_b);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_392.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.B("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 66), NLoginCore_392.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.A("İĽļÿĿĻĶĿŊĹĆńňŁńŊČ҆ѿҖҡѶҟҦҢҟҚҬҢқҤѿħ", (byte)39, 65) + string + NLoginCore_091.B("ć", (byte)39, 66) + methodType.toString(), exception);
        }
    }
}

