/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.snakeyaml.DumperOptions
 *  com.nickuc.login.lib.snakeyaml.representer.Representer
 */
package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.representer.Representer;
import com.nickuc.login.NLoginCore_103;
import com.nickuc.login.NLoginCore_219;

class NLoginCore_070
extends Representer {
    final /* synthetic */ NLoginCore_219 a;

    NLoginCore_070(NLoginCore_219 NLoginCore_2192, DumperOptions dumperOptions) {
        this.a = NLoginCore_2192;
        super(dumperOptions);
        this.representers.put(NLoginCore_103.class, object -> this.represent(((NLoginCore_103)object).cfr_renamed_4));
    }
}

