/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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

public final class NLoginCore_555
extends Enum<NLoginCore_555> {
    public static final /* enum */ NLoginCore_555 var_com_nickuc_login_NLoginCore_555_d;
    public static final /* enum */ NLoginCore_555 var_com_nickuc_login_NLoginCore_555_e;
    public static final /* enum */ NLoginCore_555 var_com_nickuc_login_NLoginCore_555_f;
    private static final /* synthetic */ NLoginCore_555[] var_com_nickuc_login_NLoginCore_555_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int var_int_f;
    private static int g;
    private static int h;
    private static long i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;

    private static void b() {
        int n;
        var_long_c = -4103045443573786625L;
        long l = var_long_c ^ 0xFA0B4099F9AB0978L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(30 + 39), (byte)(52 + 31), 47, (byte)(55 + 12), (byte)(65 + 1), (byte)(27 + 40), (byte)(42 + 5), (byte)(77 + 3), (byte)(22 + 53), (byte)(57 + 10), (byte)(70 + 13), (byte)(23 + 30), (byte)(35 + 45), (byte)(26 + 71), (byte)(10 + 90), (byte)(36 + 64), (byte)(27 + 78), (byte)(52 + 58), (byte)(77 + 26)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(7 + 76)}, StandardCharsets.UTF_8));
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
                    NLoginCore_555.var_java_lang_String_arr_b[0] = NLoginCore_384.D("ՄԫճյՁՕՀԲԺՋժՁ", (byte)108, 68);
                    NLoginCore_555.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ƝƞƨǎǄǎǀǒƪǕƓƙǅƥƶǍƨǟƙǄǠƽƪƫ", (byte)108, 66);
                    NLoginCore_555.var_java_lang_String_arr_b[2] = NLoginCore_091.E("֎ւճ֓յ֢֕ֆ֢ղջհ", (byte)108, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_555.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ƤǁƨǂƿǃǗƏƤǃƲǊǒǛƲǕƟƜƝǤƳƭƪƫ", (byte)108, 65);
                    NLoginCore_555.var_java_lang_String_arr_b[1] = NLoginCore_173.A("ƝƞƨǎǄǎǀǒƪǕƒǅǐƬǗƹưƓǎǕƮǣƪƫ", (byte)108, 65);
                    NLoginCore_555.var_java_lang_String_arr_b[2] = NLoginCore_138.D("Ձզ՜ՖկԮգկ՘զՄՁ", (byte)108, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_555.var_java_lang_String_arr_b[0] = NLoginCore_138.E("չ֚֚ռ֔֔֕ղ֦֣ս֦է֡օկ֐֤֚օփ֭ք֭ձֳֹ֬ֆ֍֫շ", (byte)108, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_555.var_java_lang_String_arr_b[0] = NLoginCore_324.E("պժք֓ծշ֔ևֆ֢մչք֏ֲ֤֗֫֌ֈ֢֣֯֗֨պֳֳ֥֑֭֙", (byte)108, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_555.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.C("ϵЗЙϹНмдъжЅуйчсЊЯёѐшюшН", (byte)8, 67), NLoginCore_555.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.C("анмϿплжпъйІфшсфъЌޑݿޖބޅތޠހР", (byte)8, 67) + string + NLoginCore_091.C("Ї", (byte)8, 67) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_555 valueOf(String string) {
        return Enum.valueOf(NLoginCore_555.class, string);
    }

    private static String a(int n, long l) {
        l ^= 0x53L;
        l ^= 0xFA0B4099F9AB0978L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(28 + 41), (byte)(9 + 74), (byte)(3 + 44), (byte)(25 + 42), (byte)(5 + 61), (byte)(13 + 54), (byte)(42 + 5), (byte)(29 + 51), (byte)(38 + 37), 67, (byte)(65 + 18), (byte)(51 + 2), (byte)(47 + 33), (byte)(96 + 1), (byte)(94 + 6), (byte)(7 + 93), (byte)(5 + 100), 110, (byte)(65 + 38)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.D("ӪӷӶҹӹӵӰӹԄӳӀӾԂӻӾԄӆࡋ࠹ࡐ࠾࠿ࡆ࡚࠺", (byte)70, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_555.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (12 >>> 34 | 12 << -34) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0x800000 >>> 86 | 0x800000 << -86;
        var_int_e = (49152 >>> 78 | 49152 << ~78 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(-1073741824);
        g = Integer.reverse(0);
        h = Integer.reverse(-1);
        i = Long.reverse(3885478886694252771L);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(-5631191353855773L);
        m = Long.reverse(-3891110078048108544L);
        n = 128 >>> 135 | 128 << -135;
        o = 4096 >>> 139 | 4096 << -139;
        p = Long.reverse(-5631191353855773L);
        q = Long.reverse(-3891110078048108544L);
        r = (0x10000000 >>> 27 | 0x10000000 << ~27 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[var_int_e];
        var_java_lang_String_arr_b = new String[var_int_f];
        NLoginCore_555.b();
        var_com_nickuc_login_NLoginCore_555_d = new NLoginCore_555();
        var_com_nickuc_login_NLoginCore_555_e = new NLoginCore_555();
        var_com_nickuc_login_NLoginCore_555_f = new NLoginCore_555();
        var_com_nickuc_login_NLoginCore_555_arr_a = NLoginCore_555.a();
    }

    private static /* synthetic */ NLoginCore_555[] a() {
        NLoginCore_555[] NLoginCore_555Array = new NLoginCore_555[var_int_a];
        NLoginCore_555Array[NLoginCore_555.var_int_b] = var_com_nickuc_login_NLoginCore_555_d;
        NLoginCore_555Array[NLoginCore_555.var_int_c] = var_com_nickuc_login_NLoginCore_555_e;
        NLoginCore_555Array[NLoginCore_555.var_int_d] = var_com_nickuc_login_NLoginCore_555_f;
        return NLoginCore_555Array;
    }

    public static NLoginCore_555[] values() {
        return (NLoginCore_555[])var_com_nickuc_login_NLoginCore_555_arr_a.clone();
    }
}

