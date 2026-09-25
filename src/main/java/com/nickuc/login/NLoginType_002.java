/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.TwoFactorType
 *  com.nickuc.login.api.enums.event.EventEnum
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_039;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_438;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_048;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_030;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_335;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginType_002
extends NLoginType_032 {
    private static int gk;
    private static int in;
    private static int fc;
    private static int cm;
    private static int ia;
    private static int gy;
    private static int kj;
    private static int gt;
    private static int kb;
    private static int er;
    private static int jw;
    private static int gs;
    private static long dt;
    private static int bu;
    private static int iz;
    private static int ef;
    private static int bp;
    private static int ba;
    private static long fd;
    private static long kg;
    private static long dw;
    private static long fk;
    private static int io;
    private static int gg;
    private static int ej;
    private static int hi;
    private static int gm;
    private static int ey;
    private static long cy;
    private static int eb;
    private static int js;
    private static int fg;
    private static long jk;
    private static int iq;
    private static int bo;
    private static int gh;
    private static int jj;
    private static long bv;
    private static int ca;
    private static int gu;
    private static int az;
    private static long cg;
    private static long kl;
    private static long br;
    private static long gb;
    private static int ep;
    private static int hf;
    private static int cj;
    private static long df;
    private static long dg;
    private static long bk;
    private static int ju;
    private static int fw;
    private static int av;
    private static int ke;
    private static int hk;
    private static int ch;
    private static long ez;
    private static int gw;
    private static long gf;
    private static int ib;
    private static int jg;
    private static int fy;
    private static int de;
    private static int aw;
    private static int jm;
    private static int cz;
    private static int ik;
    private static long dq;
    private static int jo;
    private static int et;
    private static int gp;
    private static final List<String> f;
    private static int ea;
    private static long fo;
    private static int gq;
    private static int iw;
    private static int bm;
    private static long bz;
    private static int dh;
    private static int hy;
    private static int is;
    private static int jh;
    private static int jx;
    private static int jc;
    private static long iy;
    private static long cd;
    private static int kf;
    private static int dv;
    private static int cr;
    private static long di;
    private static int hw;
    private static long hp;
    private static int cv;
    private static int hn;
    private static int ed;
    private static int jb;
    private static int kk;
    private static int iu;
    private static int ip;
    private static int hd;
    private static String[] c;
    private static int eo;
    private static long kd;
    private static int je;
    private static int hg;
    private static int cf;
    private static long ei;
    private static int jq;
    private static long dc;
    private static int go;
    private static int hu;
    private static int ji;
    private static long cw;
    private static long ho;
    private static int bc;
    private static long jz;
    private static int dn;
    private static int dy;
    private static long dz;
    private static long gx;
    private static long be;
    private static long fl;
    private static int iv;
    private static int jl;
    private static int ij;
    private static long da;
    private static int fb;
    private static int en;
    private static int bf;
    private static int bq;
    private static int fv;
    private static long gi;
    private static int dx;
    private static int cp;
    private static long cfr_renamed_0;
    private static int jn;
    private static int db;
    private static int il;
    private static long hm;
    private static int es;
    private static int ex;
    private static int fu;
    private static long ee;
    protected final NLoginCore_248 var_com_nickuc_login_NLoginCore_311_a;
    private static int ic;
    private static int ig;
    private static int bi;
    private static int jp;
    private static long ek;
    private static int fz;
    private static int ki;
    private static int fh;
    private static int jv;
    private static int gl;
    private static int ev;
    private static int hq;
    private static int bx;
    private static int ci;
    private static int dk;
    private static long gn;
    private static long dl;
    private static int ie;
    private static int bn;
    private static long bs;
    private static int ay;
    private static long bg;
    private static int ff;
    private static long by;
    private static int id;
    private static long dj;
    private static long fp;
    private static long e;
    private static int hx;
    private static int hb;
    private static int ih;
    private static int fj;
    private static int ew;
    private static int cn;
    private static int jr;
    private static String[] d;
    private static int hv;
    private static int dm;
    private static long cs;
    private static int ck;
    private static int co;
    private static int cx;
    private static int ft;
    private static int cu;
    private static int ja;
    private static long ga;
    private static int eu;
    private static int jf;
    private static int hh;
    private static int jd;
    private static int fm;
    private static int eg;
    private static int he;
    private static int cl;
    private static long ct;
    private static long jy;
    private static int fr;
    private static int ix;
    private static long dd;
    private static int eq;
    private static int ha;
    private static int ir;
    private static int bl;
    private static int hz;
    private static int hs;
    private static int gc;
    private static int bt;
    private static int it;
    private static long fe;
    private static long dr;
    private static int gv;
    private static int eh;
    private static int ka;
    private static long ge;
    private static int fn;
    private static int fq;
    private static int hr;
    private static long fi;
    private static long cfr_renamed_1;
    private static int fx;
    private static long du;
    private static long cq;
    private static int cb;
    private static long bb;
    private static long bd;
    private static int im;
    private static int ht;
    private static int ce;
    private static int hc;
    private static long cc;
    private static long bh;
    private static long gz;
    private static long el;
    private static long kh;
    private static int dp;
    private static int gd;
    private static long gj;
    private static int fs;
    private static int fa;
    private static int var_int_a;
    private static int em;
    private static int ds;
    private static long kc;
    private static int ii;
    private static long hl;
    private static int bj;
    private static long hj;
    private static int ec;
    private static int jt;
    private static int ax;
    private static int bw;
    private static int gr;

    @Override
    protected List<String> b(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        return stringArray.length <= gr ? NLoginCore_039.a(f, stringArray) : null;
    }

    private static void b() {
        int n;
        e = 7879132582967738374L;
        long l = e ^ 0x34405499CF078050L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(31 + 38), (byte)(26 + 57), (byte)(19 + 28), (byte)(10 + 57), (byte)(17 + 49), (byte)(3 + 64), (byte)(5 + 42), 80, (byte)(22 + 53), (byte)(66 + 1), (byte)(27 + 56), (byte)(12 + 41), (byte)(6 + 74), (byte)(96 + 1), (byte)(54 + 46), (byte)(84 + 16), (byte)(6 + 99), (byte)(11 + 99), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
                    NLoginType_002.d[0] = NLoginCore_091.F("օգհ՗ջՙ֞ո֗։ցզ", (byte)98, 70);
                    NLoginType_002.d[1] = NLoginCore_427.E("֐֋ճ֑և՛֐իծլթզ", (byte)98, 69);
                    NLoginType_002.d[2] = NLoginCore_453.E("՗ւ֐֍Փ֓֒Ք՚֛֕զ", (byte)98, 69);
                    NLoginType_002.d[3] = NLoginCore_027.C("ՍՈ԰ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
                    NLoginType_002.d[4] = NLoginCore_110.D("ԭԳԭՉԮԖՇ՜ՅԹՔԣ", (byte)98, 68);
                    NLoginType_002.d[5] = NLoginCore_092.C("ՍՈ԰ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
                    NLoginType_002.d[6] = NLoginCore_091.C("ՍՈ԰ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
                    NLoginType_002.d[7] = NLoginCore_138.A("ƑƩƹƷƖƊƲƻƳƖŽƋ", (byte)98, 65);
                    NLoginType_002.d[8] = NLoginCore_091.A("ƑƩƹƷƖƊƲƻƳƖŽƋ", (byte)98, 65);
                    NLoginType_002.d[9] = NLoginCore_004.E("եե։֙՗ո։՝ըթյզ", (byte)98, 69);
                    NLoginType_002.d[10] = NLoginCore_559.D("ՑԑԮՁՇՎՄԺՊԺԙԣ", (byte)98, 68);
                    NLoginType_002.d[11] = NLoginCore_559.B("ƴŹƆƭƽƝǂƿƕƭƞƋ", (byte)98, 66);
                    NLoginType_002.d[12] = NLoginCore_324.E("տկյգ՗թիֆջմ֛զ", (byte)98, 69);
                    NLoginType_002.d[13] = NLoginCore_446.F("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 70);
                    NLoginType_002.d[14] = NLoginCore_091.A("ƉƓƍƜƓƠƹƽƝƟƤƖźƚǆƺƢƗƻƟǄƙƖƗ", (byte)98, 65);
                    NLoginType_002.d[15] = NLoginCore_223.E("էճև֗Ւելճ՚֓֗զ", (byte)98, 69);
                    NLoginType_002.d[16] = NLoginCore_559.B("ƹŹƖƩƯƶƬƢƲƢƁƋ", (byte)98, 66);
                    NLoginType_002.d[17] = NLoginCore_384.B("ƌƘƬƼŷƊƑƘſƸƼƋ", (byte)98, 66);
                    NLoginType_002.d[18] = NLoginCore_559.B("ƫųƫƸƈƀƟǁƂƽƕƾƶƣƕƬƤƥƈǊƝƇƟƒƵǔǀƉǏƦƓƘƒǊưǛƩǟƬǚǑƛƝƫ", (byte)98, 66);
                    NLoginType_002.d[19] = NLoginCore_091.A("ƷƫƏƺƓžƟƜƣŻžưƚƳƽƨƖƵƟƥǌƊơƓǍǅǒƑǇƶƸƑǆǌǜƶƽƺǣǐǁǢǁǛǒƾǚǠǕǝǩƺƩƨƭǉƭǎǟǖǂǵǬǯǗǰǞǧǮȀǀǘǕǿǢǱȁȉǟǽǾǵǞǌǠǹǳǯȔǬǦȉǭǺǰǧǷȑșǽǴǘȡǵǞȖȐǫ", (byte)98, 65);
                    NLoginType_002.d[20] = NLoginCore_092.C("ԊԥԡՌԶԮՊՏ԰ԦԘԕԚԛաԚ՜ՐԴ԰ԣէՈ՜՗ե՝զՎծգՇՄՌըԲՀՔկԸռջԵՃ", (byte)98, 67);
                    NLoginType_002.d[21] = NLoginCore_004.E("ցձշՒծդ֑Րտվ֛֜ճ՝֔֝շևա։նս֪օփֲ֣ձխִղվկհִշֈչ֎ևִֿ֠սպ֣׀ֿ֯׈ִ֝ևׅ֤ׄ֬׃ֻ׉׍֭׌׋׋֊֦֘ה׋ח֛֮֘גגֳּוּדךַּןֱֲִ", (byte)98, 69);
                    NLoginType_002.d[22] = NLoginCore_173.C("ՕԱԿԶՍԨ԰ՅՕՔ՚ԺՋԿԪԜՅԵԷբԳԱԮԯ", (byte)98, 67);
                    NLoginType_002.d[23] = NLoginCore_384.A("ƺƕŶƈƻƓžƸžƹƸƋ", (byte)98, 65);
                    NLoginType_002.d[24] = NLoginCore_091.F("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 70);
                    NLoginType_002.d[25] = NLoginCore_201.A("ƉƓƍƜƓƠƹƽƝƟƢƿƝǁƉƪǅƃƮƨǐǋƚƭƧǇƿƗǖǐǏǗ", (byte)98, 65);
                    NLoginType_002.d[26] = NLoginCore_110.A("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƟǅƉƳǓƯǏǙǑǈƸ", (byte)98, 65);
                    NLoginType_002.d[27] = NLoginCore_324.D("ՓԨԓԵԎԙԶՍԗԼԬԖ՘ՊՒՕՒՒԿԼըԷԨՁԴ՚Խ՗ըԱՂՆՓԿՊժՄՑշԹնխՏՐՖցՋԽՌդվհՐ։նՈցա՚֏՛ՠգ֊", (byte)98, 68);
                    NLoginType_002.d[28] = NLoginCore_446.F("ոբ՗֚շօոճտ֒՜զ", (byte)98, 70);
                    NLoginType_002.d[29] = NLoginCore_559.C("ԌԕՕԫԢՓԶ՗ՄԚԧԲՌԾԺԫԯԣԺդԶՄէՔըԼՀՎդԮԻՃժՒղծգզՓՐլկմՃ", (byte)98, 67);
                    NLoginType_002.d[30] = NLoginCore_223.C("ԾԤԐԵՍԺԔԒՅՕ՜ԣ", (byte)98, 67);
                    NLoginType_002.d[31] = NLoginCore_173.A("ƴƦƳŽƕƐƛżƹƔƁƋ", (byte)98, 65);
                    NLoginType_002.d[32] = NLoginCore_559.F("֕հՑգ֖ծՙ֓ՙ֔֓զ", (byte)98, 70);
                    NLoginType_002.d[33] = NLoginCore_027.F("քխժհջթձ֚էղսզ", (byte)98, 70);
                    NLoginType_002.d[34] = NLoginCore_575.B("ƸƌƒƭƸŹƖƓƽƻƁƋ", (byte)98, 66);
                    NLoginType_002.d[35] = NLoginCore_201.E("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 69);
                    NLoginType_002.d[36] = NLoginCore_451.F("֔ծաբե՛յ՗֙֍թզ", (byte)98, 70);
                    NLoginType_002.d[37] = NLoginCore_092.F("՟ևհջք֎֎ոռշ֢նպվն֧֕՚նյֆ֧֠֟֊֏֣֐խ֢֔֞", (byte)98, 70);
                    NLoginType_002.d[38] = NLoginCore_092.A("ƭųƶƪƫƝƕƔƣƣƔƅưƔơǃƚƕƽơǋƙǋƳƢǑƲǌǌƕƙǐƱƏǛƽǖƝƝƬƮƳƥƫ", (byte)98, 65);
                    NLoginType_002.d[39] = NLoginCore_384.D("ՁԨՍԮԶՒՅԛԒԹՔՕՒԼԸՁԬՁեԴԨԱԮԯ", (byte)98, 68);
                    NLoginType_002.d[40] = NLoginCore_138.A("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƟǅƉƳǓƯǏǙǑǈƸ", (byte)98, 65);
                    NLoginType_002.d[41] = NLoginCore_575.C("ԥԧՑՃԏ՗ԲԸԸԹԪ՘՞ՓԡբԝՍ՘զ՗Է՝ԡՋիՇէձթՠՐ", (byte)98, 67);
                    NLoginType_002.d[42] = NLoginCore_451.C("ԥԧՑՃԏ՗ԲԸԸԹԪ՘՞ՓԡբԝՍ՘զ՗Է՝ԡՋիՇէձթՠՐ", (byte)98, 67);
                    NLoginType_002.d[43] = NLoginCore_451.A("ƴƦƳŽƕƐƛżƹƔƁƋ", (byte)98, 65);
                    NLoginType_002.d[44] = NLoginCore_384.F("֕հՑգ֖ծՙ֓ՙ֔֓զ", (byte)98, 70);
                    NLoginType_002.d[45] = NLoginCore_091.B("ƩƒƏƕƠƎƖƿƌƗƢƋ", (byte)98, 66);
                    NLoginType_002.d[46] = NLoginCore_138.A("ƸƌƒƭƸŹƖƓƽƻƁƋ", (byte)98, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_002.d[0] = NLoginCore_092.A("ƭƩŵűƺžƍƳŽƕƒƋ", (byte)98, 65);
                    NLoginType_002.d[1] = NLoginCore_324.D("ՇՕՇԑԢՙԷԛՖՙԕԣ", (byte)98, 68);
                    NLoginType_002.d[2] = NLoginCore_110.D("ԏԱՏԶՖԹ԰ԥԜՕԪԣ", (byte)98, 68);
                    NLoginType_002.d[3] = NLoginCore_324.A("ƸƼƗƖƖƝŴƲżƳƁƋ", (byte)98, 65);
                    NLoginType_002.d[4] = NLoginCore_223.B("ƕƮƧƐƕƵſƓƎƅǀƋ", (byte)98, 66);
                    NLoginType_002.d[5] = NLoginCore_223.A("ƅƪƹƟƀƫƗŽǁƀƴƋ", (byte)98, 65);
                    NLoginType_002.d[6] = NLoginCore_027.D("ԡԽՒԵՔՒԮԲԶ՞Ԧԣ", (byte)98, 68);
                    NLoginType_002.d[7] = NLoginCore_387.F("Ւժ֒Րը՘օպծթ֟զ", (byte)98, 70);
                    NLoginType_002.d[8] = NLoginCore_453.F("՗քՐէՍթ֋֗֌՞֗զ", (byte)98, 70);
                    NLoginType_002.d[9] = NLoginCore_091.E("նփ֌՚ը֝ջ֏՞ց֓զ", (byte)98, 69);
                    NLoginType_002.d[10] = NLoginCore_384.B("ƬƌŰƮƔƫƘƽǅǂǀƋ", (byte)98, 66);
                    NLoginType_002.d[11] = NLoginCore_223.B("ƝƑƼƧƔƯƶƓƢǃƸƋ", (byte)98, 66);
                    NLoginType_002.d[12] = NLoginCore_446.F("ֆփ֘քք֍եժՙ֝֠֜մւ֏ա֤ա֨֠֨քձղ", (byte)98, 70);
                    NLoginType_002.d[13] = NLoginCore_451.E("Ւ֐֘՚֗֙ծ՘՗֡֓զ", (byte)98, 69);
                    NLoginType_002.d[14] = NLoginCore_092.E("դծըշծջ֔֘ոպրց՜֣֛ձ֥ըջ֩շմձղ", (byte)98, 69);
                    NLoginType_002.d[15] = NLoginCore_091.A("ƤƊƨŵƽƭƝƢŻƁƟǃƧƱƅƔƄƆƄƹƜƙƖƗ", (byte)98, 65);
                    NLoginType_002.d[16] = NLoginCore_324.D("ՈԾԧԬԢԪՒԵԽԳՔԣ", (byte)98, 68);
                    NLoginType_002.d[17] = NLoginCore_092.F("Վՠ֚ւպ֚֒֓ռ֑րտ֙կ֐ո֓֩րդր֚ձղ", (byte)98, 70);
                    NLoginType_002.d[18] = NLoginCore_004.A("ƫųƫƸƈƀƟǁƂƽƕƾƶƣƕƬƤƥƈǊƝƇƟƒƵǔǀƉǏƦƓƘƮǘǆƚǌǚǋƵǕǝơƫ", (byte)98, 65);
                    NLoginType_002.d[19] = NLoginCore_138.D("ՏՃԧՒԫԖԷԴԻԓԖՈԲՋՕՀԮՍԷԽդԢԹԫե՝ժԩ՟ՎՐԩ՞դմՎՕՒջըՙպՙճժՖղոխյցՒՁՀՅաՅզշծ՚֍քևկֈնտֆ֘՘հխ֗պ։֙֡շ֖֕֍նդո֑֋և֬քվ֡օ֒ֈտֆհֵ֖ք֚։ֻ֛֌ְփ", (byte)98, 68);
                    NLoginType_002.d[20] = NLoginCore_091.E("Սըդ֏չձ֍֒ճթ՛՘՝՞֤՝֟֓շճզ֪֋ֱ֑֦֚֟֨֠֩֊ִ֤֒ո֭֗չ֛֟֔֍ֆ", (byte)98, 69);
                    NLoginType_002.d[21] = NLoginCore_324.E("ցձշՒծդ֑Րտվ֛֜ճ՝֔֝շևա։նս֪օփֲ֣ձխִղվկհִշֈչ֎ևִֿ֠սպ֣׀ֿ֯׈ִ֝ևׅ֤ׄ֬׃ֻ׉׍֭׌׋׋֊֦֘ה׋ח֛֮֘ב֭בׄבִ֤ףֳ֤סתֱֲ", (byte)98, 69);
                    NLoginType_002.d[22] = NLoginCore_076.A("ƽƙƧƞƵƐƘƭƽƼǀƽƗǁǁƋƫǍǆƩƋƿƖƗ", (byte)98, 65);
                    NLoginType_002.d[23] = NLoginCore_223.D("ԞԢԿԖ԰ՍԕԸԎ՘ՏԚԝՌԭՏԟ՝ՓզՁՁԮԯ", (byte)98, 68);
                    NLoginType_002.d[24] = NLoginCore_201.D("ՄԏԫԦԣՏԣԹՎԔՌԣ", (byte)98, 68);
                    NLoginType_002.d[25] = NLoginCore_223.D("ԡԫԥԴԫԸՑՕԵԷԺ՗ԵՙԡՂ՝ԛՆՀը՗ՓՙԞԤԠԼԿհդՊ", (byte)98, 68);
                    NLoginType_002.d[26] = NLoginCore_201.E("ըժ֔ֆՒ֚յջջռխ֛֖֡դ֥ՠ֐֛֚֩վ֚֝֘տ֧֒֌֎֟ֈ", (byte)98, 69);
                    NLoginType_002.d[27] = NLoginCore_173.D("ՓԨԓԵԎԙԶՍԗԼԬԖ՘ՊՒՕՒՒԿԼըԷԨՁԴ՚Խ՗ըԱՂՆՓԿՊժՄՑշԹնխՏՐՖցՋԽՌդվհՐևևՁչիՄ֎ՂկըՑ", (byte)98, 68);
                    NLoginType_002.d[28] = NLoginCore_559.B("ƬƫƇŸƱƚƝſƥƅƘƏƨƅƳƺƞƃƸƼƈƩƖƗ", (byte)98, 66);
                    NLoginType_002.d[29] = NLoginCore_559.F("Տ՘֘ծե֖չ֚և՝ժյ֏ցսծղզս֧չև֪֗֫տփ֑֧ձվֆկ֏֗֎ֶָֹև֯֟֏֮֔ւ֐ׇւվִֶ֛֑֔֒", (byte)98, 70);
                    NLoginType_002.d[30] = NLoginCore_427.B("ƐůŶƗƬƬƖƣƷƛƄƐƐǃǊƆƥƢǃƷǊƿƖƗ", (byte)98, 66);
                    NLoginType_002.d[31] = NLoginCore_201.C("ԜԠՃՊԶՃԨԮ՝Ԯԕԣ", (byte)98, 67);
                    NLoginType_002.d[32] = NLoginCore_324.F("֐ֆճ֙֊շջ֔֍֊֟՝վ֛ծ՟֚շճ֡ա֚ձղ", (byte)98, 70);
                    NLoginType_002.d[33] = NLoginCore_559.D("ԠԴՔԵԫԩՃԻՎԔ՚՗ՍԵԵԶԜԜ՛ՄՓՁԮԯ", (byte)98, 68);
                    NLoginType_002.d[34] = NLoginCore_027.C("ՁԐՅԕԨԫԩՆԛՋԝԣ", (byte)98, 67);
                    NLoginType_002.d[35] = NLoginCore_384.B("ƇŵŹƐƕƔƼƾƓƶƸƋ", (byte)98, 66);
                    NLoginType_002.d[36] = NLoginCore_092.E("Րճժմ՚կ֑֚֞ջ֖֋ձ֐֐ջ֐֑վե֧֚ձղ", (byte)98, 69);
                    NLoginType_002.d[37] = NLoginCore_559.A("ƄƬƕƠƩƳƳƝơƜǇƛƟƣƛǌƺſƛƚƫǅƽǇǐƱǁƧǕơǃƲ", (byte)98, 65);
                    NLoginType_002.d[38] = NLoginCore_027.A("ƭųƶƪƫƝƕƔƣƣƔƅưƔơǃƚƕƽơǋƙǋƳƢǑƲǌǌƕƙǐǐƏǜǀƛǘƟǃƟǚƮƫ", (byte)98, 65);
                    NLoginType_002.d[39] = NLoginCore_138.C("ՁԨՍԮԶՒՅԛԒԹՔԲՎԛԳԲՎՏՄդՁ՗Ԯԯ", (byte)98, 67);
                    NLoginType_002.d[40] = NLoginCore_575.B("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƨƒǎƵƝƐƔƣǑƒƖ", (byte)98, 66);
                    NLoginType_002.d[41] = NLoginCore_223.C("ԥԧՑՃԏ՗ԲԸԸԹԪ՘՞ՓԡբԝՍ՘զ՗ԸԿԷդՈԥլծՑ՟ի", (byte)98, 67);
                    NLoginType_002.d[42] = NLoginCore_173.B("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƤƺǂǇƢƞǉǘƔƻǔ", (byte)98, 66);
                    NLoginType_002.d[43] = NLoginCore_027.F("֔ծւք֗ժվտպվյզ", (byte)98, 70);
                    NLoginType_002.d[44] = NLoginCore_201.B("ƬƬŰƛƠƢǀƙżƤƃƴƛƴƘǌǋǊǆǎǄƙƖƗ", (byte)98, 66);
                    NLoginType_002.d[45] = NLoginCore_138.F("։֗ճ֐և֘հ՞ղռ֡՟֜֟ր֚֕֝֒ջ֝քձղ", (byte)98, 70);
                    NLoginType_002.d[46] = NLoginCore_223.F("տփլյչ֒։֒ղպ֏զ", (byte)98, 70);
                    continue block7;
                }
                case 2: {
                    NLoginType_002.d[0] = NLoginCore_201.B("ƐƱƾƕƩƞƚƍƱƖƥŽǄƩǆƈƘǊƮƫƺƙƖƗ", (byte)98, 66);
                    continue block7;
                }
                case 4: {
                    NLoginType_002.d[0] = NLoginCore_451.D("ԎԞԾՁԬԹԻԸԭԳՑԽԹՐՙԝԟԟՀԡԲԱԮԯ", (byte)98, 68);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(-1073741824);
        av = Integer.reverse(0);
        aw = Integer.reverse(Integer.MIN_VALUE);
        ax = Integer.reverse(0x40000000);
        ay = 3 >>> 32 | 3 << ~32 + 1;
        az = (0 >>> 251 | 0 << ~251 + 1) & 0xFFFFFFFF;
        ba = Integer.reverse(-1);
        bb = Long.reverse(-7637542441478645066L);
        bc = (16 >>> 196 | 16 << ~196 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(6918091554182798006L);
        be = Long.reverse(-720575940379279360L);
        bf = (16384 >>> 45 | 16384 << -45) & 0xFFFFFFFF;
        bg = Long.reverse(6918091554182798006L);
        bh = Long.reverse(-720575940379279360L);
        bi = 1536 >>> 137 | 1536 << ~137 + 1;
        bj = (-1 >>> 104 | -1 << ~104 + 1) & 0xFFFFFFFF;
        bk = Long.reverse(-7637542441478645066L);
        bl = Integer.reverse(Integer.MIN_VALUE);
        bm = Integer.reverse(0x40000000);
        bn = 8 >>> 131 | 8 << ~131 + 1;
        bo = 0x800000 >>> 86 | 0x800000 << ~86 + 1;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0x20000000);
        br = Long.reverse(6918091554182798006L);
        bs = Long.reverse(-720575940379279360L);
        bt = Integer.reverse(0);
        bu = 160 >>> 165 | 160 << ~165 + 1;
        bv = Long.reverse(-7637542441478645066L);
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = (12 >>> 129 | 12 << ~129 + 1) & 0xFFFFFFFF;
        by = Long.reverse(6918091554182798006L);
        bz = Long.reverse(-720575940379279360L);
        ca = Integer.reverse(0);
        cb = 28 >>> 194 | 28 << ~194 + 1;
        cc = Long.reverse(6918091554182798006L);
        cd = Long.reverse(-720575940379279360L);
        ce = 2048 >>> 72 | 2048 << ~72 + 1;
        cf = Integer.reverse(-1);
        cg = Long.reverse(-7637542441478645066L);
        ch = (0x1000000 >>> 183 | 0x1000000 << -183) & 0xFFFFFFFF;
        ci = 0 >>> 143 | 0 << ~143 + 1;
        cj = Integer.reverse(Integer.MIN_VALUE);
        ck = Integer.reverse(0x40000000);
        cl = Integer.reverse(Integer.MIN_VALUE);
        cm = Integer.reverse(0x40000000);
        cn = (512 >>> 41 | 512 << ~41 + 1) & 0xFFFFFFFF;
        co = Integer.reverse(-1879048192);
        cp = Integer.reverse(-1);
        cq = Long.reverse(-7637542441478645066L);
        cr = Integer.reverse(0x50000000);
        cs = Long.reverse(6918091554182798006L);
        ct = Long.reverse(-720575940379279360L);
        cu = Integer.reverse(-805306368);
        cv = (-1 >>> 220 | -1 << ~220 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(-7637542441478645066L);
        cx = 6144 >>> 73 | 6144 << -73;
        cy = Long.reverse(-7637542441478645066L);
        cz = Integer.reverse(-1342177280);
        da = Long.reverse(-7637542441478645066L);
        db = (0xE000000 >>> 216 | 0xE000000 << -216) & 0xFFFFFFFF;
        dc = Long.reverse(6918091554182798006L);
        dd = Long.reverse(-720575940379279360L);
        de = (960 >>> 166 | 960 << -166) & 0xFFFFFFFF;
        df = Long.reverse(6918091554182798006L);
        dg = Long.reverse(-720575940379279360L);
        dh = (0x40000000 >>> 186 | 0x40000000 << ~186 + 1) & 0xFFFFFFFF;
        di = Long.reverse(6918091554182798006L);
        dj = Long.reverse(-720575940379279360L);
        dk = 278528 >>> 238 | 278528 << -238;
        dl = Long.reverse(-7637542441478645066L);
        dm = Integer.reverse(-1879048192);
        dn = Integer.reverse(0x48000000);
        cfr_renamed_1 = Long.reverse(-7637542441478645066L);
        dp = Integer.reverse(-939524096);
        dq = Long.reverse(6918091554182798006L);
        dr = Long.reverse(-720575940379279360L);
        ds = Integer.reverse(0x28000000);
        dt = Long.reverse(6918091554182798006L);
        du = Long.reverse(-720575940379279360L);
        dv = (0x150000 >>> 240 | 0x150000 << ~240 + 1) & 0xFFFFFFFF;
        dw = Long.reverse(-7637542441478645066L);
        dx = Integer.reverse(0);
        dy = 5632 >>> 232 | 5632 << ~232 + 1;
        dz = Long.reverse(-7637542441478645066L);
        ea = 0 >>> 1 | 0 << -1;
        eb = 0x2000000 >>> 56 | 0x2000000 << -56;
        ec = 0 >>> 49 | 0 << ~49 + 1;
        ed = Integer.reverse(-402653184);
        ee = Long.reverse(-7637542441478645066L);
        ef = 262144 >>> 50 | 262144 << -50;
        eg = (0 >>> 51 | 0 << -51) & 0xFFFFFFFF;
        eh = (0x6000000 >>> 54 | 0x6000000 << -54) & 0xFFFFFFFF;
        ei = Long.reverse(-7637542441478645066L);
        ej = Integer.reverse(-1744830464);
        ek = Long.reverse(6918091554182798006L);
        el = Long.reverse(-720575940379279360L);
        em = Integer.reverse(Integer.MIN_VALUE);
        en = Integer.reverse(0);
        eo = Integer.reverse(0);
        ep = 128 >>> 71 | 128 << -71;
        eq = Integer.reverse(0);
        er = Integer.reverse(0);
        es = 16 >>> 36 | 16 << -36;
        et = Integer.reverse(0);
        eu = Integer.reverse(0);
        ev = 4 >>> 34 | 4 << ~34 + 1;
        ew = (0 >>> 1 | 0 << ~1 + 1) & 0xFFFFFFFF;
        ex = (0x340000 >>> 81 | 0x340000 << -81) & 0xFFFFFFFF;
        ey = Integer.reverse(-1);
        ez = Long.reverse(-7637542441478645066L);
        fa = Integer.reverse(Integer.MIN_VALUE);
        fb = Integer.reverse(0);
        fc = (3456 >>> 7 | 3456 << ~7 + 1) & 0xFFFFFFFF;
        fd = Long.reverse(6918091554182798006L);
        fe = Long.reverse(-720575940379279360L);
        ff = Integer.reverse(0x40000000);
        fg = Integer.reverse(0x38000000);
        fh = (-1 >>> 16 | -1 << -16) & 0xFFFFFFFF;
        fi = Long.reverse(-7637542441478645066L);
        fj = Integer.reverse(-1207959552);
        fk = Long.reverse(6918091554182798006L);
        fl = Long.reverse(-720575940379279360L);
        fm = (Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1) & 0xFFFFFFFF;
        fn = 0xF000000 >>> 247 | 0xF000000 << -247;
        fo = Long.reverse(6918091554182798006L);
        fp = Long.reverse(-720575940379279360L);
        fq = Integer.reverse(0);
        fr = Integer.reverse(0);
        fs = (0 >>> 14 | 0 << -14) & 0xFFFFFFFF;
        ft = (16 >>> 100 | 16 << ~100 + 1) & 0xFFFFFFFF;
        fu = 0x8000000 >>> 218 | 0x8000000 << ~218 + 1;
        fv = Integer.reverse(0);
        fw = Integer.reverse(Integer.MIN_VALUE);
        fx = 0 >>> 70 | 0 << ~70 + 1;
        fy = Integer.reverse(-1);
        fz = Integer.reverse(-134217728);
        ga = Long.reverse(6918091554182798006L);
        gb = Long.reverse(-720575940379279360L);
        gc = Integer.reverse(0);
        gd = 64 >>> 129 | 64 << ~129 + 1;
        ge = Long.reverse(6918091554182798006L);
        gf = Long.reverse(-720575940379279360L);
        gg = Integer.reverse(Integer.MIN_VALUE);
        gh = 67584 >>> 43 | 67584 << -43;
        gi = Long.reverse(6918091554182798006L);
        gj = Long.reverse(-720575940379279360L);
        gk = Integer.reverse(0x40000000);
        gl = Integer.reverse(0x44000000);
        gm = Integer.reverse(-1);
        gn = Long.reverse(-7637542441478645066L);
        go = (48 >>> 36 | 48 << -36) & 0xFFFFFFFF;
        gp = Integer.reverse(0);
        gq = 0 >>> 155 | 0 << -155;
        gr = Integer.reverse(Integer.MIN_VALUE);
        gs = (Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1) & 0xFFFFFFFF;
        gt = Integer.reverse(Integer.MIN_VALUE);
        gu = 0 >>> 249 | 0 << ~249 + 1;
        gv = Integer.reverse(-1006632960);
        gw = (-1 >>> 212 | -1 << -212) & 0xFFFFFFFF;
        gx = Long.reverse(-7637542441478645066L);
        gy = (18432 >>> 201 | 18432 << -201) & 0xFFFFFFFF;
        gz = Long.reverse(-7637542441478645066L);
        ha = (0 >>> 158 | 0 << -158) & 0xFFFFFFFF;
        hb = Integer.reverse(0);
        hc = Integer.reverse(0);
        hd = (0 >>> 93 | 0 << ~93 + 1) & 0xFFFFFFFF;
        he = 0x100000 >>> 244 | 0x100000 << ~244 + 1;
        hf = Integer.reverse(0x60000000);
        hg = Integer.reverse(0);
        hh = Integer.reverse(-1543503872);
        hi = -1 >>> 225 | -1 << -225;
        hj = Long.reverse(-7637542441478645066L);
        hk = Integer.reverse(0x64000000);
        hl = Long.reverse(6918091554182798006L);
        hm = Long.reverse(-720575940379279360L);
        hn = Integer.reverse(-469762048);
        ho = Long.reverse(6918091554182798006L);
        hp = Long.reverse(-720575940379279360L);
        hq = (0 >>> 122 | 0 << -122) & 0xFFFFFFFF;
        hr = 512 >>> 9 | 512 << -9;
        hs = Integer.reverse(0);
        ht = Integer.reverse(-1073741824);
        hu = Integer.reverse(0);
        hv = Integer.reverse(Integer.MIN_VALUE);
        hw = (16 >>> 195 | 16 << ~195 + 1) & 0xFFFFFFFF;
        hx = (64 >>> 38 | 64 << -38) & 0xFFFFFFFF;
        hy = Integer.reverse(0);
        hz = Integer.reverse(Integer.MIN_VALUE);
        ia = (0 >>> 80 | 0 << ~80 + 1) & 0xFFFFFFFF;
        ib = (131072 >>> 113 | 131072 << ~113 + 1) & 0xFFFFFFFF;
        ic = Integer.reverse(0);
        id = (0x5000000 >>> 21 | 0x5000000 << ~21 + 1) & 0xFFFFFFFF;
        ie = -1 >>> 188 | -1 << ~188 + 1;
        cfr_renamed_0 = Long.reverse(-7637542441478645066L);
        ig = (49152 >>> 78 | 49152 << -78) & 0xFFFFFFFF;
        ih = Integer.reverse(0);
        ii = 16384 >>> 174 | 16384 << ~174 + 1;
        ij = Integer.reverse(0x40000000);
        ik = (0 >>> 173 | 0 << -173) & 0xFFFFFFFF;
        il = (16384 >>> 110 | 16384 << ~110 + 1) & 0xFFFFFFFF;
        im = Integer.reverse(0);
        in = (64 >>> 230 | 64 << ~230 + 1) & 0xFFFFFFFF;
        io = (0 >>> 36 | 0 << ~36 + 1) & 0xFFFFFFFF;
        ip = (Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1) & 0xFFFFFFFF;
        iq = (0 >>> 114 | 0 << -114) & 0xFFFFFFFF;
        ir = Integer.reverse(0);
        is = Integer.reverse(Integer.MIN_VALUE);
        it = Integer.reverse(0);
        iu = Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1;
        iv = (0 >>> 131 | 0 << -131) & 0xFFFFFFFF;
        iw = (167936 >>> 12 | 167936 << -12) & 0xFFFFFFFF;
        ix = -1 >>> 45 | -1 << -45;
        iy = Long.reverse(-7637542441478645066L);
        iz = 0 >>> 42 | 0 << ~42 + 1;
        ja = Integer.reverse(0);
        jb = 0x10000000 >>> 252 | 0x10000000 << ~252 + 1;
        jc = Integer.reverse(0);
        jd = Integer.reverse(0x40000000);
        je = 0 >>> 101 | 0 << -101;
        jf = 8 >>> 3 | 8 << -3;
        jg = 0x4000000 >>> 217 | 0x4000000 << -217;
        jh = Integer.reverse(0);
        ji = (0x1000000 >>> 184 | 0x1000000 << ~184 + 1) & 0xFFFFFFFF;
        jj = Integer.reverse(0x54000000);
        jk = Long.reverse(-7637542441478645066L);
        jl = Integer.reverse(-1610612736);
        jm = Integer.reverse(0);
        jn = 4096 >>> 76 | 4096 << -76;
        jo = Integer.reverse(0x40000000);
        jp = (24 >>> 195 | 24 << ~195 + 1) & 0xFFFFFFFF;
        jq = Integer.reverse(0x20000000);
        jr = Integer.reverse(Integer.MIN_VALUE);
        js = (0 >>> 19 | 0 << ~19 + 1) & 0xFFFFFFFF;
        jt = 47 >>> 192 | 47 << ~192 + 1;
        ju = (-1073741813 >>> 158 | -1073741813 << -158) & 0xFFFFFFFF;
        jv = 0x8000000 >>> 57 | 0x8000000 << ~57 + 1;
        jw = 0 >>> 28 | 0 << ~28 + 1;
        jx = Integer.reverse(-738197504);
        jy = Long.reverse(6918091554182798006L);
        jz = Long.reverse(-720575940379279360L);
        ka = (128 >>> 7 | 128 << -7) & 0xFFFFFFFF;
        kb = Integer.reverse(0x34000000);
        kc = Long.reverse(6918091554182798006L);
        kd = Long.reverse(-720575940379279360L);
        ke = (32 >>> 100 | 32 << ~100 + 1) & 0xFFFFFFFF;
        kf = Integer.reverse(-1275068416);
        kg = Long.reverse(6918091554182798006L);
        kh = Long.reverse(-720575940379279360L);
        ki = (192 >>> 38 | 192 << -38) & 0xFFFFFFFF;
        kj = (2944 >>> 38 | 2944 << -38) & 0xFFFFFFFF;
        kk = Integer.reverse(-1);
        kl = Long.reverse(-7637542441478645066L);
        c = new String[jt];
        d = new String[ju];
        NLoginType_002.b();
        String[] stringArray = new String[jv];
        stringArray[NLoginType_002.jw] = NLoginType_002.c("㺀", (int)jx, (long)(jy ^ jz));
        stringArray[NLoginType_002.ka] = NLoginType_002.c("㺃", (int)kb, (long)(kc ^ kd));
        stringArray[NLoginType_002.ke] = NLoginType_002.c("㺆", (int)kf, (long)(kg ^ kh));
        stringArray[NLoginType_002.ki] = NLoginType_002.c("㺉", (int)(kj & kk), (long)kl);
        f = Arrays.asList(stringArray);
    }

    private void a(NLoginCore_560 NLoginInterface_0382, NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_509 NLoginCore_5092, String string, String[] stringArray) {
        String string2 = this.var_com_nickuc_login_NLoginCore_311_a.java_lang_String_b(ForceRegisterConfig2);
        if (string2 != null) {
            if (stringArray.length != gs) {
                Object[] objectArray = new Object[gt];
                objectArray[NLoginType_002.gu] = (String)NLoginType_002.c("㺀", (int)(gv & gw), (long)gx) + string.toLowerCase(Locale.ENGLISH) + (String)NLoginType_002.c("㺃", (int)gy, (long)gz);
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.x, objectArray);
                return;
            }
            String string3 = stringArray[ha];
            if (!this.var_com_nickuc_login_NLoginCore_311_a.a(ForceRegisterConfig2, null, string3)) {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.an, new Object[hb]);
                if (NLoginCore_532.Y.r() <= 0 || NLoginCore_5092.int_a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t) >= NLoginCore_532.Y.r()) {
                    NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t, (Object)hc);
                    NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.Q, NLoginCore_277, new Object[hd]));
                    return;
                }
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t, (Object)(NLoginCore_5092.int_a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t) + he));
                return;
            }
            NLoginCore_137 NLoginCore_1372 = this.var_com_nickuc_login_NLoginCore_311_a.com_nickuc_login_NLoginCore_137_a(ForceRegisterConfig2);
            if (NLoginCore_1372 == null) {
                return;
            }
            switch (NLoginCore_048.f[NLoginCore_1372.ordinal()]) {
                case 1: {
                    if (this.var_com_nickuc_login_NLoginCore_311_a.aH()) {
                        ForceRegisterConfig2.B();
                    }
                    String string4 = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, hf);
                    if (!((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().c(ForceRegisterConfig2, string4)) {
                        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[hg]);
                        return;
                    }
                    NLoginCore_370.b((String)NLoginType_002.c("㺆", (int)(hh & hi), (long)hj) + ForceRegisterConfig2.i() + (String)NLoginType_002.c("㺉", (int)hk, (long)(hl ^ hm)) + this.var_com_nickuc_login_NLoginCore_311_a.u() + (String)NLoginType_002.c("㺌", (int)hn, (long)(ho ^ hp)), new Object[hq]);
                    NLoginCore_5092.a(NLoginCore_567.G, (Object)string4);
                    NLoginInterface_0382.b(ForceRegisterConfig2, NLoginCore_277, string4);
                    ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, hr != 0, hs != 0);
                    break;
                }
                case 2: {
                    NLoginCore_154 NLoginInterface_0122;
                    NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
                    if (NLoginCore_5012 == null || !((NLoginInterface_0122 = NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b()) instanceof NLoginType_030) || ((NLoginType_030)NLoginInterface_0122).com_nickuc_login_NLoginCore_311_a() != this.var_com_nickuc_login_NLoginCore_311_a) break;
                    NLoginInterface_0122.b((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a), NLoginCore_277, NLoginCore_5092);
                }
            }
            this.var_com_nickuc_login_NLoginCore_311_a.a(ForceRegisterConfig2, (String)null, (NLoginCore_137)null);
            Object[] objectArray = new Object[ht];
            objectArray[NLoginType_002.hu] = TwoFactorType.convert((Enum)this.var_com_nickuc_login_NLoginCore_311_a);
            objectArray[NLoginType_002.hv] = NLoginCore_277;
            objectArray[NLoginType_002.hw] = string2;
            ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).a(EventEnum.TWO_FACTOR_AUTH, objectArray);
            return;
        }
        this.a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, string);
    }

    private void b(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, String string, String[] stringArray) {
        String string2 = this.var_com_nickuc_login_NLoginCore_311_a.java_lang_String_b(ForceRegisterConfig2);
        if (string2 == null) {
            Object[] objectArray = new Object[in];
            objectArray[NLoginType_002.io] = this.var_com_nickuc_login_NLoginCore_311_a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aj, objectArray);
            return;
        }
        int n = !this.var_com_nickuc_login_NLoginCore_311_a.e(ForceRegisterConfig2) ? ip : iq;
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, n != 0 ? NLoginCore_374.au : NLoginCore_374.av, new Object[ir]);
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        switch (NLoginCore_048.e[this.var_com_nickuc_login_NLoginCore_311_a.ordinal()]) {
            case 1: {
                NLoginCore_3352.c(n != 0);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[is];
                NLoginCore_436Array[NLoginType_002.it] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            case 2: {
                NLoginCore_3352.b(n != 0);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[iu];
                NLoginCore_436Array[NLoginType_002.iv] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            default: {
                throw new IllegalStateException((String)NLoginType_002.c("㺀", (int)(iw & ix), (long)iy) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_311_a));
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6FL;
        l ^= 0x34405499CF078050L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(7 + 62), (byte)(29 + 54), (byte)(29 + 18), (byte)(52 + 15), (byte)(36 + 30), (byte)(26 + 41), (byte)(20 + 27), (byte)(28 + 52), (byte)(44 + 31), (byte)(20 + 47), (byte)(13 + 70), 53, (byte)(35 + 45), (byte)(63 + 34), (byte)(41 + 59), 100, (byte)(46 + 59), (byte)(5 + 105), (byte)(53 + 50)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("òÿþÁāýøāČûÈĆĊăĆČÎўъџјѢѩћџёмѯѭѬіѣ", (byte)8, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_002.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    protected abstract void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginCore_509 var3, NLoginCore_560 var4, String var5, String[] var6);

    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_509 NLoginCore_5092, String string, String[] stringArray) {
        NLoginCore_154 NLoginInterface_0122;
        String string2 = this.var_com_nickuc_login_NLoginCore_311_a.java_lang_String_a(ForceRegisterConfig2);
        if (string2 == null) {
            this.a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, string);
            return;
        }
        String string3 = stringArray[iz];
        if (!this.var_com_nickuc_login_NLoginCore_311_a.a(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_a, string3)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.an, new Object[ja]);
            return;
        }
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        int n = this.var_com_nickuc_login_NLoginCore_311_a.aI() && !ForceRegisterConfig2.t() && !ForceRegisterConfig2.u() ? jb : jc;
        switch (NLoginCore_048.e[this.var_com_nickuc_login_NLoginCore_311_a.ordinal()]) {
            case 1: {
                NLoginCore_3352.c(n != 0);
                NLoginCore_3352.c(string2);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[jd];
                NLoginCore_436Array[NLoginType_002.je] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
                NLoginCore_436Array[NLoginType_002.jf] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            case 2: {
                NLoginCore_3352.b(n != 0);
                NLoginCore_3352.b(string2);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[jg];
                NLoginCore_436Array[NLoginType_002.jh] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j;
                NLoginCore_436Array[NLoginType_002.ji] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            default: {
                throw new IllegalStateException((String)NLoginType_002.c("㺀", (int)jj, (long)jk) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_311_a));
            }
        }
        Object[] objectArray = new Object[jl];
        objectArray[NLoginType_002.jm] = TwoFactorType.convert((Enum)this.var_com_nickuc_login_NLoginCore_311_a);
        objectArray[NLoginType_002.jn] = NLoginCore_277;
        objectArray[NLoginType_002.jo] = NLoginCore_277.java_util_UUID_a();
        objectArray[NLoginType_002.jp] = NLoginCore_277.getName();
        objectArray[NLoginType_002.jq] = string2;
        ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).a(EventEnum.TWO_FACTOR_ADD, objectArray);
        this.var_com_nickuc_login_NLoginCore_311_a.b(ForceRegisterConfig2, (String)null);
        this.var_com_nickuc_login_NLoginCore_311_a.a(ForceRegisterConfig2, (String)null, (NLoginCore_137)null);
        Object[] objectArray2 = new Object[jr];
        objectArray2[NLoginType_002.js] = this.var_com_nickuc_login_NLoginCore_311_a.u();
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ap, objectArray2);
        NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
        if (NLoginCore_5012 != null && (NLoginInterface_0122 = NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b()) instanceof NLoginCore_438 && ((NLoginCore_438)NLoginInterface_0122).com_nickuc_login_NLoginCore_311_a() == this.var_com_nickuc_login_NLoginCore_311_a) {
            NLoginInterface_0122.b((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a), NLoginCore_277, NLoginCore_5092);
        }
    }

    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, String string, String[] stringArray) {
        String string2 = this.var_com_nickuc_login_NLoginCore_311_a.java_lang_String_b(ForceRegisterConfig2);
        if (string2 == null) {
            Object[] objectArray = new Object[hx];
            objectArray[NLoginType_002.hy] = this.var_com_nickuc_login_NLoginCore_311_a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aj, objectArray);
            return;
        }
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        switch (NLoginCore_048.e[this.var_com_nickuc_login_NLoginCore_311_a.ordinal()]) {
            case 1: {
                NLoginCore_3352.c(null);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[hz];
                NLoginCore_436Array[NLoginType_002.ia] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            case 2: {
                NLoginCore_3352.b(null);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[ib];
                NLoginCore_436Array[NLoginType_002.ic] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j;
                ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                break;
            }
            default: {
                throw new IllegalStateException((String)NLoginType_002.c("㺀", (int)(id & ie), (long)cfr_renamed_0) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_311_a));
            }
        }
        Object[] objectArray = new Object[ig];
        objectArray[NLoginType_002.ih] = TwoFactorType.convert((Enum)this.var_com_nickuc_login_NLoginCore_311_a);
        objectArray[NLoginType_002.ii] = NLoginCore_277;
        objectArray[NLoginType_002.ij] = string2;
        ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_311_a)).a(EventEnum.TWO_FACTOR_REMOVE, objectArray);
        if (this.var_com_nickuc_login_NLoginCore_311_a.aJ()) {
            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[ik]));
        } else {
            Object[] objectArray2 = new Object[il];
            objectArray2[NLoginType_002.im] = this.var_com_nickuc_login_NLoginCore_311_a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.am, objectArray2);
        }
    }

    protected void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2, String string) {
        String string2 = string.toLowerCase(Locale.ENGLISH);
        NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
        String string3 = this.var_com_nickuc_login_NLoginCore_311_a.u().toLowerCase(Locale.ENGLISH);
        String string4 = NLoginCore_112.t(string3);
        Object[] objectArray = new Object[var_int_a];
        objectArray[NLoginType_002.av] = string2;
        objectArray[NLoginType_002.aw] = string3;
        objectArray[NLoginType_002.ax] = string4;
        List<String> list = NLoginCore_150.a(NLoginCore_374.as, NLoginCore_277, objectArray);
        for (String string5 : list) {
            if (string5.length() > ay && string5.contains((CharSequence)NLoginType_002.c("㺀", (int)(az & ba), (long)bb)) && string5.contains((CharSequence)NLoginType_002.c("㺃", (int)bc, (long)(bd ^ be)))) {
                String[] stringArray = string5.split((String)NLoginType_002.c("㺆", (int)bf, (long)(bg ^ bh)));
                int n = string5.split((String)NLoginType_002.c("㺉", (int)(bi & bj), (long)bk)).length;
                if (!(stringArray.length != bl && stringArray.length != bm || n != bn && n != bo)) {
                    String string6;
                    String string7 = string6 = stringArray.length == bp ? NLoginType_002.c("㺌", (int)bq, (long)(br ^ bs)) : stringArray[bt];
                    if (!string6.contains((CharSequence)NLoginType_002.c("㺏", (int)bu, (long)bv))) {
                        String string8;
                        Object object;
                        String[] stringArray2 = stringArray[bw].split((String)NLoginType_002.c("㺒", (int)bx, (long)(by ^ bz)));
                        String string9 = stringArray2[ca];
                        if (string9.contains((CharSequence)NLoginType_002.c("㺕", (int)cb, (long)(cc ^ cd))) && ((String[])(object = string9.split((String)NLoginType_002.c("㺘", (int)(ce & cf), (long)cg)))).length == ch) {
                            int n2 = this.var_com_nickuc_login_NLoginCore_311_a.java_lang_String_b(ForceRegisterConfig2) != null ? ci : cj;
                            String string10 = string6 + object[n2];
                            if (stringArray2.length == ck) {
                                string10 = string10 + stringArray2[cl];
                            }
                            NLoginInterface_0242.a(string10);
                            continue;
                        }
                        object = string6 + string9;
                        if (stringArray2.length == cm) {
                            object = (String)object + stringArray2[cn];
                        }
                        if (((String)object).contains(string2 + (String)NLoginType_002.c("㺛", (int)(co & cp), (long)cq))) {
                            string8 = (String)NLoginType_002.c("㺞", (int)cr, (long)(cs ^ ct)) + string2 + (String)NLoginType_002.c("㺡", (int)(cu & cv), (long)cw);
                        } else if (((String)object).contains(string2 + (String)NLoginType_002.c("㺤", (int)cx, (long)cy))) {
                            string8 = (String)NLoginType_002.c("㺧", (int)cz, (long)da) + string2 + (String)NLoginType_002.c("㺪", (int)db, (long)(dc ^ dd));
                        } else if (((String)object).contains(string2 + (String)NLoginType_002.c("㺭", (int)de, (long)(df ^ dg)))) {
                            string8 = (String)NLoginType_002.c("㺰", (int)dh, (long)(di ^ dj)) + string2 + (String)NLoginType_002.c("㺳", (int)dk, (long)dl);
                        } else {
                            NLoginInterface_0242.a((String)object);
                            continue;
                        }
                        NLoginInterface_0242.a((String)object, null, string8);
                        continue;
                    }
                }
            }
            NLoginInterface_0242.a(string5);
        }
    }

    public NLoginType_002(NLoginCore_466 NLoginCore_4662, NLoginCore_248 NLoginCore_3112) {
        super(NLoginCore_4662);
        this.b();
        this.var_com_nickuc_login_NLoginCore_311_a = NLoginCore_3112;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(NLoginCore_494 var1_1, String var2_2, String[] var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    protected abstract void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginCore_560 var3, String var4, String[] var5);

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_002.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.C("ӊӬӮӎӲԑԉԟԋӚԘԎԜԖӟԄԦԥԝԣԝӲ", (byte)79, 67), NLoginType_002.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ƀƍƌŏƏƋƆƏƚƉŖƔƘƑƔƚŜӬӘӭӦӰӷөӭӟӊӽӻӺӤӱŷ", (byte)79, 65) + string + NLoginCore_027.D("Ӝ", (byte)79, 68) + methodType.toString(), exception);
        }
    }
}

