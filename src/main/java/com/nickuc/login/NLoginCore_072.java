/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
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
import lombok.Generated;

public class NLoginCore_072
implements NLoginCore_249 {
    private static long u;
    private static long var_long_c;
    private static int g;
    private static long t;
    private static long z;
    private static int var_int_a;
    private static int k;
    private static int s;
    private static int l;
    private static int h;
    private static String[] var_java_lang_String_arr_a;
    private static int y;
    private static long o;
    private static long al;
    private static int d;
    private static long var_long_b;
    private static long n;
    private static int ae;
    private static long af;
    private static int am;
    private static int i;
    private static long w;
    private static int aj;
    private static String[] var_java_lang_String_arr_b;
    private static long aa;
    private static int av;
    private static int ab;
    private static int q;
    private static int an;
    private static long as;
    private static int au;
    private static int j;
    private static int p;
    private final NLoginCore_211 Z;
    private static int ar;
    private static long r;
    private static long ac;
    private static long ah;
    private static long x;
    private static long f;
    private static long ad;
    private static int aq;
    private static long e;
    private static int ag;
    private static long ak;
    private static int at;
    private static long ap;
    private static long ao;
    private static int v;
    private static long ai;
    private static int var_int_c;
    private static int m;

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        NLoginCore_277.ad();
        NLoginCore_249.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
    }

    private static String a(int n, long l) {
        l ^= 0x33L;
        l ^= 0x9F2A18F5F9ED0E82L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(17 + 52), (byte)(42 + 41), (byte)(32 + 15), (byte)(20 + 47), 66, (byte)(18 + 49), 47, (byte)(33 + 47), (byte)(56 + 19), (byte)(48 + 19), (byte)(71 + 12), (byte)(18 + 35), (byte)(61 + 19), (byte)(44 + 53), (byte)(50 + 50), (byte)(41 + 59), (byte)(77 + 28), (byte)(78 + 32), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(24 + 44), 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("ՀՍՌԏՏՋՆՏ՚ՉԖՔ՘ՑՔ՚Ԝࢤࢩࢪࢄ࢕ࢇࢥࢫࢾ", (byte)33, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_072.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -7990711347680655748L;
        long l = var_long_c ^ 0x9F2A18F5F9ED0E82L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(44 + 25), (byte)(39 + 44), (byte)(38 + 9), (byte)(13 + 54), (byte)(54 + 12), 67, (byte)(22 + 25), (byte)(62 + 18), (byte)(29 + 46), 67, (byte)(33 + 50), (byte)(28 + 25), (byte)(75 + 5), (byte)(43 + 54), (byte)(16 + 84), (byte)(86 + 14), (byte)(48 + 57), (byte)(108 + 2), (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(20 + 63)}, StandardCharsets.UTF_8));
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
                    NLoginCore_072.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ѲқѮјғҊҒџҠҤҟѷҁҜғѽѷҪҫѷ҉ҝѴѵ", (byte)36, 67);
                    NLoginCore_072.var_java_lang_String_arr_b[1] = NLoginCore_201.F("ԶԺ՜ԶԜՋԖՎԓբԵԺ՚ԹՒՂ՜ԶգԥՎէՀԽՈՎիճՆԾԱՓՉոՐԻՉչԵԷԿ՞ՏՈ", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ԫՓԨԱԺ՗Օ՜ԟԻԻԨ", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[3] = NLoginCore_091.E("ԶԺ՜ԶԜՋԖՎԓբԳԝԻՄՔ՞՞Ԡ՘՛ԹՏՈ՛ՌժՋԳեՈՉխՙգոՄՍջՎջկնչՈ", (byte)36, 69);
                    NLoginCore_072.var_java_lang_String_arr_b[4] = NLoginCore_559.C("ѫ҇ҋѬѦѨѳѭҟѹҀѿѴѼҜѽѨѧѪҧҗҝѴѵ", (byte)36, 67);
                    NLoginCore_072.var_java_lang_String_arr_b[5] = NLoginCore_004.F("ԶԺ՜ԶԜՋԖՎԓբԴդԗՑՐ՚ԿԺՌՔՈԾԥԦՉՓԽիխԮԳԪԸ՘ՃՇԼՇճՊՒցչՁՅջԾցչ՘ոոեՖՓՔ", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[6] = NLoginCore_427.B("þþĂēĞĜĹĿĐŇĤĚńĖĎĨģĤńŇĪĭĚě", (byte)36, 66);
                    NLoginCore_072.var_java_lang_String_arr_b[7] = NLoginCore_027.A("ĝġŃĝăĲýĵúŉĚļłļīŐńĺŏğİĮĎĸĖįęģĮĘĔĭōŋĲŚşŏłŝĽĶŕĥŠŮŀĭūīōŲŁŠĶŒŘįŉŷśŷůźŝŁŴōťŻŢřſœŶŽŦƊƁŢśţƀŮŵƓŚś", (byte)36, 65);
                    NLoginCore_072.var_java_lang_String_arr_b[8] = NLoginCore_076.E("ԏԯ՗ԚՎՖԧՒԝՔԹԾդ՟ԯզՓզԿՉՇլԳԴ", (byte)36, 69);
                    NLoginCore_072.var_java_lang_String_arr_b[9] = NLoginCore_223.C("ѷѻҝѷѝҌїҏєңѴўѼ҅ҕҟҟѡҙҜѺҗҦ҆ҦҍѭѫҤѯҌѯ", (byte)36, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_072.var_java_lang_String_arr_b[0] = NLoginCore_324.E("Ա՚ԭԗՒՉՑԞ՟գ՝ԝԢԠԺՇԺԩԾՠ՟Ԫէե԰հՑՎՍՒՌԵ", (byte)36, 69);
                    NLoginCore_072.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ĝġŃĝăĲýĵúŉĜġŁĠĹĩŃĝŊČĵŎħĤįĵŒŚĭĥĘĺīĚĠĴŘţŦģŨıņĸĨŨŋŤĭĩŰŢįųĺĻ", (byte)36, 65);
                    NLoginCore_072.var_java_lang_String_arr_b[2] = NLoginCore_092.F("ԵԵՓՊԲԫ՚՟ՐԫաԾաԺզՠՂԪՓգխլԳԴ", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[3] = NLoginCore_384.A("ĝġŃĝăĲýĵúŉĚĄĢīĻŅŅćĿłĠĶįłĳőĲĚŌįİŔŌıľŝĬįĳļİěķũŞũŮĨŦŌśļīĽĺĻ", (byte)36, 65);
                    NLoginCore_072.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ѫ҇ҋѬѦѨѳѭҟѹ҂ѤѝғѵҒҚѝҫѻү҇Ѵѵ", (byte)36, 67);
                    NLoginCore_072.var_java_lang_String_arr_b[5] = NLoginCore_027.C("ѷѻҝѷѝҌїҏєңѵҥјҒґқҀѻҍҕ҉ѿѦѧҊҔѾҬҮѯѴѫѹҙ҄҈ѽ҈ҴҋғӂҺѷұҙҡ҂ҨҥӀҠӌҗҔҕ", (byte)36, 67);
                    NLoginCore_072.var_java_lang_String_arr_b[6] = NLoginCore_027.E("ԗԗԛԬԷԵՒ՘ԩՠԾԺԠՕեՆԹ՟ԣՃԭԶԳԴ", (byte)36, 69);
                    NLoginCore_072.var_java_lang_String_arr_b[7] = NLoginCore_223.F("ԶԺ՜ԶԜՋԖՎԓբԳՕ՛ՕՄթ՝ՓըԸՉՇԧՑԯՈԲԼՇԱԭՆզդՋճոը՛նՖՏծԾչևՙՆքՄզ֋՚չՏիձՈբ֐մ֐ֈ֓ն՚֍զվ֔ջղ֘լ֎֌֒֙՝ր֊ճը֙֫ի֯թս֫֒֓ծ֯ղք", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[8] = NLoginCore_173.F("ԏԯ՗ԚՎՖԧՒԝՔԸՐՁԺԱՖե՟ՁԫլՆԳԴ", (byte)36, 70);
                    NLoginCore_072.var_java_lang_String_arr_b[9] = NLoginCore_223.F("ԶԺ՜ԶԜՋԖՎԓբԳԝԻՄՔ՞՞Ԡ՘՛ԹՉ՟ԢԩղԫմՌՁ԰ոաբկ՗ՙջսԺԷ՛ԾՈ", (byte)36, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_072.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ѸғѶ҉іѽј҂ѺѴ҂ѢѴ҃ҀҢқҁѫҮ҈ѷѴѵ", (byte)36, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_072.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ľýĢĳŀĻņĆēĦĺĵņĘĈĽŊńĻĪŀĭĚě", (byte)36, 66);
                }
            }
        }
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.Z;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().p();
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_190 NLoginCore_1902 = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_f.com_nickuc_login_NLoginCore_190_a(NLoginCore_277);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_e, string -> {
            if (string.contains((CharSequence)NLoginCore_072.c("㺀", (int)m, (long)(n ^ o)))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_072.c("㺃", (int)(p & q), (long)r));
            } else if (string.contains((CharSequence)NLoginCore_072.c("㺆", (int)s, (long)(t ^ u)))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_072.c("㺉", (int)v, (long)(w ^ x)));
            } else if (string.contains((CharSequence)NLoginCore_072.c("㺌", (int)y, (long)(z ^ aa)))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_072.c("㺏", (int)ab, (long)(ac ^ ad)));
            } else if (string.contains((CharSequence)NLoginCore_072.c("㺒", (int)ae, (long)af))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_072.c("㺕", (int)ag, (long)(ah ^ ai)));
            } else if (string.contains((CharSequence)NLoginCore_072.c("㺘", (int)aj, (long)(ak ^ al)))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_072.c("㺛", (int)(am & an), (long)ao));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[var_int_c]);
        NLoginType_008.b(d != 0).a((NLoginCore_598 NLoginInterface_0482) -> {
            if (!NLoginCore_277.R() || !this.boolean_a(NLoginCore_5092)) {
                NLoginInterface_0482.Z();
                return;
            }
            Object[] objectArray = new Object[k];
            objectArray[NLoginCore_072.l] = NLoginCore_1902.ar();
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_p, objectArray);
        }, e, f, TimeUnit.SECONDS);
        GUIButtonContainer[] GUIButtonContainerArray = new GUIButtonContainer[g];
        GUIButtonContainerArray[NLoginCore_072.h] = new GUIButtonContainer(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_f, NLoginCore_1902);
        return GUIButtonContainerArray;
    }

    @Override
    public int a(boolean bl) {
        return i;
    }

    @Override
    public void void_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginType_008.b(var_int_a != 0).a(() -> {
            if (!NLoginCore_277.R() || !this.boolean_a(NLoginCore_5092)) {
                return;
            }
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.ci);
            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(() -> NLoginCore_150.a(NLoginCore_277, NLoginCore_119.cc), ap, TimeUnit.SECONDS);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_n, new Object[aq]);
            NLoginType_008.b(ar != 0).a(() -> {
                if (!NLoginCore_277.R() || !this.boolean_a(NLoginCore_5092)) {
                    return;
                }
                NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_o, new Object[at]);
            }, as, TimeUnit.SECONDS);
        }, var_long_b, TimeUnit.MILLISECONDS);
    }

    @Generated
    public NLoginCore_072(NLoginCore_211 NLoginCore_211) {
        this.Z = NLoginCore_211;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_072.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.E("ԯՑՓԳ՗նծքհԿսճցջՄթ֋֊ւֈւ՗", (byte)75, 69), NLoginCore_072.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.A("ŸƅƄŇƇƃžƇƒƁŎƌƐƉƌƒŔӜӡӢҼӍҿӝӣӶũ", (byte)75, 65) + string + NLoginCore_324.E("Ձ", (byte)75, 69) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean au() {
        return j != 0;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_long_b = Long.reverse(4296434044511453184L);
        var_int_c = (0 >>> 62 | 0 << -62) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = Long.reverse(0x3C00000000000000L);
        f = Long.reverse(0x7800000000000000L);
        g = (0x100000 >>> 180 | 0x100000 << -180) & 0xFFFFFFFF;
        h = (0 >>> 35 | 0 << -35) & 0xFFFFFFFF;
        i = -1811939311 >>> 215 | -1811939311 << -215;
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Integer.reverse(0);
        m = Integer.reverse(0);
        n = Long.reverse(4495704402569648265L);
        o = Long.reverse(-3746994889972252672L);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = -1 >>> 70 | -1 << ~70 + 1;
        r = Long.reverse(-980672744312874871L);
        s = (262144 >>> 113 | 262144 << -113) & 0xFFFFFFFF;
        t = Long.reverse(4495704402569648265L);
        u = Long.reverse(-3746994889972252672L);
        v = (0x1800000 >>> 183 | 0x1800000 << -183) & 0xFFFFFFFF;
        w = Long.reverse(4495704402569648265L);
        x = Long.reverse(-3746994889972252672L);
        y = 32 >>> 3 | 32 << -3;
        z = Long.reverse(4495704402569648265L);
        aa = Long.reverse(-3746994889972252672L);
        ab = Integer.reverse(-1610612736);
        ac = Long.reverse(4495704402569648265L);
        ad = Long.reverse(-3746994889972252672L);
        ae = (12 >>> 161 | 12 << -161) & 0xFFFFFFFF;
        af = Long.reverse(-980672744312874871L);
        ag = (229376 >>> 47 | 229376 << ~47 + 1) & 0xFFFFFFFF;
        ah = Long.reverse(4495704402569648265L);
        ai = Long.reverse(-3746994889972252672L);
        aj = Integer.reverse(0x10000000);
        ak = Long.reverse(4495704402569648265L);
        al = Long.reverse(-3746994889972252672L);
        am = Integer.reverse(-1879048192);
        an = -1 >>> 87 | -1 << -87;
        ao = Long.reverse(-980672744312874871L);
        ap = Long.reverse(0x4000000000000000L);
        aq = 0 >>> 146 | 0 << -146;
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = Long.reverse(-6917529027641081856L);
        at = Integer.reverse(0);
        au = Integer.reverse(0x50000000);
        av = (0x50000000 >>> 59 | 0x50000000 << -59) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[au];
        var_java_lang_String_arr_b = new String[av];
        NLoginCore_072.b();
    }
}

