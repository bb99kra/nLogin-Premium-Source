/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_020;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_572;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_051;
import java.io.File;
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

public abstract class NLoginCore_100
implements NLoginCore_116<Object>,
NLoginCore_051 {
    private static long l;
    private static long j;
    private static int o;
    private static long g;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static long m;
    private static int k;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static int n;
    private static long f;
    private static int h;
    private static int e;
    private static long var_long_b;
    protected NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____a;
    private static int i;
    private static long d;

    @Override
    public File java_io_File_c() {
        return this.var_int_a.java_io_File_c();
    }

    @Override
    public String s() {
        return this.var_int_a.s();
    }

    @Override
    public <T extends NLoginCore_100> T b() {
        return (T)this;
    }

    @Override
    public NLoginInterface_020 com_nickuc_login_NLoginInterface_020_a() {
        return this.var_int_a.com_nickuc_login_NLoginInterface_020_a();
    }

    @Override
    public NLoginCore_364 com_nickuc_login_NLoginCore_364_b() {
        return this.var_int_a.com_nickuc_login_NLoginCore_364_b();
    }

    public void j() {
    }

    @Override
    public void void_c() {
        this.var_int_a.void_c();
    }

    @Override
    public Object a(int n) {
        return this.var_int_a.a(n);
    }

    @Override
    public NLoginInterface_047 com_nickuc_login_NLoginInterface_047_b() {
        return this.var_int_a.com_nickuc_login_NLoginInterface_047_b();
    }

    public NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a() {
        return this.com_nickuc_login_NLoginInterface_026_a().com_nickuc_login_NLoginInterface_034_arr_a();
    }

    public String toString() {
        return this.var_int_a.q() + (String)NLoginCore_100.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + this.var_int_a.s() + (String)(this.var_int_a.com_nickuc_login_NLoginCore_227_a() == null ? NLoginCore_100.c("㺃", (int)e, (long)(f ^ g)) : (String)NLoginCore_100.c("㺆", (int)(h & i), (long)j) + this.var_int_a.com_nickuc_login_NLoginCore_227_a().G() + (String)NLoginCore_100.c("㺉", (int)k, (long)(l ^ m)));
    }

    void a(NLoginCore_116<?> NLoginInterface_0112) {
        this.var_int_a = (int)NLoginInterface_0112;
    }

    @Generated
    public NLoginCore_100() {
    }

    public void O() {
    }

    @Override
    public NLoginCore_589 b(boolean bl) {
        return this.var_int_a.b(bl);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_100.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.E("ԳՕ՗Է՛պղֈմՃցշօտՈխ֏֎ֆ֌ֆ՛", (byte)79, 69), NLoginCore_100.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.D("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡆࡨࡽ࡟ࡱࡩ࡭࡮ࡷࡳ࡯ࢄࢄࡴӻ", (byte)79, 68) + string + NLoginCore_138.D("Ӝ", (byte)79, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x59L;
        l ^= 0xDC6CC892700F52D2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(22 + 47), 83, (byte)(34 + 13), (byte)(40 + 27), (byte)(46 + 20), (byte)(49 + 18), 47, (byte)(57 + 23), (byte)(9 + 66), (byte)(51 + 16), (byte)(77 + 6), (byte)(32 + 21), (byte)(14 + 66), (byte)(48 + 49), (byte)(74 + 26), (byte)(33 + 67), (byte)(73 + 32), (byte)(36 + 74), (byte)(23 + 80)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.A("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӛӽԒӴԆӾԂԃԌԈԄԙԙԉ", (byte)92, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_100.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void a(NLoginInterface_013 NLoginInterface_0132, NLoginInterface_013 ... NLoginInterface_013Array) {
        this.var_int_a.a(NLoginInterface_0132, NLoginInterface_013Array);
    }

    @Override
    public NLoginCore_572 com_nickuc_login_NLoginCore_572_a() {
        return this.var_int_a.com_nickuc_login_NLoginCore_572_a();
    }

    public void T() {
    }

    @Override
    public NLoginCore_493 com_nickuc_login_NLoginInterface_026_a() {
        return this.var_int_a.com_nickuc_login_NLoginInterface_026_a();
    }

    @Override
    public boolean N() {
        return this.var_int_a.N();
    }

    public void void_i() {
    }

    @Override
    public <T> T c() {
        return this.var_int_a;
    }

    @Override
    public Object java_lang_Object_b() {
        return this.var_int_a.b();
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-5179720868741954712L);
        d = Long.reverse(-7349874591868649472L);
        e = 256 >>> 232 | 256 << ~232 + 1;
        f = Long.reverse(-5179720868741954712L);
        g = Long.reverse(-7349874591868649472L);
        h = Integer.reverse(0x40000000);
        i = Integer.reverse(-1);
        j = Long.reverse(2458384099278406504L);
        k = 0xC00000 >>> 118 | 0xC00000 << ~118 + 1;
        l = Long.reverse(-5179720868741954712L);
        m = Long.reverse(-7349874591868649472L);
        n = (256 >>> 102 | 256 << ~102 + 1) & 0xFFFFFFFF;
        o = 2048 >>> 169 | 2048 << -169;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_100.void_b();
    }

    private static void void_b() {
        int n;
        c = 1640066127251355677L;
        long l = c ^ 0xDC6CC892700F52D2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(8 + 61), (byte)(70 + 13), (byte)(18 + 29), (byte)(41 + 26), (byte)(65 + 1), (byte)(38 + 29), (byte)(5 + 42), (byte)(31 + 49), (byte)(73 + 2), (byte)(64 + 3), (byte)(28 + 55), (byte)(47 + 6), (byte)(41 + 39), (byte)(29 + 68), (byte)(32 + 68), (byte)(23 + 77), 105, (byte)(98 + 12), (byte)(100 + 3)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
                    NLoginCore_100.var_java_lang_String_arr_b[0] = NLoginCore_446.E("ԴԶՆՉթ՝իԨզծ԰Ժ", (byte)54, 69);
                    NLoginCore_100.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ĮőĵňħŖĤţŗķŘĳ", (byte)54, 65);
                    NLoginCore_100.var_java_lang_String_arr_b[2] = NLoginCore_091.F("ՓԪեԨեՐահՑՑԵԴ԰Ն՗՘ԲէեԶռծՅՆ", (byte)54, 70);
                    NLoginCore_100.var_java_lang_String_arr_b[3] = NLoginCore_453.F("՛ԼՍախԫղ՛ե՜ԴԺ", (byte)54, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_100.var_java_lang_String_arr_b[0] = NLoginCore_027.F("՛ԶԩԤ՞գՆազԭէԺ", (byte)54, 70);
                    NLoginCore_100.var_java_lang_String_arr_b[1] = NLoginCore_027.F("դ՜ՅՖԿՈՃգՁէՉԺ", (byte)54, 70);
                    NLoginCore_100.var_java_lang_String_arr_b[2] = NLoginCore_324.D("ҸҏӊҍӊҵӆӕҶҶҐүӚӍҳҚҽһҰҠҾӓҪҫ", (byte)54, 68);
                    NLoginCore_100.var_java_lang_String_arr_b[3] = NLoginCore_384.C("ҟҧҢӒҟҲҍҕӀҘҶҟ", (byte)54, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_100.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ŜŅĜŢĨŇœŝŀŁħľŚśňŋőŢŬũťŁľĿ", (byte)54, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_100.var_java_lang_String_arr_b[0] = NLoginCore_092.D("ҋ҇ҍқӌӋҿӑӊӆӋһӚӅҭҿӝҬҮҫӘӣҪҫ", (byte)54, 68);
                }
            }
        }
    }

    @Override
    public String q() {
        return this.var_int_a.q();
    }

    @Override
    public void a(NLoginCore_168<?> NLoginCore_1682, NLoginCore_168<?> ... NLoginCore_168Array) {
        this.var_int_a.a(NLoginCore_1682, NLoginCore_168Array);
    }
}

