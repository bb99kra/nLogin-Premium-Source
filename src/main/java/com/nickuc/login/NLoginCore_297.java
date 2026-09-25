/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientPluginMessage
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientPluginMessage;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_433;
import com.nickuc.login.NLoginCore_201;
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
import org.bukkit.entity.Player;

public class NLoginCore_297
implements NLoginInterface_003 {
    private static int d;
    private static String[] var_java_lang_String_arr_b;
    final /* synthetic */ NLoginCore_433 var_com_nickuc_login_NLoginCore_502_a;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static int e;
    private static long var_long_c;
    private static long var_long_b;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(693182425496388923L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = 0x2000000 >>> 185 | 0x2000000 << -185;
        e = (0x10000000 >>> 60 | 0x10000000 << ~60 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[d];
        var_java_lang_String_arr_b = new String[e];
        NLoginCore_297.b();
    }

    private static String a(int n, long l) {
        l ^= 0xFL;
        l ^= 0x81E970658CAA689L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(57 + 12), (byte)(64 + 19), (byte)(21 + 26), (byte)(53 + 14), 66, (byte)(56 + 11), (byte)(12 + 35), (byte)(21 + 59), (byte)(12 + 63), (byte)(42 + 25), (byte)(69 + 14), (byte)(30 + 23), (byte)(59 + 21), (byte)(25 + 72), 100, (byte)(31 + 69), (byte)(94 + 11), (byte)(70 + 40), (byte)(27 + 76)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("ՅՒՑԔՔՐՋՔ՟Վԛՙ՝Ֆՙ՟ԡ࢖ࢇࢲࢯࢪࢳࢢ࢚ࢰ࢐ࢦ࢙ࣀࢷ", (byte)38, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_297.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_297.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.D("ҦӈӊҪӎӭӥӻӧҶӴӪӸӲһӠԂԁӹӿӹӎ", (byte)67, 68), NLoginCore_297.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.F("բկծԱձխըձռիԸնպճնռԾࢳࢤ࣏࣌ࣇ࣐ࢿࢷ࣍ࢭࣃࢶࣝࣔ՘", (byte)67, 70) + string + NLoginCore_076.A("Ŀ", (byte)67, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -2548612760745969249L;
        long l = var_long_c ^ 0x81E970658CAA689L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(18 + 51), 83, (byte)(33 + 14), (byte)(7 + 60), (byte)(59 + 7), (byte)(29 + 38), (byte)(35 + 12), (byte)(13 + 67), (byte)(37 + 38), (byte)(3 + 64), (byte)(2 + 81), (byte)(20 + 33), (byte)(72 + 8), (byte)(20 + 77), (byte)(96 + 4), (byte)(25 + 75), (byte)(6 + 99), 110, (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
                    NLoginCore_297.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ĆķüĝĄľĚōħĉĒĩċĿńĸēċČŊĩśĢģ", (byte)40, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_297.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ĆķüĝĄľĚōħĉĒĉŉłīħŔĮĳĹśśĢģ", (byte)40, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_297.var_java_lang_String_arr_b[0] = NLoginCore_384.E("՞ԚՙԞՐԠբՌԜԯԣ԰ԦԴԽԧԵ՜ԫՌՂՠԷԸ", (byte)40, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_297.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ĥĉēŋňĦŀģħıŉġĔĐğőġħńėīĵĢģ", (byte)40, 66);
                }
            }
        }
    }

    public NLoginCore_297(NLoginCore_433 NLoginCore_5022) {
        this.var_com_nickuc_login_NLoginCore_502_a = NLoginCore_5022;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        WrapperConfigClientPluginMessage wrapperConfigClientPluginMessage = new WrapperConfigClientPluginMessage(packetReceiveEvent);
        String string = wrapperConfigClientPluginMessage.getChannelName();
        if (!string.equals(NLoginCore_297.c("㺀", (int)var_int_a, (long)var_long_b))) {
            return;
        }
        Player player = (Player)packetReceiveEvent.getPlayer();
        if (player == null) {
            return;
        }
        packetReceiveEvent.setCancelled(var_int_c != 0);
        NLoginCore_433.a(this.var_com_nickuc_login_NLoginCore_502_a).com_nickuc_login_NLoginType_018_a().a(NLoginCore_433.a(this.var_com_nickuc_login_NLoginCore_502_a).java_lang_Object_b().a(player), wrapperConfigClientPluginMessage.getData());
    }
}

