/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_020;
import lombok.Generated;
import org.slf4j.Logger;

public class NLoginCore_152
implements NLoginInterface_020 {
    private final Logger b;

    @Override
    public void a(String string, Throwable throwable) {
        this.b.warn(string, throwable);
    }

    @Override
    public void r(String string) {
        this.b.warn(string);
    }

    @Override
    public void s(String string) {
        this.b.error(string);
    }

    @Override
    public <T> T c() {
        return (T)this.b;
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.b.error(string, throwable);
    }

    @Generated
    public NLoginCore_152(Logger logger) {
        this.b = logger;
    }

    @Override
    public void q(String string) {
        this.b.info(string);
    }
}

