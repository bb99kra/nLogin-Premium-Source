/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
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

public class NLoginCore_038
implements NLoginCore_249,
NLoginCore_415 {
    private static int e;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private final NLoginCore_211 ac;
    private static long l;
    private static int j;
    private static int n;
    private static int f;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static int var_int_b;
    private static int m;
    private static int g;
    private static long i;
    private static int d;
    private static int var_int_a;
    private static int h;
    private static long k;

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == var_int_a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() && this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).av() ? var_int_b : var_int_c) != 0;
    }

    static {
        var_int_a = 0x12000000 >>> 153 | 0x12000000 << ~153 + 1;
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = (0 >>> 63 | 0 << -63) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = (2 >>> 1 | 2 << ~1 + 1) & 0xFFFFFFFF;
        f = (0 >>> 70 | 0 << ~70 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = -1 >>> 124 | -1 << ~124 + 1;
        i = Long.reverse(6713520503537449911L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Long.reverse(-2221621157165614153L);
        l = Long.reverse(-4899916394579099648L);
        m = Integer.reverse(0x40000000);
        n = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_038.b();
    }

    @Generated
    public NLoginCore_038(NLoginCore_211 NLoginCore_211) {
        this.ac = NLoginCore_211;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ac;
    }

    private static void b() {
        int n;
        var_long_c = -1306776578278239097L;
        long l = var_long_c ^ 0x33E525F9287BD7BAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(41 + 28), (byte)(51 + 32), (byte)(14 + 33), (byte)(58 + 9), (byte)(46 + 20), (byte)(16 + 51), (byte)(5 + 42), (byte)(54 + 26), (byte)(62 + 13), 67, (byte)(46 + 37), 53, (byte)(54 + 26), (byte)(68 + 29), (byte)(14 + 86), (byte)(23 + 77), (byte)(4 + 101), (byte)(32 + 78), (byte)(96 + 7)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(13 + 56), (byte)(17 + 66)}, StandardCharsets.UTF_8));
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
                    NLoginCore_038.var_java_lang_String_arr_b[0] = NLoginCore_446.E("ԊԤԎԃԵԲӿԨӼԗԄՌԶՎՅԩԧԦՎԦՕԟԜԝ", (byte)13, 69);
                    NLoginCore_038.var_java_lang_String_arr_b[1] = NLoginCore_173.B("ČñäçĐôāĔöîĝđèúÿċòëÿåėðççĕĉćß÷īĄĂįĨğĂíĨīĂĦĲęĞĘĕĖĿěĒďĭĖćĲĚąăĄĜčĨĺıőĭĝŖŊŋĴĔŕĺĸġ", (byte)13, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_038.var_java_lang_String_arr_b[0] = NLoginCore_138.C("НзСЖшхВлЏЪЖПммОКѐлїѣштЯа", (byte)13, 67);
                    NLoginCore_038.var_java_lang_String_arr_b[1] = NLoginCore_027.F("ԼԡԔԗՀԤԱՄԦԞՍՁԘԪԯԻԢԛԯԕՇԠԗԗՅԹԷԏԧ՛ԴԲ՟՘ՏԲԝ՘՛ԲՖբՉՎՈՅՆկՋՂԿ՝ՆԷբՊԵԳԴՌԽ՘ժաղ՜ետ՟ևջՇֈվ՘Ց", (byte)13, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_038.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԠԌԳՃԞԹՅԶԥԳԦՎԷԩՎՀՀԲՒԭԨԡՂՇՎՈԩՙ՝ԨաՂ", (byte)13, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_038.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԮԢՁԽԺԒԗԻԢԉԊԩԮԭԂԃՇՈՏԩՅԯԜԝ", (byte)13, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_038.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), NLoginCore_038.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծࣹࣿࣝआंࣶ࣯ँࣱփ", (byte)126, 68) + string + NLoginCore_453.D("թ", (byte)126, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3DL;
        l ^= 0x33E525F9287BD7BAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(6 + 63), (byte)(81 + 2), (byte)(41 + 6), 67, 66, (byte)(64 + 3), (byte)(28 + 19), (byte)(29 + 51), (byte)(34 + 41), (byte)(49 + 18), (byte)(81 + 2), (byte)(51 + 2), (byte)(15 + 65), (byte)(63 + 34), (byte)(86 + 14), (byte)(95 + 5), (byte)(73 + 32), (byte)(63 + 47), (byte)(73 + 30)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(51 + 32)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӁһҟӈӄҸұӃҳ", (byte)57, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_038.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_n, string -> {
            if (string.contains((CharSequence)NLoginCore_038.c("㺀", (int)(g & h), (long)i))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_038.c("㺃", (int)j, (long)(k ^ l)));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_038.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }
}

