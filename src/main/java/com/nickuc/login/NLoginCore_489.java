/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_555;

class NLoginCore_489 {
    static final /* synthetic */ int[] S;
    private static int c;
    private static int b;
    private static int a;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = (16 >>> 195 | 16 << -195) & 0xFFFFFFFF;
        c = (6 >>> 161 | 6 << ~161 + 1) & 0xFFFFFFFF;
        S = new int[NLoginCore_555.values().length];
        try {
            NLoginCore_489.S[NLoginCore_555.var_com_nickuc_login_NLoginCore_555_f.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_489.S[NLoginCore_555.var_com_nickuc_login_NLoginCore_555_e.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_489.S[NLoginCore_555.var_com_nickuc_login_NLoginCore_555_d.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

