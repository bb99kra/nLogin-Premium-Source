/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_013 {
    private static int a = (256 >>> 72 | 256 << ~72 + 1) & 0xFFFFFFFF;
    private static int b = Integer.reverse(0x40000000);
    static final /* synthetic */ int[] y;

    static {
        y = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_013.y[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_k.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_013.y[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_l.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

