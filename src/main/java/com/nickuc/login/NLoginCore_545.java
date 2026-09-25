/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerEvent
 *  org.bukkit.event.player.PlayerSwapHandItemsEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_209;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class NLoginCore_545
implements NLoginInterface_027 {
    private final NLoginCore_209 f;
    private static int a = (1 >>> 160 | 1 << ~160 + 1) & 0xFFFFFFFF;

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(PlayerSwapHandItemsEvent playerSwapHandItemsEvent) {
        if (this.f.a((PlayerEvent)playerSwapHandItemsEvent)) {
            playerSwapHandItemsEvent.setCancelled(a != 0);
        }
    }

    @Generated
    public NLoginCore_545(NLoginCore_209 NLoginCore_2092) {
        this.f = NLoginCore_2092;
    }
}

