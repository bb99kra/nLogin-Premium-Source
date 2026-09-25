/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.NLoginCore_349;
import com.nickuc.login.NLoginInterface_043;

public class NLoginCore_405
implements NLoginInterface_043 {
    final /* synthetic */ NLoginCore_349 b;

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        if (NLoginCore_349.a(this.b)) {
            return;
        }
        PacketWrapper packetWrapper = new PacketWrapper(packetSendEvent);
        int n = packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_2) ? packetWrapper.readContainerId() : (int)packetWrapper.readByte();
        NLoginCore_349.a(this.b, packetSendEvent, n);
    }

    public NLoginCore_405(NLoginCore_349 NLoginCore_349) {
        this.b = NLoginCore_349;
    }
}

