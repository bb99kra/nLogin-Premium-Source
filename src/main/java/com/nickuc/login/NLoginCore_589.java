/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_578;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public interface NLoginCore_589 {
    public NLoginCore_598 a(Consumer<NLoginCore_598> var1, long var2, TimeUnit var4);

    public NLoginCore_598 a(Runnable var1, long var2, TimeUnit var4);

    default public Collection<NLoginCore_598> f() {
        return this.a().e();
    }

    public NLoginCore_598 a(Runnable var1, long var2, long var4, TimeUnit var6);

    public NLoginCore_598 a(Runnable var1);

    public NLoginCore_598 a(Consumer<NLoginCore_598> var1, long var2, long var4, TimeUnit var6);

    public NLoginCore_598 a(Consumer<NLoginCore_598> var1);

    default public NLoginCore_598 a(Runnable runnable, long l, long l2) {
        return this.a(runnable, l, l2, TimeUnit.MILLISECONDS);
    }

    public NLoginCore_578 a();

    default public NLoginCore_598 a(Runnable runnable, long l) {
        return this.a(runnable, l, TimeUnit.MILLISECONDS);
    }

    public void Y();

    default public boolean a(int n, TimeUnit timeUnit) {
        return this.a().a(n, timeUnit);
    }

    default public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l, long l2) {
        return this.a(consumer, l, l2, TimeUnit.MILLISECONDS);
    }

    default public NLoginCore_598 a(Consumer<NLoginCore_598> consumer, long l) {
        return this.a(consumer, l, TimeUnit.MILLISECONDS);
    }
}

