/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_459;
import java.sql.Connection;
import lombok.Generated;

public abstract class NLoginCore_021
implements NLoginCore_459 {
    private Connection a;

    @Override
    public void a(Connection connection) {
    }

    @Override
    public synchronized Connection java_sql_Connection_a() {
        if (this.a == null || this.a.isClosed()) {
            this.a = this.java_sql_Connection_c();
        }
        return this.a;
    }

    @Generated
    protected NLoginCore_021() {
    }

    protected abstract Connection java_sql_Connection_c();

    @Override
    public synchronized void void_c() {
        if (this.a != null) {
            this.a.close();
            this.a = null;
        }
    }
}

