/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.AccountType
 *  com.nickuc.login.api.types.AccountDataImpl
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.ForceRegisterConfig;

public class NLoginType_024 {
    public static AccountDataImpl from(ForceRegisterConfig ForceRegisterConfig2) {
        return new AccountDataImpl(ForceRegisterConfig2.java_lang_Long_a(), AccountType.convert((Enum)ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a()), ForceRegisterConfig2.i(), ForceRegisterConfig2.java_util_UUID_a(), ForceRegisterConfig2.getMojangId(), ForceRegisterConfig2.getBedrockId(), ForceRegisterConfig2.j(), ForceRegisterConfig2.k(), ForceRegisterConfig2.long_b(), ForceRegisterConfig2.c(), ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l(), ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m(), ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().a());
    }
}

