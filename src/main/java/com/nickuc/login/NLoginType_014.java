/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.AccountType
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
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

public class NLoginType_014
implements NLoginInterface_019<AccountType> {
    private static long c;
    private static int var_int_a;
    private static int i;
    public static final NLoginType_014 var_com_nickuc_login_NLoginType_014_a;
    private static String[] var_java_lang_String_arr_a;
    private static long f;
    private static int e;
    private static long g;
    private static int var_int_b;
    private static long d;
    private static int h;
    private static String[] var_java_lang_String_arr_b;

    @Override
    public AccountType a(@Nonnull JSONObject jSONObject) {
        return (AccountType)jSONObject.getEnum(AccountType.class, (String)NLoginType_014.c("㺀", (int)e, (long)(f ^ g)));
    }

    @Override
    public Class<?> a() {
        return AccountType.class;
    }

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0x5489FA2F96DFD60FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(50 + 33), (byte)(20 + 27), (byte)(45 + 22), (byte)(4 + 62), (byte)(25 + 42), (byte)(45 + 2), (byte)(51 + 29), (byte)(28 + 47), (byte)(48 + 19), 83, (byte)(49 + 4), (byte)(77 + 3), (byte)(25 + 72), (byte)(19 + 81), (byte)(63 + 37), (byte)(5 + 100), (byte)(55 + 55), (byte)(96 + 7)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࢢ࢙ࢡࢂࢥࡼࢦࢳࢨࢠࢵࢮࢸ࢚", (byte)23, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_014.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_014.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("ЍЯбБеєьѢюНћёџљТчѩѨѠѦѠе", (byte)16, 67), NLoginType_014.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.E("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ࢛࢒࢚ࡻ࢞ࡵ࢟ࢬࢡ࢙ࢮࢧࢱ࢓ԥ", (byte)16, 69) + string + NLoginCore_091.A("Ù", (byte)16, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public JSONObject a(@Nonnull AccountType accountType) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginType_014.c("㺀", (int)(var_int_a & var_int_b), (long)d), (Object)accountType);
        return jSONObject;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(549397541172630294L);
        e = (0x800000 >>> 23 | 0x800000 << -23) & 0xFFFFFFFF;
        f = Long.reverse(4008162054993171222L);
        g = Long.reverse(0x3000000000000000L);
        h = Integer.reverse(0x40000000);
        i = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginType_014.b();
        var_com_nickuc_login_NLoginType_014_a = new NLoginType_014();
    }

    private static void b() {
        int n;
        c = 7550997554710444524L;
        long l = c ^ 0x5489FA2F96DFD60FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(43 + 26), 83, (byte)(23 + 24), (byte)(49 + 18), (byte)(45 + 21), (byte)(44 + 23), 47, (byte)(6 + 74), (byte)(65 + 10), (byte)(40 + 27), (byte)(66 + 17), (byte)(8 + 45), (byte)(79 + 1), (byte)(68 + 29), (byte)(61 + 39), (byte)(30 + 70), (byte)(40 + 65), (byte)(6 + 104), (byte)(82 + 21)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
                    NLoginType_014.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ĥøăæïçíěĆĠñû", (byte)26, 66);
                    NLoginType_014.var_java_lang_String_arr_b[1] = NLoginCore_453.F("ՈԛԦԉԒԊԐԾԩՃԔԞ", (byte)26, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_014.var_java_lang_String_arr_b[0] = NLoginCore_559.B("úøĉåíûëĭĒħĪďöĆąİĥĬČĽĜĿĆć", (byte)26, 66);
                    NLoginType_014.var_java_lang_String_arr_b[1] = NLoginCore_173.F("ԎՐՐՑԩԳԠԳԮԎՐՄ՘ԛԚՒ՝Լԡԙ԰ԬԩԪ", (byte)26, 70);
                    continue block7;
                }
                case 2: {
                    NLoginType_014.var_java_lang_String_arr_b[0] = NLoginCore_201.C("йћѱѬйѡѣњѼѹѰы", (byte)26, 67);
                    continue block7;
                }
                case 4: {
                    NLoginType_014.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ĘėĠåęĢĢĉĞČĆû", (byte)26, 66);
                }
            }
        }
    }
}

