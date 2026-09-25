/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
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
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NlogindeleteCommand
extends NLoginCore_353 {
    private static long p;
    private static int at;
    private static int ah;
    private static int j;
    private static long ax;
    private static long e;
    private static int q;
    private static int v;
    private static int bb;
    private static long ay;
    private static long ag;
    private static int k;
    private static int u;
    private static int l;
    private static int an;
    private static float w;
    private static int t;
    private static long h;
    private static int var_int_c;
    private static long var_long_c;
    private static long au;
    private static int y;
    private static int i;
    private static int ai;
    private static long ao;
    private static String[] a;
    private static int al;
    private static long ak;
    private static String[] b;
    private static long g;
    private static long ad;
    private static int ap;
    private static int af;
    private static int o;
    private static long ar;
    private static int ac;
    private static long as;
    private static int aw;
    private static int aq;
    private static int am;
    private static int n;
    private static int z;
    private static int ab;
    private static long r;
    private static long av;
    private static int ba;
    private static int ae;
    private static long aa;
    private static int az;
    private static int f;
    private static long aj;
    private static long s;
    private static int d;
    private static int m;
    private static float x;

    public NlogindeleteCommand(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NlogindeleteCommand.c("㺀", (int)(var_int_c & d), (long)e), (String)NlogindeleteCommand.c("㺃", (int)f, (long)(g ^ h)), i != 0, j != 0, new String[k]);
    }

    private static void void_b() {
        int n;
        var_long_c = -5459126873152785676L;
        long l = var_long_c ^ 0x8F090D3FC1D4C0EEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(26 + 43), (byte)(11 + 72), 47, (byte)(59 + 8), (byte)(62 + 4), (byte)(34 + 33), (byte)(22 + 25), (byte)(5 + 75), (byte)(4 + 71), (byte)(5 + 62), 83, (byte)(3 + 50), (byte)(17 + 63), (byte)(89 + 8), (byte)(52 + 48), (byte)(59 + 41), (byte)(66 + 39), (byte)(80 + 30), (byte)(31 + 72)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
                    NlogindeleteCommand.b[0] = NLoginCore_091.C("֊սՠվօՐծ՝֑֔֕՜", (byte)117, 67);
                    NlogindeleteCommand.b[1] = NLoginCore_091.B("ǑƯǓǤǖǢǧǡǨǪǃƻǩǞǈƻǮǏƴǭǳǴƲǋƲǰǯƻƼǬƼƳǸǬƼǖƸǳǓǥǦǅȂǑ", (byte)117, 66);
                    NlogindeleteCommand.b[2] = NLoginCore_138.D("ժֆտՠտղղգգժՕ֗օկմ֚ՙ՞ՙյծ֠էը", (byte)117, 68);
                    NlogindeleteCommand.b[3] = NLoginCore_384.D("դչ֊էՇ՛խ՟ևքՑւֈՖ֙Ւ֗՝և֡ճ֠էը", (byte)117, 68);
                    NlogindeleteCommand.b[4] = NLoginCore_091.B("ƳǔƜǢƘǕƹǗǩǥǔǍǘƼǑǧǇǪǣƾǈǂǈǸǇƶǑǍǘǻǛǰǐȄǑǐƼǨǳǵǀȁȆǮȃǡȐǢǯȎǑȖȊǿǏǕȚȓǚǙȇȟǛȠ", (byte)117, 66);
                    NlogindeleteCommand.b[5] = NLoginCore_324.E("էժթ֍֥ւ֋ֱ֢ր֐քֱִַֺ֣֣֭֭֫֟քօ", (byte)117, 69);
                    NlogindeleteCommand.b[6] = NLoginCore_451.D("փ՘֏ևՌ֏դսՒ֏՟՜", (byte)117, 68);
                    NlogindeleteCommand.b[7] = NLoginCore_004.A("ǣǃǌƮƴƠƼǝƨơǚƺǧƹǫǡǋǮǌǢǏƩƲǹǴǶǝǨǘǈƾǋǮȄǶƿƿǳǥȉǼǊǔǑ", (byte)117, 65);
                    NlogindeleteCommand.b[8] = NLoginCore_110.E("պ֤֚պ֜ւ֪֌֩սրչ", (byte)117, 69);
                    NlogindeleteCommand.b[9] = NLoginCore_451.F("ն֦ջ֊֥֍֥֊ֳ֟֞չ", (byte)117, 70);
                    NlogindeleteCommand.b[10] = NLoginCore_559.C("լփըՇ։տՋֈՋծ՗ճ֑֕՘ևՓստմխի՜ձ֤֚֘֟տպ֜֊ս֖խ֬վֲխֱֳ֞֨֙֫ճֲ֎ֹ֚֬֟֬֞ևֈ", (byte)117, 67);
                    NlogindeleteCommand.b[11] = NLoginCore_223.D("չոՠ՜քՉֈձօէէ՜", (byte)117, 68);
                    continue block7;
                }
                case 1: {
                    NlogindeleteCommand.b[0] = NLoginCore_076.C("֍ՙլ՜ՙժհեդօ֗֋Օփևձ֖՛՚֠֙ժէը", (byte)117, 67);
                    NlogindeleteCommand.b[1] = NLoginCore_223.D("ռ՚վ֏ց֍֒֌֓֕ծզ֔։ճզ֙պ՟֘֞֟՝ն՝֛֚զէ֗է՞փ֧֮ֆ֫և֥֦վַ֭ռ", (byte)117, 68);
                    NlogindeleteCommand.b[2] = NLoginCore_446.F("և֣֜ս֜֏֏րրևկցճַָ֖֛֯֘֐ֽ֫քօ", (byte)117, 70);
                    NlogindeleteCommand.b[3] = NLoginCore_110.E("ց֖֧քդո֊ռ֤֡ծֳֶ֪֯֫֙ղּ־ָ֭քօ", (byte)117, 69);
                    NlogindeleteCommand.b[4] = NLoginCore_223.F("ջ֜դ֪ՠ֝ցֱ֭֟֜֕֠ք֙֯֏ֲ֫ֆ֐֊֐׀֏վ֙֕֠׃ָ֣֘׌֙֘քְֻֽֈ׉׎ֶ׋֩טַ֪ז֙מג׀נִׁאִׅעמעֶע׋׫ׁף׉֨֯ר֯׀ֹ", (byte)117, 70);
                    NlogindeleteCommand.b[5] = NLoginCore_324.B("ƟƢơǅǝƺǃǩǚƸǉǘƸƸƼǝƫǆǉǈǴǡǫǗǛƴǺǞǇǝȀƹ", (byte)117, 66);
                    NlogindeleteCommand.b[6] = NLoginCore_201.D("ֆտ՚ֆևհէՍ֊է֕՜", (byte)117, 68);
                    NlogindeleteCommand.b[7] = NLoginCore_027.E("֫֋֔նռըք֥հթ֢ւ֯ցֳֶ֪֩֓֔֗ձպּׁ־ְ֥֠֐ֆ֓֒փֽ֥֚֚֏֢֑׃֞גׇ֧֑֭֒֨ב֕ךַ֤֥", (byte)117, 69);
                    NlogindeleteCommand.b[8] = NLoginCore_575.B("ƪƺǎǙƸǘƨǑƧƸǧƭǊƦǧǯǇǎǮǃǲǵƼƽ", (byte)117, 66);
                    NlogindeleteCommand.b[9] = NLoginCore_559.B("ǜƫƤǡǛǤǢƹơǂǞƱ", (byte)117, 66);
                    NlogindeleteCommand.b[10] = NLoginCore_004.A("ǁǘƽƜǞǔƠǝƠǃƬǈǪǦƭǜƨǒǔǉǂǀƱǆǭǴǹǯǔǏǱǟǒǫǂȁǓȇǂǳǽȆȆǌȏǷǫǦǋȔǴǯǪȅǜǝ", (byte)117, 65);
                    NlogindeleteCommand.b[11] = NLoginCore_027.F("ց֪֗զըլրէլ֢֝չ", (byte)117, 70);
                    continue block7;
                }
                case 2: {
                    NlogindeleteCommand.b[0] = NLoginCore_091.D("ՈՎֆՋ՝ղկբժ֔֍զՖօզ՛֊որհ֘֐էը", (byte)117, 68);
                    continue block7;
                }
                case 4: {
                    NlogindeleteCommand.b[0] = NLoginCore_201.B("ƯƷƶƤƳǗǝǔƜǥǁǃǥǠǍƺǎǑǟǢǭǱƸƳǕǴǚǶǱǳȁƽ", (byte)117, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x8F090D3FC1D4C0EEL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45), (byte)(45 + 2), (byte)(23 + 44), (byte)(45 + 21), (byte)(9 + 58), (byte)(30 + 17), (byte)(78 + 2), (byte)(71 + 4), (byte)(5 + 62), (byte)(32 + 51), (byte)(50 + 3), (byte)(48 + 32), (byte)(4 + 93), (byte)(36 + 64), (byte)(51 + 49), (byte)(103 + 2), (byte)(99 + 11), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(42 + 41)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.A("ŮŻźĽŽŹŴŽƈŷńƂƆſƂƈŊӖұӏӘӜӕӟӌӭӠӦӜ", (byte)70, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NlogindeleteCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NlogindeleteCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.A("űƓƕŵƙƸưǆƲƁƿƵǃƽƆƫǍǌǄǊǄƙ", (byte)101, 65), NlogindeleteCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.D("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢯࢊࢨࢱࢵࢮࢸࢥࣆࢹࢿࢵԻ", (byte)101, 68) + string + NLoginCore_223.F("՛", (byte)101, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        d = (-1 >>> 122 | -1 << -122) & 0xFFFFFFFF;
        e = Long.reverse(6579213328731782189L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(3408679191062953005L);
        h = Long.reverse(0x7400000000000000L);
        i = (1 >>> 224 | 1 << ~224 + 1) & 0xFFFFFFFF;
        j = (0x8000000 >>> 155 | 0x8000000 << ~155 + 1) & 0xFFFFFFFF;
        k = 0 >>> 185 | 0 << -185;
        l = Integer.reverse(0x40000000);
        m = 0x200000 >>> 181 | 0x200000 << ~181 + 1;
        n = Integer.reverse(0);
        o = (0x400000 >>> 181 | 0x400000 << ~181 + 1) & 0xFFFFFFFF;
        p = Long.reverse(6579213328731782189L);
        q = Integer.reverse(-1073741824);
        r = Long.reverse(3408679191062953005L);
        s = Long.reverse(0x7400000000000000L);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(0);
        v = (0 >>> 131 | 0 << ~131 + 1) & 0xFFFFFFFF;
        w = Float.intBitsToFloat(Integer.reverse(3714));
        x = Float.intBitsToFloat((1028 >>> 236 | 1028 << ~236 + 1) & 0xFFFFFFFF);
        y = 0x8000000 >>> 249 | 0x8000000 << -249;
        z = -1 >>> 204 | -1 << ~204 + 1;
        aa = Long.reverse(6579213328731782189L);
        ab = Integer.reverse(-1610612736);
        ac = (-1 >>> 239 | -1 << ~239 + 1) & 0xFFFFFFFF;
        ad = Long.reverse(6579213328731782189L);
        ae = (0 >>> 106 | 0 << ~106 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(0x60000000);
        ag = Long.reverse(6579213328731782189L);
        ah = Integer.reverse(0);
        ai = -1073741823 >>> 190 | -1073741823 << ~190 + 1;
        aj = Long.reverse(3408679191062953005L);
        ak = Long.reverse(0x7400000000000000L);
        al = Integer.reverse(0x40000000);
        am = Integer.reverse(0x10000000);
        an = Integer.reverse(-1);
        ao = Long.reverse(6579213328731782189L);
        ap = 0 >>> 10 | 0 << ~10 + 1;
        aq = 0x24000000 >>> 186 | 0x24000000 << -186;
        ar = Long.reverse(3408679191062953005L);
        as = Long.reverse(0x7400000000000000L);
        at = 1280 >>> 167 | 1280 << ~167 + 1;
        au = Long.reverse(3408679191062953005L);
        av = Long.reverse(0x7400000000000000L);
        aw = Integer.reverse(-805306368);
        ax = Long.reverse(3408679191062953005L);
        ay = Long.reverse(0x7400000000000000L);
        az = (0 >>> 228 | 0 << ~228 + 1) & 0xFFFFFFFF;
        ba = Integer.reverse(0x30000000);
        bb = 1536 >>> 199 | 1536 << ~199 + 1;
        a = new String[ba];
        b = new String[bb];
        NlogindeleteCommand.void_b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (stringArray.length != l) {
            Object[] objectArray = new Object[m];
            objectArray[NlogindeleteCommand.n] = (String)NlogindeleteCommand.c("㺀", (int)o, (long)p) + this.e() + (String)NlogindeleteCommand.c("㺃", (int)q, (long)(r ^ s));
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        String string = stringArray[t];
        NLoginCore_291 NLoginCore_2912 = this.a.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, string);
        if (ForceRegisterConfig2 == null) {
            return;
        }
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (!ForceRegisterConfig2.r()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[u]);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                return;
            }
            if (!NLoginCore_2912.b(ForceRegisterConfig2)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.w, new Object[v]);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                return;
            }
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, w, x);
            String string2 = ForceRegisterConfig2.i();
            NLoginCore_150.a(NLoginInterface_0422, (String)NlogindeleteCommand.c("㺆", (int)(y & z), (long)aa) + string2 + (String)NlogindeleteCommand.c("㺉", (int)(ab & ac), (long)ad), new Object[ae]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NlogindeleteCommand.c("㺌", (int)af, (long)ag), new Object[ah]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NlogindeleteCommand.c("㺏", (int)ai, (long)(aj ^ ak)) + NLoginCore_2702.a(TimeUnit.MILLISECONDS, al) + (String)NlogindeleteCommand.c("㺒", (int)(am & an), (long)ao), new Object[ap]);
            NLoginCore_370.b((String)NlogindeleteCommand.c("㺕", (int)aq, (long)(ar ^ as)) + string2 + (String)NlogindeleteCommand.c("㺘", (int)at, (long)(au ^ av)) + NLoginInterface_0422.getName() + (String)NlogindeleteCommand.c("㺛", (int)aw, (long)(ax ^ ay)), new Object[az]);
        }
    }
}

