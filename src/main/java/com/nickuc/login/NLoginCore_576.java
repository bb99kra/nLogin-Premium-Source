/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_216;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_576 {
    private static int p;
    private static int d;
    private static int var_int_b;
    private static int e;
    private static int r;
    private static long i;
    private static int g;
    private static int j;
    private static int f;
    private static long n;
    private static long l;
    private static int o;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_b;
    private final Collection<NLoginCore_216> var_java_util_Collection_com_nickuc_login_NLoginCore_216__a;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_a;
    private static long h;
    private static int m;
    private static int var_int_a;
    private final String z;
    private static int k;
    private static int q;

    public boolean F() {
        return this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a.isEmpty();
    }

    private static void b() {
        int n;
        var_long_c = -4510380911093614257L;
        long l = var_long_c ^ 0x51009FF3A63168F0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(50 + 19), (byte)(7 + 76), (byte)(25 + 22), (byte)(25 + 42), 66, (byte)(26 + 41), (byte)(23 + 24), (byte)(73 + 7), (byte)(54 + 21), (byte)(66 + 1), (byte)(28 + 55), (byte)(38 + 15), (byte)(36 + 44), (byte)(85 + 12), (byte)(28 + 72), 100, (byte)(63 + 42), (byte)(60 + 50), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_576.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ՈՅչՈ՛֐֎վ՚Չ֏֕։ՐօՔլ֚ռէղ֍դե", (byte)116, 67);
                    NLoginCore_576.var_java_lang_String_arr_b[1] = NLoginCore_384.E("ֆ֕ն֍չ֟֜ոէ֨֠֊֥֕փֳֵ֧֊ն֐ּփք", (byte)116, 69);
                    NLoginCore_576.var_java_lang_String_arr_b[2] = NLoginCore_427.A("ƖƲǜǢǝƻǣǅƷǑǠƯ", (byte)116, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_576.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƞƛǏƞƱǦǤǔưƟǤǛǪǘǏǯǭǏǤǛǪǞƳǱǘǌǪǈǏǭƽǊ", (byte)116, 65);
                    NLoginCore_576.var_java_lang_String_arr_b[1] = NLoginCore_387.D("էն՗ծ՚րսՙՈ։վծ֗ի֏Քժձ՘֖֒֍դե", (byte)116, 68);
                    NLoginCore_576.var_java_lang_String_arr_b[2] = NLoginCore_201.C("՚՛։Ջ՝ռ֌՟ւՍվՙ", (byte)116, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_576.var_java_lang_String_arr_b[0] = NLoginCore_223.F("չագ֧ո֍ջֱ֟֡լ֎տխ֊ֳցֽ֖֑֕ջְֺ֑֡֌նւׁ֚֜", (byte)116, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_576.var_java_lang_String_arr_b[0] = NLoginCore_173.E("ՠչիֆք֝եծ֠ը֥֊հկօֹ֣֪֠ն֩֏ֳֵֶּ֦֟֠֡֯֩", (byte)116, 69);
                }
            }
        }
    }

    public boolean a(int n) {
        return (this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a.size() >= n ? var_int_a : var_int_b) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_576.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.D("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 68), NLoginCore_576.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.B("ŚŧŦĩũťŠũŴţİŮŲūŮŴĶҮҽӀӑӃӅұӖŊ", (byte)60, 66) + string + NLoginCore_451.F("Բ", (byte)60, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_576.c("㺀", (int)g, (long)(h ^ i)) + this.o() + (String)NLoginCore_576.c("㺃", (int)(j & k), (long)l) + this.a() + (String)NLoginCore_576.c("㺆", (int)m, (long)n);
    }

    @Generated
    NLoginCore_576(String string, Collection<NLoginCore_216> collection) {
        this.z = string;
        this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a = collection;
    }

    public boolean a(@Nullable Long l, int n) {
        return (this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a.size() >= n && !this.a(l) ? var_int_c : d) != 0;
    }

    public boolean a(@Nullable Long l) {
        return (l != null && !this.F() && this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a.stream().anyMatch(NLoginCore_2162 -> (NLoginCore_216.a(NLoginCore_2162) == l ? o : p) != 0) ? e : f) != 0;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = 0x20000000 >>> 189 | 0x20000000 << -189;
        d = Integer.reverse(0);
        e = 4 >>> 66 | 4 << -66;
        f = Integer.reverse(0);
        g = Integer.reverse(0);
        h = Long.reverse(-963786698341751165L);
        i = Long.reverse(0x4000000000000000L);
        j = (32 >>> 5 | 32 << -5) & 0xFFFFFFFF;
        k = -1 >>> 60 | -1 << -60;
        l = Long.reverse(-5575472716769139069L);
        m = Integer.reverse(0x40000000);
        n = Long.reverse(-5575472716769139069L);
        o = 4 >>> 2 | 4 << ~2 + 1;
        p = Integer.reverse(0);
        q = Integer.reverse(-1073741824);
        r = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_576.b();
    }

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0x51009FF3A63168F0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(15 + 68), (byte)(29 + 18), (byte)(14 + 53), (byte)(48 + 18), (byte)(19 + 48), (byte)(15 + 32), (byte)(68 + 12), (byte)(52 + 23), (byte)(35 + 32), (byte)(55 + 28), (byte)(8 + 45), (byte)(55 + 25), (byte)(8 + 89), (byte)(60 + 40), (byte)(17 + 83), 105, (byte)(47 + 63), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("ԂԏԎӑԑԍԈԑԜԋӘԖԚԓԖԜӞࡖࡥࡨࡹ࡫࡭࡙ࡾ", (byte)78, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_576.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String o() {
        return this.z;
    }

    @Generated
    public Collection<NLoginCore_216> a() {
        return this.var_java_util_Collection_com_nickuc_login_NLoginCore_216__a;
    }
}

