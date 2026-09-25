/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_464;
import com.nickuc.login.NLoginCore_557;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_121;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_199 {
    private static int gd;
    private static long dr;
    private static int cc;
    private static long gh;
    private static int di;
    private static long ex;
    private static int fp;
    private static long fz;
    private static int hb;
    private static int ce;
    private byte[] var_byte_arr_a;
    private static long ft;
    private static long bo;
    private static long am;
    private static int gk;
    private static int be;
    private static long w;
    private static int ba;
    private static int ew;
    private static long er;
    private static int fi;
    private static long fb;
    private static int cm;
    private static int hf;
    private static int fk;
    private static long bf;
    private final Object var_java_lang_Object_m;
    private static int ee;
    private static long cr;
    private static int as;
    private static long dd;
    private static int ec;
    private static int eu;
    private static int gs;
    private static long fa;
    private static long ci;
    private static int dk;
    private static long co;
    private static long ga;
    private static int fx;
    private static String[] var_java_lang_String_arr_b;
    private static long fs;
    private static int j;
    private static long em;
    private static long dv;
    private static long gm;
    private static int dx;
    private static int ca;
    private static int db;
    private static long s;
    private static int var_int_c;
    private static int ay;
    private static int au;
    private static long fw;
    private static long ai;
    private static String[] var_java_lang_String_arr_a;
    private static long bc;
    private static int de;
    private static int ch;
    private static long hh;
    private static long k;
    private static long az;
    private static long fo;
    private static long ev;
    private static int af;
    private static int ag;
    private static long hd;
    private static int ez;
    private static int bz;
    private static int ek;
    private static long e;
    private static int bv;
    private static int gi;
    private static int gb;
    private static long dm;
    private static int bq;
    private static int bh;
    private static int o;
    private static long bi;
    private static long dw;
    private static long fj;
    private static int hm;
    private static int ax;
    private static int bb;
    private static long da;
    private static long es;
    private final NLoginCore_598 var_com_nickuc_login_NLoginInterface_048_c;
    private static int ah;
    private static int fr;
    private static int ff;
    private static int hl;
    private static int z;
    private static int x;
    private static long fq;
    private static long bu;
    private static long gv;
    private static int hc;
    private static int ad;
    private static long gx;
    private static int gf;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_A;
    private static long ha;
    private static int cf;
    private static long eb;
    private static int dt;
    private static long var_long_aw;
    private static int gy;
    private static final long var_long_A = 200L;
    private static int bk;
    private static int bd;
    private static long bl;
    private static int cp;
    private static int gz;
    private static int n;
    private static int cg;
    private static long cw;
    private static int ei;
    private static int ar;
    private static long cj;
    private static long he;
    private static int ak;
    private static int ef;
    private static int gw;
    private static long gg;
    private static int dp;
    private static long el;
    private static int fm;
    private static final int var_int_aw;
    private static int ge;
    private static int dj;
    private static long ab;
    private static int eo;
    private static long gn;
    private static int cz;
    private static long br;
    private static int du;
    private static long ds;
    private static long p;
    private static int var_int_m;
    private static int et;
    private static int gr;
    private static int ct;
    private static int ep;
    private static int dq;
    private static int i;
    private static int hk;
    private static long gp;
    private static int hn;
    private static int dl;
    private static int cl;
    private static long var_long_b;
    private static long aq;
    private static int y;
    private static long ae;
    private static int r;
    private static long dn;
    private static int bt;
    private static long bx;
    private static long aj;
    private static int hi;
    private static long fh;
    private static int df;
    private static int cv;
    private static long gj;
    private static int fl;
    private static long var_long_v;
    private static int dz;
    private static int aa;
    private static int hg;
    private static long fd;
    private static int fn;
    private static long dh;
    private static int en;
    private static int bw;
    private static long fg;
    private static int ao;
    private static long bn;
    private static int fc;
    private static long bs;
    private static int bp;
    private static int ac;
    private static long gq;
    private static int h;
    private static int by;
    private static int an;
    private static int gc;
    private static long cu;
    private static int gu;
    private static int bm;
    private static int cy;
    private static long av;
    private static int f;
    private static long d;
    private static int cb;
    private static long ap;
    private static int u;
    private static int gl;
    private static long bj;
    private static int ck;
    private static int eq;
    private static int ey;
    private static long at;
    private static int dg;
    private static int cs;
    private static long t;
    private static int gt;
    private static long q;
    private static int fy;
    private static int al;
    private static long cd;
    private static int cfr_renamed_1;
    private static int cq;
    private static int ej;
    private static long var_long_c;
    private final Set<NLoginCore_557> var_java_util_Set_com_nickuc_login_NLoginCore_557__v;
    private static int bg;
    private static long fv;
    private static int g;
    private static int eg;
    private static int cn;
    private static long ea;
    private static int var_int_a;
    private static int fu;
    private static long cx;
    private static long l;
    private static long dy;
    private static long fe;
    private static int hj;
    private static long dc;
    private static long eh;
    private static int go;
    private static int ed;

    public void c() {
        this.var_com_nickuc_login_NLoginInterface_048_c.Z();
    }

    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string) {
        NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_A.c();
        if (string == null) {
            throw new IllegalStateException((String)NLoginCore_199.c("㺀", (int)eq, (long)(er ^ es)));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginCore_199.c("㺃", (int)(et & eu), (long)ev), (Object)NLoginCore_158.java_lang_String_a(this.var_byte_arr_a));
        jSONObject.put((String)NLoginCore_199.c("㺆", (int)ew, (long)ex), ey);
        jSONObject.put((String)NLoginCore_199.c("㺉", (int)ez, (long)(fa ^ fb)), (Object)NLoginCore_277.getName());
        jSONObject.put((String)NLoginCore_199.c("㺌", (int)fc, (long)(fd ^ fe)), (Object)string);
        jSONObject.put((String)NLoginCore_199.c("㺏", (int)ff, (long)(fg ^ fh)), NLoginType_0102.a(NLoginCore_5092, string));
        try {
            this.c(NLoginCore_277, jSONObject);
        }
        catch (Exception exception) {
            if (NLoginCore_370.aj()) {
                NLoginCore_370.a(exception);
            }
            NLoginCore_370.c((String)NLoginCore_199.c("㺒", (int)fi, (long)fj) + exception.getMessage(), new Object[fk]);
        }
    }

    private void d(NLoginCore_277 NLoginCore_277, byte[] byArray) {
        this.var_com_nickuc_login_NLoginType_008_A.com_nickuc_login_NLoginInterface_047_b().a(NLoginCore_277, NLoginCore_337.var_com_nickuc_login_NLoginCore_337_b, this.var_java_lang_Object_m, byArray);
    }

    public void c(NLoginCore_277 NLoginCore_277, int n, Object ... objectArray) {
        this.a(NLoginCore_277, ep != 0, n, objectArray);
    }

    public void a(NLoginCore_277 NLoginCore_277, String string, byte[] byArray) {
        try {
            if (byArray.length == 0) {
                return;
            }
            String string2 = new String(byArray, StandardCharsets.UTF_8);
            if (string2.isEmpty()) {
                return;
            }
            try {
                if (string2.charAt(f) == g && string2.charAt(string2.length() - h) == i) {
                    this.b(NLoginCore_277, string, string2);
                    return;
                }
                Object[] objectArray = new Object[var_int_m];
                objectArray[NLoginCore_199.n] = string2.replace((CharSequence)NLoginCore_199.c("㺃", (int)o, (long)(p ^ q)), (CharSequence)NLoginCore_199.c("㺆", (int)r, (long)(s ^ t)));
                NLoginCore_370.d((String)NLoginCore_199.c("㺀", (int)j, (long)(k ^ l)), objectArray);
            }
            catch (JSONException jSONException) {
                Object[] objectArray = new Object[x];
                objectArray[NLoginCore_199.y] = string2.replace((CharSequence)NLoginCore_199.c("㺌", (int)(z & aa), (long)ab), (CharSequence)NLoginCore_199.c("㺏", (int)(ac & ad), (long)ae));
                NLoginCore_370.c((String)NLoginCore_199.c("㺉", (int)u, (long)(var_long_v ^ w)), jSONException, objectArray);
            }
        }
        catch (Exception exception) {
            if (byArray[af] != ag) {
                NLoginCore_370.d((String)NLoginCore_199.c("㺒", (int)ah, (long)(ai ^ aj)), new Object[ak]);
            }
            NLoginCore_370.c((String)NLoginCore_199.c("㺕", (int)al, (long)am), exception, new Object[an]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(NLoginCore_277 NLoginCore_277, boolean bl, int n, Object ... objectArray) {
        Object object;
        Object object2;
        if (objectArray.length % fl != 0) {
            throw new IllegalArgumentException((String)NLoginCore_199.c("㺀", (int)(fm & fn), (long)fo));
        }
        JSONObject jSONObject = new JSONObject();
        if (bl) {
            jSONObject.put((String)NLoginCore_199.c("㺃", (int)fp, (long)fq), (Object)NLoginCore_158.java_lang_String_a(this.var_byte_arr_a));
        }
        jSONObject.put((String)NLoginCore_199.c("㺆", (int)fr, (long)(fs ^ ft)), n);
        jSONObject.put((String)NLoginCore_199.c("㺉", (int)fu, (long)(fv ^ fw)), (Object)NLoginCore_277.getName());
        for (int i = fx; i < objectArray.length; ++i) {
            if (!((object2 = objectArray[i++]) instanceof String)) {
                throw new IllegalArgumentException((String)NLoginCore_199.c("㺌", (int)fy, (long)(fz ^ ga)) + object2);
            }
            object = objectArray[i];
            jSONObject.put((String)object2, object != null ? object : JSONObject.NULL);
        }
        NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_A.c();
        object2 = this.var_com_nickuc_login_NLoginType_008_A.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        object = NLoginType_0102.java_lang_String_a(NLoginCore_277);
        if (object == null || !NLoginType_0102.a((NLoginCore_509)object2, (String)object)) {
            Set set;
            Set set2 = set = (Set)((NLoginCore_509)object2).a(NLoginCore_567.J, (String string) -> new LinkedHashSet());
            synchronized (set2) {
                if (bl) {
                    byte[] byArray = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
                    set.add(new NLoginCore_464(NLoginCore_277, byArray));
                } else {
                    set.add(new NLoginCore_557(NLoginCore_277, jSONObject));
                }
            }
            return;
        }
        if (NLoginType_0102.boolean_a(NLoginCore_277)) {
            if (bl) {
                this.c(NLoginCore_277, jSONObject);
            } else {
                long l = this.var_long_v;
                synchronized (l) {
                    this.var_long_v.add(new NLoginCore_557(NLoginCore_277, jSONObject));
                }
            }
        }
    }

    public void a(NLoginCore_277 NLoginCore_277, int n, Object ... objectArray) {
        this.a(NLoginCore_277, eo != 0, n, objectArray);
    }

    private static void b() {
        int n;
        var_long_c = 7660953774294876010L;
        long l = var_long_c ^ 0x812FB0B48BC208EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(5 + 64), (byte)(63 + 20), (byte)(21 + 26), (byte)(43 + 24), (byte)(65 + 1), (byte)(11 + 56), (byte)(3 + 44), (byte)(57 + 23), (byte)(66 + 9), 67, 83, (byte)(12 + 41), (byte)(70 + 10), (byte)(84 + 13), (byte)(52 + 48), (byte)(93 + 7), (byte)(10 + 95), (byte)(44 + 66), (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_199.var_java_lang_String_arr_b[0] = NLoginCore_446.F("ՄԿԽըիՈհհէԬԻՔՉռշԸհՕծպայյ՚պ՜չքոկ՘֌ֈ֐ցքփ֏֑գՑ֋Ֆՠ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ӝҵҾҳәӧӦӤҾӣӆңӁҮӤҬӄӒӀҵӟӕӄҴӔөӖӮӯӸӵӬӢӓӱӤԅҿӄӵӷӞԋԆӀӢԋӽӝӉӦӒӮӣӯӓӮәԓԌӪӳԏԌԢԍԀԡԛӶԠԙԀԋԢӱ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[2] = NLoginCore_575.C("ҹҕҢӍӒӑҥҨӧәӦұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[3] = NLoginCore_138.C("ҞӣӤәӎӠӝӡҩӢӞұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[4] = NLoginCore_173.C("ӝҵҾҳәӧӦӤҾӣӆңӁҮӤҬӄӒӀҵӟӕӄҴӔөӖӮӯӸӵӬӢӓӱӤԅҿӄӵӷӞԋԆӀӢԋӽӝӉӦӒӮӣӯӓӮәԓԌӪӳԏԌԢԍԀԡԛӶԠԙԀԋԢӱ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ŇģİśŠşĳĶŵŧŴĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[6] = NLoginCore_446.C("ҞӣӤәӎӠӝӡҩӢӞұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ħĺœŎōůŴĭŸŏŶŐĶųŘŊŷŏūĽšĻŐŢŜĻŻŢŴźŧōŉŏũŲŧťŔŶƘƐƐƓŕųŐŝƠƖƞƟƝƆŞƄŽũťŵŸŪŭƦƈƑƌűƌƐƒƔƙƩƹƗƵƙŷƺŹƝƋƿƿƭƑǇƙƀƶƥƃƛǋƗơǍƈƽƳƱƔƲƹƑƌƔƗƭǎǝƞǔǝƱƸǁǓǖƲǦƹǫǅƺƶƿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[8] = NLoginCore_387.A("ħĺœŎōůŴĭŸŏŷŭŚťŨıūľűŵĿŻŕőťŞũŢŤŞŷŸśţżƊœŦƑƂƏƑũŰųŲŻŗƜƠşƤŞƣŪū", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ՠէՍյժՔՒԶԸՔձՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[10] = NLoginCore_138.F("ԨԻՔՏՎհյԮչՐշՑԷմՙՋոՐլԾբԼՑգ՝ԼռգյջըՎՊՐժճըզՕշ֑֙֒՛՛ֈՙ֠ճժբ՟պ֖կ՚յջ֨ո֧֍֡֩", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[11] = NLoginCore_387.A("ņůţľĪŦŮűŧņōŕŅũżŴŨŔƁƄƃőŲŔŰŃŅŠſŌũſ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[12] = NLoginCore_223.E("ՠէՍյժՔՒԶԸՔձՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[13] = NLoginCore_384.C("ҙҬӅӀҿӡӦҟӪӁӨӂҨӥӊҼөӁӝүӓҭӂӔӎҭӭӔӦӬәҿһӁӛӤәӗӆӨԊԂԃӌӌӹӊԑӤӛӓӐӫԇӠӋӦӬԙөԘӾԒԚ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[14] = NLoginCore_559.C("ҺӟӘҭӎҲҷӗҸҦӥӈӆҥҿӠҨҽөӁҳҶӖҷӣӦӎһӝӷӽҳ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[15] = NLoginCore_138.E("՚ՐՅԮՆԴԭոձՓՇՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[16] = NLoginCore_110.C("құүӍҸәҺӂҸӂӌҼӄӥҫҨҼӪӌӪӏӇӃӧӍӍӼҽӵӗӡӭӝӿӒӹԃӚӱӲӊӢԂӑ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[17] = NLoginCore_027.F("ՌլԿիգժ՘ՕթեԺՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[18] = NLoginCore_027.B("ĸŝũŞŏŭŭňŲŘŰĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[19] = NLoginCore_223.B("ŐŞŒśŤŎİŉŖİŚĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[20] = NLoginCore_027.B("ŐŞŒśŤŎİŉŖİŚĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[21] = NLoginCore_223.D("ҘҸӌҤӑӞӁҼӜҦӦұ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[22] = NLoginCore_324.C("ҚӝӣҵӕӦӦӟӠҷңұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[23] = NLoginCore_027.C("ӑҡҠӀҜӁҶӃҪӥӦұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[24] = NLoginCore_091.D("ҺӂҸҸҼӒӛӕӞӝӅӞҮӧӏүӓҬӤӳӟӏҼҽ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[25] = NLoginCore_027.B("ŭĩĿťĭœĭŉŢŬţūŵŲźĺŚũźŶťƃŊŋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[26] = NLoginCore_091.A("ħĺœŎōůŴĭŸŏŶŅķĴũŰŹŉłŁŜŹřņŤžŖŸƌţżƄŝŧŒţůƃƅƋŔƌƔş", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[27] = NLoginCore_027.B("ŰĬŲŢŎŊĲķōŰŌŤŸŽŦňĺŬŸŠŲŲŰņŤŔŁŸŚţƄŹźũƈŊƑşƐŲťƋųƇųƙśŞžŷƚššŽŪū", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[28] = NLoginCore_201.C("ҵҭҖӞӀүҲӑҢӞҞӇӆӌӂүұҾӈҵӒӏҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[29] = NLoginCore_076.F("կթՊիՍՕԭՄեԺխպ՗շ՟ՀՋԴՔդբ՞ՋՌ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[30] = NLoginCore_201.A("ňŐņņŊŠũţŬūœŬļŵŝĽšĺŲƁŭŝŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[31] = NLoginCore_559.C("ҾҟҾӄҜӏӒӈӤҽҽӀӂҨҹҼӊӱӎӧӋӵҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[32] = NLoginCore_223.D("ӑҮӣӜҸӚҟӚҴҝӄұ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[33] = NLoginCore_324.B("ħĺœŎōůŴĭŸŏŶŅķĴũŰŹŉłŁŜŹřņŤžŖŸƌţżƄƏŋŬśſƏŪƃƆŏƄş", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[34] = NLoginCore_223.C("ҺӖҳңӇҙӣҽҼҥҵңӘӏӎӲӞӧҾҮӤҶӒӕӆұҵҵӍӈӿӲ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[35] = NLoginCore_092.A("ňŐņņŊŠũţŬūœŬļŵŝĽšĺŲƁŭŝŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[36] = NLoginCore_453.D("ӂӁҳҶҽӜҶҡӘӫҥӂӞӤҿӚһһӬӥҾӥҼҽ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[37] = NLoginCore_076.E("ԱՏՋհՠՔշլՋՃը՘ՓՏՙկ՛սՂՔ՟ջՠֆասՓվՆ՛ֆէծ֎ըՑհփևւպՌ֔դֆըն֡հՙ֟քմջնվդ֧մ֟գջ֡հֆ֧ի֫ք֬֏֕֍֙֌ֲ֐ִ֨֍պ֭վ֤׃ִ֋֌", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[38] = NLoginCore_027.C("ӑӘҾӦӛӅӃҧҩӅӢұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[39] = NLoginCore_138.F("Թ՞ժ՟ՐծծՉճՙձՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[40] = NLoginCore_324.B("řŏńĭŅĳĬŷŰŒņĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[41] = NLoginCore_384.E("ՏՏկ՟ՎՆՎեոՒԭթպնըշՓՂ՘օհ՞ՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[42] = NLoginCore_004.B("ĪŏłŉōūŞłńĹũŦūžĸŠśŕűƀłųŊŋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[43] = NLoginCore_076.B("ħĺœŎōůŴĭŸŏŷņŒŦķŐĲŵŻşřōŷţƃŽżŠņŽňŽšƃƈſťűƋƌƓŕƔş", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[44] = NLoginCore_223.D("ҺҞӟӃӀӁӆӊҠҵӌҧҭҧӧӀӍӔҳӱӅӨұӸӨӸӬөӇӉӮӿӋӎӕԁӳӻӓӅӻӸӋӑ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[45] = NLoginCore_324.E("ՠէՍյժՔՒԶԸՔձՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[46] = NLoginCore_091.B("ĸŝũŞŏŭŭňŲŘŰĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[47] = NLoginCore_427.F("՚ՐՅԮՆԴԭոձՓՇՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[48] = NLoginCore_027.B("ŘśŪŨĿŵłıŒŮŘţŐŶŶŐšŪƁōŭŦőŒśŗŒţſŝŅŻ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[49] = NLoginCore_076.D("қӟӢҤҽӜӅӁӗӇҞӈҤӃҸӉӭүӯӱӵӵӦӦӒҶӦӲӫӓӟҾӵӾӴӘӛӼӼӳӀӦӖӄӶԊөӯԄԋӊԒӷӕӒԒԒӷӔԍԆԔӴԚӜӡӸԛӢӽӢӾԇӼԌӱ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[50] = NLoginCore_110.E("ՁՂճԴԭՑՠՏՏԴՋՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[51] = NLoginCore_091.B("ŦŅųŊĭŲĴūıŴŬŸĻŽŭŨĶŰźſŐžűƆƄŦŷŹƍŪūƅŸƊƐŏŲƅŞƁūůŮş", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[52] = NLoginCore_384.A("ŤĬţŪŅŞŰœűţŐőŐĴżĻļľţƁłŝŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[53] = NLoginCore_384.F("թԮլկգԳԳՌՃՙՑՙէ՞ԵթՌր՛՗ո՛՚քվՃՃ֋ՙոՁլ֊պ՛է֎Վ֔Ւ։զևդֈթ։ն՚֊ա֓֎վիլ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[54] = NLoginCore_559.E("եԭդիՆ՟ձՔղդՑՒՑԵսԼԽԿդւՃ՞ՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[55] = NLoginCore_575.C("ӛҡҶӣӀҺҰҟӧӘӄұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[56] = NLoginCore_027.F("ԮեԯձՐԬթմԸԱձՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[57] = NLoginCore_201.B("şŦŌŴũœőĵķœŰĿ", (byte)60, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_199.var_java_lang_String_arr_b[0] = NLoginCore_110.E("ՄԿԽըիՈհհէԬԻՔՉռշԸհՕծպայյ՚պ՜չքոկ՘֌՝֓րդլ֌ց֗ե֛կՠ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[1] = NLoginCore_027.F("լՄՍՂընյճՍղՕԲՐԽճԻՓաՏՄծդՓՃգոեսվևքջձբրճ֔ՎՓքֆխ֚֕Տձ֚֌լ՘յասղվբսը֢֛չւ֛֞֋ը֣֓֩ը֢ֆձֵ֮ր", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[2] = NLoginCore_173.B("ŨĨłŒŜŠŎţšĹĹĿ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ՂՁՀիհշյթՄլխՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[4] = NLoginCore_091.F("լՄՍՂընյճՍղՕԲՐԽճԻՓաՏՄծդՓՃգոեսվևքջձբրճ֔ՎՓքֆխ֚֕Տձ֚֌լ՘յասղվբսը֢֛չւ֛֞լ֜իִֵ֓֊֢ց֓փր", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[5] = NLoginCore_223.E("ՈդՆՑՎլՈդԳԶչՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[6] = NLoginCore_384.C("үҝӂҗӖҺӅӨҹӂӞұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[7] = NLoginCore_173.E("ԨԻՔՏՎհյԮչՐշՑԷմՙՋոՐլԾբԼՑգ՝ԼռգյջըՎՊՐժճըզՕշ֑֑֙֔ՖմՑ՞֡֗֟֠֞և՟օվժզնչիծ֧։֒֍ղ֍ֶֺ֑֪֚֚֓֕֘ոֻպ֞֌׀׀֮֒׈֚ցַ֦ք֜׌֢֘׎։־ֲֳִֺ֕֒֍֮֕֘׏מ֟ומֲֹדזׂתׁׅ֬׉ֹ֯צֻ׃ד׀֧א׷ַׅב׵׀", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ҙҬӅӀҿӡӦҟӪӁөӟӌӗӚңӝҰӣӧұӭӇӃӗӐӛӔӖӐөӪӍӕӮӼӅӘԃӴԁԃӘԍӸԊӧӮԊӠӞӐӐӭԌԋӌӬӤӝԐԐӼԏ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[9] = NLoginCore_559.E("Ի՛եթԵԳՏՑշԳչԺըՐՠ՟ոԻՎՌվՎՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[10] = NLoginCore_575.B("ħĺœŎōůŴĭŸŏŶŐĶųŘŊŷŏūĽšĻŐŢŜĻŻŢŴźŧōŉŏũŲŧťŔŶƘƐƑŚŚƇŘƟŲũšŞŹƓŹƟšžŶƪƝũƁŻƱƩƎŽƬưŬƅƍƫƊſ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[11] = NLoginCore_138.D("ҸӡӕҰҜӘӠӣәҸҿӇҷӛӮӦӚӆӳӶӵӊӖӮӷӇӬӳҶӗҽӋ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[12] = NLoginCore_446.D("ҾһҮӜҘӕӗӞӝӞӇӅӦӮӛӦӐӧӰӱӷӏҼҽ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[13] = NLoginCore_446.B("ħĺœŎōůŴĭŸŏŶŐĶųŘŊŷŏūĽšĻŐŢŜĻŻŢŴźŧōŉŏũŲŧťŔŶƘƐƑŚŚƇŘƟŲũšŞŹƠƑŶƘŦžŦƠƈžƃ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[14] = NLoginCore_201.F("ՉծէԼ՝ՁՆզՇԵմ՗ՕԴՎկԷՌոՐՂՀսսՁէժՃՇ֊թւ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[15] = NLoginCore_451.A("ŘũŞśũůĭŢŲřĹŤŋżŭŵƀŔĺĹŜƃŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[16] = NLoginCore_027.A("ĩĿĽśņŧňŐņŐŚŊŒųĹĶŊŸŚŸŝŕőŵśśƊŋƃťůŻŐƋŢƎōŦŤƉƁŐťƍƑƅŰŖŘƊƑƓƗƓŪū", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ĢŋŏĽŊŮĭųŢĲŉśŮĶŊŐŮŊřŢŶōŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[18] = NLoginCore_091.C("ӃҞӔӄҥӏӈҟҡӪӈұ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[19] = NLoginCore_138.F("ԹԱՐխԲՀՇլՅյՄ՘զԼշԽկՠ՞Ւկ՞ՋՌ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[20] = NLoginCore_027.B("ŅűųŃİŬĬůűťŷĲřŊŧŝĶŔŻſŒŝŊŋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[21] = NLoginCore_138.F("ՈԺ԰ՊՎՁզզնթԲՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[22] = NLoginCore_451.D("ҺӝӡӂӚҾӘӗҨӓҼұ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[23] = NLoginCore_446.C("ӐүӍӀҦҷӅӟӧөҬӖӖҪҩӏӛӀҿӅӂӵҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[24] = NLoginCore_559.A("ňŐņņŊŠũţŬūœŭŷŶųĸŴĽŕŭſƃŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[25] = NLoginCore_453.D("ӟқұӗҟӅҟһӔӞӕӜӧҽҺӢҭӄӅӢҲӥҼҽ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[26] = NLoginCore_201.F("ԨԻՔՏՎհյԮչՐշՆԸԵժձպՊՃՂ՝պ՚Շետ՗չ֍դսօի֓Ջե։մՉձՒխճՠ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[27] = NLoginCore_091.B("ŰĬŲŢŎŊĲķōŰŌŤŸŽŦňĺŬŸŠŲŲŰņŤŔŁŸŚţƄŹźũƈŊƑşƐŲťƋųƜœŵŴśŽŭŠųƅŭŪū", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[28] = NLoginCore_027.E("ՄԼԥխՏԾՁՠԱխԺԴՙնձՋղլՒՏոտեԺՁժ՚չ՝ՊՎռ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[29] = NLoginCore_384.A("ŮŨŉŪŌŔĬŃŤĹŬŨŽĵũŒŽƂŀŖŰųŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[30] = NLoginCore_027.E("ՉՑՇՇՋաժդխլՔխյթպ՞հՖծգքքՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[31] = NLoginCore_027.E("ՍԮՍՓԫ՞ա՗ճՌՌ՘ԸԼԸիՊ՘՚՞վմՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[32] = NLoginCore_324.E("՜԰Ճժճ԰ժ԰ԯԸ՗Հ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[33] = NLoginCore_324.B("ħĺœŎōůŴĭŸŏŶŅķĴũŰŹŉłŁŜŹřņŤžŖŸƌţżƄŧŋƍŅƇŮōŦƔƄƃőŷŲƉŬŴŞƁƝƎŭŪū", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[34] = NLoginCore_384.F("ՉեՂԲՖԨղՌՋԴՄԲէ՞՝ցխնՍԽճԼՂԿշՒփ֋֍Մծք", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[35] = NLoginCore_324.C("ҺӂҸҸҼӒӛӕӞӝӅӦӄӧӯҩҺҽҬұӌҿҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[36] = NLoginCore_092.F("ՑՐՂՅՌիՅ԰էպԲղԶհհԾՖվխՔաքՋՌ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[37] = NLoginCore_223.B("İŎŊůşœŶūŊłŧŗŒŎŘŮŚżŁœŞźşƅŠżŒŽŅŚƅŦŭƍŧŐůƂƆƁŹŋƓţƅŧŵƠůŘƞƃųźŵŽţƦųƞŢźƠůƅƦŪƪƃƫƎƔƌƘƊƊƘŴƿƓƛƋƺƬƏƝƊƋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[38] = NLoginCore_223.F("հբԿԼՉՊՍդՉ՗ՏիԷ՗՟Ջմժ՘յվՎՋՌ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[39] = NLoginCore_559.D("ҾӚӣӅҿӟҧҷҶӝҼұ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[40] = NLoginCore_223.E("ըՎՏճՒ՗լդծՅԻՍթՇոթԹՏր՚ց՞ՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[41] = NLoginCore_138.F("ՏՏկ՟ՎՆՎեոՒԻԹԻՙ՗՗նԿհՙձքՋՌ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[42] = NLoginCore_091.C("ҜӁҴһҿӝӐҴҶҫӛӟәӚӤӇӀӌӜӁӶӵҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[43] = NLoginCore_559.D("ҙҬӅӀҿӡӦҟӪӁөҸӄӘҩӂҤӧӭӑӋҿөӕӵӯӮӒҸӯҺӯӻӬӢӺӺӯӖԁӇԅԍөӪӞӏԌӺԎӿӬӪӟӜӝ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[44] = NLoginCore_027.D("ҺҞӟӃӀӁӆӊҠҵӌҧҭҧӧӀӍӔҳӱӅӨұӸӨӸӬөӇӉӮӿӮӒӒӎԂӄӼӝӀӘӔӑ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[45] = NLoginCore_575.E("ՋիԻԼնՋԩծծԺՓԷձջ՘ՔՉփՑԶՑՎՋՌ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[46] = NLoginCore_559.E("ՈԺզձյթՂՕխԵՃՀ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[47] = NLoginCore_027.B("ĻĮŰůŐİşţųŘťŊňŦūŪŬŊŖōƃƃŊŋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[48] = NLoginCore_384.B("ŘśŪŨĿŵłıŒŮŘţŐŶŶŐšŪƁōŭŭśŁŦĻƀƉƀŌšƅłŽŐŠōōƉƄŹŷƈş", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[49] = NLoginCore_427.A("ĩŭŰĲŋŪœŏťŕĬŖĲőņŗŻĽŽſƃƃŴŴŠńŴƀŹšŭŌƃƌƂŦũƊƊƁŎŴŤŒƄƘŷŽƒƙŘƠƅţŠƠƠƅŢƛƔƢƂƨƑƒƨƂƦƱƯƵŪƱƂſ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[50] = NLoginCore_324.F("խդՅլԴՀՇշՙՌՃՀ", (byte)60, 70);
                    NLoginCore_199.var_java_lang_String_arr_b[51] = NLoginCore_446.D("ӘҷӥҼҟӤҦӝңӦӞӪҭӯӟӚҨӢӬӱӂӰӣӸӶӘөӫӿӜӝӷӺҿӀӽӃӟӓӴӹӦӜӑ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[52] = NLoginCore_027.B("ŤĬţŪŅŞŰœűţŎŰĹťŜŪŪĳżůŠƃŊŋ", (byte)60, 66);
                    NLoginCore_199.var_java_lang_String_arr_b[53] = NLoginCore_138.E("թԮլկգԳԳՌՃՙՑՙէ՞ԵթՌր՛՗ո՛՚քվՃՃ֋ՙոՁլ֊պ՛է֎Վ֔Ւ։զօ֊ը֋հ֑՞՛ռյղ֤իլ", (byte)60, 69);
                    NLoginCore_199.var_java_lang_String_arr_b[54] = NLoginCore_223.C("ӖҞӕӜҷӐӢӅӣӕӀӟҠӝӅӈӀӑӟҿӤӵҼҽ", (byte)60, 67);
                    NLoginCore_199.var_java_lang_String_arr_b[55] = NLoginCore_384.D("ӊҠӀҢәӈөӓӖҺӌұ", (byte)60, 68);
                    NLoginCore_199.var_java_lang_String_arr_b[56] = NLoginCore_223.A("ŝŮĬĪŜŀŎĴŹţňŋŔŖūŵŚŜŕşƃƃŊŋ", (byte)60, 65);
                    NLoginCore_199.var_java_lang_String_arr_b[57] = NLoginCore_027.B("ĺŚŢőŤłľŊłĳĺŅĳżņŗŹŻĹĹĶŝŊŋ", (byte)60, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_199.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ŬľŬīŞťūĿŀťœŧĴŚŊĵŚůőŋłĽŮſŵŃŜŗŖƁƇō", (byte)60, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_199.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ҼӋӏһӟӛӜӃҦӇҶҥӝӎӡӞӑӬӴӧӮӵҼҽ", (byte)60, 67);
                }
            }
        }
    }

    public void b(byte[] byArray) {
        if (this.var_byte_arr_a != null) {
            throw new IllegalStateException((String)NLoginCore_199.c("㺀", (int)var_int_c, (long)(d ^ e)));
        }
        this.var_byte_arr_a = byArray;
    }

    public NLoginCore_199(NLoginType_008 NLoginType_008, Object object) {
        this.var_long_v = (long)new LinkedHashSet();
        this.var_com_nickuc_login_NLoginType_008_A = NLoginType_008;
        this.var_java_lang_Object_m = object;
        this.var_com_nickuc_login_NLoginInterface_048_c = NLoginType_008.b(var_int_a != 0).a(() -> {
            NLoginCore_557[] NLoginCore_557Array;
            if (this.var_long_v.isEmpty()) {
                return;
            }
            Object object = this.var_long_v;
            synchronized (object) {
                NLoginCore_557Array = this.var_long_v.toArray(new NLoginCore_557[hi]);
                this.var_long_v.clear();
            }
            if (NLoginCore_557Array.length > 0) {
                object = new HashSet();
                Object object2 = NLoginCore_557Array;
                int n = ((NLoginCore_557[])object2).length;
                for (int i = hj; i < n; ++i) {
                    NLoginCore_557 NLoginCore_5572 = object2[i];
                    object.add(NLoginCore_5572.d);
                }
                object2 = object.iterator();
                while (object2.hasNext()) {
                    NLoginCore_277 NLoginCore_277 = (NLoginCore_277)object2.next();
                    NLoginCore_557[] NLoginCore_557Array2 = (NLoginCore_557[])Arrays.stream(NLoginCore_557Array).filter(NLoginCore_557 -> NLoginCore_557.d.equals(NLoginCore_277)).toArray(NLoginCore_557[]::new);
                    this.a(NLoginCore_277, NLoginCore_557Array2, hk);
                }
            }
        }, 0L, var_long_b, TimeUnit.MILLISECONDS);
    }

    private void c(NLoginCore_277 NLoginCore_277, JSONObject jSONObject) {
        this.d(NLoginCore_277, jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (NLoginCore_5092.a(NLoginCore_567.J)) {
            NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_A.c();
            if (!NLoginType_0102.boolean_a(NLoginCore_277) || !NLoginType_0102.b(NLoginCore_277, NLoginCore_5092)) {
                NLoginCore_5092.a(NLoginCore_567.J);
                return;
            }
            Set set = (Set)NLoginCore_5092.d(NLoginCore_567.J);
            if (set != null) {
                Set set2 = set;
                synchronized (set2) {
                    if (!NLoginType_0102.boolean_a(NLoginCore_277) || !NLoginType_0102.b(NLoginCore_277, NLoginCore_5092)) {
                        NLoginCore_5092.a(NLoginCore_567.J);
                        return;
                    }
                    if (!set.isEmpty()) {
                        long l = this.var_long_v;
                        synchronized (l) {
                            set.stream().filter(NLoginCore_2492 -> NLoginCore_2492 instanceof NLoginCore_557).forEach(NLoginCore_2492 -> this.var_long_v.add((NLoginCore_557)NLoginCore_2492));
                        }
                        set.stream().filter(NLoginCore_2492 -> NLoginCore_2492 instanceof NLoginCore_464).forEach(NLoginCore_2492 -> {
                            NLoginCore_464 NLoginCore_523 = (NLoginCore_464)NLoginCore_2492;
                            this.d(NLoginCore_277, NLoginCore_464.a(NLoginCore_523));
                        });
                    }
                    NLoginCore_5092.a(NLoginCore_567.J);
                }
            }
        }
    }

    private void b(NLoginCore_277 NLoginCore_277, String string, String string2) {
        JSONObject jSONObject = new JSONObject(string2);
        if (this.var_byte_arr_a == null || !jSONObject.has((String)NLoginCore_199.c("㺀", (int)ao, (long)(ap ^ aq)))) {
            NLoginCore_370.c((String)NLoginCore_199.c("㺃", (int)(ar & as), (long)at) + string + (String)NLoginCore_199.c("㺆", (int)au, (long)(av ^ var_long_aw)), new Object[ax]);
            return;
        }
        byte[] byArray = NLoginCore_158.byte_arr_a(jSONObject.getString((String)NLoginCore_199.c("㺉", (int)ay, (long)az)).getBytes(StandardCharsets.UTF_8));
        if (!Arrays.equals(byArray, this.var_byte_arr_a)) {
            NLoginCore_370.c((String)NLoginCore_199.c("㺌", (int)(ba & bb), (long)bc) + string + (String)NLoginCore_199.c("㺏", (int)(bd & be), (long)bf), new Object[bg]);
            return;
        }
        String string3 = jSONObject.getString((String)NLoginCore_199.c("㺒", (int)bh, (long)(bi ^ bj)));
        if (!NLoginCore_277.getName().equals(string3)) {
            throw new IllegalArgumentException((String)NLoginCore_199.c("㺕", (int)bk, (long)bl) + NLoginCore_277.getName() + (String)NLoginCore_199.c("㺘", (int)bm, (long)(bn ^ bo)) + string3);
        }
        this.var_com_nickuc_login_NLoginType_008_A.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).a(NLoginCore_567.I, (Object)(bp != 0));
        int n = jSONObject.getInt((String)NLoginCore_199.c("㺛", (int)bq, (long)(br ^ bs)));
        switch (n) {
            case 0: {
                int n2 = jSONObject.has((String)NLoginCore_199.c("㺞", (int)bt, (long)bu)) ? jSONObject.getInt((String)NLoginCore_199.c("㺡", (int)(bv & bw), (long)bx)) : by;
                switch (n2) {
                    case 0: {
                        byte[] byArray2 = BCryptHashProvider.e();
                        String string4 = BCryptHashProvider.aD();
                        if (byArray2 == null || string4 == null) break;
                        NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_A.c();
                        Object[] objectArray = new Object[ca];
                        objectArray[NLoginCore_199.cb] = NLoginCore_199.c("㺤", (int)cc, (long)cd);
                        objectArray[NLoginCore_199.ce] = cf;
                        objectArray[NLoginCore_199.cg] = NLoginCore_199.c("㺧", (int)ch, (long)(ci ^ cj));
                        objectArray[NLoginCore_199.ck] = string4;
                        objectArray[NLoginCore_199.cl] = NLoginCore_199.c("㺪", (int)(cm & cn), (long)co);
                        objectArray[NLoginCore_199.cp] = NLoginCore_158.java_lang_String_a(byArray2);
                        NLoginType_0102.com_nickuc_login_NLoginCore_199_a().c(NLoginCore_277, bz, objectArray);
                        break;
                    }
                }
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                Object object;
                long l = jSONObject.getLong((String)NLoginCore_199.c("㺭", (int)cq, (long)cr));
                int n3 = jSONObject.getInt((String)NLoginCore_199.c("㺰", (int)(cs & ct), (long)cu));
                NLoginCore_121 NLoginCore_1212 = NLoginCore_121.com_nickuc_login_NLoginCore_121_a(n3);
                if (NLoginCore_1212 == null) {
                    NLoginCore_370.d((String)NLoginCore_199.c("㺳", (int)cv, (long)(cw ^ cx)) + l + (String)NLoginCore_199.c("㺶", (int)(cy & cz), (long)da) + n3 + (String)NLoginCore_199.c("㺹", (int)db, (long)(dc ^ dd)) + l, new Object[de]);
                    break;
                }
                JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginCore_199.c("㺼", (int)(df & dg), (long)dh));
                Object[] objectArray = NLoginCore_1212.a(jSONArray);
                try {
                    object = NLoginCore_1212.a(nLoginAPI.getApi(), objectArray);
                }
                catch (Exception exception) {
                    String string5 = exception.getMessage();
                    Object[] objectArray2 = new Object[dj];
                    objectArray2[NLoginCore_199.dk] = NLoginCore_199.c("㺿", (int)dl, (long)(dm ^ dn));
                    objectArray2[NLoginCore_199.cfr_renamed_1] = l;
                    objectArray2[NLoginCore_199.dp] = NLoginCore_199.c("㻂", (int)dq, (long)(dr ^ ds));
                    objectArray2[NLoginCore_199.dt] = string5 != null ? string5 : NLoginCore_199.c("㻅", (int)du, (long)(dv ^ dw));
                    this.a(NLoginCore_277, di, objectArray2);
                    NLoginCore_370.c((String)NLoginCore_199.c("㻈", (int)dx, (long)dy) + (Object)((Object)NLoginCore_1212) + (String)NLoginCore_199.c("㻋", (int)dz, (long)(ea ^ eb)) + l, exception, new Object[ec]);
                    break;
                }
                if (object instanceof Optional) {
                    object = ((Optional)object).orElse(null);
                }
                Object[] objectArray3 = new Object[ee];
                objectArray3[NLoginCore_199.ef] = NLoginCore_199.c("㻎", (int)eg, (long)eh);
                objectArray3[NLoginCore_199.ei] = l;
                objectArray3[NLoginCore_199.ej] = NLoginCore_199.c("㻑", (int)ek, (long)(el ^ em));
                objectArray3[NLoginCore_199.en] = object != null ? NLoginCore_1212.a().a(object) : JSONObject.NULL;
                this.c(NLoginCore_277, ed, objectArray3);
                break;
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x44L;
        l ^= 0x812FB0B48BC208EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(51 + 18), (byte)(28 + 55), (byte)(3 + 44), 67, (byte)(3 + 63), (byte)(4 + 63), (byte)(29 + 18), (byte)(51 + 29), (byte)(49 + 26), (byte)(5 + 62), 83, (byte)(13 + 40), (byte)(78 + 2), (byte)(26 + 71), (byte)(48 + 52), (byte)(72 + 28), (byte)(12 + 93), (byte)(54 + 56), (byte)(99 + 4)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.C("ҮһҺѽҽҹҴҽӈҷ҄ӂӆҿӂӈҊࠥ߰ࠞ࠙ࠉࠓࠤࠥ࠘ࠣߺࠤ", (byte)50, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_199.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = 131072 >>> 145 | 131072 << -145;
        var_long_b = Long.reverse(0x1300000000000000L);
        var_int_c = Integer.reverse(0);
        d = Long.reverse(6268185645919013462L);
        e = Long.reverse(0x2200000000000000L);
        f = Integer.reverse(0);
        g = Integer.reverse(-570425344);
        h = 65536 >>> 80 | 65536 << ~80 + 1;
        i = (1000 >>> 35 | 1000 << -35) & 0xFFFFFFFF;
        j = (0x100000 >>> 20 | 0x100000 << ~20 + 1) & 0xFFFFFFFF;
        k = Long.reverse(6268185645919013462L);
        l = Long.reverse(0x2200000000000000L);
        var_int_m = Integer.reverse(Integer.MIN_VALUE);
        n = 0 >>> 16 | 0 << ~16 + 1;
        o = (8192 >>> 76 | 8192 << -76) & 0xFFFFFFFF;
        p = Long.reverse(6268185645919013462L);
        q = Long.reverse(0x2200000000000000L);
        r = 98304 >>> 143 | 98304 << -143;
        s = Long.reverse(6268185645919013462L);
        t = Long.reverse(0x2200000000000000L);
        u = Integer.reverse(0x20000000);
        var_long_v = Long.reverse(6268185645919013462L);
        w = Long.reverse(0x2200000000000000L);
        x = (0x100000 >>> 116 | 0x100000 << ~116 + 1) & 0xFFFFFFFF;
        y = (0 >>> 126 | 0 << -126) & 0xFFFFFFFF;
        z = Integer.reverse(-1610612736);
        aa = -1 >>> 56 | -1 << ~56 + 1;
        ab = Long.reverse(8429913467056851542L);
        ac = (196608 >>> 207 | 196608 << ~207 + 1) & 0xFFFFFFFF;
        ad = (-1 >>> 98 | -1 << ~98 + 1) & 0xFFFFFFFF;
        ae = Long.reverse(8429913467056851542L);
        af = Integer.reverse(0);
        ag = Integer.reverse(-570425344);
        ah = Integer.reverse(-536870912);
        ai = Long.reverse(6268185645919013462L);
        aj = Long.reverse(0x2200000000000000L);
        ak = (0 >>> 78 | 0 << -78) & 0xFFFFFFFF;
        al = (0x40000000 >>> 187 | 0x40000000 << -187) & 0xFFFFFFFF;
        am = Long.reverse(8429913467056851542L);
        an = Integer.reverse(0);
        ao = Integer.reverse(-1879048192);
        ap = Long.reverse(6268185645919013462L);
        aq = Long.reverse(0x2200000000000000L);
        ar = 10 >>> 192 | 10 << -192;
        as = (-1 >>> 54 | -1 << -54) & 0xFFFFFFFF;
        at = Long.reverse(8429913467056851542L);
        au = 720896 >>> 176 | 720896 << ~176 + 1;
        av = Long.reverse(6268185645919013462L);
        var_long_aw = Long.reverse(0x2200000000000000L);
        ax = Integer.reverse(0);
        ay = Integer.reverse(0x30000000);
        az = Long.reverse(8429913467056851542L);
        ba = 425984 >>> 239 | 425984 << -239;
        bb = (-1 >>> 154 | -1 << -154) & 0xFFFFFFFF;
        bc = Long.reverse(8429913467056851542L);
        bd = (0xE00000 >>> 116 | 0xE00000 << -116) & 0xFFFFFFFF;
        be = Integer.reverse(-1);
        bf = Long.reverse(8429913467056851542L);
        bg = Integer.reverse(0);
        bh = Integer.reverse(-268435456);
        bi = Long.reverse(6268185645919013462L);
        bj = Long.reverse(0x2200000000000000L);
        bk = (256 >>> 228 | 256 << ~228 + 1) & 0xFFFFFFFF;
        bl = Long.reverse(8429913467056851542L);
        bm = 34 >>> 1 | 34 << ~1 + 1;
        bn = Long.reverse(6268185645919013462L);
        bo = Long.reverse(0x2200000000000000L);
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0x48000000);
        br = Long.reverse(6268185645919013462L);
        bs = Long.reverse(0x2200000000000000L);
        bt = (76 >>> 226 | 76 << -226) & 0xFFFFFFFF;
        bu = Long.reverse(8429913467056851542L);
        bv = 160 >>> 227 | 160 << -227;
        bw = (-1 >>> 78 | -1 << -78) & 0xFFFFFFFF;
        bx = Long.reverse(8429913467056851542L);
        by = Integer.reverse(0);
        bz = Integer.reverse(0);
        ca = 196608 >>> 15 | 196608 << -15;
        cb = Integer.reverse(0);
        cc = (0x40000005 >>> 94 | 0x40000005 << ~94 + 1) & 0xFFFFFFFF;
        cd = Long.reverse(8429913467056851542L);
        ce = Integer.reverse(Integer.MIN_VALUE);
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = Integer.reverse(0x40000000);
        ch = Integer.reverse(0x68000000);
        ci = Long.reverse(6268185645919013462L);
        cj = Long.reverse(0x2200000000000000L);
        ck = 768 >>> 232 | 768 << ~232 + 1;
        cl = 4 >>> 192 | 4 << -192;
        cm = (1472 >>> 102 | 1472 << ~102 + 1) & 0xFFFFFFFF;
        cn = Integer.reverse(-1);
        co = Long.reverse(8429913467056851542L);
        cp = 2560 >>> 169 | 2560 << ~169 + 1;
        cq = Integer.reverse(0x18000000);
        cr = Long.reverse(8429913467056851542L);
        cs = Integer.reverse(-1744830464);
        ct = Integer.reverse(-1);
        cu = Long.reverse(8429913467056851542L);
        cv = Integer.reverse(0x58000000);
        cw = Long.reverse(6268185645919013462L);
        cx = Long.reverse(0x2200000000000000L);
        cy = 884736 >>> 143 | 884736 << -143;
        cz = -1 >>> 229 | -1 << ~229 + 1;
        da = Long.reverse(8429913467056851542L);
        db = Integer.reverse(0x38000000);
        dc = Long.reverse(6268185645919013462L);
        dd = Long.reverse(0x2200000000000000L);
        de = 0 >>> 210 | 0 << -210;
        df = 29696 >>> 10 | 29696 << -10;
        dg = (-1 >>> 110 | -1 << -110) & 0xFFFFFFFF;
        dh = Long.reverse(8429913467056851542L);
        di = Integer.reverse(0x60000000);
        dj = Integer.reverse(0x20000000);
        dk = 0 >>> 120 | 0 << ~120 + 1;
        dl = (0xF000000 >>> 247 | 0xF000000 << ~247 + 1) & 0xFFFFFFFF;
        dm = Long.reverse(6268185645919013462L);
        dn = Long.reverse(0x2200000000000000L);
        cfr_renamed_1 = Integer.reverse(Integer.MIN_VALUE);
        dp = (0x20000000 >>> 28 | 0x20000000 << ~28 + 1) & 0xFFFFFFFF;
        dq = Integer.reverse(-134217728);
        dr = Long.reverse(6268185645919013462L);
        ds = Long.reverse(0x2200000000000000L);
        dt = Integer.reverse(-1073741824);
        du = (64 >>> 65 | 64 << -65) & 0xFFFFFFFF;
        dv = Long.reverse(6268185645919013462L);
        dw = Long.reverse(0x2200000000000000L);
        dx = 33 >>> 224 | 33 << ~224 + 1;
        dy = Long.reverse(8429913467056851542L);
        dz = (278528 >>> 13 | 278528 << -13) & 0xFFFFFFFF;
        ea = Long.reverse(6268185645919013462L);
        eb = Long.reverse(0x2200000000000000L);
        ec = Integer.reverse(0);
        ed = -2147483647 >>> 126 | -2147483647 << -126;
        ee = Integer.reverse(0x20000000);
        ef = 0 >>> 92 | 0 << -92;
        eg = Integer.reverse(-1006632960);
        eh = Long.reverse(8429913467056851542L);
        ei = Integer.reverse(Integer.MIN_VALUE);
        ej = (131072 >>> 144 | 131072 << -144) & 0xFFFFFFFF;
        ek = Integer.reverse(0x24000000);
        el = Long.reverse(6268185645919013462L);
        em = Long.reverse(0x2200000000000000L);
        en = Integer.reverse(-1073741824);
        eo = Integer.reverse(0);
        ep = Integer.reverse(Integer.MIN_VALUE);
        eq = Integer.reverse(-1543503872);
        er = Long.reverse(6268185645919013462L);
        es = Long.reverse(0x2200000000000000L);
        et = (0x1300000 >>> 115 | 0x1300000 << -115) & 0xFFFFFFFF;
        eu = Integer.reverse(-1);
        ev = Long.reverse(8429913467056851542L);
        ew = -1073741815 >>> 254 | -1073741815 << -254;
        ex = Long.reverse(8429913467056851542L);
        ey = Integer.reverse(-1);
        ez = (81920 >>> 43 | 81920 << ~43 + 1) & 0xFFFFFFFF;
        fa = Long.reverse(6268185645919013462L);
        fb = Long.reverse(0x2200000000000000L);
        fc = 0x520000 >>> 145 | 0x520000 << -145;
        fd = Long.reverse(6268185645919013462L);
        fe = Long.reverse(0x2200000000000000L);
        ff = Integer.reverse(0x54000000);
        fg = Long.reverse(6268185645919013462L);
        fh = Long.reverse(0x2200000000000000L);
        fi = (-2147483627 >>> 31 | -2147483627 << -31) & 0xFFFFFFFF;
        fj = Long.reverse(8429913467056851542L);
        fk = 0 >>> 117 | 0 << -117;
        fl = 0x1000000 >>> 215 | 0x1000000 << -215;
        fm = (0x1600000 >>> 179 | 0x1600000 << -179) & 0xFFFFFFFF;
        fn = Integer.reverse(-1);
        fo = Long.reverse(8429913467056851542L);
        fp = (92160 >>> 43 | 92160 << -43) & 0xFFFFFFFF;
        fq = Long.reverse(8429913467056851542L);
        fr = Integer.reverse(0x74000000);
        fs = Long.reverse(6268185645919013462L);
        ft = Long.reverse(0x2200000000000000L);
        fu = -1073741813 >>> 30 | -1073741813 << -30;
        fv = Long.reverse(6268185645919013462L);
        fw = Long.reverse(0x2200000000000000L);
        fx = Integer.reverse(0);
        fy = (96 >>> 97 | 96 << ~97 + 1) & 0xFFFFFFFF;
        fz = Long.reverse(6268185645919013462L);
        ga = Long.reverse(0x2200000000000000L);
        gb = 0x400000 >>> 150 | 0x400000 << -150;
        gc = Integer.reverse(0);
        gd = 0x400000 >>> 118 | 0x400000 << -118;
        ge = (0 >>> 0 | 0 << -0) & 0xFFFFFFFF;
        gf = (0x620000 >>> 177 | 0x620000 << -177) & 0xFFFFFFFF;
        gg = Long.reverse(6268185645919013462L);
        gh = Long.reverse(0x2200000000000000L);
        gi = 0x40000006 >>> 221 | 0x40000006 << -221;
        gj = Long.reverse(8429913467056851542L);
        gk = Integer.reverse(0x100000);
        gl = Integer.reverse(-872415232);
        gm = Long.reverse(6268185645919013462L);
        gn = Long.reverse(0x2200000000000000L);
        go = Integer.reverse(0x2C000000);
        gp = Long.reverse(6268185645919013462L);
        gq = Long.reverse(0x2200000000000000L);
        gr = 262144 >>> 71 | 262144 << ~71 + 1;
        gs = Integer.reverse(0x100000);
        gt = (54272 >>> 74 | 54272 << ~74 + 1) & 0xFFFFFFFF;
        gu = Integer.reverse(-1);
        gv = Long.reverse(8429913467056851542L);
        gw = 0x6C00000 >>> 181 | 0x6C00000 << ~181 + 1;
        gx = Long.reverse(8429913467056851542L);
        gy = Integer.reverse(0x100000);
        gz = 1760 >>> 37 | 1760 << ~37 + 1;
        ha = Long.reverse(8429913467056851542L);
        hb = 0 >>> 197 | 0 << ~197 + 1;
        hc = Integer.reverse(0x1C000000);
        hd = Long.reverse(6268185645919013462L);
        he = Long.reverse(0x2200000000000000L);
        hf = Integer.reverse(-1677721600);
        hg = Integer.reverse(-1);
        hh = Long.reverse(8429913467056851542L);
        hi = 0 >>> 253 | 0 << ~253 + 1;
        hj = 0 >>> 210 | 0 << ~210 + 1;
        hk = (0 >>> 95 | 0 << ~95 + 1) & 0xFFFFFFFF;
        hl = Integer.reverse(0x5C000000);
        hm = Integer.reverse(0x5C000000);
        hn = (16 >>> 217 | 16 << ~217 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[hl];
        var_java_lang_String_arr_b = new String[hm];
        NLoginCore_199.b();
        var_int_aw = hn;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_199.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.C("ЇЩЫЋЯюцќшЗѕыљѓМсѣѢњѠњЯ", (byte)14, 67), NLoginCore_199.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.B("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѵрѮѩљѣѴѵѨѳъѴò", (byte)14, 66) + string + NLoginCore_453.D("Й", (byte)14, 68) + methodType.toString(), exception);
        }
    }

    private void a(NLoginCore_277 NLoginCore_277, NLoginCore_557[] NLoginCore_557Array, int n) {
        JSONObject jSONObject;
        NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_com_nickuc_login_NLoginType_008_A.c();
        if (!NLoginType_0102.boolean_a(NLoginCore_277)) {
            return;
        }
        if (NLoginCore_557Array.length == gb) {
            jSONObject = NLoginCore_557.com_nickuc_login_lib_json_JSONObject_a(NLoginCore_557Array[gc]);
        } else if (NLoginCore_557Array.length == n + gd) {
            jSONObject = NLoginCore_557.com_nickuc_login_lib_json_JSONObject_a(NLoginCore_557Array[n]);
        } else {
            jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            int n2 = ge;
            for (int i = n; i < NLoginCore_557Array.length; ++i) {
                NLoginCore_557 NLoginCore_557 = NLoginCore_557Array[i];
                if (!NLoginCore_557.d.equals(NLoginCore_277)) {
                    throw new IllegalArgumentException((String)NLoginCore_199.c("㺀", (int)gf, (long)(gg ^ gh)) + NLoginCore_557.d + (String)NLoginCore_199.c("㺃", (int)gi, (long)gj) + NLoginCore_277);
                }
                if (NLoginCore_557.int_a(NLoginCore_557) > gk) {
                    throw new IllegalArgumentException((String)NLoginCore_199.c("㺆", (int)gl, (long)(gm ^ gn)) + NLoginCore_557.int_a(NLoginCore_557) + (String)NLoginCore_199.c("㺉", (int)go, (long)(gp ^ gq)) + gr);
                }
                int n3 = n2 + NLoginCore_557.int_a(NLoginCore_557);
                if (n3 > gs) {
                    NLoginCore_370.b((String)NLoginCore_199.c("㺌", (int)(gt & gu), (long)gv) + n3 + (String)NLoginCore_199.c("㺏", (int)gw, (long)gx) + gy + (String)NLoginCore_199.c("㺒", (int)gz, (long)ha), new Object[hb]);
                    this.a(NLoginCore_277, NLoginCore_557Array, i);
                    break;
                }
                n2 = n3;
                jSONArray.put((Object)NLoginCore_557.com_nickuc_login_lib_json_JSONObject_a(NLoginCore_557));
            }
            if (jSONArray.length() == 0) {
                return;
            }
            jSONObject.put((String)NLoginCore_199.c("㺕", (int)hc, (long)(hd ^ he)), (Object)jSONArray);
        }
        jSONObject.put((String)NLoginCore_199.c("㺘", (int)(hf & hg), (long)hh), (Object)NLoginCore_158.java_lang_String_a(this.var_byte_arr_a));
        this.c(NLoginCore_277, jSONObject);
    }
}

