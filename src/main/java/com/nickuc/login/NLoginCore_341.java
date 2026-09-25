/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Location
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.spigotmc.event.player.PlayerSpawnLocationEvent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_157;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

public class NLoginCore_341
implements NLoginInterface_027 {
    private static long ac;
    private static int k;
    private static long ad;
    private final NLoginCore_447 var_com_nickuc_login_NLoginCore_447_b;
    private static int af;
    private static long v;
    private static int h;
    private static int ae;
    private static int w;
    private static long u;
    private static int s;
    private static int ab;
    private static int p;
    private static int y;
    private static int aa;
    private static int j;
    private static int m;
    private static int ag;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_l;
    private static int var_int_l;
    private static int x;
    private static long g;
    private static int o;
    private static long i;
    private static long d;
    private static int q;
    private static int e;
    private static long c;
    private static long r;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_b;
    private static int var_int_a;
    private static long f;
    private static int t;
    private static long z;
    private static long n;
    private static String[] var_java_lang_String_arr_b;

    private static String a(int n, long l) {
        l ^= 0x60L;
        l ^= 0xC06FAD32F254204BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(63 + 6), (byte)(54 + 29), (byte)(10 + 37), (byte)(5 + 62), (byte)(32 + 34), (byte)(39 + 28), (byte)(16 + 31), 80, (byte)(52 + 23), (byte)(60 + 7), (byte)(28 + 55), (byte)(45 + 8), (byte)(19 + 61), (byte)(48 + 49), (byte)(30 + 70), (byte)(38 + 62), 105, (byte)(69 + 41), (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.B("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҭҩҸҦґҊӁҬҚҞҳҴӆҥ", (byte)49, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_341.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 1944191142975503419L;
        long l = c ^ 0xC06FAD32F254204BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(17 + 52), (byte)(14 + 69), (byte)(31 + 16), (byte)(6 + 61), (byte)(27 + 39), (byte)(53 + 14), (byte)(16 + 31), (byte)(41 + 39), (byte)(12 + 63), (byte)(45 + 22), 83, (byte)(3 + 50), (byte)(44 + 36), 97, (byte)(76 + 24), (byte)(17 + 83), (byte)(70 + 35), (byte)(43 + 67), (byte)(36 + 67)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_341.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ԸԼԥԃԼԬԊԻԝՉՄՂՇԦԞԎՈՃՌՔՓՓԴՋՒԸԼՙՒաԯԸԦԾԼզԝգ՗Հԥ՚ըՀԪԲմՔՉ՘կՌԵԵժՌՙՙ՗յձսՖվ", (byte)18, 69);
                    NLoginCore_341.var_java_lang_String_arr_b[1] = NLoginCore_384.E("ԙԈԹԀՁԽԾԤԽԹԭԖ", (byte)18, 69);
                    NLoginCore_341.var_java_lang_String_arr_b[2] = NLoginCore_138.B("ėÚĜĖÚĂęğßóĆáăĘĜõĂĭďíčĜāĲĂĠþĕñĬĻĄĥĜĹýĿċĶĿēģĂĹĳĞķĞŀĜĥŐıĩĖė", (byte)18, 66);
                    NLoginCore_341.var_java_lang_String_arr_b[3] = NLoginCore_384.E("ԲԕԔԻԿՅՋԹԧԎՃԼԿՆՇԏԩԸԑԪՌ՚ԡԢ", (byte)18, 69);
                    NLoginCore_341.var_java_lang_String_arr_b[4] = NLoginCore_453.E("ԣԕՃԠԊՈԩԍԭԣԭԖ", (byte)18, 69);
                    NLoginCore_341.var_java_lang_String_arr_b[5] = NLoginCore_223.D("нѐПгчрЩУѨћХг", (byte)18, 68);
                    NLoginCore_341.var_java_lang_String_arr_b[6] = NLoginCore_138.D("рвѠнЧѥцЪъръг", (byte)18, 68);
                    NLoginCore_341.var_java_lang_String_arr_b[7] = NLoginCore_091.B("éĝğĜĚáċĕäòąúĕĩĝĀâīċĊĠðĩğģĒĕēĶĊĻĳĶöûČıĽŀĶýĺńĲġĕĝĕŀĥčĞĦĿĖė", (byte)18, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_341.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ԸԼԥԃԼԬԊԻԝՉՄՂՇԦԞԎՈՃՌՔՓՓԴՋՒԸԼՙՒաԯԸԦԾԼզԝգ՗Հԥ՚ըՀԪԲմՔՉ՘կՌԵռԹՏԵիաՠՑ՚ոց", (byte)18, 69);
                    NLoginCore_341.var_java_lang_String_arr_b[1] = NLoginCore_091.B("æĆđĉċÝîÛĜïĘë", (byte)18, 66);
                    NLoginCore_341.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ėÚĜĖÚĂęğßóĆáăĘĜõĂĭďíčĜāĲĂĠþĕñĬĻĄĥĜĹýĿċĶĿēģĄĽĂĒĹĢĆŀĬģĠňĒīħĐİĲłŚħĔ", (byte)18, 66);
                    NLoginCore_341.var_java_lang_String_arr_b[3] = NLoginCore_027.B("ćêéĐĔĚĠĎüãěãāúèĥęøÿûëğö÷", (byte)18, 66);
                    NLoginCore_341.var_java_lang_String_arr_b[4] = NLoginCore_324.D("нпюйѠШіјхФтг", (byte)18, 68);
                    NLoginCore_341.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ĔėěĠĚøĠúþďĐë", (byte)18, 66);
                    NLoginCore_341.var_java_lang_String_arr_b[6] = NLoginCore_446.A("ûđđçđíĚûïďĘë", (byte)18, 65);
                    NLoginCore_341.var_java_lang_String_arr_b[7] = NLoginCore_091.A("éĝğĜĚáċĕäòąúĕĩĝĀâīċĊĠðĩğģĒĕēĶĊĻĳĶöûČıĽŀĶýĺŇĽĴķĝĞħĉħŁĆŏĖė", (byte)18, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_341.var_java_lang_String_arr_b[0] = NLoginCore_110.A("Đĝĉĝ÷öûíČğğÙàĝćĄěĚģøİįö÷", (byte)18, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_341.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ěÕÝğàÛĢĠíėĜë", (byte)18, 65);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_341.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.D("ԘԺԼԜՀ՟՗խՙԨզ՜ժդԭՒմճիձիՀ", (byte)105, 68), NLoginCore_341.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԝԙԨԖԁӺԱԜԊԎԣԤԶԕƪ", (byte)105, 65) + string + NLoginCore_091.A("Ƌ", (byte)105, 65) + methodType.toString(), exception);
        }
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void a(PlayerSpawnLocationEvent playerSpawnLocationEvent) {
        InetAddress inetAddress;
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_bukkit_nLoginBukkit_l.java_lang_Object_b().a(playerSpawnLocationEvent.getPlayer());
        String string = NLoginCore_277.getName();
        BukkitHelper_001 BukkitHelper_001 = BukkitHelper_001.a(string, inetAddress = (InetAddress)Optional.ofNullable(NLoginCore_277.java_net_InetSocketAddress_a()).map(InetSocketAddress::getAddress).orElse(null), null);
        if (BukkitHelper_001 == null) {
            String string2 = (String)NLoginCore_341.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + string + (String)NLoginCore_341.c("㺃", (int)e, (long)(f ^ g)) + playerSpawnLocationEvent.getClass().getSimpleName() + (String)NLoginCore_341.c("㺆", (int)h, (long)i);
            NLoginCore_370.c(string2, new Object[j]);
            String[] stringArray = new String[k];
            stringArray[NLoginCore_341.var_int_l] = NLoginCore_341.c("㺉", (int)m, (long)n);
            stringArray[NLoginCore_341.o] = NLoginCore_341.c("㺌", (int)(p & q), (long)r);
            stringArray[NLoginCore_341.s] = (String)NLoginCore_341.c("㺏", (int)t, (long)(u ^ v)) + string2;
            stringArray[NLoginCore_341.w] = NLoginCore_341.c("㺒", (int)(x & y), (long)z);
            stringArray[NLoginCore_341.aa] = NLoginCore_341.c("㺕", (int)ab, (long)(ac ^ ad));
            NLoginCore_277.a(NLoginCore_112.a(stringArray));
            return;
        }
        Location location = playerSpawnLocationEvent.getSpawnLocation();
        Location location2 = this.var_com_nickuc_login_NLoginCore_447_b.com_nickuc_login_NLoginCore_456_a().a(location, ae != 0);
        if (location2 != null) {
            if (NLoginCore_157.var_boolean_p) {
                BukkitHelper_001.var_org_bukkit_Location_a = location;
            } else {
                this.var_com_nickuc_login_bukkit_nLoginBukkit_l.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_NLoginCore_510_a().b(location);
            }
            playerSpawnLocationEvent.setSpawnLocation(location2);
        }
    }

    @Generated
    public NLoginCore_341(nLoginBukkit nLoginBukkit2, NLoginCore_447 NLoginCore_4472) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_l = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_447_b = NLoginCore_4472;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-2576128063588475048L);
        d = Long.reverse(0x600000000000000L);
        e = 64 >>> 134 | 64 << -134;
        f = Long.reverse(-2576128063588475048L);
        g = Long.reverse(0x600000000000000L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-2720243251664330920L);
        j = Integer.reverse(0);
        k = Integer.reverse(-1610612736);
        var_int_l = Integer.reverse(0);
        m = 196608 >>> 240 | 196608 << ~240 + 1;
        n = Long.reverse(-2720243251664330920L);
        o = 8192 >>> 205 | 8192 << -205;
        p = Integer.reverse(0x20000000);
        q = Integer.reverse(-1);
        r = Long.reverse(-2720243251664330920L);
        s = (8 >>> 226 | 8 << -226) & 0xFFFFFFFF;
        t = Integer.reverse(-1610612736);
        u = Long.reverse(-2576128063588475048L);
        v = Long.reverse(0x600000000000000L);
        w = Integer.reverse(-1073741824);
        x = (786432 >>> 145 | 786432 << -145) & 0xFFFFFFFF;
        y = (-1 >>> 135 | -1 << -135) & 0xFFFFFFFF;
        z = Long.reverse(-2720243251664330920L);
        aa = (0x100000 >>> 114 | 0x100000 << ~114 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(-536870912);
        ac = Long.reverse(-2576128063588475048L);
        ad = Long.reverse(0x600000000000000L);
        ae = (0 >>> 0 | 0 << -0) & 0xFFFFFFFF;
        af = Integer.reverse(0x10000000);
        ag = Integer.reverse(0x10000000);
        var_java_lang_String_arr_a = new String[af];
        var_java_lang_String_arr_b = new String[ag];
        NLoginCore_341.b();
    }
}

