/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
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

public final class NLoginCore_536
extends Enum<NLoginCore_536> {
    public static final /* enum */ NLoginCore_536 var_com_nickuc_login_NLoginCore_536_a;
    public static final /* enum */ NLoginCore_536 var_com_nickuc_login_NLoginCore_536_b;
    private static final /* synthetic */ NLoginCore_536[] var_com_nickuc_login_NLoginCore_536_arr_a;
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
    private static long j;
    private static long k;
    private static int l;

    private static void b() {
        int n;
        var_long_c = 4117348720522431191L;
        long l = var_long_c ^ 0x85D08D3A10EB09EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(62 + 7), (byte)(35 + 48), (byte)(29 + 18), (byte)(60 + 7), (byte)(15 + 51), (byte)(44 + 23), (byte)(36 + 11), (byte)(66 + 14), (byte)(61 + 14), (byte)(47 + 20), (byte)(45 + 38), (byte)(6 + 47), 80, (byte)(28 + 69), (byte)(68 + 32), (byte)(96 + 4), (byte)(83 + 22), (byte)(106 + 4), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(60 + 23)}, StandardCharsets.UTF_8));
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
                    NLoginCore_536.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ДювЛдксѐѕЯЧЭ", (byte)16, 68);
                    NLoginCore_536.var_java_lang_String_arr_b[1] = NLoginCore_575.C("џЕѠёПрЖўждіѩмсЧоъїкѡфыий", (byte)16, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_536.var_java_lang_String_arr_b[0] = NLoginCore_384.C("їзсрџвэРУхѠѨѨѝѣіжўТѠѩлий", (byte)16, 67);
                    NLoginCore_536.var_java_lang_String_arr_b[1] = NLoginCore_223.D("џЕѠёПрЖўждїѥѩшѫЫщѨѫѲуѱий", (byte)16, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_536.var_java_lang_String_arr_b[0] = NLoginCore_076.E("ԳԦԳ԰ՇՂՋՌԡՄԧ԰Մԯ԰ՓԓԳԥՁԘՔՏՉ՜ԐՐԚ԰Լ՛Է", (byte)16, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_536.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ĄĎęĐÙėïûāýČç", (byte)16, 66);
                }
            }
        }
    }

    public static NLoginCore_536[] values() {
        return (NLoginCore_536[])var_com_nickuc_login_NLoginCore_536_arr_a.clone();
    }

    public static NLoginCore_536 valueOf(String string) {
        return Enum.valueOf(NLoginCore_536.class, string);
    }

    private static /* synthetic */ NLoginCore_536[] a() {
        NLoginCore_536[] NLoginCore_536Array = new NLoginCore_536[var_int_a];
        NLoginCore_536Array[NLoginCore_536.var_int_b] = var_com_nickuc_login_NLoginCore_536_a;
        NLoginCore_536Array[NLoginCore_536.var_int_c] = var_com_nickuc_login_NLoginCore_536_b;
        return NLoginCore_536Array;
    }

    private static String a(int n, long l) {
        l ^= 0x56L;
        l ^= 0x85D08D3A10EB09EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(5 + 64), (byte)(54 + 29), (byte)(39 + 8), (byte)(15 + 52), (byte)(48 + 18), (byte)(22 + 45), (byte)(30 + 17), (byte)(4 + 76), 75, (byte)(39 + 28), (byte)(53 + 30), (byte)(37 + 16), (byte)(23 + 57), (byte)(48 + 49), (byte)(11 + 89), (byte)(60 + 40), (byte)(52 + 53), (byte)(6 + 104), (byte)(84 + 19)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋࢦ࢙ࡺ࢝ࢢ࢚࢜ࢊ࢜࢘࢝", (byte)93, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_536.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_536.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.A("ƅƧƩƉƭǌǄǚǆƕǓǉǗǑƚƿǡǠǘǞǘƭ", (byte)111, 65), NLoginCore_536.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.B("ǀǍǌƏǏǋǆǏǚǉƖǔǘǑǔǚƜԷԪԋԮԳԭԫԛԭԩԮƳ", (byte)111, 66) + string + NLoginCore_110.C("Լ", (byte)111, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0x40000000);
        e = Integer.reverse(0x40000000);
        f = Integer.reverse(0);
        g = Long.reverse(-9128685406433065828L);
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Long.reverse(-1490580438412704612L);
        k = Long.reverse(0x6A00000000000000L);
        l = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[d];
        var_java_lang_String_arr_b = new String[e];
        NLoginCore_536.b();
        var_com_nickuc_login_NLoginCore_536_a = new NLoginCore_536();
        var_com_nickuc_login_NLoginCore_536_b = new NLoginCore_536();
        var_com_nickuc_login_NLoginCore_536_arr_a = NLoginCore_536.a();
    }
}

