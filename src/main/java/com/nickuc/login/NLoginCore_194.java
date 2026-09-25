/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_161;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import lombok.Generated;

public class NLoginCore_194
implements NLoginCore_249,
NLoginCore_415 {
    private static int h;
    private static int a;
    private static int d;
    private final NLoginCore_211 ag;
    private static int f;
    private static int i;
    private static int e;
    private static int c;
    private static int b;
    private static int g;

    static {
        a = (36 >>> 226 | 36 << ~226 + 1) & 0xFFFFFFFF;
        b = (4 >>> 34 | 4 << ~34 + 1) & 0xFFFFFFFF;
        c = 0 >>> 179 | 0 << -179;
        d = (0 >>> 151 | 0 << -151) & 0xFFFFFFFF;
        e = 0x10000000 >>> 123 | 0x10000000 << -123;
        f = 0 >>> 31 | 0 << -31;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (8 >>> 99 | 8 << ~99 + 1) & 0xFFFFFFFF;
        i = (0 >>> 151 | 0 << -151) & 0xFFFFFFFF;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() ? b : c) != 0;
    }

    @Generated
    public NLoginCore_194(NLoginCore_211 NLoginCore_211) {
        this.ag = NLoginCore_211;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ag;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_s, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_194.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_194.g] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_161.G[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).l((NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b ? h : i) != 0);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }
}

