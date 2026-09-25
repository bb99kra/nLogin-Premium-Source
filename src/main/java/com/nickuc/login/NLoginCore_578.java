/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_135;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class NLoginCore_578 {
    private volatile CountDownLatch b;
    private final List<NLoginCore_598> l = new ArrayList<NLoginCore_598>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(NLoginCore_598 NLoginInterface_0482) {
        List<NLoginCore_598> list = this.l;
        synchronized (list) {
            this.l.remove(NLoginInterface_0482);
            if (this.b != null) {
                this.b.countDown();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(NLoginCore_598 NLoginInterface_0482) {
        List<NLoginCore_598> list = this.l;
        synchronized (list) {
            this.l.add(NLoginInterface_0482);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<NLoginCore_598> e() {
        List<NLoginCore_598> list = this.l;
        synchronized (list) {
            return NLoginCore_135.a(this.l);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l, TimeUnit timeUnit) {
        List<NLoginCore_598> list = this.l;
        synchronized (list) {
            if (this.b == null) {
                this.b = new CountDownLatch(this.l.size());
            }
        }
        boolean bl = this.b.await(l, timeUnit);
        this.b = null;
        return bl;
    }
}

