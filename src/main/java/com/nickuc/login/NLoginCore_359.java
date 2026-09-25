/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientPluginMessage
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientPluginMessage;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_433;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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
import org.bukkit.entity.Player;

public class NLoginCore_359
implements NLoginInterface_003 {
    private static int f;
    private static int g;
    final /* synthetic */ NLoginCore_433 var_com_nickuc_login_NLoginCore_502_b;
    private static long d;
    private static long c;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;

    private static void b() {
        int n;
        c = -2302932306135896487L;
        long l = c ^ 0xA774972FC8E9B3C6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(73 + 10), (byte)(26 + 21), (byte)(9 + 58), 66, (byte)(34 + 33), (byte)(18 + 29), (byte)(66 + 14), (byte)(39 + 36), (byte)(59 + 8), (byte)(38 + 45), (byte)(28 + 25), (byte)(55 + 25), (byte)(25 + 72), (byte)(90 + 10), (byte)(16 + 84), (byte)(7 + 98), (byte)(97 + 13), (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(10 + 73)}, StandardCharsets.UTF_8));
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
                    NLoginCore_359.var_java_lang_String_arr_b[0] = NLoginCore_451.B("ŕęĹšŠĹŞĝĢŕšœŜśĬřĩŪŐĬųųĺĻ", (byte)52, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_359.var_java_lang_String_arr_b[0] = NLoginCore_387.E("՞ԢՂժթՂէԦԫ՞թի԰նՁգՋԹդ՘՚ՆՃՄ", (byte)52, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_359.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ӆӄ҈ҧҚҊҾҤӌҩӕӀҍӉҨҮҨҍҭҬҦҧҤҥ", (byte)52, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_359.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ԼՕԸԧՀդԺ՛ՑՈթԸ", (byte)52, 69);
                }
            }
        }
    }

    public NLoginCore_359(NLoginCore_433 NLoginCore_5022) {
        this.var_com_nickuc_login_NLoginCore_502_b = NLoginCore_5022;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        WrapperPlayClientPluginMessage wrapperPlayClientPluginMessage = new WrapperPlayClientPluginMessage(packetReceiveEvent);
        String string = wrapperPlayClientPluginMessage.getChannelName();
        if (!string.equals(NLoginCore_359.c("㺀", (int)(var_int_a & var_int_b), (long)d))) {
            return;
        }
        Player player = (Player)packetReceiveEvent.getPlayer();
        if (player == null) {
            return;
        }
        packetReceiveEvent.setCancelled(e != 0);
        NLoginCore_433.a(this.var_com_nickuc_login_NLoginCore_502_b).com_nickuc_login_NLoginType_018_a().a(NLoginCore_433.a(this.var_com_nickuc_login_NLoginCore_502_b).java_lang_Object_b().a(player), wrapperPlayClientPluginMessage.getData());
    }

    private static String a(int n, long l) {
        l ^= 0xDL;
        l ^= 0xA774972FC8E9B3C6L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(33 + 36), (byte)(13 + 70), (byte)(22 + 25), 67, (byte)(59 + 7), (byte)(30 + 37), (byte)(43 + 4), (byte)(3 + 77), (byte)(50 + 25), (byte)(5 + 62), (byte)(50 + 33), (byte)(51 + 2), 80, (byte)(87 + 10), (byte)(52 + 48), (byte)(43 + 57), (byte)(73 + 32), (byte)(37 + 73), (byte)(77 + 26)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѯѵѴѰ҆ѷѽѣѵѹ҆", (byte)22, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_359.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_359.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.B("ùěĝýġŀĸŎĺĉŇĽŋŅĎĳŕŔŌŒŌġ", (byte)41, 66), NLoginCore_359.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.F("ՈՕՔԗ՗ՓՎ՗բՑԞ՜ՠՙ՜բԤࢩࢯࢮࢪࣀࢱࢷ࢝ࢯࢳࣀԻ", (byte)41, 70) + string + NLoginCore_384.E("ԟ", (byte)41, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(3059632426199961607L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_359.b();
    }
}

