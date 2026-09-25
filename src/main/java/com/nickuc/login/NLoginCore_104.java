/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_036;

class NLoginCore_104 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private static int c;
    static final /* synthetic */ int[] l;
    private static int b;

    static {
        b = 0x2000000 >>> 120 | 0x2000000 << ~120 + 1;
        c = (98304 >>> 47 | 98304 << -47) & 0xFFFFFFFF;
        l = new int[NLoginCore_036.values().length];
        try {
            NLoginCore_104.l[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_104.l[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_104.l[NLoginCore_036.var_com_nickuc_login_NLoginCore_036_f.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

