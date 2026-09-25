/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_331;
import com.nickuc.login.NLoginCore_459;
import java.sql.Connection;
import lombok.Generated;

public class NLoginCore_365
implements AutoCloseable {
    protected final NLoginCore_459 f;
    private final Connection c;

    @Override
    public void close() {
        this.f.a(this.c);
    }

    @Generated
    private NLoginCore_365(NLoginCore_459 NLoginCore_459, Connection connection) {
        this.f = NLoginCore_459;
        this.c = connection;
    }

    public Connection b() {
        return this.c;
    }

    /* synthetic */ NLoginCore_365(NLoginCore_459 NLoginCore_459, Connection connection, NLoginCore_331 NLoginCore_331) {
        this(NLoginCore_459, connection);
    }
}

