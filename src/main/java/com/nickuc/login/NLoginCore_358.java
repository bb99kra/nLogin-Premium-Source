/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.ConsoleCommandSender
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_015;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class NLoginCore_358
implements NLoginCore_061 {
    private final ConsoleCommandSender var_org_bukkit_command_ConsoleCommandSender_a;
    private static int var_int_b;
    private static int var_int_a;
    private final Server var_org_bukkit_Server_b;
    private static int d;
    private static int c;

    @Override
    public void l(String string) {
        if (string.length() >= var_int_a && string.charAt(var_int_b) == c) {
            string = string.substring(d);
        }
        if (this.var_org_bukkit_Server_b.isPrimaryThread()) {
            this.var_org_bukkit_Server_b.dispatchCommand((CommandSender)this.var_org_bukkit_command_ConsoleCommandSender_a, string);
        } else {
            String string2 = string;
            NLoginCore_012.a(() -> this.var_org_bukkit_Server_b.dispatchCommand((CommandSender)this.var_org_bukkit_command_ConsoleCommandSender_a, string2));
        }
    }

    @Override
    public boolean i(String string) {
        return this.var_org_bukkit_command_ConsoleCommandSender_a.hasPermission(string);
    }

    @Override
    public void k(String string) {
        this.var_org_bukkit_command_ConsoleCommandSender_a.sendMessage(string);
    }

    public static NLoginCore_061 a(Server server, ConsoleCommandSender consoleCommandSender) {
        return consoleCommandSender != null ? new NLoginCore_358(server, consoleCommandSender) : NLoginCore_015.var_com_nickuc_login_NLoginCore_015_a;
    }

    @Override
    public <T> T c() {
        return (T)this.var_org_bukkit_command_ConsoleCommandSender_a;
    }

    static {
        var_int_a = 256 >>> 39 | 256 << -39;
        var_int_b = (0 >>> 179 | 0 << ~179 + 1) & 0xFFFFFFFF;
        c = (12032 >>> 40 | 12032 << -40) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
    }

    @Override
    public String getName() {
        return this.var_org_bukkit_command_ConsoleCommandSender_a.getName();
    }

    @Generated
    private NLoginCore_358(Server server, ConsoleCommandSender consoleCommandSender) {
        this.var_org_bukkit_Server_b = server;
        this.var_org_bukkit_command_ConsoleCommandSender_a = consoleCommandSender;
    }
}

