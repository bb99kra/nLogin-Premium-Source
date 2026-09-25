/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.destroystokyo.paper.profile.PlayerProfile
 *  com.destroystokyo.paper.profile.ProfileProperty
 *  lombok.Generated
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent$Result
 */
package com.nickuc.login;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_454;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class NLoginCore_290
implements NLoginInterface_027 {
    private static int o;
    private static int e;
    private static long k;
    private static int n;
    private static long d;
    private static int g;
    public static final boolean r;
    private static int f;
    private static int var_int_a;
    private static long c;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_j;
    private static long var_long_b;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_j;
    private static String[] var_java_lang_String_arr_a;
    private static final String var_java_lang_String_m;
    private static int var_int_m;
    private static long i;
    private static long h;
    private static long l;

    static {
        var_int_a = (0 >>> 253 | 0 << -253) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-5002149641758738106L);
        d = Long.reverse(Long.MIN_VALUE);
        e = Integer.reverse(-1073741824);
        f = (3 >>> 64 | 3 << -64) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-5002149641758738106L);
        i = Long.reverse(Long.MIN_VALUE);
        var_int_j = 8192 >>> 204 | 8192 << -204;
        k = Long.reverse(-5002149641758738106L);
        l = Long.reverse(Long.MIN_VALUE);
        var_int_m = (0 >>> 171 | 0 << -171) & 0xFFFFFFFF;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 0 >>> 162 | 0 << ~162 + 1;
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_290.b();
        var_java_lang_String_m = NLoginCore_290.c("㺀", (int)g, (long)(h ^ i));
        r = NLoginCore_546.a(AsyncPlayerPreLoginEvent.class, (String)NLoginCore_290.c("㺃", (int)var_int_j, (long)(k ^ l)), new Class[var_int_m]) != null ? n : o;
    }

    private static String a(int n, long l) {
        l ^= 1L;
        l ^= 0xCF084F3D921249F2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(10 + 59), (byte)(55 + 28), 47, (byte)(7 + 60), (byte)(29 + 37), (byte)(54 + 13), (byte)(12 + 35), (byte)(50 + 30), (byte)(4 + 71), (byte)(8 + 59), (byte)(72 + 11), (byte)(33 + 20), (byte)(51 + 29), (byte)(24 + 73), (byte)(31 + 69), (byte)(49 + 51), (byte)(49 + 56), (byte)(75 + 35), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲԌәԁӹӨӻԐԏԊԃԗԄԅԕ", (byte)90, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_290.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_290.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.E("ՉիխՍձ֐ֈ֞֊ՙ֗֍֛֕՞փ֥֤֢֜֜ձ", (byte)101, 69), NLoginCore_290.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.F("ք֑֐Փ֓֏֊֓֞֍՚֘֜֕֘֞ՠࣺࣇࣱ࣯ࣩࣧࣖࣾࣽࣸअࣲࣳःպ", (byte)101, 70) + string + NLoginCore_201.F("՛", (byte)101, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_290(nLoginBukkit nLoginBukkit2) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_j = nLoginBukkit2;
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void b(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        InetAddress inetAddress;
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        InetAddress inetAddress2 = asyncPlayerPreLoginEvent.getAddress();
        try {
            inetAddress = asyncPlayerPreLoginEvent.getRawAddress();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            inetAddress = null;
        }
        BukkitHelper_001 BukkitHelper_001 = BukkitHelper_001.a(asyncPlayerPreLoginEvent.getName(), inetAddress2, inetAddress);
        if (BukkitHelper_001 == null) {
            return;
        }
        UUID uUID = BukkitHelper_001.var_java_util_UUID_c;
        NLoginCore_454 NLoginCore_4542 = BukkitHelper_001.var_com_nickuc_login_NLoginCore_454_a;
        if (uUID != null || NLoginCore_4542 != null) {
            PlayerProfile playerProfile = asyncPlayerPreLoginEvent.getPlayerProfile();
            if (uUID != null) {
                playerProfile.setId(uUID);
            }
            if (NLoginCore_4542 != null) {
                playerProfile.setProperty(new ProfileProperty((String)NLoginCore_290.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), NLoginCore_4542.ce, NLoginCore_4542.cf));
            }
        }
    }

    private static void b() {
        int n;
        c = 7106391602650884445L;
        long l = c ^ 0xCF084F3D921249F2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(18 + 51), (byte)(28 + 55), (byte)(21 + 26), (byte)(54 + 13), (byte)(6 + 60), (byte)(59 + 8), (byte)(13 + 34), (byte)(20 + 60), (byte)(50 + 25), (byte)(26 + 41), (byte)(53 + 30), (byte)(15 + 38), (byte)(64 + 16), (byte)(38 + 59), (byte)(39 + 61), (byte)(16 + 84), 105, 110, (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_290.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ԯ՞ՒձծզմմիՇճբճՖճԶՖռՙ՟ււՉՊ", (byte)58, 70);
                    NLoginCore_290.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ҜӋҿӞӛӓӡӡӘҴӠӏӠӃӠңӃөӆӌӯӯҶҷ", (byte)58, 67);
                    NLoginCore_290.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ŖŝňōŨıĽšŝĵŬŗŏœńţļŰķūŖŷŔſłŐŅſŠŁŖŅ", (byte)58, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_290.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ԯ՞ՒձծզմմիՇճՋռյԯՐՙԼ՞ՒՍ՜ՉՊ", (byte)58, 69);
                    NLoginCore_290.var_java_lang_String_arr_b[1] = NLoginCore_384.F("ԯ՞ՒձծզմմիՇմպչղԯՇԽՎԸպձՌՉՊ", (byte)58, 70);
                    NLoginCore_290.var_java_lang_String_arr_b[2] = NLoginCore_091.A("ŖŝňōŨıĽšŝĵŬŗŏœńţļŰķūŖźōĵœŏĸŐőŇŨŸ", (byte)58, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_290.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ĞŜĩşĦŤŮŎńĬŅŪŴıŭōŉŸśŐŜſņŇ", (byte)58, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_290.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ŚŚĩśūħņŞŊŋŴűįōņŋŔśŴŰűřņŇ", (byte)58, 66);
                }
            }
        }
    }
}

