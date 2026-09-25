/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_454;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_259 {
    private final String cd;
    private static int var_int_b;
    private static final NLoginCore_454[] var_com_nickuc_login_NLoginCore_454_arr_a;
    private static int e;
    private static long h;
    private final NLoginCore_454[] var_com_nickuc_login_NLoginCore_454_arr_b;
    private static int n;
    private static long f;
    private static int i;
    private static long j;
    private static String[] var_java_lang_String_arr_b;
    private final UUID var_java_util_UUID_g;
    private static long c;
    private static long k;
    private static int var_int_g;
    private static int var_int_a;
    private static long d;
    private static String[] var_java_lang_String_arr_a;
    private static int l;
    private static int m;

    @Generated
    public String toString() {
        return (String)NLoginCore_259.c("㺀", (int)(var_int_a & var_int_b), (long)d) + this.java_util_UUID_b() + (String)NLoginCore_259.c("㺃", (int)e, (long)f) + this.getName() + (String)NLoginCore_259.c("㺆", (int)var_int_g, (long)h) + Arrays.deepToString(this.a()) + (String)NLoginCore_259.c("㺉", (int)i, (long)(j ^ k));
    }

    public NLoginCore_259(UUID uUID, String string) {
        this(uUID, string, var_com_nickuc_login_NLoginCore_454_arr_a);
    }

    @Generated
    public UUID java_util_UUID_b() {
        return this.var_java_util_UUID_g;
    }

    @Generated
    public NLoginCore_259(UUID uUID, String string, NLoginCore_454[] NLoginCore_454Array) {
        this.var_java_util_UUID_g = uUID;
        this.cd = string;
        this.var_com_nickuc_login_NLoginCore_454_arr_b = NLoginCore_454Array;
    }

    private static void void_b() {
        int n;
        c = 2806403288064895917L;
        long l = c ^ 0x1DFE09F1277B7362L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(21 + 48), (byte)(44 + 39), (byte)(8 + 39), (byte)(49 + 18), (byte)(63 + 3), (byte)(43 + 24), (byte)(35 + 12), (byte)(44 + 36), (byte)(51 + 24), (byte)(34 + 33), 83, (byte)(36 + 17), (byte)(34 + 46), (byte)(24 + 73), (byte)(66 + 34), (byte)(79 + 21), 105, (byte)(86 + 24), (byte)(61 + 42)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
                    NLoginCore_259.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ԿԲեՑ԰՟ՠԴԾԦԫըխՉ՝ԱըՏՕձԸՓ԰՜ԺջՉ՚ԻՕփա", (byte)47, 69);
                    NLoginCore_259.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ĴŒŕĖıĘŅĲĸŒİĥ", (byte)47, 65);
                    NLoginCore_259.var_java_lang_String_arr_b[2] = NLoginCore_384.B("ĳģĎŐēŐĚňĹĹśĴŊŀōŜİĿĨŇŧũİı", (byte)47, 66);
                    NLoginCore_259.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ŗŗįŎĴĪőĮĖŒĬĥ", (byte)47, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_259.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ıĤŗŃĢőŒĦİĘĝŚşĻŏģŚŁŇţĪŅŔĶŭŢśŞļűŇŴ", (byte)47, 66);
                    NLoginCore_259.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ҶҰҸҔҒҽҸѺҫҌҶҺҗҾҴҡҋӆҽҸҼҾҕҖ", (byte)47, 67);
                    NLoginCore_259.var_java_lang_String_arr_b[2] = NLoginCore_091.A("ĳģĎŐēŐĚňĹĹŚŀĞįŒĶĢĺıŝŅĳİı", (byte)47, 65);
                    NLoginCore_259.var_java_lang_String_arr_b[3] = NLoginCore_223.F("ԟԶԴ՜գ՗ԹՠՊԤԾԳ", (byte)47, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_259.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ҋґҗѸѶѸѾҲѿҠҚӁҵҒҪӈҬҡҽҽӎҨҕҖ", (byte)47, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_259.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ѭҹѴүҞҹҩӃѵӃӁҰҙҘҜҪҚӂҸҡҼҘҕҖ", (byte)47, 67);
                }
            }
        }
    }

    @Generated
    public NLoginCore_454[] a() {
        return this.var_com_nickuc_login_NLoginCore_454_arr_b;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_259.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("ՋխկՏճ֒֊֠֌՛֙֏֝֗ՠօ֧֦֤֞֞ճ", (byte)103, 70), NLoginCore_259.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.F("ֆ֓֒Օ֑֕֌֕֠֏՜֚֚֞֗֠բࣲࣺࣹࣟࣵँࣺࣝࣿշ", (byte)103, 70) + string + NLoginCore_201.F("՝", (byte)103, 70) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6AL;
        l ^= 0x1DFE09F1277B7362L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(2 + 67), (byte)(75 + 8), (byte)(29 + 18), (byte)(63 + 4), (byte)(10 + 56), (byte)(33 + 34), (byte)(29 + 18), (byte)(21 + 59), (byte)(26 + 49), (byte)(3 + 64), (byte)(70 + 13), (byte)(14 + 39), 80, (byte)(31 + 66), 100, (byte)(62 + 38), (byte)(17 + 88), (byte)(72 + 38), (byte)(66 + 37)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.B("ƞƫƪŭƭƩƤƭƸƧŴƲƶƯƲƸźԒԑԊӷԍԙӵԗԒ", (byte)94, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_259.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 126 | 0 << ~126 + 1) & 0xFFFFFFFF;
        var_int_b = -1 >>> 153 | -1 << ~153 + 1;
        d = Long.reverse(-2029687917120958620L);
        e = 4 >>> 66 | 4 << -66;
        f = Long.reverse(-2029687917120958620L);
        var_int_g = Integer.reverse(0x40000000);
        h = Long.reverse(-2029687917120958620L);
        i = (24576 >>> 205 | 24576 << ~205 + 1) & 0xFFFFFFFF;
        j = Long.reverse(-5344337242865643676L);
        k = Long.reverse(0x5600000000000000L);
        l = Integer.reverse(0x20000000);
        m = (0x800000 >>> 181 | 0x800000 << ~181 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_259.void_b();
        var_com_nickuc_login_NLoginCore_454_arr_a = new NLoginCore_454[n];
    }

    @Generated
    public String getName() {
        return this.cd;
    }
}

