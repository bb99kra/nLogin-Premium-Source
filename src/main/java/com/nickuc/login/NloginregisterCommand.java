/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
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
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginregisterCommand
extends NLoginCore_353 {
    private static int az;
    private static int m;
    private static int ad;
    private static int w;
    private static long ba;
    private static long ah;
    private static int i;
    private static int v;
    private static int s;
    private static int ai;
    private static int as;
    private static int y;
    private static long ao;
    private static int af;
    private static long bf;
    private static long ae;
    private static int x;
    private static int au;
    private static int be;
    private static int ay;
    private static long bc;
    private static int aq;
    private static int j;
    private static long h;
    private static long bd;
    private static int l;
    private static int an;
    private static int aa;
    private static int bi;
    private static int am;
    private static long var_long_c;
    private static int av;
    private static int bh;
    private static int ab;
    private static int k;
    private static long d;
    private static int r;
    private static int bb;
    private static int f;
    private static int ar;
    private static String[] a;
    private static int u;
    private static String[] b;
    private static int n;
    private static long ax;
    private static int ag;
    private static long bg;
    private static int ac;
    private static int var_int_c;
    private static int z;
    private static int o;
    private static long g;
    private static long e;
    private static long t;
    private static int bj;
    private static long aw;
    private static long ap;
    private static int ak;
    private static long at;
    private static long q;
    private static long al;
    private static int aj;
    private static long p;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NloginregisterCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.B("đĳĵĕĹŘŐŦŒġşŕţŝĦŋŭŬŤŪŤĹ", (byte)53, 66), NloginregisterCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғࠝ࠮ࠐࠈ࠱߾ࠋ࠲ࠣࠠ࠵࠹࠰Ҭ", (byte)53, 68) + string + NLoginCore_387.C("Ҏ", (byte)53, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 4L;
        l ^= 0xE0A4B41C8632189EL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(5 + 64), (byte)(12 + 71), (byte)(46 + 1), 67, (byte)(10 + 56), (byte)(28 + 39), (byte)(23 + 24), (byte)(70 + 10), (byte)(69 + 6), (byte)(43 + 24), (byte)(81 + 2), 53, (byte)(79 + 1), (byte)(67 + 30), (byte)(78 + 22), (byte)(25 + 75), (byte)(12 + 93), (byte)(10 + 100), (byte)(69 + 34)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.B("ǘǥǤƧǧǣǞǧǲǡƮǬǰǩǬǲƴԾՏԱԩՒԟԬՓՄՁՖ՚Ց", (byte)123, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NloginregisterCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Long.reverse(1789685074954856859L);
        e = Long.reverse(0x2000000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(1789685074954856859L);
        h = Long.reverse(0x2000000000000000L);
        i = (0 >>> 16 | 0 << ~16 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = 0 >>> 4 | 0 << ~4 + 1;
        l = Integer.reverse(-1073741824);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(1789685074954856859L);
        q = Long.reverse(0x2000000000000000L);
        r = Integer.reverse(-1073741824);
        s = Integer.reverse(-1);
        t = Long.reverse(4095528084168550811L);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 0x400000 >>> 86 | 0x400000 << ~86 + 1;
        x = (0 >>> 85 | 0 << ~85 + 1) & 0xFFFFFFFF;
        y = 1 >>> 63 | 1 << ~63 + 1;
        z = Integer.reverse(0);
        aa = 0 >>> 85 | 0 << -85;
        ab = Integer.reverse(0);
        ac = 0x40000000 >>> 220 | 0x40000000 << ~220 + 1;
        ad = Integer.reverse(-1);
        ae = Long.reverse(4095528084168550811L);
        af = 10240 >>> 139 | 10240 << ~139 + 1;
        ag = (-1 >>> 249 | -1 << -249) & 0xFFFFFFFF;
        ah = Long.reverse(4095528084168550811L);
        ai = (0 >>> 86 | 0 << ~86 + 1) & 0xFFFFFFFF;
        aj = 24 >>> 194 | 24 << ~194 + 1;
        ak = -1 >>> 191 | -1 << -191;
        al = Long.reverse(4095528084168550811L);
        am = Integer.reverse(0);
        an = 0x38000000 >>> 155 | 0x38000000 << ~155 + 1;
        ao = Long.reverse(1789685074954856859L);
        ap = Long.reverse(0x2000000000000000L);
        aq = (524288 >>> 114 | 524288 << -114) & 0xFFFFFFFF;
        ar = Integer.reverse(0x10000000);
        as = (-1 >>> 216 | -1 << ~216 + 1) & 0xFFFFFFFF;
        at = Long.reverse(4095528084168550811L);
        au = 0 >>> 71 | 0 << -71;
        av = (36 >>> 66 | 36 << -66) & 0xFFFFFFFF;
        aw = Long.reverse(1789685074954856859L);
        ax = Long.reverse(0x2000000000000000L);
        ay = 40 >>> 66 | 40 << ~66 + 1;
        az = -1 >>> 69 | -1 << ~69 + 1;
        ba = Long.reverse(4095528084168550811L);
        bb = Integer.reverse(-805306368);
        bc = Long.reverse(1789685074954856859L);
        bd = Long.reverse(0x2000000000000000L);
        be = (96 >>> 35 | 96 << -35) & 0xFFFFFFFF;
        bf = Long.reverse(1789685074954856859L);
        bg = Long.reverse(0x2000000000000000L);
        bh = (0 >>> 32 | 0 << ~32 + 1) & 0xFFFFFFFF;
        bi = Integer.reverse(-1342177280);
        bj = Integer.reverse(-1342177280);
        a = new String[bi];
        b = new String[bj];
        NloginregisterCommand.void_b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (stringArray.length != l) {
            Object[] objectArray = new Object[m];
            objectArray[NloginregisterCommand.n] = (String)NloginregisterCommand.c("㺀", (int)o, (long)(p ^ q)) + this.e().toLowerCase(Locale.ENGLISH) + (String)NloginregisterCommand.c("㺃", (int)(r & s), (long)t);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        ForceRegisterConfig ForceRegisterConfig2 = this.a.com_nickuc_login_NLoginCore_291_a().a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, stringArray[u], v != 0);
        if (ForceRegisterConfig2 == null) {
            return;
        }
        if (ForceRegisterConfig2.s()) {
            Object[] objectArray = new Object[w];
            objectArray[NloginregisterCommand.x] = ForceRegisterConfig2.i();
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.H, objectArray);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        String string = stringArray[y];
        if (string.length() <= NLoginCore_532.T.r()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.L, new Object[z]);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        if (string.length() >= NLoginCore_532.U.r()) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.K, new Object[aa]);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(ForceRegisterConfig2.i());
        String string2 = ForceRegisterConfig2.i();
        String string3 = null;
        if (NLoginCore_277 != null) {
            string3 = NLoginCore_277.ac();
        }
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (!this.a.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, string2, string, null, string3)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[ab]);
                return;
            }
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginregisterCommand.c("㺆", (int)(ac & ad), (long)ae) + string2 + (String)NloginregisterCommand.c("㺉", (int)(af & ag), (long)ah), new Object[ai]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginregisterCommand.c("㺌", (int)(aj & ak), (long)al), new Object[am]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NloginregisterCommand.c("㺏", (int)an, (long)(ao ^ ap)) + NLoginCore_2702.a(TimeUnit.MILLISECONDS, aq) + (String)NloginregisterCommand.c("㺒", (int)(ar & as), (long)at), new Object[au]);
            NLoginCore_370.b((String)NloginregisterCommand.c("㺕", (int)av, (long)(aw ^ ax)) + string2 + (String)NloginregisterCommand.c("㺘", (int)(ay & az), (long)ba) + (Object)((Object)ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a()) + (String)NloginregisterCommand.c("㺛", (int)bb, (long)(bc ^ bd)) + NLoginInterface_0422.getName() + (String)NloginregisterCommand.c("㺞", (int)be, (long)(bf ^ bg)), new Object[bh]);
        }
    }

    private static void void_b() {
        int n;
        var_long_c = -2768305228108502248L;
        long l = var_long_c ^ 0xE0A4B41C8632189EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(51 + 18), (byte)(34 + 49), (byte)(16 + 31), (byte)(40 + 27), (byte)(21 + 45), (byte)(18 + 49), (byte)(10 + 37), (byte)(30 + 50), (byte)(32 + 43), (byte)(36 + 31), 83, (byte)(33 + 20), (byte)(31 + 49), (byte)(8 + 89), (byte)(15 + 85), (byte)(24 + 76), (byte)(21 + 84), (byte)(95 + 15), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, 83}, StandardCharsets.UTF_8));
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
                    NloginregisterCommand.b[0] = NLoginCore_384.D("ԟԜԟԮԲՓ՚աՆ՜ՉթէՈՀհՉՙ՝եՌԽԺԻ", (byte)102, 68);
                    NloginregisterCommand.b[1] = NLoginCore_559.B("ǁƜƸƆƓƃƚǌƉƉƌǍƎǀǇǎƔǁƍƳƶǃƵƭƙǇƘƕǚǛǂƵƴǘǇǄƦǟƵƷǈǧǘƳ", (byte)102, 66);
                    NloginregisterCommand.b[2] = NLoginCore_324.B("ƤƤƾƛƷƢƚƨƛƚǄǐǆƩƉǅƣƋƧƧǌƱƞƟ", (byte)102, 66);
                    NloginregisterCommand.b[3] = NLoginCore_446.C("ԽԻՖդԟԭԳԹՕՖԤԶԪՊԨԯ՝ՠեՏ՞Ց՗ծնՔլյ՛ԶՎՈ", (byte)102, 67);
                    NloginregisterCommand.b[4] = NLoginCore_575.E("֛֛֑խ՜֙ւն՞փմ֧֔ֆ֦֓֩֬֕֟֐պօ֑֮ճֳֶ֝֌ְ֎֖շּּշ֛֤֭֟֍ׄ׆և֑֔֨־֛֬֞֊ֽ֞֝֞׌ַׄ֕֊ֲ֫֙ב֏ֻ֞מֲָ֮ךף֪", (byte)102, 69);
                    NloginregisterCommand.b[5] = NLoginCore_446.D("՞՘ԾԽԬբդՕԾՕդԯ", (byte)102, 68);
                    NloginregisterCommand.b[6] = NLoginCore_201.B("ƹƚǆƾžƙƚƿơƼǄƓ", (byte)102, 66);
                    NloginregisterCommand.b[7] = NLoginCore_559.C("ԷԸ՗ԡԜՔՃգԷՔ՗ՔդՈթԻԹԼՍբՄծյՉԪԵըհԶջՌ՝ջւղՑմչ՟եՒՀռՏ", (byte)102, 67);
                    NloginregisterCommand.b[8] = NLoginCore_427.B("ŽǆƙưƣƷƝƁƤƠƍƓ", (byte)102, 66);
                    NloginregisterCommand.b[9] = NLoginCore_110.F("ՙիղչ֑֓մ֣֣խդժ", (byte)102, 70);
                    NloginregisterCommand.b[10] = NLoginCore_559.C("԰Գ՚ԻԽ՝՚ԤՅԱե՝Պ՝ԹԿՅԮըՀ՜ճԺԻ", (byte)102, 67);
                    NloginregisterCommand.b[11] = NLoginCore_575.B("ƽƀƧƴƙƅǈƕǅƼǆǊǂƞƑƏǑǏƿƿƴƒƸǐƱƔƯǎƛǓǍǠ", (byte)102, 66);
                    NloginregisterCommand.b[12] = NLoginCore_223.E("քձզ։֕՛՛֘֡՜խժ", (byte)102, 69);
                    continue block7;
                }
                case 1: {
                    NloginregisterCommand.b[0] = NLoginCore_451.D("ԟԜԟԮԲՓ՚աՆ՜Ո՝ՖԿՌՠԾ԰զԱՔԽԺԻ", (byte)102, 68);
                    NloginregisterCommand.b[1] = NLoginCore_427.B("ǁƜƸƆƓƃƚǌƉƉƌǍƎǀǇǎƔǁƍƳƶǃƵƭƙǇƘƕǚǛǂƵǃƲǚǖǗǜǇǁƫǡƿǢƼƬƾǥǯưǍǗǍǧƾƿ", (byte)102, 66);
                    NloginregisterCommand.b[2] = NLoginCore_324.B("ƤƤƾƛƷƢƚƨƛƚǄƁƭƬƢǔƆǄǄƠǕǗƞƟ", (byte)102, 66);
                    NloginregisterCommand.b[3] = NLoginCore_092.D("ԽԻՖդԟԭԳԹՕՖԤԶԪՊԨԯ՝ՠեՏ՞՝էՍ՘ղԺԲԴԺ՗ՠ", (byte)102, 68);
                    NloginregisterCommand.b[4] = NLoginCore_427.E("֛֛֑խ՜֙ւն՞փմ֧֔ֆ֦֓֩֬֕֟֐պօ֑֮ճֳֶ֝֌ְ֎֖շּּշ֛֤֭֟֍ׄ׆և֑֔֨־֛֬֞֊ֽ֞֝֞׌ַׄ֕֊ֲ֫׃בֲֽ֛סֿ֙נַי׃֙׈֤ׄד׊׈לׂ׮ֵֶ", (byte)102, 69);
                    NloginregisterCommand.b[5] = NLoginCore_076.A("ƒſƲƝƓǂǃƉƔƆƼƓ", (byte)102, 65);
                    NloginregisterCommand.b[6] = NLoginCore_223.D("Ԝԗ՘ԢԟԳաՃ՗ԤՆԯ", (byte)102, 68);
                    NloginregisterCommand.b[7] = NLoginCore_223.D("ԷԸ՗ԡԜՔՃգԷՔ՗ՔդՈթԻԹԼՍբՄծյՉԪԵըհԶջՌ՝ահՀաՓ՗ցՑօք՚֊Ջխգ֊ֈ֏՞եՑ՝՚՛", (byte)102, 68);
                    NloginregisterCommand.b[8] = NLoginCore_559.C("ՔՂԲՏդԺՆԿԦՅզաԫԩՁՊԢՏՁկՃճԺԻ", (byte)102, 67);
                    NloginregisterCommand.b[9] = NLoginCore_138.D("ՑՊ՝ՂՀԞՅԵԼԨԶԯ", (byte)102, 68);
                    NloginregisterCommand.b[10] = NLoginCore_384.B("ƔƗƾƟơǁƾƈƩƕǊƪƟƜƍƛǄƑƞƫǘǇƞƟ", (byte)102, 66);
                    NloginregisterCommand.b[11] = NLoginCore_138.F("֔՗վ֋հ՜֟լ֜֓֝֡֙յըզ֦֖֖֨֋կռֱ֊ֱֵֶָֽ֤֝֠֗֡֙֯֎֖֋ռ֣֥֊", (byte)102, 70);
                    NloginregisterCommand.b[12] = NLoginCore_223.B("ƗƐƺƤƸǁǈƪƔƇƸƓ", (byte)102, 66);
                    continue block7;
                }
                case 2: {
                    NloginregisterCommand.b[0] = NLoginCore_004.C("ԠԹԴգՑԻՒ՘ԧԶԠԶՉԭՂ՞Ճ՞ԪըՇճԺԻ", (byte)102, 67);
                    continue block7;
                }
                case 4: {
                    NloginregisterCommand.b[0] = NLoginCore_173.A("ƏƕƲƵǅƛƛƠƟƝǋƿǏƟƟƏƞǁǉǖƱƴƢƓǇƚƘƚƷƩƶơ", (byte)102, 65);
                }
            }
        }
    }

    public NloginregisterCommand(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NloginregisterCommand.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NloginregisterCommand.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, new String[k]);
    }
}

