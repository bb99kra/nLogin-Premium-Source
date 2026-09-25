/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_549;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_428 {
    private static int var_int_a;
    private static int var_int_b;
    private static long g;
    private static long d;
    private static String[] var_java_lang_String_arr_a;
    private static long f;
    private static int e;
    private static long c;
    private static int i;
    private static int h;
    private static String[] var_java_lang_String_arr_b;

    public static List<String> a(File file) {
        return NLoginCore_428.a(file, StandardCharsets.UTF_8);
    }

    private static String a(int n, long l) {
        l ^= 0x75L;
        l ^= 0x60FED492E5416105L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(11 + 58), (byte)(38 + 45), (byte)(33 + 14), (byte)(43 + 24), (byte)(49 + 17), (byte)(57 + 10), (byte)(43 + 4), (byte)(70 + 10), (byte)(48 + 27), (byte)(24 + 43), (byte)(60 + 23), 53, (byte)(17 + 63), (byte)(64 + 33), (byte)(22 + 78), (byte)(37 + 63), 105, (byte)(107 + 3), (byte)(48 + 55)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.A("âïî±ñíèñüë¸öúóöü¾љѓцќяѐѓыь", (byte)0, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_428.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static String b(InputStream inputStream) {
        return NLoginCore_428.java_lang_String_a(inputStream, StandardCharsets.UTF_8);
    }

    public static String java_lang_String_a(File file, Charset charset) {
        List<String> list = NLoginCore_428.a(file, charset);
        return String.join((CharSequence)NLoginCore_428.c("㺀", (int)(var_int_a & var_int_b), (long)d), list);
    }

    public static List<String> a(InputStream inputStream) {
        return NLoginCore_428.a(inputStream, StandardCharsets.UTF_8);
    }

    public static String java_lang_String_a(InputStream inputStream, Charset charset) {
        List<String> list = NLoginCore_428.a(inputStream, charset);
        return String.join((CharSequence)NLoginCore_428.c("㺀", (int)e, (long)(f ^ g)), list);
    }

    public static String b(File file) {
        return NLoginCore_428.java_lang_String_a(file, StandardCharsets.UTF_8);
    }

    @CheckReturnValue
    public static NLoginCore_549 a(File file) {
        return NLoginCore_428.com_nickuc_login_NLoginCore_549_a(file, StandardCharsets.UTF_8);
    }

    @CheckReturnValue
    public static NLoginCore_549 com_nickuc_login_NLoginCore_549_a(File file, Charset charset) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            return NLoginCore_428.com_nickuc_login_NLoginCore_549_a(fileInputStream, charset);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        }
    }

    public static List<String> a(File file, Charset charset) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (file.exists()) {
            try (NLoginCore_549 NLoginCore_549 = NLoginCore_428.com_nickuc_login_NLoginCore_549_a(file, charset);){
                String string;
                while ((string = NLoginCore_549.ah()) != null) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(InputStream inputStream, Charset charset) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try (NLoginCore_549 NLoginCore_549 = NLoginCore_428.com_nickuc_login_NLoginCore_549_a(inputStream, charset);){
            String string;
            while ((string = NLoginCore_549.ah()) != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @CheckReturnValue
    public static NLoginCore_549 a(InputStream inputStream) {
        return NLoginCore_428.com_nickuc_login_NLoginCore_549_a(inputStream, StandardCharsets.UTF_8);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_428.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ƋƭƯƏƳǒǊǠǌƛǙǏǝǗƠǅǧǦǞǤǞƳ", (byte)114, 66), NLoginCore_428.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.E("֑֞֝ՠ֚֠֜֗֠֫է֥֢֥֩֫խईंࣵऋࣾࣿंࣺࣻւ", (byte)114, 69) + string + NLoginCore_201.C("Յ", (byte)114, 67) + methodType.toString(), exception);
        }
    }

    @CheckReturnValue
    public static NLoginCore_549 com_nickuc_login_NLoginCore_549_a(InputStream inputStream, Charset charset) {
        return new NLoginCore_549(inputStream, charset);
    }

    static {
        var_int_a = 0 >>> 10 | 0 << -10;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-8612114837731653299L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(2772985020260960589L);
        g = Long.reverse(-5908722711110090752L);
        h = (512 >>> 72 | 512 << -72) & 0xFFFFFFFF;
        i = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_428.b();
    }

    private static void b() {
        int n;
        c = -5579321976939749788L;
        long l = c ^ 0x60FED492E5416105L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(64 + 5), (byte)(33 + 50), 47, (byte)(61 + 6), (byte)(18 + 48), (byte)(37 + 30), (byte)(36 + 11), (byte)(76 + 4), (byte)(7 + 68), (byte)(8 + 59), (byte)(40 + 43), (byte)(3 + 50), (byte)(39 + 41), (byte)(15 + 82), (byte)(67 + 33), 100, (byte)(29 + 76), (byte)(13 + 97), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_428.var_java_lang_String_arr_b[0] = NLoginCore_110.D("֦֛֗մև֓ռ֛֣֥֠մ", (byte)125, 68);
                    NLoginCore_428.var_java_lang_String_arr_b[1] = NLoginCore_004.C("֦֛֗մև֓ռ֛֣֥֠մ", (byte)125, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_428.var_java_lang_String_arr_b[0] = NLoginCore_324.F("ցֆ։վַ֎ֱֺ֊֮֜ց", (byte)125, 70);
                    NLoginCore_428.var_java_lang_String_arr_b[1] = NLoginCore_076.A("ǦǆǢƫǰǌǵǁǘǗǶǁ", (byte)125, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_428.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ǄǑǌǬǗƮǙưƷǑǽƻǘƽǈƿǛǯƻǄǿȅǌǍ", (byte)125, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_428.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ւձոպղցըչրռժְր֨ց֋փըղ֐հ֒տր", (byte)125, 68);
                }
            }
        }
    }
}

