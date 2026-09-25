/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.argon2.Argon2Factory
 *  com.nickuc.login.lib.argon2.Argon2Factory$Argon2Types
 */
package com.nickuc.login;

import com.nickuc.login.lib.argon2.Argon2Factory;
import com.nickuc.login.NLoginCore_491;

public class NLoginCore_544
extends NLoginCore_491 {
    public NLoginCore_544() {
        super(Argon2Factory.create((Argon2Factory.Argon2Types)Argon2Factory.Argon2Types.ARGON2id));
    }
}

