/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_036;

class NLoginCore_213 {
    static final /* synthetic */ int[] h;
    private static int b;
    private static int a;

    static {
        a = (0x200000 >>> 117 | 0x200000 << ~117 + 1) & 0xFFFFFFFF;
        b = (524288 >>> 18 | 524288 << -18) & 0xFFFFFFFF;
        h = new int[NLoginCore_036.values().length];
        try {
            NLoginCore_213.h[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_213.h[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

