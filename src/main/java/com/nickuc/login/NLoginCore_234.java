/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerDisconnect
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerDisconnect
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerDisconnect
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerDisconnect;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerDisconnect;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerDisconnect;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_444;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
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
import net.kyori.adventure.text.Component;

public class NLoginCore_234 {
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_c;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static long var_long_b;
    private static long var_long_c;
    private static int f;
    private static long e;
    private static int g;

    private static void b() {
        int n;
        var_long_c = 5419621126376850088L;
        long l = var_long_c ^ 0xE0B9A4110EA384ECL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(62 + 7), (byte)(72 + 11), (byte)(37 + 10), (byte)(52 + 15), (byte)(62 + 4), (byte)(5 + 62), 47, (byte)(5 + 75), (byte)(14 + 61), (byte)(43 + 24), (byte)(79 + 4), (byte)(35 + 18), (byte)(49 + 31), (byte)(48 + 49), (byte)(67 + 33), (byte)(5 + 95), (byte)(9 + 96), 110, (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_234.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ԲՋՇՍՏԙԻԿՃՙ՟ՑՄէԽժՇդդթեԭՎՉԲզաիԯ՗ոիժ՚կ՘՘ՋցԷչ՛պջՒըՅ՗Չւ՗վ֍՗ՔՕ", (byte)100, 68);
                    NLoginCore_234.var_java_lang_String_arr_b[1] = NLoginCore_201.F("֒ՐՕզթիըֈ՞֟ձխվ֒ա֒֗յ֣ք։ֆճմ", (byte)100, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_234.var_java_lang_String_arr_b[0] = NLoginCore_384.E("ձ֊ֆ֌֎՘պվւ֘֞֐փ֦ռ֩ֆ֣֣֤֨լ֍ֈձ֥֪֠ծַ֖֪֮֩֙֗֗֊׀նָֹ֚֚֔փ֚֕֜։ׇָ֟׌֓֔", (byte)100, 69);
                    NLoginCore_234.var_java_lang_String_arr_b[1] = NLoginCore_559.B("ƹŷżƍƐƒƏƯƅǆƙŽƆƕǃƉƋǀƧƍƯǓƚƛ", (byte)100, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_234.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ԒԥԩԶԻՋԷԗԱՖՄԩ", (byte)100, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_234.var_java_lang_String_arr_b[0] = NLoginCore_173.F("ճծ՚Փխմս֔֝ճփը", (byte)100, 70);
                }
            }
        }
    }

    public static void a(User user, Component component) {
        switch (NLoginCore_444.R[user.getEncoderState().ordinal()]) {
            case 1: {
                user.sendPacketSilently((PacketWrapper)new WrapperLoginServerDisconnect(component));
                break;
            }
            case 2: {
                user.sendPacketSilently((PacketWrapper)new WrapperConfigServerDisconnect(component));
                break;
            }
            case 3: {
                user.sendPacketSilently((PacketWrapper)new WrapperPlayServerDisconnect(component));
                break;
            }
            default: {
                user.closeConnection();
                throw new IllegalStateException((String)NLoginCore_234.c("㺀", (int)var_int_a, (long)var_long_b) + user.getEncoderState() + (String)NLoginCore_234.c("㺃", (int)var_int_c, (long)(d ^ e)) + user.getDecoderState());
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(5134287660943830226L);
        var_int_c = 0x2000000 >>> 89 | 0x2000000 << ~89 + 1;
        d = Long.reverse(1531407959047433426L);
        e = Long.reverse(0x5200000000000000L);
        f = Integer.reverse(0x40000000);
        g = (0x4000000 >>> 89 | 0x4000000 << ~89 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_234.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_234.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 65), NLoginCore_234.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖ࠙࠮ࠦࠩ࠰࠲ࠤ࠘Ҫ", (byte)54, 68) + string + NLoginCore_559.C("ґ", (byte)54, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x4AL;
        l ^= 0xE0B9A4110EA384ECL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(67 + 2), (byte)(22 + 61), 47, (byte)(34 + 33), (byte)(9 + 57), (byte)(10 + 57), (byte)(36 + 11), (byte)(72 + 8), (byte)(32 + 43), (byte)(19 + 48), (byte)(29 + 54), (byte)(48 + 5), (byte)(15 + 65), 97, (byte)(22 + 78), (byte)(62 + 38), (byte)(69 + 36), (byte)(71 + 39), (byte)(40 + 63)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.F("ԷՄՃԆՆՂԽՆՑՀԍՋՏՈՋՑԓ࢖ࢫࢣࢦࢭࢯࢡ࢕", (byte)24, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_234.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static void j(User user, String string) {
        NLoginCore_234.a(user, (Component)Component.translatable((String)string));
    }

    public static void i(User user, String string) {
        NLoginCore_234.a(user, (Component)NLoginCore_529.a(string));
    }
}

