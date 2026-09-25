/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_302;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
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

public class NLoginCore_450
extends NLoginCore_302 {
    private static int az;
    private static int m;
    private static int ai;
    private static long ax;
    private static long v;
    private static int ar;
    private static String[] g;
    private static long r;
    private static long at;
    private static long as;
    private static String[] h;
    private static int bc;
    private static long ap;
    private static int aw;

    public NLoginCore_450(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_F, (String)NLoginCore_450.c("㺀", (int)m, (long)v), (String)NLoginCore_450.c("㺃", (int)ai, (long)ap), (String)NLoginCore_450.c("㺆", (int)ar, (long)(as ^ at)), (String)NLoginCore_450.c("㺉", (int)aw, (long)ax));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_450.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.A("ÝÿāáąĤĜĲĞíīġįĩòėĹĸİĶİą", (byte)27, 65), NLoginCore_450.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢥ࢝࢜ࢳࢬࢳࢗࢳࢱࢶࢫࢭࢺ࢞࢞Ա", (byte)27, 70) + string + NLoginCore_559.F("ԑ", (byte)27, 70) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        r = 8413545304046565754L;
        long l = r ^ 0xE522FE9927029657L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(32 + 37), (byte)(49 + 34), (byte)(15 + 32), (byte)(41 + 26), (byte)(38 + 28), 67, 47, (byte)(49 + 31), (byte)(30 + 45), (byte)(34 + 33), (byte)(40 + 43), (byte)(26 + 27), (byte)(77 + 3), (byte)(67 + 30), (byte)(66 + 34), (byte)(14 + 86), (byte)(76 + 29), (byte)(78 + 32), (byte)(57 + 46)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_450.h[0] = NLoginCore_575.A("ŻǃƢƐƂƑƖƒǆƕƼƉǌǄƪƤƬǀǔǋǋǅƜƝ", (byte)101, 65);
                    NLoginCore_450.h[1] = NLoginCore_427.B("ƵƼƕƚƗƼƃƙƧƣƔƑ", (byte)101, 66);
                    NLoginCore_450.h[2] = NLoginCore_223.E("զ՘նՙմ՝ջծւ֢֙թ", (byte)101, 69);
                    NLoginCore_450.h[3] = NLoginCore_004.E("և֕՗֐ձշ֋֎֕՛֖թ", (byte)101, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_450.h[0] = NLoginCore_427.F("Փ֛պը՚թծժ֞խ֒՟քռրջճքփպ֍֝մյ", (byte)101, 70);
                    NLoginCore_450.h[1] = NLoginCore_173.A("ƾƖƣƻƖƁƴŻơƪǀƋƀǅƤƪǄƫǔǍƓǕƜƝ", (byte)101, 65);
                    NLoginCore_450.h[2] = NLoginCore_324.D("՜ՖՇՙԻ՟ԳԣբՀԠԹՆԨդՔՕԧՈԯՙԺԷԸ", (byte)101, 68);
                    NLoginCore_450.h[3] = NLoginCore_091.B("ƱŻƟƁưǆǆǊƿǁƾƑ", (byte)101, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_450.h[0] = NLoginCore_223.B("ƀưƬŻƛƘǄƱƷƥƞƶƸǊƞƲƊƛƴƲƬǄƢǒǅƷǊƥǑƳƙƾ", (byte)101, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_450.h[0] = NLoginCore_173.C("ՉԐԳԫԞԲԱՒԟԱ՟ԼՇՀՙ՚ԸԪՃկԪԻաղհԵՌԸԹիմզ", (byte)101, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1FL;
        l ^= 0xE522FE9927029657L;
        if (g[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(57 + 12), (byte)(2 + 81), (byte)(20 + 27), (byte)(63 + 4), (byte)(39 + 27), (byte)(31 + 36), (byte)(14 + 33), (byte)(56 + 24), (byte)(71 + 4), (byte)(2 + 65), 83, (byte)(30 + 23), (byte)(25 + 55), (byte)(84 + 13), (byte)(96 + 4), (byte)(41 + 59), (byte)(58 + 47), (byte)(36 + 74), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(14 + 69)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.E("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬࢻࢳࢲࣉࣂࣉࢭࣉࣇ࣌ࣁࣃ࣐ࢴࢴ", (byte)49, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_450.g[n] = new String(cipher.doFinal(Base64.getDecoder().decode(h[n])), StandardCharsets.UTF_8);
        }
        return g[n];
    }

    static {
        m = (0 >>> 74 | 0 << -74) & 0xFFFFFFFF;
        v = Long.reverse(-6440258856993471698L);
        ai = (0x20000000 >>> 125 | 0x20000000 << -125) & 0xFFFFFFFF;
        ap = Long.reverse(-6440258856993471698L);
        ar = (32768 >>> 142 | 32768 << -142) & 0xFFFFFFFF;
        as = Long.reverse(6818338445985268526L);
        at = Long.reverse(-576460752303423488L);
        aw = 0x60000000 >>> 93 | 0x60000000 << ~93 + 1;
        ax = Long.reverse(-6440258856993471698L);
        az = (1 >>> 94 | 1 << ~94 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0x20000000);
        g = new String[az];
        h = new String[bc];
        NLoginCore_450.void_b();
    }
}

