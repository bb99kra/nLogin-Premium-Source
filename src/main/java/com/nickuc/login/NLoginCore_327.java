/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_327 {
    private static int a = (1024 >>> 234 | 1024 << ~234 + 1) & 0xFFFFFFFF;
    private static int b = Integer.reverse(0x40000000);
    static final /* synthetic */ int[] D;

    static {
        D = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_327.D[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_327.D[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

