/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.ForceRegisterConfig;
import javax.annotation.Nullable;
import lombok.Generated;

public class NLoginCore_029 {
    @Nullable
    public final ForceRegisterConfig d;

    public ForceRegisterConfig b(String string) {
        return this.d != null ? this.d : ForceRegisterConfig.a(string);
    }

    @Generated
    public NLoginCore_029(@Nullable ForceRegisterConfig ForceRegisterConfig2) {
        this.d = ForceRegisterConfig2;
    }
}

