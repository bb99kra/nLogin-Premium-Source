/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_123 {
    private static long m;
    private static long d;
    private static long h;
    private static String[] var_java_lang_String_arr_a;
    private static int k;
    private static int i;
    private static int o;
    private static long l;
    private static String[] var_java_lang_String_arr_b;
    private final byte[] var_byte_arr_c;
    private static long j;
    private static long e;
    private static int var_int_c;
    private final int Y;
    private static int var_int_a;
    private static long var_long_c;
    private final Throwable var_java_lang_Throwable_b;
    private static int n;
    private static int f;
    private static int var_int_b;
    private static int g;

    private static String a(int n, long l) {
        l ^= 0x12L;
        l ^= 0x1B440156BCEE9125L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(67 + 2), 83, (byte)(8 + 39), 67, (byte)(32 + 34), (byte)(22 + 45), (byte)(10 + 37), (byte)(24 + 56), (byte)(43 + 32), (byte)(61 + 6), (byte)(5 + 78), (byte)(7 + 46), (byte)(62 + 18), (byte)(30 + 67), (byte)(95 + 5), (byte)(77 + 23), (byte)(35 + 70), (byte)(67 + 43), (byte)(69 + 34)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("ծջպԽսչմսֈշՄւֆտւֈՊ࣒࣓ࣙࣝࣝࣘࣘ࣋ࣥࢸ࣌", (byte)79, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_123.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public String V() {
        if (this.var_byte_arr_c == null) {
            return null;
        }
        return new String(this.var_byte_arr_c, StandardCharsets.UTF_8);
    }

    public boolean ag() {
        return (this.Y != 0 ? var_int_a : var_int_b) != 0;
    }

    @Generated
    public byte[] c() {
        return this.var_byte_arr_c;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_123.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.A("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 65), NLoginCore_123.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìѻѴѿѿѵѺѺѭ҇њѮă", (byte)23, 65) + string + NLoginCore_173.E("ԍ", (byte)23, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_123.c("㺀", (int)var_int_c, (long)(d ^ e)) + Arrays.toString(this.c()) + (String)NLoginCore_123.c("㺃", (int)(f & g), (long)h) + this.p() + (String)NLoginCore_123.c("㺆", (int)i, (long)j) + this.a() + (String)NLoginCore_123.c("㺉", (int)k, (long)(l ^ m));
    }

    @Generated
    public int p() {
        return this.Y;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0 >>> 251 | 0 << -251) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(5506700702827252376L);
        e = Long.reverse(0x4800000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = -1 >>> 157 | -1 << ~157 + 1;
        h = Long.reverse(318553932096440984L);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(318553932096440984L);
        k = (0x1800000 >>> 87 | 0x1800000 << -87) & 0xFFFFFFFF;
        l = Long.reverse(5506700702827252376L);
        m = Long.reverse(0x4800000000000000L);
        n = Integer.reverse(0x20000000);
        o = Integer.reverse(0x20000000);
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_123.b();
    }

    @Generated
    public Throwable a() {
        return this.var_java_lang_Throwable_b;
    }

    public NLoginCore_123(byte[] byArray, int n) {
        this(byArray, n, null);
    }

    private static void b() {
        int n;
        var_long_c = 1824404460065904178L;
        long l = var_long_c ^ 0x1B440156BCEE9125L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(31 + 38), (byte)(82 + 1), (byte)(25 + 22), (byte)(9 + 58), (byte)(56 + 10), (byte)(38 + 29), (byte)(31 + 16), (byte)(62 + 18), (byte)(54 + 21), 67, (byte)(5 + 78), (byte)(50 + 3), (byte)(11 + 69), 97, (byte)(27 + 73), (byte)(67 + 33), (byte)(6 + 99), (byte)(100 + 10), (byte)(20 + 83)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
                    NLoginCore_123.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ҌӗҵҦҧӓҜӔӟӋҴӒҝһӒҮӅӗҤӗӪҶөөҠӛүӡӛӈӂӬ", (byte)56, 68);
                    NLoginCore_123.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ŧşņľŦħŗķũŬŪœŨŐŮŨŘĹŗŜĸŻłŃ", (byte)56, 66);
                    NLoginCore_123.var_java_lang_String_arr_b[2] = NLoginCore_324.B("ŜœşŠĸğŌšİĪŭļšŮĨŵŵŧĶŌĺŕłŃ", (byte)56, 66);
                    NLoginCore_123.var_java_lang_String_arr_b[3] = NLoginCore_451.B("ŀŜĽūŨŋŏŞůũľķ", (byte)56, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_123.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ĞũŇĸĹťĮŦűŝņŤįōŤŀŗũĶũżŌŨŻŉƂŘŗŝŅţřŅŸŖƆŵƀũũŸŧŪŗ", (byte)56, 65);
                    NLoginCore_123.var_java_lang_String_arr_b[1] = NLoginCore_387.E("լդՋՃիԬ՜ԼծձկՎՒԶՒեՇժԿ՞ի՜՞կՅշւՓ՗ՙՃփ", (byte)56, 69);
                    NLoginCore_123.var_java_lang_String_arr_b[2] = NLoginCore_076.E("ա՘դեԽԤՑզԵԯճթծմՍԸձջՐվՁՊՇՈ", (byte)56, 69);
                    NLoginCore_123.var_java_lang_String_arr_b[3] = NLoginCore_110.A("ğũŉļŪĿŪŠĩřľķ", (byte)56, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_123.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ŁŇĢĪņōĩľůľĨŞĮŁšĭķĲūĳůŕłŃ", (byte)56, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_123.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ӌҍґҸҸҔҘҧҖӜӏҚӌӄӣҮӃӆҶӈҡҳҰұ", (byte)56, 68);
                }
            }
        }
    }

    @Generated
    public NLoginCore_123(byte[] byArray, int n, Throwable throwable) {
        this.var_byte_arr_c = byArray;
        this.Y = n;
        this.var_java_lang_Throwable_b = throwable;
    }
}

