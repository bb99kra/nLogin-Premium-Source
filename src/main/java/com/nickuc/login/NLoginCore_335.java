/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_335 {
    private static int t;
    private static int k;
    private static int g;
    private static int w;
    private static long var_long_u;
    private static long var_long_c;
    private static int var_int_b;
    private static int j;
    private static long e;
    private static long o;
    private static long m;
    private static int var_int_a;
    private static int q;
    private static String[] var_java_lang_String_arr_a;
    String var_java_lang_String_u;
    private static long d;
    private static long r;
    String var_java_lang_String_v;
    private static long s;
    private static long i;
    private static int var_int_v;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_c;
    private static int f;
    private static long p;
    private static int n;
    private static int l;
    final /* synthetic */ ForceRegisterConfig var_com_nickuc_login_ForceRegisterConfig_b;
    private static int h;

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0x7DA63D776B07F6D2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(45 + 24), (byte)(23 + 60), (byte)(19 + 28), (byte)(17 + 50), (byte)(45 + 21), (byte)(48 + 19), (byte)(28 + 19), (byte)(77 + 3), (byte)(57 + 18), (byte)(26 + 41), (byte)(52 + 31), (byte)(43 + 10), (byte)(9 + 71), 97, (byte)(24 + 76), (byte)(26 + 74), (byte)(39 + 66), (byte)(38 + 72), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.F("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըंࣿःअࣵࣚंࣲऊ࣫ࣷ", (byte)109, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_335.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void c(boolean bl) {
        this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.a((String)NLoginCore_335.c("㺀", (int)n, (long)(o ^ p)), (Object)bl);
    }

    @Generated
    public String m() {
        return this.var_java_lang_String_v;
    }

    public void b(boolean bl) {
        this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.a((String)NLoginCore_335.c("㺀", (int)(k & l), (long)m), (Object)bl);
    }

    public boolean D() {
        return this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.a((String)NLoginCore_335.c("㺀", (int)(g & h), (long)i), j != 0);
    }

    @Generated
    public void b(String string) {
        this.var_java_lang_String_u = string;
    }

    public void H() {
        this.var_java_lang_String_v = null;
        this.var_java_lang_String_u = null;
        this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.void_d((String)NLoginCore_335.c("㺀", (int)q, (long)(r ^ s)));
        this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.void_d((String)NLoginCore_335.c("㺃", (int)t, (long)var_long_u));
    }

    @Generated
    public String l() {
        return this.var_java_lang_String_u;
    }

    public boolean B() {
        return (this.var_java_lang_String_u != null || this.var_java_lang_String_v != null ? var_int_a : var_int_b) != 0;
    }

    private static void b() {
        int n;
        var_long_c = 5053576483151200057L;
        long l = var_long_c ^ 0x7DA63D776B07F6D2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(23 + 46), (byte)(82 + 1), 47, (byte)(31 + 36), (byte)(41 + 25), (byte)(16 + 51), (byte)(33 + 14), (byte)(79 + 1), (byte)(18 + 57), (byte)(2 + 65), 83, (byte)(4 + 49), (byte)(14 + 66), (byte)(35 + 62), (byte)(47 + 53), (byte)(42 + 58), (byte)(51 + 54), (byte)(18 + 92), (byte)(56 + 47)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_335.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ŰůńİļŅįūĴŢňŅŵőŉŧŚŚļşřōŊŋ", (byte)60, 66);
                    NLoginCore_335.var_java_lang_String_arr_b[1] = NLoginCore_091.F("Տ՞ՍՔՠՄաբխՄ՚ԲԹէԻ՝յռՙՑքՎՋՌ", (byte)60, 70);
                    NLoginCore_335.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ŰůńİļŅįūĴŢňŅŵőŉŧŚŚļşřōŊŋ", (byte)60, 66);
                    NLoginCore_335.var_java_lang_String_arr_b[3] = NLoginCore_575.C("ӀӏҾӅӑҵӒӓӞҵӋңҪӘҬӎӦӭӊӂӵҿҼҽ", (byte)60, 67);
                    NLoginCore_335.var_java_lang_String_arr_b[4] = NLoginCore_559.D("ӢӡҶҢҮҷҡӝҦӔҺҷӧӃһәӌӌҮӑӋҿҼҽ", (byte)60, 68);
                    NLoginCore_335.var_java_lang_String_arr_b[5] = NLoginCore_324.D("ӀӏҾӅӑҵӒӓӞҵӋңҪӘҬӎӦӭӊӂӵҿҼҽ", (byte)60, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_335.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ӢӡҶҢҮҷҡӝҦӔҸӂҺӥӨӨӪӁҭҽӀӥҼҽ", (byte)60, 67);
                    NLoginCore_335.var_java_lang_String_arr_b[1] = NLoginCore_173.D("ӀӏҾӅӑҵӒӓӞҵӊҥӫҭӦҮӍұӤӤӄҿҼҽ", (byte)60, 68);
                    NLoginCore_335.var_java_lang_String_arr_b[2] = NLoginCore_384.D("ӢӡҶҢҮҷҡӝҦӔҺҼӣӯӞӤӄӄӕӖӬӥҼҽ", (byte)60, 68);
                    NLoginCore_335.var_java_lang_String_arr_b[3] = NLoginCore_027.D("ӀӏҾӅӑҵӒӓӞҵӉӤҾҾӛӪӟөӃӶҴӵҼҽ", (byte)60, 68);
                    NLoginCore_335.var_java_lang_String_arr_b[4] = NLoginCore_201.F("ձհՅԱԽՆ԰լԵգՇԶժ՗՝ԷԳԾՋՄփ՞ՋՌ", (byte)60, 70);
                    NLoginCore_335.var_java_lang_String_arr_b[5] = NLoginCore_201.A("ŎŝŌœşŃŠšŬŃřĵůžŧŵĻŴřŢťōŊŋ", (byte)60, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_335.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ӍҸӅӏӠӢҹҦӇӘӁӗӚҮҭӰӤӟӧӔӐӏҼҽ", (byte)60, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_335.var_java_lang_String_arr_b[0] = NLoginCore_138.F("ՠէիՏ՞ՋՠՙթՅՅՅշպս՝ձիՔճպ՞ՋՌ", (byte)60, 70);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 196 | 0 << -196;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-7134406826210655134L);
        e = Long.reverse(0x1A00000000000000L);
        f = 0 >>> 115 | 0 << ~115 + 1;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(-1);
        i = Long.reverse(-8719673895045069726L);
        j = Integer.reverse(0);
        k = (1024 >>> 73 | 1024 << ~73 + 1) & 0xFFFFFFFF;
        l = Integer.reverse(-1);
        m = Long.reverse(-8719673895045069726L);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(-7134406826210655134L);
        p = Long.reverse(0x1A00000000000000L);
        q = (512 >>> 71 | 512 << -71) & 0xFFFFFFFF;
        r = Long.reverse(-7134406826210655134L);
        s = Long.reverse(0x1A00000000000000L);
        t = 160 >>> 69 | 160 << -69;
        var_long_u = Long.reverse(-8719673895045069726L);
        var_int_v = 3072 >>> 9 | 3072 << -9;
        w = Integer.reverse(0x60000000);
        var_java_lang_String_arr_a = new String[var_int_v];
        var_java_lang_String_arr_b = new String[w];
        NLoginCore_335.b();
    }

    @Generated
    public void c(String string) {
        this.var_java_lang_String_v = string;
    }

    public boolean C() {
        return this.var_com_nickuc_login_ForceRegisterConfig_b.var_com_nickuc_login_NLoginCore_407_a.a((String)NLoginCore_335.c("㺀", (int)var_int_c, (long)(d ^ e)), f != 0);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_335.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.B("ďıĳēķŖŎŤŐğŝœšśĤŉūŪŢŨŢķ", (byte)52, 66), NLoginCore_335.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦӀҽӁӃҳҘӀҰӈҩҵĽ", (byte)52, 65) + string + NLoginCore_384.E("Ԫ", (byte)52, 69) + methodType.toString(), exception);
        }
    }

    public NLoginCore_335(ForceRegisterConfig ForceRegisterConfig2) {
        this.var_com_nickuc_login_ForceRegisterConfig_b = ForceRegisterConfig2;
    }
}

