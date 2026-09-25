/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_411
extends NLoginCore_400 {
    private static long f;
    protected String P;
    private final String O;
    private static long aa;
    private static int var_int_d;
    private static long u;
    private static int s;
    private static int y;
    private static int m;
    private static long n;
    private static String[] var_java_lang_String_arr_d;
    private static int h;
    private static int w;
    private static String[] var_java_lang_String_arr_c;
    private static long v;
    private static int ae;
    private static long g;
    private static int var_int_c;
    private static int ah;
    private static int af;

    static {
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(-1);
        g = Long.reverse(-3634090411573172011L);
        h = Integer.reverse(Integer.MIN_VALUE);
        m = Integer.reverse(-1);
        n = Long.reverse(-3634090411573172011L);
        s = 0x2000000 >>> 152 | 0x2000000 << -152;
        u = Long.reverse(4724590496826468565L);
        v = Long.reverse(-8358680908399640576L);
        w = 384 >>> 167 | 384 << ~167 + 1;
        y = Integer.reverse(-1);
        aa = Long.reverse(-3634090411573172011L);
        ae = Integer.reverse(0);
        af = Integer.reverse(0x20000000);
        ah = Integer.reverse(0x20000000);
        var_java_lang_String_arr_c = new String[af];
        var_java_lang_String_arr_d = new String[ah];
        NLoginCore_411.void_b();
    }

    protected abstract void b(NLoginCore_219 var1);

    protected abstract void a(ResultSet var1);

    private void L() {
        if (this.P == null) {
            throw new IllegalArgumentException((String)NLoginCore_411.c("㺀", (int)(var_int_c & var_int_d), (long)g));
        }
        if (this.P.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_411.c("㺃", (int)(h & m), (long)n));
        }
        this.void_f(this.P);
        try (NLoginCore_171 NLoginCore_171 = this.var_int_d.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_411.c("㺆", (int)s, (long)(u ^ v)) + this.P + (String)NLoginCore_411.c("㺉", (int)(w & y), (long)aa), new Object[ae]);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            while (resultSet.next() && this.m.N()) {
                try {
                    this.a(resultSet);
                }
                finally {
                    ++this.l;
                }
            }
        }
    }

    public NLoginCore_411(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, boolean bl) {
        super(NLoginType_008, NLoginCore_479, bl);
        this.O = string;
    }

    private static String a(int n, long l) {
        l ^= 0x31L;
        l ^= 0x70A488C82028175CL;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(61 + 8), 83, (byte)(18 + 29), (byte)(40 + 27), (byte)(43 + 23), (byte)(58 + 9), (byte)(32 + 15), (byte)(43 + 37), (byte)(25 + 50), (byte)(59 + 8), (byte)(6 + 77), (byte)(23 + 30), (byte)(22 + 58), (byte)(56 + 41), (byte)(40 + 60), (byte)(67 + 33), (byte)(72 + 33), (byte)(97 + 13), (byte)(43 + 60)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.F("՜թըԫիէբինեԲհմխհնԸࢰ࣋ࣅࢨࣃࣇ࣓࣒ࣕ࣍ࢯ", (byte)61, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_411.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    private static void void_b() {
        int n;
        f = -6119018576185095806L;
        long l = f ^ 0x70A488C82028175CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(52 + 17), 83, (byte)(44 + 3), (byte)(4 + 63), (byte)(32 + 34), (byte)(35 + 32), (byte)(8 + 39), (byte)(55 + 25), (byte)(3 + 72), (byte)(23 + 44), (byte)(3 + 80), (byte)(8 + 45), (byte)(8 + 72), (byte)(76 + 21), (byte)(25 + 75), (byte)(47 + 53), (byte)(54 + 51), (byte)(68 + 42), (byte)(30 + 73)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_411.var_java_lang_String_arr_d[0] = NLoginCore_223.A("ńĠĀľĵĴĪńĦĿŀĸŇıŀĤńĦŎĒōĕŘĩŔĻěğĝĶĞŝĴŕĹĴĿŢĜťŞĨĺĳ", (byte)38, 65);
                    NLoginCore_411.var_java_lang_String_arr_d[1] = NLoginCore_223.C("ҠѼќҚґҐ҆Ҡ҂қҜҔңҍҜҀҠ҂ҪѮҩѴҰҦҏҐѷ҃ѼғҙҏѷҞҘӄѼҷҡҶґ҅Ҫҏ", (byte)38, 67);
                    NLoginCore_411.var_java_lang_String_arr_d[2] = NLoginCore_027.F("ԖԽԴՋԹՁԗԞՀՙ՜՗Ժ՞ԟԽ՞ՍՁՙե՞ԵԶ", (byte)38, 70);
                    NLoginCore_411.var_java_lang_String_arr_d[3] = NLoginCore_451.B("ĠĕüĜħĵĻķĕĖĦē", (byte)38, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_411.var_java_lang_String_arr_d[0] = NLoginCore_076.D("ҠѼќҚґҐ҆Ҡ҂қҜҔңҍҜҀҠ҂ҪѮҩѱҴ҅ҰҗѷѻѹҒѺҹҝҝҐҺҜҘҢҢҥ҉ӈҏ", (byte)38, 68);
                    NLoginCore_411.var_java_lang_String_arr_d[1] = NLoginCore_223.E("՛ԷԗՕՌՋՁ՛ԽՖ՗Տ՞Ո՗Ի՛ԽեԩդԯիաՊՋԲԾԷՎՔՊԻ՘պզՇԾԿժջեփՊ", (byte)38, 69);
                    NLoginCore_411.var_java_lang_String_arr_d[2] = NLoginCore_138.C("ћ҂ѹҐѾ҆ќѣ҅Ҟҡ҉ѤҦҙ҅ҞҮҳҟѳҐҖҡҩҭѴҘҮҵҸҿ", (byte)38, 67);
                    NLoginCore_411.var_java_lang_String_arr_d[3] = NLoginCore_173.E("ԧԭԬԕԺՏ԰՘Ճդ՗Ԫ", (byte)38, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_411.var_java_lang_String_arr_d[0] = NLoginCore_451.F("ԍԺԛԗ՟ԯԚԻԳԿԺԤԢԟ՘՞ՙխՕԤՀհլԼՓՉԭՆէՓՐթ", (byte)38, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_411.var_java_lang_String_arr_d[0] = NLoginCore_027.F("ԗԚՓԔԘՉԓՏդՙՂԞԽ԰ՙԹՃԼՂՠԪ՞ԵԶ", (byte)38, 70);
                }
            }
        }
    }

    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(this.O, this.java_io_File_b());
        this.a(NLoginCore_2192);
        if (this.P != null) {
            this.L();
        } else {
            this.b(NLoginCore_2192);
        }
        this.c(NLoginInterface_0422);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_411.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.D("ӓӵӷӗӻԚԒԨԔӣԡԗԥԟӨԍԯԮԦԬԦӻ", (byte)82, 68), NLoginCore_411.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("ԎԛԚӝԝԙԔԝԨԗӤԢԦԟԢԨӪࡢࡽࡷ࡚ࡵࡹࢇࢅࡿࢄࡡԁ", (byte)82, 67) + string + NLoginCore_091.A("ŝ", (byte)82, 65) + methodType.toString(), exception);
        }
    }

    protected abstract void a(NLoginCore_219 var1);
}

