/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_052;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_279
implements NLoginCore_249,
NLoginCore_415 {
    private static int n;
    private static int q;
    private static int j;
    private static String[] var_java_lang_String_arr_a;
    private static int f;
    private static long var_long_c;
    private static int i;
    private static int h;
    private final NLoginCore_211 ab;
    private static long k;
    private static int p;
    private static int d;
    private static int var_int_c;
    private static int m;
    private static int var_int_a;
    private static int var_int_b;
    private static int e;
    private static long o;
    private static int g;
    private static long l;
    private static String[] var_java_lang_String_arr_b;

    @Generated
    public NLoginCore_279(NLoginCore_211 NLoginCore_211) {
        this.ab = NLoginCore_211;
    }

    static {
        var_int_a = Integer.reverse(-1879048192);
        var_int_b = Integer.reverse(Integer.MIN_VALUE);
        var_int_c = (0 >>> 227 | 0 << -227) & 0xFFFFFFFF;
        d = (0 >>> 210 | 0 << ~210 + 1) & 0xFFFFFFFF;
        e = Integer.reverse(0x40000000);
        f = 0 >>> 90 | 0 << -90;
        g = (4096 >>> 140 | 4096 << ~140 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (0 >>> 9 | 0 << -9) & 0xFFFFFFFF;
        j = Integer.reverse(0);
        k = Long.reverse(-7137549614140544533L);
        l = Long.reverse(0x2400000000000000L);
        m = (4096 >>> 108 | 4096 << -108) & 0xFFFFFFFF;
        n = Integer.reverse(-1);
        o = Long.reverse(-5119936981078562325L);
        p = 0x10000000 >>> 91 | 0x10000000 << ~91 + 1;
        q = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_279.b();
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ab;
    }

    private static String a(int n, long l) {
        l ^= 0x24L;
        l ^= 0x6369129C617CCD8BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(57 + 12), (byte)(81 + 2), (byte)(41 + 6), (byte)(27 + 40), (byte)(5 + 61), (byte)(24 + 43), (byte)(45 + 2), (byte)(7 + 73), 75, (byte)(9 + 58), (byte)(17 + 66), (byte)(13 + 40), (byte)(28 + 52), (byte)(14 + 83), 100, (byte)(31 + 69), (byte)(48 + 57), (byte)(83 + 27), (byte)(50 + 53)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("ԪԷԶӹԹԵ԰ԹՄԳԀԾՂԻԾՄԆ࢐ࢊ࢐࢟ࢗࡱࡲ࢚", (byte)11, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_279.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_m, string -> {
            if (string.contains((CharSequence)NLoginCore_279.c("㺀", (int)j, (long)(k ^ l)))) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_279.c("㺃", (int)(m & n), (long)o));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[d]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[e];
        NLoginCore_445Array[NLoginCore_279.f] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        NLoginCore_445Array[NLoginCore_279.g] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    private static void b() {
        int n;
        var_long_c = -2912502550363484359L;
        long l = var_long_c ^ 0x6369129C617CCD8BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(8 + 61), (byte)(2 + 81), (byte)(41 + 6), (byte)(46 + 21), (byte)(18 + 48), (byte)(5 + 62), (byte)(26 + 21), (byte)(51 + 29), (byte)(54 + 21), (byte)(22 + 45), (byte)(23 + 60), 53, 80, (byte)(29 + 68), (byte)(9 + 91), (byte)(93 + 7), (byte)(11 + 94), (byte)(5 + 105), (byte)(71 + 32)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
                    NLoginCore_279.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ҠңӅӂҥӅңҎӓӆӗҔәӛҖҗҮӌҿӡһҺҧҨ", (byte)53, 68);
                    NLoginCore_279.var_java_lang_String_arr_b[1] = NLoginCore_173.D("ҊҠҝ҂ңңӓҔҰңҍҤҹҦҪӅүӚӖӋҳҝӑҳқҲұӓӛҹӠөӈӠҾӮӏӈҿӁҴӃӠӔӆөӓӕӱӾӉӨӟҾӏӑӚӣӀӿӇӽԄԈӿӘӢԆԇӉӼӟԐԄӯӜ", (byte)53, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_279.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԽՀբ՟ՂբՀԫհգղնՄՄժըժՍԶ՝՚խՄՅ", (byte)53, 69);
                    NLoginCore_279.var_java_lang_String_arr_b[1] = NLoginCore_324.B("ğĵĲėĸĸŨĩŅĸĢĹŎĻĿŚńůūŠňĲŦňİŇņŨŰŎŵžŝŵœƃŤŝŔŖŉŘŵũśžŨŪƆƓŞŽŴœŤŦůŸŕƔŜƒƙƝƢƂŻşƛŞťƘƨŹƞű", (byte)53, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_279.var_java_lang_String_arr_b[0] = NLoginCore_384.D("҃ҶҮҞҦҾҮӀӍӐӂӀҭҗәӕӇҜҰӐәӠҧҨ", (byte)53, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_279.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՁՌԼԫ՛ՅԯՊԩԥժճԭԲԪէժՌԹՏ՘խՄՅ", (byte)53, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_279.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 65), NLoginCore_279.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢭࢧࢭࢼࢴࢎ࢏ࢷԷ", (byte)40, 70) + string + NLoginCore_091.D("ѧ", (byte)40, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_052.C[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).i((NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b ? h : i) != 0);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() == var_int_a && NLoginType_008.com_nickuc_login_NLoginCore_495_a().q() ? var_int_b : var_int_c) != 0;
    }
}

