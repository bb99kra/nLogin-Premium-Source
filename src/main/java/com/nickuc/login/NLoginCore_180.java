/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_180 {
    private static int f;
    private static int i;
    private static long var_long_b;
    private final String aY;
    private static int j;
    private static int k;
    private static int d;
    private static String[] var_java_lang_String_arr_b;
    private static int g;
    private static int h;
    private static long var_long_c;
    private static int var_int_a;
    private final String aZ;
    private static int e;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;

    public boolean a(JSONObject jSONObject, String string, byte[] byArray) {
        return true;
    }

    @Generated
    public String T() {
        return this.aZ;
    }

    @Generated
    public NLoginCore_180(String string, String string2) {
        this.aY = string;
        this.aZ = string2;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(1095279556709755679L);
        var_int_c = 1031798784 >>> 215 | 1031798784 << -215;
        d = (10240 >>> 103 | 10240 << ~103 + 1) & 0xFFFFFFFF;
        e = (0 >>> 192 | 0 << ~192 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = (0 >>> 180 | 0 << ~180 + 1) & 0xFFFFFFFF;
        h = (0 >>> 36 | 0 << -36) & 0xFFFFFFFF;
        i = 0 >>> 91 | 0 << ~91 + 1;
        j = 0x2000000 >>> 249 | 0x2000000 << -249;
        k = (1 >>> 32 | 1 << ~32 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_180.b();
    }

    private static void b() {
        int n;
        var_long_c = -516375928563250036L;
        long l = var_long_c ^ 0x450F6CB14BD88FA7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(41 + 28), (byte)(37 + 46), (byte)(32 + 15), (byte)(43 + 24), (byte)(44 + 22), (byte)(4 + 63), (byte)(45 + 2), (byte)(16 + 64), (byte)(13 + 62), 67, (byte)(54 + 29), (byte)(45 + 8), 80, (byte)(28 + 69), (byte)(47 + 53), (byte)(44 + 56), (byte)(29 + 76), (byte)(57 + 53), (byte)(38 + 65)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_180.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ԡԹӶՃԝԏԻԘԜԣԶՈՊՊՆԝՒԊԥԡԶՕԜԝ", (byte)92, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_180.var_java_lang_String_arr_b[0] = NLoginCore_324.F("հֈՅ֒լ՞֊էիղօ֑֖֕ձռՙլսդնվիլ", (byte)92, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_180.var_java_lang_String_arr_b[0] = NLoginCore_076.C("ԴԾԥԯԁԃԆԛԤԄՊԑ", (byte)92, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_180.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƟƊƌƈƴƯƊƘƙƁƣƐƙƾƛƗŷƕƭƾƘƾƚǁƤǁƢƩƚǅƎǊ", (byte)92, 65);
                }
            }
        }
    }

    @Generated
    public String S() {
        return this.aY;
    }

    private static String a(int n, long l) {
        l ^= 0x7CL;
        l ^= 0x450F6CB14BD88FA7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(51 + 18), (byte)(46 + 37), (byte)(44 + 3), (byte)(4 + 63), (byte)(41 + 25), (byte)(53 + 14), (byte)(31 + 16), (byte)(76 + 4), (byte)(46 + 29), (byte)(28 + 39), (byte)(51 + 32), (byte)(37 + 16), (byte)(50 + 30), (byte)(87 + 10), (byte)(70 + 30), (byte)(15 + 85), (byte)(64 + 41), 110, 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծउࣼः࣭࣮ࣴऀआࣜऎऍओ", (byte)115, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_180.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_180.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.D("ҦӈӊҪӎӭӥӻӧҶӴӪӸӲһӠԂԁӹӿӹӎ", (byte)67, 68), NLoginCore_180.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.F("բկծԱձխըձռիԸնպճնռԾ࣓ࣙ࣌ࣄࢽࢾ࣐ࣖࢬࣣࣞࣝՖ", (byte)67, 70) + string + NLoginCore_446.E("Թ", (byte)67, 69) + methodType.toString(), exception);
        }
    }
}

