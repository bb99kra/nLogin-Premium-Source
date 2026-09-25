/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.event.PostOrder
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.command.CommandExecuteEvent
 *  com.velocitypowered.api.event.command.CommandExecuteEvent$CommandResult
 *  com.velocitypowered.api.event.command.PlayerAvailableCommandsEvent
 *  com.velocitypowered.api.event.player.TabCompleteEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_114;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.command.PlayerAvailableCommandsEvent;
import com.velocitypowered.api.event.player.TabCompleteEvent;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_328
implements NLoginInterface_029 {
    private static int h;
    private final String bS;
    private static int r;
    private static int var_int_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int p;
    private static int m;
    private static int k;
    private static int y;
    private static int ab;
    private static int x;
    private static int f;
    private static long o;
    private static int aa;
    private static int w;
    private static int z;
    private static int g;
    private static int e;
    private static int var_int_t;
    private static int l;
    private static int q;
    private static int s;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_u;
    private final Set<String> var_java_util_Set_java_lang_String__t;
    private final Set<String> var_java_util_Set_java_lang_String__u;
    private static int j;
    private static String[] var_java_lang_String_arr_a;
    private static int v;
    private static int i;
    private static int d;
    private static int var_int_c;

    static {
        var_int_a = Integer.reverse(-973078528);
        var_int_b = Integer.reverse(0x5C000000);
        var_int_c = (0x6300000 >>> 20 | 0x6300000 << -20) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = 0x30000006 >>> 156 | 0x30000006 << ~156 + 1;
        f = Integer.reverse(0x5C000000);
        g = 6336 >>> 38 | 6336 << ~38 + 1;
        h = 0 >>> 198 | 0 << -198;
        i = Integer.reverse(-201326592);
        j = 0 >>> 108 | 0 << ~108 + 1;
        k = Integer.reverse(0);
        l = 96256 >>> 171 | 96256 << -171;
        m = 0 >>> 123 | 0 << -123;
        n = Integer.reverse(0);
        o = Long.reverse(9130017673472434196L);
        p = Integer.reverse(0);
        q = (0x40000000 >>> 254 | 0x40000000 << -254) & 0xFFFFFFFF;
        r = (0 >>> 237 | 0 << ~237 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(0x5C000000);
        var_int_t = (8192 >>> 141 | 8192 << -141) & 0xFFFFFFFF;
        var_int_u = 0 >>> 193 | 0 << ~193 + 1;
        v = Integer.reverse(-201326592);
        w = Integer.reverse(0x5C000000);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = (0 >>> 152 | 0 << ~152 + 1) & 0xFFFFFFFF;
        z = 94 >>> 1 | 94 << -1;
        aa = 512 >>> 233 | 512 << ~233 + 1;
        ab = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[aa];
        var_java_lang_String_arr_b = new String[ab];
        NLoginCore_328.b();
    }

    @Subscribe(order=PostOrder.LAST)
    public void a(CommandExecuteEvent commandExecuteEvent) {
        if (this.g(commandExecuteEvent.getCommand())) {
            commandExecuteEvent.setResult(CommandExecuteEvent.CommandResult.allowed());
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6EL;
        l ^= 0x6E24A724226BFB3CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(55 + 14), (byte)(8 + 75), (byte)(44 + 3), (byte)(14 + 53), (byte)(2 + 64), (byte)(24 + 43), (byte)(44 + 3), (byte)(29 + 51), (byte)(48 + 27), (byte)(52 + 15), (byte)(55 + 28), (byte)(30 + 23), (byte)(17 + 63), 97, 100, (byte)(37 + 63), (byte)(103 + 2), (byte)(64 + 46), (byte)(48 + 55)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(48 + 35)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.E("ռ։ֈՋ֋ևւ֋֖օՒ֐֔֍֐֖՘ࣲࢿࣱࣲ࣐ࣩࣦࣔࣕࣙࣳࣕ࣬", (byte)93, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_328.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Subscribe(order=PostOrder.EARLY)
    public void a(PlayerAvailableCommandsEvent playerAvailableCommandsEvent) {
        playerAvailableCommandsEvent.getRootNode().getChildren().removeIf(commandNode -> {
            String string = commandNode.getName().toLowerCase(Locale.ENGLISH);
            return (string.startsWith(this.bS + (char)s) || this.var_int_t.contains(string) ? var_int_t : var_int_u) != 0;
        });
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_328.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("œŵŷŗŻƚƒƨƔţơƗƥƟŨƍƯƮƦƬƦŻ", (byte)86, 66), NLoginCore_328.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪԄӑԄӢӦӧӫԃӻӸԅӧӾƃ", (byte)86, 66) + string + NLoginCore_453.A("ť", (byte)86, 65) + methodType.toString(), exception);
        }
    }

    private boolean g(String string) {
        if (string.isEmpty()) {
            return j != 0;
        }
        if (string.charAt(k) != l) {
            return m != 0;
        }
        String[] stringArray = string.split((String)NLoginCore_328.c("㺀", (int)n, (long)o));
        return (stringArray.length > 0 && this.var_int_u.contains(stringArray[p].toLowerCase(Locale.ENGLISH)) ? q : r) != 0;
    }

    public NLoginCore_328(NLoginCore_455 NLoginCore_4552) {
        this.bS = NLoginCore_4552.q().toLowerCase(Locale.ENGLISH);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(this.bS + (char)var_int_a);
        hashSet.add(this.bS + (char)var_int_b + this.bS + (char)var_int_c);
        NLoginCore_419[] NLoginCore_419Array = NLoginCore_419.values();
        int n = NLoginCore_419Array.length;
        for (int i = d; i < n; ++i) {
            NLoginCore_419 NLoginCore_4192 = NLoginCore_419Array[i];
            String string2 = NLoginCore_4192.Z().toLowerCase(Locale.ENGLISH);
            hashSet.add(this.bS + string2 + (char)e);
            hashSet.add(this.bS + (char)f + this.bS + string2 + (char)g);
        }
        this.var_int_t = (int)NLoginCore_114.a(hashSet);
        this.var_int_u = (int)NLoginCore_114.a(hashSet.stream().map(string -> (char)z + string).collect(Collectors.toSet()));
    }

    @Subscribe(order=PostOrder.EARLY)
    public void a(TabCompleteEvent tabCompleteEvent) {
        List list = tabCompleteEvent.getSuggestions();
        if (list.isEmpty()) {
            return;
        }
        String string2 = tabCompleteEvent.getPartialMessage().trim();
        if (!string2.isEmpty() && string2.charAt(h) != i) {
            return;
        }
        list.removeIf(string -> (string.startsWith((char)v + this.bS + (char)w) || this.g((String)string) ? x : y) != 0);
    }

    private static void b() {
        int n;
        var_long_c = 2884338127762763024L;
        long l = var_long_c ^ 0x6E24A724226BFB3CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(53 + 16), (byte)(77 + 6), (byte)(34 + 13), (byte)(41 + 26), (byte)(61 + 5), (byte)(2 + 65), (byte)(44 + 3), (byte)(47 + 33), (byte)(40 + 35), (byte)(60 + 7), (byte)(61 + 22), (byte)(22 + 31), 80, (byte)(75 + 22), 100, (byte)(54 + 46), (byte)(94 + 11), (byte)(46 + 64), (byte)(50 + 53)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(16 + 67)}, StandardCharsets.UTF_8));
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
                    NLoginCore_328.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ҷӘҿӈӬҭӲҿӠӦӘҽ", (byte)64, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_328.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ӇҾӤӆөӅҼӇӥұӪҽ", (byte)64, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_328.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ťŤńŖŻĽōŞŖššľŏőŕľŇĻŞŠšƋŒœ", (byte)64, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_328.var_java_lang_String_arr_b[0] = NLoginCore_076.E("ԵգԱԵապՙչԻՒՖմ՗չչշՄւղբՒբՏՐ", (byte)64, 69);
                }
            }
        }
    }
}

