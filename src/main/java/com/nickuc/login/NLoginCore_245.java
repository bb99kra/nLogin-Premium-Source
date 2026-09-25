/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.event.bukkit.auth.request.LoginRequestEvent
 *  com.nickuc.login.api.event.internal.LockableEvent
 *  com.nickuc.login.api.event.internal.LockableNewActionEvent
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.api.event.bukkit.auth.request.LoginRequestEvent;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_011;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginType_012;
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
import org.bukkit.entity.Player;

public class NLoginCore_245
extends NLoginType_011 {
    final /* synthetic */ NLoginType_012 a;
    private static long h;
    private static int var_int_c;
    private static long f;
    private static String[] var_java_lang_String_arr_c;
    private static String[] d;
    private static long e;
    private static int m;
    private static int j;

    private static void b() {
        int n;
        e = -475860013211613598L;
        long l = e ^ 0xDF8DA9FBCC6C4EF9L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(8 + 61), 83, (byte)(26 + 21), (byte)(15 + 52), 66, (byte)(23 + 44), (byte)(14 + 33), (byte)(62 + 18), (byte)(57 + 18), (byte)(56 + 11), (byte)(82 + 1), (byte)(50 + 3), (byte)(26 + 54), (byte)(24 + 73), (byte)(23 + 77), (byte)(32 + 68), (byte)(25 + 80), (byte)(61 + 49), (byte)(85 + 18)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_245.d[0] = NLoginCore_027.C("ҊѸҼґҁҴҧѺңҩҿҜҖҷӈҮӆҋӀҾҫҞқҜ", (byte)49, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_245.d[0] = NLoginCore_004.B("ģđŕĪĚōŀēļłŖœŘğŜĤĲŕĿŕŬĭĬŀűņņĿţşĸť", (byte)49, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_245.d[0] = NLoginCore_453.F("ԵԺՉԧԣԼդԹԪՋ՞Ե", (byte)49, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_245.d[0] = NLoginCore_138.A("ŚĲŉĬĶŐŝŐĪĵŃłœŦļĢţĹĵņĽīĪũŤįŇĬŊŒŘŶ", (byte)49, 65);
                }
            }
        }
    }

    public void lockableEvent(LockableEvent lockableEvent, byte by, byte by2) {
        if (by == 0) {
            LoginRequestEvent loginRequestEvent = (LoginRequestEvent)lockableEvent;
            Player player = loginRequestEvent.getPlayer();
            if (!player.isOnline()) {
                return;
            }
            switch (by2) {
                case 1: {
                    NLoginType_012.a(this.a).callEvent(loginRequestEvent);
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_245.c("㺀", (int)var_int_c, (long)(f ^ h)) + by);
                }
            }
        }
    }

    public void lockableNewAction(LockableNewActionEvent<?> lockableNewActionEvent) {
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_245.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.E("ԤՆՈԨՌիգչեԴղընհԹ՞րտշսշՌ", (byte)64, 69), NLoginCore_245.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࠡࠧࡇࡅࡑࠞࡊࡐ࠷ࠣӊ", (byte)64, 67) + string + NLoginCore_427.B("Ĺ", (byte)64, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x30L;
        l ^= 0xDF8DA9FBCC6C4EF9L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(66 + 3), (byte)(81 + 2), 47, (byte)(62 + 5), (byte)(29 + 37), (byte)(64 + 3), (byte)(21 + 26), (byte)(65 + 15), (byte)(61 + 14), (byte)(50 + 17), (byte)(81 + 2), (byte)(23 + 30), (byte)(59 + 21), (byte)(73 + 24), (byte)(33 + 67), (byte)(85 + 15), 105, (byte)(47 + 63), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣ࢐࢖ࢶࢴࣀࢍࢹࢿࢦ࢒", (byte)40, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_245.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    public NLoginCore_245(NLoginType_012 NLoginType_0122) {
        this.a = NLoginType_0122;
    }

    static {
        var_int_c = Integer.reverse(0);
        f = Long.reverse(5071525607157180063L);
        h = Long.reverse(0xC00000000000000L);
        j = Integer.reverse(Integer.MIN_VALUE);
        m = 0x8000000 >>> 123 | 0x8000000 << -123;
        var_java_lang_String_arr_c = new String[j];
        d = new String[m];
        NLoginCore_245.b();
    }
}

