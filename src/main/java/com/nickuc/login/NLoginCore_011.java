/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_277;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class NLoginCore_011
implements NLoginInterface_027 {
    private final nLoginBukkit f;
    private static int a = (0x40000000 >>> 126 | 0x40000000 << ~126 + 1) & 0xFFFFFFFF;

    @EventHandler(priority=EventPriority.HIGH)
    public void a(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        NLoginCore_277 NLoginCore_277 = this.f.java_lang_Object_b().a(asyncPlayerChatEvent.getPlayer());
        if (this.f.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_056_b().boolean_a(NLoginCore_277, asyncPlayerChatEvent.getMessage())) {
            asyncPlayerChatEvent.setCancelled(a != 0);
        }
    }

    @Generated
    public NLoginCore_011(nLoginBukkit nLoginBukkit2) {
        this.f = nLoginBukkit2;
    }
}

