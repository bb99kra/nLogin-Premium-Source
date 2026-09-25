/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.plugin.TabExecutor
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginInterface_021;
import java.util.Collections;
import java.util.List;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.TabExecutor;

public final class NLoginCore_348
extends Command
implements NLoginInterface_021,
TabExecutor {
    private final NLoginCore_168<?> c;
    private static int var_int_a;
    private final ProxyServer var_net_md_5_bungee_api_ProxyServer_a;

    public NLoginCore_348(ProxyServer proxyServer, NLoginCore_168<?> NLoginCore_1682) {
        super(NLoginCore_1682.aa(), null, NLoginCore_1682.c().toArray(new String[var_int_a]));
        this.var_net_md_5_bungee_api_ProxyServer_a = proxyServer;
        this.c = NLoginCore_1682;
    }

    @Override
    public void W() {
        this.var_net_md_5_bungee_api_ProxyServer_a.getPluginManager().registerCommand((Plugin)this.c.a().b(), (Command)this);
    }

    public void execute(CommandSender commandSender, String[] stringArray) {
        this.c.a(commandSender, commandSender.getName(), commandSender instanceof ProxiedPlayer, this.getName(), stringArray);
    }

    @Override
    public void X() {
        this.var_net_md_5_bungee_api_ProxyServer_a.getPluginManager().unregisterCommand((Command)this);
    }

    static {
        var_int_a = (0 >>> 183 | 0 << -183) & 0xFFFFFFFF;
    }

    public Iterable<String> onTabComplete(CommandSender commandSender, String[] stringArray) {
        List<String> list = this.c.a(commandSender, commandSender.getName(), commandSender instanceof ProxiedPlayer, this.getName(), stringArray);
        return list != null ? list : Collections.emptyList();
    }
}

