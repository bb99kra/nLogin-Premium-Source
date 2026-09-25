/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import java.util.Map;
import java.util.concurrent.Callable;

public class NLoginCore_177 {
    public static <T, V> T a(Map<T, V> map, Callable<T> callable) {
        T t;
        while (map.containsKey(t = callable.call())) {
        }
        return t;
    }
}

