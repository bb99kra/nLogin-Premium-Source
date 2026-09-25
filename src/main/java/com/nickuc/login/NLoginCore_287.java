/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_287 {
    private static int a = (256 >>> 72 | 256 << ~72 + 1) & 0xFFFFFFFF;
    private static int b = (Integer.MIN_VALUE >>> 254 | Integer.MIN_VALUE << ~254 + 1) & 0xFFFFFFFF;
    static final /* synthetic */ int[] H;

    static {
        H = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_287.H[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_287.H[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

