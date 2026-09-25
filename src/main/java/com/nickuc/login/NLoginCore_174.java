/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
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
import lombok.Generated;

public class NLoginCore_174
extends NLoginCore_473 {
    private static long g;
    private static int j;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_i;
    private static int f;
    public static final int var_int_c;
    private final String var_java_lang_String_i;
    private static long d;
    private static int var_int_b;
    private static long var_long_c;
    private static int h;
    private static int e;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_174.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.D("ϣЅЇϧЋЪТиФϳбЧеЯϸНпожмжЋ", (byte)2, 68), NLoginCore_174.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.E("ԡԮԭӰ԰Ԭԧ԰ԻԪӷԵԹԲԵԻӽ࢕ࢋࢗࢗࡧ࢒ࢍࢉԑ", (byte)2, 69) + string + NLoginCore_138.A("½", (byte)2, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 221 | 0 << ~221 + 1;
        var_int_b = -1 >>> 17 | -1 << ~17 + 1;
        d = Long.reverse(-6976635012888672698L);
        e = 8192 >>> 205 | 8192 << ~205 + 1;
        f = -1 >>> 42 | -1 << ~42 + 1;
        g = Long.reverse(-6976635012888672698L);
        h = 32 >>> 36 | 32 << ~36 + 1;
        var_int_i = Integer.reverse(0x40000000);
        j = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[var_int_i];
        NLoginCore_174.b();
        var_int_c = j;
    }

    private static void b() {
        int n;
        var_long_c = 7089770371003479171L;
        long l = var_long_c ^ 0xBA0AA73C9121C5F4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(13 + 56), (byte)(19 + 64), 47, (byte)(14 + 53), (byte)(61 + 5), (byte)(44 + 23), (byte)(22 + 25), (byte)(6 + 74), (byte)(18 + 57), (byte)(37 + 30), (byte)(46 + 37), (byte)(28 + 25), (byte)(3 + 77), (byte)(4 + 93), (byte)(43 + 57), (byte)(88 + 12), 105, (byte)(40 + 70), (byte)(41 + 62)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
                    NLoginCore_174.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ƆƱǐƫƌƴƬƓǒǆƥǇƲƨƶƺƚƬǖƹƳƷƻǔǟǔƣƿǁƷƫǠưƬǇǍƯǎǣǆǦǶǩǣǭǐǳǛǓǛǺǙǵǄǹȅǔȇȊǙǉȎȊǾ", (byte)108, 66);
                    NLoginCore_174.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ƱǉǁǔƯƍƕƍǂƒǌƟ", (byte)108, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_174.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƆƱǐƫƌƴƬƓǒǆƥǇƲƨƶƺƚƬǖƹƳƷƻǔǟǔƣƿǁƷƫǠưƬǇǍƯǎǣǆǦǶǩǣǭǐǳǛǓǛǺǙǵƼǿǧȂƻǜǈȅǕǋǪ", (byte)108, 65);
                    NLoginCore_174.var_java_lang_String_arr_b[1] = NLoginCore_575.E("յ֘֗վռ֙զմ֒սզհ", (byte)108, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_174.var_java_lang_String_arr_b[0] = NLoginCore_076.D("դխՔ՞հձժձ՚դՋՍՍԷՊիԿ՜տՍձՒէՑռՇռժՋ՛ձժ", (byte)108, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_174.var_java_lang_String_arr_b[0] = NLoginCore_092.D("հըՁԧԲԩ՘չճԻՑՋտժլՐՒՍԶշօչ՛ր՟ւ֍չվեվ֎", (byte)108, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x7AL;
        l ^= 0xBA0AA73C9121C5F4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(67 + 2), (byte)(6 + 77), (byte)(24 + 23), (byte)(30 + 37), (byte)(18 + 48), 67, (byte)(41 + 6), (byte)(52 + 28), (byte)(55 + 20), (byte)(64 + 3), (byte)(5 + 78), (byte)(36 + 17), (byte)(16 + 64), (byte)(43 + 54), (byte)(20 + 80), (byte)(40 + 60), (byte)(49 + 56), (byte)(63 + 47), (byte)(40 + 63)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.D("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ࢔ࢊ࢖࢖ࡦ࢑ࢌ࢈", (byte)88, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_174.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String getKnownName() {
        return this.var_java_lang_String_i;
    }

    @Generated
    public NLoginCore_174(String string) {
        this.var_java_lang_String_i = string;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_174.c("㺀", (int)(var_int_a & var_int_b), (long)d) + this.getKnownName() + (String)NLoginCore_174.c("㺃", (int)(e & f), (long)g);
    }
}

