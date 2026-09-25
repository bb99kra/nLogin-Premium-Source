/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.exception.InvalidHandshakeException
 *  com.nickuc.login.lib.packetevents.api.wrapper.handshaking.client.WrapperHandshakingClientHandshake
 *  com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.exception.InvalidHandshakeException;
import com.nickuc.login.lib.packetevents.api.wrapper.handshaking.client.WrapperHandshakingClientHandshake;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_306;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_451;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_041
implements NLoginInterface_003 {
    private static int f;
    private static long j;
    private static long var_long_c;
    private static int k;
    private static int var_int_b;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static int l;
    private static int e;
    private static int var_int_c;
    private static int var_int_a;
    private static int d;
    private static int h;
    private static String[] var_java_lang_String_arr_b;
    private static long i;

    private static String z(String string) {
        String string2 = string;
        int n = string2.indexOf(var_int_a);
        if (n > var_int_b) {
            string2 = string.substring(var_int_c, n);
        }
        if (!string2.isEmpty() && string2.charAt(string2.length() - d) == e) {
            string2 = string2.substring(f, string2.length() - g);
        }
        return string2;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_041.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("ӄӦӨӈӬԋԃԙԅӔԒԈԖԐәӾԠԟԗԝԗӬ", (byte)77, 67), NLoginCore_041.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӍӓӪӫӑӏӓӚӶŭ", (byte)77, 65) + string + NLoginCore_223.B("œ", (byte)77, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0x2C6CF776C9B08D0CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(7 + 62), (byte)(76 + 7), (byte)(45 + 2), (byte)(18 + 49), (byte)(63 + 3), (byte)(43 + 24), (byte)(16 + 31), 80, (byte)(5 + 70), (byte)(56 + 11), (byte)(72 + 11), (byte)(27 + 26), (byte)(8 + 72), (byte)(41 + 56), (byte)(52 + 48), (byte)(38 + 62), (byte)(101 + 4), 110, (byte)(93 + 10)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(48 + 35)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.B("ǊǗǖƙǙǕǐǙǤǓƠǞǢǛǞǤƦԛԡԸԹԟԝԡԨՄ", (byte)116, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_041.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        var_int_c = (0 >>> 81 | 0 << ~81 + 1) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = (736 >>> 196 | 736 << -196) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = (262144 >>> 82 | 262144 << -82) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        i = Long.reverse(8342817736012217178L);
        j = Long.reverse(0x5C00000000000000L);
        k = 32 >>> 5 | 32 << -5;
        l = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_041.b();
    }

    private static void b() {
        int n;
        var_long_c = 6547225858919490510L;
        long l = var_long_c ^ 0x2C6CF776C9B08D0CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(43 + 26), (byte)(82 + 1), (byte)(28 + 19), (byte)(24 + 43), (byte)(52 + 14), (byte)(65 + 2), (byte)(29 + 18), (byte)(2 + 78), (byte)(53 + 22), (byte)(27 + 40), (byte)(31 + 52), (byte)(46 + 7), (byte)(57 + 23), (byte)(36 + 61), (byte)(87 + 13), 100, (byte)(32 + 73), (byte)(103 + 7), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
                    NLoginCore_041.var_java_lang_String_arr_b[0] = NLoginCore_427.F("ՐԪԙ՘ԥՎ՟՛ԯ՘ԚՒԤՃՂԠՖԟ՗՛Չ՛ՌՂԨՆՎՏդՑՅշՏՈիճԳՏԼլճսովրքգշմթն՘նՕՒՓ", (byte)35, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_041.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ҏѩјҗѤҍҞҚѮҗљґѣ҂ҁџҕўҖҚ҈Қҋҁѧ҅ҍҎңҐ҄ҶҎ҇ҪҲѲҎѻҫҲҼҸҭҋҀ҅ҜҲҷҳӀ҂ҔґҒ", (byte)35, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_041.var_java_lang_String_arr_b[0] = NLoginCore_110.C("҇ѦѨ҉Ҝ҆ҎҍҒҙҒҚ҂ѾѡҦҡѤ҆ҔѷѦ҂ҀҌѬ҉ѾҴҢѫҍ", (byte)35, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_041.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ĔđĹīùėłĤĄăĶŇňĬėļĠĦČăŋŁĘę", (byte)35, 66);
                }
            }
        }
    }

    private static Object a(Channel channel) {
        for (Map.Entry entry : channel.pipeline()) {
            if (!SpigotReflectionUtil.NETWORK_MANAGER_CLASS.isAssignableFrom(((ChannelHandler)entry.getValue()).getClass())) continue;
            return entry.getValue();
        }
        throw new IllegalArgumentException((String)NLoginCore_041.c("㺀", (int)h, (long)(i ^ j)) + channel);
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        WrapperHandshakingClientHandshake wrapperHandshakingClientHandshake;
        try {
            wrapperHandshakingClientHandshake = new WrapperHandshakingClientHandshake(packetReceiveEvent);
        }
        catch (InvalidHandshakeException invalidHandshakeException) {
            return;
        }
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        channel.attr(NLoginCore_306.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_306__d).set((Object)new NLoginCore_306(wrapperHandshakingClientHandshake.getProtocolVersion(), NLoginCore_041.z(wrapperHandshakingClientHandshake.getServerAddress()), NLoginCore_041.a(channel)));
    }
}

