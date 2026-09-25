/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.event.bungee.auth.request.LoginRequestEvent
 *  com.nickuc.login.api.event.internal.LockableEvent
 *  com.nickuc.login.api.event.internal.LockableNewActionEvent
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 */
package com.nickuc.login;

import com.nickuc.login.api.event.bungee.auth.request.LoginRequestEvent;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_011;
import com.nickuc.login.NLoginType_023;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
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
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class NLoginCore_156
extends NLoginType_011 {
    private static String[] var_java_lang_String_arr_c;
    private static int var_int_c;
    private static int g;
    private static int j;
    private static long e;
    final /* synthetic */ NLoginType_023 a;
    private static String[] d;
    private static long f;

    public NLoginCore_156(NLoginType_023 NLoginType_0232) {
        this.a = NLoginType_0232;
    }

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0xF548066BA154998FL;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(4 + 65), (byte)(6 + 77), (byte)(13 + 34), (byte)(36 + 31), (byte)(39 + 27), (byte)(56 + 11), (byte)(35 + 12), (byte)(49 + 31), (byte)(44 + 31), (byte)(34 + 33), (byte)(66 + 17), (byte)(46 + 7), (byte)(13 + 67), (byte)(38 + 59), 100, (byte)(98 + 2), (byte)(99 + 6), (byte)(74 + 36), (byte)(6 + 97)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöѫҎѝ҄ҔѭҒҕҏ", (byte)28, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_156.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_156.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ƇƩƫƋƯǎǆǜǈƗǕǋǙǓƜǁǣǢǚǠǚƯ", (byte)112, 66), NLoginCore_156.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.F("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣠ः࣒ࣹउ࣢इऊऄր", (byte)112, 70) + string + NLoginCore_110.B("ƙ", (byte)112, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        f = Long.reverse(2907829679766414447L);
        g = (32 >>> 229 | 32 << ~229 + 1) & 0xFFFFFFFF;
        j = 4 >>> 194 | 4 << -194;
        var_java_lang_String_arr_c = new String[g];
        d = new String[j];
        NLoginCore_156.b();
    }

    public void lockableEvent(LockableEvent lockableEvent, byte by, byte by2) {
        nLoginBungee nLoginBungee2 = (nLoginBungee)((NLoginCore_100)((Object)this.a.a)).c();
        if (by == 0) {
            LoginRequestEvent loginRequestEvent = (LoginRequestEvent)lockableEvent;
            ProxiedPlayer proxiedPlayer = loginRequestEvent.getPlayer();
            switch (by2) {
                case 1: {
                    nLoginBungee2.callEvent(loginRequestEvent);
                    break;
                }
                case 2: {
                    ((NLoginType_008)((Object)this.a.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().b(((NLoginCore_100)((Object)this.a.a)).java_lang_Object_b().a(proxiedPlayer), loginRequestEvent.isCancelled());
                    break;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_156.c("㺀", (int)var_int_c, (long)f) + by);
                }
            }
        }
    }

    private static void b() {
        int n;
        e = -710148584586782186L;
        long l = e ^ 0xF548066BA154998FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), 69, 83, (byte)(45 + 2), (byte)(3 + 64), (byte)(40 + 26), (byte)(65 + 2), (byte)(36 + 11), (byte)(74 + 6), (byte)(61 + 14), (byte)(19 + 48), (byte)(54 + 29), (byte)(31 + 22), (byte)(62 + 18), (byte)(16 + 81), (byte)(84 + 16), (byte)(63 + 37), (byte)(45 + 60), (byte)(13 + 97), (byte)(96 + 7)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
                    NLoginCore_156.d[0] = NLoginCore_092.C("ҧѯҝҖҧ҉ҬҊҢҼҗҘҾҔұқүҘ҄Ҿ҅ҵҌҍ", (byte)44, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_156.d[0] = NLoginCore_110.F("ՖԞՌՅՖԸ՛ԹՑիՃՌգՠզզեՅՔՋ԰մՌՐյթղձԻԾ՜ց", (byte)44, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_156.d[0] = NLoginCore_575.F("Ռՠ԰ԹԯՁԴԼԶ՗ԪՉԧՎԦԧխՆԾՈխՎԻԼ", (byte)44, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_156.d[0] = NLoginCore_138.D("ҎҪҏ҄ҷҎҕҲ҃҆ѹҘҺҮѸҾҜҚҔҔҰҏҌҍ", (byte)44, 68);
                }
            }
        }
    }

    public void lockableNewAction(LockableNewActionEvent<?> lockableNewActionEvent) {
        nLoginBungee nLoginBungee2 = (nLoginBungee)((NLoginCore_100)((Object)this.a.a)).c();
        nLoginBungee2.callEvent(lockableNewActionEvent);
    }
}

