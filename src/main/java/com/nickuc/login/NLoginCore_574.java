/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginDescriptionFile
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.PluginInfoModel;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_577;
import com.nickuc.login.NLoginCore_442;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginInterface_040;
import com.nickuc.login.NLoginCore_081;
import java.nio.file.Path;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class NLoginCore_574
implements NLoginInterface_040 {
    private static int var_int_a;
    private static int b;
    private static int var_int_d;
    private final NLoginCore_089 var_com_nickuc_login_NLoginCore_089_d;
    private final Server f;
    private static int c;
    private final NLoginCore_061 var_com_nickuc_login_NLoginInterface_006_a;

    @Override
    public NLoginCore_277 a(Object object) {
        return NLoginCore_577.a(this.var_com_nickuc_login_NLoginCore_089_d, this.f, object);
    }

    @Override
    public NLoginCore_277 a(UUID uUID) {
        Player player = this.f.getPlayer(uUID);
        return player != null ? this.a(player) : null;
    }

    @Override
    public Collection<NLoginCore_277> c() {
        return NLoginCore_012.d().stream().map(this::a).collect(Collectors.toList());
    }

    @Generated
    public NLoginCore_574(NLoginCore_089 NLoginCore_0892, Server server, NLoginCore_061 NLoginInterface_0062) {
        this.var_com_nickuc_login_NLoginCore_089_d = NLoginCore_0892;
        this.f = server;
        this.var_com_nickuc_login_NLoginInterface_006_a = NLoginInterface_0062;
    }

    @Override
    public void c() {
        this.f.shutdown();
    }

    @Override
    public boolean j(String string) {
        return (this.f.getPluginManager().getPlugin(string) != null ? var_int_a : b) != 0;
    }

    @Override
    public NLoginCore_277 com_nickuc_login_NLoginCore_277_a(String string) {
        return NLoginCore_577.a(this.var_com_nickuc_login_NLoginCore_089_d, this.f, string);
    }

    @Override
    @Generated
    public NLoginCore_061 com_nickuc_login_NLoginInterface_006_a() {
        return this.var_com_nickuc_login_NLoginInterface_006_a;
    }

    @Override
    public <T> T c() {
        return (T)this.f;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        b = Integer.reverse(0);
        c = 0 >>> 196 | 0 << ~196 + 1;
        var_int_d = Integer.reverse(0);
    }

    @Override
    @Nullable
    public NLoginCore_081 com_nickuc_login_NLoginCore_081_a(String string) {
        Plugin plugin = this.f.getPluginManager().getPlugin(string);
        if (plugin == null) {
            return null;
        }
        PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
        return new NLoginCore_081(plugin.getName(), pluginDescriptionFile != null ? pluginDescriptionFile.getVersion() : null, plugin);
    }

    @Override
    public PluginInfoModel[] com_nickuc_login_PluginInfoModel_arr_a() {
        Plugin[] pluginArray = this.f.getPluginManager().getPlugins();
        PluginInfoModel[] PluginInfoModelArray = new PluginInfoModel[pluginArray.length];
        int n = c;
        Plugin[] pluginArray2 = pluginArray;
        int n2 = pluginArray2.length;
        for (int i = var_int_d; i < n2; ++i) {
            Path path;
            Plugin plugin = pluginArray2[i];
            PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
            try {
                path = NLoginCore_366.a(plugin.getClass()).toPath();
            }
            catch (Exception exception) {
                path = null;
            }
            PluginInfoModelArray[n++] = new PluginInfoModel(plugin.getName(), pluginDescriptionFile.getVersion(), pluginDescriptionFile.getAuthors(), path);
        }
        return PluginInfoModelArray;
    }

    @Override
    public NLoginInterface_021 a(NLoginCore_168<?> NLoginCore_1682) {
        return new NLoginCore_442(this.f, NLoginCore_1682);
    }
}

