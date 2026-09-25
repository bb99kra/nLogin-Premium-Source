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

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginCore_542
implements PluginMessageListener {
    private static long var_long_c;
    private static int f;
    private final NLoginCore_033 var_com_nickuc_login_NLoginCore_033_a;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static int h;
    private final nLoginBukkit q;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_b;
    private static long e;
    private static long var_long_b;
    private static int var_int_a;
    private static int g;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-6185191697425231909L);
        var_int_c = (0x1000000 >>> 248 | 0x1000000 << ~248 + 1) & 0xFFFFFFFF;
        d = Long.reverse(1885258834822696923L);
        e = Long.reverse(-5764607523034234880L);
        f = (0 >>> 78 | 0 << -78) & 0xFFFFFFFF;
        g = Integer.reverse(0x40000000);
        h = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_542.b();
    }

    private static String a(int n, long l) {
        l ^= 0xDL;
        l ^= 0x325EAFE5B1F2E68FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(55 + 14), (byte)(7 + 76), (byte)(2 + 45), (byte)(58 + 9), 66, (byte)(12 + 55), (byte)(10 + 37), 80, (byte)(46 + 29), (byte)(51 + 16), (byte)(68 + 15), (byte)(31 + 22), (byte)(28 + 52), (byte)(61 + 36), (byte)(12 + 88), (byte)(9 + 91), (byte)(39 + 66), (byte)(87 + 23), (byte)(63 + 40)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.D("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕїߟߦ߲߲ߐߧߤ߭ߙߕߧߏ", (byte)33, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_542.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_542(nLoginBukkit nLoginBukkit2, NLoginCore_033 NLoginCore_0332) {
        this.q = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_033_a = NLoginCore_0332;
    }

    public void onPluginMessageReceived(@NotNull String string, Player player, byte[] byArray) {
        if (!string.equals(NLoginCore_542.c("㺀", (int)var_int_a, (long)var_long_b))) {
            return;
        }
        try {
            this.var_com_nickuc_login_NLoginCore_033_a.a().a(this.q.java_lang_Object_b().a(player), byArray);
        }
        catch (Exception exception) {
            NLoginCore_370.a((String)NLoginCore_542.c("㺃", (int)var_int_c, (long)(d ^ e)) + player.getName(), exception, new Object[f]);
        }
    }

    private static void b() {
        int n;
        var_long_c = -2598468202747685800L;
        long l = var_long_c ^ 0x325EAFE5B1F2E68FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(20 + 49), (byte)(48 + 35), 47, (byte)(21 + 46), (byte)(20 + 46), (byte)(29 + 38), (byte)(10 + 37), (byte)(76 + 4), (byte)(48 + 27), (byte)(51 + 16), (byte)(40 + 43), (byte)(22 + 31), (byte)(24 + 56), (byte)(66 + 31), (byte)(98 + 2), (byte)(86 + 14), (byte)(70 + 35), (byte)(78 + 32), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_542.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ЫДцГЦђчјкљїзѐОѣѠёзмжѭевг", (byte)14, 68);
                    NLoginCore_542.var_java_lang_String_arr_b[1] = NLoginCore_384.E("ԽӶԻԤՂԐӻԔԸԌԃԫԚՅԻՒԒԧԪՆԨՂԏՈԱԸ՛ԹՓՏ՘ԳԕԢԟԜՖՈԹեԽԞթԹ՜ԯՏԯճՒը՞ՂնՐհխՉԻճղղխՁ", (byte)14, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_542.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ԖӿԱӾԑԽԲՃԥՄՂԹԛՀԧՏԦԨԫԣԯՖԝԞ", (byte)14, 69);
                    NLoginCore_542.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ђЋѐйїХАЩэСИрЯњѐѧЧмпћнїФѝцэѰюѨѤѭшЪздбѫѝюѺђгѾюѱфѤф҈ѧѽѳїщҎѰҊэъ҄ёҋѭ҉јѴѨѻҎ҉ҌҐџѳҌѧ", (byte)14, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_542.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ДцгюЕЦЗљРЙмфПЗЦѣПмчпихвг", (byte)14, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_542.var_java_lang_String_arr_b[0] = NLoginCore_201.C("иФЕгЙдМЪЪГќЧ", (byte)14, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_542.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_542.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("ՉՖՕԘ՘ՔՏ՘գՒԟ՝ա՚՝գԥࢭࢴࣀࣀ࢞ࢵࢲࢻࢧࢣࢵ࢝Խ", (byte)42, 69) + string + NLoginCore_223.B("č", (byte)42, 66) + methodType.toString(), exception);
        }
    }
}

