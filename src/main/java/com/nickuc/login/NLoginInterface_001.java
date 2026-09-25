/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_426;
import org.bukkit.entity.Player;

public interface NLoginInterface_001 {
    public void send(Player var1, String var2);

    public static NLoginInterface_001 a() {
        return NLoginCore_426.a();
    }

    default public void a(Player player) {
        this.send(player, "");
    }
}

