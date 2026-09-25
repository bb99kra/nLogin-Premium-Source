/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_539
extends NLoginCore_473 {
    private static String[] var_java_lang_String_arr_b;
    public static final int var_int_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_h;
    private final String var_java_lang_String_h;
    private static long f;
    private static int k;
    private static int var_int_c;
    @Nullable
    private final UUID var_java_util_UUID_a;
    private static int l;
    private static String[] var_java_lang_String_arr_a;
    private static long j;
    private static long g;
    private static int m;
    private static long var_long_b;
    private static long d;
    private static int e;
    private static long i;
    @Nullable
    private final UUID var_java_util_UUID_b;

    @Generated
    public String getName() {
        return this.var_java_lang_String_h;
    }

    @Nullable
    @Generated
    public UUID getBedrockId() {
        return this.var_java_util_UUID_b;
    }

    @Generated
    public NLoginCore_539(String string, @Nullable UUID uUID, @Nullable UUID uUID2) {
        this.var_java_lang_String_h = string;
        this.var_java_util_UUID_a = uUID;
        this.var_java_util_UUID_b = uUID2;
    }

    static {
        var_int_a = 0 >>> 184 | 0 << -184;
        var_long_b = Long.reverse(2085628838507372296L);
        var_int_c = (65536 >>> 80 | 65536 << -80) & 0xFFFFFFFF;
        d = Long.reverse(2085628838507372296L);
        e = Integer.reverse(0x40000000);
        f = Long.reverse(-6993628010271547640L);
        g = Long.reverse(-9079256848778919936L);
        var_int_h = Integer.reverse(-1073741824);
        i = Long.reverse(-6993628010271547640L);
        j = Long.reverse(-9079256848778919936L);
        k = 32768 >>> 109 | 32768 << -109;
        l = Integer.reverse(0x20000000);
        m = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_539.b();
        var_int_b = m;
    }

    @Nullable
    @Generated
    public UUID getMojangId() {
        return this.var_java_util_UUID_a;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_539.c("㺀", (int)var_int_a, (long)var_long_b) + this.getName() + (String)NLoginCore_539.c("㺃", (int)var_int_c, (long)d) + this.getMojangId() + (String)NLoginCore_539.c("㺆", (int)e, (long)(f ^ g)) + this.getBedrockId() + (String)NLoginCore_539.c("㺉", (int)var_int_h, (long)(i ^ j));
    }

    private static String a(int n, long l) {
        l ^= 0x41L;
        l ^= 0x7E640CC4B04226B1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(44 + 25), (byte)(36 + 47), (byte)(7 + 40), (byte)(29 + 38), (byte)(23 + 43), (byte)(39 + 28), 47, (byte)(21 + 59), (byte)(16 + 59), (byte)(9 + 58), 83, (byte)(22 + 31), (byte)(16 + 64), (byte)(93 + 4), (byte)(34 + 66), (byte)(8 + 92), (byte)(7 + 98), (byte)(101 + 9), (byte)(30 + 73)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.C("իոշԺպնձպօմՁտփռտօՇࢹ࣓࣎ࣘࣙࢱࣇࣣࣛ", (byte)113, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_539.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_539.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("ËíïÏóĒĊĠČÛęďĝėàąħĦĞĤĞó", (byte)18, 65), NLoginCore_539.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("юћњНѝљєѝѨїФѢѦџѢѨЪޜ޶ޱ޻޼ޔު޾߆п", (byte)18, 68) + string + NLoginCore_387.E("Ԉ", (byte)18, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 1223660951809920889L;
        long l = var_long_c ^ 0x7E640CC4B04226B1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(68 + 15), (byte)(32 + 15), 67, (byte)(38 + 28), (byte)(36 + 31), (byte)(43 + 4), (byte)(57 + 23), (byte)(40 + 35), (byte)(44 + 23), (byte)(47 + 36), (byte)(45 + 8), (byte)(64 + 16), (byte)(7 + 90), (byte)(21 + 79), (byte)(76 + 24), (byte)(104 + 1), (byte)(87 + 23), (byte)(65 + 38)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_539.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ŐŇŒŒńōŬňŧżŊĵŭźżŏųĽſŘňƄŷŖšŦťƃšŇŌŧƌŞŤŭƓŏŐƘŸƐŧŹřƙŹźűşƘƥƇƁŮů", (byte)62, 65);
                    NLoginCore_539.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ӇӒҤҴҽӭӬҪһӐӃӆӟӎӫӊӒӏӢҺӽӻӂӃ", (byte)62, 67);
                    NLoginCore_539.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ңӄҴҳҷӨӇүӪӰӋӐӵҳҶӓӔӁӦӰӰӅӂӃ", (byte)62, 68);
                    NLoginCore_539.var_java_lang_String_arr_b[3] = NLoginCore_223.F("՛԰իՇէա԰ԺյԼԸՂ", (byte)62, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_539.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ŐŇŒŒńōŬňŧżŊĵŭźżŏųĽſŘňƄŷŖšŦťƃšŇŌŧƌŞŤŭƓŏŐƘŸƐŨųśŹƚžŚƏƅƓƣƁŮů", (byte)62, 66);
                    NLoginCore_539.var_java_lang_String_arr_b[1] = NLoginCore_451.E("Ւ՝ԯԿՈոշԵՆ՛ՏոԹԷրփմՏքււնՍՎ", (byte)62, 69);
                    NLoginCore_539.var_java_lang_String_arr_b[2] = NLoginCore_110.A("įŐŀĿŃŴœĻŶżŘŪŚűŕŚŗŲűźŹƇŎŏ", (byte)62, 65);
                    NLoginCore_539.var_java_lang_String_arr_b[3] = NLoginCore_427.D("ӠҥӀӔӕӊӌҭҿӇӂҷ", (byte)62, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_539.var_java_lang_String_arr_b[0] = NLoginCore_384.D("ҶҼӋӜҞҸҩӝӇҫҩҽҮӡӥҷӸҲӧӔӺӕӂӃ", (byte)62, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_539.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ŦŭņķŎŗŧŐřťĺźŜŌūĻŀŃŖŠźőŎŏ", (byte)62, 66);
                }
            }
        }
    }
}

