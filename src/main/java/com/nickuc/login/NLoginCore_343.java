/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_175;
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
import com.nickuc.login.NLoginCore_264;
import lombok.Generated;

public class NLoginCore_343
implements NLoginCore_249,
NLoginCore_415 {
    private static int c;
    private static int b;
    private static int d;
    private static int a;
    private final NLoginCore_211 U;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_i, new Object[a]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[b];
        NLoginCore_445Array[NLoginCore_343.c] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_343.d] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    static {
        a = Integer.reverse(0);
        b = 64 >>> 37 | 64 << -37;
        c = 0 >>> 207 | 0 << ~207 + 1;
        d = Integer.reverse(Integer.MIN_VALUE);
    }

    @Generated
    public NLoginCore_343(NLoginCore_211 NLoginCore_211) {
        this.U = NLoginCore_211;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_264.A[NLoginCore_4452.ordinal()]) {
            case 1: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).a(NLoginCore_175.var_com_nickuc_login_NLoginCore_175_b);
            }
            case 2: {
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.U;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().q();
    }
}

