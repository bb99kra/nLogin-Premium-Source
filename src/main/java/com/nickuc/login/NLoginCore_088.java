/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import java.util.List;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginCore_088
implements NLoginCore_154 {
    private final NLoginCore_211 ao;
    private static int a = Integer.reverse(0);

    @Generated
    public NLoginCore_088(NLoginCore_211 NLoginCore_211) {
        this.ao = NLoginCore_211;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ao;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_l);
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        List list = (List)NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_l);
        if (list != null) {
            list.forEach(component -> NLoginType_008.com_nickuc_login_NLoginCore_581_b().a(NLoginCore_277, (Component)component));
        }
        NLoginCore_154.super.b(NLoginType_008, NLoginCore_277, NLoginCore_5092);
        return new GUIButtonContainer[a];
    }
}

