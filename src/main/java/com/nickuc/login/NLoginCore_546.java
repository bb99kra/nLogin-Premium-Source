/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_546 {
    private static int l;
    private static int var_int_b;
    private static long var_long_c;
    private static int i;
    private static int d;
    private static int m;
    private static long e;
    private static long k;
    private static int h;
    private static String[] var_java_lang_String_arr_b;
    private static int n;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static int j;
    private static int o;
    private static int f;
    private static int var_int_c;
    private static int p;

    public static <T> T b(Method method, Object object, Object ... objectArray) {
        return (T)method.invoke(object, objectArray);
    }

    @Nullable
    public static <T> Constructor<T> a(Class<?> clazz, Class<?> ... classArray) {
        try {
            return NLoginCore_546.b(clazz, classArray);
        }
        catch (ClassCastException | NoSuchMethodException exception) {
            return null;
        }
    }

    @Nullable
    public static Method a(Class<?> clazz, @Nullable String string, @Nullable Class<?> clazz2, Class<?> ... classArray) {
        Method[] methodArray = clazz.getDeclaredMethods();
        int n = methodArray.length;
        for (int i = var_int_b; i < n; ++i) {
            Method method = methodArray[i];
            if (string != null && !method.getName().equals(string) || clazz2 != null && !method.getReturnType().equals(clazz2) || !Arrays.equals(method.getParameterTypes(), classArray)) continue;
            method.setAccessible(var_int_c != 0);
            return method;
        }
        return null;
    }

    @Nullable
    public static <T> T a(Method method, Object object, Object ... objectArray) {
        if (method != null) {
            try {
                return NLoginCore_546.b(method, object, objectArray);
            }
            catch (ClassCastException | IllegalAccessException | InvocationTargetException exception) {
                // empty catch block
            }
        }
        return null;
    }

    public static Method b(Class<?> clazz, String string, Class<?> ... classArray) {
        Method method = clazz.getDeclaredMethod(string, classArray);
        method.setAccessible(var_int_a != 0);
        return method;
    }

    private static void b() {
        int n;
        var_long_c = 8354198577321954446L;
        long l = var_long_c ^ 0xB75FC113905F5E95L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(2 + 67), (byte)(68 + 15), (byte)(22 + 25), (byte)(46 + 21), (byte)(11 + 55), (byte)(38 + 29), (byte)(17 + 30), (byte)(47 + 33), (byte)(59 + 16), (byte)(9 + 58), (byte)(61 + 22), (byte)(51 + 2), (byte)(53 + 27), 97, (byte)(91 + 9), (byte)(30 + 70), 105, (byte)(70 + 40), (byte)(81 + 22)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_546.var_java_lang_String_arr_b[0] = NLoginCore_138.F("Ոէ՘՟ցՉՒօտնժ֐՗ցմփ։՝իյ՝պ֏աբ֣֛֤֗֜֔֔", (byte)87, 70);
                    NLoginCore_546.var_java_lang_String_arr_b[1] = NLoginCore_324.C("ԡԠԴӳӶӪԹԗӴԼӸԦԑӲԔӽԝӼԗ԰ԂԙՂԩՀԋԦԬԭԩ԰ԟ", (byte)87, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_546.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ŢƁŲŹƛţŬƟƙƐƄƪűƛƎƝƣŷƅƏŷƔƺƒƔŸƴƍƠƿżƄ", (byte)87, 65);
                    NLoginCore_546.var_java_lang_String_arr_b[1] = NLoginCore_324.C("ԡԠԴӳӶӪԹԗӴԼӸԦԑӲԔӽԝӼԗ԰ԂԓՃՄԔԅԣՏՏԮԩԼՎՒԪԕ԰ՕՇԌՖԚ՗Ԣ", (byte)87, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_546.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ӪԁԎԨӲԐԲԍԜԪԨԵӸՀӽԬԭԥԭԻՁԐԍԎ", (byte)87, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_546.var_java_lang_String_arr_b[0] = NLoginCore_004.E("՞֍բՋջի՜՞֐կՐե֌֘Ր֔֘պ֑֍֞֏զէ", (byte)87, 69);
                }
            }
        }
    }

    public static <T> T a(Method method, Object ... objectArray) {
        if (method != null) {
            try {
                return NLoginCore_546.b(method, objectArray);
            }
            catch (ClassCastException | IllegalAccessException | InvocationTargetException exception) {
                // empty catch block
            }
        }
        return null;
    }

    public static <T> T b(Method method, Object ... objectArray) {
        return NLoginCore_546.b(method, null, objectArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_546.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԿագՃէֆվ֔րՏ֍փ֑֋Քչ֛֚֒֘֒է", (byte)91, 70), NLoginCore_546.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.F("պևֆՉ։օր։֔փՐ֎֒֋֎֔Ֆࢻࣄ࣢ࣰࣲ࣮ࣣࣦ࣪ի", (byte)91, 70) + string + NLoginCore_138.A("ů", (byte)91, 65) + methodType.toString(), exception);
        }
    }

    public static Field a(Class<?> clazz, String string) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible(m != 0);
        return field;
    }

    @Nullable
    public static Field a(Class<?> clazz, @Nullable Class<?> clazz2, int n) {
        if (n < 0) {
            throw new IllegalArgumentException((String)NLoginCore_546.c("㺀", (int)d, (long)e) + n);
        }
        Field[] fieldArray = clazz.getDeclaredFields();
        if (fieldArray.length > 0) {
            int n2 = f;
            Field[] fieldArray2 = fieldArray;
            int n3 = fieldArray2.length;
            for (int i = g; i < n3; ++i) {
                Field field = fieldArray2[i];
                if (clazz2 != null) {
                    Class<?> clazz3 = field.getType();
                    if (clazz2 != Object.class ? clazz3 == Object.class || !clazz2.isAssignableFrom(clazz3) : clazz3 != Object.class) continue;
                }
                if (n2 == n) {
                    field.setAccessible(h != 0);
                    return field;
                }
                ++n2;
            }
        }
        return null;
    }

    @Nullable
    public static Field a(Class<?> clazz, String ... stringArray) {
        if (stringArray.length == 0) {
            throw new IllegalArgumentException((String)NLoginCore_546.c("㺀", (int)(i & j), (long)k));
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = l; i < n; ++i) {
            String string = stringArray2[i];
            try {
                return NLoginCore_546.a(clazz, string);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                continue;
            }
        }
        return null;
    }

    @Nullable
    public static Field a(Class<?> clazz, int n) {
        return NLoginCore_546.a(clazz, null, n);
    }

    private static String a(int n, long l) {
        l ^= 0x5AL;
        l ^= 0xB75FC113905F5E95L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(27 + 42), (byte)(30 + 53), (byte)(28 + 19), (byte)(50 + 17), (byte)(23 + 43), (byte)(22 + 45), (byte)(9 + 38), (byte)(21 + 59), 75, (byte)(58 + 9), (byte)(3 + 80), (byte)(50 + 3), (byte)(79 + 1), (byte)(35 + 62), (byte)(49 + 51), (byte)(7 + 93), 105, (byte)(33 + 77), (byte)(91 + 12)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("ԱԾԽԀՀԼԷՀՋԺԇՅՉՂՅՋԍࡲࡻ࢙ࢥࢩ࢚ࢧ࢝ࢡ", (byte)18, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_546.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    public static Method a(Class<?> clazz, String string, Class<?> ... classArray) {
        try {
            return NLoginCore_546.b(clazz, string, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static <T> Constructor<T> b(Class<?> clazz, Class<?> ... classArray) {
        Constructor<?> constructor = clazz.getDeclaredConstructor(classArray);
        constructor.setAccessible(n != 0);
        return constructor;
    }

    static {
        var_int_a = 32 >>> 37 | 32 << ~37 + 1;
        var_int_b = (0 >>> 100 | 0 << -100) & 0xFFFFFFFF;
        var_int_c = (0x100000 >>> 20 | 0x100000 << ~20 + 1) & 0xFFFFFFFF;
        d = 0 >>> 17 | 0 << ~17 + 1;
        e = Long.reverse(3112719754340077518L);
        f = (0 >>> 83 | 0 << -83) & 0xFFFFFFFF;
        g = (0 >>> 37 | 0 << ~37 + 1) & 0xFFFFFFFF;
        h = (0x20000000 >>> 221 | 0x20000000 << -221) & 0xFFFFFFFF;
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(-1);
        k = Long.reverse(3112719754340077518L);
        l = Integer.reverse(0);
        m = (1 >>> 160 | 1 << ~160 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0x40000000);
        p = (0x400000 >>> 149 | 0x400000 << -149) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[o];
        var_java_lang_String_arr_b = new String[p];
        NLoginCore_546.b();
    }
}

