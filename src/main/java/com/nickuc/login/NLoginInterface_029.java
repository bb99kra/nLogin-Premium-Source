/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.VelocityLoader
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_455;

public interface NLoginInterface_029
extends NLoginInterface_013 {
    @Override
    default public void void_a(Object object) {
        NLoginCore_455 NLoginCore_4552 = (NLoginCore_455)object;
        VelocityLoader velocityLoader = NLoginCore_4552.com_nickuc_login_loader_platform_VelocityLoader_a();
        velocityLoader.getServer().getEventManager().register((Object)velocityLoader, (Object)this);
    }
}

