/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_445;

class NLoginCore_475 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private static int b = 0x2000000 >>> 216 | 0x2000000 << ~216 + 1;
    static final /* synthetic */ int[] v;

    static {
        v = new int[NLoginCore_445.values().length];
        try {
            NLoginCore_475.v[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_i.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_475.v[NLoginCore_445.var_com_nickuc_login_NLoginCore_445_j.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

