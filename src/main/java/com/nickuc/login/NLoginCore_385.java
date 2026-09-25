/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerJoinEvent
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
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_385
implements NLoginInterface_027 {
    private final NLoginCore_089 c;
    private final Server e;

    @EventHandler(priority=EventPriority.MONITOR)
    public void c(PlayerQuitEvent playerQuitEvent) {
        NLoginCore_577.var_java_lang_String_arr_b.remove(playerQuitEvent.getPlayer());
    }

    @EventHandler(priority=EventPriority.LOWEST)
    public void c(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        NLoginCore_577.var_java_lang_String_arr_b.put(player, NLoginCore_577.b(this.c, this.e, player));
    }

    @Generated
    public NLoginCore_385(NLoginCore_089 NLoginCore_0892, Server server) {
        this.c = NLoginCore_0892;
        this.e = server;
    }
}

