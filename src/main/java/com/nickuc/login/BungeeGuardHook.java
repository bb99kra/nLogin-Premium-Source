/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_582;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
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

public class BungeeGuardHook
implements NLoginCore_249,
NLoginCore_415 {
    private static int aa;
    private static int f;
    private static long u;
    private static int ae;
    private static int var_int_c;
    private static long ad;
    private static long ah;
    private static int j;
    private static int var_int_b;
    private static long l;
    private static int ab;
    private static String[] var_java_lang_String_arr_a;
    private static int m;
    private static long x;
    private static int p;
    private static int aq;
    private static int ag;
    private static int ai;
    private static long ao;
    private static int d;
    private static int ap;
    private final NLoginCore_211 Q;
    private static int s;
    private static int ar;
    private static int i;
    private static int al;
    private static long af;
    private static int y;
    private static String[] var_java_lang_String_arr_b;
    private static long z;
    private static int n;
    private static long q;
    private static long r;
    private static int t;
    private static long k;
    private static int o;
    private static long var_long_c;
    private static long ak;
    private static long an;
    private static int var_int_a;
    private static int g;
    private static int w;
    private static int h;
    private static int am;
    private static int v;
    private static int aj;
    private static int e;
    private static long ac;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_k, new Object[var_int_c]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[d];
        NLoginCore_445Array[BungeeGuardHook.e] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_o;
        NLoginCore_445Array[BungeeGuardHook.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_p;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(BungeeGuardHook.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.A("ţƅƇŧƋƪƢƸƤųƱƧƵƯŸƝƿƾƶƼƶƋ", (byte)94, 65), BungeeGuardHook.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࡳ࢟ࢋࡶࢥࢪ࢛࢜ࢧࢧࡽ࢔ࢇࢭࢵԩ", (byte)94, 67) + string + NLoginCore_091.D("ԉ", (byte)94, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x5DL;
        l ^= 0x681F2E145C3D9CE3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(59 + 10), (byte)(30 + 53), (byte)(16 + 31), 67, (byte)(15 + 51), (byte)(17 + 50), (byte)(37 + 10), (byte)(43 + 37), (byte)(23 + 52), (byte)(4 + 63), (byte)(3 + 80), (byte)(41 + 12), (byte)(19 + 61), (byte)(51 + 46), 100, (byte)(55 + 45), (byte)(32 + 73), (byte)(16 + 94), (byte)(60 + 43)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.C("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬ࢑ࢽࢩ࢔ࣃࣈࢹࢺࣅࣅ࢛ࢲࢥ࣓࣋", (byte)104, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            BungeeGuardHook.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_495_a().p() && NLoginType_008.L() ? var_int_a : var_int_b) != 0;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_582.w[NLoginCore_4452.ordinal()]) {
            case 1: {
                this.b(NLoginType_008, NLoginCore_277);
            }
            case 2: {
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(0x40000000);
        e = 0 >>> 70 | 0 << ~70 + 1;
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Integer.reverse(0x20000000);
        h = Integer.reverse(0x20000000);
        i = Integer.reverse(0);
        j = (0 >>> 74 | 0 << ~74 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-1066725595879231023L);
        l = Long.reverse(-5044031582654955520L);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0x40000000);
        o = Integer.reverse(0x40000000);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Long.reverse(-1066725595879231023L);
        r = Long.reverse(-5044031582654955520L);
        s = Integer.reverse(-1073741824);
        t = Integer.reverse(0x40000000);
        u = Long.reverse(5418457867534283217L);
        v = 0x6000000 >>> 57 | 0x6000000 << -57;
        w = Integer.reverse(-1);
        x = Long.reverse(5418457867534283217L);
        y = (262144 >>> 112 | 262144 << ~112 + 1) & 0xFFFFFFFF;
        z = Long.reverse(5418457867534283217L);
        aa = (0 >>> 95 | 0 << ~95 + 1) & 0xFFFFFFFF;
        ab = (5 >>> 32 | 5 << -32) & 0xFFFFFFFF;
        ac = Long.reverse(-1066725595879231023L);
        ad = Long.reverse(-5044031582654955520L);
        ae = 3072 >>> 9 | 3072 << -9;
        af = Long.reverse(5418457867534283217L);
        ag = Integer.reverse(-536870912);
        ah = Long.reverse(5418457867534283217L);
        ai = 0 >>> 145 | 0 << ~145 + 1;
        aj = Integer.reverse(0x10000000);
        ak = Long.reverse(5418457867534283217L);
        al = Integer.reverse(0x13000000);
        am = Integer.reverse(-1879048192);
        an = Long.reverse(-1066725595879231023L);
        ao = Long.reverse(-5044031582654955520L);
        ap = Integer.reverse(0);
        aq = Integer.reverse(0x50000000);
        ar = (40 >>> 34 | 40 << ~34 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[aq];
        var_java_lang_String_arr_b = new String[ar];
        BungeeGuardHook.b();
    }

    @Generated
    public BungeeGuardHook(NLoginCore_211 NLoginCore_211) {
        this.Q = NLoginCore_211;
    }

    private static void b() {
        int n;
        var_long_c = -8391135093839868785L;
        long l = var_long_c ^ 0x681F2E145C3D9CE3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(36 + 33), (byte)(64 + 19), (byte)(38 + 9), (byte)(20 + 47), (byte)(23 + 43), (byte)(26 + 41), (byte)(26 + 21), (byte)(77 + 3), 75, (byte)(58 + 9), (byte)(43 + 40), (byte)(16 + 37), (byte)(72 + 8), (byte)(62 + 35), (byte)(37 + 63), (byte)(45 + 55), (byte)(11 + 94), (byte)(41 + 69), (byte)(98 + 5)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
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
                    BungeeGuardHook.var_java_lang_String_arr_b[0] = NLoginCore_223.F("Լ԰ԼԉԥԨԤՈԼԾԻԖ", (byte)18, 70);
                    BungeeGuardHook.var_java_lang_String_arr_b[1] = NLoginCore_453.F("ԱՃԖԶՇԬԌԫԜԨԌԖ", (byte)18, 70);
                    BungeeGuardHook.var_java_lang_String_arr_b[2] = NLoginCore_324.F("ԁՇԧԴԩԬԠԎԺԽԋՈԜՃԢԒՇԱԯՏ՚ԴԡԢ", (byte)18, 70);
                    BungeeGuardHook.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ОѤфёцщнЫїњШѥйѠпЯѤюьѬѷёоп", (byte)18, 68);
                    BungeeGuardHook.var_java_lang_String_arr_b[4] = NLoginCore_446.D("ндќхўѨѧѧѡѧѥСэњфъЮѐѷѯѡѕѹбьѱѨѠѸйѸѸѰ҄ѼнјѺѨѿѝѕѪѓ", (byte)18, 68);
                    BungeeGuardHook.var_java_lang_String_arr_b[5] = NLoginCore_092.B("ÖĜüĉþāõãďĒÞġĜĨĕèāĈħùúĉö÷", (byte)18, 66);
                    BungeeGuardHook.var_java_lang_String_arr_b[6] = NLoginCore_076.E("ԛԳԈӼՁԖԼԖԁՑԑԎԬԥԇՓԧԡԭԨԖԷ՗ԽՒԙԾԿԶՁ՗Թ", (byte)18, 69);
                    BungeeGuardHook.var_java_lang_String_arr_b[7] = NLoginCore_004.E("ԀԕӿՊԼԩԋՉԪԘԐԖ", (byte)18, 69);
                    BungeeGuardHook.var_java_lang_String_arr_b[8] = NLoginCore_427.F("ԡԝԦԔԋԡԶԖՂԪԬԌԌԵԞԠԨՙՑԻԧԼ՜ՌՈՁՎՒԮԹԵէՆԡդաԧԞՖժեՉՃՀՓդԯԳշՠպ԰իՄկԵՒՐՖԹՑք՝յֈվ՞թ՝տ՗խպՎՏ֐՛֐֑Ւ֕ոթ֒֏Օ֎֛֔ձ֌֐կպպ֥֡րղ֚֊մջխ֊ըչն", (byte)18, 70);
                    BungeeGuardHook.var_java_lang_String_arr_b[9] = NLoginCore_324.E("ԛԳԈӼՁԖԼԖԁՑԃԍԤՆՄՓԟՂԗԓՇ԰՗ՖՊԹՊ՞՞՜՝ՔՃ՟ՈՕթՂԩգՂՎԫ԰ծթդղնիՈէԹՔՁՂ", (byte)18, 69);
                    continue block7;
                }
                case 1: {
                    BungeeGuardHook.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ђПїтЧќШлѭУќњѭьЯѫѧюѨЩвѧоп", (byte)18, 67);
                    BungeeGuardHook.var_java_lang_String_arr_b[1] = NLoginCore_453.C("ОюѢжУѪгзЫюѮйЪѐњьѢѤѥѯыѷоп", (byte)18, 67);
                    BungeeGuardHook.var_java_lang_String_arr_b[2] = NLoginCore_384.B("ÖĜüĉþāõãďĒàēĉĨèĩĭĚĄÿđùö÷", (byte)18, 66);
                    BungeeGuardHook.var_java_lang_String_arr_b[3] = NLoginCore_451.B("ÖĜüĉþāõãďĒßĝ÷ĀĠþė÷ĄĬĨįö÷", (byte)18, 66);
                    BungeeGuardHook.var_java_lang_String_arr_b[4] = NLoginCore_201.F("ԠԗԿԨՁՋՊՊՄՊՈԄ԰ԽԧԭԑԳ՚ՒՄԸ՜ԔԯՔՋՃ՛Ԝ՛՛ԡՠԾ՛ԹԹզՋԮՃԺգիԪԽՕՃՑՙՂլժՁՂ", (byte)18, 70);
                    BungeeGuardHook.var_java_lang_String_arr_b[5] = NLoginCore_427.C("ОѤфёцщнЫїњШѐпѝѝХсѕіѯіѐѲшяьѕіѿьѻя", (byte)18, 67);
                    BungeeGuardHook.var_java_lang_String_arr_b[6] = NLoginCore_559.E("ԛԳԈӼՁԖԼԖԁՑԑԎԬԥԇՓԧԡԭԨԖԻԳՒԞ԰ՊԬԵԬ՜ե", (byte)18, 69);
                    BungeeGuardHook.var_java_lang_String_arr_b[7] = NLoginCore_201.C("ЯРгхніфьфьэљЪнѧѥєеччъсоп", (byte)18, 67);
                    BungeeGuardHook.var_java_lang_String_arr_b[8] = NLoginCore_559.A("öòûéàöċëėÿāááĊóõýĮĦĐüđıġĝĖģħăĎĊļěöĹĶüóīĿĺĞĘĕĨĹĄĈŌĵŏąŀęńĊħĥīĎĦřĲŊŝœĳľĲŔĬłŏģĤťİťŦħŪōľŧŤĪţũŰņšťńŏŏźĮŞŜŝŜśĿōŖſŸŞſŒŢŉƄŖžŝƑƏŖŗ", (byte)18, 65);
                    BungeeGuardHook.var_java_lang_String_arr_b[9] = NLoginCore_173.A("ðĈÝÑĖëđëÖĦØâùěęĨôėìèĜąĬīğĎğĳĳıĲĩĘĴĝĪľėþĸėģþēăĽľĻĕňļėŋĲčŐŔŉŗčĎċĶŗ", (byte)18, 65);
                    continue block7;
                }
                case 2: {
                    BungeeGuardHook.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ѡџрєчбиїикЭѨщУџѮэчуѠьѧоп", (byte)18, 68);
                    continue block7;
                }
                case 4: {
                    BungeeGuardHook.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ÖÙėòóďĎëĠăþë", (byte)18, 65);
                }
            }
        }
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.Q;
    }

    private void b(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277) {
        NLoginType_010 NLoginType_0102 = (NLoginType_010)NLoginType_008.c();
        Object[] objectArray = new Object[h];
        objectArray[BungeeGuardHook.i] = BungeeGuardHook.c("㺀", (int)j, (long)(k ^ l));
        objectArray[BungeeGuardHook.m] = n;
        objectArray[BungeeGuardHook.o] = BungeeGuardHook.c("㺃", (int)p, (long)(q ^ r));
        objectArray[BungeeGuardHook.s] = BungeeGuardHook.c("㺆", (int)t, (long)u);
        NLoginType_0102.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, g, objectArray);
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c && !NLoginType_008.java_lang_Object_b().j((String)BungeeGuardHook.c("㺉", (int)(v & w), (long)x))) {
            NLoginCore_370.e((String)BungeeGuardHook.c("㺌", (int)y, (long)z), new Object[aa]);
            File file = NLoginType_008.java_io_File_c().getParentFile();
            File file2 = new File(file, (String)BungeeGuardHook.c("㺏", (int)ab, (long)(ac ^ ad)));
            if (file2.exists() && !file2.delete()) {
                file2.deleteOnExit();
                NLoginCore_370.d((String)BungeeGuardHook.c("㺒", (int)ae, (long)af) + file2 + (String)BungeeGuardHook.c("㺕", (int)ag, (long)ah), new Object[ai]);
                return;
            }
            NLoginCore_285 NLoginCore_2852 = NLoginCore_305.a().a((String)BungeeGuardHook.c("㺘", (int)aj, (long)ak), file2);
            if (NLoginCore_2852.p() != al || !NLoginCore_2852.af()) {
                NLoginCore_370.d((String)BungeeGuardHook.c("㺛", (int)am, (long)(an ^ ao)) + NLoginCore_2852.p(), new Object[ap]);
            }
        }
    }
}

