/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_541;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_509;
import javax.annotation.Nullable;

public interface NLoginInterface_024 {
    public void a(int var1, GUIButtonContainer[] var2);

    default public void a(String string) {
        this.a(string, null, null, null, null);
    }

    public static NLoginInterface_024 a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return new NLoginCore_541(NLoginCore_277, NLoginCore_5092, NLoginType_008.com_nickuc_login_NLoginCore_581_b());
    }

    default public void c(String string, String string2, String string3) {
        this.a(string, string2, null, string3, null);
    }

    public void a(String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5);

    default public void a(String string, String string2, String string3) {
        if (!string3.isEmpty() && string3.charAt(0) != '/') {
            string3 = '/' + string3;
        }
        this.a(string, string2, string3, null, null);
    }

    default public void e(String string, String string2) {
        this.a(string, null, string2);
    }

    default public void d(String string, String string2) {
        this.a(string, string2, null, null, null);
    }

    public void c(String var1, String var2);

    default public void g(String string, String string2) {
        this.a(string, null, null, string2, null);
    }

    public NLoginCore_277 a();

    default public void d(String string, String string2, String string3) {
        this.a(string, string2, null, null, string3);
    }

    default public void f(String string, String string2) {
        this.a(string, null, string2, null, null);
    }

    default public void b(String string, String string2, String string3) {
        this.a(string, string2, string3, null, null);
    }
}

