/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.event.internal.LockableEvent
 *  com.nickuc.login.api.event.internal.LockableNewActionEvent
 *  com.nickuc.login.api.event.velocity.auth.request.LoginRequestEvent
 *  com.velocitypowered.api.proxy.Player
 */
package com.nickuc.login;

import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.api.event.velocity.auth.request.LoginRequestEvent;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_011;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_013;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.velocitypowered.api.proxy.Player;
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

public class NLoginCore_085
extends NLoginType_011 {
    private static long f;
    private static String[] d;
    final /* synthetic */ NLoginType_013 a;
    private static int var_int_c;
    private static int m;
    private static long h;
    private static long e;
    private static int j;
    private static String[] var_java_lang_String_arr_c;

    public NLoginCore_085(NLoginType_013 NLoginType_0132) {
        this.a = NLoginType_0132;
    }

    static {
        var_int_c = Integer.reverse(0);
        f = Long.reverse(248438088264159289L);
        h = Long.reverse(-7493989779944505344L);
        j = (0x10000000 >>> 220 | 0x10000000 << ~220 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_c = new String[j];
        d = new String[m];
        NLoginCore_085.b();
    }

    public void lockableNewAction(LockableNewActionEvent<?> lockableNewActionEvent) {
        nLoginVelocity nLoginVelocity2 = (nLoginVelocity)((NLoginCore_100)((Object)this.a.a)).c();
        nLoginVelocity2.callEvent(lockableNewActionEvent);
    }

    public void lockableEvent(LockableEvent lockableEvent, byte by, byte by2) {
        nLoginVelocity nLoginVelocity2 = (nLoginVelocity)((NLoginCore_100)((Object)this.a.a)).c();
        if (by == 0) {
            LoginRequestEvent loginRequestEvent = (LoginRequestEvent)lockableEvent;
            Player player = loginRequestEvent.getPlayer();
            switch (by2) {
                case 1: {
                    nLoginVelocity2.callEvent(loginRequestEvent);
                    break;
                }
                case 2: {
                    ((NLoginType_008)((Object)this.a.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().b(((NLoginCore_100)((Object)this.a.a)).java_lang_Object_b().a(player), loginRequestEvent.isCancelled());
                    break;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_085.c("㺀", (int)var_int_c, (long)(f ^ h)) + by);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_085.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.D("ԌԮ԰ԐԴՓՋաՍԜ՚Ր՞՘ԡՆըէ՟ե՟Դ", (byte)101, 68), NLoginCore_085.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢾࢿࣀࢠࢪࢍࢭࢰࢹࢵࢨ࢓ࢡࣃԽ", (byte)101, 67) + string + NLoginCore_453.E("՛", (byte)101, 69) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x19L;
        l ^= 0x9D419DAD7EDC1500L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(11 + 58), (byte)(34 + 49), (byte)(28 + 19), (byte)(50 + 17), (byte)(42 + 24), (byte)(14 + 53), 47, (byte)(23 + 57), (byte)(69 + 6), (byte)(6 + 61), (byte)(13 + 70), 53, (byte)(14 + 66), (byte)(63 + 34), (byte)(93 + 7), (byte)(87 + 13), (byte)(48 + 57), (byte)(42 + 68), (byte)(46 + 57)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("ճրտՂւվչւ֍ռՉև֋քև֍Տ࣪࣫࣬࣌ࣖࢹࣙࣜࣥ࣡ࣔࢿ࣯࣍", (byte)84, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_085.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    private static void b() {
        int n;
        e = -7203061202383712576L;
        long l = e ^ 0x9D419DAD7EDC1500L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(31 + 38), (byte)(39 + 44), (byte)(35 + 12), (byte)(65 + 2), (byte)(30 + 36), (byte)(7 + 60), (byte)(39 + 8), (byte)(15 + 65), (byte)(41 + 34), 67, (byte)(32 + 51), (byte)(28 + 25), (byte)(38 + 42), (byte)(83 + 14), (byte)(24 + 76), 100, (byte)(72 + 33), (byte)(87 + 23), (byte)(59 + 44)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
                    NLoginCore_085.d[0] = NLoginCore_223.A("ƟƜơƀƉŶƅƦƊƜƙƁƢƞƳŬƎƥƫƶƂƃƀƁ", (byte)87, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_085.d[0] = NLoginCore_027.F("օւևզկ՜ի֌հւշհօ֑թ֔ֆզչթոր֛ձ֒տ֚՞ձ֦չ֓", (byte)87, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_085.d[0] = NLoginCore_138.A("ƆƑŶũƖƜƭƂƬźƙƤƛƛŰƤűƭƍŴƑƃƀƁ", (byte)87, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_085.d[0] = NLoginCore_091.D("ԅԋԓԥԧԬԢԆԪԝӽԊԌԘԎԽԮԹӾԽԓԠԍԎ", (byte)87, 68);
                }
            }
        }
    }
}

