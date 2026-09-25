/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_583;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_346;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_144;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_487;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_372;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_057;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
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

public class NLoginCore_308
implements NLoginCore_487 {
    private static int ax;
    private static int al;
    private static int x;
    private static long q;
    private static int n;
    private static int p;
    private static int ad;
    private static long i;
    private static int h;
    private static int ai;
    private static int k;
    private static int v;
    private static int ak;
    private static int aq;
    private static String[] var_java_lang_String_arr_b;
    private NLoginCore_057 var_com_nickuc_login_NLoginCore_057_a;
    private static int at;
    private static int ag;
    private static long aw;
    @Nullable
    private NLoginCore_219 var_com_nickuc_login_NLoginCore_219_d;
    private static int av;
    private static int var_int_b;
    private static int j;
    private NLoginCore_144 var_com_nickuc_login_NLoginCore_144_a;
    private static int ae;
    private static long w;
    private static int ab;
    private static long ap;
    private static int au;
    private static int aj;
    private static long r;
    private static int ar;
    private static long f;
    private static int ac;
    private static long var_long_d;
    private static int t;
    private static int az;
    private static int aa;
    private static String[] var_java_lang_String_arr_a;
    private static long z;
    private static int var_int_a;
    private static int af;
    private static int y;
    private static long var_long_c;
    private static int s;
    private static long am;
    private static long as;
    private static int m;
    private static int g;
    private static int an;
    private static long ao;
    private static int ay;
    @Nullable
    private NLoginCore_219 var_com_nickuc_login_NLoginCore_219_c;
    private static int e;
    private static int ah;
    private static long o;
    private static long l;
    private static int u;

    private static String a(int n, long l) {
        l ^= 0x66L;
        l ^= 0x5B977870A77E4AC3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(6 + 63), (byte)(18 + 65), (byte)(9 + 38), (byte)(36 + 31), (byte)(2 + 64), (byte)(34 + 33), 47, (byte)(18 + 62), (byte)(74 + 1), (byte)(64 + 3), (byte)(54 + 29), (byte)(7 + 46), (byte)(11 + 69), (byte)(8 + 89), (byte)(76 + 24), (byte)(18 + 82), 105, (byte)(64 + 46), (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸࠌߦࠕࠄࠖࠆࠆࠕ", (byte)44, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_308.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(-1879048192);
        var_int_b = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        var_long_d = Long.reverse(-4440007869422698638L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-4440007869422698638L);
        g = (262144 >>> 113 | 262144 << ~113 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(-1);
        i = Long.reverse(-4440007869422698638L);
        j = (-2147483647 >>> 223 | -2147483647 << ~223 + 1) & 0xFFFFFFFF;
        k = (-1 >>> 189 | -1 << -189) & 0xFFFFFFFF;
        l = Long.reverse(-4440007869422698638L);
        m = Integer.reverse(0x20000000);
        n = Integer.reverse(-1);
        o = Long.reverse(-4440007869422698638L);
        p = 80 >>> 132 | 80 << ~132 + 1;
        q = Long.reverse(-6601735690560536718L);
        r = Long.reverse(0x6600000000000000L);
        s = Integer.reverse(Integer.MIN_VALUE);
        t = 0 >>> 54 | 0 << ~54 + 1;
        u = Integer.reverse(0x60000000);
        v = Integer.reverse(-1);
        w = Long.reverse(-4440007869422698638L);
        x = Integer.reverse(-536870912);
        y = (-1 >>> 192 | -1 << -192) & 0xFFFFFFFF;
        z = Long.reverse(-4440007869422698638L);
        aa = Integer.reverse(0);
        ab = 176 >>> 132 | 176 << -132;
        ac = Integer.reverse(-1073741824);
        ad = 0 >>> 173 | 0 << ~173 + 1;
        ae = (65536 >>> 112 | 65536 << ~112 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(0x40000000);
        ag = Integer.reverse(-1073741824);
        ah = Integer.reverse(0);
        ai = (16 >>> 36 | 16 << ~36 + 1) & 0xFFFFFFFF;
        aj = (2048 >>> 74 | 2048 << -74) & 0xFFFFFFFF;
        ak = (8 >>> 0 | 8 << -0) & 0xFFFFFFFF;
        al = -1 >>> 164 | -1 << -164;
        am = Long.reverse(-4440007869422698638L);
        an = Integer.reverse(-1879048192);
        ao = Long.reverse(-6601735690560536718L);
        ap = Long.reverse(0x6600000000000000L);
        aq = Integer.reverse(0);
        ar = (10240 >>> 42 | 10240 << ~42 + 1) & 0xFFFFFFFF;
        as = Long.reverse(-4440007869422698638L);
        at = (0 >>> 90 | 0 << ~90 + 1) & 0xFFFFFFFF;
        au = 1408 >>> 71 | 1408 << ~71 + 1;
        av = (-1 >>> 155 | -1 << -155) & 0xFFFFFFFF;
        aw = Long.reverse(-4440007869422698638L);
        ax = 0 >>> 239 | 0 << ~239 + 1;
        ay = 0xC000000 >>> 152 | 0xC000000 << ~152 + 1;
        az = 196608 >>> 174 | 196608 << -174;
        var_java_lang_String_arr_a = new String[ay];
        var_java_lang_String_arr_b = new String[az];
        NLoginCore_308.void_b();
    }

    @Nullable
    @Generated
    public NLoginCore_219 c() {
        return this.var_com_nickuc_login_NLoginCore_219_d;
    }

    @Generated
    public NLoginCore_057 com_nickuc_login_NLoginCore_057_a() {
        return this.var_com_nickuc_login_NLoginCore_057_a;
    }

    private static void void_b() {
        int n;
        var_long_c = 5692401459396052517L;
        long l = var_long_c ^ 0x5B977870A77E4AC3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(31 + 52), (byte)(15 + 32), (byte)(37 + 30), (byte)(5 + 61), (byte)(48 + 19), (byte)(33 + 14), (byte)(62 + 18), (byte)(36 + 39), (byte)(44 + 23), 83, (byte)(31 + 22), (byte)(5 + 75), (byte)(31 + 66), (byte)(42 + 58), (byte)(75 + 25), (byte)(9 + 96), (byte)(21 + 89), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(34 + 49)}, StandardCharsets.UTF_8));
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
                    NLoginCore_308.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƄƒƫƩƎƒƕƪƲǀƲƉ", (byte)97, 65);
                    NLoginCore_308.var_java_lang_String_arr_b[1] = NLoginCore_387.C("ՄՎ԰ԯԵԕԨ՘ՖՑՙԠ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[2] = NLoginCore_091.C("ԯԪՅՉԔԥԭՊԖԮՕԎԩՊՕԲԗԛՐՍՔդԫԬ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[3] = NLoginCore_223.D("ԏՓՊՕԶԮՊՏԦԵՎԭՒՎԖԜ՘ՐՑՀ՘ԦԾԨԺ՟իԻԤ՝՗ԾիՍեճՇԴոՉՅշԺԺխ՚ՖհժՏգ՘ք՞ՋՌ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ԉՎՂԲՏՂԨՕԢՇՑՓԏԚԖԞԝԾՖԤԲԾԫԬ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[5] = NLoginCore_223.D("ԏՓՊՕԶԮՊՏԦԵՎՕՒԶԿԗԼՔԫԮԶԻԥԳՔԿԥԞ՞լԾՍԪԲՐՄՑԮեծՎ԰եՀ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[6] = NLoginCore_387.A("ŸƫƸƜŽƺƓƒƭŵƕƟƸǆưƇƢƚƭǅǊƽƺǑƈƤƋǈƔǔƹǄƨƪƪƶƕƘƬǎǀǛƳǣǚƳƵƶƵǖƼƶǀǈƺǲǢƩǏǮǪƴǗǡǶǐǖǅǵǹǕǔǴǞǾǉ", (byte)97, 65);
                    NLoginCore_308.var_java_lang_String_arr_b[7] = NLoginCore_559.B("ŸƫƸƜŽƺƓƒƭŵƕŻŸƒƳƵƠƃƫƮƜƜǏƫơǄƐǖƥƱǕǍǛƱǕǘƙǊǜǔƷǐƯǎǥǢưǡǅǞǚǉǄǗǟǦǇƫǬǮǣǈǱǂ", (byte)97, 66);
                    NLoginCore_308.var_java_lang_String_arr_b[8] = NLoginCore_091.F("֋֓մղ֓֐իլՖխ֗֞֏ՠլ՜֗֕քտգէ֤սշվ֦ի֝֐ֱ֌վֆղֱօջղ֪֖֭֚֞֝ռտ֢֪֚֯֠׉ֺ֥֚֙֎ֺ֢֩֌גִ֥֯֬טַ֩ב֩ה׌׀֥", (byte)97, 70);
                    NLoginCore_308.var_java_lang_String_arr_b[9] = NLoginCore_004.C("ՆՎԯԭՎՋԦԧԑԨՒՓԪ՟ԕԲՀադաՀՠ՞ԡեՙԥԶԺԭԼաԾՏՂլկԳԩԮգԺՉՒ՛ռ՝՝ԷբճդՅմՋՌ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[10] = NLoginCore_384.D("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԢԾՄՁԼԳԻԬիաԾ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[11] = NLoginCore_223.F("ֆշչֆՌք֑պ՗֌֖չ֋֚դ֥ձ֏՟՟շ֬ե֦ռխֈ֚֮թ֭֓", (byte)97, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_308.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ƢƆƝƻƔƠƌƢƗƀưƏǃƓƆơƙƁƘƄƿƗƔƕ", (byte)97, 66);
                    NLoginCore_308.var_java_lang_String_arr_b[1] = NLoginCore_559.D("ՀՍԛԦԮՃ՗ԢՙԕՕԠ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ƘƓƮƲŽƎƖƳſƗƾƗƧƳƄƵƳơƼƚƍǍƔƕ", (byte)97, 66);
                    NLoginCore_308.var_java_lang_String_arr_b[3] = NLoginCore_091.B("ŸƼƳƾƟƗƳƸƏƞƷƖƻƷſƅǁƹƺƩǁƏƧƑƣǈǔƤƍǆǀƧǔƶǎǜưƝǡƲƮǠƚƲƜǨǃǩǞǕǉǉǤǭƴƵ", (byte)97, 66);
                    NLoginCore_308.var_java_lang_String_arr_b[4] = NLoginCore_384.D("ԉՎՂԲՏՂԨՕԢՇՔԺԛՌՓՌՑԞԳԞՁդԫԬ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[5] = NLoginCore_004.D("ԏՓՊՕԶԮՊՏԦԵՎՕՒԶԿԗԼՔԫԮԶԻԥԳՔԿԥԞ՞լԾՍՅԾԲգ՟ԯՖդզՌիյՖճ՜տՐնգծԽ՞ՋՌ", (byte)97, 68);
                    NLoginCore_308.var_java_lang_String_arr_b[6] = NLoginCore_091.C("ԏՂՏԳԔՑԪԩՄԌԬԶՏ՝ՇԞԹԱՄ՜աՔՑըԟԻԢ՟ԫիՐ՛ԿՁՁՍԬԯՃե՗ղՊպձՊՌՍՌխՓՍ՗՟Ց։չՀզօցՋծոել֓ս։վ֗րհմ֘հ՚ը֐՛ժ֜հ՚֍ծիլ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[7] = NLoginCore_027.E("Քև֔ոՙ֖կծ։Ցձ՗Քծ֏֑ռ՟և֊ոո֫ևս֠լֲց֍ֱַ֩֍ֱִյְָ֦֓֬֋ׁ֪־֌ֶֺֽ֥֡֠֨ք׉ׂ֬׋ֹ׍ְ׃֪", (byte)97, 69);
                    NLoginCore_308.var_java_lang_String_arr_b[8] = NLoginCore_138.E("֋֓մղ֓֐իլՖխ֗֞֏ՠլ՜֗֕քտգէ֤սշվ֦ի֝֐ֱ֌վֆղֱօջղ֪֖֭֚֞֝ռտ֢֪֚֯֠׉ֺ֥֚֙֎ֺ֢֩֌גִ֧֔֗֏הִ֚֨׍דמ֥", (byte)97, 69);
                    NLoginCore_308.var_java_lang_String_arr_b[9] = NLoginCore_092.C("ՆՎԯԭՎՋԦԧԑԨՒՓԪ՟ԕԲՀադաՀՠ՞ԡեՙԥԶԺԭԼաԾՏՂլկԳԩԮգԺՇՋ՚՗իձմտդՂՃձջԿ՟էՓ՛՜գ֍ւ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[10] = NLoginCore_110.C("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԦՓՃ՝Ԡ՞ԿԦՎժ՘ծՠԩըճԿՁ՘Ֆ՗ՇՀ", (byte)97, 67);
                    NLoginCore_308.var_java_lang_String_arr_b[11] = NLoginCore_091.D("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԞԺ՛դԶՈԶի՘ՍՃՂԿՅԬՇՔԯզմ԰խՀ", (byte)97, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_308.var_java_lang_String_arr_b[0] = NLoginCore_091.E("կբեՐ֕պ֍֗։՜֔֞ծ֚մ֣ն֪֟֡ւփհձ", (byte)97, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_308.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ƦƵƽźƎƮƍƬƵƌŽǄƦƥƄƆǂƖƘƃǇǍƔƕ", (byte)97, 65);
                }
            }
        }
    }

    public void g(NLoginType_008 NLoginType_008) {
        try {
            if (this.var_com_nickuc_login_NLoginCore_057_a != null) {
                this.var_com_nickuc_login_NLoginCore_057_a.aE();
                this.var_com_nickuc_login_NLoginCore_057_a = null;
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_308.c("㺀", (int)ar, (long)as), exception, new Object[at]);
        }
        try {
            if (this.var_com_nickuc_login_NLoginCore_144_a != null) {
                this.var_com_nickuc_login_NLoginCore_144_a.aE();
                this.var_com_nickuc_login_NLoginCore_144_a = null;
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_308.c("㺃", (int)(au & av), (long)aw), exception, new Object[ax]);
        }
        this.var_com_nickuc_login_NLoginCore_219_c = null;
        this.var_com_nickuc_login_NLoginCore_219_d = null;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        block10: {
            this.g(NLoginType_008);
            if (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() != var_int_a) {
                return;
            }
            File file = new File(NLoginType_008.java_io_File_c() + File.separator + (String)NLoginCore_308.c("㺀", (int)var_int_b, (long)var_long_d), (String)NLoginCore_308.c("㺃", (int)e, (long)f));
            this.var_com_nickuc_login_NLoginCore_219_c = new NLoginCore_219((String)NLoginCore_308.c("㺆", (int)(g & h), (long)i), file);
            NLoginCore_195.a(NLoginType_008, this.var_com_nickuc_login_NLoginCore_219_c, (String)NLoginCore_308.c("㺉", (int)(j & k), (long)l), bl);
            this.var_com_nickuc_login_NLoginCore_219_d = new NLoginCore_219((String)NLoginCore_308.c("㺌", (int)(m & n), (long)o), file);
            NLoginCore_195.a(NLoginType_008, this.var_com_nickuc_login_NLoginCore_219_d, (String)NLoginCore_308.c("㺏", (int)p, (long)(q ^ r)), bl);
            NLoginCore_596.o(NLoginType_008);
            NLoginCore_583 NLoginCore_583 = NLoginType_008.com_nickuc_login_NLoginCore_583_a();
            boolean bl2 = NLoginCore_150.j();
            try {
                if (NLoginCore_596.var_com_nickuc_login_NLoginCore_363_a.ar()) {
                    NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[s];
                    NLoginInterface_034Array[NLoginCore_308.t] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_k;
                    if (NLoginCore_583.boolean_a(NLoginInterface_034Array)) {
                        this.var_com_nickuc_login_NLoginCore_057_a = new NLoginCore_057(NLoginType_008, this);
                        this.var_com_nickuc_login_NLoginCore_057_a.aH();
                    }
                }
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)(bl2 ? NLoginCore_308.c("㺒", (int)(u & v), (long)w) : NLoginCore_308.c("㺕", (int)(x & y), (long)z)), throwable, new Object[aa]);
            }
            try {
                if (!NLoginCore_596.var_com_nickuc_login_NLoginCore_363_k.ar()) break block10;
                if (NLoginCore_372.u() >= ab) {
                    NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[ac];
                    NLoginInterface_034Array[NLoginCore_308.ad] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_e;
                    NLoginInterface_034Array[NLoginCore_308.ae] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_f;
                    NLoginInterface_034Array[NLoginCore_308.af] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_g;
                    if (!NLoginCore_583.boolean_a(NLoginInterface_034Array)) break block10;
                }
                NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[ag];
                NLoginInterface_034Array[NLoginCore_308.ah] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_h;
                NLoginInterface_034Array[NLoginCore_308.ai] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_j;
                NLoginInterface_034Array[NLoginCore_308.aj] = NLoginCore_346.var_com_nickuc_login_NLoginCore_379_i;
                if (NLoginCore_583.boolean_a(NLoginInterface_034Array)) {
                    this.var_com_nickuc_login_NLoginCore_144_a = new NLoginCore_144(NLoginType_008, this);
                    this.var_com_nickuc_login_NLoginCore_144_a.aH();
                }
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)(bl2 ? NLoginCore_308.c("㺘", (int)(ak & al), (long)am) : NLoginCore_308.c("㺛", (int)an, (long)(ao ^ ap))), throwable, new Object[aq]);
            }
        }
    }

    @Nullable
    @Generated
    public NLoginCore_219 com_nickuc_login_NLoginCore_219_b() {
        return this.var_com_nickuc_login_NLoginCore_219_c;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_308.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.E("ԿագՃէֆվ֔րՏ֍փ֑֋Քչ֛֚֒֘֒է", (byte)91, 69), NLoginCore_308.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴԈӢԑԀԒԂԂԑƈ", (byte)91, 66) + string + NLoginCore_138.D("Ԁ", (byte)91, 68) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_144 com_nickuc_login_NLoginCore_144_a() {
        return this.var_com_nickuc_login_NLoginCore_144_a;
    }
}

