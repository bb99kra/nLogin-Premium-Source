/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_137;

class NLoginCore_169 {
    private static int a = 16 >>> 196 | 16 << ~196 + 1;
    static final /* synthetic */ int[] ae;
    private static int b = 0x200000 >>> 116 | 0x200000 << -116;

    static {
        ae = new int[NLoginCore_137.values().length];
        try {
            NLoginCore_169.ae[NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_169.ae[NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

