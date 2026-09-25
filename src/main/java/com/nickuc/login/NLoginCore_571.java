/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.protocol.DefinedPacket
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_230;
import com.nickuc.login.NLoginInterface_023;
import net.md_5.bungee.protocol.DefinedPacket;

class NLoginCore_571
implements NLoginInterface_023 {
    final /* synthetic */ NLoginCore_230 var_com_nickuc_login_NLoginCore_230_a;
    private static int var_int_a;

    static {
        var_int_a = 0 >>> 47 | 0 << ~47 + 1;
    }

    @Override
    public void sendPacket(Object object, Object ... objectArray) {
        if (NLoginCore_230.a(this.var_com_nickuc_login_NLoginCore_230_a).isConnected()) {
            NLoginCore_230.a(this.var_com_nickuc_login_NLoginCore_230_a).unsafe().sendPacket((DefinedPacket)object);
            Object[] objectArray2 = objectArray;
            int n = objectArray2.length;
            for (int i = var_int_a; i < n; ++i) {
                Object object2 = objectArray2[i];
                NLoginCore_230.a(this.var_com_nickuc_login_NLoginCore_230_a).unsafe().sendPacket((DefinedPacket)object2);
            }
        }
    }

    NLoginCore_571(NLoginCore_230 NLoginCore_230) {
        this.var_com_nickuc_login_NLoginCore_230_a = NLoginCore_230;
    }
}

