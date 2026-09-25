/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommand
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommand;
import com.nickuc.login.NLoginCore_538;
import com.nickuc.login.NLoginCore_380;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_361
implements NLoginInterface_003 {
    private static int o;
    private static int q;
    private static int e;
    private static String[] var_java_lang_String_arr_a;
    private static int l;
    private static int m;
    private static int p;
    private static int d;
    private static int g;
    private static long i;
    private static int var_int_b;
    private static int n;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_c;
    private static int j;
    private static int k;
    private static int var_int_a;
    private static int f;
    final /* synthetic */ NLoginCore_538 var_com_nickuc_login_NLoginCore_346_a;
    private static int h;

    private static String a(int n, long l) {
        l ^= 0x49L;
        l ^= 0xE9BA99DD48912352L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(40 + 29), (byte)(37 + 46), (byte)(39 + 8), (byte)(50 + 17), (byte)(62 + 4), (byte)(4 + 63), (byte)(20 + 27), 80, (byte)(52 + 23), (byte)(59 + 8), (byte)(81 + 2), (byte)(7 + 46), (byte)(58 + 22), (byte)(49 + 48), (byte)(78 + 22), 100, (byte)(60 + 45), (byte)(79 + 31), (byte)(73 + 30)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.E("ղտվՁցսոց֌ջՈֆ֊փֆ֌Վࣟࣄࢽࣤ࣠ࣤࣤࣟ࣢", (byte)83, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_361.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 3362893459413255222L;
        long l = var_long_c ^ 0xE9BA99DD48912352L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(41 + 28), (byte)(63 + 20), (byte)(8 + 39), (byte)(28 + 39), (byte)(22 + 44), (byte)(26 + 41), 47, (byte)(70 + 10), (byte)(12 + 63), (byte)(4 + 63), (byte)(45 + 38), (byte)(38 + 15), (byte)(24 + 56), (byte)(20 + 77), (byte)(68 + 32), 100, (byte)(3 + 102), (byte)(21 + 89), (byte)(45 + 58)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_361.var_java_lang_String_arr_b[0] = NLoginCore_004.A("ŌĻŊřŌőƇłƁĿŉŏ", (byte)68, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_361.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ՇՍՍզՓՈպոՔԸչՈ", (byte)68, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_361.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ӛҸӳӱӦӒԁӑӛӛӚӂԂӗӰһԋӦӅӬӆԅԈӺӱӟӱӢԋӴӬԓ", (byte)68, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_361.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ūŞŘšžšŢŰŨżłƉŅſŦƈšƋŦƌƐƃŚś", (byte)68, 65);
                }
            }
        }
    }

    @Generated
    private NLoginCore_361(NLoginCore_538 NLoginCore_346) {
        this.var_com_nickuc_login_NLoginCore_346_a = NLoginCore_346;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(-201326592);
        var_int_c = 8192 >>> 77 | 8192 << ~77 + 1;
        d = (0 >>> 54 | 0 << -54) & 0xFFFFFFFF;
        e = Integer.reverse(-201326592);
        f = 128 >>> 135 | 128 << -135;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0);
        i = Long.reverse(-133995776645343884L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (0 >>> 49 | 0 << -49) & 0xFFFFFFFF;
        l = (1024 >>> 42 | 1024 << -42) & 0xFFFFFFFF;
        m = (0x4000000 >>> 58 | 0x4000000 << ~58 + 1) & 0xFFFFFFFF;
        n = (0 >>> 91 | 0 << ~91 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(0);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = 1024 >>> 170 | 1024 << -170;
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_361.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_361.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.B("šƃƅťƉƨƠƶƢűƯƥƳƭŶƛƽƼƴƺƴƉ", (byte)93, 66), NLoginCore_361.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ࢜ࢁࡺࢡ࢝ࢡࢡ࢜࢟Ԡ", (byte)93, 67) + string + NLoginCore_138.E("Փ", (byte)93, 69) + methodType.toString(), exception);
        }
    }

    /* synthetic */ NLoginCore_361(NLoginCore_538 NLoginCore_346, NLoginCore_380 NLoginInterface_014) {
        this(NLoginCore_346);
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        String[] stringArray;
        Object object = packetReceiveEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_a).java_lang_Object_b().a(packetReceiveEvent.getPlayer());
        NLoginCore_509 NLoginCore_5092 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_a).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            packetReceiveEvent.setCancelled(var_int_a != 0);
            return;
        }
        WrapperPlayClientChatCommand wrapperPlayClientChatCommand = new WrapperPlayClientChatCommand(packetReceiveEvent);
        String string = wrapperPlayClientChatCommand.getCommand().trim();
        if (string.isEmpty()) {
            return;
        }
        String string2 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_a).com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, (char)var_int_b + string);
        if (string2 == null) {
            packetReceiveEvent.setCancelled(var_int_c != 0);
            return;
        }
        if (string2.charAt(d) == e) {
            string2 = string2.substring(f);
        }
        if (wrapperPlayClientChatCommand.getMessageSignData().getSaltSignature().getSignature().length == 0 && wrapperPlayClientChatCommand.getMessageSignData().getSaltSignature().getSalt() == 0L) {
            wrapperPlayClientChatCommand.setCommand(string2);
            packetReceiveEvent.markForReEncode(g != 0);
        }
        if ((stringArray = string.split((String)NLoginCore_361.c("㺀", (int)h, (long)i))).length < j) {
            return;
        }
        NLoginCore_466 NLoginCore_4662 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_a).com_nickuc_login_NLoginCore_276_a().com_nickuc_login_NLoginCore_466_a(stringArray[k].toLowerCase(Locale.ENGLISH));
        if (NLoginCore_4662 != null) {
            String[] stringArray2 = new String[stringArray.length - l];
            if (stringArray2.length > 0) {
                System.arraycopy(stringArray, m, stringArray2, n, stringArray2.length);
            }
            NLoginCore_4662.a(NLoginCore_277, NLoginCore_5092, stringArray[o], stringArray2);
        }
    }
}

