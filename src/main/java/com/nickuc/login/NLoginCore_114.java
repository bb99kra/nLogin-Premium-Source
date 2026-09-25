/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lombok.Generated;

public class NLoginCore_114<T>
extends AbstractSet<T> {
    private static int a = (0 >>> 53 | 0 << -53) & 0xFFFFFFFF;
    public static final Set<?> p = new NLoginCore_114(new HashSet());
    public static final Set<String> q = new NLoginCore_114(new HashSet());
    public static final Set<Integer> r = new NLoginCore_114(new HashSet());
    private final Set<T> s;

    @Override
    public boolean contains(Object object) {
        return this.s.contains(object);
    }

    @Override
    public Iterator<T> iterator() {
        return this.s.iterator();
    }

    @SafeVarargs
    public static <T> NLoginCore_114<T> a(T ... TArray) {
        HashSet<T> hashSet = new HashSet<T>(Arrays.asList(TArray));
        return new NLoginCore_114<T>(hashSet);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Set) {
            return object.equals(this.s);
        }
        return a != 0;
    }

    public static <T> NLoginCore_114<T> a(Set<T> set) {
        return new NLoginCore_114<T>(set);
    }

    @Generated
    private NLoginCore_114(Set<T> set) {
        this.s = set;
    }

    @Override
    public int size() {
        return this.s.size();
    }
}

