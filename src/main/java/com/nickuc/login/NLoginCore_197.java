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
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;
import lombok.Generated;

public class NLoginCore_197
implements NLoginCore_459 {
    private final NLoginCore_036 i;
    private final Driver var_java_sql_Driver_a;
    private final String av;
    private final Properties var_java_util_Properties_a;

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return this.i;
    }

    @Override
    public void void_c() {
    }

    @Override
    public void a(Connection connection) {
        connection.close();
    }

    @Override
    public Connection java_sql_Connection_a() {
        return this.var_java_sql_Driver_a.connect(this.av, this.var_java_util_Properties_a);
    }

    /* synthetic */ NLoginCore_197(NLoginCore_036 NLoginCore_0362, Driver driver, String string, Properties properties, NLoginCore_235 NLoginCore_2352) {
        this(NLoginCore_0362, driver, string, properties);
    }

    @Generated
    private NLoginCore_197(NLoginCore_036 NLoginCore_0362, Driver driver, String string, Properties properties) {
        this.i = NLoginCore_0362;
        this.var_java_sql_Driver_a = driver;
        this.av = string;
        this.var_java_util_Properties_a = properties;
    }
}

