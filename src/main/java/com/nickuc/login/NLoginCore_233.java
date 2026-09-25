/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_342;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_142;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_570;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_059;
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
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_233 {
    private static int dp;
    private static long ba;
    private static long di;
    private static int ex;
    private boolean X;
    private static long fe;
    private static long ew;
    private static long dx;
    private static String[] var_java_lang_String_arr_a;
    private static long au;
    private static int var_int_b;
    private static long fj;
    private static int fr;
    private static int aq;
    private static int cu;
    private static int ce;
    private static int fl;
    private static int df;
    private static long cd;
    private static long fk;
    private static int gm;
    private static int ea;
    private static int bm;
    private static long dv;
    private static int ev;
    private static int fw;
    private static int i;
    private static long f;
    private static int ck;
    private static int am;
    private static long ff;
    private static long ee;
    private static int ed;
    private static int bh;
    private static long bc;
    private static long er;
    private static long cj;
    private static long ad;
    private static int dg;
    private static long cx;
    private static int fd;
    private static int eo;
    private static int av;
    private static long cs;
    private static int fy;
    private static long j;
    private static int br;
    private static long aw;
    private static long fx;
    private static int fg;
    private static long ds;
    private static long co;
    private static int n;
    private static int ab;
    private static long bl;
    private static int gk;
    private static int ej;
    private static long al;
    private static int var_int_c;
    private static int gl;
    private static int cf;
    private static long fn;
    private static int fa;
    private static int x;
    private static long dd;
    private static int eb;
    private static long eh;
    private static int bk;
    private static int bf;
    private static long r;
    private static long fu;
    private static int t;
    private static int ag;
    private static long ek;
    private static long ac;
    private static int gn;
    private static int em;
    private static int bu;
    private static long fv;
    private static int ey;
    private static long ei;
    private static long ch;
    private static int ak;
    private static int aa;
    private static long ah;
    private static int dz;
    private static int cw;
    private static int es;
    private static long z;
    private static int af;
    private static long s;
    private static int el;
    private static int by;
    private static int dw;
    private static int cv;
    private static int ar;
    private static long dn;
    private static int var_int_d;
    private static long ef;
    private static long as;
    private final AtomicBoolean var_java_util_concurrent_atomic_AtomicBoolean_d = new AtomicBoolean();
    private static long bi;
    private static int ec;
    private static int ai;
    private static int ae;
    private static int ci;
    private static long gh;
    private static long bv;
    private static long aj;
    private static int ga;
    private static int ep;
    private static int g;
    private static long ax;
    private static long o;
    private static int cy;
    private static long ca;
    private static int cz;
    private static long bp;
    private static long bx;
    private static long v;
    private static long dy;
    private static long var_long_c;
    private static long fc;
    private static long fb;
    private static int cq;
    private static int cg;
    private static long l;
    private static int fi;
    private static int cb;
    private static int dc;
    private static long da;
    private static long dk;
    private static int h;
    private static int cp;
    private static int fq;
    private static long fh;
    private static int q;
    private static long u;
    private static int dl;
    private static int ez;
    private static int fz;
    private static int ge;
    private static int dj;
    private static int ct;
    private static int gg;
    private static int bn;
    private static long dm;
    private static int de;
    private static long du;
    private static int dr;
    private static long dh;
    private static int var_int_e;
    private static long bj;
    private static int en;
    private static long fp;
    private static long y;
    private static long bs;
    private static int bo;
    private static int gj;
    private static long cr;
    private static int gi;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____e;
    private static int fo;
    private static int an;
    private static int cn;
    private static int ft;
    private static int be;
    private static int bz;
    private static int gc;
    private static int cl;
    private static long bd;
    private static long az;
    private static int dq;
    private static int k;
    private static long fm;
    private static int var_int_a;
    private static int bw;
    private static long m;
    private static long cc;
    private static long bg;
    private static long et;
    private static int w;
    private static String[] var_java_lang_String_arr_b;
    private static int at;
    private static long db;
    private static int bb;
    private static int dt;
    private static int cm;
    private static long p;
    private static int cfr_renamed_1;
    private static int bt;
    private static int gf;
    private static int gb;
    private static int bq;
    private static int ap;
    private static int eu;
    private static long ao;
    private static long fs;
    private static int eg;
    private static long eq;
    private static long gd;
    private static int ay;

    private static void b() {
        int n;
        var_long_c = -3786721460659497191L;
        long l = var_long_c ^ 0x1420F30AF685DDAAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(25 + 44), (byte)(55 + 28), (byte)(25 + 22), (byte)(56 + 11), (byte)(56 + 10), (byte)(29 + 38), (byte)(41 + 6), (byte)(62 + 18), (byte)(11 + 64), (byte)(13 + 54), (byte)(2 + 81), 53, (byte)(78 + 2), (byte)(17 + 80), (byte)(47 + 53), (byte)(97 + 3), 105, (byte)(88 + 22), (byte)(38 + 65)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_233.var_java_lang_String_arr_b[0] = NLoginCore_223.F("֦֢֚ֈօ֨էզ։թփվ֍ְֳ֠֘հ֌ְִ֮֬։ָּ֑֖֤֙֬֝֝֟֜֟׈ֆֿ֛֮׃և֪։֬֬׎׌֒׈ׄ׌אֱֻּכֳׁא֮טס", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ǅƜƕƳǗǂǍƳǀƻƮƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[2] = NLoginCore_446.E("յ՟մ֣շ֣֠չչ։հն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ǅƜƕƳǗǂǍƳǀƻƮƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[4] = NLoginCore_387.B("ƮƱǖƩƞƸǣǎƛƵƯơƟǨƜǕƥƫǂǌǍǯƶƷ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[5] = NLoginCore_027.E("֦֢֚ֈօ֨էզ։թւձ֠ց֖֦խ֫կּֽ֧֮։֛նցֱֵֻ֖֤֔֔֟֨׌ֽքְׁ֥֜֐֜֫׋ֲִַ׉ׅ֪טֶ׎טט֠׍֣כ־ט", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[6] = NLoginCore_453.E("֦֢֚ֈօ֨էզ։թւձ֠ց֖֦խ֫կּ֧ճֺմ֚։ֻ֖֘־֯քָָֻ֪֩֋ֿ֧־֤׆ք׀ֵ֩֏׊ו׌׌ֶ֫֫׏ז֚֟֩ע׎פוֱֶֻּׂ֢ך֧׉ֶֹ֮", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[7] = NLoginCore_138.E("֦֢֚ֈօ֨էզ։թւձ֠ց֖֦խ֫կּ֧մն֎ְսְֱֻ֤֮֝֜֯׊֦֙ևֺֻ֮ֆ֭֯ג֭֮֞׌ֹ֭֮֩׏ֲלֱאֿ־ֽ֣֤צֽ־ֺֹּר֣׋֨לֹ֪֮׎׊״תׅ׮אופׇ׵׎׍׼׽דֿי׸ףשל؄נׇ׾׫׽׸׻ז", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[8] = NLoginCore_427.B("ǏǛǗƽƺǝƜƛƾƞƷƦǕƶǋǛƢǠƤǜǱƮǂǯǁǪǋǐǦǇǏǴǨǬǖǊǛǯǍǐǃȄƾȄǖǻȃǴȋȄȄȌǉȉȎȂǭǪǟǤǰǡȍȍǛȝǫǚȠǓǙȋǢǤǷȧǢǤǺȅǽȧǦȠǪǻȇǿȤȟǯȗȬȐȨȐ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[9] = NLoginCore_091.F("՝բ֝ե֝տ֍էոֳ֧֙ճֵ֢֎ծָ֪֨֗֔ցւ", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[10] = NLoginCore_027.D("բՖևտֆՠՁիթրզՓ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[11] = NLoginCore_223.D("շփտեբօՄՃզՆ՟Վս՞ճփՊֈՌք֙֘֘պմյչոճլ֣ՠՠ֡զշօյ֤տ֩֋ց֩֠պռւ֞֓փִ֮֡֐փֿ֪֚֔֗֍ְ֘", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[12] = NLoginCore_223.E("է՟աօգւ֭փ֜ք֮֒֎֨ս֌կժ֏ֶ֤֪ցւ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[13] = NLoginCore_559.C("ՕձՙԿ՚եՂ֊լխ՚Փ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[14] = NLoginCore_575.E("֦֛֪֚֟֙ո֌ֆ֋հն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[15] = NLoginCore_138.A("ǕƏǘƺƞǐǜǚƞƳƲƫ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[16] = NLoginCore_091.C("փոևռնշՕթգըՍՓ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[17] = NLoginCore_446.E("հ՞տգ֔ս֍֦֤֍֯ն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[18] = NLoginCore_138.B("ƶƻƱƽƖƯƞƕƞǀƲƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[19] = NLoginCore_092.B("ǐƾƗǈǐơǑơǝƞǟƵǘǃǆǀǛƣƩǘƿǈǍǇǑǀǫǑưǦǂǨ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[20] = NLoginCore_384.C("՗չՐպտժՉթՋյ։ւզՙ։՞ը֏Ֆմչ֔֍ջդ֕չ֕֠կջւ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[21] = NLoginCore_138.A("ƛǈǕƾƨƝƙƣƬƛƾǗǂǓƻƫƣǞǄǧǦǋƨƫǱǊǯƵǓǂǒǌǝǙǒǐǉȁǚǽǒȂƼǟǜƿǹǹȆȃǗǸǟǈǋǓǱǟǿǯǑȊȖȈțȈǱǽǻǮȡǹȥǤǷǟȕǽȈǩȍȍȉǫȚȢǼȀȯȵǲȖȣǷȍǺ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[22] = NLoginCore_091.D("շՀկՠֈՓեօրսբՓ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[23] = NLoginCore_453.B("ǎƩǎǖƞǂǐǎƭǖơƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ǏƘǇƸǠƫƽǝǘǕƺƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[25] = NLoginCore_110.E("օչ֪֢֩փդ֎֌֣։ն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[26] = NLoginCore_453.B("ǏǛǗƽƺǝƜƛƾƞƹƸǑǚƹǊǢǅǘƧǤǉƶƷ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[27] = NLoginCore_559.D("ՐճՎ՛՛չ։ռլ՞՚Փ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[28] = NLoginCore_446.E("ո֖ճճմ֍֙։֭֫ցն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[29] = NLoginCore_138.E("֏֕֝ռց֛ո֊եְְ֮֜֒֔կճցֱִַ֛֕֒֠֍ָֺׂׂ֣ׅ֣֑֘֕ֆָֺׅ֤׌ֱֽ֢֯֩׏ֶ׊֗֌֤֢֯֡", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[30] = NLoginCore_110.D("ՕճՐՐՑժնզ֊ֈ՞Փ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[31] = NLoginCore_027.D("լօԿ՗՗Իդ՚զվրեատգՐյ֓ՒւխձՓթ֑֕֒յ՗սփ՚֦֚փօճ֪֪֘֔֊֦֝֨վ֥֭֏ַ֬ֆֲ֨֩յֺ֥֝ևշչֲֹ֤֯֫֘ׄֆ֦֘փֵׄ֓", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[32] = NLoginCore_091.E("֦֢֚ֈօ֨էզ։թւ֨փֶ֤հ֥֕շֹֺշְ֭֝֨֌ո֮׀տֱ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[33] = NLoginCore_387.C("խՄԽ՛տժյ՛ըգՖՓ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[34] = NLoginCore_201.C("ՒԼՑրՔրսՖՖզՍՓ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[35] = NLoginCore_427.D("շփտեբօՄՃզՆ՟օՠց֓ՍղւՔ֖֗֙ը՘հ՗֎տֈ՞ձ֋֐ւօշմ֒ջ֨֬տ֢֚ջ֥կձ֪ֆְ֫֐ֲ։ղ֌ֹ֓֒֩֠֝ջ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[36] = NLoginCore_575.A("ǅƜƕƳǗǂǍƳǀƻƮƫ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[37] = NLoginCore_091.E("չռ֡մթփ֮֙զրպլժֳէ֠հն֍ֺ֗֘ցւ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[38] = NLoginCore_223.E("֦֢֚ֈօ֨էզ։թւ֨փֶ֤հ֥֕շֹֺּ֋ջ֓պֱ֢֫ցֳֵ֥֚֮֔֨֗֞׋׏ֽ֢ׅ֞׈֒֔׍֩ד׎ֳו֬֕֯לֵֶ׌׃׀֞", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[39] = NLoginCore_004.D("շփտեբօՄՃզՆՠո֑֎տֈ՞ծլՎղ։֎ֆ֌ճ֚լժրձՙ֑֝սողցը֣֞րըְռր֐֣֝ղծյ֋ցվտ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[40] = NLoginCore_138.A("ƕƻǒǓǓƝƠǁƵƱǁƧƵǕƻǂǠǜǜƪǯǅǟǟƦưǪǐǔǩǻǻ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[41] = NLoginCore_173.C("բՖևտֆՠՁիթրզՓ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[42] = NLoginCore_091.B("ǏǛǗƽƺǝƜƛƾƞƸǐǩǦǗǠƶǆǄƦǊǡǦǞǤǋǲǄǂǘǉƱǧǥǛǧƺǑǐǔǗǲȅǃǹǑǓǄǦǡǍȄǯȎȂȔǏǣǧǔȎȍȋȑǧȌǬǘȝǚǡȂȃǟȠǫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[43] = NLoginCore_076.F("ՠֆ֝֞֞ըի֌րռ֌ղր֠ֆ֍֧֧֫յֺ֐֪֪ձջִֵ֛֟׆׆", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[44] = NLoginCore_387.B("ƺƮǟǗǞƸƙǃǁǘƾƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[45] = NLoginCore_446.D("Ց՛Ւ՗ՙքՈֆշ՝ֈՓ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[46] = NLoginCore_110.F("՟֜ղռօ֣֛֫֝֙լն", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[47] = NLoginCore_091.F("բ֩֟դջ՞֚ըչժ֢֊֊֌վ֯֒֓֍ֲ֖քկ֭֩֘֟ց֯տր֦ևվք֓֕֊֛׌֣֎֖֙", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[48] = NLoginCore_076.D("շջՖսՂղ֊ՕՅ՚չզՋ՞Ո֎֑մՕ֒֌֗՞՟", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[49] = NLoginCore_173.D("ՀվսֈՆնքՅ֍ժ՚Փ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[50] = NLoginCore_173.B("ƎǑƦƛƺƗƞǞơǄơƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[51] = NLoginCore_027.E("բ֩֟դջ՞֚ըչժ֢֊֊֌վ֯֒֓֍ֲ֖քկ֭֩֘֟ց֯տր֦ևվք֓֕֊֛׌֣֎֖֙", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[52] = NLoginCore_027.C("շջՖսՂղ֊ՕՅ՚ո֌Ջռ՜֋խվժ՟մհի՗֝լ֒ը֛֛֟չ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[53] = NLoginCore_559.B("ƎǑƦƛƺƗƞǞơǄơƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[54] = NLoginCore_004.D("շփտեբօՄՃզՆՠո֑֎տֈ՞ծլՎղ֓֌ռխ՗յղց֊խ֖ւռ֗րօ֧֦ցզ֌խ֣֙և֥֣֥֓ֆ֪֧֡վտ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[55] = NLoginCore_004.F("ւ֛֣֕֘֜ի։֭֨֙ռֶ֣֮֮ւֆ֊ֈ֭ֈֱ֝־ջֻ֖֩֕ռֳ֕׃օ׊ֆֱֽׁ֤֭֨֡֜֝֨הזגח׆׊להֳ֞ו֗םל׌ֵ֥֧דׂמץ֫וֶךשֱ֨֨וסֳװ֮׭֬יּ׏׻ֽר״׺ֵסו׷", (byte)114, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_233.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ǏǛǗƽƺǝƜƛƾƞƸƳǂǥǕǨǍƥǁǣǩǡǥƾǎǆǱǡǒǋǒǔǑǭǔǙǽƻǴǣǐǸƼǟƾǡǡȃȁǇǽǹȁȈǬǼǬǇȎǨȄǡȊǗ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[1] = NLoginCore_076.C("՗ղկքեվնց֋վ՞Փ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[2] = NLoginCore_559.B("ƎǔƜǏǞƭǘƮǅǦǆƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[3] = NLoginCore_201.C("Խշ՚րՑ՛ր՞՛ֆ՜ռցէևՒ֋֐ք֏հև՞՟", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[4] = NLoginCore_091.D("ՖՙվՑՆՠ֋նՃ՝ՙշդՑՐ֑Քժ֖ի՘ա՞՟", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[5] = NLoginCore_559.A("ǏǛǗƽƺǝƜƛƾƞƷƦǕƶǋǛƢǠƤǜǱǲǣƾǐƫƶǉǉǋǔǙǪǦǰǝȁǲƹǑǥǚǶǅǑǠȀǧǬǩǾǺǟȀǳǩȐǋȀǲǣȃǻǗ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[6] = NLoginCore_004.F("֦֢֚ֈօ֨էզ։թւձ֠ց֖֦խ֫կּ֧ճֺմ֚։ֻ֖֘־֯քָָֻ֪֩֋ֿ֧־֤׆ք׀ֵ֩֏׊ו׌׌ֶ֫֫׏ז֚֟֩ע׎פוֿףמןׇׄ׀׮ק׍צ֩קןז׶׈ֵ׍ג׍ׁׂׄ", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[7] = NLoginCore_451.E("֦֢֚ֈօ֨էզ։թւձ֠ց֖֦խ֫կּ֧մն֎ְսְֱֻ֤֮֝֜֯׊֦֙ևֺֻ֮ֆ֭֯ג֭֮֞׌ֹ֭֮֩׏ֲלֱאֿ־ֽ֣֤צֽ־ֺֹּר֣׋֨לֹ֪֮׎׊״תׅ׮אופׇ׵׎׍׼׽דֿי׸؁־ׅ׿ר׈׿ר׺؁׻ז", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ǏǛǗƽƺǝƜƛƾƞƷƦǕƶǋǛƢǠƤǜǱƮǂǯǁǪǋǐǦǇǏǴǨǬǖǊǛǯǍǐǃȄƾȄǖǻȃǴȋȄȄȌǉȉȎȂǭǪǟǤǰǡȍȍǛȝǫǚȠǓǙȋǢǤǷȧǢǤǺȅǽȧǦȠǪȅȅȎǬȋǶȔǷȺȨǶ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[9] = NLoginCore_091.D("ԺԿպՂպ՜ժՄՕնֆօֈ՝ՠ՜֐ծ֎֊ղ֚ձ։ծ֏֛ծո։֏֗", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[10] = NLoginCore_201.A("ƻƼƹǍƽǜǁƟǏǘǔƫ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[11] = NLoginCore_027.A("ǏǛǗƽƺǝƜƛƾƞƷƦǕƶǋǛƢǠƤǜǱǰǰǒǌǍǑǐǋǄǻƸƸǹƾǏǝǍǼǗȁǣǙȁǸǒǔǚǶǫǛȌȆǽȅǰȉǵǑȋȓȐǰǯ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ƜƔƖƺƘƷǢƸǑƹǢǝƣǛƵǔǗǋǟǬƽƣǯǠƽǕǑǊưǶǊǯ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[13] = NLoginCore_559.B("ƴǞǟǟưƽǝǂǗƠǐƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[14] = NLoginCore_138.C("դչԽրՇՑըյՇՊ՗կ՘ծզ՟փ֓յյՐա՞՟", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[15] = NLoginCore_091.B("ǄǘƧƸƽƻƛƕǁƵǠƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[16] = NLoginCore_027.E("֢ա֝֞՝ն֌ջ֩էսն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[17] = NLoginCore_076.B("ƸƽƜƪƻƴǏǃǕǁǔƷǘǃǛǓǛǪƿƾǏǉƶƷ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[18] = NLoginCore_223.F("հռ֚մ֡֡֞ք֊֨ցն", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[19] = NLoginCore_451.C("ոզԿհոՉչՉօՆև՝րիծըփՋՑրէկհ֏֋֍Օժջ֎ժծ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[20] = NLoginCore_387.D("՗չՐպտժՉթՋյ։ւզՙ։՞ը֏Ֆմչ֋֖Ք֏սհ՝ՙ֝֕վր֜֜մջրդէ֠ք֘ճ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[21] = NLoginCore_138.A("ƛǈǕƾƨƝƙƣƬƛƾǗǂǓƻƫƣǞǄǧǦǋƨƫǱǊǯƵǓǂǒǌǝǙǒǐǉȁǚǽǒȂƼǟǜƿǹǹȆȃǗǸǟǈǋǓǱǟǿǯǑȊȖȈțȈǱǽǻǮȡǹȥǤǷǟȕǽȈǩȍȍȉǫȚȭȫȲǬȥȳȴȯȧȨǸ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[22] = NLoginCore_091.B("ƙƘƘǓǍƹƾǃƭƼǘƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[23] = NLoginCore_384.E("ք֔ըռֈ֤եէ֦ց֍ժծցձ֢֖֘֗֓ոֺցւ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[24] = NLoginCore_324.B("ƛǅƕƬǜǉƜƺǄǂǆƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[25] = NLoginCore_201.D("եՙՓ՘Ժդա՝Ճ՛ՉՓ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[26] = NLoginCore_091.D("շփտեբօՄՃզՆաևօֈՏիճՋճզՐ֔֌օհ֜֜֔֗ժՠծ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[27] = NLoginCore_092.C("ՑՃ՘ՒսԿւոՊտ֎։եավՑՠս֓մե֗՞՟", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[28] = NLoginCore_451.F("ՠձ֕պչ֧֪֙֜թիծւֳի֌ַ֪֪֚֨֯ցւ", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[29] = NLoginCore_173.C("լղպՙ՞ոՕէՂչկ֍֍ձ֋ՌՐ՞֎ող֔կ֑սժ֟֗ր֢֕֟յրծղգ֢֕֗ց֩վծ֛֘֝֟ղְ֒֗ցցվտ", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[30] = NLoginCore_201.E("զռտ֕ք֋֫֋ե֪֡ցփ֬֓օ֌և֪֩նֺցւ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[31] = NLoginCore_559.D("լօԿ՗՗Իդ՚զվրեատգՐյ֓ՒւխձՓթ֑֕֒յ՗սփ՚֦֚փօճ֪֪֘֔֊֦֝֨վ֥֭֏ַ֬ֆֲ֨֩յֺ֥֝ևշչׁ֯֫֔֜փֳׇֻּֽ֧֣֭֔֓֞֏֊ְ֪׀ז֡֞֟", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[32] = NLoginCore_384.C("շփտեբօՄՃզՆ՟օՠց֓ՍղւՔ֖֗Րղլկ֑֚֒՛֚ն֤", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[33] = NLoginCore_559.C("՟ԿԿէփ֊եըՙՈ՚ք՚վՄ֓էձ֍Փե֗՞՟", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[34] = NLoginCore_451.E("՟քդ՜նենըէ֤հ֡ձ֮քְֵ֑ճ֢օքցւ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[35] = NLoginCore_427.D("շփտեբօՄՃզՆ՟օՠց֓ՍղւՔ֖֗֙ը՘հ՗֎տֈ՞ձ֋֐ւօշմ֒ջ֨֬տ֢֚ջ֥կձ֪ֆְ֫֐ֶ֑֍֮֕։֕։֙֍չտְׂ֥֢֕֊ֵ֫֬֍֓", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[36] = NLoginCore_091.D("ՑՠՏՃԾևքն֍ր՚Փ", (byte)114, 68);
                    NLoginCore_233.var_java_lang_String_arr_b[37] = NLoginCore_138.A("ƮƱǖƩƞƸǣǎƛƵƮƹǒǛǟǅǨƼƼƩǝǟƶƷ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[38] = NLoginCore_223.B("ǏǛǗƽƺǝƜƛƾƞƷǝƸǙǫƥǊǚƬǮǯǱǀưǈƯǦǗǠƶǉǣǨǚǝǏǌǪǓȀȄǗǺǲǓǽǇǉȂǞȈȃǨȄǬȎǦǫǬǐȉȉȊǘȗǮȒǺǲǱǢǽȣȂȔǫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[39] = NLoginCore_446.E("֦֢֚ֈօ֨էզ։թփֱִ֛֢֫ց֑֏ձֱֽ֖֕֬֩֯֏֍֣֔ռ׀ִ֛֤֠֕֋ׁ׆֣֋ׇ֎ׁ֦֑֎יִ׎ֶּטא֘֬ןונא֡ז", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[40] = NLoginCore_027.C("ԽգպջջՅՈթ՝ՙթՏ՝սգժֈքքՒ֗է֑գս֝պ֖֡մ֍֚", (byte)114, 67);
                    NLoginCore_233.var_java_lang_String_arr_b[41] = NLoginCore_091.A("ƱǇƮǕƞǀƚƼƛǏǠƫ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[42] = NLoginCore_004.E("֦֢֚ֈօ֨էզ։թփֱִ֛֢֫ց֑֏ձֱֽ֖֕֬֩֯֏֍֣֔ռְֲֲ֦օֽ֛֢֜֟א֎ׄ֜֞֏ֱ֬֘׏ֺי׍ןֲ֚֮֟יטזל־׃׃ֻ֣֧־ׄ֫פֶׅ", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[43] = NLoginCore_223.E("ՠֆ֝֞֞ըի֌րռ֌ղր֠ֆ֍֧֧֫յֺ։֚֌־ּ֭֫֫պֳ֢", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[44] = NLoginCore_201.E("հշֈս֧թֈ֊֢֏֣ն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[45] = NLoginCore_027.B("ǑƖƗƖǘƗǜƫǥǕǘƫ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[46] = NLoginCore_384.B("ƶƪƩǏƬǛǢƕƠǆƥǥƟƸƳƪƩƟǮƿǭƹƶƷ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[47] = NLoginCore_091.E("բ֩֟դջ՞֚ըչժ֢֊֊֌վ֯֒֓֍ֲ֖քկ֭֩֘֟ց֯տրׇֿ֦օֽ֦ׄ֫׆אֲֻ֪֚֌֭֒הְך֫ז׊֢֡", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[48] = NLoginCore_092.F("֚֞չ֠ե֭֕ոըս֜տևրքֆ֓֐֊ֹօքցւ", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[49] = NLoginCore_091.B("ǗǏǘǕǎƻƙƼƵǡǔƼƻǡƢƢǕǮǨǭǮƹƶƷ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[50] = NLoginCore_427.A("ƥǚƝƨǖƬǋǀǤǒƝƫ", (byte)114, 65);
                    NLoginCore_233.var_java_lang_String_arr_b[51] = NLoginCore_223.B("ƗǞǔƙưƓǏƝƮƟǗƿƿǁƳǤǇǈǂǋǧƹƤǞǢǍǔƶǤƴƵǛǙǬǺǫǿǭȁǍǹǕǯǘǈǸǉȀǞȂȁȊǞǩǖǗ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[52] = NLoginCore_027.F("֚֞չ֠ե֭֕ոըս֛֯ծ֟տ֮֐֡֍ւ֗ֆֲ։ֳָֽ֚ռֱׂ֮", (byte)114, 70);
                    NLoginCore_233.var_java_lang_String_arr_b[53] = NLoginCore_091.E("֣֨է֤֖֚։֖ժըսն", (byte)114, 69);
                    NLoginCore_233.var_java_lang_String_arr_b[54] = NLoginCore_427.B("ǏǛǗƽƺǝƜƛƾƞƸǐǩǦǗǠƶǆǄƦǊǫǤǔǅƯǍǊǙǢǅǮǚǔǯǘǝǿǾǙƾǤǅǃǖǓȃȄȀǊǽǿȄǩǖǗ", (byte)114, 66);
                    NLoginCore_233.var_java_lang_String_arr_b[55] = NLoginCore_559.C("՟ողրյչՈզ֊օնՙր֋֓֋՟գէե֊ե֎պ֛՘ֆղճ֘ՙ֐ղ֠բ֧գօցվչ֚֊֞֎պօֱֱֳִֹ֣֧֯֐ջֲմֺֹ֩֒ւքְֻׂ֟ֈֲַ֓׆օօ֎ֲ־֐׍֋׊։ֶֶ֘֍֛֓֕֞בֱ֯הג֭לף֧י׆רׇֻטֳ", (byte)114, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_233.var_java_lang_String_arr_b[0] = NLoginCore_451.E("տ՚ճֆ։֩֍֥֪ռ֪֧֑֟ծփ֋ֈիոֺ֮ցւ", (byte)114, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_233.var_java_lang_String_arr_b[0] = NLoginCore_384.D("ծ՛Լմպ՛Շջ՘աՍՉտէՑ֓ֈժօձճդֈիֈ֛֜֘ն֎֏֠", (byte)114, 68);
                }
            }
        }
    }

    public void ar() {
        Object object;
        String string;
        if (this.var_java_util_concurrent_atomic_AtomicBoolean_d.get()) {
            NLoginCore_370.e((String)NLoginCore_233.c("㺀", (int)(var_int_d & var_int_e), (long)f), new Object[g]);
            return;
        }
        String string2 = this.var_int_e.q();
        File file = new File(this.var_int_e.e() + File.separator + (String)NLoginCore_233.c("㺃", (int)(h & i), (long)j), string2 + (String)NLoginCore_233.c("㺆", (int)k, (long)(l ^ m)));
        if (!file.exists()) {
            return;
        }
        File file2 = new File(this.var_int_e.e() + File.separator + (String)NLoginCore_233.c("㺉", (int)n, (long)(o ^ p)), string2 + (String)NLoginCore_233.c("㺌", (int)q, (long)(r ^ s)));
        if (!file2.exists()) {
            NLoginCore_370.e((String)NLoginCore_233.c("㺏", (int)t, (long)(u ^ v)), new Object[w]);
            return;
        }
        NLoginCore_227 NLoginCore_2272 = this.var_int_e.com_nickuc_login_NLoginCore_227_a();
        NLoginCore_142 NLoginCore_1422 = NLoginCore_2272.com_nickuc_login_NLoginCore_142_a();
        String string3 = NLoginCore_1422.N();
        if (string3 == null) {
            return;
        }
        if (!this.X && !NLoginCore_1422.ac()) {
            NLoginCore_370.e((String)NLoginCore_233.c("㺒", (int)x, (long)(y ^ z)), new Object[aa]);
            return;
        }
        try {
            string = NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(file);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_233.c("㺕", (int)ab, (long)(ac ^ ad)), exception, new Object[ae]);
            return;
        }
        if (!string.equals(string3)) {
            NLoginCore_370.e((String)NLoginCore_233.c("㺘", (int)(af & ag), (long)ah) + string + (String)NLoginCore_233.c("㺛", (int)ai, (long)aj) + string3 + (String)NLoginCore_233.c("㺞", (int)ak, (long)al), new Object[am]);
            return;
        }
        if (!NLoginCore_570.b(file, file2)) {
            NLoginCore_370.d((String)NLoginCore_233.c("㺡", (int)an, (long)ao), new Object[ap]);
            return;
        }
        File file3 = this.var_int_e.java_io_File_c().getParentFile();
        Object object2 = this.var_int_e.com_nickuc_login_NLoginCore_224_a().f();
        if (((String)NLoginCore_233.c("㺤", (int)(aq & ar), (long)as)).equals(((File)object2).getParentFile().getName()) && ((File)(object = new File(file3, ((File)object2).getName()))).exists()) {
            object2 = object;
        }
        NLoginCore_059.c(this.var_int_e, file3);
        object = NLoginCore_1422.M();
        String string4 = string2 + (String)NLoginCore_233.c("㺧", (int)at, (long)au) + (String)object + (String)NLoginCore_233.c("㺪", (int)av, (long)(aw ^ ax));
        if (((File)object2).getName().equals(string4)) {
            string4 = string2 + (String)NLoginCore_233.c("㺭", (int)ay, (long)(az ^ ba)) + (String)object + (String)NLoginCore_233.c("㺰", (int)bb, (long)(bc ^ bd));
        }
        Object object3 = object2;
        File file4 = new File(file3, string4);
        boolean bl = System.getProperty((String)NLoginCore_233.c("㺳", (int)(be & bf), (long)bg)).toLowerCase(Locale.ENGLISH).contains((CharSequence)NLoginCore_233.c("㺶", (int)bh, (long)(bi ^ bj)));
        Thread thread = new Thread(() -> NLoginCore_233.a(file, file2, file4, (File)object3, bl), string2 + (String)NLoginCore_233.c("㺹", (int)bk, (long)NLoginCore_233.bl));
        thread.setDaemon(bm != 0);
        try {
            Runtime.getRuntime().addShutdownHook(thread);
        }
        catch (IllegalStateException illegalStateException) {
            if (((String)NLoginCore_233.c("㺼", (int)(bn & bo), (long)bp)).equals(illegalStateException.getMessage())) {
                return;
            }
            throw illegalStateException;
        }
        String string5 = NLoginCore_2272.G();
        NLoginCore_370.e((String)NLoginCore_233.c("㺿", (int)(bq & br), (long)bs) + this.var_int_e.s() + (String)NLoginCore_233.c("㻂", (int)(bt & bu), (long)bv) + string5 + (String)NLoginCore_233.c("㻅", (int)bw, (long)bx) + (String)object + (String)NLoginCore_233.c("㻈", (int)(by & bz), (long)ca) + NLoginCore_1422.O() + (String)NLoginCore_233.c("㻋", (int)cb, (long)(cc ^ cd)), new Object[ce]);
    }

    public void d(@Nullable Consumer<Boolean> consumer) {
        if (this.var_java_util_concurrent_atomic_AtomicBoolean_d.getAndSet(var_int_a != 0)) {
            if (consumer != null) {
                consumer.accept(var_int_b != 0);
            }
            return;
        }
        this.var_int_e.b(var_int_c != 0).a(() -> {
            File file;
            File file2;
            NLoginCore_270 NLoginCore_2702;
            block19: {
                NLoginCore_285 NLoginCore_2852;
                NLoginCore_305 NLoginCore_305;
                block18: {
                    block17: {
                        block16: {
                            NLoginCore_2702 = new NLoginCore_270();
                            NLoginCore_305 = NLoginCore_305.a();
                            NLoginCore_305.a(de);
                            NLoginCore_305.com_nickuc_login_NLoginCore_305_b(df);
                            file2 = new File(this.var_int_e.e() + File.separator + (String)NLoginCore_233.c("㺀", (int)dg, (long)(dh ^ di)), this.var_int_e.q() + (String)NLoginCore_233.c("㺃", (int)dj, (long)dk));
                            if (!file2.exists() || file2.delete()) break block16;
                            NLoginCore_370.c((String)NLoginCore_233.c("㺆", (int)dl, (long)(dm ^ dn)), new Object[cfr_renamed_1]);
                            if (consumer != null) {
                                consumer.accept(dp != 0);
                            }
                            this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(dq != 0);
                            return;
                        }
                        file = new File(this.var_int_e.e() + File.separator + (String)NLoginCore_233.c("㺉", (int)dr, (long)ds), this.var_int_e.q() + (String)NLoginCore_233.c("㺌", (int)dt, (long)(du ^ dv)));
                        if (!file.exists() || file.delete()) break block17;
                        NLoginCore_370.c((String)NLoginCore_233.c("㺏", (int)dw, (long)(dx ^ dy)), new Object[dz]);
                        if (consumer != null) {
                            consumer.accept(ea != 0);
                        }
                        this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(eb != 0);
                        return;
                    }
                    NLoginCore_2852 = NLoginCore_305.a(this.var_int_e.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().P(), file2, ec);
                    if (NLoginCore_2852.af()) break block18;
                    NLoginCore_370.d((String)NLoginCore_233.c("㺒", (int)ed, (long)(ee ^ ef)) + NLoginCore_2852.p() + (String)NLoginCore_233.c("㺕", (int)eg, (long)(eh ^ ei)) + NLoginCore_2852.f() + (String)NLoginCore_233.c("㺘", (int)ej, (long)ek), new Object[el]);
                    if (consumer != null) {
                        consumer.accept(em != 0);
                    }
                    this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(en != 0);
                    return;
                }
                NLoginCore_285 NLoginCore_2853 = NLoginCore_305.a(this.var_int_e.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().Q(), file, eo);
                if (NLoginCore_2853.af()) break block19;
                NLoginCore_370.d((String)NLoginCore_233.c("㺛", (int)ep, (long)(eq ^ er)) + NLoginCore_2852.p() + (String)NLoginCore_233.c("㺞", (int)es, (long)et) + NLoginCore_2852.f() + (String)NLoginCore_233.c("㺡", (int)(eu & ev), (long)ew), new Object[ex]);
                if (consumer != null) {
                    consumer.accept(ey != 0);
                }
                this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(ez != 0);
                return;
            }
            try {
                boolean bl = NLoginCore_570.b(file2, file);
                Object object = bl ? NLoginCore_233.c("㺤", (int)fa, (long)(fb ^ fc)) : NLoginCore_233.c("㺧", (int)fd, (long)(fe ^ ff));
                long l = NLoginCore_2702.h();
                try {
                    NLoginCore_370.e((String)NLoginCore_233.c("㺪", (int)fg, (long)fh) + (String)object + (String)NLoginCore_233.c("㺭", (int)fi, (long)(fj ^ fk)) + NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(file2) + (String)NLoginCore_233.c("㺰", (int)fl, (long)(fm ^ fn)) + l + (String)NLoginCore_233.c("㺳", (int)fo, (long)fp), new Object[fq]);
                }
                catch (Exception exception) {
                    NLoginCore_370.e((String)NLoginCore_233.c("㺶", (int)fr, (long)fs) + (String)object + (String)NLoginCore_233.c("㺹", (int)ft, (long)(fu ^ fv)) + l + (String)NLoginCore_233.c("㺼", (int)fw, (long)fx), new Object[fy]);
                }
                if (consumer != null) {
                    consumer.accept(fz != 0);
                }
                this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(ga != 0);
            }
            catch (Exception exception) {
                try {
                    NLoginCore_370.d((String)NLoginCore_233.c("㺿", (int)(gb & gc), (long)gd), new Object[ge]);
                    NLoginCore_370.d((String)NLoginCore_233.c("㻂", (int)(gf & gg), (long)gh) + this.var_int_e.q(), new Object[gi]);
                    if (consumer != null) {
                        consumer.accept(gj != 0);
                    }
                    this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(gk != 0);
                }
                catch (Throwable throwable) {
                    this.var_java_util_concurrent_atomic_AtomicBoolean_d.set(gl != 0);
                    throw throwable;
                }
            }
        });
    }

    @Generated
    public boolean ah() {
        return this.X;
    }

    @Generated
    public void e(boolean bl) {
        this.X = bl;
    }

    @Generated
    public NLoginCore_233(NLoginCore_116<?> NLoginInterface_0112) {
        this.X = cf;
        this.var_int_e = (int)NLoginInterface_0112;
    }

    private static String a(int n, long l) {
        l ^= 0x36L;
        l ^= 0x1420F30AF685DDAAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(55 + 14), (byte)(28 + 55), (byte)(3 + 44), (byte)(16 + 51), (byte)(38 + 28), (byte)(4 + 63), (byte)(42 + 5), (byte)(6 + 74), (byte)(43 + 32), (byte)(55 + 12), (byte)(42 + 41), (byte)(18 + 35), (byte)(5 + 75), (byte)(83 + 14), 100, (byte)(68 + 32), (byte)(92 + 13), 110, (byte)(3 + 100)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(68 + 1), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.E("ֆ֓֒Օ֑֕֌֕֠֏՜֚֚֞֗֠բࣦ࣮ࣣࣸ࣋࣋࣬ࣛ", (byte)103, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_233.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_233.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.B("ƁƣƥƅƩǈǀǖǂƑǏǅǓǍƖƻǝǜǔǚǔƩ", (byte)109, 66), NLoginCore_233.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.E("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣲ࣑࣑ࣩࣾ࣬ࣴ࣡ռ", (byte)109, 69) + string + NLoginCore_559.B("Ɠ", (byte)109, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 32 >>> 165 | 32 << -165;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0 >>> 1 | 0 << ~1 + 1;
        var_int_e = Integer.reverse(-1);
        f = Long.reverse(-798456139317817645L);
        g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (-1 >>> 55 | -1 << -55) & 0xFFFFFFFF;
        j = Long.reverse(-798456139317817645L);
        k = (512 >>> 232 | 512 << -232) & 0xFFFFFFFF;
        l = Long.reverse(-7427754790807187757L);
        m = Long.reverse(0x6C00000000000000L);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(-7427754790807187757L);
        p = Long.reverse(0x6C00000000000000L);
        q = 16384 >>> 44 | 16384 << ~44 + 1;
        r = Long.reverse(-7427754790807187757L);
        s = Long.reverse(0x6C00000000000000L);
        t = Integer.reverse(-1610612736);
        u = Long.reverse(-7427754790807187757L);
        v = Long.reverse(0x6C00000000000000L);
        w = Integer.reverse(0);
        x = 48 >>> 99 | 48 << -99;
        y = Long.reverse(-7427754790807187757L);
        z = Long.reverse(0x6C00000000000000L);
        aa = Integer.reverse(0);
        ab = Integer.reverse(-536870912);
        ac = Long.reverse(-7427754790807187757L);
        ad = Long.reverse(0x6C00000000000000L);
        ae = 0 >>> 198 | 0 << -198;
        af = Integer.reverse(0x10000000);
        ag = Integer.reverse(-1);
        ah = Long.reverse(-798456139317817645L);
        ai = Integer.reverse(-1879048192);
        aj = Long.reverse(-798456139317817645L);
        ak = 0x140000 >>> 113 | 0x140000 << -113;
        al = Long.reverse(-798456139317817645L);
        am = 0 >>> 208 | 0 << -208;
        an = (360448 >>> 175 | 360448 << ~175 + 1) & 0xFFFFFFFF;
        ao = Long.reverse(-798456139317817645L);
        ap = Integer.reverse(0);
        aq = (0x180000 >>> 209 | 0x180000 << ~209 + 1) & 0xFFFFFFFF;
        ar = (-1 >>> 145 | -1 << ~145 + 1) & 0xFFFFFFFF;
        as = Long.reverse(-798456139317817645L);
        at = Integer.reverse(-1342177280);
        au = Long.reverse(-798456139317817645L);
        av = Integer.reverse(0x70000000);
        aw = Long.reverse(-7427754790807187757L);
        ax = Long.reverse(0x6C00000000000000L);
        ay = 240 >>> 4 | 240 << -4;
        az = Long.reverse(-7427754790807187757L);
        ba = Long.reverse(0x6C00000000000000L);
        bb = 0x4000000 >>> 86 | 0x4000000 << -86;
        bc = Long.reverse(-7427754790807187757L);
        bd = Long.reverse(0x6C00000000000000L);
        be = 0x1100000 >>> 84 | 0x1100000 << -84;
        bf = Integer.reverse(-1);
        bg = Long.reverse(-798456139317817645L);
        bh = 0x9000000 >>> 23 | 0x9000000 << ~23 + 1;
        bi = Long.reverse(-7427754790807187757L);
        bj = Long.reverse(0x6C00000000000000L);
        bk = Integer.reverse(-939524096);
        bl = Long.reverse(-798456139317817645L);
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = Integer.reverse(0x28000000);
        bo = -1 >>> 113 | -1 << ~113 + 1;
        bp = Long.reverse(-798456139317817645L);
        bq = 172032 >>> 13 | 172032 << ~13 + 1;
        br = Integer.reverse(-1);
        bs = Long.reverse(-798456139317817645L);
        bt = Integer.reverse(0x68000000);
        bu = -1 >>> 184 | -1 << -184;
        bv = Long.reverse(-798456139317817645L);
        bw = Integer.reverse(-402653184);
        bx = Long.reverse(-798456139317817645L);
        by = Integer.reverse(0x18000000);
        bz = Integer.reverse(-1);
        ca = Long.reverse(-798456139317817645L);
        cb = Integer.reverse(-1744830464);
        cc = Long.reverse(-7427754790807187757L);
        cd = Long.reverse(0x6C00000000000000L);
        ce = 0 >>> 52 | 0 << ~52 + 1;
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = Integer.reverse(0x58000000);
        ch = Long.reverse(-798456139317817645L);
        ci = Integer.reverse(-671088640);
        cj = Long.reverse(-798456139317817645L);
        ck = 512 >>> 232 | 512 << -232;
        cl = Integer.reverse(0);
        cm = Integer.reverse(0x38000000);
        cn = (-1 >>> 119 | -1 << ~119 + 1) & 0xFFFFFFFF;
        co = Long.reverse(-798456139317817645L);
        cp = Integer.reverse(Integer.MIN_VALUE);
        cq = Integer.reverse(-1207959552);
        cr = Long.reverse(-7427754790807187757L);
        cs = Long.reverse(0x6C00000000000000L);
        ct = Integer.reverse(0x40000000);
        cu = Integer.reverse(0);
        cv = Integer.reverse(0x78000000);
        cw = Integer.reverse(-1);
        cx = Long.reverse(-798456139317817645L);
        cy = Integer.reverse(Integer.MIN_VALUE);
        cz = Integer.reverse(-134217728);
        da = Long.reverse(-7427754790807187757L);
        db = Long.reverse(0x6C00000000000000L);
        dc = 0x800000 >>> 18 | 0x800000 << ~18 + 1;
        dd = Long.reverse(-798456139317817645L);
        de = Integer.reverse(850919424);
        df = Integer.reverse(212729856);
        dg = Integer.reverse(-2080374784);
        dh = Long.reverse(-7427754790807187757L);
        di = Long.reverse(0x6C00000000000000L);
        dj = (4352 >>> 103 | 4352 << ~103 + 1) & 0xFFFFFFFF;
        dk = Long.reverse(-798456139317817645L);
        dl = (0x30000002 >>> 60 | 0x30000002 << ~60 + 1) & 0xFFFFFFFF;
        dm = Long.reverse(-7427754790807187757L);
        dn = Long.reverse(0x6C00000000000000L);
        cfr_renamed_1 = (0 >>> 19 | 0 << -19) & 0xFFFFFFFF;
        dp = (0 >>> 126 | 0 << -126) & 0xFFFFFFFF;
        dq = Integer.reverse(0);
        dr = Integer.reverse(0x24000000);
        ds = Long.reverse(-798456139317817645L);
        dt = 75776 >>> 107 | 75776 << ~107 + 1;
        du = Long.reverse(-7427754790807187757L);
        dv = Long.reverse(0x6C00000000000000L);
        dw = -1744830464 >>> 26 | -1744830464 << -26;
        dx = Long.reverse(-7427754790807187757L);
        dy = Long.reverse(0x6C00000000000000L);
        dz = Integer.reverse(0);
        ea = (0 >>> 177 | 0 << ~177 + 1) & 0xFFFFFFFF;
        eb = 0 >>> 19 | 0 << ~19 + 1;
        ec = (0x10000000 >>> 17 | 0x10000000 << ~17 + 1) & 0xFFFFFFFF;
        ed = (0x9C00000 >>> 118 | 0x9C00000 << ~118 + 1) & 0xFFFFFFFF;
        ee = Long.reverse(-7427754790807187757L);
        ef = Long.reverse(0x6C00000000000000L);
        eg = Integer.reverse(0x14000000);
        eh = Long.reverse(-7427754790807187757L);
        ei = Long.reverse(0x6C00000000000000L);
        ej = (20992 >>> 9 | 20992 << ~9 + 1) & 0xFFFFFFFF;
        ek = Long.reverse(-798456139317817645L);
        el = Integer.reverse(0);
        em = 0 >>> 126 | 0 << ~126 + 1;
        en = 0 >>> 103 | 0 << -103;
        eo = Integer.reverse(0x50000000);
        ep = (-2147483638 >>> 222 | -2147483638 << ~222 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(-7427754790807187757L);
        er = Long.reverse(0x6C00000000000000L);
        es = Integer.reverse(-738197504);
        et = Long.reverse(-798456139317817645L);
        eu = Integer.reverse(0x34000000);
        ev = Integer.reverse(-1);
        ew = Long.reverse(-798456139317817645L);
        ex = Integer.reverse(0);
        ey = 0 >>> 43 | 0 << ~43 + 1;
        ez = Integer.reverse(0);
        fa = 0x5A00000 >>> 53 | 0x5A00000 << -53;
        fb = Long.reverse(-7427754790807187757L);
        fc = Long.reverse(0x6C00000000000000L);
        fd = (92 >>> 33 | 92 << -33) & 0xFFFFFFFF;
        fe = Long.reverse(-7427754790807187757L);
        ff = Long.reverse(0x6C00000000000000L);
        fg = Integer.reverse(-201326592);
        fh = Long.reverse(-798456139317817645L);
        fi = 3 >>> 60 | 3 << -60;
        fj = Long.reverse(-7427754790807187757L);
        fk = Long.reverse(0x6C00000000000000L);
        fl = Integer.reverse(-1946157056);
        fm = Long.reverse(-7427754790807187757L);
        fn = Long.reverse(0x6C00000000000000L);
        fo = Integer.reverse(0x4C000000);
        fp = Long.reverse(-798456139317817645L);
        fq = (0 >>> 135 | 0 << -135) & 0xFFFFFFFF;
        fr = 0xCC00000 >>> 214 | 0xCC00000 << ~214 + 1;
        fs = Long.reverse(-798456139317817645L);
        ft = 0x40000003 >>> 252 | 0x40000003 << ~252 + 1;
        fu = Long.reverse(-7427754790807187757L);
        fv = Long.reverse(0x6C00000000000000L);
        fw = Integer.reverse(-1409286144);
        fx = Long.reverse(-798456139317817645L);
        fy = (0 >>> 51 | 0 << -51) & 0xFFFFFFFF;
        fz = Integer.reverse(Integer.MIN_VALUE);
        ga = Integer.reverse(0);
        gb = 442368 >>> 205 | 442368 << ~205 + 1;
        gc = Integer.reverse(-1);
        gd = Long.reverse(-798456139317817645L);
        ge = (0 >>> 246 | 0 << -246) & 0xFFFFFFFF;
        gf = 1760 >>> 165 | 1760 << ~165 + 1;
        gg = Integer.reverse(-1);
        gh = Long.reverse(-798456139317817645L);
        gi = 0 >>> 18 | 0 << ~18 + 1;
        gj = 0 >>> 97 | 0 << ~97 + 1;
        gk = (0 >>> 2 | 0 << -2) & 0xFFFFFFFF;
        gl = (0 >>> 255 | 0 << -255) & 0xFFFFFFFF;
        gm = (7168 >>> 135 | 7168 << -135) & 0xFFFFFFFF;
        gn = Integer.reverse(0x1C000000);
        var_java_lang_String_arr_a = new String[gm];
        var_java_lang_String_arr_b = new String[gn];
        NLoginCore_233.b();
    }

    public void aq() {
        this.d(null);
    }

    private static /* synthetic */ void a(File file, File file2, File file3, File file4, boolean bl) {
        if (!file.exists()) {
            return;
        }
        if (file2.exists()) {
            file2.delete();
        }
        if (file3.exists()) {
            file3.delete();
        }
        if (!file.renameTo(file3)) {
            throw new RuntimeException((String)NLoginCore_233.c("㺀", (int)cg, (long)ch) + file + (String)NLoginCore_233.c("㺃", (int)ci, (long)cj) + file3);
        }
        file4.delete();
        if (bl) {
            String string = file4.getAbsolutePath();
            try {
                String[] stringArray = new String[ck];
                stringArray[NLoginCore_233.cl] = NLoginCore_233.c("㺆", (int)(cm & cn), (long)co);
                stringArray[NLoginCore_233.cp] = (String)NLoginCore_233.c("㺉", (int)cq, (long)(cr ^ cs)) + string;
                Runtime.getRuntime().exec(stringArray);
                String[] stringArray2 = new String[ct];
                stringArray2[NLoginCore_233.cu] = NLoginCore_233.c("㺌", (int)(cv & cw), (long)cx);
                stringArray2[NLoginCore_233.cy] = (String)NLoginCore_233.c("㺏", (int)cz, (long)(da ^ db)) + string;
                Runtime.getRuntime().exec(stringArray2);
            }
            catch (IOException iOException) {
                throw new RuntimeException((String)NLoginCore_233.c("㺒", (int)dc, (long)dd) + string, iOException);
            }
        }
    }
}

