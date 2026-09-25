/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.connection.PluginMessageEvent
 *  com.velocitypowered.api.event.connection.PluginMessageEvent$ForwardResult
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.ServerConnection
 *  com.velocitypowered.api.proxy.messages.ChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.ChannelMessageSource
 *  com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.PluginMessageEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.ChannelMessageSource;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginCore_132
implements NLoginInterface_029 {
    private static long j;
    private static int h;
    private static int y;
    private static int v;
    private static int e;
    private static long l;
    private static long c;
    private static long ac;
    private static long g;
    private static int q;
    private static long s;
    private static String[] var_java_lang_String_arr_a;
    private static int f;
    private static int m;
    private static long var_long_d;
    private static int ab;
    public static final ChannelIdentifier var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_b;
    private static int i;
    private static long aa;
    private static long w;
    private static int z;
    private static int r;
    private static int p;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_d;
    private static long var_long_b;
    private static int t;
    public static final ChannelIdentifier var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_a;
    private static int var_int_a;
    private static int k;
    private static long o;
    private static long n;
    private static String[] var_java_lang_String_arr_b;
    private static long x;
    private static int u;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_132.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.B("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 66), NLoginCore_132.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй޿ߎߐߓߓߓߗߛߕߏߛޱ޷ߗߔє", (byte)23, 67) + string + NLoginCore_173.A("ç", (byte)23, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_132(nLoginVelocity nLoginVelocity2) {
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d = nLoginVelocity2;
    }

    private static String a(int n, long l) {
        l ^= 0x34L;
        l ^= 0x35F0B0FEE9591F4CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(54 + 15), (byte)(42 + 41), (byte)(7 + 40), (byte)(35 + 32), 66, (byte)(57 + 10), (byte)(4 + 43), (byte)(45 + 35), (byte)(60 + 15), 67, (byte)(46 + 37), (byte)(48 + 5), (byte)(68 + 12), (byte)(87 + 10), (byte)(25 + 75), (byte)(80 + 20), (byte)(50 + 55), (byte)(51 + 59), (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(51 + 32)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.D("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߅ߔߖߙߙߙߝߡߛߕߡ޷޽ߝߚ", (byte)25, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_132.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(6163450361733887921L);
        var_long_d = Long.reverse(0x2C00000000000000L);
        e = 0x1000000 >>> 56 | 0x1000000 << ~56 + 1;
        f = -1 >>> 100 | -1 << ~100 + 1;
        g = Long.reverse(8757523747099293617L);
        h = Integer.reverse(0);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(8757523747099293617L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(8757523747099293617L);
        m = Integer.reverse(0x20000000);
        n = Long.reverse(6163450361733887921L);
        o = Long.reverse(0x2C00000000000000L);
        p = 0 >>> 15 | 0 << -15;
        q = Integer.reverse(-1610612736);
        r = Integer.reverse(-1);
        s = Long.reverse(8757523747099293617L);
        t = (576 >>> 198 | 576 << ~198 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(-1879048192);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(6163450361733887921L);
        x = Long.reverse(0x2C00000000000000L);
        y = (224 >>> 37 | 224 << -37) & 0xFFFFFFFF;
        z = -1 >>> 78 | -1 << ~78 + 1;
        aa = Long.reverse(8757523747099293617L);
        ab = (0x8000000 >>> 248 | 0x8000000 << ~248 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(8757523747099293617L);
        var_java_lang_String_arr_a = new String[t];
        var_java_lang_String_arr_b = new String[u];
        NLoginCore_132.b();
        var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_a = new LegacyChannelIdentifier((String)NLoginCore_132.c("㺀", (int)v, (long)(w ^ x)));
        var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_b = MinecraftChannelIdentifier.create((String)NLoginCore_132.c("㺃", (int)(y & z), (long)aa), (String)NLoginCore_132.c("㺆", (int)ab, (long)ac));
    }

    @Subscribe
    public void a(PluginMessageEvent pluginMessageEvent) {
        block11: {
            if (!pluginMessageEvent.getResult().isAllowed()) {
                return;
            }
            ChannelMessageSource channelMessageSource = pluginMessageEvent.getSource();
            try {
                ChannelIdentifier channelIdentifier = pluginMessageEvent.getIdentifier();
                if (channelIdentifier.equals((Object)this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.com_velocitypowered_api_proxy_messages_ChannelIdentifier_b()) || channelIdentifier.equals((Object)this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.com_velocitypowered_api_proxy_messages_ChannelIdentifier_a())) {
                    pluginMessageEvent.setResult(PluginMessageEvent.ForwardResult.handled());
                    if (!(channelMessageSource instanceof ServerConnection)) {
                        if (channelMessageSource instanceof Player) {
                            Player player = (Player)channelMessageSource;
                            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_132.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d))));
                            NLoginCore_370.c(player.getUsername() + (String)NLoginCore_132.c("㺃", (int)(e & f), (long)g), new Object[h]);
                        }
                        return;
                    }
                    NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.java_lang_Object_b().a(pluginMessageEvent.getTarget());
                    String string = ((ServerConnection)channelMessageSource).getServer().getServerInfo().getName();
                    byte[] byArray = pluginMessageEvent.getData();
                    this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, string, byArray);
                } else if (channelIdentifier.equals((Object)var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_b) || channelIdentifier.equals((Object)var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_a)) {
                    NLoginCore_033 NLoginCore_0332 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginCore_033_a();
                    if (NLoginCore_0332 == null) {
                        return;
                    }
                    if (!(channelMessageSource instanceof Player)) {
                        return;
                    }
                    if (NLoginCore_0332.a().a(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_d.java_lang_Object_b().a(channelMessageSource), pluginMessageEvent.getData())) {
                        pluginMessageEvent.setResult(PluginMessageEvent.ForwardResult.handled());
                    }
                }
            }
            catch (Throwable throwable) {
                NLoginCore_370.c((String)NLoginCore_132.c("㺆", (int)i, (long)j) + pluginMessageEvent.getClass().getSimpleName() + (String)NLoginCore_132.c("㺉", (int)k, (long)l) + channelMessageSource + (String)NLoginCore_132.c("㺌", (int)m, (long)(n ^ o)), throwable, new Object[p]);
                pluginMessageEvent.setResult(PluginMessageEvent.ForwardResult.handled());
                if (!(channelMessageSource instanceof Player)) break block11;
                ((Player)channelMessageSource).disconnect((Component)NLoginCore_529.a((String)NLoginCore_132.c("㺏", (int)(q & r), (long)s)));
            }
        }
    }

    private static void b() {
        int n;
        c = -8219799828144647766L;
        long l = c ^ 0x35F0B0FEE9591F4CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(16 + 53), (byte)(8 + 75), (byte)(30 + 17), (byte)(14 + 53), (byte)(28 + 38), (byte)(28 + 39), (byte)(15 + 32), (byte)(2 + 78), (byte)(29 + 46), (byte)(36 + 31), (byte)(34 + 49), (byte)(10 + 43), (byte)(46 + 34), (byte)(93 + 4), (byte)(52 + 48), 100, 105, (byte)(96 + 14), (byte)(75 + 28)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_132.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ŴŊŎŋţůƅŮžƖƔŴƂƐƏŚŕŵűřųŮƗƓżƥšƔƉźƀƓƖƀūƜơƲƎƦŮƈƣƁƇƓƆƣƜƏƞƪƔƿƞƫƝƍưƣƑƆƄƣƔƃƼƍǐƺƒƨƳǉƟƫƩǑǍƹǜƔǗƽǗƩƦƧ", (byte)74, 65);
                    NLoginCore_132.var_java_lang_String_arr_b[1] = NLoginCore_575.E("Վ՝նլԼՐւճՇբ՚ջյՌ֎՞ՏբրգՋմՔՓֈք֘ջՖֆ֒զղչ՟ս՚օպ֏֖ը։֦են֚֎ւ֏ջձ֌֊ֲֺ֢֪֡։֌նֹ֚֮֎ָׂ֛֭֜֎ֽպ֚֝֠׍տ֞׍֤֜׆֚ׄ֜֙", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[2] = NLoginCore_027.F("ՎթոՙաՑճԽպ՛մՁւշՌռ՛՚ի֋ջ֐ղշ՗֗ոպլՔթ֋", (byte)74, 70);
                    NLoginCore_132.var_java_lang_String_arr_b[3] = NLoginCore_446.E("Սշ՟տմՀ՗ջյՔ՟Ֆօի՜֏՘֍ՙ՞ճւՙ՚", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[4] = NLoginCore_559.F("շաՐձԺ՚բծՓէՈՎ", (byte)74, 70);
                    NLoginCore_132.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ňŢōŗƐƎşťŊŢƓƋŦƎŻŵƐƇŝŜƑƊŪŵŶŭŘƕŦƤžƈŬźƇơƎƀƉžưƓơƐƉūƏŶƙŸƍƝǁƪƛƽǃƳƣǃǃƦƕƙƢǍǅǄǎƃƱǉƊƓƭǋǌǆǏƪƧǏƩƺƜƗƔƯǑǓǆǓǞǓƠǨ", (byte)74, 65);
                    NLoginCore_132.var_java_lang_String_arr_b[6] = NLoginCore_559.E("՘ջչկ՜ՄՓոՁցԻեՂբրժՁՈւ՞փ֒ՙ՚", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[7] = NLoginCore_575.E("ոծԿ՚Հ՛ԼՒբ՛ճՎ", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ӇԇӨӌԄӬӳӲӮӽӪӛ", (byte)74, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_132.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ŴŊŎŋţůƅŮžƖƔŴƂƐƏŚŕŵűřųŮƗƓżƥšƔƉźƀƓƖƀūƜơƲƎƦŮƈƣƁƇƓƆƣƜƏƞƪƔƿƞƫƝƍưƣƑƆƄƣƔƃƼƍǐƺƒƨƳǉơǘǊƖưƱǈǎƭƝƝƗƻƛƬƜƳƻƶǂǃǥ", (byte)74, 65);
                    NLoginCore_132.var_java_lang_String_arr_b[1] = NLoginCore_446.E("Վ՝նլԼՐւճՇբ՚ջյՌ֎՞ՏբրգՋմՔՓֈք֘ջՖֆ֒զղչ՟ս՚օպ֏֖ը։֦են֚֎ւ֏ջձ֌֊ֲֺ֢֪֡։֌նֹ֚֮֎ָׂ֛֭֜֎ֽպ֛֡׉ׇָֺ֪֗֜׋ְ֚֜֙", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ՎթոՙաՑճԽպ՛մՁւշՌռ՛՚ի֋ջևցկդֈֆ֔֘՚՝֞", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[3] = NLoginCore_173.B("ŚƄŬƌƁōŤƈƂšŪőƏŦũŧŸũśƓŭƟŦŧ", (byte)74, 66);
                    NLoginCore_132.var_java_lang_String_arr_b[4] = NLoginCore_559.A("ŻŗŹŎŇƒũƋņƎŕś", (byte)74, 65);
                    NLoginCore_132.var_java_lang_String_arr_b[5] = NLoginCore_559.E("ԻՕՀՊփցՒ՘ԽՕֆվՙցծըփպՐՏքս՝ըթՠՋֈՙ֗ձջ՟խպ֔ցճռձ֣ֆ֔փռ՞ւթ֌իր֐ִ֝֎ְֶֶֶ֦֖֙ֈ֌֕׀ַָׁնּ֤սֆ֠־ֹֿׂׂ֚֭֝֜֏ֆֱ֢֐׈ִ֖׍ֵֽׅחמֽ֚מִךוֱ֮֡֠", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[6] = NLoginCore_575.B("ťƈƆżũőŠƅŎƎŕƃŘűŬƅŷśŹŰŠƏŦŧ", (byte)74, 66);
                    NLoginCore_132.var_java_lang_String_arr_b[7] = NLoginCore_446.E("ըխց՞գջշ՘վևօէտէ՗ծտՊ֍ֈփւՙ՚", (byte)74, 69);
                    NLoginCore_132.var_java_lang_String_arr_b[8] = NLoginCore_076.A("ŨŗŜţƑŞŦŅƉŎƄś", (byte)74, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_132.var_java_lang_String_arr_b[0] = NLoginCore_324.F("ջԿՎջՒփՠչփհՉ։Խ՗թդ՟՟֑ևփ՜ՙ՚", (byte)74, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_132.var_java_lang_String_arr_b[0] = NLoginCore_384.D("ӕӟӯӣӡӌӣԈԉӰӲԕԅӯԑԘԌӻӪԚӛӹӦӧ", (byte)74, 68);
                }
            }
        }
    }
}

