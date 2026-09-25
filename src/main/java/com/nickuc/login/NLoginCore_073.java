/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 */
package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_193;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_184;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_073 {
    private static long e;
    private static long g;
    private static int f;
    private static int k;
    private static final Cache<String, NLoginCore_184> cfr_renamed_6;
    private static int l;
    private static long c;
    private static final Cache<String, NLoginCore_280> cfr_renamed_7;
    private static long d;
    private static int var_int_a;
    private static int var_int_b;
    private static long n;
    private static long var_long_j;
    private static long m;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_i;
    private static long h;
    private static String[] var_java_lang_String_arr_a;

    public static void a(String string, String string2, NLoginCore_280 NLoginCore_280) {
        String string3 = string + string2;
        if (NLoginCore_280 != NLoginCore_280.var_com_nickuc_login_NLoginCore_280_a) {
            cfr_renamed_7.put((Object)string3, (Object)NLoginCore_280);
        } else {
            cfr_renamed_7.invalidate((Object)string3);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        d = Long.reverse(-6329595938288172772L);
        e = Long.reverse(-432345564227567616L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-6329595938288172772L);
        h = Long.reverse(-432345564227567616L);
        var_int_i = (0x20000000 >>> 220 | 0x20000000 << -220) & 0xFFFFFFFF;
        var_long_j = Long.reverse(5920195048159576348L);
        k = Integer.reverse(-1073741824);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(-1152921504606846976L);
        n = Long.reverse(-5476377146882523136L);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_073.b();
        cfr_renamed_7 = Caffeine.newBuilder().expireAfterWrite(m, TimeUnit.SECONDS).build();
        cfr_renamed_6 = Caffeine.newBuilder().expireAfterWrite(n, TimeUnit.SECONDS).build();
    }

    public static NLoginCore_280 com_nickuc_login_NLoginCore_280_a(String string, InetAddress inetAddress) {
        String string2 = string + inetAddress.getHostAddress();
        NLoginCore_280 NLoginCore_280 = (NLoginCore_280)((Object)cfr_renamed_7.getIfPresent((Object)string2));
        return NLoginCore_280 != null ? NLoginCore_280 : NLoginCore_280.var_com_nickuc_login_NLoginCore_280_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_073.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("ӰԒԔӴԘԷԯՅԱԀԾԴՂԼԅԪՌՋՃՉՃԘ", (byte)12, 69), NLoginCore_073.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.C("мщшЋычтыіхВѐєэѐіИާޥޯޖޫެޯ޹ްЭ", (byte)12, 67) + string + NLoginCore_027.A("Ñ", (byte)12, 65) + methodType.toString(), exception);
        }
    }

    public static void a(NLoginType_008 NLoginType_008, String string, InetAddress inetAddress, NLoginCore_280 NLoginCore_280) {
        String string2 = inetAddress.getHostAddress();
        NLoginCore_073.a(NLoginType_008, string, string2, NLoginCore_280);
        NLoginCore_073.a(string, string2, NLoginCore_280);
    }

    public static void a(NLoginType_008 NLoginType_008, String string, InetAddress inetAddress, NLoginCore_184 NLoginCore_1842) {
        String string2 = inetAddress.getHostAddress();
        NLoginCore_073.a(NLoginType_008, string, string2, NLoginCore_1842);
        NLoginCore_073.a(string, string2, NLoginCore_1842);
    }

    private static void a(NLoginType_008 NLoginType_008, String string, String string2, Enum<?> enum_) {
        NLoginCore_193 NLoginCore_193 = NLoginType_008.com_nickuc_login_NLoginCore_193_a();
        if (NLoginCore_193 != null) {
            NLoginCore_193.a(var_int_a, jSONObject -> {
                jSONObject.put((String)NLoginCore_073.c("㺀", (int)var_int_b, (long)(d ^ e)), (Object)string);
                jSONObject.put((String)NLoginCore_073.c("㺃", (int)f, (long)(g ^ h)), (Object)string2);
                jSONObject.put((String)NLoginCore_073.c("㺆", (int)var_int_i, (long)var_long_j), (Object)enum_.name());
            });
        }
    }

    public static void a(String string, String string2, NLoginCore_184 NLoginCore_1842) {
        String string3 = string + string2;
        if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_a) {
            cfr_renamed_6.put((Object)string3, (Object)NLoginCore_1842);
        } else {
            cfr_renamed_6.invalidate((Object)string3);
        }
    }

    private static void b() {
        int n;
        c = 4071299666573202453L;
        long l = c ^ 0x708E94500FF18B24L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(38 + 31), (byte)(9 + 74), (byte)(22 + 25), (byte)(52 + 15), (byte)(14 + 52), (byte)(42 + 25), 47, (byte)(17 + 63), (byte)(7 + 68), (byte)(37 + 30), (byte)(35 + 48), (byte)(11 + 42), 80, (byte)(43 + 54), (byte)(96 + 4), (byte)(54 + 46), (byte)(100 + 5), (byte)(34 + 76), (byte)(71 + 32)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
                    NLoginCore_073.var_java_lang_String_arr_b[0] = NLoginCore_076.D("վՎըըչպէՠՋհՎ՜", (byte)117, 68);
                    NLoginCore_073.var_java_lang_String_arr_b[1] = NLoginCore_027.E("֨ա֍֘։ժիրթծռչ", (byte)117, 69);
                    NLoginCore_073.var_java_lang_String_arr_b[2] = NLoginCore_223.D("ւ֍փ՘֋օև֐տ՞֕՜", (byte)117, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_073.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ǃƷǓƟƴƽǘƥǫǥƫǬƨǪǏǅƾǴǰǶǪǵƼƽ", (byte)117, 65);
                    NLoginCore_073.var_java_lang_String_arr_b[1] = NLoginCore_110.E("֔տ֦֜֙լ֍չփ֒իչ", (byte)117, 69);
                    NLoginCore_073.var_java_lang_String_arr_b[2] = NLoginCore_173.D("Ս՞֎ձՃ։՞ՌՇւի՜", (byte)117, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_073.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ƙǋƶƾǃǥƲǘǤƫƦǚǉƹƪǈǑǈǦǑǉǏƼƽ", (byte)117, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_073.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ւ֍էտֆՠ֏՝՟ֆ֑՜", (byte)117, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x5FL;
        l ^= 0x708E94500FF18B24L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(55 + 14), (byte)(74 + 9), (byte)(8 + 39), (byte)(26 + 41), (byte)(19 + 47), (byte)(6 + 61), (byte)(6 + 41), (byte)(18 + 62), 75, (byte)(58 + 9), (byte)(18 + 65), (byte)(27 + 26), (byte)(5 + 75), (byte)(57 + 40), (byte)(57 + 43), (byte)(91 + 9), (byte)(73 + 32), (byte)(21 + 89), (byte)(87 + 16)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.A("ŚŧŦĩũťŠũŴţİŮŲūŮŴĶӅӃӍҴӉӊӍӗӎ", (byte)60, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_073.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_184 com_nickuc_login_NLoginCore_184_a(String string, InetAddress inetAddress) {
        String string2 = string + inetAddress.getHostAddress();
        NLoginCore_184 NLoginCore_1842 = (NLoginCore_184)((Object)cfr_renamed_6.getIfPresent((Object)string2));
        return NLoginCore_1842 != null ? NLoginCore_1842 : NLoginCore_184.var_com_nickuc_login_NLoginCore_184_a;
    }
}

