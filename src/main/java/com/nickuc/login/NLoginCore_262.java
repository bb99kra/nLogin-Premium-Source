/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_036;

class NLoginCore_262 {
    private static int b;
    private static int c;
    private static int a;
    static final /* synthetic */ int[] m;

    static {
        a = (256 >>> 168 | 256 << -168) & 0xFFFFFFFF;
        b = (0x4000000 >>> 89 | 0x4000000 << ~89 + 1) & 0xFFFFFFFF;
        c = 0x300000 >>> 84 | 0x300000 << ~84 + 1;
        m = new int[NLoginCore_036.values().length];
        try {
            NLoginCore_262.m[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_262.m[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_262.m[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

