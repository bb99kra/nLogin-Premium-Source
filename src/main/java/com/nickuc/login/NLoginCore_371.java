/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_109;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_123;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.BedrockFloodgateHook;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_259;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_489;
import com.nickuc.login.NLoginCore_180;
import com.nickuc.login.NLoginCore_454;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_371 {
    private static int ce;
    private static int r;
    private static long dp;
    private static int aj;
    private static int eq;
    private static int bg;
    private static int ed;
    private static int bw;
    private static long et;
    private static int cc;
    private static int bl;
    private static long co;
    private static int am;
    private static long cq;
    private static long ck;
    private static String[] var_java_lang_String_arr_b;
    private static long cy;
    private static int az;
    private static long ah;
    private static long eo;
    private static int eg;
    private static int cm;
    private static long ek;
    private static int bk;
    private static long f;
    private static long cv;
    private static long ew;
    private static long bv;
    private static long i;
    private static int ev;
    private static int au;
    private static long cb;
    private static int cp;
    private static int ba;
    private static long l;
    private static int al;
    private static long ea;
    private static int ez;
    private static long cn;
    private static int as;
    private static int ak;
    private static int dt;
    private static int bi;
    private static long db;
    private static long ar;
    private static int g;
    private static int bm;
    private static long q;
    private static long ec;
    private static final AtomicInteger var_java_util_concurrent_atomic_AtomicInteger_b;
    private static int dk;
    private static int em;
    private static long er;
    private static long bs;
    private static int eb;
    private static int v;
    private static long ds;
    private static int av;
    private static int dq;
    private static int bf;
    private static long ei;
    private static int ey;
    private static int cg;
    private static long dm;
    private static long bn;
    private static int es;
    private static int var_int_b;
    private static int dy;
    private static long dl;
    private static long n;
    private static int cr;
    private static int bz;
    private static long cu;
    private static int bo;
    private static long el;
    private static long bu;
    private static int dd;
    private static int dr;
    private static long ex;
    private static int aw;
    private static int ap;
    private static final AtomicLong var_java_util_concurrent_atomic_AtomicLong_c;
    private static final Cache<String, NLoginCore_259> cfr_renamed_21;
    private static long eh;
    private static int bh;
    private static long by;
    private static long bq;
    private static long d;
    private static int af;
    private static int de;
    private static long cs;
    private static long du;
    private static int br;
    private static long var_long_c;
    private static long dw;
    private static int dv;
    private static int p;
    private static int df;
    private static int var_int_k;
    private static int u;
    private static int cj;
    private static int dc;
    private static long fb;
    private static int ep;
    private static int ai;
    private static long w;
    private static long t;
    private static long bp;
    private static long bd;
    private static int bx;
    private static long ao;
    private static volatile long z;
    private static int ax;
    private static long ab;
    private static int dh;
    private static long cfr_renamed_1;
    private static int dn;
    private static long cl;
    private static int fa;
    private static int h;
    private static int ej;
    private static long ae;
    private static String[] var_java_lang_String_arr_a;
    private static int aq;
    private static int be;
    private static long ag;
    private static long ca;
    private static int var_int_a;
    private static long ci;
    private static int ct;
    private static long cx;
    private static int dx;
    private static long bt;
    private static long ch;
    private static int cd;
    private static int cz;
    private static long dj;
    private static long di;
    private static int at;
    private static long ad;
    private static int cf;
    private static int ef;
    private static long aa;
    private static int dg;
    private static int j;
    private static long ee;
    private static int bc;
    private static int bj;
    private static int m;
    private static long da;
    private static long s;
    private static int ay;
    private static volatile long var_long_y;
    private static int cw;
    private static int var_int_y;
    private static long en;
    private static long dz;
    private static int ac;
    private static int an;
    private static int o;
    private static long x;
    private static int bb;
    private static long eu;
    private static int e;

    public static NLoginCore_123 a(NLoginCore_116<?> NLoginInterface_0112, String string, String string2, @Nullable String string3) {
        NLoginCore_305 NLoginCore_305 = NLoginCore_305.a();
        NLoginCore_364 NLoginCore_3642 = NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b();
        NLoginCore_305.k((String)NLoginCore_371.c("㺀", (int)v, (long)(w ^ x)), NLoginCore_3642.q());
        NLoginCore_305.k((String)NLoginCore_371.c("㺃", (int)var_int_y, (long)(aa ^ ab)), (String)NLoginCore_371.c("㺆", (int)ac, (long)(ad ^ ae)));
        Object[] objectArray = new Object[ai];
        objectArray[NLoginCore_371.aj] = BedrockFloodgateHook.cI;
        objectArray[NLoginCore_371.ak] = string;
        objectArray[NLoginCore_371.al] = string2;
        objectArray[NLoginCore_371.am] = string3 == null ? NLoginCore_371.c("㺌", (int)an, (long)ao) : (String)NLoginCore_371.c("㺏", (int)(ap & aq), (long)ar) + string3;
        return NLoginCore_305.a(String.format((String)NLoginCore_371.c("㺉", (int)af, (long)(ag ^ ah)), objectArray));
    }

    private static String a(int n, long l) {
        l ^= 0x3BL;
        l ^= 0xB56CF24FACB0268EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(3 + 66), (byte)(72 + 11), (byte)(42 + 5), 67, (byte)(16 + 50), (byte)(28 + 39), (byte)(11 + 36), (byte)(48 + 32), (byte)(13 + 62), (byte)(50 + 17), (byte)(48 + 35), (byte)(12 + 41), (byte)(49 + 31), (byte)(82 + 15), (byte)(24 + 76), (byte)(58 + 42), (byte)(91 + 14), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.F("Քաՠԣգ՟՚գծ՝Ԫըլեըծ԰ࢳࣁࢿ࣍ࢷࣉࢮ࣎ࢾࢿࢬࣃ࣓࣋", (byte)53, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_371.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static boolean a(@Nullable NLoginCore_259 NLoginCore_2592, UUID uUID) {
        if (uUID.version() != av) {
            return aw != 0;
        }
        NLoginCore_555 NLoginCore_5552 = BCryptHashProvider.c();
        switch (NLoginCore_489.S[NLoginCore_5552.ordinal()]) {
            case 1: {
                return ax != 0;
            }
            case 2: {
                return ay != 0;
            }
            case 3: {
                return (NLoginCore_2592 == null || uUID.equals(NLoginCore_2592.java_util_UUID_b()) ? az : ba) != 0;
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_371.c("㺀", (int)(bb & bc), (long)bd) + (Object)((Object)NLoginCore_5552));
    }

    @Nullable
    public static NLoginCore_259 a(NLoginCore_116<?> NLoginInterface_0112, String string, boolean bl) {
        return NLoginCore_371.a(NLoginInterface_0112, (String)NLoginCore_371.c("㺀", (int)bo, (long)(bp ^ bq)), string, bl);
    }

    public static boolean a(NLoginCore_116<?> NLoginInterface_0112, @Nullable NLoginCore_259 NLoginCore_2592, String string) {
        if (NLoginCore_2592 == null) {
            NLoginCore_2592 = NLoginCore_371.a(NLoginInterface_0112, string, as != 0);
        }
        return (NLoginCore_2592 == null || NLoginCore_2592.java_util_UUID_b() != null ? at : au) != 0;
    }

    public static boolean a(NLoginCore_116<?> NLoginInterface_0112, UUID uUID) {
        if (uUID.version() != be) {
            return bf != 0;
        }
        NLoginCore_555 NLoginCore_5552 = BCryptHashProvider.c();
        switch (NLoginCore_489.S[NLoginCore_5552.ordinal()]) {
            case 1: {
                return bg != 0;
            }
            case 2: {
                return bh != 0;
            }
            case 3: {
                NLoginCore_259 NLoginCore_2592 = NLoginCore_371.a(NLoginInterface_0112, uUID, bi != 0);
                return (NLoginCore_2592 == null || NLoginCore_2592.java_util_UUID_b() != null ? bj : bk) != 0;
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_371.c("㺀", (int)(bl & bm), (long)bn) + (Object)((Object)NLoginCore_5552));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_371.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.F("ԑԳԵԕԹ՘ՐզՒԡ՟Օգ՝ԦՋխլդժդԹ", (byte)45, 70), NLoginCore_371.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘқҩҧҵҟұҖҶҦҧҔҫһҳĲ", (byte)45, 65) + string + NLoginCore_201.A("ē", (byte)45, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -8906340186839311540L;
        long l = var_long_c ^ 0xB56CF24FACB0268EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(65 + 4), (byte)(63 + 20), (byte)(27 + 20), 67, (byte)(25 + 41), 67, (byte)(32 + 15), (byte)(16 + 64), (byte)(68 + 7), (byte)(64 + 3), (byte)(68 + 15), (byte)(33 + 20), (byte)(15 + 65), (byte)(71 + 26), (byte)(83 + 17), (byte)(66 + 34), (byte)(82 + 23), (byte)(108 + 2), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_371.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ƢƳƘǅƳǤƺƶǅƨƥƳ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[1] = NLoginCore_427.F("֊֭֭֠պ֞֐֌ֱ֧֧պ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[2] = NLoginCore_201.C("ՆպՊ֔֊Ցդե՗։֘յըհՐխ՘՜֝ղ֌֓ժի", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[3] = NLoginCore_076.D("ռչ֒՟ըդՈ֘֒թՙ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[4] = NLoginCore_387.A("ǂǍơǔǖƾƹƻǣǈǨƫǬǛǯǪǠǍǖǌƳǁƾƿ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[5] = NLoginCore_076.E("֭֗֔պփտգֳ֭քմպ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[6] = NLoginCore_446.B("ǂǍơǔǖƾƹƻǣǈǨƫǬǛǯǪǠǍǖǌƳǁƾƿ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[7] = NLoginCore_559.F("֕֋֥֭֮֝֬ժւֲլխշ֪֙֗ոַ֗֜֠־օֆ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ǙǆǅǦƹǇƺǋǨƧƿǭƫƱǠƳǌǳƴǳǴǧƾƿ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[9] = NLoginCore_201.C("Շ՜եջ֊֍բ֖կօ֐֗ֆ՗֘՜ց՞֍ծ֑ձն֑դնր֙տժտ֎", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[10] = NLoginCore_324.F("ե֦ւ֬֡պտ։֢֊կք֥հօָփ֋֦֍ֲֵָ֪֯֞֍ֳֺּֽ֙֨֡֡׌֙בּד֏֯׊ֱבֲֲֶ֪֮֫׈זד֮הֵנֳט־׀ֳָןס֦֩׬֦֨׊׌ען׊ז׀ׂ׳וֲב״לטׅ׆", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[11] = NLoginCore_004.B("ƠƵƤƲǙƩǝǋƾǃƭƳ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[12] = NLoginCore_138.E("գ֦էնծժ֒֞։վ֕պ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[13] = NLoginCore_110.F("֡֍֛ռըվց։հռֈ֖֔ծֶ֘֌ք֊֋ְֲշ֝֘ռ֚׀ֺ֦׉ׁ֢ׄ׈ֻ֗ևׄדֵ֣֚֜", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[14] = NLoginCore_027.C("ֆղրաՍգզծՕախջչՓս֛ձթկհ֗֕՜ւսատ֥֟֋֮֩և֦֭ռ֠լָ֩ֈց֚տ", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[15] = NLoginCore_575.C("֌ե֍ՎՊՐՎևչ՗Փ֕Օօևճ֐ցղ֜հղկ֛գչչա֕ե֘ոօձռְև֌ֲցհ֌֖֑֯կյև֖֜ռ֖ׄ֠սֱօ׉׈ֹ֧֚։֑֗֡׈֫֓֒׌ְ֫יִ֧֫׆ֱ׊׉ֿ֢֢֛נֹח֥֨טמ׭רַ֧", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[16] = NLoginCore_027.E("֧ր֨թեիթ֢֔ղծְհ֢֠֎֫֜֍ַ֋֍֊ֶվ֔֔ռְրֳ֓֠֌֗׋֢֧׍֜֋֧׊גֲ׈ֹ׈ֶָ֭֐ג֚֠֞יְםׅח׆ץנ֥ץםס־֭֫ר׬׊ׁצב׸׷׸רֵֻ׋׺סכ׺יב׿ָ؇ן׿׀", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[17] = NLoginCore_201.D("ժ֋ֆ֋տզծ֎յ֗ժ՘մջ֒Ցլյ֍կռ֠֕ո֩և֟֟ցք֙֞թը֑֒֓ս֒կձָ֑֘ֆչ֌։պֵ֖ց֡վׇ֧֣֒֒֔֝׋׌ְ֭֮׏֍֐׌׋֒֒ׄא֟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[18] = NLoginCore_138.A("ƿǁƣǀơǡǆǨƽǌƽǋƿǮǭǋǀǬǋǨǎǑƾƿ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[19] = NLoginCore_138.B("ƠƵƤƲǙƩǝǋƾǃƭƳ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[20] = NLoginCore_027.A("ǍƞǏǂǨǃǧǞǂƸǈƬǩǬǌǓǰƾƾǮǶǑƾƿ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[21] = NLoginCore_201.F("էռիչ֠հ֤֒օ֊մպ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[22] = NLoginCore_575.D("՛հվբց֍փե֑կնպՙ֎֗յ֋֛֢֑՟֣ժի", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[23] = NLoginCore_091.B("ƻƮƲǥƨǗǟƻǪƨƻǮƸǬǦƻǠǵǪǓǕǑƾƿ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[24] = NLoginCore_138.C("հգ֋ՓՎժՓՕզ֔Օ՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[25] = NLoginCore_027.D("սջհռտՐվ֗֏մպ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[26] = NLoginCore_559.D("Վ՟Մձ՟֐զբձՔՑ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[27] = NLoginCore_575.E("֊֭֭֠պ֞֐֌ֱ֧֧պ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[28] = NLoginCore_201.D("Վ՟Մձ՟֐զբձՔՑ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[29] = NLoginCore_091.F("֊֭֭֠պ֞֐֌ֱ֧֧պ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[30] = NLoginCore_092.D("ևՃգ՛սխ֍ժշմ֔՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[31] = NLoginCore_138.C("ևՃգ՛սխ֍ժշմ֔՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[32] = NLoginCore_173.F("բ֖֙ւէ֣֯֍լժ֔լֲ֣֯֌֐֋ֱ֜֋׀ָցֵֶֶֺֿ֑֦ׄ֕ׄ֊֦֫ւְׂ֑֢֥א׎׈׈֙זל֝ןּ׎֥֦", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[33] = NLoginCore_427.F("պ֌֡֊֥֐֫դ֢֣֔ծճփնֻ֏֍֎ְֶֶֿׂջֿս׃׀ִׄ֞և׆ָֹ֚֩׋ֲ֛֐ֱ֚", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[34] = NLoginCore_324.D("Նգր֓Փէլկՠէ֘՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[35] = NLoginCore_138.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǞȉȇȁȁǒȏȕǖȘǵȇǞǟ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[36] = NLoginCore_091.E("է֦֫և֦֟֯֯ևծ֐ַ֤֠֡օֺֻ֧֓֝֊֢֑֛֭֓־ֳָֽ֤׉ֵ֟׀א׌փִ֤ׄ׋֚", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[37] = NLoginCore_559.D("Նգր֓Փէլկՠէ֘՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[38] = NLoginCore_324.D("ՇջվէՌ֔ֈղՑՏչՑ֗ֈ֔ձյհ֖ցհ֥֝զ֩պ֛֛֚֟ն֤֩֋կ֐֋էն֧֕և֊ֳֵ֭֭վֻׁւֳׄ֡֊֋", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[39] = NLoginCore_324.C("Ջք֍՞֏Փ։զֈօպ֌և֛վըմ֋֣֖ւպՠդ։եյ֧ֆչ֣֞հ֯։֦֨֫ճկւֺ֦֑֔֩֞֙׀ָ֢֮֍ֳ֊֋", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[40] = NLoginCore_027.B("ƚƷǔǧƧƻǀǃƴƻǬƳ", (byte)118, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_371.var_java_lang_String_arr_b[0] = NLoginCore_138.C("Չտ՝ՋՆՓօ֗֔ղՙ՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ǙǏǕǇƥǡǧǣǦǉǇǣǩǙǫǬǬǭƯƭƳǧƾƿ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[2] = NLoginCore_446.D("ՆպՊ֔֊Ցդե՗։֛Ք֒ի֎֍֐֗՘ձ֎֓ժի", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[3] = NLoginCore_004.C("՞՝֓֐ՑւՏի՗ծՙ՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[4] = NLoginCore_027.D("ծչՍրւժեէ֏մ֗֓Ւ֑ձ֗ՠծ֞՟֚խժի", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[5] = NLoginCore_387.B("ƞǔǂǣǑƳƷƷƦƫǝǈƼǭƮǉƼǱƳǳƳǑƾƿ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[6] = NLoginCore_559.F("։֔ը֛֝օրւ֪֏ְքִֶֆ֯ք֍ֈ֯֐־օֆ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[7] = NLoginCore_091.C("պհ֊֒ւ֑֓Տէ֗ՒՖի֋ժ֠՞ղ֎լ֍֓ժի", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[8] = NLoginCore_223.C("օղձ֒եճզշ֔Փժ՗։֚՘չ֛֖միչ֓ժի", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[9] = NLoginCore_559.C("Շ՜եջ֊֍բ֖կօ֐֗ֆ՗֘՜ց՞֍ծ֑ճ֔ոփ։֣չ֗֗ո֠", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[10] = NLoginCore_027.B("ƞǟƻǥǚƳƸǂǛǃƨƽǞƩƾǱƼǄǟǆǨǣǫǮǗǱǆǬǵǳǒǡǚǶǚȅǒȊǵȌǈǨȃǪȊǤǧǫǫǯǣȁȏȌǧȍǮșǬȑǷǹǱǬȘȚǟǢȥǟǡȃȅțȘȢȮǪȦǬȀȨȱȑǪȷǾǿ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[11] = NLoginCore_324.C("ՠտՉ֎օբ֔դձքֈ՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[12] = NLoginCore_027.E("ռֈ֩֌ե֫֟ս֤֟ցպ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[13] = NLoginCore_575.B("ǚǆǔƵơƷƺǂƩƵǁǏǍƧǑǯǅƽǃǄǫǩưǖǑƵǓǹǳǟȂǽǄǘǕǜǘȊǓȄǸǤȍǢǚǹǲȅȅȕȒȔȖǱǞǟ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[14] = NLoginCore_223.C("ֆղրաՍգզծՕախջչՓս֛ձթկհ֗֕՜ւսատ֥֟֋֮֩հկ֏֋֪֔փֱր֭լֿ֫֙֞֍ֺּ׀յւ׃֊֋", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[15] = NLoginCore_091.A("ǠƹǡƢƞƤƢǛǍƫƧǩƩǙǛǇǤǕǆǰǄǆǃǯƷǍǍƵǩƹǬǌǙǅǐȄǛǠȆǕǄǠȃǪǥǃǉǛǰǪǐȘǪǴǑȅǙȝȜǮǻȍǝǫǵǥȜǿǧǦȠǿȄȭȈǿǻȚȅȞȝȓǶǶǯȵǲȜȖǵȺȇȭȒȝɃȳɂȥȼȁȶȄȫȫɈɌȓ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[16] = NLoginCore_004.F("֧ր֨թեիթ֢֔ղծְհ֢֠֎֫֜֍ַ֋֍֊ֶվ֔֔ռְրֳ֓֠֌֗׋֢֧׍֜֋֧׊גֲ׈ֹ׈ֶָ֭֐ג֚֠֞יְםׅח׆ץנ֥ץםס־֭֫ר׬׊ׁצב׸׷׸רֵֻ׋׺םָ؀כם׎׎׽؄׺׾ׇ׷׽׶؉מ؁׻׬؆؏ך", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[17] = NLoginCore_223.C("ժ֋ֆ֋տզծ֎յ֗ժ՘մջ֒Ցլյ֍կռ֠֕ո֩և֟֟ցք֙֞թը֑֒֓ս֒կձָ֑֘ֆչ֌։պֵ֖ց֡վׇ֧֣֒֒֔֝׋׌ְ׋ג֛֫׋ג֎֣ׄהֳ֨י֏ֳ֫אָג׌ו֪֭֫", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[18] = NLoginCore_027.E("ֆֈժևը֨֍֯ք֓փւ֍֣ևּֽ֘֌֏֛־օֆ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[19] = NLoginCore_559.C("Ղչ֌փ՝Շժէօ֒ՙ՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[20] = NLoginCore_451.E("֔ե֖։֯֊֥֮։տ֐ղտֵյնմ֩նջ֎֮օֆ", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[21] = NLoginCore_091.D("հ։՟՛Փ֐֔ժ֘ևղ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[22] = NLoginCore_453.A("ƯǄǒƶǕǡǗƹǥǃǍǏǨǌǡǢƫǐǄǩǉǑƾƿ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[23] = NLoginCore_575.D("է՚՞֑Քփ֋է֖Քթևժս՞՝՗՞֡֡մեֆտձֈ֥֦ք֨տ֘", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[24] = NLoginCore_427.F("֠պն֘֙ծ֑֑֫֞ծ֖մծկ֪֖֧֮֙֝ֈօֆ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[25] = NLoginCore_027.C("ՙՈռգ֒փղՓւին՟", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[26] = NLoginCore_387.B("ƢƳǒƣǣǡǥƶƿǡǘƳ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[27] = NLoginCore_223.C("եՏ֊ճևդՑօ֑ցՑ։֛Տֆմթղմ֋ս֣ժի", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[28] = NLoginCore_223.B("ǢǁǚƝǂƩǆǧǝǬǨƳ", (byte)118, 66);
                    NLoginCore_371.var_java_lang_String_arr_b[29] = NLoginCore_427.A("ƞƼǧƦƟǞǆǀǋǌǘƳ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[30] = NLoginCore_223.C("֑֎Պխը֖ՌՉքկ֊֋ըյՐվ֓֞֌֘՚սժի", (byte)118, 67);
                    NLoginCore_371.var_java_lang_String_arr_b[31] = NLoginCore_387.D("Վ՜հկքլ՞ց֋եծ՟", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[32] = NLoginCore_559.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǡǼǢȌǮǯǣȐǡǤǱǕǒȎǸǚǹǑȓȒȁȠ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[33] = NLoginCore_451.F("պ֌֡֊֥֐֫դ֢֣֔ծճփնֻ֏֍֎ְֶֶֿׂջֿս׃׀ִַׄ֞֕֟֠֎֥֊֑֑ׅ׃֚", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[34] = NLoginCore_223.F("֗֩տ֊֙֟֝֠֫րլպ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[35] = NLoginCore_076.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǟǼȌǾȒȎǍȃǓȇǦȗǞǟ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[36] = NLoginCore_138.D("Ռ֋֐լք֔֋֔լՓյ։օ֜ֆժու֌֠֟կոև֒նր֣֘֝։֢ջ֌֟֜֠րքֱ֩֬֬տ", (byte)118, 68);
                    NLoginCore_371.var_java_lang_String_arr_b[37] = NLoginCore_004.F("շ֩թ֣ք֪֮֠ւ֤սպ", (byte)118, 70);
                    NLoginCore_371.var_java_lang_String_arr_b[38] = NLoginCore_387.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǡǽȌǈǪǪȂǓǕȐȁȁǌȘȓȆȊǵǛǪǹǛ", (byte)118, 65);
                    NLoginCore_371.var_java_lang_String_arr_b[39] = NLoginCore_076.E("զ֟֨չ֪ծ֤ցֶ֣֧֢֠֕֙փ֏֦־ֱ֝֕ջտ֤ր֐ׂ֡֔־ֹ֋׊֤׃ׁ׆֎֊֝וֿ֯גגֳׄ֔׎ׇָ֛֥֦֚", (byte)118, 69);
                    NLoginCore_371.var_java_lang_String_arr_b[40] = NLoginCore_004.C("ֈֈՎ֓աքյՏև֊ՙ՟", (byte)118, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_371.var_java_lang_String_arr_b[0] = NLoginCore_223.D("սռլՋՠ֌֔Վժ֗֔՟", (byte)118, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_371.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ǖǐƥǟƳǙǀǩƦƵǯƥǅǪƨưǨǞǤǌǌǚǋƳǕǸǴǼǬƾǡǮ", (byte)118, 66);
                }
            }
        }
    }

    @Nullable
    public static NLoginCore_259 a(NLoginCore_116<?> NLoginInterface_0112, UUID uUID, boolean bl) {
        return NLoginCore_371.a(NLoginInterface_0112, (String)NLoginCore_371.c("㺀", (int)br, (long)(bs ^ bt)), NLoginCore_432.b(uUID), bl);
    }

    public static NLoginCore_259 a(String string) {
        JSONObject jSONObject = new JSONObject(string);
        UUID uUID = NLoginCore_432.c(jSONObject.getString((String)NLoginCore_371.c("㺀", (int)(var_int_a & var_int_b), (long)d)));
        String string2 = jSONObject.getString((String)NLoginCore_371.c("㺃", (int)e, (long)f));
        JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginCore_371.c("㺆", (int)(g & h), (long)i));
        ArrayList<NLoginCore_454> arrayList = new ArrayList<NLoginCore_454>();
        for (int i = j; i < jSONArray.length(); ++i) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (!jSONObject2.has((String)NLoginCore_371.c("㺉", (int)var_int_k, (long)l)) || !jSONObject2.has((String)NLoginCore_371.c("㺌", (int)m, (long)n))) continue;
            arrayList.add(new NLoginCore_454(jSONObject2.getString((String)NLoginCore_371.c("㺏", (int)(o & p), (long)q)), jSONObject2.getString((String)NLoginCore_371.c("㺒", (int)r, (long)(s ^ t)))));
            break;
        }
        return new NLoginCore_259(uUID, string2, arrayList.toArray(new NLoginCore_454[u]));
    }

    static {
        var_int_a = 0 >>> 187 | 0 << -187;
        var_int_b = -1 >>> 199 | -1 << -199;
        d = Long.reverse(-1236214674785409503L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-1236214674785409503L);
        g = Integer.reverse(0x40000000);
        h = Integer.reverse(-1);
        i = Long.reverse(-1236214674785409503L);
        j = 0 >>> 133 | 0 << -133;
        var_int_k = -2147483647 >>> 127 | -2147483647 << ~127 + 1;
        l = Long.reverse(-1236214674785409503L);
        m = (65536 >>> 14 | 65536 << ~14 + 1) & 0xFFFFFFFF;
        n = Long.reverse(-1236214674785409503L);
        o = 327680 >>> 80 | 327680 << -80;
        p = -1 >>> 28 | -1 << -28;
        q = Long.reverse(-1236214674785409503L);
        r = Integer.reverse(0x60000000);
        s = Long.reverse(3663701719793690145L);
        t = Long.reverse(-2594073385365405696L);
        u = Integer.reverse(0);
        v = Integer.reverse(-536870912);
        w = Long.reverse(3663701719793690145L);
        x = Long.reverse(-2594073385365405696L);
        var_int_y = Integer.reverse(0x10000000);
        aa = Long.reverse(3663701719793690145L);
        ab = Long.reverse(-2594073385365405696L);
        ac = Integer.reverse(-1879048192);
        ad = Long.reverse(3663701719793690145L);
        ae = Long.reverse(-2594073385365405696L);
        af = Integer.reverse(0x50000000);
        ag = Long.reverse(3663701719793690145L);
        ah = Long.reverse(-2594073385365405696L);
        ai = Integer.reverse(0x20000000);
        aj = Integer.reverse(0);
        ak = (16384 >>> 14 | 16384 << ~14 + 1) & 0xFFFFFFFF;
        al = Integer.reverse(0x40000000);
        am = 0x1800000 >>> 23 | 0x1800000 << ~23 + 1;
        an = -1342177280 >>> 60 | -1342177280 << -60;
        ao = Long.reverse(-1236214674785409503L);
        ap = 24576 >>> 235 | 24576 << -235;
        aq = -1 >>> 103 | -1 << -103;
        ar = Long.reverse(-1236214674785409503L);
        as = Integer.reverse(0);
        at = (0x8000000 >>> 219 | 0x8000000 << -219) & 0xFFFFFFFF;
        au = Integer.reverse(0);
        av = 4 >>> 128 | 4 << ~128 + 1;
        aw = Integer.reverse(0);
        ax = Integer.reverse(0);
        ay = 0x2000000 >>> 185 | 0x2000000 << -185;
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Integer.reverse(0);
        bb = 0x3400000 >>> 118 | 0x3400000 << ~118 + 1;
        bc = Integer.reverse(-1);
        bd = Long.reverse(-1236214674785409503L);
        be = 0x400000 >>> 84 | 0x400000 << -84;
        bf = Integer.reverse(0);
        bg = (0 >>> 166 | 0 << -166) & 0xFFFFFFFF;
        bh = 0x8000000 >>> 155 | 0x8000000 << ~155 + 1;
        bi = (0 >>> 178 | 0 << -178) & 0xFFFFFFFF;
        bj = 0x4000000 >>> 58 | 0x4000000 << -58;
        bk = Integer.reverse(0);
        bl = Integer.reverse(0x70000000);
        bm = Integer.reverse(-1);
        bn = Long.reverse(-1236214674785409503L);
        bo = 3840 >>> 8 | 3840 << ~8 + 1;
        bp = Long.reverse(3663701719793690145L);
        bq = Long.reverse(-2594073385365405696L);
        br = (64 >>> 194 | 64 << -194) & 0xFFFFFFFF;
        bs = Long.reverse(3663701719793690145L);
        bt = Long.reverse(-2594073385365405696L);
        bu = Long.reverse(1827335548805578752L);
        bv = Long.reverse(1711367858400788480L);
        bw = (0 >>> 183 | 0 << -183) & 0xFFFFFFFF;
        bx = (6400 >>> 7 | 6400 << ~7 + 1) & 0xFFFFFFFF;
        by = Long.reverse(561014812956426240L);
        bz = Integer.reverse(-2013265920);
        ca = Long.reverse(3663701719793690145L);
        cb = Long.reverse(-2594073385365405696L);
        cc = Integer.reverse(0);
        cd = (10240 >>> 139 | 10240 << -139) & 0xFFFFFFFF;
        ce = 0 >>> 199 | 0 << -199;
        cf = Integer.reverse(-1610612736);
        cg = Integer.reverse(0x48000000);
        ch = Long.reverse(3663701719793690145L);
        ci = Long.reverse(-2594073385365405696L);
        cj = 0x4C000000 >>> 58 | 0x4C000000 << -58;
        ck = Long.reverse(3663701719793690145L);
        cl = Long.reverse(-2594073385365405696L);
        cm = 0x40000001 >>> 60 | 0x40000001 << -60;
        cn = Long.reverse(3663701719793690145L);
        co = Long.reverse(-2594073385365405696L);
        cp = Integer.reverse(-1476395008);
        cq = Long.reverse(-1236214674785409503L);
        cr = 360448 >>> 46 | 360448 << -46;
        cs = Long.reverse(-1236214674785409503L);
        ct = Integer.reverse(-402653184);
        cu = Long.reverse(3663701719793690145L);
        cv = Long.reverse(-2594073385365405696L);
        cw = Integer.reverse(0x18000000);
        cx = Long.reverse(3663701719793690145L);
        cy = Long.reverse(-2594073385365405696L);
        cz = 409600 >>> 206 | 409600 << ~206 + 1;
        da = Long.reverse(3663701719793690145L);
        db = Long.reverse(-2594073385365405696L);
        dc = 262144 >>> 16 | 262144 << -16;
        dd = (0 >>> 145 | 0 << ~145 + 1) & 0xFFFFFFFF;
        de = -1342177273 >>> 92 | -1342177273 << -92;
        df = (4 >>> 162 | 4 << ~162 + 1) & 0xFFFFFFFF;
        dg = 0xFA0000 >>> 145 | 0xFA0000 << ~145 + 1;
        dh = (0x6800000 >>> 118 | 0x6800000 << -118) & 0xFFFFFFFF;
        di = Long.reverse(3663701719793690145L);
        dj = Long.reverse(-2594073385365405696L);
        dk = 3456 >>> 7 | 3456 << -7;
        dl = Long.reverse(3663701719793690145L);
        dm = Long.reverse(-2594073385365405696L);
        dn = (-1073741823 >>> 156 | -1073741823 << ~156 + 1) & 0xFFFFFFFF;
        cfr_renamed_1 = Long.reverse(3663701719793690145L);
        dp = Long.reverse(-2594073385365405696L);
        dq = Integer.reverse(-1207959552);
        dr = (-1 >>> 223 | -1 << -223) & 0xFFFFFFFF;
        ds = Long.reverse(-1236214674785409503L);
        dt = Integer.reverse(0x78000000);
        du = Long.reverse(-1236214674785409503L);
        dv = 0x7C000000 >>> 26 | 0x7C000000 << -26;
        dw = Long.reverse(-1236214674785409503L);
        dx = 0 >>> 93 | 0 << -93;
        dy = Integer.reverse(0x4000000);
        dz = Long.reverse(3663701719793690145L);
        ea = Long.reverse(-2594073385365405696L);
        eb = 0x10800000 >>> 183 | 0x10800000 << ~183 + 1;
        ec = Long.reverse(-1236214674785409503L);
        ed = (0x11000000 >>> 119 | 0x11000000 << ~119 + 1) & 0xFFFFFFFF;
        ee = Long.reverse(-1236214674785409503L);
        ef = (0 >>> 28 | 0 << -28) & 0xFFFFFFFF;
        eg = Integer.reverse(-1006632960);
        eh = Long.reverse(3663701719793690145L);
        ei = Long.reverse(-2594073385365405696L);
        ej = Integer.reverse(0x24000000);
        ek = Long.reverse(3663701719793690145L);
        el = Long.reverse(-2594073385365405696L);
        em = Integer.reverse(-1543503872);
        en = Long.reverse(3663701719793690145L);
        eo = Long.reverse(-2594073385365405696L);
        ep = (0 >>> 114 | 0 << ~114 + 1) & 0xFFFFFFFF;
        eq = Integer.reverse(0x64000000);
        er = Long.reverse(-1236214674785409503L);
        es = Integer.reverse(-469762048);
        et = Long.reverse(3663701719793690145L);
        eu = Long.reverse(-2594073385365405696L);
        ev = Integer.reverse(0x14000000);
        ew = Long.reverse(3663701719793690145L);
        ex = Long.reverse(-2594073385365405696L);
        ey = (0 >>> 236 | 0 << ~236 + 1) & 0xFFFFFFFF;
        ez = 0x20000005 >>> 29 | 0x20000005 << -29;
        fa = -1543503872 >>> 250 | -1543503872 << -250;
        fb = Long.reverse(0x5000000000000000L);
        var_java_lang_String_arr_a = new String[ez];
        var_java_lang_String_arr_b = new String[fa];
        NLoginCore_371.b();
        var_java_util_concurrent_atomic_AtomicInteger_b = new AtomicInteger();
        var_java_util_concurrent_atomic_AtomicLong_c = new AtomicLong();
        cfr_renamed_21 = Caffeine.newBuilder().expireAfterWrite(fb, TimeUnit.MINUTES).build();
    }

    @Nullable
    private static NLoginCore_259 a(NLoginCore_116<?> NLoginInterface_0112, String string, String string2, boolean bl) {
        String string3;
        String string4;
        int n;
        String string5 = string2.toLowerCase(Locale.ENGLISH);
        NLoginCore_259 NLoginCore_2592 = (NLoginCore_259)cfr_renamed_21.getIfPresent((Object)string5);
        if (NLoginCore_2592 != null) {
            return NLoginCore_2592;
        }
        if (!bl) {
            long l = System.currentTimeMillis();
            if (l - z <= bu) {
                return null;
            }
            if (l - var_long_y > bv) {
                var_java_util_concurrent_atomic_AtomicInteger_b.set(bw);
                var_long_y = l;
            }
            if (var_java_util_concurrent_atomic_AtomicInteger_b.incrementAndGet() >= bx) {
                if (l - var_java_util_concurrent_atomic_AtomicLong_c.getAndSet(l) > by) {
                    NLoginCore_370.c((String)NLoginCore_371.c("㺀", (int)bz, (long)(ca ^ cb)), new Object[cc]);
                }
                z = l;
                return null;
            }
        }
        NLoginCore_227 NLoginCore_2272 = NLoginInterface_0112.com_nickuc_login_NLoginCore_227_a();
        NLoginCore_109 NLoginCore_109 = NLoginCore_2272.com_nickuc_login_NLoginCore_109_a();
        NLoginCore_180 NLoginCore_1802 = NLoginCore_2272.com_nickuc_login_NLoginCore_180_a();
        int n2 = cd;
        NLoginCore_123 NLoginCore_1232 = null;
        String string6 = null;
        block8: for (n = ce; n < cf; ++n) {
            string4 = string.replace((CharSequence)NLoginCore_371.c("㺃", (int)cg, (long)(ch ^ ci)), (CharSequence)(NLoginCore_1802 != null ? NLoginCore_1802.S() : NLoginCore_371.c("㺆", (int)cj, (long)(ck ^ cl)))).replace((CharSequence)NLoginCore_371.c("㺉", (int)cm, (long)(cn ^ co)), (CharSequence)(NLoginCore_109 != null ? Long.toString(NLoginCore_109.e()) : NLoginCore_371.c("㺌", (int)cp, (long)cq))).replace((CharSequence)NLoginCore_371.c("㺏", (int)cr, (long)cs), Integer.toString(NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b().a().ordinal())).replace((CharSequence)NLoginCore_371.c("㺒", (int)ct, (long)(cu ^ cv)), string2).replace((CharSequence)NLoginCore_371.c("㺕", (int)cw, (long)(cx ^ cy)), Integer.toString(n));
            NLoginCore_1232 = NLoginCore_305.a().a(string4);
            switch (NLoginCore_1232.p()) {
                case 200: {
                    string3 = NLoginCore_1232.V();
                    if (((String)NLoginCore_371.c("㺘", (int)cz, (long)(da ^ db))).equals(string3)) {
                        return null;
                    }
                    string6 = string3;
                    break block8;
                }
                case 204: 
                case 404: {
                    NLoginCore_2592 = new NLoginCore_259(null, null);
                    break block8;
                }
                default: {
                    if (n != dc) continue block8;
                    return null;
                }
            }
        }
        if (NLoginCore_2592 == null && string6 != null && !string6.isEmpty()) {
            if (string6.charAt(dd) == de && string6.charAt(string6.length() - df) == dg) {
                JSONObject jSONObject = new JSONObject(string6);
                if (jSONObject.has((String)NLoginCore_371.c("㺛", (int)dh, (long)(di ^ dj))) && jSONObject.has((String)NLoginCore_371.c("㺞", (int)dk, (long)(dl ^ dm)))) {
                    string4 = jSONObject.getString((String)NLoginCore_371.c("㺡", (int)dn, (long)(cfr_renamed_1 ^ dp)));
                    string3 = jSONObject.getString((String)NLoginCore_371.c("㺤", (int)(dq & dr), (long)ds));
                    NLoginCore_2592 = new NLoginCore_259(NLoginCore_432.c(string4), string3);
                } else if (jSONObject.has((String)NLoginCore_371.c("㺧", (int)dt, (long)du))) {
                    string4 = jSONObject.getString((String)NLoginCore_371.c("㺪", (int)dv, (long)dw));
                    NLoginCore_2592 = new NLoginCore_259(NLoginCore_432.c(string4), null);
                }
            }
            if (NLoginCore_2592 == null) {
                NLoginCore_2592 = new NLoginCore_259(null, null);
            }
        }
        if (NLoginCore_2592 != null) {
            cfr_renamed_21.put((Object)string5, (Object)NLoginCore_2592);
        } else {
            n = NLoginCore_1232 != null ? NLoginCore_1232.p() : dx;
            switch (n) {
                case 429: {
                    NLoginCore_370.c((String)NLoginCore_371.c("㺭", (int)dy, (long)(dz ^ ea)) + string2 + (String)NLoginCore_371.c("㺰", (int)eb, (long)ec) + NLoginCore_1232.p() + (String)NLoginCore_371.c("㺳", (int)ed, (long)ee), new Object[ef]);
                    break;
                }
                case 0: {
                    NLoginCore_370.c((String)NLoginCore_371.c("㺶", (int)eg, (long)(eh ^ ei)) + string2 + (String)NLoginCore_371.c("㺹", (int)ej, (long)(ek ^ el)) + NLoginCore_1232.p() + (String)NLoginCore_371.c("㺼", (int)em, (long)(en ^ eo)), new Object[ep]);
                    break;
                }
                default: {
                    NLoginCore_370.c((String)NLoginCore_371.c("㺿", (int)eq, (long)er) + string2 + (String)NLoginCore_371.c("㻂", (int)es, (long)(et ^ eu)) + NLoginCore_1232.p() + (String)NLoginCore_371.c("㻅", (int)ev, (long)(ew ^ ex)), new Object[ey]);
                }
            }
        }
        return NLoginCore_2592;
    }
}

