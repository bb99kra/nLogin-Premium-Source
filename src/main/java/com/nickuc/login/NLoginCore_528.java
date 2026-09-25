/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_028;
import com.nickuc.login.NLoginInterface_019;
import java.util.UUID;
import javax.annotation.Nonnull;

public class NLoginCore_528
implements NLoginInterface_019<UUID> {
    public static final NLoginCore_528 a = new NLoginCore_528();

    @Override
    public UUID a(@Nonnull JSONObject jSONObject) {
        String string = NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a.a(jSONObject);
        return NLoginCore_432.c(string);
    }

    @Override
    public Class<?> a() {
        return UUID.class;
    }

    @Override
    public JSONObject a(@Nonnull UUID uUID) {
        return NLoginCore_028.var_com_nickuc_login_NLoginCore_028_java_lang_String__a.a((Object)NLoginCore_432.b(uUID));
    }
}

