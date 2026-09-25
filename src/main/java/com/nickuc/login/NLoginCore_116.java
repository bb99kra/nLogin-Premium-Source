/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_583;
import com.nickuc.login.NLoginInterface_020;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_422;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_572;
import com.nickuc.login.NLoginCore_224;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginInterface_040;
import java.io.File;

public interface NLoginCore_116<Plugin> {
    default public NLoginCore_224 com_nickuc_login_NLoginCore_224_a() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_224_a();
    }

    default public void a(NLoginInterface_013 NLoginInterface_0132, NLoginInterface_013 ... NLoginInterface_013Array) {
        this.com_nickuc_login_NLoginCore_572_a().a(NLoginInterface_0132, NLoginInterface_013Array);
    }

    public Object a(int var1);

    public void void_c();

    default public NLoginCore_422 com_nickuc_login_NLoginCore_422_a() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_422_a();
    }

    default public void a(NLoginCore_168<?> NLoginCore_1682, NLoginCore_168<?> ... NLoginCore_168Array) {
        this.com_nickuc_login_NLoginCore_572_a().a(NLoginCore_1682, NLoginCore_168Array);
    }

    public String s();

    default public <T extends NLoginCore_100> T b() {
        return this.com_nickuc_login_NLoginCore_572_a().a();
    }

    default public File e() {
        return this.com_nickuc_login_NLoginCore_572_a().e();
    }

    public NLoginInterface_047 com_nickuc_login_NLoginInterface_047_b();

    public File java_io_File_c();

    default public NLoginCore_227 com_nickuc_login_NLoginCore_227_a() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_227_a();
    }

    public NLoginCore_493 com_nickuc_login_NLoginInterface_026_a();

    public boolean N();

    public NLoginCore_572 com_nickuc_login_NLoginCore_572_a();

    default public NLoginCore_583 com_nickuc_login_NLoginCore_583_a() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_583_a();
    }

    public Plugin b();

    default public NLoginCore_364 com_nickuc_login_NLoginCore_364_b() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_364_b();
    }

    public NLoginCore_589 b(boolean var1);

    default public NLoginCore_219 com_nickuc_login_NLoginCore_219_a() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginCore_219_a();
    }

    public NLoginInterface_020 com_nickuc_login_NLoginInterface_020_a();

    public String q();

    default public NLoginInterface_040 com_nickuc_login_NLoginInterface_040_b() {
        return this.com_nickuc_login_NLoginCore_572_a().com_nickuc_login_NLoginInterface_040_b();
    }
}

