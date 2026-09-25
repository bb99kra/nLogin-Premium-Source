/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_186;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import lombok.Generated;

public class NLoginCore_520
implements NLoginCore_395 {
    private static int j;
    private static int q;
    private static int g;
    private static int l;
    private static int h;
    private static int p;
    private static int e;
    private static int f;
    private static int i;
    private static int k;
    private static int b;
    private static int a;
    private static int d;
    private final NLoginCore_211 al;
    private static int n;
    private static int c;
    private static int m;
    private static int o;

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.al;
    }

    @Generated
    public NLoginCore_520(NLoginCore_211 NLoginCore_211) {
        this.al = NLoginCore_211;
    }

    @Override
    public boolean boolean_at() {
        return q != 0;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return p != 0;
    }

    static {
        a = (0 >>> 244 | 0 << ~244 + 1) & 0xFFFFFFFF;
        b = Integer.reverse(0);
        c = Integer.reverse(0);
        d = 131072 >>> 241 | 131072 << ~241 + 1;
        e = Integer.reverse(0);
        f = 0 >>> 42 | 0 << -42;
        g = Integer.reverse(0x40000000);
        h = (0 >>> 18 | 0 << ~18 + 1) & 0xFFFFFFFF;
        i = 0x100000 >>> 116 | 0x100000 << -116;
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = 0 >>> 206 | 0 << -206;
        m = Integer.reverse(0);
        n = 0x20000000 >>> 221 | 0x20000000 << -221;
        o = Integer.reverse(0);
        p = 32 >>> 37 | 32 << -37;
        q = Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << -95;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.af, new Object[f]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[g];
        NLoginCore_445Array[NLoginCore_520.h] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_520.i] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_c.ar()) {
            return a != 0;
        }
        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar()) {
            return b != 0;
        }
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            return c != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        return (!ForceRegisterConfig2.boolean_h() || !ForceRegisterConfig2.t() && ForceRegisterConfig2.boolean_y() ? d : e) != 0;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_186.I[NLoginCore_4452.ordinal()]) {
            case 1: {
                ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
                if (ForceRegisterConfig2.t()) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.I, new Object[j]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                NLoginCore_073.a(NLoginType_008, NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress(), NLoginCore_280.var_com_nickuc_login_NLoginCore_280_c);
                if (ForceRegisterConfig2.boolean_y()) {
                    ForceRegisterConfig2.void_y();
                    NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[k];
                    NLoginCore_436Array[NLoginCore_520.l] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                    NLoginType_008.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
                }
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
                NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.s, NLoginCore_277, new Object[m]));
                break;
            }
            case 2: {
                ForceRegisterConfig ForceRegisterConfig3 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
                if (ForceRegisterConfig3.boolean_y()) {
                    ForceRegisterConfig3.void_y();
                    NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[n];
                    NLoginCore_436Array[NLoginCore_520.o] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
                    NLoginType_008.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig3, NLoginCore_436Array);
                }
                NLoginCore_395.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
                break;
            }
        }
    }
}

