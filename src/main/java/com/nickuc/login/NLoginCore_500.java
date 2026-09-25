/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.plugin.PluginContainer
 *  com.velocitypowered.api.plugin.PluginDescription
 *  com.velocitypowered.api.proxy.ProxyServer
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_191;
import com.nickuc.login.PluginInfoModel;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_420;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginInterface_040;
import com.nickuc.login.NLoginCore_081;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.plugin.PluginDescription;
import com.velocitypowered.api.proxy.ProxyServer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_500
implements NLoginInterface_040 {
    private static String[] var_java_lang_String_arr_a;
    private final ProxyServer var_com_velocitypowered_api_proxy_ProxyServer_e;
    private static String[] var_java_lang_String_arr_b;
    private final NLoginCore_061 var_com_nickuc_login_NLoginInterface_006_c;
    private static int var_int_b;
    private final NLoginCore_455 var_com_nickuc_login_NLoginCore_455_d;
    private static int var_int_a;
    private static int f;
    private static int var_int_c;
    private static long var_long_d;
    private static long var_long_c;
    private static int var_int_e;

    @Override
    public NLoginCore_277 a(Object object) {
        return NLoginCore_420.a(this.var_com_nickuc_login_NLoginCore_455_d, this.var_com_velocitypowered_api_proxy_ProxyServer_e, object);
    }

    @Override
    public NLoginInterface_021 a(NLoginCore_168<?> NLoginCore_1682) {
        return new NLoginCore_191(this.var_com_velocitypowered_api_proxy_ProxyServer_e, NLoginCore_1682);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_500.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 65), NLoginCore_500.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬߞߴ߷ߡߵߴࠆ߸ࠊ߽ࠃࠐࠐࠉ҆", (byte)40, 67) + string + NLoginCore_138.E("Ԟ", (byte)40, 69) + methodType.toString(), exception);
        }
    }

    @Override
    @Generated
    public NLoginCore_061 com_nickuc_login_NLoginInterface_006_a() {
        return this.var_com_nickuc_login_NLoginInterface_006_c;
    }

    @Override
    public NLoginCore_277 com_nickuc_login_NLoginCore_277_a(String string) {
        return NLoginCore_420.a(this.var_com_nickuc_login_NLoginCore_455_d, this.var_com_velocitypowered_api_proxy_ProxyServer_e, string);
    }

    @Override
    public PluginInfoModel[] com_nickuc_login_PluginInfoModel_arr_a() {
        Collection collection = this.var_com_velocitypowered_api_proxy_ProxyServer_e.getPluginManager().getPlugins();
        PluginInfoModel[] PluginInfoModelArray = new PluginInfoModel[collection.size()];
        int n = var_int_a;
        for (PluginContainer pluginContainer : collection) {
            PluginDescription pluginDescription = pluginContainer.getDescription();
            PluginInfoModelArray[n++] = new PluginInfoModel(pluginDescription.getId(), (String)pluginDescription.getVersion().orElse(NLoginCore_500.c("㺀", (int)(var_int_b & var_int_c), (long)var_long_d)), pluginDescription.getAuthors(), pluginDescription.getSource().orElse(null));
        }
        return PluginInfoModelArray;
    }

    @Override
    public boolean j(String string) {
        return this.var_com_velocitypowered_api_proxy_ProxyServer_e.getPluginManager().isLoaded(string);
    }

    @Generated
    public NLoginCore_500(NLoginCore_455 NLoginCore_4552, ProxyServer proxyServer, NLoginCore_061 NLoginInterface_0062) {
        this.var_com_nickuc_login_NLoginCore_455_d = NLoginCore_4552;
        this.var_com_velocitypowered_api_proxy_ProxyServer_e = proxyServer;
        this.var_com_nickuc_login_NLoginInterface_006_c = NLoginInterface_0062;
    }

    @Override
    public NLoginCore_277 a(UUID uUID) {
        return this.var_com_velocitypowered_api_proxy_ProxyServer_e.getPlayer(uUID).map(this::a).orElse(null);
    }

    @Override
    @Nullable
    public NLoginCore_081 com_nickuc_login_NLoginCore_081_a(String string) {
        return this.var_com_velocitypowered_api_proxy_ProxyServer_e.getPluginManager().getPlugin(string).map(pluginContainer -> {
            PluginDescription pluginDescription = pluginContainer.getDescription();
            Object object2 = pluginContainer.getInstance().map(object -> object).orElse(pluginContainer);
            return new NLoginCore_081(pluginDescription.getName().orElse(null), pluginDescription.getVersion().orElse(null), object2);
        }).orElse(null);
    }

    private static void b() {
        int n;
        var_long_c = -8530516275773425827L;
        long l = var_long_c ^ 0x78ABEA24B5D60504L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), 69, (byte)(65 + 18), (byte)(32 + 15), (byte)(62 + 5), (byte)(49 + 17), (byte)(64 + 3), (byte)(26 + 21), (byte)(13 + 67), (byte)(24 + 51), (byte)(2 + 65), (byte)(20 + 63), (byte)(18 + 35), (byte)(61 + 19), (byte)(39 + 58), (byte)(52 + 48), (byte)(81 + 19), (byte)(36 + 69), 110, (byte)(58 + 45)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    NLoginCore_500.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ĕýĖĀþûĬĜìñĒ÷", (byte)24, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_500.var_java_lang_String_arr_b[0] = NLoginCore_076.D("шѤѩхѳћвѥљчћюѲђѕ҄ріњҀр҉ѐё", (byte)24, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_500.var_java_lang_String_arr_b[0] = NLoginCore_384.D("жуѰѬѓѮчжѻѭћѽҀйѵњ҃оцђј҉ѐё", (byte)24, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_500.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ĆøÿěĜąįêçĞĊĭċĂĨĠĘôøĲĥĕĂă", (byte)24, 66);
                }
            }
        }
    }

    @Override
    public Collection<NLoginCore_277> c() {
        return this.var_com_velocitypowered_api_proxy_ProxyServer_e.getAllPlayers().stream().map(this::a).collect(Collectors.toList());
    }

    private static String a(int n, long l) {
        l ^= 5L;
        l ^= 0x78ABEA24B5D60504L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(40 + 29), (byte)(56 + 27), (byte)(41 + 6), (byte)(55 + 12), (byte)(8 + 58), (byte)(46 + 21), 47, (byte)(66 + 14), (byte)(2 + 73), (byte)(53 + 14), (byte)(57 + 26), (byte)(19 + 34), (byte)(6 + 74), (byte)(29 + 68), (byte)(99 + 1), 100, (byte)(25 + 80), (byte)(86 + 24), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ŪŷŶĹŹŵŰŹƄųŀžƂŻžƄņҸӎӑһӏӎӠӒӤӗӝӪӪӣ", (byte)68, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_500.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void c() {
        this.var_com_velocitypowered_api_proxy_ProxyServer_e.shutdown();
    }

    static {
        var_int_a = 0 >>> 0 | 0 << -0;
        var_int_b = (0 >>> 102 | 0 << ~102 + 1) & 0xFFFFFFFF;
        var_int_c = (-1 >>> 100 | -1 << -100) & 0xFFFFFFFF;
        var_long_d = Long.reverse(1940044231534033297L);
        var_int_e = 0x40000000 >>> 254 | 0x40000000 << -254;
        f = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[var_int_e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_500.b();
    }

    @Override
    public <T> T c() {
        return (T)this.var_com_velocitypowered_api_proxy_ProxyServer_e;
    }
}

