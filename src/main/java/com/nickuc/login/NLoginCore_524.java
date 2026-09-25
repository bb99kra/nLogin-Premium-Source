/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class NLoginCore_524 {
    private static long t;
    private static long ak;
    private static int ab;
    private static int as;
    private static int f;
    private static int var_int_a;
    private static int ae;
    private static long z;
    private static int o;
    private static long ac;
    private static int j;
    private static int k;
    private static long w;
    public static int var_int_p;
    private static int ap;
    private static int ag;
    private static int x;
    private static int at;
    private static int ar;
    private static int an;
    private static int au;
    private static int m;
    private static long ao;
    private static int l;
    private static int i;
    private static String[] var_java_lang_String_arr_b;
    private static int aa;
    private static int e;
    private static long d;
    private static long al;
    private static long c;
    private static int aj;
    private static int g;
    private static int am;
    private static int n;
    private static int h;
    private static int y;
    private static int r;
    private static long var_long_p;
    private static long af;
    private static String[] var_java_lang_String_arr_a;
    private static long v;
    private static long var_long_b;
    private static int ah;
    private static int aq;
    private static int u;
    private static long q;
    private static int ad;
    private static int ai;
    private static long s;

    static {
        var_int_a = (0 >>> 55 | 0 << -55) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-5174925137606256836L);
        d = Long.reverse(-1152921504606846976L);
        e = (-1 >>> 43 | -1 << -43) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = (0x8000000 >>> 251 | 0x8000000 << -251) & 0xFFFFFFFF;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = -1 >>> 28 | -1 << ~28 + 1;
        j = Integer.reverse(Integer.MIN_VALUE);
        k = 0x400000 >>> 22 | 0x400000 << -22;
        l = 0 >>> 127 | 0 << ~127 + 1;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0);
        o = 1024 >>> 202 | 1024 << -202;
        var_long_p = Long.reverse(-5174925137606256836L);
        q = Long.reverse(-1152921504606846976L);
        r = (0x2000000 >>> 216 | 0x2000000 << -216) & 0xFFFFFFFF;
        s = Long.reverse(-5174925137606256836L);
        t = Long.reverse(-1152921504606846976L);
        u = Integer.reverse(-1073741824);
        v = Long.reverse(-5174925137606256836L);
        w = Long.reverse(-1152921504606846976L);
        x = (8 >>> 65 | 8 << -65) & 0xFFFFFFFF;
        y = Integer.reverse(-1);
        z = Long.reverse(5201368403855365948L);
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(-1610612736);
        ac = Long.reverse(5201368403855365948L);
        ad = (0x1800000 >>> 182 | 0x1800000 << -182) & 0xFFFFFFFF;
        ae = -1 >>> 253 | -1 << -253;
        af = Long.reverse(5201368403855365948L);
        ag = 0 >>> 188 | 0 << ~188 + 1;
        ah = -1073741821 >>> 253 | -1073741821 << ~253 + 1;
        ai = (0x180000 >>> 178 | 0x180000 << -178) & 0xFFFFFFFF;
        aj = Integer.reverse(-536870912);
        ak = Long.reverse(-5174925137606256836L);
        al = Long.reverse(-1152921504606846976L);
        am = (4096 >>> 9 | 4096 << -9) & 0xFFFFFFFF;
        an = Integer.reverse(-1);
        ao = Long.reverse(5201368403855365948L);
        ap = (0 >>> 52 | 0 << ~52 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(0x78000000);
        ar = (98304 >>> 142 | 98304 << ~142 + 1) & 0xFFFFFFFF;
        as = (0x2400000 >>> 150 | 0x2400000 << -150) & 0xFFFFFFFF;
        at = Integer.reverse(-1879048192);
        au = Integer.reverse(-1);
        var_java_lang_String_arr_a = new String[as];
        var_java_lang_String_arr_b = new String[at];
        NLoginCore_524.b();
        var_int_p = au;
    }

    private static String a(int n, long l) {
        l ^= 0xFL;
        l ^= 0x606E621C0BDE48DEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(66 + 3), (byte)(25 + 58), (byte)(24 + 23), (byte)(26 + 41), (byte)(41 + 25), (byte)(43 + 24), (byte)(41 + 6), (byte)(17 + 63), (byte)(41 + 34), (byte)(60 + 7), (byte)(30 + 53), (byte)(48 + 5), 80, 97, (byte)(70 + 30), (byte)(99 + 1), (byte)(17 + 88), (byte)(58 + 52), (byte)(39 + 64)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(49 + 34)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫ࠾࠰ࠟࡅࠔࡆࠞ࠺", (byte)61, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_524.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static void a(NLoginType_008 NLoginType_008, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException((String)NLoginCore_524.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        }
        if (var_int_p != e) {
            var_int_p = f;
            return;
        }
        var_int_p = n + g;
        NLoginType_008.b(h != 0).a(NLoginInterface_0482 -> {
            if (!NLoginType_008.N()) {
                NLoginInterface_0482.Z();
                return;
            }
            Collection<NLoginCore_277> collection = NLoginType_008.java_lang_Object_b().c();
            if (var_int_p == i) {
                collection.forEach(NLoginCore_277 -> NLoginCore_277.a((String)NLoginCore_524.c("㺀", (int)aj, (long)(ak ^ al)), (String)NLoginCore_524.c("㺃", (int)(am & an), (long)ao), ap, aq, ar));
                NLoginInterface_0482.Z();
                return;
            }
            if (var_int_p > 0) {
                var_int_p -= j;
            }
            int n = var_int_p == 0 ? k : l;
            int n2 = NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? m : NLoginCore_524.n;
            for (NLoginCore_277 NLoginCore_2772 : collection) {
                if (n != 0) {
                    if (n2 != 0) {
                        try {
                            ((Player)NLoginCore_2772.c()).closeInventory();
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    NLoginCore_2772.a((String)NLoginCore_524.c("㺀", (int)o, (long)(var_long_p ^ q)));
                    continue;
                }
                NLoginCore_2772.a((String)NLoginCore_524.c("㺃", (int)r, (long)(s ^ t)), (String)NLoginCore_524.c("㺆", (int)u, (long)(v ^ w)) + var_int_p + (String)NLoginCore_524.c("㺉", (int)(x & y), (long)z) + (String)(var_int_p == aa ? NLoginCore_524.c("㺌", (int)ab, (long)ac) : NLoginCore_524.c("㺏", (int)(ad & ae), (long)af)), ag, ah, ai);
            }
            if (n != 0) {
                NLoginType_008.java_lang_Object_b().c();
                NLoginInterface_0482.Z();
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_524.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("ПсуУчѦўѴѠЯѭѣѱѫдљѻѺѲѸѲч", (byte)22, 68), NLoginCore_524.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѽѯў҄ѓ҅ѝѹþ", (byte)22, 65) + string + NLoginCore_138.F("Ԍ", (byte)22, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 4389529258106516509L;
        long l = c ^ 0x606E621C0BDE48DEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(26 + 43), (byte)(58 + 25), (byte)(36 + 11), (byte)(19 + 48), (byte)(17 + 49), (byte)(22 + 45), (byte)(38 + 9), 80, (byte)(37 + 38), (byte)(3 + 64), (byte)(8 + 75), (byte)(33 + 20), (byte)(73 + 7), (byte)(93 + 4), 100, (byte)(74 + 26), (byte)(10 + 95), (byte)(41 + 69), (byte)(89 + 14)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
                    NLoginCore_524.var_java_lang_String_arr_b[0] = NLoginCore_575.D("ԳԕՃՅՅԔԋՊԥԡԭԸՋՋՒԿՉԏԒՊԹՉՆԦԳԯԾԜԓԺ՝ԸՙԥԳՒՈԡ՚՗՝՚ՇԴ", (byte)93, 68);
                    NLoginCore_524.var_java_lang_String_arr_b[1] = NLoginCore_453.F("ջ֑֎եՌյրՋ֚մշՓ֘Օյշ՝֍֣՝֖֦ց֚գոժ֤֦֤հրցր֩և֖֠յ֒ոճշց", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ցհփՓծտֆ։֔ճֈ֕ձ֓ՠ֛֙քուդտլխ", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[3] = NLoginCore_091.F("հ֓֍Ռխ՟հ֗ոճպՕճ։՗֣֛֕֞ջփ֚֝քղփ֖ւ֍եպ֥", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[4] = NLoginCore_427.C("ӽՀԳԿԨԣՉԣՀԀԫԔ", (byte)93, 67);
                    NLoginCore_524.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ƤƫƑƔƴƗŰŵƒƉƔƁ", (byte)93, 66);
                    NLoginCore_524.var_java_lang_String_arr_b[6] = NLoginCore_453.B("ŤƥŬŰƕƋƉƑŰŷųƁ", (byte)93, 66);
                    NLoginCore_524.var_java_lang_String_arr_b[7] = NLoginCore_110.D("ԴԣԶԆԡԲԹԼՇԦԻՈԤՆԓՌՎԷԫԵԗԲԟԠ", (byte)93, 68);
                    NLoginCore_524.var_java_lang_String_arr_b[8] = NLoginCore_110.D("ԒԏԧԃԶԘՉԽՀՇԝԐԝԩԬՊԱԌԸԦԣԢԧՐԬ՛ԛԺԯՃՂՅ", (byte)93, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_524.var_java_lang_String_arr_b[0] = NLoginCore_446.F("րբ֐֒֒ա՘֗ղծպօ֘֘֟֌֖՜՟֗ֆ֖֓ճրռ֋թՠև֪օ֫֫֎֏ֱֲ֤֥֙նֵֺֻ֚֓֯մս֎׀ֵֻ֌֍", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ԮՄՁԘӿԨԳӾՍԧԪԆՋԈԨԪԐՀՖԐՉՙԴՍԖԫԝ՗ՙ՗ԣԳՙԝՠըԵ՚ժՄԦկՂԪԣՠՔըՈԮՑՉ԰ոԿՀ", (byte)93, 68);
                    NLoginCore_524.var_java_lang_String_arr_b[2] = NLoginCore_324.F("ցհփՓծտֆ։֔ճև֞֔շ։ա֝ոջմդղյ֊֜նվջ֣ֆ֎֡", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[3] = NLoginCore_223.F("հ֓֍Ռխ՟հ֗ոճպՕճ։՗֣֛֕֞ջփ֞՞֖֖՝իգ֏֝֩կֆֆֆ֬խխ֏֤օֲ֙ց", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[4] = NLoginCore_076.A("ƅƍƪƨƕƍƩƮƇƇųƁ", (byte)93, 65);
                    NLoginCore_524.var_java_lang_String_arr_b[5] = NLoginCore_138.F("֓Ռըր֗ւզևւղզշժէ֓՟֍֗խ՛կ֕լխ", (byte)93, 70);
                    NLoginCore_524.var_java_lang_String_arr_b[6] = NLoginCore_173.D("ԣԝԚԖԲՇԂՊԙԹՅԪԿՁԒԥԱՒԪՐԋԲԟԠ", (byte)93, 68);
                    NLoginCore_524.var_java_lang_String_arr_b[7] = NLoginCore_076.E("ցհփՓծտֆ։֔ճֆ՘֊և֑֑֞֙ռոօ֖էչօք֝֊֩֏֤֥", (byte)93, 69);
                    NLoginCore_524.var_java_lang_String_arr_b[8] = NLoginCore_387.D("ԒԏԧԃԶԘՉԽՀՇԝԐԝԩԬՊԱԌԸԦԣԦՈԭԮՔԯԸԩՃդ՝ԗՐՕբԠԶԢ՞ՆՎԿԴ", (byte)93, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_524.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ƱƟƃƫƳƍƭŶƌƱŲƴƆŹƖƶƛƤƢǃƧƝƼƽƜƝƺǌƜƸƞǑ", (byte)93, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_524.var_java_lang_String_arr_b[0] = NLoginCore_324.F("Ց֐ձՔթճ֒։Օչ՜չ֙֍յ֌՞գ֓֔փ֝դ֤֖֕֘ֆ֗լֲ֨", (byte)93, 70);
                }
            }
        }
    }
}

