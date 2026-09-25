/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_302;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
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

public class NLoginCore_378
extends NLoginCore_302 {
    private static long v;
    private static long bb;
    private static String[] g;
    private static long r;
    private static long ba;
    private static long ap;
    private static long ac;
    private static long ax;
    private static long ay;
    private static long as;
    private static int bc;
    private static int bd;
    private static int ai;
    private static int az;
    private static int m;
    private static int aw;
    private static String[] h;

    static {
        m = Integer.reverse(0);
        v = Long.reverse(4075606706816641089L);
        ac = Long.reverse(-4179340454199820288L);
        ai = Integer.reverse(Integer.MIN_VALUE);
        ap = Long.reverse(4075606706816641089L);
        as = Long.reverse(-4179340454199820288L);
        aw = Integer.reverse(0x40000000);
        ax = Long.reverse(4075606706816641089L);
        ay = Long.reverse(-4179340454199820288L);
        az = 0x60000000 >>> 93 | 0x60000000 << -93;
        ba = Long.reverse(4075606706816641089L);
        bb = Long.reverse(-4179340454199820288L);
        bc = Integer.reverse(0x20000000);
        bd = (Integer.MIN_VALUE >>> 93 | Integer.MIN_VALUE << -93) & 0xFFFFFFFF;
        g = new String[bc];
        h = new String[bd];
        NLoginCore_378.void_b();
    }

    private static void void_b() {
        int n;
        r = -9072923476357091044L;
        long l = r ^ 0x26FBF74802D0CABCL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(25 + 58), (byte)(35 + 12), (byte)(25 + 42), (byte)(22 + 44), (byte)(27 + 40), (byte)(5 + 42), (byte)(61 + 19), (byte)(50 + 25), (byte)(35 + 32), (byte)(74 + 9), (byte)(28 + 25), (byte)(15 + 65), (byte)(80 + 17), (byte)(47 + 53), (byte)(39 + 61), (byte)(43 + 62), (byte)(86 + 24), (byte)(98 + 5)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_378.h[0] = NLoginCore_384.E("ԦԝԿԚԡՃԣԜԪԯԡՏՌԥԉՏԓԦԙ՘Խ՜ԣԤ", (byte)20, 69);
                    NLoginCore_378.h[1] = NLoginCore_110.C("ѢсћюьХћѲѓўѮй", (byte)20, 67);
                    NLoginCore_378.h[2] = NLoginCore_092.A("ėĚĎßñ×ġúġéĂï", (byte)20, 65);
                    NLoginCore_378.h[3] = NLoginCore_027.D("ћѠѢУжлйсыѥѮй", (byte)20, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_378.h[0] = NLoginCore_223.B("ýôĖñøĚúóāĆùæĪûìĊęįīČĊčúû", (byte)20, 66);
                    NLoginCore_378.h[1] = NLoginCore_138.D("ЩЧљјьщёбѬлрй", (byte)20, 68);
                    NLoginCore_378.h[2] = NLoginCore_173.F("ԩԸԙԖԶԮՅԾԼԿՑԘ", (byte)20, 70);
                    NLoginCore_378.h[3] = NLoginCore_451.E("ԛԃՉԈՄԜԫՑԠՑՉԘ", (byte)20, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_378.h[0] = NLoginCore_453.A("ĚóğñĀĚĥħāĘĘï", (byte)20, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_378.h[0] = NLoginCore_223.B("čĖġċğôüćåĒĆüëĂĦøÿĆěđòđĠįøùĄččĨĜį", (byte)20, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x63L;
        l ^= 0x26FBF74802D0CABCL;
        if (g[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(15 + 54), (byte)(37 + 46), (byte)(17 + 30), (byte)(23 + 44), (byte)(48 + 18), (byte)(50 + 17), 47, (byte)(26 + 54), (byte)(5 + 70), (byte)(9 + 58), (byte)(14 + 69), (byte)(13 + 40), (byte)(45 + 35), (byte)(82 + 15), (byte)(11 + 89), 100, (byte)(83 + 22), (byte)(10 + 100), (byte)(6 + 97)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("анмϿплжпъйІфшсфъЌޟޝޥޡޔޖݷޥޙލާݼޛ", (byte)8, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_378.g[n] = new String(cipher.doFinal(Base64.getDecoder().decode(h[n])), StandardCharsets.UTF_8);
        }
        return g[n];
    }

    public NLoginCore_378(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.I, (String)NLoginCore_378.c("㺀", (int)m, (long)(v ^ ac)), (String)NLoginCore_378.c("㺃", (int)ai, (long)(ap ^ as)), (String)NLoginCore_378.c("㺆", (int)aw, (long)(ax ^ ay)), (String)NLoginCore_378.c("㺉", (int)az, (long)(ba ^ bb)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_378.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("ϯБГϳЗжЮфаϿнгслЄЩыътштЗ", (byte)6, 68), NLoginCore_378.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.F("ԥԲԱӴԴ԰ԫԴԿԮӻԹԽԶԹԿԁ࢔࢒࢚࢖ࢉࢋ࡬࢚ࢎࢂ࢜ࡱ࢐Ԛ", (byte)6, 70) + string + NLoginCore_092.F("Ӽ", (byte)6, 70) + methodType.toString(), exception);
        }
    }
}

