/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.chat.TextComponent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_061;
import lombok.Generated;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;

public class NLoginCore_513
implements NLoginCore_061 {
    private final ProxyServer var_net_md_5_bungee_api_ProxyServer_b;
    private static int d;
    private static int c;
    private final CommandSender var_net_md_5_bungee_api_CommandSender_a;
    private static int var_int_a;
    private static int var_int_b;

    @Override
    public void l(String string) {
        if (string.length() >= var_int_a && string.charAt(var_int_b) == c) {
            string = string.substring(d);
        }
        this.var_net_md_5_bungee_api_ProxyServer_b.getPluginManager().dispatchCommand(this.var_net_md_5_bungee_api_CommandSender_a, string);
    }

    public static NLoginCore_513 a(ProxyServer proxyServer, CommandSender commandSender) {
        return new NLoginCore_513(proxyServer, commandSender);
    }

    @Override
    public String getName() {
        return this.var_net_md_5_bungee_api_CommandSender_a.getName();
    }

    @Generated
    private NLoginCore_513(ProxyServer proxyServer, CommandSender commandSender) {
        this.var_net_md_5_bungee_api_ProxyServer_b = proxyServer;
        this.var_net_md_5_bungee_api_CommandSender_a = commandSender;
    }

    static {
        var_int_a = 4096 >>> 235 | 4096 << ~235 + 1;
        var_int_b = Integer.reverse(0);
        c = (-1140850688 >>> 218 | -1140850688 << -218) & 0xFFFFFFFF;
        d = 1024 >>> 202 | 1024 << ~202 + 1;
    }

    @Override
    public boolean i(String string) {
        return this.var_net_md_5_bungee_api_CommandSender_a.hasPermission(string);
    }

    @Override
    public <T> T c() {
        return (T)this.var_net_md_5_bungee_api_CommandSender_a;
    }

    @Override
    public void k(String string) {
        this.var_net_md_5_bungee_api_CommandSender_a.sendMessage(TextComponent.fromLegacyText((String)string));
    }
}

