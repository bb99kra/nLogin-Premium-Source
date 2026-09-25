/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_474 {
    private final String[] d;
    private static int a = (0 >>> 3 | 0 << ~3 + 1) & 0xFFFFFFFF;
    private final boolean an;

    public static NLoginCore_474 a(String ... stringArray) {
        return NLoginCore_474.a(a != 0, stringArray);
    }

    public static NLoginCore_474 a(boolean bl, String ... stringArray) {
        return new NLoginCore_474(stringArray, bl);
    }

    @Generated
    public String[] a() {
        return this.d;
    }

    @Generated
    private NLoginCore_474(String[] stringArray, boolean bl) {
        this.d = stringArray;
        this.an = bl;
    }

    @Generated
    public boolean t() {
        return this.an;
    }
}

