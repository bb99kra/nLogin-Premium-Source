/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
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

public final class NLoginCore_184
extends Enum<NLoginCore_184> {
    public static final /* enum */ NLoginCore_184 var_com_nickuc_login_NLoginCore_184_a;
    public static final /* enum */ NLoginCore_184 var_com_nickuc_login_NLoginCore_184_b;
    public static final /* enum */ NLoginCore_184 var_com_nickuc_login_NLoginCore_184_c;
    public static final /* enum */ NLoginCore_184 var_com_nickuc_login_NLoginCore_184_d;
    public static final /* enum */ NLoginCore_184 var_com_nickuc_login_NLoginCore_184_e;
    private static final /* synthetic */ NLoginCore_184[] var_com_nickuc_login_NLoginCore_184_arr_a;
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
    private static int l;
    private static int m;
    private static long n;
    private static int o;
    private static int p;
    private static long q;
    private static int r;
    private static int s;
    private static long t;
    private static int u;
    private static int v;
    private static long w;
    private static long x;
    private static int y;

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0xC09673AF23FFC964L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(16 + 53), (byte)(24 + 59), (byte)(4 + 43), (byte)(29 + 38), (byte)(25 + 41), (byte)(61 + 6), (byte)(5 + 42), (byte)(61 + 19), (byte)(47 + 28), (byte)(29 + 38), (byte)(12 + 71), (byte)(6 + 47), (byte)(26 + 54), 97, (byte)(12 + 88), 100, (byte)(44 + 61), (byte)(9 + 101), (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(4 + 79)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.D("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߼߼ߠ߱ࠃ߯ߺ߷߽߲߸߿߼ࠎ", (byte)38, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_184.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_184[] values() {
        return (NLoginCore_184[])var_com_nickuc_login_NLoginCore_184_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_184.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("çĉċëďĮĦļĨ÷ĵīĹĳüġŃłĺŀĺď", (byte)32, 65), NLoginCore_184.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.E("ԿՌՋԎՎՊՅՎՙՈԕՓ՗ՐՓՙԛࢱࢱ࢕ࢦࢸࢤࢯࢬࢲࢧࢭࢴࢱࣃԵ", (byte)32, 69) + string + NLoginCore_138.E("Ԗ", (byte)32, 69) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ NLoginCore_184[] a() {
        NLoginCore_184[] NLoginCore_184Array = new NLoginCore_184[var_int_a];
        NLoginCore_184Array[NLoginCore_184.var_int_b] = var_com_nickuc_login_NLoginCore_184_a;
        NLoginCore_184Array[NLoginCore_184.var_int_c] = var_com_nickuc_login_NLoginCore_184_b;
        NLoginCore_184Array[NLoginCore_184.var_int_d] = var_com_nickuc_login_NLoginCore_184_c;
        NLoginCore_184Array[NLoginCore_184.var_int_e] = var_com_nickuc_login_NLoginCore_184_d;
        NLoginCore_184Array[NLoginCore_184.f] = var_com_nickuc_login_NLoginCore_184_e;
        return NLoginCore_184Array;
    }

    public static NLoginCore_184 valueOf(String string) {
        return Enum.valueOf(NLoginCore_184.class, string);
    }

    private static void b() {
        int n;
        var_long_c = 6000595180364837954L;
        long l = var_long_c ^ 0xC09673AF23FFC964L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(41 + 42), (byte)(17 + 30), (byte)(51 + 16), (byte)(14 + 52), (byte)(24 + 43), 47, (byte)(51 + 29), (byte)(10 + 65), (byte)(65 + 2), (byte)(15 + 68), (byte)(12 + 41), (byte)(18 + 62), (byte)(50 + 47), (byte)(78 + 22), (byte)(80 + 20), (byte)(15 + 90), (byte)(14 + 96), (byte)(83 + 20)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
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
                    NLoginCore_184.var_java_lang_String_arr_b[0] = NLoginCore_559.F("խբ֦֧֠֩֔ֆէվ։ղ", (byte)110, 70);
                    NLoginCore_184.var_java_lang_String_arr_b[1] = NLoginCore_223.F("ջ՚֐֜ցը֕՜֞֡չտְֳ֪֝֡ցրփ֤րսվ", (byte)110, 70);
                    NLoginCore_184.var_java_lang_String_arr_b[2] = NLoginCore_453.A("ǈƲƔǌƨƳƘƥƓƻƝƧƶƗǊƕǔǣưƞƦǗƮƯ", (byte)110, 65);
                    NLoginCore_184.var_java_lang_String_arr_b[3] = NLoginCore_110.C("եՈ԰մռՙտ՘ճ՗՚ԽՃֆՙտյեՀււջՒՓ", (byte)110, 67);
                    NLoginCore_184.var_java_lang_String_arr_b[4] = NLoginCore_384.D("եՈ԰մռՙտ՘ճ՗՚ՙվԻղրտպռնՆեՒՓ", (byte)110, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_184.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ƎươǉǁǂǛǛǝƼƯǘǜƓǚǗƚǣƦǝƱƱƮƯ", (byte)110, 65);
                    NLoginCore_184.var_java_lang_String_arr_b[1] = NLoginCore_223.C("ՐԯեձՖԽժԱճնՑչԿճԸՠՁվւՁ՞ՕՒՓ", (byte)110, 67);
                    NLoginCore_184.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ǈƲƔǌƨƳƘƥƓƻƔǠǕǌƞǙƾƾƲưǞǗƮƯ", (byte)110, 65);
                    NLoginCore_184.var_java_lang_String_arr_b[3] = NLoginCore_451.F("֐ճ՛֧֟ք֪փ֞ւև֙լջց֍ֱֳִ֞րֶսվ", (byte)110, 70);
                    NLoginCore_184.var_java_lang_String_arr_b[4] = NLoginCore_446.B("ǁƤƌǐǘƵǛƴǏƳƷǐǡƗƙƯƣǂǚƱǄǡƷǘǖǙƭƦǱƧǊƫ", (byte)110, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_184.var_java_lang_String_arr_b[0] = NLoginCore_027.E("֢֝օ֠ֈ֢՛նդ֦֤֗թְ֊֏֟֎֌։֧֐ո֤֒ղևչֿ֑րպ", (byte)110, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_184.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ոԶբ՛՜ՈժԹՋԸԺՎՐԾ՝ՀզնպէՙեՒՓ", (byte)110, 67);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(-1610612736);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = 0x4000000 >>> 185 | 0x4000000 << -185;
        var_int_e = (-1073741824 >>> 158 | -1073741824 << ~158 + 1) & 0xFFFFFFFF;
        f = 1024 >>> 8 | 1024 << ~8 + 1;
        g = Integer.reverse(-1610612736);
        h = Integer.reverse(-1610612736);
        i = Integer.reverse(0);
        j = (-1 >>> 238 | -1 << ~238 + 1) & 0xFFFFFFFF;
        k = Long.reverse(2750724536644559562L);
        l = Integer.reverse(0);
        m = 256 >>> 200 | 256 << ~200 + 1;
        n = Long.reverse(2750724536644559562L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = (128 >>> 166 | 128 << ~166 + 1) & 0xFFFFFFFF;
        q = Long.reverse(2750724536644559562L);
        r = 0x800000 >>> 246 | 0x800000 << ~246 + 1;
        s = Integer.reverse(-1073741824);
        t = Long.reverse(2750724536644559562L);
        u = 6 >>> 1 | 6 << ~1 + 1;
        v = Integer.reverse(0x20000000);
        w = Long.reverse(4768337169706541770L);
        x = Long.reverse(0x6400000000000000L);
        y = 131072 >>> 207 | 131072 << ~207 + 1;
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_184.b();
        var_com_nickuc_login_NLoginCore_184_a = new NLoginCore_184();
        var_com_nickuc_login_NLoginCore_184_b = new NLoginCore_184();
        var_com_nickuc_login_NLoginCore_184_c = new NLoginCore_184();
        var_com_nickuc_login_NLoginCore_184_d = new NLoginCore_184();
        var_com_nickuc_login_NLoginCore_184_e = new NLoginCore_184();
        var_com_nickuc_login_NLoginCore_184_arr_a = NLoginCore_184.a();
    }
}

