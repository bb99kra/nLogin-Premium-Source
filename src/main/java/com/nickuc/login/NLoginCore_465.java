/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_337;

class NLoginCore_465 {
    static final /* synthetic */ int[] t;
    private static int a = (4 >>> 226 | 4 << ~226 + 1) & 0xFFFFFFFF;
    private static int b = Integer.reverse(0x40000000);

    static {
        t = new int[NLoginCore_337.values().length];
        try {
            NLoginCore_465.t[NLoginCore_337.var_com_nickuc_login_NLoginCore_337_a.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_465.t[NLoginCore_337.var_com_nickuc_login_NLoginCore_337_b.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

