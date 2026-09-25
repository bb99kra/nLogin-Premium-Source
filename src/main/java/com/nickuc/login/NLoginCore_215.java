/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_540;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_184;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

class NLoginCore_215
implements Consumer<String> {
    private static long f;
    private static int h;
    private static long g;
    private static long i;
    private static long ai;
    private static long j;
    private static int e;
    private static long ae;
    private static int ah;
    private static long var_long_c;
    private static int t;
    private static int p;
    private static long z;
    private static int q;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private static int aa;
    private static int d;
    private static long ab;
    private static int k;
    private static int ad;
    private static long v;
    private static long af;
    private static int var_int_n;
    private static int var_int_a;
    private static int ak;
    private static int aj;
    private static int x;
    private static long l;
    private static int o;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_n;
    private static long y;
    private static long r;
    private static int s;
    private static int u;
    private static String[] var_java_lang_String_arr_a;
    private static int an;
    private static int ag;
    private static long m;
    private static long ac;
    private static long w;
    private static int am;
    private static int var_int_c;
    private static long al;

    /* synthetic */ NLoginCore_215(NLoginType_008 NLoginType_008, NLoginCore_540 μψδυπκρρΓκκΓΓΨ2) {
        this(NLoginType_008);
    }

    @Generated
    private NLoginCore_215(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_n = NLoginType_008;
    }

    private void a(int n, JSONObject jSONObject) {
        switch (n) {
            case 0: {
                String string = jSONObject.getString((String)NLoginCore_215.c("㺀", (int)u, (long)(v ^ w)));
                String string2 = jSONObject.getString((String)NLoginCore_215.c("㺃", (int)x, (long)(y ^ z)));
                NLoginCore_280 NLoginCore_280 = (NLoginCore_280)jSONObject.getEnum(NLoginCore_280.class, (String)NLoginCore_215.c("㺆", (int)aa, (long)(ab ^ ac)));
                NLoginCore_073.a(string, string2, NLoginCore_280);
                break;
            }
            case 1: {
                String string = jSONObject.getString((String)NLoginCore_215.c("㺉", (int)ad, (long)(ae ^ af)));
                String string3 = jSONObject.getString((String)NLoginCore_215.c("㺌", (int)(ag & ah), (long)ai));
                NLoginCore_184 NLoginCore_1842 = (NLoginCore_184)jSONObject.getEnum(NLoginCore_184.class, (String)NLoginCore_215.c("㺏", (int)(aj & ak), (long)al));
                NLoginCore_073.a(string, string3, NLoginCore_1842);
                break;
            }
        }
    }

    static {
        var_int_a = 0 >>> 180 | 0 << ~180 + 1;
        var_int_b = (1031798784 >>> 183 | 1031798784 << -183) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = -2147483586 >>> 223 | -2147483586 << -223;
        e = Integer.reverse(0);
        f = Long.reverse(3495969375016642814L);
        g = Long.reverse(0x2400000000000000L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(3495969375016642814L);
        j = Long.reverse(0x2400000000000000L);
        k = Integer.reverse(0x40000000);
        l = Long.reverse(3495969375016642814L);
        m = Long.reverse(0x2400000000000000L);
        var_int_n = Integer.reverse(Integer.MIN_VALUE);
        o = (0 >>> 25 | 0 << ~25 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(-1073741824);
        q = (-1 >>> 119 | -1 << -119) & 0xFFFFFFFF;
        r = Long.reverse(1478356741954660606L);
        s = Integer.reverse(Integer.MIN_VALUE);
        t = 0 >>> 255 | 0 << ~255 + 1;
        u = Integer.reverse(0x20000000);
        v = Long.reverse(3495969375016642814L);
        w = Long.reverse(0x2400000000000000L);
        x = Integer.reverse(-1610612736);
        y = Long.reverse(3495969375016642814L);
        z = Long.reverse(0x2400000000000000L);
        aa = Integer.reverse(0x60000000);
        ab = Long.reverse(3495969375016642814L);
        ac = Long.reverse(0x2400000000000000L);
        ad = Integer.reverse(-536870912);
        ae = Long.reverse(3495969375016642814L);
        af = Long.reverse(0x2400000000000000L);
        ag = Integer.reverse(0x10000000);
        ah = (-1 >>> 132 | -1 << ~132 + 1) & 0xFFFFFFFF;
        ai = Long.reverse(1478356741954660606L);
        aj = (18432 >>> 107 | 18432 << -107) & 0xFFFFFFFF;
        ak = Integer.reverse(-1);
        al = Long.reverse(1478356741954660606L);
        am = Integer.reverse(0x50000000);
        an = (10240 >>> 138 | 10240 << -138) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[am];
        var_java_lang_String_arr_b = new String[an];
        NLoginCore_215.b();
    }

    private static void b() {
        int n;
        var_long_c = 9157860814683906316L;
        long l = var_long_c ^ 0x627C2898740D3C5CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(6 + 63), (byte)(60 + 23), (byte)(7 + 40), (byte)(15 + 52), (byte)(24 + 42), (byte)(51 + 16), (byte)(7 + 40), (byte)(34 + 46), (byte)(68 + 7), (byte)(36 + 31), 83, (byte)(4 + 49), (byte)(60 + 20), (byte)(30 + 67), (byte)(62 + 38), (byte)(73 + 27), (byte)(62 + 43), 110, (byte)(41 + 62)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_215.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ҷӯҺӉөӫӏӥӴӦӔҽ", (byte)64, 67);
                    NLoginCore_215.var_java_lang_String_arr_b[1] = NLoginCore_453.A("ŴŦŘĵĶŬļœŕŠŚŇ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[2] = NLoginCore_173.D("ҹӄӛҼӝӯӍӶӵӴӐӱӣӅӶӥҽӒӗӑӮӒӱӟӡӓӣӝӀӻӽӕӅԐӹӮӧӒӆӬԆԀӭӶӨӖӛԅԗԏӼԀӼԟӚӛӜәԝӠԉԤӶԮ", (byte)64, 68);
                    NLoginCore_215.var_java_lang_String_arr_b[3] = NLoginCore_223.A("ŃŎťņŧŹŗƀſžŚŻŭŏƀůŇŜšśŸŜŻũūŝŭŧŊƅƇşŏƚƃŸűŜŐŶƐƊŷƀŲŠťƏơƙƆƊƆƩŤťŦţƧŪƓƮƀƸ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[4] = NLoginCore_453.A("ŪźŚŊŊŋľŬŕŪŚŇ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[5] = NLoginCore_138.E("ՍՕՒԲ՗լԲԸԼը՗Մ", (byte)64, 69);
                    NLoginCore_215.var_java_lang_String_arr_b[6] = NLoginCore_138.A("ŰįĬĵŷįŏŋŚľŞŇ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[7] = NLoginCore_575.C("ӠӰӐӀӀӁҴӢӋӠӐҽ", (byte)64, 67);
                    NLoginCore_215.var_java_lang_String_arr_b[8] = NLoginCore_384.B("ŐŘŕĵŚůĵĻĿūŚŇ", (byte)64, 66);
                    NLoginCore_215.var_java_lang_String_arr_b[9] = NLoginCore_453.C("ӦҥҢҫӭҥӅӁӐҴӔҽ", (byte)64, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_215.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ճիԲնթյկՆխհՋՄ", (byte)64, 70);
                    NLoginCore_215.var_java_lang_String_arr_b[1] = NLoginCore_027.D("ӉӃӃӜҤӔҰҭӥӕӶҽ", (byte)64, 68);
                    NLoginCore_215.var_java_lang_String_arr_b[2] = NLoginCore_427.B("ŃŎťņŧŹŗƀſžŚŻŭŏƀůŇŜšśŸŜŻũūŝŭŧŊƅƇşŏƚƃŸűŜŐŶƐƊŷƀŲŠťƏơƙƆƊƆƪƞūŹƯŨųƦűƤƓ", (byte)64, 66);
                    NLoginCore_215.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ՀՋբՃդնՔսռջ՗ոժՌսլՄՙ՞՘յՙոզը՚ժդՇւք՜Ռ֗րյծՙՍճ֍ևմսկ՝բ֌֖֞փևփ֟փ֝փ֟֩ըսֳ֦ծ", (byte)64, 69);
                    NLoginCore_215.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ӃӆӱңӁүӧҰӕӶӠұӬӔҮӬҷӿӽӍӽԁӈӉ", (byte)64, 68);
                    NLoginCore_215.var_java_lang_String_arr_b[5] = NLoginCore_223.C("ӏӣӄӊӡӲӟӳҮӗӲҽ", (byte)64, 67);
                    NLoginCore_215.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ŲŬŔŰŝżŴŞļŒĽŇ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[7] = NLoginCore_384.A("ŹĳĶŉŒŨűŵōŶƂŠŹŭŚŤśŹŔŷņƋŒœ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[8] = NLoginCore_559.A("ŔņńĺŘŝŸŸōĽŖŇ", (byte)64, 65);
                    NLoginCore_215.var_java_lang_String_arr_b[9] = NLoginCore_138.A("ĪĴŧŦŤŏŗūŜķĽŇ", (byte)64, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_215.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ՕՉԶգչՏջոՆպՏԻԹՖ՟չաՕրԺսբՏՐ", (byte)64, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_215.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŭųřŦŋŗœŋŨſŵŜŭƂŢŴŧŶřŻƅŕŒœ", (byte)64, 66);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_215.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 65), NLoginCore_215.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձࣷऀअऎअ࣫ऍࣾ࣫ࣵऌओःऎ֋", (byte)118, 69) + string + NLoginCore_559.C("Ց", (byte)118, 67) + methodType.toString(), exception);
        }
    }

    public void i(String string) {
        try {
            if (string.charAt(var_int_a) == var_int_b && string.charAt(string.length() - var_int_c) == d) {
                JSONObject jSONObject = new JSONObject(string);
                this.a(jSONObject.getInt((String)NLoginCore_215.c("㺀", (int)e, (long)(f ^ g))), jSONObject.getJSONObject((String)NLoginCore_215.c("㺃", (int)h, (long)(i ^ j))));
                return;
            }
            Object[] objectArray = new Object[var_int_n];
            objectArray[NLoginCore_215.o] = string;
            NLoginCore_370.d((String)NLoginCore_215.c("㺆", (int)k, (long)(l ^ m)), objectArray);
        }
        catch (JSONException jSONException) {
            Object[] objectArray = new Object[s];
            objectArray[NLoginCore_215.t] = string;
            NLoginCore_370.c((String)NLoginCore_215.c("㺉", (int)(p & q), (long)r), jSONException, objectArray);
        }
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.i((String)object);
    }

    private static String a(int n, long l) {
        l ^= 0x24L;
        l ^= 0x627C2898740D3C5CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(29 + 40), (byte)(11 + 72), (byte)(19 + 28), (byte)(54 + 13), (byte)(7 + 59), (byte)(18 + 49), (byte)(29 + 18), (byte)(13 + 67), 75, (byte)(10 + 57), (byte)(6 + 77), (byte)(46 + 7), (byte)(15 + 65), 97, (byte)(94 + 6), (byte)(36 + 64), (byte)(68 + 37), (byte)(53 + 57), (byte)(53 + 50)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ࢈࢑࢖࢟࢖ࡼ࢞࢏ࡼࢆ࢝ࢤ࢔࢟", (byte)7, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_215.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

