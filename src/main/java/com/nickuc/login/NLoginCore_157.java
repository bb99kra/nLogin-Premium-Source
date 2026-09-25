/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerLoginEvent
 *  org.bukkit.event.player.PlayerLoginEvent$Result
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.NLoginCore_409;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_209;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;

public class NLoginCore_157
implements NLoginInterface_027 {
    private static int k;
    private static int ae;
    public static final boolean var_boolean_p;
    private static int e;
    private static long r;
    private static long var_long_g;
    private static int ak;
    private static long v;
    private static int af;
    private static int ai;
    private static long var_long_c;
    private static long ah;
    private static int x;
    private final boolean var_boolean_q;
    private static long u;
    private static long ag;
    private static int var_int_b;
    private static int ab;
    private static String[] var_java_lang_String_arr_a;
    private static int j;
    private static long var_long_q;
    private static int w;
    private static int var_int_a;
    private static long var_long_i;
    private static int h;
    private static int aj;
    private static int l;
    private static long n;
    private static int o;
    private static int z;
    private static long y;
    private static int t;
    private static int var_int_p;
    private static int ad;
    private static int aa;
    private static int m;
    private final NLoginCore_209 var_com_nickuc_login_NLoginCore_209_g;
    private static String[] var_java_lang_String_arr_b;
    private static int s;
    private static int f;
    private static long d;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_i;
    private static long ac;
    private static int var_int_c;

    @EventHandler(priority=EventPriority.HIGHEST)
    public void b(PlayerLoginEvent playerLoginEvent) {
        InetAddress inetAddress;
        if (playerLoginEvent.getResult() != PlayerLoginEvent.Result.ALLOWED) {
            return;
        }
        Player player = playerLoginEvent.getPlayer();
        if (this.var_com_nickuc_login_NLoginCore_209_g.c(player)) {
            return;
        }
        try {
            inetAddress = playerLoginEvent.getRealAddress();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            inetAddress = null;
        }
        BukkitHelper_001 BukkitHelper_001 = BukkitHelper_001.a(player.getName(), playerLoginEvent.getAddress(), inetAddress);
        if (BukkitHelper_001 == null) {
            String string = (String)NLoginCore_157.c("㺀", (int)(var_int_b & var_int_c), (long)d) + player.getName() + (String)NLoginCore_157.c("㺃", (int)(e & f), (long)var_long_g) + playerLoginEvent.getClass().getSimpleName() + (String)NLoginCore_157.c("㺆", (int)h, (long)var_long_i);
            NLoginCore_370.c(string, new Object[j]);
            String[] stringArray = new String[k];
            stringArray[NLoginCore_157.l] = NLoginCore_157.c("㺉", (int)m, (long)n);
            stringArray[NLoginCore_157.o] = NLoginCore_157.c("㺌", (int)var_int_p, (long)(var_long_q ^ r));
            stringArray[NLoginCore_157.s] = (String)NLoginCore_157.c("㺏", (int)t, (long)(u ^ v)) + string;
            stringArray[NLoginCore_157.w] = NLoginCore_157.c("㺒", (int)x, (long)y);
            stringArray[NLoginCore_157.z] = NLoginCore_157.c("㺕", (int)(aa & ab), (long)ac);
            playerLoginEvent.disallow(PlayerLoginEvent.Result.KICK_OTHER, NLoginCore_112.a(stringArray));
            return;
        }
        String string = this.var_com_nickuc_login_NLoginCore_209_g.a(this.var_com_nickuc_login_bukkit_nLoginBukkit_i.com_nickuc_login_NLoginType_008_a().java_lang_Object_b().a(player), BukkitHelper_001);
        if (string != null) {
            playerLoginEvent.disallow(PlayerLoginEvent.Result.KICK_OTHER, string);
        }
    }

    @Generated
    public NLoginCore_157(nLoginBukkit nLoginBukkit2, NLoginCore_209 NLoginCore_2092, boolean bl) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_i = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_209_g = NLoginCore_2092;
        this.var_boolean_q = bl;
    }

    private static void b() {
        int n;
        var_long_c = 317569399131258003L;
        long l = var_long_c ^ 0x3F949CBA9DED7ECBL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(4 + 65), (byte)(28 + 55), (byte)(7 + 40), (byte)(58 + 9), (byte)(32 + 34), (byte)(29 + 38), 47, (byte)(76 + 4), (byte)(12 + 63), (byte)(4 + 63), (byte)(13 + 70), (byte)(43 + 10), (byte)(29 + 51), (byte)(18 + 79), (byte)(79 + 21), (byte)(76 + 24), (byte)(34 + 71), 110, (byte)(97 + 6)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_157.var_java_lang_String_arr_b[0] = NLoginCore_446.F("֎ղւ֎֧փַֹ֎֜֝֞ո֐ְֱֺּ֥֧֤֜֗֓֡ֆ֨֊ְֿ׆׆֧׆֬׎׋ֲבֲׇ֪ׄ֨זְנמטֱע֮חףטנִ־כ׃׭׀ּֽ", (byte)126, 70);
                    NLoginCore_157.var_java_lang_String_arr_b[1] = NLoginCore_027.E("ֱֲ֖֧֟֒ի֎ֵ֬։ւ", (byte)126, 69);
                    NLoginCore_157.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ս֡փְ֭֡կַ֙։֒֋ֻ֝֡֓րրִ־ָ֗ք֗׃֪փ׏֙ֈևְ֥׌֋ִהבךֲכֹ֤׉ֱֹ֪֯׏יׁ֠דצ֭֮", (byte)126, 69);
                    NLoginCore_157.var_java_lang_String_arr_b[3] = NLoginCore_451.C("֠֒ջ֡ի֣֮֬֙սհ֍ղֱ֪թְֶ֎ֶ֑֫ւփ", (byte)126, 67);
                    NLoginCore_157.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ǔǐǷǖǈǗǍǭƴƯǎǃ", (byte)126, 66);
                    NLoginCore_157.var_java_lang_String_arr_b[5] = NLoginCore_324.C("րր֪֟էև֣կ֌էվշ", (byte)126, 67);
                    NLoginCore_157.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ǔǐǷǖǈǗǍǭƴƯǎǃ", (byte)126, 66);
                    NLoginCore_157.var_java_lang_String_arr_b[7] = NLoginCore_223.C("֞֠մէյ֠ւ֬ոֆ֋ֳ֮տ֒֯ղ֨քմֳִջְֶֶֺ֑֚֘֗֬րֺֺ֖֧֚֬ׄև׍֣׆֑֦֡הַָ֥׋ְ֥֢֣", (byte)126, 67);
                    NLoginCore_157.var_java_lang_String_arr_b[8] = NLoginCore_575.A("ǧǆƿǯǩǲǤǙǛǏǼǛǪǉȃǛǍǜǵǅȁȇǢǃȍƿȏǏǤȇǒǿǑǥǱȔǲȈǘǸǽȇȍǬȌȟȑǞǻǡȕȤǻǺȩǻǹȭȘȮǿǭȤȪȡǲȯȀǯȈȢȭȷȰȒȷȒǽȕȓȽȽǽɅɃȡȎȏ", (byte)126, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_157.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǏƳǃǏǨǄǸǺǏǝǞǟƹǑǽǱǲǦǝǘǔǢǻǨǥǇǩǋȀǱȇȇǨȇǭȏȌǳȒȅǫȈǩǳȗǱȡȟșǲȣǯȘȥȉȄǤǧȢȄȇȠǲȓ", (byte)126, 66);
                    NLoginCore_157.var_java_lang_String_arr_b[1] = NLoginCore_384.C("ֆճ֞ջ֡ջտ֥֏ջպշ", (byte)126, 67);
                    NLoginCore_157.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ƾǢǄǢǱǮưǸǚǊǓǌǼǞǢǔǁǁǵǿǹǘǅǘȄǫǄȐǚǉǈǱǦȍǌǵȕȒțǳȜǥǺȎǰȉǫȒǲǥȓǿȘȡǺǸǤȇǠȈǰȎȈȎ", (byte)126, 65);
                    NLoginCore_157.var_java_lang_String_arr_b[3] = NLoginCore_201.E("֫֝ֆ֬նַֹ֤֮ֈջ֐ֻּ֢֕֓֒֞֏֏֐֍֎", (byte)126, 69);
                    NLoginCore_157.var_java_lang_String_arr_b[4] = NLoginCore_451.F("ֱևտֲ֎շ֌֓֨֙ռւ", (byte)126, 70);
                    NLoginCore_157.var_java_lang_String_arr_b[5] = NLoginCore_091.B("ǒǰǈƶǅǱǗǔǏƷǨǃ", (byte)126, 66);
                    NLoginCore_157.var_java_lang_String_arr_b[6] = NLoginCore_446.D("֞ֆ֭֩֜զթְ֐֤֙շ", (byte)126, 68);
                    NLoginCore_157.var_java_lang_String_arr_b[7] = NLoginCore_223.A("ǪǬǀƳǁǬǎǸǄǒǗǿǺǋǞǻƾǴǐǀǿȀǇǤǼǣȂǦǸȆǝȂǌȆǦǢǸȆǳȐǓșǰǿǱǬȌȀǴȥǠǞȥȁǮǯ", (byte)126, 65);
                    NLoginCore_157.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ǧǆƿǯǩǲǤǙǛǏǼǛǪǉȃǛǍǜǵǅȁȇǢǃȍƿȏǏǤȇǒǿǑǥǱȔǲȈǘǸǽȇȍǬȌȟȑǞǻǡȕȤǻǺȩǻǹȭȘȮǿǭȤȪȡǲȯȀǯȈȢȭȷȰȔȏȳȫɀȫȘȿǽȣȜɇȎȏ", (byte)126, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_157.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ǕǮǰƩǙǖǭƭǬǔƽǨƾǫǸƺǣȅǚƽǔǡǎǏ", (byte)126, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_157.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ƲǈƳǩǮǺǶǫǮƼǱǭǨǻǐǘǝȂǯǇƿǑǎǏ", (byte)126, 65);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_157.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.B("ƟǁǃƣǇǦǞǴǠƯǭǣǱǫƴǙǻǺǲǸǲǇ", (byte)124, 66), NLoginCore_157.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣱࣺࣻࣤआࣽआइࣷ࣫ࣸईऎց", (byte)124, 67) + string + NLoginCore_091.D("գ", (byte)124, 68) + methodType.toString(), exception);
        }
    }

    @EventHandler(priority=EventPriority.LOW)
    public void a(PlayerLoginEvent playerLoginEvent) {
        if (this.var_boolean_q) {
            return;
        }
        if (playerLoginEvent.getResult() != PlayerLoginEvent.Result.ALLOWED) {
            return;
        }
        Player player = playerLoginEvent.getPlayer();
        if (this.var_com_nickuc_login_NLoginCore_209_g.c(player)) {
            return;
        }
        Player player2 = Bukkit.getServer().getPlayerExact(player.getName());
        if (player2 == null) {
            player2 = Bukkit.getServer().getPlayer(player.getUniqueId());
        }
        if (player2 != null && player2.isOnline()) {
            String string = NLoginCore_150.a(NLoginCore_374.Y, new Object[var_int_a]);
            playerLoginEvent.disallow(PlayerLoginEvent.Result.KICK_OTHER, string);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x24L;
        l ^= 0x3F949CBA9DED7ECBL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(48 + 21), (byte)(68 + 15), 47, (byte)(33 + 34), (byte)(7 + 59), 67, (byte)(43 + 4), (byte)(40 + 40), (byte)(42 + 33), (byte)(23 + 44), (byte)(70 + 13), (byte)(20 + 33), (byte)(39 + 41), (byte)(58 + 39), (byte)(96 + 4), (byte)(59 + 41), (byte)(78 + 27), (byte)(16 + 94), (byte)(26 + 77)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.C("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߹߯ߢ߸ࠄ߻ࠄࠅߵߩ߶ࠆࠌ", (byte)38, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_157.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        var_int_c = -1 >>> 78 | -1 << ~78 + 1;
        d = Long.reverse(-1351920628229466592L);
        e = 65536 >>> 176 | 65536 << -176;
        f = -1 >>> 201 | -1 << -201;
        var_long_g = Long.reverse(-1351920628229466592L);
        h = Integer.reverse(0x40000000);
        var_long_i = Long.reverse(-1351920628229466592L);
        j = Integer.reverse(0);
        k = Integer.reverse(-1610612736);
        l = Integer.reverse(0);
        m = 3072 >>> 106 | 3072 << -106;
        n = Long.reverse(-1351920628229466592L);
        o = Integer.reverse(Integer.MIN_VALUE);
        var_int_p = Integer.reverse(0x20000000);
        var_long_q = Long.reverse(-3945994013594872288L);
        r = Long.reverse(0x2400000000000000L);
        s = Integer.reverse(0x40000000);
        t = 0x40000001 >>> 222 | 0x40000001 << ~222 + 1;
        u = Long.reverse(-3945994013594872288L);
        v = Long.reverse(0x2400000000000000L);
        w = Integer.reverse(-1073741824);
        x = 49152 >>> 109 | 49152 << ~109 + 1;
        y = Long.reverse(-1351920628229466592L);
        z = Integer.reverse(0x20000000);
        aa = Integer.reverse(-536870912);
        ab = Integer.reverse(-1);
        ac = Long.reverse(-1351920628229466592L);
        ad = 0x2400000 >>> 214 | 0x2400000 << -214;
        ae = 0x48000000 >>> 59 | 0x48000000 << -59;
        af = 0x100000 >>> 177 | 0x100000 << ~177 + 1;
        ag = Long.reverse(-3945994013594872288L);
        ah = Long.reverse(0x2400000000000000L);
        ai = 0 >>> 116 | 0 << -116;
        aj = 65536 >>> 208 | 65536 << -208;
        ak = 0 >>> 32 | 0 << ~32 + 1;
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_157.b();
        var_boolean_p = NLoginCore_409.a().a(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_b) && NLoginCore_298.a((String)NLoginCore_157.c("㺀", (int)af, (long)(ag ^ ah)), new String[ai]) ? aj : ak;
    }
}

