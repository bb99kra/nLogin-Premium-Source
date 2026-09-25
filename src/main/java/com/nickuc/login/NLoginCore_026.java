/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_026
extends Enum<NLoginCore_026> {
    public static final /* enum */ NLoginCore_026 var_com_nickuc_login_NLoginCore_026_a;
    public static final /* enum */ NLoginCore_026 var_com_nickuc_login_NLoginCore_026_b;
    public static final /* enum */ NLoginCore_026 var_com_nickuc_login_NLoginCore_026_c;
    public static final /* enum */ NLoginCore_026 var_com_nickuc_login_NLoginCore_026_d;
    private final char var_char_e;
    private final Function<Long, Long> cfr_renamed_3;
    private static final /* synthetic */ NLoginCore_026[] var_com_nickuc_login_NLoginCore_026_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static long var_long_a;
    private static long var_long_b;
    private static long var_long_d;
    private static long var_long_e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static long n;
    private static long o;
    private static int p;
    private static int q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;
    private static int aa;
    private static int ab;
    private static long ac;
    private static long ad;
    private static int ae;
    private static int af;

    static {
        var_long_a = Long.reverse(0x3C00000000000000L);
        var_long_b = Long.reverse(0x3C00000000000000L);
        var_long_d = Long.reverse(0x1800000000000000L);
        var_long_e = Long.reverse(-2L);
        f = (32768 >>> 173 | 32768 << -173) & 0xFFFFFFFF;
        g = 0 >>> 67 | 0 << ~67 + 1;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0x40000000);
        j = Integer.reverse(-1073741824);
        k = 0x400000 >>> 84 | 0x400000 << ~84 + 1;
        NLoginCore_026.l = Integer.reverse(0x20000000);
        m = 0 >>> 109 | 0 << -109;
        n = Long.reverse(1958570383982790985L);
        o = Long.reverse(-1729382256910270464L);
        p = (0 >>> 64 | 0 << -64) & 0xFFFFFFFF;
        q = (0xC80000 >>> 49 | 0xC80000 << -49) & 0xFFFFFFFF;
        r = Integer.reverse(Integer.MIN_VALUE);
        s = Long.reverse(1958570383982790985L);
        t = Long.reverse(-1729382256910270464L);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(0x16000000);
        w = Integer.reverse(0x40000000);
        x = Integer.reverse(-1);
        y = Long.reverse(-923733377534326455L);
        z = Integer.reverse(0x40000000);
        aa = 6976 >>> 70 | 6976 << -70;
        ab = Integer.reverse(-1073741824);
        ac = Long.reverse(1958570383982790985L);
        ad = Long.reverse(-1729382256910270464L);
        ae = 0x18000000 >>> 123 | 0x18000000 << ~123 + 1;
        af = Integer.reverse(-838860800);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[NLoginCore_026.l];
        NLoginCore_026.b();
        var_com_nickuc_login_NLoginCore_026_a = new NLoginCore_026((char)q, l -> TimeUnit.MILLISECONDS.toDays((long)l) % var_long_e);
        var_com_nickuc_login_NLoginCore_026_b = new NLoginCore_026((char)v, l -> TimeUnit.MILLISECONDS.toHours((long)l) % var_long_d);
        var_com_nickuc_login_NLoginCore_026_c = new NLoginCore_026((char)aa, l -> TimeUnit.MILLISECONDS.toMinutes((long)l) % var_long_b);
        var_com_nickuc_login_NLoginCore_026_d = new NLoginCore_026((char)af, l -> TimeUnit.MILLISECONDS.toSeconds((long)l) % var_long_a);
        var_com_nickuc_login_NLoginCore_026_arr_a = NLoginCore_026.a();
    }

    private static /* synthetic */ NLoginCore_026[] a() {
        NLoginCore_026[] NLoginCore_026Array = new NLoginCore_026[f];
        NLoginCore_026Array[NLoginCore_026.g] = var_com_nickuc_login_NLoginCore_026_a;
        NLoginCore_026Array[NLoginCore_026.h] = var_com_nickuc_login_NLoginCore_026_b;
        NLoginCore_026Array[NLoginCore_026.i] = var_com_nickuc_login_NLoginCore_026_c;
        NLoginCore_026Array[NLoginCore_026.j] = var_com_nickuc_login_NLoginCore_026_d;
        return NLoginCore_026Array;
    }

    public static NLoginCore_026 valueOf(String string) {
        return Enum.valueOf(NLoginCore_026.class, string);
    }

    static /* synthetic */ char char_a(NLoginCore_026 NLoginCore_026) {
        return NLoginCore_026.var_char_e;
    }

    @Generated
    private NLoginCore_026(char c, Function<Long, Long> function) {
        this.var_char_e = c;
        this.var_com_nickuc_login_NLoginCore_026_a = function;
    }

    private static String a(int n, long l) {
        l ^= 0x17L;
        l ^= 0xAD2930C03F25D601L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(44 + 25), (byte)(9 + 74), (byte)(17 + 30), (byte)(17 + 50), (byte)(33 + 33), (byte)(18 + 49), (byte)(27 + 20), (byte)(72 + 8), (byte)(47 + 28), (byte)(45 + 22), (byte)(74 + 9), (byte)(4 + 49), (byte)(37 + 43), 97, (byte)(24 + 76), (byte)(92 + 8), (byte)(69 + 36), (byte)(13 + 97), (byte)(57 + 46)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣤईःࣻऋःई࣫ऄंࣶ", (byte)119, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_026.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_026.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.B("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 66), NLoginCore_026.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.D("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡍࡱ࡬ࡤࡴ࡬ࡱࡔ࡭࡫࡟Ӳ", (byte)77, 68) + string + NLoginCore_559.C("Ӗ", (byte)77, 67) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -7885619171130837800L;
        long l = var_long_c ^ 0xAD2930C03F25D601L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(49 + 20), (byte)(50 + 33), (byte)(35 + 12), (byte)(60 + 7), (byte)(15 + 51), (byte)(15 + 52), (byte)(43 + 4), (byte)(64 + 16), (byte)(60 + 15), (byte)(12 + 55), (byte)(26 + 57), (byte)(18 + 35), (byte)(56 + 24), (byte)(28 + 69), (byte)(8 + 92), (byte)(51 + 49), (byte)(87 + 18), 110, (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_026.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ՀզզՏիՌՙհՋԹՉՂ", (byte)62, 69);
                    NLoginCore_026.var_java_lang_String_arr_b[1] = NLoginCore_173.A("ŌŔŬņŠŸŨŷŸŚŖŃ", (byte)62, 65);
                    NLoginCore_026.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ӄӂңӊӥӡҪҼӠҰӬҷ", (byte)62, 67);
                    NLoginCore_026.var_java_lang_String_arr_b[3] = NLoginCore_451.B("őŵİŮĸŕĵńŪŰĵŃ", (byte)62, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_026.var_java_lang_String_arr_b[0] = NLoginCore_559.E("ե՜ՈԿԳՑՔ՗շԺՑՂ", (byte)62, 69);
                    NLoginCore_026.var_java_lang_String_arr_b[1] = NLoginCore_223.F("՝ըՎլնչթխդհԼՂ", (byte)62, 70);
                    NLoginCore_026.var_java_lang_String_arr_b[2] = NLoginCore_387.A("ŉŴŠŉŪńūŭĺŖŭūĶĸĴŋżŏřŖŚšŎŏ", (byte)62, 65);
                    NLoginCore_026.var_java_lang_String_arr_b[3] = NLoginCore_076.D("ҽҡӀӀҪҸҮҭҪӎҿӱӞӉӮӕӪӸӍӑӌӕӂӃ", (byte)62, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_026.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ըԳՂՀճխհ՘լհհԼՋԸՍԺՠՓ՞քսՠՍՎ", (byte)62, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_026.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ӅӒӈҳәӚӀӫӁҼӜӨҾӫӈӟӰӅӯӻӝӅӂӃ", (byte)62, 67);
                }
            }
        }
    }

    public static NLoginCore_026[] values() {
        return (NLoginCore_026[])var_com_nickuc_login_NLoginCore_026_arr_a.clone();
    }

    static /* synthetic */ Function java_util_function_Function_a(NLoginCore_026 NLoginCore_026) {
        return NLoginCore_026.var_com_nickuc_login_NLoginCore_026_a;
    }
}

