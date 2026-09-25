/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.messaging.PluginMessageListener
 *  org.jetbrains.annotations.NotNull
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_018;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class NLoginCore_504
implements PluginMessageListener {
    private static long var_long_b;
    private static int e;
    private static int f;
    final /* synthetic */ NLoginType_018 var_com_nickuc_login_NLoginType_018_c;
    private static long d;
    private static int var_int_a;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;

    private static void b() {
        int n;
        var_long_c = -4707075387310267327L;
        long l = var_long_c ^ 0xCFA78622521E2732L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(17 + 52), (byte)(23 + 60), (byte)(28 + 19), (byte)(24 + 43), (byte)(45 + 21), 67, (byte)(5 + 42), (byte)(53 + 27), (byte)(6 + 69), (byte)(66 + 1), (byte)(20 + 63), (byte)(16 + 37), (byte)(6 + 74), (byte)(85 + 12), (byte)(14 + 86), (byte)(86 + 14), 105, (byte)(22 + 88), (byte)(83 + 20)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_504.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ǍƬǂǆǆǆǴǣǯǕǬǇǇǐƲǷǕƹƾǱǑǏǌǍ", (byte)125, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_504.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ǍƬǂǆǆǆǴǣǯǕǪƵǔǧƶǕǸǺǙǜǟǏǌǍ", (byte)125, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_504.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ǐƥǳǬƴǠǬƯƺǏǐǆǙǩǛȂƿǑǒȂǐǵǌǍ", (byte)125, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_504.var_java_lang_String_arr_b[0] = NLoginCore_092.D("՛֥֑֤֤֚֙իլ֙պըր֌֛փ֖֑փ֗ց֨տր", (byte)125, 68);
                }
            }
        }
    }

    public void onPluginMessageReceived(@NotNull String string, Player player, byte[] byArray) {
        if (string.equals(NLoginCore_504.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)))) {
            this.var_com_nickuc_login_NLoginType_018_c.a(NLoginType_018.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginType_018_c).java_lang_Object_b().a(player), byArray);
        }
    }

    static {
        var_int_a = (0 >>> 242 | 0 << -242) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-9068905926125636227L);
        d = Long.reverse(-1441151880758558720L);
        e = (262144 >>> 50 | 262144 << -50) & 0xFFFFFFFF;
        f = 0x400000 >>> 86 | 0x400000 << ~86 + 1;
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_504.b();
    }

    @Generated
    public NLoginCore_504(NLoginType_018 NLoginType_018) {
        this.var_com_nickuc_login_NLoginType_018_c = NLoginType_018;
    }

    private static String a(int n, long l) {
        l ^= 0x37L;
        l ^= 0xCFA78622521E2732L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(55 + 14), (byte)(68 + 15), (byte)(34 + 13), 67, (byte)(65 + 1), (byte)(47 + 20), (byte)(40 + 7), (byte)(5 + 75), 75, (byte)(66 + 1), (byte)(30 + 53), (byte)(13 + 40), (byte)(53 + 27), (byte)(9 + 88), (byte)(96 + 4), (byte)(22 + 78), (byte)(40 + 65), (byte)(5 + 105), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѸ҃ѹѹѶѧѺѹҋљѯ҂Ҍҋѭ", (byte)22, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_504.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_504.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("уѥѧчѫҊ҂Ҙ҄ѓґ҇ҕҏјѽҟҞҖҜҖѫ", (byte)34, 68), NLoginCore_504.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.C("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњߨ߳ߩߩߦߗߪߩ߻߉ߟ߲߼߻ߝѵ", (byte)34, 67) + string + NLoginCore_138.E("Ԙ", (byte)34, 69) + methodType.toString(), exception);
        }
    }
}

