/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 *  org.bukkit.event.entity.EntityEvent
 *  org.bukkit.event.player.PlayerEvent
 *  org.bukkit.event.player.PlayerInteractAtEntityEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_209;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class NLoginCore_046
implements NLoginInterface_027 {
    private final NLoginCore_209 e;
    private static int a = (0x40000000 >>> 126 | 0x40000000 << -126) & 0xFFFFFFFF;
    private static int b = Integer.reverse(Integer.MIN_VALUE);

    @EventHandler(priority=EventPriority.LOWEST)
    public void a(PlayerInteractAtEntityEvent playerInteractAtEntityEvent) {
        if (this.e.a((PlayerEvent)playerInteractAtEntityEvent)) {
            playerInteractAtEntityEvent.setCancelled(a != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST)
    public void b(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (this.e.a((EntityEvent)entityDamageByEntityEvent)) {
            entityDamageByEntityEvent.setCancelled(b != 0);
        }
    }

    @Generated
    public NLoginCore_046(NLoginCore_209 NLoginCore_2092) {
        this.e = NLoginCore_2092;
    }
}

