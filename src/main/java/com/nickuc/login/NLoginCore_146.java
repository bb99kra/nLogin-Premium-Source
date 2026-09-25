/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_206;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_096;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;

public class NLoginCore_146
implements NLoginInterface_003 {
    private static int a = Integer.reverse(0);
    final /* synthetic */ NLoginCore_206 c;

    public NLoginCore_146(NLoginCore_206 NLoginCore_2062) {
        this.c = NLoginCore_2062;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c) {
            return;
        }
        if (packetReceiveEvent.getServerVersion().isOlderThan(ServerVersion.V_1_21_6)) {
            return;
        }
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        channel.attr((AttributeKey)NLoginCore_096.var_long_c).set((Object)new NLoginCore_096(null, (byte)a, null));
    }
}

