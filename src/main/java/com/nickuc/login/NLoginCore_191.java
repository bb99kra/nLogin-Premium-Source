/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.command.Command
 *  com.velocitypowered.api.command.CommandInvocation
 *  com.velocitypowered.api.command.CommandManager
 *  com.velocitypowered.api.command.CommandMeta
 *  com.velocitypowered.api.command.CommandSource
 *  com.velocitypowered.api.command.SimpleCommand
 *  com.velocitypowered.api.command.SimpleCommand$Invocation
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.ProxyServer
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandInvocation;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.command.CommandMeta;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_191
implements NLoginInterface_021,
SimpleCommand {
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_d;
    private static int i;
    private static int var_int_a;
    private static int f;
    private static int e;
    private static long var_long_b;
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int j;
    private final NLoginCore_168<?> var_com_nickuc_login_NLoginCore_168____d;
    private final ProxyServer var_com_velocitypowered_api_proxy_ProxyServer_a;
    private static long c;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_191.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("ӿԡԣԃԧՆԾՔՀԏՍՃՑՋԔԹ՛՚Ւ՘Ւԧ", (byte)27, 70), NLoginCore_191.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࡻࢯࢮࢋࢠࢭࢲࢂࢋࢩࢍ࢙ࢭࢹࢸԱ", (byte)27, 69) + string + NLoginCore_201.A("ï", (byte)27, 65) + methodType.toString(), exception);
        }
    }

    public List<String> a(SimpleCommand.Invocation invocation) {
        CommandSource commandSource = invocation.source();
        boolean bl = commandSource instanceof Player;
        String string = bl ? ((Player)commandSource).getUsername() : NLoginCore_191.c("㺀", (int)(e & f), (long)g);
        List<String> list = this.var_long_d.a(commandSource, string, bl, invocation.alias(), (String[])invocation.arguments());
        return list != null ? list : Collections.emptyList();
    }

    @Override
    public void W() {
        CommandManager commandManager = this.var_com_velocitypowered_api_proxy_ProxyServer_a.getCommandManager();
        CommandMeta commandMeta = commandManager.metaBuilder(this.var_long_d.aa()).aliases(this.var_long_d.c().toArray(new String[h])).build();
        commandManager.register(commandMeta, (Command)this);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(3670580775359787239L);
        var_long_d = Long.reverse(0x7000000000000000L);
        e = (262144 >>> 242 | 262144 << -242) & 0xFFFFFFFF;
        f = (-1 >>> 45 | -1 << ~45 + 1) & 0xFFFFFFFF;
        g = Long.reverse(4823502279966634215L);
        h = (0 >>> 204 | 0 << -204) & 0xFFFFFFFF;
        i = 0x100000 >>> 147 | 0x100000 << ~147 + 1;
        j = (262144 >>> 145 | 262144 << -145) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_191.b();
    }

    private static void b() {
        int n;
        c = -1797695734084989108L;
        long l = c ^ 0x48AA329FDFD099A8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(16 + 53), (byte)(44 + 39), 47, (byte)(29 + 38), (byte)(43 + 23), (byte)(33 + 34), (byte)(26 + 21), (byte)(70 + 10), (byte)(60 + 15), (byte)(5 + 62), (byte)(54 + 29), (byte)(33 + 20), (byte)(43 + 37), (byte)(29 + 68), 100, (byte)(84 + 16), (byte)(37 + 68), (byte)(45 + 65), (byte)(99 + 4)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
                    NLoginCore_191.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ðĔþčĶġĔąİİľč", (byte)35, 66);
                    NLoginCore_191.var_java_lang_String_arr_b[1] = NLoginCore_223.E("ԊԮԘԧՐԻԮԟՊՊ՘ԧ", (byte)35, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_191.var_java_lang_String_arr_b[0] = NLoginCore_575.D("҄ѯђҐғ҅ѱѫѵѭҋґҎҖѭѱљҕ҄ќѹҚѱѲ", (byte)35, 68);
                    NLoginCore_191.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ĕĜĎļġăĬĴıħĲŇģĊĔăĮĺŋčīőĘę", (byte)35, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_191.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ҕ҆ѥҗљҋґѧѝҟѝѹҝ҂ќҚѧҘѷҀѨ҄ѱѲ", (byte)35, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_191.var_java_lang_String_arr_b[0] = NLoginCore_446.A("÷īĽøĮĒĢüĺāĜč", (byte)35, 65);
                }
            }
        }
    }

    @Override
    public void X() {
        this.var_com_velocitypowered_api_proxy_ProxyServer_a.getCommandManager().unregister(this.var_long_d.aa());
    }

    @Generated
    public NLoginCore_191(ProxyServer proxyServer, NLoginCore_168<?> NLoginCore_1682) {
        this.var_com_velocitypowered_api_proxy_ProxyServer_a = proxyServer;
        this.var_long_d = (long)NLoginCore_1682;
    }

    private static String a(int n, long l) {
        l ^= 0xEL;
        l ^= 0x48AA329FDFD099A8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(23 + 60), (byte)(13 + 34), (byte)(20 + 47), (byte)(28 + 38), (byte)(3 + 64), (byte)(16 + 31), (byte)(78 + 2), (byte)(71 + 4), (byte)(57 + 10), (byte)(21 + 62), 53, (byte)(53 + 27), (byte)(64 + 33), (byte)(90 + 10), (byte)(8 + 92), (byte)(24 + 81), (byte)(42 + 68), (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ԣ԰ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿࡤ࢘ࢗࡴࢉ࢖࢛࡫ࡴ࢒ࡶࢂ࢖ࢢࢡ", (byte)89, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_191.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void a(SimpleCommand.Invocation invocation) {
        CommandSource commandSource = invocation.source();
        boolean bl = commandSource instanceof Player;
        String string = bl ? ((Player)commandSource).getUsername() : NLoginCore_191.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d));
        this.var_long_d.a(commandSource, string, bl, invocation.alias(), (String[])invocation.arguments());
    }

    public /* synthetic */ List suggest(CommandInvocation commandInvocation) {
        return this.a((SimpleCommand.Invocation)commandInvocation);
    }

    public /* synthetic */ void execute(CommandInvocation commandInvocation) {
        this.a((SimpleCommand.Invocation)commandInvocation);
    }
}

