/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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

public class NLoginCore_205 {
    private static int var_int_b;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static int i;
    private static int var_int_a;
    private static int f;
    private static long var_long_c;
    private static int h;
    public static final boolean var_boolean_j;
    private static int e;
    private static int var_int_j;
    private static int d;
    private static long g;

    public static void a(Player player, boolean bl) {
        if (var_boolean_j) {
            player.setGliding(bl);
        }
    }

    private static void b() {
        int n;
        var_long_c = 5093278047144927585L;
        long l = var_long_c ^ 0xA935997667B53514L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(22 + 47), (byte)(43 + 40), (byte)(21 + 26), 67, (byte)(26 + 40), (byte)(33 + 34), (byte)(17 + 30), (byte)(67 + 13), 75, (byte)(49 + 18), (byte)(46 + 37), (byte)(29 + 24), (byte)(16 + 64), (byte)(20 + 77), (byte)(22 + 78), (byte)(39 + 61), (byte)(55 + 50), (byte)(66 + 44), (byte)(86 + 17)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_205.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ƭǕǁǌǑƮǚǛǄǅǗǔƩǨƿƭǅǞƺƿǤǳƺƻ", (byte)116, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_205.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ն֞֊֚֕շ֣֤֍֎ֳ֪֠լ֢֔֎ֵֺ֭կֆփք", (byte)116, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_205.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ֆՕՠՋք֋բՙք՜ժՇՓ֓չ֊խ՘ճ՗Օ֍դե", (byte)116, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_205.var_java_lang_String_arr_b[0] = NLoginCore_324.F("֧֔գօպ։ը֎֢դ֩ո", (byte)116, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x10L;
        l ^= 0xA935997667B53514L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), 69, (byte)(70 + 13), (byte)(37 + 10), (byte)(31 + 36), (byte)(43 + 23), 67, (byte)(25 + 22), (byte)(55 + 25), (byte)(17 + 58), (byte)(50 + 17), (byte)(12 + 71), (byte)(11 + 42), (byte)(23 + 57), (byte)(28 + 69), (byte)(40 + 60), (byte)(80 + 20), (byte)(75 + 30), (byte)(79 + 31), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.F("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣳअࣼऊऋआࣻࣿंࣛएअअऑ", (byte)113, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_205.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static boolean a(Player player) {
        return (var_boolean_j && player.isGliding() ? var_int_a : var_int_b) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_205.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 69), NLoginCore_205.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.F("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣱࣲࣣ࣭ࣚ࣬࣢ࣦࣩࣂࣶ࣬࣬ࣸխ", (byte)88, 70) + string + NLoginCore_076.F("Վ", (byte)88, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = 256 >>> 136 | 256 << -136;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = Integer.reverse(0);
        f = -1 >>> 178 | -1 << -178;
        g = Long.reverse(-8176713518986332830L);
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        var_int_j = (0 >>> 175 | 0 << ~175 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[var_int_c];
        var_java_lang_String_arr_b = new String[d];
        NLoginCore_205.b();
        var_boolean_j = NLoginCore_546.a(Player.class, (String)NLoginCore_205.c("㺀", (int)(e & f), (long)g), new Class[h]) != null ? i : var_int_j;
    }
}

