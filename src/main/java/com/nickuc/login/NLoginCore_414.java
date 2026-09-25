/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import lombok.Generated;

public class NLoginCore_414<T, V> {
    private final T j;
    private final V k;

    @Generated
    public V j() {
        return this.k;
    }

    @Generated
    public T i() {
        return this.j;
    }

    public static <T, V> NLoginCore_414<T, V> a(T t, V v) {
        return new NLoginCore_414<T, V>(t, v);
    }

    @Generated
    private NLoginCore_414(T t, V v) {
        this.j = t;
        this.k = v;
    }
}

