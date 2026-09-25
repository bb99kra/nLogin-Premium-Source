/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_283;

public interface NLoginCore_249
extends NLoginCore_395 {
    @Override
    default public boolean c(NLoginType_008 NLoginType_008) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().p();
    }

    @Override
    default public boolean boolean_at() {
        return false;
    }

    default public NLoginCore_283 com_nickuc_login_NLoginCore_283_a(NLoginCore_509 NLoginCore_5092) {
        return NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_o, string -> NLoginCore_283.com_nickuc_login_NLoginCore_283_a());
    }
}

