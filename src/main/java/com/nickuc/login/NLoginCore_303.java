/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_556;
import com.nickuc.login.NLoginCore_451;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_303 {
    private static long var_long_b;
    private static int var_int_a;
    private static long var_long_c;
    private static int g;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static int e;
    private static int h;
    private static int i;
    private static int j;
    private static int f;
    private static int var_int_c;
    private static int d;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7171626733408485983L);
        var_int_c = (2048 >>> 75 | 2048 << -75) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = 0 >>> 120 | 0 << ~120 + 1;
        f = Integer.reverse(0);
        g = Integer.reverse(0);
        h = (0 >>> 87 | 0 << -87) & 0xFFFFFFFF;
        i = 2 >>> 225 | 2 << ~225 + 1;
        j = 524288 >>> 115 | 524288 << -115;
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_303.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static NLoginCore_556 a() {
        block10: {
            try {
                InputStream inputStream = NLoginCore_140.a((String)NLoginCore_303.c("㺀", (int)var_int_a, (long)var_long_b), var_int_c != 0);
                try {
                    NLoginCore_556 NLoginCore_5562;
                    block11: {
                        if (inputStream == null) break block10;
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                        try {
                            NLoginCore_5562 = NLoginCore_556.a(bufferedReader.readLine());
                            if (Collections.singletonList(bufferedReader).get(d) == null) break block11;
                        }
                        catch (Throwable throwable) {
                            if (Collections.singletonList(bufferedReader).get(f) != null) {
                                bufferedReader.close();
                            }
                            throw throwable;
                        }
                        bufferedReader.close();
                    }
                    return NLoginCore_5562;
                }
                finally {
                    if (Collections.singletonList(inputStream).get(e) != null) {
                        inputStream.close();
                    }
                }
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return null;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_303.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.E("ԬՎՐ԰ՔճիցխԼպհվոՁզֈևտօտՔ", (byte)72, 69), NLoginCore_303.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.D("ӰӽӼҿӿӻӶӿԊӹӆԄԈԁԄԊӌࡖ࠺ࡖ࡞ࡔࡆࡊࡘ࡯࠺࡟ӣ", (byte)72, 68) + string + NLoginCore_201.E("Ծ", (byte)72, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -8809112640597877225L;
        long l = var_long_c ^ 0x6CB852E7C4900E5DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(9 + 60), (byte)(24 + 59), (byte)(7 + 40), 67, 66, (byte)(56 + 11), (byte)(3 + 44), (byte)(19 + 61), (byte)(20 + 55), (byte)(56 + 11), (byte)(40 + 43), (byte)(10 + 43), (byte)(28 + 52), (byte)(14 + 83), (byte)(61 + 39), (byte)(5 + 95), (byte)(48 + 57), (byte)(102 + 8), (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_303.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ǊǒƿƶƴǖǧǚǃƽǤǨƾƬǙǬǛǥǩǎǪǯǵǤǤǪǕǰưǱǝǐ", (byte)117, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_303.var_java_lang_String_arr_b[0] = NLoginCore_138.F("֚֒ևվռ֢֞֯֋օְ֬ֆմֱֲִֶ֣֖֭֡պ֬֏ִ֛֚֙սֵ֞", (byte)117, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_303.var_java_lang_String_arr_b[0] = NLoginCore_559.F("֢ևւ֘օֈֱ֥֢֝֡լֵֶծւ֣ղֽ֩֕֬քօ", (byte)117, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_303.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ƛƯƾǖǛǐưƣǓǡƸǟƻǜǄǙƬǉǢǥǂǥƼƽ", (byte)117, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x6CB852E7C4900E5DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(50 + 19), (byte)(45 + 38), 47, (byte)(37 + 30), 66, (byte)(3 + 64), (byte)(40 + 7), (byte)(7 + 73), (byte)(73 + 2), (byte)(48 + 19), (byte)(42 + 41), (byte)(43 + 10), (byte)(3 + 77), (byte)(20 + 77), (byte)(35 + 65), (byte)(69 + 31), (byte)(19 + 86), (byte)(105 + 5), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.C("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж߀ޤ߀߈޾ް޴߂ߙޤ߉", (byte)22, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_303.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

