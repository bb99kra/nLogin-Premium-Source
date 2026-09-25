/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginInterface_033;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class NLoginCore_512
implements NLoginInterface_033 {
    private static long r;
    private static String[] var_java_lang_String_arr_a;
    private static int f;
    private static int var_int_c;
    private static int g;
    private static long var_long_c;
    private static int p;
    private static int h;
    private static int e;
    private static int m;
    private static long var_long_b;
    private static int i;
    private static int var_int_a;
    private static long k;
    private static long o;
    private static int t;
    private static int d;
    private static long q;
    private static int l;
    private static int s;
    private static int j;
    private static String[] var_java_lang_String_arr_b;
    private static long n;

    public NLoginCore_512() {
        Class[] classArray = new Class[var_int_c];
        classArray[NLoginCore_512.d] = String.class;
        classArray[NLoginCore_512.e] = String.class;
        classArray[NLoginCore_512.f] = Integer.TYPE;
        classArray[NLoginCore_512.g] = Integer.TYPE;
        classArray[NLoginCore_512.h] = Integer.TYPE;
        Objects.requireNonNull(Player.class.getMethod((String)NLoginCore_512.c("㺀", (int)var_int_a, (long)var_long_b), classArray));
        Objects.requireNonNull(Player.class.getMethod((String)NLoginCore_512.c("㺃", (int)(i & j), (long)k), new Class[l]));
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0x4FAC541FECD61879L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(28 + 41), (byte)(21 + 62), (byte)(37 + 10), (byte)(27 + 40), (byte)(17 + 49), 67, (byte)(37 + 10), (byte)(50 + 30), (byte)(51 + 24), 67, (byte)(70 + 13), (byte)(50 + 3), (byte)(63 + 17), (byte)(6 + 91), (byte)(56 + 44), (byte)(47 + 53), (byte)(36 + 69), (byte)(62 + 48), (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ӞӫӪҭӭөӤӭӸӧҴӲӶӯӲӸҺࡑ࠾࠿ࡗࡘࡄࡐࠧ࡜ࡊ࠶ࡈࡐ࡞ࡔ", (byte)66, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_512.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void a(Player player, String object, String object2, int n, int n2, int n3) {
        if (((String)object).isEmpty() && ((String)object2).isEmpty()) {
            this.a(player);
            return;
        }
        if (((String)object).isEmpty()) {
            object = NLoginCore_512.c("㺀", (int)m, (long)(NLoginCore_512.n ^ o));
        }
        if (((String)object2).isEmpty()) {
            object2 = NLoginCore_512.c("㺃", (int)p, (long)(q ^ r));
        }
        player.sendTitle((String)object, (String)object2, n, n2, n3);
    }

    private static void b() {
        int n;
        var_long_c = 5443377811255573398L;
        long l = var_long_c ^ 0x4FAC541FECD61879L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(12 + 57), (byte)(77 + 6), (byte)(31 + 16), (byte)(46 + 21), (byte)(54 + 12), (byte)(39 + 28), (byte)(28 + 19), (byte)(61 + 19), (byte)(57 + 18), (byte)(66 + 1), (byte)(82 + 1), 53, (byte)(68 + 12), (byte)(91 + 6), (byte)(90 + 10), (byte)(81 + 19), (byte)(61 + 44), (byte)(94 + 16), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_512.var_java_lang_String_arr_b[0] = NLoginCore_076.F("ԹԿձէդաւպ֌ՠա՜՗ֈ՛ջձֆՏցոֆ՝՞", (byte)78, 70);
                    NLoginCore_512.var_java_lang_String_arr_b[1] = NLoginCore_004.D("ԅӔԚԒԆӵӧӜԘԔԗԘԙԒӯԗӱӱԤӿԩԛӲӳ", (byte)78, 68);
                    NLoginCore_512.var_java_lang_String_arr_b[2] = NLoginCore_453.A("ŌƔţƅƊƗŢƌŸƏƜţ", (byte)78, 65);
                    NLoginCore_512.var_java_lang_String_arr_b[3] = NLoginCore_004.A("ŌƔţƅƊƗŢƌŸƏƜţ", (byte)78, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_512.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԹԿձէդաւպ֌ՠառ֌րՍ՟օՒՓՍքֆ՝՞", (byte)78, 70);
                    NLoginCore_512.var_java_lang_String_arr_b[1] = NLoginCore_453.C("ԅӔԚԒԆӵӧӜԘԔԔӢԟӤӴԦԔԙԄӳԛӵӲӳ", (byte)78, 67);
                    NLoginCore_512.var_java_lang_String_arr_b[2] = NLoginCore_575.D("ӨӋӣӗӮԕӿԈӹԛӡӧ", (byte)78, 68);
                    NLoginCore_512.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ՓՂդհւՂշդնՂխՒ", (byte)78, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_512.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ԐӪԒԄԄӓӻԇӸԁӢԗӢԦԘԛԒӾԫԧԉԫӲӳ", (byte)78, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_512.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ӳӯӗӑӖӧԈԑԗӓԞԝԐԗԣәԂԜӳӴԗӧө԰ӪԜӻԐԪԣӲԓ", (byte)78, 68);
                }
            }
        }
    }

    @Override
    public void a(Player player) {
        player.resetTitle();
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-4189046604037926446L);
        var_int_c = 0x2800000 >>> 151 | 0x2800000 << ~151 + 1;
        d = (0 >>> 79 | 0 << -79) & 0xFFFFFFFF;
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(0x40000000);
        g = Integer.reverse(-1073741824);
        h = Integer.reverse(0x20000000);
        i = 0x10000000 >>> 252 | 0x10000000 << ~252 + 1;
        j = Integer.reverse(-1);
        k = Long.reverse(-4189046604037926446L);
        l = Integer.reverse(0);
        m = (0x2000000 >>> 248 | 0x2000000 << -248) & 0xFFFFFFFF;
        n = Long.reverse(7628398818182255058L);
        o = Long.reverse(-6052837899185946624L);
        p = (0x300000 >>> 52 | 0x300000 << ~52 + 1) & 0xFFFFFFFF;
        q = Long.reverse(7628398818182255058L);
        r = Long.reverse(-6052837899185946624L);
        s = Integer.reverse(0x20000000);
        t = 4096 >>> 202 | 4096 << -202;
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_512.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_512.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.C("ӱԓԕӵԙԸ԰ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)92, 67), NLoginCore_512.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶԍӺӻԓԔԀԌӣԘԆӲԄԌԚԐƑ", (byte)92, 66) + string + NLoginCore_384.E("Ւ", (byte)92, 69) + methodType.toString(), exception);
        }
    }
}

