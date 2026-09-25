/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.Server
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_490;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class NLoginCore_467
extends NLoginCore_490 {
    private static int var_int_e;
    private static int ai;
    private static String[] var_java_lang_String_arr_e;
    private static long i;
    private static int z;
    private static long q;
    private static int af;
    private static long p;
    private static int ah;
    private static String[] f;

    public NLoginCore_467(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_n, (String)NLoginCore_467.c("㺀", (int)var_int_e, (long)(p ^ q)), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? z : af) != 0);
    }

    private static void void_b() {
        int n;
        i = 5323874297179885719L;
        long l = i ^ 0x11628BA0DA699EE3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(31 + 38), (byte)(50 + 33), (byte)(45 + 2), 67, (byte)(28 + 38), (byte)(34 + 33), (byte)(4 + 43), (byte)(10 + 70), (byte)(42 + 33), (byte)(49 + 18), 83, (byte)(37 + 16), (byte)(26 + 54), (byte)(16 + 81), (byte)(98 + 2), (byte)(99 + 1), (byte)(77 + 28), (byte)(30 + 80), (byte)(40 + 63)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_467.f[0] = NLoginCore_559.E("ԫԡԙӭӷԧԱԷԩԾԭԺԿԝԎԼԄԴՆԅՁՋԒԓ", (byte)3, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_467.f[0] = NLoginCore_387.E("ԫԡԙӭӷԧԱԷԩԾԭՃԖԡԚԯԒԼԄԞՆԕԒԓ", (byte)3, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_467.f[0] = NLoginCore_223.B("úØÓÊÊ¾»ĀûãĀöüĀâĉîÈçýÛßóĄéēãÕďöĘö", (byte)3, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_467.f[0] = NLoginCore_446.B("°ØÓïÎÚßăåôåéàÔ×ĂúîãàßđØÙ", (byte)3, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x11628BA0DA699EE3L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(40 + 29), (byte)(63 + 20), (byte)(19 + 28), (byte)(52 + 15), (byte)(7 + 59), (byte)(30 + 37), (byte)(9 + 38), (byte)(75 + 5), 75, (byte)(3 + 64), 83, (byte)(38 + 15), (byte)(59 + 21), (byte)(88 + 9), (byte)(69 + 31), (byte)(23 + 77), (byte)(30 + 75), (byte)(19 + 91), (byte)(94 + 9)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒ࢛࢜࢏ࢰࢠࢬ࢟࢑", (byte)23, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_467.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected void h(String string, String string2) {
        UUID uUID = NLoginCore_432.c(string);
        OfflinePlayer offlinePlayer = ((Server)this.m.java_lang_Object_b().c()).getOfflinePlayer(uUID);
        this.a(offlinePlayer.getName(), string2, null, uUID);
    }

    static {
        var_int_e = (0 >>> 21 | 0 << -21) & 0xFFFFFFFF;
        p = Long.reverse(-1654303089243699310L);
        q = Long.reverse(-6629298651489370112L);
        z = Integer.reverse(Integer.MIN_VALUE);
        af = (0 >>> 225 | 0 << ~225 + 1) & 0xFFFFFFFF;
        ah = (0x40000000 >>> 126 | 0x40000000 << ~126 + 1) & 0xFFFFFFFF;
        ai = 4 >>> 226 | 4 << ~226 + 1;
        var_java_lang_String_arr_e = new String[ah];
        f = new String[ai];
        NLoginCore_467.void_b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_467.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.B("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 66), NLoginCore_467.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.A("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӡӢӕӶӦӲӥӗŬ", (byte)77, 65) + string + NLoginCore_173.F("Ճ", (byte)77, 70) + methodType.toString(), exception);
        }
    }
}

