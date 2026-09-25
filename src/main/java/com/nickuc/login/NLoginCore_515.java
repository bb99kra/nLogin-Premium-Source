/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

public final class NLoginCore_515
extends Enum<NLoginCore_515> {
    public static final /* enum */ NLoginCore_515 var_com_nickuc_login_NLoginCore_515_a;
    public static final /* enum */ NLoginCore_515 var_com_nickuc_login_NLoginCore_515_b;
    private final boolean aR;
    private static final /* synthetic */ NLoginCore_515[] var_com_nickuc_login_NLoginCore_515_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static int e;
    private static int f;
    private static long g;
    private static int h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;
    private static int n;

    private static /* synthetic */ NLoginCore_515[] a() {
        NLoginCore_515[] NLoginCore_515Array = new NLoginCore_515[var_int_a];
        NLoginCore_515Array[NLoginCore_515.var_int_b] = var_com_nickuc_login_NLoginCore_515_a;
        NLoginCore_515Array[NLoginCore_515.var_int_c] = var_com_nickuc_login_NLoginCore_515_b;
        return NLoginCore_515Array;
    }

    @Generated
    private NLoginCore_515(boolean bl) {
        this.aR = bl;
    }

    public static NLoginCore_515[] values() {
        return (NLoginCore_515[])var_com_nickuc_login_NLoginCore_515_arr_a.clone();
    }

    @Generated
    public boolean aQ() {
        return this.aR;
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x298A0B8F8F88CA8FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(7 + 62), (byte)(13 + 70), (byte)(42 + 5), (byte)(46 + 21), (byte)(33 + 33), 67, (byte)(40 + 7), (byte)(29 + 51), (byte)(63 + 12), (byte)(47 + 20), (byte)(36 + 47), (byte)(20 + 33), (byte)(28 + 52), (byte)(3 + 94), (byte)(21 + 79), (byte)(6 + 94), (byte)(71 + 34), (byte)(11 + 99), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.F("ՉՖՕԘ՘ՔՏ՘գՒԟ՝ա՚՝գԥࢱࣁ࢜ࢠ࢞ࢱࣃࢸࢹࢺࢹࣂࣂ࣍", (byte)42, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_515.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_515.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.E("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)106, 69), NLoginCore_515.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.C("Ֆգբԥեա՜եհ՟ԬժծէժհԲࢾ࣎ࢩࢭࢫࢾ࣐ࣅࣆࣇࣆ࣏࣏ࣚՌ", (byte)106, 67) + string + NLoginCore_110.F("ՠ", (byte)106, 70) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_515 valueOf(String string) {
        return Enum.valueOf(NLoginCore_515.class, string);
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = (0 >>> 158 | 0 << -158) & 0xFFFFFFFF;
        var_int_c = (16 >>> 68 | 16 << ~68 + 1) & 0xFFFFFFFF;
        d = 524288 >>> 242 | 524288 << -242;
        e = (256 >>> 39 | 256 << -39) & 0xFFFFFFFF;
        f = 0 >>> 106 | 0 << ~106 + 1;
        g = Long.reverse(-8731838616572922688L);
        h = (0 >>> 247 | 0 << ~247 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1;
        k = Long.reverse(2509146053343835328L);
        l = Long.reverse(-6629298651489370112L);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[d];
        var_java_lang_String_arr_b = new String[e];
        NLoginCore_515.b();
        var_com_nickuc_login_NLoginCore_515_a = new NLoginCore_515(i != 0);
        var_com_nickuc_login_NLoginCore_515_b = new NLoginCore_515(n != 0);
        var_com_nickuc_login_NLoginCore_515_arr_a = NLoginCore_515.a();
    }

    private static void b() {
        int n;
        var_long_c = 229548312357915460L;
        long l = var_long_c ^ 0x298A0B8F8F88CA8FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(33 + 36), (byte)(75 + 8), (byte)(32 + 15), (byte)(56 + 11), (byte)(21 + 45), (byte)(62 + 5), (byte)(20 + 27), (byte)(49 + 31), (byte)(29 + 46), 67, (byte)(11 + 72), (byte)(10 + 43), (byte)(6 + 74), (byte)(44 + 53), (byte)(28 + 72), 100, (byte)(50 + 55), (byte)(100 + 10), (byte)(54 + 49)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(45 + 24), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_515.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՅՏՆՕ֋Շ՘֌կօլՕ", (byte)81, 69);
                    NLoginCore_515.var_java_lang_String_arr_b[1] = NLoginCore_559.F("ֆ՗ըւվՉքՄիտհՕ", (byte)81, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_515.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ՐՇՅւտ՘ՂՈւբՇՕ", (byte)81, 69);
                    NLoginCore_515.var_java_lang_String_arr_b[1] = NLoginCore_138.B("ŤűƎŻŜƓƁƏŶŬşũ", (byte)81, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_515.var_java_lang_String_arr_b[0] = NLoginCore_387.E("բըֈ՞ՂևփՄկփրբհժ֌֕ՐքփղՕգՠա", (byte)81, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_515.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ӭӮԓԤԁӜӟԐӿӧԌԧӫԖԉԆԱӯԃԩԆԅӱԩԸԆԯԵԔԵԟԚ", (byte)81, 68);
                }
            }
        }
    }
}

