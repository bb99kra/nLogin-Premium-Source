/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.LoginType
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;

class NLoginType_017 {
    private static int a = 131072 >>> 17 | 131072 << ~17 + 1;
    private static int var_int_b;
    static final /* synthetic */ int[] var_int_arr_b;

    static {
        var_int_b = Integer.reverse(0x40000000);
        var_int_arr_b = new int[LoginType.values().length];
        try {
            NLoginType_017.var_int_arr_b[LoginType.REGISTER.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_017.var_int_arr_b[LoginType.LOGIN.ordinal()] = var_int_b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

