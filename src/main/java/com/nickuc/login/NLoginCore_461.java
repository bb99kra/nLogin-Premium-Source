/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_369;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
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

public class NLoginCore_461
implements NLoginInterface_037 {
    private static int m;
    private static int o;
    private static long f;
    private static long j;
    private static long p;
    private static int r;
    private static int var_int_a;
    private static long k;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static int t;
    private static long d;
    private static long var_long_b;
    private static int i;
    private static int h;
    private static int s;
    private static long q;
    private static int l;
    private static int n;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static int u;
    private static int v;
    private static int e;

    private String A(String string) {
        return ((NLoginCore_369)NLoginCore_566.var_com_nickuc_login_NLoginCore_566_i.com_nickuc_login_NLoginInterface_009_a()).E(string);
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray;
        if (string2.contains((CharSequence)NLoginCore_461.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)))) {
            string2 = string2.split((String)NLoginCore_461.c("㺃", (int)e, (long)(f ^ g)))[h];
        }
        if ((stringArray = string2.split((String)NLoginCore_461.c("㺆", (int)i, (long)(j ^ k)))).length != l) {
            return m != 0;
        }
        if (!stringArray[n].equalsIgnoreCase((String)NLoginCore_461.c("㺉", (int)o, (long)(p ^ q)))) {
            return r != 0;
        }
        String string3 = stringArray[s];
        String string4 = stringArray[t];
        return string4.equals(this.A(this.A(string) + string3));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_461.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ԧՉՋԫՏծզռըԷյիչճԼափւպրպՏ", (byte)67, 69), NLoginCore_461.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.C("ӡӮӭҰӰӬӧӰӻӪҷӵӹӲӵӻҽ࠯ࡃࡉࡘࡏ࠼࠽࠱࡟Ӓ", (byte)67, 67) + string + NLoginCore_559.D("Ҹ", (byte)67, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0x2FBCA6CBD7119EC1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(34 + 35), (byte)(23 + 60), 47, (byte)(65 + 2), (byte)(47 + 19), (byte)(53 + 14), (byte)(8 + 39), (byte)(76 + 4), (byte)(47 + 28), (byte)(37 + 30), (byte)(64 + 19), (byte)(15 + 38), (byte)(41 + 39), (byte)(82 + 15), (byte)(27 + 73), (byte)(94 + 6), (byte)(18 + 87), (byte)(100 + 10), (byte)(85 + 18)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.E("ԮԻԺӽԽԹԴԽՈԷԄՂՆԿՂՈԊࡼ࢐࢖ࢥ࢜ࢉࢊࡾࢬ", (byte)15, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_461.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-3476616474487829497L);
        d = Long.reverse(0x200000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-3476616474487829497L);
        g = Long.reverse(0x200000000000000L);
        h = Integer.reverse(0);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-3476616474487829497L);
        k = Long.reverse(0x200000000000000L);
        l = 0x8000000 >>> 25 | 0x8000000 << ~25 + 1;
        m = Integer.reverse(0);
        n = (0x400000 >>> 214 | 0x400000 << -214) & 0xFFFFFFFF;
        o = 24 >>> 131 | 24 << -131;
        p = Long.reverse(-3476616474487829497L);
        q = Long.reverse(0x200000000000000L);
        r = (0 >>> 74 | 0 << ~74 + 1) & 0xFFFFFFFF;
        s = (4 >>> 65 | 4 << -65) & 0xFFFFFFFF;
        t = Integer.reverse(-1073741824);
        u = 512 >>> 7 | 512 << -7;
        v = (0x400000 >>> 180 | 0x400000 << ~180 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[u];
        var_java_lang_String_arr_b = new String[v];
        NLoginCore_461.b();
    }

    private static void b() {
        int n;
        c = -2291338796244335629L;
        long l = c ^ 0x2FBCA6CBD7119EC1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(55 + 14), (byte)(25 + 58), (byte)(46 + 1), (byte)(35 + 32), (byte)(57 + 9), (byte)(2 + 65), (byte)(29 + 18), (byte)(75 + 5), (byte)(24 + 51), (byte)(18 + 49), (byte)(69 + 14), (byte)(8 + 45), 80, (byte)(15 + 82), (byte)(86 + 14), 100, (byte)(27 + 78), (byte)(6 + 104), (byte)(32 + 71)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_461.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŤŲƊŴūŶƙŽśŞƔŧ", (byte)80, 65);
                    NLoginCore_461.var_java_lang_String_arr_b[1] = NLoginCore_092.B("ŤŲƊŴūŶƙŽśŞƔŧ", (byte)80, 66);
                    NLoginCore_461.var_java_lang_String_arr_b[2] = NLoginCore_575.F("ՂՃՒ։ՓՓյթօցիՔ", (byte)80, 70);
                    NLoginCore_461.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ŸŷƃƙƙƘſŚƌƞŲŧ", (byte)80, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_461.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ƙƌŷƉūƉŮŰŬŴƔŧ", (byte)80, 66);
                    NLoginCore_461.var_java_lang_String_arr_b[1] = NLoginCore_324.E("Ս՗՜ՂզրՇՔօՠ՟Ք", (byte)80, 69);
                    NLoginCore_461.var_java_lang_String_arr_b[2] = NLoginCore_138.B("ŸŧƏƐƘƅųũŻƓŝŧ", (byte)80, 66);
                    NLoginCore_461.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ŸƍƔżƗƗƙƔŬƔŝŧ", (byte)80, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_461.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ųƙŭƖƛŶƋƎƘŮƌŧ", (byte)80, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_461.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ԊԒӾәԍӯԗԝԑԢԖӭ", (byte)80, 68);
                }
            }
        }
    }
}

