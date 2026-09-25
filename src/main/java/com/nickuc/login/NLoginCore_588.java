/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_042;
import com.nickuc.login.NLoginCore_460;
import com.nickuc.login.NLoginCore_271;
import com.nickuc.login.NLoginInterface_017;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_389;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_588
implements NLoginInterface_017 {
    private static int m;
    private static String[] var_java_lang_String_arr_a;
    private static long g;
    private boolean var_boolean_b;
    private static int l;
    private static int k;
    public static final AttributeKey<NLoginCore_588> var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f;
    private static String[] var_java_lang_String_arr_b;
    @Nullable
    private NLoginCore_042 var_com_nickuc_login_NLoginCore_042_a;
    public final ForceRegisterConfig var_com_nickuc_login_ForceRegisterConfig_f;
    private static long d;
    private static long c;
    private static int i;
    private static int e;
    public final NLoginCore_460 var_com_nickuc_login_NLoginCore_460_a;
    private static int var_int_f;
    private static int j;
    private static int h;
    public final String ci;
    private static int var_int_a;
    public final NLoginCore_271 var_com_nickuc_login_NLoginCore_271_a;
    private static long n;
    private static long var_long_b;

    @Generated
    public NLoginCore_588(ForceRegisterConfig ForceRegisterConfig2, String string, NLoginCore_271 NLoginCore_2712, NLoginCore_460 NLoginCore_4602) {
        this.var_com_nickuc_login_ForceRegisterConfig_f = ForceRegisterConfig2;
        this.ci = string;
        this.var_com_nickuc_login_NLoginCore_271_a = NLoginCore_2712;
        this.var_com_nickuc_login_NLoginCore_460_a = NLoginCore_4602;
    }

    private static void b() {
        int n;
        c = 1002539231879159297L;
        long l = c ^ 0xDFFD3CB420C5ACE3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(40 + 29), (byte)(52 + 31), 47, (byte)(40 + 27), (byte)(48 + 18), 67, (byte)(31 + 16), (byte)(40 + 40), (byte)(46 + 29), (byte)(24 + 43), (byte)(37 + 46), (byte)(3 + 50), (byte)(21 + 59), (byte)(10 + 87), (byte)(34 + 66), (byte)(46 + 54), (byte)(27 + 78), (byte)(38 + 72), (byte)(47 + 56)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
                    NLoginCore_588.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ֱ֓֔ճ֑րֱնֹևֿׁ֚֩սցֽ֬ւտր׀ֿׂց֕׆և֮֋ּ֤", (byte)126, 69);
                    NLoginCore_588.var_java_lang_String_arr_b[1] = NLoginCore_138.F("ջ֟ևְֲ֑֚շַևֆվ֟սָ֛־քׂׅ֭֚ֆּ֤֦֮֨֠֏ֈׇֽהו֏։ֺ֡֗׋ד֢֩", (byte)126, 70);
                    NLoginCore_588.var_java_lang_String_arr_b[2] = NLoginCore_223.D("բտաօռէ֚֜կ֡֡֬օ֭լֲֲ֢֯ֆևַջֿ֌ֿ֖֚֓ցַ֕", (byte)126, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_588.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ֈ։֦ըֆյ֦ի֮ռ֞֏ִֶղնֲ֡շմյֱֿֿ֮֬֞֍ָ֮֎֠և׀ּּֿ׍ֆֹּ֫֞֗", (byte)126, 67);
                    NLoginCore_588.var_java_lang_String_arr_b[1] = NLoginCore_453.E("ջ֟ևְֲ֑֚շַևֆվ֟սָ֛־քׂׅ֭֚ֆּ֤֦֮֨֠֏ֈׇ֏֓׃֣׃֘֡֬֍ֱּ֢", (byte)126, 69);
                    NLoginCore_588.var_java_lang_String_arr_b[2] = NLoginCore_223.D("բտաօռէ֚֜կ֡֡֬օ֭լֲֲ֢֯ֆևֱַׂׂ֑֒֞ׄ֗ֆַ֤֑֦֜֞տ֣ցֺ֥֞֗", (byte)126, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_588.var_java_lang_String_arr_b[0] = NLoginCore_223.F("֮օէվ֠֕և֌ֵַ֛֒յ֐֋ׂցּ֭ց֥׆֍֎", (byte)126, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_588.var_java_lang_String_arr_b[0] = NLoginCore_027.C("վ՟ւյ֕ռ։վչ֏ւշ", (byte)126, 67);
                }
            }
        }
    }

    @Override
    @Generated
    public boolean f() {
        return this.var_boolean_b;
    }

    private static String a(int n, long l) {
        l ^= 0x31L;
        l ^= 0xDFFD3CB420C5ACE3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(2 + 67), (byte)(57 + 26), (byte)(42 + 5), (byte)(34 + 33), (byte)(41 + 25), (byte)(12 + 55), (byte)(37 + 10), (byte)(62 + 18), (byte)(71 + 4), (byte)(62 + 5), (byte)(20 + 63), (byte)(28 + 25), (byte)(47 + 33), (byte)(48 + 49), (byte)(18 + 82), (byte)(18 + 82), 105, (byte)(82 + 28), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(34 + 49)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.E("բկծԱձխըձռիԸնպճնռԾࣙࢷࢭࢼ࣐࣓࣏ࣚࣞࣛࣜࣕ࣍࣎", (byte)67, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_588.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    @Nullable
    public NLoginCore_042 com_nickuc_login_NLoginCore_042_a() {
        return this.var_com_nickuc_login_NLoginCore_042_a;
    }

    @Override
    public boolean e() {
        return (this.var_com_nickuc_login_NLoginCore_271_a != null ? i : j) != 0;
    }

    @Override
    public ForceRegisterConfig com_nickuc_login_ForceRegisterConfig_a() {
        return this.var_com_nickuc_login_ForceRegisterConfig_f;
    }

    @Override
    public void g() {
        this.var_boolean_b = h;
    }

    @Generated
    private NLoginCore_588(ForceRegisterConfig ForceRegisterConfig2, String string, NLoginCore_271 NLoginCore_2712, NLoginCore_460 NLoginCore_4602, @Nullable NLoginCore_042 NLoginCore_0422, boolean bl) {
        this.var_com_nickuc_login_ForceRegisterConfig_f = ForceRegisterConfig2;
        this.ci = string;
        this.var_com_nickuc_login_NLoginCore_271_a = NLoginCore_2712;
        this.var_com_nickuc_login_NLoginCore_460_a = NLoginCore_4602;
        this.var_com_nickuc_login_NLoginCore_042_a = NLoginCore_0422;
        this.var_boolean_b = bl;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_588.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ϩЋЍϭБаШоЪϹзЭлеϾУхфмтмБ", (byte)4, 67), NLoginCore_588.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆѡпефјѢћїѦѣѤѝѕіà", (byte)4, 65) + string + NLoginCore_384.D("ϻ", (byte)4, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public String java_lang_String_d() {
        return this.ci;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-9188696027962697808L);
        d = Long.reverse(-8358680908399640576L);
        e = (1024 >>> 138 | 1024 << ~138 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(-1);
        g = Long.reverse(899367137347213232L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (16 >>> 36 | 16 << ~36 + 1) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = Integer.reverse(-1073741824);
        l = (0x60000000 >>> 189 | 0x60000000 << ~189 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0x40000000);
        n = Long.reverse(899367137347213232L);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_588.b();
        var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f = NLoginCore_389.a((String)NLoginCore_588.c("㺀", (int)m, (long)n));
    }

    public NLoginCore_588 a(ForceRegisterConfig ForceRegisterConfig2, String string) {
        if (ForceRegisterConfig2 == null) {
            throw new IllegalArgumentException((String)NLoginCore_588.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        }
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_588.c("㺃", (int)(e & var_int_f), (long)g));
        }
        return new NLoginCore_588(ForceRegisterConfig2, string, this.var_com_nickuc_login_NLoginCore_271_a, this.var_com_nickuc_login_NLoginCore_460_a, this.var_com_nickuc_login_NLoginCore_042_a, this.var_boolean_b);
    }

    @Override
    public void b(String string, String string2) {
        this.var_com_nickuc_login_NLoginCore_042_a = new NLoginCore_042(string, string2);
    }
}

