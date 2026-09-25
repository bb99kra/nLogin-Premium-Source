/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_235;
import com.nickuc.login.NLoginCore_269;
import java.sql.Connection;
import lombok.Generated;

public class NLoginCore_484
implements NLoginCore_459 {
    private final NLoginCore_269 a;
    private final NLoginCore_036 h;

    @Override
    public void void_c() {
        this.a.c();
    }

    @Override
    public void a(Connection connection) {
        connection.close();
    }

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return this.h;
    }

    /* synthetic */ NLoginCore_484(NLoginCore_036 NLoginCore_0362, NLoginCore_269 NLoginCore_2692, NLoginCore_235 NLoginCore_2352) {
        this(NLoginCore_0362, NLoginCore_2692);
    }

    @Generated
    private NLoginCore_484(NLoginCore_036 NLoginCore_0362, NLoginCore_269 NLoginCore_2692) {
        this.h = NLoginCore_0362;
        this.a = NLoginCore_2692;
    }

    @Override
    public Connection java_sql_Connection_a() {
        return this.a.d();
    }
}

