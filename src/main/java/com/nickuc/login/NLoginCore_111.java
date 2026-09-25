/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_123;
import lombok.Generated;

public class NLoginCore_111
extends NLoginCore_123 {
    private static final NLoginCore_111 b;
    private final String aX;
    private static int d;

    @Generated
    public String K() {
        return this.aX;
    }

    static {
        d = Integer.reverse(0);
        b = new NLoginCore_111(null, d, null);
    }

    static /* synthetic */ NLoginCore_111 b() {
        return b;
    }

    public NLoginCore_111(byte[] byArray, int n, String string) {
        super(byArray, n);
        this.aX = string;
    }
}

