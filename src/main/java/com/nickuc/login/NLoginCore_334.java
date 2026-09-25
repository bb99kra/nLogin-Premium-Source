/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_302;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
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

public class NLoginCore_334
extends NLoginCore_302 {
    private static long as;
    private static long ap;
    private static int aw;
    private static String[] h;
    private static int ai;
    private static long r;
    private static int bc;
    private static int ar;
    private static long ay;
    private static String[] g;
    private static long ax;
    private static int m;
    private static int az;
    private static long at;

    public NLoginCore_334(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_E, (String)NLoginCore_334.c("㺀", (int)(m & ai), (long)ap), (String)NLoginCore_334.c("㺃", (int)ar, (long)(as ^ at)), (String)NLoginCore_334.c("㺆", (int)aw, (long)(ax ^ ay)), null);
    }

    private static void void_b() {
        int n;
        r = -4041572847824240956L;
        long l = r ^ 0xBF16E77833E330ECL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(50 + 19), (byte)(23 + 60), (byte)(43 + 4), (byte)(28 + 39), (byte)(11 + 55), (byte)(44 + 23), (byte)(5 + 42), (byte)(66 + 14), (byte)(68 + 7), (byte)(17 + 50), (byte)(34 + 49), (byte)(12 + 41), (byte)(16 + 64), 97, (byte)(16 + 84), (byte)(87 + 13), (byte)(22 + 83), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
                    NLoginCore_334.h[0] = NLoginCore_451.B("ƵƹƸƭƹƞơǔƝǠƹƣǕƻƻƹƦǫǣǧǣǯƶƷ", (byte)114, 66);
                    NLoginCore_334.h[1] = NLoginCore_559.D("ցաողբՃՉՅՄբրՓ", (byte)114, 68);
                    NLoginCore_334.h[2] = NLoginCore_453.E("է֩ճզ֦֗֡ՠեծևֳժ֞ճֱ֨ֆ֪֭֗֔ցւ", (byte)114, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_334.h[0] = NLoginCore_384.A("ƵƹƸƭƹƞơǔƝǠƶǤƾƸǄǊǧǮǗǦǯǁǧǒǅǱǞǇǈƫǖǚ", (byte)114, 65);
                    NLoginCore_334.h[1] = NLoginCore_138.B("ƔƫƧưƹƹƿƹƼǍǙǃǧƵǝǓǇƤƦƭǁǯƶƷ", (byte)114, 66);
                    NLoginCore_334.h[2] = NLoginCore_027.D("ՄֆՐՃփմվԽՂՋդՏվ֊ւ՜միծգՎա՞՟", (byte)114, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_334.h[0] = NLoginCore_324.C("ՏՒՆնչջթէխՖՅՇփգթցթ՝֖֎֔ՕհՒՕ֝պՑ֖֠֔֐", (byte)114, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_334.h[0] = NLoginCore_453.C("ՒՀչՀ՛չֆԽտսզ՞֊ՙ֌ֆ֑ճւհ֋ՙՖք֑֜ջ֋՝ճխ֍", (byte)114, 67);
                }
            }
        }
    }

    static {
        m = 0 >>> 20 | 0 << ~20 + 1;
        ai = Integer.reverse(-1);
        ap = Long.reverse(-468856024257882141L);
        ar = 0x400000 >>> 246 | 0x400000 << -246;
        as = Long.reverse(2557562925335091171L);
        at = Long.reverse(-2738188573441261568L);
        aw = 131072 >>> 240 | 131072 << -240;
        ax = Long.reverse(2557562925335091171L);
        ay = Long.reverse(-2738188573441261568L);
        az = Integer.reverse(-1073741824);
        bc = Integer.reverse(-1073741824);
        g = new String[az];
        h = new String[bc];
        NLoginCore_334.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_334.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.B("ĕķĹęĽŜŔŪŖĥţřŧšĪŏűŰŨŮŨĽ", (byte)55, 66), NLoginCore_334.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҞҢңҴҼҬҿҺŀ", (byte)55, 65) + string + NLoginCore_575.D("Ҕ", (byte)55, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x5BL;
        l ^= 0xBF16E77833E330ECL;
        if (g[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), 69, (byte)(59 + 24), 47, (byte)(24 + 43), (byte)(2 + 64), (byte)(39 + 28), (byte)(28 + 19), (byte)(71 + 9), (byte)(70 + 5), (byte)(61 + 6), (byte)(7 + 76), (byte)(43 + 10), (byte)(72 + 8), (byte)(42 + 55), (byte)(72 + 28), (byte)(63 + 37), (byte)(6 + 99), (byte)(37 + 73), (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲӤӨөӺԂӲԅԀ", (byte)90, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_334.g[n] = new String(cipher.doFinal(Base64.getDecoder().decode(h[n])), StandardCharsets.UTF_8);
        }
        return g[n];
    }
}

