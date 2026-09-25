/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
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

final class NLoginCore_164
extends Enum<NLoginCore_164> {
    public static final /* enum */ NLoginCore_164 var_com_nickuc_login_NLoginCore_164_b;
    public static final /* enum */ NLoginCore_164 var_com_nickuc_login_NLoginCore_164_c;
    public static final /* enum */ NLoginCore_164 var_com_nickuc_login_NLoginCore_164_d;
    private final int aG;
    private static final /* synthetic */ NLoginCore_164[] var_com_nickuc_login_NLoginCore_164_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static long var_long_b;
    private static long var_long_d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static int v;
    private static int w;
    private static int x;
    private static long y;
    private static long z;
    private static int aa;
    private static int ab;

    static /* synthetic */ NLoginCore_164 b(String string, int n) {
        return NLoginCore_164.a(string, n);
    }

    public static NLoginCore_164 valueOf(String string) {
        return Enum.valueOf(NLoginCore_164.class, string);
    }

    private static void b() {
        int n;
        var_long_c = -7914247633286243462L;
        long l = var_long_c ^ 0xFD1700476776BAF4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(24 + 45), 83, (byte)(25 + 22), (byte)(12 + 55), (byte)(29 + 37), 67, (byte)(32 + 15), (byte)(14 + 66), (byte)(19 + 56), (byte)(47 + 20), (byte)(11 + 72), (byte)(42 + 11), (byte)(60 + 20), (byte)(30 + 67), (byte)(20 + 80), (byte)(89 + 11), (byte)(14 + 91), (byte)(24 + 86), (byte)(26 + 77)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_164.var_java_lang_String_arr_b[0] = NLoginCore_575.C("ԣԫՀԻդդ՜՝ՔճհԻ", (byte)106, 67);
                    NLoginCore_164.var_java_lang_String_arr_b[1] = NLoginCore_451.F("՚՝՘տ֢֒ռզ֖֥յծ", (byte)106, 70);
                    NLoginCore_164.var_java_lang_String_arr_b[2] = NLoginCore_027.F("թ֊֔փՙ՚֜֐կՠ֗ծ", (byte)106, 70);
                    NLoginCore_164.var_java_lang_String_arr_b[3] = NLoginCore_453.A("žƗƤƽƹƛƠƳƵǆƍƛ", (byte)106, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_164.var_java_lang_String_arr_b[0] = NLoginCore_387.D("Ԩխ՛ԸԦ՜իԭեԲՖԻ", (byte)106, 68);
                    NLoginCore_164.var_java_lang_String_arr_b[1] = NLoginCore_451.F("՚ծՠ֣ռ֖֠յ֛բդծ", (byte)106, 70);
                    NLoginCore_164.var_java_lang_String_arr_b[2] = NLoginCore_223.E("էֈ֛մծ֢֛ր֝բ֓ծ", (byte)106, 69);
                    NLoginCore_164.var_java_lang_String_arr_b[3] = NLoginCore_138.A("ǇǆƟƭǇƍƑǃƲǒƑƛ", (byte)106, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_164.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ƕǇơƫǍƥƪǐƱǀƭƉƗǏǈƤǗǜƹƞǏǏƦƧ", (byte)106, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_164.var_java_lang_String_arr_b[0] = NLoginCore_223.F("մ֑՚ճ֣՛րռֆ֙զռ֘֘ֆ֮֜֋օֵֻּ֖֑֭֯֞֨֔֯־֚", (byte)106, 70);
                }
            }
        }
    }

    private static NLoginCore_164 a(String string, int n) {
        boolean bl = ((String)NLoginCore_164.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d))).equalsIgnoreCase(string);
        NLoginCore_164[] NLoginCore_164Array = NLoginCore_164.values();
        int n2 = NLoginCore_164Array.length;
        for (int i = e; i < n2; ++i) {
            int n3;
            NLoginCore_164 NLoginCore_1642 = NLoginCore_164Array[i];
            int n4 = bl ? (NLoginCore_1642.aG == n ? f : g) : (n3 = NLoginCore_1642.name().equalsIgnoreCase(string));
            if (n3 == 0) continue;
            return NLoginCore_1642;
        }
        return var_com_nickuc_login_NLoginCore_164_b;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(6835055217404236873L);
        var_long_d = Long.reverse(-432345564227567616L);
        e = Integer.reverse(0);
        f = (4096 >>> 76 | 4096 << -76) & 0xFFFFFFFF;
        g = 0 >>> 118 | 0 << ~118 + 1;
        h = (0x600000 >>> 149 | 0x600000 << ~149 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0);
        j = 16384 >>> 142 | 16384 << ~142 + 1;
        k = Integer.reverse(0x40000000);
        l = 262144 >>> 16 | 262144 << ~16 + 1;
        m = Integer.reverse(0x20000000);
        n = 16384 >>> 14 | 16384 << -14;
        o = -1 >>> 193 | -1 << -193;
        p = Long.reverse(-6567657273650359223L);
        q = Integer.reverse(0);
        r = 0 >>> 207 | 0 << -207;
        s = 8 >>> 130 | 8 << ~130 + 1;
        t = -1 >>> 45 | -1 << ~45 + 1;
        u = Long.reverse(-6567657273650359223L);
        v = (0x2000000 >>> 185 | 0x2000000 << ~185 + 1) & 0xFFFFFFFF;
        w = (4808704 >>> 13 | 4808704 << ~13 + 1) & 0xFFFFFFFF;
        x = Integer.reverse(-1073741824);
        y = Long.reverse(6835055217404236873L);
        z = Long.reverse(-432345564227567616L);
        aa = Integer.reverse(0x40000000);
        ab = Integer.reverse(-1954545664);
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_164.b();
        var_com_nickuc_login_NLoginCore_164_b = new NLoginCore_164(r);
        var_com_nickuc_login_NLoginCore_164_c = new NLoginCore_164(w);
        var_com_nickuc_login_NLoginCore_164_d = new NLoginCore_164(ab);
        var_com_nickuc_login_NLoginCore_164_arr_a = NLoginCore_164.a();
    }

    private static String a(int n, long l) {
        l ^= 0x5FL;
        l ^= 0xFD1700476776BAF4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(49 + 20), (byte)(5 + 78), 47, (byte)(45 + 22), (byte)(18 + 48), (byte)(27 + 40), (byte)(45 + 2), (byte)(6 + 74), (byte)(54 + 21), (byte)(66 + 1), (byte)(48 + 35), (byte)(32 + 21), (byte)(26 + 54), (byte)(5 + 92), (byte)(55 + 45), (byte)(69 + 31), 105, (byte)(62 + 48), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.A("ƺǇǆƉǉǅǀǉǔǃƐǎǒǋǎǔƖԮԞԩԋԱԈԫԘԹԶԻԼԮ", (byte)108, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_164.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static /* synthetic */ NLoginCore_164[] a() {
        NLoginCore_164[] NLoginCore_164Array = new NLoginCore_164[h];
        NLoginCore_164Array[NLoginCore_164.i] = var_com_nickuc_login_NLoginCore_164_b;
        NLoginCore_164Array[NLoginCore_164.j] = var_com_nickuc_login_NLoginCore_164_c;
        NLoginCore_164Array[NLoginCore_164.k] = var_com_nickuc_login_NLoginCore_164_d;
        return NLoginCore_164Array;
    }

    @Generated
    private NLoginCore_164(int n2) {
        this.aG = n2;
    }

    public static NLoginCore_164[] values() {
        return (NLoginCore_164[])var_com_nickuc_login_NLoginCore_164_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_164.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 65), NLoginCore_164.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.E("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձउࣹऄࣦऌࣣआࣳऔऑखगउ֊", (byte)118, 69) + string + NLoginCore_027.D("Ց", (byte)118, 68) + methodType.toString(), exception);
        }
    }
}

