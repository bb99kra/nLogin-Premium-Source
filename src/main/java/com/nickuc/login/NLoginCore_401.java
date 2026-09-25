/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_401
extends NLoginCore_353 {
    private static int as;
    private static int af;
    private static int bn;
    private static int var_int_c;
    private static int ai;
    private static int bw;
    private static long bi;
    private static long u;
    private static long ba;
    private static int bv;
    private static int r;
    private static long ao;
    private static int co;
    private static int ca;
    private static long q;
    private static int j;
    private static int ce;
    private static int bl;
    private static int cm;
    private static int i;
    private static int x;
    private static long be;
    private static int cd;
    private static int cc;
    private static int aa;
    private static int cj;
    private static long ay;
    private static int bg;
    private static long w;
    private static long p;
    private static long n;
    private static long e;
    private static String[] a;
    private static long al;
    private static long cb;
    private static String[] b;
    private static int au;
    private static int y;
    private static long ab;
    private static int bs;
    private static int bz;
    private static int bc;
    private static int ck;
    private static long at;
    private static int bo;
    private static int ch;
    private static long ci;
    private static long s;
    private static long m;
    private static long d;
    private static int bk;
    private static int an;
    private static long am;
    private static int bh;
    private static int k;
    private static long ac;
    private static long ae;
    private static long bf;
    private static long ah;
    private static long bj;
    private static long bb;
    private static int cg;
    private static long bm;
    private static long ag;
    private static int t;
    private static int ax;
    private static long cl;
    private static int br;
    private static int ak;
    private static long ar;
    private static long cf;
    private static long aw;
    private static int ad;
    private static long by;
    private static long bx;
    private static int az;
    private static int bd;
    private static long z;
    private static int v;
    private static long av;
    private static int cn;
    private static long bq;
    private static long bt;
    private static int f;
    private static int aq;
    private static int l;
    private static long h;
    private static long bp;
    private static long g;
    private static int o;
    private static int ap;
    private static long bu;
    private static long var_long_c;
    private static long aj;

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginInterface_024 NLoginInterface_0242 = this.a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginInterface_0422).com_nickuc_login_NLoginInterface_024_a();
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺀", (int)l, (long)(m ^ n)));
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺃", (int)o, (long)(p ^ q)));
            NLoginInterface_0242.c((String)NLoginCore_401.c("㺆", (int)r, (long)s), (String)NLoginCore_401.c("㺉", (int)t, (long)u));
            NLoginInterface_0242.c((String)NLoginCore_401.c("㺌", (int)v, (long)w), (String)NLoginCore_401.c("㺏", (int)(x & y), (long)z));
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺒", (int)aa, (long)(ab ^ ac)));
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺕", (int)ad, (long)ae));
            NLoginInterface_0242.c((String)NLoginCore_401.c("㺘", (int)af, (long)(ag ^ ah)), (String)NLoginCore_401.c("㺛", (int)ai, (long)aj));
            NLoginInterface_0242.c((String)NLoginCore_401.c("㺞", (int)ak, (long)(al ^ am)), (String)NLoginCore_401.c("㺡", (int)an, (long)ao));
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺤", (int)(ap & aq), (long)ar));
            if (this.a == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_g) {
                NLoginInterface_0242.c((String)NLoginCore_401.c("㺧", (int)as, (long)at), (String)NLoginCore_401.c("㺪", (int)au, (long)(av ^ aw)));
            }
            NLoginInterface_0242.a((String)NLoginCore_401.c("㺭", (int)ax, (long)ay));
        } else {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺰", (int)az, (long)(ba ^ bb)), new Object[bc]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺳", (int)bd, (long)(be ^ bf)), new Object[bg]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺶", (int)bh, (long)(bi ^ bj)), new Object[bk]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺹", (int)bl, (long)bm), new Object[bn]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺼", (int)bo, (long)(bp ^ bq)), new Object[br]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㺿", (int)bs, (long)(bt ^ bu)), new Object[bv]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㻂", (int)bw, (long)(bx ^ by)), new Object[bz]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㻅", (int)ca, (long)cb), new Object[cc]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㻈", (int)(cd & ce), (long)cf), new Object[cg]);
            if (this.a == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_g) {
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㻋", (int)ch, (long)ci), new Object[cj]);
            }
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_401.c("㻎", (int)ck, (long)cl), new Object[cm]);
        }
    }

    public NLoginCore_401(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_401.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_401.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, new String[k]);
    }

    private static void void_b() {
        int n;
        var_long_c = -6257107691371896397L;
        long l = var_long_c ^ 0x72E10E7453581CC8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(2 + 67), 83, 47, (byte)(58 + 9), (byte)(2 + 64), (byte)(19 + 48), (byte)(12 + 35), (byte)(77 + 3), (byte)(3 + 72), (byte)(12 + 55), (byte)(22 + 61), (byte)(24 + 29), (byte)(27 + 53), (byte)(86 + 11), (byte)(62 + 38), (byte)(77 + 23), (byte)(43 + 62), (byte)(63 + 47), (byte)(60 + 43)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_401.b[0] = NLoginCore_324.A("Ę÷ĈúČþģĔġāĄí", (byte)19, 65);
                    NLoginCore_401.b[1] = NLoginCore_453.C("ЧзТѨЩШјѠЯлрѣяюѓщѓєъюффст", (byte)19, 67);
                    NLoginCore_401.b[2] = NLoginCore_575.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
                    NLoginCore_401.b[3] = NLoginCore_138.F("ԝՆՈՁԆԈԨԾԦՁՁՑԲԢՊԍՈԒ՛ՔԎԙԽԛԛՐՃՄԾԥ՞Ե", (byte)19, 70);
                    NLoginCore_401.b[4] = NLoginCore_004.B("×ĠĜáÿġĀĚÞôėĂùèĄþĆīīïăħĮĦġġĒęĒĖĻěĬĞŁėāĵĵıŅęĘĘāĥĹĢĎĻĎĈņīĘę", (byte)19, 66);
                    NLoginCore_401.b[5] = NLoginCore_387.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԜԭԝ՗ՍԼՠ՜ԶբԤ", (byte)19, 70);
                    NLoginCore_401.b[6] = NLoginCore_076.E("ԅՇԼԗՈԥԊԩԹ԰ԒԥՉՄ՗ՉՃԵԑՉԴՋԕԶՓՓ՛ԠԖԿ՗՚ՑՁ՗՚՘Ղԫ՘՟ՃԨէՀՁհ԰ԮՖլԴոԴՋԼԸԽՂդՠզռա", (byte)19, 69);
                    NLoginCore_401.b[7] = NLoginCore_427.C("ѤхѕќЦХхѮЯиѲћшыфѮыѹъявюѝѝѫоѫѯэнлѠ҇Ѱє҂҈є҅ф҂ѝџѿёѩҎѶҐѱѐҊѰҚѡѢ", (byte)19, 67);
                    NLoginCore_401.b[8] = NLoginCore_453.D("љшѕсџўеѩтЯѣж", (byte)19, 68);
                    NLoginCore_401.b[9] = NLoginCore_091.F("ՅԩԕԛԃԶՈԁՍԌՓԫ԰ՒԈԗՊՅԹԒԷԯԱԘՓԳՙԳԤՙԦԧՅՔԪԫԻԣԫԬՙԭդԷ", (byte)19, 70);
                    NLoginCore_401.b[10] = NLoginCore_091.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗҔҔғ҃ҞѦҠѮѫҁ҉Ѷ", (byte)19, 67);
                    NLoginCore_401.b[11] = NLoginCore_223.B("ěüČēÝÜüĥæïĩöĪùþĚëĐīûĝĝāñīòĂĆĔúĨöĈĈöĵÿĿþüĝĨĶč", (byte)19, 66);
                    NLoginCore_401.b[12] = NLoginCore_091.E("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ՗ԥԲԮՉՎԑԸ՘՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԺ՘էաԺՌց՗ւռր", (byte)19, 69);
                    NLoginCore_401.b[13] = NLoginCore_092.B("ěüČēÝÜüĥæïĨĘĦĨêêġĞĉİăïĉċĕĬĘĔďĩļĈĮěÿüāĻĘľĔđĘč", (byte)19, 66);
                    NLoginCore_401.b[14] = NLoginCore_451.B("ĆÝÝĚĠî÷ĚĔĆġćàĖĕçĎĈèģĂĭĳāăĄĂĊĢĒĭįįĴĎĎĒúĽđėňĽěğēĩĹĞċĊŉőŁĘę", (byte)19, 66);
                    NLoginCore_401.b[15] = NLoginCore_427.B("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘļĪŉłĩĹĝĭİĿőŁĘę", (byte)19, 66);
                    NLoginCore_401.b[16] = NLoginCore_201.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԜԴԭԪԗՍԡՠՂՑԷ՛ՙԦՂՄՋՅՀեԿՎԷ", (byte)19, 70);
                    NLoginCore_401.b[17] = NLoginCore_027.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
                    NLoginCore_401.b[18] = NLoginCore_091.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
                    NLoginCore_401.b[19] = NLoginCore_110.E("ԝՆՈՁԆԈԨԾԦՁՁՑԲԢՊԍՈԒ՛ՔԎԙԽԛԛՐՃՄԾԥ՞Ե", (byte)19, 69);
                    NLoginCore_401.b[20] = NLoginCore_451.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѡѡъѮ҂ѫї҄їёҏѴѡѢ", (byte)19, 67);
                    NLoginCore_401.b[21] = NLoginCore_201.D("ФѦћжѧфЩшјябфѨѣѶѨѢєаѨѓѪдѕѲѲѺпеўѶѹѰѠѶѹѷѡъѷѾѢч҆џѠҏяэѵҋѓҗѓѪћїќѡ҃ѿ҅қҀ", (byte)19, 68);
                    NLoginCore_401.b[22] = NLoginCore_223.A("ĐÿČøĖĕìĠùæĚí", (byte)19, 65);
                    NLoginCore_401.b[23] = NLoginCore_110.E("ՅԩԕԛԃԶՈԁՍԌՓԫ԰ՒԈԗՊՅԹԒԷԯԱԘՓԳՙԳԤՙԦԧՅՔԪԫԻԣԫԬՙԭդԷ", (byte)19, 69);
                    NLoginCore_401.b[24] = NLoginCore_138.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗҔҔғ҃ҞѦҠѮѫҁ҉Ѷ", (byte)19, 67);
                    NLoginCore_401.b[25] = NLoginCore_138.C("ѥОтгѝфѪїЮннѱѤѤщѥыѶфёэѨѭаїѷѽйёнфѢуѺ҄щц҃щѫѝѽѺѠѯъ҂ҎѩѴҖљѣљѷ҆ҀљѫҠѶҡқҟ", (byte)19, 67);
                    NLoginCore_401.b[26] = NLoginCore_223.B("ĆÝÝĚĠî÷ĚĔĆġćàĖĕçĎĈèģĂĭĳāăĄĂĊĢĒĭįįĴĎĎĒúĽđėňĽěğēĩĹĞċĊŉőŁĘę", (byte)19, 66);
                    NLoginCore_401.b[27] = NLoginCore_091.A("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘļĪŉłĩĹĝĭİĿőŁĘę", (byte)19, 65);
                    NLoginCore_401.b[28] = NLoginCore_559.F("ԺԩԶԢՀԿԖՊԣԐՄԗ", (byte)19, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_401.b[0] = NLoginCore_201.E("ՆԡՉՊԈԘԉԦՆԈԐԲՌԑՐԒԘԖՎԕԨՋԢԣ", (byte)19, 69);
                    NLoginCore_401.b[1] = NLoginCore_223.D("ЧзТѨЩШјѠЯлрѩыѤпѮѓтеяѬѪст", (byte)19, 68);
                    NLoginCore_401.b[2] = NLoginCore_384.A("ëČüõĢāġðãßĚí", (byte)19, 65);
                    NLoginCore_401.b[3] = NLoginCore_223.A("óĜĞėÜÞþĔüėėħĈøĠãĞèıĪäåĝāïĠĔĄķĳĈĝ", (byte)19, 65);
                    NLoginCore_401.b[4] = NLoginCore_559.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѤђҊќҐ҂єґґѰ҄ҊѡѢ", (byte)19, 67);
                    NLoginCore_401.b[5] = NLoginCore_027.C("ѤхѕќЦХхѮЯиѱѡѯѱггѪѧђѹьѽѐьѨѠщєѢнтҀфуѡсѬшцџх҇ѝі", (byte)19, 67);
                    NLoginCore_401.b[6] = NLoginCore_575.C("ФѦћжѧфЩшјябфѨѣѶѨѢєаѨѓѪдѕѲѲѺпеўѶѹѰѠѶѹѷѡъѷѾѢч҆џѠҏяэѵҋѓҗќѲҗ҉ҠҀ҃ҙҡѵҙ", (byte)19, 67);
                    NLoginCore_401.b[7] = NLoginCore_173.A("ěüČēÝÜüĥæïĩĒÿĂûĥĂİāĆéąĔĔĢõĢĦĄôòėľħċĹĿċļûĹĔĖěüěīÿąŏČĮĲīĘę", (byte)19, 65);
                    NLoginCore_401.b[8] = NLoginCore_559.A("ēÞîĖøûóáġĐĖí", (byte)19, 65);
                    NLoginCore_401.b[9] = NLoginCore_027.C("ѤшдкТѕѧРѬЫѲъяѱЧжѩѤјбіюѐзѲђѸђуѸхцњііѧѤѫѺѮцѠюѫћѝѽғѦҘ҇Ҕ҈ѴѡѢ", (byte)19, 67);
                    NLoginCore_401.b[10] = NLoginCore_223.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗ҅Ѿқ҃҃҃ҁѮ҇҉ѺҞүѰҬұѵҳ҃ҤҩҔҁ҂", (byte)19, 67);
                    NLoginCore_401.b[11] = NLoginCore_451.F("ՅԦԶԽԇԆԦՏԐԙՓԠՔԣԨՄԕԺՕԥՇՇԫԛՕԜԬ԰ԾԤՒԠբՑԡՅՁլի՞կԩխաԳՇՀԲՀՆԳՎԵջՂՃ", (byte)19, 70);
                    NLoginCore_401.b[12] = NLoginCore_138.E("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ՗ԥԲԮՉՎԑԸ՘՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԼ՗՜ցՙՑ՛բՁգ՝", (byte)19, 69);
                    NLoginCore_401.b[13] = NLoginCore_453.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԙԳԵԿՖՂԾԹՓզԲՉՄբժէԷԮաձԺԾեԦ՝Մ՟ճը՘լպիՂՃ", (byte)19, 70);
                    NLoginCore_401.b[14] = NLoginCore_384.C("яЦЦѣѩзрѣѝяѪѐЩџўаїёбѬыѶѼъьэыѓѫћѶѸѸѽїїћу҆њѠґ҄҆эўҔҋҁѯѮѪљѴѡѢ", (byte)19, 67);
                    NLoginCore_401.b[15] = NLoginCore_092.A("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘĺĴĘĚľľčĬćċœīĘę", (byte)19, 65);
                    NLoginCore_401.b[16] = NLoginCore_559.B("ěüČēÝÜüĥæïĨĘĦĨêêġĞĉİăòĊăĀíģ÷ĶĘħčĩĔČĊĻĞĵļğĤÿč", (byte)19, 66);
                    NLoginCore_401.b[17] = NLoginCore_453.D("сџидзлщлцуэж", (byte)19, 68);
                    NLoginCore_401.b[18] = NLoginCore_004.B("ÚĊúċùĐēāõĖĄí", (byte)19, 66);
                    NLoginCore_401.b[19] = NLoginCore_138.B("óĜĞėÜÞþĔüėėħĈøĠãĞèıĪäñčĒóıħįĄñĹĬ", (byte)19, 66);
                    NLoginCore_401.b[20] = NLoginCore_223.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѣҒѝџҖҔ҄҈Ѭ҈ѱҊѡѢ", (byte)19, 67);
                    NLoginCore_401.b[21] = NLoginCore_451.E("ԅՇԼԗՈԥԊԩԹ԰ԒԥՉՄ՗ՉՃԵԑՉԴՋԕԶՓՓ՛ԠԖԿ՗՚ՑՁ՗՚՘Ղԫ՘՟ՃԨէՀՁհ԰ԮՖլԴոջՉԽթ՟ԻվպաՄը", (byte)19, 69);
                    NLoginCore_401.b[22] = NLoginCore_453.C("тзріољѡѩЪщэж", (byte)19, 67);
                    NLoginCore_401.b[23] = NLoginCore_201.B("ěÿëñÙČĞ×ģâĩāĆĨÞíĠěďèčąćîĩĉįĉúįüýĜÿĬČĞĢĽņĕĔęąĺćĜŅąĸĞĥņīĘę", (byte)19, 66);
                    NLoginCore_401.b[24] = NLoginCore_091.F("ՇӻԦԕԫԸԄՁԥԐԾԤՆԞԩԢԳԣԓՄՏՏԬՕԲՌԠ԰ԯՎԟՐՅ՛ՓԧԶԥիՃԼաՇԿ՝՞԰ԷթժՎչ՜Վ՟ՔոՍԿ՜բջաոոՆ֋ևՠ՛եթ՚ձՏժ֏Ցց֐լՓՕ֍ՙեբգ", (byte)19, 70);
                    NLoginCore_401.b[25] = NLoginCore_559.F("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ՗ԥԲԮՉՎԑԸ՘՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԹպԷ՗ՖւգսԿԼՁ", (byte)19, 70);
                    NLoginCore_401.b[26] = NLoginCore_201.C("яЦЦѣѩзрѣѝяѪѐЩџўаїёбѬыѶѼъьэыѓѫћѶѸѸѽїїћу҆њѠґ҆ҋщҒѽґѸҐѳҘҔҚѡѢ", (byte)19, 67);
                    NLoginCore_401.b[27] = NLoginCore_138.F("ՈՅԧԦԨԌԤԝՈԿԲԴԩԪՍՉՙՋԶՈԯՐՊԭԷՌԪԲԻՒԮԯՁըԣդԵԷՉՄգՂզ՟ԳիԳՖիե՘նԶՅՂՃ", (byte)19, 70);
                    NLoginCore_401.b[28] = NLoginCore_446.A("ĘĞĐÞđÞďóüăĄí", (byte)19, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_401.b[0] = NLoginCore_575.B("ĚČĖëĐĕģĆþĆģüęùġĈäĘīĭûĉċđĮąĈĈĻăĩĕ", (byte)19, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_401.b[0] = NLoginCore_446.E("ӿՈԂԥՍԪԡԌԯՆԪԗ", (byte)19, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x72E10E7453581CC8L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(15 + 54), (byte)(82 + 1), (byte)(40 + 7), 67, (byte)(7 + 59), 67, (byte)(25 + 22), (byte)(67 + 13), (byte)(50 + 25), (byte)(31 + 36), (byte)(2 + 81), (byte)(18 + 35), (byte)(4 + 76), (byte)(59 + 38), (byte)(46 + 54), (byte)(85 + 15), (byte)(42 + 63), (byte)(104 + 6), (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒӚӘӉӥһӏӅӋ", (byte)74, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_401.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-3636772752648416107L);
        e = Long.reverse(0x3C00000000000000L);
        f = 131072 >>> 113 | 131072 << -113;
        g = Long.reverse(-3636772752648416107L);
        h = Long.reverse(0x3C00000000000000L);
        i = Integer.reverse(0);
        j = 0 >>> 54 | 0 << ~54 + 1;
        k = Integer.reverse(0);
        l = (0x400000 >>> 149 | 0x400000 << -149) & 0xFFFFFFFF;
        m = Long.reverse(-3636772752648416107L);
        n = Long.reverse(0x3C00000000000000L);
        o = Integer.reverse(-1073741824);
        p = Long.reverse(-3636772752648416107L);
        q = Long.reverse(0x3C00000000000000L);
        r = Integer.reverse(0x20000000);
        s = Long.reverse(-1042699367283010411L);
        t = Integer.reverse(-1610612736);
        u = Long.reverse(-1042699367283010411L);
        v = 6144 >>> 170 | 6144 << -170;
        w = Long.reverse(-1042699367283010411L);
        x = -1073741823 >>> 222 | -1073741823 << -222;
        y = Integer.reverse(-1);
        z = Long.reverse(-1042699367283010411L);
        aa = Integer.reverse(0x10000000);
        ab = Long.reverse(-3636772752648416107L);
        ac = Long.reverse(0x3C00000000000000L);
        ad = (288 >>> 37 | 288 << -37) & 0xFFFFFFFF;
        ae = Long.reverse(-1042699367283010411L);
        af = 0x50000000 >>> 91 | 0x50000000 << -91;
        ag = Long.reverse(-3636772752648416107L);
        ah = Long.reverse(0x3C00000000000000L);
        ai = Integer.reverse(-805306368);
        aj = Long.reverse(-1042699367283010411L);
        ak = Integer.reverse(0x30000000);
        al = Long.reverse(-3636772752648416107L);
        am = Long.reverse(0x3C00000000000000L);
        an = Integer.reverse(-1342177280);
        ao = Long.reverse(-1042699367283010411L);
        ap = 57344 >>> 12 | 57344 << -12;
        aq = (-1 >>> 194 | -1 << -194) & 0xFFFFFFFF;
        ar = Long.reverse(-1042699367283010411L);
        as = -1073741821 >>> 222 | -1073741821 << ~222 + 1;
        at = Long.reverse(-1042699367283010411L);
        au = Integer.reverse(0x8000000);
        av = Long.reverse(-3636772752648416107L);
        aw = Long.reverse(0x3C00000000000000L);
        ax = Integer.reverse(-2013265920);
        ay = Long.reverse(-1042699367283010411L);
        az = Integer.reverse(0x48000000);
        ba = Long.reverse(-3636772752648416107L);
        bb = Long.reverse(0x3C00000000000000L);
        bc = Integer.reverse(0);
        bd = (76 >>> 98 | 76 << -98) & 0xFFFFFFFF;
        be = Long.reverse(-3636772752648416107L);
        bf = Long.reverse(0x3C00000000000000L);
        bg = (0 >>> 182 | 0 << -182) & 0xFFFFFFFF;
        bh = 327680 >>> 14 | 327680 << -14;
        bi = Long.reverse(-3636772752648416107L);
        bj = Long.reverse(0x3C00000000000000L);
        bk = Integer.reverse(0);
        bl = Integer.reverse(-1476395008);
        bm = Long.reverse(-1042699367283010411L);
        bn = Integer.reverse(0);
        bo = Integer.reverse(0x68000000);
        bp = Long.reverse(-3636772752648416107L);
        bq = Long.reverse(0x3C00000000000000L);
        br = 0 >>> 3 | 0 << ~3 + 1;
        bs = -1207959552 >>> 91 | -1207959552 << ~91 + 1;
        bt = Long.reverse(-3636772752648416107L);
        bu = Long.reverse(0x3C00000000000000L);
        bv = Integer.reverse(0);
        bw = (786432 >>> 239 | 786432 << -239) & 0xFFFFFFFF;
        bx = Long.reverse(-3636772752648416107L);
        by = Long.reverse(0x3C00000000000000L);
        bz = 0 >>> 90 | 0 << -90;
        ca = (25 >>> 64 | 25 << ~64 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(-1042699367283010411L);
        cc = 0 >>> 20 | 0 << ~20 + 1;
        cd = 0x3400000 >>> 117 | 0x3400000 << ~117 + 1;
        ce = -1 >>> 238 | -1 << ~238 + 1;
        cf = Long.reverse(-1042699367283010411L);
        cg = (0 >>> 246 | 0 << ~246 + 1) & 0xFFFFFFFF;
        ch = Integer.reverse(-671088640);
        ci = Long.reverse(-1042699367283010411L);
        cj = 0 >>> 36 | 0 << -36;
        ck = 1792 >>> 230 | 1792 << ~230 + 1;
        cl = Long.reverse(-1042699367283010411L);
        cm = Integer.reverse(0);
        cn = Integer.reverse(-1207959552);
        co = Integer.reverse(-1207959552);
        a = new String[cn];
        b = new String[co];
        NLoginCore_401.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_401.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_401.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.D("ֆ֓֒Օ֑֕֌֕֠֏՜֚֚֞֗֠բ࣪ࣨࣙࣵ࣋ࣟࣕࣛն", (byte)122, 68) + string + NLoginCore_453.F("հ", (byte)122, 70) + methodType.toString(), exception);
        }
    }
}

