/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_336;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_387;
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

public abstract class NLoginCore_438
implements NLoginCore_395,
NLoginCore_336 {
    private static int var_int_c;
    private static int l;
    private static long f;
    private static int i;
    private static String[] var_java_lang_String_arr_a;
    private static int g;
    private static int m;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static int var_int_b;
    private static int k;
    private static int var_int_d;
    private static long var_long_c;
    private static int j;
    private final NLoginCore_211 ar;
    private final NLoginCore_248 var_com_nickuc_login_NLoginCore_311_d;
    private static int h;
    private final NLoginCore_374 var_com_nickuc_login_NLoginCore_487_c;
    private static int o;
    private static int e;

    @Generated
    NLoginCore_438(NLoginCore_211 NLoginCore_211, NLoginCore_248 NLoginCore_3112, NLoginCore_374 NLoginCore_4872) {
        this.ar = NLoginCore_211;
        this.var_com_nickuc_login_NLoginCore_311_d = NLoginCore_3112;
        this.var_com_nickuc_login_NLoginCore_487_c = NLoginCore_4872;
    }

    private static void b() {
        int n;
        var_long_c = -8736936233762046835L;
        long l = var_long_c ^ 0xEEEAF60EDFA97EDAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(2 + 67), (byte)(32 + 51), (byte)(31 + 16), (byte)(8 + 59), (byte)(33 + 33), (byte)(30 + 37), (byte)(4 + 43), (byte)(16 + 64), (byte)(9 + 66), (byte)(25 + 42), (byte)(61 + 22), (byte)(27 + 26), 80, (byte)(58 + 39), 100, (byte)(29 + 71), (byte)(64 + 41), (byte)(86 + 24), (byte)(24 + 79)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_438.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ԨԔԢԫԴԜԭԬԵԻԻԠգՍՔԘԤՈՅԲ՗ՄԱԲ", (byte)99, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_438.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ԨԔԢԫԴԜԭԬԵԻԼԛԼԠՒԿԤԽԠՄլՔգՅՂ՜ՉՀԳզմը", (byte)99, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_438.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ւ֚֎֑֒՘֎ր֓ւ֚իր֝տտ՚ն֓֜եօղճ", (byte)99, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_438.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ԪՐԋԳ԰ԶՏԿ՛՝ՎԶԚԺԲ՘՞ՑեԶԺԩՎ՝ԩԪԪԮլՃճՀ", (byte)99, 67);
                }
            }
        }
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return l != 0;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        var_int_d = 0 >>> 98 | 0 << ~98 + 1;
        e = 0 >>> 107 | 0 << -107;
        f = Long.reverse(-8989753833847258271L);
        g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0);
        j = 0 >>> 22 | 0 << ~22 + 1;
        k = Integer.reverse(0);
        l = Integer.reverse(0);
        m = (65536 >>> 144 | 65536 << -144) & 0xFFFFFFFF;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 131072 >>> 81 | 131072 << ~81 + 1;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_438.b();
    }

    @Override
    public boolean boolean_at() {
        return m != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ar;
    }

    @Generated
    public NLoginCore_248 com_nickuc_login_NLoginCore_311_a() {
        return this.var_com_nickuc_login_NLoginCore_311_d;
    }

    @Override
    public void b(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (this.var_com_nickuc_login_NLoginCore_311_d.java_lang_String_b(ForceRegisterConfig2) == null) {
            return;
        }
        NLoginCore_395.super.b(NLoginType_008, NLoginCore_277, NLoginCore_5092);
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, this.var_com_nickuc_login_NLoginCore_487_c, new Object[j]);
        return new GUIButtonContainer[k];
    }

    private static String a(int n, long l) {
        l ^= 0x4CL;
        l ^= 0xEEEAF60EDFA97EDAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(17 + 52), (byte)(73 + 10), (byte)(41 + 6), (byte)(5 + 62), (byte)(10 + 56), (byte)(11 + 56), 47, (byte)(35 + 45), (byte)(51 + 24), 67, (byte)(18 + 65), (byte)(26 + 27), (byte)(74 + 6), (byte)(81 + 16), (byte)(64 + 36), (byte)(75 + 25), (byte)(101 + 4), (byte)(31 + 79), (byte)(87 + 16)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.D("҇ҔғіҖҒҍҖҡҐѝқҟҘқҡѣߞ߾ࠀ߳ߜ߷ߤߗࠃࠃ߻", (byte)37, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_438.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_438.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.A("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 65), NLoginCore_438.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("՘եդԧէգ՞էղաԮլհթլղԴࢯ࣏࣑ࣄࢭࣈࢵࢨࣔࣔ࣌Ջ", (byte)57, 70) + string + NLoginCore_004.B("ī", (byte)57, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!this.var_com_nickuc_login_NLoginCore_311_d.d(NLoginType_008)) {
            return var_int_a != 0;
        }
        if (!this.var_com_nickuc_login_NLoginCore_311_d.aJ()) {
            return var_int_b != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (ForceRegisterConfig2.t() && !this.var_com_nickuc_login_NLoginCore_311_d.aK()) {
            return var_int_c != 0;
        }
        if (ForceRegisterConfig2.u() && !this.var_com_nickuc_login_NLoginCore_311_d.aL()) {
            return var_int_d != 0;
        }
        if (NLoginCore_277.i((String)NLoginCore_438.c("㺀", (int)e, (long)f) + this.var_com_nickuc_login_NLoginCore_311_d.getName())) {
            return g != 0;
        }
        return (this.var_com_nickuc_login_NLoginCore_311_d.java_lang_String_b(ForceRegisterConfig2) == null ? h : i) != 0;
    }
}

