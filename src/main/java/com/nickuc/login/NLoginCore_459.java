/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_365;
import com.nickuc.login.NLoginCore_288;
import com.nickuc.login.NLoginCore_036;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.annotation.CheckReturnValue;

public interface NLoginCore_459 {
    @CheckReturnValue
    default public NLoginCore_171 com_nickuc_login_NLoginCore_171_a(String string, Object ... objectArray) {
        Connection connection = this.java_sql_Connection_a();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(string);
            this.a(preparedStatement, objectArray);
            ResultSet resultSet = preparedStatement.executeQuery();
            return new NLoginCore_171(this, connection, preparedStatement, resultSet, null);
        }
        catch (SQLException sQLException) {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            this.a(connection);
            throw sQLException;
        }
    }

    default public NLoginCore_218<Integer> b(String string, Object ... objectArray) {
        Connection connection = this.java_sql_Connection_a();
        try {
            NLoginCore_218<Integer> NLoginCore_2182;
            block9: {
                PreparedStatement preparedStatement = connection.prepareStatement(string);
                try {
                    this.a(preparedStatement, objectArray);
                    NLoginCore_2182 = new NLoginCore_218<Integer>(preparedStatement.executeUpdate(), null);
                    if (preparedStatement == null) break block9;
                }
                catch (Throwable throwable) {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                preparedStatement.close();
            }
            return NLoginCore_2182;
        }
        finally {
            this.a(connection);
        }
    }

    @CheckReturnValue
    default public NLoginCore_365 com_nickuc_login_NLoginCore_365_a() {
        return new NLoginCore_365(this, this.java_sql_Connection_a(), null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    default public void void_a(String string, Object ... objectArray) {
        Connection connection = this.java_sql_Connection_a();
        try (PreparedStatement preparedStatement = connection.prepareStatement(string);){
            this.a(preparedStatement, objectArray);
            preparedStatement.execute();
        }
        finally {
            this.a(connection);
        }
    }

    public Connection java_sql_Connection_a();

    default public void a(PreparedStatement preparedStatement, Object[] objectArray) {
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object instanceof String) {
                preparedStatement.setString(i + 1, (String)object);
                continue;
            }
            if (object instanceof Long) {
                preparedStatement.setLong(i + 1, (Long)object);
                continue;
            }
            if (object instanceof Integer) {
                preparedStatement.setInt(i + 1, (Integer)object);
                continue;
            }
            if (object instanceof Timestamp) {
                preparedStatement.setTimestamp(i + 1, (Timestamp)object);
                continue;
            }
            if (object instanceof byte[]) {
                preparedStatement.setBytes(i + 1, (byte[])object);
                continue;
            }
            preparedStatement.setObject(i + 1, object);
        }
    }

    public void void_c();

    @CheckReturnValue
    default public NLoginCore_288 com_nickuc_login_NLoginCore_288_a(String string, Object ... objectArray) {
        Connection connection = this.java_sql_Connection_a();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(string);
            this.a(preparedStatement, objectArray);
            return new NLoginCore_288(this, connection, preparedStatement, null);
        }
        catch (SQLException sQLException) {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            this.a(connection);
            throw sQLException;
        }
    }

    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a();

    default public NLoginCore_218<Boolean> a(String string, Object ... objectArray) {
        Connection connection = this.java_sql_Connection_a();
        try {
            NLoginCore_218<Boolean> NLoginCore_2182;
            block9: {
                PreparedStatement preparedStatement = connection.prepareStatement(string);
                try {
                    this.a(preparedStatement, objectArray);
                    NLoginCore_2182 = new NLoginCore_218<Boolean>(preparedStatement.execute(), null);
                    if (preparedStatement == null) break block9;
                }
                catch (Throwable throwable) {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                preparedStatement.close();
            }
            return NLoginCore_2182;
        }
        finally {
            this.a(connection);
        }
    }

    public void a(Connection var1);
}

