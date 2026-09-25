/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
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

public final class NLoginCore_158 {
    private static int m;
    private static long e;
    private static int f;
    private static int i;
    private static long d;
    private static int l;
    private static long var_long_b;
    private static long var_long_c;
    private static long j;
    private static long h;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static long g;
    private static int var_int_c;
    private static long k;
    private static int var_int_a;

    private static String a(int n, long l) {
        l ^= 0x75L;
        l ^= 0xB3017EDB7E3AD72DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(34 + 35), (byte)(81 + 2), (byte)(26 + 21), (byte)(14 + 53), (byte)(56 + 10), (byte)(19 + 48), (byte)(12 + 35), 80, 75, (byte)(44 + 23), (byte)(13 + 70), (byte)(43 + 10), (byte)(30 + 50), (byte)(49 + 48), (byte)(80 + 20), (byte)(92 + 8), (byte)(92 + 13), (byte)(10 + 100), (byte)(3 + 100)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), (byte)(16 + 67)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӥӐӷӟԉӶӳӼԉԉԏԅӨ", (byte)86, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_158.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 7994245121922656452L;
        long l = var_long_c ^ 0xB3017EDB7E3AD72DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), 69, (byte)(30 + 53), (byte)(44 + 3), (byte)(3 + 64), (byte)(17 + 49), 67, (byte)(33 + 14), (byte)(70 + 10), (byte)(2 + 73), (byte)(46 + 21), (byte)(75 + 8), (byte)(21 + 32), (byte)(61 + 19), (byte)(51 + 46), (byte)(40 + 60), (byte)(5 + 95), (byte)(97 + 8), (byte)(62 + 48), (byte)(73 + 30)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
                    NLoginCore_158.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ƦƠƅǃǏǄƠǁƓǅǇǅƲƔƒƨƗƬƨǐƭǋƫƫǠǀưƣƿǢǜƴ", (byte)106, 66);
                    NLoginCore_158.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ՠէԪդհգԾկՁէբկՅՇՋՊԶիՓղճԷփմՃ՚Լճբշւզ՛։ջՎք֎գՋՊևՍ՛", (byte)106, 67);
                    NLoginCore_158.var_java_lang_String_arr_b[2] = NLoginCore_138.D("ՆՀԥգկդՀաԳեէեՒԴԲՈԷՌՈհՍիՋՋրՠՐՃ՟ւռՔ", (byte)106, 68);
                    NLoginCore_158.var_java_lang_String_arr_b[3] = NLoginCore_091.B("ƊƌƺƪƽƟƏƎǌƋǈưǘƘƥǘƽƺƜǈƛƳǘǕƺǗƠǂǗƧƻǅ", (byte)106, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_158.var_java_lang_String_arr_b[0] = NLoginCore_387.F("չճ՘֖֢֗ճ֔զ֚֘֘օէեջժտջ֣ր֕֋֦ց֤֕ո֧չյ֟", (byte)106, 70);
                    NLoginCore_158.var_java_lang_String_arr_b[1] = NLoginCore_559.B("ǀǇƊǄǐǃƞǏơǇǂǏƥƧƫƪƖǋƳǒǓƗǣǔƣƺƜǓǂǗǢǆƼǘǡǏǬǍƾǊǎƳƱƻ", (byte)106, 66);
                    NLoginCore_158.var_java_lang_String_arr_b[2] = NLoginCore_427.A("ƦƠƅǃǏǄƠǁƓǅǇǅƲƔƒƨƗƬƨǐƭƻǃƹǥǑǖơǖǈǟƢǆƭǂǫǩǂǡǭǡǭǨƻ", (byte)106, 65);
                    NLoginCore_158.var_java_lang_String_arr_b[3] = NLoginCore_004.D("ԪԬ՚Պ՝ԿԯԮլԫըՐոԸՅո՝՚ԼըԻ՗նռՂտՕեաշդս", (byte)106, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_158.var_java_lang_String_arr_b[0] = NLoginCore_384.F("՚֔ս֏փք֣՜օ֖ձծ", (byte)106, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_158.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ǅǀƫƦƢƫưƏƭƤǆƐǅƮưƚƲƸƭƼƬƵǖǏƿǆƹƧǩƤƿƻ", (byte)106, 66);
                }
            }
        }
    }

    public static byte[] byte_arr_a(byte[] byArray) {
        try {
            return Base64.getDecoder().decode(byArray);
        }
        catch (Exception exception) {
            throw new RuntimeException((String)NLoginCore_158.c("㺀", (int)var_int_c, (long)(d ^ e)), exception);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_158.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.B("ÝÿāáąĤĜĲĞíīġįĩòėĹĸİĶİą", (byte)27, 66), NLoginCore_158.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.B("ĘĥĤçħģĞħĲġîĬİĩĬĲôѯњҁѩғҀѽ҆ғғҙҏѲč", (byte)27, 66) + string + NLoginCore_427.B("ï", (byte)27, 66) + methodType.toString(), exception);
        }
    }

    public static String java_lang_String_a(byte[] byArray) {
        if (byArray == null) {
            throw new IllegalArgumentException((String)NLoginCore_158.c("㺀", (int)i, (long)(j ^ k)));
        }
        return new String(Base64.getEncoder().encode(byArray));
    }

    public static String u(String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_158.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        byte[] byArray = NLoginCore_158.byte_arr_a(string.getBytes(StandardCharsets.UTF_8));
        return new String(byArray);
    }

    public static String v(String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_158.c("㺀", (int)f, (long)(g ^ h)));
        }
        return NLoginCore_158.java_lang_String_a(string.getBytes(StandardCharsets.UTF_8));
    }

    static {
        var_int_a = 0 >>> 94 | 0 << ~94 + 1;
        var_long_b = Long.reverse(-8280261803523272842L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(2528377302165917558L);
        e = Long.reverse(-5908722711110090752L);
        f = Integer.reverse(0x40000000);
        g = Long.reverse(2528377302165917558L);
        h = Long.reverse(-5908722711110090752L);
        i = Integer.reverse(-1073741824);
        j = Long.reverse(2528377302165917558L);
        k = Long.reverse(-5908722711110090752L);
        l = Integer.reverse(0x20000000);
        m = Integer.reverse(0x20000000);
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_158.b();
    }
}

