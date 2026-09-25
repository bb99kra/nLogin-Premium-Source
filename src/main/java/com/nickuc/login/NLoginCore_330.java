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
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
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

public class NLoginCore_330
implements NLoginCore_249,
NLoginCore_415 {
    private static int i;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;
    private static int g;
    private static long var_long_c;
    private static int var_int_a;
    private static int f;
    private static int var_int_c;
    private static long d;
    private final NLoginCore_211 X;
    private static long e;
    private static int h;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_330.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ŝſƁšƅƤƜƲƞŭƫơƯƩŲƗƹƸưƶưƅ", (byte)91, 65), NLoginCore_330.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("պևֆՉ։օր։֔փՐ֎֒֋֎֔Ֆࣞࣄ࣐࣠ࣥ࣡ࣂࣰ࣢ի", (byte)91, 70) + string + NLoginCore_223.C("Ԁ", (byte)91, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_330(NLoginCore_211 NLoginCore_211) {
        this.X = NLoginCore_211;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().p();
    }

    private static void b() {
        int n;
        var_long_c = 8193450574933607946L;
        long l = var_long_c ^ 0x7B23D16C61DB2B79L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(32 + 37), (byte)(53 + 30), (byte)(16 + 31), 67, (byte)(60 + 6), (byte)(51 + 16), (byte)(13 + 34), (byte)(72 + 8), (byte)(10 + 65), (byte)(50 + 17), (byte)(52 + 31), (byte)(33 + 20), (byte)(28 + 52), (byte)(38 + 59), (byte)(8 + 92), (byte)(73 + 27), (byte)(24 + 81), (byte)(10 + 100), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_330.var_java_lang_String_arr_b[0] = NLoginCore_173.A("ŹƨƝƦŷƿƔƼƠƙƣƶƙǂƹǇǁƻƽƧƟǂƻƐƮƲǕǄƱƔǘƴ", (byte)97, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_330.var_java_lang_String_arr_b[0] = NLoginCore_575.E("ՕքչւՓ֛հ֘ռյտ֒յ֣֞֕֝֗֙փջ֡֍֦֡֝սֲ֤ևլվ֦֎ֹ֖֢օּ֥֖֠ֈօ", (byte)97, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_330.var_java_lang_String_arr_b[0] = NLoginCore_451.C("ՑԍԊԑԑԠԸՉԗՊԍՆԾԵԺԪ԰ԡՂՍԠՔԫԬ", (byte)97, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_330.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ƉƒƲƏźƈưƟƎƯƂƞƒƝƇƱƷƉƶǍƬƗƔƕ", (byte)97, 65);
                }
            }
        }
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        Object[] objectArray = new Object[var_int_a];
        objectArray[NLoginCore_330.var_int_b] = NLoginCore_330.c("㺀", (int)var_int_c, (long)(d ^ e));
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_v, objectArray);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[f];
        NLoginCore_445Array[NLoginCore_330.g] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    private static String a(int n, long l) {
        l ^= 0x3FL;
        l ^= 0x7B23D16C61DB2B79L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(13 + 56), (byte)(73 + 10), 47, (byte)(31 + 36), (byte)(18 + 48), (byte)(55 + 12), (byte)(13 + 34), (byte)(10 + 70), (byte)(74 + 1), (byte)(3 + 64), (byte)(64 + 19), (byte)(19 + 34), (byte)(59 + 21), (byte)(75 + 22), (byte)(75 + 25), (byte)(53 + 47), (byte)(83 + 22), (byte)(12 + 98), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.C("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗ࢟ࢅࢡࢦࢢ࢑ࢃࢱࢣ", (byte)97, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_330.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.X;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 181 | 0 << -181;
        var_int_c = 0 >>> 78 | 0 << ~78 + 1;
        d = Long.reverse(5792409605608779150L);
        e = Long.reverse(-288230376151711744L);
        f = (0x8000000 >>> 59 | 0x8000000 << -59) & 0xFFFFFFFF;
        g = 0 >>> 176 | 0 << -176;
        h = 0x2000000 >>> 89 | 0x2000000 << ~89 + 1;
        i = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_330.b();
    }
}

