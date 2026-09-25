/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_502;
import com.nickuc.login.NLoginCore_523;

public interface NLoginCore_151
extends NLoginCore_502 {
    @Override
    default public boolean a(NLoginType_008 NLoginType_008) {
        NLoginCore_523 NLoginCore_4952 = NLoginType_008.com_nickuc_login_NLoginCore_495_a();
        return this.boolean_a(NLoginType_008, NLoginCore_4952, NLoginCore_4952.com_nickuc_login_NLoginCore_459_a());
    }

    public boolean boolean_a(NLoginType_008 var1, NLoginCore_523 var2, NLoginCore_459 var3);

    default public boolean I() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    default public void c(NLoginType_008 NLoginType_008) {
        NLoginCore_523 NLoginCore_4952 = NLoginType_008.com_nickuc_login_NLoginCore_495_a();
        NLoginCore_459 NLoginCore_459 = NLoginCore_4952.com_nickuc_login_NLoginCore_459_a();
        if (this.I()) {
            NLoginCore_459 NLoginCore_4592 = NLoginCore_523.a(NLoginType_008, NLoginCore_459.com_nickuc_login_NLoginCore_036_a(), true);
            try {
                this.void_a(NLoginType_008, NLoginCore_4952, NLoginCore_4592);
            }
            finally {
                NLoginCore_4592.void_c();
            }
        } else {
            this.void_a(NLoginType_008, NLoginCore_4952, NLoginCore_459);
        }
    }

    public void void_a(NLoginType_008 var1, NLoginCore_523 var2, NLoginCore_459 var3);
}

