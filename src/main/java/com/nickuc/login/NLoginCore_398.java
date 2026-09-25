/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
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
import lombok.Generated;

public class NLoginCore_398 {
    private static int l;
    private final String aP;
    private static long m;
    private static long i;
    private static long c;
    private static int o;
    private static int r;
    private static long p;
    private static long j;
    private static int k;
    private static long f;
    private static int h;
    private static String[] var_java_lang_String_arr_b;
    private static int e;
    private static int q;
    private static long g;
    private static int n;
    private final String aO;
    private static long d;
    private static long var_long_b;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_398.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.F("ԌԮ԰ԐԴՓՋաՍԜ՚Ր՞՘ԡՆըէ՟ե՟Դ", (byte)40, 70), NLoginCore_398.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ĲĿľāŁĽĸŁŌĻĈņŊŃņŌĎѴ҄ҝҨѷҍѹҙҠҫҨҢĦ", (byte)40, 65) + string + NLoginCore_173.C("ѧ", (byte)40, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    public String E() {
        return this.aO;
    }

    private static String a(int n, long l) {
        l ^= 0x13L;
        l ^= 0x3AE7B84F50009886L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(39 + 30), (byte)(34 + 49), (byte)(29 + 18), (byte)(15 + 52), 66, (byte)(46 + 21), (byte)(19 + 28), 80, (byte)(16 + 59), (byte)(32 + 35), (byte)(9 + 74), (byte)(35 + 18), (byte)(48 + 32), (byte)(52 + 45), (byte)(87 + 13), (byte)(36 + 64), (byte)(92 + 13), (byte)(45 + 65), (byte)(37 + 66)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴжޜެ߅ߐޟ޵ޡ߁߈ߓߐߊ", (byte)22, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_398.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 18 | 0 << -18) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-755007711266268155L);
        d = Long.reverse(-4035225266123964416L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-755007711266268155L);
        g = Long.reverse(-4035225266123964416L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-755007711266268155L);
        j = Long.reverse(-4035225266123964416L);
        k = 0x180000 >>> 179 | 0x180000 << ~179 + 1;
        l = (-1 >>> 235 | -1 << -235) & 0xFFFFFFFF;
        m = Long.reverse(4433139059464543237L);
        n = Integer.reverse(0x20000000);
        o = -1 >>> 230 | -1 << ~230 + 1;
        p = Long.reverse(4433139059464543237L);
        q = (-1610612736 >>> 253 | -1610612736 << ~253 + 1) & 0xFFFFFFFF;
        r = 0x2800000 >>> 151 | 0x2800000 << ~151 + 1;
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_398.b();
    }

    public static NLoginCore_398 a(String string, String string2) {
        return new NLoginCore_398(string2.replace((CharSequence)NLoginCore_398.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), (CharSequence)NLoginCore_398.c("㺃", (int)e, (long)(f ^ g))), string);
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_398.c("㺀", (int)h, (long)(i ^ j)) + this.E() + (String)NLoginCore_398.c("㺃", (int)(k & l), (long)m) + this.F() + (String)NLoginCore_398.c("㺆", (int)(n & o), (long)p);
    }

    @Generated
    public NLoginCore_398(String string, String string2) {
        this.aO = string;
        this.aP = string2;
    }

    private static void b() {
        int n;
        c = -6901534461012893265L;
        long l = c ^ 0x3AE7B84F50009886L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(58 + 11), 83, (byte)(36 + 11), (byte)(11 + 56), (byte)(39 + 27), (byte)(49 + 18), 47, (byte)(5 + 75), (byte)(13 + 62), (byte)(18 + 49), (byte)(53 + 30), (byte)(13 + 40), (byte)(74 + 6), (byte)(5 + 92), (byte)(61 + 39), (byte)(53 + 47), (byte)(72 + 33), (byte)(74 + 36), (byte)(81 + 22)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
                    NLoginCore_398.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ŶŹŷƖűŖŽƒƓşżũ", (byte)81, 66);
                    NLoginCore_398.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ƋŲƈƉƑŞƕơƐƜƚũ", (byte)81, 65);
                    NLoginCore_398.var_java_lang_String_arr_b[2] = NLoginCore_138.B("ŻśƉžƚƕŷżƠšƖƖƇƚƧŷšƧżŬſƨŹƨƦƁƪƧƬƔűŴ", (byte)81, 66);
                    NLoginCore_398.var_java_lang_String_arr_b[3] = NLoginCore_110.A("ƚōƐůƋźŚƘƃŕƎƀŘŠŨƃƇƌƊŻƣƏŧźƌƛŴžƉƏŮƚ", (byte)81, 65);
                    NLoginCore_398.var_java_lang_String_arr_b[4] = NLoginCore_027.E("օա՗ՉՈ՗ջՠնզՋՕ", (byte)81, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_398.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՖԾօՠՅՄՃշՙ՞լՕ", (byte)81, 69);
                    NLoginCore_398.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ՐՄճ՘յՃի՛֋րհՕ", (byte)81, 69);
                    NLoginCore_398.var_java_lang_String_arr_b[2] = NLoginCore_138.E("էՇյժֆցգը֌Սււճֆ֓գՍ֓ը՘ի։սսՐ֚սՙ֙՛֒ե", (byte)81, 69);
                    NLoginCore_398.var_java_lang_String_arr_b[3] = NLoginCore_201.A("ƚōƐůƋźŚƘƃŕƎƀŘŠŨƃƇƌƊŻƣƍƙƅƬƜƢƃơŭƧƩ", (byte)81, 65);
                    NLoginCore_398.var_java_lang_String_arr_b[4] = NLoginCore_110.B("ƌźŽŨƞŭŲşƙƋƖũ", (byte)81, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_398.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ŸŗƛŗƙųŨƀƌƣƜƣƗƤŴŲƟƪƭƌŭŷŴŵ", (byte)81, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_398.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ŶųŒƕŔśŨƍŪƏſƍƦųŸŧŢƘƄźƉƇŴŵ", (byte)81, 65);
                }
            }
        }
    }

    @Generated
    public String F() {
        return this.aP;
    }
}

