/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_014;
import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_102
extends Enum<NLoginCore_102>
implements NLoginInterface_014 {
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_b;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_c;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_d;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_e;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_f;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_g;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_h;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_i;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_j;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_k;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_l;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_m;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_n;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_o;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_p;
    public static final /* enum */ NLoginCore_102 var_com_nickuc_login_NLoginCore_102_q;
    final NLoginCore_474 var_com_nickuc_login_NLoginCore_474_d;
    public final boolean aH;
    private static final /* synthetic */ NLoginCore_102[] var_com_nickuc_login_NLoginCore_102_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static long var_long_e;
    private static long var_long_f;
    private static int var_int_g;
    private static long var_long_h;
    private static int var_int_i;
    private static long var_long_j;
    private static long var_long_k;
    private static int var_int_l;
    private static long var_long_m;
    private static int var_int_n;
    private static int var_int_o;
    private static long var_long_p;
    private static int var_int_q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static long ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static long aq;
    private static int ar;
    private static long as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static long ay;
    private static int az;
    private static long ba;
    private static long bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static int bf;
    private static long bg;
    private static long bh;
    private static int bi;
    private static long bj;
    private static long bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static long bq;
    private static int br;
    private static long bs;
    private static long bt;
    private static int bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static int by;
    private static long bz;
    private static int ca;
    private static long cb;
    private static long cc;
    private static int cd;
    private static int ce;
    private static long cf;
    private static long cg;
    private static int ch;
    private static int ci;
    private static int cj;
    private static long ck;
    private static int cl;
    private static int cm;
    private static long cn;
    private static long co;
    private static int cp;
    private static int cq;
    private static long cr;
    private static long cs;
    private static int ct;
    private static int cu;
    private static int cv;
    private static long cw;
    private static int cx;
    private static int cy;
    private static long cz;
    private static long da;
    private static int db;
    private static int dc;
    private static long dd;
    private static int de;
    private static int df;
    private static long dg;
    private static int dh;
    private static int di;
    private static long dj;
    private static long dk;
    private static int dl;
    private static int dm;
    private static int dn;
    private static long cfr_renamed_1;
    private static int dp;
    private static int dq;
    private static int dr;
    private static long ds;
    private static int dt;
    private static int du;
    private static long dv;
    private static long dw;
    private static int dx;
    private static int dy;
    private static long dz;
    private static long ea;
    private static int eb;
    private static int ec;
    private static long ed;
    private static long ee;
    private static int ef;
    private static int eg;
    private static long eh;
    private static long ei;
    private static int ej;
    private static int ek;
    private static long el;
    private static long em;
    private static int en;
    private static int eo;
    private static long ep;
    private static int eq;
    private static int er;
    private static long es;
    private static long et;
    private static int eu;
    private static int ev;
    private static int ew;
    private static long ex;
    private static int ey;
    private static int ez;
    private static long fa;
    private static long fb;
    private static int fc;
    private static int fd;
    private static long fe;
    private static long ff;
    private static int fg;

    private NLoginCore_102(String string2, boolean bl) {
        String[] stringArray = new String[var_int_b];
        stringArray[NLoginCore_102.var_int_c] = (String)NLoginCore_102.c("㺀", (int)var_int_d, (long)(var_long_e ^ var_long_f)) + string2;
        this.var_com_nickuc_login_NLoginCore_474_d = NLoginCore_474.a(stringArray);
        this.aH = bl;
    }

    private NLoginCore_102(String ... stringArray) {
        this.var_com_nickuc_login_NLoginCore_474_d = NLoginCore_474.a((String[])Arrays.stream(stringArray).map(string -> (String)NLoginCore_102.c("㺀", (int)(var_int_n & var_int_o), (long)var_long_p) + string).toArray(String[]::new));
        this.aH = var_int_a;
    }

    public static NLoginCore_102 valueOf(String string) {
        return Enum.valueOf(NLoginCore_102.class, string);
    }

    @Override
    public Object java_lang_Object_a() {
        return new NLoginCore_190((String)NLoginCore_102.c("㺀", (int)var_int_g, (long)var_long_h) + this.name(), null);
    }

    private static void b() {
        int n;
        var_long_c = 4743860187304102799L;
        long l = var_long_c ^ 0x403DBE1C5EFADACDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(51 + 18), (byte)(81 + 2), (byte)(25 + 22), (byte)(44 + 23), (byte)(53 + 13), (byte)(24 + 43), (byte)(4 + 43), 80, (byte)(47 + 28), (byte)(53 + 14), (byte)(49 + 34), (byte)(4 + 49), (byte)(14 + 66), (byte)(39 + 58), 100, (byte)(2 + 98), (byte)(24 + 81), (byte)(25 + 85), (byte)(57 + 46)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
                    NLoginCore_102.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ԪԌԆՎԏԽԥԞԌՎԵԪԐԘԨԥԫԵԞԝԽԔԼ՝ԲԳԼբՕԹՙՋ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[1] = NLoginCore_223.C("ыѨгѳѧѦєѾѿіѮх", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[2] = NLoginCore_027.F("ԾԤՌԞԥԌԩՀՌԮՅԜ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ՉԺԗԞՃԫՒՄՇԲԒԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[4] = NLoginCore_387.B("ąçáĩêĘĀùçĩĐąëóăĀĆĐùøĘïėĸčĎėĽİĔĴĦ", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[5] = NLoginCore_384.B("ĨÿĠûâĭúĀþĪġČĜĔĒĤęīĺûĦąĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[6] = NLoginCore_091.E("ԌՆԚ԰ՋՐ԰ԨԏՓՔԡԸԨՔՓԼԦԫԷԽՐԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[7] = NLoginCore_324.E("ԌՇՐԯԡԡԜԑՆ՗ԒԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[8] = NLoginCore_324.D("ѦѰішэђєѩенѠх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[9] = NLoginCore_223.F("ԾԚԅԡԪՇՀԯՖՑԯԜ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[10] = NLoginCore_110.A("öçàĤëāĭęøëé÷", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[11] = NLoginCore_324.E("ԢԈԽԂԫԐԍԒԣԾԎԮԏՑԥԱ՜ԮԮԗԽԪԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[12] = NLoginCore_201.F("ՃԽՇՃՌՉԟՕԭՇԍԦԘՈԣԘ՚ՑՖ՝ԸՠԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[13] = NLoginCore_201.B("Ĥěòüúăû÷îěĥČþģīĆĐāďôĔīĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[14] = NLoginCore_223.A("ăßĢĖĆĥîĝĝċĈĴīČîĨİĩĶúûąĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[15] = NLoginCore_173.E("ԪՁԫՆԞԺԧՅՉԔԡԗԒ՗ԗ՜ՓԸԗՏՖԪԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[16] = NLoginCore_138.E("ՍԙԡԚԇԛԎԐԠՊՏՅՓՖԷՕԺԭԶՖԯՠԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[17] = NLoginCore_451.D("шѰЪэѐхгѦѾзєх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[18] = NLoginCore_453.E("ԸԮՐԻՌԒԒՂԭԕՅԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[19] = NLoginCore_138.B("ĉèĨĉ÷ĊêąýêĨ÷", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[20] = NLoginCore_076.A("ąĊēþěĚĖāıèĤ÷", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[21] = NLoginCore_091.C("ўчэюѩњђжьёзёѻ҄кѡ҇҇ѣтѣѹѐё", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[22] = NLoginCore_091.F("ՈԣԛԤՊԞԎԬԯԲՃԮԤ԰ԬԒՋ԰ԞՀ՘ԪԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[23] = NLoginCore_092.F("ԦԹԬՌԧԨԝԦՐԱՍԜ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[24] = NLoginCore_201.E("ՇԡԚՌՄԜՉՅԋԪԳԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[25] = NLoginCore_110.E("ԋԥՃ԰ԫԺԞԐԝԾԷԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[26] = NLoginCore_027.D("шдѶѓьиѪйѨѵлх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[27] = NLoginCore_446.D("пзЮињивѺѳёѠх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[28] = NLoginCore_173.C("ѷѶєѓѪѪѺѺёьѺх", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[29] = NLoginCore_451.F("ԙԜԟՋՂՀՈԨՒԡՖԩԳ՘ՖԮՔԼՌԨԸՐԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[30] = NLoginCore_387.D("ЯьљвјщќѷѕѴѽѝѕѤтіѻѻѰђѠѹѐё", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[31] = NLoginCore_559.E("ՂԽՐԇԥԎԼԮԬԿԭԕԖՍՐԖՕԛԾԵԱԪԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[32] = NLoginCore_201.F("ԃԝԩՈԙԌԩԎԱՓԟԐԯՙՕԛԳՉԕ՛ՁՠԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[33] = NLoginCore_223.E("ՍԝԆՍՍԎՍԍԳՊԧԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[34] = NLoginCore_027.D("гѧѓхыѬйѻаѬѾх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[35] = NLoginCore_559.B("Ĥę÷ĜĘĦìčĤĠí÷", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[36] = NLoginCore_027.C("ѧѳѷёдзњђѴѩзх", (byte)24, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_102.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ѓеЯѷиѦючеѷўѓйсёюєўчцѦ҉ѾѿѸ҈ѸѾѻѐ҆ўѫҖѲ҄ѤѓѮћѐғѬѥ", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[1] = NLoginCore_387.F("ԠԧՍԠՏԝԠԽՕՍՕԜ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ѥыѮхѳјыѳйђшх", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ðÿė÷ùāĈéìąąåĀĤčĲĊģćĆĤĻĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[4] = NLoginCore_384.E("ԪԌԆՎԏԽԥԞԌՎԵԪԐԘԨԥԫԵԞԝԽԘՃՙԷԢ՘՚ՄզԷը", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ѶэѮщаѻшюьѸѱҀҀѐѯѽѳцѠѓѫѵѣ҆ѻююяҐџѼч", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[6] = NLoginCore_223.F("ԌՆԚ԰ՋՐ԰ԨԏՓՑՍՌԗՌ՛ԾՇԝՀՠՐԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ѤѥрѩцлњѥѝђѲх", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[8] = NLoginCore_027.D("ууиѩѲѷѼгѿѱѰѲьўѻѲѥяё҅щѣѐё", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[9] = NLoginCore_004.B("òĘäĚğåĬąĝğĜ÷", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[10] = NLoginCore_076.F("ՉՏՂԺԏՓԡՔԑՅԔՐՌՉԹ՛ՙ՚ՐԬՠՠԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[11] = NLoginCore_559.E("ԢԈԽԂԫԐԍԒԣԾԐՁԑԤԘՅԫԸՔԪ՟ԪԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[12] = NLoginCore_076.B("ĞĘĢĞħĤúİĈĢèīĞđăīĭĲĉĊčīĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[13] = NLoginCore_324.E("ՉՀԗԡԟԨԠԜԓՀՊՉԥՆԖԳԗՌՠ԰ԬՠԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[14] = NLoginCore_446.B("ăßĢĖĆĥîĝĝċĉÿñđġįïĥĸĵúĻĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[15] = NLoginCore_201.F("ԪՁԫՆԞԺԧՅՉԔԠԸԓԩԧԨ԰ԨՔՔՕՠԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[16] = NLoginCore_027.E("ՍԙԡԚԇԛԎԐԠՊՎՎՋԕՙԓԼԯԕՖԸԪԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ĔúĩĚöëĀħĂĤĮýĔģĀėĸĲõĶùĻĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[18] = NLoginCore_559.B("ăĠĜóĔėčĝďĩĜĩĬģēđĒđĦĚĴąĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[19] = NLoginCore_201.C("дѕжиѯћњчѰўвѢћўѲнњѝѳѽћѣѐё", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[20] = NLoginCore_324.C("ѰѱцьѤљѥяйҀшњѝѹҁѤўѨчфњѣѐё", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[21] = NLoginCore_091.A("ĐùÿĀěČĄèþăìħêĩîĈĤĲ÷İļĻĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[22] = NLoginCore_559.E("ՈԣԛԤՊԞԎԬԯԲՁԪԳՊԛՌԮԛՇՀ՘ՠԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[23] = NLoginCore_575.D("бѫѳѤщгѧиѾжѻѿємїѴњіѾшмѣѐё", (byte)24, 68);
                    NLoginCore_102.var_java_lang_String_arr_b[24] = NLoginCore_427.A("åĀćĊâğąĄďġāĄĐîİîò÷ĶĻėĕĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[25] = NLoginCore_004.F("ԵԹԗԩՃԺԜԣԕԷՂԬԪԧԲԔ՛ԞԺՔՐՠԧԨ", (byte)24, 70);
                    NLoginCore_102.var_java_lang_String_arr_b[26] = NLoginCore_223.E("ԋՍԦԩՆԡԭՃԋՂՉԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[27] = NLoginCore_453.E("ԊԞԤԈԜԌԍԠԢՉԤՂԴՔԓԼԨԮՇԵԬՐԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[28] = NLoginCore_027.C("ѬтѦѕѻќьѩѱъѹѰяоѳѕтѶѩѡѿ҉ѐё", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[29] = NLoginCore_427.C("тхшѴѫѩѱёѻъҀѾѺѾўѢс҆҃҃ѳ҉ѐё", (byte)24, 67);
                    NLoginCore_102.var_java_lang_String_arr_b[30] = NLoginCore_324.B("áþċäĊûĎĩćĦįĳĵĴčĂąĤĳĜĐĕĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[31] = NLoginCore_451.E("ՂԽՐԇԥԎԼԮԬԿԭԊԐՂՒԳՔԾ՘ՒԓՠԧԨ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[32] = NLoginCore_559.A("ÞøĄģôçĄéČĮüĊìĠĢĥėĨČñīąĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[33] = NLoginCore_004.A("ėñááéćČĊçĉĝĴíĆïïïĪñĉĒĕĂă", (byte)24, 65);
                    NLoginCore_102.var_java_lang_String_arr_b[34] = NLoginCore_027.B("ĞĖĩêĆèěĠîħčĆĨıčĈĤıóĴĲīĂă", (byte)24, 66);
                    NLoginCore_102.var_java_lang_String_arr_b[35] = NLoginCore_446.E("ԧԪԡԤՐՑԬՕԵՒԧԜ", (byte)24, 69);
                    NLoginCore_102.var_java_lang_String_arr_b[36] = NLoginCore_138.D("хѧцђѴѶѤљѫёѲх", (byte)24, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_102.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ѱбсѰѓѮѷќѦёђѬіѱѾ҅њфѶп҄҉ѐё", (byte)24, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_102.var_java_lang_String_arr_b[0] = NLoginCore_173.A("āĤģċĦĮĠĚČĀĚīĭāİįïīĒĈĜĻĂă", (byte)24, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x45L;
        l ^= 0x403DBE1C5EFADACDL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(44 + 25), (byte)(9 + 74), 47, (byte)(32 + 35), (byte)(57 + 9), 67, (byte)(2 + 45), (byte)(69 + 11), (byte)(2 + 73), (byte)(7 + 60), (byte)(45 + 38), (byte)(15 + 38), (byte)(8 + 72), (byte)(90 + 7), (byte)(94 + 6), (byte)(49 + 51), (byte)(66 + 39), (byte)(82 + 28), (byte)(50 + 53)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.B("ƞƫƪŭƭƩƤƭƸƧŴƲƶƯƲƸźӴӠӷԘӸӥԐԈԍ", (byte)94, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_102.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public NLoginCore_208 com_nickuc_login_NLoginCore_208_a() {
        throw new UnsupportedOperationException();
    }

    private static /* synthetic */ NLoginCore_102[] com_nickuc_login_NLoginCore_102_arr_a() {
        NLoginCore_102[] NLoginCore_102Array = new NLoginCore_102[var_int_q];
        NLoginCore_102Array[NLoginCore_102.r] = var_com_nickuc_login_NLoginCore_102_b;
        NLoginCore_102Array[NLoginCore_102.s] = var_com_nickuc_login_NLoginCore_102_c;
        NLoginCore_102Array[NLoginCore_102.t] = var_com_nickuc_login_NLoginCore_102_d;
        NLoginCore_102Array[NLoginCore_102.u] = var_com_nickuc_login_NLoginCore_102_e;
        NLoginCore_102Array[NLoginCore_102.v] = var_com_nickuc_login_NLoginCore_102_f;
        NLoginCore_102Array[NLoginCore_102.w] = var_com_nickuc_login_NLoginCore_102_g;
        NLoginCore_102Array[NLoginCore_102.x] = var_com_nickuc_login_NLoginCore_102_h;
        NLoginCore_102Array[NLoginCore_102.y] = var_com_nickuc_login_NLoginCore_102_i;
        NLoginCore_102Array[NLoginCore_102.z] = var_com_nickuc_login_NLoginCore_102_j;
        NLoginCore_102Array[NLoginCore_102.aa] = var_com_nickuc_login_NLoginCore_102_k;
        NLoginCore_102Array[NLoginCore_102.ab] = var_com_nickuc_login_NLoginCore_102_l;
        NLoginCore_102Array[NLoginCore_102.ac] = var_com_nickuc_login_NLoginCore_102_m;
        NLoginCore_102Array[NLoginCore_102.ad] = var_com_nickuc_login_NLoginCore_102_n;
        NLoginCore_102Array[NLoginCore_102.ae] = var_com_nickuc_login_NLoginCore_102_o;
        NLoginCore_102Array[NLoginCore_102.af] = var_com_nickuc_login_NLoginCore_102_p;
        NLoginCore_102Array[NLoginCore_102.ag] = var_com_nickuc_login_NLoginCore_102_q;
        return NLoginCore_102Array;
    }

    public static NLoginCore_102[] values() {
        return (NLoginCore_102[])var_com_nickuc_login_NLoginCore_102_arr_a.clone();
    }

    @Override
    public NLoginCore_474 com_nickuc_login_NLoginCore_474_a() {
        return this.var_com_nickuc_login_NLoginCore_474_d;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_102.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), NLoginCore_102.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.B("ðýü¿ÿûöÿĊùÆĄĈāĄĊÌцвщѪъзѢњџá", (byte)7, 66) + string + NLoginCore_091.F("ӽ", (byte)7, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 124 | 0 << -124;
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(0);
        var_long_e = Long.reverse(-1022169732842148990L);
        var_long_f = Long.reverse(-6773413839565225984L);
        var_int_g = 0x4000000 >>> 250 | 0x4000000 << ~250 + 1;
        var_long_h = Long.reverse(6039474482874788738L);
        var_int_i = Integer.reverse(0x40000000);
        var_long_j = Long.reverse(-1022169732842148990L);
        var_long_k = Long.reverse(-6773413839565225984L);
        var_int_l = 0xC000000 >>> 154 | 0xC000000 << ~154 + 1;
        var_long_m = Long.reverse(6039474482874788738L);
        var_int_n = (2 >>> 127 | 2 << ~127 + 1) & 0xFFFFFFFF;
        var_int_o = (-1 >>> 25 | -1 << ~25 + 1) & 0xFFFFFFFF;
        var_long_p = Long.reverse(6039474482874788738L);
        var_int_q = Integer.reverse(0x8000000);
        r = 0 >>> 141 | 0 << ~141 + 1;
        s = Integer.reverse(Integer.MIN_VALUE);
        t = 2048 >>> 202 | 2048 << -202;
        u = 0xC000000 >>> 90 | 0xC000000 << -90;
        v = 0x10000000 >>> 58 | 0x10000000 << ~58 + 1;
        w = 1280 >>> 104 | 1280 << -104;
        x = Integer.reverse(0x60000000);
        y = 0x70000000 >>> 124 | 0x70000000 << -124;
        z = (64 >>> 3 | 64 << ~3 + 1) & 0xFFFFFFFF;
        aa = 0x48000000 >>> 251 | 0x48000000 << -251;
        ab = 0xA00000 >>> 244 | 0xA00000 << -244;
        ac = Integer.reverse(-805306368);
        ad = 98304 >>> 141 | 98304 << -141;
        ae = Integer.reverse(-1342177280);
        af = 0x1C0000 >>> 113 | 0x1C0000 << -113;
        ag = 0x3C00000 >>> 182 | 0x3C00000 << -182;
        ah = Integer.reverse(-1543503872);
        ai = (-1811939328 >>> 218 | -1811939328 << ~218 + 1) & 0xFFFFFFFF;
        aj = Integer.reverse(-1610612736);
        ak = Long.reverse(6039474482874788738L);
        al = Integer.reverse(0);
        am = 262144 >>> 146 | 262144 << -146;
        an = Integer.reverse(0);
        ao = 0x1800000 >>> 54 | 0x1800000 << ~54 + 1;
        ap = (-1 >>> 206 | -1 << -206) & 0xFFFFFFFF;
        aq = Long.reverse(6039474482874788738L);
        ar = Integer.reverse(-536870912);
        as = Long.reverse(6039474482874788738L);
        at = Integer.reverse(Integer.MIN_VALUE);
        au = 32768 >>> 79 | 32768 << -79;
        av = (0 >>> 248 | 0 << ~248 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(0x10000000);
        ax = (-1 >>> 247 | -1 << ~247 + 1) & 0xFFFFFFFF;
        ay = Long.reverse(6039474482874788738L);
        az = Integer.reverse(-1879048192);
        ba = Long.reverse(-1022169732842148990L);
        bb = Long.reverse(-6773413839565225984L);
        bc = 4096 >>> 107 | 4096 << ~107 + 1;
        bd = 65536 >>> 208 | 65536 << -208;
        be = (0 >>> 0 | 0 << ~0 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(0x50000000);
        bg = Long.reverse(-1022169732842148990L);
        bh = Long.reverse(-6773413839565225984L);
        bi = 0xB00000 >>> 116 | 0xB00000 << ~116 + 1;
        bj = Long.reverse(-1022169732842148990L);
        bk = Long.reverse(-6773413839565225984L);
        bl = Integer.reverse(-1073741824);
        bm = 0x10000000 >>> 92 | 0x10000000 << ~92 + 1;
        bn = Integer.reverse(0);
        bo = (0x30000000 >>> 26 | 0x30000000 << ~26 + 1) & 0xFFFFFFFF;
        bp = -1 >>> 190 | -1 << ~190 + 1;
        bq = Long.reverse(6039474482874788738L);
        br = Integer.reverse(-1342177280);
        bs = Long.reverse(-1022169732842148990L);
        bt = Long.reverse(-6773413839565225984L);
        bu = Integer.reverse(0x20000000);
        bv = (1 >>> 32 | 1 << -32) & 0xFFFFFFFF;
        bw = Integer.reverse(0);
        bx = Integer.reverse(0x70000000);
        by = Integer.reverse(-1);
        bz = Long.reverse(6039474482874788738L);
        ca = Integer.reverse(-268435456);
        cb = Long.reverse(-1022169732842148990L);
        cc = Long.reverse(-6773413839565225984L);
        cd = 0x140000 >>> 210 | 0x140000 << ~210 + 1;
        ce = Integer.reverse(0x8000000);
        cf = Long.reverse(-1022169732842148990L);
        cg = Long.reverse(-6773413839565225984L);
        ch = 524288 >>> 51 | 524288 << ~51 + 1;
        ci = (34816 >>> 11 | 34816 << ~11 + 1) & 0xFFFFFFFF;
        cj = Integer.reverse(-1);
        ck = Long.reverse(6039474482874788738L);
        cl = Integer.reverse(0x60000000);
        cm = 2304 >>> 167 | 2304 << -167;
        cn = Long.reverse(-1022169732842148990L);
        co = Long.reverse(-6773413839565225984L);
        cp = (32768 >>> 175 | 32768 << -175) & 0xFFFFFFFF;
        cq = Integer.reverse(-939524096);
        cr = Long.reverse(-1022169732842148990L);
        cs = Long.reverse(-6773413839565225984L);
        ct = Integer.reverse(-536870912);
        cu = 0x5000000 >>> 118 | 0x5000000 << -118;
        cv = (-1 >>> 150 | -1 << -150) & 0xFFFFFFFF;
        cw = Long.reverse(6039474482874788738L);
        cx = 16 >>> 132 | 16 << -132;
        cy = 0x40000005 >>> 30 | 0x40000005 << ~30 + 1;
        cz = Long.reverse(-1022169732842148990L);
        da = Long.reverse(-6773413839565225984L);
        db = 2048 >>> 72 | 2048 << ~72 + 1;
        dc = -2147483643 >>> 254 | -2147483643 << -254;
        dd = Long.reverse(6039474482874788738L);
        de = (131072 >>> 241 | 131072 << ~241 + 1) & 0xFFFFFFFF;
        df = Integer.reverse(-402653184);
        dg = Long.reverse(6039474482874788738L);
        dh = Integer.reverse(-1879048192);
        di = (0x180000 >>> 144 | 0x180000 << ~144 + 1) & 0xFFFFFFFF;
        dj = Long.reverse(-1022169732842148990L);
        dk = Long.reverse(-6773413839565225984L);
        dl = Integer.reverse(Integer.MIN_VALUE);
        dm = (409600 >>> 238 | 409600 << -238) & 0xFFFFFFFF;
        dn = Integer.reverse(-1);
        cfr_renamed_1 = Long.reverse(6039474482874788738L);
        dp = (0x50000000 >>> 27 | 0x50000000 << -27) & 0xFFFFFFFF;
        dq = Integer.reverse(0x58000000);
        dr = (-1 >>> 82 | -1 << -82) & 0xFFFFFFFF;
        ds = Long.reverse(6039474482874788738L);
        dt = Integer.reverse(Integer.MIN_VALUE);
        du = Integer.reverse(-671088640);
        dv = Long.reverse(-1022169732842148990L);
        dw = Long.reverse(-6773413839565225984L);
        dx = 45056 >>> 12 | 45056 << ~12 + 1;
        dy = (229376 >>> 13 | 229376 << ~13 + 1) & 0xFFFFFFFF;
        dz = Long.reverse(-1022169732842148990L);
        ea = Long.reverse(-6773413839565225984L);
        eb = Integer.reverse(Integer.MIN_VALUE);
        ec = (0x40000007 >>> 126 | 0x40000007 << ~126 + 1) & 0xFFFFFFFF;
        ed = Long.reverse(-1022169732842148990L);
        ee = Long.reverse(-6773413839565225984L);
        ef = (24576 >>> 75 | 24576 << -75) & 0xFFFFFFFF;
        eg = 1920 >>> 166 | 1920 << -166;
        eh = Long.reverse(-1022169732842148990L);
        ei = Long.reverse(-6773413839565225984L);
        ej = Integer.reverse(Integer.MIN_VALUE);
        ek = 15872 >>> 41 | 15872 << ~41 + 1;
        el = Long.reverse(-1022169732842148990L);
        em = Long.reverse(-6773413839565225984L);
        en = Integer.reverse(-1342177280);
        eo = 0x20000000 >>> 56 | 0x20000000 << ~56 + 1;
        ep = Long.reverse(6039474482874788738L);
        eq = 65536 >>> 80 | 65536 << ~80 + 1;
        er = (-2147483632 >>> 191 | -2147483632 << -191) & 0xFFFFFFFF;
        es = Long.reverse(-1022169732842148990L);
        et = Long.reverse(-6773413839565225984L);
        eu = 112 >>> 99 | 112 << -99;
        ev = 0x40000004 >>> 157 | 0x40000004 << ~157 + 1;
        ew = Integer.reverse(-1);
        ex = Long.reverse(6039474482874788738L);
        ey = Integer.reverse(Integer.MIN_VALUE);
        ez = 8960 >>> 200 | 8960 << -200;
        fa = Long.reverse(-1022169732842148990L);
        fb = Long.reverse(-6773413839565225984L);
        fc = Integer.reverse(-268435456);
        fd = (9216 >>> 104 | 9216 << ~104 + 1) & 0xFFFFFFFF;
        fe = Long.reverse(-1022169732842148990L);
        ff = Long.reverse(-6773413839565225984L);
        fg = (16384 >>> 78 | 16384 << -78) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ah];
        var_java_lang_String_arr_b = new String[ai];
        NLoginCore_102.b();
        String[] stringArray = new String[am];
        stringArray[NLoginCore_102.an] = NLoginCore_102.c("㺃", (int)(ao & ap), (long)aq);
        var_com_nickuc_login_NLoginCore_102_b = new NLoginCore_102(stringArray);
        String[] stringArray2 = new String[au];
        stringArray2[NLoginCore_102.av] = NLoginCore_102.c("㺉", (int)(aw & ax), (long)ay);
        var_com_nickuc_login_NLoginCore_102_c = new NLoginCore_102(stringArray2);
        String[] stringArray3 = new String[bd];
        stringArray3[NLoginCore_102.be] = NLoginCore_102.c("㺏", (int)bf, (long)(bg ^ bh));
        var_com_nickuc_login_NLoginCore_102_d = new NLoginCore_102(stringArray3);
        String[] stringArray4 = new String[bm];
        stringArray4[NLoginCore_102.bn] = NLoginCore_102.c("㺕", (int)(bo & bp), (long)bq);
        var_com_nickuc_login_NLoginCore_102_e = new NLoginCore_102(stringArray4);
        String[] stringArray5 = new String[bv];
        stringArray5[NLoginCore_102.bw] = NLoginCore_102.c("㺛", (int)(bx & by), (long)bz);
        var_com_nickuc_login_NLoginCore_102_f = new NLoginCore_102(stringArray5);
        var_com_nickuc_login_NLoginCore_102_g = new NLoginCore_102((String)NLoginCore_102.c("㺡", (int)ce, (long)(cf ^ cg)), ch != 0);
        var_com_nickuc_login_NLoginCore_102_h = new NLoginCore_102((String)NLoginCore_102.c("㺧", (int)cm, (long)(cn ^ co)), cp != 0);
        var_com_nickuc_login_NLoginCore_102_i = new NLoginCore_102((String)NLoginCore_102.c("㺭", (int)(cu & cv), (long)cw), cx != 0);
        var_com_nickuc_login_NLoginCore_102_j = new NLoginCore_102((String)NLoginCore_102.c("㺳", (int)dc, (long)dd), de != 0);
        var_com_nickuc_login_NLoginCore_102_k = new NLoginCore_102((String)NLoginCore_102.c("㺹", (int)di, (long)(dj ^ dk)), dl != 0);
        var_com_nickuc_login_NLoginCore_102_l = new NLoginCore_102((String)NLoginCore_102.c("㺿", (int)(dq & dr), (long)ds), dt != 0);
        var_com_nickuc_login_NLoginCore_102_m = new NLoginCore_102((String)NLoginCore_102.c("㻅", (int)dy, (long)(dz ^ ea)), eb != 0);
        var_com_nickuc_login_NLoginCore_102_n = new NLoginCore_102((String)NLoginCore_102.c("㻋", (int)eg, (long)(eh ^ ei)), ej != 0);
        var_com_nickuc_login_NLoginCore_102_o = new NLoginCore_102((String)NLoginCore_102.c("㻑", (int)eo, (long)ep), eq != 0);
        var_com_nickuc_login_NLoginCore_102_p = new NLoginCore_102((String)NLoginCore_102.c("㻗", (int)(ev & ew), (long)ex), ey != 0);
        var_com_nickuc_login_NLoginCore_102_q = new NLoginCore_102((String)NLoginCore_102.c("㻝", (int)fd, (long)(fe ^ ff)), fg != 0);
        var_com_nickuc_login_NLoginCore_102_arr_a = NLoginCore_102.com_nickuc_login_NLoginCore_102_arr_a();
    }

    @Override
    public int int_a() {
        return this.ordinal();
    }

    @Nullable
    public static NLoginCore_190 a(String string, NLoginCore_219 NLoginCore_2192) {
        String string2 = NLoginCore_065.q(NLoginCore_2192.java_lang_String_b(string + (String)NLoginCore_102.c("㺀", (int)var_int_i, (long)(var_long_j ^ var_long_k))));
        if (string2 == null) {
            return null;
        }
        String string3 = NLoginCore_065.q(NLoginCore_2192.java_lang_String_b(string + (String)NLoginCore_102.c("㺃", (int)var_int_l, (long)var_long_m)));
        return new NLoginCore_190(string2, string3);
    }
}

