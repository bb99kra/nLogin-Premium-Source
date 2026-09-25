/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginType_015;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginType_001;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_511
extends NLoginCore_447 {
    private static long be;
    private static long cc;
    private static long bs;
    private static int bo;
    private static int bb;
    private static int bu;
    private static long bd;
    private static int cl;
    private static long bz;
    private static String[] f;
    private static int by;
    private static long bw;
    private static long al;
    private static long an;
    private static int ae;
    private static long cj;
    private static int br;
    private static long g;
    private static int cf;
    private static int ci;
    private static String[] e;
    private static long cg;
    private static long ch;
    private static int co;

    @Override
    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)cf, (long)(cg ^ ch)));
    }

    static {
        ae = Integer.reverse(0);
        al = Long.reverse(5558595567228430106L);
        an = Long.reverse(-2161727821137838080L);
        bb = (0x4000000 >>> 250 | 0x4000000 << ~250 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(5558595567228430106L);
        be = Long.reverse(-2161727821137838080L);
        bo = Integer.reverse(0x40000000);
        br = Integer.reverse(-1);
        bs = Long.reverse(-5826504290764183782L);
        bu = (0x180000 >>> 83 | 0x180000 << -83) & 0xFFFFFFFF;
        bw = Long.reverse(-5826504290764183782L);
        by = Integer.reverse(0x20000000);
        bz = Long.reverse(5558595567228430106L);
        cc = Long.reverse(-2161727821137838080L);
        cf = Integer.reverse(-1610612736);
        cg = Long.reverse(5558595567228430106L);
        ch = Long.reverse(-2161727821137838080L);
        ci = Integer.reverse(0x60000000);
        cj = Long.reverse(-5826504290764183782L);
        cl = 0x70000000 >>> 124 | 0x70000000 << -124;
        co = Integer.reverse(-536870912);
        e = new String[cl];
        f = new String[co];
        NLoginCore_511.b();
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)by, (long)(bz ^ cc)));
    }

    private static String a(int n, long l) {
        l ^= 0x47L;
        l ^= 0x6FE6133258DE82FFL;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(20 + 49), (byte)(19 + 64), (byte)(26 + 21), (byte)(12 + 55), (byte)(29 + 37), (byte)(42 + 25), (byte)(26 + 21), (byte)(52 + 28), (byte)(38 + 37), (byte)(44 + 23), (byte)(65 + 18), 53, (byte)(38 + 42), (byte)(20 + 77), (byte)(58 + 42), (byte)(94 + 6), (byte)(103 + 2), (byte)(8 + 102), (byte)(46 + 57)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.E("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢧࢯࢲࢤࢳࢰࢴࢬ", (byte)34, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_511.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    @Override
    public NLoginType_015 com_nickuc_login_NLoginType_015_a() {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)ae, (long)(al ^ an)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_511.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.D("кќўоѢҁѹҏѻъ҈ѾҌ҆яѴҖҕҍғҍѢ", (byte)31, 68), NLoginCore_511.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.B("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҆Ҏґ҃ҒҏғҋĐ", (byte)31, 66) + string + NLoginCore_324.A("÷", (byte)31, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, @Nullable String string2, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)bu, (long)bw));
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)(bo & br), (long)bs));
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)ci, (long)cj));
    }

    public NLoginCore_511(nLoginBukkit nLoginBukkit2) {
        super(nLoginBukkit2);
    }

    @Override
    public NLoginType_001 com_nickuc_login_NLoginType_001_a() {
        throw new UnsupportedOperationException((String)NLoginCore_511.c("㺀", (int)bb, (long)(bd ^ be)));
    }

    private static void b() {
        int n;
        g = 6405364820196467890L;
        long l = g ^ 0x6FE6133258DE82FFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(39 + 30), 83, (byte)(3 + 44), (byte)(63 + 4), (byte)(63 + 3), (byte)(42 + 25), (byte)(33 + 14), (byte)(70 + 10), (byte)(72 + 3), (byte)(37 + 30), (byte)(5 + 78), (byte)(28 + 25), (byte)(52 + 28), (byte)(91 + 6), (byte)(47 + 53), (byte)(57 + 43), (byte)(94 + 11), (byte)(107 + 3), (byte)(24 + 79)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_511.f[0] = NLoginCore_004.B("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǪǀǴǠǫƱǱǰƵǷǩǀǁ", (byte)103, 66);
                    NLoginCore_511.f[1] = NLoginCore_223.C("ԼեեՆՀըբԨբ՗ՖԮ՜զԯԻճ՝ԧԾԯնՒճ՗՛զՇՇՙ՜պԿՌծօէԿն՞շ֋զև՝֑սֈՎ֎֍Ւ֔ֆ՝՞", (byte)103, 67);
                    NLoginCore_511.f[2] = NLoginCore_004.E("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖׊ֶׁևׇ׆֋׍ֿ֖֗", (byte)103, 69);
                    NLoginCore_511.f[3] = NLoginCore_451.A("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǪǀǴǠǫƱǱǰƵǷǩǀǁ", (byte)103, 65);
                    NLoginCore_511.f[4] = NLoginCore_004.E("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖׊ֶׁևׇ׆֋׍ֿ֖֗", (byte)103, 69);
                    NLoginCore_511.f[5] = NLoginCore_384.C("ԼեեՆՀըբԨբ՗ՖԮ՜զԯԻճ՝ԧԾԯնՒճ՗՛զՇՇՙ՜պԿՌծօէԿն՞շ֋զև՝֑սֈՎ֎֍Ւ֔ֆ՝՞", (byte)103, 67);
                    NLoginCore_511.f[6] = NLoginCore_384.F("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖׊ֶׁևׇ׆֋׍ֿ֖֗", (byte)103, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_511.f[0] = NLoginCore_138.E("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֞֓־ք֕֬վ֛ֈ֢֖֮֩֗", (byte)103, 69);
                    NLoginCore_511.f[1] = NLoginCore_091.A("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǧǓưǬǩǱǋǑǗƳǓǀǁ", (byte)103, 65);
                    NLoginCore_511.f[2] = NLoginCore_559.F("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְָֺׂ֯֗ׄ֠րֻ֤֤׀ֺ֧֖֩֗", (byte)103, 70);
                    NLoginCore_511.f[3] = NLoginCore_027.D("ԼեեՆՀըբԨբ՗ՖԮ՜զԯԻճ՝ԧԾԯնՒճ՗՛զՇՇՙ՜պԿՌծօէԿն՞շ֋զսՅ։րէՒ֋կտՑՠ՝՞", (byte)103, 68);
                    NLoginCore_511.f[4] = NLoginCore_027.B("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǋưƾǴǪƱǩǈǈƵǆǓǀǁ", (byte)103, 66);
                    NLoginCore_511.f[5] = NLoginCore_004.F("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְׁ֯֗ׄ֟վ֦֣֜օּ֥֖֫֬֙֗", (byte)103, 70);
                    NLoginCore_511.f[6] = NLoginCore_384.F("յ֞֞տչ֛֡ա֛֐֏է֕֟ըմ֖֬ՠշը֯֋֬֐֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֞׀ր֢֓׃ׅ׀֦֦בֿ֖֗", (byte)103, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_511.f[0] = NLoginCore_201.A("ƢƜǅſƢƘƔƜƀƣƦƦưǋǎǁǅƏǕƴǅƣƠơ", (byte)103, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_511.f[0] = NLoginCore_091.D("ԡԸդդ՞ԾԳե՜ԤՄԫբէՆթգԪԵլոՐԽԾ", (byte)103, 68);
                }
            }
        }
    }
}

