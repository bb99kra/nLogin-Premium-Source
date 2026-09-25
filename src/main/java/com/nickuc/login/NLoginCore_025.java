/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.entity.EntityAirChangeEvent
 *  org.bukkit.event.entity.EntityEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_209;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityEvent;

public class NLoginCore_025
implements NLoginInterface_027 {
    private final NLoginCore_209 d;
    private static int a = (256 >>> 40 | 256 << ~40 + 1) & 0xFFFFFFFF;

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityAirChangeEvent entityAirChangeEvent) {
        if (this.d.a((EntityEvent)entityAirChangeEvent)) {
            entityAirChangeEvent.setCancelled(a != 0);
        }
    }

    @Generated
    public NLoginCore_025(NLoginCore_209 NLoginCore_2092) {
        this.d = NLoginCore_2092;
    }
}

