/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockBreakEvent
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.block.SignChangeEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_209;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

public class NLoginCore_399
implements NLoginInterface_027 {
    private final NLoginCore_209 var_com_nickuc_login_NLoginCore_209_a;
    private static int c;
    private static int b;
    private static int var_int_a;

    @Generated
    public NLoginCore_399(NLoginCore_209 NLoginCore_2092) {
        this.var_com_nickuc_login_NLoginCore_209_a = NLoginCore_2092;
    }

    @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
    public void a(BlockPlaceEvent blockPlaceEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_a.b(blockPlaceEvent.getPlayer())) {
            blockPlaceEvent.setCancelled(var_int_a != 0);
        }
    }

    static {
        var_int_a = (128 >>> 39 | 128 << ~39 + 1) & 0xFFFFFFFF;
        b = Integer.reverse(Integer.MIN_VALUE);
        c = (8192 >>> 45 | 8192 << ~45 + 1) & 0xFFFFFFFF;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(SignChangeEvent signChangeEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_a.b(signChangeEvent.getPlayer())) {
            signChangeEvent.setCancelled(c != 0);
        }
    }

    @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
    public void a(BlockBreakEvent blockBreakEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_a.b(blockBreakEvent.getPlayer())) {
            blockBreakEvent.setCancelled(b != 0);
        }
    }
}

