/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_265;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;

public class NLoginCore_393 {
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int g;
    private static long f;
    private static int i;
    private static int d;
    private static int e;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;
    private static long m;
    private static long var_long_c;
    private static int var_int_c;
    private static int o;
    private static long l;
    private static int h;
    private static int j;
    private static int k;
    private static final NLoginCore_265 var_com_nickuc_login_NLoginCore_265_a;
    private static int n;

    public static NLoginCore_265 a() {
        return var_com_nickuc_login_NLoginCore_265_a;
    }

    private static String a(int n, long l) {
        l ^= 0x75L;
        l ^= 0xBC489E46E0160975L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), 69, (byte)(13 + 70), (byte)(43 + 4), (byte)(45 + 22), (byte)(22 + 44), (byte)(12 + 55), (byte)(4 + 43), (byte)(71 + 9), (byte)(26 + 49), (byte)(48 + 19), (byte)(80 + 3), (byte)(39 + 14), (byte)(62 + 18), (byte)(23 + 74), (byte)(91 + 9), (byte)(67 + 33), 105, (byte)(20 + 90), (byte)(41 + 62)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.A("ŤűŰĳųůŪųžŭĺŸżŵŸžŀӐӓӛӎӈӘӔӘӍӔӥ", (byte)65, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_393.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 129 | 0 << -129) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(0);
        e = 0 >>> 22 | 0 << ~22 + 1;
        f = Long.reverse(-3217450014347722719L);
        g = (0 >>> 153 | 0 << -153) & 0xFFFFFFFF;
        h = (0 >>> 141 | 0 << ~141 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0);
        j = (0 >>> 140 | 0 << -140) & 0xFFFFFFFF;
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(9032340972100026401L);
        m = Long.reverse(-5908722711110090752L);
        n = 1024 >>> 169 | 1024 << ~169 + 1;
        o = 16384 >>> 77 | 16384 << ~77 + 1;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_393.b();
        var_com_nickuc_login_NLoginCore_265_a = new NLoginCore_265();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive exception aggregation
     */
    public static Location a(String string) {
        try {
            if (string != null) {
                byte[] byArray = Base64.getDecoder().decode(string.getBytes(StandardCharsets.UTF_8));
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
                try {
                    Location location;
                    block11: {
                        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                        try {
                            location = var_com_nickuc_login_NLoginCore_265_a.a(dataInputStream);
                            if (Collections.singletonList(dataInputStream).get(g) == null) break block11;
                        }
                        catch (Throwable throwable) {
                            if (Collections.singletonList(dataInputStream).get(i) != null) {
                                dataInputStream.close();
                            }
                            throw throwable;
                        }
                        dataInputStream.close();
                    }
                    return location;
                }
                finally {
                    if (Collections.singletonList(byteArrayInputStream).get(h) != null) {
                        byteArrayInputStream.close();
                    }
                }
            }
            return null;
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_393.c("㺀", (int)k, (long)(l ^ m)), iOException);
        }
    }

    private static void b() {
        int n;
        var_long_c = -8934758771846374722L;
        long l = var_long_c ^ 0xBC489E46E0160975L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), 69, (byte)(20 + 63), (byte)(46 + 1), (byte)(25 + 42), (byte)(30 + 36), (byte)(43 + 24), (byte)(4 + 43), (byte)(41 + 39), 75, (byte)(21 + 46), (byte)(3 + 80), (byte)(33 + 20), (byte)(63 + 17), (byte)(33 + 64), (byte)(79 + 21), (byte)(69 + 31), (byte)(63 + 42), (byte)(96 + 14), (byte)(26 + 77)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(25 + 44), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_393.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ӣӟӇӻӟӝӛԍԍӰԌԐӚԈӝԕӓӠӶӯӵӵӭԈӫԝӫөӶԤӹԏӵӦӽԝԞԘԘԉԘԂӫӵ", (byte)72, 67);
                    NLoginCore_393.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ťšŉŽšşŝƏƏŲƌŦƏſƕƋŹŔţƄƛŰƔųƉƀŰƖŜŴƎƤŧſƙŵũƕƛƚŰƃưŷ", (byte)72, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_393.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ťšŉŽšşŝƏƏŲƎƒŜƊşƗŕŢŸűŷŷůƊŭƟŭūŸƦŻƑűƃƞƆƤƗƇƐƬƚƎŷ", (byte)72, 65);
                    NLoginCore_393.var_java_lang_String_arr_b[1] = NLoginCore_575.A("ťšŉŽšşŝƏƏŲƌŦƏſƕƋŹŔţƄƛŰƔųƉƀŰƖŜŴƎƤŤťƠƫƥƍƄƈżŨưŷ", (byte)72, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_393.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ӂӱӗԊӔәӛԁӢӎԍӢӎӤӨӫԋӶӳӲӰӣӠӡ", (byte)72, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_393.var_java_lang_String_arr_b[0] = NLoginCore_324.F("ՖսՙՔնտջ՜ե՟Ղջ։ՔՋՙնՖէՇթ՚֑֒ւֈօՐՑ֐ջ՜", (byte)72, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_393.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("íďđñĕĴĬłĮýĻıĿĹĂħŉňŀņŀĕ", (byte)35, 66), NLoginCore_393.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.C("ҁҎҍѐҐҌ҇ҐқҊїҕҙҒҕқѝ߭߰߸߫ߥߵ߱ߵߪ߱ࠂѴ", (byte)35, 67) + string + NLoginCore_223.F("ԙ", (byte)35, 70) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive exception aggregation
     */
    public static String a(Location location) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                String string;
                block10: {
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        var_com_nickuc_login_NLoginCore_265_a.a(location, dataOutputStream);
                        string = new String(Base64.getEncoder().encode(byteArrayOutputStream.toByteArray()), StandardCharsets.UTF_8);
                        if (Collections.singletonList(dataOutputStream).get(var_int_a) == null) break block10;
                    }
                    catch (Throwable throwable) {
                        if (Collections.singletonList(dataOutputStream).get(var_int_c) != null) {
                            dataOutputStream.close();
                        }
                        throw throwable;
                    }
                    dataOutputStream.close();
                }
                return string;
            }
            finally {
                if (Collections.singletonList(byteArrayOutputStream).get(var_int_b) != null) {
                    byteArrayOutputStream.close();
                }
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_393.c("㺀", (int)e, (long)f), iOException);
        }
    }
}

