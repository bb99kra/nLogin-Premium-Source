/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_550;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_548;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_425
extends Enum<NLoginCore_425> {
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_a;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_b;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_c;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_d;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_e;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_f;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_g;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_h;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_i;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_j;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_k;
    public static final /* enum */ NLoginCore_425 var_com_nickuc_login_NLoginCore_425_l;
    private static final String[] var_java_lang_String_arr_f;
    public final String cT;
    private final boolean aS;
    private final int[] var_int_arr_ak;
    private static final /* synthetic */ NLoginCore_425[] var_com_nickuc_login_NLoginCore_425_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static long var_long_e;
    private static int var_int_f;
    private static long var_long_g;
    private static long var_long_h;
    private static int var_int_i;
    private static int var_int_j;
    private static double var_double_k;
    private static double var_double_l;
    private static double m;
    private static double n;
    private static double o;
    private static double p;
    private static int q;
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
    private static int var_int_ak;
    private static long al;
    private static long am;
    private static int an;
    private static int ao;
    private static long ap;
    private static int aq;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static int ba;
    private static int bb;
    private static long bc;
    private static long bd;
    private static int be;
    private static int bf;
    private static long bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static long bt;
    private static int bu;
    private static int bv;
    private static int bw;
    private static long bx;
    private static int by;
    private static int bz;
    private static int ca;
    private static int cb;
    private static int cc;
    private static int cd;
    private static int ce;
    private static int cf;
    private static int cg;
    private static int ch;
    private static int ci;
    private static int cj;
    private static long ck;
    private static long cl;
    private static int cm;
    private static int cn;
    private static int co;
    private static long cp;
    private static int cq;
    private static int cr;
    private static int cs;
    private static int ct;
    private static int cu;
    private static int cv;
    private static int cw;
    private static int cx;
    private static int cy;
    private static int cz;
    private static int da;
    private static int db;
    private static long dc;
    private static long dd;
    private static int de;
    private static int df;
    private static long dg;
    private static int dh;
    private static int di;
    private static int dj;
    private static int dk;
    private static int dl;
    private static int dm;
    private static int dn;
    private static int cfr_renamed_1;
    private static int dp;
    private static int dq;
    private static int dr;
    private static int ds;
    private static long dt;
    private static long du;
    private static int dv;
    private static int dw;
    private static long dx;
    private static long dy;
    private static int dz;
    private static int ea;
    private static int eb;
    private static int ec;
    private static int ed;
    private static int ee;
    private static int ef;
    private static int eg;
    private static int eh;
    private static int ei;
    private static int ej;
    private static int ek;
    private static long el;
    private static int em;
    private static int en;
    private static long eo;
    private static long ep;
    private static int eq;
    private static int er;
    private static int es;
    private static int et;
    private static int eu;
    private static int ev;
    private static int ew;
    private static int ex;
    private static int ey;
    private static int ez;
    private static int fa;
    private static int fb;
    private static int fc;
    private static long fd;
    private static int fe;
    private static int ff;
    private static long fg;
    private static int fh;
    private static int fi;
    private static int fj;
    private static int fk;
    private static int fl;
    private static int fm;
    private static int fn;
    private static int fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private static int fs;
    private static long ft;
    private static long fu;
    private static int fv;
    private static int fw;
    private static long fx;
    private static long fy;
    private static int fz;
    private static int ga;
    private static int gb;
    private static int gc;
    private static int gd;
    private static int ge;
    private static int gf;
    private static int gg;
    private static int gh;
    private static int gi;
    private static int gj;
    private static int gk;
    private static long gl;
    private static long gm;
    private static int gn;
    private static int go;
    private static long gp;
    private static long gq;
    private static int gr;
    private static int gs;
    private static int gt;
    private static int gu;
    private static int gv;
    private static int gw;
    private static int gx;
    private static int gy;
    private static int gz;
    private static int ha;
    private static int hb;
    private static int hc;
    private static int hd;
    private static long he;
    private static int hf;
    private static int hg;
    private static long hh;
    private static long hi;
    private static int hj;
    private static int hk;
    private static int hl;
    private static int hm;
    private static int hn;
    private static int ho;
    private static int hp;
    private static int hq;
    private static int hr;
    private static int hs;
    private static int ht;
    private static int hu;
    private static int hv;
    private static int hw;
    private static long hx;
    private static int hy;
    private static int hz;
    private static long ia;
    private static long ib;
    private static int ic;
    private static int id;
    private static int ie;
    private static int cfr_renamed_0;
    private static int ig;
    private static int ih;
    private static int ii;
    private static int ij;
    private static int ik;
    private static int il;
    private static int im;
    private static int in;
    private static int io;
    private static int ip;
    private static long iq;
    private static long ir;
    private static int is;
    private static int it;
    private static long iu;
    private static int iv;
    private static int iw;
    private static long ix;
    private static long iy;
    private static int iz;
    private static int ja;
    private static long jb;
    private static long jc;
    private static int jd;
    private static int je;
    private static int jf;
    private static long jg;

    private double b(TimeUnit timeUnit, long l) {
        switch (NLoginCore_550.aj[timeUnit.ordinal()]) {
            case 1: {
                return (double)l / var_double_k;
            }
            case 2: {
                return (double)l / var_double_l;
            }
            case 3: {
                return (double)l / m;
            }
            case 4: {
                return (double)l / n;
            }
            case 5: {
                return (double)l / o;
            }
            case 6: {
                return (double)l / p;
            }
        }
        return l;
    }

    public String b(TimeUnit timeUnit, int n) {
        double d = this.b(timeUnit, this.j());
        return this.b(d) + NLoginCore_112.a(d, n);
    }

    private NLoginCore_425(String string2, boolean bl, int ... nArray) {
        int n2 = var_int_b;
        if (nArray.length != var_int_c) {
            throw new IllegalArgumentException((String)NLoginCore_425.c("㺀", (int)var_int_d, (long)var_long_e));
        }
        this.cT = string2;
        this.aS = bl;
        this.var_int_arr_ak = nArray;
    }

    public boolean aS() {
        return NLoginCore_548.boolean_arr_a()[this.ordinal()];
    }

    private static void void_b() {
        int n;
        var_long_c = 4292532879227931485L;
        long l = var_long_c ^ 0xF26ACE0F19E340E7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(12 + 57), 83, (byte)(11 + 36), (byte)(53 + 14), (byte)(50 + 16), (byte)(4 + 63), 47, (byte)(60 + 20), (byte)(25 + 50), (byte)(63 + 4), (byte)(71 + 12), (byte)(8 + 45), (byte)(78 + 2), (byte)(27 + 70), (byte)(82 + 18), (byte)(77 + 23), (byte)(36 + 69), (byte)(80 + 30), (byte)(31 + 72)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
                    NLoginCore_425.var_java_lang_String_arr_b[0] = NLoginCore_092.E("֔֐նեՋ։էմծո։ը֊՟֡վմ֕գ֙դզսչ֨նառպքֆֲ֕նծյֻ֒չֶ֦֕֟ք", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ԟԊԽՌԜԨՐԭՍԨՒԝ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ưƋƋƮƇƊƍƋƘƬſƠƗƁƀưƠƝƊǈƥƷƥƯƝƽƿƪǂǎƿƪ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[3] = NLoginCore_201.F("ղնյ֕՗ֈձչ՘կնՠ֐֣ոողփբև֞ղկհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ƠƓƵƼƗƕƩƞƻƽŸƽƥƔƓƁƳƽƪǋƪǄƣƩƪƎơƤǋƞƨǓ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[5] = NLoginCore_223.F("լ՟մգօ֕թօևՙը֝֓՘յճհ֞բն֖֘կհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ƧơƴƮƩƝƾƾƜƓƮƾƲƑżƸƞƢƆŽƶƥƒƓ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[7] = NLoginCore_201.D("ԝԤԼԑԿԮԠԣՅԤԓԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ԣԈԏՃԎՒՁԌԨՌԹԐՔՑԔ՘ԗՒՔԷԚԻԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[9] = NLoginCore_091.F("ղլՠՊ֘ք֖֖՛Քիդ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[10] = NLoginCore_223.A("ƦŶƔƩƎƧŽƳŹǁƎƞƻƗơƽǁƂƟƆǇƕƒƓ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[11] = NLoginCore_324.B("ƌŰŰŵŹƐƚƼưƸǀƇ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[12] = NLoginCore_427.C("ԷԢԫԩՌՍՎՔԵԍԷԬԬԍԼԾԳԷԮՊՎՑԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[13] = NLoginCore_091.F("֒֊ֆփՑ֖֓֏֑ն՚դ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[14] = NLoginCore_091.C("ԸԘՑԺԨԥՇՂԏԠԎՒԩԼՇԨԼԞԴԻԻՑԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[15] = NLoginCore_138.D("ԆՀԈՃՏԪԦԯՔԢ԰ԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[16] = NLoginCore_004.B("ƢƂƻƤƒƏƱƬŹƊƂưƮƾƯƲƃƀƲƸǃƘƌƨǄǊƊƲǔǖǂǑ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[17] = NLoginCore_004.C("ԺՆԉԈՉ԰ՎԽՂՕԠԙ՚Ԛԗ՜՛Դ՝ԡ՟ՑԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[18] = NLoginCore_092.F("դ֏֔ՕՒՔե֒կը֟ղ֍ջնչ֤֖֓֓՛ղկհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[19] = NLoginCore_091.D("Ն԰ՇՇԻԤԢԢՍՂԏԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[20] = NLoginCore_559.D("ԝՈՍԎԋԍԞՋԨԡՙ԰ԨՎ՝ԕԭԪԜԼՑԫԨԩ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[21] = NLoginCore_324.F("օզցփՙ։գ֝ղղտդ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[22] = NLoginCore_138.F("ՓՈՠՠ֕ւ֏֛֙֐֋֚֒֟ՠդ֚ե֒֨ղ֘կհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[23] = NLoginCore_324.A("ŶůƨƱƔŽƭƝƑƽŽƇ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[24] = NLoginCore_446.C("ԈԻԊՅԩԞՊԽՆՌԒՙՆԧԜՈԷԲԞԳ՗ԱՃՖՆԯՂժզԼԵխ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[25] = NLoginCore_324.E("ա՟։ըև։խ֗է֖֙դ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[26] = NLoginCore_324.A("ƆƱƑƤŶƒƩƠŽƎƚƇ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[27] = NLoginCore_446.B("ŲƱƃƎżƎƛƠƜƲƖƇ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[28] = NLoginCore_446.E("բլ֑ղլքզ֌՚՝֝դ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[29] = NLoginCore_223.B("ƂƕƧƨƖƝŵƭƙƷƚƇ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[30] = NLoginCore_223.A("ƸƊƙƑƈųƿƊƞƴƒƇ", (byte)96, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_425.var_java_lang_String_arr_b[0] = NLoginCore_004.F("֔֐նեՋ։էմծո։ը֊՟֡վմ֕գ֙դզսչ֨նառպքֆ֕ց֭֮֩ֆշֱ֎ֽչ֋ք", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[1] = NLoginCore_092.D("ԘՀԥԜՂՀԐՄԧԨԏԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[2] = NLoginCore_173.B("ưƋƋƮƇƊƍƋƘƬſƠƗƁƀưƠƝƊǈƥƪƣƢƏƲƟƽǑǌǐƳ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[3] = NLoginCore_223.E("ղնյ֕՗ֈձչ՘կնխ֕րպ֑խ՝ռդբղկհ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[4] = NLoginCore_092.A("ƠƓƵƼƗƕƩƞƻƽŸƽƥƔƓƁƳƽƪǋƪƻƝưƌƹƬƦơǇƕǘ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[5] = NLoginCore_173.D("ԥԘԭԜԾՎԢԾՀԒԠԧ՛ՅԼ՛ԨՋԾԗԚաԨԩ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[6] = NLoginCore_173.B("ƧơƴƮƩƝƾƾƜƓƬźƾƾƖƟſǄƄƹƋƻƒƓ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[7] = NLoginCore_027.A("ƘűƅƺƩƬƫƩƿŷƁƞƺưƒƂƕǃǇƤƔƻƒƓ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[8] = NLoginCore_092.E("ժՏՖ֊Օ֙ֈՓկ֓րտ։֍֍֗խւ֝ոքղկհ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[9] = NLoginCore_173.F("֊գտ֍֙մ֗՚հ֛֕՗ՠս֖֖ճ՘և՞յ֘կհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[10] = NLoginCore_223.C("ԼԌԪԿԤԽԓՉԏ՗ԤՖՔԛՅԧՙԽԹԳԜԻԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[11] = NLoginCore_446.D("ԜԸԏԫՐԠՐՍԵԗՎԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[12] = NLoginCore_201.F("վթղհ֛֓֔֕ռՔվ֞֎իկ֔եքվ֦֢ղկհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[13] = NLoginCore_027.E("փղ֎ՠչւ֌օ֎Քյչ֢ց֖֙ր֚֞֝֗֨կհ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[14] = NLoginCore_027.E("տ՟֘ցկլ֎։ՖէՑ֘ծխ֛֝ՠձ֨։զօշն֚֮֠ոխցֈ֝", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[15] = NLoginCore_223.F("՝՞թ֐ՙճ֓ճվ֙֍դ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[16] = NLoginCore_324.F("տ՟֘ցկլ֎։Ֆէ՟֍֋֛֌֏ՠ՝֏֕֠յյք֣ւկ֐օխհժ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[17] = NLoginCore_324.B("ƤưųŲƳƚƸƧƬƿƊƝƐƂƺơƐƂƼƆƬƻƒƓ", (byte)96, 66);
                    NLoginCore_425.var_java_lang_String_arr_b[18] = NLoginCore_027.A("ƇƲƷŸŵŷƈƵƒƋǃƷƭƢƚǀƀƃǃƜƺƞƝǀǅƑƐƊƿƟǄƯ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[19] = NLoginCore_575.C("ԦՈՋԈԏԯԳԓԭԥՁԮԙԺՏ՜Լ՜ԽԽԺՑԨԩ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[20] = NLoginCore_384.F("դ֏֔ՕՒՔե֒կը֞ՙա֡֐֎֚֓մ֚֔֞փ֭ֈտսֱգժ֎֒", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[21] = NLoginCore_110.E("ծր֒֕խ֊Ւ֎զսևվվ֢֐՟օղ֛֞֓ղկհ", (byte)96, 69);
                    NLoginCore_425.var_java_lang_String_arr_b[22] = NLoginCore_110.D("ԌԁԙԙՎԻՈՒՔՉՃԭՆԱԵԮՈԳԒԾՋաԨԩ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[23] = NLoginCore_076.D("ԼԍԥԯՐՐԲԢՋՐՂԝ", (byte)96, 68);
                    NLoginCore_425.var_java_lang_String_arr_b[24] = NLoginCore_223.F("ՏւՑ֌հե֑ք֍֓ՙ֠֍ծգ֏վչեպ֞ոնթ֍֫։ֱ֧լժձ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[25] = NLoginCore_027.F("Վրխ֌֐֔լժ֋՜ճպթռյճմհ՟ցՠւկհ", (byte)96, 70);
                    NLoginCore_425.var_java_lang_String_arr_b[26] = NLoginCore_092.C("ԎԠԪԛԧԋԨԎՀՀԨԝ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[27] = NLoginCore_138.A("űŶźƓƖŻƬƧƱƜƴƇ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[28] = NLoginCore_091.A("ƙƍŷƗƇƳƞŽƚƞƴƇ", (byte)96, 65);
                    NLoginCore_425.var_java_lang_String_arr_b[29] = NLoginCore_575.C("ԘԤԱԛԜՉԯԨՖԵԗԝ", (byte)96, 67);
                    NLoginCore_425.var_java_lang_String_arr_b[30] = NLoginCore_138.B("ƐƘƐƲƝƋƻƘƽƀƴƇ", (byte)96, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_425.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ՏԬԞՀԨԣԦԨՍՔՇԶՙԣԷԕՑՓԜՁ՚ՑԨԩ", (byte)96, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_425.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ŮŹƬƒƉƒƮƍƬƢƗŻƙżƹƢƘƺǄƃƶƭǀƈƉƌǍǈƲƐƨƪ", (byte)96, 65);
                }
            }
        }
    }

    public static NLoginCore_425[] values() {
        return (NLoginCore_425[])var_com_nickuc_login_NLoginCore_425_arr_a.clone();
    }

    public long[] long_arr_b() {
        return NLoginCore_548.long_arr_arr_a()[this.ordinal()];
    }

    public static NLoginCore_425 valueOf(String string) {
        return Enum.valueOf(NLoginCore_425.class, string);
    }

    public long j() {
        long[] lArray;
        if (this.F()) {
            return 0L;
        }
        long l = 0L;
        long[] lArray2 = lArray = this.long_arr_b();
        int n = lArray2.length;
        for (int i = q; i < n; ++i) {
            long l2 = lArray2[i];
            l += l2;
        }
        return l / (long)(this.aS() ? lArray.length : this.y());
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_425.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.F("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 70), NLoginCore_425.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.B("ƒƟƞšơƝƘơƬƛŨƦƪƣƦƬŮӨӜԇԀӷԋԋԄӼӱӾӾӯƇ", (byte)88, 66) + string + NLoginCore_004.B("ũ", (byte)88, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 80 >>> 132 | 80 << ~132 + 1;
        var_int_c = Integer.reverse(-1610612736);
        var_int_d = (0 >>> 48 | 0 << -48) & 0xFFFFFFFF;
        var_long_e = Long.reverse(3374050117563992540L);
        var_int_f = (1024 >>> 10 | 1024 << -10) & 0xFFFFFFFF;
        var_long_g = Long.reverse(-4984630790835648036L);
        var_long_h = Long.reverse(-7782220156096217088L);
        var_int_i = (0 >>> 27 | 0 << ~27 + 1) & 0xFFFFFFFF;
        var_int_j = Integer.reverse(Integer.MIN_VALUE);
        var_double_k = Double.longBitsToDouble(Long.reverse(192770L));
        var_double_l = Double.longBitsToDouble(Long.reverse(18969730L));
        m = Double.longBitsToDouble(Long.reverse(2796794754L));
        n = Double.longBitsToDouble(Long.reverse(57731437634L));
        o = Double.longBitsToDouble(Long.reverse(702789996866L));
        p = Double.longBitsToDouble(Long.reverse(4166733122370L));
        q = 0 >>> 233 | 0 << -233;
        r = Integer.reverse(Integer.MIN_VALUE);
        s = (0 >>> 107 | 0 << -107) & 0xFFFFFFFF;
        t = 131072 >>> 17 | 131072 << ~17 + 1;
        u = Integer.reverse(0);
        v = Integer.reverse(0x30000000);
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = 8 >>> 162 | 8 << ~162 + 1;
        z = Integer.reverse(-1073741824);
        aa = (0x1000000 >>> 86 | 0x1000000 << ~86 + 1) & 0xFFFFFFFF;
        ab = (655360 >>> 177 | 655360 << ~177 + 1) & 0xFFFFFFFF;
        ac = (393216 >>> 48 | 393216 << -48) & 0xFFFFFFFF;
        ad = Integer.reverse(-536870912);
        ae = (0x2000000 >>> 118 | 0x2000000 << ~118 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(-1879048192);
        ag = Integer.reverse(0x50000000);
        ah = Integer.reverse(-805306368);
        ai = (0xF80000 >>> 243 | 0xF80000 << ~243 + 1) & 0xFFFFFFFF;
        aj = -1073741817 >>> 254 | -1073741817 << ~254 + 1;
        var_int_ak = 4096 >>> 43 | 4096 << ~43 + 1;
        al = Long.reverse(-4984630790835648036L);
        am = Long.reverse(-7782220156096217088L);
        an = Integer.reverse(0);
        ao = Integer.reverse(-1073741824);
        ap = Long.reverse(3374050117563992540L);
        aq = Integer.reverse(-1610612736);
        ar = Integer.reverse(0);
        as = (0x6000000 >>> 89 | 0x6000000 << -89) & 0xFFFFFFFF;
        at = (0x100000 >>> 20 | 0x100000 << ~20 + 1) & 0xFFFFFFFF;
        au = Integer.reverse(-1610612736);
        av = Integer.reverse(0x40000000);
        aw = Integer.reverse(0x10000000);
        ax = Integer.reverse(-1073741824);
        ay = 0xF000000 >>> 56 | 0xF000000 << ~56 + 1;
        az = Integer.reverse(0x20000000);
        ba = 0x280000 >>> 241 | 0x280000 << ~241 + 1;
        bb = Integer.reverse(0x20000000);
        bc = Long.reverse(-4984630790835648036L);
        bd = Long.reverse(-7782220156096217088L);
        be = 0x400000 >>> 54 | 0x400000 << -54;
        bf = Integer.reverse(-1610612736);
        bg = Long.reverse(3374050117563992540L);
        bh = Integer.reverse(-1610612736);
        bi = Integer.reverse(0);
        bj = 0x1400000 >>> 21 | 0x1400000 << ~21 + 1;
        bk = 64 >>> 70 | 64 << -70;
        bl = 0xA00000 >>> 211 | 0xA00000 << -211;
        bm = (262144 >>> 209 | 262144 << -209) & 0xFFFFFFFF;
        bn = Integer.reverse(0x78000000);
        bo = (196608 >>> 240 | 196608 << -240) & 0xFFFFFFFF;
        bp = 0x20000003 >>> 28 | 0x20000003 << ~28 + 1;
        bq = (256 >>> 230 | 256 << ~230 + 1) & 0xFFFFFFFF;
        br = (0x40000001 >>> 122 | 0x40000001 << -122) & 0xFFFFFFFF;
        bs = Integer.reverse(0x60000000);
        bt = Long.reverse(3374050117563992540L);
        bu = Integer.reverse(0x40000000);
        bv = (56 >>> 163 | 56 << ~163 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(-1);
        bx = Long.reverse(3374050117563992540L);
        by = (163840 >>> 143 | 163840 << -143) & 0xFFFFFFFF;
        bz = Integer.reverse(0);
        ca = (81920 >>> 237 | 81920 << ~237 + 1) & 0xFFFFFFFF;
        cb = Integer.reverse(Integer.MIN_VALUE);
        cc = Integer.reverse(0x28000000);
        cd = Integer.reverse(0x40000000);
        ce = -1073741821 >>> 29 | -1073741821 << ~29 + 1;
        cf = Integer.reverse(-1073741824);
        cg = 0x190000 >>> 111 | 0x190000 << ~111 + 1;
        ch = Integer.reverse(0x20000000);
        ci = (40 >>> 191 | 40 << ~191 + 1) & 0xFFFFFFFF;
        cj = (Integer.MIN_VALUE >>> 124 | Integer.MIN_VALUE << ~124 + 1) & 0xFFFFFFFF;
        ck = Long.reverse(-4984630790835648036L);
        cl = Long.reverse(-7782220156096217088L);
        cm = 0x180000 >>> 179 | 0x180000 << ~179 + 1;
        cn = Integer.reverse(-1879048192);
        co = Integer.reverse(-1);
        cp = Long.reverse(3374050117563992540L);
        cq = Integer.reverse(-1610612736);
        cr = (0 >>> 34 | 0 << -34) & 0xFFFFFFFF;
        cs = Integer.reverse(0x50000000);
        ct = Integer.reverse(Integer.MIN_VALUE);
        cu = 15 >>> 159 | 15 << -159;
        cv = (1024 >>> 73 | 1024 << ~73 + 1) & 0xFFFFFFFF;
        cw = Integer.reverse(0x4C000000);
        cx = (0x3000000 >>> 24 | 0x3000000 << ~24 + 1) & 0xFFFFFFFF;
        cy = -268435456 >>> 186 | -268435456 << -186;
        cz = Integer.reverse(0x20000000);
        da = Integer.reverse(0xA000000);
        db = 0x50000000 >>> 251 | 0x50000000 << -251;
        dc = Long.reverse(-4984630790835648036L);
        dd = Long.reverse(-7782220156096217088L);
        de = Integer.reverse(0x20000000);
        df = (11264 >>> 74 | 11264 << -74) & 0xFFFFFFFF;
        dg = Long.reverse(3374050117563992540L);
        dh = (0x140000 >>> 114 | 0x140000 << ~114 + 1) & 0xFFFFFFFF;
        di = Integer.reverse(0);
        dj = (768 >>> 136 | 768 << -136) & 0xFFFFFFFF;
        dk = Integer.reverse(Integer.MIN_VALUE);
        dl = Integer.reverse(-1610612736);
        dm = Integer.reverse(0x40000000);
        dn = Integer.reverse(0x50000000);
        cfr_renamed_1 = Integer.reverse(-1073741824);
        dp = (3840 >>> 136 | 3840 << ~136 + 1) & 0xFFFFFFFF;
        dq = Integer.reverse(0x20000000);
        dr = (0x2800000 >>> 213 | 0x2800000 << ~213 + 1) & 0xFFFFFFFF;
        ds = (3072 >>> 200 | 3072 << ~200 + 1) & 0xFFFFFFFF;
        dt = Long.reverse(-4984630790835648036L);
        du = Long.reverse(-7782220156096217088L);
        dv = (640 >>> 135 | 640 << -135) & 0xFFFFFFFF;
        dw = Integer.reverse(-1342177280);
        dx = Long.reverse(-4984630790835648036L);
        dy = Long.reverse(-7782220156096217088L);
        dz = 2560 >>> 137 | 2560 << ~137 + 1;
        ea = (0 >>> 168 | 0 << ~168 + 1) & 0xFFFFFFFF;
        eb = 0xC00000 >>> 118 | 0xC00000 << -118;
        ec = (32768 >>> 111 | 32768 << -111) & 0xFFFFFFFF;
        ed = Integer.reverse(-1610612736);
        ee = 524288 >>> 18 | 524288 << -18;
        ef = (0x28000000 >>> 250 | 0x28000000 << ~250 + 1) & 0xFFFFFFFF;
        eg = 0x60000000 >>> 253 | 0x60000000 << -253;
        eh = Integer.reverse(-268435456);
        ei = Integer.reverse(0x20000000);
        ej = (0x500000 >>> 242 | 0x500000 << ~242 + 1) & 0xFFFFFFFF;
        ek = 448 >>> 101 | 448 << ~101 + 1;
        el = Long.reverse(3374050117563992540L);
        em = Integer.reverse(0x60000000);
        en = (491520 >>> 15 | 491520 << ~15 + 1) & 0xFFFFFFFF;
        eo = Long.reverse(-4984630790835648036L);
        ep = Long.reverse(-7782220156096217088L);
        eq = (160 >>> 165 | 160 << -165) & 0xFFFFFFFF;
        er = 0 >>> 154 | 0 << -154;
        es = Integer.reverse(-1744830464);
        et = (0x100000 >>> 180 | 0x100000 << -180) & 0xFFFFFFFF;
        eu = 12800 >>> 104 | 12800 << ~104 + 1;
        ev = Integer.reverse(0x40000000);
        ew = (0x64000000 >>> 120 | 0x64000000 << ~120 + 1) & 0xFFFFFFFF;
        ex = Integer.reverse(-1073741824);
        ey = 204800 >>> 42 | 204800 << ~42 + 1;
        ez = Integer.reverse(0x20000000);
        fa = Integer.reverse(796917760);
        fb = 128 >>> 35 | 128 << ~35 + 1;
        fc = -1 >>> 129 | -1 << ~129 + 1;
        fd = Long.reverse(3374050117563992540L);
        fe = Integer.reverse(-536870912);
        ff = Integer.reverse(-2013265920);
        fg = Long.reverse(3374050117563992540L);
        fh = Integer.reverse(-1610612736);
        fi = (0 >>> 3 | 0 << -3) & 0xFFFFFFFF;
        fj = Integer.reverse(0x5F000000);
        fk = 128 >>> 167 | 128 << ~167 + 1;
        fl = (512000 >>> 74 | 512000 << -74) & 0xFFFFFFFF;
        fm = (0x800000 >>> 182 | 0x800000 << ~182 + 1) & 0xFFFFFFFF;
        fn = Integer.reverse(0x77400000);
        fo = Integer.reverse(-1073741824);
        fp = -1149239296 >>> 53 | -1149239296 << -53;
        fq = Integer.reverse(0x20000000);
        fr = Integer.reverse(596639744);
        fs = (589824 >>> 207 | 589824 << ~207 + 1) & 0xFFFFFFFF;
        ft = Long.reverse(-4984630790835648036L);
        fu = Long.reverse(-7782220156096217088L);
        fv = Integer.reverse(0x10000000);
        fw = Integer.reverse(-939524096);
        fx = Long.reverse(-4984630790835648036L);
        fy = Long.reverse(-7782220156096217088L);
        fz = 0xA000000 >>> 153 | 0xA000000 << ~153 + 1;
        ga = Integer.reverse(0);
        gb = Integer.reverse(-1610612736);
        gc = 0x10000000 >>> 92 | 0x10000000 << -92;
        gd = Integer.reverse(0x50000000);
        ge = (2 >>> 96 | 2 << ~96 + 1) & 0xFFFFFFFF;
        gf = Integer.reverse(0x28000000);
        gg = Integer.reverse(-1073741824);
        gh = -1879048191 >>> 123 | -1879048191 << -123;
        gi = Integer.reverse(0x20000000);
        gj = Integer.reverse(0x26000000);
        gk = (20 >>> 128 | 20 << -128) & 0xFFFFFFFF;
        gl = Long.reverse(-4984630790835648036L);
        gm = Long.reverse(-7782220156096217088L);
        gn = 1152 >>> 39 | 1152 << ~39 + 1;
        go = Integer.reverse(-1476395008);
        gp = Long.reverse(-4984630790835648036L);
        gq = Long.reverse(-7782220156096217088L);
        gr = Integer.reverse(-1610612736);
        gs = 0 >>> 197 | 0 << -197;
        gt = 640 >>> 70 | 640 << ~70 + 1;
        gu = (64 >>> 70 | 64 << ~70 + 1) & 0xFFFFFFFF;
        gv = Integer.reverse(0x28000000);
        gw = 0x1000000 >>> 119 | 0x1000000 << -119;
        gx = Integer.reverse(0x4C000000);
        gy = (393216 >>> 49 | 393216 << ~49 + 1) & 0xFFFFFFFF;
        gz = (5120 >>> 198 | 5120 << ~198 + 1) & 0xFFFFFFFF;
        ha = Integer.reverse(0x20000000);
        hb = 15360 >>> 135 | 15360 << -135;
        hc = 0x5800000 >>> 150 | 0x5800000 << -150;
        hd = Integer.reverse(-1);
        he = Long.reverse(3374050117563992540L);
        hf = (-1610612736 >>> 124 | -1610612736 << -124) & 0xFFFFFFFF;
        hg = Integer.reverse(-402653184);
        hh = Long.reverse(-4984630790835648036L);
        hi = Long.reverse(-7782220156096217088L);
        hj = 4 >>> 66 | 4 << -66;
        hk = (0x5000000 >>> 152 | 0x5000000 << -152) & 0xFFFFFFFF;
        hl = 0 >>> 84 | 0 << ~84 + 1;
        hm = Integer.reverse(0x13000000);
        hn = (0x20000000 >>> 29 | 0x20000000 << ~29 + 1) & 0xFFFFFFFF;
        ho = Integer.reverse(0x9800000);
        hp = 8192 >>> 140 | 8192 << -140;
        hq = -2147483611 >>> 124 | -2147483611 << -124;
        hr = Integer.reverse(-1073741824);
        hs = Integer.reverse(0x4C00000);
        ht = Integer.reverse(0x20000000);
        hu = Integer.reverse(398458880);
        hv = Integer.reverse(0x18000000);
        hw = Integer.reverse(-1);
        hx = Long.reverse(3374050117563992540L);
        hy = Integer.reverse(-805306368);
        hz = Integer.reverse(-1744830464);
        ia = Long.reverse(-4984630790835648036L);
        ib = Long.reverse(-7782220156096217088L);
        ic = 1280 >>> 168 | 1280 << -168;
        id = 0 >>> 90 | 0 << ~90 + 1;
        ie = 0x20000003 >>> 91 | 0x20000003 << -91;
        cfr_renamed_0 = Integer.reverse(Integer.MIN_VALUE);
        ig = Integer.reverse(0x5F000000);
        ih = Integer.reverse(0x40000000);
        ii = (0xFA0000 >>> 175 | 0xFA0000 << -175) & 0xFFFFFFFF;
        ij = 98304 >>> 15 | 98304 << ~15 + 1;
        ik = Integer.reverse(0x77400000);
        il = 2 >>> 31 | 2 << -31;
        im = (0x1770000 >>> 78 | 0x1770000 << -78) & 0xFFFFFFFF;
        in = (0x280000 >>> 179 | 0x280000 << -179) & 0xFFFFFFFF;
        io = 0 >>> 118 | 0 << -118;
        ip = (106496 >>> 236 | 106496 << -236) & 0xFFFFFFFF;
        iq = Long.reverse(-4984630790835648036L);
        ir = Long.reverse(-7782220156096217088L);
        is = Integer.reverse(Integer.MIN_VALUE);
        it = Integer.reverse(-671088640);
        iu = Long.reverse(3374050117563992540L);
        iv = 8 >>> 226 | 8 << ~226 + 1;
        iw = Integer.reverse(0x38000000);
        ix = Long.reverse(-4984630790835648036L);
        iy = Long.reverse(-7782220156096217088L);
        iz = Integer.reverse(-1073741824);
        ja = Integer.reverse(-1207959552);
        jb = Long.reverse(-4984630790835648036L);
        jc = Long.reverse(-7782220156096217088L);
        jd = Integer.reverse(0x20000000);
        je = Integer.reverse(0x78000000);
        jf = Integer.reverse(-1);
        jg = Long.reverse(3374050117563992540L);
        var_java_lang_String_arr_a = new String[ai];
        var_java_lang_String_arr_b = new String[aj];
        NLoginCore_425.void_b();
        int[] nArray = new int[aq];
        nArray[NLoginCore_425.ar] = as;
        nArray[NLoginCore_425.at] = au;
        nArray[NLoginCore_425.av] = aw;
        nArray[NLoginCore_425.ax] = ay;
        nArray[NLoginCore_425.az] = ba;
        var_com_nickuc_login_NLoginCore_425_a = new NLoginCore_425((String)NLoginCore_425.c("㺃", (int)ao, (long)ap), nArray);
        int[] nArray2 = new int[bh];
        nArray2[NLoginCore_425.bi] = bj;
        nArray2[NLoginCore_425.bk] = bl;
        nArray2[NLoginCore_425.bm] = bn;
        nArray2[NLoginCore_425.bo] = bp;
        nArray2[NLoginCore_425.bq] = br;
        var_com_nickuc_login_NLoginCore_425_b = new NLoginCore_425((String)NLoginCore_425.c("㺉", (int)bf, (long)bg), nArray2);
        int[] nArray3 = new int[by];
        nArray3[NLoginCore_425.bz] = ca;
        nArray3[NLoginCore_425.cb] = cc;
        nArray3[NLoginCore_425.cd] = ce;
        nArray3[NLoginCore_425.cf] = cg;
        nArray3[NLoginCore_425.ch] = ci;
        var_com_nickuc_login_NLoginCore_425_c = new NLoginCore_425((String)NLoginCore_425.c("㺏", (int)(bv & bw), (long)bx), nArray3);
        int[] nArray4 = new int[cq];
        nArray4[NLoginCore_425.cr] = cs;
        nArray4[NLoginCore_425.ct] = cu;
        nArray4[NLoginCore_425.cv] = cw;
        nArray4[NLoginCore_425.cx] = cy;
        nArray4[NLoginCore_425.cz] = da;
        var_com_nickuc_login_NLoginCore_425_d = new NLoginCore_425((String)NLoginCore_425.c("㺕", (int)(cn & co), (long)cp), nArray4);
        int[] nArray5 = new int[dh];
        nArray5[NLoginCore_425.di] = dj;
        nArray5[NLoginCore_425.dk] = dl;
        nArray5[NLoginCore_425.dm] = dn;
        nArray5[NLoginCore_425.cfr_renamed_1] = dp;
        nArray5[NLoginCore_425.dq] = dr;
        var_com_nickuc_login_NLoginCore_425_e = new NLoginCore_425((String)NLoginCore_425.c("㺛", (int)df, (long)dg), nArray5);
        int[] nArray6 = new int[dz];
        nArray6[NLoginCore_425.ea] = eb;
        nArray6[NLoginCore_425.ec] = ed;
        nArray6[NLoginCore_425.ee] = ef;
        nArray6[NLoginCore_425.eg] = eh;
        nArray6[NLoginCore_425.ei] = ej;
        var_com_nickuc_login_NLoginCore_425_f = new NLoginCore_425((String)NLoginCore_425.c("㺡", (int)dw, (long)(dx ^ dy)), nArray6);
        int[] nArray7 = new int[eq];
        nArray7[NLoginCore_425.er] = es;
        nArray7[NLoginCore_425.et] = eu;
        nArray7[NLoginCore_425.ev] = ew;
        nArray7[NLoginCore_425.ex] = ey;
        nArray7[NLoginCore_425.ez] = fa;
        var_com_nickuc_login_NLoginCore_425_g = new NLoginCore_425((String)NLoginCore_425.c("㺧", (int)en, (long)(eo ^ ep)), nArray7);
        int[] nArray8 = new int[fh];
        nArray8[NLoginCore_425.fi] = fj;
        nArray8[NLoginCore_425.fk] = fl;
        nArray8[NLoginCore_425.fm] = fn;
        nArray8[NLoginCore_425.fo] = fp;
        nArray8[NLoginCore_425.fq] = fr;
        var_com_nickuc_login_NLoginCore_425_h = new NLoginCore_425((String)NLoginCore_425.c("㺭", (int)ff, (long)fg), nArray8);
        int[] nArray9 = new int[fz];
        nArray9[NLoginCore_425.ga] = gb;
        nArray9[NLoginCore_425.gc] = gd;
        nArray9[NLoginCore_425.ge] = gf;
        nArray9[NLoginCore_425.gg] = gh;
        nArray9[NLoginCore_425.gi] = gj;
        var_com_nickuc_login_NLoginCore_425_i = new NLoginCore_425((String)NLoginCore_425.c("㺳", (int)fw, (long)(fx ^ fy)), nArray9);
        int[] nArray10 = new int[gr];
        nArray10[NLoginCore_425.gs] = gt;
        nArray10[NLoginCore_425.gu] = gv;
        nArray10[NLoginCore_425.gw] = gx;
        nArray10[NLoginCore_425.gy] = gz;
        nArray10[NLoginCore_425.ha] = hb;
        var_com_nickuc_login_NLoginCore_425_j = new NLoginCore_425((String)NLoginCore_425.c("㺹", (int)go, (long)(gp ^ gq)), nArray10);
        int[] nArray11 = new int[hk];
        nArray11[NLoginCore_425.hl] = hm;
        nArray11[NLoginCore_425.hn] = ho;
        nArray11[NLoginCore_425.hp] = hq;
        nArray11[NLoginCore_425.hr] = hs;
        nArray11[NLoginCore_425.ht] = hu;
        var_com_nickuc_login_NLoginCore_425_k = new NLoginCore_425((String)NLoginCore_425.c("㺿", (int)hg, (long)(hh ^ hi)), hj != 0, nArray11);
        int[] nArray12 = new int[ic];
        nArray12[NLoginCore_425.id] = ie;
        nArray12[NLoginCore_425.cfr_renamed_0] = ig;
        nArray12[NLoginCore_425.ih] = ii;
        nArray12[NLoginCore_425.ij] = ik;
        nArray12[NLoginCore_425.il] = im;
        var_com_nickuc_login_NLoginCore_425_l = new NLoginCore_425((String)NLoginCore_425.c("㻅", (int)hz, (long)(ia ^ ib)), nArray12);
        var_com_nickuc_login_NLoginCore_425_arr_a = NLoginCore_425.a();
        String[] stringArray = new String[in];
        stringArray[NLoginCore_425.io] = NLoginCore_425.c("㻈", (int)ip, (long)(iq ^ ir));
        stringArray[NLoginCore_425.is] = NLoginCore_425.c("㻋", (int)it, (long)iu);
        stringArray[NLoginCore_425.iv] = NLoginCore_425.c("㻎", (int)iw, (long)(ix ^ iy));
        stringArray[NLoginCore_425.iz] = NLoginCore_425.c("㻑", (int)ja, (long)(jb ^ jc));
        stringArray[NLoginCore_425.jd] = NLoginCore_425.c("㻔", (int)(je & jf), (long)jg);
        var_java_lang_String_arr_f = stringArray;
    }

    public boolean aT() {
        return (this.aS && this.F() ? t : u) != 0;
    }

    public long k() {
        return NLoginCore_548.long_arr_a()[this.ordinal()];
    }

    public String c(TimeUnit timeUnit, int n) {
        double d = this.b(timeUnit, this.k());
        return this.b(d) + NLoginCore_112.a(d, n);
    }

    public boolean F() {
        return (!this.aS() && this.y() == 0 ? r : s) != 0;
    }

    private String b(double d) {
        if (d <= 0.0) {
            return NLoginCore_425.c("㺀", (int)var_int_f, (long)(var_long_g ^ var_long_h));
        }
        for (int i = var_int_i; i < this.var_int_arr_ak.length; ++i) {
            if (!(d <= (double)this.var_int_arr_ak[i])) continue;
            return var_java_lang_String_arr_f[i];
        }
        return var_java_lang_String_arr_f[var_java_lang_String_arr_f.length - var_int_j];
    }

    private static /* synthetic */ NLoginCore_425[] a() {
        NLoginCore_425[] NLoginCore_425Array = new NLoginCore_425[v];
        NLoginCore_425Array[NLoginCore_425.w] = var_com_nickuc_login_NLoginCore_425_a;
        NLoginCore_425Array[NLoginCore_425.x] = var_com_nickuc_login_NLoginCore_425_b;
        NLoginCore_425Array[NLoginCore_425.y] = var_com_nickuc_login_NLoginCore_425_c;
        NLoginCore_425Array[NLoginCore_425.z] = var_com_nickuc_login_NLoginCore_425_d;
        NLoginCore_425Array[NLoginCore_425.aa] = var_com_nickuc_login_NLoginCore_425_e;
        NLoginCore_425Array[NLoginCore_425.ab] = var_com_nickuc_login_NLoginCore_425_f;
        NLoginCore_425Array[NLoginCore_425.ac] = var_com_nickuc_login_NLoginCore_425_g;
        NLoginCore_425Array[NLoginCore_425.ad] = var_com_nickuc_login_NLoginCore_425_h;
        NLoginCore_425Array[NLoginCore_425.ae] = var_com_nickuc_login_NLoginCore_425_i;
        NLoginCore_425Array[NLoginCore_425.af] = var_com_nickuc_login_NLoginCore_425_j;
        NLoginCore_425Array[NLoginCore_425.ag] = var_com_nickuc_login_NLoginCore_425_k;
        NLoginCore_425Array[NLoginCore_425.ah] = var_com_nickuc_login_NLoginCore_425_l;
        return NLoginCore_425Array;
    }

    private static String a(int n, long l) {
        l ^= 0x29L;
        l ^= 0xF26ACE0F19E340E7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(59 + 10), (byte)(21 + 62), (byte)(25 + 22), (byte)(38 + 29), 66, (byte)(3 + 64), (byte)(21 + 26), (byte)(26 + 54), (byte)(67 + 8), (byte)(2 + 65), (byte)(17 + 66), (byte)(7 + 46), (byte)(2 + 78), (byte)(4 + 93), (byte)(74 + 26), (byte)(5 + 95), 105, (byte)(40 + 70), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("ԼՉՈԋՋՇՂՋՖՅԒՐՔՍՐՖԘ࢒ࢆࢱࢪࢡࢵࢵࢮࢦ࢛ࢨࢨ࢙", (byte)29, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_425.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private NLoginCore_425(String string2, int ... nArray) {
        this(string2, var_int_a != 0, nArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int y() {
        Object object = NLoginCore_548.java_lang_Object_arr_a()[this.ordinal()];
        synchronized (object) {
            return NLoginCore_548.int_arr_a()[this.ordinal()];
        }
    }
}

