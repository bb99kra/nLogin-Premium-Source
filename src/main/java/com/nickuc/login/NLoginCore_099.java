/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommandUnsigned
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommandUnsigned;
import com.nickuc.login.NLoginCore_538;
import com.nickuc.login.NLoginCore_380;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_099
implements NLoginInterface_003 {
    private static int q;
    private static String[] var_java_lang_String_arr_b;
    private static int m;
    private static int p;
    private static int k;
    private static int f;
    private static int l;
    final /* synthetic */ NLoginCore_538 var_com_nickuc_login_NLoginCore_346_b;
    private static int r;
    private static int o;
    private static int n;
    private static long i;
    private static long var_long_c;
    private static long j;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static int g;
    private static int var_int_a;
    private static int h;
    private static int var_int_b;
    private static int d;
    private static int e;

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        Object object = packetReceiveEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_b).java_lang_Object_b().a(object);
        NLoginCore_509 NLoginCore_5092 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_b).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            packetReceiveEvent.setCancelled(var_int_a != 0);
            return;
        }
        WrapperPlayClientChatCommandUnsigned wrapperPlayClientChatCommandUnsigned = new WrapperPlayClientChatCommandUnsigned(packetReceiveEvent);
        String string = wrapperPlayClientChatCommandUnsigned.getCommand().trim();
        if (string.isEmpty()) {
            return;
        }
        String string2 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_b).com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, (char)var_int_b + string);
        if (string2 == null) {
            packetReceiveEvent.setCancelled(var_int_c != 0);
            return;
        }
        if (string2.charAt(d) == e) {
            string2 = string2.substring(f);
        }
        wrapperPlayClientChatCommandUnsigned.setCommand(string2);
        packetReceiveEvent.markForReEncode(g != 0);
        String[] stringArray = string.split((String)NLoginCore_099.c("㺀", (int)h, (long)(i ^ j)));
        if (stringArray.length < k) {
            return;
        }
        NLoginCore_466 NLoginCore_4662 = NLoginCore_538.a(this.var_com_nickuc_login_NLoginCore_346_b).com_nickuc_login_NLoginCore_276_a().com_nickuc_login_NLoginCore_466_a(stringArray[l].toLowerCase(Locale.ENGLISH));
        if (NLoginCore_4662 != null) {
            String[] stringArray2 = new String[stringArray.length - m];
            if (stringArray2.length > 0) {
                System.arraycopy(stringArray, n, stringArray2, o, stringArray2.length);
            }
            NLoginCore_4662.a(NLoginCore_277, NLoginCore_5092, stringArray[p], stringArray2);
        }
    }

    /* synthetic */ NLoginCore_099(NLoginCore_538 NLoginCore_346, NLoginCore_380 NLoginInterface_014) {
        this(NLoginCore_346);
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(-201326592);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0);
        e = Integer.reverse(-201326592);
        f = (16384 >>> 206 | 16384 << -206) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (0 >>> 195 | 0 << -195) & 0xFFFFFFFF;
        i = Long.reverse(1576659477577277511L);
        j = Long.reverse(-3746994889972252672L);
        k = (0x20000000 >>> 61 | 0x20000000 << ~61 + 1) & 0xFFFFFFFF;
        l = (0 >>> 228 | 0 << ~228 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = (4096 >>> 204 | 4096 << ~204 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(0);
        p = 0 >>> 39 | 0 << ~39 + 1;
        q = 524288 >>> 211 | 524288 << -211;
        r = (512 >>> 105 | 512 << -105) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_099.b();
    }

    private static void b() {
        int n;
        var_long_c = -2160323473957288024L;
        long l = var_long_c ^ 0x5C7D1866759FC76FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(58 + 11), (byte)(13 + 70), (byte)(26 + 21), (byte)(20 + 47), (byte)(10 + 56), (byte)(37 + 30), (byte)(26 + 21), (byte)(27 + 53), 75, (byte)(19 + 48), (byte)(15 + 68), 53, (byte)(76 + 4), (byte)(35 + 62), (byte)(12 + 88), (byte)(17 + 83), (byte)(64 + 41), (byte)(104 + 6), (byte)(70 + 33)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_099.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ǇƢǋǃƟƜƍǎƿƟƪƗ", (byte)104, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_099.var_java_lang_String_arr_b[0] = NLoginCore_223.D("՟ԠՐ՗ԿՔթՈԿհԫԵ", (byte)104, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_099.var_java_lang_String_arr_b[0] = NLoginCore_110.F("ո֏՝Ֆջձաո՞֧֚տբ֨դ֤֞ջլցօ֋֢ւ֖ղ֤ժ֪֋ֽ֖", (byte)104, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_099.var_java_lang_String_arr_b[0] = NLoginCore_027.C("էԵԼՄՂԾԹծՠծԫ԰լթ՟ՒՍՊ՘Ճ՘ՓՀՁ", (byte)104, 67);
                }
            }
        }
    }

    @Generated
    private NLoginCore_099(NLoginCore_538 NLoginCore_346) {
        this.var_com_nickuc_login_NLoginCore_346_b = NLoginCore_346;
    }

    private static String a(int n, long l) {
        l ^= 0x33L;
        l ^= 0x5C7D1866759FC76FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(54 + 15), (byte)(4 + 79), (byte)(19 + 28), (byte)(44 + 23), (byte)(54 + 12), (byte)(14 + 53), (byte)(29 + 18), (byte)(38 + 42), (byte)(8 + 67), (byte)(32 + 35), (byte)(40 + 43), (byte)(5 + 48), (byte)(42 + 38), (byte)(91 + 6), (byte)(25 + 75), 100, (byte)(32 + 73), (byte)(63 + 47), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ĊėĖÙęĕĐęĤēàĞĢěĞĤæўќѝяѸѰѸ҇Ѿ҈", (byte)20, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_099.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_099.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)123, 67), NLoginCore_099.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.C("։֖֕՘֘֔֏֣֘֒՟֣֚֝֡֝ե࣯ࣝࣛࣜ࣎ࣷࣷआࣽइջ", (byte)123, 67) + string + NLoginCore_223.C("ՠ", (byte)123, 67) + methodType.toString(), exception);
        }
    }
}

