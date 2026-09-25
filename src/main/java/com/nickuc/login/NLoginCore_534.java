/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatMessageType
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.TextComponent
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.Player$Spigot
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_001;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

public class NLoginCore_534
implements NLoginInterface_001 {
    private static int m;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long d;
    private static long var_long_b;
    private static int i;
    private static int var_int_a;
    private static int f;
    private static int j;
    private static int k;
    private static int l;
    private static int n;
    private static int g;
    private static long h;
    private static long c;
    private static int e;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-1744366225216420974L);
        d = Long.reverse(0x1000000000000000L);
        e = (0 >>> 69 | 0 << -69) & 0xFFFFFFFF;
        f = 64 >>> 166 | 64 << -166;
        g = (-1 >>> 59 | -1 << ~59 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-591444720609573998L);
        i = 16 >>> 3 | 16 << -3;
        j = Integer.reverse(0);
        k = (0x8000000 >>> 251 | 0x8000000 << -251) & 0xFFFFFFFF;
        l = Integer.reverse(0);
        m = Integer.reverse(0x40000000);
        n = 64 >>> 5 | 64 << ~5 + 1;
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_534.b();
    }

    public NLoginCore_534() {
        Objects.requireNonNull(Player.class.getMethod((String)NLoginCore_534.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), new Class[e]));
        Class[] classArray = new Class[i];
        classArray[NLoginCore_534.j] = ChatMessageType.class;
        classArray[NLoginCore_534.k] = Array.newInstance(BaseComponent.class, l).getClass();
        Objects.requireNonNull(Player.Spigot.class.getMethod((String)NLoginCore_534.c("㺃", (int)(f & g), (long)h), classArray));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_534.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ԰ՕշնծմծՃ", (byte)55, 69), NLoginCore_534.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҴҟҨҹҾҷӀҽҹӁҫӀӓŅ", (byte)55, 65) + string + NLoginCore_223.B("ħ", (byte)55, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public void send(Player player, String string) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText((String)string));
    }

    private static String a(int n, long l) {
        l ^= 8L;
        l ^= 0x674C34EE1A41754DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(31 + 38), (byte)(5 + 78), (byte)(15 + 32), (byte)(22 + 45), (byte)(65 + 1), (byte)(38 + 29), (byte)(25 + 22), (byte)(20 + 60), (byte)(19 + 56), (byte)(62 + 5), (byte)(31 + 52), (byte)(39 + 14), (byte)(34 + 46), (byte)(91 + 6), (byte)(82 + 18), (byte)(10 + 90), (byte)(10 + 95), (byte)(37 + 73), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(52 + 17), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.A("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҞ҉ҒңҨҡҪҧңҫҕҪҽ", (byte)44, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_534.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 5314972965578953703L;
        long l = c ^ 0x674C34EE1A41754DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(33 + 36), (byte)(35 + 48), (byte)(37 + 10), 67, (byte)(29 + 37), (byte)(10 + 57), (byte)(35 + 12), (byte)(8 + 72), (byte)(58 + 17), (byte)(19 + 48), (byte)(42 + 41), (byte)(32 + 21), (byte)(14 + 66), (byte)(16 + 81), 100, (byte)(25 + 75), (byte)(77 + 28), (byte)(91 + 19), (byte)(85 + 18)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_534.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ҠӂҼһұӜӡҿӆӚӋҴ", (byte)61, 68);
                    NLoginCore_534.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ŝńŒųĮŷĴŤŌķŰųųŖŪĻŻŻŘŒźşŌō", (byte)61, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_534.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ӄӅӄҰӈҴӦҢӖӘӡҬҿӊҳӥӏҰӅҴҷӂҿӀ", (byte)61, 67);
                    NLoginCore_534.var_java_lang_String_arr_b[1] = NLoginCore_138.E("՝ՄՒճԮշԴդՌԷծՕ՘տիՖԸպ՞Վօ՟ՌՍ", (byte)61, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_534.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ŨŐŜŌŠŮŎŒŇňŏźŝŴŻŏŖļőĿŁŏŌō", (byte)61, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_534.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ţńōőŮŷŬŲŇŅŶŁ", (byte)61, 65);
                }
            }
        }
    }
}

