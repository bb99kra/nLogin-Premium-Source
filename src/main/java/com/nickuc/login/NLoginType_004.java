/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.AccountType
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;

class NLoginType_004 {
    private static int b;
    private static int var_int_a;
    static final /* synthetic */ int[] var_int_arr_a;

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        b = Integer.reverse(0x40000000);
        var_int_arr_a = new int[AccountType.values().length];
        try {
            NLoginType_004.var_int_arr_a[AccountType.PREMIUM.ordinal()] = var_int_a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_004.var_int_arr_a[AccountType.BEDROCK.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

