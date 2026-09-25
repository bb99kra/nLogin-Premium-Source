/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.PBKDF2HashProvider;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_497
extends PBKDF2HashProvider
implements NLoginInterface_037 {
    private static long as;
    private static int f;
    private static int al;
    private static int ai;
    private static int v;
    private static int ag;
    private static int ak;
    private static int ad;
    private static final char[] var_char_arr_e;
    private static int p;
    private static int ah;
    private static int ao;
    private static long at;
    private static int k;
    private static long h;
    private static int n;
    private static long ae;
    private static long aq;
    private static String[] c;
    private static String[] d;
    private static int am;
    private static final int aC;
    private static int ar;
    private static int s;
    private static int w;
    private static int aj;
    private static int an;
    private static int i;
    private static int q;
    private static final String ct;
    private static long af;
    private static long ap;
    private static int g;
    private static long var_long_e;

    private static String a(int n, long l) {
        l ^= 0x1CL;
        l ^= 0x7D21C4E79C26A68CL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(10 + 59), 83, (byte)(15 + 32), (byte)(18 + 49), (byte)(64 + 2), (byte)(11 + 56), (byte)(20 + 27), (byte)(54 + 26), (byte)(26 + 49), (byte)(43 + 24), (byte)(11 + 72), (byte)(28 + 25), (byte)(59 + 21), (byte)(76 + 21), (byte)(97 + 3), (byte)(28 + 72), (byte)(70 + 35), (byte)(19 + 91), (byte)(86 + 17)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.F("օ֑֒Ք֔֐֋֔֟֎՛֖֙֝֙֟աࣹࣩࣹ࣬ࣽ࣡ࣸࣚऄࣰ࣏ࣳࣽ", (byte)102, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_497.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    static {
        f = (0 >>> 193 | 0 << -193) & 0xFFFFFFFF;
        g = -1 >>> 155 | -1 << -155;
        h = Long.reverse(4087061951503473188L);
        i = Integer.reverse(0x20000000);
        k = 0 >>> 95 | 0 << ~95 + 1;
        n = (8 >>> 227 | 8 << ~227 + 1) & 0xFFFFFFFF;
        p = (1 >>> 127 | 1 << -127) & 0xFFFFFFFF;
        q = Integer.reverse(-1073741824);
        s = (0 >>> 210 | 0 << ~210 + 1) & 0xFFFFFFFF;
        v = (0x200000 >>> 205 | 0x200000 << -205) & 0xFFFFFFFF;
        w = (0 >>> 2 | 0 << -2) & 0xFFFFFFFF;
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = Long.reverse(51836685379508772L);
        af = Long.reverse(0x3800000000000000L);
        ag = Integer.reverse(0x200000);
        ah = 0 >>> 126 | 0 << -126;
        ai = 0 >>> 34 | 0 << -34;
        aj = 2048 >>> 235 | 2048 << ~235 + 1;
        ak = Integer.reverse(0);
        al = Integer.reverse(0x20000000);
        am = Integer.reverse(0x20000000);
        an = Integer.reverse(0x200000);
        ao = Integer.reverse(0x40000000);
        ap = Long.reverse(51836685379508772L);
        aq = Long.reverse(0x3800000000000000L);
        ar = Integer.reverse(-1073741824);
        as = Long.reverse(51836685379508772L);
        at = Long.reverse(0x3800000000000000L);
        c = new String[al];
        d = new String[am];
        NLoginCore_497.b();
        aC = an;
        ct = NLoginCore_497.c("㺀", (int)ao, (long)(ap ^ aq));
        var_char_arr_e = ((String)NLoginCore_497.c("㺃", (int)ar, (long)(as ^ at))).toCharArray();
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray = string2.split((String)NLoginCore_497.c("㺀", (int)(f & g), (long)h));
        if (stringArray.length != i) {
            return k != 0;
        }
        int n = NLoginCore_497.n << Integer.parseInt(stringArray[p]);
        byte[] byArray = Base64.getUrlDecoder().decode(stringArray[q]);
        byte[] byArray2 = Arrays.copyOfRange(byArray, s, v);
        char[] cArray = var_char_arr_e;
        int n2 = cArray.length;
        for (int i = w; i < n2; ++i) {
            char c = cArray[i];
            byte[] byArray3 = NLoginCore_497.a((String)NLoginCore_497.c("㺃", (int)ad, (long)(ae ^ af)), (string + c).toCharArray(), byArray2, n, ag);
            int n3 = ah;
            for (int j = ai; j < byArray3.length; ++j) {
                n3 |= byArray[byArray2.length + j] ^ byArray3[j];
            }
            if (n3 != 0) continue;
            return aj != 0;
        }
        return ak != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_497.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.C("ѶҘҚѺҞҽҵӋҷ҆ӄҺӈӂҋҰӒӑӉӏӉҞ", (byte)51, 67), NLoginCore_497.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ňŕŔėŗœŎŗŢőĞŜŠřŜŢĤҼҬүӀҼҤһҝӇҒҳҶӀĽ", (byte)51, 65) + string + NLoginCore_384.F("ԩ", (byte)51, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_e = 2618990840207645952L;
        long l = var_long_e ^ 0x7D21C4E79C26A68CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(31 + 38), (byte)(59 + 24), 47, (byte)(63 + 4), 66, (byte)(5 + 62), (byte)(45 + 2), (byte)(58 + 22), (byte)(14 + 61), (byte)(2 + 65), (byte)(46 + 37), (byte)(35 + 18), (byte)(28 + 52), (byte)(83 + 14), (byte)(58 + 42), (byte)(65 + 35), (byte)(46 + 59), (byte)(94 + 16), (byte)(34 + 69)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_497.d[0] = NLoginCore_027.F("՜Նԗ՗ԼԼՋԹգ՜Նԫ", (byte)39, 70);
                    NLoginCore_497.d[1] = NLoginCore_027.E("Էԯԗ՗Չ՗ՍԱԛ՚ՕԥԱԺԦՖԞՃԶհՌ՟ԶԷ", (byte)39, 69);
                    NLoginCore_497.d[2] = NLoginCore_324.A("ġęāŁĳŁķěąńĿďěĤĐŀĈĭĠŚĶŉĠġ", (byte)39, 65);
                    NLoginCore_497.d[3] = NLoginCore_324.F("՛ԓԨՉԗԙԴԺՒԯէՕ՛Լթ՝ՆծԭԹ՜ՍԨԲդԾՐՔՊձՑջմԻՌջռԻՕփպՖՙչգբրՓդպ֎ՠվցբջ֕ՔՍՉՕ֑ՔՒ֕֞շ֚֘֐ոլ֟ո֠օ֖֡գվև֚թւվչնշ", (byte)39, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_497.d[0] = NLoginCore_004.A("ĘēŇŅĻŅĊĶĪŀŊĕ", (byte)39, 65);
                    NLoginCore_497.d[1] = NLoginCore_076.D("ѾѶўҞҐҞҔѸѢҡҝѨҋѩ҆ѯқѭѬҟғҐѽѾ", (byte)39, 68);
                    NLoginCore_497.d[2] = NLoginCore_446.D("ѾѶўҞҐҞҔѸѢҡҞѶүҦҩҳұѲҌѮҲҐѽѾ", (byte)39, 68);
                    NLoginCore_497.d[3] = NLoginCore_138.A("ŅýĒĳāăĞĤļęőĿŅĦœŇİŘėģņķĒĜŎĨĺľĴśĻťŞĥĶťŦĥĿŭŤŀŃţōŌŪĽŎŤŸŊŨūŌťſľķĳĿŻľļſƈšƄƂźŢŖƉŢƊŢşŞŽƃŠōƎœƉţŠš", (byte)39, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_497.d[0] = NLoginCore_384.C("ѵҙѽҡғѳ҆ѴҤҫҕѼѪѼҢҢѯ҆ҋҤѵҀѽѾ", (byte)39, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_497.d[0] = NLoginCore_110.D("ңѢҀ҆҇ҕҀҨҔѦҟѲ", (byte)39, 68);
                }
            }
        }
    }
}

