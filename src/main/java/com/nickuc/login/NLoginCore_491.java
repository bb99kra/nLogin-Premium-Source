/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.argon2.Argon2
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.argon2.Argon2;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginInterface_009;
import lombok.Generated;

abstract class NLoginCore_491
implements NLoginInterface_009 {
    private static int b;
    private final Argon2 var_com_nickuc_login_lib_argon2_Argon2_a;
    private static int var_int_a;

    @Override
    public boolean v(String string) {
        return this.var_com_nickuc_login_lib_argon2_Argon2_a.needsRehash(string, NLoginCore_532.af.r(), NLoginCore_532.ag.r() * b, NLoginCore_532.ah.r());
    }

    @Generated
    protected NLoginCore_491(Argon2 argon2) {
        this.var_com_nickuc_login_lib_argon2_Argon2_a = argon2;
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        return this.var_com_nickuc_login_lib_argon2_Argon2_a.verify(string2, string.toCharArray());
    }

    @Override
    public String java_lang_String_w(String string) {
        return this.var_com_nickuc_login_lib_argon2_Argon2_a.hash(NLoginCore_532.af.r(), NLoginCore_532.ag.r() * var_int_a, NLoginCore_532.ah.r(), string.toCharArray());
    }

    static {
        var_int_a = (4 >>> 216 | 4 << -216) & 0xFFFFFFFF;
        b = Integer.reverse(0x200000);
    }
}

