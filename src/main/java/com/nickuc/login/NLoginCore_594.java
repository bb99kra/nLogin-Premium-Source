/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_567;
import lombok.Generated;

public class NLoginCore_594
implements NLoginInterface_003 {
    private final NLoginType_008 x;

    @Generated
    public NLoginCore_594(NLoginType_008 NLoginType_008) {
        this.x = NLoginType_008;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        Object object = packetReceiveEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.x.java_lang_Object_b().a(object);
        NLoginCore_509 NLoginCore_5092 = this.x.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 != null) {
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_h, (Object)System.currentTimeMillis());
        }
    }
}

