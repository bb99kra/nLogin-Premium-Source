/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.bcrypt.BCrypt
 *  com.nickuc.login.lib.bcrypt.BCrypt$Version
 */
package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.NLoginCore_128;

public class NLoginCore_030
extends NLoginCore_128 {
    public NLoginCore_030() {
        super(BCrypt.with((BCrypt.Version)BCrypt.Version.VERSION_BC));
    }
}

