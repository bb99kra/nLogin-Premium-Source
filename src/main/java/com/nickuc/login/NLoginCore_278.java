/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_278 {
    private static int a = (32768 >>> 143 | 32768 << ~143 + 1) & 0xFFFFFFFF;
    private static int b = 256 >>> 199 | 256 << ~199 + 1;
    private static int c = 0x18000000 >>> 27 | 0x18000000 << -27;
    static final /* synthetic */ int[] u;

    static {
        u = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_278.u[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_278.u[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_278.u[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

