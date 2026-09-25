/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

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
import com.nickuc.login.NLoginCore_076;
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
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_055
extends Enum<NLoginCore_055> {
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_c;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_d;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_e;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_f;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_g;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_h;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_i;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_j;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_k;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_l;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_m;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_n;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_o;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_p;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_q;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_r;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_s;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_t;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_u;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_v;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_w;
    public static final /* enum */ NLoginCore_055 var_com_nickuc_login_NLoginCore_055_x;
    public final String cM;
    public final String cN;
    public final String cO;
    public final String cP;
    public final String cQ;
    public final int aO;
    private static final /* synthetic */ NLoginCore_055[] var_com_nickuc_login_NLoginCore_055_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static long var_long_e;
    private static int var_int_f;
    private static long var_long_g;
    private static int var_int_h;
    private static int var_int_i;
    private static long var_long_j;
    private static int var_int_k;
    private static long var_long_l;
    private static long var_long_m;
    private static int var_int_n;
    private static int var_int_o;
    private static int var_int_p;
    private static int var_int_q;
    private static int var_int_r;
    private static int var_int_s;
    private static int var_int_t;
    private static int var_int_u;
    private static int var_int_v;
    private static int var_int_w;
    private static int var_int_x;
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
    private static int ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static long ax;
    private static long ay;
    private static int az;
    private static int ba;
    private static long bb;
    private static long bc;
    private static int bd;
    private static long be;
    private static long bf;
    private static int bg;
    private static long bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static long bl;
    private static int bm;
    private static int bn;
    private static long bo;
    private static int bp;
    private static long bq;
    private static long br;
    private static int bs;
    private static int bt;
    private static int bu;
    private static long bv;
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
    private static long cj;
    private static long ck;
    private static int cl;
    private static long cm;
    private static int cn;
    private static long co;
    private static long cp;
    private static int cq;
    private static int cr;
    private static int cs;
    private static long ct;
    private static int cu;
    private static long cv;
    private static long cw;
    private static int cx;
    private static int cy;
    private static long cz;
    private static long da;
    private static int db;
    private static int dc;
    private static int dd;
    private static long de;
    private static int df;
    private static long dg;
    private static int dh;
    private static int di;
    private static long dj;
    private static int dk;
    private static int dl;
    private static long dm;
    private static int dn;
    private static long cfr_renamed_1;
    private static long dp;
    private static int dq;
    private static long dr;
    private static long ds;
    private static int dt;
    private static int du;
    private static long dv;
    private static long dw;
    private static int dx;
    private static long dy;
    private static long dz;
    private static int ea;
    private static long eb;
    private static long ec;
    private static int ed;
    private static int ee;
    private static long ef;
    private static long eg;
    private static int eh;
    private static long ei;
    private static int ej;
    private static long ek;
    private static long el;
    private static int em;
    private static int en;
    private static long eo;
    private static long ep;
    private static int eq;
    private static long er;
    private static int es;
    private static long et;
    private static long eu;
    private static int ev;
    private static int ew;
    private static long ex;
    private static long ey;
    private static int ez;
    private static long fa;
    private static long fb;
    private static int fc;
    private static int fd;
    private static long fe;
    private static long ff;
    private static int fg;
    private static int fh;
    private static long fi;
    private static long fj;
    private static int fk;
    private static long fl;
    private static long fm;
    private static int fn;
    private static long fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private static long fs;
    private static int ft;
    private static long fu;
    private static long fv;
    private static int fw;
    private static long fx;
    private static int fy;
    private static int fz;
    private static long ga;
    private static long gb;
    private static int gc;
    private static long gd;
    private static long ge;
    private static int gf;
    private static long gg;
    private static long gh;
    private static int gi;
    private static int gj;
    private static long gk;
    private static long gl;
    private static int gm;
    private static int gn;
    private static long go;
    private static int gp;
    private static long gq;
    private static int gr;
    private static int gs;
    private static long gt;
    private static int gu;
    private static int gv;
    private static long gw;
    private static long gx;
    private static int gy;
    private static long gz;
    private static long ha;
    private static int hb;
    private static long hc;
    private static int hd;
    private static int he;
    private static long hf;
    private static int hg;
    private static long hh;
    private static int hi;
    private static long hj;
    private static int hk;
    private static int hl;
    private static long hm;
    private static long hn;
    private static int ho;
    private static int hp;
    private static long hq;
    private static int hr;
    private static int hs;
    private static long ht;
    private static int hu;
    private static int hv;
    private static long hw;
    private static int hx;
    private static long hy;
    private static long hz;
    private static int ia;
    private static int ib;
    private static long ic;
    private static int id;
    private static int ie;
    private static long cfr_renamed_0;
    private static long ig;
    private static int ih;
    private static long ii;
    private static long ij;
    private static int ik;
    private static long il;
    private static int im;
    private static int in;
    private static long io;
    private static long ip;
    private static int iq;
    private static long ir;
    private static long is;
    private static int it;
    private static int iu;
    private static long iv;
    private static int iw;
    private static int ix;
    private static long iy;
    private static int iz;
    private static int ja;
    private static long jb;
    private static long jc;
    private static int jd;

    private NLoginCore_055(String string2, String string3, String string4, boolean bl) {
        this.cN = string3;
        this.cO = string2 == null ? NLoginCore_055.c("㺀", (int)var_int_b, (long)(var_long_d ^ var_long_e)) : (String)NLoginCore_055.c("㺃", (int)var_int_f, (long)var_long_g) + string3 + (String)NLoginCore_055.c("㺆", (int)(var_int_h & var_int_i), (long)var_long_j);
        this.cM = string2;
        this.cP = bl ? string3 : NLoginCore_055.c("㺉", (int)var_int_k, (long)(var_long_l ^ var_long_m));
        this.cQ = string4;
        this.aO = bl ? this.ordinal() + var_int_n : var_int_o;
    }

    private static void b() {
        int n;
        var_long_c = 3616668917290337337L;
        long l = var_long_c ^ 0x4AF51E49F5BD9C23L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(14 + 55), (byte)(59 + 24), 47, (byte)(56 + 11), (byte)(46 + 20), (byte)(10 + 57), (byte)(22 + 25), (byte)(33 + 47), (byte)(41 + 34), (byte)(58 + 9), (byte)(11 + 72), (byte)(41 + 12), (byte)(27 + 53), (byte)(69 + 28), 100, (byte)(54 + 46), (byte)(27 + 78), (byte)(11 + 99), (byte)(7 + 96)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_055.var_java_lang_String_arr_b[0] = NLoginCore_387.D("ԆՋԭԺՂԞԣՇԈՆԯԓԶԒԛԜԫԲԙՂԪԻԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[1] = NLoginCore_092.B("ŰƵƗƤƬƈƍƱŲưƗƎƖƾƹưƛƚƥƜƆƥƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[2] = NLoginCore_110.D("ԍԤՐԲԻՓՍՉՖԕ԰ԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[3] = NLoginCore_110.C("ԹԠՐՈԎՋԌԮՑԗՊԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[4] = NLoginCore_138.B("ƳƒƩŸƛƇƺƗƸŽƛƵƯƢƣƒƓƙƚƚƨƕƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[5] = NLoginCore_451.F("ֆՈՕ։֖֔֊ևժՖկՙ֠֙բյվ՘ո֛֔յֆ֣֛ջ֎֙֙ւְִ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[6] = NLoginCore_559.F("փֈդ֍֏ծփՖ֜՚էդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[7] = NLoginCore_138.E("ՏֆյՖշիՍ֍հծշդ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ƘƷŶƊƈƚźƉƙƍƞƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[9] = NLoginCore_138.C("ՂԣՆԪԩԢՅԋԾՍԴԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[10] = NLoginCore_027.B("ƣƊƺƲŸƵŶƘƻƁƴƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[11] = NLoginCore_110.B("ƢƮƉƜƥŸŴƛƭƑƸƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[12] = NLoginCore_223.A("ƎƪƱƏŹƯźƉƖƳƎƼƖƸƲơƄƞǊƝƹƻƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[13] = NLoginCore_446.A("ƉƇƪƇƼƝŴƯƼƝǀƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[14] = NLoginCore_110.F("վծղֈ֑Ռհթչ֔ճդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[15] = NLoginCore_427.A("ƬƪƎƃƵƴƦƽǁƶƁƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[16] = NLoginCore_027.D("ԨՈԝԫԍԪ԰ՖՅՒԸԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[17] = NLoginCore_027.F("֕ՠդթփղ֍ծ։յ֍դ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[18] = NLoginCore_027.E("թօ֒ր՘ըեծՓՙ՟ց֡֙քլոբ֤֒՛ւկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[19] = NLoginCore_027.A("ƓūųƸƧƆƷƳſƉƼƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[20] = NLoginCore_201.A("ƎưŬƥƅƻƮŷƊƱƊƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[21] = NLoginCore_559.B("ůƶƉƉƼƅƈƒǁƿơƷƏƠƓƞǅƘǅƧžǋƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[22] = NLoginCore_223.B("ƬƉƕŷƮųƙƋƳƓƎƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[23] = NLoginCore_384.F("ՍՒխ֓ճկ֙ճ֏՚՚֌՗֋ո֥֍չ֕՞ս֨կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[24] = NLoginCore_091.E("֕Օ՟։֕Ց֊դ։֎ղ֑ճոկ֥֙֙֨շգւկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[25] = NLoginCore_223.B("ƲơƋŸƬƨƒƍƸƷƎƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[26] = NLoginCore_559.A("ƊƂƖƑƻƕƪƮƒƠƎƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[27] = NLoginCore_451.C("ԮԥԱՒԝՄԴԽԫՏԸԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[28] = NLoginCore_091.A("ƷŹƗƴźƶƉƗǁƓƊƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[29] = NLoginCore_223.D("ԙԈԫՀԉԏԪԵՉԱՆԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[30] = NLoginCore_027.F("սևՓ֙֎ժՔպՙ՛խռ֍ժ֔հւձմաջւկհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[31] = NLoginCore_201.B("ŰƴƓƬƄƑŰƈƽƋǀƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[32] = NLoginCore_324.F("ֈվցՊխխղ֛֕ղ֍Ֆխ֐խորզ֛ըՠ֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[33] = NLoginCore_027.D("ԷԦԫԯԍՋԴՆՅԨՖԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[34] = NLoginCore_091.B("ŷƉƨƉųƞƲƳƨƌǀƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[35] = NLoginCore_092.A("ƍơƪƤƌƳƓƧƶųƴƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[36] = NLoginCore_173.A("ŰƂƦƭƥƋƝƓƴƿǀƘƵƮƿƤƤǁƲǅƇǋƩƾƇƐƦƝǑǒƷƉ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[37] = NLoginCore_173.C("ԘՋԧԭԝԠԣԐԏԲԏԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[38] = NLoginCore_201.C("ԥՊԌԲԪԅՀ԰ԓԳԠԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[39] = NLoginCore_427.B("ưƢƻƪƲƦƊƳƚƔƀŻƕƁƟƚƞƾƕƻƉƥƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[40] = NLoginCore_324.B("ƫƸƦŭƳƨƬűƉƩŽƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[41] = NLoginCore_559.C("ԶՁՌԬԿԓԨՇ՗ԷԎ԰ՓԬ՚ԥՙԝԪԓ԰աԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[42] = NLoginCore_091.B("ƂŰƅűƄźƺƉƌưƖƀƲǅƮǂƿǈƤƄơƥƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[43] = NLoginCore_027.E("Ր֎ֆւիիզՒ֖՘՞դ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[44] = NLoginCore_091.A("ƮƣƃƆŻƥƶƑƩƋƘƻƱŻŽƹƢǇƿƺƖƕƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[45] = NLoginCore_559.B("ưŰŸƳŻƱƌƚƞƴƓžſƤơƑǂƛƈƥǇǃƶƬǌƻƾƎƠǏǉƖ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[46] = NLoginCore_201.D("ԙԟՈԻՅԲԳԵԾԥՊԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[47] = NLoginCore_384.D("ՊԜԨԈԢՀԨԫԖՖԨԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[48] = NLoginCore_091.A("ŸƮźƸƓƋƳźƛƔƕƳƢƢƘƏƱſƼǀƫƻƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[49] = NLoginCore_387.C("ԹՄԤԍԯԮՅԞԫԖՍԷ՛ԕԻՕԺԹ՟ԙԟԫԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[50] = NLoginCore_027.E("Օևկ՗էշի֒֙վՖդ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[51] = NLoginCore_324.A("ŲƯŸƤƝżŷǀŹżƒƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[52] = NLoginCore_559.E("տճ֎օ֑֘ժ։Քռ՘՝ի՚ւ֖֙րվֆռւկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[53] = NLoginCore_427.D("ՀԜԜՐՒՈԡՖՇԓԴԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[54] = NLoginCore_004.E("֖դֆդդ֑փ֖֖֒֓ֈ֎ա֖֢վ՟օ֐վ֫է֦֘խչև֦֬֜ղ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[55] = NLoginCore_138.F("ֆՈՕ։֖֔֊ևժՖհշ՗ց֋֜֙փ֓բ՛ղկհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[56] = NLoginCore_559.C("ԈԿԮԏ԰ԤԆՆԩԧ԰ԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[57] = NLoginCore_138.F("ձՌֆրյդՔ֗֌֙է֞պճ֟Ֆխբգհզ֨կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[58] = NLoginCore_138.C("ԇԡԠԩՆԌԮՕԔԏԣՃ՗ՋՕԸՒԽԭԓԝԫԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[59] = NLoginCore_559.B("ƤƍƴƗƵƷžƕƚżƁƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[60] = NLoginCore_384.B("ƓơƥűƷƸƘŶƹƌƴƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[61] = NLoginCore_446.F("քՠզֆ֋֋իք֕Ր֊ֈ՘֘ա֏յպբցշգգփդիխզտ֯սզյցծոյհ֏֑֘־ֵք", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[62] = NLoginCore_138.F("֍ՑՍքՋշյ՘֞֙։դ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[63] = NLoginCore_092.E("֏Օ֕դօ֐լկՙշ՞նտ֚֗ՠ՗֒՞֐վ֨կհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[64] = NLoginCore_027.D("ԪԆԎԪԡԎԵԌԕԑԥՃԔԪՇԮԐՌԲՐԱՒ՟ԯԼՆը՟Ե՝զԧ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[65] = NLoginCore_173.F("սնդխխՌնք֞ը֙դ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[66] = NLoginCore_091.E("ֈձ֏խյՐևռըռ՛թՙտճշր՘՝֕պ֨կհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[67] = NLoginCore_223.C("ԮԘԂՍԏԐԩՑԣԓՙԣԻՎՌՍԵՈԹ՞ԴաԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[68] = NLoginCore_387.F("֎֔ցՑկ֖՛կպչէդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[69] = NLoginCore_027.B("ƥƲųƳŵƌƞŻơƮŹƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[70] = NLoginCore_559.B("ƁƲƋŷƲƔƽƙƖơƎƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[71] = NLoginCore_004.A("ƢƕƉƘƆƾƞŷƘƍǀƇ", (byte)96, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_055.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŰƵƗƤƬƈƍƱŲưƙƔƼƃƓƅƽƴƔƚƣƌƜƿǎǁǌƩǒƞǀƷ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[1] = NLoginCore_387.F("Ս֒մց։եժ֎Տ֍ն՟ջ՘֞փ֔֟տ֑֠֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[2] = NLoginCore_384.D("ԊՊՋՌԜՈԋԩԍ԰Ըԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[3] = NLoginCore_138.B("ŶŵƣƤƊƚƓƾƒƖƼƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[4] = NLoginCore_575.C("ՉԨԿԎԱԝՐԭՎԓԲԵԸԸ՘ԽՆԨԭ՘ԺԫԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[5] = NLoginCore_201.B("ƩūŸƬƹƷƭƪƍŹƒżǃƼƅƘơŻƛƾƷƕƥƊƂǉƧǆƍǌǑǌƘƓǗƦǙǓƳƗƘƸƺƧ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[6] = NLoginCore_110.E("ք֊ոՎծՕ֕֎՛ոջդ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[7] = NLoginCore_324.D("ԊԘՆԊՍՓԾ԰ԪԓՒԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[8] = NLoginCore_201.B("ƐƷƈƺƘźƨƍżƼƂƲŶǅǅƦƨƾżƥƫƕƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[9] = NLoginCore_453.D("ԡԘԹՋԦԤԞՖՑԏԨԣՏԧՏՊՋՓՁԸՎՑԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[10] = NLoginCore_110.F("֏ՍղՎ՘Ֆ֑նզ֓կդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[11] = NLoginCore_384.E("նֈՑխ֐մխՒ֒զհ֛ջկ՝֛՟մւհթ֨կհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[12] = NLoginCore_027.A("ƎƪƱƏŹƯźƉƖƳƎơƎƥƁƐƇƪǆƞƈƕƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[13] = NLoginCore_384.D("ՄԇՌԎԉՅՕԶՄ՘Վԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ƭƁƎƒƥŷƹƭƱƮǂƘƃƺƏƑſǈƔƢƚƕƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[15] = NLoginCore_201.A("ƴŰƷűƲƆƞƌƗƛƘƐƼƳƙǇƱƝƺƞƶƥƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[16] = NLoginCore_223.D("ՊԯԊԎՍԓԤԫԣՊԗԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[17] = NLoginCore_092.E("Ր֓ՠըժժհֈ՛ղ֖֓տկ֝֙փչպդււկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[18] = NLoginCore_138.D("ԢԾՋԹԑԡԞԧԌԒԗԳԣՒԚՉԭ՚ԖԬՏՑԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[19] = NLoginCore_201.F("֏ևրղՒւ՚եէոիդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[20] = NLoginCore_387.A("ƓŷƬųƜƛƇƻƚƲƯǄżŻƖǇžƳƲƊơƻƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[21] = NLoginCore_384.E("Ռ֓զզ֙բեկ֞֜ռրՙ֖֘ցն֚֗ջւ֨կհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[22] = NLoginCore_223.A("ƇŷƂƴƩƶƹƾƊƷưƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[23] = NLoginCore_173.B("ŰŵƐƶƖƒƼƖƲŽŽſƿżƮƶǆǁƼƘƘƻƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[24] = NLoginCore_138.F("֕Օ՟։֕Ց֊դ։֎կՠ՞շ֢՟ռօ֝մվ֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[25] = NLoginCore_559.A("ƶƙƮƺźƮƋſžƮưƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[26] = NLoginCore_559.E("դկ֑֗֋ևճթհ֋֋֡շ֒ՠնռ֣֏փօւկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[27] = NLoginCore_173.F("֋ծ֔րՖ֊֚կ՘Օ֖Ֆՠյձ֣՟վ֢օ֖֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[28] = NLoginCore_076.B("ƎűƖƪƧƦƈƺƝơƁƇ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[29] = NLoginCore_223.B("ƣƥƹƛƕƊŶƞơƺƎƕƀǆƗƟƂƨƅŽƃƻƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[30] = NLoginCore_223.F("սևՓ֙֎ժՔպՙ՛ծ՘֒՚պղչ֑արվւկհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[31] = NLoginCore_559.F("փա֔ձ֓զճ֗ձչ՚դ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[32] = NLoginCore_223.C("ՁԷԺԃԦԦԫՎՔԫՉԕՋՈԗԫԩՍԯՁգԫԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[33] = NLoginCore_453.C("ԌԝԘԯՊԿԼԤԣԢԔԲԖՙ՜ԼՓԭԿԵՁաԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[34] = NLoginCore_076.C("ԭԬՍԏԪՂՋԎՆԯԴԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[35] = NLoginCore_324.A("ƫƥưưƄŴƛƳŽƲƯƁƤưưƚƧƧƸƸƝƻƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[36] = NLoginCore_138.F("Ս՟փ֊ւըպհ֑֜֝յ֒֋֜ցց֞֏֢դդ֛֡֜ջթչկպ֥֡", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[37] = NLoginCore_076.E("֑դ֕֒֙֏ՙնէշ՞դ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[38] = NLoginCore_091.D("ԟՍՅՁԤԽԍԩՁԶԫԺԲՖՍՙԛ԰ԩՓԺԻԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[39] = NLoginCore_091.C("ՆԸՑՀՈԼԠՉ԰ԪԖՙԹԵԓԽԿԫ՟ՖԻաԨԩ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[40] = NLoginCore_004.F("ըմեՐՔղելպ՘ճդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[41] = NLoginCore_451.B("ƠƫƶƖƩŽƒƱǁơŸƠƢƔƖƄſǁǄƼƠƕƒƓ", (byte)96, 66);
                    NLoginCore_055.var_java_lang_String_arr_b[42] = NLoginCore_223.D("ԘԆԛԇԚԐՐԟԢՆԭԗՎՒԺՒՓԷՎՑՒԫԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[43] = NLoginCore_451.D("ՌԿԫԍԫՌԌԩԯՂՎԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[44] = NLoginCore_092.D("ՄԹԙԜԑԻՌԧԿԡԬԳՉ՜ՈԭԨԼԮՑԲաԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[45] = NLoginCore_138.D("ՆԆԎՉԑՇԢ԰ԴՊԩԔԕԺԷԧ՘ԱԞԻ՝ՠԼԽԦԾԧժԪԦՙ՗", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[46] = NLoginCore_223.A("ŷūƣƦƙƽƝƷƜųƊƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[47] = NLoginCore_223.C("ԮԞԱԢԬՄՁՊԪՋԬԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[48] = NLoginCore_559.D("ԎՄԐՎԩԡՉԐԱԪԫԪ԰ԷԦԜՇՌԳԛՓաԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[49] = NLoginCore_091.D("ԹՄԤԍԯԮՅԞԫԖՍԏՋՐԺԗԘԧԼՊՋԻԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[50] = NLoginCore_110.F("ցհնբք֑ն֎֙ևէդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[51] = NLoginCore_138.D("ԝԼԨԮԿԏԲԢԢԮԑՙՙԪԕԮԦԪԷԭԳԫԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[52] = NLoginCore_324.F("տճ֎օ֑֘ժ։Քռՙ֡՝ջչ֣տջ֚֘֙֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[53] = NLoginCore_223.A("ƨūƃŹƯƲŵƠƩƐƎƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[54] = NLoginCore_223.F("֖դֆդդ֑փ֖֖֒֓ֈ֎ա֖֢վ՟օ֐վդ֤չւ֖խ֮սսֈ։", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[55] = NLoginCore_201.E("ֆՈՕ։֖֔֊ևժՖղչմղ֥֠֔՝֖զ֗֨կհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[56] = NLoginCore_027.C("ԎԙԇԢԪԭՓՖԎԎՊԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[57] = NLoginCore_027.E("ձՌֆրյդՔ֗֌֙ըՠյի֐կճյ֦֞֘ղկհ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[58] = NLoginCore_091.C("ԇԡԠԩՆԌԮՕԔԏԢ԰՛ԭԱԗԳՀՋԘԜԱԞՅԲՄՈՊՀԷխը", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[59] = NLoginCore_223.F("յտդբ֏ծձշճյշդ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[60] = NLoginCore_384.D("ԿՃԡՎԺ԰ԽԐՍԶԶԓԥԷԹ՘ԘԞ՟ՁԝԫԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[61] = NLoginCore_559.A("ƧƃƉƩƮƮƎƧƸųƭƫŻƻƄƲƘƝƅƤƚƆƆƦƇƎƐƉƢǒƠƉƥƢǛǊǓƧǔǊƴƬƲƧ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[62] = NLoginCore_453.D("ԷՋԭԢԱՋԾՃՋԿՊԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[63] = NLoginCore_173.D("ՈԎՎԝԾՉԥԨԒ԰ԘԭԙՃՏՅԺԵԫ԰՜ԻԨԩ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[64] = NLoginCore_387.A("ƔŰŸƔƋŸƟŶſŻƏƭžƔƱƘźƶƜƺƛǆƽƛƸǌƠǑƽǇƤƲ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[65] = NLoginCore_223.C("ԗԅՑ԰ԡՍ԰Չԍԣ԰ԝ", (byte)96, 67);
                    NLoginCore_055.var_java_lang_String_arr_b[66] = NLoginCore_559.F("ֈձ֏խյՐևռըռ՚ը֕՛՚շ֜սն֒֗֘կհ", (byte)96, 70);
                    NLoginCore_055.var_java_lang_String_arr_b[67] = NLoginCore_446.A("ƘƂŬƷŹźƓƻƍŽǁƽƽƛƛǆƚǇǈƈƊƕƒƓ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[68] = NLoginCore_446.D("ՍԮԘԃՂՂԆԵԍ՗Նԝ", (byte)96, 68);
                    NLoginCore_055.var_java_lang_String_arr_b[69] = NLoginCore_027.A("ƊƭƶűƚƌƛƗƌǀƎƇ", (byte)96, 65);
                    NLoginCore_055.var_java_lang_String_arr_b[70] = NLoginCore_223.E("եելՑբ֖ճՕևթՖդ", (byte)96, 69);
                    NLoginCore_055.var_java_lang_String_arr_b[71] = NLoginCore_110.F("տ֐ղ՘ցյ֌֍էհտռջՠկղփ֕՟֡մ֘կհ", (byte)96, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_055.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՌղՠքիՌչճ֏֘վ֖֝ի՛կ֣վ՟ճվ֨կհ", (byte)96, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_055.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƆůƂƲƼƎƏƷƐƟƫǃƁǃƂƧƒƩƥǌơƥƒƓ", (byte)96, 65);
                }
            }
        }
    }

    public static NLoginCore_055[] values() {
        return (NLoginCore_055[])var_com_nickuc_login_NLoginCore_055_arr_a.clone();
    }

    public static NLoginCore_055 valueOf(String string) {
        return Enum.valueOf(NLoginCore_055.class, string);
    }

    public static NLoginCore_055 a(String string) {
        if (string != null) {
            NLoginCore_055[] NLoginCore_055Array = NLoginCore_055.values();
            int n = NLoginCore_055Array.length;
            for (int i = var_int_p; i < n; ++i) {
                NLoginCore_055 NLoginCore_0552 = NLoginCore_055Array[i];
                if (NLoginCore_0552 == var_com_nickuc_login_NLoginCore_055_x || !string.equalsIgnoreCase(NLoginCore_0552.cN)) continue;
                return NLoginCore_0552;
            }
        }
        return var_com_nickuc_login_NLoginCore_055_x;
    }

    private NLoginCore_055(String string2, String string3, boolean bl) {
        this(string2, string3, string3, bl);
    }

    public static NLoginCore_055 b(String string) {
        if (string != null) {
            NLoginCore_055[] NLoginCore_055Array = NLoginCore_055.values();
            int n = NLoginCore_055Array.length;
            for (int i = var_int_q; i < n; ++i) {
                NLoginCore_055 NLoginCore_0552 = NLoginCore_055Array[i];
                if (NLoginCore_0552 == var_com_nickuc_login_NLoginCore_055_x || !string.equalsIgnoreCase(NLoginCore_0552.cO)) continue;
                return NLoginCore_0552;
            }
        }
        return var_com_nickuc_login_NLoginCore_055_x;
    }

    @Generated
    public String u() {
        return this.cM;
    }

    private NLoginCore_055(String string2, String string3) {
        this(string2, string3, string3, var_int_a != 0);
    }

    @Nullable
    public static NLoginCore_055 c(@Nullable String string) {
        if (string == null || string.length() < var_int_t) {
            return null;
        }
        String string2 = string.substring(var_int_u, var_int_v);
        NLoginCore_055[] NLoginCore_055Array = NLoginCore_055.values();
        int n = NLoginCore_055Array.length;
        for (int i = var_int_w; i < n; ++i) {
            NLoginCore_055 NLoginCore_0552 = NLoginCore_055Array[i];
            if (NLoginCore_0552 == var_com_nickuc_login_NLoginCore_055_x || !string2.equals(NLoginCore_0552.cQ)) continue;
            return NLoginCore_0552;
        }
        return null;
    }

    public static NLoginCore_055 a(int n) {
        NLoginCore_055[] NLoginCore_055Array = NLoginCore_055.values();
        int n2 = NLoginCore_055Array.length;
        for (int i = var_int_r; i < n2; ++i) {
            NLoginCore_055 NLoginCore_0552 = NLoginCore_055Array[i];
            if (NLoginCore_0552 == var_com_nickuc_login_NLoginCore_055_x || NLoginCore_0552.aO == var_int_s || n != NLoginCore_0552.aO) continue;
            return NLoginCore_0552;
        }
        return var_com_nickuc_login_NLoginCore_055_x;
    }

    private static String a(int n, long l) {
        l ^= 0x56L;
        l ^= 0x4AF51E49F5BD9C23L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(14 + 55), (byte)(53 + 30), (byte)(38 + 9), (byte)(22 + 45), (byte)(53 + 13), (byte)(27 + 40), (byte)(42 + 5), (byte)(4 + 76), (byte)(68 + 7), 67, (byte)(5 + 78), (byte)(14 + 39), (byte)(25 + 55), (byte)(82 + 15), 100, (byte)(38 + 62), (byte)(58 + 47), (byte)(72 + 38), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐҗқҧңҤҫ҃ҚҤҫҏ", (byte)41, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_055.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_055.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 65), NLoginCore_055.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.A("İĽļÿĿĻĶĿŊĹĆńňŁńŊČғҗңҟҠҧѿҖҠҧҋģ", (byte)39, 65) + string + NLoginCore_110.C("Ѥ", (byte)39, 67) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ NLoginCore_055[] a() {
        NLoginCore_055[] NLoginCore_055Array = new NLoginCore_055[var_int_x];
        NLoginCore_055Array[NLoginCore_055.y] = var_com_nickuc_login_NLoginCore_055_c;
        NLoginCore_055Array[NLoginCore_055.z] = var_com_nickuc_login_NLoginCore_055_d;
        NLoginCore_055Array[NLoginCore_055.aa] = var_com_nickuc_login_NLoginCore_055_e;
        NLoginCore_055Array[NLoginCore_055.ab] = var_com_nickuc_login_NLoginCore_055_f;
        NLoginCore_055Array[NLoginCore_055.ac] = var_com_nickuc_login_NLoginCore_055_g;
        NLoginCore_055Array[NLoginCore_055.ad] = var_com_nickuc_login_NLoginCore_055_h;
        NLoginCore_055Array[NLoginCore_055.ae] = var_com_nickuc_login_NLoginCore_055_i;
        NLoginCore_055Array[NLoginCore_055.af] = var_com_nickuc_login_NLoginCore_055_j;
        NLoginCore_055Array[NLoginCore_055.ag] = var_com_nickuc_login_NLoginCore_055_k;
        NLoginCore_055Array[NLoginCore_055.ah] = var_com_nickuc_login_NLoginCore_055_l;
        NLoginCore_055Array[NLoginCore_055.ai] = var_com_nickuc_login_NLoginCore_055_m;
        NLoginCore_055Array[NLoginCore_055.aj] = var_com_nickuc_login_NLoginCore_055_n;
        NLoginCore_055Array[NLoginCore_055.ak] = var_com_nickuc_login_NLoginCore_055_o;
        NLoginCore_055Array[NLoginCore_055.al] = var_com_nickuc_login_NLoginCore_055_p;
        NLoginCore_055Array[NLoginCore_055.am] = var_com_nickuc_login_NLoginCore_055_q;
        NLoginCore_055Array[NLoginCore_055.an] = var_com_nickuc_login_NLoginCore_055_r;
        NLoginCore_055Array[NLoginCore_055.ao] = var_com_nickuc_login_NLoginCore_055_s;
        NLoginCore_055Array[NLoginCore_055.ap] = var_com_nickuc_login_NLoginCore_055_t;
        NLoginCore_055Array[NLoginCore_055.aq] = var_com_nickuc_login_NLoginCore_055_u;
        NLoginCore_055Array[NLoginCore_055.ar] = var_com_nickuc_login_NLoginCore_055_v;
        NLoginCore_055Array[NLoginCore_055.as] = var_com_nickuc_login_NLoginCore_055_w;
        NLoginCore_055Array[NLoginCore_055.at] = var_com_nickuc_login_NLoginCore_055_x;
        return NLoginCore_055Array;
    }

    static {
        var_int_a = (0 >>> 106 | 0 << ~106 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_long_d = Long.reverse(-7196309479632204724L);
        var_long_e = Long.reverse(0x6A00000000000000L);
        var_int_f = 2048 >>> 75 | 2048 << -75;
        var_long_g = Long.reverse(-711126016218690484L);
        var_int_h = Integer.reverse(0x40000000);
        var_int_i = -1 >>> 93 | -1 << -93;
        var_long_j = Long.reverse(-711126016218690484L);
        var_int_k = Integer.reverse(-1073741824);
        var_long_l = Long.reverse(-7196309479632204724L);
        var_long_m = Long.reverse(0x6A00000000000000L);
        var_int_n = (0x200000 >>> 117 | 0x200000 << -117) & 0xFFFFFFFF;
        var_int_o = -1 >>> 19 | -1 << -19;
        var_int_p = Integer.reverse(0);
        var_int_q = Integer.reverse(0);
        var_int_r = Integer.reverse(0);
        var_int_s = Integer.reverse(-1);
        var_int_t = (128 >>> 38 | 128 << -38) & 0xFFFFFFFF;
        var_int_u = Integer.reverse(0);
        var_int_v = (1024 >>> 9 | 1024 << ~9 + 1) & 0xFFFFFFFF;
        var_int_w = Integer.reverse(0);
        var_int_x = Integer.reverse(0x68000000);
        y = 0 >>> 46 | 0 << ~46 + 1;
        z = (1 >>> 96 | 1 << ~96 + 1) & 0xFFFFFFFF;
        aa = 0x40000000 >>> 29 | 0x40000000 << ~29 + 1;
        ab = Integer.reverse(-1073741824);
        ac = (0x2000000 >>> 23 | 0x2000000 << -23) & 0xFFFFFFFF;
        ad = 40960 >>> 205 | 40960 << -205;
        ae = (196608 >>> 111 | 196608 << ~111 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(-536870912);
        ag = 8192 >>> 170 | 8192 << ~170 + 1;
        ah = Integer.reverse(-1879048192);
        ai = 0x14000000 >>> 185 | 0x14000000 << ~185 + 1;
        aj = (0x2C000000 >>> 218 | 0x2C000000 << -218) & 0xFFFFFFFF;
        ak = Integer.reverse(0x30000000);
        al = Integer.reverse(-1342177280);
        am = 0xE000000 >>> 184 | 0xE000000 << ~184 + 1;
        an = Integer.reverse(-268435456);
        ao = 1024 >>> 166 | 1024 << ~166 + 1;
        ap = 136 >>> 163 | 136 << -163;
        aq = Integer.reverse(0x48000000);
        ar = Integer.reverse(-939524096);
        as = Integer.reverse(0x28000000);
        at = Integer.reverse(-1476395008);
        au = Integer.reverse(0x12000000);
        av = Integer.reverse(0x12000000);
        aw = Integer.reverse(0x20000000);
        ax = Long.reverse(-7196309479632204724L);
        ay = Long.reverse(0x6A00000000000000L);
        az = 0 >>> 186 | 0 << ~186 + 1;
        ba = (320 >>> 6 | 320 << ~6 + 1) & 0xFFFFFFFF;
        bb = Long.reverse(-7196309479632204724L);
        bc = Long.reverse(0x6A00000000000000L);
        bd = Integer.reverse(0x60000000);
        be = Long.reverse(-7196309479632204724L);
        bf = Long.reverse(0x6A00000000000000L);
        bg = 3584 >>> 201 | 3584 << -201;
        bh = Long.reverse(-711126016218690484L);
        bi = Integer.reverse(Integer.MIN_VALUE);
        bj = (32 >>> 98 | 32 << -98) & 0xFFFFFFFF;
        bk = (-1 >>> 118 | -1 << ~118 + 1) & 0xFFFFFFFF;
        bl = Long.reverse(-711126016218690484L);
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = (0x240000 >>> 146 | 0x240000 << ~146 + 1) & 0xFFFFFFFF;
        bo = Long.reverse(-711126016218690484L);
        bp = Integer.reverse(0x50000000);
        bq = Long.reverse(-7196309479632204724L);
        br = Long.reverse(0x6A00000000000000L);
        bs = Integer.reverse(Integer.MIN_VALUE);
        bt = Integer.reverse(-805306368);
        bu = -1 >>> 167 | -1 << ~167 + 1;
        bv = Long.reverse(-711126016218690484L);
        bw = Integer.reverse(0x40000000);
        bx = (0x6000000 >>> 87 | 0x6000000 << ~87 + 1) & 0xFFFFFFFF;
        by = -1 >>> 204 | -1 << ~204 + 1;
        bz = Long.reverse(-711126016218690484L);
        ca = Integer.reverse(-1342177280);
        cb = Long.reverse(-7196309479632204724L);
        cc = Long.reverse(0x6A00000000000000L);
        cd = Integer.reverse(Integer.MIN_VALUE);
        ce = (0xE00000 >>> 20 | 0xE00000 << ~20 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(-7196309479632204724L);
        cg = Long.reverse(0x6A00000000000000L);
        ch = (0x3000000 >>> 184 | 0x3000000 << -184) & 0xFFFFFFFF;
        ci = Integer.reverse(-268435456);
        cj = Long.reverse(-7196309479632204724L);
        ck = Long.reverse(0x6A00000000000000L);
        cl = 0x40000000 >>> 154 | 0x40000000 << ~154 + 1;
        cm = Long.reverse(-711126016218690484L);
        cn = Integer.reverse(-2013265920);
        co = Long.reverse(-7196309479632204724L);
        cp = Long.reverse(0x6A00000000000000L);
        cq = (0x20000000 >>> 59 | 0x20000000 << -59) & 0xFFFFFFFF;
        cr = (72 >>> 66 | 72 << ~66 + 1) & 0xFFFFFFFF;
        cs = (-1 >>> 34 | -1 << -34) & 0xFFFFFFFF;
        ct = Long.reverse(-711126016218690484L);
        cu = (1216 >>> 6 | 1216 << ~6 + 1) & 0xFFFFFFFF;
        cv = Long.reverse(-7196309479632204724L);
        cw = Long.reverse(0x6A00000000000000L);
        cx = Integer.reverse(Integer.MIN_VALUE);
        cy = 0xA000000 >>> 247 | 0xA000000 << -247;
        cz = Long.reverse(-7196309479632204724L);
        da = Long.reverse(0x6A00000000000000L);
        db = Integer.reverse(-1610612736);
        dc = (2688 >>> 71 | 2688 << ~71 + 1) & 0xFFFFFFFF;
        dd = (-1 >>> 56 | -1 << -56) & 0xFFFFFFFF;
        de = Long.reverse(-711126016218690484L);
        df = (45056 >>> 11 | 45056 << ~11 + 1) & 0xFFFFFFFF;
        dg = Long.reverse(-711126016218690484L);
        dh = Integer.reverse(-402653184);
        di = (-1 >>> 82 | -1 << -82) & 0xFFFFFFFF;
        dj = Long.reverse(-711126016218690484L);
        dk = 768 >>> 135 | 768 << ~135 + 1;
        dl = 0x600000 >>> 178 | 0x600000 << -178;
        dm = Long.reverse(-711126016218690484L);
        dn = Integer.reverse(-1744830464);
        cfr_renamed_1 = Long.reverse(-7196309479632204724L);
        dp = Long.reverse(0x6A00000000000000L);
        dq = Integer.reverse(0x58000000);
        dr = Long.reverse(-7196309479632204724L);
        ds = Long.reverse(0x6A00000000000000L);
        dt = 28 >>> 130 | 28 << ~130 + 1;
        du = 0x60000003 >>> 29 | 0x60000003 << -29;
        dv = Long.reverse(-7196309479632204724L);
        dw = Long.reverse(0x6A00000000000000L);
        dx = (0x3800000 >>> 181 | 0x3800000 << -181) & 0xFFFFFFFF;
        dy = Long.reverse(-7196309479632204724L);
        dz = Long.reverse(0x6A00000000000000L);
        ea = 59392 >>> 203 | 59392 << ~203 + 1;
        eb = Long.reverse(-7196309479632204724L);
        ec = Long.reverse(0x6A00000000000000L);
        ed = Integer.reverse(0x10000000);
        ee = 0x7800000 >>> 246 | 0x7800000 << ~246 + 1;
        ef = Long.reverse(-7196309479632204724L);
        eg = Long.reverse(0x6A00000000000000L);
        eh = Integer.reverse(-134217728);
        ei = Long.reverse(-711126016218690484L);
        ej = Integer.reverse(0x4000000);
        ek = Long.reverse(-7196309479632204724L);
        el = Long.reverse(0x6A00000000000000L);
        em = (-1879048192 >>> 124 | -1879048192 << ~124 + 1) & 0xFFFFFFFF;
        en = Integer.reverse(-2080374784);
        eo = Long.reverse(-7196309479632204724L);
        ep = Long.reverse(0x6A00000000000000L);
        eq = Integer.reverse(0x44000000);
        er = Long.reverse(-711126016218690484L);
        es = Integer.reverse(-1006632960);
        et = Long.reverse(-7196309479632204724L);
        eu = Long.reverse(0x6A00000000000000L);
        ev = (163840 >>> 110 | 163840 << -110) & 0xFFFFFFFF;
        ew = Integer.reverse(0x24000000);
        ex = Long.reverse(-7196309479632204724L);
        ey = Long.reverse(0x6A00000000000000L);
        ez = -1811939328 >>> 122 | -1811939328 << -122;
        fa = Long.reverse(-7196309479632204724L);
        fb = Long.reverse(0x6A00000000000000L);
        fc = (8 >>> 195 | 8 << -195) & 0xFFFFFFFF;
        fd = Integer.reverse(0x64000000);
        fe = Long.reverse(-7196309479632204724L);
        ff = Long.reverse(0x6A00000000000000L);
        fg = Integer.reverse(-805306368);
        fh = Integer.reverse(-469762048);
        fi = Long.reverse(-7196309479632204724L);
        fj = Long.reverse(0x6A00000000000000L);
        fk = (20 >>> 223 | 20 << ~223 + 1) & 0xFFFFFFFF;
        fl = Long.reverse(-7196309479632204724L);
        fm = Long.reverse(0x6A00000000000000L);
        fn = Integer.reverse(-1811939328);
        fo = Long.reverse(-711126016218690484L);
        fp = Integer.reverse(0x30000000);
        fq = (43008 >>> 42 | 43008 << -42) & 0xFFFFFFFF;
        fr = Integer.reverse(-1);
        fs = Long.reverse(-711126016218690484L);
        ft = 43 >>> 160 | 43 << ~160 + 1;
        fu = Long.reverse(-7196309479632204724L);
        fv = Long.reverse(0x6A00000000000000L);
        fw = 90112 >>> 11 | 90112 << -11;
        fx = Long.reverse(-711126016218690484L);
        fy = 0x1A0000 >>> 177 | 0x1A0000 << -177;
        fz = 90 >>> 65 | 90 << -65;
        ga = Long.reverse(-7196309479632204724L);
        gb = Long.reverse(0x6A00000000000000L);
        gc = Integer.reverse(0x74000000);
        gd = Long.reverse(-7196309479632204724L);
        ge = Long.reverse(0x6A00000000000000L);
        gf = (-268435454 >>> 156 | -268435454 << ~156 + 1) & 0xFFFFFFFF;
        gg = Long.reverse(-7196309479632204724L);
        gh = Long.reverse(0x6A00000000000000L);
        gi = Integer.reverse(0);
        gj = Integer.reverse(0xC000000);
        gk = Long.reverse(-7196309479632204724L);
        gl = Long.reverse(0x6A00000000000000L);
        gm = (7168 >>> 137 | 7168 << ~137 + 1) & 0xFFFFFFFF;
        gn = Integer.reverse(-1946157056);
        go = Long.reverse(-711126016218690484L);
        gp = Integer.reverse(0x4C000000);
        gq = Long.reverse(-711126016218690484L);
        gr = Integer.reverse(-872415232);
        gs = (-1 >>> 248 | -1 << ~248 + 1) & 0xFFFFFFFF;
        gt = Long.reverse(-711126016218690484L);
        gu = (120 >>> 163 | 120 << -163) & 0xFFFFFFFF;
        gv = 26 >>> 159 | 26 << -159;
        gw = Long.reverse(-7196309479632204724L);
        gx = Long.reverse(0x6A00000000000000L);
        gy = 0x6A000000 >>> 217 | 0x6A000000 << -217;
        gz = Long.reverse(-7196309479632204724L);
        ha = Long.reverse(0x6A00000000000000L);
        hb = Integer.reverse(0x6C000000);
        hc = Long.reverse(-711126016218690484L);
        hd = (0x20000000 >>> 249 | 0x20000000 << -249) & 0xFFFFFFFF;
        he = Integer.reverse(-335544320);
        hf = Long.reverse(-711126016218690484L);
        hg = Integer.reverse(0x1C000000);
        hh = Long.reverse(-711126016218690484L);
        hi = 14592 >>> 136 | 14592 << ~136 + 1;
        hj = Long.reverse(-711126016218690484L);
        hk = 0x11000000 >>> 24 | 0x11000000 << -24;
        hl = Integer.reverse(0x5C000000);
        hm = Long.reverse(-7196309479632204724L);
        hn = Long.reverse(0x6A00000000000000L);
        ho = Integer.reverse(-603979776);
        hp = -1 >>> 46 | -1 << -46;
        hq = Long.reverse(-711126016218690484L);
        hr = -536870911 >>> 219 | -536870911 << ~219 + 1;
        hs = -1 >>> 156 | -1 << ~156 + 1;
        ht = Long.reverse(-711126016218690484L);
        hu = Integer.reverse(0x48000000);
        hv = Integer.reverse(-1140850688);
        hw = Long.reverse(-711126016218690484L);
        hx = Integer.reverse(0x7C000000);
        hy = Long.reverse(-7196309479632204724L);
        hz = Long.reverse(0x6A00000000000000L);
        ia = (-2147483617 >>> 255 | -2147483617 << ~255 + 1) & 0xFFFFFFFF;
        ib = Integer.reverse(-1);
        ic = Long.reverse(-711126016218690484L);
        id = 0x260000 >>> 209 | 0x260000 << -209;
        ie = Integer.reverse(0x2000000);
        cfr_renamed_0 = Long.reverse(-7196309479632204724L);
        ig = Long.reverse(0x6A00000000000000L);
        ih = 4160 >>> 38 | 4160 << -38;
        ii = Long.reverse(-7196309479632204724L);
        ij = Long.reverse(0x6A00000000000000L);
        ik = (0x210000 >>> 239 | 0x210000 << ~239 + 1) & 0xFFFFFFFF;
        il = Long.reverse(-711126016218690484L);
        im = (5120 >>> 200 | 5120 << ~200 + 1) & 0xFFFFFFFF;
        in = (0x430000 >>> 112 | 0x430000 << -112) & 0xFFFFFFFF;
        io = Long.reverse(-7196309479632204724L);
        ip = Long.reverse(0x6A00000000000000L);
        iq = Integer.reverse(0x22000000);
        ir = Long.reverse(-7196309479632204724L);
        is = Long.reverse(0x6A00000000000000L);
        it = Integer.reverse(-1577058304);
        iu = (-1 >>> 187 | -1 << -187) & 0xFFFFFFFF;
        iv = Long.reverse(-711126016218690484L);
        iw = Integer.reverse(0);
        ix = (140 >>> 33 | 140 << ~33 + 1) & 0xFFFFFFFF;
        iy = Long.reverse(-711126016218690484L);
        iz = (1344 >>> 6 | 1344 << ~6 + 1) & 0xFFFFFFFF;
        ja = (0x11C00000 >>> 118 | 0x11C00000 << -118) & 0xFFFFFFFF;
        jb = Long.reverse(-7196309479632204724L);
        jc = Long.reverse(0x6A00000000000000L);
        jd = 0 >>> 78 | 0 << -78;
        var_java_lang_String_arr_a = new String[au];
        var_java_lang_String_arr_b = new String[av];
        NLoginCore_055.b();
        var_com_nickuc_login_NLoginCore_055_c = new NLoginCore_055((String)NLoginCore_055.c("㺃", (int)ba, (long)(bb ^ bc)), (String)NLoginCore_055.c("㺆", (int)bd, (long)(be ^ bf)), (String)NLoginCore_055.c("㺉", (int)bg, (long)bh), bi != 0);
        var_com_nickuc_login_NLoginCore_055_d = new NLoginCore_055((String)NLoginCore_055.c("㺏", (int)bn, (long)bo), (String)NLoginCore_055.c("㺒", (int)bp, (long)(bq ^ br)), bs != 0);
        var_com_nickuc_login_NLoginCore_055_e = new NLoginCore_055((String)NLoginCore_055.c("㺘", (int)(bx & by), (long)bz), (String)NLoginCore_055.c("㺛", (int)ca, (long)(cb ^ cc)), cd != 0);
        var_com_nickuc_login_NLoginCore_055_f = new NLoginCore_055((String)NLoginCore_055.c("㺡", (int)ci, (long)(cj ^ ck)), (String)NLoginCore_055.c("㺤", (int)cl, (long)cm));
        var_com_nickuc_login_NLoginCore_055_g = new NLoginCore_055((String)NLoginCore_055.c("㺪", (int)(cr & cs), (long)ct), (String)NLoginCore_055.c("㺭", (int)cu, (long)(cv ^ cw)), cx != 0);
        var_com_nickuc_login_NLoginCore_055_h = new NLoginCore_055((String)NLoginCore_055.c("㺳", (int)(dc & dd), (long)de), (String)NLoginCore_055.c("㺶", (int)df, (long)dg));
        var_com_nickuc_login_NLoginCore_055_i = new NLoginCore_055((String)NLoginCore_055.c("㺼", (int)dl, (long)dm), (String)NLoginCore_055.c("㺿", (int)dn, (long)(cfr_renamed_1 ^ dp)));
        var_com_nickuc_login_NLoginCore_055_j = new NLoginCore_055((String)NLoginCore_055.c("㻅", (int)du, (long)(dv ^ dw)), (String)NLoginCore_055.c("㻈", (int)dx, (long)(dy ^ dz)));
        var_com_nickuc_login_NLoginCore_055_k = new NLoginCore_055((String)NLoginCore_055.c("㻎", (int)ee, (long)(ef ^ eg)), (String)NLoginCore_055.c("㻑", (int)eh, (long)ei));
        var_com_nickuc_login_NLoginCore_055_l = new NLoginCore_055((String)NLoginCore_055.c("㻗", (int)en, (long)(eo ^ ep)), (String)NLoginCore_055.c("㻚", (int)eq, (long)er));
        var_com_nickuc_login_NLoginCore_055_m = new NLoginCore_055((String)NLoginCore_055.c("㻠", (int)ew, (long)(ex ^ ey)), (String)NLoginCore_055.c("㻣", (int)ez, (long)(fa ^ fb)), fc != 0);
        var_com_nickuc_login_NLoginCore_055_n = new NLoginCore_055((String)NLoginCore_055.c("㻩", (int)fh, (long)(fi ^ fj)), (String)NLoginCore_055.c("㻬", (int)fk, (long)(fl ^ fm)));
        var_com_nickuc_login_NLoginCore_055_o = new NLoginCore_055((String)NLoginCore_055.c("㻲", (int)(fq & fr), (long)fs), (String)NLoginCore_055.c("㻵", (int)ft, (long)(fu ^ fv)));
        var_com_nickuc_login_NLoginCore_055_p = new NLoginCore_055((String)NLoginCore_055.c("㻻", (int)fz, (long)(ga ^ gb)), (String)NLoginCore_055.c("㻾", (int)gc, (long)(gd ^ ge)), (String)NLoginCore_055.c("㼁", (int)gf, (long)(gg ^ gh)), gi != 0);
        var_com_nickuc_login_NLoginCore_055_q = new NLoginCore_055((String)NLoginCore_055.c("㼇", (int)gn, (long)go), (String)NLoginCore_055.c("㼊", (int)gp, (long)gq));
        var_com_nickuc_login_NLoginCore_055_r = new NLoginCore_055((String)NLoginCore_055.c("㼐", (int)gv, (long)(gw ^ gx)), (String)NLoginCore_055.c("㼓", (int)gy, (long)(gz ^ ha)));
        var_com_nickuc_login_NLoginCore_055_s = new NLoginCore_055((String)NLoginCore_055.c("㼙", (int)he, (long)hf), (String)NLoginCore_055.c("㼜", (int)hg, (long)hh));
        var_com_nickuc_login_NLoginCore_055_t = new NLoginCore_055((String)NLoginCore_055.c("㼢", (int)hl, (long)(hm ^ hn)), (String)NLoginCore_055.c("㼥", (int)(ho & hp), (long)hq));
        var_com_nickuc_login_NLoginCore_055_u = new NLoginCore_055((String)NLoginCore_055.c("㼫", (int)hv, (long)hw), (String)NLoginCore_055.c("㼮", (int)hx, (long)(hy ^ hz)));
        var_com_nickuc_login_NLoginCore_055_v = new NLoginCore_055((String)NLoginCore_055.c("㼴", (int)ie, (long)(cfr_renamed_0 ^ ig)), (String)NLoginCore_055.c("㼷", (int)ih, (long)(ii ^ ij)));
        var_com_nickuc_login_NLoginCore_055_w = new NLoginCore_055((String)NLoginCore_055.c("㼽", (int)in, (long)(io ^ ip)), (String)NLoginCore_055.c("㽀", (int)iq, (long)(ir ^ is)), (String)NLoginCore_055.c("㽃", (int)(it & iu), (long)iv), iw != 0);
        var_com_nickuc_login_NLoginCore_055_x = new NLoginCore_055(null, (String)NLoginCore_055.c("㽉", (int)ja, (long)(jb ^ jc)), null, jd != 0);
        var_com_nickuc_login_NLoginCore_055_arr_a = NLoginCore_055.a();
    }
}

