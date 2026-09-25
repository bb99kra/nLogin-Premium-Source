/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginInterface_023;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_223;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public interface NLoginCore_277
extends NLoginCore_494 {
    public NLoginInterface_023 com_nickuc_login_NLoginInterface_023_a();

    public boolean R();

    default public String ac() {
        return this.java_net_InetSocketAddress_b().getAddress().getHostAddress();
    }

    public void n(String var1);

    public void a(String var1, String var2, int var3, int var4, int var5);

    @Nullable
    public InetSocketAddress java_net_InetSocketAddress_a();

    public NLoginCore_589 com_nickuc_login_NLoginInterface_022_a();

    public boolean S();

    @Override
    default public void k(String string) {
        this.d(string);
    }

    default public InetSocketAddress java_net_InetSocketAddress_b() {
        InetSocketAddress inetSocketAddress = this.java_net_InetSocketAddress_a();
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException(NLoginCore_223.A("ĖĺĻŊľōŎüŒŌŀŖłŋŏŅŇŒŌĈŏřŝČ", (byte)43, 65) + this);
        }
        return inetSocketAddress;
    }

    public void p(String var1);

    public UUID java_util_UUID_a();

    public void d(Object var1);

    @Override
    public <T> T c();

    public Optional<String> a();

    public int h();

    public void l(String var1);

    public void o(String var1);

    public CompletableFuture<Void> a(String var1);

    public String u();

    public void a(NLoginCore_116<?> var1, NLoginCore_337 var2, Object var3, byte[] var4);

    public void ad();
}

