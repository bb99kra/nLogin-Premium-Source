/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerCommandSendEvent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class NLoginCore_160
implements NLoginInterface_027 {
    private static long d;
    private static long f;
    private static long l;
    private static int e;
    private static long j;
    private static String[] var_java_lang_String_arr_a;
    private static int m;
    private static long var_long_b;
    private static long g;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static long c;
    private static int k;
    private static int var_int_h;
    private static long i;
    private static int n;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_h;

    private static void b() {
        int n;
        c = -7137121407931882773L;
        long l = c ^ 0x8F9BE92EE8BE21D9L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(11 + 58), (byte)(63 + 20), (byte)(7 + 40), (byte)(6 + 61), (byte)(58 + 8), (byte)(53 + 14), (byte)(21 + 26), (byte)(75 + 5), (byte)(5 + 70), (byte)(5 + 62), (byte)(10 + 73), (byte)(12 + 41), (byte)(49 + 31), (byte)(44 + 53), 100, (byte)(49 + 51), (byte)(96 + 9), 110, (byte)(63 + 40)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_160.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ĬįĴĭĠĲþŊāňĥŌĸŏīŐĜőŋĢīņĔņĘņĒŗħŒļĿ", (byte)37, 65);
                    NLoginCore_160.var_java_lang_String_arr_b[1] = NLoginCore_138.F("ԕԻԚԸ՛ԑԬԪԻՃԹՑԥըՙՒՉ՘ի՟թՇԴԵ", (byte)37, 70);
                    NLoginCore_160.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ҏѿѧіҌѵѕѤҥќѿѬ", (byte)37, 67);
                    NLoginCore_160.var_java_lang_String_arr_b[3] = NLoginCore_223.A("ĴĤČûıĚúĉŊāĤđ", (byte)37, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_160.var_java_lang_String_arr_b[0] = NLoginCore_091.D("҇Ҋҏ҈ѻҍљҥќңҀҧғҪ҆ҫѷҬҦѽ҆ҩҲѦҥғ҄ҌҧҚҥҴ", (byte)37, 68);
                    NLoginCore_160.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ýģĂĠŃùĔĒģīġąĦħŀŀŇČďŔĨğĜĝ", (byte)37, 65);
                    NLoginCore_160.var_java_lang_String_arr_b[2] = NLoginCore_076.E("ԗԮ՛Թ՞Ի՛՛ԫդԣՐՐՠ՘ՑաէԦԺԷԷԴԵ", (byte)37, 69);
                    NLoginCore_160.var_java_lang_String_arr_b[3] = NLoginCore_427.A("üĂēįėıĲĽĲĸŁĶĬĪņĬīĤčĿŗğĜĝ", (byte)37, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_160.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ğþĿĸąăĽāĴĳĔŇĜĮńīħĦœĎĨįņıĻĖŖĦřřĭĿ", (byte)37, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_160.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ĕĖįĂĢħĢŁāāġĶŏīłĦħĳŁŒĿįĜĝ", (byte)37, 65);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_160.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.B("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 66), NLoginCore_160.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.F("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࣂࢼࢾࢦࢭ࣋ࣇࣀՅ", (byte)54, 70) + string + NLoginCore_427.D("ґ", (byte)54, 68) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_160(nLoginBukkit nLoginBukkit2) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_h = nLoginBukkit2;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-2934580578066116807L);
        d = Long.reverse(0x6400000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-2934580578066116807L);
        g = Long.reverse(0x6400000000000000L);
        var_int_h = 8 >>> 2 | 8 << ~2 + 1;
        i = Long.reverse(-2934580578066116807L);
        j = Long.reverse(0x6400000000000000L);
        k = 49152 >>> 174 | 49152 << ~174 + 1;
        l = Long.reverse(-5528653963431522503L);
        m = Integer.reverse(0x20000000);
        n = (512 >>> 199 | 512 << -199) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_160.b();
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void a(PlayerCommandSendEvent playerCommandSendEvent) {
        if (this.var_com_nickuc_login_bukkit_nLoginBukkit_h.boolean_i()) {
            return;
        }
        Player player = playerCommandSendEvent.getPlayer();
        if (player.hasPermission((String)NLoginCore_160.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))) || player.hasPermission((String)NLoginCore_160.c("㺃", (int)e, (long)(f ^ g)))) {
            return;
        }
        Collection collection = playerCommandSendEvent.getCommands();
        if (collection.stream().noneMatch(((String)NLoginCore_160.c("㺆", (int)var_int_h, (long)(i ^ j)))::equalsIgnoreCase)) {
            collection.add(NLoginCore_160.c("㺉", (int)k, (long)l));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0x8F9BE92EE8BE21D9L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(19 + 50), (byte)(70 + 13), (byte)(35 + 12), (byte)(23 + 44), (byte)(33 + 33), (byte)(54 + 13), 47, (byte)(18 + 62), (byte)(44 + 31), (byte)(10 + 57), (byte)(77 + 6), (byte)(4 + 49), (byte)(22 + 58), (byte)(41 + 56), (byte)(97 + 3), 100, (byte)(18 + 87), (byte)(65 + 45), (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("֦֥֙ըֳ֤֢֨֟֨կֱֳ֪֭֭յआऀंࣱ࣪एऋऄ", (byte)122, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_160.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

