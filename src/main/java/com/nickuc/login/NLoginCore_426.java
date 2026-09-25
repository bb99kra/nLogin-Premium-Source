/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_534;
import com.nickuc.login.NLoginInterface_001;

public class NLoginCore_426 {
    private static NLoginInterface_001 a;

    static NLoginInterface_001 a() {
        return a;
    }

    static {
        try {
            a = new NLoginCore_534();
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        if (a == null) {
            a = (player, string) -> {};
        }
    }
}

