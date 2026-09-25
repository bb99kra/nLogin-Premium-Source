/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.PacketEvents
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.item.ItemStack
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerWindowItems
 *  io.netty.channel.Channel
 *  lombok.Generated
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.item.ItemStack;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerWindowItems;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_405;
import com.nickuc.login.NLoginCore_309;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_370;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_349 {
    private static int k;
    private static int l;
    private static int var_int_a;
    private static long e;
    private static int d;
    private static int n;
    private static String[] var_java_lang_String_arr_a;
    private static final int ai;
    private static int o;
    private static String[] var_java_lang_String_arr_b;
    private static long f;
    private static int m;
    private static final int ah;
    private static int var_int_c;
    private static final WrapperPlayServerWindowItems var_com_nickuc_login_lib_packetevents_api_wrapper_play_server_WrapperPlayServerWindowItems_a;
    private static final int ak;
    private static int j;
    private final NLoginType_008 w;
    public final NLoginCore_405 var_com_nickuc_login_NLoginCore_405_a = new NLoginCore_405(this);
    public final NLoginCore_309 var_com_nickuc_login_NLoginCore_309_a = new NLoginCore_309(this);
    private static int h;
    private static final int aj;
    private static int p;
    private static int q;
    private static int g;
    private static final int al;
    private static long var_long_c;
    private static int i;
    private static int var_int_b;

    @Generated
    public NLoginCore_349(NLoginType_008 NLoginType_008) {
        this.w = NLoginType_008;
    }

    private boolean az() {
        return (!NLoginCore_532.x.ar() ? var_int_a : var_int_b) != 0;
    }

    static /* synthetic */ void a(NLoginCore_349 NLoginCore_349, PacketSendEvent packetSendEvent, int n) {
        NLoginCore_349.a(packetSendEvent, n);
    }

    static /* synthetic */ boolean a(NLoginCore_349 NLoginCore_349) {
        return NLoginCore_349.az();
    }

    private void a(PacketSendEvent packetSendEvent, int n) {
        if (n != 0) {
            return;
        }
        Player player = (Player)packetSendEvent.getPlayer();
        if (player == null || !this.w.com_nickuc_login_NLoginCore_187_a().boolean_b(this.w.java_lang_Object_b().a(player))) {
            packetSendEvent.setCancelled(var_int_c != 0);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2BL;
        l ^= 0x9DF479E324114852L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(66 + 3), (byte)(42 + 41), 47, (byte)(22 + 45), (byte)(6 + 60), (byte)(35 + 32), (byte)(38 + 9), (byte)(22 + 58), (byte)(66 + 9), (byte)(56 + 11), (byte)(9 + 74), (byte)(12 + 41), (byte)(11 + 69), 97, (byte)(93 + 7), (byte)(53 + 47), (byte)(16 + 89), (byte)(85 + 25), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ӹԆԅӈԈԄӿԈԓԂӏԍԑԊԍԓӕࡂࡈࡲ࡭࡬ࡢࡲࡵࡦ", (byte)75, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_349.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = (0 >>> 29 | 0 << ~29 + 1) & 0xFFFFFFFF;
        e = Long.reverse(-830314656285576930L);
        f = Long.reverse(-3170534137668829184L);
        g = 0 >>> 109 | 0 << ~109 + 1;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (4 >>> 226 | 4 << -226) & 0xFFFFFFFF;
        j = 10 >>> 1 | 10 << ~1 + 1;
        k = Integer.reverse(-1879048192);
        l = 0 >>> 219 | 0 << -219;
        m = 864 >>> 37 | 864 << ~37 + 1;
        n = 64 >>> 196 | 64 << -196;
        o = (0x5A00000 >>> 85 | 0x5A00000 << ~85 + 1) & 0xFFFFFFFF;
        p = (0 >>> 246 | 0 << ~246 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_349.b();
        ai = j;
        al = k;
        ah = l;
        ak = m;
        aj = n;
        Object[] objectArray = new ItemStack[o];
        Arrays.fill(objectArray, ItemStack.EMPTY);
        var_com_nickuc_login_lib_packetevents_api_wrapper_play_server_WrapperPlayServerWindowItems_a = new WrapperPlayServerWindowItems(p, q, Arrays.asList(objectArray), null);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_349.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 66), NLoginCore_349.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢄࢊࢴࢯࢮࢤࢴࢷࢨԬ", (byte)28, 70) + string + NLoginCore_223.E("Ԓ", (byte)28, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 8686372911969492527L;
        long l = var_long_c ^ 0x9DF479E324114852L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(40 + 29), (byte)(2 + 81), (byte)(44 + 3), (byte)(15 + 52), (byte)(51 + 15), (byte)(3 + 64), (byte)(28 + 19), (byte)(4 + 76), (byte)(39 + 36), 67, (byte)(2 + 81), (byte)(24 + 29), (byte)(21 + 59), (byte)(77 + 20), (byte)(84 + 16), 100, (byte)(52 + 53), (byte)(39 + 71), (byte)(94 + 9)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_349.var_java_lang_String_arr_b[0] = NLoginCore_384.E("գթռց՟ղ՛֋Ջ֌Վ֒իթ֊օթ֐Ֆ֘՜տ֕պղ֣֞բրֈ֙շֈրպ֐փֲ֋ղְֈְַոոպ֧֤֦֪֜֐֎ַ֖׀֏ׇ׈ֹׁ֙ց", (byte)87, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_349.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ŽƃƖƛŹƌŵƥťƦŨƬƅƃƤƟƃƪŰƲŶƙƯƔƌƸƽżƚƢƳƑƢƚƔƪƝǌƥƌǊƢǊǑƒƒƔǁƾǀǄƶƪƨǕƲƗƻƫưǣǒǛǦƣƙǀǢƽǄǪǄǎƧǚƵ", (byte)87, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_349.var_java_lang_String_arr_b[0] = NLoginCore_092.D("ԑԦԁԍԧԸԴԔԄԍӺԏԒԯՁԑӹԒԱ԰԰ԐԑԼԔԔՇԉԇԥՇԝ", (byte)87, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_349.var_java_lang_String_arr_b[0] = NLoginCore_223.E("֊փՠլՂ֑՞ր՞֎ՑՎՠխբՕ՗֏չՖՠ֟զէ", (byte)87, 69);
                }
            }
        }
    }

    public void a(Channel channel) {
        try {
            PacketEvents.getAPI().getProtocolManager().sendPacketSilently((Object)channel, (PacketWrapper)var_com_nickuc_login_lib_packetevents_api_wrapper_play_server_WrapperPlayServerWindowItems_a);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_349.c("㺀", (int)d, (long)(e ^ f)), exception, new Object[g]);
        }
    }
}

