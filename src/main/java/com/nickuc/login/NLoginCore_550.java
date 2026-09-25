/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import java.util.concurrent.TimeUnit;

class NLoginCore_550 {
    static final /* synthetic */ int[] aj;
    private static int e;
    private static int f;
    private static int c;
    private static int d;
    private static int b;
    private static int a;

    static {
        a = 0x100000 >>> 244 | 0x100000 << -244;
        b = Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << ~222 + 1;
        c = Integer.reverse(-1073741824);
        d = 2 >>> 223 | 2 << ~223 + 1;
        e = Integer.reverse(-1610612736);
        f = (384 >>> 38 | 384 << ~38 + 1) & 0xFFFFFFFF;
        aj = new int[TimeUnit.values().length];
        try {
            NLoginCore_550.aj[TimeUnit.MICROSECONDS.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_550.aj[TimeUnit.MILLISECONDS.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_550.aj[TimeUnit.SECONDS.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_550.aj[TimeUnit.MINUTES.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_550.aj[TimeUnit.HOURS.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_550.aj[TimeUnit.DAYS.ordinal()] = f;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

