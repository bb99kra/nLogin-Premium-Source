/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_407;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_035;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_551 {
    private static long bf;
    private static long x;
    private static long ap;
    private static int ay;
    private static int i;
    private static long bb;
    private static int bz;
    private static long bc;
    private static int var_int_a;
    private static int bp;
    private static int bg;
    private static long ai;
    private static int e;
    private static long p;
    private static int bs;
    private static int au;
    private static int bj;
    private static long br;
    private static int ar;
    private static long y;
    private static int o;
    private static int k;
    private static int l;
    private static int bx;
    private static int bl;
    private static long as;
    private final NLoginCore_033 var_com_nickuc_login_NLoginCore_033_b;
    private static long v;
    private static int d;
    private static int u;
    private static int ag;
    private static int ae;
    private static int bt;
    private static int an;
    private static int aq;
    private static int be;
    private static int m;
    private static int ba;
    private static int h;
    private static long at;
    private static long ab;
    private static int ax;
    private static int cc;
    private static int bq;
    private static String[] var_java_lang_String_arr_a;
    private static int r;
    private static long ao;
    private static int bn;
    private static int aa;
    private static long bk;
    private static int f;
    private static long ac;
    private static long n;
    private static long aw;
    private static long j;
    private static int bm;
    private static long bo;
    private static long az;
    private static int aj;
    private static long ah;
    private static int g;
    private static long al;
    private static int bh;
    private static long q;
    private static int bv;
    private static long s;
    private static long t;
    private static long bw;
    private static String[] var_java_lang_String_arr_b;
    private static int by;
    private static int w;
    private static long var_long_c;
    private static long bi;
    private static int var_int_b;
    private static int bu;
    private static int ad;
    private static int ca;
    private static int cb;
    private static int var_int_c;
    private static int bd;
    private static int am;
    private static long af;
    private static int av;
    private static int z;
    private static int ak;

    @Generated
    public NLoginCore_551(NLoginCore_033 NLoginCore_0332) {
        this.var_com_nickuc_login_NLoginCore_033_b = NLoginCore_0332;
    }

    private void b(NLoginCore_277 NLoginCore_277, JSONObject jSONObject) {
        if (!jSONObject.has((String)NLoginCore_551.c("㺀", (int)m, (long)n)) || !jSONObject.has((String)NLoginCore_551.c("㺃", (int)o, (long)(p ^ q)))) {
            return;
        }
        NLoginType_008 NLoginType_008 = this.var_com_nickuc_login_NLoginCore_033_b.var_com_nickuc_login_NLoginType_008_o;
        NLoginCore_187 NLoginCore_1872 = NLoginType_008.com_nickuc_login_NLoginCore_187_a();
        NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        int n = jSONObject.getInt((String)NLoginCore_551.c("㺆", (int)r, (long)(s ^ t)));
        JSONObject jSONObject2 = jSONObject.getJSONObject((String)NLoginCore_551.c("㺉", (int)u, (long)v));
        switch (n) {
            case 0: {
                if (NLoginCore_5092.a(NLoginCore_567.N)) break;
                byte[] byArray = NLoginCore_158.byte_arr_a(jSONObject2.getString((String)NLoginCore_551.c("㺌", (int)w, (long)(x ^ y))).getBytes(StandardCharsets.UTF_8));
                NLoginCore_5092.a(NLoginCore_567.N, byArray);
                ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
                NLoginType_008.b(z != 0).a(() -> {
                    if (LoginMainQueueTask.c(NLoginCore_277) && NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d)) {
                        boolean bl = ForceRegisterConfig2.boolean_A();
                        int n = !ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().boolean_c((String)NLoginCore_551.c("㺀", (int)(bu & bv), (long)bw)) ? bx : by;
                        this.var_com_nickuc_login_NLoginCore_033_b.a(NLoginCore_277, byArray, n != 0, (!bl ? bz : ca) != 0);
                    }
                });
                break;
            }
            case 1: {
                if (!NLoginCore_1872.boolean_b(NLoginCore_277) || !NLoginCore_5092.a(NLoginCore_567.N)) break;
                String string = jSONObject2.getString((String)NLoginCore_551.c("㺏", (int)aa, (long)(ab ^ ac)));
                if (string.length() > ad) {
                    NLoginCore_370.c((String)NLoginCore_551.c("㺒", (int)ae, (long)af) + NLoginCore_277.getName() + (String)NLoginCore_551.c("㺕", (int)ag, (long)(ah ^ ai)) + string.length() + (String)NLoginCore_551.c("㺘", (int)(aj & ak), (long)al) + am + (String)NLoginCore_551.c("㺛", (int)an, (long)(ao ^ ap)), new Object[aq]);
                    this.var_com_nickuc_login_NLoginCore_033_b.a(NLoginCore_277, NLoginCore_035.var_com_nickuc_login_NLoginCore_035_c);
                    break;
                }
                String string2 = jSONObject2.getString((String)NLoginCore_551.c("㺞", (int)ar, (long)(as ^ at)));
                if (string2.length() > au) {
                    NLoginCore_370.c((String)NLoginCore_551.c("㺡", (int)av, (long)aw) + NLoginCore_277.getName() + (String)NLoginCore_551.c("㺤", (int)(ax & ay), (long)az) + string2.length() + (String)NLoginCore_551.c("㺧", (int)ba, (long)(bb ^ bc)) + bd + (String)NLoginCore_551.c("㺪", (int)be, (long)bf), new Object[bg]);
                    this.var_com_nickuc_login_NLoginCore_033_b.a(NLoginCore_277, NLoginCore_035.var_com_nickuc_login_NLoginCore_035_d);
                    break;
                }
                ForceRegisterConfig ForceRegisterConfig3 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
                NLoginCore_407 NLoginCore_407 = ForceRegisterConfig3.com_nickuc_login_NLoginCore_407_a();
                NLoginCore_407.a((String)NLoginCore_551.c("㺭", (int)bh, (long)bi), string);
                NLoginCore_407.a((String)NLoginCore_551.c("㺰", (int)bj, (long)bk), string2);
                NLoginType_008.b(bl != 0).a(() -> {
                    NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[bs];
                    NLoginCore_436Array[NLoginCore_551.bt] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                    NLoginType_008.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig3, NLoginCore_436Array);
                });
                break;
            }
            case 2: {
                if (!NLoginCore_5092.a(NLoginCore_567.N)) break;
                ForceRegisterConfig ForceRegisterConfig4 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
                String string = (String)ForceRegisterConfig4.com_nickuc_login_NLoginCore_407_a().a((String)NLoginCore_551.c("㺳", (int)(bm & bn), (long)bo));
                String string3 = (String)ForceRegisterConfig4.com_nickuc_login_NLoginCore_407_a().a((String)NLoginCore_551.c("㺶", (int)(bp & bq), (long)br));
                if (string == null || string3 == null) break;
                this.var_com_nickuc_login_NLoginCore_033_b.a(NLoginCore_277, string, string3);
                break;
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 8L;
        l ^= 0x7C5F0FAA641B1763L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(64 + 5), (byte)(27 + 56), (byte)(18 + 29), (byte)(7 + 60), (byte)(2 + 64), (byte)(41 + 26), (byte)(29 + 18), (byte)(73 + 7), 75, (byte)(15 + 52), (byte)(13 + 70), (byte)(21 + 32), 80, (byte)(39 + 58), (byte)(58 + 42), (byte)(58 + 42), (byte)(85 + 20), (byte)(60 + 50), (byte)(47 + 56)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(37 + 46)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("ԫԸԷӺԺԶԱԺՅԴԁԿՃԼԿՅԇ࡬࢙࢔࢞ࢆࢗࢇࢡ࢖", (byte)12, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_551.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public boolean a(NLoginCore_277 NLoginCore_277, byte[] byArray) {
        try {
            if (BCryptHashProvider.java_security_KeyPair_b() == null) {
                return var_int_a != 0;
            }
            if (byArray.length == 0) {
                return var_int_b != 0;
            }
            String string = new String(byArray, StandardCharsets.UTF_8);
            if (string.length() > var_int_c && string.charAt(d) == e && string.charAt(string.length() - f) == g) {
                this.b(NLoginCore_277, new JSONObject(string));
            }
            return h != 0;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_551.c("㺀", (int)i, (long)j), exception, new Object[k]);
            return l != 0;
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_551.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.F("ӱԓԕӵԙԸ԰ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)13, 70), NLoginCore_551.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("üĉĈËċćĂċĖąÒĐĔčĐĖØнѪѥѯїѨјѲѧí", (byte)13, 65) + string + NLoginCore_173.F("ԃ", (byte)13, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -7650273461971480725L;
        long l = var_long_c ^ 0x7C5F0FAA641B1763L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(52 + 17), (byte)(43 + 40), (byte)(3 + 44), (byte)(40 + 27), (byte)(57 + 9), (byte)(22 + 45), 47, (byte)(4 + 76), (byte)(73 + 2), (byte)(19 + 48), (byte)(21 + 62), (byte)(43 + 10), (byte)(27 + 53), (byte)(69 + 28), (byte)(10 + 90), 100, (byte)(75 + 30), (byte)(45 + 65), (byte)(44 + 59)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(51 + 32)}, StandardCharsets.UTF_8));
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
                    NLoginCore_551.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ԪԩԿԭՄՉԼՇՁՀդէՑՂՙՕՌՈԷՇ՟պՀ՗՟պշդՃգժՖ։դ֎՞Շծ֋բՎձմն֘լ֎ռօՕջշ֖֟զէ", (byte)106, 67);
                    NLoginCore_551.var_java_lang_String_arr_b[1] = NLoginCore_453.A("ƜǇƄǌǏƉǐƎƾǏǀƛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ƖƾǅǄƿǈƋƧƆƢƢƛ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[3] = NLoginCore_092.F("կ֚՗֢֟՜֣ա֑֢֓ծ", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[4] = NLoginCore_027.C("Զ՞եդ՟ըԫՇԦՂՂԻ", (byte)106, 67);
                    NLoginCore_551.var_java_lang_String_arr_b[5] = NLoginCore_451.D("ԩՖժՌՉժԪՄժՂԴՁլՖՆզԮ՞իէ՜ՉՆՇ", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[6] = NLoginCore_559.B("ƖƾǅǄƿǈƋƧƆƢƢƛ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ժԟՎՌՌԫԬազգընժՂԲ՜՗ՒԺ՝՞Ւա՝ս՞պէչՃ֊֊ֆվՙ՟ը՜Չ՝֑եժգֈ֚՗Փ՚ղ՛֌՛՝մգ՜մձ֛֒ֈ֔֟֩ժ֜֊֋ְ֊֛ւխտւ֍ְֹ֔ք֧֞֕֞֙ֆև", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[8] = NLoginCore_138.D("Ԥ՝ԶԻԨեեգՋԧդԻ", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[9] = NLoginCore_092.E("֢֞֙՝գջ֢֠֞գ֓ծ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[10] = NLoginCore_027.B("ƾƢƊƉƘƙǓǉƾǄƶƛ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[11] = NLoginCore_453.B("ƙƅƧƤǆƢǋƌƲƧƐƍǍǖǇǑƲƓǝƺƮƩƦƧ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[12] = NLoginCore_223.E("֝Ւցտտ՞՟֖֛֔֙֩֝յե֏֊օխ֐֑փֶ֔֏կ֋մְ֒։սռ֚֞֊ְ֌ֹ֔֙֐ւֺ֥֥օֈָ֙փ֏֥֌ֵ֬חׇׂ֛֕֔׍ֳֹֻֽ֛֯׀ןכֱֵ֥֮", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[13] = NLoginCore_173.C("Ԥ՝ԶԻԨեեգՋԧդԻ", (byte)106, 67);
                    NLoginCore_551.var_java_lang_String_arr_b[14] = NLoginCore_138.C("իզկԪ԰Ոխկի԰ՠԻ", (byte)106, 67);
                    NLoginCore_551.var_java_lang_String_arr_b[15] = NLoginCore_223.A("ƾƢƊƉƘƙǓǉƾǄƶƛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[16] = NLoginCore_027.E("թ՘֝հ՜ղ֦֝էջմւ֧֦֬֗֐ժ֫ֆֲ֌չպ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[17] = NLoginCore_427.F("է֠ռձ՝հւբ֠ևւ֔չվլ֥ոս֥։ծ֌չպ", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[18] = NLoginCore_092.A("ƖƅǊƝƉƟǊǓƔƨơƯǙǔǓǄƽƗǘƳǟƹƦƧ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[19] = NLoginCore_201.C("ԴխՉԾԪԽՏԯխՔՏաՆՋԹղՅՊղՖԻՙՆՇ", (byte)106, 67);
                    NLoginCore_551.var_java_lang_String_arr_b[20] = NLoginCore_324.C("ԶԥժԽԩԿժճԴՈՁՏչմճդ՝ԷոՓտՙՆՇ", (byte)106, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_551.var_java_lang_String_arr_b[0] = NLoginCore_223.F("՝՜ղՠշռկպմճ֚֗քյ֌ֈտջժպ֭֒ճ֊֪֭֒֗ն֖֝։ּׁ֑֗պ֡־֕ց֤֨֝ւ֧֕֞׊׍ׇֽה֚֬֙", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[1] = NLoginCore_575.F("՟֋֔խվՖտ֑֙։օծ", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[2] = NLoginCore_427.E("՛֏՞փՕ֣֟֙սր֓ծ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[3] = NLoginCore_384.E("մչ֌֕ո֚նֆյչ։ծ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ժ֋ջջտրֆ֛բ֩դծ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[5] = NLoginCore_446.E("՜։֝տռ֝՝շ֝յէո֝և֖օտլձֲ֚֮չպ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ԥ՜ԬՇԬԹԺՁՉիԱԻ", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[7] = NLoginCore_427.A("ǊſƮƬƬƋƌǁǆǃǈǖǊƢƒƼƷƲƚƽƾƲǁƽǝƾǚǇǙƣǪǪǦǞƹƿǈƼƩƽǱǅǊǃǨǺƷƳƺǒƻǬƻƽǔǃƼǔǑǻǲǨǴǿȉǊǼǪǫȐǪǻǢǍǟǮǵǕȗǵǪǴǐǛȜȏȒǴǼȃȑǝǽȦǷȈ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[8] = NLoginCore_427.A("ƢƠƣǌǑƾƺƏǏƭǈƛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[9] = NLoginCore_575.A("ƟǈǋƬǆǇǒƥƠǌǄƛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[10] = NLoginCore_446.A("ƷǅƺǇǍƫƾƤǈǎƪƛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[11] = NLoginCore_324.D("ԹԥՇՄզՂիԬՒՇԯճլՉձԻՇխղշՓՙՆՇ", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[12] = NLoginCore_201.A("ǊſƮƬƬƋƌǁǆǃǈǖǊƢƒƼƷƲƚƽƾưǁǣƼƜƸơǝƿƶƪƩǇǋƷǝƹǁǦǆƽƯǒǒǧƲƵǥǆưƼǒƹǢǙȄǴǂǯǁǈǺǦȄȋǋǚȄǧȀǒǒǣǢǛ", (byte)106, 65);
                    NLoginCore_551.var_java_lang_String_arr_b[13] = NLoginCore_223.D("ՖԬբՅԽՀՒձդհԱԻ", (byte)106, 68);
                    NLoginCore_551.var_java_lang_String_arr_b[14] = NLoginCore_004.E("֔֘տ֔֕֝փ՟մյըծ", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[15] = NLoginCore_138.F("ժ֎֠՘լՠՠ֎֘զ֣ծ", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[16] = NLoginCore_004.B("ƖƅǊƝƉƟǊǓƔƨƠƸƓƕǈǏǊǎƲƳƫƹƦƧ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[17] = NLoginCore_201.F("է֠ռձ՝հւբ֠ևք֊ְ֧֩֫֞ծִ֛֡֔֝։֋֐ְղ֧ֆִֈ", (byte)106, 70);
                    NLoginCore_551.var_java_lang_String_arr_b[18] = NLoginCore_092.B("ƖƅǊƝƉƟǊǓƔƨƞǆƱƫƪǃǕƯǘƧƜǏƦƧ", (byte)106, 66);
                    NLoginCore_551.var_java_lang_String_arr_b[19] = NLoginCore_076.E("է֠ռձ՝հւբ֠ևց֊ա֣֛ք֜չ֫֫ֆիִִ֍ր֢֥֌ֲ֒֒", (byte)106, 69);
                    NLoginCore_551.var_java_lang_String_arr_b[20] = NLoginCore_446.F("թ՘֝հ՜ղ֦֝էջմպ֛ւ֚֭օ֢փ֍֋ռչպ", (byte)106, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_551.var_java_lang_String_arr_b[0] = NLoginCore_092.F("֖֕ծնփց֤֐֥֥ղ՜֗ֆְ֤֢֮֘ծ֝ռփ֟մօְ֏ոִկ֘", (byte)106, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_551.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ձհչ֖֡ծ֦֥֔֔֗ծ", (byte)106, 69);
                }
            }
        }
    }

    static {
        var_int_a = 64 >>> 38 | 64 << -38;
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = 1024 >>> 9 | 1024 << -9;
        d = 0 >>> 2 | 0 << ~2 + 1;
        e = 1968 >>> 196 | 1968 << ~196 + 1;
        f = Integer.reverse(Integer.MIN_VALUE);
        g = -2147483586 >>> 191 | -2147483586 << -191;
        h = (0x1000000 >>> 120 | 0x1000000 << -120) & 0xFFFFFFFF;
        i = 0 >>> 35 | 0 << -35;
        j = Long.reverse(-4111248671714890839L);
        k = (0 >>> 88 | 0 << ~88 + 1) & 0xFFFFFFFF;
        l = (1024 >>> 106 | 1024 << -106) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Long.reverse(-4111248671714890839L);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(-2958327167108043863L);
        q = Long.reverse(0x1000000000000000L);
        r = Integer.reverse(-1073741824);
        s = Long.reverse(-2958327167108043863L);
        t = Long.reverse(0x1000000000000000L);
        u = Integer.reverse(0x20000000);
        v = Long.reverse(-4111248671714890839L);
        w = 0x40000001 >>> 254 | 0x40000001 << ~254 + 1;
        x = Long.reverse(-2958327167108043863L);
        y = Long.reverse(0x1000000000000000L);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = (0x6000000 >>> 24 | 0x6000000 << -24) & 0xFFFFFFFF;
        ab = Long.reverse(-2958327167108043863L);
        ac = Long.reverse(0x1000000000000000L);
        ad = Integer.reverse(0x100000);
        ae = 229376 >>> 111 | 229376 << -111;
        af = Long.reverse(-4111248671714890839L);
        ag = Integer.reverse(0x10000000);
        ah = Long.reverse(-2958327167108043863L);
        ai = Long.reverse(0x1000000000000000L);
        aj = Integer.reverse(-1879048192);
        ak = (-1 >>> 113 | -1 << ~113 + 1) & 0xFFFFFFFF;
        al = Long.reverse(-4111248671714890839L);
        am = 0x2000000 >>> 174 | 0x2000000 << -174;
        an = Integer.reverse(0x50000000);
        ao = Long.reverse(-2958327167108043863L);
        ap = Long.reverse(0x1000000000000000L);
        aq = Integer.reverse(0);
        ar = Integer.reverse(-805306368);
        as = Long.reverse(-2958327167108043863L);
        at = Long.reverse(0x1000000000000000L);
        au = Integer.reverse(0x1000000);
        av = Integer.reverse(0x30000000);
        aw = Long.reverse(-4111248671714890839L);
        ax = Integer.reverse(-1342177280);
        ay = (-1 >>> 62 | -1 << ~62 + 1) & 0xFFFFFFFF;
        az = Long.reverse(-4111248671714890839L);
        ba = Integer.reverse(0x70000000);
        bb = Long.reverse(-2958327167108043863L);
        bc = Long.reverse(0x1000000000000000L);
        bd = 0x4000000 >>> 51 | 0x4000000 << -51;
        be = Integer.reverse(-268435456);
        bf = Long.reverse(-4111248671714890839L);
        bg = Integer.reverse(0);
        bh = Integer.reverse(0x8000000);
        bi = Long.reverse(-4111248671714890839L);
        bj = (139264 >>> 141 | 139264 << -141) & 0xFFFFFFFF;
        bk = Long.reverse(-4111248671714890839L);
        bl = 32768 >>> 239 | 32768 << -239;
        bm = (147456 >>> 45 | 147456 << ~45 + 1) & 0xFFFFFFFF;
        bn = (-1 >>> 153 | -1 << ~153 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(-4111248671714890839L);
        bp = 0x4C000000 >>> 218 | 0x4C000000 << -218;
        bq = -1 >>> 101 | -1 << ~101 + 1;
        br = Long.reverse(-4111248671714890839L);
        bs = (8192 >>> 141 | 8192 << ~141 + 1) & 0xFFFFFFFF;
        bt = 0 >>> 163 | 0 << ~163 + 1;
        bu = Integer.reverse(0x28000000);
        bv = (-1 >>> 187 | -1 << ~187 + 1) & 0xFFFFFFFF;
        bw = Long.reverse(-4111248671714890839L);
        bx = 16384 >>> 238 | 16384 << -238;
        by = Integer.reverse(0);
        bz = Integer.reverse(Integer.MIN_VALUE);
        ca = Integer.reverse(0);
        cb = Integer.reverse(-1476395008);
        cc = 0x15000000 >>> 248 | 0x15000000 << -248;
        var_java_lang_String_arr_a = new String[cb];
        var_java_lang_String_arr_b = new String[cc];
        NLoginCore_551.b();
    }
}

