/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_229;

class NLoginCore_434 {
    private static int var_int_j;
    private static int var_int_i;
    static final /* synthetic */ int[] var_int_arr_j;
    private static int b;
    private static int a;
    private static int f;
    private static int e;
    private static int h;
    static final /* synthetic */ int[] var_int_arr_i;
    private static int d;
    private static int c;
    private static int l;
    static final /* synthetic */ int[] var_int_arr_k;
    private static int g;
    private static int var_int_k;

    static {
        a = 131072 >>> 81 | 131072 << -81;
        b = 2048 >>> 42 | 2048 << -42;
        c = 0x180000 >>> 243 | 0x180000 << ~243 + 1;
        d = Integer.reverse(0x20000000);
        e = 80 >>> 4 | 80 << -4;
        f = Integer.reverse(0x60000000);
        g = 4096 >>> 140 | 4096 << ~140 + 1;
        h = 4096 >>> 43 | 4096 << -43;
        var_int_i = 128 >>> 39 | 128 << ~39 + 1;
        var_int_j = (32 >>> 132 | 32 << -132) & 0xFFFFFFFF;
        var_int_k = (-2147483647 >>> 159 | -2147483647 << -159) & 0xFFFFFFFF;
        l = Integer.reverse(0x20000000);
        var_int_arr_k = new int[NLoginCore_280.values().length];
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_f.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_a.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_b.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_c.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_d.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_k[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_e.ordinal()] = f;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        var_int_arr_j = new int[NLoginCore_555.values().length];
        try {
            NLoginCore_434.var_int_arr_j[NLoginCore_555.var_com_nickuc_login_NLoginCore_555_e.ordinal()] = g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_j[NLoginCore_555.var_com_nickuc_login_NLoginCore_555_d.ordinal()] = h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        var_int_arr_i = new int[NLoginCore_229.values().length];
        try {
            NLoginCore_434.var_int_arr_i[NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c.ordinal()] = var_int_i;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_i[NLoginCore_229.var_com_nickuc_login_NLoginCore_229_a.ordinal()] = var_int_j;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_i[NLoginCore_229.var_com_nickuc_login_NLoginCore_229_b.ordinal()] = var_int_k;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_434.var_int_arr_i[NLoginCore_229.var_com_nickuc_login_NLoginCore_229_d.ordinal()] = l;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

