/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.event.player.AsyncChatEvent
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.TextComponent
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_277;
import io.papermc.paper.event.player.AsyncChatEvent;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class NLoginCore_373
implements NLoginInterface_027 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private final nLoginBukkit e;

    @Generated
    public NLoginCore_373(nLoginBukkit nLoginBukkit2) {
        this.e = nLoginBukkit2;
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void a(AsyncChatEvent asyncChatEvent) {
        String string;
        NLoginCore_277 NLoginCore_277 = this.e.java_lang_Object_b().a(asyncChatEvent.getPlayer());
        Component component = asyncChatEvent.message();
        String string2 = string = component instanceof TextComponent ? ((TextComponent)component).content() : null;
        if (this.e.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_056_b().boolean_a(NLoginCore_277, string)) {
            asyncChatEvent.setCancelled(a != 0);
        }
    }
}

