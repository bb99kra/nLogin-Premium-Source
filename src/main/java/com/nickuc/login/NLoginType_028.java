/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.DatabaseType
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_138;
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

public class NLoginType_028
implements NLoginInterface_019<DatabaseType> {
    private static long d;
    private static long g;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static int f;
    private static long c;
    private static int i;
    private static int var_int_b;
    private static int h;
    public static final NLoginType_028 var_com_nickuc_login_NLoginType_028_a;
    private static int var_int_a;
    private static int e;

    @Override
    public JSONObject a(@Nonnull DatabaseType databaseType) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginType_028.c("㺀", (int)(var_int_a & var_int_b), (long)d), (Object)databaseType);
        return jSONObject;
    }

    private static String a(int n, long l) {
        l ^= 0x7AL;
        l ^= 0x95DE62D442A28B41L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(11 + 58), (byte)(10 + 73), (byte)(25 + 22), 67, (byte)(30 + 36), (byte)(19 + 48), (byte)(34 + 13), (byte)(65 + 15), (byte)(29 + 46), (byte)(41 + 26), (byte)(77 + 6), (byte)(18 + 35), (byte)(21 + 59), 97, (byte)(31 + 69), (byte)(92 + 8), (byte)(97 + 8), (byte)(108 + 2), (byte)(15 + 88)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(28 + 55)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ѦѳѲеѵѱѬѵҀѯмѺѾѷѺҀтߐߔߝߟߟߏߔߡ", (byte)26, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_028.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 209 | 0 << -209) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(5120072687237916776L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (-1 >>> 134 | -1 << -134) & 0xFFFFFFFF;
        g = Long.reverse(5120072687237916776L);
        h = (128 >>> 134 | 128 << -134) & 0xFFFFFFFF;
        i = (512 >>> 72 | 512 << ~72 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginType_028.b();
        var_com_nickuc_login_NLoginType_028_a = new NLoginType_028();
    }

    private static void b() {
        int n;
        c = 1591880952850968728L;
        long l = c ^ 0x95DE62D442A28B41L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(39 + 30), (byte)(77 + 6), (byte)(11 + 36), (byte)(61 + 6), (byte)(28 + 38), (byte)(12 + 55), (byte)(28 + 19), (byte)(40 + 40), (byte)(37 + 38), (byte)(10 + 57), (byte)(82 + 1), (byte)(8 + 45), 80, (byte)(37 + 60), (byte)(8 + 92), (byte)(12 + 88), 105, (byte)(56 + 54), (byte)(6 + 97)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_028.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ƛŸƦƤƮƂƲƟūƶƖŻ", (byte)90, 65);
                    NLoginType_028.var_java_lang_String_arr_b[1] = NLoginCore_110.F("վ՛։և֑ե֕ւՎ֙չ՞", (byte)90, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_028.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ƖũžŭŬŹưűƩƉƎƲƆŶŴűƵƫƨŶǁƿƆƇ", (byte)90, 66);
                    NLoginType_028.var_java_lang_String_arr_b[1] = NLoginCore_173.C("ԅԹԜԐԨӻԔԒӿԓԚԋ", (byte)90, 67);
                    continue block7;
                }
                case 2: {
                    NLoginType_028.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ԑԭԫԋԫԌԬԯՃԹՁӹԥԀԨԁԻԬԘՎԜԩԖԗ", (byte)90, 68);
                    continue block7;
                }
                case 4: {
                    NLoginType_028.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ԷӴԉӶԓӻԔӵԢԂԙԘӾԪԁԙԇԹԪՄԊՏԖԗ", (byte)90, 67);
                }
            }
        }
    }

    @Override
    public DatabaseType a(@Nonnull JSONObject jSONObject) {
        return (DatabaseType)jSONObject.getEnum(DatabaseType.class, (String)NLoginType_028.c("㺀", (int)(e & f), (long)g));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_028.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.A("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 65), NLoginType_028.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.F("ԳՀԿԂՂԾԹՂՍԼԉՇՋՄՇՍԏ࢝ࢡࢪࢬࢬ࢜ࢡࢮԣ", (byte)20, 70) + string + NLoginCore_201.C("Ы", (byte)20, 67) + methodType.toString(), exception);
        }
    }

    @Override
    public Class<?> a() {
        return DatabaseType.class;
    }
}

