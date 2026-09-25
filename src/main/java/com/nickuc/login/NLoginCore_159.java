/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.plugin.PluginDescription
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_230;
import com.nickuc.login.PluginInfoModel;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginCore_348;
import com.nickuc.login.NLoginInterface_040;
import com.nickuc.login.NLoginCore_081;
import java.io.File;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginDescription;

public class NLoginCore_159
implements NLoginInterface_040 {
    private static int var_int_b;
    private final NLoginCore_383 var_com_nickuc_login_NLoginCore_383_d;
    private static int a;
    private static int var_int_d;
    private static int c;
    private final ProxyServer var_net_md_5_bungee_api_ProxyServer_e;
    private static int var_int_e;
    private final NLoginCore_061 var_com_nickuc_login_NLoginInterface_006_b;

    @Override
    public NLoginCore_277 a(Object object) {
        return NLoginCore_230.a(this.var_com_nickuc_login_NLoginCore_383_d, this.var_net_md_5_bungee_api_ProxyServer_e, object);
    }

    @Override
    public <T> T c() {
        return (T)this.var_net_md_5_bungee_api_ProxyServer_e;
    }

    @Override
    @Generated
    public NLoginCore_061 com_nickuc_login_NLoginInterface_006_a() {
        return this.var_com_nickuc_login_NLoginInterface_006_b;
    }

    @Override
    public Collection<NLoginCore_277> c() {
        return this.var_net_md_5_bungee_api_ProxyServer_e.getPlayers().stream().map(this::a).collect(Collectors.toList());
    }

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        c = (0 >>> 103 | 0 << -103) & 0xFFFFFFFF;
        var_int_d = 2048 >>> 235 | 2048 << -235;
        var_int_e = Integer.reverse(0);
    }

    @Override
    public NLoginCore_277 a(UUID uUID) {
        ProxiedPlayer proxiedPlayer = this.var_net_md_5_bungee_api_ProxyServer_e.getPlayer(uUID);
        return proxiedPlayer != null ? this.a(proxiedPlayer) : null;
    }

    @Override
    public NLoginCore_277 com_nickuc_login_NLoginCore_277_a(String string) {
        return NLoginCore_230.a(this.var_com_nickuc_login_NLoginCore_383_d, this.var_net_md_5_bungee_api_ProxyServer_e, string);
    }

    @Override
    public void c() {
        this.var_net_md_5_bungee_api_ProxyServer_e.stop();
    }

    @Override
    public PluginInfoModel[] com_nickuc_login_PluginInfoModel_arr_a() {
        Collection collection = this.var_net_md_5_bungee_api_ProxyServer_e.getPluginManager().getPlugins();
        PluginInfoModel[] PluginInfoModelArray = new PluginInfoModel[collection.size()];
        int n = c;
        for (Plugin plugin : collection) {
            PluginDescription pluginDescription = plugin.getDescription();
            File file = plugin.getFile();
            int n2 = n++;
            String[] stringArray = new String[var_int_d];
            stringArray[NLoginCore_159.var_int_e] = pluginDescription.getAuthor();
            PluginInfoModelArray[n2] = new PluginInfoModel(pluginDescription.getName(), pluginDescription.getVersion(), NLoginCore_135.a(stringArray), file != null ? file.toPath() : null);
        }
        return PluginInfoModelArray;
    }

    @Generated
    public NLoginCore_159(NLoginCore_383 NLoginCore_3832, ProxyServer proxyServer, NLoginCore_061 NLoginInterface_0062) {
        this.var_com_nickuc_login_NLoginCore_383_d = NLoginCore_3832;
        this.var_net_md_5_bungee_api_ProxyServer_e = proxyServer;
        this.var_com_nickuc_login_NLoginInterface_006_b = NLoginInterface_0062;
    }

    @Override
    public boolean j(String string) {
        return (this.var_net_md_5_bungee_api_ProxyServer_e.getPluginManager().getPlugin(string) != null ? a : var_int_b) != 0;
    }

    @Override
    @Nullable
    public NLoginCore_081 com_nickuc_login_NLoginCore_081_a(String string) {
        Plugin plugin = this.var_net_md_5_bungee_api_ProxyServer_e.getPluginManager().getPlugin(string);
        if (plugin == null) {
            return null;
        }
        PluginDescription pluginDescription = plugin.getDescription();
        if (pluginDescription == null) {
            return null;
        }
        return new NLoginCore_081(pluginDescription.getName(), pluginDescription.getVersion(), plugin);
    }

    @Override
    public NLoginInterface_021 a(NLoginCore_168<?> NLoginCore_1682) {
        return new NLoginCore_348(this.var_net_md_5_bungee_api_ProxyServer_e, NLoginCore_1682);
    }
}

