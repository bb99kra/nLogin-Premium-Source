/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_331;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_218;
import java.sql.Connection;

public abstract class NLoginCore_241<T>
extends NLoginCore_218<T>
implements AutoCloseable {
    protected final Connection b;
    protected final NLoginCore_459 e;

    /* synthetic */ NLoginCore_241(NLoginCore_459 NLoginCore_459, Connection connection, Object object, NLoginCore_331 NLoginCore_331) {
        this(NLoginCore_459, connection, object);
    }

    private NLoginCore_241(NLoginCore_459 NLoginCore_459, Connection connection, T t) {
        super(t, null);
        this.e = NLoginCore_459;
        this.b = connection;
    }
}

