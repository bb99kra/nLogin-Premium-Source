/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.java.JavaPlugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_079;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class NLoginCore_530
implements NLoginCore_589 {
    private final NLoginCore_578 var_com_nickuc_login_NLoginCore_578_b = new NLoginCore_578();
    private final BukkitLoader c;
    private static int a = 0 >>> 63 | 0 << ~63 + 1;
    @Nullable
    private final Player var_org_bukkit_entity_Player_b;
    private final boolean N;

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l, TimeUnit timeUnit) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, consumer).a((JavaPlugin)this.c, l, timeUnit);
    }

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, consumer).a((JavaPlugin)this.c, l, l2, timeUnit);
    }

    @Generated
    private NLoginCore_530(BukkitLoader bukkitLoader, @Nullable Player player, boolean bl) {
        this.c = bukkitLoader;
        this.var_org_bukkit_entity_Player_b = player;
        this.N = bl;
    }

    public NLoginCore_530(BukkitLoader bukkitLoader, boolean bl) {
        this(bukkitLoader, null, bl);
    }

    @Override
    public void Y() {
        NLoginCore_079.void_a((JavaPlugin)this.c);
    }

    public NLoginCore_530(BukkitLoader bukkitLoader, @Nullable Player player) {
        this(bukkitLoader, player, a != 0);
    }

    @Override
    public NLoginCore_578 a() {
        return this.var_com_nickuc_login_NLoginCore_578_b;
    }

    @Override
    public NLoginCore_598 a(Runnable runnable) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, runnable).com_nickuc_login_NLoginCore_079_a((JavaPlugin)this.c);
    }

    @Override
    public NLoginCore_598 a(Runnable runnable, long l, TimeUnit timeUnit) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, runnable).a((JavaPlugin)this.c, l, timeUnit);
    }

    @Override
    public NLoginCore_598 a(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, runnable).a((JavaPlugin)this.c, l, l2, timeUnit);
    }

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer) {
        return new NLoginCore_079(this.var_org_bukkit_entity_Player_b, this.N, this.var_com_nickuc_login_NLoginCore_578_b, consumer).com_nickuc_login_NLoginCore_079_a((JavaPlugin)this.c);
    }
}

