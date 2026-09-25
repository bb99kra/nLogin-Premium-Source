/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent$Result
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.NLoginInterface_027;
import java.net.InetAddress;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class NLoginCore_554
implements NLoginInterface_027 {
    private final nLoginBukkit k;

    @Generated
    public NLoginCore_554(nLoginBukkit nLoginBukkit2) {
        this.k = nLoginBukkit2;
    }

    @EventHandler(priority=EventPriority.LOWEST)
    public void b(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        InetAddress inetAddress;
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        InetAddress inetAddress2 = asyncPlayerPreLoginEvent.getAddress();
        try {
            inetAddress = asyncPlayerPreLoginEvent.getRawAddress();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            inetAddress = null;
        }
        BukkitHelper_001 BukkitHelper_001 = BukkitHelper_001.a(asyncPlayerPreLoginEvent.getName(), inetAddress2, inetAddress);
        if (BukkitHelper_001 != null && BukkitHelper_001.var_java_lang_Runnable_a != null) {
            BukkitHelper_001.var_java_lang_Runnable_a.run();
        }
    }
}

