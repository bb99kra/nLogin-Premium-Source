/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  lombok.Generated
 *  org.bukkit.plugin.java.JavaPlugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_094;
import com.nickuc.login.NLoginCore_589;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import org.bukkit.plugin.java.JavaPlugin;

public class NLoginCore_440
implements NLoginCore_589 {
    private final NLoginCore_578 a = new NLoginCore_578();
    private final boolean K;
    private final BukkitLoader b;

    @Override
    public void Y() {
        NLoginCore_094.void_a((JavaPlugin)this.b);
    }

    @Override
    public NLoginCore_598 a(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_094(this.K, this.a, runnable).a((JavaPlugin)this.b, l, l2, timeUnit);
    }

    @Generated
    public NLoginCore_440(BukkitLoader bukkitLoader, boolean bl) {
        this.b = bukkitLoader;
        this.K = bl;
    }

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_094(this.K, this.a, consumer).a((JavaPlugin)this.b, l, l2, timeUnit);
    }

    @Override
    public NLoginCore_578 a() {
        return this.a;
    }

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer) {
        return new NLoginCore_094(this.K, this.a, consumer).com_nickuc_login_NLoginCore_094_a((JavaPlugin)this.b);
    }

    @Override
    public NLoginCore_598 a(Runnable runnable) {
        return new NLoginCore_094(this.K, this.a, runnable).com_nickuc_login_NLoginCore_094_a((JavaPlugin)this.b);
    }

    @Override
    public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l, TimeUnit timeUnit) {
        return new NLoginCore_094(this.K, this.a, consumer).a((JavaPlugin)this.b, l, timeUnit);
    }

    @Override
    public NLoginCore_598 a(Runnable runnable, long l, TimeUnit timeUnit) {
        return new NLoginCore_094(this.K, this.a, runnable).a((JavaPlugin)this.b, l, timeUnit);
    }
}

