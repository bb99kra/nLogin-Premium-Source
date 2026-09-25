/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Generated;

public class NLoginCore_135<T>
extends AbstractList<T> {
    private static int a = (0 >>> 1 | 0 << -1) & 0xFFFFFFFF;
    public static final List<String> o;
    private final List<T> q;
    public static final List<Integer> p;
    public static final List<?> n;

    @Override
    public int size() {
        return this.q.size();
    }

    @Override
    public boolean contains(Object object) {
        return this.q.contains(object);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof List) {
            return object.equals(this.q);
        }
        return a != 0;
    }

    @SafeVarargs
    public static <T> NLoginCore_135<T> a(T ... TArray) {
        List<T> list = Arrays.asList(TArray);
        return new NLoginCore_135<T>(list);
    }

    static {
        n = new NLoginCore_135(new ArrayList());
        o = new NLoginCore_135(new ArrayList());
        p = new NLoginCore_135(new ArrayList());
    }

    public static <T> NLoginCore_135<T> a(List<T> list) {
        return new NLoginCore_135<T>(new ArrayList<T>(list));
    }

    @Override
    public T get(int n) {
        return this.q.get(n);
    }

    @Generated
    private NLoginCore_135(List<T> list) {
        this.q = list;
    }
}

