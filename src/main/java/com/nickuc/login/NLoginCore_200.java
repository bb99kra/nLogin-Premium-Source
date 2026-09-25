/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import java.net.URL;
import java.net.URLClassLoader;

public class NLoginCore_200
extends URLClassLoader {
    public NLoginCore_200(URL[] uRLArray) {
        super(uRLArray, ClassLoader.getSystemClassLoader().getParent());
    }

    static {
        ClassLoader.registerAsParallelCapable();
    }
}

