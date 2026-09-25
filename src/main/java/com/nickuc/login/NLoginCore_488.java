/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_488 {
    private static String[] var_java_lang_String_arr_b;
    private static int r;
    private static long u;
    private static int var_int_b;
    private static long aa;
    private static long ad;
    private static int f;
    private static int g;
    private static long n;
    private static int ab;
    private static int y;
    private static int l;
    private static long m;
    private static int t;
    private static long q;
    private static int o;
    private static int h;
    private static long s;
    private static long p;
    private static int ae;
    private static long k;
    private static long d;
    private static int v;
    private static int af;
    private static int j;
    private static int ac;
    private static long i;
    private static long z;
    private static long c;
    private static long x;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int w;
    private static long e;

    private static String a(int n, long l) {
        l ^= 0x6FL;
        l ^= 0x19B58A756512B50AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(67 + 2), 83, (byte)(13 + 34), (byte)(65 + 2), (byte)(24 + 42), (byte)(14 + 53), (byte)(24 + 23), (byte)(26 + 54), (byte)(34 + 41), (byte)(30 + 37), (byte)(17 + 66), (byte)(44 + 9), (byte)(11 + 69), (byte)(75 + 22), (byte)(45 + 55), (byte)(88 + 12), (byte)(81 + 24), (byte)(70 + 40), (byte)(54 + 49)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘңңҭҥҖҲҥґҧғҷ", (byte)45, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_488.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static byte[] a(NLoginCore_305 NLoginCore_305, byte[] byArray) {
        NLoginCore_305.k((String)NLoginCore_488.c("㺀", (int)(v & w), (long)x), (String)NLoginCore_488.c("㺃", (int)y, (long)(z ^ aa)));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);){
                gZIPOutputStream.write(byArray);
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_488.c("㺆", (int)(ab & ac), (long)ad), iOException);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_488.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.B("ůƑƓųƗƶƮǄưſƽƳǁƻƄƩǋǊǂǈǂƗ", (byte)100, 66), NLoginCore_488.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ƪƷƶŹƹƵưƹǄƳƀƾǂƻƾǄƆԑԑԛԓԄԠԓӿԕԁԥƝ", (byte)100, 65) + string + NLoginCore_451.A("Ɓ", (byte)100, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = -3247866681111274172L;
        long l = c ^ 0x19B58A756512B50AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(6 + 63), (byte)(14 + 69), (byte)(3 + 44), (byte)(52 + 15), (byte)(24 + 42), 67, (byte)(28 + 19), (byte)(47 + 33), 75, (byte)(53 + 14), (byte)(27 + 56), (byte)(35 + 18), (byte)(41 + 39), (byte)(63 + 34), (byte)(16 + 84), (byte)(4 + 96), (byte)(98 + 7), (byte)(93 + 17), (byte)(29 + 74)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_488.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ҕѸҘҍѸѻҡ҃ѽѢҔҤѸҢҀѶҬҡҚҨҰғҨѦ҂ҒҮҋҡҖ҆ҹғҨҼҌҘһҷҌѽҥҕӃӂҚ҂҃ӀӎқҿҢҚҗҘ", (byte)37, 67);
                    NLoginCore_488.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ՌԴԥԵԞՏԙԵԻ԰Ւԩ", (byte)37, 70);
                    NLoginCore_488.var_java_lang_String_arr_b[2] = NLoginCore_173.F("Ԛԍ՜ՐԵ԰աԴ԰ՒՂԝԴԣԥՈՄԥՄՍ՞՜դԼղաԿՓ՟ԵՏզ", (byte)37, 70);
                    NLoginCore_488.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ՔՓԵ՗Ԭԭ՝ՍԿՕԛԩ", (byte)37, 69);
                    NLoginCore_488.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ĵĜŁčþŅăĝēĦĶđ", (byte)37, 66);
                    NLoginCore_488.var_java_lang_String_arr_b[5] = NLoginCore_427.E("ԥԭԶ՝ԹՓԟԗՔՖ՚ԩ", (byte)37, 69);
                    NLoginCore_488.var_java_lang_String_arr_b[6] = NLoginCore_387.E("ՔՓԵ՗Ԭԭ՝ՍԿՕԛԩ", (byte)37, 69);
                    NLoginCore_488.var_java_lang_String_arr_b[7] = NLoginCore_559.B("ķŃĖěłĹĥĪĔĶĭġĶĊőŋņĊŔĽĿĿĬďĕřŕŗŝŞıē", (byte)37, 66);
                    NLoginCore_488.var_java_lang_String_arr_b[8] = NLoginCore_027.C("ҝљѴҙѮҞѽћҁҡ҇Ѭ", (byte)37, 67);
                    NLoginCore_488.var_java_lang_String_arr_b[9] = NLoginCore_223.E("ԔՅԪՅԲԹԟԛԴԠՓԵաըԤՕ՟՚ՠԶՠԾՀլէՌՄՂԭՑՈըԷՑՌԴտն՟ՠՔլպՉ", (byte)37, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_488.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՒԵՕՊԵԸ՞ՀԺԟՑաԵ՟ԽԳթ՞՗եխՐեԣԿՏիՈ՞ՓՃնՐեչՉՕոմՉԺբՑՀեզ՚ձըՁՋռռհ֋եՈվ֑֎գՕՎո", (byte)37, 70);
                    NLoginCore_488.var_java_lang_String_arr_b[1] = NLoginCore_092.A("ÿûĵďąńłĥĵłłđ", (byte)37, 65);
                    NLoginCore_488.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ѝѐҟғѸѳҤѷѳҕ҅ѠѷѦѨҋ҇Ѩ҇ҐҡқҝѦҬ҄ѿҢҩүѺҭ", (byte)37, 67);
                    NLoginCore_488.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ĔúėĥĔĄĕĈĽńćđ", (byte)37, 66);
                    NLoginCore_488.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ѵѫѺґ҂ѯҏҒ҅ҧѢѬ", (byte)37, 67);
                    NLoginCore_488.var_java_lang_String_arr_b[5] = NLoginCore_173.C("ѬћѕѺѸћқғҞҔ҇Ѭ", (byte)37, 67);
                    NLoginCore_488.var_java_lang_String_arr_b[6] = NLoginCore_575.F("Ԣ՘Ւԓ՗ՊՖՍԟԫՙՀԲԟԲԳՈԼԫգԮ՝ԴԵ", (byte)37, 70);
                    NLoginCore_488.var_java_lang_String_arr_b[7] = NLoginCore_446.D("ҒҞѱѶҝҔҀ҅ѯґ҈ѼґѥҬҦҡѥүҘҚҊѲѪ҃ѰҷҡҪ҈ҍѹ", (byte)37, 68);
                    NLoginCore_488.var_java_lang_String_arr_b[8] = NLoginCore_451.A("üĺĄĢŇēļĆĨĪċđ", (byte)37, 65);
                    NLoginCore_488.var_java_lang_String_arr_b[9] = NLoginCore_559.D("ї҈ѭ҈ѵѼѢўѷѣҖѸҤҫѧҘҢҝңѹңҁ҃үҪҏ҇҅ѰҔҋҫѸѵҒҡҒҕҤғҭҮҢҢҷӋһӍҵҞӊ҈ӌҪҗҘ", (byte)37, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_488.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ҙѽҖҌҐҀғўџ҅ѣџҘҦѩўѵҚң҅ҠҠѷѸ", (byte)37, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_488.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ĸĸķĖķİĄĸėĕōÿňęğōōŔĔĞņŕĜĝ", (byte)37, 65);
                }
            }
        }
    }

    public static byte[] a(Object ... objectArray) {
        if (objectArray.length % var_int_a != 0) {
            throw new IllegalArgumentException((String)NLoginCore_488.c("㺀", (int)var_int_b, (long)(d ^ e)));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = f; i < objectArray.length; ++i) {
            Object object;
            if (stringBuilder.length() > 0) {
                stringBuilder.append((String)NLoginCore_488.c("㺃", (int)(g & h), (long)NLoginCore_488.i));
            }
            if ((object = objectArray[i++]) == null) {
                throw new IllegalArgumentException((String)NLoginCore_488.c("㺆", (int)j, (long)k));
            }
            Object object2 = objectArray[i];
            try {
                stringBuilder.append(URLEncoder.encode(object.toString(), (String)NLoginCore_488.c("㺉", (int)l, (long)(m ^ n)))).append((String)NLoginCore_488.c("㺌", (int)o, (long)(p ^ q))).append(URLEncoder.encode((String)(object2 == null ? NLoginCore_488.c("㺏", (int)r, (long)s) : object2.toString()), (String)NLoginCore_488.c("㺒", (int)t, (long)u)));
                continue;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new RuntimeException(unsupportedEncodingException);
            }
        }
        return stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0);
        d = Long.reverse(2501909316097980235L);
        e = Long.reverse(-720575940379279360L);
        f = 0 >>> 209 | 0 << -209;
        g = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191;
        h = (-1 >>> 143 | -1 << ~143 + 1) & 0xFFFFFFFF;
        i = Long.reverse(-3118583018860398773L);
        j = (1 >>> 223 | 1 << ~223 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-3118583018860398773L);
        l = (0x60000000 >>> 125 | 0x60000000 << ~125 + 1) & 0xFFFFFFFF;
        m = Long.reverse(2501909316097980235L);
        n = Long.reverse(-720575940379279360L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(2501909316097980235L);
        q = Long.reverse(-720575940379279360L);
        r = Integer.reverse(-1610612736);
        s = Long.reverse(-3118583018860398773L);
        t = 3 >>> 31 | 3 << ~31 + 1;
        u = Long.reverse(-3118583018860398773L);
        v = (0xE00000 >>> 245 | 0xE00000 << -245) & 0xFFFFFFFF;
        w = -1 >>> 159 | -1 << -159;
        x = Long.reverse(-3118583018860398773L);
        y = (0x1000000 >>> 181 | 0x1000000 << -181) & 0xFFFFFFFF;
        z = Long.reverse(2501909316097980235L);
        aa = Long.reverse(-720575940379279360L);
        ab = Integer.reverse(-1879048192);
        ac = (-1 >>> 139 | -1 << -139) & 0xFFFFFFFF;
        ad = Long.reverse(-3118583018860398773L);
        ae = 2560 >>> 200 | 2560 << -200;
        af = 2560 >>> 8 | 2560 << -8;
        var_java_lang_String_arr_a = new String[ae];
        var_java_lang_String_arr_b = new String[af];
        NLoginCore_488.b();
    }
}

