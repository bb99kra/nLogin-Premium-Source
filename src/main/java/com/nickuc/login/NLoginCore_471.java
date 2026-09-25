/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.VelocityLoader
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_261;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;

public class NLoginCore_471
implements NLoginCore_589 {
    private final VelocityLoader b;
    private final NLoginCore_578 d = new NLoginCore_578();

    @Override
    public NLoginCore_261 a(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_261(this.d, runnable).a(this.b, l, l2, timeUnit);
    }

    @Override
    public NLoginCore_261 a(Consumer<NLoginCore_598> consumer, long l, long l2, TimeUnit timeUnit) {
        return new NLoginCore_261(this.d, consumer).a(this.b, l, l2, timeUnit);
    }

    @Override
    public void Y() {
        this.f().forEach(NLoginCore_598::Z);
    }

    @Override
    public NLoginCore_261 a(Consumer<NLoginCore_598> consumer, long l, TimeUnit timeUnit) {
        return new NLoginCore_261(this.d, consumer).a(this.b, l, timeUnit);
    }

    @Generated
    public NLoginCore_471(VelocityLoader velocityLoader) {
        this.b = velocityLoader;
    }

    @Override
    public NLoginCore_261 a(Consumer<NLoginCore_598> consumer) {
        return new NLoginCore_261(this.d, consumer).a(this.b);
    }

    @Override
    public NLoginCore_261 a(Runnable runnable) {
        return new NLoginCore_261(this.d, runnable).a(this.b);
    }

    @Override
    public NLoginCore_578 a() {
        return this.d;
    }

    @Override
    public NLoginCore_261 a(Runnable runnable, long l, TimeUnit timeUnit) {
        return new NLoginCore_261(this.d, runnable).a(this.b, l, timeUnit);
    }
}

