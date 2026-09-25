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
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_011;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginType_007;
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

public class NLoginCore_155
extends NLoginType_011 {
    private static long e;
    private static String[] d;
    final /* synthetic */ NLoginType_007 a;
    private static long f;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_c;
    private static int g;
    private static int j;

    private static String a(int n, long l) {
        l ^= 0x68L;
        l ^= 0x10C3EE4CB2CCE503L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), 69, (byte)(12 + 71), (byte)(20 + 27), (byte)(43 + 24), (byte)(45 + 21), (byte)(56 + 11), (byte)(34 + 13), (byte)(11 + 69), (byte)(25 + 50), (byte)(36 + 31), 83, (byte)(49 + 4), (byte)(32 + 48), (byte)(38 + 59), (byte)(67 + 33), (byte)(81 + 19), (byte)(35 + 70), (byte)(78 + 32), (byte)(95 + 8)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.C("ԾՋՊԍՍՉՄՍ՘ՇԔՒՖՏՒ՘Ԛࢭࢁࢦࢣࢦࢢࢶࢷࢽ࢛", (byte)98, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_155.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    public NLoginCore_155(NLoginType_007 NLoginType_0072) {
        this.a = NLoginType_0072;
    }

    private static void b() {
        int n;
        e = -3009762306419798693L;
        long l = e ^ 0x10C3EE4CB2CCE503L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(14 + 55), (byte)(21 + 62), (byte)(38 + 9), (byte)(28 + 39), (byte)(25 + 41), (byte)(4 + 63), (byte)(3 + 44), (byte)(14 + 66), (byte)(46 + 29), (byte)(48 + 19), (byte)(35 + 48), (byte)(12 + 41), (byte)(31 + 49), (byte)(19 + 78), 100, 100, (byte)(77 + 28), (byte)(20 + 90), (byte)(7 + 96)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_155.d[0] = NLoginCore_138.D("ҴӉӐӍөӧӇӼӐӱӚӵӾӴӴӢӯӦӸӓӃӺӑӒ", (byte)67, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_155.d[0] = NLoginCore_324.C("ҴӉӐӍөӧӇӼӐӱӚӁӫӺӮӺӔӁӨӀԆөӵӈԂԏӠӑԎӏӋӲ", (byte)67, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_155.d[0] = NLoginCore_384.D("ӡӅӤӰӼӍҹӌӲӊӉәӷӱӀӏӀԇӸӂӢӔӑӒ", (byte)67, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_155.d[0] = NLoginCore_387.C("ӅӠӒӬӘҳӑәҼӡӎһӬӓӲҸԂӲӚԊӾӨӼԈӜӏӻԎӳӔԈӭ", (byte)67, 67);
                }
            }
        }
    }

    public void lockableEvent(LockableEvent lockableEvent, byte by, byte by2) {
        nLoginBukkit nLoginBukkit2 = (nLoginBukkit)((NLoginCore_100)((Object)this.a.a)).c();
        if (by == 0) {
            LoginRequestEvent loginRequestEvent = (LoginRequestEvent)lockableEvent;
            Player player = loginRequestEvent.getPlayer();
            if (!player.isOnline()) {
                return;
            }
            switch (by2) {
                case 1: {
                    nLoginBukkit2.callEvent(loginRequestEvent);
                    break;
                }
                case 2: {
                    ((NLoginType_008)((Object)this.a.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().b(((NLoginCore_100)((Object)this.a.a)).java_lang_Object_b().a(player), loginRequestEvent.isCancelled());
                    break;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_155.c("㺀", (int)var_int_c, (long)f) + by);
                }
            }
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        f = Long.reverse(-3696541810282931093L);
        g = 0x8000000 >>> 251 | 0x8000000 << ~251 + 1;
        j = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_c = new String[g];
        d = new String[j];
        NLoginCore_155.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_155.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ėĹĻěĿŞŖŬŘħťśũţĬőųŲŪŰŪĿ", (byte)56, 66), NLoginCore_155.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.C("ӀӍӌҏӏӋӆӏӚӉҖӔӘӑӔӚҜ࠯ࠃࠨࠥࠨࠤ࠸࠹࠿ࠝҲ", (byte)56, 67) + string + NLoginCore_384.F("Ԯ", (byte)56, 70) + methodType.toString(), exception);
        }
    }

    public void lockableNewAction(LockableNewActionEvent<?> lockableNewActionEvent) {
        nLoginBukkit nLoginBukkit2 = (nLoginBukkit)((NLoginCore_100)((Object)this.a.a)).c();
        nLoginBukkit2.callEvent(lockableNewActionEvent);
    }
}

