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
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_347;
import lombok.Generated;

public class NLoginCore_321
implements NLoginCore_249,
NLoginCore_415 {
    private static int c;
    private static int a;
    private static int f;
    private static int b;
    private static int g;
    private final NLoginCore_211 af;
    private static int d;
    private static int e;

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.af;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() ? b : c) != 0;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_347.F[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).a(NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b ? NLoginCore_555.var_com_nickuc_login_NLoginCore_555_e : NLoginCore_555.var_com_nickuc_login_NLoginCore_555_d);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_o, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_321.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_321.g] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    static {
        a = 576 >>> 6 | 576 << ~6 + 1;
        b = Integer.reverse(Integer.MIN_VALUE);
        c = (0 >>> 186 | 0 << ~186 + 1) & 0xFFFFFFFF;
        d = 0 >>> 128 | 0 << -128;
        e = Integer.reverse(0x40000000);
        f = Integer.reverse(0);
        g = 0x800000 >>> 23 | 0x800000 << -23;
    }

    @Generated
    public NLoginCore_321(NLoginCore_211 NLoginCore_211) {
        this.af = NLoginCore_211;
    }
}

