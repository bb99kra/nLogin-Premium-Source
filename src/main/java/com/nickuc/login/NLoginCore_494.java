/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_231;
import com.nickuc.login.NLoginCore_051;

public interface NLoginCore_494
extends NLoginCore_051 {
    default public NLoginCore_231 com_nickuc_login_NLoginCore_231_a() {
        return this instanceof NLoginCore_277 ? NLoginCore_231.var_com_nickuc_login_NLoginCore_231_a : NLoginCore_231.var_com_nickuc_login_NLoginCore_231_b;
    }

    public String getName();

    public void k(String var1);

    default public void g(String string, Object ... objectArray) {
        this.k(String.format(string, objectArray));
    }

    public boolean i(String var1);
}

