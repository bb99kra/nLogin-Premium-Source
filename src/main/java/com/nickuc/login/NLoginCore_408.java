/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_280;

class NLoginCore_408 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private static int b = (0x20000000 >>> 92 | 0x20000000 << -92) & 0xFFFFFFFF;
    static final /* synthetic */ int[] Q;

    static {
        Q = new int[NLoginCore_280.values().length];
        try {
            NLoginCore_408.Q[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_d.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_408.Q[NLoginCore_280.var_com_nickuc_login_NLoginCore_280_e.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

