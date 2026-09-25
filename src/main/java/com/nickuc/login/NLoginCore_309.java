/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.NLoginCore_349;
import com.nickuc.login.NLoginInterface_043;

public class NLoginCore_309
implements NLoginInterface_043 {
    final /* synthetic */ NLoginCore_349 c;

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        if (NLoginCore_349.a(this.c)) {
            return;
        }
        PacketWrapper packetWrapper = new PacketWrapper(packetSendEvent);
        int n = packetWrapper.readContainerId();
        NLoginCore_349.a(this.c, packetSendEvent, n);
    }

    public NLoginCore_309(NLoginCore_349 NLoginCore_349) {
        this.c = NLoginCore_349;
    }
}

