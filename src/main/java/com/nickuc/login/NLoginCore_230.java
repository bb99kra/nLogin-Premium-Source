/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.api.ChatMessageType
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.connection.Server
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_571;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_569;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_023;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;

public class NLoginCore_230
implements NLoginCore_277 {
    private static long bg;
    private static String[] var_java_lang_String_arr_a;
    private static int v;
    private static long var_long_c;
    private static long d;
    private static int bq;
    private static int br;
    private static int var_int_a;
    private static int bj;
    private static long ap;
    private static int ad;
    private static int an;
    private final ProxiedPlayer var_net_md_5_bungee_api_connection_ProxiedPlayer_a;
    private static int m;
    private final UUID var_java_util_UUID_e = UUID.randomUUID();
    private static int bu;
    private static long k;
    private static int r;
    private static int ax;
    private static int av;
    private static long bb;
    private static long at;
    private static int q;
    private static int az;
    private static int ag;
    private static long aw;
    private static int bl;
    private static int var_int_c;
    private static int bs;
    private static long ao;
    private final boolean R;
    private static long ae;
    private static long aj;
    private static int aq;
    private static int bh;
    private static int u;
    private static int bp;
    private static int j;
    private static int ba;
    private static int bt;
    private static int bi;
    private static long bn;
    private static int var_int_b;
    private static int z;
    private static int p;
    static final Map<ProxiedPlayer, NLoginCore_230> cfr_renamed_19;
    private static int ar;
    private static int bm;
    private final NLoginCore_383 var_com_nickuc_login_NLoginCore_383_b;
    private final ProxyServer var_net_md_5_bungee_api_ProxyServer_c;
    private static long ai;
    private static int h;
    private static long bf;
    private static long bc;
    private static int bd;
    private static int w;
    private static long af;
    private static long bk;
    private static long bo;
    private static long n;
    private static long ac;
    private static int ah;
    private static long l;
    private static long al;
    private static int o;
    private static int ay;
    private static long var_long_e;
    private static int ab;
    private static int t;
    private static String[] var_java_lang_String_arr_b;
    private static int as;
    private static long g;
    private static int f;
    private static int s;
    private static int i;
    private static int ak;
    private static long au;
    private static int y;
    private static int aa;
    private static int be;
    private NLoginInterface_023 var_com_nickuc_login_NLoginInterface_023_a;
    private static long am;
    private static int x;

    @Override
    public void n(String string) {
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.setDisplayName(string);
    }

    @Override
    public void l(String string) {
        if (string.length() >= o && string.charAt(p) == q) {
            string = string.substring(r);
        }
        this.var_net_md_5_bungee_api_ProxyServer_c.getPluginManager().dispatchCommand((CommandSender)this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a, string);
    }

    public static NLoginCore_230 a(NLoginCore_383 NLoginCore_3832, ProxyServer proxyServer, Object object) {
        if (object instanceof String) {
            String string = ((String)object).toLowerCase(Locale.ENGLISH);
            ProxiedPlayer proxiedPlayer = proxyServer.getPlayer(string);
            if (proxiedPlayer == null) {
                return null;
            }
            return NLoginCore_230.a(NLoginCore_3832, proxyServer, proxiedPlayer);
        }
        if (object instanceof ProxiedPlayer) {
            return NLoginCore_230.a(NLoginCore_3832, proxyServer, (ProxiedPlayer)object);
        }
        throw new IllegalArgumentException((String)NLoginCore_230.c("㺀", (int)ah, (long)(ai ^ aj)) + object + (String)NLoginCore_230.c("㺃", (int)ak, (long)(al ^ am)) + (String)(object != null ? object.getClass().getCanonicalName() : NLoginCore_230.c("㺆", (int)an, (long)(ao ^ ap))));
    }

    @Override
    public void ad() {
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendTitle(this.var_net_md_5_bungee_api_ProxyServer_c.createTitle().reset());
    }

    @Override
    public void o(String string) {
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText((String)NLoginCore_065.f(string, h != 0)));
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return u != 0;
        }
        NLoginCore_230 NLoginCore_230 = (NLoginCore_230)object;
        return (Objects.equals(this.var_java_util_UUID_e, NLoginCore_230.var_java_util_UUID_e) && Objects.equals(this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a, NLoginCore_230.var_net_md_5_bungee_api_connection_ProxiedPlayer_a) ? v : w) != 0;
    }

    @Override
    public NLoginInterface_023 com_nickuc_login_NLoginInterface_023_a() {
        if (this.var_com_nickuc_login_NLoginInterface_023_a == null) {
            this.var_com_nickuc_login_NLoginInterface_023_a = new NLoginCore_571(this);
        }
        return this.var_com_nickuc_login_NLoginInterface_023_a;
    }

    @Override
    public UUID java_util_UUID_a() {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getUniqueId();
    }

    private static NLoginCore_230 a(NLoginCore_383 NLoginCore_3832, ProxyServer proxyServer, ProxiedPlayer proxiedPlayer) {
        NLoginCore_230 NLoginCore_230 = (NLoginCore_230)var_long_c.get(proxiedPlayer);
        if (NLoginCore_230 != null) {
            return NLoginCore_230;
        }
        if (NLoginCore_370.aj()) {
            StackTraceElement[] stackTraceElementArray = new Exception().getStackTrace();
            Object object = stackTraceElementArray.length > 0 ? stackTraceElementArray[Math.min(aq, stackTraceElementArray.length - ar)].toString() : NLoginCore_230.c("㺀", (int)as, (long)(at ^ au));
            Object[] objectArray = new Object[ax];
            objectArray[NLoginCore_230.ay] = proxiedPlayer.getName();
            objectArray[NLoginCore_230.az] = object;
            NLoginCore_370.c((String)NLoginCore_230.c("㺃", (int)av, (long)aw), objectArray);
        }
        return NLoginCore_230.b(NLoginCore_3832, proxyServer, proxiedPlayer);
    }

    private static void void_b() {
        int n;
        var_long_c = 8209779327812574362L;
        long l = var_long_c ^ 0xB3DEB209D99F403AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(40 + 29), (byte)(21 + 62), (byte)(30 + 17), (byte)(58 + 9), (byte)(9 + 57), (byte)(42 + 25), (byte)(25 + 22), (byte)(14 + 66), (byte)(64 + 11), (byte)(31 + 36), (byte)(17 + 66), (byte)(5 + 48), (byte)(4 + 76), (byte)(16 + 81), 100, (byte)(50 + 50), (byte)(72 + 33), (byte)(52 + 58), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_230.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ԷӾԼԉԍԛՀԬԍԯԔԤՆՏԥԬՃ՗ԚՉԺՐ՜ԜԱեՕ՜՚ԻՓՖթ՜ի՞ՄՀԼ԰՛ԽգԺ", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[1] = NLoginCore_387.F("ՁԸԜՀԋՈԡՑՏՌԿԚ", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ÿĞÿġĩĄòÝĉěċĜĚĚįĐĨþĶĈĬĔķķĚöþīĵĊĂĬģēĜļńĸĀĜĚĚňē", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ԷӾԼԉԍԛՀԬԍԯԇԎԏԤԏ԰ԻԗԚԿ՞ա՗ԼՍՌ՞ԴԵգ՗Ք", (byte)22, 69);
                    NLoginCore_230.var_java_lang_String_arr_b[4] = NLoginCore_092.C("ѫѠсѱвѐщѕжЫьюиѾѸѼлєђтѢѻїѰљѝѕчо҈ѺѮѝѹѫѢҏѱґҌєѓѦџ", (byte)22, 67);
                    NLoginCore_230.var_java_lang_String_arr_b[5] = NLoginCore_091.B("ĞâãÞûĉúĬĝĄįĊĮĚĮĐëĐĲĠĩāþÿ", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[6] = NLoginCore_091.A("Đ×ĕâæôęąæĈäíĉîûĔĆîÿččĦñĦùĵĐùĳøþýŀİĢĽŉĆĆĥĤņĚē", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[7] = NLoginCore_559.B("ĚđõęäġúĪĨĥĘó", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[8] = NLoginCore_201.F("ԄԩՋՈԩԩՂԄԬԳԌԚ", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[9] = NLoginCore_223.E("ԪԇԷԶՉԐՍՅՈԞՃԚ", (byte)22, 69);
                    NLoginCore_230.var_java_lang_String_arr_b[10] = NLoginCore_223.B("øßĐÝèĖĩæĠčĠáĞĄĊñďįôĴîīìČĚĻĹÿįĩģěŀĢĤĂıĴŀńČėČĸłŃŌĊŊŀğēġĐŐħŒŚşřŝķŌĢķŀŅňĚĶśšĺĹĮŅįřŤıųĲĬŰŪńŤŘĵķŒŷŪůŜŔ", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[11] = NLoginCore_201.B("ďĒĘçđĚÿēĕģďþĞĝăċīĪĖĒĕāþÿ", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[12] = NLoginCore_138.B("ÚÿåğĀĆàûāĕćøĠÿèēĉıčîĀķþÿ", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[13] = NLoginCore_324.C("ъѭѰфџыѵѧѳѐдѣѻќўѠкѡѪѳѴѳъы", (byte)22, 67);
                    NLoginCore_230.var_java_lang_String_arr_b[14] = NLoginCore_138.D("ЯЫьсѝрЭєчђѦњмѩјѶєѡоііѳъы", (byte)22, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_230.var_java_lang_String_arr_b[0] = NLoginCore_223.B("Đ×ĕâæôęąæĈíýğĨþąĜİóĢēĩĵõĊľĮĵĳĔĬįöěıāĸŅńĕĪŌĖē", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[1] = NLoginCore_027.C("иѐпбгѭъьёѩтп", (byte)22, 67);
                    NLoginCore_230.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ыѪыѭѵѐоЩѕѧїѨѦѦѻќѴъ҂єѸѠ҃҃ѦтъѷҁіюѸыѝъғѢҏҕҖ҈їљџ", (byte)22, 67);
                    NLoginCore_230.var_java_lang_String_arr_b[3] = NLoginCore_173.B("Đ×ĕâæôęąæĈàçèýèĉĔðóĘķķĬôįęĶĚĜĖđùÿĵĵŇłĉėėþīŀē", (byte)22, 66);
                    NLoginCore_230.var_java_lang_String_arr_b[4] = NLoginCore_076.A("ğĔõĥæĄýĉêßĀĂìĲĬİïĈĆöĖįċĤčđĉûòļĮĢĬĦĎŀąĠľĬĿąąē", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[5] = NLoginCore_223.E("ՅԉԊԅԢ԰ԡՓՄԫՔՒԭՒԧԤԗԙԜԩՇԨԥԦ", (byte)22, 69);
                    NLoginCore_230.var_java_lang_String_arr_b[6] = NLoginCore_324.A("Đ×ĕâæôęąæĈäíĉîûĔĆîÿččĦñĦùĵĐùĳøþýúēĤĹěĚĚġĵċĢē", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[7] = NLoginCore_138.F("ԊԣՄԦԝԦԭԊԏԳԵԚ", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ЪкѝѝѐьяѢѸѮђп", (byte)22, 68);
                    NLoginCore_230.var_java_lang_String_arr_b[9] = NLoginCore_110.F("ՅԕՋԈՎԞՌԦՉՆՆԭՒՔԶՒԸ՜ԯԙՓԸԥԦ", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[10] = NLoginCore_324.C("фЫќЩдѢѵвѬљѬЭѪѐінћѻрҀкѷијѦ҇҅ыѻѵѯѧҌѮѰюѽҀҌҐјѣј҄ҎҏҘіҖҌѫџѭќҜѳҞҦҫҥҩ҃ҘѮ҃ҌґҔѦ҂ҧҭ҆҅ѺґѻҥҰѽҿѾѸҼҶҘӀҴӁҜҒҞҙҍҎ҇ҞҝҬүҭӅҡӗӁҹҪҟ", (byte)22, 67);
                    NLoginCore_230.var_java_lang_String_arr_b[11] = NLoginCore_427.A("ďĒĘçđĚÿēĕģĖĨíīĎþíćĨćĐćđøęĒįĈòķĢī", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[12] = NLoginCore_091.F("ԁԦԌՆԧԭԇԢԨԼԯՖՔՕՇ՗ՃՉԷԛ՝Բ՚՜ԣՐԼ՞԰ԹԽե", (byte)22, 70);
                    NLoginCore_230.var_java_lang_String_arr_b[13] = NLoginCore_575.A("þġĤøēÿĩěħĄåĢđĈĪćĮçĀĔāāþÿ", (byte)22, 65);
                    NLoginCore_230.var_java_lang_String_arr_b[14] = NLoginCore_027.F("ԊԆԧԜԸԛԈԯԢԭՂԣԫՊՁԪՅԒՇԾԻԟՖԝԫԿՄզՈՃԹԦ", (byte)22, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_230.var_java_lang_String_arr_b[0] = NLoginCore_559.D("рыѳщсѧрзхѐггијњѽрўѫмњѻѣѷјруѹѩѧѻҊ", (byte)22, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_230.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ãÝäÞĘĢĀĤĢĤĠ÷ĬëïÿģĞĳĥĠĳúĊĜĹľĩĝĴĵġ", (byte)22, 65);
                }
            }
        }
    }

    public int hashCode() {
        Object[] objectArray = new Object[x];
        objectArray[NLoginCore_230.y] = this.var_java_util_UUID_e;
        objectArray[NLoginCore_230.z] = this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a;
        return Objects.hash(objectArray);
    }

    @Override
    public void p(String string) {
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.chat(string);
    }

    @Override
    public boolean R() {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.isConnected();
    }

    @Override
    public Optional<String> a() {
        return Optional.ofNullable(this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getLocale()).map(Locale::toLanguageTag);
    }

    @Override
    public void d(Object object) {
        if (object instanceof String) {
            this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendMessage(TextComponent.fromLegacyText((String)NLoginCore_065.f((String)object, var_int_b != 0)));
        } else if (object instanceof TextComponent) {
            this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendMessage((BaseComponent)((TextComponent)object));
        } else {
            throw new IllegalArgumentException((String)NLoginCore_230.c("㺀", (int)var_int_c, (long)(d ^ var_long_e)) + object + (String)NLoginCore_230.c("㺃", (int)f, (long)g) + object.getClass().getCanonicalName());
        }
    }

    @Override
    public void a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_337 NLoginCore_3372, Object object, byte[] byArray) {
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_230.c("㺀", (int)j, (long)(k ^ l)));
        }
        if (!this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.isConnected()) {
            return;
        }
        switch (NLoginCore_569.q[NLoginCore_3372.ordinal()]) {
            case 1: {
                this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendData((String)object, byArray);
                break;
            }
            case 2: {
                Server server = this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getServer();
                if (server == null) break;
                server.sendData((String)object, byArray);
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_230.c("㺃", (int)m, (long)n) + (Object)((Object)NLoginCore_3372));
            }
        }
    }

    @Override
    public NLoginCore_589 com_nickuc_login_NLoginInterface_022_a() {
        return this.var_com_nickuc_login_NLoginCore_383_b.a(var_int_a != 0);
    }

    private static String a(int n, long l) {
        l ^= 0x47L;
        l ^= 0xB3DEB209D99F403AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(56 + 13), (byte)(72 + 11), (byte)(34 + 13), (byte)(64 + 3), 66, 67, (byte)(35 + 12), (byte)(65 + 15), (byte)(23 + 52), (byte)(42 + 25), (byte)(62 + 21), (byte)(50 + 3), (byte)(58 + 22), (byte)(8 + 89), (byte)(82 + 18), (byte)(72 + 28), (byte)(92 + 13), (byte)(109 + 1), (byte)(100 + 3)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.B("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżӡԉԕԏԓԚԏԈԎԘԚӿ", (byte)95, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_230.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_230.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.E("ӻԝԟӿԣՂԺՐԼԋՉԿՍՇԐԵ՗ՖՎՔՎԣ", (byte)23, 69), NLoginCore_230.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìёѹ҅ѿ҃ҊѿѸѾ҈ҊѯĄ", (byte)23, 65) + string + NLoginCore_453.C("д", (byte)23, 67) + methodType.toString(), exception);
        }
    }

    /*
     * Exception decompiling
     */
    static NLoginCore_230 b(NLoginCore_383 var0, ProxyServer var1_1, ProxiedPlayer var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    @Generated
    public boolean S() {
        return this.R;
    }

    @Override
    public boolean i(String string) {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.hasPermission(string);
    }

    @Override
    public CompletableFuture<Void> a(String string) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.disconnect(TextComponent.fromLegacyText((String)NLoginCore_065.f(string, i != 0)));
        completableFuture.complete(null);
        return completableFuture;
    }

    @Override
    public String u() {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getDisplayName();
    }

    public String toString() {
        return (String)NLoginCore_230.c("㺀", (int)(aa & ab), (long)ac) + this.var_java_util_UUID_e + (String)NLoginCore_230.c("㺃", (int)ad, (long)(ae ^ af)) + this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a + (char)ag;
    }

    @Override
    public int h() {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getPing();
    }

    static /* synthetic */ ProxiedPlayer a(NLoginCore_230 NLoginCore_230) {
        return NLoginCore_230.var_net_md_5_bungee_api_connection_ProxiedPlayer_a;
    }

    @Override
    public InetSocketAddress java_net_InetSocketAddress_a() {
        try {
            return (InetSocketAddress)this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getSocketAddress();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getAddress();
        }
    }

    @Override
    public String getName() {
        return this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.getName();
    }

    @Override
    public <T> T c() {
        return (T)this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = Integer.reverse(0);
        d = Long.reverse(6429092310230726542L);
        var_long_e = Long.reverse(-2161727821137838080L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-4956007547761887346L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (0x4000000 >>> 57 | 0x4000000 << ~57 + 1) & 0xFFFFFFFF;
        k = Long.reverse(6429092310230726542L);
        l = Long.reverse(-2161727821137838080L);
        m = Integer.reverse(-1073741824);
        n = Long.reverse(-4956007547761887346L);
        o = 1024 >>> 41 | 1024 << ~41 + 1;
        p = Integer.reverse(0);
        q = 1504 >>> 101 | 1504 << -101;
        r = 524288 >>> 243 | 524288 << ~243 + 1;
        s = 0x10000000 >>> 188 | 0x10000000 << -188;
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(0);
        v = (16384 >>> 174 | 16384 << ~174 + 1) & 0xFFFFFFFF;
        w = 0 >>> 122 | 0 << -122;
        x = Integer.reverse(0x40000000);
        y = (0 >>> 53 | 0 << ~53 + 1) & 0xFFFFFFFF;
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0x20000000);
        ab = Integer.reverse(-1);
        ac = Long.reverse(-4956007547761887346L);
        ad = Integer.reverse(-1610612736);
        ae = Long.reverse(6429092310230726542L);
        af = Long.reverse(-2161727821137838080L);
        ag = (128000 >>> 202 | 128000 << ~202 + 1) & 0xFFFFFFFF;
        ah = (0x6000000 >>> 88 | 0x6000000 << -88) & 0xFFFFFFFF;
        ai = Long.reverse(6429092310230726542L);
        aj = Long.reverse(-2161727821137838080L);
        ak = (0x1C000000 >>> 154 | 0x1C000000 << -154) & 0xFFFFFFFF;
        al = Long.reverse(6429092310230726542L);
        am = Long.reverse(-2161727821137838080L);
        an = 8192 >>> 10 | 8192 << -10;
        ao = Long.reverse(6429092310230726542L);
        ap = Long.reverse(-2161727821137838080L);
        aq = Integer.reverse(-1073741824);
        ar = 262144 >>> 50 | 262144 << -50;
        as = (0x40000002 >>> 62 | 0x40000002 << -62) & 0xFFFFFFFF;
        at = Long.reverse(6429092310230726542L);
        au = Long.reverse(-2161727821137838080L);
        av = Integer.reverse(0x50000000);
        aw = Long.reverse(-4956007547761887346L);
        ax = Integer.reverse(0x40000000);
        ay = (0 >>> 79 | 0 << ~79 + 1) & 0xFFFFFFFF;
        az = 0x1000000 >>> 120 | 0x1000000 << ~120 + 1;
        ba = Integer.reverse(-805306368);
        bb = Long.reverse(6429092310230726542L);
        bc = Long.reverse(-2161727821137838080L);
        bd = Integer.reverse(-1);
        be = (0x1800000 >>> 85 | 0x1800000 << -85) & 0xFFFFFFFF;
        bf = Long.reverse(6429092310230726542L);
        bg = Long.reverse(-2161727821137838080L);
        bh = Integer.reverse(0);
        bi = Integer.reverse(-1342177280);
        bj = Integer.reverse(-1);
        bk = Long.reverse(-4956007547761887346L);
        bl = Integer.reverse(Integer.MIN_VALUE);
        bm = -536870912 >>> 156 | -536870912 << ~156 + 1;
        bn = Long.reverse(6429092310230726542L);
        bo = Long.reverse(-2161727821137838080L);
        bp = Integer.reverse(0x40000000);
        bq = 262144 >>> 146 | 262144 << -146;
        br = Integer.reverse(0);
        bs = (0 >>> 41 | 0 << ~41 + 1) & 0xFFFFFFFF;
        bt = Integer.reverse(-268435456);
        bu = Integer.reverse(-268435456);
        var_java_lang_String_arr_a = new String[bt];
        var_java_lang_String_arr_b = new String[bu];
        NLoginCore_230.void_b();
        var_long_c = (long)new ConcurrentHashMap();
    }

    @Override
    public void a(String string, String string2, int n, int n2, int n3) {
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a.sendTitle(this.var_net_md_5_bungee_api_ProxyServer_c.createTitle().title(TextComponent.fromLegacyText((String)NLoginCore_065.f(string, s != 0))).subTitle(TextComponent.fromLegacyText((String)NLoginCore_065.f(string2, t != 0))).fadeIn(n).fadeOut(n3).stay(n2));
    }

    @Generated
    private NLoginCore_230(NLoginCore_383 NLoginCore_3832, ProxiedPlayer proxiedPlayer, ProxyServer proxyServer, boolean bl) {
        this.var_com_nickuc_login_NLoginCore_383_b = NLoginCore_3832;
        this.var_net_md_5_bungee_api_connection_ProxiedPlayer_a = proxiedPlayer;
        this.var_net_md_5_bungee_api_ProxyServer_c = proxyServer;
        this.R = bl;
    }
}

