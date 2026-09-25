/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.logging.log4j.Logger
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_020;
import lombok.Generated;
import org.apache.logging.log4j.Logger;

public class NLoginCore_040
implements NLoginInterface_020 {
    private final Logger a;

    @Override
    public void r(String string) {
        this.a.warn(string);
    }

    @Override
    public <T> T c() {
        return (T)this.a;
    }

    @Override
    public void s(String string) {
        this.a.error(string);
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.a.warn(string, throwable);
    }

    @Generated
    public NLoginCore_040(Logger logger) {
        this.a = logger;
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.a.error(string, throwable);
    }

    @Override
    public void q(String string) {
        this.a.info(string);
    }
}

