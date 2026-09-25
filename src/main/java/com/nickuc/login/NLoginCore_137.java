/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
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

public final class NLoginCore_137
extends Enum<NLoginCore_137> {
    public static final /* enum */ NLoginCore_137 var_com_nickuc_login_NLoginCore_137_a;
    public static final /* enum */ NLoginCore_137 var_com_nickuc_login_NLoginCore_137_b;
    public static final /* enum */ NLoginCore_137 var_com_nickuc_login_NLoginCore_137_c;
    private static final /* synthetic */ NLoginCore_137[] var_com_nickuc_login_NLoginCore_137_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static long h;
    private static long i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static int q;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_137.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 65), NLoginCore_137.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("ՙզեԨըդ՟ըճբԯխձժխճԵࢿࣅࢤ࣓࢟࣌ࢿࣖ࣋ࣁࣖࢭࣘࣉࣜՐ", (byte)58, 69) + string + NLoginCore_092.E("԰", (byte)58, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -790723643724068444L;
        long l = var_long_c ^ 0x392C2B032C396BC8L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(40 + 29), (byte)(38 + 45), (byte)(30 + 17), (byte)(45 + 22), (byte)(31 + 35), (byte)(42 + 25), (byte)(19 + 28), (byte)(14 + 66), (byte)(58 + 17), (byte)(30 + 37), (byte)(12 + 71), (byte)(4 + 49), 80, (byte)(89 + 8), (byte)(84 + 16), 100, (byte)(39 + 66), (byte)(69 + 41), (byte)(41 + 62)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(30 + 53)}, StandardCharsets.UTF_8));
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
                    NLoginCore_137.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԱԶՒՖՂԭաԱՃԴԛԻԩզԸԫՈձԱՒՈԼԹԺ", (byte)42, 70);
                    NLoginCore_137.var_java_lang_String_arr_b[1] = NLoginCore_138.B("ęĄŁŃħċĳČľŃŐě", (byte)42, 66);
                    NLoginCore_137.var_java_lang_String_arr_b[2] = NLoginCore_173.B("ĻľłŉĜĤŎĤņŔŅėłņĹīĥĖŔĻŉĹĦħ", (byte)42, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_137.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ĞģĿŃįĚŎĞİġĕĪŌĬŉŘİĦřŉĖşĦħ", (byte)42, 66);
                    NLoginCore_137.var_java_lang_String_arr_b[1] = NLoginCore_110.D("ҕ҂҃ҜѩҜҰғҁѵҟ҆ҩҩҙҜҔһѾѸҙҿ҆҇", (byte)42, 68);
                    NLoginCore_137.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ĻľłŉĜĤŎĤņŔŇĸĘŎŌŅōęĵşĴĩĦħ", (byte)42, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_137.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ĜŇĝĢńņĳĬļŇŀğĎĤŋŃŊĹĚŉĿŏĦħ", (byte)42, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_137.var_java_lang_String_arr_b[0] = NLoginCore_004.F("Զ՜ԩԵԿԽ՟ՐաԧՁԥդԧԬաԧծՃԼ՝ՅՅ՟ՔկԫՕկթԵԵ", (byte)42, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x44L;
        l ^= 0x392C2B032C396BC8L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(4 + 65), (byte)(41 + 42), (byte)(21 + 26), (byte)(11 + 56), (byte)(33 + 33), (byte)(43 + 24), (byte)(11 + 36), (byte)(60 + 20), (byte)(3 + 72), (byte)(65 + 2), (byte)(45 + 38), (byte)(49 + 4), 80, (byte)(10 + 87), 100, (byte)(34 + 66), (byte)(22 + 83), (byte)(31 + 79), (byte)(19 + 84)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("՜թըԫիէբինեԲհմխհնԸࣂࣈࢧࣖࢢ࣏ࣂࣙ࣎ࣄࣙࢰࣛ࣌ࣟ", (byte)61, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_137.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    private NLoginCore_137() {
    }

    static {
        var_int_a = Integer.reverse(-1073741824);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0x40000000);
        e = -2147483647 >>> 127 | -2147483647 << ~127 + 1;
        f = (6 >>> 1 | 6 << ~1 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = Long.reverse(2706885651622748335L);
        i = Long.reverse(0x2200000000000000L);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(2706885651622748335L);
        m = Long.reverse(0x2200000000000000L);
        n = (0x2000000 >>> 57 | 0x2000000 << -57) & 0xFFFFFFFF;
        o = 0x4000000 >>> 121 | 0x4000000 << ~121 + 1;
        p = Long.reverse(545157830484910255L);
        q = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_137.b();
        var_com_nickuc_login_NLoginCore_137_a = new NLoginCore_137();
        var_com_nickuc_login_NLoginCore_137_b = new NLoginCore_137();
        var_com_nickuc_login_NLoginCore_137_c = new NLoginCore_137();
        var_com_nickuc_login_NLoginCore_137_arr_a = NLoginCore_137.a();
    }

    private static /* synthetic */ NLoginCore_137[] a() {
        NLoginCore_137[] NLoginCore_137Array = new NLoginCore_137[var_int_a];
        NLoginCore_137Array[NLoginCore_137.var_int_b] = var_com_nickuc_login_NLoginCore_137_a;
        NLoginCore_137Array[NLoginCore_137.var_int_c] = var_com_nickuc_login_NLoginCore_137_b;
        NLoginCore_137Array[NLoginCore_137.d] = var_com_nickuc_login_NLoginCore_137_c;
        return NLoginCore_137Array;
    }

    public static NLoginCore_137 valueOf(String string) {
        return Enum.valueOf(NLoginCore_137.class, string);
    }

    public static NLoginCore_137[] values() {
        return (NLoginCore_137[])var_com_nickuc_login_NLoginCore_137_arr_a.clone();
    }
}

