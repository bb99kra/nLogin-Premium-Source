/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_460;
import com.nickuc.login.NLoginCore_009;

class NLoginCore_486 {
    private static int f;
    private static int g;
    private static int a;
    static final /* synthetic */ int[] W;
    private static int b;
    private static int e;
    private static int d;
    private static int h;
    static final /* synthetic */ int[] X;
    private static int c;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = 0x10000000 >>> 187 | 0x10000000 << -187;
        c = Integer.reverse(-1073741824);
        d = Integer.reverse(0x20000000);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (0x4000000 >>> 57 | 0x4000000 << -57) & 0xFFFFFFFF;
        g = (12288 >>> 172 | 12288 << ~172 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(0x20000000);
        X = new int[NLoginCore_009.values().length];
        try {
            NLoginCore_486.X[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_a.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.X[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.X[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_d.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.X[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_c.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        W = new int[NLoginCore_460.values().length];
        try {
            NLoginCore_486.W[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.W[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c.ordinal()] = f;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.W[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_d.ordinal()] = g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_486.W[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_e.ordinal()] = h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

