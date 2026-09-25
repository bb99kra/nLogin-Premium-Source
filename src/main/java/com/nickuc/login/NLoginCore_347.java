/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_347 {
    private static int b;
    private static int a;
    static final /* synthetic */ int[] F;

    static {
        a = (512 >>> 201 | 512 << -201) & 0xFFFFFFFF;
        b = (2 >>> 224 | 2 << ~224 + 1) & 0xFFFFFFFF;
        F = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_347.F[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_347.F[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

