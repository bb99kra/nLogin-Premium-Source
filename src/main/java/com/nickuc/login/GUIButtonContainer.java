/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_387;
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

public class GUIButtonContainer {
    private static int g;
    private static int f;
    private final NLoginCore_445 q;
    private final NLoginCore_190 var_com_nickuc_login_NLoginCore_190_a;
    private static long d;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static long c;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;

    private static String a(int n, long l) {
        l ^= 0x18L;
        l ^= 0x47D7A9F41309B418L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(66 + 3), (byte)(21 + 62), (byte)(27 + 20), (byte)(32 + 35), (byte)(14 + 52), (byte)(51 + 16), (byte)(45 + 2), (byte)(6 + 74), (byte)(24 + 51), (byte)(16 + 51), (byte)(22 + 61), (byte)(21 + 32), 80, (byte)(56 + 41), 100, (byte)(37 + 63), (byte)(28 + 77), (byte)(68 + 42), (byte)(64 + 39)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡧࡗࡩ࡫ࡽ࡛ࢀࡣ", (byte)80, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            GUIButtonContainer.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 3867328363765467441L;
        long l = c ^ 0x47D7A9F41309B418L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(10 + 59), (byte)(29 + 54), 47, (byte)(65 + 2), (byte)(2 + 64), (byte)(56 + 11), (byte)(6 + 41), (byte)(45 + 35), (byte)(40 + 35), 67, (byte)(45 + 38), (byte)(21 + 32), (byte)(74 + 6), (byte)(2 + 95), (byte)(5 + 95), (byte)(68 + 32), (byte)(102 + 3), (byte)(40 + 70), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
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
                    GUIButtonContainer.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƟƦƗǋǐƷǎƺǓǞƠǔǣǞƯǅǠǛƦǇǒƴǆǌƭǛǮǅǲǅǃƱƮǦǒǯǉǍǲǚǴǻǶǅ", (byte)111, 65);
                    continue block7;
                }
                case 1: {
                    GUIButtonContainer.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ƟƦƗǋǐƷǎƺǓǞƠǔǣǞƯǅǠǛƦǇǒƴǆǌƭǛǮǅǲǅǃƱƯƵǧǋƸǧǴǝǪǭǘǅ", (byte)111, 65);
                    continue block7;
                }
                case 2: {
                    GUIButtonContainer.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ǒǍƢƴƐǐǏƧƱƸǡƚƼǚǟƱǐǂǀǘǦǅƤǮǋǩǪǰǪǛǉǋ", (byte)111, 65);
                    continue block7;
                }
                case 4: {
                    GUIButtonContainer.var_java_lang_String_arr_b[0] = NLoginCore_027.E("շ֕ձցօն֣֪֦֝նիօթ֍֤֞֔֊։ַցվտ", (byte)111, 69);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = -1 >>> 79 | -1 << -79;
        d = Long.reverse(-7741388606031145556L);
        e = (0 >>> 1 | 0 << ~1 + 1) & 0xFFFFFFFF;
        f = (0x40000000 >>> 190 | 0x40000000 << ~190 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        GUIButtonContainer.b();
    }

    @Generated
    public NLoginCore_445 com_nickuc_login_NLoginCore_445_a() {
        return this.q;
    }

    public static GUIButtonContainer[] a(NLoginCore_277 NLoginCore_277, NLoginCore_445 ... NLoginCore_445Array) {
        if (NLoginCore_445Array.length == 0) {
            throw new IllegalArgumentException((String)GUIButtonContainer.c("㺀", (int)(var_int_a & var_int_b), (long)d));
        }
        GUIButtonContainer[] GUIButtonContainerArray = new GUIButtonContainer[NLoginCore_445Array.length];
        for (int i = e; i < GUIButtonContainerArray.length; ++i) {
            NLoginCore_445 NLoginCore_4452 = NLoginCore_445Array[i];
            GUIButtonContainerArray[i] = NLoginCore_4452.com_nickuc_login_GUIButtonContainer_a(NLoginCore_277);
        }
        return GUIButtonContainerArray;
    }

    @Generated
    public NLoginCore_190 com_nickuc_login_NLoginCore_190_a() {
        return this.var_com_nickuc_login_NLoginCore_190_a;
    }

    @Generated
    public GUIButtonContainer(NLoginCore_445 NLoginCore_4452, NLoginCore_190 NLoginCore_1902) {
        this.q = NLoginCore_4452;
        this.var_com_nickuc_login_NLoginCore_190_a = NLoginCore_1902;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(GUIButtonContainer.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.B("ÍïñÑõĔČĢĎÝěđğęâćĩĨĠĦĠõ", (byte)19, 66), GUIButtonContainer.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎ࢑ࢁ࢓࢕ࢧࢅࢪࢍԢ", (byte)19, 69) + string + NLoginCore_559.F("ԉ", (byte)19, 70) + methodType.toString(), exception);
        }
    }
}

