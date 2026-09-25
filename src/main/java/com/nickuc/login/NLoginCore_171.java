/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_241;
import com.nickuc.login.NLoginCore_331;
import com.nickuc.login.NLoginCore_459;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NLoginCore_171
extends NLoginCore_241<ResultSet> {
    private final PreparedStatement a;

    private NLoginCore_171(NLoginCore_459 NLoginCore_459, Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        super(NLoginCore_459, connection, resultSet, null);
        this.a = preparedStatement;
    }

    @Override
    public void close() {
        ((ResultSet)this.d()).close();
        this.a.close();
        this.e.a(this.b);
    }

    /* synthetic */ NLoginCore_171(NLoginCore_459 NLoginCore_459, Connection connection, PreparedStatement preparedStatement, ResultSet resultSet, NLoginCore_331 NLoginCore_331) {
        this(NLoginCore_459, connection, preparedStatement, resultSet);
    }
}

