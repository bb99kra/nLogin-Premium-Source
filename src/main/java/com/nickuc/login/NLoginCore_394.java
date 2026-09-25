/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.waterfallmc.waterfall.event.ProxyDefineCommandsEvent
 *  lombok.Generated
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_046;
import io.github.waterfallmc.waterfall.event.ProxyDefineCommandsEvent;
import java.util.Locale;
import java.util.Set;
import lombok.Generated;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_394
implements NLoginInterface_046 {
    private static int b;
    private static int c;
    private final Set<String> l;
    private static int a;
    private final String aq;

    static {
        a = Integer.reverse(0x5C000000);
        b = Integer.reverse(Integer.MIN_VALUE);
        c = Integer.reverse(0);
    }

    @Generated
    NLoginCore_394(String string, Set<String> set) {
        this.aq = string;
        this.l = set;
    }

    @EventHandler(priority=-32)
    public void a(ProxyDefineCommandsEvent proxyDefineCommandsEvent) {
        if (!(proxyDefineCommandsEvent.getReceiver() instanceof ProxiedPlayer)) {
            return;
        }
        proxyDefineCommandsEvent.getCommands().values().removeIf(command -> {
            String string = command.getName().toLowerCase(Locale.ENGLISH);
            return (string.startsWith(this.aq + (char)a) || this.l.contains(string) ? b : c) != 0;
        });
    }
}

