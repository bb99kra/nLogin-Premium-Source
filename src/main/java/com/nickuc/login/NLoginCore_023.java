/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.PacketEvents
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientSelectKnownPacks
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientSelectKnownPacks;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_206;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_032;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_096;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
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

public class NLoginCore_023
implements NLoginInterface_003 {
    private static long e;
    private static int g;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_c;
    private static long f;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    final /* synthetic */ NLoginCore_206 var_com_nickuc_login_NLoginCore_206_d;
    private static int var_int_d;
    private static int h;
    private static String[] var_java_lang_String_arr_b;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_023.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("҈ҪҬҌҰӏӇӝӉҘӖӌӚӔҝӂӤӣӛӡӛҰ", (byte)57, 67), NLoginCore_023.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİҴҖӈӃҬҚӐҽń", (byte)57, 66) + string + NLoginCore_559.C("Қ", (byte)57, 67) + methodType.toString(), exception);
        }
    }

    private void a(User user, PacketWrapper<?> packetWrapper) {
        if (NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_d).com_nickuc_login_NLoginCore_364_b().a().L()) {
            Channel channel = (Channel)user.getChannel();
            packetWrapper.prepareForSend((Object)channel, var_int_b != 0, var_int_c != 0);
            ByteBuf byteBuf = (ByteBuf)packetWrapper.buffer;
            if (byteBuf == null) {
                throw new IllegalStateException((String)NLoginCore_023.c("㺀", (int)var_int_d, (long)(e ^ f)));
            }
            if (ChannelHelper.isOpen((Object)channel)) {
                ChannelHelper.fireChannelReadInContext((Object)channel, (String)PacketEvents.DECODER_NAME, (Object)byteBuf);
            } else {
                byteBuf.release();
            }
        } else {
            user.receivePacketSilently(packetWrapper);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x41L;
        l ^= 0x3C5A720DD64808CAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(10 + 59), (byte)(38 + 45), (byte)(41 + 6), 67, (byte)(17 + 49), (byte)(32 + 35), (byte)(27 + 20), (byte)(62 + 18), (byte)(22 + 53), (byte)(4 + 63), (byte)(3 + 80), (byte)(29 + 24), (byte)(15 + 65), 97, (byte)(30 + 70), (byte)(95 + 5), (byte)(90 + 15), (byte)(4 + 106), (byte)(29 + 74)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("ռ։ֈՋ֋ևւ֋֖օՒ֐֔֍֐֖՘ࣜࢾࣰ࣫ࣔࣂࣸࣥ", (byte)93, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_023.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0 >>> 163 | 0 << -163) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = Integer.reverse(0);
        e = Long.reverse(4887550275829466299L);
        f = Long.reverse(-9079256848778919936L);
        g = (0x4000000 >>> 218 | 0x4000000 << -218) & 0xFFFFFFFF;
        h = (0x400000 >>> 182 | 0x400000 << -182) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_023.b();
    }

    private static void b() {
        int n;
        var_long_c = -2512527859998250046L;
        long l = var_long_c ^ 0x3C5A720DD64808CAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(35 + 34), (byte)(54 + 29), (byte)(41 + 6), 67, (byte)(51 + 15), 67, (byte)(2 + 45), (byte)(38 + 42), (byte)(38 + 37), (byte)(58 + 9), (byte)(31 + 52), (byte)(5 + 48), (byte)(48 + 32), (byte)(64 + 33), (byte)(59 + 41), (byte)(54 + 46), (byte)(67 + 38), (byte)(103 + 7), (byte)(67 + 36)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_023.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ĺĂĹĕąėŋŊğħĥĬĊŌĽŒĳŇďĒĚŐŏĮŕěĽĘŠńńĹ", (byte)39, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_023.var_java_lang_String_arr_b[0] = NLoginCore_223.D("җџҖѲѢѴҨҧѼ҄҂҉ѧҩҚүҐҤѬѯѷҫҦҎҊүҪҩ҉ҫҵұѽҁҕҏӇҔҥѼҠӃӋҒ", (byte)39, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_023.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ҎҜғѦҜѵѲқҟ҈ѫ҉Ѽѯ҉ҌѲҦҧѵѳҶѽѾ", (byte)39, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_023.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ѮѬѹ҇Җ҈ѵѥ҇ҊҦҨҐҤѭѯҌѽҪҴ҈ҀҡҖҜҘҫҩғҸҸѿ", (byte)39, 67);
                }
            }
        }
    }

    public NLoginCore_023(NLoginCore_206 NLoginCore_2062) {
        this.var_com_nickuc_login_NLoginCore_206_d = NLoginCore_2062;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        NLoginInterface_032 NLoginInterface_0322;
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        if (!channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c)) {
            return;
        }
        NLoginCore_096 NLoginCore_0962 = (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get();
        if (NLoginCore_0962 == null || NLoginCore_0962.var_byte_f != 0) {
            return;
        }
        WrapperConfigClientSelectKnownPacks wrapperConfigClientSelectKnownPacks = new WrapperConfigClientSelectKnownPacks(packetReceiveEvent);
        User user = packetReceiveEvent.getUser();
        if (this.var_com_nickuc_login_NLoginCore_206_d.a(user, NLoginInterface_0322 = bl -> {
            if (bl) {
                this.a(user, (PacketWrapper<?>)wrapperConfigClientSelectKnownPacks);
            }
        })) {
            if (NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_d).L()) {
                Object object = packetReceiveEvent.getPlayer();
                if (object != null) {
                    NLoginCore_277 NLoginCore_277 = NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_d).java_lang_Object_b().a(object);
                    NLoginCore_509 NLoginCore_5092 = NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_d).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                    NLoginType_010 NLoginType_0102 = (NLoginType_010)NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_d).c();
                    String string = NLoginType_0102.java_lang_String_a(NLoginCore_277);
                    if (string != null) {
                        NLoginType_0102.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, NLoginCore_5092, string);
                    }
                }
                packetReceiveEvent.setCancelled(var_int_a != 0);
            }
        } else {
            channel.attr((AttributeKey)NLoginCore_096.var_long_c).set(null);
        }
    }
}

