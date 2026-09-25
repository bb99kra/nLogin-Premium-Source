/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_248;

class NLoginCore_080 {
    private static int a = (32768 >>> 111 | 32768 << ~111 + 1) & 0xFFFFFFFF;
    static final /* synthetic */ int[] d;
    private static int b = (256 >>> 135 | 256 << ~135 + 1) & 0xFFFFFFFF;

    static {
        d = new int[NLoginCore_248.values().length];
        try {
            NLoginCore_080.d[NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_080.d[NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

