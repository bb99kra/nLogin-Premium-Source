/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_051;
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

public class NLoginCore_081
implements NLoginCore_051 {
    private static long g;
    private static long d;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static int k;
    private static int l;
    private final String by;
    private static int h;
    private final Object var_java_lang_Object_f;
    private static long c;
    private static long m;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private final String bx;
    private static int o;
    private static int var_int_b;
    private static int var_int_a;
    private static long j;
    private static int var_int_f;
    private static int i;

    @Generated
    public String s() {
        return this.by;
    }

    private static void b() {
        int n;
        c = -3947442576304552636L;
        long l = c ^ 0x2FC544E8A1141521L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(34 + 35), (byte)(57 + 26), (byte)(11 + 36), (byte)(27 + 40), (byte)(35 + 31), (byte)(44 + 23), (byte)(15 + 32), (byte)(33 + 47), (byte)(19 + 56), (byte)(63 + 4), (byte)(62 + 21), (byte)(18 + 35), 80, (byte)(83 + 14), (byte)(61 + 39), (byte)(93 + 7), (byte)(100 + 5), 110, (byte)(93 + 10)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
                    NLoginCore_081.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ավ֎ցՖձէն֘մ֜՘նճՒ֋֔իղբձւ՞֑օ֘զօ֊֥֛֚", (byte)93, 70);
                    NLoginCore_081.var_java_lang_String_arr_b[1] = NLoginCore_076.C("ԅԝԵԙՆԲԩԭԠՌԥԍԍԌՑԓԟՈԓՇԣԲԟԠ", (byte)93, 67);
                    NLoginCore_081.var_java_lang_String_arr_b[2] = NLoginCore_446.A("ƅƀƇƨƎųƒŲƪƈƘƲƶƏŹƐŴƳƷǃǂƏƌƍ", (byte)93, 65);
                    NLoginCore_081.var_java_lang_String_arr_b[3] = NLoginCore_446.C("ӾԵԒԗՇՄԕԃԫԢԽԔ", (byte)93, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_081.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ավ֎ցՖձէն֘մ֜՘նճՒ֋֔իղբձ֓էվՠ՝֍֪ցռւց", (byte)93, 69);
                    NLoginCore_081.var_java_lang_String_arr_b[1] = NLoginCore_384.D("ԅԝԵԙՆԲԩԭԠՌԥԿՊՑԓ԰ԿՄՆՉԫՈԟԠ", (byte)93, 68);
                    NLoginCore_081.var_java_lang_String_arr_b[2] = NLoginCore_027.E("եՠէֈծՓղՒ֊ըջհխ֝խն֙֠֞շջկլխ", (byte)93, 69);
                    NLoginCore_081.var_java_lang_String_arr_b[3] = NLoginCore_138.D("Ԗԓ԰ԣՊՈՁՉՂԊԟԔ", (byte)93, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_081.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƲƇƢŽƴŰƉŲŴƃŴŴƏƶƛƁƀƍǁƥưƵƌƍ", (byte)93, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_081.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ơƦƤƮƈſƕƂŲƣźųƴƘƉǂŹƀǂƶƢſƘǁƲƫƊƭƭƹƱƱ", (byte)93, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x4EL;
        l ^= 0x2FC544E8A1141521L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(29 + 40), (byte)(37 + 46), (byte)(30 + 17), (byte)(44 + 23), 66, (byte)(53 + 14), (byte)(14 + 33), (byte)(51 + 29), (byte)(59 + 16), (byte)(36 + 31), (byte)(28 + 55), (byte)(6 + 47), (byte)(70 + 10), (byte)(56 + 41), (byte)(75 + 25), (byte)(83 + 17), (byte)(2 + 103), (byte)(14 + 96), (byte)(31 + 72)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("բկծԱձխըձռիԸնպճնռԾࣙࢬࣕࢹࢨࣙࣈ࣓࣠ࣝࣞࣞࣔࢰࣣ", (byte)67, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_081.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_081.c("㺀", (int)(var_int_a & var_int_b), (long)d) + this.q() + (String)NLoginCore_081.c("㺃", (int)(e & var_int_f), (long)g) + this.s() + (String)NLoginCore_081.c("㺆", (int)(h & i), (long)j) + this.e() + (String)NLoginCore_081.c("㺉", (int)(k & l), (long)m);
    }

    @Generated
    public Object e() {
        return this.var_java_lang_Object_f;
    }

    @Override
    public <T> T c() {
        return (T)this.var_java_lang_Object_f;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_081.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("ՃեէՇի֊ւ֘քՓ֑և֕֏՘ս֖֖֟֞֜ի", (byte)95, 69), NLoginCore_081.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżԗӪԓӷӦԗԆԞԛԜԜԑԒӮԡƗ", (byte)95, 66) + string + NLoginCore_387.B("ŷ", (byte)95, 66) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 221 | 0 << ~221 + 1;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(5810409003405798547L);
        e = (256 >>> 8 | 256 << ~8 + 1) & 0xFFFFFFFF;
        var_int_f = (-1 >>> 168 | -1 << -168) & 0xFFFFFFFF;
        g = Long.reverse(5810409003405798547L);
        h = Integer.reverse(0x40000000);
        i = -1 >>> 233 | -1 << ~233 + 1;
        j = Long.reverse(5810409003405798547L);
        k = Integer.reverse(-1073741824);
        l = (-1 >>> 43 | -1 << ~43 + 1) & 0xFFFFFFFF;
        m = Long.reverse(5810409003405798547L);
        n = Integer.reverse(0x20000000);
        o = 4 >>> 64 | 4 << -64;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_081.b();
    }

    @Generated
    public String q() {
        return this.bx;
    }

    @Generated
    public NLoginCore_081(String string, String string2, Object object) {
        this.bx = string;
        this.by = string2;
        this.var_java_lang_Object_f = object;
    }
}

