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
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_184;
import lombok.Generated;

public class NLoginCore_391
implements NLoginCore_395 {
    private static int c;
    private static int j;
    private final NLoginCore_211 am;
    private static int g;
    private static int f;
    private static int b;
    private static int d;
    private static int i;
    private static int k;
    private static int h;
    private static int e;
    private static int l;
    private static int a;

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        if (NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a && NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f)) {
            NLoginCore_073.a(NLoginType_008, NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress(), NLoginCore_184.var_com_nickuc_login_NLoginCore_184_e);
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.s, NLoginCore_277, new Object[j]));
        }
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.am;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return k != 0;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ah, new Object[g]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[h];
        NLoginCore_445Array[NLoginCore_391.i] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
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
        return (NLoginCore_073.com_nickuc_login_NLoginCore_184_a(NLoginCore_5092.d(), NLoginCore_277.java_net_InetSocketAddress_b().getAddress()) == NLoginCore_184.var_com_nickuc_login_NLoginCore_184_d ? e : f) != 0;
    }

    @Override
    public boolean boolean_at() {
        return l != 0;
    }

    static {
        a = Integer.reverse(0);
        b = Integer.reverse(0);
        c = (0 >>> 82 | 0 << ~82 + 1) & 0xFFFFFFFF;
        d = (0 >>> 38 | 0 << ~38 + 1) & 0xFFFFFFFF;
        e = 16 >>> 164 | 16 << -164;
        f = 0 >>> 139 | 0 << -139;
        g = 0 >>> 142 | 0 << -142;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0);
        j = Integer.reverse(0);
        k = 0 >>> 221 | 0 << -221;
        l = (0 >>> 61 | 0 << -61) & 0xFFFFFFFF;
    }

    @Generated
    public NLoginCore_391(NLoginCore_211 NLoginCore_211) {
        this.am = NLoginCore_211;
    }
}

