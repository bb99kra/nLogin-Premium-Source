/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NLoginCore_039 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);

    public static List<String> a(List<String> list, String[] stringArray) {
        if (stringArray.length == 0) {
            return list;
        }
        String string = stringArray[stringArray.length - a].toLowerCase(Locale.ENGLISH);
        if (string.isEmpty()) {
            return list;
        }
        return list.stream().filter(string2 -> string2.toLowerCase(Locale.ENGLISH).startsWith(string)).collect(Collectors.toList());
    }
}

