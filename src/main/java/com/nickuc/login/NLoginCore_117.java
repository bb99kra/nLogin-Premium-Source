/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_356;
import com.nickuc.login.NLoginCore_032;
import com.nickuc.login.NLoginCore_512;
import com.nickuc.login.NLoginInterface_033;

public class NLoginCore_117 {
    private static NLoginInterface_033 a;

    static NLoginInterface_033 a() {
        return a;
    }

    static {
        try {
            a = new NLoginCore_512();
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        try {
            if (a == null) {
                a = new NLoginCore_032();
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        if (a == null) {
            a = new NLoginCore_356();
        }
    }
}

