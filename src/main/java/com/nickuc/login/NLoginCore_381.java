/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_336;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginInterface_024;
import lombok.Generated;

public class NLoginCore_381
implements NLoginCore_395,
NLoginCore_336 {
    private static int b;
    private static int d;
    private final NLoginCore_211 ak;
    private static int c;
    private static int a;

    @Generated
    public NLoginCore_381(NLoginCore_211 NLoginCore_211) {
        this.ak = NLoginCore_211;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_277.ad();
        return new GUIButtonContainer[a];
    }

    static {
        a = (0 >>> 183 | 0 << ~183 + 1) & 0xFFFFFFFF;
        b = (0 >>> 164 | 0 << -164) & 0xFFFFFFFF;
        c = (0 >>> 51 | 0 << -51) & 0xFFFFFFFF;
        d = Integer.reverse(0);
    }

    @Override
    public boolean boolean_at() {
        return c != 0;
    }

    @Override
    public boolean au() {
        return d != 0;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return b != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ak;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_572_a().an();
    }
}

