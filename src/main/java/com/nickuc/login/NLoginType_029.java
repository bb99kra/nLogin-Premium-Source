/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginType_029
implements NLoginInterface_019<SpawnType> {
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    public static final NLoginType_029 var_com_nickuc_login_NLoginType_029_a;
    private static int var_int_c;
    private static long var_long_c;
    private static long var_long_b;
    private static int var_int_a;
    private static long e;

    @Override
    public JSONObject a(@Nonnull SpawnType spawnType) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((String)NLoginType_029.c("㺀", (int)var_int_a, (long)var_long_b), (Object)spawnType);
        return jSONObject;
    }

    @Override
    public Class<?> a() {
        return SpawnType.class;
    }

    @Override
    public SpawnType a(@Nonnull JSONObject jSONObject) {
        return (SpawnType)jSONObject.getEnum(SpawnType.class, (String)NLoginType_029.c("㺀", (int)var_int_c, (long)(d ^ e)));
    }

    private static String a(int n, long l) {
        l ^= 0x69L;
        l ^= 0x29B84BBC79442A55L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(56 + 13), (byte)(63 + 20), (byte)(11 + 36), (byte)(61 + 6), (byte)(17 + 49), (byte)(28 + 39), (byte)(38 + 9), (byte)(74 + 6), (byte)(55 + 20), (byte)(56 + 11), 83, (byte)(18 + 35), (byte)(37 + 43), (byte)(19 + 78), (byte)(28 + 72), (byte)(29 + 71), (byte)(20 + 85), (byte)(65 + 45), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӺԋԊԏԓԃԈԆԐԃԏ", (byte)92, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_029.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -7877029381372230576L;
        long l = var_long_c ^ 0x29B84BBC79442A55L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(58 + 11), 83, (byte)(4 + 43), (byte)(14 + 53), (byte)(23 + 43), (byte)(18 + 49), 47, (byte)(69 + 11), (byte)(13 + 62), (byte)(59 + 8), (byte)(49 + 34), (byte)(29 + 24), (byte)(79 + 1), (byte)(14 + 83), (byte)(64 + 36), (byte)(47 + 53), (byte)(62 + 43), (byte)(26 + 84), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
                    NLoginType_029.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԽԩԸՆԹԥՎՎՒԌԒԜ", (byte)24, 69);
                    NLoginType_029.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ԽԩԸՆԹԥՎՎՒԌԒԜ", (byte)24, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_029.var_java_lang_String_arr_b[0] = NLoginCore_324.C("цѵѥѕѹѴѷјѰэҁѻѮѶмѯљ҆цфсѹѐё", (byte)24, 67);
                    NLoginType_029.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ѡэхгѫѱЮѨўѪоћѵусх҇ќѶтѧѹѐё", (byte)24, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_029.var_java_lang_String_arr_b[0] = NLoginCore_004.E("ՀԍՌԜԠԏԩՑԦԖՕԨԓ՛ԗԫՍ՜ՐԸՉԙԭԴԛԣՐ՜ԽԪեԶ", (byte)24, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_029.var_java_lang_String_arr_b[0] = NLoginCore_027.C("чѧзѳіђѱѦѓѾщойлѢзѻ҆ѓҀѡѣѐё", (byte)24, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_029.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.E("ՙջս՝ց֚֮֠֘թ֧֥֝֫ծֲִֵ֓֬֬ց", (byte)117, 69), NLoginType_029.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣰࣣ࣭ࣗࣨࣧ࣬࣠ࣥ࣠࣬ժ", (byte)117, 68) + string + NLoginCore_223.B("ƣ", (byte)117, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7196048857441700535L);
        var_int_c = 64 >>> 198 | 64 << ~198 + 1;
        d = Long.reverse(730286486730372425L);
        e = Long.reverse(-7638104968020361216L);
        f = Integer.reverse(0x40000000);
        g = 256 >>> 167 | 256 << ~167 + 1;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginType_029.b();
        var_com_nickuc_login_NLoginType_029_a = new NLoginType_029();
    }
}

