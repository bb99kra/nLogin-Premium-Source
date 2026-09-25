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
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_374;
import lombok.Generated;

abstract class NLoginCore_325
implements NLoginCore_154 {
    private final NLoginCore_211 aq;
    private static int a = Integer.reverse(Integer.MIN_VALUE);
    private final NLoginCore_248 var_com_nickuc_login_NLoginCore_311_c;
    private static int d;
    private final NLoginCore_374 var_com_nickuc_login_NLoginCore_487_b;
    private static int var_int_c;
    private static int e;
    private static int var_int_b;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, this.var_com_nickuc_login_NLoginCore_487_b, new Object[var_int_c]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[d];
        NLoginCore_445Array[NLoginCore_325.e] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Generated
    NLoginCore_325(NLoginCore_211 NLoginCore_211, NLoginCore_248 NLoginCore_3112, NLoginCore_374 NLoginCore_4872) {
        this.aq = NLoginCore_211;
        this.var_com_nickuc_login_NLoginCore_311_c = NLoginCore_3112;
        this.var_com_nickuc_login_NLoginCore_487_b = NLoginCore_4872;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        String string = this.var_com_nickuc_login_NLoginCore_311_c.aA();
        return (this.var_com_nickuc_login_NLoginCore_311_c.d(NLoginType_008) && this.var_com_nickuc_login_NLoginCore_311_c.aG() && (string == null || NLoginCore_277.i(string)) && this.var_com_nickuc_login_NLoginCore_311_c.java_lang_String_b(NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a()) == null ? a : var_int_b) != 0;
    }

    static {
        var_int_b = Integer.reverse(0);
        var_int_c = 0 >>> 234 | 0 << -234;
        d = Integer.reverse(Integer.MIN_VALUE);
        e = (0 >>> 169 | 0 << -169) & 0xFFFFFFFF;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.aq;
    }
}

