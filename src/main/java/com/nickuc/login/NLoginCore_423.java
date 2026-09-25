/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_423 {
    private final NLoginType_008 r;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static int k;
    private static long g;
    private static int d;
    private static int j;
    private static int i;
    private static long f;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static long m;
    private static int o;
    private static long l;
    private static int h;
    private static int n;
    private static int p;
    private static int e;
    private static int var_int_b;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_423.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 66), NLoginCore_423.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("նփւՅօցռօ֐տՌ֊֎և֊֐Ւࣧ࣢࣭࣐ࣩ࣬࣬ࣝզ", (byte)87, 70) + string + NLoginCore_446.E("Ս", (byte)87, 69) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x3EE6A34837660D17L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(59 + 10), (byte)(45 + 38), (byte)(9 + 38), (byte)(49 + 18), 66, (byte)(25 + 42), (byte)(3 + 44), 80, (byte)(6 + 69), (byte)(33 + 34), (byte)(70 + 13), (byte)(13 + 40), (byte)(67 + 13), (byte)(80 + 17), (byte)(29 + 71), (byte)(71 + 29), (byte)(97 + 8), (byte)(5 + 105), (byte)(77 + 26)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("խպչԼռոճռևնՃցօվցևՉࣣࣞࣙࣤࣇࣣ࣠ࣔ", (byte)78, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_423.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public boolean boolean_a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (this.a(NLoginCore_277, NLoginCore_5092, var_int_a != 0) != null ? var_int_b : var_int_c) != 0;
    }

    static {
        var_int_a = 1024 >>> 138 | 1024 << ~138 + 1;
        var_int_b = (0x40000000 >>> 254 | 0x40000000 << ~254 + 1) & 0xFFFFFFFF;
        var_int_c = (0 >>> 33 | 0 << -33) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = 0 >>> 51 | 0 << ~51 + 1;
        f = Long.reverse(7548202719190720634L);
        g = Long.reverse(0x7400000000000000L);
        h = (32 >>> 101 | 32 << -101) & 0xFFFFFFFF;
        i = 0x200000 >>> 149 | 0x200000 << ~149 + 1;
        j = Integer.reverse(0);
        k = 32 >>> 133 | 32 << ~133 + 1;
        l = Long.reverse(0x2800000000000000L);
        m = Long.reverse(0x2800000000000000L);
        n = Integer.reverse(0);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = 0x2000000 >>> 185 | 0x2000000 << -185;
        var_java_lang_String_arr_a = new String[o];
        var_java_lang_String_arr_b = new String[p];
        NLoginCore_423.b();
    }

    private static void b() {
        int n;
        var_long_c = 6774540089618400022L;
        long l = var_long_c ^ 0x3EE6A34837660D17L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(48 + 21), (byte)(52 + 31), (byte)(42 + 5), 67, 66, (byte)(55 + 12), (byte)(39 + 8), (byte)(64 + 16), (byte)(25 + 50), (byte)(10 + 57), (byte)(66 + 17), (byte)(44 + 9), (byte)(77 + 3), (byte)(50 + 47), (byte)(81 + 19), (byte)(96 + 4), (byte)(100 + 5), (byte)(95 + 15), (byte)(42 + 61)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
                    NLoginCore_423.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ǜƷǧƳǅƣƥǀƥǈǩǇǚƱǰǋƼǄƲǃƵǧƾƿ", (byte)118, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_423.var_java_lang_String_arr_b[0] = NLoginCore_387.E("֣վ֮պ֌ժլևլ֏ְն֍֤հպֵ֐ֳ֝ռֈօֆ", (byte)118, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_423.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ƤǦƺƦǑǈǜǖƴƶǃƧǀƹƺǨǝǲƯǐǣǁƾƿ", (byte)118, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_423.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ն֩շփ֥֪ռ֛֐֡֟պ", (byte)118, 70);
                }
            }
        }
    }

    public NLoginCore_423(NLoginType_008 NLoginType_008) {
        this.r = NLoginType_008;
    }

    private NLoginCore_154 a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        boolean bl2 = NLoginCore_277.i((String)NLoginCore_423.c("㺀", (int)e, (long)(f ^ g)));
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
        boolean bl3 = NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e);
        NLoginCore_501 NLoginCore_5012 = new NLoginCore_501(this.r, bl3, bl, bl2);
        NLoginCore_154 NLoginInterface_0122 = NLoginCore_5012.b(NLoginCore_277, NLoginCore_5092);
        if (NLoginInterface_0122 == null) {
            return null;
        }
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n, NLoginCore_5012);
        if (bl || NLoginInterface_0122 instanceof NLoginCore_395) {
            NLoginInterface_0122.a(this.r, NLoginCore_277, NLoginCore_5092, h != 0);
            if (NLoginInterface_0122 instanceof NLoginCore_395) {
                NLoginCore_395 NLoginInterface_039;
                if (!bl) {
                    NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_y, (Object)(i != 0));
                }
                if ((NLoginInterface_039 = (NLoginCore_395)NLoginInterface_0122).boolean_at()) {
                    NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z, (Object)j);
                }
                if (NLoginInterface_039.au()) {
                    this.r.b(k != 0).a(NLoginInterface_0482 -> {
                        if (!NLoginCore_277.R() || !NLoginInterface_039.boolean_a(NLoginCore_5092)) {
                            NLoginInterface_0482.Z();
                            return;
                        }
                        NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_m, new Object[n]);
                    }, l, m, TimeUnit.SECONDS);
                }
            }
        } else {
            NLoginCore_5092.a(NLoginCore_567.H, NLoginInterface_0122);
        }
        return NLoginInterface_0122;
    }

    public NLoginCore_154 com_nickuc_login_NLoginInterface_012_a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return this.a(NLoginCore_277, NLoginCore_5092, d != 0);
    }
}

