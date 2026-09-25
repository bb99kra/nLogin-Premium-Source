/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_089;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public interface NLoginInterface_027
extends NLoginInterface_013,
Listener {
    @Override
    default public void void_a(Object object) {
        NLoginCore_089 NLoginCore_0892 = (NLoginCore_089)object;
        BukkitLoader bukkitLoader = NLoginCore_0892.com_nickuc_login_loader_platform_BukkitLoader_a();
        bukkitLoader.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)bukkitLoader);
    }
}

