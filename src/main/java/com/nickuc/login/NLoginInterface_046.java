/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BungeeLoader
 *  net.md_5.bungee.api.plugin.Listener
 *  net.md_5.bungee.api.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.BungeeLoader;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_383;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

public interface NLoginInterface_046
extends NLoginInterface_013,
Listener {
    @Override
    default public void void_a(Object object) {
        NLoginCore_383 NLoginCore_3832 = (NLoginCore_383)object;
        BungeeLoader bungeeLoader = NLoginCore_3832.com_nickuc_login_loader_platform_BungeeLoader_a();
        bungeeLoader.getProxy().getPluginManager().registerListener((Plugin)bungeeLoader, (Listener)this);
    }
}

