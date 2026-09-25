/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_248;

class NLoginCore_048 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    static final /* synthetic */ int[] f;
    private static int b = Integer.reverse(0x40000000);
    private static int c = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << ~31 + 1;
    static final /* synthetic */ int[] e;
    private static int d = Integer.reverse(0x40000000);

    static {
        f = new int[NLoginCore_137.values().length];
        try {
            NLoginCore_048.f[NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_048.f[NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        e = new int[NLoginCore_248.values().length];
        try {
            NLoginCore_048.e[NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_048.e[NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

