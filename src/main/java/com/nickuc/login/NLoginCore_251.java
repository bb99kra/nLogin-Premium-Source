/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_005;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
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
import lombok.Generated;

public final class NLoginCore_251
extends Enum<NLoginCore_251>
implements NLoginInterface_005 {
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_a;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_b;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_c;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_d;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_e;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_f;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_g;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_h;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_i;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_j;
    public static final /* enum */ NLoginCore_251 var_com_nickuc_login_NLoginCore_251_k;
    private final NLoginCore_474 var_com_nickuc_login_NLoginCore_474_b;
    private static final /* synthetic */ NLoginCore_251[] var_com_nickuc_login_NLoginCore_251_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int var_int_e;
    private static long var_long_f;
    private static long var_long_g;
    private static int var_int_h;
    private static int var_int_i;
    private static long var_long_j;
    private static int var_int_k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static long z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static int ah;
    private static long ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static int am;
    private static int an;
    private static long ao;
    private static int ap;
    private static long aq;
    private static long ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static long aw;
    private static long ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static long bf;
    private static int bg;
    private static long bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static long bo;
    private static int bp;
    private static long bq;
    private static long br;
    private static int bs;
    private static int bt;
    private static int bu;
    private static int bv;
    private static int bw;
    private static long bx;
    private static int by;
    private static long bz;
    private static int ca;
    private static int cb;
    private static int cc;
    private static int cd;
    private static long ce;
    private static long cf;
    private static int cg;
    private static int ch;
    private static long ci;
    private static int cj;
    private static int ck;
    private static int cl;
    private static int cm;
    private static long cn;
    private static int co;
    private static long cp;
    private static long cq;
    private static int cr;
    private static int cs;
    private static int ct;
    private static int cu;
    private static long cv;
    private static long cw;
    private static int cx;
    private static long cy;
    private static long cz;
    private static int da;
    private static int db;
    private static int dc;
    private static int dd;
    private static int de;
    private static long df;
    private static int dg;
    private static long dh;
    private static long di;
    private static int dj;
    private static int dk;
    private static int dl;
    private static int dm;
    private static long dn;

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0x808532DC749F68DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(22 + 47), 83, (byte)(46 + 1), (byte)(11 + 56), (byte)(5 + 61), (byte)(24 + 43), (byte)(43 + 4), (byte)(25 + 55), (byte)(23 + 52), (byte)(28 + 39), (byte)(62 + 21), (byte)(7 + 46), (byte)(53 + 27), (byte)(46 + 51), (byte)(77 + 23), (byte)(76 + 24), (byte)(14 + 91), (byte)(67 + 43), (byte)(79 + 24)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("գհկԲղծթղսլԹշջմշսԿࣗࣛࢻࢴ࣒ࣞ࣋ࣝࣛ", (byte)68, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_251.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -152393664069386268L;
        long l = var_long_c ^ 0x808532DC749F68DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(6 + 63), (byte)(61 + 22), (byte)(23 + 24), (byte)(53 + 14), (byte)(29 + 37), (byte)(11 + 56), (byte)(42 + 5), (byte)(56 + 24), (byte)(11 + 64), (byte)(23 + 44), 83, (byte)(25 + 28), (byte)(21 + 59), (byte)(14 + 83), (byte)(50 + 50), (byte)(75 + 25), (byte)(85 + 20), 110, (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_251.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƒǄǍǄƦǓƚǆƖƱƶǝƮǎǟǣǤǞǣǗƳǡǤǦǉƫǚǢǞǩǲǴǑǳƬǀǭǍǗǦǸǳǨǩƾǷǠǘȂǿǝǥǝǑǎǏ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[1] = NLoginCore_110.B("ƦƭƠƨƪƪǇƶƹǚƕƣ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[2] = NLoginCore_384.C("ծգղպը՞ՒխռԾՒՇ", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[3] = NLoginCore_324.D("մՌջԶՖս՘մԽրծտշՓՙՏ՘է՜՗՚Յՠքձ՞֓ֆ֎զՑՠ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[4] = NLoginCore_110.F("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֧հֶ֧և֝֐ֳղֳִֵ֡րֻ֑֧֦֓֟֩׋֒", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[5] = NLoginCore_201.C("մՌջԶՖս՘մԽրխնՐճԼէՔօզ՘ՕՖ֏դ։Ռ֐֌ՆՋշզ", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[6] = NLoginCore_559.A("ǉƦƩƕƗǅƔǏǒǅǑƲǊƯǟǛǡǜǥƯǣǦǃǫǫǥǀǛƫƾƼǞǋǨǟǷǯǦǐǯǹƳǆǃ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ǐƨǗƒƲǙƴǐƙǜǉǠƜǗƔƯǎǢǔǒǤǠƲǀƶǛƹǃǭǡǊǆ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[8] = NLoginCore_384.E("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֯֨֙ն֌ևֶ֪֚չ־֒ք֤֏֦փֵׇ֘֙֙֒", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[9] = NLoginCore_387.B("ǐƨǗƒƲǙƴǐƙǜǉǖǋƸƵǍƺǔǤǓǥƥƽǃǆƦƤǉƪǙǄƽ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[10] = NLoginCore_138.C("խՊՍԹԻթԸճնթյՖծՓփտօր։Փևֆզֆպ՞սՐ՝տէ֑ձ֚փօխ֝զը՚֐ՙէ", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[11] = NLoginCore_324.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƥǕƩƹƦǆǚƬƼƻƾǓǡǳǌǵǌǓǫǓǭǳǕǗǐȂǾǜǑǄǵƿǡǎǏ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[12] = NLoginCore_559.E("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡և֖֚խ֐ֱֵ֚֭֕պջֵֵַַֹ֦֞֋֩׉֘־֢֠׈׌ׂ׃ׇ֤ד֯֌חכטֿ׉נלֲ", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[13] = NLoginCore_173.E("ղշղա՝վտ֜֌֗ցւ֌֛։֑֑֏ցկָձ֢֔պջֻ֕֏ղֳַָׇֺֻֽֿ֭֡֟֜֞֒", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[14] = NLoginCore_451.F("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡և֖֚խ֐ֱֵ֚֭֕պֺׁׂ֭֔ֈַ֙փֲׇֻּֿׅ֭֮֊ֱאִז֝֞", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[15] = NLoginCore_223.F("ղշղա՝վտ֜֌֗ցւ֌֛։֑֑֏ցկָմ֤ոֈյ֕֩ջ֋֊֍ֹֿ֒օְ֥ջׇֺֻ֥֠־בֽ׋֛֒֍ֱ֤ז֝֞", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[16] = NLoginCore_223.D("խՊՍԹԻթԸճնթշց՝՟ւևՕպՉէն՜կիՂե֊ժկւֆՏՏՙ՗ձՖՔ֊չ֕ր֕ց֌֛֖֝֙փւ֦։֛ղճ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[17] = NLoginCore_427.D("ՇՌՇԶԲՓՔձալՖ՗ահ՞զզդՖՄ֍֌գզ֌և֏֒ճյցՕեՓ֑֚֔ս՛Ֆխ֑֓ւօֆբֆ֖աչ֪֛֬ղճ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[18] = NLoginCore_223.B("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƽǓǪǪǢƽǐƬǍưǁǋǲƴǩǊǤǧǩǋǧǊǞǬƼƿǴǬǐǜǁǚȆǣǾǫǄǗǘȌǙǮǤ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[19] = NLoginCore_223.C("իՄէԳ՘յԼՍՏԺգղչմՄՆ՝ճջնչՖւբե֊կւե֋օ֍թՏզիճ՚մ֝֞ալ֍֍֝վհդևվ֖պ֛ղճ", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[20] = NLoginCore_138.F("փ֑յչնւ֖֙պլ֭ժ֘ֆ֣֚ջև֯֎ճ֡ց֢֖֊ִ֍֏ր֑֫յׂ֟ովׇׁ֛֤֌ׁ֠ׄאև֐ׅ֑׎׍ְׂ֝֞", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[21] = NLoginCore_427.B("ǇƠǃƏƴǑƘƩƫƖƿƱƪƽǋƺǄǁǁǚǁƸǋƫǇǁƷƽǨǐǟǋǇǧƾǈǥƳǇƵǳƴǎǮǐǳǛǭǳǳǒȈǴǡǎǏ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[22] = NLoginCore_076.B("ƴǂƦƪƧƳǇǊƫƝǟǘƗǟƸǂǂƶǧǐƧƨƴǆƫǛƾǮǘǙǣǇǉǬǯǋƵǶǷƷǊǨƻǳǽǒǋǝǖǃǿǏǻǸȊǪǜǧǷȌǐǞǉǬ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[23] = NLoginCore_223.A("ǇƠǃƏƴǑƘƩƫƖƿǎǕǐƠƢƹǏǗǒǕƲǞƾǁǦǋǞǁǧǡǩƾǄǞǵǓǶǆǫƵǙǈǲǛǪǱǱǴƷǙǲǚǷǎǏ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[24] = NLoginCore_092.A("ƴǂƦƪƧƳǇǊƫƝǞƷǒǓƪǖǄǙƞƹǁǇǥƝƧǧǘǘǆǣǯǲǈǓǀƴǢƱǆǆǲƺǬǚǶǽƿǋǤƼǻǃǑǧǵǋȌǨǻȎǏǯǊǢ", (byte)110, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_251.var_java_lang_String_arr_b[0] = NLoginCore_173.D("ԶըձըՊշԾժԺՕ՚ցՒղփևֈւևջ՗օֈ֊խՏվֆւ֍֖֘յ֗Րդ֑ձջ֊֜֗֍մ֤֍պֆվ֨֓։եօղճ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[1] = NLoginCore_223.F("ՠ֍֚֓֝ճ֛յ֥֨ոև֧րփի֦֯իַ֪֦սվ", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[2] = NLoginCore_384.C("ՄՋԵԳՙծԻՓՀի՞Շ", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[3] = NLoginCore_324.D("մՌջԶՖս՘մԽրծտշՓՙՏ՘է՜՗՚Ճ՜ՆջՉ֓֋էՓը֒", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[4] = NLoginCore_091.F("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֲ֧հֶ֧և֝֐ֳղֳִ֦֚֙֟׆րׅֈ֋ֹ֙֒", (byte)110, 70);
                    NLoginCore_251.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ǐƨǗƒƲǙƴǐƙǜǉǒƬǏƘǃưǡǂƴƱƹǠǩǙƾƦǝǇǏǓǲ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[6] = NLoginCore_324.D("խՊՍԹԻթԸճնթյՖծՓփտօր։Փև֊է֏֏։դտՏբՠւյցզխէպիտ֋֝վէ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[7] = NLoginCore_091.A("ǐƨǗƒƲǙƴǐƙǜǉǠƜǗƔƯǎǢǔǒǤǦƴǈƴǭƨǋƢǁǫǇ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[8] = NLoginCore_138.D("խՊՍԹԻթԸճնթյՖծՓփտօր։ՓևքսծՋա՜տ֋կՎ֓֍ցնչկռ֍՘֎ո֐է", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[9] = NLoginCore_201.A("ǐƨǗƒƲǙƴǐƙǜǉǖǋƸƵǍƺǔǤǓǥƧƾǛƻƸǊƿƪƨǬǃ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[10] = NLoginCore_223.E("֘յոդզ֔գ֞֡֔֠ց֙վְִ֪֮֫վֱֱֲ֑֥։֨ջֈּ֪֒պֵց֐֛֦֜־։֋֩֒", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[11] = NLoginCore_559.D("ՇՌՇԶԲՓՔձալՖ՗ահ՞զզդՖՄ֍ՉչՍ՝ՊժվՐՠ՟բշօ֗հ֙հշ֏շ֑֗֔րդ֑֒֐շբօ֝֫ղճ", (byte)110, 68);
                    NLoginCore_251.var_java_lang_String_arr_b[12] = NLoginCore_173.A("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫƬǪǏǨǨǦǦǗƼǚǺǉǯǑǓǹǽǳǴǕǸǽǒǟǪǶǆǽȈȇǎǯ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[13] = NLoginCore_138.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƢǓǅƫƬǆǬǀƣǬǞǝǢǪǪǷǢǇǒǱǐƹǃ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[14] = NLoginCore_223.B("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫǅǲǞǫǳƹǨǊƴǸǳǖǋǛǡǋǠǁǞǻǼǷǎǏ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[15] = NLoginCore_384.B("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩƥǕƩƹƦǆǚƬƼƻƾǰǪǃƶǡǖƬǖǸǑǮǩƺǽǺȁǔǽǒȄǂǑǎǏ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[16] = NLoginCore_427.A("ǉƦƩƕƗǅƔǏǒǅǓǝƹƻǞǣƱǖƥǃǒƸǋǇƞǁǦǆǋǞǢƫƫƵƳǍƲưǦǕǱǜǰǇǼǱǔǫǼǔǵǯǐǡǸǉȊǃǷǥǈǬǦǼ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[17] = NLoginCore_004.A("ƣƨƣƒƎƯưǍƽǈƲƳƽǌƺǂǂǀƲƠǩǨƿǂǨǣǫǮǏǑǝƱǁƯǶǰǭǙƷƲǉǭǬǪǭǿǘǔƺǀǺǱǠǷǎǏ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[18] = NLoginCore_091.E("֘յոդզ֔գ֢֞֡֔֬ֈ֊ֲ֭ր֥մ֒֡֌ֱֹֹ֢֌֟ջ֜տ֐ׁ֚փֳֶֶָָֻ֚֭֙֙֋֎׃ֻ֟֫֐֩׎׆ט׊ֳֺֹ֩֘֨׏", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[19] = NLoginCore_387.E("֖կ֒՞փ֠էոպե֎֤֝֟կձֈ֦֤֞֡ց֭֍֐ֵ֚֭֐ְֶָ֔պ֑֖֞օ֟׈׉֌֖֦֋ּ֭֎ׄגׇח֬׆֝֞", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[20] = NLoginCore_223.E("փ֑յչնւ֖֙պլ֭ժ֘ֆ֣֚ջև֯֎ճ֡ց֢֖֊ִ֍֏ր֑֫յׂ֟ովׇׁ֛֤֌ְָֺׂ֟֝֏֠ב֧֦׆֝֞", (byte)110, 69);
                    NLoginCore_251.var_java_lang_String_arr_b[21] = NLoginCore_384.A("ǇƠǃƏƴǑƘƩƫƖƿƱƪƽǋƺǄǁǁǚǁƸǋƫǇǁƷƽǨǐǟǋǇǧƾǈǥƳǇƵǳƴǑƿƸǵǷǣȀǻǂǆǟǷǎǏ", (byte)110, 65);
                    NLoginCore_251.var_java_lang_String_arr_b[22] = NLoginCore_091.C("՘զՊՎՋ՗իծՏՁփռԻփ՜զզ՚֋մՋՌ՘ժՏտբ֒ռսևիխ֐֓կՙ֛֚՛ծ֌՟֗֡նկցպէ֣ճ֟֟֍ք֊ծքֆ֒֟տն", (byte)110, 67);
                    NLoginCore_251.var_java_lang_String_arr_b[23] = NLoginCore_324.B("ǇƠǃƏƴǑƘƩƫƖƿǎǕǐƠƢƹǏǗǒǕƲǞƾǁǦǋǞǁǧǡǩƾǄǞǵǓǶǆǫƵǙǇǚƸǁƺȀƶȅǙǥǛǡǎǏ", (byte)110, 66);
                    NLoginCore_251.var_java_lang_String_arr_b[24] = NLoginCore_092.A("ƴǂƦƪƧƳǇǊƫƝǞƷǒǓƪǖǄǙƞƹǁǇǥƝƧǧǘǘǆǣǯǲǈǓǀƴǢƱǆǆǲƺǬǚǶǽƿǋǤƼǻǃǑǧǪǇȀǙȈǯǱǨȉǾ", (byte)110, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_251.var_java_lang_String_arr_b[0] = NLoginCore_223.E("մ՜՝ե֙֐֡շն֩֩ֈ֚֩֡֠թ֞֏ֈ֢րսվ", (byte)110, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_251.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ՠ֞֞չ֣֨֜դ֭֞֊֘֎֬սջսճִֶ֒֩սվ", (byte)110, 70);
                }
            }
        }
    }

    @Override
    public int int_a() {
        return this.ordinal();
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_251.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d) + this.name() + (String)NLoginCore_251.c("㺃", (int)var_int_e, (long)(var_long_f ^ var_long_g)) + this.var_com_nickuc_login_NLoginCore_474_b + (String)NLoginCore_251.c("㺆", (int)(var_int_h & var_int_i), (long)var_long_j);
    }

    public static NLoginCore_251 valueOf(String string) {
        return Enum.valueOf(NLoginCore_251.class, string);
    }

    @Generated
    private NLoginCore_251(NLoginCore_474 NLoginCore_474) {
        this.var_com_nickuc_login_NLoginCore_474_b = NLoginCore_474;
    }

    private NLoginCore_251(String ... stringArray) {
        this.var_com_nickuc_login_NLoginCore_474_b = NLoginCore_474.a(stringArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_251.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.E("՘պռ՜ր֭֟֗֙ը֦֪֤֜խֱֳִ֒֫֫ր", (byte)116, 69), NLoginCore_251.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ǊǗǖƙǙǕǐǙǤǓƠǞǢǛǞǤƦԾՂԢԛՅԲՄՂԹƻ", (byte)116, 66) + string + NLoginCore_559.D("Ջ", (byte)116, 68) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_251[] values() {
        return (NLoginCore_251[])var_com_nickuc_login_NLoginCore_251_arr_a.clone();
    }

    private static /* synthetic */ NLoginCore_251[] com_nickuc_login_NLoginCore_251_arr_a() {
        NLoginCore_251[] NLoginCore_251Array = new NLoginCore_251[var_int_k];
        NLoginCore_251Array[NLoginCore_251.l] = var_com_nickuc_login_NLoginCore_251_a;
        NLoginCore_251Array[NLoginCore_251.m] = var_com_nickuc_login_NLoginCore_251_b;
        NLoginCore_251Array[NLoginCore_251.n] = var_com_nickuc_login_NLoginCore_251_c;
        NLoginCore_251Array[NLoginCore_251.o] = var_com_nickuc_login_NLoginCore_251_d;
        NLoginCore_251Array[NLoginCore_251.p] = var_com_nickuc_login_NLoginCore_251_e;
        NLoginCore_251Array[NLoginCore_251.q] = var_com_nickuc_login_NLoginCore_251_f;
        NLoginCore_251Array[NLoginCore_251.r] = var_com_nickuc_login_NLoginCore_251_g;
        NLoginCore_251Array[NLoginCore_251.s] = var_com_nickuc_login_NLoginCore_251_h;
        NLoginCore_251Array[NLoginCore_251.t] = var_com_nickuc_login_NLoginCore_251_i;
        NLoginCore_251Array[NLoginCore_251.u] = var_com_nickuc_login_NLoginCore_251_j;
        NLoginCore_251Array[NLoginCore_251.v] = var_com_nickuc_login_NLoginCore_251_k;
        return NLoginCore_251Array;
    }

    @Override
    public NLoginCore_208 com_nickuc_login_NLoginCore_208_a() {
        throw new UnsupportedOperationException();
    }

    static {
        var_int_a = 0 >>> 255 | 0 << -255;
        var_int_b = Integer.reverse(-1);
        var_long_d = Long.reverse(-577031567895345217L);
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        var_long_f = Long.reverse(2881732945925195711L);
        var_long_g = Long.reverse(-3458764513820540928L);
        var_int_h = Integer.reverse(0x40000000);
        var_int_i = (-1 >>> 254 | -1 << -254) & 0xFFFFFFFF;
        var_long_j = Long.reverse(-577031567895345217L);
        var_int_k = 90112 >>> 205 | 90112 << ~205 + 1;
        l = Integer.reverse(0);
        m = (1 >>> 128 | 1 << ~128 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(0x40000000);
        o = Integer.reverse(-1073741824);
        p = (0x20000000 >>> 59 | 0x20000000 << ~59 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(-1610612736);
        r = 0x1800000 >>> 54 | 0x1800000 << -54;
        s = Integer.reverse(-536870912);
        t = 0x10000000 >>> 89 | 0x10000000 << -89;
        u = (2304 >>> 168 | 2304 << ~168 + 1) & 0xFFFFFFFF;
        v = Integer.reverse(0x50000000);
        w = Integer.reverse(-1744830464);
        x = 50 >>> 65 | 50 << -65;
        y = Integer.reverse(-1073741824);
        z = Long.reverse(2881732945925195711L);
        aa = Long.reverse(-3458764513820540928L);
        ab = 0 >>> 231 | 0 << ~231 + 1;
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = 0 >>> 242 | 0 << ~242 + 1;
        ae = Integer.reverse(0x20000000);
        af = Integer.reverse(-1);
        ag = Long.reverse(-577031567895345217L);
        ah = Integer.reverse(-1610612736);
        ai = Long.reverse(2881732945925195711L);
        aj = Long.reverse(-3458764513820540928L);
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = Integer.reverse(Integer.MIN_VALUE);
        am = Integer.reverse(0);
        an = Integer.reverse(0x60000000);
        ao = Long.reverse(-577031567895345217L);
        ap = Integer.reverse(-536870912);
        aq = Long.reverse(2881732945925195711L);
        ar = Long.reverse(-3458764513820540928L);
        as = (8 >>> 226 | 8 << ~226 + 1) & 0xFFFFFFFF;
        at = Integer.reverse(Integer.MIN_VALUE);
        au = Integer.reverse(0);
        av = 16 >>> 129 | 16 << -129;
        aw = Long.reverse(2881732945925195711L);
        ax = Long.reverse(-3458764513820540928L);
        ay = Integer.reverse(-1879048192);
        az = (-1 >>> 87 | -1 << ~87 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(-577031567895345217L);
        bb = Integer.reverse(-1073741824);
        bc = 0x2000000 >>> 153 | 0x2000000 << -153;
        bd = 0 >>> 201 | 0 << -201;
        be = Integer.reverse(0x50000000);
        bf = Long.reverse(-577031567895345217L);
        bg = Integer.reverse(-805306368);
        bh = Long.reverse(2881732945925195711L);
        bi = Long.reverse(-3458764513820540928L);
        bj = Integer.reverse(0x20000000);
        bk = Integer.reverse(Integer.MIN_VALUE);
        bl = 0 >>> 69 | 0 << -69;
        bm = (24 >>> 193 | 24 << ~193 + 1) & 0xFFFFFFFF;
        bn = -1 >>> 179 | -1 << -179;
        bo = Long.reverse(-577031567895345217L);
        bp = 0x680000 >>> 19 | 0x680000 << ~19 + 1;
        bq = Long.reverse(2881732945925195711L);
        br = Long.reverse(-3458764513820540928L);
        bs = (0x500000 >>> 20 | 0x500000 << -20) & 0xFFFFFFFF;
        bt = (0x40000000 >>> 222 | 0x40000000 << ~222 + 1) & 0xFFFFFFFF;
        bu = (0 >>> 244 | 0 << -244) & 0xFFFFFFFF;
        bv = (14336 >>> 42 | 14336 << ~42 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(-1);
        bx = Long.reverse(-577031567895345217L);
        by = Integer.reverse(-268435456);
        bz = Long.reverse(-577031567895345217L);
        ca = -2147483647 >>> 254 | -2147483647 << -254;
        cb = (32768 >>> 15 | 32768 << ~15 + 1) & 0xFFFFFFFF;
        cc = (0 >>> 200 | 0 << ~200 + 1) & 0xFFFFFFFF;
        cd = Integer.reverse(0x8000000);
        ce = Long.reverse(2881732945925195711L);
        cf = Long.reverse(-3458764513820540928L);
        cg = 0x110000 >>> 16 | 0x110000 << -16;
        ch = Integer.reverse(-1);
        ci = Long.reverse(-577031567895345217L);
        cj = 0x700000 >>> 84 | 0x700000 << ~84 + 1;
        ck = 32 >>> 133 | 32 << ~133 + 1;
        cl = Integer.reverse(0);
        cm = Integer.reverse(0x48000000);
        cn = Long.reverse(-577031567895345217L);
        co = Integer.reverse(-939524096);
        cp = Long.reverse(2881732945925195711L);
        cq = Long.reverse(-3458764513820540928L);
        cr = 512 >>> 166 | 512 << ~166 + 1;
        cs = Integer.reverse(Integer.MIN_VALUE);
        ct = Integer.reverse(0);
        cu = (-1610612736 >>> 251 | -1610612736 << ~251 + 1) & 0xFFFFFFFF;
        cv = Long.reverse(2881732945925195711L);
        cw = Long.reverse(-3458764513820540928L);
        cx = Integer.reverse(-1476395008);
        cy = Long.reverse(2881732945925195711L);
        cz = Long.reverse(-3458764513820540928L);
        da = Integer.reverse(-1879048192);
        db = 8 >>> 99 | 8 << -99;
        dc = Integer.reverse(0);
        dd = Integer.reverse(0x68000000);
        de = -1 >>> 208 | -1 << -208;
        df = Long.reverse(-577031567895345217L);
        dg = Integer.reverse(-402653184);
        dh = Long.reverse(2881732945925195711L);
        di = Long.reverse(-3458764513820540928L);
        dj = Integer.reverse(0x50000000);
        dk = Integer.reverse(Integer.MIN_VALUE);
        dl = (0 >>> 71 | 0 << ~71 + 1) & 0xFFFFFFFF;
        dm = 24 >>> 96 | 24 << ~96 + 1;
        dn = Long.reverse(-577031567895345217L);
        var_java_lang_String_arr_a = new String[w];
        var_java_lang_String_arr_b = new String[x];
        NLoginCore_251.b();
        String[] stringArray = new String[ac];
        stringArray[NLoginCore_251.ad] = NLoginCore_251.c("㺃", (int)(ae & af), (long)ag);
        var_com_nickuc_login_NLoginCore_251_a = new NLoginCore_251(stringArray);
        String[] stringArray2 = new String[al];
        stringArray2[NLoginCore_251.am] = NLoginCore_251.c("㺉", (int)an, (long)ao);
        var_com_nickuc_login_NLoginCore_251_b = new NLoginCore_251(stringArray2);
        String[] stringArray3 = new String[at];
        stringArray3[NLoginCore_251.au] = NLoginCore_251.c("㺏", (int)av, (long)(aw ^ ax));
        var_com_nickuc_login_NLoginCore_251_c = new NLoginCore_251(stringArray3);
        String[] stringArray4 = new String[bc];
        stringArray4[NLoginCore_251.bd] = NLoginCore_251.c("㺕", (int)be, (long)bf);
        var_com_nickuc_login_NLoginCore_251_d = new NLoginCore_251(stringArray4);
        String[] stringArray5 = new String[bk];
        stringArray5[NLoginCore_251.bl] = NLoginCore_251.c("㺛", (int)(bm & bn), (long)bo);
        var_com_nickuc_login_NLoginCore_251_e = new NLoginCore_251(stringArray5);
        String[] stringArray6 = new String[bt];
        stringArray6[NLoginCore_251.bu] = NLoginCore_251.c("㺡", (int)(bv & bw), (long)bx);
        var_com_nickuc_login_NLoginCore_251_f = new NLoginCore_251(stringArray6);
        String[] stringArray7 = new String[cb];
        stringArray7[NLoginCore_251.cc] = NLoginCore_251.c("㺧", (int)cd, (long)(ce ^ cf));
        var_com_nickuc_login_NLoginCore_251_g = new NLoginCore_251(stringArray7);
        String[] stringArray8 = new String[ck];
        stringArray8[NLoginCore_251.cl] = NLoginCore_251.c("㺭", (int)cm, (long)cn);
        var_com_nickuc_login_NLoginCore_251_h = new NLoginCore_251(stringArray8);
        String[] stringArray9 = new String[cs];
        stringArray9[NLoginCore_251.ct] = NLoginCore_251.c("㺳", (int)cu, (long)(cv ^ cw));
        var_com_nickuc_login_NLoginCore_251_i = new NLoginCore_251(stringArray9);
        String[] stringArray10 = new String[db];
        stringArray10[NLoginCore_251.dc] = NLoginCore_251.c("㺹", (int)(dd & de), (long)df);
        var_com_nickuc_login_NLoginCore_251_j = new NLoginCore_251(stringArray10);
        String[] stringArray11 = new String[dk];
        stringArray11[NLoginCore_251.dl] = NLoginCore_251.c("㺿", (int)dm, (long)dn);
        var_com_nickuc_login_NLoginCore_251_k = new NLoginCore_251(stringArray11);
        var_com_nickuc_login_NLoginCore_251_arr_a = NLoginCore_251.com_nickuc_login_NLoginCore_251_arr_a();
    }

    @Override
    public NLoginCore_474 com_nickuc_login_NLoginCore_474_a() {
        return this.var_com_nickuc_login_NLoginCore_474_b;
    }

    static /* synthetic */ NLoginCore_474 a(NLoginCore_251 NLoginCore_2512) {
        return NLoginCore_2512.var_com_nickuc_login_NLoginCore_474_b;
    }

    @Override
    public Object java_lang_Object_a() {
        throw new UnsupportedOperationException();
    }
}

