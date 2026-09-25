/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
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
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_407 {
    final HashMap<String, Object> cfr_renamed_2 = new HashMap();
    private static int var_int_c;
    private static long m;
    private static long bi;
    private static int be;
    private static long x;
    private static long d;
    private static int u;
    private static int ak;
    private static int bl;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int aq;
    private static int bc;
    private static int ax;
    private static int f;
    private static long o;
    private static long ar;
    String var_java_lang_String_w;
    private static int bg;
    private static long af;
    private static long s;
    private static int az;
    private static long al;
    private static int ab;
    private static long ba;
    private static long p;
    private static int aj;
    private static long ay;
    boolean var_boolean_z;
    private static int ah;
    private static int n;
    private static int bj;
    private static int ae;
    private static long ai;
    private static long ap;
    private static int k;
    final /* synthetic */ ForceRegisterConfig var_com_nickuc_login_ForceRegisterConfig_c;
    private static int var_int_z;
    private static long bf;
    private static long v;
    private static int bk;
    private static int au;
    private static long aw;
    private static int t;
    private static int var_int_a;
    private static int q;
    private static long l;
    private static int at;
    private static int var_int_b;
    private static long i;
    private static int var_int_w;
    private static int r;
    private static long j;
    private static long ac;
    private static long bh;
    private static int ag;
    private static int am;
    private static long av;
    private static long bb;
    private static int h;
    private static long y;
    private static long ao;
    private static int an;
    private static long aa;
    private static long e;
    private static int bd;
    private static long as;
    private static int ad;
    private static long g;
    private static String[] var_java_lang_String_arr_a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void I() {
        JSONObject jSONObject;
        int n = aj;
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            jSONObject = (JSONObject)this.a((String)NLoginCore_407.c("㺀", (int)ak, (long)al));
            if (jSONObject == null) {
                return;
            }
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (this.b(string) != null) continue;
                iterator.remove();
                n = am;
            }
        }
        if (jSONObject.isEmpty()) {
            this.void_d((String)NLoginCore_407.c("㺃", (int)an, (long)(ao ^ ap)));
        } else if (n != 0) {
            this.a((String)NLoginCore_407.c("㺆", (int)aq, (long)(ar ^ as)), jSONObject);
        }
    }

    private static void b() {
        int n;
        var_long_c = 4708241937174721208L;
        long l = var_long_c ^ 0x8E90ECC8381232BCL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(79 + 4), (byte)(7 + 40), (byte)(29 + 38), (byte)(42 + 24), (byte)(24 + 43), (byte)(46 + 1), (byte)(2 + 78), (byte)(61 + 14), (byte)(2 + 65), (byte)(15 + 68), (byte)(35 + 18), (byte)(21 + 59), (byte)(59 + 38), 100, (byte)(8 + 92), (byte)(59 + 46), (byte)(34 + 76), (byte)(31 + 72)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
                    NLoginCore_407.var_java_lang_String_arr_b[0] = NLoginCore_076.E("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣֌։֊", (byte)122, 69);
                    NLoginCore_407.var_java_lang_String_arr_b[1] = NLoginCore_027.D("՗՛ֆ֟հ֋֗հչ֡ւի", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[2] = NLoginCore_004.D("եի՜՗֘֝ց՝խ՝֝ա֢֩֩ժ֛֎֎պ֚։նշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[3] = NLoginCore_004.F("ովկժְ֫֔հրհְմֵּּս֮֡֡֍֭֜։֊", (byte)122, 70);
                    NLoginCore_407.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ƧƫǖǯǀǛǧǀǉǱǒƻ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[5] = NLoginCore_451.B("ǜǎǬǉǈǲǬƻǡǣǐưǎǬǲƺǉƷǨǉǿǋǖƺǮǛǱǰǈȊǽǷ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[6] = NLoginCore_173.B("ǨǎǗƥƽǫǜǱǯǕǅǫǧƸǚǧǵƶǝǌǠǉǆǇ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ƧƫǖǯǀǛǧǀǉǱǒƻ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[8] = NLoginCore_446.A("ƵƻƬƧǨǭǑƭƽƭǭƱǲǹǹƺǫǞǞǊǪǙǆǇ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[9] = NLoginCore_427.D("֘վևՕխ֛֌֡֟օյ֛֗ը֊֥֗զ֍ռ֐չնշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[10] = NLoginCore_446.E("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣֌։֊", (byte)122, 69);
                    NLoginCore_407.var_java_lang_String_arr_b[11] = NLoginCore_575.C("֘վևՕխ֛֌֡֟օյ֛֗ը֊֥֗զ֍ռ֐չնշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ǨǎǗƥƽǫǜǱǯǕǅǫǧƸǚǧǵƶǝǌǠǉǆǇ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[13] = NLoginCore_453.C("֘վևՕխ֛֌֡֟օյ֛֗ը֊֥֗զ֍ռ֐չնշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[14] = NLoginCore_446.F("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣֌։֊", (byte)122, 70);
                    NLoginCore_407.var_java_lang_String_arr_b[15] = NLoginCore_223.A("ƾǛǮƼǅǨǱƥǌǍǒƻ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[16] = NLoginCore_138.D("՗՛ֆ֟հ֋֗հչ֡ւի", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[17] = NLoginCore_201.B("ƵǅƶƷƽǋǰǊƲƵǖƻ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[18] = NLoginCore_201.B("ǇǠƸǦǧƪƭǇǍƭǪǖǣǕǆǩǚǙǱǓǓǙǆǇ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[19] = NLoginCore_387.A("ǙǗǣǰǫƧǟǝǎǈǯǒǡǄǪǐƳǵǍǙǭǪǓǱǖƿǷǖȁǜǁǕǬǩǍǆǭǉǉǎȎǏǞǉȈǸǓǖȌǜȋǬǜǹǦǧ", (byte)122, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_407.var_java_lang_String_arr_b[0] = NLoginCore_559.F("֑֚֫ըրֲִ֮֟֘ֈַָֽ֥֭֕֙շռֻ֌։֊", (byte)122, 70);
                    NLoginCore_407.var_java_lang_String_arr_b[1] = NLoginCore_223.D("֋ՖղՙՖ՚ժ֐֏֐ջ֕բ֩ե֓֕ժ֢֤֟֟նշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[2] = NLoginCore_453.C("եի՜՗֘֝ց՝խ՝֜ֈէփ֩֊֠դ֣ս֘։նշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[3] = NLoginCore_223.F("ովկժְ֫֔հրհֲ֮֋ֳ֊ֆպֈ֯֎֍ֲ։֊", (byte)122, 70);
                    NLoginCore_407.var_java_lang_String_arr_b[4] = NLoginCore_110.E("֟֫֩֬֊։֢֮ֈֳ֣֪֙֙֙ֆշָ֮ւֲֵ։֊", (byte)122, 69);
                    NLoginCore_407.var_java_lang_String_arr_b[5] = NLoginCore_451.C("֌վ֜չո֢֜ի֑֓րՠվ֢֜ժչէ֘չ֯ւփ֊֓ր֍օ֊ִּ֑ոֲִֵַ֛֬֟֘֐ִ֋", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[6] = NLoginCore_559.A("ǨǎǗƥƽǫǜǱǯǕǄưǏǌǘǥǸǰǚǨǵǉǆǇ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[7] = NLoginCore_451.C("֍֏՞։֠ակ֤֜աս֛ՠբթմևդ֎֗֡չնշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[8] = NLoginCore_223.C("եի՜՗֘֝ց՝խ՝֞֨ՠ֢֧֗֓֩իփժ։նշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[9] = NLoginCore_223.B("ǨǎǗƥƽǫǜǱǯǕǂǷƲƫǒǼǊǼǊǰǩǿǆǇ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[10] = NLoginCore_092.D("֘վևՕխ֛֌֡֟օճյձ֞ամ֌֥֙֨ց֯նշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[11] = NLoginCore_110.A("ǨǎǗƥƽǫǜǱǯǕǃǁǬǅǨǆǊǾǏǧǖǯǆǇ", (byte)122, 65);
                    NLoginCore_407.var_java_lang_String_arr_b[12] = NLoginCore_076.E("֑֚֫ըրֲִ֮֟֘ևչֈְֱֽ֛֧֬ւ֛֜։֊", (byte)122, 69);
                    NLoginCore_407.var_java_lang_String_arr_b[13] = NLoginCore_451.D("֘վևՕխ֛֌֡֟օմ֜ւ֢չշլ֜ժչ֧։նշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[14] = NLoginCore_324.C("֘վևՕխ֛֌֡֟օճկֈս֛տցցէ֝փ֟նշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[15] = NLoginCore_427.C("֓իռղլթխ֔փվւի", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[16] = NLoginCore_076.C("լ֚֘պ՝ժ֜֋փտ՜֣֞ըը֚թօ֟ռր֯նշ", (byte)122, 67);
                    NLoginCore_407.var_java_lang_String_arr_b[17] = NLoginCore_091.B("ǅǢǮǅǉƿǚǠǴƭǤƭǨǸǺǱǔǏǲǧǶǿǆǇ", (byte)122, 66);
                    NLoginCore_407.var_java_lang_String_arr_b[18] = NLoginCore_004.D("շ֐ը֖֗՚՝շս՝֘֐ջձ֒տ֖իօ֮֝֟նշ", (byte)122, 68);
                    NLoginCore_407.var_java_lang_String_arr_b[19] = NLoginCore_451.F("ֳ֦֚֮֜ժ֢֑֠֋ֲ֤֕և֭֓նָ֐ְִ֖֭֜֙ւֺ֙ׄ֟ք֘֯֬֐։ְ֌֌֑ב֤֥֒֔׈דןז֛א֚ס֪֬֩", (byte)122, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_407.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ƿǣƥǃƹǟǋƯƯǠƾǂǬǏǂǼƼǻƼǭǰǽƴǭǄǶǕǸǿȆǦǆ", (byte)122, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_407.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ǝƺƻǢǄǊǯǏǯǕǓǣǔưǸƱǐǖǿƼǚǿǆǇ", (byte)122, 66);
                }
            }
        }
    }

    static {
        var_int_a = (128 >>> 71 | 128 << ~71 + 1) & 0xFFFFFFFF;
        var_int_b = 4 >>> 130 | 4 << ~130 + 1;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(2111809637166672514L);
        e = Long.reverse(0x1200000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(1103003320635681410L);
        h = 131072 >>> 16 | 131072 << ~16 + 1;
        i = Long.reverse(2111809637166672514L);
        j = Long.reverse(0x1200000000000000L);
        k = 0x600000 >>> 213 | 0x600000 << ~213 + 1;
        l = Long.reverse(2111809637166672514L);
        m = Long.reverse(0x1200000000000000L);
        n = (2048 >>> 41 | 2048 << -41) & 0xFFFFFFFF;
        o = Long.reverse(2111809637166672514L);
        p = Long.reverse(0x1200000000000000L);
        q = Integer.reverse(-1610612736);
        r = Integer.reverse(-1);
        s = Long.reverse(1103003320635681410L);
        t = 3072 >>> 233 | 3072 << -233;
        u = Integer.reverse(-1);
        v = Long.reverse(1103003320635681410L);
        var_int_w = Integer.reverse(-536870912);
        x = Long.reverse(2111809637166672514L);
        y = Long.reverse(0x1200000000000000L);
        var_int_z = (8 >>> 192 | 8 << ~192 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(1103003320635681410L);
        ab = 18432 >>> 43 | 18432 << -43;
        ac = Long.reverse(1103003320635681410L);
        ad = 2560 >>> 168 | 2560 << ~168 + 1;
        ae = (-1 >>> 212 | -1 << ~212 + 1) & 0xFFFFFFFF;
        af = Long.reverse(1103003320635681410L);
        ag = Integer.reverse(-805306368);
        ah = -1 >>> 26 | -1 << ~26 + 1;
        ai = Long.reverse(1103003320635681410L);
        aj = (0 >>> 74 | 0 << ~74 + 1) & 0xFFFFFFFF;
        ak = Integer.reverse(0x30000000);
        al = Long.reverse(1103003320635681410L);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = 208 >>> 196 | 208 << -196;
        ao = Long.reverse(2111809637166672514L);
        ap = Long.reverse(0x1200000000000000L);
        aq = 0x1C0000 >>> 241 | 0x1C0000 << -241;
        ar = Long.reverse(2111809637166672514L);
        as = Long.reverse(0x1200000000000000L);
        at = Integer.reverse(0);
        au = (0x78000000 >>> 91 | 0x78000000 << ~91 + 1) & 0xFFFFFFFF;
        av = Long.reverse(2111809637166672514L);
        aw = Long.reverse(0x1200000000000000L);
        ax = Integer.reverse(0x8000000);
        ay = Long.reverse(1103003320635681410L);
        az = (0x20000002 >>> 61 | 0x20000002 << ~61 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(2111809637166672514L);
        bb = Long.reverse(0x1200000000000000L);
        bc = (0 >>> 23 | 0 << ~23 + 1) & 0xFFFFFFFF;
        bd = (0x2400000 >>> 53 | 0x2400000 << -53) & 0xFFFFFFFF;
        be = Integer.reverse(-1);
        bf = Long.reverse(1103003320635681410L);
        bg = 0x26000000 >>> 185 | 0x26000000 << -185;
        bh = Long.reverse(2111809637166672514L);
        bi = Long.reverse(0x1200000000000000L);
        bj = (0 >>> 213 | 0 << -213) & 0xFFFFFFFF;
        bk = (0x2800000 >>> 53 | 0x2800000 << ~53 + 1) & 0xFFFFFFFF;
        bl = (0x5000000 >>> 246 | 0x5000000 << ~246 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[bk];
        var_java_lang_String_arr_b = new String[bl];
        NLoginCore_407.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public <T> T a(String string) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            return (T)this.cfr_renamed_2.get(string.toLowerCase(Locale.ENGLISH));
        }
    }

    public HashMap<String, Object> a() {
        return (HashMap)this.cfr_renamed_2.clone();
    }

    @Generated
    public boolean E() {
        return this.var_boolean_z;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean boolean_c(String string) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            return this.cfr_renamed_2.containsKey(string.toLowerCase(Locale.ENGLISH));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public String n() {
        if (this.var_com_nickuc_login_ForceRegisterConfig_c.var_com_nickuc_login_NLoginCore_407_a.var_boolean_z) {
            try {
                JSONObject jSONObject = new JSONObject();
                HashMap<String, Object> hashMap = this.cfr_renamed_2;
                synchronized (hashMap) {
                    if (this.cfr_renamed_2.isEmpty()) {
                        return null;
                    }
                    JSONArray jSONArray = new JSONArray();
                    int n = at;
                    for (Map.Entry<String, Object> entry : this.cfr_renamed_2.entrySet()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((String)NLoginCore_407.c("㺀", (int)au, (long)(av ^ aw)), (Object)entry.getKey());
                        jSONObject2.put((String)NLoginCore_407.c("㺃", (int)ax, (long)ay), entry.getValue());
                        jSONArray.put(n, (Object)jSONObject2);
                        ++n;
                    }
                    jSONObject.put((String)NLoginCore_407.c("㺆", (int)az, (long)(ba ^ bb)), bc);
                    jSONObject.put((String)NLoginCore_407.c("㺉", (int)(bd & be), (long)bf), (Object)jSONArray);
                }
                this.var_java_lang_String_w = jSONObject.toString();
                return this.var_java_lang_String_w;
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_407.c("㺌", (int)bg, (long)(bh ^ bi)), new Object[bj]);
            }
        }
        return this.var_java_lang_String_w;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <T> T a(String string, T t) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            return (T)this.cfr_renamed_2.getOrDefault(string.toLowerCase(Locale.ENGLISH), t);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string2, Object object, long l, TimeUnit timeUnit) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_407.c("㺀", (int)(q & r), (long)s));
        }
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            JSONObject jSONObject = (JSONObject)this.cfr_renamed_2.computeIfAbsent((String)NLoginCore_407.c("㺃", (int)(t & u), (long)v), string -> new JSONObject());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((String)NLoginCore_407.c("㺆", (int)var_int_w, (long)(x ^ y)), object);
            jSONObject2.put((String)NLoginCore_407.c("㺉", (int)var_int_z, (long)aa), System.currentTimeMillis() + timeUnit.toMillis(l));
            jSONObject.put(string2, (Object)jSONObject2);
            this.a((String)NLoginCore_407.c("㺌", (int)ab, (long)ac), jSONObject);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void void_d(String string) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            if (this.cfr_renamed_2.remove(string.toLowerCase(Locale.ENGLISH)) != null) {
                this.var_boolean_z = var_int_b;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, Object object) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            this.cfr_renamed_2.put(string, object);
        }
        this.var_boolean_z = var_int_a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public <T> T b(String string) {
        JSONObject jSONObject;
        string = string.toLowerCase(Locale.ENGLISH);
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            JSONObject jSONObject2 = (JSONObject)this.a((String)NLoginCore_407.c("㺀", (int)var_int_c, (long)(d ^ e)));
            if (jSONObject2 == null) {
                return null;
            }
            if (!jSONObject2.has(string)) {
                return null;
            }
            jSONObject = jSONObject2.getJSONObject(string);
        }
        if (!jSONObject.has((String)NLoginCore_407.c("㺃", (int)f, (long)g)) || !jSONObject.has((String)NLoginCore_407.c("㺆", (int)h, (long)(i ^ j)))) {
            this.void_d(string);
            return null;
        }
        long l = jSONObject.getLong((String)NLoginCore_407.c("㺉", (int)k, (long)(NLoginCore_407.l ^ m)));
        if (System.currentTimeMillis() >= l) {
            this.void_d(string);
            return null;
        }
        Object object = jSONObject.get((String)NLoginCore_407.c("㺌", (int)n, (long)(o ^ p)));
        if (object == null) {
            this.void_d(string);
            return null;
        }
        return (T)object;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_407.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)103, 67), NLoginCore_407.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("Ս՚ՙԜ՜՘Փ՜էՖԣաե՞աէԩ࢞ࢽ࢘ࢳ࢒ࢷ࢕ࢴ࣊࣍ࢺ࣏ࢭࣆՃ", (byte)103, 67) + string + NLoginCore_446.D("Ԥ", (byte)103, 68) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e(String string2) {
        HashMap<String, Object> hashMap = this.cfr_renamed_2;
        synchronized (hashMap) {
            JSONObject jSONObject = (JSONObject)this.cfr_renamed_2.computeIfAbsent((String)NLoginCore_407.c("㺀", (int)(ad & ae), (long)af), string -> new JSONObject());
            if (jSONObject.remove(string2) != null) {
                this.a((String)NLoginCore_407.c("㺃", (int)(ag & ah), (long)ai), jSONObject);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x48L;
        l ^= 0x8E90ECC8381232BCL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(45 + 24), (byte)(58 + 25), (byte)(27 + 20), (byte)(10 + 57), (byte)(57 + 9), (byte)(45 + 22), (byte)(5 + 42), (byte)(10 + 70), (byte)(51 + 24), (byte)(56 + 11), (byte)(37 + 46), (byte)(23 + 30), (byte)(17 + 63), 97, (byte)(57 + 43), (byte)(65 + 35), (byte)(90 + 15), 110, (byte)(80 + 23)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӫԊӥԀӟԄӢԁԗԚԇԜӺԓ", (byte)92, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_407.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_407(ForceRegisterConfig ForceRegisterConfig2) {
        this.var_com_nickuc_login_ForceRegisterConfig_c = ForceRegisterConfig2;
    }
}

