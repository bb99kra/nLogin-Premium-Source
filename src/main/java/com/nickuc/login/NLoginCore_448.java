/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  io.papermc.paper.connection.PlayerConfigurationConnection
 *  io.papermc.paper.event.connection.configuration.AsyncPlayerConnectionConfigureEvent
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.format.NamedTextColor
 *  net.kyori.adventure.text.format.TextColor
 *  org.bukkit.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import io.papermc.paper.connection.PlayerConfigurationConnection;
import io.papermc.paper.event.connection.configuration.AsyncPlayerConnectionConfigureEvent;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.EventHandler;

public class NLoginCore_448
implements NLoginInterface_027 {
    private static String[] var_java_lang_String_arr_b;
    private static int ag;
    private static int au;
    private static int aq;
    private static int as;
    private static int bc;
    private static int e;
    private static long k;
    private static int w;
    private static int an;
    private static int am;
    private static int ak;
    private static long bd;
    private static int r;
    private static long be;
    private static long q;
    private static int ai;
    private static int i;
    private static int o;
    private static int h;
    private static long ac;
    private static String[] var_java_lang_String_arr_a;
    private static long m;
    private static long n;
    private static long aw;
    private static long al;
    private static int aj;
    private static long ap;
    private static long g;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_f;
    private static long at;
    private static int bf;
    private static int ad;
    private static int av;
    private static int ay;
    private static int y;
    private static long x;
    private static long u;
    private static int af;
    private static int var_int_b;
    private static int j;
    private static long var_long_c;
    private static int ar;
    private static int ab;
    private static int s;
    private static int v;
    private static int ae;
    private static int var_int_c;
    private static int bg;
    private static long ba;
    private static long aa;
    private static long ao;
    private static int var_int_f;
    private static int ax;
    private static long z;
    private static long ah;
    private static long az;
    private static int bb;
    private static long d;
    private static int p;
    private static int t;
    private static int l;
    private static int var_int_a;

    @EventHandler
    public void a(AsyncPlayerConnectionConfigureEvent asyncPlayerConnectionConfigureEvent) {
        PlayerConfigurationConnection playerConfigurationConnection = asyncPlayerConnectionConfigureEvent.getConnection();
        Channel channel = (Channel)SpigotReflectionUtil.getChannelFromPaperConnection((Object)asyncPlayerConnectionConfigureEvent.getConnection());
        if (channel == null) {
            String[] stringArray = new String[var_int_a];
            stringArray[NLoginCore_448.var_int_b] = NLoginCore_448.c("㺀", (int)var_int_c, (long)d);
            stringArray[NLoginCore_448.e] = NLoginCore_448.c("㺃", (int)var_int_f, (long)g);
            stringArray[NLoginCore_448.h] = (String)NLoginCore_448.c("㺆", (int)(i & j), (long)k) + asyncPlayerConnectionConfigureEvent.getClass().getSimpleName() + (String)NLoginCore_448.c("㺉", (int)l, (long)(m ^ n));
            stringArray[NLoginCore_448.o] = NLoginCore_448.c("㺌", (int)p, (long)q);
            stringArray[NLoginCore_448.r] = NLoginCore_448.c("㺏", (int)(s & t), (long)u);
            playerConfigurationConnection.disconnect((Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
            return;
        }
        BukkitHelper_001 BukkitHelper_001 = (BukkitHelper_001)channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).get();
        if (BukkitHelper_001 == null) {
            String string = (String)NLoginCore_448.c("㺒", (int)(v & w), (long)x) + playerConfigurationConnection.getProfile().getName() + (String)NLoginCore_448.c("㺕", (int)y, (long)(z ^ aa)) + asyncPlayerConnectionConfigureEvent.getClass().getSimpleName() + (String)NLoginCore_448.c("㺘", (int)ab, (long)ac);
            NLoginCore_370.c(string, new Object[ad]);
            String[] stringArray = new String[ae];
            stringArray[NLoginCore_448.af] = NLoginCore_448.c("㺛", (int)ag, (long)ah);
            stringArray[NLoginCore_448.ai] = NLoginCore_448.c("㺞", (int)(aj & ak), (long)al);
            stringArray[NLoginCore_448.am] = (String)NLoginCore_448.c("㺡", (int)an, (long)(ao ^ ap)) + string;
            stringArray[NLoginCore_448.aq] = NLoginCore_448.c("㺤", (int)(ar & as), (long)at);
            stringArray[NLoginCore_448.au] = NLoginCore_448.c("㺧", (int)av, (long)aw);
            playerConfigurationConnection.disconnect((Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
            return;
        }
        CompletableFuture completableFuture = new CompletableFuture();
        if (this.var_com_nickuc_login_NLoginType_008_f.com_nickuc_login_NLoginCore_581_b().a().a(BukkitHelper_001.var_com_nickuc_login_lib_packetevents_api_protocol_player_User_a, bl -> completableFuture.complete(null))) {
            try {
                completableFuture.get(NLoginCore_532.E.r() + ax, TimeUnit.SECONDS);
            }
            catch (ExecutionException | TimeoutException exception) {
                NLoginCore_370.c((String)NLoginCore_448.c("㺪", (int)ay, (long)(az ^ ba)), exception, new Object[bb]);
                playerConfigurationConnection.disconnect((Component)Component.text((String)NLoginCore_448.c("㺭", (int)bc, (long)(bd ^ be)), (TextColor)NamedTextColor.RED));
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3DL;
        l ^= 0xCA9F4E5F16AC4A91L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(6 + 63), (byte)(27 + 56), 47, (byte)(55 + 12), (byte)(61 + 5), (byte)(30 + 37), (byte)(41 + 6), (byte)(54 + 26), 75, (byte)(40 + 27), (byte)(17 + 66), (byte)(2 + 51), (byte)(48 + 32), (byte)(44 + 53), (byte)(75 + 25), (byte)(74 + 26), (byte)(27 + 78), (byte)(14 + 96), (byte)(58 + 45)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.A("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҴҦұҕҷҬҍҰҹүҟҴҭ", (byte)46, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_448.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_448.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), NLoginCore_448.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.C("ЭкйϼмигмчжЃсхосчЉޣޕޠބަޛݼޟިޞގޣޜТ", (byte)7, 67) + string + NLoginCore_027.A("Ç", (byte)7, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_448(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_f = NLoginType_008;
    }

    static {
        var_int_a = 160 >>> 5 | 160 << ~5 + 1;
        var_int_b = 0 >>> 46 | 0 << -46;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-5248057393573910713L);
        e = (2048 >>> 235 | 2048 << ~235 + 1) & 0xFFFFFFFF;
        var_int_f = (0x800000 >>> 183 | 0x800000 << ~183 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-5248057393573910713L);
        h = Integer.reverse(0x40000000);
        i = 64 >>> 101 | 64 << -101;
        j = -1 >>> 209 | -1 << ~209 + 1;
        k = Long.reverse(-5248057393573910713L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(804780505612035911L);
        n = Long.reverse(-4899916394579099648L);
        o = (786432 >>> 242 | 786432 << ~242 + 1) & 0xFFFFFFFF;
        p = 0x400000 >>> 52 | 0x400000 << ~52 + 1;
        q = Long.reverse(-5248057393573910713L);
        r = 0x4000000 >>> 184 | 0x4000000 << ~184 + 1;
        s = 0x50000000 >>> 92 | 0x50000000 << ~92 + 1;
        t = Integer.reverse(-1);
        u = Long.reverse(-5248057393573910713L);
        v = 0xC00000 >>> 85 | 0xC00000 << ~85 + 1;
        w = (-1 >>> 176 | -1 << ~176 + 1) & 0xFFFFFFFF;
        x = Long.reverse(-5248057393573910713L);
        y = (28 >>> 98 | 28 << -98) & 0xFFFFFFFF;
        z = Long.reverse(804780505612035911L);
        aa = Long.reverse(-4899916394579099648L);
        ab = (128 >>> 36 | 128 << ~36 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(-5248057393573910713L);
        ad = Integer.reverse(0);
        ae = Integer.reverse(-1610612736);
        af = Integer.reverse(0);
        ag = (0x240000 >>> 210 | 0x240000 << -210) & 0xFFFFFFFF;
        ah = Long.reverse(-5248057393573910713L);
        ai = (0x1000000 >>> 88 | 0x1000000 << -88) & 0xFFFFFFFF;
        aj = (20 >>> 225 | 20 << -225) & 0xFFFFFFFF;
        ak = (-1 >>> 166 | -1 << -166) & 0xFFFFFFFF;
        al = Long.reverse(-5248057393573910713L);
        am = Integer.reverse(0x40000000);
        an = Integer.reverse(-805306368);
        ao = Long.reverse(804780505612035911L);
        ap = Long.reverse(-4899916394579099648L);
        aq = -2147483647 >>> 127 | -2147483647 << -127;
        ar = Integer.reverse(0x30000000);
        as = Integer.reverse(-1);
        at = Long.reverse(-5248057393573910713L);
        au = (2 >>> 127 | 2 << -127) & 0xFFFFFFFF;
        av = -2147483642 >>> 63 | -2147483642 << -63;
        aw = Long.reverse(-5248057393573910713L);
        ax = 0x1E00000 >>> 180 | 0x1E00000 << -180;
        ay = Integer.reverse(0x70000000);
        az = Long.reverse(804780505612035911L);
        ba = Long.reverse(-4899916394579099648L);
        bb = Integer.reverse(0);
        bc = -1073741821 >>> 94 | -1073741821 << ~94 + 1;
        bd = Long.reverse(804780505612035911L);
        be = Long.reverse(-4899916394579099648L);
        bf = Integer.reverse(0x8000000);
        bg = (0x1000000 >>> 84 | 0x1000000 << -84) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[bf];
        var_java_lang_String_arr_b = new String[bg];
        NLoginCore_448.b();
    }

    private static void b() {
        int n;
        var_long_c = -2097458098663533360L;
        long l = var_long_c ^ 0xCA9F4E5F16AC4A91L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(36 + 33), 83, (byte)(24 + 23), (byte)(43 + 24), (byte)(51 + 15), (byte)(42 + 25), (byte)(9 + 38), (byte)(21 + 59), (byte)(38 + 37), (byte)(56 + 11), (byte)(27 + 56), (byte)(18 + 35), (byte)(8 + 72), (byte)(40 + 57), 100, (byte)(11 + 89), (byte)(100 + 5), (byte)(47 + 63), (byte)(45 + 58)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_448.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ĊĐďĝĪûíĬĀĆġòòİĔóİùĞĠŀċĈĉ", (byte)27, 66);
                    NLoginCore_448.var_java_lang_String_arr_b[1] = NLoginCore_092.E("Ԉ԰ՈԑՀԎ՗ԷՋՕԕԟ", (byte)27, 69);
                    NLoginCore_448.var_java_lang_String_arr_b[2] = NLoginCore_091.C("ьђїѷѸяѤњџѝђсѴуѾџҐѦџҏ҈Ґѣђ҅҄ҚѤқѰќҘҒҔѵѳҝѸң҂ҕѺҟҟѡ҅҇ѭҌѻүҡҠѼѹѺ", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[3] = NLoginCore_004.C("ѧѩѸтѶўѳі҇џѡю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[4] = NLoginCore_091.F("Ԉ԰ՈԑՀԎ՗ԷՋՕԕԟ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[5] = NLoginCore_091.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ՘՟ՐԮ՘ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅթդչնյՉՖիԿ՟փՊՋ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[6] = NLoginCore_076.E("ՆԌԪՅԯԑԶՊՐԬՈԩԻԻԖԼԪ՟՞ՎՎԟ՞ՃԲԾՒՂբԪթՎՏՃՈՑՔԽՖմՆծծկՒՍիսսՙԸՒՏսծֆվՉռՕէջքդ", (byte)27, 69);
                    NLoginCore_448.var_java_lang_String_arr_b[7] = NLoginCore_091.C("ѫѐѫѷѐћѯѤ҆ѕѕю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[8] = NLoginCore_138.A("ĉĊüğþĢĤðìĸĹĸĚĸėįúĒĊķĬÿĚĻĎğŉĶĺķĴčŋŏĪģďĿőĞķİġđŃňĵĬōěŉŢěĻĨĩ", (byte)27, 65);
                    NLoginCore_448.var_java_lang_String_arr_b[9] = NLoginCore_446.E("ԬԲԱԿՌԝԏՎԢԨՃԔԔՒԶԕՒԛՀՂբԭԪԫ", (byte)27, 69);
                    NLoginCore_448.var_java_lang_String_arr_b[10] = NLoginCore_173.A("æĎĦïĞìĵĕĩĳóý", (byte)27, 65);
                    NLoginCore_448.var_java_lang_String_arr_b[11] = NLoginCore_004.C("іѻѸѰєџѡѦѯќѷю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[12] = NLoginCore_091.C("зџѷрѯн҆ѦѺ҄фю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[13] = NLoginCore_110.D("ѧѶѮѝлќоѝїѩѡѲ҂ўэ҇Ҏѿѝ҇ѲѥўҒяѡѢѓҎѹѫҐѝҌѫѡѫҤѻҧҀҖѴҘғҨҥҤѸ҅ҚѮҎҲѹѺ", (byte)27, 68);
                    NLoginCore_448.var_java_lang_String_arr_b[14] = NLoginCore_092.B("êùĮüĎđĵīĐčĈòĢíĉôþęċĉĎĖþİİğěģĔĜĞŌħĘčćĺŃĐĒĶįŃĒĸŒĳŊıľœĚĞĞŃĸĻŚňĻŔŗŃšĥŰŏŋűŠĪťŵŕĳĽ", (byte)27, 66);
                    NLoginCore_448.var_java_lang_String_arr_b[15] = NLoginCore_223.B("êùĮüĎđĵīĐčĈòĢíĉôþęċĉĎĖþİİğěģĔĜĞŌħĘčćĺŃĐĒĶįŃĒĸŒĳŊıľœĚĞĞŃĸĻŚňĻŔŗŃšĥŰŏŋűŠĪťŵŕĳĽ", (byte)27, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_448.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ԬԲԱԿՌԝԏՎԢԨՃ՘Ԧ԰՟ԟԲԘ՝ԭԣԽԪԫ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[1] = NLoginCore_446.F("ՋՏՃՓԴԤՃԢԠԹՐԟ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[2] = NLoginCore_446.D("ьђїѷѸяѤњџѝђсѴуѾџҐѦџҏ҈Ґѣђ҅҄ҚѤқѰќҘҒҔѵѳҝѸң҂ҕѺҟ҈ҫҕѫҎѷѪѺҒґѼѹѺ", (byte)27, 68);
                    NLoginCore_448.var_java_lang_String_arr_b[3] = NLoginCore_427.B("ĤîĚĩăĂăĔēįĘùęĚóĕĖĴĠĖÿŁĈĉ", (byte)27, 66);
                    NLoginCore_448.var_java_lang_String_arr_b[4] = NLoginCore_446.C("ѾѼѴѾѤћѢѱѽуѳю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[5] = NLoginCore_575.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ՘՟ՐԮ՘ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅյռմՙ՟ՑՠլջՏՍՊՋ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[6] = NLoginCore_453.A("ĤêĈģčïĔĨĮĊĦćęęôĚĈĽļĬĬýļġĐĜİĠŀĈŇĬĭġĦįĲěĴŒĤŌŌōİīŉśśķĖİĭőĤėŐŖşĥśŜŋĸ", (byte)27, 65);
                    NLoginCore_448.var_java_lang_String_arr_b[7] = NLoginCore_223.E("ՅԿԽՌԿԐՉԕ԰ԲԢԟ", (byte)27, 69);
                    NLoginCore_448.var_java_lang_String_arr_b[8] = NLoginCore_451.F("ԫԬԞՁԠՄՆԒԎ՚՛՚Լ՚ԹՑԜԴԬՙՎԡԼ՝԰Ձի՘՜ՙՖԯխձՌՅԱաճՀՙՒՅձՏԴՕ՗ԹՔձ՝՗քււմՓժ՚ԾւՌս", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[9] = NLoginCore_173.A("ĊĐďĝĪûíĬĀĆęïĻĊîĩĭûİđģıĈĉ", (byte)27, 65);
                    NLoginCore_448.var_java_lang_String_arr_b[10] = NLoginCore_384.C("эѰѫрѠж҅џџѥѕю", (byte)27, 67);
                    NLoginCore_448.var_java_lang_String_arr_b[11] = NLoginCore_427.B("éîČĞñĮĉĄĩòĶý", (byte)27, 66);
                    NLoginCore_448.var_java_lang_String_arr_b[12] = NLoginCore_453.F("ԡՒԐԩՌԦԥՃՐԕԪԟ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[13] = NLoginCore_559.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ՘՟ՐԮ՘ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅԷըՔՈէՎՑ՜ոԶփՊՋ", (byte)27, 70);
                    NLoginCore_448.var_java_lang_String_arr_b[14] = NLoginCore_451.E("ԌԛՐԞ԰Գ՗ՍԲԯԪԔՄԏԫԖԠԻԭԫ԰ԸԠՒՒՁԽՅԶԾՀծՉԺԯԩ՜եԲԴ՘ՑեԴ՚մՕլՓՠյԼՀՀե՚՝ռժ՝նչեփՠ՞՟Ռ֓սՖիեմծ՟", (byte)27, 69);
                    NLoginCore_448.var_java_lang_String_arr_b[15] = NLoginCore_223.F("ԌԛՐԞ԰Գ՗ՍԲԯԪԔՄԏԫԖԠԻԭԫ԰ԸԠՒՒՁԽՅԶԾՀծՉԺԯԩ՜եԲԴ՘ՑեԴ՚մՕլՓՠյԼՀՀե՚՝ռժ՝նչեփՍպ֊ֈռՌՏՉխֈՑ՟", (byte)27, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_448.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ĪøģĄĲĉĔìđĒïý", (byte)27, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_448.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ՋԐԽԛՇՅԶՔՋԳԱ՜ԎԳԩ՟ԪՒՓ԰ՠՓԪԫ", (byte)27, 70);
                }
            }
        }
    }
}

