/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.event.ChatEvent
 *  net.md_5.bungee.api.event.TabCompleteEvent
 *  net.md_5.bungee.event.EventHandler
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_394;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_114;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginInterface_046;
import com.nickuc.login.NLoginCore_298;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.TabCompleteEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_217
implements NLoginInterface_046 {
    private static int z;
    private static int q;
    private static int m;
    private static int h;
    private static int f;
    private static int v;
    private static int n;
    private final Set<String> var_java_util_Set_java_lang_String__k;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_a;
    private static int ad;
    private static int g;
    private final String ap;
    private static int d;
    private final Set<String> var_java_util_Set_java_lang_String__j;
    private static long u;
    private static int l;
    private static int aa;
    private static int s;
    private static int var_int_k;
    private static long var_long_c;
    private static int e;
    private static int r;
    private static long var_long_j;
    private static int o;
    private static int y;
    private static int t;
    private static int ab;
    private static int x;
    private static int w;
    private static int ac;
    private static int p;
    private static int var_int_a;
    private static long i;
    private static String[] var_java_lang_String_arr_b;
    private static int ae;
    private static int var_int_b;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_217.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("рѢѤфѨ҇ѿҕҁѐҎ҄ҒҌѕѺҜқғҙғѨ", (byte)33, 68), NLoginCore_217.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.D("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߰ߤߢߡߓ߷ߒߤ߬߸ߖ߸ߛ߲߰Ѳ", (byte)33, 68) + string + NLoginCore_575.C("ђ", (byte)33, 67) + methodType.toString(), exception);
        }
    }

    private boolean g(String string) {
        if (string.isEmpty()) {
            return p != 0;
        }
        if (string.charAt(q) != r) {
            return s != 0;
        }
        String[] stringArray = string.split((String)NLoginCore_217.c("㺀", (int)t, (long)u));
        return (stringArray.length > 0 && this.var_java_util_Set_java_lang_String__k.contains(stringArray[v].toLowerCase(Locale.ENGLISH)) ? w : x) != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x3DL;
        l ^= 0xA02DAAF00C9D1A82L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(3 + 66), (byte)(76 + 7), (byte)(10 + 37), 67, (byte)(25 + 41), (byte)(31 + 36), (byte)(15 + 32), (byte)(40 + 40), 75, (byte)(58 + 9), (byte)(27 + 56), (byte)(39 + 14), (byte)(17 + 63), (byte)(73 + 24), (byte)(47 + 53), (byte)(27 + 73), (byte)(55 + 50), (byte)(38 + 72), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.B("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԙԍԋԊӼԠӻԍԕԡӿԡԄԛԙ", (byte)97, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_217.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @EventHandler(priority=-32)
    public void a(TabCompleteEvent tabCompleteEvent) {
        if (tabCompleteEvent.isCancelled()) {
            return;
        }
        List list = tabCompleteEvent.getSuggestions();
        if (list.isEmpty()) {
            return;
        }
        String string2 = tabCompleteEvent.getCursor().trim();
        if (!string2.isEmpty() && string2.charAt(n) != o) {
            return;
        }
        list.removeIf(string -> (string.startsWith((char)y + this.ap + (char)z) || this.g((String)string) ? aa : ab) != 0);
    }

    @Override
    public void void_a(Object object) {
        NLoginInterface_046.super.void_a(object);
        if (NLoginCore_298.a((String)NLoginCore_217.c("㺀", (int)h, (long)(i ^ var_long_j)), new String[var_int_k])) {
            NLoginCore_383 NLoginCore_3832 = (NLoginCore_383)object;
            NLoginCore_3832.a(new NLoginCore_394(this.ap, this.var_java_util_Set_java_lang_String__j), new NLoginInterface_013[l]);
        }
    }

    static {
        var_int_a = 25952256 >>> 18 | 25952256 << ~18 + 1;
        var_int_b = Integer.reverse(0x5C000000);
        var_int_c = 0x6300000 >>> 244 | 0x6300000 << -244;
        d = Integer.reverse(0);
        e = Integer.reverse(-973078528);
        f = 0x740000 >>> 81 | 0x740000 << ~81 + 1;
        g = Integer.reverse(-973078528);
        h = Integer.reverse(0);
        i = Long.reverse(-302365737784551646L);
        var_long_j = Long.reverse(-4899916394579099648L);
        var_int_k = (0 >>> 157 | 0 << ~157 + 1) & 0xFFFFFFFF;
        l = Integer.reverse(0);
        m = Integer.reverse(0);
        n = Integer.reverse(0);
        o = -268435454 >>> 124 | -268435454 << -124;
        p = Integer.reverse(0);
        q = Integer.reverse(0);
        r = 192512 >>> 236 | 192512 << ~236 + 1;
        s = Integer.reverse(0);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Long.reverse(5174011409097971490L);
        v = 0 >>> 32 | 0 << -32;
        w = 4 >>> 34 | 4 << ~34 + 1;
        x = Integer.reverse(0);
        y = 0xBC0000 >>> 210 | 0xBC0000 << -210;
        z = Integer.reverse(0x5C000000);
        aa = (0x400000 >>> 246 | 0x400000 << -246) & 0xFFFFFFFF;
        ab = Integer.reverse(0);
        ac = (12032 >>> 72 | 12032 << -72) & 0xFFFFFFFF;
        ad = Integer.reverse(0x40000000);
        ae = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_217.b();
    }

    public NLoginCore_217(NLoginCore_383 NLoginCore_3832) {
        this.ap = NLoginCore_3832.q().toLowerCase(Locale.ENGLISH);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(this.ap + (char)var_int_a);
        hashSet.add(this.ap + (char)var_int_b + this.ap + (char)var_int_c);
        NLoginCore_419[] NLoginCore_419Array = NLoginCore_419.values();
        int n = NLoginCore_419Array.length;
        for (int i = d; i < n; ++i) {
            NLoginCore_419 NLoginCore_4192 = NLoginCore_419Array[i];
            String string2 = NLoginCore_4192.Z().toLowerCase(Locale.ENGLISH);
            hashSet.add(this.ap + string2 + (char)e);
            hashSet.add(this.ap + (char)f + this.ap + string2 + (char)g);
        }
        this.var_java_util_Set_java_lang_String__j = NLoginCore_114.a(hashSet);
        this.var_java_util_Set_java_lang_String__k = NLoginCore_114.a(hashSet.stream().map(string -> (char)ac + string).collect(Collectors.toSet()));
    }

    @EventHandler(priority=127)
    public void a(ChatEvent chatEvent) {
        if (this.g(chatEvent.getMessage())) {
            chatEvent.setCancelled(m != 0);
        }
    }

    private static void b() {
        int n;
        var_long_c = 4965879281577341919L;
        long l = var_long_c ^ 0xA02DAAF00C9D1A82L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(35 + 34), (byte)(17 + 66), (byte)(13 + 34), 67, (byte)(45 + 21), (byte)(56 + 11), (byte)(35 + 12), (byte)(68 + 12), 75, (byte)(50 + 17), (byte)(4 + 79), (byte)(38 + 15), (byte)(56 + 24), (byte)(95 + 2), (byte)(22 + 78), (byte)(88 + 12), (byte)(79 + 26), (byte)(21 + 89), (byte)(54 + 49)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
                    NLoginCore_217.var_java_lang_String_arr_b[0] = NLoginCore_173.D("ԸԎӽԈԐӽՂՃӿԯԣԜԓԇԣԥԘԃԈԋԮԋՀՈՋԔՃԩԪՓԷԭՍԔԨԹՉՔԪՙ՞ԢԸաՁգէԩՄՄՏՠՑՈՂծԬմՠՔՙՐՉռԼըշպլսՂՎմցեԿՄԿգՊետփ՞խ֏Ֆ՗", (byte)90, 68);
                    NLoginCore_217.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ƖƎżƭƣżƄżżƴƆŻ", (byte)90, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_217.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƨžŭŸƀŭƲƳůƟƓƌƃŷƓƕƈųŸŻƞŻưƸƻƄƳƙƚǃƧƝƽƄƘƩƹǄƚǉǎƒƨǑƱǓǗƙƴƴƿǐǁƸƲǞƜǤǐǄǉǀƹǬƬǘǧǪǜǭƲƾǤǱǕǂƮǦǒǄǮǌǈǚǱǵǙǓƺǥǢǕǄǈǙǗ", (byte)90, 65);
                    NLoginCore_217.var_java_lang_String_arr_b[1] = NLoginCore_384.C("ӼԪԨԉԭԒӻԲԹԑԅԋ", (byte)90, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_217.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ӷԅԈԴԿԯԬԻԞՀԞՇԦԖԄԧՄԘԿԌԛԩԖԗ", (byte)90, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_217.var_java_lang_String_arr_b[0] = NLoginCore_427.C("ӹԉӸӸԏԼԜԝӻԼԸԑԅՄԶԅԙԸԷԨՃԙԖԗ", (byte)90, 67);
                }
            }
        }
    }
}

