/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import lombok.Generated;

public class NLoginCore_002 {
    private final Cache<String, Long> h;
    private static int a = (256 >>> 40 | 256 << -40) & 0xFFFFFFFF;
    private static int b = (0 >>> 75 | 0 << -75) & 0xFFFFFFFF;

    @Generated
    public NLoginCore_002(Cache<String, Long> cache) {
        this.h = cache;
    }

    public static boolean a(String string2, Cache<String, Long> cache) {
        long l = System.currentTimeMillis();
        long l2 = (Long)cache.get((Object)string2, string -> l);
        return (l2 == l ? a : b) != 0;
    }

    public boolean s(String string) {
        return NLoginCore_002.a(string, this.h);
    }
}

