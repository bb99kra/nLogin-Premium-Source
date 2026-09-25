/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_425;

public class NLoginCore_548 {
    private static final int aT;
    private static int var_int_a;
    private static int g;
    private static final long[][] var_long_arr_arr_a;
    private static int e;
    private static final long[] var_long_arr_a;
    private static final int aS;
    private static final boolean[] var_boolean_arr_a;
    private static final int[] ai;
    private static int var_int_d;
    private static int b;
    private static int c;
    private static int f;
    private static final Object[] var_java_lang_Object_arr_d;

    static /* synthetic */ Object[] java_lang_Object_arr_a() {
        return var_java_lang_Object_arr_d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(NLoginCore_425 NLoginCore_425, long l) {
        long l2 = System.nanoTime() - l;
        int n = NLoginCore_425.ordinal();
        Object object = var_java_lang_Object_arr_d[n];
        synchronized (object) {
            int n2 = n;
            int n3 = ai[n2];
            ai[n2] = n3 + var_int_a;
            int n4 = n3;
            NLoginCore_548.var_long_arr_arr_a[n][n4] = l2;
            NLoginCore_548.var_long_arr_a[n] = l2;
            if (n4 == b) {
                NLoginCore_548.var_boolean_arr_a[n] = c;
                NLoginCore_548.ai[n] = var_int_d;
            }
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        b = Integer.reverse(-813694976);
        c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0 >>> 235 | 0 << ~235 + 1;
        e = Integer.reverse(0);
        f = 4000 >>> 227 | 4000 << ~227 + 1;
        g = (250 >>> 95 | 250 << -95) & 0xFFFFFFFF;
        aS = f;
        aT = NLoginCore_425.values().length;
        var_java_lang_Object_arr_d = NLoginCore_548.a(aT);
        var_long_arr_arr_a = new long[aT][g];
        var_long_arr_a = new long[aT];
        ai = new int[aT];
        var_boolean_arr_a = new boolean[aT];
    }

    static /* synthetic */ int[] int_arr_a() {
        return ai;
    }

    static /* synthetic */ boolean[] boolean_arr_a() {
        return var_boolean_arr_a;
    }

    static /* synthetic */ long[] long_arr_a() {
        return var_long_arr_a;
    }

    private static Object[] a(int n) {
        Object[] objectArray = new Object[n];
        for (int i = e; i < objectArray.length; ++i) {
            objectArray[i] = new Object();
        }
        return objectArray;
    }

    static /* synthetic */ long[][] long_arr_arr_a() {
        return var_long_arr_arr_a;
    }
}

