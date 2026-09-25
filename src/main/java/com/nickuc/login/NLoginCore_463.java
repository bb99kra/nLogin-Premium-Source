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
import com.nickuc.login.NLoginCore_327;
import lombok.Generated;

public class NLoginCore_463
implements NLoginCore_249,
NLoginCore_415 {
    private static int a = Integer.reverse(-1879048192);
    private static int e;
    private static int f;
    private static int d;
    private static int c;
    private static int b;
    private final NLoginCore_211 ad;
    private static int g;

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() && this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).com_nickuc_login_NLoginCore_555_a() != NLoginCore_555.var_com_nickuc_login_NLoginCore_555_e ? b : c) != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ad;
    }

    static {
        b = Integer.reverse(Integer.MIN_VALUE);
        c = Integer.reverse(0);
        d = Integer.reverse(0);
        e = 4096 >>> 43 | 4096 << ~43 + 1;
        f = Integer.reverse(0);
        g = 524288 >>> 51 | 524288 << -51;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_p, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_463.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_463.g] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Generated
    public NLoginCore_463(NLoginCore_211 NLoginCore_211) {
        this.ad = NLoginCore_211;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_327.D[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).a(NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b ? NLoginCore_555.var_com_nickuc_login_NLoginCore_555_d : NLoginCore_555.var_com_nickuc_login_NLoginCore_555_f);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }
}

