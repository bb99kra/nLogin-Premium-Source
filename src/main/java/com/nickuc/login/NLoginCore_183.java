/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_056;
import com.nickuc.login.NLoginCore_212;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_209;
import com.nickuc.login.NLoginCore_478;
import com.nickuc.login.NLoginCore_134;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_511;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_252;
import com.nickuc.login.NLoginType_012;
import lombok.Generated;

public class NLoginCore_183
implements NLoginCore_212 {
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private static int c;
    private final nLoginBukkit m;
    private static int b;
    private static int d;

    @Override
    public NLoginCore_511 com_nickuc_login_NLoginCore_511_a() {
        return new NLoginCore_511(this.m);
    }

    @Override
    public void c() {
    }

    @Override
    public nLoginAPI com_nickuc_login_api_nLoginAPI_a() {
        return new NLoginType_012(this.m);
    }

    @Override
    public NLoginInterface_030 com_nickuc_login_NLoginInterface_030_a() {
        return new NLoginCore_252(this.m);
    }

    @Generated
    public NLoginCore_183(nLoginBukkit nLoginBukkit2) {
        this.m = nLoginBukkit2;
    }

    @Override
    public NLoginCore_056 com_nickuc_login_NLoginCore_056_a() {
        return new NLoginCore_209((NLoginType_008)this.m.java_lang_Object_b(), this.m, c != 0);
    }

    static {
        b = Integer.reverse(Integer.MIN_VALUE);
        c = (64 >>> 70 | 64 << -70) & 0xFFFFFFFF;
        d = Integer.reverse(0);
    }

    @Override
    public boolean boolean_a() {
        return NLoginCore_134.a(this.m, b != 0);
    }

    @Override
    public void b() {
        NLoginType_008 NLoginType_008 = this.m.com_nickuc_login_NLoginType_008_a();
        this.m.java_lang_Object_b().c().forEach(NLoginCore_277 -> NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.p, NLoginCore_277, new Object[d])));
        NLoginCore_478.a(this.m, a != 0);
        this.m.com_nickuc_login_NLoginType_018_a().n();
    }
}

