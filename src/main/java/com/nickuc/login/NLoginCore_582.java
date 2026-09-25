/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_582 {
    static final /* synthetic */ int[] w;
    private static int b;
    private static int a;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = 1024 >>> 233 | 1024 << ~233 + 1;
        w = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_582.w[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_o.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_582.w[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_p.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

