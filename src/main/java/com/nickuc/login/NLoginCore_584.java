/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_419;

class NLoginCore_584 {
    static final /* synthetic */ int[] K;
    private static int c;
    private static int a;
    private static int b;

    static {
        a = (0x100000 >>> 212 | 0x100000 << -212) & 0xFFFFFFFF;
        b = (0x10000000 >>> 123 | 0x10000000 << ~123 + 1) & 0xFFFFFFFF;
        c = (0x1800000 >>> 23 | 0x1800000 << -23) & 0xFFFFFFFF;
        K = new int[NLoginCore_419.values().length];
        try {
            NLoginCore_584.K[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_584.K[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_584.K[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

