/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.MemClassLoader
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.loader.MemClassLoader;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_126;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Collections;
import java.util.function.Consumer;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_140 {
    private static int j;
    private static int n;
    private static int var_int_c;
    private static int m;
    private static int r;
    private static long var_long_c;
    private static int k;
    private static int v;
    private static int var_int_b;
    private static int u;
    private static int s;
    private static long q;
    private static int p;
    private static int e;
    private static int t;
    private static int i;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int o;
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int d;
    private static int g;
    private static final int ac;
    private static int f;
    private static int l;

    public static void a(InputStream inputStream, OutputStream outputStream) {
        NLoginCore_140.a(inputStream, outputStream, d);
    }

    public static String a(InputStream inputStream, MessageDigest messageDigest) {
        int n;
        byte[] byArray = new byte[h];
        while ((n = inputStream.read(byArray)) > 0) {
            messageDigest.update(byArray, i, n);
        }
        byte[] byArray2 = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray3 = byArray2;
        int n2 = byArray3.length;
        for (int i = j; i < n2; ++i) {
            byte by = byArray3[i];
            stringBuilder.append(Integer.toString((by & k) + l, m).substring(NLoginCore_140.n));
        }
        return stringBuilder.toString();
    }

    @CheckReturnValue
    @Nullable
    public static InputStream a(String string, boolean bl) {
        InputStream inputStream;
        ClassLoader classLoader = NLoginCore_140.class.getClassLoader();
        if (!(classLoader instanceof MemClassLoader)) {
            throw new IllegalArgumentException((String)NLoginCore_140.c("㺀", (int)p, (long)q) + classLoader.getClass().getCanonicalName());
        }
        MemClassLoader memClassLoader = (MemClassLoader)classLoader;
        InputStream inputStream2 = inputStream = bl ? memClassLoader.getParentLoader().getResourceAsStream(string) : memClassLoader.getInJarResourceAsStream(string);
        if (inputStream == null) {
            inputStream = bl ? memClassLoader.getParentLoader().getResourceAsStream((char)r + string) : memClassLoader.getInJarResourceAsStream((char)s + string);
        }
        return inputStream;
    }

    private static void b() {
        int n;
        var_long_c = -3764179294589635679L;
        long l = var_long_c ^ 0xE386A9A35F319B7CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(18 + 51), (byte)(66 + 17), (byte)(30 + 17), (byte)(28 + 39), (byte)(24 + 42), 67, (byte)(38 + 9), (byte)(30 + 50), 75, (byte)(13 + 54), (byte)(64 + 19), (byte)(4 + 49), (byte)(27 + 53), (byte)(3 + 94), (byte)(76 + 24), (byte)(76 + 24), (byte)(87 + 18), (byte)(106 + 4), (byte)(21 + 82)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_140.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ѢќѺѼтуѠѝѯљьѧҒ҃ҒѥҕѥѥқҙѴѮѶѽќѼѰѠҚ҃ѿ", (byte)30, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_140.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ĎĈĦĨîïČĉěąøēľįľđŁđđŇŅĜĥĘĈĢĖłőļīģņŏĔĔĊĴŌĵĜŅŐģ", (byte)30, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_140.var_java_lang_String_arr_b[0] = NLoginCore_091.B("êĔčīĪôùčđďĨă", (byte)30, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_140.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ѹѨѲѹѾѕїѾҌѮ҄ї", (byte)30, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x4FL;
        l ^= 0xE386A9A35F319B7CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83, (byte)(16 + 31), (byte)(14 + 53), (byte)(54 + 12), (byte)(45 + 22), (byte)(35 + 12), (byte)(52 + 28), (byte)(42 + 33), (byte)(8 + 59), (byte)(56 + 27), (byte)(43 + 10), (byte)(56 + 24), (byte)(37 + 60), (byte)(41 + 59), (byte)(53 + 47), (byte)(63 + 42), (byte)(77 + 33), (byte)(86 + 17)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.E("ֆ֓֒Օ֑֕֌֕֠֏՜֚֚֞֗֠բࣱࣴ࣪ࣷࣾ࣫ࣿःࣱऀ࣯ईࣿࣧ", (byte)103, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_140.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @CheckReturnValue
    public static ByteArrayInputStream java_io_ByteArrayInputStream_a(String string) {
        return NLoginCore_140.a(string, StandardCharsets.UTF_8);
    }

    static {
        var_int_a = Integer.reverse(524288);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = 4 >>> 22 | 4 << -22;
        e = Integer.reverse(0);
        f = Integer.reverse(-1);
        g = 0 >>> 94 | 0 << ~94 + 1;
        h = (16 >>> 55 | 16 << -55) & 0xFFFFFFFF;
        i = (0 >>> 88 | 0 << ~88 + 1) & 0xFFFFFFFF;
        j = 0 >>> 215 | 0 << -215;
        k = Integer.reverse(-16777216);
        l = Integer.reverse(0x800000);
        m = Integer.reverse(0x8000000);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0);
        p = Integer.reverse(0);
        q = Long.reverse(8632653642518709203L);
        r = Integer.reverse(-201326592);
        s = (376 >>> 99 | 376 << -99) & 0xFFFFFFFF;
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(524288);
        var_java_lang_String_arr_a = new String[t];
        var_java_lang_String_arr_b = new String[u];
        NLoginCore_140.b();
        ac = v;
    }

    public static byte[] a(Consumer<NLoginCore_126> consumer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        NLoginCore_126 NLoginCore_1262 = new NLoginCore_126(new DataOutputStream(byteArrayOutputStream));
        consumer.accept(NLoginCore_1262);
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(InputStream inputStream, OutputStream outputStream, int n) {
        int n2;
        byte[] byArray = new byte[n];
        while ((n2 = inputStream.read(byArray, e, n)) != f) {
            outputStream.write(byArray, g, n2);
        }
        outputStream.flush();
    }

    @CheckReturnValue
    @Nullable
    public static InputStream java_io_InputStream_a(String string) {
        return NLoginCore_140.a(string, o != 0);
    }

    @CheckReturnValue
    public static ByteArrayInputStream a(String string, Charset charset) {
        return NLoginCore_140.a(string.getBytes(charset));
    }

    @CheckReturnValue
    public static ByteArrayInputStream a(byte[] byArray) {
        return new ByteArrayInputStream(Base64.getDecoder().decode(byArray));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_140.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("՘պռ՜ր֭֟֗֙ը֦֪֤֜խֱֳִ֒֫֫ր", (byte)116, 69), NLoginCore_140.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.D("մցրՃփտպփ֎սՊֈ֌օֈ֎Ր࣢ࣱ࣭࣮ࣶ࣭ࣘࣟࣥ࣬ࣙࣟࣝࣕժ", (byte)116, 68) + string + NLoginCore_004.C("Ջ", (byte)116, 67) + methodType.toString(), exception);
        }
    }

    @CheckReturnValue
    public static byte[] a(InputStream inputStream) {
        return NLoginCore_140.b(inputStream, var_int_a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @CheckReturnValue
    public static byte[] b(InputStream inputStream, int n) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            NLoginCore_140.a(inputStream, byteArrayOutputStream, n);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        finally {
            if (Collections.singletonList(byteArrayOutputStream).get(var_int_b) != null) {
                byteArrayOutputStream.close();
            }
        }
    }
}

