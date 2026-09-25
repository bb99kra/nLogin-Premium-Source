/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_016;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

class NLoginCore_439
implements NLoginInterface_016 {
    private static int a = Integer.reverse(0);
    private static int b = 0 >>> 138 | 0 << ~138 + 1;
    private static int c = (0 >>> 106 | 0 << -106) & 0xFFFFFFFF;
    private final Set<String> n;

    NLoginCore_439 a(String string, String ... stringArray) {
        this.n.add(string.toLowerCase(Locale.ENGLISH));
        if (stringArray.length > 0) {
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = b; i < n; ++i) {
                String string2 = stringArray2[i];
                this.n.add(string2.toLowerCase(Locale.ENGLISH));
            }
        }
        return this;
    }

    @Override
    public boolean filter(String string, String string2, Object ... objectArray) {
        if (!this.n.isEmpty()) {
            String string3 = string2.toLowerCase(Locale.ENGLISH);
            return this.n.stream().anyMatch(string3::contains);
        }
        return c != 0;
    }

    NLoginCore_439(Set<String> set, String ... stringArray) {
        if (!set.isEmpty()) {
            set = set.stream().map(String::toLowerCase).collect(Collectors.toSet());
        }
        this.n = set;
        if (stringArray.length > 0) {
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = a; i < n; ++i) {
                String string = stringArray2[i];
                this.n.add(string.toLowerCase(Locale.ENGLISH));
            }
        }
    }
}

