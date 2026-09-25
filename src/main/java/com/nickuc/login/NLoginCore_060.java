/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_419;

class NLoginCore_060 {
    private static int c;
    static final /* synthetic */ int[] ad;
    private static int b;
    private static int a;

    static {
        a = 4096 >>> 204 | 4096 << ~204 + 1;
        b = 2 >>> 192 | 2 << ~192 + 1;
        c = 196608 >>> 144 | 196608 << ~144 + 1;
        ad = new int[NLoginCore_419.values().length];
        try {
            NLoginCore_060.ad[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_060.ad[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_060.ad[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

