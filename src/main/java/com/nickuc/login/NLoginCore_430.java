/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class NLoginCore_430 {
    private static int f;
    private static int q;
    private static int i;
    private static int e;
    private static int x;
    private static int var_int_b;
    private static long c;
    private static long d;
    private static long m;
    private static final boolean var_boolean_k;
    private static int var_int_a;
    private static int t;
    private static int p;
    private static long r;
    private static long j;
    private static long var_long_k;
    private static int v;
    private static int w;
    private static int n;
    private static int l;
    private static int h;
    private static int u;
    private static long s;
    private static int o;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static long g;

    private static void a(Plugin plugin, Player player, Player player2) {
        if (var_boolean_k) {
            player.hidePlayer(plugin, player2);
        } else {
            player.hidePlayer(player2);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_430.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 65), NLoginCore_430.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.E("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢣࡽࢴࢧࢨࢲࢣࢷࢭࢩԭ", (byte)28, 69) + string + NLoginCore_451.A("ñ", (byte)28, 65) + methodType.toString(), exception);
        }
    }

    private static void b(Plugin plugin, Player player, Player player2) {
        if (var_boolean_k) {
            player.showPlayer(plugin, player2);
        } else {
            player.showPlayer(player2);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = (-1 >>> 84 | -1 << -84) & 0xFFFFFFFF;
        d = Long.reverse(-4017994531919259281L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(-1);
        g = Long.reverse(-4017994531919259281L);
        h = (0 >>> 198 | 0 << ~198 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-3873879343843403409L);
        var_long_k = Long.reverse(0x200000000000000L);
        l = 384 >>> 103 | 384 << -103;
        m = Long.reverse(-4017994531919259281L);
        n = 0 >>> 51 | 0 << ~51 + 1;
        o = 163840 >>> 175 | 163840 << ~175 + 1;
        p = Integer.reverse(-1610612736);
        q = (0x10000000 >>> 58 | 0x10000000 << ~58 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-3873879343843403409L);
        s = Long.reverse(0x200000000000000L);
        t = 0x800000 >>> 182 | 0x800000 << ~182 + 1;
        u = (0 >>> 153 | 0 << -153) & 0xFFFFFFFF;
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 0x200000 >>> 181 | 0x200000 << -181;
        x = (0 >>> 90 | 0 << -90) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[o];
        var_java_lang_String_arr_b = new String[p];
        NLoginCore_430.b();
        Class[] classArray = new Class[t];
        classArray[NLoginCore_430.u] = Plugin.class;
        classArray[NLoginCore_430.v] = Player.class;
        var_boolean_k = NLoginCore_546.a(Player.class, (String)NLoginCore_430.c("㺀", (int)q, (long)(r ^ s)), classArray) != null ? w : x;
    }

    public static void b(nLoginBukkit nLoginBukkit2, Player player) {
        try {
            NLoginCore_187 NLoginCore_1872 = nLoginBukkit2.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a();
            BukkitLoader bukkitLoader = nLoginBukkit2.com_nickuc_login_loader_platform_BukkitLoader_a();
            for (NLoginCore_277 NLoginCore_277 : nLoginBukkit2.java_lang_Object_b().c()) {
                if (NLoginCore_277.S() || !NLoginCore_1872.boolean_b(NLoginCore_277)) continue;
                Player player2 = (Player)NLoginCore_277.c();
                NLoginCore_430.b((Plugin)bukkitLoader, player2, player);
                NLoginCore_430.b((Plugin)bukkitLoader, player, player2);
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_430.c("㺀", (int)i, (long)(j ^ var_long_k)) + player.getName() + (String)NLoginCore_430.c("㺃", (int)l, (long)m), exception, new Object[n]);
        }
    }

    private static void b() {
        int n;
        c = -677300299753538477L;
        long l = c ^ 0x8FED73998EBBBAB5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(44 + 25), (byte)(77 + 6), (byte)(42 + 5), (byte)(54 + 13), (byte)(39 + 27), 67, (byte)(36 + 11), 80, (byte)(73 + 2), (byte)(34 + 33), (byte)(19 + 64), (byte)(15 + 38), (byte)(7 + 73), (byte)(36 + 61), (byte)(67 + 33), (byte)(6 + 94), (byte)(70 + 35), (byte)(101 + 9), (byte)(79 + 24)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_430.var_java_lang_String_arr_b[0] = NLoginCore_324.E("նպս֥֙ֆ֋չ֗շ֣ոքսռ֥֓֟֕ֈֵ֩ղֳֽ֩չִֺ֟֌֎֎ְոׇ֑֯ց֢ׅ׀֚֓", (byte)111, 69);
                    NLoginCore_430.var_java_lang_String_arr_b[1] = NLoginCore_091.F("շ֦֜էգ֞֨նև֢րր֟քցլժյ֗֐ֳַվտ", (byte)111, 70);
                    NLoginCore_430.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ƨƬƯǗǋƸƽƫǉƩǕƪƶƯƮǅǑǗǇƺǧǨǠǣǢǨǬǜƫƬǬưǳǳǧǅǩǓƳǛƶǧǶǅ", (byte)111, 65);
                    NLoginCore_430.var_java_lang_String_arr_b[3] = NLoginCore_201.F("շ֦֜էգ֞֨նև֢րր֟քցլժյ֗֐ֳַվտ", (byte)111, 70);
                    NLoginCore_430.var_java_lang_String_arr_b[4] = NLoginCore_027.F("՟֤֜և֔ռ֩րտէ֤֬։ֲ֯֨֯էִհָ֑վտ", (byte)111, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_430.var_java_lang_String_arr_b[0] = NLoginCore_027.F("նպս֥֙ֆ֋չ֗շ֣ոքսռ֥֓֟֕ֈֵ֩ղֳֽ֩չִֺ֟֌֎տ֭׀֥֒քֺֻׂ׆ּ֓", (byte)111, 70);
                    NLoginCore_430.var_java_lang_String_arr_b[1] = NLoginCore_575.B("ƩǎǘƙƕǐǚƨƹǔưƽǜǂƲǙǚǤƶƸƧǩưƱ", (byte)111, 66);
                    NLoginCore_430.var_java_lang_String_arr_b[2] = NLoginCore_201.D("ՍՑՔռհ՝բՐծՎպՏ՛ՔՓժնռլ՟֌֍օֈև֍֑ցՐՑ֑ՕՒդ֑է֋՚ռպհւ՜ժ", (byte)111, 68);
                    NLoginCore_430.var_java_lang_String_arr_b[3] = NLoginCore_201.B("ƩǎǘƙƕǐǚƨƹǔưƲǠǎưǁǗƵƱǦƳǙưƱ", (byte)111, 66);
                    NLoginCore_430.var_java_lang_String_arr_b[4] = NLoginCore_138.B("ƑǎǖƹǆƮǛƲƱƙǟƪǋƺǥƟǅưǈơǛǩưƱ", (byte)111, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_430.var_java_lang_String_arr_b[0] = NLoginCore_027.F("տ֦գ՟֤֜ըեո֊֬զօֲ֋֑֝֝հִ֠ղչփ֗մֳֶֻ֑֚ׄ", (byte)111, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_430.var_java_lang_String_arr_b[0] = NLoginCore_575.E("ս֍շ֒֩մվն֦֟ֆճ", (byte)111, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0x8FED73998EBBBAB5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(31 + 38), (byte)(81 + 2), (byte)(36 + 11), 67, (byte)(53 + 13), (byte)(55 + 12), (byte)(3 + 44), (byte)(47 + 33), (byte)(9 + 66), (byte)(6 + 61), (byte)(17 + 66), (byte)(29 + 24), (byte)(4 + 76), (byte)(85 + 12), (byte)(40 + 60), (byte)(28 + 72), 105, (byte)(91 + 19), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(50 + 33)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.B("òÿþÁāýøāČûÈĆĊăĆČÎњдѫўџѩњѮѤѠ", (byte)8, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_430.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static void a(nLoginBukkit nLoginBukkit2, Player player) {
        try {
            BukkitLoader bukkitLoader = nLoginBukkit2.com_nickuc_login_loader_platform_BukkitLoader_a();
            for (NLoginCore_277 NLoginCore_277 : nLoginBukkit2.java_lang_Object_b().c()) {
                if (NLoginCore_277.S()) continue;
                Player player2 = (Player)NLoginCore_277.c();
                NLoginCore_430.a((Plugin)bukkitLoader, player2, player);
                NLoginCore_430.a((Plugin)bukkitLoader, player, player2);
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_430.c("㺀", (int)(var_int_a & var_int_b), (long)d) + player.getName() + (String)NLoginCore_430.c("㺃", (int)(e & f), (long)g), exception, new Object[h]);
        }
    }
}

