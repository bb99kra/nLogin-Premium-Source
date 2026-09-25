/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_403;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_589;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import net.md_5.bungee.api.plugin.Plugin;

public class NLoginCore_095
implements NLoginCore_589 {
    private final Plugin a;
    private final NLoginCore_578 c = new NLoginCore_578();

    @Override
    public NLoginCore_403 a(Consumer<NLoginCore_598> consumer, long l, TimeUnit timeUnit) {
        return new NLoginCore_403(this.c, consumer).a(this.a, l, timeUnit);
    }

    @Override
    public NLoginCore_578 a() {
        return this.c;
    }

    @Override
    public void Y() {
        this.a.getProxy().getScheduler().cancel(this.a);
    }

    @Override
    public NLoginCore_403 a(Runnable runnable, long l, TimeUnit timeUnit) {
        return new NLoginCore_403(this.c, runnable).a(this.a, l, timeUnit);
    }

    @Override
    public NLoginCore_403 a(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_403(this.c, runnable).a(this.a, l, l2, timeUnit);
    }

    @Override
    public NLoginCore_403 a(Runnable runnable) {
        return new NLoginCore_403(this.c, runnable).a(this.a);
    }

    @Generated
    public NLoginCore_095(Plugin plugin) {
        this.a = plugin;
    }

    @Override
    public NLoginCore_403 a(Consumer<NLoginCore_598> consumer) {
        return new NLoginCore_403(this.c, consumer).a(this.a);
    }

    @Override
    public NLoginCore_403 a(Consumer<NLoginCore_598> consumer, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_403(this.c, consumer).a(this.a, l, l2, timeUnit);
    }
}

