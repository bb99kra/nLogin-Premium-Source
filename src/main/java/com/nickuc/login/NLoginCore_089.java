/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.LoaderBootstrap
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  org.bukkit.Server
 *  org.bukkit.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_170;
import com.nickuc.login.NLoginInterface_020;
import com.nickuc.login.NLoginCore_120;
import com.nickuc.login.NLoginCore_292;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_422;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_281;
import com.nickuc.login.NLoginCore_572;
import com.nickuc.login.NLoginCore_363;
import java.io.File;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

public abstract class NLoginCore_089
implements LoaderBootstrap,
NLoginCore_292,
NLoginCore_116<BukkitLoader> {
    private final NLoginCore_281 var_com_nickuc_login_NLoginCore_281_a;
    private static int var_int_a;
    private final BukkitLoader var_com_nickuc_login_loader_platform_BukkitLoader_a;
    private final NLoginInterface_020 var_com_nickuc_login_NLoginInterface_020_a;
    final NLoginCore_572 var_com_nickuc_login_NLoginCore_572_a;

    @Override
    public /* synthetic */ NLoginInterface_047 com_nickuc_login_NLoginInterface_047_b() {
        return this.com_nickuc_login_NLoginCore_120_a();
    }

    static {
        var_int_a = 65536 >>> 48 | 65536 << ~48 + 1;
    }

    @Override
    public boolean N() {
        return this.var_com_nickuc_login_loader_platform_BukkitLoader_a.isEnabled();
    }

    public void disable() {
        this.var_com_nickuc_login_NLoginCore_572_a.aw();
    }

    @Override
    public String s() {
        return this.var_com_nickuc_login_NLoginCore_572_a.var_java_lang_String_bo;
    }

    @Override
    public File java_io_File_c() {
        return this.var_com_nickuc_login_loader_platform_BukkitLoader_a.getDataFolder();
    }

    protected void j() {
        if (this.var_com_nickuc_login_NLoginCore_572_a.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_a.a()).j();
        }
    }

    @Override
    public /* synthetic */ Object java_lang_Object_b() {
        return this.com_nickuc_login_loader_platform_BukkitLoader_a();
    }

    public Server org_bukkit_Server_a() {
        return this.var_com_nickuc_login_loader_platform_BukkitLoader_a.getServer();
    }

    @Override
    public String q() {
        return this.var_com_nickuc_login_NLoginCore_572_a.var_java_lang_String_bn;
    }

    @Override
    public void void_c() {
        if (this.N()) {
            this.var_com_nickuc_login_loader_platform_BukkitLoader_a.getServer().getPluginManager().disablePlugin((Plugin)this.var_com_nickuc_login_loader_platform_BukkitLoader_a);
        }
    }

    @Override
    public NLoginCore_589 b(boolean bl) {
        return this.var_com_nickuc_login_NLoginCore_572_a.b(bl);
    }

    protected void T() {
        if (this.var_com_nickuc_login_NLoginCore_572_a.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_a.a()).T();
        }
    }

    protected abstract NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a();

    public void load() {
        this.var_com_nickuc_login_NLoginCore_572_a.au();
    }

    public NLoginCore_120 com_nickuc_login_NLoginCore_120_a() {
        return (NLoginCore_120)this.var_com_nickuc_login_NLoginCore_572_a.c();
    }

    @Override
    public NLoginCore_493 com_nickuc_login_NLoginInterface_026_a() {
        return this.var_com_nickuc_login_NLoginCore_281_a;
    }

    public void enable() {
        this.var_com_nickuc_login_NLoginCore_572_a.av();
    }

    public BukkitLoader com_nickuc_login_loader_platform_BukkitLoader_a() {
        return this.var_com_nickuc_login_loader_platform_BukkitLoader_a;
    }

    @Override
    public NLoginInterface_020 com_nickuc_login_NLoginInterface_020_a() {
        return this.var_com_nickuc_login_NLoginInterface_020_a;
    }

    @Override
    public Object a(int n) {
        if (n == var_int_a) {
            return this.org_bukkit_Server_a().getPort();
        }
        return null;
    }

    protected void O() {
        if (this.var_com_nickuc_login_NLoginCore_572_a.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_a.a()).O();
        }
    }

    public NLoginCore_089(BukkitLoader bukkitLoader, String string, NLoginCore_422 NLoginCore_4222) {
        this.var_com_nickuc_login_loader_platform_BukkitLoader_a = bukkitLoader;
        this.var_com_nickuc_login_NLoginCore_281_a = new NLoginCore_281(this);
        this.var_com_nickuc_login_NLoginCore_572_a = new NLoginCore_572(string, bukkitLoader.getVersion(), NLoginCore_4222, this);
        this.var_com_nickuc_login_NLoginInterface_020_a = new NLoginCore_170(bukkitLoader.getLogger());
    }

    public String toString() {
        return this.var_com_nickuc_login_NLoginCore_572_a.toString();
    }

    protected void void_i() {
        if (this.var_com_nickuc_login_NLoginCore_572_a.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_a.a()).void_i();
        }
    }

    @Override
    public NLoginCore_572 com_nickuc_login_NLoginCore_572_a() {
        return this.var_com_nickuc_login_NLoginCore_572_a;
    }
}

