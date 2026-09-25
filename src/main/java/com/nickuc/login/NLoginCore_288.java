/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_241;
import com.nickuc.login.NLoginCore_331;
import com.nickuc.login.NLoginCore_459;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class NLoginCore_288
extends NLoginCore_241<PreparedStatement> {
    /* synthetic */ NLoginCore_288(NLoginCore_459 NLoginCore_459, Connection connection, PreparedStatement preparedStatement, NLoginCore_331 NLoginCore_331) {
        this(NLoginCore_459, connection, preparedStatement);
    }

    @Override
    public void close() {
        ((PreparedStatement)this.d()).close();
        this.e.a(this.b);
    }

    private NLoginCore_288(NLoginCore_459 NLoginCore_459, Connection connection, PreparedStatement preparedStatement) {
        super(NLoginCore_459, connection, preparedStatement, null);
    }
}

