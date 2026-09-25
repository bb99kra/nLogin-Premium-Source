/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.PlayerDisconnectEvent
 *  net.md_5.bungee.api.event.PostLoginEvent
 *  net.md_5.bungee.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_230;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginInterface_046;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_003
implements NLoginInterface_046 {
    private final NLoginCore_383 c;
    private final ProxyServer d;

    @Generated
    public NLoginCore_003(NLoginCore_383 NLoginCore_3832, ProxyServer proxyServer) {
        this.c = NLoginCore_3832;
        this.d = proxyServer;
    }

    @EventHandler(priority=-128)
    public void a(PostLoginEvent postLoginEvent) {
        ProxiedPlayer proxiedPlayer = postLoginEvent.getPlayer();
        NLoginCore_230.var_long_c.put(proxiedPlayer, NLoginCore_230.b(this.c, this.d, proxiedPlayer));
    }

    @EventHandler(priority=127)
    public void a(PlayerDisconnectEvent playerDisconnectEvent) {
        NLoginCore_230.var_long_c.remove(playerDisconnectEvent.getPlayer());
    }
}

