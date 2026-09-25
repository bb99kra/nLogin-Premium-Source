/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerSystemChatMessage
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.TranslatableComponent
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerSystemChatMessage;
import com.nickuc.login.NLoginCore_538;
import com.nickuc.login.NLoginCore_380;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TranslatableComponent;

public class NLoginCore_312
implements NLoginInterface_043 {
    private static long c;
    final /* synthetic */ NLoginCore_538 var_com_nickuc_login_NLoginCore_346_d;
    private static long l;
    private static int t;
    private static int i;
    private static int h;
    private static long var_long_b;
    private static long g;
    private static int m;
    private static int p;
    private static int q;
    private static long o;
    private static int f;
    private static int k;
    private static int r;
    private static int e;
    private static int n;
    private static int s;
    private static int var_int_a;
    private static long j;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_d;

    private static String a(int n, long l) {
        l ^= 0x74L;
        l ^= 0xA1351B3DC0D321E8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(8 + 61), (byte)(40 + 43), 47, (byte)(59 + 8), (byte)(51 + 15), (byte)(35 + 32), (byte)(9 + 38), (byte)(65 + 15), (byte)(48 + 27), (byte)(22 + 45), (byte)(37 + 46), (byte)(50 + 3), (byte)(19 + 61), (byte)(44 + 53), (byte)(19 + 81), (byte)(14 + 86), (byte)(91 + 14), 110, (byte)(49 + 54)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.D("ҨҵҴѷҷҳҮҷӂұѾҼӀҹҼӂ҄ߩ࠘߬࠙߭࠘ࠤࠃࠒࠣ", (byte)48, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_312.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /* synthetic */ NLoginCore_312(NLoginCore_538 NLoginCore_346, NLoginCore_380 NLoginInterface_014) {
        this(NLoginCore_346);
    }

    static {
        var_int_a = (0 >>> 200 | 0 << -200) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-2841737251413641469L);
        var_long_d = Long.reverse(0x2E00000000000000L);
        e = (0x8000000 >>> 155 | 0x8000000 << -155) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = Long.reverse(-680009430275803389L);
        h = (0 >>> 233 | 0 << ~233 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-680009430275803389L);
        k = (24576 >>> 173 | 24576 << -173) & 0xFFFFFFFF;
        l = Long.reverse(-680009430275803389L);
        m = 0 >>> 70 | 0 << -70;
        n = 256 >>> 230 | 256 << -230;
        o = Long.reverse(-680009430275803389L);
        p = 0x800000 >>> 183 | 0x800000 << ~183 + 1;
        q = Integer.reverse(-268435456);
        r = (8 >>> 35 | 8 << -35) & 0xFFFFFFFF;
        s = Integer.reverse(-1610612736);
        t = Integer.reverse(-1610612736);
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_312.b();
    }

    private static void b() {
        int n;
        c = -4544837818660681445L;
        long l = c ^ 0xA1351B3DC0D321E8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(9 + 60), 83, (byte)(20 + 27), (byte)(41 + 26), (byte)(38 + 28), (byte)(14 + 53), (byte)(30 + 17), (byte)(79 + 1), (byte)(33 + 42), (byte)(40 + 27), (byte)(47 + 36), (byte)(29 + 24), (byte)(13 + 67), (byte)(48 + 49), (byte)(37 + 63), (byte)(49 + 51), (byte)(5 + 100), 110, (byte)(52 + 51)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_312.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ФѝўвОгыуљюрѣуѣўчпыЧѬююкѭѝЭѬъѦѓжѯѲкћџѻџїѹўкпћєѣѧъфѥѭюѼјѕі", (byte)15, 68);
                    NLoginCore_312.var_java_lang_String_arr_b[1] = NLoginCore_427.B("ćĀĊçďíęÜćĈ×õĀĝĚûĞĤñòĕĜĈĜĢďđñÿąĢĦñĉĊĪđĦćĳĖ÷öįĀģþĕĽĴĥđĀĹĐđ", (byte)15, 66);
                    NLoginCore_312.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ßĘęíÙîĆþĔĉûĞþĞęĂúĆâħĉĉõĨĘèħąġĎñĪĭõĖĚĶĚĒĴęõúĖďĞĢąÿĠĨĉķēĐđ", (byte)15, 65);
                    NLoginCore_312.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ÒĎđÏéøóęÜÚĊå", (byte)15, 66);
                    NLoginCore_312.var_java_lang_String_arr_b[4] = NLoginCore_076.E("ՅԄԑԚԅԿԆԹԟԸԧԮԈԲՅԭՎՇԍՃ՗ԡՌՇԦԹԭՋԱԪԠԹՑգԠԴՇԢԧՔՆՅ՜ԺգՏճԩՇՇԯՄղՁԾԿ", (byte)15, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_312.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԍՆՇԛԇԜԴԬՂԷԩՌԬՌՇ԰ԨԴԐՕԷԷԣՖՆԖՕԳՏԼԟ՘՛ԣՄՈդՈՀբՇԣԨՁծկՌՒէՕժՀթՑԾԿ", (byte)15, 69);
                    NLoginCore_312.var_java_lang_String_arr_b[1] = NLoginCore_092.B("ćĀĊçďíęÜćĈ×õĀĝĚûĞĤñòĕĜĈĜĢďđñÿąĢĦñĉĊĪđĦćĳĖ÷öěĚúýĂďęĞķăĄĔĮĬłŀĥōąňĭ", (byte)15, 66);
                    NLoginCore_312.var_java_lang_String_arr_b[2] = NLoginCore_223.C("ФѝўвОгыуљюрѣуѣўчпыЧѬююкѭѝЭѬъѦѓжѯѲкћџѻџїѹўкоїѳѦҁѺѣѥѧѠшҎѕі", (byte)15, 67);
                    NLoginCore_312.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ÍòĖČčïäĊĆëĎå", (byte)15, 66);
                    NLoginCore_312.var_java_lang_String_arr_b[4] = NLoginCore_027.E("ՅԄԑԚԅԿԆԹԟԸԧԮԈԲՅԭՎՇԍՃ՗ԡՌՇԦԹԭՋԱԪԠԹՑգԠԴՇԢԧՔՆՅ՟՜ՍՆՋՏբԲկհՍՁԾԿ", (byte)15, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_312.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ãÕĖÕĒČùĆĎêÛéâëþĎûâĖñĉóðñ", (byte)15, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_312.var_java_lang_String_arr_b[0] = NLoginCore_223.C("јЫЪіЖакДџѥПфтѣхѝщТнѡпѮеж", (byte)15, 67);
                }
            }
        }
    }

    @Generated
    private NLoginCore_312(NLoginCore_538 NLoginCore_346) {
        this.var_com_nickuc_login_NLoginCore_346_d = NLoginCore_346;
    }

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        Object object;
        WrapperPlayServerSystemChatMessage wrapperPlayServerSystemChatMessage;
        if (!NLoginCore_532.an.ar()) {
            return;
        }
        Object object2 = packetSendEvent.getPlayer();
        if (object2 == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_d).java_lang_Object_b().a(object2);
        NLoginCore_509 NLoginCore_5092 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_d).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            return;
        }
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
            return;
        }
        try {
            wrapperPlayServerSystemChatMessage = new WrapperPlayServerSystemChatMessage(packetSendEvent);
        }
        catch (Throwable throwable) {
            if (NLoginCore_370.aj() || !(throwable instanceof IllegalArgumentException)) {
                NLoginCore_370.c((String)NLoginCore_312.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)) + NLoginCore_277.getName() + (String)NLoginCore_312.c("㺃", (int)(e & f), (long)g), throwable, new Object[h]);
            } else {
                NLoginCore_370.c((String)NLoginCore_312.c("㺆", (int)i, (long)j) + NLoginCore_277.getName() + (String)NLoginCore_312.c("㺉", (int)k, (long)l) + throwable.getMessage(), new Object[m]);
            }
            return;
        }
        if (wrapperPlayServerSystemChatMessage.isOverlay()) {
            return;
        }
        Component component = wrapperPlayServerSystemChatMessage.getMessage();
        if (component instanceof TranslatableComponent) {
            object = (TranslatableComponent)component;
            if (((String)NLoginCore_312.c("㺌", (int)n, (long)o)).equals(object.key())) {
                packetSendEvent.setCancelled(p != 0);
                return;
            }
        }
        if ((object = NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_l, string -> new ArrayList())).size() < q) {
            object.add(component);
        }
        packetSendEvent.setCancelled(r != 0);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_312.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("һӝӟҿӣԂӺԐӼӋԉӿԍԇӐӵԗԖԎԔԎӣ", (byte)74, 68), NLoginCore_312.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.E("թնյԸոմկոփղԿսցպսփՅࢪࣙࢭࣚࢮࣙࣥࣄ࣓ࣤ՛", (byte)74, 69) + string + NLoginCore_453.C("Ӎ", (byte)74, 67) + methodType.toString(), exception);
        }
    }
}

