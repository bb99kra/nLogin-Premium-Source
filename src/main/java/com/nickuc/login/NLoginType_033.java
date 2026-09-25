/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.ServerConnectType
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;

class NLoginType_033 {
    private static int b;
    static final /* synthetic */ int[] T;
    private static int a;
    private static int c;

    static {
        a = (524288 >>> 211 | 524288 << -211) & 0xFFFFFFFF;
        b = Integer.reverse(0x40000000);
        c = Integer.reverse(-1073741824);
        T = new int[ServerConnectType.values().length];
        try {
            NLoginType_033.T[ServerConnectType.WITH_LAST_SERVER.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_033.T[ServerConnectType.WITH_PLATFORM_SERVER.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_033.T[ServerConnectType.WITH_CONFIGURED_SERVER.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

