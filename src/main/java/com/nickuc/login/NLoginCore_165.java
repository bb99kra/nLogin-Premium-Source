/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Bukkit
 *  org.bukkit.Server
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Server;

public final class NLoginCore_165
extends Enum<NLoginCore_165> {
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_a;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_b;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_c;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_d;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_e;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_f;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_g;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_h;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_i;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_j;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_k;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_l;
    public static final /* enum */ NLoginCore_165 var_com_nickuc_login_NLoginCore_165_m;
    private final String var_java_lang_String_ag;
    private final boolean J;
    private static final NLoginCore_165 var_com_nickuc_login_NLoginCore_165_n;
    private static final /* synthetic */ NLoginCore_165[] var_com_nickuc_login_NLoginCore_165_arr_a;
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
    private static int var_int_k;
    private static int var_int_l;
    private static int var_int_m;
    private static int var_int_n;
    private static int o;
    private static int p;
    private static int q;
    private static long r;
    private static long s;
    private static int t;
    private static int u;
    private static long v;
    private static long w;
    private static int x;
    private static int y;
    private static long z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static long var_long_ag;
    private static long ah;
    private static int ai;
    private static int aj;
    private static long ak;
    private static long al;
    private static int am;
    private static int an;
    private static int ao;
    private static long ap;
    private static int aq;
    private static int ar;
    private static long as;
    private static int at;
    private static int au;
    private static long av;
    private static long aw;
    private static int ax;
    private static int ay;
    private static long az;
    private static int ba;
    private static int bb;
    private static long bc;
    private static int bd;
    private static int be;
    private static long bf;
    private static int bg;
    private static int bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static long bl;
    private static long bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static long bq;
    private static int br;
    private static int bs;
    private static long bt;
    private static long bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static long by;
    private static int bz;
    private static int ca;
    private static long cb;
    private static long cc;
    private static int cd;
    private static int ce;
    private static long cf;
    private static int cg;
    private static int ch;
    private static int ci;
    private static long cj;
    private static int ck;
    private static int cl;
    private static long cm;
    private static int cn;
    private static int co;
    private static int cp;
    private static long cq;
    private static int cr;
    private static int cs;
    private static long ct;
    private static long cu;
    private static int cv;
    private static int cw;
    private static long cx;
    private static int cy;
    private static int cz;
    private static long da;
    private static int db;
    private static int dc;
    private static int dd;
    private static long de;
    private static int df;
    private static int dg;
    private static int dh;

    private static void b() {
        int n;
        var_long_c = 2606533078692195772L;
        long l = var_long_c ^ 0x24246CDE51052602L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(8 + 75), (byte)(25 + 22), 67, (byte)(17 + 49), (byte)(16 + 51), (byte)(5 + 42), (byte)(2 + 78), (byte)(72 + 3), (byte)(25 + 42), (byte)(39 + 44), (byte)(7 + 46), (byte)(40 + 40), (byte)(62 + 35), (byte)(29 + 71), (byte)(48 + 52), (byte)(68 + 37), (byte)(94 + 16), (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_165.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ŁŖėőŐľŌŘĭĺĺħ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[1] = NLoginCore_223.E("Ւ՚ՒԤ՝Խ՝՚ՆՈծ՟ԣդձըՋԲդՅձՒԿՀ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ŕňŚňĤĚĬőĨěĶħ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ĖįĢőŎĜĔĵęıĲŒŁĥŧŃŇĢŋŇĽŅĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[4] = NLoginCore_223.D("қґқҰѻҞҗ҃Ґҕѿҍ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[5] = NLoginCore_027.E("ՑՕ՛ՉԧՓՋԫՕՂժՋ՚՟՟գձԨբՉըՂԿՀ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[6] = NLoginCore_091.D("ҙҝҡҷӁңҴһ҅Ҧ҃ҍ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[7] = NLoginCore_223.A("įīĚňļĘŜřļęĺĳĚŦşĲŝěŢĩĺŅĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[8] = NLoginCore_138.A("ĵĕĸĳĻśĶŚšĴŐħ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[9] = NLoginCore_427.A("ĒĭŏŅĻřŉļĸķķŌŏŅŦŐŚŧģŨĩŅĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[10] = NLoginCore_453.B("ĳŊĖŌőŕŒęşĝĲħ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[11] = NLoginCore_384.A("ĪĔħİĚŅĔĪĳĚıłĹĸĶĲŅļşħņŅĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[12] = NLoginCore_451.A("ĎĤēŐĳĽŚĖĒĝŜħ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[13] = NLoginCore_091.B("ŎīĤŐņĽĸęňĜġŚĚĹŝļţşřġūĵĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[14] = NLoginCore_091.E("ԯՙՓՕԻէի՗ՇթՙԴ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[15] = NLoginCore_223.C("ҘҊҜүҿҷҲ҃ҕҷҨҍ", (byte)48, 67);
                    NLoginCore_165.var_java_lang_String_arr_b[16] = NLoginCore_173.E("ԴԞԙՈՇՉզ՝՘ԮՃԴ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[17] = NLoginCore_575.E("ՑԳԾԸ՚ԨՈՙՃԹԷԴ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[18] = NLoginCore_387.D("ҽҽѾҡҌѵҮѽӃҘҀӅҤҷӋҟҫӅҩҮҞқҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[19] = NLoginCore_092.F("ԯԤՕՑՃդԻ՚ԶՍԨԫլՍՔՉՠՈԵԴզըԿՀ", (byte)48, 70);
                    NLoginCore_165.var_java_lang_String_arr_b[20] = NLoginCore_173.A("ĤŉĲŏħŊŔŗĭļłħ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[21] = NLoginCore_223.B("ńĬĶĖŏŞĦİįśġħ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[22] = NLoginCore_091.A("ĢŉıŎņĩŒŝĜŕŐŢŐĽŗĹũšŢīīśĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[23] = NLoginCore_451.C("һҭҨҫҲҾҁү҄ҳҔҁҹҤҚӂҶҢҮҙҮӁҘҙ", (byte)48, 67);
                    NLoginCore_165.var_java_lang_String_arr_b[24] = NLoginCore_559.A("ĔńŖķĳŜħŚľśŌőįŚŜŞļœŀŕŘĵĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[25] = NLoginCore_223.F("՝ԵբՂԦԾԢՂԣՃ՗ԾՌծլ՝ԭՒԿըղոԿՀ", (byte)48, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_165.var_java_lang_String_arr_b[0] = NLoginCore_575.D("ҧѿҠѺҘҶҤґҹҥҖҦҙӊҢҙӌҬҞҤӇҫҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[1] = NLoginCore_446.C("ҫҳҫѽҶҖҶҳҟҡӇӃҦҕӈҬҬҎңӀҞӁҘҙ", (byte)48, 67);
                    NLoginCore_165.var_java_lang_String_arr_b[2] = NLoginCore_223.C("҈ҞҹҵҪқҐӁҁҼҔҍ", (byte)48, 67);
                    NLoginCore_165.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ĖįĢőŎĜĔĵęıĲŜśŞŗœŧœŊŉŀĵĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[4] = NLoginCore_110.C("ѽҎҨүѽүҗӀҰґӉ҃ҶҚҜҌҨӁһ҈ҋҫҘҙ", (byte)48, 67);
                    NLoginCore_165.var_java_lang_String_arr_b[5] = NLoginCore_201.A("ńňŎļĚņľĞňĵŞŤŚİŒŐţœĶţťūĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[6] = NLoginCore_091.B("ŖŌĨıĨĳĩŗŜįĭĠŔŦģŜŜłńŇŋśĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[7] = NLoginCore_092.B("įīĚňļĘŜřļęļŕķĲŐİŚŀĪŀĞśĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[8] = NLoginCore_427.E("ՙԶԷԧԽՔ՝ԺԵդՇՁՍԼՌԬխըժՉաՒԿՀ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[9] = NLoginCore_201.F("ԟԺ՜ՒՈզՖՉՅՄՅՅՒՀիէկՉՏգՇըԿՀ", (byte)48, 70);
                    NLoginCore_165.var_java_lang_String_arr_b[10] = NLoginCore_091.F("աՓԣՅԧՇ՛Ԟ՞եգՙգԾՉԽՄծՅԯշըԿՀ", (byte)48, 70);
                    NLoginCore_165.var_java_lang_String_arr_b[11] = NLoginCore_223.B("ĪĔħİĚŅĔĪĳĚİģŠŞťġğķũŋŇūĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ňłŔņĽĹĴķŜŁěęŝŗĵőĸŁķśŌśĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[13] = NLoginCore_173.D("ҴґҊҶҬңҞѿҮ҂ѾӆҥҋҨӋӌӌҨҼӐӑҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[14] = NLoginCore_092.A("ĬĹĢŚĺĖĻĴŎŒŒĳĞĶŇńİŨŗŇģśĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[15] = NLoginCore_223.D("҆ҘҼѳҳҷҬѾҦқҜҜѼҸҙӂ҈ҢҜң҈ҫҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[16] = NLoginCore_446.D("ҝҽѸҲқҫґҟ҅ӁҺҍ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[17] = NLoginCore_076.D("ҩѸҳҢѿҢҮһҕҒқѿӆӈӃҪҧӈӄҠӈӑҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[18] = NLoginCore_451.A("ŗŗĘĻĦďňėŝĲĜŜŕĭĴńĞĸĸŊōśĲĳ", (byte)48, 65);
                    NLoginCore_165.var_java_lang_String_arr_b[19] = NLoginCore_446.D("҈ѽҮҪҜҽҔҳҏҦ҂҈ҨҳҬқҺһӆӉұҫҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[20] = NLoginCore_091.B("łĐŘōĨŒŖĕœĪĠŝĮĲļĴŉŅœĹŋĵĲĳ", (byte)48, 66);
                    NLoginCore_165.var_java_lang_String_arr_b[21] = NLoginCore_110.D("ҜѷѸҮѼѾҝӅҺҰҧ҅ӆҊӇҺҩҞҩҭӊӑҘҙ", (byte)48, 68);
                    NLoginCore_165.var_java_lang_String_arr_b[22] = NLoginCore_201.E("ԯՖԾ՛ՓԶ՟ժԩբ՟ՙծԲՋ԰ծԿԶյՁըԿՀ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[23] = NLoginCore_453.E("բՔՏՒՙեԨՖԫ՚ԼԸբղՌղծՓգոԶըԿՀ", (byte)48, 69);
                    NLoginCore_165.var_java_lang_String_arr_b[24] = NLoginCore_027.F("ԡՑգՄՀթԴէՋը՛ԩ԰ՠԿծեձԷիՔըԿՀ", (byte)48, 70);
                    NLoginCore_165.var_java_lang_String_arr_b[25] = NLoginCore_076.E("՝ԵբՂԦԾԢՂԣՃՏՠ՜՟ԥՐ՞ՠզՔդըԿՀ", (byte)48, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_165.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ՆԸԧՉՖզԝ՝ԿՅԡ԰՞԰԰ՔթԯՀՁդըԿՀ", (byte)48, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_165.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԡՖԹԞՊ՝ՊԺՍՌՙ՜ՄԾթՃլժՓՙՑՋդճծնկըՙՁՀՕ", (byte)48, 69);
                }
            }
        }
    }

    @Generated
    public boolean O() {
        return this.J;
    }

    public static NLoginCore_165[] values() {
        return (NLoginCore_165[])var_com_nickuc_login_NLoginCore_165_arr_a.clone();
    }

    public static NLoginCore_165 com_nickuc_login_NLoginCore_165_a() {
        return var_com_nickuc_login_NLoginCore_165_n;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_165.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ãąćçċĪĢĸĤóıħĵįøĝĿľĶļĶċ", (byte)30, 66), NLoginCore_165.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("ԽՊՉԌՌՈՃՌ՗ՆԓՑՕՎՑ՗ԙࢫࢢࢦࢦࢊࢄࢲࢹ࢛ࢹࢉ԰", (byte)30, 70) + string + NLoginCore_138.D("щ", (byte)30, 68) + methodType.toString(), exception);
        }
    }

    static {
        NLoginCore_165[] NLoginCore_165Array;
        var_int_a = Integer.reverse(-1342177280);
        var_int_b = 0 >>> 155 | 0 << -155;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 131072 >>> 208 | 131072 << -208;
        var_int_e = (12288 >>> 140 | 12288 << ~140 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(0x20000000);
        var_int_g = Integer.reverse(-1610612736);
        var_int_h = Integer.reverse(0x60000000);
        var_int_i = 224 >>> 37 | 224 << ~37 + 1;
        var_int_j = 16 >>> 225 | 16 << ~225 + 1;
        var_int_k = (288 >>> 197 | 288 << ~197 + 1) & 0xFFFFFFFF;
        var_int_l = 0x14000000 >>> 185 | 0x14000000 << -185;
        var_int_m = 0x2C00000 >>> 214 | 0x2C00000 << ~214 + 1;
        var_int_n = Integer.reverse(0x30000000);
        o = Integer.reverse(0x58000000);
        p = Integer.reverse(0x58000000);
        q = (0 >>> 159 | 0 << -159) & 0xFFFFFFFF;
        r = Long.reverse(4447026826566579236L);
        s = Long.reverse(-2882303761517117440L);
        t = 0 >>> 235 | 0 << -235;
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Long.reverse(4447026826566579236L);
        w = Long.reverse(-2882303761517117440L);
        x = Integer.reverse(0);
        y = 0x40000000 >>> 61 | 0x40000000 << ~61 + 1;
        z = Long.reverse(-1894041448771079132L);
        aa = (128 >>> 199 | 128 << ~199 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(-1073741824);
        ac = Integer.reverse(-1);
        ad = Long.reverse(-1894041448771079132L);
        ae = 0 >>> 223 | 0 << ~223 + 1;
        af = Integer.reverse(0x20000000);
        var_long_ag = Long.reverse(4447026826566579236L);
        ah = Long.reverse(-2882303761517117440L);
        ai = Integer.reverse(0x40000000);
        aj = (40960 >>> 205 | 40960 << -205) & 0xFFFFFFFF;
        ak = Long.reverse(4447026826566579236L);
        al = Long.reverse(-2882303761517117440L);
        am = Integer.reverse(0);
        an = (0x18000000 >>> 154 | 0x18000000 << -154) & 0xFFFFFFFF;
        ao = Integer.reverse(-1);
        ap = Long.reverse(-1894041448771079132L);
        aq = Integer.reverse(-1073741824);
        ar = Integer.reverse(-536870912);
        as = Long.reverse(-1894041448771079132L);
        at = Integer.reverse(0);
        au = Integer.reverse(0x10000000);
        av = Long.reverse(4447026826566579236L);
        aw = Long.reverse(-2882303761517117440L);
        ax = (4 >>> 0 | 4 << ~0 + 1) & 0xFFFFFFFF;
        ay = Integer.reverse(-1879048192);
        az = Long.reverse(-1894041448771079132L);
        ba = (0 >>> 145 | 0 << ~145 + 1) & 0xFFFFFFFF;
        bb = 0x28000000 >>> 90 | 0x28000000 << ~90 + 1;
        bc = Long.reverse(-1894041448771079132L);
        bd = (0x500000 >>> 148 | 0x500000 << -148) & 0xFFFFFFFF;
        be = Integer.reverse(-805306368);
        bf = Long.reverse(-1894041448771079132L);
        bg = Integer.reverse(0);
        bh = Integer.reverse(0x30000000);
        bi = Long.reverse(-1894041448771079132L);
        bj = Integer.reverse(0x60000000);
        bk = -1610612735 >>> 189 | -1610612735 << -189;
        bl = Long.reverse(4447026826566579236L);
        bm = Long.reverse(-2882303761517117440L);
        bn = (0 >>> 178 | 0 << -178) & 0xFFFFFFFF;
        bo = (0x1C00000 >>> 53 | 0x1C00000 << ~53 + 1) & 0xFFFFFFFF;
        bp = Integer.reverse(-1);
        bq = Long.reverse(-1894041448771079132L);
        br = 0x3800000 >>> 247 | 0x3800000 << ~247 + 1;
        bs = (0xF00000 >>> 212 | 0xF00000 << ~212 + 1) & 0xFFFFFFFF;
        bt = Long.reverse(4447026826566579236L);
        bu = Long.reverse(-2882303761517117440L);
        bv = 65536 >>> 176 | 65536 << -176;
        bw = (0x8000000 >>> 247 | 0x8000000 << -247) & 0xFFFFFFFF;
        bx = Integer.reverse(-1);
        by = Long.reverse(-1894041448771079132L);
        bz = Integer.reverse(0x10000000);
        ca = (139264 >>> 205 | 139264 << -205) & 0xFFFFFFFF;
        cb = Long.reverse(4447026826566579236L);
        cc = Long.reverse(-2882303761517117440L);
        cd = Integer.reverse(Integer.MIN_VALUE);
        ce = 0x48000000 >>> 250 | 0x48000000 << -250;
        cf = Long.reverse(-1894041448771079132L);
        cg = Integer.reverse(-1879048192);
        ch = Integer.reverse(-939524096);
        ci = (-1 >>> 15 | -1 << -15) & 0xFFFFFFFF;
        cj = Long.reverse(-1894041448771079132L);
        ck = 4 >>> 34 | 4 << -34;
        cl = Integer.reverse(0x28000000);
        cm = Long.reverse(-1894041448771079132L);
        cn = Integer.reverse(0x50000000);
        co = 0x2A00000 >>> 149 | 0x2A00000 << ~149 + 1;
        cp = -1 >>> 139 | -1 << ~139 + 1;
        cq = Long.reverse(-1894041448771079132L);
        cr = (32768 >>> 79 | 32768 << ~79 + 1) & 0xFFFFFFFF;
        cs = (45056 >>> 235 | 45056 << -235) & 0xFFFFFFFF;
        ct = Long.reverse(4447026826566579236L);
        cu = Long.reverse(-2882303761517117440L);
        cv = Integer.reverse(-805306368);
        cw = 0x2E0000 >>> 209 | 0x2E0000 << -209;
        cx = Long.reverse(-1894041448771079132L);
        cy = Integer.reverse(Integer.MIN_VALUE);
        cz = Integer.reverse(0x18000000);
        da = Long.reverse(-1894041448771079132L);
        db = Integer.reverse(0x30000000);
        dc = Integer.reverse(-1744830464);
        dd = Integer.reverse(-1);
        de = Long.reverse(-1894041448771079132L);
        df = Integer.reverse(Integer.MIN_VALUE);
        dg = 0 >>> 80 | 0 << -80;
        dh = 0 >>> 250 | 0 << ~250 + 1;
        var_java_lang_String_arr_a = new String[o];
        var_java_lang_String_arr_b = new String[p];
        NLoginCore_165.b();
        var_com_nickuc_login_NLoginCore_165_a = new NLoginCore_165((String)NLoginCore_165.c("㺃", (int)u, (long)(v ^ w)), x != 0);
        var_com_nickuc_login_NLoginCore_165_b = new NLoginCore_165((String)NLoginCore_165.c("㺉", (int)(ab & ac), (long)ad), ae != 0);
        var_com_nickuc_login_NLoginCore_165_c = new NLoginCore_165((String)NLoginCore_165.c("㺏", (int)aj, (long)(ak ^ al)), am != 0);
        var_com_nickuc_login_NLoginCore_165_d = new NLoginCore_165((String)NLoginCore_165.c("㺕", (int)ar, (long)as), at != 0);
        var_com_nickuc_login_NLoginCore_165_e = new NLoginCore_165((String)NLoginCore_165.c("㺛", (int)ay, (long)az), ba != 0);
        var_com_nickuc_login_NLoginCore_165_f = new NLoginCore_165((String)NLoginCore_165.c("㺡", (int)be, (long)bf), bg != 0);
        var_com_nickuc_login_NLoginCore_165_g = new NLoginCore_165((String)NLoginCore_165.c("㺧", (int)bk, (long)(bl ^ bm)), bn != 0);
        var_com_nickuc_login_NLoginCore_165_h = new NLoginCore_165((String)NLoginCore_165.c("㺭", (int)bs, (long)(bt ^ bu)), bv != 0);
        var_com_nickuc_login_NLoginCore_165_i = new NLoginCore_165((String)NLoginCore_165.c("㺳", (int)ca, (long)(cb ^ cc)), cd != 0);
        var_com_nickuc_login_NLoginCore_165_j = new NLoginCore_165((String)NLoginCore_165.c("㺹", (int)(ch & ci), (long)cj), ck != 0);
        var_com_nickuc_login_NLoginCore_165_k = new NLoginCore_165((String)NLoginCore_165.c("㺿", (int)(co & cp), (long)cq), cr != 0);
        var_com_nickuc_login_NLoginCore_165_l = new NLoginCore_165((String)NLoginCore_165.c("㻅", (int)cw, (long)cx), cy != 0);
        var_com_nickuc_login_NLoginCore_165_m = new NLoginCore_165((String)NLoginCore_165.c("㻋", (int)(dc & dd), (long)de), df != 0);
        var_com_nickuc_login_NLoginCore_165_arr_a = NLoginCore_165.com_nickuc_login_NLoginCore_165_arr_a();
        NLoginCore_165 NLoginCore_1652 = null;
        Server server = Bukkit.getServer();
        String string = server.getVersion();
        String string2 = server.getName();
        NLoginCore_165[] NLoginCore_165Array2 = NLoginCore_165Array = NLoginCore_165.values();
        int n = NLoginCore_165Array2.length;
        for (int i = dg; i < n; ++i) {
            NLoginCore_165 NLoginCore_1653 = NLoginCore_165Array2[i];
            if (!string.contains(NLoginCore_1653.getName()) && (string2 == null || !string2.contains(NLoginCore_1653.getName()))) continue;
            NLoginCore_1652 = NLoginCore_1653;
            break;
        }
        if (NLoginCore_1652 == null) {
            NLoginCore_1652 = NLoginCore_165Array[dh];
        }
        var_com_nickuc_login_NLoginCore_165_n = NLoginCore_1652;
    }

    @Generated
    public String getName() {
        return this.var_java_lang_String_ag;
    }

    public static NLoginCore_165 valueOf(String string) {
        return Enum.valueOf(NLoginCore_165.class, string);
    }

    @Generated
    private NLoginCore_165(String string2, boolean bl) {
        this.var_java_lang_String_ag = string2;
        this.J = bl;
    }

    private static /* synthetic */ NLoginCore_165[] com_nickuc_login_NLoginCore_165_arr_a() {
        NLoginCore_165[] NLoginCore_165Array = new NLoginCore_165[var_int_a];
        NLoginCore_165Array[NLoginCore_165.var_int_b] = var_com_nickuc_login_NLoginCore_165_a;
        NLoginCore_165Array[NLoginCore_165.var_int_c] = var_com_nickuc_login_NLoginCore_165_b;
        NLoginCore_165Array[NLoginCore_165.var_int_d] = var_com_nickuc_login_NLoginCore_165_c;
        NLoginCore_165Array[NLoginCore_165.var_int_e] = var_com_nickuc_login_NLoginCore_165_d;
        NLoginCore_165Array[NLoginCore_165.var_int_f] = var_com_nickuc_login_NLoginCore_165_e;
        NLoginCore_165Array[NLoginCore_165.var_int_g] = var_com_nickuc_login_NLoginCore_165_f;
        NLoginCore_165Array[NLoginCore_165.var_int_h] = var_com_nickuc_login_NLoginCore_165_g;
        NLoginCore_165Array[NLoginCore_165.var_int_i] = var_com_nickuc_login_NLoginCore_165_h;
        NLoginCore_165Array[NLoginCore_165.var_int_j] = var_com_nickuc_login_NLoginCore_165_i;
        NLoginCore_165Array[NLoginCore_165.var_int_k] = var_com_nickuc_login_NLoginCore_165_j;
        NLoginCore_165Array[NLoginCore_165.var_int_l] = var_com_nickuc_login_NLoginCore_165_k;
        NLoginCore_165Array[NLoginCore_165.var_int_m] = var_com_nickuc_login_NLoginCore_165_l;
        NLoginCore_165Array[NLoginCore_165.var_int_n] = var_com_nickuc_login_NLoginCore_165_m;
        return NLoginCore_165Array;
    }

    private static String a(int n, long l) {
        l ^= 0x1BL;
        l ^= 0x24246CDE51052602L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(24 + 45), (byte)(28 + 55), 47, (byte)(6 + 61), (byte)(20 + 46), (byte)(7 + 60), (byte)(20 + 27), (byte)(22 + 58), (byte)(35 + 40), (byte)(63 + 4), (byte)(7 + 76), 53, (byte)(32 + 48), (byte)(17 + 80), (byte)(83 + 17), (byte)(23 + 77), (byte)(28 + 77), (byte)(34 + 76), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("ƺǇǆƉǉǅǀǉǔǃƐǎǒǋǎǔƖԨԟԣԣԇԁԯԶԘԶԆ", (byte)108, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_165.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

