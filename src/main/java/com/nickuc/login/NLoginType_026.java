/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;

class NLoginType_026 {
    private static int a = (1 >>> 192 | 1 << -192) & 0xFFFFFFFF;
    static final /* synthetic */ int[] ah;
    private static int c;
    private static int e;
    private static int d;
    private static int b;

    static {
        b = 128 >>> 166 | 128 << ~166 + 1;
        c = Integer.reverse(-1073741824);
        d = 0x400000 >>> 84 | 0x400000 << -84;
        e = (0x140000 >>> 242 | 0x140000 << ~242 + 1) & 0xFFFFFFFF;
        ah = new int[SpawnType.values().length];
        try {
            NLoginType_026.ah[SpawnType.JOIN.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_026.ah[SpawnType.FIRST_JOIN.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_026.ah[SpawnType.LOGIN.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_026.ah[SpawnType.REGISTER.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginType_026.ah[SpawnType.RESPAWN.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

