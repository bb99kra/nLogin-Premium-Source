/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_451;
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

public final class NLoginCore_204
extends Enum<NLoginCore_204> {
    public static final /* enum */ NLoginCore_204 var_com_nickuc_login_NLoginCore_204_b;
    public static final /* enum */ NLoginCore_204 var_com_nickuc_login_NLoginCore_204_c;
    public static final /* enum */ NLoginCore_204 var_com_nickuc_login_NLoginCore_204_d;
    private final String bb;
    private static final /* synthetic */ NLoginCore_204[] var_com_nickuc_login_NLoginCore_204_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static long i;
    private static int j;
    private static int k;
    private static int l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;
    private static long v;
    private static int w;
    private static int x;
    private static long y;
    private static long z;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_204.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝՗ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_204.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("ՆՓՒԕՕՑՌՕՠՏԜ՚՞՗՚ՠԢࢧࢧࢭ࢒ࢮࢴࢹࢯࢗࣄࢰࣈԺ", (byte)39, 69) + string + NLoginCore_384.B("ć", (byte)39, 66) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_204[] values() {
        return (NLoginCore_204[])var_com_nickuc_login_NLoginCore_204_arr_a.clone();
    }

    @Nullable
    public static NLoginCore_204 a(int n) {
        NLoginCore_204[] NLoginCore_204Array = NLoginCore_204.values();
        if (NLoginCore_204Array.length > n) {
            return NLoginCore_204Array[n];
        }
        return null;
    }

    private static void b() {
        int n;
        var_long_c = -6237085648517676277L;
        long l = var_long_c ^ 0xA393F846E7A88134L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(65 + 4), (byte)(29 + 54), (byte)(16 + 31), (byte)(13 + 54), (byte)(56 + 10), 67, (byte)(39 + 8), (byte)(70 + 10), (byte)(49 + 26), (byte)(56 + 11), (byte)(28 + 55), (byte)(36 + 17), (byte)(35 + 45), 97, (byte)(98 + 2), (byte)(15 + 85), (byte)(6 + 99), (byte)(19 + 91), (byte)(29 + 74)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
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
                    NLoginCore_204.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ĵĿōŞţıłĺĢıŚĭ", (byte)51, 65);
                    NLoginCore_204.var_java_lang_String_arr_b[1] = NLoginCore_110.E("ՁդՒզԾըՁՐԭԭԺԷ", (byte)51, 69);
                    NLoginCore_204.var_java_lang_String_arr_b[2] = NLoginCore_324.C("҃ѾҵҝҚҽҽҞҥқҙҖ", (byte)51, 67);
                    NLoginCore_204.var_java_lang_String_arr_b[3] = NLoginCore_110.B("ĜĕŕłŗŞŕŤŜŦŢĭ", (byte)51, 66);
                    NLoginCore_204.var_java_lang_String_arr_b[4] = NLoginCore_091.B("īĽĿŁęŌţŢŒŜŢĭ", (byte)51, 66);
                    NLoginCore_204.var_java_lang_String_arr_b[5] = NLoginCore_173.F("ՠԴՕՃԥՕԺԨԦԭըԷ", (byte)51, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_204.var_java_lang_String_arr_b[0] = NLoginCore_027.D("үұҧғ҃ӂңһӀҺӎҺӓҒҍӌҔұӔӈҖӊҡҢ", (byte)51, 68);
                    NLoginCore_204.var_java_lang_String_arr_b[1] = NLoginCore_451.C("ҟҡҶҟӅҖҭӀӎҡҝӊӂҨӍӐӃҠҏҦҔӊҡҢ", (byte)51, 67);
                    NLoginCore_204.var_java_lang_String_arr_b[2] = NLoginCore_076.D("ҜҠ҂҄ҝҬӎҹҺҪӋҨҰӓҦӈӗҰӒҦұҴҡҢ", (byte)51, 68);
                    NLoginCore_204.var_java_lang_String_arr_b[3] = NLoginCore_004.E("բԢ՟ՖՊԤՏ՛ըդ՛ՄԦեյդՍՎդը՛իՂՃ", (byte)51, 69);
                    NLoginCore_204.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ѽҽғӃҋңӋҼҮҜһҖ", (byte)51, 68);
                    NLoginCore_204.var_java_lang_String_arr_b[5] = NLoginCore_091.D("җғҥҪҿҜӋҀҰҌҝҖ", (byte)51, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_204.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ԥԴԹիխԨ՝զզՐՍՋՐկՠ՘աՖ԰խհՕՂՃ", (byte)51, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_204.var_java_lang_String_arr_b[0] = NLoginCore_173.A("įĬōŊŘĶŢļŧŧŒĭ", (byte)51, 65);
                }
            }
        }
    }

    @Generated
    private NLoginCore_204(String string2) {
        this.bb = string2;
    }

    private static /* synthetic */ NLoginCore_204[] a() {
        NLoginCore_204[] NLoginCore_204Array = new NLoginCore_204[var_int_b];
        NLoginCore_204Array[NLoginCore_204.var_int_c] = var_com_nickuc_login_NLoginCore_204_b;
        NLoginCore_204Array[NLoginCore_204.var_int_d] = var_com_nickuc_login_NLoginCore_204_c;
        NLoginCore_204Array[NLoginCore_204.e] = var_com_nickuc_login_NLoginCore_204_d;
        return NLoginCore_204Array;
    }

    @Nullable
    public static NLoginCore_204 a(String string) {
        NLoginCore_204[] NLoginCore_204Array = NLoginCore_204.values();
        int n = NLoginCore_204Array.length;
        for (int i = var_int_a; i < n; ++i) {
            NLoginCore_204 NLoginCore_2042 = NLoginCore_204Array[i];
            if (!NLoginCore_2042.bb.equalsIgnoreCase(string)) continue;
            return NLoginCore_2042;
        }
        return null;
    }

    @Generated
    public String getName() {
        return this.bb;
    }

    public static NLoginCore_204 valueOf(String string) {
        return Enum.valueOf(NLoginCore_204.class, string);
    }

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0xA393F846E7A88134L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(27 + 42), (byte)(73 + 10), 47, (byte)(17 + 50), (byte)(50 + 16), (byte)(12 + 55), (byte)(11 + 36), (byte)(64 + 16), (byte)(63 + 12), (byte)(56 + 11), (byte)(42 + 41), (byte)(39 + 14), (byte)(72 + 8), (byte)(57 + 40), (byte)(3 + 97), (byte)(24 + 76), (byte)(72 + 33), (byte)(65 + 45), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.F("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢙࢙࢟ࢄࢠࢦࢫࢡࢉࢶࢢࢺ", (byte)25, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_204.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 232 | 0 << -232) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(-1073741824);
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(Integer.MIN_VALUE);
        e = Integer.MIN_VALUE >>> 254 | Integer.MIN_VALUE << -254;
        f = 96 >>> 132 | 96 << -132;
        g = 0x1800000 >>> 214 | 0x1800000 << -214;
        h = Integer.reverse(0);
        i = Long.reverse(-5421394454540546411L);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = (-1 >>> 243 | -1 << -243) & 0xFFFFFFFF;
        m = Long.reverse(-5421394454540546411L);
        n = 8 >>> 2 | 8 << ~2 + 1;
        o = Integer.reverse(-1);
        p = Long.reverse(-5421394454540546411L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = 98304 >>> 239 | 98304 << -239;
        s = Long.reverse(-3403781821478564203L);
        t = Long.reverse(0x6400000000000000L);
        u = (16 >>> 34 | 16 << ~34 + 1) & 0xFFFFFFFF;
        v = Long.reverse(-5421394454540546411L);
        w = Integer.reverse(0x40000000);
        x = Integer.reverse(-1610612736);
        y = Long.reverse(-3403781821478564203L);
        z = Long.reverse(0x6400000000000000L);
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_204.b();
        var_com_nickuc_login_NLoginCore_204_b = new NLoginCore_204((String)NLoginCore_204.c("㺃", (int)(k & l), (long)m));
        var_com_nickuc_login_NLoginCore_204_c = new NLoginCore_204((String)NLoginCore_204.c("㺉", (int)r, (long)(s ^ t)));
        var_com_nickuc_login_NLoginCore_204_d = new NLoginCore_204((String)NLoginCore_204.c("㺏", (int)x, (long)(y ^ z)));
        var_com_nickuc_login_NLoginCore_204_arr_a = NLoginCore_204.a();
    }
}

