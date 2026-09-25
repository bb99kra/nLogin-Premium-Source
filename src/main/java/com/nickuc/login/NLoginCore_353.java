/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Generated;

public abstract class NLoginCore_353 {
    private final boolean w;
    private final String p;
    protected NLoginCore_055 var_com_nickuc_login_NLoginCore_055_a;
    private final boolean x;
    private static int var_int_a;
    private final List<String> var_java_util_List_java_lang_String__b;
    protected final NLoginCore_466 l = NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b;
    private final String o;
    private static int var_int_b;
    protected NLoginType_008 var_com_nickuc_login_NLoginType_008_a;

    static {
        var_int_a = 16 >>> 4 | 16 << -4;
        var_int_b = Integer.reverse(0);
    }

    protected boolean j() {
        return (this.var_com_nickuc_login_NLoginCore_055_a == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c || this.var_com_nickuc_login_NLoginCore_055_a == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_s ? var_int_a : var_int_b) != 0;
    }

    public void a(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        this.var_com_nickuc_login_NLoginCore_055_a = NLoginInterface_0422 instanceof NLoginCore_277 ? this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginInterface_0422).com_nickuc_login_NLoginCore_055_a() : NLoginCore_150.c();
        this.b(NLoginInterface_0422, stringArray);
    }

    protected List<String> c(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        return null;
    }

    @Generated
    public NLoginType_008 com_nickuc_login_NLoginType_008_b() {
        return this.var_com_nickuc_login_NLoginType_008_a;
    }

    @Generated
    public boolean o() {
        return this.x;
    }

    protected abstract void b(NLoginCore_494 var1, String[] var2);

    @Generated
    public NLoginCore_466 com_nickuc_login_NLoginCore_466_a() {
        return this.l;
    }

    @Generated
    public boolean n() {
        return this.w;
    }

    public NLoginCore_353(NLoginType_008 NLoginType_008, String string, String string2, boolean bl, boolean bl2, String ... stringArray) {
        this.var_com_nickuc_login_NLoginType_008_a = NLoginType_008;
        this.o = string;
        this.p = string2;
        this.w = bl;
        this.x = bl2;
        this.var_java_util_List_java_lang_String__b = stringArray.length == 0 ? Collections.emptyList() : Arrays.asList(stringArray);
    }

    @Generated
    public String f() {
        return this.p;
    }

    @Generated
    public List<String> b() {
        return this.var_java_util_List_java_lang_String__b;
    }

    @Generated
    public String e() {
        return this.o;
    }

    @Generated
    public NLoginCore_055 com_nickuc_login_NLoginCore_055_a() {
        return this.var_com_nickuc_login_NLoginCore_055_a;
    }
}

