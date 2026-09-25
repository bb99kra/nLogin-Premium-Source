/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_374;

class NLoginCore_202 {
    static final /* synthetic */ int[] ag;
    private static int a = 1 >>> 128 | 1 << ~128 + 1;
    private static int b = Integer.reverse(0x40000000);

    static {
        ag = new int[NLoginCore_374.values().length];
        try {
            NLoginCore_202.ag[NLoginCore_374.h.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_202.ag[NLoginCore_374.i.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

