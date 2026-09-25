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
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import lombok.Generated;

public class NLoginCore_477
implements NLoginCore_249,
NLoginCore_415 {
    private static int c;
    private final NLoginCore_211 ai;
    private static int a;
    private static int e;
    private static int d;
    private static int f;
    private static int b;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_l, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_477.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_f;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ai;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() ? b : c) != 0;
    }

    static {
        a = Integer.reverse(-1879048192);
        b = Integer.reverse(Integer.MIN_VALUE);
        c = (0 >>> 71 | 0 << -71) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = 0 >>> 171 | 0 << ~171 + 1;
    }

    @Generated
    public NLoginCore_477(NLoginCore_211 NLoginCore_211) {
        this.ai = NLoginCore_211;
    }
}

