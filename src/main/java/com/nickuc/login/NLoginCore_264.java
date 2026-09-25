/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_264 {
    private static int a = (1024 >>> 42 | 1024 << -42) & 0xFFFFFFFF;
    static final /* synthetic */ int[] A;
    private static int b = (0x200000 >>> 244 | 0x200000 << -244) & 0xFFFFFFFF;

    static {
        A = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_264.A[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_264.A[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

