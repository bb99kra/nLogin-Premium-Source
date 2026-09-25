/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.protocol.ConnectionState
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;
import com.nickuc.login.NLoginCore_419;

class NLoginCore_357 {
    private static int e;
    static final /* synthetic */ int[] M;
    private static int a;
    private static int b;
    static final /* synthetic */ int[] L;
    private static int c;
    private static int d;

    static {
        a = 16 >>> 100 | 16 << -100;
        b = Integer.reverse(0x40000000);
        c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0x40000000);
        e = 98304 >>> 175 | 98304 << ~175 + 1;
        M = new int[ConnectionState.values().length];
        try {
            NLoginCore_357.M[ConnectionState.CONFIGURATION.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_357.M[ConnectionState.PLAY.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        L = new int[NLoginCore_419.values().length];
        try {
            NLoginCore_357.L[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_357.L[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_357.L[NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

