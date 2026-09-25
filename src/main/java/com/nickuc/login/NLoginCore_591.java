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
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_013;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import lombok.Generated;

public class NLoginCore_591
implements NLoginCore_249,
NLoginCore_415 {
    private static int b;
    private final NLoginCore_211 S;
    private static int d;
    private static int c;
    private static int a;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_h, new Object[a]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[b];
        NLoginCore_445Array[NLoginCore_591.c] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_k;
        NLoginCore_445Array[NLoginCore_591.d] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_l;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.S;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().q();
    }

    static {
        a = Integer.reverse(0);
        b = (0x200000 >>> 148 | 0x200000 << ~148 + 1) & 0xFFFFFFFF;
        c = Integer.reverse(0);
        d = (1024 >>> 74 | 1024 << -74) & 0xFFFFFFFF;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_013.y[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).a(NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_k ? NLoginCore_566.var_com_nickuc_login_NLoginCore_566_d : NLoginCore_566.var_com_nickuc_login_NLoginCore_566_f);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Generated
    public NLoginCore_591(NLoginCore_211 NLoginCore_211) {
        this.S = NLoginCore_211;
    }
}

