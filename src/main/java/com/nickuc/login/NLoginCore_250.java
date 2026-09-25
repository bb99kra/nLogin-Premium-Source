/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_166;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
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

public final class NLoginCore_250
extends NLoginCore_166 {
    private static int ab;
    private static long ac;
    private static String[] f;
    private static int ah;
    private static int x;
    private static int af;
    private static String[] e;
    private static long n;
    private static long o;
    private static int d;
    private static long m;

    private static String a(int n, long l) {
        l ^= 0x77L;
        l ^= 0xE71550419A669BB2L;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(10 + 59), (byte)(70 + 13), (byte)(7 + 40), (byte)(38 + 29), 66, (byte)(49 + 18), (byte)(26 + 21), (byte)(33 + 47), (byte)(32 + 43), (byte)(44 + 23), (byte)(37 + 46), (byte)(22 + 31), (byte)(45 + 35), 97, (byte)(48 + 52), (byte)(51 + 49), (byte)(25 + 80), (byte)(62 + 48), (byte)(3 + 100)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.E("՗դգԦզբ՝զձՠԭիկըիձԳ࣎ࣃ࣏࢜ࣉࣄࢮࣉ࣌", (byte)56, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_250.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    static {
        d = (0 >>> 54 | 0 << -54) & 0xFFFFFFFF;
        n = Long.reverse(-2371914993832532570L);
        o = Long.reverse(-1297036692682702848L);
        x = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(-1);
        ac = Long.reverse(3536807717277558182L);
        af = Integer.reverse(0x40000000);
        ah = Integer.reverse(0x40000000);
        e = new String[af];
        f = new String[ah];
        NLoginCore_250.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_250.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 69), NLoginCore_250.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("իոշԺպնձպօմՁտփռտօՇ࣢ࣣࣗࢰࣝࣘࣂࣝ࣠՜", (byte)113, 67) + string + NLoginCore_004.C("Ղ", (byte)113, 67) + methodType.toString(), exception);
        }
    }

    public NLoginCore_250() {
        super((String)NLoginCore_250.c("㺀", (int)d, (long)(n ^ o)), (String)NLoginCore_250.c("㺃", (int)(x & ab), (long)ac));
    }

    private static void b() {
        int n;
        m = 7324555942325037307L;
        long l = m ^ 0xE71550419A669BB2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(36 + 33), (byte)(76 + 7), (byte)(32 + 15), (byte)(30 + 37), (byte)(65 + 1), (byte)(47 + 20), (byte)(35 + 12), (byte)(68 + 12), (byte)(3 + 72), (byte)(21 + 46), (byte)(56 + 27), 53, (byte)(17 + 63), (byte)(76 + 21), (byte)(12 + 88), 100, (byte)(5 + 100), (byte)(59 + 51), (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_250.f[0] = NLoginCore_324.A("ƎƧƨƟƣƮƪǔǋǑǒơ", (byte)109, 65);
                    NLoginCore_250.f[1] = NLoginCore_384.E("֣ծ֝վյ֛֧֓գ֤֢ձ", (byte)109, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_250.f[0] = NLoginCore_453.E("ձ֐՟ճ֖֚՟֓֓֟գգ֨րկ֌ֈֲ֜մֵ֥ռս", (byte)109, 69);
                    NLoginCore_250.f[1] = NLoginCore_223.C("ձմյնշնՌ՛ըզոՏՓՖճ՗ցնկֈ՛ոՏՐ", (byte)109, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_250.f[0] = NLoginCore_451.B("ƬƯǕƪƟƎǁǄƒƸƨơ", (byte)109, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_250.f[0] = NLoginCore_453.B("ƮƬƲƟǐƿƶƯƩƖƤƩǗǝǉƬǛƫǞǑƮƯƬƭ", (byte)109, 66);
                }
            }
        }
    }
}

