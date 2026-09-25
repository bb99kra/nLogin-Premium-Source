/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.PluginInfoModel;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_051;
import com.nickuc.login.NLoginCore_081;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;

public interface NLoginInterface_040
extends NLoginCore_051 {
    public NLoginCore_277 com_nickuc_login_NLoginCore_277_a(String var1);

    public NLoginCore_277 a(Object var1);

    public void c();

    default public NLoginCore_277 b(String string) {
        NLoginCore_277 NLoginCore_277 = this.com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 == null) {
            int n = Integer.MAX_VALUE;
            String string2 = string.toLowerCase(Locale.ENGLISH);
            for (NLoginCore_277 NLoginCore_2772 : this.c()) {
                String string3 = NLoginCore_2772.getName();
                if (!string3.toLowerCase(Locale.ENGLISH).startsWith(string2)) continue;
                int n2 = Math.abs(string3.length() - string2.length());
                if (n2 < n) {
                    NLoginCore_277 = NLoginCore_2772;
                    n = n2;
                }
                if (n2 != 0) continue;
                break;
            }
        }
        return NLoginCore_277;
    }

    public Collection<NLoginCore_277> c();

    public NLoginInterface_021 a(NLoginCore_168<?> var1);

    public NLoginCore_061 com_nickuc_login_NLoginInterface_006_a();

    @Nullable
    public NLoginCore_081 com_nickuc_login_NLoginCore_081_a(String var1);

    public NLoginCore_277 a(UUID var1);

    public PluginInfoModel[] com_nickuc_login_PluginInfoModel_arr_a();

    public boolean j(String var1);
}

