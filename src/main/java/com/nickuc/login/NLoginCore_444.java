/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.protocol.ConnectionState
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;

class NLoginCore_444 {
    private static int c;
    static final /* synthetic */ int[] R;
    private static int a;
    private static int b;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        b = 4096 >>> 171 | 4096 << -171;
        c = 0xC00000 >>> 86 | 0xC00000 << ~86 + 1;
        R = new int[ConnectionState.values().length];
        try {
            NLoginCore_444.R[ConnectionState.LOGIN.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_444.R[ConnectionState.CONFIGURATION.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_444.R[ConnectionState.PLAY.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

