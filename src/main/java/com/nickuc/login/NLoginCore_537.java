/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import java.util.concurrent.TimeUnit;

class NLoginCore_537 {
    private static int f;
    private static int d;
    private static int e;
    private static int g;
    private static int c;
    static final /* synthetic */ int[] s;
    private static int b;
    private static int a;

    static {
        a = (1024 >>> 106 | 1024 << ~106 + 1) & 0xFFFFFFFF;
        b = Integer.reverse(0x40000000);
        c = (0x300000 >>> 52 | 0x300000 << ~52 + 1) & 0xFFFFFFFF;
        d = Integer.reverse(0x20000000);
        e = Integer.reverse(-1610612736);
        f = (384 >>> 102 | 384 << ~102 + 1) & 0xFFFFFFFF;
        g = (0xE00000 >>> 181 | 0xE00000 << ~181 + 1) & 0xFFFFFFFF;
        s = new int[TimeUnit.values().length];
        try {
            NLoginCore_537.s[TimeUnit.NANOSECONDS.ordinal()] = a;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.MICROSECONDS.ordinal()] = b;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.MILLISECONDS.ordinal()] = c;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.SECONDS.ordinal()] = d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.MINUTES.ordinal()] = e;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.HOURS.ordinal()] = f;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NLoginCore_537.s[TimeUnit.DAYS.ordinal()] = g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

