/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_336;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import lombok.Generated;

public class NLoginCore_421
implements NLoginCore_395,
NLoginCore_336 {
    private static int b;
    private static int a;
    private static int e;
    private static int d;
    private static int h;
    private static int f;
    private static int i;
    private static int c;
    private final NLoginCore_211 aj;
    private static int g;

    @Generated
    public NLoginCore_421(NLoginCore_211 NLoginCore_211) {
        this.aj = NLoginCore_211;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        String string = (String)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_u);
        if (string == null) {
            return a != 0;
        }
        if (!NLoginCore_532.V.ar() || !NLoginCore_532.W.ar()) {
            return b != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!ForceRegisterConfig2.s()) {
            return c != 0;
        }
        return (ForceRegisterConfig2.boolean_x() || !BCryptHashProvider.java_util_regex_Pattern_b().matcher(string).matches() ? d : e) != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.aj;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return h != 0;
    }

    static {
        a = (0 >>> 136 | 0 << ~136 + 1) & 0xFFFFFFFF;
        b = Integer.reverse(0);
        c = (0 >>> 90 | 0 << -90) & 0xFFFFFFFF;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = 0 >>> 141 | 0 << ~141 + 1;
        f = Integer.reverse(0);
        g = (0 >>> 51 | 0 << ~51 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        i = Integer.reverse(0);
    }

    @Override
    public boolean boolean_at() {
        return i != 0;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ai, new Object[f]);
        return new GUIButtonContainer[g];
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
    }
}

