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
import com.nickuc.login.NLoginCore_050;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import lombok.Generated;

public class NLoginCore_379
implements NLoginCore_249,
NLoginCore_415 {
    private static int e;
    private static int f;
    private final NLoginCore_211 R;
    private static int c;
    private static int a;
    private static int d;
    private static int b;

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() && this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_b ? a : b) != 0;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_j, new Object[c]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[d];
        NLoginCore_445Array[NLoginCore_379.e] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_m;
        NLoginCore_445Array[NLoginCore_379.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_n;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.R;
    }

    static {
        a = (64 >>> 198 | 64 << ~198 + 1) & 0xFFFFFFFF;
        b = 0 >>> 129 | 0 << -129;
        c = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        d = (64 >>> 229 | 64 << -229) & 0xFFFFFFFF;
        e = Integer.reverse(0);
        f = (262144 >>> 50 | 262144 << -50) & 0xFFFFFFFF;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_050.x[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).a(NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_m ? NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c : NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Generated
    public NLoginCore_379(NLoginCore_211 NLoginCore_211) {
        this.R = NLoginCore_211;
    }
}

