/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.NLoginInterface_003;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.net.InetAddress;

public class NLoginCore_006
implements NLoginInterface_003 {
    private static int a = Integer.reverse(0);

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        WrapperLoginClientLoginStart wrapperLoginClientLoginStart = new WrapperLoginClientLoginStart(packetReceiveEvent);
        String string = wrapperLoginClientLoginStart.getUsername();
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        InetAddress inetAddress = packetReceiveEvent.getSocketAddress().getAddress();
        BukkitHelper_001 BukkitHelper_001 = new BukkitHelper_001(packetReceiveEvent.getUser(), null, string, null, a != 0, null, channel, null);
        channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).set((Object)BukkitHelper_001);
        BukkitHelper_001.a(string, string, inetAddress, BukkitHelper_001);
    }
}

