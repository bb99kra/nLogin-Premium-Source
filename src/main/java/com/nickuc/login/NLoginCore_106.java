/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerCommandSendEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import java.util.Locale;
import java.util.Set;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class NLoginCore_106
implements NLoginInterface_027 {
    private static int a = -1610612733 >>> 60 | -1610612733 << -60;
    private static int c;
    private final String ad;
    private final Set<String> f;
    private static int b;

    @EventHandler(priority=EventPriority.LOW)
    public void a(PlayerCommandSendEvent playerCommandSendEvent) {
        playerCommandSendEvent.getCommands().removeIf(string -> ((string = string.toLowerCase(Locale.ENGLISH)).startsWith(this.ad + (char)a) || this.f.contains(string) ? b : c) != 0);
    }

    static {
        b = 0x10000000 >>> 28 | 0x10000000 << -28;
        c = Integer.reverse(0);
    }

    @Generated
    NLoginCore_106(String string, Set<String> set) {
        this.ad = string;
        this.f = set;
    }
}

