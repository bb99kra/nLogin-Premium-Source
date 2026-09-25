/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_547 {
    private static int a = 2048 >>> 75 | 2048 << -75;
    private static int b = Integer.reverse(0x40000000);
    static final /* synthetic */ int[] z;

    static {
        z = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_547.z[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_g.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_547.z[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_h.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

