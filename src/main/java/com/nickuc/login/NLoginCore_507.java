/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerLoginEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_577;
import com.nickuc.login.NLoginCore_089;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_507
implements NLoginInterface_027 {
    private final NLoginCore_089 b;
    private final Server d;

    @Generated
    public NLoginCore_507(NLoginCore_089 NLoginCore_0892, Server server) {
        this.b = NLoginCore_0892;
        this.d = server;
    }

    @EventHandler(priority=EventPriority.LOWEST)
    public void c(PlayerLoginEvent playerLoginEvent) {
        Player player = playerLoginEvent.getPlayer();
        NLoginCore_577.var_java_lang_String_arr_b.put(player, NLoginCore_577.b(this.b, this.d, player));
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void c(PlayerQuitEvent playerQuitEvent) {
        NLoginCore_577.var_java_lang_String_arr_b.remove(playerQuitEvent.getPlayer());
    }
}

