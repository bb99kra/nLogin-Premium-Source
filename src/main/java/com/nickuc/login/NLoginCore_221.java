/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_036;
import java.sql.Connection;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Generated;

public class NLoginCore_221
implements NLoginCore_459 {
    private static int var_int_a;
    private final int r;
    private static int b;
    private final AtomicInteger var_java_util_concurrent_atomic_AtomicInteger_a = new AtomicInteger();
    private final NLoginCore_459 c;
    private final Connection var_java_sql_Connection_a;

    @Generated
    public int int_c() {
        return this.r;
    }

    @Override
    public Connection java_sql_Connection_a() {
        if (this.var_java_util_concurrent_atomic_AtomicInteger_a.getAndIncrement() >= this.r) {
            this.var_java_util_concurrent_atomic_AtomicInteger_a.set(b);
            this.var_java_sql_Connection_a.commit();
        }
        return this.var_java_sql_Connection_a;
    }

    static {
        var_int_a = Integer.reverse(0);
        b = 16 >>> 100 | 16 << ~100 + 1;
    }

    @Override
    public void a(Connection connection) {
        if (this.var_java_util_concurrent_atomic_AtomicInteger_a.get() > 0) {
            connection.commit();
        }
    }

    public NLoginCore_221(NLoginCore_459 NLoginCore_459, int n) {
        this.c = NLoginCore_459;
        this.r = n;
        this.var_java_sql_Connection_a = NLoginCore_459.java_sql_Connection_a();
        this.var_java_sql_Connection_a.setAutoCommit(var_int_a != 0);
    }

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return this.c.com_nickuc_login_NLoginCore_036_a();
    }

    @Override
    public void void_c() {
        if (this.var_java_util_concurrent_atomic_AtomicInteger_a.get() > 0) {
            this.var_java_sql_Connection_a.commit();
        }
        this.var_java_sql_Connection_a.close();
    }
}

