/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_302;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_368
extends NLoginCore_302 {
    private static int aw;
    private static long as;
    private static int ai;
    private static long at;
    private static int az;
    private static long ap;
    private static long ac;
    private static String[] g;
    private static long r;
    private static int ar;
    private static String[] h;
    private static int m;
    private static long v;

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0x99B5B2FD09EA1B83L;
        if (g[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(9 + 60), (byte)(77 + 6), 47, (byte)(8 + 59), (byte)(12 + 54), (byte)(18 + 49), (byte)(32 + 15), (byte)(28 + 52), (byte)(44 + 31), (byte)(52 + 15), (byte)(54 + 29), (byte)(40 + 13), (byte)(23 + 57), (byte)(66 + 31), 100, (byte)(87 + 13), (byte)(94 + 11), (byte)(13 + 97), (byte)(18 + 85)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.F("՞իժԭխթդխոէԴղնկղոԺࢽࣃࣅ࣋ࣂࢤ࣏ࣜࣈ࣊ࣖ࣋", (byte)63, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_368.g[n] = new String(cipher.doFinal(Base64.getDecoder().decode(h[n])), StandardCharsets.UTF_8);
        }
        return g[n];
    }

    public NLoginCore_368(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_z, (String)NLoginCore_368.c("㺀", (int)m, (long)(v ^ ac)), (String)NLoginCore_368.c("㺃", (int)ai, (long)ap), (String)NLoginCore_368.c("㺆", (int)ar, (long)(as ^ at)), null);
    }

    private static void void_b() {
        int n;
        r = 767285000235573456L;
        long l = r ^ 0x99B5B2FD09EA1B83L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), 69, (byte)(27 + 56), (byte)(32 + 15), (byte)(16 + 51), (byte)(32 + 34), (byte)(31 + 36), (byte)(38 + 9), (byte)(18 + 62), (byte)(42 + 33), (byte)(58 + 9), (byte)(80 + 3), (byte)(52 + 1), (byte)(22 + 58), (byte)(22 + 75), 100, (byte)(42 + 58), (byte)(86 + 19), (byte)(79 + 31), (byte)(75 + 28)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_368.h[0] = NLoginCore_091.A("ŠŠšůƐƍƔƜƐƚŬżƝƕƀƢŰŤƢƗƤƗŮů", (byte)78, 65);
                    NLoginCore_368.h[1] = NLoginCore_091.D("ӓӥԄԒԄԆԚԗԁԖԘӧ", (byte)78, 68);
                    NLoginCore_368.h[2] = NLoginCore_324.A("ŭŶƐūŭƃƐŮƌŻžţ", (byte)78, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_368.h[0] = NLoginCore_091.E("ՏՏՐ՞տռփ֋տ։՜՘֐գջ֑գփՇև֕ՠ՝՞", (byte)78, 69);
                    NLoginCore_368.h[1] = NLoginCore_027.D("ӢӐӥӯӭӷӴԚԟӱԊԢӢӣӿӴӾӶԘӺԦԛӲӳ", (byte)78, 68);
                    NLoginCore_368.h[2] = NLoginCore_027.B("ſƉƃťŢƎŖŵŕźŴŝŬƌƋƁŢŜƁƏƞűŮů", (byte)78, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_368.h[0] = NLoginCore_076.F("վՀղտՖյջ։ց֌յՆՌՐՇհղ՞աՐզծհՒպ֛Տ֏խ֙֙֜", (byte)78, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_368.h[0] = NLoginCore_223.C("ӎԔԓӔԎӏӱԈӗԡԘӧ", (byte)78, 67);
                }
            }
        }
    }

    static {
        m = 0 >>> 251 | 0 << -251;
        v = Long.reverse(794710641361266000L);
        ac = Long.reverse(0x1A00000000000000L);
        ai = Integer.reverse(Integer.MIN_VALUE);
        ap = Long.reverse(1227056205588833616L);
        ar = Integer.reverse(0x40000000);
        as = Long.reverse(794710641361266000L);
        at = Long.reverse(0x1A00000000000000L);
        aw = 0x6000000 >>> 89 | 0x6000000 << -89;
        az = (98304 >>> 111 | 98304 << -111) & 0xFFFFFFFF;
        g = new String[aw];
        h = new String[az];
        NLoginCore_368.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_368.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("řŻŽŝƁƠƘƮƚũƧƝƫƥŮƓƵƴƬƲƬƁ", (byte)89, 65), NLoginCore_368.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.F("ոօքՇևփվև֒ցՎ֌֐։֌֒Քࣗࣝࣟࣥࣜࢾࣩࣶ࣢ࣰࣤࣥլ", (byte)89, 70) + string + NLoginCore_559.B("ū", (byte)89, 66) + methodType.toString(), exception);
        }
    }
}

