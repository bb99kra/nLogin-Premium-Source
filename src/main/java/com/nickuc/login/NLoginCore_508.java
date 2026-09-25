/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_014;
import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
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
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_075;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_508
extends Enum<NLoginCore_508>
implements NLoginInterface_014 {
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_a;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_b;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_c;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_d;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_e;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_f;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_g;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_h;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_i;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_j;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_k;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_l;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_m;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_n;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_o;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_p;
    public static final /* enum */ NLoginCore_508 var_com_nickuc_login_NLoginCore_508_q;
    private static final NLoginCore_075 var_com_nickuc_login_NLoginCore_075_a;
    final NLoginCore_474 var_com_nickuc_login_NLoginCore_474_g;
    public final boolean aK;
    private static final /* synthetic */ NLoginCore_508[] var_com_nickuc_login_NLoginCore_508_arr_a;
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
    private static long var_long_i;
    private static int var_int_j;
    private static int var_int_k;
    private static int var_int_l;
    private static int var_int_m;
    private static int var_int_n;
    private static int var_int_o;
    private static int var_int_p;
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
    private static long ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static long ak;
    private static int al;
    private static long am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static long as;
    private static int at;
    private static long au;
    private static long av;
    private static int aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static int bb;
    private static int bc;
    private static long bd;
    private static int be;
    private static int bf;
    private static int bg;
    private static int bh;
    private static int bi;
    private static long bj;
    private static int bk;
    private static long bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bq;
    private static long br;
    private static int bs;
    private static int bt;
    private static long bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static int by;
    private static long bz;
    private static long ca;
    private static int cb;
    private static int cc;
    private static long cd;
    private static int ce;
    private static int cf;
    private static int cg;
    private static int ch;
    private static long ci;
    private static long cj;
    private static int ck;
    private static long cl;
    private static long cm;
    private static int cn;
    private static int co;
    private static int cp;
    private static int cq;
    private static long cr;
    private static long cs;
    private static int ct;
    private static long cu;
    private static int cv;
    private static int cw;
    private static int cx;
    private static int cy;
    private static long cz;
    private static long da;
    private static int db;
    private static int dc;
    private static long dd;
    private static int de;
    private static int df;
    private static int dg;
    private static int dh;
    private static long di;
    private static long dj;
    private static int dk;
    private static long dl;
    private static long dm;
    private static int dn;
    private static int cfr_renamed_1;
    private static int dp;
    private static int dq;
    private static long dr;
    private static int ds;
    private static int dt;
    private static long du;
    private static int dv;
    private static int dw;
    private static int dx;
    private static int dy;
    private static int dz;
    private static long ea;
    private static int eb;
    private static int ec;
    private static long ed;
    private static int ee;
    private static int ef;
    private static int eg;
    private static int eh;
    private static long ei;
    private static int ej;
    private static int ek;
    private static int el;
    private static long em;
    private static int en;
    private static int eo;
    private static long ep;
    private static int eq;
    private static int er;
    private static int es;
    private static long et;
    private static int eu;
    private static int ev;
    private static int ew;
    private static long ex;
    private static int ey;
    private static int ez;
    private static int fa;
    private static long fb;
    private static int fc;
    private static int fd;
    private static int fe;
    private static long ff;
    private static int fg;
    private static int fh;
    private static long fi;
    private static int fj;
    private static int fk;
    private static long fl;
    private static long fm;
    private static int fn;
    private static int fo;
    private static long fp;
    private static int fq;

    @Override
    public int int_a() {
        return this.ordinal();
    }

    @Override
    public NLoginCore_208 com_nickuc_login_NLoginCore_208_a() {
        throw new UnsupportedOperationException();
    }

    @Generated
    private NLoginCore_508(NLoginCore_474 NLoginCore_474, boolean bl) {
        this.var_com_nickuc_login_NLoginCore_474_g = NLoginCore_474;
        this.aK = bl;
    }

    private static /* synthetic */ NLoginCore_508[] com_nickuc_login_NLoginCore_508_arr_a() {
        NLoginCore_508[] NLoginCore_508Array = new NLoginCore_508[var_int_j];
        NLoginCore_508Array[NLoginCore_508.var_int_k] = var_com_nickuc_login_NLoginCore_508_a;
        NLoginCore_508Array[NLoginCore_508.var_int_l] = var_com_nickuc_login_NLoginCore_508_b;
        NLoginCore_508Array[NLoginCore_508.var_int_m] = var_com_nickuc_login_NLoginCore_508_c;
        NLoginCore_508Array[NLoginCore_508.var_int_n] = var_com_nickuc_login_NLoginCore_508_d;
        NLoginCore_508Array[NLoginCore_508.var_int_o] = var_com_nickuc_login_NLoginCore_508_e;
        NLoginCore_508Array[NLoginCore_508.var_int_p] = var_com_nickuc_login_NLoginCore_508_f;
        NLoginCore_508Array[NLoginCore_508.var_int_q] = var_com_nickuc_login_NLoginCore_508_g;
        NLoginCore_508Array[NLoginCore_508.r] = var_com_nickuc_login_NLoginCore_508_h;
        NLoginCore_508Array[NLoginCore_508.s] = var_com_nickuc_login_NLoginCore_508_i;
        NLoginCore_508Array[NLoginCore_508.t] = var_com_nickuc_login_NLoginCore_508_j;
        NLoginCore_508Array[NLoginCore_508.u] = var_com_nickuc_login_NLoginCore_508_k;
        NLoginCore_508Array[NLoginCore_508.v] = var_com_nickuc_login_NLoginCore_508_l;
        NLoginCore_508Array[NLoginCore_508.w] = var_com_nickuc_login_NLoginCore_508_m;
        NLoginCore_508Array[NLoginCore_508.x] = var_com_nickuc_login_NLoginCore_508_n;
        NLoginCore_508Array[NLoginCore_508.y] = var_com_nickuc_login_NLoginCore_508_o;
        NLoginCore_508Array[NLoginCore_508.z] = var_com_nickuc_login_NLoginCore_508_p;
        NLoginCore_508Array[NLoginCore_508.aa] = var_com_nickuc_login_NLoginCore_508_q;
        return NLoginCore_508Array;
    }

    public static NLoginCore_508 valueOf(String string) {
        return Enum.valueOf(NLoginCore_508.class, string);
    }

    private static void b() {
        int n;
        var_long_c = -4397338019693907099L;
        long l = var_long_c ^ 0x2C347B949A924209L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(18 + 51), (byte)(78 + 5), (byte)(5 + 42), (byte)(5 + 62), (byte)(18 + 48), (byte)(30 + 37), 47, (byte)(9 + 71), (byte)(62 + 13), 67, (byte)(27 + 56), (byte)(46 + 7), (byte)(65 + 15), (byte)(69 + 28), (byte)(88 + 12), (byte)(57 + 43), (byte)(72 + 33), (byte)(95 + 15), (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_508.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ԼՑԵ՟ՔՎճս՘քսՐ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ƕƪƎƸƭƧǌǖƱǝǖƩ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[2] = NLoginCore_076.F("՞֧֗֞֋՝վ֎տְ֊ְ֩ս։ֹ֪֮֔֙֯ջմ֪շ֊֑։֖֕׀ֲ", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[3] = NLoginCore_138.B("ƹƼǚưƶƲƟƫǎƸǀǜǧƣƞǢǛǤǋƣǦǭƴƵ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ԹւղչզԸՙթ՚֋ենջևՍՂզՋխ֌֎։֎֑կ֌պ՗ին։ռ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ƷǖǘƓǆǈǖǖǜƷƽǗƵƴǃƣƵǅƻƦƤǭƴƵ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[6] = NLoginCore_004.C("ռ՛ր՚ՙՄոէթՒջքբՉ՘ըսջղՊ֓֌Ֆփ֍խ֋Վ֎ծ֠֟", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[7] = NLoginCore_324.B("ǋƦǚǗƲǖƫƻƳƶƲƞǔƻǀǉǄƵƩǊǖǭƴƵ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[8] = NLoginCore_076.C("ռ՛ր՚ՙՄոէթՒջմՕ։իֆլս֏ղ՟գւ֌Ջփփ֚՛Ք֓՞", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[9] = NLoginCore_201.C("ՖԿւվջյցՙֆշճ֋՚՘Տձ՞օե֑Ւ֔՛՜", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[10] = NLoginCore_324.A("ǙƥƪƵǉǝƝưƔƬƬǖǃǞǅƻǄƳƾǉƭǫƨƩǳưǋǐǂǮǦǎƷǈǙǳǔǴǀǪǓǃƿǉ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[11] = NLoginCore_110.F("֦ցգռ֝֓֫եեէք֝֫֝փִ֮֝֟ևփ֍֍չ֏֛֒ս֔֓֐ַ", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[12] = NLoginCore_427.A("ƑƑƗƕưǒǓǢƠǔǢƿǗǧƱǁƳǠǆǡǫƬǉǂǱǋƯǊƴǥǂǡ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[13] = NLoginCore_138.B("ƔǗƭǝǒǜƜǐǚƻƛǆƾǀǡǀǗƣǙƤǜǇƴƵ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[14] = NLoginCore_201.E("՝՝գառ֮֞֟լֱ֠֟֌ֲց֋֮ւճօպֺ֮֐ֺ֑֙վ֐ׁ֒վցָր׆ִ׋֥֗րא֨֕", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[15] = NLoginCore_324.C("ԻվՔքչփՃշցբՂ։ՌՆխ֋ՠլ֓սրՐՠլխֈ֕ճծոժը", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[16] = NLoginCore_223.F("՜ՙջջռե֋շնևְֳ֥֏ֲտְֳ֙կֵ֖֛֯֋֠ր֕րֹ֏ֲֿևֆֳַׅ֢ք׉֟֋֕", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[17] = NLoginCore_004.E("՟ճջ֗նմ֗֙֎ո֤վկ֜տ֢֒ևֶַֺ֥֮֨֨֫վ֍ׂ֛֌֣", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[18] = NLoginCore_559.A("ǙǖǘǙƶǚƝƙƘƢƬǐǝǁǔǨǪǃƢǈǙǘǑǥƩǪǢǉưƭǫǇ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[19] = NLoginCore_387.A("ǋǑƶƷǙƺǁƗǍƟǂƹǐǙƿǇǗǊǪƷǬǭƴƵ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[20] = NLoginCore_091.B("ǖǊǊƨƼǙƷƱƷƶǒƴƯƝǚƢǦƧǢǖǪǯǬǉǈǈǈǓǭǉǈƯ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[21] = NLoginCore_559.E("֚֔մփնն֧֪֪֚֙֝և֛֧֭ցֱ֫֊ְփրց", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[22] = NLoginCore_223.B("ƒǛǋǒƿƑƲǂƳǤƿƶƾǒƱƟƠƹǙǥǧǪǰǥƻƾƼǉǰǭƳǮ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[23] = NLoginCore_324.F("ռ֥֝֡ժ֧֚։֥թհչցճ֌֭֒֨֘֙֏փրց", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[24] = NLoginCore_027.B("ǙǖǘǙƶǚƝƙƘƢƮǖƤƣǥƿƤƻǔƶǗǜǠƾƬǭǆǅǖǕǓǚ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[25] = NLoginCore_027.C("ՁԹ՜՝ՓմՆգէՔվէՇլ֐ծըխծէգՌմգՑՓպյ֝ծ֝ՠ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[26] = NLoginCore_453.E("շրվ֛֪֢֙֘֫֏֤֥֫֠ֆ֧֋ծ֬֏ְָ֣֭շ֚պֹּ֔ւրָ֢֙֡֗׆ֽ֪֕֘׆֕", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[27] = NLoginCore_091.D("՛ՐծկՎՑՙոՉՕ֋ցնՅՉչծբռՊ֋ՕիՖ֋֕Ֆ֛֚֙կջ", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[28] = NLoginCore_324.E("տ֛֒չ֤֟չ֛֠֡ր֯֨ծ֤֯ֈ֣րֵֵ֓րց", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[29] = NLoginCore_110.D("Ցշ՞ր՜ՂնփփաՖլըշ՛ևՑֆկի֎ց֔թխ֘Օ֓ձ֔֍ն", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[30] = NLoginCore_076.C("ճձԼօ՛աբհմն՞ՌլպՇ՘օՉմ֏ՏՖցՓ֌կ֘֙շտ֘։", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[31] = NLoginCore_223.E("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔֐ֳ֛֧֯ջִ־սֶׁ֖փ", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[32] = NLoginCore_201.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƩǏǜǚǲƪǶǑǴǠǒ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[33] = NLoginCore_110.E("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔֐ֳ֤չֲֶֽ֦֋ָׂ֑ւ", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[34] = NLoginCore_223.D("ճձԼօ՛աբհմն՞ՌլպՇ՘օՉմ֏Տ֗ընխև֚֌֋֞ո֒", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[35] = NLoginCore_092.C("պվՂՍնպԹՂ՘պ՘քօչբչ֐ռս՟օկ֘յ֓֗չ֝֝ճ՚֚", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[36] = NLoginCore_324.B("ƚǊƸǓǈƑǒǝǌǡǔƵƠƺǈǂǫǛǆǇƺƧǝǥǮǔǉǢǬǘƱǊ", (byte)113, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_508.var_java_lang_String_arr_b[0] = NLoginCore_453.F("դ֧֕֙֙ի֮֞֩ծէվ֎֭ծִ֦֑֭֔ֈ֓րց", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[1] = NLoginCore_559.A("ƢƸǄǕǞǖƲǌǖƝƹƺƲǔǀǤƴǇǟǫǩǭƴƵ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[2] = NLoginCore_004.E("՞֧֗֞֋՝վ֎տְ֊ְ֩ս։ֹ֪֮֔֙֯յ֒֏նֿ֝֌տׁ֤֫", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[3] = NLoginCore_027.F("օֈ֦ռւվիշ֚ք֏֌և֔վօ֦֩ձִֹ֯րց", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ƒǛǋǒƿƑƲǂƳǤƾǏǔǠƦƛƿƤǆǥǧǡƦǂǥǭƭưǢǳǴǋƴƺǄǾǆǮǼǘǁǠǲǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[5] = NLoginCore_004.E("փ֢֤՟֢֢֒֔֨փ֋֜ժսցօ֪֋ոְմִֵ֓֕֒֓֏ֳֵ֤֝", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ǕƴǙƳƲƝǑǀǂƫǔǝƻƢƱǁǖǔǋƣǬǟƾƻƺǈǐǉƵǉǏǰ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[7] = NLoginCore_091.B("ǋƦǚǗƲǖƫƻƳƶưƗƦǧƷƣƽƳǧǃǅǝƴƵ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[8] = NLoginCore_575.E("֡ր֥տվթ֝֌֎շ֠֙պ֮֐ִ֑֢֫֗քևքկ֩־֛֋ֳֽׂ֖֟ս֥֤׆֢֬֞րֺ֧֕", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[9] = NLoginCore_138.D("ՖԿւվջյցՙֆշլջսը֐ցֆ՜առձՠ֒չւո֋Օձ։֞ր", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[10] = NLoginCore_076.B("ǙƥƪƵǉǝƝưƔƬƬǖǃǞǅƻǄƳƾǉƭǫƨƩǳưǋǐǂǮǦǎƴƺǄǪǵƽƷȁƽȂǐǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[11] = NLoginCore_076.D("ց՜Ծ՗ոծֆՀՀՂ՟ոֆո՞ո֏պ։բ՞թճաբՑՑթ֚ն՗ը", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[12] = NLoginCore_559.B("ƑƑƗƕưǒǓǢƠǔǢƿǗǧƱǁƳǠǆǡǫǭƺưǄǥǮƧǰƴǉǺ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[13] = NLoginCore_004.F("ՠ֣չ֩֞֨ը֦֜ևժ֤֯ջֱծ֏ָց֒֒֎ֈ־֨֏֠֍ֶվֿ֟", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[14] = NLoginCore_138.E("՝՝գառ֮֞֟լֱ֠֟֌ֲց֋֮ւճօպֺ֮֐ֺ֑֙վ֐ׁ֒վ֐ֲׇ֢֦֞׌ֺ֋׏֏֕", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[15] = NLoginCore_091.A("ƔǗƭǝǒǜƜǐǚƻƛǢƥƟǆǤƹǅǬǖǙơǤǉƽǰǍǕƯƮƵǌ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[16] = NLoginCore_223.C("ԷԴՖՖ՗ՀզՒՑբ֋ր֎ժ֍՚֎֋մՊձն֐֊զջ՛հ՛֔ժ֍սոխՠա֏֘֐֢ըժհ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[17] = NLoginCore_559.B("ƓƧƯǋƪƨǋǍǂƬǘƲƣǐƳǖǆƻǙǪǜƫǊǌƩǱǉǊǰǠǇǬ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[18] = NLoginCore_091.D("րստր՝ցՄՀԿՉՓշքըջ֏֑ժՉկրձ֌Վքծ՚։Փծ֚տ", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[19] = NLoginCore_004.D("ղո՝՞րաըԾմՆժՃ֎ՙկ֌գժՊ֋ւՌ֓կըկփՔ՗֘Ֆ֒", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[20] = NLoginCore_575.F("֢֖֖մֈ֥փսփւ֞րջթ֦ծֲճֶ֢֮ո֫ջֱַ֮֕֯ց֯֒", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[21] = NLoginCore_384.E("֚֔մփնն֧֪֚֭֙օևձճօֳ֧֡֏օִ֥֧֚վְִּ֪֣֝", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[22] = NLoginCore_076.B("ƒǛǋǒƿƑƲǂƳǤƿƶƾǒƱƟƠƹǙǥǧǣǃƧǩǇƾǪǅǏƷǖ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[23] = NLoginCore_427.A("ưǑǕǙƞǎǛƽǙƝƤƻǥǛǣǗƲơǩƨǪƦƽƪǋǲǧǑǳǁǰǕ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[24] = NLoginCore_575.C("րստր՝ցՄՀԿՉՕսՋՊ֌զՋբջ՝վկժւ֘֊ղլշ֌՝տթձ֘ծ֐֠ւճ֚ՠզհ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[25] = NLoginCore_201.C("ՁԹ՜՝ՓմՆգէՔվէՇլ֐ծըխծէգՕւ֕֕։եթլթնծ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[26] = NLoginCore_173.E("շրվ֛֪֢֙֘֫֏֤֥֫֠ֆ֧֋ծ֬֏ְָ֣֭շ֚պֹּ֔ւրָևօִֶ֫վ֫֎֣֬֕", (byte)113, 69);
                    NLoginCore_508.var_java_lang_String_arr_b[27] = NLoginCore_384.D("՛ՐծկՎՑՙոՉՕ֋ցնՅՉչծբռՊ֋֖ՉՊքՓո֏՛յ֓ց", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[28] = NLoginCore_223.D("՚խնՔպտՔջռն՝ժֆլՎբ֐Պացէ՟֓֋յօ֚ը֏խ֠ծ", (byte)113, 68);
                    NLoginCore_508.var_java_lang_String_arr_b[29] = NLoginCore_004.B("ƪǐƷǙƵƛǏǜǜƺƯǅǁǐƴǠƪǟǈǄǧǏǋǜǚǢǐǉƨǸǕǗƵƸǳǉǋǼǮǟǷǹƻǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[30] = NLoginCore_575.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƬǁǧǀǪǲƽǗǇǃǐǵǮǌǚǒǝǚǜȁǝǐǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[31] = NLoginCore_027.A("ƪǐƷǙƵƛǏǜǜƺƯǅǁǐƴǠƪǟǈǄǧǇǄƩǉƮǄǕǩǶǄƱǨǊƸǾǔǘǬǾǞǾǶǉ", (byte)113, 65);
                    NLoginCore_508.var_java_lang_String_arr_b[32] = NLoginCore_384.B("ǌǊƕǞƴƺƻǉǍǏƷƥǅǓƠƱǞƢǍǨƨƦǨǪƫǬǯǏǷǄƳǱƺƱǇǎǑǐǖǭǭǏǮǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[33] = NLoginCore_092.F("ն֜փ֥ցէ֛֨֨ֆջ֑֍֜ր֬ն֫֔֐ֳֵ֗֏յ֛֮֕պ֔־ֿ֚֝տտֶָּ֛֦ֆ׆֕", (byte)113, 70);
                    NLoginCore_508.var_java_lang_String_arr_b[34] = NLoginCore_138.C("ճձԼօ՛աբհմն՞ՌլպՇ՘օՉմ֏ՏՎ֏֓յպշ՚Օ֋մ֑֕֏՚ճծ֏֢պմֆ֋հ", (byte)113, 67);
                    NLoginCore_508.var_java_lang_String_arr_b[35] = NLoginCore_138.B("ǓǗƛƦǏǓƒƛƱǓƱǝǞǒƻǒǩǕǖƸǞǈƭǈǥƿǏǣǍǐǪǇǅǶǅǴƺǘǍǬǽǭǺǉ", (byte)113, 66);
                    NLoginCore_508.var_java_lang_String_arr_b[36] = NLoginCore_223.A("ƚǊƸǓǈƑǒǝǌǡǔƵƠƺǈǂǫǛǆǇƺƩƯǉƩƾǰǧǄǐǯǇ", (byte)113, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_508.var_java_lang_String_arr_b[0] = NLoginCore_027.D("՘Տսռ՟՛Ձպա՜ՆՕՄՈծ֋ըռձ֏֐ծ՛՜", (byte)113, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_508.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ձռ՛չձ՟ԿԿԻշքևթՊ՜ևջբ֏յէ֔՛՜", (byte)113, 68);
                }
            }
        }
    }

    private NLoginCore_508(String string2, boolean bl) {
        String[] stringArray = new String[var_int_b];
        stringArray[NLoginCore_508.var_int_c] = (String)NLoginCore_508.c("㺀", (int)var_int_d, (long)(var_long_e ^ var_long_f)) + string2;
        this.var_com_nickuc_login_NLoginCore_474_g = NLoginCore_474.a(stringArray);
        this.aK = bl;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 1024 >>> 74 | 1024 << ~74 + 1;
        var_int_c = (0 >>> 219 | 0 << ~219 + 1) & 0xFFFFFFFF;
        var_int_d = 0 >>> 102 | 0 << -102;
        var_long_e = Long.reverse(-6427539086082203837L);
        var_long_f = Long.reverse(-8646911284551352320L);
        var_int_g = (8 >>> 131 | 8 << -131) & 0xFFFFFFFF;
        var_long_h = Long.reverse(-6427539086082203837L);
        var_long_i = Long.reverse(-8646911284551352320L);
        var_int_j = Integer.reverse(-2013265920);
        var_int_k = (0 >>> 69 | 0 << ~69 + 1) & 0xFFFFFFFF;
        var_int_l = (256 >>> 200 | 256 << -200) & 0xFFFFFFFF;
        var_int_m = (0x40000000 >>> 253 | 0x40000000 << ~253 + 1) & 0xFFFFFFFF;
        var_int_n = 6144 >>> 75 | 6144 << -75;
        var_int_o = 4 >>> 224 | 4 << ~224 + 1;
        var_int_p = (10240 >>> 139 | 10240 << ~139 + 1) & 0xFFFFFFFF;
        var_int_q = (12 >>> 225 | 12 << -225) & 0xFFFFFFFF;
        r = 7168 >>> 170 | 7168 << -170;
        s = Integer.reverse(0x10000000);
        t = Integer.reverse(-1879048192);
        u = Integer.reverse(0x50000000);
        v = 704 >>> 198 | 704 << ~198 + 1;
        w = 12 >>> 32 | 12 << -32;
        x = (52 >>> 130 | 52 << ~130 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(0x70000000);
        z = (245760 >>> 78 | 245760 << -78) & 0xFFFFFFFF;
        aa = 0x100000 >>> 208 | 0x100000 << ~208 + 1;
        ab = Integer.reverse(-1543503872);
        ac = Integer.reverse(-1543503872);
        ad = 64 >>> 5 | 64 << ~5 + 1;
        ae = Long.reverse(3372293703075995459L);
        af = Integer.reverse(0);
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = (0 >>> 188 | 0 << ~188 + 1) & 0xFFFFFFFF;
        ai = 196608 >>> 112 | 196608 << ~112 + 1;
        aj = Integer.reverse(-1);
        ak = Long.reverse(3372293703075995459L);
        al = (0x10000000 >>> 218 | 0x10000000 << ~218 + 1) & 0xFFFFFFFF;
        am = Long.reverse(3372293703075995459L);
        an = 32 >>> 165 | 32 << ~165 + 1;
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = Integer.reverse(0);
        aq = Integer.reverse(-1610612736);
        ar = -1 >>> 43 | -1 << -43;
        as = Long.reverse(3372293703075995459L);
        at = Integer.reverse(0x60000000);
        au = Long.reverse(-6427539086082203837L);
        av = Long.reverse(-8646911284551352320L);
        aw = Integer.reverse(0x40000000);
        ax = (131072 >>> 113 | 131072 << ~113 + 1) & 0xFFFFFFFF;
        ay = Integer.reverse(0);
        az = (-536870912 >>> 221 | -536870912 << -221) & 0xFFFFFFFF;
        ba = Long.reverse(3372293703075995459L);
        bb = 0x400000 >>> 243 | 0x400000 << ~243 + 1;
        bc = -1 >>> 39 | -1 << -39;
        bd = Long.reverse(3372293703075995459L);
        be = (96 >>> 229 | 96 << ~229 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = Integer.reverse(0);
        bh = Integer.reverse(-1879048192);
        bi = Integer.reverse(-1);
        bj = Long.reverse(3372293703075995459L);
        bk = 2560 >>> 40 | 2560 << -40;
        bl = Long.reverse(3372293703075995459L);
        bm = (0x1000000 >>> 118 | 0x1000000 << ~118 + 1) & 0xFFFFFFFF;
        bn = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
        bo = 0 >>> 25 | 0 << ~25 + 1;
        bp = 0x16000000 >>> 153 | 0x16000000 << -153;
        bq = Integer.reverse(-1);
        br = Long.reverse(3372293703075995459L);
        bs = 384 >>> 37 | 384 << -37;
        bt = -1 >>> 103 | -1 << ~103 + 1;
        bu = Long.reverse(3372293703075995459L);
        bv = Integer.reverse(-1610612736);
        bw = (65536 >>> 240 | 65536 << ~240 + 1) & 0xFFFFFFFF;
        bx = Integer.reverse(0);
        by = Integer.reverse(-1342177280);
        bz = Long.reverse(-6427539086082203837L);
        ca = Long.reverse(-8646911284551352320L);
        cb = 0xE00000 >>> 116 | 0xE00000 << ~116 + 1;
        cc = Integer.reverse(-1);
        cd = Long.reverse(3372293703075995459L);
        ce = (3 >>> 127 | 3 << -127) & 0xFFFFFFFF;
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = (0 >>> 127 | 0 << -127) & 0xFFFFFFFF;
        ch = Integer.reverse(-268435456);
        ci = Long.reverse(-6427539086082203837L);
        cj = Long.reverse(-8646911284551352320L);
        ck = Integer.reverse(0x8000000);
        cl = Long.reverse(-6427539086082203837L);
        cm = Long.reverse(-8646911284551352320L);
        cn = Integer.reverse(-536870912);
        co = 4 >>> 130 | 4 << -130;
        cp = Integer.reverse(0);
        cq = Integer.reverse(-2013265920);
        cr = Long.reverse(-6427539086082203837L);
        cs = Long.reverse(-8646911284551352320L);
        ct = 0x480000 >>> 178 | 0x480000 << -178;
        cu = Long.reverse(3372293703075995459L);
        cv = 64 >>> 163 | 64 << -163;
        cw = (524288 >>> 179 | 524288 << ~179 + 1) & 0xFFFFFFFF;
        cx = Integer.reverse(0);
        cy = Integer.reverse(-939524096);
        cz = Long.reverse(-6427539086082203837L);
        da = Long.reverse(-8646911284551352320L);
        db = Integer.reverse(0x28000000);
        dc = Integer.reverse(-1);
        dd = Long.reverse(3372293703075995459L);
        de = Integer.reverse(-1879048192);
        df = 0x200000 >>> 181 | 0x200000 << ~181 + 1;
        dg = (0 >>> 212 | 0 << ~212 + 1) & 0xFFFFFFFF;
        dh = (43008 >>> 171 | 43008 << ~171 + 1) & 0xFFFFFFFF;
        di = Long.reverse(-6427539086082203837L);
        dj = Long.reverse(-8646911284551352320L);
        dk = Integer.reverse(0x68000000);
        dl = Long.reverse(-6427539086082203837L);
        dm = Long.reverse(-8646911284551352320L);
        dn = Integer.reverse(0x50000000);
        cfr_renamed_1 = (8 >>> 99 | 8 << ~99 + 1) & 0xFFFFFFFF;
        dp = Integer.reverse(0);
        dq = 184 >>> 3 | 184 << -3;
        dr = Long.reverse(3372293703075995459L);
        ds = Integer.reverse(0x18000000);
        dt = (-1 >>> 77 | -1 << -77) & 0xFFFFFFFF;
        du = Long.reverse(3372293703075995459L);
        dv = -1073741822 >>> 190 | -1073741822 << ~190 + 1;
        dw = 0x1000000 >>> 152 | 0x1000000 << ~152 + 1;
        dx = Integer.reverse(0);
        dy = Integer.reverse(-1744830464);
        dz = Integer.reverse(-1);
        ea = Long.reverse(3372293703075995459L);
        eb = Integer.reverse(0x58000000);
        ec = Integer.reverse(-1);
        ed = Long.reverse(3372293703075995459L);
        ee = 786432 >>> 80 | 786432 << -80;
        ef = Integer.reverse(0x40000000);
        eg = (0 >>> 156 | 0 << ~156 + 1) & 0xFFFFFFFF;
        eh = Integer.reverse(-671088640);
        ei = Long.reverse(3372293703075995459L);
        ej = (0x400000 >>> 182 | 0x400000 << -182) & 0xFFFFFFFF;
        ek = 224 >>> 227 | 224 << ~227 + 1;
        el = Integer.reverse(-1);
        em = Long.reverse(3372293703075995459L);
        en = Integer.reverse(-1207959552);
        eo = -1 >>> 76 | -1 << -76;
        ep = Long.reverse(3372293703075995459L);
        eq = Integer.reverse(-1342177280);
        er = (61440 >>> 139 | 61440 << ~139 + 1) & 0xFFFFFFFF;
        es = Integer.reverse(-1);
        et = Long.reverse(3372293703075995459L);
        eu = (0x10000000 >>> 220 | 0x10000000 << -220) & 0xFFFFFFFF;
        ev = Integer.reverse(-134217728);
        ew = Integer.reverse(-1);
        ex = Long.reverse(3372293703075995459L);
        ey = Integer.reverse(0x70000000);
        ez = (2048 >>> 70 | 2048 << ~70 + 1) & 0xFFFFFFFF;
        fa = Integer.reverse(-1);
        fb = Long.reverse(3372293703075995459L);
        fc = (4096 >>> 140 | 4096 << -140) & 0xFFFFFFFF;
        fd = Integer.reverse(-2080374784);
        fe = Integer.reverse(-1);
        ff = Long.reverse(3372293703075995459L);
        fg = Integer.reverse(-268435456);
        fh = Integer.reverse(0x44000000);
        fi = Long.reverse(3372293703075995459L);
        fj = Integer.reverse(Integer.MIN_VALUE);
        fk = Integer.reverse(-1006632960);
        fl = Long.reverse(-6427539086082203837L);
        fm = Long.reverse(-8646911284551352320L);
        fn = 64 >>> 34 | 64 << -34;
        fo = 0x480000 >>> 17 | 0x480000 << -17;
        fp = Long.reverse(3372293703075995459L);
        fq = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        NLoginCore_508.b();
        String[] stringArray = new String[ag];
        stringArray[NLoginCore_508.ah] = NLoginCore_508.c("㺃", (int)(ai & aj), (long)ak);
        var_com_nickuc_login_NLoginCore_508_a = new NLoginCore_508(stringArray);
        String[] stringArray2 = new String[ao];
        stringArray2[NLoginCore_508.ap] = NLoginCore_508.c("㺉", (int)(aq & ar), (long)as);
        var_com_nickuc_login_NLoginCore_508_b = new NLoginCore_508(stringArray2);
        String[] stringArray3 = new String[ax];
        stringArray3[NLoginCore_508.ay] = NLoginCore_508.c("㺏", (int)az, (long)ba);
        var_com_nickuc_login_NLoginCore_508_c = new NLoginCore_508(stringArray3);
        String[] stringArray4 = new String[bf];
        stringArray4[NLoginCore_508.bg] = NLoginCore_508.c("㺕", (int)(bh & bi), (long)bj);
        var_com_nickuc_login_NLoginCore_508_d = new NLoginCore_508(stringArray4);
        String[] stringArray5 = new String[bn];
        stringArray5[NLoginCore_508.bo] = NLoginCore_508.c("㺛", (int)(bp & bq), (long)br);
        var_com_nickuc_login_NLoginCore_508_e = new NLoginCore_508(stringArray5);
        String[] stringArray6 = new String[bw];
        stringArray6[NLoginCore_508.bx] = NLoginCore_508.c("㺡", (int)by, (long)(bz ^ ca));
        var_com_nickuc_login_NLoginCore_508_f = new NLoginCore_508(stringArray6);
        String[] stringArray7 = new String[cf];
        stringArray7[NLoginCore_508.cg] = NLoginCore_508.c("㺧", (int)ch, (long)(ci ^ cj));
        var_com_nickuc_login_NLoginCore_508_g = new NLoginCore_508(stringArray7);
        String[] stringArray8 = new String[co];
        stringArray8[NLoginCore_508.cp] = NLoginCore_508.c("㺭", (int)cq, (long)(cr ^ cs));
        var_com_nickuc_login_NLoginCore_508_h = new NLoginCore_508(stringArray8);
        String[] stringArray9 = new String[cw];
        stringArray9[NLoginCore_508.cx] = NLoginCore_508.c("㺳", (int)cy, (long)(cz ^ da));
        var_com_nickuc_login_NLoginCore_508_i = new NLoginCore_508(stringArray9);
        String[] stringArray10 = new String[df];
        stringArray10[NLoginCore_508.dg] = NLoginCore_508.c("㺹", (int)dh, (long)(di ^ dj));
        var_com_nickuc_login_NLoginCore_508_j = new NLoginCore_508(stringArray10);
        String[] stringArray11 = new String[cfr_renamed_1];
        stringArray11[NLoginCore_508.dp] = NLoginCore_508.c("㺿", (int)dq, (long)dr);
        var_com_nickuc_login_NLoginCore_508_k = new NLoginCore_508(stringArray11);
        String[] stringArray12 = new String[dw];
        stringArray12[NLoginCore_508.dx] = NLoginCore_508.c("㻅", (int)(dy & dz), (long)ea);
        var_com_nickuc_login_NLoginCore_508_l = new NLoginCore_508(stringArray12);
        String[] stringArray13 = new String[ef];
        stringArray13[NLoginCore_508.eg] = NLoginCore_508.c("㻋", (int)eh, (long)ei);
        stringArray13[NLoginCore_508.ej] = NLoginCore_508.c("㻎", (int)(ek & el), (long)em);
        var_com_nickuc_login_NLoginCore_508_m = new NLoginCore_508(stringArray13);
        var_com_nickuc_login_NLoginCore_508_n = new NLoginCore_508((String)NLoginCore_508.c("㻔", (int)(er & es), (long)et), eu != 0);
        var_com_nickuc_login_NLoginCore_508_o = new NLoginCore_508((String)NLoginCore_508.c("㻚", (int)(ez & fa), (long)fb), fc != 0);
        var_com_nickuc_login_NLoginCore_508_p = new NLoginCore_508((String)NLoginCore_508.c("㻠", (int)fh, (long)fi), fj != 0);
        var_com_nickuc_login_NLoginCore_508_q = new NLoginCore_508((String)NLoginCore_508.c("㻦", (int)fo, (long)fp), fq != 0);
        var_com_nickuc_login_NLoginCore_508_arr_a = NLoginCore_508.com_nickuc_login_NLoginCore_508_arr_a();
        var_com_nickuc_login_NLoginCore_075_a = new NLoginCore_075();
    }

    static /* synthetic */ NLoginCore_075 com_nickuc_login_NLoginCore_075_a() {
        return var_com_nickuc_login_NLoginCore_075_a;
    }

    @Override
    public Object java_lang_Object_a() {
        return var_com_nickuc_login_NLoginCore_075_a;
    }

    public static NLoginCore_508[] values() {
        return (NLoginCore_508[])var_com_nickuc_login_NLoginCore_508_arr_a.clone();
    }

    @Override
    public NLoginCore_474 com_nickuc_login_NLoginCore_474_a() {
        return this.var_com_nickuc_login_NLoginCore_474_g;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_508.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ափօե։ֶ֢֨֠ձֳ֥֭֯նִִֺּֽ֛։", (byte)125, 69), NLoginCore_508.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.B("ǜǩǨƫǫǧǢǫǶǥƲǰǴǭǰǶƸԻԱԽՌԡՆՍՕՕՋԽՆՑԲǒ", (byte)125, 66) + string + NLoginCore_201.B("Ƴ", (byte)125, 66) + methodType.toString(), exception);
        }
    }

    private NLoginCore_508(String ... stringArray) {
        this.var_com_nickuc_login_NLoginCore_474_g = NLoginCore_474.a((String[])Arrays.stream(stringArray).map(string -> (String)NLoginCore_508.c("㺀", (int)var_int_g, (long)(var_long_h ^ var_long_i)) + string).toArray(String[]::new));
        this.aK = var_int_a;
    }

    private static String a(int n, long l) {
        l ^= 0x11L;
        l ^= 0x2C347B949A924209L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(21 + 48), (byte)(57 + 26), (byte)(36 + 11), (byte)(37 + 30), (byte)(31 + 35), (byte)(5 + 62), (byte)(14 + 33), (byte)(33 + 47), 75, (byte)(48 + 19), (byte)(47 + 36), 53, (byte)(28 + 52), (byte)(94 + 3), (byte)(84 + 16), (byte)(33 + 67), (byte)(71 + 34), (byte)(57 + 53), (byte)(41 + 62)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.C("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢦ࢜ࢨࢷࢌࢱࢸࣀࣀࢶࢨࢱࢼ࢝", (byte)101, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_508.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

