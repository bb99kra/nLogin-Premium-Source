/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_551;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_035;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_246;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_033 {
    private static long av;
    private static int cb;
    private static long r;
    private static int k;
    private static int bh;
    private static long cs;
    private static long d;
    private static int ae;
    private static long v;
    public static final String var_java_lang_String_ac;
    private static int ah;
    private static int var_int_ab;
    private static String[] var_java_lang_String_arr_a;
    private static long j;
    private static int bk;
    private static int bi;
    private static int q;
    private static int ai;
    private static long cw;
    private static long f;
    private static long bf;
    private static long var_long_c;
    private static int bj;
    private static int az;
    private static long cv;
    private static long bm;
    private static int ay;
    public static final String var_java_lang_String_aa;
    public static final int y;
    private static int al;
    private static long as;
    private static int bq;
    private static int var_int_ac;
    private static int ax;
    private static int bx;
    public static final int x;
    private static int bu;
    private static int i;
    private static int cn;
    private static int cf;
    private static long bg;
    private static int cu;
    private static int be;
    private static int cl;
    private static int ak;
    private static long br;
    private static long aq;
    private static int ca;
    private static int bn;
    private static int bc;
    private static int cm;
    private static long s;
    private static int aw;
    private static int bs;
    private static long g;
    private static int n;
    private static int cg;
    private static long ck;
    private static long aj;
    private static long m;
    private static int var_int_a;
    private static int z;
    private static int cj;
    private static int cz;
    private static long am;
    private static long l;
    private static int ao;
    private static int at;
    private static int co;
    private static long ba;
    private static long ag;
    private static int ch;
    final NLoginType_008 var_com_nickuc_login_NLoginType_008_o;
    private static int u;
    private static long cd;
    private static long p;
    private static long cp;
    private static int ap;
    private static int cr;
    private static int bp;
    private static long ad;
    private static int af;
    private static long an;
    public static final int w;
    private static int bw;
    private static long var_long_o;
    private static int cx;
    private static int bv;
    private static int ci;
    private static long bl;
    private static long ct;
    private static int e;
    private static long au;
    private static long var_long_aa;
    private final NLoginCore_551 var_com_nickuc_login_NLoginCore_551_a;
    private static int ar;
    private static int bz;
    private static long bb;
    private static int t;
    private static long cq;
    private static long cc;
    private static long by;
    public static final String var_java_lang_String_ab;
    private static int bo;
    private static int bd;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private static int var_int_c;
    private static int h;
    private static int bt;
    private static int ce;
    private static int cy;

    @Generated
    public NLoginCore_033(NLoginType_008 NLoginType_008, NLoginCore_551 NLoginCore_551) {
        this.var_com_nickuc_login_NLoginType_008_o = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_551_a = NLoginCore_551;
    }

    private static void b() {
        int n;
        var_long_c = 2255748003011651550L;
        long l = var_long_c ^ 0x197EDF6C1EA989AEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(48 + 21), (byte)(33 + 50), (byte)(18 + 29), (byte)(39 + 28), (byte)(43 + 23), (byte)(2 + 65), (byte)(29 + 18), (byte)(26 + 54), (byte)(27 + 48), (byte)(10 + 57), (byte)(73 + 10), 53, (byte)(16 + 64), (byte)(70 + 27), (byte)(36 + 64), (byte)(13 + 87), 105, (byte)(64 + 46), (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(59 + 10), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_033.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ГАЊЀЮЁЃГВϽЫжОаϴЀОЦϾЏІПтНЫЉЇюрхБЯцЧЦДфюљбхДічЮѢѣгПНњфдѧЮЯ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[1] = NLoginCore_451.D("ϯЄЏЗЅЌЄϭϷЋІЃ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[2] = NLoginCore_324.D("ϿГадЭЏибЭкдАЭЊнесСОлвщцЛϾмРТуЏЧа", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[3] = NLoginCore_324.B("¼Õ»õ¶ÖÐöÐïÞË", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[4] = NLoginCore_387.B("´»èêÑúêàîÒ×ĈÂ÷ÆÜĄØÆćďéÖ×", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[5] = NLoginCore_387.C("ϬϳРТЉвТИЦЊЏрϺЯϾДмАϾпчСЎЏ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[6] = NLoginCore_027.B("ûÓÎÝëāÑÃ÷äâóĆØ÷ãĄîÅÞÛÜąďÎæĆĖÖÏčċĔđęûüĝêĠĘïîåõàáėăĚīāĜþúĥēóïðĢēĲĥĵĝĻĺğüİĭġĔħĴĐÿĖŉĘĤĩĩďŏĖė", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ЃЅШГЧϵϳАйгдЃ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[8] = NLoginCore_027.B("ÒöÌË¿ĀýÁàæÅË", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[9] = NLoginCore_427.A("ÙëÕàā¹óËõàÎË", (byte)2, 65);
                    NLoginCore_033.var_java_lang_String_arr_b[10] = NLoginCore_004.B("Ë×êø¹Õ´Õ¶úäÕÕäåìÆÇčØāèÞđČóãöĐĐčãĝúûĔĈõûĢġáĀÙùýąĞëçùİðğö÷", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[11] = NLoginCore_004.C("ϳАРжЩйЂУеЯЎϺϿБАнЃсХоЁБЎЏ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[12] = NLoginCore_575.F("ԅԋԔԗԩԮԎԨԗԱԐԽՃԓԟՅԘԜՄԥԧԤԑԒ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[13] = NLoginCore_138.B("ÔÔÓµôá¸äÁ÷ÒË", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[14] = NLoginCore_387.B("ÜüìêìÎàüÀâąÅÆĂóą¾àË÷ÍďÖ×", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[15] = NLoginCore_387.C("дІжϷЗЋЮЇЇЋШЃ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[16] = NLoginCore_092.F("ԬӶԳԺԄԉԛԐӿӸԪӸԎӻӼԟԷԻԆԒՈӾՆԈՏԍԨՄՑԜԨՋ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[17] = NLoginCore_559.D("ϼϵЦаϰЍЬЍнжззИЩДПиФВшОзЎЏ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[18] = NLoginCore_384.F("ԷԆӰӲԨԐԹԲԌԡԕԆ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[19] = NLoginCore_004.F("ӷԐӶ԰ӱԑԋԱԋԪԙԆ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[20] = NLoginCore_091.F("ӿԭԧӶԚԤԺԬԲԞԱԿԾԻԹԤԻԚԪՇՌԺԑԒ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[21] = NLoginCore_138.E("ӭԤԙԖԋԮ԰ӾԬԩԳԆ", (byte)2, 69);
                    NLoginCore_033.var_java_lang_String_arr_b[22] = NLoginCore_223.D("ЃЅϰедА϶ЮϸбϹЃ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[23] = NLoginCore_384.F("ԇԭԷ԰ԖӸԾԿԠԮԳԆ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[24] = NLoginCore_092.A("´»èêÑúêàîÒ×ĈÂ÷ÆÜĄØÆćďéÖ×", (byte)2, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_033.var_java_lang_String_arr_b[0] = NLoginCore_453.F("ԖԓԍԃԱԄԆԖԕԀԮԹԡԳӷԃԡԩԁԒԉԢՅԠԮԌԊՑՃՈԔԲՉԪԩԗՇՑ՜ԴՈԗ՗ՕՂԷԴՔ՛ԿՊԽԸՄԱԲ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[1] = NLoginCore_076.E("ԶԋӴԷԑԧԘӹ԰ԼԝԆ", (byte)2, 69);
                    NLoginCore_033.var_java_lang_String_arr_b[2] = NLoginCore_092.B("ÇÛøüõ×ĀùõĂüØõÒąýĉéæăúÎÞßêĎčòòĒëã", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ϯгϾЈ϶ЂЈЄЕоЖЃ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[4] = NLoginCore_027.A("´»èêÑúêàîÒØĂÒÑĊÜÆâÅÝêÿÖ×", (byte)2, 65);
                    NLoginCore_033.var_java_lang_String_arr_b[5] = NLoginCore_223.F("ӯӶԣԥԌԵԥԛԩԍԔԲՄԱԖԗԾՈԟԁԼԺԑԒ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ûÓÎÝëāÑÃ÷äâóĆØ÷ãĄîÅÞÛÜąďÎæĆĖÖÏčċĔđęûüĝêĠĘïîåõàáėăĚīāĜþúĥēóïðĢēĲĥĵĝĻĺğüİĭġĔĮĿěŉĠīąĜĥĈċŏĖė", (byte)2, 65);
                    NLoginCore_033.var_java_lang_String_arr_b[7] = NLoginCore_092.C("дЉϲϰжДЌаЭКЬЃ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[8] = NLoginCore_091.F("ԏԁԘԊԫԚԧӹԿԾԀԆ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[9] = NLoginCore_091.F("ԪԍԅԓӻԥԊӸԱՀԳԆ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[10] = NLoginCore_091.C("ЃЏТаϱЍϬЍϮвМЍЍМНФϾϿхАйРЖщфЫЛЮшшхЛѕвгьрЭгњљЙиюдкюїООухабЮЯ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[11] = NLoginCore_076.D("ϳАРжЩйЂУеЯЎокЯмЌАКВНКДСлУИФмсФкО", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[12] = NLoginCore_027.F("ԅԋԔԗԩԮԎԨԗԱԍԟԢԞԜՁԶՂՈԣԥՊԑԒ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[13] = NLoginCore_173.E("ӷԵӯԇԻӴԙԋԮԠԷԆ", (byte)2, 69);
                    NLoginCore_033.var_java_lang_String_arr_b[14] = NLoginCore_223.C("ДдФТФІИдϸКнϾЭТϻнУЙзЕАСЎЏ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[15] = NLoginCore_559.B("ËñîÙ»½ÊîàúÙçÐØÛĈáÃÇåąďÖ×", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[16] = NLoginCore_559.C("ЩϳазЁІИЍϼϵЧϵЋϸϹМдиЃЏхЈысуКэЋЏЙта", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[17] = NLoginCore_110.A("Ä½îø¸ÕôÕąþýą¿Ā×ÁÚĀØďąÙÖ×", (byte)2, 65);
                    NLoginCore_033.var_java_lang_String_arr_b[18] = NLoginCore_173.F("ԃԠԸԚԒԙԳԧӺԵԮԋԏԻԒԽԜԽԜԹԕՊԑԒ", (byte)2, 70);
                    NLoginCore_033.var_java_lang_String_arr_b[19] = NLoginCore_324.E("ԗԆԺԗԪԸӻԎӸԸԀԆ", (byte)2, 69);
                    NLoginCore_033.var_java_lang_String_arr_b[20] = NLoginCore_173.C("ϼЪФϳЗСзЩЯЛЭЛЊнϻЕфРМТϿзЎЏ", (byte)2, 67);
                    NLoginCore_033.var_java_lang_String_arr_b[21] = NLoginCore_027.B("ÇèÇ¸ñ¼àðÌÅæË", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[22] = NLoginCore_451.D("ϬЮОЄЉϵФЩЖϳЏϽоаЫзЀйивщБЎЏ", (byte)2, 68);
                    NLoginCore_033.var_java_lang_String_arr_b[23] = NLoginCore_091.B("ï¹°ÞÛÒëÞÍäâË", (byte)2, 66);
                    NLoginCore_033.var_java_lang_String_arr_b[24] = NLoginCore_223.E("ӯӶԣԥԌԵԥԛԩԍԓԓՂԘԄԖԏՅԒԔՀԪՎԛԡ԰ԏԻՋՉԓԣ", (byte)2, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_033.var_java_lang_String_arr_b[0] = NLoginCore_384.B("üýÙ·ýºÍõï¿½Ë", (byte)2, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_033.var_java_lang_String_arr_b[0] = NLoginCore_427.C("УЏϳЈЉЎДБжАЊϸϼАРоЗмтущИВФЂьчЋЪсгЏ", (byte)2, 67);
                }
            }
        }
    }

    public void a(NLoginCore_277 NLoginCore_277, byte[] byArray, boolean bl, boolean bl2) {
        if (byArray.length > t) {
            NLoginCore_370.c((String)NLoginCore_033.c("㺀", (int)u, (long)v) + NLoginCore_277.getName() + (String)NLoginCore_033.c("㺃", (int)z, (long)var_long_aa) + byArray.length + (String)NLoginCore_033.c("㺆", (int)(var_int_ab & var_int_ac), (long)ad) + ae + (String)NLoginCore_033.c("㺉", (int)af, (long)ag), new Object[ah]);
            this.a(NLoginCore_277, NLoginCore_035.var_com_nickuc_login_NLoginCore_035_b);
            return;
        }
        KeyPair keyPair = BCryptHashProvider.java_security_KeyPair_b();
        try {
            if (byArray.length > 0) {
                byArray = NLoginCore_246.c(byArray, keyPair.getPrivate());
            }
        }
        catch (GeneralSecurityException generalSecurityException) {
            NLoginCore_370.c((String)NLoginCore_033.c("㺌", (int)ai, (long)aj) + NLoginCore_277.getName(), generalSecurityException, new Object[ak]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginCore_033.c("㺏", (int)al, (long)(am ^ an)), bl2);
        if (bl2) {
            jSONObject.put((String)NLoginCore_033.c("㺒", (int)(ao & ap), (long)aq), bl);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((String)NLoginCore_033.c("㺕", (int)ar, (long)as), (Object)NLoginCore_158.java_lang_String_a(keyPair.getPublic().getEncoded()));
        jSONObject2.put((String)NLoginCore_033.c("㺘", (int)at, (long)(au ^ av)), (Object)NLoginCore_158.java_lang_String_a(byArray));
        Object[] objectArray = new Object[ax];
        objectArray[NLoginCore_033.ay] = NLoginCore_033.c("㺛", (int)az, (long)(ba ^ bb));
        objectArray[NLoginCore_033.bc] = NLoginCore_277.java_util_UUID_a();
        objectArray[NLoginCore_033.bd] = NLoginCore_033.c("㺞", (int)be, (long)(bf ^ bg));
        objectArray[NLoginCore_033.bh] = bi;
        objectArray[NLoginCore_033.bj] = NLoginCore_033.c("㺡", (int)bk, (long)(NLoginCore_033.bl ^ bm));
        objectArray[NLoginCore_033.bn] = jSONObject2;
        objectArray[NLoginCore_033.bo] = NLoginCore_033.c("㺤", (int)(bp & bq), (long)br);
        objectArray[NLoginCore_033.bs] = jSONObject;
        this.b(NLoginCore_277, aw, objectArray);
    }

    private static String a(int n, long l) {
        l ^= 7L;
        l ^= 0x197EDF6C1EA989AEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(6 + 63), (byte)(4 + 79), (byte)(43 + 4), (byte)(4 + 63), (byte)(6 + 60), (byte)(7 + 60), (byte)(21 + 26), (byte)(10 + 70), (byte)(71 + 4), 67, 83, (byte)(52 + 1), (byte)(51 + 29), (byte)(16 + 81), (byte)(25 + 75), (byte)(10 + 90), (byte)(88 + 17), (byte)(57 + 53), (byte)(23 + 80)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.F("ԿՌՋԎՎՊՅՎՙՈԕՓ՗ՐՓՙԛࢪ࢔ࢡࢪࢪࢺࢼࢪࢷࢫࢶࢭࢲ", (byte)32, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_033.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_033(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_o = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_551_a = new NLoginCore_551(this);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_033.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.B("ŷƙƛŻƟƾƶǌƸƇǅƻǉǃƌƱǓǒǊǐǊƟ", (byte)104, 66), NLoginCore_033.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.D("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬࢻࢥࢲࢻࢻ࣋࣍ࢻࣈࢼࣇࢾࣃՅ", (byte)104, 68) + string + NLoginCore_559.B("Ɖ", (byte)104, 66) + methodType.toString(), exception);
        }
    }

    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_035 NLoginCore_035) {
        Object[] objectArray = new Object[cg];
        objectArray[NLoginCore_033.ch] = NLoginCore_033.c("㺀", (int)(ci & cj), (long)ck);
        objectArray[NLoginCore_033.cl] = NLoginCore_035.ordinal();
        this.b(NLoginCore_277, cf, objectArray);
    }

    public void b(NLoginCore_277 NLoginCore_277, int n, Object ... objectArray) {
        if (objectArray.length % var_int_a != 0) {
            throw new IllegalArgumentException((String)NLoginCore_033.c("㺀", (int)(var_int_b & var_int_c), (long)d));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginCore_033.c("㺃", (int)e, (long)(f ^ g)), n);
        JSONObject jSONObject2 = new JSONObject();
        for (int i = h; i < objectArray.length; ++i) {
            Object object;
            if (!((object = objectArray[i++]) instanceof String)) {
                throw new IllegalArgumentException((String)NLoginCore_033.c("㺆", (int)NLoginCore_033.i, (long)j) + object);
            }
            jSONObject2.put((String)object, objectArray[i]);
        }
        jSONObject.put((String)NLoginCore_033.c("㺉", (int)k, (long)(l ^ m)), (Object)jSONObject2);
        byte[] byArray = NLoginCore_140.a(NLoginCore_1262 -> NLoginCore_1262.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        if (this.var_com_nickuc_login_NLoginType_008_o.L() || !this.var_com_nickuc_login_NLoginType_008_o.com_nickuc_login_NLoginCore_581_b().a(NLoginCore_277, (String)NLoginCore_033.c("㺌", (int)NLoginCore_033.n, (long)(var_long_o ^ p)), byArray)) {
            NLoginCore_277.a(this.var_com_nickuc_login_NLoginType_008_o, NLoginCore_337.var_com_nickuc_login_NLoginCore_337_a, NLoginCore_033.c("㺏", (int)q, (long)(r ^ s)), byArray);
        }
    }

    @Generated
    public NLoginCore_551 a() {
        return this.var_com_nickuc_login_NLoginCore_551_a;
    }

    public void a(NLoginCore_277 NLoginCore_277, String string, String string2) {
        Object[] objectArray = new Object[bu];
        objectArray[NLoginCore_033.bv] = NLoginCore_033.c("㺀", (int)(bw & bx), (long)by);
        objectArray[NLoginCore_033.bz] = string;
        objectArray[NLoginCore_033.ca] = NLoginCore_033.c("㺃", (int)cb, (long)(cc ^ cd));
        objectArray[NLoginCore_033.ce] = string2;
        this.b(NLoginCore_277, bt, objectArray);
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(-1);
        d = Long.reverse(-7212951932734770440L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(8927949131761087224L);
        g = Long.reverse(-2305843009213693952L);
        h = Integer.reverse(0);
        i = 1 >>> 31 | 1 << ~31 + 1;
        j = Long.reverse(-7212951932734770440L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(8927949131761087224L);
        m = Long.reverse(-2305843009213693952L);
        n = 1 >>> 158 | 1 << -158;
        var_long_o = Long.reverse(8927949131761087224L);
        p = Long.reverse(-2305843009213693952L);
        q = 20 >>> 162 | 20 << -162;
        r = Long.reverse(8927949131761087224L);
        s = Long.reverse(-2305843009213693952L);
        t = 131072 >>> 46 | 131072 << -46;
        u = (768 >>> 103 | 768 << -103) & 0xFFFFFFFF;
        v = Long.reverse(-7212951932734770440L);
        z = 0xE00000 >>> 149 | 0xE00000 << -149;
        var_long_aa = Long.reverse(-7212951932734770440L);
        var_int_ab = 0x100000 >>> 177 | 0x100000 << ~177 + 1;
        var_int_ac = (-1 >>> 90 | -1 << -90) & 0xFFFFFFFF;
        ad = Long.reverse(-7212951932734770440L);
        ae = Integer.reverse(0x10000000);
        af = 0x240000 >>> 178 | 0x240000 << ~178 + 1;
        ag = Long.reverse(-7212951932734770440L);
        ah = Integer.reverse(0);
        ai = Integer.reverse(0x50000000);
        aj = Long.reverse(-7212951932734770440L);
        ak = (0 >>> 186 | 0 << -186) & 0xFFFFFFFF;
        al = 360448 >>> 207 | 360448 << -207;
        am = Long.reverse(8927949131761087224L);
        an = Long.reverse(-2305843009213693952L);
        ao = (192 >>> 164 | 192 << -164) & 0xFFFFFFFF;
        ap = (-1 >>> 88 | -1 << -88) & 0xFFFFFFFF;
        aq = Long.reverse(-7212951932734770440L);
        ar = (425984 >>> 111 | 425984 << -111) & 0xFFFFFFFF;
        as = Long.reverse(-7212951932734770440L);
        at = (0x70000000 >>> 251 | 0x70000000 << -251) & 0xFFFFFFFF;
        au = Long.reverse(8927949131761087224L);
        av = Long.reverse(-2305843009213693952L);
        aw = Integer.reverse(0);
        ax = Integer.reverse(0x10000000);
        ay = Integer.reverse(0);
        az = 0x3C00000 >>> 118 | 0x3C00000 << ~118 + 1;
        ba = Long.reverse(8927949131761087224L);
        bb = Long.reverse(-2305843009213693952L);
        bc = Integer.reverse(Integer.MIN_VALUE);
        bd = Integer.reverse(0x40000000);
        be = 32 >>> 1 | 32 << -1;
        bf = Long.reverse(8927949131761087224L);
        bg = Long.reverse(-2305843009213693952L);
        bh = 96 >>> 165 | 96 << ~165 + 1;
        bi = 0x200000 >>> 234 | 0x200000 << -234;
        bj = 32 >>> 99 | 32 << ~99 + 1;
        bk = Integer.reverse(-2013265920);
        bl = Long.reverse(8927949131761087224L);
        bm = Long.reverse(-2305843009213693952L);
        bn = Integer.reverse(-1610612736);
        bo = (6144 >>> 106 | 6144 << -106) & 0xFFFFFFFF;
        bp = Integer.reverse(0x48000000);
        bq = -1 >>> 199 | -1 << ~199 + 1;
        br = Long.reverse(-7212951932734770440L);
        bs = Integer.reverse(-536870912);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = Integer.reverse(0x20000000);
        bv = Integer.reverse(0);
        bw = (38912 >>> 75 | 38912 << -75) & 0xFFFFFFFF;
        bx = Integer.reverse(-1);
        by = Long.reverse(-7212951932734770440L);
        bz = Integer.reverse(Integer.MIN_VALUE);
        ca = Integer.reverse(0x40000000);
        cb = (20 >>> 32 | 20 << ~32 + 1) & 0xFFFFFFFF;
        cc = Long.reverse(8927949131761087224L);
        cd = Long.reverse(-2305843009213693952L);
        ce = Integer.reverse(-1073741824);
        cf = Integer.reverse(0x40000000);
        cg = Integer.reverse(0x40000000);
        ch = Integer.reverse(0);
        ci = Integer.reverse(-1476395008);
        cj = (-1 >>> 69 | -1 << -69) & 0xFFFFFFFF;
        ck = Long.reverse(-7212951932734770440L);
        cl = (16384 >>> 174 | 16384 << -174) & 0xFFFFFFFF;
        cm = (25600 >>> 138 | 25600 << ~138 + 1) & 0xFFFFFFFF;
        cn = Integer.reverse(-1744830464);
        co = Integer.reverse(0x68000000);
        cp = Long.reverse(8927949131761087224L);
        cq = Long.reverse(-2305843009213693952L);
        cr = Integer.reverse(-402653184);
        cs = Long.reverse(8927949131761087224L);
        ct = Long.reverse(-2305843009213693952L);
        cu = Integer.reverse(0x18000000);
        cv = Long.reverse(8927949131761087224L);
        cw = Long.reverse(-2305843009213693952L);
        cx = Integer.reverse(0x100000);
        cy = (0x100000 >>> 77 | 0x100000 << -77) & 0xFFFFFFFF;
        cz = Integer.reverse(0x10000000);
        var_java_lang_String_arr_a = new String[cm];
        var_java_lang_String_arr_b = new String[cn];
        NLoginCore_033.b();
        var_java_lang_String_aa = NLoginCore_033.c("㺀", (int)co, (long)(cp ^ cq));
        var_java_lang_String_ab = NLoginCore_033.c("㺃", (int)cr, (long)(cs ^ ct));
        var_java_lang_String_ac = NLoginCore_033.c("㺆", (int)cu, (long)(cv ^ cw));
        w = cx;
        x = cy;
        y = cz;
    }
}

