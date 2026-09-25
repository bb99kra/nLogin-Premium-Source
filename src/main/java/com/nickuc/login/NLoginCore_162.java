/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_188;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_184;
import lombok.Generated;

public class NLoginCore_162
implements NLoginCore_395 {
    private static int h;
    private static int f;
    private static int b;
    private static int i;
    private static int m;
    private static int j;
    private static int e;
    private static int a;
    private static int k;
    private static int c;
    private static int l;
    private static int d;
    private static int g;
    private final NLoginCore_211 an;

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.an;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_188.J[NLoginCore_4452.ordinal()]) {
            case 1: {
                NLoginCore_073.a(NLoginType_008, NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress(), NLoginCore_184.var_com_nickuc_login_NLoginCore_184_c);
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
                NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.s, NLoginCore_277, new Object[k]));
                break;
            }
            case 2: {
                NLoginCore_073.a(NLoginType_008, NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress(), NLoginCore_184.var_com_nickuc_login_NLoginCore_184_d);
                NLoginCore_395.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Override
    public boolean boolean_at() {
        return m != 0;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return l != 0;
    }

    static {
        a = 0 >>> 90 | 0 << ~90 + 1;
        b = (0 >>> 220 | 0 << ~220 + 1) & 0xFFFFFFFF;
        c = (0 >>> 192 | 0 << -192) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(0);
        g = (0 >>> 62 | 0 << -62) & 0xFFFFFFFF;
        h = Integer.reverse(0x40000000);
        i = (0 >>> 126 | 0 << -126) & 0xFFFFFFFF;
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (0 >>> 0 | 0 << -0) & 0xFFFFFFFF;
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Integer.reverse(Integer.MIN_VALUE);
    }

    @Generated
    public NLoginCore_162(NLoginCore_211 NLoginCore_211) {
        this.an = NLoginCore_211;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ag, new Object[g]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[h];
        NLoginCore_445Array[NLoginCore_162.i] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_d;
        NLoginCore_445Array[NLoginCore_162.j] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_e;
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
        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            return c != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!ForceRegisterConfig2.boolean_h() || ForceRegisterConfig2.t()) {
            return d != 0;
        }
        return (NLoginCore_073.com_nickuc_login_NLoginCore_184_a(NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress()) == NLoginCore_184.var_com_nickuc_login_NLoginCore_184_b ? e : f) != 0;
    }
}

