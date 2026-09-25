/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_515;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
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

public class NLoginCore_296
extends NLoginCore_353 {
    private static long e;
    private static int h;
    private static int j;
    private static long r;
    private static long w;
    private static long m;
    private static long ab;
    private static long ae;
    private static int u;
    private static int p;
    private static long v;
    private static String[] a;
    private static int ai;
    private static int ac;
    private static int ah;
    private static int f;
    private static int q;
    private static long d;
    private static String[] b;
    private static long var_long_c;
    private static int z;
    private static int s;
    private static long g;
    private static int o;
    private static int var_int_c;
    private static long n;
    private static long ad;
    private static int y;
    private static int ag;
    private static int af;
    private static int i;
    private static int x;
    private static int k;
    private static int aa;
    private static int t;
    private static int l;

    public NLoginCore_296(NLoginType_008 NLoginType_008) {
        String[] stringArray = new String[j];
        stringArray[NLoginCore_296.k] = NLoginCore_296.c("㺆", (int)l, (long)(m ^ n));
        stringArray[NLoginCore_296.o] = NLoginCore_296.c("㺉", (int)(p & q), (long)r);
        super(NLoginType_008, (String)NLoginCore_296.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_296.c("㺃", (int)f, (long)g), h != 0, i != 0, stringArray);
    }

    private static String a(int n, long l) {
        l ^= 0x10L;
        l ^= 0x6AF796C0FCDEBAC5L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(47 + 22), (byte)(59 + 24), (byte)(29 + 18), (byte)(44 + 23), (byte)(64 + 2), (byte)(60 + 7), (byte)(33 + 14), (byte)(34 + 46), (byte)(65 + 10), (byte)(9 + 58), (byte)(67 + 16), (byte)(3 + 50), (byte)(60 + 20), 97, (byte)(37 + 63), (byte)(4 + 96), (byte)(38 + 67), (byte)(104 + 6), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(15 + 54), (byte)(11 + 72)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.D("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤ࡟࡮ࡲ࡮ࡍࡴࡐࡐࡺࡒࡠ", (byte)80, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_296.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    static {
        var_int_c = 0 >>> 68 | 0 << -68;
        d = Long.reverse(-7624270730134522792L);
        e = Long.reverse(0x800000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-7047809977831099304L);
        h = Integer.reverse(0);
        i = (0 >>> 252 | 0 << ~252 + 1) & 0xFFFFFFFF;
        j = (8192 >>> 140 | 8192 << ~140 + 1) & 0xFFFFFFFF;
        k = 0 >>> 185 | 0 << ~185 + 1;
        l = Integer.reverse(0x40000000);
        m = Long.reverse(-7624270730134522792L);
        n = Long.reverse(0x800000000000000L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Integer.reverse(-1073741824);
        q = (-1 >>> 9 | -1 << -9) & 0xFFFFFFFF;
        r = Long.reverse(-7047809977831099304L);
        s = 2 >>> 161 | 2 << ~161 + 1;
        t = Integer.reverse(Integer.MIN_VALUE);
        u = 16384 >>> 12 | 16384 << -12;
        v = Long.reverse(-7624270730134522792L);
        w = Long.reverse(0x800000000000000L);
        x = 2 >>> 1 | 2 << -1;
        y = 0 >>> 151 | 0 << -151;
        z = 640 >>> 103 | 640 << -103;
        aa = Integer.reverse(-1);
        ab = Long.reverse(-7047809977831099304L);
        ac = Integer.reverse(0x60000000);
        ad = Long.reverse(-7624270730134522792L);
        ae = Long.reverse(0x800000000000000L);
        af = 0 >>> 205 | 0 << ~205 + 1;
        ag = Integer.reverse(0);
        ah = 0x380000 >>> 51 | 0x380000 << -51;
        ai = (0xE00000 >>> 21 | 0xE00000 << ~21 + 1) & 0xFFFFFFFF;
        a = new String[ah];
        b = new String[ai];
        NLoginCore_296.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_296.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝՗ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_296.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.E("ՆՓՒԕՕՑՌՕՠՏԜ՚՞՗՚ՠԢ࢝ࢬࢰࢬࢋࢲࢎࢎࢸ࢐࢞Թ", (byte)39, 69) + string + NLoginCore_092.D("Ѥ", (byte)39, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        NLoginCore_515 NLoginCore_5152;
        int n = stringArray.length > s && stringArray[t].equalsIgnoreCase((String)NLoginCore_296.c("㺀", (int)u, (long)(v ^ w))) ? x : y;
        NLoginCore_515 NLoginCore_5153 = NLoginCore_5152 = n != 0 ? BCryptHashProvider.b((NLoginType_008)this.a) : BCryptHashProvider.a((NLoginType_008)this.a);
        if (!NLoginCore_5152.aQ()) {
            NLoginCore_150.a(NLoginInterface_0422, (String)(n != 0 ? NLoginCore_296.c("㺃", (int)(z & aa), (long)ab) : NLoginCore_296.c("㺆", (int)ac, (long)(ad ^ ae))), new Object[af]);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.p, new Object[ag]);
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C);
    }

    private static void void_b() {
        int n;
        var_long_c = 1886506047643094121L;
        long l = var_long_c ^ 0x6AF796C0FCDEBAC5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(33 + 36), (byte)(22 + 61), (byte)(13 + 34), (byte)(55 + 12), (byte)(13 + 53), (byte)(26 + 41), (byte)(3 + 44), (byte)(12 + 68), (byte)(14 + 61), (byte)(18 + 49), (byte)(18 + 65), (byte)(28 + 25), (byte)(60 + 20), 97, (byte)(49 + 51), (byte)(80 + 20), (byte)(22 + 83), (byte)(72 + 38), (byte)(27 + 76)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(44 + 25), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_296.b[0] = NLoginCore_427.C("ԃԑӯӔӞԔԂԒӕԔԆӡ", (byte)76, 67);
                    NLoginCore_296.b[1] = NLoginCore_201.F("րյվջկրյՇֆե֌ՔՆռՏիչ՞ը֐կք՛՜", (byte)76, 70);
                    NLoginCore_296.b[2] = NLoginCore_427.B("ōőƍšůƐůŶŹŏƈş", (byte)76, 66);
                    NLoginCore_296.b[3] = NLoginCore_138.A("ũƑƉůņŦŕŐœƕŢş", (byte)76, 65);
                    NLoginCore_296.b[4] = NLoginCore_427.C("ԁӟӌӯԎԑӐәӴӺӴӡ", (byte)76, 67);
                    NLoginCore_296.b[5] = NLoginCore_091.D("ӧӮӊԁԉӒӭӘԎӤӖӔӧԚӯԜӢӞԜԀԓӤӰԩԨԔӬԝԏԎԢԁԢӥԢԞӶԫӷԮԬԶԼӻԘԻԴԢԗԗԴԴԿԏԌԍ", (byte)76, 68);
                    NLoginCore_296.b[6] = NLoginCore_138.A("ťŬňſƇŐūŖƌŢŒųřƔűŭƊƝŶŝƃŴƇƄƉƞƫſźƮŻƨƑŪƀƦơŰƤƦƄŰƇƼƐƐƺƏŻƓƷƤǂƷơƁƇƂƹƓǉǎƗƹƯǂƱƼƭƵƟƉƷǈǋƤǇǞǙƸƵǂƵƮǜǕƜǨƺǞǈǢǨƼƤƷǥǃƩǉǈǞǩǩǍƷǖƿ", (byte)76, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_296.b[0] = NLoginCore_027.D("ԁԈԑԆӕԕӕӯӴԉԗӴԔӜӖӳԌԌԛԅԏԥӬӭ", (byte)76, 68);
                    NLoginCore_296.b[1] = NLoginCore_173.C("ԑԆԏԌԀԑԆӘԗӶԝӬԟӳӮԛәӟӾӯԎӯӬӭ", (byte)76, 67);
                    NLoginCore_296.b[2] = NLoginCore_110.A("ŎƎŦťŊŔŨŒƋŋŕş", (byte)76, 65);
                    NLoginCore_296.b[3] = NLoginCore_110.E("ՉսՁղՒփյբք՟ՂՐ", (byte)76, 69);
                    NLoginCore_296.b[4] = NLoginCore_091.F("ՎցփՑկոփՑՂյճեդՆրրֈհղի֊՞՛՜", (byte)76, 70);
                    NLoginCore_296.b[5] = NLoginCore_384.D("ӧӮӊԁԉӒӭӘԎӤӖӔӧԚӯԜӢӞԜԀԓӤӰԩԨԔӬԝԏԎԢԁԢӥԢԞӶԫӷԮԬԶԺӸԙԷԋԎԼӿԂԺԥԖ԰ՅԵԚԜՃԪԇԊԏ", (byte)76, 68);
                    NLoginCore_296.b[6] = NLoginCore_201.E("Ֆ՝ԹհոՁ՜ՇսՓՃդՊօբ՞ջ֎էՎմեոյպ֏֜հի֟լ֙ւ՛ձ֗֒ա֕֗յաո֭ցց֫րլքֳ֨֕֨֒ղոճ֪քֺֿֈֳ֪֢֦֭֠֞֐պָֹּ֨֕׏׊ֳ֦֦֩֟׍׆֍י֫׏ֹדיּ֭֕֨׋ז׀֣ן׃גר֡׆ףצץח׀ׇבֽהׇ״ֻּ", (byte)76, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_296.b[0] = NLoginCore_004.E("ՏՕբյտմ՝ֈՅ՚վտցխխօսր՟թֆՎ֌Պ֍֗֘֌Փտմ֜", (byte)76, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_296.b[0] = NLoginCore_559.B("ŽŏŰƆųŠŎťŪŔŤƏƕŹƝƠűŸƏźƁŽŪū", (byte)76, 66);
                }
            }
        }
    }
}

