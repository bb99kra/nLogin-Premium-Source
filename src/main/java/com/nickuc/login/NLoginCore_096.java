/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_357;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_389;
import com.nickuc.login.NLoginInterface_032;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_096 {
    private static int var_int_a;
    public static final byte var_byte_e;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    public static final byte var_byte_c;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_d;
    private static int var_int_f;
    private static long g;
    private static int var_int_c;
    public static final byte var_byte_d;
    private static long h;
    @Nullable
    public final NLoginInterface_032 var_com_nickuc_login_NLoginInterface_032_a;
    private static int var_int_e;
    public static final AttributeKey<NLoginCore_096> var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_096__c;
    public byte var_byte_f;
    private static int var_int_b;

    /* synthetic */ NLoginCore_096(NLoginInterface_032 NLoginInterface_0322, byte by, NLoginCore_357 NLoginCore_3572) {
        this(NLoginInterface_0322, by);
    }

    private static String a(int n, long l) {
        l ^= 0x32L;
        l ^= 0x830813AC6DD3D666L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(11 + 58), (byte)(31 + 52), (byte)(34 + 13), (byte)(45 + 22), (byte)(20 + 46), 67, (byte)(28 + 19), 80, (byte)(58 + 17), (byte)(33 + 34), (byte)(22 + 61), (byte)(43 + 10), (byte)(27 + 53), (byte)(32 + 65), (byte)(55 + 45), (byte)(86 + 14), (byte)(57 + 48), (byte)(69 + 41), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ѠѭѬЯѯѫѦѯѺѩжѴѸѱѴѺмߗ޸ߌ޺ߙ߇ߓߞߊޫ޸ޭߎ", (byte)24, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_096.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_096.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("ԗԹԻԛԿ՞Ֆլ՘ԧե՛թգԬՑճղժհժԿ", (byte)51, 69), NLoginCore_096.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.B("ňŕŔėŗœŎŗŢőĞŜŠřŜŢĤҿҠҴҢӁүһӆҲғҠҕҶĽ", (byte)51, 66) + string + NLoginCore_138.B("ğ", (byte)51, 66) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_096(@Nullable NLoginInterface_032 NLoginInterface_0322, byte by) {
        this.var_com_nickuc_login_NLoginInterface_032_a = NLoginInterface_0322;
        this.var_byte_f = by;
    }

    static {
        var_int_a = 32 >>> 229 | 32 << ~229 + 1;
        var_int_b = 0x10000000 >>> 252 | 0x10000000 << ~252 + 1;
        var_int_c = Integer.reverse(0);
        var_int_d = (0x40000000 >>> 61 | 0x40000000 << ~61 + 1) & 0xFFFFFFFF;
        var_int_e = (0x100000 >>> 148 | 0x100000 << ~148 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(0);
        g = Long.reverse(1415443172793877962L);
        h = Long.reverse(0x4C00000000000000L);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_096.b();
        var_byte_c = (byte)var_int_c;
        var_byte_e = (byte)var_int_d;
        var_byte_d = (byte)var_int_e;
        var_long_c = (long)NLoginCore_389.a((String)NLoginCore_096.c("㺀", (int)var_int_f, (long)(g ^ h)));
    }

    private static void b() {
        int n;
        var_long_c = 6026243320094991816L;
        long l = var_long_c ^ 0x830813AC6DD3D666L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(6 + 77), (byte)(8 + 39), (byte)(16 + 51), (byte)(28 + 38), (byte)(12 + 55), (byte)(28 + 19), 80, (byte)(61 + 14), (byte)(14 + 53), (byte)(82 + 1), (byte)(12 + 41), (byte)(43 + 37), (byte)(86 + 11), (byte)(85 + 15), (byte)(27 + 73), (byte)(27 + 78), (byte)(45 + 65), (byte)(53 + 50)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_096.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ƯƶŸƦŲƗƲƉƎƖƾƀƢƙǁžƖƢǄƻƙƥƒƓ", (byte)96, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_096.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ՅՌԎԼԈԭՈԟԤԬՕԭՎՅԖ՝ՈՇԸՉ՜ԭ՘ԢԹՃդ՛՘Ի՜՛", (byte)96, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_096.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ԄԿԸԽԿԛՆԳԷ԰ԥԘԬ԰ԎԻԳՌՕՌԔաԨԩ", (byte)96, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_096.var_java_lang_String_arr_b[0] = NLoginCore_575.C("ԚԻԍԬԒԾՒՒԣԥԘՌՖԥՎԮ՝ԾՀԠբԷԽՆէ՜ԤԦզէՇՠ", (byte)96, 67);
                }
            }
        }
    }
}

