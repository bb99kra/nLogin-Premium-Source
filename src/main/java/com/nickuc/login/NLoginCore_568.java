/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.types.Location
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 */
package com.nickuc.login;

import com.nickuc.login.api.types.Location;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_457;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;

public class NLoginCore_568
implements NLoginInterface_019<Location> {
    private static int h;
    private static long d;
    private static long var_long_b;
    private static int f;
    private static int var_int_a;
    public static NLoginCore_568 var_com_nickuc_login_NLoginCore_568_a;
    private static String[] var_java_lang_String_arr_b;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static long c;
    private static int i;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_568.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.B("ÉëíÍñĐĈĞĊÙėčěĕÞăĥĤĜĢĜñ", (byte)17, 66), NLoginCore_568.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.B("ĄđĐÓēďĊēĞčÚĘĜĕĘĞàѬѰѹѪъѯѮѪѢ҃҃ѻѽѶ҅û", (byte)17, 66) + string + NLoginCore_451.F("ԇ", (byte)17, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 154 | 0 << ~154 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-1360614773642580895L);
        d = Long.reverse(-7061644215716937728L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(-1);
        g = Long.reverse(8295102827439762529L);
        h = (0x800000 >>> 182 | 0x800000 << ~182 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_568.b();
        var_com_nickuc_login_NLoginCore_568_a = new NLoginCore_568();
    }

    private static String a(int n, long l) {
        l ^= 0x79L;
        l ^= 0xD0CF3050A94A4D5AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(62 + 7), (byte)(40 + 43), (byte)(35 + 12), (byte)(41 + 26), (byte)(29 + 37), (byte)(4 + 63), (byte)(46 + 1), (byte)(39 + 41), (byte)(69 + 6), (byte)(49 + 18), 83, 53, (byte)(5 + 75), (byte)(51 + 46), (byte)(2 + 98), (byte)(98 + 2), (byte)(45 + 60), (byte)(75 + 35), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.F("եղձԴմհիմտծԻչսնչտՁ࣑࣍ࣚ࣋ࢫ࣐࣏࣋ࣃࣦࣤࣤࣜࣞࣗ", (byte)70, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_568.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public JSONObject a(@Nonnull Location location) {
        JSONObject jSONObject = new JSONObject();
        org.bukkit.Location location2 = new org.bukkit.Location(Bukkit.getServer().getWorld(location.getWorldName()), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
        jSONObject.put((String)NLoginCore_568.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), (Object)NLoginCore_393.a(location2));
        return jSONObject;
    }

    @Override
    public Location a(@Nonnull JSONObject jSONObject) {
        String string = jSONObject.getString((String)NLoginCore_568.c("㺀", (int)(e & f), (long)g));
        org.bukkit.Location location = NLoginCore_393.a(string);
        return new NLoginCore_457(location.getWorld().getName(), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    private static void b() {
        int n;
        c = -8776029966039746377L;
        long l = c ^ 0xD0CF3050A94A4D5AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(64 + 5), (byte)(48 + 35), 47, (byte)(65 + 2), (byte)(43 + 23), (byte)(64 + 3), (byte)(14 + 33), (byte)(79 + 1), (byte)(15 + 60), (byte)(15 + 52), 83, (byte)(16 + 37), (byte)(33 + 47), (byte)(82 + 15), (byte)(49 + 51), (byte)(31 + 69), (byte)(79 + 26), (byte)(2 + 108), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
                    NLoginCore_568.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ЅеІ϶зЏкйϻОϹЃ", (byte)2, 68);
                    NLoginCore_568.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ЅеІ϶зЏкйϻОϹЃ", (byte)2, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_568.var_java_lang_String_arr_b[0] = NLoginCore_223.D("СжаБАиЂЃЯМϾЉАГϿсЏЦЮЁшчЎЏ", (byte)2, 68);
                    NLoginCore_568.var_java_lang_String_arr_b[1] = NLoginCore_324.C("ТФЧϴЎСХБАЖЗЗПйЎϽБЭмхвСЎЏ", (byte)2, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_568.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ӭԐӳԸԬԇԹԐԼԑԲԞԾӾԅӿՆԣԡԅՁԺԑԒ", (byte)2, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_568.var_java_lang_String_arr_b[0] = NLoginCore_384.E("өԪԐԚԍԄԸԔԻԾӼӽԟӿԲԹԄԟԼԷԕԅՀԩԝ԰ԚԮԣՇՉԯ", (byte)2, 69);
                }
            }
        }
    }

    @Override
    public Class<?> a() {
        return Location.class;
    }
}

