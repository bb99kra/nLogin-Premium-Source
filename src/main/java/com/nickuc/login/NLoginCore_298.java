/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import javax.annotation.Nullable;

public class NLoginCore_298 {
    private static int b;
    private static int a;
    private static int e;
    private static int f;
    private static int d;
    private static int c;
    private static int g;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = 0 >>> 174 | 0 << -174;
        c = Integer.reverse(Integer.MIN_VALUE);
        d = 0 >>> 186 | 0 << ~186 + 1;
        e = (524288 >>> 83 | 524288 << -83) & 0xFFFFFFFF;
        f = 0 >>> 140 | 0 << -140;
        g = (0 >>> 163 | 0 << -163) & 0xFFFFFFFF;
    }

    public static boolean a(Class<?> clazz, String string, Class<?> ... classArray) {
        try {
            clazz.getDeclaredMethod(string, classArray);
            return c != 0;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return d != 0;
        }
    }

    @Nullable
    public static Class<?> a(String string, String ... stringArray) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = g; i < n; ++i) {
                String string2 = stringArray2[i];
                try {
                    return Class.forName(string2);
                }
                catch (ClassNotFoundException | NoClassDefFoundError throwable2) {
                    continue;
                }
            }
            return null;
        }
    }

    public static boolean a(Class<?> clazz, String string) {
        try {
            clazz.getDeclaredField(string);
            return e != 0;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return f != 0;
        }
    }

    public static boolean a(String string, String ... stringArray) {
        return (NLoginCore_298.a(string, stringArray) != null ? a : b) != 0;
    }
}

