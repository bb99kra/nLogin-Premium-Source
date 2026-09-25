/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_537;
import com.nickuc.login.NLoginCore_112;
import java.util.concurrent.TimeUnit;
import lombok.Generated;

public class NLoginCore_270 {
    private static double a = Double.longBitsToDouble(Long.reverse(192770L));
    private static double d;
    private static double c;
    private static double f;
    private static int g;
    private static double e;
    private final long x;
    private static double b;

    public String a(TimeUnit timeUnit, long l, int n) {
        return NLoginCore_112.a(this.a(timeUnit, l), n);
    }

    @Generated
    public long i() {
        return this.x;
    }

    static {
        b = Double.longBitsToDouble(Long.reverse(18969730L));
        c = Double.longBitsToDouble(Long.reverse(2796794754L));
        d = Double.longBitsToDouble(Long.reverse(57731437634L));
        e = Double.longBitsToDouble(Long.reverse(702789996866L));
        f = Double.longBitsToDouble(Long.reverse(4166733122370L));
        g = Integer.reverse(0x40000000);
    }

    public static NLoginCore_270 a(long l) {
        return new NLoginCore_270(l);
    }

    public String a(TimeUnit timeUnit, int n) {
        return NLoginCore_112.a(this.a(timeUnit), n);
    }

    public double a(TimeUnit timeUnit, long l) {
        long l2 = l - this.x;
        switch (NLoginCore_537.s[timeUnit.ordinal()]) {
            case 1: {
                return l2;
            }
            case 2: {
                return (double)l2 / a;
            }
            case 3: {
                return (double)l2 / b;
            }
            case 4: {
                return (double)l2 / c;
            }
            case 5: {
                return (double)l2 / d;
            }
            case 6: {
                return (double)l2 / e;
            }
            case 7: {
                return (double)l2 / f;
            }
        }
        return l2;
    }

    public String aq() {
        return this.a(TimeUnit.SECONDS, g);
    }

    public long h() {
        return (long)this.a(TimeUnit.MILLISECONDS);
    }

    public double a(TimeUnit timeUnit) {
        return this.a(timeUnit, System.nanoTime());
    }

    public NLoginCore_270(long l) {
        this.x = l;
    }

    public NLoginCore_270() {
        this(System.nanoTime());
    }
}

