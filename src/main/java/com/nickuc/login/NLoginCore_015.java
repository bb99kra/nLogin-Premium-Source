/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_061;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_065;
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

public class NLoginCore_015
implements NLoginCore_061 {
    public static final NLoginCore_015 var_com_nickuc_login_NLoginCore_015_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_b;
    private static int var_int_a;
    private static int f;
    private static int g;
    private static long d;
    private static long c;
    private static String[] var_java_lang_String_arr_a;
    private static int h;
    private static int e;

    @Override
    public <T> T c() {
        throw new UnsupportedOperationException();
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(6161421232654485144L);
        d = Long.reverse(-4899916394579099648L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
        g = 16384 >>> 110 | 16384 << ~110 + 1;
        h = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[g];
        var_java_lang_String_arr_b = new String[h];
        NLoginCore_015.b();
        var_com_nickuc_login_NLoginCore_015_a = new NLoginCore_015();
    }

    @Override
    public boolean i(String string) {
        return e != 0;
    }

    @Generated
    private NLoginCore_015() {
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_015.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.C("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ԰ՕշնծմծՃ", (byte)106, 67), NLoginCore_015.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("Ֆգբԥեա՜եհ՟ԬժծէժհԲࣈࣅ࣊ࣄࣄ࣑ࣉ࣍ࢯ࣒࣋Չ", (byte)106, 67) + string + NLoginCore_223.B("ƍ", (byte)106, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3DL;
        l ^= 0x4B62A5F87D7BC975L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(38 + 31), (byte)(50 + 33), (byte)(2 + 45), (byte)(63 + 4), (byte)(3 + 63), (byte)(6 + 61), (byte)(14 + 33), (byte)(44 + 36), (byte)(34 + 41), (byte)(34 + 33), 83, (byte)(16 + 37), (byte)(63 + 17), (byte)(45 + 52), 100, (byte)(90 + 10), (byte)(50 + 55), (byte)(97 + 13), (byte)(44 + 59)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(23 + 60)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("԰ԽԼӿԿԻԶԿՊԹԆՄՈՁՄՊԌࢢ࢟ࢤ࢞࢞ࢫࢣࢧࢉࢬࢥ", (byte)17, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_015.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void k(String string) {
        System.out.println(NLoginCore_065.d(string, f != 0));
    }

    private static void b() {
        int n;
        c = 1828980241834672554L;
        long l = c ^ 0x4B62A5F87D7BC975L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(57 + 12), (byte)(73 + 10), (byte)(28 + 19), (byte)(31 + 36), (byte)(18 + 48), (byte)(35 + 32), (byte)(23 + 24), (byte)(68 + 12), 75, (byte)(10 + 57), (byte)(65 + 18), (byte)(6 + 47), (byte)(6 + 74), (byte)(6 + 91), (byte)(73 + 27), (byte)(34 + 66), (byte)(79 + 26), 110, (byte)(18 + 85)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_015.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ũŒŉōŭĲŐŷŕŅŎŃ", (byte)62, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_015.var_java_lang_String_arr_b[0] = NLoginCore_559.E("ՐաաբթՀԹնծՐձյՔըլւՏՃջղնֆՍՎ", (byte)62, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_015.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ԯԯՒԶոՒշՆծղոՙխճթՙւ՗ակՐ՟ևղՇ՘շՆշւՌփ", (byte)62, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_015.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ҹӀҼӃӅӧҾӞӢӬӞұӓҳҲӍӭӬӘӫӉӇӘӗӞӺӯӳӲӔӯӹ", (byte)62, 68);
                }
            }
        }
    }

    @Override
    public void l(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return NLoginCore_015.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
    }
}

