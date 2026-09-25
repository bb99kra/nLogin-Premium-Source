/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.Cancellable
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 *  org.bukkit.event.server.ServerCommandEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_106;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_114;
import com.nickuc.login.NLoginCore_476;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_298;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class NLoginCore_239
implements NLoginInterface_027 {
    private static long j;
    private static int ac;
    private static int w;
    private final Set<String> var_java_util_Set_java_lang_String__h;
    private static int var_int_c;
    private static int ab;
    private static int i;
    private static int q;
    private static int t;
    private static int var_int_h;
    private static int o;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static int aa;
    private static int e;
    private static int var_int_a;
    private static int z;
    private static long y;
    private static int v;
    private static int m;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static long x;
    private static int var_int_b;
    private static int var_int_g;
    private static int r;
    private final String var_java_lang_String_ae;
    private static int var_int_ae;
    private static long n;
    private static int s;
    private static int d;
    private static int p;
    private static int l;
    private static int k;
    private static int u;
    private static int ad;
    private final Set<String> var_java_util_Set_java_lang_String__g;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_239.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("԰ՒՔԴ՘շկօձՀվմւռՅժ֌֋փ։փ՘", (byte)76, 70), NLoginCore_239.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.E("իոշԺպնձպօմՁտփռտօՇࣟࣙ࣠ࣝࣤࣞࣥࣛࣁ՜", (byte)76, 69) + string + NLoginCore_324.C("ӓ", (byte)76, 67) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 5612400205601612262L;
        long l = var_long_c ^ 0xD01EA875FAE0EDEFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(46 + 23), 83, (byte)(22 + 25), (byte)(13 + 54), (byte)(65 + 1), (byte)(54 + 13), (byte)(14 + 33), (byte)(14 + 66), (byte)(24 + 51), (byte)(25 + 42), (byte)(23 + 60), (byte)(32 + 21), (byte)(75 + 5), (byte)(52 + 45), 100, (byte)(57 + 43), (byte)(56 + 49), (byte)(106 + 4), (byte)(77 + 26)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
                    NLoginCore_239.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ƉƨƖƓưƬƻƕƸƽǄƍƃƝźƱƗƃƪƃƧǐƭƹƉƳǍƋƑƯǘƸǎƼƩǔƵƯǗǛǎǖƽǆǕƠƺƛǋǝƫǚǖƹǭưƻǉǟƲƳǠǙǉ", (byte)97, 66);
                    NLoginCore_239.var_java_lang_String_arr_b[1] = NLoginCore_138.A("ƉƨƖƓưƬƻƕƸƽǄƍƃƝźƱƗƃƪƃƧǎƻƩƦơǏƥƣǐǍǇǄƹǗƔưƬƙǢƳƚƻǢǀƧƥǢǛƫƺǨƭƪǯǀǡǏǆǓǟǱǲǨ", (byte)97, 65);
                    NLoginCore_239.var_java_lang_String_arr_b[2] = NLoginCore_575.F("էխհֈլ֐֕֊տսոե", (byte)97, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_239.var_java_lang_String_arr_b[0] = NLoginCore_201.F("եքղկ֌ֈ֗ձ֔֙֠թ՟չՖ֍ճ՟ֆ՟փ֬։֕ե֏֩էխ֋ִ֪֔֘օְ֑֋ֱֲֳַ֪֢֙ռ֖շֹ֧ևֲֶָ֝׆֨֌ւ֑֪֨ב֨֕ה׉הִִֵֶׇ֑֥֟", (byte)97, 70);
                    NLoginCore_239.var_java_lang_String_arr_b[1] = NLoginCore_076.F("եքղկ֌ֈ֗ձ֔֙֠թ՟չՖ֍ճ՟ֆ՟փ֪֗օւս֫ցտֳ֣֬֩֠֕հ֌ֈյ־֏ն֗־֜փց־ַև֖ׄ։׊׀ַև֍׋ֈ֣ב֦֨", (byte)97, 70);
                    NLoginCore_239.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƕƳƒƲƽƽŻƢƍƐǂƉ", (byte)97, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_239.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ֈ֐֑ղՐք՚ը֊ն֒՚ժրմֆկ֖ձ֢֥֢֣֓֙ծ֨ըְ֩֒խ", (byte)97, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_239.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ԿԲԠԎԋ԰ԓԴՊԒ԰ՆԓՔԬԸԱԾՠբԵդԫԬ", (byte)97, 67);
                }
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void a(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        if (this.g(playerCommandPreprocessEvent.getMessage())) {
            playerCommandPreprocessEvent.setCancelled(q != 0);
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void b(ServerCommandEvent serverCommandEvent) {
        if (serverCommandEvent instanceof Cancellable && this.g(serverCommandEvent.getCommand())) {
            serverCommandEvent.setCancelled(r != 0);
        }
    }

    private boolean g(String string) {
        String[] stringArray;
        if (string.isEmpty()) {
            return s != 0;
        }
        if (string.charAt(t) != u) {
            string = (char)v + string;
        }
        return ((stringArray = string.split((String)NLoginCore_239.c("㺀", (int)w, (long)(x ^ y)))).length > 0 && this.var_java_util_Set_java_lang_String__h.contains(stringArray[z].toLowerCase(Locale.ENGLISH)) ? aa : ab) != 0;
    }

    public NLoginCore_239(NLoginCore_089 NLoginCore_0892) {
        this.var_java_lang_String_ae = NLoginCore_0892.q().toLowerCase(Locale.ENGLISH);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(this.var_java_lang_String_ae + (char)var_int_a);
        hashSet.add(this.var_java_lang_String_ae + (char)var_int_b + this.var_java_lang_String_ae + (char)var_int_c);
        NLoginCore_419[] NLoginCore_419Array = NLoginCore_419.values();
        int n = NLoginCore_419Array.length;
        for (int i = d; i < n; ++i) {
            NLoginCore_419 NLoginCore_4192 = NLoginCore_419Array[i];
            String string2 = NLoginCore_4192.Z().toLowerCase(Locale.ENGLISH);
            hashSet.add(this.var_java_lang_String_ae + string2 + (char)e);
            hashSet.add(this.var_java_lang_String_ae + (char)f + this.var_java_lang_String_ae + string2 + (char)var_int_g);
        }
        this.var_int_g = (int)NLoginCore_114.a(hashSet);
        this.var_java_util_Set_java_lang_String__h = NLoginCore_114.a(hashSet.stream().map(string -> (char)ac + string).collect(Collectors.toSet()));
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0xD01EA875FAE0EDEFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(18 + 51), 83, (byte)(21 + 26), (byte)(15 + 52), (byte)(7 + 59), (byte)(14 + 53), (byte)(37 + 10), (byte)(7 + 73), (byte)(64 + 11), (byte)(20 + 47), (byte)(24 + 59), (byte)(50 + 3), (byte)(30 + 50), (byte)(29 + 68), 100, (byte)(37 + 63), (byte)(16 + 89), (byte)(78 + 32), (byte)(56 + 47)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ԰ԳԹӻ࢓ࢍ࢔࢑࢘࢒࢙࢏ࡵ", (byte)0, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_239.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void void_a(Object object) {
        NLoginInterface_027.super.void_a(object);
        NLoginCore_089 NLoginCore_0892 = (NLoginCore_089)object;
        if (NLoginCore_298.a((String)NLoginCore_239.c("㺀", (int)(var_int_h & i), (long)j), new String[k])) {
            NLoginCore_0892.a(new NLoginCore_106(this.var_java_lang_String_ae, (Set<String>)this.var_int_g), new NLoginInterface_013[l]);
        }
        if (NLoginCore_298.a((String)NLoginCore_239.c("㺃", (int)m, (long)n), new String[o])) {
            NLoginCore_0892.a(new NLoginCore_476(this.var_java_lang_String_ae, this.var_java_util_Set_java_lang_String__h), new NLoginInterface_013[p]);
        }
    }

    static {
        var_int_a = 198 >>> 161 | 198 << -161;
        var_int_b = Integer.reverse(0x5C000000);
        var_int_c = 811008 >>> 45 | 811008 << ~45 + 1;
        d = Integer.reverse(0);
        e = Integer.reverse(-973078528);
        f = Integer.reverse(0x5C000000);
        var_int_g = Integer.reverse(-973078528);
        var_int_h = Integer.reverse(0);
        i = -1 >>> 55 | -1 << ~55 + 1;
        j = Long.reverse(-4357958274171877454L);
        k = (0 >>> 255 | 0 << ~255 + 1) & 0xFFFFFFFF;
        l = 0 >>> 222 | 0 << -222;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Long.reverse(-4357958274171877454L);
        o = 0 >>> 80 | 0 << ~80 + 1;
        p = Integer.reverse(0);
        q = (0 >>> 119 | 0 << ~119 + 1) & 0xFFFFFFFF;
        r = (0 >>> 32 | 0 << -32) & 0xFFFFFFFF;
        s = Integer.reverse(0);
        t = Integer.reverse(0);
        u = 1540096 >>> 47 | 1540096 << -47;
        v = 376 >>> 227 | 376 << -227;
        w = Integer.reverse(0x40000000);
        x = Long.reverse(7459487148048304050L);
        y = Long.reverse(-6629298651489370112L);
        z = (0 >>> 90 | 0 << ~90 + 1) & 0xFFFFFFFF;
        aa = 2 >>> 65 | 2 << ~65 + 1;
        ab = Integer.reverse(0);
        ac = Integer.reverse(-201326592);
        ad = Integer.reverse(-1073741824);
        var_int_ae = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[var_int_ae];
        NLoginCore_239.b();
    }
}

