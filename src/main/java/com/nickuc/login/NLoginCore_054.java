/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.wrapper.common.client.WrapperCommonClientSettings
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.common.client.WrapperCommonClientSettings;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_567;
import lombok.Generated;

public class NLoginCore_054
implements NLoginInterface_003 {
    private final nLoginBukkit s;

    @Generated
    public NLoginCore_054(nLoginBukkit nLoginBukkit2) {
        this.s = nLoginBukkit2;
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        Object object = packetReceiveEvent.getPlayer();
        if (object == null) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.s.java_lang_Object_b().a(object);
        NLoginCore_509 NLoginCore_5092 = this.s.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            return;
        }
        WrapperCommonClientSettings wrapperCommonClientSettings = new WrapperCommonClientSettings(packetReceiveEvent);
        NLoginCore_055 NLoginCore_0552 = NLoginCore_055.c(wrapperCommonClientSettings.getLocale());
        if (NLoginCore_0552 != null) {
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i, (Object)NLoginCore_0552);
        }
    }
}

