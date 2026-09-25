/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_419;

class NLoginCore_105 {
    private static int c;
    private static int a;
    private static int b;
    static final /* synthetic */ int[] p;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = 32768 >>> 110 | 32768 << -110;
        c = 786432 >>> 18 | 786432 << -18;
        p = new int[NLoginCore_419.values().length];
        try {
            NLoginCore_105.p[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_105.p[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_105.p[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

