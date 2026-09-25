/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.event.PostOrder
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.connection.DisconnectEvent
 *  com.velocitypowered.api.event.connection.LoginEvent
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.ProxyServer
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_420;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Generated;

public class NLoginCore_008
implements NLoginInterface_029 {
    private final NLoginCore_455 c;
    private final ProxyServer d;

    @Subscribe(order=PostOrder.LAST)
    public void a(DisconnectEvent disconnectEvent) {
        NLoginCore_420.var_long_j.remove(disconnectEvent.getPlayer());
    }

    @Subscribe(order=PostOrder.FIRST)
    public void a(LoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        NLoginCore_420.var_long_j.put(player, NLoginCore_420.b(this.c, this.d, player));
    }

    @Generated
    public NLoginCore_008(NLoginCore_455 NLoginCore_4552, ProxyServer proxyServer) {
        this.c = NLoginCore_4552;
        this.d = proxyServer;
    }
}

