/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_020;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Generated;

public class NLoginCore_170
implements NLoginInterface_020 {
    private final Logger a;

    @Override
    public void b(String string, Throwable throwable) {
        this.a.log(Level.SEVERE, string, throwable);
    }

    @Override
    public void q(String string) {
        this.a.info(string);
    }

    @Generated
    public NLoginCore_170(Logger logger) {
        this.a = logger;
    }

    @Override
    public <T> T c() {
        return (T)this.a;
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.a.log(Level.WARNING, string, throwable);
    }

    @Override
    public void s(String string) {
        this.a.severe(string);
    }

    @Override
    public void r(String string) {
        this.a.warning(string);
    }
}

