/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.LoginType
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_088;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import java.util.concurrent.TimeUnit;

public interface NLoginCore_154 {
    default public void b(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
        if (NLoginCore_5012 == null) {
            throw new IllegalStateException(NLoginCore_384.B("ĩŋőŇŅŉńŃŗōŔŔćśŎŝŞŕŜŜďŞŠŦēŠŤŗśŝŝĚšūůĞ", (byte)46, 66) + NLoginCore_277.getName() + NLoginCore_201.E("ԋ", (byte)46, 69));
        }
        NLoginCore_154 NLoginInterface_0122 = NLoginCore_5012.b(NLoginCore_277, NLoginCore_5092);
        if (NLoginInterface_0122 == null) {
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            if (!(this instanceof NLoginCore_088 || this instanceof NLoginCore_395 && ((NLoginCore_395)this).c(NLoginType_008))) {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ae, new Object[0]);
            }
        }
        if (this instanceof NLoginCore_395 && !(NLoginInterface_0122 instanceof NLoginCore_395)) {
            NLoginCore_395 NLoginInterface_039 = (NLoginCore_395)this;
            if (NLoginInterface_039.boolean_at()) {
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z);
                NLoginCore_5092.a(NLoginCore_567.A);
                NLoginCore_277.o("");
            }
            if (NLoginInterface_039.c(NLoginType_008)) {
                NLoginCore_5092.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_c);
                NLoginType_008.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().b(NLoginCore_277, NLoginCore_5092);
            } else {
                NLoginCore_277.ad();
                if (NLoginInterface_0122 != null) {
                    NLoginCore_5092.a(NLoginCore_567.H, NLoginInterface_0122);
                }
                NLoginType_008.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_001_a().a(NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a(), NLoginCore_277, NLoginCore_5092, (LoginType)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_s), (String)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_u));
                return;
            }
        }
        if (NLoginInterface_0122 != null) {
            NLoginInterface_0122.c(NLoginType_008, NLoginCore_277, NLoginCore_5092);
        }
    }

    default public void c(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        this.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, false);
    }

    default public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
        this.void_a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242);
        int n = this.a(bl);
        if (n > 0) {
            NLoginType_008.b(true).a(() -> {
                if (!NLoginCore_277.R()) {
                    return;
                }
                if (!this.boolean_a(NLoginCore_5092)) {
                    return;
                }
                NLoginInterface_0242.a(this.com_nickuc_login_NLoginCore_211_a().v(), this.com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242));
            }, (long)n, TimeUnit.MILLISECONDS);
        } else {
            NLoginInterface_0242.a(this.com_nickuc_login_NLoginCore_211_a().v(), this.com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242));
        }
    }

    public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3);

    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a();

    default public boolean boolean_a(NLoginCore_509 NLoginCore_5092) {
        NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
        return NLoginCore_5012 != null && NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b().com_nickuc_login_NLoginCore_211_a() == this.com_nickuc_login_NLoginCore_211_a();
    }

    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4);

    default public void void_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
    }

    default public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        this.b(NLoginType_008, NLoginCore_277, NLoginCore_5092);
    }

    default public int a(boolean bl) {
        return bl ? 1500 : 0;
    }
}

