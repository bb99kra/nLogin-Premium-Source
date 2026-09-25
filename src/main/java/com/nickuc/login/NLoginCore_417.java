/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.destroystokyo.paper.profile.PlayerProfile
 *  com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  io.papermc.paper.connection.PlayerConfigurationConnection
 *  io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  org.bukkit.Location
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 */
package com.nickuc.login;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import io.papermc.paper.connection.PlayerConfigurationConnection;
import io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent;
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
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class NLoginCore_417
implements NLoginInterface_027 {
    private static long aj;
    private static int al;
    private static int aw;
    private static int t;
    private static int var_int_a;
    private static int ba;
    private static int m;
    private static int ap;
    private static int am;
    private static int u;
    private static String[] var_java_lang_String_arr_b;
    private static long av;
    private static int bb;
    private static long aa;
    private static int ah;
    private static int j;
    private static int r;
    private static long w;
    private static int p;
    private static int var_int_b;
    private static int ag;
    private static long y;
    private static int au;
    private static long h;
    private static int ax;
    private static int var_int_c;
    private static int x;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_g;
    private static long d;
    private static long as;
    private static int af;
    private static int z;
    private static int ac;
    private static int at;
    private static int ai;
    private static long s;
    private static long o;
    private final NLoginCore_447 var_com_nickuc_login_NLoginCore_447_a;
    private static long v;
    private static int bc;
    private static long l;
    private static int n;
    private static String[] var_java_lang_String_arr_a;
    private static int q;
    private static int an;
    private static long i;
    private static int k;
    private static int ar;
    private static int aq;
    private static long ak;
    private static long ay;
    private static int var_int_g;
    private static long ao;
    private static long e;
    private static long ad;
    private static int f;
    private static long ab;
    private static long ae;
    private static long var_long_c;
    private static long az;

    private static void b() {
        int n;
        var_long_c = 5746939055816841721L;
        long l = var_long_c ^ 0x8AB79F3C396621E4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(42 + 27), (byte)(40 + 43), (byte)(8 + 39), (byte)(62 + 5), 66, (byte)(40 + 27), (byte)(4 + 43), (byte)(3 + 77), (byte)(12 + 63), (byte)(55 + 12), (byte)(53 + 30), (byte)(14 + 39), (byte)(50 + 30), (byte)(61 + 36), (byte)(24 + 76), (byte)(47 + 53), (byte)(31 + 74), 110, (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_417.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ŏōĬĵŞķĲŘŮűŤŎŋōŮĹŘŞŖŚųƅŌō", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 66);
                    NLoginCore_417.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ŪŌūŀŃŰŗŢůŎŘŶŸıŠŲŕœƃƀŘŘűŶƁŵƌƂōŤůŞŽƂƉőŷŗƄŭűƘŻŨŖŘžƀƋƎŭŗƧƕŬŭ", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ӐҢҸҧҲҶҼӧҼҾӃҴ", (byte)61, 68);
                    NLoginCore_417.var_java_lang_String_arr_b[4] = NLoginCore_559.A("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[5] = NLoginCore_092.A("ŅŲŧŃŁıřŁńţŒŵŘŜƁŽŐſŒŖŚƇŐřƅƈƃŽƅƆƆƇŉƑƌŮƁƐűƑŦƄŎŖųŝŭžƏƏƤƞƞƥŬŭ", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[6] = NLoginCore_223.C("ӛӡңҾҹҩӗҨӅӛӁҩәӛӲҴӲӕӘұӳӋӕӹӉһӕӈӢҿӚӶҾӢӄӜӗӤӓӜӈӦӚӦԃӋԎԌԃӰӒԁԊӕӺӎӝԖӯԜԛԘӸԓ", (byte)61, 67);
                    NLoginCore_417.var_java_lang_String_arr_b[7] = NLoginCore_384.D("ҿҸӒӜҽӧӉҦӚӬәҴ", (byte)61, 68);
                    NLoginCore_417.var_java_lang_String_arr_b[8] = NLoginCore_427.D("ҢҲӀҺҢӨӋӣӚӦӟҬӛӢүӔӑӰӂӍҴӯӺӨүәӐӠӖӷӺҺӼӔӄӰӝӚӿӾӽӨӰӈӻԐԓӜӒӨԒӬӋԈӟӠ", (byte)61, 68);
                    NLoginCore_417.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ŏōĬĵŞķĲŘŮűŤŎŋōŮĹŘŞŖŚųƅŌō", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[10] = NLoginCore_138.E("ղթգլԭՠՅ՚ջՍԻՁ", (byte)61, 69);
                    NLoginCore_417.var_java_lang_String_arr_b[11] = NLoginCore_453.D("ҝӖҟӟҦӕҹӬӚӭӝҴ", (byte)61, 68);
                    NLoginCore_417.var_java_lang_String_arr_b[12] = NLoginCore_384.A("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[13] = NLoginCore_453.C("ҸӥӚҶҴҤӌҴҷӖӅӨӋӏӴӰӃӲӅӉӍӺӃӌӸӻӶӰӸӹӹӺҼԄӿӡӴԃӤԄәӷӁӉӦӐӠӱԂԂԗԑԑԘӟӠ", (byte)61, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_417.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ՏՍԬԵ՞ԷԲ՘ծձ՜վիՙՍՎՙ՗աՐՆՏՌՍ", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ĿťńųŒŬůňŵŭŜŁ", (byte)61, 66);
                    NLoginCore_417.var_java_lang_String_arr_b[2] = NLoginCore_138.A("ŪŌūŀŃŰŗŢůŎŘŶŸıŠŲŕœƃƀŘŘűŶƁŵƌƂōŤůŞŽƂƉőŷŗƄŭűƘŻŕƖŜƘƌƃƎšűƙƕŬŭ", (byte)61, 65);
                    NLoginCore_417.var_java_lang_String_arr_b[3] = NLoginCore_173.C("ңӝӈҵҦҥҪҿӛҸӘөӨӦӅүӔӈӓӌӢӸҿӀ", (byte)61, 67);
                    NLoginCore_417.var_java_lang_String_arr_b[4] = NLoginCore_387.F("ՐՁՑհԵԵՈԳկկՄՁ", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[5] = NLoginCore_004.F("ՅղէՃՁԱՙՁՄգՒյ՘՜ցսՐտՒՖ՚ևՐՙօֈփսօֆֆևՉ֑֌ծց֐ձ֑զք՜֓Օ՚ծնծռ֡֔րտլխ", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[6] = NLoginCore_223.F("ըծ԰ՋՆԶդԵՒըՎԶզըտՁտբեԾր՘բֆՖՈբՕկՌէփՋկՑթդձՠթՕճէճ֐՘֛֙֐ս՟֎֗ա֥րվ֢֦֫ժկք֡", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[7] = NLoginCore_138.F("ժՠՕՑՌմՏՐկՍԻՁ", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[8] = NLoginCore_559.E("ԯԿՍՇԯյ՘հէճլԹըկԼա՞սՏ՚ՁռևյԼզ՝խգքևՇ։աՑսժէ֌֋֊յռ֝վտ֔֏ր՛տ֤մկ֚թֈե֍ւ։ք֑ր", (byte)61, 69);
                    NLoginCore_417.var_java_lang_String_arr_b[9] = NLoginCore_201.B("ŏōĬĵŞķĲŘŮűťŋŝŭŜŢŶŘŞłŚƅŌō", (byte)61, 66);
                    NLoginCore_417.var_java_lang_String_arr_b[10] = NLoginCore_138.D("ӓӅҥӆӟӥһҪӊӭӡҴ", (byte)61, 68);
                    NLoginCore_417.var_java_lang_String_arr_b[11] = NLoginCore_559.B("ŐűņŎŴŨřţĹŐĳŁ", (byte)61, 66);
                    NLoginCore_417.var_java_lang_String_arr_b[12] = NLoginCore_324.F("ՇՉ՜ՂձՎչ՗ժԲպՁ", (byte)61, 70);
                    NLoginCore_417.var_java_lang_String_arr_b[13] = NLoginCore_173.D("ҸӥӚҶҴҤӌҴҷӖӅӨӋӏӴӰӃӲӅӉӍӺӃӌӸӻӶӰӸӹӹӺҼԄӿӡӴԃӤԄәӷӅԏԉӄӋӑӏԋӶԊӲӲӟӠ", (byte)61, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_417.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ըԮՒ԰Գը՘ՍմԸէոԻՍ՜ԻռիԶԻջՏՌՍ", (byte)61, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_417.var_java_lang_String_arr_b[0] = NLoginCore_138.F("԰ձլՑԭԿանլդ՚ԹնՌլ՘ՁծրյՏՃ՚շՄՠվֆցիֆգ", (byte)61, 70);
                }
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void a(AsyncPlayerSpawnLocationEvent asyncPlayerSpawnLocationEvent) {
        Object object;
        PlayerConfigurationConnection playerConfigurationConnection = asyncPlayerSpawnLocationEvent.getConnection();
        PlayerProfile playerProfile = playerConfigurationConnection.getProfile();
        if (!asyncPlayerSpawnLocationEvent.isNewPlayer() && (object = this.var_com_nickuc_login_NLoginType_008_g.com_nickuc_login_NLoginCore_187_a().a(playerProfile.getName(), playerProfile.getId(), playerConfigurationConnection.getClientAddress().getAddress())) != null && ((NLoginCore_509)object).com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g)) {
            return;
        }
        object = (Channel)SpigotReflectionUtil.getChannelFromPaperConnection((Object)playerConfigurationConnection);
        if (object == null) {
            String[] stringArray = new String[var_int_a];
            stringArray[NLoginCore_417.var_int_b] = NLoginCore_417.c("㺀", (int)var_int_c, (long)(d ^ e));
            stringArray[NLoginCore_417.f] = NLoginCore_417.c("㺃", (int)var_int_g, (long)(h ^ i));
            stringArray[NLoginCore_417.j] = (String)NLoginCore_417.c("㺆", (int)k, (long)l) + asyncPlayerSpawnLocationEvent.getClass().getSimpleName() + (String)NLoginCore_417.c("㺉", (int)(m & n), (long)o);
            stringArray[NLoginCore_417.p] = NLoginCore_417.c("㺌", (int)(q & r), (long)s);
            stringArray[NLoginCore_417.t] = NLoginCore_417.c("㺏", (int)u, (long)(v ^ w));
            playerConfigurationConnection.disconnect((Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
            return;
        }
        BukkitHelper_001 BukkitHelper_001 = (BukkitHelper_001)object.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).get();
        if (BukkitHelper_001 == null) {
            String string = (String)NLoginCore_417.c("㺒", (int)x, (long)y) + playerConfigurationConnection.getProfile().getName() + (String)NLoginCore_417.c("㺕", (int)z, (long)(aa ^ ab)) + asyncPlayerSpawnLocationEvent.getClass().getSimpleName() + (String)NLoginCore_417.c("㺘", (int)ac, (long)(ad ^ ae));
            NLoginCore_370.c(string, new Object[af]);
            String[] stringArray = new String[ag];
            stringArray[NLoginCore_417.ah] = NLoginCore_417.c("㺛", (int)ai, (long)(aj ^ ak));
            stringArray[NLoginCore_417.al] = NLoginCore_417.c("㺞", (int)(am & an), (long)ao);
            stringArray[NLoginCore_417.ap] = (String)NLoginCore_417.c("㺡", (int)(aq & ar), (long)as) + string;
            stringArray[NLoginCore_417.at] = NLoginCore_417.c("㺤", (int)au, (long)av);
            stringArray[NLoginCore_417.aw] = NLoginCore_417.c("㺧", (int)ax, (long)(ay ^ az));
            playerConfigurationConnection.disconnect((Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
            return;
        }
        Location location = asyncPlayerSpawnLocationEvent.getSpawnLocation();
        Location location2 = this.var_com_nickuc_login_NLoginCore_447_a.com_nickuc_login_NLoginCore_456_a().a(location, ba != 0);
        if (location2 != null) {
            BukkitHelper_001.var_org_bukkit_Location_a = location;
            asyncPlayerSpawnLocationEvent.setSpawnLocation(location2);
        }
    }

    @Generated
    public NLoginCore_417(NLoginType_008 NLoginType_008, NLoginCore_447 NLoginCore_4472) {
        this.var_com_nickuc_login_NLoginType_008_g = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_447_a = NLoginCore_4472;
    }

    private static String a(int n, long l) {
        l ^= 0x48L;
        l ^= 0x8AB79F3C396621E4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(59 + 10), (byte)(2 + 81), (byte)(8 + 39), (byte)(62 + 5), (byte)(26 + 40), (byte)(12 + 55), (byte)(39 + 8), (byte)(4 + 76), (byte)(67 + 8), (byte)(42 + 25), (byte)(11 + 72), (byte)(34 + 19), (byte)(6 + 74), (byte)(82 + 15), 100, (byte)(27 + 73), (byte)(28 + 77), (byte)(91 + 19), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.E("֜֩֨իֶ֧֢֥֫֫ղְְִֶ֭ոऐऊ࣮ࣿ࣡ँࣤऋऒचऋࣻࣿउ", (byte)125, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_417.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = 0x14000000 >>> 26 | 0x14000000 << -26;
        var_int_b = Integer.reverse(0);
        var_int_c = (0 >>> 134 | 0 << -134) & 0xFFFFFFFF;
        d = Long.reverse(-6946780542471994382L);
        e = Long.reverse(0x1200000000000000L);
        f = (0x20000000 >>> 125 | 0x20000000 << -125) & 0xFFFFFFFF;
        var_int_g = 0x200000 >>> 21 | 0x200000 << ~21 + 1;
        h = Long.reverse(-6946780542471994382L);
        i = Long.reverse(0x1200000000000000L);
        j = 8 >>> 34 | 8 << -34;
        k = (65536 >>> 79 | 65536 << ~79 + 1) & 0xFFFFFFFF;
        l = Long.reverse(-8243817235154697230L);
        m = (12288 >>> 76 | 12288 << -76) & 0xFFFFFFFF;
        n = -1 >>> 106 | -1 << -106;
        o = Long.reverse(-8243817235154697230L);
        p = Integer.reverse(-1073741824);
        q = Integer.reverse(0x20000000);
        r = (-1 >>> 156 | -1 << -156) & 0xFFFFFFFF;
        s = Long.reverse(-8243817235154697230L);
        t = Integer.reverse(0x20000000);
        u = Integer.reverse(-1610612736);
        v = Long.reverse(-6946780542471994382L);
        w = Long.reverse(0x1200000000000000L);
        x = 0xC00000 >>> 245 | 0xC00000 << -245;
        y = Long.reverse(-8243817235154697230L);
        z = Integer.reverse(-536870912);
        aa = Long.reverse(-6946780542471994382L);
        ab = Long.reverse(0x1200000000000000L);
        ac = 0x800000 >>> 180 | 0x800000 << ~180 + 1;
        ad = Long.reverse(-6946780542471994382L);
        ae = Long.reverse(0x1200000000000000L);
        af = Integer.reverse(0);
        ag = (327680 >>> 176 | 327680 << ~176 + 1) & 0xFFFFFFFF;
        ah = Integer.reverse(0);
        ai = 0x900000 >>> 148 | 0x900000 << ~148 + 1;
        aj = Long.reverse(-6946780542471994382L);
        ak = Long.reverse(0x1200000000000000L);
        al = (0x400000 >>> 22 | 0x400000 << -22) & 0xFFFFFFFF;
        am = Integer.reverse(0x50000000);
        an = Integer.reverse(-1);
        ao = Long.reverse(-8243817235154697230L);
        ap = (0x200000 >>> 116 | 0x200000 << -116) & 0xFFFFFFFF;
        aq = -1073741822 >>> 190 | -1073741822 << -190;
        ar = Integer.reverse(-1);
        as = Long.reverse(-8243817235154697230L);
        at = 393216 >>> 81 | 393216 << ~81 + 1;
        au = Integer.reverse(0x30000000);
        av = Long.reverse(-8243817235154697230L);
        aw = (0x800000 >>> 53 | 0x800000 << ~53 + 1) & 0xFFFFFFFF;
        ax = 1664 >>> 135 | 1664 << -135;
        ay = Long.reverse(-6946780542471994382L);
        az = Long.reverse(0x1200000000000000L);
        ba = (0 >>> 56 | 0 << ~56 + 1) & 0xFFFFFFFF;
        bb = Integer.reverse(0x70000000);
        bc = (112 >>> 131 | 112 << ~131 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[bb];
        var_java_lang_String_arr_b = new String[bc];
        NLoginCore_417.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_417.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.E("ӱԓԕӵԙԸ԰ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)13, 69), NLoginCore_417.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("пьыЎюъхюљшЕѓїѐѓљЛ޳ޭޢބޑޤއޮ޵޽ޮޞޢެе", (byte)13, 67) + string + NLoginCore_027.F("ԃ", (byte)13, 70) + methodType.toString(), exception);
        }
    }
}

