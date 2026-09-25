/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_311;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_363;
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

public final class NLoginCore_282
extends Enum<NLoginCore_282> {
    public static final /* enum */ NLoginCore_282 var_com_nickuc_login_NLoginCore_282_b;
    public static final /* enum */ NLoginCore_282 var_com_nickuc_login_NLoginCore_282_c;
    public static final /* enum */ NLoginCore_282 var_com_nickuc_login_NLoginCore_282_d;
    private final NLoginCore_363 var_com_nickuc_login_NLoginInterface_034_a;
    private static final /* synthetic */ NLoginCore_282[] var_com_nickuc_login_NLoginCore_282_arr_a;
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
    private static long h;
    private static int i;
    private static int j;
    private static int k;
    private static long l;
    private static int m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;

    public static NLoginCore_282 valueOf(String string) {
        return Enum.valueOf(NLoginCore_282.class, string);
    }

    private static void b() {
        int n;
        var_long_c = 3373231887190471586L;
        long l = var_long_c ^ 0xD927C0FE0722D4B2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(26 + 43), 83, (byte)(5 + 42), (byte)(14 + 53), 66, (byte)(47 + 20), (byte)(38 + 9), (byte)(74 + 6), (byte)(73 + 2), (byte)(36 + 31), (byte)(9 + 74), (byte)(25 + 28), (byte)(61 + 19), (byte)(13 + 84), (byte)(91 + 9), (byte)(16 + 84), (byte)(86 + 19), (byte)(81 + 29), (byte)(70 + 33)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
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
                    NLoginCore_282.var_java_lang_String_arr_b[0] = NLoginCore_027.A("æüíåăïĐáÕä×á", (byte)13, 65);
                    NLoginCore_282.var_java_lang_String_arr_b[1] = NLoginCore_446.A("êûÎĈéÓæõâě×á", (byte)13, 65);
                    NLoginCore_282.var_java_lang_String_arr_b[2] = NLoginCore_384.E("ԞӽԻԡӽԸԣՆԤԓԤԑ", (byte)13, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_282.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ÐĒăĊĈĐÑÑÔòðá", (byte)13, 65);
                    NLoginCore_282.var_java_lang_String_arr_b[1] = NLoginCore_138.B("ÌÏëčèçèāċÒĎá", (byte)13, 66);
                    NLoginCore_282.var_java_lang_String_arr_b[2] = NLoginCore_384.A("ïÐđçČêéĐØúĆá", (byte)13, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_282.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ӴԳԥՆԽԞԓԘԤԊԙԥԝՀՌՃՈԞԢԍԢՕԜԝ", (byte)13, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_282.var_java_lang_String_arr_b[0] = NLoginCore_004.C("АщьБЙЭзѕШњѝФ", (byte)13, 67);
                }
            }
        }
    }

    private static /* synthetic */ NLoginCore_282[] a() {
        NLoginCore_282[] NLoginCore_282Array = new NLoginCore_282[var_int_a];
        NLoginCore_282Array[NLoginCore_282.var_int_b] = var_com_nickuc_login_NLoginCore_282_b;
        NLoginCore_282Array[NLoginCore_282.var_int_c] = var_com_nickuc_login_NLoginCore_282_c;
        NLoginCore_282Array[NLoginCore_282.var_int_d] = var_com_nickuc_login_NLoginCore_282_d;
        return NLoginCore_282Array;
    }

    static /* synthetic */ NLoginCore_363 a(NLoginCore_282 NLoginCore_2822) {
        return NLoginCore_2822.var_com_nickuc_login_NLoginInterface_034_a;
    }

    public static NLoginCore_282[] values() {
        return (NLoginCore_282[])var_com_nickuc_login_NLoginCore_282_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x53L;
        l ^= 0xD927C0FE0722D4B2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), 69, (byte)(10 + 73), (byte)(11 + 36), (byte)(27 + 40), (byte)(48 + 18), (byte)(54 + 13), (byte)(16 + 31), (byte)(65 + 15), (byte)(70 + 5), (byte)(50 + 17), (byte)(36 + 47), (byte)(49 + 4), (byte)(68 + 12), (byte)(2 + 95), (byte)(2 + 98), (byte)(59 + 41), (byte)(72 + 33), 110, (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢯࢣࢣࢆࢲࢀࢨࢩࢱࢬࢪࢮࢼࢴ", (byte)27, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_282.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0x300000 >>> 116 | 0x300000 << ~116 + 1) & 0xFFFFFFFF;
        var_int_b = (0 >>> 136 | 0 << ~136 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = (131072 >>> 208 | 131072 << ~208 + 1) & 0xFFFFFFFF;
        e = Integer.reverse(-1073741824);
        f = (0x6000000 >>> 89 | 0x6000000 << -89) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = Long.reverse(-8085016042473780364L);
        i = (0 >>> 175 | 0 << -175) & 0xFFFFFFFF;
        j = (524288 >>> 243 | 524288 << ~243 + 1) & 0xFFFFFFFF;
        k = Integer.reverse(-1);
        l = Long.reverse(-8085016042473780364L);
        m = 4 >>> 34 | 4 << -34;
        n = Integer.reverse(0x40000000);
        o = Integer.reverse(-1);
        p = Long.reverse(-8085016042473780364L);
        q = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_282.b();
        var_com_nickuc_login_NLoginCore_282_b = new NLoginCore_282(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_x);
        var_com_nickuc_login_NLoginCore_282_c = new NLoginCore_282(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_y);
        var_com_nickuc_login_NLoginCore_282_d = new NLoginCore_282(NLoginCore_311.var_com_nickuc_login_NLoginCore_315_z);
        var_com_nickuc_login_NLoginCore_282_arr_a = NLoginCore_282.a();
    }

    @Generated
    private NLoginCore_282(NLoginCore_363 NLoginInterface_0342) {
        this.var_com_nickuc_login_NLoginInterface_034_a = NLoginInterface_0342;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_282.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("ƉƫƭƍƱǐǈǞǊƙǗǍǛǕƞǃǥǤǜǢǜƱ", (byte)113, 65), NLoginCore_282.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.D("իոշԺպնձպօմՁտփռտօՇ࣠ࣔࣔࢷࣣࢱࣙࣚ࣢࣭ࣝࣛࣟࣥա", (byte)113, 68) + string + NLoginCore_110.E("է", (byte)113, 69) + methodType.toString(), exception);
        }
    }
}

