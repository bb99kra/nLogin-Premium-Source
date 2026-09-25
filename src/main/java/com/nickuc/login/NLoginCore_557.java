/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_304;

class NLoginCore_557
extends NLoginCore_304 {
    private final JSONObject b;
    private final int ax;

    public NLoginCore_557(NLoginCore_277 NLoginCore_277, JSONObject jSONObject) {
        super(NLoginCore_277);
        this.b = jSONObject;
        this.ax = jSONObject.toString().length();
    }

    static /* synthetic */ JSONObject com_nickuc_login_lib_json_JSONObject_a(NLoginCore_557 NLoginCore_557) {
        return NLoginCore_557.b;
    }

    static /* synthetic */ int int_a(NLoginCore_557 NLoginCore_557) {
        return NLoginCore_557.ax;
    }
}

