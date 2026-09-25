/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_398;
import com.nickuc.login.NLoginCore_583;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.util.List;
import javax.annotation.Nullable;

public interface NLoginCore_363 {
    public boolean boolean_b();

    public String java_lang_String_b();

    default public String c(boolean bl) {
        String string = this.java_lang_String_b() + NLoginCore_451.C("Ќ", (byte)14, 67) + this.getVersion() + NLoginCore_091.B("ÉĆþĐ", (byte)14, 66);
        if (bl) {
            string = string + NLoginCore_427.B("ÉĐĊĎ", (byte)14, 66);
        }
        return string;
    }

    public String getVersion();

    @Nullable
    public String java_lang_String_c();

    public boolean boolean_c();

    default public File a(NLoginCore_583 NLoginCore_583, boolean bl) {
        return new File(NLoginCore_583.var_java_io_File_g, this.c(bl));
    }

    default public String A() {
        return this.java_lang_String_b() + NLoginCore_559.B("şƶ", (byte)96, 66) + this.getVersion();
    }

    public List<NLoginCore_398> a();

    public String java_lang_String_a();
}

