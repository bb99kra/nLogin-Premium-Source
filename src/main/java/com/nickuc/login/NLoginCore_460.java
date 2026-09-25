/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_460
extends Enum<NLoginCore_460> {
    public static final /* enum */ NLoginCore_460 var_com_nickuc_login_NLoginCore_460_b;
    public static final /* enum */ NLoginCore_460 var_com_nickuc_login_NLoginCore_460_c;
    public static final /* enum */ NLoginCore_460 var_com_nickuc_login_NLoginCore_460_d;
    public static final /* enum */ NLoginCore_460 var_com_nickuc_login_NLoginCore_460_e;
    private final boolean aQ;
    private static final /* synthetic */ NLoginCore_460[] var_com_nickuc_login_NLoginCore_460_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;
    private static int n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static long v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static long aa;
    private static int ab;
    private static int ac;

    @Generated
    private NLoginCore_460(boolean bl) {
        this.aQ = bl;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_460.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ӮԐԒӲԖԵԭՃԯӾԼԲՀԺԃԨՊՉՁՇՁԖ", (byte)91, 68), NLoginCore_460.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.F("պևֆՉ։օր։֔փՐ֎֒֋֎֔Ֆࣟࣞࢽࣲ࣒ࣦ࣓ࣝࣴࣗࣷࣨծ", (byte)91, 70) + string + NLoginCore_091.C("Ԁ", (byte)91, 67) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_460 valueOf(String string) {
        return Enum.valueOf(NLoginCore_460.class, string);
    }

    private static boolean c(List<Pattern> list, String string) {
        for (Pattern pattern : list) {
            if (!pattern.matcher(string).matches()) continue;
            return var_int_a != 0;
        }
        return var_int_b != 0;
    }

    private static String a(int n, long l) {
        l ^= 6L;
        l ^= 0x489B380A2D047E24L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(12 + 57), (byte)(58 + 25), (byte)(43 + 4), 67, (byte)(49 + 17), (byte)(35 + 32), (byte)(2 + 45), (byte)(15 + 65), (byte)(51 + 24), (byte)(40 + 27), (byte)(46 + 37), (byte)(40 + 13), (byte)(7 + 73), (byte)(21 + 76), (byte)(14 + 86), (byte)(58 + 42), (byte)(70 + 35), (byte)(65 + 45), (byte)(39 + 64)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.D("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯ߸߷ߖ߶߫ࠍ߰ࠐࠋࠁ߿߬", (byte)41, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_460.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public boolean aQ() {
        return this.aQ;
    }

    private static void b() {
        int n;
        var_long_c = -9082143033239801358L;
        long l = var_long_c ^ 0x489B380A2D047E24L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(44 + 25), (byte)(32 + 51), (byte)(14 + 33), (byte)(6 + 61), (byte)(32 + 34), (byte)(17 + 50), (byte)(8 + 39), (byte)(70 + 10), (byte)(6 + 69), (byte)(43 + 24), (byte)(19 + 64), (byte)(27 + 26), 80, 97, (byte)(5 + 95), (byte)(16 + 84), (byte)(6 + 99), (byte)(42 + 68), (byte)(91 + 12)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(74 + 9)}, StandardCharsets.UTF_8));
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
                    NLoginCore_460.var_java_lang_String_arr_b[0] = NLoginCore_384.F("րՔը՞Ջբ՞և՜Մօ՘", (byte)84, 70);
                    NLoginCore_460.var_java_lang_String_arr_b[1] = NLoginCore_076.E("Իւը֌ֈևևՌվթէ՘", (byte)84, 69);
                    NLoginCore_460.var_java_lang_String_arr_b[2] = NLoginCore_091.F("վՖ֊իպՠ֊Ջժռ։՘", (byte)84, 70);
                    NLoginCore_460.var_java_lang_String_arr_b[3] = NLoginCore_559.F("քՔ֊֍չն՜ռ֐֓֍՘", (byte)84, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_460.var_java_lang_String_arr_b[0] = NLoginCore_138.F("պ֊քՔչֆիՇեռբզֈՐ֌Ցկ։փֈձ֜գդ", (byte)84, 70);
                    NLoginCore_460.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ӼԤԀӧԍԙԈӹԁԒ԰ӽԫӲӵԙӰԺԚԓԦԗԄԅ", (byte)84, 67);
                    NLoginCore_460.var_java_lang_String_arr_b[2] = NLoginCore_091.E("՛Ք՘։ֆշՆ՟ՎՊՅփՒխֈմՏՌհ՗պնգդ", (byte)84, 69);
                    NLoginCore_460.var_java_lang_String_arr_b[3] = NLoginCore_453.F("ձՖ՚՘լ՟ՎՐը֎Վ՘", (byte)84, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_460.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ցևւ֌ժՠա՘ՙ֒ս֐֓թ֒Փ֏֗Ւևէզգդ", (byte)84, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_460.var_java_lang_String_arr_b[0] = NLoginCore_446.E("զցը՚գռջֈ֐ևլ֎օխՖ֙ձՒյխխխշՒ֞֌֖֤֝֠փա", (byte)84, 69);
                }
            }
        }
    }

    public static NLoginCore_460 a(String string) {
        String string2 = string.toLowerCase();
        boolean bl = NLoginCore_460.c(BCryptHashProvider.k(), string2);
        boolean bl2 = NLoginCore_460.c(BCryptHashProvider.l(), string2);
        if (bl && bl2) {
            return var_com_nickuc_login_NLoginCore_460_e;
        }
        if (bl) {
            return var_com_nickuc_login_NLoginCore_460_b;
        }
        if (bl2) {
            return var_com_nickuc_login_NLoginCore_460_c;
        }
        return var_com_nickuc_login_NLoginCore_460_d;
    }

    static {
        var_int_a = (256 >>> 200 | 256 << -200) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = 262144 >>> 16 | 262144 << -16;
        var_int_d = (0 >>> 211 | 0 << -211) & 0xFFFFFFFF;
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        f = (0x200000 >>> 148 | 0x200000 << ~148 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(-1073741824);
        h = Integer.reverse(0x20000000);
        i = 0x20000000 >>> 219 | 0x20000000 << -219;
        j = 0 >>> 89 | 0 << -89;
        k = Long.reverse(5733027401080614785L);
        l = Long.reverse(0x6000000000000000L);
        m = Integer.reverse(0);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 65536 >>> 144 | 65536 << ~144 + 1;
        p = Long.reverse(5733027401080614785L);
        q = Long.reverse(0x6000000000000000L);
        r = Integer.reverse(Integer.MIN_VALUE);
        s = (16384 >>> 78 | 16384 << -78) & 0xFFFFFFFF;
        t = Integer.reverse(0x40000000);
        u = Long.reverse(5733027401080614785L);
        v = Long.reverse(0x6000000000000000L);
        w = Integer.reverse(0x40000000);
        x = Integer.reverse(0);
        y = 0x60000000 >>> 157 | 0x60000000 << ~157 + 1;
        z = (-1 >>> 186 | -1 << -186) & 0xFFFFFFFF;
        aa = Long.reverse(3427184391866920833L);
        ab = Integer.reverse(-1073741824);
        ac = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_460.b();
        var_com_nickuc_login_NLoginCore_460_b = new NLoginCore_460(n != 0);
        var_com_nickuc_login_NLoginCore_460_c = new NLoginCore_460(s != 0);
        var_com_nickuc_login_NLoginCore_460_d = new NLoginCore_460(x != 0);
        var_com_nickuc_login_NLoginCore_460_e = new NLoginCore_460(ac != 0);
        var_com_nickuc_login_NLoginCore_460_arr_a = NLoginCore_460.a();
    }

    public static NLoginCore_460[] values() {
        return (NLoginCore_460[])var_com_nickuc_login_NLoginCore_460_arr_a.clone();
    }

    private static /* synthetic */ NLoginCore_460[] a() {
        NLoginCore_460[] NLoginCore_460Array = new NLoginCore_460[var_int_c];
        NLoginCore_460Array[NLoginCore_460.var_int_d] = var_com_nickuc_login_NLoginCore_460_b;
        NLoginCore_460Array[NLoginCore_460.var_int_e] = var_com_nickuc_login_NLoginCore_460_c;
        NLoginCore_460Array[NLoginCore_460.f] = var_com_nickuc_login_NLoginCore_460_d;
        NLoginCore_460Array[NLoginCore_460.g] = var_com_nickuc_login_NLoginCore_460_e;
        return NLoginCore_460Array;
    }
}

