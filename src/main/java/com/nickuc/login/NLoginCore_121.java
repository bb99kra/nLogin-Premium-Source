/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_125;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_452;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_028;
import com.nickuc.login.NLoginType_028;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_121
extends Enum<NLoginCore_121> {
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_a;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_b;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_c;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_d;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_e;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_f;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_g;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_h;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_i;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_j;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_k;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_l;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_m;
    public static final /* enum */ NLoginCore_121 var_com_nickuc_login_NLoginCore_121_n;
    private final int var_int_k;
    private final Method var_java_lang_reflect_Method_a;
    private final boolean var_boolean_t;
    private final NLoginInterface_019<Object> var_com_nickuc_login_NLoginInterface_019_java_lang_Object__a;
    private final NLoginInterface_019<Object>[] var_com_nickuc_login_NLoginInterface_019_java_lang_Object__arr_a;
    private static final /* synthetic */ NLoginCore_121[] var_com_nickuc_login_NLoginCore_121_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int var_int_g;
    private static int var_int_h;
    private static int var_int_i;
    private static int var_int_j;
    private static int var_int_l;
    private static int var_int_m;
    private static int var_int_n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int var_int_t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static long z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static long al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static long aq;
    private static long ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static long aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static long bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static long bf;
    private static long bg;
    private static int bh;
    private static int bi;
    private static long bj;
    private static long bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static long bo;
    private static long bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static int bt;
    private static long bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static long by;
    private static long bz;
    private static int ca;
    private static int cb;
    private static int cc;
    private static long cd;
    private static long ce;
    private static int cf;
    private static int cg;
    private static int ch;
    private static long ci;
    private static long cj;
    private static int ck;
    private static int cl;
    private static int cm;
    private static int cn;
    private static long co;
    private static long cp;
    private static int cq;
    private static int cr;
    private static int cs;
    private static long ct;
    private static int cu;
    private static int cv;
    private static int cw;
    private static int cx;
    private static int cy;
    private static long cz;
    private static int da;
    private static int db;
    private static int dc;
    private static int dd;
    private static long de;
    private static int df;
    private static int dg;
    private static int dh;
    private static int di;
    private static long dj;
    private static int dk;
    private static int dl;
    private static int dm;
    private static int dn;
    private static long cfr_renamed_1;
    private static int dp;
    private static int dq;
    private static int dr;
    private static int ds;
    private static int dt;
    private static long du;
    private static int dv;
    private static int dw;
    private static int dx;
    private static long dy;
    private static long dz;
    private static int ea;
    private static int eb;
    private static int ec;
    private static int ed;
    private static long ee;
    private static long ef;
    private static int eg;
    private static int eh;
    private static int ei;
    private static long ej;
    private static int ek;
    private static int el;
    private static int em;
    private static int en;
    private static long eo;
    private static int ep;
    private static int eq;
    private static int er;
    private static long es;
    private static long et;
    private static int eu;
    private static int ev;
    private static int ew;
    private static int ex;
    private static long ey;
    private static long ez;
    private static int fa;
    private static int fb;
    private static int fc;
    private static long fd;
    private static long fe;
    private static int ff;
    private static int fg;
    private static int fh;

    private NLoginCore_121(int n2, String string2, NLoginInterface_019<?> NLoginInterface_0192, NLoginInterface_019<?> ... NLoginInterface_019Array) {
        this(n2, string2, var_int_a != 0, NLoginInterface_0192, NLoginInterface_019Array);
    }

    @Generated
    public NLoginInterface_019<Object> a() {
        return this.var_com_nickuc_login_NLoginCore_121_a;
    }

    private static void void_b() {
        int n;
        var_long_c = -4636450520511991614L;
        long l = var_long_c ^ 0x2F1411FAFC7AD6B1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(43 + 26), (byte)(65 + 18), (byte)(25 + 22), (byte)(50 + 17), (byte)(48 + 18), (byte)(35 + 32), (byte)(35 + 12), 80, (byte)(65 + 10), (byte)(22 + 45), (byte)(28 + 55), (byte)(3 + 50), 80, (byte)(37 + 60), (byte)(60 + 40), (byte)(11 + 89), (byte)(6 + 99), (byte)(53 + 57), (byte)(77 + 26)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_121.var_java_lang_String_arr_b[0] = NLoginCore_201.D("хмжѴязѹѕѡрѾѰѳљѕ҉Ѽ҆ѦҐѩѤѩҍѬѲѯ҃ҖҋіѼ", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[1] = NLoginCore_387.C("вѱѯйѯјѾпѕџ҂҆фѷѦѤѼѶэ҅Ѫҏії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[2] = NLoginCore_138.F("ՊԜԦԽԨ԰ՂԳԒԪՈԐԓԳԚԨԨՉԫԬԳբԩԪ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[3] = NLoginCore_091.C("шыьѨмкѰќљѵ҄яћуҀєѩпцҍњҏії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[4] = NLoginCore_110.C("ѷщѓѪѕѝѯѠпїѴйѷхѣҌѼѶэҁѺѼѲ҂ѧҏєѵѯѳѪѲ", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[5] = NLoginCore_027.C("шыьѨмкѰќљѵ҆Ѻ҅ҀѸѬ҂ҀҁҎҌѩії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ħùăĚąčğĐïćĤĩčóęĐčûĳùĮĺĭĕŃüĔùĶĕęĢ", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[7] = NLoginCore_223.D("шыьѨмкѰќљѵ҄ѣўѓѕўѥ҅рѣѐѿії", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[8] = NLoginCore_223.B("ĆĝíČĚïèĴąĵĆĔĆĮķĊĶīĭþěęĻĠĢŁŀĆĜļĥĠ", (byte)26, 66);
                    NLoginCore_121.var_java_lang_String_arr_b[9] = NLoginCore_110.D("єѥѲѵѬѵлкѺњќѨхѦјѡіѾ҈щѠҏії", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[10] = NLoginCore_092.F("ԝԐԲՆԱՈՀԕԐԔԧԔԺՋԜ՚ՕԸԗԭՑԴԼԺՠՅԴ՘ԻԻՖժ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[11] = NLoginCore_324.C("ыѪьйіѹҀѽѾџіѐ҈ћѫїіщѽћ҄ѯѮ҈ҋяҏѭҏѳѩ҆", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[12] = NLoginCore_138.F("ԤԇԣԾՐԼՏԩՂԧՄՇՐԨԼԶ՟ԺՋՒ՗՘ԤՎ՘ԟԨԽ՘գ՚ԭ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[13] = NLoginCore_223.E("ՎՃԬՆԡԠԧԑԦԱՍԑԛ՝ՏԙԑԼԜԺԷԬԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[14] = NLoginCore_384.B("ħæĈĤāïéįĆđĄĥĤĤúøĩćČěĿùĒĶķĒľŃĖŁęļ", (byte)26, 66);
                    NLoginCore_121.var_java_lang_String_arr_b[15] = NLoginCore_138.A("ĔíĎĉćêĝĐĪąíïĸĳİĪčĭðĝĉĉĆć", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[16] = NLoginCore_004.A("ħæĈĤāïéįĆđąāĪĥĎĻ÷ĲğęįğĭİŁŁĞĵĆŅĔī", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[17] = NLoginCore_384.F("ԎԱԎԝԉՁԇՅՁԘԸԙԹՙԱՊԧՙՌՠՑՕՆԦԱԞԸ՛ԼՈբ՟", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[18] = NLoginCore_004.E("ԙԞԻՅԭՑԾՂԣԥԘ԰ՇԴ՘ՇԲՁՍ՝ՑԬԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[19] = NLoginCore_027.C("ѩмїоѿлйѿѰрѮйѱ҄Ҋ҄҈ҋѷцьҏії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[20] = NLoginCore_138.A("ģĦöùąĐĀûĔðöĥöıøČċąėĺĽĿĆć", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[21] = NLoginCore_138.D("ћѭђёѝѽѢлуѵнѥѣщҀѽҀѬљцҌҏії", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[22] = NLoginCore_091.D("щѩѴђѫѹ҂эк҂Ѿ҇ѐєѝ҉ѡѾѽ҆шѩії", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[23] = NLoginCore_575.C("Ѹѥщѓѝќюлѯінњѐѳхєҋ҃цҊѧҏії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[24] = NLoginCore_091.F("ԽԡԞԉԞԆՀՅՄԶՉԌՍ՛ԙԩ՚ՁՍԹՒԼԩԪ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[25] = NLoginCore_076.E("ԌԝՍԥՃԜԟՍԯԭԏԻԸՍ԰ԻԽՀԞՖԚբԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[26] = NLoginCore_201.E("ԞԍՌԽՒԯԍ՗ՊՌՉ՛ՎՋԨԾԘԟԠ՜ՀԼԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[27] = NLoginCore_324.B("÷öæĈĆđĎĭĊýĄĄðĔĩěćĪĶĿğĿĆć", (byte)26, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_121.var_java_lang_String_arr_b[0] = NLoginCore_223.A("õìæĤÿçĩąđðĮĠģĉąĹĬĶĖŀęčĢĭĞŅŇĆĥŅīĂ", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ԅՄՂԌՂԫՑԒԨԲՖԒ՚ՆԚՉԚ԰ՠ՗ԙՠեՅԵէգՉէԪ՟ա", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[2] = NLoginCore_427.E("ՊԜԦԽԨ԰ՂԳԒԪՉԓԶԽ՜ԵԪԯՕԘԺբԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[3] = NLoginCore_173.E("ԛԞԟԻԏԍՃԯԬՈ՗ՙ՘ԷԷԪԗԛՏՃՔբԩԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[4] = NLoginCore_138.C("ѷщѓѪѕѝѯѠпїѴйѷхѣҌѼѶэҁѺѽ҉ъѳяіѫҕҊ҉љ", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[5] = NLoginCore_384.A("øûüĘìêĠČĉĥĴñċįĤĕļöĎùĶČôĸýĘĚğĐĉėŁ", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[6] = NLoginCore_091.D("ѷщѓѪѕѝѯѠпїѴѹѝуѩѠѝы҃щѾ҄ҏѨўѴѨѕҍѓѴҖ", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[7] = NLoginCore_453.C("шыьѨмкѰќљѵ҇рѱўјѣѽ҉їѫтѹў҃єђџѯѨѶ҉қ", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[8] = NLoginCore_201.C("іѭнќѪпи҄ѕ҅іѤіѾ҇њ҆ѻѽюѫѪҀэѩѢѠяѢѢ҈ј", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[9] = NLoginCore_004.C("єѥѲѵѬѵлкѺњњѦучџѠ҆ъѹѯўҐҏѳѱѭьіюғђѰ", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[10] = NLoginCore_138.F("ԝԐԲՆԱՈՀԕԐԔԧԔԺՋԜ՚ՕԸԗԭՑԸԳԯԸԸԥ՗՞՜՜ԥԷԮ՛ՋիէՌ՟մղՁԾ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[11] = NLoginCore_201.E("ԞԽԟԌԩՌՓՐՑԲԩԣ՛ԮԾԪԩԜՐԮ՗ՅԱՄԞ՞ԸդՉԶբՋ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[12] = NLoginCore_559.E("ԤԇԣԾՐԼՏԩՂԧՄՇՐԨԼԶ՟ԺՋՒ՗՟ԮԢ՘Ԛ՟ԸդՇժԪ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[13] = NLoginCore_223.D("ѻѰљѳюэєоѓўѸосѪѫічѶҎьэґѡѯѼҐ҈ѤєѢҋѴ", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[14] = NLoginCore_324.F("ՊԉԫՇԤԒԌՒԩԴԧՈՇՇԝԛՌԪԯԾբԣԵԸզ՘Չԥ՟թ՝Թ", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[15] = NLoginCore_201.E("ԷԐԱԬԪԍՀԳՍԨԑԪԍ՜ԫ՞ԾԗԾԶԱԴ՘ԝԱԸԥԣբզեԻ", (byte)26, 69);
                    NLoginCore_121.var_java_lang_String_arr_b[16] = NLoginCore_173.D("ѷжјѴёпйѿіѡѕёѺѵўҋч҂ѯѩѿѬѯ҉ѐѦҔяѯѥљҖ", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[17] = NLoginCore_453.C("лўлъжѮдѲѮхѥцѦ҆ўѷє҆ѹҍѾҍфѢцѣѬѯҍѣѣћ", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[18] = NLoginCore_446.D("цыѨѲњѾѫѯѐђцџтџќ҃ьѣѶъҀҀћѫђҎѧѱҕёҚ҅", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[19] = NLoginCore_091.F("ԼԏԪԑՒԎԌՒՃԓՁՙՍ՛ԹԱԕՖԯԔՙԶՙԵՁ՛էաՁԺԨ՝", (byte)26, 70);
                    NLoginCore_121.var_java_lang_String_arr_b[20] = NLoginCore_092.B("ģĦöùąĐĀûĔðèĐĮĆĚúķīļþĒįĆć", (byte)26, 66);
                    NLoginCore_121.var_java_lang_String_arr_b[21] = NLoginCore_324.C("ћѭђёѝѽѢлуѵофќхїїҋь҃ҍшѿії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[22] = NLoginCore_004.A("ùęĤĂěĩĲýêĲĮĘĥĹĻôĸį÷ĭČįĆć", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[23] = NLoginCore_091.A("ĨĕùăčČþëğĆðıĳăĮĦĎĝôĚķĉĆć", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ѪюыжыгѭѲѱѣѶѺїёфсѡхѻҏљѿії", (byte)26, 67);
                    NLoginCore_121.var_java_lang_String_arr_b[25] = NLoginCore_092.A("éúĪĂĠùüĪČĊèĸĤēúĪıďČėĳĉĆć", (byte)26, 65);
                    NLoginCore_121.var_java_lang_String_arr_b[26] = NLoginCore_559.D("ыкѹѪѿќк҄ѷѹѴѯ҅ѷҁ҃ѡ҆ј҅Ѱљії", (byte)26, 68);
                    NLoginCore_121.var_java_lang_String_arr_b[27] = NLoginCore_110.E("ԚԙԉԫԩԴԱՐԭԠԨԥ՛ԱՍՕ՛ՠԫՊՐՒԩԪ", (byte)26, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_121.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԍԍՊՐՏՐԎՄԮԒԐԞ", (byte)26, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_121.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ĀĮçøČëýåğçõû", (byte)26, 65);
                }
            }
        }
    }

    @Generated
    public int int_b() {
        return this.var_int_k;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_121.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("бѓѕељѸѰ҆Ѳсѿѵ҃ѽцѫҍҌ҄Ҋ҄љ", (byte)28, 68), NLoginCore_121.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߕߢߏߖ߆ߙߗߗߣѝ", (byte)28, 67) + string + NLoginCore_091.F("Ԓ", (byte)28, 70) + methodType.toString(), exception);
        }
    }

    public JSONArray a(Object ... objectArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = var_int_b; i < ((NLoginCore_121)this.var_com_nickuc_login_NLoginCore_121_a).length; ++i) {
            jSONArray.put(i, (Object)this.var_com_nickuc_login_NLoginCore_121_a[i].a(objectArray[i]));
        }
        return jSONArray;
    }

    public Object[] a(JSONArray jSONArray) {
        Object[] objectArray = new Object[jSONArray.length()];
        for (int i = var_int_c; i < objectArray.length; ++i) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            objectArray[i] = this.var_com_nickuc_login_NLoginCore_121_a[i].a(jSONObject);
        }
        return objectArray;
    }

    private static /* synthetic */ NLoginCore_121[] com_nickuc_login_NLoginCore_121_arr_a() {
        NLoginCore_121[] NLoginCore_121Array = new NLoginCore_121[var_int_f];
        NLoginCore_121Array[NLoginCore_121.var_int_g] = var_com_nickuc_login_NLoginCore_121_a;
        NLoginCore_121Array[NLoginCore_121.var_int_h] = var_com_nickuc_login_NLoginCore_121_b;
        NLoginCore_121Array[NLoginCore_121.var_int_i] = var_com_nickuc_login_NLoginCore_121_c;
        NLoginCore_121Array[NLoginCore_121.var_int_j] = var_com_nickuc_login_NLoginCore_121_d;
        NLoginCore_121Array[NLoginCore_121.var_int_l] = var_com_nickuc_login_NLoginCore_121_e;
        NLoginCore_121Array[NLoginCore_121.var_int_m] = var_com_nickuc_login_NLoginCore_121_f;
        NLoginCore_121Array[NLoginCore_121.var_int_n] = var_com_nickuc_login_NLoginCore_121_g;
        NLoginCore_121Array[NLoginCore_121.o] = var_com_nickuc_login_NLoginCore_121_h;
        NLoginCore_121Array[NLoginCore_121.p] = var_com_nickuc_login_NLoginCore_121_i;
        NLoginCore_121Array[NLoginCore_121.q] = var_com_nickuc_login_NLoginCore_121_j;
        NLoginCore_121Array[NLoginCore_121.r] = var_com_nickuc_login_NLoginCore_121_k;
        NLoginCore_121Array[NLoginCore_121.s] = var_com_nickuc_login_NLoginCore_121_l;
        NLoginCore_121Array[NLoginCore_121.var_int_t] = var_com_nickuc_login_NLoginCore_121_m;
        NLoginCore_121Array[NLoginCore_121.u] = var_com_nickuc_login_NLoginCore_121_n;
        return NLoginCore_121Array;
    }

    public static NLoginCore_121 valueOf(String string) {
        return Enum.valueOf(NLoginCore_121.class, string);
    }

    @Generated
    public boolean k() {
        return this.var_boolean_t;
    }

    public Object a(nLoginAPI nLoginAPI2, Object ... objectArray) {
        return this.var_java_lang_reflect_Method_a.invoke((Object)nLoginAPI2, objectArray);
    }

    private void p() {
    }

    public static NLoginCore_121[] values() {
        return (NLoginCore_121[])var_com_nickuc_login_NLoginCore_121_arr_a.clone();
    }

    @Generated
    public NLoginInterface_019<Object>[] com_nickuc_login_NLoginInterface_019_java_lang_Object__arr_a() {
        return this.var_com_nickuc_login_NLoginCore_121_a;
    }

    @Nullable
    public static NLoginCore_121 com_nickuc_login_NLoginCore_121_a(int n) {
        NLoginCore_121[] NLoginCore_121Array = NLoginCore_121.values();
        int n2 = NLoginCore_121Array.length;
        for (int i = var_int_d; i < n2; ++i) {
            NLoginCore_121 NLoginCore_1212 = NLoginCore_121Array[i];
            if (n != NLoginCore_1212.var_int_k) continue;
            return NLoginCore_1212;
        }
        return null;
    }

    private NLoginCore_121(int n2, String string2, boolean bl, NLoginInterface_019<?> NLoginInterface_0192, NLoginInterface_019<?> ... NLoginInterface_019Array) {
        this.var_int_k = n2;
        this.var_boolean_t = bl;
        this.var_com_nickuc_login_NLoginCore_121_a = NLoginInterface_0192;
        this.var_com_nickuc_login_NLoginCore_121_a = NLoginInterface_019Array;
        Class[] classArray = (Class[])Arrays.stream(NLoginInterface_019Array).map(NLoginInterface_019::a).toArray(Class[]::new);
        try {
            this.var_java_lang_reflect_Method_a = nLoginAPI.class.getMethod(string2, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
    }

    private static String a(int n, long l) {
        l ^= 0xAL;
        l ^= 0x2F1411FAFC7AD6B1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), 69, (byte)(25 + 58), (byte)(15 + 32), (byte)(8 + 59), (byte)(58 + 8), (byte)(43 + 24), 47, (byte)(34 + 46), (byte)(62 + 13), (byte)(28 + 39), (byte)(16 + 67), (byte)(37 + 16), (byte)(19 + 61), (byte)(21 + 76), (byte)(34 + 66), (byte)(12 + 88), (byte)(3 + 102), (byte)(25 + 85), (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.D("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғࠠ࠭ࠚࠡࠑࠤࠢࠢ࠮", (byte)53, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_121.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(0);
        var_int_e = (0 >>> 137 | 0 << -137) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(0x70000000);
        var_int_g = 0 >>> 136 | 0 << ~136 + 1;
        var_int_h = 0x10000000 >>> 252 | 0x10000000 << -252;
        var_int_i = Integer.reverse(0x40000000);
        var_int_j = Integer.reverse(-1073741824);
        var_int_l = (64 >>> 68 | 64 << -68) & 0xFFFFFFFF;
        var_int_m = Integer.reverse(-1610612736);
        var_int_n = (24 >>> 66 | 24 << ~66 + 1) & 0xFFFFFFFF;
        o = (28672 >>> 44 | 28672 << ~44 + 1) & 0xFFFFFFFF;
        p = (2048 >>> 72 | 2048 << -72) & 0xFFFFFFFF;
        q = (-2147483644 >>> 159 | -2147483644 << ~159 + 1) & 0xFFFFFFFF;
        r = (0x50000000 >>> 251 | 0x50000000 << ~251 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(-805306368);
        var_int_t = Integer.reverse(0x30000000);
        u = Integer.reverse(-1342177280);
        v = Integer.reverse(0x38000000);
        w = (14 >>> 95 | 14 << ~95 + 1) & 0xFFFFFFFF;
        x = 0 >>> 246 | 0 << -246;
        y = (-1 >>> 58 | -1 << ~58 + 1) & 0xFFFFFFFF;
        z = Long.reverse(1372661448372655613L);
        aa = 0 >>> 113 | 0 << ~113 + 1;
        ab = Integer.reverse(0);
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = Long.reverse(1372661448372655613L);
        ae = Integer.reverse(0);
        af = Integer.reverse(0x40000000);
        ag = Long.reverse(1372661448372655613L);
        ah = (524288 >>> 147 | 524288 << -147) & 0xFFFFFFFF;
        ai = 0x4000000 >>> 250 | 0x4000000 << -250;
        aj = 96 >>> 133 | 96 << ~133 + 1;
        ak = Integer.reverse(-1);
        al = Long.reverse(1372661448372655613L);
        am = (0x20000000 >>> 221 | 0x20000000 << ~221 + 1) & 0xFFFFFFFF;
        an = Integer.reverse(Integer.MIN_VALUE);
        ao = Integer.reverse(0);
        ap = Integer.reverse(0x20000000);
        aq = Long.reverse(4831425962193196541L);
        ar = Long.reverse(0x5000000000000000L);
        as = 0x1000000 >>> 23 | 0x1000000 << ~23 + 1;
        at = (262144 >>> 145 | 262144 << ~145 + 1) & 0xFFFFFFFF;
        au = (0x5000000 >>> 248 | 0x5000000 << -248) & 0xFFFFFFFF;
        av = -1 >>> 75 | -1 << ~75 + 1;
        aw = Long.reverse(1372661448372655613L);
        ax = Integer.reverse(Integer.MIN_VALUE);
        ay = Integer.reverse(0);
        az = Integer.reverse(0x60000000);
        ba = Long.reverse(4831425962193196541L);
        bb = Long.reverse(0x5000000000000000L);
        bc = 0x600000 >>> 85 | 0x600000 << ~85 + 1;
        bd = Integer.reverse(-1342177280);
        be = (224 >>> 133 | 224 << ~133 + 1) & 0xFFFFFFFF;
        bf = Long.reverse(4831425962193196541L);
        bg = Long.reverse(0x5000000000000000L);
        bh = Integer.reverse(0);
        bi = Integer.reverse(0x10000000);
        bj = Long.reverse(4831425962193196541L);
        bk = Long.reverse(0x5000000000000000L);
        bl = Integer.reverse(0x20000000);
        bm = Integer.reverse(-1073741824);
        bn = Integer.reverse(-1879048192);
        bo = Long.reverse(4831425962193196541L);
        bp = Long.reverse(0x5000000000000000L);
        bq = Integer.reverse(Integer.MIN_VALUE);
        br = 0 >>> 188 | 0 << -188;
        bs = (0x5000000 >>> 119 | 0x5000000 << -119) & 0xFFFFFFFF;
        bt = -1 >>> 86 | -1 << ~86 + 1;
        bu = Long.reverse(1372661448372655613L);
        bv = Integer.reverse(-1610612736);
        bw = (0x400000 >>> 84 | 0x400000 << ~84 + 1) & 0xFFFFFFFF;
        bx = (704 >>> 38 | 704 << ~38 + 1) & 0xFFFFFFFF;
        by = Long.reverse(4831425962193196541L);
        bz = Long.reverse(0x5000000000000000L);
        ca = (8192 >>> 141 | 8192 << ~141 + 1) & 0xFFFFFFFF;
        cb = 0 >>> 171 | 0 << ~171 + 1;
        cc = Integer.reverse(0x30000000);
        cd = Long.reverse(4831425962193196541L);
        ce = Long.reverse(0x5000000000000000L);
        cf = 12 >>> 97 | 12 << ~97 + 1;
        cg = Integer.reverse(-1610612736);
        ch = 52 >>> 2 | 52 << ~2 + 1;
        ci = Long.reverse(4831425962193196541L);
        cj = Long.reverse(0x5000000000000000L);
        ck = (0x800000 >>> 118 | 0x800000 << ~118 + 1) & 0xFFFFFFFF;
        cl = (0 >>> 225 | 0 << ~225 + 1) & 0xFFFFFFFF;
        cm = (512 >>> 233 | 512 << ~233 + 1) & 0xFFFFFFFF;
        cn = Integer.reverse(0x70000000);
        co = Long.reverse(4831425962193196541L);
        cp = Long.reverse(0x5000000000000000L);
        cq = (0x38000000 >>> 155 | 0x38000000 << ~155 + 1) & 0xFFFFFFFF;
        cr = Integer.reverse(0x60000000);
        cs = Integer.reverse(-268435456);
        ct = Long.reverse(1372661448372655613L);
        cu = -1073741824 >>> 190 | -1073741824 << -190;
        cv = 0 >>> 163 | 0 << -163;
        cw = Integer.reverse(Integer.MIN_VALUE);
        cx = Integer.reverse(0x40000000);
        cy = 0x10000000 >>> 184 | 0x10000000 << -184;
        cz = Long.reverse(1372661448372655613L);
        da = Integer.MIN_VALUE >>> 220 | Integer.MIN_VALUE << -220;
        db = (1792 >>> 232 | 1792 << ~232 + 1) & 0xFFFFFFFF;
        dc = Integer.reverse(-2013265920);
        dd = Integer.reverse(-1);
        de = Long.reverse(1372661448372655613L);
        df = (65536 >>> 208 | 65536 << -208) & 0xFFFFFFFF;
        dg = (0 >>> 61 | 0 << -61) & 0xFFFFFFFF;
        dh = Integer.reverse(0x48000000);
        di = -1 >>> 139 | -1 << -139;
        dj = Long.reverse(1372661448372655613L);
        dk = (9216 >>> 234 | 9216 << ~234 + 1) & 0xFFFFFFFF;
        dl = 0x20000000 >>> 218 | 0x20000000 << -218;
        dm = Integer.reverse(-939524096);
        dn = Integer.reverse(-1);
        cfr_renamed_1 = Long.reverse(1372661448372655613L);
        dp = (524288 >>> 114 | 524288 << -114) & 0xFFFFFFFF;
        dq = (0 >>> 65 | 0 << -65) & 0xFFFFFFFF;
        dr = (0x40000000 >>> 254 | 0x40000000 << ~254 + 1) & 0xFFFFFFFF;
        ds = 40960 >>> 235 | 40960 << -235;
        dt = -1 >>> 121 | -1 << ~121 + 1;
        du = Long.reverse(1372661448372655613L);
        dv = 0x2800000 >>> 150 | 0x2800000 << -150;
        dw = (576 >>> 6 | 576 << ~6 + 1) & 0xFFFFFFFF;
        dx = Integer.reverse(-1476395008);
        dy = Long.reverse(4831425962193196541L);
        dz = Long.reverse(0x5000000000000000L);
        ea = (0x800000 >>> 54 | 0x800000 << ~54 + 1) & 0xFFFFFFFF;
        eb = 0 >>> 229 | 0 << ~229 + 1;
        ec = 2 >>> 129 | 2 << -129;
        ed = (176 >>> 3 | 176 << ~3 + 1) & 0xFFFFFFFF;
        ee = Long.reverse(4831425962193196541L);
        ef = Long.reverse(0x5000000000000000L);
        eg = Integer.reverse(-805306368);
        eh = Integer.reverse(0x50000000);
        ei = Integer.reverse(-402653184);
        ej = Long.reverse(1372661448372655613L);
        ek = (2 >>> 160 | 2 << -160) & 0xFFFFFFFF;
        el = (0 >>> 207 | 0 << -207) & 0xFFFFFFFF;
        em = (64 >>> 134 | 64 << -134) & 0xFFFFFFFF;
        en = Integer.reverse(0x18000000);
        eo = Long.reverse(1372661448372655613L);
        ep = Integer.reverse(0x30000000);
        eq = (196608 >>> 238 | 196608 << -238) & 0xFFFFFFFF;
        er = Integer.reverse(-1744830464);
        es = Long.reverse(4831425962193196541L);
        et = Long.reverse(0x5000000000000000L);
        eu = Integer.reverse(0x40000000);
        ev = (0 >>> 214 | 0 << -214) & 0xFFFFFFFF;
        ew = 524288 >>> 211 | 524288 << ~211 + 1;
        ex = 0xD00000 >>> 19 | 0xD00000 << ~19 + 1;
        ey = Long.reverse(4831425962193196541L);
        ez = Long.reverse(0x5000000000000000L);
        fa = -2147483642 >>> 191 | -2147483642 << ~191 + 1;
        fb = 44 >>> 130 | 44 << ~130 + 1;
        fc = Integer.reverse(-671088640);
        fd = Long.reverse(4831425962193196541L);
        fe = Long.reverse(0x5000000000000000L);
        ff = Integer.reverse(0x40000000);
        fg = Integer.reverse(0);
        fh = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[v];
        var_java_lang_String_arr_b = new String[w];
        NLoginCore_121.void_b();
        var_com_nickuc_login_NLoginCore_121_a = new NLoginCore_121(ab, (String)NLoginCore_121.c("㺃", (int)ac, (long)ad), NLoginType_028.var_com_nickuc_login_NLoginType_028_a, new NLoginInterface_019[ae]);
        NLoginInterface_019[] NLoginInterface_019Array = new NLoginInterface_019[an];
        NLoginInterface_019Array[NLoginCore_121.ao] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        var_com_nickuc_login_NLoginCore_121_b = new NLoginCore_121(ai, (String)NLoginCore_121.c("㺉", (int)(aj & ak), (long)al), am != 0, NLoginType_003.var_com_nickuc_login_NLoginType_003_a, NLoginInterface_019Array);
        NLoginInterface_019[] NLoginInterface_019Array2 = new NLoginInterface_019[ax];
        NLoginInterface_019Array2[NLoginCore_121.ay] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_c = new NLoginCore_121(at, (String)NLoginCore_121.c("㺏", (int)(au & av), (long)aw), NLoginCore_125.var_com_nickuc_login_NLoginCore_125_a, NLoginInterface_019Array2);
        var_com_nickuc_login_NLoginCore_121_d = new NLoginCore_121(bd, (String)NLoginCore_121.c("㺕", (int)be, (long)(bf ^ bg)), (NLoginInterface_019<?>)((Object)NLoginCore_028.var_java_lang_Class____b), new NLoginInterface_019[bh]);
        NLoginInterface_019[] NLoginInterface_019Array3 = new NLoginInterface_019[bq];
        NLoginInterface_019Array3[NLoginCore_121.br] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        var_com_nickuc_login_NLoginCore_121_e = new NLoginCore_121(bm, (String)NLoginCore_121.c("㺛", (int)bn, (long)(bo ^ bp)), (NLoginInterface_019<?>)((Object)NLoginCore_028.var_java_lang_Class____b), NLoginInterface_019Array3);
        NLoginInterface_019[] NLoginInterface_019Array4 = new NLoginInterface_019[ca];
        NLoginInterface_019Array4[NLoginCore_121.cb] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        var_com_nickuc_login_NLoginCore_121_f = new NLoginCore_121(bw, (String)NLoginCore_121.c("㺡", (int)bx, (long)(by ^ bz)), (NLoginInterface_019<?>)((Object)NLoginCore_028.var_java_lang_Class____b), NLoginInterface_019Array4);
        NLoginInterface_019[] NLoginInterface_019Array5 = new NLoginInterface_019[ck];
        NLoginInterface_019Array5[NLoginCore_121.cl] = NLoginType_003.var_com_nickuc_login_NLoginType_003_a;
        NLoginInterface_019Array5[NLoginCore_121.cm] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_g = new NLoginCore_121(cg, (String)NLoginCore_121.c("㺧", (int)ch, (long)(ci ^ cj)), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array5);
        NLoginInterface_019[] NLoginInterface_019Array6 = new NLoginInterface_019[cu];
        NLoginInterface_019Array6[NLoginCore_121.cv] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array6[NLoginCore_121.cw] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        NLoginInterface_019Array6[NLoginCore_121.cx] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_h = new NLoginCore_121(cr, (String)NLoginCore_121.c("㺭", (int)cs, (long)ct), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array6);
        NLoginInterface_019[] NLoginInterface_019Array7 = new NLoginInterface_019[df];
        NLoginInterface_019Array7[NLoginCore_121.dg] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        var_com_nickuc_login_NLoginCore_121_i = new NLoginCore_121(db, (String)NLoginCore_121.c("㺳", (int)(dc & dd), (long)de), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array7);
        NLoginInterface_019[] NLoginInterface_019Array8 = new NLoginInterface_019[dp];
        NLoginInterface_019Array8[NLoginCore_121.dq] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array8[NLoginCore_121.dr] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_j = new NLoginCore_121(dl, (String)NLoginCore_121.c("㺹", (int)(dm & dn), (long)cfr_renamed_1), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array8);
        NLoginInterface_019[] NLoginInterface_019Array9 = new NLoginInterface_019[ea];
        NLoginInterface_019Array9[NLoginCore_121.eb] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array9[NLoginCore_121.ec] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_k = new NLoginCore_121(dw, (String)NLoginCore_121.c("㺿", (int)dx, (long)(dy ^ dz)), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array9);
        NLoginInterface_019[] NLoginInterface_019Array10 = new NLoginInterface_019[ek];
        NLoginInterface_019Array10[NLoginCore_121.el] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array10[NLoginCore_121.em] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_Long__d;
        var_com_nickuc_login_NLoginCore_121_l = new NLoginCore_121(eh, (String)NLoginCore_121.c("㻅", (int)ei, (long)ej), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array10);
        NLoginInterface_019[] NLoginInterface_019Array11 = new NLoginInterface_019[eu];
        NLoginInterface_019Array11[NLoginCore_121.ev] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array11[NLoginCore_121.ew] = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a;
        var_com_nickuc_login_NLoginCore_121_m = new NLoginCore_121(eq, (String)NLoginCore_121.c("㻋", (int)er, (long)(es ^ et)), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array11);
        NLoginInterface_019[] NLoginInterface_019Array12 = new NLoginInterface_019[ff];
        NLoginInterface_019Array12[NLoginCore_121.fg] = NLoginCore_452.var_com_nickuc_login_NLoginCore_452_a;
        NLoginInterface_019Array12[NLoginCore_121.fh] = (NLoginInterface_019)NLoginCore_028.var_long_c;
        var_com_nickuc_login_NLoginCore_121_n = new NLoginCore_121(fb, (String)NLoginCore_121.c("㻑", (int)fc, (long)(fd ^ fe)), (NLoginInterface_019<?>)NLoginCore_028.var_long_c, NLoginInterface_019Array12);
        var_com_nickuc_login_NLoginCore_121_arr_a = NLoginCore_121.com_nickuc_login_NLoginCore_121_arr_a();
    }

    public static void load() {
        NLoginCore_121[] NLoginCore_121Array = NLoginCore_121.values();
        int n = NLoginCore_121Array.length;
        for (int i = var_int_e; i < n; ++i) {
            NLoginCore_121 NLoginCore_1212 = NLoginCore_121Array[i];
            NLoginCore_1212.p();
        }
    }
}

