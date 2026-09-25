/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatMessage
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerChatMessage
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerChatMessage;
import com.nickuc.login.NLoginCore_538;
import com.nickuc.login.NLoginCore_380;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginCore_543
implements NLoginInterface_003,
NLoginInterface_043 {
    private static int r;
    private static int p;
    private static int d;
    private static long j;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static int var_int_a;
    private static int h;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int o;
    private static int var_int_b;
    private static long i;
    private static int s;
    final /* synthetic */ NLoginCore_538 var_com_nickuc_login_NLoginCore_346_c;
    private static int t;
    private static int u;
    private static int k;
    private static int var_int_c;
    private static int e;
    private static int m;
    private static int n;
    private static int l;
    private static int q;

    /* synthetic */ NLoginCore_543(NLoginCore_538 NLoginCore_346, NLoginCore_380 NLoginInterface_014) {
        this(NLoginCore_346);
    }

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        if (!NLoginCore_532.an.ar()) {
            return;
        }
        Object object = packetSendEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).java_lang_Object_b().a(object);
        NLoginCore_509 NLoginCore_5092 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            return;
        }
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
            return;
        }
        WrapperPlayServerChatMessage wrapperPlayServerChatMessage = new WrapperPlayServerChatMessage(packetSendEvent);
        ChatMessage chatMessage = wrapperPlayServerChatMessage.getMessage();
        if (chatMessage.getType() == ChatTypes.GAME_INFO) {
            return;
        }
        Component component = chatMessage.getChatContent();
        List list = NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_l, string -> new ArrayList());
        if (list.size() < r) {
            list.add(component);
        }
        packetSendEvent.setCancelled(s != 0);
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        Object object = packetReceiveEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).java_lang_Object_b().a(object);
        NLoginCore_509 NLoginCore_5092 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            packetReceiveEvent.setCancelled(var_int_a != 0);
            return;
        }
        WrapperPlayClientChatMessage wrapperPlayClientChatMessage = new WrapperPlayClientChatMessage(packetReceiveEvent);
        String string = wrapperPlayClientChatMessage.getMessage();
        if ((string = string.trim()).isEmpty()) {
            return;
        }
        if (string.charAt(var_int_b) == var_int_c) {
            String string2 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, string);
            if (string2 == null) {
                packetReceiveEvent.setCancelled(d != 0);
                return;
            }
            wrapperPlayClientChatMessage.setMessage(string2);
            packetReceiveEvent.markForReEncode(e != 0);
            if (string.length() < f) {
                return;
            }
            String[] stringArray = string.substring(g).split((String)NLoginCore_543.c("㺀", (int)h, (long)(i ^ j)));
            if (stringArray.length < k) {
                return;
            }
            NLoginCore_466 NLoginCore_4662 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).com_nickuc_login_NLoginCore_276_a().com_nickuc_login_NLoginCore_466_a(stringArray[l].toLowerCase(Locale.ENGLISH));
            if (NLoginCore_4662 != null) {
                String[] stringArray2 = new String[stringArray.length - m];
                if (stringArray2.length > 0) {
                    System.arraycopy(stringArray, n, stringArray2, o, stringArray2.length);
                }
                NLoginCore_4662.a(NLoginCore_277, NLoginCore_5092, stringArray[p], stringArray2);
            }
        } else if (NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_c).com_nickuc_login_NLoginCore_056_b().boolean_a(NLoginCore_277, string)) {
            packetReceiveEvent.setCancelled(q != 0);
        }
    }

    private static void b() {
        int n;
        var_long_c = 3604222655857859764L;
        long l = var_long_c ^ 0x2B4A587ED099E120L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(66 + 17), (byte)(21 + 26), (byte)(39 + 28), (byte)(61 + 5), (byte)(18 + 49), (byte)(19 + 28), (byte)(27 + 53), (byte)(45 + 30), (byte)(19 + 48), (byte)(59 + 24), (byte)(8 + 45), (byte)(5 + 75), (byte)(64 + 33), (byte)(49 + 51), (byte)(33 + 67), (byte)(33 + 72), (byte)(78 + 32), (byte)(79 + 24)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
                    NLoginCore_543.var_java_lang_String_arr_b[0] = NLoginCore_201.C("њѧћѽѵѹқҁћџѴѩ", (byte)36, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_543.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ľėúįēĭŀĂĴĦĴď", (byte)36, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_543.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ĲĖĚĂľĥĿćłĖĴď", (byte)36, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_543.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ķüĚĶöĘĲýġğĠŊĖĮŉėŇĲĄěĽŇĞŉĭĕņĘŊĥŒĨ", (byte)36, 65);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_543.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.C("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 67), NLoginCore_543.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐ҂ҞҕҞ҆Қң҄ҲҡҳҤңĩ", (byte)41, 65) + string + NLoginCore_223.E("ԟ", (byte)41, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_543(NLoginCore_538 NLoginCore_346) {
        this.var_com_nickuc_login_NLoginCore_346_c = NLoginCore_346;
    }

    private static String a(int n, long l) {
        l ^= 0x53L;
        l ^= 0x2B4A587ED099E120L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(61 + 8), (byte)(43 + 40), (byte)(32 + 15), (byte)(46 + 21), (byte)(49 + 17), (byte)(33 + 34), (byte)(42 + 5), (byte)(44 + 36), 75, 67, (byte)(11 + 72), (byte)(5 + 48), (byte)(42 + 38), (byte)(14 + 83), (byte)(79 + 21), (byte)(60 + 40), (byte)(34 + 71), (byte)(18 + 92), (byte)(91 + 12)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.D("ыјїКњіёњѥєСџѣќџѥЧޙ޵ެ޵ޝޱ޺ޛ߉޸ߊ޻޺", (byte)17, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_543.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 110 | 0 << ~110 + 1;
        var_int_c = Integer.reverse(-201326592);
        d = Integer.reverse(Integer.MIN_VALUE);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(0x40000000);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = 0 >>> 98 | 0 << ~98 + 1;
        i = Long.reverse(3258719003570544716L);
        j = Long.reverse(-3891110078048108544L);
        k = 16 >>> 196 | 16 << ~196 + 1;
        l = Integer.reverse(0);
        m = 4 >>> 34 | 4 << ~34 + 1;
        n = (0x20000000 >>> 189 | 0x20000000 << ~189 + 1) & 0xFFFFFFFF;
        o = 0 >>> 0 | 0 << ~0 + 1;
        p = Integer.reverse(0);
        q = 262144 >>> 114 | 262144 << -114;
        r = 0x3C000000 >>> 90 | 0x3C000000 << ~90 + 1;
        s = Integer.reverse(Integer.MIN_VALUE);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = 2048 >>> 11 | 2048 << ~11 + 1;
        var_java_lang_String_arr_a = new String[t];
        var_java_lang_String_arr_b = new String[u];
        NLoginCore_543.b();
    }
}

