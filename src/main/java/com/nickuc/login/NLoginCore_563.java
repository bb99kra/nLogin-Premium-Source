/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  github.scarsz.discordsrv.DiscordSRV
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_370;
import github.scarsz.discordsrv.DiscordSRV;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_563 {
    private static long d;
    private static String[] var_java_lang_String_arr_a;
    private static int f;
    private static long c;
    private static int g;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int e;
    private static long var_long_b;

    private static void b() {
        int n;
        c = -1154682168879651768L;
        long l = c ^ 0xC11870DC9C7C9BD1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(48 + 21), (byte)(58 + 25), 47, (byte)(6 + 61), (byte)(42 + 24), (byte)(7 + 60), (byte)(9 + 38), (byte)(18 + 62), 75, (byte)(24 + 43), (byte)(57 + 26), (byte)(31 + 22), (byte)(36 + 44), (byte)(47 + 50), (byte)(60 + 40), (byte)(98 + 2), (byte)(51 + 54), (byte)(92 + 18), (byte)(54 + 49)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
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
                    NLoginCore_563.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ծմՆԸոէՇԴՌլԻկԸԹշւԼ՗մՖռՁ֋Շևա֎Պՠցր֎Վ֏ի֐֖ն՛ը֑ճկ֍՚ղ՜֝ռ֖֠։եզ֭֡֨խցպֲ֜րվ֞։֥֭օ֣֖֒ս֟֋ք", (byte)64, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_563.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ӧӭҿұӱӠӀҭӅӥҴӨұҲӰӻҵӐӭӏӵҺԄӀԀӚԇӃәӺӹԇӇԈӤԉԏӯӔӡԊӬӨԆӓӫӕԖӵԙԏԂӞӟԚԡԦӦӺӳԕԫӹӷԞӺԌӫԛԲӼӭԯӿԮӽ", (byte)64, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_563.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ӞҿӟӪӭҲӥӀӒӱӊӋӆҺӤөӚҶҺӲӾӛӈӉ", (byte)64, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_563.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ĶŕŰŹŧňŬňśŵŎŠŻśŲſŕƈŁƌňŕŒœ", (byte)64, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x56L;
        l ^= 0xC11870DC9C7C9BD1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(67 + 2), (byte)(20 + 63), (byte)(36 + 11), (byte)(29 + 38), (byte)(36 + 30), (byte)(33 + 34), (byte)(21 + 26), (byte)(66 + 14), (byte)(61 + 14), 67, (byte)(6 + 77), (byte)(27 + 26), (byte)(42 + 38), (byte)(85 + 12), 100, (byte)(42 + 58), (byte)(50 + 55), (byte)(108 + 2), (byte)(86 + 17)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.D("եղձԴմհիմտծԻչսնչտՁࣔࣅࣆࢾ࣏ࣕࣞࣔࣙࣜࣥࣝࣈ", (byte)111, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_563.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    public String a(UUID uUID) {
        try {
            return DiscordSRV.getPlugin().getAccountLinkManager().getDiscordId(uUID);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_563.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), throwable, new Object[e]);
            return null;
        }
    }

    static {
        var_int_a = (0 >>> 201 | 0 << ~201 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(1307960233154158583L);
        d = Long.reverse(0x6A00000000000000L);
        e = (0 >>> 65 | 0 << ~65 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(Integer.MIN_VALUE);
        g = (0x2000000 >>> 185 | 0x2000000 << ~185 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_563.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_563.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("ӧԉԋӫԏԮԦԼԨӷԵԫԹԳӼԡՃՂԺՀԺԏ", (byte)3, 69), NLoginCore_563.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾ࢑ࢂࢃࡻ࢒࢛ࢌ࢑࢖࢙ࢢ࢚ࢅԗ", (byte)3, 70) + string + NLoginCore_575.F("ӹ", (byte)3, 70) + methodType.toString(), exception);
        }
    }
}

