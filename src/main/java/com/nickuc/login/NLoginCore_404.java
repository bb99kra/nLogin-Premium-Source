/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_460;
import com.nickuc.login.NLoginCore_009;

class NLoginCore_404 {
    private static int g;
    static final /* synthetic */ int[] V;
    private static int a;
    private static int e;
    private static int b;
    private static int c;
    private static int d;
    static final /* synthetic */ int[] U;
    private static int h;
    private static int f;

    static {
        a = 32768 >>> 239 | 32768 << -239;
        b = 0x100000 >>> 147 | 0x100000 << -147;
        c = (6144 >>> 139 | 6144 << ~139 + 1) & 0xFFFFFFFF;
        d = (32 >>> 99 | 32 << ~99 + 1) & 0xFFFFFFFF;
        e = (0x400000 >>> 182 | 0x400000 << -182) & 0xFFFFFFFF;
        f = (0x10000000 >>> 27 | 0x10000000 << -27) & 0xFFFFFFFF;
        g = Integer.reverse(-1073741824);
        h = Integer.reverse(0x20000000);
        V = new int[NLoginCore_009.values().length];
        try {
            NLoginCore_404.V[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_a.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.V[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.V[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_c.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.V[NLoginCore_009.var_com_nickuc_login_NLoginCore_009_d.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        U = new int[NLoginCore_460.values().length];
        try {
            NLoginCore_404.U[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.U[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c.ordinal()] = f;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.U[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_d.ordinal()] = g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_404.U[NLoginCore_460.var_com_nickuc_login_NLoginCore_460_e.ordinal()] = h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

