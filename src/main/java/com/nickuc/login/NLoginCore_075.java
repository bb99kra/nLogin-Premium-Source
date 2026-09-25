/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_112;
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
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_075 {
    private static int au;
    private static int bi;
    private static long bh;
    private static long v;
    private static long ah;
    private static long an;
    private static long ad;
    private static long x;
    private static long e;
    private static int t;
    private static int ar;
    private static int q;
    private static int ai;
    private int aL = var_int_a;
    private static int var_int_c;
    private static long u;
    private static long av;
    private static int aw;
    private static int az;
    private static int g;
    private static long ax;
    private static long bb;
    private static String[] var_java_lang_String_arr_a;
    private static int y;
    private static int ao;
    private static long aq;
    private static long i;
    private static long ak;
    private String cK;
    private static int ap;
    private static long p;
    private int aN;
    private static int aj;
    private static String[] var_java_lang_String_arr_b;
    private static int w;
    private static long m;
    private static long ac;
    private int aM = var_int_b;
    private static long am;
    private static long ay;
    private static long z;
    private static int o;
    private static int al;
    private static int k;
    private static int bf;
    private static int bj;
    private static int ae;
    private static long be;
    private static int ab;
    private static int as;
    private static long aa;
    private static int bc;
    private static long bd;
    private static long af;
    private static long f;
    private String cJ;
    private static int j;
    private static int bg;
    private static int var_int_b;
    private static int l;
    private static int d;
    private static int n;
    private static int ag;
    private static int ba;
    private static long var_long_c;
    private static int h;
    private static long at;
    private static int var_int_a;
    private static long s;
    private static int r;

    public NLoginCore_075() {
        this.aN = var_int_c;
    }

    public boolean Z() {
        return (this.cJ != null && this.cK != null ? j : k) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x20L;
        l ^= 0x7B3A4BD493D85DB0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(64 + 5), (byte)(20 + 63), (byte)(21 + 26), (byte)(20 + 47), (byte)(8 + 58), (byte)(49 + 18), (byte)(7 + 40), (byte)(11 + 69), (byte)(27 + 48), 67, (byte)(53 + 30), (byte)(28 + 25), (byte)(59 + 21), 97, (byte)(8 + 92), (byte)(36 + 64), (byte)(29 + 76), (byte)(45 + 65), (byte)(10 + 93)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.A("ĸŅńćŇŃľŇŒŁĎŌŐŉŌŒĔҭ҇ѻҮѽҰҲҨҥҷҹҌҒҫҥ", (byte)43, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_075.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -4688085124976716898L;
        long l = var_long_c ^ 0x7B3A4BD493D85DB0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(12 + 57), 83, (byte)(22 + 25), (byte)(45 + 22), (byte)(26 + 40), (byte)(63 + 4), (byte)(45 + 2), (byte)(59 + 21), (byte)(64 + 11), 67, (byte)(49 + 34), (byte)(25 + 28), (byte)(46 + 34), (byte)(67 + 30), (byte)(41 + 59), (byte)(15 + 85), (byte)(98 + 7), (byte)(2 + 108), (byte)(101 + 2)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
                    NLoginCore_075.var_java_lang_String_arr_b[0] = NLoginCore_384.C("թՀ՞ա՜զԭՉմՈԱԻ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[1] = NLoginCore_092.F("֜ճ֑֔֏֙ՠռ֧ջդծ", (byte)106, 70);
                    NLoginCore_075.var_java_lang_String_arr_b[2] = NLoginCore_027.C("գՁԸՎթ՞ԮՄ՞ԬՠԻ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[3] = NLoginCore_091.A("ƅƣǉƇƯƨǑƭƾƴƿǘǎƮǂǄƜƮƧǜǈǟƦƧ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[4] = NLoginCore_446.B("ǃơƘƮǉƾƎƤƾƌǀƛ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[5] = NLoginCore_076.C("իԥՏՉՐծՊակժՂԻ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[6] = NLoginCore_223.E("՘ն֜՚ւջ֤ր֑և֒֫֡ց֕֗կցպֲ֛֯չպ", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[7] = NLoginCore_559.A("ǋƅƯƩưǎƪǁǏǊƢƛ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[8] = NLoginCore_575.D("ԶԸԬծՏձՁխԲմՕՕչոՉշՕՑզձՀՉՆՇ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[9] = NLoginCore_138.F("թի՟֡ւ֤մ֠ե֧ֈֈ֬֫ռ֪ֈք֤֙ճռչպ", (byte)106, 70);
                    NLoginCore_075.var_java_lang_String_arr_b[10] = NLoginCore_201.E("թի՟֡ւ֤մ֠ե֧օգ֞֨ժվֆօֆ֋ի֢չպ", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[11] = NLoginCore_201.B("ƖƘƌǎƯǑơǍƒǔƲƐǋǕƗƫƳƲƳƸƘǏƦƧ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[12] = NLoginCore_324.F("թի՟֡ւ֤մ֠ե֧օշյֳ֦֦֨֫֡֝օռչպ", (byte)106, 70);
                    NLoginCore_075.var_java_lang_String_arr_b[13] = NLoginCore_223.C("ԶԸԬծՏձՁխԲմՒՄՂյոճծճժրՒՉՆՇ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[14] = NLoginCore_559.F("էռ֎ՠլ֒՟ղ֛֢ֈպօթժ֍րիիը֩֏֐ւ֟֎֢֬ֈָֻ֛֕֫֯֕֋ֺּֽ֑ֈֶׅ֛֠օׂ׋ׂ֤֭֚֠֬֙", (byte)106, 70);
                    NLoginCore_075.var_java_lang_String_arr_b[15] = NLoginCore_110.B("ƞƞƎƦƦƠƺƉƞǅǁƔǈƱƦưǉƶƙǉƲƩƦƧ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[16] = NLoginCore_384.D("ՠՋԧաՍբըՄՄՉ՞ՁկԶժէՇչնՠՑկՆՇ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[17] = NLoginCore_092.B("ƊǍǃǋƋǉǋơƐǆƟƶƕǆǏƲƔƔǜƾǕƹƦƧ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[18] = NLoginCore_201.A("ƸƃǊƅƙƩƮǋƵǐƦƛ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[19] = NLoginCore_027.E("ս՘մ֞ճւ՜աբրօծ", (byte)106, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_075.var_java_lang_String_arr_b[0] = NLoginCore_076.D("՛ՊծԾՉԫՂՒՔՄՃՋշՄՅԵՕիՌՇ՗ՙՆՇ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[1] = NLoginCore_559.E("֢֚֙֔֓՛ֆսվն֥֛֠եջ֢֗բ֥դ֌ֲչպ", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[2] = NLoginCore_223.F("֓չնս֤֙֞ֆե֤շՠց֚֎֨֗խէ֧֞ռչպ", (byte)106, 70);
                    NLoginCore_075.var_java_lang_String_arr_b[3] = NLoginCore_110.D("ԥՃթԧՏՈձՍ՞Ք՞զԲՅՏ՜ծՎ՚ոկտՆՇ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[4] = NLoginCore_201.D("ԣՖԤԮծժՍդՅՑ՗ԱՎԯզճռվԻԷԼՙՆՇ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[5] = NLoginCore_092.E("ձ֡՗֎֣գ֣֘֠եդծ", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[6] = NLoginCore_223.C("ԥՃթԧՏՈձՍ՞ՔՖԴաՅԶԵդջմԵՒկՆՇ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[7] = NLoginCore_138.A("ƬƿƧƨƥǌƢƒǉǈǄƛ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[8] = NLoginCore_027.B("ƖƘƌǎƯǑơǍƒǔƲǆƊƐƱƘǌƽǎƨǟƶǕǌƭǓưǞǑƷƾǟ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[9] = NLoginCore_004.C("ԶԸԬծՏձՁխԲմՓԩըհկհղՏլնռչբ՟շգՐՃՑՁշՙ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[10] = NLoginCore_384.C("ԶԸԬծՏձՁխԲմՒՇչխՙէոճԶՌրտՆՇ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[11] = NLoginCore_559.A("ƖƘƌǎƯǑơǍƒǔƴǁǒǁƗƓǛƗƕǍƝƴǗƞƿǛǝǤǅǆƶǈ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ƖƘƌǎƯǑơǍƒǔƴƫƎǓǌƣǏǕƳƷǗƪƺǗǗƥǏǝǢƴƻǀ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[13] = NLoginCore_076.E("թի՟֡ւ֤մ֠ե֧ֆյ֜ն֍֘ժ֯֜ֆթղկվ֋֦մ֕օ֑ռ֬", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[14] = NLoginCore_384.D("ԴՉ՛ԭԹ՟ԬԿըկՕՇՒԶԷ՚ՍԸԸԵն՜՝Տլ՛չկՕբոռօըֈբ՘։՞և֊Օժ֊փ֑֔խ՗է֕Ֆրթզէ", (byte)106, 68);
                    NLoginCore_075.var_java_lang_String_arr_b[15] = NLoginCore_427.E("ձձաչչճ֍՜ձ֦֘֔֌ռ֗ֆվ֣֮֐ժֲչպ", (byte)106, 69);
                    NLoginCore_075.var_java_lang_String_arr_b[16] = NLoginCore_559.A("ǀƫƇǁƭǂǈƤƤƩƶǒƧƋǔƩƺǕƹƱǈƩƦƧ", (byte)106, 65);
                    NLoginCore_075.var_java_lang_String_arr_b[17] = NLoginCore_384.B("ƊǍǃǋƋǉǋơƐǆƞǉǑưƳǊǙǏƲƱưǟƦƧ", (byte)106, 66);
                    NLoginCore_075.var_java_lang_String_arr_b[18] = NLoginCore_559.C("՟գեծՉԣԺՈլդՌՍդդոչՄԶ՗խղկՆՇ", (byte)106, 67);
                    NLoginCore_075.var_java_lang_String_arr_b[19] = NLoginCore_559.F("՘֠ծ֐֎ո՜բգղ֓ծ", (byte)106, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_075.var_java_lang_String_arr_b[0] = NLoginCore_091.E("֋ռակղ֘ծ֟աՠդծ", (byte)106, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_075.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ƾǆƈƛƐƝƦƨưƒǐƛ", (byte)106, 66);
                }
            }
        }
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_075.c("㺀", (int)(ar & as), (long)at) + this.cJ + (String)NLoginCore_075.c("㺃", (int)au, (long)av) + this.cK + (String)NLoginCore_075.c("㺆", (int)aw, (long)(ax ^ ay)) + this.aL + (String)NLoginCore_075.c("㺉", (int)(az & ba), (long)bb) + this.aM + (String)NLoginCore_075.c("㺌", (int)bc, (long)(bd ^ be)) + this.aN + (String)NLoginCore_075.c("㺏", (int)(bf & bg), (long)bh);
    }

    static {
        var_int_a = (0 >>> 60 | 0 << -60) & 0xFFFFFFFF;
        var_int_b = (0x7800000 >>> 182 | 0x7800000 << -182) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0x60000000);
        d = Integer.reverse(0);
        e = Long.reverse(8775861026165428093L);
        f = Long.reverse(0x400000000000000L);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (-1 >>> 232 | -1 << ~232 + 1) & 0xFFFFFFFF;
        i = Long.reverse(9064091402317139837L);
        j = 512 >>> 233 | 512 << ~233 + 1;
        k = Integer.reverse(0);
        l = Integer.reverse(0x40000000);
        m = Long.reverse(9064091402317139837L);
        n = Integer.reverse(-1073741824);
        o = -1 >>> 112 | -1 << -112;
        p = Long.reverse(9064091402317139837L);
        q = 262144 >>> 240 | 262144 << ~240 + 1;
        r = Integer.reverse(-1);
        s = Long.reverse(9064091402317139837L);
        t = 20480 >>> 204 | 20480 << ~204 + 1;
        u = Long.reverse(8775861026165428093L);
        v = Long.reverse(0x400000000000000L);
        w = Integer.reverse(0x60000000);
        x = Long.reverse(9064091402317139837L);
        y = (-1073741823 >>> 190 | -1073741823 << ~190 + 1) & 0xFFFFFFFF;
        z = Long.reverse(8775861026165428093L);
        aa = Long.reverse(0x400000000000000L);
        ab = Integer.reverse(0x10000000);
        ac = Long.reverse(8775861026165428093L);
        ad = Long.reverse(0x400000000000000L);
        ae = Integer.reverse(-1879048192);
        af = Long.reverse(9064091402317139837L);
        ag = 0x1400000 >>> 149 | 0x1400000 << -149;
        ah = Long.reverse(9064091402317139837L);
        ai = (11 >>> 0 | 11 << -0) & 0xFFFFFFFF;
        aj = Integer.reverse(-1);
        ak = Long.reverse(9064091402317139837L);
        al = Integer.reverse(0x30000000);
        am = Long.reverse(8775861026165428093L);
        an = Long.reverse(0x400000000000000L);
        ao = -2147483642 >>> 159 | -2147483642 << ~159 + 1;
        ap = Integer.reverse(-1);
        aq = Long.reverse(9064091402317139837L);
        ar = (458752 >>> 79 | 458752 << -79) & 0xFFFFFFFF;
        as = -1 >>> 153 | -1 << -153;
        at = Long.reverse(9064091402317139837L);
        au = 60 >>> 98 | 60 << -98;
        av = Long.reverse(9064091402317139837L);
        aw = (1 >>> 188 | 1 << -188) & 0xFFFFFFFF;
        ax = Long.reverse(8775861026165428093L);
        ay = Long.reverse(0x400000000000000L);
        az = Integer.reverse(-2013265920);
        ba = -1 >>> 222 | -1 << ~222 + 1;
        bb = Long.reverse(9064091402317139837L);
        bc = 589824 >>> 207 | 589824 << ~207 + 1;
        bd = Long.reverse(8775861026165428093L);
        be = Long.reverse(0x400000000000000L);
        bf = (19 >>> 32 | 19 << -32) & 0xFFFFFFFF;
        bg = Integer.reverse(-1);
        bh = Long.reverse(9064091402317139837L);
        bi = Integer.reverse(0x28000000);
        bj = Integer.reverse(0x28000000);
        var_java_lang_String_arr_a = new String[bi];
        var_java_lang_String_arr_b = new String[bj];
        NLoginCore_075.b();
    }

    public void a(NLoginCore_277 NLoginCore_277, Object ... objectArray) {
        if (this.cJ == null || this.cK == null || this.aM <= 0) {
            return;
        }
        if (NLoginCore_277 == null || !NLoginCore_532.ai.ar()) {
            return;
        }
        String string = NLoginCore_277.getName();
        NLoginCore_277.a(NLoginCore_112.a(this.cJ.replace((CharSequence)NLoginCore_075.c("㺀", (int)d, (long)(e ^ f)), string), objectArray), NLoginCore_112.a(this.cK.replace((CharSequence)NLoginCore_075.c("㺃", (int)(g & h), (long)i), string), objectArray), this.aL, this.aM, this.aN);
    }

    public static NLoginCore_075 a(String string, NLoginCore_219 NLoginCore_2192) {
        if (!NLoginCore_2192.p(string + (String)NLoginCore_075.c("㺀", (int)l, (long)m)) || !NLoginCore_2192.p(string + (String)NLoginCore_075.c("㺃", (int)(n & o), (long)p))) {
            return NLoginCore_508.com_nickuc_login_NLoginCore_075_a();
        }
        NLoginCore_075 NLoginCore_0752 = new NLoginCore_075();
        NLoginCore_0752.cJ = NLoginCore_065.q(NLoginCore_2192.a(string + (String)NLoginCore_075.c("㺆", (int)(q & r), (long)s), (String)NLoginCore_075.c("㺉", (int)t, (long)(u ^ v))));
        NLoginCore_0752.cK = NLoginCore_065.q(NLoginCore_2192.a(string + (String)NLoginCore_075.c("㺌", (int)w, (long)x), (String)NLoginCore_075.c("㺏", (int)y, (long)(z ^ aa))));
        if (NLoginCore_2192.p(string + (String)NLoginCore_075.c("㺒", (int)ab, (long)(ac ^ ad)))) {
            NLoginCore_0752.aL = NLoginCore_2192.int_a(string + (String)NLoginCore_075.c("㺕", (int)ae, (long)af));
        }
        if (NLoginCore_2192.p(string + (String)NLoginCore_075.c("㺘", (int)ag, (long)ah))) {
            NLoginCore_0752.aM = NLoginCore_2192.int_a(string + (String)NLoginCore_075.c("㺛", (int)(ai & aj), (long)ak));
        }
        if (NLoginCore_2192.p(string + (String)NLoginCore_075.c("㺞", (int)al, (long)(am ^ an)))) {
            NLoginCore_0752.aN = NLoginCore_2192.int_a(string + (String)NLoginCore_075.c("㺡", (int)(ao & ap), (long)aq));
        }
        return NLoginCore_0752;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_075.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.A("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 65), NLoginCore_075.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ƐƝƜşƟƛƖƟƪƙŦƤƨơƤƪŬԅӟӓԆӕԈԊԀӽԏԑӤӪԃӽƇ", (byte)87, 66) + string + NLoginCore_384.F("Ս", (byte)87, 70) + methodType.toString(), exception);
        }
    }
}

