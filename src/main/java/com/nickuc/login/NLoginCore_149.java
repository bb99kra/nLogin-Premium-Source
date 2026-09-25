/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.command.CommandSource
 *  com.velocitypowered.api.proxy.ConsoleCommandSource
 *  com.velocitypowered.api.proxy.ProxyServer
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.proxy.ConsoleCommandSource;
import com.velocitypowered.api.proxy.ProxyServer;
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
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginCore_149
implements NLoginCore_061 {
    private static int d;
    private final ProxyServer var_com_velocitypowered_api_proxy_ProxyServer_b;
    private static int e;
    private static int var_int_b;
    private static int i;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static long var_long_c;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private final ConsoleCommandSource var_com_velocitypowered_api_proxy_ConsoleCommandSource_a;
    private static long g;
    private static int h;
    private static int f;

    @Override
    public void l(String string) {
        if (string.length() >= var_int_a && string.charAt(var_int_b) == var_int_c) {
            string = string.substring(d);
        }
        this.var_com_velocitypowered_api_proxy_ProxyServer_b.getCommandManager().executeImmediatelyAsync((CommandSource)this.var_com_velocitypowered_api_proxy_ConsoleCommandSource_a, string);
    }

    static {
        var_int_a = (16 >>> 195 | 16 << ~195 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = (-2147483625 >>> 255 | -2147483625 << -255) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = Integer.reverse(0);
        f = (-1 >>> 46 | -1 << -46) & 0xFFFFFFFF;
        g = Long.reverse(-4153938131572995779L);
        h = (8 >>> 35 | 8 << -35) & 0xFFFFFFFF;
        i = 1024 >>> 138 | 1024 << -138;
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_149.b();
    }

    private static String a(int n, long l) {
        l ^= 0x6BL;
        l ^= 0xFD1049604212ACFAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(4 + 65), (byte)(36 + 47), (byte)(9 + 38), (byte)(60 + 7), (byte)(56 + 10), (byte)(54 + 13), (byte)(39 + 8), (byte)(59 + 21), (byte)(14 + 61), (byte)(52 + 15), 83, (byte)(25 + 28), (byte)(73 + 7), (byte)(96 + 1), (byte)(77 + 23), (byte)(67 + 33), (byte)(99 + 6), 110, (byte)(23 + 80)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.C("ҮһҺѽҽҹҴҽӈҷ҄ӂӆҿӂӈҊ࠙ࠦࠒ߿߻ࠤࠞࠟࠪࠛࠠࠇ", (byte)50, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_149.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public String getName() {
        return NLoginCore_149.c("㺀", (int)(e & f), (long)g);
    }

    public static NLoginCore_149 a(ProxyServer proxyServer, ConsoleCommandSource consoleCommandSource) {
        return new NLoginCore_149(proxyServer, consoleCommandSource);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_149.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ƍƯƱƑƵǔǌǢǎƝǛǑǟǙƢǇǩǨǠǦǠƵ", (byte)115, 65), NLoginCore_149.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.F("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծࣽऊࣶࣣࣟईंःऎࣿऄ࣫ֆ", (byte)115, 70) + string + NLoginCore_559.F("թ", (byte)115, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public <T> T c() {
        return (T)this.var_com_velocitypowered_api_proxy_ConsoleCommandSource_a;
    }

    @Override
    public boolean i(String string) {
        return this.var_com_velocitypowered_api_proxy_ConsoleCommandSource_a.hasPermission(string);
    }

    private static void b() {
        int n;
        var_long_c = -4858780345061058040L;
        long l = var_long_c ^ 0xFD1049604212ACFAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(48 + 21), 83, (byte)(41 + 6), (byte)(16 + 51), (byte)(47 + 19), (byte)(28 + 39), (byte)(27 + 20), (byte)(45 + 35), (byte)(41 + 34), (byte)(42 + 25), (byte)(57 + 26), (byte)(52 + 1), (byte)(52 + 28), (byte)(68 + 29), (byte)(13 + 87), (byte)(28 + 72), (byte)(11 + 94), (byte)(43 + 67), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_149.var_java_lang_String_arr_b[0] = NLoginCore_223.C("суРМцЦчТэБЪЛ", (byte)10, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_149.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ԧӻԑՂԿԡՆԶԹԾԪԷӽԞՂՋԥԱԚՂՊԜԙԚ", (byte)10, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_149.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ĀîûÇËîþĐĀĕñãîĘäóÛċæĒğôģĢĂĖäøôęõĘ", (byte)10, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_149.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ЖЙФъТКѓшвЦЮЛ", (byte)10, 68);
                }
            }
        }
    }

    @Generated
    private NLoginCore_149(ProxyServer proxyServer, ConsoleCommandSource consoleCommandSource) {
        this.var_com_velocitypowered_api_proxy_ProxyServer_b = proxyServer;
        this.var_com_velocitypowered_api_proxy_ConsoleCommandSource_a = consoleCommandSource;
    }

    @Override
    public void k(String string) {
        this.var_com_velocitypowered_api_proxy_ConsoleCommandSource_a.sendMessage((Component)NLoginCore_529.a(string));
    }
}

