/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_365;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_300;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_561 {
    private static int cp;
    private static int by;
    private static long p;
    private static int cf;
    private static long at;
    private static int k;
    private static long cr;
    private static int cs;
    private static long av;
    private static long as;
    private static int ak;
    private static int j;
    private static long z;
    private static int ab;
    private static int ct;
    private static int var_int_a;
    private static int s;
    private static long d;
    private static int i;
    private static long cx;
    private static int cu;
    private static long bl;
    private static int cm;
    private static long cj;
    private static int bh;
    private static long bw;
    private static long cn;
    private static int ah;
    private static int af;
    private static int cz;
    private static long ay;
    private static int br;
    private static long ai;
    private static int n;
    private static long ck;
    private static int bt;
    private static long ca;
    private static int t;
    private static int ad;
    private static int x;
    private static long cy;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int bo;
    private static int co;
    private static long h;
    private static int cd;
    private static long ch;
    private static int ac;
    private static int cv;
    private static long bk;
    private static int ba;
    private static int w;
    private static long g;
    private static long cq;
    private static int am;
    private static int be;
    private static long bd;
    private static int cc;
    private static String[] var_java_lang_String_arr_b;
    private static int bn;
    private static int cl;
    private static int ax;
    private static int aw;
    private static int bg;
    private static int ap;
    private static int bf;
    private static int u;
    private static long bi;
    private static long bc;
    private static int bj;
    private static int ao;
    private static long var_long_b;
    private static long cg;
    private static int l;
    private static int bs;
    private static int an;
    private static int bu;
    private static int bq;
    private static int ag;
    private static long aj;
    private static int bb;
    private static int bp;
    private static int ci;
    private static long ae;
    private static int al;
    private static long ce;
    private static long bv;
    private static int bm;
    private static int au;
    private static long az;
    private static int bx;
    private static int o;
    private static long bz;
    private static int cw;
    private static int da;
    private static int aq;
    private static long v;
    private static int m;
    private static long q;
    private static long c;
    private static int aa;
    private static int cb;
    private static int r;
    private static int y;
    private static int ar;
    private static int f;

    private static void b() {
        int n;
        c = 1974572159233756001L;
        long l = c ^ 0xC452EEC65A5222BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(43 + 26), (byte)(12 + 71), (byte)(4 + 43), (byte)(60 + 7), (byte)(28 + 38), (byte)(57 + 10), (byte)(18 + 29), (byte)(55 + 25), (byte)(22 + 53), (byte)(59 + 8), (byte)(70 + 13), (byte)(42 + 11), (byte)(36 + 44), (byte)(49 + 48), (byte)(79 + 21), (byte)(64 + 36), (byte)(40 + 65), (byte)(105 + 5), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_561.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ՂԷՀՠՂ՝ԯճլխԱՉՐՇԸը՝ԳժէՓՓԸԵԿճհջֈեքՖքւ՝զ՝րձ։՟Օծ՛", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[1] = NLoginCore_201.D("ԥԬԮդՠՅՇըՈզնՓՄՌԬթԶի՞Ո՗ՙՆՇ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[2] = NLoginCore_559.F("յ֜ժ֓֍՚ճ֞ցջրշո֬֩պ֋֥է֡եռչպ", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[3] = NLoginCore_201.C("է՞ԭԭԦ՚իղծՖԱՅծՋՅ՜թ՘Փ՗յչժղՍ՘ճՔըջյ՛՝փիըՏՍգա֎եՑ՛", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[4] = NLoginCore_575.F("֓Ւխ֣֗֒ծբ֒֨֊֞ց֌դէց֑֭ըթզիִճձֱֵָֻ֥֕շִֻ֕ս֠֍ֽօ֖֥֎", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[5] = NLoginCore_173.E("։֋ՠ֜ղն֙կ֜մթ֛ւի֧ռ֮֏վ֣֫֫ֈմ։֬֏֏ְֹ֣֨", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[6] = NLoginCore_004.C("ՃԶՠՍկՠՏհհՎՕԳՕՎձՑդժԹղԺԹԸխշւօզա։ՀըքջՙսՎՋջ֏՝ճօևթշժ֔ժիհտռչզէ", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[7] = NLoginCore_223.E("՗֊֊֛֡֘դ֥֛֡֨֙ն՞֢֚սջհֈ֍։֍ծְֳճւֻջ֔֋ֲ־ֵֶֻ֑֢֕֡֞ջֺׁ֣֦֚֜֋ְ֐֐׎֎׌ִב֡֨֬׊ׅן׌וְל֢חׂ֮֮ףִׂל׬׍ֶ֡׮ֿס׈ײֹֺ", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[8] = NLoginCore_427.D("Լ՚ՇՆԩգՁբՀԳՀՖլՑնէՎյնՌԺչիՋՄՔՅշՖՁՙզվՊ֏ջխՑծխՍ֖զէ֖֒պ֊֊ղՖ֞՗֢֓ՙծբ՜տց֙բըչ֦֌շֱտռթ֍֎յջ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[9] = NLoginCore_027.A("ƆƮƞƾǌƫǎƯƐƱǔƛ", (byte)106, 65);
                    NLoginCore_561.var_java_lang_String_arr_b[10] = NLoginCore_223.E("։֋ՠ֜ղն֙կ֜մ՟ն֦֓֞֙րֈռքֱ։կֲ֥շ։մ֥֪նֻ֏չսցֺփվ׆֨ք֑֎", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[11] = NLoginCore_201.D("ՂթԷՠ՚ԧՀիՎՈՍՄՅչնՇ՘ղԴծԲՉՆՇ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[12] = NLoginCore_223.F("֋՗հ֔՜֕֓֏փււթոը֟ՠա֥֜֌և֮֟֟֌֌ի֦֥չֹ֔ձַׇֺֻׂ֛֫֗֡֡ք֨׃ֈֽևְֲֳֽׁׂׅ֡֓֔׉֦֚֒֐", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[13] = NLoginCore_138.F("յ֜ժ֓֍՚ճ֞ցջրշո֬֩պ֋֥է֡եռչպ", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[14] = NLoginCore_201.F("։֋ՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ֋սվְֵׂ֖֕֞ս֛֩֎", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[15] = NLoginCore_004.F("֘֗֏լձ֌՝֧ֈւ֖֔տ֘՟֡կ֝ցօ֖֯֔կ֖ճւոո֗ճմֱֳ֔֌ֽ֍֎׆֖־ָ֧֧֣֚֙֜։׆א֍֏ֵַ֥֔֨׆ָ֪א֫לֱֿף֫חׁיהסׅ֮", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[16] = NLoginCore_559.B("ƃƬƬƏǇƼǉƝƟƨƶƛ", (byte)106, 66);
                    NLoginCore_561.var_java_lang_String_arr_b[17] = NLoginCore_076.C("ՉժծԫձԾԱԬԯՂՓձՍԹՐԶԻզՌԾԼչծհդւրՓզ֊ՊցՈՃ֍՘ՉչծՌհկժՒբոֈ՚Օ֏ձպճ֖֡֐դաա֘֕֔օ֩֗տցց֐ս֠֌֤֟֨ջ", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ƃƬƬƏǇƼǉƝƟƨƶƛ", (byte)106, 66);
                    NLoginCore_561.var_java_lang_String_arr_b[19] = NLoginCore_559.F("։֋ՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ֋ֿ֌տָ֥֚շտցׇֈ֎", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[20] = NLoginCore_427.F("ՙցձ֑֟վ֡ւգք֧ծ", (byte)106, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_561.var_java_lang_String_arr_b[0] = NLoginCore_027.E("յժճ֓յ֐բ֦֟֠դռփպի֛֐զ֚֝ֆֆիըղַֻ֦֣֮֘։ֱֲ֪֖֭֝փֻׂ֥֙֎", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[1] = NLoginCore_076.D("ԥԬԮդՠՅՇըՈզյԳոլՈՏկՈՕԷ՝ՙՆՇ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[2] = NLoginCore_427.D("ՂթԷՠ՚ԧՀիՎՈՍոԸ՚Էծժ՘ՇհծկՆՇ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[3] = NLoginCore_559.D("է՞ԭԭԦ՚իղծՖԱՅծՋՅ՜թ՘Փ՗յչժղՍ՘ճՔըջյ՛իՕքչհ՝խբկ֖ղ՛", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ՠԟԺդ՟հԻԯ՟յ՗իՎՙԱԴՎպ՞ԵԶԳԸցՀԾօբվֈղւժյաֆՍ՟ֆ֔գհր՛", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[5] = NLoginCore_004.F("։֋ՠ֜ղն֙կ֜մթ֛ւի֧ռ֮֏վ֣֮֫օ֬ճմ֚օְּ֏ֈ֗֊ոտ֫քֽ֮֞׆׃֎", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[6] = NLoginCore_575.B("ƣƖǀƭǏǀƯǐǐƮƵƓƵƮǑƱǄǊƙǒƚƙƘǍǗǢǥǆǁǩƠǈǤǛƹǝƮƫǛǯƽǓǥǧǇǖǥǬǕǥƵǉȀǒǹȂǰǸȄǗǓȆǤǈ", (byte)106, 66);
                    NLoginCore_561.var_java_lang_String_arr_b[7] = NLoginCore_091.A("ƄƷƷǈǎǅƑǎǒǕǈǆƣƋǏǇƪƨƝƵƺƶƺƛǠǝƠƯǨƨǁƸǟǫǢǣǂǎǋƾǨǏƨǉǮǐǓǧǇƸǝƽƽǻƻǹǡǾǎǕǙǷǲȌǹȂǝȉǏȄǛǛǯȐǡǩǲǳǯȌǭǦǰȠǚȟǦǧ", (byte)106, 65);
                    NLoginCore_561.var_java_lang_String_arr_b[8] = NLoginCore_223.A("ƜƺƧƦƉǃơǂƠƓƠƶǌƱǖǇƮǕǖƬƚǙǋƫƤƴƥǗƶơƹǆǞƪǯǛǍƱǎǍƭǶǆǇǶǲǚǪǪǒƶǾƷǳȂƹǎǂƼǟǡǹǂǈǦǬȈǥǆǠǟǥǎǟǮǛ", (byte)106, 65);
                    NLoginCore_561.var_java_lang_String_arr_b[9] = NLoginCore_201.F("սֈհհ֜յ֥֏՟ըՠծ", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[10] = NLoginCore_091.D("Ֆ՘ԭթԿՃզԼթՁԬՃՠիզճՍՕՉՑվՖԼտղՄՖՁղշՃֈՌպ֏չՙզ֎դդևՍ֖թՓչշն֜՛վպթզէ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[11] = NLoginCore_201.C("ՂթԷՠ՚ԧՀիՎՈՊ՟ժեՕ՗յ՜԰կ՚ՉՆՇ", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[12] = NLoginCore_324.E("֋՗հ֔՜֕֓֏փււթոը֟ՠա֥֜֌և֮֟֟֌֌ի֦֥չֹ֔ձַׇֺֻׂ֛֫֗֡֡ք֨׃ֈֽևְֲֽׂאև׉׌ְׇ֖֖֚כ׉", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[13] = NLoginCore_091.C("ՂթԷՠ՚ԧՀիՎՈՌզթթՎՓմջԷտՕկՆՇ", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[14] = NLoginCore_004.D("Ֆ՘ԭթԿՃզԼթՁԶՅՂղթԵՈխձԿՕՌԽՔ՗յՕՆ՜Օք՘Շվ՚ո։վՍՠ՟Շվ֓Ֆւ֐֐֚իճմշչզէ", (byte)106, 68);
                    NLoginCore_561.var_java_lang_String_arr_b[15] = NLoginCore_559.E("֘֗֏լձ֌՝֧ֈւ֖֔տ֘՟֡կ֝ցօ֖֯֔կ֖ճւոո֗ճմֱֳ֔֌ֽ֍֎׆֖־ָ֧֧֣֚֙֜։׆א֍֏ֵַ֥֔֨׆ָ֪א֫כְ֙יֶהם־֝ק֟נַתת֥֩טמװגעֹֺ", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[16] = NLoginCore_451.C("ԧՆԥ՚՜ՃՎԱճ՞ՖԻ", (byte)106, 67);
                    NLoginCore_561.var_java_lang_String_arr_b[17] = NLoginCore_004.E("ռ֝֡՞֤ձդ՟բյֆ֤րլփթծ֙տձկֳֵ֣֬֡֗ֆֽ֙սִջն׀֋ռ֬֡տ֣֢֝օֻ֕֫֍ֈׂ֤֦֭ה׉׃֗֔֔׋׈ׇָלוֽ֝ם׃ֱ־טג֧֟ך֪׊ּ֫׎ױ֯׈ֹֺֻּ", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[18] = NLoginCore_559.F("ֈ֐՛վՙցվբն՟ՠծ", (byte)106, 70);
                    NLoginCore_561.var_java_lang_String_arr_b[19] = NLoginCore_091.E("։֋ՠ֜ղն֙կ֜մթոյ֥֜ըջ֤֠ղֈտհև֊֨ֈչ֏ֈַ֋֏֨֋ֻׁ֣֗֘׆ֶׇ׉ֵׇ֭օַևג֯֎ׂ֚֙", (byte)106, 69);
                    NLoginCore_561.var_java_lang_String_arr_b[20] = NLoginCore_324.A("ƃƆƸƙƞƫƯǆǓƿǐƛ", (byte)106, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_561.var_java_lang_String_arr_b[0] = NLoginCore_138.E("֗՜֒֌֌֑֠օ֗ւ֟ծ", (byte)106, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_561.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ՂիկՙթԣՁԼՁըՃաա՗եԲՐծՆՠՍՉՆՇ", (byte)106, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x51L;
        l ^= 0xC452EEC65A5222BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(35 + 34), (byte)(73 + 10), (byte)(20 + 27), (byte)(37 + 30), (byte)(22 + 44), (byte)(8 + 59), (byte)(41 + 6), (byte)(23 + 57), (byte)(49 + 26), (byte)(60 + 7), (byte)(75 + 8), 53, (byte)(65 + 15), (byte)(89 + 8), (byte)(59 + 41), (byte)(53 + 47), (byte)(33 + 72), (byte)(12 + 98), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.D("ӛӨӧҪӪӦӡӪӵӤұӯӳӬӯӵҷࡏࡁࡋࡃࡂࡑ࠵ࡊࡂ࠵ࡖࡅ࡜", (byte)65, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_561.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static NLoginCore_300 a(NLoginCore_459 NLoginCore_459) {
        NLoginCore_365 NLoginCore_3652 = NLoginCore_459.com_nickuc_login_NLoginCore_365_a();
        try {
            byte[] byArray;
            Object object2;
            Closeable closeable;
            AutoCloseable autoCloseable;
            Object object;
            Connection connection = NLoginCore_3652.b();
            KeyPair keyPair = null;
            try {
                Object[] objectArray = new Object[i];
                objectArray[NLoginCore_561.j] = NLoginCore_532.u.a(new Object[k]);
                objectArray[NLoginCore_561.l] = NLoginCore_532.r.a(new Object[m]);
                object = connection.prepareStatement(String.format((String)NLoginCore_561.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + NLoginCore_532.t.a(new Object[e]) + (String)NLoginCore_561.c("㺃", (int)f, (long)(g ^ h)), objectArray));
                try {
                    object.setString(n, (String)NLoginCore_561.c("㺆", (int)o, (long)(p ^ q)));
                    autoCloseable = object.executeQuery();
                    try {
                        if (autoCloseable.next() && ((FilterInputStream)(closeable = new DataInputStream(new ByteArrayInputStream(autoCloseable.getBytes(NLoginCore_532.u.a(new Object[r])))))).available() > 0) {
                            int n = Math.max(((DataInputStream)closeable).readInt(), s);
                            if (n > t) {
                                throw new IllegalArgumentException((String)NLoginCore_561.c("㺉", (int)u, (long)v) + n);
                            }
                            object2 = new byte[n];
                            ((DataInputStream)closeable).readFully((byte[])object2);
                            int n2 = Math.max(((DataInputStream)closeable).readInt(), w);
                            if (n2 > x) {
                                throw new IllegalArgumentException((String)NLoginCore_561.c("㺌", (int)y, (long)z) + n);
                            }
                            byArray = new byte[n2];
                            ((DataInputStream)closeable).readFully(byArray);
                            keyPair = NLoginCore_561.a(object2, byArray);
                        }
                    }
                    finally {
                        if (Collections.singletonList(autoCloseable).get(aa) != null) {
                            autoCloseable.close();
                        }
                    }
                }
                finally {
                    if (object != null) {
                        object.close();
                    }
                }
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_561.c("㺏", (int)(ac & ad), (long)ae), exception, new Object[af]);
                NLoginCore_300 NLoginCore_3002 = null;
                if (Collections.singletonList(NLoginCore_3652).get(ag) == null) return NLoginCore_3002;
                NLoginCore_3652.close();
                return NLoginCore_3002;
            }
            if (keyPair == null) {
                try {
                    Object[] objectArray = new Object[ak];
                    objectArray[NLoginCore_561.al] = NLoginCore_532.r.a(new Object[am]);
                    objectArray[NLoginCore_561.an] = NLoginCore_532.u.a(new Object[ao]);
                    objectArray[NLoginCore_561.ap] = NLoginCore_532.t.a(new Object[aq]);
                    object = connection.prepareStatement(String.format((String)NLoginCore_561.c("㺒", (int)ah, (long)(ai ^ aj)), objectArray));
                    autoCloseable = new ByteArrayOutputStream();
                    closeable = new DataOutputStream((OutputStream)autoCloseable);
                    NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
                    NLoginCore_370.e((String)(NLoginCore_150.j() ? NLoginCore_561.c("㺕", (int)ar, (long)(as ^ at)) : NLoginCore_561.c("㺘", (int)au, (long)av)), new Object[aw]);
                    try {
                        object2 = KeyPairGenerator.getInstance((String)NLoginCore_561.c("㺛", (int)ax, (long)(ay ^ az)));
                        object2.initialize(ba);
                        keyPair = object2.generateKeyPair();
                    }
                    catch (Exception exception) {
                        throw new RuntimeException((String)NLoginCore_561.c("㺞", (int)bb, (long)(bc ^ bd)), exception);
                    }
                    object2 = keyPair.getPublic().getEncoded();
                    ((DataOutputStream)closeable).writeInt(((byte[])object2).length);
                    ((FilterOutputStream)closeable).write((byte[])object2);
                    byte[] byArray2 = keyPair.getPrivate().getEncoded();
                    ((DataOutputStream)closeable).writeInt(byArray2.length);
                    ((FilterOutputStream)closeable).write(byArray2);
                    byArray = ((ByteArrayOutputStream)autoCloseable).toByteArray();
                    object.setBytes(be, byArray);
                    object.setString(bf, (String)NLoginCore_561.c("㺡", (int)(bg & bh), (long)bi));
                    int n = object.executeUpdate();
                    if (n == 0) {
                        try {
                            Object[] objectArray2 = new Object[bm];
                            objectArray2[NLoginCore_561.bn] = NLoginCore_532.r.a(new Object[bo]);
                            objectArray2[NLoginCore_561.bp] = NLoginCore_532.t.a(new Object[bq]);
                            objectArray2[NLoginCore_561.br] = NLoginCore_532.u.a(new Object[bs]);
                            try (PreparedStatement preparedStatement = connection.prepareStatement(String.format((String)NLoginCore_561.c("㺤", (int)bj, (long)(bk ^ bl)), objectArray2));){
                                preparedStatement.setString(bt, (String)NLoginCore_561.c("㺧", (int)bu, (long)(bv ^ bw)));
                                preparedStatement.setBytes(bx, byArray);
                                preparedStatement.execute();
                            }
                        }
                        catch (Exception exception) {
                            NLoginCore_370.c((String)NLoginCore_561.c("㺪", (int)by, (long)(bz ^ ca)), exception, new Object[cb]);
                            NLoginCore_300 NLoginCore_3003 = null;
                            if (object != null) {
                                object.close();
                            }
                            if (Collections.singletonList(NLoginCore_3652).get(cc) == null) return NLoginCore_3003;
                            NLoginCore_3652.close();
                            return NLoginCore_3003;
                        }
                    }
                    NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_561.c("㺭", (int)cd, (long)ce) + NLoginCore_2702.aq() + (String)NLoginCore_561.c("㺰", (int)cf, (long)(cg ^ ch)) : (String)NLoginCore_561.c("㺳", (int)ci, (long)(cj ^ ck)) + NLoginCore_2702.aq() + (String)NLoginCore_561.c("㺶", (int)(cl & cm), (long)cn), new Object[co]);
                }
                catch (Exception exception) {
                    NLoginCore_370.c((String)NLoginCore_561.c("㺹", (int)cp, (long)(cq ^ cr)), exception, new Object[cs]);
                    autoCloseable = null;
                    if (Collections.singletonList(NLoginCore_3652).get(ct) == null) return autoCloseable;
                    NLoginCore_3652.close();
                    return autoCloseable;
                }
            }
            object = new NLoginCore_300(keyPair, null);
            return object;
        }
        finally {
            if (Collections.singletonList(NLoginCore_3652).get(cv) != null) {
                NLoginCore_3652.close();
            }
        }
    }

    private static KeyPair a(byte[] byArray, byte[] byArray2) {
        KeyFactory keyFactory = KeyFactory.getInstance((String)NLoginCore_561.c("㺀", (int)cw, (long)(cx ^ cy)));
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(byArray2);
        PrivateKey privateKey = keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        return new KeyPair(publicKey, privateKey);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_561.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.F("ӭԏԑӱԕԴԬՂԮӽԻԱԿԹԂԧՉՈՀՆՀԕ", (byte)9, 70), NLoginCore_561.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.E("ԨԵԴӷԷԳԮԷՂԱӾԼՀԹԼՂԄ࢜ࢎ࢘࢐࢏࢞ࢂࢗ࢏ࢂࢣ࢒ࢩԝ", (byte)9, 69) + string + NLoginCore_091.C("Њ", (byte)9, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 190 | 0 << -190;
        var_long_b = Long.reverse(-8732337413803153704L);
        d = Long.reverse(-8502796096475496448L);
        e = (0 >>> 104 | 0 << -104) & 0xFFFFFFFF;
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-8732337413803153704L);
        h = Long.reverse(-8502796096475496448L);
        i = 524288 >>> 210 | 524288 << ~210 + 1;
        j = 0 >>> 56 | 0 << ~56 + 1;
        k = 0 >>> 226 | 0 << ~226 + 1;
        l = Integer.reverse(Integer.MIN_VALUE);
        m = (0 >>> 152 | 0 << -152) & 0xFFFFFFFF;
        n = 4 >>> 194 | 4 << ~194 + 1;
        o = Integer.reverse(0x40000000);
        p = Long.reverse(-8732337413803153704L);
        q = Long.reverse(-8502796096475496448L);
        r = Integer.reverse(0);
        s = (0 >>> 20 | 0 << -20) & 0xFFFFFFFF;
        t = Integer.reverse(512);
        u = 192 >>> 70 | 192 << -70;
        v = Long.reverse(923380187279189720L);
        w = (0 >>> 202 | 0 << ~202 + 1) & 0xFFFFFFFF;
        x = Integer.reverse(512);
        y = 0x800000 >>> 21 | 0x800000 << ~21 + 1;
        z = Long.reverse(923380187279189720L);
        aa = 0 >>> 202 | 0 << ~202 + 1;
        ab = 0 >>> 214 | 0 << ~214 + 1;
        ac = Integer.reverse(-1610612736);
        ad = (-1 >>> 217 | -1 << ~217 + 1) & 0xFFFFFFFF;
        ae = Long.reverse(923380187279189720L);
        af = Integer.reverse(0);
        ag = (0 >>> 207 | 0 << -207) & 0xFFFFFFFF;
        ah = Integer.reverse(0x60000000);
        ai = Long.reverse(-8732337413803153704L);
        aj = Long.reverse(-8502796096475496448L);
        ak = Integer.reverse(-1073741824);
        al = 0 >>> 74 | 0 << ~74 + 1;
        am = 0 >>> 248 | 0 << ~248 + 1;
        an = Integer.reverse(Integer.MIN_VALUE);
        ao = (0 >>> 214 | 0 << ~214 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(0x40000000);
        aq = 0 >>> 44 | 0 << ~44 + 1;
        ar = 917504 >>> 209 | 917504 << ~209 + 1;
        as = Long.reverse(-8732337413803153704L);
        at = Long.reverse(-8502796096475496448L);
        au = 16384 >>> 107 | 16384 << -107;
        av = Long.reverse(923380187279189720L);
        aw = Integer.reverse(0);
        ax = Integer.reverse(-1879048192);
        ay = Long.reverse(-8732337413803153704L);
        az = Long.reverse(-8502796096475496448L);
        ba = (128 >>> 155 | 128 << -155) & 0xFFFFFFFF;
        bb = Integer.reverse(0x50000000);
        bc = Long.reverse(-8732337413803153704L);
        bd = Long.reverse(-8502796096475496448L);
        be = (0x2000000 >>> 249 | 0x2000000 << -249) & 0xFFFFFFFF;
        bf = 0x20000000 >>> 28 | 0x20000000 << -28;
        bg = 0x2C00000 >>> 182 | 0x2C00000 << ~182 + 1;
        bh = Integer.reverse(-1);
        bi = Long.reverse(923380187279189720L);
        bj = 192 >>> 100 | 192 << -100;
        bk = Long.reverse(-8732337413803153704L);
        bl = Long.reverse(-8502796096475496448L);
        bm = Integer.reverse(-1073741824);
        bn = Integer.reverse(0);
        bo = 0 >>> 151 | 0 << ~151 + 1;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0);
        br = 0x4000000 >>> 25 | 0x4000000 << ~25 + 1;
        bs = 0 >>> 25 | 0 << -25;
        bt = 8 >>> 3 | 8 << ~3 + 1;
        bu = Integer.reverse(-1342177280);
        bv = Long.reverse(-8732337413803153704L);
        bw = Long.reverse(-8502796096475496448L);
        bx = Integer.reverse(0x40000000);
        by = 112 >>> 67 | 112 << -67;
        bz = Long.reverse(-8732337413803153704L);
        ca = Long.reverse(-8502796096475496448L);
        cb = (0 >>> 155 | 0 << ~155 + 1) & 0xFFFFFFFF;
        cc = 0 >>> 33 | 0 << -33;
        cd = (-1073741821 >>> 126 | -1073741821 << ~126 + 1) & 0xFFFFFFFF;
        ce = Long.reverse(923380187279189720L);
        cf = 4 >>> 190 | 4 << -190;
        cg = Long.reverse(-8732337413803153704L);
        ch = Long.reverse(-8502796096475496448L);
        ci = 34 >>> 129 | 34 << ~129 + 1;
        cj = Long.reverse(-8732337413803153704L);
        ck = Long.reverse(-8502796096475496448L);
        cl = Integer.reverse(0x48000000);
        cm = Integer.reverse(-1);
        cn = Long.reverse(923380187279189720L);
        co = Integer.reverse(0);
        cp = (0x1300000 >>> 244 | 0x1300000 << ~244 + 1) & 0xFFFFFFFF;
        cq = Long.reverse(-8732337413803153704L);
        cr = Long.reverse(-8502796096475496448L);
        cs = (0 >>> 173 | 0 << ~173 + 1) & 0xFFFFFFFF;
        ct = (0 >>> 217 | 0 << -217) & 0xFFFFFFFF;
        cu = Integer.reverse(0);
        cv = Integer.reverse(0);
        cw = Integer.reverse(0x28000000);
        cx = Long.reverse(-8732337413803153704L);
        cy = Long.reverse(-8502796096475496448L);
        cz = Integer.reverse(-1476395008);
        da = (21504 >>> 10 | 21504 << -10) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[cz];
        var_java_lang_String_arr_b = new String[da];
        NLoginCore_561.b();
    }
}

