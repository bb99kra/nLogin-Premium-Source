/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_503
extends NLoginCore_353 {
    private static int j;
    private static long ak;
    private static int o;
    private static int ac;
    private static long t;
    private static int var_int_c;
    private static long d;
    private static long ae;
    private static long ao;
    private static long g;
    private static String[] b;
    private static long am;
    private static long e;
    private static int ab;
    private static int f;
    private static int ap;
    private static int al;
    private static int aq;
    private static int aa;
    private static int l;
    private static int k;
    private static int x;
    private static int v;
    private static long var_long_c;
    private static int w;
    private static long h;
    private static int i;
    private static int y;
    private static int s;
    private static int q;
    private static int af;
    private static long ah;
    private static int aj;
    private static long r;
    private static int n;
    private static long u;
    private static int z;
    private static int p;
    private static int m;
    private static String[] a;
    private static int an;
    private static int ai;
    private static int ar;
    private static int ag;
    private static int ad;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_503.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.E("ԣՅՇԧՋժբոդԳձէյկԸ՝տվնռնՋ", (byte)63, 69), NLoginCore_503.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.A("ŠŭŬįůūŦůźũĶŴŸűŴźļҩӏҫӗҸӏӊҸұҷŒ", (byte)63, 65) + string + NLoginCore_110.B("ķ", (byte)63, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x71L;
        l ^= 0x822A899F14580428L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(49 + 34), (byte)(40 + 7), (byte)(9 + 58), (byte)(61 + 5), (byte)(8 + 59), (byte)(22 + 25), (byte)(74 + 6), (byte)(71 + 4), (byte)(52 + 15), (byte)(75 + 8), (byte)(32 + 21), (byte)(77 + 3), (byte)(2 + 95), (byte)(31 + 69), (byte)(56 + 44), (byte)(35 + 70), (byte)(26 + 84), (byte)(38 + 65)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.D("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњ߇߭߉ߵߖ߭ߨߖߏߕ", (byte)34, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_503.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = 0 >>> 110 | 0 << -110;
        d = Long.reverse(-3744111601307240326L);
        e = Long.reverse(-8214565720323784704L);
        f = 131072 >>> 81 | 131072 << ~81 + 1;
        g = Long.reverse(-3744111601307240326L);
        h = Long.reverse(-8214565720323784704L);
        i = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        j = 0 >>> 202 | 0 << -202;
        k = 0 >>> 96 | 0 << ~96 + 1;
        l = Integer.reverse(0);
        m = Integer.reverse(0x40000000);
        n = 262144 >>> 82 | 262144 << -82;
        o = (0 >>> 251 | 0 << ~251 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0x40000000);
        q = Integer.reverse(-1);
        r = Long.reverse(4758684495168256122L);
        s = 0x18000000 >>> 187 | 0x18000000 << -187;
        t = Long.reverse(-3744111601307240326L);
        u = Long.reverse(-8214565720323784704L);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 0 >>> 156 | 0 << ~156 + 1;
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(0);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = 128 >>> 7 | 128 << ~7 + 1;
        ad = (8 >>> 225 | 8 << -225) & 0xFFFFFFFF;
        ae = Long.reverse(4758684495168256122L);
        af = Integer.reverse(-1610612736);
        ag = Integer.reverse(-1);
        ah = Long.reverse(4758684495168256122L);
        ai = 0 >>> 20 | 0 << ~20 + 1;
        aj = (0x600000 >>> 148 | 0x600000 << -148) & 0xFFFFFFFF;
        ak = Long.reverse(4758684495168256122L);
        al = Integer.reverse(-536870912);
        am = Long.reverse(4758684495168256122L);
        an = Integer.reverse(0x10000000);
        ao = Long.reverse(4758684495168256122L);
        ap = 0 >>> 164 | 0 << -164;
        aq = (0x48000000 >>> 27 | 0x48000000 << -27) & 0xFFFFFFFF;
        ar = 36864 >>> 204 | 36864 << -204;
        a = new String[aq];
        b = new String[ar];
        NLoginCore_503.void_b();
    }

    private static void void_b() {
        int n;
        var_long_c = 6781740645846110259L;
        long l = var_long_c ^ 0x822A899F14580428L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(32 + 37), 83, (byte)(12 + 35), (byte)(34 + 33), (byte)(63 + 3), (byte)(11 + 56), (byte)(29 + 18), (byte)(12 + 68), (byte)(49 + 26), (byte)(21 + 46), 83, (byte)(14 + 39), (byte)(71 + 9), (byte)(10 + 87), (byte)(40 + 60), (byte)(12 + 88), (byte)(104 + 1), (byte)(6 + 104), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_503.b[0] = NLoginCore_384.F("շբօժְր֡ճֈֵմփոֈִִ֪֌ճ֮ր֜։֊", (byte)122, 70);
                    NLoginCore_503.b[1] = NLoginCore_575.E("֫ի֙ժեռִ֦֒֙նֶ֌ղ֑վյ֑֬֊ֱ֜։֊", (byte)122, 69);
                    NLoginCore_503.b[2] = NLoginCore_201.E("֘֋֢֒հւֲֶ֑֥֓ձַ֣ջֈ֟֫շ֍ֲֿ։֊", (byte)122, 69);
                    NLoginCore_503.b[3] = NLoginCore_324.B("ǋǖǣƧǥƧǉƽǯǎǟǤǢǥǏǈƸǓǔǾƿǙǆǇ", (byte)122, 66);
                    NLoginCore_503.b[4] = NLoginCore_223.C("՛կժո֓խիղ֘֐ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱ֣֪֖֯֜նֽ֭ռׂ֎օָ֋", (byte)122, 67);
                    NLoginCore_503.b[5] = NLoginCore_384.D("կծ֞ֈկխ՟ծ՝սղճ֛֞֔եթս֍֊հ։նշ", (byte)122, 68);
                    NLoginCore_503.b[6] = NLoginCore_091.C("Փժղ֠՛֜֍ն՜ռպի", (byte)122, 67);
                    NLoginCore_503.b[7] = NLoginCore_201.B("ƧǇƽƾǨǋƿǥǆǅƵǠǩƷƶǯǦǌǛǏǚƾǍǐȀǸǽǃǑǚǠȃǵǢǭǸȄǧǮȐǑȄǷǭǠǢǭǛǺǔǾȒǩǷǷȖǶȘȑȆȖǩȔǿ", (byte)122, 66);
                    NLoginCore_503.b[8] = NLoginCore_559.C("ք֋կլջջււճցֆի", (byte)122, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_503.b[0] = NLoginCore_559.B("ƴƟǂƧǭƽǞưǅǲƱǟƪǂƸǓǴǍǌǬƸǯǆǇ", (byte)122, 66);
                    NLoginCore_503.b[1] = NLoginCore_384.D("֘՘ֆ՗Ւթ֓֡տֆաե֥մաիյվֈէ֛չնշ", (byte)122, 68);
                    NLoginCore_503.b[2] = NLoginCore_027.A("ǕǈǟǏƭƿǎǳǢǯǎǲǮǅƷƵǗǝǛǭǴǉǆǇ", (byte)122, 65);
                    NLoginCore_503.b[3] = NLoginCore_451.E("֎֦֙ժ֨ժ֌րֲ֑֚չ֥֛֪յֻտ֒֐־֌։֊", (byte)122, 69);
                    NLoginCore_503.b[4] = NLoginCore_091.D("՛կժո֓խիղ֘֐ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱֱֳּׁ֣֛֣֯֩֡׃ֻׄ֋", (byte)122, 68);
                    NLoginCore_503.b[5] = NLoginCore_173.C("կծ֞ֈկխ՟ծ՝սղ՝մր֨գ֖֗֙ըְ֟նշ", (byte)122, 67);
                    NLoginCore_503.b[6] = NLoginCore_559.D("հ֊ըճց֢ոՠ֍ցւի", (byte)122, 68);
                    NLoginCore_503.b[7] = NLoginCore_384.F("ժ֊րց֫֎ւ֨։ֈո֣֬պչֲ֩֏֞֒֝ց֐֓׃ֻ׀ֆ֣֔֝׆ְֱָׇֻ֥֪דְְׇֺֽׁ֣֥֔֞֗וֻ֭֬פְֱפֹׅ֧֨ץ", (byte)122, 70);
                    NLoginCore_503.b[8] = NLoginCore_223.F("ելջլֆփ֒֗֓հ։վ", (byte)122, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_503.b[0] = NLoginCore_173.F("ջջ֋֪֛֍֊֦֗ք֫ճֈոֱ֪֔֩֠֌ֲ֜։֊", (byte)122, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_503.b[0] = NLoginCore_453.E("պְգ֒ժֆ֔մւղ֊ֱ֤շ֮֫֟ղցֲ֚֠։֊", (byte)122, 69);
                }
            }
        }
    }

    public NLoginCore_503(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_503.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_503.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, new String[k]);
    }

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.A, new Object[l]);
            return;
        }
        if (stringArray.length != m) {
            Object[] objectArray = new Object[n];
            objectArray[NLoginCore_503.o] = (String)NLoginCore_503.c("㺀", (int)(p & q), (long)r) + this.e().toLowerCase(Locale.ENGLISH) + (String)NLoginCore_503.c("㺃", (int)s, (long)(t ^ u));
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(stringArray[v]);
        if (NLoginCore_277 == null) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.u, new Object[w]);
            return;
        }
        NLoginCore_187 NLoginCore_1872 = this.a.com_nickuc_login_NLoginCore_187_a();
        NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!ForceRegisterConfig2.boolean_h()) {
            Object[] objectArray = new Object[x];
            objectArray[NLoginCore_503.y] = NLoginCore_277.getName();
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, objectArray);
            return;
        }
        if (NLoginCore_1872.boolean_b(NLoginCore_277)) {
            Object[] objectArray = new Object[z];
            objectArray[NLoginCore_503.aa] = NLoginCore_277.getName();
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.F, objectArray);
            return;
        }
        this.a.com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, ab != 0, ac != 0);
        String string = ForceRegisterConfig2.i();
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_503.c("㺆", (int)ad, (long)ae) + string + (String)NLoginCore_503.c("㺉", (int)(af & ag), (long)ah), new Object[ai]);
        NLoginCore_370.b((String)NLoginCore_503.c("㺌", (int)aj, (long)ak) + string + (String)NLoginCore_503.c("㺏", (int)al, (long)am) + NLoginInterface_0422.getName() + (String)NLoginCore_503.c("㺒", (int)an, (long)ao), new Object[ap]);
    }
}

