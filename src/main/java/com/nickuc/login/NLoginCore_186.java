/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_186 {
    private static int a = 32 >>> 37 | 32 << ~37 + 1;
    private static int b = 0x100000 >>> 211 | 0x100000 << -211;
    static final /* synthetic */ int[] I;

    static {
        I = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_186.I[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_186.I[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

